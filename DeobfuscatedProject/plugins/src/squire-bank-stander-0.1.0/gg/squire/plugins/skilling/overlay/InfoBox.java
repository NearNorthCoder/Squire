/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
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
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class InfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] lllIlIlIIll;
    private final /* synthetic */ TaskManager n;
    private final /* synthetic */ SquireBankStander m;
    private static /* synthetic */ int[] lllIlIlIlII;
    private final /* synthetic */ BankStanderConfig o;

    private static String lIlIllllllIIll(String llllllllllllllllIIlIIlIlIIIIlIII, String llllllllllllllllIIlIIlIlIIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIlIIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), lllIlIlIlII[9]), "DES");
            Cipher llllllllllllllllIIlIIlIlIIIIlIlI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlIlIIIIlIlI.init(lllIlIlIlII[3], llllllllllllllllIIlIIlIlIIIIlIll);
            return new String(llllllllllllllllIIlIIlIlIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIlIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIlIIIIlIIl) {
            llllllllllllllllIIlIIlIlIIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIllllllIlII() {
        lllIlIlIIll = new String[lllIlIlIlII[0]];
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[1]] = InfoBox.lIlIllllllIIIl("MjVHc2tFKsSJwB+S9bqAw2tqUjesrPAw", "Hdsme");
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[2]] = InfoBox.lIlIllllllIIlI("IDEnEyofIXM=", "rDIgC");
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[3]] = InfoBox.lIlIllllllIIlI("HwsfBwImAA==", "Inmtk");
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[4]] = InfoBox.lIlIllllllIIIl("2LP1yVDKJKs=", "zRhsu");
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[5]] = InfoBox.lIlIllllllIIIl("u0TIndDjIUM=", "MVrAg");
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[6]] = InfoBox.lIlIllllllIIIl("3St0+1UPRaATkIhHJJxDrsUvWsDyKsKk", "UlDVh");
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[7]] = InfoBox.lIlIllllllIIlI("DCQuK0EoNDdiQQ==", "KACXa");
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[8]] = InfoBox.lIlIllllllIIll("5QoGbqhBkfwCYeXtBX90txtx2hBnj8T4", "lRXDS");
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[9]] = InfoBox.lIlIllllllIIll("pppQrFA/5YTQGN/nHw+ByQ==", "WAeMI");
        InfoBox.lllIlIlIIll[InfoBox.lllIlIlIlII[10]] = InfoBox.lIlIllllllIIlI("KD89KgAbOSFuOBkpN24lHT9yBhoNP2hu", "xMRNu");
    }

    private static boolean lIlIllllllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllllllIII(Object object, Object object2) {
        return object != object2;
    }

    private static String lIlIllllllIIIl(String llllllllllllllllIIlIIlIIlllIIIll, String llllllllllllllllIIlIIlIIlllIIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlIIlllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlIIlllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlIIlllIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlIIlllIIlIl.init(lllIlIlIlII[3], llllllllllllllllIIlIIlIIlllIIllI);
            return new String(llllllllllllllllIIlIIlIIlllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlIIlllIIlII) {
            llllllllllllllllIIlIIlIIlllIIlII.printStackTrace();
            return null;
        }
    }

    @Inject
    private InfoBox(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        this.m = squireBankStander;
        this.n = squireBankStander.getManager();
        this.o = bankStanderConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    static {
        InfoBox.lIlIllllllIlIl();
        InfoBox.lIlIllllllIlII();
    }

    private static boolean lIlIlllllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllllllIIl(int n2) {
        return n2 == 0;
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        if (InfoBox.lIlIlllllllIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox llllllllllllllllIIlIIlIlIIIllIIl;
        if (InfoBox.lIlIllllllIllI(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration llllllllllllllllIIlIIlIlIIIlIlll = Duration.between(llllllllllllllllIIlIIlIlIIIllIIl.m.getStarted(), Instant.now());
        llllllllllllllllIIlIIlIlIIIllIIl.panelComponent.setBorder(new Rectangle(lllIlIlIlII[0], lllIlIlIlII[0], lllIlIlIlII[0], lllIlIlIlII[0]));
        llllllllllllllllIIlIIlIlIIIllIIl.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIlIIll[lllIlIlIlII[1]]).build());
        "".length();
        llllllllllllllllIIlIIlIlIIIllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[2]]).right(Time.format((Duration)llllllllllllllllIIlIIlIlIIIlIlll)).build());
        "".length();
        llllllllllllllllIIlIIlIlIIIllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[3]]).right(lllIlIlIIll[lllIlIlIlII[4]]).build());
        "".length();
        llllllllllllllllIIlIIlIlIIIllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[5]]).right(llllllllllllllllIIlIIlIlIIIllIIl.n.getCurrentTask()).build());
        "".length();
        if (InfoBox.lIlIllllllIlll((Object)llllllllllllllllIIlIIlIlIIIllIIl.o.activity(), (Object)b.GLASS_MAKE)) {
            llllllllllllllllIIlIIlIlIIIllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[6]]).right(String.valueOf(llllllllllllllllIIlIIlIlIIIllIIl.m.b())).build());
            "".length();
        }
        if (InfoBox.lIlIllllllIlll((Object)llllllllllllllllIIlIIlIlIIIllIIl.o.activity(), (Object)b.GLASS_BLOWING)) {
            llllllllllllllllIIlIIlIlIIIllIIl.panelComponent.getChildren().add(LineComponent.builder().left(llllllllllllllllIIlIIlIlIIIllIIl.o.glassProduct().name() + " made").right(String.valueOf(llllllllllllllllIIlIIlIlIIIllIIl.m.c())).build());
            "".length();
        }
        if (InfoBox.lIlIllllllIlll((Object)llllllllllllllllIIlIIlIlIIIllIIl.o.activity(), (Object)b.GEM_CUTTING)) {
            llllllllllllllllIIlIIlIlIIIllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[7]]).right(String.valueOf(llllllllllllllllIIlIIlIlIIIllIIl.m.c())).build());
            "".length();
            llllllllllllllllIIlIIlIlIIIllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[8]]).right(String.valueOf(llllllllllllllllIIlIIlIlIIIllIIl.d(llllllllllllllllIIlIIlIlIIIllIIl.m.c()))).build());
            "".length();
        }
        if (!InfoBox.lIlIlllllllIII((Object)llllllllllllllllIIlIIlIlIIIllIIl.o.activity(), (Object)b.SMITHING) || !InfoBox.lIlIlllllllIII((Object)llllllllllllllllIIlIIlIlIIIllIIl.o.activity(), (Object)b.FLETCH_CUTTING) || InfoBox.lIlIllllllIlll((Object)llllllllllllllllIIlIIlIlIIIllIIl.o.activity(), (Object)b.STRING_BOWS)) {
            llllllllllllllllIIlIIlIlIIIllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[9]]).right(String.valueOf(llllllllllllllllIIlIIlIlIIIllIIl.m.c())).build());
            "".length();
            llllllllllllllllIIlIIlIlIIIllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIIll[lllIlIlIlII[10]]).right(String.valueOf(llllllllllllllllIIlIIlIlIIIllIIl.d(llllllllllllllllIIlIIlIlIIIllIIl.m.c()))).build());
            "".length();
        }
        int n2 = lllIlIlIlII[11];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIlIlIlII[12], lllIlIlIlII[1]));
        return super.render(graphics2D);
    }

    private static boolean lIlIllllllIlll(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIllllllIlIl() {
        lllIlIlIlII = new int[13];
        InfoBox.lllIlIlIlII[0] = 33 + 18 - -73 + 4 ^ 17 + 67 - 66 + 120;
        InfoBox.lllIlIlIlII[1] = (0xD4 ^ 0x80) & ~(0x75 ^ 0x21);
        InfoBox.lllIlIlIlII[2] = " ".length();
        InfoBox.lllIlIlIlII[3] = "  ".length();
        InfoBox.lllIlIlIlII[4] = "   ".length();
        InfoBox.lllIlIlIlII[5] = 0x24 ^ 0x20;
        InfoBox.lllIlIlIlII[6] = 0x5D ^ 0x58 ^ (0x20 ^ 0x18) & ~(0x55 ^ 0x6D);
        InfoBox.lllIlIlIlII[7] = 0x22 ^ 0x24;
        InfoBox.lllIlIlIlII[8] = 6 ^ 0x3B ^ (0x14 ^ 0x2E);
        InfoBox.lllIlIlIlII[9] = 0x7B ^ 0x73;
        InfoBox.lllIlIlIlII[10] = 0x1D ^ 0x77 ^ (0xCD ^ 0xAE);
        InfoBox.lllIlIlIlII[11] = -(0xFFFFF7FE & 0x3C07) & (0xFFFFFFEF & 0x3517);
        InfoBox.lllIlIlIlII[12] = 0x77 ^ 0x63;
    }

    private static String lIlIllllllIIlI(String llllllllllllllllIIlIIlIIlllllIII, String llllllllllllllllIIlIIlIIllllIlll) {
        llllllllllllllllIIlIIlIIlllllIII = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIlllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIIllllIllI = new StringBuilder();
        char[] llllllllllllllllIIlIIlIIllllIlIl = llllllllllllllllIIlIIlIIllllIlll.toCharArray();
        int llllllllllllllllIIlIIlIIllllIlII = lllIlIlIlII[1];
        char[] llllllllllllllllIIlIIlIIlllIlllI = llllllllllllllllIIlIIlIIlllllIII.toCharArray();
        int llllllllllllllllIIlIIlIIlllIllIl = llllllllllllllllIIlIIlIIlllIlllI.length;
        int llllllllllllllllIIlIIlIIlllIllII = lllIlIlIlII[1];
        while (InfoBox.lIlIlllllllIlI(llllllllllllllllIIlIIlIIlllIllII, llllllllllllllllIIlIIlIIlllIllIl)) {
            char llllllllllllllllIIlIIlIIlllllIIl = llllllllllllllllIIlIIlIIlllIlllI[llllllllllllllllIIlIIlIIlllIllII];
            llllllllllllllllIIlIIlIIllllIllI.append((char)(llllllllllllllllIIlIIlIIlllllIIl ^ llllllllllllllllIIlIIlIIllllIlIl[llllllllllllllllIIlIIlIIllllIlII % llllllllllllllllIIlIIlIIllllIlIl.length]));
            "".length();
            ++llllllllllllllllIIlIIlIIllllIlII;
            ++llllllllllllllllIIlIIlIIlllIllII;
            "".length();
            if (-(0x22 ^ 0x26) < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIlIIllllIllI);
    }
}

