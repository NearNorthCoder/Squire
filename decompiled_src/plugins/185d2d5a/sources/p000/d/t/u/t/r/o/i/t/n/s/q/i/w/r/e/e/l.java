package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Eating", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.l  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/l.class */
public class l extends Task {
    private final /* synthetic */ b Q;
    private final /* synthetic */ SquireWintertodtConfig R;
    private static /* synthetic */ String[] lIlIllllllIlI;
    private static /* synthetic */ int[] lIlIlllllllII;

    private static boolean llIIIIlllIIIllI(int i) {
        return i == 0;
    }

    private static String llIIIIlllIIIIII(String llllllllllllllIllIIlllIIIIIllIIl, String llllllllllllllIllIIlllIIIIIllIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIlllIIIIIlIllI = llllllllllllllIllIIlllIIIIIllIII.toCharArray();
        int llllllllllllllIllIIlllIIIIIlIlIl = lIlIlllllllII[0];
        char[] charArray = str.toCharArray();
        int llllllllllllllIllIIlllIIIIIIlllI = charArray.length;
        int i = lIlIlllllllII[0];
        while (llIIIIlllIIlIlI(i, llllllllllllllIllIIlllIIIIIIlllI)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIIlllIIIIIlIllI[llllllllllllllIllIIlllIIIIIlIlIl % llllllllllllllIllIIlllIIIIIlIllI.length]));
            "".length();
            llllllllllllllIllIIlllIIIIIlIlIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIIIlllIIlIII(int i) {
        return i != 0;
    }

    @Inject
    public l(b bVar, SquireWintertodtConfig squireWintertodtConfig) {
        this.Q = bVar;
        this.R = squireWintertodtConfig;
    }

    private static boolean llIIIIlllIIIlll(Object obj) {
        return obj == null;
    }

    static {
        llIIIIlllIIIlIl();
        llIIIIlllIIIIlI();
    }

    private static String llIIIIlllIIIIIl(String llllllllllllllIllIIlllIIIIlIlIIl, String llllllllllllllIllIIlllIIIIlIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIIlllIIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIIIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlllllllII[3], llllllllllllllIllIIlllIIIIlIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllIIIIlIlIlI) {
            llllllllllllllIllIIlllIIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlllIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIlllIIlIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIIlllIIIllI(this.Q.j() ? 1 : 0) || llIIIIlllIIIllI(this.Q.i() ? 1 : 0)) {
            return lIlIlllllllII[0];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIlIlllllllII[2]];
            strArr[lIlIlllllllII[0]] = lIlIllllllIlI[lIlIlllllllII[3]];
            if (llIIIIlllIIIllI(item.hasAction(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIlIlllllllII[2]];
                strArr2[lIlIlllllllII[0]] = lIlIllllllIlI[lIlIlllllllII[4]];
                if (!llIIIIlllIIlIII(item.hasAction(strArr2) ? 1 : 0)) {
                    return lIlIlllllllII[0];
                }
            }
            ?? r0 = lIlIlllllllII[2];
            "".length();
            return (-"   ".length()) >= 0 ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
        });
        if ((!llIIIIlllIIIlll(first) || !llIIIIlllIIlIII(this.Q.d() ? 1 : 0)) && !llIIIIlllIIlIIl(this.Q.h(), lIlIlllllllII[1])) {
            if (llIIIIlllIIIlll(first)) {
                Movement.walk(this.Q.e());
                return lIlIlllllllII[2];
            }
            first.interact(str -> {
                if (!llIIIIlllIIIllI(lIlIllllllIlI[lIlIlllllllII[0]].equalsIgnoreCase(str) ? 1 : 0) || llIIIIlllIIlIII(lIlIllllllIlI[lIlIlllllllII[2]].equalsIgnoreCase(str) ? 1 : 0)) {
                    ?? r0 = lIlIlllllllII[2];
                    "".length();
                    return (((12 ^ 112) ^ (112 ^ 3)) & (((((30 + 58) - 53) + 171) ^ (((103 + 72) - 173) + 191)) ^ (-" ".length()))) != 0 ? ((((50 + 107) - 153) + 174) ^ (((7 + 68) - 10) + 63)) & (((252 ^ 162) ^ (11 ^ 103)) ^ (-" ".length())) : r0;
                }
                return lIlIlllllllII[0];
            });
            sleep(lIlIlllllllII[2]);
            return lIlIlllllllII[2];
        }
        return lIlIlllllllII[0];
    }

    private static void llIIIIlllIIIIlI() {
        lIlIllllllIlI = new String[lIlIlllllllII[5]];
        lIlIllllllIlI[lIlIlllllllII[0]] = llIIIIlllIIIIII("JBgM", "ayxgt");
        lIlIllllllIlI[lIlIlllllllII[2]] = llIIIIlllIIIIIl("wNeR8+A+dCg=", "WNsea");
        lIlIllllllIlI[lIlIlllllllII[3]] = llIIIIlllIIIIIl("xXmLs/zZRXE=", "RxGqT");
        lIlIllllllIlI[lIlIlllllllII[4]] = llIIIIlllIIIIII("LT8hNDM=", "iMHZX");
    }

    private static void llIIIIlllIIIlIl() {
        lIlIlllllllII = new int[6];
        lIlIlllllllII[0] = (170 ^ 133) & ((114 ^ 93) ^ (-1));
        lIlIlllllllII[1] = (((133 + 182) - 252) + 189) ^ (((60 + 29) - (-32)) + 68);
        lIlIlllllllII[2] = " ".length();
        lIlIlllllllII[3] = "  ".length();
        lIlIlllllllII[4] = "   ".length();
        lIlIlllllllII[5] = (107 ^ 85) ^ (77 ^ 119);
    }
}
