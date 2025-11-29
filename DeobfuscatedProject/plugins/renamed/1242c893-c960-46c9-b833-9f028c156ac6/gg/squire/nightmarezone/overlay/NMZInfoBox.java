/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.nightmarezone.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.nightmarezone.SquireNightmareZone;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class NMZInfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] lIIIlIIIllIIl;
    private static /* synthetic */ int[] lIIIlIIIllIlI;
    private final /* synthetic */ SquireNightmareZone z;
    private final /* synthetic */ TaskManager A;

    private static String lIIllllIlIIllll(String var6, String var5) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIIIlIIIllIlI[5], var8);
            return new String(var1.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllllIlIlIIll(int n2) {
        return n2 != 0;
    }

    private static void lIIllllIlIlIIlI() {
        lIIIlIIIllIlI = new int[7];
        NMZInfoBox.lIIIlIIIllIlI[0] = 0x5D ^ 0x57;
        NMZInfoBox.lIIIlIIIllIlI[1] = (0x43 ^ 0x7B ^ (0x68 ^ 0xD)) & (0xC ^ 0x1A ^ (0xE6 ^ 0xAD) ^ -1);
        NMZInfoBox.lIIIlIIIllIlI[2] = 76 + 147 - 44 + 14;
        NMZInfoBox.lIIIlIIIllIlI[3] = 0x75 ^ 7 ^ (0xF8 ^ 0x9E);
        NMZInfoBox.lIIIlIIIllIlI[4] = 1;
        NMZInfoBox.lIIIlIIIllIlI[5] = 2;
        NMZInfoBox.lIIIlIIIllIlI[6] = 3;
    }

    @Inject
    public NMZInfoBox(SquireNightmareZone squireNightmareZone) {
        this.z = squireNightmareZone;
        this.A = squireNightmareZone.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIllllIlIlIIII(String var13, String var4) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var2 = var4.toCharArray();
        int var14 = lIIIlIIIllIlI[1];
        char[] var9 = var13.toCharArray();
        int var11 = var9.length;
        int var10 = lIIIlIIIllIlI[1];
        while (NMZInfoBox.lIIllllIlIlIlII(var10, var11)) {
            char var7 = var9[var10];
            var3.append((char)(var7 ^ var2[var14 % var2.length]));
            0;
            ++var14;
            ++var10;
            0;
            if ((0x11 ^ 4 ^ (0x76 ^ 0x67)) > 3) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static void lIIllllIlIlIIIl() {
        lIIIlIIIllIIl = new String[lIIIlIIIllIlI[6]];
        NMZInfoBox.lIIIlIIIllIIl[NMZInfoBox.lIIIlIIIllIlI[1]] = NMZInfoBox."Squire NMZ";
        NMZInfoBox.lIIIlIIIllIIl[NMZInfoBox.lIIIlIIIllIlI[4]] = NMZInfoBox."Runtime:";
        NMZInfoBox.lIIIlIIIllIIl[NMZInfoBox.lIIIlIIIllIlI[5]] = NMZInfoBox."Task: ";
    }

    static {
        NMZInfoBox.lIIllllIlIlIIlI();
        NMZInfoBox.lIIllllIlIlIIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        if (NMZInfoBox.lIIllllIlIlIIll(this.z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIIIlIIIllIlI[0], lIIIlIIIllIlI[0], lIIIlIIIllIlI[0], lIIIlIIIllIlI[0]));
        String string = lIIIlIIIllIIl[lIIIlIIIllIlI[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = lIIIlIIIllIlI[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIIlIIIllIlI[3], lIIIlIIIllIlI[1]));
        Duration duration = Duration.between(this.z.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIIllIIl[lIIIlIIIllIlI[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIIllIIl[lIIIlIIIllIlI[5]]).right(this.A.getCurrentTask()).build());
        0;
        return super.render(graphics2D);
    }
}

