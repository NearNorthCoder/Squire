/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

public abstract class n
extends Task {
    @Inject
    protected /* synthetic */ SquireDukeSucellusConfig ae;
    private static /* synthetic */ int[] lIllIlIIlIII;
    @Inject
    protected /* synthetic */ Client x;
    @Inject
    protected /* synthetic */ SquireDukeSucellus w;

    public boolean g(int n2) {
        boolean bl;
        if (n.lllIIlllIIIIII(this.G(), n2)) {
            bl = lIllIlIIlIII[1];
            0;
            
            }
        } else {
            bl = lIllIlIIlIII[0];
        }
        return bl;
    }

    protected BankLoadout Q() {
        return (BankLoadout)this.ae.bankLoadout().selected(BankLoadout.class);
    }

    static {
        n.lllIIllIlllllI();
    }

    private static boolean lllIIlllIIIIIl(int n2) {
        return n2 != 0;
    }

    private static void lllIIllIlllllI() {
        lIllIlIIlIII = new int[2];
        n.lIllIlIIlIII[0] = (0x24 ^ 0x39 ^ (0x18 ^ 0xE)) & (0x19 ^ 5 ^ (0x55 ^ 0x42) ^ -1);
        n.lIllIlIIlIII[1] = 1;
    }

    public int G() {
        WorldPoint worldPoint = this.x.getLocalPlayer().getWorldLocation();
        LocalPoint localPoint = this.x.getLocalPlayer().getLocalLocation();
        if (n.lllIIlllIIIIIl(this.x.isInInstancedRegion() ? 1 : 0)) {
            return WorldPoint.fromLocalInstance((Client)this.x, (LocalPoint)localPoint).getRegionID();
        }
        return worldPoint.getRegionID();
    }

    private static boolean lllIIlllIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    protected abstract boolean R();

    private static boolean lllIIllIllllll(int n2) {
        return n2 == 0;
    }

    protected boolean P() {
        return this.g(this.ae.bank().G());
    }

    public boolean run() {
        if (n.lllIIllIllllll(this.w.p() ? 1 : 0)) {
            return lIllIlIIlIII[0];
        }
        return this.R();
    }
}

