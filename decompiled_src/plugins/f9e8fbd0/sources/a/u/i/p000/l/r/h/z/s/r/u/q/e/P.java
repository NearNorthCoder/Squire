package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.P  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/P.class */
public abstract class P extends Task {
    protected final /* synthetic */ SquireZulrah al;
    protected final /* synthetic */ Client aj;
    private static final /* synthetic */ int ai;
    protected final /* synthetic */ SquireZulrahConfig ak;
    private final /* synthetic */ EnumC0002c am;
    private static /* synthetic */ int[] lIllIllIlIIlI;
    protected static final /* synthetic */ int ah;

    private static boolean llIIlIIlIIIlIIl(int i, int i2) {
        return i == i2;
    }

    static {
        llIIlIIlIIIIlIl();
        ah = lIllIllIlIIlI[3];
        ai = lIllIllIlIIlI[2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean ah() {
        int[] mapRegions = this.aj.getMapRegions();
        int llllllllllllllIllIIIlIlIIlllIIlI = mapRegions.length;
        int i = lIllIllIlIIlI[1];
        while (llIIlIIlIIIlIII(i, llllllllllllllIllIIIlIlIIlllIIlI)) {
            if (llIIlIIlIIIlIIl(mapRegions[i], lIllIllIlIIlI[2])) {
                return lIllIllIlIIlI[0];
            }
            i++;
            "".length();
            if ((((252 ^ 140) ^ (97 ^ 42)) & (((149 ^ 175) ^ " ".length()) ^ (-" ".length()))) > " ".length()) {
                return ((121 ^ 42) ^ (((22 + 41) - (-58)) + 6)) & (((51 ^ 54) ^ (111 ^ 70)) ^ (-" ".length()));
            }
        }
        return lIllIllIlIIlI[1];
    }

    private static boolean llIIlIIlIIIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (llIIlIIlIIIIllI(this.al.a(), this.am) && llIIlIIlIIIIlll(ac() ? 1 : 0)) {
            ?? r0 = lIllIllIlIIlI[0];
            "".length();
            return ((184 ^ 129) & ((179 ^ 138) ^ (-1))) < 0 ? "  ".length() & ("  ".length() ^ (-1)) : r0;
        }
        return lIllIllIlIIlI[1];
    }

    private static boolean llIIlIIlIIIlIII(int i, int i2) {
        return i < i2;
    }

    public abstract boolean ac();

    public P(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client, EnumC0002c enumC0002c) {
        this.ak = squireZulrahConfig;
        this.al = squireZulrah;
        this.aj = client;
        this.am = enumC0002c;
    }

    private static boolean llIIlIIlIIIIlll(int i) {
        return i != 0;
    }

    private static void llIIlIIlIIIIlIl() {
        lIllIllIlIIlI = new int[4];
        lIllIllIlIIlI[0] = " ".length();
        lIllIllIlIIlI[1] = (84 ^ 17) & ((66 ^ 7) ^ (-1));
        lIllIllIlIIlI[2] = (-17809) & 26559;
        lIllIllIlIIlI[3] = (-((-4705) & 12909)) & (-4099) & 14335;
    }
}
