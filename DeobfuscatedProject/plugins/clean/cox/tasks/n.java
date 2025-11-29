/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.GameEnum;
import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.GameEnum19;
import gg.squire.cox.tasks.CoxManager;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public class n {
    public  N bw;
    public  WorldArea br;
    public  J by;
    public  char bv;
    public  WorldPoint bq;
    public  char bu;
    
    public  S bx;
    public  M bz;
    public  WorldPoint bt;
    public  WorldPoint bs;

    public M aN() {
        return this.bz;
    }

    static {
        n.llIlllIlllIlII();
    }

    public boolean a(WorldPoint worldPoint) {
        return this.br.contains(worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    private static WorldPoint a(char c2, WorldPoint worldPoint) {
        WorldPoint worldPoint2 = worldPoint;
        switch (c2) {
            case 'E': {
                void var1;
                return var1.dx(lIlIlIlIIlIl[7]).dy(lIlIlIlIIlIl[8]);
            }
            case 'W': {
                void var1;
                return var1.dx(lIlIlIlIIlIl[4]).dy(lIlIlIlIIlIl[8]);
            }
            case 'S': {
                void var1;
                return var1.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[4]);
            }
            case 'N': {
                void var1;
                return var1.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[7]);
            }
        }
        return new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
    }

    public N aM() {
        return this.bw;
    }

    private static boolean llIlllIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public boolean a(Locatable locatable) {
        return this.br.contains(locatable);
    }

    public n(N n2, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3, char c2, char c3) {
        this.bw = n2;
        this.bq = worldPoint;
        this.bs = worldPoint2;
        this.bt = worldPoint3;
        this.br = new WorldArea(worldPoint, lIlIlIlIIlIl[0], lIlIlIlIIlIl[0]);
        this.bz = M.RAIDS_EMPTY;
        this.bx = S.a(c2, c3);
        this.bu = c2;
        this.bv = c3;
    }

    private static boolean llIlllIlllIlll(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private static WorldPoint b(char c2, WorldPoint worldPoint) {
        WorldPoint worldPoint2 = worldPoint;
        switch (c2) {
            case 'E': {
                void var2;
                return var2.dx(lIlIlIlIIlIl[4]).dy(lIlIlIlIIlIl[8]);
            }
            case 'W': {
                void var2;
                return var2.dx(lIlIlIlIIlIl[7]).dy(lIlIlIlIIlIl[8]);
            }
            case 'S': {
                void var2;
                return var2.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[7]);
            }
            case 'N': {
                void var2;
                return var2.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[4]);
            }
        }
        return new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
    }

    public void a(M m2) {
        this.bz = m2;
    }

    private static boolean llIlllIlllIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static List<n> c(a var3) {
        void var1_1;
        ArrayList<n> var4 = new ArrayList<n>();
        ArrayList<WorldPoint> var5 = new ArrayList<WorldPoint>();
        WorldPoint var6 = var3.k();
        String var7 = var3.m();
        var5.add(var6);

        int lllllllllllllllIllIlIIIIIllIlllI22 = lIlIlIlIIlIl[1];
        while (n.llIlllIlllIlIl(lllllllllllllllIllIlIIIIIllIlllI22, var7.length())) {
            char var8 = var7.charAt(lllllllllllllllIllIlIIIIIllIlllI22);
            switch (var8) {
                case 'E': {
                    WorldPoint var9 = (WorldPoint)var5.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    var5.add(var9.dx(lIlIlIlIIlIl[0]));

                    if (null == null) break;
                    return null;
                }
                case 'W': {
                    WorldPoint var9 = (WorldPoint)var5.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    var5.add(var9.dx(lIlIlIlIIlIl[2]));

                    if (2 > 0) break;
                    return null;
                }
                case 'S': {
                    WorldPoint var9 = (WorldPoint)var5.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    var5.add(var9.dy(lIlIlIlIIlIl[2]));

                    if ((0x89 ^ 0x8C) > 0) break;
                    return null;
                }
                case 'N': {
                    WorldPoint var9 = (WorldPoint)var5.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    var5.add(var9.dy(lIlIlIlIIlIl[0]));

                    if (3 > ((0x86 ^ 0xAE) & ~(0x41 ^ 0x69))) break;
                    return null;
                }
                case '#': {
                    WorldPoint var9 = (WorldPoint)var5.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    var5.add(var9.dz(lIlIlIlIIlIl[3]));

                    if ((0x66 ^ 0x62) >= ((0xB8 ^ 0x95) & ~(0x70 ^ 0x5D))) break;
                    return null;
                }
            }
            ++lllllllllllllllIllIlIIIIIllIlllI22;

            if (((0x25 ^ 0x46) & ~(0xC ^ 0x6F)) <= 0) continue;
            return null;
        }
        ArrayList<WorldPoint> lllllllllllllllIllIlIIIIIllIlllI22 = new ArrayList<WorldPoint>();
        ArrayList<WorldPoint> var8 = new ArrayList<WorldPoint>();
        int var10 = lIlIlIlIIlIl[4];
        while (n.llIlllIlllIlIl(var10, var7.length())) {
            WorldPoint var11 = new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
            char var12 = lIlIlIlIIlIl[5];
            if (n.llIlllIlllIlIl(var10 + lIlIlIlIIlIl[1], var7.length())) {
                var12 = var7.charAt(var10 + lIlIlIlIIlIl[1]);
                var11 = n.a(var12, (WorldPoint)var5.get(var10));
            }
            var8.add(var11);

            WorldPoint var13 = new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
            char var14 = lIlIlIlIIlIl[5];
            if (n.llIlllIlllIllI(var10)) {
                var14 = var7.charAt(var10);
                var13 = n.b(var14, (WorldPoint)var5.get(var10));
            }
            lllllllllllllllIllIlIIIIIllIlllI22.add(var13);

            n var15 = new n(var3.e().get(var10), (WorldPoint)var5.get(var10), (WorldPoint)lllllllllllllllIllIlIIIIIllIlllI22.get(var10), (WorldPoint)var8.get(var10), var14, var12);
            if (n.llIlllIlllIlll(var7.charAt(var10), lIlIlIlIIlIl[6])) {
                var15.bx = S.a(var14, var12);
            }
            var4.add(var15);

            ++var10;

            if (2 > ((0x1C ^ 0x2D) & ~(0xBA ^ 0x8B))) continue;
            return null;
        }
        return var1_1;
    }
}

