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

import com.google.inject.Inject;
import gg.squire.account.AccBuilderSotf;
import gg.squire.account.BuilderConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;

public class BuilderInfoBox
extends OverlayPanel {
    private final /* synthetic */ BuilderConfig ce;
    private static /* synthetic */ String[] llIllIlIll;
    private static /* synthetic */ int[] llIllIllII;
    private final /* synthetic */ AccBuilderSotf cd;

    private static void lIllIlllllllI() {
        llIllIllII = new int[10];
        BuilderInfoBox.llIllIllII[0] = 0x5C ^ 0x56;
        BuilderInfoBox.llIllIllII[1] = (23 + 76 - 65 + 100 ^ 58 + 148 - 136 + 88) & (0x7E ^ 0x37 ^ (0x37 ^ 0x66) ^ -1);
        BuilderInfoBox.llIllIllII[2] = 1;
        BuilderInfoBox.llIllIllII[3] = 2;
        BuilderInfoBox.llIllIllII[4] = 3;
        BuilderInfoBox.llIllIllII[5] = 8 ^ 0xC;
        BuilderInfoBox.llIllIllII[6] = 15 + 24 - -64 + 56 ^ 76 + 127 - 177 + 128;
        BuilderInfoBox.llIllIllII[7] = 0xFFFFED26 & 0x13DB;
        BuilderInfoBox.llIllIllII[8] = 0x24 ^ 0x30;
        BuilderInfoBox.llIllIllII[9] = 0x4D ^ 0x4B;
    }

    static {
        BuilderInfoBox.lIllIlllllllI();
        BuilderInfoBox.lIllIllllllIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        long l2 = System.currentTimeMillis() - AccBuilderSotf.b;
        double d2 = 0.1;
        this.panelComponent.setBorder(new Rectangle(llIllIllII[0], llIllIllII[0], llIllIllII[0], llIllIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIllIlIll[llIllIllII[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[2]]).right("1." + d2).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[3]]).right(e.b(l2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[4]]).right(AccBuilderSotf.c).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[5]]).right(String.valueOf(AccBuilderSotf.l)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIllIlIll[llIllIllII[6]]).right(String.valueOf(AccBuilderSotf.f)).build());
        0;
        int n2 = llIllIllII[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llIllIllII[8], llIllIllII[1]));
        return super.render(graphics2D);
    }

    private static String lIllIlllllIll(String llllllllllllllllllIIIIlllIllIllI, String llllllllllllllllllIIIIlllIllIlll) {
        try {
            SecretKeySpec llllllllllllllllllIIIIlllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIlllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIIlllIlllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIIlllIlllIlI.init(llIllIllII[3], llllllllllllllllllIIIIlllIlllIll);
            return new String(llllllllllllllllllIIIIlllIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIlllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIIlllIlllIIl) {
            llllllllllllllllllIIIIlllIlllIIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIllllllII(String llllllllllllllllllIIIIllllIIlIII, String llllllllllllllllllIIIIllllIIIlll) {
        llllllllllllllllllIIIIllllIIlIII = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIllllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIIllllIIlIll = new StringBuilder();
        char[] llllllllllllllllllIIIIllllIIlIlI = llllllllllllllllllIIIIllllIIIlll.toCharArray();
        int llllllllllllllllllIIIIllllIIlIIl = llIllIllII[1];
        char[] llllllllllllllllllIIIIllllIIIIll = llllllllllllllllllIIIIllllIIlIII.toCharArray();
        int llllllllllllllllllIIIIllllIIIIlI = llllllllllllllllllIIIIllllIIIIll.length;
        int llllllllllllllllllIIIIllllIIIIIl = llIllIllII[1];
        while (BuilderInfoBox.lIllIllllllll(llllllllllllllllllIIIIllllIIIIIl, llllllllllllllllllIIIIllllIIIIlI)) {
            char llllllllllllllllllIIIIllllIIlllI = llllllllllllllllllIIIIllllIIIIll[llllllllllllllllllIIIIllllIIIIIl];
            llllllllllllllllllIIIIllllIIlIll.append((char)(llllllllllllllllllIIIIllllIIlllI ^ llllllllllllllllllIIIIllllIIlIlI[llllllllllllllllllIIIIllllIIlIIl % llllllllllllllllllIIIIllllIIlIlI.length]));
            0;
            ++llllllllllllllllllIIIIllllIIlIIl;
            ++llllllllllllllllllIIIIllllIIIIIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIIllllIIlIll);
    }

    private static void lIllIllllllIl() {
        llIllIlIll = new String[llIllIllII[9]];
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[1]] = BuilderInfoBox."Squire Sotf Builder";
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[2]] = BuilderInfoBox."Version";
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[3]] = BuilderInfoBox."Runtime";
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[4]] = BuilderInfoBox."Status:";
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[5]] = BuilderInfoBox."Current Quest:";
        BuilderInfoBox.llIllIlIll[BuilderInfoBox.llIllIllII[6]] = BuilderInfoBox."Tasks Completed:";
    }

    private static boolean lIllIllllllll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    private BuilderInfoBox(AccBuilderSotf accBuilderSotf, BuilderConfig builderConfig) {
        this.cd = accBuilderSotf;
        this.ce = builderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

