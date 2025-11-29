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
package gg.squire.quest.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireQuester;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class QuesterInfoBox
extends OverlayPanel {
    private static /* synthetic */ int[] lIIIllIIIlIIl;
    private static /* synthetic */ String[] lIIIllIIIlIII;
    private final /* synthetic */ TaskManager af;

    private static void lIlIIIIllIIllll() {
        lIIIllIIIlIIl = new int[7];
        QuesterInfoBox.lIIIllIIIlIIl[0] = (0xE3 ^ 0xBD) & ~(0xE3 ^ 0xBD);
        QuesterInfoBox.lIIIllIIIlIIl[1] = 1;
        QuesterInfoBox.lIIIllIIIlIIl[2] = 2;
        QuesterInfoBox.lIIIllIIIlIIl[3] = 3;
        QuesterInfoBox.lIIIllIIIlIIl[4] = -(0xFFFFF166 & 0x5EDF) & (0xFFFFD17F & 0x7FC7);
        QuesterInfoBox.lIIIllIIIlIIl[5] = 176 + 196 - 360 + 185 ^ 21 + 79 - 29 + 122;
        QuesterInfoBox.lIIIllIIIlIIl[6] = 0x23 ^ 0x2B;
    }

    private static String lIlIIIIllIIlIll(String var14, String var5) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIIllIIIlIIl[6]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIIIllIIIlIIl[2], var11);
            return new String(var16.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIIllIIIlIII[lIIIllIIIlIIl[0]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIllIIIlIII[lIIIllIIIlIIl[1]]).right(lIIIllIIIlIII[lIIIllIIIlIIl[2]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIIllIIIlIII[lIIIllIIIlIIl[3]]).right(this.af.getCurrentTask()).build());
        0;
        int n2 = lIIIllIIIlIIl[4];
        this.panelComponent.setPreferredSize(new Dimension(n2, lIIIllIIIlIIl[0]));
        return super.render(graphics2D);
    }

    private static String lIlIIIIllIIllIl(String var13, String var18) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var2 = var18.toCharArray();
        int var8 = lIIIllIIIlIIl[0];
        char[] var9 = var13.toCharArray();
        int var4 = var9.length;
        int var6 = lIIIllIIIlIIl[0];
        while (QuesterInfoBox.lIlIIIIllIlIIII(var6, var4)) {
            char var10 = var9[var6];
            var17.append((char)(var10 ^ var2[var8 % var2.length]));
            0;
            ++var8;
            ++var6;
            0;
            
            return null;
        }
        return String.valueOf(var17);
    }

    private static void lIlIIIIllIIlllI() {
        lIIIllIIIlIII = new String[lIIIllIIIlIIl[5]];
        QuesterInfoBox.lIIIllIIIlIII[QuesterInfoBox.lIIIllIIIlIIl[0]] = QuesterInfoBox."Squire Quester";
        QuesterInfoBox.lIIIllIIIlIII[QuesterInfoBox.lIIIllIIIlIIl[1]] = QuesterInfoBox."Version";
        QuesterInfoBox.lIIIllIIIlIII[QuesterInfoBox.lIIIllIIIlIIl[2]] = QuesterInfoBox."0.1.3";
        QuesterInfoBox.lIIIllIIIlIII[QuesterInfoBox.lIIIllIIIlIIl[3]] = QuesterInfoBox."Task: ";
    }

    private static boolean lIlIIIIllIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        QuesterInfoBox.lIlIIIIllIIllll();
        QuesterInfoBox.lIlIIIIllIIlllI();
    }

    private static String lIlIIIIllIIllII(String var7, String var1) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIIIllIIIlIIl[2], var3);
            return new String(var19.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    @Inject
    public QuesterInfoBox(SquireQuester squireQuester) {
        this.af = squireQuester.getManager();
        this.setPosition(OverlayPosition.TOP_LEFT);
    }
}

