package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.runelite.client.callback.ClientThread;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.b  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/b.class */
public class b {
    public static final /* synthetic */ int G;
    private static final /* synthetic */ int M;
    public static final /* synthetic */ int F;
    private final /* synthetic */ Client N;
    public static final /* synthetic */ int L;
    private static /* synthetic */ int[] llIlIllllIlI;
    public static final /* synthetic */ int K;
    public static final /* synthetic */ int I;
    private final /* synthetic */ ClientThread O;
    public static final /* synthetic */ int H;
    public static final /* synthetic */ int J;

    private Map<e, Widget> a(Widget[] widgetArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int lllllllllllllllIlIIIIIlIIIIlIlll = llIlIllllIlI[1];
        while (lIIIIlIIIIIlllI(lllllllllllllllIlIIIIIlIIIIlIlll, widgetArr.length)) {
            Widget widget = widgetArr[lllllllllllllllIlIIIIIlIIIIlIlll];
            e b = e.b(widget.getText());
            if (lIIIIlIIIIIllII(b) && lIIIIlIIIIIllll(widget.getTextColor(), llIlIllllIlI[4])) {
                linkedHashMap.put(b, widget);
                "".length();
            }
            lllllllllllllllIlIIIIIlIIIIlIlll += 17;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        return linkedHashMap;
    }

    private static boolean lIIIIlIIIIIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIlIIIIIllIl(int i) {
        return i != 0;
    }

    static {
        lIIIIlIIIIIlIll();
        F = llIlIllllIlI[5];
        H = llIlIllllIlI[6];
        M = llIlIllllIlI[4];
        L = llIlIllllIlI[7];
        J = llIlIllllIlI[8];
        K = llIlIllllIlI[0];
        G = llIlIllllIlI[9];
        I = llIlIllllIlI[10];
    }

    private static boolean lIIIIlIIIIIllll(int i, int i2) {
        return i != i2;
    }

    private static void lIIIIlIIIIIlIll() {
        llIlIllllIlI = new int[11];
        llIlIllllIlI[0] = (-((-989) & 22526)) & (-8209) & 30463;
        llIlIllllIlI[1] = "  ".length();
        llIlIllllIlI[2] = " ".length();
        llIlIllllIlI[3] = (51 ^ 102) & ((3 ^ 86) ^ (-1));
        llIlIllllIlI[4] = (-24609) & 10485695;
        llIlIllllIlI[5] = (-10) & 6107;
        llIlIllllIlI[6] = (-((-583) & 27239)) & (-19) & 32767;
        llIlIllllIlI[7] = (-((-17257) & 30571)) & (-2049) & 916751;
        llIlIllllIlI[8] = (-((-1346) & 9571)) & (-2051) & 16383;
        llIlIllllIlI[9] = (-((-1033) & 14317)) & (-18433) & 47086573;
        llIlIllllIlI[10] = (-((-17623) & 27863)) & (-16433) & 32767;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean u() {
        Widget widget = Widgets.get(llIlIllllIlI[0], llIlIllllIlI[1]);
        if (lIIIIlIIIIIllII(widget) && lIIIIlIIIIIllIl(widget.isVisible() ? 1 : 0)) {
            ?? r0 = llIlIllllIlI[2];
            "".length();
            return (41 ^ 45) > (116 ^ 112) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIllllIlI[3];
    }

    @Inject
    public b(Client client, ClientThread clientThread) {
        this.N = client;
        this.O = clientThread;
    }

    private static boolean lIIIIlIIIIIllII(Object obj) {
        return obj != null;
    }
}
