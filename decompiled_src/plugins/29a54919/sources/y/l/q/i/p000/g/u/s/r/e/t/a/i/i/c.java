package y.l.q.i.p000.g.u.s.r.e.t.a.i.i;

import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;
/* renamed from: y.l.q.i.-.g.u.s.r.e.t.a.i.i.c  reason: invalid package */
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:y/l/q/i/-/g/u/s/r/e/t/a/i/i/c.class */
public class c implements Locatable {
    private final /* synthetic */ String m;
    private final /* synthetic */ String n;
    private final /* synthetic */ a l;
    private final /* synthetic */ WorldPoint o;
    private static /* synthetic */ int[] lIllIIIIIlI;
    private final /* synthetic */ boolean p;

    public WorldPoint getWorldLocation() {
        if (lIIlIlIIlIllll(this.o)) {
            WorldPoint worldPoint = this.o;
            "".length();
            if ("   ".length() < "  ".length()) {
                return null;
            }
            return worldPoint;
        }
        return this.l.i();
    }

    public int distanceTo(Locatable locatable) {
        WorldPoint worldLocation = locatable.getWorldLocation();
        if (lIIlIlIIlIllll(worldLocation)) {
            int distanceTo = distanceTo(worldLocation);
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (121 ^ 34) & ((14 ^ 85) ^ (-1)) : distanceTo;
        }
        return lIllIIIIIlI[3];
    }

    static {
        lIIlIlIIlIlIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    public c(a aVar, String str, String str2) {
        this(aVar, str, str2, lIllIIIIIlI[0], null);
    }

    private static boolean lIIlIlIIlIllIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIIlIllll(Object obj) {
        return obj != null;
    }

    public WorldPoint q() {
        return this.o;
    }

    private static boolean lIIlIlIIlIllII(int i, int i2) {
        return i <= i2;
    }

    public String o() {
        return this.m;
    }

    public c(a aVar, String str, String str2, boolean z, WorldPoint worldPoint) {
        this.l = aVar;
        this.m = str;
        this.n = str2;
        this.p = z;
        this.o = worldPoint;
    }

    public String n() {
        return this.n;
    }

    public TileObject r() {
        TileObject tileObject = null;
        WorldPoint worldLocation = getWorldLocation();
        if (lIIlIlIIlIlllI(worldLocation)) {
            String[] strArr = new String[lIllIIIIIlI[2]];
            strArr[lIllIIIIIlI[0]] = this.m;
            tileObject = TileObjects.getNearest(strArr);
            "".length();
            if (((36 ^ 41) & ((110 ^ 99) ^ (-1))) <= (-" ".length())) {
                return null;
            }
        } else if (lIIlIlIIlIllll(this.o)) {
            tileObject = TileObjects.getNearest(worldLocation, this::a);
        }
        if (!lIIlIlIIlIllll(tileObject)) {
            String[] strArr2 = new String[lIllIIIIIlI[2]];
            strArr2[lIllIIIIIlI[0]] = this.m;
            return TileObjects.getNearest(strArr2);
        }
        TileObject tileObject2 = tileObject;
        "".length();
        if ("   ".length() == 0) {
            return null;
        }
        return tileObject2;
    }

    public a m() {
        return this.l;
    }

    private static boolean lIIlIlIIlIlllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    public c(a aVar, String str, String str2, WorldPoint worldPoint) {
        this(aVar, str, str2, lIllIIIIIlI[0], worldPoint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean a(TileObject tileObject) {
        if (lIIlIlIIlIllII(ScenePoint.fromWorld(this.o).distanceTo(ScenePoint.fromWorld(tileObject.getWorldLocation())), lIllIIIIIlI[1]) && lIIlIlIIlIllIl(tileObject.getName().equals(this.m) ? 1 : 0)) {
            ?? r0 = lIllIIIIIlI[2];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIIIIlI[0];
    }

    public boolean p() {
        return this.p;
    }

    private static void lIIlIlIIlIlIll() {
        lIllIIIIIlI = new int[4];
        lIllIIIIIlI[0] = ((((60 + 109) - 47) + 25) ^ (((21 + 101) - (-13)) + 22)) & (((201 ^ 173) ^ (83 ^ 57)) ^ (-" ".length()));
        lIllIIIIIlI[1] = "   ".length();
        lIllIIIIIlI[2] = " ".length();
        lIllIIIIIlI[3] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
    }

    public WorldArea getWorldArea() {
        return new WorldArea(this.l.e(), this.l.f());
    }

    public int distanceTo(WorldPoint worldPoint) {
        WorldPoint worldLocation = getWorldLocation();
        if (lIIlIlIIlIllll(worldLocation)) {
            int distanceTo = worldLocation.distanceTo(worldPoint);
            "".length();
            return (-"  ".length()) >= 0 ? ((((169 + 81) - 136) + 70) ^ (((38 + 40) - (-93)) + 5)) & (((83 ^ 14) ^ (215 ^ 130)) ^ (-" ".length())) : distanceTo;
        }
        return lIllIIIIIlI[3];
    }

    public LocalPoint getLocalLocation() {
        return LocalPoint.fromWorld(Static.getClient(), getWorldLocation());
    }

    public int s() {
        Player local = Players.getLocal();
        if (lIIlIlIIlIllll(local)) {
            int distanceTo = distanceTo((Locatable) local);
            "".length();
            return "   ".length() < 0 ? ((56 ^ 102) ^ (47 ^ 62)) & (((118 ^ 125) ^ (129 ^ 197)) ^ (-" ".length())) : distanceTo;
        }
        return lIllIIIIIlI[3];
    }
}
