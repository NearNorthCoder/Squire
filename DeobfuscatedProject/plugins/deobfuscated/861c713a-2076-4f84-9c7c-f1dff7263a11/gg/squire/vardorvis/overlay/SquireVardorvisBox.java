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
package gg.squire.vardorvis.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
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
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;

public class SquireVardorvisBox
extends OverlayPanel {
    private static /* synthetic */ String[] lIlIlIIlIllII;
    private final /* synthetic */ SquireVardorvisConfig ab;
    private final /* synthetic */ TaskManager aa;
    private final /* synthetic */ SquireVardorvis Z;
    private /* synthetic */ e l;
    private static /* synthetic */ int[] lIlIlIIlIllIl;

    private static String lIllllIllllllIl(String llllllllllllllIllIlIllllIIIIlIll, String llllllllllllllIllIlIllllIIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIllllIIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllllIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIllIl[10]), "DES");
            Cipher llllllllllllllIllIlIllllIIIIllll = Cipher.getInstance("DES");
            llllllllllllllIllIlIllllIIIIllll.init(lIlIlIIlIllIl[5], llllllllllllllIllIlIllllIIIlIIII);
            return new String(llllllllllllllIllIlIllllIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllllIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllllIIIIlllI) {
            llllllllllllllIllIlIllllIIIIlllI.printStackTrace();
            return null;
        }
    }

    static {
        SquireVardorvisBox.lIlllllIIIIIIIl();
        SquireVardorvisBox.lIlllllIIIIIIII();
    }

    private static String lIllllIlllllllI(String llllllllllllllIllIlIlllIlllIlIII, String llllllllllllllIllIlIlllIlllIIlll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllIlllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlllIlllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlllIlllIlIlI.init(lIlIlIIlIllIl[5], llllllllllllllIllIlIlllIlllIlIll);
            return new String(llllllllllllllIllIlIlllIlllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlllIlllIlIIl) {
            llllllllllllllIllIlIlllIlllIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public SquireVardorvisBox(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2) {
        this.Z = squireVardorvis;
        this.aa = squireVardorvis.getManager();
        this.ab = squireVardorvisConfig;
        this.l = e2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIllllIllllllll(String llllllllllllllIllIlIlllIlllllIII, String llllllllllllllIllIlIlllIllllIlll) {
        llllllllllllllIllIlIlllIlllllIII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlllIlllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlllIlllllIll = new StringBuilder();
        char[] llllllllllllllIllIlIlllIlllllIlI = llllllllllllllIllIlIlllIllllIlll.toCharArray();
        int llllllllllllllIllIlIlllIlllllIIl = lIlIlIIlIllIl[1];
        char[] llllllllllllllIllIlIlllIllllIIll = llllllllllllllIllIlIlllIlllllIII.toCharArray();
        int llllllllllllllIllIlIlllIllllIIlI = llllllllllllllIllIlIlllIllllIIll.length;
        int llllllllllllllIllIlIlllIllllIIIl = lIlIlIIlIllIl[1];
        while (SquireVardorvisBox.lIlllllIIIIIlII(llllllllllllllIllIlIlllIllllIIIl, llllllllllllllIllIlIlllIllllIIlI)) {
            char llllllllllllllIllIlIlllIlllllllI = llllllllllllllIllIlIlllIllllIIll[llllllllllllllIllIlIlllIllllIIIl];
            llllllllllllllIllIlIlllIlllllIll.append((char)(llllllllllllllIllIlIlllIlllllllI ^ llllllllllllllIllIlIlllIlllllIlI[llllllllllllllIllIlIlllIlllllIIl % llllllllllllllIllIlIlllIlllllIlI.length]));
            0;
            ++llllllllllllllIllIlIlllIlllllIIl;
            ++llllllllllllllIllIlIlllIllllIIIl;
            0;
            if ((0xB1 ^ 0x88 ^ (0x9F ^ 0xA2)) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlllIlllllIll);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireVardorvisBox.lIlllllIIIIIIlI(this.Z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIlIIlIllIl[0], lIlIlIIlIllIl[0], lIlIlIIlIllIl[0], lIlIlIIlIllIl[0]));
        String string = lIlIlIIlIllII[lIlIlIIlIllIl[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = lIlIlIIlIllIl[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIlIlIIlIllIl[3], lIlIlIIlIllIl[1]));
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[4]]).right(Time.format((Duration)duration)).build());
        0;
        int n3 = this.Z.g();
        double d2 = this.g(n3);
        Object[] objectArray = new Object[lIlIlIIlIllIl[5]];
        objectArray[SquireVardorvisBox.lIlIlIIlIllIl[1]] = n3;
        objectArray[SquireVardorvisBox.lIlIlIIlIllIl[4]] = d2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[5]]).right(String.format(lIlIlIIlIllII[lIlIlIIlIllIl[6]], objectArray)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[7]]).right(this.aa.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().right("Post kill: " + this.Z.f()).left("Banking: " + this.Z.h()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlIIlIllII[lIlIlIIlIllIl[8]]).right(String.valueOf(this.Z.i())).build());
        0;
        return super.render(graphics2D);
    }

    private static void lIlllllIIIIIIII() {
        lIlIlIIlIllII = new String[lIlIlIIlIllIl[9]];
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[1]] = SquireVardorvisBox."Squire Vardorvis";
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[4]] = SquireVardorvisBox."Runtime:";
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[5]] = SquireVardorvisBox."Kills: ";
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[6]] = SquireVardorvisBox."%d (%.1f/h)";
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[7]] = SquireVardorvisBox."Task:";
        SquireVardorvisBox.lIlIlIIlIllII[SquireVardorvisBox.lIlIlIIlIllIl[8]] = SquireVardorvisBox."Died:";
    }

    private static void lIlllllIIIIIIIl() {
        lIlIlIIlIllIl = new int[11];
        SquireVardorvisBox.lIlIlIIlIllIl[0] = 0x3E ^ 0x34;
        SquireVardorvisBox.lIlIlIIlIllIl[1] = (180 + 144 - 191 + 60 ^ 5 + 101 - 64 + 97) & (10 + 153 - 48 + 95 ^ 97 + 70 - 128 + 113 ^ -1);
        SquireVardorvisBox.lIlIlIIlIllIl[2] = 145 + 79 - 86 + 55;
        SquireVardorvisBox.lIlIlIIlIllIl[3] = 2 ^ (0x57 ^ 0x41);
        SquireVardorvisBox.lIlIlIIlIllIl[4] = 1;
        SquireVardorvisBox.lIlIlIIlIllIl[5] = 2;
        SquireVardorvisBox.lIlIlIIlIllIl[6] = 3;
        SquireVardorvisBox.lIlIlIIlIllIl[7] = 0x82 ^ 0x86;
        SquireVardorvisBox.lIlIlIIlIllIl[8] = 0x9D ^ 0x98;
        SquireVardorvisBox.lIlIlIIlIllIl[9] = 159 + 129 - 101 + 3 ^ 152 + 109 - 78 + 1;
        SquireVardorvisBox.lIlIlIIlIllIl[10] = 0x1A ^ 0x12;
    }

    public double g(int n2) {
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        if (SquireVardorvisBox.lIlllllIIIIIIll(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static boolean lIlllllIIIIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllllIIIIIIlI(int n2) {
        return n2 != 0;
    }

    public long f(int n2) {
        Duration duration = Duration.between(this.Z.getStarted(), Instant.now());
        if (SquireVardorvisBox.lIlllllIIIIIIll(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }
}

