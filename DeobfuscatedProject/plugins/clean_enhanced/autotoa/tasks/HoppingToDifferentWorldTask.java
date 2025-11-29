/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.World
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Objects;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Hopping to different world", priority=1000, blocking=true, register=true)
public class HoppingToDifferentWorldTask
extends ck {
    
    private  World hS;

    private static  boolean b(World world, World world2) {
        int n2;
        if (cj.var3(world2.getId(), world.getId()) && cj.var4(world2.isNormal() ? 1 : 0) && cj.var4(world2.isMembers() ? 1 : 0) && cj.var4(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0)) {
            n2 = var2[4];
            0;
            if (1 < 0) {
                return ((0xE8 ^ 0xA3) & ~(0xCF ^ 0x84)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static  boolean a(World world, World world2) {
        int n2;
        if (cj.var3(world2.getId(), world.getId()) && cj.var4(world2.isNormal() ? 1 : 0)) {
            n2 = var2[4];
            0;
            if (1 <= ((0x1D ^ 0x21) & ~(5 ^ 0x39))) {
                return ((0x19 ^ 7) & ~(0xA6 ^ 0xB8)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var5_5;
        void var4_4;
        cj var13;
        if (cj.var4(this.hY.disableHopping() ? 1 : 0)) {
            return var2[0];
        }
        if (cj.var12(Game.getState(), GameState.LOGGED_IN)) {
            return var2[0];
        }
        Widget var14 = Widgets.get((int)var2[1], (int)var2[2]);
        if (cj.var4(Widgets.isVisible((Widget)var14) ? 1 : 0)) {
            return var2[0];
        }
        Widget var15 = var13.cu.getWidget(var2[3]);
        if (cj.var4(Widgets.isVisible((Widget)var15) ? 1 : 0)) {
            return var2[0];
        }
        if (cj.var4(Bank.isOpen() ? 1 : 0)) {
            return var2[0];
        }
        BankLoadout var16 = (BankLoadout)var13.hY.loadout().selected(BankLoadout.class);
        if (cj.var17(var16.needsToBank() ? 1 : 0)) {
            var13.hS = Worlds.getCurrentWorld();
            return var2[0];
        }
        Log.info((String)var1[var2[0]]);
        World var18 = Worlds.getCurrentWorld();
        if (cj.var19(var18)) {
            Log.info((String)var1[var2[4]]);
            return var2[4];
        }
        if (cj.var20(var13.hS) && cj.var3(var18.getId(), var13.hS.getId())) {
            Log.info((String)var1[var2[5]]);
            return var2[0];
        }
        World var21 = var13.a(var18);
        if (cj.var19(var21)) {
            Log.info((String)var1[var2[2]]);
            return var2[4];
        }
        if (cj.var17(Worlds.isHopperOpen() ? 1 : 0)) {
            Log.info((String)var1[var2[6]]);
            Worlds.openHopper();
            return var2[4];
        }
        this.sleep(var2[7]);
        this.hS = var4_4;
        Worlds.hopTo((World)var5_5);
        Log.info((String)var1[var2[8]]);
        return var2[4];
    }

    private static boolean var20(Object object) {
        return object != null;
    }

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var2[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var2[0];
        while (cj.var5(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (-(0x9C ^ 0xB0 ^ (0xA ^ 0x22)) <= 0) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    private static void var32() {
        var2 = new int[13];
        cj.var2[0] = (0x47 ^ 5 ^ (0x84 ^ 0x81)) & (199 + 64 - 232 + 196 ^ 95 + 31 - 120 + 158 ^ -1);
        cj.var2[1] = 0xFFFF9F5A & 0x62FF;
        cj.var2[2] = 3;
        cj.var2[3] = 0xFFFFD57D & 0x3042AC2;
        cj.var2[4] = 1;
        cj.var2[5] = 2;
        cj.var2[6] = 112 + 89 - 156 + 111 ^ 82 + 84 - 111 + 97;
        cj.var2[7] = 0xE6 ^ 0xAB ^ (0x12 ^ 0x77);
        cj.var2[8] = 0x26 ^ 0x3F ^ (0x26 ^ 0x3A);
        cj.var2[9] = 129 + 112 - 180 + 129 ^ 55 + 166 - 172 + 135;
        cj.var2[10] = 0xFFFF93F8 & 0x6E5F;
        cj.var2[11] = 0x71 ^ 0x76;
        cj.var2[12] = 0x3A ^ 0x32;
    }

    /*
     * WARNING - void declaration
     */
    private World a(World world) {
        World world3;
        void var33;
        String string = this.hY.worldsHopping();
        if (cj.var17(string.isEmpty() ? 1 : 0)) {
            String[] stringArray = string.split(var1[var2[9]]);
            return Worlds.getRandom(world2 -> {
                int n2;
                if (cj.var3(world2.getId(), world.getId()) && cj.var4(Stream.of(stringArray).anyMatch(string -> String.valueOf(world2.getId()).equals(string)) ? 1 : 0)) {
                    n2 = var2[4];
                    0;
                    if (1 < 0) {
                        return ((0x96 ^ 0xC4 ^ (3 ^ 8) & ~(0x7D ^ 0x76)) & (0xE3 ^ 0x97 ^ (0x81 ^ 0xA7) ^ -1)) != 0;
                    }
                } else {
                    n2 = var2[0];
                }
                return n2 != 0;
            });
        }
        World var34 = Worlds.getRandom(arg_0 -> cj.c((World)var33, arg_0));
        if (cj.var19(var34) && cj.var19(var34 = Worlds.getRandom(arg_0 -> cj.b((World)var33, arg_0)))) {
            world3 = Worlds.getRandom(arg_0 -> cj.a((World)var33, arg_0));
        }
        return world3;
    }

        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }

    @Inject
    protected HoppingToDifferentWorldTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void var41() {
        var1 = new String[var2[11]];
        cj.var1[cj.var2[0]] = "[HopTask] Need to hop";
        cj.var1[cj.var2[4]] = "[HopTask] Cannot determine our current world";
        cj.var1[cj.var2[5]] = "[HopTask] No need to hop since we are already on a different world";
        cj.var1[cj.var2[2]] = "[HopTask] Failing to find a world to hop to??";
        cj.var1[cj.var2[6]] = "[HopTask] World hopper is not open";
        cj.var1[cj.var2[8]] = "[HopTask] We just hopped";
        cj.var1[cj.var2[9]] = ",";
    }

    static {
        cj.var32();
        cj.var41();
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static  boolean c(World world, World world2) {
        int n2;
        if (cj.var3(world2.getId(), world.getId()) && cj.var4(world2.isNormal() ? 1 : 0) && cj.var4(world2.isMembers() ? 1 : 0) && cj.var4(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0) && cj.var5(world2.getPlayerCount(), var2[10])) {
            n2 = var2[4];
            0;
            if (3 <= 0) {
                return ((0xF ^ 0x5A) & ~(0xCD ^ 0x98)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }
}

