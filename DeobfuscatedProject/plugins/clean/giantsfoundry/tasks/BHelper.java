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
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GameEnum12;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.runelite.client.callback.ClientThread;
import net.unethicalite.api.widgets.Widgets;

public class BHelper {
    public static final  int G;
    private static final  int M;
    public static final  int F;
    private final  Client N;
    public static final  int L;
    
    public static final  int K;
    public static final  int I;
    private final  ClientThread O;
    public static final  int H;
    public static final  int J;

    /*
     * WARNING - void declaration
     */
    private Map<e, Widget> a(Widget[] widgetArray) {
        void var1;
        LinkedHashMap<e, Widget> linkedHashMap = new LinkedHashMap<e, Widget>();
        int var2 = llIlIllllIlI[1];
        while (b.lIIIIlIIIIIlllI(var2, ((void)var1).length)) {
            void var3 = var1[var2];
            e var4 = e.BHelper(var3.getText());
            if (b.lIIIIlIIIIIllII((Object)var4) && b.lIIIIlIIIIIllll(var3.getTextColor(), llIlIllllIlI[4])) {
                void var5;
                var5.put(var4, var3);

            }
            var2 += 17;

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

    public boolean u() {
        int n2;
        Widget widget = Widgets.get((int)llIlIllllIlI[0], (int)llIlIllllIlI[1]);
        if (b.lIIIIlIIIIIllII(widget) && b.lIIIIlIIIIIllIl(widget.isVisible() ? 1 : 0)) {
            n2 = llIlIllllIlI[2];

            if ((0x29 ^ 0x2D) > (0x74 ^ 0x70)) {
                return false;
            }
        } else {
            n2 = llIlIllllIlI[3];
        }
        return n2 != 0;
    }

    @Inject
    public BHelper(Client client, ClientThread clientThread) {
        this.N = client;
        this.O = clientThread;
    }

    private static boolean lIIIIlIIIIIllII(Object object) {
        return object != null;
    }
}

