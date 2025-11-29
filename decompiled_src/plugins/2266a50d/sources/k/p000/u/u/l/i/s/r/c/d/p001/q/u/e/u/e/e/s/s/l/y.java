package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Looting", blocking = true, priority = 5000)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.y  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/y.class */
public class y extends Task {
    private final /* synthetic */ SquireDukeSucellus aV;
    private static /* synthetic */ int[] lIllIlIIlIlI;
    private final /* synthetic */ SquireDukeSucellusConfig aW;
    private /* synthetic */ C0000a u;
    private static /* synthetic */ String[] lIllIlIIlIIl;

    private static String lllIIlllIIIIll(String lllllllllllllllIlIllllllIIIIIlIl, String lllllllllllllllIlIllllllIIIIIlII) {
        String lllllllllllllllIlIllllllIIIIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllllllIIIIIIll = new StringBuilder();
        char[] lllllllllllllllIlIllllllIIIIIIlI = lllllllllllllllIlIllllllIIIIIlII.toCharArray();
        int lllllllllllllllIlIllllllIIIIIIIl = lIllIlIIlIlI[0];
        char[] charArray = lllllllllllllllIlIllllllIIIIIlIl2.toCharArray();
        int length = charArray.length;
        int i = lIllIlIIlIlI[0];
        while (lllIIlllIIlIlI(i, length)) {
            lllllllllllllllIlIllllllIIIIIIll.append((char) (charArray[i] ^ lllllllllllllllIlIllllllIIIIIIlI[lllllllllllllllIlIllllllIIIIIIIl % lllllllllllllllIlIllllllIIIIIIlI.length]));
            "".length();
            lllllllllllllllIlIllllllIIIIIIIl++;
            i++;
            "".length();
            if ((((100 ^ 84) ^ (76 ^ 54)) & (((((43 + 64) - (-104)) + 32) ^ (((57 + 124) - 36) + 40)) ^ (-" ".length()))) >= ((((167 + 42) - 84) + 70) ^ (((148 + 122) - 181) + 110))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllllllIIIIIIll);
    }

    private static void lllIIlllIIIllI() {
        lIllIlIIlIlI = new int[5];
        lIllIlIIlIlI[0] = ((28 ^ 80) ^ (10 ^ 97)) & (((96 ^ 54) ^ (210 ^ 163)) ^ (-" ".length()));
        lIllIlIIlIlI[1] = " ".length();
        lIllIlIIlIlI[2] = "  ".length();
        lIllIlIIlIlI[3] = "   ".length();
        lIllIlIIlIlI[4] = (((102 + 151) - 126) + 47) ^ (((10 + 144) - 29) + 41);
    }

    private static void lllIIlllIIIlIl() {
        lIllIlIIlIIl = new String[lIllIlIIlIlI[3]];
        lIllIlIIlIIl[lIllIlIIlIlI[0]] = lllIIlllIIIIlI("h5p7JA0qGYA=", "QJHrF");
        lIllIlIIlIIl[lIllIlIIlIlI[1]] = lllIIlllIIIIll("ETsMHA==", "EZgyR");
        lIllIlIIlIIl[lIllIlIIlIlI[2]] = lllIIlllIIIlII("+EvjmcrY2a4=", "oeVJy");
    }

    private static boolean lllIIlllIIlIIl(int i) {
        return i != 0;
    }

    @Inject
    public y(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aW = squireDukeSucellusConfig;
        this.aV = squireDukeSucellus;
        this.u = squireDukeSucellus.s();
    }

    private static String lllIIlllIIIlII(String lllllllllllllllIlIlllllIllllIIII, String lllllllllllllllIlIlllllIlllIllll) {
        try {
            SecretKeySpec lllllllllllllllIlIlllllIllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIlllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIIlIlI[2], lllllllllllllllIlIlllllIllllIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllllIllllIIIl) {
            lllllllllllllllIlIlllllIllllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIlllIIIlll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public boolean run() {
        if (lllIIlllIIIlll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIllIlIIlIlI[0];
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            return C0004e.S.contains(tileItem.getName());
        });
        if (lllIIlllIIlIII(nearest)) {
            if (lllIIlllIIIlll(LocalPlayer.getAccountType().isIronman() ? 1 : 0) && lllIIlllIIIlll(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
                this.aV.f((boolean) lIllIlIIlIlI[0]);
                return lIllIlIIlIlI[0];
            }
            nearest = TileItems.getNearest(tileItem2 -> {
                return C0004e.T.contains(tileItem2.getName());
            });
            if (lllIIlllIIlIII(nearest)) {
                this.aV.f((boolean) lIllIlIIlIlI[0]);
                return lIllIlIIlIlI[0];
            }
        }
        if (!lllIIlllIIlIIl(Inventory.isFull() ? 1 : 0)) {
            nearest.interact(lIllIlIIlIIl[lIllIlIIlIlI[1]]);
            return lIllIlIIlIlI[1];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIllIlIIlIlI[1]];
            strArr[lIllIlIIlIlI[0]] = lIllIlIIlIIl[lIllIlIIlIlI[2]];
            return item.hasAction(strArr);
        });
        if (!lllIIlllIIlIII(first)) {
            first.interact(lIllIlIIlIIl[lIllIlIIlIlI[0]]);
            return lIllIlIIlIlI[1];
        }
        this.aV.f((boolean) lIllIlIIlIlI[0]);
        this.aV.g(lIllIlIIlIlI[1]);
        return lIllIlIIlIlI[0];
    }

    private static boolean lllIIlllIIlIII(Object obj) {
        return obj == null;
    }

    private static String lllIIlllIIIIlI(String lllllllllllllllIlIlllllIlllIIIll, String lllllllllllllllIlIlllllIlllIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlllllIlllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIlllIIIlI.getBytes(StandardCharsets.UTF_8)), lIllIlIIlIlI[4]), "DES");
            Cipher lllllllllllllllIlIlllllIlllIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlllllIlllIIlIl.init(lIllIlIIlIlI[2], lllllllllllllllIlIlllllIlllIIllI);
            return new String(lllllllllllllllIlIlllllIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllllIlllIIlII) {
            lllllllllllllllIlIlllllIlllIIlII.printStackTrace();
            return null;
        }
    }

    static {
        lllIIlllIIIllI();
        lllIIlllIIIlIl();
    }
}
