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
import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.d;
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

    private static String llllllIlIIIlII(String lllllllllllllllIlIIllIlIIlIlIlIl, String lllllllllllllllIlIIllIlIIlIllIIl) {
        lllllllllllllllIlIIllIlIIlIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIlIIlIllIII = new StringBuilder();
        char[] lllllllllllllllIlIIllIlIIlIlIlll = lllllllllllllllIlIIllIlIIlIllIIl.toCharArray();
        int lllllllllllllllIlIIllIlIIlIlIllI = llIIllIlIlII[1];
        char[] lllllllllllllllIlIIllIlIIlIlIIII = lllllllllllllllIlIIllIlIIlIlIlIl.toCharArray();
        int lllllllllllllllIlIIllIlIIlIIllll = lllllllllllllllIlIIllIlIIlIlIIII.length;
        int lllllllllllllllIlIIllIlIIlIIlllI = llIIllIlIlII[1];
        while (GOTRInfoBox.llllllIlIIllII(lllllllllllllllIlIIllIlIIlIIlllI, lllllllllllllllIlIIllIlIIlIIllll)) {
            char lllllllllllllllIlIIllIlIIlIllIll = lllllllllllllllIlIIllIlIIlIlIIII[lllllllllllllllIlIIllIlIIlIIlllI];
            lllllllllllllllIlIIllIlIIlIllIII.append((char)(lllllllllllllllIlIIllIlIIlIllIll ^ lllllllllllllllIlIIllIlIIlIlIlll[lllllllllllllllIlIIllIlIIlIlIllI % lllllllllllllllIlIIllIlIIlIlIlll.length]));
            "".length();
            ++lllllllllllllllIlIIllIlIIlIlIllI;
            ++lllllllllllllllIlIIllIlIIlIIlllI;
            "".length();
            if (((0x2F ^ 0x3D) & ~(0x43 ^ 0x51)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllIlIIlIllIII);
    }

    private static String llllllIlIIIlIl(String lllllllllllllllIlIIllIlIIlIIIIll, String lllllllllllllllIlIIllIlIIlIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIlIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIlIIlIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIlIIlIIIlll.init(llIIllIlIlII[5], lllllllllllllllIlIIllIlIIlIIlIII);
            return new String(lllllllllllllllIlIIllIlIIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIlIIlIIIllI) {
            lllllllllllllllIlIIllIlIIlIIIllI.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        GOTRInfoBox lllllllllllllllIlIIllIlIIllIlIII;
        if (GOTRInfoBox.llllllIlIIlIIl(this.aJ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        lllllllllllllllIlIIllIlIIllIlIII.panelComponent.setBorder(new Rectangle(llIIllIlIlII[0], llIIllIlIlII[0], llIIllIlIlII[0], llIIllIlIlII[0]));
        lllllllllllllllIlIIllIlIIllIlIII.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIIllIlIIll[llIIllIlIlII[1]]).build());
        "".length();
        int lllllllllllllllIlIIllIlIIllIIllI = llIIllIlIlII[2];
        lllllllllllllllIlIIllIlIIllIlIII.panelComponent.setPreferredSize(new Dimension(lllllllllllllllIlIIllIlIIllIIllI + llIIllIlIlII[3], llIIllIlIlII[1]));
        lllllllllllllllIlIIllIlIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[4]]).right(llIIllIlIIll[llIIllIlIlII[5]]).build());
        "".length();
        lllllllllllllllIlIIllIlIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[6]]).right(String.valueOf((Object)lllllllllllllllIlIIllIlIIllIlIII.aJ.Q())).build());
        "".length();
        lllllllllllllllIlIIllIlIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[7]]).right(lllllllllllllllIlIIllIlIIllIlIII.aK.getCurrentTask()).build());
        "".length();
        Object[] objectArray = new Object[llIIllIlIlII[5]];
        objectArray[GOTRInfoBox.llIIllIlIlII[1]] = lllllllllllllllIlIIllIlIIllIlIII.aJ.p();
        objectArray[GOTRInfoBox.llIIllIlIlII[4]] = lllllllllllllllIlIIllIlIIllIlIII.aJ.q();
        lllllllllllllllIlIIllIlIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[8]]).right(String.format(llIIllIlIIll[llIIllIlIlII[9]], objectArray)).build());
        "".length();
        if (GOTRInfoBox.llllllIlIIlIlI((Object)lllllllllllllllIlIIllIlIIllIlIII.aJ.m(), (Object)c.ACTIVE)) {
            String string;
            d lllllllllllllllIlIIllIlIIllIIlIl = lllllllllllllllIlIIllIlIIllIlIII.aJ.h();
            List list = lllllllllllllllIlIIllIlIIllIlIII.panelComponent.getChildren();
            LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[10]]);
            if (GOTRInfoBox.llllllIlIIlIIl(lllllllllllllllIlIIllIlIIllIlIII.aJ.R() ? 1 : 0)) {
                string = llIIllIlIIll[llIIllIlIlII[11]];
                "".length();
                if (((0x5A ^ 0x55 ^ (0x3E ^ 0x2E)) & (0x71 ^ 0x57 ^ (0xB5 ^ 0x8C) ^ -" ".length())) < 0) {
                    return null;
                }
            } else {
                string = llIIllIlIIll[llIIllIlIlII[12]];
            }
            list.add(lineComponentBuilder.right(string).build());
            "".length();
            if (GOTRInfoBox.llllllIlIIlIll((Object)lllllllllllllllIlIIllIlIIllIIlIl)) {
                lllllllllllllllIlIIllIlIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[0]]).right(lllllllllllllllIlIIllIlIIllIIlIl.U() + " runes - " + lllllllllllllllIlIIllIlIIllIIlIl.Z()).build());
                "".length();
            }
            Object[] objectArray2 = new Object[llIIllIlIlII[5]];
            objectArray2[GOTRInfoBox.llIIllIlIlII[1]] = lllllllllllllllIlIIllIlIIllIlIII.aJ.H();
            objectArray2[GOTRInfoBox.llIIllIlIlII[4]] = lllllllllllllllIlIIllIlIIllIlIII.aJ.I();
            lllllllllllllllIlIIllIlIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[13]]).right(String.format(llIIllIlIIll[llIIllIlIlII[14]], objectArray2)).build());
            "".length();
        }
        Object[] objectArray3 = new Object[llIIllIlIlII[5]];
        objectArray3[GOTRInfoBox.llIIllIlIlII[1]] = this.aJ.F();
        objectArray3[GOTRInfoBox.llIIllIlIlII[4]] = this.aJ.G();
        this.panelComponent.getChildren().add(LineComponent.builder().left(llIIllIlIIll[llIIllIlIlII[15]]).right(String.format(llIIllIlIIll[llIIllIlIlII[16]], objectArray3)).build());
        "".length();
        return super.render(graphics2D);
    }

    private static void llllllIlIIlIII() {
        llIIllIlIlII = new int[18];
        GOTRInfoBox.llIIllIlIlII[0] = 0x9C ^ 0x96;
        GOTRInfoBox.llIIllIlIlII[1] = (0xA9 ^ 0x81) & ~(0x19 ^ 0x31);
        GOTRInfoBox.llIIllIlIlII[2] = -(0xFFFFBDBE & 0x7AD3) & (0xFFFFBD9F & 0x7BF3);
        GOTRInfoBox.llIIllIlIlII[3] = 0xBE ^ 0xAA;
        GOTRInfoBox.llIIllIlIlII[4] = " ".length();
        GOTRInfoBox.llIIllIlIlII[5] = "  ".length();
        GOTRInfoBox.llIIllIlIlII[6] = "   ".length();
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

    private static String llllllIlIIIllI(String lllllllllllllllIlIIllIlIIIllIllI, String lllllllllllllllIlIIllIlIIIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIlIIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIIIllIlIl.getBytes(StandardCharsets.UTF_8)), llIIllIlIlII[11]), "DES");
            Cipher lllllllllllllllIlIIllIlIIIlllIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIlIIIlllIlI.init(llIIllIlIlII[5], lllllllllllllllIlIIllIlIIIlllIll);
            return new String(lllllllllllllllIlIIllIlIIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIlIIIlllIIl) {
            lllllllllllllllIlIIllIlIIIlllIIl.printStackTrace();
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
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[1]] = GOTRInfoBox.llllllIlIIIlII("CzoQIwolLh8iTiMpUSUGKW8jOAg4", "LOqQn");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[4]] = GOTRInfoBox.llllllIlIIIlII("Jw0bAC4eBg==", "qhisG");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[5]] = GOTRInfoBox.llllllIlIIIlII("dWFxRmE=", "EOGhS");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[6]] = GOTRInfoBox.llllllIlIIIlII("GgEaEAo2BRFZPiMJABw=", "Whtym");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[7]] = GOTRInfoBox.llllllIlIIIlII("MyYFAQIRLh4JCg==", "cCwgm");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[8]] = GOTRInfoBox.llllllIlIIIlIl("FZjBGCl8W+o=", "hDmQh");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[9]] = GOTRInfoBox.llllllIlIIIlII("bylrSXhvKQ==", "JMKfX");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[10]] = GOTRInfoBox.llllllIlIIIlII("KzMbCBYGMkkcHAszGg==", "hFizs");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[11]] = GOTRInfoBox.llllllIlIIIlII("Hwg0JBU0EDAl", "ZdQIp");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[12]] = GOTRInfoBox.llllllIlIIIlIl("baz3TUD46Uqx/MO9azfsFA==", "iZxgZ");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[0]] = GOTRInfoBox.llllllIlIIIllI("0NC73lkRK5NNsuZvofsGPg==", "BKPCj");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[13]] = GOTRInfoBox.llllllIlIIIlII("DA0nBz0hDHUHPTgZJxF4Pxc8Gyw8", "OxUuX");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[14]] = GOTRInfoBox.llllllIlIIIlII("ahxtNW5qHA==", "OxMIN");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[15]] = GOTRInfoBox.llllllIlIIIllI("IfHUx/lXDUjBEnpwd1GZUikw979fdzYo", "vxcZF");
        GOTRInfoBox.llIIllIlIIll[GOTRInfoBox.llIIllIlIlII[16]] = GOTRInfoBox.llllllIlIIIllI("FP/HKaZKPO0=", "jUzIo");
    }

    private static boolean llllllIlIIlIll(Object object) {
        return object != null;
    }

    static {
        GOTRInfoBox.llllllIlIIlIII();
        GOTRInfoBox.llllllIlIIIlll();
    }
}

