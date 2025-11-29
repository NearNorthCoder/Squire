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
 */
package gg.squire.tempoross.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.tempoross.SquireTempoross;
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
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;

public class TemporossInfoBox
extends OverlayPanel {
    private final /* synthetic */ TaskManager ad;
    private final /* synthetic */ a ac;
    private final /* synthetic */ SquireTempoross ab;
    private static /* synthetic */ int[] lIIlllIIIIIlI;
    private static /* synthetic */ String[] lIIlllIIIIIIl;

    private static boolean lIllIIlIIIIllll(int n2) {
        return n2 != 0;
    }

    static {
        TemporossInfoBox.lIllIIlIIIIllIl();
        TemporossInfoBox.lIllIIlIIIIlIll();
    }

    private static String lIllIIlIIIIlIlI(String var12, String var4) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var14 = var4.toCharArray();
        int var13 = lIIlllIIIIIlI[1];
        char[] var10 = var12.toCharArray();
        int var5 = var10.length;
        int var6 = lIIlllIIIIIlI[1];
        while (TemporossInfoBox.lIllIIlIIIlIIII(var6, var5)) {
            char var19 = var10[var6];
            var3.append((char)(var19 ^ var14[var13 % var14.length]));
            0;
            ++var13;
            ++var6;
            0;
            
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean lIllIIlIIIIlllI(int n2) {
        return n2 == 0;
    }

    public double g(int n2) {
        Duration duration = Duration.between(this.ab.getStarted(), Instant.now());
        if (TemporossInfoBox.lIllIIlIIIIlllI(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (TemporossInfoBox.lIllIIlIIIIllll(this.ab.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIlllIIIIIlI[0], lIIlllIIIIIlI[0], lIIlllIIIIIlI[0], lIIlllIIIIIlI[0]));
        String string = lIIlllIIIIIIl[lIIlllIIIIIlI[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = lIIlllIIIIIlI[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIlllIIIIIlI[3], lIIlllIIIIIlI[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[4]]).right(String.valueOf(this.ac.B().toElapsedString())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[5]]).right(this.ad.getCurrentTask()).build());
        0;
        Object[] objectArray = new Object[lIIlllIIIIIlI[5]];
        objectArray[TemporossInfoBox.lIIlllIIIIIlI[1]] = this.ac.D();
        objectArray[TemporossInfoBox.lIIlllIIIIIlI[4]] = this.g(this.ac.D());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[6]]).right(String.format(lIIlllIIIIIIl[lIIlllIIIIIlI[7]], objectArray)).build());
        0;
        Object[] objectArray2 = new Object[lIIlllIIIIIlI[5]];
        objectArray2[TemporossInfoBox.lIIlllIIIIIlI[1]] = this.ac.C();
        objectArray2[TemporossInfoBox.lIIlllIIIIIlI[4]] = this.g(this.ac.C());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[8]]).right(String.format(lIIlllIIIIIIl[lIIlllIIIIIlI[9]], objectArray2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIIIIIIl[lIIlllIIIIIlI[10]]).right(String.valueOf(this.ac.E())).build());
        0;
        return super.render(graphics2D);
    }

    private static String lIllIIlIIIIlIIl(String var16, String var7) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIIlllIIIIIlI[5], var17);
            return new String(var11.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    public TemporossInfoBox(SquireTempoross squireTempoross, a a2) {
        this.ab = squireTempoross;
        this.ac = a2;
        this.ad = squireTempoross.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIllIIlIIIIlIII(String var8, String var2) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIIlI[11]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIlllIIIIIlI[5], var1);
            return new String(var18.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIIIllIl() {
        lIIlllIIIIIlI = new int[12];
        TemporossInfoBox.lIIlllIIIIIlI[0] = 0x2E ^ 0x24;
        TemporossInfoBox.lIIlllIIIIIlI[1] = (0x5D ^ 0x15 ^ (0x11 ^ 0x15)) & (0x4E ^ 0x69 ^ (0x42 ^ 0x29) ^ -1);
        TemporossInfoBox.lIIlllIIIIIlI[2] = 2 + 80 - -5 + 106;
        TemporossInfoBox.lIIlllIIIIIlI[3] = 0xB6 ^ 0xC3 ^ (0xDF ^ 0xBE);
        TemporossInfoBox.lIIlllIIIIIlI[4] = 1;
        TemporossInfoBox.lIIlllIIIIIlI[5] = 2;
        TemporossInfoBox.lIIlllIIIIIlI[6] = 3;
        TemporossInfoBox.lIIlllIIIIIlI[7] = 0xD9 ^ 0x9C ^ (0x53 ^ 0x12);
        TemporossInfoBox.lIIlllIIIIIlI[8] = 0x90 ^ 0x95;
        TemporossInfoBox.lIIlllIIIIIlI[9] = 1 ^ (0x87 ^ 0x80);
        TemporossInfoBox.lIIlllIIIIIlI[10] = 0xB7 ^ 0xB0;
        TemporossInfoBox.lIIlllIIIIIlI[11] = 0x6D ^ 0x43 ^ (4 ^ 0x22);
    }

    private static boolean lIllIIlIIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIlIIIIlIll() {
        lIIlllIIIIIIl = new String[lIIlllIIIIIlI[11]];
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[1]] = TemporossInfoBox."Squire Tempoross";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[4]] = TemporossInfoBox."Runtime:";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[5]] = TemporossInfoBox."Task: ";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[6]] = TemporossInfoBox."Number of games:";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[7]] = TemporossInfoBox."%d (%.1f/h)";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[8]] = TemporossInfoBox."Permits gained:";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[9]] = TemporossInfoBox."%d (%.1f/h)";
        TemporossInfoBox.lIIlllIIIIIIl[TemporossInfoBox.lIIlllIIIIIlI[10]] = TemporossInfoBox."Phase: ";
    }
}

