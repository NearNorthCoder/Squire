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
 *  net.unethicalite.client.Static
 */
package gg.squire.driftnet.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.driftnet.SquireDriftNet;
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
import net.unethicalite.client.Static;
import u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.a_Unknown;

@Singleton
public class DriftNetInfoBox
extends OverlayPanel {
    private final /* synthetic */ TaskManager o;
    private final /* synthetic */ SquireDriftNet m;
    private static /* synthetic */ int[] lIlIIIIllIlI;
    private final /* synthetic */ a n;
    private static /* synthetic */ String[] lIlIIIIlIlll;

    private static String llIlIlIIIIIllI(String var12, String var5) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var17 = lIlIIIIllIlI[1];
        char[] var14 = var12.toCharArray();
        int var18 = var14.length;
        int var4 = lIlIIIIllIlI[1];
        while (DriftNetInfoBox.llIlIlIIIlIIIl(var4, var18)) {
            char var1 = var14[var4];
            var6.append((char)(var1 ^ var7[var17 % var7.length]));
            0;
            ++var17;
            ++var4;
            0;
            if (2 != ((0xFD ^ 0xBE) & ~(0x71 ^ 0x32))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static String llIlIlIIIIlIII(String var3, String var2) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIIIIllIlI[15]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIlIIIIllIlI[5], var19);
            return new String(var13.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Inject
    public DriftNetInfoBox(SquireDriftNet squireDriftNet, a a2) {
        this.m = squireDriftNet;
        this.n = a2;
        this.o = squireDriftNet.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (DriftNetInfoBox.llIlIlIIIIllll(this.m.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(lIlIIIIllIlI[0], lIlIIIIllIlI[0], lIlIIIIllIlI[0], lIlIIIIllIlI[0]));
        String string = lIlIIIIlIlll[lIlIIIIllIlI[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n = lIlIIIIllIlI[2];
        this.panelComponent.setPreferredSize(new Dimension(n + lIlIIIIllIlI[3], lIlIIIIllIlI[1]));
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[4]]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[5]]).right(this.o.getCurrentTask()).build());
        0;
        int n2 = (int)this.a(this.n.i());
        Object[] objectArray = new Object[lIlIIIIllIlI[5]];
        objectArray[DriftNetInfoBox.lIlIIIIllIlI[1]] = this.n.i();
        objectArray[DriftNetInfoBox.lIlIIIIllIlI[4]] = n2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[6]]).right(String.format(lIlIIIIlIlll[lIlIIIIllIlI[7]], objectArray)).build());
        0;
        int n3 = Static.getClient().getVarbitValue(lIlIIIIllIlI[8]);
        int n4 = Static.getClient().getVarbitValue(lIlIIIIllIlI[9]);
        int n5 = Static.getClient().getVarbitValue(lIlIIIIllIlI[10]);
        int n6 = Static.getClient().getVarbitValue(lIlIIIIllIlI[11]);
        Object[] objectArray2 = new Object[lIlIIIIllIlI[5]];
        objectArray2[DriftNetInfoBox.lIlIIIIllIlI[1]] = n3;
        objectArray2[DriftNetInfoBox.lIlIIIIllIlI[4]] = n5;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[12]]).right(String.format(lIlIIIIlIlll[lIlIIIIllIlI[13]], objectArray2)).build());
        0;
        Object[] objectArray3 = new Object[lIlIIIIllIlI[5]];
        objectArray3[DriftNetInfoBox.lIlIIIIllIlI[1]] = n4;
        objectArray3[DriftNetInfoBox.lIlIIIIllIlI[4]] = n6;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lIlIIIIlIlll[lIlIIIIllIlI[14]]).right(String.format(lIlIIIIlIlll[lIlIIIIllIlI[15]], objectArray3)).build());
        0;
        return super.render(graphics2D);
    }

    private static boolean llIlIlIIIIllll(int n) {
        return n != 0;
    }

    static {
        DriftNetInfoBox.llIlIlIIIIlllI();
        DriftNetInfoBox.llIlIlIIIIlIll();
    }

    private static void llIlIlIIIIlIll() {
        lIlIIIIlIlll = new String[lIlIIIIllIlI[16]];
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[1]] = DriftNetInfoBox."Squire Drift Net Fisher";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[4]] = DriftNetInfoBox."Runtime:";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[5]] = DriftNetInfoBox."Task: ";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[6]] = DriftNetInfoBox."Fish caught:";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[7]] = DriftNetInfoBox."%d (%d/h)";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[12]] = DriftNetInfoBox."North:";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[13]] = DriftNetInfoBox."%d (%d)";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[14]] = DriftNetInfoBox."South:";
        DriftNetInfoBox.lIlIIIIlIlll[DriftNetInfoBox.lIlIIIIllIlI[15]] = DriftNetInfoBox."%d (%d)";
    }

    private static void llIlIlIIIIlllI() {
        lIlIIIIllIlI = new int[17];
        DriftNetInfoBox.lIlIIIIllIlI[0] = 0x46 ^ 0xE ^ (0x16 ^ 0x54);
        DriftNetInfoBox.lIlIIIIllIlI[1] = (0x40 ^ 0x14) & ~(0xF5 ^ 0xA1);
        DriftNetInfoBox.lIlIIIIllIlI[2] = (0x3A ^ 0x46) + (0x76 ^ 0x39) - (0x79 ^ 0xC) + (0xD0 ^ 0xBB);
        DriftNetInfoBox.lIlIIIIllIlI[3] = 0x34 ^ 0x71 ^ (0xDB ^ 0x8A);
        DriftNetInfoBox.lIlIIIIllIlI[4] = 1;
        DriftNetInfoBox.lIlIIIIllIlI[5] = 2;
        DriftNetInfoBox.lIlIIIIllIlI[6] = 3;
        DriftNetInfoBox.lIlIIIIllIlI[7] = 0x3F ^ 0x34 ^ (0x50 ^ 0x5F);
        DriftNetInfoBox.lIlIIIIllIlI[8] = -(0xFFFFE16F & 0x7F9B) & (0xFFFFF7FE & 0x7FBF);
        DriftNetInfoBox.lIlIIIIllIlI[9] = -(0xFFFFFDEB & 0x631E) & (0xFFFFF7FF & 0x7FBF);
        DriftNetInfoBox.lIlIIIIllIlI[10] = 0xFFFFD6BF & 0x3FF5;
        DriftNetInfoBox.lIlIIIIllIlI[11] = -(0xFFFFCF79 & 0x31C7) & (0xFFFFDFF7 & 0x37FF);
        DriftNetInfoBox.lIlIIIIllIlI[12] = 0x67 ^ 0x62;
        DriftNetInfoBox.lIlIIIIllIlI[13] = 1 ^ 7;
        DriftNetInfoBox.lIlIIIIllIlI[14] = 0x21 ^ 0x26;
        DriftNetInfoBox.lIlIIIIllIlI[15] = 0x9F ^ 0x97;
        DriftNetInfoBox.lIlIIIIllIlI[16] = 0x92 ^ 0x9B;
    }

    private static boolean llIlIlIIIlIIII(int n) {
        return n == 0;
    }

    private static boolean llIlIlIIIlIIIl(int n, int n2) {
        return n < n2;
    }

    public long a(int n) {
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        if (DriftNetInfoBox.llIlIlIIIlIIII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static String llIlIlIIIIIlll(String var8, String var16) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lIlIIIIllIlI[5], var15);
            return new String(var9.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }
}

