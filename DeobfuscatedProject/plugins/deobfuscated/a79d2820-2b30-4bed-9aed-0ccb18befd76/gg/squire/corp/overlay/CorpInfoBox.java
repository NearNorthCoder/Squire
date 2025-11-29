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
package gg.squire.corp.overlay;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.s;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.corp.SquireCorp;
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
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class CorpInfoBox
extends OverlayPanel {
    private final /* synthetic */ SquireCorp j;
    private final /* synthetic */ s l;
    private static /* synthetic */ int[] lIlIlllIIlII;
    private static /* synthetic */ String[] lIlIlllIIIll;
    private final /* synthetic */ TaskManager k;

    private static void lllIIIIlIllIll() {
        lIlIlllIIlII = new int[13];
        CorpInfoBox.lIlIlllIIlII[0] = 0xAD ^ 0xA7;
        CorpInfoBox.lIlIlllIIlII[1] = (0x20 ^ 0x30 ^ (0x59 ^ 0x1B)) & (0x7F ^ 0x4F ^ (0x68 ^ 0xA) ^ -1);
        CorpInfoBox.lIlIlllIIlII[2] = 1;
        CorpInfoBox.lIlIlllIIlII[3] = 2;
        CorpInfoBox.lIlIlllIIlII[4] = 3;
        CorpInfoBox.lIlIlllIIlII[5] = 0xC5 ^ 0xC1;
        CorpInfoBox.lIlIlllIIlII[6] = 0x5A ^ 0x74 ^ (0x7B ^ 0x50);
        CorpInfoBox.lIlIlllIIlII[7] = 0x45 ^ 0x43;
        CorpInfoBox.lIlIlllIIlII[8] = 0xAD ^ 0x83 ^ (0x6D ^ 0x44);
        CorpInfoBox.lIlIlllIIlII[9] = 0x18 ^ 0x53 ^ (0x6A ^ 0x29);
        CorpInfoBox.lIlIlllIIlII[10] = 170 + 2 - 27 + 30 ^ 16 + 162 - 137 + 125;
        CorpInfoBox.lIlIlllIIlII[11] = 0x27 ^ 0x2C;
        CorpInfoBox.lIlIlllIIlII[12] = 0xA8 ^ 0xA4;
    }

    public String a(int n2) {
        Duration duration = Duration.between(this.j.getStarted(), Instant.now());
        if (CorpInfoBox.lllIIIIlIlllIl(duration.isZero() ? 1 : 0)) {
            Object[] objectArray = new Object[lIlIlllIIlII[2]];
            objectArray[CorpInfoBox.lIlIlllIIlII[1]] = (double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis();
            return String.format(lIlIlllIIIll[lIlIlllIIlII[0]], objectArray);
        }
        return lIlIlllIIIll[lIlIlllIIlII[11]];
    }

    private static String lllIIIIlIllIIl(String lllllllllllllllIllIIlIIIlIlIIlIl, String lllllllllllllllIllIIlIIIlIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIIlIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIIIlIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIIIlIlIlIIl.init(lIlIlllIIlII[3], lllllllllllllllIllIIlIIIlIlIlIlI);
            return new String(lllllllllllllllIllIIlIIIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIIIlIlIlIII) {
            lllllllllllllllIllIIlIIIlIlIlIII.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        if (CorpInfoBox.lllIIIIlIlllII(this.j.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIlllIIlII[0], lIlIlllIIlII[0], lIlIlllIIlII[0], lIlIlllIIlII[0]));
        String string = lIlIlllIIIll[lIlIlllIIlII[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[2]]).right(this.k.getCurrentTask()).build());
        0;
        Duration duration = Duration.between(this.j.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[3]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[4]]).right(this.j.a() + " (" + this.a(this.j.a()) + "/h)").build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[5]]).right(this.j.e() + " (" + this.a(this.j.e()) + "/h)").build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[6]]).right(String.valueOf(this.j.b())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[7]]).right(String.valueOf(this.j.d())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[8]]).right(String.valueOf(this.l.r())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[9]]).right(String.valueOf(this.l.s())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIIll[lIlIlllIIlII[10]]).right(String.valueOf(this.l.q())).build());
        0;
        return super.render(graphics2D);
    }

    static {
        CorpInfoBox.lllIIIIlIllIll();
        CorpInfoBox.lllIIIIlIllIlI();
    }

    private static String lllIIIIlIllIII(String lllllllllllllllIllIIlIIIlIIllIII, String lllllllllllllllIllIIlIIIlIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIIlIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIIlIIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIlllIIlII[9]), "DES");
            Cipher lllllllllllllllIllIIlIIIlIIlllII = Cipher.getInstance("DES");
            lllllllllllllllIllIIlIIIlIIlllII.init(lIlIlllIIlII[3], lllllllllllllllIllIIlIIIlIIlllIl);
            return new String(lllllllllllllllIllIIlIIIlIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIIIlIIllIll) {
            lllllllllllllllIllIIlIIIlIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIlIlllIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public CorpInfoBox(SquireCorp squireCorp, s s2) {
        this.j = squireCorp;
        this.k = squireCorp.getManager();
        this.l = s2;
        this.setPosition(OverlayPosition.TOP_LEFT);
    }

    private static boolean lllIIIIlIlllII(int n2) {
        return n2 != 0;
    }

    private static String lllIIIIlIlIlll(String lllllllllllllllIllIIlIIIlIIIlIlI, String lllllllllllllllIllIIlIIIlIIIlIIl) {
        lllllllllllllllIllIIlIIIlIIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIlIIIlIIIlIII = new StringBuilder();
        char[] lllllllllllllllIllIIlIIIlIIIIlll = lllllllllllllllIllIIlIIIlIIIlIIl.toCharArray();
        int lllllllllllllllIllIIlIIIlIIIIllI = lIlIlllIIlII[1];
        char[] lllllllllllllllIllIIlIIIlIIIIIII = lllllllllllllllIllIIlIIIlIIIlIlI.toCharArray();
        int lllllllllllllllIllIIlIIIIlllllll = lllllllllllllllIllIIlIIIlIIIIIII.length;
        int lllllllllllllllIllIIlIIIIllllllI = lIlIlllIIlII[1];
        while (CorpInfoBox.lllIIIIlIllllI(lllllllllllllllIllIIlIIIIllllllI, lllllllllllllllIllIIlIIIIlllllll)) {
            char lllllllllllllllIllIIlIIIlIIIlIll = lllllllllllllllIllIIlIIIlIIIIIII[lllllllllllllllIllIIlIIIIllllllI];
            lllllllllllllllIllIIlIIIlIIIlIII.append((char)(lllllllllllllllIllIIlIIIlIIIlIll ^ lllllllllllllllIllIIlIIIlIIIIlll[lllllllllllllllIllIIlIIIlIIIIllI % lllllllllllllllIllIIlIIIlIIIIlll.length]));
            0;
            ++lllllllllllllllIllIIlIIIlIIIIllI;
            ++lllllllllllllllIllIIlIIIIllllllI;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIlIIIlIIIlIII);
    }

    private static void lllIIIIlIllIlI() {
        lIlIlllIIIll = new String[lIlIlllIIlII[12]];
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[1]] = CorpInfoBox."Squire Corporeal Beast";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[2]] = CorpInfoBox."Current Task";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[3]] = CorpInfoBox."Runtime";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[4]] = CorpInfoBox."Kills";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[5]] = CorpInfoBox."Loot";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[6]] = CorpInfoBox."Banking";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[7]] = CorpInfoBox."Hopping";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[8]] = CorpInfoBox."DWH Specs";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[9]] = CorpInfoBox."Arclight Specs";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[10]] = CorpInfoBox."BGS damage";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[0]] = CorpInfoBox."%.2f";
        CorpInfoBox.lIlIlllIIIll[CorpInfoBox.lIlIlllIIlII[11]] = CorpInfoBox."0";
    }

    private static boolean lllIIIIlIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

