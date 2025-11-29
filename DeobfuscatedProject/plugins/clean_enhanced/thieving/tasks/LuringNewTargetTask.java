/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.unethicalite.regions.PathBuilt
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.CollisionMap
 *  net.unethicalite.api.movement.pathfinder.GlobalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.LocalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.Pathfinder
 *  net.unethicalite.api.movement.pathfinder.model.Transport
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.unethicalite.regions.PathBuilt;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GameEnum2;
import gg.squire.thieving.tasks.ThievingManager;

@TaskDesc(name="Luring new target", priority=3, blocking=true)
public class LuringNewTargetTask
extends Task {
    private final  SquireThievingConfig R;
    private final  SquireThieving S;

    private  List<WorldPoint> U;
    private final  ExecutorService T;
    private static final  Logger Q;
    private  Future<List<WorldPoint>> V;

    @Inject
    public LuringNewTargetTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving, ExecutorService executorService) {
        this.U = new ArrayList<WorldPoint>();
        this.R = squireThievingConfig;
        this.S = squireThieving;
        this.T = executorService;
    }

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    private Map<WorldPoint, List<Transport>> E() {
        HashMap<WorldPoint, List<Transport>> hashMap = new HashMap<WorldPoint, List<Transport>>();
        String[] stringArray = new String[var1[2]];
        stringArray[o.var1[0]] = var2[var1[13]];
        List list = TileObjects.getAll((String[])stringArray);
        Iterator var4 = list.iterator();
        while (o.var5(var4.hasNext() ? 1 : 0)) {
            void var6;
            o var7;
            TileObject var8 = (TileObject)var4.next();
            Transport var9 = var7.b(var8);
            var6.put(var8.getWorldLocation(), Collections.singletonList(var9));
            0;
            0;
            if (-1 < 1) continue;
            return null;
        }
        return hashMap;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (o.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private Transport b(TileObject tileObject) {
        return new Transport(tileObject.getWorldLocation(), tileObject.getWorldLocation().dy(var1[2]), var1[2], var1[2], (Runnable)new ThievingManager(this, tileObject));
    }

    private static boolean var34(Object object) {
        return object == null;
    }

    private static int var35(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 < f3 ? -1 : 1);
    }

    private static void var36() {
        var1 = new int[15];
        o.var1[0] = (0x13 ^ 0x3A ^ (0x6C ^ 3)) & (3 ^ 0x73 ^ (0x69 ^ 0x5F) ^ -1);
        o.var1[1] = -1;
        o.var1[2] = 1;
        o.var1[3] = 2;
        o.var1[4] = 3;
        o.var1[5] = 106 + 32 - -16 + 8 ^ 157 + 42 - 35 + 2;
        o.var1[6] = 0xFFFFCF97 & 0x3D79;
        o.var1[7] = 0xFFFF9F8B & 0x6BFE;
        o.var1[8] = 68 + 24 - -58 + 4 ^ 29 + 8 - 10 + 132;
        o.var1[9] = 0xFFFF9FEE & 0x6D1D;
        o.var1[10] = 0x52 ^ 0x54;
        o.var1[11] = 34 + 79 - 43 + 96 ^ 80 + 57 - -7 + 17;
        o.var1[12] = 67 + 37 - 51 + 118 ^ 17 + 34 - 28 + 140;
        o.var1[13] = 0x74 ^ 0x51 ^ (0x78 ^ 0x54);
        o.var1[14] = 0x1B ^ 0x11;
    }

    private static void var37() {
        var2 = new String[var1[14]];
        o.var2[o.var1[0]] = "Lure";
        o.var2[o.var1[2]] = "Unable to build path";
        o.var2[o.var1[3]] = "Curtain";
        o.var2[o.var1[4]] = "Open";
        o.var2[o.var1[5]] = "Open";
        o.var2[o.var1[8]] = "Going to anchor point";
        o.var2[o.var1[10]] = "Curtain";
        o.var2[o.var1[11]] = "Close";
        o.var2[o.var1[12]] = "Close";
        o.var2[o.var1[13]] = "Curtain";
    }

    private static boolean var38(int n2, int n3) {
        return n2 != n3;
    }

    static {
        o.var36();
        o.var37();
        Q = LoggerFactory.getLogger(LuringNewTargetTask.class);
    }

    public boolean run() {
        TileObject var39;
        NPC var40;
        Player var41;
        c var42;
        o var43;
        block37: {
            if (o.var3((Object)this.R.method(), (Object)b.BLACK_JACK)) {
                return var1[0];
            }
            if (!o.var3(Game.getState(), GameState.HOPPING) || o.var44(Game.getState(), GameState.LOADING)) {
                var43.U = new ArrayList<WorldPoint>();
                var43.V = null;
                return var1[0];
            }
            if (o.var5(var43.S.i() ? 1 : 0)) {
                return var1[0];
            }
            if (o.var38(var43.S.e(), var1[1]) && o.var38(Worlds.getCurrentId(), var43.S.e())) {
                return var1[0];
            }
            var42 = var43.S.b().t();
            NPC var45 = var43.S.b().b(var42);
            var41 = Players.getLocal();
            if (o.var10(var45)) {
                if (o.var5(var42.p().contains((Locatable)var41) ? 1 : 0)) {
                    return var43.S.a(var41, var1[0]);
                }
                return var1[0];
            }
            if (o.var5(var42.p().contains((Locatable)var41) ? 1 : 0) && o.var5(var43.S.a(var41, var1[2]) ? 1 : 0)) {
                return var1[2];
            }
            var40 = var43.S.b().a(nPC -> {
                int n2;
                if (o.var5(Reachable.isInteractable((Locatable)nPC) ? 1 : 0) && o.var46(o.var35(var42.p().getCenter().distanceToHypotenuse(nPC.getWorldLocation()), 14.0f))) {
                    n2 = var1[2];
                    0;
                    if (2 <= 0) {
                        return ((1 ^ 5) & ~(0xBD ^ 0xB9)) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                return n2 != 0;
            });
            if (o.var34(var40)) {
                return var1[0];
            }
            if (o.var5(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return var1[2];
            }
            List var47 = NPCs.getAll(nPC -> {
                int n2;
                if (o.var10(nPC) && o.var44(nPC.getInteracting(), var41)) {
                    n2 = var1[2];
                    0;
                    if (3 >= (0xCA ^ 0x9F ^ (0x14 ^ 0x45))) {
                        return ((44 + 127 - 39 + 7 ^ 145 + 52 - 80 + 75) & (0x64 ^ 0x42 ^ (0xC1 ^ 0xAC) ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                return n2 != 0;
            });
            if (o.var5(var47.isEmpty() ? 1 : 0) && o.var5(Reachable.isInteractable((Locatable)var40) ? 1 : 0)) {
                if (o.var48(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                var43.U = new ArrayList<WorldPoint>();
                var40.interact(var2[var1[0]]);
                return var1[2];
            }
            if (o.var5(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            if (o.var5(var43.U.isEmpty() ? 1 : 0) && o.var34(var43.V)) {
                WorldPoint worldPoint;
                int n2;
                List<WorldPoint> var49 = Collections.singletonList(var41.getWorldLocation());
                if (!o.var48(var40.getWorldLocation().equals((Object)var42.r()) ? 1 : 0) || !o.var48(var41.getWorldLocation().equals((Object)var42.r()) ? 1 : 0) || o.var5(var42.p().contains((Locatable)var41) ? 1 : 0)) {
                    n2 = var1[2];
                    0;
                    if ((0x40 ^ 0x6B ^ (0x99 ^ 0xB6)) <= 1) {
                        return ((0xDB ^ 0xB0 ^ (0x56 ^ 0x23)) & (0x33 ^ 0x63 ^ (0x22 ^ 0x6C) ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                int var50 = n2;
                LocalCollisionMap var51 = new LocalCollisionMap((GlobalCollisionMap)Static.getGlobalCollisionMap(), var1[0]);
                ExecutorService executorService = var43.T;
                Map<WorldPoint, List<Transport>> map = var43.E();
                if (o.var5(var50)) {
                    worldPoint = var42.r();
                    0;
                    if null != null {
                        return ((0x48 ^ 0x73 ^ (0x1C ^ 0x29)) & (42 + 134 - 56 + 29 ^ 54 + 134 - 169 + 136 ^ -1)) != 0;
                    }
                } else {
                    worldPoint = var42.p().getCenter();
                }
                var43.V = executorService.submit(new Pathfinder((CollisionMap)var51, map, var49, worldPoint, var1[2]));
                return var1[2];
            }
            if (!o.var10(var43.V)) break block37;
            if (o.var48(var43.V.isDone() ? 1 : 0) && o.var48(var43.V.isCancelled() ? 1 : 0)) {
                return var1[2];
            }
            try {
                List<WorldPoint> var49 = var43.V.get();
                if (o.var10(var49)) {
                    var43.U = var49;
                    Static.getEventBus().post((Object)new PathBuilt(var43.U));
                }
                0;
            }
            catch (InterruptedException | ExecutionException var49) {
                Q.debug(var2[var1[2]]);
            }
            if (((0x1A ^ 5 ^ (0x58 ^ 0x65)) & (0x57 ^ 0x37 ^ (0xED ^ 0xAF) ^ -1)) != 0) {
                return ((0x3C ^ 0x21 ^ (0x52 ^ 0x12)) & (0x13 ^ 0x52 ^ (0x9B ^ 0x87) ^ -1)) != 0;
            }
            var43.V = null;
            return var1[0];
        }
        if (o.var5(var40.getWorldLocation().equals((Object)var42.q()) ? 1 : 0) && o.var5(var42.p().contains((Locatable)var41) ? 1 : 0)) {
            return var43.D();
        }
        int var49 = var43.U.indexOf(var41.getWorldLocation());
        if (o.var52(var49, var1[1])) {
            var43.U = new ArrayList<WorldPoint>();
            return var1[2];
        }
        WorldPoint var50 = var43.U.get(var49);
        int var51 = var1[0];
        int var53 = var1[0];
        int llllllllllllllIlllIllIllIIIIlIll2 = var49;
        while (o.var20(llllllllllllllIlllIllIllIIIIlIll2, var43.U.size())) {
            String[] stringArray = new String[var1[2]];
            stringArray[o.var1[0]] = var2[var1[3]];
            var39 = TileObjects.getFirstAt((WorldPoint)var43.U.get(llllllllllllllIlllIllIllIIIIlIll2), (String[])stringArray);
            if (o.var10(var39) && o.var5(var39.hasAction(var2[var1[4]]::equals) ? 1 : 0)) {
                var39.interact(var2[var1[5]]);
                return var1[2];
            }
            WorldPoint var54 = var43.U.get(llllllllllllllIlllIllIllIIIIlIll2);
            if (!o.var5(var51 += Math.abs(var50.getX() - var54.getX())) || o.var48(var53 += Math.abs(var50.getY() - var54.getY()))) {
                var50 = var54;
                0;
                if null != null {
                    return ((0x38 ^ 0x30) & ~(0x1E ^ 0x16)) != 0;
                }
            } else {
                if (!o.var52(var51, var53)) break;
                var50 = var54;
                0;
                if (1 >= 0) break;
                return ((1 ^ (0xF ^ 0x4B)) & (0x3B ^ 0x1E ^ (0xCC ^ 0xAC) ^ -1)) != 0;
            }
            ++llllllllllllllIlllIllIllIIIIlIll2;
            0;
            if null == null continue;
            return ((0x20 ^ 0x6E) & ~(3 ^ 0x4D)) != 0;
        }
        if (o.var55(var40.distanceTo((Locatable)var41), var1[2]) && o.var10(llllllllllllllIlllIllIllIIIIlIll2 = var43.S.a(var43.S.b().t(), var1[2]))) {
            return var43.S.a(var41, var1[2]);
        }
        if (o.var5(var40.getWorldLocation().equals((Object)new WorldPoint(var1[6], var1[7], var1[0])) ? 1 : 0)) {
            System.out.println(var2[var1[8]]);
            WorldPoint llllllllllllllIlllIllIllIIIIlIll2 = var43.S.b().t().r();
            if (o.var48(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIlllIllIllIIIIlIll2) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)llllllllllllllIlllIllIllIIIIlIll2);
                return var1[2];
            }
        }
        if (o.var5(var50.isInScene(Static.getClient()) ? 1 : 0)) {
            WorldPoint llllllllllllllIlllIllIllIIIIlIll2 = var43.S.b().t().r();
            if (o.var5(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIlllIllIllIIIIlIll2) ? 1 : 0)) {
                if (o.var5(var43.S.a(var41, var1[2]) ? 1 : 0)) {
                    return var1[2];
                }
                Movement.setDestination((WorldPoint)new WorldPoint(var1[9], var1[7], var1[0]));
            }
            var39 = ScenePoint.fromWorld((WorldPoint)var50);
            Movement.setDestination((int)var39.getX(), (int)var39.getY());
            return var1[2];
        }
        this.U = new ArrayList<WorldPoint>();
        return var1[0];
    }

    private static boolean var52(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var46(int n2) {
        return n2 <= 0;
    }

    private static boolean var44(Object object, Object object2) {
        return object == object2;
    }

    private boolean D() {
        if (o.var48(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        String[] stringArray = new String[var1[2]];
        stringArray[o.var1[0]] = var2[var1[10]];
        TileObject var56 = TileObjects.getNearest((String[])stringArray);
        if (o.var10(var56) && o.var5(var56.hasAction(var2[var1[11]]::equals) ? 1 : 0)) {
            var56.interact(var2[var1[12]]);
            return var1[2];
        }
        return var1[0];
    }

    private static boolean var48(int n2) {
        return n2 == 0;
    }

    private static boolean var55(int n2, int n3) {
        return n2 > n3;
    }
}

