package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.gorillas.SquireGorillaConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.j  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/j.class */
public abstract class j extends Task {
    protected final /* synthetic */ SquireGorillaConfig T;
    private static /* synthetic */ int[] llIIllIIIIlI;
    protected final /* synthetic */ Client U;
    protected final /* synthetic */ int S = llIIllIIIIlI[0];
    public static final /* synthetic */ WorldPoint R;

    private static boolean lllllIlllllIIl(Object obj) {
        return obj == null;
    }

    private static void lllllIlllllIII() {
        llIIllIIIIlI = new int[5];
        llIIllIIIIlI[0] = (-20929) & 30710;
        llIIllIIIIlI[1] = (23 ^ 82) & ((58 ^ 127) ^ (-1));
        llIIllIIIIlI[2] = (-26183) & 28631;
        llIIllIIIIlI[3] = (-4197) & 7678;
        llIIllIIIIlI[4] = " ".length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    public boolean J() {
        BankLoadout bankLoadout = (BankLoadout) this.T.bankLoadout().selected(BankLoadout.class);
        return lllllIlllllIIl(bankLoadout) ? llIIllIIIIlI[1] : bankLoadout.needsToBank();
    }

    static {
        lllllIlllllIII();
        R = new WorldPoint(llIIllIIIIlI[2], llIIllIIIIlI[3], llIIllIIIIlI[4]);
    }

    @Inject
    public j(SquireGorillaConfig squireGorillaConfig, Client client) {
        this.T = squireGorillaConfig;
        this.U = client;
    }
}
