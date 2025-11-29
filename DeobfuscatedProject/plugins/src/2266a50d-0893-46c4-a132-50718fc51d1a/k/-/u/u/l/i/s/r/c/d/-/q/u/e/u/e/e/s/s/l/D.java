/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Collect Poison", priority=200, blocking=true)
public class D
extends Task {
    final /* synthetic */ a bg;
    final /* synthetic */ SquireDukeSucellus bf;
    private static /* synthetic */ String[] lIllIllIIIIl;
    private static /* synthetic */ int[] lIllIllIIIlI;

    private static String lllIlIIIlllIII(String lllllllllllllllIlIlllIllIlllIllI, String lllllllllllllllIlIlllIllIlllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIllIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIllIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIllIllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIllIllllIlI.init(lIllIllIIIlI[0], lllllllllllllllIlIlllIllIllllIll);
            return new String(lllllllllllllllIlIlllIllIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIllIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIllIllllIIl) {
            lllllllllllllllIlIlllIllIllllIIl.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIlllIlI() {
        lIllIllIIIIl = new String[lIllIllIIIlI[5]];
        D.lIllIllIIIIl[D.lIllIllIIIlI[1]] = D.lllIlIIIllIlll("EjkbHisyIloUPD47", "QVwrN");
        D.lIllIllIIIIl[D.lIllIllIIIlI[2]] = D.lllIlIIIlllIII("pZWHWWKOCvkdnE7vVn0nCw==", "nBwPl");
        D.lIllIllIIIIl[D.lIllIllIIIlI[0]] = D.lllIlIIIlllIII("SbyWQjL0Y76OQFLrCTNfj8pdliAgFwvu", "baQqB");
        D.lIllIllIIIIl[D.lIllIllIIIlI[3]] = D.lllIlIIIlllIII("aQDJBga+/Qk=", "lWxyw");
        D.lIllIllIIIIl[D.lIllIllIIIlI[4]] = D.lllIlIIIlllIIl("ksSVIM7aJDd1aHRQIcyAbQ==", "vwXUE");
    }

    private static boolean lllIlIIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIlIIIIII(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlIIIIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        D lllllllllllllllIlIlllIlllIllIIII;
        if (!D.lllIlIIIlllllI(this.bg.y(), lIllIllIIIlI[0]) || !D.lllIlIIIllllll(this.bg.x(), lIllIllIIIlI[0]) || !D.lllIlIIIllllll(this.bg.w(), lIllIllIIIlI[0]) || D.lllIlIIIlllllI(this.bg.v(), lIllIllIIIlI[0])) {
            return lIllIllIIIlI[1];
        }
        TileObject lllllllllllllllIlIlllIlllIlIllll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (D.lllIlIIlIIIIIl(tileObject.getName().equals(lIllIllIIIIl[lIllIllIIIlI[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIIIlI[2]];
                stringArray[D.lIllIllIIIlI[1]] = lIllIllIIIIl[lIllIllIIIlI[4]];
                if (D.lllIlIIlIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIIIlI[2];
                    "".length();
                    if ((0x6F ^ 0x3C ^ (0xF0 ^ 0xA7)) >= 0) return n2 != 0;
                    return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                }
            }
            n2 = lIllIllIIIlI[1];
            return n2 != 0;
        });
        if (D.lllIlIIlIIIIII(lllllllllllllllIlIlllIlllIlIllll)) {
            return lIllIllIIIlI[1];
        }
        int lllllllllllllllIlIlllIlllIlIlllI = lllllllllllllllIlIlllIlllIllIIII.bg.y();
        TileObject lllllllllllllllIlIlllIlllIlIllIl = TileObjects.getNearest(tileObject2 -> {
            boolean bl;
            void lllllllllllllllIlIlllIlllIlIlIII;
            void lllllllllllllllIlIlllIlllIlIIlll;
            int lllllllllllllllIlIlllIlllIlIlIIl;
            String[] stringArray = new String[lIllIllIIIlI[2]];
            stringArray[D.lIllIllIIIlI[1]] = lIllIllIIIIl[lIllIllIIIlI[2]];
            if (!D.lllIlIIlIIIIIl(tileObject2.hasAction(stringArray) ? 1 : 0) || D.lllIlIIlIIIIlI(tileObject2.getName().equals(lIllIllIIIIl[lIllIllIIIlI[0]]) ? 1 : 0)) {
                return lIllIllIIIlI[1];
            }
            if (D.lllIlIIlIIIIlI(lllllllllllllllIlIlllIlllIlIlIIl)) {
                boolean bl2;
                if (D.lllIlIIlIIIIll(lllllllllllllllIlIlllIlllIlIIlll.getWorldX(), lllllllllllllllIlIlllIlllIlIlIII.getWorldX())) {
                    bl2 = lIllIllIIIlI[2];
                    "".length();
                    if (((0xD5 ^ 0xB5) & ~(0xDB ^ 0xBB)) < 0) {
                        return (" ".length() & ~" ".length()) != 0;
                    }
                } else {
                    bl2 = lIllIllIIIlI[1];
                }
                return bl2;
            }
            if (D.lllIlIIIlllllI(lllllllllllllllIlIlllIlllIlIIlll.getWorldX(), lllllllllllllllIlIlllIlllIlIlIII.getWorldX())) {
                bl = lIllIllIIIlI[2];
                "".length();
                if ("  ".length() <= 0) {
                    return ((0x28 ^ 0x7A) & ~(0x29 ^ 0x7B)) != 0;
                }
            } else {
                bl = lIllIllIIIlI[1];
            }
            return bl;
        });
        if (D.lllIlIIlIIIIII(lllllllllllllllIlIlllIlllIlIllIl)) {
            return lIllIllIIIlI[1];
        }
        var3_3.interact(lIllIllIIIIl[lIllIllIIIlI[1]]);
        return lIllIllIIIlI[2];
    }

    private static void lllIlIIIllllII() {
        lIllIllIIIlI = new int[7];
        D.lIllIllIIIlI[0] = "  ".length();
        D.lIllIllIIIlI[1] = (98 + 49 - -12 + 38 ^ 54 + 151 - 169 + 130) & ((0x14 ^ 0x3C) & ~(0x13 ^ 0x3B) ^ (0xA4 ^ 0xC7) ^ -" ".length());
        D.lIllIllIIIlI[2] = " ".length();
        D.lIllIllIIIlI[3] = "   ".length();
        D.lIllIllIIIlI[4] = 47 + 95 - 2 + 40 ^ 126 + 40 - 110 + 120;
        D.lIllIllIIIlI[5] = 89 + 114 - 114 + 74 ^ 113 + 54 - 128 + 127;
        D.lIllIllIIIlI[6] = 0x40 ^ 0x48;
    }

    private static boolean lllIlIIIllllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllIlIIIllIlll(String lllllllllllllllIlIlllIlllIIllIlI, String lllllllllllllllIlIlllIlllIIlIlII) {
        lllllllllllllllIlIlllIlllIIllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIlllIIllIII = new StringBuilder();
        char[] lllllllllllllllIlIlllIlllIIlIlll = lllllllllllllllIlIlllIlllIIlIlII.toCharArray();
        int lllllllllllllllIlIlllIlllIIlIllI = lIllIllIIIlI[1];
        char[] lllllllllllllllIlIlllIlllIIlIIII = lllllllllllllllIlIlllIlllIIllIlI.toCharArray();
        int lllllllllllllllIlIlllIlllIIIllll = lllllllllllllllIlIlllIlllIIlIIII.length;
        int lllllllllllllllIlIlllIlllIIIlllI = lIllIllIIIlI[1];
        while (D.lllIlIIIlllllI(lllllllllllllllIlIlllIlllIIIlllI, lllllllllllllllIlIlllIlllIIIllll)) {
            char lllllllllllllllIlIlllIlllIIllIll = lllllllllllllllIlIlllIlllIIlIIII[lllllllllllllllIlIlllIlllIIIlllI];
            lllllllllllllllIlIlllIlllIIllIII.append((char)(lllllllllllllllIlIlllIlllIIllIll ^ lllllllllllllllIlIlllIlllIIlIlll[lllllllllllllllIlIlllIlllIIlIllI % lllllllllllllllIlIlllIlllIIlIlll.length]));
            "".length();
            ++lllllllllllllllIlIlllIlllIIlIllI;
            ++lllllllllllllllIlIlllIlllIIIlllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIlllIIllIII);
    }

    private static String lllIlIIIlllIIl(String lllllllllllllllIlIlllIlllIIIIIll, String lllllllllllllllIlIlllIlllIIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlllIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlllIIIIlII.getBytes(StandardCharsets.UTF_8)), lIllIllIIIlI[6]), "DES");
            Cipher lllllllllllllllIlIlllIlllIIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIlllIIIIlll.init(lIllIllIIIlI[0], lllllllllllllllIlIlllIlllIIIlIII);
            return new String(lllllllllllllllIlIlllIlllIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIlllIIIIllI) {
            lllllllllllllllIlIlllIlllIIIIllI.printStackTrace();
            return null;
        }
    }

    static {
        D.lllIlIIIllllII();
        D.lllIlIIIlllIlI();
    }

    @Inject
    public D(SquireDukeSucellus squireDukeSucellus) {
        this.bf = squireDukeSucellus;
        this.bg = squireDukeSucellus.s();
    }

    private static boolean lllIlIIlIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIIlIIIIlI(int n2) {
        return n2 == 0;
    }
}

