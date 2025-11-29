/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.Client
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import gg.squire.client.plugins.fw.Task;
import gg.squire.farmer.SquireFarmerConfig;
import javax.inject.Inject;
import net.runelite.api.Client;

public abstract class az
extends Task {
    private static /* synthetic */ int[] lIlllIllIIlI;
    protected final /* synthetic */ SquireFarmerConfig bS;
    protected final /* synthetic */ Client bT;
    protected final /* synthetic */ f bR;

    private static boolean lllIllIIllIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public az(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        this.bR = f2;
        this.bS = squireFarmerConfig;
        this.bT = client;
    }

    private static void lllIllIIllIlIl() {
        lIlllIllIIlI = new int[2];
        az.lIlllIllIIlI[0] = 1;
        az.lIlllIllIIlI[1] = (0x36 ^ 0x67) & ~(0x65 ^ 0x34);
    }

    static {
        az.lllIllIIllIlIl();
    }

    public boolean sleeping() {
        boolean bl;
        if (!az.lllIllIIllIllI(this.bR.t() ? 1 : 0) || az.lllIllIIllIllI(super.sleeping() ? 1 : 0)) {
            bl = lIlllIllIIlI[0];
            0;
            if (-(0x30 ^ 0x34) > 0) {
                return false;
            }
        } else {
            bl = lIlllIllIIlI[1];
        }
        return bl;
    }
}

