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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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
public class aC
extends Task {
    private static /* synthetic */ int[] llIlIIlIl;
    private final /* synthetic */ RelogConfig dU;
    private /* synthetic */ int dV;
    private static /* synthetic */ String[] llIlIIlII;

    private static boolean lIlllIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlllIIIIII() {
        llIlIIlIl = new int[7];
        aC.llIlIIlIl[0] = (4 + 17 - -111 + 58 ^ 6 + 59 - 19 + 95) & (0x9C ^ 0x86 ^ (0x20 ^ 9) ^ -" ".length());
        aC.llIlIIlIl[1] = " ".length();
        aC.llIlIIlIl[2] = "  ".length();
        aC.llIlIIlIl[3] = "   ".length();
        aC.llIlIIlIl[4] = (0xD2 ^ 0xB2) & ~(0xE2 ^ 0x82) ^ (0x14 ^ 0x70);
        aC.llIlIIlIl[5] = 0x82 ^ 0x86;
        aC.llIlIIlIl[6] = 0x14 ^ 0x53 ^ (0xC7 ^ 0x88);
    }

    private static boolean lIlllIIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static void lIllIllllll() {
        llIlIIlII = new String[llIlIIlIl[5]];
        aC.llIlIIlII[aC.llIlIIlIl[0]] = aC.lIllIllllII("LGOCI5ehOS6Tx+SAKdkqDm2FqU/4vfKK/jjc+/WwipL1un4CPG1qAA==", "MpveS");
        aC.llIlIIlII[aC.llIlIIlIl[1]] = aC.lIllIllllIl("GRAHKx4lYiooATInEBpRCi0SNxgsJUI0ASchCyEYIWIVKAMuJg==", "BBbGq");
        aC.llIlIIlII[aC.llIlIIlIl[2]] = aC.lIllIlllllI("0A2QFJjgCg8=", "CvVSy");
        aC.llIlIIlII[aC.llIlIIlIl[3]] = aC.lIllIllllIl("Dz0nJykzTwokNiQKMBZmHAAyOy86CGI5JzoLLSY=", "ToBKF");
    }

    private static boolean lIlllIIIlII(Object object) {
        return object == null;
    }

    @Inject
    public aC(RelogConfig relogConfig) {
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
                    "".length();
                    if (null != null) {
                        return ((0x2B ^ 0x70 ^ (0x50 ^ 0x3C)) & (0x9A ^ 0x93 ^ (0xAD ^ 0x93) ^ -" ".length())) != 0;
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
                    "".length();
                    if ("   ".length() <= ((0x10 ^ 0x56) & ~(0xF9 ^ 0xBF))) {
                        return ((0xF0 ^ 0xC1) & ~(0xB3 ^ 0x82)) != 0;
                    }
                } else {
                    bl2 = llIlIIlIl[0];
                }
                return bl2;
            })));
            "".length();
            if ((109 + 97 - 43 + 25 ^ 162 + 96 - 84 + 10) != (0xF5 ^ 0xC5 ^ (0x8A ^ 0xBE))) {
                return ((0x42 ^ 0x72 ^ (0x4B ^ 0x59)) & (0x15 ^ 0x62 ^ (0x55 ^ 0) ^ -" ".length())) != 0;
            }
        } else if (aC.lIlllIIIIlI(lIllIIIlIIllIII.dU.hopSpecificWorlds() ? 1 : 0) && aC.lIlllIIIIlI(lIllIIIlIIllIII.dU.stayInRegion() ? 1 : 0)) {
            Log.info((String)llIlIIlII[llIlIIlIl[3]]);
            Worlds.hopTo((World)Worlds.getRandom(world2 -> {
                int n2;
                if (aC.lIlllIIIIll(world2.isNormal() ? 1 : 0) && aC.lIlllIIIllI(world2.isMembers() ? 1 : 0, lIllIIIlIIlIlll.isMembers() ? 1 : 0) && aC.lIlllIIIlll(world2.getId(), lIllIIIlIIlIlll.getId())) {
                    n2 = llIlIIlIl[1];
                    "".length();
                    if ("   ".length() <= 0) {
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

    private static String lIllIlllllI(String lIllIIIIlIllIll, String lIllIIIIlIllIlI) {
        try {
            SecretKeySpec lIllIIIIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), llIlIIlIl[6]), "DES");
            Cipher lIllIIIIlIlllIl = Cipher.getInstance("DES");
            lIllIIIIlIlllIl.init(llIlIIlIl[2], lIllIIIIlIllllI);
            return new String(lIllIIIIlIlllIl.doFinal(Base64.getDecoder().decode(lIllIIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIIlIlllII) {
            lIllIIIIlIlllII.printStackTrace();
            return null;
        }
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
            "".length();
            if (-" ".length() > (0x3D ^ 0x39)) {
                return ((0xA6 ^ 0x95) & ~(0x32 ^ 1)) != 0;
            }
        } else {
            n2 = llIlIIlIl[0];
        }
        return n2 != 0;
    }

    private static String lIllIllllIl(String lIllIIIIlllllIl, String lIllIIIIlllllII) {
        lIllIIIIlllllIl = new String(Base64.getDecoder().decode(lIllIIIIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIIIllllIll = new StringBuilder();
        char[] lIllIIIIllllIlI = lIllIIIIlllllII.toCharArray();
        int lIllIIIIllllIIl = llIlIIlIl[0];
        char[] lIllIIIIlllIIll = lIllIIIIlllllIl.toCharArray();
        int lIllIIIIlllIIlI = lIllIIIIlllIIll.length;
        int lIllIIIIlllIIIl = llIlIIlIl[0];
        while (aC.lIlllIIlIII(lIllIIIIlllIIIl, lIllIIIIlllIIlI)) {
            char lIllIIIIllllllI = lIllIIIIlllIIll[lIllIIIIlllIIIl];
            lIllIIIIllllIll.append((char)(lIllIIIIllllllI ^ lIllIIIIllllIlI[lIllIIIIllllIIl % lIllIIIIllllIlI.length]));
            "".length();
            ++lIllIIIIllllIIl;
            ++lIllIIIIlllIIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIllIIIIllllIll);
    }

    private static String lIllIllllII(String lIllIIIIllIlIII, String lIllIIIIllIIlIl) {
        try {
            SecretKeySpec lIllIIIIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIIIllIlIlI = Cipher.getInstance("Blowfish");
            lIllIIIIllIlIlI.init(llIlIIlIl[2], lIllIIIIllIlIll);
            return new String(lIllIIIIllIlIlI.doFinal(Base64.getDecoder().decode(lIllIIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIIllIlIIl) {
            lIllIIIIllIlIIl.printStackTrace();
            return null;
        }
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

