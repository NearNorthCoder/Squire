/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.client.Static
 */
package gg.squire.hydra.overlay;

import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.client.Static;
import u.i.r.d.s.e.r.q.y.a.h.-.a_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.e_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.h_Unknown;

public class HydraOverlayPanel
extends OverlayPanel {
    private final /* synthetic */ SquireAlchemicalHydraPlugin am;
    private final /* synthetic */ e al;
    private static /* synthetic */ String[] llllIlIIIllI;
    private static /* synthetic */ int[] llllIlIlIIIl;
    private final /* synthetic */ SquireAlchemicalHydraConfig an;
    private final /* synthetic */ a ak;

    private static String lIIlIIIIlIIIlII(String var24, String var12) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(llllIlIlIIIl[4], var6);
            return new String(var11.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIllIIlll() {
        llllIlIIIllI = new String[llllIlIlIIIl[22]];
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[2]] = HydraOverlayPanel."Squire Hydra";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[3]] = HydraOverlayPanel."Currently";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[4]] = HydraOverlayPanel."Kills";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[5]] = HydraOverlayPanel."Global tick count";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[6]] = HydraOverlayPanel."Death tick";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[7]] = HydraOverlayPanel."Ticks until respawn";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[8]] = HydraOverlayPanel."Hydra Phase";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[9]] = HydraOverlayPanel."Special (%s)";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[10]] = HydraOverlayPanel."Hydra Attack";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[11]] = HydraOverlayPanel."Hydra Attack Count";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[12]] = HydraOverlayPanel."Hydra Immunity";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[13]] = HydraOverlayPanel."Hydra Target";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[14]] = HydraOverlayPanel."Nothing";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[15]] = HydraOverlayPanel."Us";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[16]] = HydraOverlayPanel."Hydra Moving";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[17]] = HydraOverlayPanel."Yes";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[18]] = HydraOverlayPanel."No";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[19]] = HydraOverlayPanel."Stunned";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[20]] = HydraOverlayPanel."Yes";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[21]] = HydraOverlayPanel."No";
    }

    @Inject
    public HydraOverlayPanel(SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.am = squireAlchemicalHydraPlugin;
        this.an = squireAlchemicalHydraConfig;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.ak = squireAlchemicalHydraPlugin.a();
        this.al = squireAlchemicalHydraPlugin.b();
    }

    private static boolean lIIlIIIIllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIllIllII(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIIIllIIlIl(String var18, String var10) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), llllIlIlIIIl[10]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(llllIlIlIIIl[4], var14);
            return new String(var16.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIIllIIllI(String var2, String var19) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var1 = var19.toCharArray();
        int var17 = llllIlIlIIIl[2];
        char[] var13 = var2.toCharArray();
        int var20 = var13.length;
        int var15 = llllIlIlIIIl[2];
        while (HydraOverlayPanel.lIIlIIIIllIlllI(var15, var20)) {
            char var22 = var13[var15];
            var9.append((char)(var22 ^ var1[var17 % var1.length]));
            0;
            ++var17;
            ++var15;
            0;
            if (((105 + 175 - 137 + 56 ^ 26 + 27 - -85 + 9) & (0x31 ^ 0x5B ^ (0x54 ^ 0x6A) ^ -1)) == ((0xF4 ^ 0xBF ^ (0x6E ^ 0x10)) & (0x63 ^ 0x22 ^ (0x3D ^ 0x49) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIIlIIIIllIllIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        HydraOverlayPanel.lIIlIIIIllIlIII();
        HydraOverlayPanel.lIIlIIIIllIIlll();
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        String string;
        String string2;
        String string3;
        String string4;
        void var7;
        HydraOverlayPanel var8;
        if (HydraOverlayPanel.lIIlIIIIllIlIIl(this.am.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        int lllllllllllllllIIlIlIIlIIIlIlIIl = llllIlIlIIIl[0];
        var8.panelComponent.setPreferredSize(new Dimension(llllIlIlIIIl[1], llllIlIlIIIl[2]));
        var8.panelComponent.getChildren().add(TitleComponent.builder().text(llllIlIIIllI[llllIlIlIIIl[2]]).color(ColorScheme.BRAND_ORANGE).build());
        0;
        var8.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[3]]).right(String.valueOf(var8.am.getManager().getCurrentTask())).build());
        0;
        var8.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[4]]).right(String.valueOf(var8.ak.o())).build());
        0;
        if (HydraOverlayPanel.lIIlIIIIllIlIlI(var8.ak.g() ? 1 : 0)) {
            return super.render((Graphics2D)var7);
        }
        var8.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[5]]).right(String.valueOf(Static.getClient().getTickCount())).build());
        0;
        h var3 = var8.ak.k();
        if (!HydraOverlayPanel.lIIlIIIIllIlIll(var3) || HydraOverlayPanel.lIIlIIIIllIllII(var3.K())) {
            var8.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[6]]).right(String.valueOf(var8.ak.n())).build());
            0;
            var8.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[7]]).right(String.valueOf(var8.ak.e())).build());
            0;
            return super.render((Graphics2D)var7);
        }
        var8.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[8]]).right(String.valueOf((Object)var3.S())).build());
        0;
        if (HydraOverlayPanel.lIIlIIIIllIllIl(var3.O(), Static.getClient().getTickCount())) {
            Object[] objectArray = new Object[llllIlIlIIIl[3]];
            objectArray[HydraOverlayPanel.llllIlIlIIIl[2]] = var3.S();
            string4 = String.format(llllIlIIIllI[llllIlIlIIIl[9]], objectArray);
            0;
            if (2 != 2) {
                return null;
            }
        } else {
            string4 = String.format(String.valueOf((Object)var3.L()), new Object[llllIlIlIIIl[2]]);
        }
        String var21 = string4;
        var8.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[10]]).right(var21).build());
        0;
        var8.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[11]]).right(String.valueOf(var3.N())).build());
        0;
        var8.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[12]]).right(String.valueOf(var3.Q())).build());
        0;
        Actor var23 = var3.K().getInteracting();
        List list = var8.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[13]]);
        if (HydraOverlayPanel.lIIlIIIIllIllII(var23)) {
            string3 = llllIlIIIllI[llllIlIlIIIl[14]];
            0;
            if (3 > 3) {
                return null;
            }
        } else {
            string3 = llllIlIIIllI[llllIlIlIIIl[15]];
        }
        list.add(lineComponentBuilder.right(string3).build());
        0;
        List list2 = var8.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder2 = LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[16]]);
        if (HydraOverlayPanel.lIIlIIIIllIlIIl(var3.K().isMoving() ? 1 : 0)) {
            string2 = llllIlIIIllI[llllIlIlIIIl[17]];
            0;
            if (1 == (0x5B ^ 0x5F)) {
                return null;
            }
        } else {
            string2 = llllIlIIIllI[llllIlIlIIIl[18]];
        }
        list2.add(lineComponentBuilder2.right(string2).build());
        0;
        List list3 = var8.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder3 = LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[19]]);
        if (HydraOverlayPanel.lIIlIIIIllIlIIl(var3.B() ? 1 : 0)) {
            string = llllIlIIIllI[llllIlIlIIIl[20]];
            0;
            if ((1 & ~1) == 2) {
                return null;
            }
        } else {
            string = llllIlIIIllI[llllIlIlIIIl[21]];
        }
        list3.add(lineComponentBuilder3.right(string).build());
        0;
        return super.render(graphics2D);
    }

    private static void lIIlIIIIllIlIII() {
        llllIlIlIIIl = new int[23];
        HydraOverlayPanel.llllIlIlIIIl[0] = 13 + 129 - 116 + 167;
        HydraOverlayPanel.llllIlIlIIIl[1] = (0x63 ^ 0x75) + (0xD3 ^ 0x90) - (0x6A ^ 0x64) + (108 + 43 - 28 + 15);
        HydraOverlayPanel.llllIlIlIIIl[2] = (1 ^ 4 ^ (0x50 ^ 0x16)) & (2 ^ 0x19 ^ (0x56 ^ 0xE) ^ -1);
        HydraOverlayPanel.llllIlIlIIIl[3] = 1;
        HydraOverlayPanel.llllIlIlIIIl[4] = 2;
        HydraOverlayPanel.llllIlIlIIIl[5] = 3;
        HydraOverlayPanel.llllIlIlIIIl[6] = 0x41 ^ 0x45;
        HydraOverlayPanel.llllIlIlIIIl[7] = 0x6E ^ 0x6B;
        HydraOverlayPanel.llllIlIlIIIl[8] = 0x37 ^ 0x31;
        HydraOverlayPanel.llllIlIlIIIl[9] = 103 + 81 - 150 + 127 ^ 68 + 98 - 28 + 28;
        HydraOverlayPanel.llllIlIlIIIl[10] = 0xAE ^ 0xA6;
        HydraOverlayPanel.llllIlIlIIIl[11] = 0x33 ^ 0x3A;
        HydraOverlayPanel.llllIlIlIIIl[12] = 123 + 45 - 62 + 54 ^ 16 + 165 - 45 + 34;
        HydraOverlayPanel.llllIlIlIIIl[13] = 0x46 ^ 0x4D;
        HydraOverlayPanel.llllIlIlIIIl[14] = 0xC5 ^ 0xBD ^ (0xFF ^ 0x8B);
        HydraOverlayPanel.llllIlIlIIIl[15] = 0x27 ^ 0x2A;
        HydraOverlayPanel.llllIlIlIIIl[16] = 99 + 137 - 86 + 40 ^ 124 + 73 - 68 + 47;
        HydraOverlayPanel.llllIlIlIIIl[17] = 148 + 125 - 91 + 7 ^ 135 + 89 - 94 + 48;
        HydraOverlayPanel.llllIlIlIIIl[18] = 0xAF ^ 0xBF;
        HydraOverlayPanel.llllIlIlIIIl[19] = 0xA1 ^ 0xB0;
        HydraOverlayPanel.llllIlIlIIIl[20] = 0x95 ^ 0x87;
        HydraOverlayPanel.llllIlIlIIIl[21] = 0x81 ^ 0xC1 ^ (0xA ^ 0x59);
        HydraOverlayPanel.llllIlIlIIIl[22] = 0xB2 ^ 0xA6;
    }

    private static boolean lIIlIIIIllIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIIllIlIlI(int n2) {
        return n2 == 0;
    }
}

