/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.GameEnum3;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.inject.Inject;
import net.runelite.api.Client;

public class RHelper {
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
        void var2;
        int n2 = 0;
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var3 = 0;
        while ((var3 < (int)var2)) {
            r var4;
            void var5;
            void var6 = var5[var3];
            Optional<A> var7 = Arrays.stream(A.values()).filter(arg_0 -> r.a((int)var6, arg_0)).findFirst();
            if ((ao == 0) && (var7.isPresent( == 0) ? 1 : 0)) {
                throw new AssertionError();
            }
            var8 += var4.g.getVarbitValue(var7.get().O());
            ++var3;
            0;
            if (((0x6F ^ 0xC ^ (0xEA ^ 0xB6)) & (165 + 61 - 211 + 155 ^ 101 + 141 - 151 + 58 ^ -1)) == 0) continue;
            return (72 + 52 - 104 + 160 ^ 13 + 22 - -13 + 90) & (0x35 ^ 0x2B ^ (0x31 ^ 0x11) ^ -1);
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public void i() {
        void var9;
        A[] aArray = A.values();
        int n2 = aArray.length;
        int var10 = 0;
        while ((var10 < (int)var9)) {
            r var11;
            void var12;
            void var13 = var12[var10];
            int[] nArray = new int[1];
            nArray[0] = var13.P();
            var11.an.put(var13.P(), var11.a(nArray));
            0;
            ++var10;
            0;
            if (3 < (0x1B ^ 0x33 ^ (0x24 ^ 8))) continue;
            return;
        }
    }

    public boolean b(int ... nArray) {
        boolean bl;
        if ((this.a(nArray > 0))) {
            bl = 1;
            0;
            if (3 < -1) {
                return ((0x7F ^ 0x45) & ~(0xA4 ^ 0x9E)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    public int A() {
        return 0;
    }

    private static  boolean a(int n2, A a2) {
        boolean bl;
        if ((a2.P() == n2)) {
            bl = 1;
            0;
            if ((0x7A ^ 0x54 ^ (0x9E ^ 0xB5)) == 0) {
                return ((0x2B ^ 0x71 ^ 1) & (25 + 38 - 11 + 107 ^ 56 + 46 - 41 + 135 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    public void j() {
        this.an.clear();
    }

    public RHelper() {
        this.an = new HashMap<Integer, Integer>();
    }

    static {
        block2: {
            int n2;
            block1: {
                block0: {
                    r.var14();
                    if (!(RHelper.class.desiredAssertionStatus( == 0) ? 1 : 0)) break block0;
                    n2 = 1;
                    0;
                    if null == null break block1;
                    break block2;
                }
                n2 = 0;
            }
            ao = n2;
        }
    }

    public int c(int n2) {
        int[] nArray = new int[1];
        nArray[0] = n2;
        return this.a(nArray) - this.an.getOrDefault(n2, 0);
    }

    public boolean d(int n2) {
        boolean bl;
        int[] nArray = new int[1];
        nArray[0] = 2;
        int n3 = this.a(nArray);
        if ((3 * (n2 - this.A( < 3 * (n2 - this.A()))) {
            bl = 1;
            0;
            
        } else {
            bl = 0;
        }
        return bl;
    }
}

