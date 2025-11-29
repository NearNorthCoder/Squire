package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

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
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Starting Minigame", priority = 50)
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.n  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/n.class */
public class n extends Task {
    private static /* synthetic */ int[] lllllllIIlIl;
    private final /* synthetic */ a I;
    private static /* synthetic */ String[] lllllllIIlII;

    static {
        lIIlIlIIlllIlII();
        lIIlIlIIlllIIll();
    }

    private static void lIIlIlIIlllIlII() {
        lllllllIIlIl = new int[5];
        lllllllIIlIl[0] = " ".length();
        lllllllIIlIl[1] = (26 ^ 64) & ((17 ^ 75) ^ (-1));
        lllllllIIlIl[2] = (-((-9443) & 13539)) & (-26885) & 32759;
        lllllllIIlIl[3] = 132 ^ 144;
        lllllllIIlIl[4] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lllllllIIlIl[0]];
        iArr[lllllllIIlIl[1]] = lllllllIIlIl[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIIlIlIIlllIlIl(nearest) && !lIIlIlIIlllIllI(Movement.shouldWalk() ? 1 : 0)) {
            if (lIIlIlIIlllIllI(Movement.isRunEnabled() ? 1 : 0) && lIIlIlIIlllIlll(Movement.getRunEnergy(), lllllllIIlIl[3])) {
                Movement.toggleRun();
            }
            this.I.a(lllllllIIlIl[1]);
            nearest.interact(lllllllIIlII[lllllllIIlIl[1]]);
            return lllllllIIlIl[0];
        }
        return lllllllIIlIl[1];
    }

    private static void lIIlIlIIlllIIll() {
        lllllllIIlII = new String[lllllllIIlIl[0]];
        lllllllIIlII[lllllllIIlIl[1]] = lIIlIlIIlllIIlI("qidJc9M4tyNytG6P8M4/dQ==", "PzXoL");
    }

    @Inject
    public n(a aVar) {
        this.I = aVar;
    }

    private static boolean lIIlIlIIlllIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIlIIlllIllI(int i) {
        return i == 0;
    }

    private static String lIIlIlIIlllIIlI(String lllllllllllllllIIlIIllIIIlIlIIll, String lllllllllllllllIIlIIllIIIlIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllllIIlIl[4], lllllllllllllllIIlIIllIIIlIlIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIIIlIlIlII) {
            lllllllllllllllIIlIIllIIIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlllIlIl(Object obj) {
        return obj == null;
    }
}
