package org.veritasopher.seniz.core.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Transition relation
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

    private Integer action;

    private int dstState;

}
