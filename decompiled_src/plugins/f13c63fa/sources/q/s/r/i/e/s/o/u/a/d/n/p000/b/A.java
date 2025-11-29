package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
@TaskDesc(name = "Getting killcount", priority = 5)
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.A  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/A.class */
public class A extends Task {
    private static /* synthetic */ int[] lllIIIIlIlI;
    private final /* synthetic */ Client aE = Static.getClient();
    private final /* synthetic */ e aD;
    private static /* synthetic */ String[] lllIIIIIllI;
    private static final /* synthetic */ WorldPoint aC;

    private static String lIlIllIIllIlll(String llllllllllllllllIIlIlIIIIlllIllI, String llllllllllllllllIIlIlIIIIlllIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIIllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIlIlI[1], llllllllllllllllIIlIlIIIIllllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIIlllIlll) {
            llllllllllllllllIIlIlIIIIlllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIIIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIllIlIIIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllIlIIIlIl(Object obj) {
        return obj == null;
    }

    private static String lIlIllIIlllIll(String llllllllllllllllIIlIlIIIIllIIllI, String llllllllllllllllIIlIlIIIIllIIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIIIllIIlII = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIlIIIIllIIIII.toCharArray();
        int llllllllllllllllIIlIlIIIIlIlllIl = lllIIIIlIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIIIIlIlI[0];
        while (lIlIllIlIIlIIl(i, length)) {
            char llllllllllllllllIIlIlIIIIllIIlll = charArray2[i];
            llllllllllllllllIIlIlIIIIllIIlII.append((char) (llllllllllllllllIIlIlIIIIllIIlll ^ charArray[llllllllllllllllIIlIlIIIIlIlllIl % charArray.length]));
            "".length();
            llllllllllllllllIIlIlIIIIlIlllIl++;
            i++;
            "".length();
            if ("   ".length() > (36 ^ 32)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIlIIIIllIIlII);
    }

    static {
        lIlIllIlIIIIIl();
        lIlIllIIllllII();
        aC = new WorldPoint(lllIIIIlIlI[14], lllIIIIlIlI[15], lllIIIIlIlI[1]);
    }

    private static boolean lIlIllIlIIIIll(int i, int i2) {
        return i >= i2;
    }

    @Inject
    public A(e eVar) {
        this.aD = eVar;
    }

    private int R() {
        return lIlIllIlIIIllI(this.aE.getVarbitValue(lllIIIIlIlI[3]), lllIIIIlIlI[1]) ? lllIIIIlIlI[4] : lIlIllIlIIIllI(this.aE.getVarbitValue(lllIIIIlIlI[5]), lllIIIIlIlI[1]) ? lllIIIIlIlI[6] : lIlIllIlIIIllI(this.aE.getVarbitValue(lllIIIIlIlI[7]), lllIIIIlIlI[1]) ? lllIIIIlIlI[8] : lIlIllIlIIIllI(this.aE.getVarbitValue(lllIIIIlIlI[9]), lllIIIIlIlI[1]) ? lllIIIIlIlI[10] : lllIIIIlIlI[11];
    }

    private static boolean lIlIllIlIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllIIllllII() {
        lllIIIIIllI = new String[lllIIIIlIlI[1]];
        lllIIIIIllI[lllIIIIlIlI[0]] = lIlIllIIllIlll("KE4Pdfx8WBw=", "MMArY");
        lllIIIIIllI[lllIIIIlIlI[2]] = lIlIllIIlllIll("ChUxOyUj", "MzSWL");
    }

    private static boolean lIlIllIlIIIlll(int i) {
        return i == 0;
    }

    private static boolean lIlIllIlIIIIlI(int i) {
        return i != 0;
    }

    private static boolean lIlIllIlIIlIII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    public boolean run() {
        if (!lIlIllIlIIIIlI(this.aD.t() ? 1 : 0) && !lIlIllIlIIIIll(this.aD.x(), R())) {
            Player local = Players.getLocal();
            if (lIlIllIlIIIlII(local.getInteracting())) {
                return lllIIIIlIlI[0];
            }
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIlIllIlIIIlll(npc.isDead() ? 1 : 0) && lIlIllIlIIIIlI(npc.getName().equals(lllIIIIIllI[lllIIIIlIlI[2]]) ? 1 : 0) && lIlIllIlIIlIII(npc.distanceTo(local), lllIIIIlIlI[12]) && lIlIllIlIIlIII(npc.distanceTo(aC), lllIIIIlIlI[13])) {
                    ?? r0 = lllIIIIlIlI[2];
                    "".length();
                    return "  ".length() == (((34 ^ 40) ^ (5 ^ 43)) & (((182 ^ 175) ^ (44 ^ 17)) ^ (-" ".length()))) ? ((181 ^ 186) ^ (151 ^ 198)) & (((99 ^ 37) ^ (175 ^ 183)) ^ (-" ".length())) : r0;
                }
                return lllIIIIlIlI[0];
            });
            if (lIlIllIlIIIlIl(nearest)) {
                return lllIIIIlIlI[0];
            }
            nearest.interact(lllIIIIIllI[lllIIIIlIlI[0]]);
            sleep(lllIIIIlIlI[1]);
            return lllIIIIlIlI[2];
        }
        return lllIIIIlIlI[0];
    }

    private static void lIlIllIlIIIIIl() {
        lllIIIIlIlI = new int[16];
        lllIIIIlIlI[0] = (98 ^ 121) & ((180 ^ 175) ^ (-1));
        lllIIIIlIlI[1] = "  ".length();
        lllIIIIlIlI[2] = " ".length();
        lllIIIIlIlI[3] = (-18722) & 31589;
        lllIIIIlIlI[4] = (((51 + 102) - 73) + 95) ^ (((119 + 12) - 23) + 52);
        lllIIIIlIlI[5] = (-16641) & 29507;
        lllIIIIlIlI[6] = (40 ^ 29) ^ (48 ^ 28);
        lllIIIIlIlI[7] = (-3202) & 16067;
        lllIIIIlIlI[8] = 51 ^ 45;
        lllIIIIlIlI[9] = (-((-23235) & 24287)) & (-2083) & 15999;
        lllIIIIlIlI[10] = 88 ^ 123;
        lllIIIIlIlI[11] = 42 ^ 2;
        lllIIIIlIlI[12] = 9 ^ 3;
        lllIIIIlIlI[13] = (195 ^ 157) ^ (8 ^ 94);
        lllIIIIlIlI[14] = (-16386) & 19263;
        lllIIIIlIlI[15] = (-((-1346) & 20335)) & (-1) & 24319;
    }
}
