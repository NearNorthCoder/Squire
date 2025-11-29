package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Plucking bird", priority = 25)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bc  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bc.class */
public class C0030bc extends Task {
    private static /* synthetic */ int[] lIlIlIlll;
    private static /* synthetic */ String[] lIlIIlIII;

    private static boolean lIIllIIIlII(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIIllIIIlII(npc.getName().equalsIgnoreCase(lIlIIlIII[lIlIlIlll[2]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIlll[2]];
                strArr[lIlIlIlll[0]] = lIlIIlIII[lIlIlIlll[1]];
                if (lIIllIIIlII(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIlll[2];
                    "".length();
                    return 0 != 0 ? ((22 ^ 41) ^ (134 ^ 167)) & (((((23 + 26) - 47) + 162) ^ (((138 + 54) - 37) + 31)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIlll[0];
        });
        if (!lIIllIIIIlI(Movement.shouldWalk() ? 1 : 0) && !lIIllIIIIll(nearest)) {
            nearest.interact(lIlIIlIII[lIlIlIlll[0]]);
            sleep(lIlIlIlll[1]);
            return lIlIlIlll[2];
        }
        return lIlIlIlll[0];
    }

    private static void lIIllIIIIII() {
        lIlIIlIII = new String[lIlIlIlll[3]];
        lIlIIlIII[lIlIlIlll[0]] = lIIlIIIIlII("QiTftIkfsqs=", "sYFLT");
        lIlIIlIII[lIlIlIlll[2]] = lIIlIlllllI("IDEhHyg6eSwbKic=", "CYNrX");
        lIlIIlIII[lIlIlIlll[1]] = lIIlIllllll("MZfA6dBTvCk=", "wjgvi");
    }

    private static String lIIlIIIIlII(String lIllllllIIIIlII, String lIllllllIIIIIll) {
        try {
            SecretKeySpec lIllllllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllllIIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIlIlll[4]), "DES");
            Cipher lIllllllIIIIllI = Cipher.getInstance("DES");
            lIllllllIIIIllI.init(lIlIlIlll[1], lIllllllIIIIlll);
            return new String(lIllllllIIIIllI.doFinal(Base64.getDecoder().decode(lIllllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllllIIIIlIl) {
            lIllllllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIIllIIIIIl() {
        lIlIlIlll = new int[5];
        lIlIlIlll[0] = (3 ^ 44) & ((56 ^ 23) ^ (-1));
        lIlIlIlll[1] = "  ".length();
        lIlIlIlll[2] = " ".length();
        lIlIlIlll[3] = "   ".length();
        lIlIlIlll[4] = (17 ^ 115) ^ (245 ^ 159);
    }

    private static boolean lIIllIIIIlI(int i2) {
        return i2 == 0;
    }

    private static boolean lIIllIIIlIl(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIIllIIIIIl();
        lIIllIIIIII();
    }

    private static boolean lIIllIIIIll(Object obj) {
        return obj == null;
    }

    private static String lIIlIlllllI(String lIlllllIlllIlII, String lIlllllIlllIIll) {
        String str = new String(Base64.getDecoder().decode(lIlllllIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlllllIlllIIll.toCharArray();
        int lIlllllIlllIIII = lIlIlIlll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIlIlll[0];
        while (lIIllIIIlIl(i2, length)) {
            sb.append((char) (charArray2[i2] ^ charArray[lIlllllIlllIIII % charArray.length]));
            "".length();
            lIlllllIlllIIII++;
            i2++;
            "".length();
            if ("  ".length() >= ((((47 + 43) - (-19)) + 78) ^ (((77 + 138) - 177) + 153))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIlIllllll(String lIlllllIlIlllll, String lIlllllIlIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllllIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllllIllIIIIl = Cipher.getInstance("Blowfish");
            lIlllllIllIIIIl.init(lIlIlIlll[1], secretKeySpec);
            return new String(lIlllllIllIIIIl.doFinal(Base64.getDecoder().decode(lIlllllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllllIllIIIII) {
            lIlllllIllIIIII.printStackTrace();
            return null;
        }
    }
}
