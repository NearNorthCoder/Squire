/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.slayer.tasks;

import net.runelite.api.coords.WorldPoint;

public final class GameEnum2
extends Enum<a> {

    private final  WorldPoint worldPoint;
    private static final  a[] $VALUES;
    public static final  /* enum */ a KONAR;
    public static final  /* enum */ a NIEVE;
    public static final  /* enum */ a DURADEl;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (a.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        a.var14();
        a.var15();
        NIEVE = new GameEnum2(new WorldPoint(var1[1], var1[2], var1[0]));
        DURADEl = new GameEnum2(new WorldPoint(var1[4], var1[5], var1[3]));
        KONAR = new GameEnum2(new WorldPoint(var1[7], var1[8], var1[0]));
        a[] aArray = new a[var1[9]];
        aArray[a.var1[0]] = NIEVE;
        aArray[a.var1[3]] = DURADEl;
        aArray[a.var1[6]] = KONAR;
        $VALUES = aArray;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    private static void var15() {
        var2 = new String[var1[9]];
        a.var2[a.var1[0]] = "NIEVE";
        a.var2[a.var1[3]] = "DURADEl";
        a.var2[a.var1[6]] = "KONAR";
    }

    private static void var14() {
        var1 = new int[11];
        a.var1[0] = (0x49 ^ 0x6C ^ (0x91 ^ 0xA3)) & (0xB6 ^ 0x9F ^ (0x83 ^ 0xBD) ^ -1);
        a.var1[1] = -(0xFFFFEBFB & 0x346E) & (0xFFFFBDEF & 0x6BFB);
        a.var1[2] = -(0xFFFFB6AB & 0x7B55) & (0xFFFFBF5F & Short.MAX_VALUE);
        a.var1[3] = 1;
        a.var1[4] = -(0xFFFFFECF & 0x71F3) & (0xFFFFFFFF & 0x7BF7);
        a.var1[5] = -(0xFFFFB5EF & 0x7E1A) & (0xFFFFFFBD & 0x3FEF);
        a.var1[6] = 2;
        a.var1[7] = -(0xFFFFCE47 & 0x33B9) & (0xFFFFA75D & 0x5FBE);
        a.var1[8] = 0xFFFFBEED & 0x4FDE;
        a.var1[9] = 3;
        a.var1[10] = 0x39 ^ 0x78 ^ (0xE4 ^ 0xAD);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public WorldPoint k() {
        return this.worldPoint;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum2(WorldPoint worldPoint) {
        this.worldPoint = worldPoint;
    }
}

