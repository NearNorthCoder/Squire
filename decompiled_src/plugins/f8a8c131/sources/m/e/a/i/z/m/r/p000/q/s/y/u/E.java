package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;
@TaskDesc(name = "Getting Killcount", priority = 5)
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.E  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/E.class */
public class E extends Task {
    private static /* synthetic */ String[] lIllIIlIIIIII;
    private static final /* synthetic */ WorldPoint aI;
    private static /* synthetic */ int[] lIllIIlIIIIIl;
    private final /* synthetic */ Client aK = Static.getClient();
    private final /* synthetic */ l aJ;

    private static boolean llIIIlIllIlIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    public boolean run() {
        if (!llIIIlIllIIllII(this.aJ.B() ? 1 : 0) && !llIIIlIllIIllIl(this.aJ.F(), R()) && !llIIIlIllIIlllI(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (llIIIlIllIlIIlI(npc.isDead() ? 1 : 0) && llIIIlIllIIllII(npc.getName().equals(lIllIIlIIIIII[lIllIIlIIIIIl[3]]) ? 1 : 0) && llIIIlIllIlIIII(npc.distanceTo(aI), lIllIIlIIIIIl[14])) {
                    ?? r0 = lIllIIlIIIIIl[3];
                    "".length();
                    return (-(39 ^ 35)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllIIlIIIIIl[0];
            });
            if (!llIIIlIllIIllll(nearest)) {
                nearest.interact(lIllIIlIIIIII[lIllIIlIIIIIl[0]]);
                sleep(lIllIIlIIIIIl[4]);
                return lIllIIlIIIIIl[3];
            } else if (llIIIlIllIlIIII(Players.getLocal().distanceTo(aI), lIllIIlIIIIIl[1])) {
                Worlds.hopTo(Worlds.getRandom(world -> {
                    if (llIIIlIllIIllII(world.isMembers() ? 1 : 0) && llIIIlIllIIllII(world.isNormal() ? 1 : 0)) {
                        ?? r0 = lIllIIlIIIIIl[3];
                        "".length();
                        return ("  ".length() & ("  ".length() ^ (-1))) != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIlIIIIIl[0];
                }));
                sleep(lIllIIlIIIIIl[2]);
                return lIllIIlIIIIIl[3];
            } else {
                return lIllIIlIIIIIl[0];
            }
        }
        return lIllIIlIIIIIl[0];
    }

    private static boolean llIIIlIllIIlllI(Object obj) {
        return obj != null;
    }

    static {
        llIIIlIllIIlIll();
        llIIIlIllIIlIlI();
        aI = new WorldPoint(lIllIIlIIIIIl[15], lIllIIlIIIIIl[16], lIllIIlIIIIIl[4]);
    }

    private static void llIIIlIllIIlIll() {
        lIllIIlIIIIIl = new int[18];
        lIllIIlIIIIIl[0] = ((205 ^ 142) ^ (169 ^ 177)) & (((20 ^ 104) ^ (26 ^ 61)) ^ (-" ".length()));
        lIllIIlIIIIIl[1] = (104 ^ 87) ^ (181 ^ 128);
        lIllIIlIIIIIl[2] = (128 ^ 143) ^ (52 ^ 63);
        lIllIIlIIIIIl[3] = " ".length();
        lIllIIlIIIIIl[4] = "  ".length();
        lIllIIlIIIIIl[5] = (-((-4890) & 21403)) & (-275) & 29655;
        lIllIIlIIIIIl[6] = (((44 + 9) - (-12)) + 122) ^ (((127 + 61) - 181) + 173);
        lIllIIlIIIIIl[7] = (-17721) & 30587;
        lIllIIlIIIIIl[8] = 59 ^ 34;
        lIllIIlIIIIIl[9] = (-2225) & 15090;
        lIllIIlIIIIIl[10] = (((110 + 154) - 236) + 145) ^ (((46 + 30) - (-43)) + 60);
        lIllIIlIIIIIl[11] = (-((-577) & 20335)) & (-145) & 32767;
        lIllIIlIIIIIl[12] = 3 ^ 32;
        lIllIIlIIIIIl[13] = 86 ^ 126;
        lIllIIlIIIIIl[14] = 185 ^ 161;
        lIllIIlIIIIIl[15] = (-21507) & 24415;
        lIllIIlIIIIIl[16] = (-27141) & 32493;
        lIllIIlIIIIIl[17] = 14 ^ 6;
    }

    private static boolean llIIIlIllIlIIII(int i, int i2) {
        return i <= i2;
    }

    @Inject
    public E(l lVar) {
        this.aJ = lVar;
    }

    private static boolean llIIIlIllIlIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIlIllIIllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIlIllIlIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIlIllIIllll(Object obj) {
        return obj == null;
    }

    private int R() {
        return llIIIlIllIlIIIl(this.aK.getVarbitValue(lIllIIlIIIIIl[5]), lIllIIlIIIIIl[4]) ? lIllIIlIIIIIl[6] : llIIIlIllIlIIIl(this.aK.getVarbitValue(lIllIIlIIIIIl[7]), lIllIIlIIIIIl[4]) ? lIllIIlIIIIIl[8] : llIIIlIllIlIIIl(this.aK.getVarbitValue(lIllIIlIIIIIl[9]), lIllIIlIIIIIl[4]) ? lIllIIlIIIIIl[10] : llIIIlIllIlIIIl(this.aK.getVarbitValue(lIllIIlIIIIIl[11]), lIllIIlIIIIIl[4]) ? lIllIIlIIIIIl[12] : lIllIIlIIIIIl[13];
    }

    private static boolean llIIIlIllIIllII(int i) {
        return i != 0;
    }

    private static String llIIIlIllIIlIIl(String llllllllllllllIllIIlIlIlIlIlllIl, String llllllllllllllIllIIlIlIlIlIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), lIllIIlIIIIIl[17]), "DES");
            Cipher llllllllllllllIllIIlIlIlIlIlllll = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlIlIlIlllll.init(lIllIIlIIIIIl[4], secretKeySpec);
            return new String(llllllllllllllIllIIlIlIlIlIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIlIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIlIlIllIIl) {
            llllllllllllllIllIIlIlIlIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIllIIlIlI() {
        lIllIIlIIIIII = new String[lIllIIlIIIIIl[4]];
        lIllIIlIIIIII[lIllIIlIIIIIl[0]] = llIIIlIllIIlIII("BTIgJC0v", "DFTEN");
        lIllIIlIIIIII[lIllIIlIIIIIl[3]] = llIIIlIllIIlIIl("BlRnlz/2Uco=", "BErwd");
    }

    private static String llIIIlIllIIlIII(String llllllllllllllIllIIlIlIlIlllIIlI, String llllllllllllllIllIIlIlIlIlllIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIlIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIlIlIlllIIII = new StringBuilder();
        char[] llllllllllllllIllIIlIlIlIllIllll = llllllllllllllIllIIlIlIlIlllIIIl.toCharArray();
        int llllllllllllllIllIIlIlIlIllIlllI = lIllIIlIIIIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIlIIIIIl[0];
        while (llIIIlIllIlIIll(i, length)) {
            char llllllllllllllIllIIlIlIlIlllIIll = charArray[i];
            llllllllllllllIllIIlIlIlIlllIIII.append((char) (llllllllllllllIllIIlIlIlIlllIIll ^ llllllllllllllIllIIlIlIlIllIllll[llllllllllllllIllIIlIlIlIllIlllI % llllllllllllllIllIIlIlIlIllIllll.length]));
            "".length();
            llllllllllllllIllIIlIlIlIllIlllI++;
            i++;
            "".length();
            if ((((177 ^ 170) ^ (4 ^ 127)) & (((((166 + 74) - 101) + 82) ^ (((100 + 84) - 177) + 182)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlIlIlIlllIIII);
    }
}
