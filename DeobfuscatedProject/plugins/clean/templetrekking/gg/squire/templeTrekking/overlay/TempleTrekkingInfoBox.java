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
package gg.squire.templeTrekking.overlay;

import com.google.inject.Inject;
import gg.squire.templeTrekking.overlay.BHelper;
import gg.squire.templeTrekking.overlay.GameEnum16;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
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

public class TempleTrekkingInfoBox
extends OverlayPanel {
    private final  b C;
    private final  TaskManager A;
    private final  TempleTrekkingPlugin z;

    private final  TempleTrekkingConfig B;

    @Inject
    private TempleTrekkingInfoBox(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b b2) {
        this.z = templeTrekkingPlugin;
        this.A = templeTrekkingPlugin.getManager();
        this.B = templeTrekkingConfig;
        this.C = b2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIIIIllllIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIIIIlllllII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIIllllIII() {
        lIIllIlIlllIl = new String[lIIllIlIllllI[12]];
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = "Squire Temple Trekking";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = "Runtime:";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[5]] = "Runs:";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[6]] = "%d (%d/h)";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[8]] = "Tome XP: ";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[9]] = "%dk (%dk/h)";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[11]] = "%d (%d/h)";
    }

    private static boolean lIllIIIIllllIlI(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.z.getStarted(), Instant.now());
        if (TempleTrekkingInfoBox.lIllIIIIlllllII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIllIIIIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        TempleTrekkingInfoBox var2;
        if (TempleTrekkingInfoBox.lIllIIIIllllIlI(this.z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var2.panelComponent.setBorder(new Rectangle(lIIllIlIllllI[0], lIIllIlIllllI[0], lIIllIlIllllI[0], lIIllIlIllllI[0]));
        String var3 = lIIllIlIlllIl[lIIllIlIllllI[1]];
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var3).build());

        int var4 = lIIllIlIllllI[2];
        var2.panelComponent.setPreferredSize(new Dimension(var4 + lIIllIlIllllI[3], lIIllIlIllllI[1]));
        Duration var5 = Duration.between(var2.z.getStarted(), Instant.now());
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[4]]).right(Time.format((Duration)var5)).build());

        int var6 = (int)var2.d(var2.z.j());
        Object[] objectArray = new Object[lIIllIlIllllI[5]];
        objectArray[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = var2.z.j();
        objectArray[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = var6;
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[5]]).right(String.format(lIIllIlIlllIl[lIIllIlIllllI[6]], objectArray)).build());

        if (TempleTrekkingInfoBox.lIllIIIIllllIll((Object)var2.B.reward(), (Object)d.XP_TOME)) {
            int var7 = (int)(var2.d(var2.C.m()) * 1375L) / lIIllIlIllllI[7];
            Object[] objectArray2 = new Object[lIIllIlIllllI[5]];
            objectArray2[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = var2.C.m() * lIIllIlIllllI[10] / lIIllIlIllllI[7];
            objectArray2[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = var7;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[8]]).right(String.format(lIIllIlIlllIl[lIIllIlIllllI[9]], objectArray2)).build());

            if (((0x49 ^ 0x29 ^ (0x15 ^ 0x64)) & (0x7A ^ 3 ^ (0x64 ^ 0xC) ^ -1)) < 0) {
                return null;
            }
        } else {
            int var7 = (int)var2.d(var2.C.m());
            Object[] objectArray3 = new Object[lIIllIlIllllI[5]];
            objectArray3[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = var2.C.m();
            objectArray3[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = var7;
            var2.panelComponent.getChildren().add(LineComponent.builder().left(var2.B.reward().y()).right(String.format(lIIllIlIlllIl[lIIllIlIllllI[11]], objectArray3)).build());

        }
        return super.render(graphics2D);
    }

    static {
        TempleTrekkingInfoBox.lIllIIIIllllIIl();
        TempleTrekkingInfoBox.lIllIIIIllllIII();
    }
}

