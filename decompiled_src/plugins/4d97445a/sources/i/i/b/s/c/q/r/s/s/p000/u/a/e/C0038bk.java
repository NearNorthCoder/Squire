package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Performing detailed step")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bk  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bk.class */
public class C0038bk extends Task {
    private static /* synthetic */ String[] llIIlIll;
    private static /* synthetic */ int[] llIIllII;
    private final /* synthetic */ SquireQuestHelper fN;

    private static boolean lIllIlIlII(int i2) {
        return i2 == 0;
    }

    private static void lIllIIllII() {
        llIIlIll = new String[llIIllII[7]];
        llIIlIll[llIIllII[0]] = lIllIIlIII("vHI8jN6EJHiPZDSFYR+8xzImQWILku4S", "UKxgd");
        llIIlIll[llIIllII[2]] = lIllIIlIII("8iZuzyEbym1wcWYb26I42EgluCYmA2R9", "ahsbA");
        llIIlIll[llIIllII[3]] = lIllIIlIIl("L+Ktpi25yQ0=", "ZYyFL");
        llIIlIll[llIIllII[4]] = lIllIIlIlI("IzYbCQ==", "qSzmC");
        llIIlIll[llIIllII[5]] = lIllIIlIIl("Ot/EmBFf608=", "jZVTo");
        llIIlIll[llIIllII[6]] = lIllIIlIlI("Cww0KA==", "YiULY");
    }

    static {
        lIllIlIIll();
        lIllIIllII();
    }

    private static boolean lIllIllIII(Object obj) {
        return obj != null;
    }

    private static String lIllIIlIlI(String llIllIIllIllllI, String llIllIIllIlllIl) {
        String str = new String(Base64.getDecoder().decode(llIllIIllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIIllIlllII = new StringBuilder();
        char[] llIllIIllIllIll = llIllIIllIlllIl.toCharArray();
        int llIllIIllIllIlI = llIIllII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = llIIllII[0];
        while (lIllIllIll(i2, length)) {
            char llIllIIllIlIIIl = charArray[i2];
            llIllIIllIlllII.append((char) (llIllIIllIlIIIl ^ llIllIIllIllIll[llIllIIllIllIlI % llIllIIllIllIll.length]));
            "".length();
            llIllIIllIllIlI++;
            i2++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llIllIIllIlllII);
    }

    private static String lIllIIlIII(String llIllIIlllllIll, String llIllIIlllllIlI) {
        try {
            SecretKeySpec llIllIIlllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIlllllIlI.getBytes(StandardCharsets.UTF_8)), llIIllII[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllII[3], llIllIIlllllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIIllllllII) {
            llIllIIllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIl(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    public boolean run() {
        if (lIllIlIlII(this.fN.cz().equals(llIIlIll[llIIllII[0]]) ? 1 : 0)) {
            return llIIllII[0];
        }
        int cJ = this.fN.cJ();
        if (lIllIlIllI(cJ, llIIllII[1])) {
            int[] iArr = new int[llIIllII[2]];
            iArr[llIIllII[0]] = cJ;
            Item first = Inventory.getFirst(iArr);
            if (lIllIllIII(first)) {
                Log.info(llIIlIll[llIIllII[2]]);
                String[] strArr = new String[llIIllII[3]];
                strArr[llIIllII[0]] = llIIlIll[llIIllII[3]];
                strArr[llIIllII[2]] = llIIlIll[llIIllII[4]];
                if (lIllIllIIl(first.hasAction(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIIllII[3]];
                    strArr2[llIIllII[0]] = llIIlIll[llIIllII[5]];
                    strArr2[llIIllII[2]] = llIIlIll[llIIllII[6]];
                    first.interact(strArr2);
                    "".length();
                    if ((-"   ".length()) > 0) {
                        return ((112 ^ 77) ^ (107 ^ 5)) & (((((46 + 31) - 28) + 78) ^ (78 ^ 98)) ^ (-" ".length()));
                    }
                } else {
                    first.interact(llIIllII[0]);
                }
                sleep(llIIllII[5]);
                return llIIllII[2];
            }
        }
        return llIIllII[0];
    }

    private static void lIllIlIIll() {
        llIIllII = new int[9];
        llIIllII[0] = ((113 ^ 38) ^ (197 ^ 159)) & (((172 ^ 199) ^ (76 ^ 42)) ^ (-" ".length()));
        llIIllII[1] = -" ".length();
        llIIllII[2] = " ".length();
        llIIllII[3] = "  ".length();
        llIIllII[4] = "   ".length();
        llIIllII[5] = 72 ^ 76;
        llIIllII[6] = 179 ^ 182;
        llIIllII[7] = 143 ^ 137;
        llIIllII[8] = (12 ^ 106) ^ (63 ^ 81);
    }

    private static boolean lIllIllIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIllIlIllI(int i2, int i3) {
        return i2 != i3;
    }

    @Inject
    public C0038bk(SquireQuestHelper squireQuestHelper) {
        this.fN = squireQuestHelper;
    }

    private static String lIllIIlIIl(String llIllIIlllIlllI, String llIllIIlllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIlllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllIIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIIlllIllll) {
            llIllIIlllIllll.printStackTrace();
            return null;
        }
    }
}
