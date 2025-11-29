/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bi;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Moving away from all dung", priority=40, blocking=true, register=true)
public class bk
extends bh {
    private /* synthetic */ int fc;
    private static /* synthetic */ int[] lIlllIIIIlI;
    private static final /* synthetic */ int fb;
    private static final /* synthetic */ int fa;
    private /* synthetic */ int fd;

    static {
        bk.lIIllIIIIllllI();
        fa = lIlllIIIIlI[2];
        fb = lIlllIIIIlI[1];
    }

    private static boolean lIIllIIIIlllll(Object object) {
        return object == null;
    }

    @Override
    public void r() {
        this.fc = lIlllIIIIlI[0];
    }

    /*
     * WARNING - void declaration
     */
    private int v(WorldPoint worldPoint) {
        void var4_4;
        void llllllllllllllllIlIIlllIllIlIIII;
        void llllllllllllllllIlIIlllIllIlIIIl;
        void llllllllllllllllIlIIlllIllIlIIlI;
        NPC nPC = this.bO();
        TileObject tileObject2 = TileObjects.getNearest((WorldPoint)worldPoint, tileObject -> {
            int n2;
            if (bk.lIIllIIIlIIIII(tileObject.getId(), lIlllIIIIlI[6]) && bk.lIIllIIIlIIIll(nPC.getWorldArea().isInMeleeDistance(tileObject.getWorldLocation()) ? 1 : 0)) {
                n2 = lIlllIIIIlI[3];
                "".length();
                if ("   ".length() == 0) {
                    return ((0x49 ^ 4 ^ (0x16 ^ 0x63)) & (0x2A ^ 0x6C ^ (0xE7 ^ 0x99) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlllIIIIlI[0];
            }
            return n2 != 0;
        });
        if (bk.lIIllIIIIlllll(tileObject2)) {
            return lIlllIIIIlI[5];
        }
        TileObject llllllllllllllllIlIIlllIllIIllll = TileObjects.getNearest((WorldPoint)llllllllllllllllIlIIlllIllIlIIlI, arg_0 -> bk.a((NPC)llllllllllllllllIlIIlllIllIlIIIl, (TileObject)llllllllllllllllIlIIlllIllIlIIII, arg_0));
        if (bk.lIIllIIIIlllll(llllllllllllllllIlIIlllIllIIllll)) {
            return llllllllllllllllIlIIlllIllIlIIlI.distanceTo(llllllllllllllllIlIIlllIllIlIIII.getWorldLocation());
        }
        return worldPoint.distanceTo(tileObject2.getWorldLocation()) + worldPoint.distanceTo(var4_4.getWorldLocation());
    }

    private static void lIIllIIIIllllI() {
        lIlllIIIIlI = new int[8];
        bk.lIlllIIIIlI[0] = (0x3D ^ 0x6C) & ~(0x60 ^ 0x31);
        bk.lIlllIIIIlI[1] = 0xFFFFA76F & 0x7DFA;
        bk.lIlllIIIIlI[2] = 90 + 189 - 160 + 126;
        bk.lIlllIIIIlI[3] = " ".length();
        bk.lIlllIIIIlI[4] = 37 + 116 - 79 + 59 ^ 59 + 51 - -21 + 12;
        bk.lIlllIIIIlI[5] = 0xFFFFFFFF & Integer.MAX_VALUE;
        bk.lIlllIIIIlI[6] = -(0xFFFFCFF7 & 0x7C3B) & (0xFFFFFDF3 & 0xFFFE);
        bk.lIlllIIIIlI[7] = "   ".length();
    }

    private WorldPoint bX() {
        WorldPoint llllllllllllllllIlIIlllIllIIIlII;
        int n2 = lIlllIIIIlI[5];
        Object var2_2 = null;
        Iterator llllllllllllllllIlIIlllIllIIIIll = eN.iterator();
        while (bk.lIIllIIIlIIIll(llllllllllllllllIlIIlllIllIIIIll.hasNext() ? 1 : 0)) {
            int llllllllllllllllIlIIlllIllIIIlIl;
            bk llllllllllllllllIlIIlllIllIIIllI;
            Point llllllllllllllllIlIIlllIllIIIIlI = (Point)llllllllllllllllIlIIlllIllIIIIll.next();
            WorldPoint llllllllllllllllIlIIlllIllIIIIIl = llllllllllllllllIlIIlllIllIIIllI.a(llllllllllllllllIlIIlllIllIIIIlI);
            WorldPoint llllllllllllllllIlIIlllIllIIIIII = Players.getLocal().getWorldLocation();
            if (bk.lIIllIIIlIIIll(llllllllllllllllIlIIlllIllIIIIII.equals((Object)llllllllllllllllIlIIlllIllIIIIIl) ? 1 : 0)) {
                int llllllllllllllllIlIIlllIlIllllll = eN.indexOf(llllllllllllllllIlIIlllIllIIIIlI) + lIlllIIIIlI[3];
                return llllllllllllllllIlIIlllIllIIIllI.a((Point)eN.get(llllllllllllllllIlIIlllIlIllllll % eN.size()));
            }
            if (bk.lIIllIIIlIIlII(llllllllllllllllIlIIlllIllIIIIII.distanceTo(llllllllllllllllIlIIlllIllIIIIIl), llllllllllllllllIlIIlllIllIIIlIl)) {
                llllllllllllllllIlIIlllIllIIIlIl = llllllllllllllllIlIIlllIllIIIIII.distanceTo(llllllllllllllllIlIIlllIllIIIIIl);
                llllllllllllllllIlIIlllIllIIIlII = llllllllllllllllIlIIlllIllIIIIIl;
            }
            "".length();
            if (((0xBF ^ 0xAF) & ~(0x28 ^ 0x38)) != "   ".length()) continue;
            return null;
        }
        if (bk.lIIllIIIIlllll(llllllllllllllllIlIIlllIllIIIlII)) {
            return null;
        }
        int n3 = eN.indexOf(var2_2) + lIlllIIIIlI[3];
        return this.a((Point)eN.get(n3 % eN.size()));
    }

    @Subscribe
    public void b(GameObjectSpawned gameObjectSpawned) {
        if (bk.lIIllIIIlIIIII(gameObjectSpawned.getGameObject().getId(), lIlllIIIIlI[6])) {
            // empty if block
        }
    }

    private static /* synthetic */ boolean a(NPC nPC, TileObject tileObject, TileObject tileObject2) {
        int n2;
        if (bk.lIIllIIIlIIIII(tileObject2.getId(), lIlllIIIIlI[6]) && bk.lIIllIIIlIIIll(nPC.getWorldArea().isInMeleeDistance(tileObject2.getWorldLocation()) ? 1 : 0) && bk.lIIllIIIlIIlIl(tileObject2, tileObject)) {
            n2 = lIlllIIIIlI[3];
            "".length();
            if (((0x1E ^ 0x2D) & ~(1 ^ 0x32)) <= -" ".length()) {
                return ((0xAA ^ 0xBF) & ~(0xAE ^ 0xBB)) != 0;
            }
        } else {
            n2 = lIlllIIIIlI[0];
        }
        return n2 != 0;
    }

    private static boolean lIIllIIIlIIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIllIIIlIIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var3_3;
        void llllllllllllllllIlIIlllIllIlllII;
        bk llllllllllllllllIlIIlllIllIlllIl;
        Player player = this.cu.getLocalPlayer();
        if (bk.lIIllIIIIlllll(player)) {
            return lIlllIIIIlI[0];
        }
        NPC llllllllllllllllIlIIlllIllIllIll = llllllllllllllllIlIIlllIllIlllIl.bO();
        if (bk.lIIllIIIlIIIII(llllllllllllllllIlIIlllIllIllIll.getAnimation(), lIlllIIIIlI[1])) {
            llllllllllllllllIlIIlllIllIlllIl.fd = llllllllllllllllIlIIlllIllIlllIl.cu.getTickCount();
        }
        if (bk.lIIllIIIlIIIIl(llllllllllllllllIlIIlllIllIlllII.hasSpotAnim(lIlllIIIIlI[2]) ? 1 : 0)) {
            llllllllllllllllIlIIlllIllIlllIl.fc = lIlllIIIIlI[0];
            return lIlllIIIIlI[0];
        }
        bk.f(lIlllIIIIlI[0]);
        if (bk.lIIllIIIlIIIlI(llllllllllllllllIlIIlllIllIlllIl.cu.getTickCount() - llllllllllllllllIlIIlllIllIlllIl.fd, lIlllIIIIlI[3])) {
            return lIlllIIIIlI[0];
        }
        WorldPoint llllllllllllllllIlIIlllIllIllIlI = llllllllllllllllIlIIlllIllIlllIl.bX();
        if (bk.lIIllIIIIlllll(llllllllllllllllIlIIlllIllIllIlI)) {
            List<TileObject> llllllllllllllllIlIIlllIllIllIIl = llllllllllllllllIlIIlllIllIlllIl.bM();
            llllllllllllllllIlIIlllIllIllIlI = llllllllllllllllIlIIlllIllIlllII.getWorldArea().offset(lIlllIIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl2;
                if (bk.lIIllIIIlIIIlI(this.bO().getWorldLocation().distanceTo(worldPoint), lIlllIIIIlI[7])) {
                    bl2 = lIlllIIIIlI[3];
                    "".length();
                    if (" ".length() <= 0) {
                        return ((0xC8 ^ 0xA9 ^ (0xF3 ^ 0xAD)) & (0xAD ^ 0xB9 ^ (0x77 ^ 0x5C) ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = lIlllIIIIlI[0];
                }
                return bl2;
            }).filter(worldPoint -> llllllllllllllllIlIIlllIllIllIIl.stream().noneMatch(tileObject -> tileObject.getWorldLocation().toWorldArea().isInMeleeDistance(worldPoint))).filter(Reachable::isWalkable).max(Comparator.comparingInt(llllllllllllllllIlIIlllIllIlllIl::v)).orElse(null);
        }
        if (bk.lIIllIIIIlllll(llllllllllllllllIlIIlllIllIllIlI)) {
            return lIlllIIIIlI[0];
        }
        Movement.setDestination((WorldPoint)var3_3);
        this.fc += lIlllIIIIlI[3];
        return lIlllIIIIlI[3];
    }

    private static boolean lIIllIIIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected bk(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.ATTACK);
        this.fc = lIlllIIIIlI[0];
    }

    private static boolean lIIllIIIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIIIlIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIIIlIIIII(int n2, int n3) {
        return n2 == n3;
    }
}

