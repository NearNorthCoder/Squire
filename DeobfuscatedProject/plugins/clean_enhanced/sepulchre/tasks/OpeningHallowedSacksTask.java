/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.SepulchreTaskBase;
import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.util.concurrent.CompletableFuture;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Opening Hallowed sacks", priority=0x7FFFFFFF, blocking=true)
public class OpeningHallowedSacksTask
extends SepulchreTaskBase {
    
    private  CompletableFuture<Boolean> ag;
    private  Player ai;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static void var4() {
        var2 = new String[var1[3]];
        U.var2[U.var1[0]] = "Open";
    }

    private static void var5() {
        var1 = new int[6];
        U.var1[0] = (0xB0 ^ 0xB6) & ~(3 ^ 5);
        U.var1[1] = 0xFFFFFBF3 & 0x657E;
        U.var1[2] = 3;
        U.var1[3] = 1;
        U.var1[4] = 0x83 ^ 0xBD ^ (0x11 ^ 0x27);
        U.var1[5] = 2;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    static {
        U.var5();
        U.var4();
    }

    private static boolean var13(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected OpeningHallowedSacksTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        super(squireSepulchre, squireSepulchreConfig);
        this.ag = null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J() {
        void var1_1;
        U var14;
        this.ai = Players.getLocal();
        if (U.var3(this.ai)) {
            return var1[0];
        }
        if (U.var15(b.B.contains((Locatable)var14.ai) ? 1 : 0)) {
            return var1[0];
        }
        InventorySetup var16 = new InventorySetup();
        var16.add(var1[1], var1[2]);
        0;
        if (U.var12(var16.matchesInventory() ? 1 : 0)) {
            if (U.var12(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                return var1[3];
            }
            String[] stringArray = new String[var1[3]];
            stringArray[U.var1[0]] = var2[var1[0]];
            Inventory.doActions(item -> {
                boolean bl;
                if (U.var13(item.getId(), var1[1])) {
                    bl = var1[3];
                    0;
                    if (3 == -1) {
                        return ((0x3E ^ 0x78) & ~(0xCB ^ 0x8D)) != 0;
                    }
                } else {
                    bl = var1[0];
                }
                return bl;
            }, (String[])stringArray);
            return var1[3];
        }
        if (U.var15(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return var1[3];
        }
        var1_1.withdraw();
        0;
        return var1[3];
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }
}

