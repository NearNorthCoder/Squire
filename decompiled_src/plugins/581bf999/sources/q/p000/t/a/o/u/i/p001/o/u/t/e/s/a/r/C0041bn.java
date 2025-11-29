package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.GroundObject;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Solving light puzzle", register = true, priority = 5, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bn  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bn.class */
public class C0041bn extends AbstractC0040bm {
    private static final /* synthetic */ int[] fl;
    private static final /* synthetic */ Point[] fk;
    private static /* synthetic */ int[] lIllIlllllI;
    private /* synthetic */ int fn;
    private static final /* synthetic */ int fj;
    private /* synthetic */ Set<WorldPoint> fo;
    private static final /* synthetic */ int fi;
    private /* synthetic */ boolean fm;

    private static boolean lIIllIIIIlIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIIIIllIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIllIIIIllIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIllIIIIlIlII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    private void ca() {
        Tile[][] tileArr = this.cu.getScene().getTiles()[this.cu.getPlane()];
        Point a = a(tileArr);
        if (lIIllIIIIlIlII(a)) {
            return;
        }
        this.fm = lIllIlllllI[1];
        this.fn = a(tileArr, a);
        this.fo = b(a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        if (lIIllIIIIlIIll(gameObjectSpawned.getGameObject().getId(), lIllIlllllI[3])) {
            this.fm = lIllIlllllI[2];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        if (lIIllIIIIlIIll(gameObjectDespawned.getGameObject().getId(), lIllIlllllI[3])) {
            this.fm = lIllIlllllI[2];
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        if (lIIllIIIIlIlIl(this.fm ? 1 : 0) && lIIllIIIIlIllI(bk() ? 1 : 0)) {
            ca();
        }
    }

    private int a(Tile[][] tileArr, Point point) {
        int i;
        int i2 = lIllIlllllI[2];
        int i3 = lIllIlllllI[2];
        while (lIIllIIIIlIlll(i3, lIllIlllllI[4])) {
            if (lIIllIIIIllIIl(i3, lIllIlllllI[6])) {
                i = i3 + lIllIlllllI[1];
                "".length();
                if ("  ".length() == 0) {
                    return (106 ^ 76) & ((24 ^ 62) ^ (-1));
                }
            } else {
                i = i3;
            }
            int i4 = i;
            if (lIIllIIIIlIllI(Arrays.stream(tileArr[point.getX() + ((i4 % lIllIlllllI[6]) * lIllIlllllI[7])][point.getY() - ((i4 / lIllIlllllI[6]) * lIllIlllllI[7])].getGameObjects()).filter((v0) -> {
                return Objects.nonNull(v0);
            }).mapToInt((v0) -> {
                return v0.getId();
            }).anyMatch(i5 -> {
                if (lIIllIIIIlIIll(i5, lIllIlllllI[3])) {
                    ?? r0 = lIllIlllllI[1];
                    "".length();
                    return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllIlllllI[2];
            }) ? 1 : 0)) {
                i2 |= lIllIlllllI[1] << i3;
            }
            i3++;
            "".length();
            if (" ".length() >= ((((63 + 156) - 92) + 30) ^ (((81 + 35) - 14) + 51))) {
                return ((211 ^ 130) ^ (235 ^ 159)) & (((143 ^ 134) ^ (4 ^ 40)) ^ (-" ".length()));
            }
        }
        return i2;
    }

    private static boolean lIIllIIIIlIllI(int i) {
        return i != 0;
    }

    private static boolean lIIllIIIIllIlI(int i, int i2) {
        return i != i2;
    }

    private static void lIIllIIIIlIIII() {
        lIllIlllllI = new int[24];
        lIllIlllllI[0] = -" ".length();
        lIllIlllllI[1] = " ".length();
        lIllIlllllI[2] = (43 ^ 113) & ((99 ^ 57) ^ (-1));
        lIllIlllllI[3] = (-2101) & 47484;
        lIllIlllllI[4] = (((55 + 131) - 140) + 137) ^ (((183 + 29) - 80) + 59);
        lIllIlllllI[5] = (-735) & 46078;
        lIllIlllllI[6] = "   ".length();
        lIllIlllllI[7] = "  ".length();
        lIllIlllllI[8] = 176 ^ 180;
        lIllIlllllI[9] = 145 ^ 181;
        lIllIlllllI[10] = (((107 + 248) - 311) + 207) ^ (((170 + 51) - 190) + 164);
        lIllIlllllI[11] = (255 ^ 142) ^ (213 ^ 136);
        lIllIlllllI[12] = (241 ^ 199) ^ "   ".length();
        lIllIlllllI[13] = 53 ^ 64;
        lIllIlllllI[14] = ((114 + 180) - 257) + 149;
        lIllIlllllI[15] = ((62 + 59) - 19) + 103;
        lIllIlllllI[16] = (((((28 + 29) - (-100)) + 3) + (((74 + 60) - 120) + 122)) - ((-27361) & 27647)) + ((188 + 13) - 42) + 38;
        lIllIlllllI[17] = (((230 + 102) - 289) + 203) ^ (((99 + 126) - 97) + 5);
        lIllIlllllI[18] = 4 ^ 1;
        lIllIlllllI[19] = ((114 + 7) - (-40)) + 18;
        lIllIlllllI[20] = 14 ^ 8;
        lIllIlllllI[21] = 100 ^ 57;
        lIllIlllllI[22] = (144 ^ 199) ^ (75 ^ 27);
        lIllIlllllI[23] = ((12 + 22) - 15) + 155;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public boolean bY() {
        WorldPoint orElse = this.fo.stream().findFirst().orElse(null);
        if (lIIllIIIIlIlII(orElse)) {
            return lIllIlllllI[2];
        }
        Movement.setDestination(orElse);
        return lIllIlllllI[1];
    }

    static {
        lIIllIIIIlIIII();
        fi = lIllIlllllI[5];
        fj = lIllIlllllI[3];
        Point[] pointArr = new Point[lIllIlllllI[8]];
        pointArr[lIllIlllllI[2]] = new Point(lIllIlllllI[9], lIllIlllllI[10]);
        pointArr[lIllIlllllI[1]] = new Point(lIllIlllllI[9], lIllIlllllI[11]);
        pointArr[lIllIlllllI[7]] = new Point(lIllIlllllI[12], lIllIlllllI[10]);
        pointArr[lIllIlllllI[6]] = new Point(lIllIlllllI[12], lIllIlllllI[11]);
        fk = pointArr;
        int[] iArr = new int[lIllIlllllI[4]];
        iArr[lIllIlllllI[2]] = lIllIlllllI[13];
        iArr[lIllIlllllI[1]] = lIllIlllllI[14];
        iArr[lIllIlllllI[7]] = lIllIlllllI[15];
        iArr[lIllIlllllI[6]] = lIllIlllllI[16];
        iArr[lIllIlllllI[8]] = lIllIlllllI[17];
        iArr[lIllIlllllI[18]] = lIllIlllllI[19];
        iArr[lIllIlllllI[20]] = lIllIlllllI[21];
        iArr[lIllIlllllI[22]] = lIllIlllllI[23];
        fl = iArr;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm
    public int bZ() {
        int[] iArr = new int[lIllIlllllI[1]];
        iArr[lIllIlllllI[2]] = lIllIlllllI[5];
        return TileObjects.getNearest(iArr).getWorldX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.fm = lIllIlllllI[2];
        this.fn = lIllIlllllI[0];
        this.fo = Collections.emptySet();
    }

    private static boolean lIIllIIIIlIIll(int i, int i2) {
        return i == i2;
    }

    @Inject
    protected C0041bn(Client client, C0077z c0077z, TOAConfig tOAConfig, C0067p c0067p) {
        super(client, c0077z, tOAConfig, c0067p);
        this.fn = lIllIlllllI[0];
        this.fo = Collections.emptySet();
    }

    private static boolean lIIllIIIIlIlIl(int i) {
        return i == 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        int[] iArr = new int[lIllIlllllI[1]];
        iArr[lIllIlllllI[2]] = lIllIlllllI[5];
        return TileObjects.getAll(iArr).stream().anyMatch((v0) -> {
            return Reachable.isInteractable(v0);
        });
    }

    private Point a(Tile[][] tileArr) {
        Point[] pointArr = fk;
        int length = pointArr.length;
        int i = lIllIlllllI[2];
        while (lIIllIIIIlIlll(i, length)) {
            Point point = pointArr[i];
            GroundObject groundObject = tileArr[point.getX()][point.getY()].getGroundObject();
            if (lIIllIIIIllIII(groundObject) && lIIllIIIIlIIll(groundObject.getId(), lIllIlllllI[5])) {
                return point;
            }
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return null;
    }

    private Set<WorldPoint> b(Point point) {
        int i;
        int i2 = lIllIlllllI[2];
        int llllllllllllllllIlIIllllIIlllIII = lIllIlllllI[2];
        while (lIIllIIIIlIlll(llllllllllllllllIlIIllllIIlllIII, lIllIlllllI[4])) {
            int i3 = lIllIlllllI[1] << llllllllllllllllIlIIllllIIlllIII;
            if (lIIllIIIIllIlI(this.fn & i3, i3)) {
                i2 ^= fl[llllllllllllllllIlIIllllIIlllIII];
            }
            llllllllllllllllIlIIllllIIlllIII++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        HashSet hashSet = new HashSet();
        int i4 = lIllIlllllI[2];
        while (lIIllIIIIlIlll(i4, lIllIlllllI[4])) {
            int i5 = lIllIlllllI[1] << i4;
            if (lIIllIIIIlIIll(i2 & i5, i5)) {
                if (lIIllIIIIllIIl(i4, lIllIlllllI[6])) {
                    i = i4 + lIllIlllllI[1];
                    "".length();
                    if ((((((145 + 148) - 194) + 113) ^ (((39 + 38) - 14) + 85)) & (((((4 + 54) - (-6)) + 181) ^ (((41 + 57) - (-24)) + 59)) ^ (-" ".length()))) > 0) {
                        return null;
                    }
                } else {
                    i = i4;
                }
                int i6 = i;
                hashSet.add(WorldPoint.fromScene(this.cu, point.getX() + ((i6 % lIllIlllllI[6]) * lIllIlllllI[7]), point.getY() - ((i6 / lIllIlllllI[6]) * lIllIlllllI[7]), this.cu.getPlane()));
                "".length();
            }
            i4++;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0040bm, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        int[] iArr = new int[lIllIlllllI[1]];
        iArr[lIllIlllllI[2]] = lIllIlllllI[3];
        if (lIIllIIIIlIIll(TileObjects.getAll(iArr).size(), lIllIlllllI[4])) {
            ?? r0 = lIllIlllllI[1];
            "".length();
            return (((106 ^ 122) ^ (149 ^ 198)) & (((122 ^ 57) ^ ((132 ^ 143) & ((104 ^ 99) ^ (-1)))) ^ (-" ".length()))) < (((((211 + 135) - 154) + 58) ^ (((144 + 113) - 219) + 138)) & (((((184 + 237) - 294) + 113) ^ (((152 + 73) - 188) + 149)) ^ (-" ".length()))) ? ((113 ^ 12) ^ (243 ^ 171)) & (((240 ^ 174) ^ (58 ^ 65)) ^ (-" ".length())) : r0;
        }
        return lIllIlllllI[2];
    }
}
