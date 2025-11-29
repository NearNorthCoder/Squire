/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.ItemContainer
 *  net.unethicalite.api.items.Equipment
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.J;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.e;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.f;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.g;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.h;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemContainer;
import net.unethicalite.api.items.Equipment;

@Singleton
public class G {
    private static /* synthetic */ int[] lIIllIlIIIlI;
    private /* synthetic */ Instant aI;
    private /* synthetic */ int aJ;
    private final /* synthetic */ Map<Integer, Integer> aF;
    private /* synthetic */ int aK;
    @Inject
    private /* synthetic */ o j;
    @Inject
    private /* synthetic */ Client g;
    private /* synthetic */ ItemContainer aL;
    private /* synthetic */ int aH;
    @Inject
    private /* synthetic */ D aG;

    /*
     * WARNING - void declaration
     */
    private void k(int n2) {
        void lllllllllllllllIlllIllIllIllIlII;
        G lllllllllllllllIlllIllIllIllIllI;
        Instant instant = Instant.now();
        if (G.llIIllllIIlIIl(this.aI)) {
            this.aI = instant;
        }
        Duration lllllllllllllllIlllIllIllIllIIll = Duration.between(lllllllllllllllIlllIllIllIllIllI.aI, (Temporal)lllllllllllllllIlllIllIllIllIlII);
        double lllllllllllllllIlllIllIllIllIIlI = (double)(lllllllllllllllIlllIllIllIllIIll.toMillis() / 1000L) / 3600.0;
        if (G.llIIllllIIlIlI(lllllllllllllllIlllIllIllIllIIll.isNegative() ? 1 : 0) && G.llIIllllIIIlll(G.llIIllllIIllIl(lllllllllllllllIlllIllIllIllIIlI, 0.0))) {
            void lllllllllllllllIlllIllIllIllIlIl;
            lllllllllllllllIlllIllIllIllIllI.aJ = (int)Math.floor((double)lllllllllllllllIlllIllIllIllIlIl / lllllllllllllllIlllIllIllIllIIlI);
        }
    }

    public G() {
        this.aF = new HashMap<Integer, Integer>();
        this.aH = lIIllIlIIIlI[0];
        this.aJ = lIIllIlIIIlI[0];
        this.aK = lIIllIlIIIlI[0];
    }

    private static boolean llIIllllIIlIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public int ad() {
        G lllllllllllllllIlllIllIlllIIllll;
        void lllllllllllllllIlllIllIlllIIlllI;
        h h2 = this.aG.X();
        if (G.llIIllllIIIlll(h2 instanceof f)) {
            return this.i(lIIllIlIIIlI[5]) + this.i(((f)h2).c());
        }
        if (G.llIIllllIIIlll(lllllllllllllllIlllIllIlllIIlllI instanceof g)) {
            return lllllllllllllllIlllIllIlllIIllll.i(((g)lllllllllllllllIlllIllIlllIIlllI).c());
        }
        if (G.llIIllllIIIlll(lllllllllllllllIlllIllIlllIIlllI instanceof e)) {
            return lllllllllllllllIlllIllIlllIIllll.i(lIIllIlIIIlI[5]);
        }
        return lIIllIlIIIlI[0];
    }

    private ItemContainer ac() {
        ItemContainer itemContainer = this.g.getItemContainer(InventoryID.BANK);
        if (G.llIIllllIIlIII(itemContainer)) {
            this.aL = itemContainer;
            return this.aL;
        }
        return this.aL;
    }

    private static int llIIllllIIlllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean llIIllllIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    public void T() {
        this.aF.clear();
        this.aH = lIIllIlIIIlI[0];
        this.aI = null;
    }

    private static boolean llIIllllIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIllllIIlIIl(Object object) {
        return object == null;
    }

    public int ag() {
        return this.aH;
    }

    private static int llIIllllIIllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    public void af() {
        void lllllllllllllllIlllIllIllIllllll;
        int[] nArray;
        int[] nArray2 = new int[lIIllIlIIIlI[6]];
        nArray2[G.lIIllIlIIIlI[0]] = lIIllIlIIIlI[7];
        nArray2[G.lIIllIlIIIlI[1]] = lIIllIlIIIlI[8];
        nArray2[G.lIIllIlIIIlI[3]] = lIIllIlIIIlI[9];
        nArray2[G.lIIllIlIIIlI[10]] = lIIllIlIIIlI[11];
        nArray2[G.lIIllIlIIIlI[12]] = lIIllIlIIIlI[13];
        int[] nArray3 = nArray = nArray2;
        int n2 = nArray3.length;
        int lllllllllllllllIlllIllIllIlllllI = lIIllIlIIIlI[0];
        while (G.llIIllllIIlIll(lllllllllllllllIlllIllIllIlllllI, (int)lllllllllllllllIlllIllIllIllllll)) {
            G lllllllllllllllIlllIllIlllIIIIlI;
            void lllllllllllllllIlllIllIlllIIIIII;
            void lllllllllllllllIlllIllIllIllllIl = lllllllllllllllIlllIllIlllIIIIII[lllllllllllllllIlllIllIllIlllllI];
            int lllllllllllllllIlllIllIllIllllII = lllllllllllllllIlllIllIlllIIIIlI.j.p().c((int)lllllllllllllllIlllIllIllIllllIl);
            if (G.llIIllllIIllII(lllllllllllllllIlllIllIllIllllII)) {
                lllllllllllllllIlllIllIlllIIIIlI.aF.put((int)lllllllllllllllIlllIllIllIllllIl, lllllllllllllllIlllIllIlllIIIIlI.aF.getOrDefault((int)lllllllllllllllIlllIllIllIllllIl, lIIllIlIIIlI[0]) + lllllllllllllllIlllIllIllIllllII);
                "".length();
            }
            ++lllllllllllllllIlllIllIllIlllllI;
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return;
        }
    }

    public int ah() {
        return this.aJ;
    }

    private static void llIIllllIIIllI() {
        lIIllIlIIIlI = new int[14];
        G.lIIllIlIIIlI[0] = (0xCE ^ 0xB8 ^ (0x1F ^ 0x52)) & (0xC ^ 0x3A ^ (0x8B ^ 0x86) ^ -" ".length());
        G.lIIllIlIIIlI[1] = " ".length();
        G.lIIllIlIIIlI[2] = -(0xFFFF827A & 0x7F95) & (0xFFFFFAEF & 0x67BF);
        G.lIIllIlIIIlI[3] = "  ".length();
        G.lIIllIlIIIlI[4] = 0xFFFFABDD & 0x55E7;
        G.lIIllIlIIIlI[5] = -(0xFFFFFFDF & 0x2E64) & (0xFFFFAFFF & Short.MAX_VALUE);
        G.lIIllIlIIIlI[6] = 0x7F ^ 0x7A;
        G.lIIllIlIIIlI[7] = 0xFFFFA9BD & 0x5F77;
        G.lIIllIlIIIlI[8] = 0xFFFFEF73 & 0x19BD;
        G.lIIllIlIIIlI[9] = -(0xFFFFF693 & 0x4BED) & (0xFFFFCFF7 & 0x7BBF);
        G.lIIllIlIIIlI[10] = "   ".length();
        G.lIIllIlIIIlI[11] = -(0xFFFFFF67 & 0x349F) & (0xFFFFBFBF & 0x7D7F);
        G.lIIllIlIIIlI[12] = 0x4E ^ 0x4A;
        G.lIIllIlIIIlI[13] = -(0xFFFFEDF7 & 0x560D) & (0xFFFFED7F & 0x5FBF);
    }

    public int ai() {
        return this.aK;
    }

    /*
     * WARNING - void declaration
     */
    private int a(J j2) {
        void var3_3;
        void lllllllllllllllIlllIllIlllIlIlIl;
        void lllllllllllllllIlllIllIlllIlIlII;
        ItemContainer itemContainer = this.ac();
        if (G.llIIllllIIlIIl(itemContainer)) {
            return lIIllIlIIIlI[0];
        }
        int lllllllllllllllIlllIllIlllIlIIll = lllllllllllllllIlllIllIlllIlIlII.count(lllllllllllllllIlllIllIlllIlIlIl.am());
        if (G.llIIllllIIlIlI(lllllllllllllllIlllIllIlllIlIlIl.ao())) {
            return lllllllllllllllIlllIllIlllIlIIll;
        }
        int n2 = itemContainer.count(lIIllIlIIIlI[4]);
        return Math.min((int)var3_3, n2 / j2.ao());
    }

    /*
     * WARNING - void declaration
     */
    public double ae() {
        G lllllllllllllllIlllIllIlllIIlIll;
        void lllllllllllllllIlllIllIlllIIlIlI;
        h h2 = this.aG.X();
        if (G.llIIllllIIIlll(h2 instanceof f)) {
            return this.j(lIIllIlIIIlI[5]) + this.j(((f)h2).c());
        }
        if (G.llIIllllIIIlll(lllllllllllllllIlllIllIlllIIlIlI instanceof g)) {
            return lllllllllllllllIlllIllIlllIIlIll.j(((g)lllllllllllllllIlllIllIlllIIlIlI).c());
        }
        if (G.llIIllllIIIlll(lllllllllllllllIlllIllIlllIIlIlI instanceof e)) {
            return lllllllllllllllIlllIllIlllIIlIll.j(lIIllIlIIIlI[5]);
        }
        return 0.0;
    }

    private int i(int n2) {
        return this.a(J.o(n2));
    }

    public void Z() {
        int[] nArray = new int[lIIllIlIIIlI[1]];
        nArray[G.lIIllIlIIIlI[0]] = lIIllIlIIIlI[2];
        if (G.llIIllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            this.aH += lIIllIlIIIlI[3];
            "".length();
            if (" ".length() < -" ".length()) {
                return;
            }
        } else {
            lllllllllllllllIlllIllIlllllIIlI.aH += lIIllIlIIIlI[1];
        }
    }

    public int aa() {
        int n2 = lIIllIlIIIlI[0];
        Iterator<Integer> lllllllllllllllIlllIllIllllIlIll = this.aF.keySet().iterator();
        while (G.llIIllllIIIlll(lllllllllllllllIlllIllIllllIlIll.hasNext() ? 1 : 0)) {
            G lllllllllllllllIlllIllIllllIllIl;
            int lllllllllllllllIlllIllIllllIlIlI = lllllllllllllllIlllIllIllllIlIll.next();
            lllllllllllllllIlllIllIllllIllII += lllllllllllllllIlllIllIllllIllIl.aF.getOrDefault(lllllllllllllllIlllIllIllllIlIlI, lIIllIlIIIlI[0]).intValue();
            "".length();
            if (null == null) continue;
            return (5 ^ 0x12) & ~(0x84 ^ 0x93);
        }
        this.k(n2);
        return n2;
    }

    static {
        G.llIIllllIIIllI();
    }

    private static boolean llIIllllIIlIII(Object object) {
        return object != null;
    }

    private double j(int n2) {
        return this.b(J.o(n2));
    }

    private double b(J j2) {
        return (double)this.a(j2) * j2.ap();
    }

    /*
     * WARNING - void declaration
     */
    private void b(double d2) {
        void lllllllllllllllIlllIllIllIlIlIlI;
        G lllllllllllllllIlllIllIllIlIllII;
        Instant instant = Instant.now();
        if (G.llIIllllIIlIIl(this.aI)) {
            this.aI = instant;
        }
        Duration lllllllllllllllIlllIllIllIlIlIIl = Duration.between(lllllllllllllllIlllIllIllIlIllII.aI, (Temporal)lllllllllllllllIlllIllIllIlIlIlI);
        double lllllllllllllllIlllIllIllIlIlIII = (double)(lllllllllllllllIlllIllIllIlIlIIl.toMillis() / 1000L) / 3600.0;
        if (G.llIIllllIIlIlI(lllllllllllllllIlllIllIllIlIlIIl.isNegative() ? 1 : 0) && G.llIIllllIIIlll(G.llIIllllIIlllI(lllllllllllllllIlllIllIllIlIlIII, 0.0))) {
            void lllllllllllllllIlllIllIllIlIlIll;
            lllllllllllllllIlllIllIllIlIllII.aK = (int)Math.floor((double)(lllllllllllllllIlllIllIllIlIlIll / lllllllllllllllIlllIllIllIlIlIII));
        }
    }

    private static boolean llIIllllIIllII(int n2) {
        return n2 > 0;
    }

    public double ab() {
        double d2 = 0.0;
        Iterator<Integer> lllllllllllllllIlllIllIllllIIIlI = this.aF.keySet().iterator();
        while (G.llIIllllIIIlll(lllllllllllllllIlllIllIllllIIIlI.hasNext() ? 1 : 0)) {
            G lllllllllllllllIlllIllIllllIIlII;
            int lllllllllllllllIlllIllIllllIIIIl = lllllllllllllllIlllIllIllllIIIlI.next();
            int lllllllllllllllIlllIllIllllIIIII = lllllllllllllllIlllIllIllllIIlII.aF.getOrDefault(lllllllllllllllIlllIllIllllIIIIl, lIIllIlIIIlI[0]);
            lllllllllllllllIlllIllIllllIIIll += J.o(lllllllllllllllIlllIllIllllIIIIl).ap() * (double)lllllllllllllllIlllIllIllllIIIII;
            "".length();
            if (null == null) continue;
            return 0.0;
        }
        this.b(d2);
        return d2;
    }
}

