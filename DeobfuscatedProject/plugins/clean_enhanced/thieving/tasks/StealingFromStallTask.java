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
import java.util.List;
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
import gg.squire.thieving.tasks.GameEnum6;

@TaskDesc(name="Stealing from stall")
public class StealingFromStallTask
extends Task {
    private final  int[] aL;

    private final  SquireThievingConfig aK;

    private static boolean var3(Object object) {
        return object != null;
    }

    private static void var4() {
        var2 = new int[20];
        J.var2[0] = 0x69 ^ 0x17 ^ (0x6C ^ 0x15);
        J.var2[1] = (0x78 ^ 0x2D) & ~(0x47 ^ 0x12);
        J.var2[2] = 0xFFFF9F84 & 0x75FB;
        J.var2[3] = 1;
        J.var2[4] = 0xFFFFFF9F & 0x7FF;
        J.var2[5] = 2;
        J.var2[6] = 0xFFFFE7EF & 0x1FBB;
        J.var2[7] = 3;
        J.var2[8] = 0xFFFF9FE3 & 0x67BF;
        J.var2[9] = 0x2B ^ 0x51 ^ (0x22 ^ 0x5C);
        J.var2[10] = 0xFFFFAD6D & 0x5ADA;
        J.var2[11] = 0xBC ^ 0x9F ^ (0x1E ^ 0x38);
        J.var2[12] = 79 + 48 - 30 + 52 + (0xEE ^ 0xC5) - -(0x3C ^ 0x1F) + (0xA7 ^ 0xB3);
        J.var2[13] = 0x23 ^ 0x25;
        J.var2[14] = -(0xFFFFF5FE & 0x5E8B) & (0xFFFFDCFF & 0x7FBF);
        J.var2[15] = 112 + 92 - 84 + 9 ^ 111 + 101 - 155 + 85;
        J.var2[16] = -(0xFFFFF337 & 0x6ECB) & (0xFFFFFFD3 & 0x63FE);
        J.var2[17] = 0x93 ^ 0xBB;
        J.var2[18] = 0xE0 ^ 0x89 ^ (0x37 ^ 0x40);
        J.var2[19] = 0x76 ^ 0x7E;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[1];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[1];
        while (J.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (((0x7B ^ 0x42) & ~(0x70 ^ 0x49)) == 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var16(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    private static void var18() {
        var1 = new String[var2[19]];
        J.var1[J.var2[1]] = "Someone is crashing us, hopping worlds.";
        J.var1[J.var2[3]] = "Eat";
        J.var1[J.var2[5]] = "Drink";
        J.var1[J.var2[7]] = "Can't reach stall";
        J.var1[J.var2[9]] = "Steal-from";
        J.var1[J.var2[11]] = "Stamina";
        J.var1[J.var2[13]] = "Steal-from";
        J.var1[J.var2[0]] = "Steal-from";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_6;
        TileObject llllllllllllllIllllIIIIIlIIIllIl2;
        TileObject tileObject2;
        J var19;
        if (J.var20((Object)this.aK.method(), (Object)b.STALLS)) {
            return var2[1];
        }
        Player var21 = Players.getLocal();
        if (J.var22(var21)) {
            return var2[1];
        }
        if (J.var23(Inventory.isFull() ? 1 : 0)) {
            return var2[1];
        }
        h var24 = var19.aK.stallTarget();
        WorldPoint var25 = var24.z();
        List var26 = Players.getAll(player2 -> {
            int n2;
            if (J.var3(player2) && J.var20(player2, var21)) {
                WorldArea[] worldAreaArray = new WorldArea[var2[3]];
                worldAreaArray[J.var2[1]] = var24.p();
                if (J.var23(player2.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
                    n2 = var2[3];
                    0;
                    if (-1 < (0xA0 ^ 0xC6 ^ (0x6B ^ 9))) return n2 != 0;
                    return ((0x77 ^ 0x1E ^ (0xD9 ^ 0xA1)) & (0xDD ^ 0x9D ^ (0xDD ^ 0x8C) ^ -1)) != 0;
                }
            }
            n2 = var2[1];
            return n2 != 0;
        });
        if (J.var23(var24.equals((Object)h.FRUIT_HOSIDIUS) ? 1 : 0) && J.var17(var26.isEmpty() ? 1 : 0)) {
            Log.info((String)var1[var2[1]]);
            if (J.var17(Worlds.isHopperOpen() ? 1 : 0)) {
                Worlds.openHopper();
                return var2[3];
            }
            World llllllllllllllIllllIIIIIlIIIllIl2 = Worlds.getRandom(world -> {
                int n2;
                if (J.var23(world.isNormal() ? 1 : 0) && J.var23(world.isMembers() ? 1 : 0) && J.var16(world.getLocation(), Worlds.getCurrentWorld().getLocation())) {
                    n2 = var2[3];
                    0;
                    if (2 < 0) {
                        return ((0x44 ^ 0x75) & ~(0x79 ^ 0x48)) != 0;
                    }
                } else {
                    n2 = var2[1];
                }
                return n2 != 0;
            });
            Worlds.hopTo((World)llllllllllllllIllllIIIIIlIIIllIl2);
            return var2[3];
        }
        if (J.var23(var24.A() ? 1 : 0)) {
            tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[var2[3]];
                stringArray[J.var2[1]] = var1[var2[0]];
                if (J.var23(tileObject.hasAction(stringArray) ? 1 : 0) && J.var23(tileObject.getName().equals(var24.v()) ? 1 : 0) && J.var14(tileObject.distanceTo(var25), var2[7])) {
                    n2 = var2[3];
                    0;
                    if (((0x75 ^ 0x78) & ~(0xCF ^ 0xC2)) > 2) {
                        return ((0x2A ^ 1) & ~(0x90 ^ 0xBB)) != 0;
                    }
                } else {
                    n2 = var2[1];
                }
                return n2 != 0;
            });
            0;
            if (((48 + 164 - 107 + 81 ^ 110 + 137 - 110 + 25) & (0x89 ^ 0x9A ^ (0x50 ^ 0x5B) ^ -1)) != 0) {
                return ((13 + 174 - 100 + 151 ^ 188 + 93 - 266 + 181) & (116 + 75 - 137 + 110 ^ 94 + 98 - 52 + 2 ^ -1)) != 0;
            }
        } else {
            tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[var2[3]];
                stringArray[J.var2[1]] = var1[var2[13]];
                if (J.var23(tileObject.hasAction(stringArray) ? 1 : 0) && J.var23(tileObject.getName().equals(var24.v()) ? 1 : 0)) {
                    n2 = var2[3];
                    0;
                    if (((0x62 ^ 0x28) & ~(0xD5 ^ 0x9F)) > 2) {
                        return ((0x80 ^ 0x96) & ~(0x1D ^ 0xB)) != 0;
                    }
                } else {
                    n2 = var2[1];
                }
                return n2 != 0;
            });
        }
        if (J.var22(llllllllllllllIllllIIIIIlIIIllIl2 = tileObject2)) {
            return var2[1];
        }
        if (J.var23(var19.aK.dropFruit() ? 1 : 0) && J.var23(Inventory.contains((int[])var19.aL) ? 1 : 0) && J.var23(var21.isMoving() ? 1 : 0)) {
            Inventory.dropAll((int[])var19.aL);
            0;
            return var2[3];
        }
        if (J.var27(Movement.getRunEnergy(), var2[15]) && J.var17(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        int[] nArray = new int[var2[3]];
        nArray[J.var2[1]] = var2[16];
        Item var28 = Inventory.getFirst((int[])nArray);
        if (J.var3(var28) && J.var14(Movement.getRunEnergy(), var2[17])) {
            var28.interact(var1[var2[3]]);
            return var2[3];
        }
        Item var29 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[11]]));
        if (J.var3(var29) && J.var17(Movement.isStaminaBoosted() ? 1 : 0) && J.var14(Movement.getRunEnergy(), var2[18])) {
            var29.interact(var1[var2[5]]);
            return var2[3];
        }
        if (J.var17(Reachable.isInteractable((Locatable)llllllllllllllIllllIIIIIlIIIllIl2) ? 1 : 0)) {
            Log.info((String)var1[var2[7]]);
            return var2[1];
        }
        if (J.var23(var24.A() ? 1 : 0) && J.var17(var21.getWorldLocation().equals((Object)var25) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var25);
            0;
            return var2[3];
        }
        var5_6.interact(var1[var2[9]]);
        return var2[3];
    }

    private static boolean var22(Object object) {
        return object == null;
    }

    @Inject
    public StealingFromStallTask(SquireThievingConfig squireThievingConfig) {
        int[] nArray = new int[var2[0]];
        nArray[J.var2[1]] = var2[2];
        nArray[J.var2[3]] = var2[4];
        nArray[J.var2[5]] = var2[6];
        nArray[J.var2[7]] = var2[8];
        nArray[J.var2[9]] = var2[10];
        nArray[J.var2[11]] = var2[12];
        nArray[J.var2[13]] = var2[14];
        this.aL = nArray;
        this.aK = squireThievingConfig;
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

        catch (Exception var41) {
            var41.printStackTrace();
            return null;
        }
    }

    static {
        J.var4();
        J.var18();
    }

    private static boolean var20(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var27(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }
}

