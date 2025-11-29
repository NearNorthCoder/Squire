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
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.az;
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
public class aw
extends az {
    private static /* synthetic */ String[] lIlIIIllIIII;
    private static /* synthetic */ int[] lIlIIIllIIIl;
    private /* synthetic */ World dv;

    private static String llIlIllIlIIIII(String lllllllllllllllIllIlllllllIlllII, String lllllllllllllllIllIllllllllIIIII) {
        lllllllllllllllIllIlllllllIlllII = new String(Base64.getDecoder().decode(lllllllllllllllIllIlllllllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlllllllIlllll = new StringBuilder();
        char[] lllllllllllllllIllIlllllllIllllI = lllllllllllllllIllIllllllllIIIII.toCharArray();
        int lllllllllllllllIllIlllllllIlllIl = lIlIIIllIIIl[0];
        char[] lllllllllllllllIllIlllllllIlIlll = lllllllllllllllIllIlllllllIlllII.toCharArray();
        int lllllllllllllllIllIlllllllIlIllI = lllllllllllllllIllIlllllllIlIlll.length;
        int lllllllllllllllIllIlllllllIlIlIl = lIlIIIllIIIl[0];
        while (aw.llIlIllIlIlIlI(lllllllllllllllIllIlllllllIlIlIl, lllllllllllllllIllIlllllllIlIllI)) {
            char lllllllllllllllIllIllllllllIIIlI = lllllllllllllllIllIlllllllIlIlll[lllllllllllllllIllIlllllllIlIlIl];
            lllllllllllllllIllIlllllllIlllll.append((char)(lllllllllllllllIllIllllllllIIIlI ^ lllllllllllllllIllIlllllllIllllI[lllllllllllllllIllIlllllllIlllIl % lllllllllllllllIllIlllllllIllllI.length]));
            0;
            ++lllllllllllllllIllIlllllllIlllIl;
            ++lllllllllllllllIllIlllllllIlIlIl;
            0;
            if (((0xD ^ 0x41) & ~(0x47 ^ 0xB)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlllllllIlllll);
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

    private static /* synthetic */ boolean b(World world, World world2) {
        int n2;
        if (aw.llIlIllIlIlIII(world2.getId(), world.getId()) && aw.llIlIllIlIlIIl(world2.isNormal() ? 1 : 0) && aw.llIlIllIlIlIIl(world2.isMembers() ? 1 : 0) && aw.llIlIllIlIlIIl(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0)) {
            n2 = lIlIIIllIIIl[1];
            0;
            if (1 < 0) {
                return ((0x12 ^ 0x22) & ~(0xD ^ 0x3D)) != 0;
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
    public aw(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.v = squireChambersPlugin;
        this.k = squireChambersConfig;
    }

    private static void llIlIllIlIIIlI() {
        lIlIIIllIIII = new String[lIlIIIllIIIl[9]];
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[0]] = aw."[HopTask] Need to hop";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[1]] = aw."[HopTask] Cannot determine our current world";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[2]] = aw."[HopTask] No need to hop since we are already on a different world";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[3]] = aw."[HopTask] Failing to find a world to hop to??";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[4]] = aw."[HopTask] World hopper is not open";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[6]] = aw."[HopTask] We just hopped";
        aw.lIlIIIllIIII[aw.lIlIIIllIIIl[7]] = aw.",";
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
        aw lllllllllllllllIlllIIIIIIIIIlIlI;
        if (aw.llIlIllIlIIlII(this.k.enableHopping() ? 1 : 0)) {
            return lIlIIIllIIIl[0];
        }
        if (aw.llIlIllIlIIlIl(Game.getState(), GameState.LOGGED_IN)) {
            return lIlIIIllIIIl[0];
        }
        Log.info((String)lIlIIIllIIII[lIlIIIllIIIl[0]]);
        World lllllllllllllllIlllIIIIIIIIIlIIl = Worlds.getCurrentWorld();
        if (aw.llIlIllIlIIllI(lllllllllllllllIlllIIIIIIIIIlIIl)) {
            Log.info((String)lIlIIIllIIII[lIlIIIllIIIl[1]]);
            return lIlIIIllIIIl[1];
        }
        if (aw.llIlIllIlIIlll(lllllllllllllllIlllIIIIIIIIIlIlI.dv) && aw.llIlIllIlIlIII(lllllllllllllllIlllIIIIIIIIIlIIl.getId(), lllllllllllllllIlllIIIIIIIIIlIlI.dv.getId())) {
            Log.info((String)lIlIIIllIIII[lIlIIIllIIIl[2]]);
            return lIlIIIllIIIl[0];
        }
        World lllllllllllllllIlllIIIIIIIIIlIII = lllllllllllllllIlllIIIIIIIIIlIlI.a(lllllllllllllllIlllIIIIIIIIIlIIl);
        if (aw.llIlIllIlIIllI(lllllllllllllllIlllIIIIIIIIIlIII)) {
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

    private static /* synthetic */ boolean a(World world, World world2) {
        int n2;
        if (aw.llIlIllIlIlIII(world2.getId(), world.getId()) && aw.llIlIllIlIlIIl(world2.isNormal() ? 1 : 0)) {
            n2 = lIlIIIllIIIl[1];
            0;
            if (null != null) {
                return ((0x76 ^ 2 ^ (0xF1 ^ 0xAC)) & (160 + 126 - 231 + 136 ^ 28 + 73 - -21 + 28 ^ -1)) != 0;
            }
        } else {
            n2 = lIlIIIllIIIl[0];
        }
        return n2 != 0;
    }

    private static boolean llIlIllIlIIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static /* synthetic */ boolean c(World world, World world2) {
        int n2;
        if (aw.llIlIllIlIlIII(world2.getId(), world.getId()) && aw.llIlIllIlIlIIl(world2.isNormal() ? 1 : 0) && aw.llIlIllIlIlIIl(world2.isMembers() ? 1 : 0) && aw.llIlIllIlIlIIl(Objects.equals(world2.getLocation(), world.getLocation()) ? 1 : 0) && aw.llIlIllIlIlIlI(world2.getPlayerCount(), lIlIIIllIIIl[8])) {
            n2 = lIlIIIllIIIl[1];
            0;
            if (-2 > 0) {
                return ((0x38 ^ 0x14) & ~(0xE9 ^ 0xC5)) != 0;
            }
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
        void lllllllllllllllIlllIIIIIIIIIIIlI;
        String string = this.k.worldsHopping();
        if (aw.llIlIllIlIIlII(string.isEmpty() ? 1 : 0)) {
            String[] stringArray = string.split(lIlIIIllIIII[lIlIIIllIIIl[7]]);
            return Worlds.getRandom(world2 -> {
                int n2;
                if (aw.llIlIllIlIlIII(world2.getId(), world.getId()) && aw.llIlIllIlIlIIl(Stream.of(stringArray).anyMatch(string -> String.valueOf(world2.getId()).equals(string)) ? 1 : 0)) {
                    n2 = lIlIIIllIIIl[1];
                    0;
                    if (2 >= 3) {
                        return ((0xDC ^ 0x8E) & ~(0x34 ^ 0x66)) != 0;
                    }
                } else {
                    n2 = lIlIIIllIIIl[0];
                }
                return n2 != 0;
            });
        }
        World lllllllllllllllIlllIIIIIIIIIIIII = Worlds.getRandom(arg_0 -> aw.c((World)lllllllllllllllIlllIIIIIIIIIIIlI, arg_0));
        if (aw.llIlIllIlIIllI(lllllllllllllllIlllIIIIIIIIIIIII) && aw.llIlIllIlIIllI(lllllllllllllllIlllIIIIIIIIIIIII = Worlds.getRandom(arg_0 -> aw.b((World)lllllllllllllllIlllIIIIIIIIIIIlI, arg_0)))) {
            world3 = Worlds.getRandom(arg_0 -> aw.a((World)lllllllllllllllIlllIIIIIIIIIIIlI, arg_0));
        }
        return world3;
    }

    private static String llIlIllIlIIIIl(String lllllllllllllllIllIlllllllIIlIlI, String lllllllllllllllIllIlllllllIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIllIlllllllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllllllIIlIll.getBytes(StandardCharsets.UTF_8)), lIlIIIllIIIl[10]), "DES");
            Cipher lllllllllllllllIllIlllllllIIlllI = Cipher.getInstance("DES");
            lllllllllllllllIllIlllllllIIlllI.init(lIlIIIllIIIl[2], lllllllllllllllIllIlllllllIIllll);
            return new String(lllllllllllllllIllIlllllllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllllllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlllllllIIllIl) {
            lllllllllllllllIllIlllllllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIlIIlll(Object object) {
        return object != null;
    }

    private static void llIlIllIlIIIll() {
        lIlIIIllIIIl = new int[11];
        aw.lIlIIIllIIIl[0] = (0xDF ^ 0xA8 ^ (0x53 ^ 0x75)) & (91 + 203 - 102 + 63 ^ 68 + 2 - -82 + 22 ^ -1);
        aw.lIlIIIllIIIl[1] = 1;
        aw.lIlIIIllIIIl[2] = 2;
        aw.lIlIIIllIIIl[3] = 3;
        aw.lIlIIIllIIIl[4] = 0x80 ^ 0x84;
        aw.lIlIIIllIIIl[5] = 80 + 62 - 26 + 14 ^ 153 + 120 - 271 + 168;
        aw.lIlIIIllIIIl[6] = 0x5D ^ 0x55 ^ (0x99 ^ 0x94);
        aw.lIlIIIllIIIl[7] = 0xEB ^ 0xA5 ^ (0xFA ^ 0xB2);
        aw.lIlIIIllIIIl[8] = 0xFFFFFFD8 & 0x27F;
        aw.lIlIIIllIIIl[9] = 0x8B ^ 0x83 ^ (0x9A ^ 0x95);
        aw.lIlIIIllIIIl[10] = 0xA6 ^ 0xAE;
    }

    @Subscribe
    private void a(GameTick gameTick) {
        if (aw.llIlIllIlIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            this.dv = Worlds.getCurrentWorld();
        }
    }
}

