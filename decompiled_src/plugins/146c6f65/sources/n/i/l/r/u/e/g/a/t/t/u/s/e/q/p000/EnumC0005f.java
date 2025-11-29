package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.f  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/f.class */
public final class EnumC0005f {
    public static final /* synthetic */ EnumC0005f TIER_1_LEGS;
    public static final /* synthetic */ EnumC0005f TIER_2_BOW;
    private static /* synthetic */ int[] llIIlIlllllI;
    public static final /* synthetic */ EnumC0005f TIER_1_BOW;
    public static final /* synthetic */ EnumC0005f TIER_1_STAFF;
    private final /* synthetic */ int normalItemId;
    public static final /* synthetic */ EnumC0005f TIER_2_STAFF;
    public static final /* synthetic */ EnumC0005f TIER_3_STAFF;
    private final /* synthetic */ Map<EnumC0008i, Integer> resourceList;
    public static final /* synthetic */ EnumC0005f TIER_1_HELM;
    private final /* synthetic */ String normalItemName;
    private static final /* synthetic */ EnumC0005f[] $VALUES;
    private final /* synthetic */ int corruptedItemId;
    public static final /* synthetic */ EnumC0005f TIER_1_BODY;
    public static final /* synthetic */ EnumC0005f TELEPORT_CRYSTAL;
    private final /* synthetic */ EnumC0005f upgradesFrom;
    private static /* synthetic */ String[] llIIlIllllIl;
    private final /* synthetic */ String corruptedItemName;
    public static final /* synthetic */ EnumC0005f VIAL;
    public static final /* synthetic */ EnumC0005f TIER_3_BOW;

    static {
        llllllIIllIIll();
        llllllIIIllIII();
        VIAL = new EnumC0005f(llIIlIllllIl[llIIlIlllllI[1]], llIIlIlllllI[1], llIIlIllllIl[llIIlIlllllI[2]], llIIlIlllllI[3], llIIlIllllIl[llIIlIlllllI[0]], llIIlIlllllI[3], null, Map.of(EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(llIIlIlllllI[4])));
        TELEPORT_CRYSTAL = new EnumC0005f(llIIlIllllIl[llIIlIlllllI[5]], llIIlIlllllI[2], llIIlIllllIl[llIIlIlllllI[6]], llIIlIlllllI[7], llIIlIllllIl[llIIlIlllllI[8]], llIIlIlllllI[9], null, Map.of(EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(llIIlIlllllI[10])));
        TIER_1_STAFF = new EnumC0005f(llIIlIllllIl[llIIlIlllllI[11]], llIIlIlllllI[0], llIIlIllllIl[llIIlIlllllI[12]], llIIlIlllllI[13], llIIlIllllIl[llIIlIlllllI[14]], llIIlIlllllI[15], null, Map.of(EnumC0008i.WEAPON_FRAME, Integer.valueOf(llIIlIlllllI[2]), EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(llIIlIlllllI[16])));
        TIER_2_STAFF = new EnumC0005f(llIIlIllllIl[llIIlIlllllI[17]], llIIlIlllllI[5], llIIlIllllIl[llIIlIlllllI[4]], llIIlIlllllI[18], llIIlIllllIl[llIIlIlllllI[19]], llIIlIlllllI[20], TIER_1_STAFF, Map.of(EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(llIIlIlllllI[21])));
        TIER_3_STAFF = new EnumC0005f(llIIlIllllIl[llIIlIlllllI[22]], llIIlIlllllI[6], llIIlIllllIl[llIIlIlllllI[23]], llIIlIlllllI[24], llIIlIllllIl[llIIlIlllllI[25]], llIIlIlllllI[26], TIER_2_STAFF, Map.of(EnumC0008i.CRYSTAL_ORB, Integer.valueOf(llIIlIlllllI[2])));
        TIER_1_BOW = new EnumC0005f(llIIlIllllIl[llIIlIlllllI[27]], llIIlIlllllI[8], llIIlIllllIl[llIIlIlllllI[28]], llIIlIlllllI[29], llIIlIllllIl[llIIlIlllllI[30]], llIIlIlllllI[31], null, Map.of(EnumC0008i.WEAPON_FRAME, Integer.valueOf(llIIlIlllllI[2]), EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(llIIlIlllllI[16])));
        TIER_2_BOW = new EnumC0005f(llIIlIllllIl[llIIlIlllllI[32]], llIIlIlllllI[11], llIIlIllllIl[llIIlIlllllI[33]], llIIlIlllllI[34], llIIlIllllIl[llIIlIlllllI[16]], llIIlIlllllI[35], TIER_1_BOW, Map.of(EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(llIIlIlllllI[21])));
        TIER_3_BOW = new EnumC0005f(llIIlIllllIl[llIIlIlllllI[36]], llIIlIlllllI[12], llIIlIllllIl[llIIlIlllllI[37]], llIIlIlllllI[38], llIIlIllllIl[llIIlIlllllI[39]], llIIlIlllllI[40], TIER_2_BOW, Map.of(EnumC0008i.CRYSTALLINE_BOWSTRING, Integer.valueOf(llIIlIlllllI[2])));
        TIER_1_HELM = new EnumC0005f(llIIlIllllIl[llIIlIlllllI[41]], llIIlIlllllI[14], llIIlIllllIl[llIIlIlllllI[42]], llIIlIlllllI[43], llIIlIllllIl[llIIlIlllllI[44]], llIIlIlllllI[45], null, Map.of(EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(llIIlIlllllI[10]), EnumC0008i.BARK, Integer.valueOf(llIIlIlllllI[2]), EnumC0008i.ORE, Integer.valueOf(llIIlIlllllI[2]), EnumC0008i.WOOL, Integer.valueOf(llIIlIlllllI[2])));
        TIER_1_BODY = new EnumC0005f(llIIlIllllIl[llIIlIlllllI[46]], llIIlIlllllI[17], llIIlIllllIl[llIIlIlllllI[47]], llIIlIlllllI[48], llIIlIllllIl[llIIlIlllllI[49]], llIIlIlllllI[50], null, Map.of(EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(llIIlIlllllI[10]), EnumC0008i.BARK, Integer.valueOf(llIIlIlllllI[2]), EnumC0008i.ORE, Integer.valueOf(llIIlIlllllI[2]), EnumC0008i.WOOL, Integer.valueOf(llIIlIlllllI[2])));
        TIER_1_LEGS = new EnumC0005f(llIIlIllllIl[llIIlIlllllI[51]], llIIlIlllllI[4], llIIlIllllIl[llIIlIlllllI[52]], llIIlIlllllI[53], llIIlIllllIl[llIIlIlllllI[54]], llIIlIlllllI[55], null, Map.of(EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(llIIlIlllllI[10]), EnumC0008i.BARK, Integer.valueOf(llIIlIlllllI[2]), EnumC0008i.ORE, Integer.valueOf(llIIlIlllllI[2]), EnumC0008i.WOOL, Integer.valueOf(llIIlIlllllI[2])));
        EnumC0005f[] enumC0005fArr = new EnumC0005f[llIIlIlllllI[19]];
        enumC0005fArr[llIIlIlllllI[1]] = VIAL;
        enumC0005fArr[llIIlIlllllI[2]] = TELEPORT_CRYSTAL;
        enumC0005fArr[llIIlIlllllI[0]] = TIER_1_STAFF;
        enumC0005fArr[llIIlIlllllI[5]] = TIER_2_STAFF;
        enumC0005fArr[llIIlIlllllI[6]] = TIER_3_STAFF;
        enumC0005fArr[llIIlIlllllI[8]] = TIER_1_BOW;
        enumC0005fArr[llIIlIlllllI[11]] = TIER_2_BOW;
        enumC0005fArr[llIIlIlllllI[12]] = TIER_3_BOW;
        enumC0005fArr[llIIlIlllllI[14]] = TIER_1_HELM;
        enumC0005fArr[llIIlIlllllI[17]] = TIER_1_BODY;
        enumC0005fArr[llIIlIlllllI[4]] = TIER_1_LEGS;
        $VALUES = enumC0005fArr;
    }

    private static String llllllIIIlIllI(String lllllllllllllllIlIIlIlllIIlIllIl, String lllllllllllllllIlIIlIlllIIlIllII) {
        String lllllllllllllllIlIIlIlllIIlIllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlllIIlIlIll = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlIlllIIlIllII.toCharArray();
        int lllllllllllllllIlIIlIlllIIlIlIIl = llIIlIlllllI[1];
        char[] charArray2 = lllllllllllllllIlIIlIlllIIlIllIl2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIlllllI[1];
        while (llllllIIllIlII(i, length)) {
            lllllllllllllllIlIIlIlllIIlIlIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIlIlllIIlIlIIl % charArray.length]));
            "".length();
            lllllllllllllllIlIIlIlllIIlIlIIl++;
            i++;
            "".length();
            if ((((226 ^ 174) ^ (84 ^ 8)) & (((137 ^ 164) ^ (95 ^ 98)) ^ (-" ".length()))) > ((165 ^ 132) ^ (151 ^ 178))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIlllIIlIlIll);
    }

    private static void llllllIIllIIll() {
        llIIlIlllllI = new int[57];
        llIIlIlllllI[0] = "  ".length();
        llIIlIlllllI[1] = (48 ^ 83) & ((5 ^ 102) ^ (-1));
        llIIlIlllllI[2] = " ".length();
        llIIlIlllllI[3] = (-8833) & 32711;
        llIIlIlllllI[4] = (((143 + 5) - 138) + 150) ^ (((38 + 148) - 72) + 56);
        llIIlIlllllI[5] = "   ".length();
        llIIlIlllllI[6] = 118 ^ 114;
        llIIlIlllllI[7] = (-8859) & 32762;
        llIIlIlllllI[8] = (((3 + 161) - 5) + 14) ^ (((33 + 81) - (-17)) + 37);
        llIIlIlllllI[9] = (-649) & 24506;
        llIIlIlllllI[10] = (187 ^ 129) ^ (23 ^ 5);
        llIIlIlllllI[11] = (45 ^ 69) ^ (87 ^ 57);
        llIIlIlllllI[12] = 99 ^ 100;
        llIIlIlllllI[13] = (-((-19875) & 20391)) & (-8226) & 32639;
        llIIlIlllllI[14] = (((81 + 13) - 48) + 87) ^ (((0 + 34) - (-88)) + 19);
        llIIlIlllllI[15] = (-8401) & 32252;
        llIIlIlllllI[16] = 106 ^ 126;
        llIIlIlllllI[17] = (((111 + 64) - 162) + 117) ^ (((3 + 2) - (-85)) + 49);
        llIIlIlllllI[18] = (-8705) & 32603;
        llIIlIlllllI[19] = (116 ^ 15) ^ (94 ^ 46);
        llIIlIlllllI[20] = (-67) & 23919;
        llIIlIlllllI[21] = 1 ^ 61;
        llIIlIlllllI[22] = 181 ^ 185;
        llIIlIlllllI[23] = 108 ^ 97;
        llIIlIlllllI[24] = (-(19 ^ 49)) & (-8193) & 32125;
        llIIlIlllllI[25] = 76 ^ 66;
        llIIlIlllllI[26] = (-8721) & 32574;
        llIIlIlllllI[27] = " ".length() ^ (98 ^ 108);
        llIIlIlllllI[28] = 166 ^ 182;
        llIIlIlllllI[29] = (-(((86 + 48) - 108) + 135)) & (-515) & 24575;
        llIIlIlllllI[30] = 146 ^ 131;
        llIIlIlllllI[31] = (-8209) & 32063;
        llIIlIlllllI[32] = (((156 + 61) - 57) + 23) ^ (((143 + 70) - 211) + 163);
        llIIlIlllllI[33] = 98 ^ 113;
        llIIlIlllllI[34] = (-((-17425) & 25649)) & (-1) & 32126;
        llIIlIlllllI[35] = (-((-5125) & 13903)) & (-5) & 32638;
        llIIlIlllllI[36] = 81 ^ 68;
        llIIlIlllllI[37] = (((21 + 63) - 13) + 101) ^ (((116 + 7) - (-41)) + 22);
        llIIlIlllllI[38] = (-((-5853) & 14077)) & (-129) & 32255;
        llIIlIlllllI[39] = 139 ^ 156;
        llIIlIlllllI[40] = (-8713) & 32569;
        llIIlIlllllI[41] = 219 ^ 195;
        llIIlIlllllI[42] = 15 ^ 22;
        llIIlIlllllI[43] = (-((-6229) & 6742)) & (-8321) & 32719;
        llIIlIlllllI[44] = 7 ^ 29;
        llIIlIlllllI[45] = (-8346) & 32185;
        llIIlIlllllI[46] = 48 ^ 43;
        llIIlIlllllI[47] = 16 ^ 12;
        llIIlIlllllI[48] = (-(205 ^ 194)) & (-8193) & 32095;
        llIIlIlllllI[49] = (62 ^ 108) ^ (77 ^ 2);
        llIIlIlllllI[50] = (-8345) & 32187;
        llIIlIlllllI[51] = 4 ^ 26;
        llIIlIlllllI[52] = (((83 + 105) - 158) + 138) ^ (((45 + 52) - 91) + 177);
        llIIlIlllllI[53] = (-(((51 + 36) - 86) + 138)) & (-514) & 24543;
        llIIlIlllllI[54] = 12 ^ 44;
        llIIlIlllllI[55] = (-((-22529) & 31369)) & (-81) & 32766;
        llIIlIlllllI[56] = (126 ^ 113) ^ (120 ^ 86);
    }

    public static EnumC0005f valueOf(String str) {
        return (EnumC0005f) Enum.valueOf(EnumC0005f.class, str);
    }

    public int[] ad() {
        int[] iArr = new int[llIIlIlllllI[0]];
        iArr[llIIlIlllllI[1]] = this.normalItemId;
        iArr[llIIlIlllllI[2]] = this.corruptedItemId;
        return iArr;
    }

    private static String llllllIIIlIlIl(String lllllllllllllllIlIIlIlllIIIIlIll, String lllllllllllllllIlIIlIlllIIIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIIIIlIlI.getBytes(StandardCharsets.UTF_8)), llIIlIlllllI[14]), "DES");
            Cipher lllllllllllllllIlIIlIlllIIIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlllIIIIllIl.init(llIIlIlllllI[0], secretKeySpec);
            return new String(lllllllllllllllIlIIlIlllIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlllIIIIllII) {
            lllllllllllllllIlIIlIlllIIIIllII.printStackTrace();
            return null;
        }
    }

    public List<String> ae() {
        return List.of(this.normalItemName, this.corruptedItemName);
    }

    private static boolean llllllIIllIlII(int i, int i2) {
        return i < i2;
    }

    public Map<EnumC0008i, Integer> ag() {
        return this.resourceList;
    }

    private static void llllllIIIllIII() {
        llIIlIllllIl = new String[llIIlIlllllI[56]];
        llIIlIllllIl[llIIlIlllllI[1]] = llllllIIIlIlIl("Iu/F0TrLBoc=", "levJa");
        llIIlIllllIl[llIIlIlllllI[2]] = llllllIIIlIllI("LB0YGw==", "ztywM");
        llIIlIllllIl[llIIlIlllllI[0]] = llllllIIIlIlIl("Zp5g9/YWf9o=", "fyvUA");
        llIIlIllllIl[llIIlIlllllI[5]] = llllllIIIlIllI("Oi4VJwMhOQ09EDwyCjYSIg==", "nkYbS");
        llIIlIllllIl[llIIlIlllllI[6]] = llllllIIIlIllI("JBMiPSofBDp4OQIPPSw7HA==", "pvNXZ");
        llIIlIllllIl[llIIlIlllllI[8]] = llllllIIIlIllI("IjwFATMRJxIXZhU2GxY2DiEDUyUTKgQHJw0=", "aSwsF");
        llIIlIllllIl[llIIlIlllllI[11]] = llllllIIIlIllI("AD8iPillKTQ4NxIw", "Tvglv");
        llIIlIllllIl[llIIlIlllllI[12]] = llllllIIIlIlll("a8IqummQTFUqKZPhWjwdk8X7bGEtR7Q2", "bcYjU");
        llIIlIllllIl[llIIlIlllllI[14]] = llllllIIIlIllI("KhwdFD0ZBwoCaBoHDgAuSVsNBzsAEEY=", "isofH");
        llIIlIllllIl[llIIlIlllllI[17]] = llllllIIIlIllI("ACUkIzVmMzIlKxIq", "Tlaqj");
        llIIlIllllIl[llIIlIlllllI[4]] = llllllIIIlIlIl("89XvlB3f6C5td8XsVYOkd9TKA4zrK3l0", "jOwka");
        llIIlIllllIl[llIIlIlllllI[19]] = llllllIIIlIllI("JgQHARMVHxAXRhYfFBUARUMUBxIQBRAXTw==", "ekusf");
        llIIlIllllIl[llIIlIlllllI[22]] = llllllIIIlIllI("FRwhHDJyCjcaLAcT", "AUdNm");
        llIIlIllllIl[llIIlIlllllI[23]] = llllllIIIlIlll("6WFWcI5CPQ5mpyKOQ55HTU9sa6lzB7JFlW5OPSUGJTc=", "NKREL");
        llIIlIllllIl[llIIlIlllllI[25]] = llllllIIIlIllI("GjsQHg0pIAcIWCogAwoeeXwSCQo/MQEYHT19", "YTblx");
        llIIlIllllIl[llIIlIlllllI[27]] = llllllIIIlIlIl("cSIQsDEMclI8P3Uyp7ovGw==", "tvnVV");
        llIIlIllllIl[llIIlIlllllI[28]] = llllllIIIlIlIl("sQQB3AKTr7//9y2BMR5Kb2UwLwqraGrL", "CsjXi");
        llIIlIllllIl[llIIlIlllllI[30]] = llllllIIIlIlll("RPqSlSSPTqQbhK8Xu3maYk1IA9VDCuCQ", "FHSZJ");
        llIIlIllllIl[llIIlIlllllI[32]] = llllllIIIlIlll("P1hxC0KfvJtGUEMaTLaMKg==", "pgITM");
        llIIlIllllIl[llIIlIlllllI[33]] = llllllIIIlIlll("jGXlY3P0CgfcU9GmmE751aCfHnFa9WYX", "eUElL");
        llIIlIllllIl[llIIlIlllllI[16]] = llllllIIIlIlll("q7RQfI+Wdmqf6EFRMsYUDNeSaq8mXxKa", "Fiyxg");
        llIIlIllllIl[llIIlIlllllI[36]] = llllllIIIlIlIl("7+ylXeSg776W3EG7sSqABg==", "ETKxZ");
        llIIlIllllIl[llIIlIlllllI[37]] = llllllIIIlIlIl("iXQSonRyUmBCexQPaiUXMCr+6wzaExjI", "EVeLh");
        llIIlIllllIl[llIIlIlllllI[39]] = llllllIIIlIlll("jpRWWqHwDGBiEg6DZ9H8nRZ3WGn+Nq/VUbC3chvTCNU=", "RMPvH");
        llIIlIllllIl[llIIlIlllllI[41]] = llllllIIIlIlIl("w7MnLBZUMfIgZ6CFmuklSQ==", "YDRbl");
        llIIlIllllIl[llIIlIlllllI[42]] = llllllIIIlIlll("np2gsZ9BYAOKKsVRVcP4P9lOyy3yHg7S", "tbKgs");
        llIIlIllllIl[llIIlIlllllI[44]] = llllllIIIlIllI("JRkjJD4WAjQyaw4TPTtrThQwJSIFXw==", "fvQVK");
        llIIlIllllIl[llIIlIlllllI[46]] = llllllIIIlIllI("IwoRBChGHBYZMy4=", "wCTVw");
        llIIlIllllIl[llIIlIlllllI[47]] = llllllIIIlIlIl("+J3E58BpjTUQJX99EnuQg93RWptYl1xe", "OElmU");
        llIIlIllllIl[llIIlIlllllI[49]] = llllllIIIlIllI("KBgaCjMbAw0cZgkYDAFmQxUJCy8IXg==", "kwhxF");
        llIIlIllllIl[llIIlIlllllI[51]] = llllllIIIlIlll("0cLj535qk1/qoqHF70QkSw==", "PfRcj");
        llIIlIllllIl[llIIlIlllllI[52]] = llllllIIIlIlll("BnjGMitLABMz7rTK8RcLmvuvY7VXzEgW", "FKiEN");
        llIIlIllllIl[llIIlIlllllI[54]] = llllllIIIlIlIl("8psZIliSAq/7x+1HinfOGJLQydGg3WAD", "UzMzN");
    }

    public static EnumC0005f[] values() {
        return (EnumC0005f[]) $VALUES.clone();
    }

    public EnumC0005f af() {
        return this.upgradesFrom;
    }

    private EnumC0005f(String str, int i, String str2, int i2, String str3, int i3, EnumC0005f enumC0005f, Map map) {
        this.normalItemName = str2;
        this.normalItemId = i2;
        this.corruptedItemName = str3;
        this.corruptedItemId = i3;
        this.upgradesFrom = enumC0005f;
        this.resourceList = map;
    }

    public List<Integer> ac() {
        return List.of(Integer.valueOf(this.normalItemId), Integer.valueOf(this.corruptedItemId));
    }

    private static String llllllIIIlIlll(String lllllllllllllllIlIIlIlllIIIlIllI, String lllllllllllllllIlIIlIlllIIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlllIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlllIIIllIlI.init(llIIlIlllllI[0], lllllllllllllllIlIIlIlllIIIllIll);
            return new String(lllllllllllllllIlIIlIlllIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlllIIIllIIl) {
            lllllllllllllllIlIIlIlllIIIllIIl.printStackTrace();
            return null;
        }
    }
}
