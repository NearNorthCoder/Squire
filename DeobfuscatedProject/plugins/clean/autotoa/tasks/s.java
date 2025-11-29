/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.autotoa.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.runelite.api.coords.WorldPoint;

public class s {
    private final  Map<WorldPoint, Boolean> aO;
    private  List<WorldPoint> aP;

    private static boolean lIlIlIlIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> af() {
        void var1_1;
        s var1;
        List<Object> var2 = new ArrayList();
        if (s.lIlIlIlIllIIIl(var1.a(var1.aO) ? 1 : 0)) {
            return Collections.emptyList();
        }
        Iterator<WorldPoint> var3 = var1.aO.keySet().iterator();
        while (s.lIlIlIlIllIIIl(var3.hasNext() ? 1 : 0)) {
            WorldPoint var4 = var3.next();
            List<WorldPoint> var5 = new ArrayList<WorldPoint>();
            var5.add(var4);

            var5 = var1.a(var1.aO, var4, var5, llIlllIIIIl[0]);
            if (s.lIlIlIlIllIIIl(var5.isEmpty() ? 1 : 0)) {

                if (3 == 3) continue;
                return null;
            }
            if (!s.lIlIlIlIllIIlI(var2.isEmpty() ? 1 : 0) || s.lIlIlIlIllIIll(var2.size(), var5.size())) {
                var2 = var5;
            }

            if ((0x70 ^ 0x75) > 0) continue;
            return null;
        }
        return var1_1;
    }

    private boolean a(Map<WorldPoint, Boolean> map) {
        Iterator<Boolean> var6 = map.values().iterator();
        while (s.lIlIlIlIllIIIl(var6.hasNext() ? 1 : 0)) {
            int var7 = var6.next().booleanValue() ? 1 : 0;
            if (s.lIlIlIlIllIIlI(var7)) {
                return llIlllIIIIl[3];
            }

            if (((0x3B ^ 0x78) & ~(0x50 ^ 0x13)) == 0) continue;
            return false;
        }
        return llIlllIIIIl[2];
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(Map<WorldPoint, Boolean> map, WorldPoint worldPoint, List<WorldPoint> list, int n2) {
        int llllllllllllllllIIlIlIlllIlIIIII2;
        int n3;
        void var8;
        s var9;
        void var10;
        void var11;
        if (s.lIlIlIlIllIIll(list.size(), n2)) {
            return Collections.emptyList();
        }
        HashMap<WorldPoint, Boolean> var12 = new HashMap<WorldPoint, Boolean>();
        Object var13 = var11.keySet().iterator();
        while (s.lIlIlIlIllIIIl(var13.hasNext() ? 1 : 0)) {
            WorldPoint llllllllllllllllIIlIlIlllIlIIIII2 = (WorldPoint)var13.next();
            if (s.lIlIlIlIllIlII(llllllllllllllllIIlIlIlllIlIIIII2.distanceTo2D((WorldPoint)var10), llIlllIIIIl[1]) && (!s.lIlIlIlIllIlIl(llllllllllllllllIIlIlIlllIlIIIII2.getX(), var10.getX()) || s.lIlIlIlIllIllI(llllllllllllllllIIlIlIlllIlIIIII2.getY(), var10.getY()))) {
                boolean bl2;
                if (s.lIlIlIlIllIIlI(((Boolean)var11.get(llllllllllllllllIIlIlIlllIlIIIII2)).booleanValue() ? 1 : 0)) {
                    bl2 = llIlllIIIIl[2];

                    if (-(155 + 52 - 72 + 52 ^ 4 + 3 - -11 + 172) >= 0) {
                        return null;
                    }
                } else {
                    bl2 = llIlllIIIIl[3];
                }
                var12.put(llllllllllllllllIIlIlIlllIlIIIII2, bl2);

                if (((121 + 148 - 234 + 138 ^ 18 + 109 - 10 + 19) & (0xBC ^ 0xAA ^ (0x3D ^ 0xE) ^ -1)) != 0) {
                    return null;
                }
            } else {
                var12.put(llllllllllllllllIIlIlIlllIlIIIII2, (Boolean)var11.get(llllllllllllllllIIlIlIlllIlIIIII2));

            }

            if (-1 < 0) continue;
            return null;
        }
        if (s.lIlIlIlIllIIIl(var9.a(var12) ? 1 : 0)) {
            return var8;
        }
        var13 = new ArrayList(var12.keySet());
        Collections.shuffle(var13);
        if (s.lIlIlIlIllIIIl(var9.aP.isEmpty() ? 1 : 0)) {
            n3 = llIlllIIIIl[4];

        } else {
            n3 = llllllllllllllllIIlIlIlllIlIIIII2 = var9.aP.size();
        }
        if (s.lIlIlIlIllIlll(var8.size(), llllllllllllllllIIlIlIlllIlIIIII2)) {
            return var9.aP;
        }
        Iterator var14 = var13.iterator();
        while (s.lIlIlIlIllIIIl(var14.hasNext() ? 1 : 0)) {
            void var15;
            WorldPoint var16 = (WorldPoint)var14.next();
            if (s.lIlIlIlIllIIIl(var16.equals((Object)var10) ? 1 : 0)) {

                if (-1 <= 0) continue;
                return null;
            }
            ArrayList<WorldPoint> var17 = new ArrayList<WorldPoint>((Collection<WorldPoint>)var8);
            var17.add(var16);

            List<WorldPoint> var18 = var9.a(var12, var16, var17, (int)var15);
            if (s.lIlIlIlIllIIIl(var18.isEmpty() ? 1 : 0)) {

                if (-1 < 0) continue;
                return null;
            }
            if (s.lIlIlIlIlllIII(var18.size(), llllllllllllllllIIlIlIlllIlIIIII2)) {
                var9.aP = var18;
            }

            if ((38 + 124 - 91 + 61 ^ 102 + 72 - 96 + 50) != 0) continue;
            return null;
        }
        return this.aP;
    }

    private static boolean lIlIlIlIllIIll(int n2, int n3) {
        return n2 > n3;
    }

    public s(Map<WorldPoint, Boolean> map) {
        this.aP = new ArrayList<WorldPoint>();
        this.aO = map;
    }

    private static boolean lIlIlIlIllIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIllIllI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        s.lIlIlIlIllIIII();
    }

    private static boolean lIlIlIlIllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIlIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIllIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIlIllIlIl(int n2, int n3) {
        return n2 != n3;
    }
}

