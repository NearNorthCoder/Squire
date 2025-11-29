package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Collect Poison", priority = 200, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.D  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/D.class */
public class D extends Task {
    final /* synthetic */ C0000a bg;
    final /* synthetic */ SquireDukeSucellus bf;
    private static /* synthetic */ String[] lIllIllIIIIl;
    private static /* synthetic */ int[] lIllIllIIIlI;

    private static String lllIlIIIlllIII(String lllllllllllllllIlIlllIllIllllIII, String lllllllllllllllIlIlllIllIlllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIllIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIllIllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIllIllllIlI.init(lIllIllIIIlI[0], secretKeySpec);
            return new String(lllllllllllllllIlIlllIllIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIllIllllIIl) {
            lllllllllllllllIlIlllIllIllllIIl.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIlllIlI() {
        lIllIllIIIIl = new String[lIllIllIIIlI[5]];
        lIllIllIIIIl[lIllIllIIIlI[1]] = lllIlIIIllIlll("EjkbHisyIloUPD47", "QVwrN");
        lIllIllIIIIl[lIllIllIIIlI[2]] = lllIlIIIlllIII("pZWHWWKOCvkdnE7vVn0nCw==", "nBwPl");
        lIllIllIIIIl[lIllIllIIIlI[0]] = lllIlIIIlllIII("SbyWQjL0Y76OQFLrCTNfj8pdliAgFwvu", "baQqB");
        lIllIllIIIIl[lIllIllIIIlI[3]] = lllIlIIIlllIII("aQDJBga+/Qk=", "lWxyw");
        lIllIllIIIIl[lIllIllIIIlI[4]] = lllIlIIIlllIIl("ksSVIM7aJDd1aHRQIcyAbQ==", "vwXUE");
    }

    private static boolean lllIlIIIlllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIlIIlIIIIII(Object obj) {
        return obj == null;
    }

    private static boolean lllIlIIlIIIIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (lllIlIIIlllllI(this.bg.y(), lIllIllIIIlI[0]) && lllIlIIIllllll(this.bg.x(), lIllIllIIIlI[0]) && lllIlIIIllllll(this.bg.w(), lIllIllIIIlI[0]) && !lllIlIIIlllllI(this.bg.v(), lIllIllIIIlI[0])) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lllIlIIlIIIIIl(tileObject.getName().equals(lIllIllIIIIl[lIllIllIIIlI[3]]) ? 1 : 0)) {
                    String[] strArr = new String[lIllIllIIIlI[2]];
                    strArr[lIllIllIIIlI[1]] = lIllIllIIIIl[lIllIllIIIlI[4]];
                    if (lllIlIIlIIIIIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIllIllIIIlI[2];
                        "".length();
                        return ((111 ^ 60) ^ (240 ^ 167)) < 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                    }
                }
                return lIllIllIIIlI[1];
            });
            if (lllIlIIlIIIIII(nearest)) {
                return lIllIllIIIlI[1];
            }
            int y = this.bg.y();
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                String[] strArr = new String[lIllIllIIIlI[2]];
                strArr[lIllIllIIIlI[1]] = lIllIllIIIIl[lIllIllIIIlI[2]];
                if (!lllIlIIlIIIIIl(tileObject2.hasAction(strArr) ? 1 : 0) || lllIlIIlIIIIlI(tileObject2.getName().equals(lIllIllIIIIl[lIllIllIIIlI[0]]) ? 1 : 0)) {
                    return lIllIllIIIlI[1];
                }
                if (lllIlIIlIIIIlI(y)) {
                    if (lllIlIIlIIIIll(tileObject2.getWorldX(), nearest.getWorldX())) {
                        ?? r0 = lIllIllIIIlI[2];
                        "".length();
                        return ((213 ^ 181) & ((219 ^ 187) ^ (-1))) < 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                    }
                    return lIllIllIIIlI[1];
                } else if (lllIlIIIlllllI(tileObject2.getWorldX(), nearest.getWorldX())) {
                    ?? r02 = lIllIllIIIlI[2];
                    "".length();
                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                } else {
                    return lIllIllIIIlI[1];
                }
            });
            if (lllIlIIlIIIIII(nearest2)) {
                return lIllIllIIIlI[1];
            }
            nearest2.interact(lIllIllIIIIl[lIllIllIIIlI[1]]);
            return lIllIllIIIlI[2];
        }
        return lIllIllIIIlI[1];
    }

    private static void lllIlIIIllllII() {
        lIllIllIIIlI = new int[7];
        lIllIllIIIlI[0] = "  ".length();
        lIllIllIIIlI[1] = ((((98 + 49) - (-12)) + 38) ^ (((54 + 151) - 169) + 130)) & ((((20 ^ 60) & ((19 ^ 59) ^ (-1))) ^ (164 ^ 199)) ^ (-" ".length()));
        lIllIllIIIlI[2] = " ".length();
        lIllIllIIIlI[3] = "   ".length();
        lIllIllIIIlI[4] = (((47 + 95) - 2) + 40) ^ (((126 + 40) - 110) + 120);
        lIllIllIIIlI[5] = (((89 + 114) - 114) + 74) ^ (((113 + 54) - 128) + 127);
        lIllIllIIIlI[6] = 64 ^ 72;
    }

    private static boolean lllIlIIIllllll(int i, int i2) {
        return i >= i2;
    }

    private static String lllIlIIIllIlll(String lllllllllllllllIlIlllIlllIIllIlI, String lllllllllllllllIlIlllIlllIIllIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlllIIllIII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIlllIIllIIl.toCharArray();
        int lllllllllllllllIlIlllIlllIIlIllI = lIllIllIIIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIllIIIlI[1];
        while (lllIlIIIlllllI(i, length)) {
            lllllllllllllllIlIlllIlllIIllIII.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIlllIlllIIlIllI % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIlllIIlIllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIlllIIllIII);
    }

    private static String lllIlIIIlllIIl(String lllllllllllllllIlIlllIlllIIIIlIl, String lllllllllllllllIlIlllIlllIIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlllIIIIlII.getBytes(StandardCharsets.UTF_8)), lIllIllIIIlI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIllIIIlI[0], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIlllIIIIllI) {
            lllllllllllllllIlIlllIlllIIIIllI.printStackTrace();
            return null;
        }
    }

    static {
        lllIlIIIllllII();
        lllIlIIIlllIlI();
    }

    @Inject
    public D(SquireDukeSucellus squireDukeSucellus) {
        this.bf = squireDukeSucellus;
        this.bg = squireDukeSucellus.s();
    }

    private static boolean lllIlIIlIIIIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIlIIlIIIIlI(int i) {
        return i == 0;
    }
}
