package gg.squire.zammy.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.zammy.SquireZammy;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.p000.q.s.y.u.B;
import m.e.a.i.z.m.r.p000.q.s.y.u.k;
import m.e.a.i.z.m.r.p000.q.s.y.u.l;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.client.Static;
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:gg/squire/zammy/overlay/ZammyInfoBox.class */
public class ZammyInfoBox extends OverlayPanel {
    private final /* synthetic */ B G;
    private final /* synthetic */ k E;
    private final /* synthetic */ TaskManager F;
    private final /* synthetic */ SquireZammy C;
    private static /* synthetic */ int[] lIllIIlIllIll;
    private final /* synthetic */ l D;
    private static /* synthetic */ String[] lIllIIlIllIII;

    static {
        llIIIllIIlIIlll();
        llIIIllIIlIIllI();
    }

    private static boolean llIIIllIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static void llIIIllIIlIIllI() {
        lIllIIlIllIII = new String[lIllIIlIllIll[7]];
        lIllIIlIllIII[lIllIIlIllIll[1]] = llIIIllIIIllIlI("/RuvcbU5MdibknppHxoDAg==", "TzeBv");
        lIllIIlIllIII[lIllIIlIllIll[2]] = llIIIllIIIllIll("PDQ/CnAWKj8QNQ==", "wFVfP");
        lIllIIlIllIII[lIllIIlIllIll[3]] = llIIIllIIIllIlI("q5DmfjRix6RwEGRa8YJ+HQ==", "Zhiyo");
        lIllIIlIllIII[lIllIIlIllIll[4]] = llIIIllIIIllIlI("XBNJ1n+7m2f88SXz/2Y8Gw==", "KCfPT");
        lIllIIlIllIII[lIllIIlIllIll[5]] = llIIIllIIIllIll("Kyw/IQQGbTMuGA1tNDcbAT80PEsBI2s=", "hMQOk");
        lIllIIlIllIII[lIllIIlIllIll[6]] = llIIIllIIIllIlI("O+YTpY+IXsUwxWQqn5HUjw==", "QBIoi");
    }

    private static String llIIIllIIIllIlI(String llllllllllllllIllIIlIIllIIlIIIll, String llllllllllllllIllIIlIIllIIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIllIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIlIllIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIllIIlIIlII) {
            llllllllllllllIllIIlIIllIIlIIlII.printStackTrace();
            return null;
        }
    }

    private static String llIIIllIIIllIll(String llllllllllllllIllIIlIIllIIlllIII, String llllllllllllllIllIIlIIllIIllIlll) {
        String llllllllllllllIllIIlIIllIIlllIII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIllIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIlIIllIIllIlll.toCharArray();
        int llllllllllllllIllIIlIIllIIllIlII = lIllIIlIllIll[1];
        char[] charArray2 = llllllllllllllIllIIlIIllIIlllIII2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIllIIlIIllIIlIllII = lIllIIlIllIll[1];
        while (llIIIllIIlIlIIl(llllllllllllllIllIIlIIllIIlIllII, length)) {
            char llllllllllllllIllIIlIIllIIlllIIl = charArray2[llllllllllllllIllIIlIIllIIlIllII];
            sb.append((char) (llllllllllllllIllIIlIIllIIlllIIl ^ charArray[llllllllllllllIllIIlIIllIIllIlII % charArray.length]));
            "".length();
            llllllllllllllIllIIlIIllIIllIlII++;
            llllllllllllllIllIIlIIllIIlIllII++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public ZammyInfoBox(SquireZammy squireZammy, l lVar, k kVar, B b) {
        this.C = squireZammy;
        this.D = lVar;
        this.E = kVar;
        this.F = squireZammy.getManager();
        this.G = b;
        setPosition(OverlayPosition.TOP_LEFT);
        setPriority(OverlayPriority.LOW);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llIIIllIIlIlIII(this.C.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIllIIlIllIll[0], lIllIIlIllIll[0], lIllIIlIllIll[0], lIllIIlIllIll[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIlIllIII[lIllIIlIllIll[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[2]]).right(String.valueOf(this.D.A())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[3]]).right(String.valueOf(this.D.B())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[4]]).right(String.valueOf(this.D.J())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[5]]).right(String.valueOf(Math.max(lIllIIlIllIll[1], this.G.Q() - Static.getClient().getTickCount()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIlIllIII[lIllIIlIllIll[6]]).right(this.F.getCurrentTask()).build());
        "".length();
        return super.render(graphics2D);
    }

    private static boolean llIIIllIIlIlIII(int i) {
        return i != 0;
    }

    private static void llIIIllIIlIIlll() {
        lIllIIlIllIll = new int[8];
        lIllIIlIllIll[0] = (((82 + 180) - 247) + 170) ^ (((5 + 67) - 32) + 139);
        lIllIIlIllIll[1] = ((212 ^ 160) ^ (245 ^ 156)) & (((118 ^ 34) ^ (5 ^ 76)) ^ (-" ".length()));
        lIllIIlIllIll[2] = " ".length();
        lIllIIlIllIll[3] = "  ".length();
        lIllIIlIllIll[4] = "   ".length();
        lIllIIlIllIll[5] = (((50 + 66) - (-82)) + 0) ^ (((109 + 100) - 202) + 187);
        lIllIIlIllIll[6] = (((74 + 68) - 84) + 136) ^ (((156 + 170) - 183) + 56);
        lIllIIlIllIll[7] = (((84 + 1) - 39) + 96) ^ (((135 + 29) - 61) + 33);
    }
}
