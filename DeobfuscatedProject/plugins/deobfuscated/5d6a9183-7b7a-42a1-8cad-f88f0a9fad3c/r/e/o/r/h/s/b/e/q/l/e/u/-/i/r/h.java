/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package r.e.o.r.h.s.b.e.q.l.e.u.-.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.SquireHerblore;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.d;

@TaskDesc(name="Cleaning herbs")
public class h
extends d {
    private static /* synthetic */ String[] lllIlIIIIIlI;
    private static /* synthetic */ int[] lllIlIIIIIll;

    static {
        h.lIIIlIllIllllII();
        h.lIIIlIllIlllIll();
    }

    private static boolean lIIIlIllIllllIl(int n) {
        return n != 0;
    }

    private static void lIIIlIllIllllII() {
        lllIlIIIIIll = new int[4];
        h.lllIlIIIIIll[0] = 3;
        h.lllIlIIIIIll[1] = (0xB ^ 0x5B) & ~(0x2D ^ 0x7D);
        h.lllIlIIIIIll[2] = 1;
        h.lllIlIIIIIll[3] = 2;
    }

    private static String lIIIlIllIlllIlI(String lllllllllllllllIIllIIlIIllIIlIlI, String lllllllllllllllIIllIIlIIllIIlIIl) {
        lllllllllllllllIIllIIlIIllIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIIllIIlIII = new StringBuilder();
        char[] lllllllllllllllIIllIIlIIllIIIlll = lllllllllllllllIIllIIlIIllIIlIIl.toCharArray();
        int lllllllllllllllIIllIIlIIllIIIllI = lllIlIIIIIll[1];
        char[] lllllllllllllllIIllIIlIIllIIIIII = lllllllllllllllIIllIIlIIllIIlIlI.toCharArray();
        int lllllllllllllllIIllIIlIIlIllllll = lllllllllllllllIIllIIlIIllIIIIII.length;
        int lllllllllllllllIIllIIlIIlIlllllI = lllIlIIIIIll[1];
        while (h.lIIIlIllIlllllI(lllllllllllllllIIllIIlIIlIlllllI, lllllllllllllllIIllIIlIIlIllllll)) {
            char lllllllllllllllIIllIIlIIllIIlIll = lllllllllllllllIIllIIlIIllIIIIII[lllllllllllllllIIllIIlIIlIlllllI];
            lllllllllllllllIIllIIlIIllIIlIII.append((char)(lllllllllllllllIIllIIlIIllIIlIll ^ lllllllllllllllIIllIIlIIllIIIlll[lllllllllllllllIIllIIlIIllIIIllI % lllllllllllllllIIllIIlIIllIIIlll.length]));
            0;
            ++lllllllllllllllIIllIIlIIllIIIllI;
            ++lllllllllllllllIIllIIlIIlIlllllI;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIlIIllIIlIII);
    }

    @Inject
    public h(SquireHerblore squireHerblore, HerbloreConfig herbloreConfig) {
        c[] cArray = new c[lllIlIIIIIll[0]];
        cArray[h.lllIlIIIIIll[1]] = c.CLEAN_HERBS;
        cArray[h.lllIlIIIIIll[2]] = c.ALL_STAGES;
        cArray[h.lllIlIIIIIll[3]] = c.ALL_STAGES_ALL_HERBS;
        super(squireHerblore, herbloreConfig, cArray);
    }

    private static void lIIIlIllIlllIll() {
        lllIlIIIIIlI = new String[lllIlIIIIIll[2]];
        h.lllIlIIIIIlI[h.lllIlIIIIIll[1]] = h."Clean";
    }

    private static boolean lIIIlIllIlllllI(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void lllllllllllllllIIllIIlIIllIlIllI;
        h lllllllllllllllIIllIIlIIllIllIII;
        int n = this.j().herb().e();
        int[] nArray = new int[lllIlIIIIIll[2]];
        nArray[h.lllIlIIIIIll[1]] = n;
        List list = Inventory.getAll((int[])nArray);
        if (h.lIIIlIllIllllIl(list.isEmpty() ? 1 : 0)) {
            return lllIlIIIIIll[1];
        }
        int lllllllllllllllIIllIIlIIllIlIlIl = lllIlIIIIIll[1];
        while (h.lIIIlIllIlllllI(lllllllllllllllIIllIIlIIllIlIlIl, Math.min(lllllllllllllllIIllIIlIIllIllIII.j().perTick(), lllllllllllllllIIllIIlIIllIlIllI.size()))) {
            ((Item)lllllllllllllllIIllIIlIIllIlIllI.get(lllllllllllllllIIllIIlIIllIlIlIl)).interact(lllIlIIIIIlI[lllIlIIIIIll[1]]);
            ++lllllllllllllllIIllIIlIIllIlIlIl;
            0;
            if (-(0x1E ^ 0x1A) <= 0) continue;
            return ((0x34 ^ 0x7C) & ~(0x3F ^ 0x77)) != 0;
        }
        return lllIlIIIIIll[2];
    }
}

