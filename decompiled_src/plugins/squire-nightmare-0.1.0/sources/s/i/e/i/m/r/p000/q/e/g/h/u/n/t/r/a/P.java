package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.FakeXpDrop;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Charge Tracker", register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.P  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/P.class */
public class P extends Task {
    private static /* synthetic */ String[] lllIlllIlIIl;
    private static /* synthetic */ int[] lllIlllIlIlI;

    private static boolean lIIIllIllllIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIllIllllIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean run() {
        return lllIlllIlIlI[0];
    }

    private static void lIIIllIlllIlllI() {
        lllIlllIlIIl = new String[lllIlllIlIlI[1]];
        lllIlllIlIIl[lllIlllIlIlI[0]] = lIIIllIlllIllIl("bz3LY/P6hwo=", "NLMWi");
    }

    private static boolean lIIIllIllllIIIl(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void a(FakeXpDrop fakeXpDrop) {
        Actor interacting = Players.getLocal().getInteracting();
        if (lIIIllIllllIIII(interacting instanceof NPC ? 1 : 0) && lIIIllIllllIIIl(interacting.getName()) && lIIIllIllllIIII(interacting.getName().toLowerCase().contains(lllIlllIlIIl[lllIlllIlIlI[0]]) ? 1 : 0) && lIIIllIllllIIlI(fakeXpDrop.getSkill(), Skill.HITPOINTS)) {
            N.p(N.ch() - lllIlllIlIlI[1]);
        }
    }

    private static void lIIIllIlllIllll() {
        lllIlllIlIlI = new int[4];
        lllIlllIlIlI[0] = ((((98 + 91) - 162) + 115) ^ (((147 + 79) - 220) + 173)) & (((12 ^ 95) ^ (32 ^ 78)) ^ (-" ".length()));
        lllIlllIlIlI[1] = " ".length();
        lllIlllIlIlI[2] = 68 ^ 76;
        lllIlllIlIlI[3] = "  ".length();
    }

    private static String lIIIllIlllIllIl(String lllllllllllllllIIllIIlIIlIIlIIII, String lllllllllllllllIIllIIlIIlIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), lllIlllIlIlI[2]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlllIlIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIIlIIlIIIl) {
            lllllllllllllllIIllIIlIIlIIlIIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIIllIlllIllll();
        lIIIllIlllIlllI();
    }
}
