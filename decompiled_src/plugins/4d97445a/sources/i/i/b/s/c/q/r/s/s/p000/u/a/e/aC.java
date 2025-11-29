package i.i.b.s.c.q.r.s.s.p000.u.a.e;

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
@TaskDesc(name = "Hopping", register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aC  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aC.class */
public class aC extends Task {
    private static /* synthetic */ int[] llIlIIlIl;
    private final /* synthetic */ RelogConfig dU;
    private /* synthetic */ int dV = Static.getClient().getTickCount();
    private static /* synthetic */ String[] llIlIIlII;

    private static boolean lIlllIIIlIl(int i2, int i3) {
        return i2 > i3;
    }

    private static void lIlllIIIIII() {
        llIlIIlIl = new int[7];
        llIlIIlIl[0] = ((((4 + 17) - (-111)) + 58) ^ (((6 + 59) - 19) + 95)) & (((156 ^ 134) ^ (32 ^ 9)) ^ (-" ".length()));
        llIlIIlIl[1] = " ".length();
        llIlIIlIl[2] = "  ".length();
        llIlIIlIl[3] = "   ".length();
        llIlIIlIl[4] = ((210 ^ 178) & ((226 ^ 130) ^ (-1))) ^ (20 ^ 112);
        llIlIIlIl[5] = 130 ^ 134;
        llIlIIlIl[6] = (20 ^ 83) ^ (199 ^ 136);
    }

    private static boolean lIlllIIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIllIllllll() {
        llIlIIlII = new String[llIlIIlIl[5]];
        llIlIIlII[llIlIIlIl[0]] = lIllIllllII("LGOCI5ehOS6Tx+SAKdkqDm2FqU/4vfKK/jjc+/WwipL1un4CPG1qAA==", "MpveS");
        llIlIIlII[llIlIIlIl[1]] = lIllIllllIl("GRAHKx4lYiooATInEBpRCi0SNxgsJUI0ASchCyEYIWIVKAMuJg==", "BBbGq");
        llIlIIlII[llIlIIlIl[2]] = lIllIlllllI("0A2QFJjgCg8=", "CvVSy");
        llIlIIlII[llIlIIlIl[3]] = lIllIllllIl("Dz0nJykzTwokNiQKMBZmHAAyOy86CGI5JzoLLSY=", "ToBKF");
    }

    private static boolean lIlllIIIlII(Object obj) {
        return obj == null;
    }

    @Inject
    public aC(RelogConfig relogConfig) {
        this.dU = relogConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    public boolean run() {
        if (!lIlllIIIIIl(Game.getState(), GameState.LOGGED_IN) && !lIlllIIIIlI(bU() ? 1 : 0) && !lIlllIIIIll(this.dU.logOutPlayer() ? 1 : 0)) {
            if (lIlllIIIIll(Static.getClient().isInInstancedRegion() ? 1 : 0) && lIlllIIIIll(this.dU.ignoreInstances() ? 1 : 0)) {
                return llIlIIlIl[0];
            }
            World currentWorld = Worlds.getCurrentWorld();
            if (lIlllIIIlII(currentWorld)) {
                return llIlIIlIl[0];
            }
            if (lIlllIIIIll(this.dU.stayInRegion() ? 1 : 0)) {
                Log.info(llIlIIlII[llIlIIlIl[0]]);
                Worlds.hopTo(Worlds.getRandom(world -> {
                    if (lIlllIIIIll(world.isNormal() ? 1 : 0) && lIlllIIIllI(world.getLocation(), currentWorld.getLocation())) {
                        if (lIlllIIIllI(world.isMembers() ? 1 : 0, currentWorld.isMembers() ? 1 : 0) && lIlllIIIlll(world.getId(), currentWorld.getId())) {
                            ?? r0 = llIlIIlIl[1];
                            "".length();
                            return 0 != 0 ? ((43 ^ 112) ^ (80 ^ 60)) & (((154 ^ 147) ^ (173 ^ 147)) ^ (-" ".length())) : r0;
                        }
                    }
                    return llIlIIlIl[0];
                }));
            }
            if (lIlllIIIIll(this.dU.hopSpecificWorlds() ? 1 : 0)) {
                Log.info(llIlIIlII[llIlIIlIl[1]]);
                String[] split = this.dU.worlds().split(llIlIIlII[llIlIIlIl[2]]);
                Worlds.hopTo(Worlds.getRandom(world2 -> {
                    return Stream.of((Object[]) split).anyMatch(str -> {
                        if (lIlllIIIllI(world2.getId(), Integer.parseInt(str.trim()))) {
                            ?? r0 = llIlIIlIl[1];
                            "".length();
                            return "   ".length() <= ((16 ^ 86) & ((249 ^ 191) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIIlIl[0];
                    });
                }));
                "".length();
                if (((((109 + 97) - 43) + 25) ^ (((162 + 96) - 84) + 10)) != ((245 ^ 197) ^ (138 ^ 190))) {
                    return ((66 ^ 114) ^ (75 ^ 89)) & (((21 ^ 98) ^ (85 ^ 0)) ^ (-" ".length()));
                }
            } else if (lIlllIIIIlI(this.dU.hopSpecificWorlds() ? 1 : 0) && lIlllIIIIlI(this.dU.stayInRegion() ? 1 : 0)) {
                Log.info(llIlIIlII[llIlIIlIl[3]]);
                Worlds.hopTo(Worlds.getRandom(world3 -> {
                    if (lIlllIIIIll(world3.isNormal() ? 1 : 0)) {
                        if (lIlllIIIllI(world3.isMembers() ? 1 : 0, currentWorld.isMembers() ? 1 : 0) && lIlllIIIlll(world3.getId(), currentWorld.getId())) {
                            ?? r0 = llIlIIlIl[1];
                            "".length();
                            return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llIlIIlIl[0];
                }));
            }
            return llIlIIlIl[1];
        }
        return llIlIIlIl[0];
    }

    private static String lIllIlllllI(String lIllIIIIlIllIll, String lIllIIIIlIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), llIlIIlIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIlIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIIIlIlllII) {
            lIllIIIIlIlllII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(WorldHopped worldHopped) {
        this.dV = Static.getClient().getTickCount();
    }

    private static boolean lIlllIIIlll(int i2, int i3) {
        return i2 != i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean bU() {
        if (lIlllIIIIll(this.dU.worldHopPlayer() ? 1 : 0) && lIlllIIIlIl(Players.getAll().size(), llIlIIlIl[1])) {
            return llIlIIlIl[1];
        }
        if (lIlllIIIIll(this.dU.worldHopMinutes()) && lIlllIIIlIl(Static.getClient().getTickCount() - this.dV, llIlIIlIl[4] * this.dU.worldHopMinutes())) {
            ?? r0 = llIlIIlIl[1];
            "".length();
            return (-" ".length()) > (61 ^ 57) ? (true ^ true) & ((!true) ^ true) : r0;
        }
        return llIlIIlIl[0];
    }

    private static String lIllIllllIl(String lIllIIIIlllllIl, String lIllIIIIlllllII) {
        String str = new String(Base64.getDecoder().decode(lIllIIIIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIllIIIIlllllII.toCharArray();
        int lIllIIIIllllIIl = llIlIIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llIlIIlIl[0];
        while (lIlllIIlIII(i2, length)) {
            sb.append((char) (charArray2[i2] ^ charArray[lIllIIIIllllIIl % charArray.length]));
            "".length();
            lIllIIIIllllIIl++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIllllII(String lIllIIIIllIlIII, String lIllIIIIllIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIlIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIIIllIlIIl) {
            lIllIIIIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIIll(int i2) {
        return i2 != 0;
    }

    private static boolean lIlllIIIIlI(int i2) {
        return i2 == 0;
    }

    private static boolean lIlllIIIllI(int i2, int i3) {
        return i2 == i3;
    }

    static {
        lIlllIIIIII();
        lIllIllllll();
    }

    private static boolean lIlllIIlIII(int i2, int i3) {
        return i2 < i3;
    }
}
