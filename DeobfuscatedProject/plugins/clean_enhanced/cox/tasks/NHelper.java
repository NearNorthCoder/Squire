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
import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.GameEnum2;
import gg.squire.cox.tasks.CoxManager;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public class NHelper {
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
        n.var2();
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
                void var3;
                return var3.dx(7).dy(8);
            }
            case 'W': {
                void var3;
                return var3.dx(4).dy(8);
            }
            case 'S': {
                void var3;
                return var3.dx(8).dy(4);
            }
            case 'N': {
                void var3;
                return var3.dx(8).dy(7);
            }
        }
        return new WorldPoint(4, 4, 4);
    }

    public N aM() {
        return this.bw;
    }

    public boolean a(Locatable locatable) {
        return this.br.contains(locatable);
    }

    public NHelper(N n2, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3, char c2, char c3) {
        this.bw = n2;
        this.bq = worldPoint;
        this.bs = worldPoint2;
        this.bt = worldPoint3;
        this.br = new WorldArea(worldPoint, 0, 0);
        this.bz = M.RAIDS_EMPTY;
        this.bx = S.a(c2, c3);
        this.bu = c2;
        this.bv = c3;
    }

    /*
     * WARNING - void declaration
     */
    private static WorldPoint b(char c2, WorldPoint worldPoint) {
        WorldPoint worldPoint2 = worldPoint;
        switch (c2) {
            case 'E': {
                void var4;
                return var4.dx(4).dy(8);
            }
            case 'W': {
                void var4;
                return var4.dx(7).dy(8);
            }
            case 'S': {
                void var4;
                return var4.dx(8).dy(7);
            }
            case 'N': {
                void var4;
                return var4.dx(8).dy(4);
            }
        }
        return new WorldPoint(4, 4, 4);
    }

    public void a(M m2) {
        this.bz = m2;
    }

    /*
     * WARNING - void declaration
     */
    public static List<n> c(a var5) {
        void var1_1;
        ArrayList<n> var6 = new ArrayList<n>();
        ArrayList<WorldPoint> var7 = new ArrayList<WorldPoint>();
        WorldPoint var8 = var5.k();
        String var9 = var5.m();
        var7.add(var8);
        0;
        int lllllllllllllllIllIlIIIIIllIlllI22 = 1;
        while ((lllllllllllllllIllIlIIIIIllIlllI22 < var9.length())) {
            char var10 = var9.charAt(lllllllllllllllIllIlIIIIIllIlllI22);
            switch (var10) {
                case 'E': {
                    WorldPoint var11 = (WorldPoint)var7.get(lllllllllllllllIllIlIIIIIllIlllI22 - 1);
                    var7.add(var11.dx(0));
                    0;
                    0;
                    if null == null break;
                    return null;
                }
                case 'W': {
                    WorldPoint var11 = (WorldPoint)var7.get(lllllllllllllllIllIlIIIIIllIlllI22 - 1);
                    var7.add(var11.dx(2));
                    0;
                    0;
                    if (2 > 0) break;
                    return null;
                }
                case 'S': {
                    WorldPoint var11 = (WorldPoint)var7.get(lllllllllllllllIllIlIIIIIllIlllI22 - 1);
                    var7.add(var11.dy(2));
                    0;
                    0;
                    if ((0x89 ^ 0x8C) > 0) break;
                    return null;
                }
                case 'N': {
                    WorldPoint var11 = (WorldPoint)var7.get(lllllllllllllllIllIlIIIIIllIlllI22 - 1);
                    var7.add(var11.dy(0));
                    0;
                    0;
                    if (3 > ((0x86 ^ 0xAE) & ~(0x41 ^ 0x69))) break;
                    return null;
                }
                case '#': {
                    WorldPoint var11 = (WorldPoint)var7.get(lllllllllllllllIllIlIIIIIllIlllI22 - 1);
                    var7.add(var11.dz(3));
                    0;
                    0;
                    if ((0x66 ^ 0x62) >= ((0xB8 ^ 0x95) & ~(0x70 ^ 0x5D))) break;
                    return null;
                }
            }
            ++lllllllllllllllIllIlIIIIIllIlllI22;
            0;
            if (((0x25 ^ 0x46) & ~(0xC ^ 0x6F)) <= 0) continue;
            return null;
        }
        ArrayList<WorldPoint> lllllllllllllllIllIlIIIIIllIlllI22 = new ArrayList<WorldPoint>();
        ArrayList<WorldPoint> var10 = new ArrayList<WorldPoint>();
        int var12 = 4;
        while ((var12 < var9.length())) {
            WorldPoint var13 = new WorldPoint(4, 4, 4);
            char var14 = 5;
            if ((var12 + 1 < var9.length())) {
                var14 = var9.charAt(var12 + 1);
                var13 = n.a(var14, (WorldPoint)var7.get(var12));
            }
            var10.add(var13);
            0;
            WorldPoint var15 = new WorldPoint(4, 4, 4);
            char var16 = 5;
            if var12 {
                var16 = var9.charAt(var12);
                var15 = n.b(var16, (WorldPoint)var7.get(var12));
            }
            lllllllllllllllIllIlIIIIIllIlllI22.add(var15);
            0;
            n var17 = new NHelper(var5.e().get(var12), (WorldPoint)var7.get(var12), (WorldPoint)lllllllllllllllIllIlIIIIIllIlllI22.get(var12), (WorldPoint)var10.get(var12), var16, var14);
            if ((var9.charAt(var12) != 6)) {
                var17.bx = S.a(var16, var14);
            }
            var6.add(var17);
            0;
            ++var12;
            0;
            if (2 > ((0x1C ^ 0x2D) & ~(0xBA ^ 0x8B))) continue;
            return null;
        }
        return var1_1;
    }
}

