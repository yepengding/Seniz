package org.veritasopher.seniz.core.model;

import lombok.Getter;
import lombok.Setter;
import org.veritasopher.seniz.core.model.common.ControlStatement;
import org.veritasopher.seniz.core.model.common.StateVariable;
import org.veritasopher.seniz.core.model.common.SystemArgument;

import java.util.*;

/**
 * Control System
 *
 * @author Yepeng Ding
 * @date 3/11/2022
 */
@Getter
public class ControlSystem extends BaseSystem {

    // Control statement
    @Setter
    private ControlStatement controlStatement;

    public ControlSystem(String identifier) {
        super(identifier);
    }

}
