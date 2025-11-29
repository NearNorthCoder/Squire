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

public final class n
extends Enum<n> {
    public static final /* synthetic */ /* enum */ n CANDLE_LANTERN;
    public static final /* synthetic */ /* enum */ n LIGHT_ORB;
    private final /* synthetic */ int craftingOption;
    private static /* synthetic */ int[] lllIIllIIll;
    private static /* synthetic */ String[] lllIIllIIlI;
    private static final /* synthetic */ n[] $VALUES;
    public static final /* synthetic */ /* enum */ n UNPOWERED_STAFF_ORB;
    public static final /* synthetic */ /* enum */ n VIAL;
    public static final /* synthetic */ /* enum */ n FISHBOWL;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ /* enum */ n BEER_GLASS;
    public static final /* synthetic */ /* enum */ n LANTERN_LENS;
    public static final /* synthetic */ /* enum */ n OIL_LAMP;
    private final /* synthetic */ int finishedID;

    static {
        n.lIlIlllIIllIll();
        n.lIlIlllIIllIlI();
        BEER_GLASS = new n(lllIIllIIll[1], lllIIllIIll[2], lllIIllIIll[3]);
        CANDLE_LANTERN = new n(lllIIllIIll[1], lllIIllIIll[4], lllIIllIIll[5]);
        OIL_LAMP = new n(lllIIllIIll[1], lllIIllIIll[6], lllIIllIIll[7]);
        VIAL = new n(lllIIllIIll[1], lllIIllIIll[8], lllIIllIIll[9]);
        FISHBOWL = new n(lllIIllIIll[1], lllIIllIIll[10], lllIIllIIll[11]);
        UNPOWERED_STAFF_ORB = new n(lllIIllIIll[1], lllIIllIIll[12], lllIIllIIll[13]);
        LANTERN_LENS = new n(lllIIllIIll[1], lllIIllIIll[14], lllIIllIIll[15]);
        LIGHT_ORB = new n(lllIIllIIll[1], lllIIllIIll[16], lllIIllIIll[17]);
        n[] nArray = new n[lllIIllIIll[17]];
        nArray[n.lllIIllIIll[0]] = BEER_GLASS;
        nArray[n.lllIIllIIll[3]] = CANDLE_LANTERN;
        nArray[n.lllIIllIIll[5]] = OIL_LAMP;
        nArray[n.lllIIllIIll[7]] = VIAL;
        nArray[n.lllIIllIIll[9]] = FISHBOWL;
        nArray[n.lllIIllIIll[11]] = UNPOWERED_STAFF_ORB;
        nArray[n.lllIIllIIll[13]] = LANTERN_LENS;
        nArray[n.lllIIllIIll[15]] = LIGHT_ORB;
        $VALUES = nArray;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    private static String lIlIlllIIllIII(String llllllllllllllllIIlIIllllIIIIIlI, String llllllllllllllllIIlIIllllIIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllllIIIIIll.getBytes(StandardCharsets.UTF_8)), lllIIllIIll[17]), "DES");
            Cipher llllllllllllllllIIlIIllllIIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIllllIIIIllI.init(lllIIllIIll[5], llllllllllllllllIIlIIllllIIIIlll);
            return new String(llllllllllllllllIIlIIllllIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllllIIIIlIl) {
            llllllllllllllllIIlIIllllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllIIllIIl(String llllllllllllllllIIlIIllllIIlIIIl, String llllllllllllllllIIlIIllllIIIlllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllllIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllllIIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllllIIlIIll.init(lllIIllIIll[5], llllllllllllllllIIlIIllllIIlIlII);
            return new String(llllllllllllllllIIlIIllllIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllllIIlIIlI) {
            llllllllllllllllIIlIIllllIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllIIlIlll(String llllllllllllllllIIlIIllllIlIIllI, String llllllllllllllllIIlIIllllIlIIlIl) {
        llllllllllllllllIIlIIllllIlIIllI = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIllllIlIIlII = new StringBuilder();
        char[] llllllllllllllllIIlIIllllIlIIIll = llllllllllllllllIIlIIllllIlIIlIl.toCharArray();
        int llllllllllllllllIIlIIllllIlIIIlI = lllIIllIIll[0];
        char[] llllllllllllllllIIlIIllllIIlllII = llllllllllllllllIIlIIllllIlIIllI.toCharArray();
        int llllllllllllllllIIlIIllllIIllIll = llllllllllllllllIIlIIllllIIlllII.length;
        int llllllllllllllllIIlIIllllIIllIlI = lllIIllIIll[0];
        while (n.lIlIlllIIlllII(llllllllllllllllIIlIIllllIIllIlI, llllllllllllllllIIlIIllllIIllIll)) {
            char llllllllllllllllIIlIIllllIlIIlll = llllllllllllllllIIlIIllllIIlllII[llllllllllllllllIIlIIllllIIllIlI];
            llllllllllllllllIIlIIllllIlIIlII.append((char)(llllllllllllllllIIlIIllllIlIIlll ^ llllllllllllllllIIlIIllllIlIIIll[llllllllllllllllIIlIIllllIlIIIlI % llllllllllllllllIIlIIllllIlIIIll.length]));
            0;
            ++llllllllllllllllIIlIIllllIlIIIlI;
            ++llllllllllllllllIIlIIllllIIllIlI;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIllllIlIIlII);
    }

    private static void lIlIlllIIllIlI() {
        lllIIllIIlI = new String[lllIIllIIll[17]];
        n.lllIIllIIlI[n.lllIIllIIll[0]] = n."BEER_GLASS";
        n.lllIIllIIlI[n.lllIIllIIll[3]] = n."CANDLE_LANTERN";
        n.lllIIllIIlI[n.lllIIllIIll[5]] = n."OIL_LAMP";
        n.lllIIllIIlI[n.lllIIllIIll[7]] = n."VIAL";
        n.lllIIllIIlI[n.lllIIllIIll[9]] = n."FISHBOWL";
        n.lllIIllIIlI[n.lllIIllIIll[11]] = n."UNPOWERED_STAFF_ORB";
        n.lllIIllIIlI[n.lllIIllIIll[13]] = n."LANTERN_LENS";
        n.lllIIllIIlI[n.lllIIllIIll[15]] = n."LIGHT_ORB";
    }

    private static boolean lIlIlllIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    public int C() {
        return this.craftingOption;
    }

    private static void lIlIlllIIllIll() {
        lllIIllIIll = new int[18];
        n.lllIIllIIll[0] = (0x5D ^ 0x4B) & ~(8 ^ 0x1E);
        n.lllIIllIIll[1] = 0xFFFF9FEF & 0x66FF;
        n.lllIIllIIll[2] = -(0xFFFFA991 & 0x7EEF) & (0xFFFFBFFF & 0x6FFF);
        n.lllIIllIIll[3] = 1;
        n.lllIIllIIll[4] = -(0xFFFFE779 & 0x7CD7) & (0xFFFFF5FF & Short.MAX_VALUE);
        n.lllIIllIIll[5] = 2;
        n.lllIIllIIll[6] = -(0xFFFFA627 & 0x5FDB) & (0xFFFF9FBF & 0x77EF);
        n.lllIIllIIll[7] = 3;
        n.lllIIllIIll[8] = 110 + 11 - 119 + 190 + (2 ^ 0x18) - (72 + 9 - 27 + 74) + (29 + 41 - -68 + 1);
        n.lllIIllIIll[9] = 0x12 ^ 0x16;
        n.lllIIllIIll[10] = -(0xFFFFF5FB & 0x6FA7) & (0xFFFFFFBF & 0x7FEE);
        n.lllIIllIIll[11] = 0x2B ^ 0x7D ^ (0xFE ^ 0xAD);
        n.lllIIllIIll[12] = 0xFFFFE27F & 0x1FB7;
        n.lllIIllIIll[13] = 0x28 ^ 0x2E;
        n.lllIIllIIll[14] = 0xFFFFB7BE & 0x59FF;
        n.lllIIllIIll[15] = 158 + 131 - 162 + 71 ^ 72 + 93 - 55 + 83;
        n.lllIIllIIll[16] = -(0xFFFFD781 & 0x7C7F) & (0xFFFFFEFD & 0x7FDF);
        n.lllIIllIIll[17] = 0x62 ^ 0x6A;
    }

    public int z() {
        return this.materialID;
    }

    private n(int n3, int n4, int n5) {
        this.materialID = n3;
        this.finishedID = n4;
        this.craftingOption = n5;
    }

    public int E() {
        return this.finishedID;
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }
}

