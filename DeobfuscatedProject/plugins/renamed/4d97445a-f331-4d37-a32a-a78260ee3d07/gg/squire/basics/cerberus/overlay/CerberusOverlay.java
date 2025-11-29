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
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.basics.cerberus.overlay;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.client.plugins.fw.TaskManager;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a_Unknown;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class CerberusOverlay
extends OverlayPanel {
    private final /* synthetic */ a ai;
    private final /* synthetic */ TaskManager aj;
    private final /* synthetic */ SquireCerberus ah;
    private static /* synthetic */ String[] lllIIllII;
    private static /* synthetic */ int[] lllIIllIl;

    private static boolean llIIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static void llIIIlIlIlI() {
        lllIIllIl = new int[21];
        CerberusOverlay.lllIIllIl[0] = (0x43 ^ 6 ^ (0x7E ^ 9)) & (44 + 45 - -8 + 43 ^ 95 + 53 - 54 + 96 ^ -1);
        CerberusOverlay.lllIIllIl[1] = 1;
        CerberusOverlay.lllIIllIl[2] = 2;
        CerberusOverlay.lllIIllIl[3] = 3;
        CerberusOverlay.lllIIllIl[4] = 0x7D ^ 0x2E ^ (0x29 ^ 0x7E);
        CerberusOverlay.lllIIllIl[5] = 0x66 ^ 0x63;
        CerberusOverlay.lllIIllIl[6] = 0x6A ^ 0x6C;
        CerberusOverlay.lllIIllIl[7] = 0x78 ^ 0x7F;
        CerberusOverlay.lllIIllIl[8] = 0x45 ^ 0x4D;
        CerberusOverlay.lllIIllIl[9] = 0x5F ^ 0x37 ^ (0x2B ^ 0x4A);
        CerberusOverlay.lllIIllIl[10] = 0xEA ^ 0x93 ^ (0xF6 ^ 0x85);
        CerberusOverlay.lllIIllIl[11] = 0x48 ^ 0x43;
        CerberusOverlay.lllIIllIl[12] = 0x83 ^ 0x8F;
        CerberusOverlay.lllIIllIl[13] = 0xB4 ^ 0xB9;
        CerberusOverlay.lllIIllIl[14] = 0x23 ^ 0x2D;
        CerberusOverlay.lllIIllIl[15] = 0x59 ^ 0xD ^ (0x62 ^ 0x39);
        CerberusOverlay.lllIIllIl[16] = 0x6E ^ 0x7E;
        CerberusOverlay.lllIIllIl[17] = 0xB3 ^ 0xA7 ^ (0x17 ^ 0x12);
        CerberusOverlay.lllIIllIl[18] = -(0xFFFFF4F7 & 0x6F2D) & (0xFFFFE57E & 0x7FA7);
        CerberusOverlay.lllIIllIl[19] = 0x29 ^ 0x6B ^ (0xFE ^ 0xA8);
        CerberusOverlay.lllIIllIl[20] = 0x16 ^ 4;
    }

    private long i(int n2) {
        Duration duration = Duration.between(this.ah.getStarted(), Instant.now());
        if (CerberusOverlay.llIIIlIlIll(duration.isZero() ? 1 : 0)) {
            return 0L;
        }
        return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
    }

    private static String llIIIlIlIII(String lIlIlIlllIIIIII, String lIlIlIllIlllIlI) {
        lIlIlIlllIIIIII = new String(Base64.getDecoder().decode(lIlIlIlllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIllIlllllI = new StringBuilder();
        char[] lIlIlIllIllllIl = lIlIlIllIlllIlI.toCharArray();
        int lIlIlIllIllllII = lllIIllIl[0];
        char[] lIlIlIllIllIllI = lIlIlIlllIIIIII.toCharArray();
        int lIlIlIllIllIlIl = lIlIlIllIllIllI.length;
        int lIlIlIllIllIlII = lllIIllIl[0];
        while (CerberusOverlay.llIIIlIllIl(lIlIlIllIllIlII, lIlIlIllIllIlIl)) {
            char lIlIlIlllIIIIIl = lIlIlIllIllIllI[lIlIlIllIllIlII];
            lIlIlIllIlllllI.append((char)(lIlIlIlllIIIIIl ^ lIlIlIllIllllIl[lIlIlIllIllllII % lIlIlIllIllllIl.length]));
            0;
            ++lIlIlIllIllllII;
            ++lIlIlIllIllIlII;
            0;
            if (-(0x64 ^ 0x60) <= 0) continue;
            return null;
        }
        return String.valueOf(lIlIlIllIlllllI);
    }

    private static String llIIIlIIllI(String lIlIlIlllIIlllI, String lIlIlIlllIIllll) {
        try {
            SecretKeySpec lIlIlIlllIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIlllIIllll.getBytes(StandardCharsets.UTF_8)), lllIIllIl[8]), "DES");
            Cipher lIlIlIlllIlIIlI = Cipher.getInstance("DES");
            lIlIlIlllIlIIlI.init(lllIIllIl[2], lIlIlIlllIlIIll);
            return new String(lIlIlIlllIlIIlI.doFinal(Base64.getDecoder().decode(lIlIlIlllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIlllIlIIIl) {
            lIlIlIlllIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIlIIlll(String lIlIlIllIlIlIIl, String lIlIlIllIlIlIlI) {
        try {
            SecretKeySpec lIlIlIllIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIllIlIllIl = Cipher.getInstance("Blowfish");
            lIlIlIllIlIllIl.init(lllIIllIl[2], lIlIlIllIlIlllI);
            return new String(lIlIlIllIlIllIl.doFinal(Base64.getDecoder().decode(lIlIlIllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIllIlIllII) {
            lIlIlIllIlIllII.printStackTrace();
            return null;
        }
    }

    static {
        CerberusOverlay.llIIIlIlIlI();
        CerberusOverlay.llIIIlIlIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        String string2;
        String string3;
        String string4;
        CerberusOverlay lIlIlIllllIIIIl;
        if (CerberusOverlay.llIIIlIlIll(this.ah.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        lIlIlIllllIIIIl.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIIllII[lllIIllIl[0]]).build());
        0;
        Duration lIlIlIlllIlllll = Duration.between(lIlIlIllllIIIIl.ah.getStarted(), Instant.now());
        lIlIlIllllIIIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[1]]).right(Time.format((Duration)lIlIlIlllIlllll)).build());
        0;
        List list = lIlIlIllllIIIIl.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lllIIllII[lllIIllIl[2]]);
        if (CerberusOverlay.llIIIlIllII(lIlIlIllllIIIIl.ai.k())) {
            string4 = lllIIllII[lllIIllIl[3]];
            0;
            if (((0x97 ^ 0xA2) & ~(0x9A ^ 0xAF)) >= 1) {
                return null;
            }
        } else {
            string4 = lllIIllII[lllIIllIl[4]];
        }
        list.add(lineComponentBuilder.right(string4).build());
        0;
        List list2 = lIlIlIllllIIIIl.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder2 = LineComponent.builder().left(lllIIllII[lllIIllIl[5]]);
        if (CerberusOverlay.llIIIlIlIll(lIlIlIllllIIIIl.ah.r() ? 1 : 0)) {
            string3 = lllIIllII[lllIIllIl[6]];
            0;
            if (3 < 3) {
                return null;
            }
        } else {
            string3 = lllIIllII[lllIIllIl[7]];
        }
        list2.add(lineComponentBuilder2.right(string3).build());
        0;
        lIlIlIllllIIIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[8]]).right(lIlIlIllllIIIIl.ah.q() + " (" + lIlIlIllllIIIIl.i(lIlIlIllllIIIIl.ah.q()) + "/hr)").build());
        0;
        List list3 = lIlIlIllllIIIIl.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder3 = LineComponent.builder().left(lllIIllII[lllIIllIl[9]]);
        if (CerberusOverlay.llIIIlIlIll(lIlIlIllllIIIIl.ai.h().isEmpty() ? 1 : 0)) {
            string2 = lllIIllII[lllIIllIl[10]];
            0;
            
            }
        } else {
            string2 = lllIIllII[lllIIllIl[11]];
        }
        list3.add(lineComponentBuilder3.right(string2).build());
        0;
        lIlIlIllllIIIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[12]]).right(String.valueOf(lIlIlIllllIIIIl.ai.n())).build());
        0;
        List list4 = lIlIlIllllIIIIl.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder4 = LineComponent.builder().left(lllIIllII[lllIIllIl[13]]);
        if (CerberusOverlay.llIIIlIlIll(lIlIlIllllIIIIl.ai.l() ? 1 : 0)) {
            string = lllIIllII[lllIIllIl[14]];
            0;
            if ((0xCC ^ 0x86 ^ (0x28 ^ 0x66)) != (0x24 ^ 0x15 ^ (0x92 ^ 0xA7))) {
                return null;
            }
        } else {
            string = lllIIllII[lllIIllIl[15]];
        }
        list4.add(lineComponentBuilder4.right(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[16]]).right(String.valueOf(this.ai.o())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[17]]).right(this.aj.getCurrentTask()).build());
        0;
        int n2 = lllIIllIl[18];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIIllIl[19], lllIIllIl[0]));
        return super.render(graphics2D);
    }

    private static void llIIIlIlIIl() {
        lllIIllII = new String[lllIIllIl[20]];
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[0]] = CerberusOverlay."Squire Cerberus";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[1]] = CerberusOverlay."Runtime";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[2]] = CerberusOverlay."Cerberus";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[3]] = CerberusOverlay."Alive";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[4]] = CerberusOverlay."Inactive";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[5]] = CerberusOverlay."Banking";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[6]] = CerberusOverlay."Active";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[7]] = CerberusOverlay."Inactive";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[8]] = CerberusOverlay."Kills: ";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[9]] = CerberusOverlay."Alive Ghosts: ";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[10]] = CerberusOverlay."No";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[11]] = CerberusOverlay."Yes";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[12]] = CerberusOverlay."Ghost Scream Tick: ";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[13]] = CerberusOverlay."Between Kills: ";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[14]] = CerberusOverlay."Yes";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[15]] = CerberusOverlay."No";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[16]] = CerberusOverlay."Game Tick: ";
        CerberusOverlay.lllIIllII[CerberusOverlay.lllIIllIl[17]] = CerberusOverlay."Task: ";
    }

    private static boolean llIIIlIllII(Object object) {
        return object != null;
    }

    @Inject
    private CerberusOverlay(SquireCerberus squireCerberus, a a2) {
        this.ah = squireCerberus;
        this.ai = a2;
        this.aj = squireCerberus.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

