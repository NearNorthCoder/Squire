package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.Task;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import javax.inject.Inject;
import net.runelite.api.Client;
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.N  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/N.class */
public abstract class N extends Task {
    protected final /* synthetic */ SquireVorkathConfig cw;
    @Inject
    private /* synthetic */ SquireVorkathPlugin x;
    private final /* synthetic */ Client cx;
    public static final /* synthetic */ int cu;
    private static final /* synthetic */ int cv;
    private static /* synthetic */ int[] lIlIlIllIIlll;

    private static boolean lIlllllllIlIIII(int i2, int i3) {
        return i2 == i3;
    }

    private static void lIlllllllIIllII() {
        lIlIlIllIIlll = new int[4];
        lIlIlIllIIlll[0] = (136 ^ 197) & ((209 ^ 156) ^ (-1));
        lIlIlIllIIlll[1] = (-((-2857) & 24367)) & (-577) & 32639;
        lIlIlIllIIlll[2] = (-((-11681) & 28131)) & (-4614) & 31615;
        lIlIlIllIIlll[3] = " ".length();
    }

    private static boolean lIlllllllIIllll(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIlllllllIIlllI(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIlllllllIIllII();
        cu = lIlIlIllIIlll[2];
        cv = lIlIlIllIIlll[1];
    }

    private static boolean lIlllllllIIllIl(int i2) {
        return i2 != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public N(Client client, SquireVorkathConfig squireVorkathConfig) {
        this.cx = client;
        this.cw = squireVorkathConfig;
    }

    public abstract boolean Q();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    public boolean run() {
        if (!lIlllllllIIllIl(this.cx.isInInstancedRegion() ? 1 : 0) && !lIlllllllIIllIl(this.x.c() ? 1 : 0)) {
            int[] mapRegions = this.cx.getMapRegions();
            int llllllllllllllIllIlIlIIlIIIIIIIl = lIlIlIllIIlll[0];
            int length = mapRegions.length;
            int i2 = lIlIlIllIIlll[0];
            while (lIlllllllIIlllI(i2, length)) {
                int llllllllllllllIllIlIlIIIllllllIl = mapRegions[i2];
                if (!lIlllllllIIllll(llllllllllllllIllIlIlIIIllllllIl, lIlIlIllIIlll[1]) || lIlllllllIlIIII(llllllllllllllIllIlIlIIIllllllIl, lIlIlIllIIlll[2])) {
                    llllllllllllllIllIlIlIIlIIIIIIIl = lIlIlIllIIlll[3];
                    "".length();
                    if ("   ".length() < 0) {
                        return ((14 ^ 59) ^ (120 ^ 110)) & (((142 ^ 169) ^ (81 ^ 85)) ^ (-" ".length()));
                    }
                    if (lIlllllllIIllIl(llllllllllllllIllIlIlIIlIIIIIIIl) || !lIlllllllIIllIl(Q() ? 1 : 0)) {
                        return lIlIlIllIIlll[0];
                    }
                    ?? r0 = lIlIlIllIIlll[3];
                    "".length();
                    return (((173 ^ 156) ^ (221 ^ 194)) & (((172 ^ 129) ^ "   ".length()) ^ (-" ".length()))) != 0 ? ((((162 + 164) - 176) + 30) ^ (((68 + 6) - (-3)) + 97)) & (((((136 + 149) - 163) + 43) ^ (((1 + 26) - 13) + 177)) ^ (-" ".length())) : r0;
                }
                i2++;
                "".length();
                if (0 != 0) {
                    return ((((145 + 54) - 171) + 125) ^ (((116 + 96) - 181) + 142)) & (((((5 + 20) - (-148)) + 68) ^ (((119 + 125) - 153) + 106)) ^ (-" ".length()));
                }
            }
            if (lIlllllllIIllIl(llllllllllllllIllIlIlIIlIIIIIIIl)) {
            }
            return lIlIlIllIIlll[0];
        }
        return lIlIlIllIIlll[0];
    }
}
