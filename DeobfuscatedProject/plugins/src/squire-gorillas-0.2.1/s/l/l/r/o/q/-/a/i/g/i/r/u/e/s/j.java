/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.gorillas.SquireGorillaConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

public abstract class j
extends Task {
    protected final /* synthetic */ SquireGorillaConfig T;
    private static /* synthetic */ int[] llIIllIIIIlI;
    protected final /* synthetic */ Client U;
    protected final /* synthetic */ int S = 9782;
    public static final /* synthetic */ WorldPoint R;

    private static boolean lllllIlllllIIl(Object object) {
        return object == null;
    }

    private static void lllllIlllllIII() {
        llIIllIIIIlI = new int[5];
        j.llIIllIIIIlI[0] = 0xFFFFAE3F & 0x77F6;
        j.llIIllIIIIlI[1] = (0x17 ^ 0x52) & ~(0x3A ^ 0x7F);
        j.llIIllIIIIlI[2] = 0xFFFF99B9 & 0x6FD7;
        j.llIIllIIIIlI[3] = 0xFFFFEF9B & 0x1DFE;
        j.llIIllIIIIlI[4] = " ".length();
    }

    protected boolean J() {
        BankLoadout bankLoadout = (BankLoadout)this.T.bankLoadout().selected(BankLoadout.class);
        if (j.lllllIlllllIIl(bankLoadout)) {
            return llIIllIIIIlI[1];
        }
        return bankLoadout.needsToBank();
    }

    static {
        j.lllllIlllllIII();
        R = new WorldPoint(llIIllIIIIlI[2], llIIllIIIIlI[3], llIIllIIIIlI[4]);
    }

    @Inject
    public j(SquireGorillaConfig squireGorillaConfig, Client client) {
        this.S = llIIllIIIIlI[0];
        this.T = squireGorillaConfig;
        this.U = client;
    }
}

