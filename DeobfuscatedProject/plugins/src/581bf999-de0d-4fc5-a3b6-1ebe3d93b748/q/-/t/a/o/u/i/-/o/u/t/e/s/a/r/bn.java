/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GroundObject
 *  net.runelite.api.Point
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bm;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Solving light puzzle", register=true, priority=5, blocking=true)
public class bn
extends bm {
    private static final /* synthetic */ int[] fl;
    private static final /* synthetic */ Point[] fk;
    private static /* synthetic */ int[] lIllIlllllI;
    private /* synthetic */ int fn;
    private static final /* synthetic */ int fj;
    private /* synthetic */ Set<WorldPoint> fo;
    private static final /* synthetic */ int fi;
    private /* synthetic */ boolean fm;

    private static boolean lIIllIIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIIIIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllIIIIllIII(Object object) {
        return object != null;
    }

    private static boolean lIIllIIIIlIlII(Object object) {
        return object == null;
    }

    private void ca() {
        Tile[][] tileArray = this.cu.getScene().getTiles()[this.cu.getPlane()];
        Point point = this.a(tileArray);
        if (bn.lIIllIIIIlIlII(point)) {
            return;
        }
        this.fm = lIllIlllllI[1];
        this.fn = this.a(tileArray, point);
        this.fo = this.b(point);
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        if (bn.lIIllIIIIlIIll(gameObjectSpawned.getGameObject().getId(), lIllIlllllI[3])) {
            this.fm = lIllIlllllI[2];
        }
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        if (bn.lIIllIIIIlIIll(gameObjectDespawned.getGameObject().getId(), lIllIlllllI[3])) {
            this.fm = lIllIlllllI[2];
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        if (bn.lIIllIIIIlIlIl(this.fm ? 1 : 0) && bn.lIIllIIIIlIllI(this.bk() ? 1 : 0)) {
            this.ca();
        }
    }

    /*
     * WARNING - void declaration
     */
    private int a(Tile[][] tileArray, Point point) {
        int n3 = lIllIlllllI[2];
        int llllllllllllllllIlIIllllIlIIlIlI = lIllIlllllI[2];
        while (bn.lIIllIIIIlIlll(llllllllllllllllIlIIllllIlIIlIlI, lIllIlllllI[4])) {
            void llllllllllllllllIlIIllllIlIIllII;
            void llllllllllllllllIlIIllllIlIIllIl;
            int n4;
            if (bn.lIIllIIIIllIIl(llllllllllllllllIlIIllllIlIIlIlI, lIllIlllllI[6])) {
                n4 = llllllllllllllllIlIIllllIlIIlIlI + lIllIlllllI[1];
                "".length();
                if ("  ".length() == 0) {
                    return (0x6A ^ 0x4C) & ~(0x18 ^ 0x3E);
                }
            } else {
                n4 = llllllllllllllllIlIIllllIlIIlIlI;
            }
            int llllllllllllllllIlIIllllIlIIlIIl = n4;
            int llllllllllllllllIlIIllllIlIIlIII = llllllllllllllllIlIIllllIlIIlIIl % lIllIlllllI[6];
            int llllllllllllllllIlIIllllIlIIIlll = llllllllllllllllIlIIllllIlIIlIIl / lIllIlllllI[6];
            void llllllllllllllllIlIIllllIlIIIllI = llllllllllllllllIlIIllllIlIIllIl[llllllllllllllllIlIIllllIlIIllII.getX() + llllllllllllllllIlIIllllIlIIlIII * lIllIlllllI[7]][llllllllllllllllIlIIllllIlIIllII.getY() - llllllllllllllllIlIIllllIlIIIlll * lIllIlllllI[7]];
            int llllllllllllllllIlIIllllIlIIIlIl = Arrays.stream(llllllllllllllllIlIIllllIlIIIllI.getGameObjects()).filter(Objects::nonNull).mapToInt(TileObject::getId).anyMatch(n2 -> {
                boolean bl2;
                if (bn.lIIllIIIIlIIll(n2, lIllIlllllI[3])) {
                    bl2 = lIllIlllllI[1];
                    "".length();
                    if ((0x27 ^ 0x22) == 0) {
                        return ((0xA ^ 0x69) & ~(0x23 ^ 0x40)) != 0;
                    }
                } else {
                    bl2 = lIllIlllllI[2];
                }
                return bl2;
            }) ? 1 : 0;
            if (bn.lIIllIIIIlIllI(llllllllllllllllIlIIllllIlIIIlIl)) {
                llllllllllllllllIlIIllllIlIIlIll |= lIllIlllllI[1] << llllllllllllllllIlIIllllIlIIlIlI;
            }
            ++llllllllllllllllIlIIllllIlIIlIlI;
            "".length();
            if (" ".length() < (63 + 156 - 92 + 30 ^ 81 + 35 - 14 + 51)) continue;
            return (0xD3 ^ 0x82 ^ (0xEB ^ 0x9F)) & (0x8F ^ 0x86 ^ (4 ^ 0x28) ^ -" ".length());
        }
        return n3;
    }

    private static boolean lIIllIIIIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIIIIllIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIllIIIIlIIII() {
        lIllIlllllI = new int[24];
        bn.lIllIlllllI[0] = -" ".length();
        bn.lIllIlllllI[1] = " ".length();
        bn.lIllIlllllI[2] = (0x2B ^ 0x71) & ~(0x63 ^ 0x39);
        bn.lIllIlllllI[3] = 0xFFFFF7CB & 0xB97C;
        bn.lIllIlllllI[4] = 55 + 131 - 140 + 137 ^ 183 + 29 - 80 + 59;
        bn.lIllIlllllI[5] = 0xFFFFFD21 & 0xB3FE;
        bn.lIllIlllllI[6] = "   ".length();
        bn.lIllIlllllI[7] = "  ".length();
        bn.lIllIlllllI[8] = 0xB0 ^ 0xB4;
        bn.lIllIlllllI[9] = 0x91 ^ 0xB5;
        bn.lIllIlllllI[10] = 107 + 248 - 311 + 207 ^ 170 + 51 - 190 + 164;
        bn.lIllIlllllI[11] = 0xFF ^ 0x8E ^ (0xD5 ^ 0x88);
        bn.lIllIlllllI[12] = 0xF1 ^ 0xC7 ^ "   ".length();
        bn.lIllIlllllI[13] = 0x35 ^ 0x40;
        bn.lIllIlllllI[14] = 114 + 180 - 257 + 149;
        bn.lIllIlllllI[15] = 62 + 59 - 19 + 103;
        bn.lIllIlllllI[16] = 28 + 29 - -100 + 3 + (74 + 60 - 120 + 122) - (0xFFFF951F & 0x6BFF) + (188 + 13 - 42 + 38);
        bn.lIllIlllllI[17] = 230 + 102 - 289 + 203 ^ 99 + 126 - 97 + 5;
        bn.lIllIlllllI[18] = 4 ^ 1;
        bn.lIllIlllllI[19] = 114 + 7 - -40 + 18;
        bn.lIllIlllllI[20] = 0xE ^ 8;
        bn.lIllIlllllI[21] = 0x64 ^ 0x39;
        bn.lIllIlllllI[22] = 0x90 ^ 0xC7 ^ (0x4B ^ 0x1B);
        bn.lIllIlllllI[23] = 12 + 22 - 15 + 155;
    }

    @Override
    public boolean bY() {
        WorldPoint worldPoint = this.fo.stream().findFirst().orElse(null);
        if (bn.lIIllIIIIlIlII(worldPoint)) {
            return lIllIlllllI[2];
        }
        Movement.setDestination((WorldPoint)worldPoint);
        return lIllIlllllI[1];
    }

    static {
        bn.lIIllIIIIlIIII();
        fi = lIllIlllllI[5];
        fj = lIllIlllllI[3];
        Point[] pointArray = new Point[lIllIlllllI[8]];
        pointArray[bn.lIllIlllllI[2]] = new Point(lIllIlllllI[9], lIllIlllllI[10]);
        pointArray[bn.lIllIlllllI[1]] = new Point(lIllIlllllI[9], lIllIlllllI[11]);
        pointArray[bn.lIllIlllllI[7]] = new Point(lIllIlllllI[12], lIllIlllllI[10]);
        pointArray[bn.lIllIlllllI[6]] = new Point(lIllIlllllI[12], lIllIlllllI[11]);
        fk = pointArray;
        int[] nArray = new int[lIllIlllllI[4]];
        nArray[bn.lIllIlllllI[2]] = lIllIlllllI[13];
        nArray[bn.lIllIlllllI[1]] = lIllIlllllI[14];
        nArray[bn.lIllIlllllI[7]] = lIllIlllllI[15];
        nArray[bn.lIllIlllllI[6]] = lIllIlllllI[16];
        nArray[bn.lIllIlllllI[8]] = lIllIlllllI[17];
        nArray[bn.lIllIlllllI[18]] = lIllIlllllI[19];
        nArray[bn.lIllIlllllI[20]] = lIllIlllllI[21];
        nArray[bn.lIllIlllllI[22]] = lIllIlllllI[23];
        fl = nArray;
    }

    @Override
    public int bZ() {
        int[] nArray = new int[lIllIlllllI[1]];
        nArray[bn.lIllIlllllI[2]] = lIllIlllllI[5];
        return TileObjects.getNearest((int[])nArray).getWorldX();
    }

    @Override
    public void r() {
        this.fm = lIllIlllllI[2];
        this.fn = lIllIlllllI[0];
        this.fo = Collections.emptySet();
    }

    private static boolean lIIllIIIIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    protected bn(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
        this.fn = lIllIlllllI[0];
        this.fo = Collections.emptySet();
    }

    private static boolean lIIllIIIIlIlIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean bk() {
        int[] nArray = new int[lIllIlllllI[1]];
        nArray[bn.lIllIlllllI[2]] = lIllIlllllI[5];
        return TileObjects.getAll((int[])nArray).stream().anyMatch(Reachable::isInteractable);
    }

    /*
     * WARNING - void declaration
     */
    private Point a(Tile[][] tileArray) {
        void llllllllllllllllIlIIllllIlIllIll;
        Point[] pointArray = fk;
        int n2 = pointArray.length;
        int llllllllllllllllIlIIllllIlIllIlI = lIllIlllllI[2];
        while (bn.lIIllIIIIlIlll(llllllllllllllllIlIIllllIlIllIlI, (int)llllllllllllllllIlIIllllIlIllIll)) {
            void llllllllllllllllIlIIllllIlIlllIl;
            void llllllllllllllllIlIIllllIlIlllII;
            void llllllllllllllllIlIIllllIlIllIIl = llllllllllllllllIlIIllllIlIlllII[llllllllllllllllIlIIllllIlIllIlI];
            void llllllllllllllllIlIIllllIlIllIII = llllllllllllllllIlIIllllIlIlllIl[llllllllllllllllIlIIllllIlIllIIl.getX()][llllllllllllllllIlIIllllIlIllIIl.getY()];
            GroundObject llllllllllllllllIlIIllllIlIlIlll = llllllllllllllllIlIIllllIlIllIII.getGroundObject();
            if (bn.lIIllIIIIllIII(llllllllllllllllIlIIllllIlIlIlll) && bn.lIIllIIIIlIIll(llllllllllllllllIlIIllllIlIlIlll.getId(), lIllIlllllI[5])) {
                return llllllllllllllllIlIIllllIlIllIIl;
            }
            ++llllllllllllllllIlIIllllIlIllIlI;
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private Set<WorldPoint> b(Point point) {
        void var3_4;
        bn llllllllllllllllIlIIllllIIlllIll;
        int llllllllllllllllIlIIllllIIllIlll;
        int n2 = lIllIlllllI[2];
        int llllllllllllllllIlIIllllIIlllIII22 = lIllIlllllI[2];
        while (bn.lIIllIIIIlIlll(llllllllllllllllIlIIllllIIlllIII22, lIllIlllllI[4])) {
            llllllllllllllllIlIIllllIIllIlll = lIllIlllllI[1] << llllllllllllllllIlIIllllIIlllIII22;
            if (bn.lIIllIIIIllIlI(llllllllllllllllIlIIllllIIlllIll.fn & llllllllllllllllIlIIllllIIllIlll, llllllllllllllllIlIIllllIIllIlll)) {
                llllllllllllllllIlIIllllIIlllIIl ^= fl[llllllllllllllllIlIIllllIIlllIII22];
            }
            ++llllllllllllllllIlIIllllIIlllIII22;
            "".length();
            if ("  ".length() != 0) continue;
            return null;
        }
        HashSet<WorldPoint> llllllllllllllllIlIIllllIIlllIII22 = new HashSet<WorldPoint>();
        llllllllllllllllIlIIllllIIllIlll = lIllIlllllI[2];
        while (bn.lIIllIIIIlIlll(llllllllllllllllIlIIllllIIllIlll, lIllIlllllI[4])) {
            int llllllllllllllllIlIIllllIIlllIIl;
            int llllllllllllllllIlIIllllIIllIllI = lIllIlllllI[1] << llllllllllllllllIlIIllllIIllIlll;
            if (bn.lIIllIIIIlIIll(llllllllllllllllIlIIllllIIlllIIl & llllllllllllllllIlIIllllIIllIllI, llllllllllllllllIlIIllllIIllIllI)) {
                void llllllllllllllllIlIIllllIIlllIlI;
                int n3;
                if (bn.lIIllIIIIllIIl(llllllllllllllllIlIIllllIIllIlll, lIllIlllllI[6])) {
                    n3 = llllllllllllllllIlIIllllIIllIlll + lIllIlllllI[1];
                    "".length();
                    if (((145 + 148 - 194 + 113 ^ 39 + 38 - 14 + 85) & (4 + 54 - -6 + 181 ^ 41 + 57 - -24 + 59 ^ -" ".length())) > 0) {
                        return null;
                    }
                } else {
                    n3 = llllllllllllllllIlIIllllIIllIlll;
                }
                int llllllllllllllllIlIIllllIIllIlIl = n3;
                int llllllllllllllllIlIIllllIIllIlII = llllllllllllllllIlIIllllIIllIlIl % lIllIlllllI[6];
                int llllllllllllllllIlIIllllIIllIIll = llllllllllllllllIlIIllllIIllIlIl / lIllIlllllI[6];
                llllllllllllllllIlIIllllIIlllIII22.add(WorldPoint.fromScene((Client)llllllllllllllllIlIIllllIIlllIll.cu, (int)(llllllllllllllllIlIIllllIIlllIlI.getX() + llllllllllllllllIlIIllllIIllIlII * lIllIlllllI[7]), (int)(llllllllllllllllIlIIllllIIlllIlI.getY() - llllllllllllllllIlIIllllIIllIIll * lIllIlllllI[7]), (int)llllllllllllllllIlIIllllIIlllIll.cu.getPlane()));
                "".length();
            }
            ++llllllllllllllllIlIIllllIIllIlll;
            "".length();
            if (" ".length() < "   ".length()) continue;
            return null;
        }
        return var3_4;
    }

    @Override
    public boolean bj() {
        boolean bl2;
        int[] nArray = new int[lIllIlllllI[1]];
        nArray[bn.lIllIlllllI[2]] = lIllIlllllI[3];
        if (bn.lIIllIIIIlIIll(TileObjects.getAll((int[])nArray).size(), lIllIlllllI[4])) {
            bl2 = lIllIlllllI[1];
            "".length();
            if (((0x6A ^ 0x7A ^ (0x95 ^ 0xC6)) & (0x7A ^ 0x39 ^ (0x84 ^ 0x8F) & ~(0x68 ^ 0x63) ^ -" ".length())) < ((211 + 135 - 154 + 58 ^ 144 + 113 - 219 + 138) & (184 + 237 - 294 + 113 ^ 152 + 73 - 188 + 149 ^ -" ".length()))) {
                return ((0x71 ^ 0xC ^ (0xF3 ^ 0xAB)) & (0xF0 ^ 0xAE ^ (0x3A ^ 0x41) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = lIllIlllllI[2];
        }
        return bl2;
    }
}

