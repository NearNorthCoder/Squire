/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=1, blocking=true)
public class X
extends Task {
    private static /* synthetic */ String[] lIIlIlIII;
    private static /* synthetic */ int[] lIIlIlIIl;

    private boolean aY() {
        String[] stringArray = new String[lIIlIlIIl[0]];
        stringArray[X.lIIlIlIIl[1]] = lIIlIlIII[lIIlIlIIl[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (X.lIIIIIIlIIl(nPC)) {
            return lIIlIlIIl[1];
        }
        nPC.interact(lIIlIlIII[lIIlIlIIl[0]]);
        return lIIlIlIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(int n2, int n3) {
        void llIIlIIIlIlIIlI;
        void llIIlIIIlIlIIll;
        int n4 = lIIlIlIIl[4] - n2;
        int n5 = lIIlIlIIl[4] - n3;
        int[] nArray = new int[lIIlIlIIl[5]];
        nArray[X.lIIlIlIIl[1]] = lIIlIlIIl[6];
        nArray[X.lIIlIlIIl[0]] = lIIlIlIIl[7];
        if (!X.lIIIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0) || X.lIIIIIIlIII(Inventory.isFull() ? 1 : 0) && (!X.lIIIIIIIlIl(n4) || X.lIIIIIIIllI(n5))) {
            Bank.depositInventory();
            return lIIlIlIIl[0];
        }
        if (X.lIIIIIIIllI((int)llIIlIIIlIlIIll)) {
            int[] nArray2 = new int[lIIlIlIIl[0]];
            nArray2[X.lIIlIlIIl[1]] = lIIlIlIIl[2];
            if (X.lIIIIIIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                Bank.withdraw((int)lIIlIlIIl[2], (int)llIIlIIIlIlIIll, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIIlIlIIl[0];
            }
        }
        if (X.lIIIIIIIllI((int)llIIlIIIlIlIIlI)) {
            int[] nArray3 = new int[lIIlIlIIl[0]];
            nArray3[X.lIIlIlIIl[1]] = lIIlIlIIl[3];
            if (X.lIIIIIIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                Bank.withdraw((int)lIIlIlIIl[3], (int)llIIlIIIlIlIIlI, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIIlIlIIl[0];
            }
        }
        return lIIlIlIIl[1];
    }

    private static String lIIIIIIIIlI(String llIIlIIIlIIlIII, String llIIlIIIlIIIlll) {
        try {
            SecretKeySpec llIIlIIIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlIIIlIIllII = Cipher.getInstance("Blowfish");
            llIIlIIIlIIllII.init(lIIlIlIIl[5], llIIlIIIlIIllIl);
            return new String(llIIlIIIlIIllII.doFinal(Base64.getDecoder().decode(llIIlIIIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIIIlIIlIll) {
            llIIlIIIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIIIIIlII() {
        lIIlIlIIl = new int[8];
        X.lIIlIlIIl[0] = 1;
        X.lIIlIlIIl[1] = 1 & ~1;
        X.lIIlIlIIl[2] = 0xFFFFD6F7 & 0x2FFF;
        X.lIIlIlIIl[3] = -(0xFFFFED2F & 0x5AD3) & (0xFFFFCFF7 & 0x7EFF);
        X.lIIlIlIIl[4] = 0xAF ^ 0xA1;
        X.lIIlIlIIl[5] = 2;
        X.lIIlIlIIl[6] = -(0xFFFFA753 & 0x79BD) & (0xFFFFBFFF & 0x6F9F);
        X.lIIlIlIIl[7] = -(0xFFFFFE37 & 0x69D9) & (0xFFFFEEFF & Short.MAX_VALUE);
    }

    private static boolean lIIIIIIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIIIlIl(int n2) {
        return n2 <= 0;
    }

    private static void lIIIIIIIIll() {
        lIIlIlIII = new String[lIIlIlIIl[5]];
        X.lIIlIlIII[X.lIIlIlIIl[1]] = X."Banker";
        X.lIIlIlIII[X.lIIlIlIIl[0]] = X."Bank";
    }

    static {
        X.lIIIIIIIlII();
        X.lIIIIIIIIll();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void llIIlIIIlIlllII;
        void llIIlIIIlIlllIl;
        int[] nArray = new int[lIIlIlIIl[0]];
        nArray[X.lIIlIlIIl[1]] = lIIlIlIIl[2];
        int n2 = Inventory.getCount((int[])nArray);
        int[] nArray2 = new int[lIIlIlIIl[0]];
        nArray2[X.lIIlIlIIl[1]] = lIIlIlIIl[3];
        int n3 = Inventory.getCount((int[])nArray2);
        if ((!X.lIIIIIIIlIl(n3) || X.lIIIIIIIllI(n2)) && X.lIIIIIIIlll((int)llIIlIIIlIlllIl, (int)llIIlIIIlIlllII)) {
            return lIIlIlIIl[1];
        }
        if (X.lIIIIIIlIII(Bank.isOpen() ? 1 : 0)) {
            X llIIlIIIlIllllI;
            return llIIlIIIlIllllI.b((int)llIIlIIIlIlllIl, (int)llIIlIIIlIlllII);
        }
        return this.aY();
    }

    private static boolean lIIIIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIlIIl(Object object) {
        return object == null;
    }
}

