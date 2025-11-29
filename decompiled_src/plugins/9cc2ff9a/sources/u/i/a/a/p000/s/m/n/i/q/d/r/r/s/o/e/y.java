package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Getting Killcount", priority = 5)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.y  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/y.class */
public class y extends Task {
    private final /* synthetic */ Client aw = Static.getClient();
    private final /* synthetic */ C0006g au;
    private final /* synthetic */ SquireSaraConfig av;
    private static /* synthetic */ int[] lIIlIlIIIllll;
    private static /* synthetic */ String[] lIIlIlIIIlllI;
    private static final /* synthetic */ WorldPoint at;

    private static String lIlIlIllIIlllll(String llllllllllllllIlllllIIIIllIIIIll, String llllllllllllllIlllllIIIIllIIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIIllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIllIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlIlIIIllll[9]), "DES");
            Cipher llllllllllllllIlllllIIIIllIIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllllIIIIllIIIlIl.init(lIIlIlIIIllll[2], llllllllllllllIlllllIIIIllIIIllI);
            return new String(llllllllllllllIlllllIIIIllIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIIllIIIlII) {
            llllllllllllllIlllllIIIIllIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIlIlIII(int i, int i2) {
        return i > i2;
    }

    @Inject
    public y(C0006g c0006g, SquireSaraConfig squireSaraConfig) {
        this.au = c0006g;
        this.av = squireSaraConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    public boolean run() {
        List of;
        if (!lIlIlIllIlIIlII(this.au.s() ? 1 : 0) && !lIlIlIllIlIIlIl(this.au.m() ? 1 : 0) && !lIlIlIllIlIIllI(this.au.q(), this.au.r())) {
            Player local = Players.getLocal();
            if (lIlIlIllIlIIlll(local.getInteracting())) {
                return lIIlIlIIIllll[0];
            }
            if (lIlIlIllIlIIlIl(this.av.kcSpirituals() ? 1 : 0)) {
                of = List.of(lIIlIlIIIlllI[lIIlIlIIIllll[0]], lIIlIlIIIlllI[lIIlIlIIIllll[1]]);
                "".length();
                if ("  ".length() == "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                of = List.of(lIIlIlIIIlllI[lIIlIlIIIllll[2]]);
            }
            List list = of;
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIlIlIllIlIIlII(npc.isDead() ? 1 : 0) && lIlIlIllIlIIlIl(list.contains(npc.getName()) ? 1 : 0)) {
                    ?? r0 = lIIlIlIIIllll[1];
                    "".length();
                    return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIlIlIIIllll[0];
            });
            if (lIlIlIllIlIlIII(local.distanceTo(at), lIIlIlIIIllll[3])) {
                Movement.walkTo(at);
                "".length();
                return lIIlIlIIIllll[1];
            } else if (!lIlIlIllIlIlIIl(nearest)) {
                nearest.interact(lIIlIlIIIlllI[lIIlIlIIIllll[6]]);
                sleep(lIIlIlIIIllll[2]);
                return lIIlIlIIIllll[1];
            } else if (lIlIlIllIlIlIlI(Players.getLocal().distanceTo(at), lIIlIlIIIllll[4])) {
                Worlds.hopTo(Worlds.getRandom(world -> {
                    if (lIlIlIllIlIIlIl(world.isMembers() ? 1 : 0) && lIlIlIllIlIIlIl(world.isNormal() ? 1 : 0)) {
                        ?? r0 = lIIlIlIIIllll[1];
                        "".length();
                        return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlIIIllll[0];
                }));
                sleep(lIIlIlIIIllll[5]);
                return lIIlIlIIIllll[1];
            } else {
                return lIIlIlIIIllll[0];
            }
        }
        return lIIlIlIIIllll[0];
    }

    private static boolean lIlIlIllIlIIlII(int i) {
        return i == 0;
    }

    private static boolean lIlIlIllIlIIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIllIlIIlIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlIllIlIlIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIllIlIlIll(int i, int i2) {
        return i < i2;
    }

    private static void lIlIlIllIlIIIll() {
        lIIlIlIIIllll = new int[10];
        lIIlIlIIIllll[0] = (95 ^ 120) & ((116 ^ 83) ^ (-1));
        lIIlIlIIIllll[1] = " ".length();
        lIIlIlIIIllll[2] = "  ".length();
        lIIlIlIIIllll[3] = (113 ^ 94) ^ (97 ^ 72);
        lIIlIlIIIllll[4] = (((40 + 46) - (-2)) + 63) ^ (((126 + 53) - 57) + 35);
        lIIlIlIIIllll[5] = (185 ^ 182) ^ (68 ^ 79);
        lIIlIlIIIllll[6] = "   ".length();
        lIIlIlIIIllll[7] = (-(129 ^ 134)) & (-9249) & 12159;
        lIIlIlIIIllll[8] = (-((-30923) & 31435)) & (-24835) & 30647;
        lIIlIlIIIllll[9] = 204 ^ 196;
    }

    private static boolean lIlIlIllIlIlIlI(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIlIllIlIIIIl(String llllllllllllllIlllllIIIIlIllIllI, String llllllllllllllIlllllIIIIlIllIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIIlIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIlIIIllll[2], llllllllllllllIlllllIIIIlIlllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIIIlIllIlll) {
            llllllllllllllIlllllIIIIlIllIlll.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIllIlIIIll();
        lIlIlIllIlIIIlI();
        at = new WorldPoint(lIIlIlIIIllll[7], lIIlIlIIIllll[8], lIIlIlIIIllll[2]);
    }

    private static String lIlIlIllIlIIIII(String llllllllllllllIlllllIIIIlIlIIllI, String llllllllllllllIlllllIIIIlIlIIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllllIIIIlIlIIlIl.toCharArray();
        int llllllllllllllIlllllIIIIlIlIIIlI = lIIlIlIIIllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIIIllll[0];
        while (lIlIlIllIlIlIll(i, length)) {
            char llllllllllllllIlllllIIIIlIIllIIl = charArray2[i];
            sb.append((char) (llllllllllllllIlllllIIIIlIIllIIl ^ charArray[llllllllllllllIlllllIIIIlIlIIIlI % charArray.length]));
            "".length();
            llllllllllllllIlllllIIIIlIlIIIlI++;
            i++;
            "".length();
            if ("  ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIlIllIlIIIlI() {
        lIIlIlIIIlllI = new String[lIIlIlIIIllll[5]];
        lIIlIlIIIlllI[lIIlIlIIIllll[0]] = lIlIlIllIIlllll("kZe1mIF8BcEbVjnkMaR/IgbNiNY34Qwq", "zPPcS");
        lIIlIlIIIlllI[lIIlIlIIIllll[1]] = lIlIlIllIlIIIII("MgAxPRoVBTkjUwwRPyo=", "apXOs");
        lIIlIlIIIlllI[lIIlIlIIIllll[2]] = lIlIlIllIlIIIIl("ePcex2wcAVKfubvsojr6vixNsFrnZKF5", "PIKDb");
        lIIlIlIIIlllI[lIIlIlIIIllll[6]] = lIlIlIllIlIIIII("BgE4Lw8s", "GuLNl");
    }

    private static boolean lIlIlIllIlIIllI(int i, int i2) {
        return i >= i2;
    }
}
