package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

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
@TaskDesc(name = "Hopping to different world", priority = 2147483548, blocking = true, register = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aw  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aw.class */
public class C0023aw extends AbstractC0026az {
    private static /* synthetic */ String[] lIlIIIllIIII;
    private static /* synthetic */ int[] lIlIIIllIIIl;
    private /* synthetic */ World dv;

    private static String llIlIllIlIIIII(String lllllllllllllllIllIllllllllIIIIl, String lllllllllllllllIllIlllllllIllIll) {
        String lllllllllllllllIllIllllllllIIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllllllllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlllllllIlllll = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlllllllIllIll.toCharArray();
        int lllllllllllllllIllIlllllllIlllIl = lIlIIIllIIIl[0];
        char[] charArray2 = lllllllllllllllIllIllllllllIIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIllIIIl[0];
        while (llIlIllIlIlIlI(i, length)) {
            char lllllllllllllllIllIllllllllIIIlI = charArray2[i];
            lllllllllllllllIllIlllllllIlllll.append((char) (lllllllllllllllIllIllllllllIIIlI ^ charArray[lllllllllllllllIllIlllllllIlllIl % charArray.length]));
            "".length();
            lllllllllllllllIllIlllllllIlllIl++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlllllllIlllll);
    }

    private static boolean llIlIllIlIlIIl(int i) {
        return i != 0;
    }

    private static boolean llIlIllIlIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIllIlIIlII(int i) {
        return i == 0;
    }

    private static boolean llIlIllIlIIllI(Object obj) {
        return obj == null;
    }

    private static boolean llIlIllIlIlIII(int i, int i2) {
        return i != i2;
    }

    @Inject
    public C0023aw(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.v = squireChambersPlugin;
        this.k = squireChambersConfig;
    }

    private static void llIlIllIlIIIlI() {
        lIlIIIllIIII = new String[lIlIIIllIIIl[9]];
        lIlIIIllIIII[lIlIIIllIIIl[0]] = llIlIllIlIIIII("FAEGGRwuOgI0aAEsDA1oOyZJASc/", "OIiiH");
        lIlIIIllIIII[lIlIIIllIIIl[1]] = llIlIllIlIIIII("Fx8jHSQtJCcwUA82IgMfOHcoCAQpJSEEHil3IxgCbDQ5HwIpOThNByMlIAk=", "LWLmp");
        lIlIIIllIIII[lIlIIIllIIIl[2]] = llIlIllIlIIIII("EjgLOx8oAw8WawcfRCUuLBREPyRpGAs7azoZCiguaQcBayo7FUQqJzsVBS8yaR8KayppFA0tLSwCASU/aQcLOSct", "IpdKK");
        lIlIIIllIIII[lIlIIIllIIIl[3]] = llIlIllIlIIIIl("YYMm1QfAbsDbT1IR4HVJ4nbKTwQcWdk1RRclIYxCbrP8K5r/Bo9ph4wkkcGduL1K", "atzso");
        lIlIIIllIIII[lIlIIIllIIIl[4]] = llIlIllIlIIIII("Exs6JxMpID4KZx88JzsjaDs6JzctIXU+NGg9OiNnJyMwOQ==", "HSUWG");
        lIlIIIllIIII[lIlIIIllIIIl[6]] = llIlIllIlIIIIl("aGebAmh86rECjWdcMZowVusgm435u5aHkUmraB87/iA=", "ZwfKM");
        lIlIIIllIIII[lIlIIIllIIIl[7]] = llIlIllIlIIIIl("p80xYtkDoR8=", "aTqbQ");
    }

    static {
        llIlIllIlIIIll();
        llIlIllIlIIIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.AbstractC0026az
    public boolean cg() {
        if (!llIlIllIlIIlII(this.k.enableHopping() ? 1 : 0) && !llIlIllIlIIlIl(Game.getState(), GameState.LOGGED_IN)) {
            Log.info(lIlIIIllIIII[lIlIIIllIIIl[0]]);
            World currentWorld = Worlds.getCurrentWorld();
            if (llIlIllIlIIllI(currentWorld)) {
                Log.info(lIlIIIllIIII[lIlIIIllIIIl[1]]);
                return lIlIIIllIIIl[1];
            } else if (llIlIllIlIIlll(this.dv) && llIlIllIlIlIII(currentWorld.getId(), this.dv.getId())) {
                Log.info(lIlIIIllIIII[lIlIIIllIIIl[2]]);
                return lIlIIIllIIIl[0];
            } else {
                World a = a(currentWorld);
                if (llIlIllIlIIllI(a)) {
                    Log.info(lIlIIIllIIII[lIlIIIllIIIl[3]]);
                    return lIlIIIllIIIl[1];
                } else if (llIlIllIlIIlII(Worlds.isHopperOpen() ? 1 : 0)) {
                    Log.info(lIlIIIllIIII[lIlIIIllIIIl[4]]);
                    Worlds.openHopper();
                    return lIlIIIllIIIl[1];
                } else {
                    this.dv = currentWorld;
                    sleep(lIlIIIllIIIl[5]);
                    Worlds.hopTo(a);
                    Log.info(lIlIIIllIIII[lIlIIIllIIIl[6]]);
                    return lIlIIIllIIIl[1];
                }
            }
        }
        return lIlIIIllIIIl[0];
    }

    private static boolean llIlIllIlIIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private World a(World world) {
        String worldsHopping = this.k.worldsHopping();
        if (llIlIllIlIIlII(worldsHopping.isEmpty() ? 1 : 0)) {
            String[] split = worldsHopping.split(lIlIIIllIIII[lIlIIIllIIIl[7]]);
            return Worlds.getRandom(world2 -> {
                if (llIlIllIlIlIII(world2.getId(), world.getId()) && llIlIllIlIlIIl(Stream.of((Object[]) split).anyMatch(str -> {
                    return String.valueOf(world2.getId()).equals(str);
                }) ? 1 : 0)) {
                    ?? r0 = lIlIIIllIIIl[1];
                    "".length();
                    return "  ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIllIIIl[0];
            });
        }
        World random = Worlds.getRandom(world3 -> {
            if (llIlIllIlIlIII(world3.getId(), world.getId()) && llIlIllIlIlIIl(world3.isNormal() ? 1 : 0) && llIlIllIlIlIIl(world3.isMembers() ? 1 : 0) && llIlIllIlIlIIl(Objects.equals(Integer.valueOf(world3.getLocation()), Integer.valueOf(world.getLocation())) ? 1 : 0) && llIlIllIlIlIlI(world3.getPlayerCount(), lIlIIIllIIIl[8])) {
                ?? r0 = lIlIIIllIIIl[1];
                "".length();
                return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIllIIIl[0];
        });
        if (llIlIllIlIIllI(random)) {
            random = Worlds.getRandom(world4 -> {
                if (llIlIllIlIlIII(world4.getId(), world.getId()) && llIlIllIlIlIIl(world4.isNormal() ? 1 : 0) && llIlIllIlIlIIl(world4.isMembers() ? 1 : 0) && llIlIllIlIlIIl(Objects.equals(Integer.valueOf(world4.getLocation()), Integer.valueOf(world.getLocation())) ? 1 : 0)) {
                    ?? r0 = lIlIIIllIIIl[1];
                    "".length();
                    return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIllIIIl[0];
            });
            if (llIlIllIlIIllI(random)) {
                random = Worlds.getRandom(world5 -> {
                    if (llIlIllIlIlIII(world5.getId(), world.getId()) && llIlIllIlIlIIl(world5.isNormal() ? 1 : 0)) {
                        ?? r0 = lIlIIIllIIIl[1];
                        "".length();
                        return 0 != 0 ? ((118 ^ 2) ^ (241 ^ 172)) & (((((160 + 126) - 231) + 136) ^ (((28 + 73) - (-21)) + 28)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIIllIIIl[0];
                });
            }
        }
        return random;
    }

    private static String llIlIllIlIIIIl(String lllllllllllllllIllIlllllllIIllII, String lllllllllllllllIllIlllllllIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllllllIIlIll.getBytes(StandardCharsets.UTF_8)), lIlIIIllIIIl[10]), "DES");
            Cipher lllllllllllllllIllIlllllllIIlllI = Cipher.getInstance("DES");
            lllllllllllllllIllIlllllllIIlllI.init(lIlIIIllIIIl[2], secretKeySpec);
            return new String(lllllllllllllllIllIlllllllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllllllIIllIl) {
            lllllllllllllllIllIlllllllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIlIIlll(Object obj) {
        return obj != null;
    }

    private static void llIlIllIlIIIll() {
        lIlIIIllIIIl = new int[11];
        lIlIIIllIIIl[0] = ((223 ^ 168) ^ (83 ^ 117)) & (((((91 + 203) - 102) + 63) ^ (((68 + 2) - (-82)) + 22)) ^ (-" ".length()));
        lIlIIIllIIIl[1] = " ".length();
        lIlIIIllIIIl[2] = "  ".length();
        lIlIIIllIIIl[3] = "   ".length();
        lIlIIIllIIIl[4] = 128 ^ 132;
        lIlIIIllIIIl[5] = (((80 + 62) - 26) + 14) ^ (((153 + 120) - 271) + 168);
        lIlIIIllIIIl[6] = (93 ^ 85) ^ (153 ^ 148);
        lIlIIIllIIIl[7] = (235 ^ 165) ^ (250 ^ 178);
        lIlIIIllIIIl[8] = (-40) & 639;
        lIlIIIllIIIl[9] = (139 ^ 131) ^ (154 ^ 149);
        lIlIIIllIIIl[10] = 166 ^ 174;
    }

    @Subscribe
    private void a(GameTick gameTick) {
        if (llIlIllIlIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            this.dv = Worlds.getCurrentWorld();
        }
    }
}
