/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigame.tasks;

import java.util.Comparator;

public final class GameEnum2
extends Enum<e> {
    private  String name;

    public static final  /* enum */ e TORCHER;
    public static final  /* enum */ e SPINNER;
    public static final  /* enum */ e SHIFTER;
    private  int priority;
    public static final  /* enum */ e SPLATTER;
    public static final  /* enum */ e DEFILER;
    public static final  /* enum */ e BRAWLER;
    public static final  /* enum */ e RAVAGER;
    public static final  /* enum */ e PORTAL;
    private static final  e[] $VALUES;

    private GameEnum2(String string2, int n2) {
        this.name = string2;
        this.priority = n2;
    }

    private static void var3() {
        var2 = new String[var1[16]];
        e.var2[e.var1[0]] = "BRAWLER";
        e.var2[e.var1[1]] = "Brawler";
        e.var2[e.var1[2]] = "SPINNER";
        e.var2[e.var1[3]] = "Spinner";
        e.var2[e.var1[4]] = "PORTAL";
        e.var2[e.var1[5]] = "Portal";
        e.var2[e.var1[6]] = "DEFILER";
        e.var2[e.var1[7]] = "Defiler";
        e.var2[e.var1[8]] = "RAVAGER";
        e.var2[e.var1[9]] = "Ravager";
        e.var2[e.var1[10]] = "SHIFTER";
        e.var2[e.var1[11]] = "Shifter";
        e.var2[e.var1[12]] = "TORCHER";
        e.var2[e.var1[13]] = "Torcher";
        e.var2[e.var1[14]] = "SPLATTER";
        e.var2[e.var1[15]] = "Splatter";
    }

    static {
        e.var4();
        e.var3();
        BRAWLER = new GameEnum2(var2[var1[1]], var1[1]);
        SPINNER = new GameEnum2(var2[var1[3]], var1[2]);
        PORTAL = new GameEnum2(var2[var1[5]], var1[3]);
        DEFILER = new GameEnum2(var2[var1[7]], var1[4]);
        RAVAGER = new GameEnum2(var2[var1[9]], var1[4]);
        SHIFTER = new GameEnum2(var2[var1[11]], var1[5]);
        TORCHER = new GameEnum2(var2[var1[13]], var1[5]);
        SPLATTER = new GameEnum2(var2[var1[15]], var1[6]);
        e[] eArray = new e[var1[8]];
        eArray[e.var1[0]] = BRAWLER;
        eArray[e.var1[1]] = SPINNER;
        eArray[e.var1[2]] = PORTAL;
        eArray[e.var1[3]] = DEFILER;
        eArray[e.var1[4]] = RAVAGER;
        eArray[e.var1[5]] = SHIFTER;
        eArray[e.var1[6]] = TORCHER;
        eArray[e.var1[7]] = SPLATTER;
        $VALUES = eArray;
    }

    public int q() {
        return this.priority;
    }

    public static e o() {
        return Arrays.stream(e.values()).max(Comparator.comparingInt(e::q)).orElse(null);
    }

    public String toString() {
        return "Monsters." + this.name() + "(name=" + this.p() + ", priority=" + this.q() + ")";
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var1 = new int[17];
        e.var1[0] = (0xC4 ^ 0x80) & ~(0xD4 ^ 0x90);
        e.var1[1] = 1;
        e.var1[2] = 2;
        e.var1[3] = 3;
        e.var1[4] = 0x66 ^ 0x62;
        e.var1[5] = 0x53 ^ 0x56;
        e.var1[6] = 0x75 ^ 0 ^ (0xD6 ^ 0xA5);
        e.var1[7] = 0x97 ^ 0xC5 ^ (0x7E ^ 0x2B);
        e.var1[8] = 156 + 40 - 135 + 119 ^ 45 + 163 - 57 + 37;
        e.var1[9] = 0x2F ^ 0x26;
        e.var1[10] = 0x82 ^ 0x88;
        e.var1[11] = 0x16 ^ 0xF ^ (0xD5 ^ 0xC7);
        e.var1[12] = 0xC ^ 0;
        e.var1[13] = 0x24 ^ 0x29;
        e.var1[14] = 0x1D ^ 0x13;
        e.var1[15] = 0xB7 ^ 0x9A ^ (0x27 ^ 5);
        e.var1[16] = 0x7E ^ 0xA ^ (0x38 ^ 0x5C);
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (e.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (((0xA1 ^ 0xBE ^ (0xB0 ^ 0x8C)) & (63 + 41 - -1 + 41 ^ 69 + 29 - -78 + 1 ^ -1)) >= -1) continue;
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var20(int n, int n2) {
        return n < n2;
    }

    public String p() {
        return this.name;
    }
}

