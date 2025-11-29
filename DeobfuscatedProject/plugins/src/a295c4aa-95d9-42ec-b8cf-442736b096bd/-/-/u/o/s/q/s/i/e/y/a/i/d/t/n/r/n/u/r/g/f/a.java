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

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.f;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.h;
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
public class a {
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
            "".length();
            if ((0x54 ^ 0x50) <= "   ".length()) {
                return ((0 ^ 0x24) & ~(0xE7 ^ 0xC3)) != 0;
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
        void lllllllllllllllIlIIIIlIIIIlllIll;
        g g2 = this.k();
        if (a.lIIIIIllIllIlIl((Object)g2)) {
            return llIlIlIllllI[2];
        }
        Widget lllllllllllllllIlIIIIlIIIIlllIlI = Widgets.get((int)llIlIlIllllI[7], (int)lllllllllllllllIlIIIIlIIIIlllIll.H().L());
        if (!a.lIIIIIllIllIlII(lllllllllllllllIlIIIIlIIIIlllIlI) || a.lIIIIIllIllIIll(lllllllllllllllIlIIIIlIIIIlllIlI.isHidden() ? 1 : 0)) {
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
            "".length();
            if (((247 + 20 - 209 + 191 ^ 9 + 50 - -67 + 54) & (0x2E ^ 0x3B ^ (0xF1 ^ 0xA9) ^ -" ".length())) != 0) {
                return ((0x7F ^ 0x20 ^ (3 ^ 0x59)) & (145 + 76 - 99 + 33 ^ 71 + 22 - 91 + 156 ^ -" ".length())) != 0;
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
        void lllllllllllllllIlIIIIlIIIIlIllll;
        HashMap<h, Point> hashMap = new HashMap<h, Point>();
        h[] hArray = -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.h.values();
        int n2 = hArray.length;
        int lllllllllllllllIlIIIIlIIIIlIlllI = llIlIlIllllI[2];
        while (a.lIIIIIllIllIllI(lllllllllllllllIlIIIIlIIIIlIlllI, (int)lllllllllllllllIlIIIIlIIIIlIllll)) {
            void lllllllllllllllIlIIIIlIIIIllIIII;
            void lllllllllllllllIlIIIIlIIIIlIllIl = lllllllllllllllIlIIIIlIIIIllIIII[lllllllllllllllIlIIIIlIIIIlIlllI];
            Widget lllllllllllllllIlIIIIlIIIIlIllII = Widgets.get((int)llIlIlIllllI[7], (int)lllllllllllllllIlIIIIlIIIIlIllIl.K());
            if (a.lIIIIIllIllIIIl(Widgets.isVisible((Widget)lllllllllllllllIlIIIIlIIIIlIllII) ? 1 : 0)) {
                "".length();
                if (null != null) {
                    return null;
                }
            } else {
                void lllllllllllllllIlIIIIlIIIIllIIIl;
                int lllllllllllllllIlIIIIlIIIIlIlIll = lllllllllllllllIlIIIIlIIIIlIllII.getBounds().x;
                int lllllllllllllllIlIIIIlIIIIlIlIlI = lllllllllllllllIlIIIIlIIIIlIllII.getBounds().x + lllllllllllllllIlIIIIlIIIIlIllII.getBounds().width;
                lllllllllllllllIlIIIIlIIIIllIIIl.put(lllllllllllllllIlIIIIlIIIIlIllIl, new Point(lllllllllllllllIlIIIIlIIIIlIlIll, lllllllllllllllIlIIIIlIIIIlIlIlI));
                "".length();
            }
            ++lllllllllllllllIlIIIIlIIIIlIlllI;
            "".length();
            if ("  ".length() >= -" ".length()) continue;
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
            "".length();
            if ("  ".length() < "  ".length()) {
                return ((58 + 14 - -64 + 94 ^ 67 + 142 - 48 + 10) & (0x60 ^ 0x68 ^ (0x5A ^ 0x1F) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIlIllllI[2];
        }
        return bl;
    }

    public boolean h() {
        boolean bl;
        a lllllllllllllllIlIIIIlIIIllIlllI;
        if (a.lIIIIIllIllIIll(this.E.getVarbitValue(llIlIlIllllI[5])) && !a.lIIIIIllIllIIIl(this.E.getVarbitValue(llIlIlIllllI[6])) || a.lIIIIIllIllIIll(lllllllllllllllIlIIIIlIIIllIlllI.g() ? 1 : 0)) {
            bl = llIlIlIllllI[1];
            "".length();
            if (-(0xB3 ^ 0xB7) >= 0) {
                return ((0x6E ^ 0x23) & ~(0x74 ^ 0x39)) != 0;
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
        a lllllllllllllllIlIIIIlIIIlIlIllI;
        void lllllllllllllllIlIIIIlIIIlIlIlIl;
        Widget widget = Widgets.get((int)llIlIlIllllI[7], (int)llIlIlIllllI[10]);
        if (!a.lIIIIIllIllIlII(widget) || a.lIIIIIllIllIIll(widget.isHidden() ? 1 : 0)) {
            return null;
        }
        Widget[] lllllllllllllllIlIIIIlIIIlIlIlII = lllllllllllllllIlIIIIlIIIlIlIlIl.getChildren();
        if (a.lIIIIIllIllIlIl(lllllllllllllllIlIIIIlIIIlIlIlII)) {
            return null;
        }
        Point lllllllllllllllIlIIIIlIIIlIlIIll = lllllllllllllllIlIIIIlIIIlIlIllI.i();
        Widget[] lllllllllllllllIlIIIIlIIIlIlIIlI = lllllllllllllllIlIIIIlIIIlIlIlII;
        int lllllllllllllllIlIIIIlIIIlIlIIIl = lllllllllllllllIlIIIIlIIIlIlIIlI.length;
        int lllllllllllllllIlIIIIlIIIlIlIIII = llIlIlIllllI[2];
        while (a.lIIIIIllIllIllI(lllllllllllllllIlIIIIlIIIlIlIIII, lllllllllllllllIlIIIIlIIIlIlIIIl)) {
            Widget lllllllllllllllIlIIIIlIIIlIIllll = lllllllllllllllIlIIIIlIIIlIlIIlI[lllllllllllllllIlIIIIlIIIlIlIIII];
            int lllllllllllllllIlIIIIlIIIlIIlllI = lllllllllllllllIlIIIIlIIIlIIllll.getSpriteId();
            if (a.lIIIIIllIllIIlI(lllllllllllllllIlIIIIlIIIlIIlllI, llIlIlIllllI[9])) {
                "".length();
                if ((0x45 ^ 0x41) <= "  ".length()) {
                    return null;
                }
            } else {
                g[] lllllllllllllllIlIIIIlIIIlIIllIl = -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g.values();
                int lllllllllllllllIlIIIIlIIIlIIllII = lllllllllllllllIlIIIIlIIIlIIllIl.length;
                int lllllllllllllllIlIIIIlIIIlIIlIll = llIlIlIllllI[2];
                while (a.lIIIIIllIllIllI(lllllllllllllllIlIIIIlIIIlIIlIll, lllllllllllllllIlIIIIlIIIlIIllII)) {
                    g lllllllllllllllIlIIIIlIIIlIIlIlI = lllllllllllllllIlIIIIlIIIlIIllIl[lllllllllllllllIlIIIIlIIIlIIlIll];
                    if (a.lIIIIIllIllIlll(lllllllllllllllIlIIIIlIIIlIIlIlI.I(), lllllllllllllllIlIIIIlIIIlIIlllI)) {
                        "".length();
                        if (-" ".length() >= "   ".length()) {
                            return null;
                        }
                    } else if (a.lIIIIIllIlllIII(lllllllllllllllIlIIIIlIIIlIIllll.getOriginalX(), lllllllllllllllIlIIIIlIIIlIlIIll.getY())) {
                        if (a.lIIIIIllIllIllI(lllllllllllllllIlIIIIlIIIlIIllll.getOriginalX(), lllllllllllllllIlIIIIlIIIlIlIIll.getX())) {
                            "".length();
                            if (-"   ".length() > 0) {
                                return null;
                            }
                        } else {
                            return lllllllllllllllIlIIIIlIIIlIIlIlI;
                        }
                    }
                    ++lllllllllllllllIlIIIIlIIIlIIlIll;
                    "".length();
                    if ((0x97 ^ 0x93) >= (0xF ^ 0xB)) continue;
                    return null;
                }
            }
            ++lllllllllllllllIlIIIIlIIIlIlIIII;
            "".length();
            if (-" ".length() < "  ".length()) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public int m() {
        void var3_3;
        void lllllllllllllllIlIIIIlIIIlIIIIIl;
        void lllllllllllllllIlIIIIlIIIlIIIIlI;
        Map<h, Point> map = this.o();
        g g2 = this.k();
        if (a.lIIIIIllIllIlIl((Object)g2)) {
            return llIlIlIllllI[9];
        }
        if (a.lIIIIIllIllIIIl(lllllllllllllllIlIIIIlIIIlIIIIlI.containsKey((Object)lllllllllllllllIlIIIIlIIIlIIIIIl.H()) ? 1 : 0)) {
            return llIlIlIllllI[9];
        }
        Point lllllllllllllllIlIIIIlIIIlIIIIII = (Point)lllllllllllllllIlIIIIlIIIlIIIIlI.get((Object)lllllllllllllllIlIIIIlIIIlIIIIIl.H());
        if (a.lIIIIIllIlllIIl(lllllllllllllllIlIIIIlIIIlIIIIIl, (Object)-.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g.GRINDSTONE)) {
            return lllllllllllllllIlIIIIlIIIlIIIIII.getX() + llIlIlIllllI[12];
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
        void lllllllllllllllIlIIIIlIIIIlIIlII;
        void lllllllllllllllIlIIIIlIIIIlIIlIl;
        NPC nPC = this.p();
        if (a.lIIIIIllIllIlIl(nPC)) {
            return llIlIlIllllI[2];
        }
        void v0 = lllllllllllllllIlIIIIlIIIIlIIlIl;
        Objects.requireNonNull(v0);
        "".length();
        if (a.lIIIIIllIllIIIl(lllllllllllllllIlIIIIlIIIIlIIlII.hasAction(((String)v0)::equals) ? 1 : 0)) {
            return llIlIlIllllI[2];
        }
        String string2 = string;
        Objects.requireNonNull(string2);
        "".length();
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
        a.llIlIlIllllI[1] = " ".length();
        a.llIlIlIllllI[2] = (112 + 57 - 16 + 36 ^ 154 + 108 - 94 + 0) & (0x7E ^ 0xD ^ (0xEF ^ 0x89) ^ -" ".length());
        a.llIlIlIllllI[3] = "  ".length();
        a.llIlIlIllllI[4] = -(0xFFFFD6FD & 0x3917) & (0xFFFFF9D7 & 0x7FBE);
        a.llIlIlIllllI[5] = 0xFFFFBE5B & 0x77F7;
        a.llIlIlIllllI[6] = 0xFFFFFF5F & 0x36F4;
        a.llIlIlIllllI[7] = -(0xFFFFAE7F & 0x758E) & (0xFFFFBFFF & 0x66FF);
        a.llIlIlIllllI[8] = 0xFA ^ 0xA5 ^ (0x35 ^ 0x26);
        a.llIlIlIllllI[9] = -" ".length();
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
            "".length();
            if (-" ".length() > 0) {
                return ((0x5F ^ 0xF) & ~(0x76 ^ 0x26)) != 0;
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

