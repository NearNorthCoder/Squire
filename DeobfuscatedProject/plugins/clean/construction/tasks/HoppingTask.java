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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    
    private final  RelogConfig dU;
    private  int dV;

    private static boolean lIlllIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlllIIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static void lIllIllllll() {
        llIlIIlII = new String[llIlIIlIl[5]];
        aC.llIlIIlII[aC.llIlIIlIl[0]] = "[Relog Hopper] Staying in region";
        aC.llIlIIlII[aC.llIlIIlIl[1]] = "[Relog Hopper] Hopping specific world";
        aC.llIlIIlII[aC.llIlIIlIl[2]] = ",";
        aC.llIlIIlII[aC.llIlIIlIl[3]] = "[Relog Hopper] Hopping random";
    }

    private static boolean lIlllIIIlII(Object object) {
        return object == null;
    }

    @Inject
    public HoppingTask(RelogConfig relogConfig) {
        this.dU = relogConfig;
        this.dV = Static.getClient().getTickCount();
    }

    public boolean run() {
        aC lIllIIIlIIllIII;
        if (aC.lIlllIIIIIl(Game.getState(), GameState.LOGGED_IN)) {
            return llIlIIlIl[0];
        }
        if (aC.lIlllIIIIlI(lIllIIIlIIllIII.bU() ? 1 : 0)) {
            return llIlIIlIl[0];
        }
        if (aC.lIlllIIIIll(lIllIIIlIIllIII.dU.logOutPlayer() ? 1 : 0)) {
            return llIlIIlIl[0];
        }
        if (aC.lIlllIIIIll(Static.getClient().isInInstancedRegion() ? 1 : 0) && aC.lIlllIIIIll(lIllIIIlIIllIII.dU.ignoreInstances() ? 1 : 0)) {
            return llIlIIlIl[0];
        }
        World lIllIIIlIIlIlll = Worlds.getCurrentWorld();
        if (aC.lIlllIIIlII(lIllIIIlIIlIlll)) {
            return llIlIIlIl[0];
        }
        if (aC.lIlllIIIIll(lIllIIIlIIllIII.dU.stayInRegion() ? 1 : 0)) {
            Log.info((String)llIlIIlII[llIlIIlIl[0]]);
            Worlds.hopTo((World)Worlds.getRandom(world2 -> {
                int n2;
                if (aC.lIlllIIIIll(world2.isNormal() ? 1 : 0) && aC.lIlllIIIllI(world2.getLocation(), lIllIIIlIIlIlll.getLocation()) && aC.lIlllIIIllI(world2.isMembers() ? 1 : 0, lIllIIIlIIlIlll.isMembers() ? 1 : 0) && aC.lIlllIIIlll(world2.getId(), lIllIIIlIIlIlll.getId())) {
                    n2 = llIlIIlIl[1];

                    }
                } else {
                    n2 = llIlIIlIl[0];
                }
                return n2 != 0;
            }));
        }
        if (aC.lIlllIIIIll(lIllIIIlIIllIII.dU.hopSpecificWorlds() ? 1 : 0)) {
            Log.info((String)llIlIIlII[llIlIIlIl[1]]);
            String[] lIllIIIlIIlIllI = lIllIIIlIIllIII.dU.worlds().split(llIlIIlII[llIlIIlIl[2]]);
            Worlds.hopTo((World)Worlds.getRandom(world -> Stream.of(lIllIIIlIIlIllI).anyMatch(string -> {
                boolean bl2;
                if (aC.lIlllIIIllI(world.getId(), Integer.parseInt(string.trim()))) {
                    bl2 = llIlIIlIl[1];

                    if (3 <= ((0x10 ^ 0x56) & ~(0xF9 ^ 0xBF))) {
                        return false;
                    }
                } else {
                    bl2 = llIlIIlIl[0];
                }
                return bl2;
            })));

            if ((109 + 97 - 43 + 25 ^ 162 + 96 - 84 + 10) != (0xF5 ^ 0xC5 ^ (0x8A ^ 0xBE))) {
                return ((0x42 ^ 0x72 ^ (0x4B ^ 0x59)) & (0x15 ^ 0x62 ^ (0x55 ^ 0) ^ -1)) != 0;
            }
        } else if (aC.lIlllIIIIlI(lIllIIIlIIllIII.dU.hopSpecificWorlds() ? 1 : 0) && aC.lIlllIIIIlI(lIllIIIlIIllIII.dU.stayInRegion() ? 1 : 0)) {
            Log.info((String)llIlIIlII[llIlIIlIl[3]]);
            Worlds.hopTo((World)Worlds.getRandom(world2 -> {
                int n2;
                if (aC.lIlllIIIIll(world2.isNormal() ? 1 : 0) && aC.lIlllIIIllI(world2.isMembers() ? 1 : 0, lIllIIIlIIlIlll.isMembers() ? 1 : 0) && aC.lIlllIIIlll(world2.getId(), lIllIIIlIIlIlll.getId())) {
                    n2 = llIlIIlIl[1];

                    if (3 <= 0) {
                        return false;
                    }
                } else {
                    n2 = llIlIIlIl[0];
                }
                return n2 != 0;
            }));
        }
        return llIlIIlIl[1];
    }

    @Subscribe
    public void a(WorldHopped worldHopped) {
        this.dV = Static.getClient().getTickCount();
    }

    private static boolean lIlllIIIlll(int n2, int n3) {
        return n2 != n3;
    }

    private boolean bU() {
        int n2;
        aC lIllIIIlIIlIlII;
        if (aC.lIlllIIIIll(this.dU.worldHopPlayer() ? 1 : 0) && aC.lIlllIIIlIl(Players.getAll().size(), llIlIIlIl[1])) {
            return llIlIIlIl[1];
        }
        if (aC.lIlllIIIIll(lIllIIIlIIlIlII.dU.worldHopMinutes()) && aC.lIlllIIIlIl(Static.getClient().getTickCount() - lIllIIIlIIlIlII.dV, llIlIIlIl[4] * lIllIIIlIIlIlII.dU.worldHopMinutes())) {
            n2 = llIlIIlIl[1];

            if (-1 > (0x3D ^ 0x39)) {
                return false;
            }
        } else {
            n2 = llIlIIlIl[0];
        }
        return n2 != 0;
    }

        return String.valueOf(lIllIIIIllllIll);
    }

    private static boolean lIlllIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        aC.lIlllIIIIII();
        aC.lIllIllllll();
    }

    private static boolean lIlllIIlIII(int n2, int n3) {
        return n2 < n3;
    }
}

