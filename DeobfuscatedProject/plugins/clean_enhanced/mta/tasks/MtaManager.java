/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.infobox.Timer
 *  net.runelite.client.util.ImageUtil
 */
package gg.squire.mta.tasks;

import java.awt.image.BufferedImage;
import java.time.temporal.ChronoUnit;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.Timer;
import net.runelite.client.util.ImageUtil;

public class MtaManager
extends Timer {
    private static  BufferedImage K;
    
    private static final  int J;

    public MtaManager(Plugin plugin) {
        super(42L, ChronoUnit.SECONDS, f.q(), plugin);
        this.setTooltip(var2[var1[0]]);
    }

    private static void var3() {
        var1 = new int[4];
        f.var1[0] = (0xFB ^ 0xA8) & ~(0x28 ^ 0x7B);
        f.var1[1] = 1;
        f.var1[2] = 0x28 ^ 2;
        f.var1[3] = 2;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var11() {
        var2 = new String[var1[3]];
        f.var2[f.var1[0]] = "Time until items swap";
        f.var2[f.var1[1]] = "/util/reset.png";
    }

    static {
        f.var3();
        f.var11();
        J = var1[2];
    }

    private static BufferedImage q() {
        if (f.var12(K)) {
            return K;
        }
        K = ImageUtil.loadImageResource(MtaManager.class, (String)var2[var1[1]]);
        return K;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[0];
        while (f.var4(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (((0x7F ^ 0x70) & ~(0x5B ^ 0x54)) == 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean var12(Object object) {
        return object != null;
    }
}

