/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GameEnum6;

public final class GameEnum
extends Enum<g> {
    private final  h temperature;
    
    private final  int spriteId;
    private final  int objectId;
    public static final  /* enum */ g POLISH;
    private static final  g[] $VALUES;
    public static final  /* enum */ g GRINDSTONE;
    public static final  /* enum */ g HAMMER;

    static {
        g.var3();
        g.var4();
        HAMMER = new GameEnum(h.RED, var1[1], var1[2]);
        GRINDSTONE = new GameEnum(h.YELLOW, var1[4], var1[5]);
        POLISH = new GameEnum(h.GREEN, var1[7], var1[8]);
        g[] gArray = new g[var1[9]];
        gArray[g.var1[0]] = HAMMER;
        gArray[g.var1[3]] = GRINDSTONE;
        gArray[g.var1[6]] = POLISH;
        $VALUES = gArray;
    }

    private static void var3() {
        var1 = new int[11];
        g.var1[0] = (0xDB ^ 0xBA) & ~(0xD5 ^ 0xB4);
        g.var1[1] = -(0xFFFFFA77 & 0x4FAA) & (0xFFFFDFFF & 0x7B7B);
        g.var1[2] = 0xFFFFAF4B & 0xFEFF;
        g.var1[3] = 1;
        g.var1[4] = -(0xFFFFEFBF & 0x12E1) & (0xFFFFBBFF & 0x57FB);
        g.var1[5] = -(0xFFFFE1F3 & 0x5F1D) & (0xFFFFEFDD & 0xFF7E);
        g.var1[6] = 2;
        g.var1[7] = -(0xFFFFF5A7 & 0x6EDC) & (0xFFFFF5DF & Short.MAX_VALUE);
        g.var1[8] = 0xFFFFAFFD & 0xFE4F;
        g.var1[9] = 3;
        g.var1[10] = 0x5A ^ 0x52;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    public h H() {
        return this.temperature;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (g.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-1 < 1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void var4() {
        var2 = new String[var1[9]];
        g.var2[g.var1[0]] = "HAMMER";
        g.var2[g.var1[3]] = "GRINDSTONE";
        g.var2[g.var1[6]] = "POLISH";
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public int J() {
        return this.objectId;
    }

    private GameEnum(h h2, int n3, int n4) {
        this.temperature = h2;
        this.spriteId = n3;
        this.objectId = n4;
    }

    public int I() {
        return this.spriteId;
    }
}

