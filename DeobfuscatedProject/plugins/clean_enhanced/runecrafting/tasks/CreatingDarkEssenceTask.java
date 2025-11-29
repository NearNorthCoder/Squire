/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Creating Dark Essence")
public class CreatingDarkEssenceTask
extends Task {

    private static final  WorldPoint x;
    private static final  int w;
    private final  SquireZeahRunecrafter y;

    static {
        e.var3();
        e.var4();
        w = 3;
        x = new WorldPoint(5, 6, 0);
    }

    private void u() {
        if ((Movement.shouldWalk( != 0) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)x);
            0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean r() {
        int n;
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            int[] nArray = new int[1];
            nArray[0] = 2;
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                n = 1;
                0;
                if (((67 + 139 - 116 + 56 ^ 97 + 2 - 45 + 128) & (0x89 ^ 0xB1 ^ (0xDF ^ 0xC3) ^ -1)) < (171 + 31 - 67 + 64 ^ 19 + 181 - 42 + 37)) return n != 0;
                return ((195 + 1 - 100 + 135 ^ 60 + 53 - -32 + 28) & (141 + 142 - 95 + 13 ^ 92 + 122 - 189 + 106 ^ -1)) != 0;
            }
        }
        n = 0;
        return n != 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private TileObject t() {
        return TileObjects.getNearest(tileObject -> {
            int n;
            if ((tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) <= tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation())2) && (tileObject.getId() == tileObject.getId()2)) {
                n = 1;
                0;
                if (((77 + 42 - 109 + 137 ^ 107 + 119 - 172 + 96) & (124 + 7 - 24 + 29 ^ 107 + 8 - -18 + 8 ^ -1)) != 0) {
                    return ((0xB4 ^ 0xBD ^ (0xEA ^ 0xC7)) & (0xD8 ^ 0x9E ^ (0xC ^ 0x6E) ^ -1)) != 0;
                }
            } else {
                n = 0;
            }
            return n != 0;
        });
    }

    public boolean run() {
        if (!(this.y.a( != 0) ? 1 : 0) || (this.r( == 0) ? 1 : 0)) {
            return 0;
        }
        this.s();
        return 1;
    }

    private void s() {
        TileObject tileObject = this.t();
        if tileObject != null {
            tileObject.interact(var1[0]);
            0;
            
        } else {
            e var11;
            var11.u();
        }
    }

    @Inject
    public CreatingDarkEssenceTask(SquireZeahRunecrafter squireZeahRunecrafter) {
        this.y = squireZeahRunecrafter;
    }
}

