package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
@TaskDesc(name = "Buying waterskins", priority = 20, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.O  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/O.class */
public class O extends S {
    private static /* synthetic */ int[] lllllIIIllIl;
    private static /* synthetic */ String[] lllllIIIllII;

    private static String lIIlIIlIIlllllI(String lllllllllllllllIIlIIllIIllIIIIIl, String lllllllllllllllIIlIIllIIllIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllIIIllIl[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIIllIIIIlI) {
            lllllllllllllllIIlIIllIIllIIIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected O(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }

    private static void lIIlIIlIIllllll() {
        lllllIIIllII = new String[lllllIIIllIl[6]];
        lllllIIIllII[lllllIIIllIl[0]] = lIIlIIlIIllllIl("JzkudAYEPyQ=", "eLWYv");
        lllllIIIllII[lllllIIIllIl[1]] = lIIlIIlIIlllllI("jGz+OqPPQ94=", "mGRZg");
    }

    private static boolean lIIlIIlIlIIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIlIlIIIIll(Object obj) {
        return obj == null;
    }

    private static String lIIlIIlIIllllIl(String lllllllllllllllIIlIIllIIlIllIIIl, String lllllllllllllllIIlIIllIIlIllIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIllIIlIllIIII.toCharArray();
        int lllllllllllllllIIlIIllIIlIlIllIl = lllllIIIllIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllllIIIllIl[0];
        while (lIIlIIlIlIIIlIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIIllIIlIlIllIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIIllIIlIlIllIl++;
            i++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIlIlIIIlII(int i) {
        return i != 0;
    }

    static {
        lIIlIIlIlIIIIII();
        lIIlIIlIIllllll();
    }

    private static boolean lIIlIIlIlIIIIIl(int i) {
        return i == 0;
    }

    private static void lIIlIIlIlIIIIII() {
        lllllIIIllIl = new int[7];
        lllllIIIllIl[0] = ((((142 + 80) - 147) + 116) ^ (((36 + 109) - 52) + 50)) & (((33 ^ 37) ^ (34 ^ 22)) ^ (-" ".length()));
        lllllIIIllIl[1] = " ".length();
        lllllIIIllIl[2] = (-1141) & 11774;
        lllllIIIllIl[3] = (-((-9639) & 15783)) & (-8322) & 16319;
        lllllIIIllIl[4] = (-((-8923) & 31451)) & (-8385) & 32743;
        lllllIIIllIl[5] = (-((-823) & 11191)) & (-4193) & 16383;
        lllllIIIllIl[6] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    @Override // m.e.i.q.u.r.p000.n.s.e.r.i.S
    public boolean t() {
        if (!lIIlIIlIlIIIIIl(z() ? 1 : 0) || lIIlIIlIlIIIIlI(y())) {
            return lllllIIIllIl[0];
        }
        int[] iArr = new int[lllllIIIllIl[1]];
        iArr[lllllIIIllIl[0]] = lllllIIIllIl[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (lIIlIIlIlIIIIll(nearest)) {
            return lllllIIIllIl[0];
        }
        int[] iArr2 = new int[lllllIIIllIl[1]];
        iArr2[lllllIIIllIl[0]] = lllllIIIllIl[3];
        if (lIIlIIlIlIIIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            nearest.interact(lllllIIIllII[lllllIIIllIl[0]]);
            return lllllIIIllIl[1];
        } else if (!lIIlIIlIlIIIlII(Shop.isOpen() ? 1 : 0)) {
            nearest.interact(lllllIIIllII[lllllIIIllIl[1]]);
            return lllllIIIllIl[1];
        } else {
            int[] iArr3 = new int[lllllIIIllIl[1]];
            iArr3[lllllIIIllIl[0]] = lllllIIIllIl[4];
            if (lIIlIIlIlIIIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                Shop.sellFifty(lllllIIIllIl[4]);
                return lllllIIIllIl[1];
            }
            Shop.buyFifty(lllllIIIllIl[5]);
            return lllllIIIllIl[1];
        }
    }

    private static boolean lIIlIIlIlIIIIlI(int i) {
        return i > 0;
    }
}
