package org.veritasopher.seniz.core.model.common;

import lombok.*;

/**
 * Action
 *
 * @author Yepeng Ding
 * @date 3/1/2022
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Action {

    private boolean isEpsilon;

    @NonNull
    private String name;
}
