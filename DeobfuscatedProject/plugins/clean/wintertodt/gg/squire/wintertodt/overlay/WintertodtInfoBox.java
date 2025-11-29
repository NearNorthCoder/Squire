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

import gg.squire.wintertodt.overlay.BHelper;
import gg.squire.wintertodt.overlay.DHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.wintertodt.SquireWintertodt;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    public Dimension render(Graphics2D graphics2D) {
        WintertodtInfoBox var1;
        if (WintertodtInfoBox.llIIIIlIllIllll(this.v.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var2 = Duration.between(var1.v.getStarted(), Instant.now());
        var1.panelComponent.setBorder(new Rectangle(lIlIllllIlIII[0], lIlIllllIlIII[0], lIlIllllIlIII[0], lIlIllllIlIII[0]));
        var1.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIllllIIllI[lIlIllllIlIII[1]]).build());

        var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[2]]).right(Time.format((Duration)var2)).build());

        var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[3]]).right(d.a(var1.z()) + " (" + var1.A() + "/hr)").build());

        int var3 = lIlIllllIlIII[4];
        var1.panelComponent.setPreferredSize(new Dimension(var3 + lIlIllllIlIII[5], lIlIllllIlIII[1]));
        var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[6]]).right(lIlIllllIIllI[lIlIllllIlIII[7]]).build());

        var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[8]]).right(var1.x.getCurrentTask()).build());

        var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[9]]).right(String.valueOf(var1.y.i())).build());

        if (WintertodtInfoBox.llIIIIlIllIllll(var1.y.i() ? 1 : 0)) {
            var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[10]]).right(String.valueOf(var1.y.f())).build());

            Object[] objectArray = new Object[lIlIllllIlIII[3]];
            objectArray[WintertodtInfoBox.lIlIllllIlIII[1]] = var1.y.p();
            objectArray[WintertodtInfoBox.lIlIllllIlIII[2]] = var1.w.foodAmount();
            var1.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[11]]).right(String.format(lIlIllllIIllI[lIlIllllIlIII[12]], objectArray)).build());

        }
        return super.render(graphics2D);
    }

    private static void llIIIIlIllIlIll() {
        lIlIllllIIllI = new String[lIlIllllIlIII[0]];
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[1]] = "[B]uire Wintertodt";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[2]] = "Runtime";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[3]] = "Xp gained:";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[6]] = "Version";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[7]] = "1.1.3";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[8]] = "Performing";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[9]] = "Inside Wintertodt";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[10]] = "Points";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[11]] = "Food";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[12]] = "%d | %d";
    }

    private int A() {
        Instant instant = Instant.now();
        Instant instant2 = this.v.getStarted();
        Duration duration = Duration.between(instant2, instant);
        double d2 = (double)(duration.toMillis() / 1000L) / 3600.0;
        if (WintertodtInfoBox.llIIIIlIlllIIlI(duration.isNegative() ? 1 : 0) && WintertodtInfoBox.llIIIIlIllIllll(WintertodtInfoBox.llIIIIlIlllIIIl(d2, 0.0))) {
            return (int)Math.floor((double)this.z() / d2);
        }
        return lIlIllllIlIII[1];
    }

    static {
        WintertodtInfoBox.llIIIIlIllIllIl();
        WintertodtInfoBox.llIIIIlIllIlIll();
    }

    private static int llIIIIlIlllIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

        return String.valueOf(var4);
    }

    private static boolean llIIIIlIlllIIll(int n2, int n3) {
        return n2 < n3;
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

    private static boolean llIIIIlIllIllll(int n2) {
        return n2 != 0;
    }

    private int z() {
        return Skills.getExperience((Skill)Skill.FIREMAKING) - this.v.a();
    }

    private static boolean llIIIIlIlllIIlI(int n2) {
        return n2 == 0;
    }
}

