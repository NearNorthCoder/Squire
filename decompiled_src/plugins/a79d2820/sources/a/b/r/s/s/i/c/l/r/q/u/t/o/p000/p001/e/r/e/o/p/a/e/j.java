package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Drinking from pool")
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.j  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/j.class */
public class j extends m {
    private static /* synthetic */ int[] lIllIIIIIlIl;
    private static /* synthetic */ String[] lIllIIIIIlII;

    private static String lllIIIllIlllll(String lllllllllllllllIllIIIlIlIIlllIIl, String lllllllllllllllIllIIIlIlIIlllIII) {
        String lllllllllllllllIllIIIlIlIIlllIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIlIlIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIlIlIIllIlll = new StringBuilder();
        char[] lllllllllllllllIllIIIlIlIIllIllI = lllllllllllllllIllIIIlIlIIlllIII.toCharArray();
        int lllllllllllllllIllIIIlIlIIllIlIl = lIllIIIIIlIl[0];
        char[] charArray = lllllllllllllllIllIIIlIlIIlllIIl2.toCharArray();
        int length = charArray.length;
        int i = lIllIIIIIlIl[0];
        while (lllIIIlllIIlII(i, length)) {
            char lllllllllllllllIllIIIlIlIIlllIlI = charArray[i];
            lllllllllllllllIllIIIlIlIIllIlll.append((char) (lllllllllllllllIllIIIlIlIIlllIlI ^ lllllllllllllllIllIIIlIlIIllIllI[lllllllllllllllIllIIIlIlIIllIlIl % lllllllllllllllIllIIIlIlIIllIllI.length]));
            "".length();
            lllllllllllllllIllIIIlIlIIllIlIl++;
            i++;
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIIlIlIIllIlll);
    }

    private static boolean lllIIIlllIIIlI(int i) {
        return i == 0;
    }

    private static boolean lllIIIlllIIlII(int i, int i2) {
        return i < i2;
    }

    private static void lllIIIlllIIIII() {
        lIllIIIIIlII = new String[lIllIIIIIlIl[2]];
        lIllIIIIIlII[lIllIIIIIlIl[0]] = lllIIIllIlllll("JhwpEhEMTjccCgVOKBVFOwstBhMMACYHDAYA", "inGse");
        lIllIIIIIlII[lIllIIIIIlIl[1]] = lllIIIllIlllll("JSMfKjk=", "aQvDR");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        if (!lllIIIlllIIIlI(l() ? 1 : 0) && !lllIIIlllIIIlI(m() ? 1 : 0)) {
            String[] strArr = new String[lIllIIIIIlIl[1]];
            strArr[lIllIIIIIlIl[0]] = lIllIIIIIlII[lIllIIIIIlIl[0]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lllIIIlllIIIll(nearest)) {
                return lIllIIIIIlIl[0];
            }
            nearest.interact(lIllIIIIIlII[lIllIIIIIlIl[1]]);
            return lIllIIIIIlIl[1];
        }
        return lIllIIIIIlIl[0];
    }

    private static boolean lllIIIlllIIIll(Object obj) {
        return obj == null;
    }

    private static void lllIIIlllIIIIl() {
        lIllIIIIIlIl = new int[3];
        lIllIIIIIlIl[0] = ((117 ^ 96) ^ (208 ^ 165)) & (((((92 + 145) - 40) + 58) ^ (((2 + 30) - (-84)) + 43)) ^ (-" ".length()));
        lIllIIIIIlIl[1] = " ".length();
        lIllIIIIIlIl[2] = "  ".length();
    }

    static {
        lllIIIlllIIIIl();
        lllIIIlllIIIII();
    }
}
