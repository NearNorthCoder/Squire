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

    private static String lIIIlIIIIlIIIll(String lllllllllllllllIIlllIIlIlIllIIII, String lllllllllllllllIIlllIIlIlIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlIlIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIlIlIllIl.getBytes(StandardCharsets.UTF_8)), lllIIIIIlllI[4]), "DES");
            Cipher lllllllllllllllIIlllIIlIlIllIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIlIlIllIIlI.init(lllIIIIIlllI[5], lllllllllllllllIIlllIIlIlIllIIll);
            return new String(lllllllllllllllIIlllIIlIlIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIlIlIllIIIl) {
            lllllllllllllllIIlllIIlIlIllIIIl.printStackTrace();
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
        U lllllllllllllllIIlllIIlIlIlllIll;
        this.ai = Players.getLocal();
        if (U.lIIIlIIIIlIIllI(this.ai)) {
            return lllIIIIIlllI[0];
        }
        if (U.lIIIlIIIIlIIlll(b.B.contains((Locatable)lllllllllllllllIIlllIIlIlIlllIll.ai) ? 1 : 0)) {
            return lllIIIIIlllI[0];
        }
        InventorySetup lllllllllllllllIIlllIIlIlIlllIlI = new InventorySetup();
        lllllllllllllllIIlllIIlIlIlllIlI.add(lllIIIIIlllI[1], lllIIIIIlllI[2]);
        0;
        if (U.lIIIlIIIIlIlIII(lllllllllllllllIIlllIIlIlIlllIlI.matchesInventory() ? 1 : 0)) {
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
                        return ((0x3E ^ 0x78) & ~(0xCB ^ 0x8D)) != 0;
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

