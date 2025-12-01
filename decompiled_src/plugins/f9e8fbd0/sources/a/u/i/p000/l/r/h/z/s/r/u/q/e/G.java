package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
@TaskDesc(name = "Walking to bank")
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.G  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/G.class */
public class G extends E {
    private static final /* synthetic */ int ac;
    private final /* synthetic */ SquireZulrah ad;
    private static /* synthetic */ int[] lIllIlIIIIllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    private boolean ag() {
        if (llIIIlllIlIlIlI(this.Z.isInInstancedRegion() ? 1 : 0)) {
            return lIllIlIIIIllI[0];
        }
        int[] mapRegions = this.Z.getMapRegions();
        int length = mapRegions.length;
        int i = lIllIlIIIIllI[0];
        while (llIIIlllIlIllIl(i, length)) {
            int i2 = mapRegions[i];
            if (!llIIIlllIlIlllI(i2, lIllIlIIIIllI[1]) || llIIIlllIlIllll(i2, lIllIlIIIIllI[2])) {
                return lIllIlIIIIllI[3];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((((99 + 182) - 158) + 64) ^ (((119 + 80) - 141) + 111)) & (((((14 + 64) - (-22)) + 52) ^ (((99 + 11) - 40) + 68)) ^ (-" ".length()));
            }
        }
        return lIllIlIIIIllI[0];
    }

    private static boolean llIIIlllIlIllII(int i) {
        return i != 0;
    }

    static {
        llIIIlllIlIlIIl();
        ac = lIllIlIIIIllI[4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.E
    public boolean ac() {
        return lIllIlIIIIllI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.E
    public boolean run() {
        if (!llIIIlllIlIlIlI(ag() ? 1 : 0) || llIIIlllIlIlIll(this.ad.a(), EnumC0002c.DONE)) {
            return lIllIlIIIIllI[0];
        }
        if (!llIIIlllIlIlIlI(this.ad.d() ? 1 : 0) && !llIIIlllIlIllII(ad() ? 1 : 0)) {
            return this.X.bankLocation().f().getAsBoolean();
        }
        return lIllIlIIIIllI[0];
    }

    @Inject
    protected G(SquireZulrahConfig squireZulrahConfig, Client client, C0019t c0019t, SquireZulrah squireZulrah) {
        super(squireZulrah, squireZulrahConfig, client, c0019t);
        this.ad = squireZulrah;
    }

    private static boolean llIIIlllIlIlIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void llIIIlllIlIlIIl() {
        lIllIlIIIIllI = new int[5];
        lIllIlIIIIllI[0] = ((12 ^ 61) ^ (91 ^ 87)) & (((54 ^ 85) ^ (48 ^ 110)) ^ (-" ".length()));
        lIllIlIIIIllI[1] = (-22729) & 31736;
        lIllIlIIIIllI[2] = (-5249) & 14255;
        lIllIlIIIIllI[3] = " ".length();
        lIllIlIIIIllI[4] = (-17425) & 26175;
    }

    private static boolean llIIIlllIlIlIlI(int i) {
        return i == 0;
    }

    private static boolean llIIIlllIlIlllI(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIIlllIlIllll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIlllIlIllIl(int i, int i2) {
        return i < i2;
    }
}
