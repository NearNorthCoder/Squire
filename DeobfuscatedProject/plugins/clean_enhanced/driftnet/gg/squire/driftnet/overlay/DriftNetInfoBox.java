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
import java.time.Duration;
import java.time.Instant;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;
import gg.squire.driftnet.overlay.DriftnetManager;

@Singleton
public class DriftNetInfoBox
extends OverlayPanel {
    private final  TaskManager o;
    private final  SquireDriftNet m;
    
    private final  a n;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < lllllllllllllllIlllIIllIlIIlIlII2) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (2 != ((0xFD ^ 0xBE) & ~(0x71 ^ 0x32))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
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
        if ((this.m.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        this.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        String string = var2[1];
        this.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(string).build());
        0;
        int n = 2;
        this.panelComponent.setPreferredSize(new Dimension(n + 3, 1));
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[4]).right(Time.format((Duration)duration)).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[5]).right(this.o.getCurrentTask()).build());
        0;
        int n2 = (int)this.a(this.n.i());
        Object[] objectArray = new Object[5];
        objectArray[1] = this.n.i();
        objectArray[4] = n2;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[6]).right(String.format(var2[7], objectArray)).build());
        0;
        int n3 = Static.getClient().getVarbitValue(8);
        int n4 = Static.getClient().getVarbitValue(9);
        int n5 = Static.getClient().getVarbitValue(var1[10]);
        int n6 = Static.getClient().getVarbitValue(var1[11]);
        Object[] objectArray2 = new Object[5];
        objectArray2[1] = n3;
        objectArray2[4] = n5;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[12]]).right(String.format(var2[var1[13]], objectArray2)).build());
        0;
        Object[] objectArray3 = new Object[5];
        objectArray3[1] = n4;
        objectArray3[4] = n6;
        this.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[14]]).right(String.format(var2[var1[15]], objectArray3)).build());
        0;
        return super.render(graphics2D);
    }

    public long a(int n) {
        Duration duration = Duration.between(this.m.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }
}

