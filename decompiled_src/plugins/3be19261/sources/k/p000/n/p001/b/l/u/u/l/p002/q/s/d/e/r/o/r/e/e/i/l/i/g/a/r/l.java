package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking To Blue Dragons")
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.l  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/l.class */
public class l extends Task {
    private static /* synthetic */ int[] lIIllllIllII;
    private final /* synthetic */ a J;
    private final /* synthetic */ SquireBlueDragonKiller K;
    private static /* synthetic */ String[] lIIllllIlIll;
    private final /* synthetic */ SquireBlueDragonKillerConfig I;

    private static String llIlIIlIIIIIlI(String lllllllllllllllIlllIlIIlIIIlIlIl, String lllllllllllllllIlllIlIIlIIIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlIIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlIIIlIlll.init(lIIllllIllII[2], secretKeySpec);
            return new String(lllllllllllllllIlllIlIIlIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIlIIIlIllI) {
            lllllllllllllllIlllIlIIlIIIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIIIIlIl(int i) {
        return i != 0;
    }

    static {
        llIlIIlIIIIlII();
        llIlIIlIIIIIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (llIlIIlIIIIlIl(s() ? 1 : 0)) {
            return lIIllllIllII[0];
        }
        C();
        return lIIllllIllII[1];
    }

    private boolean y() {
        return this.I.bankLocation().getArea().contains(Players.getLocal());
    }

    private static void llIlIIlIIIIlII() {
        lIIllllIllII = new int[3];
        lIIllllIllII[0] = ((171 ^ 185) ^ (58 ^ 97)) & (((((58 + 81) - 120) + 203) ^ (((108 + 4) - 64) + 103)) ^ (-" ".length()));
        lIIllllIllII[1] = " ".length();
        lIIllllIllII[2] = "  ".length();
    }

    private boolean A() {
        return this.J.n();
    }

    private void C() {
        if (llIlIIlIIIIllI(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        Movement.walkTo(this.I.dragonLocation().o());
        "".length();
    }

    @Inject
    public l(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, a aVar, SquireBlueDragonKiller squireBlueDragonKiller) {
        this.I = squireBlueDragonKillerConfig;
        this.J = aVar;
        this.K = squireBlueDragonKiller;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean B() {
        if (llIlIIlIIIIlIl(Inventory.isFull() ? 1 : 0) && llIlIIlIIIIllI(Inventory.contains(item -> {
            String[] strArr = new String[lIIllllIllII[1]];
            strArr[lIIllllIllII[0]] = lIIllllIlIll[lIIllllIllII[0]];
            return item.hasAction(strArr);
        }) ? 1 : 0)) {
            ?? r0 = lIIllllIllII[1];
            "".length();
            return (3 ^ 6) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllllIllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    private boolean s() {
        if ((!llIlIIlIIIIlIl(this.K.h() ? 1 : 0) || llIlIIlIIIIllI(y() ? 1 : 0)) && llIlIIlIIIIllI(A() ? 1 : 0) && llIlIIlIIIIllI(B() ? 1 : 0) && !llIlIIlIIIIllI(Inventory.contains(item -> {
            String[] strArr = new String[lIIllllIllII[1]];
            strArr[lIIllllIllII[0]] = lIIllllIlIll[lIIllllIllII[1]];
            return item.hasAction(strArr);
        }) ? 1 : 0)) {
            return lIIllllIllII[0];
        }
        ?? r0 = lIIllllIllII[1];
        "".length();
        return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static void llIlIIlIIIIIll() {
        lIIllllIlIll = new String[lIIllllIllII[2]];
        lIIllllIlIll[lIIllllIllII[0]] = llIlIIlIIIIIlI("oZ6BDubGi1I=", "mBccd");
        lIIllllIlIll[lIIllllIllII[1]] = llIlIIlIIIIIlI("97zxFWZss5w=", "euXjI");
    }

    private static boolean llIlIIlIIIIllI(int i) {
        return i == 0;
    }
}
