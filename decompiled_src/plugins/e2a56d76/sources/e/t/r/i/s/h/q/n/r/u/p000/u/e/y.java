package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Setting Pitfall Trap")
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.y  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/y.class */
public class y extends j {
    private static /* synthetic */ int[] lllIlllIllIl;
    private static /* synthetic */ String[] lllIlllIlIll;

    private static boolean lIIIllIllllIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllIlllIllIl(int i) {
        return i == 0;
    }

    private static boolean lIIIllIlllIlllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    protected boolean x() {
        int[] iArr = new int[lllIlllIllIl[0]];
        iArr[lllIlllIllIl[1]] = lllIlllIllIl[2];
        if (lIIIllIlllIllIl(Inventory.contains(iArr) ? 1 : 0)) {
            return lllIlllIllIl[1];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIIIllIlllIllll(lllIlllIlIll[lllIlllIllIl[0]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] strArr = new String[lllIlllIllIl[0]];
                strArr[lllIlllIllIl[1]] = lllIlllIlIll[lllIlllIllIl[3]];
                if (lIIIllIlllIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lllIlllIllIl[0];
                    "".length();
                    return 0 != 0 ? ((60 ^ 5) ^ (92 ^ 46)) & (((155 ^ 184) ^ (192 ^ 168)) ^ (-" ".length())) : r0;
                }
            }
            return lllIlllIllIl[1];
        });
        if (lIIIllIlllIlllI(nearest)) {
            return lllIlllIllIl[1];
        }
        nearest.interact(lllIlllIlIll[lllIlllIllIl[1]]);
        return lllIlllIllIl[0];
    }

    @Inject
    public y(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.PITFALL);
    }

    private static void lIIIllIlllIlIII() {
        lllIlllIlIll = new String[lllIlllIllIl[4]];
        lllIlllIlIll[lllIlllIllIl[1]] = lIIIllIlllIIllI("MycsKA==", "gUMXw");
        lllIlllIlIll[lllIlllIllIl[0]] = lIIIllIlllIIllI("BSMf", "UJkJU");
        lllIlllIlIll[lllIlllIllIl[3]] = lIIIllIlllIIllI("DQQICA==", "YvixK");
    }

    private static String lIIIllIlllIIllI(String lllllllllllllllIIlIlllIIlIIlllII, String lllllllllllllllIIlIlllIIlIIllIll) {
        String lllllllllllllllIIlIlllIIlIIlllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIlIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlllIIlIIllIll.toCharArray();
        int lllllllllllllllIIlIlllIIlIIllIII = lllIlllIllIl[1];
        char[] charArray2 = lllllllllllllllIIlIlllIIlIIlllII2.toCharArray();
        int length = charArray2.length;
        int i = lllIlllIllIl[1];
        while (lIIIllIllllIIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIlllIIlIIllIII % charArray.length]));
            "".length();
            lllllllllllllllIIlIlllIIlIIllIII++;
            i++;
            "".length();
            if ((-" ".length()) > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIIllIlllIllII();
        lIIIllIlllIlIII();
    }

    private static boolean lIIIllIlllIllll(int i) {
        return i != 0;
    }

    private static void lIIIllIlllIllII() {
        lllIlllIllIl = new int[5];
        lllIlllIllIl[0] = " ".length();
        lllIlllIllIl[1] = (21 ^ 29) & ((183 ^ 191) ^ (-1));
        lllIlllIllIl[2] = (-30729) & 32239;
        lllIlllIllIl[3] = "  ".length();
        lllIlllIllIl[4] = "   ".length();
    }
}
