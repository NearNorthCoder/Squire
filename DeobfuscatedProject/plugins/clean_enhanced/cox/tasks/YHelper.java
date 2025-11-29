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

public class YHelper {

    static {
        y.var2();
    }

    public static int c(TileObject tileObject) {
        Animation animation;
        GameObject gameObject = (GameObject)tileObject;
        if (gameObject != null && (gameObject.getRenderable( != 0) instanceof DynamicObject) && (animation = (DynamicObject != nullgameObject.getRenderable()).getAnimation())) {
            return animation.getId();
        }
        return 0;
    }
}

