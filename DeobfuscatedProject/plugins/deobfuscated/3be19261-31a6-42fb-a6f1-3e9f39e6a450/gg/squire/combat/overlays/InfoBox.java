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
package gg.squire.combat.overlays;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
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
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class InfoBox
extends OverlayPanel {
    private final /* synthetic */ SquireBlueDragonKiller p;
    private final /* synthetic */ SquireBlueDragonKiller r;
    private final /* synthetic */ TaskManager q;
    private static /* synthetic */ int[] lIIlllIlIIll;
    private static /* synthetic */ String[] lIIlllIlIIlI;
    private final /* synthetic */ SquireBlueDragonKillerConfig s;

    public long g(int n) {
        Duration duration = Duration.between(this.r.getStarted(), Instant.now());
        if (InfoBox.llIlIIIIllIlII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean llIlIIIIllIlII(int n) {
        return n == 0;
    }

    static {
        InfoBox.llIlIIIIllIIlI();
        InfoBox.llIlIIIIllIIIl();
    }

    private static boolean llIlIIIIllIIll(int n) {
        return n != 0;
    }

    private static boolean llIlIIIIllIlIl(int n, int n2) {
        return n < n2;
    }

    private static void llIlIIIIllIIIl() {
        lIIlllIlIIlI = new String[lIIlllIlIIll[10]];
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[0]] = InfoBox."Squire Blue Dragon Killer";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[1]] = InfoBox."Runtime: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[2]] = InfoBox."Version";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[3]] = InfoBox."1.1.0";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[4]] = InfoBox."Task: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[5]] = InfoBox."Dragon Bones: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[6]] = InfoBox."Dragon Hides / H: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[7]] = InfoBox."Dragon Scales / H: ";
        InfoBox.lIIlllIlIIlI[InfoBox.lIIlllIlIIll[8]] = InfoBox."Ensouled Heads / H: ";
    }

    private static String llIlIIIIllIIII(String lllllllllllllllIlllIlIllIIlIIllI, String lllllllllllllllIlllIlIllIIlIIlIl) {
        lllllllllllllllIlllIlIllIIlIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIllIIlIlIIl = new StringBuilder();
        char[] lllllllllllllllIlllIlIllIIlIlIII = lllllllllllllllIlllIlIllIIlIIlIl.toCharArray();
        int lllllllllllllllIlllIlIllIIlIIlll = lIIlllIlIIll[0];
        char[] lllllllllllllllIlllIlIllIIlIIIIl = lllllllllllllllIlllIlIllIIlIIllI.toCharArray();
        int lllllllllllllllIlllIlIllIIlIIIII = lllllllllllllllIlllIlIllIIlIIIIl.length;
        int lllllllllllllllIlllIlIllIIIlllll = lIIlllIlIIll[0];
        while (InfoBox.llIlIIIIllIlIl(lllllllllllllllIlllIlIllIIIlllll, lllllllllllllllIlllIlIllIIlIIIII)) {
            char lllllllllllllllIlllIlIllIIlIllII = lllllllllllllllIlllIlIllIIlIIIIl[lllllllllllllllIlllIlIllIIIlllll];
            lllllllllllllllIlllIlIllIIlIlIIl.append((char)(lllllllllllllllIlllIlIllIIlIllII ^ lllllllllllllllIlllIlIllIIlIlIII[lllllllllllllllIlllIlIllIIlIIlll % lllllllllllllllIlllIlIllIIlIlIII.length]));
            0;
            ++lllllllllllllllIlllIlIllIIlIIlll;
            ++lllllllllllllllIlllIlIllIIIlllll;
            0;
            if ((69 + 73 - 74 + 87 ^ 78 + 13 - 56 + 124) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIllIIlIlIIl);
    }

    private static String llIlIIIIlIlllI(String lllllllllllllllIlllIlIllIIIlIllI, String lllllllllllllllIlllIlIllIIIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIllIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIllIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIllIIIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIllIIIllIII.init(lIIlllIlIIll[2], lllllllllllllllIlllIlIllIIIllIIl);
            return new String(lllllllllllllllIlllIlIllIIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIllIIIlIlll) {
            lllllllllllllllIlllIlIllIIIlIlll.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox lllllllllllllllIlllIlIllIIllllll;
        if (InfoBox.llIlIIIIllIIll(this.p.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration lllllllllllllllIlllIlIllIIllllIl = Duration.between(lllllllllllllllIlllIlIllIIllllll.p.getStarted(), Instant.now());
        lllllllllllllllIlllIlIllIIllllll.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIlllIlIIlI[lIIlllIlIIll[0]]).build());
        0;
        lllllllllllllllIlllIlIllIIllllll.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[1]]).right(Time.format((Duration)lllllllllllllllIlllIlIllIIllllIl)).build());
        0;
        lllllllllllllllIlllIlIllIIllllll.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[2]]).right(lIIlllIlIIlI[lIIlllIlIIll[3]]).build());
        0;
        lllllllllllllllIlllIlIllIIllllll.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[4]]).right(lllllllllllllllIlllIlIllIIllllll.q.getCurrentTask()).build());
        0;
        if (InfoBox.llIlIIIIllIIll(lllllllllllllllIlllIlIllIIllllll.s.lootBones() ? 1 : 0)) {
            lllllllllllllllIlllIlIllIIllllll.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[5]]).right(lllllllllllllllIlllIlIllIIllllll.r.d() + " (" + lllllllllllllllIlllIlIllIIllllll.g(lllllllllllllllIlllIlIllIIllllll.r.d()) + "/h)").build());
            0;
        }
        if (InfoBox.llIlIIIIllIIll(lllllllllllllllIlllIlIllIIllllll.s.lootHides() ? 1 : 0)) {
            lllllllllllllllIlllIlIllIIllllll.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[6]]).right(lllllllllllllllIlllIlIllIIllllll.r.e() + " (" + lllllllllllllllIlllIlIllIIllllll.g(lllllllllllllllIlllIlIllIIllllll.r.e()) + "/h)").build());
            0;
        }
        if (InfoBox.llIlIIIIllIIll(lllllllllllllllIlllIlIllIIllllll.s.lootScales() ? 1 : 0)) {
            lllllllllllllllIlllIlIllIIllllll.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[7]]).right(lllllllllllllllIlllIlIllIIllllll.r.f() + " (" + lllllllllllllllIlllIlIllIIllllll.g(lllllllllllllllIlllIlIllIIllllll.r.f()) + "/h)").build());
            0;
        }
        if (InfoBox.llIlIIIIllIIll(lllllllllllllllIlllIlIllIIllllll.s.lootEnsouled() ? 1 : 0)) {
            lllllllllllllllIlllIlIllIIllllll.panelComponent.getChildren().add(LineComponent.builder().left(lIIlllIlIIlI[lIIlllIlIIll[8]]).right(lllllllllllllllIlllIlIllIIllllll.r.g() + " (" + lllllllllllllllIlllIlIllIIllllll.g(lllllllllllllllIlllIlIllIIllllll.r.g()) + "/h)").build());
            0;
        }
        int n = lIIlllIlIIll[9];
        this.panelComponent.setPreferredSize(new Dimension(n, lIIlllIlIIll[0]));
        return super.render(graphics2D);
    }

    private static String llIlIIIIlIllll(String lllllllllllllllIlllIlIllIIIIlIIl, String lllllllllllllllIlllIlIllIIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIllIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIllIIIIIllI.getBytes(StandardCharsets.UTF_8)), lIIlllIlIIll[8]), "DES");
            Cipher lllllllllllllllIlllIlIllIIIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIllIIIIlIll.init(lIIlllIlIIll[2], lllllllllllllllIlllIlIllIIIIllII);
            return new String(lllllllllllllllIlllIlIllIIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIllIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIllIIIIlIlI) {
            lllllllllllllllIlllIlIllIIIIlIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    public InfoBox(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKiller squireBlueDragonKiller2, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.p = squireBlueDragonKiller;
        this.q = squireBlueDragonKiller.getManager();
        this.r = squireBlueDragonKiller2;
        this.s = squireBlueDragonKillerConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static void llIlIIIIllIIlI() {
        lIIlllIlIIll = new int[11];
        InfoBox.lIIlllIlIIll[0] = (0x76 ^ 0x73) & ~(0x34 ^ 0x31);
        InfoBox.lIIlllIlIIll[1] = 1;
        InfoBox.lIIlllIlIIll[2] = 2;
        InfoBox.lIIlllIlIIll[3] = 3;
        InfoBox.lIIlllIlIIll[4] = 25 + 156 - 93 + 101 ^ 157 + 140 - 181 + 69;
        InfoBox.lIIlllIlIIll[5] = 0 ^ 5;
        InfoBox.lIIlllIlIIll[6] = 0x52 ^ 0x54;
        InfoBox.lIIlllIlIIll[7] = 0x13 ^ 0x33 ^ (0x39 ^ 0x1E);
        InfoBox.lIIlllIlIIll[8] = 0x95 ^ 0xC4 ^ (0x1E ^ 0x47);
        InfoBox.lIIlllIlIIll[9] = 0xFFFF8DD3 & 0x732E;
        InfoBox.lIIlllIlIIll[10] = 0xBB ^ 0xB2;
    }
}

