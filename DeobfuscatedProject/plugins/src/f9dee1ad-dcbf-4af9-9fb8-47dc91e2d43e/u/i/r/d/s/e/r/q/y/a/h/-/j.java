/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class j
extends Enum<j> {
    private final /* synthetic */ int projectileID;
    public static final /* synthetic */ /* enum */ j RANGED;
    private final /* synthetic */ Prayer prayer;
    private final /* synthetic */ int spriteID;
    private static /* synthetic */ String[] llllIIIlIllI;
    public static final /* synthetic */ /* enum */ j MAGIC;
    private static final /* synthetic */ j[] $VALUES;
    private static /* synthetic */ int[] llllIIIllIIl;

    private static void lIIIllllIIlIlII() {
        llllIIIllIIl = new int[10];
        j.llllIIIllIIl[0] = (116 + 238 - 297 + 185 ^ 134 + 74 - 145 + 107) & (179 + 194 - 161 + 6 ^ 44 + 41 - 62 + 107 ^ -" ".length());
        j.llllIIIllIIl[1] = " ".length();
        j.llllIIIllIIl[2] = "  ".length();
        j.llllIIIllIIl[3] = -(0xFFFFDDC7 & 0x7BBA) & (0xFFFFDFFF & Short.MAX_VALUE);
        j.llllIIIllIIl[4] = (0x6A ^ 1) + (0xCC ^ 0xC3) - (0x2D ^ 0x5F) + (7 ^ 0x70);
        j.llllIIIllIIl[5] = "   ".length();
        j.llllIIIllIIl[6] = -(0xFFFFDF95 & 0x616B) & (0xFFFFEFFF & 0x577F);
        j.llllIIIllIIl[7] = 69 + 66 - 64 + 57;
        j.llllIIIllIIl[8] = 0x7D ^ 0x79;
        j.llllIIIllIIl[9] = 0x15 ^ 0x1D;
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    public int W() {
        return this.projectileID;
    }

    private static String lIIIllllIIIlIlI(String lllllllllllllllIIlIllIIIIIIlIlIl, String lllllllllllllllIIlIllIIIIIIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIIIIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIIIIIllIIl.init(llllIIIllIIl[2], lllllllllllllllIIlIllIIIIIIllIlI);
            return new String(lllllllllllllllIIlIllIIIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIIIIIllIII) {
            lllllllllllllllIIlIllIIIIIIllIII.printStackTrace();
            return null;
        }
    }

    static {
        j.lIIIllllIIlIlII();
        j.lIIIllllIIIlllI();
        MAGIC = new j(llllIIIllIIl[3], Prayer.PROTECT_FROM_MAGIC, llllIIIllIIl[4]);
        RANGED = new j(llllIIIllIIl[6], Prayer.PROTECT_FROM_MISSILES, llllIIIllIIl[7]);
        j[] jArray = new j[llllIIIllIIl[2]];
        jArray[j.llllIIIllIIl[0]] = MAGIC;
        jArray[j.llllIIIllIIl[1]] = RANGED;
        $VALUES = jArray;
    }

    private j(int n3, Prayer prayer, int n4) {
        this.projectileID = n3;
        this.prayer = prayer;
        this.spriteID = n4;
    }

    private static void lIIIllllIIIlllI() {
        llllIIIlIllI = new String[llllIIIllIIl[8]];
        j.llllIIIlIllI[j.llllIIIllIIl[0]] = j.lIIIllllIIIlIlI("WaU56uyNm8s=", "CNxlY");
        j.llllIIIlIllI[j.llllIIIllIIl[1]] = j.lIIIllllIIIlIlI("nI8qYrEsPms=", "ySURb");
        j.llllIIIlIllI[j.llllIIIllIIl[2]] = j.lIIIllllIIIlIll("k/Co34yzG1o=", "nBpkH");
        j.llllIIIlIllI[j.llllIIIllIIl[5]] = j.lIIIllllIIIllIl("OQAmLDAv", "kAhku");
    }

    private static String lIIIllllIIIllIl(String lllllllllllllllIIlIllIIIIIlIllII, String lllllllllllllllIIlIllIIIIIlIlIll) {
        lllllllllllllllIIlIllIIIIIlIllII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIIIIlIlIlI = new StringBuilder();
        char[] lllllllllllllllIIlIllIIIIIlIlIIl = lllllllllllllllIIlIllIIIIIlIlIll.toCharArray();
        int lllllllllllllllIIlIllIIIIIlIlIII = llllIIIllIIl[0];
        char[] lllllllllllllllIIlIllIIIIIlIIIlI = lllllllllllllllIIlIllIIIIIlIllII.toCharArray();
        int lllllllllllllllIIlIllIIIIIlIIIIl = lllllllllllllllIIlIllIIIIIlIIIlI.length;
        int lllllllllllllllIIlIllIIIIIlIIIII = llllIIIllIIl[0];
        while (j.lIIIllllIIlIlIl(lllllllllllllllIIlIllIIIIIlIIIII, lllllllllllllllIIlIllIIIIIlIIIIl)) {
            char lllllllllllllllIIlIllIIIIIlIllIl = lllllllllllllllIIlIllIIIIIlIIIlI[lllllllllllllllIIlIllIIIIIlIIIII];
            lllllllllllllllIIlIllIIIIIlIlIlI.append((char)(lllllllllllllllIIlIllIIIIIlIllIl ^ lllllllllllllllIIlIllIIIIIlIlIIl[lllllllllllllllIIlIllIIIIIlIlIII % lllllllllllllllIIlIllIIIIIlIlIIl.length]));
            "".length();
            ++lllllllllllllllIIlIllIIIIIlIlIII;
            ++lllllllllllllllIIlIllIIIIIlIIIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIIIIIlIlIlI);
    }

    private static boolean lIIIllllIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllllIIIlIll(String lllllllllllllllIIlIllIIIIIllllII, String lllllllllllllllIIlIllIIIIIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIIlllIll.getBytes(StandardCharsets.UTF_8)), llllIIIllIIl[9]), "DES");
            Cipher lllllllllllllllIIlIllIIIIIlllllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIIIIlllllI.init(llllIIIllIIl[2], lllllllllllllllIIlIllIIIIIllllll);
            return new String(lllllllllllllllIIlIllIIIIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIIIIllllIl) {
            lllllllllllllllIIlIllIIIIIllllIl.printStackTrace();
            return null;
        }
    }

    public int Y() {
        return this.spriteID;
    }

    public Prayer X() {
        return this.prayer;
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(llllIIIllIIl[0]) + string.substring(llllIIIllIIl[1]).replaceAll(llllIIIlIllI[llllIIIllIIl[0]], llllIIIlIllI[llllIIIllIIl[1]]).toLowerCase();
    }
}

