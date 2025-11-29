package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking To Bank")
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.k  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/k.class */
public class k extends Task {
    private static /* synthetic */ String[] lIIllllIIIll;
    private static /* synthetic */ int[] lIIllllIIlII;
    private final /* synthetic */ SquireBlueDragonKiller G;
    private final /* synthetic */ SquireBlueDragonKillerConfig H;

    private static void llIlIIIllIlIll() {
        lIIllllIIIll = new String[lIIllllIIlII[3]];
        lIIllllIIIll[lIIllllIIlII[0]] = llIlIIIllIlIIl("gjcO4k965wc=", "zlteX");
        lIIllllIIIll[lIIllllIIlII[1]] = llIlIIIllIlIlI("KwspMzA=", "ljDVC");
        lIIllllIIIll[lIIllllIIlII[2]] = llIlIIIllIlIIl("RiEsshj93Jw=", "SkGzT");
    }

    private static boolean llIlIIIllIlllI(int i) {
        return i != 0;
    }

    static {
        llIlIIIllIllII();
        llIlIIIllIlIll();
    }

    private static String llIlIIIllIlIlI(String lllllllllllllllIlllIlIIllIlIIIll, String lllllllllllllllIlllIlIIllIlIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIllIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlllIlIIllIlIIIII = lllllllllllllllIlllIlIIllIlIIIlI.toCharArray();
        int lllllllllllllllIlllIlIIllIIlllll = lIIllllIIlII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllllIIlII[0];
        while (llIlIIIllIllll(i, length)) {
            char lllllllllllllllIlllIlIIllIIlIllI = charArray[i];
            sb.append((char) (lllllllllllllllIlllIlIIllIIlIllI ^ lllllllllllllllIlllIlIIllIlIIIII[lllllllllllllllIlllIlIIllIIlllll % lllllllllllllllIlllIlIIllIlIIIII.length]));
            "".length();
            lllllllllllllllIlllIlIIllIIlllll++;
            i++;
            "".length();
            if ((((231 ^ 190) ^ (31 ^ 103)) & (((((59 + 172) - 116) + 110) ^ (((63 + 158) - 86) + 57)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (!llIlIIIllIllIl(this.G.h() ? 1 : 0) && !llIlIIIllIlllI(y() ? 1 : 0)) {
            z();
            return lIIllllIIlII[1];
        }
        return lIIllllIIlII[0];
    }

    private static boolean llIlIIIllIllIl(int i) {
        return i == 0;
    }

    private static boolean llIlIIIllIllll(int i, int i2) {
        return i < i2;
    }

    @Inject
    public k(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.G = squireBlueDragonKiller;
        this.H = squireBlueDragonKillerConfig;
    }

    private static void llIlIIIllIllII() {
        lIIllllIIlII = new int[5];
        lIIllllIIlII[0] = ((15 ^ 79) ^ (103 ^ 10)) & (((123 ^ 115) ^ (97 ^ 68)) ^ (-" ".length()));
        lIIllllIIlII[1] = " ".length();
        lIIllllIIlII[2] = "  ".length();
        lIIllllIIlII[3] = "   ".length();
        lIIllllIIlII[4] = 51 ^ 59;
    }

    private static String llIlIIIllIlIIl(String lllllllllllllllIlllIlIIllIllIIll, String lllllllllllllllIlllIlIIllIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIllIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIllIllIIlI.getBytes(StandardCharsets.UTF_8)), lIIllllIIlII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllIIlII[2], lllllllllllllllIlllIlIIllIllIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIllIllIlII) {
            lllllllllllllllIlllIlIIllIllIlII.printStackTrace();
            return null;
        }
    }

    private void z() {
        if (llIlIIIllIllIl(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        if (llIlIIIllIlllI(Inventory.contains(item -> {
            return item.getName().contains(lIIllllIIIll[lIIllllIIlII[2]]);
        }) ? 1 : 0)) {
            Inventory.getFirst(item2 -> {
                return item2.getName().contains(lIIllllIIIll[lIIllllIIlII[1]]);
            }).interact(lIIllllIIIll[lIIllllIIlII[0]]);
            return;
        }
        Movement.walkTo(this.H.bankLocation().getArea());
        "".length();
    }

    private boolean y() {
        return this.H.bankLocation().getArea().contains(Players.getLocal());
    }
}
