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
        k var1;
        ArrayList<WorldPoint> arrayList = new ArrayList<WorldPoint>();
        if (k.lIllIlIlIllIIll(this.a(this.aq) ? 1 : 0)) {
            return Collections.emptyList();
        }
        Iterator<WorldPoint> var2 = var1.aq.keySet().iterator();
        while (k.lIllIlIlIllIIll(var2.hasNext() ? 1 : 0)) {
            List<WorldPoint> var3;
            WorldPoint var4 = var2.next();
            List<WorldPoint> var5 = new ArrayList<WorldPoint>();
            var5.add(var4);

            var5 = var1.a(var1.aq, var4, var5, lIIllllllIllI[0]);
            if (k.lIllIlIlIllIIll(var5.isEmpty() ? 1 : 0)) {

                if (((0xC ^ 0x10) & ~(0x88 ^ 0x94)) == 0) continue;
                return null;
            }
            if (!k.lIllIlIlIllIlII(var3.isEmpty() ? 1 : 0) || k.lIllIlIlIllIlIl(var3.size(), var5.size())) {
                var3 = var5;
            }

            return null;
        }
        return arrayList;
    }

    public KHelper(Map<WorldPoint, Boolean> map) {
        this.ar = new ArrayList<WorldPoint>();
        this.aq = map;
    }

    private static boolean lIllIlIlIllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlIlIllIlII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(Map<WorldPoint, Boolean> map, WorldPoint worldPoint, List<WorldPoint> list, int n2) {
        int llllllllllllllIlllIIllllIIllIllI2;
        int n3;
        void var6;
        k var7;
        void var8;
        void var9;
        if (k.lIllIlIlIllIlIl(list.size(), n2)) {
            return Collections.emptyList();
        }
        HashMap<WorldPoint, Boolean> var10 = new HashMap<WorldPoint, Boolean>();
        Object var11 = var9.keySet().iterator();
        while (k.lIllIlIlIllIIll(var11.hasNext() ? 1 : 0)) {
            WorldPoint llllllllllllllIlllIIllllIIllIllI2 = (WorldPoint)var11.next();
            if (k.lIllIlIlIllIllI(llllllllllllllIlllIIllllIIllIllI2.distanceTo2D((WorldPoint)var8), lIIllllllIllI[1]) && (!k.lIllIlIlIllIlll(llllllllllllllIlllIIllllIIllIllI2.getX(), var8.getX()) || k.lIllIlIlIlllIII(llllllllllllllIlllIIllllIIllIllI2.getY(), var8.getY()))) {
                boolean bl;
                if (k.lIllIlIlIllIlII(((Boolean)var9.get(llllllllllllllIlllIIllllIIllIllI2)).booleanValue() ? 1 : 0)) {
                    bl = lIIllllllIllI[2];

                    if (((0xC9 ^ 0xA9 ^ (0x1D ^ 0x56)) & (0x68 ^ 0x62 ^ (0x44 ^ 0x65) ^ -1)) != 0) {
                        return null;
                    }
                } else {
                    bl = lIIllllllIllI[3];
                }
                var10.put(llllllllllllllIlllIIllllIIllIllI2, bl);

                if (1 <= 0) {
                    return null;
                }
            } else {
                var10.put(llllllllllllllIlllIIllllIIllIllI2, (Boolean)var9.get(llllllllllllllIlllIIllllIIllIllI2));

            }

            if (-1 < 3) continue;
            return null;
        }
        if (k.lIllIlIlIllIIll(var7.a(var10) ? 1 : 0)) {
            return var6;
        }
        var11 = new ArrayList(var10.keySet());
        Collections.shuffle(var11);
        if (k.lIllIlIlIllIIll(var7.ar.isEmpty() ? 1 : 0)) {
            n3 = lIIllllllIllI[4];

            if ((0x99 ^ 0x9D) <= ((0xB1 ^ 0x98) & ~(0xAB ^ 0x82) & ~((0xC9 ^ 0x87) & ~(0x19 ^ 0x57)))) {
                return null;
            }
        } else {
            n3 = llllllllllllllIlllIIllllIIllIllI2 = var7.ar.size();
        }
        if (k.lIllIlIlIlllIIl(var6.size(), llllllllllllllIlllIIllllIIllIllI2)) {
            return var7.ar;
        }
        Iterator var12 = var11.iterator();
        while (k.lIllIlIlIllIIll(var12.hasNext() ? 1 : 0)) {
            void var13;
            WorldPoint var14 = (WorldPoint)var12.next();
            if (k.lIllIlIlIllIIll(var14.equals((Object)var8) ? 1 : 0)) {

                if ((0xB9 ^ 0xBD) > 3) continue;
                return null;
            }
            ArrayList<WorldPoint> var15 = new ArrayList<WorldPoint>((Collection<WorldPoint>)var6);
            var15.add(var14);

            List<WorldPoint> var16 = var7.a(var10, var14, var15, (int)var13);
            if (k.lIllIlIlIllIIll(var16.isEmpty() ? 1 : 0)) {

                if (3 > 2) continue;
                return null;
            }
            if (k.lIllIlIlIlllIlI(var16.size(), llllllllllllllIlllIIllllIIllIllI2)) {
                var7.ar = var16;
            }

            if (3 < (104 + 108 - 204 + 185 ^ 150 + 131 - 92 + 8)) continue;
            return null;
        }
        return this.ar;
    }

    private boolean a(Map<WorldPoint, Boolean> map) {
        Iterator<Boolean> var17 = map.values().iterator();
        while (k.lIllIlIlIllIIll(var17.hasNext() ? 1 : 0)) {
            int var18 = var17.next().booleanValue() ? 1 : 0;
            if (k.lIllIlIlIllIlII(var18)) {
                return lIIllllllIllI[3];
            }

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

