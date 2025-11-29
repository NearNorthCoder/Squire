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

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.D_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.J_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.e_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.f_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.g_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.h_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o_Unknown;
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
public class G_Unknown {
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
        void var10;
        G var24;
        Instant instant = Instant.now();
        if (G.llIIllllIIlIIl(this.aI)) {
            this.aI = instant;
        }
        Duration var26 = Duration.between(var24.aI, (Temporal)var10);
        double var8 = (double)(var26.toMillis() / 1000L) / 3600.0;
        if (G.llIIllllIIlIlI(var26.isNegative() ? 1 : 0) && G.llIIllllIIIlll(G.llIIllllIIllIl(var8, 0.0))) {
            void var28;
            var24.aJ = (int)Math.floor((double)var28 / var8);
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
        G var3;
        void var22;
        h h2 = this.aG.X();
        if (G.llIIllllIIIlll(h2 instanceof f)) {
            return this.i(lIIllIlIIIlI[5]) + this.i(((f)h2).c());
        }
        if (G.llIIllllIIIlll(var22 instanceof g)) {
            return var3.i(((g)var22).c());
        }
        if (G.llIIllllIIIlll(var22 instanceof e)) {
            return var3.i(lIIllIlIIIlI[5]);
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
        void var5;
        int[] nArray;
        int[] nArray2 = new int[lIIllIlIIIlI[6]];
        nArray2[G.lIIllIlIIIlI[0]] = lIIllIlIIIlI[7];
        nArray2[G.lIIllIlIIIlI[1]] = lIIllIlIIIlI[8];
        nArray2[G.lIIllIlIIIlI[3]] = lIIllIlIIIlI[9];
        nArray2[G.lIIllIlIIIlI[10]] = lIIllIlIIIlI[11];
        nArray2[G.lIIllIlIIIlI[12]] = lIIllIlIIIlI[13];
        int[] nArray3 = nArray = nArray2;
        int n2 = nArray3.length;
        int var12 = lIIllIlIIIlI[0];
        while (G.llIIllllIIlIll(var12, (int)var5)) {
            G var29;
            void var17;
            void var19 = var17[var12];
            int var27 = var29.j.p().c((int)var19);
            if (G.llIIllllIIllII(var27)) {
                var29.aF.put((int)var19, var29.aF.getOrDefault((int)var19, lIIllIlIIIlI[0]) + var27);
                0;
            }
            ++var12;
            0;
            if (-1 == -1) continue;
            return;
        }
    }

    public int ah() {
        return this.aJ;
    }

    private static void llIIllllIIIllI() {
        lIIllIlIIIlI = new int[14];
        G.lIIllIlIIIlI[0] = (0xCE ^ 0xB8 ^ (0x1F ^ 0x52)) & (0xC ^ 0x3A ^ (0x8B ^ 0x86) ^ -1);
        G.lIIllIlIIIlI[1] = 1;
        G.lIIllIlIIIlI[2] = -(0xFFFF827A & 0x7F95) & (0xFFFFFAEF & 0x67BF);
        G.lIIllIlIIIlI[3] = 2;
        G.lIIllIlIIIlI[4] = 0xFFFFABDD & 0x55E7;
        G.lIIllIlIIIlI[5] = -(0xFFFFFFDF & 0x2E64) & (0xFFFFAFFF & Short.MAX_VALUE);
        G.lIIllIlIIIlI[6] = 0x7F ^ 0x7A;
        G.lIIllIlIIIlI[7] = 0xFFFFA9BD & 0x5F77;
        G.lIIllIlIIIlI[8] = 0xFFFFEF73 & 0x19BD;
        G.lIIllIlIIIlI[9] = -(0xFFFFF693 & 0x4BED) & (0xFFFFCFF7 & 0x7BBF);
        G.lIIllIlIIIlI[10] = 3;
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
        void var11;
        void var2;
        ItemContainer itemContainer = this.ac();
        if (G.llIIllllIIlIIl(itemContainer)) {
            return lIIllIlIIIlI[0];
        }
        int var20 = var2.count(var11.am());
        if (G.llIIllllIIlIlI(var11.ao())) {
            return var20;
        }
        int n2 = itemContainer.count(lIIllIlIIIlI[4]);
        return Math.min((int)var3_3, n2 / j2.ao());
    }

    /*
     * WARNING - void declaration
     */
    public double ae() {
        G var18;
        void var13;
        h h2 = this.aG.X();
        if (G.llIIllllIIIlll(h2 instanceof f)) {
            return this.j(lIIllIlIIIlI[5]) + this.j(((f)h2).c());
        }
        if (G.llIIllllIIIlll(var13 instanceof g)) {
            return var18.j(((g)var13).c());
        }
        if (G.llIIllllIIIlll(var13 instanceof e)) {
            return var18.j(lIIllIlIIIlI[5]);
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
            0;
            if (1 < -1) {
                return;
            }
        } else {
            lllllllllllllllIlllIllIlllllIIlI.aH += lIIllIlIIIlI[1];
        }
    }

    public int aa() {
        int n2 = lIIllIlIIIlI[0];
        Iterator<Integer> var14 = this.aF.keySet().iterator();
        while (G.llIIllllIIIlll(var14.hasNext() ? 1 : 0)) {
            G var9;
            int var6 = var14.next();
            lllllllllllllllIlllIllIllllIllII += var9.aF.getOrDefault(var6, lIIllIlIIIlI[0]).intValue();
            0;
            
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
        void var15;
        G var7;
        Instant instant = Instant.now();
        if (G.llIIllllIIlIIl(this.aI)) {
            this.aI = instant;
        }
        Duration var25 = Duration.between(var7.aI, (Temporal)var15);
        double var23 = (double)(var25.toMillis() / 1000L) / 3600.0;
        if (G.llIIllllIIlIlI(var25.isNegative() ? 1 : 0) && G.llIIllllIIIlll(G.llIIllllIIlllI(var23, 0.0))) {
            void var21;
            var7.aK = (int)Math.floor((double)(var21 / var23));
        }
    }

    private static boolean llIIllllIIllII(int n2) {
        return n2 > 0;
    }

    public double ab() {
        double d2 = 0.0;
        Iterator<Integer> var30 = this.aF.keySet().iterator();
        while (G.llIIllllIIIlll(var30.hasNext() ? 1 : 0)) {
            G var16;
            int var1 = var30.next();
            int var4 = var16.aF.getOrDefault(var1, lIIllIlIIIlI[0]);
            lllllllllllllllIlllIllIllllIIIll += J.o(var1).ap() * (double)var4;
            0;
            
            return 0.0;
        }
        this.b(d2);
        return d2;
    }
}

