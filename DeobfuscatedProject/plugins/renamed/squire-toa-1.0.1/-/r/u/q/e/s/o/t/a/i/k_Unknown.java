/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package -.r.u.q.e.s.o.t.a.i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.runelite.api.coords.WorldPoint;

public class k_Unknown {
    private static /* synthetic */ int[] lIIllllllIllI;
    private final /* synthetic */ Map<WorldPoint, Boolean> aq;
    private /* synthetic */ List<WorldPoint> ar;

    private static boolean lIllIlIlIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIlIllIlll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        k.lIllIlIlIllIIlI();
    }

    private static boolean lIllIlIlIllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    public List<WorldPoint> y() {
        k var13;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        if (k.lIllIlIlIllIIll(this.a(this.aq) ? 1 : 0)) {
            return Collections.emptyList();
        }
        Iterator<WorldPoint> var4 = var13.aq.keySet().iterator();
        while (k.lIllIlIlIllIIll(var4.hasNext() ? 1 : 0)) {
            List<WorldPoint> var9;
            WorldPoint var15 = var4.next();
            List<WorldPoint> var2 = new ArrayList<WorldPoint>();
            var2.add(var15);
            0;
            var2 = var13.a(var13.aq, var15, var2, lIIllllllIllI[0]);
            if (k.lIllIlIlIllIIll(var2.isEmpty() ? 1 : 0)) {
                0;
                if (((0xC ^ 0x10) & ~(0x88 ^ 0x94)) == 0) continue;
                return null;
            }
            if (!k.lIllIlIlIllIlII(var9.isEmpty() ? 1 : 0) || k.lIllIlIlIllIlIl(var9.size(), var2.size())) {
                var9 = var2;
            }
            0;
            
            return null;
        }
        return arrayList;
    }

    public k(Map<WorldPoint, Boolean> map) {
        this.ar = new ArrayList<WorldPoint>();
        this.aq = map;
    }

    private static boolean lIllIlIlIllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlIlIllIlII(int n2) {
        return n2 == 0;
    }

    private static void lIllIlIlIllIIlI() {
        lIIllllllIllI = new int[5];
        k.lIIllllllIllI[0] = 0x8D ^ 0x94;
        k.lIIllllllIllI[1] = 2;
        k.lIIllllllIllI[2] = 1;
        k.lIIllllllIllI[3] = (0x64 ^ 0x43) & ~(5 ^ 0x22);
        k.lIIllllllIllI[4] = 0xFFFFFFFF & Integer.MAX_VALUE;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(Map<WorldPoint, Boolean> map, WorldPoint worldPoint, List<WorldPoint> list, int n2) {
        int llllllllllllllIlllIIllllIIllIllI2;
        int n3;
        void var5;
        k var11;
        void var8;
        void var6;
        if (k.lIllIlIlIllIlIl(list.size(), n2)) {
            return Collections.emptyList();
        }
        HashMap<WorldPoint, Boolean> var3 = new HashMap<WorldPoint, Boolean>();
        Object var16 = var6.keySet().iterator();
        while (k.lIllIlIlIllIIll(var16.hasNext() ? 1 : 0)) {
            WorldPoint llllllllllllllIlllIIllllIIllIllI2 = (WorldPoint)var16.next();
            if (k.lIllIlIlIllIllI(llllllllllllllIlllIIllllIIllIllI2.distanceTo2D((WorldPoint)var8), lIIllllllIllI[1]) && (!k.lIllIlIlIllIlll(llllllllllllllIlllIIllllIIllIllI2.getX(), var8.getX()) || k.lIllIlIlIlllIII(llllllllllllllIlllIIllllIIllIllI2.getY(), var8.getY()))) {
                boolean bl;
                if (k.lIllIlIlIllIlII(((Boolean)var6.get(llllllllllllllIlllIIllllIIllIllI2)).booleanValue() ? 1 : 0)) {
                    bl = lIIllllllIllI[2];
                    0;
                    if (((0xC9 ^ 0xA9 ^ (0x1D ^ 0x56)) & (0x68 ^ 0x62 ^ (0x44 ^ 0x65) ^ -1)) != 0) {
                        return null;
                    }
                } else {
                    bl = lIIllllllIllI[3];
                }
                var3.put(llllllllllllllIlllIIllllIIllIllI2, bl);
                0;
                0;
                if (1 <= 0) {
                    return null;
                }
            } else {
                var3.put(llllllllllllllIlllIIllllIIllIllI2, (Boolean)var6.get(llllllllllllllIlllIIllllIIllIllI2));
                0;
            }
            0;
            if (-1 < 3) continue;
            return null;
        }
        if (k.lIllIlIlIllIIll(var11.a(var3) ? 1 : 0)) {
            return var5;
        }
        var16 = new ArrayList(var3.keySet());
        Collections.shuffle(var16);
        if (k.lIllIlIlIllIIll(var11.ar.isEmpty() ? 1 : 0)) {
            n3 = lIIllllllIllI[4];
            0;
            if ((0x99 ^ 0x9D) <= ((0xB1 ^ 0x98) & ~(0xAB ^ 0x82) & ~((0xC9 ^ 0x87) & ~(0x19 ^ 0x57)))) {
                return null;
            }
        } else {
            n3 = llllllllllllllIlllIIllllIIllIllI2 = var11.ar.size();
        }
        if (k.lIllIlIlIlllIIl(var5.size(), llllllllllllllIlllIIllllIIllIllI2)) {
            return var11.ar;
        }
        Iterator var18 = var16.iterator();
        while (k.lIllIlIlIllIIll(var18.hasNext() ? 1 : 0)) {
            void var17;
            WorldPoint var10 = (WorldPoint)var18.next();
            if (k.lIllIlIlIllIIll(var10.equals((Object)var8) ? 1 : 0)) {
                0;
                if ((0xB9 ^ 0xBD) > 3) continue;
                return null;
            }
            ArrayList<WorldPoint> var14 = new ArrayList<WorldPoint>((Collection<WorldPoint>)var5);
            var14.add(var10);
            0;
            List<WorldPoint> var7 = var11.a(var3, var10, var14, (int)var17);
            if (k.lIllIlIlIllIIll(var7.isEmpty() ? 1 : 0)) {
                0;
                if (3 > 2) continue;
                return null;
            }
            if (k.lIllIlIlIlllIlI(var7.size(), llllllllllllllIlllIIllllIIllIllI2)) {
                var11.ar = var7;
            }
            0;
            if (3 < (104 + 108 - 204 + 185 ^ 150 + 131 - 92 + 8)) continue;
            return null;
        }
        return this.ar;
    }

    private boolean a(Map<WorldPoint, Boolean> map) {
        Iterator<Boolean> var1 = map.values().iterator();
        while (k.lIllIlIlIllIIll(var1.hasNext() ? 1 : 0)) {
            int var12 = var1.next().booleanValue() ? 1 : 0;
            if (k.lIllIlIlIllIlII(var12)) {
                return lIIllllllIllI[3];
            }
            0;
            if (-1 < 0) continue;
            return false;
        }
        return lIIllllllIllI[2];
    }

    private static boolean lIllIlIlIlllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIlIllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIlllIII(int n2, int n3) {
        return n2 == n3;
    }
}

