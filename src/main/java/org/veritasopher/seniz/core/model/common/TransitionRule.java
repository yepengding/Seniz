package org.veritasopher.seniz.core.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Abstract transition relation over state declarators
 *
 * @author Yepeng Ding
 * @date 3/5/2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TransitionRule {

    private int srcStateDeclarator;

    private int guard;

    private int action;

    private int globalState;

    private int dstStateDeclarator;

}
