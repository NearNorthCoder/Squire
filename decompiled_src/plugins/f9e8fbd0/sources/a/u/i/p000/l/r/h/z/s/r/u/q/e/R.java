package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.util.stream.IntStream;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Equipping gear (deathwalk)", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.R  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/R.class */
public class R extends P {
    private static /* synthetic */ int[] lIlllIIIIIlII;
    private final /* synthetic */ C0019t ap;

    private static boolean llIIlIlIIIlllII(int i, int i2) {
        return i != i2;
    }

    private static boolean llIIlIlIIIllIlI(int i) {
        return i == 0;
    }

    private static void llIIlIlIIIllIIl() {
        lIlllIIIIIlII = new int[3];
        lIlllIIIIIlII[0] = (86 ^ 108) & ((38 ^ 28) ^ (-1));
        lIlllIIIIIlII[1] = " ".length();
        lIlllIIIIIlII[2] = (-17921) & 20470;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.P
    public boolean ac() {
        if (llIIlIlIIIllIlI(Inventory.contains(item -> {
            return IntStream.of(this.ap.O()).anyMatch(i -> {
                if (llIIlIlIIIllIll(i, item.getId()) && llIIlIlIIIlllII(i, lIlllIIIIIlII[2])) {
                    ?? r0 = lIlllIIIIIlII[1];
                    "".length();
                    return 0 != 0 ? ((157 ^ 177) ^ (24 ^ 13)) & (((138 ^ 159) ^ (170 ^ 134)) ^ (-" ".length())) : r0;
                }
                return lIlllIIIIIlII[0];
            });
        }) ? 1 : 0)) {
            return lIlllIIIIIlII[0];
        }
        this.ap.a(this.ap.O());
        "".length();
        return lIlllIIIIIlII[1];
    }

    static {
        llIIlIlIIIllIIl();
    }

    @Inject
    public R(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, Client client, C0019t c0019t) {
        super(squireZulrahConfig, squireZulrah, client, EnumC0002c.COLLECTING_ZULRAH);
        this.ap = c0019t;
    }

    private static boolean llIIlIlIIIllIll(int i, int i2) {
        return i == i2;
    }
}
