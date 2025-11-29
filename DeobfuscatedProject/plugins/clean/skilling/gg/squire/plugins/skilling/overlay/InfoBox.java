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
package gg.squire.plugins.skilling.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
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
import gg.squire.plugins.skilling.overlay.GameEnum9;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class InfoBox
extends OverlayPanel {
    
    private final  TaskManager n;
    private final  SquireBankStander m;
    
    private final  BankStanderConfig o;

    private static void lIlIllllllIlII() {
        lllIlIlIIll = new String[lllIlIlIlII[0]];
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[1]] = "Squire Bankstander";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[2]] = "Runtime:";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[3]] = "Version";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[4]] = "1.2.1";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[5]] = "Task: ";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[6]] = "Glass on ground: ";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[7]] = "Gems cut: ";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[8]] = "Gems cut per hour: ";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[9]] = "Products Made: ";
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[10]] = "Products Made Per Hour: ";
    }

    private static boolean lIlIllllllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllllllIII(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    private InfoBox(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        this.m = squireBankStander;
        this.n = squireBankStander.getManager();
        this.o = bankStanderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        InfoBox.lIlIllllllIlIl();
        InfoBox.lIlIllllllIlII();
    }

    private static boolean lIlIlllllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllllllIIl(int n2) {
        return n2 == 0;
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        if (InfoBox.lIlIlllllllIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox var1;
        if (InfoBox.lIlIllllllIllI(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var2 = Duration.between(var1.m.getStarted(), Instant.now());
        var1.panelComponent.setBorder(new Rectangle(lllIlIlIlII[0], lllIlIlIlII[0], lllIlIlIlII[0], lllIlIlIlII[0]));
        var1.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIlIIll[lllIlIlIlII[1]]).build());

        var1.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[2]]).right(Time.format((Duration)var2)).build());

        var1.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[3]]).right(lllIlIlIIll[lllIlIlIlII[4]]).build());

        var1.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[5]]).right(var1.n.getCurrentTask()).build());

        if (InfoBox.lIlIllllllIlll((Object)var1.o.activity(), (Object)b.GLASS_MAKE)) {
            var1.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[6]]).right(String.valueOf(var1.m.b())).build());

        }
        if (InfoBox.lIlIllllllIlll((Object)var1.o.activity(), (Object)b.GLASS_BLOWING)) {
            var1.panelComponent.getChildren().add(LineComponent.builder().left(var1.o.glassProduct().name() + " made").right(String.valueOf(var1.m.c())).build());

        }
        if (InfoBox.lIlIllllllIlll((Object)var1.o.activity(), (Object)b.GEM_CUTTING)) {
            var1.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[7]]).right(String.valueOf(var1.m.c())).build());

            var1.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[8]]).right(String.valueOf(var1.d(var1.m.c()))).build());

        }
        if (!InfoBox.lIlIlllllllIII((Object)var1.o.activity(), (Object)b.SMITHING) || !InfoBox.lIlIlllllllIII((Object)var1.o.activity(), (Object)b.FLETCH_CUTTING) || InfoBox.lIlIllllllIlll((Object)var1.o.activity(), (Object)b.STRING_BOWS)) {
            var1.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[9]]).right(String.valueOf(var1.m.c())).build());

            var1.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[10]]).right(String.valueOf(var1.d(var1.m.c()))).build());

        }
        int n2 = lllIlIlIlII[11];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIlIlIlII[12], lllIlIlIlII[1]));
        return super.render(graphics2D);
    }

    private static boolean lIlIllllllIlll(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var3);
    }
}

