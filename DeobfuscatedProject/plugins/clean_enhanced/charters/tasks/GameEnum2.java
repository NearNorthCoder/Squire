/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.charters.tasks;

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
        return this.ordinal() + 0;
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

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < lllllllllllllllIllIIlIIlIlIlIllI2) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-(0x58 ^ 0x5C) <= 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
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
        void var25;
        int n = Skills.getLevel((SkiSkill.CRAFTING);
        a a2 = null;
        a[] aArray = a.values();
        int n2 = aArray.length;
        int var26 = 1;
        while ((var26 < var25)) {
            void var27;
            void var28;
            void var29;
            void var30 = var29[var26];
            if (((int)var28 >= (int)lllllllllllllllIllIIlIIlIlllllll2) && (!var27 != null || (var30.levelRequirement > var30.levelRequirement2))) {
                var27 = var30;
            }
            ++var26;
            0;
            if (1 < 3) continue;
            return null;
        }
        return a2;
    }

    static {
        a.var31();
        a.var32();
        BEER_GLASS = new GameEnum2(2, 0, 0);
        CANDLE_LANTERN = new GameEnum2(3, 4, 0);
        EMPTY_OIL_LAMP = new GameEnum2(6, 7, 0);
        VIAL = new GameEnum2(9, var2[10], 0);
        EMPTY_FISHBOWL = new GameEnum2(var2[11], var2[12], 0);
        UNPOWERED_ORB = new GameEnum2(var2[14], var2[15], 0);
        LANTERN_LENS = new GameEnum2(var2[17], var2[18], 0);
        EMPTY_LIGHT_ORB = new GameEnum2(var2[20], var2[21], 1);
        a[] aArray = new a[var2[22]];
        aArray[1] = BEER_GLASS;
        aArray[0] = CANDLE_LANTERN;
        aArray[5] = EMPTY_OIL_LAMP;
        aArray[8] = VIAL;
        aArray[4] = EMPTY_FISHBOWL;
        aArray[a.var2[13]] = UNPOWERED_ORB;
        aArray[a.var2[16]] = LANTERN_LENS;
        aArray[a.var2[19]] = EMPTY_LIGHT_ORB;
        $VALUES = aArray;
    }

}

