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
@TaskDesc(name = "Dropping items", priority = 100)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.u  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/u.class */
public class u extends x {
    private static /* synthetic */ String[] lllIllllllII;
    private static /* synthetic */ int[] lllIllllllIl;

    private static boolean lIIIlllIIlIIlll(int i) {
        return i != 0;
    }

    private static void lIIIlllIIlIIlIl() {
        lllIllllllII = new String[lllIllllllIl[3]];
        lllIllllllII[lllIllllllIl[0]] = lIIIlllIIlIIIll("0AbQqlgQ+ZQ=", "eUExB");
        lllIllllllII[lllIllllllIl[1]] = lIIIlllIIlIIlII("rzQcw/X7iUk=", "ARCbl");
        lllIllllllII[lllIllllllIl[2]] = lIIIlllIIlIIIll("YYyIc1C0ZZQ=", "CXawC");
    }

    private static String lIIIlllIIlIIIll(String lllllllllllllllIIlIllIllIIIIIIll, String lllllllllllllllIIlIllIllIIIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), lllIllllllIl[4]), "DES");
            Cipher lllllllllllllllIIlIllIllIIIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIllIIIIIlIl.init(lllIllllllIl[2], lllllllllllllllIIlIllIllIIIIIllI);
            return new String(lllllllllllllllIIlIllIllIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIllIIIIIlII) {
            lllllllllllllllIIlIllIllIIIIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    protected boolean x() {
        if (lIIIlllIIlIIlll(z().buryBones() ? 1 : 0)) {
            Inventory.interact(item -> {
                return item.getName().toLowerCase().contains(lllIllllllII[lllIllllllIl[2]]);
            }, lllIllllllII[lllIllllllIl[0]]);
            "".length();
            "".length();
            if ("   ".length() == " ".length()) {
                return ((((63 + 56) - 96) + 123) ^ (((83 + 104) - 7) + 11)) & (((((140 + 4) - (-19)) + 3) ^ (((73 + 98) - 155) + 123)) ^ (-" ".length()));
            }
        } else {
            Inventory.dropAll(item2 -> {
                return item2.getName().toLowerCase().contains(lllIllllllII[lllIllllllIl[1]]);
            });
            "".length();
        }
        Inventory.dropAll(item3 -> {
            return item3.getName().toLowerCase().contains(H().v().toLowerCase());
        });
        "".length();
        return lllIllllllIl[0];
    }

    @Inject
    public u(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig);
    }

    static {
        lIIIlllIIlIIllI();
        lIIIlllIIlIIlIl();
    }

    private static String lIIIlllIIlIIlII(String lllllllllllllllIIlIllIlIllllIllI, String lllllllllllllllIIlIllIlIllllIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIlllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIlIlllllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIlIlllllIII.init(lllIllllllIl[2], lllllllllllllllIIlIllIlIlllllIIl);
            return new String(lllllllllllllllIIlIllIlIlllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlIllllIlll) {
            lllllllllllllllIIlIllIlIllllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIIlllIIlIIllI() {
        lllIllllllIl = new int[5];
        lllIllllllIl[0] = ((109 ^ 58) ^ (4 ^ 84)) & (((((106 + 103) - 139) + 92) ^ (((16 + 99) - 80) + 130)) ^ (-" ".length()));
        lllIllllllIl[1] = " ".length();
        lllIllllllIl[2] = "  ".length();
        lllIllllllIl[3] = "   ".length();
        lllIllllllIl[4] = (((3 + 18) - (-107)) + 60) ^ (((117 + 16) - 84) + 131);
    }
}
