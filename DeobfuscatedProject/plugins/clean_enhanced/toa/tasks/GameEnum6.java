/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.toa.tasks;

import net.runelite.api.Prayer;

public final class GameEnum6
extends Enum<m> {
    
    private final  Prayer mapped;
    private static final  m[] $VALUES;
    public static final  /* enum */ m PIETY;
    public static final  /* enum */ m CHIVALRY;
    public static final  /* enum */ m ULTIMATE_STRENGTH;

    static {
        m.var3();
        m.var4();
        PIETY = new GameEnum6(Prayer.PIETY);
        CHIVALRY = new GameEnum6(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new GameEnum6(Prayer.ULTIMATE_STRENGTH);
        m[] mArray = new m[var2[3]];
        mArray[m.var2[0]] = PIETY;
        mArray[m.var2[1]] = CHIVALRY;
        mArray[m.var2[2]] = ULTIMATE_STRENGTH;
        $VALUES = mArray;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (m.var5(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public Prayer z() {
        return this.mapped;
    }

    private static void var4() {
        var1 = new String[var2[3]];
        m.var1[m.var2[0]] = "PIETY";
        m.var1[m.var2[1]] = "CHIVALRY";
        m.var1[m.var2[2]] = "ULTIMATE_STRENGTH";
    }

    private static void var3() {
        var2 = new int[4];
        m.var2[0] = (0x79 ^ 0x65 ^ (0x6C ^ 0x46)) & (0x46 ^ 0x22 ^ (0x32 ^ 0x60) ^ -1);
        m.var2[1] = 1;
        m.var2[2] = 2;
        m.var2[3] = 3;
    }

    private GameEnum6(Prayer prayer) {
        this.mapped = prayer;
    }
}

