package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Dropping Items", priority = 1)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.C  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/C.class */
public class C extends j {
    private static /* synthetic */ String[] lllIllllIIIl;
    private static /* synthetic */ int[] lllIllllIlII;

    static {
        lIIIlllIIIIIlIl();
        lIIIlllIIIIIIlI();
    }

    private static String lIIIlllIIIIIIIl(String lllllllllllllllIIlIllIllllllIlIl, String lllllllllllllllIIlIllIllllllIlII) {
        String lllllllllllllllIIlIllIllllllIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIllllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIllIllllllIIlI = lllllllllllllllIIlIllIllllllIlII.toCharArray();
        int lllllllllllllllIIlIllIllllllIIIl = lllIllllIlII[1];
        char[] charArray = lllllllllllllllIIlIllIllllllIlIl2.toCharArray();
        int length = charArray.length;
        int i = lllIllllIlII[1];
        while (lIIIlllIIIIIlll(i, length)) {
            char lllllllllllllllIIlIllIllllllIllI = charArray[i];
            sb.append((char) (lllllllllllllllIIlIllIllllllIllI ^ lllllllllllllllIIlIllIllllllIIlI[lllllllllllllllIIlIllIllllllIIIl % lllllllllllllllIIlIllIllllllIIlI.length]));
            "".length();
            lllllllllllllllIIlIllIllllllIIIl++;
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    protected boolean x() {
        int[] iArr = new int[lllIllllIlII[0]];
        iArr[lllIllllIlII[1]] = lllIllllIlII[2];
        if (lIIIlllIIIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIllllIlII[0]];
            iArr2[lllIllllIlII[1]] = lllIllllIlII[2];
            Inventory.getFirst(iArr2).interact(lllIllllIIIl[lllIllllIlII[1]]);
            return lllIllllIlII[0];
        }
        int[] iArr3 = new int[lllIllllIlII[0]];
        iArr3[lllIllllIlII[1]] = lllIllllIlII[3];
        if (lIIIlllIIIIIllI(Inventory.contains(iArr3) ? 1 : 0)) {
            if (lIIIlllIIIIIllI(z().buryBones() ? 1 : 0)) {
                int[] iArr4 = new int[lllIllllIlII[0]];
                iArr4[lllIllllIlII[1]] = lllIllllIlII[3];
                Inventory.getFirst(iArr4).interact(lllIllllIIIl[lllIllllIlII[0]]);
                "".length();
                if (" ".length() <= (-" ".length())) {
                    return ((((1 + 43) - (-44)) + 39) ^ (57 ^ 100)) & (((((159 + 8) - 46) + 49) ^ (((59 + 120) - 74) + 31)) ^ (-" ".length()));
                }
            } else {
                int[] iArr5 = new int[lllIllllIlII[0]];
                iArr5[lllIllllIlII[1]] = lllIllllIlII[3];
                Inventory.getFirst(iArr5).interact(lllIllllIIIl[lllIllllIlII[4]]);
            }
            return lllIllllIlII[0];
        }
        return lllIllllIlII[1];
    }

    private static boolean lIIIlllIIIIIllI(int i) {
        return i != 0;
    }

    private static String lIIIllIllllllll(String lllllllllllllllIIlIlllIIIIIIIlIl, String lllllllllllllllIIlIlllIIIIIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIIIIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIIIIIIIlll.init(lllIllllIlII[4], secretKeySpec);
            return new String(lllllllllllllllIIlIlllIIIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIIIIIIllI) {
            lllllllllllllllIIlIlllIIIIIIIllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public C(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.BIRDS);
    }

    private static void lIIIlllIIIIIlIl() {
        lllIllllIlII = new int[7];
        lllIllllIlII[0] = " ".length();
        lllIllllIlII[1] = ((37 ^ 115) ^ (17 ^ 120)) & (((4 ^ 88) ^ (72 ^ 43)) ^ (-" ".length()));
        lllIllllIlII[2] = (-((-10833) & 31574)) & (-1) & 30719;
        lllIllllIlII[3] = (-((-2437) & 32182)) & (-193) & 30463;
        lllIllllIlII[4] = "  ".length();
        lllIllllIlII[5] = "   ".length();
        lllIllllIlII[6] = (((130 + 170) - 298) + 203) ^ (((55 + 184) - 111) + 69);
    }

    private static void lIIIlllIIIIIIlI() {
        lllIllllIIIl = new String[lllIllllIlII[5]];
        lllIllllIIIl[lllIllllIlII[1]] = lIIIllIllllllIl("EVieGfrOzkg=", "REIZK");
        lllIllllIIIl[lllIllllIlII[0]] = lIIIllIllllllll("W6jR0WQbHBU=", "ZDZqI");
        lllIllllIIIl[lllIllllIlII[4]] = lIIIlllIIIIIIIl("Aj0CFA==", "FOmdW");
    }

    private static String lIIIllIllllllIl(String lllllllllllllllIIlIlllIIIIIlIIlI, String lllllllllllllllIIlIlllIIIIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), lllIllllIlII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllllIlII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIIIIlIIll) {
            lllllllllllllllIIlIlllIIIIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIIIIlll(int i, int i2) {
        return i < i2;
    }
}
