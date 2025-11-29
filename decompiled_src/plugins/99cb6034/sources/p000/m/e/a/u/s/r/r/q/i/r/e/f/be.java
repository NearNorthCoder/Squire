package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Noting produce", priority = 20, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.be  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/be.class */
public class be extends AbstractC0026az {
    private static /* synthetic */ int[] llIIIIIlllII;
    private final /* synthetic */ C0033h cR;
    private /* synthetic */ boolean cS;

    private static boolean llllIIIlllIIlI(int i) {
        return i == 0;
    }

    private static void llllIIIlllIIIl() {
        llIIIIIlllII = new int[2];
        llIIIIIlllII[0] = (235 ^ 138) & ((96 ^ 1) ^ (-1));
        llIIIIIlllII[1] = " ".length();
    }

    static {
        llllIIIlllIIIl();
    }

    private static boolean llllIIIlllIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    public boolean run() {
        WorldPoint u = this.bR.u();
        if (llllIIIlllIIlI(Inventory.contains(item -> {
            return L.bq.contains(Integer.valueOf(item.getId()));
        }) ? 1 : 0)) {
            this.cS = llIIIIIlllII[0];
            "".length();
            if (((170 ^ 138) & ((114 ^ 82) ^ (-1))) == (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if (!llllIIIlllIIlI(Inventory.isFull() ? 1 : 0) || !llllIIIlllIIll(u) || llllIIIlllIIlI(u.isInScene(this.bT) ? 1 : 0)) {
            this.cS = llIIIIIlllII[1];
        }
        if (llllIIIlllIIlI(this.cR.K() ? 1 : 0)) {
            return llIIIIIlllII[0];
        }
        if (llllIIIlllIlII(this.cS ? 1 : 0) && llllIIIlllIlII(this.cR.J() ? 1 : 0)) {
            ?? r0 = llIIIIIlllII[1];
            "".length();
            return (-" ".length()) > " ".length() ? ((235 ^ 163) ^ (54 ^ 56)) & (((((68 + 124) - 98) + 155) ^ (((68 + 121) - 86) + 88)) ^ (-" ".length())) : r0;
        }
        return llIIIIIlllII[0];
    }

    @Inject
    public be(C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client, C0033h c0033h) {
        super(c0031f, squireFarmerConfig, client);
        this.cR = c0033h;
    }

    private static boolean llllIIIlllIIll(Object obj) {
        return obj != null;
    }
}
