/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.BankingTask;
import gg.squire.zulrah.tasks.GameEnum9;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

@TaskDesc(name="Walking to bank")
public class WalkingToBankTask
extends BankingTask {
    private static final  int ac;
    private final  SquireZulrah ad;

    private boolean ag() {
        G var2;
        if ((this.Z.isInInstancedRegion( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] var3 = var2.Z.getMapRegions();
        int var4 = var3.length;
        int var5 = 0;
        while (var5 < var4) {
            int var6 = var3[var5];
            if (!(var6 != 1) || (var6 == 2)) {
                return 3;
            }
            ++var5;
            0;
            if null == null continue;
            return ((99 + 182 - 158 + 64 ^ 119 + 80 - 141 + 111) & (14 + 64 - -22 + 52 ^ 99 + 11 - 40 + 68 ^ -1)) != 0;
        }
        return 0;
    }

    static {
        G.var7();
        ac = 4;
    }

    @Override
    public boolean ac() {
        return 0;
    }

    @Override
    public boolean run() {
        G var8;
        if (!(this.ag( == 0) ? 1 : 0) || ((Object)this.ad.a() != (Object)this.ad.a()2)c.DONE)) {
            return 0;
        }
        if ((var8.ad.d( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var8.ad( != 0) ? 1 : 0)) {
            return 0;
        }
        return this.X.bankLocation().f().getAsBoolean();
    }

    @Inject
    protected WalkingToBankTask(SquireZulrahConfig squireZulrahConfig, Client client, t t2, SquireZulrah squireZulrah) {
        super(squireZulrah, squireZulrahConfig, client, t2);
        this.ad = squireZulrah;
    }

}

