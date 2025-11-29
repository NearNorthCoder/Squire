package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Going back inside", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.v  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/v.class */
public class v extends s {
    private static /* synthetic */ String[] lIIlllIIIllII;
    private static /* synthetic */ int[] lIIlllIIIllIl;

    private static void lIllIIlIlIlIllI() {
        lIIlllIIIllIl = new int[5];
        lIIlllIIIllIl[0] = (((93 + 58) - 35) + 75) ^ (((65 + 25) - 67) + 163);
        lIIlllIIIllIl[1] = " ".length();
        lIIlllIIIllIl[2] = (145 ^ 171) & ((53 ^ 15) ^ (-1));
        lIIlllIIIllIl[3] = "  ".length();
        lIIlllIIIllIl[4] = 204 ^ 196;
    }

    private static String lIllIIlIlIlIlII(String llllllllllllllIlllIllIIlIIllIllI, String llllllllllllllIlllIllIIlIIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), lIIlllIIIllIl[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIIllIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIlIIllIIlI) {
            llllllllllllllIlllIllIIlIIllIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.s
    public boolean l() {
        if (lIllIIlIlIlIlll(Movement.isRunEnabled() ? 1 : 0) && lIllIIlIlIllIII(Movement.getRunEnergy(), lIIlllIIIllIl[0])) {
            Movement.toggleRun();
            return lIIlllIIIllIl[1];
        } else if (lIllIIlIlIlIlll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlllIIIllIl[2];
        } else {
            String[] strArr = new String[lIIlllIIIllIl[1]];
            strArr[lIIlllIIIllIl[2]] = lIIlllIIIllII[lIIlllIIIllIl[2]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIllIIlIlIllIIl(nearest)) {
                nearest.interact(lIIlllIIIllII[lIIlllIIIllIl[1]]);
                return lIIlllIIIllIl[1];
            }
            return lIIlllIIIllIl[2];
        }
    }

    private static boolean lIllIIlIlIllIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIlIlIlIlll(int i) {
        return i == 0;
    }

    private static boolean lIllIIlIlIllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIlIlIllIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIllIIlIlIlIlIl() {
        lIIlllIIIllII = new String[lIIlllIIIllIl[3]];
        lIIlllIIIllII[lIIlllIIIllIl[2]] = lIllIIlIlIlIIll("PR8+DAgVViAaHx0aLQMd", "qvDmz");
        lIIlllIIIllII[lIIlllIIIllIl[1]] = lIllIIlIlIlIlII("Hr6npDeNlS4=", "EbXIL");
    }

    @Inject
    public v(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static String lIllIIlIlIlIIll(String llllllllllllllIlllIllIIlIIlIIllI, String llllllllllllllIlllIllIIlIIlIIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllIIlIIlIIlIl.toCharArray();
        int llllllllllllllIlllIllIIlIIlIIIlI = lIIlllIIIllIl[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIIIllIl[2];
        while (lIllIIlIlIllIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIllIIlIIlIIIlI % charArray.length]));
            "".length();
            llllllllllllllIlllIllIIlIIlIIIlI++;
            i++;
            "".length();
            if (((131 ^ 152) ^ (13 ^ 18)) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIllIIlIlIlIllI();
        lIllIIlIlIlIlIl();
    }
}
