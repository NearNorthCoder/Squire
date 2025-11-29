/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;

@TaskDesc(name="Banking to go back in", priority=10, blocking=true)
public class BankingToGoBackInTask
extends ck {

    private static void var3() {
        var1 = new int[7];
        ce.var1[0] = (0x1E ^ 0x21 ^ (0x4D ^ 0x40)) & (0xCD ^ 0xBC ^ (0x61 ^ 0x22) ^ -1);
        ce.var1[1] = 1;
        ce.var1[2] = 2;
        ce.var1[3] = 3;
        ce.var1[4] = 0x86 ^ 0x94 ^ (0x75 ^ 0x62);
        ce.var1[5] = 0x3B ^ 0x3F;
        ce.var1[6] = 0x6B ^ 0x63;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var11;
        BankLoadout bankLoadout = (BankLoadout)this.hY.loadout().selected(BankLoadout.class);
        if (ce.var12(bankLoadout.needsToBank() ? 1 : 0)) {
            Log.info((String)var2[var1[0]]);
            return var1[0];
        }
        if (ce.var13(Bank.isPinWindowOpen() ? 1 : 0)) {
            Log.info((String)var2[var1[1]]);
            return var1[0];
        }
        if (ce.var12(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[var1[1]];
            stringArray[ce.var1[0]] = var2[var1[2]];
            TileObject var14 = TileObjects.getNearest((String[])stringArray);
            if (ce.var10(var14)) {
                return var1[0];
            }
            var14.interact(var2[var1[3]]);
            return var1[1];
        }
        if (ce.var12(BankLoadouts.withdrawWithRetries((BankLoadout)var11, (int)var1[4]).booleanValue() ? 1 : 0)) {
            Log.info((String)var2[var1[5]]);
            return var1[0];
        }
        return var1[1];
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var1[0];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var1[0];
        while (ce.var24(var23, var22)) {
            char var25 = var21[var23];
            var18.append((char)(var25 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (((3 + 72 - -6 + 120 ^ 125 + 98 - 172 + 83) & (0x89 ^ 0x8D ^ (0x13 ^ 0x58) ^ -1)) >= 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static void var26() {
        var2 = new String[var1[4]];
        ce.var2[ce.var1[0]] = "[BankForItems] We don't need to bank";
        ce.var2[ce.var1[1]] = "[BankForItems] Pin window is open... waiting";
        ce.var2[ce.var1[2]] = "Bank Camel";
        ce.var2[ce.var1[3]] = "Bank";
        ce.var2[ce.var1[5]] = "[BankForItems] After 5 tries, still not equipping the right stuff";
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    static {
        ce.var3();
        ce.var26();
    }

    @Inject
    protected BankingToGoBackInTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }
}

