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
 *  net.runelite.client.ui.overlay.components.LineComponent$LineComponentBuilder
 *  net.runelite.client.ui.overlay.components.TitleComponent
 *  net.unethicalite.api.commons.Time
 */
package gg.squire.basics.cerberus.overlay;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.basics.cerberus.overlay.ConstructionManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class CerberusOverlay
extends OverlayPanel {
    private final  a ai;
    private final  TaskManager aj;
    private final  SquireCerberus ah;
    private static  String[] lllIIllII;
    private static  int[] lllIIllIl;

    private long i(int n2) {
        Duration duration = Duration.between(this.ah.getStarted(), Instant.now());
        if ((duration.isZero( != 0) ? 1 : 0)) {
            return 0L;
        }
        return (int)((double)n2 * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
    }

    private static String var1(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = 0;
        char[] var7 = var2.toCharArray();
        int var8 = var7.length;
        int var9 = 0;
        while (var9 < var8) {
            char var10 = var7[var9];
            var4.append((char)(var10 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if (-(0x64 ^ 0x60) <= 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        String string;
        String string2;
        String string3;
        String string4;
        CerberusOverlay var23;
        if ((this.ah.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        var23.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(lllIIllII[0]).build());
        0;
        Duration var24 = Duration.between(var23.ah.getStarted(), Instant.now());
        var23.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[1]).right(Time.format((Duration)var24)).build());
        0;
        List list = var23.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder = LineComponent.builder().left(lllIIllII[2]);
        if ((var23.ai.k( != null))) {
            string4 = lllIIllII[3];
            0;
            if (((0x97 ^ 0xA2) & ~(0x9A ^ 0xAF)) >= 1) {
                return null;
            }
        } else {
            string4 = lllIIllII[4];
        }
        list.add(lineComponentBuilder.right(string4).build());
        0;
        List list2 = var23.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder2 = LineComponent.builder().left(lllIIllII[5]);
        if ((var23.ah.r( != 0) ? 1 : 0)) {
            string3 = lllIIllII[6];
            0;
            if (3 < 3) {
                return null;
            }
        } else {
            string3 = lllIIllII[7];
        }
        list2.add(lineComponentBuilder2.right(string3).build());
        0;
        var23.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[8]).right(var23.ah.q() + " (" + var23.i(var23.ah.q()) + "/hr)").build());
        0;
        List list3 = var23.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder3 = LineComponent.builder().left(lllIIllII[9]);
        if ((var23.ai.h( != 0).isEmpty() ? 1 : 0)) {
            string2 = lllIIllII[lllIIllIl[10]];
            0;
            if null != null {
                return null;
            }
        } else {
            string2 = lllIIllII[lllIIllIl[11]];
        }
        list3.add(lineComponentBuilder3.right(string2).build());
        0;
        var23.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[12]]).right(String.valueOf(var23.ai.n())).build());
        0;
        List list4 = var23.panelComponent.getChildren();
        LineComponent.LineComponentBuilder lineComponentBuilder4 = LineComponent.builder().left(lllIIllII[lllIIllIl[13]]);
        if ((var23.ai.l( != 0) ? 1 : 0)) {
            string = lllIIllII[lllIIllIl[14]];
            0;
            if ((0xCC ^ 0x86 ^ (0x28 ^ 0x66)) != (0x24 ^ 0x15 ^ (0x92 ^ 0xA7))) {
                return null;
            }
        } else {
            string = lllIIllII[lllIIllIl[15]];
        }
        list4.add(lineComponentBuilder4.right(string).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[16]]).right(String.valueOf(this.ai.o())).build());
        0;
        this.panelComponent.getChildren().add(LineComponent.builder().left(lllIIllII[lllIIllIl[17]]).right(this.aj.getCurrentTask()).build());
        0;
        int n2 = lllIIllIl[18];
        this.panelComponent.setPreferredSize(new Dimension(n2 + lllIIllIl[19], 0));
        return super.render(graphics2D);
    }

    @Inject
    private CerberusOverlay(SquireCerberus squireCerberus, a a2) {
        this.ah = squireCerberus;
        this.ai = a2;
        this.aj = squireCerberus.getManager();
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

