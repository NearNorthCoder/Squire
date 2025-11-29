/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.b;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Filling crucible", priority=150)
public class r
extends j {
    private static /* synthetic */ int[] llIlIllIlllI;
    private static /* synthetic */ String[] llIlIllIllIl;
    @Inject
    private /* synthetic */ b aq;

    static {
        r.lIIIIIllllIlIIl();
        r.lIIIIIllllIlIII();
    }

    private static boolean lIIIIIllllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIIIllllIIlll(String lllllllllllllllIlIIIIIlIlIlllIII, String lllllllllllllllIlIIIIIlIlIllIlll) {
        lllllllllllllllIlIIIIIlIlIlllIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIlIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIIlIlIlllIll = new StringBuilder();
        char[] lllllllllllllllIlIIIIIlIlIlllIlI = lllllllllllllllIlIIIIIlIlIllIlll.toCharArray();
        int lllllllllllllllIlIIIIIlIlIlllIIl = llIlIllIlllI[0];
        char[] lllllllllllllllIlIIIIIlIlIllIIll = lllllllllllllllIlIIIIIlIlIlllIII.toCharArray();
        int lllllllllllllllIlIIIIIlIlIllIIlI = lllllllllllllllIlIIIIIlIlIllIIll.length;
        int lllllllllllllllIlIIIIIlIlIllIIIl = llIlIllIlllI[0];
        while (r.lIIIIIllllIllIl(lllllllllllllllIlIIIIIlIlIllIIIl, lllllllllllllllIlIIIIIlIlIllIIlI)) {
            char lllllllllllllllIlIIIIIlIlIlllllI = lllllllllllllllIlIIIIIlIlIllIIll[lllllllllllllllIlIIIIIlIlIllIIIl];
            lllllllllllllllIlIIIIIlIlIlllIll.append((char)(lllllllllllllllIlIIIIIlIlIlllllI ^ lllllllllllllllIlIIIIIlIlIlllIlI[lllllllllllllllIlIIIIIlIlIlllIIl % lllllllllllllllIlIIIIIlIlIlllIlI.length]));
            0;
            ++lllllllllllllllIlIIIIIlIlIlllIIl;
            ++lllllllllllllllIlIIIIIlIlIllIIIl;
            0;
            if ((5 ^ 0) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIIIlIlIlllIll);
    }

    private static boolean lIIIIIllllIlIlI(int n2) {
        return n2 != 0;
    }

    private static void lIIIIIllllIlIII() {
        llIlIllIllIl = new String[llIlIllIlllI[1]];
        r.llIlIllIllIl[r.llIlIllIlllI[0]] = r."Fill";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var1_1;
        r lllllllllllllllIlIIIIIlIllIIlIIl;
        if (r.lIIIIIllllIlIlI(this.T.e() ? 1 : 0)) {
            return llIlIllIlllI[0];
        }
        if (r.lIIIIIllllIlIlI(lllllllllllllllIlIIIIIlIllIIlIIl.aq.u() ? 1 : 0)) {
            return llIlIllIlllI[0];
        }
        if (r.lIIIIIllllIlIlI(Bank.isOpen() ? 1 : 0)) {
            return llIlIllIlllI[0];
        }
        int[] nArray = new int[llIlIllIlllI[1]];
        nArray[r.llIlIllIlllI[0]] = llIlIllIlllI[2];
        TileObject lllllllllllllllIlIIIIIlIllIIlIII = TileObjects.getNearest((int[])nArray);
        if (r.lIIIIIllllIlIll(lllllllllllllllIlIIIIIlIllIIlIII)) {
            return llIlIllIlllI[0];
        }
        int[] nArray2 = new int[llIlIllIlllI[1]];
        nArray2[r.llIlIllIlllI[0]] = lllllllllllllllIlIIIIIlIllIIlIIl.V.primaryBar().v();
        if (r.lIIIIIllllIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[llIlIllIlllI[1]];
            nArray3[r.llIlIllIlllI[0]] = lllllllllllllllIlIIIIIlIllIIlIIl.V.secondaryBar().v();
            if (r.lIIIIIllllIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIlIllIlllI[0];
            }
        }
        if (r.lIIIIIllllIlIlI(Production.isOpen() ? 1 : 0)) {
            int[] nArray4 = new int[llIlIllIlllI[1]];
            nArray4[r.llIlIllIlllI[0]] = lllllllllllllllIlIIIIIlIllIIlIIl.V.primaryBar().v();
            if (r.lIIIIIllllIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                Production.chooseOption((int)lllllllllllllllIlIIIIIlIllIIlIIl.V.primaryBar().w());
                lllllllllllllllIlIIIIIlIllIIlIIl.sleep(llIlIllIlllI[3]);
                return llIlIllIlllI[1];
            }
            int[] nArray5 = new int[llIlIllIlllI[1]];
            nArray5[r.llIlIllIlllI[0]] = lllllllllllllllIlIIIIIlIllIIlIIl.V.secondaryBar().v();
            if (r.lIIIIIllllIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                Production.chooseOption((int)lllllllllllllllIlIIIIIlIllIIlIIl.V.secondaryBar().w());
                lllllllllllllllIlIIIIIlIllIIlIIl.sleep(llIlIllIlllI[3]);
                return llIlIllIlllI[1];
            }
        }
        var1_1.interact(llIlIllIllIl[llIlIllIlllI[0]]);
        return llIlIllIlllI[1];
    }

    @Inject
    public r(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    private static boolean lIIIIIllllIllII(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIllllIlIIl() {
        llIlIllIlllI = new int[4];
        r.llIlIllIlllI[0] = (0x18 ^ 0x32) & ~(0x3E ^ 0x14);
        r.llIlIllIlllI[1] = 1;
        r.llIlIllIlllI[2] = -(0xFFFFDDF6 & 0x631D) & (0xFFFFFFFF & 0xEFFB);
        r.llIlIllIlllI[3] = 1 ^ 5;
    }

    private static boolean lIIIIIllllIlIll(Object object) {
        return object == null;
    }
}

