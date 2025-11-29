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

public class SHelper {
    private final  Map<WorldPoint, Boolean> aO;
    private  List<WorldPoint> aP;

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public List<WorldPoint> af() {
        void var1_1;
        s var3;
        List<Object> var4 = new ArrayList();
        if (s.var5(var3.a(var3.aO) ? 1 : 0)) {
            return Collections.emptyList();
        }
        Iterator<WorldPoint> var6 = var3.aO.keySet().iterator();
        while (s.var5(var6.hasNext() ? 1 : 0)) {
            WorldPoint var7 = var6.next();
            List<WorldPoint> var8 = new ArrayList<WorldPoint>();
            var8.add(var7);
            0;
            var8 = var3.a(var3.aO, var7, var8, var1[0]);
            if (s.var5(var8.isEmpty() ? 1 : 0)) {
                0;
                if (3 == 3) continue;
                return null;
            }
            if (!s.var9(var4.isEmpty() ? 1 : 0) || s.var10(var4.size(), var8.size())) {
                var4 = var8;
            }
            0;
            if ((0x70 ^ 0x75) > 0) continue;
            return null;
        }
        return var1_1;
    }

    private boolean a(Map<WorldPoint, Boolean> map) {
        Iterator<Boolean> var11 = map.values().iterator();
        while (s.var5(var11.hasNext() ? 1 : 0)) {
            int var12 = var11.next().booleanValue() ? 1 : 0;
            if (s.var9(var12)) {
                return var1[3];
            }
            0;
            if (((0x3B ^ 0x78) & ~(0x50 ^ 0x13)) == 0) continue;
            return ((0x4A ^ 1) & ~(0x68 ^ 0x23)) != 0;
        }
        return var1[2];
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(Map<WorldPoint, Boolean> map, WorldPoint worldPoint, List<WorldPoint> list, int n2) {
        int llllllllllllllllIIlIlIlllIlIIIII2;
        int n3;
        void var13;
        s var14;
        void var15;
        void var16;
        if (s.var10(list.size(), n2)) {
            return Collections.emptyList();
        }
        HashMap<WorldPoint, Boolean> var17 = new HashMap<WorldPoint, Boolean>();
        Object var18 = var16.keySet().iterator();
        while (s.var5(var18.hasNext() ? 1 : 0)) {
            WorldPoint llllllllllllllllIIlIlIlllIlIIIII2 = (WorldPoint)var18.next();
            if (s.var19(llllllllllllllllIIlIlIlllIlIIIII2.distanceTo2D((WorldPoint)var15), var1[1]) && (!s.var20(llllllllllllllllIIlIlIlllIlIIIII2.getX(), var15.getX()) || s.var21(llllllllllllllllIIlIlIlllIlIIIII2.getY(), var15.getY()))) {
                boolean bl2;
                if (s.var9(((Boolean)var16.get(llllllllllllllllIIlIlIlllIlIIIII2)).booleanValue() ? 1 : 0)) {
                    bl2 = var1[2];
                    0;
                    if (-(155 + 52 - 72 + 52 ^ 4 + 3 - -11 + 172) >= 0) {
                        return null;
                    }
                } else {
                    bl2 = var1[3];
                }
                var17.put(llllllllllllllllIIlIlIlllIlIIIII2, bl2);
                0;
                0;
                if (((121 + 148 - 234 + 138 ^ 18 + 109 - 10 + 19) & (0xBC ^ 0xAA ^ (0x3D ^ 0xE) ^ -1)) != 0) {
                    return null;
                }
            } else {
                var17.put(llllllllllllllllIIlIlIlllIlIIIII2, (Boolean)var16.get(llllllllllllllllIIlIlIlllIlIIIII2));
                0;
            }
            0;
            if (-1 < 0) continue;
            return null;
        }
        if (s.var5(var14.a(var17) ? 1 : 0)) {
            return var13;
        }
        var18 = new ArrayList(var17.keySet());
        Collections.shuffle(var18);
        if (s.var5(var14.aP.isEmpty() ? 1 : 0)) {
            n3 = var1[4];
            0;
            if (-3 > 0) {
                return null;
            }
        } else {
            n3 = llllllllllllllllIIlIlIlllIlIIIII2 = var14.aP.size();
        }
        if (s.var22(var13.size(), llllllllllllllllIIlIlIlllIlIIIII2)) {
            return var14.aP;
        }
        Iterator var23 = var18.iterator();
        while (s.var5(var23.hasNext() ? 1 : 0)) {
            void var24;
            WorldPoint var25 = (WorldPoint)var23.next();
            if (s.var5(var25.equals((Object)var15) ? 1 : 0)) {
                0;
                if (-1 <= 0) continue;
                return null;
            }
            ArrayList<WorldPoint> var26 = new ArrayList<WorldPoint>((Collection<WorldPoint>)var13);
            var26.add(var25);
            0;
            List<WorldPoint> var27 = var14.a(var17, var25, var26, (int)var24);
            if (s.var5(var27.isEmpty() ? 1 : 0)) {
                0;
                if (-1 < 0) continue;
                return null;
            }
            if (s.var2(var27.size(), llllllllllllllllIIlIlIlllIlIIIII2)) {
                var14.aP = var27;
            }
            0;
            if ((38 + 124 - 91 + 61 ^ 102 + 72 - 96 + 50) != 0) continue;
            return null;
        }
        return this.aP;
    }

    private static boolean var10(int n2, int n3) {
        return n2 > n3;
    }

    public SHelper(Map<WorldPoint, Boolean> map) {
        this.aP = new ArrayList<WorldPoint>();
        this.aO = map;
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static boolean var21(int n2, int n3) {
        return n2 == n3;
    }

    private static void var28() {
        var1 = new int[5];
        s.var1[0] = 0x37 ^ 0x7C ^ (0xDF ^ 0x8D);
        s.var1[1] = 2;
        s.var1[2] = 1;
        s.var1[3] = (0xCF ^ 0xA1 ^ (9 ^ 4)) & (80 + 182 - 118 + 111 ^ 78 + 126 - 140 + 92 ^ -1);
        s.var1[4] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
    }

    static {
        s.var28();
    }

    private static boolean var22(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var19(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var20(int n2, int n3) {
        return n2 != n3;
    }
}

