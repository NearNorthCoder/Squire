/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskManager
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.thieving;

import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
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
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import gg.squire.thieving.GameEnum;
import gg.squire.thieving.GameEnum31;

@Singleton
public class ThievingOverlayPanel
extends OverlayPanel {
    private final  SquireThievingConfig n;

    private final  SquireThieving m;

    static {
        ThievingOverlayPanel.lIllIIIllIIIIIl();
        ThievingOverlayPanel.lIllIIIllIIIIII();
    }

    private void a(Graphics2D graphics2D) {
        d d2 = this.m.b();
        if (ThievingOverlayPanel.lIllIIIllIIIllI((Object)d2)) {
            return;
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[12]]).right(d2.v()).build());

    }

    private static boolean lIllIIIllIIIlII(Object object) {
        return object != null;
    }

    @Inject
    public ThievingOverlayPanel(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.m = squireThieving;
        this.n = squireThievingConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIIIllIIIllI(Object object) {
        return object == null;
    }

    private static boolean lIllIIIllIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIIllIIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static void lIllIIIllIIIIII() {
        lIIllIllIllIl = new String[lIIllIllIlllI[13]];
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[3]] = "Squire Thieving";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[4]] = "Version:";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[5]] = "1.4.6";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[6]] = "Runtime:";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[7]] = "Method";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[8]] = "Banking: ";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[9]] = "Performing";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[11]] = "Saved world";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[12]] = "Target";
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        TaskManager var1;
        ThievingOverlayPanel var2;
        if (ThievingOverlayPanel.lIllIIIllIIIIlI(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var2.panelComponent.setBorder(new Rectangle(lIIllIllIlllI[0], lIIllIllIlllI[0], lIIllIllIlllI[0], lIIllIllIlllI[0]));
        int var3 = lIIllIllIlllI[1];
        var2.panelComponent.setPreferredSize(new Dimension(var3 + lIIllIllIlllI[2], lIIllIllIlllI[3]));
        String var4 = lIIllIllIllIl[lIIllIllIlllI[3]];
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var4).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[4]]).right(lIIllIllIllIl[lIIllIllIlllI[5]]).build());

        Duration var5 = Duration.between(var2.m.getStarted(), Instant.now());
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[6]]).right(Time.format((Duration)var5)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[7]]).right(var2.n.method().toString()).build());

        if (ThievingOverlayPanel.lIllIIIllIIIIll((Object)var2.n.method(), (Object)b.PICKPOCKETING)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[8]]).right(String.valueOf(var2.m.j())).build());

        }
        if (ThievingOverlayPanel.lIllIIIllIIIlII(var1 = var2.m.getManager())) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[9]]).right(var1.getCurrentTask()).build());

            if (ThievingOverlayPanel.lIllIIIllIIIIll((Object)var2.n.method(), (Object)b.BLACK_JACK)) {
                void var6;
                var2.a((Graphics2D)var6);
            }
        }
        if (ThievingOverlayPanel.lIllIIIllIIIIlI(var2.m.e()) && ThievingOverlayPanel.lIllIIIllIIIlIl(var2.m.e(), lIIllIllIlllI[10])) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[11]]).right(String.valueOf(var2.m.e())).build());

        }
        return super.render(graphics2D);
    }

        return String.valueOf(var7);
    }

    private static boolean lIllIIIllIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIllIIIIlI(int n2) {
        return n2 != 0;
    }
}

