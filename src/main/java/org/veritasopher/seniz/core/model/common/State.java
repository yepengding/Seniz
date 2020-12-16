package org.veritasopher.seniz.core.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * State
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
@Data
@AllArgsConstructor
@ToString
public class State {

    private Set<StateVariable> variables;

}
