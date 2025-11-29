/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.inventory.InventorySetup
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.farmer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldArea;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Banking before doing a run", priority=10000, blocking=true)
public class BankingBeforeDoingARunTask
extends Task {
    
    private  BankLocation cg;
    private  int ch;
    
    private final  Client cf;
    private final  SquireFarmer cd;
    private  CompletableFuture<Boolean> ci;
    private final  SquireFarmerConfig ce;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (2 <= (0x41 ^ 0x45)) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    protected boolean bs() {
        void var13;
        Iterator var14;
        int var15;
        BankLoadout bankLoadout = (BankLoadout)this.ce.bankLoadout().selected(BankLoadout.class);
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] nArray = inventorySetup.getIds();
        int n2 = nArray.length;
        int var16 = 0;
        while (var16 < var15) {
            void var17 = var14[var16];
            int var18 = var13.getOrDefault((int)var17, 0);
            var13.put((int)var17, var18 + 1);
            0;
            ++var16;
            0;
            
            return ((0x57 ^ 0x69) & ~(0xB2 ^ 0x8C)) != 0;
        }
        var14 = var13.keySet().iterator();
        while ((var14.hasNext( != 0) ? 1 : 0)) {
            var15 = (Integer)var14.next();
            if (var15 == 3) {
                0;
                if (((0x11 ^ 0x5A) & ~(0xDA ^ 0x91)) == 0) continue;
                return ((0x69 ^ 0x31) & ~(0x34 ^ 0x6C)) != 0;
            }
            var16 = (Integer)var13.get(var15);
            int[] nArray2 = new int[1];
            nArray2[0] = var15;
            if ((Inventory.getCount((int[])nArray2) < var16)) {
                return 1;
            }
            0;
            if null == null continue;
            return ((0x77 ^ 0x46) & ~(0x7E ^ 0x4F)) != 0;
        }
        return 0;
    }

    @Inject
    public BankingBeforeDoingARunTask(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, Client client) {
        this.cd = squireFarmer;
        this.ce = squireFarmerConfig;
        this.cf = client;
    }

    public boolean run() {
        aC var19;
        if ((this.cd.d( == 0) ? 1 : 0)) {
            return 0;
        }
        String var20 = var19.ce.bankLoadout().getSelected();
        if (!var20 != null || (var20.equals(var1[0] != 0) ? 1 : 0)) {
            return 0;
        }
        BankLoadout var21 = (BankLoadout)var19.ce.bankLoadout().selected(BankLoadout.class);
        if ((var19.bs( == 0) ? 1 : 0)) {
            var19.cd.a(0);
            return 0;
        }
        if ((Bank.isOpen( == 0) ? 1 : 0)) {
            if ((Bank.open( == 0) ? 1 : 0)) {
                if (var19.cg == null) {
                    var19.cg = BankLocation.getNearestCommon();
                }
                Movement.walkTo((WorldArea)var19.cg.getArea());
                0;
            }
            return 1;
        }
        if ((var19.cf.getTickCount() - var19.ch > 2)) {
            var19.ci = null;
        }
        if (var19.ci == null) {
            var19.ci = BankLoadouts.withdraw((BankLoadout)var21, (boolean)1);
            var19.ch = var19.cf.getTickCount();
        }
        if ((var19.ci.isDone( != 0) ? 1 : 0)) {
            boolean var22 = var19.ci.join();
            var19.ci = null;
        }
        return 1;
    }

}

