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
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.i;

@Singleton
@TaskDesc(name="Recharging trident", priority=1000, blocking=true, register=true)
public class j
extends i {
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
        int llllllllllllllIllIlIIlIIIIllllll;
        int n2;
        int n3;
        j llllllllllllllIllIlIIlIIIlIIIIll;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIIl(this.B ? 1 : 0)) {
            return lIlIllIlIIlII[0];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(llllllllllllllIllIlIIlIIIlIIIIll.n() ? 1 : 0)) {
            return lIlIllIlIIlII[0];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(Bank.isOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lIlIllIlIIlII[1]);
            llllllllllllllIllIlIIlIIIlIIIIll.B = lIlIllIlIIlII[2];
            return lIlIllIlIIlII[2];
        }
        Item llllllllllllllIllIlIIlIIIlIIIIlI = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[11]]));
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIll(llllllllllllllIllIlIIlIIIlIIIIlI)) {
            Item llllllllllllllIllIlIIlIIIlIIIIIl = Equipment.getFirst(item -> item.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[9]]));
            if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIllII(llllllllllllllIllIlIIlIIIlIIIIIl) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(Inventory.isFull() ? 1 : 0)) {
                llllllllllllllIllIlIIlIIIlIIIIIl.interact(lIlIllIlIIIIl[lIlIllIlIIlII[0]]);
                return lIlIllIlIIlII[2];
            }
            return lIlIllIlIIlII[0];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(llllllllllllllIllIlIIlIIIlIIIIlI.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[2]]) ? 1 : 0) && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(llllllllllllllIllIlIIlIIIlIIIIlI.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[3]]) ? 1 : 0)) {
            n3 = lIlIllIlIIlII[2];
            "".length();
            if (-(0x83 ^ 0x87) >= 0) {
                return ((0x25 ^ 0x45) & ~(0x26 ^ 0x46)) != 0;
            }
        } else {
            n3 = lIlIllIlIIlII[0];
        }
        int llllllllllllllIllIlIIlIIIlIIIIIl = n3;
        int llllllllllllllIllIlIIlIIIlIIIIII = llllllllllllllIllIlIIlIIIlIIIIll.b(llllllllllllllIllIlIIlIIIlIIIIIl != 0);
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIIl(llllllllllllllIllIlIIlIIIlIIIIIl)) {
            n2 = lIlIllIlIIlII[4];
            "".length();
            if (-" ".length() > 0) {
                return ((0xA4 ^ 0xB0) & ~(0x12 ^ 6)) != 0;
            }
        } else {
            n2 = llllllllllllllIllIlIIlIIIIllllll = lIlIllIlIIlII[5];
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlllI(llllllllllllllIllIlIIlIIIlIIIIII, lIlIllIlIIlII[6])) {
            if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                int[] nArray = new int[lIlIllIlIIlII[2]];
                nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = llllllllllllllIllIlIIlIIIlIIIIII;
                if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    llllllllllllllIllIlIIlIIIlIIIIll.B = lIlIllIlIIlII[2];
                }
                if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIllll(Inventory.getFreeSlots(), lIlIllIlIIlII[7])) {
                    int[] nArray2 = new int[lIlIllIlIIlII[7]];
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = llllllllllllllIllIlIIlIIIlIIIIlI.getId();
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[2]] = llllllllllllllIllIlIIlIIIIllllll;
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[3]] = lIlIllIlIIlII[8];
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[9]] = lIlIllIlIIlII[10];
                    nArray2[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[11]] = lIlIllIlIIlII[12];
                    Bank.depositAllExcept((int[])nArray2);
                    return lIlIllIlIIlII[2];
                }
                Bank.withdrawAll((int)llllllllllllllIllIlIIlIIIlIIIIII, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIlIllIlIIlII[2];
            }
            return lIlIllIlIIlII[0];
        }
        int[] nArray = new int[lIlIllIlIIlII[2]];
        nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = llllllllllllllIllIlIIlIIIIllllll;
        Item llllllllllllllIllIlIIlIIIIlllllI = Inventory.getFirst((int[])nArray);
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIll(llllllllllllllIllIlIIlIIIIlllllI)) {
            return lIlIllIlIIlII[0];
        }
        var5_6.useOn((Item)var1_1);
        return lIlIllIlIIlII[2];
    }

    private static void llIIIIIlIIIIlIl() {
        lIlIllIlIIIIl = new String[lIlIllIlIIlII[7]];
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIIlllllll("YSd2ijiT1ik=", "mrysv");
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[2]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIIlII("EW2Oa6G9pF4=", "RocjC");
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[3]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIIlII("9KtTv3dOJQU=", "FjdYv");
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[9]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIIlllllll("xkWrhP/eimw=", "oCyUj");
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIIIl[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[11]] = r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIIlllllll("0XXt7uYveEQ=", "RySyy");
    }

    public j() {
        this.B = lIlIllIlIIlII[0];
    }

    private static String llIIIIIIlllllll(String llllllllllllllIllIlIIlIIIIlIIIIl, String llllllllllllllIllIlIIlIIIIlIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlIIIIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), lIlIllIlIIlII[13]), "DES");
            Cipher llllllllllllllIllIlIIlIIIIlIIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIlIIIIlIIlIl.init(lIlIllIlIIlII[3], llllllllllllllIllIlIIlIIIIlIIllI);
            return new String(llllllllllllllIllIlIIlIIIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIlIIIIlIIlII) {
            llllllllllllllIllIlIIlIIIIlIIlII.printStackTrace();
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
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIIl(bl ? 1 : 0)) {
            n2 = lIlIllIlIIlII[4];
            "".length();
            if (-"   ".length() >= 0) {
                return (0x83 ^ 0xB1 ^ (0x78 ^ 0x6A)) & (32 + 122 - 76 + 150 ^ 112 + 27 - -17 + 40 ^ -" ".length());
            }
        } else {
            n2 = lIlIllIlIIlII[5];
        }
        int llllllllllllllIllIlIIlIIIIlllIII = n2;
        int[] nArray = new int[lIlIllIlIIlII[2]];
        nArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0]] = llllllllllllllIllIlIIlIIIIlllIII;
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.llIIIIIlIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return llllllllllllllIllIlIIlIIIIlllIII;
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

    private static String llIIIIIlIIIIlII(String llllllllllllllIllIlIIlIIIIlIlllI, String llllllllllllllIllIlIIlIIIIlIllll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlIIIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIlIIIIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIlIIIIllIIlI.init(lIlIllIlIIlII[3], llllllllllllllIllIlIIlIIIIllIIll);
            return new String(llllllllllllllIllIlIIlIIIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIlIIIIllIIIl) {
            llllllllllllllIllIlIIlIIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIlIIIlIII() {
        lIlIllIlIIlII = new int[14];
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[0] = (0x3B ^ 0x4C ^ (0xED ^ 0x85)) & (0x65 ^ 0x5A ^ (0x1B ^ 0x3B) ^ -" ".length());
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[1] = 0xFFFF8DF7 & 0x7BCC;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[2] = " ".length();
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[3] = "  ".length();
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[4] = -(0xFFFFFC53 & 0x37BD) & (0xFFFFFFFF & 0x37F3);
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[5] = -(0xFFFFD79F & 0x2979) & (0xFFFFBBDE & 0x77BF);
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[6] = -" ".length();
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[7] = 0x25 ^ 0x20;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[8] = 0xFFFF936A & 0x6EBF;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[9] = "   ".length();
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[10] = 0xFFFFDBF3 & 0x263C;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[11] = 7 ^ 3;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[12] = 0xFFFFBAF3 & 0x473E;
        r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j.lIlIllIlIIlII[13] = 0xB6 ^ 0xBE;
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

