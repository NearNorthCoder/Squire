/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Attack Boss", priority=4000, blocking=true)
public class AttackBossTask
extends VardorvisTaskBase {
    private  List<Widget> ap;
    
    private static  int ao;

    private static boolean var3(Object object) {
        return object != null;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean l() {
        int var10;
        int n2;
        u var11;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var12(this.z)) {
            return var1[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var12(var11.x.getWorldLocation().equals((Object)p) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var12(var11.x.getWorldLocation().equals((Object)q) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var12(var11.x.getWorldLocation().equals((Object)r) ? 1 : 0)) {
            return var1[0];
        }
        Actor var13 = Players.getLocal().getInteracting();
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var3(var13) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var14(var13.hasAction(var2[var1[0]]::equals) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (1 <= ((0x82 ^ 0xB1) & ~(0x68 ^ 0x5B))) {
                return ((0xB0 ^ 0x8F) & ~(0xB2 ^ 0x8D)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var14(var10 = n2)) {
            return var1[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var14(var11.y.getWorldArea().getMeleeTiles(var11.w).contains(var11.x.getWorldLocation()) ? 1 : 0)) {
            var11.y.interact(var2[var1[1]]);
            return var1[1];
        }
        return var1[0];
    }

    private static void var15() {
        var1 = new int[5];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var1[0] = (0xCB ^ 0x93) & ~(0x34 ^ 0x6C);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var1[1] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var1[2] = -(0xFFFFEF0D & 0x53F3) & (0xFFFFCFDB & 0x341732F);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var1[3] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var1[4] = 0xA5 ^ 0xAD;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var1[0];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var1[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var25(var24, var23)) {
            char var26 = var22[var24];
            var19.append((char)(var26 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    @Inject
    protected AttackBossTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
        this.ap = new ArrayList<Widget>();
    }

    private static void var27() {
        var2 = new String[var1[3]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var1[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Attack";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.var1[1]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Attack";
    }

    private static boolean var25(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }
}

