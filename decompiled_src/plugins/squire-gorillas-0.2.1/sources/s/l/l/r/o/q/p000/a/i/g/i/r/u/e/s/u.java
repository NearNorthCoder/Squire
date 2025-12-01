package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.World;
import net.unethicalite.api.Locations;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
@TaskDesc(name = "Hopping (too busy)", priority = 100, blocking = true)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.u  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/u.class */
public class u extends Task {
    private static /* synthetic */ int[] llIIlIllIIlI;
    @Inject
    protected /* synthetic */ y ah;
    private static /* synthetic */ String[] llIIlIllIIIl;

    private static void lllllIllIIlIlI() {
        llIIlIllIIIl = new String[llIIlIllIIlI[3]];
        llIIlIllIIIl[llIIlIllIIlI[1]] = lllllIllIIlIIl("VxfrMHLaV+M=", "FTwVf");
    }

    private static boolean lllllIllIIllII(int i) {
        return i == 0;
    }

    private static boolean lllllIllIIllll(int i) {
        return i != 0;
    }

    static {
        lllllIllIIlIll();
        lllllIllIIlIlI();
    }

    private static boolean lllllIllIIlllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    public boolean run() {
        if (!lllllIllIIllII(Locations.isRegionLoaded(llIIlIllIIlI[0]) ? 1 : 0) && !lllllIllIIllIl(Players.getAll().size(), llIIlIllIIlI[2]) && !lllllIllIIllII(this.ah.P().isEmpty() ? 1 : 0)) {
            NPC interacting = Players.getLocal().getInteracting();
            if ((!lllllIllIIlllI(interacting) || !lllllIllIIllII(interacting.isDead() ? 1 : 0)) && !lllllIllIIlllI(NPCs.getNearest(npc -> {
                if (lllllIllIlIIlI(npc.getInteracting(), Players.getLocal())) {
                    String str = llIIlIllIIIl[llIIlIllIIlI[1]];
                    if (lllllIllIIllll(npc.hasAction((v1) -> {
                        return r1.equals(v1);
                    }) ? 1 : 0)) {
                        ?? r0 = llIIlIllIIlI[3];
                        "".length();
                        return " ".length() <= 0 ? ((1 ^ 17) ^ (29 ^ 6)) & (((155 ^ 170) ^ (252 ^ 198)) ^ (-" ".length())) : r0;
                    }
                }
                return llIIlIllIIlI[1];
            }))) {
                World currentWorld = Worlds.getCurrentWorld();
                List list = (List) Worlds.getAll(world -> {
                    if (lllllIllIlIIIl(world.getId(), currentWorld.getId()) && lllllIllIIllll(world.isNormal() ? 1 : 0) && lllllIllIIllll(world.isMembers() ? 1 : 0) && lllllIllIIllII(world.isSkillTotal() ? 1 : 0) && lllllIllIIllII(world.isAllPkWorld() ? 1 : 0)) {
                        ?? r0 = llIIlIllIIlI[3];
                        "".length();
                        return (" ".length() & (" ".length() ^ (-1))) != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIlIllIIlI[1];
                }).stream().sorted(Comparator.comparingInt((v0) -> {
                    return v0.getPlayerCount();
                })).limit(100L).collect(Collectors.toList());
                if (lllllIllIIllll(list.isEmpty() ? 1 : 0)) {
                    return llIIlIllIIlI[1];
                }
                World world2 = (World) list.get(Math.min(Rand.nextInt(llIIlIllIIlI[1], list.size()), Rand.nextInt(llIIlIllIIlI[1], list.size())));
                if (lllllIllIlIIII(world2)) {
                    return llIIlIllIIlI[1];
                }
                Worlds.hopTo(world2);
                return llIIlIllIIlI[3];
            }
            return llIIlIllIIlI[1];
        }
        return llIIlIllIIlI[1];
    }

    private static boolean lllllIllIlIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lllllIllIIlIll() {
        llIIlIllIIlI = new int[6];
        llIIlIllIIlI[0] = (-((-18499) & 24551)) & (-16388) & 30719;
        llIIlIllIIlI[1] = (107 ^ 89) & ((108 ^ 94) ^ (-1));
        llIIlIllIIlI[2] = 151 ^ 147;
        llIIlIllIIlI[3] = " ".length();
        llIIlIllIIlI[4] = (144 ^ 169) ^ (65 ^ 112);
        llIIlIllIIlI[5] = "  ".length();
    }

    private static boolean lllllIllIIllIl(int i, int i2) {
        return i < i2;
    }

    private static String lllllIllIIlIIl(String lllllllllllllllIlIIllllIIIIIlIll, String lllllllllllllllIlIIllllIIIIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), llIIlIllIIlI[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIllIIlI[5], lllllllllllllllIlIIllllIIIIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllIIIIIllII) {
            lllllllllllllllIlIIllllIIIIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIllIlIIII(Object obj) {
        return obj == null;
    }

    private static boolean lllllIllIlIIIl(int i, int i2) {
        return i != i2;
    }
}
