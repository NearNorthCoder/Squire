package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.Task;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import javax.inject.Inject;
import net.runelite.api.Client;
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.Q  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/Q.class */
public abstract class Q extends Task {
    private static final /* synthetic */ int cH;
    private final /* synthetic */ Client cJ;
    @Inject
    private /* synthetic */ SquireVorkathPlugin x;
    private static /* synthetic */ int[] lIlIlIlIIlIlI;
    protected final /* synthetic */ SquireVorkathConfig cI;

    public abstract boolean Q();

    private static boolean lIlllllIlIlIIIl(int i2) {
        return i2 != 0;
    }

    private static void lIlllllIlIIllll() {
        lIlIlIlIIlIlI = new int[3];
        lIlIlIlIIlIlI[0] = ((212 ^ 189) ^ (226 ^ 188)) & (((((130 + 125) - 182) + 72) ^ (((35 + 52) - (-12)) + 67)) ^ (-" ".length())) & ((((((34 + 125) - 47) + 22) ^ (((72 + 146) - 202) + 132)) & (((107 ^ 78) ^ (103 ^ 80)) ^ (-" ".length()))) ^ (-" ".length()));
        lIlIlIlIIlIlI[1] = (-2177) & 11199;
        lIlIlIlIIlIlI[2] = " ".length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Q(Client client, SquireVorkathConfig squireVorkathConfig) {
        this.cJ = client;
        this.cI = squireVorkathConfig;
    }

    private static boolean lIlllllIlIlIIlI(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    public boolean run() {
        if (!lIlllllIlIlIIIl(this.cJ.isInInstancedRegion() ? 1 : 0) && !lIlllllIlIlIIIl(this.x.c() ? 1 : 0)) {
            int[] mapRegions = this.cJ.getMapRegions();
            int i2 = lIlIlIlIIlIlI[0];
            int length = mapRegions.length;
            int i3 = lIlIlIlIIlIlI[0];
            do {
                if (lIlllllIlIlIIlI(i3, length)) {
                    if (lIlllllIlIlIIll(mapRegions[i3], lIlIlIlIIlIlI[1])) {
                        i2 = lIlIlIlIIlIlI[2];
                        "".length();
                        if ((-" ".length()) >= ((181 ^ 176) & ((197 ^ 192) ^ (-1)))) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        i3++;
                        "".length();
                    }
                }
                if (lIlllllIlIlIIIl(i2) && lIlllllIlIlIIIl(Q() ? 1 : 0)) {
                    ?? r0 = lIlIlIlIIlIlI[2];
                    "".length();
                    return "   ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIlIlIIlIlI[0];
            } while ((((248 ^ 175) ^ (85 ^ 8)) & (((62 ^ 85) ^ (165 ^ 196)) ^ (-" ".length()))) >= 0);
            return ((((142 + 153) - 200) + 116) ^ (((131 + 3) - 100) + 104)) & (((135 ^ 128) ^ (126 ^ 32)) ^ (-" ".length()));
        }
        return lIlIlIlIIlIlI[0];
    }

    private static boolean lIlllllIlIlIIll(int i2, int i3) {
        return i2 == i3;
    }

    static {
        lIlllllIlIIllll();
        cH = lIlIlIlIIlIlI[1];
    }
}
