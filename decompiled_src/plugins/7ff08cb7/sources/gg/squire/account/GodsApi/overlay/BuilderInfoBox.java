package gg.squire.account.GodsApi.overlay;

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
import p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0004e;
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:gg/squire/account/GodsApi/overlay/BuilderInfoBox.class */
public class BuilderInfoBox extends OverlayPanel {
    private static /* synthetic */ String[] llllIlIll;
    private static /* synthetic */ int[] llllIllII;
    private final /* synthetic */ AccBuilderGWD cf;
    private final /* synthetic */ BuilderConfig cg;

    private static String llIlIIlIIlIl(String lIllIllllllll, String lIllIlllllllI) {
        try {
            SecretKeySpec lIlllIIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIllII[3], lIlllIIIIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIIIIIII) {
            lIlllIIIIIIII.printStackTrace();
            return null;
        }
    }

    private static String llIlIIlIIllI(String lIlllIIIIllII, String lIlllIIIIlIll) {
        try {
            SecretKeySpec lIlllIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIIIlIll.getBytes(StandardCharsets.UTF_8)), llllIllII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIllII[3], lIlllIIIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlllIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIIIllIl) {
            lIlllIIIIllIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIIlll() {
        llllIlIll = new String[llllIllII[9]];
        llllIlIll[llllIllII[1]] = llIlIIlIIlIl("K3cDRuNiT/vQ7+BIsK8X570naNcgoisf", "tWEWf");
        llllIlIll[llllIllII[2]] = llIlIIlIIllI("1Q59sdfw4I8=", "LcTEI");
        llllIlIll[llllIllII[3]] = llIlIIlIIlIl("MgUGTuOFq9U=", "JHnWZ");
        llllIlIll[llllIllII[4]] = llIlIIlIIllI("JwEpZ36qoks=", "kgyvh");
        llllIlIll[llllIllII[5]] = llIlIIlIIlIl("8PplhtR5pheunfWnIQ1x6Q==", "MFdlC");
        llllIlIll[llllIllII[6]] = llIlIIlIIlIl("/dCsQd5W3w/PTHzmYDsHnWpqeyfpUgC/", "htjWx");
    }

    static {
        llIlIIlIlIII();
        llIlIIlIIlll();
    }

    private static void llIlIIlIlIII() {
        llllIllII = new int[11];
        llllIllII[0] = 174 ^ 164;
        llllIllII[1] = (232 ^ 189) & ((112 ^ 37) ^ (-1));
        llllIllII[2] = " ".length();
        llllIllII[3] = "  ".length();
        llllIllII[4] = "   ".length();
        llllIllII[5] = (15 ^ 24) ^ (88 ^ 75);
        llllIllII[6] = 162 ^ 167;
        llllIllII[7] = (-23726) & 23983;
        llllIllII[8] = 32 ^ 52;
        llllIllII[9] = (((48 + 106) - 59) + 32) ^ (69 ^ 60);
        llllIllII[10] = (109 ^ 117) ^ (4 ^ 20);
    }

    public Dimension render(Graphics2D graphics2D) {
        long currentTimeMillis = System.currentTimeMillis() - AccBuilderGWD.b;
        this.panelComponent.setBorder(new Rectangle(llllIllII[0], llllIllII[0], llllIllII[0], llllIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllIlIll[llllIllII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[2]]).right("1." + 4591870180066957722).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[3]]).right(C0004e.b(currentTimeMillis)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[4]]).right(AccBuilderGWD.c).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[5]]).right(String.valueOf(AccBuilderGWD.l)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIll[llllIllII[6]]).right(String.valueOf(AccBuilderGWD.f)).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(llllIllII[7] + llllIllII[8], llllIllII[1]));
        return super.render(graphics2D);
    }

    @Inject
    private BuilderInfoBox(AccBuilderGWD accBuilderGWD, BuilderConfig builderConfig) {
        this.cf = accBuilderGWD;
        this.cg = builderConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}
