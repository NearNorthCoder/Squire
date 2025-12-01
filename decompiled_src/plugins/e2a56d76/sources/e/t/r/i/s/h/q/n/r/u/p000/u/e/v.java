package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Getting a log")
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.v  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/v.class */
public class v extends x {
    private static /* synthetic */ int[] lllIllIlIlIl;
    private static /* synthetic */ String[] lllIllIlIlII;

    private static String lIIIllIlIlIllII(String lllllllllllllllIIlIllllIIIIIIIll, String lllllllllllllllIIlIllllIIIIIIIlI) {
        String lllllllllllllllIIlIllllIIIIIIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllllIIIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllllIIIIIIIIl = new StringBuilder();
        char[] lllllllllllllllIIlIllllIIIIIIIII = lllllllllllllllIIlIllllIIIIIIIlI.toCharArray();
        int lllllllllllllllIIlIlllIlllllllll = lllIllIlIlIl[0];
        char[] charArray = lllllllllllllllIIlIllllIIIIIIIll2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIIlIlllIlllllIlll = lllIllIlIlIl[0];
        while (lIIIllIlIllIIll(lllllllllllllllIIlIlllIlllllIlll, length)) {
            char lllllllllllllllIIlIllllIIIIIIlII = charArray[lllllllllllllllIIlIlllIlllllIlll];
            lllllllllllllllIIlIllllIIIIIIIIl.append((char) (lllllllllllllllIIlIllllIIIIIIlII ^ lllllllllllllllIIlIllllIIIIIIIII[lllllllllllllllIIlIlllIlllllllll % lllllllllllllllIIlIllllIIIIIIIII.length]));
            "".length();
            lllllllllllllllIIlIlllIlllllllll++;
            lllllllllllllllIIlIlllIlllllIlll++;
            "".length();
            if (((((77 + 18) - 71) + 169) ^ (((67 + 1) - (-46)) + 83)) <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllllIIIIIIIIl);
    }

    private static boolean lIIIllIlIllIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllIlIllIIlI(int i) {
        return i != 0;
    }

    @Inject
    public v(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig);
    }

    static {
        lIIIllIlIlIlllI();
        lIIIllIlIlIllIl();
    }

    private static boolean lIIIllIlIlIllll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllIlIllIIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    protected boolean x() {
        GameObject G = G();
        if (lIIIllIlIlIllll(G)) {
            NPC E = E();
            if (lIIIllIlIllIIII(E)) {
                E = D();
                if (lIIIllIlIllIIII(E)) {
                    return lllIllIlIlIl[0];
                }
            }
            if (lIIIllIlIllIIIl(G.getWorldArea().contains(E.getWorldLocation()) ? 1 : 0)) {
                return lllIllIlIlIl[0];
            }
        }
        int[] iArr = new int[lllIllIlIlIl[1]];
        iArr[lllIllIlIlIl[0]] = lllIllIlIlIl[2];
        if (lIIIllIlIllIIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return lllIllIlIlIl[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIIIllIlIllIIlI(lllIllIlIlII[lllIllIlIlIl[1]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] strArr = new String[lllIllIlIlIl[1]];
                strArr[lllIllIlIlIl[0]] = lllIllIlIlII[lllIllIlIlIl[3]];
                if (lIIIllIlIllIIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lllIllIlIlIl[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lllIllIlIlIl[0];
        });
        if (lIIIllIlIllIIII(nearest)) {
            return lllIllIlIlIl[0];
        }
        nearest.interact(lllIllIlIlII[lllIllIlIlIl[0]]);
        return lllIllIlIlIl[1];
    }

    private static void lIIIllIlIlIllIl() {
        lllIllIlIlII = new String[lllIllIlIlIl[4]];
        lllIllIlIlII[lllIllIlIlIl[0]] = lIIIllIlIlIllII("Cyk2F2ksLi4J", "HAYgI");
        lllIllIlIlII[lllIllIlIlIl[1]] = lIIIllIlIlIllII("GDkQNA==", "LKuQZ");
        lllIllIlIlII[lllIllIlIlIl[3]] = lIIIllIlIlIllII("KCsqH0UPLDIB", "kCEoe");
    }

    private static boolean lIIIllIlIllIIIl(int i) {
        return i == 0;
    }

    private static void lIIIllIlIlIlllI() {
        lllIllIlIlIl = new int[5];
        lllIllIlIlIl[0] = ((14 ^ 97) ^ (105 ^ 89)) & (((6 ^ 124) ^ (154 ^ 191)) ^ (-" ".length()));
        lllIllIlIlIl[1] = " ".length();
        lllIllIlIlIl[2] = (-((-6677) & 23069)) & (-2065) & 19967;
        lllIllIlIlIl[3] = "  ".length();
        lllIllIlIlIl[4] = "   ".length();
    }
}
