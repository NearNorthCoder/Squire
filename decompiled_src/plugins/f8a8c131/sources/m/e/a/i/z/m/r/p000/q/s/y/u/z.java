package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Killing last minion with ranged")
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.z  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/z.class */
public class z extends Task {
    private final /* synthetic */ Client aw;
    private final /* synthetic */ SquireZammyConfig av;
    private final /* synthetic */ l au;
    private static /* synthetic */ int[] lIllIIIlllIlI;
    private static /* synthetic */ String[] lIllIIIlllIIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIlIlIlIllIl(this.au.B() ? 1 : 0) || llIIIlIlIlIllIl(this.au.A() ? 1 : 0)) {
            return lIllIIIlllIlI[0];
        }
        if (!llIIIlIlIlIlllI(this.au.H() ? 1 : 0) || llIIIlIlIlIllll(this.au.z(), lIllIIIlllIlI[1])) {
            return lIllIIIlllIlI[0];
        }
        if (llIIIlIlIllIIII(Players.getLocal().getInteracting())) {
            return lIllIIIlllIlI[0];
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIIIlIlIlIlllI(npc.isDead() ? 1 : 0) && llIIIlIlIllIIII(EnumC0004e.a(npc))) {
                ?? r0 = lIllIIIlllIlI[2];
                "".length();
                return (true ^ true) == ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIIIlllIlI[0];
        });
        if (llIIIlIlIllIIlI(nearest)) {
            return lIllIIIlllIlI[0];
        }
        nearest.interact(lIllIIIlllIIl[lIllIIIlllIlI[0]]);
        return lIllIIIlllIlI[2];
    }

    private static boolean llIIIlIlIlIllll(int i, int i2) {
        return i <= i2;
    }

    private static void llIIIlIlIlIllII() {
        lIllIIIlllIlI = new int[5];
        lIllIIIlllIlI[0] = ((9 ^ 52) ^ (217 ^ 190)) & (((49 ^ 124) ^ (91 ^ 76)) ^ (-" ".length()));
        lIllIIIlllIlI[1] = (123 ^ 10) ^ (221 ^ 166);
        lIllIIIlllIlI[2] = " ".length();
        lIllIIIlllIlI[3] = 107 ^ 99;
        lIllIIIlllIlI[4] = "  ".length();
    }

    @Inject
    public z(l lVar, SquireZammyConfig squireZammyConfig, Client client) {
        this.au = lVar;
        this.av = squireZammyConfig;
        this.aw = client;
    }

    private static boolean llIIIlIlIlIllIl(int i) {
        return i != 0;
    }

    private static String llIIIlIlIlIlIIl(String llllllllllllllIllIIlIllIIlIIllII, String llllllllllllllIllIIlIllIIlIIlIll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIllIIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllIIlIIlIll.getBytes(StandardCharsets.UTF_8)), lIllIIIlllIlI[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIlllIlI[4], llllllllllllllIllIIlIllIIlIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIllIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIllIIlIIlIII) {
            llllllllllllllIllIIlIllIIlIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIlIllIIII(Object obj) {
        return obj != null;
    }

    private static boolean llIIIlIlIllIIlI(Object obj) {
        return obj == null;
    }

    static {
        llIIIlIlIlIllII();
        llIIIlIlIlIlIlI();
    }

    private static boolean llIIIlIlIlIlllI(int i) {
        return i == 0;
    }

    private static void llIIIlIlIlIlIlI() {
        lIllIIIlllIIl = new String[lIllIIIlllIlI[2]];
        lIllIIIlllIIl[lIllIIIlllIlI[0]] = llIIIlIlIlIlIIl("oX4NOzkih6Q=", "cxuee");
    }
}
