/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.aerialfisher.overlay;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.aerialfisher.SquireAerialFisher;
import gg.squire.aerialfisher.overlay.AerialfisherManager;
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

@Singleton
public class AerialFisherInfoBox
extends OverlayPanel {
    private final  SquireAerialFisher h;
    
    private final  a i;

    private static boolean var3(int n, int n2) {
        return n < n2;
    }

    static {
        AerialFisherInfoBox.var4();
        AerialFisherInfoBox.var5();
    }

    private static boolean var6(int n) {
        return n == 0;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Inject
    public AerialFisherInfoBox(SquireAerialFisher squireAerialFisher, a a2) {
        this.h = squireAerialFisher;
        this.i = a2;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[1];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[1];
        while (AerialFisherInfoBox.var3(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (1 != (0xD9 ^ 0x88 ^ (0x48 ^ 0x1D))) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    public Dimension render(Graphics2D graphics2D) {
        if (AerialFisherInfoBox.var23(this.h.isPaintDisabled() ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(var2[0], var2[0], var2[0], var2[0]));
        String string = var1[var2[1]];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n = var2[2];
        this.panelComponent.setPreferredSize(new Dimension(n + var2[3], var2[1]));
        Duration duration = Duration.between(this.h.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[4]]).right(Time.format((Duration)duration)).build());
        0;
        int n2 = (int)this.a(this.i.b());
        Object[] objectArray = new Object[var2[5]];
        objectArray[AerialFisherInfoBox.var2[1]] = this.i.b();
        objectArray[AerialFisherInfoBox.var2[4]] = n2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[5]]).right(String.format(var1[var2[6]], objectArray)).build());
        0;
        int n3 = (int)this.a(this.i.c());
        Object[] objectArray2 = new Object[var2[5]];
        objectArray2[AerialFisherInfoBox.var2[1]] = this.i.c();
        objectArray2[AerialFisherInfoBox.var2[4]] = n3;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[7]]).right(String.format(var1[var2[8]], objectArray2)).build());
        0;
        int n4 = (int)this.a(this.i.d());
        Object[] objectArray3 = new Object[var2[5]];
        objectArray3[AerialFisherInfoBox.var2[1]] = this.i.d();
        objectArray3[AerialFisherInfoBox.var2[4]] = n4;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var1[var2[9]]).right(String.format(var1[var2[10]], objectArray3)).build());
        0;
        return super.render(graphics2D);
    }

    private static void var4() {
        var2 = new int[12];
        AerialFisherInfoBox.var2[0] = 136 + 141 - 203 + 127 ^ 1 + 153 - 56 + 97;
        AerialFisherInfoBox.var2[1] = 3 & (3 ^ -1);
        AerialFisherInfoBox.var2[2] = (0x56 ^ 0x3C) + (107 + 80 - 45 + 5) - (0x55 ^ 0x18) + (0x14 ^ 5);
        AerialFisherInfoBox.var2[3] = 0x56 ^ 0x42;
        AerialFisherInfoBox.var2[4] = 1;
        AerialFisherInfoBox.var2[5] = 2;
        AerialFisherInfoBox.var2[6] = 3;
        AerialFisherInfoBox.var2[7] = 46 + 34 - -64 + 27 ^ 124 + 142 - 197 + 106;
        AerialFisherInfoBox.var2[8] = 0x1A ^ 0x1F;
        AerialFisherInfoBox.var2[9] = 0x31 ^ 0x37;
        AerialFisherInfoBox.var2[10] = 9 ^ 0x6D ^ (0xFE ^ 0x9D);
        AerialFisherInfoBox.var2[11] = 0x17 ^ 0x1F;
    }

    public long a(int n) {
        Duration duration = Duration.between(this.h.getStarted(), Instant.now());
        if (AerialFisherInfoBox.var6(duration.isZero() ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static boolean var23(int n) {
        return n != 0;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    private static void var5() {
        var1 = new String[var2[11]];
        AerialFisherInfoBox.var1[AerialFisherInfoBox.var2[1]] = "Squire Aerial Fisher";
        AerialFisherInfoBox.var1[AerialFisherInfoBox.var2[4]] = "Runtime:";
        AerialFisherInfoBox.var1[AerialFisherInfoBox.var2[5]] = "Fish caught:";
        AerialFisherInfoBox.var1[AerialFisherInfoBox.var2[6]] = "%d (%d/h)";
        AerialFisherInfoBox.var1[AerialFisherInfoBox.var2[7]] = "Pearls gained:";
        AerialFisherInfoBox.var1[AerialFisherInfoBox.var2[8]] = "%d (%d/h)";
        AerialFisherInfoBox.var1[AerialFisherInfoBox.var2[9]] = "Tenches gained:";
        AerialFisherInfoBox.var1[AerialFisherInfoBox.var2[10]] = "%d (%d/h)";
    }
}

