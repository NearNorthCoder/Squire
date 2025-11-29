package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Attack T1 Monsters", priority = 2)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.P  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/P.class */
public class P extends AbstractC0013n {
    private static /* synthetic */ int[] llIlIIIIIIlI;
    private final /* synthetic */ C0001b ca;
    private static /* synthetic */ String[] llIlIIIIIIIl;

    private static boolean lIIIIIIIlIIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public P(C0002c c0002c, C0001b c0001b) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIlIIIIIIlI[0]];
        enumC0003dArr[llIlIIIIIIlI[1]] = EnumC0003d.FIRST_ROTATION_EXPLORE;
        this.ca = c0001b;
    }

    private static boolean lIIIIIIIlIIllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIIIIIIIlIIlIlI() {
        llIlIIIIIIlI = new int[4];
        llIlIIIIIIlI[0] = " ".length();
        llIlIIIIIIlI[1] = ((((169 + 168) - 185) + 35) ^ (((92 + 154) - 226) + 153)) & (((((42 + 43) - (-43)) + 82) ^ (((71 + 135) - 121) + 111)) ^ (-" ".length()));
        llIlIIIIIIlI[2] = 120 ^ 125;
        llIlIIIIIIlI[3] = "  ".length();
    }

    private static boolean lIIIIIIIlIIllII(int i) {
        return i == 0;
    }

    static {
        lIIIIIIIlIIlIlI();
        lIIIIIIIlIIlIIl();
    }

    private static boolean lIIIIIIIlIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIIlIIllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        int i;
        int i2;
        Player local = Players.getLocal();
        if (!lIIIIIIIlIIlIll(local) || lIIIIIIIlIIlIll(local.getInteracting())) {
            return llIlIIIIIIlI[1];
        }
        if (lIIIIIIIlIIllII(this.ba.B() ? 1 : 0)) {
            return llIlIIIIIIlI[1];
        }
        C0007h V = this.ba.V();
        C0011l orElse = V.ar().orElse(null);
        if (!lIIIIIIIlIIlIll(orElse) || lIIIIIIIlIIllIl(orElse, V.av())) {
            i = llIlIIIIIIlI[0];
            "".length();
            if ("  ".length() < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIlIIIIIIlI[1];
        }
        int i3 = i;
        int[][] iArr = C0004e.as;
        if (lIIIIIIIlIIlllI(i3)) {
            i2 = llIlIIIIIIlI[0];
            "".length();
            if ((-((76 ^ 36) ^ (237 ^ 129))) >= 0) {
                return ((192 ^ 160) ^ (63 ^ 1)) & (((223 ^ 149) ^ (139 ^ 159)) ^ (-" ".length()));
            }
        } else {
            i2 = llIlIIIIIIlI[1];
        }
        NPC npc = (NPC) NPCs.getAll(iArr[i2]).stream().filter(npc2 -> {
            if (lIIIIIIIlIIllII(npc2.isDead() ? 1 : 0)) {
                ?? r0 = llIlIIIIIIlI[0];
                "".length();
                return (((((59 + 111) - 151) + 132) ^ (((135 + 113) - 238) + 157)) & (((((103 + 47) - (-5)) + 31) ^ (((9 + 108) - 24) + 45)) ^ (-" ".length()))) != 0 ? ((96 ^ 9) ^ (195 ^ 163)) & (((35 ^ 99) ^ (223 ^ 150)) ^ (-" ".length())) : r0;
            }
            return llIlIIIIIIlI[1];
        }).min(Comparator.comparingInt(npc3 -> {
            return npc3.distanceTo(local.getWorldLocation());
        })).orElse(null);
        if (lIIIIIIIlIIllll(npc)) {
            return llIlIIIIIIlI[1];
        }
        if (lIIIIIIIlIIllII(this.ca.t() ? 1 : 0) && lIIIIIIIlIIllII(local.isMoving() ? 1 : 0)) {
            npc.interact(llIlIIIIIIIl[llIlIIIIIIlI[1]]);
            this.ca.c(llIlIIIIIIlI[2]);
        }
        return llIlIIIIIIlI[0];
    }

    private static void lIIIIIIIlIIlIIl() {
        llIlIIIIIIIl = new String[llIlIIIIIIlI[0]];
        llIlIIIIIIIl[llIlIIIIIIlI[1]] = lIIIIIIIlIIlIII("1Bq3nSBQ+xs=", "bMAFK");
    }

    private static String lIIIIIIIlIIlIII(String lllllllllllllllIlIIIlllIlIllIllI, String lllllllllllllllIlIIIlllIlIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllIlIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIlllIlIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIlllIlIlllIII.init(llIlIIIIIIlI[3], secretKeySpec);
            return new String(lllllllllllllllIlIIIlllIlIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIlllIlIllIlll) {
            lllllllllllllllIlIIIlllIlIllIlll.printStackTrace();
            return null;
        }
    }
}
