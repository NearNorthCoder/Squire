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

import gg.squire.giantsfoundry.tasks.GameEnum19;
import gg.squire.giantsfoundry.tasks.GameEnum;
import gg.squire.giantsfoundry.tasks.GameEnum21;
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
        int[] nArray = new int[llIlIlIllllI[1]];
        nArray[a.llIlIlIllllI[2]] = llIlIlIllllI[4];
        return Equipment.contains((int[])nArray);
    }

    public boolean GiantsfoundryManager(Client client) {
        int n2;
        Widget widget = client.getWidget(llIlIlIllllI[17]);
        if (a.lIIIIIllIllIlII(widget) && a.lIIIIIllIllIlII(widget.getChildren()) && a.lIIIIIllIllIIll(widget.getChildren().length) && a.lIIIIIllIllIIlI(widget.getChild(llIlIlIllllI[2]).getTextColor(), llIlIlIllllI[18])) {
            n2 = llIlIlIllllI[1];

            if ((0x54 ^ 0x50) <= 3) {
                return false;
            }
        } else {
            n2 = llIlIlIllllI[2];
        }
        return n2 != 0;
    }

    private Point i() {
        Widget widget = Widgets.get((int)llIlIlIllllI[7], (int)llIlIlIllllI[8]);
        if (!a.lIIIIIllIllIlII(widget) || a.lIIIIIllIllIIll(widget.isHidden() ? 1 : 0)) {
            return new Point(llIlIlIllllI[9], llIlIlIllllI[9]);
        }
        int n2 = widget.getOriginalX();
        int n3 = n2 + widget.getWidth();
        return new Point(n2, n3);
    }

    private static boolean lIIIIIllIllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIllIlllIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public GiantsfoundryManager(Client client) {
        this.E = client;
    }

    public NPC p() {
        int[] nArray = new int[llIlIlIllllI[1]];
        nArray[a.llIlIlIllllI[2]] = llIlIlIllllI[13];
        return NPCs.getNearest((int[])nArray);
    }

    public int l() {
        Widget widget = Widgets.get((int)llIlIlIllllI[7], (int)llIlIlIllllI[11]);
        if (a.lIIIIIllIllIIIl(Widgets.isVisible((Widget)widget) ? 1 : 0)) {
            return llIlIlIllllI[9];
        }
        return widget.getCanvasLocation().getX() + widget.getWidth() / llIlIlIllllI[3];
    }

    /*
     * WARNING - void declaration
     */
    public boolean n() {
        void var2_2;
        void var1;
        g g2 = this.k();
        if (a.lIIIIIllIllIlIl((Object)g2)) {
            return llIlIlIllllI[2];
        }
        Widget var2 = Widgets.get((int)llIlIlIllllI[7], (int)var1.H().L());
        if (!a.lIIIIIllIllIlII(var2) || a.lIIIIIllIllIIll(var2.isHidden() ? 1 : 0)) {
            return llIlIlIllllI[2];
        }
        return var2_2.isVisible();
    }

    static {
        a.lIIIIIllIllIIII();
        r = llIlIlIllllI[11];
        A = llIlIlIllllI[18];
        v = llIlIlIllllI[19];
        u = llIlIlIllllI[16];
        w = llIlIlIllllI[0];
        z = llIlIlIllllI[17];
        B = llIlIlIllllI[20];
        q = llIlIlIllllI[21];
        x = llIlIlIllllI[22];
        j = llIlIlIllllI[23];
        n = llIlIlIllllI[24];
        p = llIlIlIllllI[8];
        o = llIlIlIllllI[10];
        D = llIlIlIllllI[6];
        i = llIlIlIllllI[25];
        l = llIlIlIllllI[26];
        y = llIlIlIllllI[13];
        m = llIlIlIllllI[7];
        C = llIlIlIllllI[5];
        t = llIlIlIllllI[14];
        s = llIlIlIllllI[15];
        h = llIlIlIllllI[12];
        k = llIlIlIllllI[27];
        g = LoggerFactory.getLogger(GiantsfoundryManager.class);
    }

    public boolean e() {
        boolean bl;
        if (a.lIIIIIllIllIIlI(this.E.getVarbitValue(llIlIlIllllI[0]), llIlIlIllllI[3])) {
            bl = llIlIlIllllI[1];

            if (((247 + 20 - 209 + 191 ^ 9 + 50 - -67 + 54) & (0x2E ^ 0x3B ^ (0xF1 ^ 0xA9) ^ -1)) != 0) {
                return ((0x7F ^ 0x20 ^ (3 ^ 0x59)) & (145 + 76 - 99 + 33 ^ 71 + 22 - 91 + 156 ^ -1)) != 0;
            }
        } else {
            bl = llIlIlIllllI[2];
        }
        return bl;
    }

    public TileObject j() {
        g g2 = this.k();
        if (a.lIIIIIllIllIlIl((Object)g2)) {
            return null;
        }
        int[] nArray = new int[llIlIlIllllI[1]];
        nArray[a.llIlIlIllllI[2]] = g2.J();
        return TileObjects.getNearest((int[])nArray);
    }

    private static boolean lIIIIIllIllIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public Map<h, Point> o() {
        void var3;
        HashMap<h, Point> hashMap = new HashMap<h, Point>();
        h[] hArray = -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.h.values();
        int n2 = hArray.length;
        int var4 = llIlIlIllllI[2];
        while (a.lIIIIIllIllIllI(var4, (int)var3)) {
            void var5;
            void var6 = var5[var4];
            Widget var7 = Widgets.get((int)llIlIlIllllI[7], (int)var6.K());
            if (a.lIIIIIllIllIIIl(Widgets.isVisible((Widget)var7) ? 1 : 0)) {

                }
            } else {
                void var8;
                int var9 = var7.getBounds().x;
                int var10 = var7.getBounds().x + var7.getBounds().width;
                var8.put(var6, new Point(var9, var10));

            }
            ++var4;

            if (2 >= -1) continue;
            return null;
        }
        return hashMap;
    }

    private static boolean lIIIIIllIllIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIIllIlllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIllIllIlII(Object object) {
        return object != null;
    }

    public TileObject q() {
        int[] nArray = new int[llIlIlIllllI[1]];
        nArray[a.llIlIlIllllI[2]] = llIlIlIllllI[14];
        return TileObjects.getNearest((int[])nArray);
    }

    public boolean d() {
        boolean bl;
        if (a.lIIIIIllIllIIIl(this.E.getVarbitValue(llIlIlIllllI[0]))) {
            bl = llIlIlIllllI[1];

            if (2 < 2) {
                return ((58 + 14 - -64 + 94 ^ 67 + 142 - 48 + 10) & (0x60 ^ 0x68 ^ (0x5A ^ 0x1F) ^ -1)) != 0;
            }
        } else {
            bl = llIlIlIllllI[2];
        }
        return bl;
    }

    public boolean h() {
        boolean bl;
        a var11;
        if (a.lIIIIIllIllIIll(this.E.getVarbitValue(llIlIlIllllI[5])) && !a.lIIIIIllIllIIIl(this.E.getVarbitValue(llIlIlIllllI[6])) || a.lIIIIIllIllIIll(var11.g() ? 1 : 0)) {
            bl = llIlIlIllllI[1];

            if (-(0xB3 ^ 0xB7) >= 0) {
                return false;
            }
        } else {
            bl = llIlIlIllllI[2];
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
        a var12;
        void var13;
        Widget widget = Widgets.get((int)llIlIlIllllI[7], (int)llIlIlIllllI[10]);
        if (!a.lIIIIIllIllIlII(widget) || a.lIIIIIllIllIIll(widget.isHidden() ? 1 : 0)) {
            return null;
        }
        Widget[] var14 = var13.getChildren();
        if (a.lIIIIIllIllIlIl(var14)) {
            return null;
        }
        Point var15 = var12.i();
        Widget[] var16 = var14;
        int var17 = var16.length;
        int var18 = llIlIlIllllI[2];
        while (a.lIIIIIllIllIllI(var18, var17)) {
            Widget var19 = var16[var18];
            int var20 = var19.getSpriteId();
            if (a.lIIIIIllIllIIlI(var20, llIlIlIllllI[9])) {

                if ((0x45 ^ 0x41) <= 2) {
                    return null;
                }
            } else {
                g[] var21 = -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g.values();
                int var22 = var21.length;
                int var23 = llIlIlIllllI[2];
                while (a.lIIIIIllIllIllI(var23, var22)) {
                    g var24 = var21[var23];
                    if (a.lIIIIIllIllIlll(var24.I(), var20)) {

                        if (-1 >= 3) {
                            return null;
                        }
                    } else if (a.lIIIIIllIlllIII(var19.getOriginalX(), var15.getY())) {
                        if (a.lIIIIIllIllIllI(var19.getOriginalX(), var15.getX())) {

                        } else {
                            return var24;
                        }
                    }
                    ++var23;

                    if ((0x97 ^ 0x93) >= (0xF ^ 0xB)) continue;
                    return null;
                }
            }
            ++var18;

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
        void var25;
        void var26;
        Map<h, Point> map = this.o();
        g g2 = this.k();
        if (a.lIIIIIllIllIlIl((Object)g2)) {
            return llIlIlIllllI[9];
        }
        if (a.lIIIIIllIllIIIl(var26.containsKey((Object)var25.H()) ? 1 : 0)) {
            return llIlIlIllllI[9];
        }
        Point var27 = (Point)var26.get((Object)var25.H());
        if (a.lIIIIIllIlllIIl(var25, (Object)-.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g.GRINDSTONE)) {
            return var27.getX() + llIlIlIllllI[12];
        }
        return var3_3.getY();
    }

    public TileObject r() {
        int[] nArray = new int[llIlIlIllllI[1]];
        nArray[a.llIlIlIllllI[2]] = llIlIlIllllI[15];
        return TileObjects.getNearest((int[])nArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean GiantsfoundryManager(String string) {
        void var28;
        void var29;
        NPC nPC = this.p();
        if (a.lIIIIIllIllIlIl(nPC)) {
            return llIlIlIllllI[2];
        }
        void v0 = var29;
        Objects.requireNonNull(v0);

        if (a.lIIIIIllIllIIIl(var28.hasAction(((String)v0)::equals) ? 1 : 0)) {
            return llIlIlIllllI[2];
        }
        String string2 = string;
        Objects.requireNonNull(string2);

        nPC.interact(string2::equals);
        return llIlIlIllllI[1];
    }

    private static boolean lIIIIIllIllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIIllIllIlIl(Object object) {
        return object == null;
    }

    public boolean g() {
        int n2;
        if (a.lIIIIIllIllIIll(f.FORTE.A() ? 1 : 0) && a.lIIIIIllIllIIll(f.BLADE.A() ? 1 : 0) && a.lIIIIIllIllIIll(f.TIP.A() ? 1 : 0)) {
            n2 = llIlIlIllllI[1];

        } else {
            n2 = llIlIlIllllI[2];
        }
        return n2 != 0;
    }

    public TileObject s() {
        int[] nArray = new int[llIlIlIllllI[1]];
        nArray[a.llIlIlIllllI[2]] = llIlIlIllllI[16];
        return TileObjects.getNearest((int[])nArray);
    }

    private static boolean lIIIIIllIllIllI(int n2, int n3) {
        return n2 < n3;
    }
}

