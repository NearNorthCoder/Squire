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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.thieving.tasks.GameEnum19;
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

    private static boolean lIllIIlIIIlIIII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    private Map<WorldPoint, List<Transport>> E() {
        HashMap<WorldPoint, List<Transport>> hashMap = new HashMap<WorldPoint, List<Transport>>();
        String[] stringArray = new String[lIIlllIIIIIII[2]];
        stringArray[o.lIIlllIIIIIII[0]] = lIIllIlllllll[lIIlllIIIIIII[13]];
        List list = TileObjects.getAll((String[])stringArray);
        Iterator var1 = list.iterator();
        while (o.lIllIIlIIIlIIlI(var1.hasNext() ? 1 : 0)) {
            void var2;
            o var3;
            TileObject var4 = (TileObject)var1.next();
            Transport var5 = var3.b(var4);
            var2.put(var4.getWorldLocation(), Collections.singletonList(var5));

            if (-1 < 1) continue;
            return null;
        }
        return hashMap;
    }

    private static boolean lIllIIlIIIlIlII(Object object) {
        return object != null;
    }

        return String.valueOf(var6);
    }

    private static boolean lIllIIlIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private Transport b(TileObject tileObject) {
        return new Transport(tileObject.getWorldLocation(), tileObject.getWorldLocation().dy(lIIlllIIIIIII[2]), lIIlllIIIIIII[2], lIIlllIIIIIII[2], (Runnable)new ThievingManager(this, tileObject));
    }

    private static boolean lIllIIlIIIlIlIl(Object object) {
        return object == null;
    }

    private static int lIllIIlIIIllIlI(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 < f3 ? -1 : 1);
    }

    private static void lIllIIlIIIIlllI() {
        lIIllIlllllll = new String[lIIlllIIIIIII[14]];
        o.lIIllIlllllll[o.lIIlllIIIIIII[0]] = "Lure";
        o.lIIllIlllllll[o.lIIlllIIIIIII[2]] = "Unable to build path";
        o.lIIllIlllllll[o.lIIlllIIIIIII[3]] = "Curtain";
        o.lIIllIlllllll[o.lIIlllIIIIIII[4]] = "Open";
        o.lIIllIlllllll[o.lIIlllIIIIIII[5]] = "Open";
        o.lIIllIlllllll[o.lIIlllIIIIIII[8]] = "Going to anchor point";
        o.lIIllIlllllll[o.lIIlllIIIIIII[10]] = "Curtain";
        o.lIIllIlllllll[o.lIIlllIIIIIII[11]] = "Close";
        o.lIIllIlllllll[o.lIIlllIIIIIII[12]] = "Close";
        o.lIIllIlllllll[o.lIIlllIIIIIII[13]] = "Curtain";
    }

    private static boolean lIllIIlIIIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        o.lIllIIlIIIIllll();
        o.lIllIIlIIIIlllI();
        Q = LoggerFactory.getLogger(LuringNewTargetTask.class);
    }

    public boolean run() {
        TileObject var7;
        NPC var8;
        Player var9;
        c var10;
        o var11;
        block37: {
            if (o.lIllIIlIIIlIIII((Object)this.R.method(), (Object)b.BLACK_JACK)) {
                return lIIlllIIIIIII[0];
            }
            if (!o.lIllIIlIIIlIIII(Game.getState(), GameState.HOPPING) || o.lIllIIlIIIlIIIl(Game.getState(), GameState.LOADING)) {
                var11.U = new ArrayList<WorldPoint>();
                var11.V = null;
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIlI(var11.S.i() ? 1 : 0)) {
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIll(var11.S.e(), lIIlllIIIIIII[1]) && o.lIllIIlIIIlIIll(Worlds.getCurrentId(), var11.S.e())) {
                return lIIlllIIIIIII[0];
            }
            var10 = var11.S.b().t();
            NPC var12 = var11.S.b().b(var10);
            var9 = Players.getLocal();
            if (o.lIllIIlIIIlIlII(var12)) {
                if (o.lIllIIlIIIlIIlI(var10.p().contains((Locatable)var9) ? 1 : 0)) {
                    return var11.S.a(var9, lIIlllIIIIIII[0]);
                }
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIlI(var10.p().contains((Locatable)var9) ? 1 : 0) && o.lIllIIlIIIlIIlI(var11.S.a(var9, lIIlllIIIIIII[2]) ? 1 : 0)) {
                return lIIlllIIIIIII[2];
            }
            var8 = var11.S.b().a(nPC -> {
                int n2;
                if (o.lIllIIlIIIlIIlI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0) && o.lIllIIlIIIllIll(o.lIllIIlIIIllIlI(var10.p().getCenter().distanceToHypotenuse(nPC.getWorldLocation()), 14.0f))) {
                    n2 = lIIlllIIIIIII[2];

                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    n2 = lIIlllIIIIIII[0];
                }
                return n2 != 0;
            });
            if (o.lIllIIlIIIlIlIl(var8)) {
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIlI(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIIlllIIIIIII[2];
            }
            List var13 = NPCs.getAll(nPC -> {
                int n2;
                if (o.lIllIIlIIIlIlII(nPC) && o.lIllIIlIIIlIIIl(nPC.getInteracting(), var9)) {
                    n2 = lIIlllIIIIIII[2];

                    if (3 >= (0xCA ^ 0x9F ^ (0x14 ^ 0x45))) {
                        return ((44 + 127 - 39 + 7 ^ 145 + 52 - 80 + 75) & (0x64 ^ 0x42 ^ (0xC1 ^ 0xAC) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlllIIIIIII[0];
                }
                return n2 != 0;
            });
            if (o.lIllIIlIIIlIIlI(var13.isEmpty() ? 1 : 0) && o.lIllIIlIIIlIIlI(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
                if (o.lIllIIlIIIlIllI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                var11.U = new ArrayList<WorldPoint>();
                var8.interact(lIIllIlllllll[lIIlllIIIIIII[0]]);
                return lIIlllIIIIIII[2];
            }
            if (o.lIllIIlIIIlIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            if (o.lIllIIlIIIlIIlI(var11.U.isEmpty() ? 1 : 0) && o.lIllIIlIIIlIlIl(var11.V)) {
                WorldPoint worldPoint;
                int n2;
                List<WorldPoint> var14 = Collections.singletonList(var9.getWorldLocation());
                if (!o.lIllIIlIIIlIllI(var8.getWorldLocation().equals((Object)var10.r()) ? 1 : 0) || !o.lIllIIlIIIlIllI(var9.getWorldLocation().equals((Object)var10.r()) ? 1 : 0) || o.lIllIIlIIIlIIlI(var10.p().contains((Locatable)var9) ? 1 : 0)) {
                    n2 = lIIlllIIIIIII[2];

                    if ((0x40 ^ 0x6B ^ (0x99 ^ 0xB6)) <= 1) {
                        return ((0xDB ^ 0xB0 ^ (0x56 ^ 0x23)) & (0x33 ^ 0x63 ^ (0x22 ^ 0x6C) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlllIIIIIII[0];
                }
                int var15 = n2;
                LocalCollisionMap var16 = new LocalCollisionMap((GlobalCollisionMap)Static.getGlobalCollisionMap(), lIIlllIIIIIII[0]);
                ExecutorService executorService = var11.T;
                Map<WorldPoint, List<Transport>> map = var11.E();
                if (o.lIllIIlIIIlIIlI(var15)) {
                    worldPoint = var10.r();

                    }
                } else {
                    worldPoint = var10.p().getCenter();
                }
                var11.V = executorService.submit(new Pathfinder((CollisionMap)var16, map, var14, worldPoint, lIIlllIIIIIII[2]));
                return lIIlllIIIIIII[2];
            }
            if (!o.lIllIIlIIIlIlII(var11.V)) break block37;
            if (o.lIllIIlIIIlIllI(var11.V.isDone() ? 1 : 0) && o.lIllIIlIIIlIllI(var11.V.isCancelled() ? 1 : 0)) {
                return lIIlllIIIIIII[2];
            }
            try {
                List<WorldPoint> var14 = var11.V.get();
                if (o.lIllIIlIIIlIlII(var14)) {
                    var11.U = var14;
                    Static.getEventBus().post((Object)new PathBuilt(var11.U));
                }

            }
            catch (InterruptedException | ExecutionException var14) {
                Q.debug(lIIllIlllllll[lIIlllIIIIIII[2]]);
            }
            if (((0x1A ^ 5 ^ (0x58 ^ 0x65)) & (0x57 ^ 0x37 ^ (0xED ^ 0xAF) ^ -1)) != 0) {
                return ((0x3C ^ 0x21 ^ (0x52 ^ 0x12)) & (0x13 ^ 0x52 ^ (0x9B ^ 0x87) ^ -1)) != 0;
            }
            var11.V = null;
            return lIIlllIIIIIII[0];
        }
        if (o.lIllIIlIIIlIIlI(var8.getWorldLocation().equals((Object)var10.q()) ? 1 : 0) && o.lIllIIlIIIlIIlI(var10.p().contains((Locatable)var9) ? 1 : 0)) {
            return var11.D();
        }
        int var14 = var11.U.indexOf(var9.getWorldLocation());
        if (o.lIllIIlIIIlIlll(var14, lIIlllIIIIIII[1])) {
            var11.U = new ArrayList<WorldPoint>();
            return lIIlllIIIIIII[2];
        }
        WorldPoint var15 = var11.U.get(var14);
        int var16 = lIIlllIIIIIII[0];
        int var17 = lIIlllIIIIIII[0];
        int llllllllllllllIlllIllIllIIIIlIll2 = var14;
        while (o.lIllIIlIIIllIII(llllllllllllllIlllIllIllIIIIlIll2, var11.U.size())) {
            String[] stringArray = new String[lIIlllIIIIIII[2]];
            stringArray[o.lIIlllIIIIIII[0]] = lIIllIlllllll[lIIlllIIIIIII[3]];
            var7 = TileObjects.getFirstAt((WorldPoint)var11.U.get(llllllllllllllIlllIllIllIIIIlIll2), (String[])stringArray);
            if (o.lIllIIlIIIlIlII(var7) && o.lIllIIlIIIlIIlI(var7.hasAction(lIIllIlllllll[lIIlllIIIIIII[4]]::equals) ? 1 : 0)) {
                var7.interact(lIIllIlllllll[lIIlllIIIIIII[5]]);
                return lIIlllIIIIIII[2];
            }
            WorldPoint var18 = var11.U.get(llllllllllllllIlllIllIllIIIIlIll2);
            if (!o.lIllIIlIIIlIIlI(var16 += Math.abs(var15.getX() - var18.getX())) || o.lIllIIlIIIlIllI(var17 += Math.abs(var15.getY() - var18.getY()))) {
                var15 = var18;

                }
            } else {
                if (!o.lIllIIlIIIlIlll(var16, var17)) break;
                var15 = var18;

                if (1 >= 0) break;
                return ((1 ^ (0xF ^ 0x4B)) & (0x3B ^ 0x1E ^ (0xCC ^ 0xAC) ^ -1)) != 0;
            }
            ++llllllllllllllIlllIllIllIIIIlIll2;

            return false;
        }
        if (o.lIllIIlIIIllIIl(var8.distanceTo((Locatable)var9), lIIlllIIIIIII[2]) && o.lIllIIlIIIlIlII(llllllllllllllIlllIllIllIIIIlIll2 = var11.S.a(var11.S.b().t(), lIIlllIIIIIII[2]))) {
            return var11.S.a(var9, lIIlllIIIIIII[2]);
        }
        if (o.lIllIIlIIIlIIlI(var8.getWorldLocation().equals((Object)new WorldPoint(lIIlllIIIIIII[6], lIIlllIIIIIII[7], lIIlllIIIIIII[0])) ? 1 : 0)) {
            System.out.println(lIIllIlllllll[lIIlllIIIIIII[8]]);
            WorldPoint llllllllllllllIlllIllIllIIIIlIll2 = var11.S.b().t().r();
            if (o.lIllIIlIIIlIllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIlllIllIllIIIIlIll2) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)llllllllllllllIlllIllIllIIIIlIll2);
                return lIIlllIIIIIII[2];
            }
        }
        if (o.lIllIIlIIIlIIlI(var15.isInScene(Static.getClient()) ? 1 : 0)) {
            WorldPoint llllllllllllllIlllIllIllIIIIlIll2 = var11.S.b().t().r();
            if (o.lIllIIlIIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIlllIllIllIIIIlIll2) ? 1 : 0)) {
                if (o.lIllIIlIIIlIIlI(var11.S.a(var9, lIIlllIIIIIII[2]) ? 1 : 0)) {
                    return lIIlllIIIIIII[2];
                }
                Movement.setDestination((WorldPoint)new WorldPoint(lIIlllIIIIIII[9], lIIlllIIIIIII[7], lIIlllIIIIIII[0]));
            }
            var7 = ScenePoint.fromWorld((WorldPoint)var15);
            Movement.setDestination((int)var7.getX(), (int)var7.getY());
            return lIIlllIIIIIII[2];
        }
        this.U = new ArrayList<WorldPoint>();
        return lIIlllIIIIIII[0];
    }

    private static boolean lIllIIlIIIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIlIIIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIlIIIllIll(int n2) {
        return n2 <= 0;
    }

    private static boolean lIllIIlIIIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    private boolean D() {
        if (o.lIllIIlIIIlIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        String[] stringArray = new String[lIIlllIIIIIII[2]];
        stringArray[o.lIIlllIIIIIII[0]] = lIIllIlllllll[lIIlllIIIIIII[10]];
        TileObject var19 = TileObjects.getNearest((String[])stringArray);
        if (o.lIllIIlIIIlIlII(var19) && o.lIllIIlIIIlIIlI(var19.hasAction(lIIllIlllllll[lIIlllIIIIIII[11]]::equals) ? 1 : 0)) {
            var19.interact(lIIllIlllllll[lIIlllIIIIIII[12]]);
            return lIIlllIIIIIII[2];
        }
        return lIIlllIIIIIII[0];
    }

    private static boolean lIllIIlIIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIIIllIIl(int n2, int n3) {
        return n2 > n3;
    }
}

