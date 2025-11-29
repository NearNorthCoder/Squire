/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.inventory.InventorySetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.sepulchre.tasks;

import com.google.inject.Inject;
import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Banking", priority=50, blocking=true)
public class BankingTask
extends Task {
    private  Client aj;
    private  int ah;
    private final  SquireSepulchre af;
    private  CompletableFuture<Boolean> ag;
    private  Player ai;
    
    private final  SquireSepulchreConfig ae;

    public boolean run() {
        N var3;
        this.ai = Players.getLocal();
        if (N.var4(this.ai)) {
            return var1[0];
        }
        if (N.var5(b.B.contains((Locatable)var3.ai) ? 1 : 0)) {
            return var1[0];
        }
        if (N.var6(var3.af.j().matchesInventory() ? 1 : 0)) {
            System.out.println(var2[var1[0]]);
            return var1[0];
        }
        if (N.var5(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return var1[1];
        }
        this.af.j().withdraw();
        0;
        this.sleep(var1[2]);
        return var1[1];
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Inject
    public BankingTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.ag = null;
        this.ae = squireSepulchreConfig;
        this.af = squireSepulchre;
    }

    private static void var13() {
        var1 = new int[5];
        N.var1[0] = (17 + 72 - 53 + 96 ^ 27 + 36 - 9 + 95) & (127 + 1 - 100 + 104 ^ 96 + 41 - 101 + 113 ^ -1);
        N.var1[1] = 1;
        N.var1[2] = 0x2C ^ 0x2A;
        N.var1[3] = -1;
        N.var1[4] = 2;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    static {
        N.var13();
        N.var14();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(BankLoadout bankLoadout) {
        void var15;
        Iterator var16;
        int var17;
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] nArray = inventorySetup.getIds();
        int n2 = nArray.length;
        int var18 = var1[0];
        while (N.var19(var18, var17)) {
            void var20 = var16[var18];
            int var21 = var15.getOrDefault((int)var20, var1[0]);
            var15.put((int)var20, var21 + var1[1]);
            0;
            ++var18;
            0;
            if (2 <= 2) continue;
            return ((0x40 ^ 0x17) & ~(0x10 ^ 0x47)) != 0;
        }
        var16 = var15.keySet().iterator();
        while (N.var6(var16.hasNext() ? 1 : 0)) {
            var17 = (Integer)var16.next();
            if (N.var22(var17, var1[3])) {
                0;
                if (1 == 1) continue;
                return ((0x84 ^ 0x90 ^ (0xA0 ^ 0x92)) & (37 + 125 - 79 + 45 ^ 4 + 78 - -54 + 30 ^ -1)) != 0;
            }
            var18 = (Integer)var15.get(var17);
            int[] nArray2 = new int[var1[1]];
            nArray2[N.var1[0]] = var17;
            if (N.var19(Inventory.getCount((int[])nArray2), var18)) {
                System.out.println(var17);
                return var1[1];
            }
            0;
            
            return ((0x8A ^ 0x81) & ~(0xF ^ 4)) != 0;
        }
        return var1[0];
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var22(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static void var14() {
        var2 = new String[var1[1]];
        N.var2[N.var1[0]] = "no need to bank";
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }
}

