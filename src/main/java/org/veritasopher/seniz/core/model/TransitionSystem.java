package org.veritasopher.seniz.core.model;

import lombok.Getter;
import lombok.Setter;
import org.veritasopher.seniz.core.model.common.*;

import java.util.*;
import java.util.stream.Collectors;

import static org.veritasopher.seniz.core.tool.Naming.getGlobalStateName;

/**
 * Transition System
 *
 * @author Yepeng Ding
 * @date 12/5/2020
 */
@Getter
public class TransitionSystem {

    // System identifier
    private final String identifier;

    // State variable set
    @Setter
    private VariableSet stateVariables;

    // System argument set
    private final SystemArgumentSet systemArguments;

    // State map <HashCode, State>
    private final Map<Integer, State> states;

    // Action map <HashCode, Action>
    private final Map<Integer, Action> actions;

    // Epsilon action
    private final Action epsilonAction;

    // Initial state
    @Setter
    private State initState;

    // Transition map <HashCode, Transition>
    private final Map<Integer, Transition> transitions;

    // StateDeclarator naming map <Name, StateDeclarator>
    private final Map<String, StateDeclarator> stateDeclarators;

    // TransitionRule map <HashCode, TransitionRule>
    private final Map<Integer, TransitionRule> transitionRules;

    // Transition rule base <Source State Declarator HashCode, Set<TransitionRule HashCode>>
    private final Map<Integer, Set<Integer>> transitionRuleBase;

    // True if is control system
    private final boolean isControl;

    // List of system identifiers in control system
    @Setter
    @Getter
    private List<String> controlSystemIds;

    public TransitionSystem(String identifier, boolean isControl) {
        this.identifier = identifier;
        this.stateVariables = new VariableSet();
        this.systemArguments = new SystemArgumentSet();
        this.states = new HashMap<>();
        this.actions = new HashMap<>();
        this.transitions = new HashMap<>();
        this.stateDeclarators = new HashMap<>();
        this.transitionRules = new HashMap<>();
        this.transitionRuleBase = new HashMap<>();
        this.isControl = isControl;

        // Add epsilon action
        this.epsilonAction = new Action(true, "");
        this.actions.put(epsilonAction.hashCode(), epsilonAction);
    }

    /**
     * Get a state variable by name
     *
     * @param name state variable name
     * @return state variable
     */
    public StateVariable getStateVariable(String name) {
        return this.stateVariables.getVariable(name);
    }

    /**
     * Look up if state variable exists.
     *
     * @param name state variable name
     * @return true if state variable exists. Otherwise false.
     */
    public boolean hasStateVariable(String name) {
        return this.stateVariables.hasVariable(name);
    }

    /**
     * Get the set of state variables
     *
     * @return set of state variables
     */
    public Set<StateVariable> getStateVariableSet() {
        return this.stateVariables.getVariableSet();
    }

    /**
     * Look up if system argument exists.
     *
     * @param systemArgument a system argument
     * @return true if system argument exists. Otherwise, false.
     */
    public boolean hasSystemArgument(SystemArgument systemArgument) {
        return this.systemArguments.hasArgument(systemArgument.getName());
    }

    /**
     * Add a state
     *
     * @param state state
     */
    public void addState(State state) {
        this.states.put(state.hashCode(), state);
    }

    /**
     * Get a state by hash code
     *
     * @param hashCode state hashCode
     * @return either state or null
     */
    public Optional<State> getState(int hashCode) {
        return Optional.ofNullable(this.states.get(hashCode));
    }

    /**
     * Look up if state exists.
     *
     * @param state state
     * @return true if state exists. Otherwise, false.
     */
    public boolean hasState(State state) {
        return this.states.containsKey(state.hashCode());
    }

    /**
     * Add an action
     *
     * @param action action
     */
    public void addAction(Action action) {
        this.actions.put(action.hashCode(), action);
    }

    /**
     * Get action by hashcode
     *
     * @param hashCode action hashCode
     * @return either Action or null
     */
    public Optional<Action> getAction(Integer hashCode) {
        return Optional.ofNullable(this.actions.get(hashCode));
    }

    /**
     * Get action set
     *
     * @return action set
     */
    public Set<Action> getActionSet() {
        return new HashSet<>(this.actions.values());
    }

    /**
     * Add a transition relation
     *
     * @param transition transition
     */
    public void addTransition(Transition transition) {
        this.transitions.put(transition.hashCode(), transition);
    }

    /**
     * Look up if transition exists.
     *
     * @param transition transition
     * @return true if transition exists. Otherwise, false.
     */
    public boolean hasTransition(Transition transition) {
        return this.transitions.containsKey(transition.hashCode());
    }

    /**
     * Get transition set by a given source state hash code
     *
     * @param stateHashCode source state hash code
     * @return a set of transitions starting from the given state
     */
    public Set<Transition> getTransitionsBySrcStateHashCode(int stateHashCode) {
        return this.transitions.values().stream()
                .filter(t -> t.getSrcState() == stateHashCode)
                .collect(Collectors.toSet());
    }

    /**
     * Add a state declarator
     *
     * @param name            state declarator name
     * @param stateDeclarator state declarator
     */
    public void addStateDeclarator(String name, StateDeclarator stateDeclarator) {
        this.stateDeclarators.put(getGlobalStateName(identifier, name), stateDeclarator);
    }

    /**
     * Get a state declarator by name
     *
     * @param name state declarator name
     * @return Either a state declarator or null
     */
    public Optional<StateDeclarator> getStateDeclarator(String name) {
        return Optional.ofNullable(this.stateDeclarators.get(getGlobalStateName(identifier, name)));
    }

    /**
     * Get a state declarator by id
     *
     * @param id state declarator id (HashCode of StateDeclaratorContext.)
     * @return Either a state declarator or null
     */
    public Optional<StateDeclarator> getStateDeclarator(int id) {
        return this.stateDeclarators.values().stream()
                .filter(d -> id == d.getId())
                .findAny();
    }

    /**
     * Get ids of state declarators describing a given state
     *
     * @param state a state
     * @return state declarator ids
     */
    public Set<Integer> getStateDeclaratorIds(State state) {
        return this.stateDeclarators.values().stream()
                .filter(d -> state.getVariables().containsAll(d.getVariables()))
                .map(StateDeclarator::getId)
                .collect(Collectors.toSet());
    }

    /**
     * Get ids of state declarators describing a given state hashCode
     *
     * @param hashCode a state hashCode
     * @return state declarator ids
     */
    public Set<Integer> getStateDeclaratorIds(int hashCode) {
        State state = this.states.get(hashCode);
        return this.stateDeclarators.values().stream()
                .filter(d -> state.getVariables().containsAll(d.getVariables()))
                .map(StateDeclarator::getId)
                .collect(Collectors.toSet());
    }

    /**
     * Look up if state declarator exists.
     *
     * @param name state declarator name
     * @return true if state name exists. Otherwise, false.
     */
    public boolean hasStateDeclarator(String name) {
        return this.stateDeclarators.containsKey(getGlobalStateName(identifier, name));
    }

    /**
     * Add a transition rule
     *
     * @param srcId          source state declarator id
     * @param transitionRule transition rule
     */
    public void addTransitionRule(int srcId, TransitionRule transitionRule) {
        // Add transition rule
        this.transitionRules.put(transitionRule.hashCode(), transitionRule);

        // Update transition rule base
        Set<Integer> transitionRules;
        if (this.transitionRuleBase.containsKey(srcId)) {
            transitionRules = this.transitionRuleBase.get(srcId);
        } else {
            transitionRules = new HashSet<>();
        }
        transitionRules.add(transitionRule.hashCode());
        this.transitionRuleBase.put(srcId, transitionRules);
    }

    /**
     * Get transition rules by state declarator id
     *
     * @param srcId source state declarator id
     * @return transition rules
     */
    public Set<TransitionRule> getTransitionRules(int srcId) {
        return Optional.ofNullable(this.transitionRuleBase.get(srcId))
                .orElseGet(Collections::emptySet)
                .stream()
                .map(this.transitionRules::get)
                .collect(Collectors.toSet());
    }

    /**
     * Look up if transition rule exists.
     *
     * @param transitionRule Transition rule
     * @return true if transition rule exists. Otherwise, false.
     */
    public boolean hasTransitionRule(TransitionRule transitionRule) {
        return this.transitionRules.containsKey(transitionRule.hashCode());
    }

}
