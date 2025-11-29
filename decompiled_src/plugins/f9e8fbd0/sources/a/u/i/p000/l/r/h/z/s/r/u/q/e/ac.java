package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
@TaskDesc(name = "Swapping gear", priority = 50)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.ac  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/ac.class */
public class ac extends ad {
    private static /* synthetic */ int[] lIlllIIIIIIlI;
    private final /* synthetic */ C0019t ay;

    private static boolean llIIlIlIIIllIII(int i) {
        return i == 0;
    }

    private static boolean llIIlIlIIIlIlll(int i) {
        return i != 0;
    }

    private static void llIIlIlIIIlIlIl() {
        lIlllIIIIIIlI = new int[2];
        lIlllIIIIIIlI[0] = " ".length();
        lIlllIIIIIIlI[1] = (188 ^ 128) & ((176 ^ 140) ^ (-1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ad
    public boolean ac() {
        int i;
        if (llIIlIlIIIlIllI(this.az.V().C().w(), EnumC0017r.MAGIC)) {
            i = lIlllIIIIIIlI[0];
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return "  ".length() & ("  ".length() ^ (-" ".length()));
            }
        } else {
            i = lIlllIIIIIIlI[1];
        }
        int i2 = i;
        if (llIIlIlIIIlIlll(i2) && llIIlIlIIIlIlll(this.ay.a(this.ay.P()) ? 1 : 0)) {
            return lIlllIIIIIIlI[0];
        }
        if (llIIlIlIIIllIII(i2) && llIIlIlIIIlIlll(this.ay.a(this.ay.O()) ? 1 : 0)) {
            ?? r0 = lIlllIIIIIIlI[0];
            "".length();
            return (((54 ^ 116) ^ (188 ^ 156)) & (("  ".length() ^ (253 ^ 157)) ^ (-" ".length()))) != 0 ? ((((222 + 189) - 222) + 46) ^ (((163 + 135) - 160) + 57)) & (((((2 + 53) - (-6)) + 69) ^ (((7 + 14) - (-69)) + 80)) ^ (-" ".length())) : r0;
        }
        return lIlllIIIIIIlI[1];
    }

    @Inject
    protected ac(C0021v c0021v, Client client, SquireZulrahConfig squireZulrahConfig, C0019t c0019t) {
        super(c0021v, client, squireZulrahConfig);
        this.ay = c0019t;
    }

    private static boolean llIIlIlIIIlIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        llIIlIlIIIlIlIl();
    }
}
