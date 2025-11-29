/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

/* TASK: Picking up glass -> PickingupglassTask */
@TaskDesc(name="Picking up glass", blocking=true)
public class E
extends Task {
    private final /* synthetic */ BankStanderConfig t;
    private static /* synthetic */ String[] lllIlIIIIlI;
    private static /* synthetic */ int[] lllIlIIIIll;
    private final /* synthetic */ SquireBankStander s;

    static {
        E.lIlIlllIllllIl();
        E.lIlIlllIllllII();
    }

    private static void lIlIlllIllllII() {
        lllIlIIIIlI = new String[lllIlIIIIll[3]];
        E.lllIlIIIIlI[E.lllIlIIIIll[0]] = E."Take";
    }

    @Inject
    public E(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        this.s = squireBankStander;
        this.t = bankStanderConfig;
    }

    private static boolean lIlIllllIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIlllllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        TileItem var5;
        E var1;
        if (E.lIlIlllIlllllI(this.t.glassMakePickGlass() ? 1 : 0)) {
            return lllIlIIIIll[0];
        }
        if (E.lIlIlllIllllll(var1.s.b(), lllIlIIIIll[1]) && E.lIlIlllIlllllI(var1.s.d() ? 1 : 0)) {
            return lllIlIIIIll[0];
        }
        if (E.lIlIllllIIIIII(Inventory.isFull() ? 1 : 0)) {
            if (E.lIlIllllIIIIII(Bank.isOpen() ? 1 : 0)) {
                Bank.depositInventory();
            }
            return Bank.open();
        }
        if (E.lIlIllllIIIIIl(var1.s.b(), lllIlIIIIll[2])) {
            var1.s.a(lllIlIIIIll[3]);
        }
        if (E.lIlIllllIIIIlI(var5 = TileItems.getNearest(tileItem -> {
            boolean bl;
            if (E.lIlIllllIIIIll(tileItem.getId(), lllIlIIIIll[4])) {
                bl = lllIlIIIIll[3];
                0;
                
                }
            } else {
                bl = lllIlIIIIll[0];
            }
            return bl;
        }))) {
            var1.s.a(lllIlIIIIll[0]);
            var1.s.a(lllIlIIIIll[0]);
            return lllIlIIIIll[0];
        }
        var1_1.interact(lllIlIIIIlI[lllIlIIIIll[0]]);
        return lllIlIIIIll[3];
    }

    private static boolean lIlIllllIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIlllIllllIl() {
        lllIlIIIIll = new int[6];
        E.lllIlIIIIll[0] = (0x7B ^ 0x74 ^ (0x7B ^ 0x7E)) & (41 + 20 - -47 + 69 ^ 67 + 173 - 145 + 92 ^ -1);
        E.lllIlIIIIll[1] = 41 + 11 - -34 + 48 ^ 75 + 0 - -11 + 63;
        E.lllIlIIIIll[2] = 0x24 ^ 0x7F ^ (0x3B ^ 0x74);
        E.lllIlIIIIll[3] = 1;
        E.lllIlIIIIll[4] = 0xFFFFF6EF & 0xFFF;
        E.lllIlIIIIll[5] = 2;
    }

    private static boolean lIlIlllIllllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIllllIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIlllIlllIll(String var6, String var7) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lllIlIIIIll[5], var2);
            return new String(var3.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIIIIlI(Object object) {
        return object == null;
    }
}

