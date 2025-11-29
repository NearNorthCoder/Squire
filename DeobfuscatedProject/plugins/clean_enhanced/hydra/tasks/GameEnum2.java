/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.hydra.tasks;

import net.runelite.api.Prayer;

public final class GameEnum2
extends Enum<g> {
    private static final  g[] $VALUES;
    public static final  /* enum */ g RIGOUR;
    public static final  /* enum */ g AUGURY;
    public static final  /* enum */ g EAGLE_EYE;
    public static final  /* enum */ g PIETY;
    
    private final  Prayer clientType;
    public static final  /* enum */ g NONE;
    public static final  /* enum */ g CHIVALRY;
    
    public static final  /* enum */ g MYSTIC_MIGHT;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public String y() {
        String string = super.toString();
        return string.charAt(var1[0]) + string.substring(var1[1]).replaceAll(var2[var1[0]], var2[var1[1]]).toLowerCase();
    }

    public Prayer z() {
        return this.clientType;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private GameEnum2(Prayer prayer) {
        this.clientType = prayer;
    }

    private static void var15() {
        var2 = new String[var1[9]];
        g.var2[g.var1[0]] = "_";
        g.var2[g.var1[1]] = g.var9("cjq1CKISQYU=", "ahtFa");
        g.var2[g.var1[2]] = "AUGURY";
        g.var2[g.var1[3]] = "MYSTIC_MIGHT";
        g.var2[g.var1[4]] = "RIGOUR";
        g.var2[g.var1[5]] = "EAGLE_EYE";
        g.var2[g.var1[6]] = "PIETY";
        g.var2[g.var1[7]] = "CHIVALRY";
        g.var2[g.var1[8]] = "NONE";
    }

    private static void var16() {
        var1 = new int[10];
        g.var1[0] = (67 + 187 - 139 + 79 ^ 76 + 113 - 162 + 108) & (0x82 ^ 0xA4 ^ (0x34 ^ 0x57) ^ -1);
        g.var1[1] = 1;
        g.var1[2] = 2;
        g.var1[3] = 3;
        g.var1[4] = 0x19 ^ 0x1D;
        g.var1[5] = 145 + 26 - 94 + 105 ^ 112 + 7 - 27 + 87;
        g.var1[6] = 0x53 ^ 0x55;
        g.var1[7] = 0x89 ^ 0x8E;
        g.var1[8] = 156 + 102 - 96 + 5 ^ 111 + 12 - -4 + 48;
        g.var1[9] = 0x6E ^ 0x4B ^ (0xAF ^ 0x83);
    }

    static {
        g.var16();
        g.var15();
        AUGURY = new GameEnum2(Prayer.AUGURY);
        MYSTIC_MIGHT = new GameEnum2(Prayer.MYSTIC_MIGHT);
        RIGOUR = new GameEnum2(Prayer.RIGOUR);
        EAGLE_EYE = new GameEnum2(Prayer.EAGLE_EYE);
        PIETY = new GameEnum2(Prayer.PIETY);
        CHIVALRY = new GameEnum2(Prayer.CHIVALRY);
        NONE = new GameEnum2(null);
        g[] gArray = new g[var1[7]];
        gArray[g.var1[0]] = AUGURY;
        gArray[g.var1[1]] = MYSTIC_MIGHT;
        gArray[g.var1[2]] = RIGOUR;
        gArray[g.var1[3]] = EAGLE_EYE;
        gArray[g.var1[4]] = PIETY;
        gArray[g.var1[5]] = CHIVALRY;
        gArray[g.var1[6]] = NONE;
        $VALUES = gArray;
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (g.var17(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

