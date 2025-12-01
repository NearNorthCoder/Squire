package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Starting")
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.e  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/e.class */
public class e extends Task {
    private static /* synthetic */ String[] lIIlllIllllI;
    private final /* synthetic */ Client v;
    private static /* synthetic */ int[] lIIlllIlllll;
    private final /* synthetic */ SquireBlueDragonKiller t;
    private final /* synthetic */ SquireBlueDragonKillerConfig u;

    static {
        llIlIIIlIlIlll();
        llIlIIIlIlIllI();
    }

    private static boolean llIlIIIlIllIlI(int i) {
        return i != 0;
    }

    private static boolean llIlIIIlIllIII(int i) {
        return i == 0;
    }

    private static boolean llIlIIIlIllIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public boolean run() {
        if (llIlIIIlIllIII(this.t.i() ? 1 : 0)) {
            return lIIlllIlllll[0];
        }
        BankLoadout bankLoadout = (BankLoadout) this.u.loadout().selected(BankLoadout.class);
        if (llIlIIIlIllIIl(bankLoadout)) {
            Log.error(lIIlllIllllI[lIIlllIlllll[0]]);
            this.t.forceStop();
            return lIIlllIlllll[1];
        }
        if (llIlIIIlIllIII(this.u.dragonLocation().p().contains(Players.getLocal()) ? 1 : 0) && llIlIIIlIllIlI(bankLoadout.needsToBank() ? 1 : 0)) {
            this.t.a((boolean) lIIlllIlllll[1]);
        }
        this.t.b((boolean) lIIlllIlllll[0]);
        return lIIlllIlllll[1];
    }

    private static void llIlIIIlIlIllI() {
        lIIlllIllllI = new String[lIIlllIlllll[1]];
        lIIlllIllllI[lIIlllIlllll[0]] = llIlIIIlIlIlIl("wOAt2IYKJty7aOm86HgBorJzZiGeKCbW", "UmxLi");
    }

    private static void llIlIIIlIlIlll() {
        lIIlllIlllll = new int[3];
        lIIlllIlllll[0] = ((36 ^ 122) ^ (158 ^ 162)) & (((49 ^ 71) ^ (16 ^ 4)) ^ (-" ".length()));
        lIIlllIlllll[1] = " ".length();
        lIIlllIlllll[2] = "  ".length();
    }

    @Inject
    public e(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, Client client) {
        this.t = squireBlueDragonKiller;
        this.u = squireBlueDragonKillerConfig;
        this.v = client;
    }

    private static String llIlIIIlIlIlIl(String lllllllllllllllIlllIlIlIIlIlIIll, String lllllllllllllllIlllIlIlIIlIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIlIIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIlllll[2], lllllllllllllllIlllIlIlIIlIlIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIlIIlIlIlII) {
            lllllllllllllllIlllIlIlIIlIlIlII.printStackTrace();
            return null;
        }
    }
}
