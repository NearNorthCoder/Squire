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
@TaskDesc(name = "Looting", blocking = true, priority = 50000)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.v  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/v.class */
public class v extends Task {
    private final /* synthetic */ SquireScurriusConfig aj;
    private static /* synthetic */ String[] lIIlIlIlIlllI;
    private static /* synthetic */ int[] lIIlIlIlIllll;
    private /* synthetic */ b c;
    private final /* synthetic */ SquireScurrius ai;

    private static void lIlIllIIIIllIll() {
        lIIlIlIlIllll = new int[7];
        lIIlIlIlIllll[0] = ((229 ^ 158) ^ (133 ^ 160)) & (((((242 + 19) - 34) + 24) ^ (((118 + 122) - 214) + 139)) ^ (-" ".length()));
        lIIlIlIlIllll[1] = " ".length();
        lIIlIlIlIllll[2] = "  ".length();
        lIIlIlIlIllll[3] = "   ".length();
        lIIlIlIlIllll[4] = (172 ^ 139) ^ (71 ^ 100);
        lIIlIlIlIllll[5] = 26 ^ 31;
        lIIlIlIlIllll[6] = 26 ^ 18;
    }

    private static boolean lIlIllIIIIllllI(Object obj) {
        return obj == null;
    }

    private static boolean lIlIllIIIlIIIII(int i, int i2) {
        return i < i2;
    }

    @Inject
    public v(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.aj = squireScurriusConfig;
        this.ai = squireScurrius;
        this.c = squireScurrius.n();
    }

    private static boolean lIlIllIIIIlllll(int i) {
        return i != 0;
    }

    private static void lIlIllIIIIllIlI() {
        lIIlIlIlIlllI = new String[lIIlIlIlIllll[5]];
        lIIlIlIlIlllI[lIIlIlIlIllll[0]] = lIlIllIIIIlIlll("j57PzUNx0c2pwPXaOdUeVQ==", "aSLBt");
        lIIlIlIlIlllI[lIIlIlIlIllll[1]] = lIlIllIIIIllIII("SvNP4hyPHho=", "uOewX");
        lIIlIlIlIlllI[lIIlIlIlIllll[2]] = lIlIllIIIIlIlll("VFZWzpwnnmM=", "IqnMJ");
        lIIlIlIlIlllI[lIIlIlIlIllll[3]] = lIlIllIIIIlIlll("34ct1sgdJhY=", "MUKWm");
        lIIlIlIlIlllI[lIIlIlIlIllll[4]] = lIlIllIIIIllIIl("Czgb", "NYoZA");
    }

    private static String lIlIllIIIIlIlll(String llllllllllllllIllllIllIllIlIIlll, String llllllllllllllIllllIllIllIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIllIllIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIllIllIlIlIIl.init(lIIlIlIlIllll[2], secretKeySpec);
            return new String(llllllllllllllIllllIllIllIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllIllIlIlIII) {
            llllllllllllllIllllIllIllIlIlIII.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIIIllIIl(String llllllllllllllIllllIllIlllIIlIIl, String llllllllllllllIllllIllIlllIIIIll) {
        String llllllllllllllIllllIllIlllIIlIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIllIlllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIllIlllIIIllI = llllllllllllllIllllIllIlllIIIIll.toCharArray();
        int llllllllllllllIllllIllIlllIIIlIl = lIIlIlIlIllll[0];
        char[] charArray = llllllllllllllIllllIllIlllIIlIIl2.toCharArray();
        int llllllllllllllIllllIllIllIlllllI = charArray.length;
        int i = lIIlIlIlIllll[0];
        while (lIlIllIIIlIIIII(i, llllllllllllllIllllIllIllIlllllI)) {
            char llllllllllllllIllllIllIlllIIlIlI = charArray[i];
            sb.append((char) (llllllllllllllIllllIllIlllIIlIlI ^ llllllllllllllIllllIllIlllIIIllI[llllllllllllllIllllIllIlllIIIlIl % llllllllllllllIllllIllIlllIIIllI.length]));
            "".length();
            llllllllllllllIllllIllIlllIIIlIl++;
            i++;
            "".length();
            if (((((77 + 24) - (-24)) + 74) ^ (((129 + 30) - (-22)) + 13)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIllIIIIlllII(int i) {
        return i == 0;
    }

    static {
        lIlIllIIIIllIll();
        lIlIllIIIIllIlI();
    }

    private static String lIlIllIIIIllIII(String llllllllllllllIllllIllIllIllIlII, String llllllllllllllIllllIllIllIllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIllIllIIll.getBytes(StandardCharsets.UTF_8)), lIIlIlIlIllll[6]), "DES");
            Cipher llllllllllllllIllllIllIllIllIllI = Cipher.getInstance("DES");
            llllllllllllllIllllIllIllIllIllI.init(lIIlIlIlIllll[2], secretKeySpec);
            return new String(llllllllllllllIllllIllIllIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllIllIllIlIl) {
            llllllllllllllIllllIllIllIllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIIlllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public boolean run() {
        if (lIlIllIIIIlllII(this.ai.c() ? 1 : 0)) {
            return lIIlIlIlIllll[0];
        }
        String[] strArr = new String[lIIlIlIlIllll[1]];
        strArr[lIIlIlIlIllll[0]] = lIIlIlIlIlllI[lIIlIlIlIllll[0]];
        if (lIlIllIIIIlllIl(NPCs.getNearest(strArr))) {
            return lIIlIlIlIllll[0];
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (!lIlIllIIIIlllII(d.v.contains(tileItem.getName()) ? 1 : 0) || (lIlIllIIIIlllll(this.aj.lootBoosting() ? 1 : 0) && lIlIllIIIIlllll(d.y.contains(tileItem.getName()) ? 1 : 0))) {
                ?? r0 = lIIlIlIlIllll[1];
                "".length();
                return (-((94 ^ 90) ^ ((148 ^ 136) & ((118 ^ 106) ^ (-1))))) > 0 ? ((206 ^ 160) ^ (173 ^ 134)) & (((((193 + 80) - 219) + 146) ^ (((27 + 113) - 107) + 108)) ^ (-" ".length())) : r0;
            }
            return lIIlIlIlIllll[0];
        });
        if (lIlIllIIIIllllI(nearest)) {
            TileItem nearest2 = TileItems.getNearest(tileItem2 -> {
                return d.w.contains(tileItem2.getName());
            });
            if (!lIlIllIIIIlllIl(nearest2) || lIlIllIIIIlllll(Inventory.isFull() ? 1 : 0)) {
                return lIIlIlIlIllll[0];
            }
            nearest = nearest2;
        }
        if (!lIlIllIIIIlllll(Inventory.isFull() ? 1 : 0)) {
            nearest.interact(lIIlIlIlIlllI[lIIlIlIlIllll[3]]);
            return lIIlIlIlIllll[1];
        }
        Item first = Inventory.getFirst(item -> {
            return d.z.contains(item.getName());
        });
        if (lIlIllIIIIlllIl(first)) {
            first.interact(lIIlIlIlIlllI[lIIlIlIlIllll[1]]);
            return lIIlIlIlIllll[1];
        }
        Item first2 = Inventory.getFirst(item2 -> {
            String[] strArr2 = new String[lIIlIlIlIllll[1]];
            strArr2[lIIlIlIlIllll[0]] = lIIlIlIlIlllI[lIIlIlIlIllll[4]];
            return item2.hasAction(strArr2);
        });
        if (lIlIllIIIIllllI(first2)) {
            this.ai.e((boolean) lIIlIlIlIllll[1]);
            return lIIlIlIlIllll[0];
        }
        first2.interact(lIIlIlIlIlllI[lIIlIlIlIllll[2]]);
        return lIIlIlIlIllll[1];
    }
}
