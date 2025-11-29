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
package gg.squire.autotoa.tasks;

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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum118;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Moving away from all dung", priority=40, blocking=true, register=true)
public class MovingAwayFromAllDungTask
extends AutotoaTaskBase {
    private  int fc;
    
    private static final  int fb;
    private static final  int fa;
    private  int fd;

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
        void var1;
        void var2;
        void var3;
        NPC nPC = this.bO();
        TileObject tileObject2 = TileObjects.getNearest((WorldPoint)worldPoint, tileObject -> {
            int n2;
            if (bk.lIIllIIIlIIIII(tileObject.getId(), lIlllIIIIlI[6]) && bk.lIIllIIIlIIIll(nPC.getWorldArea().isInMeleeDistance(tileObject.getWorldLocation()) ? 1 : 0)) {
                n2 = lIlllIIIIlI[3];

                if (3 == 0) {
                    return ((0x49 ^ 4 ^ (0x16 ^ 0x63)) & (0x2A ^ 0x6C ^ (0xE7 ^ 0x99) ^ -1)) != 0;
                }
            } else {
                n2 = lIlllIIIIlI[0];
            }
            return n2 != 0;
        });
        if (bk.lIIllIIIIlllll(tileObject2)) {
            return lIlllIIIIlI[5];
        }
        TileObject var4 = TileObjects.getNearest((WorldPoint)var3, arg_0 -> bk.a((NPC)var2, (TileObject)var1, arg_0));
        if (bk.lIIllIIIIlllll(var4)) {
            return var3.distanceTo(var1.getWorldLocation());
        }
        return worldPoint.distanceTo(tileObject2.getWorldLocation()) + worldPoint.distanceTo(var4_4.getWorldLocation());
    }

    private WorldPoint bX() {
        WorldPoint var5;
        int n2 = lIlllIIIIlI[5];
        Object var2_2 = null;
        Iterator var6 = eN.iterator();
        while (bk.lIIllIIIlIIIll(var6.hasNext() ? 1 : 0)) {
            int var7;
            bk var8;
            Point var9 = (Point)var6.next();
            WorldPoint var10 = var8.a(var9);
            WorldPoint var11 = Players.getLocal().getWorldLocation();
            if (bk.lIIllIIIlIIIll(var11.equals((Object)var10) ? 1 : 0)) {
                int var12 = eN.indexOf(var9) + lIlllIIIIlI[3];
                return var8.a((Point)eN.get(var12 % eN.size()));
            }
            if (bk.lIIllIIIlIIlII(var11.distanceTo(var10), var7)) {
                var7 = var11.distanceTo(var10);
                var5 = var10;
            }

            if (((0xBF ^ 0xAF) & ~(0x28 ^ 0x38)) != 3) continue;
            return null;
        }
        if (bk.lIIllIIIIlllll(var5)) {
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

    private static  boolean a(NPC nPC, TileObject tileObject, TileObject tileObject2) {
        int n2;
        if (bk.lIIllIIIlIIIII(tileObject2.getId(), lIlllIIIIlI[6]) && bk.lIIllIIIlIIIll(nPC.getWorldArea().isInMeleeDistance(tileObject2.getWorldLocation()) ? 1 : 0) && bk.lIIllIIIlIIlIl(tileObject2, tileObject)) {
            n2 = lIlllIIIIlI[3];

            if (((0x1E ^ 0x2D) & ~(1 ^ 0x32)) <= -1) {
                return false;
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
        void var13;
        bk var14;
        Player player = this.cu.getLocalPlayer();
        if (bk.lIIllIIIIlllll(player)) {
            return lIlllIIIIlI[0];
        }
        NPC var15 = var14.bO();
        if (bk.lIIllIIIlIIIII(var15.getAnimation(), lIlllIIIIlI[1])) {
            var14.fd = var14.cu.getTickCount();
        }
        if (bk.lIIllIIIlIIIIl(var13.hasSpotAnim(lIlllIIIIlI[2]) ? 1 : 0)) {
            var14.fc = lIlllIIIIlI[0];
            return lIlllIIIIlI[0];
        }
        bk.f(lIlllIIIIlI[0]);
        if (bk.lIIllIIIlIIIlI(var14.cu.getTickCount() - var14.fd, lIlllIIIIlI[3])) {
            return lIlllIIIIlI[0];
        }
        WorldPoint var16 = var14.bX();
        if (bk.lIIllIIIIlllll(var16)) {
            List<TileObject> var17 = var14.bM();
            var16 = var13.getWorldArea().offset(lIlllIIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl2;
                if (bk.lIIllIIIlIIIlI(this.bO().getWorldLocation().distanceTo(worldPoint), lIlllIIIIlI[7])) {
                    bl2 = lIlllIIIIlI[3];

                    if (1 <= 0) {
                        return ((0xC8 ^ 0xA9 ^ (0xF3 ^ 0xAD)) & (0xAD ^ 0xB9 ^ (0x77 ^ 0x5C) ^ -1)) != 0;
                    }
                } else {
                    bl2 = lIlllIIIIlI[0];
                }
                return bl2;
            }).filter(worldPoint -> var17.stream().noneMatch(tileObject -> tileObject.getWorldLocation().toWorldArea().isInMeleeDistance(worldPoint))).filter(Reachable::isWalkable).max(Comparator.comparingInt(var14::v)).orElse(null);
        }
        if (bk.lIIllIIIIlllll(var16)) {
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
    protected MovingAwayFromAllDungTask(Client client, z z2, TOAConfig tOAConfig) {
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

