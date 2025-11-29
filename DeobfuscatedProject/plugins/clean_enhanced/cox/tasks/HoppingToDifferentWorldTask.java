/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.GameState
 *  net.runelite.api.World
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.Objects;
import java.util.stream.Stream;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;

@TaskDesc(name="Hopping to different world", priority=2147483548, blocking=true, register=true)
public class HoppingToDifferentWorldTask
extends az {

    private  World dv;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0xD ^ 0x41) & ~(0x47 ^ 0xB)) == 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static  boolean b(World world, World world2) {
        int n2;
        if ((world2.getId() != world.getId()) && (world2.isNormal( != 0) ? 1 : 0) && (world2.isMembers( != 0) ? 1 : 0) && (Objects.equals(world2.getLocation( != 0), world.getLocation()) ? 1 : 0)) {
            n2 = 1;
            0;
            if (1 < 0) {
                return ((0x12 ^ 0x22) & ~(0xD ^ 0x3D)) != 0;
            }
        } else {
            n2 = 0;
        }
        return n2 != 0;
    }

    @Inject
    public HoppingToDifferentWorldTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.v = squireChambersPlugin;
        this.k = squireChambersConfig;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        void var1_1;
        aw var13;
        if ((this.k.enableHopping( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Game.getState() != Game.getState()2)) {
            return 0;
        }
        Log.info((String)var1[0]);
        World var14 = Worlds.getCurrentWorld();
        if var14 == null {
            Log.info((String)var1[1]);
            return 1;
        }
        if ((var13.dv != null) && (var14.getId() != var13.dv.getId())) {
            Log.info((String)var1[2]);
            return 0;
        }
        World var15 = var13.a(var14);
        if var15 == null {
            Log.info((String)var1[3]);
            return 1;
        }
        if ((Worlds.isHopperOpen( == 0) ? 1 : 0)) {
            Log.info((String)var1[4]);
            Worlds.openHopper();
            return 1;
        }
        this.dv = var1_1;
        this.sleep(5);
        Worlds.hopTo((World)var2_2);
        Log.info((String)var1[6]);
        return 1;
    }

    private static  boolean a(World world, World world2) {
        int n2;
        if ((world2.getId() != world.getId()) && (world2.isNormal( != 0) ? 1 : 0)) {
            n2 = 1;
            0;
            if null != null {
                return ((0x76 ^ 2 ^ (0xF1 ^ 0xAC)) & (160 + 126 - 231 + 136 ^ 28 + 73 - -21 + 28 ^ -1)) != 0;
            }
        } else {
            n2 = 0;
        }
        return n2 != 0;
    }

    private static  boolean c(World world, World world2) {
        int n2;
        if ((world2.getId() != world.getId()) && (world2.isNormal( != 0) ? 1 : 0) && (world2.isMembers( != 0) ? 1 : 0) && (Objects.equals(world2.getLocation( != 0), world.getLocation()) ? 1 : 0) && (world2.getPlayerCount() < 8)) {
            n2 = 1;
            0;
            if (-2 > 0) {
                return ((0x38 ^ 0x14) & ~(0xE9 ^ 0xC5)) != 0;
            }
        } else {
            n2 = 0;
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private World a(World world) {
        World world3;
        void var16;
        String string = this.k.worldsHopping();
        if ((string.isEmpty( == 0) ? 1 : 0)) {
            String[] stringArray = string.split(var1[7]);
            return Worlds.getRandom(world2 -> {
                int n2;
                if ((world2.getId() != world.getId()) && (Stream.ofstringArray.anyMatch(string -> String.valueOf(world2.getId()).equals(string)) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if (2 >= 3) {
                        return ((0xDC ^ 0x8E) & ~(0x34 ^ 0x66)) != 0;
                    }
                } else {
                    n2 = 0;
                }
                return n2 != 0;
            });
        }
        World var17 = Worlds.getRandom(arg_0 -> aw.c((World)var16, arg_0));
        if (var17 == null && (var17 = Worlds.getRandom(arg_0 -> aw.b(World == nulllllllllllllllllIlllIIIIIIIIIIIlI, arg_0)))) {
            world3 = Worlds.getRandom(arg_0 -> aw.a((World)var16, arg_0));
        }
        return world3;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(GameTick gameTick) {
        if ((Static.getClient( != 0).isInInstancedRegion() ? 1 : 0)) {
            this.dv = Worlds.getCurrentWorld();
        }
    }
}

