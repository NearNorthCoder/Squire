/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.coords.RectangularArea
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.coords.RectangularArea;

public final class i
extends Enum<i> {
    private static /* synthetic */ String[] llllIIIIIIII;
    private final /* synthetic */ String name;
    private final /* synthetic */ RectangularArea area;
    private static final /* synthetic */ i[] $VALUES;
    public static final /* synthetic */ /* enum */ i MOONLIGHT_ANTELOPE;
    private static /* synthetic */ int[] llllIIIIIIIl;
    public static final /* synthetic */ /* enum */ i SUNLIGHT_ANTELOPE;

    public RectangularArea w() {
        return this.area;
    }

    private static String lIIIlllIIllIlII(String lllllllllllllllIIlIllIlIlIllIIll, String lllllllllllllllIIlIllIlIlIllIlll) {
        lllllllllllllllIIlIllIlIlIllIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIlIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIlIlIllIllI = new StringBuilder();
        char[] lllllllllllllllIIlIllIlIlIllIlIl = lllllllllllllllIIlIllIlIlIllIlll.toCharArray();
        int lllllllllllllllIIlIllIlIlIllIlII = llllIIIIIIIl[0];
        char[] lllllllllllllllIIlIllIlIlIlIlllI = lllllllllllllllIIlIllIlIlIllIIll.toCharArray();
        int lllllllllllllllIIlIllIlIlIlIllIl = lllllllllllllllIIlIllIlIlIlIlllI.length;
        int lllllllllllllllIIlIllIlIlIlIllII = llllIIIIIIIl[0];
        while (i.lIIIlllIIllIlll(lllllllllllllllIIlIllIlIlIlIllII, lllllllllllllllIIlIllIlIlIlIllIl)) {
            char lllllllllllllllIIlIllIlIlIlllIIl = lllllllllllllllIIlIllIlIlIlIlllI[lllllllllllllllIIlIllIlIlIlIllII];
            lllllllllllllllIIlIllIlIlIllIllI.append((char)(lllllllllllllllIIlIllIlIlIlllIIl ^ lllllllllllllllIIlIllIlIlIllIlIl[lllllllllllllllIIlIllIlIlIllIlII % lllllllllllllllIIlIllIlIlIllIlIl.length]));
            "".length();
            ++lllllllllllllllIIlIllIlIlIllIlII;
            ++lllllllllllllllIIlIllIlIlIlIllII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIlIlIllIllI);
    }

    private static void lIIIlllIIllIlIl() {
        llllIIIIIIII = new String[llllIIIIIIIl[12]];
        i.llllIIIIIIII[i.llllIIIIIIIl[0]] = i.lIIIlllIIllIIlI("yR9d7hBYjL4tkvxn1XWBXwjG5fX/rhK9", "ECVdh");
        i.llllIIIIIIII[i.llllIIIIIIIl[1]] = i.lIIIlllIIllIIll("uYnOYtsgZC90x6uhjFWiFfqUjm+vwDEf", "HDdlW");
        i.llllIIIIIIII[i.llllIIIIIIIl[6]] = i.lIIIlllIIllIIll("BuIGmmBAWD5rMJGDGQmNoTttifT6HC4J", "bxgdl");
        i.llllIIIIIIII[i.llllIIIIIIIl[7]] = i.lIIIlllIIllIlII("GhoiHw0+EiUFQTYbORQNOAUo", "WuMqa");
    }

    private static String lIIIlllIIllIIll(String lllllllllllllllIIlIllIlIlIIlIlII, String lllllllllllllllIIlIllIlIlIIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIlIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIlIlIIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIlIlIIllIII.init(llllIIIIIIIl[6], lllllllllllllllIIlIllIlIlIIllIIl);
            return new String(lllllllllllllllIIlIllIlIlIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIlIlIIlIlll) {
            lllllllllllllllIIlIllIlIlIIlIlll.printStackTrace();
            return null;
        }
    }

    private i(String string2, RectangularArea rectangularArea) {
        this.name = string2;
        this.area = rectangularArea;
    }

    private static void lIIIlllIIllIllI() {
        llllIIIIIIIl = new int[14];
        i.llllIIIIIIIl[0] = (0xBA ^ 0xAB ^ (0xBA ^ 0xA2)) & (64 + 83 - 133 + 118 ^ 23 + 86 - 43 + 75 ^ -" ".length());
        i.llllIIIIIIIl[1] = " ".length();
        i.llllIIIIIIIl[2] = -(0xFFFF9F41 & 0x70BF) & (0xFFFF96FE & 0x7FCF);
        i.llllIIIIIIIl[3] = -"   ".length() & (0xFFFFCFBF & 0x3BFF);
        i.llllIIIIIIIl[4] = 0xFFFF9FDF & 0x66FF;
        i.llllIIIIIIIl[5] = -(0xFFFFD5F6 & 0x6E3F) & (0xFFFFFFFD & 0x4FFF);
        i.llllIIIIIIIl[6] = "  ".length();
        i.llllIIIIIIIl[7] = "   ".length();
        i.llllIIIIIIIl[8] = -(0xFFFFFECA & 0x21BF) & (0xFFFFEF9B & 0x36FF);
        i.llllIIIIIIIl[9] = 0xFFFFFCEF & 0x27D6;
        i.llllIIIIIIIl[10] = -(117 + 35 - 115 + 93) & (0xFFFFBF9F & 0x46FF);
        i.llllIIIIIIIl[11] = -(0xFFFFCBAA & 0x757F) & (0xFFFFFDF9 & 0x67FF);
        i.llllIIIIIIIl[12] = 0xBB ^ 0x93 ^ (0x93 ^ 0xBF);
        i.llllIIIIIIIl[13] = 0x5D ^ 0x55;
    }

    private static String lIIIlllIIllIIlI(String lllllllllllllllIIlIllIlIlIlIIIll, String lllllllllllllllIIlIllIlIlIlIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIlIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), llllIIIIIIIl[13]), "DES");
            Cipher lllllllllllllllIIlIllIlIlIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIlIlIlIIlIl.init(llllIIIIIIIl[6], lllllllllllllllIIlIllIlIlIlIIllI);
            return new String(lllllllllllllllIIlIllIlIlIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIlIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIlIlIlIIlII) {
            lllllllllllllllIIlIllIlIlIlIIlII.printStackTrace();
            return null;
        }
    }

    static {
        i.lIIIlllIIllIllI();
        i.lIIIlllIIllIlIl();
        SUNLIGHT_ANTELOPE = new i(llllIIIIIIII[llllIIIIIIIl[1]], new RectangularArea(llllIIIIIIIl[2], llllIIIIIIIl[3], llllIIIIIIIl[4], llllIIIIIIIl[5]));
        MOONLIGHT_ANTELOPE = new i(llllIIIIIIII[llllIIIIIIIl[7]], new RectangularArea(llllIIIIIIIl[8], llllIIIIIIIl[9], llllIIIIIIIl[10], llllIIIIIIIl[11]));
        i[] iArray = new i[llllIIIIIIIl[6]];
        iArray[i.llllIIIIIIIl[0]] = SUNLIGHT_ANTELOPE;
        iArray[i.llllIIIIIIIl[1]] = MOONLIGHT_ANTELOPE;
        $VALUES = iArray;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    public String v() {
        return this.name;
    }

    private static boolean lIIIlllIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }
}

