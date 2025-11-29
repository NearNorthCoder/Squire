package gg.squire.templeTrekking.overlay;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.b;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.d;
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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:gg/squire/templeTrekking/overlay/TempleTrekkingInfoBox.class */
public class TempleTrekkingInfoBox extends OverlayPanel {
    private final /* synthetic */ b C;
    private final /* synthetic */ TaskManager A;
    private final /* synthetic */ TempleTrekkingPlugin z;
    private static /* synthetic */ String[] lIIllIlIlllIl;
    private static /* synthetic */ int[] lIIllIlIllllI;
    private final /* synthetic */ TempleTrekkingConfig B;

    @Inject
    private TempleTrekkingInfoBox(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b bVar) {
        this.z = templeTrekkingPlugin;
        this.A = templeTrekkingPlugin.getManager();
        this.B = templeTrekkingConfig;
        this.C = bVar;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIIIIllllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIllIIIIlllIllI(String llllllllllllllIlllIlllIlllIlllll, String llllllllllllllIlllIlllIlllIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIlIllllI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIllllIIIII) {
            llllllllllllllIlllIlllIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlllllII(int i) {
        return i == 0;
    }

    private static void lIllIIIIllllIII() {
        lIIllIlIlllIl = new String[lIIllIlIllllI[12]];
        lIIllIlIlllIl[lIIllIlIllllI[1]] = lIllIIIIlllIllI("+ChCD7VxGOrm4puHA10WcRaxcqH/UpFI", "UNsAq");
        lIIllIlIlllIl[lIIllIlIllllI[4]] = lIllIIIIlllIllI("+hCCl3iYz8NkseUfKgMENg==", "eWAhU");
        lIIllIlIlllIl[lIIllIlIllllI[5]] = lIllIIIIlllIllI("fj8Mj9T+Se0=", "spObN");
        lIIllIlIlllIl[lIIllIlIllllI[6]] = lIllIIIIlllIlll("aQZDYH8oTQth", "LbcHZ");
        lIIllIlIlllIl[lIIllIlIllllI[8]] = lIllIIIIlllIlll("AA0AAm8MMldH", "TbmgO");
        lIIllIlIlllIl[lIIllIlIllllI[9]] = lIllIIIIlllIlll("cikqcV1yKSp+HX4=", "WMAQu");
        lIIllIlIlllIl[lIIllIlIllllI[11]] = lIllIIIIlllIllI("77nV1ft36U5t7lXPEs8WHg==", "BwajX");
    }

    private static boolean lIllIIIIllllIlI(int i) {
        return i != 0;
    }

    private static String lIllIIIIlllIlll(String llllllllllllllIlllIlllIlllllIlII, String llllllllllllllIlllIlllIlllllIIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIlllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIlllllIIlI = new StringBuilder();
        char[] llllllllllllllIlllIlllIlllllIIIl = llllllllllllllIlllIlllIlllllIIll.toCharArray();
        int llllllllllllllIlllIlllIlllllIIII = lIIllIlIllllI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllIlIllllI[1];
        while (lIllIIIIlllllIl(i, length)) {
            llllllllllllllIlllIlllIlllllIIlI.append((char) (charArray[i] ^ llllllllllllllIlllIlllIlllllIIIl[llllllllllllllIlllIlllIlllllIIII % llllllllllllllIlllIlllIlllllIIIl.length]));
            "".length();
            llllllllllllllIlllIlllIlllllIIII++;
            i++;
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIlllIlllllIIlI);
    }

    public long d(int i) {
        Duration between = Duration.between(this.z.getStarted(), Instant.now());
        if (lIllIIIIlllllII(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean lIllIIIIlllllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIllIIIIllllIIl() {
        lIIllIlIllllI = new int[13];
        lIIllIlIllllI[0] = 136 ^ 130;
        lIIllIlIllllI[1] = (66 ^ 80) & ((107 ^ 121) ^ (-1));
        lIIllIlIllllI[2] = ((56 + 156) - 196) + 177;
        lIIllIlIllllI[3] = 134 ^ 146;
        lIIllIlIllllI[4] = " ".length();
        lIIllIlIllllI[5] = "  ".length();
        lIIllIlIllllI[6] = "   ".length();
        lIIllIlIllllI[7] = (-((-589) & 20063)) & (-8194) & 28667;
        lIIllIlIllllI[8] = 159 ^ 155;
        lIIllIlIllllI[9] = 137 ^ 140;
        lIIllIlIllllI[10] = (-((-9391) & 27823)) & (-1) & 19807;
        lIIllIlIllllI[11] = (((91 + 32) - 62) + 90) ^ (((73 + 85) - 108) + 95);
        lIIllIlIllllI[12] = 191 ^ 184;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIllIIIIllllIlI(this.z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIllIlIllllI[0], lIIllIlIllllI[0], lIIllIlIllllI[0], lIIllIlIllllI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIllIlIlllIl[lIIllIlIllllI[1]]).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIIllIlIllllI[2] + lIIllIlIllllI[3], lIIllIlIllllI[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[4]]).right(Time.format(Duration.between(this.z.getStarted(), Instant.now()))).build());
        "".length();
        int d = (int) d(this.z.j());
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[5]]);
        String str = lIIllIlIlllIl[lIIllIlIllllI[6]];
        Object[] objArr = new Object[lIIllIlIllllI[5]];
        objArr[lIIllIlIllllI[1]] = Integer.valueOf(this.z.j());
        objArr[lIIllIlIllllI[4]] = Integer.valueOf(d);
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        if (lIllIIIIllllIll(this.B.reward(), d.XP_TOME)) {
            int d2 = ((int) (d(this.C.m()) * 1375)) / lIIllIlIllllI[7];
            List children2 = this.panelComponent.getChildren();
            LineComponent.LineComponentBuilder left2 = LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[8]]);
            String str2 = lIIllIlIlllIl[lIIllIlIllllI[9]];
            Object[] objArr2 = new Object[lIIllIlIllllI[5]];
            objArr2[lIIllIlIllllI[1]] = Integer.valueOf((this.C.m() * lIIllIlIllllI[10]) / lIIllIlIllllI[7]);
            objArr2[lIIllIlIllllI[4]] = Integer.valueOf(d2);
            children2.add(left2.right(String.format(str2, objArr2)).build());
            "".length();
            "".length();
            if ((((73 ^ 41) ^ (21 ^ 100)) & (((122 ^ 3) ^ (100 ^ 12)) ^ (-" ".length()))) < 0) {
                return null;
            }
        } else {
            int d3 = (int) d(this.C.m());
            List children3 = this.panelComponent.getChildren();
            LineComponent.LineComponentBuilder left3 = LineComponent.builder().left(this.B.reward().y());
            String str3 = lIIllIlIlllIl[lIIllIlIllllI[11]];
            Object[] objArr3 = new Object[lIIllIlIllllI[5]];
            objArr3[lIIllIlIllllI[1]] = Integer.valueOf(this.C.m());
            objArr3[lIIllIlIllllI[4]] = Integer.valueOf(d3);
            children3.add(left3.right(String.format(str3, objArr3)).build());
            "".length();
        }
        return super.render(graphics2D);
    }

    static {
        lIllIIIIllllIIl();
        lIllIIIIllllIII();
    }
}
