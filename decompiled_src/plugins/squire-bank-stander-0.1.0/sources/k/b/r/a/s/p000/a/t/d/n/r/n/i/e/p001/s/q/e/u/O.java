package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import com.google.inject.Inject;
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
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Cannon Balls")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.O  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/O.class */
public class O extends AbstractC0000a {
    private static /* synthetic */ String[] lllIIlIllII;
    private static /* synthetic */ int[] lllIIlIllIl;

    private static boolean lIlIlllIIIIllI(int i) {
        return i == 0;
    }

    static {
        lIlIlllIIIIlIl();
        lIlIlllIIIIlII();
    }

    private static String lIlIlllIIIIIlI(String llllllllllllllllIIlIlIIIIIlIIlII, String llllllllllllllllIIlIlIIIIIlIIIll) {
        String llllllllllllllllIIlIlIIIIIlIIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlIlIIIIIlIIIIl = llllllllllllllllIIlIlIIIIIlIIIll.toCharArray();
        int llllllllllllllllIIlIlIIIIIlIIIII = lllIIlIllIl[2];
        char[] charArray = llllllllllllllllIIlIlIIIIIlIIlII2.toCharArray();
        int length = charArray.length;
        int i = lllIIlIllIl[2];
        while (lIlIlllIIIlIlI(i, length)) {
            char llllllllllllllllIIlIlIIIIIlIIlIl = charArray[i];
            sb.append((char) (llllllllllllllllIIlIlIIIIIlIIlIl ^ llllllllllllllllIIlIlIIIIIlIIIIl[llllllllllllllllIIlIlIIIIIlIIIII % llllllllllllllllIIlIlIIIIIlIIIIl.length]));
            "".length();
            llllllllllllllllIIlIlIIIIIlIIIII++;
            i++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIlIllIl[4];
    }

    private static boolean lIlIlllIIIIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (!lIlIlllIIIIllI(Players.getLocal().isMoving() ? 1 : 0) || lIlIlllIIIIllI(Movement.shouldWalk() ? 1 : 0)) {
            return lllIIlIllIl[2];
        }
        if (lIlIlllIIIIlll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount(lllIIlIllIl[2]);
        }
        if (lIlIlllIIIIllI(Movement.isRunEnabled() ? 1 : 0) && lIlIlllIIIlIII(Movement.getRunEnergy(), lllIIlIllIl[3])) {
            Movement.toggleRun();
            return lllIIlIllIl[2];
        }
        String[] strArr = new String[lllIIlIllIl[1]];
        strArr[lllIIlIllIl[2]] = lllIIlIllII[lllIIlIllIl[2]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIlIlllIIIlIIl(nearest)) {
            return lllIIlIllIl[2];
        }
        if (lIlIlllIIIIlll(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            return lllIIlIllIl[1];
        }
        nearest.interact(lllIIlIllII[lllIIlIllIl[1]]);
        return lllIIlIllIl[1];
    }

    private static boolean lIlIlllIIIlIII(int i, int i2) {
        return i >= i2;
    }

    private static void lIlIlllIIIIlII() {
        lllIIlIllII = new String[lllIIlIllIl[5]];
        lllIIlIllII[lllIIlIllIl[2]] = lIlIlllIIIIIlI("MD8VGhYVLw==", "vJgtw");
        lllIIlIllII[lllIIlIllIl[1]] = lIlIlllIIIIIll("YH/yG56YVuM=", "AHIbJ");
    }

    private static void lIlIlllIIIIlIl() {
        lllIIlIllIl = new int[7];
        lllIIlIllIl[0] = (-22153) & 24505;
        lllIIlIllIl[1] = " ".length();
        lllIIlIllIl[2] = ((154 ^ 177) ^ (40 ^ 5)) & (((((11 + 43) - 11) + 96) ^ (((0 + 112) - 86) + 115)) ^ (-" ".length()));
        lllIIlIllIl[3] = (118 ^ 64) ^ (93 ^ 32);
        lllIIlIllIl[4] = (227 ^ 133) ^ (13 ^ 110);
        lllIIlIllIl[5] = "  ".length();
        lllIIlIllIl[6] = 75 ^ 67;
    }

    private static String lIlIlllIIIIIll(String llllllllllllllllIIlIlIIIIIIIllll, String llllllllllllllllIIlIlIIIIIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), lllIIlIllIl[6]), "DES");
            Cipher llllllllllllllllIIlIlIIIIIIlIIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIIIIIlIIIl.init(lllIIlIllIl[5], secretKeySpec);
            return new String(llllllllllllllllIIlIlIIIIIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIIIIIlIll) {
            llllllllllllllllIIlIlIIIIIIIlIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public O(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.CANNON_BALLS);
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(lllIIlIllIl[0]), Integer.valueOf(lllIIlIllIl[1]));
    }

    private static boolean lIlIlllIIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlllIIIlIIl(Object obj) {
        return obj == null;
    }
}
