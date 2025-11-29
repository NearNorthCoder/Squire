/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import gg.squire.gauntlet.tasks.GameEnum18;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Attacking Demiboss", priority=3, blocking=true)
public class AttackingDemibossTask
extends GauntletTaskBase {

    private final  b bT;

    private static boolean llllllIIIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIIIlIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static  int a(Player player, l l2) {
        return l2.aW().distanceTo((Locatable)player);
    }

    private static boolean llllllIIIIllIl(Object object) {
        return object == null;
    }

    private static boolean llllllIIIlIIll(Object object) {
        return object != null;
    }

    @Inject
    public AttackingDemibossTask(b b2, c c2) {
        d[] dArray = new d[llIIlIllllII[0]];
        dArray[G.llIIlIllllII[1]] = d.DEMI_BOSS_EXPLORE;
        super(c2, dArray);
        this.bT = b2;
    }

    private static boolean llllllIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static  boolean a(NPC nPC, Player player, l l2) {
        int n2;
        if (G.llllllIIIIllll(l2.aY() ? 1 : 0) && G.llllllIIIlIlII(l2.aW().distanceTo(nPC.getWorldLocation()), nPC.getWorldLocation().distanceTo((Locatable)player))) {
            n2 = llIIlIllllII[0];

            if (3 == 0) {
                return false;
            }
        } else {
            n2 = llIIlIllllII[1];
        }
        return n2 != 0;
    }

    private static void llllllIIIIlIll() {
        llIIlIlllIll = new String[llIIlIllllII[6]];
        G.llIIlIlllIll[G.llIIlIllllII[1]] = "Pathing to target npc, target room is null - {}";
        G.llIIlIlllIll[G.llIIlIllllII[0]] = "Pathing to target npc, target room is found - {}";
        G.llIIlIlllIll[G.llIIlIllllII[3]] = "We're not interacting with anything, attacking npc.";
        G.llIIlIlllIll[G.llIIlIllllII[4]] = "Attack";
        G.llIIlIlllIll[G.llIIlIllllII[5]] = "Pathing to best tile to attack npc.";
    }

    private static boolean llllllIIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        G.llllllIIIIllII();
        G.llllllIIIIlIll();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var1;
        G var2;
        Player player = Players.getLocal();
        if (G.llllllIIIIllIl(player)) {
            return llIIlIllllII[1];
        }
        g var3 = var2.ba.J();
        if (G.llllllIIIIllIl((Object)var3)) {
            return llIIlIllllII[1];
        }
        if (G.llllllIIIIlllI(Inventory.getCount((boolean)llIIlIllllII[0], (int[])var3.an().aB()))) {
            return llIIlIllllII[1];
        }
        NPC var4 = NPCs.getNearest((int[])var3.ah());
        if (G.llllllIIIIllIl(var4) && G.llllllIIIIllIl(var4 = NPCs.getNearest(nPC -> {
            boolean bl;
            if (!G.llllllIIIlIIIl(g.DRAGON.f((NPC)nPC) ? 1 : 0) || G.llllllIIIIllll(g.DARK_BEAST.f((NPC)nPC) ? 1 : 0)) {
                bl = llIIlIllllII[0];

                if (2 == 0) {
                    return false;
                }
            } else {
                bl = llIIlIllllII[1];
            }
            return bl;
        }))) {
            return llIIlIllllII[1];
        }
        if (G.llllllIIIIllll(var4.isDead() ? 1 : 0)) {
            return llIIlIllllII[0];
        }
        if (G.llllllIIIlIIII(var4.distanceTo((Locatable)var1), llIIlIllllII[2])) {
            h var5 = var2.ba.V();
            l var6 = var5.d(var4.getWorldLocation());
            if (G.llllllIIIIllIl(var6)) {
                NPC var7 = var4;
                l var8 = var5.b(arg_0 -> G.a(var7, (Player)var1, arg_0)).stream().min(Comparator.comparingInt(arg_0 -> G.a((Player)var1, arg_0))).orElse(null);
                if (G.llllllIIIIllIl(var8)) {
                    return llIIlIllllII[1];
                }
                Object[] objectArray = new Object[llIIlIllllII[0]];
                objectArray[G.llIIlIllllII[1]] = var4.distanceTo((Locatable)var1);
                Log.info((String)llIIlIlllIll[llIIlIllllII[1]], (Object[])objectArray);
                var2.ba.a(var8, Players.getLocal().getWorldLocation());

                if (-(121 + 73 - 134 + 98 ^ 133 + 135 - 127 + 14) >= 0) {
                    return ((0x38 ^ 5 ^ (0x4E ^ 0x76)) & (84 + 123 - 76 + 18 ^ 3 + 49 - 3 + 95 ^ -1)) != 0;
                }
            } else {
                Object[] objectArray = new Object[llIIlIllllII[0]];
                objectArray[G.llIIlIllllII[1]] = var4.distanceTo((Locatable)var1);
                Log.info((String)llIIlIlllIll[llIIlIllllII[0]], (Object[])objectArray);
                var2.ba.a(var5.d(var4.getWorldLocation()), Players.getLocal().getWorldLocation());

            }
            return llIIlIllllII[0];
        }
        Actor var5 = var1.getInteracting();
        if (G.llllllIIIIllIl(var5) && G.llllllIIIlIIIl(var2.bT.p() ? 1 : 0)) {
            Log.info((String)llIIlIlllIll[llIIlIllllII[3]]);
            var4.interact(llIIlIlllIll[llIIlIllllII[4]]);
            var2.bT.c(llIIlIllllII[5]);
            return llIIlIllllII[0];
        }
        if (G.llllllIIIlIIlI(var5, var4)) {
            l var6 = var2.ba.V().d(var5.getWorldLocation());
            WorldPoint var7 = null;
            int var8 = Integer.MIN_VALUE;
            ScenePoint var9 = var6.aR().toWorldPointList().iterator();
            while (G.llllllIIIIllll(var9.hasNext() ? 1 : 0)) {
                WorldPoint var10 = (WorldPoint)var9.next();
                int var11 = var10.distanceTo(var2.ba.V().aq().aQ());
                if (G.llllllIIIlIIII(var11, var8) && G.llllllIIIlIIIl(Reachable.isObstacle((WorldPoint)var10) ? 1 : 0) && G.llllllIIIIllll(var10.toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), var5.getWorldArea()) ? 1 : 0)) {
                    var8 = var11;
                    var7 = var10;
                }

                if (3 < (75 + 139 - 195 + 157 ^ 44 + 144 - 103 + 95)) continue;
                return ((0x31 ^ 0x2C ^ (0x13 ^ 0x44)) & (105 + 87 - 49 + 0 ^ 81 + 181 - 140 + 75 ^ -1)) != 0;
            }
            if (G.llllllIIIlIIll(var7) && G.llllllIIIlIIII(var1.getWorldLocation().distanceTo(var7), llIIlIllllII[4])) {
                Log.info((String)llIIlIlllIll[llIIlIllllII[5]]);
                var9 = ScenePoint.fromWorld(var7);
                Movement.setDestination((int)var9.getX(), (int)var9.getY());
                var2.bT.e(Rand.nextInt((int)llIIlIllllII[3], (int)llIIlIllllII[5]));
            }
        }
        return llIIlIllllII[0];
    }

    private static boolean llllllIIIIlllI(int n2) {
        return n2 > 0;
    }

        return String.valueOf(var12);
    }
}

