package net.nagagames.legendsofalexandria.match.action;

/**
 * Actions include effects like buffs, attribute modifiers, direct damage, creating entities, etc
 * This class should be as general as possible to include all possibilities
 *
 * @author Raphael Million
 */

public class Action {


    /**
     * In order to combine two actions into one, this action is required.
     * This is useful when dealing with a single action
     *
     * @param a1    The first action to combine
     * @param a2    The second action to combine
     * @return the combined actions of a1 and a2
     */
    static Action concatenate(Action a1, Action a2) {
        return null; //TODO concatenate should bind two action objects
    }
}
