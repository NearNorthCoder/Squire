/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.overlay.infobox.Counter
 */
package m.u.a.-.e.s.q.t.i.r;

import java.awt.Color;
import java.awt.image.BufferedImage;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.Counter;

public class k
extends Counter {
    private static /* synthetic */ int[] lllIllIIIlII;

    static {
        k.lIIIllIIllIlIlI();
    }

    k(BufferedImage bufferedImage, Plugin plugin) {
        super(bufferedImage, plugin, lllIllIIIlII[0]);
    }

    /*
     * WARNING - void declaration
     */
    public Color getTextColor() {
        void lllllllllllllllIIllIlIIIlIlllIll;
        int n2 = this.getCount();
        if (k.lIIIllIIllIlIll(n2, lllIllIIIlII[1])) {
            return Color.GREEN;
        }
        if (k.lIIIllIIllIllII((int)lllllllllllllllIIllIlIIIlIlllIll)) {
            return Color.RED;
        }
        return Color.ORANGE;
    }

    private static boolean lIIIllIIllIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllIIllIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIIllIIllIlIlI() {
        lllIllIIIlII = new int[2];
        k.lllIllIIIlII[0] = (0x28 ^ 0x2C) & ~(0xB8 ^ 0xBC);
        k.lllIllIIIlII[1] = 0x32 ^ 0x25 ^ (0x53 ^ 0x54);
    }
}

