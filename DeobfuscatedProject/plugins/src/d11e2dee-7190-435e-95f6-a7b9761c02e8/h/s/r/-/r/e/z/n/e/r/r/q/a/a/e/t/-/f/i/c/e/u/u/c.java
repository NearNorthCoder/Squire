/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.a;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Breaking Essence Blocks")
public class c
extends Task {
    private static /* synthetic */ int[] lIllIIlllIIII;
    private final /* synthetic */ a q;
    private static final /* synthetic */ int p;
    private final /* synthetic */ SquireZeahRunecrafter r;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        c llllllllllllllIllIIlIIIlIllIIlII;
        if (!c.llIIIllIlllIIII(this.r.a() ? 1 : 0) || c.llIIIllIlllIIII(this.k() ? 1 : 0)) {
            return lIllIIlllIIII[0];
        }
        List<Item> llllllllllllllIllIIlIIIlIllIIIll = llllllllllllllIllIIlIIIlIllIIlII.l();
        if (c.llIIIllIlllIIII(llllllllllllllIllIIlIIIlIllIIIll.isEmpty() ? 1 : 0)) {
            return lIllIIlllIIII[0];
        }
        this.a((List<Item>)var1_1);
        return lIllIIlllIIII[1];
    }

    private static boolean llIIIllIlllIIII(int n) {
        return n != 0;
    }

    private List<Item> l() {
        int[] nArray = new int[lIllIIlllIIII[1]];
        nArray[c.lIllIIlllIIII[0]] = lIllIIlllIIII[2];
        return Inventory.getAll((int[])nArray);
    }

    private boolean k() {
        boolean bl;
        if (c.llIIIllIlllIIIl(this.q.j(), this.q.h())) {
            bl = lIllIIlllIIII[1];
            "".length();
            if (" ".length() < 0) {
                return ((0x40 ^ 0x56) & ~(0x6B ^ 0x7D)) != 0;
            }
        } else {
            bl = lIllIIlllIIII[0];
        }
        return bl;
    }

    static {
        c.llIIIllIllIllll();
        p = lIllIIlllIIII[3];
    }

    private static boolean llIIIllIlllIIIl(int n, int n2) {
        return n >= n2;
    }

    private static void llIIIllIllIllll() {
        lIllIIlllIIII = new int[5];
        c.lIllIIlllIIII[0] = (0xB7 ^ 0x87 ^ (0xD9 ^ 0xB2)) & (0xF6 ^ 0xB3 ^ (0x2A ^ 0x34) ^ -" ".length());
        c.lIllIIlllIIII[1] = " ".length();
        c.lIllIIlllIIII[2] = 0xFFFFB4BE & 0x7FC7;
        c.lIllIIlllIIII[3] = 0 ^ 8;
        c.lIllIIlllIIII[4] = -(0xFFFFED35 & 0x73CF) & (0xFFFFEFFF & 0x77DF);
    }

    /*
     * WARNING - void declaration
     */
    private void a(List<Item> list) {
        void llllllllllllllIllIIlIIIlIlIlllII;
        int n = Math.min(lIllIIlllIIII[3], list.size());
        int llllllllllllllIllIIlIIIlIlIllIll = lIllIIlllIIII[0];
        while (c.llIIIllIlllIIlI(llllllllllllllIllIIlIIIlIlIllIll, (int)llllllllllllllIllIIlIIIlIlIlllII)) {
            void llllllllllllllIllIIlIIIlIlIlllIl;
            int[] nArray = new int[lIllIIlllIIII[1]];
            nArray[c.lIllIIlllIIII[0]] = lIllIIlllIIII[4];
            ((Item)llllllllllllllIllIIlIIIlIlIlllIl.get(llllllllllllllIllIIlIIIlIlIllIll)).useOn(Inventory.getFirst((int[])nArray));
            ++llllllllllllllIllIIlIIIlIlIllIll;
            "".length();
            if ("  ".length() != -" ".length()) continue;
            return;
        }
    }

    private static boolean llIIIllIlllIIlI(int n, int n2) {
        return n < n2;
    }

    @Inject
    public c(a a2, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.q = a2;
        this.r = squireZeahRunecrafter;
    }
}

