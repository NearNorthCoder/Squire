/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.giantsfoundry.tasks;

public final class GameEnum6
extends Enum<h> {
    public static final  /* enum */ h RED;
    public static final  /* enum */ h GREEN;
    
    public static final  /* enum */ h YELLOW;
    private final  int highlightChildId;
    private final  int childId;
    
    private static final  h[] $VALUES;

    private static void var3() {
        var1 = new String[var2[9]];
        h.var1[h.var2[0]] = "RED";
        h.var1[h.var2[3]] = "YELLOW";
        h.var1[h.var2[6]] = "GREEN";
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static void var10() {
        var2 = new int[10];
        h.var2[0] = (0x5B ^ 0x13) & ~(0x57 ^ 0x1F) & ~((0x1D ^ 0x50) & ~(0x45 ^ 8));
        h.var2[1] = 0xAA ^ 0xBF;
        h.var2[2] = 0x6A ^ 0x75;
        h.var2[3] = 1;
        h.var2[4] = 0x6E ^ 0x18 ^ (0xE6 ^ 0x84);
        h.var2[5] = 207 + 89 - 255 + 214 ^ 25 + 5 - -102 + 62;
        h.var2[6] = 2;
        h.var2[7] = 0x8F ^ 0x9C;
        h.var2[8] = 0xD5 ^ 0x92;
        h.var2[9] = 3;
    }

    public int L() {
        return this.highlightChildId;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[0];
        while (h.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    static {
        h.var10();
        h.var3();
        RED = new GameEnum6(var2[1], var2[2]);
        YELLOW = new GameEnum6(var2[4], var2[5]);
        GREEN = new GameEnum6(var2[7], var2[8]);
        h[] hArray = new h[var2[9]];
        hArray[h.var2[0]] = RED;
        hArray[h.var2[3]] = YELLOW;
        hArray[h.var2[6]] = GREEN;
        $VALUES = hArray;
    }

    private GameEnum6(int n3, int n4) {
        this.childId = n3;
        this.highlightChildId = n4;
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    public int K() {
        return this.childId;
    }
}

