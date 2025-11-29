/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.NPC
 *  net.runelite.api.util.Text
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.zulrah.overlay;

import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.zulrah.SquireZulrah;
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
import net.runelite.api.NPC;
import net.runelite.api.util.Text;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class ZulrahInfoBox
extends OverlayPanel {
    private static /* synthetic */ int[] lIllIlIlIIlll;
    private static /* synthetic */ String[] lIllIlIlIIlII;
    private final /* synthetic */ v O;
    private final /* synthetic */ SquireZulrah N;

    private static String llIIIllllllIlll(String llllllllllllllIllIIIllIlllIlIIIl, String llllllllllllllIllIIIllIlllIlIIII) {
        llllllllllllllIllIIIllIlllIlIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIlllIlIlII = new StringBuilder();
        char[] llllllllllllllIllIIIllIlllIlIIll = llllllllllllllIllIIIllIlllIlIIII.toCharArray();
        int llllllllllllllIllIIIllIlllIlIIlI = lIllIlIlIIlll[2];
        char[] llllllllllllllIllIIIllIlllIIllII = llllllllllllllIllIIIllIlllIlIIIl.toCharArray();
        int llllllllllllllIllIIIllIlllIIlIll = llllllllllllllIllIIIllIlllIIllII.length;
        int llllllllllllllIllIIIllIlllIIlIlI = lIllIlIlIIlll[2];
        while (ZulrahInfoBox.llIIlIIIIIIIlIl(llllllllllllllIllIIIllIlllIIlIlI, llllllllllllllIllIIIllIlllIIlIll)) {
            char llllllllllllllIllIIIllIlllIlIlll = llllllllllllllIllIIIllIlllIIllII[llllllllllllllIllIIIllIlllIIlIlI];
            llllllllllllllIllIIIllIlllIlIlII.append((char)(llllllllllllllIllIIIllIlllIlIlll ^ llllllllllllllIllIIIllIlllIlIIll[llllllllllllllIllIIIllIlllIlIIlI % llllllllllllllIllIIIllIlllIlIIll.length]));
            0;
            ++llllllllllllllIllIIIllIlllIlIIlI;
            ++llllllllllllllIllIIIllIlllIIlIlI;
            0;
            if (((41 + 122 - 147 + 163 ^ 131 + 112 - 198 + 87) & (0x17 ^ 0x69 ^ (0xDA ^ 0x93) ^ -1)) <= ((0x20 ^ 0x65 ^ (2 ^ 0x52)) & (165 + 171 - 193 + 45 ^ 158 + 14 - 76 + 73 ^ -1))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIllIlllIlIlII);
    }

    private static void llIIlIIIIIIIIII() {
        lIllIlIlIIlII = new String[lIllIlIlIIlll[13]];
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[2]] = ZulrahInfoBox."Squire Zulrah";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[3]] = ZulrahInfoBox."Version";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[4]] = ZulrahInfoBox."0.2.0";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[5]] = ZulrahInfoBox."Runtime";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[6]] = ZulrahInfoBox."Performing Task";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[7]] = ZulrahInfoBox."Banking";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[8]] = ZulrahInfoBox."Killed zulrah";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[9]] = ZulrahInfoBox."Kills";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[10]] = ZulrahInfoBox."%d (%d/h)";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[11]] = ZulrahInfoBox."Zulrah Health";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[0]] = ZulrahInfoBox."Zulrah Rotation";
        ZulrahInfoBox.lIllIlIlIIlII[ZulrahInfoBox.lIllIlIlIIlll[12]] = ZulrahInfoBox."Zulrah Style";
    }

    static {
        ZulrahInfoBox.llIIlIIIIIIIIIl();
        ZulrahInfoBox.llIIlIIIIIIIIII();
    }

    private static boolean llIIlIIIIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIIIIIIIlI(int n2) {
        return n2 != 0;
    }

    private static void llIIlIIIIIIIIIl() {
        lIllIlIlIIlll = new int[14];
        ZulrahInfoBox.lIllIlIlIIlll[0] = 0x69 ^ 0x63;
        ZulrahInfoBox.lIllIlIlIIlll[1] = 0xFFFF8557 & 0x7BAA;
        ZulrahInfoBox.lIllIlIlIIlll[2] = (0xCA ^ 0xC5) & ~(0x34 ^ 0x3B);
        ZulrahInfoBox.lIllIlIlIIlll[3] = 1;
        ZulrahInfoBox.lIllIlIlIIlll[4] = 2;
        ZulrahInfoBox.lIllIlIlIIlll[5] = 3;
        ZulrahInfoBox.lIllIlIlIIlll[6] = 0x97 ^ 0x93;
        ZulrahInfoBox.lIllIlIlIIlll[7] = 6 ^ 3;
        ZulrahInfoBox.lIllIlIlIIlll[8] = 0x71 ^ 0x77;
        ZulrahInfoBox.lIllIlIlIIlll[9] = 28 + 121 - 56 + 40 ^ 37 + 60 - 24 + 57;
        ZulrahInfoBox.lIllIlIlIIlll[10] = 0x90 ^ 0x98;
        ZulrahInfoBox.lIllIlIlIIlll[11] = 0x6E ^ 0x67;
        ZulrahInfoBox.lIllIlIlIIlll[12] = 167 + 129 - 186 + 95 ^ 51 + 45 - -98 + 4;
        ZulrahInfoBox.lIllIlIlIIlll[13] = 0x34 ^ 0x38;
    }

    public Dimension render(Graphics2D graphics2D) {
        ZulrahInfoBox llllllllllllllIllIIIlllIIIIIIllI;
        if (ZulrahInfoBox.llIIlIIIIIIIIlI(this.N.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        llllllllllllllIllIIIlllIIIIIIllI.panelComponent.setBorder(new Rectangle(lIllIlIlIIlll[0], lIllIlIlIIlll[0], lIllIlIlIIlll[0], lIllIlIlIIlll[0]));
        llllllllllllllIllIIIlllIIIIIIllI.panelComponent.setPreferredSize(new Dimension(lIllIlIlIIlll[1], lIllIlIlIIlll[2]));
        String llllllllllllllIllIIIlllIIIIIIlII = lIllIlIlIIlII[lIllIlIlIIlll[2]];
        llllllllllllllIllIIIlllIIIIIIllI.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llllllllllllllIllIIIlllIIIIIIlII).build());
        0;
        llllllllllllllIllIIIlllIIIIIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[3]]).right(lIllIlIlIIlII[lIllIlIlIIlll[4]]).build());
        0;
        Duration llllllllllllllIllIIIlllIIIIIIIll = Duration.between(llllllllllllllIllIIIlllIIIIIIllI.N.getStarted(), Instant.now());
        llllllllllllllIllIIIlllIIIIIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[5]]).right(Time.format((Duration)llllllllllllllIllIIIlllIIIIIIIll)).build());
        0;
        llllllllllllllIllIIIlllIIIIIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[6]]).right(llllllllllllllIllIIIlllIIIIIIllI.N.getManager().getCurrentTask()).build());
        0;
        llllllllllllllIllIIIlllIIIIIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[7]]).right(String.valueOf(llllllllllllllIllIIIlllIIIIIIllI.N.d())).build());
        0;
        llllllllllllllIllIIIlllIIIIIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[8]]).right(String.valueOf(llllllllllllllIllIIIlllIIIIIIllI.N.e())).build());
        0;
        int llllllllllllllIllIIIlllIIIIIIIlI = (int)llllllllllllllIllIIIlllIIIIIIllI.i(llllllllllllllIllIIIlllIIIIIIllI.O.Y());
        Object[] objectArray = new Object[lIllIlIlIIlll[4]];
        objectArray[ZulrahInfoBox.lIllIlIlIIlll[2]] = llllllllllllllIllIIIlllIIIIIIllI.O.Y();
        objectArray[ZulrahInfoBox.lIllIlIlIIlll[3]] = llllllllllllllIllIIIlllIIIIIIIlI;
        llllllllllllllIllIIIlllIIIIIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[9]]).right(String.format(lIllIlIlIIlII[lIllIlIlIIlll[10]], objectArray)).build());
        0;
        NPC llllllllllllllIllIIIlllIIIIIIIIl = llllllllllllllIllIIIlllIIIIIIllI.O.W();
        if (ZulrahInfoBox.llIIlIIIIIIIIll(llllllllllllllIllIIIlllIIIIIIIIl)) {
            llllllllllllllIllIIIlllIIIIIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[11]]).right(String.valueOf((int)((double)llllllllllllllIllIIIlllIIIIIIIIl.getHealthRatio() * 4.25))).build());
            0;
            llllllllllllllIllIIIlllIIIIIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[0]]).right(Text.titleCase((Enum)llllllllllllllIllIIIlllIIIIIIllI.O.V().C())).build());
            0;
            llllllllllllllIllIIIlllIIIIIIllI.panelComponent.getChildren().add(LineComponent.builder().left(lIllIlIlIIlII[lIllIlIlIIlll[12]]).right(Text.titleCase((Enum)llllllllllllllIllIIIlllIIIIIIllI.O.V().C().w())).build());
            0;
        }
        return super.render(graphics2D);
    }

    public long i(int n2) {
        Duration duration = Duration.between(this.N.getStarted(), Instant.now());
        if (ZulrahInfoBox.llIIlIIIIIIIlII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static String llIIIlllllllIII(String llllllllllllllIllIIIllIlllllIIll, String llllllllllllllIllIIIllIlllllIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIIllIlllllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIlllllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIllIlllllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIllIlllllIlIl.init(lIllIlIlIIlll[4], llllllllllllllIllIIIllIlllllIllI);
            return new String(llllllllllllllIllIIIllIlllllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIlllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllIlllllIlII) {
            llllllllllllllIllIIIllIlllllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIIIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIIIIIIIll(Object object) {
        return object != null;
    }

    @Inject
    public ZulrahInfoBox(SquireZulrah squireZulrah, v v2) {
        this.N = squireZulrah;
        this.O = v2;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

    private static String llIIIlllllllIll(String llllllllllllllIllIIIllIllllIIlII, String llllllllllllllIllIIIllIllllIIIll) {
        try {
            SecretKeySpec llllllllllllllIllIIIllIllllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIllllIIIll.getBytes(StandardCharsets.UTF_8)), lIllIlIlIIlll[10]), "DES");
            Cipher llllllllllllllIllIIIllIllllIlIII = Cipher.getInstance("DES");
            llllllllllllllIllIIIllIllllIlIII.init(lIllIlIlIIlll[4], llllllllllllllIllIIIllIllllIlIIl);
            return new String(llllllllllllllIllIIIllIllllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllIllllIIlll) {
            llllllllllllllIllIIIllIllllIIlll.printStackTrace();
            return null;
        }
    }
}

