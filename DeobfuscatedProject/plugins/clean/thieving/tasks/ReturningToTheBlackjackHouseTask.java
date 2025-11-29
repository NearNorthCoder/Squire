/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GameEnum19;
import gg.squire.thieving.tasks.BlackjackingTask;

@TaskDesc(name="Returning to the blackjack house", priority=2, blocking=true)
public class ReturningToTheBlackjackHouseTask
extends Task {
    
    private final  SquireThieving Y;
    private final  SquireThievingConfig Z;

    static {
        q.lIllIIIIlllllll();
        q.lIllIIIIllllllI();
    }

    public boolean run() {
        NPC var1;
        List var2;
        q var3;
        if (q.lIllIIIlIIIIIII((Object)this.Z.method(), (Object)b.BLACK_JACK)) {
            return lIIllIllIIIIl[0];
        }
        Player var4 = Players.getLocal();
        if (q.lIllIIIlIIIIIIl(var4)) {
            return lIIllIllIIIIl[0];
        }
        if (q.lIllIIIlIIIIIlI(var3.Y.i() ? 1 : 0)) {
            return lIIllIllIIIIl[0];
        }
        int var5 = Inventory.getCount(item -> item.hasAction(k.z));
        if (q.lIllIIIlIIIIIll(var5)) {
            return lIIllIllIIIIl[0];
        }
        WorldPoint var6 = var4.getWorldLocation();
        c var7 = var3.Y.b().t();
        c var8 = c.b(var6);
        if (q.lIllIIIlIIIIlII((Object)var8) && q.lIllIIIlIIIIIII((Object)var7, (Object)var8)) {
            Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[0]]);
            var2 = var3.Y.a(var8, lIIllIllIIIIl[1]);
            if (q.lIllIIIlIIIIlII(var2)) {
                return var3.Y.a(var4, lIIllIllIIIIl[1]);
            }
            var1 = NPCs.getNearest(nPC -> {
                int n2;
                if (q.lIllIIIlIIIIlII(nPC)) {
                    WorldArea[] worldAreaArray = new WorldArea[lIIllIllIIIIl[1]];
                    worldAreaArray[q.lIIllIllIIIIl[0]] = var8.p();
                    if (q.lIllIIIlIIIIIll(nPC.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIllIIIIl[1]];
                        stringArray[q.lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[12]];
                        if (q.lIllIIIlIIIIIlI(nPC.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIIllIllIIIIl[1];

                            if (((0x29 ^ 0x3B) & ~(0x89 ^ 0x9B)) <= ((0x7A ^ 0x41) & ~(0x40 ^ 0x7B))) return n2 != 0;
                            return false;
                        }
                    }
                }
                n2 = lIIllIllIIIIl[0];
                return n2 != 0;
            });
            Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[1]]);
            if (q.lIllIIIlIIIIlII(var1)) {
                var1.interact(lIIllIllIIIII[lIIllIllIIIIl[2]]);
                return lIIllIllIIIIl[0];
            }
        }
        if (q.lIllIIIlIIIIlIl((var2 = NPCs.getAll(nPC -> {
            int n2;
            if (q.lIllIIIlIIIIlII(nPC) && q.lIllIIIlIIIIIlI(nPC.getName().equals(this.Y.b().v()) ? 1 : 0)) {
                WorldArea[] worldAreaArray = new WorldArea[lIIllIllIIIIl[1]];
                worldAreaArray[q.lIIllIllIIIIl[0]] = var7.p();
                if (q.lIllIIIlIIIIIlI(nPC.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
                    n2 = lIIllIllIIIIl[1];

                    if (-3 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIllIllIIIIl[0];
            return n2 != 0;
        })).size(), lIIllIllIIIIl[1])) {
            Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[3]]);
            return lIIllIllIIIIl[0];
        }
        if (q.lIllIIIlIIIIIll(Movement.isRunEnabled() ? 1 : 0) && q.lIllIIIlIIIIlIl(Movement.getRunEnergy(), lIIllIllIIIIl[4])) {
            Movement.toggleRun();
        }
        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIIIIl[1]];
        worldAreaArray[q.lIIllIllIIIIl[0]] = var7.p();
        if (q.lIllIIIlIIIIIll(var6.isInArea(worldAreaArray) ? 1 : 0)) {
            int var9;
            int n2;
            var1 = var3.Y.a(var7, lIIllIllIIIIl[1]);
            if (q.lIllIIIlIIIIlII(var1)) {
                return var3.Y.a(var4, lIIllIllIIIIl[1]);
            }
            if (q.lIllIIIlIIIIlIl(var6.distanceTo(var7.p().getRandom()), lIIllIllIIIIl[5])) {
                n2 = lIIllIllIIIIl[1];

                if (3 != 3) {
                    return false;
                }
            } else {
                n2 = lIIllIllIIIIl[0];
            }
            if (q.lIllIIIlIIIIIlI(var9 = n2)) {
                Object[] objectArray = new Object[lIIllIllIIIIl[1]];
                objectArray[q.lIIllIllIIIIl[0]] = var7;
                Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[6]], (Object[])objectArray);
                Movement.walkTo((WorldPoint)var7.p().getRandom());

                return lIIllIllIIIIl[1];
            }
            TileObject var10 = TileObjects.getNearest(tileObject -> {
                int n2;
                block2: {
                    block3: {
                        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIIIIl[1]];
                        worldAreaArray[q.lIIllIllIIIIl[0]] = var7.p();
                        if (!q.lIllIIIlIIIIIlI(tileObject.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) break block2;
                        String[] stringArray = new String[lIIllIllIIIIl[1]];
                        stringArray[q.lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[10]];
                        if (!q.lIllIIIlIIIIIll(tileObject.hasAction(stringArray) ? 1 : 0)) break block3;
                        String[] stringArray2 = new String[lIIllIllIIIIl[1]];
                        stringArray2[q.lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[11]];
                        if (!q.lIllIIIlIIIIIlI(tileObject.hasAction(stringArray2) ? 1 : 0)) break block2;
                    }
                    n2 = lIIllIllIIIIl[1];

                    if (-1 <= -1) return n2 != 0;
                    return ((0xD6 ^ 0xAC ^ (0x87 ^ 0xB0)) & (0xBA ^ 0xC4 ^ (0x64 ^ 0x57) ^ -1)) != 0;
                }
                n2 = lIIllIllIIIIl[0];
                return n2 != 0;
            });
            if (q.lIllIIIlIIIIlII(var10)) {
                Log.info((String)lIIllIllIIIII[lIIllIllIIIIl[7]]);
                String[] stringArray = new String[lIIllIllIIIIl[2]];
                stringArray[q.lIIllIllIIIIl[0]] = lIIllIllIIIII[lIIllIllIIIIl[8]];
                stringArray[q.lIIllIllIIIIl[1]] = lIIllIllIIIII[lIIllIllIIIIl[9]];
                var10.interact(stringArray);
                return lIIllIllIIIIl[1];
            }
        }
        return lIIllIllIIIIl[0];
    }

    private static boolean lIllIIIlIIIIIll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var11);
    }

    private static boolean lIllIIIlIIIIIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    public ReturningToTheBlackjackHouseTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.Y = squireThieving;
        this.Z = squireThievingConfig;
    }

    private static boolean lIllIIIlIIIIlII(Object object) {
        return object != null;
    }

    private static boolean lIllIIIlIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIIIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIlIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllIIIIllllllI() {
        lIIllIllIIIII = new String[lIIllIllIIIIl[13]];
        q.lIIllIllIIIII[q.lIIllIllIIIIl[0]] = "We're not currently inside the right house, trying to move out.";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[1]] = "Searching for nearest npc outside house to lure.";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[2]] = "Lure";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[3]] = "Mismatched amount of NPCs in our current house, returning false.";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[6]] = "(Far away): Walking towards current target house. {}";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[7]] = "Interacting with the inside object.";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[8]] = "Search";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[9]] = "Climb-up";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[10]] = "Search";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[11]] = "Climb-up";
        q.lIIllIllIIIII[q.lIIllIllIIIIl[12]] = "Lure";
    }

    private static boolean lIllIIIlIIIIIIl(Object object) {
        return object == null;
    }

}

