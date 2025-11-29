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
package gg.squire.barrows.overlay;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.TaskManager;
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
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.c_Unknown;

public class BarrowsInfoBox
extends OverlayPanel {
    private final /* synthetic */ int B = 77566;
    private final /* synthetic */ SquireBarrows y;
    private final /* synthetic */ TaskManager z;
    private final /* synthetic */ c A;
    private static /* synthetic */ int[] llllIIIlIIl;
    private static /* synthetic */ String[] lllIllllllI;

    private static int lIllIIllIlllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    static {
        BarrowsInfoBox.lIllIIllIllllI();
        BarrowsInfoBox.lIllIIlIlllIII();
    }

    private static void lIllIIlIlllIII() {
        lllIllllllI = new String[llllIIIlIIl[22]];
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[1]] = BarrowsInfoBox."%.0fK";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[2]] = BarrowsInfoBox."%.0fK";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[3]] = BarrowsInfoBox."%.1fK";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[4]] = BarrowsInfoBox."%.0f";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[5]] = BarrowsInfoBox."%.1f";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[7]] = BarrowsInfoBox."Squire Barrows";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[8]] = BarrowsInfoBox."Runtime";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[9]] = BarrowsInfoBox."Version";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[10]] = BarrowsInfoBox."1.3.1";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[11]] = BarrowsInfoBox."Task: ";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[6]] = BarrowsInfoBox."Missing Potential:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[12]] = BarrowsInfoBox."Chests:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[13]] = BarrowsInfoBox."%d (%d/h)";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[14]] = BarrowsInfoBox."Est. GP/H:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[15]] = BarrowsInfoBox."Uniques:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[16]] = BarrowsInfoBox."%d (%d/h)";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[17]] = BarrowsInfoBox."Claimed chest:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[18]] = BarrowsInfoBox."Should bank:";
        BarrowsInfoBox.lllIllllllI[BarrowsInfoBox.llllIIIlIIl[19]] = BarrowsInfoBox."Should claim chest:";
    }

    @Inject
    private BarrowsInfoBox(SquireBarrows squireBarrows, c c2) {
        this.B = llllIIIlIIl[0];
        this.y = squireBarrows;
        this.z = squireBarrows.getManager();
        this.A = c2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIIlllIIIII(int n2) {
        return n2 >= 0;
    }

    private String f(int n2) {
        double d2 = this.e(n2);
        return BarrowsInfoBox.a(d2);
    }

    public static String a(double d2) {
        double var1;
        if (BarrowsInfoBox.lIllIIlllIIIII(BarrowsInfoBox.lIllIIllIlllll(d2, 1000000.0))) {
            double d3 = d2 / 1000.0;
            Object[] objectArray = new Object[llllIIIlIIl[2]];
            objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = d3;
            return String.format(lllIllllllI[llllIIIlIIl[1]], objectArray);
        }
        if (BarrowsInfoBox.lIllIIlllIIIII(BarrowsInfoBox.lIllIIllIlllll(var1, 1000.0))) {
            double var16 = var1 / 1000.0;
            if (BarrowsInfoBox.lIllIIlllIIIIl(BarrowsInfoBox.lIllIIllIlllll(var16 % 1.0, 0.0))) {
                Object[] objectArray = new Object[llllIIIlIIl[2]];
                objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = var16;
                return String.format(lllIllllllI[llllIIIlIIl[2]], objectArray);
            }
            Object[] objectArray = new Object[llllIIIlIIl[2]];
            objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = var16;
            return String.format(lllIllllllI[llllIIIlIIl[3]], objectArray);
        }
        if (BarrowsInfoBox.lIllIIlllIIIIl(BarrowsInfoBox.lIllIIllIlllll(var1 % 1.0, 0.0))) {
            Object[] objectArray = new Object[llllIIIlIIl[2]];
            objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = var1;
            return String.format(lllIllllllI[llllIIIlIIl[4]], objectArray);
        }
        Object[] objectArray = new Object[llllIIIlIIl[2]];
        objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = d2;
        return String.format(lllIllllllI[llllIIIlIIl[5]], objectArray);
    }

    private static boolean lIllIIlllIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIllIllllI() {
        llllIIIlIIl = new int[23];
        BarrowsInfoBox.llllIIIlIIl[0] = 0xFFFFBFFE & 0x16EFF;
        BarrowsInfoBox.llllIIIlIIl[1] = (0x6C ^ 0x34) & ~(0 ^ 0x58);
        BarrowsInfoBox.llllIIIlIIl[2] = 1;
        BarrowsInfoBox.llllIIIlIIl[3] = 2;
        BarrowsInfoBox.llllIIIlIIl[4] = 3;
        BarrowsInfoBox.llllIIIlIIl[5] = 0x65 ^ 0x6A ^ (0x40 ^ 0x4B);
        BarrowsInfoBox.llllIIIlIIl[6] = 0x6E ^ 0x64;
        BarrowsInfoBox.llllIIIlIIl[7] = 0x60 ^ 0x65;
        BarrowsInfoBox.llllIIIlIIl[8] = 0x1A ^ 0x37 ^ (0xA5 ^ 0x8E);
        BarrowsInfoBox.llllIIIlIIl[9] = 0x2C ^ 6 ^ (0x3F ^ 0x12);
        BarrowsInfoBox.llllIIIlIIl[10] = 0x75 ^ 0x7D;
        BarrowsInfoBox.llllIIIlIIl[11] = 70 + 153 - 105 + 52 ^ 51 + 35 - 83 + 160;
        BarrowsInfoBox.llllIIIlIIl[12] = 0x1E ^ 0x3F ^ (0xEB ^ 0xC1);
        BarrowsInfoBox.llllIIIlIIl[13] = 0x3E ^ 0x32;
        BarrowsInfoBox.llllIIIlIIl[14] = 0x27 ^ 0x2A;
        BarrowsInfoBox.llllIIIlIIl[15] = 0x32 ^ 0x3C;
        BarrowsInfoBox.llllIIIlIIl[16] = 81 + 29 - -33 + 36 ^ 127 + 27 - 144 + 178;
        BarrowsInfoBox.llllIIIlIIl[17] = 0x2D ^ 0x5F ^ (0x21 ^ 0x43);
        BarrowsInfoBox.llllIIIlIIl[18] = 122 + 66 - 39 + 28 ^ 71 + 16 - -46 + 27;
        BarrowsInfoBox.llllIIIlIIl[19] = 2 + 63 - 64 + 142 ^ 50 + 56 - 64 + 115;
        BarrowsInfoBox.llllIIIlIIl[20] = 0xFFFFABB3 & 0x554E;
        BarrowsInfoBox.llllIIIlIIl[21] = 0xA6 ^ 0xB2;
        BarrowsInfoBox.llllIIIlIIl[22] = 0x45 ^ 0x56;
    }

    private static String lIllIIlIllIllI(String var18, String var14) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llllIIIlIIl[10]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(llllIIIlIIl[3], var12);
            return new String(var17.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static String lIllIIlIllIIII(String var21, String var7) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llllIIIlIIl[3], var15);
            return new String(var6.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        if (BarrowsInfoBox.lIllIIlllIIIIl(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    public double e(int n2) {
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        if (BarrowsInfoBox.lIllIIlllIIIIl(duration.isZero() ? 1 : 0)) {
            return (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
        }
        return 0.0;
    }

    private static String lIllIIlIlIllll(String var10, String var9) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var4 = var9.toCharArray();
        int var8 = llllIIIlIIl[1];
        char[] var2 = var10.toCharArray();
        int var3 = var2.length;
        int var11 = llllIIIlIIl[1];
        while (BarrowsInfoBox.lIllIIlllIIIll(var11, var3)) {
            char var19 = var2[var11];
            var13.append((char)(var19 ^ var4[var8 % var4.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((92 + 76 - 14 + 16 ^ 35 + 95 - 12 + 59) & (0x74 ^ 7 ^ (0xF ^ 0x67) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean lIllIIlllIIIlI(int n2) {
        return n2 != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (BarrowsInfoBox.lIllIIlllIIIlI(this.y.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration duration = Duration.between(this.y.getStarted(), Instant.now());
        this.panelComponent.setBorder(new Rectangle(llllIIIlIIl[6], llllIIIlIIl[6], llllIIIlIIl[6], llllIIIlIIl[6]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIllllllI[llllIIIlIIl[7]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[8]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[9]]).right(lllIllllllI[llllIIIlIIl[10]]).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[11]]).right(this.z.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[6]]).right(String.valueOf(this.A.d())).build());
        0;
        Object[] objectArray = new Object[llllIIIlIIl[3]];
        objectArray[BarrowsInfoBox.llllIIIlIIl[1]] = this.y.w();
        objectArray[BarrowsInfoBox.llllIIIlIIl[2]] = this.d(this.y.w());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[12]]).right(String.format(lllIllllllI[llllIIIlIIl[13]], objectArray)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[14]]).right(this.f(this.y.w() * llllIIIlIIl[0])).build());
        0;
        Object[] objectArray2 = new Object[llllIIIlIIl[3]];
        objectArray2[BarrowsInfoBox.llllIIIlIIl[1]] = this.y.x();
        objectArray2[BarrowsInfoBox.llllIIIlIIl[2]] = this.d(this.y.x());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[15]]).right(String.format(lllIllllllI[llllIIIlIIl[16]], objectArray2)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[17]]).right(String.valueOf(this.y.v())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[18]]).right(String.valueOf(this.y.u())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIllllllI[llllIIIlIIl[19]]).right(String.valueOf(this.y.g())).build());
        0;
        int n2 = llllIIIlIIl[20];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llllIIIlIIl[21], llllIIIlIIl[1]));
        return super.render(graphics2D);
    }
}

