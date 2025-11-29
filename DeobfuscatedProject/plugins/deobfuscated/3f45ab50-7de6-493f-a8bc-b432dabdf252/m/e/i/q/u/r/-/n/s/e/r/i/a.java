/*
 * Decompiled with CFR 0.152.
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class a
extends Enum<a> {
    /* synthetic */ String activityName;
    public static final /* synthetic */ /* enum */ a GRANITE;
    public static final /* synthetic */ /* enum */ a BONE_SHARDS;
    public static final /* synthetic */ /* enum */ a GEM_ROCKS;
    public static final /* synthetic */ /* enum */ a ESSENCE;
    private static /* synthetic */ int[] lllllIIllIlI;
    public static final /* synthetic */ /* enum */ a VOLCANIC_ASH;
    public static final /* synthetic */ /* enum */ a MOTHERLODE_MINE;
    public static final /* synthetic */ /* enum */ a SUPERHEAT_MINE;
    public static final /* synthetic */ /* enum */ a DAEYALT;
    public static final /* synthetic */ /* enum */ a SANDSTONE;
    public static final /* synthetic */ /* enum */ a AMETHYST;
    private static /* synthetic */ String[] lllllIIllIIl;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ /* enum */ a GUILD_IRON;
    public static final /* synthetic */ /* enum */ a ARDY_IRON;

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    static {
        a.lIIlIIlIlllIlII();
        a.lIIlIIlIlllIIll();
        MOTHERLODE_MINE = new a(lllllIIllIIl[lllllIIllIlI[1]]);
        SANDSTONE = new a(lllllIIllIIl[lllllIIllIlI[3]]);
        GEM_ROCKS = new a(lllllIIllIIl[lllllIIllIlI[5]]);
        GUILD_IRON = new a(lllllIIllIIl[lllllIIllIlI[7]]);
        ARDY_IRON = new a(lllllIIllIIl[lllllIIllIlI[9]]);
        GRANITE = new a(lllllIIllIIl[lllllIIllIlI[11]]);
        AMETHYST = new a(lllllIIllIIl[lllllIIllIlI[13]]);
        VOLCANIC_ASH = new a(lllllIIllIIl[lllllIIllIlI[15]]);
        SUPERHEAT_MINE = new a(lllllIIllIIl[lllllIIllIlI[17]]);
        ESSENCE = new a(lllllIIllIIl[lllllIIllIlI[19]]);
        DAEYALT = new a(lllllIIllIIl[lllllIIllIlI[21]]);
        BONE_SHARDS = new a(lllllIIllIIl[lllllIIllIlI[23]]);
        a[] aArray = new a[lllllIIllIlI[12]];
        aArray[a.lllllIIllIlI[0]] = MOTHERLODE_MINE;
        aArray[a.lllllIIllIlI[1]] = SANDSTONE;
        aArray[a.lllllIIllIlI[2]] = GEM_ROCKS;
        aArray[a.lllllIIllIlI[3]] = GUILD_IRON;
        aArray[a.lllllIIllIlI[4]] = ARDY_IRON;
        aArray[a.lllllIIllIlI[5]] = GRANITE;
        aArray[a.lllllIIllIlI[6]] = AMETHYST;
        aArray[a.lllllIIllIlI[7]] = VOLCANIC_ASH;
        aArray[a.lllllIIllIlI[8]] = SUPERHEAT_MINE;
        aArray[a.lllllIIllIlI[9]] = ESSENCE;
        aArray[a.lllllIIllIlI[10]] = DAEYALT;
        aArray[a.lllllIIllIlI[11]] = BONE_SHARDS;
        $VALUES = aArray;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static void lIIlIIlIlllIlII() {
        lllllIIllIlI = new int[25];
        a.lllllIIllIlI[0] = (73 + 118 - 79 + 84 ^ 2 + 34 - -61 + 46) & (0x57 ^ 0x23 ^ (0x9E ^ 0xA1) ^ -1);
        a.lllllIIllIlI[1] = 1;
        a.lllllIIllIlI[2] = 2;
        a.lllllIIllIlI[3] = 3;
        a.lllllIIllIlI[4] = 0x9F ^ 0x9B;
        a.lllllIIllIlI[5] = 0x58 ^ 0x5D;
        a.lllllIIllIlI[6] = 0x8A ^ 0x8C;
        a.lllllIIllIlI[7] = 0xC ^ 0xB;
        a.lllllIIllIlI[8] = 157 + 23 - 19 + 28 ^ 143 + 8 - -19 + 11;
        a.lllllIIllIlI[9] = 2 ^ (0x1D ^ 0x16);
        a.lllllIIllIlI[10] = 0x6E ^ 0x12 ^ (0x38 ^ 0x4E);
        a.lllllIIllIlI[11] = 0x76 ^ 0x7D;
        a.lllllIIllIlI[12] = 98 + 137 - 162 + 70 ^ 48 + 27 - -25 + 31;
        a.lllllIIllIlI[13] = 0x42 ^ 0x7B ^ (0x4C ^ 0x78);
        a.lllllIIllIlI[14] = 149 + 76 - 200 + 127 ^ 145 + 121 - 119 + 3;
        a.lllllIIllIlI[15] = 0xA2 ^ 0xAD;
        a.lllllIIllIlI[16] = 0xAC ^ 0xBC;
        a.lllllIIllIlI[17] = 0x97 ^ 0x86;
        a.lllllIIllIlI[18] = 73 + 43 - -60 + 0 ^ 138 + 81 - 208 + 151;
        a.lllllIIllIlI[19] = 0x56 ^ 0x45;
        a.lllllIIllIlI[20] = 0x14 ^ 0x44 ^ (0xC7 ^ 0x83);
        a.lllllIIllIlI[21] = 0xA9 ^ 0xBC;
        a.lllllIIllIlI[22] = 0x57 ^ 0x41;
        a.lllllIIllIlI[23] = 0x72 ^ 0x65;
        a.lllllIIllIlI[24] = 0x48 ^ 0x50;
    }

    public String c() {
        return this.activityName;
    }

    private static void lIIlIIlIlllIIll() {
        lllllIIllIIl = new String[lllllIIllIlI[24]];
        a.lllllIIllIIl[a.lllllIIllIlI[0]] = a."MOTHERLODE_MINE";
        a.lllllIIllIIl[a.lllllIIllIlI[1]] = a."Motherlode_Mine";
        a.lllllIIllIIl[a.lllllIIllIlI[2]] = a."SANDSTONE";
        a.lllllIIllIIl[a.lllllIIllIlI[3]] = a."Sandstone";
        a.lllllIIllIIl[a.lllllIIllIlI[4]] = a."GEM_ROCKS";
        a.lllllIIllIIl[a.lllllIIllIlI[5]] = a."Gem rocks";
        a.lllllIIllIIl[a.lllllIIllIlI[6]] = a."GUILD_IRON";
        a.lllllIIllIIl[a.lllllIIllIlI[7]] = a."Guild iron";
        a.lllllIIllIIl[a.lllllIIllIlI[8]] = a."ARDY_IRON";
        a.lllllIIllIIl[a.lllllIIllIlI[9]] = a."Ardy iron (3t)";
        a.lllllIIllIIl[a.lllllIIllIlI[10]] = a."GRANITE";
        a.lllllIIllIIl[a.lllllIIllIlI[11]] = a."Granite";
        a.lllllIIllIIl[a.lllllIIllIlI[12]] = a."AMETHYST";
        a.lllllIIllIIl[a.lllllIIllIlI[13]] = a."Amethyst";
        a.lllllIIllIIl[a.lllllIIllIlI[14]] = a."VOLCANIC_ASH";
        a.lllllIIllIIl[a.lllllIIllIlI[15]] = a."Volcanic ash";
        a.lllllIIllIIl[a.lllllIIllIlI[16]] = a."SUPERHEAT_MINE";
        a.lllllIIllIIl[a.lllllIIllIlI[17]] = a."Superheat Mine";
        a.lllllIIllIIl[a.lllllIIllIlI[18]] = a."ESSENCE";
        a.lllllIIllIIl[a.lllllIIllIlI[19]] = a."Essence mine";
        a.lllllIIllIIl[a.lllllIIllIlI[20]] = a."DAEYALT";
        a.lllllIIllIIl[a.lllllIIllIlI[21]] = a."Daeyalt Essence";
        a.lllllIIllIIl[a.lllllIIllIlI[22]] = a."BONE_SHARDS";
        a.lllllIIllIIl[a.lllllIIllIlI[23]] = a."Bone shards";
    }

    private static String lIIlIIlIlllIIlI(String lllllllllllllllIIlIIlIlllIIllIII, String lllllllllllllllIIlIIlIlllIIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIlllIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlllIIllIIl.getBytes(StandardCharsets.UTF_8)), lllllIIllIlI[8]), "DES");
            Cipher lllllllllllllllIIlIIlIlllIIlllII = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIlllIIlllII.init(lllllIIllIlI[2], lllllllllllllllIIlIIlIlllIIlllIl);
            return new String(lllllllllllllllIIlIIlIlllIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlllIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIlllIIllIll) {
            lllllllllllllllIIlIIlIlllIIllIll.printStackTrace();
            return null;
        }
    }

    private a(String string2) {
        this.activityName = string2;
    }

    private static boolean lIIlIIlIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIlIlllIIIl(String lllllllllllllllIIlIIlIlllIlIIlIl, String lllllllllllllllIIlIIlIlllIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIlllIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIlllIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIlllIlIlIIl.init(lllllIIllIlI[2], lllllllllllllllIIlIIlIlllIlIlIlI);
            return new String(lllllllllllllllIIlIIlIlllIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIlllIlIlIII) {
            lllllllllllllllIIlIIlIlllIlIlIII.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlIlllIIII(String lllllllllllllllIIlIIlIlllIIIIlIl, String lllllllllllllllIIlIIlIlllIIIIlII) {
        lllllllllllllllIIlIIlIlllIIIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlllIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlIlllIIIlIII = new StringBuilder();
        char[] lllllllllllllllIIlIIlIlllIIIIlll = lllllllllllllllIIlIIlIlllIIIIlII.toCharArray();
        int lllllllllllllllIIlIIlIlllIIIIllI = lllllIIllIlI[0];
        char[] lllllllllllllllIIlIIlIlllIIIIIII = lllllllllllllllIIlIIlIlllIIIIlIl.toCharArray();
        int lllllllllllllllIIlIIlIllIlllllll = lllllllllllllllIIlIIlIlllIIIIIII.length;
        int lllllllllllllllIIlIIlIllIllllllI = lllllIIllIlI[0];
        while (a.lIIlIIlIlllIlIl(lllllllllllllllIIlIIlIllIllllllI, lllllllllllllllIIlIIlIllIlllllll)) {
            char lllllllllllllllIIlIIlIlllIIIlIll = lllllllllllllllIIlIIlIlllIIIIIII[lllllllllllllllIIlIIlIllIllllllI];
            lllllllllllllllIIlIIlIlllIIIlIII.append((char)(lllllllllllllllIIlIIlIlllIIIlIll ^ lllllllllllllllIIlIIlIlllIIIIlll[lllllllllllllllIIlIIlIlllIIIIllI % lllllllllllllllIIlIIlIlllIIIIlll.length]));
            0;
            ++lllllllllllllllIIlIIlIlllIIIIllI;
            ++lllllllllllllllIIlIIlIllIllllllI;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIlIlllIIIlIII);
    }
}

