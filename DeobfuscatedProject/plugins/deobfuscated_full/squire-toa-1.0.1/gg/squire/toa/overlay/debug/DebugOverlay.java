/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  javax.inject.Singleton
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.toa.overlay.debug;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.toa.SquireTOA;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

@Singleton
public class DebugOverlay
extends OverlayPanel {
    private final /* synthetic */ TaskManager aK;
    private static /* synthetic */ int[] lIIllllllIIII;
    private static /* synthetic */ String[] lIIlllllIllll;
    private final /* synthetic */ SquireTOA aJ;

    private static void lIllIlIlIlIIIll() {
        lIIllllllIIII = new int[4];
        DebugOverlay.lIIllllllIIII[0] = (0x6A ^ 0x53) & ~(0xF8 ^ 0xC1);
        DebugOverlay.lIIllllllIIII[1] = 1;
        DebugOverlay.lIIllllllIIII[2] = 2;
        DebugOverlay.lIIllllllIIII[3] = 60 + 14 - -11 + 83 ^ 130 + 148 - 276 + 158;
    }

    private static boolean lIllIlIlIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIlIlIlIIIII(String var14, String var9) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIIllllllIIII[3]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIIllllllIIII[2], var4);
            return new String(var7.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        DebugOverlay.lIllIlIlIlIIIll();
        DebugOverlay.lIllIlIlIlIIIlI();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (DebugOverlay.lIllIlIlIlIIlII(this.aJ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllllIllll[lIIllllllIIII[0]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllllIllll[lIIllllllIIII[1]]).right(this.aK.getCurrentTask()).build());
        0;
        return super.render(graphics2D);
    }

    private static boolean lIllIlIlIlIIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected DebugOverlay(SquireTOA squireTOA) {
        this.aJ = squireTOA;
        this.aK = squireTOA.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    private static void lIllIlIlIlIIIlI() {
        lIIlllllIllll = new String[lIIllllllIIII[2]];
        DebugOverlay.lIIlllllIllll[DebugOverlay.lIIllllllIIII[0]] = DebugOverlay."Squire TOA";
        DebugOverlay.lIIlllllIllll[DebugOverlay.lIIllllllIIII[1]] = DebugOverlay."Performing Task";
    }

    private static String lIllIlIlIlIIIIl(String var6, String var1) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var13 = var1.toCharArray();
        int var11 = lIIllllllIIII[0];
        char[] var5 = var6.toCharArray();
        int var12 = var5.length;
        int var2 = lIIllllllIIII[0];
        while (DebugOverlay.lIllIlIlIlIIlIl(var2, var12)) {
            char var8 = var5[var2];
            var3.append((char)(var8 ^ var13[var11 % var13.length]));
            0;
            ++var11;
            ++var2;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }
}

