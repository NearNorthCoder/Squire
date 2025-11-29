package gg.squire.aerialfisher.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.aerialfisher.SquireAerialFisher;
import i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a.a;
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
@Singleton
/* loaded from: 9bb83689-ff7d-471d-9a08-411d7484ad87.jar:gg/squire/aerialfisher/overlay/AerialFisherInfoBox.class */
public class AerialFisherInfoBox extends OverlayPanel {
    private final /* synthetic */ SquireAerialFisher h;
    private static /* synthetic */ String[] lIlIlllIllI;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ a f0i;
    private static /* synthetic */ int[] lIlIlllIlll;

    private static boolean lIIlIlIIIIlIlI(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIIlIlIIIIIlll();
        lIIlIlIIIIIllI();
    }

    private static boolean lIIlIlIIIIlIIl(int i2) {
        return i2 == 0;
    }

    private static String lIIlIlIIIIIlIl(String llllllllllllllllIlIlIllIllllIIII, String llllllllllllllllIlIlIllIlllIllll) {
        try {
            SecretKeySpec llllllllllllllllIlIlIllIllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIllIlllIllll.getBytes(StandardCharsets.UTF_8)), lIlIlllIlll[11]), "DES");
            Cipher llllllllllllllllIlIlIllIllllIIlI = Cipher.getInstance("DES");
            llllllllllllllllIlIlIllIllllIIlI.init(lIlIlllIlll[5], llllllllllllllllIlIlIllIllllIIll);
            return new String(llllllllllllllllIlIlIllIllllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIllIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIllIlllIllII) {
            llllllllllllllllIlIlIllIlllIllII.printStackTrace();
            return null;
        }
    }

    @Inject
    public AerialFisherInfoBox(SquireAerialFisher squireAerialFisher, a aVar) {
        this.h = squireAerialFisher;
        this.f0i = aVar;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIlIlIIIIIlII(String llllllllllllllllIlIlIllIlllIIIII, String llllllllllllllllIlIlIllIllIlllll) {
        String llllllllllllllllIlIlIllIlllIIIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIllIlllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIllIllIllllI = new StringBuilder();
        char[] charArray = llllllllllllllllIlIlIllIllIlllll.toCharArray();
        int llllllllllllllllIlIlIllIllIlllII = lIlIlllIlll[1];
        char[] charArray2 = llllllllllllllllIlIlIllIlllIIIII2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIlllIlll[1];
        while (lIIlIlIIIIlIlI(i2, length)) {
            char llllllllllllllllIlIlIllIlllIIIIl = charArray2[i2];
            llllllllllllllllIlIlIllIllIllllI.append((char) (llllllllllllllllIlIlIllIlllIIIIl ^ charArray[llllllllllllllllIlIlIllIllIlllII % charArray.length]));
            "".length();
            llllllllllllllllIlIlIllIllIlllII++;
            i2++;
            "".length();
            if (" ".length() == ((217 ^ 136) ^ (72 ^ 29))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIlIllIllIllllI);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIIlIlIIIIlIII(this.h.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIlllIlll[0], lIlIlllIlll[0], lIlIlllIlll[0], lIlIlllIlll[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIlllIllI[lIlIlllIlll[1]]).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIlIlllIlll[2] + lIlIlllIlll[3], lIlIlllIlll[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[4]]).right(Time.format(Duration.between(this.h.getStarted(), Instant.now()))).build());
        "".length();
        int a = (int) a(this.f0i.b());
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[5]]);
        String str = lIlIlllIllI[lIlIlllIlll[6]];
        Object[] objArr = new Object[lIlIlllIlll[5]];
        objArr[lIlIlllIlll[1]] = Integer.valueOf(this.f0i.b());
        objArr[lIlIlllIlll[4]] = Integer.valueOf(a);
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        int a2 = (int) a(this.f0i.c());
        List children2 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left2 = LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[7]]);
        String str2 = lIlIlllIllI[lIlIlllIlll[8]];
        Object[] objArr2 = new Object[lIlIlllIlll[5]];
        objArr2[lIlIlllIlll[1]] = Integer.valueOf(this.f0i.c());
        objArr2[lIlIlllIlll[4]] = Integer.valueOf(a2);
        children2.add(left2.right(String.format(str2, objArr2)).build());
        "".length();
        int a3 = (int) a(this.f0i.d());
        List children3 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left3 = LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[9]]);
        String str3 = lIlIlllIllI[lIlIlllIlll[10]];
        Object[] objArr3 = new Object[lIlIlllIlll[5]];
        objArr3[lIlIlllIlll[1]] = Integer.valueOf(this.f0i.d());
        objArr3[lIlIlllIlll[4]] = Integer.valueOf(a3);
        children3.add(left3.right(String.format(str3, objArr3)).build());
        "".length();
        return super.render(graphics2D);
    }

    private static void lIIlIlIIIIIlll() {
        lIlIlllIlll = new int[12];
        lIlIlllIlll[0] = (((136 + 141) - 203) + 127) ^ (((1 + 153) - 56) + 97);
        lIlIlllIlll[1] = "   ".length() & ("   ".length() ^ (-" ".length()));
        lIlIlllIlll[2] = (((86 ^ 60) + (((107 + 80) - 45) + 5)) - (85 ^ 24)) + (20 ^ 5);
        lIlIlllIlll[3] = 86 ^ 66;
        lIlIlllIlll[4] = " ".length();
        lIlIlllIlll[5] = "  ".length();
        lIlIlllIlll[6] = "   ".length();
        lIlIlllIlll[7] = (((46 + 34) - (-64)) + 27) ^ (((124 + 142) - 197) + 106);
        lIlIlllIlll[8] = 26 ^ 31;
        lIlIlllIlll[9] = 49 ^ 55;
        lIlIlllIlll[10] = (9 ^ 109) ^ (254 ^ 157);
        lIlIlllIlll[11] = 23 ^ 31;
    }

    public long a(int i2) {
        Duration between = Duration.between(this.h.getStarted(), Instant.now());
        if (lIIlIlIIIIlIIl(between.isZero() ? 1 : 0)) {
            return (int) ((i2 * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static boolean lIIlIlIIIIlIII(int i2) {
        return i2 != 0;
    }

    private static String lIIlIlIIIIIIll(String llllllllllllllllIlIlIllIllllllIl, String llllllllllllllllIlIlIllIllllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIllIllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlllIlll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIllIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIllIlllllllI) {
            llllllllllllllllIlIlIllIlllllllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIIIIllI() {
        lIlIlllIllI = new String[lIlIlllIlll[11]];
        lIlIlllIllI[lIlIlllIlll[1]] = lIIlIlIIIIIIll("Sh1/sr2ISIwFUcg8mj70q9zYRB73L47w", "wzyiT");
        lIlIlllIllI[lIlIlllIlll[4]] = lIIlIlIIIIIlII("IwMKLiYcE14=", "qvdZO");
        lIlIlllIllI[lIlIlllIlll[5]] = lIIlIlIIIIIIll("Lv/5dNGhhy8bL7gybImTPg==", "faHki");
        lIlIlllIllI[lIlIlllIlll[6]] = lIIlIlIIIIIlII("YShMW1EgYwRa", "DLlst");
        lIlIlllIllI[lIlIlllIlll[7]] = lIIlIlIIIIIlIl("ePbQ7sbkJjqUToCnQo3w7Q==", "bGYRk");
        lIlIlllIllI[lIlIlllIlll[8]] = lIIlIlIIIIIlIl("Sb1WyB22334947k3LpAj3Q==", "PqdBX");
        lIlIlllIllI[lIlIlllIlll[9]] = lIIlIlIIIIIlIl("20EJh5o9avLl8kUNKirKcw==", "BFVFt");
        lIlIlllIllI[lIlIlllIlll[10]] = lIIlIlIIIIIlII("UxNKSmkSWAJL", "vwjbL");
    }
}
