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
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b_Unknown;
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

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=50, blocking=true)
public class BankingTask
extends Task {
    private /* synthetic */ Client aj;
    private /* synthetic */ int ah;
    private final /* synthetic */ SquireSepulchre af;
    private /* synthetic */ CompletableFuture<Boolean> ag;
    private /* synthetic */ Player ai;
    private static /* synthetic */ int[] lllIIIIIIIII;
    private final /* synthetic */ SquireSepulchreConfig ae;
    private static /* synthetic */ String[] llIlllllllll;

    public boolean run() {
        N var4;
        this.ai = Players.getLocal();
        if (N.lIIIIllllllllll(this.ai)) {
            return lllIIIIIIIII[0];
        }
        if (N.lIIIlIIIIIIIIII(b.B.contains((Locatable)var4.ai) ? 1 : 0)) {
            return lllIIIIIIIII[0];
        }
        if (N.lIIIlIIIIIIIIIl(var4.af.j().matchesInventory() ? 1 : 0)) {
            System.out.println(llIlllllllll[lllIIIIIIIII[0]]);
            return lllIIIIIIIII[0];
        }
        if (N.lIIIlIIIIIIIIII(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return lllIIIIIIIII[1];
        }
        this.af.j().withdraw();
        0;
        this.sleep(lllIIIIIIIII[2]);
        return lllIIIIIIIII[1];
    }

    private static String lIIIIllllllllII(String var12, String var8) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lllIIIIIIIII[4], var11);
            return new String(var1.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Inject
    public N(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.ag = null;
        this.ae = squireSepulchreConfig;
        this.af = squireSepulchre;
    }

    private static void lIIIIlllllllllI() {
        lllIIIIIIIII = new int[5];
        N.lllIIIIIIIII[0] = (17 + 72 - 53 + 96 ^ 27 + 36 - 9 + 95) & (127 + 1 - 100 + 104 ^ 96 + 41 - 101 + 113 ^ -1);
        N.lllIIIIIIIII[1] = 1;
        N.lllIIIIIIIII[2] = 0x2C ^ 0x2A;
        N.lllIIIIIIIII[3] = -1;
        N.lllIIIIIIIII[4] = 2;
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
        void var6;
        Iterator var2;
        int var3;
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] nArray = inventorySetup.getIds();
        int n2 = nArray.length;
        int var7 = lllIIIIIIIII[0];
        while (N.lIIIlIIIIIIIIlI(var7, var3)) {
            void var9 = var2[var7];
            int var10 = var6.getOrDefault((int)var9, lllIIIIIIIII[0]);
            var6.put((int)var9, var10 + lllIIIIIIIII[1]);
            0;
            ++var7;
            0;
            if (2 <= 2) continue;
            return false;
        }
        var2 = var6.keySet().iterator();
        while (N.lIIIlIIIIIIIIIl(var2.hasNext() ? 1 : 0)) {
            var3 = (Integer)var2.next();
            if (N.lIIIlIIIIIIIIll(var3, lllIIIIIIIII[3])) {
                0;
                if (1 == 1) continue;
                return ((0x84 ^ 0x90 ^ (0xA0 ^ 0x92)) & (37 + 125 - 79 + 45 ^ 4 + 78 - -54 + 30 ^ -1)) != 0;
            }
            var7 = (Integer)var6.get(var3);
            int[] nArray2 = new int[lllIIIIIIIII[1]];
            nArray2[N.lllIIIIIIIII[0]] = var3;
            if (N.lIIIlIIIIIIIIlI(Inventory.getCount((int[])nArray2), var7)) {
                System.out.println(var3);
                return lllIIIIIIIII[1];
            }
            0;
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
        N.llIlllllllll[N.lllIIIIIIIII[0]] = N."no need to bank";
    }

    private static boolean lIIIlIIIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

