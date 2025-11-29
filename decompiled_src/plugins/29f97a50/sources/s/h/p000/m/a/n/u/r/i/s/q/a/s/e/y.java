package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Grabbing DWH", priority = 100, blocking = true)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.y  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/y.class */
public class y extends Task {
    private static /* synthetic */ int[] lIIlIlllllllI;
    private final /* synthetic */ SquireShamanConfig aE;
    private static /* synthetic */ String[] lIIlIlllllIll;

    private static void lIlIlllIIlIIllI() {
        lIIlIlllllllI = new int[11];
        lIIlIlllllllI[0] = (234 ^ 177) & ((9 ^ 82) ^ (-1));
        lIIlIlllllllI[1] = "  ".length();
        lIIlIlllllllI[2] = (-101) & 13676;
        lIIlIlllllllI[3] = " ".length();
        lIIlIlllllllI[4] = (-11393) & 32177;
        lIIlIlllllllI[5] = "   ".length();
        lIIlIlllllllI[6] = 98 ^ 102;
        lIIlIlllllllI[7] = 126 ^ 123;
        lIIlIlllllllI[8] = 123 ^ 125;
        lIIlIlllllllI[9] = 76 ^ 75;
        lIIlIlllllllI[10] = (110 ^ 90) ^ (185 ^ 133);
    }

    private static String lIlIlllIIIlllll(String llllllllllllllIllllIIllIllIlIIIl, String llllllllllllllIllllIIllIllIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllIllIlIIII.getBytes(StandardCharsets.UTF_8)), lIIlIlllllllI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlllllllI[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIllIllIlIIlI) {
            llllllllllllllIllllIIllIllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIlIlIII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlllIIlIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlllIIlIIlll(int i) {
        return i == 0;
    }

    private static String lIlIlllIIlIIIII(String llllllllllllllIllllIIllIllIIIIIl, String llllllllllllllIllllIIllIllIIIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIIllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIllIlIllllll = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIllIllIIIIII.toCharArray();
        int llllllllllllllIllllIIllIlIllllIl = lIIlIlllllllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlllllllI[0];
        while (lIlIlllIIlIlIll(i, length)) {
            char llllllllllllllIllllIIllIllIIIIlI = charArray2[i];
            llllllllllllllIllllIIllIlIllllll.append((char) (llllllllllllllIllllIIllIllIIIIlI ^ charArray[llllllllllllllIllllIIllIlIllllIl % charArray.length]));
            "".length();
            llllllllllllllIllllIIllIlIllllIl++;
            i++;
            "".length();
            if (((5 ^ 16) & ((8 ^ 29) ^ (-1))) > (44 ^ 40)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIIllIlIllllll);
    }

    static {
        lIlIlllIIlIIllI();
        lIlIlllIIlIIIlI();
    }

    private static boolean lIlIlllIIlIlIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    public boolean run() {
        if (lIlIlllIIlIIlll(this.aE.room().x().contains(Players.getLocal()) ? 1 : 0)) {
            return lIIlIlllllllI[0];
        }
        int[] iArr = new int[lIIlIlllllllI[1]];
        iArr[lIIlIlllllllI[0]] = lIIlIlllllllI[2];
        iArr[lIIlIlllllllI[3]] = lIIlIlllllllI[4];
        TileItem nearest = TileItems.getNearest(iArr);
        if (lIlIlllIIlIlIII(nearest)) {
            return lIIlIlllllllI[0];
        }
        if (lIlIlllIIlIlIIl(Inventory.isFull() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                String str = lIIlIlllllIll[lIIlIlllllllI[8]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            if (lIlIlllIIlIlIlI(first)) {
                first.interact(lIIlIlllllIll[lIIlIlllllllI[0]]);
                "".length();
                if (" ".length() >= "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                Item first2 = Inventory.getFirst(item2 -> {
                    String str = lIIlIlllllIll[lIIlIlllllllI[7]];
                    return item2.hasAction((v1) -> {
                        return r1.equals(v1);
                    });
                });
                if (lIlIlllIIlIlIlI(first2)) {
                    first2.interact(lIIlIlllllIll[lIIlIlllllllI[3]]);
                    "".length();
                    if ((((((137 + 43) - 33) + 28) ^ (((103 + 1) - 89) + 125)) & (((((49 + 58) - 27) + 76) ^ (((105 + 174) - 120) + 32)) ^ (-" ".length()))) != 0) {
                        return ((11 ^ 44) ^ (148 ^ 187)) & (((238 ^ 155) ^ (54 ^ 75)) ^ (-" ".length()));
                    }
                } else {
                    Item first3 = Inventory.getFirst(item3 -> {
                        String[] strArr = new String[lIIlIlllllllI[3]];
                        strArr[lIIlIlllllllI[0]] = lIIlIlllllIll[lIIlIlllllllI[6]];
                        return item3.hasAction(strArr);
                    });
                    if (!lIlIlllIIlIlIlI(first3)) {
                        return lIIlIlllllllI[0];
                    }
                    first3.interact(lIIlIlllllIll[lIIlIlllllllI[1]]);
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return ((52 ^ 124) ^ (239 ^ 141)) & (((220 ^ 175) ^ (75 ^ 18)) ^ (-" ".length()));
                    }
                }
            }
        }
        nearest.interact(lIIlIlllllIll[lIIlIlllllllI[5]]);
        return lIIlIlllllllI[3];
    }

    private static boolean lIlIlllIIlIlIll(int i, int i2) {
        return i < i2;
    }

    private static void lIlIlllIIlIIIlI() {
        lIIlIlllllIll = new String[lIIlIlllllllI[9]];
        lIIlIlllllIll[lIIlIlllllllI[0]] = lIlIlllIIIlllIl("mu+qaoSNIQ4=", "ARoXC");
        lIIlIlllllIll[lIIlIlllllllI[3]] = lIlIlllIIIlllll("HE7HFVU/2bE=", "WCmUj");
        lIIlIlllllIll[lIIlIlllllllI[1]] = lIlIlllIIlIIIII("Jzo3CA==", "cHXxS");
        lIIlIlllllIll[lIIlIlllllllI[5]] = lIlIlllIIIlllll("YGNDu4IvgVY=", "pmvch");
        lIIlIlllllIll[lIIlIlllllllI[6]] = lIlIlllIIlIIIII("LzkYJw==", "kKwWv");
        lIIlIlllllIll[lIIlIlllllllI[7]] = lIlIlllIIIlllIl("TbHanvmPgcw=", "KjNcE");
        lIIlIlllllIll[lIIlIlllllllI[8]] = lIlIlllIIIlllll("GIoQTr+YFcQ=", "zZQNE");
    }

    private static String lIlIlllIIIlllIl(String llllllllllllllIllllIIllIllIllllI, String llllllllllllllIllllIIllIllIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIllIllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIllIlllIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIllIlllIIIII.init(lIIlIlllllllI[1], secretKeySpec);
            return new String(llllllllllllllIllllIIllIlllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIllIllIlllll) {
            llllllllllllllIllllIIllIllIlllll.printStackTrace();
            return null;
        }
    }

    @Inject
    public y(SquireShamanConfig squireShamanConfig) {
        this.aE = squireShamanConfig;
    }
}
