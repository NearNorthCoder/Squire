package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
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
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Eating food", priority = 20)
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.O  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/O.class */
public class O extends Task {
    private final /* synthetic */ SquireSepulchre ak;
    private final /* synthetic */ SquireSepulchreConfig al;
    private static /* synthetic */ String[] lllIIlIIlllI;
    private static /* synthetic */ int[] lllIIlIIllll;

    private static boolean lIIIlIlIIIIIlll(int i, int i2) {
        return i > i2;
    }

    static {
        lIIIlIlIIIIIlII();
        lIIIlIlIIIIIIll();
    }

    private static void lIIIlIlIIIIIlII() {
        lllIIlIIllll = new int[8];
        lllIIlIIllll[0] = ((((22 + 22) - 3) + 205) ^ (((39 + 85) - 99) + 157)) & (((((71 + 105) - 126) + 84) ^ (((194 + 88) - 191) + 107)) ^ (-" ".length()));
        lllIIlIIllll[1] = " ".length();
        lllIIlIIllll[2] = "   ".length();
        lllIIlIIllll[3] = "  ".length();
        lllIIlIIllll[4] = 104 ^ 108;
        lllIIlIIllll[5] = 92 ^ 89;
        lllIIlIIllll[6] = (61 ^ 9) ^ (38 ^ 20);
        lllIIlIIllll[7] = (88 ^ 58) ^ (98 ^ 8);
    }

    private static String lIIIlIlIIIIIIII(String lllllllllllllllIIllIlIlIllllIlIl, String lllllllllllllllIIllIlIlIllllIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIlIlIllllIIlI = lllllllllllllllIIllIlIlIllllIlII.toCharArray();
        int lllllllllllllllIIllIlIlIllllIIIl = lllIIlIIllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIlIIllll[0];
        while (lIIIlIlIIIIlIII(i, length)) {
            char lllllllllllllllIIllIlIlIllllIllI = charArray[i];
            sb.append((char) (lllllllllllllllIIllIlIlIllllIllI ^ lllllllllllllllIIllIlIlIllllIIlI[lllllllllllllllIIllIlIlIllllIIIl % lllllllllllllllIIllIlIlIllllIIlI.length]));
            "".length();
            lllllllllllllllIIllIlIlIllllIIIl++;
            i++;
            "".length();
            if ("   ".length() >= ((112 ^ 9) ^ (227 ^ 158))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIIlIlIIIIIIlI(String lllllllllllllllIIllIlIlIlllIIIII, String lllllllllllllllIIllIlIlIllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIllIlllll.getBytes(StandardCharsets.UTF_8)), lllIIlIIllll[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlIIllll[3], lllllllllllllllIIllIlIlIlllIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIlIlllIIIIl) {
            lllllllllllllllIIllIlIlIlllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIIIIIlIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    public boolean run() {
        if (lIIIlIlIIIIIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lllIIlIIllll[0];
        }
        String[] strArr = new String[lllIIlIIllll[1]];
        strArr[lllIIlIIllll[0]] = lllIIlIIlllI[lllIIlIIllll[0]];
        if (lIIIlIlIIIIIllI(Inventory.contains(strArr) ? 1 : 0)) {
            Inventory.getFirst(item -> {
                String[] strArr2 = new String[lllIIlIIllll[1]];
                strArr2[lllIIlIIllll[0]] = lllIIlIIlllI[lllIIlIIllll[4]];
                if (lIIIlIlIIIIIllI(item.hasAction(strArr2) ? 1 : 0) && lIIIlIlIIIIIllI(item.getName().equals(lllIIlIIlllI[lllIIlIIllll[5]]) ? 1 : 0)) {
                    ?? r0 = lllIIlIIllll[1];
                    "".length();
                    return " ".length() < 0 ? ((((98 + 56) - 85) + 163) ^ (((126 + 31) - 0) + 20)) & (((((98 + 214) - 158) + 96) ^ (((12 + 159) - 157) + 149)) ^ (-" ".length())) : r0;
                }
                return lllIIlIIllll[0];
            }).interact(lllIIlIIlllI[lllIIlIIllll[1]]);
            sleep(lllIIlIIllll[2]);
            return lllIIlIIllll[1];
        } else if (lIIIlIlIIIIIlll(Combat.getCurrentHealth(), this.al.hpToEatAt())) {
            return lllIIlIIllll[0];
        } else {
            Inventory.getFirst(item2 -> {
                String[] strArr2 = new String[lllIIlIIllll[1]];
                strArr2[lllIIlIIllll[0]] = lllIIlIIlllI[lllIIlIIllll[2]];
                return item2.hasAction(strArr2);
            }).interact(lllIIlIIlllI[lllIIlIIllll[3]]);
            sleep(lllIIlIIllll[2]);
            return lllIIlIIllll[1];
        }
    }

    private static String lIIIlIlIIIIIIIl(String lllllllllllllllIIllIlIllIIIIIlIl, String lllllllllllllllIIllIlIllIIIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIllIIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIlIIllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIllIIIIIllI) {
            lllllllllllllllIIllIlIllIIIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIIIIlIII(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIlIIIIIIll() {
        lllIIlIIlllI = new String[lllIIlIIllll[6]];
        lllIIlIIlllI[lllIIlIIllll[0]] = lIIIlIlIIIIIIII("PAM6LCQYHzw=", "qlTGB");
        lllIIlIIlllI[lllIIlIIllll[1]] = lIIIlIlIIIIIIIl("V5Z2YlJkvLo=", "YvwFk");
        lllIIlIIlllI[lllIIlIIllll[3]] = lIIIlIlIIIIIIIl("jNgx6cJM3q0=", "lDwjn");
        lllIIlIIlllI[lllIIlIIllll[2]] = lIIIlIlIIIIIIII("KjgY", "oYlLm");
        lllIIlIIlllI[lllIIlIIllll[4]] = lIIIlIlIIIIIIlI("PbVunEWy5vg=", "lnMbq");
        lllIIlIIlllI[lllIIlIIllll[5]] = lIIIlIlIIIIIIIl("Bwca+D/g/DdTDCTw6B6amg==", "CNMxw");
    }

    @Inject
    public O(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.ak = squireSepulchre;
        this.al = squireSepulchreConfig;
    }

    private static boolean lIIIlIlIIIIIllI(int i) {
        return i != 0;
    }
}
