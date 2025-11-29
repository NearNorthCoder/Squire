/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Animation
 *  net.runelite.api.DynamicObject
 *  net.runelite.api.GameObject
 *  net.runelite.api.TileObject
 */
package gg.squire.sepulchre.tasks;

import net.runelite.api.Animation;
import net.runelite.api.DynamicObject;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;

public class CHelper {

    static {
        c.var2();
    }

    public static int a(TileObject tileObject) {
        Animation animation;
        GameObject gameObject = (GameObject)tileObject;
        if (c.var3(gameObject) && c.var4(gameObject.getRenderable() instanceof DynamicObject) && c.var3(animation = ((DynamicObject)gameObject.getRenderable()).getAnimation())) {
            return animation.getId();
        }
        return var1[0];
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static void var2() {
        var1 = new int[1];
        c.var1[0] = -1;
    }
}

