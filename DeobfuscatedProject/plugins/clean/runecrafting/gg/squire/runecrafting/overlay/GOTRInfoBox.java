/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 */
package gg.squire.runecrafting.overlay;

import com.google.inject.Inject;
import gg.squire.runecrafting.overlay.GameEnum14;
import gg.squire.runecrafting.overlay.GameEnum24;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.runecrafting.SquireGOTRConfig;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class GOTRInfoBox
extends OverlayPanel {
    private final  SquireGOTRPlugin aJ;
    
    private final  TaskManager aK;
    private final  SquireGOTRConfig aL;

        return String.valueOf(var1);
    }

    public Dimension render(Graphics2D graphics2D) {
        GOTRInfoBox var2;
        if (GOTRInfoBox.llllllIlIIlIIl(this.aJ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var2.panelComponent.setBorder(new Rectangle(llIIllIlIlII[0], llIIllIlIlII[0], llIIllIlIlII[0], llIIllIlIlII[0]));
        var2.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIIllIlIIll[llIIllIlIlII[1]]).build());

        int var3 = llIIllIlIlII[2];
        var2.panelComponent.setPreferredSize(new Dimension(var3 + llIIllIlIlII[3], llIIllIlIlII[1]));
        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[4]]).right(llIIllIlIIll[llIIllIlIlII[5]]).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[6]]).right(String.valueOf((Object)var2.aJ.Q())).build());

        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[7]]).right(var2.aK.getCurrentTask()).build());

        Object[] objectArray = new Object[llIIllIlIlII[5]];
        objectArray[GOTRInfoBox.llIIllIlIlII[1]] = var2.aJ.p();
        objectArray[GOTRInfoBox.llIIllIlIlII[4]] = var2.aJ.q();
        var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[8]]).right(String.format(llIIllIlIIll[llIIllIlIlII[9]], objectArray)).build());

        if (GOTRInfoBox.llllllIlIIlIlI((Object)var2.aJ.m(), (Object)c.ACTIVE)) {
            String string;
            d var4 = var2.aJ.h();
            List list = var2.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[10]]);
            if (GOTRInfoBox.llllllIlIIlIIl(var2.aJ.R() ? 1 : 0)) {
                string = llIIllIlIIll[llIIllIlIlII[11]];

                if (((0x5A ^ 0x55 ^ (0x3E ^ 0x2E)) & (0x71 ^ 0x57 ^ (0xB5 ^ 0x8C) ^ -1)) < 0) {
                    return null;
                }
            } else {
                string = llIIllIlIIll[llIIllIlIlII[12]];
            }
            list.add(lineComponentBuilder.right(string).build());

            if (GOTRInfoBox.llllllIlIIlIll((Object)var4)) {
                var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[0]]).right(var4.U() + " runes - " + var4.Z()).build());

            }
            Object[] objectArray2 = new Object[llIIllIlIlII[5]];
            objectArray2[GOTRInfoBox.llIIllIlIlII[1]] = var2.aJ.H();
            objectArray2[GOTRInfoBox.llIIllIlIlII[4]] = var2.aJ.I();
            var2.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[13]]).right(String.format(llIIllIlIIll[llIIllIlIlII[14]], objectArray2)).build());

        }
        Object[] objectArray3 = new Object[llIIllIlIlII[5]];
        objectArray3[GOTRInfoBox.llIIllIlIlII[1]] = this.aJ.F();
        objectArray3[GOTRInfoBox.llIIllIlIlII[4]] = this.aJ.G();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[15]]).right(String.format(llIIllIlIIll[llIIllIlIlII[16]], objectArray3)).build());

        return super.render(graphics2D);
    }

    private static boolean llllllIlIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllllIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    private GOTRInfoBox(SquireGOTRPlugin squireGOTRPlugin, SquireGOTRConfig squireGOTRConfig) {
        this.aJ = squireGOTRPlugin;
        this.aK = squireGOTRPlugin.getManager();
        this.aL = squireGOTRConfig;
        this.setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        this.setLayer(OverlayLayer.ALWAYS_ON_TOP);
    }

    private static boolean llllllIlIIlIIl(int n2) {
        return n2 != 0;
    }

    private static void llllllIlIIIlll() {
        llIIllIlIIll = new String[llIIllIlIlII[17]];
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[1]] = "Guardians of the Rift";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[4]] = "Version";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[5]] = "0.6.2";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[6]] = "Minigame State";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[7]] = "Performing";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[8]] = "Essence";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[9]] = "%d / %d";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[10]] = "Current focus";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[11]] = "Elemental";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[12]] = "Catalytic";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[0]] = "Crafting Next";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[13]] = "Current reward points";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[14]] = "%d | %d";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[15]] = "Total reward points";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[16]] = "%d | %d";
    }

    private static boolean llllllIlIIlIll(Object object) {
        return object != null;
    }

    static {
        GOTRInfoBox.llllllIlIIlIII();
        GOTRInfoBox.llllllIlIIIlll();
    }
}

