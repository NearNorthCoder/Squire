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
import gg.squire.zulrah.tasks.GameEnum40;
import gg.squire.zulrah.tasks.THelper;
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
        G var1;
        if (G.llIIIlllIlIlIlI(this.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlIIIIllI[0];
        }
        int[] var2 = var1.Z.getMapRegions();
        int var3 = var2.length;
        int var4 = lIllIlIIIIllI[0];
        while (G.llIIIlllIlIllIl(var4, var3)) {
            int var5 = var2[var4];
            if (!G.llIIIlllIlIlllI(var5, lIllIlIIIIllI[1]) || G.llIIIlllIlIllll(var5, lIllIlIIIIllI[2])) {
                return lIllIlIIIIllI[3];
            }
            ++var4;

            return false;
        }
        return lIllIlIIIIllI[0];
    }

    private static boolean llIIIlllIlIllII(int n2) {
        return n2 != 0;
    }

    static {
        G.llIIIlllIlIlIIl();
        ac = lIllIlIIIIllI[4];
    }

    @Override
    public boolean ac() {
        return lIllIlIIIIllI[0];
    }

    @Override
    public boolean run() {
        G var6;
        if (!G.llIIIlllIlIlIlI(this.ag() ? 1 : 0) || G.llIIIlllIlIlIll((Object)this.ad.a(), (Object)c.DONE)) {
            return lIllIlIIIIllI[0];
        }
        if (G.llIIIlllIlIlIlI(var6.ad.d() ? 1 : 0)) {
            return lIllIlIIIIllI[0];
        }
        if (G.llIIIlllIlIllII(var6.ad() ? 1 : 0)) {
            return lIllIlIIIIllI[0];
        }
        return this.X.bankLocation().f().getAsBoolean();
    }

    @Inject
    protected WalkingToBankTask(SquireZulrahConfig squireZulrahConfig, Client client, t t2, SquireZulrah squireZulrah) {
        super(squireZulrah, squireZulrahConfig, client, t2);
        this.ad = squireZulrah;
    }

    private static boolean llIIIlllIlIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIIIlllIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlllIlIlllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIlllIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlllIlIllIl(int n2, int n3) {
        return n2 < n3;
    }
}

