/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Start Fight", priority=10000, blocking=true)
public class StartFightTask
extends VardorvisTaskBase {

    @Override
    public boolean l() {
        p var3;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var4(this.z)) {
            return var1[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var5(var3.x.getInteracting()) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var4(var3.x.getInteracting().getName().equals(var2[var1[0]]) ? 1 : 0)) {
            return var1[1];
        }
        int var6 = Inventory.getCount(item -> {
            String[] stringArray = new String[var1[1]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var1[0]] = var2[var1[2]];
            return item.hasAction(stringArray);
        });
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var7(var6, var3.t.food())) {
            var3.s.c(var1[1]);
            return var1[0];
        }
        this.y.interact(var2[var1[1]]);
        return var1[1];
    }

    private static void var8() {
        var1 = new int[4];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var1[0] = (0x2E ^ 0x32) & ~(6 ^ 0x1A);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var1[1] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var1[2] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var1[3] = 3;
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var1[0];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var1[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var7(var17, var16)) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static void var19() {
        var2 = new String[var1[3]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var1[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Vardorvis";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var1[1]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Attack";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p.var1[2]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Eat";
    }

    @Inject
    protected StartFightTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(Object object) {
        return object != null;
    }
}

