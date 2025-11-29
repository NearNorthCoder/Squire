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
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
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
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i;

public class TitheInfoBox
extends OverlayPanel {
    private final /* synthetic */ i x;
    private final /* synthetic */ TaskManager w;
    private static /* synthetic */ int[] lIIllllllIIlI;
    private static /* synthetic */ String[] lIIlllllIllll;
    private final /* synthetic */ SquireTitheFarm v;

    public long e(int n2) {
        Duration duration = Duration.between(this.v.getStarted(), Instant.now());
        if (TitheInfoBox.lIllIllIIIlIIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static String lIllIllIIIIIIlI(String llllllllllllllIlllIIlIlllIlIIlIl, String llllllllllllllIlllIIlIlllIlIIlII) {
        llllllllllllllIlllIIlIlllIlIIlIl = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIlllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIlllIlIIIll = new StringBuilder();
        char[] llllllllllllllIlllIIlIlllIlIIIlI = llllllllllllllIlllIIlIlllIlIIlII.toCharArray();
        int llllllllllllllIlllIIlIlllIlIIIIl = lIIllllllIIlI[0];
        char[] llllllllllllllIlllIIlIlllIIllIll = llllllllllllllIlllIIlIlllIlIIlIl.toCharArray();
        int llllllllllllllIlllIIlIlllIIllIlI = llllllllllllllIlllIIlIlllIIllIll.length;
        int llllllllllllllIlllIIlIlllIIllIIl = lIIllllllIIlI[0];
        while (TitheInfoBox.lIllIllIIIlIIII(llllllllllllllIlllIIlIlllIIllIIl, llllllllllllllIlllIIlIlllIIllIlI)) {
            char llllllllllllllIlllIIlIlllIlIIllI = llllllllllllllIlllIIlIlllIIllIll[llllllllllllllIlllIIlIlllIIllIIl];
            llllllllllllllIlllIIlIlllIlIIIll.append((char)(llllllllllllllIlllIIlIlllIlIIllI ^ llllllllllllllIlllIIlIlllIlIIIlI[llllllllllllllIlllIIlIlllIlIIIIl % llllllllllllllIlllIIlIlllIlIIIlI.length]));
            "".length();
            ++llllllllllllllIlllIIlIlllIlIIIIl;
            ++llllllllllllllIlllIIlIlllIIllIIl;
            "".length();
            if (-(159 + 46 - 80 + 41 ^ 102 + 81 - 113 + 92) <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIlllIlIIIll);
    }

    private static void lIllIllIIIIIlII() {
        lIIlllllIllll = new String[lIIllllllIIlI[14]];
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[0]] = TitheInfoBox.lIllIllIIIIIIIl("Vxlc3xEQI176CCIbkNEu3M+X2AULjS7s", "ECUDn");
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[1]] = TitheInfoBox.lIllIllIIIIIIlI("MDM3JisPIw==", "bFYRB");
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[2]] = TitheInfoBox.lIllIllIIIIIIll("odlXrvx9ODg=", "mgOsW");
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[3]] = TitheInfoBox.lIllIllIIIIIIIl("ZEpY5KTksHA=", "WkdTL");
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[4]] = TitheInfoBox.lIllIllIIIIIIll("yLDObvSKT44=", "ZIxPP");
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[5]] = TitheInfoBox.lIllIllIIIIIIll("H6HQ3ms+9j1RC2+nP0YORg==", "zxSry");
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[6]] = TitheInfoBox.lIllIllIIIIIIll("XNqJgEw/N/CL12ZOditlGJWDD+XPc0RQ", "GGONN");
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[7]] = TitheInfoBox.lIllIllIIIIIIIl("czk4RgRd7b6Kkhb5qkDxZQ==", "hEhdW");
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[8]] = TitheInfoBox.lIllIllIIIIIIll("QEWrytSGqddKa/jn5v8LaRJWZLjKxHfp", "zaNjY");
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[9]] = TitheInfoBox.lIllIllIIIIIIll("VXGJgEA2gkQEU3ZyPdp3qvsI7RfAyQ+4", "DfCCf");
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[10]] = TitheInfoBox.lIllIllIIIIIIll("HzwEN0n4eJny6FHOplMbLde4y150or4kegsJ3UeruWc=", "zHQzM");
        TitheInfoBox.lIIlllllIllll[TitheInfoBox.lIIllllllIIlI[11]] = TitheInfoBox.lIllIllIIIIIIlI("ICok", "yOWHy");
    }

    private static boolean lIllIllIIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        TitheInfoBox.lIllIllIIIIlllI();
        TitheInfoBox.lIllIllIIIIIlII();
    }

    private static String lIllIllIIIIIIll(String llllllllllllllIlllIIlIlllIIlIIII, String llllllllllllllIlllIIlIlllIIIllll) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlllIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlllIIIllll.getBytes(StandardCharsets.UTF_8)), lIIllllllIIlI[8]), "DES");
            Cipher llllllllllllllIlllIIlIlllIIlIIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIIlIlllIIlIIlI.init(lIIllllllIIlI[2], llllllllllllllIlllIIlIlllIIlIIll);
            return new String(llllllllllllllIlllIIlIlllIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlllIIlIIIl) {
            llllllllllllllIlllIIlIlllIIlIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    private TitheInfoBox(SquireTitheFarm squireTitheFarm, i i2) {
        this.v = squireTitheFarm;
        this.w = squireTitheFarm.getManager();
        this.x = i2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIllIIIIllll(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        TitheInfoBox llllllllllllllIlllIIlIlllIlllIIl;
        if (TitheInfoBox.lIllIllIIIIllll(this.v.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration llllllllllllllIlllIIlIlllIllIlll = Duration.between(llllllllllllllIlllIIlIlllIlllIIl.v.getStarted(), Instant.now());
        llllllllllllllIlllIIlIlllIlllIIl.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllllIllll[lIIllllllIIlI[0]]).build());
        "".length();
        llllllllllllllIlllIIlIlllIlllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[1]]).right(Time.format((Duration)llllllllllllllIlllIIlIlllIllIlll)).build());
        "".length();
        llllllllllllllIlllIIlIlllIlllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[2]]).right(lIIlllllIllll[lIIllllllIIlI[3]]).build());
        "".length();
        llllllllllllllIlllIIlIlllIlllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[4]]).right(llllllllllllllIlllIIlIlllIlllIIl.w.getCurrentTask()).build());
        "".length();
        llllllllllllllIlllIIlIlllIlllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[5]]).right(String.valueOf(llllllllllllllIlllIIlIlllIlllIIl.v.a())).build());
        "".length();
        llllllllllllllIlllIIlIlllIlllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[6]]).right(String.valueOf(llllllllllllllIlllIIlIlllIlllIIl.e(llllllllllllllIlllIIlIlllIlllIIl.v.a()))).build());
        "".length();
        llllllllllllllIlllIIlIlllIlllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[7]]).right(String.valueOf(llllllllllllllIlllIIlIlllIlllIIl.x.q())).build());
        "".length();
        llllllllllllllIlllIIlIlllIlllIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[8]]).right(String.valueOf(llllllllllllllIlllIIlIlllIlllIIl.x.v())).build());
        "".length();
        List list = llllllllllllllIlllIIlIlllIlllIIl.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lIIlllllIllll[lIIllllllIIlI[9]]);
        if (TitheInfoBox.lIllIllIIIlIIII(llllllllllllllIlllIIlIlllIlllIIl.x.v(), lIIllllllIIlI[4] * llllllllllllllIlllIIlIlllIlllIIl.x.u())) {
            string = lIIlllllIllll[lIIllllllIIlI[10]];
            "".length();
            if (((0xE2 ^ 0xC6) & ~(0x65 ^ 0x41)) != ((0x78 ^ 0x49) & ~(0xA1 ^ 0x90))) {
                return null;
            }
        } else {
            string = lIIlllllIllll[lIIllllllIIlI[11]];
        }
        list.add(lineComponentBuilder.right(string).build());
        "".length();
        int n2 = lIIllllllIIlI[12];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIllllllIIlI[13], lIIllllllIIlI[0]));
        return super.render(graphics2D);
    }

    private static String lIllIllIIIIIIIl(String llllllllllllllIlllIIlIlllIIIIIIl, String llllllllllllllIlllIIlIlllIIIIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIlllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlllIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlllIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlllIIIIlIl.init(lIIllllllIIlI[2], llllllllllllllIlllIIlIlllIIIIllI);
            return new String(llllllllllllllIlllIIlIlllIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIlllIIIIlII) {
            llllllllllllllIlllIIlIlllIIIIlII.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIIIIlllI() {
        lIIllllllIIlI = new int[15];
        TitheInfoBox.lIIllllllIIlI[0] = (0x62 ^ 1) & ~(0xD9 ^ 0xBA);
        TitheInfoBox.lIIllllllIIlI[1] = " ".length();
        TitheInfoBox.lIIllllllIIlI[2] = "  ".length();
        TitheInfoBox.lIIllllllIIlI[3] = "   ".length();
        TitheInfoBox.lIIllllllIIlI[4] = 0x2C ^ 0x28;
        TitheInfoBox.lIIllllllIIlI[5] = 0x1E ^ 0x7B ^ (0x2B ^ 0x4B);
        TitheInfoBox.lIIllllllIIlI[6] = 0x72 ^ 0x40 ^ (0x9F ^ 0xAB);
        TitheInfoBox.lIIllllllIIlI[7] = 0x2D ^ 0x41 ^ (0x62 ^ 9);
        TitheInfoBox.lIIllllllIIlI[8] = 0x57 ^ 0x21 ^ (0xBF ^ 0xC1);
        TitheInfoBox.lIIllllllIIlI[9] = 0xD3 ^ 0x81 ^ (0x23 ^ 0x78);
        TitheInfoBox.lIIllllllIIlI[10] = 0x2E ^ 0x24;
        TitheInfoBox.lIIllllllIIlI[11] = 0xBA ^ 0xB1;
        TitheInfoBox.lIIllllllIIlI[12] = -(0xFFFF9EED & 0x77FB) & (0xFFFF9FEA & 0x77FF);
        TitheInfoBox.lIIllllllIIlI[13] = 84 + 21 - -9 + 32 ^ 45 + 84 - 42 + 47;
        TitheInfoBox.lIIllllllIIlI[14] = 0xA9 ^ 0xA5;
    }

    private static boolean lIllIllIIIlIIIl(int n2) {
        return n2 == 0;
    }
}

