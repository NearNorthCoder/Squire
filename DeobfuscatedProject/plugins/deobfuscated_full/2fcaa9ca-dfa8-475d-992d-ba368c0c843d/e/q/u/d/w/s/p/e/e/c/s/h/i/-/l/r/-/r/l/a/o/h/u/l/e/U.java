/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.V;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

/* TASK: Opening Hallowed sacks -> OpeninghallowedsacksTask */
@TaskDesc(name="Opening Hallowed sacks", priority=0x7FFFFFFF, blocking=true)
public class U
extends V {
    private static /* synthetic */ int[] lllIIIIIlllI;
    private /* synthetic */ CompletableFuture<Boolean> ag;
    private /* synthetic */ Player ai;
    private static /* synthetic */ String[] lllIIIIIllIl;

    private static boolean lIIIlIIIIlIIllI(Object object) {
        return object == null;
    }

    private static void lIIIlIIIIlIIlII() {
        lllIIIIIllIl = new String[lllIIIIIlllI[3]];
        U.lllIIIIIllIl[U.lllIIIIIlllI[0]] = U."Open";
    }

    private static void lIIIlIIIIlIIlIl() {
        lllIIIIIlllI = new int[6];
        U.lllIIIIIlllI[0] = (0xB0 ^ 0xB6) & ~(3 ^ 5);
        U.lllIIIIIlllI[1] = 0xFFFFFBF3 & 0x657E;
        U.lllIIIIIlllI[2] = 3;
        U.lllIIIIIlllI[3] = 1;
        U.lllIIIIIlllI[4] = 0x83 ^ 0xBD ^ (0x11 ^ 0x27);
        U.lllIIIIIlllI[5] = 2;
    }

    private static String lIIIlIIIIlIIIll(String var2, String var3) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lllIIIIIlllI[4]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lllIIIIIlllI[5], var1);
            return new String(var4.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIIlIlIII(int n2) {
        return n2 != 0;
    }

    static {
        U.lIIIlIIIIlIIlIl();
        U.lIIIlIIIIlIIlII();
    }

    private static boolean lIIIlIIIIlIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected U(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        super(squireSepulchre, squireSepulchreConfig);
        this.ag = null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J() {
        void var1_1;
        U var5;
        this.ai = Players.getLocal();
        if (U.lIIIlIIIIlIIllI(this.ai)) {
            return lllIIIIIlllI[0];
        }
        if (U.lIIIlIIIIlIIlll(b.B.contains((Locatable)var5.ai) ? 1 : 0)) {
            return lllIIIIIlllI[0];
        }
        InventorySetup var7 = new InventorySetup();
        var7.add(lllIIIIIlllI[1], lllIIIIIlllI[2]);
        0;
        if (U.lIIIlIIIIlIlIII(var7.matchesInventory() ? 1 : 0)) {
            if (U.lIIIlIIIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                return lllIIIIIlllI[3];
            }
            String[] stringArray = new String[lllIIIIIlllI[3]];
            stringArray[U.lllIIIIIlllI[0]] = lllIIIIIllIl[lllIIIIIlllI[0]];
            Inventory.doActions(item -> {
                boolean bl;
                if (U.lIIIlIIIIlIlIIl(item.getId(), lllIIIIIlllI[1])) {
                    bl = lllIIIIIlllI[3];
                    0;
                    if (3 == -1) {
                        return false;
                    }
                } else {
                    bl = lllIIIIIlllI[0];
                }
                return bl;
            }, (String[])stringArray);
            return lllIIIIIlllI[3];
        }
        if (U.lIIIlIIIIlIIlll(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return lllIIIIIlllI[3];
        }
        var1_1.withdraw();
        0;
        return lllIIIIIlllI[3];
    }

    private static boolean lIIIlIIIIlIIlll(int n2) {
        return n2 == 0;
    }
}

