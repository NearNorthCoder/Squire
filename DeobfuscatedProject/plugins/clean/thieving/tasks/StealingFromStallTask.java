/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GameEnum35;

@TaskDesc(name="Stealing from stall")
public class StealingFromStallTask
extends Task {
    private final  int[] aL;

    private final  SquireThievingConfig aK;

    private static boolean lIllIIIIllIIIlI(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIIIIllIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIIIllIIIII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIIlIllIll() {
        lIIllIlIllIlI = new String[lIIllIlIllIll[19]];
        J.lIIllIlIllIlI[J.lIIllIlIllIll[1]] = "Someone is crashing us, hopping worlds.";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[3]] = "Eat";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[5]] = "Drink";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[7]] = "Can't reach stall";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[9]] = "Steal-from";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[11]] = "Stamina";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[13]] = "Steal-from";
        J.lIIllIlIllIlI[J.lIIllIlIllIll[0]] = "Steal-from";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_6;
        TileObject llllllllllllllIllllIIIIIlIIIllIl2;
        TileObject tileObject2;
        J var2;
        if (J.lIllIIIIlIlllIl((Object)this.aK.method(), (Object)b.STALLS)) {
            return lIIllIlIllIll[1];
        }
        Player var3 = Players.getLocal();
        if (J.lIllIIIIlIllllI(var3)) {
            return lIIllIlIllIll[1];
        }
        if (J.lIllIIIIlIlllll(Inventory.isFull() ? 1 : 0)) {
            return lIIllIlIllIll[1];
        }
        h var4 = var2.aK.stallTarget();
        WorldPoint var5 = var4.z();
        List var6 = Players.getAll(player2 -> {
            int n2;
            if (J.lIllIIIIllIIIlI(player2) && J.lIllIIIIlIlllIl(player2, var3)) {
                WorldArea[] worldAreaArray = new WorldArea[lIIllIlIllIll[3]];
                worldAreaArray[J.lIIllIlIllIll[1]] = var4.p();
                if (J.lIllIIIIlIlllll(player2.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
                    n2 = lIIllIlIllIll[3];

                    if (-1 < (0xA0 ^ 0xC6 ^ (0x6B ^ 9))) return n2 != 0;
                    return ((0x77 ^ 0x1E ^ (0xD9 ^ 0xA1)) & (0xDD ^ 0x9D ^ (0xDD ^ 0x8C) ^ -1)) != 0;
                }
            }
            n2 = lIIllIlIllIll[1];
            return n2 != 0;
        });
        if (J.lIllIIIIlIlllll(var4.equals((Object)h.FRUIT_HOSIDIUS) ? 1 : 0) && J.lIllIIIIllIIIII(var6.isEmpty() ? 1 : 0)) {
            Log.info((String)lIIllIlIllIlI[lIIllIlIllIll[1]]);
            if (J.lIllIIIIllIIIII(Worlds.isHopperOpen() ? 1 : 0)) {
                Worlds.openHopper();
                return lIIllIlIllIll[3];
            }
            World llllllllllllllIllllIIIIIlIIIllIl2 = Worlds.getRandom(world -> {
                int n2;
                if (J.lIllIIIIlIlllll(world.isNormal() ? 1 : 0) && J.lIllIIIIlIlllll(world.isMembers() ? 1 : 0) && J.lIllIIIIllIIlII(world.getLocation(), Worlds.getCurrentWorld().getLocation())) {
                    n2 = lIIllIlIllIll[3];

                    if (2 < 0) {
                        return false;
                    }
                } else {
                    n2 = lIIllIlIllIll[1];
                }
                return n2 != 0;
            });
            Worlds.hopTo((World)llllllllllllllIllllIIIIIlIIIllIl2);
            return lIIllIlIllIll[3];
        }
        if (J.lIllIIIIlIlllll(var4.A() ? 1 : 0)) {
            tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[lIIllIlIllIll[3]];
                stringArray[J.lIIllIlIllIll[1]] = lIIllIlIllIlI[lIIllIlIllIll[0]];
                if (J.lIllIIIIlIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && J.lIllIIIIlIlllll(tileObject.getName().equals(var4.v()) ? 1 : 0) && J.lIllIIIIllIIIll(tileObject.distanceTo(var5), lIIllIlIllIll[7])) {
                    n2 = lIIllIlIllIll[3];

                    if (((0x75 ^ 0x78) & ~(0xCF ^ 0xC2)) > 2) {
                        return false;
                    }
                } else {
                    n2 = lIIllIlIllIll[1];
                }
                return n2 != 0;
            });

            if (((48 + 164 - 107 + 81 ^ 110 + 137 - 110 + 25) & (0x89 ^ 0x9A ^ (0x50 ^ 0x5B) ^ -1)) != 0) {
                return false;
            }
        } else {
            tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[lIIllIlIllIll[3]];
                stringArray[J.lIIllIlIllIll[1]] = lIIllIlIllIlI[lIIllIlIllIll[13]];
                if (J.lIllIIIIlIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && J.lIllIIIIlIlllll(tileObject.getName().equals(var4.v()) ? 1 : 0)) {
                    n2 = lIIllIlIllIll[3];

                    if (((0x62 ^ 0x28) & ~(0xD5 ^ 0x9F)) > 2) {
                        return false;
                    }
                } else {
                    n2 = lIIllIlIllIll[1];
                }
                return n2 != 0;
            });
        }
        if (J.lIllIIIIlIllllI(llllllllllllllIllllIIIIIlIIIllIl2 = tileObject2)) {
            return lIIllIlIllIll[1];
        }
        if (J.lIllIIIIlIlllll(var2.aK.dropFruit() ? 1 : 0) && J.lIllIIIIlIlllll(Inventory.contains((int[])var2.aL) ? 1 : 0) && J.lIllIIIIlIlllll(var3.isMoving() ? 1 : 0)) {
            Inventory.dropAll((int[])var2.aL);

            return lIIllIlIllIll[3];
        }
        if (J.lIllIIIIllIIIIl(Movement.getRunEnergy(), lIIllIlIllIll[15]) && J.lIllIIIIllIIIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        int[] nArray = new int[lIIllIlIllIll[3]];
        nArray[J.lIIllIlIllIll[1]] = lIIllIlIllIll[16];
        Item var7 = Inventory.getFirst((int[])nArray);
        if (J.lIllIIIIllIIIlI(var7) && J.lIllIIIIllIIIll(Movement.getRunEnergy(), lIIllIlIllIll[17])) {
            var7.interact(lIIllIlIllIlI[lIIllIlIllIll[3]]);
            return lIIllIlIllIll[3];
        }
        Item var8 = Inventory.getFirst(item -> item.getName().startsWith(lIIllIlIllIlI[lIIllIlIllIll[11]]));
        if (J.lIllIIIIllIIIlI(var8) && J.lIllIIIIllIIIII(Movement.isStaminaBoosted() ? 1 : 0) && J.lIllIIIIllIIIll(Movement.getRunEnergy(), lIIllIlIllIll[18])) {
            var8.interact(lIIllIlIllIlI[lIIllIlIllIll[5]]);
            return lIIllIlIllIll[3];
        }
        if (J.lIllIIIIllIIIII(Reachable.isInteractable((Locatable)llllllllllllllIllllIIIIIlIIIllIl2) ? 1 : 0)) {
            Log.info((String)lIIllIlIllIlI[lIIllIlIllIll[7]]);
            return lIIllIlIllIll[1];
        }
        if (J.lIllIIIIlIlllll(var4.A() ? 1 : 0) && J.lIllIIIIllIIIII(var3.getWorldLocation().equals((Object)var5) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var5);

            return lIIllIlIllIll[3];
        }
        var5_6.interact(lIIllIlIllIlI[lIIllIlIllIll[9]]);
        return lIIllIlIllIll[3];
    }

    private static boolean lIllIIIIlIllllI(Object object) {
        return object == null;
    }

    @Inject
    public StealingFromStallTask(SquireThievingConfig squireThievingConfig) {
        int[] nArray = new int[lIIllIlIllIll[0]];
        nArray[J.lIIllIlIllIll[1]] = lIIllIlIllIll[2];
        nArray[J.lIIllIlIllIll[3]] = lIIllIlIllIll[4];
        nArray[J.lIIllIlIllIll[5]] = lIIllIlIllIll[6];
        nArray[J.lIIllIlIllIll[7]] = lIIllIlIllIll[8];
        nArray[J.lIIllIlIllIll[9]] = lIIllIlIllIll[10];
        nArray[J.lIIllIlIllIll[11]] = lIIllIlIllIll[12];
        nArray[J.lIIllIlIllIll[13]] = lIIllIlIllIll[14];
        this.aL = nArray;
        this.aK = squireThievingConfig;
    }

    static {
        J.lIllIIIIlIlllII();
        J.lIllIIIIlIllIll();
    }

    private static boolean lIllIIIIlIlllIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIIIllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIlIlllll(int n2) {
        return n2 != 0;
    }
}

