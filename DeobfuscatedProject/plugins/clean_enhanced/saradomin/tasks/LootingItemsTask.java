/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.saradomin.tasks.BHelper;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class LootingItemsTask
extends Task {
    private final  b aG;
    
    private final  SquireSaraConfig aH;
    private final  d aF;
    private final  g aE;

    private static boolean var3(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    static {
        D.var12();
        D.var13();
    }

    private static void var13() {
        var2 = new String[var1[9]];
        D.var2[D.var1[0]] = "Pie dish";
        D.var2[D.var1[2]] = "Drop";
        D.var2[D.var1[4]] = "Bury";
        D.var2[D.var1[5]] = "Eat";
        D.var2[D.var1[6]] = "Drop";
        D.var2[D.var1[7]] = "Take";
        D.var2[D.var1[8]] = "bones";
    }

    /*
     * WARNING - void declaration
     */
    private TileItem W() {
        TileItem tileItem2 = this.aF.i().orElse(null);
        if (D.var14(tileItem2) && D.var15(this.aF.a(tileItem2), var1[1])) {
            void var16;
            return var16;
        }
        TileItem var17 = TileItems.getNearest(tileItem -> {
            int n2;
            if (D.var18(tileItem.getName().toLowerCase().contains(var2[var1[8]]) ? 1 : 0) && D.var18(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = var1[2];
                0;
                
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (D.var14(var17) && D.var19(Combat.getMissingHealth())) {
            return var17;
        }
        return tileItem2;
    }

    private static boolean var19(int n2) {
        return n2 > 0;
    }

    @Inject
    public LootingItemsTask(g g2, d d2, b b2, SquireSaraConfig squireSaraConfig) {
        this.aE = g2;
        this.aF = d2;
        this.aG = b2;
        this.aH = squireSaraConfig;
    }

    private static boolean var15(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var12() {
        var1 = new int[10];
        D.var1[0] = (0x78 ^ 0x20) & ~(0x13 ^ 0x4B);
        D.var1[1] = 0xFFFFFFFE & Integer.MAX_VALUE;
        D.var1[2] = 1;
        D.var1[3] = 0x8D ^ 0x87;
        D.var1[4] = 2;
        D.var1[5] = 3;
        D.var1[6] = 0xB6 ^ 0xB2;
        D.var1[7] = 0x40 ^ 0x45;
        D.var1[8] = 21 + 50 - -4 + 66 ^ 94 + 78 - 154 + 121;
        D.var1[9] = 0xB7 ^ 0xB0;
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        int var21;
        int n2;
        D var22;
        if (D.var11(this.aE.m() ? 1 : 0)) {
            return var1[0];
        }
        TileItem var23 = var22.W();
        if (D.var4(var23)) {
            return var1[0];
        }
        if (D.var20(var22.aF.a(var23), var1[1])) {
            n2 = var1[2];
            0;
            if (1 == -1) {
                return ((0xE ^ 0x18) & ~(0xA2 ^ 0xB4)) != 0;
            }
        } else {
            n2 = var21 = var1[0];
        }
        if (D.var18(var22.aE.l() ? 1 : 0) && D.var18(var21)) {
            return var1[0];
        }
        if (D.var18(var21) && (!D.var11(var22.aE.o() ? 1 : 0) || D.var18(Players.getLocal().isMoving() ? 1 : 0))) {
            return var1[0];
        }
        if (D.var18(var21) && D.var3(var22.aE.k(), var1[3])) {
            return var1[0];
        }
        if (D.var18(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[var1[2]];
            nArray[D.var1[0]] = var23.getId();
            if (!D.var18(Inventory.contains((int[])nArray) ? 1 : 0) || D.var11(var23.isStackable() ? 1 : 0)) {
                String[] stringArray = new String[var1[2]];
                stringArray[D.var1[0]] = var2[var1[0]];
                Item var24 = Inventory.getFirst((String[])stringArray);
                if (D.var14(var24)) {
                    var24.interact(var2[var1[2]]);
                    return var1[2];
                }
                Item var25 = var22.aG.g();
                if (D.var14(var25)) {
                    if (D.var18(var25.hasAction(var2[var1[4]]::equals) ? 1 : 0)) {
                        return var1[0];
                    }
                    var25.interact(var2[var1[5]]);
                    return var1[2];
                }
                Item var26 = var22.aF.j().orElse(null);
                if (D.var4(var26)) {
                    return var1[0];
                }
                if (D.var11(var22.aF.a(var26, var23) ? 1 : 0)) {
                    return var1[0];
                }
                var26.interact(var2[var1[6]]);
            }
        }
        if (D.var18(Movement.isRunEnabled() ? 1 : 0) && D.var18(var22.aH.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        var1_1.interact(var2[var1[7]]);
        this.sleep(var1[2]);
        return var1[2];
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    private static boolean var14(Object object) {
        return object != null;
    }
}

