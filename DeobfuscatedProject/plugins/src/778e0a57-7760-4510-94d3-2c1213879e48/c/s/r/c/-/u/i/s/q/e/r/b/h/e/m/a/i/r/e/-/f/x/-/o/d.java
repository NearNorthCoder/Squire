/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.client.game.WorldService
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.D;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
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
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.client.game.WorldService;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class d
extends OverlayPanel {
    private static final /* synthetic */ int s;
    private final /* synthetic */ SquireChambersConfig w;
    private static final /* synthetic */ String t;
    private final /* synthetic */ Client u;
    private final /* synthetic */ SquireChambersPlugin v;
    private /* synthetic */ boolean y;
    private final /* synthetic */ WorldService x;
    private static /* synthetic */ String[] lIlIIlIlIllI;
    private static /* synthetic */ int[] lIlIIlIlIlll;

    private static void llIllIIlIllIII() {
        lIlIIlIlIllI = new String[lIlIIlIlIlll[16]];
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[0]] = d.llIllIIlIlIlIl("hsxPvU4yA8QL+PWgd+BSxw==", "yybGX");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[1]] = d.llIllIIlIlIlIl("QYhFgohBeatwa5cTF6uqCw==", "gnHXl");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[3]] = d.llIllIIlIlIllI("FDAZDT0iYS8MLiojCRY8", "GAldO");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[6]] = d.llIllIIlIlIlIl("UzqQDrbINEKcf8Qh7nIhxQ==", "lpXhL");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[7]] = d.llIllIIlIlIlll("YB4zeRpcddY=", "YLzlT");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[8]] = d.llIllIIlIlIlll("37IX2vPG8xPOIsrmIJepZg==", "thKjW");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[9]] = d.llIllIIlIlIlll("JPPRDB/2YJk=", "wOvWT");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[10]] = d.llIllIIlIlIlIl("OY60JF8fhzo=", "QLFlc");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[11]] = d.llIllIIlIlIllI("UgNsXFZZVipbG14=", "wgLts");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[12]] = d.llIllIIlIlIlll("fcOxKcbpnwpE1reEp5SSPA==", "vmCYU");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[2]] = d.llIllIIlIlIlll("QYSlNaFgp+04lYCB8GD23Q==", "iXRjc");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[14]] = d.llIllIIlIlIllI("", "BsBWa");
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[15]] = d.llIllIIlIlIlll("f2LLFyjee0paHqw4bt8egQ==", "KcsiV");
    }

    static {
        d.llIllIIlIllIIl();
        d.llIllIIlIllIII();
        s = lIlIIlIlIlll[0];
        t = lIlIIlIlIllI[lIlIIlIlIlll[15]];
    }

    @Inject
    private d(Client client, SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, WorldService worldService) {
        super((Plugin)squireChambersPlugin);
        this.y = lIlIIlIlIlll[0];
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.LOW);
        this.u = client;
        this.v = squireChambersPlugin;
        this.w = squireChambersConfig;
        this.x = worldService;
        this.addMenuEntry(MenuAction.RUNELITE_OVERLAY_CONFIG, lIlIIlIlIllI[lIlIIlIlIlll[0]], lIlIIlIlIllI[lIlIIlIlIlll[1]]);
        "".length();
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.v.getStarted(), Instant.now());
        if (d.llIllIIlIllIll(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        d lllllllllllllllIllIllIlIIIlIlIIl;
        if (d.llIllIIlIllIlI(this.v.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        lllllllllllllllIllIllIlIIIlIlIIl.panelComponent.setBorder(new Rectangle(lIlIIlIlIlll[2], lIlIIlIlIlll[2], lIlIIlIlIlll[2], lIlIIlIlIlll[2]));
        String lllllllllllllllIllIllIlIIIlIIlll = lIlIIlIlIllI[lIlIIlIlIlll[3]];
        lllllllllllllllIllIllIlIIIlIlIIl.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllllllllllllIllIllIlIIIlIIlll).build());
        "".length();
        int lllllllllllllllIllIllIlIIIlIIllI = lIlIIlIlIlll[4];
        lllllllllllllllIllIllIlIIIlIlIIl.panelComponent.setPreferredSize(new Dimension(lllllllllllllllIllIllIlIIIlIIllI + lIlIIlIlIlll[5], lIlIIlIlIlll[0]));
        lllllllllllllllIllIllIlIIIlIlIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[6]]).right(lIlIIlIlIllI[lIlIIlIlIlll[7]]).build());
        "".length();
        Duration lllllllllllllllIllIllIlIIIlIIlIl = Duration.between(lllllllllllllllIllIllIlIIIlIlIIl.v.getStarted(), Instant.now());
        lllllllllllllllIllIllIlIIIlIlIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[8]]).right(Time.format((Duration)lllllllllllllllIllIllIlIIIlIIlIl)).build());
        "".length();
        lllllllllllllllIllIllIlIIIlIlIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[9]]).right(lllllllllllllllIllIllIlIIIlIlIIl.v.getManager().getCurrentTask()).build());
        "".length();
        if (d.llIllIIlIllIll(lllllllllllllllIllIllIlIIIlIlIIl.w.extraInfo() ? 1 : 0)) {
            void lllllllllllllllIllIllIlIIIlIlIII;
            return super.render((Graphics2D)lllllllllllllllIllIllIlIIIlIlIII);
        }
        double d2 = this.e(this.v.B().W());
        Object[] objectArray = new Object[lIlIIlIlIlll[3]];
        objectArray[d.lIlIIlIlIlll[0]] = this.v.B().W();
        objectArray[d.lIlIIlIlIlll[1]] = d2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[10]]).right(String.format(lIlIIlIlIllI[lIlIIlIlIlll[11]], objectArray)).build());
        "".length();
        long l2 = this.d(this.v.B().U());
        Object[] objectArray2 = new Object[lIlIIlIlIlll[3]];
        objectArray2[d.lIlIIlIlIlll[0]] = this.v.B().U() / lIlIIlIlIlll[13];
        objectArray2[d.lIlIIlIlIlll[1]] = l2 / 1000L;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[12]]).right(String.format(lIlIIlIlIllI[lIlIIlIlIlll[2]], objectArray2)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left("Left HP: " + this.v.y().aG()).right("Right HP: " + this.v.y().aH()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left("Private Storage: " + D.bC().bF().size()).right(lIlIIlIlIllI[lIlIIlIlIlll[14]]).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left("Kindling dep: " + this.v.K()).right("Grubs dep: " + this.v.J()).build());
        "".length();
        return super.render(graphics2D);
    }

    private static boolean llIllIIlIlllII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean p() {
        return this.y;
    }

    private static String llIllIIlIlIllI(String lllllllllllllllIllIllIlIIIIIIlll, String lllllllllllllllIllIllIlIIIIIIllI) {
        lllllllllllllllIllIllIlIIIIIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIlIIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIlIIIIIlIlI = new StringBuilder();
        char[] lllllllllllllllIllIllIlIIIIIlIIl = lllllllllllllllIllIllIlIIIIIIllI.toCharArray();
        int lllllllllllllllIllIllIlIIIIIlIII = lIlIIlIlIlll[0];
        char[] lllllllllllllllIllIllIlIIIIIIIlI = lllllllllllllllIllIllIlIIIIIIlll.toCharArray();
        int lllllllllllllllIllIllIlIIIIIIIIl = lllllllllllllllIllIllIlIIIIIIIlI.length;
        int lllllllllllllllIllIllIlIIIIIIIII = lIlIIlIlIlll[0];
        while (d.llIllIIlIlllII(lllllllllllllllIllIllIlIIIIIIIII, lllllllllllllllIllIllIlIIIIIIIIl)) {
            char lllllllllllllllIllIllIlIIIIIllIl = lllllllllllllllIllIllIlIIIIIIIlI[lllllllllllllllIllIllIlIIIIIIIII];
            lllllllllllllllIllIllIlIIIIIlIlI.append((char)(lllllllllllllllIllIllIlIIIIIllIl ^ lllllllllllllllIllIllIlIIIIIlIIl[lllllllllllllllIllIllIlIIIIIlIII % lllllllllllllllIllIllIlIIIIIlIIl.length]));
            "".length();
            ++lllllllllllllllIllIllIlIIIIIlIII;
            ++lllllllllllllllIllIllIlIIIIIIIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIlIIIIIlIlI);
    }

    private static String llIllIIlIlIlll(String lllllllllllllllIllIllIIlllllIlll, String lllllllllllllllIllIllIIlllllIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIllllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIlllllIllI.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIlll[11]), "DES");
            Cipher lllllllllllllllIllIllIIllllllIIl = Cipher.getInstance("DES");
            lllllllllllllllIllIllIIllllllIIl.init(lIlIIlIlIlll[3], lllllllllllllllIllIllIIllllllIlI);
            return new String(lllllllllllllllIllIllIIllllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIlllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIllllllIII) {
            lllllllllllllllIllIllIIllllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIlIllIlI(int n2) {
        return n2 != 0;
    }

    private static String llIllIIlIlIlIl(String lllllllllllllllIllIllIIllllIlIII, String lllllllllllllllIllIllIIllllIIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIllllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIllllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIIllllIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIIllllIllII.init(lIlIIlIlIlll[3], lllllllllllllllIllIllIIllllIllIl);
            return new String(lllllllllllllllIllIllIIllllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIllllIlIll) {
            lllllllllllllllIllIllIIllllIlIll.printStackTrace();
            return null;
        }
    }

    private static void llIllIIlIllIIl() {
        lIlIIlIlIlll = new int[17];
        d.lIlIIlIlIlll[0] = (0x1C ^ 0x2C) & ~(0x84 ^ 0xB4);
        d.lIlIIlIlIlll[1] = " ".length();
        d.lIlIIlIlIlll[2] = 0x5B ^ 0x4C ^ (0xAB ^ 0xB6);
        d.lIlIIlIlIlll[3] = "  ".length();
        d.lIlIIlIlIlll[4] = 13 + 172 - 154 + 162;
        d.lIlIIlIlIlll[5] = 0x53 ^ 0x47;
        d.lIlIIlIlIlll[6] = "   ".length();
        d.lIlIIlIlIlll[7] = 98 + 13 - -23 + 36 ^ 77 + 47 - 94 + 144;
        d.lIlIIlIlIlll[8] = 0x73 ^ 0x1A ^ (0x42 ^ 0x2E);
        d.lIlIIlIlIlll[9] = 0xB9 ^ 0xBF;
        d.lIlIIlIlIlll[10] = 0x56 ^ 0x51;
        d.lIlIIlIlIlll[11] = 0x63 ^ 0x7C ^ (0x79 ^ 0x6E);
        d.lIlIIlIlIlll[12] = 0xCF ^ 0xC6;
        d.lIlIIlIlIlll[13] = 0xFFFFD7FF & 0x2BE8;
        d.lIlIIlIlIlll[14] = 0xAB ^ 0xA0;
        d.lIlIIlIlIlll[15] = 176 + 79 - 158 + 90 ^ 53 + 44 - -63 + 23;
        d.lIlIIlIlIlll[16] = 0x5F ^ 0x52;
    }

    private static boolean llIllIIlIllIll(int n2) {
        return n2 == 0;
    }

    public double e(int n2) {
        Duration duration = Duration.between(this.v.getStarted(), Instant.now());
        if (d.llIllIIlIllIll(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }
}

