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
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.basics.cerberus.overlay;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.basics.cerberus.overlay.ConstructionManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class CerberusOverlay
extends OverlayPanel {
    private final  a ai;
    private final  TaskManager aj;
    private final  SquireCerberus ah;

    private static boolean llIIIlIlIll(int n2) {
        return n2 != 0;
    }

    private long i(int n2) {
        Duration duration = Duration.between(this.ah.getStarted(), Instant.now());
        if (CerberusOverlay.llIIIlIlIll(duration.isZero() ? 1 : 0)) {
            return 0L;
        }
        return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
    }

        return String.valueOf(lIlIlIllIlllllI);
    }

    private static boolean llIIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        CerberusOverlay.llIIIlIlIlI();
        CerberusOverlay.llIIIlIlIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        String string2;
        String string3;
        String string4;
        CerberusOverlay lIlIlIllllIIIIl;
        if (CerberusOverlay.llIIIlIlIll(this.ah.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        lIlIlIllllIIIIl.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIIllII[lllIIllIl[0]]).build());

        Duration lIlIlIlllIlllll = Duration.between(lIlIlIllllIIIIl.ah.getStarted(), Instant.now());
        lIlIlIllllIIIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[1]]).right(Time.format((Duration)lIlIlIlllIlllll)).build());

        List list = lIlIlIllllIIIIl.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lllIIllII[lllIIllIl[2]]);
        if (CerberusOverlay.llIIIlIllII(lIlIlIllllIIIIl.ai.k())) {
            string4 = lllIIllII[lllIIllIl[3]];

            if (((0x97 ^ 0xA2) & ~(0x9A ^ 0xAF)) >= 1) {
                return null;
            }
        } else {
            string4 = lllIIllII[lllIIllIl[4]];
        }
        list.add(lineComponentBuilder.right(string4).build());

        List list2 = lIlIlIllllIIIIl.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder2 = LineComponent.builder().left(lllIIllII[lllIIllIl[5]]);
        if (CerberusOverlay.llIIIlIlIll(lIlIlIllllIIIIl.ah.r() ? 1 : 0)) {
            string3 = lllIIllII[lllIIllIl[6]];

            if (3 < 3) {
                return null;
            }
        } else {
            string3 = lllIIllII[lllIIllIl[7]];
        }
        list2.add(lineComponentBuilder2.right(string3).build());

        lIlIlIllllIIIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[8]]).right(lIlIlIllllIIIIl.ah.q() + " (" + lIlIlIllllIIIIl.i(lIlIlIllllIIIIl.ah.q()) + "/hr)").build());

        List list3 = lIlIlIllllIIIIl.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder3 = LineComponent.builder().left(lllIIllII[lllIIllIl[9]]);
        if (CerberusOverlay.llIIIlIlIll(lIlIlIllllIIIIl.ai.h().isEmpty() ? 1 : 0)) {
            string2 = lllIIllII[lllIIllIl[10]];

            }
        } else {
            string2 = lllIIllII[lllIIllIl[11]];
        }
        list3.add(lineComponentBuilder3.right(string2).build());

        lIlIlIllllIIIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[12]]).right(String.valueOf(lIlIlIllllIIIIl.ai.n())).build());

        List list4 = lIlIlIllllIIIIl.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder4 = LineComponent.builder().left(lllIIllII[lllIIllIl[13]]);
        if (CerberusOverlay.llIIIlIlIll(lIlIlIllllIIIIl.ai.l() ? 1 : 0)) {
            string = lllIIllII[lllIIllIl[14]];

            if ((0xCC ^ 0x86 ^ (0x28 ^ 0x66)) != (0x24 ^ 0x15 ^ (0x92 ^ 0xA7))) {
                return null;
            }
        } else {
            string = lllIIllII[lllIIllIl[15]];
        }
        list4.add(lineComponentBuilder4.right(string).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[16]]).right(String.valueOf(this.ai.o())).build());

        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[17]]).right(this.aj.getCurrentTask()).build());

        int n2 = lllIIllIl[18];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIIllIl[19], lllIIllIl[0]));
        return super.render(graphics2D);
    }

    private static void llIIIlIlIIl() {
        lllIIllII = new String[lllIIllIl[20]];
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[0]] = "Squire Cerberus";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[1]] = "Runtime";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[2]] = "Cerberus";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[3]] = "Alive";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[4]] = "Inactive";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[5]] = "Banking";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[6]] = "Active";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[7]] = "Inactive";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[8]] = "Kills: ";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[9]] = "Alive Ghosts: ";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[10]] = "No";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[11]] = "Yes";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[12]] = "Ghost Scream Tick: ";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[13]] = "Between Kills: ";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[14]] = "Yes";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[15]] = "No";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[16]] = "Game Tick: ";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[17]] = "Task: ";
    }

    private static boolean llIIIlIllII(Object object) {
        return object != null;
    }

    @Inject
    private CerberusOverlay(SquireCerberus squireCerberus, a a2) {
        this.ah = squireCerberus;
        this.ai = a2;
        this.aj = squireCerberus.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

