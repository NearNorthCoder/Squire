/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.widgets.WidgetInfo
 */
package gg.squire.gauntlet.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GameEnum;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.WidgetInfo;

public final class GameEnum18
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

    private static boolean lIIIIIIIllIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIIIIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }

    public WidgetInfo aj() {
        return this.widgetInfo;
    }

    public Prayer ai() {
        return this.defensive;
    }

    public boolean f(NPC nPC) {
        boolean bl;
        if (!g.lIIIIIIIllIlIll(nPC.getId(), this.normalId) || g.lIIIIIIIllIllII(nPC.getId(), this.corruptedId)) {
            bl = llIlIIIIlIIl[2];

            if (((180 + 7 - 46 + 56 ^ 142 + 2 - 95 + 102) & (1 ^ (0x69 ^ 0x3A) ^ -1)) != 0) {
                return ((0xDF ^ 0xA3 ^ (0xF4 ^ 0xA7)) & (135 + 47 - 44 + 3 ^ 23 + 19 - 20 + 140 ^ -1)) != 0;
            }
        } else {
            bl = llIlIIIIlIIl[0];
        }
        return bl;
    }

    static {
        g.lIIIIIIIllIlIIl();
        g.lIIIIIIIllIlIII();
        DARK_BEAST = new GameEnum18(Prayer.PROTECT_FROM_MISSILES, WidgetInfo.PRAYER_PROTECT_FROM_MISSILES, llIlIIIIlIIl[3], llIlIIIIlIIl[4], llIlIIIIlIIl[5], i.CRYSTALLINE_BOWSTRING);
        DRAGON = new GameEnum18(Prayer.PROTECT_FROM_MAGIC, WidgetInfo.PRAYER_PROTECT_FROM_MAGIC, llIlIIIIlIIl[3], llIlIIIIlIIl[6], llIlIIIIlIIl[7], i.CRYSTAL_ORB);
        BEAR = new GameEnum18(Prayer.PROTECT_FROM_MELEE, WidgetInfo.PRAYER_PROTECT_FROM_MELEE, llIlIIIIlIIl[8], llIlIIIIlIIl[9], llIlIIIIlIIl[10], null);
        g[] gArray = new g[llIlIIIIlIIl[11]];
        gArray[g.llIlIIIIlIIl[0]] = DARK_BEAST;
        gArray[g.llIlIIIIlIIl[2]] = DRAGON;
        gArray[g.llIlIIIIlIIl[1]] = BEAR;
        $VALUES = gArray;
    }

    private GameEnum18(Prayer prayer, WidgetInfo widgetInfo, int n3, int n4, int n5, i i2) {
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

    private static boolean lIIIIIIIllIllII(int n2, int n3) {
        return n2 == n3;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    public int[] ah() {
        int[] nArray = new int[llIlIIIIlIIl[1]];
        nArray[g.llIlIIIIlIIl[0]] = this.normalId;
        nArray[g.llIlIIIIlIIl[2]] = this.corruptedId;
        return nArray;
    }

    public int ak() {
        return this.range;
    }

    private static void lIIIIIIIllIlIII() {
        llIlIIIIlIII = new String[llIlIIIIlIIl[11]];
        g.llIlIIIIlIII[g.llIlIIIIlIIl[0]] = "DARK_BEAST";
        g.llIlIIIIlIII[g.llIlIIIIlIIl[2]] = "DRAGON";
        g.llIlIIIIlIII[g.llIlIIIIlIIl[1]] = "BEAR";
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public static g i(int n2) {
        void var2;
        g[] gArray = g.values();
        int n3 = gArray.length;
        int var3 = llIlIIIIlIIl[0];
        while (g.lIIIIIIIllIlIlI(var3, (int)var2)) {
            int var4;
            void var5;
            void var6 = var5[var3];
            if (!g.lIIIIIIIllIlIll(var6.am(), var4) || g.lIIIIIIIllIllII(var6.al(), var4)) {
                return var6;
            }
            ++var3;

            if (((151 + 117 - 193 + 91 ^ 12 + 84 - 61 + 108) & (0x47 ^ 0x37 ^ (0x12 ^ 0x4B) ^ -1)) == 0) continue;
            return null;
        }
        return null;
    }

    public i an() {
        return this.drop;
    }
}

