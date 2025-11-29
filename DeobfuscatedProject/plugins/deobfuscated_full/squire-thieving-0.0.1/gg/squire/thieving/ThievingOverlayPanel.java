/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskManager
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.thieving;

import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
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
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d;

@Singleton
public class ThievingOverlayPanel
extends OverlayPanel {
    private final /* synthetic */ SquireThievingConfig n;
    private static /* synthetic */ String[] lIIllIllIllIl;
    private static /* synthetic */ int[] lIIllIllIlllI;
    private final /* synthetic */ SquireThieving m;

    static {
        ThievingOverlayPanel.lIllIIIllIIIIIl();
        ThievingOverlayPanel.lIllIIIllIIIIII();
    }

    private void a(Graphics2D graphics2D) {
        d d2 = this.m.b();
        if (ThievingOverlayPanel.lIllIIIllIIIllI((Object)d2)) {
            return;
        }
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[12]]).right(d2.v()).build());
        0;
    }

    private static String lIllIIIlIllllll(String var18, String var16) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(lIIllIllIlllI[5], var10);
            return new String(var25.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllIIIlII(Object object) {
        return object != null;
    }

    @Inject
    public ThievingOverlayPanel(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.m = squireThieving;
        this.n = squireThievingConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void lIllIIIllIIIIIl() {
        lIIllIllIlllI = new int[14];
        ThievingOverlayPanel.lIIllIllIlllI[0] = 0xA4 ^ 0xAE;
        ThievingOverlayPanel.lIIllIllIlllI[1] = -(0xFFFFBF36 & 0x58DF) & (0xFFFF9B5F & 0x7DB7);
        ThievingOverlayPanel.lIIllIllIlllI[2] = 0x9B ^ 0xA4 ^ (0x6A ^ 0x41);
        ThievingOverlayPanel.lIIllIllIlllI[3] = (0x11 ^ 0x68 ^ (0xF0 ^ 0x9C)) & (52 + 75 - 10 + 12 ^ 116 + 52 - 57 + 37 ^ -1);
        ThievingOverlayPanel.lIIllIllIlllI[4] = 1;
        ThievingOverlayPanel.lIIllIllIlllI[5] = 2;
        ThievingOverlayPanel.lIIllIllIlllI[6] = 3;
        ThievingOverlayPanel.lIIllIllIlllI[7] = 0x46 ^ 0x42;
        ThievingOverlayPanel.lIIllIllIlllI[8] = 0x1A ^ 0x1F;
        ThievingOverlayPanel.lIIllIllIlllI[9] = 0xA8 ^ 0xAE;
        ThievingOverlayPanel.lIIllIllIlllI[10] = -1;
        ThievingOverlayPanel.lIIllIllIlllI[11] = 0x21 ^ 0x6C ^ (0x5F ^ 0x15);
        ThievingOverlayPanel.lIIllIllIlllI[12] = 2 ^ 0x2A ^ (0x44 ^ 0x64);
        ThievingOverlayPanel.lIIllIllIlllI[13] = 0x52 ^ 0x13 ^ (0xF1 ^ 0xB9);
    }

    private static boolean lIllIIIllIIIllI(Object object) {
        return object == null;
    }

    private static boolean lIllIIIllIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIIllIIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static void lIllIIIllIIIIII() {
        lIIllIllIllIl = new String[lIIllIllIlllI[13]];
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[3]] = ThievingOverlayPanel."Squire Thieving";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[4]] = ThievingOverlayPanel."Version:";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[5]] = ThievingOverlayPanel."1.4.6";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[6]] = ThievingOverlayPanel."Runtime:";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[7]] = ThievingOverlayPanel."Method";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[8]] = ThievingOverlayPanel."Banking: ";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[9]] = ThievingOverlayPanel."Performing";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[11]] = ThievingOverlayPanel."Saved world";
        ThievingOverlayPanel.lIIllIllIllIl[ThievingOverlayPanel.lIIllIllIlllI[12]] = ThievingOverlayPanel."Target";
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        TaskManager var19;
        ThievingOverlayPanel var2;
        if (ThievingOverlayPanel.lIllIIIllIIIIlI(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var2.panelComponent.setBorder(new Rectangle(lIIllIllIlllI[0], lIIllIllIlllI[0], lIIllIllIlllI[0], lIIllIllIlllI[0]));
        int var13 = lIIllIllIlllI[1];
        var2.panelComponent.setPreferredSize(new Dimension(var13 + lIIllIllIlllI[2], lIIllIllIlllI[3]));
        String var3 = lIIllIllIllIl[lIIllIllIlllI[3]];
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var3).build());
        0;
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[4]]).right(lIIllIllIllIl[lIIllIllIlllI[5]]).build());
        0;
        Duration var21 = Duration.between(var2.m.getStarted(), Instant.now());
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[6]]).right(Time.format((Duration)var21)).build());
        0;
        var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[7]]).right(var2.n.method().toString()).build());
        0;
        if (ThievingOverlayPanel.lIllIIIllIIIIll((Object)var2.n.method(), (Object)b.PICKPOCKETING)) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[8]]).right(String.valueOf(var2.m.j())).build());
            0;
        }
        if (ThievingOverlayPanel.lIllIIIllIIIlII(var19 = var2.m.getManager())) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[9]]).right(var19.getCurrentTask()).build());
            0;
            if (ThievingOverlayPanel.lIllIIIllIIIIll((Object)var2.n.method(), (Object)b.BLACK_JACK)) {
                void var23;
                var2.a((Graphics2D)var23);
            }
        }
        if (ThievingOverlayPanel.lIllIIIllIIIIlI(var2.m.e()) && ThievingOverlayPanel.lIllIIIllIIIlIl(var2.m.e(), lIIllIllIlllI[10])) {
            var2.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIllIllIl[lIIllIllIlllI[11]]).right(String.valueOf(var2.m.e())).build());
            0;
        }
        return super.render(graphics2D);
    }

    private static String lIllIIIlIlllllI(String var24, String var15) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIIllIllIlllI[12]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIIllIllIlllI[5], var5);
            return new String(var4.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIllllIl(String var22, String var9) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var7 = var9.toCharArray();
        int var1 = lIIllIllIlllI[3];
        char[] var17 = var22.toCharArray();
        int var8 = var17.length;
        int var6 = lIIllIllIlllI[3];
        while (ThievingOverlayPanel.lIllIIIllIIIlll(var6, var8)) {
            char var12 = var17[var6];
            var11.append((char)(var12 ^ var7[var1 % var7.length]));
            0;
            ++var1;
            ++var6;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean lIllIIIllIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIllIIIIlI(int n2) {
        return n2 != 0;
    }
}

