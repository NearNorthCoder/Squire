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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.EEnum;

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

    private static String lIIllllIIlllll(String var12, String var17) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var11 = llIIIlIlllI[0];
        char[] var4 = var12.toCharArray();
        int var7 = var4.length;
        int var13 = llIIIlIlllI[0];
        while (DebugOverlay.lIIllllIlIIlII(var13, var7)) {
            char var6 = var4[var13];
            var5.append((char)(var6 ^ var19[var11 % var19.length]));
            0;
            ++var11;
            ++var13;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static boolean lIIllllIlIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIllllIlIIIlI() {
        llIIIlIlllI = new int[9];
        DebugOverlay.llIIIlIlllI[0] = (55 + 77 - 99 + 186 ^ 46 + 38 - -22 + 37) & (205 + 40 - 34 + 19 ^ 60 + 50 - 15 + 83 ^ -1);
        DebugOverlay.llIIIlIlllI[1] = 1;
        DebugOverlay.llIIIlIlllI[2] = 2;
        DebugOverlay.llIIIlIlllI[3] = 3;
        DebugOverlay.llIIIlIlllI[4] = 90 + 145 - 137 + 68 ^ 83 + 111 - 161 + 129;
        DebugOverlay.llIIIlIlllI[5] = 104 + 117 - 137 + 53 ^ 56 + 113 - 156 + 127;
        DebugOverlay.llIIIlIlllI[6] = 0x7D ^ 0x2F ^ (0x54 ^ 0);
        DebugOverlay.llIIIlIlllI[7] = 0x2F ^ 0x28;
        DebugOverlay.llIIIlIlllI[8] = 0xE5 ^ 0xB5 ^ (0x79 ^ 0x21);
    }

    private static void lIIllllIlIIIIl() {
        llIIIlIIIIl = new String[llIIIlIlllI[8]];
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[0]] = DebugOverlay."Squire Auto TOA";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[1]] = DebugOverlay."Runtime";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[2]] = DebugOverlay."Version";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[3]] = DebugOverlay."2.10.3";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[4]] = DebugOverlay."Performing Task";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[5]] = DebugOverlay."Completed Raids";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[6]] = DebugOverlay."Deaths (this raid)";
        DebugOverlay.llIIIlIIIIl[DebugOverlay.llIIIlIlllI[7]] = DebugOverlay."Failed Raids";
    }

    private static String lIIlllIlllIlII(String var22, String var1) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llIIIlIlllI[2], var23);
            return new String(var3.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String lIIllllIlIIIII(String var10, String var9) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), llIIIlIlllI[8]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(llIIIlIlllI[2], var8);
            return new String(var20.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    static {
        DebugOverlay.lIIllllIlIIIlI();
        DebugOverlay.lIIllllIlIIIIl();
    }

    public Dimension render(Graphics2D graphics2D) {
        DebugOverlay var15;
        if (DebugOverlay.lIIllllIlIIIll(this.bZ.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        Duration var18 = Duration.between(var15.bZ.getStarted(), Instant.now());
        var15.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(llIIIlIIIIl[llIIIlIlllI[0]]).build());
        0;
        var15.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[1]]).right(Time.format((Duration)var18)).build());
        0;
        var15.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[2]]).right(llIIIlIIIIl[llIIIlIlllI[3]]).build());
        0;
        var15.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[4]]).right(var15.ca.getCurrentTask()).build());
        0;
        var15.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[5]]).right(String.valueOf(var15.bZ.i())).build());
        0;
        var15.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[6]]).right(String.valueOf(var15.bZ.k())).build());
        0;
        var15.panelComponent.getChildren().add(LineComponent.builder().left(llIIIlIIIIl[llIIIlIlllI[7]]).right(String.valueOf(var15.bZ.j())).build());
        0;
        Iterator<e> var2 = var15.cb.av().keySet().iterator();
        while (DebugOverlay.lIIllllIlIIIll(var2.hasNext() ? 1 : 0)) {
            e var16 = var2.next();
            var15.panelComponent.getChildren().add(LineComponent.builder().left(var16.toString()).right(var15.cb.av().get((Object)var16).toString()).build());
            0;
            0;
            if (((0x72 ^ 0x36) & ~(0x31 ^ 0x75)) == 0) continue;
            return null;
        }
        return super.render(graphics2D);
    }
}

