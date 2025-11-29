/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.account.GodsApi.overlay;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import com.google.inject.Inject;
import gg.squire.account.AccBuilderGWD;
import gg.squire.account.BuilderConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class BuilderInfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] llllIlIll;
    private static /* synthetic */ int[] llllIllII;
    private final /* synthetic */ AccBuilderGWD cf;
    private final /* synthetic */ BuilderConfig cg;

    private static String llIlIIlIIlIl(String lIllIllllllll, String lIllIlllllllI) {
        try {
            SecretKeySpec lIlllIIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIIIIIIIl = Cipher.getInstance("Blowfish");
            lIlllIIIIIIIl.init(llllIllII[3], lIlllIIIIIIlI);
            return new String(lIlllIIIIIIIl.doFinal(Base64.getDecoder().decode(lIllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIIIIIII) {
            lIlllIIIIIIII.printStackTrace();
            return null;
        }
    }

    private static String llIlIIlIIllI(String lIlllIIIIlIlI, String lIlllIIIIlIIl) {
        try {
            SecretKeySpec lIlllIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), llllIllII[10]), "DES");
            Cipher lIlllIIIIlllI = Cipher.getInstance("DES");
            lIlllIIIIlllI.init(llllIllII[3], lIlllIIIIllll);
            return new String(lIlllIIIIlllI.doFinal(Base64.getDecoder().decode(lIlllIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIIIllIl) {
            lIlllIIIIllIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIIlll() {
        llllIlIll = new String[llllIllII[9]];
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[1]] = BuilderInfoBox.llIlIIlIIlIl("K3cDRuNiT/vQ7+BIsK8X570naNcgoisf", "tWEWf");
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[2]] = BuilderInfoBox.llIlIIlIIllI("1Q59sdfw4I8=", "LcTEI");
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[3]] = BuilderInfoBox.llIlIIlIIlIl("MgUGTuOFq9U=", "JHnWZ");
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[4]] = BuilderInfoBox.llIlIIlIIllI("JwEpZ36qoks=", "kgyvh");
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[5]] = BuilderInfoBox.llIlIIlIIlIl("8PplhtR5pheunfWnIQ1x6Q==", "MFdlC");
        BuilderInfoBox.llllIlIll[BuilderInfoBox.llllIllII[6]] = BuilderInfoBox.llIlIIlIIlIl("/dCsQd5W3w/PTHzmYDsHnWpqeyfpUgC/", "htjWx");
    }

    static {
        BuilderInfoBox.llIlIIlIlIII();
        BuilderInfoBox.llIlIIlIIlll();
    }

    private static void llIlIIlIlIII() {
        llllIllII = new int[11];
        BuilderInfoBox.llllIllII[0] = 0xAE ^ 0xA4;
        BuilderInfoBox.llllIllII[1] = (0xE8 ^ 0xBD) & ~(0x70 ^ 0x25);
        BuilderInfoBox.llllIllII[2] = " ".length();
        BuilderInfoBox.llllIllII[3] = "  ".length();
        BuilderInfoBox.llllIllII[4] = "   ".length();
        BuilderInfoBox.llllIllII[5] = 0xF ^ 0x18 ^ (0x58 ^ 0x4B);
        BuilderInfoBox.llllIllII[6] = 0xA2 ^ 0xA7;
        BuilderInfoBox.llllIllII[7] = 0xFFFFA352 & 0x5DAF;
        BuilderInfoBox.llllIllII[8] = 0x20 ^ 0x34;
        BuilderInfoBox.llllIllII[9] = 48 + 106 - 59 + 32 ^ (0x45 ^ 0x3C);
        BuilderInfoBox.llllIllII[10] = 0x6D ^ 0x75 ^ (4 ^ 0x14);
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderGWD.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(llllIllII[0], llllIllII[0], llllIllII[0], llllIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllIlIll[llllIllII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[2]]).right("1." + d2).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[3]]).right(e.b(l2)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[4]]).right(AccBuilderGWD.c).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[5]]).right(String.valueOf(AccBuilderGWD.l)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[6]]).right(String.valueOf(AccBuilderGWD.f)).build());
        "".length();
        int n2 = llllIllII[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llllIllII[8], llllIllII[1]));
        return super.render(graphics2D);
    }

    @Inject
    private BuilderInfoBox(AccBuilderGWD accBuilderGWD, BuilderConfig builderConfig) {
        this.cf = accBuilderGWD;
        this.cg = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

