/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.aerialfisher.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.aerialfisher.SquireAerialFisher;
import gg.squire.aerialfisher.overlay.AHelper;
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
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class AerialFisherInfoBox
extends OverlayPanel {
    private final  SquireAerialFisher h;
    
    private final  a i;

    private static boolean lIIlIlIIIIlIlI(int n, int n2) {
        return n < n2;
    }

    static {
        AerialFisherInfoBox.lIIlIlIIIIIlll();
        AerialFisherInfoBox.lIIlIlIIIIIllI();
    }

    private static boolean lIIlIlIIIIlIIl(int n) {
        return n == 0;
    }

    @Inject
    public AerialFisherInfoBox(SquireAerialFisher squireAerialFisher, a a2) {
        this.h = squireAerialFisher;
        this.i = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

        return String.valueOf(var1);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (AerialFisherInfoBox.lIIlIlIIIIlIII(this.h.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIlllIlll[0], lIlIlllIlll[0], lIlIlllIlll[0], lIlIlllIlll[0]));
        String string = lIlIlllIllI[lIlIlllIlll[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        int n = lIlIlllIlll[2];
        this.panelComponent.setPreferredSize(new Dimension(n + lIlIlllIlll[3], lIlIlllIlll[1]));
        Duration duration = Duration.between(this.h.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[4]]).right(Time.format((Duration)duration)).build());

        int n2 = (int)this.a(this.i.b());
        Object[] objectArray = new Object[lIlIlllIlll[5]];
        objectArray[AerialFisherInfoBox.lIlIlllIlll[1]] = this.i.b();
        objectArray[AerialFisherInfoBox.lIlIlllIlll[4]] = n2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[5]]).right(String.format(lIlIlllIllI[lIlIlllIlll[6]], objectArray)).build());

        int n3 = (int)this.a(this.i.c());
        Object[] objectArray2 = new Object[lIlIlllIlll[5]];
        objectArray2[AerialFisherInfoBox.lIlIlllIlll[1]] = this.i.c();
        objectArray2[AerialFisherInfoBox.lIlIlllIlll[4]] = n3;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[7]]).right(String.format(lIlIlllIllI[lIlIlllIlll[8]], objectArray2)).build());

        int n4 = (int)this.a(this.i.d());
        Object[] objectArray3 = new Object[lIlIlllIlll[5]];
        objectArray3[AerialFisherInfoBox.lIlIlllIlll[1]] = this.i.d();
        objectArray3[AerialFisherInfoBox.lIlIlllIlll[4]] = n4;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[9]]).right(String.format(lIlIlllIllI[lIlIlllIlll[10]], objectArray3)).build());

        return super.render(graphics2D);
    }

    public long a(int n) {
        Duration duration = Duration.between(this.h.getStarted(), Instant.now());
        if (AerialFisherInfoBox.lIIlIlIIIIlIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIlIlIIIIlIII(int n) {
        return n != 0;
    }

    private static void lIIlIlIIIIIllI() {
        lIlIlllIllI = new String[lIlIlllIlll[11]];
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[1]] = "Squire Aerial Fisher";
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[4]] = "Runtime:";
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[5]] = "Fish caught:";
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[6]] = "%d (%d/h)";
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[7]] = "Pearls gained:";
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[8]] = "%d (%d/h)";
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[9]] = "Tenches gained:";
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[10]] = "%d (%d/h)";
    }
}

