package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import net.runelite.api.Animation;
import net.runelite.api.DynamicObject;
import net.runelite.api.GameObject;
import net.runelite.api.TileObject;
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/c.class */
public class C0002c {
    private static /* synthetic */ int[] llIllllllIIl;

    static {
        lIIIIllllIlllll();
    }

    public static int a(TileObject tileObject) {
        GameObject gameObject = (GameObject) tileObject;
        if (lIIIIlllllIIIII(gameObject) && lIIIIlllllIIIIl(gameObject.getRenderable() instanceof DynamicObject ? 1 : 0)) {
            Animation animation = gameObject.getRenderable().getAnimation();
            if (lIIIIlllllIIIII(animation)) {
                return animation.getId();
            }
        }
        return llIllllllIIl[0];
    }

    private static boolean lIIIIlllllIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIlllllIIIIl(int i) {
        return i != 0;
    }

    private static void lIIIIllllIlllll() {
        llIllllllIIl = new int[1];
        llIllllllIIl[0] = -" ".length();
    }
}
