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
package gg.squire.minigames.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireSorceressGarden;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
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

public class InfoBox
extends OverlayPanel {
    private final  SquireSorceressGarden p;
    private final  TaskManager q;
    
    private final  SquireSorceressGardenConfig r;

    public long n(int n) {
        Duration duration = Duration.between(this.p.getStarted(), Instant.now());
        if (InfoBox.lIlIlllllIlllII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static void lIlIlllllIllIII() {
        lIIllIIlIIlIl = new String[lIIllIIlIIlll[19]];
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[1]] = "Squire Sorceress Garden";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[2]] = "Runtime";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[3]] = "Task: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[4]] = "Sq'irks Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[5]] = "XP PH: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[6]] = "Herbs Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[7]] = "Guams Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[8]] = "Marrentills Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[9]] = "Tarromins Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[10]] = "Harralanders Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[0]] = "Irits Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[11]] = "Avantoes Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[12]] = "Ranarrs Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[13]] = "Kwuarms Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[14]] = "Cadantines Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[15]] = "Lantadymes Collected: ";
        InfoBox.lIIllIIlIIlIl[InfoBox.lIIllIIlIIlll[16]] = "Dwarf Weeds Collected: ";
    }

    @Inject
    private InfoBox(SquireSorceressGarden squireSorceressGarden, SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.p = squireSorceressGarden;
        this.q = squireSorceressGarden.getManager();
        this.r = squireSorceressGardenConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIlllllIllIll(int n) {
        return n != 0;
    }

    static {
        InfoBox.lIlIlllllIllIlI();
        InfoBox.lIlIlllllIllIII();
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox var2;
        if (InfoBox.lIlIlllllIllIll(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var3 = Duration.between(var2.p.getStarted(), Instant.now());
        var2.panelComponent.setBorder(new Rectangle(lIIllIIlIIlll[0], lIIllIIlIIlll[0], lIIllIIlIIlll[0], lIIllIIlIIlll[0]));
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIllIIlIIlIl[lIIllIIlIIlll[1]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[2]]).right(Time.format((Duration)var3)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[3]]).right(var2.q.getCurrentTask()).build());

        if (InfoBox.lIlIlllllIlllII(var2.r.pickHerbs() ? 1 : 0)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[4]]).right(var2.p.a() + " (" + var2.n(var2.p.a()) + "/h)").build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[5]]).right(NumberFormat.getIntegerInstance().format(var2.n())).build());

            if (((0x42 ^ 0x18) & ~(0x3B ^ 0x61)) >= 2) {
                return null;
            }
        } else if (InfoBox.lIlIlllllIlllII(var2.r.breakDownHerbs() ? 1 : 0)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[6]]).right(var2.p.b() + " (" + var2.n(var2.p.b()) + "/h)").build());

            if ((66 + 72 - 116 + 109 ^ 37 + 62 - 21 + 57) <= 0) {
                return null;
            }
        } else {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[7]]).right(var2.p.c() + " (" + var2.n(var2.p.c()) + "/h)").build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[8]]).right(var2.p.d() + " (" + var2.n(var2.p.d()) + "/h)").build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[9]]).right(var2.p.e() + " (" + var2.n(var2.p.e()) + "/h)").build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[10]]).right(var2.p.f() + " (" + var2.n(var2.p.f()) + "/h)").build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[0]]).right(var2.p.g() + " (" + var2.n(var2.p.g()) + "/h)").build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[11]]).right(var2.p.h() + " (" + var2.n(var2.p.h()) + "/h)").build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[12]]).right(var2.p.i() + " (" + var2.n(var2.p.i()) + "/h)").build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[13]]).right(var2.p.j() + " (" + var2.n(var2.p.j()) + "/h)").build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[14]]).right(var2.p.k() + " (" + var2.n(var2.p.k()) + "/h)").build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[15]]).right(var2.p.l() + " (" + var2.n(var2.p.l()) + "/h)").build());

            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlIIlIl[lIIllIIlIIlll[16]]).right(var2.p.m() + " (" + var2.n(var2.p.m()) + "/h)").build());

        }
        int n = lIIllIIlIIlll[17];
        this.panelComponent.setPreferredSize(new Dimension(n + lIIllIIlIIlll[18], lIIllIIlIIlll[1]));
        return super.render(graphics2D);
    }

    private static boolean lIlIlllllIlllII(int n) {
        return n == 0;
    }

    public long n() {
        int n = (int)this.n(this.p.a());
        return (long)n * 1500L;
    }

    private static boolean lIlIlllllIlllIl(int n, int n2) {
        return n < n2;
    }

}

