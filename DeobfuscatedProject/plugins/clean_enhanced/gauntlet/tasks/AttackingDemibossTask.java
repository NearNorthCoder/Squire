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
import java.util.Comparator;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.GameEnum3;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.LHelper;
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

    private static  int a(Player player, l l2) {
        return l2.aW().distanceTo((Locatable)player);
    }

    @Inject
    public AttackingDemibossTask(b b2, c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.DEMI_BOSS_EXPLORE;
        super(c2, dArray);
        this.bT = b2;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static  boolean a(NPC nPC, Player player, l l2) {
        int n2;
        if ((l2.aY( != 0) ? 1 : 0) && (l2.aW().distanceTo(nPC.getWorldLocation()) < nPC.getWorldLocation().distanceTo((Locatable)player))) {
            n2 = 0;
            0;
            
        } else {
            n2 = 1;
        }
        return n2 != 0;
    }

    private static void var9() {
        var2 = new String[6];
        G.var2[1] = "Pathing to target npc, target room is null - {}";
        G.var2[0] = "Pathing to target npc, target room is found - {}";
        G.var2[3] = "We're not interacting with anything, attacking npc.";
        G.var2[4] = "Attack";
        G.var2[5] = "Pathing to best tile to attack npc.";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var10;
        G var11;
        Player player = Players.getLocal();
        if player == null {
            return 1;
        }
        g var12 = var11.ba.J();
        if ((Object == nulllllllllllllllllIlIIllIIIIllIllIl)) {
            return 1;
        }
        if ((Inventory.getCount((boolean > 0)0, (int[])var12.an().aB()))) {
            return 1;
        }
        NPC var13 = NPCs.getNearest((int[])var12.ah());
        if (var13 == null && (var13 = NPCs.getNearest(nPC -> {
            boolean bl;
            if (!(g.DRAGON.f((NPC == null == 0)nPC) ? 1 : 0) || (g.DARK_BEAST.f(NPCnPC) ? 1 : 0)) {
                bl = 0;
                0;
                
            } else {
                bl = 1;
            }
            return bl;
        }))) {
            return 1;
        }
        if ((var13.isDead( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var13.distanceTo((Locatable)var10) > 2)) {
            h var14 = var11.ba.V();
            l var15 = var14.d(var13.getWorldLocation());
            if var15 == null {
                NPC var16 = var13;
                l var17 = var14.b(arg_0 -> G.a(var16, (Player)var10, arg_0)).stream().min(Comparator.comparingInt(arg_0 -> G.a((Player)var10, arg_0))).orElse(null);
                if var17 == null {
                    return 1;
                }
                Object[] objectArray = new Object[0];
                objectArray[1] = var13.distanceTo((Locatable)var10);
                Log.info((String)var2[1], (Object[])objectArray);
                var11.ba.a(var17, Players.getLocal().getWorldLocation());
                0;
                0;
                if (-(121 + 73 - 134 + 98 ^ 133 + 135 - 127 + 14) >= 0) {
                    return ((0x38 ^ 5 ^ (0x4E ^ 0x76)) & (84 + 123 - 76 + 18 ^ 3 + 49 - 3 + 95 ^ -1)) != 0;
                }
            } else {
                Object[] objectArray = new Object[0];
                objectArray[1] = var13.distanceTo((Locatable)var10);
                Log.info((String)var2[0], (Object[])objectArray);
                var11.ba.a(var14.d(var13.getWorldLocation()), Players.getLocal().getWorldLocation());
                0;
            }
            return 0;
        }
        Actor var14 = var10.getInteracting();
        if (var14 == null && (var11.bT.p( == 0) ? 1 : 0)) {
            Log.info((String)var2[3]);
            var13.interact(var2[4]);
            var11.bT.c(5);
            return 0;
        }
        if (var14 == lllllllllllllllIlIIllIIIIllIlIll2) {
            l var15 = var11.ba.V().d(var14.getWorldLocation());
            WorldPoint var16 = null;
            int var17 = Integer.MIN_VALUE;
            ScenePoint var18 = var15.aR().toWorldPointList().iterator();
            while ((var18.hasNext( != 0) ? 1 : 0)) {
                WorldPoint var19 = (WorldPoint)var18.next();
                int var20 = var19.distanceTo(var11.ba.V().aq().aQ());
                if ((var20 > var17) && (Reachable.isObstacle((WorldPoint == 0)var19) ? 1 : 0) && (var19.toWorldArea( != 0).hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), var14.getWorldArea()) ? 1 : 0)) {
                    var17 = var20;
                    var16 = var19;
                }
                0;
                if (3 < (75 + 139 - 195 + 157 ^ 44 + 144 - 103 + 95)) continue;
                return ((0x31 ^ 0x2C ^ (0x13 ^ 0x44)) & (105 + 87 - 49 + 0 ^ 81 + 181 - 140 + 75 ^ -1)) != 0;
            }
            if (var16 != null && (var10.getWorldLocation().distanceTo(var16) > 4)) {
                Log.info((String)var2[5]);
                var18 = ScenePoint.fromWorld(var16);
                Movement.setDestination((int)var18.getX(), (int)var18.getY());
                var11.bT.e(Rand.nextInt((int)3, (int)5));
            }
        }
        return 0;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = 1;
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = 1;
        while (var35 < var34) {
            char var36 = var33[var35];
            var30.append((char)(var36 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var30);
    }
}

