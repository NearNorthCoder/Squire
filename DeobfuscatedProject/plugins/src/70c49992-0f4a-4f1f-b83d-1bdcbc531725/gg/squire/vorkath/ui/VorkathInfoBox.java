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
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[2]] = VorkathInfoBox.lIlllllIllIlIIl("AEgsYg9baajvKT0Que7t+g==", "wGwFw");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[3]] = VorkathInfoBox.lIlllllIllIlIlI("iJ1oP7dYqZo=", "XdwJl");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[4]] = VorkathInfoBox.lIlllllIllIlIlI("Tqt2Nn1mrlI=", "ljhHj");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[5]] = VorkathInfoBox.lIlllllIllIllII("Ez0JOAcsLQ==", "AHgLn");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[6]] = VorkathInfoBox.lIlllllIllIlIlI("PEW6Uqk2y9K1DN0n9T9vJg==", "Srcjh");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[7]] = VorkathInfoBox.lIlllllIllIlIIl("zNiLeZBrLpk=", "CYegV");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[8]] = VorkathInfoBox.lIlllllIllIlIIl("0KVwibkQBnusXyJI7xC09Q==", "lurQL");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[9]] = VorkathInfoBox.lIlllllIllIlIIl("KJFzohgKeng=", "bEBOs");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[10]] = VorkathInfoBox.lIlllllIllIllII("ahhvZWk8RCdk", "OkOML");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[11]] = VorkathInfoBox.lIlllllIllIllII("DRQpGg86", "IqHng");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[0]] = VorkathInfoBox.lIlllllIllIlIIl("pHSZk1SRVKM=", "wyqUD");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[12]] = VorkathInfoBox.lIlllllIllIlIIl("58MynjxpV2E=", "zdrKJ");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[13]] = VorkathInfoBox.lIlllllIllIlIIl("mqw+IvW1YSCkq3LgYBr2oQ==", "qPMld");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[14]] = VorkathInfoBox.lIlllllIllIlIlI("P4zJuvhjE3D0fB1g30xXQwnO6GrrBhR8", "PCfHE");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[15]] = VorkathInfoBox.lIlllllIllIllII("JQACdwEcAhA5", "lcgWr");
        VorkathInfoBox.lIlIlIlIlIIII[VorkathInfoBox.lIlIlIlIlIIlI[16]] = VorkathInfoBox.lIlllllIllIllII("MBgtByUCBA==", "chHdL");
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
        VorkathInfoBox.lIlIlIlIlIIlI[3] = " ".length();
        VorkathInfoBox.lIlIlIlIlIIlI[4] = "  ".length();
        VorkathInfoBox.lIlIlIlIlIIlI[5] = "   ".length();
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
            "".length();
            ++llllllllllllllIllIlIlIllIllIlIIl;
            ++llllllllllllllIllIlIlIllIllIIIIl;
            "".length();
            if (-"   ".length() < 0) continue;
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
        "".length();
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[3]]).right(lIlIlIlIlIIII[lIlIlIlIlIIlI[4]]).build());
        "".length();
        Duration llllllllllllllIllIlIlIlllIIIllII = Duration.between(llllllllllllllIllIlIlIlllIIIllll.cK.getStarted(), Instant.now());
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[5]]).right(Time.format((Duration)llllllllllllllIllIlIlIlllIIIllII)).build());
        "".length();
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[6]]).right(llllllllllllllIllIlIlIlllIIIllll.cK.getManager().getCurrentTask()).build());
        "".length();
        Object[] objectArray = new Object[lIlIlIlIlIIlI[4]];
        objectArray[VorkathInfoBox.lIlIlIlIlIIlI[2]] = llllllllllllllIllIlIlIlllIIIllll.cK.e();
        objectArray[VorkathInfoBox.lIlIlIlIlIIlI[3]] = llllllllllllllIllIlIlIlllIIIllll.g(llllllllllllllIllIlIlIlllIIIllll.cK.e());
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[7]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[8]], objectArray)).build());
        "".length();
        Object[] objectArray2 = new Object[lIlIlIlIlIIlI[4]];
        objectArray2[VorkathInfoBox.lIlIlIlIlIIlI[2]] = QuantityFormatter.quantityToRSDecimalStack((int)llllllllllllllIllIlIlIlllIIIllll.cK.g());
        objectArray2[VorkathInfoBox.lIlIlIlIlIIlI[3]] = QuantityFormatter.quantityToRSDecimalStack((int)llllllllllllllIllIlIlIlllIIIllll.g(llllllllllllllIllIlIlIlllIIIllll.cK.g()));
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[9]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[10]], objectArray2)).build());
        "".length();
        Object[] objectArray3 = new Object[lIlIlIlIlIIlI[3]];
        objectArray3[VorkathInfoBox.lIlIlIlIlIIlI[2]] = llllllllllllllIllIlIlIlllIIIllll.cK.d();
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[11]]).right(String.format(lIlIlIlIlIIII[lIlIlIlIlIIlI[0]], objectArray3)).build());
        "".length();
        llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[12]]).right(String.valueOf(llllllllllllllIllIlIlIlllIIIllll.cK.c())).build());
        "".length();
        NPC llllllllllllllIllIlIlIlllIIIlIll = llllllllllllllIllIlIlIlllIIIllll.cM.c(lIlIlIlIlIIlI[3]);
        if (VorkathInfoBox.lIlllllIlllllIl(llllllllllllllIllIlIlIlllIIIlIll) && VorkathInfoBox.lIlllllIlllllII(llllllllllllllIllIlIlIlllIIIllll.y.debug() ? 1 : 0)) {
            llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[13]]).right(String.valueOf(llllllllllllllIllIlIlIlllIIIlIll.getActionFrame())).build());
            "".length();
            llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[14]]).right(String.valueOf(Static.getClient().getTickCount() - llllllllllllllIllIlIlIlllIIIllll.cM.H())).build());
            "".length();
            llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[15]]).right(String.valueOf(llllllllllllllIllIlIlIlllIIIllll.cM.I())).build());
            "".length();
            llllllllllllllIllIlIlIlllIIIllll.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIlIlIIII[lIlIlIlIlIIlI[16]]).right(String.valueOf((Object)llllllllllllllIllIlIlIlllIIIllll.cM.B())).build());
            "".length();
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

