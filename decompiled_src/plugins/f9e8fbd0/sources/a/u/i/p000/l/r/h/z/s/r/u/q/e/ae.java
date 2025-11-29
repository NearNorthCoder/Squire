package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Disabling prayers", priority = 100)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.ae  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/ae.class */
public class ae extends ag {
    private static /* synthetic */ int[] lIllIlIIlllll;

    private static boolean llIIIlllllIlIll(int i, int i2) {
        return i < i2;
    }

    @Inject
    protected ae(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    static {
        llIIIlllllIlIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ag
    public boolean ac() {
        int i = lIllIlIIlllll[0];
        Prayer[] values = Prayer.values();
        int length = values.length;
        int llllllllllllllIllIIIlllIIlllllll = lIllIlIIlllll[0];
        while (llIIIlllllIlIll(llllllllllllllIllIIIlllIIlllllll, length)) {
            Prayer prayer = values[llllllllllllllIllIIIlllIIlllllll];
            if (llIIIlllllIllII(Prayers.isEnabled(prayer) ? 1 : 0)) {
                Prayers.toggle(prayer);
                i = lIllIlIIlllll[1];
            }
            llllllllllllllIllIIIlllIIlllllll++;
            "".length();
            if (" ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return i;
    }

    private static void llIIIlllllIlIlI() {
        lIllIlIIlllll = new int[2];
        lIllIlIIlllll[0] = (87 ^ 126) & ((9 ^ 32) ^ (-1));
        lIllIlIIlllll[1] = " ".length();
    }

    private static boolean llIIIlllllIllII(int i) {
        return i != 0;
    }
}
