/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.BankingTask;
import a.u.i.-.l.r.h.z.s.r.u.q.e.PluginState;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;

/* TASK: Walking to bank -> WalkToBankTask */
@TaskDesc(name="Walking to bank")
public class WalkingToBankTask
extends BankingTask {
    private static final /* synthetic */ int ac;
    private final /* synthetic */ SquireZulrah ad;
    private static /* synthetic */ int[] lIllIlIIIIllI;

    private boolean ag() {
        G var5;
        if (G.llIIIlllIlIlIlI(this.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlIIIIllI[0];
        }
        int[] var6 = var5.Z.getMapRegions();
        int var1 = var6.length;
        int var3 = lIllIlIIIIllI[0];
        while (G.llIIIlllIlIllIl(var3, var1)) {
            int var2 = var6[var3];
            if (!G.llIIIlllIlIlllI(var2, lIllIlIIIIllI[1]) || G.llIIIlllIlIllll(var2, lIllIlIIIIllI[2])) {
                return lIllIlIIIIllI[3];
            }
            ++var3;
            0;
            
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
        G var4;
        if (!G.llIIIlllIlIlIlI(this.ag() ? 1 : 0) || G.llIIIlllIlIlIll((Object)this.ad.a(), (Object)c.DONE)) {
            return lIllIlIIIIllI[0];
        }
        if (G.llIIIlllIlIlIlI(var4.ad.d() ? 1 : 0)) {
            return lIllIlIIIIllI[0];
        }
        if (G.llIIIlllIlIllII(var4.ad() ? 1 : 0)) {
            return lIllIlIIIIllI[0];
        }
        return this.X.bankLocation().f().getAsBoolean();
    }

    @Inject
    protected G(SquireZulrahConfig squireZulrahConfig, Client client, t t2, SquireZulrah squireZulrah) {
        super(squireZulrah, squireZulrahConfig, client, t2);
        this.ad = squireZulrah;
    }

    private static boolean llIIIlllIlIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static void llIIIlllIlIlIIl() {
        lIllIlIIIIllI = new int[5];
        G.lIllIlIIIIllI[0] = (0xC ^ 0x3D ^ (0x5B ^ 0x57)) & (0x36 ^ 0x55 ^ (0x30 ^ 0x6E) ^ -1);
        G.lIllIlIIIIllI[1] = 0xFFFFA737 & 0x7BF8;
        G.lIllIlIIIIllI[2] = 0xFFFFEB7F & 0x37AF;
        G.lIllIlIIIIllI[3] = 1;
        G.lIllIlIIIIllI[4] = 0xFFFFBBEF & 0x663F;
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

