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
import gg.squire.hydra.overlay.AHelper;
import gg.squire.hydra.overlay.EHelper;
import gg.squire.hydra.overlay.HHelper;

public class HydraOverlayPanel
extends OverlayPanel {
    private final  SquireAlchemicalHydraPlugin am;
    private final  e al;

    private final  SquireAlchemicalHydraConfig an;
    private final  a ak;

    private static void lIIlIIIIllIIlll() {
        llllIlIIIllI = new String[llllIlIlIIIl[22]];
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[2]] = "Squire Hydra";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[3]] = "Currently";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[4]] = "Kills";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[5]] = "Global tick count";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[6]] = "Death tick";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[7]] = "Ticks until respawn";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[8]] = "Hydra Phase";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[9]] = "Special (%s)";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[10]] = "Hydra Attack";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[11]] = "Hydra Attack Count";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[12]] = "Hydra Immunity";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[13]] = "Hydra Target";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[14]] = "Nothing";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[15]] = "Us";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[16]] = "Hydra Moving";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[17]] = "Yes";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[18]] = "No";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[19]] = "Stunned";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[20]] = "Yes";
        HydraOverlayPanel.llllIlIIIllI[HydraOverlayPanel.llllIlIlIIIl[21]] = "No";
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

        return String.valueOf(var1);
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
        void var2;
        HydraOverlayPanel var3;
        if (HydraOverlayPanel.lIIlIIIIllIlIIl(this.am.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        int var4 = llllIlIlIIIl[0];
        var3.panelComponent.setPreferredSize(new Dimension(llllIlIlIIIl[1], llllIlIlIIIl[2]));
        var3.panelComponent.getChildren().add(TitleComponent.builder().text(llllIlIIIllI[llllIlIlIIIl[2]]).color(ColorScheme.BRAND_ORANGE).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[3]]).right(String.valueOf(var3.am.getManager().getCurrentTask())).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[4]]).right(String.valueOf(var3.ak.o())).build());

        if (HydraOverlayPanel.lIIlIIIIllIlIlI(var3.ak.g() ? 1 : 0)) {
            return super.render((Graphics2D)var2);
        }
        var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[5]]).right(String.valueOf(Static.getClient().getTickCount())).build());

        h var5 = var3.ak.k();
        if (!HydraOverlayPanel.lIIlIIIIllIlIll(var5) || HydraOverlayPanel.lIIlIIIIllIllII(var5.K())) {
            var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[6]]).right(String.valueOf(var3.ak.n())).build());

            var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[7]]).right(String.valueOf(var3.ak.e())).build());

            return super.render((Graphics2D)var2);
        }
        var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[8]]).right(String.valueOf((Object)var5.S())).build());

        if (HydraOverlayPanel.lIIlIIIIllIllIl(var5.O(), Static.getClient().getTickCount())) {
            Object[] objectArray = new Object[llllIlIlIIIl[3]];
            objectArray[HydraOverlayPanel.llllIlIlIIIl[2]] = var5.S();
            string4 = String.format(llllIlIIIllI[llllIlIlIIIl[9]], objectArray);

            if (2 != 2) {
                return null;
            }
        } else {
            string4 = String.format(String.valueOf((Object)var5.L()), new Object[llllIlIlIIIl[2]]);
        }
        String var6 = string4;
        var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[10]]).right(var6).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[11]]).right(String.valueOf(var5.N())).build());

        var3.panelComponent.getChildren().add(LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[12]]).right(String.valueOf(var5.Q())).build());

        Actor var7 = var5.K().getInteracting();
        List list = var3.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[13]]);
        if (HydraOverlayPanel.lIIlIIIIllIllII(var7)) {
            string3 = llllIlIIIllI[llllIlIlIIIl[14]];

            if (3 > 3) {
                return null;
            }
        } else {
            string3 = llllIlIIIllI[llllIlIlIIIl[15]];
        }
        list.add(lineComponentBuilder.right(string3).build());

        List list2 = var3.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder2 = LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[16]]);
        if (HydraOverlayPanel.lIIlIIIIllIlIIl(var5.K().isMoving() ? 1 : 0)) {
            string2 = llllIlIIIllI[llllIlIlIIIl[17]];

            if (1 == (0x5B ^ 0x5F)) {
                return null;
            }
        } else {
            string2 = llllIlIIIllI[llllIlIlIIIl[18]];
        }
        list2.add(lineComponentBuilder2.right(string2).build());

        List list3 = var3.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder3 = LineComponent.builder().left(llllIlIIIllI[llllIlIlIIIl[19]]);
        if (HydraOverlayPanel.lIIlIIIIllIlIIl(var5.B() ? 1 : 0)) {
            string = llllIlIIIllI[llllIlIlIIIl[20]];

            if ((1 & ~1) == 2) {
                return null;
            }
        } else {
            string = llllIlIIIllI[llllIlIlIIIl[21]];
        }
        list3.add(lineComponentBuilder3.right(string).build());

        return super.render(graphics2D);
    }

    private static boolean lIIlIIIIllIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIIllIlIlI(int n2) {
        return n2 == 0;
    }
}

