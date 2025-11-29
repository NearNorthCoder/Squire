/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Predicates
 */
package i.i.-.h.u.s.e.r.q.r.s.f.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;

public final class f
extends Enum<f> {
    public static final /* synthetic */ /* enum */ f FLY_FISHING;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ f KARAMBWAN;
    public static final /* synthetic */ /* enum */ f BASS;
    public static final /* synthetic */ /* enum */ f MACKEREL;
    public static final /* synthetic */ /* enum */ f BARBARIAN_FISHING;
    public static final /* synthetic */ /* enum */ f COD;
    public static final /* synthetic */ /* enum */ f LOBSTER;
    public static final /* synthetic */ /* enum */ f TUNA;
    public static final /* synthetic */ /* enum */ f MONKFISH;
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ /* enum */ f HOUSE_KEY;
    public static final /* synthetic */ /* enum */ f SHRIMP;
    public static final /* synthetic */ /* enum */ f SARDINE;
    public static final /* synthetic */ /* enum */ f SHARKS;
    private static /* synthetic */ String[] lIlllIllllll;
    private final /* synthetic */ int fishNpcId;
    private final /* synthetic */ Predicate<Item> baitPredicate;
    public static final /* synthetic */ /* enum */ f SWORDFISH;
    private final /* synthetic */ int[] fishId;
    public static final /* synthetic */ /* enum */ f MINNOWS;
    private static /* synthetic */ int[] lIllllIIIIII;
    private final /* synthetic */ String[] action;
    private final /* synthetic */ int fishingLevelRequired;
    public static final /* synthetic */ /* enum */ f KARAMBWANJI;
    private final /* synthetic */ Predicate<Item> toolPredicate;
    public static final /* synthetic */ /* enum */ f PIKE;
    public static final /* synthetic */ /* enum */ f ANGLERFISH;

    private static String lllIllIIIllIIl(String var11, String var2) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var2.toCharArray();
        int var16 = lIllllIIIIII[1];
        char[] var12 = var11.toCharArray();
        int var6 = var12.length;
        int var9 = lIllllIIIIII[1];
        while (f.lllIllIIIllllI(var9, var6)) {
            char var14 = var12[var9];
            var4.append((char)(var14 ^ var5[var16 % var5.length]));
            0;
            ++var16;
            ++var9;
            0;
            if (((0x64 ^ 0x69 ^ (0xC7 ^ 0x9E)) & (0x3B ^ 0xA ^ (0x4C ^ 0x29) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    public String h() {
        return this.name;
    }

    public Predicate<Item> k() {
        return this.toolPredicate;
    }

    public Predicate<Item> l() {
        return this.baitPredicate;
    }

    private static String lllIllIIIllIlI(String var19, String var17) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIllllIIIIII[5], var13);
            return new String(var3.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public int m() {
        return this.fishNpcId;
    }

    private f(String string2, int n2, int[] nArray, Predicate<Item> predicate, Predicate<Item> predicate2, String ... stringArray) {
        this.name = string2;
        this.fishingLevelRequired = n2;
        this.fishId = nArray;
        this.toolPredicate = predicate;
        this.baitPredicate = predicate2;
        this.action = stringArray;
        this.fishNpcId = lIllllIIIIII[2];
    }

    static {
        f.lllIllIIIlllII();
        f.lllIllIIIllIll();
        int[] nArray = new int[lIllllIIIIII[5]];
        nArray[f.lIllllIIIIII[1]] = lIllllIIIIII[16];
        nArray[f.lIllllIIIIII[0]] = lIllllIIIIII[17];
        String[] stringArray = new String[lIllllIIIIII[5]];
        stringArray[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[19]];
        stringArray[f.lIllllIIIIII[0]] = lIlllIllllll[lIllllIIIIII[20]];
        SHRIMP = new f(lIlllIllllll[lIllllIIIIII[15]], lIllllIIIIII[0], nArray, lIllllIIIIII[18], stringArray);
        int[] nArray2 = new int[lIllllIIIIII[0]];
        nArray2[f.lIllllIIIIII[1]] = lIllllIIIIII[23];
        String[] stringArray2 = new String[lIllllIIIIII[0]];
        stringArray2[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[24]];
        SARDINE = new f(lIlllIllllll[lIllllIIIIII[22]], lIllllIIIIII[10], nArray2, lIllllIIIIII[4], lIllllIIIIII[11], stringArray2);
        int[] nArray3 = new int[lIllllIIIIII[0]];
        nArray3[f.lIllllIIIIII[1]] = lIllllIIIIII[6];
        String[] stringArray3 = new String[lIllllIIIIII[0]];
        stringArray3[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[27]];
        KARAMBWANJI = new f(lIlllIllllll[lIllllIIIIII[26]], lIllllIIIIII[10], nArray3, lIllllIIIIII[18], stringArray3);
        int[] nArray4 = new int[lIllllIIIIII[0]];
        nArray4[f.lIllllIIIIII[1]] = lIllllIIIIII[30];
        String[] stringArray4 = new String[lIllllIIIIII[0]];
        stringArray4[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[32]];
        MACKEREL = new f(lIlllIllllll[lIllllIIIIII[29]], lIllllIIIIII[26], nArray4, lIllllIIIIII[31], stringArray4);
        int[] nArray5 = new int[lIllllIIIIII[5]];
        nArray5[f.lIllllIIIIII[1]] = lIllllIIIIII[35];
        nArray5[f.lIllllIIIIII[0]] = lIllllIIIIII[36];
        String[] stringArray5 = new String[lIllllIIIIII[0]];
        stringArray5[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[37]];
        FLY_FISHING = new f(lIlllIllllll[lIllllIIIIII[34]], lIllllIIIIII[32], nArray5, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[13]]), item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[12]]), stringArray5);
        int[] nArray6 = new int[lIllllIIIIII[0]];
        nArray6[f.lIllllIIIIII[1]] = lIllllIIIIII[40];
        String[] stringArray6 = new String[lIllllIIIIII[0]];
        stringArray6[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[41]];
        COD = new f(lIlllIllllll[lIllllIIIIII[39]], lIllllIIIIII[37], nArray6, lIllllIIIIII[31], stringArray6);
        int[] nArray7 = new int[lIllllIIIIII[0]];
        nArray7[f.lIllllIIIIII[1]] = lIllllIIIIII[44];
        String[] stringArray7 = new String[lIllllIIIIII[0]];
        stringArray7[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[45]];
        PIKE = new f(lIlllIllllll[lIllllIIIIII[43]], lIllllIIIIII[39], nArray7, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[4])) {
                bl = lIllllIIIIII[0];
                0;
                if (3 < 3) {
                    return false;
                }
            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[11])) {
                bl = lIllllIIIIII[0];
                0;
                if (3 < -1) {
                    return ((0x27 ^ 9 ^ (0xDB ^ 0xAE)) & (55 + 117 - 79 + 137 ^ 130 + 37 - 164 + 186 ^ -1)) != 0;
                }
            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, stringArray7);
        int[] nArray8 = new int[lIllllIIIIII[0]];
        nArray8[f.lIllllIIIIII[1]] = lIllllIIIIII[49];
        String[] stringArray8 = new String[lIllllIIIIII[0]];
        stringArray8[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[51]];
        TUNA = new f(lIlllIllllll[lIllllIIIIII[47]], lIllllIIIIII[48], nArray8, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[10]]), lIllllIIIIII[50], stringArray8);
        int[] nArray9 = new int[lIllllIIIIII[0]];
        nArray9[f.lIllllIIIIII[1]] = lIllllIIIIII[55];
        String[] stringArray9 = new String[lIllllIIIIII[0]];
        stringArray9[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[48]];
        LOBSTER = new f(lIlllIllllll[lIllllIIIIII[53]], lIllllIIIIII[54], nArray9, lIllllIIIIII[56], lIllllIIIIII[50], stringArray9);
        int[] nArray10 = new int[lIllllIIIIII[0]];
        nArray10[f.lIllllIIIIII[1]] = lIllllIIIIII[60];
        String[] stringArray10 = new String[lIllllIIIIII[0]];
        stringArray10[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[62]];
        BASS = new f(lIlllIllllll[lIllllIIIIII[58]], lIllllIIIIII[59], nArray10, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[9]]), lIllllIIIIII[61], stringArray10);
        int[] nArray11 = new int[lIllllIIIIII[0]];
        nArray11[f.lIllllIIIIII[1]] = lIllllIIIIII[65];
        String[] stringArray11 = new String[lIllllIIIIII[0]];
        stringArray11[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[66]];
        SWORDFISH = new f(lIlllIllllll[lIllllIIIIII[54]], lIllllIIIIII[64], nArray11, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[8]]), lIllllIIIIII[50], stringArray11);
        int[] nArray12 = new int[lIllllIIIIII[0]];
        nArray12[f.lIllllIIIIII[1]] = lIllllIIIIII[70];
        String[] stringArray12 = new String[lIllllIIIIII[0]];
        stringArray12[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[71]];
        MONKFISH = new f(lIlllIllllll[lIllllIIIIII[68]], lIllllIIIIII[69], nArray12, lIllllIIIIII[18], stringArray12);
        int[] nArray13 = new int[lIllllIIIIII[0]];
        nArray13[f.lIllllIIIIII[1]] = lIllllIIIIII[74];
        String[] stringArray13 = new String[lIllllIIIIII[0]];
        stringArray13[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[75]];
        KARAMBWAN = new f(lIlllIllllll[lIllllIIIIII[59]], lIllllIIIIII[73], nArray13, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[7])) {
                bl = lIllllIIIIII[0];
                0;
                if (-2 > 0) {
                    return false;
                }
            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[6])) {
                bl = lIllllIIIIII[0];
                0;
                if (1 < -1) {
                    return ((85 + 11 - 88 + 242 ^ 99 + 113 - 186 + 143) & (0xC3 ^ 0xAF ^ (0x9E ^ 0xA1) ^ -1)) != 0;
                }
            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, stringArray13);
        int[] nArray14 = new int[lIllllIIIIII[0]];
        nArray14[f.lIllllIIIIII[1]] = lIllllIIIIII[79];
        String[] stringArray14 = new String[lIllllIIIIII[0]];
        stringArray14[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[64]];
        SHARKS = new f(lIlllIllllll[lIllllIIIIII[77]], lIllllIIIIII[78], nArray14, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[5]]), lIllllIIIIII[80], stringArray14);
        int[] nArray15 = new int[lIllllIIIIII[8]];
        nArray15[f.lIllllIIIIII[1]] = lIllllIIIIII[83];
        nArray15[f.lIllllIIIIII[0]] = lIllllIIIIII[84];
        nArray15[f.lIllllIIIIII[5]] = lIllllIIIIII[85];
        String[] stringArray15 = new String[lIllllIIIIII[0]];
        stringArray15[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[86]];
        BARBARIAN_FISHING = new f(lIlllIllllll[lIllllIIIIII[82]], lIllllIIIIII[76], nArray15, item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[0]]), item -> item.getName().toLowerCase().contains(lIlllIllllll[lIllllIIIIII[1]]), stringArray15);
        int[] nArray16 = new int[lIllllIIIIII[0]];
        nArray16[f.lIllllIIIIII[1]] = lIllllIIIIII[90];
        String[] stringArray16 = new String[lIllllIIIIII[0]];
        stringArray16[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[91]];
        MINNOWS = new f(lIlllIllllll[lIllllIIIIII[88]], lIllllIIIIII[89], nArray16, lIllllIIIIII[18], stringArray16);
        int[] nArray17 = new int[lIllllIIIIII[12]];
        nArray17[f.lIllllIIIIII[1]] = lIllllIIIIII[94];
        nArray17[f.lIllllIIIIII[0]] = lIllllIIIIII[95];
        nArray17[f.lIllllIIIIII[5]] = lIllllIIIIII[96];
        nArray17[f.lIllllIIIIII[8]] = lIllllIIIIII[97];
        nArray17[f.lIllllIIIIII[9]] = lIllllIIIIII[98];
        nArray17[f.lIllllIIIIII[10]] = lIllllIIIIII[99];
        String[] stringArray17 = new String[lIllllIIIIII[0]];
        stringArray17[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[101]];
        HOUSE_KEY = new f(lIlllIllllll[lIllllIIIIII[93]], lIllllIIIIII[0], nArray17, lIllllIIIIII[31], lIllllIIIIII[100], stringArray17);
        int[] nArray18 = new int[lIllllIIIIII[0]];
        nArray18[f.lIllllIIIIII[1]] = lIllllIIIIII[104];
        String[] stringArray18 = new String[lIllllIIIIII[0]];
        stringArray18[f.lIllllIIIIII[1]] = lIlllIllllll[lIllllIIIIII[69]];
        ANGLERFISH = new f(lIlllIllllll[lIllllIIIIII[103]], lIllllIIIIII[89], nArray18, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[4])) {
                bl = lIllllIIIIII[0];
                0;
                if (2 == 0) {
                    return false;
                }
            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, item -> {
            boolean bl;
            if (f.lllIllIIIlllIl(item.getId(), lIllllIIIIII[3])) {
                bl = lIllllIIIIII[0];
                0;
                
                }
            } else {
                bl = lIllllIIIIII[1];
            }
            return bl;
        }, stringArray18);
        f[] fArray = new f[lIllllIIIIII[28]];
        fArray[f.lIllllIIIIII[1]] = SHRIMP;
        fArray[f.lIllllIIIIII[0]] = SARDINE;
        fArray[f.lIllllIIIIII[5]] = KARAMBWANJI;
        fArray[f.lIllllIIIIII[8]] = MACKEREL;
        fArray[f.lIllllIIIIII[9]] = FLY_FISHING;
        fArray[f.lIllllIIIIII[10]] = COD;
        fArray[f.lIllllIIIIII[12]] = PIKE;
        fArray[f.lIllllIIIIII[13]] = TUNA;
        fArray[f.lIllllIIIIII[14]] = LOBSTER;
        fArray[f.lIllllIIIIII[15]] = BASS;
        fArray[f.lIllllIIIIII[19]] = SWORDFISH;
        fArray[f.lIllllIIIIII[20]] = MONKFISH;
        fArray[f.lIllllIIIIII[21]] = KARAMBWAN;
        fArray[f.lIllllIIIIII[22]] = SHARKS;
        fArray[f.lIllllIIIIII[24]] = BARBARIAN_FISHING;
        fArray[f.lIllllIIIIII[25]] = MINNOWS;
        fArray[f.lIllllIIIIII[26]] = HOUSE_KEY;
        fArray[f.lIllllIIIIII[27]] = ANGLERFISH;
        $VALUES = fArray;
    }

    private static String lllIllIIIllIII(String var1, String var7) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIllllIIIIII[14]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIllllIIIIII[5], var8);
            return new String(var10.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    public int[] j() {
        return this.fishId;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private f(String string2, int n2, int[] nArray, int n3, int n4, String ... stringArray) {
        this.name = string2;
        this.fishingLevelRequired = n2;
        this.fishId = nArray;
        int[] nArray2 = new int[lIllllIIIIII[0]];
        nArray2[f.lIllllIIIIII[1]] = n3;
        this.toolPredicate = Predicates.ids((int[])nArray2);
        this.baitPredicate = null;
        this.fishNpcId = n4;
        this.action = stringArray;
    }

    public int i() {
        return this.fishingLevelRequired;
    }

    private static void lllIllIIIlllII() {
        lIllllIIIIII = new int[106];
        f.lIllllIIIIII[0] = 1;
        f.lIllllIIIIII[1] = (0xFA ^ 0x8E ^ (5 ^ 0x6F)) & (131 + 76 - 139 + 85 ^ 102 + 23 - 87 + 97 ^ -1);
        f.lIllllIIIIII[2] = -1;
        f.lIllllIIIIII[3] = -(50 + 1 - 2 + 80) & (0xFFFFFEF7 & 0x35FF);
        f.lIllllIIIIII[4] = 0xFFFFBBBB & 0x4577;
        f.lIllllIIIIII[5] = 2;
        f.lIllllIIIIII[6] = 0xFFFFCCCE & 0x3F7F;
        f.lIllllIIIIII[7] = 0xFFFFFFD7 & 0xC7F;
        f.lIllllIIIIII[8] = 3;
        f.lIllllIIIIII[9] = 0x59 ^ 0x5D;
        f.lIllllIIIIII[10] = 0x4A ^ 6 ^ (0x62 ^ 0x2B);
        f.lIllllIIIIII[11] = 0xFFFFB779 & 0x49BF;
        f.lIllllIIIIII[12] = 0x92 ^ 0x9B ^ (7 ^ 8);
        f.lIllllIIIIII[13] = 0xA5 ^ 0xA2;
        f.lIllllIIIIII[14] = 0x4B ^ 0x79 ^ (0x31 ^ 0xB);
        f.lIllllIIIIII[15] = 0xE9 ^ 0xBF ^ (0 ^ 0x5F);
        f.lIllllIIIIII[16] = -(0xFFFFFF43 & 0x5EFF) & (0xFFFFDF7F & Short.MAX_VALUE);
        f.lIllllIIIIII[17] = -(0xFFFF8215 & 0x7FEF) & (0xFFFFC3FF & 0x3F45);
        f.lIllllIIIIII[18] = 0xFFFFFDBF & 0x36F;
        f.lIllllIIIIII[19] = 166 + 84 - 88 + 26 ^ 97 + 41 - 1 + 45;
        f.lIllllIIIIII[20] = 0x68 ^ 0x63;
        f.lIllllIIIIII[21] = 0x22 ^ 0x66 ^ (0x42 ^ 0xA);
        f.lIllllIIIIII[22] = 0x2A ^ 0x30 ^ (0x97 ^ 0x80);
        f.lIllllIIIIII[23] = 0xFFFFFDC7 & 0x37F;
        f.lIllllIIIIII[24] = 0x16 ^ 0x1D ^ (0x6A ^ 0x6F);
        f.lIllllIIIIII[25] = 122 + 42 - 91 + 66 ^ 110 + 21 - 99 + 100;
        f.lIllllIIIIII[26] = 0x75 ^ 0x16 ^ (0x18 ^ 0x6B);
        f.lIllllIIIIII[27] = 0xF1 ^ 0x84 ^ (0xFB ^ 0x9F);
        f.lIllllIIIIII[28] = 0x54 ^ 1 ^ (0x65 ^ 0x22);
        f.lIllllIIIIII[29] = 0x2B ^ 0x38;
        f.lIllllIIIIII[30] = -(0xFFFFFE9B & Short.MAX_VALUE) & (0xFFFFFFFB & Short.MAX_VALUE);
        f.lIllllIIIIII[31] = 0xFFFFBBFD & 0x4533;
        f.lIllllIIIIII[32] = 0x6A ^ 0x7E;
        f.lIllllIIIIII[33] = 0x88 ^ 0x9D;
        f.lIllllIIIIII[34] = 0x51 ^ 0x47;
        f.lIllllIIIIII[35] = -(0xFFFFDFF5 & 0x7EAB) & (0xFFFFDFEF & Short.MAX_VALUE);
        f.lIllllIIIIII[36] = -(0xFFFFE7F5 & 0x1EBF) & (0xFFFFA7FF & 0x5FFF);
        f.lIllllIIIIII[37] = 0xA9 ^ 0xBE;
        f.lIllllIIIIII[38] = 0xB6 ^ 0xAE;
        f.lIllllIIIIII[39] = 0 ^ 0x19;
        f.lIllllIIIIII[40] = -(0xFFFFFEBB & 0x7FCF) & (0xFFFFFFDF & Short.MAX_VALUE);
        f.lIllllIIIIII[41] = 0xCF ^ 0xAD ^ (0xE2 ^ 0x9A);
        f.lIllllIIIIII[42] = 0x53 ^ 0x12 ^ (0x9C ^ 0xC6);
        f.lIllllIIIIII[43] = 0x52 ^ 0x4E;
        f.lIllllIIIIII[44] = 0xFFFFDFFD & 0x215F;
        f.lIllllIIIIII[45] = 0x5D ^ 0x40;
        f.lIllllIIIIII[46] = 0x7F ^ 0x78 ^ (0x22 ^ 0x3B);
        f.lIllllIIIIII[47] = 0x74 ^ 0x6B;
        f.lIllllIIIIII[48] = 0xA9 ^ 0x8A;
        f.lIllllIIIIII[49] = 0xFFFFB777 & 0x49EF;
        f.lIllllIIIIII[50] = 0xFFFFBFFF & 0x45EF;
        f.lIllllIIIIII[51] = 0xD2 ^ 0x80 ^ (0xFF ^ 0x8D);
        f.lIllllIIIIII[52] = 0x3D ^ 0x1C;
        f.lIllllIIIIII[53] = 0x47 ^ 0x53 ^ (0xB1 ^ 0x87);
        f.lIllllIIIIII[54] = 8 ^ 0x60 ^ (0xD0 ^ 0x90);
        f.lIllllIIIIII[55] = -(0xFFFFFE3F & 0x7FC7) & (0xFFFFFFFF & 0x7F7F);
        f.lIllllIIIIII[56] = 0xFFFFF3BF & 0xD6D;
        f.lIllllIIIIII[57] = 0x17 ^ 0x33;
        f.lIllllIIIIII[58] = 0xF4 ^ 0xC5 ^ (0x4E ^ 0x5A);
        f.lIllllIIIIII[59] = 0xE5 ^ 0xA5 ^ (0xC1 ^ 0xAF);
        f.lIllllIIIIII[60] = 0xFFFFBB6F & 0x45FB;
        f.lIllllIIIIII[61] = 0xFFFFCDF7 & 0x37EE;
        f.lIllllIIIIII[62] = 107 + 77 - 69 + 19 ^ 110 + 57 - 83 + 76;
        f.lIllllIIIIII[63] = 0xB ^ 0x1A ^ (0x42 ^ 0x74);
        f.lIllllIIIIII[64] = 0x83 ^ 0xAB ^ (0x25 ^ 0x3F);
        f.lIllllIIIIII[65] = -(0xFFFFDEFD & 0x770B) & (0xFFFFD7FF & 0x7F7D);
        f.lIllllIIIIII[66] = 0x18 ^ 0x39 ^ (0x4C ^ 0x44);
        f.lIllllIIIIII[67] = 160 + 152 - 291 + 212 ^ 166 + 53 - 155 + 131;
        f.lIllllIIIIII[68] = 29 + 64 - -44 + 1 ^ 71 + 53 - 15 + 52;
        f.lIllllIIIIII[69] = 0x42 ^ 0x5C ^ (0x10 ^ 0x30);
        f.lIllllIIIIII[70] = 0xFFFFFFAC & 0x1F5B;
        f.lIllllIIIIII[71] = 0x5E ^ 0x72;
        f.lIllllIIIIII[72] = 7 + 128 - 54 + 70 ^ 41 + 180 - 72 + 37;
        f.lIllllIIIIII[73] = 2 ^ 0x73 ^ (0x53 ^ 0x63);
        f.lIllllIIIIII[74] = -(0xFFFFFE19 & 0x33EF) & (0xFFFFFEDE & 0x3F6F);
        f.lIllllIIIIII[75] = 0x25 ^ 0x64 ^ (0x24 ^ 0x4A);
        f.lIllllIIIIII[76] = 0x84 ^ 0xB4;
        f.lIllllIIIIII[77] = 0x21 ^ 0x10;
        f.lIllllIIIIII[78] = 0x74 ^ 0x3B ^ 3;
        f.lIllllIIIIII[79] = 0xFFFFA37F & 0x5DFF;
        f.lIllllIIIIII[80] = -(0xFFFFDD3D & 0x6AD3) & (0xFFFFDFFF & 0x6DF7);
        f.lIllllIIIIII[81] = 0x3F ^ 0x4E ^ (9 ^ 0x4B);
        f.lIllllIIIIII[82] = 0x11 ^ 0x25;
        f.lIllllIIIIII[83] = 0xFFFFEFF9 & 0x3C46;
        f.lIllllIIIIII[84] = 0xFFFFEE4A & 0x3DF7;
        f.lIllllIIIIII[85] = 0xFFFFAD64 & 0x7EDF;
        f.lIllllIIIIII[86] = 0x29 ^ 0x1C;
        f.lIllllIIIIII[87] = 0x10 ^ 0x26;
        f.lIllllIIIIII[88] = 0xBD ^ 0x8A;
        f.lIllllIIIIII[89] = 0x43 ^ 0x4A ^ (0x48 ^ 0x13);
        f.lIllllIIIIII[90] = -(0xFFFFBF17 & 0x4CFB) & (0xFFFFFF7E & 0x5FFF);
        f.lIllllIIIIII[91] = 26 + 72 - 67 + 116 ^ 78 + 94 - 141 + 140;
        f.lIllllIIIIII[92] = 5 + 84 - -5 + 64 ^ 152 + 52 - 134 + 97;
        f.lIllllIIIIII[93] = 0x76 ^ 0x4C;
        f.lIllllIIIIII[94] = -(0xFFFFEDF9 & 0x5E47) & (0xFFFFFFEF & 0x4EFD);
        f.lIllllIIIIII[95] = 0xFFFFFFBF & 0x2F2;
        f.lIllllIIIIII[96] = 0xFFFFA7FF & 0x5DBD;
        f.lIllllIIIIII[97] = 0xFFFFBE6F & 0x47DB;
        f.lIllllIIIIII[98] = -(0xFFFFD9FB & 0x7F97) & (0xFFFFDFFF & 0x7FDF);
        f.lIllllIIIIII[99] = -(0xFFFFD26B & 0x3FF7) & (0xFFFFD7F7 & 0x3BFF);
        f.lIllllIIIIII[100] = 0xFFFFFFF1 & 0x341F;
        f.lIllllIIIIII[101] = 0x5A ^ 0x57 ^ (0x39 ^ 0xF);
        f.lIllllIIIIII[102] = 0xAD ^ 0x91;
        f.lIllllIIIIII[103] = 0x9F ^ 0xA2;
        f.lIllllIIIIII[104] = -(0xFFFFDFD1 & 0x2AAF) & (0xFFFFFEFF & 0x3FFF);
        f.lIllllIIIIII[105] = 0x92 ^ 0xAD;
    }

    private static boolean lllIllIIIllllI(int n, int n2) {
        return n < n2;
    }

    private static void lllIllIIIllIll() {
        lIlllIllllll = new String[lIllllIIIIII[105]];
        f.lIlllIllllll[f.lIllllIIIIII[1]] = f."feather";
        f.lIlllIllllll[f.lIllllIIIIII[0]] = f."barbarian rod";
        f.lIlllIllllll[f.lIllllIIIIII[5]] = f."harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[8]] = f."harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[9]] = f."harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[10]] = f."harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[12]] = f."feather";
        f.lIlllIllllll[f.lIllllIIIIII[13]] = f."fly fishing";
        f.lIlllIllllll[f.lIllllIIIIII[14]] = f."SHRIMP";
        f.lIlllIllllll[f.lIllllIIIIII[15]] = f."Shrimp";
        f.lIlllIllllll[f.lIllllIIIIII[19]] = f."Net";
        f.lIlllIllllll[f.lIllllIIIIII[20]] = f."Small Net";
        f.lIlllIllllll[f.lIllllIIIIII[21]] = f."SARDINE";
        f.lIlllIllllll[f.lIllllIIIIII[22]] = f."Sardines";
        f.lIlllIllllll[f.lIllllIIIIII[24]] = f."Bait";
        f.lIlllIllllll[f.lIllllIIIIII[25]] = f."KARAMBWANJI";
        f.lIlllIllllll[f.lIllllIIIIII[26]] = f."Karambwanji";
        f.lIlllIllllll[f.lIllllIIIIII[27]] = f."Net";
        f.lIlllIllllll[f.lIllllIIIIII[28]] = f."MACKEREL";
        f.lIlllIllllll[f.lIllllIIIIII[29]] = f."Mackerel";
        f.lIlllIllllll[f.lIllllIIIIII[32]] = f."Big Net";
        f.lIlllIllllll[f.lIllllIIIIII[33]] = f."FLY_FISHING";
        f.lIlllIllllll[f.lIllllIIIIII[34]] = f."Fly fishing";
        f.lIlllIllllll[f.lIllllIIIIII[37]] = f."Lure";
        f.lIlllIllllll[f.lIllllIIIIII[38]] = f."COD";
        f.lIlllIllllll[f.lIllllIIIIII[39]] = f."Cod";
        f.lIlllIllllll[f.lIllllIIIIII[41]] = f."Big Net";
        f.lIlllIllllll[f.lIllllIIIIII[42]] = f."PIKE";
        f.lIlllIllllll[f.lIllllIIIIII[43]] = f."Pike";
        f.lIlllIllllll[f.lIllllIIIIII[45]] = f."Bait";
        f.lIlllIllllll[f.lIllllIIIIII[46]] = f."TUNA";
        f.lIlllIllllll[f.lIllllIIIIII[47]] = f."Tuna";
        f.lIlllIllllll[f.lIllllIIIIII[51]] = f."Harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[52]] = f."LOBSTER";
        f.lIlllIllllll[f.lIllllIIIIII[53]] = f."Lobster";
        f.lIlllIllllll[f.lIllllIIIIII[48]] = f."Cage";
        f.lIlllIllllll[f.lIllllIIIIII[57]] = f."BASS";
        f.lIlllIllllll[f.lIllllIIIIII[58]] = f."Bass";
        f.lIlllIllllll[f.lIllllIIIIII[62]] = f."Harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[63]] = f."SWORDFISH";
        f.lIlllIllllll[f.lIllllIIIIII[54]] = f."Swordfish";
        f.lIlllIllllll[f.lIllllIIIIII[66]] = f."Harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[67]] = f."MONKFISH";
        f.lIlllIllllll[f.lIllllIIIIII[68]] = f."Monkfish";
        f.lIlllIllllll[f.lIllllIIIIII[71]] = f."Net";
        f.lIlllIllllll[f.lIllllIIIIII[72]] = f."KARAMBWAN";
        f.lIlllIllllll[f.lIllllIIIIII[59]] = f."Karambwan";
        f.lIlllIllllll[f.lIllllIIIIII[75]] = f."Fish";
        f.lIlllIllllll[f.lIllllIIIIII[76]] = f."SHARKS";
        f.lIlllIllllll[f.lIllllIIIIII[77]] = f."Shark";
        f.lIlllIllllll[f.lIllllIIIIII[64]] = f."Harpoon";
        f.lIlllIllllll[f.lIllllIIIIII[81]] = f."BARBARIAN_FISHING";
        f.lIlllIllllll[f.lIllllIIIIII[82]] = f."Barbarian Fishing";
        f.lIlllIllllll[f.lIllllIIIIII[86]] = f."Use-rod";
        f.lIlllIllllll[f.lIllllIIIIII[87]] = f."MINNOWS";
        f.lIlllIllllll[f.lIllllIIIIII[88]] = f."Minnows";
        f.lIlllIllllll[f.lIllllIIIIII[91]] = f."Small Net";
        f.lIlllIllllll[f.lIllllIIIIII[92]] = f."HOUSE_KEY";
        f.lIlllIllllll[f.lIllllIIIIII[93]] = f."House Key";
        f.lIlllIllllll[f.lIllllIIIIII[101]] = f."Cast";
        f.lIlllIllllll[f.lIllllIIIIII[102]] = f."ANGLERFISH";
        f.lIlllIllllll[f.lIllllIIIIII[103]] = f."Anglerfish";
        f.lIlllIllllll[f.lIllllIIIIII[69]] = f."Bait";
    }

    private f(String string2, int n2, int[] nArray, Predicate<Item> predicate, int n3, String ... stringArray) {
        this.name = string2;
        this.fishingLevelRequired = n2;
        this.fishId = nArray;
        this.toolPredicate = predicate;
        this.baitPredicate = null;
        this.fishNpcId = n3;
        this.action = stringArray;
    }

    public String[] n() {
        return this.action;
    }

    private f(String string2, int n2, int[] nArray, int n3, String ... stringArray) {
        this.name = string2;
        this.fishingLevelRequired = n2;
        this.fishId = nArray;
        int[] nArray2 = new int[lIllllIIIIII[0]];
        nArray2[f.lIllllIIIIII[1]] = n3;
        this.toolPredicate = Predicates.ids((int[])nArray2);
        this.baitPredicate = null;
        this.fishNpcId = lIllllIIIIII[2];
        this.action = stringArray;
    }

    private static boolean lllIllIIIlllIl(int n, int n2) {
        return n == n2;
    }
}

