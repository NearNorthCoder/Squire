/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class ap
extends Enum<ap>
implements aw {
    public static final /* synthetic */ /* enum */ ap STRAWBERRIES;
    public static final /* synthetic */ /* enum */ ap ONIONS;
    private final /* synthetic */ av produceSeed;
    public static final /* synthetic */ /* enum */ ap SWEETCORN;
    public static final /* synthetic */ /* enum */ ap SNAPE_GRASS;
    private static /* synthetic */ int[] llIIIlIIIIII;
    public static final /* synthetic */ /* enum */ ap WATERMELON;
    public static final /* synthetic */ /* enum */ ap NOTHING;
    public static final /* synthetic */ /* enum */ ap DEFAULT;
    private static final /* synthetic */ ap[] $VALUES;
    private static /* synthetic */ String[] llIIIIllllIl;

    @Override
    public av bf() {
        return this.produceSeed;
    }

    public static ap valueOf(String string) {
        return Enum.valueOf(ap.class, string);
    }

    private static String llllIIllIlllll(String lllllllllllllllIlIlIlIIllIIlllIl, String lllllllllllllllIlIlIlIIllIIlllII) {
        lllllllllllllllIlIlIlIIllIIlllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIllIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlIIllIlIIIII = new StringBuilder();
        char[] lllllllllllllllIlIlIlIIllIIlllll = lllllllllllllllIlIlIlIIllIIlllII.toCharArray();
        int lllllllllllllllIlIlIlIIllIIllllI = llIIIlIIIIII[0];
        char[] lllllllllllllllIlIlIlIIllIIllIII = lllllllllllllllIlIlIlIIllIIlllIl.toCharArray();
        int lllllllllllllllIlIlIlIIllIIlIlll = lllllllllllllllIlIlIlIIllIIllIII.length;
        int lllllllllllllllIlIlIlIIllIIlIllI = llIIIlIIIIII[0];
        while (ap.llllIIlllIlIll(lllllllllllllllIlIlIlIIllIIlIllI, lllllllllllllllIlIlIlIIllIIlIlll)) {
            char lllllllllllllllIlIlIlIIllIlIIIll = lllllllllllllllIlIlIlIIllIIllIII[lllllllllllllllIlIlIlIIllIIlIllI];
            lllllllllllllllIlIlIlIIllIlIIIII.append((char)(lllllllllllllllIlIlIlIIllIlIIIll ^ lllllllllllllllIlIlIlIIllIIlllll[lllllllllllllllIlIlIlIIllIIllllI % lllllllllllllllIlIlIlIIllIIlllll.length]));
            "".length();
            ++lllllllllllllllIlIlIlIIllIIllllI;
            ++lllllllllllllllIlIlIlIIllIIlIllI;
            "".length();
            if (-(0xA8 ^ 0xAD) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIlIIllIlIIIII);
    }

    private static String llllIIlllIIIII(String lllllllllllllllIlIlIlIIllIllIIII, String lllllllllllllllIlIlIlIIllIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIIllIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIllIlIllll.getBytes(StandardCharsets.UTF_8)), llIIIlIIIIII[8]), "DES");
            Cipher lllllllllllllllIlIlIlIIllIllIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlIIllIllIlII.init(llIIIlIIIIII[2], lllllllllllllllIlIlIlIIllIllIlIl);
            return new String(lllllllllllllllIlIlIlIIllIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlIIllIllIIll) {
            lllllllllllllllIlIlIlIIllIllIIll.printStackTrace();
            return null;
        }
    }

    private static void llllIIlllIIllI() {
        llIIIIllllIl = new String[llIIIlIIIIII[7]];
        ap.llIIIIllllIl[ap.llIIIlIIIIII[0]] = ap.llllIIllIlllll("NC0CGDg0JQ==", "zbVPq");
        ap.llIIIIllllIl[ap.llIIIlIIIIII[1]] = ap.llllIIlllIIIII("V7WnFbWXno8=", "vVDIK");
        ap.llIIIIllllIl[ap.llIIIlIIIIII[2]] = ap.llllIIlllIIIIl("YJrX0ISn1NkinNyOtGu2jA==", "eMPdH");
        ap.llIIIIllllIl[ap.llIIIlIIIIII[3]] = ap.llllIIlllIIIII("A+0DUjD2vvTlrB9uTmR42A==", "ChpMi");
        ap.llIIIIllllIl[ap.llIIIlIIIIII[4]] = ap.llllIIlllIIIII("4PwZl08I2lY=", "CjmLW");
        ap.llIIIIllllIl[ap.llIIIlIIIIII[5]] = ap.llllIIllIlllll("BQEyIDYVGSUr", "VVweb");
        ap.llIIIIllllIl[ap.llIIIlIIIIII[6]] = ap.llllIIllIlllll("AjQgNBUOPTMlAwI=", "QzadP");
    }

    public static ap[] values() {
        return (ap[])$VALUES.clone();
    }

    private static String llllIIlllIIIIl(String lllllllllllllllIlIlIlIIllIllllIl, String lllllllllllllllIlIlIlIIllIllllII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIIlllIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIllIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlIIlllIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIIlllIIIIIl.init(llIIIlIIIIII[2], lllllllllllllllIlIlIlIIlllIIIIlI);
            return new String(lllllllllllllllIlIlIlIIlllIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlIIlllIIIIII) {
            lllllllllllllllIlIlIlIIlllIIIIII.printStackTrace();
            return null;
        }
    }

    private static void llllIIlllIlIlI() {
        llIIIlIIIIII = new int[9];
        ap.llIIIlIIIIII[0] = (0x46 ^ 0x51) & ~(0x12 ^ 5);
        ap.llIIIlIIIIII[1] = " ".length();
        ap.llIIIlIIIIII[2] = "  ".length();
        ap.llIIIlIIIIII[3] = "   ".length();
        ap.llIIIlIIIIII[4] = 0xBE ^ 0xBA;
        ap.llIIIlIIIIII[5] = 0x7E ^ 0x7B;
        ap.llIIIlIIIIII[6] = 0xBA ^ 0xBC;
        ap.llIIIlIIIIII[7] = 5 ^ 0x5D ^ (0x4D ^ 0x12);
        ap.llIIIlIIIIII[8] = 0x8D ^ 0xA7 ^ (0xB4 ^ 0x96);
    }

    static {
        ap.llllIIlllIlIlI();
        ap.llllIIlllIIllI();
        NOTHING = new ap(null);
        DEFAULT = new ap(av.DEFAULT);
        WATERMELON = new ap(av.WATERMELON);
        STRAWBERRIES = new ap(av.STRAWEBERRIES);
        ONIONS = new ap(av.ONIONS);
        SWEETCORN = new ap(av.SWEETCORN);
        SNAPE_GRASS = new ap(av.SNAPE_GRASS);
        ap[] apArray = new ap[llIIIlIIIIII[7]];
        apArray[ap.llIIIlIIIIII[0]] = NOTHING;
        apArray[ap.llIIIlIIIIII[1]] = DEFAULT;
        apArray[ap.llIIIlIIIIII[2]] = WATERMELON;
        apArray[ap.llIIIlIIIIII[3]] = STRAWBERRIES;
        apArray[ap.llIIIlIIIIII[4]] = ONIONS;
        apArray[ap.llIIIlIIIIII[5]] = SWEETCORN;
        apArray[ap.llIIIlIIIIII[6]] = SNAPE_GRASS;
        $VALUES = apArray;
    }

    private static boolean llllIIlllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private ap(av av2) {
        this.produceSeed = av2;
    }
}

