package org.veritasopher.seniz.core.model.common;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.veritasopher.seniz.core.model.domain.CompositionType;

import java.util.ArrayList;
import java.util.List;

/**
 * Control Statement
 *
 * @author Yepeng Ding
 * @date 3/12/2022
 */
@AllArgsConstructor
@Getter
@ToString
public class ControlStatement {

    private final List<String> systemIdentifiers;

    @Setter
    private CompositionType compositionType;

    public ControlStatement() {
        this.systemIdentifiers = new ArrayList<>();
    }

    /**
     * Add a system identifier
     *
     * @param identifier system identifier
     */
    public void addSystemIdentifier(String identifier) {
        this.systemIdentifiers.add(identifier);
    }

}
