package org.veritasopher.seniz.core.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.With;
import org.veritasopher.seniz.core.model.domain.PrimaryType;

/**
 * System Variable
 * Passed into the system while instantiated
 *
 * @author Yepeng Ding
 * @date 12/16/2020
 */
@Data
@AllArgsConstructor
@With
@ToString
public class SystemArgument {

    private String name;

    private PrimaryType primaryType;

    private Evaluation evaluation;

}
