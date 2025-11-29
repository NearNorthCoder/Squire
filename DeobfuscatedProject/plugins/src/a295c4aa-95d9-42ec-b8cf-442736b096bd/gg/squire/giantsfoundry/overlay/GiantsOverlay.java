/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Point
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.giantsfoundry.overlay;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.h;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Point;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class GiantsOverlay
extends OverlayPanel {
    private final /* synthetic */ a Z;
    private final /* synthetic */ SquireGiantsFoundry Y;
    private static /* synthetic */ String[] llIlIlllIlIl;
    private static /* synthetic */ int[] llIlIllllllI;

    private static boolean lIIIIlIIIIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIlIIIIllIII(Object object) {
        return object == null;
    }

    private static String lIIIIIlllllllII(String lllllllllllllllIlIIIIIIllIlIllII, String lllllllllllllllIlIIIIIIllIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIIllIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIIllIlIllIl.getBytes(StandardCharsets.UTF_8)), llIlIllllllI[9]), "DES");
            Cipher lllllllllllllllIlIIIIIIllIllIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIIIllIllIIII.init(llIlIllllllI[2], lllllllllllllllIlIIIIIIllIllIIIl);
            return new String(lllllllllllllllIlIIIIIIllIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIllIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIIIllIlIllll) {
            lllllllllllllllIlIIIIIIllIlIllll.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        Object object;
        GiantsOverlay lllllllllllllllIlIIIIIIlllIIlIlI;
        if (GiantsOverlay.lIIIIlIIIIlIlll(this.Y.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        lllllllllllllllIlIIIIIIlllIIlIlI.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIlIlllIlIl[llIlIllllllI[0]]).build());
        "".length();
        Duration lllllllllllllllIlIIIIIIlllIIlIII = Duration.between(lllllllllllllllIlIIIIIIlllIIlIlI.Y.getStarted(), Instant.now());
        lllllllllllllllIlIIIIIIlllIIlIlI.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[1]]).right(Time.format((Duration)lllllllllllllllIlIIIIIIlllIIlIII)).build());
        "".length();
        List list = lllllllllllllllIlIIIIIIlllIIlIlI.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[2]]);
        if (GiantsOverlay.lIIIIlIIIIllIII((Object)lllllllllllllllIlIIIIIIlllIIlIlI.Z.k())) {
            object = llIlIlllIlIl[llIlIllllllI[3]];
            "".length();
            if (((0xD2 ^ 0x9B) & ~(0x52 ^ 0x1B)) > (0x91 ^ 0x95)) {
                return null;
            }
        } else {
            object = lllllllllllllllIlIIIIIIlllIIlIlI.Z.k();
        }
        list.add(lineComponentBuilder.right(String.valueOf(object)).build());
        "".length();
        lllllllllllllllIlIIIIIIlllIIlIlI.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[4]]).right(String.valueOf(lllllllllllllllIlIIIIIIlllIIlIlI.Y.getManager().getCurrentTask())).build());
        "".length();
        if (GiantsOverlay.lIIIIlIIIIllIIl(lllllllllllllllIlIIIIIIlllIIlIlI.Z.l(), llIlIllllllI[5])) {
            String string;
            lllllllllllllllIlIIIIIIlllIIlIlI.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[6]]).right(String.valueOf(lllllllllllllllIlIIIIIIlllIIlIlI.Z.l())).build());
            "".length();
            List list2 = lllllllllllllllIlIIIIIIlllIIlIlI.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder2 = LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[7]]);
            if (GiantsOverlay.lIIIIlIIIIlIlll(lllllllllllllllIlIIIIIIlllIIlIlI.Z.n() ? 1 : 0)) {
                string = llIlIlllIlIl[llIlIllllllI[8]];
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            } else {
                string = llIlIlllIlIl[llIlIllllllI[9]];
            }
            list2.add(lineComponentBuilder2.right(string).build());
            "".length();
            lllllllllllllllIlIIIIIIlllIIlIlI.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[10]]).right(String.valueOf(lllllllllllllllIlIIIIIIlllIIlIlI.Z.m())).build());
            "".length();
            Map<h, Point> lllllllllllllllIlIIIIIIlllIIIlll = lllllllllllllllIlIIIIIIlllIIlIlI.Z.o();
            h[] lllllllllllllllIlIIIIIIlllIIIllI = h.values();
            int lllllllllllllllIlIIIIIIlllIIIlIl = lllllllllllllllIlIIIIIIlllIIIllI.length;
            int lllllllllllllllIlIIIIIIlllIIIlII = llIlIllllllI[0];
            while (GiantsOverlay.lIIIIlIIIIllIlI(lllllllllllllllIlIIIIIIlllIIIlII, lllllllllllllllIlIIIIIIlllIIIlIl)) {
                h lllllllllllllllIlIIIIIIlllIIIIll = lllllllllllllllIlIIIIIIlllIIIllI[lllllllllllllllIlIIIIIIlllIIIlII];
                Object[] objectArray = new Object[llIlIllllllI[1]];
                objectArray[GiantsOverlay.llIlIllllllI[0]] = lllllllllllllllIlIIIIIIlllIIIIll;
                Object[] objectArray2 = new Object[llIlIllllllI[2]];
                objectArray2[GiantsOverlay.llIlIllllllI[0]] = lllllllllllllllIlIIIIIIlllIIIlll.get((Object)lllllllllllllllIlIIIIIIlllIIIIll).getX();
                objectArray2[GiantsOverlay.llIlIllllllI[1]] = lllllllllllllllIlIIIIIIlllIIIlll.get((Object)lllllllllllllllIlIIIIIIlllIIIIll).getY();
                lllllllllllllllIlIIIIIIlllIIlIlI.panelComponent.getChildren().add(LineComponent.builder().left(String.format(llIlIlllIlIl[llIlIllllllI[11]], objectArray)).right(String.format(llIlIlllIlIl[llIlIllllllI[12]], objectArray2)).build());
                "".length();
                ++lllllllllllllllIlIIIIIIlllIIIlII;
                "".length();
                if (null == null) continue;
                return null;
            }
        }
        int n2 = llIlIllllllI[13];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llIlIllllllI[14], llIlIllllllI[0]));
        return super.render(graphics2D);
    }

    private static void lIIIIIlllllllll() {
        llIlIlllIlIl = new String[llIlIllllllI[15]];
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[0]] = GiantsOverlay.lIIIIIlllllllII("rqrLLZ1oSzZMIeDh6Cn2AEMr4DWVx2NC", "GyxId");
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[1]] = GiantsOverlay.lIIIIIlllllllIl("fcl27YN2ei4=", "auYaI");
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[2]] = GiantsOverlay.lIIIIIlllllllII("0yBSbgKZQqr3mQe6HkuH8AwtJssQWqPC", "MLVEl");
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[3]] = GiantsOverlay.lIIIIIllllllllI("CRwMDw==", "Gsbjv");
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[4]] = GiantsOverlay.lIIIIIlllllllII("0c0J0UPjwJMCw4dLHFrW/J7zXLQhmB3F", "OuATD");
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[6]] = GiantsOverlay.lIIIIIlllllllIl("jNqPwZp3qKeWq4aZEk8UGunTQRJvIGmm", "speDn");
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[7]] = GiantsOverlay.lIIIIIlllllllIl("Mi8/1SYufFd4zG5CBs5gRSv+mhRBKX9x", "eSpEN");
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[8]] = GiantsOverlay.lIIIIIlllllllIl("upBvMD3JzPE=", "GcNiK");
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[9]] = GiantsOverlay.lIIIIIllllllllI("DAc=", "BheJo");
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[10]] = GiantsOverlay.lIIIIIlllllllIl("n/LKqkWUmEdIWiXoGwiZ0jKN1wKddoOL", "TDCVv");
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[11]] = GiantsOverlay.lIIIIIlllllllIl("vV5ShduTF7EP6AzXYJzU7Q==", "fsYfa");
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[12]] = GiantsOverlay.lIIIIIllllllllI("fyFyW2d/IQ==", "ZERvG");
    }

    @Inject
    public GiantsOverlay(SquireGiantsFoundry squireGiantsFoundry, a a2) {
        this.Y = squireGiantsFoundry;
        this.Z = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIIIIllllllllI(String lllllllllllllllIlIIIIIIllIIllllI, String lllllllllllllllIlIIIIIIllIIllIII) {
        lllllllllllllllIlIIIIIIllIIllllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIllIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIIIllIIlllII = new StringBuilder();
        char[] lllllllllllllllIlIIIIIIllIIllIll = lllllllllllllllIlIIIIIIllIIllIII.toCharArray();
        int lllllllllllllllIlIIIIIIllIIllIlI = llIlIllllllI[0];
        char[] lllllllllllllllIlIIIIIIllIIlIlII = lllllllllllllllIlIIIIIIllIIllllI.toCharArray();
        int lllllllllllllllIlIIIIIIllIIlIIll = lllllllllllllllIlIIIIIIllIIlIlII.length;
        int lllllllllllllllIlIIIIIIllIIlIIlI = llIlIllllllI[0];
        while (GiantsOverlay.lIIIIlIIIIllIlI(lllllllllllllllIlIIIIIIllIIlIIlI, lllllllllllllllIlIIIIIIllIIlIIll)) {
            char lllllllllllllllIlIIIIIIllIIlllll = lllllllllllllllIlIIIIIIllIIlIlII[lllllllllllllllIlIIIIIIllIIlIIlI];
            lllllllllllllllIlIIIIIIllIIlllII.append((char)(lllllllllllllllIlIIIIIIllIIlllll ^ lllllllllllllllIlIIIIIIllIIllIll[lllllllllllllllIlIIIIIIllIIllIlI % lllllllllllllllIlIIIIIIllIIllIll.length]));
            "".length();
            ++lllllllllllllllIlIIIIIIllIIllIlI;
            ++lllllllllllllllIlIIIIIIllIIlIIlI;
            "".length();
            if ((177 + 157 - 224 + 72 ^ 131 + 157 - 189 + 79) > "  ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIIIIllIIlllII);
    }

    private static String lIIIIIlllllllIl(String lllllllllllllllIlIIIIIIllIlllIll, String lllllllllllllllIlIIIIIIllIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIIllIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIIllIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIIIllIllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIIllIllllIl.init(llIlIllllllI[2], lllllllllllllllIlIIIIIIllIlllllI);
            return new String(lllllllllllllllIlIIIIIIllIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIIIllIllllII) {
            lllllllllllllllIlIIIIIIllIllllII.printStackTrace();
            return null;
        }
    }

    static {
        GiantsOverlay.lIIIIlIIIIlIllI();
        GiantsOverlay.lIIIIIlllllllll();
    }

    private static boolean lIIIIlIIIIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIlIIIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIlIIIIlIllI() {
        llIlIllllllI = new int[16];
        GiantsOverlay.llIlIllllllI[0] = (0x7C ^ 0x4C) & ~(0x4B ^ 0x7B);
        GiantsOverlay.llIlIllllllI[1] = " ".length();
        GiantsOverlay.llIlIllllllI[2] = "  ".length();
        GiantsOverlay.llIlIllllllI[3] = "   ".length();
        GiantsOverlay.llIlIllllllI[4] = 61 + 64 - -2 + 1 ^ 56 + 95 - 61 + 42;
        GiantsOverlay.llIlIllllllI[5] = -" ".length();
        GiantsOverlay.llIlIllllllI[6] = 0x3A ^ 0x3D ^ "  ".length();
        GiantsOverlay.llIlIllllllI[7] = 0x19 ^ 0x1F;
        GiantsOverlay.llIlIllllllI[8] = 0x7D ^ 0x7A;
        GiantsOverlay.llIlIllllllI[9] = 0x17 ^ 0x6D ^ (0xF8 ^ 0x8A);
        GiantsOverlay.llIlIllllllI[10] = 0xB9 ^ 0xB0;
        GiantsOverlay.llIlIllllllI[11] = 0x99 ^ 0x93;
        GiantsOverlay.llIlIllllllI[12] = 0x2C ^ 0x27;
        GiantsOverlay.llIlIllllllI[13] = -(0xFFFFCDB7 & 0x7EFD) & (0xFFFFDDB7 & 0x6FFE);
        GiantsOverlay.llIlIllllllI[14] = 28 + 68 - 60 + 122 ^ 109 + 61 - 89 + 57;
        GiantsOverlay.llIlIllllllI[15] = 0xBD ^ 0xB1;
    }
}

