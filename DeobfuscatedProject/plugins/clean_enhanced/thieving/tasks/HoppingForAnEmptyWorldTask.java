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
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.util.List;
import java.util.function.Predicate;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GameEnum2;
import gg.squire.thieving.tasks.GameEnum4;

@TaskDesc(name="Hopping for an empty world", priority=4, blocking=true)
public class HoppingForAnEmptyWorldTask
extends Task {
    private final  SquireThieving O;

    private final  Predicate<NPC> P;
    private final  SquireThievingConfig N;

    private static void var3() {
        var1 = new int[12];
        n.var1[0] = (0x20 ^ 0x30) & ~(0x7D ^ 0x6D);
        n.var1[1] = -1;
        n.var1[2] = 1;
        n.var1[3] = 2;
        n.var1[4] = 3;
        n.var1[5] = 0xBC ^ 0xB8;
        n.var1[6] = 0x2D ^ 0x2A ^ 2;
        n.var1[7] = 0x4D ^ 0x4B;
        n.var1[8] = 0x87 ^ 0x80;
        n.var1[9] = 0x91 ^ 0x99;
        n.var1[10] = 45 + 73 - -11 + 61 ^ 31 + 62 - 25 + 115;
        n.var1[11] = 0xED ^ 0x80 ^ (0x70 ^ 0x17);
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    public HoppingForAnEmptyWorldTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.P = nPC -> {
            int n2;
            if (n.var10(nPC.getName().contains(var2[var1[9]]) ? 1 : 0) && n.var10(nPC.getName().equals(var2[var1[10]]) ? 1 : 0)) {
                n2 = var1[2];
                0;
                if (((0x6D ^ 0x4E ^ (0xA8 ^ 0x83)) & (0x7B ^ 0x25 ^ (0x7D ^ 0x2B) ^ -1)) != 0) {
                    return ((0x57 ^ 0x10 ^ (0xB0 ^ 0xB8)) & (0x31 ^ 0x72 ^ (0x40 ^ 0x4C) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        };
        this.N = squireThievingConfig;
        this.O = squireThieving;
    }

    private static void var11() {
        var2 = new String[var1[11]];
        n.var2[n.var1[0]] = "Hopping to go back to saved world {}";
        n.var2[n.var1[2]] = "Housed NPCs: {}";
        n.var2[n.var1[3]] = "Hopping because there are {} NPCs in our house";
        n.var2[n.var1[4]] = "Hopping because player {} is in the area blackjacking!";
        n.var2[n.var1[5]] = "Rana the Dyer";
        n.var2[n.var1[6]] = "Villager";
        n.var2[n.var1[7]] = "Pick-up";
        n.var2[n.var1[8]] = "Dismiss";
        n.var2[n.var1[9]] = "Rana";
        n.var2[n.var1[10]] = "Villager";
    }

    /*
     * WARNING - void declaration
     */
    private boolean C() {
        void var2_2;
        World var12;
        n var13;
        if (n.var10(Shop.isOpen() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
        }
        int var14 = var13.O.e();
        if (n.var15(Worlds.getCurrentId(), var14)) {
            var13.O.a(var1[1]);
            return var1[2];
        }
        if (n.var16(var14, var1[1])) {
            var12 = Worlds.getFirst((int)var14);
            0;
            
        } else {
            var12 = Worlds.getFirst(world -> {
                int n2;
                if (n.var10(world.isNormal() ? 1 : 0) && n.var15(world.getLocation(), Worlds.getCurrentWorld().getLocation()) && n.var10(world.isMembers() ? 1 : 0) && n.var17(world.getId(), Worlds.getCurrentId())) {
                    n2 = var1[2];
                    0;
                    if (1 == 2) {
                        return ((0xAA ^ 0xA3 ^ (0xAE ^ 0x8E)) & (0x74 ^ 0x43 ^ (0x19 ^ 7) ^ -1)) != 0;
                    }
                } else {
                    n2 = var1[0];
                }
                return n2 != 0;
            });
        }
        if (n.var18(var12) && n.var18(var12 = Worlds.getFirst(world -> {
            int n2;
            if (n.var10(world.isNormal() ? 1 : 0) && n.var10(world.isMembers() ? 1 : 0) && n.var15(world.getLocation(), Worlds.getCurrentWorld().getLocation())) {
                n2 = var1[2];
                0;
                if (((0xF ^ 0x79 ^ (0x5B ^ 0x1D)) & (0xE6 ^ 0xBB ^ (0x26 ^ 0x4B) ^ -1)) > 3) {
                    return ((30 + 154 - 74 + 65 ^ 115 + 78 - 124 + 80) & (0x1C ^ 7 ^ (0x1D ^ 0x3C) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        }))) {
            return var1[0];
        }
        Worlds.hopTo((World)var2_2);
        return var1[2];
    }

    private static boolean var17(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static boolean var19(int n2) {
        return n2 == 0;
    }

    private static boolean var16(int n2, int n3) {
        return n2 != n3;
    }

    static {
        n.var3();
        n.var11();
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var1[0];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var1[0];
        while (n.var29(var28, var27)) {
            char var30 = var26[var28];
            var23.append((char)(var30 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if ((0xC0 ^ 0xC4) > 2) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    private static boolean var31(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var29(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var32(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var33(Object object) {
        return object != null;
    }

    private static boolean var15(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        n var34;
        if (n.var32((Object)this.N.method(), (Object)b.BLACK_JACK)) {
            return var1[0];
        }
        if (n.var10(var34.O.i() ? 1 : 0)) {
            return var1[0];
        }
        d var35 = var34.O.b();
        c var36 = var35.t();
        List var37 = NPCs.getAll(nPC -> {
            int n2;
            if (n.var10(var35.t().p().contains((Locatable)nPC) ? 1 : 0) && n.var19(nPC.getName().equals(var2[var1[5]]) ? 1 : 0) && n.var19(nPC.getName().equals(var2[var1[6]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[2]];
                stringArray[n.var1[0]] = var2[var1[7]];
                if (n.var19(nPC.hasAction(stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[var1[2]];
                    stringArray2[n.var1[0]] = var2[var1[8]];
                    if (n.var19(nPC.hasAction(stringArray2) ? 1 : 0)) {
                        n2 = var1[2];
                        0;
                        if (((0x6F ^ 0x5C) & ~(0xA1 ^ 0x92)) >= ((0x1D ^ 0x2C) & ~(0x51 ^ 0x60))) return n2 != 0;
                        return ((0x8D ^ 0xB4) & ~(0x5F ^ 0x66)) != 0;
                    }
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
        if (n.var16(var34.O.e(), var1[1]) && n.var16(Worlds.getCurrentId(), var34.O.e())) {
            Object[] objectArray = new Object[var1[2]];
            objectArray[n.var1[0]] = var34.O.e();
            Log.info((String)var2[var1[0]], (Object[])objectArray);
            return var34.C();
        }
        if (n.var17(var37.size(), var1[2])) {
            Object[] objectArray = new Object[var1[2]];
            objectArray[n.var1[0]] = var37;
            Log.info((String)var2[var1[2]], (Object[])objectArray);
            Object[] objectArray2 = new Object[var1[2]];
            objectArray2[n.var1[0]] = var37.size();
            Log.info((String)var2[var1[3]], (Object[])objectArray2);
            return var34.C();
        }
        if (n.var32(Game.getState(), GameState.LOGGED_IN)) {
            boolean bl;
            if (n.var31(Game.getState(), GameState.HOPPING)) {
                bl = var1[2];
                0;
                if ((0x11 ^ 0x30 ^ (0x9D ^ 0xB8)) < 0) {
                    return ((103 + 108 - 116 + 73 ^ 121 + 28 - 138 + 118) & (0x74 ^ 0x54 ^ (0xE ^ 7) ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        }
        Player var38 = Players.getLocal();
        Player var39 = Players.getNearest(player2 -> {
            int n2;
            if (n.var32(player2, var38) && n.var10(var36.p().contains((Locatable)player2) ? 1 : 0) && n.var33(player2.getInteracting())) {
                n2 = var1[2];
                0;
                if (((0x31 ^ 0x14) & ~(0xBC ^ 0x99)) != ((0xCD ^ 0xC3) & ~(0x40 ^ 0x4E))) {
                    return (2 & ~2) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
        if (n.var18(var39)) {
            return var1[0];
        }
        Object[] objectArray = new Object[var1[2]];
        objectArray[n.var1[0]] = var5_5.getName();
        Log.info((String)var2[var1[4]], (Object[])objectArray);
        return this.C();
    }

    private static boolean var18(Object object) {
        return object == null;
    }

        catch (Exception var45) {
            var45.printStackTrace();
            return null;
        }
    }
}

