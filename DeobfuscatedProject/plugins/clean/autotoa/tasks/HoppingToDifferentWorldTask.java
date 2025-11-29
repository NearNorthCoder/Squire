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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Hopping to different world", priority=1000, blocking=true, register=true)
public class HoppingToDifferentWorldTask
extends AutotoaTaskBase {
    
    private  World hS;

    private static  boolean b(World world, World world2) {
        int n2;
        if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(world2.isNormal() ? 1 : 0) && cj.lIIllIllIlIIll(world2.isMembers() ? 1 : 0) && cj.lIIllIllIlIIll(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0)) {
            n2 = lIlllllIlIl[4];

            if (1 < 0) {
                return false;
            }
        } else {
            n2 = lIlllllIlIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIIllIllIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static  boolean a(World world, World world2) {
        int n2;
        if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(world2.isNormal() ? 1 : 0)) {
            n2 = lIlllllIlIl[4];

            if (1 <= ((0x1D ^ 0x21) & ~(5 ^ 0x39))) {
                return false;
            }
        } else {
            n2 = lIlllllIlIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIIllIllIlIlII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var5_5;
        void var4_4;
        cj var1;
        if (cj.lIIllIllIlIIll(this.hY.disableHopping() ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        if (cj.lIIllIllIlIlII(Game.getState(), GameState.LOGGED_IN)) {
            return lIlllllIlIl[0];
        }
        Widget var2 = Widgets.get((int)lIlllllIlIl[1], (int)lIlllllIlIl[2]);
        if (cj.lIIllIllIlIIll(Widgets.isVisible((Widget)var2) ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        Widget var3 = var1.cu.getWidget(lIlllllIlIl[3]);
        if (cj.lIIllIllIlIIll(Widgets.isVisible((Widget)var3) ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        if (cj.lIIllIllIlIIll(Bank.isOpen() ? 1 : 0)) {
            return lIlllllIlIl[0];
        }
        BankLoadout var4 = (BankLoadout)var1.hY.loadout().selected(BankLoadout.class);
        if (cj.lIIllIllIlIlIl(var4.needsToBank() ? 1 : 0)) {
            var1.hS = Worlds.getCurrentWorld();
            return lIlllllIlIl[0];
        }
        Log.info((String)lIlllllIIll[lIlllllIlIl[0]]);
        World var5 = Worlds.getCurrentWorld();
        if (cj.lIIllIllIlIllI(var5)) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[4]]);
            return lIlllllIlIl[4];
        }
        if (cj.lIIllIllIlIlll(var1.hS) && cj.lIIllIllIllIII(var5.getId(), var1.hS.getId())) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[5]]);
            return lIlllllIlIl[0];
        }
        World var6 = var1.a(var5);
        if (cj.lIIllIllIlIllI(var6)) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[2]]);
            return lIlllllIlIl[4];
        }
        if (cj.lIIllIllIlIlIl(Worlds.isHopperOpen() ? 1 : 0)) {
            Log.info((String)lIlllllIIll[lIlllllIlIl[6]]);
            Worlds.openHopper();
            return lIlllllIlIl[4];
        }
        this.sleep(lIlllllIlIl[7]);
        this.hS = var4_4;
        Worlds.hopTo((World)var5_5);
        Log.info((String)lIlllllIIll[lIlllllIlIl[8]]);
        return lIlllllIlIl[4];
    }

    private static boolean lIIllIllIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIIllIllIllIII(int n2, int n3) {
        return n2 != n3;
    }

        return String.valueOf(var7);
    }

    private static boolean lIIllIllIlIlIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private World a(World world) {
        World world3;
        void var8;
        String string = this.hY.worldsHopping();
        if (cj.lIIllIllIlIlIl(string.isEmpty() ? 1 : 0)) {
            String[] stringArray = string.split(lIlllllIIll[lIlllllIlIl[9]]);
            return Worlds.getRandom(world2 -> {
                int n2;
                if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(Stream.of(stringArray).anyMatch(string -> String.valueOf(world2.getId()).equals(string)) ? 1 : 0)) {
                    n2 = lIlllllIlIl[4];

                    if (1 < 0) {
                        return ((0x96 ^ 0xC4 ^ (3 ^ 8) & ~(0x7D ^ 0x76)) & (0xE3 ^ 0x97 ^ (0x81 ^ 0xA7) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlllllIlIl[0];
                }
                return n2 != 0;
            });
        }
        World var9 = Worlds.getRandom(arg_0 -> cj.c((World)var8, arg_0));
        if (cj.lIIllIllIlIllI(var9) && cj.lIIllIllIlIllI(var9 = Worlds.getRandom(arg_0 -> cj.b((World)var8, arg_0)))) {
            world3 = Worlds.getRandom(arg_0 -> cj.a((World)var8, arg_0));
        }
        return world3;
    }

    @Inject
    protected HoppingToDifferentWorldTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void lIIllIllIIllIl() {
        lIlllllIIll = new String[lIlllllIlIl[11]];
        cj.lIlllllIIll[cj.lIlllllIlIl[0]] = "[HopTask] Need to hop";
        cj.lIlllllIIll[cj.lIlllllIlIl[4]] = "[HopTask] Cannot determine our current world";
        cj.lIlllllIIll[cj.lIlllllIlIl[5]] = "[HopTask] No need to hop since we are already on a different world";
        cj.lIlllllIIll[cj.lIlllllIlIl[2]] = "[HopTask] Failing to find a world to hop to??";
        cj.lIlllllIIll[cj.lIlllllIlIl[6]] = "[HopTask] World hopper is not open";
        cj.lIlllllIIll[cj.lIlllllIlIl[8]] = "[HopTask] We just hopped";
        cj.lIlllllIIll[cj.lIlllllIlIl[9]] = ",";
    }

    static {
        cj.lIIllIllIlIIlI();
        cj.lIIllIllIIllIl();
    }

    private static boolean lIIllIllIlIllI(Object object) {
        return object == null;
    }

    private static boolean lIIllIllIlIIll(int n2) {
        return n2 != 0;
    }

    private static  boolean c(World world, World world2) {
        int n2;
        if (cj.lIIllIllIllIII(world2.getId(), world.getId()) && cj.lIIllIllIlIIll(world2.isNormal() ? 1 : 0) && cj.lIIllIllIlIIll(world2.isMembers() ? 1 : 0) && cj.lIIllIllIlIIll(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0) && cj.lIIllIllIllIIl(world2.getPlayerCount(), lIlllllIlIl[10])) {
            n2 = lIlllllIlIl[4];

            if (3 <= 0) {
                return false;
            }
        } else {
            n2 = lIlllllIlIl[0];
        }
        return n2 != 0;
    }
}

