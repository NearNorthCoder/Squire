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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum16;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Moving away from all dung", priority=40, blocking=true, register=true)
public class MovingAwayFromAllDungTask
extends AutotoaManager {
    private  int fc;
    
    private static final  int fb;
    private static final  int fa;
    private  int fd;

    static {
        bk.var2();
        fa = var1[2];
        fb = var1[1];
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    @Override
    public void r() {
        this.fc = var1[0];
    }

    /*
     * WARNING - void declaration
     */
    private int v(WorldPoint worldPoint) {
        void var4_4;
        void var4;
        void var5;
        void var6;
        NPC nPC = this.bO();
        TileObject tileObject2 = TileObjects.getNearest((WorldPoint)worldPoint, tileObject -> {
            int n2;
            if (bk.var7(tileObject.getId(), var1[6]) && bk.var8(nPC.getWorldArea().isInMeleeDistance(tileObject.getWorldLocation()) ? 1 : 0)) {
                n2 = var1[3];
                0;
                
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (bk.var3(tileObject2)) {
            return var1[5];
        }
        TileObject var9 = TileObjects.getNearest((WorldPoint)var6, arg_0 -> bk.a((NPC)var5, (TileObject)var4, arg_0));
        if (bk.var3(var9)) {
            return var6.distanceTo(var4.getWorldLocation());
        }
        return worldPoint.distanceTo(tileObject2.getWorldLocation()) + worldPoint.distanceTo(var4_4.getWorldLocation());
    }

    private static void var2() {
        var1 = new int[8];
        bk.var1[0] = (0x3D ^ 0x6C) & ~(0x60 ^ 0x31);
        bk.var1[1] = 0xFFFFA76F & 0x7DFA;
        bk.var1[2] = 90 + 189 - 160 + 126;
        bk.var1[3] = 1;
        bk.var1[4] = 37 + 116 - 79 + 59 ^ 59 + 51 - -21 + 12;
        bk.var1[5] = 0xFFFFFFFF & Integer.MAX_VALUE;
        bk.var1[6] = -(0xFFFFCFF7 & 0x7C3B) & (0xFFFFFDF3 & 0xFFFE);
        bk.var1[7] = 3;
    }

    private WorldPoint bX() {
        WorldPoint var10;
        int n2 = var1[5];
        Object var2_2 = null;
        Iterator var11 = eN.iterator();
        while (bk.var8(var11.hasNext() ? 1 : 0)) {
            int var12;
            bk var13;
            Point var14 = (Point)var11.next();
            WorldPoint var15 = var13.a(var14);
            WorldPoint var16 = Players.getLocal().getWorldLocation();
            if (bk.var8(var16.equals((Object)var15) ? 1 : 0)) {
                int var17 = eN.indexOf(var14) + var1[3];
                return var13.a((Point)eN.get(var17 % eN.size()));
            }
            if (bk.var18(var16.distanceTo(var15), var12)) {
                var12 = var16.distanceTo(var15);
                var10 = var15;
            }
            0;
            if (((0xBF ^ 0xAF) & ~(0x28 ^ 0x38)) != 3) continue;
            return null;
        }
        if (bk.var3(var10)) {
            return null;
        }
        int n3 = eN.indexOf(var2_2) + var1[3];
        return this.a((Point)eN.get(n3 % eN.size()));
    }

    @Subscribe
    public void b(GameObjectSpawned gameObjectSpawned) {
        if (bk.var7(gameObjectSpawned.getGameObject().getId(), var1[6])) {
            // empty if block
        }
    }

    private static  boolean a(NPC nPC, TileObject tileObject, TileObject tileObject2) {
        int n2;
        if (bk.var7(tileObject2.getId(), var1[6]) && bk.var8(nPC.getWorldArea().isInMeleeDistance(tileObject2.getWorldLocation()) ? 1 : 0) && bk.var19(tileObject2, tileObject)) {
            n2 = var1[3];
            0;
            if (((0x1E ^ 0x2D) & ~(1 ^ 0x32)) <= -1) {
                return ((0xAA ^ 0xBF) & ~(0xAE ^ 0xBB)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var19(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var20(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var3_3;
        void var21;
        bk var22;
        Player player = this.cu.getLocalPlayer();
        if (bk.var3(player)) {
            return var1[0];
        }
        NPC var23 = var22.bO();
        if (bk.var7(var23.getAnimation(), var1[1])) {
            var22.fd = var22.cu.getTickCount();
        }
        if (bk.var20(var21.hasSpotAnim(var1[2]) ? 1 : 0)) {
            var22.fc = var1[0];
            return var1[0];
        }
        bk.f(var1[0]);
        if (bk.var24(var22.cu.getTickCount() - var22.fd, var1[3])) {
            return var1[0];
        }
        WorldPoint var25 = var22.bX();
        if (bk.var3(var25)) {
            List<TileObject> var26 = var22.bM();
            var25 = var21.getWorldArea().offset(var1[4]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl2;
                if (bk.var24(this.bO().getWorldLocation().distanceTo(worldPoint), var1[7])) {
                    bl2 = var1[3];
                    0;
                    if (1 <= 0) {
                        return ((0xC8 ^ 0xA9 ^ (0xF3 ^ 0xAD)) & (0xAD ^ 0xB9 ^ (0x77 ^ 0x5C) ^ -1)) != 0;
                    }
                } else {
                    bl2 = var1[0];
                }
                return bl2;
            }).filter(worldPoint -> var26.stream().noneMatch(tileObject -> tileObject.getWorldLocation().toWorldArea().isInMeleeDistance(worldPoint))).filter(Reachable::isWalkable).max(Comparator.comparingInt(var22::v)).orElse(null);
        }
        if (bk.var3(var25)) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var3_3);
        this.fc += var1[3];
        return var1[3];
    }

    private static boolean var24(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected MovingAwayFromAllDungTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.ATTACK);
        this.fc = var1[0];
    }

    private static boolean var18(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static boolean var7(int n2, int n3) {
        return n2 == n3;
    }
}

