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
        Iterator llllllllllllllIlllIllIlIllllllIl = list.iterator();
        while (o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIlIllllllIl.hasNext() ? 1 : 0)) {
            void llllllllllllllIlllIllIlIllllllll;
            o llllllllllllllIlllIllIllIIIIIIII;
            TileObject llllllllllllllIlllIllIlIllllllII = (TileObject)llllllllllllllIlllIllIlIllllllIl.next();
            Transport llllllllllllllIlllIllIlIlllllIll = llllllllllllllIlllIllIllIIIIIIII.b(llllllllllllllIlllIllIlIllllllII);
            llllllllllllllIlllIllIlIllllllll.put(llllllllllllllIlllIllIlIllllllII.getWorldLocation(), Collections.singletonList(llllllllllllllIlllIllIlIlllllIll));
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

    private static String lIllIIlIIIIlIll(String llllllllllllllIlllIllIlIlllIIIll, String llllllllllllllIlllIllIlIlllIIlll) {
        llllllllllllllIlllIllIlIlllIIIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIlIlllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIlIlllIIllI = new StringBuilder();
        char[] llllllllllllllIlllIllIlIlllIIlIl = llllllllllllllIlllIllIlIlllIIlll.toCharArray();
        int llllllllllllllIlllIllIlIlllIIlII = lIIlllIIIIIII[0];
        char[] llllllllllllllIlllIllIlIllIllllI = llllllllllllllIlllIllIlIlllIIIll.toCharArray();
        int llllllllllllllIlllIllIlIllIlllIl = llllllllllllllIlllIllIlIllIllllI.length;
        int llllllllllllllIlllIllIlIllIlllII = lIIlllIIIIIII[0];
        while (o.lIllIIlIIIllIII(llllllllllllllIlllIllIlIllIlllII, llllllllllllllIlllIllIlIllIlllIl)) {
            char llllllllllllllIlllIllIlIlllIlIIl = llllllllllllllIlllIllIlIllIllllI[llllllllllllllIlllIllIlIllIlllII];
            llllllllllllllIlllIllIlIlllIIllI.append((char)(llllllllllllllIlllIllIlIlllIlIIl ^ llllllllllllllIlllIllIlIlllIIlIl[llllllllllllllIlllIllIlIlllIIlII % llllllllllllllIlllIllIlIlllIIlIl.length]));
            0;
            ++llllllllllllllIlllIllIlIlllIIlII;
            ++llllllllllllllIlllIllIlIllIlllII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIlIlllIIllI);
    }

    private static String lIllIIlIIIIllII(String llllllllllllllIlllIllIlIllIIIllI, String llllllllllllllIlllIllIlIllIIIIll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIllIIIIll.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIIII[12]), "DES");
            Cipher llllllllllllllIlllIllIlIllIIlIII = Cipher.getInstance("DES");
            llllllllllllllIlllIllIlIllIIlIII.init(lIIlllIIIIIII[3], llllllllllllllIlllIllIlIllIIlIIl);
            return new String(llllllllllllllIlllIllIlIllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIlIllIIIlll) {
            llllllllllllllIlllIllIlIllIIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIllIIlIIIIllIl(String llllllllllllllIlllIllIlIllIlIIIl, String llllllllllllllIlllIllIlIllIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIlIllIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIlIllIlIlIl.init(lIIlllIIIIIII[3], llllllllllllllIlllIllIlIllIlIllI);
            return new String(llllllllllllllIlllIllIlIllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIlIllIlIlII) {
            llllllllllllllIlllIllIlIllIlIlII.printStackTrace();
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
        TileObject llllllllllllllIlllIllIllIIIIlIlI;
        NPC llllllllllllllIlllIllIllIIIlIIIl;
        Player llllllllllllllIlllIllIllIIIlIIlI;
        c llllllllllllllIlllIllIllIIIlIlII;
        o llllllllllllllIlllIllIllIIIlIlIl;
        block37: {
            if (o.lIllIIlIIIlIIII((Object)this.R.method(), (Object)b.BLACK_JACK)) {
                return lIIlllIIIIIII[0];
            }
            if (!o.lIllIIlIIIlIIII(Game.getState(), GameState.HOPPING) || o.lIllIIlIIIlIIIl(Game.getState(), GameState.LOADING)) {
                llllllllllllllIlllIllIllIIIlIlIl.U = new ArrayList<WorldPoint>();
                llllllllllllllIlllIllIllIIIlIlIl.V = null;
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIlIlIl.S.i() ? 1 : 0)) {
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIll(llllllllllllllIlllIllIllIIIlIlIl.S.e(), lIIlllIIIIIII[1]) && o.lIllIIlIIIlIIll(Worlds.getCurrentId(), llllllllllllllIlllIllIllIIIlIlIl.S.e())) {
                return lIIlllIIIIIII[0];
            }
            llllllllllllllIlllIllIllIIIlIlII = llllllllllllllIlllIllIllIIIlIlIl.S.b().t();
            NPC llllllllllllllIlllIllIllIIIlIIll = llllllllllllllIlllIllIllIIIlIlIl.S.b().b(llllllllllllllIlllIllIllIIIlIlII);
            llllllllllllllIlllIllIllIIIlIIlI = Players.getLocal();
            if (o.lIllIIlIIIlIlII(llllllllllllllIlllIllIllIIIlIIll)) {
                if (o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIlIlII.p().contains((Locatable)llllllllllllllIlllIllIllIIIlIIlI) ? 1 : 0)) {
                    return llllllllllllllIlllIllIllIIIlIlIl.S.a(llllllllllllllIlllIllIllIIIlIIlI, lIIlllIIIIIII[0]);
                }
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIlIlII.p().contains((Locatable)llllllllllllllIlllIllIllIIIlIIlI) ? 1 : 0) && o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIlIlIl.S.a(llllllllllllllIlllIllIllIIIlIIlI, lIIlllIIIIIII[2]) ? 1 : 0)) {
                return lIIlllIIIIIII[2];
            }
            llllllllllllllIlllIllIllIIIlIIIl = llllllllllllllIlllIllIllIIIlIlIl.S.b().a(nPC -> {
                int n2;
                if (o.lIllIIlIIIlIIlI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0) && o.lIllIIlIIIllIll(o.lIllIIlIIIllIlI(llllllllllllllIlllIllIllIIIlIlII.p().getCenter().distanceToHypotenuse(nPC.getWorldLocation()), 14.0f))) {
                    n2 = lIIlllIIIIIII[2];
                    0;
                    if (2 <= 0) {
                        return ((1 ^ 5) & ~(0xBD ^ 0xB9)) != 0;
                    }
                } else {
                    n2 = lIIlllIIIIIII[0];
                }
                return n2 != 0;
            });
            if (o.lIllIIlIIIlIlIl(llllllllllllllIlllIllIllIIIlIIIl)) {
                return lIIlllIIIIIII[0];
            }
            if (o.lIllIIlIIIlIIlI(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIIlllIIIIIII[2];
            }
            List llllllllllllllIlllIllIllIIIlIIII = NPCs.getAll(nPC -> {
                int n2;
                if (o.lIllIIlIIIlIlII(nPC) && o.lIllIIlIIIlIIIl(nPC.getInteracting(), llllllllllllllIlllIllIllIIIlIIlI)) {
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
            if (o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIlIIII.isEmpty() ? 1 : 0) && o.lIllIIlIIIlIIlI(Reachable.isInteractable((Locatable)llllllllllllllIlllIllIllIIIlIIIl) ? 1 : 0)) {
                if (o.lIllIIlIIIlIllI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                llllllllllllllIlllIllIllIIIlIlIl.U = new ArrayList<WorldPoint>();
                llllllllllllllIlllIllIllIIIlIIIl.interact(lIIllIlllllll[lIIlllIIIIIII[0]]);
                return lIIlllIIIIIII[2];
            }
            if (o.lIllIIlIIIlIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            if (o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIlIlIl.U.isEmpty() ? 1 : 0) && o.lIllIIlIIIlIlIl(llllllllllllllIlllIllIllIIIlIlIl.V)) {
                WorldPoint worldPoint;
                int n2;
                List<WorldPoint> llllllllllllllIlllIllIllIIIIllll = Collections.singletonList(llllllllllllllIlllIllIllIIIlIIlI.getWorldLocation());
                if (!o.lIllIIlIIIlIllI(llllllllllllllIlllIllIllIIIlIIIl.getWorldLocation().equals((Object)llllllllllllllIlllIllIllIIIlIlII.r()) ? 1 : 0) || !o.lIllIIlIIIlIllI(llllllllllllllIlllIllIllIIIlIIlI.getWorldLocation().equals((Object)llllllllllllllIlllIllIllIIIlIlII.r()) ? 1 : 0) || o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIlIlII.p().contains((Locatable)llllllllllllllIlllIllIllIIIlIIlI) ? 1 : 0)) {
                    n2 = lIIlllIIIIIII[2];
                    0;
                    if ((0x40 ^ 0x6B ^ (0x99 ^ 0xB6)) <= 1) {
                        return ((0xDB ^ 0xB0 ^ (0x56 ^ 0x23)) & (0x33 ^ 0x63 ^ (0x22 ^ 0x6C) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIlllIIIIIII[0];
                }
                int llllllllllllllIlllIllIllIIIIlllI = n2;
                LocalCollisionMap llllllllllllllIlllIllIllIIIIllIl = new LocalCollisionMap((GlobalCollisionMap)Static.getGlobalCollisionMap(), lIIlllIIIIIII[0]);
                ExecutorService executorService = llllllllllllllIlllIllIllIIIlIlIl.T;
                Map<WorldPoint, List<Transport>> map = llllllllllllllIlllIllIllIIIlIlIl.E();
                if (o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIIlllI)) {
                    worldPoint = llllllllllllllIlllIllIllIIIlIlII.r();
                    0;
                    if (null != null) {
                        return ((0x48 ^ 0x73 ^ (0x1C ^ 0x29)) & (42 + 134 - 56 + 29 ^ 54 + 134 - 169 + 136 ^ -1)) != 0;
                    }
                } else {
                    worldPoint = llllllllllllllIlllIllIllIIIlIlII.p().getCenter();
                }
                llllllllllllllIlllIllIllIIIlIlIl.V = executorService.submit(new Pathfinder((CollisionMap)llllllllllllllIlllIllIllIIIIllIl, map, llllllllllllllIlllIllIllIIIIllll, worldPoint, lIIlllIIIIIII[2]));
                return lIIlllIIIIIII[2];
            }
            if (!o.lIllIIlIIIlIlII(llllllllllllllIlllIllIllIIIlIlIl.V)) break block37;
            if (o.lIllIIlIIIlIllI(llllllllllllllIlllIllIllIIIlIlIl.V.isDone() ? 1 : 0) && o.lIllIIlIIIlIllI(llllllllllllllIlllIllIllIIIlIlIl.V.isCancelled() ? 1 : 0)) {
                return lIIlllIIIIIII[2];
            }
            try {
                List<WorldPoint> llllllllllllllIlllIllIllIIIIllll = llllllllllllllIlllIllIllIIIlIlIl.V.get();
                if (o.lIllIIlIIIlIlII(llllllllllllllIlllIllIllIIIIllll)) {
                    llllllllllllllIlllIllIllIIIlIlIl.U = llllllllllllllIlllIllIllIIIIllll;
                    Static.getEventBus().post((Object)new PathBuilt(llllllllllllllIlllIllIllIIIlIlIl.U));
                }
                0;
            }
            catch (InterruptedException | ExecutionException llllllllllllllIlllIllIllIIIIllll) {
                Q.debug(lIIllIlllllll[lIIlllIIIIIII[2]]);
            }
            if (((0x1A ^ 5 ^ (0x58 ^ 0x65)) & (0x57 ^ 0x37 ^ (0xED ^ 0xAF) ^ -1)) != 0) {
                return ((0x3C ^ 0x21 ^ (0x52 ^ 0x12)) & (0x13 ^ 0x52 ^ (0x9B ^ 0x87) ^ -1)) != 0;
            }
            llllllllllllllIlllIllIllIIIlIlIl.V = null;
            return lIIlllIIIIIII[0];
        }
        if (o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIlIIIl.getWorldLocation().equals((Object)llllllllllllllIlllIllIllIIIlIlII.q()) ? 1 : 0) && o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIlIlII.p().contains((Locatable)llllllllllllllIlllIllIllIIIlIIlI) ? 1 : 0)) {
            return llllllllllllllIlllIllIllIIIlIlIl.D();
        }
        int llllllllllllllIlllIllIllIIIIllll = llllllllllllllIlllIllIllIIIlIlIl.U.indexOf(llllllllllllllIlllIllIllIIIlIIlI.getWorldLocation());
        if (o.lIllIIlIIIlIlll(llllllllllllllIlllIllIllIIIIllll, lIIlllIIIIIII[1])) {
            llllllllllllllIlllIllIllIIIlIlIl.U = new ArrayList<WorldPoint>();
            return lIIlllIIIIIII[2];
        }
        WorldPoint llllllllllllllIlllIllIllIIIIlllI = llllllllllllllIlllIllIllIIIlIlIl.U.get(llllllllllllllIlllIllIllIIIIllll);
        int llllllllllllllIlllIllIllIIIIllIl = lIIlllIIIIIII[0];
        int llllllllllllllIlllIllIllIIIIllII = lIIlllIIIIIII[0];
        int llllllllllllllIlllIllIllIIIIlIll2 = llllllllllllllIlllIllIllIIIIllll;
        while (o.lIllIIlIIIllIII(llllllllllllllIlllIllIllIIIIlIll2, llllllllllllllIlllIllIllIIIlIlIl.U.size())) {
            String[] stringArray = new String[lIIlllIIIIIII[2]];
            stringArray[o.lIIlllIIIIIII[0]] = lIIllIlllllll[lIIlllIIIIIII[3]];
            llllllllllllllIlllIllIllIIIIlIlI = TileObjects.getFirstAt((WorldPoint)llllllllllllllIlllIllIllIIIlIlIl.U.get(llllllllllllllIlllIllIllIIIIlIll2), (String[])stringArray);
            if (o.lIllIIlIIIlIlII(llllllllllllllIlllIllIllIIIIlIlI) && o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIIlIlI.hasAction(lIIllIlllllll[lIIlllIIIIIII[4]]::equals) ? 1 : 0)) {
                llllllllllllllIlllIllIllIIIIlIlI.interact(lIIllIlllllll[lIIlllIIIIIII[5]]);
                return lIIlllIIIIIII[2];
            }
            WorldPoint llllllllllllllIlllIllIllIIIIlIIl = llllllllllllllIlllIllIllIIIlIlIl.U.get(llllllllllllllIlllIllIllIIIIlIll2);
            if (!o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIIllIl += Math.abs(llllllllllllllIlllIllIllIIIIlllI.getX() - llllllllllllllIlllIllIllIIIIlIIl.getX())) || o.lIllIIlIIIlIllI(llllllllllllllIlllIllIllIIIIllII += Math.abs(llllllllllllllIlllIllIllIIIIlllI.getY() - llllllllllllllIlllIllIllIIIIlIIl.getY()))) {
                llllllllllllllIlllIllIllIIIIlllI = llllllllllllllIlllIllIllIIIIlIIl;
                0;
                if (null != null) {
                    return ((0x38 ^ 0x30) & ~(0x1E ^ 0x16)) != 0;
                }
            } else {
                if (!o.lIllIIlIIIlIlll(llllllllllllllIlllIllIllIIIIllIl, llllllllllllllIlllIllIllIIIIllII)) break;
                llllllllllllllIlllIllIllIIIIlllI = llllllllllllllIlllIllIllIIIIlIIl;
                0;
                if (1 >= 0) break;
                return ((1 ^ (0xF ^ 0x4B)) & (0x3B ^ 0x1E ^ (0xCC ^ 0xAC) ^ -1)) != 0;
            }
            ++llllllllllllllIlllIllIllIIIIlIll2;
            0;
            if (null == null) continue;
            return ((0x20 ^ 0x6E) & ~(3 ^ 0x4D)) != 0;
        }
        if (o.lIllIIlIIIllIIl(llllllllllllllIlllIllIllIIIlIIIl.distanceTo((Locatable)llllllllllllllIlllIllIllIIIlIIlI), lIIlllIIIIIII[2]) && o.lIllIIlIIIlIlII(llllllllllllllIlllIllIllIIIIlIll2 = llllllllllllllIlllIllIllIIIlIlIl.S.a(llllllllllllllIlllIllIllIIIlIlIl.S.b().t(), lIIlllIIIIIII[2]))) {
            return llllllllllllllIlllIllIllIIIlIlIl.S.a(llllllllllllllIlllIllIllIIIlIIlI, lIIlllIIIIIII[2]);
        }
        if (o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIlIIIl.getWorldLocation().equals((Object)new WorldPoint(lIIlllIIIIIII[6], lIIlllIIIIIII[7], lIIlllIIIIIII[0])) ? 1 : 0)) {
            System.out.println(lIIllIlllllll[lIIlllIIIIIII[8]]);
            WorldPoint llllllllllllllIlllIllIllIIIIlIll2 = llllllllllllllIlllIllIllIIIlIlIl.S.b().t().r();
            if (o.lIllIIlIIIlIllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIlllIllIllIIIIlIll2) ? 1 : 0)) {
                Movement.setDestination((WorldPoint)llllllllllllllIlllIllIllIIIIlIll2);
                return lIIlllIIIIIII[2];
            }
        }
        if (o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIIlllI.isInScene(Static.getClient()) ? 1 : 0)) {
            WorldPoint llllllllllllllIlllIllIllIIIIlIll2 = llllllllllllllIlllIllIllIIIlIlIl.S.b().t().r();
            if (o.lIllIIlIIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllIlllIllIllIIIIlIll2) ? 1 : 0)) {
                if (o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIlIlIl.S.a(llllllllllllllIlllIllIllIIIlIIlI, lIIlllIIIIIII[2]) ? 1 : 0)) {
                    return lIIlllIIIIIII[2];
                }
                Movement.setDestination((WorldPoint)new WorldPoint(lIIlllIIIIIII[9], lIIlllIIIIIII[7], lIIlllIIIIIII[0]));
            }
            llllllllllllllIlllIllIllIIIIlIlI = ScenePoint.fromWorld((WorldPoint)llllllllllllllIlllIllIllIIIIlllI);
            Movement.setDestination((int)llllllllllllllIlllIllIllIIIIlIlI.getX(), (int)llllllllllllllIlllIllIllIIIIlIlI.getY());
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
        TileObject llllllllllllllIlllIllIllIIIIIlll = TileObjects.getNearest((String[])stringArray);
        if (o.lIllIIlIIIlIlII(llllllllllllllIlllIllIllIIIIIlll) && o.lIllIIlIIIlIIlI(llllllllllllllIlllIllIllIIIIIlll.hasAction(lIIllIlllllll[lIIlllIIIIIII[11]]::equals) ? 1 : 0)) {
            llllllllllllllIlllIllIllIIIIIlll.interact(lIIllIlllllll[lIIlllIIIIIII[12]]);
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

