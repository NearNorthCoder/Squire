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
import java.nio.charset.StandardCharsets;
import java.util.Base64;
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

        return String.valueOf(var1);
    }

    private static boolean llllIIllIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIIlIllllIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean bs() {
        void var2;
        Iterator var3;
        int var4;
        BankLoadout bankLoadout = (BankLoadout)this.ce.bankLoadout().selected(BankLoadout.class);
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] nArray = inventorySetup.getIds();
        int n2 = nArray.length;
        int var5 = llIIIIllIIIl[0];
        while (aC.llllIIlIllllll(var5, var4)) {
            void var6 = var3[var5];
            int var7 = var2.getOrDefault((int)var6, llIIIIllIIIl[0]);
            var2.put((int)var6, var7 + llIIIIllIIIl[1]);

            ++var5;

            if (2 >= 0) continue;
            return false;
        }
        var3 = var2.keySet().iterator();
        while (aC.llllIIlIllllII(var3.hasNext() ? 1 : 0)) {
            var4 = (Integer)var3.next();
            if (aC.llllIIllIIIIII(var4, llIIIIllIIIl[3])) {

                if (((0x11 ^ 0x5A) & ~(0xDA ^ 0x91)) == 0) continue;
                return false;
            }
            var5 = (Integer)var2.get(var4);
            int[] nArray2 = new int[llIIIIllIIIl[1]];
            nArray2[aC.llIIIIllIIIl[0]] = var4;
            if (aC.llllIIlIllllll(Inventory.getCount((int[])nArray2), var5)) {
                return llIIIIllIIIl[1];
            }

            return false;
        }
        return llIIIIllIIIl[0];
    }

    private static boolean llllIIlIlllIlI(int n2) {
        return n2 == 0;
    }

    @Inject
    public BankingBeforeDoingARunTask(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, Client client) {
        this.cd = squireFarmer;
        this.ce = squireFarmerConfig;
        this.cf = client;
    }

    private static void llllIIlIlllIII() {
        llIIIIllIIII = new String[llIIIIllIIIl[1]];
        aC.llIIIIllIIII[aC.llIIIIllIIIl[0]] = "None";
    }

    private static boolean llllIIlIllllII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        aC var8;
        if (aC.llllIIlIlllIlI(this.cd.d() ? 1 : 0)) {
            return llIIIIllIIIl[0];
        }
        String var9 = var8.ce.bankLoadout().getSelected();
        if (!aC.llllIIlIlllIll(var9) || aC.llllIIlIllllII(var9.equals(llIIIIllIIII[llIIIIllIIIl[0]]) ? 1 : 0)) {
            return llIIIIllIIIl[0];
        }
        BankLoadout var10 = (BankLoadout)var8.ce.bankLoadout().selected(BankLoadout.class);
        if (aC.llllIIlIlllIlI(var8.bs() ? 1 : 0)) {
            var8.cd.a(llIIIIllIIIl[0]);
            return llIIIIllIIIl[0];
        }
        if (aC.llllIIlIlllIlI(Bank.isOpen() ? 1 : 0)) {
            if (aC.llllIIlIlllIlI(Bank.open() ? 1 : 0)) {
                if (aC.llllIIlIllllIl(var8.cg)) {
                    var8.cg = BankLocation.getNearestCommon();
                }
                Movement.walkTo((WorldArea)var8.cg.getArea());

            }
            return llIIIIllIIIl[1];
        }
        if (aC.llllIIlIlllllI(var8.cf.getTickCount() - var8.ch, llIIIIllIIIl[2])) {
            var8.ci = null;
        }
        if (aC.llllIIlIllllIl(var8.ci)) {
            var8.ci = BankLoadouts.withdraw((BankLoadout)var10, (boolean)llIIIIllIIIl[1]);
            var8.ch = var8.cf.getTickCount();
        }
        if (aC.llllIIlIllllII(var8.ci.isDone() ? 1 : 0)) {
            boolean var11 = var8.ci.join();
            var8.ci = null;
        }
        return llIIIIllIIIl[1];
    }

    private static boolean llllIIlIlllllI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        aC.llllIIlIlllIIl();
        aC.llllIIlIlllIII();
    }

    private static boolean llllIIlIllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIIlIlllIll(Object object) {
        return object != null;
    }
}

