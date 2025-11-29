/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.whisperer.overlay;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.whisperer.SquireWhisperer;
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
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.a;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.d;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p;

public class WhispererInfoBox
extends OverlayPanel {
    private final /* synthetic */ j v;
    private final /* synthetic */ TaskManager s;
    private final /* synthetic */ SquireWhisperer q;
    private final /* synthetic */ a u;
    private static /* synthetic */ int[] lIlIlllIIllIl;
    private static /* synthetic */ String[] lIlIlllIIlIIl;
    private final /* synthetic */ d r;
    private final /* synthetic */ p t;

    private static void llIIIIlIIIlIlIl() {
        lIlIlllIIlIIl = new String[lIlIlllIIllIl[11]];
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[0]] = WhispererInfoBox."Squire Whisperer";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[4]] = WhispererInfoBox."Version:";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[5]] = WhispererInfoBox."1.0.0";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[6]] = WhispererInfoBox."Runtime:";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[7]] = WhispererInfoBox."Currently:";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[8]] = WhispererInfoBox."Kills:";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[9]] = WhispererInfoBox."Banking:";
        WhispererInfoBox.lIlIlllIIlIIl[WhispererInfoBox.lIlIlllIIllIl[10]] = WhispererInfoBox."Has recharged trident:";
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.q.getStarted(), Instant.now());
        if (WhispererInfoBox.llIIIIlIIlIIIlI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean llIIIIlIIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public WhispererInfoBox(SquireWhisperer squireWhisperer, d d2, p p2, a a2, j j2) {
        this.q = squireWhisperer;
        this.r = d2;
        this.s = squireWhisperer.getManager();
        this.t = p2;
        this.u = a2;
        this.v = j2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
        this.setPriority(OverlayPriority.MED);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (WhispererInfoBox.llIIIIlIIlIIIIl(this.q.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        String string = lIlIlllIIlIIl[lIlIlllIIllIl[0]];
        this.panelComponent.setBorder(new Rectangle(lIlIlllIIllIl[1], lIlIlllIIllIl[1], lIlIlllIIllIl[1], lIlIlllIIllIl[1]));
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n2 = lIlIlllIIllIl[2];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lIlIlllIIllIl[3], lIlIlllIIllIl[0]));
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[4]]).right(lIlIlllIIlIIl[lIlIlllIIllIl[5]]).build());
        0;
        Duration duration = Duration.between(this.q.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[6]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[7]]).right(this.s.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[8]]).right(String.valueOf(this.q.a())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[9]]).right(String.valueOf(this.u.b())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIlllIIlIIl[lIlIlllIIllIl[10]]).right(String.valueOf(this.v.q())).build());
        0;
        return super.render(graphics2D);
    }

    private static String llIIIIlIIIIllII(String var19, String var11) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIlIlllIIllIl[11]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIlIlllIIllIl[5], var15);
            return new String(var5.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlIIlIIIII() {
        lIlIlllIIllIl = new int[12];
        WhispererInfoBox.lIlIlllIIllIl[0] = (0x2C ^ 0x74) & ~(0x6F ^ 0x37);
        WhispererInfoBox.lIlIlllIIllIl[1] = 100 + 115 - 30 + 20 ^ 172 + 86 - 196 + 137;
        WhispererInfoBox.lIlIlllIIllIl[2] = 140 + 68 - 156 + 141;
        WhispererInfoBox.lIlIlllIIllIl[3] = 135 + 76 - 90 + 55 ^ 64 + 64 - 37 + 73;
        WhispererInfoBox.lIlIlllIIllIl[4] = 1;
        WhispererInfoBox.lIlIlllIIllIl[5] = 2;
        WhispererInfoBox.lIlIlllIIllIl[6] = 3;
        WhispererInfoBox.lIlIlllIIllIl[7] = 0x57 ^ 0x42 ^ (0x4F ^ 0x5E);
        WhispererInfoBox.lIlIlllIIllIl[8] = 0xB2 ^ 0xB7;
        WhispererInfoBox.lIlIlllIIllIl[9] = 7 + 130 - 41 + 84 ^ 128 + 96 - 60 + 14;
        WhispererInfoBox.lIlIlllIIllIl[10] = 0x80 ^ 0xA0 ^ (0x6E ^ 0x49);
        WhispererInfoBox.lIlIlllIIllIl[11] = 8 ^ 0;
    }

    private static String llIIIIlIIIIlllI(String var13, String var16) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIlIlllIIllIl[5], var9);
            return new String(var14.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static String llIIIIlIIIIllIl(String var4, String var12) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var2 = var12.toCharArray();
        int var10 = lIlIlllIIllIl[0];
        char[] var3 = var4.toCharArray();
        int var6 = var3.length;
        int var8 = lIlIlllIIllIl[0];
        while (WhispererInfoBox.llIIIIlIIlIIIll(var8, var6)) {
            char var7 = var3[var8];
            var17.append((char)(var7 ^ var2[var10 % var2.length]));
            0;
            ++var10;
            ++var8;
            0;
            if (-1 != 2) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    static {
        WhispererInfoBox.llIIIIlIIlIIIII();
        WhispererInfoBox.llIIIIlIIIlIlIl();
    }

    private static boolean llIIIIlIIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIlIIlIIIIl(int n2) {
        return n2 != 0;
    }
}

