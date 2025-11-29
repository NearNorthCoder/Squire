/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Killing core", priority=500, blocking=true, register=true)
public class KillingCoreTask
extends CorpTaskBase {
    
    private static final  int u;

    private static void lllIIIllIIlllI() {
        lIllIIIIIIII = new String[lIllIIIIIIIl[9]];
        i.lIllIIIIIIII[i.lIllIIIIIIIl[0]] = "Dark energy core";
        i.lIllIIIIIIII[i.lIllIIIIIIIl[1]] = "Wield";
        i.lIllIIIIIIII[i.lIllIIIIIIIl[5]] = "Attack";
        i.lIllIIIIIIII[i.lIllIIIIIIIl[6]] = "Dark energy core";
        i.lIllIIIIIIII[i.lIllIIIIIIIl[7]] = "Wield";
        i.lIllIIIIIIII[i.lIllIIIIIIIl[8]] = "Attack";
    }

    private static boolean lllIIIllIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static  boolean a(NPC nPC, WorldPoint worldPoint) {
        boolean bl;
        if (i.lllIIIllIlIIlI(nPC.getWorldArea().contains(worldPoint) ? 1 : 0)) {
            bl = lIllIIIIIIIl[1];

            if (2 < -1) {
                return false;
            }
        } else {
            bl = lIllIIIIIIIl[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        NPC nPC = this.f();
        if (i.lllIIIllIlIIII(nPC)) {
            return lIllIIIIIIIl[0];
        }
        String[] stringArray = new String[lIllIIIIIIIl[1]];
        stringArray[i.lIllIIIIIIIl[0]] = lIllIIIIIIII[lIllIIIIIIIl[0]];
        NPC var1 = NPCs.getNearest((String[])stringArray);
        if (!i.lllIIIllIlIIIl(var1) || i.lllIIIllIlIIlI(Reachable.isInteractable((Locatable)var1) ? 1 : 0)) {
            int[] nArray = new int[lIllIIIIIIIl[1]];
            nArray[i.lIllIIIIIIIl[0]] = lIllIIIIIIIl[2];
            if (i.lllIIIllIlIIIl(Projectiles.getNearest((int[])nArray))) {
                int[] nArray2 = new int[lIllIIIIIIIl[1]];
                nArray2[i.lIllIIIIIIIl[0]] = lIllIIIIIIIl[3];
                Item var2 = Inventory.getFirst((int[])nArray2);
                if (i.lllIIIllIlIIIl(var2)) {
                    var2.interact(lIllIIIIIIII[lIllIIIIIIIl[1]]);
                }
                return lIllIIIIIIIl[1];
            }
            return lIllIIIIIIIl[0];
        }
        if (i.lllIIIllIlIIll(Combat.getCurrentHealth(), lIllIIIIIIIl[4])) {
            TeleportLoader.enterHouse();

            return lIllIIIIIIIl[0];
        }
        if (i.lllIIIllIlIIlI(var1.getWorldLocation().distanceTo((Locatable)Players.getLocal()))) {
            var1.interact(lIllIIIIIIII[lIllIIIIIIIl[5]]);

            if (-1 >= 2) {
                return false;
            }
        } else if (i.lllIIIllIlIlII(var1.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIllIIIIIIIl[1])) {
            void var3;
            WorldPoint var2 = Players.getLocal().getWorldLocation().createWorldArea(lIllIIIIIIIl[5]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl;
                if (i.lllIIIllIlIllI(worldPoint.distanceTo(var1.getWorldLocation()), lIllIIIIIIIl[5])) {
                    bl = lIllIIIIIIIl[1];

                    }
                } else {
                    bl = lIllIIIIIIIl[0];
                }
                return bl;
            }).filter(arg_0 -> i.a((NPC)var3, arg_0)).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
            if (i.lllIIIllIlIIII(var2)) {
                return lIllIIIIIIIl[0];
            }
            Movement.setDestination((WorldPoint)var2);
        }
        return lIllIIIIIIIl[1];
    }

    private static boolean lllIIIllIlIIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        void var4;
        NPC nPC = npcSpawned.getNpc();
        if (i.lllIIIllIlIlIl(nPC.getName().equals(lIllIIIIIIII[lIllIIIIIIIl[6]]) ? 1 : 0)) {
            return;
        }
        if (i.lllIIIllIlIIlI(var4.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIllIIIIIIIl[1]];
        nArray[i.lIllIIIIIIIl[0]] = lIllIIIIIIIl[3];
        Item var5 = Inventory.getFirst((int[])nArray);
        if (i.lllIIIllIlIIIl(var5)) {
            var5.interact(lIllIIIIIIII[lIllIIIIIIIl[7]]);
        }
        nPC.interact(lIllIIIIIIII[lIllIIIIIIIl[8]]);
    }

    private static boolean lllIIIllIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        i.lllIIIllIIllll();
        i.lllIIIllIIlllI();
        u = lIllIIIIIIIl[2];
    }

    private static boolean lllIIIllIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIllIlIIIl(Object object) {
        return object != null;
    }

    private static boolean lllIIIllIlIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIllIlIlII(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var6);
    }
}

