package net.nagagames.legendsofalexandria.entity;

import net.nagagames.legendsofalexandria.entity.sprite.AnimatedSprite;
import net.nagagames.legendsofalexandria.entity.sprite.Sprite;

/**
 * @author Raphael Million
 */

public abstract class Entity {

    private Sprite sprite;
    private boolean animated;

    private byte gravity;


    /**
     *
     * @param sprite    the graphics used by the entity
     * @param gravity   how much gravitational force acts upon the entity
     */
    Entity(Sprite sprite, byte gravity) {
        this.sprite = sprite;
        this.animated = sprite instanceof AnimatedSprite; //If sprite is an instance of AnimatedSprite, it should be animated
        this.gravity = gravity;
    }

}
