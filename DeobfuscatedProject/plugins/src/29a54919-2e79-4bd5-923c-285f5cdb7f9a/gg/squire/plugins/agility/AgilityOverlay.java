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
package gg.squire.plugins.agility;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
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

public class AgilityOverlay
extends OverlayPanel {
    private final /* synthetic */ TaskManager c;
    private static /* synthetic */ int[] lIllIIIIlll;
    private final /* synthetic */ AgilityConfig b;
    private static /* synthetic */ String[] lIllIIIIlIl;
    private final /* synthetic */ SquireAgilityPlugin a;

    private static String lIIlIlIIllllll(String llllllllllllllllIlIlIlIlIIlllIll, String llllllllllllllllIlIlIlIlIIlllIII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIlIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIlIIlllIII.getBytes(StandardCharsets.UTF_8)), lIllIIIIlll[10]), "DES");
            Cipher llllllllllllllllIlIlIlIlIIllllIl = Cipher.getInstance("DES");
            llllllllllllllllIlIlIlIlIIllllIl.init(lIllIIIIlll[2], llllllllllllllllIlIlIlIlIIlllllI);
            return new String(llllllllllllllllIlIlIlIlIIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIlIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlIlIIllllII) {
            llllllllllllllllIlIlIlIlIIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIIIllI(int n, int n2) {
        return n < n2;
    }

    private static void lIIlIlIlIIIIII() {
        lIllIIIIlIl = new String[lIllIIIIlll[9]];
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[0]] = AgilityOverlay.lIIlIlIIllllIl("AuNvk9UUgnfROd6VwHgFHw==", "Yprpc");
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[1]] = AgilityOverlay.lIIlIlIIlllllI("FCE8GyQrMQ==", "FTRoM");
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[2]] = AgilityOverlay.lIIlIlIIlllllI("ARweISs4Fw==", "WylRB");
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[3]] = AgilityOverlay.lIIlIlIIlllllI("fG9RTWg=", "MAbcX");
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[4]] = AgilityOverlay.lIIlIlIIllllIl("zHNbKAoMuIA=", "tjkoO");
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[5]] = AgilityOverlay.lIIlIlIIllllll("DyqtaAnPC/c=", "okIWA");
        AgilityOverlay.lIllIIIIlIl[AgilityOverlay.lIllIIIIlll[6]] = AgilityOverlay.lIIlIlIIllllIl("JdGosUq7d8s=", "rXeih");
    }

    private static String lIIlIlIIlllllI(String llllllllllllllllIlIlIlIlIIlIlIll, String llllllllllllllllIlIlIlIlIIlIlIlI) {
        llllllllllllllllIlIlIlIlIIlIlIll = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIlIlIIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIlIlIIlIlIIl = new StringBuilder();
        char[] llllllllllllllllIlIlIlIlIIlIlIII = llllllllllllllllIlIlIlIlIIlIlIlI.toCharArray();
        int llllllllllllllllIlIlIlIlIIlIIlll = lIllIIIIlll[0];
        char[] llllllllllllllllIlIlIlIlIIlIIIIl = llllllllllllllllIlIlIlIlIIlIlIll.toCharArray();
        int llllllllllllllllIlIlIlIlIIlIIIII = llllllllllllllllIlIlIlIlIIlIIIIl.length;
        int llllllllllllllllIlIlIlIlIIIlllll = lIllIIIIlll[0];
        while (AgilityOverlay.lIIlIlIlIIIllI(llllllllllllllllIlIlIlIlIIIlllll, llllllllllllllllIlIlIlIlIIlIIIII)) {
            char llllllllllllllllIlIlIlIlIIlIllII = llllllllllllllllIlIlIlIlIIlIIIIl[llllllllllllllllIlIlIlIlIIIlllll];
            llllllllllllllllIlIlIlIlIIlIlIIl.append((char)(llllllllllllllllIlIlIlIlIIlIllII ^ llllllllllllllllIlIlIlIlIIlIlIII[llllllllllllllllIlIlIlIlIIlIIlll % llllllllllllllllIlIlIlIlIIlIlIII.length]));
            "".length();
            ++llllllllllllllllIlIlIlIlIIlIIlll;
            ++llllllllllllllllIlIlIlIlIIIlllll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIlIlIIlIlIIl);
    }

    private static boolean lIIlIlIlIIIlIl(int n) {
        return n != 0;
    }

    private static void lIIlIlIlIIIlII() {
        lIllIIIIlll = new int[11];
        AgilityOverlay.lIllIIIIlll[0] = (0x92 ^ 0x9E ^ (0xF9 ^ 0xB3)) & (166 + 141 - 229 + 132 ^ 54 + 137 - 69 + 26 ^ -" ".length()) & ((0xC8 ^ 0xBD ^ (0x55 ^ 0x1D)) & (0x97 ^ 0xB1 ^ (0x27 ^ 0x3C) ^ -" ".length()) & ((90 + 166 - 108 + 63 ^ 53 + 130 - 123 + 118) & (74 + 92 - 18 + 67 ^ 52 + 176 - 148 + 102 ^ -" ".length()) ^ -" ".length()) ^ -" ".length());
        AgilityOverlay.lIllIIIIlll[1] = " ".length();
        AgilityOverlay.lIllIIIIlll[2] = "  ".length();
        AgilityOverlay.lIllIIIIlll[3] = "   ".length();
        AgilityOverlay.lIllIIIIlll[4] = 0x36 ^ 0x30 ^ "  ".length();
        AgilityOverlay.lIllIIIIlll[5] = 0x42 ^ 0x2F ^ (0xAD ^ 0xC5);
        AgilityOverlay.lIllIIIIlll[6] = 118 + 57 - 39 + 37 ^ 71 + 137 - 200 + 163;
        AgilityOverlay.lIllIIIIlll[7] = 0xFFFF833B & 0x7DC6;
        AgilityOverlay.lIllIIIIlll[8] = 0xB ^ 0x1F;
        AgilityOverlay.lIllIIIIlll[9] = 0xAF ^ 0xC3 ^ (0xD ^ 0x66);
        AgilityOverlay.lIllIIIIlll[10] = 0 ^ 8;
    }

    public Dimension render(Graphics2D graphics2D) {
        Object object;
        AgilityOverlay llllllllllllllllIlIlIlIlIlIIllIl;
        if (AgilityOverlay.lIIlIlIlIIIlIl(this.a.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        llllllllllllllllIlIlIlIlIlIIllIl.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIllIIIIlIl[lIllIIIIlll[0]]).build());
        "".length();
        Duration llllllllllllllllIlIlIlIlIlIIlIll = Duration.between(llllllllllllllllIlIlIlIlIlIIllIl.a.getStarted(), Instant.now());
        llllllllllllllllIlIlIlIlIlIIllIl.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[1]]).right(Time.format((Duration)llllllllllllllllIlIlIlIlIlIIlIll)).build());
        "".length();
        llllllllllllllllIlIlIlIlIlIIllIl.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[2]]).right(lIllIIIIlIl[lIllIIIIlll[3]]).build());
        "".length();
        llllllllllllllllIlIlIlIlIlIIllIl.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[4]]).right(llllllllllllllllIlIlIlIlIlIIllIl.c.getCurrentTask()).build());
        "".length();
        llllllllllllllllIlIlIlIlIlIIllIl.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[5]]).right(llllllllllllllllIlIlIlIlIlIIllIl.a.b() + " (" + llllllllllllllllIlIlIlIlIlIIllIl.a(llllllllllllllllIlIlIlIlIlIIllIl.a.b()) + "/h)").build());
        "".length();
        if (AgilityOverlay.lIIlIlIlIIIlIl(llllllllllllllllIlIlIlIlIlIIllIl.b.progressive() ? 1 : 0)) {
            object = "Progressive (" + String.valueOf((Object)llllllllllllllllIlIlIlIlIlIIllIl.a.a()) + ")";
            "".length();
            if ((78 + 149 - 80 + 25 ^ 149 + 72 - 81 + 28) < (0x52 ^ 0x5A ^ (0x45 ^ 0x49))) {
                return null;
            }
        } else {
            object = llllllllllllllllIlIlIlIlIlIIllIl.a.a().toString();
        }
        Object object2 = object;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIIIlIl[lIllIIIIlll[6]]).right((String)object2).build());
        "".length();
        int n = lIllIIIIlll[7];
        this.panelComponent.setPreferredSize(new Dimension(n + lIllIIIIlll[8], lIllIIIIlll[0]));
        return super.render(graphics2D);
    }

    private static String lIIlIlIIllllIl(String llllllllllllllllIlIlIlIlIIIlIllI, String llllllllllllllllIlIlIlIlIIIlIIll) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIlIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIlIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIlIlIIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIlIlIIIllIII.init(lIllIIIIlll[2], llllllllllllllllIlIlIlIlIIIllIIl);
            return new String(llllllllllllllllIlIlIlIlIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIlIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlIlIIIlIlll) {
            llllllllllllllllIlIlIlIlIIIlIlll.printStackTrace();
            return null;
        }
    }

    static {
        AgilityOverlay.lIIlIlIlIIIlII();
        AgilityOverlay.lIIlIlIlIIIIII();
    }

    private long a(int n) {
        Duration duration = Duration.between(this.a.getStarted(), Instant.now());
        if (AgilityOverlay.lIIlIlIlIIIlIl(duration.isZero() ? 1 : 0)) {
            return 0L;
        }
        return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
    }

    @Inject
    private AgilityOverlay(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.a = squireAgilityPlugin;
        this.b = agilityConfig;
        this.c = squireAgilityPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

