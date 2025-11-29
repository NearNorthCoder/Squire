package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Casting B2P", priority = 6)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.A  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/A.class */
public class A extends Task {
    private final /* synthetic */ C0006g az;
    private static /* synthetic */ String[] lIIlIIllIllII;
    private static /* synthetic */ int[] lIIlIIllIllll;

    private static String lIlIlIlIIllIIlI(String llllllllllllllIlllllIIllIllIlIIl, String llllllllllllllIlllllIIllIllIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIllIllIlIII.getBytes(StandardCharsets.UTF_8)), lIIlIIllIllll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIllIllll[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIllIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIllIllIlIlI) {
            llllllllllllllIlllllIIllIllIlIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlIIllIlII(String llllllllllllllIlllllIIllIlIllIIl, String llllllllllllllIlllllIIllIlIllIII) {
        String llllllllllllllIlllllIIllIlIllIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIllIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllllIIllIlIllIII.toCharArray();
        int llllllllllllllIlllllIIllIlIlIlIl = lIIlIIllIllll[0];
        char[] charArray2 = llllllllllllllIlllllIIllIlIllIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIIllIllll[0];
        while (lIlIlIlIlIIIIIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllllIIllIlIlIlIl % charArray.length]));
            "".length();
            llllllllllllllIlllllIIllIlIlIlIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlIlIlIIIIII(int i, int i2) {
        return i > i2;
    }

    @Inject
    public A(C0006g c0006g) {
        this.az = c0006g;
    }

    static {
        lIlIlIlIIllllII();
        lIlIlIlIIllIlIl();
    }

    private static boolean lIlIlIlIIlllllI(int i) {
        return i == 0;
    }

    private static String lIlIlIlIIllIIll(String llllllllllllllIlllllIIllIlIIIlII, String llllllllllllllIlllllIIllIlIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIllIllll[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIllIlIIIlIl) {
            llllllllllllllIlllllIIllIlIIIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    public boolean run() {
        if (!lIlIlIlIIllllIl(this.az.m() ? 1 : 0) || lIlIlIlIIllllIl(this.az.l() ? 1 : 0)) {
            return lIIlIIllIllll[0];
        }
        if (lIlIlIlIIllllIl(this.az.p() ? 1 : 0)) {
            return lIIlIIllIllll[0];
        }
        String[] strArr = new String[lIIlIIllIllll[1]];
        strArr[lIIlIIllIllll[0]] = lIIlIIllIllII[lIIlIIllIllll[0]];
        strArr[lIIlIIllIllll[2]] = lIIlIIllIllII[lIIlIIllIllll[2]];
        if (lIlIlIlIIlllllI(Inventory.contains(strArr) ? 1 : 0)) {
            return lIIlIIllIllll[0];
        }
        if (lIlIlIlIIllllll(TileItems.getNearest(tileItem -> {
            return tileItem.getName().toLowerCase().contains(lIIlIIllIllII[lIIlIIllIllll[7]]);
        })) && lIlIlIlIIlllllI(Inventory.isFull() ? 1 : 0) && lIlIlIlIlIIIIII(this.az.k(), lIIlIIllIllll[3])) {
            return lIIlIIllIllll[0];
        }
        int[] iArr = new int[lIIlIIllIllll[1]];
        iArr[lIIlIIllIllll[0]] = lIIlIIllIllll[4];
        iArr[lIIlIIllIllll[2]] = lIIlIIllIllll[5];
        Item first = Inventory.getFirst(iArr);
        if (lIlIlIlIIllllll(first)) {
            first.interact(lIIlIIllIllII[lIIlIIllIllll[1]]);
            "".length();
            if (" ".length() < 0) {
                return ((59 ^ 42) ^ (246 ^ 167)) & (((119 ^ 15) ^ (147 ^ 171)) ^ (-" ".length()));
            }
        } else {
            Magic.cast(SpellBook.Standard.BONES_TO_PEACHES);
        }
        sleep(lIIlIIllIllll[6]);
        return lIIlIIllIllll[2];
    }

    private static void lIlIlIlIIllIlIl() {
        lIIlIIllIllII = new String[lIIlIIllIllll[6]];
        lIIlIIllIllII[lIIlIIllIllll[0]] = lIlIlIlIIllIIlI("mUzpqxUsyaI=", "AiUVO");
        lIIlIIllIllII[lIIlIIllIllll[2]] = lIlIlIlIIllIIll("9Qu6NmPe9L7RqZN0Fd9qYA==", "nKobX");
        lIIlIIllIllII[lIIlIIllIllll[1]] = lIlIlIlIIllIIlI("BkGD4jHJ/u0=", "TZIVp");
        lIIlIIllIllII[lIIlIIllIllll[7]] = lIlIlIlIIllIlII("GAgLACU=", "zgeeV");
    }

    private static boolean lIlIlIlIlIIIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlIlIIllllll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIlIIllllIl(int i) {
        return i != 0;
    }

    private static void lIlIlIlIIllllII() {
        lIIlIIllIllll = new int[9];
        lIIlIIllIllll[0] = (36 ^ 116) & ((38 ^ 118) ^ (-1));
        lIIlIIllIllll[1] = "  ".length();
        lIIlIIllIllll[2] = " ".length();
        lIIlIIllIllll[3] = 142 ^ 130;
        lIIlIIllIllll[4] = (-24673) & 31598;
        lIIlIIllIllll[5] = (-((-1539) & 26291)) & (-1) & 32767;
        lIIlIIllIllll[6] = 62 ^ 58;
        lIIlIIllIllll[7] = "   ".length();
        lIIlIIllIllll[8] = (93 ^ 55) ^ (249 ^ 155);
    }
}
