package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.query.entities.NPCQuery;
import net.unethicalite.api.query.results.SceneEntityQueryResults;
@TaskDesc(name = "Disturbing Kraken")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.R  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/R.class */
public class R extends Task {
    private static /* synthetic */ int[] llIllIllI;
    private static /* synthetic */ String[] llIllIlIl;

    private static boolean lIllllIllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        Player local = Players.getLocal();
        if (lIllllIllIl(local)) {
            return llIllIllI[0];
        }
        if (!lIllllIlllI(local.isAnimating() ? 1 : 0) || lIllllIllll(local.getInteracting())) {
            return llIllIllI[0];
        }
        NPCQuery query = NPCs.query();
        Interactable[] interactableArr = new Interactable[llIllIllI[1]];
        interactableArr[llIllIllI[0]] = Players.getLocal();
        if (lIllllIllll(((SceneEntityQueryResults) query.targeting(interactableArr).results()).nearest())) {
            return llIllIllI[0];
        }
        int[] iArr = new int[llIllIllI[1]];
        iArr[llIllIllI[0]] = llIllIllI[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (!lIllllIllIl(nearest) && !lIlllllIIII(nearest.distanceTo(local), llIllIllI[3])) {
            nearest.interact(llIllIlIl[llIllIllI[0]]);
            return llIllIllI[1];
        }
        return llIllIllI[0];
    }

    private static boolean lIllllIllIl(Object obj) {
        return obj == null;
    }

    static {
        lIllllIllII();
        lIllllIlIll();
    }

    private static void lIllllIllII() {
        llIllIllI = new int[5];
        llIllIllI[0] = (8 ^ 95) & ((6 ^ 81) ^ (-1));
        llIllIllI[1] = " ".length();
        llIllIllI[2] = (-((-24581) & 32277)) & (-3) & 8191;
        llIllIllI[3] = 169 ^ 163;
        llIllIllI[4] = "  ".length();
    }

    private static String lIllllIlIlI(String lIlIlllIlIIlllI, String lIlIlllIlIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllIlIlIIII = Cipher.getInstance("Blowfish");
            lIlIlllIlIlIIII.init(llIllIllI[4], secretKeySpec);
            return new String(lIlIlllIlIlIIII.doFinal(Base64.getDecoder().decode(lIlIlllIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllIlIIllll) {
            lIlIlllIlIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIIII(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIllllIlllI(int i2) {
        return i2 == 0;
    }

    private static void lIllllIlIll() {
        llIllIlIl = new String[llIllIllI[1]];
        llIllIlIl[llIllIllI[0]] = lIllllIlIlI("LxnUu3sBcIs=", "SBYEq");
    }
}
