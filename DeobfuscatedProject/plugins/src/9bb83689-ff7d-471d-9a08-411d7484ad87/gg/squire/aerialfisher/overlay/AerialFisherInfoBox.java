/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.aerialfisher.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.aerialfisher.SquireAerialFisher;
import i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.a;
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
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class AerialFisherInfoBox
extends OverlayPanel {
    private final /* synthetic */ SquireAerialFisher h;
    private static /* synthetic */ String[] lIlIlllIllI;
    private final /* synthetic */ a i;
    private static /* synthetic */ int[] lIlIlllIlll;

    private static boolean lIIlIlIIIIlIlI(int n, int n2) {
        return n < n2;
    }

    static {
        AerialFisherInfoBox.lIIlIlIIIIIlll();
        AerialFisherInfoBox.lIIlIlIIIIIllI();
    }

    private static boolean lIIlIlIIIIlIIl(int n) {
        return n == 0;
    }

    private static String lIIlIlIIIIIlIl(String llllllllllllllllIlIlIllIllllIIII, String llllllllllllllllIlIlIllIlllIllIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIllIllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIllIlllIllIl.getBytes(StandardCharsets.UTF_8)), lIlIlllIlll[11]), "DES");
            Cipher llllllllllllllllIlIlIllIllllIIlI = Cipher.getInstance("DES");
            llllllllllllllllIlIlIllIllllIIlI.init(lIlIlllIlll[5], llllllllllllllllIlIlIllIllllIIll);
            return new String(llllllllllllllllIlIlIllIllllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIllIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIllIllllIIIl) {
            llllllllllllllllIlIlIllIllllIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public AerialFisherInfoBox(SquireAerialFisher squireAerialFisher, a a2) {
        this.h = squireAerialFisher;
        this.i = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIlIlIIIIIlII(String llllllllllllllllIlIlIllIllIllIll, String llllllllllllllllIlIlIllIllIllIlI) {
        llllllllllllllllIlIlIllIllIllIll = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIllIllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIllIllIllllI = new StringBuilder();
        char[] llllllllllllllllIlIlIllIllIlllIl = llllllllllllllllIlIlIllIllIllIlI.toCharArray();
        int llllllllllllllllIlIlIllIllIlllII = lIlIlllIlll[1];
        char[] llllllllllllllllIlIlIllIllIlIllI = llllllllllllllllIlIlIllIllIllIll.toCharArray();
        int llllllllllllllllIlIlIllIllIlIlIl = llllllllllllllllIlIlIllIllIlIllI.length;
        int llllllllllllllllIlIlIllIllIlIlII = lIlIlllIlll[1];
        while (AerialFisherInfoBox.lIIlIlIIIIlIlI(llllllllllllllllIlIlIllIllIlIlII, llllllllllllllllIlIlIllIllIlIlIl)) {
            char llllllllllllllllIlIlIllIlllIIIIl = llllllllllllllllIlIlIllIllIlIllI[llllllllllllllllIlIlIllIllIlIlII];
            llllllllllllllllIlIlIllIllIllllI.append((char)(llllllllllllllllIlIlIllIlllIIIIl ^ llllllllllllllllIlIlIllIllIlllIl[llllllllllllllllIlIlIllIllIlllII % llllllllllllllllIlIlIllIllIlllIl.length]));
            "".length();
            ++llllllllllllllllIlIlIllIllIlllII;
            ++llllllllllllllllIlIlIllIllIlIlII;
            "".length();
            if (" ".length() != (0xD9 ^ 0x88 ^ (0x48 ^ 0x1D))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIllIllIllllI);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (AerialFisherInfoBox.lIIlIlIIIIlIII(this.h.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIlllIlll[0], lIlIlllIlll[0], lIlIlllIlll[0], lIlIlllIlll[0]));
        String string = lIlIlllIllI[lIlIlllIlll[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        "".length();
        int n = lIlIlllIlll[2];
        this.panelComponent.setPreferredSize(new Dimension(n + lIlIlllIlll[3], lIlIlllIlll[1]));
        Duration duration = Duration.between(this.h.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[4]]).right(Time.format((Duration)duration)).build());
        "".length();
        int n2 = (int)this.a(this.i.b());
        Object[] objectArray = new Object[lIlIlllIlll[5]];
        objectArray[AerialFisherInfoBox.lIlIlllIlll[1]] = this.i.b();
        objectArray[AerialFisherInfoBox.lIlIlllIlll[4]] = n2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[5]]).right(String.format(lIlIlllIllI[lIlIlllIlll[6]], objectArray)).build());
        "".length();
        int n3 = (int)this.a(this.i.c());
        Object[] objectArray2 = new Object[lIlIlllIlll[5]];
        objectArray2[AerialFisherInfoBox.lIlIlllIlll[1]] = this.i.c();
        objectArray2[AerialFisherInfoBox.lIlIlllIlll[4]] = n3;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[7]]).right(String.format(lIlIlllIllI[lIlIlllIlll[8]], objectArray2)).build());
        "".length();
        int n4 = (int)this.a(this.i.d());
        Object[] objectArray3 = new Object[lIlIlllIlll[5]];
        objectArray3[AerialFisherInfoBox.lIlIlllIlll[1]] = this.i.d();
        objectArray3[AerialFisherInfoBox.lIlIlllIlll[4]] = n4;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIllI[lIlIlllIlll[9]]).right(String.format(lIlIlllIllI[lIlIlllIlll[10]], objectArray3)).build());
        "".length();
        return super.render(graphics2D);
    }

    private static void lIIlIlIIIIIlll() {
        lIlIlllIlll = new int[12];
        AerialFisherInfoBox.lIlIlllIlll[0] = 136 + 141 - 203 + 127 ^ 1 + 153 - 56 + 97;
        AerialFisherInfoBox.lIlIlllIlll[1] = "   ".length() & ("   ".length() ^ -" ".length());
        AerialFisherInfoBox.lIlIlllIlll[2] = (0x56 ^ 0x3C) + (107 + 80 - 45 + 5) - (0x55 ^ 0x18) + (0x14 ^ 5);
        AerialFisherInfoBox.lIlIlllIlll[3] = 0x56 ^ 0x42;
        AerialFisherInfoBox.lIlIlllIlll[4] = " ".length();
        AerialFisherInfoBox.lIlIlllIlll[5] = "  ".length();
        AerialFisherInfoBox.lIlIlllIlll[6] = "   ".length();
        AerialFisherInfoBox.lIlIlllIlll[7] = 46 + 34 - -64 + 27 ^ 124 + 142 - 197 + 106;
        AerialFisherInfoBox.lIlIlllIlll[8] = 0x1A ^ 0x1F;
        AerialFisherInfoBox.lIlIlllIlll[9] = 0x31 ^ 0x37;
        AerialFisherInfoBox.lIlIlllIlll[10] = 9 ^ 0x6D ^ (0xFE ^ 0x9D);
        AerialFisherInfoBox.lIlIlllIlll[11] = 0x17 ^ 0x1F;
    }

    public long a(int n) {
        Duration duration = Duration.between(this.h.getStarted(), Instant.now());
        if (AerialFisherInfoBox.lIIlIlIIIIlIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIlIlIIIIlIII(int n) {
        return n != 0;
    }

    private static String lIIlIlIIIIIIll(String llllllllllllllllIlIlIllIllllllIl, String llllllllllllllllIlIlIllIlllllIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlllIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIllIlllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIllIllllllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIllIllllllll.init(lIlIlllIlll[5], llllllllllllllllIlIlIlllIIIIIIII);
            return new String(llllllllllllllllIlIlIllIllllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIllIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIllIlllllllI) {
            llllllllllllllllIlIlIllIlllllllI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIIIIllI() {
        lIlIlllIllI = new String[lIlIlllIlll[11]];
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[1]] = AerialFisherInfoBox.lIIlIlIIIIIIll("Sh1/sr2ISIwFUcg8mj70q9zYRB73L47w", "wzyiT");
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[4]] = AerialFisherInfoBox.lIIlIlIIIIIlII("IwMKLiYcE14=", "qvdZO");
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[5]] = AerialFisherInfoBox.lIIlIlIIIIIIll("Lv/5dNGhhy8bL7gybImTPg==", "faHki");
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[6]] = AerialFisherInfoBox.lIIlIlIIIIIlII("YShMW1EgYwRa", "DLlst");
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[7]] = AerialFisherInfoBox.lIIlIlIIIIIlIl("ePbQ7sbkJjqUToCnQo3w7Q==", "bGYRk");
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[8]] = AerialFisherInfoBox.lIIlIlIIIIIlIl("Sb1WyB22334947k3LpAj3Q==", "PqdBX");
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[9]] = AerialFisherInfoBox.lIIlIlIIIIIlIl("20EJh5o9avLl8kUNKirKcw==", "BFVFt");
        AerialFisherInfoBox.lIlIlllIllI[AerialFisherInfoBox.lIlIlllIlll[10]] = AerialFisherInfoBox.lIIlIlIIIIIlII("UxNKSmkSWAJL", "vwjbL");
    }
}

