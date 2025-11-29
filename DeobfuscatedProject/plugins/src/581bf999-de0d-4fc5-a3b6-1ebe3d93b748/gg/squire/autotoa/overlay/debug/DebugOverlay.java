/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  javax.inject.Singleton
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.autotoa.overlay.debug;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

@Singleton
public class DebugOverlay
extends OverlayPanel {
    private final /* synthetic */ C cb;
    private final /* synthetic */ SquireAutoTOA bZ;
    private final /* synthetic */ TaskManager ca;
    private static /* synthetic */ String[] llIIIlIIIIl;
    private static /* synthetic */ int[] llIIIlIlllI;

    @Inject
    protected DebugOverlay(SquireAutoTOA squireAutoTOA, C c2) {
        this.bZ = squireAutoTOA;
        this.ca = squireAutoTOA.getManager();
        this.cb = c2;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    private static String lIIllllIIlllll(String llllllllllllllllIlIIIlIIIlIIIlll, String llllllllllllllllIlIIIlIIIlIIIllI) {
        llllllllllllllllIlIIIlIIIlIIIlll = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIlIIIlIIlIlI = new StringBuilder();
        char[] llllllllllllllllIlIIIlIIIlIIlIIl = llllllllllllllllIlIIIlIIIlIIIllI.toCharArray();
        int llllllllllllllllIlIIIlIIIlIIlIII = llIIIlIlllI[0];
        char[] llllllllllllllllIlIIIlIIIlIIIIlI = llllllllllllllllIlIIIlIIIlIIIlll.toCharArray();
        int llllllllllllllllIlIIIlIIIlIIIIIl = llllllllllllllllIlIIIlIIIlIIIIlI.length;
        int llllllllllllllllIlIIIlIIIlIIIIII = llIIIlIlllI[0];
        while (DebugOverlay.lIIllllIlIIlII(llllllllllllllllIlIIIlIIIlIIIIII, llllllllllllllllIlIIIlIIIlIIIIIl)) {
            char llllllllllllllllIlIIIlIIIlIIllIl = llllllllllllllllIlIIIlIIIlIIIIlI[llllllllllllllllIlIIIlIIIlIIIIII];
            llllllllllllllllIlIIIlIIIlIIlIlI.append((char)(llllllllllllllllIlIIIlIIIlIIllIl ^ llllllllllllllllIlIIIlIIIlIIlIIl[llllllllllllllllIlIIIlIIIlIIlIII % llllllllllllllllIlIIIlIIIlIIlIIl.length]));
            "".length();
            ++llllllllllllllllIlIIIlIIIlIIlIII;
            ++llllllllllllllllIlIIIlIIIlIIIIII;
            "".length();
            if ("  ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIIlIIIlIIlIlI);
    }

    private static boolean lIIllllIlIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIllllIlIIIlI() {
        llIIIlIlllI = new int[9];
        DebugOverlay.llIIIlIlllI[0] = (55 + 77 - 99 + 186 ^ 46 + 38 - -22 + 37) & (205 + 40 - 34 + 19 ^ 60 + 50 - 15 + 83 ^ -" ".length());
        DebugOverlay.llIIIlIlllI[1] = " ".length();
        DebugOverlay.llIIIlIlllI[2] = "  ".length();
        DebugOverlay.llIIIlIlllI[3] = "   ".length();
        DebugOverlay.llIIIlIlllI[4] = 90 + 145 - 137 + 68 ^ 83 + 111 - 161 + 129;
        DebugOverlay.llIIIlIlllI[5] = 104 + 117 - 137 + 53 ^ 56 + 113 - 156 + 127;
        DebugOverlay.llIIIlIlllI[6] = 0x7D ^ 0x2F ^ (0x54 ^ 0);
        DebugOverlay.llIIIlIlllI[7] = 0x2F ^ 0x28;
        DebugOverlay.llIIIlIlllI[8] = 0xE5 ^ 0xB5 ^ (0x79 ^ 0x21);
    }

    private static void lIIllllIlIIIIl() {
        llIIIlIIIIl = new String[llIIIlIlllI[8]];
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[0]] = DebugOverlay.lIIlllIlllIlII("vgHcAerZj/GmMMXmWQ5BSA==", "gTVhh");
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[1]] = DebugOverlay.lIIllllIIlllll("IicbHBEdNw==", "pRuhx");
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[2]] = DebugOverlay.lIIlllIlllIlII("6vYfp+f0IcI=", "rsWBm");
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[3]] = DebugOverlay.lIIlllIlllIlII("x9KvagOmsbM=", "dpIRY");
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[4]] = DebugOverlay.lIIllllIIlllll("GywBJwQ5JBovDGsdEjIA", "KIsAk");
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[5]] = DebugOverlay.lIIlllIlllIlII("WbMWYxMzLeB0MhSUtxyjJA==", "rsWhX");
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[6]] = DebugOverlay.lIIllllIlIIIII("GQe7sD4ZNEuwV/Mun6Eo+mSaDRDnuzxX", "PDfmD");
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[7]] = DebugOverlay.lIIlllIlllIlII("SnNzBi46ZnpTCh45o5oP1g==", "HHYBA");
    }

    private static String lIIlllIlllIlII(String llllllllllllllllIlIIIlIIIIllIlIl, String llllllllllllllllIlIIIlIIIIllIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlIIIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIIIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIlIIIIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIlIIIIlllIIl.init(llIIIlIlllI[2], llllllllllllllllIlIIIlIIIIlllIlI);
            return new String(llllllllllllllllIlIIIlIIIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIlIIIIlllIII) {
            llllllllllllllllIlIIIlIIIIlllIII.printStackTrace();
            return null;
        }
    }

    private static String lIIllllIlIIIII(String llllllllllllllllIlIIIlIIIlIlllII, String llllllllllllllllIlIIIlIIIlIllIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlIIIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIIIlIllIIl.getBytes(StandardCharsets.UTF_8)), llIIIlIlllI[8]), "DES");
            Cipher llllllllllllllllIlIIIlIIIlIllllI = Cipher.getInstance("DES");
            llllllllllllllllIlIIIlIIIlIllllI.init(llIIIlIlllI[2], llllllllllllllllIlIIIlIIIlIlllll);
            return new String(llllllllllllllllIlIIIlIIIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIlIIIlIlllIl) {
            llllllllllllllllIlIIIlIIIlIlllIl.printStackTrace();
            return null;
        }
    }

    static {
        DebugOverlay.lIIllllIlIIIlI();
        DebugOverlay.lIIllllIlIIIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        DebugOverlay llllllllllllllllIlIIIlIIIllIlIII;
        if (DebugOverlay.lIIllllIlIIIll(this.bZ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration llllllllllllllllIlIIIlIIIllIIllI = Duration.between(llllllllllllllllIlIIIlIIIllIlIII.bZ.getStarted(), Instant.now());
        llllllllllllllllIlIIIlIIIllIlIII.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIIIlIIIIl[llIIIlIlllI[0]]).build());
        "".length();
        llllllllllllllllIlIIIlIIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[1]]).right(Time.format((Duration)llllllllllllllllIlIIIlIIIllIIllI)).build());
        "".length();
        llllllllllllllllIlIIIlIIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[2]]).right(llIIIlIIIIl[llIIIlIlllI[3]]).build());
        "".length();
        llllllllllllllllIlIIIlIIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[4]]).right(llllllllllllllllIlIIIlIIIllIlIII.ca.getCurrentTask()).build());
        "".length();
        llllllllllllllllIlIIIlIIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[5]]).right(String.valueOf(llllllllllllllllIlIIIlIIIllIlIII.bZ.i())).build());
        "".length();
        llllllllllllllllIlIIIlIIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[6]]).right(String.valueOf(llllllllllllllllIlIIIlIIIllIlIII.bZ.k())).build());
        "".length();
        llllllllllllllllIlIIIlIIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[7]]).right(String.valueOf(llllllllllllllllIlIIIlIIIllIlIII.bZ.j())).build());
        "".length();
        Iterator<e> llllllllllllllllIlIIIlIIIllIIlIl = llllllllllllllllIlIIIlIIIllIlIII.cb.av().keySet().iterator();
        while (DebugOverlay.lIIllllIlIIIll(llllllllllllllllIlIIIlIIIllIIlIl.hasNext() ? 1 : 0)) {
            e llllllllllllllllIlIIIlIIIllIIlII = llllllllllllllllIlIIIlIIIllIIlIl.next();
            llllllllllllllllIlIIIlIIIllIlIII.panelComponent.getChildren().add(LineComponent.builder().left(llllllllllllllllIlIIIlIIIllIIlII.toString()).right(llllllllllllllllIlIIIlIIIllIlIII.cb.av().get((Object)llllllllllllllllIlIIIlIIIllIIlII).toString()).build());
            "".length();
            "".length();
            if (((0x72 ^ 0x36) & ~(0x31 ^ 0x75)) == 0) continue;
            return null;
        }
        return super.render(graphics2D);
    }
}

