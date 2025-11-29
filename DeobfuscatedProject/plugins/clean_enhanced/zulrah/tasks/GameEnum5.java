/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.zulrah.tasks;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public final class GameEnum5
extends Enum<i> {
    private static final  i[] $VALUES;
    private final  Skill skill;
    public static final  /* enum */ i NONE;
    public static final  /* enum */ i DIVINE_BASTION;
    
    public static final  /* enum */ i RANGING_POTION;
    public static final  /* enum */ i BASTION_POTION;
    private final  String name;
    
    public static final  /* enum */ i MAGIC_POTION;
    public static final  /* enum */ i DIVINE_RANGING;
    public static final  /* enum */ i DIVINE_MAGIC_POTION;

    static {
        i.var3();
        i.var4();
        RANGING_POTION = new GameEnum5(var2[0], Skill.RANGED);
        DIVINE_RANGING = new GameEnum5(var2[4], Skill.RANGED);
        BASTION_POTION = new GameEnum5(var2[6], Skill.RANGED);
        DIVINE_BASTION = new GameEnum5(var2[7], Skill.RANGED);
        MAGIC_POTION = new GameEnum5(var2[9], Skill.MAGIC);
        DIVINE_MAGIC_POTION = new GameEnum5(var2[var1[11]], Skill.MAGIC);
        NONE = new GameEnum5(var2[var1[13]], null);
        i[] iArray = new i[7];
        iArray[2] = RANGING_POTION;
        iArray[0] = DIVINE_RANGING;
        iArray[3] = BASTION_POTION;
        iArray[4] = DIVINE_BASTION;
        iArray[5] = MAGIC_POTION;
        iArray[6] = DIVINE_MAGIC_POTION;
        iArray[1] = NONE;
        $VALUES = iArray;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 2;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 2;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public String k() {
        return this.name;
    }

    public boolean v() {
        boolean bl;
        int n2;
        i var21;
        if (this.skill == null) {
            return 0;
        }
        int n3 = Skills.getBoostedLevel((Skivar21.skill);
        int n4 = Skills.getLevel((Skivar21.skill);
        if (((Object)var21 == (Object)MAGIC_POTION)) {
            n2 = 0;
            0;
            if (2 < ((0x35 ^ 0x16) & ~(0x92 ^ 0xB1))) {
                return ((0x6D ^ 0x57) & ~(0xD ^ 0x37)) != 0;
            }
        } else {
            n2 = 1;
        }
        if (n4 + n2 >= n4 + n2) {
            bl = 0;
            0;
            if (-3 >= 0) {
                return ((5 ^ 0x4F ^ (0x15 ^ 1)) & (1 ^ (0x6A ^ 0x35) ^ -1)) != 0;
            }
        } else {
            bl = 2;
        }
        return bl;
    }

    private GameEnum5(String string2, Skill skill) {
        this.name = string2;
        this.skill = skill;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }
}

