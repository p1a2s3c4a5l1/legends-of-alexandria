package net.nagagames.legendsofalexandria.card;

/**
 * This class serves as the abstraction of all other cards
 *
 * @author Raphael Million
 */

abstract class Card {

    protected int durability;
    protected final static int BITMASK_DURABILITY = 0xFFFF0000;     //The first two bytes of the durability give the maximum and the last two bytes give the current version


    /**
     *
     * @return current durability, how many uses the card has left
     */
    public int getDurability() {
        return durability & (~BITMASK_DURABILITY);                  //Only returns last two bytes
    }

    public int getDurabilityMax() {
        return (durability & BITMASK_DURABILITY) >>> 0x10;          //Only returns first two bytes, shifted right
    }

}
