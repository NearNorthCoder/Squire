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

public class c {

    static {
        c.lIIIIllllIlllll();
    }

    public static int a(TileObject tileObject) {
        Animation animation;
        GameObject gameObject = (GameObject)tileObject;
        if (c.lIIIIlllllIIIII(gameObject) && c.lIIIIlllllIIIIl(gameObject.getRenderable() instanceof DynamicObject) && c.lIIIIlllllIIIII(animation = ((DynamicObject)gameObject.getRenderable()).getAnimation())) {
            return animation.getId();
        }
        return llIllllllIIl[0];
    }

    private static boolean lIIIIlllllIIIII(Object object) {
        return object != null;
    }

    private static boolean lIIIIlllllIIIIl(int n2) {
        return n2 != 0;
    }

}

