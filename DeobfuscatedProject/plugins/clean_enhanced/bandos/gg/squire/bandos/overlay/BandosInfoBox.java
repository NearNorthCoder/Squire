/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.client.Static
 */
package gg.squire.bandos.overlay;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandos;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;
import gg.squire.bandos.overlay.BandosManager;
import gg.squire.bandos.overlay.BandosManager;
import gg.squire.bandos.overlay.PlacingCannonBaseTask;

public class BandosInfoBox
extends OverlayPanel {
    private final  TaskManager G;
    private final  k F;
    private final  e E;
    private final  SquireBandos D;
    private final  w H;

    private static void var3() {
        var2 = new String[var1[8]];
        BandosInfoBox.var2[BandosInfoBox.var1[1]] = "Squire Bandos";
        BandosInfoBox.var2[BandosInfoBox.var1[2]] = "Bandos alive";
        BandosInfoBox.var2[BandosInfoBox.var1[3]] = "Inside room";
        BandosInfoBox.var2[BandosInfoBox.var1[4]] = "Bandos Kills";
        BandosInfoBox.var2[BandosInfoBox.var1[5]] = "Cannon base expires in:";
        BandosInfoBox.var2[BandosInfoBox.var1[6]] = "Can cast b2p";
        BandosInfoBox.var2[BandosInfoBox.var1[7]] = "Current Task";
    }

    public Dimension render(Graphics2D graphics2D) {
        if (BandosInfoBox.var4(this.D.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(var1[0], var1[0], var1[0], var1[0]));
        String string = var2[var1[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[2]]).right(String.valueOf(this.E.s())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[3]]).right(String.valueOf(this.E.t())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[4]]).right(String.valueOf(this.E.A())).build());
        0;
        int n2 = Math.max(var1[1], this.H.Q() - Static.getClient().getTickCount());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[5]]).right(String.valueOf(n2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[6]]).right(String.valueOf(SpellBook.Standard.BONES_TO_PEACHES.canCast())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[7]]).right(this.G.getCurrentTask()).build());
        0;
        return super.render(graphics2D);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[1];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[1];
        while (BandosInfoBox.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void var16() {
        var1 = new int[10];
        BandosInfoBox.var1[0] = 70 + 64 - 26 + 69 ^ 185 + 36 - 54 + 20;
        BandosInfoBox.var1[1] = (0x36 ^ 0x6C) & ~(0x55 ^ 0xF);
        BandosInfoBox.var1[2] = 1;
        BandosInfoBox.var1[3] = 2;
        BandosInfoBox.var1[4] = 3;
        BandosInfoBox.var1[5] = 0x8C ^ 0x88;
        BandosInfoBox.var1[6] = 0x38 ^ 0x3D;
        BandosInfoBox.var1[7] = 0x17 ^ 0x11;
        BandosInfoBox.var1[8] = 0x6B ^ 0x49 ^ (0x4E ^ 0x6B);
        BandosInfoBox.var1[9] = 0x4D ^ 0x45;
    }

    @Inject
    public BandosInfoBox(SquireBandos squireBandos, e e2, k k2, w w2) {
        this.D = squireBandos;
        this.E = e2;
        this.F = k2;
        this.G = squireBandos.getManager();
        this.H = w2;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    static {
        BandosInfoBox.var16();
        BandosInfoBox.var3();
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }
}

