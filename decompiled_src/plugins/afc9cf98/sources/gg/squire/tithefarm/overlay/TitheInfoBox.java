package gg.squire.tithefarm.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.tithefarm.SquireTitheFarm;
import java.awt.Dimension;
import java.awt.Graphics2D;
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
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.i;
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:gg/squire/tithefarm/overlay/TitheInfoBox.class */
public class TitheInfoBox extends OverlayPanel {
    private final /* synthetic */ i x;
    private final /* synthetic */ TaskManager w;
    private static /* synthetic */ int[] lIIllllllIIlI;
    private static /* synthetic */ String[] lIIlllllIllll;
    private final /* synthetic */ SquireTitheFarm v;

    public long e(int i) {
        Duration between = Duration.between(this.v.getStarted(), Instant.now());
        if (lIllIllIIIlIIIl(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    private static String lIllIllIIIIIIlI(String llllllllllllllIlllIIlIlllIlIIlIl, String llllllllllllllIlllIIlIlllIlIIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIlllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIlllIlIIIll = new StringBuilder();
        char[] llllllllllllllIlllIIlIlllIlIIIlI = llllllllllllllIlllIIlIlllIlIIlII.toCharArray();
        int llllllllllllllIlllIIlIlllIlIIIIl = lIIllllllIIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllllllIIlI[0];
        while (lIllIllIIIlIIII(i, length)) {
            char llllllllllllllIlllIIlIlllIlIIllI = charArray[i];
            llllllllllllllIlllIIlIlllIlIIIll.append((char) (llllllllllllllIlllIIlIlllIlIIllI ^ llllllllllllllIlllIIlIlllIlIIIlI[llllllllllllllIlllIIlIlllIlIIIIl % llllllllllllllIlllIIlIlllIlIIIlI.length]));
            "".length();
            llllllllllllllIlllIIlIlllIlIIIIl++;
            i++;
            "".length();
            if ((-((((159 + 46) - 80) + 41) ^ (((102 + 81) - 113) + 92))) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIlIlllIlIIIll);
    }

    private static void lIllIllIIIIIlII() {
        lIIlllllIllll = new String[lIIllllllIIlI[14]];
        lIIlllllIllll[lIIllllllIIlI[0]] = lIllIllIIIIIIIl("Vxlc3xEQI176CCIbkNEu3M+X2AULjS7s", "ECUDn");
        lIIlllllIllll[lIIllllllIIlI[1]] = lIllIllIIIIIIlI("MDM3JisPIw==", "bFYRB");
        lIIlllllIllll[lIIllllllIIlI[2]] = lIllIllIIIIIIll("odlXrvx9ODg=", "mgOsW");
        lIIlllllIllll[lIIllllllIIlI[3]] = lIllIllIIIIIIIl("ZEpY5KTksHA=", "WkdTL");
        lIIlllllIllll[lIIllllllIIlI[4]] = lIllIllIIIIIIll("yLDObvSKT44=", "ZIxPP");
        lIIlllllIllll[lIIllllllIIlI[5]] = lIllIllIIIIIIll("H6HQ3ms+9j1RC2+nP0YORg==", "zxSry");
        lIIlllllIllll[lIIllllllIIlI[6]] = lIllIllIIIIIIll("XNqJgEw/N/CL12ZOditlGJWDD+XPc0RQ", "GGONN");
        lIIlllllIllll[lIIllllllIIlI[7]] = lIllIllIIIIIIIl("czk4RgRd7b6Kkhb5qkDxZQ==", "hEhdW");
        lIIlllllIllll[lIIllllllIIlI[8]] = lIllIllIIIIIIll("QEWrytSGqddKa/jn5v8LaRJWZLjKxHfp", "zaNjY");
        lIIlllllIllll[lIIllllllIIlI[9]] = lIllIllIIIIIIll("VXGJgEA2gkQEU3ZyPdp3qvsI7RfAyQ+4", "DfCCf");
        lIIlllllIllll[lIIllllllIIlI[10]] = lIllIllIIIIIIll("HzwEN0n4eJny6FHOplMbLde4y150or4kegsJ3UeruWc=", "zHQzM");
        lIIlllllIllll[lIIllllllIIlI[11]] = lIllIllIIIIIIlI("ICok", "yOWHy");
    }

    private static boolean lIllIllIIIlIIII(int i, int i2) {
        return i < i2;
    }

    static {
        lIllIllIIIIlllI();
        lIllIllIIIIIlII();
    }

    private static String lIllIllIIIIIIll(String llllllllllllllIlllIIlIlllIIlIIII, String llllllllllllllIlllIIlIlllIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlllIIIllIl.getBytes(StandardCharsets.UTF_8)), lIIllllllIIlI[8]), "DES");
            Cipher llllllllllllllIlllIIlIlllIIlIIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIlllIIlIIlI.init(lIIllllllIIlI[2], secretKeySpec);
            return new String(llllllllllllllIlllIIlIlllIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlllIIlIIIl) {
            llllllllllllllIlllIIlIlllIIlIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    private TitheInfoBox(SquireTitheFarm squireTitheFarm, i iVar) {
        this.v = squireTitheFarm;
        this.w = squireTitheFarm.getManager();
        this.x = iVar;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIllIIIIllll(int i) {
        return i != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        String str;
        if (lIllIllIIIIllll(this.v.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.v.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllllIllll[lIIllllllIIlI[0]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[1]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[2]]).right(lIIlllllIllll[lIIllllllIIlI[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[4]]).right(this.w.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[5]]).right(String.valueOf(this.v.a())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[6]]).right(String.valueOf(e(this.v.a()))).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[7]]).right(String.valueOf(this.x.q())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[8]]).right(String.valueOf(this.x.v())).build());
        "".length();
        List children = this.panelComponent.getChildren();
        LineComponent.LineComponentBuilder left = LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[9]]);
        if (lIllIllIIIlIIII(this.x.v(), lIIllllllIIlI[4] * this.x.u())) {
            str = lIIlllllIllll[lIIllllllIIlI[10]];
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return null;
            }
        } else {
            str = lIIlllllIllll[lIIllllllIIlI[11]];
        }
        children.add(left.right(str).build());
        "".length();
        this.panelComponent.setPreferredSize(new Dimension(lIIllllllIIlI[12] + lIIllllllIIlI[13], lIIllllllIIlI[0]));
        return super.render(graphics2D);
    }

    private static String lIllIllIIIIIIIl(String llllllllllllllIlllIIlIlllIIIIIll, String llllllllllllllIlllIIlIlllIIIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlllIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllllllIIlI[2], llllllllllllllIlllIIlIlllIIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlllIIIIlII) {
            llllllllllllllIlllIIlIlllIIIIlII.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIIIIlllI() {
        lIIllllllIIlI = new int[15];
        lIIllllllIIlI[0] = (98 ^ 1) & ((217 ^ 186) ^ (-1));
        lIIllllllIIlI[1] = " ".length();
        lIIllllllIIlI[2] = "  ".length();
        lIIllllllIIlI[3] = "   ".length();
        lIIllllllIIlI[4] = 44 ^ 40;
        lIIllllllIIlI[5] = (30 ^ 123) ^ (43 ^ 75);
        lIIllllllIIlI[6] = (114 ^ 64) ^ (159 ^ 171);
        lIIllllllIIlI[7] = (45 ^ 65) ^ (98 ^ 9);
        lIIllllllIIlI[8] = (87 ^ 33) ^ (191 ^ 193);
        lIIllllllIIlI[9] = (211 ^ 129) ^ (35 ^ 120);
        lIIllllllIIlI[10] = 46 ^ 36;
        lIIllllllIIlI[11] = 186 ^ 177;
        lIIllllllIIlI[12] = (-((-24851) & 30715)) & (-24598) & 30719;
        lIIllllllIIlI[13] = (((84 + 21) - (-9)) + 32) ^ (((45 + 84) - 42) + 47);
        lIIllllllIIlI[14] = 169 ^ 165;
    }

    private static boolean lIllIllIIIlIIIl(int i) {
        return i == 0;
    }
}
