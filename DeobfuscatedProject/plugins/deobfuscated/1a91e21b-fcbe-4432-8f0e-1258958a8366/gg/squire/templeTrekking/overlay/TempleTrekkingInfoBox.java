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
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.b;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.d;
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
    private final /* synthetic */ b C;
    private final /* synthetic */ TaskManager A;
    private final /* synthetic */ TempleTrekkingPlugin z;
    private static /* synthetic */ String[] lIIllIlIlllIl;
    private static /* synthetic */ int[] lIIllIlIllllI;
    private final /* synthetic */ TempleTrekkingConfig B;

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

    private static String lIllIIIIlllIllI(String llllllllllllllIlllIlllIlllIlllIl, String llllllllllllllIlllIlllIlllIlllII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIllllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIllllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIllllIIIIl.init(lIIllIlIllllI[5], llllllllllllllIlllIlllIllllIIIlI);
            return new String(llllllllllllllIlllIlllIllllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIllllIIIII) {
            llllllllllllllIlllIlllIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlllllII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIIllllIII() {
        lIIllIlIlllIl = new String[lIIllIlIllllI[12]];
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = TempleTrekkingInfoBox."Squire Temple Trekking";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = TempleTrekkingInfoBox."Runtime:";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[5]] = TempleTrekkingInfoBox."Runs:";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[6]] = TempleTrekkingInfoBox."%d (%d/h)";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[8]] = TempleTrekkingInfoBox."Tome XP: ";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[9]] = TempleTrekkingInfoBox."%dk (%dk/h)";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[11]] = TempleTrekkingInfoBox."%d (%d/h)";
    }

    private static boolean lIllIIIIllllIlI(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIIlllIlll(String llllllllllllllIlllIlllIlllllIlII, String llllllllllllllIlllIlllIllllIlllI) {
        llllllllllllllIlllIlllIlllllIlII = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIlllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIlllllIIlI = new StringBuilder();
        char[] llllllllllllllIlllIlllIlllllIIIl = llllllllllllllIlllIlllIllllIlllI.toCharArray();
        int llllllllllllllIlllIlllIlllllIIII = lIIllIlIllllI[1];
        char[] llllllllllllllIlllIlllIllllIlIlI = llllllllllllllIlllIlllIlllllIlII.toCharArray();
        int llllllllllllllIlllIlllIllllIlIIl = llllllllllllllIlllIlllIllllIlIlI.length;
        int llllllllllllllIlllIlllIllllIlIII = lIIllIlIllllI[1];
        while (TempleTrekkingInfoBox.lIllIIIIlllllIl(llllllllllllllIlllIlllIllllIlIII, llllllllllllllIlllIlllIllllIlIIl)) {
            char llllllllllllllIlllIlllIlllllIlIl = llllllllllllllIlllIlllIllllIlIlI[llllllllllllllIlllIlllIllllIlIII];
            llllllllllllllIlllIlllIlllllIIlI.append((char)(llllllllllllllIlllIlllIlllllIlIl ^ llllllllllllllIlllIlllIlllllIIIl[llllllllllllllIlllIlllIlllllIIII % llllllllllllllIlllIlllIlllllIIIl.length]));
            0;
            ++llllllllllllllIlllIlllIlllllIIII;
            ++llllllllllllllIlllIlllIllllIlIII;
            0;
            if (2 >= 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllIlllllIIlI);
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

    private static void lIllIIIIllllIIl() {
        lIIllIlIllllI = new int[13];
        TempleTrekkingInfoBox.lIIllIlIllllI[0] = 0x88 ^ 0x82;
        TempleTrekkingInfoBox.lIIllIlIllllI[1] = (0x42 ^ 0x50) & ~(0x6B ^ 0x79);
        TempleTrekkingInfoBox.lIIllIlIllllI[2] = 56 + 156 - 196 + 177;
        TempleTrekkingInfoBox.lIIllIlIllllI[3] = 0x86 ^ 0x92;
        TempleTrekkingInfoBox.lIIllIlIllllI[4] = 1;
        TempleTrekkingInfoBox.lIIllIlIllllI[5] = 2;
        TempleTrekkingInfoBox.lIIllIlIllllI[6] = 3;
        TempleTrekkingInfoBox.lIIllIlIllllI[7] = -(0xFFFFFDB3 & 0x4E5F) & (0xFFFFDFFE & 0x6FFB);
        TempleTrekkingInfoBox.lIIllIlIllllI[8] = 0x9F ^ 0x9B;
        TempleTrekkingInfoBox.lIIllIlIllllI[9] = 0x89 ^ 0x8C;
        TempleTrekkingInfoBox.lIIllIlIllllI[10] = -(0xFFFFDB51 & 0x6CAF) & (0xFFFFFFFF & 0x4D5F);
        TempleTrekkingInfoBox.lIIllIlIllllI[11] = 91 + 32 - 62 + 90 ^ 73 + 85 - 108 + 95;
        TempleTrekkingInfoBox.lIIllIlIllllI[12] = 0xBF ^ 0xB8;
    }

    public Dimension render(Graphics2D graphics2D) {
        TempleTrekkingInfoBox llllllllllllllIlllIllllIIIIIlIll;
        if (TempleTrekkingInfoBox.lIllIIIIllllIlI(this.z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        llllllllllllllIlllIllllIIIIIlIll.panelComponent.setBorder(new Rectangle(lIIllIlIllllI[0], lIIllIlIllllI[0], lIIllIlIllllI[0], lIIllIlIllllI[0]));
        String llllllllllllllIlllIllllIIIIIlIIl = lIIllIlIlllIl[lIIllIlIllllI[1]];
        llllllllllllllIlllIllllIIIIIlIll.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllllllllllllIlllIllllIIIIIlIIl).build());
        0;
        int llllllllllllllIlllIllllIIIIIlIII = lIIllIlIllllI[2];
        llllllllllllllIlllIllllIIIIIlIll.panelComponent.setPreferredSize(new Dimension(llllllllllllllIlllIllllIIIIIlIII + lIIllIlIllllI[3], lIIllIlIllllI[1]));
        Duration llllllllllllllIlllIllllIIIIIIlll = Duration.between(llllllllllllllIlllIllllIIIIIlIll.z.getStarted(), Instant.now());
        llllllllllllllIlllIllllIIIIIlIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[4]]).right(Time.format((Duration)llllllllllllllIlllIllllIIIIIIlll)).build());
        0;
        int llllllllllllllIlllIllllIIIIIIllI = (int)llllllllllllllIlllIllllIIIIIlIll.d(llllllllllllllIlllIllllIIIIIlIll.z.j());
        Object[] objectArray = new Object[lIIllIlIllllI[5]];
        objectArray[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = llllllllllllllIlllIllllIIIIIlIll.z.j();
        objectArray[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = llllllllllllllIlllIllllIIIIIIllI;
        llllllllllllllIlllIllllIIIIIlIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[5]]).right(String.format(lIIllIlIlllIl[lIIllIlIllllI[6]], objectArray)).build());
        0;
        if (TempleTrekkingInfoBox.lIllIIIIllllIll((Object)llllllllllllllIlllIllllIIIIIlIll.B.reward(), (Object)d.XP_TOME)) {
            int llllllllllllllIlllIllllIIIIIIlIl = (int)(llllllllllllllIlllIllllIIIIIlIll.d(llllllllllllllIlllIllllIIIIIlIll.C.m()) * 1375L) / lIIllIlIllllI[7];
            Object[] objectArray2 = new Object[lIIllIlIllllI[5]];
            objectArray2[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = llllllllllllllIlllIllllIIIIIlIll.C.m() * lIIllIlIllllI[10] / lIIllIlIllllI[7];
            objectArray2[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = llllllllllllllIlllIllllIIIIIIlIl;
            llllllllllllllIlllIllllIIIIIlIll.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[8]]).right(String.format(lIIllIlIlllIl[lIIllIlIllllI[9]], objectArray2)).build());
            0;
            0;
            if (((0x49 ^ 0x29 ^ (0x15 ^ 0x64)) & (0x7A ^ 3 ^ (0x64 ^ 0xC) ^ -1)) < 0) {
                return null;
            }
        } else {
            int llllllllllllllIlllIllllIIIIIIlIl = (int)llllllllllllllIlllIllllIIIIIlIll.d(llllllllllllllIlllIllllIIIIIlIll.C.m());
            Object[] objectArray3 = new Object[lIIllIlIllllI[5]];
            objectArray3[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = llllllllllllllIlllIllllIIIIIlIll.C.m();
            objectArray3[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = llllllllllllllIlllIllllIIIIIIlIl;
            llllllllllllllIlllIllllIIIIIlIll.panelComponent.getChildren().add(LineComponent.builder().left(llllllllllllllIlllIllllIIIIIlIll.B.reward().y()).right(String.format(lIIllIlIlllIl[lIIllIlIllllI[11]], objectArray3)).build());
            0;
        }
        return super.render(graphics2D);
    }

    static {
        TempleTrekkingInfoBox.lIllIIIIllllIIl();
        TempleTrekkingInfoBox.lIllIIIIllllIII();
    }
}

