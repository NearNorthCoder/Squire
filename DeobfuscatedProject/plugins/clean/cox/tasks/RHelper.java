/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.GameEnum26;
import java.util.Arrays;
import java.util.List;

public class RHelper {
    
    private static final  List[] cn;

    private static boolean llIlIlIlIIIlll(Object object) {
        return object == null;
    }

    public static boolean b(N[] nArray) {
        N[] var1;
        if (R.llIlIlIlIIIlll(nArray)) {
            return lIlIIIIlllII[0];
        }
        List var2 = null;
        Integer var3 = null;
        Integer var4 = null;
        int var5 = lIlIIIIlllII[0];
        int lllllllllllllllIlllIIIlIlIIlllII322 = lIlIIIIlllII[0];
        while (R.llIlIlIlIIlIII(lllllllllllllllIlllIIIlIlIIlllII322, var1.length)) {
            if (R.llIlIlIlIIlIIl((Object)var1[lllllllllllllllIlllIIIlIlIIlllII322]) && R.llIlIlIlIIlIlI((Object)var1[lllllllllllllllIlllIIIlIlIIlllII322].bY(), (Object)P.COMBAT)) {
                if (R.llIlIlIlIIlIlI((Object)var1[lllllllllllllllIlllIIIlIlIIlllII322], (Object)N.UNKNOWN_COMBAT)) {

                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    if (R.llIlIlIlIIIlll(var3)) {
                        var3 = lllllllllllllllIlllIIIlIlIIlllII322;
                    }
                    ++var5;
                }
            }
            ++lllllllllllllllIlllIIIlIlIIlllII322;

            return false;
        }
        if (R.llIlIlIlIIlIII(var5, lIlIIIIlllII[1])) {
            return lIlIIIIlllII[0];
        }
        if (R.llIlIlIlIIlIll(var5, var1.length)) {
            return lIlIIIIlllII[2];
        }
        List[] lllllllllllllllIlllIIIlIlIIlllII322 = cn;
        int var6 = lllllllllllllllIlllIIIlIlIIlllII322.length;
        int var7 = lIlIIIIlllII[0];
        while (R.llIlIlIlIIlIII(var7, var6)) {
            List var8 = lllllllllllllllIlllIIIlIlIIlllII322[var7];
            int var9 = lIlIIIIlllII[0];
            block2: while (R.llIlIlIlIIlIII(var9, var8.size())) {
                if (R.llIlIlIlIIlIlI((Object)var1[var3], var8.get(var9))) {
                    int var10 = var3 + lIlIIIIlllII[2];
                    while (R.llIlIlIlIIlIII(var10, var1.length)) {
                        if (R.llIlIlIlIIlIlI((Object)var1[var10].bY(), (Object)P.COMBAT)) {
                            if (R.llIlIlIlIIlIlI((Object)var1[var10], (Object)N.UNKNOWN_COMBAT)) {

                                if ((0x3E ^ 0x3A) == 0) {
                                    return false;
                                }
                            } else if (R.llIlIlIlIIllII((Object)var1[var10], var8.get(Math.floorMod(var9 + var10 - var3, var8.size())))) {

                                if ((39 + 26 - 60 + 141 ^ 50 + 39 - 45 + 106) > 2) break block2;
                                return ((113 + 146 - 157 + 58 ^ 23 + 140 - 123 + 140) & (0x88 ^ 0xA9 ^ (0x94 ^ 0xA1) ^ -1)) != 0;
                            }
                        }
                        ++var10;

                        if (3 >= 3) continue;
                        return false;
                    }
                    if (R.llIlIlIlIIlIIl(var2) && R.llIlIlIlIIllII(var2, var8)) {
                        return lIlIIIIlllII[0];
                    }
                    var4 = var9 - var3;
                    var2 = var8;
                }
                ++var9;

                if (3 == 3) continue;
                return ((0x4C ^ 0x48 ^ (0x4F ^ 1)) & (0x40 ^ 0x49 ^ (0x54 ^ 0x17) ^ -1)) != 0;
            }
            ++var7;

            if (-1 < 3) continue;
            return false;
        }
        if (R.llIlIlIlIIIlll(var2)) {
            return lIlIIIIlllII[0];
        }
        int lllllllllllllllIlllIIIlIlIIlllII322 = lIlIIIIlllII[0];
        while (R.llIlIlIlIIlIII(lllllllllllllllIlllIIIlIlIIlllII322, var1.length)) {
            if (R.llIlIlIlIIIlll((Object)var1[lllllllllllllllIlllIIIlIlIIlllII322])) {

                if (1 < -1) {
                    return false;
                }
            } else if (!R.llIlIlIlIIlIlI((Object)var1[lllllllllllllllIlllIIIlIlIIlllII322].bY(), (Object)P.COMBAT) || R.llIlIlIlIIlIlI((Object)var1[lllllllllllllllIlllIIIlIlIIlllII322], (Object)N.UNKNOWN_COMBAT)) {
                var1[lllllllllllllllIlllIIIlIlIIlllII322] = (N)((Object)var2.get(Math.floorMod(var4 + lllllllllllllllIlllIIIlIlIIlllII322, var2.size())));
            }
            ++lllllllllllllllIlllIIIlIlIIlllII322;

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

