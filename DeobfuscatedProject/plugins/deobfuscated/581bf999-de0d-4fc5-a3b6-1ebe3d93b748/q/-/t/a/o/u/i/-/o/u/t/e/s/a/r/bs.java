/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

final class bs
extends Enum<bs> {
    private static final /* synthetic */ bs[] $VALUES;
    private final /* synthetic */ int value;
    public static final /* synthetic */ /* enum */ bs TRIANGLE;
    public static final /* synthetic */ /* enum */ bs WIGGLE;
    private final /* synthetic */ int groundObjectId;
    public static final /* synthetic */ /* enum */ bs DIAMOND;
    public static final /* synthetic */ /* enum */ bs LINE;
    public static final /* synthetic */ /* enum */ bs BIRD;
    private static /* synthetic */ int[] lIllIlIIIll;
    public static final /* synthetic */ /* enum */ bs KNIVES;
    private static /* synthetic */ String[] lIllIlIIIIl;
    private final /* synthetic */ int gameObjectId;
    public static final /* synthetic */ /* enum */ bs HAND;
    public static final /* synthetic */ /* enum */ bs CROOK;
    public static final /* synthetic */ /* enum */ bs FOOT;

    public static bs[] values() {
        return (bs[])$VALUES.clone();
    }

    static {
        bs.lIIlIllIllIlll();
        bs.lIIlIllIllIIll();
        LINE = new bs(lIllIlIIIll[1], lIllIlIIIll[2], lIllIlIIIll[3]);
        KNIVES = new bs(lIllIlIIIll[4], lIllIlIIIll[5], lIllIlIIIll[6]);
        TRIANGLE = new bs(lIllIlIIIll[7], lIllIlIIIll[8], lIllIlIIIll[9]);
        DIAMOND = new bs(lIllIlIIIll[10], lIllIlIIIll[11], lIllIlIIIll[12]);
        HAND = new bs(lIllIlIIIll[13], lIllIlIIIll[14], lIllIlIIIll[15]);
        BIRD = new bs(lIllIlIIIll[16], lIllIlIIIll[17], lIllIlIIIll[18]);
        CROOK = new bs(lIllIlIIIll[19], lIllIlIIIll[20], lIllIlIIIll[21]);
        WIGGLE = new bs(lIllIlIIIll[22], lIllIlIIIll[23], lIllIlIIIll[24]);
        FOOT = new bs(lIllIlIIIll[25], lIllIlIIIll[26], lIllIlIIIll[27]);
        bs[] bsArray = new bs[lIllIlIIIll[25]];
        bsArray[bs.lIllIlIIIll[0]] = LINE;
        bsArray[bs.lIllIlIIIll[1]] = KNIVES;
        bsArray[bs.lIllIlIIIll[4]] = TRIANGLE;
        bsArray[bs.lIllIlIIIll[7]] = DIAMOND;
        bsArray[bs.lIllIlIIIll[10]] = HAND;
        bsArray[bs.lIllIlIIIll[13]] = BIRD;
        bsArray[bs.lIllIlIIIll[16]] = CROOK;
        bsArray[bs.lIllIlIIIll[19]] = WIGGLE;
        bsArray[bs.lIllIlIIIll[22]] = FOOT;
        $VALUES = bsArray;
    }

    private static boolean lIIlIllIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    public static bs valueOf(String string) {
        return Enum.valueOf(bs.class, string);
    }

    private static String lIIlIllIllIIII(String llllllllllllllllIlIlIIlIIIllIIII, String llllllllllllllllIlIlIIlIIIlIlIlI) {
        llllllllllllllllIlIlIIlIIIllIIII = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIlIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIIlIIIlIlllI = new StringBuilder();
        char[] llllllllllllllllIlIlIIlIIIlIllIl = llllllllllllllllIlIlIIlIIIlIlIlI.toCharArray();
        int llllllllllllllllIlIlIIlIIIlIllII = lIllIlIIIll[0];
        char[] llllllllllllllllIlIlIIlIIIlIIllI = llllllllllllllllIlIlIIlIIIllIIII.toCharArray();
        int llllllllllllllllIlIlIIlIIIlIIlIl = llllllllllllllllIlIlIIlIIIlIIllI.length;
        int llllllllllllllllIlIlIIlIIIlIIlII = lIllIlIIIll[0];
        while (bs.lIIlIllIlllIII(llllllllllllllllIlIlIIlIIIlIIlII, llllllllllllllllIlIlIIlIIIlIIlIl)) {
            char llllllllllllllllIlIlIIlIIIllIIIl = llllllllllllllllIlIlIIlIIIlIIllI[llllllllllllllllIlIlIIlIIIlIIlII];
            llllllllllllllllIlIlIIlIIIlIlllI.append((char)(llllllllllllllllIlIlIIlIIIllIIIl ^ llllllllllllllllIlIlIIlIIIlIllIl[llllllllllllllllIlIlIIlIIIlIllII % llllllllllllllllIlIlIIlIIIlIllIl.length]));
            0;
            ++llllllllllllllllIlIlIIlIIIlIllII;
            ++llllllllllllllllIlIlIIlIIIlIIlII;
            0;
            if ((0x85 ^ 0xA8 ^ (0x65 ^ 0x4C)) != 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIIlIIIlIlllI);
    }

    private static String lIIlIllIllIIIl(String llllllllllllllllIlIlIIlIIIIllIIl, String llllllllllllllllIlIlIIlIIIIllIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIlIIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIlIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIIlIIIIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIIlIIIIlllIl.init(lIllIlIIIll[4], llllllllllllllllIlIlIIlIIIIllllI);
            return new String(llllllllllllllllIlIlIIlIIIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIlIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIlIIIIlllII) {
            llllllllllllllllIlIlIIlIIIIlllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIllIllIIll() {
        lIllIlIIIIl = new String[lIllIlIIIll[25]];
        bs.lIllIlIIIIl[bs.lIllIlIIIll[0]] = bs."LINE";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[1]] = bs."KNIVES";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[4]] = bs."TRIANGLE";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[7]] = bs."DIAMOND";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[10]] = bs."HAND";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[13]] = bs."BIRD";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[16]] = bs."CROOK";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[19]] = bs."WIGGLE";
        bs.lIllIlIIIIl[bs.lIllIlIIIll[22]] = bs."FOOT";
    }

    public int ci() {
        return this.gameObjectId;
    }

    public int cg() {
        return this.value;
    }

    private static void lIIlIllIllIlll() {
        lIllIlIIIll = new int[28];
        bs.lIllIlIIIll[0] = (0x7C ^ 0x63 ^ (0x66 ^ 0x3E)) & (0x15 ^ 0x72 ^ (0x84 ^ 0xA4) ^ -1);
        bs.lIllIlIIIll[1] = 1;
        bs.lIllIlIIIll[2] = -(0xFFFFFFDF & 0x4CFD) & (0xFFFFFDFD & 0xFFFF);
        bs.lIllIlIIIll[3] = 0xFFFFF17E & 0xBFCD;
        bs.lIllIlIIIll[4] = 2;
        bs.lIllIlIIIll[5] = -(0xFFFF8EDD & 0x7F7B) & (0xFFFFFFFB & 0xBF7E);
        bs.lIllIlIIIll[6] = -(0xFFFFC6F7 & 0x7FBB) & (0xFFFFFFFF & 0xF7FF);
        bs.lIllIlIIIll[7] = 3;
        bs.lIllIlIIIll[8] = 0xFFFFFDA3 & 0xB37F;
        bs.lIllIlIIIll[9] = 0xFFFFB1EF & 0xFF5E;
        bs.lIllIlIIIll[10] = 0x20 ^ 0x24;
        bs.lIllIlIIIll[11] = -(0xFFFFDCDB & 0x676E) & (0xFFFFFF7D & 0xF5EF);
        bs.lIllIlIIIll[12] = 0xFFFFF3EF & 0xBD5F;
        bs.lIllIlIIIll[13] = 176 + 121 - 142 + 22 ^ 17 + 67 - -3 + 93;
        bs.lIllIlIIIll[14] = -(0xFFFFC5D3 & 0x7EFD) & (0xFFFFFFFF & 0xF5F5);
        bs.lIllIlIIIll[15] = -(0xFFFFD4C6 & 0x6BBD) & (0xFFFFFDD7 & 0xF3FB);
        bs.lIllIlIIIll[16] = 0x35 ^ 0x33;
        bs.lIllIlIIIll[17] = 0xFFFFFDAF & 0xB376;
        bs.lIllIlIIIll[18] = -(0xFFFF9FAD & 0x68FF) & (0xFFFFBFFF & 0xF9FD);
        bs.lIllIlIIIll[19] = 0x20 ^ 0x52 ^ (0x3A ^ 0x4F);
        bs.lIllIlIIIll[20] = 0xFFFFF977 & 0xB7AF;
        bs.lIllIlIIIll[21] = 0xFFFFBF7A & 0xF1CF;
        bs.lIllIlIIIll[22] = 0x5C ^ 0x54;
        bs.lIllIlIIIll[23] = -(0xFFFFFC36 & 0xBDB) & (0xFFFFBBBD & 0xFD7B);
        bs.lIllIlIIIll[24] = 0xFFFFF1F6 & 0xBF5B;
        bs.lIllIlIIIll[25] = 106 + 43 - 24 + 9 ^ 142 + 76 - 206 + 131;
        bs.lIllIlIIIll[26] = 0xFFFFB32D & 0xFDFB;
        bs.lIllIlIIIll[27] = -1 & (0xFFFFF37B & 0xBDD7);
    }

    public int ch() {
        return this.groundObjectId;
    }

    private bs(int n3, int n4, int n5) {
        this.value = n3;
        this.groundObjectId = n4;
        this.gameObjectId = n5;
    }

    private static String lIIlIllIllIIlI(String llllllllllllllllIlIlIIlIIIIIlllI, String llllllllllllllllIlIlIIlIIIIIllIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIlIIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIlIIIIIllIl.getBytes(StandardCharsets.UTF_8)), lIllIlIIIll[22]), "DES");
            Cipher llllllllllllllllIlIlIIlIIIIlIIII = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIlIIIIlIIII.init(lIllIlIIIll[4], llllllllllllllllIlIlIIlIIIIlIIIl);
            return new String(llllllllllllllllIlIlIIlIIIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIlIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIlIIIIIllll) {
            llllllllllllllllIlIlIIlIIIIIllll.printStackTrace();
            return null;
        }
    }
}

