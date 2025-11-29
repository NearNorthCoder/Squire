/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.inventory.InventorySetup
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import gg.squire.corp.SquireCorpConfig;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldArea;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Banking", priority=0x7FFFFFFF, blocking=true)
public class BankingTask
extends Task {
    
    @Inject
    private  Client q;
    @Inject
    private  SquireCorpConfig o;
    private  int r;
    @Inject
    private  s a;
    private  BankLocation t;
    @Inject
    private  SquireCorp p;
    private  CompletableFuture<Boolean> s;

    private boolean j() {
        e var3;
        Item item2 = Inventory.getFirst(item -> item.getName().contains(var2[2]));
        if item2 != null {
            item2.interact(var2[0]);
            return 2;
        }
        if (var3.t == null) {
            var3.t = BankLocation.getNearestCommon();
        }
        Movement.walkTo((WorldArea)this.t.getArea());
        0;
        return 2;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = 0;
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = 0;
        while (var18 < var17) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var13);
    }

    public boolean run() {
        e var20;
        if ((this.k( == 0) ? 1 : 0)) {
            this.p.a(0);
            return 0;
        }
        if ((var20.p.b( == 0) ? 1 : 0)) {
            return 0;
        }
        BankLoadout var21 = (BankLoadout)var20.o.bankLoadout().selected(BankLoadout.class);
        if ((Bank.open( == 0) ? 1 : 0)) {
            return var20.j();
        }
        var20.a.v();
        if ((var20.q.getTickCount() - var20.r > 1)) {
            var20.s = null;
        }
        if (var20.s == null) {
            var20.s = BankLoadouts.withdraw((BankLoadout)var21, (boolean)2);
            var20.r = var20.q.getTickCount();
        }
        if ((var20.s.isDone( != 0) ? 1 : 0)) {
            int n2 = var20.s.join().booleanValue();
            var20.s = null;
            if n2 {
                var20.sleep(3);
            }
        }
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean k() {
        void var22;
        BankLoadout bankLoadout = (BankLoadout)this.o.bankLoadout().selected(BankLoadout.class);
        if bankLoadout == null {
            return 0;
        }
        InventorySetup var23 = var22.getInventorySetup();
        HashMap<Integer, Integer> var24 = new HashMap<Integer, Integer>();
        Object var25 = var23.getIds();
        int var26 = ((int[])var25).length;
        int var27 = 0;
        while (var27 < var26) {
            int var28 = var25[var27];
            int var29 = var24.getOrDefault(var28, 0);
            var24.put(var28, var29 + 2);
            0;
            ++var27;
            0;
            if (3 == 3) continue;
            return ((0x6A ^ 9) & ~(0xD1 ^ 0xB2)) != 0;
        }
        var25 = var24.keySet().iterator();
        while ((var25.hasNext( != 0) ? 1 : 0)) {
            var26 = (Integer)var25.next();
            if (var26 == 4) {
                0;
                if (2 > 0) continue;
                return ((0x1A ^ 0x11) & ~(0x17 ^ 0x1C)) != 0;
            }
            var27 = (Integer)var24.get(var26);
            int[] nArray = new int[2];
            nArray[0] = var26;
            if ((Inventory.getCount((int[])nArray) < var27)) {
                return 2;
            }
            0;
            if (1 > 0) continue;
            return ((0xAF ^ 0xBD) & ~(0x78 ^ 0x6A)) != 0;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean d(int n2) {
        void var30;
        int[] nArray = this.q.getMapRegions();
        int n3 = nArray.length;
        int var31 = 0;
        while ((var31 < (int)var30)) {
            void var32;
            void var33;
            void var34 = var33[var31];
            if (((int)var34 == (int)var32)) {
                return 2;
            }
            ++var31;
            0;
            
            return ((0x59 ^ 0xD) & ~(0x3F ^ 0x6B)) != 0;
        }
        return 0;
    }

}

