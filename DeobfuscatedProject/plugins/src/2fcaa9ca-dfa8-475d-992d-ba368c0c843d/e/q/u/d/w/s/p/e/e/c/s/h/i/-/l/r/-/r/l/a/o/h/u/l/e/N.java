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
public class N
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
        N lllllllllllllllIIlllIIllllIIlIlI;
        this.ai = Players.getLocal();
        if (N.lIIIIllllllllll(this.ai)) {
            return lllIIIIIIIII[0];
        }
        if (N.lIIIlIIIIIIIIII(b.B.contains((Locatable)lllllllllllllllIIlllIIllllIIlIlI.ai) ? 1 : 0)) {
            return lllIIIIIIIII[0];
        }
        if (N.lIIIlIIIIIIIIIl(lllllllllllllllIIlllIIllllIIlIlI.af.j().matchesInventory() ? 1 : 0)) {
            System.out.println(llIlllllllll[lllIIIIIIIII[0]]);
            return lllIIIIIIIII[0];
        }
        if (N.lIIIlIIIIIIIIII(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            "".length();
            return lllIIIIIIIII[1];
        }
        this.af.j().withdraw();
        "".length();
        this.sleep(lllIIIIIIIII[2]);
        return lllIIIIIIIII[1];
    }

    private static String lIIIIllllllllII(String lllllllllllllllIIlllIIlllIllIIlI, String lllllllllllllllIIlllIIlllIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlllIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlllIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIlllIllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIlllIllIlII.init(lllIIIIIIIII[4], lllllllllllllllIIlllIIlllIllIlIl);
            return new String(lllllllllllllllIIlllIIlllIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIlllIllIIll) {
            lllllllllllllllIIlllIIlllIllIIll.printStackTrace();
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
        N.lllIIIIIIIII[0] = (17 + 72 - 53 + 96 ^ 27 + 36 - 9 + 95) & (127 + 1 - 100 + 104 ^ 96 + 41 - 101 + 113 ^ -" ".length());
        N.lllIIIIIIIII[1] = " ".length();
        N.lllIIIIIIIII[2] = 0x2C ^ 0x2A;
        N.lllIIIIIIIII[3] = -" ".length();
        N.lllIIIIIIIII[4] = "  ".length();
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
        void lllllllllllllllIIlllIIlllIllllll;
        Iterator lllllllllllllllIIlllIIlllIlllllI;
        int lllllllllllllllIIlllIIlllIllllIl;
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] nArray = inventorySetup.getIds();
        int n2 = nArray.length;
        int lllllllllllllllIIlllIIlllIllllII = lllIIIIIIIII[0];
        while (N.lIIIlIIIIIIIIlI(lllllllllllllllIIlllIIlllIllllII, lllllllllllllllIIlllIIlllIllllIl)) {
            void lllllllllllllllIIlllIIlllIlllIll = lllllllllllllllIIlllIIlllIlllllI[lllllllllllllllIIlllIIlllIllllII];
            int lllllllllllllllIIlllIIlllIlllIlI = lllllllllllllllIIlllIIlllIllllll.getOrDefault((int)lllllllllllllllIIlllIIlllIlllIll, lllIIIIIIIII[0]);
            lllllllllllllllIIlllIIlllIllllll.put((int)lllllllllllllllIIlllIIlllIlllIll, lllllllllllllllIIlllIIlllIlllIlI + lllIIIIIIIII[1]);
            "".length();
            ++lllllllllllllllIIlllIIlllIllllII;
            "".length();
            if ("  ".length() <= "  ".length()) continue;
            return ((0x40 ^ 0x17) & ~(0x10 ^ 0x47)) != 0;
        }
        lllllllllllllllIIlllIIlllIlllllI = lllllllllllllllIIlllIIlllIllllll.keySet().iterator();
        while (N.lIIIlIIIIIIIIIl(lllllllllllllllIIlllIIlllIlllllI.hasNext() ? 1 : 0)) {
            lllllllllllllllIIlllIIlllIllllIl = (Integer)lllllllllllllllIIlllIIlllIlllllI.next();
            if (N.lIIIlIIIIIIIIll(lllllllllllllllIIlllIIlllIllllIl, lllIIIIIIIII[3])) {
                "".length();
                if (" ".length() == " ".length()) continue;
                return ((0x84 ^ 0x90 ^ (0xA0 ^ 0x92)) & (37 + 125 - 79 + 45 ^ 4 + 78 - -54 + 30 ^ -" ".length())) != 0;
            }
            lllllllllllllllIIlllIIlllIllllII = (Integer)lllllllllllllllIIlllIIlllIllllll.get(lllllllllllllllIIlllIIlllIllllIl);
            int[] nArray2 = new int[lllIIIIIIIII[1]];
            nArray2[N.lllIIIIIIIII[0]] = lllllllllllllllIIlllIIlllIllllIl;
            if (N.lIIIlIIIIIIIIlI(Inventory.getCount((int[])nArray2), lllllllllllllllIIlllIIlllIllllII)) {
                System.out.println(lllllllllllllllIIlllIIlllIllllIl);
                return lllIIIIIIIII[1];
            }
            "".length();
            if ("   ".length() >= 0) continue;
            return ((0x8A ^ 0x81) & ~(0xF ^ 4)) != 0;
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
        N.llIlllllllll[N.lllIIIIIIIII[0]] = N.lIIIIllllllllII("MwuNERsc1iperDHCjNpK7Q==", "FObpb");
    }

    private static boolean lIIIlIIIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

