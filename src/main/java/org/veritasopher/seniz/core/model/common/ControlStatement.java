package org.veritasopher.seniz.core.model.common;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.veritasopher.seniz.core.model.domain.CompositionType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    private final List<SubSystem> subsystems;

    @Setter
    private CompositionType compositionType;

    public ControlStatement() {
        this.subsystems = new ArrayList<>();
    }

    /**
     * Add a subsystem
     *
     * @param identifier system identifier
     */
    public void addSubsystem(SubSystem identifier) {
        this.subsystems.add(identifier);
    }

    /**
     * Check if system alias exists
     *
     * @param alias system alias
     * @return true if exists
     */
    public boolean hasSystemAlias(String alias) {
        return subsystems.stream().anyMatch(sys -> sys.alias.equals(alias));
    }

    /**
     * Get subsystem alias list
     *
     * @return subsystem alias list
     */
    public List<String> getSubsystemAlias() {
        return subsystems.stream().map(sys -> sys.alias).collect(Collectors.toList());
    }

    /**
     * Get subsystem identifier list
     *
     * @return subsystem identifier list
     */
    public List<String> getSubsystemIdentifier() {
        return subsystems.stream().map(sys -> sys.identifier).collect(Collectors.toList());
    }


    public record SubSystem(String alias, String identifier) {
    }
}
