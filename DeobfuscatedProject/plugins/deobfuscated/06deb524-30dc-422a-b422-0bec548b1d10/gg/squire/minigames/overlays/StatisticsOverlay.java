/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskManager
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.minigames.overlays;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.F;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.G;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.minigames.SquireBlastFurnace;
import gg.squire.minigames.SquireBlastFurnaceConfig;
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
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class StatisticsOverlay
extends OverlayPanel {
    private static /* synthetic */ String[] lIIllIIlllll;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    private static /* synthetic */ int[] lIIllIlIIIII;
    private final /* synthetic */ TaskManager bZ;
    private final /* synthetic */ SquireBlastFurnace ca;
    @Inject
    private /* synthetic */ G u;
    public static final /* synthetic */ String bY;

    static {
        StatisticsOverlay.llIIllllIIIIll();
        StatisticsOverlay.llIIllllIIIIlI();
        bY = lIIllIIlllll[lIIllIlIIIII[9]];
    }

    private static boolean llIIllllIIIlII(int n2) {
        return n2 != 0;
    }

    private static void llIIllllIIIIll() {
        lIIllIlIIIII = new int[12];
        StatisticsOverlay.lIIllIlIIIII[0] = 53 + 45 - 79 + 119 + (43 + 53 - 22 + 57) - (4 ^ 0x7E) + (0x9B ^ 0x9C);
        StatisticsOverlay.lIIllIlIIIII[1] = 0x58 ^ 0x4C;
        StatisticsOverlay.lIIllIlIIIII[2] = (0x5F ^ 0x72) & ~(0x5E ^ 0x73);
        StatisticsOverlay.lIIllIlIIIII[3] = 8 ^ 0x72 ^ (0xE0 ^ 0x90);
        StatisticsOverlay.lIIllIlIIIII[4] = 1;
        StatisticsOverlay.lIIllIlIIIII[5] = 2;
        StatisticsOverlay.lIIllIlIIIII[6] = 3;
        StatisticsOverlay.lIIllIlIIIII[7] = 0xD8 ^ 0x87 ^ (0xE0 ^ 0xBB);
        StatisticsOverlay.lIIllIlIIIII[8] = 0x27 ^ 0x14 ^ (0x88 ^ 0xBE);
        StatisticsOverlay.lIIllIlIIIII[9] = 0x7E ^ 0x78;
        StatisticsOverlay.lIIllIlIIIII[10] = 0x1C ^ 0x1B;
        StatisticsOverlay.lIIllIlIIIII[11] = 0x2A ^ 0x22;
    }

    public Dimension render(Graphics2D graphics2D) {
        if (StatisticsOverlay.llIIllllIIIlII(this.ca.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        int n2 = lIIllIlIIIII[0];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIIllIlIIIII[1], lIIllIlIIIII[2]));
        this.panelComponent.setBorder(new Rectangle(lIIllIlIIIII[3], lIIllIlIIIII[3], lIIllIlIIIII[3], lIIllIlIIIII[3]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIIllIIlllll[lIIllIlIIIII[2]]).build());
        0;
        Duration duration = Duration.between(this.ca.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[5]]).right(F.h(this.u.aa())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[6]]).right(F.h(this.u.ah())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[7]]).right(F.a(this.u.ab())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIIlllll[lIIllIlIIIII[8]]).right(F.h(this.u.ai())).build());
        0;
        return super.render(graphics2D);
    }

    private static void llIIllllIIIIlI() {
        lIIllIIlllll = new String[lIIllIlIIIII[10]];
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[2]] = StatisticsOverlay."Squire Blast Furnace";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[4]] = StatisticsOverlay."Runtime";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[5]] = StatisticsOverlay."Bars made:";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[6]] = StatisticsOverlay."Bars/hr:";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[7]] = StatisticsOverlay."XP gained:";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[8]] = StatisticsOverlay."XP/hr:";
        StatisticsOverlay.lIIllIIlllll[StatisticsOverlay.lIIllIlIIIII[9]] = StatisticsOverlay."Clear";
    }

    private static String llIIllllIIIIIl(String lllllllllllllllIlllIlllIIIlIIlII, String lllllllllllllllIlllIlllIIIlIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllIIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlllIIIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlllIIIlIIllI.init(lIIllIlIIIII[5], lllllllllllllllIlllIlllIIIlIIlll);
            return new String(lllllllllllllllIlllIlllIIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlllIIIlIIlIl) {
            lllllllllllllllIlllIlllIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllllIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    StatisticsOverlay(SquireBlastFurnace squireBlastFurnace) {
        super((Plugin)squireBlastFurnace);
        this.ca = squireBlastFurnace;
        this.bZ = squireBlastFurnace.getManager();
    }

    private static String llIIlllIllllll(String lllllllllllllllIlllIlllIIIIlIlIl, String lllllllllllllllIlllIlllIIIIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllIIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllIIIIlIlII.getBytes(StandardCharsets.UTF_8)), lIIllIlIIIII[11]), "DES");
            Cipher lllllllllllllllIlllIlllIIIIllIIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIlllIIIIllIIl.init(lIIllIlIIIII[5], lllllllllllllllIlllIlllIIIIllIlI);
            return new String(lllllllllllllllIlllIlllIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlllIIIIllIII) {
            lllllllllllllllIlllIlllIIIIllIII.printStackTrace();
            return null;
        }
    }

    private static String llIIllllIIIIII(String lllllllllllllllIlllIlllIIIIIIlll, String lllllllllllllllIlllIlllIIIIIIIIl) {
        lllllllllllllllIlllIlllIIIIIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlllIIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlllIIIIIIlIl = new StringBuilder();
        char[] lllllllllllllllIlllIlllIIIIIIlII = lllllllllllllllIlllIlllIIIIIIIIl.toCharArray();
        int lllllllllllllllIlllIlllIIIIIIIll = lIIllIlIIIII[2];
        char[] lllllllllllllllIlllIllIlllllllIl = lllllllllllllllIlllIlllIIIIIIlll.toCharArray();
        int lllllllllllllllIlllIllIlllllllII = lllllllllllllllIlllIllIlllllllIl.length;
        int lllllllllllllllIlllIllIllllllIll = lIIllIlIIIII[2];
        while (StatisticsOverlay.llIIllllIIIlIl(lllllllllllllllIlllIllIllllllIll, lllllllllllllllIlllIllIlllllllII)) {
            char lllllllllllllllIlllIlllIIIIIlIII = lllllllllllllllIlllIllIlllllllIl[lllllllllllllllIlllIllIllllllIll];
            lllllllllllllllIlllIlllIIIIIIlIl.append((char)(lllllllllllllllIlllIlllIIIIIlIII ^ lllllllllllllllIlllIlllIIIIIIlII[lllllllllllllllIlllIlllIIIIIIIll % lllllllllllllllIlllIlllIIIIIIlII.length]));
            0;
            ++lllllllllllllllIlllIlllIIIIIIIll;
            ++lllllllllllllllIlllIllIllllllIll;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlllIIIIIIlIl);
    }
}

