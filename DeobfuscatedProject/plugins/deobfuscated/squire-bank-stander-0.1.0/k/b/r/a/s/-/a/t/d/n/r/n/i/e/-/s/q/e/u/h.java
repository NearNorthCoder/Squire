/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class h
extends Enum<h> {
    public static final /* synthetic */ /* enum */ h YEW_LONGBOW;
    public static final /* synthetic */ /* enum */ h YEW_SHORTBOW;
    public static final /* synthetic */ /* enum */ h WILLOW_LONGBOW;
    public static final /* synthetic */ /* enum */ h MAPLE_SHORTBOW;
    public static final /* synthetic */ /* enum */ h MAPLE_LONGBOW;
    private static /* synthetic */ String[] lllIIIlIIlI;
    public static final /* synthetic */ /* enum */ h MAGIC_SHORTBOW;
    public static final /* synthetic */ /* enum */ h OAK_SHORTBOW;
    public static final /* synthetic */ /* enum */ h OAK_LONGBOW;
    public static final /* synthetic */ /* enum */ h SHORTBOW;
    public static final /* synthetic */ /* enum */ h LONGBOW;
    private static final /* synthetic */ h[] $VALUES;
    public static final /* synthetic */ /* enum */ h WILLOW_SHORTBOW;
    private static /* synthetic */ int[] lllIIIlIIll;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ /* enum */ h MAGIC_LONGBOW;

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private h(int n3) {
        this.materialID = n3;
    }

    private static String lIlIllIIlllIII(String llllllllllllllllIIlIlIIlllIlIIII, String llllllllllllllllIIlIlIIlllIIllll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIlllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIlllIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIlllIlIlII.init(lllIIIlIIll[4], llllllllllllllllIIlIlIIlllIlIlIl);
            return new String(llllllllllllllllIIlIlIIlllIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIlllIlIIll) {
            llllllllllllllllIIlIlIIlllIlIIll.printStackTrace();
            return null;
        }
    }

    static {
        h.lIlIllIIlllIll();
        h.lIlIllIIlllIlI();
        SHORTBOW = new h(lllIIIlIIll[1]);
        LONGBOW = new h(lllIIIlIIll[3]);
        OAK_SHORTBOW = new h(lllIIIlIIll[5]);
        OAK_LONGBOW = new h(lllIIIlIIll[7]);
        WILLOW_SHORTBOW = new h(lllIIIlIIll[9]);
        WILLOW_LONGBOW = new h(lllIIIlIIll[11]);
        MAPLE_SHORTBOW = new h(lllIIIlIIll[13]);
        MAPLE_LONGBOW = new h(lllIIIlIIll[15]);
        YEW_SHORTBOW = new h(lllIIIlIIll[17]);
        YEW_LONGBOW = new h(lllIIIlIIll[19]);
        MAGIC_SHORTBOW = new h(lllIIIlIIll[21]);
        MAGIC_LONGBOW = new h(lllIIIlIIll[23]);
        h[] hArray = new h[lllIIIlIIll[24]];
        hArray[h.lllIIIlIIll[0]] = SHORTBOW;
        hArray[h.lllIIIlIIll[2]] = LONGBOW;
        hArray[h.lllIIIlIIll[4]] = OAK_SHORTBOW;
        hArray[h.lllIIIlIIll[6]] = OAK_LONGBOW;
        hArray[h.lllIIIlIIll[8]] = WILLOW_SHORTBOW;
        hArray[h.lllIIIlIIll[10]] = WILLOW_LONGBOW;
        hArray[h.lllIIIlIIll[12]] = MAPLE_SHORTBOW;
        hArray[h.lllIIIlIIll[14]] = MAPLE_LONGBOW;
        hArray[h.lllIIIlIIll[16]] = YEW_SHORTBOW;
        hArray[h.lllIIIlIIll[18]] = YEW_LONGBOW;
        hArray[h.lllIIIlIIll[20]] = MAGIC_SHORTBOW;
        hArray[h.lllIIIlIIll[22]] = MAGIC_LONGBOW;
        $VALUES = hArray;
    }

    private static void lIlIllIIlllIlI() {
        lllIIIlIIlI = new String[lllIIIlIIll[24]];
        h.lllIIIlIIlI[h.lllIIIlIIll[0]] = h."SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[2]] = h."LONGBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[4]] = h."OAK_SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[6]] = h."OAK_LONGBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[8]] = h."WILLOW_SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[10]] = h."WILLOW_LONGBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[12]] = h."MAPLE_SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[14]] = h."MAPLE_LONGBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[16]] = h."YEW_SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[18]] = h."YEW_LONGBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[20]] = h."MAGIC_SHORTBOW";
        h.lllIIIlIIlI[h.lllIIIlIIll[22]] = h."MAGIC_LONGBOW";
    }

    private static boolean lIlIllIIllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllIIlllIIl(String llllllllllllllllIIlIlIIllllIllll, String llllllllllllllllIIlIlIIlllllIIll) {
        llllllllllllllllIIlIlIIllllIllll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIlllllIIlI = new StringBuilder();
        char[] llllllllllllllllIIlIlIIlllllIIIl = llllllllllllllllIIlIlIIlllllIIll.toCharArray();
        int llllllllllllllllIIlIlIIlllllIIII = lllIIIlIIll[0];
        char[] llllllllllllllllIIlIlIIllllIlIlI = llllllllllllllllIIlIlIIllllIllll.toCharArray();
        int llllllllllllllllIIlIlIIllllIlIIl = llllllllllllllllIIlIlIIllllIlIlI.length;
        int llllllllllllllllIIlIlIIllllIlIII = lllIIIlIIll[0];
        while (h.lIlIllIIllllII(llllllllllllllllIIlIlIIllllIlIII, llllllllllllllllIIlIlIIllllIlIIl)) {
            char llllllllllllllllIIlIlIIlllllIlIl = llllllllllllllllIIlIlIIllllIlIlI[llllllllllllllllIIlIlIIllllIlIII];
            llllllllllllllllIIlIlIIlllllIIlI.append((char)(llllllllllllllllIIlIlIIlllllIlIl ^ llllllllllllllllIIlIlIIlllllIIIl[llllllllllllllllIIlIlIIlllllIIII % llllllllllllllllIIlIlIIlllllIIIl.length]));
            0;
            ++llllllllllllllllIIlIlIIlllllIIII;
            ++llllllllllllllllIIlIlIIllllIlIII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIIlllllIIlI);
    }

    public int z() {
        return this.materialID;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static String lIlIllIIllIlll(String llllllllllllllllIIlIlIIlllIlllIl, String llllllllllllllllIIlIlIIlllIlllII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIllllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlllIlllII.getBytes(StandardCharsets.UTF_8)), lllIIIlIIll[16]), "DES");
            Cipher llllllllllllllllIIlIlIIllllIIIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIllllIIIIl.init(lllIIIlIIll[4], llllllllllllllllIIlIlIIllllIIIlI);
            return new String(llllllllllllllllIIlIlIIllllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIllllIIIII) {
            llllllllllllllllIIlIlIIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIIlllIll() {
        lllIIIlIIll = new int[25];
        h.lllIIIlIIll[0] = (153 + 181 - 225 + 96 ^ 26 + 40 - 51 + 130) & (30 + 157 - 1 + 10 ^ 129 + 26 - 99 + 96 ^ -1);
        h.lllIIIlIIll[1] = 0x13 ^ 0x21;
        h.lllIIIlIIll[2] = 1;
        h.lllIIIlIIll[3] = 2 ^ (0x2B ^ 0x19);
        h.lllIIIlIIll[4] = 2;
        h.lllIIIlIIll[5] = 75 + 91 - 94 + 86 ^ 39 + 19 - 23 + 133;
        h.lllIIIlIIll[6] = 3;
        h.lllIIIlIIll[7] = 0x2C ^ 0x14;
        h.lllIIIlIIll[8] = 0x25 ^ 0x70 ^ (0x32 ^ 0x63);
        h.lllIIIlIIll[9] = 0x62 ^ 0x67 ^ (0x7B ^ 0x42);
        h.lllIIIlIIll[10] = 0xD2 ^ 0x80 ^ (0x5D ^ 0xA);
        h.lllIIIlIIll[11] = 0xF8 ^ 0xC2;
        h.lllIIIlIIll[12] = 57 + 59 - 53 + 126 ^ 147 + 32 - 127 + 135;
        h.lllIIIlIIll[13] = 9 ^ 0x50 ^ (0x69 ^ 0x70);
        h.lllIIIlIIll[14] = 0x32 ^ 0x1F ^ (0x40 ^ 0x6A);
        h.lllIIIlIIll[15] = 0xBF ^ 0x81;
        h.lllIIIlIIll[16] = 0x86 ^ 0x8E;
        h.lllIIIlIIll[17] = 9 ^ 0x4D;
        h.lllIIIlIIll[18] = 0x78 ^ 0x3E ^ (0xC6 ^ 0x89);
        h.lllIIIlIIll[19] = 0xDB ^ 0x8B ^ (0xB2 ^ 0xA0);
        h.lllIIIlIIll[20] = 0xBF ^ 0xB5;
        h.lllIIIlIIll[21] = 0xF3 ^ 0xBB;
        h.lllIIIlIIll[22] = 88 + 34 - 114 + 158 ^ 118 + 58 - 64 + 61;
        h.lllIIIlIIll[23] = 0x80 ^ 0xC6;
        h.lllIIIlIIll[24] = 0x69 ^ 0x54 ^ (0x42 ^ 0x73);
    }
}

