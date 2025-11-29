/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GameEnum2;
import gg.squire.thieving.tasks.BlackjackingTask;

@TaskDesc(name="Buying wines", priority=6, blocking=true)
public class BuyingWinesTask
extends Task {
    private static final  WorldArea G;

    private static final  int H;
    private static final  WorldPoint F;
    private final  SquireThievingConfig I;
    private  boolean K;
    private final  SquireThieving J;

    private static void var3() {
        var1 = new int[20];
        l.var1[0] = (0xEF ^ 0x91 ^ (0xC0 ^ 0xA7)) & (0xD4 ^ 0xC7 ^ (0xCF ^ 0xC5) ^ -1);
        l.var1[1] = 1;
        l.var1[2] = 0xFFFF9FEB & 0x67DD;
        l.var1[3] = 0xC8 ^ 0x8A ^ (0xF9 ^ 0xA0);
        l.var1[4] = 0xCE ^ 0xB6 ^ (0x2C ^ 0x51);
        l.var1[5] = 2;
        l.var1[6] = 3;
        l.var1[7] = 0xBB ^ 0xBF;
        l.var1[8] = -(0xFFFF9B95 & 0x657F) & (0xFFFFAFF6 & 0x7F7F);
        l.var1[9] = 0x3F ^ 0x39;
        l.var1[10] = 0x1A ^ 0x1D;
        l.var1[11] = 5 ^ 0x5A ^ (0x76 ^ 0x21);
        l.var1[12] = 0xBA ^ 0x9B ^ (0x90 ^ 0xB8);
        l.var1[13] = 115 + 132 - 179 + 71 ^ 75 + 98 - 112 + 68;
        l.var1[14] = 51 + 106 - 149 + 165 ^ 128 + 51 - 107 + 94;
        l.var1[15] = -(0xFFFFA5D5 & 0x7A2B) & (0xFFFFBDFE & 0x6F1F);
        l.var1[16] = -(0x6B ^ 0x49) & (0xFFFFABFF & 0x5FAD);
        l.var1[17] = 0xFFFFED5B & 0x1FBD;
        l.var1[18] = -(0xFFFFFDDD & 0x3677) & (0xFFFFBFFF & 0x7FDE);
        l.var1[19] = 137 + 123 - 157 + 66 ^ 77 + 159 - 180 + 109;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    private static void var5() {
        var2 = new String[var1[19]];
        l.var2[l.var1[0]] = "Closing our curtain to keep the guy inside:P";
        l.var2[l.var1[1]] = "Couldn't find a house for the current location";
        l.var2[l.var1[5]] = "Couldn't find an NPC to lure. (Trying to leave house)";
        l.var2[l.var1[6]] = "Lure";
        l.var2[l.var1[7]] = "Trade";
        l.var2[l.var1[4]] = "Talk-to";
        l.var2[l.var1[9]] = "Walking to the barman";
        l.var2[l.var1[10]] = "Trading bar guy";
        l.var2[l.var1[11]] = "Trade";
        l.var2[l.var1[12]] = "Lure";
        l.var2[l.var1[13]] = "Trade";
        l.var2[l.var1[14]] = "Talk-to";
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[0];
        while (l.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (((0x49 ^ 0x15) & ~(0x6D ^ 0x31)) == 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var23(Object object) {
        return object == null;
    }

    private static boolean var24(int n2) {
        return n2 == 0;
    }

    private static boolean var25(int n2) {
        return n2 != 0;
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    @Inject
    public BuyingWinesTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.I = squireThievingConfig;
        this.J = squireThieving;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        TileObject var32;
        l var33;
        if (!l.var34(Game.getState(), GameState.LOGGED_IN) || !l.var34((Object)this.I.method(), (Object)b.BLACK_JACK) || l.var24(this.I.buyWines() ? 1 : 0)) {
            return var1[0];
        }
        int var35 = Inventory.getCount(item -> item.hasAction(k.z));
        if (l.var24(var35)) {
            var33.J.a(var1[1]);
            0;
            if (2 != 2) {
                return ((139 + 34 - -23 + 0 ^ 14 + 76 - 82 + 147) & (0xB1 ^ 0xB7 ^ (0xA ^ 0x53) ^ -1)) != 0;
            }
        } else if (l.var24(Inventory.getFreeSlots())) {
            var33.J.a(var1[0]);
        }
        if (l.var24(var33.J.i() ? 1 : 0)) {
            return var1[0];
        }
        if (l.var25(Shop.isOpen() ? 1 : 0)) {
            if (l.var24(Shop.getStock((int)var1[2]))) {
                var33.K = var1[1];
                Keyboard.type((char)var1[3]);
                return var1[1];
            }
            Shop.buyFifty((int)var1[2]);
            return var1[1];
        }
        if (l.var25(var33.K)) {
            int var36 = Worlds.getCurrentId();
            World var37 = Worlds.getRandom(world -> {
                int n3;
                if (l.var25(world.isNormal() ? 1 : 0) && l.var25(world.isMembers() ? 1 : 0) && l.var38(world.getId(), var36)) {
                    n3 = var1[1];
                    0;
                    if ((0x3E ^ 0x3A) == -1) {
                        return ((0xB8 ^ 0x8E) & ~(0xBD ^ 0x8B)) != 0;
                    }
                } else {
                    n3 = var1[0];
                }
                return n3 != 0;
            });
            Worlds.hopTo((World)var37);
            var33.K = var1[0];
            return var1[1];
        }
        if (l.var24(Worlds.isHopperOpen() ? 1 : 0)) {
            Worlds.openHopper();
            return var1[1];
        }
        Player var36 = Players.getLocal();
        WorldPoint var37 = var36.getWorldLocation();
        c var39 = var33.J.b().t();
        TileObject var40 = var33.J.a(var39, var1[0]);
        WorldArea[] worldAreaArray = new WorldArea[var1[1]];
        worldAreaArray[l.var1[0]] = var39.p();
        if (l.var24(var37.isInArea(worldAreaArray) ? 1 : 0) && l.var4(var40) && l.var15(var40.distanceTo((Locatable)var36), var1[4])) {
            Log.info((String)var2[var1[0]]);
            var33.J.a(var36, var1[0]);
            0;
            return var1[1];
        }
        if (l.var24(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        c var41 = c.b(var36.getWorldLocation());
        if (l.var23((Object)var41)) {
            Log.info((String)var2[var1[1]]);
            var41 = var33.J.b().t();
        }
        c var42 = var41;
        if (l.var25(var41.p().contains((Locatable)var36) ? 1 : 0)) {
            var32 = var33.J.a(var41, var1[1]);
            if (l.var4(var32)) {
                return var33.J.a(var36, var1[1]);
            }
            NPC var43 = NPCs.getNearest(nPC -> {
                int n2;
                block2: {
                    block3: {
                        if (!l.var4(nPC)) break block2;
                        WorldArea[] worldAreaArray = new WorldArea[var1[1]];
                        worldAreaArray[l.var1[0]] = var42.p();
                        if (!l.var24(nPC.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) break block2;
                        String[] stringArray = new String[var1[1]];
                        stringArray[l.var1[0]] = var2[var1[12]];
                        if (!l.var24(nPC.hasAction(stringArray) ? 1 : 0)) break block3;
                        String[] stringArray2 = new String[var1[1]];
                        stringArray2[l.var1[0]] = var2[var1[13]];
                        if (!l.var24(nPC.hasAction(stringArray2) ? 1 : 0)) break block3;
                        String[] stringArray3 = new String[var1[1]];
                        stringArray3[l.var1[0]] = var2[var1[14]];
                        if (!l.var25(nPC.hasAction(stringArray3) ? 1 : 0)) break block2;
                    }
                    n2 = var1[1];
                    0;
                    if ((0x48 ^ 0x72 ^ (0x68 ^ 0x56)) > -1) return n2 != 0;
                    return ((50 + 51 - 28 + 155 ^ 106 + 121 - 135 + 101) & (0x52 ^ 0x74 ^ 3 ^ -1)) != 0;
                }
                n2 = var1[0];
                return n2 != 0;
            });
            if (l.var23(var43)) {
                Log.info((String)var2[var1[5]]);
                return var1[0];
            }
            String[] stringArray = new String[var1[6]];
            stringArray[l.var1[0]] = var2[var1[6]];
            stringArray[l.var1[1]] = var2[var1[7]];
            stringArray[l.var1[5]] = var2[var1[4]];
            var43.interact(stringArray);
        }
        int[] nArray = new int[var1[1]];
        nArray[l.var1[0]] = var1[8];
        var32 = NPCs.getNearest((int[])nArray);
        if (l.var23(var32)) {
            Log.info((String)var2[var1[9]]);
            Movement.walkTo((WorldPoint)G.getRandom(), (boolean)var1[0]);
            0;
            0;
            if (((139 + 57 - 105 + 154 ^ 22 + 68 - -7 + 87) & (0xE4 ^ 0x9F ^ (0xA4 ^ 0x92) ^ -1)) >= 2) {
                return ((0x4A ^ 0x5A ^ (0xE3 ^ 0xBC)) & (54 + 224 - 256 + 218 ^ 156 + 96 - 77 + 16 ^ -1)) != 0;
            }
        } else {
            Log.info((String)var2[var1[10]]);
            var32.interact(var2[var1[11]]);
        }
        return var1[1];
    }

    private static boolean var34(Object object, Object object2) {
        return object == object2;
    }

    static {
        l.var3();
        l.var5();
        H = var1[8];
        F = new WorldPoint(var1[15], var1[16], var1[0]);
        G = new WorldArea(var1[17], var1[18], var1[14], var1[10], var1[0]);
    }

    private static boolean var38(int n2, int n3) {
        return n2 != n3;
    }
}

