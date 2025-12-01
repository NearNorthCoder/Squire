package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import net.runelite.api.Client;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ck.class */
public abstract class ck extends Z {
    protected static final /* synthetic */ int hT;
    protected final /* synthetic */ TOAConfig hY;
    protected static final /* synthetic */ int hU;
    protected static final /* synthetic */ int hV;
    private static /* synthetic */ int[] llIIIlIIllI;
    protected static final /* synthetic */ int hW;
    private static final /* synthetic */ int hX;

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public ck(Client client, TOAConfig tOAConfig) {
        super(client);
        this.hY = tOAConfig;
    }

    private static void lIIllllIIIIIll() {
        llIIIlIIllI = new int[6];
        llIIIlIIllI[0] = (-16433) & 29886;
        llIIIlIIllI[1] = (41 ^ 98) & ((209 ^ 154) ^ (-1));
        llIIIlIIllI[2] = (10 ^ 77) ^ (67 ^ 2);
        llIIIlIIllI[3] = "   ".length();
        llIIIlIIllI[4] = (-((-105) & 31849)) & (-166) & 32511;
        llIIIlIIllI[5] = (-((-11594) & 28671)) & (-6153) & 50617085;
    }

    private static boolean lIIllllIIIIlII(int i) {
        return i == 0;
    }

    public abstract boolean bl();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean run() {
        return lIIllllIIIIlII(j(llIIIlIIllI[0]) ? 1 : 0) ? llIIIlIIllI[1] : bl();
    }

    static {
        lIIllllIIIIIll();
        hV = llIIIlIIllI[2];
        hX = llIIIlIIllI[0];
        hU = llIIIlIIllI[3];
        hT = llIIIlIIllI[4];
        hW = llIIIlIIllI[5];
    }
}
