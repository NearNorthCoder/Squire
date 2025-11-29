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

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.s;
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
public class e
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
        e lllllllllllllllIllIIIllIllllllll;
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lIlIllllIlll[lIlIlllllIII[2]]));
        if (e.lllIIIlIlIlIII(item2)) {
            item2.interact(lIlIllllIlll[lIlIlllllIII[0]]);
            return lIlIlllllIII[2];
        }
        if (e.lllIIIlIlIIllI(lllllllllllllllIllIIIllIllllllll.t)) {
            lllllllllllllllIllIIIllIllllllll.t = BankLocation.getNearestCommon();
        }
        Movement.walkTo((WorldArea)this.t.getArea());
        0;
        return lIlIlllllIII[2];
    }

    private static String lllIIIlIlIIIII(String lllllllllllllllIllIIIllIllIllIII, String lllllllllllllllIllIIIllIllIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIIIllIllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIllIllIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIlllllIII[6]), "DES");
            Cipher lllllllllllllllIllIIIllIllIllIlI = Cipher.getInstance("DES");
            lllllllllllllllIllIIIllIllIllIlI.init(lIlIlllllIII[5], lllllllllllllllIllIIIllIllIllIll);
            return new String(lllllllllllllllIllIIIllIllIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIllIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIllIllIllIIl) {
            lllllllllllllllIllIIIllIllIllIIl.printStackTrace();
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

    private static String lllIIIlIlIIIIl(String lllllllllllllllIllIIIllIllIIIIll, String lllllllllllllllIllIIIllIllIIIIlI) {
        lllllllllllllllIllIIIllIllIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIllIllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIllIllIIIllI = new StringBuilder();
        char[] lllllllllllllllIllIIIllIllIIIlIl = lllllllllllllllIllIIIllIllIIIIlI.toCharArray();
        int lllllllllllllllIllIIIllIllIIIlII = lIlIlllllIII[0];
        char[] lllllllllllllllIllIIIllIlIlllllI = lllllllllllllllIllIIIllIllIIIIll.toCharArray();
        int lllllllllllllllIllIIIllIlIllllIl = lllllllllllllllIllIIIllIlIlllllI.length;
        int lllllllllllllllIllIIIllIlIllllII = lIlIlllllIII[0];
        while (e.lllIIIlIlIlIIl(lllllllllllllllIllIIIllIlIllllII, lllllllllllllllIllIIIllIlIllllIl)) {
            char lllllllllllllllIllIIIllIllIIlIIl = lllllllllllllllIllIIIllIlIlllllI[lllllllllllllllIllIIIllIlIllllII];
            lllllllllllllllIllIIIllIllIIIllI.append((char)(lllllllllllllllIllIIIllIllIIlIIl ^ lllllllllllllllIllIIIllIllIIIlIl[lllllllllllllllIllIIIllIllIIIlII % lllllllllllllllIllIIIllIllIIIlIl.length]));
            0;
            ++lllllllllllllllIllIIIllIllIIIlII;
            ++lllllllllllllllIllIIIllIlIllllII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIllIllIIIllI);
    }

    public boolean run() {
        e lllllllllllllllIllIIIlllIIIIIlII;
        if (e.lllIIIlIlIIlII(this.k() ? 1 : 0)) {
            this.p.a(lIlIlllllIII[0]);
            return lIlIlllllIII[0];
        }
        if (e.lllIIIlIlIIlII(lllllllllllllllIllIIIlllIIIIIlII.p.b() ? 1 : 0)) {
            return lIlIlllllIII[0];
        }
        BankLoadout lllllllllllllllIllIIIlllIIIIIIll = (BankLoadout)lllllllllllllllIllIIIlllIIIIIlII.o.bankLoadout().selected(BankLoadout.class);
        if (e.lllIIIlIlIIlII(Bank.open() ? 1 : 0)) {
            return lllllllllllllllIllIIIlllIIIIIlII.j();
        }
        lllllllllllllllIllIIIlllIIIIIlII.a.v();
        if (e.lllIIIlIlIIlIl(lllllllllllllllIllIIIlllIIIIIlII.q.getTickCount() - lllllllllllllllIllIIIlllIIIIIlII.r, lIlIlllllIII[1])) {
            lllllllllllllllIllIIIlllIIIIIlII.s = null;
        }
        if (e.lllIIIlIlIIllI(lllllllllllllllIllIIIlllIIIIIlII.s)) {
            lllllllllllllllIllIIIlllIIIIIlII.s = BankLoadouts.withdraw((BankLoadout)lllllllllllllllIllIIIlllIIIIIIll, (boolean)lIlIlllllIII[2]);
            lllllllllllllllIllIIIlllIIIIIlII.r = lllllllllllllllIllIIIlllIIIIIlII.q.getTickCount();
        }
        if (e.lllIIIlIlIIlll(lllllllllllllllIllIIIlllIIIIIlII.s.isDone() ? 1 : 0)) {
            int n2 = lllllllllllllllIllIIIlllIIIIIlII.s.join().booleanValue();
            lllllllllllllllIllIIIlllIIIIIlII.s = null;
            if (e.lllIIIlIlIIlll(n2)) {
                lllllllllllllllIllIIIlllIIIIIlII.sleep(lIlIlllllIII[3]);
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
        void lllllllllllllllIllIIIllIllllIIll;
        BankLoadout bankLoadout = (BankLoadout)this.o.bankLoadout().selected(BankLoadout.class);
        if (e.lllIIIlIlIIllI(bankLoadout)) {
            return lIlIlllllIII[0];
        }
        InventorySetup lllllllllllllllIllIIIllIllllIIlI = lllllllllllllllIllIIIllIllllIIll.getInventorySetup();
        HashMap<Integer, Integer> lllllllllllllllIllIIIllIllllIIIl = new HashMap<Integer, Integer>();
        Object lllllllllllllllIllIIIllIllllIIII = lllllllllllllllIllIIIllIllllIIlI.getIds();
        int lllllllllllllllIllIIIllIlllIllll = ((int[])lllllllllllllllIllIIIllIllllIIII).length;
        int lllllllllllllllIllIIIllIlllIlllI = lIlIlllllIII[0];
        while (e.lllIIIlIlIlIIl(lllllllllllllllIllIIIllIlllIlllI, lllllllllllllllIllIIIllIlllIllll)) {
            int lllllllllllllllIllIIIllIlllIllIl = lllllllllllllllIllIIIllIllllIIII[lllllllllllllllIllIIIllIlllIlllI];
            int lllllllllllllllIllIIIllIlllIllII = lllllllllllllllIllIIIllIllllIIIl.getOrDefault(lllllllllllllllIllIIIllIlllIllIl, lIlIlllllIII[0]);
            lllllllllllllllIllIIIllIllllIIIl.put(lllllllllllllllIllIIIllIlllIllIl, lllllllllllllllIllIIIllIlllIllII + lIlIlllllIII[2]);
            0;
            ++lllllllllllllllIllIIIllIlllIlllI;
            0;
            if (3 == 3) continue;
            return ((0x6A ^ 9) & ~(0xD1 ^ 0xB2)) != 0;
        }
        lllllllllllllllIllIIIllIllllIIII = lllllllllllllllIllIIIllIllllIIIl.keySet().iterator();
        while (e.lllIIIlIlIIlll(lllllllllllllllIllIIIllIllllIIII.hasNext() ? 1 : 0)) {
            lllllllllllllllIllIIIllIlllIllll = (Integer)lllllllllllllllIllIIIllIllllIIII.next();
            if (e.lllIIIlIlIlIlI(lllllllllllllllIllIIIllIlllIllll, lIlIlllllIII[4])) {
                0;
                if (2 > 0) continue;
                return ((0x1A ^ 0x11) & ~(0x17 ^ 0x1C)) != 0;
            }
            lllllllllllllllIllIIIllIlllIlllI = (Integer)lllllllllllllllIllIIIllIllllIIIl.get(lllllllllllllllIllIIIllIlllIllll);
            int[] nArray = new int[lIlIlllllIII[2]];
            nArray[e.lIlIlllllIII[0]] = lllllllllllllllIllIIIllIlllIllll;
            if (e.lllIIIlIlIlIIl(Inventory.getCount((int[])nArray), lllllllllllllllIllIIIllIlllIlllI)) {
                return lIlIlllllIII[2];
            }
            0;
            if (1 > 0) continue;
            return ((0xAF ^ 0xBD) & ~(0x78 ^ 0x6A)) != 0;
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
        void lllllllllllllllIllIIIllIlllIIIlI;
        int[] nArray = this.q.getMapRegions();
        int n3 = nArray.length;
        int lllllllllllllllIllIIIllIlllIIIIl = lIlIlllllIII[0];
        while (e.lllIIIlIlIlIIl(lllllllllllllllIllIIIllIlllIIIIl, (int)lllllllllllllllIllIIIllIlllIIIlI)) {
            void lllllllllllllllIllIIIllIlllIIlII;
            void lllllllllllllllIllIIIllIlllIIIll;
            void lllllllllllllllIllIIIllIlllIIIII = lllllllllllllllIllIIIllIlllIIIll[lllllllllllllllIllIIIllIlllIIIIl];
            if (e.lllIIIlIlIlIlI((int)lllllllllllllllIllIIIllIlllIIIII, (int)lllllllllllllllIllIIIllIlllIIlII)) {
                return lIlIlllllIII[2];
            }
            ++lllllllllllllllIllIIIllIlllIIIIl;
            0;
            if (3 >= 0) continue;
            return ((0x59 ^ 0xD) & ~(0x3F ^ 0x6B)) != 0;
        }
        return lIlIlllllIII[0];
    }

    private static boolean lllIIIlIlIIlll(int n2) {
        return n2 != 0;
    }
}

