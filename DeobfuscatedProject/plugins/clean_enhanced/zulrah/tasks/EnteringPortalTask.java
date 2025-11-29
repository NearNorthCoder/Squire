/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.BankingTask;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Entering portal", priority=1000, blocking=true)
public class EnteringPortalTask
extends BankingTask {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean run() {
        void var1_1;
        F var3;
        if (!(this.aa.d( == 0) ? 1 : 0) || (this.ad( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        if var4 == null {
            return 0;
        }
        BankLoadout var5 = var3.ae();
        if ((var5.needsToBank( != 0) ? 1 : 0)) {
            return 0;
        }
        var1_1.interact(var1[0]);
        return 1;
    }

    @Inject
    protected EnteringPortalTask(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }

    @Override
    public boolean ac() {
        return 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

}

