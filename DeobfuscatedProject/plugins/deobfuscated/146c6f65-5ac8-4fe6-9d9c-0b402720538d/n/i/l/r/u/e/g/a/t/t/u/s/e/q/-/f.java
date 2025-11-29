/*
 * Decompiled with CFR 0.152.
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;

public final class f
extends Enum<f> {
    public static final /* synthetic */ /* enum */ f TIER_1_LEGS;
    public static final /* synthetic */ /* enum */ f TIER_2_BOW;
    private static /* synthetic */ int[] llIIlIlllllI;
    public static final /* synthetic */ /* enum */ f TIER_1_BOW;
    public static final /* synthetic */ /* enum */ f TIER_1_STAFF;
    private final /* synthetic */ int normalItemId;
    public static final /* synthetic */ /* enum */ f TIER_2_STAFF;
    public static final /* synthetic */ /* enum */ f TIER_3_STAFF;
    private final /* synthetic */ Map<i, Integer> resourceList;
    public static final /* synthetic */ /* enum */ f TIER_1_HELM;
    private final /* synthetic */ String normalItemName;
    private static final /* synthetic */ f[] $VALUES;
    private final /* synthetic */ int corruptedItemId;
    public static final /* synthetic */ /* enum */ f TIER_1_BODY;
    public static final /* synthetic */ /* enum */ f TELEPORT_CRYSTAL;
    private final /* synthetic */ f upgradesFrom;
    private static /* synthetic */ String[] llIIlIllllIl;
    private final /* synthetic */ String corruptedItemName;
    public static final /* synthetic */ /* enum */ f VIAL;
    public static final /* synthetic */ /* enum */ f TIER_3_BOW;

    static {
        f.llllllIIllIIll();
        f.llllllIIIllIII();
        VIAL = new f(llIIlIllllIl[llIIlIlllllI[2]], llIIlIlllllI[3], llIIlIllllIl[llIIlIlllllI[0]], llIIlIlllllI[3], null, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[4]));
        TELEPORT_CRYSTAL = new f(llIIlIllllIl[llIIlIlllllI[6]], llIIlIlllllI[7], llIIlIllllIl[llIIlIlllllI[8]], llIIlIlllllI[9], null, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[10]));
        TIER_1_STAFF = new f(llIIlIllllIl[llIIlIlllllI[12]], llIIlIlllllI[13], llIIlIllllIl[llIIlIlllllI[14]], llIIlIlllllI[15], null, Map.of(i.WEAPON_FRAME, llIIlIlllllI[2], i.CRYSTAL_SHARD, llIIlIlllllI[16]));
        TIER_2_STAFF = new f(llIIlIllllIl[llIIlIlllllI[4]], llIIlIlllllI[18], llIIlIllllIl[llIIlIlllllI[19]], llIIlIlllllI[20], TIER_1_STAFF, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[21]));
        TIER_3_STAFF = new f(llIIlIllllIl[llIIlIlllllI[23]], llIIlIlllllI[24], llIIlIllllIl[llIIlIlllllI[25]], llIIlIlllllI[26], TIER_2_STAFF, Map.of(i.CRYSTAL_ORB, llIIlIlllllI[2]));
        TIER_1_BOW = new f(llIIlIllllIl[llIIlIlllllI[28]], llIIlIlllllI[29], llIIlIllllIl[llIIlIlllllI[30]], llIIlIlllllI[31], null, Map.of(i.WEAPON_FRAME, llIIlIlllllI[2], i.CRYSTAL_SHARD, llIIlIlllllI[16]));
        TIER_2_BOW = new f(llIIlIllllIl[llIIlIlllllI[33]], llIIlIlllllI[34], llIIlIllllIl[llIIlIlllllI[16]], llIIlIlllllI[35], TIER_1_BOW, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[21]));
        TIER_3_BOW = new f(llIIlIllllIl[llIIlIlllllI[37]], llIIlIlllllI[38], llIIlIllllIl[llIIlIlllllI[39]], llIIlIlllllI[40], TIER_2_BOW, Map.of(i.CRYSTALLINE_BOWSTRING, llIIlIlllllI[2]));
        TIER_1_HELM = new f(llIIlIllllIl[llIIlIlllllI[42]], llIIlIlllllI[43], llIIlIllllIl[llIIlIlllllI[44]], llIIlIlllllI[45], null, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[10], i.BARK, llIIlIlllllI[2], i.ORE, llIIlIlllllI[2], i.WOOL, llIIlIlllllI[2]));
        TIER_1_BODY = new f(llIIlIllllIl[llIIlIlllllI[47]], llIIlIlllllI[48], llIIlIllllIl[llIIlIlllllI[49]], llIIlIlllllI[50], null, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[10], i.BARK, llIIlIlllllI[2], i.ORE, llIIlIlllllI[2], i.WOOL, llIIlIlllllI[2]));
        TIER_1_LEGS = new f(llIIlIllllIl[llIIlIlllllI[52]], llIIlIlllllI[53], llIIlIllllIl[llIIlIlllllI[54]], llIIlIlllllI[55], null, Map.of(i.CRYSTAL_SHARD, llIIlIlllllI[10], i.BARK, llIIlIlllllI[2], i.ORE, llIIlIlllllI[2], i.WOOL, llIIlIlllllI[2]));
        f[] fArray = new f[llIIlIlllllI[19]];
        fArray[f.llIIlIlllllI[1]] = VIAL;
        fArray[f.llIIlIlllllI[2]] = TELEPORT_CRYSTAL;
        fArray[f.llIIlIlllllI[0]] = TIER_1_STAFF;
        fArray[f.llIIlIlllllI[5]] = TIER_2_STAFF;
        fArray[f.llIIlIlllllI[6]] = TIER_3_STAFF;
        fArray[f.llIIlIlllllI[8]] = TIER_1_BOW;
        fArray[f.llIIlIlllllI[11]] = TIER_2_BOW;
        fArray[f.llIIlIlllllI[12]] = TIER_3_BOW;
        fArray[f.llIIlIlllllI[14]] = TIER_1_HELM;
        fArray[f.llIIlIlllllI[17]] = TIER_1_BODY;
        fArray[f.llIIlIlllllI[4]] = TIER_1_LEGS;
        $VALUES = fArray;
    }

    private static String llllllIIIlIllI(String lllllllllllllllIlIIlIlllIIlIlIII, String lllllllllllllllIlIIlIlllIIlIllII) {
        lllllllllllllllIlIIlIlllIIlIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlllIIlIlIll = new StringBuilder();
        char[] lllllllllllllllIlIIlIlllIIlIlIlI = lllllllllllllllIlIIlIlllIIlIllII.toCharArray();
        int lllllllllllllllIlIIlIlllIIlIlIIl = llIIlIlllllI[1];
        char[] lllllllllllllllIlIIlIlllIIlIIIll = lllllllllllllllIlIIlIlllIIlIlIII.toCharArray();
        int lllllllllllllllIlIIlIlllIIlIIIlI = lllllllllllllllIlIIlIlllIIlIIIll.length;
        int lllllllllllllllIlIIlIlllIIlIIIIl = llIIlIlllllI[1];
        while (f.llllllIIllIlII(lllllllllllllllIlIIlIlllIIlIIIIl, lllllllllllllllIlIIlIlllIIlIIIlI)) {
            char lllllllllllllllIlIIlIlllIIlIlllI = lllllllllllllllIlIIlIlllIIlIIIll[lllllllllllllllIlIIlIlllIIlIIIIl];
            lllllllllllllllIlIIlIlllIIlIlIll.append((char)(lllllllllllllllIlIIlIlllIIlIlllI ^ lllllllllllllllIlIIlIlllIIlIlIlI[lllllllllllllllIlIIlIlllIIlIlIIl % lllllllllllllllIlIIlIlllIIlIlIlI.length]));
            0;
            ++lllllllllllllllIlIIlIlllIIlIlIIl;
            ++lllllllllllllllIlIIlIlllIIlIIIIl;
            0;
            if (((0xE2 ^ 0xAE ^ (0x54 ^ 8)) & (0x89 ^ 0xA4 ^ (0x5F ^ 0x62) ^ -1)) <= (0xA5 ^ 0x84 ^ (0x97 ^ 0xB2))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIlllIIlIlIll);
    }

    private static void llllllIIllIIll() {
        llIIlIlllllI = new int[57];
        f.llIIlIlllllI[0] = 2;
        f.llIIlIlllllI[1] = (0x30 ^ 0x53) & ~(5 ^ 0x66);
        f.llIIlIlllllI[2] = 1;
        f.llIIlIlllllI[3] = 0xFFFFDD7F & 0x7FC7;
        f.llIIlIlllllI[4] = 143 + 5 - 138 + 150 ^ 38 + 148 - 72 + 56;
        f.llIIlIlllllI[5] = 3;
        f.llIIlIlllllI[6] = 0x76 ^ 0x72;
        f.llIIlIlllllI[7] = 0xFFFFDD65 & 0x7FFA;
        f.llIIlIlllllI[8] = 3 + 161 - 5 + 14 ^ 33 + 81 - -17 + 37;
        f.llIIlIlllllI[9] = 0xFFFFFD77 & 0x5FBA;
        f.llIIlIlllllI[10] = 0xBB ^ 0x81 ^ (0x17 ^ 5);
        f.llIIlIlllllI[11] = 0x2D ^ 0x45 ^ (0x57 ^ 0x39);
        f.llIIlIlllllI[12] = 0x63 ^ 0x64;
        f.llIIlIlllllI[13] = -(0xFFFFB25D & 0x4FA7) & (0xFFFFDFDE & 0x7F7F);
        f.llIIlIlllllI[14] = 81 + 13 - 48 + 87 ^ 0 + 34 - -88 + 19;
        f.llIIlIlllllI[15] = 0xFFFFDF2F & 0x7DFC;
        f.llIIlIlllllI[16] = 0x6A ^ 0x7E;
        f.llIIlIlllllI[17] = 111 + 64 - 162 + 117 ^ 3 + 2 - -85 + 49;
        f.llIIlIlllllI[18] = 0xFFFFDDFF & 0x7F5B;
        f.llIIlIlllllI[19] = 0x74 ^ 0xF ^ (0x5E ^ 0x2E);
        f.llIIlIlllllI[20] = 0xFFFFFFBD & 0x5D6F;
        f.llIIlIlllllI[21] = 1 ^ 0x3D;
        f.llIIlIlllllI[22] = 0xB5 ^ 0xB9;
        f.llIIlIlllllI[23] = 0x6C ^ 0x61;
        f.llIIlIlllllI[24] = -(0x13 ^ 0x31) & (0xFFFFDFFF & 0x7D7D);
        f.llIIlIlllllI[25] = 0x4C ^ 0x42;
        f.llIIlIlllllI[26] = 0xFFFFDDEF & 0x7F3E;
        f.llIIlIlllllI[27] = 1 ^ (0x62 ^ 0x6C);
        f.llIIlIlllllI[28] = 0xA6 ^ 0xB6;
        f.llIIlIlllllI[29] = -(86 + 48 - 108 + 135) & (0xFFFFFDFD & 0x5FFF);
        f.llIIlIlllllI[30] = 0x92 ^ 0x83;
        f.llIIlIlllllI[31] = 0xFFFFDFEF & 0x7D3F;
        f.llIIlIlllllI[32] = 156 + 61 - 57 + 23 ^ 143 + 70 - 211 + 163;
        f.llIIlIlllllI[33] = 0x62 ^ 0x71;
        f.llIIlIlllllI[34] = -(0xFFFFBBEF & 0x6431) & (0xFFFFFFFF & 0x7D7E);
        f.llIIlIlllllI[35] = -(0xFFFFEBFB & 0x364F) & (0xFFFFFFFB & 0x7F7E);
        f.llIIlIlllllI[36] = 0x51 ^ 0x44;
        f.llIIlIlllllI[37] = 21 + 63 - 13 + 101 ^ 116 + 7 - -41 + 22;
        f.llIIlIlllllI[38] = -(0xFFFFE923 & 0x36FD) & (0xFFFFFF7F & 0x7DFF);
        f.llIIlIlllllI[39] = 0x8B ^ 0x9C;
        f.llIIlIlllllI[40] = 0xFFFFDDF7 & 0x7F39;
        f.llIIlIlllllI[41] = 0xDB ^ 0xC3;
        f.llIIlIlllllI[42] = 0xF ^ 0x16;
        f.llIIlIlllllI[43] = -(0xFFFFE7AB & 0x1A56) & (0xFFFFDF7F & 0x7FCF);
        f.llIIlIlllllI[44] = 7 ^ 0x1D;
        f.llIIlIlllllI[45] = 0xFFFFDF66 & 0x7DB9;
        f.llIIlIlllllI[46] = 0x30 ^ 0x2B;
        f.llIIlIlllllI[47] = 0x10 ^ 0xC;
        f.llIIlIlllllI[48] = -(0xCD ^ 0xC2) & (0xFFFFDFFF & 0x7D5F);
        f.llIIlIlllllI[49] = 0x3E ^ 0x6C ^ (0x4D ^ 2);
        f.llIIlIlllllI[50] = 0xFFFFDF67 & 0x7DBB;
        f.llIIlIlllllI[51] = 4 ^ 0x1A;
        f.llIIlIlllllI[52] = 83 + 105 - 158 + 138 ^ 45 + 52 - 91 + 177;
        f.llIIlIlllllI[53] = -(51 + 36 - 86 + 138) & (0xFFFFFDFE & 0x5FDF);
        f.llIIlIlllllI[54] = 0xC ^ 0x2C;
        f.llIIlIlllllI[55] = -(0xFFFFA7FF & 0x7A89) & (0xFFFFFFAF & 0x7FFE);
        f.llIIlIlllllI[56] = 0x7E ^ 0x71 ^ (0x78 ^ 0x56);
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public int[] ad() {
        int[] nArray = new int[llIIlIlllllI[0]];
        nArray[f.llIIlIlllllI[1]] = this.normalItemId;
        nArray[f.llIIlIlllllI[2]] = this.corruptedItemId;
        return nArray;
    }

    private static String llllllIIIlIlIl(String lllllllllllllllIlIIlIlllIIIIlIIl, String lllllllllllllllIlIIlIlllIIIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIIIIlIII.getBytes(StandardCharsets.UTF_8)), llIIlIlllllI[14]), "DES");
            Cipher lllllllllllllllIlIIlIlllIIIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlllIIIIllIl.init(llIIlIlllllI[0], lllllllllllllllIlIIlIlllIIIIlllI);
            return new String(lllllllllllllllIlIIlIlllIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlllIIIIllII) {
            lllllllllllllllIlIIlIlllIIIIllII.printStackTrace();
            return null;
        }
    }

    public List<String> ae() {
        return List.of(this.normalItemName, this.corruptedItemName);
    }

    private static boolean llllllIIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    public Map<i, Integer> ag() {
        return this.resourceList;
    }

    private static void llllllIIIllIII() {
        llIIlIllllIl = new String[llIIlIlllllI[56]];
        f.llIIlIllllIl[f.llIIlIlllllI[1]] = f."VIAL";
        f.llIIlIllllIl[f.llIIlIlllllI[2]] = f."Vial";
        f.llIIlIllllIl[f.llIIlIlllllI[0]] = f."Vial";
        f.llIIlIllllIl[f.llIIlIlllllI[5]] = f."TELEPORT_CRYSTAL";
        f.llIIlIllllIl[f.llIIlIlllllI[6]] = f."Teleport crystal";
        f.llIIlIllllIl[f.llIIlIlllllI[8]] = f."Corrupted teleport crystal";
        f.llIIlIllllIl[f.llIIlIlllllI[11]] = f."TIER_1_STAFF";
        f.llIIlIllllIl[f.llIIlIlllllI[12]] = f."Crystal staff (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[14]] = f."Corrupted staff (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[17]] = f."TIER_2_STAFF";
        f.llIIlIllllIl[f.llIIlIlllllI[4]] = f."Crystal staff (attuned)";
        f.llIIlIllllIl[f.llIIlIlllllI[19]] = f."Corrupted staff (attuned)";
        f.llIIlIllllIl[f.llIIlIlllllI[22]] = f."TIER_3_STAFF";
        f.llIIlIllllIl[f.llIIlIlllllI[23]] = f."Crystal staff (perfected)";
        f.llIIlIllllIl[f.llIIlIlllllI[25]] = f."Corrupted staff (perfected)";
        f.llIIlIllllIl[f.llIIlIlllllI[27]] = f."TIER_1_BOW";
        f.llIIlIllllIl[f.llIIlIlllllI[28]] = f."Crystal bow (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[30]] = f."Corrupted bow (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[32]] = f."TIER_2_BOW";
        f.llIIlIllllIl[f.llIIlIlllllI[33]] = f."Crystal bow (attuned)";
        f.llIIlIllllIl[f.llIIlIlllllI[16]] = f."Corrupted bow (attuned)";
        f.llIIlIllllIl[f.llIIlIlllllI[36]] = f."TIER_3_BOW";
        f.llIIlIllllIl[f.llIIlIlllllI[37]] = f."Crystal bow (perfected)";
        f.llIIlIllllIl[f.llIIlIlllllI[39]] = f."Corrupted bow (perfected)";
        f.llIIlIllllIl[f.llIIlIlllllI[41]] = f."TIER_1_HELM";
        f.llIIlIllllIl[f.llIIlIlllllI[42]] = f."Crystal helm (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[44]] = f."Corrupted helm (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[46]] = f."TIER_1_BODY";
        f.llIIlIllllIl[f.llIIlIlllllI[47]] = f."Crystal body (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[49]] = f."Corrupted body (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[51]] = f."TIER_1_LEGS";
        f.llIIlIllllIl[f.llIIlIlllllI[52]] = f."Crystal legs (basic)";
        f.llIIlIllllIl[f.llIIlIlllllI[54]] = f."Corrupted legs (basic)";
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    public f af() {
        return this.upgradesFrom;
    }

    private f(String string2, int n3, String string3, int n4, f f2, Map<i, Integer> map) {
        this.normalItemName = string2;
        this.normalItemId = n3;
        this.corruptedItemName = string3;
        this.corruptedItemId = n4;
        this.upgradesFrom = f2;
        this.resourceList = map;
    }

    public List<Integer> ac() {
        return List.of(Integer.valueOf(this.normalItemId), Integer.valueOf(this.corruptedItemId));
    }

    private static String llllllIIIlIlll(String lllllllllllllllIlIIlIlllIIIllIII, String lllllllllllllllIlIIlIlllIIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlllIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlllIIIllIlI.init(llIIlIlllllI[0], lllllllllllllllIlIIlIlllIIIllIll);
            return new String(lllllllllllllllIlIIlIlllIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlllIIIllIIl) {
            lllllllllllllllIlIIlIlllIIIllIIl.printStackTrace();
            return null;
        }
    }
}

