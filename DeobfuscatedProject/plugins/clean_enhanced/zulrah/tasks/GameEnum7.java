/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.zulrah.tasks;

import net.runelite.api.Prayer;

public final class GameEnum7
extends Enum<g> {
    
    public static final  /* enum */ g MYSTIC_MIGHT;
    public static final  /* enum */ g AUGURY;
    private final  Prayer prayer;
    
    private static final  g[] $VALUES;

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    private GameEnum7(Prayer prayer) {
        this.prayer = prayer;
    }

    static {
        g.var3();
        g.var4();
        MYSTIC_MIGHT = new GameEnum7(Prayer.MYSTIC_MIGHT);
        AUGURY = new GameEnum7(Prayer.AUGURY);
        g[] gArray = new g[2];
        gArray[0] = MYSTIC_MIGHT;
        gArray[1] = AUGURY;
        $VALUES = gArray;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((0x5E ^ 0x5A) >= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public Prayer r() {
        return this.prayer;
    }
}

