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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lIllIIlIlIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIlIlIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIllIIlIlIIIlll() {
        lIIlllIIIlIlI = new String[lIIlllIIIlIll[7]];
        r.lIIlllIIIlIlI[r.lIIlllIIIlIll[0]] = "Exchange All";
        r.lIIlllIIIlIlI[r.lIIlllIIIlIll[1]] = "Open";
        r.lIIlllIIIlIlI[r.lIIlllIIIlIll[3]] = "Open";
        r.lIIlllIIIlIlI[r.lIIlllIIIlIll[4]] = "Curtain";
    }

        return String.valueOf(var1);
    }

    static {
        r.lIllIIlIlIIlIII();
        r.lIllIIlIlIIIlll();
        aa = new WorldPoint(lIIlllIIIlIll[5], lIIlllIIIlIll[6], lIIlllIIIlIll[0]);
    }

    private boolean G() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> lIIlllIIIlIlI[lIIlllIIIlIll[4]].equals(tileObject.getName()));
        if (r.lIllIIlIlIIllII(tileObject2) && r.lIllIIlIlIIllll(tileObject2.hasAction(lIIlllIIIlIlI[lIIlllIIIlIll[1]]::equals) ? 1 : 0)) {
            tileObject2.interact(lIIlllIIIlIlI[lIIlllIIIlIll[3]]);
            return lIIlllIIIlIll[1];
        }
        return lIIlllIIIlIll[0];
    }

    private static boolean lIllIIlIlIIlIll(int n2) {
        return n2 > 0;
    }

    @Inject
    public UnnotingForExtraFoodTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.ab = squireThievingConfig;
        this.ac = squireThieving;
    }

    private static boolean lIllIIlIlIlIIII(Object object) {
        return object == null;
    }

    private static boolean lIllIIlIlIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIlIlIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlIlIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIlIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIlIlIIllII(Object object) {
        return object != null;
    }

    private boolean F() {
        return lIIlllIIIlIll[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_7;
        void var5_6;
        r var2;
        if (!r.lIllIIlIlIIlIIl(Game.getState(), GameState.LOGGED_IN) || !r.lIllIIlIlIIlIIl((Object)this.ab.method(), (Object)b.BLACK_JACK) || r.lIllIIlIlIIlIlI(this.ab.unNoteFood() ? 1 : 0)) {
            return lIIlllIIIlIll[0];
        }
        Player var3 = Players.getLocal();
        int var4 = Inventory.getCount(item -> item.hasAction(k.z));
        if (r.lIllIIlIlIIlIll(var4)) {
            return lIIlllIIIlIll[0];
        }
        NPC var5 = var2.ac.b().a(var2.ac.b());
        if (r.lIllIIlIlIIllII(var5) && r.lIllIIlIlIIlIIl(var5.getInteracting(), var3)) {
            return lIIlllIIIlIll[0];
        }
        int var6 = var2.ac.e();
        if (r.lIllIIlIlIIllIl(Worlds.getCurrentId(), var6)) {
            World var7 = Worlds.getRandom(world -> {
                int n3;
                if (r.lIllIIlIlIIllll(world.isNormal() ? 1 : 0) && r.lIllIIlIlIIllll(world.isMembers() ? 1 : 0) && r.lIllIIlIlIlIIIl(world.getId(), var6)) {
                    n3 = lIIlllIIIlIll[1];

                    if (2 <= -1) {
                        return false;
                    }
                } else {
                    n3 = lIIlllIIIlIll[0];
                }
                return n3 != 0;
            });
            Worlds.hopTo((World)var7);
            return lIIlllIIIlIll[1];
        }
        Item var7 = Inventory.getFirst(Item::isNoted);
        if (!r.lIllIIlIlIIllII(var7) || r.lIllIIlIlIIlllI(var7.getQuantity(), Inventory.getFreeSlots())) {
            return var2.F();
        }
        if (r.lIllIIlIlIIllll(var2.ac.b().t().p().contains((Locatable)Players.getLocal()) ? 1 : 0) && r.lIllIIlIlIIllll(var2.G() ? 1 : 0)) {
            return lIIlllIIIlIll[1];
        }
        int[] nArray = new int[lIIlllIIIlIll[1]];
        nArray[r.lIIlllIIIlIll[0]] = lIIlllIIIlIll[2];
        NPC var8 = NPCs.getNearest((int[])nArray);
        if (r.lIllIIlIlIlIIII(var8) && r.lIllIIlIlIIlIlI(Movement.isWalking() ? 1 : 0)) {
            Map var9 = Walker.buildTransportLinks();
            LocalCollisionMap var10 = new LocalCollisionMap((GlobalCollisionMap)Static.getGlobalCollisionMap(), lIIlllIIIlIll[0]);
            List var11 = new Pathfinder((CollisionMap)var10, var9, List.of(Players.getLocal().getWorldLocation()), aa.toWorldArea(), RegionManager.avoidWilderness()).find();
            Walker.walkAlong((List)var11, (Map)var9);

            return lIIlllIIIlIll[1];
        }
        if (r.lIllIIlIlIIllll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIlllIIIlIll[1]];
            stringArray[r.lIIlllIIIlIll[0]] = lIIlllIIIlIlI[lIIlllIIIlIll[0]];
            Dialog.chooseOption((String[])stringArray);

            return lIIlllIIIlIll[1];
        }
        var5_6.useOn((Actor)var6_7);
        return lIIlllIIIlIll[1];
    }

    private static boolean lIllIIlIlIIlIIl(Object object, Object object2) {
        return object == object2;
    }
}

