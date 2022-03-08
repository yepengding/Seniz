package org.veritasopher.seniz.core.model.common;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.veritasopher.seniz.core.model.domain.TermType;
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
 * @date 12/16/2020
 */
@ToString
@EqualsAndHashCode
public class Evaluation {

    // Stack of Reverse Polish notation
    private final Stack<Term> pn;

    public Evaluation() {
        this.pn = new Stack<>();
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

    public List<Term> getRPNList() {
        List<Term> result = new ArrayList<>(pn);
        Collections.reverse(result);
        return result;
    }

    public List<String> getInfixStringList() {
        return getInfixList().stream()
                .map(term -> switch (term.getType()) {
                    case OPERAND -> term.getOperand().getValue().toString();
                    case OPERATOR -> term.getOperator().getValue();
                    case PARENTHESIS -> term.getParenthesis();
                })
                .collect(Collectors.toList());
    }

    /**
     * Get Reverse Polish notation list
     *
     * @return string list showing Reverse Polish notation
     */
    public List<String> getRPNStringList() {
        return getRPNList().stream()
                .map(term -> switch (term.getType()) {
                    case OPERAND -> term.getOperand().getValue().toString();
                    case OPERATOR -> term.getOperator().getValue();
                    default -> throw new ExpressionException("", "Unexpected term type in reverse polish notation");
                })
                .collect(Collectors.toList());
    }

    /**
     * TODO Affecting Hash Code calculation, two same objects may have different hash codes.
     *
     * @return
     */
    public List<String> getPN() {
        return pn.stream()
                .map(term -> term.getType() == TermType.OPERAND ? term.getOperand().getValue().toString() : term.getOperator().getValue())
                .collect(Collectors.toList());
    }

}
