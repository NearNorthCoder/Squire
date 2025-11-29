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
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.FEnum;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.GEnum;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.HEnum;
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
public class a_Unknown {
    private static final /* synthetic */ int s;
    private static final /* synthetic */ int w;
    private static final /* synthetic */ int x;
    private static final /* synthetic */ int u;
    public static final /* synthetic */ int k;
    private static final /* synthetic */ int o;
    private static /* synthetic */ int[] llIlIlIllllI;
    private static final /* synthetic */ int z;
    private final /* synthetic */ Client E;
    private static final /* synthetic */ Logger g;
    private static final /* synthetic */ int D;
    private static final /* synthetic */ int A;
    private static final /* synthetic */ int m;
    private static final /* synthetic */ int v;
    public static final /* synthetic */ int j;
    private static final /* synthetic */ int p;
    public static final /* synthetic */ int l;
    private static final /* synthetic */ int q;
    private static final /* synthetic */ int y;
    public static final /* synthetic */ int i;
    private static final /* synthetic */ int r;
    private static final /* synthetic */ int n;
    private static final /* synthetic */ int B;
    private static final /* synthetic */ int C;
    public static final /* synthetic */ int h;
    private static final /* synthetic */ int t;

    public boolean f() {
        int[] nArray = new int[llIlIlIllllI[1]];
        nArray[a.llIlIlIllllI[2]] = llIlIlIllllI[4];
        return Equipment.contains((int[])nArray);
    }

    public boolean a(Client client) {
        int n2;
        Widget widget = client.getWidget(llIlIlIllllI[17]);
        if (a.lIIIIIllIllIlII(widget) && a.lIIIIIllIllIlII(widget.getChildren()) && a.lIIIIIllIllIIll(widget.getChildren().length) && a.lIIIIIllIllIIlI(widget.getChild(llIlIlIllllI[2]).getTextColor(), llIlIlIllllI[18])) {
            n2 = llIlIlIllllI[1];
            0;
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
    public a(Client client) {
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
        void var12;
        g g2 = this.k();
        if (a.lIIIIIllIllIlIl((Object)g2)) {
            return llIlIlIllllI[2];
        }
        Widget var8 = Widgets.get((int)llIlIlIllllI[7], (int)var12.H().L());
        if (!a.lIIIIIllIllIlII(var8) || a.lIIIIIllIllIIll(var8.isHidden() ? 1 : 0)) {
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
        g = LoggerFactory.getLogger(a.class);
    }

    public boolean e() {
        boolean bl;
        if (a.lIIIIIllIllIIlI(this.E.getVarbitValue(llIlIlIllllI[0]), llIlIlIllllI[3])) {
            bl = llIlIlIllllI[1];
            0;
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
        void var25;
        HashMap<h, Point> hashMap = new HashMap<h, Point>();
        h[] hArray = -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.HEnum.values();
        int n2 = hArray.length;
        int var5 = llIlIlIllllI[2];
        while (a.lIIIIIllIllIllI(var5, (int)var25)) {
            void var6;
            void var2 = var6[var5];
            Widget var15 = Widgets.get((int)llIlIlIllllI[7], (int)var2.K());
            if (a.lIIIIIllIllIIIl(Widgets.isVisible((Widget)var15) ? 1 : 0)) {
                0;
                
                }
            } else {
                void var11;
                int var17 = var15.getBounds().x;
                int var22 = var15.getBounds().x + var15.getBounds().width;
                var11.put(var2, new Point(var17, var22));
                0;
            }
            ++var5;
            0;
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
            0;
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
        a var13;
        if (a.lIIIIIllIllIIll(this.E.getVarbitValue(llIlIlIllllI[5])) && !a.lIIIIIllIllIIIl(this.E.getVarbitValue(llIlIlIllllI[6])) || a.lIIIIIllIllIIll(var13.g() ? 1 : 0)) {
            bl = llIlIlIllllI[1];
            0;
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
        a var27;
        void var3;
        Widget widget = Widgets.get((int)llIlIlIllllI[7], (int)llIlIlIllllI[10]);
        if (!a.lIIIIIllIllIlII(widget) || a.lIIIIIllIllIIll(widget.isHidden() ? 1 : 0)) {
            return null;
        }
        Widget[] var18 = var3.getChildren();
        if (a.lIIIIIllIllIlIl(var18)) {
            return null;
        }
        Point var21 = var27.i();
        Widget[] var19 = var18;
        int var1 = var19.length;
        int var20 = llIlIlIllllI[2];
        while (a.lIIIIIllIllIllI(var20, var1)) {
            Widget var9 = var19[var20];
            int var14 = var9.getSpriteId();
            if (a.lIIIIIllIllIIlI(var14, llIlIlIllllI[9])) {
                0;
                if ((0x45 ^ 0x41) <= 2) {
                    return null;
                }
            } else {
                g[] var10 = -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.GEnum.values();
                int var7 = var10.length;
                int var28 = llIlIlIllllI[2];
                while (a.lIIIIIllIllIllI(var28, var7)) {
                    g var4 = var10[var28];
                    if (a.lIIIIIllIllIlll(var4.I(), var14)) {
                        0;
                        if (-1 >= 3) {
                            return null;
                        }
                    } else if (a.lIIIIIllIlllIII(var9.getOriginalX(), var21.getY())) {
                        if (a.lIIIIIllIllIllI(var9.getOriginalX(), var21.getX())) {
                            0;
                            if (-3 > 0) {
                                return null;
                            }
                        } else {
                            return var4;
                        }
                    }
                    ++var28;
                    0;
                    if ((0x97 ^ 0x93) >= (0xF ^ 0xB)) continue;
                    return null;
                }
            }
            ++var20;
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
        void var26;
        void var29;
        Map<h, Point> map = this.o();
        g g2 = this.k();
        if (a.lIIIIIllIllIlIl((Object)g2)) {
            return llIlIlIllllI[9];
        }
        if (a.lIIIIIllIllIIIl(var29.containsKey((Object)var26.H()) ? 1 : 0)) {
            return llIlIlIllllI[9];
        }
        Point var16 = (Point)var29.get((Object)var26.H());
        if (a.lIIIIIllIlllIIl(var26, (Object)-.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.GEnum.GRINDSTONE)) {
            return var16.getX() + llIlIlIllllI[12];
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
    public boolean a(String string) {
        void var24;
        void var23;
        NPC nPC = this.p();
        if (a.lIIIIIllIllIlIl(nPC)) {
            return llIlIlIllllI[2];
        }
        void v0 = var23;
        Objects.requireNonNull(v0);
        0;
        if (a.lIIIIIllIllIIIl(var24.hasAction(((String)v0)::equals) ? 1 : 0)) {
            return llIlIlIllllI[2];
        }
        String string2 = string;
        Objects.requireNonNull(string2);
        0;
        nPC.interact(string2::equals);
        return llIlIlIllllI[1];
    }

    private static boolean lIIIIIllIllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIIllIllIlIl(Object object) {
        return object == null;
    }

    private static void lIIIIIllIllIIII() {
        llIlIlIllllI = new int[28];
        a.llIlIlIllllI[0] = -(0xFFFFE0FF & 0x5F83) & (0xFFFFFFF3 & 0x76FF);
        a.llIlIlIllllI[1] = 1;
        a.llIlIlIllllI[2] = (112 + 57 - 16 + 36 ^ 154 + 108 - 94 + 0) & (0x7E ^ 0xD ^ (0xEF ^ 0x89) ^ -1);
        a.llIlIlIllllI[3] = 2;
        a.llIlIlIllllI[4] = -(0xFFFFD6FD & 0x3917) & (0xFFFFF9D7 & 0x7FBE);
        a.llIlIlIllllI[5] = 0xFFFFBE5B & 0x77F7;
        a.llIlIlIllllI[6] = 0xFFFFFF5F & 0x36F4;
        a.llIlIlIllllI[7] = -(0xFFFFAE7F & 0x758E) & (0xFFFFBFFF & 0x66FF);
        a.llIlIlIllllI[8] = 0xFA ^ 0xA5 ^ (0x35 ^ 0x26);
        a.llIlIlIllllI[9] = -1;
        a.llIlIlIllllI[10] = 0x15 ^ 0x7D ^ (0xE4 ^ 0xC7);
        a.llIlIlIllllI[11] = 4 ^ 0x36 ^ (0xF4 ^ 0x8C);
        a.llIlIlIllllI[12] = 0x8A ^ 0x80;
        a.llIlIlIllllI[13] = -(0x2D ^ 0x25) & (0xFFFFBFD7 & 0x6CFF);
        a.llIlIlIllllI[14] = -(0xFFFFF77D & 0x9B3) & (0xFFFFAFFD & 0xFF7F);
        a.llIlIlIllllI[15] = -(0xFFFFE987 & 0x1779) & (0xFFFFBFDB & 0xEF6F);
        a.llIlIlIllllI[16] = -(0xFFFF95E5 & 0x7A9B) & (0xFFFFBEFE & 0xFFCD);
        a.llIlIlIllllI[17] = -(0xFFFFE57A & 0x3B9F) & (0xFFFFAB3D & 0x2F275DF);
        a.llIlIlIllllI[18] = -(0xFFFFA83F & 0x77E5) & (0xFFFFFFAF & 0xFCF777);
        a.llIlIlIllllI[19] = -(0xFFFFCF26 & 0x39DD) & (0xFFFFFF7F & 0x3FFF);
        a.llIlIlIllllI[20] = 0xFFFFD75F & 0x3FFF;
        a.llIlIlIllllI[21] = 0x92 ^ 0x83 ^ (0xA4 ^ 0x88);
        a.llIlIlIllllI[22] = 0xFFFFBE7D & 0x77FF;
        a.llIlIlIllllI[23] = -(25 + 10 - -88 + 6) & (0xFFFFAEF7 & 0xFFDF);
        a.llIlIlIllllI[24] = 0x4A ^ 0x76 ^ (0x7D ^ 0xF);
        a.llIlIlIllllI[25] = 54 + 70 - -29 + 84 ^ 1 + 0 - -122 + 8;
        a.llIlIlIllllI[26] = 0xFFFFEE7C & 0xBFDB;
        a.llIlIlIllllI[27] = -(0xFFFFE34D & 0x5DB7) & (0xFFFFFFEF & 0xEFFD);
    }

    public boolean g() {
        int n2;
        if (a.lIIIIIllIllIIll(f.FORTE.A() ? 1 : 0) && a.lIIIIIllIllIIll(f.BLADE.A() ? 1 : 0) && a.lIIIIIllIllIIll(f.TIP.A() ? 1 : 0)) {
            n2 = llIlIlIllllI[1];
            0;
            if (-1 > 0) {
                return false;
            }
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

