/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.util.Random;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Flick Rapid Heal", priority=2, blocking=true)
public class FlickRapidHealTask
extends Task {
    
    private final  Client Q;
    
    private final  SquireNightmareZone O;
    private final  SquireNightmareZoneConfig P;
    private  Random R;

    @Inject
    public FlickRapidHealTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.R = new Random();
        this.O = squireNightmareZone;
        this.P = squireNightmareZoneConfig;
        this.Q = client;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static void var6() {
        var1 = new String[var2[4]];
        g.var1[g.var2[0]] = "Flicking Rapid Heal";
    }

    public boolean run() {
        if (g.var4(this.Q.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        if (!g.var7(Skills.getLevel((SkiSkill.PRAYER), var2[1]) || g.var8(Skills.getBoostedLevel((SkiSkill.PRAYER))) {
            return var2[0];
        }
        Widget var9 = Widgets.get((WidgetInfo)Prayer.RAPID_HEAL.getWidgetInfo());
        if (g.var5(var9)) {
            return var2[0];
        }
        if (g.var3(Prayers.isEnabled((Prayer)Prayer.RAPID_HEAL) ? 1 : 0)) {
            WidgetPackets.widgetFirstOption((Widget)var9);
            0;
            if (-3 > 0) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            WidgetPackets.widgetFirstOption((Widget)var9);
            WidgetPackets.widgetFirstOption((Widget)var9);
        }
        System.out.println(var1[var2[0]]);
        int n2 = this.R.nextInt(var2[2]) + var2[3];
        this.sleep(n2);
        return var2[4];
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean var8(int n2) {
        return n2 <= 0;
    }

    static {
        g.var16();
        g.var6();
    }

    private static boolean var7(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var16() {
        var2 = new int[6];
        g.var2[0] = (0x1D ^ 0x1A) & ~(0xBF ^ 0xB8);
        g.var2[1] = 0x33 ^ 0x79 ^ (0x9C ^ 0xC0);
        g.var2[2] = 0x6B ^ 7 ^ (0x4A ^ 0x6A);
        g.var2[3] = 8 ^ 0x1C;
        g.var2[4] = 1;
        g.var2[5] = 2;
    }
}

