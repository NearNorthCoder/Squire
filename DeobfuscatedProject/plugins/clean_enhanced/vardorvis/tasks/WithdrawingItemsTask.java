/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Bank;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;

@TaskDesc(name="Withdrawing items", priority=2147482647, blocking=true)
public class WithdrawingItemsTask
extends VardorvisTaskBase {

    private static void var3() {
        var2 = new String[var1[4]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var1[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."No bank loadout selected";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var1[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Banking failed 5 times in a row, stopping";
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    @Override
    public boolean l() {
        t var6;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var4(this.P() ? 1 : 0)) {
            return var1[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var5(var6.Q())) {
            Log.error((String)var2[var1[0]]);
            return var1[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var4(var6.Q().needsToBank() ? 1 : 0)) {
            var6.s.c(var1[0]);
            Bank.close();
            var6.sleep(var1[1]);
            return var1[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var4(BankLoadouts.withdrawWithRetries((BankLoadout)var6.Q(), (int)var1[2]).booleanValue() ? 1 : 0)) {
            Log.info((String)var2[var1[3]]);
            return var1[0];
        }
        this.sleep(var1[4]);
        return var1[3];
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var1[0];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var1[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var13(var22, var21)) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static void var24() {
        var1 = new int[6];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var1[0] = (0xB6 ^ 0x8B) & ~(0x94 ^ 0xA9);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var1[1] = 3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var1[2] = 0xC2 ^ 0xC7;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var1[3] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var1[4] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t.var1[5] = 1 + 86 - 46 + 162 ^ 190 + 122 - 185 + 68;
    }
}

