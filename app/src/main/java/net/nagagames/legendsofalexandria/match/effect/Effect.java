package net.nagagames.legendsofalexandria.match.effect;

/**
 * Effects include effects like buffs, attribute modifiers, direct damage, creating entities, etc
 * This class should be as general as possible to include all possibilities
 *
 * @author Raphael Million
 */

public class Effect {


    /**
     * In order to combine two actions into one, this action is required.
     * This is useful when dealing with a single action
     *
     * @param a1    The first action to combine
     * @param a2    The second action to combine
     * @return the combined actions of a1 and a2
     */
    static Effect concatenate(Effect a1, Effect a2) {
        return null; //TODO concatenate should bind two action objects, maybe just use lists?
    }
}
