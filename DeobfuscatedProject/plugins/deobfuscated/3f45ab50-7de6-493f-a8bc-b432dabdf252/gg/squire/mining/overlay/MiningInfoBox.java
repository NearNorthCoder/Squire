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
package gg.squire.mining.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.T;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class MiningInfoBox
extends OverlayPanel {
    private final /* synthetic */ SquireMinerConfig n;
    private final /* synthetic */ TaskManager m;
    private final /* synthetic */ SquireMiner l;
    private static /* synthetic */ int[] lllllIllIIll;
    private static /* synthetic */ String[] lllllIlIlIIl;
    private final /* synthetic */ T o;

    private static boolean lIIlIIlllIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIlllIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIllIlIllII(String lllllllllllllllIIlIIlIIllIIIlIll, String lllllllllllllllIIlIIlIIllIIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIllIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), lllllIllIIll[10]), "DES");
            Cipher lllllllllllllllIIlIIlIIllIIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIIllIIIllIl.init(lllllIllIIll[2], lllllllllllllllIIlIIlIIllIIIlllI);
            return new String(lllllllllllllllIIlIIlIIllIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIllIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIIllIIIllII) {
            lllllllllllllllIIlIIlIIllIIIllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIlllIIllII() {
        lllllIlIlIIl = new String[lllllIllIIll[14]];
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[0]] = MiningInfoBox."Squire Miner";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[1]] = MiningInfoBox."Runtime";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[2]] = MiningInfoBox."Version";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[3]] = MiningInfoBox."1.3.4";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[4]] = MiningInfoBox."Task: ";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[7]] = MiningInfoBox."Paydirt: ";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[8]] = MiningInfoBox."%d | %d | %d";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[9]] = MiningInfoBox."Sack size: ";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[10]] = MiningInfoBox."Banking:";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[11]] = MiningInfoBox."Mined";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[12]] = MiningInfoBox."Mined";
        MiningInfoBox.lllllIlIlIIl[MiningInfoBox.lllllIllIIll[13]] = MiningInfoBox."Mined Per Hour";
    }

    public long a(int n2) {
        Duration duration = Duration.between(this.l.getStarted(), Instant.now());
        if (MiningInfoBox.lIIlIIlllIlIIII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static String lIIlIIllIlIlIll(String lllllllllllllllIIlIIlIIllIIllIll, String lllllllllllllllIIlIIlIIllIIllIlI) {
        lllllllllllllllIIlIIlIIllIIllIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIllIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlIIllIIllllI = new StringBuilder();
        char[] lllllllllllllllIIlIIlIIllIIlllIl = lllllllllllllllIIlIIlIIllIIllIlI.toCharArray();
        int lllllllllllllllIIlIIlIIllIIlllII = lllllIllIIll[0];
        char[] lllllllllllllllIIlIIlIIllIIlIllI = lllllllllllllllIIlIIlIIllIIllIll.toCharArray();
        int lllllllllllllllIIlIIlIIllIIlIlIl = lllllllllllllllIIlIIlIIllIIlIllI.length;
        int lllllllllllllllIIlIIlIIllIIlIlII = lllllIllIIll[0];
        while (MiningInfoBox.lIIlIIlllIlIIIl(lllllllllllllllIIlIIlIIllIIlIlII, lllllllllllllllIIlIIlIIllIIlIlIl)) {
            char lllllllllllllllIIlIIlIIllIlIIIIl = lllllllllllllllIIlIIlIIllIIlIllI[lllllllllllllllIIlIIlIIllIIlIlII];
            lllllllllllllllIIlIIlIIllIIllllI.append((char)(lllllllllllllllIIlIIlIIllIlIIIIl ^ lllllllllllllllIIlIIlIIllIIlllIl[lllllllllllllllIIlIIlIIllIIlllII % lllllllllllllllIIlIIlIIllIIlllIl.length]));
            0;
            ++lllllllllllllllIIlIIlIIllIIlllII;
            ++lllllllllllllllIIlIIlIIllIIlIlII;
            0;
            if (-1 <= 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIlIIllIIllllI);
    }

    private static boolean lIIlIIlllIIllll(Object object, Object object2) {
        return object == object2;
    }

    static {
        MiningInfoBox.lIIlIIlllIIllIl();
        MiningInfoBox.lIIlIIlllIIllII();
    }

    private static String lIIlIIllIlIllIl(String lllllllllllllllIIlIIlIIllIlIlllI, String lllllllllllllllIIlIIlIIllIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIllIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIllIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIIllIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIIllIllIIlI.init(lllllIllIIll[2], lllllllllllllllIIlIIlIIllIllIIll);
            return new String(lllllllllllllllIIlIIlIIllIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIIllIllIIIl) {
            lllllllllllllllIIlIIlIIllIllIIIl.printStackTrace();
            return null;
        }
    }

    private void b(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[11]]).right(String.valueOf(this.l.b())).build());
        0;
    }

    private void c(Graphics2D graphics2D) {
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[12]]).right(String.valueOf(this.l.b())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[13]]).right(String.valueOf(this.a(this.l.b()))).build());
        0;
    }

    /*
     * WARNING - void declaration
     */
    public Dimension render(Graphics2D graphics2D) {
        void lllllllllllllllIIlIIlIIlllIIIIII;
        MiningInfoBox lllllllllllllllIIlIIlIIlllIIIIIl;
        if (MiningInfoBox.lIIlIIlllIIlllI(this.l.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration lllllllllllllllIIlIIlIIllIllllll = Duration.between(lllllllllllllllIIlIIlIIlllIIIIIl.l.getStarted(), Instant.now());
        lllllllllllllllIIlIIlIIlllIIIIIl.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllllIlIlIIl[lllllIllIIll[0]]).build());
        0;
        lllllllllllllllIIlIIlIIlllIIIIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[1]]).right(Time.format((Duration)lllllllllllllllIIlIIlIIllIllllll)).build());
        0;
        lllllllllllllllIIlIIlIIlllIIIIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[2]]).right(lllllIlIlIIl[lllllIllIIll[3]]).build());
        0;
        lllllllllllllllIIlIIlIIlllIIIIIl.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[4]]).right(lllllllllllllllIIlIIlIIlllIIIIIl.m.getCurrentTask()).build());
        0;
        if (MiningInfoBox.lIIlIIlllIIllll((Object)lllllllllllllllIIlIIlIIlllIIIIIl.n.activity(), (Object)a.GRANITE)) {
            lllllllllllllllIIlIIlIIlllIIIIIl.c((Graphics2D)lllllllllllllllIIlIIlIIlllIIIIII);
        }
        if (MiningInfoBox.lIIlIIlllIIllll((Object)lllllllllllllllIIlIIlIIlllIIIIIl.n.activity(), (Object)a.SANDSTONE)) {
            lllllllllllllllIIlIIlIIlllIIIIIl.b((Graphics2D)lllllllllllllllIIlIIlIIlllIIIIII);
            0;
            if (null != null) {
                return null;
            }
        } else if (MiningInfoBox.lIIlIIlllIIllll((Object)lllllllllllllllIIlIIlIIlllIIIIIl.n.activity(), (Object)a.MOTHERLODE_MINE)) {
            lllllllllllllllIIlIIlIIlllIIIIIl.a((Graphics2D)lllllllllllllllIIlIIlIIlllIIIIII);
        }
        int n2 = lllllIllIIll[5];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllllIllIIll[6], lllllIllIIll[0]));
        return super.render(graphics2D);
    }

    private static void lIIlIIlllIIllIl() {
        lllllIllIIll = new int[15];
        MiningInfoBox.lllllIllIIll[0] = (0x61 ^ 0x3F) & ~(0x78 ^ 0x26);
        MiningInfoBox.lllllIllIIll[1] = 1;
        MiningInfoBox.lllllIllIIll[2] = 2;
        MiningInfoBox.lllllIllIIll[3] = 3;
        MiningInfoBox.lllllIllIIll[4] = 186 + 183 - 320 + 142 ^ 185 + 147 - 248 + 103;
        MiningInfoBox.lllllIllIIll[5] = -(0xFFFFFFF5 & 0x6E5F) & (0xFFFFFF56 & 0x6FFF);
        MiningInfoBox.lllllIllIIll[6] = 0x9F ^ 0x8B;
        MiningInfoBox.lllllIllIIll[7] = 0x18 ^ 0x1D;
        MiningInfoBox.lllllIllIIll[8] = 1 ^ 7;
        MiningInfoBox.lllllIllIIll[9] = 0xE7 ^ 0xBD ^ (0x2F ^ 0x72);
        MiningInfoBox.lllllIllIIll[10] = 0x5F ^ 0x57;
        MiningInfoBox.lllllIllIIll[11] = 102 + 33 - 9 + 5 ^ 125 + 35 - 38 + 16;
        MiningInfoBox.lllllIllIIll[12] = 29 + 132 - 27 + 22 ^ 134 + 80 - 151 + 87;
        MiningInfoBox.lllllIllIIll[13] = 90 + 67 - 115 + 163 ^ 63 + 126 - 23 + 32;
        MiningInfoBox.lllllIllIIll[14] = 0xF1 ^ 0x97 ^ (0x47 ^ 0x2D);
    }

    private static boolean lIIlIIlllIIlllI(int n2) {
        return n2 != 0;
    }

    @Inject
    private MiningInfoBox(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig, T t2) {
        this.l = squireMiner;
        this.m = squireMiner.getManager();
        this.n = squireMinerConfig;
        this.o = t2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private void a(Graphics2D graphics2D) {
        Object[] objectArray = new Object[lllllIllIIll[3]];
        objectArray[MiningInfoBox.lllllIllIIll[0]] = this.o.C();
        objectArray[MiningInfoBox.lllllIllIIll[1]] = this.o.N();
        objectArray[MiningInfoBox.lllllIllIIll[2]] = this.o.M();
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[7]]).right(String.format(lllllIlIlIIl[lllllIllIIll[8]], objectArray)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[9]]).right(String.valueOf(this.o.H())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllllIlIlIIl[lllllIllIIll[10]]).right(String.valueOf(this.o.O())).build());
        0;
    }
}

