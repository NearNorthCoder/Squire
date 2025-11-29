package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.a  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/a.class */
public class a {
    private static /* synthetic */ int[] lIIlllIllIIl;
    private static /* synthetic */ String[] lIIlllIlIlll;
    private final /* synthetic */ SquireBlueDragonKillerConfig n;

    private static void llIlIIIlIIIlIl() {
        lIIlllIllIIl = new int[6];
        lIIlllIllIIl[0] = ((108 ^ 12) ^ (43 ^ 93)) & (((44 ^ 89) ^ (122 ^ 25)) ^ (-" ".length()));
        lIIlllIllIIl[1] = " ".length();
        lIIlllIllIIl[2] = "  ".length();
        lIIlllIllIIl[3] = "   ".length();
        lIIlllIllIIl[4] = 3 ^ 7;
        lIIlllIllIIl[5] = 183 ^ 191;
    }

    private static String llIlIIIIlllllI(String lllllllllllllllIlllIlIlIllIIlIIl, String lllllllllllllllIlllIlIlIllIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIlIllIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIlIllIIlIll.init(lIIlllIllIIl[2], secretKeySpec);
            return new String(lllllllllllllllIlllIlIlIllIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIlIllIIlIlI) {
            lllllllllllllllIlllIlIlIllIIlIlI.printStackTrace();
            return null;
        }
    }

    private void l() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIlIIIlIIlIIl(npc.isDead() ? 1 : 0) && llIlIIIlIIlIlI(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = lIIlllIllIIl[1];
                "".length();
                return ((49 ^ 44) & ((119 ^ 106) ^ (-1))) >= (91 ^ 95) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlllIllIIl[0];
        });
        if (llIlIIIlIIlIII(nearest)) {
            return;
        }
        nearest.interact(lIIlllIlIlll[lIIlllIllIIl[1]]);
    }

    private static String llIlIIIIllllIl(String lllllllllllllllIlllIlIlIlIlIllII, String lllllllllllllllIlllIlIlIlIlIlIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIlIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlllIlIlIlIlIlIIl = lllllllllllllllIlllIlIlIlIlIlIll.toCharArray();
        int lllllllllllllllIlllIlIlIlIlIlIII = lIIlllIllIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlllIllIIl[0];
        while (llIlIIIlIIlIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlllIlIlIlIlIlIIl[lllllllllllllllIlllIlIlIlIlIlIII % lllllllllllllllIlllIlIlIlIlIlIIl.length]));
            "".length();
            lllllllllllllllIlllIlIlIlIlIlIII++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public boolean n() {
        return this.n.dragonLocation().p().contains(Players.getLocal().getWorldLocation());
    }

    public NPC j() {
        return NPCs.getNearest(npc -> {
            if (llIlIIIlIIlIIl(npc.isDead() ? 1 : 0) && llIlIIIlIIIlll(npc.getName().equals(lIIlllIlIlll[lIIlllIllIIl[3]]) ? 1 : 0) && llIlIIIlIIIlll(npc.getWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) {
                ?? r0 = lIIlllIllIIl[1];
                "".length();
                return (((((35 + 92) - 110) + 117) ^ (((108 + 50) - 19) + 0)) & (((10 ^ 56) ^ (253 ^ 194)) ^ (-" ".length()))) != (((((70 + 73) - 22) + 82) ^ (((131 + 119) - 189) + 72)) & (((((142 + 119) - 205) + 140) ^ (((76 + 92) - 70) + 40)) ^ (-" ".length()))) ? ((((210 + 153) - 152) + 24) ^ (((139 + 117) - 190) + 130)) & (((42 ^ 67) ^ (98 ^ 36)) ^ (-" ".length())) : r0;
            }
            return lIIlllIllIIl[0];
        });
    }

    private static boolean llIlIIIlIIlIIl(int i) {
        return i == 0;
    }

    public void k() {
        if (llIlIIIlIIIllI(Players.getLocal().getInteracting())) {
            return;
        }
        if (llIlIIIlIIIlll(m() ? 1 : 0)) {
            l();
        }
        NPC j = j();
        if (llIlIIIlIIlIII(j)) {
            return;
        }
        j.interact(lIIlllIlIlll[lIIlllIllIIl[0]]);
    }

    private static boolean llIlIIIlIIIllI(Object obj) {
        return obj != null;
    }

    private static String llIlIIIIllllll(String lllllllllllllllIlllIlIlIlIllllII, String lllllllllllllllIlllIlIlIlIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIlIlllIll.getBytes(StandardCharsets.UTF_8)), lIIlllIllIIl[5]), "DES");
            Cipher lllllllllllllllIlllIlIlIlIlllllI = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIlIlIlllllI.init(lIIlllIllIIl[2], secretKeySpec);
            return new String(lllllllllllllllIlllIlIlIlIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIlIlIllllIl) {
            lllllllllllllllIlllIlIlIlIllllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (llIlIIIlIIlIIl(r0.hasAction(r1) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m() {
        Actor interacting = Players.getLocal().getInteracting();
        if (llIlIIIlIIIllI(interacting)) {
            String[] strArr = new String[lIIlllIllIIl[1]];
            strArr[lIIlllIllIIl[0]] = lIIlllIlIlll[lIIlllIllIIl[2]];
        }
        if (!llIlIIIlIIlIIl(NPCs.getAll(npc -> {
            if (llIlIIIlIIlIlI(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = lIIlllIllIIl[1];
                "".length();
                return (((198 ^ 136) ^ (87 ^ 121)) & (((41 ^ 47) ^ (231 ^ 129)) ^ (-" ".length()))) > 0 ? ((96 ^ 103) ^ (44 ^ 102)) & (((((135 + 41) - 83) + 153) ^ (((40 + 9) - (-63)) + 75)) ^ (-" ".length())) : r0;
            }
            return lIIlllIllIIl[0];
        }).isEmpty() ? 1 : 0)) {
            return lIIlllIllIIl[0];
        }
        ?? r0 = lIIlllIllIIl[1];
        "".length();
        return (-" ".length()) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static boolean llIlIIIlIIlIII(Object obj) {
        return obj == null;
    }

    private static boolean llIlIIIlIIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIlIIIlIIIlll(int i) {
        return i != 0;
    }

    @Inject
    public a(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.n = squireBlueDragonKillerConfig;
    }

    private static boolean llIlIIIlIIlIll(int i, int i2) {
        return i < i2;
    }

    private static void llIlIIIlIIIIII() {
        lIIlllIlIlll = new String[lIIlllIllIIl[4]];
        lIIlllIlIlll[lIIlllIllIIl[0]] = llIlIIIIllllIl("EQQ7JRk7", "PpODz");
        lIIlllIlIlll[lIIlllIllIIl[1]] = llIlIIIIllllIl("LBE2KSwG", "meBHO");
        lIIlllIlIlll[lIIlllIllIIl[2]] = llIlIIIIlllllI("YQ7822DGXXg=", "wwsFB");
        lIIlllIlIlll[lIIlllIllIIl[3]] = llIlIIIIllllll("DrwWHUNtqrayUMvspFkh5g==", "xHwDH");
    }

    static {
        llIlIIIlIIIlIl();
        llIlIIIlIIIIII();
    }
}
