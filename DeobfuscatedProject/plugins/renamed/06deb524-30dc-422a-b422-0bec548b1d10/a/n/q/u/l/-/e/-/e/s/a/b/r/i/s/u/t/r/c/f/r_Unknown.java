/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.AEnum;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.inject.Inject;
import net.runelite.api.Client;

public class r_Unknown {
    private final /* synthetic */ Map<Integer, Integer> an;
    static final /* synthetic */ boolean ao;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ Client g;
    private static /* synthetic */ int[] lIIlllIlIIII;

    /*
     * WARNING - void declaration
     */
    public int a(int ... nArray) {
        void var4;
        int n2 = lIIlllIlIIII[0];
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var9 = lIIlllIlIIII[0];
        while (r.llIlIIIIlIIlll(var9, (int)var4)) {
            r var1;
            void var11;
            void var7 = var11[var9];
            Optional<A> var10 = Arrays.stream(A.values()).filter(arg_0 -> r.a((int)var7, arg_0)).findFirst();
            if (r.llIlIIIIlIlIII(ao ? 1 : 0) && r.llIlIIIIlIlIII(var10.isPresent() ? 1 : 0)) {
                throw new AssertionError();
            }
            lllllllllllllllIlllIlIlllIIlllIl += var1.g.getVarbitValue(var10.get().O());
            ++var9;
            0;
            if (((0x6F ^ 0xC ^ (0xEA ^ 0xB6)) & (165 + 61 - 211 + 155 ^ 101 + 141 - 151 + 58 ^ -1)) == 0) continue;
            return (72 + 52 - 104 + 160 ^ 13 + 22 - -13 + 90) & (0x35 ^ 0x2B ^ (0x31 ^ 0x11) ^ -1);
        }
        return n2;
    }

    private static boolean llIlIIIIlIlIIl(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public void i() {
        void var3;
        A[] aArray = A.values();
        int n2 = aArray.length;
        int var2 = lIIlllIlIIII[0];
        while (r.llIlIIIIlIIlll(var2, (int)var3)) {
            r var5;
            void var8;
            void var6 = var8[var2];
            int[] nArray = new int[lIIlllIlIIII[1]];
            nArray[r.lIIlllIlIIII[0]] = var6.P();
            var5.an.put(var6.P(), var5.a(nArray));
            0;
            ++var2;
            0;
            if (3 < (0x1B ^ 0x33 ^ (0x24 ^ 8))) continue;
            return;
        }
    }

    public boolean b(int ... nArray) {
        boolean bl;
        if (r.llIlIIIIlIlIIl(this.a(nArray))) {
            bl = lIIlllIlIIII[1];
            0;
            if (3 < -1) {
                return false;
            }
        } else {
            bl = lIIlllIlIIII[0];
        }
        return bl;
    }

    public int A() {
        return lIIlllIlIIII[0];
    }

    private static /* synthetic */ boolean a(int n2, A a2) {
        boolean bl;
        if (r.llIlIIIIlIlIlI(a2.P(), n2)) {
            bl = lIIlllIlIIII[1];
            0;
            if ((0x7A ^ 0x54 ^ (0x9E ^ 0xB5)) == 0) {
                return false;
            }
        } else {
            bl = lIIlllIlIIII[0];
        }
        return bl;
    }

    private static boolean llIlIIIIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIIIIlIlIII(int n2) {
        return n2 == 0;
    }

    public void j() {
        this.an.clear();
    }

    public r() {
        this.an = new HashMap<Integer, Integer>();
    }

    static {
        block2: {
            int n2;
            block1: {
                block0: {
                    r.llIlIIIIlIIllI();
                    if (!r.llIlIIIIlIlIII(r.class.desiredAssertionStatus() ? 1 : 0)) break block0;
                    n2 = lIIlllIlIIII[1];
                    0;
                    if (null == null) break block1;
                    break block2;
                }
                n2 = lIIlllIlIIII[0];
            }
            ao = n2;
        }
    }

    public int c(int n2) {
        int[] nArray = new int[lIIlllIlIIII[1]];
        nArray[r.lIIlllIlIIII[0]] = n2;
        return this.a(nArray) - this.an.getOrDefault(n2, lIIlllIlIIII[0]);
    }

    private static boolean llIlIIIIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIIIIlIIllI() {
        lIIlllIlIIII = new int[4];
        r.lIIlllIlIIII[0] = (0x64 ^ 0x2C) & ~(0xD2 ^ 0x9A);
        r.lIIlllIlIIII[1] = 1;
        r.lIIlllIlIIII[2] = -(0xFFFFBF73 & 0x78BF) & (0xFFFFBDFF & 0x7BF7);
        r.lIIlllIlIIII[3] = 0x36 ^ 0x2D;
    }

    public boolean d(int n2) {
        boolean bl;
        int[] nArray = new int[lIIlllIlIIII[1]];
        nArray[r.lIIlllIlIIII[0]] = lIIlllIlIIII[2];
        int n3 = this.a(nArray);
        if (r.llIlIIIIlIIlll(n3, lIIlllIlIIII[3] * (n2 - this.A()))) {
            bl = lIIlllIlIIII[1];
            0;
            if (2 == 0) {
                return ((85 + 76 - 144 + 138 ^ 164 + 61 - 175 + 144) & (0x47 ^ 0x17 ^ (0x50 ^ 0x59) ^ -1)) != 0;
            }
        } else {
            bl = lIIlllIlIIII[0];
        }
        return bl;
    }
}

