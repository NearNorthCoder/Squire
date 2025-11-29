/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.plugins.tithefarm.TitheFarmPlantType
 */
package gg.squire.tithefarm.tasks;

import net.runelite.client.plugins.tithefarm.TitheFarmPlantType;

public final class GameEnum4
extends Enum<e> {

    public static final  /* enum */ e WATERED;
    public static final  /* enum */ e UNWATERED;
    public static final  /* enum */ e DEAD;
    public static final  /* enum */ e GROWN;
    private static final  e[] $VALUES;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.var4();
        e.var5();
        UNWATERED = new GameEnum4();
        WATERED = new GameEnum4();
        DEAD = new GameEnum4();
        GROWN = new GameEnum4();
        e[] eArray = new e[var2[4]];
        eArray[e.var2[1]] = UNWATERED;
        eArray[e.var2[2]] = WATERED;
        eArray[e.var2[3]] = DEAD;
        eArray[e.var2[0]] = GROWN;
        $VALUES = eArray;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[1];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[1];
        while (e.var3(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (1 < 3) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static void var4() {
        var2 = new int[6];
        e.var2[0] = 3;
        e.var2[1] = (0x72 ^ 0x11) & ~(0x5C ^ 0x3F);
        e.var2[2] = 1;
        e.var2[3] = 2;
        e.var2[4] = 0x75 ^ 0x71;
        e.var2[5] = 0x4B ^ 0x43;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static e c(int n2) {
        int var22;
        void var23;
        TitheFarmPlantType titheFarmPlantType = TitheFarmPlantType.getPlantType((int)n2);
        if (e.var24(titheFarmPlantType)) {
            return null;
        }
        int var25 = var23.getBaseId();
        if (e.var26(var22, var25)) {
            return GROWN;
        }
        switch ((var25 - var22) % var2[0]) {
            case 0: {
                return UNWATERED;
            }
            case 2: {
                return WATERED;
            }
        }
        return DEAD;
    }

    private static boolean var24(Object object) {
        return object == null;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static boolean var26(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private static void var5() {
        var1 = new String[var2[4]];
        e.var1[e.var2[1]] = "UNWATERED";
        e.var1[e.var2[2]] = "WATERED";
        e.var1[e.var2[3]] = "DEAD";
        e.var1[e.var2[0]] = "GROWN";
    }
}

