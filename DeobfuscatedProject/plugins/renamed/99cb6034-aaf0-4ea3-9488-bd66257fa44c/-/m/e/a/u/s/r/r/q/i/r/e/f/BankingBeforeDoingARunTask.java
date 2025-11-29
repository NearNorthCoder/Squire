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
package -.m.e.a.u.s.r.r.q.i.r.e.f;

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

/* TASK: Banking before doing a run -> BankingbeforedoingarunTask */
@TaskDesc(name="Banking before doing a run", priority=10000, blocking=true)
public class BankingBeforeDoingARunTask
extends Task {
    private static /* synthetic */ String[] llIIIIllIIII;
    private /* synthetic */ BankLocation cg;
    private /* synthetic */ int ch;
    private static /* synthetic */ int[] llIIIIllIIIl;
    private final /* synthetic */ Client cf;
    private final /* synthetic */ SquireFarmer cd;
    private /* synthetic */ CompletableFuture<Boolean> ci;
    private final /* synthetic */ SquireFarmerConfig ce;

    private static String llllIIlIllIlll(String var18, String var17) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var9 = var17.toCharArray();
        int var3 = llIIIIllIIIl[0];
        char[] var12 = var18.toCharArray();
        int var6 = var12.length;
        int var4 = llIIIIllIIIl[0];
        while (aC.llllIIlIllllll(var4, var6)) {
            char var13 = var12[var4];
            var7.append((char)(var13 ^ var9[var3 % var9.length]));
            0;
            ++var3;
            ++var4;
            0;
            if (2 <= (0x41 ^ 0x45)) continue;
            return null;
        }
        return String.valueOf(var7);
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
        void var16;
        Iterator var8;
        int var14;
        BankLoadout bankLoadout = (BankLoadout)this.ce.bankLoadout().selected(BankLoadout.class);
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] nArray = inventorySetup.getIds();
        int n2 = nArray.length;
        int var11 = llIIIIllIIIl[0];
        while (aC.llllIIlIllllll(var11, var14)) {
            void var1 = var8[var11];
            int var10 = var16.getOrDefault((int)var1, llIIIIllIIIl[0]);
            var16.put((int)var1, var10 + llIIIIllIIIl[1]);
            0;
            ++var11;
            0;
            if (2 >= 0) continue;
            return false;
        }
        var8 = var16.keySet().iterator();
        while (aC.llllIIlIllllII(var8.hasNext() ? 1 : 0)) {
            var14 = (Integer)var8.next();
            if (aC.llllIIllIIIIII(var14, llIIIIllIIIl[3])) {
                0;
                if (((0x11 ^ 0x5A) & ~(0xDA ^ 0x91)) == 0) continue;
                return false;
            }
            var11 = (Integer)var16.get(var14);
            int[] nArray2 = new int[llIIIIllIIIl[1]];
            nArray2[aC.llIIIIllIIIl[0]] = var14;
            if (aC.llllIIlIllllll(Inventory.getCount((int[])nArray2), var11)) {
                return llIIIIllIIIl[1];
            }
            0;
            
            return false;
        }
        return llIIIIllIIIl[0];
    }

    private static boolean llllIIlIlllIlI(int n2) {
        return n2 == 0;
    }

    private static void llllIIlIlllIIl() {
        llIIIIllIIIl = new int[4];
        aC.llIIIIllIIIl[0] = (88 + 36 - 11 + 20 ^ 176 + 44 - 62 + 36) & (0xA4 ^ 0xAA ^ (0x3F ^ 0x76) ^ -1);
        aC.llIIIIllIIIl[1] = 1;
        aC.llIIIIllIIIl[2] = 0x62 ^ 0x57 ^ (0xCF ^ 0xC6);
        aC.llIIIIllIIIl[3] = -1;
    }

    @Inject
    public aC(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, Client client) {
        this.cd = squireFarmer;
        this.ce = squireFarmerConfig;
        this.cf = client;
    }

    private static void llllIIlIlllIII() {
        llIIIIllIIII = new String[llIIIIllIIIl[1]];
        aC.llIIIIllIIII[aC.llIIIIllIIIl[0]] = aC."None";
    }

    private static boolean llllIIlIllllII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        aC var5;
        if (aC.llllIIlIlllIlI(this.cd.d() ? 1 : 0)) {
            return llIIIIllIIIl[0];
        }
        String var15 = var5.ce.bankLoadout().getSelected();
        if (!aC.llllIIlIlllIll(var15) || aC.llllIIlIllllII(var15.equals(llIIIIllIIII[llIIIIllIIIl[0]]) ? 1 : 0)) {
            return llIIIIllIIIl[0];
        }
        BankLoadout var2 = (BankLoadout)var5.ce.bankLoadout().selected(BankLoadout.class);
        if (aC.llllIIlIlllIlI(var5.bs() ? 1 : 0)) {
            var5.cd.a(llIIIIllIIIl[0]);
            return llIIIIllIIIl[0];
        }
        if (aC.llllIIlIlllIlI(Bank.isOpen() ? 1 : 0)) {
            if (aC.llllIIlIlllIlI(Bank.open() ? 1 : 0)) {
                if (aC.llllIIlIllllIl(var5.cg)) {
                    var5.cg = BankLocation.getNearestCommon();
                }
                Movement.walkTo((WorldArea)var5.cg.getArea());
                0;
            }
            return llIIIIllIIIl[1];
        }
        if (aC.llllIIlIlllllI(var5.cf.getTickCount() - var5.ch, llIIIIllIIIl[2])) {
            var5.ci = null;
        }
        if (aC.llllIIlIllllIl(var5.ci)) {
            var5.ci = BankLoadouts.withdraw((BankLoadout)var2, (boolean)llIIIIllIIIl[1]);
            var5.ch = var5.cf.getTickCount();
        }
        if (aC.llllIIlIllllII(var5.ci.isDone() ? 1 : 0)) {
            boolean lllllllllllllllIlIlIlIlIllIIlIlI = var5.ci.join();
            var5.ci = null;
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

