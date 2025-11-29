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
package gg.squire.sepulchre.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
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

public class SquireSepulchreInfoBox
extends OverlayPanel {
    private final /* synthetic */ SquireSepulchre aa;
    private static /* synthetic */ String[] lllIIlIllIII;
    private static /* synthetic */ int[] lllIIlIllIIl;
    private final /* synthetic */ TaskManager ab;
    private final /* synthetic */ SquireSepulchreConfig ac;

    private static boolean lIIIlIlIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlIIIlIlll(int n2) {
        return n2 != 0;
    }

    private static String lIIIlIlIIIlIIlI(String var5, String var2) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lllIIlIllIIl[9]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lllIIlIllIIl[5], var9);
            return new String(var18.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    static {
        SquireSepulchreInfoBox.lIIIlIlIIIlIllI();
        SquireSepulchreInfoBox.lIIIlIlIIIlIlIl();
    }

    private static String lIIIlIlIIIlIIll(String var3, String var4) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var1 = var4.toCharArray();
        int var15 = lllIIlIllIIl[1];
        char[] var12 = var3.toCharArray();
        int var16 = var12.length;
        int var10 = lllIIlIllIIl[1];
        while (SquireSepulchreInfoBox.lIIIlIlIIIllIIl(var10, var16)) {
            char var11 = var12[var10];
            var8.append((char)(var11 ^ var1[var15 % var1.length]));
            0;
            ++var15;
            ++var10;
            0;
            if (((6 ^ 0x2A) & ~(0x21 ^ 0xD)) != -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static String lIIIlIlIIIlIlII(String var7, String var14) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lllIIlIllIIl[5], var17);
            return new String(var6.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIlIIIlIlIl() {
        lllIIlIllIII = new String[lllIIlIllIIl[8]];
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[1]] = SquireSepulchreInfoBox."Squire Hallowed Sepulchre";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[4]] = SquireSepulchreInfoBox."Version:";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[5]] = SquireSepulchreInfoBox."1.2.10";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[6]] = SquireSepulchreInfoBox."Runtime:";
        SquireSepulchreInfoBox.lllIIlIllIII[SquireSepulchreInfoBox.lllIIlIllIIl[7]] = SquireSepulchreInfoBox."Obstacle:";
    }

    @Inject
    public SquireSepulchreInfoBox(SquireSepulchre squireSepulchre, TaskManager taskManager, SquireSepulchreConfig squireSepulchreConfig) {
        this.aa = squireSepulchre;
        this.ab = squireSepulchre.getManager();
        this.ac = squireSepulchreConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public long b(int n2) {
        Duration duration = Duration.between(this.aa.getStarted(), Instant.now());
        if (SquireSepulchreInfoBox.lIIIlIlIIIllIII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIIIlIlIIIllIII(int n2) {
        return n2 == 0;
    }

    private static void lIIIlIlIIIlIllI() {
        lllIIlIllIIl = new int[10];
        SquireSepulchreInfoBox.lllIIlIllIIl[0] = 0x3E ^ 0x33 ^ (0x98 ^ 0x9F);
        SquireSepulchreInfoBox.lllIIlIllIIl[1] = (0xB8 ^ 0xAB) & ~(0x65 ^ 0x76);
        SquireSepulchreInfoBox.lllIIlIllIIl[2] = 65 + 182 - 129 + 75;
        SquireSepulchreInfoBox.lllIIlIllIIl[3] = 0xF ^ 0x1B;
        SquireSepulchreInfoBox.lllIIlIllIIl[4] = 1;
        SquireSepulchreInfoBox.lllIIlIllIIl[5] = 2;
        SquireSepulchreInfoBox.lllIIlIllIIl[6] = 3;
        SquireSepulchreInfoBox.lllIIlIllIIl[7] = 45 + 38 - 51 + 120 ^ 154 + 96 - 118 + 24;
        SquireSepulchreInfoBox.lllIIlIllIIl[8] = 16 + 106 - 3 + 8 ^ (0x5F ^ 0x25);
        SquireSepulchreInfoBox.lllIIlIllIIl[9] = 0x2F ^ 0x27;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (SquireSepulchreInfoBox.lIIIlIlIIIlIlll(this.aa.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lllIIlIllIIl[0], lllIIlIllIIl[0], lllIIlIllIIl[0], lllIIlIllIIl[0]));
        String string = lllIIlIllIII[lllIIlIllIIl[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = lllIIlIllIIl[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIIlIllIIl[3], lllIIlIllIIl[1]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[4]]).right(lllIIlIllIII[lllIIlIllIIl[5]]).build());
        0;
        Duration duration = Duration.between(this.aa.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[6]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIlIllIII[lllIIlIllIIl[7]]).right(this.aa.getName()).build());
        0;
        return super.render(graphics2D);
    }
}

