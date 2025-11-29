package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Using item on item", priority = 10, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bu  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bu.class */
public class C0048bu extends Task {
    private static /* synthetic */ String[] lIIlIllIl;
    private static /* synthetic */ int[] lIIlIlllI;
    private final /* synthetic */ SquireQuestHelper fX;

    private static void lIIIIlIIIlI() {
        lIIlIllIl = new String[lIIlIlllI[1]];
        lIIlIllIl[lIIlIlllI[0]] = lIIIIlIIIII("Rc99gorfzEl01/DmhFSBxFDMKf1k41+7", "rKdKR");
        lIIlIllIl[lIIlIlllI[2]] = lIIIIlIIIIl("sVuorkGwZQaDkUWshlNmdQ==", "oXUFH");
    }

    private static void lIIIIlIIIll() {
        lIIlIlllI = new int[4];
        lIIlIlllI[0] = ((35 ^ 123) ^ (71 ^ 37)) & (((62 ^ 110) ^ (31 ^ 117)) ^ (-" ".length()));
        lIIlIlllI[1] = "  ".length();
        lIIlIlllI[2] = " ".length();
        lIIlIlllI[3] = 169 ^ 161;
    }

    static {
        lIIIIlIIIll();
        lIIIIlIIIlI();
    }

    private static boolean lIIIIlIIlII(int i2) {
        return i2 == 0;
    }

    private static boolean lIIIIlIIllI(int i2) {
        return i2 != 0;
    }

    private static String lIIIIlIIIII(String llIIIllIlllIlII, String llIIIllIlllIIll) {
        try {
            SecretKeySpec llIIIllIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIllIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIllIlllIllI = Cipher.getInstance("Blowfish");
            llIIIllIlllIllI.init(lIIlIlllI[1], llIIIllIlllIlll);
            return new String(llIIIllIlllIllI.doFinal(Base64.getDecoder().decode(llIIIllIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIllIlllIlIl) {
            llIIIllIlllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIlIII(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIlIIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIlIIlIl(int i2, int i3) {
        return i2 != i3;
    }

    @Inject
    public C0048bu(SquireQuestHelper squireQuestHelper) {
        this.fX = squireQuestHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean run() {
        if (lIIIIlIIlII(this.fX.cz().equals(lIIlIllIl[lIIlIlllI[0]]) ? 1 : 0)) {
            return lIIlIlllI[0];
        }
        List<Object> cE = this.fX.cE();
        if (!lIIIIlIIlIl(cE.size(), lIIlIlllI[1]) && !lIIIIlIIllI(cE.stream().anyMatch(obj -> {
            if (lIIIIlIIlII(obj.getClass().getSimpleName().equals(lIIlIllIl[lIIlIlllI[2]]) ? 1 : 0)) {
                ?? r0 = lIIlIlllI[2];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIlllI[0];
        }) ? 1 : 0)) {
            int A = this.fX.A(lIIlIlllI[0]);
            int A2 = this.fX.A(lIIlIlllI[2]);
            int[] iArr = new int[lIIlIlllI[2]];
            iArr[lIIlIlllI[0]] = A;
            Item first = Inventory.getFirst(iArr);
            int[] iArr2 = new int[lIIlIlllI[2]];
            iArr2[lIIlIlllI[0]] = A2;
            Item first2 = Inventory.getFirst(iArr2);
            if (!lIIIIlIIlll(first) || lIIIIlIlIII(first2)) {
                return lIIlIlllI[0];
            }
            first.useOn(first2);
            return lIIlIlllI[2];
        }
        return lIIlIlllI[0];
    }

    private static String lIIIIlIIIIl(String llIIIlllIIIIIIl, String llIIIlllIIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlllIIIIIII.getBytes(StandardCharsets.UTF_8)), lIIlIlllI[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlllI[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIlllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlllIIIIIlI) {
            llIIIlllIIIIIlI.printStackTrace();
            return null;
        }
    }
}
