package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Picking up pet", priority = 250, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/q.class */
public class C0016q extends Task {
    private final /* synthetic */ C0002c bw;
    private static /* synthetic */ int[] llIIllIIIlIl;
    private static /* synthetic */ String[] llIIllIIIlII;

    private static boolean llllllIIlllIII(int i) {
        return i != 0;
    }

    static {
        llllllIIllIlll();
        llllllIIllIllI();
    }

    private static boolean llllllIIlllIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    public boolean run() {
        if (llllllIIlllIII(this.bw.A() ? 1 : 0)) {
            return llIIllIIIlIl[0];
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (llllllIIlllIII(Players.getLocal().equals(npc.getInteracting()) ? 1 : 0)) {
                String str = llIIllIIIlII[llIIllIIIlIl[1]];
                if (llllllIIlllIII(npc.hasAction((v1) -> {
                    return r1.equals(v1);
                }) ? 1 : 0)) {
                    ?? r0 = llIIllIIIlIl[1];
                    "".length();
                    return (((((115 + 126) - 192) + 123) ^ (((79 + 77) - 60) + 58)) & (((240 ^ 166) ^ (214 ^ 182)) ^ (-" ".length()))) > 0 ? ((127 ^ 79) ^ (168 ^ 194)) & (((134 ^ 176) ^ (102 ^ 10)) ^ (-" ".length())) : r0;
                }
            }
            return llIIllIIIlIl[0];
        });
        if (llllllIIlllIIl(nearest)) {
            return llIIllIIIlIl[0];
        }
        nearest.interact(llIIllIIIlII[llIIllIIIlIl[0]]);
        return llIIllIIIlIl[1];
    }

    private static String llllllIIllIlIl(String lllllllllllllllIlIIlIllIllllIlII, String lllllllllllllllIlIIlIllIllllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllIllllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllIllllIllI.init(llIIllIIIlIl[2], secretKeySpec);
            return new String(lllllllllllllllIlIIlIllIllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIllllIlIl) {
            lllllllllllllllIlIIlIllIllllIlIl.printStackTrace();
            return null;
        }
    }

    private static void llllllIIllIlll() {
        llIIllIIIlIl = new int[3];
        llIIllIIIlIl[0] = ((57 ^ 74) ^ (24 ^ 93)) & (((((10 + 65) - (-38)) + 14) ^ (66 ^ 11)) ^ (-" ".length()));
        llIIllIIIlIl[1] = " ".length();
        llIIllIIIlIl[2] = "  ".length();
    }

    @Inject
    public C0016q(C0002c c0002c) {
        this.bw = c0002c;
    }

    private static void llllllIIllIllI() {
        llIIllIIIlII = new String[llIIllIIIlIl[2]];
        llIIllIIIlII[llIIllIIIlIl[0]] = llllllIIllIlIl("juyvjXwtX20=", "yWksH");
        llIIllIIIlII[llIIllIIIlIl[1]] = llllllIIllIlIl("IYh+2ICg/5k=", "Zpvqm");
    }
}
