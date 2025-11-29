/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.runelite.client.util.QuantityFormatter
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.client.Static
 */
package gg.squire.vorkath.ui;

import com.google.inject.Inject;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.d;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
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
import net.runelite.api.NPC;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.runelite.client.util.QuantityFormatter;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;

public class VorkathInfoBox
extends OverlayPanel {
    private final /* synthetic */ d cL;
    private static /* synthetic */ int[] lIlIlIlIlIIlI;
    private final /* synthetic */ SquireVorkathPlugin cK;
    private static /* synthetic */ String[] lIlIlIlIlIIII;
    private /* synthetic */ SquireVorkathConfig y;
    private final /* synthetic */ f cM;

    private static boolean lIlllllIlllllIl(Object object) {
        return object != null;
    }

    private static String lIlllllIllIlIIl(String llllllllllllllIllIlIlIllIlIllIII, String llllllllllllllIllIlIlIllIlIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIllIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIllIlIlIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIIlI[10]), "DES");
            Cipher llllllllllllllIllIlIlIllIlIllIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIllIlIllIlI.init(lIlIlIlIlIIlI[4], llllllllllllllIllIlIlIllIlIllIll);
            return new String(llllllllllllllIllIlIlIllIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIllIlIllIIl) {
            llllllllllllllIllIlIlIllIlIllIIl.printStackTrace();
            return null;
        }
    }

    static {
        VorkathInfoBox.lIlllllIllllIll();
        VorkathInfoBox.lIlllllIllIlllI();
    }

    private static void lIlllllIllIlllI() {
        lIlIlIlIlIIII = new String[lIlIlIlIlIIlI[17]];
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[2]] = VorkathInfoBox."Squire Vorkath";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[3]] = VorkathInfoBox."Version";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[4]] = VorkathInfoBox."0.3.1";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[5]] = VorkathInfoBox."Runtime";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[6]] = VorkathInfoBox."Performing Task";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[7]] = VorkathInfoBox."Kills";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[8]] = VorkathInfoBox."%d (%d/h)";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[9]] = VorkathInfoBox."Money";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[10]] = VorkathInfoBox."%s (%s/h)";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[11]] = VorkathInfoBox."Deaths";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[0]] = VorkathInfoBox."%d";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[12]] = VorkathInfoBox."Bakning";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[13]] = VorkathInfoBox."Vorkath Frame";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[14]] = VorkathInfoBox."Ticks since attack";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[15]] = VorkathInfoBox."Ice spawn";
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[16]] = VorkathInfoBox."Special";
    }

    private static boolean lIlllllIlllllII(int n2) {
        return n2 != 0;
    }

    @Inject
    public VorkathInfoBox(SquireVorkathPlugin squireVorkathPlugin, d d2, f f2, SquireVorkathConfig squireVorkathConfig) {
        this.cK = squireVorkathPlugin;
        this.cL = d2;
        this.cM = f2;
        this.y = squireVorkathConfig;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static void lIlllllIllllIll() {
        lIlIlIlIlIIlI = new int[18];
        VorkathInfoBox.lIlIlIlIlIIlI[0] = 0x89 ^ 0x83;
        VorkathInfoBox.lIlIlIlIlIIlI[1] = 0xFFFFFF0F & 0x1F2;
        VorkathInfoBox.lIlIlIlIlIIlI[2] = (0x12 ^ 0x2D) & ~(0x6B ^ 0x54);
        VorkathInfoBox.lIlIlIlIlIIlI[3] = 1;
        VorkathInfoBox.lIlIlIlIlIIlI[4] = 2;
        VorkathInfoBox.lIlIlIlIlIIlI[5] = 3;
        VorkathInfoBox.lIlIlIlIlIIlI[6] = 133 + 92 - 55 + 9 ^ 93 + 130 - 121 + 81;
        VorkathInfoBox.lIlIlIlIlIIlI[7] = 0x8A ^ 0x8F;
        VorkathInfoBox.lIlIlIlIlIIlI[8] = 82 + 65 - 78 + 96 ^ 147 + 41 - 131 + 106;
        VorkathInfoBox.lIlIlIlIlIIlI[9] = 0xB6 ^ 0xB1;
        VorkathInfoBox.lIlIlIlIlIIlI[10] = 0xA9 ^ 0xA1;
        VorkathInfoBox.lIlIlIlIlIIlI[11] = 0xA2 ^ 0xBB ^ (0x71 ^ 0x61);
        VorkathInfoBox.lIlIlIlIlIIlI[12] = 0xC1 ^ 0x82 ^ (0xED ^ 0xA5);
        VorkathInfoBox.lIlIlIlIlIIlI[13] = 0x64 ^ 0x68;
        VorkathInfoBox.lIlIlIlIlIIlI[14] = 0x91 ^ 0x9C;
        VorkathInfoBox.lIlIlIlIlIIlI[15] = 137 + 35 - 90 + 62 ^ 80 + 81 - 26 + 23;
        VorkathInfoBox.lIlIlIlIlIIlI[16] = 168 + 102 - 143 + 51 ^ 148 + 149 - 229 + 121;
        VorkathInfoBox.lIlIlIlIlIIlI[17] = 134 + 152 - 109 + 13 ^ 66 + 98 - 86 + 96;
    }

    private static boolean lIlllllIllllllI(int n2) {
        return n2 == 0;
    }

    private static String lIlllllIllIllII(String llllllllllllllIllIlIlIllIllIlIII, String llllllllllllllIllIlIlIllIllIIlll) {
        llllllllllllllIllIlIlIllIllIlIII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIllIllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIllIllIlIll = new StringBuilder();
        char[] llllllllllllllIllIlIlIllIllIlIlI = llllllllllllllIllIlIlIllIllIIlll.toCharArray();
        int llllllllllllllIllIlIlIllIllIlIIl = lIlIlIlIlIIlI[2];
        char[] llllllllllllllIllIlIlIllIllIIIll = llllllllllllllIllIlIlIllIllIlIII.toCharArray();
        int llllllllllllllIllIlIlIllIllIIIlI = llllllllllllllIllIlIlIllIllIIIll.length;
        int llllllllllllllIllIlIlIllIllIIIIl = lIlIlIlIlIIlI[2];
        while (VorkathInfoBox.lIlllllIlllllll(llllllllllllllIllIlIlIllIllIIIIl, llllllllllllllIllIlIlIllIllIIIlI)) {
            char llllllllllllllIllIlIlIllIllIlllI = llllllllllllllIllIlIlIllIllIIIll[llllllllllllllIllIlIlIllIllIIIIl];
            llllllllllllllIllIlIlIllIllIlIll.append((char)(llllllllllllllIllIlIlIllIllIlllI ^ llllllllllllllIllIlIlIllIllIlIlI[llllllllllllllIllIlIlIllIllIlIIl % llllllllllllllIllIlIlIllIllIlIlI.length]));
            0;
            ++llllllllllllllIllIlIlIllIllIlIIl;
            ++llllllllllllllIllIlIlIllIllIIIIl;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlIllIllIlIll);
    }

    private static boolean lIlllllIlllllll(int n2, int n3) {
        return n2 < n3;
    }

    public Dimension render(Graphics2D graphics2D) {
        VorkathInfoBox llllllllllllllIllIlIlIlllIIIllll;
        if (VorkathInfoBox.lIlllllIlllllII(this.cK.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.setBorder(new Rectangle(lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0], lIlIlIlIlIIlI[0]));
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.setPreferredSize(new Dimension(lIlIlIlIlIIlI[1], lIlIlIlIlIIlI[2]));
        String llllllllllllllIllIlIlIlllIIIllIl = lIlIlIlIlIIII[lIlIlIlIlIIlI[2]];
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllllllllllllIllIlIlIlllIIIllIl).build());
        0;
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[3]]).right(lIlIlIlIlIIII[lIlIlIlIlIIlI[4]]).build());
        0;
        Duration llllllllllllllIllIlIlIlllIIIllII = Duration.between(llllllllllllllIllIlIlIlllIIIllll.cK.getStarted(), Instant.now());
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[5]]).right(Time.format((Duration)llllllllllllllIllIlIlIlllIIIllII)).build());
        0;
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[6]]).right(llllllllllllllIllIlIlIlllIIIllll.cK.getManager().getCurrentTask()).build());
        0;
        Object[] objectArray = new Object[lIlIlIlIlIIlI[4]];
        objectArray[VorkathInfoBox.lIlIlIlIlIIlI[2]] = llllllllllllllIllIlIlIlllIIIllll.cK.e();
        objectArray[VorkathInfoBox.lIlIlIlIlIIlI[3]] = llllllllllllllIllIlIlIlllIIIllll.g(llllllllllllllIllIlIlIlllIIIllll.cK.e());
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[7]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[8]], objectArray)).build());
        0;
        Object[] objectArray2 = new Object[lIlIlIlIlIIlI[4]];
        objectArray2[VorkathInfoBox.lIlIlIlIlIIlI[2]] = QuantityFormatter.quantityToRSDecimalStack((int)llllllllllllllIllIlIlIlllIIIllll.cK.g());
        objectArray2[VorkathInfoBox.lIlIlIlIlIIlI[3]] = QuantityFormatter.quantityToRSDecimalStack((int)llllllllllllllIllIlIlIlllIIIllll.g(llllllllllllllIllIlIlIlllIIIllll.cK.g()));
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[9]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[10]], objectArray2)).build());
        0;
        Object[] objectArray3 = new Object[lIlIlIlIlIIlI[3]];
        objectArray3[VorkathInfoBox.lIlIlIlIlIIlI[2]] = llllllllllllllIllIlIlIlllIIIllll.cK.d();
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[11]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[0]], objectArray3)).build());
        0;
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[12]]).right(String.valueOf(llllllllllllllIllIlIlIlllIIIllll.cK.c())).build());
        0;
        NPC llllllllllllllIllIlIlIlllIIIlIll = llllllllllllllIllIlIlIlllIIIllll.cM.c(lIlIlIlIlIIlI[3]);
        if (VorkathInfoBox.lIlllllIlllllIl(llllllllllllllIllIlIlIlllIIIlIll) && VorkathInfoBox.lIlllllIlllllII(llllllllllllllIllIlIlIlllIIIllll.y.debug() ? 1 : 0)) {
            llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[13]]).right(String.valueOf(llllllllllllllIllIlIlIlllIIIlIll.getActionFrame())).build());
            0;
            llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[14]]).right(String.valueOf(Static.getClient().getTickCount() - llllllllllllllIllIlIlIlllIIIllll.cM.H())).build());
            0;
            llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[15]]).right(String.valueOf(llllllllllllllIllIlIlIlllIIIllll.cM.I())).build());
            0;
            llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[16]]).right(String.valueOf((Object)llllllllllllllIllIlIlIlllIIIllll.cM.B())).build());
            0;
        }
        return super.render(graphics2D);
    }

    public int g(int n2) {
        Duration duration = Duration.between(this.cK.getStarted(), Instant.now());
        if (VorkathInfoBox.lIlllllIllllllI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return lIlIlIlIlIIlI[2];
    }

    private static String lIlllllIllIlIlI(String llllllllllllllIllIlIlIllIlllllIl, String llllllllllllllIllIlIlIllIlllllII) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIlllIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIllIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIllIlllllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIllIlllllll.init(lIlIlIlIlIIlI[4], llllllllllllllIllIlIlIlllIIIIIII);
            return new String(llllllllllllllIllIlIlIllIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIllIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIllIllllllI) {
            llllllllllllllIllIlIlIllIllllllI.printStackTrace();
            return null;
        }
    }
}

