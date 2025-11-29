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
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.s_Unknown;
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

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=0x7FFFFFFF, blocking=true)
public class BankingTask
extends Task {
    private static /* synthetic */ int[] lIlIlllllIII;
    @Inject
    private /* synthetic */ Client q;
    @Inject
    private /* synthetic */ SquireCorpConfig o;
    private /* synthetic */ int r;
    @Inject
    private /* synthetic */ s a;
    private /* synthetic */ BankLocation t;
    @Inject
    private /* synthetic */ SquireCorp p;
    private /* synthetic */ CompletableFuture<Boolean> s;
    private static /* synthetic */ String[] lIlIllllIlll;

    private static boolean lllIIIlIlIlIII(Object object) {
        return object != null;
    }

    private static void lllIIIlIlIIIlI() {
        lIlIllllIlll = new String[lIlIlllllIII[5]];
        e.lIlIllllIlll[e.lIlIlllllIII[0]] = e."Teleport";
        e.lIlIllllIlll[e.lIlIlllllIII[2]] = e."Crafting cape";
    }

    private static boolean lllIIIlIlIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private boolean j() {
        e var24;
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lIlIllllIlll[lIlIlllllIII[2]]));
        if (e.lllIIIlIlIlIII(item2)) {
            item2.interact(lIlIllllIlll[lIlIlllllIII[0]]);
            return lIlIlllllIII[2];
        }
        if (e.lllIIIlIlIIllI(var24.t)) {
            var24.t = BankLocation.getNearestCommon();
        }
        Movement.walkTo((WorldArea)this.t.getArea());
        0;
        return lIlIlllllIII[2];
    }

    private static String lllIIIlIlIIIII(String var5, String var11) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIlIlllllIII[6]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIlIlllllIII[5], var21);
            return new String(var12.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    static {
        e.lllIIIlIlIIIll();
        e.lllIIIlIlIIIlI();
    }

    private static void lllIIIlIlIIIll() {
        lIlIlllllIII = new int[7];
        e.lIlIlllllIII[0] = (0x7E ^ 0x7A ^ (0x76 ^ 0x24)) & (0x94 ^ 0xC3 ^ 1 ^ -1);
        e.lIlIlllllIII[1] = 90 + 22 - 71 + 127 ^ 49 + 28 - -10 + 95;
        e.lIlIlllllIII[2] = 1;
        e.lIlIlllllIII[3] = 0x9A ^ 0x85 ^ (0xB0 ^ 0xBB);
        e.lIlIlllllIII[4] = -1;
        e.lIlIlllllIII[5] = 2;
        e.lIlIlllllIII[6] = 0x2F ^ 0x3A ^ (0x12 ^ 0xF);
    }

    private static boolean lllIIIlIlIIlII(int n2) {
        return n2 == 0;
    }

    private static String lllIIIlIlIIIIl(String var29, String var6) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var2 = var6.toCharArray();
        int var4 = lIlIlllllIII[0];
        char[] var3 = var29.toCharArray();
        int var14 = var3.length;
        int var7 = lIlIlllllIII[0];
        while (e.lllIIIlIlIlIIl(var7, var14)) {
            char var27 = var3[var7];
            var30.append((char)(var27 ^ var2[var4 % var2.length]));
            0;
            ++var4;
            ++var7;
            0;
            
            return null;
        }
        return String.valueOf(var30);
    }

    public boolean run() {
        e var16;
        if (e.lllIIIlIlIIlII(this.k() ? 1 : 0)) {
            this.p.a(lIlIlllllIII[0]);
            return lIlIlllllIII[0];
        }
        if (e.lllIIIlIlIIlII(var16.p.b() ? 1 : 0)) {
            return lIlIlllllIII[0];
        }
        BankLoadout var26 = (BankLoadout)var16.o.bankLoadout().selected(BankLoadout.class);
        if (e.lllIIIlIlIIlII(Bank.open() ? 1 : 0)) {
            return var16.j();
        }
        var16.a.v();
        if (e.lllIIIlIlIIlIl(var16.q.getTickCount() - var16.r, lIlIlllllIII[1])) {
            var16.s = null;
        }
        if (e.lllIIIlIlIIllI(var16.s)) {
            var16.s = BankLoadouts.withdraw((BankLoadout)var26, (boolean)lIlIlllllIII[2]);
            var16.r = var16.q.getTickCount();
        }
        if (e.lllIIIlIlIIlll(var16.s.isDone() ? 1 : 0)) {
            int n2 = var16.s.join().booleanValue();
            var16.s = null;
            if (e.lllIIIlIlIIlll(n2)) {
                var16.sleep(lIlIlllllIII[3]);
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
        void var15;
        BankLoadout bankLoadout = (BankLoadout)this.o.bankLoadout().selected(BankLoadout.class);
        if (e.lllIIIlIlIIllI(bankLoadout)) {
            return lIlIlllllIII[0];
        }
        InventorySetup var23 = var15.getInventorySetup();
        HashMap<Integer, Integer> var8 = new HashMap<Integer, Integer>();
        Object var19 = var23.getIds();
        int var13 = ((int[])var19).length;
        int var22 = lIlIlllllIII[0];
        while (e.lllIIIlIlIlIIl(var22, var13)) {
            int var10 = var19[var22];
            int var28 = var8.getOrDefault(var10, lIlIlllllIII[0]);
            var8.put(var10, var28 + lIlIlllllIII[2]);
            0;
            ++var22;
            0;
            if (3 == 3) continue;
            return false;
        }
        var19 = var8.keySet().iterator();
        while (e.lllIIIlIlIIlll(var19.hasNext() ? 1 : 0)) {
            var13 = (Integer)var19.next();
            if (e.lllIIIlIlIlIlI(var13, lIlIlllllIII[4])) {
                0;
                if (2 > 0) continue;
                return false;
            }
            var22 = (Integer)var8.get(var13);
            int[] nArray = new int[lIlIlllllIII[2]];
            nArray[e.lIlIlllllIII[0]] = var13;
            if (e.lllIIIlIlIlIIl(Inventory.getCount((int[])nArray), var22)) {
                return lIlIlllllIII[2];
            }
            0;
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
        void var20;
        int[] nArray = this.q.getMapRegions();
        int n3 = nArray.length;
        int var9 = lIlIlllllIII[0];
        while (e.lllIIIlIlIlIIl(var9, (int)var20)) {
            void var18;
            void var17;
            void var25 = var17[var9];
            if (e.lllIIIlIlIlIlI((int)var25, (int)var18)) {
                return lIlIlllllIII[2];
            }
            ++var9;
            0;
            if (3 >= 0) continue;
            return false;
        }
        return lIlIlllllIII[0];
    }

    private static boolean lllIIIlIlIIlll(int n2) {
        return n2 != 0;
    }
}

