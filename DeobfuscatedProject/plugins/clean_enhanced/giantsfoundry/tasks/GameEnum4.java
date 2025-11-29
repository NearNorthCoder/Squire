/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.giantsfoundry.tasks;

public final class GameEnum4
extends Enum<d> {
    public static final  /* enum */ d NONE;
    public static final  d[] values;
    public static final  /* enum */ d SPIKED;
    private static final  d[] $VALUES;
    public static final  /* enum */ d BROAD;
    public static final  /* enum */ d LIGHT;
    public static final  /* enum */ d HEAVY;
    public static final  /* enum */ d FLAT;

    public static final  /* enum */ d NARROW;

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    private static void var3() {
        var1 = new int[9];
        d.var1[0] = (0xDD ^ 0xBC) & ~(0x76 ^ 0x17);
        d.var1[1] = 1;
        d.var1[2] = 2;
        d.var1[3] = 3;
        d.var1[4] = 0x7E ^ 0x47 ^ (0x32 ^ 0xF);
        d.var1[5] = 0xAF ^ 0xAA;
        d.var1[6] = 0x3D ^ 8 ^ (0xAB ^ 0x98);
        d.var1[7] = 0x15 ^ 0x12;
        d.var1[8] = 0 ^ 5 ^ (0xD ^ 0);
    }

    public static d a(int n2) {
        if (!d.var4(n2) || d.var5(n2, values.length)) {
            return NONE;
        }
        return values[n2];
    }

    static {
        d.var3();
        d.var6();
        NONE = new GameEnum4();
        NARROW = new GameEnum4();
        LIGHT = new GameEnum4();
        FLAT = new GameEnum4();
        BROAD = new GameEnum4();
        HEAVY = new GameEnum4();
        SPIKED = new GameEnum4();
        d[] dArray = new d[var1[7]];
        dArray[d.var1[0]] = NONE;
        dArray[d.var1[1]] = NARROW;
        dArray[d.var1[2]] = LIGHT;
        dArray[d.var1[3]] = FLAT;
        dArray[d.var1[4]] = BROAD;
        dArray[d.var1[5]] = HEAVY;
        dArray[d.var1[6]] = SPIKED;
        $VALUES = dArray;
        values = d.values();
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static boolean var5(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean var4(int n2) {
        return n2 >= 0;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var1[0];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var1[0];
        while (d.var7(var22, var21)) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static void var6() {
        var2 = new String[var1[7]];
        d.var2[d.var1[0]] = "NONE";
        d.var2[d.var1[1]] = "NARROW";
        d.var2[d.var1[2]] = "LIGHT";
        d.var2[d.var1[3]] = "FLAT";
        d.var2[d.var1[4]] = "BROAD";
        d.var2[d.var1[5]] = "HEAVY";
        d.var2[d.var1[6]] = "SPIKED";
    }
}

