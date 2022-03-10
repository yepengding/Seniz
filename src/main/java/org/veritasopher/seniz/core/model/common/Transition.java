package org.veritasopher.seniz.core.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Transition relation over unfold states
 *
 * @author Yepeng Ding
 * @date 12/3/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Transition {

    private int srcState;

    private int guard;

    private int action;

    private int dstState;

}
