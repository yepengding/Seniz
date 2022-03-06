package org.veritasopher.seniz.core.model.common;

import lombok.*;

import java.util.Set;

/**
 * State Declarator
 *
 * @author Yepeng Ding
 * @date 3/5/2022
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class StateDeclarator {

    /**
     * HashCode of StateDeclaratorContext
     */
    @NonNull
    private Integer id;

    /**
     * A set of state variables
     */
    @NonNull
    private Set<StateVariable> variables;

    /**
     * State declarator name
     */
    private String name;

    // TODO
    private boolean isStuttering;
    private String stutteringName;

}
