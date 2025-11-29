package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Teleporting to corp")
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.n  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/n.class */
public class n extends m {
    private static /* synthetic */ String[] lIlIllllIIll;
    private static /* synthetic */ int[] lIlIllllIlII;

    static {
        lllIIIlIIlIIlI();
        lllIIIlIIlIIIl();
    }

    private static boolean lllIIIlIIlIlII(int i) {
        return i != 0;
    }

    private static String lllIIIlIIIllll(String lllllllllllllllIllIIIlllIlIIllll, String lllllllllllllllIllIIIlllIlIIlllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIlllIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIIlllIlIIlllI.toCharArray();
        int lllllllllllllllIllIIIlllIlIIlIll = lIlIllllIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIllllIlII[0];
        while (lllIIIlIIlIllI(i, length)) {
            char lllllllllllllllIllIIIlllIlIlIIII = charArray2[i];
            sb.append((char) (lllllllllllllllIllIIIlllIlIlIIII ^ charArray[lllllllllllllllIllIIIlllIlIIlIll % charArray.length]));
            "".length();
            lllllllllllllllIllIIIlllIlIIlIll++;
            i++;
            "".length();
            if ((-(15 ^ 10)) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        if (!lllIIIlIIlIIll(l() ? 1 : 0) && !lllIIIlIIlIlII(m() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                return tileObject.getName().toLowerCase().contains(lIlIllllIIll[lIlIllllIlII[5]]);
            });
            if (lllIIIlIIlIlIl(nearest)) {
                return lIlIllllIlII[0];
            }
            if (lllIIIlIIlIlII(Widgets.isVisible(Widgets.get(lIlIllllIlII[1], lIlIllllIlII[0])) ? 1 : 0)) {
                Keyboard.type(lIlIllllIlII[2]);
                return lIlIllllIlII[3];
            }
            String[] strArr = new String[lIlIllllIlII[3]];
            strArr[lIlIllllIlII[0]] = lIlIllllIIll[lIlIllllIlII[0]];
            if (lllIIIlIIlIIll(nearest.hasAction(strArr) ? 1 : 0)) {
                nearest.interact(lIlIllllIIll[lIlIllllIlII[3]]);
                return lIlIllllIlII[3];
            }
            nearest.interact(lIlIllllIIll[lIlIllllIlII[4]]);
            return lIlIllllIlII[3];
        }
        return lIlIllllIlII[0];
    }

    private static String lllIIIlIIlIIII(String lllllllllllllllIllIIIlllIIlllIlI, String lllllllllllllllIllIIIlllIIlllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlllIIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIlllIIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIlllIIllllII.init(lIlIllllIlII[4], secretKeySpec);
            return new String(lllllllllllllllIllIIIlllIIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlllIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIlllIIlllIll) {
            lllllllllllllllIllIIIlllIIlllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIIlIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIIlIIlIIll(int i) {
        return i == 0;
    }

    private static boolean lllIIIlIIlIlIl(Object obj) {
        return obj == null;
    }

    private static void lllIIIlIIlIIIl() {
        lIlIllllIIll = new String[lIlIllllIlII[6]];
        lIlIllllIIll[lIlIllllIlII[0]] = lllIIIlIIIllll("LzYDGAEePBAETi48EBsa", "lYqhn");
        lIlIllllIIll[lIlIllllIlII[3]] = lllIIIlIIIllll("Hw88FjckGCRTCi4EJQ==", "KjPsG");
        lIlIllllIIll[lIlIllllIlII[4]] = lllIIIlIIIllll("Kjk6IRcbMyk9WCszKSIM", "iVHQx");
        lIlIllllIIll[lIlIllllIlII[5]] = lllIIIlIIlIIII("wPO15vzJ8DO1YK8gIhGkhw==", "bHBIR");
    }

    private static void lllIIIlIIlIIlI() {
        lIlIllllIlII = new int[7];
        lIlIllllIlII[0] = (227 ^ 170) & ((7 ^ 78) ^ (-1));
        lIlIllllIlII[1] = (-13345) & 13934;
        lIlIllllIlII[2] = 245 ^ 194;
        lIlIllllIlII[3] = " ".length();
        lIlIllllIlII[4] = "  ".length();
        lIlIllllIlII[5] = "   ".length();
        lIlIllllIlII[6] = 71 ^ 67;
    }
}
