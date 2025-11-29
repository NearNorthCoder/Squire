/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Point
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.giantsfoundry.overlay;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a_Unknown;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.HEnum;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Point;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class GiantsOverlay
extends OverlayPanel {
    private final /* synthetic */ a Z;
    private final /* synthetic */ SquireGiantsFoundry Y;
    private static /* synthetic */ String[] llIlIlllIlIl;
    private static /* synthetic */ int[] llIlIllllllI;

    private static boolean lIIIIlIIIIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIlIIIIllIII(Object object) {
        return object == null;
    }

    private static String lIIIIIlllllllII(String var19, String var24) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), llIlIllllllI[9]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(llIlIllllllI[2], var1);
            return new String(var20.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        Object object;
        GiantsOverlay var26;
        if (GiantsOverlay.lIIIIlIIIIlIlll(this.Y.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var26.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIlIlllIlIl[llIlIllllllI[0]]).build());
        0;
        Duration var8 = Duration.between(var26.Y.getStarted(), Instant.now());
        var26.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[1]]).right(Time.format((Duration)var8)).build());
        0;
        List list = var26.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[2]]);
        if (GiantsOverlay.lIIIIlIIIIllIII((Object)var26.Z.k())) {
            object = llIlIlllIlIl[llIlIllllllI[3]];
            0;
            if (((0xD2 ^ 0x9B) & ~(0x52 ^ 0x1B)) > (0x91 ^ 0x95)) {
                return null;
            }
        } else {
            object = var26.Z.k();
        }
        list.add(lineComponentBuilder.right(String.valueOf(object)).build());
        0;
        var26.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[4]]).right(String.valueOf(var26.Y.getManager().getCurrentTask())).build());
        0;
        if (GiantsOverlay.lIIIIlIIIIllIIl(var26.Z.l(), llIlIllllllI[5])) {
            String string;
            var26.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[6]]).right(String.valueOf(var26.Z.l())).build());
            0;
            List list2 = var26.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder2 = LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[7]]);
            if (GiantsOverlay.lIIIIlIIIIlIlll(var26.Z.n() ? 1 : 0)) {
                string = llIlIlllIlIl[llIlIllllllI[8]];
                0;
                if (-2 >= 0) {
                    return null;
                }
            } else {
                string = llIlIlllIlIl[llIlIllllllI[9]];
            }
            list2.add(lineComponentBuilder2.right(string).build());
            0;
            var26.panelComponent.getChildren().add(LineComponent.builder().left(llIlIlllIlIl[llIlIllllllI[10]]).right(String.valueOf(var26.Z.m())).build());
            0;
            Map<h, Point> var18 = var26.Z.o();
            h[] var9 = h.values();
            int var15 = var9.length;
            int var13 = llIlIllllllI[0];
            while (GiantsOverlay.lIIIIlIIIIllIlI(var13, var15)) {
                h var11 = var9[var13];
                Object[] objectArray = new Object[llIlIllllllI[1]];
                objectArray[GiantsOverlay.llIlIllllllI[0]] = var11;
                Object[] objectArray2 = new Object[llIlIllllllI[2]];
                objectArray2[GiantsOverlay.llIlIllllllI[0]] = var18.get((Object)var11).getX();
                objectArray2[GiantsOverlay.llIlIllllllI[1]] = var18.get((Object)var11).getY();
                var26.panelComponent.getChildren().add(LineComponent.builder().left(String.format(llIlIlllIlIl[llIlIllllllI[11]], objectArray)).right(String.format(llIlIlllIlIl[llIlIllllllI[12]], objectArray2)).build());
                0;
                ++var13;
                0;
                
                return null;
            }
        }
        int n2 = llIlIllllllI[13];
        this.panelComponent.setPreferredSize(new Dimension(n2 + llIlIllllllI[14], llIlIllllllI[0]));
        return super.render(graphics2D);
    }

    private static void lIIIIIlllllllll() {
        llIlIlllIlIl = new String[llIlIllllllI[15]];
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[0]] = GiantsOverlay."Squire Giants Foundry";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[1]] = GiantsOverlay."Runtime";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[2]] = GiantsOverlay."Current Sword Task";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[3]] = GiantsOverlay."None";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[4]] = GiantsOverlay."Current Actual Task";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[6]] = GiantsOverlay."Current Temperature";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[7]] = GiantsOverlay."Is Temperature Correct";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[8]] = GiantsOverlay."Yes";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[9]] = GiantsOverlay."No";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[10]] = GiantsOverlay."Optimal Temperature";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[11]] = GiantsOverlay."%s zone:";
        GiantsOverlay.llIlIlllIlIl[GiantsOverlay.llIlIllllllI[12]] = GiantsOverlay."%d - %d";
    }

    @Inject
    public GiantsOverlay(SquireGiantsFoundry squireGiantsFoundry, a a2) {
        this.Y = squireGiantsFoundry;
        this.Z = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String lIIIIIllllllllI(String var3, String var21) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var5 = var21.toCharArray();
        int var10 = llIlIllllllI[0];
        char[] var6 = var3.toCharArray();
        int var7 = var6.length;
        int var23 = llIlIllllllI[0];
        while (GiantsOverlay.lIIIIlIIIIllIlI(var23, var7)) {
            char var17 = var6[var23];
            var2.append((char)(var17 ^ var5[var10 % var5.length]));
            0;
            ++var10;
            ++var23;
            0;
            if ((177 + 157 - 224 + 72 ^ 131 + 157 - 189 + 79) > 2) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static String lIIIIIlllllllIl(String var12, String var22) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llIlIllllllI[2], var16);
            return new String(var4.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    static {
        GiantsOverlay.lIIIIlIIIIlIllI();
        GiantsOverlay.lIIIIIlllllllll();
    }

    private static boolean lIIIIlIIIIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIlIIIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIlIIIIlIllI() {
        llIlIllllllI = new int[16];
        GiantsOverlay.llIlIllllllI[0] = (0x7C ^ 0x4C) & ~(0x4B ^ 0x7B);
        GiantsOverlay.llIlIllllllI[1] = 1;
        GiantsOverlay.llIlIllllllI[2] = 2;
        GiantsOverlay.llIlIllllllI[3] = 3;
        GiantsOverlay.llIlIllllllI[4] = 61 + 64 - -2 + 1 ^ 56 + 95 - 61 + 42;
        GiantsOverlay.llIlIllllllI[5] = -1;
        GiantsOverlay.llIlIllllllI[6] = 0x3A ^ 0x3D ^ 2;
        GiantsOverlay.llIlIllllllI[7] = 0x19 ^ 0x1F;
        GiantsOverlay.llIlIllllllI[8] = 0x7D ^ 0x7A;
        GiantsOverlay.llIlIllllllI[9] = 0x17 ^ 0x6D ^ (0xF8 ^ 0x8A);
        GiantsOverlay.llIlIllllllI[10] = 0xB9 ^ 0xB0;
        GiantsOverlay.llIlIllllllI[11] = 0x99 ^ 0x93;
        GiantsOverlay.llIlIllllllI[12] = 0x2C ^ 0x27;
        GiantsOverlay.llIlIllllllI[13] = -(0xFFFFCDB7 & 0x7EFD) & (0xFFFFDDB7 & 0x6FFE);
        GiantsOverlay.llIlIllllllI[14] = 28 + 68 - 60 + 122 ^ 109 + 61 - 89 + 57;
        GiantsOverlay.llIlIllllllI[15] = 0xBD ^ 0xB1;
    }
}

