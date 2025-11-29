package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Looting and burying bones", blocking = true, priority = 10000)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.u  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/u.class */
public class u extends Task {
    private final /* synthetic */ SquireScurriusConfig ah;
    private /* synthetic */ b c;
    private static /* synthetic */ String[] lIIlIllIIIIII;
    private static /* synthetic */ int[] lIIlIllIIIIIl;
    private final /* synthetic */ SquireScurrius ag;

    private static boolean lIlIllIIlIlIIlI(int i) {
        return i != 0;
    }

    static {
        lIlIllIIlIIlllI();
        lIlIllIIlIIllIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    public boolean run() {
        if (!lIlIllIIlIIllll(this.ah.lootBigBones() ? 1 : 0) && !lIlIllIIlIIllll(this.ag.c() ? 1 : 0)) {
            String[] strArr = new String[lIIlIllIIIIIl[1]];
            strArr[lIIlIllIIIIIl[0]] = lIIlIllIIIIII[lIIlIllIIIIIl[0]];
            if (lIlIllIIlIlIIII(NPCs.getNearest(strArr))) {
                return lIIlIllIIIIIl[0];
            }
            int[] iArr = new int[lIIlIllIIIIIl[1]];
            iArr[lIIlIllIIIIIl[0]] = lIIlIllIIIIIl[2];
            Item first = Inventory.getFirst(iArr);
            if (lIlIllIIlIlIIII(first)) {
                first.interact(lIIlIllIIIIII[lIIlIllIIIIIl[1]]);
                return lIIlIllIIIIIl[1];
            }
            TileItem nearest = TileItems.getNearest(tileItem -> {
                return tileItem.getName().equals(lIIlIllIIIIII[lIIlIllIIIIIl[7]]);
            });
            if (lIlIllIIlIlIIIl(nearest)) {
                return lIIlIllIIIIIl[0];
            }
            if (!lIlIllIIlIlIIlI(Inventory.isFull() ? 1 : 0)) {
                nearest.interact(lIIlIllIIIIII[lIIlIllIIIIIl[5]]);
                return lIIlIllIIIIIl[1];
            }
            Item first2 = Inventory.getFirst(item -> {
                return d.z.contains(item.getName());
            });
            if (lIlIllIIlIlIIII(first2)) {
                first2.interact(lIIlIllIIIIII[lIIlIllIIIIIl[3]]);
                return lIIlIllIIIIIl[1];
            }
            Item first3 = Inventory.getFirst(item2 -> {
                String[] strArr2 = new String[lIIlIllIIIIIl[1]];
                strArr2[lIIlIllIIIIIl[0]] = lIIlIllIIIIII[lIIlIllIIIIIl[6]];
                return item2.hasAction(strArr2);
            });
            if (lIlIllIIlIlIIIl(first3)) {
                this.ag.e((boolean) lIIlIllIIIIIl[1]);
                return lIIlIllIIIIIl[0];
            }
            first3.interact(lIIlIllIIIIII[lIIlIllIIIIIl[4]]);
            return lIIlIllIIIIIl[1];
        }
        return lIIlIllIIIIIl[0];
    }

    private static boolean lIlIllIIlIlIIII(Object obj) {
        return obj != null;
    }

    @Inject
    public u(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ah = squireScurriusConfig;
        this.ag = squireScurrius;
        this.c = squireScurrius.n();
    }

    private static boolean lIlIllIIlIIllll(int i) {
        return i == 0;
    }

    private static void lIlIllIIlIIllIl() {
        lIIlIllIIIIII = new String[lIIlIllIIIIIl[8]];
        lIIlIllIIIIII[lIIlIllIIIIIl[0]] = lIlIllIIlIIlIlI("Mi0lGRMIOyM=", "aNPka");
        lIIlIllIIIIII[lIIlIllIIIIIl[1]] = lIlIllIIlIIlIll("7vvZib+cAIg=", "miYzQ");
        lIIlIllIIIIII[lIIlIllIIIIIl[3]] = lIlIllIIlIIllII("0vgXfZm1GZI=", "qgwPD");
        lIIlIllIIIIII[lIIlIllIIIIIl[4]] = lIlIllIIlIIlIll("BErj5dskIUM=", "SKAjR");
        lIIlIllIIIIII[lIIlIllIIIIIl[5]] = lIlIllIIlIIlIlI("IQ4cHw==", "uowzh");
        lIIlIllIIIIII[lIIlIllIIIIIl[6]] = lIlIllIIlIIlIll("jvnEy4fSekg=", "fQbNM");
        lIIlIllIIIIII[lIIlIllIIIIIl[7]] = lIlIllIIlIIlIlI("DCARdiMhJxMl", "NIvVA");
    }

    private static boolean lIlIllIIlIlIIIl(Object obj) {
        return obj == null;
    }

    private static void lIlIllIIlIIlllI() {
        lIIlIllIIIIIl = new int[10];
        lIIlIllIIIIIl[0] = (88 ^ 29) & ((80 ^ 21) ^ (-1));
        lIIlIllIIIIIl[1] = " ".length();
        lIIlIllIIIIIl[2] = (-2505) & 3036;
        lIIlIllIIIIIl[3] = "  ".length();
        lIIlIllIIIIIl[4] = "   ".length();
        lIIlIllIIIIIl[5] = 65 ^ 69;
        lIIlIllIIIIIl[6] = 94 ^ 91;
        lIIlIllIIIIIl[7] = 157 ^ 155;
        lIIlIllIIIIIl[8] = 109 ^ 106;
        lIIlIllIIIIIl[9] = 60 ^ 52;
    }

    private static String lIlIllIIlIIlIll(String llllllllllllllIllllIllIIIlIIIllI, String llllllllllllllIllllIllIIIlIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIllIIIIIl[9]), "DES");
            Cipher llllllllllllllIllllIllIIIlIIlIII = Cipher.getInstance("DES");
            llllllllllllllIllllIllIIIlIIlIII.init(lIIlIllIIIIIl[3], secretKeySpec);
            return new String(llllllllllllllIllllIllIIIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllIIIlIIIlll) {
            llllllllllllllIllllIllIIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIlIIllII(String llllllllllllllIllllIllIIIlIlIIll, String llllllllllllllIllllIllIIIlIlIIlI) {
        try {
            SecretKeySpec llllllllllllllIllllIllIIIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIllIIIlIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIllIIIlIlIlIl.init(lIIlIllIIIIIl[3], llllllllllllllIllllIllIIIlIlIllI);
            return new String(llllllllllllllIllllIllIIIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllIIIlIlIlII) {
            llllllllllllllIllllIllIIIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIlIIlIlI(String llllllllllllllIllllIllIIIllIlIII, String llllllllllllllIllllIllIIIllIIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIllIIIllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIllIIIllIIllI = new StringBuilder();
        char[] llllllllllllllIllllIllIIIllIIlIl = llllllllllllllIllllIllIIIllIIlll.toCharArray();
        int llllllllllllllIllllIllIIIllIIlII = lIIlIllIIIIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIllIIIIIl[0];
        while (lIlIllIIlIlIIll(i, length)) {
            char llllllllllllllIllllIllIIIllIlIIl = charArray[i];
            llllllllllllllIllllIllIIIllIIllI.append((char) (llllllllllllllIllllIllIIIllIlIIl ^ llllllllllllllIllllIllIIIllIIlIl[llllllllllllllIllllIllIIIllIIlII % llllllllllllllIllllIllIIIllIIlIl.length]));
            "".length();
            llllllllllllllIllllIllIIIllIIlII++;
            i++;
            "".length();
            if (" ".length() >= (110 ^ 106)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIllIIIllIIllI);
    }

    private static boolean lIlIllIIlIlIIll(int i, int i2) {
        return i < i2;
    }
}
