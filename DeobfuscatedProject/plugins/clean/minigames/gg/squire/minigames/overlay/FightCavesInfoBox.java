/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.minigames.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.overlay.FHelper;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class FightCavesInfoBox
extends OverlayPanel {
    
    private final  f O;
    private final  SquireFightCavesPlugin N;
    private final  SquireFightCavesConfig P;
    private final  TaskManager Q;

    public long j(int n2) {
        Duration duration = Duration.between(this.N.getStarted(), Instant.now());
        if (FightCavesInfoBox.llllIllIIIIIlI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean llllIllIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    public Dimension render(Graphics2D graphics2D) {
        FightCavesInfoBox var2;
        if (FightCavesInfoBox.llllIllIIIIIIl(this.N.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        long var3 = System.currentTimeMillis() - SquireFightCavesPlugin.k;
        var2.panelComponent.setBorder(new Rectangle(llIIIllIlIII[0], llIIIllIlIII[0], llIIIllIlIII[0], llIIIllIlIII[0]));
        String var4 = llIIIllIIlll[llIIIllIlIII[1]];
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var4).build());

        int var5 = llIIIllIlIII[2];
        var2.panelComponent.setPreferredSize(new Dimension(var5 + llIIIllIlIII[3], llIIIllIlIII[1]));
        Duration var6 = Duration.between(var2.N.getStarted(), Instant.now());
        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[4]]).right(Time.format((Duration)var6)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[5]]).right(SquireFightCavesPlugin.h).build());

        List list = var2.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[6]]);
        f cfr_ignored_0 = var2.O;

        list.add(lineComponentBuilder.right(String.valueOf(f.p())).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[7]]).right(String.valueOf(SquireFightCavesPlugin.j)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[8]]).right(String.valueOf(SquireFightCavesPlugin.i) + " (" + FightCavesInfoBox.a(SquireFightCavesPlugin.i, var3) + "/hr)").build());

        if (FightCavesInfoBox.llllIllIIIIIIl(var2.P.showExtraInfoOnUI() ? 1 : 0)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[9]]).right(String.valueOf(f.w())).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[10]]).right(String.valueOf(f.u())).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[11]]).right(String.valueOf(f.t())).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIIllIIlll[llIIIllIlIII[12]]).right(String.valueOf(f.r())).build());

        }
        return super.render(graphics2D);
    }

    static {
        FightCavesInfoBox.llllIllIIIIIII();
        FightCavesInfoBox.llllIlIlllllll();
    }

    @Inject
    public FightCavesInfoBox(SquireFightCavesPlugin squireFightCavesPlugin, f f2, SquireFightCavesConfig squireFightCavesConfig) {
        this.N = squireFightCavesPlugin;
        this.Q = squireFightCavesPlugin.getManager();
        this.O = f2;
        this.P = squireFightCavesConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.MED);
    }

    private static boolean llllIllIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static void llllIlIlllllll() {
        llIIIllIIlll = new String[llIIIllIlIII[13]];
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[1]] = "Squire Fight Caves";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[4]] = "Runtime:";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[5]] = "Task: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[6]] = "Current Wave: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[7]] = "Attempts: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[8]] = "Capes: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[9]] = "Last Blob Attack: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[10]] = "Last Ranger Attack: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[11]] = "Last Mager Attack: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[12]] = "Last Meleer Attack: ";
        FightCavesInfoBox.llIIIllIIlll[FightCavesInfoBox.llIIIllIlIII[0]] = "#.0";
    }

    private static double a(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat(llIIIllIIlll[llIIIllIlIII[0]]);
        return Double.parseDouble(decimalFormat.format(d2));
    }

    private static boolean llllIllIIIIIIl(int n2) {
        return n2 != 0;
    }

    public static double a(double d2, long l2) {
        double d3 = d2 * 3600000.0 / (double)l2;
        return FightCavesInfoBox.a(d3);
    }
}

