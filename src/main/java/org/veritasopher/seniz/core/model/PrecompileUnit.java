package org.veritasopher.seniz.core.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Precompile Unit
 *
 * @author Yepeng Ding
 * @date 12/17/2020
 */
@Data
public class PrecompileUnit {

    private String identifier;

    private boolean isMain;

    private boolean isSystem;

    private Set<String> predIdSet;

    private Set<PrecompileUnit> predecessor;

    private Set<PrecompileUnit> successor;

    public PrecompileUnit() {
        this.predIdSet = new HashSet<>();
        this.predecessor = new HashSet<>();
        this.successor = new HashSet<>();
    }

    public void addPredecessorId(String identifier) {
        this.predIdSet.add(identifier);
    }

    public void addPredecessor(PrecompileUnit precompileUnit) {
        this.predecessor.add(precompileUnit);
    }

    public void addSuccessor(PrecompileUnit precompileUnit) {
        this.successor.add(precompileUnit);
    }

}
