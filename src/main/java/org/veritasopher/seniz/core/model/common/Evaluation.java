package org.veritasopher.seniz.core.model.common;

import lombok.EqualsAndHashCode;
import lombok.ToString;

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
    private final Stack<Term> rpn;

    public Evaluation() {
        this.rpn = new Stack<>();
    }

    /**
     * Add a new term
     *
     * @param t
     */
    public void addTerm(Term t) {
        this.rpn.push(t);
    }

    /**
     * Get Reverse Polish notation list
     *
     * @return string list showing Reverse Polish notation
     */
    public List<String> getRPN() {
        List<String> result = rpn.stream()
                .map(term -> term.isOperand() ? term.getOperand().getValue().toString() : term.getOperator().getValue())
                .collect(Collectors.toList());
        Collections.reverse(result);
        return result;
    }

}
