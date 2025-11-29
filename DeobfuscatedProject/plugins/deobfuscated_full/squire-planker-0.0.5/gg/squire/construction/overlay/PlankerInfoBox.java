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
package gg.squire.construction.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.construction.SquirePlankerConfig;
import gg.squire.construction.SquirePlankerPlugin;
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

public class PlankerInfoBox
extends OverlayPanel {
    private final /* synthetic */ SquirePlankerConfig k;
    private static /* synthetic */ String[] llllllIIIIIl;
    private static /* synthetic */ int[] llllllIIIIlI;
    private final /* synthetic */ TaskManager j;
    private final /* synthetic */ SquirePlankerPlugin i;

    private static void lIIlIIllllIlllI() {
        llllllIIIIlI = new int[10];
        PlankerInfoBox.llllllIIIIlI[0] = 0x29 ^ 0x23;
        PlankerInfoBox.llllllIIIIlI[1] = (0x63 ^ 0x40) & ~(0x2E ^ 0xD);
        PlankerInfoBox.llllllIIIIlI[2] = 1;
        PlankerInfoBox.llllllIIIIlI[3] = 2;
        PlankerInfoBox.llllllIIIIlI[4] = 3;
        PlankerInfoBox.llllllIIIIlI[5] = 0x5B ^ 0x5F;
        PlankerInfoBox.llllllIIIIlI[6] = -(0xFFFFFD1F & 0x1EF2) & (0xFFFF9F9B & 0x7D77);
        PlankerInfoBox.llllllIIIIlI[7] = 0x8E ^ 0x9A;
        PlankerInfoBox.llllllIIIIlI[8] = 0x7C ^ 0x79;
        PlankerInfoBox.llllllIIIIlI[9] = 80 + 102 - 32 + 41 ^ 102 + 54 - 75 + 102;
    }

    private static void lIIlIIllllIllIl() {
        llllllIIIIIl = new String[llllllIIIIlI[8]];
        PlankerInfoBox.llllllIIIIIl[PlankerInfoBox.llllllIIIIlI[1]] = PlankerInfoBox."Squire Planker";
        PlankerInfoBox.llllllIIIIIl[PlankerInfoBox.llllllIIIIlI[2]] = PlankerInfoBox."Version";
        PlankerInfoBox.llllllIIIIIl[PlankerInfoBox.llllllIIIIlI[3]] = PlankerInfoBox."0.1.1";
        PlankerInfoBox.llllllIIIIIl[PlankerInfoBox.llllllIIIIlI[4]] = PlankerInfoBox."Runtime";
        PlankerInfoBox.llllllIIIIIl[PlankerInfoBox.llllllIIIIlI[5]] = PlankerInfoBox."Task: ";
    }

    private static String lIIlIIllllIlIlI(String var7, String var3) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llllllIIIIlI[3], var11);
            return new String(var18.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllllIllII(String var14, String var17) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var15 = var17.toCharArray();
        int var6 = llllllIIIIlI[1];
        char[] var16 = var14.toCharArray();
        int var10 = var16.length;
        int var9 = llllllIIIIlI[1];
        while (PlankerInfoBox.lIIlIIlllllIIIl(var9, var10)) {
            char var5 = var16[var9];
            var12.append((char)(var5 ^ var15[var6 % var15.length]));
            0;
            ++var6;
            ++var9;
            0;
            if (3 > ((0xB3 ^ 0xA0) & ~(0x35 ^ 0x26))) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean lIIlIIlllllIIIl(int n, int n2) {
        return n < n2;
    }

    @Inject
    private PlankerInfoBox(SquirePlankerPlugin squirePlankerPlugin, SquirePlankerConfig squirePlankerConfig) {
        this.i = squirePlankerPlugin;
        this.j = squirePlankerPlugin.getManager();
        this.k = squirePlankerConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long a(int n) {
        Duration duration = Duration.between(this.i.getStarted(), Instant.now());
        if (PlankerInfoBox.lIIlIIlllllIIII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIlIIlllllIIII(int n) {
        return n == 0;
    }

    private static String lIIlIIllllIlIll(String var4, String var19) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llllllIIIIlI[9]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llllllIIIIlI[3], var2);
            return new String(var1.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllllIllll(int n) {
        return n != 0;
    }

    static {
        PlankerInfoBox.lIIlIIllllIlllI();
        PlankerInfoBox.lIIlIIllllIllIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (PlankerInfoBox.lIIlIIllllIllll(this.i.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.i.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllllIIIIlI[0], llllllIIIIlI[0], llllllIIIIlI[0], llllllIIIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllllIIIIIl[llllllIIIIlI[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIIIIl[llllllIIIIlI[2]]).right(llllllIIIIIl[llllllIIIIlI[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIIIIl[llllllIIIIlI[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIIIIl[llllllIIIIlI[5]]).right(this.j.getCurrentTask()).build());
        0;
        int n = llllllIIIIlI[6];
        this.panelComponent.setPreferredSize(new Dimension(n + llllllIIIIlI[7], llllllIIIIlI[1]));
        return super.render(graphics2D);
    }
}

