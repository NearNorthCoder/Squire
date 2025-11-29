package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Stamina handler", priority = 2137483647)
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.T  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/T.class */
public class T extends Task {
    private final /* synthetic */ SquireSepulchre aA;
    private final /* synthetic */ SquireSepulchreConfig aB;
    private static /* synthetic */ int[] lllIIIlIIlII;
    private static /* synthetic */ String[] lllIIIlIIIll;

    private static String lIIIlIIIllllIlI(String lllllllllllllllIIllIlllllIIllIIl, String lllllllllllllllIIllIlllllIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlllllIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllllIIllIII.getBytes(StandardCharsets.UTF_8)), lllIIIlIIlII[6]), "DES");
            Cipher lllllllllllllllIIllIlllllIIllIll = Cipher.getInstance("DES");
            lllllllllllllllIIllIlllllIIllIll.init(lllIIIlIIlII[4], lllllllllllllllIIllIlllllIIlllII);
            return new String(lllllllllllllllIIllIlllllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlllllIIllIlI) {
            lllllllllllllllIIllIlllllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIlllllII(String lllllllllllllllIIllIlllllIlIlllI, String lllllllllllllllIIllIlllllIlIllIl) {
        String lllllllllllllllIIllIlllllIlIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllllIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIlllllIlIlIll = lllllllllllllllIIllIlllllIlIllIl.toCharArray();
        int lllllllllllllllIIllIlllllIlIlIlI = lllIIIlIIlII[0];
        char[] charArray = lllllllllllllllIIllIlllllIlIlllI2.toCharArray();
        int lllllllllllllllIIllIlllllIlIIIll = charArray.length;
        int i = lllIIIlIIlII[0];
        while (lIIIlIIlIIIIIlI(i, lllllllllllllllIIllIlllllIlIIIll)) {
            char lllllllllllllllIIllIlllllIlIllll = charArray[i];
            sb.append((char) (lllllllllllllllIIllIlllllIlIllll ^ lllllllllllllllIIllIlllllIlIlIll[lllllllllllllllIIllIlllllIlIlIlI % lllllllllllllllIIllIlllllIlIlIll.length]));
            "".length();
            lllllllllllllllIIllIlllllIlIlIlI++;
            i++;
            "".length();
            if ((((224 ^ 177) ^ (155 ^ 198)) & (((126 ^ 104) ^ (150 ^ 140)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIlIIlIIIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIlIIIlllllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlIIlIIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIIIlllllIl() {
        lllIIIlIIIll = new String[lllIIIlIIlII[5]];
        lllIIIlIIIll[lllIIIlIIlII[0]] = lIIIlIIIllllIlI("JyC9uKcJKiw=", "PbgPe");
        lllIIIlIIIll[lllIIIlIIlII[3]] = lIIIlIIIllllIll("t/LucUMVZ3U=", "ksWdk");
        lllIIIlIIIll[lllIIIlIIlII[4]] = lIIIlIIIlllllII("PDcJASABIg==", "oChlI");
    }

    private static void lIIIlIIIllllllI() {
        lllIIIlIIlII = new int[7];
        lllIIIlIIlII[0] = ((75 ^ 127) ^ (206 ^ 155)) & (((((96 + 239) - 325) + 235) ^ (((124 + 76) - 82) + 30)) ^ (-" ".length()));
        lllIIIlIIlII[1] = 143 ^ 145;
        lllIIIlIIlII[2] = 55 ^ 61;
        lllIIIlIIlII[3] = " ".length();
        lllIIIlIIlII[4] = "  ".length();
        lllIIIlIIlII[5] = "   ".length();
        lllIIIlIIlII[6] = "   ".length() ^ (180 ^ 191);
    }

    private static boolean lIIIlIIlIIIIIII(int i, int i2) {
        return i >= i2;
    }

    @Inject
    T(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.aA = squireSepulchre;
        this.aB = squireSepulchreConfig;
    }

    static {
        lIIIlIIIllllllI();
        lIIIlIIIlllllIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(lllIIIlIIIll[lllIIIlIIlII[4]]);
        });
        if (!lIIIlIIIlllllll(first) && !lIIIlIIlIIIIIII(Movement.getRunEnergy(), lllIIIlIIlII[1])) {
            if (!lIIIlIIlIIIIIIl(Movement.isStaminaBoosted() ? 1 : 0)) {
                first.interact(lllIIIlIIIll[lllIIIlIIlII[3]]);
                return lllIIIlIIlII[3];
            } else if (lIIIlIIlIIIIIlI(Movement.getRunEnergy(), lllIIIlIIlII[2])) {
                first.interact(lllIIIlIIIll[lllIIIlIIlII[0]]);
                return lllIIIlIIlII[3];
            } else {
                return lllIIIlIIlII[0];
            }
        }
        return lllIIIlIIlII[0];
    }

    private static String lIIIlIIIllllIll(String lllllllllllllllIIllIlllllIIIllII, String lllllllllllllllIIllIlllllIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlllllIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIlIIlII[4], lllllllllllllllIIllIlllllIIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlllllIIIllIl) {
            lllllllllllllllIIllIlllllIIIllIl.printStackTrace();
            return null;
        }
    }
}
