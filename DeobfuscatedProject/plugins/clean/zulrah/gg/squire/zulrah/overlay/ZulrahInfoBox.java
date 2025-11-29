/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.NPC
 *  net.runelite.api.util.Text
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.zulrah.overlay;

import gg.squire.zulrah.overlay.ZulrahManager;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.zulrah.SquireZulrah;
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
import net.runelite.api.NPC;
import net.runelite.api.util.Text;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class ZulrahInfoBox
extends OverlayPanel {

    private final  v O;
    private final  SquireZulrah N;

        return String.valueOf(var1);
    }

    private static void llIIlIIIIIIIIII() {
        lIllIlIlIIlII = new String[lIllIlIlIIlll[13]];
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[2]] = "Squire Zulrah";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[3]] = "Version";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[4]] = "0.2.0";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[5]] = "Runtime";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[6]] = "Performing Task";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[7]] = "Banking";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[8]] = "Killed zulrah";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[9]] = "Kills";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[10]] = "%d (%d/h)";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[11]] = "Zulrah Health";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[0]] = "Zulrah Rotation";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[12]] = "Zulrah Style";
    }

    static {
        ZulrahInfoBox.llIIlIIIIIIIIIl();
        ZulrahInfoBox.llIIlIIIIIIIIII();
    }

    private static boolean llIIlIIIIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIIIIIIIlI(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        ZulrahInfoBox var2;
        if (ZulrahInfoBox.llIIlIIIIIIIIlI(this.N.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var2.panelComponent.setBorder(new Rectangle(lIllIlIlIIlll[0], lIllIlIlIIlll[0], lIllIlIlIIlll[0], lIllIlIlIIlll[0]));
        var2.panelComponent.setPreferredSize(new Dimension(lIllIlIlIIlll[1], lIllIlIlIIlll[2]));
        String var3 = lIllIlIlIIlII[lIllIlIlIIlll[2]];
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var3).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[3]]).right(lIllIlIlIIlII[lIllIlIlIIlll[4]]).build());

        Duration var4 = Duration.between(var2.N.getStarted(), Instant.now());
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[5]]).right(Time.format((Duration)var4)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[6]]).right(var2.N.getManager().getCurrentTask()).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[7]]).right(String.valueOf(var2.N.d())).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[8]]).right(String.valueOf(var2.N.e())).build());

        int var5 = (int)var2.i(var2.O.Y());
        Object[] objectArray = new Object[lIllIlIlIIlll[4]];
        objectArray[ZulrahInfoBox.lIllIlIlIIlll[2]] = var2.O.Y();
        objectArray[ZulrahInfoBox.lIllIlIlIIlll[3]] = var5;
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[9]]).right(String.format(lIllIlIlIIlII[lIllIlIlIIlll[10]], objectArray)).build());

        NPC var6 = var2.O.W();
        if (ZulrahInfoBox.llIIlIIIIIIIIll(var6)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[11]]).right(String.valueOf((int)((double)var6.getHealthRatio() * 4.25))).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[0]]).right(Text.titleCase((Enum)var2.O.V().C())).build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[12]]).right(Text.titleCase((Enum)var2.O.V().C().w())).build());

        }
        return super.render(graphics2D);
    }

    public long i(int n2) {
        Duration duration = Duration.between(this.N.getStarted(), Instant.now());
        if (ZulrahInfoBox.llIIlIIIIIIIlII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean llIIlIIIIIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIIIIIIIll(Object object) {
        return object != null;
    }

    @Inject
    public ZulrahInfoBox(SquireZulrah squireZulrah, v v2) {
        this.N = squireZulrah;
        this.O = v2;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

}

