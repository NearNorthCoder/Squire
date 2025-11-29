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
package gg.squire.scurrius.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Bank;
import gg.squire.scurrius.tasks.ScurriusTaskBase;

@TaskDesc(name="Withdrawing items", priority=2147482647, blocking=true)
public class WithdrawingItemsTask
extends ScurriusTaskBase {

    static {
        l.var3();
        l.var4();
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (l.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (((0xE4 ^ 0xB9) & ~(0xCA ^ 0x97)) == 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var1 = new String[var2[3]];
        l.var1[l.var2[0]] = "No bank loadout selected";
        l.var1[l.var2[2]] = "Banking failed 5 times in a row, stopping";
    }

    private static void var3() {
        var2 = new int[5];
        l.var2[0] = (69 + 187 - 223 + 220 ^ 76 + 122 - 112 + 75) & (3 + 181 - 144 + 195 ^ 160 + 17 - 23 + 29 ^ -1);
        l.var2[1] = 0xB2 ^ 0xB7;
        l.var2[2] = 1;
        l.var2[3] = 2;
        l.var2[4] = 0x14 ^ 0x1C;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean a() {
        l var22;
        if (l.var23(this.s() ? 1 : 0)) {
            return var2[0];
        }
        if (l.var24(var22.t())) {
            Log.error((String)var1[var2[0]]);
            return var2[0];
        }
        if (l.var23(var22.t().needsToBank() ? 1 : 0)) {
            var22.a.e(var2[0]);
            Bank.close();
            return var2[0];
        }
        if (l.var23(BankLoadouts.withdrawWithRetries((BankLoadout)var22.t(), (int)var2[1]).booleanValue() ? 1 : 0)) {
            Log.info((String)var1[var2[2]]);
            return var2[0];
        }
        this.sleep(var2[3]);
        return var2[2];
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    private static boolean var24(Object object) {
        return object == null;
    }
}

