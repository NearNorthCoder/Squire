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
package gg.squire.combat.overlays;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
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

public class InfoBox
extends OverlayPanel {
    private final  SquireBlueDragonKiller p;
    private final  SquireBlueDragonKiller r;
    private final  TaskManager q;

    private final  SquireBlueDragonKillerConfig s;

    public long g(int n) {
        Duration duration = Duration.between(this.r.getStarted(), Instant.now());
        if (InfoBox.llIlIIIIllIlII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean llIlIIIIllIlII(int n) {
        return n == 0;
    }

    static {
        InfoBox.llIlIIIIllIIlI();
        InfoBox.llIlIIIIllIIIl();
    }

    private static boolean llIlIIIIllIIll(int n) {
        return n != 0;
    }

    private static boolean llIlIIIIllIlIl(int n, int n2) {
        return n < n2;
    }

    private static void llIlIIIIllIIIl() {
        lIIlllIlIIlI = new String[lIIlllIlIIll[10]];
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[0]] = "Squire Blue Dragon Killer";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[1]] = "Runtime: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[2]] = "Version";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[3]] = "1.1.0";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[4]] = "Task: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[5]] = "Dragon Bones: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[6]] = "Dragon Hides / H: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[7]] = "Dragon Scales / H: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[8]] = "Ensouled Heads / H: ";
    }

        return String.valueOf(var1);
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox var2;
        if (InfoBox.llIlIIIIllIIll(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var3 = Duration.between(var2.p.getStarted(), Instant.now());
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllIlIIlI[lIIlllIlIIll[0]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[1]]).right(Time.format((Duration)var3)).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[2]]).right(lIIlllIlIIlI[lIIlllIlIIll[3]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[4]]).right(var2.q.getCurrentTask()).build());

        if (InfoBox.llIlIIIIllIIll(var2.s.lootBones() ? 1 : 0)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[5]]).right(var2.r.d() + " (" + var2.g(var2.r.d()) + "/h)").build());

        }
        if (InfoBox.llIlIIIIllIIll(var2.s.lootHides() ? 1 : 0)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[6]]).right(var2.r.e() + " (" + var2.g(var2.r.e()) + "/h)").build());

        }
        if (InfoBox.llIlIIIIllIIll(var2.s.lootScales() ? 1 : 0)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[7]]).right(var2.r.f() + " (" + var2.g(var2.r.f()) + "/h)").build());

        }
        if (InfoBox.llIlIIIIllIIll(var2.s.lootEnsouled() ? 1 : 0)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[8]]).right(var2.r.g() + " (" + var2.g(var2.r.g()) + "/h)").build());

        }
        int n = lIIlllIlIIll[9];
        this.panelComponent.setPreferredSize(new Dimension(n, lIIlllIlIIll[0]));
        return super.render(graphics2D);
    }

    @Inject
    public InfoBox(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKiller squireBlueDragonKiller2, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.p = squireBlueDragonKiller;
        this.q = squireBlueDragonKiller.getManager();
        this.r = squireBlueDragonKiller2;
        this.s = squireBlueDragonKillerConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

}

