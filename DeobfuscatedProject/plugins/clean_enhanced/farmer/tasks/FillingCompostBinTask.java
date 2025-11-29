/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.LHelper;
import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum7;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Filling compost bin", priority=30, blocking=true)
public class FillingCompostBinTask
extends aN {
    private final  h cx;
    
    private  boolean cy;

    @Inject
    public FillingCompostBinTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
        super(f2, squireFarmerConfig, client);
        this.cx = h2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean b(TileObject tileObject) {
        void var2_2;
        aO var3;
        String[] stringArray = new String[1];
        stringArray[0] = var1[0];
        if ((tileObject.hasActionstringArray)) {
            tileObject.interact(var1[1]);
            return 1;
        }
        Item var4 = var3.bu();
        if ((Inventory.isFull( != 0) ? 1 : 0) && var4 != null) {
            var3.cy = 1;
            0;
            if null != null {
                return ((0x80 ^ 0xC3 ^ (0xE7 ^ 0x8C)) & (0xBA ^ 0x97 ^ (0xB6 ^ 0xB3) ^ -1)) != 0;
            }
        } else if var4 == null {
            var3.cy = 0;
            return 0;
        }
        if (var3.cy == 0) {
            return 0;
        }
        Item var5 = Inventory.getFirst(item2 -> {
            int n2;
            if ((L.bq.contains(item2.getId( != 0)) ? 1 : 0) && (item2.getId() != var4.getId())) {
                n2 = 1;
                0;
                if ((0x6A ^ 0x6E) < 0) {
                    return ((0x28 ^ 0x6A) & ~(0x6B ^ 0x29)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var5 != null {
            var3.cx.c(var5);
            return 1;
        }
        if (!(Players.getLocal( == 0).isMoving() ? 1 : 0) || (Players.getLocal( != 0).isAnimating() ? 1 : 0)) {
            return 1;
        }
        var2_2.useOn(tileObject);
        return 1;
    }

    @Override
    public boolean I(N n2) {
        if (!((Object)n2.aI().aZ() != (Object)n2.aI().aZ()2)n.GROWING) || ((Object)n2.aI().aZ() == (Object)n2.aI().aZ()2)n.HARVESTABLE)) {
            var6.cy = 0;
            return 0;
        }
        return 1;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }
}

