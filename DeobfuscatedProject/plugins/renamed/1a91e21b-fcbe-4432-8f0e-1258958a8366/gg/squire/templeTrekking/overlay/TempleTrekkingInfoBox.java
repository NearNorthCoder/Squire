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
package gg.squire.templeTrekking.overlay;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.b_Unknown;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.HerbType;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
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

public class TempleTrekkingInfoBox
extends OverlayPanel {
    private final /* synthetic */ b C;
    private final /* synthetic */ TaskManager A;
    private final /* synthetic */ TempleTrekkingPlugin z;
    private static /* synthetic */ String[] lIIllIlIlllIl;
    private static /* synthetic */ int[] lIIllIlIllllI;
    private final /* synthetic */ TempleTrekkingConfig B;

    @Inject
    private TempleTrekkingInfoBox(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b b2) {
        this.z = templeTrekkingPlugin;
        this.A = templeTrekkingPlugin.getManager();
        this.B = templeTrekkingConfig;
        this.C = b2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean lIllIIIIllllIll(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIIIIlllIllI(String var16, String var1) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIIllIlIllllI[5], var3);
            return new String(var4.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlllllII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIIllllIII() {
        lIIllIlIlllIl = new String[lIIllIlIllllI[12]];
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = TempleTrekkingInfoBox."Squire Temple Trekking";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = TempleTrekkingInfoBox."Runtime:";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[5]] = TempleTrekkingInfoBox."Runs:";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[6]] = TempleTrekkingInfoBox."%d (%d/h)";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[8]] = TempleTrekkingInfoBox."Tome XP: ";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[9]] = TempleTrekkingInfoBox."%dk (%dk/h)";
        TempleTrekkingInfoBox.lIIllIlIlllIl[TempleTrekkingInfoBox.lIIllIlIllllI[11]] = TempleTrekkingInfoBox."%d (%d/h)";
    }

    private static boolean lIllIIIIllllIlI(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIIlllIlll(String var2, String var15) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var9 = var15.toCharArray();
        int var6 = lIIllIlIllllI[1];
        char[] var10 = var2.toCharArray();
        int var20 = var10.length;
        int var13 = lIIllIlIllllI[1];
        while (TempleTrekkingInfoBox.lIllIIIIlllllIl(var13, var20)) {
            char var18 = var10[var13];
            var5.append((char)(var18 ^ var9[var6 % var9.length]));
            0;
            ++var6;
            ++var13;
            0;
            if (2 >= 2) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.z.getStarted(), Instant.now());
        if (TempleTrekkingInfoBox.lIllIIIIlllllII(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean lIllIIIIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIIIllllIIl() {
        lIIllIlIllllI = new int[13];
        TempleTrekkingInfoBox.lIIllIlIllllI[0] = 0x88 ^ 0x82;
        TempleTrekkingInfoBox.lIIllIlIllllI[1] = (0x42 ^ 0x50) & ~(0x6B ^ 0x79);
        TempleTrekkingInfoBox.lIIllIlIllllI[2] = 56 + 156 - 196 + 177;
        TempleTrekkingInfoBox.lIIllIlIllllI[3] = 0x86 ^ 0x92;
        TempleTrekkingInfoBox.lIIllIlIllllI[4] = 1;
        TempleTrekkingInfoBox.lIIllIlIllllI[5] = 2;
        TempleTrekkingInfoBox.lIIllIlIllllI[6] = 3;
        TempleTrekkingInfoBox.lIIllIlIllllI[7] = -(0xFFFFFDB3 & 0x4E5F) & (0xFFFFDFFE & 0x6FFB);
        TempleTrekkingInfoBox.lIIllIlIllllI[8] = 0x9F ^ 0x9B;
        TempleTrekkingInfoBox.lIIllIlIllllI[9] = 0x89 ^ 0x8C;
        TempleTrekkingInfoBox.lIIllIlIllllI[10] = -(0xFFFFDB51 & 0x6CAF) & (0xFFFFFFFF & 0x4D5F);
        TempleTrekkingInfoBox.lIIllIlIllllI[11] = 91 + 32 - 62 + 90 ^ 73 + 85 - 108 + 95;
        TempleTrekkingInfoBox.lIIllIlIllllI[12] = 0xBF ^ 0xB8;
    }

    public Dimension render(Graphics2D graphics2D) {
        TempleTrekkingInfoBox var12;
        if (TempleTrekkingInfoBox.lIllIIIIllllIlI(this.z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var12.panelComponent.setBorder(new Rectangle(lIIllIlIllllI[0], lIIllIlIllllI[0], lIIllIlIllllI[0], lIIllIlIllllI[0]));
        String var8 = lIIllIlIlllIl[lIIllIlIllllI[1]];
        var12.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var8).build());
        0;
        int var14 = lIIllIlIllllI[2];
        var12.panelComponent.setPreferredSize(new Dimension(var14 + lIIllIlIllllI[3], lIIllIlIllllI[1]));
        Duration var17 = Duration.between(var12.z.getStarted(), Instant.now());
        var12.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[4]]).right(Time.format((Duration)var17)).build());
        0;
        int var11 = (int)var12.d(var12.z.j());
        Object[] objectArray = new Object[lIIllIlIllllI[5]];
        objectArray[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = var12.z.j();
        objectArray[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = var11;
        var12.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[5]]).right(String.format(lIIllIlIlllIl[lIIllIlIllllI[6]], objectArray)).build());
        0;
        if (TempleTrekkingInfoBox.lIllIIIIllllIll((Object)var12.B.reward(), (Object)d.XP_TOME)) {
            int var7 = (int)(var12.d(var12.C.m()) * 1375L) / lIIllIlIllllI[7];
            Object[] objectArray2 = new Object[lIIllIlIllllI[5]];
            objectArray2[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = var12.C.m() * lIIllIlIllllI[10] / lIIllIlIllllI[7];
            objectArray2[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = var7;
            var12.panelComponent.getChildren().add(LineComponent.builder().left(lIIllIlIlllIl[lIIllIlIllllI[8]]).right(String.format(lIIllIlIlllIl[lIIllIlIllllI[9]], objectArray2)).build());
            0;
            0;
            if (((0x49 ^ 0x29 ^ (0x15 ^ 0x64)) & (0x7A ^ 3 ^ (0x64 ^ 0xC) ^ -1)) < 0) {
                return null;
            }
        } else {
            int var7 = (int)var12.d(var12.C.m());
            Object[] objectArray3 = new Object[lIIllIlIllllI[5]];
            objectArray3[TempleTrekkingInfoBox.lIIllIlIllllI[1]] = var12.C.m();
            objectArray3[TempleTrekkingInfoBox.lIIllIlIllllI[4]] = var7;
            var12.panelComponent.getChildren().add(LineComponent.builder().left(var12.B.reward().y()).right(String.format(lIIllIlIlllIl[lIIllIlIllllI[11]], objectArray3)).build());
            0;
        }
        return super.render(graphics2D);
    }

    static {
        TempleTrekkingInfoBox.lIllIIIIllllIIl();
        TempleTrekkingInfoBox.lIllIIIIllllIII();
    }
}

