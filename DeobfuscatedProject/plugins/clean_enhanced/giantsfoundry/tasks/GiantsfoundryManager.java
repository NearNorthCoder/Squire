/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GameEnum5;
import gg.squire.giantsfoundry.tasks.GameEnum;
import gg.squire.giantsfoundry.tasks.GameEnum6;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class GiantsfoundryManager {
    private static final  int s;
    private static final  int w;
    private static final  int x;
    private static final  int u;
    public static final  int k;
    private static final  int o;
    
    private static final  int z;
    private final  Client E;
    private static final  Logger g;
    private static final  int D;
    private static final  int A;
    private static final  int m;
    private static final  int v;
    public static final  int j;
    private static final  int p;
    public static final  int l;
    private static final  int q;
    private static final  int y;
    public static final  int i;
    private static final  int r;
    private static final  int n;
    private static final  int B;
    private static final  int C;
    public static final  int h;
    private static final  int t;

    public boolean f() {
        int[] nArray = new int[var1[1]];
        nArray[a.var1[2]] = var1[4];
        return Equipment.contains((int[])nArray);
    }

    public boolean GiantsfoundryManager(Client client) {
        int n2;
        Widget widget = client.getWidget(var1[17]);
        if (a.var2(widget) && a.var2(widget.getChildren()) && a.var3(widget.getChildren().length) && a.var4(widget.getChild(var1[2]).getTextColor(), var1[18])) {
            n2 = var1[1];
            0;
            if ((0x54 ^ 0x50) <= 3) {
                return ((0 ^ 0x24) & ~(0xE7 ^ 0xC3)) != 0;
            }
        } else {
            n2 = var1[2];
        }
        return n2 != 0;
    }

    private Point i() {
        Widget widget = Widgets.get((int)var1[7], (int)var1[8]);
        if (!a.var2(widget) || a.var3(widget.isHidden() ? 1 : 0)) {
            return new Point(var1[9], var1[9]);
        }
        int n2 = widget.getOriginalX();
        int n3 = n2 + widget.getWidth();
        return new Point(n2, n3);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public GiantsfoundryManager(Client client) {
        this.E = client;
    }

    public NPC p() {
        int[] nArray = new int[var1[1]];
        nArray[a.var1[2]] = var1[13];
        return NPCs.getNearest((int[])nArray);
    }

    public int l() {
        Widget widget = Widgets.get((int)var1[7], (int)var1[11]);
        if (a.var6(Widgets.isVisible((Widget)widget) ? 1 : 0)) {
            return var1[9];
        }
        return widget.getCanvasLocation().getX() + widget.getWidth() / var1[3];
    }

    /*
     * WARNING - void declaration
     */
    public boolean n() {
        void var2_2;
        void var7;
        g g2 = this.k();
        if (a.var8((Object)g2)) {
            return var1[2];
        }
        Widget var9 = Widgets.get((int)var1[7], (int)var7.H().L());
        if (!a.var2(var9) || a.var3(var9.isHidden() ? 1 : 0)) {
            return var1[2];
        }
        return var2_2.isVisible();
    }

    static {
        a.var10();
        r = var1[11];
        A = var1[18];
        v = var1[19];
        u = var1[16];
        w = var1[0];
        z = var1[17];
        B = var1[20];
        q = var1[21];
        x = var1[22];
        j = var1[23];
        n = var1[24];
        p = var1[8];
        o = var1[10];
        D = var1[6];
        i = var1[25];
        l = var1[26];
        y = var1[13];
        m = var1[7];
        C = var1[5];
        t = var1[14];
        s = var1[15];
        h = var1[12];
        k = var1[27];
        g = LoggerFactory.getLogger(GiantsfoundryManager.class);
    }

    public boolean e() {
        boolean bl;
        if (a.var4(this.E.getVarbitValue(var1[0]), var1[3])) {
            bl = var1[1];
            0;
            if (((247 + 20 - 209 + 191 ^ 9 + 50 - -67 + 54) & (0x2E ^ 0x3B ^ (0xF1 ^ 0xA9) ^ -1)) != 0) {
                return ((0x7F ^ 0x20 ^ (3 ^ 0x59)) & (145 + 76 - 99 + 33 ^ 71 + 22 - 91 + 156 ^ -1)) != 0;
            }
        } else {
            bl = var1[2];
        }
        return bl;
    }

    public TileObject j() {
        g g2 = this.k();
        if (a.var8((Object)g2)) {
            return null;
        }
        int[] nArray = new int[var1[1]];
        nArray[a.var1[2]] = g2.J();
        return TileObjects.getNearest((int[])nArray);
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public Map<h, Point> o() {
        void var11;
        HashMap<h, Point> hashMap = new HashMap<h, Point>();
        h[] hArray = -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.h.values();
        int n2 = hArray.length;
        int var12 = var1[2];
        while (a.var13(var12, (int)var11)) {
            void var14;
            void var15 = var14[var12];
            Widget var16 = Widgets.get((int)var1[7], (int)var15.K());
            if (a.var6(Widgets.isVisible((Widget)var16) ? 1 : 0)) {
                0;
                if null != null {
                    return null;
                }
            } else {
                void var17;
                int var18 = var16.getBounds().x;
                int var19 = var16.getBounds().x + var16.getBounds().width;
                var17.put(var15, new Point(var18, var19));
                0;
            }
            ++var12;
            0;
            
            return null;
        }
        return hashMap;
    }

    private static boolean var20(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var21(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var2(Object object) {
        return object != null;
    }

    public TileObject q() {
        int[] nArray = new int[var1[1]];
        nArray[a.var1[2]] = var1[14];
        return TileObjects.getNearest((int[])nArray);
    }

    public boolean d() {
        boolean bl;
        if (a.var6(this.E.getVarbitValue(var1[0]))) {
            bl = var1[1];
            0;
            if (2 < 2) {
                return ((58 + 14 - -64 + 94 ^ 67 + 142 - 48 + 10) & (0x60 ^ 0x68 ^ (0x5A ^ 0x1F) ^ -1)) != 0;
            }
        } else {
            bl = var1[2];
        }
        return bl;
    }

    public boolean h() {
        boolean bl;
        a var22;
        if (a.var3(this.E.getVarbitValue(var1[5])) && !a.var6(this.E.getVarbitValue(var1[6])) || a.var3(var22.g() ? 1 : 0)) {
            bl = var1[1];
            0;
            if (-(0xB3 ^ 0xB7) >= 0) {
                return ((0x6E ^ 0x23) & ~(0x74 ^ 0x39)) != 0;
            }
        } else {
            bl = var1[2];
        }
        return bl;
    }

    public Client t() {
        return this.E;
    }

    /*
     * WARNING - void declaration
     */
    public g k() {
        a var23;
        void var24;
        Widget widget = Widgets.get((int)var1[7], (int)var1[10]);
        if (!a.var2(widget) || a.var3(widget.isHidden() ? 1 : 0)) {
            return null;
        }
        Widget[] var25 = var24.getChildren();
        if (a.var8(var25)) {
            return null;
        }
        Point var26 = var23.i();
        Widget[] var27 = var25;
        int var28 = var27.length;
        int var29 = var1[2];
        while (a.var13(var29, var28)) {
            Widget var30 = var27[var29];
            int var31 = var30.getSpriteId();
            if (a.var4(var31, var1[9])) {
                0;
                if ((0x45 ^ 0x41) <= 2) {
                    return null;
                }
            } else {
                g[] var32 = -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g.values();
                int var33 = var32.length;
                int var34 = var1[2];
                while (a.var13(var34, var33)) {
                    g var35 = var32[var34];
                    if (a.var20(var35.I(), var31)) {
                        0;
                        if (-1 >= 3) {
                            return null;
                        }
                    } else if (a.var5(var30.getOriginalX(), var26.getY())) {
                        if (a.var13(var30.getOriginalX(), var26.getX())) {
                            0;
                            if (-3 > 0) {
                                return null;
                            }
                        } else {
                            return var35;
                        }
                    }
                    ++var34;
                    0;
                    if ((0x97 ^ 0x93) >= (0xF ^ 0xB)) continue;
                    return null;
                }
            }
            ++var29;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public int m() {
        void var3_3;
        void var36;
        void var37;
        Map<h, Point> map = this.o();
        g g2 = this.k();
        if (a.var8((Object)g2)) {
            return var1[9];
        }
        if (a.var6(var37.containsKey((Object)var36.H()) ? 1 : 0)) {
            return var1[9];
        }
        Point var38 = (Point)var37.get((Object)var36.H());
        if (a.var21(var36, (Object)-.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g.GRINDSTONE)) {
            return var38.getX() + var1[12];
        }
        return var3_3.getY();
    }

    public TileObject r() {
        int[] nArray = new int[var1[1]];
        nArray[a.var1[2]] = var1[15];
        return TileObjects.getNearest((int[])nArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean GiantsfoundryManager(String string) {
        void var39;
        void var40;
        NPC nPC = this.p();
        if (a.var8(nPC)) {
            return var1[2];
        }
        void v0 = var40;
        Objects.requireNonNull(v0);
        0;
        if (a.var6(var39.hasAction(((String)v0)::equals) ? 1 : 0)) {
            return var1[2];
        }
        String string2 = string;
        Objects.requireNonNull(string2);
        0;
        nPC.interact(string2::equals);
        return var1[1];
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static void var10() {
        var1 = new int[28];
        a.var1[0] = -(0xFFFFE0FF & 0x5F83) & (0xFFFFFFF3 & 0x76FF);
        a.var1[1] = 1;
        a.var1[2] = (112 + 57 - 16 + 36 ^ 154 + 108 - 94 + 0) & (0x7E ^ 0xD ^ (0xEF ^ 0x89) ^ -1);
        a.var1[3] = 2;
        a.var1[4] = -(0xFFFFD6FD & 0x3917) & (0xFFFFF9D7 & 0x7FBE);
        a.var1[5] = 0xFFFFBE5B & 0x77F7;
        a.var1[6] = 0xFFFFFF5F & 0x36F4;
        a.var1[7] = -(0xFFFFAE7F & 0x758E) & (0xFFFFBFFF & 0x66FF);
        a.var1[8] = 0xFA ^ 0xA5 ^ (0x35 ^ 0x26);
        a.var1[9] = -1;
        a.var1[10] = 0x15 ^ 0x7D ^ (0xE4 ^ 0xC7);
        a.var1[11] = 4 ^ 0x36 ^ (0xF4 ^ 0x8C);
        a.var1[12] = 0x8A ^ 0x80;
        a.var1[13] = -(0x2D ^ 0x25) & (0xFFFFBFD7 & 0x6CFF);
        a.var1[14] = -(0xFFFFF77D & 0x9B3) & (0xFFFFAFFD & 0xFF7F);
        a.var1[15] = -(0xFFFFE987 & 0x1779) & (0xFFFFBFDB & 0xEF6F);
        a.var1[16] = -(0xFFFF95E5 & 0x7A9B) & (0xFFFFBEFE & 0xFFCD);
        a.var1[17] = -(0xFFFFE57A & 0x3B9F) & (0xFFFFAB3D & 0x2F275DF);
        a.var1[18] = -(0xFFFFA83F & 0x77E5) & (0xFFFFFFAF & 0xFCF777);
        a.var1[19] = -(0xFFFFCF26 & 0x39DD) & (0xFFFFFF7F & 0x3FFF);
        a.var1[20] = 0xFFFFD75F & 0x3FFF;
        a.var1[21] = 0x92 ^ 0x83 ^ (0xA4 ^ 0x88);
        a.var1[22] = 0xFFFFBE7D & 0x77FF;
        a.var1[23] = -(25 + 10 - -88 + 6) & (0xFFFFAEF7 & 0xFFDF);
        a.var1[24] = 0x4A ^ 0x76 ^ (0x7D ^ 0xF);
        a.var1[25] = 54 + 70 - -29 + 84 ^ 1 + 0 - -122 + 8;
        a.var1[26] = 0xFFFFEE7C & 0xBFDB;
        a.var1[27] = -(0xFFFFE34D & 0x5DB7) & (0xFFFFFFEF & 0xEFFD);
    }

    public boolean g() {
        int n2;
        if (a.var3(f.FORTE.A() ? 1 : 0) && a.var3(f.BLADE.A() ? 1 : 0) && a.var3(f.TIP.A() ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (-1 > 0) {
                return ((0x5F ^ 0xF) & ~(0x76 ^ 0x26)) != 0;
            }
        } else {
            n2 = var1[2];
        }
        return n2 != 0;
    }

    public TileObject s() {
        int[] nArray = new int[var1[1]];
        nArray[a.var1[2]] = var1[16];
        return TileObjects.getNearest((int[])nArray);
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }
}

