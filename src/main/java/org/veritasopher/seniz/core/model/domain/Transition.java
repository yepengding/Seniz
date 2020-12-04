package org.veritasopher.seniz.core.model.domain;

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

    private State srcState;

    private Action action;

    private State dstState;

}
