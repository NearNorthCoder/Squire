/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PEnum;
import java.util.Arrays;
import java.util.List;

public class R_Unknown {
    private static /* synthetic */ int[] lIlIIIIlllII;
    private static final /* synthetic */ List[] cn;

    private static boolean llIlIlIlIIIlll(Object object) {
        return object == null;
    }

    private static void llIlIlIlIIIllI() {
        lIlIIIIlllII = new int[9];
        R.lIlIIIIlllII[0] = (0xC2 ^ 0x83) & ~(0xC7 ^ 0x86);
        R.lIlIIIIlllII[1] = 2;
        R.lIlIIIIlllII[2] = 1;
        R.lIlIIIIlllII[3] = 0x84 ^ 0x80;
        R.lIlIIIIlllII[4] = 2 ^ 0xA;
        R.lIlIIIIlllII[5] = 3;
        R.lIlIIIIlllII[6] = 0xAB ^ 0xAE;
        R.lIlIIIIlllII[7] = 0x34 ^ 0x32;
        R.lIlIIIIlllII[8] = 0x4A ^ 0x4D;
    }

    public static boolean b(N[] nArray) {
        N[] var3;
        if (R.llIlIlIlIIIlll(nArray)) {
            return lIlIIIIlllII[0];
        }
        List var2 = null;
        Integer var1 = null;
        Integer var6 = null;
        int var7 = lIlIIIIlllII[0];
        int lllllllllllllllIlllIIIlIlIIlllII322 = lIlIIIIlllII[0];
        while (R.llIlIlIlIIlIII(lllllllllllllllIlllIIIlIlIIlllII322, var3.length)) {
            if (R.llIlIlIlIIlIIl((Object)var3[lllllllllllllllIlllIIIlIlIIlllII322]) && R.llIlIlIlIIlIlI((Object)var3[lllllllllllllllIlllIIIlIlIIlllII322].bY(), (Object)P.COMBAT)) {
                if (R.llIlIlIlIIlIlI((Object)var3[lllllllllllllllIlllIIIlIlIIlllII322], (Object)N.UNKNOWN_COMBAT)) {
                    0;
                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    if (R.llIlIlIlIIIlll(var1)) {
                        var1 = lllllllllllllllIlllIIIlIlIIlllII322;
                    }
                    ++var7;
                }
            }
            ++lllllllllllllllIlllIIIlIlIIlllII322;
            0;
            
            return false;
        }
        if (R.llIlIlIlIIlIII(var7, lIlIIIIlllII[1])) {
            return lIlIIIIlllII[0];
        }
        if (R.llIlIlIlIIlIll(var7, var3.length)) {
            return lIlIIIIlllII[2];
        }
        List[] lllllllllllllllIlllIIIlIlIIlllII322 = cn;
        int var4 = lllllllllllllllIlllIIIlIlIIlllII322.length;
        int var8 = lIlIIIIlllII[0];
        while (R.llIlIlIlIIlIII(var8, var4)) {
            List var10 = lllllllllllllllIlllIIIlIlIIlllII322[var8];
            int var9 = lIlIIIIlllII[0];
            block2: while (R.llIlIlIlIIlIII(var9, var10.size())) {
                if (R.llIlIlIlIIlIlI((Object)var3[var1], var10.get(var9))) {
                    int var5 = var1 + lIlIIIIlllII[2];
                    while (R.llIlIlIlIIlIII(var5, var3.length)) {
                        if (R.llIlIlIlIIlIlI((Object)var3[var5].bY(), (Object)P.COMBAT)) {
                            if (R.llIlIlIlIIlIlI((Object)var3[var5], (Object)N.UNKNOWN_COMBAT)) {
                                0;
                                if ((0x3E ^ 0x3A) == 0) {
                                    return false;
                                }
                            } else if (R.llIlIlIlIIllII((Object)var3[var5], var10.get(Math.floorMod(var9 + var5 - var1, var10.size())))) {
                                0;
                                if ((39 + 26 - 60 + 141 ^ 50 + 39 - 45 + 106) > 2) break block2;
                                return ((113 + 146 - 157 + 58 ^ 23 + 140 - 123 + 140) & (0x88 ^ 0xA9 ^ (0x94 ^ 0xA1) ^ -1)) != 0;
                            }
                        }
                        ++var5;
                        0;
                        if (3 >= 3) continue;
                        return false;
                    }
                    if (R.llIlIlIlIIlIIl(var2) && R.llIlIlIlIIllII(var2, var10)) {
                        return lIlIIIIlllII[0];
                    }
                    var6 = var9 - var1;
                    var2 = var10;
                }
                ++var9;
                0;
                if (3 == 3) continue;
                return ((0x4C ^ 0x48 ^ (0x4F ^ 1)) & (0x40 ^ 0x49 ^ (0x54 ^ 0x17) ^ -1)) != 0;
            }
            ++var8;
            0;
            if (-1 < 3) continue;
            return false;
        }
        if (R.llIlIlIlIIIlll(var2)) {
            return lIlIIIIlllII[0];
        }
        int lllllllllllllllIlllIIIlIlIIlllII322 = lIlIIIIlllII[0];
        while (R.llIlIlIlIIlIII(lllllllllllllllIlllIIIlIlIIlllII322, var3.length)) {
            if (R.llIlIlIlIIIlll((Object)var3[lllllllllllllllIlllIIIlIlIIlllII322])) {
                0;
                if (1 < -1) {
                    return false;
                }
            } else if (!R.llIlIlIlIIlIlI((Object)var3[lllllllllllllllIlllIIIlIlIIlllII322].bY(), (Object)P.COMBAT) || R.llIlIlIlIIlIlI((Object)var3[lllllllllllllllIlllIIIlIlIIlllII322], (Object)N.UNKNOWN_COMBAT)) {
                var3[lllllllllllllllIlllIIIlIlIIlllII322] = (N)((Object)var2.get(Math.floorMod(var6 + lllllllllllllllIlllIIIlIlIIlllII322, var2.size())));
            }
            ++lllllllllllllllIlllIIIlIlIIlllII322;
            0;
            if ((17 + 162 - 177 + 171 ^ 84 + 139 - 63 + 8) != 0) continue;
            return ((0x19 ^ 0x28 ^ (2 ^ 7)) & (23 + 26 - -34 + 49 ^ 82 + 172 - 230 + 152 ^ -1)) != 0;
        }
        return lIlIIIIlllII[2];
    }

    private static boolean llIlIlIlIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIlIlIIllII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlIlIlIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIlIlIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIlIIlIIl(Object object) {
        return object != null;
    }

    static {
        R.llIlIlIlIIIllI();
        List[] listArray = new List[lIlIIIIlllII[3]];
        N[] nArray = new N[lIlIIIIlllII[4]];
        nArray[R.lIlIIIIlllII[0]] = N.TEKTON;
        nArray[R.lIlIIIIlllII[2]] = N.VASA;
        nArray[R.lIlIIIIlllII[1]] = N.GUARDIANS;
        nArray[R.lIlIIIIlllII[5]] = N.MYSTICS;
        nArray[R.lIlIIIIlllII[3]] = N.SHAMANS;
        nArray[R.lIlIIIIlllII[6]] = N.MUTTADILES;
        nArray[R.lIlIIIIlllII[7]] = N.VANGUARDS;
        nArray[R.lIlIIIIlllII[8]] = N.VESPULA;
        listArray[R.lIlIIIIlllII[0]] = Arrays.asList(nArray);
        N[] nArray2 = new N[lIlIIIIlllII[4]];
        nArray2[R.lIlIIIIlllII[0]] = N.TEKTON;
        nArray2[R.lIlIIIIlllII[2]] = N.MUTTADILES;
        nArray2[R.lIlIIIIlllII[1]] = N.GUARDIANS;
        nArray2[R.lIlIIIIlllII[5]] = N.VESPULA;
        nArray2[R.lIlIIIIlllII[3]] = N.SHAMANS;
        nArray2[R.lIlIIIIlllII[6]] = N.VASA;
        nArray2[R.lIlIIIIlllII[7]] = N.VANGUARDS;
        nArray2[R.lIlIIIIlllII[8]] = N.MYSTICS;
        listArray[R.lIlIIIIlllII[2]] = Arrays.asList(nArray2);
        N[] nArray3 = new N[lIlIIIIlllII[4]];
        nArray3[R.lIlIIIIlllII[0]] = N.VESPULA;
        nArray3[R.lIlIIIIlllII[2]] = N.VANGUARDS;
        nArray3[R.lIlIIIIlllII[1]] = N.MUTTADILES;
        nArray3[R.lIlIIIIlllII[5]] = N.SHAMANS;
        nArray3[R.lIlIIIIlllII[3]] = N.MYSTICS;
        nArray3[R.lIlIIIIlllII[6]] = N.GUARDIANS;
        nArray3[R.lIlIIIIlllII[7]] = N.VASA;
        nArray3[R.lIlIIIIlllII[8]] = N.TEKTON;
        listArray[R.lIlIIIIlllII[1]] = Arrays.asList(nArray3);
        N[] nArray4 = new N[lIlIIIIlllII[4]];
        nArray4[R.lIlIIIIlllII[0]] = N.MYSTICS;
        nArray4[R.lIlIIIIlllII[2]] = N.VANGUARDS;
        nArray4[R.lIlIIIIlllII[1]] = N.VASA;
        nArray4[R.lIlIIIIlllII[5]] = N.SHAMANS;
        nArray4[R.lIlIIIIlllII[3]] = N.VESPULA;
        nArray4[R.lIlIIIIlllII[6]] = N.GUARDIANS;
        nArray4[R.lIlIIIIlllII[7]] = N.MUTTADILES;
        nArray4[R.lIlIIIIlllII[8]] = N.TEKTON;
        listArray[R.lIlIIIIlllII[5]] = Arrays.asList(nArray4);
        cn = listArray;
    }
}

