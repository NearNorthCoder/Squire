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

@TaskDesc(name="Banking before doing a run", priority=10000, blocking=true)
public class aC
extends Task {
    private static /* synthetic */ String[] llIIIIllIIII;
    private /* synthetic */ BankLocation cg;
    private /* synthetic */ int ch;
    private static /* synthetic */ int[] llIIIIllIIIl;
    private final /* synthetic */ Client cf;
    private final /* synthetic */ SquireFarmer cd;
    private /* synthetic */ CompletableFuture<Boolean> ci;
    private final /* synthetic */ SquireFarmerConfig ce;

    private static String llllIIlIllIlll(String lllllllllllllllIlIlIlIlIlIlIllIl, String lllllllllllllllIlIlIlIlIlIlIIlll) {
        lllllllllllllllIlIlIlIlIlIlIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIlIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlIlIlIlIlIll = new StringBuilder();
        char[] lllllllllllllllIlIlIlIlIlIlIlIlI = lllllllllllllllIlIlIlIlIlIlIIlll.toCharArray();
        int lllllllllllllllIlIlIlIlIlIlIlIIl = llIIIIllIIIl[0];
        char[] lllllllllllllllIlIlIlIlIlIlIIIll = lllllllllllllllIlIlIlIlIlIlIllIl.toCharArray();
        int lllllllllllllllIlIlIlIlIlIlIIIlI = lllllllllllllllIlIlIlIlIlIlIIIll.length;
        int lllllllllllllllIlIlIlIlIlIlIIIIl = llIIIIllIIIl[0];
        while (aC.llllIIlIllllll(lllllllllllllllIlIlIlIlIlIlIIIIl, lllllllllllllllIlIlIlIlIlIlIIIlI)) {
            char lllllllllllllllIlIlIlIlIlIlIlllI = lllllllllllllllIlIlIlIlIlIlIIIll[lllllllllllllllIlIlIlIlIlIlIIIIl];
            lllllllllllllllIlIlIlIlIlIlIlIll.append((char)(lllllllllllllllIlIlIlIlIlIlIlllI ^ lllllllllllllllIlIlIlIlIlIlIlIlI[lllllllllllllllIlIlIlIlIlIlIlIIl % lllllllllllllllIlIlIlIlIlIlIlIlI.length]));
            0;
            ++lllllllllllllllIlIlIlIlIlIlIlIIl;
            ++lllllllllllllllIlIlIlIlIlIlIIIIl;
            0;
            if (2 <= (0x41 ^ 0x45)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIlIlIlIlIlIll);
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
        void lllllllllllllllIlIlIlIlIlIllllIl;
        Iterator lllllllllllllllIlIlIlIlIlIllllII;
        int lllllllllllllllIlIlIlIlIlIlllIll;
        BankLoadout bankLoadout = (BankLoadout)this.ce.bankLoadout().selected(BankLoadout.class);
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] nArray = inventorySetup.getIds();
        int n2 = nArray.length;
        int lllllllllllllllIlIlIlIlIlIlllIlI = llIIIIllIIIl[0];
        while (aC.llllIIlIllllll(lllllllllllllllIlIlIlIlIlIlllIlI, lllllllllllllllIlIlIlIlIlIlllIll)) {
            void lllllllllllllllIlIlIlIlIlIlllIIl = lllllllllllllllIlIlIlIlIlIllllII[lllllllllllllllIlIlIlIlIlIlllIlI];
            int lllllllllllllllIlIlIlIlIlIlllIII = lllllllllllllllIlIlIlIlIlIllllIl.getOrDefault((int)lllllllllllllllIlIlIlIlIlIlllIIl, llIIIIllIIIl[0]);
            lllllllllllllllIlIlIlIlIlIllllIl.put((int)lllllllllllllllIlIlIlIlIlIlllIIl, lllllllllllllllIlIlIlIlIlIlllIII + llIIIIllIIIl[1]);
            0;
            ++lllllllllllllllIlIlIlIlIlIlllIlI;
            0;
            if (2 >= 0) continue;
            return ((0x57 ^ 0x69) & ~(0xB2 ^ 0x8C)) != 0;
        }
        lllllllllllllllIlIlIlIlIlIllllII = lllllllllllllllIlIlIlIlIlIllllIl.keySet().iterator();
        while (aC.llllIIlIllllII(lllllllllllllllIlIlIlIlIlIllllII.hasNext() ? 1 : 0)) {
            lllllllllllllllIlIlIlIlIlIlllIll = (Integer)lllllllllllllllIlIlIlIlIlIllllII.next();
            if (aC.llllIIllIIIIII(lllllllllllllllIlIlIlIlIlIlllIll, llIIIIllIIIl[3])) {
                0;
                if (((0x11 ^ 0x5A) & ~(0xDA ^ 0x91)) == 0) continue;
                return ((0x69 ^ 0x31) & ~(0x34 ^ 0x6C)) != 0;
            }
            lllllllllllllllIlIlIlIlIlIlllIlI = (Integer)lllllllllllllllIlIlIlIlIlIllllIl.get(lllllllllllllllIlIlIlIlIlIlllIll);
            int[] nArray2 = new int[llIIIIllIIIl[1]];
            nArray2[aC.llIIIIllIIIl[0]] = lllllllllllllllIlIlIlIlIlIlllIll;
            if (aC.llllIIlIllllll(Inventory.getCount((int[])nArray2), lllllllllllllllIlIlIlIlIlIlllIlI)) {
                return llIIIIllIIIl[1];
            }
            0;
            if (null == null) continue;
            return ((0x77 ^ 0x46) & ~(0x7E ^ 0x4F)) != 0;
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
        aC lllllllllllllllIlIlIlIlIllIIllIl;
        if (aC.llllIIlIlllIlI(this.cd.d() ? 1 : 0)) {
            return llIIIIllIIIl[0];
        }
        String lllllllllllllllIlIlIlIlIllIIllII = lllllllllllllllIlIlIlIlIllIIllIl.ce.bankLoadout().getSelected();
        if (!aC.llllIIlIlllIll(lllllllllllllllIlIlIlIlIllIIllII) || aC.llllIIlIllllII(lllllllllllllllIlIlIlIlIllIIllII.equals(llIIIIllIIII[llIIIIllIIIl[0]]) ? 1 : 0)) {
            return llIIIIllIIIl[0];
        }
        BankLoadout lllllllllllllllIlIlIlIlIllIIlIll = (BankLoadout)lllllllllllllllIlIlIlIlIllIIllIl.ce.bankLoadout().selected(BankLoadout.class);
        if (aC.llllIIlIlllIlI(lllllllllllllllIlIlIlIlIllIIllIl.bs() ? 1 : 0)) {
            lllllllllllllllIlIlIlIlIllIIllIl.cd.a(llIIIIllIIIl[0]);
            return llIIIIllIIIl[0];
        }
        if (aC.llllIIlIlllIlI(Bank.isOpen() ? 1 : 0)) {
            if (aC.llllIIlIlllIlI(Bank.open() ? 1 : 0)) {
                if (aC.llllIIlIllllIl(lllllllllllllllIlIlIlIlIllIIllIl.cg)) {
                    lllllllllllllllIlIlIlIlIllIIllIl.cg = BankLocation.getNearestCommon();
                }
                Movement.walkTo((WorldArea)lllllllllllllllIlIlIlIlIllIIllIl.cg.getArea());
                0;
            }
            return llIIIIllIIIl[1];
        }
        if (aC.llllIIlIlllllI(lllllllllllllllIlIlIlIlIllIIllIl.cf.getTickCount() - lllllllllllllllIlIlIlIlIllIIllIl.ch, llIIIIllIIIl[2])) {
            lllllllllllllllIlIlIlIlIllIIllIl.ci = null;
        }
        if (aC.llllIIlIllllIl(lllllllllllllllIlIlIlIlIllIIllIl.ci)) {
            lllllllllllllllIlIlIlIlIllIIllIl.ci = BankLoadouts.withdraw((BankLoadout)lllllllllllllllIlIlIlIlIllIIlIll, (boolean)llIIIIllIIIl[1]);
            lllllllllllllllIlIlIlIlIllIIllIl.ch = lllllllllllllllIlIlIlIlIllIIllIl.cf.getTickCount();
        }
        if (aC.llllIIlIllllII(lllllllllllllllIlIlIlIlIllIIllIl.ci.isDone() ? 1 : 0)) {
            boolean lllllllllllllllIlIlIlIlIllIIlIlI = lllllllllllllllIlIlIlIlIllIIllIl.ci.join();
            lllllllllllllllIlIlIlIlIllIIllIl.ci = null;
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

