/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u;

@TaskDesc(name="Using imbued heart")
public class A
extends u {
    private static /* synthetic */ int[] lIlIlllIllIIl;
    private static /* synthetic */ String[] lIlIlllIllIII;

    private static void llIIIIlIlIIIIlI() {
        lIlIlllIllIII = new String[lIlIlllIllIIl[3]];
        A.lIlIlllIllIII[A.lIlIlllIllIIl[1]] = A."Invigorate";
    }

    @Override
    public boolean p() {
        int[] nArray = new int[lIlIlllIllIIl[0]];
        nArray[A.lIlIlllIllIIl[1]] = lIlIlllIllIIl[2];
        nArray[A.lIlIlllIllIIl[3]] = lIlIlllIllIIl[4];
        Item item = Inventory.getFirst((int[])nArray);
        if (A.llIIIIlIlIIIlII(item)) {
            return lIlIlllIllIIl[1];
        }
        int llllllllllllllIllIIlllllIlllllIl = Vars.getBit((int)lIlIlllIllIIl[5]);
        if (A.llIIIIlIlIIIlIl(llllllllllllllIllIIlllllIlllllIl)) {
            return lIlIlllIllIIl[1];
        }
        item.interact(lIlIlllIllIII[lIlIlllIllIIl[1]]);
        return lIlIlllIllIIl[3];
    }

    private static boolean llIIIIlIlIIIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIlIlIIIlII(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIIlIlIIIIll() {
        lIlIlllIllIIl = new int[6];
        A.lIlIlllIllIIl[0] = 2;
        A.lIlIlllIllIIl[1] = (173 + 78 - 65 + 37 ^ 116 + 120 - 227 + 188) & (52 + 60 - -26 + 14 ^ 1 + 38 - -20 + 71 ^ -1);
        A.lIlIlllIllIIl[2] = 0xFFFFF0FF & 0x5FF4;
        A.lIlIlllIllIIl[3] = 1;
        A.lIlIlllIllIIl[4] = -(0x60 ^ 0x65) & (0xFFFFFBFD & 0x6FFF);
        A.lIlIlllIllIIl[5] = -(0xFFFFFF6F & 0x99F) & (0xFFFFBDFF & 0x5FFF);
    }

    private static String llIIIIlIlIIIIIl(String llllllllllllllIllIIlllllIlllIIlI, String llllllllllllllIllIIlllllIllIllII) {
        llllllllllllllIllIIlllllIlllIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllllIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlllllIlllIIII = new StringBuilder();
        char[] llllllllllllllIllIIlllllIllIllll = llllllllllllllIllIIlllllIllIllII.toCharArray();
        int llllllllllllllIllIIlllllIllIlllI = lIlIlllIllIIl[1];
        char[] llllllllllllllIllIIlllllIllIlIII = llllllllllllllIllIIlllllIlllIIlI.toCharArray();
        int llllllllllllllIllIIlllllIllIIlll = llllllllllllllIllIIlllllIllIlIII.length;
        int llllllllllllllIllIIlllllIllIIllI = lIlIlllIllIIl[1];
        while (A.llIIIIlIlIIIllI(llllllllllllllIllIIlllllIllIIllI, llllllllllllllIllIIlllllIllIIlll)) {
            char llllllllllllllIllIIlllllIlllIIll = llllllllllllllIllIIlllllIllIlIII[llllllllllllllIllIIlllllIllIIllI];
            llllllllllllllIllIIlllllIlllIIII.append((char)(llllllllllllllIllIIlllllIlllIIll ^ llllllllllllllIllIIlllllIllIllll[llllllllllllllIllIIlllllIllIlllI % llllllllllllllIllIIlllllIllIllll.length]));
            0;
            ++llllllllllllllIllIIlllllIllIlllI;
            ++llllllllllllllIllIIlllllIllIIllI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlllllIlllIIII);
    }

    static {
        A.llIIIIlIlIIIIll();
        A.llIIIIlIlIIIIlI();
    }
}

