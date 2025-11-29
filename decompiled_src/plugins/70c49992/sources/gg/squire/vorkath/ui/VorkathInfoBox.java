package gg.squire.vorkath.ui;

import com.google.inject.Inject;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.C0003d;
import i.v.k.o.p000.u.s.e.r.a.q.r.t.h.C0005f;
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
import net.runelite.api.NPC;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.runelite.client.util.QuantityFormatter;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:gg/squire/vorkath/ui/VorkathInfoBox.class */
public class VorkathInfoBox extends OverlayPanel {
    private final /* synthetic */ C0003d cL;
    private static /* synthetic */ int[] lIlIlIlIlIIlI;
    private final /* synthetic */ SquireVorkathPlugin cK;
    private static /* synthetic */ String[] lIlIlIlIlIIII;
    private /* synthetic */ SquireVorkathConfig y;
    private final /* synthetic */ C0005f cM;

    private static boolean lIlllllIlllllIl(Object obj) {
        return obj != null;
    }

    private static String lIlllllIllIlIIl(String llllllllllllllIllIlIlIllIlIllIII, String llllllllllllllIllIlIlIllIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIllIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIIlI[10]), "DES");
            Cipher llllllllllllllIllIlIlIllIlIllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIllIlIllIlI.init(lIlIlIlIlIIlI[4], secretKeySpec);
            return new String(llllllllllllllIllIlIlIllIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIllIlIllIIl) {
            llllllllllllllIllIlIlIllIlIllIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlllllIllllIll();
        lIlllllIllIlllI();
    }

    private static void lIlllllIllIlllI() {
        lIlIlIlIlIIII = new String[lIlIlIlIlIIlI[17]];
        lIlIlIlIlIIII[lIlIlIlIlIIlI[2]] = lIlllllIllIlIIl("AEgsYg9baajvKT0Que7t+g==", "wGwFw");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[3]] = lIlllllIllIlIlI("iJ1oP7dYqZo=", "XdwJl");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[4]] = lIlllllIllIlIlI("Tqt2Nn1mrlI=", "ljhHj");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[5]] = lIlllllIllIllII("Ez0JOAcsLQ==", "AHgLn");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[6]] = lIlllllIllIlIlI("PEW6Uqk2y9K1DN0n9T9vJg==", "Srcjh");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[7]] = lIlllllIllIlIIl("zNiLeZBrLpk=", "CYegV");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[8]] = lIlllllIllIlIIl("0KVwibkQBnusXyJI7xC09Q==", "lurQL");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[9]] = lIlllllIllIlIIl("KJFzohgKeng=", "bEBOs");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[10]] = lIlllllIllIllII("ahhvZWk8RCdk", "OkOML");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[11]] = lIlllllIllIllII("DRQpGg86", "IqHng");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[0]] = lIlllllIllIlIIl("pHSZk1SRVKM=", "wyqUD");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[12]] = lIlllllIllIlIIl("58MynjxpV2E=", "zdrKJ");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[13]] = lIlllllIllIlIIl("mqw+IvW1YSCkq3LgYBr2oQ==", "qPMld");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[14]] = lIlllllIllIlIlI("P4zJuvhjE3D0fB1g30xXQwnO6GrrBhR8", "PCfHE");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[15]] = lIlllllIllIllII("JQACdwEcAhA5", "lcgWr");
        lIlIlIlIlIIII[lIlIlIlIlIIlI[16]] = lIlllllIllIllII("MBgtByUCBA==", "chHdL");
    }

    private static boolean lIlllllIlllllII(int i2) {
        return i2 != 0;
    }

    @Inject
    public VorkathInfoBox(SquireVorkathPlugin squireVorkathPlugin, C0003d c0003d, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        this.cK = squireVorkathPlugin;
        this.cL = c0003d;
        this.cM = c0005f;
        this.y = squireVorkathConfig;
        setPosition(OverlayPosition.TOP_LEFT);
    }

    private static void lIlllllIllllIll() {
        lIlIlIlIlIIlI = new int[18];
        lIlIlIlIlIIlI[0] = 137 ^ 131;
        lIlIlIlIlIIlI[1] = (-241) & 498;
        lIlIlIlIlIIlI[2] = (18 ^ 45) & ((107 ^ 84) ^ (-1));
        lIlIlIlIlIIlI[3] = " ".length();
        lIlIlIlIlIIlI[4] = "  ".length();
        lIlIlIlIlIIlI[5] = "   ".length();
        lIlIlIlIlIIlI[6] = (((133 + 92) - 55) + 9) ^ (((93 + 130) - 121) + 81);
        lIlIlIlIlIIlI[7] = 138 ^ 143;
        lIlIlIlIlIIlI[8] = (((82 + 65) - 78) + 96) ^ (((147 + 41) - 131) + 106);
        lIlIlIlIlIIlI[9] = 182 ^ 177;
        lIlIlIlIlIIlI[10] = 169 ^ 161;
        lIlIlIlIlIIlI[11] = (162 ^ 187) ^ (113 ^ 97);
        lIlIlIlIlIIlI[12] = (193 ^ 130) ^ (237 ^ 165);
        lIlIlIlIlIIlI[13] = 100 ^ 104;
        lIlIlIlIlIIlI[14] = 145 ^ 156;
        lIlIlIlIlIIlI[15] = (((137 + 35) - 90) + 62) ^ (((80 + 81) - 26) + 23);
        lIlIlIlIlIIlI[16] = (((168 + 102) - 143) + 51) ^ (((148 + 149) - 229) + 121);
        lIlIlIlIlIIlI[17] = (((134 + 152) - 109) + 13) ^ (((66 + 98) - 86) + 96);
    }

    private static boolean lIlllllIllllllI(int i2) {
        return i2 == 0;
    }

    private static String lIlllllIllIllII(String llllllllllllllIllIlIlIllIllIllIl, String llllllllllllllIllIlIlIllIllIllII) {
        String llllllllllllllIllIlIlIllIllIllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIllIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlIlIllIllIlIlI = llllllllllllllIllIlIlIllIllIllII.toCharArray();
        int llllllllllllllIllIlIlIllIllIlIIl = lIlIlIlIlIIlI[2];
        char[] charArray = llllllllllllllIllIlIlIllIllIllIl2.toCharArray();
        int length = charArray.length;
        int i2 = lIlIlIlIlIIlI[2];
        while (lIlllllIlllllll(i2, length)) {
            sb.append((char) (charArray[i2] ^ llllllllllllllIllIlIlIllIllIlIlI[llllllllllllllIllIlIlIllIllIlIIl % llllllllllllllIllIlIlIllIllIlIlI.length]));
            "".length();
            llllllllllllllIllIlIlIllIllIlIIl++;
            i2++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlllllIlllllll(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v54, types: [boolean] */
    public Dimension render(Graphics2D graphics2D) {
        if (lIlllllIlllllII(this.cK.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0]));
        this.panelComponent.setPreferredSize(new Dimension(lIlIlIlIlIIlI[1], lIlIlIlIlIIlI[2]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIlIlIlIIII[lIlIlIlIlIIlI[2]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[3]]).right(lIlIlIlIlIIII[lIlIlIlIlIIlI[4]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[5]]).right(Time.format(Duration.between(this.cK.getStarted(), Instant.now()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[6]]).right(this.cK.getManager().getCurrentTask()).build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[7]]);
        String str = lIlIlIlIlIIII[lIlIlIlIlIIlI[8]];
        Object[] objArr = new Object[lIlIlIlIlIIlI[4]];
        objArr[lIlIlIlIlIIlI[2]] = Integer.valueOf(this.cK.e());
        objArr[lIlIlIlIlIIlI[3]] = Integer.valueOf(g(this.cK.e()));
        children.add(left.right(String.format(str, objArr)).build());
        "".length();
        List children2 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left2 = LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[9]]);
        String str2 = lIlIlIlIlIIII[lIlIlIlIlIIlI[10]];
        Object[] objArr2 = new Object[lIlIlIlIlIIlI[4]];
        objArr2[lIlIlIlIlIIlI[2]] = QuantityFormatter.quantityToRSDecimalStack(this.cK.g());
        objArr2[lIlIlIlIlIIlI[3]] = QuantityFormatter.quantityToRSDecimalStack(g(this.cK.g()));
        children2.add(left2.right(String.format(str2, objArr2)).build());
        "".length();
        List children3 = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left3 = LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[11]]);
        String str3 = lIlIlIlIlIIII[lIlIlIlIlIIlI[0]];
        Object[] objArr3 = new Object[lIlIlIlIlIIlI[3]];
        objArr3[lIlIlIlIlIIlI[2]] = Integer.valueOf(this.cK.d());
        children3.add(left3.right(String.format(str3, objArr3)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[12]]).right(String.valueOf(this.cK.c())).build());
        "".length();
        NPC c = this.cM.c(lIlIlIlIlIIlI[3]);
        if (lIlllllIlllllIl(c) && lIlllllIlllllII(this.y.debug() ? 1 : 0)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[13]]).right(String.valueOf(c.getActionFrame())).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[14]]).right(String.valueOf(Static.getClient().getTickCount() - this.cM.H())).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[15]]).right(String.valueOf(this.cM.I())).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[16]]).right(String.valueOf(this.cM.B())).build());
            "".length();
        }
        return super.render(graphics2D);
    }

    public int g(int i2) {
        Duration between = Duration.between(this.cK.getStarted(), Instant.now());
        return lIlllllIllllllI(between.isZero() ? 1 : 0) ? (int) ((i2 * Duration.ofHours(1L).toMillis()) / between.toMillis()) : lIlIlIlIlIIlI[2];
    }

    private static String lIlllllIllIlIlI(String llllllllllllllIllIlIlIllIllllIll, String llllllllllllllIllIlIlIllIllllIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIlllIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIllIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIlIlIIlI[4], llllllllllllllIllIlIlIlllIIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIllIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIllIllllllI) {
            llllllllllllllIllIlIlIllIllllllI.printStackTrace();
            return null;
        }
    }
}
