/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.whisperer.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.whisperer.SquireWhisperer;
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
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.a;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.d;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p;

public class WhispererInfoBox
extends OverlayPanel {
    private final /* synthetic */ j v;
    private final /* synthetic */ TaskManager s;
    private final /* synthetic */ SquireWhisperer q;
    private final /* synthetic */ a u;
    private static /* synthetic */ int[] lIlIlllIIllIl;
    private static /* synthetic */ String[] lIlIlllIIlIIl;
    private final /* synthetic */ d r;
    private final /* synthetic */ p t;

    private static void llIIIIlIIIlIlIl() {
        lIlIlllIIlIIl = new String[lIlIlllIIllIl[11]];
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[0]] = WhispererInfoBox.llIIIIlIIIIllII("Z41I2hGfZH9MNKSbknXUCnI7b43j/rEx", "TCTWP");
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[4]] = WhispererInfoBox.llIIIIlIIIIllIl("JDQ6ABsdP3I=", "rQHsr");
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[5]] = WhispererInfoBox.llIIIIlIIIIlllI("4P50dWbhPCQ=", "ZNAHH");
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[6]] = WhispererInfoBox.llIIIIlIIIIlllI("CzJ2yN0mfWLw9dUOMIMqrg==", "UaEci");
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[7]] = WhispererInfoBox.llIIIIlIIIIllII("mFRlvrS30WU33acxbwHRkQ==", "sQGJA");
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[8]] = WhispererInfoBox.llIIIIlIIIIllII("FiJ/A9bjO20=", "IzVpZ");
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[9]] = WhispererInfoBox.llIIIIlIIIIllIl("LhIWPCACFEI=", "lsxWI");
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[10]] = WhispererInfoBox.llIIIIlIIIIlllI("3+CC1smPLXj6yKUkmUNDJVJCGc0cFLlx", "yZoqT");
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.q.getStarted(), Instant.now());
        if (WhispererInfoBox.llIIIIlIIlIIIlI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean llIIIIlIIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public WhispererInfoBox(SquireWhisperer squireWhisperer, d d2, p p2, a a2, j j2) {
        this.q = squireWhisperer;
        this.r = d2;
        this.s = squireWhisperer.getManager();
        this.t = p2;
        this.u = a2;
        this.v = j2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.MED);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (WhispererInfoBox.llIIIIlIIlIIIIl(this.q.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        String string = lIlIlllIIlIIl[lIlIlllIIllIl[0]];
        this.panelComponent.setBorder(new Rectangle(lIlIlllIIllIl[1], lIlIlllIIllIl[1], lIlIlllIIllIl[1], lIlIlllIIllIl[1]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        "".length();
        int n2 = lIlIlllIIllIl[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIlIlllIIllIl[3], lIlIlllIIllIl[0]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[4]]).right(lIlIlllIIlIIl[lIlIlllIIllIl[5]]).build());
        "".length();
        Duration duration = Duration.between(this.q.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[6]]).right(Time.format((Duration)duration)).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[7]]).right(this.s.getCurrentTask()).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[8]]).right(String.valueOf(this.q.a())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[9]]).right(String.valueOf(this.u.b())).build());
        "".length();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[10]]).right(String.valueOf(this.v.q())).build());
        "".length();
        return super.render(graphics2D);
    }

    private static String llIIIIlIIIIllII(String llllllllllllllIllIlIIIIIIIllIIIl, String llllllllllllllIllIlIIIIIIIllIIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIIIIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIIIIllIIII.getBytes(StandardCharsets.UTF_8)), lIlIlllIIllIl[11]), "DES");
            Cipher llllllllllllllIllIlIIIIIIIllIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIIIIIllIlIl.init(lIlIlllIIllIl[5], llllllllllllllIllIlIIIIIIIllIllI);
            return new String(llllllllllllllIllIlIIIIIIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIIIIIllIlII) {
            llllllllllllllIllIlIIIIIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlIIlIIIII() {
        lIlIlllIIllIl = new int[12];
        WhispererInfoBox.lIlIlllIIllIl[0] = (0x2C ^ 0x74) & ~(0x6F ^ 0x37);
        WhispererInfoBox.lIlIlllIIllIl[1] = 100 + 115 - 30 + 20 ^ 172 + 86 - 196 + 137;
        WhispererInfoBox.lIlIlllIIllIl[2] = 140 + 68 - 156 + 141;
        WhispererInfoBox.lIlIlllIIllIl[3] = 135 + 76 - 90 + 55 ^ 64 + 64 - 37 + 73;
        WhispererInfoBox.lIlIlllIIllIl[4] = " ".length();
        WhispererInfoBox.lIlIlllIIllIl[5] = "  ".length();
        WhispererInfoBox.lIlIlllIIllIl[6] = "   ".length();
        WhispererInfoBox.lIlIlllIIllIl[7] = 0x57 ^ 0x42 ^ (0x4F ^ 0x5E);
        WhispererInfoBox.lIlIlllIIllIl[8] = 0xB2 ^ 0xB7;
        WhispererInfoBox.lIlIlllIIllIl[9] = 7 + 130 - 41 + 84 ^ 128 + 96 - 60 + 14;
        WhispererInfoBox.lIlIlllIIllIl[10] = 0x80 ^ 0xA0 ^ (0x6E ^ 0x49);
        WhispererInfoBox.lIlIlllIIllIl[11] = 8 ^ 0;
    }

    private static String llIIIIlIIIIlllI(String llllllllllllllIllIlIIIIIIlIlIllI, String llllllllllllllIllIlIIIIIIlIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIIIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIIIIlIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIIIIlIllIlI.init(lIlIlllIIllIl[5], llllllllllllllIllIlIIIIIIlIllIll);
            return new String(llllllllllllllIllIlIIIIIIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIIIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIIIIlIllIIl) {
            llllllllllllllIllIlIIIIIIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static String llIIIIlIIIIllIl(String llllllllllllllIllIlIIIIIIlIIlIII, String llllllllllllllIllIlIIIIIIlIIIIlI) {
        llllllllllllllIllIlIIIIIIlIIlIII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIIIIlIIIllI = new StringBuilder();
        char[] llllllllllllllIllIlIIIIIIlIIIlIl = llllllllllllllIllIlIIIIIIlIIIIlI.toCharArray();
        int llllllllllllllIllIlIIIIIIlIIIlII = lIlIlllIIllIl[0];
        char[] llllllllllllllIllIlIIIIIIIlllllI = llllllllllllllIllIlIIIIIIlIIlIII.toCharArray();
        int llllllllllllllIllIlIIIIIIIllllIl = llllllllllllllIllIlIIIIIIIlllllI.length;
        int llllllllllllllIllIlIIIIIIIllllII = lIlIlllIIllIl[0];
        while (WhispererInfoBox.llIIIIlIIlIIIll(llllllllllllllIllIlIIIIIIIllllII, llllllllllllllIllIlIIIIIIIllllIl)) {
            char llllllllllllllIllIlIIIIIIlIIlIIl = llllllllllllllIllIlIIIIIIIlllllI[llllllllllllllIllIlIIIIIIIllllII];
            llllllllllllllIllIlIIIIIIlIIIllI.append((char)(llllllllllllllIllIlIIIIIIlIIlIIl ^ llllllllllllllIllIlIIIIIIlIIIlIl[llllllllllllllIllIlIIIIIIlIIIlII % llllllllllllllIllIlIIIIIIlIIIlIl.length]));
            "".length();
            ++llllllllllllllIllIlIIIIIIlIIIlII;
            ++llllllllllllllIllIlIIIIIIIllllII;
            "".length();
            if (-" ".length() != "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIIIIIlIIIllI);
    }

    static {
        WhispererInfoBox.llIIIIlIIlIIIII();
        WhispererInfoBox.llIIIIlIIIlIlIl();
    }

    private static boolean llIIIIlIIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIlIIlIIIIl(int n2) {
        return n2 != 0;
    }
}

