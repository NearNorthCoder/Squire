/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.toa.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.runelite.api.coords.WorldPoint;

public class KHelper {
    
    private final  Map<WorldPoint, Boolean> aq;
    private  List<WorldPoint> ar;

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    static {
        k.var4();
    }

    private static boolean var5(int n2, int n3) {
        return n2 > n3;
    }

    public List<WorldPoint> y() {
        k var6;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        if (k.var7(this.a(this.aq) ? 1 : 0)) {
            return Collections.emptyList();
        }
        Iterator<WorldPoint> var8 = var6.aq.keySet().iterator();
        while (k.var7(var8.hasNext() ? 1 : 0)) {
            List<WorldPoint> var9;
            WorldPoint var10 = var8.next();
            List<WorldPoint> var11 = new ArrayList<WorldPoint>();
            var11.add(var10);
            0;
            var11 = var6.a(var6.aq, var10, var11, var1[0]);
            if (k.var7(var11.isEmpty() ? 1 : 0)) {
                0;
                if (((0xC ^ 0x10) & ~(0x88 ^ 0x94)) == 0) continue;
                return null;
            }
            if (!k.var12(var9.isEmpty() ? 1 : 0) || k.var5(var9.size(), var11.size())) {
                var9 = var11;
            }
            0;
            if null == null continue;
            return null;
        }
        return arrayList;
    }

    public KHelper(Map<WorldPoint, Boolean> map) {
        this.ar = new ArrayList<WorldPoint>();
        this.aq = map;
    }

    private static boolean var13(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static void var4() {
        var1 = new int[5];
        k.var1[0] = 0x8D ^ 0x94;
        k.var1[1] = 2;
        k.var1[2] = 1;
        k.var1[3] = (0x64 ^ 0x43) & ~(5 ^ 0x22);
        k.var1[4] = 0xFFFFFFFF & Integer.MAX_VALUE;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(Map<WorldPoint, Boolean> map, WorldPoint worldPoint, List<WorldPoint> list, int n2) {
        int llllllllllllllIlllIIllllIIllIllI2;
        int n3;
        void var14;
        k var15;
        void var16;
        void var17;
        if (k.var5(list.size(), n2)) {
            return Collections.emptyList();
        }
        HashMap<WorldPoint, Boolean> var18 = new HashMap<WorldPoint, Boolean>();
        Object var19 = var17.keySet().iterator();
        while (k.var7(var19.hasNext() ? 1 : 0)) {
            WorldPoint llllllllllllllIlllIIllllIIllIllI2 = (WorldPoint)var19.next();
            if (k.var13(llllllllllllllIlllIIllllIIllIllI2.distanceTo2D((WorldPoint)var16), var1[1]) && (!k.var3(llllllllllllllIlllIIllllIIllIllI2.getX(), var16.getX()) || k.var20(llllllllllllllIlllIIllllIIllIllI2.getY(), var16.getY()))) {
                boolean bl;
                if (k.var12(((Boolean)var17.get(llllllllllllllIlllIIllllIIllIllI2)).booleanValue() ? 1 : 0)) {
                    bl = var1[2];
                    0;
                    if (((0xC9 ^ 0xA9 ^ (0x1D ^ 0x56)) & (0x68 ^ 0x62 ^ (0x44 ^ 0x65) ^ -1)) != 0) {
                        return null;
                    }
                } else {
                    bl = var1[3];
                }
                var18.put(llllllllllllllIlllIIllllIIllIllI2, bl);
                0;
                0;
                if (1 <= 0) {
                    return null;
                }
            } else {
                var18.put(llllllllllllllIlllIIllllIIllIllI2, (Boolean)var17.get(llllllllllllllIlllIIllllIIllIllI2));
                0;
            }
            0;
            if (-1 < 3) continue;
            return null;
        }
        if (k.var7(var15.a(var18) ? 1 : 0)) {
            return var14;
        }
        var19 = new ArrayList(var18.keySet());
        Collections.shuffle(var19);
        if (k.var7(var15.ar.isEmpty() ? 1 : 0)) {
            n3 = var1[4];
            0;
            if ((0x99 ^ 0x9D) <= ((0xB1 ^ 0x98) & ~(0xAB ^ 0x82) & ~((0xC9 ^ 0x87) & ~(0x19 ^ 0x57)))) {
                return null;
            }
        } else {
            n3 = llllllllllllllIlllIIllllIIllIllI2 = var15.ar.size();
        }
        if (k.var21(var14.size(), llllllllllllllIlllIIllllIIllIllI2)) {
            return var15.ar;
        }
        Iterator var22 = var19.iterator();
        while (k.var7(var22.hasNext() ? 1 : 0)) {
            void var23;
            WorldPoint var24 = (WorldPoint)var22.next();
            if (k.var7(var24.equals((Object)var16) ? 1 : 0)) {
                0;
                if ((0xB9 ^ 0xBD) > 3) continue;
                return null;
            }
            ArrayList<WorldPoint> var25 = new ArrayList<WorldPoint>((Collection<WorldPoint>)var14);
            var25.add(var24);
            0;
            List<WorldPoint> var26 = var15.a(var18, var24, var25, (int)var23);
            if (k.var7(var26.isEmpty() ? 1 : 0)) {
                0;
                if (3 > 2) continue;
                return null;
            }
            if (k.var2(var26.size(), llllllllllllllIlllIIllllIIllIllI2)) {
                var15.ar = var26;
            }
            0;
            if (3 < (104 + 108 - 204 + 185 ^ 150 + 131 - 92 + 8)) continue;
            return null;
        }
        return this.ar;
    }

    private boolean a(Map<WorldPoint, Boolean> map) {
        Iterator<Boolean> var27 = map.values().iterator();
        while (k.var7(var27.hasNext() ? 1 : 0)) {
            int var28 = var27.next().booleanValue() ? 1 : 0;
            if (k.var12(var28)) {
                return var1[3];
            }
            0;
            if (-1 < 0) continue;
            return ((0x53 ^ 8) & ~(0xCC ^ 0x97)) != 0;
        }
        return var1[2];
    }

    private static boolean var21(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static boolean var20(int n2, int n3) {
        return n2 == n3;
    }
}

