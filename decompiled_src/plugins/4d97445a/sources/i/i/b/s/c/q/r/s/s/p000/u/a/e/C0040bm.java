package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Equipping Items", priority = 20, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bm  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bm.class */
public class C0040bm extends Task {
    private final /* synthetic */ SquireQuestHelper fO;
    private static /* synthetic */ int[] llllIIII;
    private static /* synthetic */ String[] lllIllll;

    private static boolean llIlIIIIlI(int i2) {
        return i2 != 0;
    }

    static {
        llIlIIIIIl();
        llIlIIIIII();
    }

    private static String llIIllllll(String llIlIIlIllIIIlI, String llIlIIlIllIIIIl) {
        try {
            SecretKeySpec llIlIIlIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIlIllIIlII = Cipher.getInstance("Blowfish");
            llIlIIlIllIIlII.init(llllIIII[3], llIlIIlIllIIlIl);
            return new String(llIlIIlIllIIlII.doFinal(Base64.getDecoder().decode(llIlIIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIlIllIIIll) {
            llIlIIlIllIIIll.printStackTrace();
            return null;
        }
    }

    private static String llIIlllllI(String llIlIIlIlllIlll, String llIlIIlIlllIllI) {
        String str = new String(Base64.getDecoder().decode(llIlIIlIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIIlIlllIlIl = new StringBuilder();
        char[] charArray = llIlIIlIlllIllI.toCharArray();
        int llIlIIlIlllIIll = llllIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llllIIII[0];
        while (llIlIIIIll(i2, length)) {
            llIlIIlIlllIlIl.append((char) (charArray2[i2] ^ charArray[llIlIIlIlllIIll % charArray.length]));
            "".length();
            llIlIIlIlllIIll++;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llIlIIlIlllIlIl);
    }

    private static boolean llIlIIIIll(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    public boolean run() {
        List<Integer> cF = this.fO.cF();
        if (llIlIIIIlI(cF.isEmpty() ? 1 : 0)) {
            return llllIIII[0];
        }
        List all = Inventory.getAll(item -> {
            return cF.contains(Integer.valueOf(item.getId()));
        });
        if (llIlIIIIlI(all.isEmpty() ? 1 : 0)) {
            return llllIIII[0];
        }
        all.forEach(item2 -> {
            String[] strArr = new String[llllIIII[2]];
            strArr[llllIIII[0]] = lllIllll[llllIIII[0]];
            strArr[llllIIII[1]] = lllIllll[llllIIII[1]];
            strArr[llllIIII[3]] = lllIllll[llllIIII[3]];
            item2.interact(strArr);
        });
        return llllIIII[1];
    }

    private static void llIlIIIIIl() {
        llllIIII = new int[4];
        llllIIII[0] = (88 ^ 18) & ((68 ^ 14) ^ (-1));
        llllIIII[1] = " ".length();
        llllIIII[2] = "   ".length();
        llllIIII[3] = "  ".length();
    }

    private static void llIlIIIIII() {
        lllIllll = new String[llllIIII[2]];
        lllIllll[llllIIII[0]] = llIIlllllI("GgIsOA==", "MgMJk");
        lllIllll[llllIIII[1]] = llIIllllll("wZxcnwSziVc=", "xPNZS");
        lllIllll[llllIIII[3]] = llIIllllll("W7W9AMKS2Ls=", "UJHwH");
    }

    @Inject
    public C0040bm(SquireQuestHelper squireQuestHelper) {
        this.fO = squireQuestHelper;
    }
}
