package gg.squire.giantsfoundry.overlay;

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
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g;
import p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.h;
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:gg/squire/giantsfoundry/overlay/GiantsOverlay.class */
public class GiantsOverlay extends OverlayPanel {
    private final /* synthetic */ a Z;
    private final /* synthetic */ SquireGiantsFoundry Y;
    private static /* synthetic */ String[] llIlIlllIlIl;
    private static /* synthetic */ int[] llIlIllllllI;

    private static boolean lIIIIlIIIIlIlll(int i) {
        return i != 0;
    }

    private static boolean lIIIIlIIIIllIII(Object obj) {
        return obj == null;
    }

    private static String lIIIIIlllllllII(String lllllllllllllllIlIIIIIIllIlIlllI, String lllllllllllllllIlIIIIIIllIlIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIIllIlIllIl.getBytes(StandardCharsets.UTF_8)), llIlIllllllI[9]), "DES");
            Cipher lllllllllllllllIlIIIIIIllIllIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIIIllIllIIII.init(llIlIllllllI[2], secretKeySpec);
            return new String(lllllllllllllllIlIIIIIIllIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIIllIlIllll) {
            lllllllllllllllIlIIIIIIllIlIllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v57 */
    public Dimension render(Graphics2D graphics2D) {
        g gVar;
        String str;
        if (lIIIIlIIIIlIlll(this.Y.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIlIlllIlIl[llIlIllllllI[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[1]]).right(Time.format(Duration.between(this.Y.getStarted(), Instant.now()))).build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[2]]);
        if (lIIIIlIIIIllIII(this.Z.k())) {
            ?? r2 = llIlIlllIlIl[llIlIllllllI[3]];
            "".length();
            gVar = r2;
            if (((210 ^ 155) & ((82 ^ 27) ^ (-1))) > (145 ^ 149)) {
                return null;
            }
        } else {
            gVar = this.Z.k();
        }
        children.add(left.right(String.valueOf(gVar)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[4]]).right(String.valueOf(this.Y.getManager().getCurrentTask())).build());
        "".length();
        if (lIIIIlIIIIllIIl(this.Z.l(), llIlIllllllI[5])) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[6]]).right(String.valueOf(this.Z.l())).build());
            "".length();
            List children2 = this.panelComponent.getChildren();
            LineComponent.LineComponentBuilder left2 = LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[7]]);
            if (lIIIIlIIIIlIlll(this.Z.n() ? 1 : 0)) {
                str = llIlIlllIlIl[llIlIllllllI[8]];
                "".length();
                if ((-"  ".length()) >= 0) {
                    return null;
                }
            } else {
                str = llIlIlllIlIl[llIlIllllllI[9]];
            }
            children2.add(left2.right(str).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[10]]).right(String.valueOf(this.Z.m())).build());
            "".length();
            Map<h, Point> o = this.Z.o();
            h[] values = h.values();
            int length = values.length;
            int i = llIlIllllllI[0];
            while (lIIIIlIIIIllIlI(i, length)) {
                h hVar = values[i];
                List children3 = this.panelComponent.getChildren();
                LineComponent.LineComponentBuilder builder = LineComponent.builder();
                String str2 = llIlIlllIlIl[llIlIllllllI[11]];
                Object[] objArr = new Object[llIlIllllllI[1]];
                objArr[llIlIllllllI[0]] = hVar;
                LineComponent.LineComponentBuilder left3 = builder.left(String.format(str2, objArr));
                String str3 = llIlIlllIlIl[llIlIllllllI[12]];
                Object[] objArr2 = new Object[llIlIllllllI[2]];
                objArr2[llIlIllllllI[0]] = Integer.valueOf(o.get(hVar).getX());
                objArr2[llIlIllllllI[1]] = Integer.valueOf(o.get(hVar).getY());
                children3.add(left3.right(String.format(str3, objArr2)).build());
                "".length();
                i++;
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
        }
        this.panelComponent.setPreferredSize(new Dimension(llIlIllllllI[13] + llIlIllllllI[14], llIlIllllllI[0]));
        return super.render(graphics2D);
    }

    private static void lIIIIIlllllllll() {
        llIlIlllIlIl = new String[llIlIllllllI[15]];
        llIlIlllIlIl[llIlIllllllI[0]] = lIIIIIlllllllII("rqrLLZ1oSzZMIeDh6Cn2AEMr4DWVx2NC", "GyxId");
        llIlIlllIlIl[llIlIllllllI[1]] = lIIIIIlllllllIl("fcl27YN2ei4=", "auYaI");
        llIlIlllIlIl[llIlIllllllI[2]] = lIIIIIlllllllII("0yBSbgKZQqr3mQe6HkuH8AwtJssQWqPC", "MLVEl");
        llIlIlllIlIl[llIlIllllllI[3]] = lIIIIIllllllllI("CRwMDw==", "Gsbjv");
        llIlIlllIlIl[llIlIllllllI[4]] = lIIIIIlllllllII("0c0J0UPjwJMCw4dLHFrW/J7zXLQhmB3F", "OuATD");
        llIlIlllIlIl[llIlIllllllI[6]] = lIIIIIlllllllIl("jNqPwZp3qKeWq4aZEk8UGunTQRJvIGmm", "speDn");
        llIlIlllIlIl[llIlIllllllI[7]] = lIIIIIlllllllIl("Mi8/1SYufFd4zG5CBs5gRSv+mhRBKX9x", "eSpEN");
        llIlIlllIlIl[llIlIllllllI[8]] = lIIIIIlllllllIl("upBvMD3JzPE=", "GcNiK");
        llIlIlllIlIl[llIlIllllllI[9]] = lIIIIIllllllllI("DAc=", "BheJo");
        llIlIlllIlIl[llIlIllllllI[10]] = lIIIIIlllllllIl("n/LKqkWUmEdIWiXoGwiZ0jKN1wKddoOL", "TDCVv");
        llIlIlllIlIl[llIlIllllllI[11]] = lIIIIIlllllllIl("vV5ShduTF7EP6AzXYJzU7Q==", "fsYfa");
        llIlIlllIlIl[llIlIllllllI[12]] = lIIIIIllllllllI("fyFyW2d/IQ==", "ZERvG");
    }

    @Inject
    public GiantsOverlay(SquireGiantsFoundry squireGiantsFoundry, a aVar) {
        this.Y = squireGiantsFoundry;
        this.Z = aVar;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIIIIllllllllI(String lllllllllllllllIlIIIIIIllIIllllI, String lllllllllllllllIlIIIIIIllIIlllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIllIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIIIllIIlllII = new StringBuilder();
        char[] lllllllllllllllIlIIIIIIllIIllIll = lllllllllllllllIlIIIIIIllIIlllIl.toCharArray();
        int lllllllllllllllIlIIIIIIllIIllIlI = llIlIllllllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlIllllllI[0];
        while (lIIIIlIIIIllIlI(i, length)) {
            char lllllllllllllllIlIIIIIIllIIlllll = charArray[i];
            lllllllllllllllIlIIIIIIllIIlllII.append((char) (lllllllllllllllIlIIIIIIllIIlllll ^ lllllllllllllllIlIIIIIIllIIllIll[lllllllllllllllIlIIIIIIllIIllIlI % lllllllllllllllIlIIIIIIllIIllIll.length]));
            "".length();
            lllllllllllllllIlIIIIIIllIIllIlI++;
            i++;
            "".length();
            if (((((177 + 157) - 224) + 72) ^ (((131 + 157) - 189) + 79)) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIIIIllIIlllII);
    }

    private static String lIIIIIlllllllIl(String lllllllllllllllIlIIIIIIllIlllIll, String lllllllllllllllIlIIIIIIllIlllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIIllIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIllllllI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIIllIllllII) {
            lllllllllllllllIlIIIIIIllIllllII.printStackTrace();
            return null;
        }
    }

    static {
        lIIIIlIIIIlIllI();
        lIIIIIlllllllll();
    }

    private static boolean lIIIIlIIIIllIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIIlIIIIllIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIIIIlIIIIlIllI() {
        llIlIllllllI = new int[16];
        llIlIllllllI[0] = (124 ^ 76) & ((75 ^ 123) ^ (-1));
        llIlIllllllI[1] = " ".length();
        llIlIllllllI[2] = "  ".length();
        llIlIllllllI[3] = "   ".length();
        llIlIllllllI[4] = (((61 + 64) - (-2)) + 1) ^ (((56 + 95) - 61) + 42);
        llIlIllllllI[5] = -" ".length();
        llIlIllllllI[6] = (58 ^ 61) ^ "  ".length();
        llIlIllllllI[7] = 25 ^ 31;
        llIlIllllllI[8] = 125 ^ 122;
        llIlIllllllI[9] = (23 ^ 109) ^ (248 ^ 138);
        llIlIllllllI[10] = 185 ^ 176;
        llIlIllllllI[11] = 153 ^ 147;
        llIlIllllllI[12] = 44 ^ 39;
        llIlIllllllI[13] = (-((-12873) & 32509)) & (-8777) & 28670;
        llIlIllllllI[14] = (((28 + 68) - 60) + 122) ^ (((109 + 61) - 89) + 57);
        llIlIllllllI[15] = 189 ^ 177;
    }
}
