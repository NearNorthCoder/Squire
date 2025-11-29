package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Collect Musca Mushrooms", priority = 100, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.E  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/E.class */
public class E extends Task {
    private static /* synthetic */ String[] lIllIIlIlIll;
    final /* synthetic */ SquireDukeSucellus bh;
    final /* synthetic */ C0000a bi;
    private static /* synthetic */ int[] lIllIIlIllII;

    private static boolean lllIIlIllIIIII(Object obj) {
        return obj == null;
    }

    private static String lllIIlIlIlllII(String lllllllllllllllIllIIIIlIIIIlIlll, String lllllllllllllllIllIIIIlIIIIlIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIlIIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIIlIIIIlIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIIIlIIIIlIllI.toCharArray();
        int lllllllllllllllIllIIIIlIIIIlIIll = lIllIIlIllII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIlIllII[1];
        while (lllIIlIllIIIIl(i, length)) {
            lllllllllllllllIllIIIIlIIIIlIlIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIIIIlIIIIlIIll % charArray.length]));
            "".length();
            lllllllllllllllIllIIIIlIIIIlIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIIIlIIIIlIlIl);
    }

    private static void lllIIlIlIllllI() {
        lIllIIlIlIll = new String[lIllIIlIllII[0]];
        lIllIIlIlIll[lIllIIlIllII[1]] = lllIIlIlIlllII("JAw/DQBJFDkdCRsWIwM=", "iyLna");
        lIllIIlIlIll[lIllIIlIllII[2]] = lllIIlIlIlllIl("h+MrabI2PtDr7BFC1IIDCA==", "mpdVn");
    }

    @Inject
    public E(SquireDukeSucellus squireDukeSucellus) {
        this.bh = squireDukeSucellus;
        this.bi = squireDukeSucellus.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[lIllIIlIllII[0]];
        strArr[lIllIIlIllII[1]] = lIllIIlIlIll[lIllIIlIllII[1]];
        strArr[lIllIIlIllII[2]] = lIllIIlIlIll[lIllIIlIllII[2]];
        Item first = Inventory.getFirst(strArr);
        if (lllIIlIllIIIII(first)) {
            return lIllIIlIllII[1];
        }
        int[] iArr = new int[lIllIIlIllII[2]];
        iArr[lIllIIlIllII[1]] = lIllIIlIllII[3];
        Item first2 = Inventory.getFirst(iArr);
        if (lllIIlIllIIIII(first2)) {
            return lIllIIlIllII[1];
        }
        first2.useOn(first);
        return lIllIIlIllII[2];
    }

    private static String lllIIlIlIlllIl(String lllllllllllllllIllIIIIlIIIIIIIlI, String lllllllllllllllIllIIIIlIIIIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIIIlIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIlIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIlIllII[0], lllllllllllllllIllIIIIlIIIIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIlIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIIlIIIIIIIll) {
            lllllllllllllllIllIIIIlIIIIIIIll.printStackTrace();
            return null;
        }
    }

    static {
        lllIIlIlIlllll();
        lllIIlIlIllllI();
    }

    private static void lllIIlIlIlllll() {
        lIllIIlIllII = new int[4];
        lIllIIlIllII[0] = "  ".length();
        lIllIIlIllII[1] = (13 ^ 7) & ((88 ^ 82) ^ (-1));
        lIllIIlIllII[2] = " ".length();
        lIllIIlIllII[3] = ((213 + 220) - 414) + 214;
    }

    private static boolean lllIIlIllIIIIl(int i, int i2) {
        return i < i2;
    }
}
