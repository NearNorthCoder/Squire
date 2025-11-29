/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum7
extends Enum<g> {
    public static final  /* enum */ g ADAMANT;
    
    public static final  /* enum */ g BRONZE;
    public static final  /* enum */ g STEEL;
    private static final  g[] $VALUES;
    public static final  /* enum */ g MITHRIL;
    public static final  /* enum */ g DRAGON;
    private final  int boltTipId;
    public static final  /* enum */ g BROAD;
    public static final  /* enum */ g IRON;
    
    public static final  /* enum */ g RUNE;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public int y() {
        return this.boltTipId;
    }

    private static void var10() {
        var1 = new String[var2[16]];
        g.var1[g.var2[0]] = "BRONZE";
        g.var1[g.var2[2]] = "IRON";
        g.var1[g.var2[4]] = "STEEL";
        g.var1[g.var2[6]] = "MITHRIL";
        g.var1[g.var2[8]] = "ADAMANT";
        g.var1[g.var2[10]] = "RUNE";
        g.var1[g.var2[12]] = "BROAD";
        g.var1[g.var2[14]] = "DRAGON";
    }

    private static void var11() {
        var2 = new int[17];
        g.var2[0] = (0x15 ^ 0x33) & ~(0x8C ^ 0xAA);
        g.var2[1] = 0xFFFFFDDF & 0x26BF;
        g.var2[2] = 1;
        g.var2[3] = 0xFFFFEEB9 & 0x35E7;
        g.var2[4] = 2;
        g.var2[5] = 0xFFFFA6F7 & 0x7DAA;
        g.var2[6] = 3;
        g.var2[7] = 0xFFFFA6E7 & 0x7DBB;
        g.var2[8] = 0xFE ^ 0xA2 ^ (0x2A ^ 0x72);
        g.var2[9] = 0xFFFFA5E5 & 0x7EBE;
        g.var2[10] = 0x7F ^ 0x7A;
        g.var2[11] = 0xFFFFB4BF & 0x6FE5;
        g.var2[12] = 0x8D ^ 0x8B;
        g.var2[13] = 0xFFFFAE65 & 0x7FFE;
        g.var2[14] = 0x6C ^ 0x69 ^ 2;
        g.var2[15] = 0xFFFFF5FF & 0x5FAA;
        g.var2[16] = 0x55 ^ 0x5D;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    static {
        g.var11();
        g.var10();
        BRONZE = new GameEnum7(var2[1]);
        IRON = new GameEnum7(var2[3]);
        STEEL = new GameEnum7(var2[5]);
        MITHRIL = new GameEnum7(var2[7]);
        ADAMANT = new GameEnum7(var2[9]);
        RUNE = new GameEnum7(var2[11]);
        BROAD = new GameEnum7(var2[13]);
        DRAGON = new GameEnum7(var2[15]);
        g[] gArray = new g[var2[16]];
        gArray[g.var2[0]] = BRONZE;
        gArray[g.var2[2]] = IRON;
        gArray[g.var2[4]] = STEEL;
        gArray[g.var2[6]] = MITHRIL;
        gArray[g.var2[8]] = ADAMANT;
        gArray[g.var2[10]] = RUNE;
        gArray[g.var2[12]] = BROAD;
        gArray[g.var2[14]] = DRAGON;
        $VALUES = gArray;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (g.var3(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private GameEnum7(int n3) {
        this.boltTipId = n3;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

