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

import gg.squire.corp.tasks.SHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import gg.squire.corp.SquireCorpConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lllIIIlIlIlIII(Object object) {
        return object != null;
    }

    private static void lllIIIlIlIIIlI() {
        lIlIllllIlll = new String[lIlIlllllIII[5]];
        e.lIlIllllIlll[e.lIlIlllllIII[0]] = "Teleport";
        e.lIlIllllIlll[e.lIlIlllllIII[2]] = "Crafting cape";
    }

    private static boolean lllIIIlIlIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private boolean j() {
        e var1;
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lIlIllllIlll[lIlIlllllIII[2]]));
        if (e.lllIIIlIlIlIII(item2)) {
            item2.interact(lIlIllllIlll[lIlIlllllIII[0]]);
            return lIlIlllllIII[2];
        }
        if (e.lllIIIlIlIIllI(var1.t)) {
            var1.t = BankLocation.getNearestCommon();
        }
        Movement.walkTo((WorldArea)this.t.getArea());

        return lIlIlllllIII[2];
    }

    static {
        e.lllIIIlIlIIIll();
        e.lllIIIlIlIIIlI();
    }

    private static boolean lllIIIlIlIIlII(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var2);
    }

    public boolean run() {
        e var3;
        if (e.lllIIIlIlIIlII(this.k() ? 1 : 0)) {
            this.p.a(lIlIlllllIII[0]);
            return lIlIlllllIII[0];
        }
        if (e.lllIIIlIlIIlII(var3.p.b() ? 1 : 0)) {
            return lIlIlllllIII[0];
        }
        BankLoadout var4 = (BankLoadout)var3.o.bankLoadout().selected(BankLoadout.class);
        if (e.lllIIIlIlIIlII(Bank.open() ? 1 : 0)) {
            return var3.j();
        }
        var3.a.v();
        if (e.lllIIIlIlIIlIl(var3.q.getTickCount() - var3.r, lIlIlllllIII[1])) {
            var3.s = null;
        }
        if (e.lllIIIlIlIIllI(var3.s)) {
            var3.s = BankLoadouts.withdraw((BankLoadout)var4, (boolean)lIlIlllllIII[2]);
            var3.r = var3.q.getTickCount();
        }
        if (e.lllIIIlIlIIlll(var3.s.isDone() ? 1 : 0)) {
            int n2 = var3.s.join().booleanValue();
            var3.s = null;
            if (e.lllIIIlIlIIlll(n2)) {
                var3.sleep(lIlIlllllIII[3]);
            }
        }
        return lIlIlllllIII[2];
    }

    private static boolean lllIIIlIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIIIlIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean k() {
        void var5;
        BankLoadout bankLoadout = (BankLoadout)this.o.bankLoadout().selected(BankLoadout.class);
        if (e.lllIIIlIlIIllI(bankLoadout)) {
            return lIlIlllllIII[0];
        }
        InventorySetup var6 = var5.getInventorySetup();
        HashMap<Integer, Integer> var7 = new HashMap<Integer, Integer>();
        Object var8 = var6.getIds();
        int var9 = ((int[])var8).length;
        int var10 = lIlIlllllIII[0];
        while (e.lllIIIlIlIlIIl(var10, var9)) {
            int var11 = var8[var10];
            int var12 = var7.getOrDefault(var11, lIlIlllllIII[0]);
            var7.put(var11, var12 + lIlIlllllIII[2]);

            ++var10;

            if (3 == 3) continue;
            return false;
        }
        var8 = var7.keySet().iterator();
        while (e.lllIIIlIlIIlll(var8.hasNext() ? 1 : 0)) {
            var9 = (Integer)var8.next();
            if (e.lllIIIlIlIlIlI(var9, lIlIlllllIII[4])) {

                if (2 > 0) continue;
                return false;
            }
            var10 = (Integer)var7.get(var9);
            int[] nArray = new int[lIlIlllllIII[2]];
            nArray[e.lIlIlllllIII[0]] = var9;
            if (e.lllIIIlIlIlIIl(Inventory.getCount((int[])nArray), var10)) {
                return lIlIlllllIII[2];
            }

            if (1 > 0) continue;
            return false;
        }
        return lIlIlllllIII[0];
    }

    private static boolean lllIIIlIlIIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean d(int n2) {
        void var13;
        int[] nArray = this.q.getMapRegions();
        int n3 = nArray.length;
        int var14 = lIlIlllllIII[0];
        while (e.lllIIIlIlIlIIl(var14, (int)var13)) {
            void var15;
            void var16;
            void var17 = var16[var14];
            if (e.lllIIIlIlIlIlI((int)var17, (int)var15)) {
                return lIlIlllllIII[2];
            }
            ++var14;

            if (3 >= 0) continue;
            return false;
        }
        return lIlIlllllIII[0];
    }

    private static boolean lllIIIlIlIIlll(int n2) {
        return n2 != 0;
    }
}

