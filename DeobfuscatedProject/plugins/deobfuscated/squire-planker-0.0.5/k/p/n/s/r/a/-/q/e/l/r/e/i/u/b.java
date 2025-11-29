/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package k.p.n.s.r.a.-.q.e.l.r.e.i.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.SquirePlankerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Banking")
public class b
extends Task {
    private static /* synthetic */ int[] llllllIIIllI;
    private final /* synthetic */ SquirePlankerConfig l;
    private static /* synthetic */ String[] llllllIIIlIl;

    private static void lIIlIIlllllllIl() {
        llllllIIIlIl = new String[llllllIIIllI[3]];
        b.llllllIIIlIl[b.llllllIIIllI[2]] = b."Bank booth";
        b.llllllIIIlIl[b.llllllIIIllI[0]] = b."Bank";
    }

    private static boolean lIIlIlIIIIIIIlI(int n) {
        return n != 0;
    }

    private static String lIIlIIlllllIlll(String lllllllllllllllIIlIIllllIlIIIIIl, String lllllllllllllllIIlIIllllIIlllllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllllIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllllIIlllllI.getBytes(StandardCharsets.UTF_8)), llllllIIIllI[4]), "DES");
            Cipher lllllllllllllllIIlIIllllIlIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllllIlIIIIll.init(llllllIIIllI[3], lllllllllllllllIIlIIllllIlIIIlII);
            return new String(lllllllllllllllIIlIIllllIlIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllllIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllllIlIIIIlI) {
            lllllllllllllllIIlIIllllIlIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIIIIIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIIlllllllll(int n) {
        return n == 0;
    }

    static {
        b.lIIlIIllllllllI();
        b.lIIlIIlllllllIl();
    }

    @Inject
    public b(SquirePlankerConfig squirePlankerConfig) {
        this.l = squirePlankerConfig;
    }

    private static void lIIlIIllllllllI() {
        llllllIIIllI = new int[5];
        b.llllllIIIllI[0] = 1;
        b.llllllIIIllI[1] = 129 + 78 - 197 + 136 ^ 73 + 152 - 131 + 66;
        b.llllllIIIllI[2] = (5 + 73 - -22 + 38 ^ 105 + 130 - 183 + 95) & (0x52 ^ 0x2E ^ (0xC0 ^ 0xA5) ^ -1);
        b.llllllIIIllI[3] = 2;
        b.llllllIIIllI[4] = 0x25 ^ 0x2D;
    }

    private static boolean lIIlIlIIIIIIIll(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIIIIIIII(int n, int n2) {
        return n > n2;
    }

    public boolean run() {
        b lllllllllllllllIIlIIllllIlIIlIll;
        if (b.lIIlIIlllllllll(Movement.shouldWalk() ? 1 : 0)) {
            return llllllIIIllI[0];
        }
        if (b.lIIlIlIIIIIIIII(Movement.getRunEnergy(), llllllIIIllI[1]) && b.lIIlIIlllllllll(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return llllllIIIllI[0];
        }
        int[] nArray = new int[llllllIIIllI[0]];
        nArray[b.llllllIIIllI[2]] = lllllllllllllllIIlIIllllIlIIlIll.l.plank().d();
        Item lllllllllllllllIIlIIllllIlIIlIlI = Inventory.getFirst((int[])nArray);
        if (b.lIIlIlIIIIIIIIl(lllllllllllllllIIlIIllllIlIIlIlI)) {
            if (b.lIIlIlIIIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            return llllllIIIllI[2];
        }
        if (b.lIIlIIlllllllll(Bank.isOpen() ? 1 : 0)) {
            if (b.lIIlIlIIIIIIIlI(lllllllllllllllIIlIIllllIlIIlIll.l.ironMode() ? 1 : 0)) {
                String[] stringArray = new String[llllllIIIllI[0]];
                stringArray[b.llllllIIIllI[2]] = llllllIIIlIl[llllllIIIllI[2]];
                TileObject lllllllllllllllIIlIIllllIlIIlIIl = TileObjects.getNearest((String[])stringArray);
                if (b.lIIlIlIIIIIIIll(lllllllllllllllIIlIIllllIlIIlIIl)) {
                    return llllllIIIllI[2];
                }
                lllllllllllllllIIlIIllllIlIIlIIl.interact(llllllIIIlIl[llllllIIIllI[0]]);
            }
            Bank.open();
            0;
            return llllllIIIllI[0];
        }
        int[] nArray2 = new int[llllllIIIllI[0]];
        nArray2[b.llllllIIIllI[2]] = this.l.plank().f();
        Bank.depositAll((int[])nArray2);
        Bank.withdrawAll((int)this.l.plank().d(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return llllllIIIllI[0];
    }
}

