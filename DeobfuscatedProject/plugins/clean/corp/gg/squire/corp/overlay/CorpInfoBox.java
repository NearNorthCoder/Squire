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
package gg.squire.corp.overlay;

import gg.squire.corp.overlay.SHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.corp.SquireCorp;
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

public class CorpInfoBox
extends OverlayPanel {
    private final  SquireCorp j;
    private final  s l;

    private final  TaskManager k;

    public String a(int n2) {
        Duration duration = Duration.between(this.j.getStarted(), Instant.now());
        if (CorpInfoBox.lllIIIIlIlllIl(duration.isZero() ? 1 : 0)) {
            Object[] objectArray = new Object[lIlIlllIIlII[2]];
            objectArray[CorpInfoBox.lIlIlllIIlII[1]] = (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
            return String.format(lIlIlllIIIll[lIlIlllIIlII[0]], objectArray);
        }
        return lIlIlllIIIll[lIlIlllIIlII[11]];
    }

    public Dimension render(Graphics2D graphics2D) {
        if (CorpInfoBox.lllIIIIlIlllII(this.j.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIlllIIlII[0], lIlIlllIIlII[0], lIlIlllIIlII[0], lIlIlllIIlII[0]));
        String string = lIlIlllIIIll[lIlIlllIIlII[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[2]]).right(this.k.getCurrentTask()).build());

        Duration duration = Duration.between(this.j.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[3]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[4]]).right(this.j.a() + " (" + this.a(this.j.a()) + "/h)").build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[5]]).right(this.j.e() + " (" + this.a(this.j.e()) + "/h)").build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[6]]).right(String.valueOf(this.j.b())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[7]]).right(String.valueOf(this.j.d())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[8]]).right(String.valueOf(this.l.r())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[9]]).right(String.valueOf(this.l.s())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[10]]).right(String.valueOf(this.l.q())).build());

        return super.render(graphics2D);
    }

    static {
        CorpInfoBox.lllIIIIlIllIll();
        CorpInfoBox.lllIIIIlIllIlI();
    }

    private static boolean lllIIIIlIlllIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public CorpInfoBox(SquireCorp squireCorp, s s2) {
        this.j = squireCorp;
        this.k = squireCorp.getManager();
        this.l = s2;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean lllIIIIlIlllII(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    private static void lllIIIIlIllIlI() {
        lIlIlllIIIll = new String[lIlIlllIIlII[12]];
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[1]] = "Squire Corporeal Beast";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[2]] = "Current Task";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[3]] = "Runtime";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[4]] = "Kills";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[5]] = "Loot";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[6]] = "Banking";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[7]] = "Hopping";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[8]] = "DWH Specs";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[9]] = "Arclight Specs";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[10]] = "BGS damage";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[0]] = "%.2f";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[11]] = "0";
    }

    private static boolean lllIIIIlIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

