package org.veritasopher.seniz.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.With;

/**
 * State Variable
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
@Data
@AllArgsConstructor
@With
@ToString
public class StateVariable {
    private String name;

    private int type;

    private Object value;

}
