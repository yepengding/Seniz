package org.veritasopher.seniz.core.model.common;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.exception.type.ExpressionException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Expression Evaluation
 *
 * @author Yepeng Ding
 * @date 3/9/2022
 */
@ToString
@EqualsAndHashCode
public class Evaluation {

    // Stack of Polish notation
    private final Stack<Term> pn;

    public Evaluation() {
        this.pn = new Stack<>();
    }

    /**
     * Construct evaluation with default value of a given type
     *
     * @param type primary type
     */
    public Evaluation(PrimaryType type) {
        this.pn = new Stack<>();
        switch (type) {
            case BOOLEAN -> this.pn.push(new Term(new Value(PrimaryType.BOOLEAN, false)));
            case INTEGER -> this.pn.push(new Term(new Value(PrimaryType.INTEGER, 0)));
            case FLOAT -> this.pn.push(new Term(new Value(PrimaryType.FLOAT, 0.0)));
            case STRING -> this.pn.push(new Term(new Value(PrimaryType.STRING, "")));
            default -> throw new ExpressionException("", "No default value for type (%s).".formatted(type.toString()));
        }
    }

    /**
     * Add a new term
     *
     * @param t term
     */
    public void addTerm(Term t) {
        this.pn.push(t);
    }

    public List<Term> getInfixList() {
        List<Term> rpn = getRPNList();
        Stack<List<Term>> evaluatedStack = new Stack<>();
        rpn.forEach(t -> {
            List<Term> terms = new ArrayList<>();
            switch (t.getType()) {
                case OPERAND -> {
                    terms.add(t);
                }
                case OPERATOR -> {
                    terms.add(new Term("("));
                    switch (t.getOperator().getNumber()) {
                        case 1 -> {
                            terms.add(t);
                            terms.addAll(evaluatedStack.pop());
                        }
                        case 2 -> {
                            List<Term> poped = evaluatedStack.pop();
                            terms.addAll(poped);
                            terms.add(t);
                            poped = evaluatedStack.pop();
                            terms.addAll(poped);
                        }
                    }
                    terms.add(new Term(")"));
                }
            }
            evaluatedStack.push(terms);
        });
        return evaluatedStack.pop();
    }


    /**
     * Get Reverse Polish notation list
     *
     * @return term list showing Polish notation
     */
    public List<Term> getRPNList() {
        List<Term> result = new ArrayList<>(pn);
        Collections.reverse(result);
        return result;
    }

    /**
     * Get Polish notation list
     *
     * @return term list showing Polish notation
     */
    public List<Term> getPNList() {
        return new ArrayList<>(pn);
    }

    /**
     * Get infix string list
     *
     * @return string list showing Polish notation
     */
    public List<String> getInfixStringList() {
        return getInfixList().stream()
                .map(term -> switch (term.getType()) {
                    case OPERAND -> term.getOperand().value().toString();
                    case OPERATOR -> term.getOperator().getValue();
                    case PARENTHESIS -> term.getParenthesis();
                })
                .collect(Collectors.toList());
    }

    /**
     * Get Reverse Polish notation string list
     *
     * @return string list showing Reverse Polish notation
     */
    public List<String> getRPNStringList() {
        return getRPNList().stream()
                .map(term -> switch (term.getType()) {
                    case OPERAND -> term.getOperand().value().toString();
                    case OPERATOR -> term.getOperator().getValue();
                    default -> throw new ExpressionException("", "Unexpected term type in reverse polish notation");
                })
                .collect(Collectors.toList());
    }


}
