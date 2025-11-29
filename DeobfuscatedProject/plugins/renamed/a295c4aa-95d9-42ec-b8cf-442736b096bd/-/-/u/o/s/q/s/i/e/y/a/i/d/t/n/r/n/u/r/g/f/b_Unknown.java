/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.callback.ClientThread
 *  net.unethicalite.api.widgets.Widgets
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.EEnum;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.runelite.client.callback.ClientThread;
import net.unethicalite.api.widgets.Widgets;

public class b_Unknown {
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

    /*
     * WARNING - void declaration
     */
    private Map<e, Widget> a(Widget[] widgetArray) {
        void var3;
        LinkedHashMap<e, Widget> linkedHashMap = new LinkedHashMap<e, Widget>();
        int var2 = llIlIllllIlI[1];
        while (b.lIIIIlIIIIIlllI(var2, ((void)var3).length)) {
            void var1 = var3[var2];
            e var5 = e.b(var1.getText());
            if (b.lIIIIlIIIIIllII((Object)var5) && b.lIIIIlIIIIIllll(var1.getTextColor(), llIlIllllIlI[4])) {
                void var4;
                var4.put(var5, var1);
                0;
            }
            var2 += 17;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return linkedHashMap;
    }

    private static boolean lIIIIlIIIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIlIIIIIllIl(int n2) {
        return n2 != 0;
    }

    static {
        b.lIIIIlIIIIIlIll();
        F = llIlIllllIlI[5];
        H = llIlIllllIlI[6];
        M = llIlIllllIlI[4];
        L = llIlIllllIlI[7];
        J = llIlIllllIlI[8];
        K = llIlIllllIlI[0];
        G = llIlIllllIlI[9];
        I = llIlIllllIlI[10];
    }

    private static boolean lIIIIlIIIIIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIIIlIIIIIlIll() {
        llIlIllllIlI = new int[11];
        b.llIlIllllIlI[0] = -(0xFFFFFC23 & 0x57FE) & (0xFFFFDFEF & 0x76FF);
        b.llIlIllllIlI[1] = 2;
        b.llIlIllllIlI[2] = 1;
        b.llIlIllllIlI[3] = (0x33 ^ 0x66) & ~(3 ^ 0x56);
        b.llIlIllllIlI[4] = 0xFFFF9FDF & 0x9FFFBF;
        b.llIlIllllIlI[5] = 0xFFFFFFF6 & 0x17DB;
        b.llIlIllllIlI[6] = -(0xFFFFFDB9 & 0x6A67) & (0xFFFFFFED & Short.MAX_VALUE);
        b.llIlIllllIlI[7] = -(0xFFFFBC97 & 0x776B) & (0xFFFFF7FF & 0xDFD0F);
        b.llIlIllllIlI[8] = -(0xFFFFFABE & 0x2563) & (0xFFFFF7FD & 0x3FFF);
        b.llIlIllllIlI[9] = -(0xFFFFFBF7 & 0x37ED) & (0xFFFFB7FF & 0x2CE7BED);
        b.llIlIllllIlI[10] = -(0xFFFFBB29 & 0x6CD7) & (0xFFFFBFCF & Short.MAX_VALUE);
    }

    public boolean u() {
        int n2;
        Widget widget = Widgets.get((int)llIlIllllIlI[0], (int)llIlIllllIlI[1]);
        if (b.lIIIIlIIIIIllII(widget) && b.lIIIIlIIIIIllIl(widget.isVisible() ? 1 : 0)) {
            n2 = llIlIllllIlI[2];
            0;
            if ((0x29 ^ 0x2D) > (0x74 ^ 0x70)) {
                return false;
            }
        } else {
            n2 = llIlIllllIlI[3];
        }
        return n2 != 0;
    }

    @Inject
    public b(Client client, ClientThread clientThread) {
        this.N = client;
        this.O = clientThread;
    }

    private static boolean lIIIIlIIIIIllII(Object object) {
        return object != null;
    }
}

