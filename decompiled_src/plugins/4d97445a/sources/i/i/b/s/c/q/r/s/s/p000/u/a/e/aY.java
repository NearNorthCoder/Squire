package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.membership.SquireMembershipBuyer;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Redeeming Bond")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aY  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aY.class */
public class aY extends Task {
    private static /* synthetic */ String[] llllIlll;
    private final /* synthetic */ SquireMembershipBuyer fi;
    private static /* synthetic */ int[] lllllIII;

    private static void llIllIIIIl() {
        llllIlll = new String[lllllIII[4]];
        llllIlll[lllllIII[1]] = llIlIlllll("ES49OxU=", "RBRHp");
        llllIlll[lllllIII[0]] = llIllIIIII("Nku6SWHUYak=", "NZLSK");
    }

    private static boolean llIllIIlIl(Object obj) {
        return obj != null;
    }

    private static String llIlIlllll(String llIlIIIIlllllII, String llIlIIIIllllIll) {
        String llIlIIIIlllllII2 = new String(Base64.getDecoder().decode(llIlIIIIlllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIlIIIIllllIll.toCharArray();
        int llIlIIIIllllIII = lllllIII[1];
        char[] charArray2 = llIlIIIIlllllII2.toCharArray();
        int length = charArray2.length;
        int i2 = lllllIII[1];
        while (llIllIIllI(i2, length)) {
            char llIlIIIIlllllIl = charArray2[i2];
            sb.append((char) (llIlIIIIlllllIl ^ charArray[llIlIIIIllllIII % charArray.length]));
            "".length();
            llIlIIIIllllIII++;
            i2++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIllIIIlI() {
        lllllIII = new int[11];
        lllllIII[0] = " ".length();
        lllllIII[1] = ((69 ^ 79) ^ (40 ^ 97)) & (((101 ^ 10) ^ (75 ^ 103)) ^ (-" ".length()));
        lllllIII[2] = (-((-5262) & 7327)) & (-16423) & 31679;
        lllllIII[3] = (-19461) & 19925;
        lllllIII[4] = "  ".length();
        lllllIII[5] = 174 ^ 165;
        lllllIII[6] = (-((-835) & 29667)) & (-3075) & 32767;
        lllllIII[7] = 20 ^ 17;
        lllllIII[8] = (((42 + 27) - 42) + 108) ^ (((139 + 1) - 43) + 53);
        lllllIII[9] = (-6289) & 6577;
        lllllIII[10] = 130 ^ 138;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lllllIII[0]];
        iArr[lllllIII[1]] = lllllIII[2];
        if (llIllIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return lllllIII[1];
        }
        if (llIllIIlII(GrandExchange.isOpen() ? 1 : 0)) {
            Widgets.get(lllllIII[3], lllllIII[4]).getChild(lllllIII[5]).interact(llllIlll[lllllIII[1]]);
        }
        if (!llIllIIlIl(Widgets.get(lllllIII[6], lllllIII[0])) || !llIllIIlII(Widgets.get(lllllIII[6], lllllIII[7]).isVisible() ? 1 : 0)) {
            int[] iArr2 = new int[lllllIII[0]];
            iArr2[lllllIII[1]] = lllllIII[2];
            Inventory.getFirst(iArr2).interact(llllIlll[lllllIII[0]]);
        } else if (llIllIIlIl(Widgets.get(lllllIII[6], lllllIII[8])) && llIllIIlII(Widgets.get(lllllIII[6], lllllIII[8]).isVisible() ? 1 : 0)) {
            Widgets.get(lllllIII[6], lllllIII[8]).interact(lllllIII[1]);
            Widgets.get(lllllIII[9], lllllIII[10]).interact(lllllIII[1]);
            return lllllIII[0];
        }
        return lllllIII[0];
    }

    @Inject
    public aY(SquireMembershipBuyer squireMembershipBuyer) {
        this.fi = squireMembershipBuyer;
    }

    private static String llIllIIIII(String llIlIIIIllIIlll, String llIlIIIIllIIllI) {
        try {
            SecretKeySpec llIlIIIIllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIIllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIIllIlIIl = Cipher.getInstance("Blowfish");
            llIlIIIIllIlIIl.init(lllllIII[4], llIlIIIIllIlIlI);
            return new String(llIlIIIIllIlIIl.doFinal(Base64.getDecoder().decode(llIlIIIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIIIllIIIll) {
            llIlIIIIllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIllI(int i2, int i3) {
        return i2 < i3;
    }

    static {
        llIllIIIlI();
        llIllIIIIl();
    }

    private static boolean llIllIIIll(int i2) {
        return i2 == 0;
    }

    private static boolean llIllIIlII(int i2) {
        return i2 != 0;
    }
}
