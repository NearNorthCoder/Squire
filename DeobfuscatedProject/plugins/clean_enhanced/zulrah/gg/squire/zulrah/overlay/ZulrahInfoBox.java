/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.NPC
 *  net.runelite.api.util.Text
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.overlay.OverlayPanel
 *  net.runelite.client.ui.overlay.OverlayPosition
 *  net.runelite.client.ui.overlay.OverlayPriority
 *  net.runelite.client.ui.overlay.components.LineComponent
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.zulrah.overlay;

import gg.squire.zulrah.overlay.ZulrahManager;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.zulrah.SquireZulrah;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.time.Duration;
import java.time.Instant;
import net.runelite.api.NPC;
import net.runelite.api.util.Text;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

@Singleton
public class ZulrahInfoBox
extends OverlayPanel {

    private final  v O;
    private final  SquireZulrah N;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 2;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 2;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((41 + 122 - 147 + 163 ^ 131 + 112 - 198 + 87) & (0x17 ^ 0x69 ^ (0xDA ^ 0x93) ^ -1)) <= ((0x20 ^ 0x65 ^ (2 ^ 0x52)) & (165 + 171 - 193 + 45 ^ 158 + 14 - 76 + 73 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public Dimension render(Graphics2D graphics2D) {
        ZulrahInfoBox var13;
        if ((this.N.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        var13.panelComponent.setBorder(new Rectangle(0, 0, 0, 0));
        var13.panelComponent.setPreferredSize(new Dimension(1, 2));
        String var14 = var2[2];
        var13.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var14).build());
        0;
        var13.panelComponent.getChildren().add(LineComponent.builder().left(var2[3]).right(var2[4]).build());
        0;
        Duration var15 = Duration.between(var13.N.getStarted(), Instant.now());
        var13.panelComponent.getChildren().add(LineComponent.builder().left(var2[5]).right(Time.format((Duration)var15)).build());
        0;
        var13.panelComponent.getChildren().add(LineComponent.builder().left(var2[6]).right(var13.N.getManager().getCurrentTask()).build());
        0;
        var13.panelComponent.getChildren().add(LineComponent.builder().left(var2[7]).right(String.valueOf(var13.N.d())).build());
        0;
        var13.panelComponent.getChildren().add(LineComponent.builder().left(var2[8]).right(String.valueOf(var13.N.e())).build());
        0;
        int var16 = (int)var13.i(var13.O.Y());
        Object[] objectArray = new Object[4];
        objectArray[2] = var13.O.Y();
        objectArray[3] = var16;
        var13.panelComponent.getChildren().add(LineComponent.builder().left(var2[9]).right(String.format(var2[var1[10]], objectArray)).build());
        0;
        NPC var17 = var13.O.W();
        if var17 != null {
            var13.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[11]]).right(String.valueOf((int)((double)var17.getHealthRatio() * 4.25))).build());
            0;
            var13.panelComponent.getChildren().add(LineComponent.builder().left(var2[0]).right(Text.titleCase((Enum)var13.O.V().C())).build());
            0;
            var13.panelComponent.getChildren().add(LineComponent.builder().left(var2[var1[12]]).right(Text.titleCase((Enum)var13.O.V().C().w())).build());
            0;
        }
        return super.render(graphics2D);
    }

    public long i(int n2) {
        Duration duration = Duration.between(this.N.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    @Inject
    public ZulrahInfoBox(SquireZulrah squireZulrah, v v2) {
        this.N = squireZulrah;
        this.O = v2;
        this.setPosition(OverlayPosition.TOP_LEFT);
        this.setPriority(OverlayPriority.LOW);
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }
}

