/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.items.Bank
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Bank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.BankingTask;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Using Bank loadout", priority=999, blocking=true)
public class UsingBankLoadoutTask
extends BankingTask {

    private static final  Logger cY;

    private static void var3() {
        var1 = new int[4];
        E.var1[0] = (0x36 ^ 0x12) & ~(0x50 ^ 0x74);
        E.var1[1] = 1;
        E.var1[2] = 47 + 80 - 62 + 84 ^ 51 + 139 - 158 + 112;
        E.var1[3] = 2;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var1[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var1[0];
        while (E.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var13);
    }

    @Inject
    public UsingBankLoadoutTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void var21() {
        var2 = new String[var1[3]];
        E.var2[E.var1[0]] = "[BankLoadoutTask]: Failed to withdraw bank loadout after 5 retries.";
        E.var2[E.var1[1]] = "stamina potion";
    }

    private static boolean var22(int n2) {
        return n2 == 0;
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    static {
        E.var3();
        E.var21();
        cY = LoggerFactory.getLogger(UsingBankLoadoutTask.class);
    }

    @Override
    public boolean bY() {
        E var23;
        if (E.var24(this.cW.ae() ? 1 : 0)) {
            return var1[0];
        }
        if (E.var24(var23.cW.n() ? 1 : 0)) {
            return var1[0];
        }
        if (E.var22(Bank.isOpen() ? 1 : 0)) {
            return Bank.open();
        }
        Predicate<Item> var25 = item -> {
            int n2;
            if (E.var24(item.getName().toLowerCase().contains(var2[var1[1]]) ? 1 : 0) && E.var22(item.isPlaceholder() ? 1 : 0)) {
                n2 = var1[1];
                0;
                if ((0x54 ^ 0x50) == 0) {
                    return ((0x52 ^ 0x56) & ~(0x9E ^ 0x9A)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        };
        if (E.var24(var23.cb() ? 1 : 0) && E.var24(Bank.contains(var25) ? 1 : 0)) {
            return var23.a(var25, var1[1]);
        }
        if (E.var22(var23.ce().needsToBank() ? 1 : 0)) {
            Bank.close();
            return var1[1];
        }
        if (E.var22(BankLoadouts.withdrawWithRetries((BankLoadout)var23.ce(), (int)var1[2]).booleanValue() ? 1 : 0)) {
            Log.info((String)var2[var1[0]]);
            return var1[0];
        }
        this.sleep(var1[3]);
        return var1[1];
    }

    private static boolean var24(int n2) {
        return n2 != 0;
    }
}

