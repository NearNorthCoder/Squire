/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.api.Skill
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.wintertodt.overlay;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.d;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.wintertodt.SquireWintertodt;
import gg.squire.wintertodt.SquireWintertodtConfig;
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
import net.runelite.api.Skill;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Skills;

public class WintertodtInfoBox
extends OverlayPanel {
    private final /* synthetic */ b y;
    private final /* synthetic */ SquireWintertodtConfig w;
    private static /* synthetic */ String[] lIlIllllIIllI;
    private final /* synthetic */ SquireWintertodt v;
    private final /* synthetic */ TaskManager x;
    private static /* synthetic */ int[] lIlIllllIlIII;

    private static String llIIIIlIllIIlII(String llllllllllllllIllIIllllIIlIlllII, String llllllllllllllIllIIllllIIlIllIll) {
        try {
            SecretKeySpec llllllllllllllIllIIllllIIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllllIIlIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllllIIlIllllI.init(lIlIllllIlIII[3], llllllllllllllIllIIllllIIlIlllll);
            return new String(llllllllllllllIllIIllllIIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllllIIlIlllIl) {
            llllllllllllllIllIIllllIIlIlllIl.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        WintertodtInfoBox llllllllllllllIllIIllllIlIIIlIIl;
        if (WintertodtInfoBox.llIIIIlIllIllll(this.v.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration llllllllllllllIllIIllllIlIIIIlll = Duration.between(llllllllllllllIllIIllllIlIIIlIIl.v.getStarted(), Instant.now());
        llllllllllllllIllIIllllIlIIIlIIl.panelComponent.setBorder(new Rectangle(lIlIllllIlIII[0], lIlIllllIlIII[0], lIlIllllIlIII[0], lIlIllllIlIII[0]));
        llllllllllllllIllIIllllIlIIIlIIl.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lIlIllllIIllI[lIlIllllIlIII[1]]).build());
        0;
        llllllllllllllIllIIllllIlIIIlIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[2]]).right(Time.format((Duration)llllllllllllllIllIIllllIlIIIIlll)).build());
        0;
        llllllllllllllIllIIllllIlIIIlIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[3]]).right(d.a(llllllllllllllIllIIllllIlIIIlIIl.z()) + " (" + llllllllllllllIllIIllllIlIIIlIIl.A() + "/hr)").build());
        0;
        int llllllllllllllIllIIllllIlIIIIllI = lIlIllllIlIII[4];
        llllllllllllllIllIIllllIlIIIlIIl.panelComponent.setPreferredSize(new Dimension(llllllllllllllIllIIllllIlIIIIllI + lIlIllllIlIII[5], lIlIllllIlIII[1]));
        llllllllllllllIllIIllllIlIIIlIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[6]]).right(lIlIllllIIllI[lIlIllllIlIII[7]]).build());
        0;
        llllllllllllllIllIIllllIlIIIlIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[8]]).right(llllllllllllllIllIIllllIlIIIlIIl.x.getCurrentTask()).build());
        0;
        llllllllllllllIllIIllllIlIIIlIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[9]]).right(String.valueOf(llllllllllllllIllIIllllIlIIIlIIl.y.i())).build());
        0;
        if (WintertodtInfoBox.llIIIIlIllIllll(llllllllllllllIllIIllllIlIIIlIIl.y.i() ? 1 : 0)) {
            llllllllllllllIllIIllllIlIIIlIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[10]]).right(String.valueOf(llllllllllllllIllIIllllIlIIIlIIl.y.f())).build());
            0;
            Object[] objectArray = new Object[lIlIllllIlIII[3]];
            objectArray[WintertodtInfoBox.lIlIllllIlIII[1]] = llllllllllllllIllIIllllIlIIIlIIl.y.p();
            objectArray[WintertodtInfoBox.lIlIllllIlIII[2]] = llllllllllllllIllIIllllIlIIIlIIl.w.foodAmount();
            llllllllllllllIllIIllllIlIIIlIIl.panelComponent.getChildren().add(LineComponent.builder().left(lIlIllllIIllI[lIlIllllIlIII[11]]).right(String.format(lIlIllllIIllI[lIlIllllIlIII[12]], objectArray)).build());
            0;
        }
        return super.render(graphics2D);
    }

    private static void llIIIIlIllIlIll() {
        lIlIllllIIllI = new String[lIlIllllIlIII[0]];
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[1]] = WintertodtInfoBox."[B]uire Wintertodt";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[2]] = WintertodtInfoBox."Runtime";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[3]] = WintertodtInfoBox."Xp gained:";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[6]] = WintertodtInfoBox."Version";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[7]] = WintertodtInfoBox."1.1.3";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[8]] = WintertodtInfoBox."Performing";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[9]] = WintertodtInfoBox."Inside Wintertodt";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[10]] = WintertodtInfoBox."Points";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[11]] = WintertodtInfoBox."Food";
        WintertodtInfoBox.lIlIllllIIllI[WintertodtInfoBox.lIlIllllIlIII[12]] = WintertodtInfoBox."%d | %d";
    }

    private int A() {
        Instant instant = Instant.now();
        Instant instant2 = this.v.getStarted();
        Duration duration = Duration.between(instant2, instant);
        double d2 = (double)(duration.toMillis() / 1000L) / 3600.0;
        if (WintertodtInfoBox.llIIIIlIlllIIlI(duration.isNegative() ? 1 : 0) && WintertodtInfoBox.llIIIIlIllIllll(WintertodtInfoBox.llIIIIlIlllIIIl(d2, 0.0))) {
            return (int)Math.floor((double)this.z() / d2);
        }
        return lIlIllllIlIII[1];
    }

    static {
        WintertodtInfoBox.llIIIIlIllIllIl();
        WintertodtInfoBox.llIIIIlIllIlIll();
    }

    private static String llIIIIlIllIIIIl(String llllllllllllllIllIIllllIIlIIllll, String llllllllllllllIllIIllllIIlIIlllI) {
        try {
            SecretKeySpec llllllllllllllIllIIllllIIlIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllIIlIIlllI.getBytes(StandardCharsets.UTF_8)), lIlIllllIlIII[11]), "DES");
            Cipher llllllllllllllIllIIllllIIlIlIIIl = Cipher.getInstance("DES");
            llllllllllllllIllIIllllIIlIlIIIl.init(lIlIllllIlIII[3], llllllllllllllIllIIllllIIlIlIIlI);
            return new String(llllllllllllllIllIIllllIIlIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllllIIlIlIIII) {
            llllllllllllllIllIIllllIIlIlIIII.printStackTrace();
            return null;
        }
    }

    private static int llIIIIlIlllIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static String llIIIIlIllIlIlI(String llllllllllllllIllIIllllIIllIllII, String llllllllllllllIllIIllllIIllIlIll) {
        llllllllllllllIllIIllllIIllIllII = new String(Base64.getDecoder().decode(llllllllllllllIllIIllllIIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllllIIllIllll = new StringBuilder();
        char[] llllllllllllllIllIIllllIIllIlllI = llllllllllllllIllIIllllIIllIlIll.toCharArray();
        int llllllllllllllIllIIllllIIllIllIl = lIlIllllIlIII[1];
        char[] llllllllllllllIllIIllllIIllIIlll = llllllllllllllIllIIllllIIllIllII.toCharArray();
        int llllllllllllllIllIIllllIIllIIllI = llllllllllllllIllIIllllIIllIIlll.length;
        int llllllllllllllIllIIllllIIllIIlIl = lIlIllllIlIII[1];
        while (WintertodtInfoBox.llIIIIlIlllIIll(llllllllllllllIllIIllllIIllIIlIl, llllllllllllllIllIIllllIIllIIllI)) {
            char llllllllllllllIllIIllllIIlllIIlI = llllllllllllllIllIIllllIIllIIlll[llllllllllllllIllIIllllIIllIIlIl];
            llllllllllllllIllIIllllIIllIllll.append((char)(llllllllllllllIllIIllllIIlllIIlI ^ llllllllllllllIllIIllllIIllIlllI[llllllllllllllIllIIllllIIllIllIl % llllllllllllllIllIIllllIIllIlllI.length]));
            0;
            ++llllllllllllllIllIIllllIIllIllIl;
            ++llllllllllllllIllIIllllIIllIIlIl;
            0;
            if (1 != (0xCB ^ 0x8E ^ (9 ^ 0x48))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIllllIIllIllll);
    }

    private static boolean llIIIIlIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public WintertodtInfoBox(SquireWintertodt squireWintertodt, SquireWintertodtConfig squireWintertodtConfig, SquireWintertodt squireWintertodt2, b b2) {
        this.v = squireWintertodt;
        this.w = squireWintertodtConfig;
        this.x = squireWintertodt2.getManager();
        this.y = b2;
        this.setPosition(OverlayPosition.ABOVE_CHATBOX_RIGHT);
        this.setLayer(OverlayLayer.ALWAYS_ON_TOP);
        this.setPriority(OverlayPriority.MED);
    }

    private static boolean llIIIIlIllIllll(int n2) {
        return n2 != 0;
    }

    private int z() {
        return Skills.getExperience((Skill)Skill.FIREMAKING) - this.v.a();
    }

    private static void llIIIIlIllIllIl() {
        lIlIllllIlIII = new int[13];
        WintertodtInfoBox.lIlIllllIlIII[0] = 9 ^ 3;
        WintertodtInfoBox.lIlIllllIlIII[1] = (23 + 167 - 49 + 43 ^ 75 + 21 - -19 + 24) & (0x4F ^ 0x11 ^ (0xC1 ^ 0xAC) ^ -1);
        WintertodtInfoBox.lIlIllllIlIII[2] = 1;
        WintertodtInfoBox.lIlIllllIlIII[3] = 2;
        WintertodtInfoBox.lIlIllllIlIII[4] = -(0xFFFFD3F5 & 0x7EFF) & (0xFFFFDFFF & 0x73F6);
        WintertodtInfoBox.lIlIllllIlIII[5] = 0x56 ^ 0x42;
        WintertodtInfoBox.lIlIllllIlIII[6] = 3;
        WintertodtInfoBox.lIlIllllIlIII[7] = 21 + 30 - -101 + 3 ^ 133 + 25 - 74 + 75;
        WintertodtInfoBox.lIlIllllIlIII[8] = 0x6A ^ 0x6F;
        WintertodtInfoBox.lIlIllllIlIII[9] = 105 + 129 - 137 + 55 ^ 110 + 115 - 155 + 88;
        WintertodtInfoBox.lIlIllllIlIII[10] = 0xA6 ^ 0xA1;
        WintertodtInfoBox.lIlIllllIlIII[11] = 82 + 152 - 118 + 40 ^ 68 + 73 - 66 + 73;
        WintertodtInfoBox.lIlIllllIlIII[12] = 0xA7 ^ 0xAE;
    }

    private static boolean llIIIIlIlllIIlI(int n2) {
        return n2 == 0;
    }
}

