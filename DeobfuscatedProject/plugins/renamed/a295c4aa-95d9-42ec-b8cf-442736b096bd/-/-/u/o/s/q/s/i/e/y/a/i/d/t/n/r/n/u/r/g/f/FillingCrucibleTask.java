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

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a_Unknown;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.b_Unknown;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j_Unknown;
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

/* TASK: Filling crucible -> FillingcrucibleTask */
@TaskDesc(name="Filling crucible", priority=150)
public class FillingCrucibleTask
extends j_Unknown {
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

    private static String lIIIIIllllIIlll(String var2, String var11) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var3 = var11.toCharArray();
        int var9 = llIlIllIlllI[0];
        char[] var6 = var2.toCharArray();
        int var4 = var6.length;
        int var1 = llIlIllIlllI[0];
        while (r.lIIIIIllllIllIl(var1, var4)) {
            char var7 = var6[var1];
            var8.append((char)(var7 ^ var3[var9 % var3.length]));
            0;
            ++var9;
            ++var1;
            0;
            if ((5 ^ 0) > 0) continue;
            return null;
        }
        return String.valueOf(var8);
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
        r var5;
        if (r.lIIIIIllllIlIlI(this.T.e() ? 1 : 0)) {
            return llIlIllIlllI[0];
        }
        if (r.lIIIIIllllIlIlI(var5.aq.u() ? 1 : 0)) {
            return llIlIllIlllI[0];
        }
        if (r.lIIIIIllllIlIlI(Bank.isOpen() ? 1 : 0)) {
            return llIlIllIlllI[0];
        }
        int[] nArray = new int[llIlIllIlllI[1]];
        nArray[r.llIlIllIlllI[0]] = llIlIllIlllI[2];
        TileObject var10 = TileObjects.getNearest((int[])nArray);
        if (r.lIIIIIllllIlIll(var10)) {
            return llIlIllIlllI[0];
        }
        int[] nArray2 = new int[llIlIllIlllI[1]];
        nArray2[r.llIlIllIlllI[0]] = var5.V.primaryBar().v();
        if (r.lIIIIIllllIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[llIlIllIlllI[1]];
            nArray3[r.llIlIllIlllI[0]] = var5.V.secondaryBar().v();
            if (r.lIIIIIllllIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIlIllIlllI[0];
            }
        }
        if (r.lIIIIIllllIlIlI(Production.isOpen() ? 1 : 0)) {
            int[] nArray4 = new int[llIlIllIlllI[1]];
            nArray4[r.llIlIllIlllI[0]] = var5.V.primaryBar().v();
            if (r.lIIIIIllllIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                Production.chooseOption((int)var5.V.primaryBar().w());
                var5.sleep(llIlIllIlllI[3]);
                return llIlIllIlllI[1];
            }
            int[] nArray5 = new int[llIlIllIlllI[1]];
            nArray5[r.llIlIllIlllI[0]] = var5.V.secondaryBar().v();
            if (r.lIIIIIllllIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                Production.chooseOption((int)var5.V.secondaryBar().w());
                var5.sleep(llIlIllIlllI[3]);
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

