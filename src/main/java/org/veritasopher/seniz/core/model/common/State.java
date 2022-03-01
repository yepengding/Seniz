package org.veritasopher.seniz.core.model.common;

import lombok.*;

import java.util.Set;

/**
 * State
 *
 * @author Yepeng Ding
 * @date 3/1/2022
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class State {

    private boolean isStuttering;

    private String stutteringName;

    @NonNull
    private Set<StateVariable> variables;

}
