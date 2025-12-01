package gg.squire.plugins.skilling.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0001b;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
/* loaded from: squire-bank-stander-0.1.0.jar:gg/squire/plugins/skilling/overlay/InfoBox.class */
public class InfoBox extends OverlayPanel {
    private static /* synthetic */ String[] lllIlIlIIll;
    private final /* synthetic */ TaskManager n;
    private final /* synthetic */ SquireBankStander m;
    private static /* synthetic */ int[] lllIlIlIlII;
    private final /* synthetic */ BankStanderConfig o;

    private static String lIlIllllllIIll(String llllllllllllllllIIlIIlIlIIIIlIII, String llllllllllllllllIIlIIlIlIIIIIlll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIlIIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), lllIlIlIlII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIlIlII[3], llllllllllllllllIIlIIlIlIIIIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIlIIIIlIIl) {
            llllllllllllllllIIlIIlIlIIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIllllllIlII() {
        lllIlIlIIll = new String[lllIlIlIlII[0]];
        lllIlIlIIll[lllIlIlIlII[1]] = lIlIllllllIIIl("MjVHc2tFKsSJwB+S9bqAw2tqUjesrPAw", "Hdsme");
        lllIlIlIIll[lllIlIlIlII[2]] = lIlIllllllIIlI("IDEnEyofIXM=", "rDIgC");
        lllIlIlIIll[lllIlIlIlII[3]] = lIlIllllllIIlI("HwsfBwImAA==", "Inmtk");
        lllIlIlIIll[lllIlIlIlII[4]] = lIlIllllllIIIl("2LP1yVDKJKs=", "zRhsu");
        lllIlIlIIll[lllIlIlIlII[5]] = lIlIllllllIIIl("u0TIndDjIUM=", "MVrAg");
        lllIlIlIIll[lllIlIlIlII[6]] = lIlIllllllIIIl("3St0+1UPRaATkIhHJJxDrsUvWsDyKsKk", "UlDVh");
        lllIlIlIIll[lllIlIlIlII[7]] = lIlIllllllIIlI("DCQuK0EoNDdiQQ==", "KACXa");
        lllIlIlIIll[lllIlIlIlII[8]] = lIlIllllllIIll("5QoGbqhBkfwCYeXtBX90txtx2hBnj8T4", "lRXDS");
        lllIlIlIIll[lllIlIlIlII[9]] = lIlIllllllIIll("pppQrFA/5YTQGN/nHw+ByQ==", "WAeMI");
        lllIlIlIIll[lllIlIlIlII[10]] = lIlIllllllIIlI("KD89KgAbOSFuOBkpN24lHT9yBhoNP2hu", "xMRNu");
    }

    private static boolean lIlIllllllIllI(int i) {
        return i != 0;
    }

    private static boolean lIlIlllllllIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIlIllllllIIIl(String llllllllllllllllIIlIIlIIlllIIIll, String llllllllllllllllIIlIIlIIlllIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIIlllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIIlllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlIIlllIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlIIlllIIlIl.init(lllIlIlIlII[3], llllllllllllllllIIlIIlIIlllIIllI);
            return new String(llllllllllllllllIIlIIlIIlllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlIIlllIIlII) {
            llllllllllllllllIIlIIlIIlllIIlII.printStackTrace();
            return null;
        }
    }

    @Inject
    private InfoBox(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        this.m = squireBankStander;
        this.n = squireBankStander.getManager();
        this.o = bankStanderConfig;
        setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        lIlIllllllIlIl();
        lIlIllllllIlII();
    }

    private static boolean lIlIlllllllIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlllllllIIl(int i) {
        return i == 0;
    }

    public long d(int i) {
        Duration between = Duration.between(this.m.getStarted(), Instant.now());
        if (lIlIlllllllIIl(between.isZero() ? 1 : 0)) {
            return (int) ((i * Duration.ofHours(1L).toMillis()) / between.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (lIlIllllllIllI(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration between = Duration.between(this.m.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lllIlIlIlII[0], lllIlIlIlII[0], lllIlIlIlII[0], lllIlIlIlII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIlIIll[lllIlIlIlII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[2]]).right(Time.format(between)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[3]]).right(lllIlIlIIll[lllIlIlIlII[4]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[5]]).right(this.n.getCurrentTask()).build());
        "".length();
        if (lIlIllllllIlll(this.o.activity(), EnumC0001b.GLASS_MAKE)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[6]]).right(String.valueOf(this.m.b())).build());
            "".length();
        }
        if (lIlIllllllIlll(this.o.activity(), EnumC0001b.GLASS_BLOWING)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(this.o.glassProduct().name() + " made").right(String.valueOf(this.m.c())).build());
            "".length();
        }
        if (lIlIllllllIlll(this.o.activity(), EnumC0001b.GEM_CUTTING)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[7]]).right(String.valueOf(this.m.c())).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[8]]).right(String.valueOf(d(this.m.c()))).build());
            "".length();
        }
        if (!lIlIlllllllIII(this.o.activity(), EnumC0001b.SMITHING) || !lIlIlllllllIII(this.o.activity(), EnumC0001b.FLETCH_CUTTING) || lIlIllllllIlll(this.o.activity(), EnumC0001b.STRING_BOWS)) {
            this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[9]]).right(String.valueOf(this.m.c())).build());
            "".length();
            this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[10]]).right(String.valueOf(d(this.m.c()))).build());
            "".length();
        }
        this.panelComponent.setPreferredSize(new Dimension(lllIlIlIlII[11] + lllIlIlIlII[12], lllIlIlIlII[1]));
        return super.render(graphics2D);
    }

    private static boolean lIlIllllllIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIlIllllllIlIl() {
        lllIlIlIlII = new int[13];
        lllIlIlIlII[0] = (((33 + 18) - (-73)) + 4) ^ (((17 + 67) - 66) + 120);
        lllIlIlIlII[1] = (212 ^ 128) & ((117 ^ 33) ^ (-1));
        lllIlIlIlII[2] = " ".length();
        lllIlIlIlII[3] = "  ".length();
        lllIlIlIlII[4] = "   ".length();
        lllIlIlIlII[5] = 36 ^ 32;
        lllIlIlIlII[6] = (93 ^ 88) ^ ((32 ^ 24) & ((85 ^ 109) ^ (-1)));
        lllIlIlIlII[7] = 34 ^ 36;
        lllIlIlIlII[8] = (6 ^ 59) ^ (20 ^ 46);
        lllIlIlIlII[9] = 123 ^ 115;
        lllIlIlIlII[10] = (29 ^ 119) ^ (205 ^ 174);
        lllIlIlIlII[11] = (-((-2050) & 15367)) & (-17) & 13591;
        lllIlIlIlII[12] = 119 ^ 99;
    }

    private static String lIlIllllllIIlI(String llllllllllllllllIIlIIlIIlllllIII, String llllllllllllllllIIlIIlIIllllIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIlllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIIllllIllI = new StringBuilder();
        char[] llllllllllllllllIIlIIlIIllllIlIl = llllllllllllllllIIlIIlIIllllIlll.toCharArray();
        int llllllllllllllllIIlIIlIIllllIlII = lllIlIlIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIlIlIlII[1];
        while (lIlIlllllllIlI(i, length)) {
            llllllllllllllllIIlIIlIIllllIllI.append((char) (charArray[i] ^ llllllllllllllllIIlIIlIIllllIlIl[llllllllllllllllIIlIIlIIllllIlII % llllllllllllllllIIlIIlIIllllIlIl.length]));
            "".length();
            llllllllllllllllIIlIIlIIllllIlII++;
            i++;
            "".length();
            if ((-(34 ^ 38)) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIIlIIllllIllI);
    }
}
