package org.veritasopher.seniz.core.visitor;

import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.base.SenizParserBaseVisitor;
import org.veritasopher.seniz.exception.ActionException;
import org.veritasopher.seniz.exception.StateException;
import org.veritasopher.seniz.exception.TransitionException;
import org.veritasopher.seniz.core.model.SystemEnv;
import org.veritasopher.seniz.core.model.domain.Action;
import org.veritasopher.seniz.core.model.domain.State;
import org.veritasopher.seniz.core.model.domain.Transition;

import java.util.Optional;

/**
 * Transition Visitor
 *
 * @author Yepeng Ding
 * @date 12/3/2020
 */
public class TransitionVisitor extends SenizParserBaseVisitor<SystemEnv> {


    private final SystemEnv systemEnv;

    private final TransitionStatementVisitor transitionStatementVisitor;

    public TransitionVisitor(SystemEnv systemEnv) {
        this.systemEnv = systemEnv;
        this.transitionStatementVisitor = new TransitionStatementVisitor(systemEnv);
    }

    @Override
    public SystemEnv visitTransitionStatement(SenizParser.TransitionStatementContext ctx) {
        Element element;
        int i = 0;
        while (i < ctx.getChildCount() - 1) {
            element = ctx.getChild(i).accept(transitionStatementVisitor);

            // Only parse states and actions
            if (element == null) {
                throw new TransitionException(ctx.start.getLine(), "Unsupported transition declaration.");
            }

            // Not the last state
            if (element.type == ElementType.STATE && i + 1 < ctx.getChildCount()) {
                Transition transition = new Transition();
                transition.setSrcState(element.state);

                // Skip transition operator
                i += 2;
                element = ctx.getChild(i).accept(transitionStatementVisitor);

                if (element == null) {
                    throw new TransitionException(ctx.start.getLine(), "Unsupported transition declaration.");
                }

                switch (element.type) {
                    case STATE: {
                        // Implicit action can be omitted
                        transition.setDstState(element.state);
                        break;
                    }
                    case ACTION: {
                        // Explicit action
                        transition.setAction(element.action);
                        // Get dst state
                        i++;
                        element = ctx.getChild(i).accept(transitionStatementVisitor);

                        if (element == null) {
                            throw new TransitionException(ctx.start.getLine(), "Unsupported transition declaration.");
                        }

                        transition.setDstState(element.state);
                        break;
                    }
                }

                // Transition duplicated
                if (systemEnv.haveTransition(transition)) {
                    throw new TransitionException(ctx.start.getLine(), "Transition is duplicated.");
                }

                systemEnv.addTransition(transition);

            }

        }

        return super.visitTransitionStatement(ctx);
    }


    private static class TransitionStatementVisitor extends SenizParserBaseVisitor<Element> {

        private final SystemEnv systemEnv;

        private final StateDeclaratorVisitor stateDeclaratorVisitor;

        TransitionStatementVisitor(SystemEnv systemEnv) {
            this.systemEnv = systemEnv;
            this.stateDeclaratorVisitor = new StateDeclaratorVisitor(systemEnv);
        }

        /**
         * State
         *
         * @param ctx
         * @return Element with state
         */
        @Override
        public Element visitStateIdentifier(SenizParser.StateIdentifierContext ctx) {

            State state;

            if (ctx.IDENTIFIER() != null) {
                // Named state
                String name = ctx.IDENTIFIER().getText();
                Optional<State> s = systemEnv.getState(name);

                // Check whether state associated with identifier exists
                if (!s.isPresent()) {
                    throw new StateException(ctx.start.getLine(), "State named (" + name + ") does not exist.");
                }
                state = s.get();

            } else if (ctx.stateBody() != null) {
                // Unnamed state
                state = ctx.stateBody().stateDeclarator().accept(stateDeclaratorVisitor);
            } else {
                throw new StateException(ctx.start.getLine(), "Unsupported state type.");
            }

            return new Element(ElementType.STATE, state);
        }

        /**
         * Action
         *
         * @param ctx
         * @return Element with action
         */
        @Override
        public Element visitActionDeclaration(SenizParser.ActionDeclarationContext ctx) {
            if (ctx.IDENTIFIER() == null) {
                throw new ActionException(ctx.start.getLine(), "Unsupported action type.");
            }

            return new Element(ElementType.ACTION, new Action(ctx.IDENTIFIER().getText()));
        }


    }

    private enum ElementType {
        STATE, ACTION
    }

    static class Element {

        private State state;

        private Action action;

        private final ElementType type;

        Element(ElementType type, State state) {
            this.state = state;
            this.type = type;
        }

        Element(ElementType type, Action action) {
            this.action = action;
            this.type = type;
        }

    }

//    private static class StateIdentifierVisitor extends SenizParserBaseVisitor<State> {
//
//        private final SystemEnv systemEnv;
//
//        private final StateDeclaratorVisitor stateDeclaratorVisitor;
//
//        StateIdentifierVisitor(SystemEnv systemEnv) {
//            this.systemEnv = systemEnv;
//            this.stateDeclaratorVisitor = new StateDeclaratorVisitor(systemEnv);
//        }
//
//        @Override
//        public State visitStateIdentifier(SenizParser.StateIdentifierContext ctx) {
//
//            State state;
//
//            if (ctx.IDENTIFIER() != null) {
//                // Named state
//                String name = ctx.IDENTIFIER().getText();
//                Optional<State> s = systemEnv.getState(name);
//
//                // Check whether state associated with identifier exists
//                if (!s.isPresent()) {
//                    throw new StateException(ctx.start.getLine(), "State named (" + name + ") does not exist.");
//                }
//                state = s.get();
//
//            } else if (ctx.stateBody() != null) {
//                // Unnamed state
//                state = ctx.stateBody().stateDeclarator().accept(stateDeclaratorVisitor);
//            } else {
//                throw new StateException(ctx.start.getLine(), "Unsupported state type.");
//            }
//            return state;
//        }
//    }

}
