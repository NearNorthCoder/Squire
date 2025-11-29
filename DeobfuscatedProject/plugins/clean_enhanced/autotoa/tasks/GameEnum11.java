/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponMap
 *  com.openosrs.client.util.WeaponStyle
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.autotoa.tasks;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import java.util.ArrayList;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import gg.squire.autotoa.tasks.BHelper;

public final class GameEnum11
extends Enum<a> {
    private final  int boostAmount;
    private final  int percentage;
    
    public static final  /* enum */ a ANCIENT_BREW;
    public static final  /* enum */ a DIVINE_MAGIC_POTION;
    public static final  /* enum */ a SUPER_DEFENCE;
    public static final  /* enum */ a DIVINE_SUPER_COMBAT;
    public static final  /* enum */ a SUPER_COMBAT;
    public static final  /* enum */ a SUPER_ATTACK;
    private final  String name;
    private final  Skill[] skills;
    public static final  /* enum */ a BASTION_POTION;
    private static final  a[] $VALUES;
    public static final  /* enum */ a RANGING_POTION;
    
    public static final  /* enum */ a DIVINE_RANGING_POTION;
    public static final  /* enum */ a MAGIC_POTION;
    public static final  /* enum */ a SUPER_STRENGTH;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public int GameEnum11(Skill skill) {
        return this.boostAmount + Skills.getLevel((Skiskill) * this.percentage / var1[2];
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static void var5() {
        var1 = new int[24];
        a.var1[0] = (0x57 ^ 0x51) & ~(0x74 ^ 0x72);
        a.var1[1] = 1;
        a.var1[2] = 0xF ^ 0x6B;
        a.var1[3] = 0x54 ^ 0x51;
        a.var1[4] = 0xA9 ^ 0xA6;
        a.var1[5] = 3;
        a.var1[6] = 2;
        a.var1[7] = 0x7A ^ 0x7E;
        a.var1[8] = 0x77 ^ 0x29 ^ (0x68 ^ 0x30);
        a.var1[9] = 0x73 ^ 0x74;
        a.var1[10] = 0x92 ^ 0x9A;
        a.var1[11] = 0x6A ^ 0x63;
        a.var1[12] = 0xA9 ^ 0xA3;
        a.var1[13] = 53 + 129 - 31 + 21 ^ 96 + 33 - 84 + 122;
        a.var1[14] = 168 + 27 - 132 + 139 ^ 76 + 115 - 6 + 13;
        a.var1[15] = 0x44 ^ 0x49;
        a.var1[16] = 127 + 101 - 145 + 97 ^ 31 + 107 - 50 + 98;
        a.var1[17] = 77 + 29 - -36 + 44 ^ 114 + 49 - 133 + 140;
        a.var1[18] = 0x72 ^ 0x1D ^ (0xE9 ^ 0x97);
        a.var1[19] = 0x3B ^ 0x29;
        a.var1[20] = 54 + 50 - 90 + 168 ^ 72 + 13 - -11 + 69;
        a.var1[21] = 0x4F ^ 0x42 ^ (0x69 ^ 0x70);
        a.var1[22] = 0x4C ^ 0x59;
        a.var1[23] = 82 + 105 - 69 + 20 ^ 41 + 34 - 61 + 142;
    }

    private GameEnum11(String string2, int n3, int n4, Skill ... skillArray) {
        this.name = string2;
        this.percentage = n4;
        this.skills = skillArray;
        this.boostAmount = n3;
    }

    public Skill[] m() {
        return this.skills;
    }

    /*
     * WARNING - void declaration
     */
    public static a[] GameEnum11(Item item) {
        void var2_2;
        Item var6;
        if (a.var4(item)) {
            return new a[var1[0]];
        }
        WeaponStyle var7 = WeaponMap.StyleMap.getOrDefault(var6.getId(), WeaponStyle.MELEE);
        ArrayList<a> var8 = new ArrayList<a>();
        a[] var9 = a.values();
        int var10 = var9.length;
        int var11 = var1[0];
        while (a.var12(var11, var10)) {
            a var13 = var9[var11];
            Skill[] var14 = var13.m();
            int var15 = var14.length;
            int var16 = var1[0];
            while (a.var12(var16, var15)) {
                Skill var17 = var14[var16];
                if (a.var3(a.GameEnum11(var17, var7) ? 1 : 0)) {
                    var8.add(var13);
                    0;
                    0;
                    if (-1 != 3) break;
                    return null;
                }
                ++var16;
                0;
                if (3 > 0) continue;
                return null;
            }
            ++var11;
            0;
            if (2 < 3) continue;
            return null;
        }
        return var2_2.toArray(new a[var1[0]]);
    }

    private static void var18() {
        var2 = new String[var1[23]];
        a.var2[a.var1[0]] = "SUPER_COMBAT";
        a.var2[a.var1[1]] = "Super combat potion";
        a.var2[a.var1[6]] = "DIVINE_SUPER_COMBAT";
        a.var2[a.var1[5]] = "Divine super combat potion";
        a.var2[a.var1[7]] = "SUPER_STRENGTH";
        a.var2[a.var1[3]] = "Super strength";
        a.var2[a.var1[8]] = "SUPER_ATTACK";
        a.var2[a.var1[9]] = "Super attack";
        a.var2[a.var1[10]] = "SUPER_DEFENCE";
        a.var2[a.var1[11]] = "Super defence";
        a.var2[a.var1[12]] = "RANGING_POTION";
        a.var2[a.var1[13]] = "Ranging potion";
        a.var2[a.var1[14]] = "DIVINE_RANGING_POTION";
        a.var2[a.var1[15]] = "Divine ranging potion";
        a.var2[a.var1[16]] = "BASTION_POTION";
        a.var2[a.var1[4]] = "Bastion potion";
        a.var2[a.var1[17]] = "MAGIC_POTION";
        a.var2[a.var1[18]] = "Magic potion";
        a.var2[a.var1[19]] = "DIVINE_MAGIC_POTION";
        a.var2[a.var1[20]] = "Divine magic potion";
        a.var2[a.var1[21]] = "ANCIENT_BREW";
        a.var2[a.var1[22]] = "Ancient brew";
    }

    /*
     * WARNING - void declaration
     */
    public static boolean GameEnum11(Skill skill, WeaponStyle weaponStyle) {
        switch (b.C[skill.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                boolean bl2;
                void var19;
                if (a.var20(var19, WeaponStyle.MELEE)) {
                    bl2 = var1[1];
                    0;
                    if (-2 >= 0) {
                        return ((0x97 ^ 0xC3) & ~(0x92 ^ 0xC6)) != 0;
                    }
                } else {
                    bl2 = var1[0];
                }
                return bl2;
            }
            case 4: {
                boolean bl3;
                void var19;
                if (a.var20(var19, WeaponStyle.RANGE)) {
                    bl3 = var1[1];
                    0;
                    if (((0xCC ^ 0x82 ^ (0x17 ^ 0x65)) & (128 + 34 - 37 + 64 ^ 48 + 94 - 81 + 68 ^ -1)) != 0) {
                        return ((0x5B ^ 0x74 ^ (0x1B ^ 0x13)) & (0x35 ^ 0x23 ^ (0x27 ^ 0x16) ^ -1)) != 0;
                    }
                } else {
                    bl3 = var1[0];
                }
                return bl3;
            }
            case 5: {
                boolean bl4;
                void var19;
                if (a.var20(var19, WeaponStyle.MAGIC)) {
                    bl4 = var1[1];
                    0;
                    if null != null {
                        return ((3 ^ 0x4F ^ (0x50 ^ 0x4B)) & (0x3A ^ 0x75 ^ (0x8A ^ 0x92) ^ -1)) != 0;
                    }
                } else {
                    bl4 = var1[0];
                }
                return bl4;
            }
        }
        return var1[0];
    }

    public String l() {
        return this.name;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = var1[0];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = var1[0];
        while (a.var12(var35, var34)) {
            char var36 = var33[var35];
            var30.append((char)(var36 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if (((66 + 99 - 131 + 164 ^ 46 + 42 - -49 + 5) & (0xC5 ^ 0x97 ^ (0x2D ^ 0x37) ^ -1)) >= ((23 + 5 - -87 + 102 ^ 71 + 32 - -33 + 48) & (10 + 57 - -145 + 8 ^ 117 + 69 - 147 + 150 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var30);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var20(Object object, Object object2) {
        return object == object2;
    }

        catch (Exception var42) {
            var42.printStackTrace();
            return null;
        }
    }

    static {
        a.var5();
        a.var18();
        Skill[] skillArray = new Skill[var1[5]];
        skillArray[a.var1[0]] = Skill.STRENGTH;
        skillArray[a.var1[1]] = Skill.ATTACK;
        skillArray[a.var1[6]] = Skill.DEFENCE;
        SUPER_COMBAT = new GameEnum11(var2[var1[1]], var1[3], var1[4], skillArray);
        Skill[] skillArray2 = new Skill[var1[5]];
        skillArray2[a.var1[0]] = Skill.STRENGTH;
        skillArray2[a.var1[1]] = Skill.ATTACK;
        skillArray2[a.var1[6]] = Skill.DEFENCE;
        DIVINE_SUPER_COMBAT = new GameEnum11(var2[var1[5]], var1[3], var1[4], skillArray2);
        Skill[] skillArray3 = new Skill[var1[1]];
        skillArray3[a.var1[0]] = Skill.STRENGTH;
        SUPER_STRENGTH = new GameEnum11(var2[var1[3]], var1[3], var1[4], skillArray3);
        Skill[] skillArray4 = new Skill[var1[1]];
        skillArray4[a.var1[0]] = Skill.ATTACK;
        SUPER_ATTACK = new GameEnum11(var2[var1[9]], var1[3], var1[4], skillArray4);
        Skill[] skillArray5 = new Skill[var1[1]];
        skillArray5[a.var1[0]] = Skill.DEFENCE;
        SUPER_DEFENCE = new GameEnum11(var2[var1[11]], var1[3], var1[4], skillArray5);
        Skill[] skillArray6 = new Skill[var1[1]];
        skillArray6[a.var1[0]] = Skill.RANGED;
        RANGING_POTION = new GameEnum11(var2[var1[13]], var1[7], var1[12], skillArray6);
        Skill[] skillArray7 = new Skill[var1[1]];
        skillArray7[a.var1[0]] = Skill.RANGED;
        DIVINE_RANGING_POTION = new GameEnum11(var2[var1[15]], var1[7], var1[12], skillArray7);
        Skill[] skillArray8 = new Skill[var1[6]];
        skillArray8[a.var1[0]] = Skill.RANGED;
        skillArray8[a.var1[1]] = Skill.DEFENCE;
        BASTION_POTION = new GameEnum11(var2[var1[4]], var1[7], var1[12], skillArray8);
        Skill[] skillArray9 = new Skill[var1[1]];
        skillArray9[a.var1[0]] = Skill.MAGIC;
        MAGIC_POTION = new GameEnum11(var2[var1[18]], var1[7], var1[0], skillArray9);
        Skill[] skillArray10 = new Skill[var1[1]];
        skillArray10[a.var1[0]] = Skill.MAGIC;
        DIVINE_MAGIC_POTION = new GameEnum11(var2[var1[20]], var1[7], var1[0], skillArray10);
        Skill[] skillArray11 = new Skill[var1[1]];
        skillArray11[a.var1[0]] = Skill.MAGIC;
        ANCIENT_BREW = new GameEnum11(var2[var1[22]], var1[6], var1[3], skillArray11);
        a[] aArray = new a[var1[13]];
        aArray[a.var1[0]] = SUPER_COMBAT;
        aArray[a.var1[1]] = DIVINE_SUPER_COMBAT;
        aArray[a.var1[6]] = SUPER_STRENGTH;
        aArray[a.var1[5]] = SUPER_ATTACK;
        aArray[a.var1[7]] = SUPER_DEFENCE;
        aArray[a.var1[3]] = RANGING_POTION;
        aArray[a.var1[8]] = DIVINE_RANGING_POTION;
        aArray[a.var1[9]] = BASTION_POTION;
        aArray[a.var1[10]] = MAGIC_POTION;
        aArray[a.var1[11]] = DIVINE_MAGIC_POTION;
        aArray[a.var1[12]] = ANCIENT_BREW;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }
}

