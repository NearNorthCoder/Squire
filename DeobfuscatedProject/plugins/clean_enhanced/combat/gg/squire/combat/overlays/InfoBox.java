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
package gg.squire.combat.overlays;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.time.Duration;
import java.time.Instant;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;
import net.unethicalite.api.commons.Time;

public class InfoBox
extends OverlayPanel {
    private final  SquireBlueDragonKiller p;
    private final  SquireBlueDragonKiller r;
    private final  TaskManager q;

    private final  SquireBlueDragonKillerConfig s;

    public long g(int n) {
        Duration duration = Duration.between(this.r.getStarted(), Instant.now());
        if ((duration.isZero( == 0) ? 1 : 0)) {
            return (int)((double)n * (double)Duration.ofHours(1L).toMillis() / (double)duration.toMillis());
        }
        return 0L;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < lllllllllllllllIlllIlIllIIIlllll2) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((69 + 73 - 74 + 87 ^ 78 + 13 - 56 + 124) > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public Dimension render(Graphics2D graphics2D) {
        InfoBox var19;
        if ((this.p.isPaintDisabled( != 0) ? 1 : 0)) {
            return null;
        }
        Duration var20 = Duration.between(var19.p.getStarted(), Instant.now());
        var19.panelComponent.getChildren().add(TitleComponent.builder().color(ColorScheme.BRAND_ORANGE).text(var2[0]).build());
        0;
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[1]).right(Time.format((Duration)var20)).build());
        0;
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[2]).right(var2[3]).build());
        0;
        var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[4]).right(var19.q.getCurrentTask()).build());
        0;
        if ((var19.s.lootBones( != 0) ? 1 : 0)) {
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[5]).right(var19.r.d() + " (" + var19.g(var19.r.d()) + "/h)").build());
            0;
        }
        if ((var19.s.lootHides( != 0) ? 1 : 0)) {
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[6]).right(var19.r.e() + " (" + var19.g(var19.r.e()) + "/h)").build());
            0;
        }
        if ((var19.s.lootScales( != 0) ? 1 : 0)) {
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[7]).right(var19.r.f() + " (" + var19.g(var19.r.f()) + "/h)").build());
            0;
        }
        if ((var19.s.lootEnsouled( != 0) ? 1 : 0)) {
            var19.panelComponent.getChildren().add(LineComponent.builder().left(var2[8]).right(var19.r.g() + " (" + var19.g(var19.r.g()) + "/h)").build());
            0;
        }
        int n = 9;
        this.panelComponent.setPreferredSize(new Dimension(n, 0));
        return super.render(graphics2D);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    @Inject
    public InfoBox(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKiller squireBlueDragonKiller2, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.p = squireBlueDragonKiller;
        this.q = squireBlueDragonKiller.getManager();
        this.r = squireBlueDragonKiller2;
        this.s = squireBlueDragonKillerConfig;
        this.setPosition(OverlayPosition.BOTTOM_LEFT);
    }
}

