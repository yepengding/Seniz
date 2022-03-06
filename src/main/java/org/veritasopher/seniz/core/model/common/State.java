package org.veritasopher.seniz.core.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * State
 *
 * @author Yepeng Ding
 * @date 3/1/2022
 */
@Data
@AllArgsConstructor
@ToString
public class State {

    private Set<StateVariable> variables;

}
