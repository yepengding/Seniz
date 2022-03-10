package org.veritasopher.seniz.core.model.common;

import lombok.*;

/**
 * Proposition
 *
 * @author Yepeng Ding
 * @date 3/10/2022
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Proposition {

    private boolean isTautology;

    private String name;

    @NonNull
    private Evaluation evaluation;

}
