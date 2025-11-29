/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

public final class GameEnum5
extends Enum<D> {
    private final  String log;
    private final  String tree;
    public static final  /* enum */ D YEW;
    public static final  /* enum */ D NORMAL;
    private static final  D[] $VALUES;
    public static final  /* enum */ D OAK;
    private static  String[] llIllIIII;
    private static  int[] llIllIIIl;
    public static final  /* enum */ D TEAK;
    public static final  /* enum */ D MAPLE;
    public static final  /* enum */ D WILLOW;

    public String Y() {
        return this.log;
    }

    public String Z() {
        return this.tree;
    }

    public static D[] values() {
        return (D[])$VALUES.clone();
    }

    private static void var1() {
        llIllIIIl = new int[19];
        D.llIllIIIl[0] = 3 & ~3;
        D.llIllIIIl[1] = 1;
        D.llIllIIIl[2] = 2;
        D.llIllIIIl[3] = 3;
        D.llIllIIIl[4] = 0xA ^ 0xE;
        D.llIllIIIl[5] = 0x52 ^ 0x67 ^ (0xB8 ^ 0x88);
        D.llIllIIIl[6] = 0x1B ^ 0x1D;
        D.llIllIIIl[7] = 0x4D ^ 0x4A;
        D.llIllIIIl[8] = 0x37 ^ 0x3F;
        D.llIllIIIl[9] = 0x65 ^ 0x6C;
        D.llIllIIIl[10] = 1 ^ 0x76 ^ (7 ^ 0x7A);
        D.llIllIIIl[11] = 2 + 143 - 16 + 17 ^ 34 + 28 - -91 + 0;
        D.llIllIIIl[12] = 0xC ^ 0;
        D.llIllIIIl[13] = 0x61 ^ 0x21 ^ (0x17 ^ 0x5A);
        D.llIllIIIl[14] = 0xE2 ^ 0x8F ^ (0xFD ^ 0x9E);
        D.llIllIIIl[15] = 0xAE ^ 0xBD ^ (0x92 ^ 0x8E);
        D.llIllIIIl[16] = 0x40 ^ 0x50;
        D.llIllIIIl[17] = 0xAA ^ 0xBB;
        D.llIllIIIl[18] = 9 + 119 - -2 + 4 ^ 4 + 55 - -88 + 1;
    }

    private static void var2() {
        llIllIIII = new String[llIllIIIl[18]];
        D.llIllIIII[D.llIllIIIl[0]] = "NORMAL";
        D.llIllIIII[D.llIllIIIl[1]] = "Tree";
        D.llIllIIII[D.llIllIIIl[2]] = "Logs";
        D.llIllIIII[D.llIllIIIl[3]] = "OAK";
        D.llIllIIII[D.llIllIIIl[4]] = "Oak tree";
        D.llIllIIII[D.llIllIIIl[5]] = "Oak logs";
        D.llIllIIII[D.llIllIIIl[6]] = "WILLOW";
        D.llIllIIII[D.llIllIIIl[7]] = "Willow tree";
        D.llIllIIII[D.llIllIIIl[8]] = "Willow logs";
        D.llIllIIII[D.llIllIIIl[9]] = "MAPLE";
        D.llIllIIII[D.llIllIIIl[10]] = "Maple tree";
        D.llIllIIII[D.llIllIIIl[11]] = "Maple logs";
        D.llIllIIII[D.llIllIIIl[12]] = "TEAK";
        D.llIllIIII[D.llIllIIIl[13]] = "Teak tree";
        D.llIllIIII[D.llIllIIIl[14]] = "Teak logs";
        D.llIllIIII[D.llIllIIIl[15]] = "YEW";
        D.llIllIIII[D.llIllIIIl[16]] = "Yew tree";
        D.llIllIIII[D.llIllIIIl[17]] = "Yew logs";
    }

    public String toString() {
        return this.tree;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    public static D valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = llIllIIIl[0];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = llIllIIIl[0];
        while (D.var15(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (((0x40 ^ 0x17) & ~(0xDF ^ 0x88)) == 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private GameEnum5(String string2, String string3) {
        this.log = string3;
        this.tree = string2;
    }
}

