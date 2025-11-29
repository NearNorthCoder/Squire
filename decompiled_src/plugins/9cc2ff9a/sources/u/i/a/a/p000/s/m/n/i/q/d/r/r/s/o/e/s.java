package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 8)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.s  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/s.class */
public class s extends Task {
    private static /* synthetic */ int[] lIIlIIlllllII;
    private static /* synthetic */ String[] lIIlIIllllIll;
    private final /* synthetic */ C0000a ad;
    private final /* synthetic */ SquireSaraConfig ae;
    private final /* synthetic */ l ac;
    private final /* synthetic */ C0006g ab;

    private static boolean lIlIlIlIllIIllI(int i) {
        return i == 0;
    }

    private static boolean lIlIlIlIllIIlll(int i) {
        return i != 0;
    }

    @Inject
    public s(C0006g c0006g, l lVar, C0000a c0000a, SquireSaraConfig squireSaraConfig) {
        this.ab = c0006g;
        this.ac = lVar;
        this.ad = c0000a;
        this.ae = squireSaraConfig;
    }

    private static String lIlIlIlIllIIIlI(String llllllllllllllIlllllIIlIIlIIlIlI, String llllllllllllllIlllllIIlIIlIIlIIl) {
        String llllllllllllllIlllllIIlIIlIIlIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIlIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllIIlIIlIIlIII = new StringBuilder();
        char[] llllllllllllllIlllllIIlIIlIIIlll = llllllllllllllIlllllIIlIIlIIlIIl.toCharArray();
        int llllllllllllllIlllllIIlIIlIIIllI = lIIlIIlllllII[0];
        char[] charArray = llllllllllllllIlllllIIlIIlIIlIlI2.toCharArray();
        int length = charArray.length;
        int i = lIIlIIlllllII[0];
        while (lIlIlIlIllIlIll(i, length)) {
            llllllllllllllIlllllIIlIIlIIlIII.append((char) (charArray[i] ^ llllllllllllllIlllllIIlIIlIIIlll[llllllllllllllIlllllIIlIIlIIIllI % llllllllllllllIlllllIIlIIlIIIlll.length]));
            "".length();
            llllllllllllllIlllllIIlIIlIIIllI++;
            i++;
            "".length();
            if ((-((((76 + 114) - 164) + 148) ^ (((134 + 22) - 14) + 28))) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllllIIlIIlIIlIII);
    }

    private static void lIlIlIlIllIIlII() {
        lIIlIIllllIll = new String[lIIlIIlllllII[4]];
        lIIlIIllllIll[lIIlIIlllllII[0]] = lIlIlIlIllIIIIl("rB7Qg2uFdjk=", "HFClW");
        lIIlIIllllIll[lIIlIIlllllII[1]] = lIlIlIlIllIIIlI("CAwg", "MmTnJ");
        lIIlIIllllIll[lIIlIIlllllII[2]] = lIlIlIlIllIIIlI("KTcJLQY=", "yRhNn");
        lIIlIIllllIll[lIIlIIlllllII[3]] = lIlIlIlIllIIIll("OZ/EqexQ80k=", "HOhrg");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    public boolean run() {
        if (lIlIlIlIllIIllI(this.ab.m() ? 1 : 0)) {
            return lIIlIIlllllII[0];
        }
        if (lIlIlIlIllIIlll(this.ab.l() ? 1 : 0) && lIlIlIlIllIlIII(this.ac.M())) {
            return lIIlIIlllllII[0];
        }
        if (!lIlIlIlIllIlIIl(Combat.getCurrentHealth(), this.ae.eatFoodAt()) || lIlIlIlIllIIllI(this.ad.d() ? 1 : 0)) {
            return lIIlIIlllllII[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (lIlIlIlIllIIllI(item.getName().equals(lIIlIIllllIll[lIIlIIlllllII[2]]) ? 1 : 0)) {
                String str = lIIlIIllllIll[lIIlIIlllllII[3]];
                if (lIlIlIlIllIIlll(item.hasAction((v1) -> {
                    return r1.equals(v1);
                }) ? 1 : 0)) {
                    ?? r0 = lIIlIIlllllII[1];
                    "".length();
                    return "   ".length() < 0 ? ((((9 + 128) - 8) + 2) ^ (((90 + 32) - 9) + 75)) & (((107 ^ 78) ^ (127 ^ 101)) ^ (-" ".length())) : r0;
                }
            }
            return lIIlIIlllllII[0];
        });
        if (lIlIlIlIllIlIlI(first)) {
            String[] strArr = new String[lIIlIIlllllII[1]];
            strArr[lIIlIIlllllII[0]] = lIIlIIllllIll[lIIlIIlllllII[0]];
            first = Inventory.getFirst(strArr);
        }
        if (lIlIlIlIllIlIlI(first)) {
            return U();
        }
        first.interact(lIIlIIllllIll[lIIlIIlllllII[1]]);
        this.ad.c();
        return lIIlIIlllllII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    private boolean U() {
        return lIIlIIlllllII[0];
    }

    private static String lIlIlIlIllIIIIl(String llllllllllllllIlllllIIlIIIlIlIII, String llllllllllllllIlllllIIlIIIlIIlll) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIlllllII[2], llllllllllllllIlllllIIlIIIlIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIlIIIlIlIIl) {
            llllllllllllllIlllllIIlIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlIllIlIll(int i, int i2) {
        return i < i2;
    }

    static {
        lIlIlIlIllIIlIl();
        lIlIlIlIllIIlII();
    }

    private static void lIlIlIlIllIIlIl() {
        lIIlIIlllllII = new int[6];
        lIIlIIlllllII[0] = (11 ^ 34) & ((66 ^ 107) ^ (-1));
        lIIlIIlllllII[1] = " ".length();
        lIIlIIlllllII[2] = "  ".length();
        lIIlIIlllllII[3] = "   ".length();
        lIIlIIlllllII[4] = 120 ^ 124;
        lIIlIIlllllII[5] = (145 ^ 137) ^ (79 ^ 95);
    }

    private static boolean lIlIlIlIllIlIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIlIllIlIIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIlIlIllIIIll(String llllllllllllllIlllllIIlIIIllIlIl, String llllllllllllllIlllllIIlIIIllIlII) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlIIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlIIIllIlII.getBytes(StandardCharsets.UTF_8)), lIIlIIlllllII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIlllllII[2], llllllllllllllIlllllIIlIIIlllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIlIIIllIllI) {
            llllllllllllllIlllllIIlIIIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlIllIlIII(Object obj) {
        return obj != null;
    }
}
