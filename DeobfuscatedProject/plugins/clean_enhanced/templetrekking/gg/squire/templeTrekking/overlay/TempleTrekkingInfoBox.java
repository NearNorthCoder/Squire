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
import gg.squire.templeTrekking.overlay.TempletrekkingManager;
import gg.squire.templeTrekking.overlay.GameEnum2;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class TempleTrekkingInfoBox
extends OverlayPanel {
    private final  b C;
    private final  TaskManager A;
    private final  TempleTrekkingPlugin z;

    private final  TempleTrekkingConfig B;

    @Inject
    private TempleTrekkingInfoBox(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b b2) {
        this.z = templeTrekkingPlugin;
        this.A = templeTrekkingPlugin.getManager();
        this.B = templeTrekkingConfig;
        this.C = b2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static void var11() {
        var1 = new String[var2[12]];
        TempleTrekkingInfoBox.var1[TempleTrekkingInfoBox.var2[1]] = "Squire Temple Trekking";
        TempleTrekkingInfoBox.var1[TempleTrekkingInfoBox.var2[4]] = "Runtime:";
        TempleTrekkingInfoBox.var1[TempleTrekkingInfoBox.var2[5]] = "Runs:";
        TempleTrekkingInfoBox.var1[TempleTrekkingInfoBox.var2[6]] = "%d (%d/h)";
        TempleTrekkingInfoBox.var1[TempleTrekkingInfoBox.var2[8]] = "Tome XP: ";
        TempleTrekkingInfoBox.var1[TempleTrekkingInfoBox.var2[9]] = "%dk (%dk/h)";
        TempleTrekkingInfoBox.var1[TempleTrekkingInfoBox.var2[11]] = "%d (%d/h)";
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[1];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[1];
        while (TempleTrekkingInfoBox.var22(var21, var20)) {
            char var23 = var19[var21];
            var16.append((char)(var23 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            
            return null;
        }
        return String.valueOf(var16);
    }

    public long d(int n2) {
        Duration duration = Duration.between(this.z.getStarted(), Instant.now());
        if (TempleTrekkingInfoBox.var10(duration.isZero() ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static void var24() {
        var2 = new int[13];
        TempleTrekkingInfoBox.var2[0] = 0x88 ^ 0x82;
        TempleTrekkingInfoBox.var2[1] = (0x42 ^ 0x50) & ~(0x6B ^ 0x79);
        TempleTrekkingInfoBox.var2[2] = 56 + 156 - 196 + 177;
        TempleTrekkingInfoBox.var2[3] = 0x86 ^ 0x92;
        TempleTrekkingInfoBox.var2[4] = 1;
        TempleTrekkingInfoBox.var2[5] = 2;
        TempleTrekkingInfoBox.var2[6] = 3;
        TempleTrekkingInfoBox.var2[7] = -(0xFFFFFDB3 & 0x4E5F) & (0xFFFFDFFE & 0x6FFB);
        TempleTrekkingInfoBox.var2[8] = 0x9F ^ 0x9B;
        TempleTrekkingInfoBox.var2[9] = 0x89 ^ 0x8C;
        TempleTrekkingInfoBox.var2[10] = -(0xFFFFDB51 & 0x6CAF) & (0xFFFFFFFF & 0x4D5F);
        TempleTrekkingInfoBox.var2[11] = 91 + 32 - 62 + 90 ^ 73 + 85 - 108 + 95;
        TempleTrekkingInfoBox.var2[12] = 0xBF ^ 0xB8;
    }

    public Dimension render(Graphics2D graphics2D) {
        TempleTrekkingInfoBox var25;
        if (TempleTrekkingInfoBox.var12(this.z.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        var25.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        String var26 = var1[var2[1]];
        var25.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var26).build());
        0;
        int var27 = var2[2];
        var25.panelComponent.setPreferredSize(new Dimension(var27 + var2[3], var2[1]));
        Duration var28 = Duration.between(var25.z.getStarted(), Instant.now());
        var25.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(Time.format((Duration)var28)).build());
        0;
        int var29 = (int)var25.d(var25.z.j());
        Object[] objectArray = new Object[var2[5]];
        objectArray[TempleTrekkingInfoBox.var2[1]] = var25.z.j();
        objectArray[TempleTrekkingInfoBox.var2[4]] = var29;
        var25.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(String.format(var1[var2[6]], objectArray)).build());
        0;
        if (TempleTrekkingInfoBox.var3((Object)var25.B.reward(), (Object)d.XP_TOME)) {
            int var30 = (int)(var25.d(var25.C.m()) * 1375L) / var2[7];
            Object[] objectArray2 = new Object[var2[5]];
            objectArray2[TempleTrekkingInfoBox.var2[1]] = var25.C.m() * var2[10] / var2[7];
            objectArray2[TempleTrekkingInfoBox.var2[4]] = var30;
            var25.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[8]]).right(String.format(var1[var2[9]], objectArray2)).build());
            0;
            0;
            if (((0x49 ^ 0x29 ^ (0x15 ^ 0x64)) & (0x7A ^ 3 ^ (0x64 ^ 0xC) ^ -1)) < 0) {
                return null;
            }
        } else {
            int var30 = (int)var25.d(var25.C.m());
            Object[] objectArray3 = new Object[var2[5]];
            objectArray3[TempleTrekkingInfoBox.var2[1]] = var25.C.m();
            objectArray3[TempleTrekkingInfoBox.var2[4]] = var30;
            var25.panelComponent.getChildren().add(LineComponent.builder().left(var25.B.reward().y()).right(String.format(var1[var2[11]], objectArray3)).build());
            0;
        }
        return super.render(graphics2D);
    }

    static {
        TempleTrekkingInfoBox.var24();
        TempleTrekkingInfoBox.var11();
    }
}

