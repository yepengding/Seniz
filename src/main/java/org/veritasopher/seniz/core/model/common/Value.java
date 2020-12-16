package org.veritasopher.seniz.core.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.veritasopher.seniz.core.model.domain.Type;

/**
 * Value
 *
 * @author Yepeng Ding
 * @date 12/16/2020
 */
@Data
@AllArgsConstructor
public class Value {

    private Type type;

    private Object value;

}
