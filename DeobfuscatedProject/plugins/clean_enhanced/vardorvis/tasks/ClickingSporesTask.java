/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Clicking Spores", priority=6000, blocking=true)
public class ClickingSporesTask
extends VardorvisTaskBase {
    private static  int ao;

    private  List<Widget> ap;

    @Inject
    protected ClickingSporesTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
        this.ap = new ArrayList<Widget>();
    }

    private static void var3() {
        var2 = new int[6];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var2[0] = (0xC2 ^ 0x9C) & ~(0x7F ^ 0x21);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var2[1] = 5 ^ 3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var2[2] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var2[3] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var2[4] = 0xFFFFCDBF & 0x341324B;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var2[5] = 3 ^ 0x47 ^ (0x43 ^ 0xF);
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var6;
        Widget var7;
        v var8;
        int n2 = var2[0];
        this.ap.clear();
        int var9 = var2[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var10(var9, var2[1])) {
            var7 = var8.w.getWidget(ao - var9);
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var4(var7)) {
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var5(var7.isVisible() ? 1 : 0)) {
                    0;
                    if null != null {
                        return ((0x6E ^ 0x6A ^ (0x56 ^ 0x78)) & (9 ^ 7 ^ (0x7E ^ 0x5A) ^ -1)) != 0;
                    }
                } else {
                    ++var6;
                    var8.ap.add(var7);
                    0;
                }
            }
            ++var9;
            0;
            if (1 != -1) continue;
            return ((5 ^ 0x5E ^ 2) & (0x17 ^ 0x1F ^ (0xC1 ^ 0x90) ^ -1)) != 0;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var5((int)var6)) {
            return var2[0];
        }
        Collections.shuffle(var8.ap);
        var9 = var2[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var10(var9, var2[2])) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var5(var8.ap.size())) {
                return var2[0];
            }
            var7 = var8.ap.get(var2[0]);
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var4(var7)) {
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var5(var7.isVisible() ? 1 : 0)) {
                    0;
                    if (3 <= -1) {
                        return ((0x96 ^ 0xB1 ^ (0x96 ^ 0x92)) & (0xA3 ^ 0xBB ^ (0xF9 ^ 0xC2) ^ -1)) != 0;
                    }
                } else {
                    var7.interact(var1[var2[0]]);
                    var8.ap.remove(var2[0]);
                    0;
                }
            }
            ++var9;
            0;
            if null == null continue;
            return ((0xBD ^ 0xA6) & ~(0x74 ^ 0x6F)) != 0;
        }
        return var2[3];
    }

    private static void var11() {
        var1 = new String[var2[3]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var1[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v.var2[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Destroy";
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }
}

