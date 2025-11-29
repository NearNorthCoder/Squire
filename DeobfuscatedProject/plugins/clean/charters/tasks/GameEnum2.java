/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.charters.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class GameEnum2
extends Enum<a> {
    private final  boolean canSell;
    public static final  /* enum */ a EMPTY_FISHBOWL;
    private static final  a[] $VALUES;
    public static final  /* enum */ a CANDLE_LANTERN;
    private final  int itemId;
    private final  int levelRequirement;
    
    public static final  /* enum */ a UNPOWERED_ORB;
    public static final  /* enum */ a VIAL;
    public static final  /* enum */ a LANTERN_LENS;
    
    public static final  /* enum */ a EMPTY_OIL_LAMP;
    public static final  /* enum */ a BEER_GLASS;
    public static final  /* enum */ a EMPTY_LIGHT_ORB;

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    public int GameEnum2() {
        return this.ordinal() + lIlIllIllIll[0];
    }

    private static boolean lllIIIIlIIIlIl(Object object) {
        return object != null;
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

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static boolean lllIIIIlIIIllI(int n, int n2) {
        return n > n2;
    }

        return String.valueOf(var1);
    }

    private static void lllIIIIlIIIIIl() {
        lIlIllIllIlI = new String[lIlIllIllIll[22]];
        a.lIlIllIllIlI[a.lIlIllIllIll[1]] = "BEER_GLASS";
        a.lIlIllIllIlI[a.lIlIllIllIll[0]] = "CANDLE_LANTERN";
        a.lIlIllIllIlI[a.lIlIllIllIll[5]] = "EMPTY_OIL_LAMP";
        a.lIlIllIllIlI[a.lIlIllIllIll[8]] = "VIAL";
        a.lIlIllIllIlI[a.lIlIllIllIll[4]] = "EMPTY_FISHBOWL";
        a.lIlIllIllIlI[a.lIlIllIllIll[13]] = "UNPOWERED_ORB";
        a.lIlIllIllIlI[a.lIlIllIllIll[16]] = "LANTERN_LENS";
        a.lIlIllIllIlI[a.lIlIllIllIll[19]] = "EMPTY_LIGHT_ORB";
    }

    private static boolean lllIIIIlIIIlII(int n, int n2) {
        return n >= n2;
    }

    private GameEnum2(int n2, int n3, boolean bl) {
        this.itemId = n2;
        this.levelRequirement = n3;
        this.canSell = bl;
    }

    /*
     * WARNING - void declaration
     */
    public static a b() {
        void var2;
        int n = Skills.getLevel((Skill)Skill.CRAFTING);
        a a2 = null;
        a[] aArray = a.values();
        int n2 = aArray.length;
        int var3 = lIlIllIllIll[1];
        while (a.lllIIIIlIIIIll(var3, (int)var2)) {
            void var4;
            void var5;
            void var6;
            void var7 = var6[var3];
            if (a.lllIIIIlIIIlII((int)var5, var7.levelRequirement) && (!a.lllIIIIlIIIlIl(var4) || a.lllIIIIlIIIllI(var7.levelRequirement, var4.levelRequirement))) {
                var4 = var7;
            }
            ++var3;

            if (1 < 3) continue;
            return null;
        }
        return a2;
    }

    static {
        a.lllIIIIlIIIIlI();
        a.lllIIIIlIIIIIl();
        BEER_GLASS = new GameEnum2(lIlIllIllIll[2], lIlIllIllIll[0], lIlIllIllIll[0]);
        CANDLE_LANTERN = new GameEnum2(lIlIllIllIll[3], lIlIllIllIll[4], lIlIllIllIll[0]);
        EMPTY_OIL_LAMP = new GameEnum2(lIlIllIllIll[6], lIlIllIllIll[7], lIlIllIllIll[0]);
        VIAL = new GameEnum2(lIlIllIllIll[9], lIlIllIllIll[10], lIlIllIllIll[0]);
        EMPTY_FISHBOWL = new GameEnum2(lIlIllIllIll[11], lIlIllIllIll[12], lIlIllIllIll[0]);
        UNPOWERED_ORB = new GameEnum2(lIlIllIllIll[14], lIlIllIllIll[15], lIlIllIllIll[0]);
        LANTERN_LENS = new GameEnum2(lIlIllIllIll[17], lIlIllIllIll[18], lIlIllIllIll[0]);
        EMPTY_LIGHT_ORB = new GameEnum2(lIlIllIllIll[20], lIlIllIllIll[21], lIlIllIllIll[1]);
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

