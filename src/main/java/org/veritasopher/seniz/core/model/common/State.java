package org.veritasopher.seniz.core.model.common;

import lombok.*;

import java.util.Set;

/**
 * State
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class State {

    private boolean isStutter;

    @NonNull
    private Set<StateVariable> variables;

}
