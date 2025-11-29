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

public class y {

    static {
        y.llIlllIlIlIllI();
    }

    private static boolean llIlllIlIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIlIlIlll(Object object) {
        return object != null;
    }

    public static int c(TileObject tileObject) {
        Animation animation;
        GameObject gameObject = (GameObject)tileObject;
        if (y.llIlllIlIlIlll(gameObject) && y.llIlllIlIllIII(gameObject.getRenderable() instanceof DynamicObject) && y.llIlllIlIlIlll(animation = ((DynamicObject)gameObject.getRenderable()).getAnimation())) {
            return animation.getId();
        }
        return lIlIlIIlllIl[0];
    }
}

