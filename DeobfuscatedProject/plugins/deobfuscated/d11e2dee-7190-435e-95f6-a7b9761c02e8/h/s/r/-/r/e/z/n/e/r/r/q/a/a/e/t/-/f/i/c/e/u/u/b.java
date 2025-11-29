/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 */
package h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Activating Blood Essence")
public class b
extends Task {
    private static /* synthetic */ String[] lIllIIlllIlII;
    private static /* synthetic */ int[] lIllIIlllIllI;

    public boolean run() {
        if (b.llIIIlllIIIIIII(Inventory.isFull() ? 1 : 0)) {
            return lIllIIlllIllI[0];
        }
        int[] nArray = new int[lIllIIlllIllI[1]];
        nArray[b.lIllIIlllIllI[0]] = lIllIIlllIllI[2];
        if (b.llIIIlllIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIllIIlllIllI[0];
        }
        int[] nArray2 = new int[lIllIIlllIllI[1]];
        nArray2[b.lIllIIlllIllI[0]] = lIllIIlllIllI[3];
        if (b.llIIIlllIIIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return lIllIIlllIllI[0];
        }
        int[] nArray3 = new int[lIllIIlllIllI[1]];
        nArray3[b.lIllIIlllIllI[0]] = lIllIIlllIllI[3];
        Inventory.getFirst((int[])nArray3).interact(lIllIIlllIlII[lIllIIlllIllI[0]]);
        return lIllIIlllIllI[1];
    }

    private static void llIIIllIlllllll() {
        lIllIIlllIllI = new int[4];
        b.lIllIIlllIllI[0] = (0x24 ^ 0x72 ^ 2) & (0x5F ^ 0x28 ^ (0x28 ^ 0xB) ^ -1);
        b.lIllIIlllIllI[1] = 1;
        b.lIllIIlllIllI[2] = 0xFFFFFF3C & 0x67DB;
        b.lIllIIlllIllI[3] = 0xFFFFFF76 & 0x679F;
    }

    private static boolean llIIIlllIIIIIII(int n) {
        return n != 0;
    }

    private static boolean llIIIlllIIIIIlI(int n, int n2) {
        return n < n2;
    }

    static {
        b.llIIIllIlllllll();
        b.llIIIllIlllllII();
    }

    private static boolean llIIIlllIIIIIIl(int n) {
        return n == 0;
    }

    private static void llIIIllIlllllII() {
        lIllIIlllIlII = new String[lIllIIlllIllI[1]];
        b.lIllIIlllIlII[b.lIllIIlllIllI[0]] = b."Activate";
    }

    private static String llIIIllIllllIll(String llllllllllllllIllIIlIIIlIIIlllIl, String llllllllllllllIllIIlIIIlIIIlIlll) {
        llllllllllllllIllIIlIIIlIIIlllIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIIIlIIIllIll = new StringBuilder();
        char[] llllllllllllllIllIIlIIIlIIIllIlI = llllllllllllllIllIIlIIIlIIIlIlll.toCharArray();
        int llllllllllllllIllIIlIIIlIIIllIIl = lIllIIlllIllI[0];
        char[] llllllllllllllIllIIlIIIlIIIlIIll = llllllllllllllIllIIlIIIlIIIlllIl.toCharArray();
        int llllllllllllllIllIIlIIIlIIIlIIlI = llllllllllllllIllIIlIIIlIIIlIIll.length;
        int llllllllllllllIllIIlIIIlIIIlIIIl = lIllIIlllIllI[0];
        while (b.llIIIlllIIIIIlI(llllllllllllllIllIIlIIIlIIIlIIIl, llllllllllllllIllIIlIIIlIIIlIIlI)) {
            char llllllllllllllIllIIlIIIlIIIllllI = llllllllllllllIllIIlIIIlIIIlIIll[llllllllllllllIllIIlIIIlIIIlIIIl];
            llllllllllllllIllIIlIIIlIIIllIll.append((char)(llllllllllllllIllIIlIIIlIIIllllI ^ llllllllllllllIllIIlIIIlIIIllIlI[llllllllllllllIllIIlIIIlIIIllIIl % llllllllllllllIllIIlIIIlIIIllIlI.length]));
            0;
            ++llllllllllllllIllIIlIIIlIIIllIIl;
            ++llllllllllllllIllIIlIIIlIIIlIIIl;
            0;
            if ((0x12 ^ 0x16) == (0xBB ^ 0xBF)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlIIIlIIIllIll);
    }
}

