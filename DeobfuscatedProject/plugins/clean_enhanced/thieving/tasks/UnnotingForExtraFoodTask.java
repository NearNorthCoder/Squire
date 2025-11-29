/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.CollisionMap
 *  net.unethicalite.api.movement.pathfinder.GlobalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.LocalCollisionMap
 *  net.unethicalite.api.movement.pathfinder.Pathfinder
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.RegionManager
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.LocalCollisionMap;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.BlackjackingTask;

@TaskDesc(name="Unnoting for extra food", priority=6, blocking=true)
public class UnnotingForExtraFoodTask
extends Task {
    private final  SquireThievingConfig ab;
    
    private final  SquireThieving ac;
    
    private static final  WorldPoint aa;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 != n3;
    }

    private static void var5() {
        var1 = new String[var2[7]];
        r.var1[r.var2[0]] = "Exchange All";
        r.var1[r.var2[1]] = "Open";
        r.var1[r.var2[3]] = "Open";
        r.var1[r.var2[4]] = "Curtain";
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (r.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    static {
        r.var17();
        r.var5();
        aa = new WorldPoint(var2[5], var2[6], var2[0]);
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private boolean G() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> var1[var2[4]].equals(tileObject.getName()));
        if (r.var24(tileObject2) && r.var25(tileObject2.hasAction(var1[var2[1]]::equals) ? 1 : 0)) {
            tileObject2.interact(var1[var2[3]]);
            return var2[1];
        }
        return var2[0];
    }

    private static boolean var26(int n2) {
        return n2 > 0;
    }

    @Inject
    public UnnotingForExtraFoodTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.ab = squireThievingConfig;
        this.ac = squireThieving;
    }

    private static boolean var27(Object object) {
        return object == null;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static boolean var34(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var25(int n2) {
        return n2 != 0;
    }

    private static void var17() {
        var2 = new int[9];
        r.var2[0] = (0x60 ^ 0x6E ^ (0xA9 ^ 0x85)) & (0x1F ^ 0x23 ^ (0xB3 ^ 0xAD) ^ -1);
        r.var2[1] = 1;
        r.var2[2] = -(0xFFFFF1FD & 0x6EB3) & (0xFFFFE7FF & 0x7EFF);
        r.var2[3] = 2;
        r.var2[4] = 3;
        r.var2[5] = 0xFFFFEFB7 & 0x1D68;
        r.var2[6] = 0xFFFFCBED & 0x3FBF;
        r.var2[7] = 0x7F ^ 0x7B;
        r.var2[8] = 0xA8 ^ 0x95 ^ (0x60 ^ 0x55);
    }

    private static boolean var35(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var24(Object object) {
        return object != null;
    }

    private boolean F() {
        return var2[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_7;
        void var5_6;
        r var36;
        if (!r.var37(Game.getState(), GameState.LOGGED_IN) || !r.var37((Object)this.ab.method(), (Object)b.BLACK_JACK) || r.var3(this.ab.unNoteFood() ? 1 : 0)) {
            return var2[0];
        }
        Player var38 = Players.getLocal();
        int var39 = Inventory.getCount(item -> item.hasAction(k.z));
        if (r.var26(var39)) {
            return var2[0];
        }
        NPC var40 = var36.ac.b().a(var36.ac.b());
        if (r.var24(var40) && r.var37(var40.getInteracting(), var38)) {
            return var2[0];
        }
        int var41 = var36.ac.e();
        if (r.var34(Worlds.getCurrentId(), var41)) {
            World var42 = Worlds.getRandom(world -> {
                int n3;
                if (r.var25(world.isNormal() ? 1 : 0) && r.var25(world.isMembers() ? 1 : 0) && r.var4(world.getId(), var41)) {
                    n3 = var2[1];
                    0;
                    if (2 <= -1) {
                        return ((0xA3 ^ 0xC3) & ~(0x3E ^ 0x5E)) != 0;
                    }
                } else {
                    n3 = var2[0];
                }
                return n3 != 0;
            });
            Worlds.hopTo((World)var42);
            return var2[1];
        }
        Item var42 = Inventory.getFirst(Item::isNoted);
        if (!r.var24(var42) || r.var35(var42.getQuantity(), Inventory.getFreeSlots())) {
            return var36.F();
        }
        if (r.var25(var36.ac.b().t().p().contains((Locatable)Players.getLocal()) ? 1 : 0) && r.var25(var36.G() ? 1 : 0)) {
            return var2[1];
        }
        int[] nArray = new int[var2[1]];
        nArray[r.var2[0]] = var2[2];
        NPC var43 = NPCs.getNearest((int[])nArray);
        if (r.var27(var43) && r.var3(Movement.isWalking() ? 1 : 0)) {
            Map var44 = Walker.buildTransportLinks();
            LocalCollisionMap var45 = new LocalCollisionMap((GlobalCollisionMap)Static.getGlobalCollisionMap(), var2[0]);
            List var46 = new Pathfinder((CollisionMap)var45, var44, List.of(Players.getLocal().getWorldLocation()), aa.toWorldArea(), RegionManager.avoidWilderness()).find();
            Walker.walkAlong((List)var46, (Map)var44);
            0;
            return var2[1];
        }
        if (r.var25(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[var2[1]];
            stringArray[r.var2[0]] = var1[var2[0]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return var2[1];
        }
        var5_6.useOn((Actor)var6_7);
        return var2[1];
    }

    private static boolean var37(Object object, Object object2) {
        return object == object2;
    }
}

