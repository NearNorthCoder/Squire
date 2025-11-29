package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.Y  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/Y.class */
public abstract class Y extends Task {
    protected static /* synthetic */ boolean cw;
    private static /* synthetic */ int[] lIlIlIllIIII;
    @Inject
    protected /* synthetic */ Client u;
    @Inject
    protected /* synthetic */ SquireChambersConfig k;
    @Inject
    protected /* synthetic */ SquireChambersPlugin v;
    protected /* synthetic */ WorldPoint cx = new WorldPoint(lIlIlIllIIII[0], lIlIlIllIIII[1], lIlIlIllIIII[2]);
    protected /* synthetic */ WorldPoint cy = new WorldPoint(lIlIlIllIIII[3], lIlIlIllIIII[4], lIlIlIllIIII[2]);

    private static boolean llIllllIIlllll(Object obj) {
        return obj == null;
    }

    private static boolean llIllllIIlllIl(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean cr() {
        if (llIllllIIlllll(Players.getLocal())) {
            return lIlIlIllIIII[2];
        }
        if (llIllllIIlllIl(this.u.isInInstancedRegion() ? 1 : 0) && llIllllIlIIIII(C0046u.bh(), EnumC0048w.WAITING_FOR_LEADER_TO_START)) {
            ?? r0 = lIlIlIllIIII[5];
            "".length();
            return (" ".length() & (" ".length() ^ (-" ".length()))) < (((192 ^ 135) ^ (166 ^ 192)) & (((((182 + 182) - 231) + 58) ^ (((97 + 70) - 33) + 24)) ^ (-" ".length()))) ? ((233 ^ 176) ^ (99 ^ 36)) & (((67 ^ 33) ^ (87 ^ 43)) ^ (-" ".length())) : r0;
        }
        return lIlIlIllIIII[2];
    }

    private static boolean llIllllIIllllI(int i) {
        return i == 0;
    }

    protected abstract boolean cg();

    private static boolean llIllllIlIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    public boolean run() {
        if (!llIllllIIlllIl(this.k.pause() ? 1 : 0) && !llIllllIIllllI(this.v.G() ? 1 : 0)) {
            return cg();
        }
        return lIlIlIllIIII[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        llIllllIIlllII();
        cw = lIlIlIllIIII[2];
    }

    private static void llIllllIIlllII() {
        lIlIlIllIIII = new int[6];
        lIlIlIllIIII[0] = (-((-582) & 6751)) & (-8193) & 15615;
        lIlIlIllIIII[1] = (-((-403) & 21403)) & (-1) & 24571;
        lIlIlIllIIII[2] = (62 ^ 22) & ((16 ^ 56) ^ (-1));
        lIlIlIllIIII[3] = (-30722) & 31967;
        lIlIlIllIIII[4] = (-((-6891) & 31487)) & (-4609) & 32766;
        lIlIlIllIIII[5] = " ".length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BankLoadout q() {
        return (BankLoadout) this.k.bankLoadout().selected(BankLoadout.class);
    }
}
