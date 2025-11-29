package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Setting up net trap", priority = 30, blocking = true)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.r  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/r.class */
public class r extends j {
    private static /* synthetic */ int[] lllIllllllll;
    private static /* synthetic */ String[] lllIlllllllI;

    private static String lIIIlllIIlIlIII(String lllllllllllllllIIlIllIlIlllIIIII, String lllllllllllllllIIlIllIlIllIlllll) {
        String lllllllllllllllIIlIllIlIlllIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIllIlIllIlllIl = lllllllllllllllIIlIllIlIllIlllll.toCharArray();
        int lllllllllllllllIIlIllIlIllIlllII = lllIllllllll[0];
        char[] charArray = lllllllllllllllIIlIllIlIlllIIIII2.toCharArray();
        int length = charArray.length;
        int i = lllIllllllll[0];
        while (lIIIlllIIllIIIl(i, length)) {
            char lllllllllllllllIIlIllIlIlllIIIIl = charArray[i];
            sb.append((char) (lllllllllllllllIIlIllIlIlllIIIIl ^ lllllllllllllllIIlIllIlIllIlllIl[lllllllllllllllIIlIllIlIllIlllII % lllllllllllllllIIlIllIlIllIlllIl.length]));
            "".length();
            lllllllllllllllIIlIllIlIllIlllII++;
            i++;
            "".length();
            if ((34 ^ 38) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIlllIIlIlllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlllIIllIIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlllIIlIllIl(int i) {
        return i == 0;
    }

    private static boolean lIIIlllIIllIIIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIlllIIlIlIlI();
        lIIIlllIIlIlIIl();
    }

    private static void lIIIlllIIlIlIIl() {
        lllIlllllllI = new String[lllIllllllll[5]];
        lllIlllllllI[lllIllllllll[0]] = lIIIlllIIlIlIII("BSI4fi0kJjw=", "VGLSY");
        lllIlllllllI[lllIllllllll[1]] = lIIIlllIIlIlIII("Ci4jCDgrLg==", "XKOmY");
    }

    private static boolean lIIIlllIIlIllII(int i) {
        return i != 0;
    }

    private static boolean lIIIlllIIlIllll(int i) {
        return i > 0;
    }

    private static int lIIIlllIIlIlIll(float f, float f2) {
        return (f > f2 ? 1 : (f == f2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    public boolean x() {
        if (!lIIIlllIIlIllII(y().c() ? 1 : 0) || lIIIlllIIlIllIl(Movement.shouldWalk() ? 1 : 0)) {
            return lllIllllllll[0];
        }
        int[] iArr = new int[lllIllllllll[1]];
        iArr[lllIllllllll[0]] = lllIllllllll[2];
        if (lIIIlllIIlIllII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIllllllll[1]];
            iArr2[lllIllllllll[0]] = lllIllllllll[3];
            if (!lIIIlllIIlIllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                TileObject f = y().f();
                if (!lIIIlllIIlIlllI(f) || lIIIlllIIlIllll(lIIIlllIIlIlIll(f.getWorldLocation().distanceToHypotenuse(y().k()), 12.0f))) {
                    return lllIllllllll[0];
                }
                if (lIIIlllIIlIllIl(Movement.isRunEnabled() ? 1 : 0) && lIIIlllIIllIIII(Movement.getRunEnergy(), lllIllllllll[4])) {
                    Movement.toggleRun();
                }
                if (lIIIlllIIlIlllI(Inventory.getFirst(item -> {
                    String[] strArr = new String[lllIllllllll[1]];
                    strArr[lllIllllllll[0]] = lllIlllllllI[lllIllllllll[1]];
                    return item.hasAction(strArr);
                }))) {
                    y().d();
                    "".length();
                }
                f.interact(lllIlllllllI[lllIllllllll[0]]);
                return lllIllllllll[1];
            }
        }
        return lllIllllllll[0];
    }

    private static void lIIIlllIIlIlIlI() {
        lllIllllllll = new int[6];
        lllIllllllll[0] = (192 ^ 159) & ((121 ^ 38) ^ (-1));
        lllIllllllll[1] = " ".length();
        lllIllllllll[2] = (-5649) & 5951;
        lllIllllllll[3] = (-19521) & 20474;
        lllIllllllll[4] = 119 ^ 120;
        lllIllllllll[5] = "  ".length();
    }

    @Inject
    public r(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.SALLIES);
    }
}
