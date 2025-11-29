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
package gg.squire.thieving.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.thieving.SquirePlunder;
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
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a;

public class PlunderInfoBox
extends OverlayPanel {
    private final /* synthetic */ SquirePlunder o;
    private final /* synthetic */ a q;
    private static /* synthetic */ String[] llllllIIlIll;
    private final /* synthetic */ TaskManager p;
    private static /* synthetic */ int[] llllllIIllII;

    private static String lIIlIlIIIIlIllI(String var19, String var6) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llllllIIllII[3], var9);
            return new String(var18.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIllIll(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (PlunderInfoBox.lIIlIlIIIIllIll(this.o.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.o.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllllIIllII[0], llllllIIllII[0], llllllIIllII[0], llllllIIllII[0]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_YELLOW).text(llllllIIlIll[llllllIIllII[1]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[2]]).right(llllllIIlIll[llllllIIllII[3]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[5]]).right(String.valueOf(this.q.e())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(llllllIIlIll[llllllIIllII[6]]).right(this.p.getCurrentTask()).build());
        0;
        int n2 = llllllIIllII[7];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llllllIIllII[8], llllllIIllII[1]));
        return super.render(graphics2D);
    }

    private static String lIIlIlIIIIllIII(String var15, String var12) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), llllllIIllII[10]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llllllIIllII[3], var11);
            return new String(var10.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIIIllIIl() {
        llllllIIlIll = new String[llllllIIllII[9]];
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[1]] = PlunderInfoBox."Squire Pyramid Plunder";
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[2]] = PlunderInfoBox."Version";
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[3]] = PlunderInfoBox."1.0.0";
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[4]] = PlunderInfoBox."Runtime";
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[5]] = PlunderInfoBox."Sceptres found: ";
        PlunderInfoBox.llllllIIlIll[PlunderInfoBox.llllllIIllII[6]] = PlunderInfoBox."Task: ";
    }

    @Inject
    private PlunderInfoBox(SquirePlunder squirePlunder, a a2) {
        this.o = squirePlunder;
        this.p = squirePlunder.getManager();
        this.q = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIIlIlIIIIllIlI() {
        llllllIIllII = new int[11];
        PlunderInfoBox.llllllIIllII[0] = 0xA8 ^ 0xA2;
        PlunderInfoBox.llllllIIllII[1] = (0x7A ^ 0x1F ^ (0x10 ^ 0x23)) & (0xAA ^ 0x9C ^ (0x36 ^ 0x56) ^ -1);
        PlunderInfoBox.llllllIIllII[2] = 1;
        PlunderInfoBox.llllllIIllII[3] = 2;
        PlunderInfoBox.llllllIIllII[4] = 3;
        PlunderInfoBox.llllllIIllII[5] = 0xB2 ^ 0x86 ^ (0x7E ^ 0x4E);
        PlunderInfoBox.llllllIIllII[6] = 0x5E ^ 0x7C ^ (0xB1 ^ 0x96);
        PlunderInfoBox.llllllIIllII[7] = 0xFFFF8DAF & 0x7352;
        PlunderInfoBox.llllllIIllII[8] = 0x7D ^ 0x69;
        PlunderInfoBox.llllllIIllII[9] = 0x76 ^ 0x70;
        PlunderInfoBox.llllllIIllII[10] = 0x9C ^ 0x94;
    }

    static {
        PlunderInfoBox.lIIlIlIIIIllIlI();
        PlunderInfoBox.lIIlIlIIIIllIIl();
    }

    private static String lIIlIlIIIIlIlll(String var4, String var8) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var14 = var8.toCharArray();
        int var3 = llllllIIllII[1];
        char[] var13 = var4.toCharArray();
        int var1 = var13.length;
        int var5 = llllllIIllII[1];
        while (PlunderInfoBox.lIIlIlIIIIlllII(var5, var1)) {
            char var16 = var13[var5];
            var7.append((char)(var16 ^ var14[var3 % var14.length]));
            0;
            ++var3;
            ++var5;
            0;
            if (2 <= (0x2D ^ 0x29)) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean lIIlIlIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }
}

