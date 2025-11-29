/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.bandos.tasks.BandosManager;
import gg.squire.bandos.tasks.GHelper;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class LootingItemsTask
extends Task {
    private final  i ao;
    private final  g ap;
    private final  SquireBandosConfig aq;
    
    private final  e an;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new String[var2[8]];
        v.var1[v.var2[0]] = "Bury";
        v.var1[v.var2[2]] = "Eat";
        v.var1[v.var2[4]] = "Drop";
        v.var1[v.var2[5]] = "Take";
        v.var1[v.var2[7]] = "bones";
    }

    private static boolean var10(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var11(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    static {
        v.var13();
        v.var9();
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

    private static void var13() {
        var2 = new int[9];
        v.var2[0] = (0x78 ^ 0x37 ^ (0x67 ^ 0xD)) & (0x3E ^ 0x15 ^ (0x5B ^ 0x55) ^ -1);
        v.var2[1] = 0xFFFFFFFF & Integer.MAX_VALUE;
        v.var2[2] = 1;
        v.var2[3] = 0x87 ^ 0xBE ^ (0x4D ^ 0x60);
        v.var2[4] = 2;
        v.var2[5] = 3;
        v.var2[6] = 119 + 70 - 160 + 98 ^ (0x23 ^ 0x54);
        v.var2[7] = 0x98 ^ 0x9C;
        v.var2[8] = 0x53 ^ 0x6D ^ (0x11 ^ 0x2A);
    }

    @Inject
    public LootingItemsTask(e e2, i i2, g g2, SquireBandosConfig squireBandosConfig) {
        this.an = e2;
        this.ao = i2;
        this.ap = g2;
        this.aq = squireBandosConfig;
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private TileItem P() {
        void var17;
        v var18;
        TileItem tileItem2 = this.ao.H().orElse(null);
        if (v.var16(tileItem2)) {
            return null;
        }
        if (v.var10(var18.ao.a((TileItem)var17), var2[1])) {
            return var17;
        }
        List var19 = TileItems.getAll(tileItem -> {
            int n2;
            if (v.var15(tileItem.isStackable() ? 1 : 0)) {
                int[] nArray = new int[var2[2]];
                nArray[v.var2[0]] = tileItem.getId();
                if (v.var15(Inventory.contains((int[])nArray) ? 1 : 0) && v.var15(tileItem.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    n2 = var2[2];
                    0;
                    if ((0x1B ^ 0x1F) == (0x67 ^ 0x63)) return n2 != 0;
                    return ((0x17 ^ 0x3E) & ~(0xBA ^ 0x93)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        });
        if (v.var12(var19.isEmpty() ? 1 : 0)) {
            return (TileItem)var19.get(var2[0]);
        }
        if (v.var15(Inventory.isFull() ? 1 : 0)) {
            return var18.ao.I().orElse((TileItem)var17);
        }
        TileItem var20 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(var1[var2[7]]));
        if (v.var14(var20) && v.var21(Combat.getMissingHealth(), var2[6])) {
            return var20;
        }
        return tileItem2;
    }

    public boolean run() {
        int var22;
        int n2;
        v var23;
        if (!v.var15(this.an.t() ? 1 : 0) || v.var15(this.an.s() ? 1 : 0)) {
            return var2[0];
        }
        TileItem var24 = var23.P();
        if (v.var16(var24)) {
            return var2[0];
        }
        if (v.var10(var23.ao.a(var24), var2[1])) {
            n2 = var2[2];
            0;
            if (1 < 0) {
                return ((0x72 ^ 0x49) & ~(0x8A ^ 0xB1)) != 0;
            }
        } else {
            n2 = var22 = var2[0];
        }
        if (v.var15(var23.an.LootingItemsTask() ? 1 : 0) && v.var12(var22)) {
            return var2[0];
        }
        if (v.var11(var23.an.r(), var2[3]) && v.var12(var22)) {
            return var2[0];
        }
        if (v.var15(Movement.isRunEnabled() ? 1 : 0) && v.var15(var23.aq.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (v.var15(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[var2[2]];
            nArray[v.var2[0]] = var24.getId();
            if (!v.var15(Inventory.contains((int[])nArray) ? 1 : 0) || v.var12(var24.isStackable() ? 1 : 0)) {
                Item var25 = var23.ap.G();
                if (v.var14(var25)) {
                    if (v.var15(var25.hasAction(var1[var2[0]]::equals) ? 1 : 0)) {
                        return var2[0];
                    }
                    var25.interact(var1[var2[2]]);
                    return var2[2];
                }
                Item var26 = var23.ao.J().orElse(null);
                if (v.var16(var26)) {
                    return var2[0];
                }
                if (v.var12(var23.ao.a(var26, var24) ? 1 : 0)) {
                    return var2[0];
                }
                var26.interact(var1[var2[4]]);
            }
        }
        if (v.var15(Movement.shouldWalk() ? 1 : 0)) {
            var24.interact(var1[var2[5]]);
            var23.sleep(var2[2]);
        }
        return var2[2];
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private static boolean var21(int n2, int n3) {
        return n2 > n3;
    }
}

