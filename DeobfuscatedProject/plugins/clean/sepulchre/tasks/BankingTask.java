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
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        N var1;
        this.ai = Players.getLocal();
        if (N.lIIIIllllllllll(this.ai)) {
            return lllIIIIIIIII[0];
        }
        if (N.lIIIlIIIIIIIIII(b.B.contains((Locatable)var1.ai) ? 1 : 0)) {
            return lllIIIIIIIII[0];
        }
        if (N.lIIIlIIIIIIIIIl(var1.af.j().matchesInventory() ? 1 : 0)) {
            System.out.println(llIlllllllll[lllIIIIIIIII[0]]);
            return lllIIIIIIIII[0];
        }
        if (N.lIIIlIIIIIIIIII(Bank.isOpen() ? 1 : 0)) {
            Bank.open();

            return lllIIIIIIIII[1];
        }
        this.af.j().withdraw();

        this.sleep(lllIIIIIIIII[2]);
        return lllIIIIIIIII[1];
    }

    @Inject
    public BankingTask(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.ag = null;
        this.ae = squireSepulchreConfig;
        this.af = squireSepulchre;
    }

    private static boolean lIIIlIIIIIIIIII(int n2) {
        return n2 == 0;
    }

    static {
        N.lIIIIlllllllllI();
        N.lIIIIllllllllIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(BankLoadout bankLoadout) {
        void var2;
        Iterator var3;
        int var4;
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] nArray = inventorySetup.getIds();
        int n2 = nArray.length;
        int var5 = lllIIIIIIIII[0];
        while (N.lIIIlIIIIIIIIlI(var5, var4)) {
            void var6 = var3[var5];
            int var7 = var2.getOrDefault((int)var6, lllIIIIIIIII[0]);
            var2.put((int)var6, var7 + lllIIIIIIIII[1]);

            ++var5;

            if (2 <= 2) continue;
            return false;
        }
        var3 = var2.keySet().iterator();
        while (N.lIIIlIIIIIIIIIl(var3.hasNext() ? 1 : 0)) {
            var4 = (Integer)var3.next();
            if (N.lIIIlIIIIIIIIll(var4, lllIIIIIIIII[3])) {

                if (1 == 1) continue;
                return ((0x84 ^ 0x90 ^ (0xA0 ^ 0x92)) & (37 + 125 - 79 + 45 ^ 4 + 78 - -54 + 30 ^ -1)) != 0;
            }
            var5 = (Integer)var2.get(var4);
            int[] nArray2 = new int[lllIIIIIIIII[1]];
            nArray2[N.lllIIIIIIIII[0]] = var4;
            if (N.lIIIlIIIIIIIIlI(Inventory.getCount((int[])nArray2), var5)) {
                System.out.println(var4);
                return lllIIIIIIIII[1];
            }

            if (3 >= 0) continue;
            return false;
        }
        return lllIIIIIIIII[0];
    }

    private static boolean lIIIIllllllllll(Object object) {
        return object == null;
    }

    private static boolean lIIIlIIIIIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlIIIIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIIIIllllllllIl() {
        llIlllllllll = new String[lllIIIIIIIII[1]];
        N.llIlllllllll[N.lllIIIIIIIII[0]] = "no need to bank";
    }

    private static boolean lIIIlIIIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

