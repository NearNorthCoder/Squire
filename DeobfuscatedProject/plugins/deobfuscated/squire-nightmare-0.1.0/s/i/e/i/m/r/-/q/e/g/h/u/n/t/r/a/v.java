/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class v
extends Enum<v> {
    public static final /* synthetic */ /* enum */ v INQUISITORS_MACE;
    public static final /* synthetic */ /* enum */ v SARADOMIN_GODSWORD;
    private static final /* synthetic */ v[] $VALUES;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ /* enum */ v DRAGON_MACE;
    public static final /* synthetic */ /* enum */ v NONE;
    private static /* synthetic */ String[] llllIIIIlllI;
    public static final /* synthetic */ /* enum */ v ARMADYL_GODSWORD;
    public static final /* synthetic */ /* enum */ v BANDOS_GODSWORD;
    public static final /* synthetic */ /* enum */ v ELDER_MAUL;
    public static final /* synthetic */ /* enum */ v TZHAAR_KET_OM;
    private static /* synthetic */ int[] llllIIIlIIIl;
    public static final /* synthetic */ /* enum */ v ANCIENT_GODSWORD;
    public static final /* synthetic */ /* enum */ v DRAGON_WARHAMMER;

    private static String lIIIlllIllIllIl(String lllllllllllllllIIllIIIIIIllllIlI, String lllllllllllllllIIllIIIIIIllllIIl) {
        lllllllllllllllIIllIIIIIIllllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIIIIIlllllIl = new StringBuilder();
        char[] lllllllllllllllIIllIIIIIIlllllII = lllllllllllllllIIllIIIIIIllllIIl.toCharArray();
        int lllllllllllllllIIllIIIIIIllllIll = llllIIIlIIIl[0];
        char[] lllllllllllllllIIllIIIIIIlllIlIl = lllllllllllllllIIllIIIIIIllllIlI.toCharArray();
        int lllllllllllllllIIllIIIIIIlllIlII = lllllllllllllllIIllIIIIIIlllIlIl.length;
        int lllllllllllllllIIllIIIIIIlllIIll = llllIIIlIIIl[0];
        while (v.lIIIlllIllllIII(lllllllllllllllIIllIIIIIIlllIIll, lllllllllllllllIIllIIIIIIlllIlII)) {
            char lllllllllllllllIIllIIIIIlIIIIIII = lllllllllllllllIIllIIIIIIlllIlIl[lllllllllllllllIIllIIIIIIlllIIll];
            lllllllllllllllIIllIIIIIIlllllIl.append((char)(lllllllllllllllIIllIIIIIlIIIIIII ^ lllllllllllllllIIllIIIIIIlllllII[lllllllllllllllIIllIIIIIIllllIll % lllllllllllllllIIllIIIIIIlllllII.length]));
            0;
            ++lllllllllllllllIIllIIIIIIllllIll;
            ++lllllllllllllllIIllIIIIIIlllIIll;
            0;
            if ((154 + 94 - 130 + 45 ^ 91 + 1 - 40 + 115) != 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIIIIIlllllIl);
    }

    private v(int n3) {
        this.itemID = n3;
    }

    private static void lIIIlllIlllIlII() {
        llllIIIIlllI = new String[llllIIIlIIIl[20]];
        v.llllIIIIlllI[v.llllIIIlIIIl[0]] = v."ELDER_MAUL";
        v.llllIIIIlllI[v.llllIIIlIIIl[2]] = v."SARADOMIN_GODSWORD";
        v.llllIIIIlllI[v.llllIIIlIIIl[4]] = v."ARMADYL_GODSWORD";
        v.llllIIIIlllI[v.llllIIIlIIIl[6]] = v."BANDOS_GODSWORD";
        v.llllIIIIlllI[v.llllIIIlIIIl[8]] = v."ANCIENT_GODSWORD";
        v.llllIIIIlllI[v.llllIIIlIIIl[10]] = v."TZHAAR_KET_OM";
        v.llllIIIIlllI[v.llllIIIlIIIl[12]] = v."INQUISITORS_MACE";
        v.llllIIIIlllI[v.llllIIIlIIIl[14]] = v."DRAGON_MACE";
        v.llllIIIIlllI[v.llllIIIlIIIl[16]] = v."DRAGON_WARHAMMER";
        v.llllIIIIlllI[v.llllIIIlIIIl[18]] = v."NONE";
    }

    private static String lIIIlllIllIllll(String lllllllllllllllIIllIIIIIlIIIllll, String lllllllllllllllIIllIIIIIlIIIllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIlIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIIIlIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIIIlIIlIIIl.init(llllIIIlIIIl[4], lllllllllllllllIIllIIIIIlIIlIIlI);
            return new String(lllllllllllllllIIllIIIIIlIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIIlIIlIIII) {
            lllllllllllllllIIllIIIIIlIIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    public int bH() {
        return this.itemID;
    }

    static {
        v.lIIIlllIlllIlll();
        v.lIIIlllIlllIlII();
        ELDER_MAUL = new v(llllIIIlIIIl[1]);
        SARADOMIN_GODSWORD = new v(llllIIIlIIIl[3]);
        ARMADYL_GODSWORD = new v(llllIIIlIIIl[5]);
        BANDOS_GODSWORD = new v(llllIIIlIIIl[7]);
        ANCIENT_GODSWORD = new v(llllIIIlIIIl[9]);
        TZHAAR_KET_OM = new v(llllIIIlIIIl[11]);
        INQUISITORS_MACE = new v(llllIIIlIIIl[13]);
        DRAGON_MACE = new v(llllIIIlIIIl[15]);
        DRAGON_WARHAMMER = new v(llllIIIlIIIl[17]);
        NONE = new v(llllIIIlIIIl[19]);
        v[] vArray = new v[llllIIIlIIIl[20]];
        vArray[v.llllIIIlIIIl[0]] = ELDER_MAUL;
        vArray[v.llllIIIlIIIl[2]] = SARADOMIN_GODSWORD;
        vArray[v.llllIIIlIIIl[4]] = ARMADYL_GODSWORD;
        vArray[v.llllIIIlIIIl[6]] = BANDOS_GODSWORD;
        vArray[v.llllIIIlIIIl[8]] = ANCIENT_GODSWORD;
        vArray[v.llllIIIlIIIl[10]] = TZHAAR_KET_OM;
        vArray[v.llllIIIlIIIl[12]] = INQUISITORS_MACE;
        vArray[v.llllIIIlIIIl[14]] = DRAGON_MACE;
        vArray[v.llllIIIlIIIl[16]] = DRAGON_WARHAMMER;
        vArray[v.llllIIIlIIIl[18]] = NONE;
        $VALUES = vArray;
    }

    public static v[] values() {
        return (v[])$VALUES.clone();
    }

    private static String lIIIlllIllIlllI(String lllllllllllllllIIllIIIIIIllIlIlI, String lllllllllllllllIIllIIIIIIllIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIIllIlIIl.getBytes(StandardCharsets.UTF_8)), llllIIIlIIIl[16]), "DES");
            Cipher lllllllllllllllIIllIIIIIIllIllII = Cipher.getInstance("DES");
            lllllllllllllllIIllIIIIIIllIllII.init(llllIIIlIIIl[4], lllllllllllllllIIllIIIIIIllIllIl);
            return new String(lllllllllllllllIIllIIIIIIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIIIllIlIll) {
            lllllllllllllllIIllIIIIIIllIlIll.printStackTrace();
            return null;
        }
    }

    public static v valueOf(String string) {
        return Enum.valueOf(v.class, string);
    }

    private static void lIIIlllIlllIlll() {
        llllIIIlIIIl = new int[21];
        v.llllIIIlIIIl[0] = (0x46 ^ 0x15 ^ (0x77 ^ 0x3C)) & (163 + 134 - 287 + 162 ^ 133 + 28 - 76 + 95 ^ -1);
        v.llllIIIlIIIl[1] = 0xFFFFFA1F & 0x57EB;
        v.llllIIIlIIIl[2] = 1;
        v.llllIIIlIIIl[3] = 0xFFFFEE9F & 0x3F7E;
        v.llllIIIlIIIl[4] = 2;
        v.llllIIIlIIIl[5] = 0xFFFFEEFB & 0x3F1E;
        v.llllIIIlIIIl[6] = 3;
        v.llllIIIlIIIl[7] = -(0xFFFFDE67 & 0x61F9) & (0xFFFFEEFE & 0x7F7D);
        v.llllIIIlIIIl[8] = 0xEA ^ 0x83 ^ (0xFA ^ 0x97);
        v.llllIIIlIIIl[9] = -(0xFFFF9DB7 & 0x734D) & (0xFFFFFF7F & 0x77FD);
        v.llllIIIlIIIl[10] = 85 + 152 - 233 + 184 ^ 102 + 121 - 49 + 11;
        v.llllIIIlIIIl[11] = 0xFFFFB9EE & 0x5F91;
        v.llllIIIlIIIl[12] = 0x3B ^ 0x73 ^ (0x66 ^ 0x28);
        v.llllIIIlIIIl[13] = -(111 + 27 - 79 + 70) & (0xFFFFFFE5 & 0x5FFB);
        v.llllIIIlIIIl[14] = 2 ^ (0xA ^ 0xF);
        v.llllIIIlIIIl[15] = 0xFFFFE5FF & 0x1F9A;
        v.llllIIIlIIIl[16] = 105 + 173 - 102 + 27 ^ 161 + 60 - 200 + 174;
        v.llllIIIlIIIl[17] = 0xFFFFF71A & 0x3DED;
        v.llllIIIlIIIl[18] = 0xE5 ^ 0xA4 ^ (0x37 ^ 0x7F);
        v.llllIIIlIIIl[19] = -1;
        v.llllIIIlIIIl[20] = 38 + 70 - 78 + 111 ^ 29 + 78 - 83 + 111;
    }
}

