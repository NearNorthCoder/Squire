package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

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
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/a.class */
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
        int[] iArr = new int[llIlIlIllllI[1]];
        iArr[llIlIlIllllI[2]] = llIlIlIllllI[4];
        return Equipment.contains(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean a(Client client) {
        Widget widget = client.getWidget(llIlIlIllllI[17]);
        if (lIIIIIllIllIlII(widget) && lIIIIIllIllIlII(widget.getChildren()) && lIIIIIllIllIIll(widget.getChildren().length) && lIIIIIllIllIIlI(widget.getChild(llIlIlIllllI[2]).getTextColor(), llIlIlIllllI[18])) {
            ?? r0 = llIlIlIllllI[1];
            "".length();
            return (84 ^ 80) <= "   ".length() ? (false ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIlIllllI[2];
    }

    private Point i() {
        Widget widget = Widgets.get(llIlIlIllllI[7], llIlIlIllllI[8]);
        if (!lIIIIIllIllIlII(widget) || lIIIIIllIllIIll(widget.isHidden() ? 1 : 0)) {
            return new Point(llIlIlIllllI[9], llIlIlIllllI[9]);
        }
        int originalX = widget.getOriginalX();
        return new Point(originalX, originalX + widget.getWidth());
    }

    private static boolean lIIIIIllIllIIll(int i2) {
        return i2 != 0;
    }

    private static boolean lIIIIIllIlllIII(int i2, int i3) {
        return i2 <= i3;
    }

    @Inject
    public a(Client client) {
        this.E = client;
    }

    public NPC p() {
        int[] iArr = new int[llIlIlIllllI[1]];
        iArr[llIlIlIllllI[2]] = llIlIlIllllI[13];
        return NPCs.getNearest(iArr);
    }

    public int l() {
        Widget widget = Widgets.get(llIlIlIllllI[7], llIlIlIllllI[11]);
        return lIIIIIllIllIIIl(Widgets.isVisible(widget) ? 1 : 0) ? llIlIlIllllI[9] : widget.getCanvasLocation().getX() + (widget.getWidth() / llIlIlIllllI[3]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean n() {
        g k2 = k();
        if (lIIIIIllIllIlIl(k2)) {
            return llIlIlIllllI[2];
        }
        Widget widget = Widgets.get(llIlIlIllllI[7], k2.H().L());
        return (!lIIIIIllIllIlII(widget) || lIIIIIllIllIIll(widget.isHidden() ? 1 : 0)) ? llIlIlIllllI[2] : widget.isVisible();
    }

    static {
        lIIIIIllIllIIII();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean e() {
        if (lIIIIIllIllIIlI(this.E.getVarbitValue(llIlIlIllllI[0]), llIlIlIllllI[3])) {
            ?? r0 = llIlIlIllllI[1];
            "".length();
            return (((((247 + 20) - 209) + 191) ^ (((9 + 50) - (-67)) + 54)) & (((46 ^ 59) ^ (241 ^ 169)) ^ (-" ".length()))) != 0 ? ((127 ^ 32) ^ (3 ^ 89)) & (((((145 + 76) - 99) + 33) ^ (((71 + 22) - 91) + 156)) ^ (-" ".length())) : r0;
        }
        return llIlIlIllllI[2];
    }

    public TileObject j() {
        g k2 = k();
        if (lIIIIIllIllIlIl(k2)) {
            return null;
        }
        int[] iArr = new int[llIlIlIllllI[1]];
        iArr[llIlIlIllllI[2]] = k2.J();
        return TileObjects.getNearest(iArr);
    }

    private static boolean lIIIIIllIllIIIl(int i2) {
        return i2 == 0;
    }

    public Map<h, Point> o() {
        HashMap hashMap = new HashMap();
        h[] values = h.values();
        int length = values.length;
        int i2 = llIlIlIllllI[2];
        while (lIIIIIllIllIllI(i2, length)) {
            h hVar = values[i2];
            Widget widget = Widgets.get(llIlIlIllllI[7], hVar.K());
            if (lIIIIIllIllIIIl(Widgets.isVisible(widget) ? 1 : 0)) {
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else {
                int i3 = widget.getBounds().x;
                int lllllllllllllllIlIIIIlIIIIlIlIlI = widget.getBounds().x + widget.getBounds().width;
                hashMap.put(hVar, new Point(i3, lllllllllllllllIlIIIIlIIIIlIlIlI));
                "".length();
            }
            i2++;
            "".length();
            if ("  ".length() < (-" ".length())) {
                return null;
            }
        }
        return hashMap;
    }

    private static boolean lIIIIIllIllIlll(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIIIIIllIlllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIIIllIllIlII(Object obj) {
        return obj != null;
    }

    public TileObject q() {
        int[] iArr = new int[llIlIlIllllI[1]];
        iArr[llIlIlIllllI[2]] = llIlIlIllllI[14];
        return TileObjects.getNearest(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean d() {
        if (lIIIIIllIllIIIl(this.E.getVarbitValue(llIlIlIllllI[0]))) {
            ?? r0 = llIlIlIllllI[1];
            "".length();
            return "  ".length() < "  ".length() ? ((((58 + 14) - (-64)) + 94) ^ (((67 + 142) - 48) + 10)) & (((96 ^ 104) ^ (90 ^ 31)) ^ (-" ".length())) : r0;
        }
        return llIlIlIllllI[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean h() {
        if ((!lIIIIIllIllIIll(this.E.getVarbitValue(llIlIlIllllI[5])) || lIIIIIllIllIIIl(this.E.getVarbitValue(llIlIlIllllI[6]))) && !lIIIIIllIllIIll(g() ? 1 : 0)) {
            return llIlIlIllllI[2];
        }
        ?? r0 = llIlIlIllllI[1];
        "".length();
        return (-(179 ^ 183)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    public Client t() {
        return this.E;
    }

    public g k() {
        Widget widget = Widgets.get(llIlIlIllllI[7], llIlIlIllllI[10]);
        if (!lIIIIIllIllIlII(widget) || lIIIIIllIllIIll(widget.isHidden() ? 1 : 0)) {
            return null;
        }
        Widget[] children = widget.getChildren();
        if (lIIIIIllIllIlIl(children)) {
            return null;
        }
        Point i2 = i();
        int length = children.length;
        int i3 = llIlIlIllllI[2];
        while (lIIIIIllIllIllI(i3, length)) {
            Widget widget2 = children[i3];
            int spriteId = widget2.getSpriteId();
            if (lIIIIIllIllIIlI(spriteId, llIlIlIllllI[9])) {
                "".length();
                if ((69 ^ 65) <= "  ".length()) {
                    return null;
                }
            } else {
                g[] values = g.values();
                int length2 = values.length;
                int i4 = llIlIlIllllI[2];
                while (lIIIIIllIllIllI(i4, length2)) {
                    g gVar = values[i4];
                    if (lIIIIIllIllIlll(gVar.I(), spriteId)) {
                        "".length();
                        if ((-" ".length()) >= "   ".length()) {
                            return null;
                        }
                    } else if (lIIIIIllIlllIII(widget2.getOriginalX(), i2.getY())) {
                        if (!lIIIIIllIllIllI(widget2.getOriginalX(), i2.getX())) {
                            return gVar;
                        }
                        "".length();
                        if ((-"   ".length()) > 0) {
                            return null;
                        }
                    }
                    i4++;
                    "".length();
                    if ((151 ^ 147) < (15 ^ 11)) {
                        return null;
                    }
                }
            }
            i3++;
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return null;
            }
        }
        return null;
    }

    public int m() {
        Map<h, Point> o2 = o();
        g k2 = k();
        if (!lIIIIIllIllIlIl(k2) && !lIIIIIllIllIIIl(o2.containsKey(k2.H()) ? 1 : 0)) {
            Point point = o2.get(k2.H());
            return lIIIIIllIlllIIl(k2, g.GRINDSTONE) ? point.getX() + llIlIlIllllI[12] : point.getY();
        }
        return llIlIlIllllI[9];
    }

    public TileObject r() {
        int[] iArr = new int[llIlIlIllllI[1]];
        iArr[llIlIlIllllI[2]] = llIlIlIllllI[15];
        return TileObjects.getNearest(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(String str) {
        NPC p2 = p();
        if (lIIIIIllIllIlIl(p2)) {
            return llIlIlIllllI[2];
        }
        Objects.requireNonNull(str);
        "".length();
        if (lIIIIIllIllIIIl(p2.hasAction((v1) -> {
            return r1.equals(v1);
        }) ? 1 : 0)) {
            return llIlIlIllllI[2];
        }
        Objects.requireNonNull(str);
        "".length();
        p2.interact((v1) -> {
            return r1.equals(v1);
        });
        return llIlIlIllllI[1];
    }

    private static boolean lIIIIIllIllIIlI(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIIIIIllIllIlIl(Object obj) {
        return obj == null;
    }

    private static void lIIIIIllIllIIII() {
        llIlIlIllllI = new int[28];
        llIlIlIllllI[0] = (-((-7937) & 24451)) & (-13) & 30463;
        llIlIlIllllI[1] = " ".length();
        llIlIlIllllI[2] = ((((112 + 57) - 16) + 36) ^ (((154 + 108) - 94) + 0)) & (((126 ^ 13) ^ (239 ^ 137)) ^ (-" ".length()));
        llIlIlIllllI[3] = "  ".length();
        llIlIlIllllI[4] = (-((-10499) & 14615)) & (-1577) & 32702;
        llIlIlIllllI[5] = (-16805) & 30711;
        llIlIlIllllI[6] = (-161) & 14068;
        llIlIlIllllI[7] = (-((-20865) & 30094)) & (-16385) & 26367;
        llIlIlIllllI[8] = (250 ^ 165) ^ (53 ^ 38);
        llIlIlIllllI[9] = -" ".length();
        llIlIlIllllI[10] = (21 ^ 125) ^ (228 ^ 199);
        llIlIlIllllI[11] = (4 ^ 54) ^ (244 ^ 140);
        llIlIlIllllI[12] = 138 ^ 128;
        llIlIlIllllI[13] = (-(45 ^ 37)) & (-16425) & 27903;
        llIlIlIllllI[14] = (-((-2179) & 2483)) & (-20483) & 65407;
        llIlIlIllllI[15] = (-((-5753) & 6009)) & (-16421) & 61295;
        llIlIlIllllI[16] = (-((-27163) & 31387)) & (-16642) & 65485;
        llIlIlIllllI[17] = (-((-6790) & 15263)) & (-21699) & 49444319;
        llIlIlIllllI[18] = (-((-22465) & 30693)) & (-81) & 16578423;
        llIlIlIllllI[19] = (-((-12506) & 14813)) & (-129) & 16383;
        llIlIlIllllI[20] = (-10401) & 16383;
        llIlIlIllllI[21] = (146 ^ 131) ^ (164 ^ 136);
        llIlIlIllllI[22] = (-16771) & 30719;
        llIlIlIllllI[23] = (-(((25 + 10) - (-88)) + 6)) & (-20745) & 65503;
        llIlIlIllllI[24] = (74 ^ 118) ^ (125 ^ 15);
        llIlIlIllllI[25] = (((54 + 70) - (-29)) + 84) ^ (((1 + 0) - (-122)) + 8);
        llIlIlIllllI[26] = (-4484) & 49115;
        llIlIlIllllI[27] = (-((-7347) & 23991)) & (-17) & 61437;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean g() {
        if (lIIIIIllIllIIll(f.FORTE.A() ? 1 : 0) && lIIIIIllIllIIll(f.BLADE.A() ? 1 : 0) && lIIIIIllIllIIll(f.TIP.A() ? 1 : 0)) {
            ?? r0 = llIlIlIllllI[1];
            "".length();
            return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIlIllllI[2];
    }

    public TileObject s() {
        int[] iArr = new int[llIlIlIllllI[1]];
        iArr[llIlIlIllllI[2]] = llIlIlIllllI[16];
        return TileObjects.getNearest(iArr);
    }

    private static boolean lIIIIIllIllIllI(int i2, int i3) {
        return i2 < i3;
    }
}
