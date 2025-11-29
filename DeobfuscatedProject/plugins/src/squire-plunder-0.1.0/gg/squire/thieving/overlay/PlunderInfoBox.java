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
package gg.squire.thieving.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.thieving.SquirePlunder;
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
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a;

public class PlunderInfoBox
extends OverlayPanel {
    private final /* synthetic */ SquirePlunder o;
    private final /* synthetic */ a q;
    private static /* synthetic */ String[] llllllIIlIll;
    private final /* synthetic */ TaskManager p;
    private static /* synthetic */ int[] llllllIIllII;

    private static String lIIlIlIIIIlIllI(String lllllllllllllllIIlIIlllIlIIIIllI, String lllllllllllllllIIlIIlllIlIIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlllIlIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllIlIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlllIlIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlllIlIIIlIII.init(llllllIIllII[3], lllllllllllllllIIlIIlllIlIIIlIIl);
            return new String(lllllllllllllllIIlIIlllIlIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlllIlIIIIlll) {
            lllllllllllllllIIlIIlllIlIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIllIll(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (PlunderInfoBox.lIIlIlIIIIllIll(this.o.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.o.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllllIIllII[0], llllllIIllII[0], llllllIIllII[0], llllllIIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_YELLOW).text(llllllIIlIll[llllllIIllII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[2]]).right(llllllIIlIll[llllllIIllII[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[4]]).right(Time.format((Duration)duration)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[5]]).right(String.valueOf(this.q.e())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[6]]).right(this.p.getCurrentTask()).build());
        "".length();
        int n2 = llllllIIllII[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llllllIIllII[8], llllllIIllII[1]));
        return super.render(graphics2D);
    }

    private static String lIIlIlIIIIllIII(String lllllllllllllllIIlIIlllIIlllIlll, String lllllllllllllllIIlIIlllIIlllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlllIIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllIIlllIllI.getBytes(StandardCharsets.UTF_8)), llllllIIllII[10]), "DES");
            Cipher lllllllllllllllIIlIIlllIIllllIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlllIIllllIll.init(llllllIIllII[3], lllllllllllllllIIlIIlllIIlllllII);
            return new String(lllllllllllllllIIlIIlllIIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlllIIllllIlI) {
            lllllllllllllllIIlIIlllIIllllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIIIllIIl() {
        llllllIIlIll = new String[llllllIIllII[9]];
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[1]] = PlunderInfoBox.lIIlIlIIIIlIllI("KsTD8cuBipv+U+SAMPoIg6PvHVOd+LO+", "umPSR");
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[2]] = PlunderInfoBox.lIIlIlIIIIlIlll("MgMFAwQLCA==", "dfwpm");
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[3]] = PlunderInfoBox.lIIlIlIIIIllIII("tOKaXyZMMDw=", "tJCDV");
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[4]] = PlunderInfoBox.lIIlIlIIIIllIII("2OGZebCFs3U=", "ffihy");
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[5]] = PlunderInfoBox.lIIlIlIIIIlIlll("IgE9ITMDBytxIR4XNjV9UQ==", "qbXQG");
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[6]] = PlunderInfoBox.lIIlIlIIIIlIlll("BTcfP3Nx", "QVlTI");
    }

    @Inject
    private PlunderInfoBox(SquirePlunder squirePlunder, a a2) {
        this.o = squirePlunder;
        this.p = squirePlunder.getManager();
        this.q = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIIlIlIIIIllIlI() {
        llllllIIllII = new int[11];
        PlunderInfoBox.llllllIIllII[0] = 0xA8 ^ 0xA2;
        PlunderInfoBox.llllllIIllII[1] = (0x7A ^ 0x1F ^ (0x10 ^ 0x23)) & (0xAA ^ 0x9C ^ (0x36 ^ 0x56) ^ -" ".length());
        PlunderInfoBox.llllllIIllII[2] = " ".length();
        PlunderInfoBox.llllllIIllII[3] = "  ".length();
        PlunderInfoBox.llllllIIllII[4] = "   ".length();
        PlunderInfoBox.llllllIIllII[5] = 0xB2 ^ 0x86 ^ (0x7E ^ 0x4E);
        PlunderInfoBox.llllllIIllII[6] = 0x5E ^ 0x7C ^ (0xB1 ^ 0x96);
        PlunderInfoBox.llllllIIllII[7] = 0xFFFF8DAF & 0x7352;
        PlunderInfoBox.llllllIIllII[8] = 0x7D ^ 0x69;
        PlunderInfoBox.llllllIIllII[9] = 0x76 ^ 0x70;
        PlunderInfoBox.llllllIIllII[10] = 0x9C ^ 0x94;
    }

    static {
        PlunderInfoBox.lIIlIlIIIIllIlI();
        PlunderInfoBox.lIIlIlIIIIllIIl();
    }

    private static String lIIlIlIIIIlIlll(String lllllllllllllllIIlIIlllIlIIlIllI, String lllllllllllllllIIlIIlllIlIIlIlIl) {
        lllllllllllllllIIlIIlllIlIIlIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlllIlIIllIIl = new StringBuilder();
        char[] lllllllllllllllIIlIIlllIlIIllIII = lllllllllllllllIIlIIlllIlIIlIlIl.toCharArray();
        int lllllllllllllllIIlIIlllIlIIlIlll = llllllIIllII[1];
        char[] lllllllllllllllIIlIIlllIlIIlIIIl = lllllllllllllllIIlIIlllIlIIlIllI.toCharArray();
        int lllllllllllllllIIlIIlllIlIIlIIII = lllllllllllllllIIlIIlllIlIIlIIIl.length;
        int lllllllllllllllIIlIIlllIlIIIllll = llllllIIllII[1];
        while (PlunderInfoBox.lIIlIlIIIIlllII(lllllllllllllllIIlIIlllIlIIIllll, lllllllllllllllIIlIIlllIlIIlIIII)) {
            char lllllllllllllllIIlIIlllIlIIlllII = lllllllllllllllIIlIIlllIlIIlIIIl[lllllllllllllllIIlIIlllIlIIIllll];
            lllllllllllllllIIlIIlllIlIIllIIl.append((char)(lllllllllllllllIIlIIlllIlIIlllII ^ lllllllllllllllIIlIIlllIlIIllIII[lllllllllllllllIIlIIlllIlIIlIlll % lllllllllllllllIIlIIlllIlIIllIII.length]));
            "".length();
            ++lllllllllllllllIIlIIlllIlIIlIlll;
            ++lllllllllllllllIIlIIlllIlIIIllll;
            "".length();
            if ("  ".length() <= (0x2D ^ 0x29)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIlllIlIIllIIl);
    }

    private static boolean lIIlIlIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }
}

