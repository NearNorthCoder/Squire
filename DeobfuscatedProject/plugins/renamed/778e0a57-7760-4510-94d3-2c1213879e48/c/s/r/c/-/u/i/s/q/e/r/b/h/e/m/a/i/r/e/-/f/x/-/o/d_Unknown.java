/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.client.game.WorldService
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.D_Unknown;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
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
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.client.game.WorldService;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class d_Unknown
extends OverlayPanel {
    private static final /* synthetic */ int s;
    private final /* synthetic */ SquireChambersConfig w;
    private static final /* synthetic */ String t;
    private final /* synthetic */ Client u;
    private final /* synthetic */ SquireChambersPlugin v;
    private /* synthetic */ boolean y;
    private final /* synthetic */ WorldService x;
    private static /* synthetic */ String[] lIlIIlIlIllI;
    private static /* synthetic */ int[] lIlIIlIlIlll;

    private static void llIllIIlIllIII() {
        lIlIIlIlIllI = new String[lIlIIlIlIlll[16]];
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[0]] = d."Configure";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[1]] = d."Raids overlay";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[3]] = d."Squire Chambers";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[6]] = d."Version: ";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[7]] = d."1.1.23";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[8]] = d."Runtime:";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[9]] = d."Task:";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[10]] = d."Runs:";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[11]] = d."%d (%.1f/h)";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[12]] = d."Points: ";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[2]] = d."%dk (%dk/h)";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[14]] = d."";
        d.lIlIIlIlIllI[d.lIlIIlIlIlll[15]] = d."Screenshot";
    }

    static {
        d.llIllIIlIllIIl();
        d.llIllIIlIllIII();
        s = lIlIIlIlIlll[0];
        t = lIlIIlIlIllI[lIlIIlIlIlll[15]];
    }

    @Inject
    private d(Client client, SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, WorldService worldService) {
        super((Plugin)squireChambersPlugin);
        this.y = lIlIIlIlIlll[0];
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.LOW);
        this.u = client;
        this.v = squireChambersPlugin;
        this.w = squireChambersConfig;
        this.x = worldService;
        this.addMenuEntry(MenuAction.RUNELITE_OVERLAY_CONFIG, lIlIIlIlIllI[lIlIIlIlIlll[0]], lIlIIlIlIllI[lIlIIlIlIlll[1]]);
        0;
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.v.getStarted(), Instant.now());
        if (d.llIllIIlIllIll(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        d var10;
        if (d.llIllIIlIllIlI(this.v.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var10.panelComponent.setBorder(new Rectangle(lIlIIlIlIlll[2], lIlIIlIlIlll[2], lIlIIlIlIlll[2], lIlIIlIlIlll[2]));
        String var8 = lIlIIlIlIllI[lIlIIlIlIlll[3]];
        var10.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var8).build());
        0;
        int var20 = lIlIIlIlIlll[4];
        var10.panelComponent.setPreferredSize(new Dimension(var20 + lIlIIlIlIlll[5], lIlIIlIlIlll[0]));
        var10.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[6]]).right(lIlIIlIlIllI[lIlIIlIlIlll[7]]).build());
        0;
        Duration var13 = Duration.between(var10.v.getStarted(), Instant.now());
        var10.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[8]]).right(Time.format((Duration)var13)).build());
        0;
        var10.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[9]]).right(var10.v.getManager().getCurrentTask()).build());
        0;
        if (d.llIllIIlIllIll(var10.w.extraInfo() ? 1 : 0)) {
            void var24;
            return super.render((Graphics2D)var24);
        }
        double d2 = this.e(this.v.B().W());
        Object[] objectArray = new Object[lIlIIlIlIlll[3]];
        objectArray[d.lIlIIlIlIlll[0]] = this.v.B().W();
        objectArray[d.lIlIIlIlIlll[1]] = d2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[10]]).right(String.format(lIlIIlIlIllI[lIlIIlIlIlll[11]], objectArray)).build());
        0;
        long l2 = this.d(this.v.B().U());
        Object[] objectArray2 = new Object[lIlIIlIlIlll[3]];
        objectArray2[d.lIlIIlIlIlll[0]] = this.v.B().U() / lIlIIlIlIlll[13];
        objectArray2[d.lIlIIlIlIlll[1]] = l2 / 1000L;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIlIlIllI[lIlIIlIlIlll[12]]).right(String.format(lIlIIlIlIllI[lIlIIlIlIlll[2]], objectArray2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left("Left HP: " + this.v.y().aG()).right("Right HP: " + this.v.y().aH()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left("Private Storage: " + D.bC().bF().size()).right(lIlIIlIlIllI[lIlIIlIlIlll[14]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left("Kindling dep: " + this.v.K()).right("Grubs dep: " + this.v.J()).build());
        0;
        return super.render(graphics2D);
    }

    private static boolean llIllIIlIlllII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean p() {
        return this.y;
    }

    private static String llIllIIlIlIllI(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var1 = var23.toCharArray();
        int var4 = lIlIIlIlIlll[0];
        char[] var6 = var22.toCharArray();
        int var17 = var6.length;
        int var9 = lIlIIlIlIlll[0];
        while (d.llIllIIlIlllII(var9, var17)) {
            char var11 = var6[var9];
            var15.append((char)(var11 ^ var1[var4 % var1.length]));
            0;
            ++var4;
            ++var9;
            0;
            
            return null;
        }
        return String.valueOf(var15);
    }

    private static String llIllIIlIlIlll(String var16, String var2) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIlll[11]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIlIIlIlIlll[3], var19);
            return new String(var18.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIlIllIlI(int n2) {
        return n2 != 0;
    }

    private static String llIllIIlIlIlIl(String var14, String var7) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIIlIlIlll[3], var21);
            return new String(var5.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static void llIllIIlIllIIl() {
        lIlIIlIlIlll = new int[17];
        d.lIlIIlIlIlll[0] = (0x1C ^ 0x2C) & ~(0x84 ^ 0xB4);
        d.lIlIIlIlIlll[1] = 1;
        d.lIlIIlIlIlll[2] = 0x5B ^ 0x4C ^ (0xAB ^ 0xB6);
        d.lIlIIlIlIlll[3] = 2;
        d.lIlIIlIlIlll[4] = 13 + 172 - 154 + 162;
        d.lIlIIlIlIlll[5] = 0x53 ^ 0x47;
        d.lIlIIlIlIlll[6] = 3;
        d.lIlIIlIlIlll[7] = 98 + 13 - -23 + 36 ^ 77 + 47 - 94 + 144;
        d.lIlIIlIlIlll[8] = 0x73 ^ 0x1A ^ (0x42 ^ 0x2E);
        d.lIlIIlIlIlll[9] = 0xB9 ^ 0xBF;
        d.lIlIIlIlIlll[10] = 0x56 ^ 0x51;
        d.lIlIIlIlIlll[11] = 0x63 ^ 0x7C ^ (0x79 ^ 0x6E);
        d.lIlIIlIlIlll[12] = 0xCF ^ 0xC6;
        d.lIlIIlIlIlll[13] = 0xFFFFD7FF & 0x2BE8;
        d.lIlIIlIlIlll[14] = 0xAB ^ 0xA0;
        d.lIlIIlIlIlll[15] = 176 + 79 - 158 + 90 ^ 53 + 44 - -63 + 23;
        d.lIlIIlIlIlll[16] = 0x5F ^ 0x52;
    }

    private static boolean llIllIIlIllIll(int n2) {
        return n2 == 0;
    }

    public double e(int n2) {
        Duration duration = Duration.between(this.v.getStarted(), Instant.now());
        if (d.llIllIIlIllIll(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }
}

