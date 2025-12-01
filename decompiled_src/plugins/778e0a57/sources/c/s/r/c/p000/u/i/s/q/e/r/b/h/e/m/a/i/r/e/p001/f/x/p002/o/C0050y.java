package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import net.runelite.api.Animation;
import net.runelite.api.DynamicObject;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.y  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/y.class */
public class C0050y {
    private static /* synthetic */ int[] lIlIlIIlllIl;

    private static void llIlllIlIlIllI() {
        lIlIlIIlllIl = new int[1];
        lIlIlIIlllIl[0] = -" ".length();
    }

    static {
        llIlllIlIlIllI();
    }

    private static boolean llIlllIlIllIII(int i) {
        return i != 0;
    }

    private static boolean llIlllIlIlIlll(Object obj) {
        return obj != null;
    }

    public static int c(TileObject tileObject) {
        GameObject gameObject = (GameObject) tileObject;
        if (llIlllIlIlIlll(gameObject) && llIlllIlIllIII(gameObject.getRenderable() instanceof DynamicObject ? 1 : 0)) {
            Animation animation = gameObject.getRenderable().getAnimation();
            if (llIlllIlIlIlll(animation)) {
                return animation.getId();
            }
        }
        return lIlIlIIlllIl[0];
    }
}
