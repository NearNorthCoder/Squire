/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.HeadIcon
 */
package gg.squire.vardorvis.tasks;

import java.util.List;
import net.runelite.api.HeadIcon;

public final class GameEnum3
extends Enum<j> {
    private static final  j[] $VALUES;
    public static final  /* enum */ j RANGED;
    public static final  /* enum */ j MAGIC;
    
    private final  HeadIcon protection;
    public static final  /* enum */ j STAB;
    
    public static final  /* enum */ j CRUSH;
    private final  int styleSpriteId;
    public static final  /* enum */ j SLASH;
    static  j[] MELEE_STYLES;

    public int L() {
        return this.styleSpriteId;
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    static {
        j.var4();
        j.var5();
        STAB = new GameEnum3(HeadIcon.MELEE, var2[1]);
        SLASH = new GameEnum3(HeadIcon.MELEE, var2[3]);
        CRUSH = new GameEnum3(HeadIcon.MELEE, var2[5]);
        RANGED = new GameEnum3(HeadIcon.RANGED, var2[7]);
        MAGIC = new GameEnum3(HeadIcon.MAGIC, var2[9]);
        j[] jArray = new j[var2[10]];
        jArray[j.var2[0]] = STAB;
        jArray[j.var2[2]] = SLASH;
        jArray[j.var2[4]] = CRUSH;
        jArray[j.var2[6]] = RANGED;
        jArray[j.var2[8]] = MAGIC;
        $VALUES = jArray;
        j[] jArray2 = new j[var2[6]];
        jArray2[j.var2[0]] = STAB;
        jArray2[j.var2[2]] = SLASH;
        jArray2[j.var2[4]] = CRUSH;
        MELEE_STYLES = jArray2;
    }

    private static void var5() {
        var1 = new String[var2[10]];
        j.var1[j.var2[0]] = "STAB";
        j.var1[j.var2[2]] = "SLASH";
        j.var1[j.var2[4]] = "CRUSH";
        j.var1[j.var2[6]] = "RANGED";
        j.var1[j.var2[8]] = "MAGIC";
    }

    public HeadIcon K() {
        return this.protection;
    }

    private GameEnum3(HeadIcon headIcon, int n3) {
        this.protection = headIcon;
        this.styleSpriteId = n3;
    }

    private static void var4() {
        var2 = new int[12];
        j.var2[0] = (0x32 ^ 0x2C ^ (0x3A ^ 0x3C)) & (103 + 204 - 168 + 80 ^ 164 + 131 - 169 + 69 ^ -1);
        j.var2[1] = 102 + 228 - 304 + 214;
        j.var2[2] = 1;
        j.var2[3] = (0x53 ^ 0x5E) + (4 + 161 - 27 + 31) - -(0x23 ^ 0x2E) + (0x15 ^ 0x3E);
        j.var2[4] = 2;
        j.var2[5] = 17 + 135 - 17 + 33 + (0x3B ^ 0x32) - -(0xE1 ^ 0xAB) + (0x49 ^ 0x4D);
        j.var2[6] = 3;
        j.var2[7] = (0xC ^ 0x27) + (109 + 99 - 198 + 175) - (35 + 141 - 110 + 87) + (0xD0 ^ 0xAD);
        j.var2[8] = 0x7A ^ 0x7E;
        j.var2[9] = 50 + 90 - 24 + 86;
        j.var2[10] = 124 + 3 - 46 + 83 ^ 155 + 157 - 284 + 133;
        j.var2[11] = 0x19 ^ 0x33 ^ (0x2D ^ 0xF);
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (j.var3(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public boolean J() {
        return List.of(MELEE_STYLES).contains((Object)this);
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }
}

