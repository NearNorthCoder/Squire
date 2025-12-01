package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
@TaskDesc(name = "Opening bank", priority = 5, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.I  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/I.class */
public class I extends E {
    private static /* synthetic */ int[] lIllIlllIIIIl;

    @Inject
    protected I(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, C0019t c0019t) {
        super(squireZulrah, squireZulrahConfig, client, c0019t);
    }

    static {
        llIIlIIlIllIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.E
    public boolean ac() {
        return lIllIlllIIIIl[0];
    }

    private static void llIIlIIlIllIIIl() {
        lIllIlllIIIIl = new int[1];
        lIllIlllIIIIl[0] = (148 ^ 160) & ((54 ^ 2) ^ (-1));
    }
}
