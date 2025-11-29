package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@Singleton
@TaskDesc(name = "Moving to safespot", priority = 25, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bD  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bD.class */
public class bD extends bG {
    private static final /* synthetic */ int gi;
    private static /* synthetic */ int[] lIllllIlIIl;
    private /* synthetic */ int gj;

    /* renamed from: gg  reason: collision with root package name */
    private static final /* synthetic */ Point f2gg;
    private static final /* synthetic */ Point ge;
    private static final /* synthetic */ int gh;
    private static final /* synthetic */ Point gf;
    private /* synthetic */ Point gk;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        WorldPoint a = a(ge);
        if (lIIllIlIlIllII(this.gj)) {
            this.gj -= lIllllIlIIl[1];
            if (lIIllIlIlIllIl(this.gk, f2gg) && lIIllIlIlIlllI(this.gj, lIllllIlIIl[2])) {
                return lIllllIlIIl[0];
            }
            a = a(this.gk);
        }
        if (lIIllIlIlIllll(this.cu.getLocalPlayer().getWorldLocation().equals(a) ? 1 : 0)) {
            return lIllllIlIIl[0];
        }
        WorldPoint worldPoint = a;
        if (lIIllIlIlIllII(TileObjects.getAll(tileObject -> {
            if (lIIllIlIlIllll(tileObject instanceof GameObject ? 1 : 0) && lIIllIlIlIllll(((GameObject) tileObject).getWorldArea().contains(worldPoint) ? 1 : 0)) {
                ?? r0 = lIllllIlIIl[1];
                "".length();
                return ((((87 + 59) - 62) + 53) ^ (((95 + 39) - 42) + 49)) < (((84 ^ 11) ^ (15 ^ 79)) & (((219 ^ 186) ^ (1 ^ 127)) ^ (-" ".length()))) ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
            }
            return lIllllIlIIl[0];
        }).size())) {
            return lIllllIlIIl[0];
        }
        Movement.setDestination(a);
        return lIllllIlIIl[1];
    }

    private static void lIIllIlIlIlIll() {
        lIllllIlIIl = new int[12];
        lIllllIlIIl[0] = (40 ^ 27) & ((32 ^ 19) ^ (-1));
        lIllllIlIIl[1] = " ".length();
        lIllllIlIIl[2] = (((73 + 70) - 31) + 33) ^ (((95 + 15) - 36) + 75);
        lIllllIlIIl[3] = (-24641) & 26876;
        lIllllIlIIl[4] = (-((-165) & 13541)) & (-16645) & 32255;
        lIllllIlIIl[5] = 24 ^ 30;
        lIllllIlIIl[6] = (107 ^ 67) ^ (91 ^ 121);
        lIllllIlIIl[7] = (((1 + 122) - (-46)) + 0) ^ (((150 + 42) - 136) + 125);
        lIllllIlIIl[8] = 12 ^ 41;
        lIllllIlIIl[9] = 50 ^ 44;
        lIllllIlIIl[10] = 9 ^ 20;
        lIllllIlIIl[11] = (((76 + 88) - 79) + 94) ^ (((110 + 94) - 201) + 146);
    }

    private static boolean lIIllIlIllIIII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIllIlIlIllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIllIlIlIllll(int i) {
        return i != 0;
    }

    static {
        lIIllIlIlIlIll();
        gi = lIllllIlIIl[4];
        gh = lIllllIlIIl[3];
        ge = new Point(lIllllIlIIl[7], lIllllIlIIl[8]);
        gf = new Point(lIllllIlIIl[9], lIllllIlIIl[8]);
        f2gg = new Point(lIllllIlIIl[10], lIllllIlIIl[11]);
    }

    private static boolean lIIllIlIlIllII(int i) {
        return i > 0;
    }

    private static boolean lIIllIlIllIIIl(int i, int i2) {
        return i == i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return null;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        int i;
        Point point;
        int id = graphicsObjectCreated.getGraphicsObject().getId();
        if ((!lIIllIlIllIIII(id, lIllllIlIIl[3]) || lIIllIlIllIIIl(id, lIllllIlIIl[4])) && lIIllIlIlIllll(WorldPoint.fromLocal(this.cu, graphicsObjectCreated.getGraphicsObject().getLocation()).equals(a(ge)) ? 1 : 0)) {
            if (lIIllIlIllIIIl(id, lIllllIlIIl[3])) {
                i = lIllllIlIIl[5];
                "".length();
                if ((-"   ".length()) > 0) {
                    return;
                }
            } else {
                i = lIllllIlIIl[6];
            }
            this.gj = i;
            if (lIIllIlIllIIIl(id, lIllllIlIIl[3])) {
                point = gf;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                point = f2gg;
            }
            this.gk = point;
        }
    }

    @Inject
    protected bD(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
        this.gj = lIllllIlIIl[0];
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        super.r();
        this.gk = null;
        this.gj = lIllllIlIIl[0];
    }

    private static boolean lIIllIlIlIlllI(int i, int i2) {
        return i > i2;
    }
}
