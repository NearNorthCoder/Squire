/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.whisperer.SquireWhisperer;
import java.util.concurrent.CompletableFuture;
import javax.inject.Inject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Withdrawing items")
public class WithdrawingItemsTask
extends WhispererTaskBase {
    @Inject
    private  SquireWhisperer Q;
    
    private  int R;
    private  CompletableFuture<Boolean> S;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean p() {
        m var9;
        if ((this.n( == 0) ? 1 : 0)) {
            return 0;
        }
        BankLoadout var10 = var9.o();
        if var10 == null {
            Log.error((String)var2[0]);
            return 0;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = var10.needsToBank();
        Log.info((String)var2[1], (Object[])objectArray);
        if ((var10.needsToBank( == 0) ? 1 : 0)) {
            var9.f.a(0);
            return 0;
        }
        if ((BankLoadouts.withdrawWithRetries((BankLoadout == 0)var10, (int)2).booleanValue() ? 1 : 0)) {
            Log.info((String)var2[3]);
            var9.sleep(2);
            return 0;
        }
        return 0;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void var17() {
        var2 = new String[4];
        m.var2[0] = "No bank loadout selected";
        m.var2[1] = "Need to bank: {}";
        m.var2[3] = "Failed to withdraw loadout after 5 tries, pausing for 5 ticks";
    }

    public WithdrawingItemsTask() {
        this.S = null;
    }

}

