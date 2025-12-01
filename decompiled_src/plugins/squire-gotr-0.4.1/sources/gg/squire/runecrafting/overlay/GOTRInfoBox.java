package gg.squire.runecrafting.overlay;

import com.google.inject.Inject;
import g.r.r.p000.t.q.i.u.o.e.s.EnumC0002c;
import g.r.r.p000.t.q.i.u.o.e.s.d;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.runecrafting.SquireGOTRConfig;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
/* loaded from: squire-gotr-0.4.1.jar:gg/squire/runecrafting/overlay/GOTRInfoBox.class */
public class GOTRInfoBox extends OverlayPanel {
    private final /* synthetic */ SquireGOTRPlugin aJ;
    private static /* synthetic */ int[] llIIllIlIlII;
    private final /* synthetic */ TaskManager aK;
    private final /* synthetic */ SquireGOTRConfig aL;
    private static /* synthetic */ String[] llIIllIlIIll;

    private static String llllllIlIIIlII(String lllllllllllllllIlIIllIlIIlIllIlI, String lllllllllllllllIlIIllIlIIlIlIlII) {
        String lllllllllllllllIlIIllIlIIlIllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIlIIlIllIII = new StringBuilder();
        char[] lllllllllllllllIlIIllIlIIlIlIlll = lllllllllllllllIlIIllIlIIlIlIlII.toCharArray();
        int lllllllllllllllIlIIllIlIIlIlIllI = llIIllIlIlII[1];
        char[] charArray = lllllllllllllllIlIIllIlIIlIllIlI2.toCharArray();
        int length = charArray.length;
        int i = llIIllIlIlII[1];
        while (llllllIlIIllII(i, length)) {
            char lllllllllllllllIlIIllIlIIlIllIll = charArray[i];
            lllllllllllllllIlIIllIlIIlIllIII.append((char) (lllllllllllllllIlIIllIlIIlIllIll ^ lllllllllllllllIlIIllIlIIlIlIlll[lllllllllllllllIlIIllIlIIlIlIllI % lllllllllllllllIlIIllIlIIlIlIlll.length]));
            "".length();
            lllllllllllllllIlIIllIlIIlIlIllI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIllIlIIlIllIII);
    }

    private static String llllllIlIIIlIl(String lllllllllllllllIlIIllIlIIlIIIlIl, String lllllllllllllllIlIIllIlIIlIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIlIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIlIIlIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIlIIlIIIlll.init(llIIllIlIlII[5], lllllllllllllllIlIIllIlIIlIIlIII);
            return new String(lllllllllllllllIlIIllIlIIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIlIIlIIIllI) {
            lllllllllllllllIlIIllIlIIlIIIllI.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        String str;
        if (llllllIlIIlIIl(this.aJ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(llIIllIlIlII[0], llIIllIlIlII[0], llIIllIlIlII[0], llIIllIlIlII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIIllIlIIll[llIIllIlIlII[1]]).build());
        "".length();
        int lllllllllllllllIlIIllIlIIllIIllI = llIIllIlIlII[2];
        this.panelComponent.setPreferredSize(new Dimension(lllllllllllllllIlIIllIlIIllIIllI + llIIllIlIlII[3], llIIllIlIlII[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[4]]).right(llIIllIlIIll[llIIllIlIlII[5]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[6]]).right(String.valueOf(this.aJ.Q())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[7]]).right(this.aK.getCurrentTask()).build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[8]]);
        String str2 = llIIllIlIIll[llIIllIlIlII[9]];
        Object[] objArr = new Object[llIIllIlIlII[5]];
        objArr[llIIllIlIlII[1]] = Integer.valueOf(this.aJ.p());
        objArr[llIIllIlIlII[4]] = Integer.valueOf(this.aJ.q());
        children.add(left.right(String.format(str2, objArr)).build());
        "".length();
        if (llllllIlIIlIlI(this.aJ.m(), EnumC0002c.ACTIVE)) {
            d h = this.aJ.h();
            List children2 = this.panelComponent.getChildren();
            LineComponent.LineComponentBuilder left2 = LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[10]]);
            if (llllllIlIIlIIl(this.aJ.R() ? 1 : 0)) {
                str = llIIllIlIIll[llIIllIlIlII[11]];
                "".length();
                if ((((90 ^ 85) ^ (62 ^ 46)) & (((113 ^ 87) ^ (181 ^ 140)) ^ (-" ".length()))) < 0) {
                    return null;
                }
            } else {
                str = llIIllIlIIll[llIIllIlIlII[12]];
            }
            children2.add(left2.right(str).build());
            "".length();
            if (llllllIlIIlIll(h)) {
                this.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[0]]).right(h.U() + " runes - " + h.Z()).build());
                "".length();
            }
            List children3 = this.panelComponent.getChildren();
            LineComponent.LineComponentBuilder left3 = LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[13]]);
            String str3 = llIIllIlIIll[llIIllIlIlII[14]];
            Object[] objArr2 = new Object[llIIllIlIlII[5]];
            objArr2[llIIllIlIlII[1]] = Integer.valueOf(this.aJ.H());
            objArr2[llIIllIlIlII[4]] = Integer.valueOf(this.aJ.I());
            children3.add(left3.right(String.format(str3, objArr2)).build());
            "".length();
        }
        List children4 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left4 = LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[15]]);
        String str4 = llIIllIlIIll[llIIllIlIlII[16]];
        Object[] objArr3 = new Object[llIIllIlIlII[5]];
        objArr3[llIIllIlIlII[1]] = Integer.valueOf(this.aJ.F());
        objArr3[llIIllIlIlII[4]] = Integer.valueOf(this.aJ.G());
        children4.add(left4.right(String.format(str4, objArr3)).build());
        "".length();
        return super.render(graphics2D);
    }

    private static void llllllIlIIlIII() {
        llIIllIlIlII = new int[18];
        llIIllIlIlII[0] = 156 ^ 150;
        llIIllIlIlII[1] = (169 ^ 129) & ((25 ^ 49) ^ (-1));
        llIIllIlIlII[2] = (-((-16962) & 31443)) & (-16993) & 31731;
        llIIllIlIlII[3] = 190 ^ 170;
        llIIllIlIlII[4] = " ".length();
        llIIllIlIlII[5] = "  ".length();
        llIIllIlIlII[6] = "   ".length();
        llIIllIlIlII[7] = (50 ^ 122) ^ (232 ^ 164);
        llIIllIlIlII[8] = 129 ^ 132;
        llIIllIlIlII[9] = 94 ^ 88;
        llIIllIlIlII[10] = 177 ^ 182;
        llIIllIlIlII[11] = 92 ^ 84;
        llIIllIlIlII[12] = 45 ^ 36;
        llIIllIlIlII[13] = 42 ^ 33;
        llIIllIlIlII[14] = (131 ^ 133) ^ (61 ^ 55);
        llIIllIlIlII[15] = (98 ^ 24) ^ (121 ^ 14);
        llIIllIlIlII[16] = 152 ^ 150;
        llIIllIlIlII[17] = 152 ^ 151;
    }

    private static String llllllIlIIIllI(String lllllllllllllllIlIIllIlIIIlllIII, String lllllllllllllllIlIIllIlIIIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIIIllIlll.getBytes(StandardCharsets.UTF_8)), llIIllIlIlII[11]), "DES");
            Cipher lllllllllllllllIlIIllIlIIIlllIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIlIIIlllIlI.init(llIIllIlIlII[5], secretKeySpec);
            return new String(lllllllllllllllIlIIllIlIIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIlIIIlllIIl) {
            lllllllllllllllIlIIllIlIIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlIIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllllIlIIllII(int i, int i2) {
        return i < i2;
    }

    @Inject
    private GOTRInfoBox(SquireGOTRPlugin squireGOTRPlugin, SquireGOTRConfig squireGOTRConfig) {
        this.aJ = squireGOTRPlugin;
        this.aK = squireGOTRPlugin.getManager();
        this.aL = squireGOTRConfig;
        setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        setLayer(OverlayLayer.ALWAYS_ON_TOP);
    }

    private static boolean llllllIlIIlIIl(int i) {
        return i != 0;
    }

    private static void llllllIlIIIlll() {
        llIIllIlIIll = new String[llIIllIlIlII[17]];
        llIIllIlIIll[llIIllIlIlII[1]] = llllllIlIIIlII("CzoQIwolLh8iTiMpUSUGKW8jOAg4", "LOqQn");
        llIIllIlIIll[llIIllIlIlII[4]] = llllllIlIIIlII("Jw0bAC4eBg==", "qhisG");
        llIIllIlIIll[llIIllIlIlII[5]] = llllllIlIIIlII("dWFxRmE=", "EOGhS");
        llIIllIlIIll[llIIllIlIlII[6]] = llllllIlIIIlII("GgEaEAo2BRFZPiMJABw=", "Whtym");
        llIIllIlIIll[llIIllIlIlII[7]] = llllllIlIIIlII("MyYFAQIRLh4JCg==", "cCwgm");
        llIIllIlIIll[llIIllIlIlII[8]] = llllllIlIIIlIl("FZjBGCl8W+o=", "hDmQh");
        llIIllIlIIll[llIIllIlIlII[9]] = llllllIlIIIlII("bylrSXhvKQ==", "JMKfX");
        llIIllIlIIll[llIIllIlIlII[10]] = llllllIlIIIlII("KzMbCBYGMkkcHAszGg==", "hFizs");
        llIIllIlIIll[llIIllIlIlII[11]] = llllllIlIIIlII("Hwg0JBU0EDAl", "ZdQIp");
        llIIllIlIIll[llIIllIlIlII[12]] = llllllIlIIIlIl("baz3TUD46Uqx/MO9azfsFA==", "iZxgZ");
        llIIllIlIIll[llIIllIlIlII[0]] = llllllIlIIIllI("0NC73lkRK5NNsuZvofsGPg==", "BKPCj");
        llIIllIlIIll[llIIllIlIlII[13]] = llllllIlIIIlII("DA0nBz0hDHUHPTgZJxF4Pxc8Gyw8", "OxUuX");
        llIIllIlIIll[llIIllIlIlII[14]] = llllllIlIIIlII("ahxtNW5qHA==", "OxMIN");
        llIIllIlIIll[llIIllIlIlII[15]] = llllllIlIIIllI("IfHUx/lXDUjBEnpwd1GZUikw979fdzYo", "vxcZF");
        llIIllIlIIll[llIIllIlIlII[16]] = llllllIlIIIllI("FP/HKaZKPO0=", "jUzIo");
    }

    private static boolean llllllIlIIlIll(Object obj) {
        return obj != null;
    }

    static {
        llllllIlIIlIII();
        llllllIlIIIlll();
    }
}
