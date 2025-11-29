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
package gg.squire.gorillas.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.gorillas.SquireGorillaPlugin;
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

public class GorillaInfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] llIIlIlIIIIl;
    private final /* synthetic */ TaskManager Q;
    private final /* synthetic */ SquireGorillaPlugin P;
    private static /* synthetic */ int[] llIIlIlIIIlI;

    public Dimension render(Graphics2D graphics2D) {
        if (GorillaInfoBox.lllllIlIlIIIIl(this.P.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.P.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llIIlIlIIIlI[0], llIIlIlIIIlI[0], llIIlIlIIIlI[0], llIIlIlIIIlI[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIIlIlIIIIl[llIIlIlIIIlI[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[2]]).right(llIIlIlIIIIl[llIIlIlIIIlI[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[5]]).right(this.Q.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIlIlIIIIl[llIIlIlIIIlI[6]]).right(String.valueOf(this.P.i())).build());
        0;
        int n2 = llIIlIlIIIlI[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llIIlIlIIIlI[8], llIIlIlIIIlI[1]));
        return super.render(graphics2D);
    }

    private static String lllllIlIIlllIl(String var16, String var13) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), llIIlIlIIIlI[10]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llIIlIlIIIlI[3], var4);
            return new String(var11.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static String lllllIlIIlllII(String var9, String var17) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(llIIlIlIIIlI[3], var7);
            return new String(var1.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    static {
        GorillaInfoBox.lllllIlIlIIIII();
        GorillaInfoBox.lllllIlIIlllll();
    }

    private static boolean lllllIlIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllllIlIIlllll() {
        llIIlIlIIIIl = new String[llIIlIlIIIlI[9]];
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[1]] = GorillaInfoBox."Squire Gorillas";
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[2]] = GorillaInfoBox."Version";
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[3]] = GorillaInfoBox."0.3.1";
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[4]] = GorillaInfoBox."Runtime";
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[5]] = GorillaInfoBox."Task";
        GorillaInfoBox.llIIlIlIIIIl[GorillaInfoBox.llIIlIlIIIlI[6]] = GorillaInfoBox."Kills";
    }

    @Inject
    private GorillaInfoBox(SquireGorillaPlugin squireGorillaPlugin) {
        this.P = squireGorillaPlugin;
        this.Q = squireGorillaPlugin.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lllllIlIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static String lllllIlIIllllI(String var3, String var12) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var6 = var12.toCharArray();
        int var2 = llIIlIlIIIlI[1];
        char[] var15 = var3.toCharArray();
        int var10 = var15.length;
        int var18 = llIIlIlIIIlI[1];
        while (GorillaInfoBox.lllllIlIlIIIlI(var18, var10)) {
            char var14 = var15[var18];
            var8.append((char)(var14 ^ var6[var2 % var6.length]));
            0;
            ++var2;
            ++var18;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void lllllIlIlIIIII() {
        llIIlIlIIIlI = new int[11];
        GorillaInfoBox.llIIlIlIIIlI[0] = 0x35 ^ 0x3F;
        GorillaInfoBox.llIIlIlIIIlI[1] = (0x72 ^ 0x53) & ~(0xA ^ 0x2B);
        GorillaInfoBox.llIIlIlIIIlI[2] = 1;
        GorillaInfoBox.llIIlIlIIIlI[3] = 2;
        GorillaInfoBox.llIIlIlIIIlI[4] = 3;
        GorillaInfoBox.llIIlIlIIIlI[5] = 0x24 ^ 0x20;
        GorillaInfoBox.llIIlIlIIIlI[6] = 0x5E ^ 0x5B;
        GorillaInfoBox.llIIlIlIIIlI[7] = -(0xFFFFE7FE & 0x1EFF) & (0xFFFFFFFF & 0x7FF);
        GorillaInfoBox.llIIlIlIIIlI[8] = 0x5A ^ 0x18 ^ (0xE8 ^ 0xBE);
        GorillaInfoBox.llIIlIlIIIlI[9] = 0x1D ^ 0x4E ^ (0x56 ^ 3);
        GorillaInfoBox.llIIlIlIIIlI[10] = 0x5B ^ 0x53;
    }
}

