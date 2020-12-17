package org.veritasopher.seniz.core.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Unit Dependency Information
 *
 * @author Yepeng Ding
 * @date 12/17/2020
 */
@Data
public class UnitDependency {

    private String identifier;

    private boolean isMain;

    private boolean isSystem;

    private Set<String> predecessorId;

    private Set<UnitDependency> predecessor;

    private Set<UnitDependency> successor;

    public UnitDependency() {
        this.predecessorId = new HashSet<>();
        this.predecessor = new HashSet<>();
        this.successor = new HashSet<>();
    }

    public void addPredecessorId(String identifier) {
        this.predecessorId.add(identifier);
    }

    public void addPredecessor(UnitDependency unitDependency) {
        this.predecessor.add(unitDependency);
    }

    public void addSuccessor(UnitDependency unitDependency) {
        this.successor.add(unitDependency);
    }

}
