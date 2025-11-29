/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.GameEnum21;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.inject.Inject;
import net.runelite.api.Client;

public class r {
    private final  Map<Integer, Integer> an;
    static final  boolean ao;
    @Inject
    private  SquireBlastFurnaceConfig i;
    @Inject
    private  Client g;

    /*
     * WARNING - void declaration
     */
    public int a(int ... nArray) {
        void var1;
        int n2 = lIIlllIlIIII[0];
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var2 = lIIlllIlIIII[0];
        while (r.llIlIIIIlIIlll(var2, (int)var1)) {
            r var3;
            void var4;
            void var5 = var4[var2];
            Optional<A> var6 = Arrays.stream(A.values()).filter(arg_0 -> r.a((int)var5, arg_0)).findFirst();
            if (r.llIlIIIIlIlIII(ao ? 1 : 0) && r.llIlIIIIlIlIII(var6.isPresent() ? 1 : 0)) {
                throw new AssertionError();
            }
            var7 += var3.g.getVarbitValue(var6.get().O());
            ++var2;

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
        void var8;
        A[] aArray = A.values();
        int n2 = aArray.length;
        int var9 = lIIlllIlIIII[0];
        while (r.llIlIIIIlIIlll(var9, (int)var8)) {
            r var10;
            void var11;
            void var12 = var11[var9];
            int[] nArray = new int[lIIlllIlIIII[1]];
            nArray[r.lIIlllIlIIII[0]] = var12.P();
            var10.an.put(var12.P(), var10.a(nArray));

            ++var9;

            if (3 < (0x1B ^ 0x33 ^ (0x24 ^ 8))) continue;
            return;
        }
    }

    public boolean b(int ... nArray) {
        boolean bl;
        if (r.llIlIIIIlIlIIl(this.a(nArray))) {
            bl = lIIlllIlIIII[1];

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

    private static  boolean a(int n2, A a2) {
        boolean bl;
        if (r.llIlIIIIlIlIlI(a2.P(), n2)) {
            bl = lIIlllIlIIII[1];

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

    public boolean d(int n2) {
        boolean bl;
        int[] nArray = new int[lIIlllIlIIII[1]];
        nArray[r.lIIlllIlIIII[0]] = lIIlllIlIIII[2];
        int n3 = this.a(nArray);
        if (r.llIlIIIIlIIlll(n3, lIIlllIlIIII[3] * (n2 - this.A()))) {
            bl = lIIlllIlIIII[1];

            if (2 == 0) {
                return ((85 + 76 - 144 + 138 ^ 164 + 61 - 175 + 144) & (0x47 ^ 0x17 ^ (0x50 ^ 0x59) ^ -1)) != 0;
            }
        } else {
            bl = lIIlllIlIIII[0];
        }
        return bl;
    }
}

