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
package gg.squire.mta.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.mta.SquireMTA;
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
import m.u.a.-.e.s.q.t.i.r.c;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class InfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] lllIlIlIllll;
    private static /* synthetic */ int[] lllIlIllIIII;
    private final /* synthetic */ SquireMTA ao;
    private final /* synthetic */ TaskManager ap;

    private static void lIIIllIIIllIlII() {
        lllIlIlIllll = new String[lllIlIllIIII[10]];
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[1]] = InfoBox."Squire MTA";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[2]] = InfoBox."Runtime:";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[3]] = InfoBox."Currently";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[4]] = InfoBox."Alchemy points: ";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[5]] = InfoBox."Enchantment points: ";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[6]] = InfoBox."Graveyard points: ";
        InfoBox.lllIlIlIllll[InfoBox.lllIlIllIIII[7]] = InfoBox."Telekinetic points: ";
    }

    private static String lIIIllIIIllIIll(String var18, String var5) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lllIlIllIIII[11]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lllIlIllIIII[3], var13);
            return new String(var8.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        InfoBox.lIIIllIIIllIlIl();
        InfoBox.lIIIllIIIllIlII();
    }

    private static void lIIIllIIIllIlIl() {
        lllIlIllIIII = new int[12];
        InfoBox.lllIlIllIIII[0] = 0x1B ^ 0x6F ^ (0x2A ^ 0x54);
        InfoBox.lllIlIllIIII[1] = (9 ^ 0x37 ^ (0 ^ 0x2F)) & (0x49 ^ 0x68 ^ (0xB6 ^ 0x86) ^ -1);
        InfoBox.lllIlIllIIII[2] = 1;
        InfoBox.lllIlIllIIII[3] = 2;
        InfoBox.lllIlIllIIII[4] = 3;
        InfoBox.lllIlIllIIII[5] = 0x10 ^ 0x14;
        InfoBox.lllIlIllIIII[6] = 103 + 77 - 143 + 152 ^ 50 + 8 - -95 + 31;
        InfoBox.lllIlIllIIII[7] = 0x4A ^ 0x4C;
        InfoBox.lllIlIllIIII[8] = 0xFFFFBB42 & 0x45BF;
        InfoBox.lllIlIllIIII[9] = 0x18 ^ 0x49 ^ (0xFD ^ 0xB8);
        InfoBox.lllIlIllIIII[10] = 0xBF ^ 0xB8;
        InfoBox.lllIlIllIIII[11] = 0x34 ^ 0x3C;
    }

    private static boolean lIIIllIIIllIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    private InfoBox(SquireMTA squireMTA) {
        this.ao = squireMTA;
        this.ap = squireMTA.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIIIllIIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllIIIllIIIl(String var12, String var4) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var4.toCharArray();
        int var19 = lllIlIllIIII[1];
        char[] var7 = var12.toCharArray();
        int var3 = var7.length;
        int var11 = lllIlIllIIII[1];
        while (InfoBox.lIIIllIIIllIlll(var11, var3)) {
            char var10 = var7[var11];
            var15.append((char)(var10 ^ var16[var19 % var16.length]));
            0;
            ++var19;
            ++var11;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (InfoBox.lIIIllIIIllIllI(this.ao.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.ao.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(lllIlIllIIII[0], lllIlIllIIII[0], lllIlIllIIII[0], lllIlIllIIII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIlIlIllll[lllIlIllIIII[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[2]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[3]]).right(String.valueOf(this.ap.getCurrentTask())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[4]]).right(this.ao.c(c.ALCHEMY) + "/" + this.ao.d(c.ALCHEMY)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[5]]).right(this.ao.c(c.ENCHANTMENT) + "/" + this.ao.d(c.ENCHANTMENT)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[6]]).right(this.ao.c(c.GRAVEYARD) + "/" + this.ao.d(c.GRAVEYARD)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIlIlIllll[lllIlIllIIII[7]]).right(this.ao.c(c.TELEKENETIC) + "/" + this.ao.d(c.TELEKENETIC)).build());
        0;
        int n2 = lllIlIllIIII[8];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIlIllIIII[9], lllIlIllIIII[1]));
        return super.render(graphics2D);
    }

    private static String lIIIllIIIllIIlI(String var2, String var1) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lllIlIllIIII[3], var6);
            return new String(var17.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

