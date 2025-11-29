/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.infobox.Counter
 */
package gg.squire.mta.tasks;

import java.awt.Color;
import java.awt.image.BufferedImage;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.Counter;

public class KHelper
extends Counter {

    static {
        k.var2();
    }

    KHelper(BufferedImage bufferedImage, Plugin plugin) {
        super(bufferedImage, plugin, var1[0]);
    }

    /*
     * WARNING - void declaration
     */
    public Color getTextColor() {
        void var3;
        int n2 = this.getCount();
        if (k.var4(n2, var1[1])) {
            return Color.GREEN;
        }
        if (k.var5((int)var3)) {
            return Color.RED;
        }
        return Color.ORANGE;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var2() {
        var1 = new int[2];
        k.var1[0] = (0x28 ^ 0x2C) & ~(0xB8 ^ 0xBC);
        k.var1[1] = 0x32 ^ 0x25 ^ (0x53 ^ 0x54);
    }
}

