/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Singleton
 *  net.runelite.api.Item
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.Item;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@Singleton
@TaskDesc(name="Recharging trident", priority=1000, blocking=true, register=true)
public class RechargingTridentTask
extends WhispererTaskBase {

    private  boolean B;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var1_1;
        void var5_6;
        int var1;
        int n2;
        int n3;
        j var2;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIIl(this.B ? 1 : 0)) {
            return lIlIllIlIIlII[0];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(var2.n() ? 1 : 0)) {
            return lIlIllIlIIlII[0];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(Bank.isOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lIlIllIlIIlII[1]);
            var2.B = lIlIllIlIIlII[2];
            return lIlIllIlIIlII[2];
        }
        Item var3 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[11]]));
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIll(var3)) {
            Item var4 = Equipment.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[9]]));
            if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIllII(var4) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(Inventory.isFull() ? 1 : 0)) {
                var4.interact(lIlIllIlIIIIl[lIlIllIlIIlII[0]]);
                return lIlIllIlIIlII[2];
            }
            return lIlIllIlIIlII[0];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(var3.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[2]]) ? 1 : 0) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(var3.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[3]]) ? 1 : 0)) {
            n3 = lIlIllIlIIlII[2];

            if (-(0x83 ^ 0x87) >= 0) {
                return false;
            }
        } else {
            n3 = lIlIllIlIIlII[0];
        }
        int var4 = n3;
        int var5 = var2.b(var4 != 0);
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIIl(var4)) {
            n2 = lIlIllIlIIlII[4];

        } else {
            n2 = var1 = lIlIllIlIIlII[5];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlllI(var5, lIlIllIlIIlII[6])) {
            if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                int[] nArray = new int[lIlIllIlIIlII[2]];
                nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = var5;
                if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var2.B = lIlIllIlIIlII[2];
                }
                if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIllll(Inventory.getFreeSlots(), lIlIllIlIIlII[7])) {
                    int[] nArray2 = new int[lIlIllIlIIlII[7]];
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = var3.getId();
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[2]] = var1;
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[3]] = lIlIllIlIIlII[8];
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[9]] = lIlIllIlIIlII[10];
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[11]] = lIlIllIlIIlII[12];
                    Bank.depositAllExcept((int[])nArray2);
                    return lIlIllIlIIlII[2];
                }
                Bank.withdrawAll((int)var5, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIlIllIlIIlII[2];
            }
            return lIlIllIlIIlII[0];
        }
        int[] nArray = new int[lIlIllIlIIlII[2]];
        nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = var1;
        Item var6 = Inventory.getFirst((int[])nArray);
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIll(var6)) {
            return lIlIllIlIIlII[0];
        }
        var5_6.useOn((Item)var1_1);
        return lIlIllIlIIlII[2];
    }

    private static void llIIIIIlIIIIlIl() {
        lIlIllIlIIIIl = new String[lIlIllIlIIlII[7]];
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i."Remove";
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[2]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i."toxic";
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[3]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i."swamp";
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[9]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i."trident";
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[11]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i."trident";
    }

    public RechargingTridentTask() {
        this.B = lIlIllIlIIlII[0];
    }

    private static boolean llIIIIIlIIIlIll(Object object) {
        return object == null;
    }

    private static boolean llIIIIIlIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIlIIIlllI(int n2, int n3) {
        return n2 != n3;
    }

    public int b(boolean bl) {
        int n2;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIIl(bl ? 1 : 0)) {
            n2 = lIlIllIlIIlII[4];

        } else {
            n2 = lIlIllIlIIlII[5];
        }
        int var7 = n2;
        int[] nArray = new int[lIlIllIlIIlII[2]];
        nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = var7;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var7;
        }
        int[] nArray2 = new int[lIlIllIlIIlII[2]];
        nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = lIlIllIlIIlII[8];
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return lIlIllIlIIlII[8];
        }
        int[] nArray3 = new int[lIlIllIlIIlII[2]];
        nArray3[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = lIlIllIlIIlII[10];
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return lIlIllIlIIlII[10];
        }
        int[] nArray4 = new int[lIlIllIlIIlII[2]];
        nArray4[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = lIlIllIlIIlII[12];
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return lIlIllIlIIlII[12];
        }
        return lIlIllIlIIlII[6];
    }

    static {
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIII();
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIIlIl();
    }

    private static boolean llIIIIIlIIIllII(Object object) {
        return object != null;
    }

    private static boolean llIIIIIlIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIlIIIlIIl(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIIl(this.j.isInInstancedRegion() ? 1 : 0)) {
            this.B = lIlIllIlIIlII[0];
        }
    }

    public boolean q() {
        return this.B;
    }
}

