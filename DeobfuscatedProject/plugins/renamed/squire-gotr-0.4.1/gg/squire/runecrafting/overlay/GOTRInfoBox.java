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
import g.r.r.-.t.q.i.u.o.e.s.CEnum;
import g.r.r.-.t.q.i.u.o.e.s.DEnum;
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
    private final /* synthetic */ SquireGOTRPlugin aJ;
    private static /* synthetic */ int[] llIIllIlIlII;
    private final /* synthetic */ TaskManager aK;
    private final /* synthetic */ SquireGOTRConfig aL;
    private static /* synthetic */ String[] llIIllIlIIll;

    private static String llllllIlIIIlII(String var11, String var7) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var16 = var7.toCharArray();
        int var10 = llIIllIlIlII[1];
        char[] var13 = var11.toCharArray();
        int var21 = var13.length;
        int var6 = llIIllIlIlII[1];
        while (GOTRInfoBox.llllllIlIIllII(var6, var21)) {
            char var20 = var13[var6];
            var3.append((char)(var20 ^ var16[var10 % var16.length]));
            0;
            ++var10;
            ++var6;
            0;
            if (((0x2F ^ 0x3D) & ~(0x43 ^ 0x51)) == 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static String llllllIlIIIlIl(String var1, String var8) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIIllIlIlII[5], var17);
            return new String(var9.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        GOTRInfoBox var14;
        if (GOTRInfoBox.llllllIlIIlIIl(this.aJ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var14.panelComponent.setBorder(new Rectangle(llIIllIlIlII[0], llIIllIlIlII[0], llIIllIlIlII[0], llIIllIlIlII[0]));
        var14.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIIllIlIIll[llIIllIlIlII[1]]).build());
        0;
        int var12 = llIIllIlIlII[2];
        var14.panelComponent.setPreferredSize(new Dimension(var12 + llIIllIlIlII[3], llIIllIlIlII[1]));
        var14.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[4]]).right(llIIllIlIIll[llIIllIlIlII[5]]).build());
        0;
        var14.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[6]]).right(String.valueOf((Object)var14.aJ.Q())).build());
        0;
        var14.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[7]]).right(var14.aK.getCurrentTask()).build());
        0;
        Object[] objectArray = new Object[llIIllIlIlII[5]];
        objectArray[GOTRInfoBox.llIIllIlIlII[1]] = var14.aJ.p();
        objectArray[GOTRInfoBox.llIIllIlIlII[4]] = var14.aJ.q();
        var14.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[8]]).right(String.format(llIIllIlIIll[llIIllIlIlII[9]], objectArray)).build());
        0;
        if (GOTRInfoBox.llllllIlIIlIlI((Object)var14.aJ.m(), (Object)c.ACTIVE)) {
            String string;
            d var2 = var14.aJ.h();
            List list = var14.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[10]]);
            if (GOTRInfoBox.llllllIlIIlIIl(var14.aJ.R() ? 1 : 0)) {
                string = llIIllIlIIll[llIIllIlIlII[11]];
                0;
                if (((0x5A ^ 0x55 ^ (0x3E ^ 0x2E)) & (0x71 ^ 0x57 ^ (0xB5 ^ 0x8C) ^ -1)) < 0) {
                    return null;
                }
            } else {
                string = llIIllIlIIll[llIIllIlIlII[12]];
            }
            list.add(lineComponentBuilder.right(string).build());
            0;
            if (GOTRInfoBox.llllllIlIIlIll((Object)var2)) {
                var14.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[0]]).right(var2.U() + " runes - " + var2.Z()).build());
                0;
            }
            Object[] objectArray2 = new Object[llIIllIlIlII[5]];
            objectArray2[GOTRInfoBox.llIIllIlIlII[1]] = var14.aJ.H();
            objectArray2[GOTRInfoBox.llIIllIlIlII[4]] = var14.aJ.I();
            var14.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[13]]).right(String.format(llIIllIlIIll[llIIllIlIlII[14]], objectArray2)).build());
            0;
        }
        Object[] objectArray3 = new Object[llIIllIlIlII[5]];
        objectArray3[GOTRInfoBox.llIIllIlIlII[1]] = this.aJ.F();
        objectArray3[GOTRInfoBox.llIIllIlIlII[4]] = this.aJ.G();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[15]]).right(String.format(llIIllIlIIll[llIIllIlIlII[16]], objectArray3)).build());
        0;
        return super.render(graphics2D);
    }

    private static void llllllIlIIlIII() {
        llIIllIlIlII = new int[18];
        GOTRInfoBox.llIIllIlIlII[0] = 0x9C ^ 0x96;
        GOTRInfoBox.llIIllIlIlII[1] = (0xA9 ^ 0x81) & ~(0x19 ^ 0x31);
        GOTRInfoBox.llIIllIlIlII[2] = -(0xFFFFBDBE & 0x7AD3) & (0xFFFFBD9F & 0x7BF3);
        GOTRInfoBox.llIIllIlIlII[3] = 0xBE ^ 0xAA;
        GOTRInfoBox.llIIllIlIlII[4] = 1;
        GOTRInfoBox.llIIllIlIlII[5] = 2;
        GOTRInfoBox.llIIllIlIlII[6] = 3;
        GOTRInfoBox.llIIllIlIlII[7] = 0x32 ^ 0x7A ^ (0xE8 ^ 0xA4);
        GOTRInfoBox.llIIllIlIlII[8] = 0x81 ^ 0x84;
        GOTRInfoBox.llIIllIlIlII[9] = 0x5E ^ 0x58;
        GOTRInfoBox.llIIllIlIlII[10] = 0xB1 ^ 0xB6;
        GOTRInfoBox.llIIllIlIlII[11] = 0x5C ^ 0x54;
        GOTRInfoBox.llIIllIlIlII[12] = 0x2D ^ 0x24;
        GOTRInfoBox.llIIllIlIlII[13] = 0x2A ^ 0x21;
        GOTRInfoBox.llIIllIlIlII[14] = 0x83 ^ 0x85 ^ (0x3D ^ 0x37);
        GOTRInfoBox.llIIllIlIlII[15] = 0x62 ^ 0x18 ^ (0x79 ^ 0xE);
        GOTRInfoBox.llIIllIlIlII[16] = 0x98 ^ 0x96;
        GOTRInfoBox.llIIllIlIlII[17] = 0x98 ^ 0x97;
    }

    private static String llllllIlIIIllI(String var18, String var22) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), llIIllIlIlII[11]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llIIllIlIlII[5], var15);
            return new String(var4.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
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
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[1]] = GOTRInfoBox."Guardians of the Rift";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[4]] = GOTRInfoBox."Version";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[5]] = GOTRInfoBox."0.6.2";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[6]] = GOTRInfoBox."Minigame State";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[7]] = GOTRInfoBox."Performing";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[8]] = GOTRInfoBox."Essence";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[9]] = GOTRInfoBox."%d / %d";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[10]] = GOTRInfoBox."Current focus";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[11]] = GOTRInfoBox."Elemental";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[12]] = GOTRInfoBox."Catalytic";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[0]] = GOTRInfoBox."Crafting Next";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[13]] = GOTRInfoBox."Current reward points";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[14]] = GOTRInfoBox."%d | %d";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[15]] = GOTRInfoBox."Total reward points";
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[16]] = GOTRInfoBox."%d | %d";
    }

    private static boolean llllllIlIIlIll(Object object) {
        return object != null;
    }

    static {
        GOTRInfoBox.llllllIlIIlIII();
        GOTRInfoBox.llllllIlIIIlll();
    }
}

