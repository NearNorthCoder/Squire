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
package gg.squire.nightmare.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

public class NightmareInfoBox
extends OverlayPanel {
    private static /* synthetic */ int[] llllIlllIllI;
    private static /* synthetic */ String[] llllIlllIIll;
    private final /* synthetic */ SquireNightmarePlugin cw;
    private final /* synthetic */ int cy = 403886;
    private final /* synthetic */ TaskManager cx;

    private String o(int n2) {
        double d2 = this.n(n2);
        return NightmareInfoBox.a(d2);
    }

    private static boolean lIIlIIIlllllIll(int n2) {
        return n2 >= 0;
    }

    @Inject
    private NightmareInfoBox(SquireNightmarePlugin squireNightmarePlugin, j j2) {
        this.cy = llllIlllIllI[0];
        this.cw = squireNightmarePlugin;
        this.cx = squireNightmarePlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIIlIIIlllllIIl() {
        llllIlllIllI = new int[22];
        NightmareInfoBox.llllIlllIllI[0] = 0xFFFFAFBF & 0x679EE;
        NightmareInfoBox.llllIlllIllI[1] = (0xFD ^ 0xBB) & ~(0xD3 ^ 0x95);
        NightmareInfoBox.llllIlllIllI[2] = 1;
        NightmareInfoBox.llllIlllIllI[3] = 2;
        NightmareInfoBox.llllIlllIllI[4] = 3;
        NightmareInfoBox.llllIlllIllI[5] = 95 + 8 - 86 + 122 ^ 17 + 33 - -52 + 41;
        NightmareInfoBox.llllIlllIllI[6] = 0x52 ^ 0x58;
        NightmareInfoBox.llllIlllIllI[7] = 0x74 ^ 0x71;
        NightmareInfoBox.llllIlllIllI[8] = 12 + 1 - -92 + 48 ^ 39 + 157 - 188 + 151;
        NightmareInfoBox.llllIlllIllI[9] = 0x62 ^ 0x65;
        NightmareInfoBox.llllIlllIllI[10] = 0x2B ^ 0x23;
        NightmareInfoBox.llllIlllIllI[11] = 132 + 29 - 135 + 126 ^ 138 + 126 - 220 + 101;
        NightmareInfoBox.llllIlllIllI[12] = 0x21 ^ 0x2A;
        NightmareInfoBox.llllIlllIllI[13] = 3 ^ 0xF;
        NightmareInfoBox.llllIlllIllI[14] = 0x52 ^ 0x5F;
        NightmareInfoBox.llllIlllIllI[15] = 0xB3 ^ 0xBD;
        NightmareInfoBox.llllIlllIllI[16] = 0x90 ^ 0x9F;
        NightmareInfoBox.llllIlllIllI[17] = 6 ^ 0x43 ^ (0xF ^ 0x5A);
        NightmareInfoBox.llllIlllIllI[18] = 68 + 118 - 67 + 14 ^ 53 + 118 - 100 + 77;
        NightmareInfoBox.llllIlllIllI[19] = 0xFFFFA9BE & 0x5743;
        NightmareInfoBox.llllIlllIllI[20] = 0x58 ^ 0x4C;
        NightmareInfoBox.llllIlllIllI[21] = 0x2A ^ 0x38;
    }

    static {
        NightmareInfoBox.lIIlIIIlllllIIl();
        NightmareInfoBox.lIIlIIIlllllIII();
    }

    public static String a(double d2) {
        double lllllllllllllllIIlIlIllIIlIIIIII;
        if (NightmareInfoBox.lIIlIIIlllllIll(NightmareInfoBox.lIIlIIIlllllIlI(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[llllIlllIllI[2]];
            objectArray[NightmareInfoBox.llllIlllIllI[1]] = d3;
            return String.format(llllIlllIIll[llllIlllIllI[1]], objectArray);
        }
        if (NightmareInfoBox.lIIlIIIlllllIll(NightmareInfoBox.lIIlIIIlllllIlI(lllllllllllllllIIlIlIllIIlIIIIII, 1000.0))) {
            double lllllllllllllllIIlIlIllIIIllllll = lllllllllllllllIIlIlIllIIlIIIIII / 1000.0;
            if (NightmareInfoBox.lIIlIIIllllllII(NightmareInfoBox.lIIlIIIlllllIlI(lllllllllllllllIIlIlIllIIIllllll % 1.0, 0.0))) {
                Object[] objectArray = new Object[llllIlllIllI[2]];
                objectArray[NightmareInfoBox.llllIlllIllI[1]] = lllllllllllllllIIlIlIllIIIllllll;
                return String.format(llllIlllIIll[llllIlllIllI[2]], objectArray);
            }
            Object[] objectArray = new Object[llllIlllIllI[2]];
            objectArray[NightmareInfoBox.llllIlllIllI[1]] = lllllllllllllllIIlIlIllIIIllllll;
            return String.format(llllIlllIIll[llllIlllIllI[3]], objectArray);
        }
        if (NightmareInfoBox.lIIlIIIllllllII(NightmareInfoBox.lIIlIIIlllllIlI(lllllllllllllllIIlIlIllIIlIIIIII % 1.0, 0.0))) {
            Object[] objectArray = new Object[llllIlllIllI[2]];
            objectArray[NightmareInfoBox.llllIlllIllI[1]] = lllllllllllllllIIlIlIllIIlIIIIII;
            return String.format(llllIlllIIll[llllIlllIllI[4]], objectArray);
        }
        Object[] objectArray = new Object[llllIlllIllI[2]];
        objectArray[NightmareInfoBox.llllIlllIllI[1]] = d2;
        return String.format(llllIlllIIll[llllIlllIllI[5]], objectArray);
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        NightmareInfoBox lllllllllllllllIIlIlIllIIIlllIlI;
        if (NightmareInfoBox.lIIlIIIllllllIl(this.cw.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration lllllllllllllllIIlIlIllIIIlllIII = Duration.between(lllllllllllllllIIlIlIllIIIlllIlI.cw.getStarted(), Instant.now());
        lllllllllllllllIIlIlIllIIIlllIlI.panelComponent.setBorder(new Rectangle(llllIlllIllI[6], llllIlllIllI[6], llllIlllIllI[6], llllIlllIllI[6]));
        lllllllllllllllIIlIlIllIIIlllIlI.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllIlllIIll[llllIlllIllI[7]]).build());
        0;
        lllllllllllllllIIlIlIllIIIlllIlI.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[8]]).right(Time.format((Duration)lllllllllllllllIIlIlIllIIIlllIII)).build());
        0;
        lllllllllllllllIIlIlIllIIIlllIlI.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[9]]).right(llllIlllIIll[llllIlllIllI[10]]).build());
        0;
        lllllllllllllllIIlIlIllIIIlllIlI.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[11]]).right(lllllllllllllllIIlIlIllIIIlllIlI.cx.getCurrentTask()).build());
        0;
        List list = lllllllllllllllIIlIlIllIIIlllIlI.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llllIlllIIll[llllIlllIllI[6]]);
        if (NightmareInfoBox.lIIlIIIllllllIl(lllllllllllllllIIlIlIllIIIlllIlI.cw.ae() ? 1 : 0)) {
            string = llllIlllIIll[llllIlllIllI[12]];
            0;
            if (-1 > ((0xD4 ^ 0x98 ^ (0x10 ^ 0x1C)) & (40 + 92 - -63 + 2 ^ 125 + 18 - 26 + 16 ^ -1))) {
                return null;
            }
        } else {
            string = llllIlllIIll[llllIlllIllI[13]];
        }
        list.add(lineComponentBuilder.right(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[14]]).right(String.valueOf(this.cw.af())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[15]]).right(this.o(this.cw.af())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[16]]).right(this.o(this.cw.af() * llllIlllIllI[0])).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[17]]).right(String.valueOf(this.cw.J())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlllIIll[llllIlllIllI[18]]).right(String.valueOf(this.cw.K())).build());
        0;
        int n2 = llllIlllIllI[19];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llllIlllIllI[20], llllIlllIllI[1]));
        return super.render(graphics2D);
    }

    private static String lIIlIIIlllIlllI(String lllllllllllllllIIlIlIllIIIIlllII, String lllllllllllllllIIlIlIllIIIIllIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIllIIIIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIllIIIIllllI.init(llllIlllIllI[3], lllllllllllllllIIlIlIllIIIIlllll);
            return new String(lllllllllllllllIIlIlIllIIIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIllIIIIlllIl) {
            lllllllllllllllIIlIlIllIIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIllllllIl(int n2) {
        return n2 != 0;
    }

    private static String lIIlIIIllllIIIl(String lllllllllllllllIIlIlIllIIIlIlIIl, String lllllllllllllllIIlIlIllIIIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIIIlIIllI.getBytes(StandardCharsets.UTF_8)), llllIlllIllI[10]), "DES");
            Cipher lllllllllllllllIIlIlIllIIIlIlIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIllIIIlIlIll.init(llllIlllIllI[3], lllllllllllllllIIlIlIllIIIlIllII);
            return new String(lllllllllllllllIIlIlIllIIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIllIIIlIlIlI) {
            lllllllllllllllIIlIlIllIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static int lIIlIIIlllllIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean lIIlIIIllllllII(int n2) {
        return n2 == 0;
    }

    public double n(int n2) {
        Duration duration = Duration.between(this.cw.getStarted(), Instant.now());
        if (NightmareInfoBox.lIIlIIIllllllII(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static boolean lIIlIIIlllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIIlllIllll(String lllllllllllllllIIlIlIllIIIIIIlll, String lllllllllllllllIIlIlIllIIIIIIllI) {
        lllllllllllllllIIlIlIllIIIIIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIllIIIIIlIlI = new StringBuilder();
        char[] lllllllllllllllIIlIlIllIIIIIlIIl = lllllllllllllllIIlIlIllIIIIIIllI.toCharArray();
        int lllllllllllllllIIlIlIllIIIIIlIII = llllIlllIllI[1];
        char[] lllllllllllllllIIlIlIllIIIIIIIlI = lllllllllllllllIIlIlIllIIIIIIlll.toCharArray();
        int lllllllllllllllIIlIlIllIIIIIIIIl = lllllllllllllllIIlIlIllIIIIIIIlI.length;
        int lllllllllllllllIIlIlIllIIIIIIIII = llllIlllIllI[1];
        while (NightmareInfoBox.lIIlIIIlllllllI(lllllllllllllllIIlIlIllIIIIIIIII, lllllllllllllllIIlIlIllIIIIIIIIl)) {
            char lllllllllllllllIIlIlIllIIIIIllIl = lllllllllllllllIIlIlIllIIIIIIIlI[lllllllllllllllIIlIlIllIIIIIIIII];
            lllllllllllllllIIlIlIllIIIIIlIlI.append((char)(lllllllllllllllIIlIlIllIIIIIllIl ^ lllllllllllllllIIlIlIllIIIIIlIIl[lllllllllllllllIIlIlIllIIIIIlIII % lllllllllllllllIIlIlIllIIIIIlIIl.length]));
            0;
            ++lllllllllllllllIIlIlIllIIIIIlIII;
            ++lllllllllllllllIIlIlIllIIIIIIIII;
            0;
            if ((140 + 154 - 216 + 78 ^ 36 + 14 - 36 + 138) > 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIllIIIIIlIlI);
    }

    private static void lIIlIIIlllllIII() {
        llllIlllIIll = new String[llllIlllIllI[21]];
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[1]] = NightmareInfoBox."%.0fK";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[2]] = NightmareInfoBox."%.0fK";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[3]] = NightmareInfoBox."%.1fK";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[4]] = NightmareInfoBox."%.0f";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[5]] = NightmareInfoBox."%.1f";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[7]] = NightmareInfoBox."Squire Phosani's Nightmare";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[8]] = NightmareInfoBox."Runtime";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[9]] = NightmareInfoBox."Version";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[10]] = NightmareInfoBox."3.4.2";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[11]] = NightmareInfoBox."Task: ";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[6]] = NightmareInfoBox."Status: ";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[12]] = NightmareInfoBox."Restocking";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[13]] = NightmareInfoBox."Idle";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[14]] = NightmareInfoBox."Kills";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[15]] = NightmareInfoBox."Kills Per Hour";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[16]] = NightmareInfoBox."Est. GP/H";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[17]] = NightmareInfoBox."Shrooms hit";
        NightmareInfoBox.llllIlllIIll[NightmareInfoBox.llllIlllIllI[18]] = NightmareInfoBox."Deaths";
    }
}

