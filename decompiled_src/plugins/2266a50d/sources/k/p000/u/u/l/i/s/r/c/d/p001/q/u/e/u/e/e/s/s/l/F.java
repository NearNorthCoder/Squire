package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Destroying Spare Ingredients", priority = 250)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.F  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/F.class */
public class F extends Task {
    final /* synthetic */ C0000a bk;
    private static /* synthetic */ int[] lIllIlIllIIl;
    private static /* synthetic */ String[] lIllIlIllIII;
    final /* synthetic */ SquireDukeSucellus bj;

    @Inject
    public F(SquireDukeSucellus squireDukeSucellus) {
        this.bj = squireDukeSucellus;
        this.bk = squireDukeSucellus.s();
    }

    private static void lllIlIIIIIllIl() {
        lIllIlIllIII = new String[lIllIlIllIIl[8]];
        lIllIlIllIII[lIllIlIllIIl[2]] = lllIlIIIIIlIlI("m4MMOaW5syaR1TJcFdIaog==", "JwDPV");
        lIllIlIllIII[lIllIlIllIIl[1]] = lllIlIIIIIlIll("9T6ADdxbwsM=", "zsHVN");
        lIllIlIllIII[lIllIlIllIIl[0]] = lllIlIIIIIlIlI("9f4sZ+GWiVy6RfFlzsH2yw==", "znvCV");
        lIllIlIllIII[lIllIlIllIIl[3]] = lllIlIIIIIllII("Cy0LFiIgMQ==", "OHxbP");
        lIllIlIllIII[lIllIlIllIIl[4]] = lllIlIIIIIlIll("WhEQnMDxn2oV5ZdRO4cqZA==", "RZXag");
        lIllIlIllIII[lIllIlIllIIl[5]] = lllIlIIIIIllII("BRMdHjYuDw==", "AvnjD");
        lIllIlIllIII[lIllIlIllIIl[6]] = lllIlIIIIIlIll("m0wus/eSfcc=", "dknOy");
        lIllIlIllIII[lIllIlIllIIl[7]] = lllIlIIIIIllII("AAs7", "EjOmn");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    public boolean run() {
        if (lllIlIIIIIllll(this.bk.w(), lIllIlIllIIl[0])) {
            String[] strArr = new String[lIllIlIllIIl[1]];
            strArr[lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[2]];
            Item first = Inventory.getFirst(strArr);
            if (lllIlIIIIlIIII(first)) {
                first.interact(lIllIlIllIII[lIllIlIllIIl[1]]);
                return lIllIlIllIIl[1];
            }
        }
        if (lllIlIIIIIllll(this.bk.v(), lIllIlIllIIl[0])) {
            String[] strArr2 = new String[lIllIlIllIIl[1]];
            strArr2[lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[0]];
            Item first2 = Inventory.getFirst(strArr2);
            if (lllIlIIIIlIIII(first2)) {
                first2.interact(lIllIlIllIII[lIllIlIllIIl[3]]);
                return lIllIlIllIIl[1];
            }
        }
        if (lllIlIIIIIllll(this.bk.x(), lIllIlIllIIl[0])) {
            String[] strArr3 = new String[lIllIlIllIIl[1]];
            strArr3[lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[4]];
            Item first3 = Inventory.getFirst(strArr3);
            if (lllIlIIIIlIIII(first3)) {
                first3.interact(lIllIlIllIII[lIllIlIllIIl[5]]);
                return lIllIlIllIIl[1];
            }
        }
        if (lllIlIIIIlIIIl(Inventory.getCount((boolean) lIllIlIllIIl[2], item -> {
            return C0004e.U.contains(item.getName());
        }) + Inventory.getFreeSlots(), lIllIlIllIIl[0])) {
            Item first4 = Inventory.getFirst(item2 -> {
                String[] strArr4 = new String[lIllIlIllIIl[1]];
                strArr4[lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[7]];
                return item2.hasAction(strArr4);
            });
            if (!lllIlIIIIlIIlI(first4)) {
                first4.interact(lIllIlIllIII[lIllIlIllIIl[6]]);
                return lIllIlIllIIl[1];
            }
            this.bj.f((boolean) lIllIlIllIIl[2]);
            this.bj.g(lIllIlIllIIl[1]);
            return lIllIlIllIIl[2];
        }
        return lIllIlIllIIl[2];
    }

    private static String lllIlIIIIIllII(String lllllllllllllllIlIllllIlIIIIllll, String lllllllllllllllIlIllllIlIIIIlllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllIlIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIllllIlIIIIllII = lllllllllllllllIlIllllIlIIIIlllI.toCharArray();
        int lllllllllllllllIlIllllIlIIIIlIll = lIllIlIllIIl[2];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIlIllllIlIIIIIlII = charArray.length;
        int i = lIllIlIllIIl[2];
        while (lllIlIIIIlIIIl(i, lllllllllllllllIlIllllIlIIIIIlII)) {
            char lllllllllllllllIlIllllIlIIIlIIII = charArray[i];
            sb.append((char) (lllllllllllllllIlIllllIlIIIlIIII ^ lllllllllllllllIlIllllIlIIIIllII[lllllllllllllllIlIllllIlIIIIlIll % lllllllllllllllIlIllllIlIIIIllII.length]));
            "".length();
            lllllllllllllllIlIllllIlIIIIlIll++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lllIlIIIIIlIlI(String lllllllllllllllIlIllllIlIIIlllll, String lllllllllllllllIlIllllIlIIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIlIIIllllI.getBytes(StandardCharsets.UTF_8)), lIllIlIllIIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIllIIl[0], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIlIIlIIIII) {
            lllllllllllllllIlIllllIlIIlIIIII.printStackTrace();
            return null;
        }
    }

    static {
        lllIlIIIIIlllI();
        lllIlIIIIIllIl();
    }

    private static boolean lllIlIIIIlIIII(Object obj) {
        return obj != null;
    }

    private static boolean lllIlIIIIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIlIIIIlIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lllIlIIIIIllll(int i, int i2) {
        return i >= i2;
    }

    private static String lllIlIIIIIlIll(String lllllllllllllllIlIllllIIlllllIlI, String lllllllllllllllIlIllllIIlllllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllllIIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllllIIllllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllIIllllllII.init(lIllIlIllIIl[0], lllllllllllllllIlIllllIIllllllIl);
            return new String(lllllllllllllllIlIllllIIllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllllIIlllllIll) {
            lllllllllllllllIlIllllIIlllllIll.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIIIlllI() {
        lIllIlIllIIl = new int[9];
        lIllIlIllIIl[0] = "  ".length();
        lIllIlIllIIl[1] = " ".length();
        lIllIlIllIIl[2] = ((66 ^ 43) ^ (191 ^ 152)) & (((56 ^ 64) ^ (169 ^ 159)) ^ (-" ".length()));
        lIllIlIllIIl[3] = "   ".length();
        lIllIlIllIIl[4] = (214 ^ 177) ^ (161 ^ 194);
        lIllIlIllIIl[5] = (((47 + 92) - 84) + 84) ^ (((130 + 78) - 201) + 135);
        lIllIlIllIIl[6] = (253 ^ 193) ^ (50 ^ 8);
        lIllIlIllIIl[7] = (50 ^ 35) ^ (170 ^ 188);
        lIllIlIllIIl[8] = (173 ^ 192) ^ (61 ^ 88);
    }
}
