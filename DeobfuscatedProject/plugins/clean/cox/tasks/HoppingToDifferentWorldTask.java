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

import gg.squire.cox.tasks.CoxTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;

@TaskDesc(name="Hopping to different world", priority=2147483548, blocking=true, register=true)
public class HoppingToDifferentWorldTask
extends CoxTaskBase {

    private  World dv;

        return String.valueOf(var1);
    }

    private static boolean llIlIllIlIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIllIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIllIlIIllI(Object object) {
        return object == null;
    }

    private static  boolean b(World world, World world2) {
        int n2;
        if (aw.llIlIllIlIlIII(world2.getId(), world.getId()) && aw.llIlIllIlIlIIl(world2.isNormal() ? 1 : 0) && aw.llIlIllIlIlIIl(world2.isMembers() ? 1 : 0) && aw.llIlIllIlIlIIl(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0)) {
            n2 = lIlIIIllIIIl[1];

            if (1 < 0) {
                return false;
            }
        } else {
            n2 = lIlIIIllIIIl[0];
        }
        return n2 != 0;
    }

    private static boolean llIlIllIlIlIII(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public HoppingToDifferentWorldTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.v = squireChambersPlugin;
        this.k = squireChambersConfig;
    }

    private static void llIlIllIlIIIlI() {
        lIlIIIllIIII = new String[lIlIIIllIIIl[9]];
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[0]] = "[HopTask] Need to hop";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[1]] = "[HopTask] Cannot determine our current world";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[2]] = "[HopTask] No need to hop since we are already on a different world";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[3]] = "[HopTask] Failing to find a world to hop to??";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[4]] = "[HopTask] World hopper is not open";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[6]] = "[HopTask] We just hopped";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[7]] = ",";
    }

    static {
        aw.llIlIllIlIIIll();
        aw.llIlIllIlIIIlI();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        void var1_1;
        aw var2;
        if (aw.llIlIllIlIIlII(this.k.enableHopping() ? 1 : 0)) {
            return lIlIIIllIIIl[0];
        }
        if (aw.llIlIllIlIIlIl(Game.getState(), GameState.LOGGED_IN)) {
            return lIlIIIllIIIl[0];
        }
        Log.info((String)lIlIIIllIIII[lIlIIIllIIIl[0]]);
        World var3 = Worlds.getCurrentWorld();
        if (aw.llIlIllIlIIllI(var3)) {
            Log.info((String)lIlIIIllIIII[lIlIIIllIIIl[1]]);
            return lIlIIIllIIIl[1];
        }
        if (aw.llIlIllIlIIlll(var2.dv) && aw.llIlIllIlIlIII(var3.getId(), var2.dv.getId())) {
            Log.info((String)lIlIIIllIIII[lIlIIIllIIIl[2]]);
            return lIlIIIllIIIl[0];
        }
        World var4 = var2.a(var3);
        if (aw.llIlIllIlIIllI(var4)) {
            Log.info((String)lIlIIIllIIII[lIlIIIllIIIl[3]]);
            return lIlIIIllIIIl[1];
        }
        if (aw.llIlIllIlIIlII(Worlds.isHopperOpen() ? 1 : 0)) {
            Log.info((String)lIlIIIllIIII[lIlIIIllIIIl[4]]);
            Worlds.openHopper();
            return lIlIIIllIIIl[1];
        }
        this.dv = var1_1;
        this.sleep(lIlIIIllIIIl[5]);
        Worlds.hopTo((World)var2_2);
        Log.info((String)lIlIIIllIIII[lIlIIIllIIIl[6]]);
        return lIlIIIllIIIl[1];
    }

    private static  boolean a(World world, World world2) {
        int n2;
        if (aw.llIlIllIlIlIII(world2.getId(), world.getId()) && aw.llIlIllIlIlIIl(world2.isNormal() ? 1 : 0)) {
            n2 = lIlIIIllIIIl[1];

            }
        } else {
            n2 = lIlIIIllIIIl[0];
        }
        return n2 != 0;
    }

    private static boolean llIlIllIlIIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static  boolean c(World world, World world2) {
        int n2;
        if (aw.llIlIllIlIlIII(world2.getId(), world.getId()) && aw.llIlIllIlIlIIl(world2.isNormal() ? 1 : 0) && aw.llIlIllIlIlIIl(world2.isMembers() ? 1 : 0) && aw.llIlIllIlIlIIl(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0) && aw.llIlIllIlIlIlI(world2.getPlayerCount(), lIlIIIllIIIl[8])) {
            n2 = lIlIIIllIIIl[1];

        } else {
            n2 = lIlIIIllIIIl[0];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private World a(World world) {
        World world3;
        void var5;
        String string = this.k.worldsHopping();
        if (aw.llIlIllIlIIlII(string.isEmpty() ? 1 : 0)) {
            String[] stringArray = string.split(lIlIIIllIIII[lIlIIIllIIIl[7]]);
            return Worlds.getRandom(world2 -> {
                int n2;
                if (aw.llIlIllIlIlIII(world2.getId(), world.getId()) && aw.llIlIllIlIlIIl(Stream.of(stringArray).anyMatch(string -> String.valueOf(world2.getId()).equals(string)) ? 1 : 0)) {
                    n2 = lIlIIIllIIIl[1];

                    if (2 >= 3) {
                        return false;
                    }
                } else {
                    n2 = lIlIIIllIIIl[0];
                }
                return n2 != 0;
            });
        }
        World var6 = Worlds.getRandom(arg_0 -> aw.c((World)var5, arg_0));
        if (aw.llIlIllIlIIllI(var6) && aw.llIlIllIlIIllI(var6 = Worlds.getRandom(arg_0 -> aw.b((World)var5, arg_0)))) {
            world3 = Worlds.getRandom(arg_0 -> aw.a((World)var5, arg_0));
        }
        return world3;
    }

    private static boolean llIlIllIlIIlll(Object object) {
        return object != null;
    }

    @Subscribe
    private void a(GameTick gameTick) {
        if (aw.llIlIllIlIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            this.dv = Worlds.getCurrentWorld();
        }
    }
}

