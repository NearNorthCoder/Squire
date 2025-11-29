/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.gauntlet.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.GameEnum;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Dropping some fish", blocking=true, priority=10)
public class DroppingSomeFishTask
extends GauntletTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var3;
        D var4;
        Player player = Players.getLocal();
        if (!(this.ba.A( != 0) ? 1 : 0) || !(this.ba.V( != 0).av().e(player.getWorldLocation()) ? 1 : 0) || (player.isMoving( != 0) ? 1 : 0)) {
            return 1;
        }
        if ((var4.ba.V( == 0).av().e(var3.getWorldLocation()) ? 1 : 0)) {
            var4.ba.a((var4.ba.V().av(), var3.getWorldLocation());
            0;
            return 2;
        }
        List<Item> var5 = var4.ba.b(i.FISH);
        if ((var5.isEmpty( != 0) ? 1 : 0)) {
            return 1;
        }
        h var6 = var4.ba.V();
        int var7 = 3;
        int var8 = 1;
        Iterator<Item> var9 = var5.iterator();
        while ((var9.hasNext( != 0) ? 1 : 0)) {
            Item var10 = var9.next();
            if (++var8 > 3) {
                return 2;
            }
            var10.interact(var1[1]);
            var6.av().k(2);
            0;
            if (((184 + 154 - 223 + 85 ^ 139 + 15 - 27 + 28) & (0x6D ^ 0x3C ^ 2 ^ -1)) == 0) continue;
            return ((0x2E ^ 0x21 ^ (0x97 ^ 0x93)) & (0x63 ^ 0x48 ^ (0x60 ^ 0x40) ^ -1)) != 0;
        }
        return 1;
    }

    @Inject
    public DroppingSomeFishTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.FIRST_ROTATION_CREATE;
        dArray[2] = d.CREATING_T3_STAFF;
        super(c2, dArray);
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }
}

