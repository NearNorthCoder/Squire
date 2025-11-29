package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import net.runelite.api.HeadIcon;
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.a  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/a.class */
public /* synthetic */ class a {
    private static /* synthetic */ int[] llIIlIIlIlll;
    public static final /* synthetic */ int[] k;

    private static void lllllIIlllIlII() {
        llIIlIIlIlll = new int[3];
        llIIlIIlIlll[0] = " ".length();
        llIIlIIlIlll[1] = "  ".length();
        llIIlIIlIlll[2] = "   ".length();
    }

    static {
        lllllIIlllIlII();
        k = new int[HeadIcon.values().length];
        try {
            k[HeadIcon.MELEE.ordinal()] = llIIlIIlIlll[0];
            "".length();
            if (0 != 0) {
                return;
            }
        } catch (NoSuchFieldError e) {
        }
        try {
            k[HeadIcon.RANGED.ordinal()] = llIIlIIlIlll[1];
            "".length();
            if ((114 ^ 118) < 0) {
                return;
            }
        } catch (NoSuchFieldError e2) {
        }
        try {
            k[HeadIcon.MAGIC.ordinal()] = llIIlIIlIlll[2];
            "".length();
            if ("  ".length() == (72 ^ 76)) {
            }
        } catch (NoSuchFieldError e3) {
        }
    }
}
