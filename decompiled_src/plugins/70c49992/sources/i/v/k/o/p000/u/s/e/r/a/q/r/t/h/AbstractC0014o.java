package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
@TaskDesc(name = "Banking", priority = 80, blocking = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/o.class */
public abstract class AbstractC0014o extends Task {
    protected final /* synthetic */ SquireVorkathPlugin bU;
    @Inject
    protected /* synthetic */ C0006g bV;
    private static /* synthetic */ int[] lIlIllIIIIlll;
    protected final /* synthetic */ SquireVorkathConfig bS;
    protected final /* synthetic */ Client bT;

    private static void llIIIIIIIIllIlI() {
        lIlIllIIIIlll = new int[4];
        lIlIllIIIIlll[0] = ((((30 + 118) - 19) + 52) ^ (((154 + 144) - 187) + 64)) & (((156 ^ 170) ^ (120 ^ 84)) ^ (-" ".length()));
        lIlIllIIIIlll[1] = (-449) & 9199;
        lIlIllIIIIlll[2] = " ".length();
        lIlIllIIIIlll[3] = -" ".length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0014o(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        this.bU = squireVorkathPlugin;
        this.bS = squireVorkathConfig;
        this.bT = client;
    }

    public abstract boolean Q();

    private static boolean llIIIIIIIIlllII(int i2) {
        return i2 == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BankLoadout T() {
        return (BankLoadout) this.bS.bankLoadout().selected(BankLoadout.class);
    }

    public int U() {
        return lIlIllIIIIlll[3];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean R() {
        return this.bS.bankLocation().j().stream().anyMatch(num -> {
            return this.bV.d(num.intValue());
        });
    }

    static {
        llIIIIIIIIllIlI();
    }

    private static boolean llIIIIIIIIllllI(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    public boolean run() {
        if (llIIIIIIIIllIll(R() ? 1 : 0)) {
            this.bU.a(T().needsToBank());
        }
        return llIIIIIIIIlllII(this.bU.c() ? 1 : 0) ? lIlIllIIIIlll[0] : Q();
    }

    private static boolean llIIIIIIIIllIll(int i2) {
        return i2 != 0;
    }

    private static boolean llIIIIIIIIlllIl(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean S() {
        if (llIIIIIIIIlllII(this.bT.isInInstancedRegion() ? 1 : 0)) {
            return lIlIllIIIIlll[0];
        }
        int[] mapRegions = this.bT.getMapRegions();
        int length = mapRegions.length;
        int i2 = lIlIllIIIIlll[0];
        while (llIIIIIIIIlllIl(i2, length)) {
            if (llIIIIIIIIllllI(mapRegions[i2], lIlIllIIIIlll[1])) {
                return lIlIllIIIIlll[2];
            }
            i2++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIllIIIIlll[0];
    }
}
