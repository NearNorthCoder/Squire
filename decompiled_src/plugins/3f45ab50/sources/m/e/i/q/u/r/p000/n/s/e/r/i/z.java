package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Depositing in hopper", priority = 8)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.z  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/z.class */
public class z extends C {
    private static /* synthetic */ int[] lllllIllIlll;
    private static /* synthetic */ String[] lllllIllIllI;

    private static void lIIlIIllllIIIll() {
        lllllIllIlll = new int[6];
        lllllIllIlll[0] = (242 ^ 178) & ((54 ^ 118) ^ (-1));
        lllllIllIlll[1] = " ".length();
        lllllIllIlll[2] = (-5) & 12015;
        lllllIllIlll[3] = (50 ^ 5) ^ (155 ^ 168);
        lllllIllIlll[4] = "  ".length();
        lllllIllIlll[5] = (137 ^ 148) ^ (14 ^ 27);
    }

    private static void lIIlIIllllIIIlI() {
        lllllIllIllI = new String[lllllIllIlll[4]];
        lllllIllIllI[lllllIllIlll[0]] = lIIlIIllllIIIII("7VMKPR9NnwU=", "xQjzM");
        lllllIllIllI[lllllIllIlll[1]] = lIIlIIllllIIIIl("HFWDQsdytS4=", "ATMVC");
    }

    @Inject
    public z(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t) {
        super(squireMinerConfig, squireMiner, t);
    }

    private static String lIIlIIllllIIIII(String lllllllllllllllIIlIIlIIlIIIIIIII, String lllllllllllllllIIlIIlIIIllllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllIllIlll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIlIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIlIIIIIIIl) {
            lllllllllllllllIIlIIlIIlIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllllIIIIl(String lllllllllllllllIIlIIlIIIllllIIll, String lllllllllllllllIIlIIlIIIllllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIIllllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIllllIIlI.getBytes(StandardCharsets.UTF_8)), lllllIllIlll[5]), "DES");
            Cipher lllllllllllllllIIlIIlIIIllllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIIIllllIlIl.init(lllllIllIlll[4], lllllllllllllllIIlIIlIIIllllIllI);
            return new String(lllllllllllllllIIlIIlIIIllllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIIllllIlII) {
            lllllllllllllllIIlIIlIIIllllIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // m.e.i.q.u.r.p000.n.s.e.r.i.C
    public boolean t() {
        if (!lIIlIIllllIIlII(this.Z.I() ? 1 : 0) || lIIlIIllllIIlIl(this.Z.K() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        if (lIIlIIllllIIlIl(this.Z.L() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        if (lIIlIIllllIIlII(this.Z.F() ? 1 : 0)) {
            int[] iArr = new int[lllllIllIlll[1]];
            iArr[lllllIllIlll[0]] = lllllIllIlll[2];
            if (lIIlIIllllIIlII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllllIllIlll[1]];
                iArr2[lllllIllIlll[0]] = lllllIllIlll[2];
                Inventory.getFirst(iArr2).interact(lllllIllIllI[lllllIllIlll[0]]);
                return lllllIllIlll[1];
            }
        }
        TileObject x = x();
        if (lIIlIIllllIIllI(x)) {
            return lllllIllIlll[0];
        }
        x.interact(lllllIllIllI[lllllIllIlll[1]]);
        sleep(lllllIllIlll[3]);
        return lllllIllIlll[1];
    }

    private static boolean lIIlIIllllIIlII(int i) {
        return i != 0;
    }

    static {
        lIIlIIllllIIIll();
        lIIlIIllllIIIlI();
    }

    private static boolean lIIlIIllllIIllI(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIllllIIlIl(int i) {
        return i == 0;
    }
}
