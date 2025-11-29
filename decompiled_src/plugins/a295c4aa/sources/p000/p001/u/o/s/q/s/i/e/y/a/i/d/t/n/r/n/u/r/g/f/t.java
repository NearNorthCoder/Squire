package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Getting commission", priority = 2147483597, blocking = true)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.t  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/t.class */
public class t extends j {
    private static /* synthetic */ int[] llIlIllllIII;
    private static /* synthetic */ String[] llIlIlllIlll;

    private static boolean lIIIIlIIIIIlIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j
    public boolean M() {
        if (lIIIIlIIIIIlIII(this.T.h() ? 1 : 0)) {
            return llIlIllllIII[0];
        }
        if (lIIIIlIIIIIlIII(Dialog.hasOption(llIlIlllIlll[llIlIllllIII[0]]) ? 1 : 0)) {
            String[] strArr = new String[llIlIllllIII[1]];
            strArr[llIlIllllIII[0]] = llIlIlllIlll[llIlIllllIII[1]];
            Dialog.chooseOption(strArr);
            "".length();
            return llIlIllllIII[1];
        }
        NPC p = this.T.p();
        if (lIIIIlIIIIIlIIl(p)) {
            return llIlIllllIII[0];
        }
        p.interact(llIlIlllIlll[llIlIllllIII[2]]);
        return llIlIllllIII[1];
    }

    private static boolean lIIIIlIIIIIlIlI(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIIlIIIIIIlll();
        lIIIIlIIIIIIllI();
    }

    private static String lIIIIlIIIIIIlIl(String lllllllllllllllIlIIIIIlIIlIlIIII, String lllllllllllllllIlIIIIIlIIlIIllll) {
        String lllllllllllllllIlIIIIIlIIlIlIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIIIlIIlIIlllI = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIIIlIIlIIllll.toCharArray();
        int lllllllllllllllIlIIIIIlIIlIIllII = llIlIllllIII[0];
        char[] charArray2 = lllllllllllllllIlIIIIIlIIlIlIIII2.toCharArray();
        int length = charArray2.length;
        int i = llIlIllllIII[0];
        while (lIIIIlIIIIIlIlI(i, length)) {
            lllllllllllllllIlIIIIIlIIlIIlllI.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIIIIlIIlIIllII % charArray.length]));
            "".length();
            lllllllllllllllIlIIIIIlIIlIIllII++;
            i++;
            "".length();
            if ((-" ".length()) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIIIlIIlIIlllI);
    }

    private static String lIIIIlIIIIIIlII(String lllllllllllllllIlIIIIIlIIIlllIll, String lllllllllllllllIlIIIIIlIIIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIIIlllIlI.getBytes(StandardCharsets.UTF_8)), llIlIllllIII[4]), "DES");
            Cipher lllllllllllllllIlIIIIIlIIIllllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIIlIIIllllIl.init(llIlIllllIII[2], lllllllllllllllIlIIIIIlIIIlllllI);
            return new String(lllllllllllllllIlIIIIIlIIIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIlIIIllllII) {
            lllllllllllllllIlIIIIIlIIIllllII.printStackTrace();
            return null;
        }
    }

    private static void lIIIIlIIIIIIllI() {
        llIlIlllIlll = new String[llIlIllllIII[3]];
        llIlIlllIlll[llIlIllllIII[0]] = lIIIIlIIIIIIIll("hLily2tL+is=", "vJkxo");
        llIlIlllIlll[llIlIllllIII[1]] = lIIIIlIIIIIIlII("cVzK9UQf48o=", "jqbUd");
        llIlIlllIlll[llIlIllllIII[2]] = lIIIIlIIIIIIlIl("CisCNDo6NwY2PQ==", "IDoYS");
    }

    private static String lIIIIlIIIIIIIll(String lllllllllllllllIlIIIIIlIIIlIlllI, String lllllllllllllllIlIIIIIlIIIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIllllIII[2], lllllllllllllllIlIIIIIlIIIllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIlIIIlIllll) {
            lllllllllllllllIlIIIIIlIIIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIIIIIlIIl(Object obj) {
        return obj == null;
    }

    @Inject
    public t(a aVar, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(aVar, squireGiantsFoundry, squireGiantsConfig);
    }

    private static void lIIIIlIIIIIIlll() {
        llIlIllllIII = new int[5];
        llIlIllllIII[0] = (1 ^ 68) & ((131 ^ 198) ^ (-1));
        llIlIllllIII[1] = " ".length();
        llIlIllllIII[2] = "  ".length();
        llIlIllllIII[3] = "   ".length();
        llIlIllllIII[4] = (74 ^ 64) ^ "  ".length();
    }
}
