package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Dismantling Pitfall Trap", priority = 30, blocking = true)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.t  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/t.class */
public class t extends x {
    private static /* synthetic */ String[] lllIlllIllll;
    private static /* synthetic */ int[] lllIllllIIII;

    private static boolean lIIIllIlllllIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    protected boolean x() {
        int[] iArr = new int[lllIllllIIII[0]];
        iArr[lllIllllIIII[1]] = lllIllllIIII[2];
        if (lIIIllIlllllIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return lllIllllIIII[1];
        }
        if (lIIIllIlllllIll(a((boolean) lllIllllIIII[1]))) {
            int[] iArr2 = new int[lllIllllIIII[0]];
            iArr2[lllIllllIIII[1]] = lllIllllIIII[2];
            if (lIIIllIlllllIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                sleep(lllIllllIIII[3]);
                return lllIllllIIII[1];
            }
        }
        TileObject a = a((boolean) lllIllllIIII[0]);
        if (lIIIllIllllllII(a)) {
            return lllIllllIIII[1];
        }
        a.interact(lllIlllIllll[lllIllllIIII[1]]);
        return lllIllllIIII[0];
    }

    private static String lIIIllIllllIlll(String lllllllllllllllIIlIlllIIIIlIlIIl, String lllllllllllllllIIlIlllIIIIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIIIIlIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIIIIlIlIll.init(lllIllllIIII[4], lllllllllllllllIIlIlllIIIIlIllII);
            return new String(lllllllllllllllIIlIlllIIIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIIIlIlIlI) {
            lllllllllllllllIIlIlllIIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIlllllIIl() {
        lllIllllIIII = new int[5];
        lllIllllIIII[0] = " ".length();
        lllIllllIIII[1] = ((144 ^ 165) ^ (140 ^ 164)) & (((59 ^ 110) ^ (56 ^ 112)) ^ (-" ".length()));
        lllIllllIIII[2] = (-16409) & 17919;
        lllIllllIIII[3] = (((93 + 10) - 35) + 60) ^ (((2 + 42) - (-26)) + 62);
        lllIllllIIII[4] = "  ".length();
    }

    static {
        lIIIllIlllllIIl();
        lIIIllIlllllIII();
    }

    private static boolean lIIIllIlllllIll(Object obj) {
        return obj != null;
    }

    @Inject
    public t(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig);
    }

    private static void lIIIllIlllllIII() {
        lllIlllIllll = new String[lllIllllIIII[0]];
        lllIlllIllll[lllIllllIIII[1]] = lIIIllIllllIlll("j/JRw2cy/c3+MBjMG2BkbA==", "WdbsX");
    }

    private static boolean lIIIllIllllllII(Object obj) {
        return obj == null;
    }
}
