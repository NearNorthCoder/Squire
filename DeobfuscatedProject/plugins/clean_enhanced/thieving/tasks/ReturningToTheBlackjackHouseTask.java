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
import java.util.List;
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
import gg.squire.thieving.tasks.GameEnum2;
import gg.squire.thieving.tasks.BlackjackingTask;

@TaskDesc(name="Returning to the blackjack house", priority=2, blocking=true)
public class ReturningToTheBlackjackHouseTask
extends Task {
    
    private final  SquireThieving Y;
    private final  SquireThievingConfig Z;

    static {
        q.var3();
        q.var4();
    }

    public boolean run() {
        NPC var5;
        List var6;
        q var7;
        if (q.var8((Object)this.Z.method(), (Object)b.BLACK_JACK)) {
            return var2[0];
        }
        Player var9 = Players.getLocal();
        if (q.var10(var9)) {
            return var2[0];
        }
        if (q.var11(var7.Y.i() ? 1 : 0)) {
            return var2[0];
        }
        int var12 = Inventory.getCount(item -> item.hasAction(k.z));
        if (q.var13(var12)) {
            return var2[0];
        }
        WorldPoint var14 = var9.getWorldLocation();
        c var15 = var7.Y.b().t();
        c var16 = c.b(var14);
        if (q.var17((Object)var16) && q.var8((Object)var15, (Object)var16)) {
            Log.info((String)var1[var2[0]]);
            var6 = var7.Y.a(var16, var2[1]);
            if (q.var17(var6)) {
                return var7.Y.a(var9, var2[1]);
            }
            var5 = NPCs.getNearest(nPC -> {
                int n2;
                if (q.var17(nPC)) {
                    WorldArea[] worldAreaArray = new WorldArea[var2[1]];
                    worldAreaArray[q.var2[0]] = var16.p();
                    if (q.var13(nPC.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
                        String[] stringArray = new String[var2[1]];
                        stringArray[q.var2[0]] = var1[var2[12]];
                        if (q.var11(nPC.hasAction(stringArray) ? 1 : 0)) {
                            n2 = var2[1];
                            0;
                            if (((0x29 ^ 0x3B) & ~(0x89 ^ 0x9B)) <= ((0x7A ^ 0x41) & ~(0x40 ^ 0x7B))) return n2 != 0;
                            return ((0x90 ^ 0x9D) & ~(0x23 ^ 0x2E)) != 0;
                        }
                    }
                }
                n2 = var2[0];
                return n2 != 0;
            });
            Log.info((String)var1[var2[1]]);
            if (q.var17(var5)) {
                var5.interact(var1[var2[2]]);
                return var2[0];
            }
        }
        if (q.var18((var6 = NPCs.getAll(nPC -> {
            int n2;
            if (q.var17(nPC) && q.var11(nPC.getName().equals(this.Y.b().v()) ? 1 : 0)) {
                WorldArea[] worldAreaArray = new WorldArea[var2[1]];
                worldAreaArray[q.var2[0]] = var15.p();
                if (q.var11(nPC.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if (-3 <= 0) return n2 != 0;
                    return ((0xF2 ^ 0xA2) & ~(0xD9 ^ 0x89)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        })).size(), var2[1])) {
            Log.info((String)var1[var2[3]]);
            return var2[0];
        }
        if (q.var13(Movement.isRunEnabled() ? 1 : 0) && q.var18(Movement.getRunEnergy(), var2[4])) {
            Movement.toggleRun();
        }
        WorldArea[] worldAreaArray = new WorldArea[var2[1]];
        worldAreaArray[q.var2[0]] = var15.p();
        if (q.var13(var14.isInArea(worldAreaArray) ? 1 : 0)) {
            int var19;
            int n2;
            var5 = var7.Y.a(var15, var2[1]);
            if (q.var17(var5)) {
                return var7.Y.a(var9, var2[1]);
            }
            if (q.var18(var14.distanceTo(var15.p().getRandom()), var2[5])) {
                n2 = var2[1];
                0;
                if (3 != 3) {
                    return ((0xE7 ^ 0xBA) & ~(0x29 ^ 0x74)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            if (q.var11(var19 = n2)) {
                Object[] objectArray = new Object[var2[1]];
                objectArray[q.var2[0]] = var15;
                Log.info((String)var1[var2[6]], (Object[])objectArray);
                Movement.walkTo((WorldPoint)var15.p().getRandom());
                0;
                return var2[1];
            }
            TileObject var20 = TileObjects.getNearest(tileObject -> {
                int n2;
                block2: {
                    block3: {
                        WorldArea[] worldAreaArray = new WorldArea[var2[1]];
                        worldAreaArray[q.var2[0]] = var15.p();
                        if (!q.var11(tileObject.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) break block2;
                        String[] stringArray = new String[var2[1]];
                        stringArray[q.var2[0]] = var1[var2[10]];
                        if (!q.var13(tileObject.hasAction(stringArray) ? 1 : 0)) break block3;
                        String[] stringArray2 = new String[var2[1]];
                        stringArray2[q.var2[0]] = var1[var2[11]];
                        if (!q.var11(tileObject.hasAction(stringArray2) ? 1 : 0)) break block2;
                    }
                    n2 = var2[1];
                    0;
                    if (-1 <= -1) return n2 != 0;
                    return ((0xD6 ^ 0xAC ^ (0x87 ^ 0xB0)) & (0xBA ^ 0xC4 ^ (0x64 ^ 0x57) ^ -1)) != 0;
                }
                n2 = var2[0];
                return n2 != 0;
            });
            if (q.var17(var20)) {
                Log.info((String)var1[var2[7]]);
                String[] stringArray = new String[var2[2]];
                stringArray[q.var2[0]] = var1[var2[8]];
                stringArray[q.var2[1]] = var1[var2[9]];
                var20.interact(stringArray);
                return var2[1];
            }
        }
        return var2[0];
    }

    private static void var3() {
        var2 = new int[14];
        q.var2[0] = (0x14 ^ 0x62 ^ (0x1B ^ 0x73)) & (0x36 ^ 0x70 ^ (7 ^ 0x5F) ^ -1);
        q.var2[1] = 1;
        q.var2[2] = 2;
        q.var2[3] = 3;
        q.var2[4] = 2 ^ 0x1C;
        q.var2[5] = 131 + 88 - 204 + 117 ^ 5 + 93 - -35 + 6;
        q.var2[6] = 0x5E ^ 0x46 ^ (0x48 ^ 0x54);
        q.var2[7] = 10 + 80 - 73 + 110 ^ (0xB8 ^ 0xC2);
        q.var2[8] = 56 + 38 - 80 + 166 ^ 134 + 75 - 151 + 120;
        q.var2[9] = 0x7E ^ 0x79;
        q.var2[10] = 0xAB ^ 0xA3;
        q.var2[11] = 0x75 ^ 0x40 ^ (0x6F ^ 0x53);
        q.var2[12] = 0x37 ^ 0x3D;
        q.var2[13] = 0x70 ^ 0x48 ^ (0xAA ^ 0x99);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = var2[0];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = var2[0];
        while (q.var36(var35, var34)) {
            char var37 = var33[var35];
            var30.append((char)(var37 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(var30);
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    @Inject
    public ReturningToTheBlackjackHouseTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.Y = squireThieving;
        this.Z = squireThievingConfig;
    }

    private static boolean var17(Object object) {
        return object != null;
    }

    private static boolean var36(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var8(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var18(int n2, int n3) {
        return n2 > n3;
    }

    private static void var4() {
        var1 = new String[var2[13]];
        q.var1[q.var2[0]] = "We're not currently inside the right house, trying to move out.";
        q.var1[q.var2[1]] = "Searching for nearest npc outside house to lure.";
        q.var1[q.var2[2]] = "Lure";
        q.var1[q.var2[3]] = "Mismatched amount of NPCs in our current house, returning false.";
        q.var1[q.var2[6]] = "(Far away): Walking towards current target house. {}";
        q.var1[q.var2[7]] = "Interacting with the inside object.";
        q.var1[q.var2[8]] = "Search";
        q.var1[q.var2[9]] = "Climb-up";
        q.var1[q.var2[10]] = "Search";
        q.var1[q.var2[11]] = "Climb-up";
        q.var1[q.var2[12]] = "Lure";
    }

    private static boolean var10(Object object) {
        return object == null;
    }

        catch (Exception var43) {
            var43.printStackTrace();
            return null;
        }
    }
}

