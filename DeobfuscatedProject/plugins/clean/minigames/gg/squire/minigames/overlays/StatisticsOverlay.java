/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskManager
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.minigames.overlays;

import gg.squire.minigames.overlays.MinigamesManager;
import gg.squire.minigames.overlays.GHelper;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireBlastFurnace;
import gg.squire.minigames.SquireBlastFurnaceConfig;
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
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class StatisticsOverlay
extends OverlayPanel {
    
    @Inject
    private  SquireBlastFurnaceConfig i;
    
    private final  TaskManager bZ;
    private final  SquireBlastFurnace ca;
    @Inject
    private  G u;
    public static final  String bY;

    static {
        StatisticsOverlay.llIIllllIIIIll();
        StatisticsOverlay.llIIllllIIIIlI();
        bY = lIIllIIlllll[lIIllIlIIIII[9]];
    }

    private static boolean llIIllllIIIlII(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (StatisticsOverlay.llIIllllIIIlII(this.ca.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        int n2 = lIIllIlIIIII[0];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIllIlIIIII[1], lIIllIlIIIII[2]));
        this.panelComponent.setBorder(new Rectangle(lIIllIlIIIII[3], lIIllIlIIIII[3], lIIllIlIIIII[3], lIIllIlIIIII[3]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIllIIlllll[lIIllIlIIIII[2]]).build());

        Duration duration = Duration.between(this.ca.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[4]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[5]]).right(F.h(this.u.aa())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[6]]).right(F.h(this.u.ah())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[7]]).right(F.a(this.u.ab())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[8]]).right(F.h(this.u.ai())).build());

        return super.render(graphics2D);
    }

    private static void llIIllllIIIIlI() {
        lIIllIIlllll = new String[lIIllIlIIIII[10]];
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[2]] = "Squire Blast Furnace";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[4]] = "Runtime";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[5]] = "Bars made:";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[6]] = "Bars/hr:";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[7]] = "XP gained:";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[8]] = "XP/hr:";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[9]] = "Clear";
    }

    private static boolean llIIllllIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    StatisticsOverlay(SquireBlastFurnace squireBlastFurnace) {
        super((Plugin)squireBlastFurnace);
        this.ca = squireBlastFurnace;
        this.bZ = squireBlastFurnace.getManager();
    }

        return String.valueOf(var1);
    }
}

