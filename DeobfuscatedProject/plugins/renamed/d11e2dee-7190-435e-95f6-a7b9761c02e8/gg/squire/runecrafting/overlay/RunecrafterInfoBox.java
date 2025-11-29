/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.runecrafting.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.a_Unknown;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class RunecrafterInfoBox
extends OverlayPanel {
    private static /* synthetic */ String[] lIllIIllIIllI;
    private static /* synthetic */ int[] lIllIIllIIlll;
    private final /* synthetic */ SquireZeahRunecrafter m;
    private final /* synthetic */ a o;
    private final /* synthetic */ TaskManager n;

    public Dimension render(Graphics2D graphics2D) {
        if (RunecrafterInfoBox.llIIIllIlIlIlIl(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIllIIllIIlll[0], lIllIIllIIlll[0], lIllIIllIIlll[0], lIllIIllIIlll[0]));
        String string = lIllIIllIIllI[lIllIIllIIlll[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n = lIllIIllIIlll[2];
        this.panelComponent.setPreferredSize(new Dimension(n + lIllIIllIIlll[3], lIllIIllIIlll[1]));
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[5]]).right(this.n.getCurrentTask()).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[6]]).right(this.m.b() + " (" + this.d(this.m.b()) + "/h)").build());
        0;
        Object[] objectArray = new Object[lIllIIllIIlll[4]];
        objectArray[RunecrafterInfoBox.lIllIIllIIlll[1]] = this.m.c();
        Object[] objectArray2 = new Object[lIllIIllIIlll[4]];
        objectArray2[RunecrafterInfoBox.lIllIIllIIlll[1]] = this.d(this.m.c());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIllIIllIIllI[lIllIIllIIlll[7]]).right(String.format(lIllIIllIIllI[lIllIIllIIlll[8]], objectArray) + " (" + String.format(lIllIIllIIllI[lIllIIllIIlll[9]], objectArray2) + "/h)").build());
        0;
        return super.render(graphics2D);
    }

    public long d(int n) {
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        if (RunecrafterInfoBox.llIIIllIlIlIllI(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    static {
        RunecrafterInfoBox.llIIIllIlIlIlII();
        RunecrafterInfoBox.llIIIllIlIlIIll();
    }

    private static String llIIIllIlIlIIIl(String var4, String var7) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIllIIllIIlll[5], var14);
            return new String(var13.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static String llIIIllIlIlIIlI(String var2, String var9) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var10 = var9.toCharArray();
        int var5 = lIllIIllIIlll[1];
        char[] var11 = var2.toCharArray();
        int var12 = var11.length;
        int var3 = lIllIIllIIlll[1];
        while (RunecrafterInfoBox.llIIIllIlIlIlll(var3, var12)) {
            char var1 = var11[var3];
            var8.append((char)(var1 ^ var10[var5 % var10.length]));
            0;
            ++var5;
            ++var3;
            0;
            if ((4 + 29 - -151 + 4 ^ 102 + 138 - 163 + 107) >= 2) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean llIIIllIlIlIlll(int n, int n2) {
        return n < n2;
    }

    private static void llIIIllIlIlIIll() {
        lIllIIllIIllI = new String[lIllIIllIIlll[10]];
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[1]] = RunecrafterInfoBox."Squire Blood Runecrafter";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[4]] = RunecrafterInfoBox."Runtime:";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[5]] = RunecrafterInfoBox."Task: ";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[6]] = RunecrafterInfoBox."Bloods Crafted:";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[7]] = RunecrafterInfoBox."Gold:";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[8]] = RunecrafterInfoBox."%,d";
        RunecrafterInfoBox.lIllIIllIIllI[RunecrafterInfoBox.lIllIIllIIlll[9]] = RunecrafterInfoBox."%,d";
    }

    private static void llIIIllIlIlIlII() {
        lIllIIllIIlll = new int[11];
        RunecrafterInfoBox.lIllIIllIIlll[0] = 0x5A ^ 0x50;
        RunecrafterInfoBox.lIllIIllIIlll[1] = (0xA5 ^ 0x83) & ~(6 ^ 0x20);
        RunecrafterInfoBox.lIllIIllIIlll[2] = (0xE1 ^ 0xC2) + (0xE8 ^ 0x86) - (0x96 ^ 0xB7) + (0xD7 ^ 0x86);
        RunecrafterInfoBox.lIllIIllIIlll[3] = 1 ^ 0x70 ^ (8 ^ 0x6D);
        RunecrafterInfoBox.lIllIIllIIlll[4] = 1;
        RunecrafterInfoBox.lIllIIllIIlll[5] = 2;
        RunecrafterInfoBox.lIllIIllIIlll[6] = 3;
        RunecrafterInfoBox.lIllIIllIIlll[7] = 0x41 ^ 0x45;
        RunecrafterInfoBox.lIllIIllIIlll[8] = 0x8B ^ 0x8E;
        RunecrafterInfoBox.lIllIIllIIlll[9] = 22 + 106 - 29 + 29 ^ 95 + 61 - 127 + 105;
        RunecrafterInfoBox.lIllIIllIIlll[10] = 0x88 ^ 0x8F;
    }

    private static boolean llIIIllIlIlIllI(int n) {
        return n == 0;
    }

    private static boolean llIIIllIlIlIlIl(int n) {
        return n != 0;
    }

    @Inject
    public RunecrafterInfoBox(SquireZeahRunecrafter squireZeahRunecrafter, a a2) {
        this.m = squireZeahRunecrafter;
        this.n = squireZeahRunecrafter.getManager();
        this.o = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

