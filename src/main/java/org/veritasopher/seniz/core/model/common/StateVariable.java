package org.veritasopher.seniz.core.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.With;
import org.veritasopher.seniz.core.model.domain.Type;

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

    private Type type;

    private Evaluation evaluation;

}
