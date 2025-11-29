/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class A
extends Enum<A> {
    private static final /* synthetic */ A[] $VALUES;
    public static final /* synthetic */ /* enum */ A CLOCK;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ A OVERVIEW;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ /* enum */ A FLOWER;
    public static final /* synthetic */ /* enum */ A HOPS;
    public static final /* synthetic */ /* enum */ A SPECIAL;
    public static final /* synthetic */ /* enum */ A ALLOTMENT;
    public static final /* synthetic */ /* enum */ A TREE;
    public static final /* synthetic */ /* enum */ A TIME_OFFSET;
    public static final /* synthetic */ /* enum */ A FRUIT_TREE;
    private static /* synthetic */ String[] lIlllllIIlII;
    public static final /* synthetic */ /* enum */ A BUSH;
    public static final /* synthetic */ A[] FARMING_RUN_TYPES;
    private static /* synthetic */ int[] lIlllllIlIIl;
    public static final /* synthetic */ /* enum */ A HERB;
    public static final /* synthetic */ /* enum */ A BIRD_HOUSE;
    public static final /* synthetic */ /* enum */ A GRAPE;

    private static String lllIllllIlIlII(String var1, String var17) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlllllIlIIl[3], var13);
            return new String(var7.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String lllIllllIlIIll(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var2 = var6.toCharArray();
        int var4 = lIlllllIlIIl[0];
        char[] var12 = var5.toCharArray();
        int var9 = var12.length;
        int var18 = lIlllllIlIIl[0];
        while (A.lllIlllllIIlIl(var18, var9)) {
            char var11 = var12[var18];
            var15.append((char)(var11 ^ var2[var4 % var2.length]));
            0;
            ++var4;
            ++var18;
            0;
            if (3 >= ((0x3D ^ 0x22) & ~(0xA0 ^ 0xBF))) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    public String ac() {
        return this.name;
    }

    static {
        A.lllIlllllIIlII();
        A.lllIllllIlllll();
        OVERVIEW = new A(lIlllllIIlII[lIlllllIlIIl[1]], lIlllllIlIIl[2]);
        CLOCK = new A(lIlllllIIlII[lIlllllIlIIl[4]], lIlllllIlIIl[5]);
        BIRD_HOUSE = new A(lIlllllIIlII[lIlllllIlIIl[7]], lIlllllIlIIl[8]);
        ALLOTMENT = new A(lIlllllIIlII[lIlllllIlIIl[10]], lIlllllIlIIl[11]);
        FLOWER = new A(lIlllllIIlII[lIlllllIlIIl[13]], lIlllllIlIIl[14]);
        HERB = new A(lIlllllIIlII[lIlllllIlIIl[16]], lIlllllIlIIl[17]);
        TREE = new A(lIlllllIIlII[lIlllllIlIIl[19]], lIlllllIlIIl[20]);
        FRUIT_TREE = new A(lIlllllIIlII[lIlllllIlIIl[22]], lIlllllIlIIl[23]);
        HOPS = new A(lIlllllIIlII[lIlllllIlIIl[25]], lIlllllIlIIl[26]);
        BUSH = new A(lIlllllIIlII[lIlllllIlIIl[28]], lIlllllIlIIl[29]);
        GRAPE = new A(lIlllllIIlII[lIlllllIlIIl[31]], lIlllllIlIIl[32]);
        SPECIAL = new A(lIlllllIIlII[lIlllllIlIIl[34]], lIlllllIlIIl[35]);
        TIME_OFFSET = new A(lIlllllIIlII[lIlllllIlIIl[37]], lIlllllIlIIl[38]);
        A[] aArray = new A[lIlllllIlIIl[19]];
        aArray[A.lIlllllIlIIl[0]] = OVERVIEW;
        aArray[A.lIlllllIlIIl[1]] = CLOCK;
        aArray[A.lIlllllIlIIl[3]] = BIRD_HOUSE;
        aArray[A.lIlllllIlIIl[4]] = ALLOTMENT;
        aArray[A.lIlllllIlIIl[6]] = FLOWER;
        aArray[A.lIlllllIlIIl[7]] = HERB;
        aArray[A.lIlllllIlIIl[9]] = TREE;
        aArray[A.lIlllllIlIIl[10]] = FRUIT_TREE;
        aArray[A.lIlllllIlIIl[12]] = HOPS;
        aArray[A.lIlllllIlIIl[13]] = BUSH;
        aArray[A.lIlllllIlIIl[15]] = GRAPE;
        aArray[A.lIlllllIlIIl[16]] = SPECIAL;
        aArray[A.lIlllllIlIIl[18]] = TIME_OFFSET;
        $VALUES = aArray;
        A[] aArray2 = new A[lIlllllIlIIl[13]];
        aArray2[A.lIlllllIlIIl[0]] = HERB;
        aArray2[A.lIlllllIlIIl[1]] = TREE;
        aArray2[A.lIlllllIlIIl[3]] = FRUIT_TREE;
        aArray2[A.lIlllllIlIIl[4]] = SPECIAL;
        aArray2[A.lIlllllIlIIl[6]] = FLOWER;
        aArray2[A.lIlllllIlIIl[7]] = ALLOTMENT;
        aArray2[A.lIlllllIlIIl[9]] = BUSH;
        aArray2[A.lIlllllIlIIl[10]] = GRAPE;
        aArray2[A.lIlllllIlIIl[12]] = HOPS;
        FARMING_RUN_TYPES = aArray2;
    }

    public static A valueOf(String string) {
        return Enum.valueOf(A.class, string);
    }

    private A(String string2, int n3) {
        this.name = string2;
        this.itemID = n3;
    }

    private static void lllIllllIlllll() {
        lIlllllIIlII = new String[lIlllllIlIIl[39]];
        A.lIlllllIIlII[A.lIlllllIlIIl[0]] = A."OVERVIEW";
        A.lIlllllIIlII[A.lIlllllIlIIl[1]] = A."Overview";
        A.lIlllllIIlII[A.lIlllllIlIIl[3]] = A."CLOCK";
        A.lIlllllIIlII[A.lIlllllIlIIl[4]] = A."Timers & Stopwatches";
        A.lIlllllIIlII[A.lIlllllIlIIl[6]] = A."BIRD_HOUSE";
        A.lIlllllIIlII[A.lIlllllIlIIl[7]] = A."Bird Houses";
        A.lIlllllIIlII[A.lIlllllIlIIl[9]] = A."ALLOTMENT";
        A.lIlllllIIlII[A.lIlllllIlIIl[10]] = A."Allotment Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[12]] = A."FLOWER";
        A.lIlllllIIlII[A.lIlllllIlIIl[13]] = A."Flower Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[15]] = A."HERB";
        A.lIlllllIIlII[A.lIlllllIlIIl[16]] = A."Herb Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[18]] = A."TREE";
        A.lIlllllIIlII[A.lIlllllIlIIl[19]] = A."Tree Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[21]] = A."FRUIT_TREE";
        A.lIlllllIIlII[A.lIlllllIlIIl[22]] = A."Fruit Tree Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[24]] = A."HOPS";
        A.lIlllllIIlII[A.lIlllllIlIIl[25]] = A."Hops Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[27]] = A."BUSH";
        A.lIlllllIIlII[A.lIlllllIlIIl[28]] = A."Bush Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[30]] = A."GRAPE";
        A.lIlllllIIlII[A.lIlllllIlIIl[31]] = A."Grape Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[33]] = A."SPECIAL";
        A.lIlllllIIlII[A.lIlllllIlIIl[34]] = A."Special Patches";
        A.lIlllllIIlII[A.lIlllllIlIIl[36]] = A."TIME_OFFSET";
        A.lIlllllIIlII[A.lIlllllIlIIl[37]] = A."Farming Tick Offset";
    }

    private static boolean lllIlllllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIlllllIIlII() {
        lIlllllIlIIl = new int[40];
        A.lIlllllIlIIl[0] = (0x9A ^ 0x8A) & ~(0x2B ^ 0x3B);
        A.lIlllllIlIIl[1] = 1;
        A.lIlllllIlIIl[2] = -(0xFFFFFBDF & 0xCB5) & (0xFFFFFFBF & 0x5EF7);
        A.lIlllllIlIIl[3] = 2;
        A.lIlllllIlIIl[4] = 3;
        A.lIlllllIlIIl[5] = -(0xFFFFE971 & 0x77FF) & (0xFFFFFFFF & 0x6B7F);
        A.lIlllllIlIIl[6] = 0xAB ^ 0xAF;
        A.lIlllllIlIIl[7] = 0x25 ^ 0x7F ^ (0xF3 ^ 0xAC);
        A.lIlllllIlIIl[8] = -(0xFFFFDBEF & 0x2FF5) & (0xFFFFFFFF & 0x5FEF);
        A.lIlllllIlIIl[9] = 0x71 ^ 0x77;
        A.lIlllllIlIIl[10] = 83 + 173 - 71 + 4 ^ 51 + 158 - 38 + 15;
        A.lIlllllIlIIl[11] = -(0xFFFFF901 & 0x46FF) & (0xFFFFFFAF & 0x47FD);
        A.lIlllllIlIIl[12] = 0xCF ^ 0xA7 ^ (4 ^ 0x64);
        A.lIlllllIlIIl[13] = 0x3B ^ 0x32;
        A.lIlllllIlIIl[14] = 0xFFFF99FE & 0x6F9F;
        A.lIlllllIlIIl[15] = 0x5A ^ 0x60 ^ (0xD ^ 0x3D);
        A.lIlllllIlIIl[16] = 0x1D ^ 1 ^ (0x59 ^ 0x4E);
        A.lIlllllIlIIl[17] = (0x73 ^ 1) + (26 + 120 - 114 + 102) - (0x13 ^ 0x2B) + (0xB6 ^ 0xB9);
        A.lIlllllIlIIl[18] = 0x8E ^ 0x82;
        A.lIlllllIlIIl[19] = 0xE ^ 0x36 ^ (0x8C ^ 0xB9);
        A.lIlllllIlIIl[20] = -(0xFFFFFDCF & 0x2A35) & (0xFFFFADFF & 0x7FEF);
        A.lIlllllIlIIl[21] = 0x23 ^ 0x2D;
        A.lIlllllIlIIl[22] = 114 + 61 - 34 + 46 ^ 91 + 40 - -30 + 19;
        A.lIlllllIlIIl[23] = 0xFFFFAB67 & 0x5CDA;
        A.lIlllllIlIIl[24] = 0xBB ^ 0xAB;
        A.lIlllllIlIIl[25] = 0xD1 ^ 0xC0;
        A.lIlllllIlIIl[26] = -(0xFFFFFA6A & 0x2D9F) & (0xFFFFFFFF & 0x3F7F);
        A.lIlllllIlIIl[27] = 0x6B ^ 0x79;
        A.lIlllllIlIIl[28] = 0x19 ^ 0xA;
        A.lIlllllIlIIl[29] = 0xFFFFD7A2 & 0x3FDF;
        A.lIlllllIlIIl[30] = 0xA ^ 0x1E;
        A.lIlllllIlIIl[31] = 145 + 34 - 139 + 118 ^ 44 + 131 - 88 + 52;
        A.lIlllllIlIIl[32] = 0xFFFF9FEF & 0x67D3;
        A.lIlllllIlIIl[33] = 0xB9 ^ 0x8E ^ (0x9D ^ 0xBC);
        A.lIlllllIlIIl[34] = 0x62 ^ 0x33 ^ (4 ^ 0x42);
        A.lIlllllIlIIl[35] = -(0xFFFFFFCF & 0x48BB) & (0xFFFFFFFF & 0x5FFE);
        A.lIlllllIlIIl[36] = 0x2C ^ 0x34;
        A.lIlllllIlIIl[37] = 0xA0 ^ 0xB9;
        A.lIlllllIlIIl[38] = -(0xFFFFBF8F & 0x637D) & (0xFFFFFFDF & 0x37FF);
        A.lIlllllIlIIl[39] = 146 + 0 - -8 + 9 ^ 41 + 112 - 74 + 106;
    }

    public int au() {
        return this.itemID;
    }

    private static String lllIllllIlIlll(String var10, String var16) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lIlllllIlIIl[12]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIlllllIlIIl[3], var8);
            return new String(var14.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }
}

