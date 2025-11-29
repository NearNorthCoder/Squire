/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.util.List;
import javax.inject.Inject;
import gg.squire.combat.tasks.GameEnum2;
import net.runelite.api.Actor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Flicking Prayer", priority=15)
public class FlickingPrayerTask
extends Task {

    private final  SquireBlueDragonKiller D;
    private final  SquireBlueDragonKillerConfig E;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        List list;
        List var9;
        i var10;
        block14: {
            block13: {
                if ((this.E.flickPrayer( == 0) ? 1 : 0)) {
                    return 0;
                }
                if ((Prayers.getPoints( == 0))) {
                    return 0;
                }
                Actor var11 = Players.getLocal().getInteracting();
                if (!var11 != null) break block13;
                String[] stringArray = new String[1];
                stringArray[0] = var1[0];
                if (!(var11.hasAction(stringArray == 0) ? 1 : 0)) break block14;
            }
            if ((Prayers.anyActive( != 0) ? 1 : 0)) {
                Prayers.disableAll();
                return 1;
            }
            return 0;
        }
        if (((Object)var10.E.attackStyle() == (Object)var10.E.attackStyle()2)c.MELEE)) {
            var9 = Prayers.getMeleePrayer();
            0;
            if (1 < 0) {
                return ((0xE8 ^ 0xC5) & ~(0x8B ^ 0xA6)) != 0;
            }
        } else if (((Object)var10.E.attackStyle() == (Object)var10.E.attackStyle()2)c.RANGE)) {
            var9 = Prayers.getRangePrayers();
            0;
            
        } else {
            list = Prayers.getMagePrayers();
        }
        return Prayers.flick((List)list);
    }

    @Inject
    public FlickingPrayerTask(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.D = squireBlueDragonKiller;
        this.E = squireBlueDragonKillerConfig;
    }
}

