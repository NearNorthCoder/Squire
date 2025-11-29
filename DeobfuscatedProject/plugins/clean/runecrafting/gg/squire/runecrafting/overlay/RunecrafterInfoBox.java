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
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.runecrafting.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import gg.squire.runecrafting.overlay.AHelper;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
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
public class RunecrafterInfoBox
extends OverlayPanel {

    private final  SquireZeahRunecrafter m;
    private final  a o;
    private final  TaskManager n;

    public Dimension render(Graphics2D graphics2D) {
        if (RunecrafterInfoBox.llIIIllIlIlIlIl(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIllIIllIIlll[0], lIllIIllIIlll[0], lIllIIllIIlll[0], lIllIIllIIlll[0]));
        String string = lIllIIllIIllI[lIllIIllIIlll[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());

        int n = lIllIIllIIlll[2];
        this.panelComponent.setPreferredSize(new Dimension(n + lIllIIllIIlll[3], lIllIIllIIlll[1]));
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[4]]).right(Time.format((Duration)duration)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[5]]).right(this.n.getCurrentTask()).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[6]]).right(this.m.b() + " (" + this.d(this.m.b()) + "/h)").build());

        Object[] objectArray = new Object[lIllIIllIIlll[4]];
        objectArray[RunecrafterInfoBox.lIllIIllIIlll[1]] = this.m.c();
        Object[] objectArray2 = new Object[lIllIIllIIlll[4]];
        objectArray2[RunecrafterInfoBox.lIllIIllIIlll[1]] = this.d(this.m.c());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[7]]).right(String.format(lIllIIllIIllI[lIllIIllIIlll[8]], objectArray) + " (" + String.format(lIllIIllIIllI[lIllIIllIIlll[9]], objectArray2) + "/h)").build());

        return super.render(graphics2D);
    }

    public long d(int n) {
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        if (RunecrafterInfoBox.llIIIllIlIlIllI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    static {
        RunecrafterInfoBox.llIIIllIlIlIlII();
        RunecrafterInfoBox.llIIIllIlIlIIll();
    }

        return String.valueOf(var1);
    }

    private static boolean llIIIllIlIlIlll(int n, int n2) {
        return n < n2;
    }

    private static void llIIIllIlIlIIll() {
        lIllIIllIIllI = new String[lIllIIllIIlll[10]];
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[1]] = "Squire Blood Runecrafter";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[4]] = ">";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[5]] = "Task: ";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[6]] = "Bloods Crafted:";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[7]] = "Gold:";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[8]] = "%,d";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[9]] = "%,d";
    }

    private static boolean llIIIllIlIlIllI(int n) {
        return n == 0;
    }

    private static boolean llIIIllIlIlIlIl(int n) {
        return n != 0;
    }

    @Inject
    public RunecrafterInfoBox(SquireZeahRunecrafter squireZeahRunecrafter, a a2) {
        this.m = squireZeahRunecrafter;
        this.n = squireZeahRunecrafter.getManager();
        this.o = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

