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
package gg.squire.mining.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
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
import gg.squire.mining.overlay.MiningManager;
import gg.squire.mining.overlay.GameEnum29;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class MiningInfoBox
extends OverlayPanel {
    private final  SquireMinerConfig n;
    private final  TaskManager m;
    private final  SquireMiner l;

    private final  T o;

    private static boolean lIIlIIlllIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIlllIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIlllIIllII() {
        lllllIlIlIIl = new String[lllllIllIIll[14]];
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[0]] = "Squire Miner";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[1]] = "Runtime";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[2]] = "Version";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[3]] = "1.3.4";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[4]] = "Task: ";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[7]] = "Paydirt: ";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[8]] = "%d | %d | %d";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[9]] = "Sack size: ";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[10]] = "Banking:";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[11]] = "Mined";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[12]] = "Mined";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[13]] = "Mined Per Hour";
    }

    public long a(int n2) {
        Duration duration = Duration.between(this.l.getStarted(), Instant.now());
        if (MiningInfoBox.lIIlIIlllIlIIII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIIlllIIllll(Object object, Object object2) {
        return object == object2;
    }

    static {
        MiningInfoBox.lIIlIIlllIIllIl();
        MiningInfoBox.lIIlIIlllIIllII();
    }

    private void b(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[11]]).right(String.valueOf(this.l.b())).build());

    }

    private void c(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[12]]).right(String.valueOf(this.l.b())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[13]]).right(String.valueOf(this.a(this.l.b()))).build());

    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void var2;
        MiningInfoBox var3;
        if (MiningInfoBox.lIIlIIlllIIlllI(this.l.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var4 = Duration.between(var3.l.getStarted(), Instant.now());
        var3.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllIlIlIIl[lllllIllIIll[0]]).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[1]]).right(Time.format((Duration)var4)).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[2]]).right(lllllIlIlIIl[lllllIllIIll[3]]).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[4]]).right(var3.m.getCurrentTask()).build());

        if (MiningInfoBox.lIIlIIlllIIllll((Object)var3.n.activity(), (Object)a.GRANITE)) {
            var3.c((Graphics2D)var2);
        }
        if (MiningInfoBox.lIIlIIlllIIllll((Object)var3.n.activity(), (Object)a.SANDSTONE)) {
            var3.b((Graphics2D)var2);

            }
        } else if (MiningInfoBox.lIIlIIlllIIllll((Object)var3.n.activity(), (Object)a.MOTHERLODE_MINE)) {
            var3.a((Graphics2D)var2);
        }
        int n2 = lllllIllIIll[5];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllllIllIIll[6], lllllIllIIll[0]));
        return super.render(graphics2D);
    }

    private static boolean lIIlIIlllIIlllI(int n2) {
        return n2 != 0;
    }

    @Inject
    private MiningInfoBox(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig, T t2) {
        this.l = squireMiner;
        this.m = squireMiner.getManager();
        this.n = squireMinerConfig;
        this.o = t2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private void a(Graphics2D graphics2D) {
        Object[] objectArray = new Object[lllllIllIIll[3]];
        objectArray[MiningInfoBox.lllllIllIIll[0]] = this.o.C();
        objectArray[MiningInfoBox.lllllIllIIll[1]] = this.o.N();
        objectArray[MiningInfoBox.lllllIllIIll[2]] = this.o.M();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[7]]).right(String.format(lllllIlIlIIl[lllllIllIIll[8]], objectArray)).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[9]]).right(String.valueOf(this.o.H())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[10]]).right(String.valueOf(this.o.O())).build());

    }
}

