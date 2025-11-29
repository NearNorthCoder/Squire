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
package gg.squire.minigame.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigame.SquirePestControl;
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

public class InfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] lIIIlIIlllIlI;
    private final /* synthetic */ SquirePestControl o;
    private final /* synthetic */ TaskManager n;
    private static /* synthetic */ int[] lIIIlIIlllllI;

    static {
        InfoBox.lIIllllllIIlIII();
        InfoBox.lIIllllllIIIllI();
    }

    public long d(int n) {
        Duration duration = Duration.between(this.o.getStarted(), Instant.now());
        if (InfoBox.lIIllllllIIlIlI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (InfoBox.lIIllllllIIlIIl(this.o.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.o.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIlIIlllIlI[lIIIlIIlllllI[0]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[1]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[2]]).right(String.valueOf(this.o.b())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[3]]).right(String.valueOf(this.o.c())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIlIIlllIlI[lIIIlIIlllllI[4]]).right(String.valueOf(this.d(this.o.c()))).build());
        0;
        int n = lIIIlIIlllllI[5];
        this.panelComponent.setPreferredSize(new Dimension(n, lIIIlIIlllllI[0]));
        return super.render(graphics2D);
    }

    private static void lIIllllllIIIllI() {
        lIIIlIIlllIlI = new String[lIIIlIIlllllI[6]];
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[0]] = InfoBox."Squire Pest Control";
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[1]] = InfoBox."Runtime";
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[2]] = InfoBox."Starting Points: ";
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[3]] = InfoBox."Points Gained: ";
        InfoBox.lIIIlIIlllIlI[InfoBox.lIIIlIIlllllI[4]] = InfoBox."Points Per Hour: ";
    }

    private static boolean lIIllllllIIlIIl(int n) {
        return n != 0;
    }

    private static String lIIllllllIIIIlI(String var10, String var3) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIIIlIIlllllI[2], var1);
            return new String(var2.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllllIIlIlI(int n) {
        return n == 0;
    }

    @Inject
    public InfoBox(TaskManager taskManager, SquirePestControl squirePestControl) {
        this.n = taskManager;
        this.o = squirePestControl;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static String lIIllllllIIIlIl(String var6, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIIlIIlllllI[7]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIIIlIIlllllI[2], var5);
            return new String(var7.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void lIIllllllIIlIII() {
        lIIIlIIlllllI = new int[8];
        InfoBox.lIIIlIIlllllI[0] = (146 + 7 - 104 + 164 ^ 70 + 35 - 67 + 110) & (6 + 197 - 67 + 83 ^ 91 + 57 - 49 + 55 ^ -1);
        InfoBox.lIIIlIIlllllI[1] = 1;
        InfoBox.lIIIlIIlllllI[2] = 2;
        InfoBox.lIIIlIIlllllI[3] = 3;
        InfoBox.lIIIlIIlllllI[4] = 0x6C ^ 0x68;
        InfoBox.lIIIlIIlllllI[5] = 0xFFFFFFE7 & 0x11A;
        InfoBox.lIIIlIIlllllI[6] = 0x4B ^ 0x44 ^ (0x36 ^ 0x3C);
        InfoBox.lIIIlIIlllllI[7] = 17 + 53 - -22 + 35 ^ (0x14 ^ 0x63);
    }
}

