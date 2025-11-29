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
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.p;

/* TASK: Luring new target -> LuringnewtargetTask */
@TaskDesc(name="Luring new target", priority=3, blocking=true)
public class o
extends Task {
    private final /* synthetic */ SquireThievingConfig R;
    private final /* synthetic */ SquireThieving S;
    private static /* synthetic */ int[] lIIlllIIIIIII;
    private static /* synthetic */ String[] lIIllIlllllll;
    private /* synthetic */ List<WorldPoint> U;
    private final /* synthetic */ ExecutorService T;
    private static final /* synthetic */ Logger Q;
    private /* synthetic */ Future<List<WorldPoint>> V;

    @Inject
    public o(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving, ExecutorService executorService) {
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
        Iterator var24 = list.iterator();
        while (o.lIllIIlIIIlIIlI(var24.hasNext() ? 1 : 0)) {
            void var22;
            o var29;
            TileObject var7 = (TileObject)var24.next();
            Transport var23 = var29.b(var7);
            var22.put(var7.getWorldLocation(), Collections.singletonList(var23));
            0;
            0;
            if (-1 < 1) continue;
            return null;
        }
        return hashMap;
    }

    private static boolean lIllIIlIIIlIlII(Object object) {
        return object != null;
    }

    private static String lIllIIlIIIIlIll(String var27, String var14) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var2 = var14.toCharArray();
        int var4 = lIIlllIIIIIII[0];
        char[] var31 = var27.toCharArray();
        int var37 = var31.length;
        int var26 = lIIlllIIIIIII[0];
        while (o.lIllIIlIIIllIII(var26, var37)) {
            char var15 = var31[var26];
            var17.append((char)(var15 ^ var2[var4 % var2.length]));
            0;
            ++var4;
            ++var26;
            0;
            
            return null;
        }
        return String.valueOf(var17);
    }

    private static String lIllIIlIIIIllII(String var12, String var10) {
        try {
            SecretKeySpec var30 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIIII[12]), "DES");
            Cipher var32 = Cipher.getInstance("DES");
            var32.init(lIIlllIIIIIII[3], var30);
            return new String(var32.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String lIllIIlIIIIllIl(String var3, String var21) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIIlllIIIIIII[3], var5);
            return new String(var13.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private Transport b(TileObject tileObject) {
        return new Transport(tileObject.getWorldLocation(), tileObject.getWorldLocation().dy(lIIlllIIIIIII[2]), lIIlllIIIIIII[2], lIIlllIIIIIII[2], (Runnable)new p(this, tileObject));
    }

    private static boolean lIllIIlIIIlIlIl(Object object) {
        return object == null;
    }

    private static int lIllIIlIIIllIlI(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 < f3 ? -1 : 1);
    }

    private static void lIllIIlIIIIllll() {
        lIIlllIIIIIII = new int[15];
        o.lIIlllIIIIIII[0] = (0x13 ^ 0x3A ^ (0x6C ^ 3)) & (3 ^ 0x73 ^ (0x69 ^ 0x5F) ^ -1);
        o.lIIlllIIIIIII[1] = -1;
        o.lIIlllIIIIIII[2] = 1;
        o.lIIlllIIIIIII[3] = 2;
        o.lIIlllIIIIIII[4] = 3;
        o.lIIlllIIIIIII[5] = 106 + 32 - -16 + 8 ^ 157 + 42 - 35 + 2;
        o.lIIlllIIIIIII[6] = 0xFFFFCF97 & 0x3D79;
        o.lIIlllIIIIIII[7] = 0xFFFF9F8B & 0x6BFE;
        o.lIIlllIIIIIII[8] = 68 + 24 - -58 + 4 ^ 29 + 8 - 10 + 132;
        o.lIIlllIIIIIII[9] = 0xFFFF9FEE & 0x6D1D;
        o.lIIlllIIIIIII[10] = 0x52 ^ 0x54;
        o.lIIlllIIIIIII[11] = 34 + 79 - 43 + 96 ^ 80 + 57 - -7 + 17;
        o.lIIlllIIIIIII[12] = 67 + 37 - 51 + 118 ^ 17 + 34 - 28 + 140;
        o.lIIlllIIIIIII[13] = 0x74 ^ 0x51 ^ (0x78 ^ 0x54);
        o.lIIlllIIIIIII[14] = 0x1B ^ 0x11;
    }

    private static void lIllIIlIIIIlllI() {
        lIIllIlllllll = new String[lIIlllIIIIIII[14]];
        o.lIIllIlllllll[o.lIIlllIIIIIII[0]] = o."Lure";
        o.lIIllIlllllll[o.lIIlllIIIIIII[2]] = o."Unable to build path";
        o.lIIllIlllllll[o.lIIlllIIIIIII[3]] = o."Curtain";
        o.lIIllIlllllll[o.lIIlllIIIIIII[4]] = o."Open";
        o.lIIllIlllllll[o.lIIlllIIIIIII[5]] = o."Open";
        o.lIIllIlllllll[o.lIIlllIIIIIII[8]] = o."Going to anchor point";
        o.lIIllIlllllll[o.lIIlllIIIIIII[10]] = o."Curtain";
        o.lIIllIlllllll[o.lIIlllIIIIIII[11]] = o."Close";
        o.lIIllIlllllll[o.lIIlllIIIIIII[12]] = o."Close";
        o.lIIllIlllllll[o.lIIlllIIIIIII[13]] = o."Curtain";
    }

    private static boolean lIllIIlIIIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        o.lIllIIlIIIIllll();
        o.lIllIIlIIIIlllI();
        Q = LoggerFactory.getLogger(o.class);
    }

    public boolean run() {
        TileObject var16;
        NPC var6;
        Player var33;
        c var20;
        o var34;
        block37: {
            if (o.lIllIIlIIIlIIII((Object)this.R.method(), (Object)b.BLACK_JACK)) {
                return lIIlllIIIIIII[0];
            }
            if (!o.lIllIIlIIIlIIII(Game.getState(), GameState.HOPPING) || o.lIllIIlIIIlIIIl(Game.getState(), GameState.LOADING)) {
                var34.U = new ArrayList<WorldPoint>();
                var34.V = null;
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIlI(var34.S.i() ? 1 : 0)) {
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIll(var34.S.e(), lIIlllIIIIIII[1]) && o.lIllIIlIIIlIIll(Worlds.getCurrentId(), var34.S.e())) {
                return lIIlllIIIIIII[0];
            }
            var20 = var34.S.b().t();
            NPC var19 = var34.S.b().b(var20);
            var33 = Players.getLocal();
            if (o.lIllIIlIIIlIlII(var19)) {
                if (o.lIllIIlIIIlIIlI(var20.p().contains((Locatable)var33) ? 1 : 0)) {
                    return var34.S.a(var33, lIIlllIIIIIII[0]);
                }
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIlI(var20.p().contains((Locatable)var33) ? 1 : 0) && o.lIllIIlIIIlIIlI(var34.S.a(var33, lIIlllIIIIIII[2]) ? 1 : 0)) {
                return lIIlllIIIIIII[2];
            }
            var6 = var34.S.b().a(nPC -> {
                int n2;
                if (o.lIllIIlIIIlIIlI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0) && o.lIllIIlIIIllIll(o.lIllIIlIIIllIlI(var20.p().getCenter().distanceToHypotenuse(nPC.getWorldLocation()), 14.0f))) {
                    n2 = lIIlllIIIIIII[2];
                    0;
                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    n2 = lIIlllIIIIIII[0];
                }
                return n2 != 0;
            });
            if (o.lIllIIlIIIlIlIl(var6)) {
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIlI(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIIlllIIIIIII[2];
            }
            List var8 = NPCs.getAll(nPC -> {
                int n2;
                if (o.lIllIIlIIIlIlII(nPC) && o.lIllIIlIIIlIIIl(nPC.getInteracting(), var33)) {
                    n2 = lIIlllIIIIIII[2];
                    0;
                    if (3 >= (0xCA ^ 0x9F ^ (0x14 ^ 0x45))) {
                        return ((44 + 127 - 39 + 7 ^ 145 + 52 - 80 + 75) & (0x64 ^ 0x42 ^ (0xC1 ^ 0xAC) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlllIIIIIII[0];
                }
                return n2 != 0;
            });
            if (o.lIllIIlIIIlIIlI(var8.isEmpty() ? 1 : 0) && o.lIllIIlIIIlIIlI(Reachable.isInteractable((Locatable)var6) ? 1 : 0)) {
                if (o.lIllIIlIIIlIllI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                var34.U = new ArrayList<WorldPoint>();
                var6.interact(lIIllIlllllll[lIIlllIIIIIII[0]]);
                return lIIlllIIIIIII[2];
            }
            if (o.lIllIIlIIIlIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            if (o.lIllIIlIIIlIIlI(var34.U.isEmpty() ? 1 : 0) && o.lIllIIlIIIlIlIl(var34.V)) {
                WorldPoint worldPoint;
                int n2;
                List<WorldPoint> var36 = Collections.singletonList(var33.getWorldLocation());
                if (!o.lIllIIlIIIlIllI(var6.getWorldLocation().equals((Object)var20.r()) ? 1 : 0) || !o.lIllIIlIIIlIllI(var33.getWorldLocation().equals((Object)var20.r()) ? 1 : 0) || o.lIllIIlIIIlIIlI(var20.p().contains((Locatable)var33) ? 1 : 0)) {
                    n2 = lIIlllIIIIIII[2];
                    0;
                    if ((0x40 ^ 0x6B ^ (0x99 ^ 0xB6)) <= 1) {
                        return ((0xDB ^ 0xB0 ^ (0x56 ^ 0x23)) & (0x33 ^ 0x63 ^ (0x22 ^ 0x6C) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlllIIIIIII[0];
                }
                int var1 = n2;
                LocalCollisionMap var9 = new LocalCollisionMap((GlobalCollisionMap)Static.getGlobalCollisionMap(), lIIlllIIIIIII[0]);
                ExecutorService executorService = var34.T;
                Map<WorldPoint, List<Transport>> map = var34.E();
                if (o.lIllIIlIIIlIIlI(var1)) {
                    worldPoint = var20.r();
                    0;
                    
                    }
                } else {
                    worldPoint = var20.p().getCenter();
                }
                var34.V = executorService.submit(new Pathfinder((CollisionMap)var9, map, var36, worldPoint, lIIlllIIIIIII[2]));
                return lIIlllIIIIIII[2];
            }
            if (!o.lIllIIlIIIlIlII(var34.V)) break block37;
            if (o.lIllIIlIIIlIllI(var34.V.isDone() ? 1 : 0) && o.lIllIIlIIIlIllI(var34.V.isCancelled() ? 1 : 0)) {
                return lIIlllIIIIIII[2];
            }
            try {
                List<WorldPoint> var36 = var34.V.get();
                if (o.lIllIIlIIIlIlII(var36)) {
                    var34.U = var36;
                    Static.getEventBus().post((Object)new PathBuilt(var34.U));
                }
                0;
            }
            catch (InterruptedException | ExecutionException var36) {
                Q.debug(lIIllIlllllll[lIIlllIIIIIII[2]]);
            }
            if (((0x1A ^ 5 ^ (0x58 ^ 0x65)) & (0x57 ^ 0x37 ^ (0xED ^ 0xAF) ^ -1)) != 0) {
                return ((0x3C ^ 0x21 ^ (0x52 ^ 0x12)) & (0x13 ^ 0x52 ^ (0x9B ^ 0x87) ^ -1)) != 0;
            }
            var34.V = null;
            return lIIlllIIIIIII[0];
        }
        if (o.lIllIIlIIIlIIlI(var6.getWorldLocation().equals((Object)var20.q()) ? 1 : 0) && o.lIllIIlIIIlIIlI(var20.p().contains((Locatable)var33) ? 1 : 0)) {
            return var34.D();
        }
        int var36 = var34.U.indexOf(var33.getWorldLocation());
        if (o.lIllIIlIIIlIlll(var36, lIIlllIIIIIII[1])) {
            var34.U = new ArrayList<WorldPoint>();
            return lIIlllIIIIIII[2];
        }
        WorldPoint var1 = var34.U.get(var36);
        int var9 = lIIlllIIIIIII[0];
        int var35 = lIIlllIIIIIII[0];
        int llllllllllllllIlllIllIllIIIIlIll2 = var36;
        while (o.lIllIIlIIIllIII(llllllllllllllIlllIllIllIIIIlIll2, var34.U.size())) {
            String[] stringArray = new String[lIIlllIIIIIII[2]];
            stringArray[o.lIIlllIIIIIII[0]] = lIIllIlllllll[lIIlllIIIIIII[3]];
            var16 = TileObjects.getFirstAt((WorldPoint)var34.U.get(llllllllllllllIlllIllIllIIIIlIll2), (String[])stringArray);
            if (o.lIllIIlIIIlIlII(var16) && o.lIllIIlIIIlIIlI(var16.hasAction(lIIllIlllllll[lIIlllIIIIIII[4]]::equals) ? 1 : 0)) {
                var16.interact(lIIllIlllllll[lIIlllIIIIIII[5]]);
                return lIIlllIIIIIII[2];
            }
            WorldPoint var25 = var34.U.get(llllllllllllllIlllIllIllIIIIlIll2);
            if (!o.lIllIIlIIIlIIlI(var9 += Math.abs(var1.getX() - var25.getX())) || o.lIllIIlIIIlIllI(var35 += Math.abs(var1.getY() - var25.getY()))) {
                var1 = var25;
                0;
                
                }
            } else {
                if (!o.lIllIIlIIIlIlll(var9, var35)) break;
                var1 = var25;
                0;
                if (1 >= 0) break;
                return ((1 ^ (0xF ^ 0x4B)) & (0x3B ^ 0x1E ^ (0xCC ^ 0xAC) ^ -1)) != 0;
            }
            ++llllllllllllllIlllIllIllIIIIlIll2;
            0;
            
            return false;
        }
        if (o.lIllIIlIIIllIIl(var6.distanceTo((Locatable)var33), lIIlllIIIIIII[2]) && o.lIllIIlIIIlIlII(llllllllllllllIlllIllIllIIIIlIll2 = var34.S.a(var34.S.b().t(), lIIlllIIIIIII[2]))) {
            return var34.S.a(var33, lIIlllIIIIIII[2]);
        }
        if (o.lIllIIlIIIlIIlI(var6.getWorldLocation().equals((Object)new WorldPoint(lIIlllIIIIIII[6], lIIlllIIIIIII[7], lIIlllIIIIIII[0])) ? 1 : 0)) {
            System.out.println(lIIllIlllllll[lIIlllIIIIIII[8]]);
            WorldPoint llllllllllllllIlllIllIllIIIIlIll2 = var34.S.b().t().r();
            if (o.lIllIIlIIIlIllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIlllIllIllIIIIlIll2) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)llllllllllllllIlllIllIllIIIIlIll2);
                return lIIlllIIIIIII[2];
            }
        }
        if (o.lIllIIlIIIlIIlI(var1.isInScene(Static.getClient()) ? 1 : 0)) {
            WorldPoint llllllllllllllIlllIllIllIIIIlIll2 = var34.S.b().t().r();
            if (o.lIllIIlIIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIlllIllIllIIIIlIll2) ? 1 : 0)) {
                if (o.lIllIIlIIIlIIlI(var34.S.a(var33, lIIlllIIIIIII[2]) ? 1 : 0)) {
                    return lIIlllIIIIIII[2];
                }
                Movement.setDestination((WorldPoint)new WorldPoint(lIIlllIIIIIII[9], lIIlllIIIIIII[7], lIIlllIIIIIII[0]));
            }
            var16 = ScenePoint.fromWorld((WorldPoint)var1);
            Movement.setDestination((int)var16.getX(), (int)var16.getY());
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
        TileObject var18 = TileObjects.getNearest((String[])stringArray);
        if (o.lIllIIlIIIlIlII(var18) && o.lIllIIlIIIlIIlI(var18.hasAction(lIIllIlllllll[lIIlllIIIIIII[11]]::equals) ? 1 : 0)) {
            var18.interact(lIIllIlllllll[lIIlllIIIIIII[12]]);
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

