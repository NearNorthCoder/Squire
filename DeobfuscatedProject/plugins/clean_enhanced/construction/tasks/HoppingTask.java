/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.GameState
 *  net.runelite.api.World
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.events.WorldHopped
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.log.RelogConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.stream.Stream;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.events.WorldHopped;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;

@TaskDesc(name="Hopping", register=true)
public class HoppingTask
extends Task {
    private static  int[] llIlIIlIl;
    private final  RelogConfig dU;
    private  int dV;
    private static  String[] llIlIIlII;

    private static boolean var1(int n2, int n3) {
        return n2 > n3;
    }

    private static void var2() {
        llIlIIlIl = new int[7];
        aC.llIlIIlIl[0] = (4 + 17 - -111 + 58 ^ 6 + 59 - 19 + 95) & (0x9C ^ 0x86 ^ (0x20 ^ 9) ^ -1);
        aC.llIlIIlIl[1] = 1;
        aC.llIlIIlIl[2] = 2;
        aC.llIlIIlIl[3] = 3;
        aC.llIlIIlIl[4] = (0xD2 ^ 0xB2) & ~(0xE2 ^ 0x82) ^ (0x14 ^ 0x70);
        aC.llIlIIlIl[5] = 0x82 ^ 0x86;
        aC.llIlIIlIl[6] = 0x14 ^ 0x53 ^ (0xC7 ^ 0x88);
    }

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    private static void var4() {
        llIlIIlII = new String[llIlIIlIl[5]];
        aC.llIlIIlII[aC.llIlIIlIl[0]] = "[Relog Hopper] Staying in region";
        aC.llIlIIlII[aC.llIlIIlIl[1]] = "[Relog Hopper] Hopping specific world";
        aC.llIlIIlII[aC.llIlIIlIl[2]] = ",";
        aC.llIlIIlII[aC.llIlIIlIl[3]] = "[Relog Hopper] Hopping random";
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    @Inject
    public HoppingTask(RelogConfig relogConfig) {
        this.dU = relogConfig;
        this.dV = Static.getClient().getTickCount();
    }

    public boolean run() {
        aC var6;
        if (aC.var3(Game.getState(), GameState.LOGGED_IN)) {
            return llIlIIlIl[0];
        }
        if (aC.var7(var6.bU() ? 1 : 0)) {
            return llIlIIlIl[0];
        }
        if (aC.var8(var6.dU.logOutPlayer() ? 1 : 0)) {
            return llIlIIlIl[0];
        }
        if (aC.var8(Static.getClient().isInInstancedRegion() ? 1 : 0) && aC.var8(var6.dU.ignoreInstances() ? 1 : 0)) {
            return llIlIIlIl[0];
        }
        World var9 = Worlds.getCurrentWorld();
        if (aC.var5(var9)) {
            return llIlIIlIl[0];
        }
        if (aC.var8(var6.dU.stayInRegion() ? 1 : 0)) {
            Log.info((String)llIlIIlII[llIlIIlIl[0]]);
            Worlds.hopTo((World)Worlds.getRandom(world2 -> {
                int n2;
                if (aC.var8(world2.isNormal() ? 1 : 0) && aC.var10(world2.getLocation(), var9.getLocation()) && aC.var10(world2.isMembers() ? 1 : 0, var9.isMembers() ? 1 : 0) && aC.var11(world2.getId(), var9.getId())) {
                    n2 = llIlIIlIl[1];
                    0;
                    if null != null {
                        return ((0x2B ^ 0x70 ^ (0x50 ^ 0x3C)) & (0x9A ^ 0x93 ^ (0xAD ^ 0x93) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIlIIlIl[0];
                }
                return n2 != 0;
            }));
        }
        if (aC.var8(var6.dU.hopSpecificWorlds() ? 1 : 0)) {
            Log.info((String)llIlIIlII[llIlIIlIl[1]]);
            String[] var12 = var6.dU.worlds().split(llIlIIlII[llIlIIlIl[2]]);
            Worlds.hopTo((World)Worlds.getRandom(world -> Stream.of(var12).anyMatch(string -> {
                boolean bl2;
                if (aC.var10(world.getId(), Integer.parseInt(string.trim()))) {
                    bl2 = llIlIIlIl[1];
                    0;
                    if (3 <= ((0x10 ^ 0x56) & ~(0xF9 ^ 0xBF))) {
                        return ((0xF0 ^ 0xC1) & ~(0xB3 ^ 0x82)) != 0;
                    }
                } else {
                    bl2 = llIlIIlIl[0];
                }
                return bl2;
            })));
            0;
            if ((109 + 97 - 43 + 25 ^ 162 + 96 - 84 + 10) != (0xF5 ^ 0xC5 ^ (0x8A ^ 0xBE))) {
                return ((0x42 ^ 0x72 ^ (0x4B ^ 0x59)) & (0x15 ^ 0x62 ^ (0x55 ^ 0) ^ -1)) != 0;
            }
        } else if (aC.var7(var6.dU.hopSpecificWorlds() ? 1 : 0) && aC.var7(var6.dU.stayInRegion() ? 1 : 0)) {
            Log.info((String)llIlIIlII[llIlIIlIl[3]]);
            Worlds.hopTo((World)Worlds.getRandom(world2 -> {
                int n2;
                if (aC.var8(world2.isNormal() ? 1 : 0) && aC.var10(world2.isMembers() ? 1 : 0, var9.isMembers() ? 1 : 0) && aC.var11(world2.getId(), var9.getId())) {
                    n2 = llIlIIlIl[1];
                    0;
                    if (3 <= 0) {
                        return ((0xA1 ^ 0x92) & ~(8 ^ 0x3B)) != 0;
                    }
                } else {
                    n2 = llIlIIlIl[0];
                }
                return n2 != 0;
            }));
        }
        return llIlIIlIl[1];
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(WorldHopped worldHopped) {
        this.dV = Static.getClient().getTickCount();
    }

    private static boolean var11(int n2, int n3) {
        return n2 != n3;
    }

    private boolean bU() {
        int n2;
        aC var19;
        if (aC.var8(this.dU.worldHopPlayer() ? 1 : 0) && aC.var1(Players.getAll().size(), llIlIIlIl[1])) {
            return llIlIIlIl[1];
        }
        if (aC.var8(var19.dU.worldHopMinutes()) && aC.var1(Static.getClient().getTickCount() - var19.dV, llIlIIlIl[4] * var19.dU.worldHopMinutes())) {
            n2 = llIlIIlIl[1];
            0;
            if (-1 > (0x3D ^ 0x39)) {
                return ((0xA6 ^ 0x95) & ~(0x32 ^ 1)) != 0;
            }
        } else {
            n2 = llIlIIlIl[0];
        }
        return n2 != 0;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = llIlIIlIl[0];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = llIlIIlIl[0];
        while (aC.var29(var28, var27)) {
            char var30 = var26[var28];
            var23.append((char)(var30 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var23);
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 == n3;
    }

    static {
        aC.var2();
        aC.var4();
    }

    private static boolean var29(int n2, int n3) {
        return n2 < n3;
    }
}

