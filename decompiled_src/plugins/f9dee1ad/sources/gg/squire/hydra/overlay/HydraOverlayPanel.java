package gg.squire.hydra.overlay;

import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.client.Static;
import u.i.r.d.s.e.r.q.y.a.h.p000.C0000a;
import u.i.r.d.s.e.r.q.y.a.h.p000.e;
import u.i.r.d.s.e.r.q.y.a.h.p000.h;
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:gg/squire/hydra/overlay/HydraOverlayPanel.class */
public class HydraOverlayPanel extends OverlayPanel {
    private final /* synthetic */ SquireAlchemicalHydraPlugin am;
    private final /* synthetic */ e al;
    private static /* synthetic */ String[] llllIlIIIllI;
    private static /* synthetic */ int[] llllIlIlIIIl;
    private final /* synthetic */ SquireAlchemicalHydraConfig an;
    private final /* synthetic */ C0000a ak;

    private static String lIIlIIIIlIIIlII(String lllllllllllllllIIlIlIIIllllllIIl, String lllllllllllllllIIlIlIIIllllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIllllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIlIIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIIllllllIlI) {
            lllllllllllllllIIlIlIIIllllllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIllIIlll() {
        llllIlIIIllI = new String[llllIlIlIIIl[22]];
        llllIlIIIllI[llllIlIlIIIl[2]] = lIIlIIIIlIIIlII("wkHonZxQcZQE0VJbegbMrA==", "aDykG");
        llllIlIIIllI[llllIlIlIIIl[3]] = lIIlIIIIllIIlIl("4lsXgHtI8N4DyGhI1zaoPQ==", "pIFkF");
        llllIlIIIllI[llllIlIlIIIl[4]] = lIIlIIIIllIIlIl("rW2UNshWziI=", "qPPAj");
        llllIlIIIllI[llllIlIlIIIl[5]] = lIIlIIIIllIIllI("CC4HITAjYhwqMiRiCywkITY=", "OBhCQ");
        llllIlIIIllI[llllIlIlIIIl[6]] = lIIlIIIIllIIllI("CBczIARsBjs3Bw==", "LrRTl");
        llllIlIIIllI[llllIlIlIIIl[7]] = lIIlIIIIlIIIlII("5f/1/rOMOP7jEiyG5MwSjyfq5KCinDvv", "MirYm");
        llllIlIIIllI[llllIlIlIIIl[8]] = lIIlIIIIllIIlIl("XFCoJ3l5OVRB5qQSJfm7cQ==", "gJhAr");
        llllIlIIIllI[llllIlIlIIIl[9]] = lIIlIIIIlIIIlII("0LoGXGCQhMmcAy8K53r7Jw==", "kGpZq");
        llllIlIIIllI[llllIlIlIIIl[10]] = lIIlIIIIllIIlIl("jw+O5pqa37oqFdnc9JHgCQ==", "oYVeF");
        llllIlIIIllI[llllIlIlIIIl[11]] = lIIlIIIIllIIllI("Lz0qAipHBToEKgQvbjMkEio6", "gDNpK");
        llllIlIIIllI[llllIlIlIIIl[12]] = lIIlIIIIlIIIlII("b7TLaWMZjktcYCoPDlnfkg==", "Sbnxq");
        llllIlIIIllI[llllIlIlIIIl[13]] = lIIlIIIIllIIllI("PDAJICNUHQwgJRE9", "tImRB");
        llllIlIIIllI[llllIlIlIIIl[14]] = lIIlIIIIllIIllI("HQYsJzg9Dg==", "SiXOQ");
        llllIlIIIllI[llllIlIlIIIl[15]] = lIIlIIIIllIIlIl("VYGkvcRFDgo=", "SftQa");
        llllIlIIIllI[llllIlIlIIIl[16]] = lIIlIIIIllIIllI("MTAlNStZBC4xIxcu", "yIAGJ");
        llllIlIIIllI[llllIlIlIIIl[17]] = lIIlIIIIllIIlIl("EKdDhDRdtgc=", "nxRni");
        llllIlIIIllI[llllIlIlIIIl[18]] = lIIlIIIIllIIlIl("Gt+5SFVWYB0=", "sbTbv");
        llllIlIIIllI[llllIlIlIIIl[19]] = lIIlIIIIllIIlIl("fcRn9cudyM8=", "CcJAd");
        llllIlIIIllI[llllIlIlIIIl[20]] = lIIlIIIIlIIIlII("XDYG69g0oTM=", "SsWap");
        llllIlIIIllI[llllIlIlIIIl[21]] = lIIlIIIIllIIllI("GgM=", "TlWiY");
    }

    @Inject
    public HydraOverlayPanel(SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.am = squireAlchemicalHydraPlugin;
        this.an = squireAlchemicalHydraConfig;
        setPosition(OverlayPosition.TOP_LEFT);
        this.ak = squireAlchemicalHydraPlugin.a();
        this.al = squireAlchemicalHydraPlugin.b();
    }

    private static boolean lIIlIIIIllIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIIIIllIllII(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIIIllIlllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIIIllIIlIl(String lllllllllllllllIIlIlIIlIIIIllllI, String lllllllllllllllIIlIlIIlIIIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIlIIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIIIIlllIl.getBytes(StandardCharsets.UTF_8)), llllIlIlIIIl[10]), "DES");
            Cipher lllllllllllllllIIlIlIIlIIIlIIIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIlIIIlIIIII.init(llllIlIlIIIl[4], lllllllllllllllIIlIlIIlIIIlIIIIl);
            return new String(lllllllllllllllIIlIlIIlIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIlIIIIlllll) {
            lllllllllllllllIIlIlIIlIIIIlllll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIIllIIllI(String lllllllllllllllIIlIlIIlIIIIIlllI, String lllllllllllllllIIlIlIIlIIIIIllIl) {
        String lllllllllllllllIIlIlIIlIIIIIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlIIlIIIIIllIl.toCharArray();
        int lllllllllllllllIIlIlIIlIIIIIlIlI = llllIlIlIIIl[2];
        char[] charArray2 = lllllllllllllllIIlIlIIlIIIIIlllI2.toCharArray();
        int length = charArray2.length;
        int i = llllIlIlIIIl[2];
        while (lIIlIIIIllIlllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIlIIlIIIIIlIlI % charArray.length]));
            "".length();
            lllllllllllllllIIlIlIIlIIIIIlIlI++;
            i++;
            "".length();
            if ((((((105 + 175) - 137) + 56) ^ (((26 + 27) - (-85)) + 9)) & (((49 ^ 91) ^ (84 ^ 106)) ^ (-" ".length()))) != (((244 ^ 191) ^ (110 ^ 16)) & (((99 ^ 34) ^ (61 ^ 73)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIIIllIllIl(int i, int i2) {
        return i == i2;
    }

    static {
        lIIlIIIIllIlIII();
        lIIlIIIIllIIlll();
    }

    public Dimension render(Graphics2D graphics2D) {
        String format;
        String str;
        String str2;
        String str3;
        if (lIIlIIIIllIlIIl(this.am.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        int i = llllIlIlIIIl[0];
        this.panelComponent.setPreferredSize(new Dimension(llllIlIlIIIl[1], llllIlIlIIIl[2]));
        this.panelComponent.getChildren().add(TitleComponent.builder().text(llllIlIIIllI[llllIlIlIIIl[2]]).color(ColorScheme.BRAND_ORANGE).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[3]]).right(String.valueOf(this.am.getManager().getCurrentTask())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[4]]).right(String.valueOf(this.ak.o())).build());
        "".length();
        if (lIIlIIIIllIlIlI(this.ak.g() ? 1 : 0)) {
            return super.render(graphics2D);
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[5]]).right(String.valueOf(Static.getClient().getTickCount())).build());
        "".length();
        h k = this.ak.k();
        if (!lIIlIIIIllIlIll(k) || lIIlIIIIllIllII(k.K())) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[6]]).right(String.valueOf(this.ak.n())).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[7]]).right(String.valueOf(this.ak.e())).build());
            "".length();
            return super.render(graphics2D);
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[8]]).right(String.valueOf(k.S())).build());
        "".length();
        if (lIIlIIIIllIllIl(k.O(), Static.getClient().getTickCount())) {
            String str4 = llllIlIIIllI[llllIlIlIIIl[9]];
            Object[] objArr = new Object[llllIlIlIIIl[3]];
            objArr[llllIlIlIIIl[2]] = k.S();
            format = String.format(str4, objArr);
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        } else {
            format = String.format(String.valueOf(k.L()), new Object[llllIlIlIIIl[2]]);
        }
        String lllllllllllllllIIlIlIIlIIIlIIlll = format;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[10]]).right(lllllllllllllllIIlIlIIlIIIlIIlll).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[11]]).right(String.valueOf(k.N())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[12]]).right(String.valueOf(k.Q())).build());
        "".length();
        Actor interacting = k.K().getInteracting();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[13]]);
        if (lIIlIIIIllIllII(interacting)) {
            str = llllIlIIIllI[llllIlIlIIIl[14]];
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        } else {
            str = llllIlIIIllI[llllIlIlIIIl[15]];
        }
        children.add(left.right(str).build());
        "".length();
        List children2 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left2 = LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[16]]);
        if (lIIlIIIIllIlIIl(k.K().isMoving() ? 1 : 0)) {
            str2 = llllIlIIIllI[llllIlIlIIIl[17]];
            "".length();
            if (" ".length() == (91 ^ 95)) {
                return null;
            }
        } else {
            str2 = llllIlIIIllI[llllIlIlIIIl[18]];
        }
        children2.add(left2.right(str2).build());
        "".length();
        List children3 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left3 = LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[19]]);
        if (lIIlIIIIllIlIIl(k.B() ? 1 : 0)) {
            str3 = llllIlIIIllI[llllIlIlIIIl[20]];
            "".length();
            if ((" ".length() & (" ".length() ^ (-1))) == "  ".length()) {
                return null;
            }
        } else {
            str3 = llllIlIIIllI[llllIlIlIIIl[21]];
        }
        children3.add(left3.right(str3).build());
        "".length();
        return super.render(graphics2D);
    }

    private static void lIIlIIIIllIlIII() {
        llllIlIlIIIl = new int[23];
        llllIlIlIIIl[0] = ((13 + 129) - 116) + 167;
        llllIlIlIIIl[1] = (((99 ^ 117) + (211 ^ 144)) - (106 ^ 100)) + ((108 + 43) - 28) + 15;
        llllIlIlIIIl[2] = ((1 ^ 4) ^ (80 ^ 22)) & (((2 ^ 25) ^ (86 ^ 14)) ^ (-" ".length()));
        llllIlIlIIIl[3] = " ".length();
        llllIlIlIIIl[4] = "  ".length();
        llllIlIlIIIl[5] = "   ".length();
        llllIlIlIIIl[6] = 65 ^ 69;
        llllIlIlIIIl[7] = 110 ^ 107;
        llllIlIlIIIl[8] = 55 ^ 49;
        llllIlIlIIIl[9] = (((103 + 81) - 150) + 127) ^ (((68 + 98) - 28) + 28);
        llllIlIlIIIl[10] = 174 ^ 166;
        llllIlIlIIIl[11] = 51 ^ 58;
        llllIlIlIIIl[12] = (((123 + 45) - 62) + 54) ^ (((16 + 165) - 45) + 34);
        llllIlIlIIIl[13] = 70 ^ 77;
        llllIlIlIIIl[14] = (197 ^ 189) ^ (255 ^ 139);
        llllIlIlIIIl[15] = 39 ^ 42;
        llllIlIlIIIl[16] = (((99 + 137) - 86) + 40) ^ (((124 + 73) - 68) + 47);
        llllIlIlIIIl[17] = (((148 + 125) - 91) + 7) ^ (((135 + 89) - 94) + 48);
        llllIlIlIIIl[18] = 175 ^ 191;
        llllIlIlIIIl[19] = 161 ^ 176;
        llllIlIlIIIl[20] = 149 ^ 135;
        llllIlIlIIIl[21] = (129 ^ 193) ^ (10 ^ 89);
        llllIlIlIIIl[22] = 178 ^ 166;
    }

    private static boolean lIIlIIIIllIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIIIllIlIlI(int i) {
        return i == 0;
    }
}
