/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum15
extends Enum<d> {
    private final  int arrowTipId;
    public static final  /* enum */ d IRON;
    public static final  /* enum */ d DRAGON;
    private static final  d[] $VALUES;

    public static final  /* enum */ d MITHRIL;
    public static final  /* enum */ d STEEL;
    public static final  /* enum */ d ADAMANT;
    public static final  /* enum */ d RUNE;
    public static final  /* enum */ d BRONZE;
    public static final  /* enum */ d HEADLESS;
    public static final  /* enum */ d BROAD;
    public static final  /* enum */ d AMETHYST;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var1 = new String[var2[20]];
        d.var1[d.var2[0]] = "HEADLESS";
        d.var1[d.var2[2]] = "BRONZE";
        d.var1[d.var2[4]] = "IRON";
        d.var1[d.var2[6]] = "STEEL";
        d.var1[d.var2[8]] = "MITHRIL";
        d.var1[d.var2[10]] = "BROAD";
        d.var1[d.var2[12]] = "ADAMANT";
        d.var1[d.var2[14]] = "RUNE";
        d.var1[d.var2[16]] = "AMETHYST";
        d.var1[d.var2[18]] = "DRAGON";
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    static {
        d.var5();
        d.var4();
        HEADLESS = new GameEnum15(var2[1]);
        BRONZE = new GameEnum15(var2[3]);
        IRON = new GameEnum15(var2[5]);
        STEEL = new GameEnum15(var2[7]);
        MITHRIL = new GameEnum15(var2[9]);
        BROAD = new GameEnum15(var2[11]);
        ADAMANT = new GameEnum15(var2[13]);
        RUNE = new GameEnum15(var2[15]);
        AMETHYST = new GameEnum15(var2[17]);
        DRAGON = new GameEnum15(var2[19]);
        d[] dArray = new d[var2[20]];
        dArray[d.var2[0]] = HEADLESS;
        dArray[d.var2[2]] = BRONZE;
        dArray[d.var2[4]] = IRON;
        dArray[d.var2[6]] = STEEL;
        dArray[d.var2[8]] = MITHRIL;
        dArray[d.var2[10]] = BROAD;
        dArray[d.var2[12]] = ADAMANT;
        dArray[d.var2[14]] = RUNE;
        dArray[d.var2[16]] = AMETHYST;
        dArray[d.var2[18]] = DRAGON;
        $VALUES = dArray;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
    }

    private static void var5() {
        var2 = new int[21];
        d.var2[0] = (0x4B ^ 8 ^ (0x75 ^ 0x6C)) & (41 + 189 - 104 + 86 ^ 59 + 69 - 48 + 62 ^ -1);
        d.var2[1] = 0x88 ^ 0xBC;
        d.var2[2] = 1;
        d.var2[3] = 0x4F ^ 0x68;
        d.var2[4] = 2;
        d.var2[5] = 139 + 81 - 58 + 6 ^ 125 + 41 - 154 + 116;
        d.var2[6] = 3;
        d.var2[7] = 0xEF ^ 0xC6;
        d.var2[8] = 0xAA ^ 0xAE;
        d.var2[9] = 0 + 82 - -27 + 46 ^ 133 + 44 - 77 + 77;
        d.var2[10] = 0x9D ^ 0xAC ^ (0x12 ^ 0x26);
        d.var2[11] = -(0xFFFFB0FE & 0x5F9F) & (0xFFFFBFFF & 0x7EFF);
        d.var2[12] = 0x9A ^ 0x9C;
        d.var2[13] = 0xF9 ^ 0x8F ^ (0xA ^ 0x57);
        d.var2[14] = 0x42 ^ 0x45;
        d.var2[15] = 0x2E ^ 2;
        d.var2[16] = 0x55 ^ 0x25 ^ (0xE3 ^ 0x9B);
        d.var2[17] = -(114 + 46 - 102 + 96) & (0xFFFFFFFF & 0x53FF);
        d.var2[18] = 0x30 ^ 0x39;
        d.var2[19] = -(0xFFFF96AD & 0x6D53) & (0xFFFFFFE7 & 0x2FFD);
        d.var2[20] = 0x4E ^ 0x6D ^ (0xF ^ 0x26);
    }

    public int o() {
        return this.arrowTipId;
    }

    private GameEnum15(int n3) {
        this.arrowTipId = n3;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[0];
        while (d.var3(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

