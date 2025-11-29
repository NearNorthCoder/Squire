package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 8)
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.o  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/o.class */
public class o extends Task {
    private final /* synthetic */ f U;
    private final /* synthetic */ d T;
    private static /* synthetic */ int[] llIllllIlII;
    private final /* synthetic */ e S;
    private final /* synthetic */ r V;
    private static /* synthetic */ String[] llIllllIIll;

    static {
        lIlIllIIIIIllI();
        lIlIllIIIIIlIl();
    }

    @Inject
    public o(e eVar, d dVar, f fVar, r rVar) {
        this.S = eVar;
        this.T = dVar;
        this.U = fVar;
        this.V = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    public boolean run() {
        if (!lIlIllIIIIIlll(this.S.t() ? 1 : 0) || lIlIllIIIIlIII(this.S.y() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        if (lIlIllIIIIIlll(this.S.s() ? 1 : 0) && lIlIllIIIIlIIl(this.T.m())) {
            return llIllllIlII[0];
        }
        if (!lIlIllIIIIlIlI(Combat.getCurrentHealth(), llIllllIlII[1]) || lIlIllIIIIlIII(this.U.D() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        if (lIlIllIIIIIlll(this.V.O() ? 1 : 0) && lIlIllIIIIIlll(this.S.s() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (lIlIllIIIIlIII(item.getName().equals(llIllllIIll[llIllllIlII[3]]) ? 1 : 0)) {
                String str = llIllllIIll[llIllllIlII[4]];
                if (lIlIllIIIIIlll(item.hasAction((v1) -> {
                    return r1.equals(v1);
                }) ? 1 : 0)) {
                    ?? r0 = llIllllIlII[2];
                    "".length();
                    return ((((89 + 46) - 50) + 89) ^ (((166 + 6) - 111) + 109)) <= (-" ".length()) ? ((((101 + 218) - 248) + 159) ^ (((6 + 24) - (-62)) + 81)) & (((67 ^ 0) ^ (187 ^ 179)) ^ (-" ".length())) : r0;
                }
            }
            return llIllllIlII[0];
        });
        if (lIlIllIIIIlIll(first)) {
            String[] strArr = new String[llIllllIlII[2]];
            strArr[llIllllIlII[0]] = llIllllIIll[llIllllIlII[0]];
            first = Inventory.getFirst(strArr);
        }
        if (lIlIllIIIIlIll(first)) {
            return M();
        }
        first.interact(llIllllIIll[llIllllIlII[2]]);
        this.U.C();
        return llIllllIlII[2];
    }

    private static boolean lIlIllIIIIlIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    private boolean M() {
        return llIllllIlII[0];
    }

    private static boolean lIlIllIIIIlIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIllIIIIlIIl(Object obj) {
        return obj != null;
    }

    private static void lIlIllIIIIIllI() {
        llIllllIlII = new int[7];
        llIllllIlII[0] = (1 ^ 50) & ((164 ^ 151) ^ (-1));
        llIllllIlII[1] = 197 ^ 132;
        llIllllIlII[2] = " ".length();
        llIllllIlII[3] = "  ".length();
        llIllllIlII[4] = "   ".length();
        llIllllIlII[5] = (((93 + 93) - 41) + 9) ^ (((98 + 51) - 131) + 140);
        llIllllIlII[6] = (((88 + 99) - 71) + 75) ^ (((79 + 121) - 92) + 75);
    }

    private static String lIlIllIIIIIlII(String llllllllllllllllIIlIlIIlllIllllI, String llllllllllllllllIIlIlIIlllIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlllIlllIl.getBytes(StandardCharsets.UTF_8)), llIllllIlII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllllIlII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIlllIlllll) {
            llllllllllllllllIIlIlIIlllIlllll.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIIIIIlIl() {
        llIllllIIll = new String[llIllllIlII[5]];
        llIllllIIll[llIllllIlII[0]] = lIlIllIIIIIIll("zXs3cMuCDKU=", "ADETI");
        llIllllIIll[llIllllIlII[2]] = lIlIllIIIIIlII("t+r4NvyuKEA=", "nVieJ");
        llIllllIIll[llIllllIlII[3]] = lIlIllIIIIIlII("dqIMhxVrhro=", "YlXTO");
        llIllllIIll[llIllllIlII[4]] = lIlIllIIIIIIll("r3WN/OdCAeY=", "YmQgw");
    }

    private static boolean lIlIllIIIIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIllIIIIIlll(int i) {
        return i != 0;
    }

    private static String lIlIllIIIIIIll(String llllllllllllllllIIlIlIIllllIlIll, String llllllllllllllllIIlIlIIllllIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIllllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIllllIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIllllIllIl.init(llIllllIlII[3], secretKeySpec);
            return new String(llllllllllllllllIIlIlIIllllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIllllIllII) {
            llllllllllllllllIIlIlIIllllIllII.printStackTrace();
            return null;
        }
    }
}
