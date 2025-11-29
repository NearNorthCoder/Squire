/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import gg.squire.runecrafting.tasks.RunecraftingManager;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Mining Essence Blocks")
public class MiningEssenceBlocksTask
extends Task {

    private static final  WorldArea C;
    private static final  WorldPoint A;
    private static final  WorldPoint B;
    private final  a E;
    private final  SquireZeahRunecrafter F;
    private static final  WorldArea D;

    static {
        g.var3();
        g.var4();
        A = new WorldPoint(9, var2[10], 0);
        B = new WorldPoint(9, var2[11], 0);
        C = new WorldArea(var2[12], var2[13], var2[14], var2[15], 0);
        D = new WorldArea(var2[16], var2[17], var2[18], var2[15], 0);
    }

    public boolean run() {
        if ((this.v( != 0) ? 1 : 0)) {
            return 0;
        }
        this.A();
        return 1;
    }

    private TileObject B() {
        TileObject tileObject2;
        TileObject tileObject3 = TileObjects.getNearest(tileObject -> {
            int n;
            if ((tileObject.getActualId() == tileObject.getActualId()2) && (tileObject.distanceTo(Players.getLocal().getWorldLocation()) <= tileObject.distanceTo(Players.getLocal().getWorldLocation())2)) {
                n = 1;
                0;
                if ((0x8E ^ 0x8A) == 0) {
                    return ((0x3C ^ 0x13) & ~(0xBA ^ 0x95)) != 0;
                }
            } else {
                n = 0;
            }
            return n != 0;
        });
        if (tileObject3 != null && (Reachable.isInteractable(LocatabletileObject3) ? 1 : 0)) {
            tileObject2 = tileObject3;
            0;
            if (2 <= 0) {
                return null;
            }
        } else {
            tileObject2 = null;
        }
        return tileObject2;
    }

    @Inject
    public MiningEssenceBlocksTask(a a2, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.E = a2;
        this.F = squireZeahRunecrafter;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean x() {
        int n;
        block2: {
            block3: {
                if (!(C.contains(LocatablePlayers.getLocal()) ? 1 : 0)) break block2;
                int[] nArray = new int[1];
                nArray[0] = 2;
                if (!(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) break block3;
                int[] nArray2 = new int[1];
                nArray2[0] = 3;
                if (!(Inventory.contains((int[] != 0)nArray2) ? 1 : 0)) break block2;
            }
            n = 1;
            0;
            if (2 > -1) return n != 0;
            return ((0x64 ^ 0x76 ^ (0xC2 ^ 0x9C)) & (232 + 41 - 57 + 38 ^ 9 + 166 - 46 + 49 ^ -1)) != 0;
        }
        n = 0;
        return n != 0;
    }

    private void c(TileObject tileObject) {
        if ((Players.getLocal().getAnimation() == Players.getLocal().getAnimation()2)) {
            tileObject.interact(var1[0]);
        }
    }

    private boolean w() {
        boolean bl;
        if ((this.F.a( == 0) ? 1 : 0)) {
            bl = 1;
            0;
            if (1 >= (0xDB ^ 0x8A ^ (0xC ^ 0x59))) {
                return ((114 + 98 - 81 + 9 ^ 152 + 84 - 218 + 163) & (116 + 25 - 5 + 41 ^ 56 + 127 - 181 + 134 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    private boolean y() {
        return Inventory.isFull();
    }

    private boolean v() {
        boolean bl;
        if (!(this.w( == 0) ? 1 : 0) || !(this.x( == 0) ? 1 : 0) || !(this.y( == 0) ? 1 : 0) || (this.z( != 0) ? 1 : 0)) {
            bl = 1;
            0;
            if (-(0x7B ^ 0x29 ^ (0x18 ^ 0x4F)) >= 0) {
                return ((0x52 ^ 0x17 ^ (0xD ^ 0x4C)) & (0xE ^ 0x26 ^ (0x2D ^ 1) ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    private boolean z() {
        int n;
        if ((this.E.j() == this.E.j()2)) && (Inventory.isFull( != 0) ? 1 : 0)) {
            n = 1;
            0;
            if null != null {
                return ((0x82 ^ 0x98) & ~(0x99 ^ 0x83)) != 0;
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

    private boolean D() {
        boolean bl;
        if ((A.distanceTo(Players.getLocal().getWorldLocation()) > A.distanceTo(Players.getLocal().getWorldLocation())2)) {
            bl = 1;
            0;
            if (3 < 3) {
                return (3 & (3 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    private void A() {
        TileObject tileObject = this.B();
        if tileObject != null {
            this.c(tileObject);
            0;
            if (-3 > 0) {
                return;
            }
        } else {
            g var11;
            var11.C();
        }
    }

    private void C() {
        if ((this.D( != 0) ? 1 : 0) && (D.contains(LocatablePlayers.getLocal()) ? 1 : 0)) {
            this.E();
            0;
            if (-1 == 2) {
                return;
            }
        } else {
            Movement.walkTo((WorldPoint)A);
            0;
        }
    }

    private void E() {
        int[] nArray = new int[1];
        nArray[0] = 6;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if tileObject != null {
            tileObject.interact(var1[1]);
            0;
            if ((0x5E ^ 6 ^ (0x7F ^ 0x23)) == 0) {
                return;
            }
        } else {
            Movement.walkTo((WorldPoint)B);
            0;
        }
    }

}

