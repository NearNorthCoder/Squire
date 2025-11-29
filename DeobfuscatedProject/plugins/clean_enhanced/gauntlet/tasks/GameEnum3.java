/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.WidgetInfo
 */
package gg.squire.gauntlet.tasks;

import gg.squire.gauntlet.tasks.GameEnum;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.WidgetInfo;

public final class GameEnum3
extends Enum<g> {
    public static final  /* enum */ g BEAR;
    private final  WidgetInfo widgetInfo;
    private final  i drop;
    public static final  /* enum */ g DARK_BEAST;
    
    public static final  /* enum */ g DRAGON;
    private static final  g[] $VALUES;
    private final  int range;
    private final  Prayer defensive;
    private final  int corruptedId;
    private final  int normalId;

    public int am() {
        return this.corruptedId;
    }

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    private static void var4() {
        var1 = new int[13];
        g.var1[0] = (203 + 114 - 113 + 14 ^ 76 + 81 - 89 + 87) & (0x39 ^ 2 ^ (0x25 ^ 0x5F) ^ -1);
        g.var1[1] = 2;
        g.var1[2] = 1;
        g.var1[3] = 0xBB ^ 0xAB;
        g.var1[4] = 0xFFFFA77E & 0x7BCB;
        g.var1[5] = -(0xFFFFDCFE & 0x6B25) & (0xFFFFFB7F & 0x6FFB);
        g.var1[6] = -(0xFFFFCF57 & 0x38AF) & (0xFFFFEB4F & 0x3FFF);
        g.var1[7] = 0xFFFFFB57 & 0x27FF;
        g.var1[8] = 149 + 31 - 145 + 159 ^ 141 + 16 - 15 + 56;
        g.var1[9] = -(0xFFFFF0FB & 0x5FA7) & (0xFFFFF3EE & 0x7FFB);
        g.var1[10] = 0xFFFFA3F6 & 0x7F5F;
        g.var1[11] = 3;
        g.var1[12] = 0xA1 ^ 0xA9;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    public WidgetInfo aj() {
        return this.widgetInfo;
    }

    public Prayer ai() {
        return this.defensive;
    }

    public boolean f(NPC nPC) {
        boolean bl;
        if (!g.var3(nPC.getId(), this.normalId) || g.var6(nPC.getId(), this.corruptedId)) {
            bl = var1[2];
            0;
            if (((180 + 7 - 46 + 56 ^ 142 + 2 - 95 + 102) & (1 ^ (0x69 ^ 0x3A) ^ -1)) != 0) {
                return ((0xDF ^ 0xA3 ^ (0xF4 ^ 0xA7)) & (135 + 47 - 44 + 3 ^ 23 + 19 - 20 + 140 ^ -1)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    static {
        g.var4();
        g.var7();
        DARK_BEAST = new GameEnum3(Prayer.PROTECT_FROM_MISSILES, WidgetInfo.PRAYER_PROTECT_FROM_MISSILES, var1[3], var1[4], var1[5], i.CRYSTALLINE_BOWSTRING);
        DRAGON = new GameEnum3(Prayer.PROTECT_FROM_MAGIC, WidgetInfo.PRAYER_PROTECT_FROM_MAGIC, var1[3], var1[6], var1[7], i.CRYSTAL_ORB);
        BEAR = new GameEnum3(Prayer.PROTECT_FROM_MELEE, WidgetInfo.PRAYER_PROTECT_FROM_MELEE, var1[8], var1[9], var1[10], null);
        g[] gArray = new g[var1[11]];
        gArray[g.var1[0]] = DARK_BEAST;
        gArray[g.var1[2]] = DRAGON;
        gArray[g.var1[1]] = BEAR;
        $VALUES = gArray;
    }

    private GameEnum3(Prayer prayer, WidgetInfo widgetInfo, int n3, int n4, int n5, i i2) {
        this.defensive = prayer;
        this.widgetInfo = widgetInfo;
        this.range = n3;
        this.normalId = n4;
        this.corruptedId = n5;
        this.drop = i2;
    }

    public int al() {
        return this.normalId;
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    public int[] ah() {
        int[] nArray = new int[var1[1]];
        nArray[g.var1[0]] = this.normalId;
        nArray[g.var1[2]] = this.corruptedId;
        return nArray;
    }

    public int ak() {
        return this.range;
    }

    private static void var7() {
        var2 = new String[var1[11]];
        g.var2[g.var1[0]] = "DARK_BEAST";
        g.var2[g.var1[2]] = "DRAGON";
        g.var2[g.var1[1]] = "BEAR";
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var1[0];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var1[0];
        while (g.var5(var22, var21)) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (3 <= (0x80 ^ 0x84)) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    /*
     * WARNING - void declaration
     */
    public static g i(int n2) {
        void var24;
        g[] gArray = g.values();
        int n3 = gArray.length;
        int var25 = var1[0];
        while (g.var5(var25, (int)var24)) {
            int var26;
            void var27;
            void var28 = var27[var25];
            if (!g.var3(var28.am(), var26) || g.var6(var28.al(), var26)) {
                return var28;
            }
            ++var25;
            0;
            if (((151 + 117 - 193 + 91 ^ 12 + 84 - 61 + 108) & (0x47 ^ 0x37 ^ (0x12 ^ 0x4B) ^ -1)) == 0) continue;
            return null;
        }
        return null;
    }

    public i an() {
        return this.drop;
    }
}

