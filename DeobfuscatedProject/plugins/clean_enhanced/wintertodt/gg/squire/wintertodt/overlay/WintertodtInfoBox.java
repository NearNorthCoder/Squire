/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.api.Skill
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.wintertodt.overlay;

import gg.squire.wintertodt.overlay.WintertodtManager;
import gg.squire.wintertodt.overlay.WintertodtManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.wintertodt.SquireWintertodt;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import net.runelite.api.Skill;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Skills;

public class WintertodtInfoBox
extends OverlayPanel {
    private final  b y;
    private final  SquireWintertodtConfig w;
    
    private final  SquireWintertodt v;
    private final  TaskManager x;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        WintertodtInfoBox var9;
        if ((this.v.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        Duration var10 = Duration.between(var9.v.getStarted(), Instant.now());
        var9.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        var9.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var1[1]).build());
        0;
        var9.panelComponent.getChildren().add(LineComponent.builder().left(var1[2]).right(Time.format((Duration)var10)).build());
        0;
        var9.panelComponent.getChildren().add(LineComponent.builder().left(var1[3]).right(d.a(var9.z()) + " (" + var9.A() + "/hr)").build());
        0;
        int var11 = 4;
        var9.panelComponent.setPreferredSize(new Dimension(var11 + 5, 1));
        var9.panelComponent.getChildren().add(LineComponent.builder().left(var1[6]).right(var1[7]).build());
        0;
        var9.panelComponent.getChildren().add(LineComponent.builder().left(var1[8]).right(var9.x.getCurrentTask()).build());
        0;
        var9.panelComponent.getChildren().add(LineComponent.builder().left(var1[9]).right(String.valueOf(var9.y.i())).build());
        0;
        if ((var9.y.i( != 0) ? 1 : 0)) {
            var9.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[10]]).right(String.valueOf(var9.y.f())).build());
            0;
            Object[] objectArray = new Object[3];
            objectArray[1] = var9.y.p();
            objectArray[2] = var9.w.foodAmount();
            var9.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[11]]).right(String.format(var1[var2[12]], objectArray)).build());
            0;
        }
        return super.render(graphics2D);
    }

    private int A() {
        Instant instant = Instant.now();
        Instant instant2 = this.v.getStarted();
        Duration duration = Duration.between(instant2, instant);
        double d2 = (double)(duration.toMillis() / 1000L) / 3600.0;
        if ((duration.isNegative( == 0) ? 1 : 0) && (WintertodtInfoBox.var12(d2, 0.0 != 0))) {
            return (int)Math.floor((double)this.z() / d2);
        }
        return 1;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static int var12(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = 1;
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = 1;
        while (var27 < var26) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if (1 != (0xCB ^ 0x8E ^ (9 ^ 0x48))) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    @Inject
    public WintertodtInfoBox(SquireWintertodt squireWintertodt, SquireWintertodtConfig squireWintertodtConfig, SquireWintertodt squireWintertodt2, b b2) {
        this.v = squireWintertodt;
        this.w = squireWintertodtConfig;
        this.x = squireWintertodt2.getManager();
        this.y = b2;
        this.setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        this.setLayer(OverlayLayer.ALWAYS_ON_TOP);
        this.setPriority(OverlayPriority.MED);
    }

    private int z() {
        return Skills.getExperience((SkiSkill.FIREMAKING) - this.v.a();
    }

}

