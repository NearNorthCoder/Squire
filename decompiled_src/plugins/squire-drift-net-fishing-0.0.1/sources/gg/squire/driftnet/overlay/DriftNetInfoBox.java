package gg.squire.driftnet.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.driftnet.SquireDriftNet;
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
import net.unethicalite.client.Static;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n.a;
@Singleton
/* loaded from: squire-drift-net-fishing-0.0.1.jar:gg/squire/driftnet/overlay/DriftNetInfoBox.class */
public class DriftNetInfoBox extends OverlayPanel {
    private final /* synthetic */ TaskManager o;
    private final /* synthetic */ SquireDriftNet m;
    private static /* synthetic */ int[] lIlIIIIllIlI;
    private final /* synthetic */ a n;
    private static /* synthetic */ String[] lIlIIIIlIlll;

    private static String llIlIlIIIIIllI(String lllllllllllllllIlllIIllIlIlIIIII, String lllllllllllllllIlllIIllIlIIlllll) {
        String lllllllllllllllIlllIIllIlIlIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIllIlIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlllIIllIlIIlllIl = lllllllllllllllIlllIIllIlIIlllll.toCharArray();
        int lllllllllllllllIlllIIllIlIIlllII = lIlIIIIllIlI[1];
        char[] charArray = lllllllllllllllIlllIIllIlIlIIIII2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIllIlI[1];
        while (llIlIlIIIlIIIl(i, length)) {
            char lllllllllllllllIlllIIllIlIlIIIIl = charArray[i];
            sb.append((char) (lllllllllllllllIlllIIllIlIlIIIIl ^ lllllllllllllllIlllIIllIlIIlllIl[lllllllllllllllIlllIIllIlIIlllII % lllllllllllllllIlllIIllIlIIlllIl.length]));
            "".length();
            lllllllllllllllIlllIIllIlIIlllII++;
            i++;
            "".length();
            if ("  ".length() == ((253 ^ 190) & ((113 ^ 50) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIlIlIIIIlIII(String lllllllllllllllIlllIIllIlIllllIl, String lllllllllllllllIlllIIllIlIllllII) {
        try {
            SecretKeySpec lllllllllllllllIlllIIllIllIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllIlIllllII.getBytes(StandardCharsets.UTF_8)), lIlIIIIllIlI[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIllIlI[5], lllllllllllllllIlllIIllIllIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIllIlIlllllI) {
            lllllllllllllllIlllIIllIlIlllllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public DriftNetInfoBox(SquireDriftNet squireDriftNet, a aVar) {
        this.m = squireDriftNet;
        this.n = aVar;
        this.o = squireDriftNet.getManager();
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (llIlIlIIIIllll(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIIIIllIlI[0], lIlIIIIllIlI[0], lIlIIIIllIlI[0], lIlIIIIllIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIIIIlIlll[lIlIIIIllIlI[1]]).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIlIIIIllIlI[2] + lIlIIIIllIlI[3], lIlIIIIllIlI[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[4]]).right(Time.format(Duration.between(this.m.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[5]]).right(this.o.getCurrentTask()).build());
        "".length();
        int a = (int) a(this.n.i());
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[6]]);
        String str = lIlIIIIlIlll[lIlIIIIllIlI[7]];
        Object[] objArr = new Object[lIlIIIIllIlI[5]];
        objArr[lIlIIIIllIlI[1]] = Integer.valueOf(this.n.i());
        objArr[lIlIIIIllIlI[4]] = Integer.valueOf(a);
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        int varbitValue = Static.getClient().getVarbitValue(lIlIIIIllIlI[8]);
        int varbitValue2 = Static.getClient().getVarbitValue(lIlIIIIllIlI[9]);
        int varbitValue3 = Static.getClient().getVarbitValue(lIlIIIIllIlI[10]);
        int varbitValue4 = Static.getClient().getVarbitValue(lIlIIIIllIlI[11]);
        List children2 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left2 = LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[12]]);
        String str2 = lIlIIIIlIlll[lIlIIIIllIlI[13]];
        Object[] objArr2 = new Object[lIlIIIIllIlI[5]];
        objArr2[lIlIIIIllIlI[1]] = Integer.valueOf(varbitValue);
        objArr2[lIlIIIIllIlI[4]] = Integer.valueOf(varbitValue3);
        children2.add(left2.right(String.format(str2, objArr2)).build());
        "".length();
        List children3 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left3 = LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[14]]);
        String str3 = lIlIIIIlIlll[lIlIIIIllIlI[15]];
        Object[] objArr3 = new Object[lIlIIIIllIlI[5]];
        objArr3[lIlIIIIllIlI[1]] = Integer.valueOf(varbitValue2);
        objArr3[lIlIIIIllIlI[4]] = Integer.valueOf(varbitValue4);
        children3.add(left3.right(String.format(str3, objArr3)).build());
        "".length();
        return super.render(graphics2D);
    }

    private static boolean llIlIlIIIIllll(int i) {
        return i != 0;
    }

    static {
        llIlIlIIIIlllI();
        llIlIlIIIIlIll();
    }

    private static void llIlIlIIIIlIll() {
        lIlIIIIlIlll = new String[lIlIIIIllIlI[16]];
        lIlIIIIlIlll[lIlIIIIllIlI[1]] = llIlIlIIIIIllI("OgIkHR0MUxUGBg8HcToKHVMXHRwBFiM=", "isQto");
        lIlIIIIlIlll[lIlIIIIllIlI[4]] = llIlIlIIIIIlll("BZbvPwyY7nfyZ4BJpgrF+A==", "jhVeL");
        lIlIIIIlIlll[lIlIIIIllIlI[5]] = llIlIlIIIIIllI("EQA8KFJl", "EaOCh");
        lIlIIIIlIlll[lIlIIIIllIlI[6]] = llIlIlIIIIlIII("UP3dJtQ4fSvn0579q3Xfpw==", "JnRvi");
        lIlIIIIlIlll[lIlIIIIllIlI[7]] = llIlIlIIIIIlll("AVCWdu2yc6e57jMuNNoNsQ==", "UAaZt");
        lIlIIIIlIlll[lIlIIIIllIlI[12]] = llIlIlIIIIlIII("0Lx5Apw/ULM=", "gUDmg");
        lIlIIIIlIlll[lIlIIIIllIlI[13]] = llIlIlIIIIlIII("QUgEMKE8C6U=", "vjIhK");
        lIlIIIIlIlll[lIlIIIIllIlI[14]] = llIlIlIIIIIlll("s+KlB+6CYSo=", "GQSDF");
        lIlIIIIlIlll[lIlIIIIllIlI[15]] = llIlIlIIIIIllI("aDZRY2Qpew==", "MRqKA");
    }

    private static void llIlIlIIIIlllI() {
        lIlIIIIllIlI = new int[17];
        lIlIIIIllIlI[0] = (70 ^ 14) ^ (22 ^ 84);
        lIlIIIIllIlI[1] = (64 ^ 20) & ((245 ^ 161) ^ (-1));
        lIlIIIIllIlI[2] = (((58 ^ 70) + (118 ^ 57)) - (121 ^ 12)) + (208 ^ 187);
        lIlIIIIllIlI[3] = (52 ^ 113) ^ (219 ^ 138);
        lIlIIIIllIlI[4] = " ".length();
        lIlIIIIllIlI[5] = "  ".length();
        lIlIIIIllIlI[6] = "   ".length();
        lIlIIIIllIlI[7] = (63 ^ 52) ^ (80 ^ 95);
        lIlIIIIllIlI[8] = (-((-7825) & 32667)) & (-2050) & 32703;
        lIlIIIIllIlI[9] = (-((-533) & 25374)) & (-2049) & 32703;
        lIlIIIIllIlI[10] = (-10561) & 16373;
        lIlIIIIllIlI[11] = (-((-12423) & 12743)) & (-8201) & 14335;
        lIlIIIIllIlI[12] = 103 ^ 98;
        lIlIIIIllIlI[13] = 1 ^ 7;
        lIlIIIIllIlI[14] = 33 ^ 38;
        lIlIIIIllIlI[15] = 159 ^ 151;
        lIlIIIIllIlI[16] = 146 ^ 155;
    }

    private static boolean llIlIlIIIlIIII(int i) {
        return i == 0;
    }

    private static boolean llIlIlIIIlIIIl(int i, int i2) {
        return i < i2;
    }

    public long a(int i) {
        Duration between = Duration.between(this.m.getStarted(), Instant.now());
        if (llIlIlIIIlIIII(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static String llIlIlIIIIIlll(String lllllllllllllllIlllIIllIlIllIIII, String lllllllllllllllIlllIIllIlIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIllIlIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIllIlIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIllIlIllIIlI.init(lIlIIIIllIlI[5], secretKeySpec);
            return new String(lllllllllllllllIlllIIllIlIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIllIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIllIlIllIIIl) {
            lllllllllllllllIlllIIllIlIllIIIl.printStackTrace();
            return null;
        }
    }
}
