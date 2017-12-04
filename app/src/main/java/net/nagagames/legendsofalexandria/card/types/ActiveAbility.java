package net.nagagames.legendsofalexandria.card.types;

import net.nagagames.legendsofalexandria.match.effect.Effect;

/**
 * This interface must be implemented for active abilities
 *
 * @author Raphael Million
 */

public interface ActiveAbility {

    /**
     *
     * @return the occuring action when using the ability
     */
    Effect getActiveAbility();





}
