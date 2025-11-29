/*
 * Decompiled with CFR 0.152.
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class a
extends Enum<a> {
    public static final /* synthetic */ /* enum */ a DWARF_WEED_POT_UNF;
    public static final /* synthetic */ /* enum */ a DWARF_WEED;
    public static final /* synthetic */ /* enum */ a CADANTINE_POT_UNF;
    public static final /* synthetic */ /* enum */ a IRIT_LEAF;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ a IRIT_POT_UNF;
    private static /* synthetic */ int[] lllllllllIlI;
    private static /* synthetic */ String[] llllllllIlll;
    public static final /* synthetic */ /* enum */ a TORSTOL_POT_UNF;
    public static final /* synthetic */ /* enum */ a LANTADYME;
    private final /* synthetic */ int herbId;
    public static final /* synthetic */ /* enum */ a LANTA_POT_UNF;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ /* enum */ a CADANTINE;
    public static final /* synthetic */ /* enum */ a TORSTOL;

    public int b() {
        return this.herbId;
    }

    public String a() {
        return this.name;
    }

    private static void lIIlIlIlllIIllI() {
        lllllllllIlI = new int[31];
        a.lllllllllIlI[0] = (0x29 ^ 0x43 ^ (0x54 ^ 9)) & (0xC3 ^ 0x93 ^ (0x49 ^ 0x2E) ^ -1);
        a.lllllllllIlI[1] = 1;
        a.lllllllllIlI[2] = 0xFFFFCB9F & 0x3563;
        a.lllllllllIlI[3] = 2;
        a.lllllllllIlI[4] = 3;
        a.lllllllllIlI[5] = -(0xFFFFFF9B & 0x24F7) & (0xFFFFADBB & 0x77DF);
        a.lllllllllIlI[6] = 0x2B ^ 0x25 ^ (0x5A ^ 0x50);
        a.lllllllllIlI[7] = 0xBD ^ 0xB8;
        a.lllllllllIlI[8] = 0xFFFFCDF7 & 0x3BB9;
        a.lllllllllIlI[9] = 0x9E ^ 0x9A ^ 2;
        a.lllllllllIlI[10] = 0x39 ^ 0x3E;
        a.lllllllllIlI[11] = 0xFFFFFDFB & 0x30F;
        a.lllllllllIlI[12] = 0x9F ^ 0x97;
        a.lllllllllIlI[13] = 153 + 22 - 12 + 6 ^ 83 + 128 - 171 + 120;
        a.lllllllllIlI[14] = 0xFFFFC5DF & 0x3B2D;
        a.lllllllllIlI[15] = 0x2E ^ 0x24;
        a.lllllllllIlI[16] = 0x48 ^ 0x43;
        a.lllllllllIlI[17] = 0x49 ^ 0x2C;
        a.lllllllllIlI[18] = 0xB6 ^ 0xBA;
        a.lllllllllIlI[19] = 0xCF ^ 0xC2;
        a.lllllllllIlI[20] = 0x8D ^ 0xC1 ^ (0x85 ^ 0xA2);
        a.lllllllllIlI[21] = 0x54 ^ 0x5A;
        a.lllllllllIlI[22] = 0x8E ^ 0x81;
        a.lllllllllIlI[23] = 0xFFFFEDB7 & 0x1BFB;
        a.lllllllllIlI[24] = 0x2B ^ 0x3B;
        a.lllllllllIlI[25] = 0xD4 ^ 0xC5;
        a.lllllllllIlI[26] = 0x6A ^ 7;
        a.lllllllllIlI[27] = 0xB1 ^ 0xA3;
        a.lllllllllIlI[28] = 0x1A ^ 9;
        a.lllllllllIlI[29] = 0x38 ^ 0x74 ^ (0x2E ^ 0xD);
        a.lllllllllIlI[30] = 0x44 ^ 0x50;
    }

    private static void lIIlIlIlllIIlIl() {
        llllllllIlll = new String[lllllllllIlI[30]];
        a.llllllllIlll[a.lllllllllIlI[0]] = a."IRIT_LEAF";
        a.llllllllIlll[a.lllllllllIlI[1]] = a."Irit leaf";
        a.llllllllIlll[a.lllllllllIlI[3]] = a."CADANTINE";
        a.llllllllIlll[a.lllllllllIlI[4]] = a."Cadantine";
        a.llllllllIlll[a.lllllllllIlI[6]] = a."LANTADYME";
        a.llllllllIlll[a.lllllllllIlI[7]] = a."Lantadyme";
        a.llllllllIlll[a.lllllllllIlI[9]] = a."DWARF_WEED";
        a.llllllllIlll[a.lllllllllIlI[10]] = a."Dwarf weed";
        a.llllllllIlll[a.lllllllllIlI[12]] = a."TORSTOL";
        a.llllllllIlll[a.lllllllllIlI[13]] = a."Torstol";
        a.llllllllIlll[a.lllllllllIlI[15]] = a."IRIT_POT_UNF";
        a.llllllllIlll[a.lllllllllIlI[16]] = a."Irit potion (unf)";
        a.llllllllIlll[a.lllllllllIlI[18]] = a."CADANTINE_POT_UNF";
        a.llllllllIlll[a.lllllllllIlI[19]] = a."Cadantine potion (unf)";
        a.llllllllIlll[a.lllllllllIlI[21]] = a."LANTA_POT_UNF";
        a.llllllllIlll[a.lllllllllIlI[22]] = a."Lantadyme potion (unf)";
        a.llllllllIlll[a.lllllllllIlI[24]] = a."DWARF_WEED_POT_UNF";
        a.llllllllIlll[a.lllllllllIlI[25]] = a."Dwarf weed potion (unf)";
        a.llllllllIlll[a.lllllllllIlI[27]] = a."TORSTOL_POT_UNF";
        a.llllllllIlll[a.lllllllllIlI[28]] = a."Torstol potion (unf)";
    }

    private static String lIIlIlIllIlllll(String lllllllllllllllIIlIIIIlIllllIIIl, String lllllllllllllllIIlIIIIlIllllIIII) {
        lllllllllllllllIIlIIIIlIllllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlIllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIIlIllllIlII = new StringBuilder();
        char[] lllllllllllllllIIlIIIIlIllllIIll = lllllllllllllllIIlIIIIlIllllIIII.toCharArray();
        int lllllllllllllllIIlIIIIlIllllIIlI = lllllllllIlI[0];
        char[] lllllllllllllllIIlIIIIlIlllIllII = lllllllllllllllIIlIIIIlIllllIIIl.toCharArray();
        int lllllllllllllllIIlIIIIlIlllIlIll = lllllllllllllllIIlIIIIlIlllIllII.length;
        int lllllllllllllllIIlIIIIlIlllIlIlI = lllllllllIlI[0];
        while (a.lIIlIlIlllIIlll(lllllllllllllllIIlIIIIlIlllIlIlI, lllllllllllllllIIlIIIIlIlllIlIll)) {
            char lllllllllllllllIIlIIIIlIllllIlll = lllllllllllllllIIlIIIIlIlllIllII[lllllllllllllllIIlIIIIlIlllIlIlI];
            lllllllllllllllIIlIIIIlIllllIlII.append((char)(lllllllllllllllIIlIIIIlIllllIlll ^ lllllllllllllllIIlIIIIlIllllIIll[lllllllllllllllIIlIIIIlIllllIIlI % lllllllllllllllIIlIIIIlIllllIIll.length]));
            0;
            ++lllllllllllllllIIlIIIIlIllllIIlI;
            ++lllllllllllllllIIlIIIIlIlllIlIlI;
            0;
            if (((0x6D ^ 0x4B) & ~(0xA9 ^ 0x8F)) == ((0x4F ^ 0xB) & ~(0x17 ^ 0x53))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIIIlIllllIlII);
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private a(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

    private static String lIIlIlIlllIIIIl(String lllllllllllllllIIlIIIIlIlllIIIIl, String lllllllllllllllIIlIIIIlIlllIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIlIlllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), lllllllllIlI[12]), "DES");
            Cipher lllllllllllllllIIlIIIIlIlllIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIlIlllIIIll.init(lllllllllIlI[3], lllllllllllllllIIlIIIIlIlllIIlII);
            return new String(lllllllllllllllIIlIIIIlIlllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIlIlllIIIlI) {
            lllllllllllllllIIlIIIIlIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIlllIIIII(String lllllllllllllllIIlIIIIlIllIlIlII, String lllllllllllllllIIlIIIIlIllIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIlIllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIlIllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIIlIllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIIlIllIlIllI.init(lllllllllIlI[3], lllllllllllllllIIlIIIIlIllIlIlll);
            return new String(lllllllllllllllIIlIIIIlIllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIlIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIIlIllIlIlIl) {
            lllllllllllllllIIlIIIIlIllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        a.lIIlIlIlllIIllI();
        a.lIIlIlIlllIIlIl();
        IRIT_LEAF = new a(llllllllIlll[lllllllllIlI[1]], lllllllllIlI[2]);
        CADANTINE = new a(llllllllIlll[lllllllllIlI[4]], lllllllllIlI[5]);
        LANTADYME = new a(llllllllIlll[lllllllllIlI[7]], lllllllllIlI[8]);
        DWARF_WEED = new a(llllllllIlll[lllllllllIlI[10]], lllllllllIlI[11]);
        TORSTOL = new a(llllllllIlll[lllllllllIlI[13]], lllllllllIlI[14]);
        IRIT_POT_UNF = new a(llllllllIlll[lllllllllIlI[16]], lllllllllIlI[17]);
        CADANTINE_POT_UNF = new a(llllllllIlll[lllllllllIlI[19]], lllllllllIlI[20]);
        LANTA_POT_UNF = new a(llllllllIlll[lllllllllIlI[22]], lllllllllIlI[23]);
        DWARF_WEED_POT_UNF = new a(llllllllIlll[lllllllllIlI[25]], lllllllllIlI[26]);
        TORSTOL_POT_UNF = new a(llllllllIlll[lllllllllIlI[28]], lllllllllIlI[29]);
        a[] aArray = new a[lllllllllIlI[15]];
        aArray[a.lllllllllIlI[0]] = IRIT_LEAF;
        aArray[a.lllllllllIlI[1]] = CADANTINE;
        aArray[a.lllllllllIlI[3]] = LANTADYME;
        aArray[a.lllllllllIlI[4]] = DWARF_WEED;
        aArray[a.lllllllllIlI[6]] = TORSTOL;
        aArray[a.lllllllllIlI[7]] = IRIT_POT_UNF;
        aArray[a.lllllllllIlI[9]] = CADANTINE_POT_UNF;
        aArray[a.lllllllllIlI[10]] = LANTA_POT_UNF;
        aArray[a.lllllllllIlI[12]] = DWARF_WEED_POT_UNF;
        aArray[a.lllllllllIlI[13]] = TORSTOL_POT_UNF;
        $VALUES = aArray;
    }
}

