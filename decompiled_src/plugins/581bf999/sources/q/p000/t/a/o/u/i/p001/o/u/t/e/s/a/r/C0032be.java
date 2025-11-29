package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Dodging dung attack", priority = 8, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.be  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/be.class */
public class C0032be extends AbstractC0035bh {
    private static final /* synthetic */ int eG;
    private static /* synthetic */ int[] lIlllIIllIl;

    private static boolean lIIllIIlIIIIIl(int i) {
        return i == 0;
    }

    private static boolean lIIllIIlIIIIlI(Object obj) {
        return obj == null;
    }

    private static void lIIllIIlIIIIII() {
        lIlllIIllIl = new int[3];
        lIlllIIllIl[0] = ((((32 + 89) - (-25)) + 51) ^ (((34 + 19) - (-31)) + 46)) & (((149 ^ 168) ^ (33 ^ 91)) ^ (-" ".length()));
        lIlllIIllIl[1] = " ".length();
        lIlllIIllIl[2] = (-18441) & 63944;
    }

    private static boolean lIIllIIlIIIIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh
    protected boolean bL() {
        if (lIIllIIlIIIIIl(bR() ? 1 : 0)) {
            return lIlllIIllIl[0];
        }
        WorldPoint bT = bT();
        if (lIIllIIlIIIIlI(bT)) {
            return lIlllIIllIl[0];
        }
        f((boolean) lIlllIIllIl[1]);
        Movement.setDestination(bT);
        return lIlllIIllIl[1];
    }

    private int u(WorldPoint worldPoint) {
        double d = 0.0d;
        for (TileObject tileObject : bM()) {
            d += tileObject.getWorldLocation().distanceToHypotenuse(worldPoint);
            "".length();
            if (" ".length() <= (-" ".length())) {
                return (242 ^ 173) & ((154 ^ 197) ^ (-1));
            }
        }
        return (int) d;
    }

    @Inject
    protected C0032be(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    static {
        lIIllIIlIIIIII();
        eG = lIlllIIllIl[2];
    }
}
