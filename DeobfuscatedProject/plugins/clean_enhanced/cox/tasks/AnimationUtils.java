/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Animation
 *  net.runelite.api.DynamicObject
 *  net.runelite.api.GameObject
 *  net.runelite.api.TileObject
 */
package gg.squire.cox.tasks;

import net.runelite.api.Animation;
import net.runelite.api.DynamicObject;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;

/**
 * AnimationUtils - Utility methods for working with game object animations.
 *
 * This class provides helper methods to extract animation information
 * from tile objects, particularly useful for tracking animated objects
 * during raid encounters.
 */
public class AnimationUtils {

    static {
        AnimationUtils.initializeMapper();
    }

    /**
     * Gets the animation ID from a tile object.
     *
     * This method extracts the current animation ID from a tile object
     * by accessing its renderable as a DynamicObject. Returns 0 if the
     * object has no animation or is not a dynamic object.
     *
     * @param tileObject the tile object to check
     * @return the animation ID, or -1 if no animation is found
     */
    public static int getAnimationId(TileObject tileObject) {
        GameObject gameObject = (GameObject) tileObject;
        if (gameObject != null
            && gameObject.getRenderable() instanceof DynamicObject) {
            Animation animation = ((DynamicObject) gameObject.getRenderable()).getAnimation();
            if (animation != null) {
                return animation.getId();
            }
        }
        return -1;
    }

    /**
     * Initializes the mapper (placeholder for generated code).
     */
    private static void initializeMapper() {
        // Generated initialization code
    }
}
