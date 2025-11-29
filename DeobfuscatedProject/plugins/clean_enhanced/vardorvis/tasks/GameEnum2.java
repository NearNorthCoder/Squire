/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package gg.squire.vardorvis.tasks;

import net.runelite.api.Skill;

public final class GameEnum2
extends Enum<k> {
    public static final  /* enum */ k CASTING;
    private final  String name;
    public static final  /* enum */ k CONTROLLED;
    public static final  /* enum */ k DEFENSIVE;
    private static final  k[] $VALUES;
    public static final  /* enum */ k OTHER;
    public static final  /* enum */ k LONGRANGE;
    public static final  /* enum */ k RANGING;
    public static final  /* enum */ k ACCURATE;
    
    private final  Skill[] skills;
    public static final  /* enum */ k DEFENSIVE_CASTING;
    
    public static final  /* enum */ k AGGRESSIVE;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void var10() {
        var1 = new int[19];
        k.var1[0] = (0x56 ^ 0x63 ^ (0x46 ^ 0x2A)) & (0x29 ^ 0x34 ^ (0xEC ^ 0xA8) ^ -1);
        k.var1[1] = 1;
        k.var1[2] = 2;
        k.var1[3] = 3;
        k.var1[4] = 0x41 ^ 0x45;
        k.var1[5] = 0x7C ^ 0x79;
        k.var1[6] = 42 + 2 - 27 + 136 ^ 155 + 151 - 195 + 48;
        k.var1[7] = 0xAC ^ 0xAB;
        k.var1[8] = 49 + 33 - 58 + 157 ^ 96 + 117 - 105 + 81;
        k.var1[9] = 0xA9 ^ 0x8D ^ (0x43 ^ 0x6E);
        k.var1[10] = 11 + 76 - 13 + 87 ^ 128 + 15 - 77 + 105;
        k.var1[11] = 0x1B ^ 0x10;
        k.var1[12] = 0x11 ^ 0x5A ^ (0xD3 ^ 0x94);
        k.var1[13] = 136 + 154 - 220 + 121 ^ 148 + 168 - 149 + 11;
        k.var1[14] = 101 + 14 - 105 + 197 ^ 8 + 94 - -90 + 1;
        k.var1[15] = 0x9E ^ 0xBE ^ (0x32 ^ 0x1D);
        k.var1[16] = 0xA ^ 0x1A;
        k.var1[17] = 0xE3 ^ 0xA5 ^ (0xE3 ^ 0xB4);
        k.var1[18] = 0x42 ^ 0x50;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

    private static void var11() {
        var2 = new String[var1[18]];
        k.var2[k.var1[0]] = "ACCURATE";
        k.var2[k.var1[1]] = "Accurate";
        k.var2[k.var1[2]] = "AGGRESSIVE";
        k.var2[k.var1[3]] = "Aggressive";
        k.var2[k.var1[4]] = "DEFENSIVE";
        k.var2[k.var1[5]] = "Defensive";
        k.var2[k.var1[6]] = "CONTROLLED";
        k.var2[k.var1[7]] = "Controlled";
        k.var2[k.var1[8]] = "RANGING";
        k.var2[k.var1[9]] = "Ranging";
        k.var2[k.var1[10]] = "LONGRANGE";
        k.var2[k.var1[11]] = "Longrange";
        k.var2[k.var1[12]] = "CASTING";
        k.var2[k.var1[13]] = "Casting";
        k.var2[k.var1[14]] = "DEFENSIVE_CASTING";
        k.var2[k.var1[15]] = "Defensive Casting";
        k.var2[k.var1[16]] = "OTHER";
        k.var2[k.var1[17]] = "Other";
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (k.var3(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (((0x50 ^ 5) & ~(0xEE ^ 0xBB)) == 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    static {
        k.var10();
        k.var11();
        Skill[] skillArray = new Skill[var1[1]];
        skillArray[k.var1[0]] = Skill.ATTACK;
        ACCURATE = new GameEnum2(var2[var1[1]], skillArray);
        Skill[] skillArray2 = new Skill[var1[1]];
        skillArray2[k.var1[0]] = Skill.STRENGTH;
        AGGRESSIVE = new GameEnum2(var2[var1[3]], skillArray2);
        Skill[] skillArray3 = new Skill[var1[1]];
        skillArray3[k.var1[0]] = Skill.DEFENCE;
        DEFENSIVE = new GameEnum2(var2[var1[5]], skillArray3);
        Skill[] skillArray4 = new Skill[var1[3]];
        skillArray4[k.var1[0]] = Skill.ATTACK;
        skillArray4[k.var1[1]] = Skill.STRENGTH;
        skillArray4[k.var1[2]] = Skill.DEFENCE;
        CONTROLLED = new GameEnum2(var2[var1[7]], skillArray4);
        Skill[] skillArray5 = new Skill[var1[1]];
        skillArray5[k.var1[0]] = Skill.RANGED;
        RANGING = new GameEnum2(var2[var1[9]], skillArray5);
        Skill[] skillArray6 = new Skill[var1[2]];
        skillArray6[k.var1[0]] = Skill.RANGED;
        skillArray6[k.var1[1]] = Skill.DEFENCE;
        LONGRANGE = new GameEnum2(var2[var1[11]], skillArray6);
        Skill[] skillArray7 = new Skill[var1[1]];
        skillArray7[k.var1[0]] = Skill.MAGIC;
        CASTING = new GameEnum2(var2[var1[13]], skillArray7);
        Skill[] skillArray8 = new Skill[var1[2]];
        skillArray8[k.var1[0]] = Skill.MAGIC;
        skillArray8[k.var1[1]] = Skill.DEFENCE;
        DEFENSIVE_CASTING = new GameEnum2(var2[var1[15]], skillArray8);
        OTHER = new GameEnum2(var2[var1[17]], new Skill[var1[0]]);
        k[] kArray = new k[var1[9]];
        kArray[k.var1[0]] = ACCURATE;
        kArray[k.var1[1]] = AGGRESSIVE;
        kArray[k.var1[2]] = DEFENSIVE;
        kArray[k.var1[3]] = CONTROLLED;
        kArray[k.var1[4]] = RANGING;
        kArray[k.var1[5]] = LONGRANGE;
        kArray[k.var1[6]] = CASTING;
        kArray[k.var1[7]] = DEFENSIVE_CASTING;
        kArray[k.var1[8]] = OTHER;
        $VALUES = kArray;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private GameEnum2(String string2, Skill ... skillArray) {
        this.name = string2;
        this.skills = skillArray;
    }

    public Skill[] N() {
        return this.skills;
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    public String M() {
        return this.name;
    }
}

