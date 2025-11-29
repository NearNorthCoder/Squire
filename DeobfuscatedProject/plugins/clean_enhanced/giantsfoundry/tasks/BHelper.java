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

import gg.squire.giantsfoundry.tasks.GameEnum3;
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
        void var2;
        LinkedHashMap<e, Widget> linkedHashMap = new LinkedHashMap<e, Widget>();
        int var3 = var1[1];
        while (b.var4(var3, ((void)var2).length)) {
            void var5 = var2[var3];
            e var6 = e.BHelper(var5.getText());
            if (b.var7((Object)var6) && b.var8(var5.getTextColor(), var1[4])) {
                void var9;
                var9.put(var6, var5);
                0;
            }
            var3 += 17;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return linkedHashMap;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    static {
        b.var11();
        F = var1[5];
        H = var1[6];
        M = var1[4];
        L = var1[7];
        J = var1[8];
        K = var1[0];
        G = var1[9];
        I = var1[10];
    }

    private static boolean var8(int n2, int n3) {
        return n2 != n3;
    }

    private static void var11() {
        var1 = new int[11];
        b.var1[0] = -(0xFFFFFC23 & 0x57FE) & (0xFFFFDFEF & 0x76FF);
        b.var1[1] = 2;
        b.var1[2] = 1;
        b.var1[3] = (0x33 ^ 0x66) & ~(3 ^ 0x56);
        b.var1[4] = 0xFFFF9FDF & 0x9FFFBF;
        b.var1[5] = 0xFFFFFFF6 & 0x17DB;
        b.var1[6] = -(0xFFFFFDB9 & 0x6A67) & (0xFFFFFFED & Short.MAX_VALUE);
        b.var1[7] = -(0xFFFFBC97 & 0x776B) & (0xFFFFF7FF & 0xDFD0F);
        b.var1[8] = -(0xFFFFFABE & 0x2563) & (0xFFFFF7FD & 0x3FFF);
        b.var1[9] = -(0xFFFFFBF7 & 0x37ED) & (0xFFFFB7FF & 0x2CE7BED);
        b.var1[10] = -(0xFFFFBB29 & 0x6CD7) & (0xFFFFBFCF & Short.MAX_VALUE);
    }

    public boolean u() {
        int n2;
        Widget widget = Widgets.get((int)var1[0], (int)var1[1]);
        if (b.var7(widget) && b.var10(widget.isVisible() ? 1 : 0)) {
            n2 = var1[2];
            0;
            if ((0x29 ^ 0x2D) > (0x74 ^ 0x70)) {
                return ((0x5A ^ 0x13) & ~(0x4C ^ 5)) != 0;
            }
        } else {
            n2 = var1[3];
        }
        return n2 != 0;
    }

    @Inject
    public BHelper(Client client, ClientThread clientThread) {
        this.N = client;
        this.O = clientThread;
    }

    private static boolean var7(Object object) {
        return object != null;
    }
}

