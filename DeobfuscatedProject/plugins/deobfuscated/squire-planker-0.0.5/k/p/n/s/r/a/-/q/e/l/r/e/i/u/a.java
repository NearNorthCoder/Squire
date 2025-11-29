/*
 * Decompiled with CFR 0.152.
 */
package k.p.n.s.r.a.-.q.e.l.r.e.i.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class a
extends Enum<a> {
    private final /* synthetic */ int plankCost;
    public static final /* synthetic */ /* enum */ a TEAK;
    public static final /* synthetic */ /* enum */ a NORMAL;
    public static final /* synthetic */ /* enum */ a MAHOGANY;
    private final /* synthetic */ int plankID;
    private final /* synthetic */ int itemID;
    private static /* synthetic */ int[] lllllIllllIl;
    public static final /* synthetic */ /* enum */ a OAK;
    private static final /* synthetic */ a[] $VALUES;
    private static /* synthetic */ String[] lllllIllllII;

    private static boolean lIIlIIlllIlllll(int n, int n2) {
        return n < n2;
    }

    static {
        a.lIIlIIlllIllllI();
        a.lIIlIIlllIlllIl();
        NORMAL = new a(lllllIllllIl[1], lllllIllllIl[2], lllllIllllIl[3]);
        OAK = new a(lllllIllllIl[5], lllllIllllIl[6], lllllIllllIl[7]);
        TEAK = new a(lllllIllllIl[9], lllllIllllIl[10], lllllIllllIl[11]);
        MAHOGANY = new a(lllllIllllIl[13], lllllIllllIl[14], lllllIllllIl[15]);
        a[] aArray = new a[lllllIllllIl[16]];
        aArray[a.lllllIllllIl[0]] = NORMAL;
        aArray[a.lllllIllllIl[4]] = OAK;
        aArray[a.lllllIllllIl[8]] = TEAK;
        aArray[a.lllllIllllIl[12]] = MAHOGANY;
        $VALUES = aArray;
    }

    private static String lIIlIIlllIllIll(String lllllllllllllllIIlIlIIIIIlIIIIIl, String lllllllllllllllIIlIlIIIIIIlllllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIIIIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIIIIlllllI.getBytes(StandardCharsets.UTF_8)), lllllIllllIl[17]), "DES");
            Cipher lllllllllllllllIIlIlIIIIIlIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIIIIlIIIIll.init(lllllIllllIl[8], lllllllllllllllIIlIlIIIIIlIIIlII);
            return new String(lllllllllllllllIIlIlIIIIIlIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIIIIlIIIIlI) {
            lllllllllllllllIIlIlIIIIIlIIIIlI.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static void lIIlIIlllIlllIl() {
        lllllIllllII = new String[lllllIllllIl[16]];
        a.lllllIllllII[a.lllllIllllIl[0]] = a."NORMAL";
        a.lllllIllllII[a.lllllIllllIl[4]] = a."OAK";
        a.lllllIllllII[a.lllllIllllIl[8]] = a."TEAK";
        a.lllllIllllII[a.lllllIllllIl[12]] = a."MAHOGANY";
    }

    private static void lIIlIIlllIllllI() {
        lllllIllllIl = new int[18];
        a.lllllIllllIl[0] = (0xC2 ^ 0xA6 ^ (0x11 ^ 0x3F)) & (81 + 160 - 203 + 154 ^ 60 + 29 - -25 + 24 ^ -1);
        a.lllllIllllIl[1] = -(0xFFFF9721 & 0x78DF) & (0xFFFFF5E7 & 0x1FFF);
        a.lllllIllllIl[2] = -(0xFFFFB846 & 0x77BF) & (0xFFFFFB6D & 0x3DF7);
        a.lllllIllllIl[3] = -(0xFFFFD6FC & 0x7D2F) & (0xFFFFFFFF & 0x57EB);
        a.lllllIllllIl[4] = 1;
        a.lllllIllllIl[5] = -(0xFFFFBE9B & 0x7B6F) & (0xFFFFFFFB & 0x3FFF);
        a.lllllIllllIl[6] = -(0xFFFFE4F7 & 0x7B8F) & (0xFFFFF7FE & 0x7FF7);
        a.lllllIllllIl[7] = -(0xFFFFE337 & 0x5DFE) & (0xFFFFF37F & 0x6FFF);
        a.lllllIllllIl[8] = 2;
        a.lllllIllllIl[9] = -(0xFFFFFD3F & 0x66C3) & (0xFFFFFEFF & 0x7DBF);
        a.lllllIllllIl[10] = 0xFFFFAEFF & 0x7FE0;
        a.lllllIllllIl[11] = 0xFFFFBBDD & 0x666E;
        a.lllllIllllIl[12] = 3;
        a.lllllIllllIl[13] = -(0xFFFFCDAD & 0x7253) & (0xFFFFD9BC & 0x7EFF);
        a.lllllIllllIl[14] = -(0xFFFFE1FE & 0x7F5B) & (0xFFFFEFF9 & 0xFDFF);
        a.lllllIllllIl[15] = 0xFFFFBE6F & 0x63DE;
        a.lllllIllllIl[16] = 0x36 ^ 0x18 ^ (0x51 ^ 0x7B);
        a.lllllIllllIl[17] = 0xA8 ^ 0xA0;
    }

    private a(int n2, int n3, int n4) {
        this.itemID = n2;
        this.plankCost = n3;
        this.plankID = n4;
    }

    public int e() {
        return this.plankCost;
    }

    public int f() {
        return this.plankID;
    }

    private static String lIIlIIlllIlllII(String lllllllllllllllIIlIlIIIIIIlIllII, String lllllllllllllllIIlIlIIIIIIllIIII) {
        lllllllllllllllIIlIlIIIIIIlIllII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIIIIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIIIIIlIllll = new StringBuilder();
        char[] lllllllllllllllIIlIlIIIIIIlIlllI = lllllllllllllllIIlIlIIIIIIllIIII.toCharArray();
        int lllllllllllllllIIlIlIIIIIIlIllIl = lllllIllllIl[0];
        char[] lllllllllllllllIIlIlIIIIIIlIIlll = lllllllllllllllIIlIlIIIIIIlIllII.toCharArray();
        int lllllllllllllllIIlIlIIIIIIlIIllI = lllllllllllllllIIlIlIIIIIIlIIlll.length;
        int lllllllllllllllIIlIlIIIIIIlIIlIl = lllllIllllIl[0];
        while (a.lIIlIIlllIlllll(lllllllllllllllIIlIlIIIIIIlIIlIl, lllllllllllllllIIlIlIIIIIIlIIllI)) {
            char lllllllllllllllIIlIlIIIIIIllIIlI = lllllllllllllllIIlIlIIIIIIlIIlll[lllllllllllllllIIlIlIIIIIIlIIlIl];
            lllllllllllllllIIlIlIIIIIIlIllll.append((char)(lllllllllllllllIIlIlIIIIIIllIIlI ^ lllllllllllllllIIlIlIIIIIIlIlllI[lllllllllllllllIIlIlIIIIIIlIllIl % lllllllllllllllIIlIlIIIIIIlIlllI.length]));
            0;
            ++lllllllllllllllIIlIlIIIIIIlIllIl;
            ++lllllllllllllllIIlIlIIIIIIlIIlIl;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIIIIIIlIllll);
    }

    public int d() {
        return this.itemID;
    }
}

