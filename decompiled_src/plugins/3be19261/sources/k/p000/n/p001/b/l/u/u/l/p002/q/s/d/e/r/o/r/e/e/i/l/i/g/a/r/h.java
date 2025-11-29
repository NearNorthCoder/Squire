package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating", priority = 130)
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.h  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/h.class */
public class h extends Task {
    private static /* synthetic */ String[] lIIllllIllIl;
    private static /* synthetic */ int[] lIIllllIlllI;
    private final /* synthetic */ SquireBlueDragonKillerConfig C;

    private static String llIlIIlIIIIlll(String lllllllllllllllIlllIlIIlIIIIIIII, String lllllllllllllllIlllIlIIIllllllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllllIlllI[1], lllllllllllllllIlllIlIIlIIIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIlIIIIIIIl) {
            lllllllllllllllIlllIlIIlIIIIIIIl.printStackTrace();
            return null;
        }
    }

    static {
        llIlIIlIIIlIIl();
        llIlIIlIIIlIII();
    }

    private static boolean llIlIIlIIIllII(Object obj) {
        return obj == null;
    }

    private static boolean llIlIIlIIIlIll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    public boolean run() {
        if (llIlIIlIIIlIll(llIlIIlIIIlIlI(Combat.getHealthPercent(), this.C.eatAt()))) {
            return lIIllllIlllI[0];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIIllllIlllI[2]];
            strArr[lIIllllIlllI[0]] = lIIllllIllIl[lIIllllIlllI[2]];
            return item.hasAction(strArr);
        });
        if (llIlIIlIIIllII(first)) {
            return lIIllllIlllI[0];
        }
        first.interact(lIIllllIllIl[lIIllllIlllI[0]]);
        sleep(lIIllllIlllI[1]);
        return lIIllllIlllI[2];
    }

    @Inject
    public h(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.C = squireBlueDragonKillerConfig;
    }

    private static void llIlIIlIIIlIII() {
        lIIllllIllIl = new String[lIIllllIlllI[1]];
        lIIllllIllIl[lIIllllIlllI[0]] = llIlIIlIIIIlll("lORYDEodjaM=", "amgZg");
        lIIllllIllIl[lIIllllIlllI[2]] = llIlIIlIIIIlll("O7m2FeHfCUE=", "QRfUX");
    }

    private static void llIlIIlIIIlIIl() {
        lIIllllIlllI = new int[3];
        lIIllllIlllI[0] = ((((138 + 21) - 2) + 10) ^ (((96 + 147) - 193) + 110)) & (((((114 + 110) - 187) + 149) ^ (((176 + 33) - 86) + 66)) ^ (-" ".length()));
        lIIllllIlllI[1] = "  ".length();
        lIIllllIlllI[2] = " ".length();
    }

    private static int llIlIIlIIIlIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }
}
