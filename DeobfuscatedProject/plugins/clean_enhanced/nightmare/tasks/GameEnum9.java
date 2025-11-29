/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package gg.squire.nightmare.tasks;

import java.util.Objects;
import net.runelite.api.Skill;
import gg.squire.nightmare.tasks.GameEnum10;
import gg.squire.nightmare.tasks.GameEnum3;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.GameEnum4;

public final class GameEnum9
extends Enum<r> {
    public static final  /* enum */ r CLAW;
    public static final  /* enum */ r WHIP;
    public static final  /* enum */ r AXE;
    public static final  /* enum */ r SPEAR;
    public static final  /* enum */ r PICKAXE;
    private final  int varpValue;
    public static final  /* enum */ r SLASHING_SWORD;
    public static final  /* enum */ r BULWARK;
    public static final  /* enum */ r STAFF;
    public static final  /* enum */ r SALAMANDER;
    public static final  /* enum */ r BLUNT_WEAPON;

    public static final  /* enum */ r TYPE_29;
    public static final  /* enum */ r SPIKED_WEAPON;
    public static final  /* enum */ r GUN;
    public static final  /* enum */ r UNARMED;
    public static final  /* enum */ r TYPE_22;
    public static final  /* enum */ r STABBING_SWORD;
    public static final  /* enum */ r HALBERD;
    public static final  /* enum */ r TRIDENT_WEAPON;
    public static final  /* enum */ r BLADED_STAFF;
    public static final  /* enum */ r BOW;
    private final  o[] combatOptions;
    public static final  /* enum */ r SCYTHE;
    public static final  /* enum */ r CROSSBOW;
    private static final  r[] $VALUES;
    public static final  /* enum */ r THROWN_WEAPON;
    public static final  /* enum */ r TYPE_28;
    public static final  /* enum */ r TWO_HANDED_SWORD;
    public static final  /* enum */ r POLESTAVE;
    public static final  /* enum */ r TYPE_25;
    public static final  /* enum */ r ABYSSAL_BLUDGEON;
    public static final  /* enum */ r TYPE_24;
    public static final  /* enum */ r CHINCHOMPA;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (r.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0x7F ^ 0x7B) > 3) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void var14() {
        var1 = new int[31];
        r.var1[0] = (0x6A ^ 0x73 ^ (0x69 ^ 0x36)) & (103 + 127 - 112 + 128 ^ 37 + 36 - -19 + 84 ^ -1);
        r.var1[1] = 0x34 ^ 1 ^ (0x1E ^ 0x2F);
        r.var1[2] = 1;
        r.var1[3] = 2;
        r.var1[4] = 3;
        r.var1[5] = 153 + 71 - 101 + 62 ^ 57 + 141 - 119 + 109;
        r.var1[6] = 13 + 79 - 29 + 117 ^ 67 + 63 - -12 + 36;
        r.var1[7] = 0x49 ^ 0x4E;
        r.var1[8] = 0x9E ^ 0x96;
        r.var1[9] = 0xCB ^ 0xC2;
        r.var1[10] = 0xA2 ^ 0xA8;
        r.var1[11] = 0x69 ^ 0x62;
        r.var1[12] = 0x69 ^ 0x65;
        r.var1[13] = 87 + 15 - -82 + 21 ^ 43 + 117 - 53 + 85;
        r.var1[14] = 0xA0 ^ 0xAE;
        r.var1[15] = 0x20 ^ 0x7F ^ (0xEE ^ 0xBE);
        r.var1[16] = 43 + 6 - 40 + 205 ^ 91 + 119 - 17 + 5;
        r.var1[17] = 0xBC ^ 0x95 ^ (0xB4 ^ 0x8C);
        r.var1[18] = 0x75 ^ 0x67;
        r.var1[19] = 0x49 ^ 0x5A;
        r.var1[20] = 0xBD ^ 0xB4 ^ (0x65 ^ 0x78);
        r.var1[21] = 59 + 40 - 53 + 85 ^ 89 + 93 - 155 + 123;
        r.var1[22] = 0x87 ^ 0xC5 ^ (0xFB ^ 0xAF);
        r.var1[23] = 0x17 ^ 0;
        r.var1[24] = 0xA0 ^ 0xB8;
        r.var1[25] = 37 + 108 - 49 + 125 ^ 186 + 153 - 144 + 1;
        r.var1[26] = 0x56 ^ 0x4C;
        r.var1[27] = 0xED ^ 0x96 ^ (0xE ^ 0x6E);
        r.var1[28] = 0x7E ^ 0x2E ^ (0x71 ^ 0x3D);
        r.var1[29] = 48 + 60 - 94 + 161 ^ 92 + 146 - 119 + 59;
        r.var1[30] = 0x36 ^ 0x28;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var15() {
        var2 = new String[var1[30]];
        r.var2[r.var1[0]] = "UNARMED";
        r.var2[r.var1[2]] = "AXE";
        r.var2[r.var1[3]] = "BLUNT_WEAPON";
        r.var2[r.var1[4]] = "BOW";
        r.var2[r.var1[1]] = "CLAW";
        r.var2[r.var1[5]] = "CROSSBOW";
        r.var2[r.var1[6]] = "SALAMANDER";
        r.var2[r.var1[7]] = "CHINCHOMPA";
        r.var2[r.var1[8]] = "GUN";
        r.var2[r.var1[9]] = "SLASHING_SWORD";
        r.var2[r.var1[10]] = "TWO_HANDED_SWORD";
        r.var2[r.var1[11]] = "PICKAXE";
        r.var2[r.var1[12]] = "HALBERD";
        r.var2[r.var1[13]] = "POLESTAVE";
        r.var2[r.var1[14]] = "SCYTHE";
        r.var2[r.var1[15]] = "SPEAR";
        r.var2[r.var1[16]] = "SPIKED_WEAPON";
        r.var2[r.var1[17]] = "STABBING_SWORD";
        r.var2[r.var1[18]] = "STAFF";
        r.var2[r.var1[19]] = "THROWN_WEAPON";
        r.var2[r.var1[20]] = "WHIP";
        r.var2[r.var1[21]] = "BLADED_STAFF";
        r.var2[r.var1[22]] = "TYPE_22";
        r.var2[r.var1[23]] = "TRIDENT_WEAPON";
        r.var2[r.var1[24]] = "TYPE_24";
        r.var2[r.var1[25]] = "TYPE_25";
        r.var2[r.var1[26]] = "ABYSSAL_BLUDGEON";
        r.var2[r.var1[27]] = "BULWARK";
        r.var2[r.var1[28]] = "TYPE_28";
        r.var2[r.var1[29]] = "TYPE_29";
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public boolean bj() {
        return Objects.equals((Object)p.bs(), (Object)this);
    }

    private GameEnum9(int n3, o ... oArray) {
        this.varpValue = n3;
        this.combatOptions = oArray;
    }

    public int bD() {
        return this.varpValue;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    public o[] bE() {
        return this.combatOptions;
    }
}

