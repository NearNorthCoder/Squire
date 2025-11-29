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
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.mta.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.mta.SquireMTA;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import gg.squire.mta.overlay.GameEnum2;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class InfoBox
extends OverlayPanel {

    private final  SquireMTA ao;
    private final  TaskManager ap;

    private static void var3() {
        var1 = new String[var2[10]];
        InfoBox.var1[InfoBox.var2[1]] = "Squire MTA";
        InfoBox.var1[InfoBox.var2[2]] = "Runtime:";
        InfoBox.var1[InfoBox.var2[3]] = "Currently";
        InfoBox.var1[InfoBox.var2[4]] = "Alchemy points: ";
        InfoBox.var1[InfoBox.var2[5]] = "Enchantment points: ";
        InfoBox.var1[InfoBox.var2[6]] = "Graveyard points: ";
        InfoBox.var1[InfoBox.var2[7]] = "Telekinetic points: ";
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        InfoBox.var10();
        InfoBox.var3();
    }

    private static void var10() {
        var2 = new int[12];
        InfoBox.var2[0] = 0x1B ^ 0x6F ^ (0x2A ^ 0x54);
        InfoBox.var2[1] = (9 ^ 0x37 ^ (0 ^ 0x2F)) & (0x49 ^ 0x68 ^ (0xB6 ^ 0x86) ^ -1);
        InfoBox.var2[2] = 1;
        InfoBox.var2[3] = 2;
        InfoBox.var2[4] = 3;
        InfoBox.var2[5] = 0x10 ^ 0x14;
        InfoBox.var2[6] = 103 + 77 - 143 + 152 ^ 50 + 8 - -95 + 31;
        InfoBox.var2[7] = 0x4A ^ 0x4C;
        InfoBox.var2[8] = 0xFFFFBB42 & 0x45BF;
        InfoBox.var2[9] = 0x18 ^ 0x49 ^ (0xFD ^ 0xB8);
        InfoBox.var2[10] = 0xBF ^ 0xB8;
        InfoBox.var2[11] = 0x34 ^ 0x3C;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    @Inject
    private InfoBox(SquireMTA squireMTA) {
        this.ao = squireMTA;
        this.ap = squireMTA.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[1];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[1];
        while (InfoBox.var12(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (InfoBox.var11(this.ao.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.ao.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[var2[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[2]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[3]]).right(String.valueOf(this.ap.getCurrentTask())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(this.ao.c(c.ALCHEMY) + "/" + this.ao.d(c.ALCHEMY)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(this.ao.c(c.ENCHANTMENT) + "/" + this.ao.d(c.ENCHANTMENT)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[6]]).right(this.ao.c(c.GRAVEYARD) + "/" + this.ao.d(c.GRAVEYARD)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[7]]).right(this.ao.c(c.TELEKENETIC) + "/" + this.ao.d(c.TELEKENETIC)).build());
        0;
        int n2 = var2[8];
        this.panelComponent.setPreferredSize(new Dimension(n2 + var2[9], var2[1]));
        return super.render(graphics2D);
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }
}

