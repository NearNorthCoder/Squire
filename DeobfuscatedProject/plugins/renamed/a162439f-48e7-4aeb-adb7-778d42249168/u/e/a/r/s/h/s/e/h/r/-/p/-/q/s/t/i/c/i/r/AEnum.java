/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package u.e.a.r.s.h.s.e.h.r.-.p.-.q.s.t.i.c.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class AEnum
extends Enum<a> {
    private final /* synthetic */ boolean canSell;
    public static final /* synthetic */ /* enum */ a EMPTY_FISHBOWL;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ /* enum */ a CANDLE_LANTERN;
    private final /* synthetic */ int itemId;
    private final /* synthetic */ int levelRequirement;
    private static /* synthetic */ String[] lIlIllIllIlI;
    public static final /* synthetic */ /* enum */ a UNPOWERED_ORB;
    public static final /* synthetic */ /* enum */ a VIAL;
    public static final /* synthetic */ /* enum */ a LANTERN_LENS;
    private static /* synthetic */ int[] lIlIllIllIll;
    public static final /* synthetic */ /* enum */ a EMPTY_OIL_LAMP;
    public static final /* synthetic */ /* enum */ a BEER_GLASS;
    public static final /* synthetic */ /* enum */ a EMPTY_LIGHT_ORB;

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public int a() {
        return this.ordinal() + lIlIllIllIll[0];
    }

    private static boolean lllIIIIlIIIlIl(Object object) {
        return object != null;
    }

    private static void lllIIIIlIIIIlI() {
        lIlIllIllIll = new int[23];
        a.lIlIllIllIll[0] = 1;
        a.lIlIllIllIll[1] = (0x3E ^ 0x1C) & ~(0xB ^ 0x29);
        a.lIlIllIllIll[2] = -(0xFFFFFD9F & 0x72E1) & (0xFFFFFFFF & 0x77FF);
        a.lIlIllIllIll[3] = 0xFFFFDDF7 & 0x33B9;
        a.lIlIllIllIll[4] = 0xC2 ^ 0xC6;
        a.lIlIllIllIll[5] = 2;
        a.lIlIllIllIll[6] = 0xFFFF97ED & 0x79BF;
        a.lIlIllIllIll[7] = 1 ^ (0x2A ^ 0x27);
        a.lIlIllIllIll[8] = 3;
        a.lIlIllIllIll[9] = (0xC3 ^ 0xAF) + (0xC3 ^ 0x9D) - (22 + 52 - 28 + 138) + (199 + 176 - 352 + 188);
        a.lIlIllIllIll[10] = 146 + 125 - 154 + 64 ^ 14 + 0 - -111 + 23;
        a.lIlIllIllIll[11] = -(0xFFFFF4E3 & 0x2B7D) & (0xFFFFFF7B & 0x3AEF);
        a.lIlIllIllIll[12] = 0x4B ^ 0x2A ^ (0x42 ^ 9);
        a.lIlIllIllIll[13] = 0x8C ^ 0x99 ^ (0xAA ^ 0xBA);
        a.lIlIllIllIll[14] = -(0xFFFFBDF9 & 0x7FCF) & (0xFFFFBFFF & Short.MAX_VALUE);
        a.lIlIllIllIll[15] = 0x59 ^ 0x77;
        a.lIlIllIllIll[16] = 0x2D ^ 0x1F ^ (0x5B ^ 0x6F);
        a.lIlIllIllIll[17] = 0xFFFF97BF & 0x79FE;
        a.lIlIllIllIll[18] = 0x1B ^ 0x6E ^ (0x3C ^ 0x78);
        a.lIlIllIllIll[19] = 0xA7 ^ 0xA0;
        a.lIlIllIllIll[20] = 0xFFFFFAF4 & 0x2FEF;
        a.lIlIllIllIll[21] = 0x71 ^ 0x26;
        a.lIlIllIllIll[22] = 0x6F ^ 0x67;
    }

    public int d() {
        return this.levelRequirement;
    }

    public int c() {
        return this.itemId;
    }

    public boolean e() {
        return this.canSell;
    }

    private static String lllIIIIlIIIIII(String var8, String var12) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIlIllIllIll[5], var11);
            return new String(var10.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static boolean lllIIIIlIIIllI(int n, int n2) {
        return n > n2;
    }

    private static String lllIIIIIllllll(String var5, String var15) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var25 = var15.toCharArray();
        int var7 = lIlIllIllIll[1];
        char[] var1 = var5.toCharArray();
        int var14 = var1.length;
        int var20 = lIlIllIllIll[1];
        while (a.lllIIIIlIIIIll(var20, var14)) {
            char var22 = var1[var20];
            var13.append((char)(var22 ^ var25[var7 % var25.length]));
            0;
            ++var7;
            ++var20;
            0;
            if (-(0x58 ^ 0x5C) <= 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static String lllIIIIIlllllI(String var16, String var2) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIllIllIll[22]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIlIllIllIll[5], var21);
            return new String(var17.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static void lllIIIIlIIIIIl() {
        lIlIllIllIlI = new String[lIlIllIllIll[22]];
        a.lIlIllIllIlI[a.lIlIllIllIll[1]] = a."BEER_GLASS";
        a.lIlIllIllIlI[a.lIlIllIllIll[0]] = a."CANDLE_LANTERN";
        a.lIlIllIllIlI[a.lIlIllIllIll[5]] = a."EMPTY_OIL_LAMP";
        a.lIlIllIllIlI[a.lIlIllIllIll[8]] = a."VIAL";
        a.lIlIllIllIlI[a.lIlIllIllIll[4]] = a."EMPTY_FISHBOWL";
        a.lIlIllIllIlI[a.lIlIllIllIll[13]] = a."UNPOWERED_ORB";
        a.lIlIllIllIlI[a.lIlIllIllIll[16]] = a."LANTERN_LENS";
        a.lIlIllIllIlI[a.lIlIllIllIll[19]] = a."EMPTY_LIGHT_ORB";
    }

    private static boolean lllIIIIlIIIlII(int n, int n2) {
        return n >= n2;
    }

    private a(int n2, int n3, boolean bl) {
        this.itemId = n2;
        this.levelRequirement = n3;
        this.canSell = bl;
    }

    /*
     * WARNING - void declaration
     */
    public static a b() {
        void var18;
        int n = Skills.getLevel((Skill)Skill.CRAFTING);
        a a2 = null;
        a[] aArray = a.values();
        int n2 = aArray.length;
        int var19 = lIlIllIllIll[1];
        while (a.lllIIIIlIIIIll(var19, (int)var18)) {
            void var23;
            void var3;
            void var9;
            void var6 = var9[var19];
            if (a.lllIIIIlIIIlII((int)var3, var6.levelRequirement) && (!a.lllIIIIlIIIlIl(var23) || a.lllIIIIlIIIllI(var6.levelRequirement, var23.levelRequirement))) {
                var23 = var6;
            }
            ++var19;
            0;
            if (1 < 3) continue;
            return null;
        }
        return a2;
    }

    static {
        a.lllIIIIlIIIIlI();
        a.lllIIIIlIIIIIl();
        BEER_GLASS = new a(lIlIllIllIll[2], lIlIllIllIll[0], lIlIllIllIll[0]);
        CANDLE_LANTERN = new a(lIlIllIllIll[3], lIlIllIllIll[4], lIlIllIllIll[0]);
        EMPTY_OIL_LAMP = new a(lIlIllIllIll[6], lIlIllIllIll[7], lIlIllIllIll[0]);
        VIAL = new a(lIlIllIllIll[9], lIlIllIllIll[10], lIlIllIllIll[0]);
        EMPTY_FISHBOWL = new a(lIlIllIllIll[11], lIlIllIllIll[12], lIlIllIllIll[0]);
        UNPOWERED_ORB = new a(lIlIllIllIll[14], lIlIllIllIll[15], lIlIllIllIll[0]);
        LANTERN_LENS = new a(lIlIllIllIll[17], lIlIllIllIll[18], lIlIllIllIll[0]);
        EMPTY_LIGHT_ORB = new a(lIlIllIllIll[20], lIlIllIllIll[21], lIlIllIllIll[1]);
        a[] aArray = new a[lIlIllIllIll[22]];
        aArray[a.lIlIllIllIll[1]] = BEER_GLASS;
        aArray[a.lIlIllIllIll[0]] = CANDLE_LANTERN;
        aArray[a.lIlIllIllIll[5]] = EMPTY_OIL_LAMP;
        aArray[a.lIlIllIllIll[8]] = VIAL;
        aArray[a.lIlIllIllIll[4]] = EMPTY_FISHBOWL;
        aArray[a.lIlIllIllIll[13]] = UNPOWERED_ORB;
        aArray[a.lIlIllIllIll[16]] = LANTERN_LENS;
        aArray[a.lIlIllIllIll[19]] = EMPTY_LIGHT_ORB;
        $VALUES = aArray;
    }

    private static boolean lllIIIIlIIIIll(int n, int n2) {
        return n < n2;
    }
}

