/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Eating food", priority=10000)
public class EatingFoodTask
extends VardorvisTaskBase {

    private static void var3() {
        var1 = new int[6];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[0] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[1] = (0xAC ^ 0xBF) & ~(0x7C ^ 0x6F);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[2] = 3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[3] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[4] = 0x8A ^ 0xA9 ^ (0x69 ^ 0x4E);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[5] = 0x6E ^ 0x27 ^ (0x22 ^ 0x63);
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var2 = new String[var1[4]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[1]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."No food";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Eat";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Eat";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[2]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Eat";
    }

    @Inject
    protected EatingFoodTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean var19(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var1_2;
        z var20;
        int n2;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var19(this.t.earlyBank() ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var21(n2 = Inventory.getCount(item -> {
            String[] stringArray = new String[var1[0]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[1]] = var2[var1[2]];
            return item.hasAction(stringArray);
        }), var1[0])) {
            this.s.c(var1[0]);
            return var1[1];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var12(Combat.getCurrentHealth(), var20.t.eatAt())) {
            return var1[1];
        }
        Item var22 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var1[0]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var1[1]] = var2[var1[3]];
            return item.hasAction(stringArray);
        });
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var23(var22)) {
            Log.error((String)var2[var1[1]]);
            var20.s.c(var1[0]);
            return var1[1];
        }
        var1_2.interact(var2[var1[0]]);
        this.sleep(var1[2]);
        return var1[0];
    }

    private static boolean var21(int n2, int n3) {
        return n2 <= n3;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var1[1];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var1[1];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.var5(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (((0xA6 ^ 0xB8 ^ (0x14 ^ 0x3D)) & (47 + 58 - 89 + 171 ^ 109 + 127 - 191 + 95 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    private static boolean var23(Object object) {
        return object == null;
    }
}

