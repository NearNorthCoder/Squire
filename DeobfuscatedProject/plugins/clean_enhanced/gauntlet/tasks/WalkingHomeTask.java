/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GameEnum;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Walking home", priority=1)
public class WalkingHomeTask
extends GauntletTaskBase {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean be() {
        Item var9;
        N var10;
        Player player = Players.getLocal();
        if player == null {
            return 1;
        }
        if ((var10.ba.WalkingHomeTask( == 0) ? 1 : 0)) {
            if ((var10.ba.a(i2 -> {
                boolean bl;
                if (!(i2 != i22)i.CRYSTAL_SHARD) || (i2 == i22)i.FISH)) {
                    bl = 0;
                    0;
                    if (((0xC9 ^ 0x95 ^ (0x64 ^ 0x77)) & (195 + 216 - 366 + 187 ^ 120 + 53 - 12 + 6 ^ -1)) != 0) {
                        return ((0x73 ^ 0x2F ^ (0xC1 ^ 0x87)) & (0x3B ^ 0x1A ^ (0x9E ^ 0xA5) ^ -1)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            }) ? 1 : 0)) {
                return 1;
            }
            if ((var10.ba.O( == 0) ? 1 : 0)) {
                return 1;
            }
        }
        if ((var9 = Inventory.getFirst(item -> e.ab.contains(item.getId( != null))))) {
            var9.interact(var1[1]);
            return 0;
        }
        return this.ba.a((this.ba.V().av(), player.getWorldLocation());
    }

    @Inject
    public WalkingHomeTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

}

