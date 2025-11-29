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
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

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
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i_Unknown;

@Singleton
/* TASK: Recharging trident -> RechargingtridentTask */
@TaskDesc(name="Recharging trident", priority=1000, blocking=true, register=true)
public class RechargingTridentTask
extends i_Unknown {
    private static /* synthetic */ int[] lIlIllIlIIlII;
    private static /* synthetic */ String[] lIlIllIlIIIIl;
    private /* synthetic */ boolean B;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var1_1;
        void var5_6;
        int var16;
        int n2;
        int n3;
        j var9;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIIl(this.B ? 1 : 0)) {
            return lIlIllIlIIlII[0];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIlI(var9.n() ? 1 : 0)) {
            return lIlIllIlIIlII[0];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIlI(Bank.isOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lIlIllIlIIlII[1]);
            var9.B = lIlIllIlIIlII[2];
            return lIlIllIlIIlII[2];
        }
        Item var5 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[11]]));
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIll(var5)) {
            Item var17 = Equipment.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[9]]));
            if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIllII(var17) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIlI(Inventory.isFull() ? 1 : 0)) {
                var17.interact(lIlIllIlIIIIl[lIlIllIlIIlII[0]]);
                return lIlIllIlIIlII[2];
            }
            return lIlIllIlIIlII[0];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIlI(var5.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[2]]) ? 1 : 0) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIlI(var5.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[3]]) ? 1 : 0)) {
            n3 = lIlIllIlIIlII[2];
            0;
            if (-(0x83 ^ 0x87) >= 0) {
                return false;
            }
        } else {
            n3 = lIlIllIlIIlII[0];
        }
        int var17 = n3;
        int var1 = var9.b(var17 != 0);
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIIl(var17)) {
            n2 = lIlIllIlIIlII[4];
            0;
            if (-1 > 0) {
                return false;
            }
        } else {
            n2 = var16 = lIlIllIlIIlII[5];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlllI(var1, lIlIllIlIIlII[6])) {
            if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                int[] nArray = new int[lIlIllIlIIlII[2]];
                nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[0]] = var1;
                if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var9.B = lIlIllIlIIlII[2];
                }
                if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIllll(Inventory.getFreeSlots(), lIlIllIlIIlII[7])) {
                    int[] nArray2 = new int[lIlIllIlIIlII[7]];
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[0]] = var5.getId();
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[2]] = var16;
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[3]] = lIlIllIlIIlII[8];
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[9]] = lIlIllIlIIlII[10];
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[11]] = lIlIllIlIIlII[12];
                    Bank.depositAllExcept((int[])nArray2);
                    return lIlIllIlIIlII[2];
                }
                Bank.withdrawAll((int)var1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIlIllIlIIlII[2];
            }
            return lIlIllIlIIlII[0];
        }
        int[] nArray = new int[lIlIllIlIIlII[2]];
        nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[0]] = var16;
        Item var6 = Inventory.getFirst((int[])nArray);
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIll(var6)) {
            return lIlIllIlIIlII[0];
        }
        var5_6.useOn((Item)var1_1);
        return lIlIllIlIIlII[2];
    }

    private static void llIIIIIlIIIIlIl() {
        lIlIllIlIIIIl = new String[lIlIllIlIIlII[7]];
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[0]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask."Remove";
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[2]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask."toxic";
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[3]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask."swamp";
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[9]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask."trident";
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[11]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask."trident";
    }

    public j() {
        this.B = lIlIllIlIIlII[0];
    }

    private static String llIIIIIIlllllll(String var2, String var7) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIlIllIlIIlII[13]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIlIllIlIIlII[3], var11);
            return new String(var15.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
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
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIIl(bl ? 1 : 0)) {
            n2 = lIlIllIlIIlII[4];
            0;
            if (-3 >= 0) {
                return (0x83 ^ 0xB1 ^ (0x78 ^ 0x6A)) & (32 + 122 - 76 + 150 ^ 112 + 27 - -17 + 40 ^ -1);
            }
        } else {
            n2 = lIlIllIlIIlII[5];
        }
        int var14 = n2;
        int[] nArray = new int[lIlIllIlIIlII[2]];
        nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[0]] = var14;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var14;
        }
        int[] nArray2 = new int[lIlIllIlIIlII[2]];
        nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[0]] = lIlIllIlIIlII[8];
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return lIlIllIlIIlII[8];
        }
        int[] nArray3 = new int[lIlIllIlIIlII[2]];
        nArray3[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[0]] = lIlIllIlIIlII[10];
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return lIlIllIlIIlII[10];
        }
        int[] nArray4 = new int[lIlIllIlIIlII[2]];
        nArray4[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[0]] = lIlIllIlIIlII[12];
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return lIlIllIlIIlII[12];
        }
        return lIlIllIlIIlII[6];
    }

    private static String llIIIIIlIIIIlII(String var12, String var8) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIlIllIlIIlII[3], var3);
            return new String(var4.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIlIIIlIII() {
        lIlIllIlIIlII = new int[14];
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[0] = (0x3B ^ 0x4C ^ (0xED ^ 0x85)) & (0x65 ^ 0x5A ^ (0x1B ^ 0x3B) ^ -1);
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[1] = 0xFFFF8DF7 & 0x7BCC;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[2] = 1;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[3] = 2;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[4] = -(0xFFFFFC53 & 0x37BD) & (0xFFFFFFFF & 0x37F3);
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[5] = -(0xFFFFD79F & 0x2979) & (0xFFFFBBDE & 0x77BF);
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[6] = -1;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[7] = 0x25 ^ 0x20;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[8] = 0xFFFF936A & 0x6EBF;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[9] = 3;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[10] = 0xFFFFDBF3 & 0x263C;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[11] = 7 ^ 3;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[12] = 0xFFFFBAF3 & 0x473E;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.lIlIllIlIIlII[13] = 0xB6 ^ 0xBE;
    }

    static {
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIII();
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIIlIl();
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
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.RechargingTridentTask.llIIIIIlIIIlIIl(this.j.isInInstancedRegion() ? 1 : 0)) {
            this.B = lIlIllIlIIlII[0];
        }
    }

    public boolean q() {
        return this.B;
    }
}

