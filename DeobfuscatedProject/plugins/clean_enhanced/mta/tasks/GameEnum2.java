/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mta.tasks;

import java.util.Objects;

public final class GameEnum2
extends Enum<c> {
    private final  int childID = 6;
    private static final  c[] $VALUES;
    
    private final  int parentID;
    
    public static final  /* enum */ c ALCHEMY;
    public static final  /* enum */ c TELEKENETIC;
    public static final  /* enum */ c ENCHANTMENT;
    public static final  /* enum */ c GRAVEYARD;
    private final  String teleportObject;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        c.var9();
        c.var10();
        GRAVEYARD = new GameEnum2(var2[var1[2]], var1[3]);
        TELEKENETIC = new GameEnum2(var2[var1[5]], var1[6]);
        ALCHEMY = new GameEnum2(var2[var1[8]], var1[9]);
        ENCHANTMENT = new GameEnum2(var2[var1[10]], var1[11]);
        c[] cArray = new c[var1[7]];
        cArray[c.var1[1]] = GRAVEYARD;
        cArray[c.var1[2]] = TELEKENETIC;
        cArray[c.var1[4]] = ALCHEMY;
        cArray[c.var1[5]] = ENCHANTMENT;
        $VALUES = cArray;
    }

    private static void var9() {
        var1 = new int[13];
        c.var1[0] = 0xC2 ^ 0xC4;
        c.var1[1] = (3 ^ (0x46 ^ 0x1C)) & (5 + 23 - -81 + 43 ^ 107 + 52 - 19 + 53 ^ -1);
        c.var1[2] = 1;
        c.var1[3] = (0x39 ^ 0x36) + (40 + 139 - 150 + 122) - (44 + 9 - -62 + 30) + (82 + 91 - 47 + 49);
        c.var1[4] = 2;
        c.var1[5] = 3;
        c.var1[6] = (0x3F ^ 0x2C) + (0x90 ^ 0xC3) - -(0x68 ^ 0x45) + (0x83 ^ 0xB0);
        c.var1[7] = 0xBA ^ 0xBE;
        c.var1[8] = 0x43 ^ 0x4D ^ (0xC8 ^ 0xC3);
        c.var1[9] = 112 + 144 - 145 + 83;
        c.var1[10] = 0xE1 ^ 0xC5 ^ (0x76 ^ 0x55);
        c.var1[11] = (0xC9 ^ 0xA2) + (0xA4 ^ 0xA0) - -(0x1D ^ 0x5C) + (0x1F ^ 0xC);
        c.var1[12] = 0xA ^ 2;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private GameEnum2(String string2, int n3) {
        this.childID = var1[0];
        this.parentID = n3;
        this.teleportObject = string2;
    }

    public int h() {
        Objects.requireNonNull(this);
        0;
        return var1[0];
    }

    private static void var10() {
        var2 = new String[var1[12]];
        c.var2[c.var1[1]] = "GRAVEYARD";
        c.var2[c.var1[2]] = "Graveyard Teleport";
        c.var2[c.var1[4]] = "TELEKENETIC";
        c.var2[c.var1[5]] = "Telekinetic Teleport";
        c.var2[c.var1[7]] = "ALCHEMY";
        c.var2[c.var1[8]] = "Alchemists Teleport";
        c.var2[c.var1[0]] = "ENCHANTMENT";
        c.var2[c.var1[10]] = "Enchanters Teleport";
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[1];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[1];
        while (c.var17(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public String g() {
        return this.teleportObject;
    }

    public int f() {
        return this.parentID;
    }
}

