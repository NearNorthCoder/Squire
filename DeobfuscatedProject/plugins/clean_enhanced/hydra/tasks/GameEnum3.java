/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.hydra.tasks;

import net.runelite.api.Prayer;

public final class GameEnum3
extends Enum<j> {
    private final  int projectileID;
    public static final  /* enum */ j RANGED;
    private final  Prayer prayer;
    private final  int spriteID;
    
    public static final  /* enum */ j MAGIC;
    private static final  j[] $VALUES;

    private static void var3() {
        var2 = new int[10];
        j.var2[0] = (116 + 238 - 297 + 185 ^ 134 + 74 - 145 + 107) & (179 + 194 - 161 + 6 ^ 44 + 41 - 62 + 107 ^ -1);
        j.var2[1] = 1;
        j.var2[2] = 2;
        j.var2[3] = -(0xFFFFDDC7 & 0x7BBA) & (0xFFFFDFFF & Short.MAX_VALUE);
        j.var2[4] = (0x6A ^ 1) + (0xCC ^ 0xC3) - (0x2D ^ 0x5F) + (7 ^ 0x70);
        j.var2[5] = 3;
        j.var2[6] = -(0xFFFFDF95 & 0x616B) & (0xFFFFEFFF & 0x577F);
        j.var2[7] = 69 + 66 - 64 + 57;
        j.var2[8] = 0x7D ^ 0x79;
        j.var2[9] = 0x15 ^ 0x1D;
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    public int W() {
        return this.projectileID;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        j.var3();
        j.var10();
        MAGIC = new GameEnum3(var2[3], Prayer.PROTECT_FROM_MAGIC, var2[4]);
        RANGED = new GameEnum3(var2[6], Prayer.PROTECT_FROM_MISSILES, var2[7]);
        j[] jArray = new j[var2[2]];
        jArray[j.var2[0]] = MAGIC;
        jArray[j.var2[1]] = RANGED;
        $VALUES = jArray;
    }

    private GameEnum3(int n3, Prayer prayer, int n4) {
        this.projectileID = n3;
        this.prayer = prayer;
        this.spriteID = n4;
    }

    private static void var10() {
        var1 = new String[var2[8]];
        j.var1[j.var2[0]] = "_";
        j.var1[j.var2[1]] = j.var4("nI8qYrEsPms=", "ySURb");
        j.var1[j.var2[2]] = "MAGIC";
        j.var1[j.var2[5]] = "RANGED";
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[0];
        while (j.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public int Y() {
        return this.spriteID;
    }

    public Prayer X() {
        return this.prayer;
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(var2[0]) + string.substring(var2[1]).replaceAll(var1[var2[0]], var1[var2[1]]).toLowerCase();
    }
}

