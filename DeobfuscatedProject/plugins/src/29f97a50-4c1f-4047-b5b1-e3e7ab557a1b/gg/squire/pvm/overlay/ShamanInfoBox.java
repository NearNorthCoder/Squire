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
package gg.squire.pvm.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.pvm.SquireShamansPlugin;
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
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.a;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

public class ShamanInfoBox
extends OverlayPanel {
    private static /* synthetic */ int[] lIIllIIIIIIII;
    private final /* synthetic */ c L;
    private final /* synthetic */ TaskManager K;
    private final /* synthetic */ SquireShamansPlugin J;
    private static /* synthetic */ String[] lIIlIllllllll;
    private /* synthetic */ a M;

    @Inject
    private ShamanInfoBox(SquireShamansPlugin squireShamansPlugin, c c2, a a2) {
        this.J = squireShamansPlugin;
        this.K = squireShamansPlugin.getManager();
        this.L = c2;
        this.M = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIlIlllIIlIllII(String llllllllllllllIllllIIllIlIIIIIll, String llllllllllllllIllllIIllIlIIIIlII) {
        try {
            SecretKeySpec llllllllllllllIllllIIllIlIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllIlIIIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIIIIIIII[11]), "DES");
            Cipher llllllllllllllIllllIIllIlIIIIlll = Cipher.getInstance("DES");
            llllllllllllllIllllIIllIlIIIIlll.init(lIIllIIIIIIII[3], llllllllllllllIllllIIllIlIIIlIII);
            return new String(llllllllllllllIllllIIllIlIIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIllIlIIIIllI) {
            llllllllllllllIllllIIllIlIIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIllIIIl(int n2) {
        return n2 != 0;
    }

    private static String lIlIlllIIlIllIl(String llllllllllllllIllllIIllIlIIlIIII, String llllllllllllllIllllIIllIlIIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIllIlIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIllIlIIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIllIlIIlIlII.init(lIIllIIIIIIII[3], llllllllllllllIllllIIllIlIIlIlIl);
            return new String(llllllllllllllIllllIIllIlIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIllIlIIlIIll) {
            llllllllllllllIllllIIllIlIIlIIll.printStackTrace();
            return null;
        }
    }

    public long c(int n2) {
        Duration duration = Duration.between(this.J.getStarted(), Instant.now());
        if (ShamanInfoBox.lIlIlllIIllIIlI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    static {
        ShamanInfoBox.lIlIlllIIllIIII();
        ShamanInfoBox.lIlIlllIIlIllll();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (ShamanInfoBox.lIlIlllIIllIIIl(this.J.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.J.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lIIllIIIIIIII[0], lIIllIIIIIIII[0], lIIllIIIIIIII[0], lIIllIIIIIIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlIllllllll[lIIllIIIIIIII[1]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[2]]).right(lIIlIllllllll[lIIllIIIIIIII[3]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[4]]).right(Time.format((Duration)duration)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[5]]).right(this.K.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[6]]).right(String.valueOf(this.M.m())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[7]]).right(String.valueOf(this.J.a())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlIllllllll[lIIllIIIIIIII[8]]).right("" + this.c(this.J.a())).build());
        "".length();
        int n2 = lIIllIIIIIIII[9];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIllIIIIIIII[10], lIIllIIIIIIII[1]));
        return super.render(graphics2D);
    }

    private static String lIlIlllIIlIlllI(String llllllllllllllIllllIIllIIlllIIII, String llllllllllllllIllllIIllIIlllIlII) {
        llllllllllllllIllllIIllIIlllIIII = new String(Base64.getDecoder().decode(llllllllllllllIllllIIllIIlllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIllIIlllIIll = new StringBuilder();
        char[] llllllllllllllIllllIIllIIlllIIlI = llllllllllllllIllllIIllIIlllIlII.toCharArray();
        int llllllllllllllIllllIIllIIlllIIIl = lIIllIIIIIIII[1];
        char[] llllllllllllllIllllIIllIIllIlIll = llllllllllllllIllllIIllIIlllIIII.toCharArray();
        int llllllllllllllIllllIIllIIllIlIlI = llllllllllllllIllllIIllIIllIlIll.length;
        int llllllllllllllIllllIIllIIllIlIIl = lIIllIIIIIIII[1];
        while (ShamanInfoBox.lIlIlllIIllIIll(llllllllllllllIllllIIllIIllIlIIl, llllllllllllllIllllIIllIIllIlIlI)) {
            char llllllllllllllIllllIIllIIlllIllI = llllllllllllllIllllIIllIIllIlIll[llllllllllllllIllllIIllIIllIlIIl];
            llllllllllllllIllllIIllIIlllIIll.append((char)(llllllllllllllIllllIIllIIlllIllI ^ llllllllllllllIllllIIllIIlllIIlI[llllllllllllllIllllIIllIIlllIIIl % llllllllllllllIllllIIllIIlllIIlI.length]));
            "".length();
            ++llllllllllllllIllllIIllIIlllIIIl;
            ++llllllllllllllIllllIIllIIllIlIIl;
            "".length();
            if ((21 + 95 - 4 + 19 ^ 15 + 85 - 59 + 94) > ((159 + 152 - 303 + 200 ^ 106 + 105 - 204 + 151) & (0x68 ^ 0x2C ^ (2 ^ 8) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIllIIlllIIll);
    }

    private static boolean lIlIlllIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlllIIlIllll() {
        lIIlIllllllll = new String[lIIllIIIIIIII[11]];
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[1]] = ShamanInfoBox.lIlIlllIIlIllII("9XblA7cyKJOJPSr89qnApQ==", "XZqnA");
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[2]] = ShamanInfoBox.lIlIlllIIlIllIl("RaLu2J3QzTM=", "mmysr");
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[3]] = ShamanInfoBox.lIlIlllIIlIllII("vD0oCawDR/w=", "jamRN");
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[4]] = ShamanInfoBox.lIlIlllIIlIllII("VIIxyBZciVk=", "oEpgQ");
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[5]] = ShamanInfoBox.lIlIlllIIlIllII("Z2p4M8UoJlI=", "NLtMl");
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[6]] = ShamanInfoBox.lIlIlllIIlIllIl("aRsjXlM6/dNyU6WFPsks6A==", "OiGvl");
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[7]] = ShamanInfoBox.lIlIlllIIlIlllI("OzsKCSM=", "pRfeP");
        ShamanInfoBox.lIIlIllllllll[ShamanInfoBox.lIIllIIIIIIII[8]] = ShamanInfoBox.lIlIlllIIlIllII("8GEY0JfFfpYGmHizHdhQbg==", "NAIzQ");
    }

    private static void lIlIlllIIllIIII() {
        lIIllIIIIIIII = new int[12];
        ShamanInfoBox.lIIllIIIIIIII[0] = 0x30 ^ 0x3A;
        ShamanInfoBox.lIIllIIIIIIII[1] = (27 + 65 - -47 + 58 ^ 24 + 75 - 49 + 87) & (0x6C ^ 0x3B ^ (0x33 ^ 0x28) ^ -" ".length());
        ShamanInfoBox.lIIllIIIIIIII[2] = " ".length();
        ShamanInfoBox.lIIllIIIIIIII[3] = "  ".length();
        ShamanInfoBox.lIIllIIIIIIII[4] = "   ".length();
        ShamanInfoBox.lIIllIIIIIIII[5] = 9 + 109 - -74 + 3 ^ 71 + 11 - 3 + 120;
        ShamanInfoBox.lIIllIIIIIIII[6] = 0xAE ^ 0xAB;
        ShamanInfoBox.lIIllIIIIIIII[7] = 0x69 ^ 0x6F;
        ShamanInfoBox.lIIllIIIIIIII[8] = 12 + 45 - -5 + 99 ^ 64 + 65 - 51 + 88;
        ShamanInfoBox.lIIllIIIIIIII[9] = 0xFFFFF99B & 0x766;
        ShamanInfoBox.lIIllIIIIIIII[10] = 110 + 157 - 174 + 75 ^ 107 + 155 - 94 + 20;
        ShamanInfoBox.lIIllIIIIIIII[11] = 0xA8 ^ 0x86 ^ (0x96 ^ 0xB0);
    }

    private static boolean lIlIlllIIllIIlI(int n2) {
        return n2 == 0;
    }
}

