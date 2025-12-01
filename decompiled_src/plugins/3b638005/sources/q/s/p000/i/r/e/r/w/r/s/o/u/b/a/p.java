package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Exiting crypt", priority = 150, blocking = true)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.p  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/p.class */
public class p extends Task {
    private static /* synthetic */ String[] llllIlIlIll;
    private static /* synthetic */ int[] llllIlIllII;
    private final /* synthetic */ SquireBarrows W;

    private static void lIllIlIlllIIII() {
        llllIlIllII = new int[4];
        llllIlIllII[0] = (46 ^ 114) & ((69 ^ 25) ^ (-1));
        llllIlIllII[1] = (202 ^ 151) ^ (84 ^ 12);
        llllIlIllII[2] = " ".length();
        llllIlIllII[3] = "  ".length();
    }

    private static String lIllIlIllIllIl(String llllllllllllllllIIIllIIlIlllIlIl, String llllllllllllllllIIIllIIlIlllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIlIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIlIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIIlIlllIllI) {
            llllllllllllllllIIIllIIlIlllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIlllIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIlIlllIllI(int i) {
        return i != 0;
    }

    static {
        lIllIlIlllIIII();
        lIllIlIllIllll();
    }

    private static boolean lIllIlIlllIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIlIlllIlIl(int i, int i2) {
        return i < i2;
    }

    private static void lIllIlIllIllll() {
        llllIlIlIll = new String[llllIlIllII[3]];
        llllIlIlIll[llllIlIllII[0]] = lIllIlIllIllIl("7e4NSRFm/8GbBmrz1MaC3A==", "ckvjG");
        llllIlIlIll[llllIlIllII[2]] = lIllIlIllIlllI("NR06CjJbBCM=", "vqSgP");
    }

    @Inject
    public p(SquireBarrows squireBarrows) {
        this.W = squireBarrows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    public boolean run() {
        if (lIllIlIlllIIIl(this.W.h() ? 1 : 0)) {
            return llllIlIllII[0];
        }
        if (lIllIlIlllIIIl(this.W.a(this.W.s()) ? 1 : 0) && lIllIlIlllIIlI(this.W.r())) {
            return llllIlIllII[0];
        }
        if (lIllIlIlllIIIl(this.W.a(this.W.s()) ? 1 : 0) && lIllIlIlllIIll(this.W.r(), this.W.s())) {
            return llllIlIllII[0];
        }
        if (lIllIlIlllIlII(this.W.r(), this.W.s())) {
            int llllllllllllllllIIIllIIllIIIIIIl = llllIlIllII[0];
            d[] values = d.values();
            int length = values.length;
            int i = llllIlIllII[0];
            while (lIllIlIlllIlIl(i, length)) {
                if (lIllIlIlllIllI(this.W.a(values[i]) ? 1 : 0)) {
                    llllllllllllllllIIIllIIllIIIIIIl++;
                }
                i++;
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            if (lIllIlIlllIlll(llllllllllllllllIIIllIIllIIIIIIl, llllIlIllII[1])) {
                return llllIlIllII[0];
            }
        }
        String[] strArr = new String[llllIlIllII[2]];
        strArr[llllIlIllII[0]] = llllIlIlIll[llllIlIllII[0]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIllIlIlllIIlI(nearest)) {
            return llllIlIllII[0];
        }
        nearest.interact(llllIlIlIll[llllIlIllII[2]]);
        return llllIlIllII[2];
    }

    private static boolean lIllIlIlllIIIl(int i) {
        return i == 0;
    }

    private static boolean lIllIlIlllIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIllIlIllIlllI(String llllllllllllllllIIIllIIlIllIIlIl, String llllllllllllllllIIIllIIlIllIIlII) {
        String llllllllllllllllIIIllIIlIllIIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIIllIIlIllIIIlI = llllllllllllllllIIIllIIlIllIIlII.toCharArray();
        int llllllllllllllllIIIllIIlIllIIIIl = llllIlIllII[0];
        char[] charArray = llllllllllllllllIIIllIIlIllIIlIl2.toCharArray();
        int length = charArray.length;
        int i = llllIlIllII[0];
        while (lIllIlIlllIlIl(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllIIIllIIlIllIIIlI[llllllllllllllllIIIllIIlIllIIIIl % llllllllllllllllIIIllIIlIllIIIlI.length]));
            "".length();
            llllllllllllllllIIIllIIlIllIIIIl++;
            i++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIlIlllIIlI(Object obj) {
        return obj == null;
    }
}
