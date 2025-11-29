/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.runelite.api.coords.WorldPoint;

public class s {
    private final /* synthetic */ Map<WorldPoint, Boolean> aO;
    private /* synthetic */ List<WorldPoint> aP;
    private static /* synthetic */ int[] llIlllIIIIl;

    private static boolean lIlIlIlIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> af() {
        void var1_1;
        s var18;
        List<Object> var9 = new ArrayList();
        if (s.lIlIlIlIllIIIl(var18.a(var18.aO) ? 1 : 0)) {
            return Collections.emptyList();
        }
        Iterator<WorldPoint> var12 = var18.aO.keySet().iterator();
        while (s.lIlIlIlIllIIIl(var12.hasNext() ? 1 : 0)) {
            WorldPoint var2 = var12.next();
            List<WorldPoint> var13 = new ArrayList<WorldPoint>();
            var13.add(var2);
            0;
            var13 = var18.a(var18.aO, var2, var13, llIlllIIIIl[0]);
            if (s.lIlIlIlIllIIIl(var13.isEmpty() ? 1 : 0)) {
                0;
                if (3 == 3) continue;
                return null;
            }
            if (!s.lIlIlIlIllIIlI(var9.isEmpty() ? 1 : 0) || s.lIlIlIlIllIIll(var9.size(), var13.size())) {
                var9 = var13;
            }
            0;
            if ((0x70 ^ 0x75) > 0) continue;
            return null;
        }
        return var1_1;
    }

    private boolean a(Map<WorldPoint, Boolean> map) {
        Iterator<Boolean> var5 = map.values().iterator();
        while (s.lIlIlIlIllIIIl(var5.hasNext() ? 1 : 0)) {
            int var16 = var5.next().booleanValue() ? 1 : 0;
            if (s.lIlIlIlIllIIlI(var16)) {
                return llIlllIIIIl[3];
            }
            0;
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
        void var14;
        s var15;
        void var8;
        void var17;
        if (s.lIlIlIlIllIIll(list.size(), n2)) {
            return Collections.emptyList();
        }
        HashMap<WorldPoint, Boolean> var3 = new HashMap<WorldPoint, Boolean>();
        Object var7 = var17.keySet().iterator();
        while (s.lIlIlIlIllIIIl(var7.hasNext() ? 1 : 0)) {
            WorldPoint llllllllllllllllIIlIlIlllIlIIIII2 = (WorldPoint)var7.next();
            if (s.lIlIlIlIllIlII(llllllllllllllllIIlIlIlllIlIIIII2.distanceTo2D((WorldPoint)var8), llIlllIIIIl[1]) && (!s.lIlIlIlIllIlIl(llllllllllllllllIIlIlIlllIlIIIII2.getX(), var8.getX()) || s.lIlIlIlIllIllI(llllllllllllllllIIlIlIlllIlIIIII2.getY(), var8.getY()))) {
                boolean bl2;
                if (s.lIlIlIlIllIIlI(((Boolean)var17.get(llllllllllllllllIIlIlIlllIlIIIII2)).booleanValue() ? 1 : 0)) {
                    bl2 = llIlllIIIIl[2];
                    0;
                    if (-(155 + 52 - 72 + 52 ^ 4 + 3 - -11 + 172) >= 0) {
                        return null;
                    }
                } else {
                    bl2 = llIlllIIIIl[3];
                }
                var3.put(llllllllllllllllIIlIlIlllIlIIIII2, bl2);
                0;
                0;
                if (((121 + 148 - 234 + 138 ^ 18 + 109 - 10 + 19) & (0xBC ^ 0xAA ^ (0x3D ^ 0xE) ^ -1)) != 0) {
                    return null;
                }
            } else {
                var3.put(llllllllllllllllIIlIlIlllIlIIIII2, (Boolean)var17.get(llllllllllllllllIIlIlIlllIlIIIII2));
                0;
            }
            0;
            if (-1 < 0) continue;
            return null;
        }
        if (s.lIlIlIlIllIIIl(var15.a(var3) ? 1 : 0)) {
            return var14;
        }
        var7 = new ArrayList(var3.keySet());
        Collections.shuffle(var7);
        if (s.lIlIlIlIllIIIl(var15.aP.isEmpty() ? 1 : 0)) {
            n3 = llIlllIIIIl[4];
            0;
            if (-3 > 0) {
                return null;
            }
        } else {
            n3 = llllllllllllllllIIlIlIlllIlIIIII2 = var15.aP.size();
        }
        if (s.lIlIlIlIllIlll(var14.size(), llllllllllllllllIIlIlIlllIlIIIII2)) {
            return var15.aP;
        }
        Iterator var1 = var7.iterator();
        while (s.lIlIlIlIllIIIl(var1.hasNext() ? 1 : 0)) {
            void var4;
            WorldPoint var11 = (WorldPoint)var1.next();
            if (s.lIlIlIlIllIIIl(var11.equals((Object)var8) ? 1 : 0)) {
                0;
                if (-1 <= 0) continue;
                return null;
            }
            ArrayList<WorldPoint> var6 = new ArrayList<WorldPoint>((Collection<WorldPoint>)var14);
            var6.add(var11);
            0;
            List<WorldPoint> var10 = var15.a(var3, var11, var6, (int)var4);
            if (s.lIlIlIlIllIIIl(var10.isEmpty() ? 1 : 0)) {
                0;
                if (-1 < 0) continue;
                return null;
            }
            if (s.lIlIlIlIlllIII(var10.size(), llllllllllllllllIIlIlIlllIlIIIII2)) {
                var15.aP = var10;
            }
            0;
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

    private static void lIlIlIlIllIIII() {
        llIlllIIIIl = new int[5];
        s.llIlllIIIIl[0] = 0x37 ^ 0x7C ^ (0xDF ^ 0x8D);
        s.llIlllIIIIl[1] = 2;
        s.llIlllIIIIl[2] = 1;
        s.llIlllIIIIl[3] = (0xCF ^ 0xA1 ^ (9 ^ 4)) & (80 + 182 - 118 + 111 ^ 78 + 126 - 140 + 92 ^ -1);
        s.llIlllIIIIl[4] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
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

