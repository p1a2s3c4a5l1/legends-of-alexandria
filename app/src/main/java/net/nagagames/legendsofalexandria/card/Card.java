package net.nagagames.legendsofalexandria.card;

/**
 * This class serves as the abstraction of all other cards
 *
 * @author Raphael Million
 */

abstract class Card {

    protected int durability;
    protected int durabilityMax;

    protected String cardName;
    protected String cardDescription;


    /**
     * @return name/title of the specific card
     */
    public String getcardName() {
        return cardName;
    }

    /**
     * @return description of the specific card
     */
    public String getCardDescription() {
        return cardDescription;
    }

    /**
     *
     * @return current durability, how many uses the card has left
     */
    public int getDurability() {
        return durability;
    }

    /**
     *
     * @return maximal durability such card can have
     */
    public int getDurabilityMax() {
        return durabilityMax;
    }

}
