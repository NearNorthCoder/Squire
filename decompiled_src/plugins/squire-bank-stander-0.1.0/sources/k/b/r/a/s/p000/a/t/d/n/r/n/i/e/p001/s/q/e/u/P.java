package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Smelting", register = true)
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.P  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/P.class */
public class P extends AbstractC0000a {
    private static /* synthetic */ String[] lllIlIllIll;
    private static /* synthetic */ int[] lllIlIlllII;

    private static boolean lIllIIIIIlIlIl(int i) {
        return i == 0;
    }

    private static boolean lIllIIIIIllIII(Object obj) {
        return obj != null;
    }

    static {
        lIllIIIIIlIIll();
        lIllIIIIIlIIlI();
    }

    private static boolean lIllIIIIIlIlII(int i) {
        return i != 0;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIlIlllII[3];
    }

    private static boolean lIllIIIIIllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIIIlIlll(Object obj) {
        return obj == null;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(this.j.smeltingProduct().q()), Integer.valueOf(this.j.smeltingProduct().r()), Integer.valueOf(this.j.smeltingProduct().t()), Integer.valueOf(this.j.smeltingProduct().u()));
    }

    private static void lIllIIIIIlIIlI() {
        lllIlIllIll = new String[lllIlIlllII[4]];
        lllIlIllIll[lllIlIlllII[0]] = lIllIIIIIlIIII("WULxWLzuqxo=", "TqvTf");
        lllIlIllIll[lllIlIlllII[1]] = lIllIIIIIlIIIl("FA4wFD4=", "GcUxJ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIllIIIIIlIlII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount(lllIlIlllII[0]);
            return lllIlIlllII[1];
        } else if (lIllIIIIIlIlII(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption(this.j.smeltingProduct().w());
            sleep(i());
            return lllIlIlllII[1];
        } else if (lIllIIIIIlIlIl(Movement.isRunEnabled() ? 1 : 0) && lIllIIIIIlIllI(Movement.getRunEnergy(), lllIlIlllII[2])) {
            Movement.toggleRun();
            return lllIlIlllII[0];
        } else {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIllIIIIIllIII(tileObject.getActions())) {
                    String[] strArr = new String[lllIlIlllII[1]];
                    strArr[lllIlIlllII[0]] = lllIlIllIll[lllIlIlllII[1]];
                    if (lIllIIIIIlIlII(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIlIlllII[1];
                        "".length();
                        return (((190 ^ 160) ^ (171 ^ 164)) & (((231 ^ 160) ^ (151 ^ 193)) ^ (-" ".length()))) > (((((106 + 73) - 5) + 32) ^ (((106 + 90) - 178) + 128)) & (((81 ^ 74) ^ (37 ^ 98)) ^ (-" ".length()))) ? ((185 ^ 158) ^ (251 ^ 137)) & (((113 ^ 69) ^ (72 ^ 41)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIlIlllII[0];
            });
            if (lIllIIIIIlIlll(nearest)) {
                return lllIlIlllII[0];
            }
            nearest.interact(lllIlIllIll[lllIlIlllII[0]]);
            return lllIlIlllII[1];
        }
    }

    private static void lIllIIIIIlIIll() {
        lllIlIlllII = new int[6];
        lllIlIlllII[0] = (90 ^ 83) & ((204 ^ 197) ^ (-1));
        lllIlIlllII[1] = " ".length();
        lllIlIlllII[2] = 29 ^ 86;
        lllIlIlllII[3] = (223 ^ 189) ^ (193 ^ 166);
        lllIlIlllII[4] = "  ".length();
        lllIlIlllII[5] = (207 ^ 198) ^ " ".length();
    }

    @Inject
    public P(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.SMELTING);
    }

    private static String lIllIIIIIlIIII(String llllllllllllllllIIlIIIlllllllllI, String llllllllllllllllIIlIIIllllllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIIllllllllIl.getBytes(StandardCharsets.UTF_8)), lllIlIlllII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlIlllII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIIlllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIIllllllllll) {
            llllllllllllllllIIlIIIllllllllll.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIIlIIIl(String llllllllllllllllIIlIIlIIIIIlIIll, String llllllllllllllllIIlIIlIIIIIIllIl) {
        String llllllllllllllllIIlIIlIIIIIlIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIIIIIlIIIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIIlIIIIIIllIl.toCharArray();
        int llllllllllllllllIIlIIlIIIIIIllll = lllIlIlllII[0];
        char[] charArray2 = llllllllllllllllIIlIIlIIIIIlIIll2.toCharArray();
        int length = charArray2.length;
        int i = lllIlIlllII[0];
        while (lIllIIIIIllIIl(i, length)) {
            llllllllllllllllIIlIIlIIIIIlIIIl.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlIIlIIIIIIllll % charArray.length]));
            "".length();
            llllllllllllllllIIlIIlIIIIIIllll++;
            i++;
            "".length();
            if ((((81 ^ 100) ^ (32 ^ 31)) & (((104 ^ 69) ^ (17 ^ 54)) ^ (-" ".length()))) >= ((((33 + 23) - 26) + 124) ^ (((120 + 75) - 110) + 73))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIIlIIIIIlIIIl);
    }

    private static boolean lIllIIIIIlIllI(int i, int i2) {
        return i >= i2;
    }
}
