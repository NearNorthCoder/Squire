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
import java.util.Comparator;
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

    private static  boolean a(NPC nPC, WorldPoint worldPoint) {
        boolean bl;
        if ((nPC.getWorldArea( == 0).contains(worldPoint) ? 1 : 0)) {
            bl = 1;
            0;
            if (2 < -1) {
                return ((23 + 148 - 162 + 219 ^ 50 + 92 - 100 + 134) & (209 + 54 - 87 + 70 ^ 93 + 98 - 163 + 134 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        NPC nPC = this.f();
        if nPC == null {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var1[0];
        NPC var3 = NPCs.getNearest((String[])stringArray);
        if (!var3 != null || (Reachable.isInteractable((Locatable == 0)var3) ? 1 : 0)) {
            int[] nArray = new int[1];
            nArray[0] = 2;
            if ((Projectiles.getNearest((int[] != nunArray))) {
                int[] nArray2 = new int[1];
                nArray2[0] = 3;
                Item var4 = Inventory.getFirst((int[])nArray2);
                if var4 != null {
                    var4.interact(var1[1]);
                }
                return 1;
            }
            return 0;
        }
        if ((Combat.getCurrentHealth() < 4)) {
            TeleportLoader.enterHouse();
            0;
            return 0;
        }
        if ((var3.getWorldLocation( == 0).distanceTo((Locatable)Players.getLocal()))) {
            var3.interact(var1[5]);
            0;
            if (-1 >= 2) {
                return ((0x4A ^ 0x56) & ~(0xD8 ^ 0xC4)) != 0;
            }
        } else if ((var3.getWorldLocation().distanceTo((Locatable)Players.getLocal()) <= 1)) {
            void var5;
            WorldPoint var4 = Players.getLocal().getWorldLocation().createWorldArea(5).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl;
                if ((worldPoint.distanceTo(var3.getWorldLocation()) >= 5)) {
                    bl = 1;
                    0;
                    if null != null {
                        return ((0x68 ^ 0xA) & ~(0x36 ^ 0x54)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            }).filter(arg_0 -> i.a((NPC)var5, arg_0)).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)Players.getLocal()))).orElse(null);
            if var4 == null {
                return 0;
            }
            Movement.setDestination((WorldPoint)var4);
        }
        return 1;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        void var12;
        NPC nPC = npcSpawned.getNpc();
        if ((nPC.getName( != 0).equals(var1[6]) ? 1 : 0)) {
            return;
        }
        if ((var12.getWorldLocation( == 0).equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[1];
        nArray[0] = 3;
        Item var13 = Inventory.getFirst((int[])nArray);
        if var13 != null {
            var13.interact(var1[7]);
        }
        nPC.interact(var1[8]);
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    static {
        i.var20();
        i.var21();
        u = 2;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = 0;
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = 0;
        while (var30 < var29) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var25);
    }
}

