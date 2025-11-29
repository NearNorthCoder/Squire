package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Make paste task")
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.m  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/m.class */
public class m extends Task {
    private final /* synthetic */ SquireMixologyConfig W;
    private static /* synthetic */ int[] lIIIIIIIIIIIl;
    private static /* synthetic */ String[] lIIIIIIIIIIII;

    static {
        lIIlIllIIIIIlIl();
        lIIlIllIIIIIlII();
    }

    private static void lIIlIllIIIIIlII() {
        lIIIIIIIIIIII = new String[lIIIIIIIIIIIl[20]];
        lIIIIIIIIIIII[lIIIIIIIIIIIl[0]] = lIIlIllIIIIIIIl("OzcKbCDQk4Q=", "FmuQX");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[2]] = lIIlIllIIIIIIlI("HuJpgMcSXiKLkoO9xKU2TA==", "iMqFD");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[3]] = lIIlIllIIIIIIIl("TA/STvSp7IYF+SUDJuD4Hg==", "edwRI");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[4]] = lIIlIllIIIIIIlI("+S/AYANaJVU=", "FwyPe");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[5]] = lIIlIllIIIIIIIl("tcG4O0zKND2YlCoc4sUIJQ==", "ivkvb");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[6]] = lIIlIllIIIIIIll("OCwVciIVJgQ3", "tUpRR");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[7]] = lIIlIllIIIIIIll("AykJ", "NFqxc");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[8]] = lIIlIllIIIIIIll("GSgKaCE1NAYt", "TGrHQ");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[9]] = lIIlIllIIIIIIlI("v+cK87BWrtMYLbNEJzv9hw==", "zrzfR");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[10]] = lIIlIllIIIIIIIl("mokpTMXzvRUFbiL0HFsdAw==", "weooE");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[11]] = lIIlIllIIIIIIlI("8LD/bFAqNyIQsDQA23RLyQ==", "OZVfO");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[12]] = lIIlIllIIIIIIlI("437facKfAYo=", "fByzR");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[13]] = lIIlIllIIIIIIll("JQoOZTwJFgIg", "hevEL");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[14]] = lIIlIllIIIIIIIl("8+cOMGtIIn8dSKvjq7+cWQ==", "nKrCa");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[15]] = lIIlIllIIIIIIll("GyAraB87ND4t", "ZGJHo");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[16]] = lIIlIllIIIIIIlI("8Z6xpR7g0XqNN9V7E2+x2g==", "rrTNw");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[17]] = lIIlIllIIIIIIlI("bZCzrFIjT9T/h4pnulKE4Q==", "Xjrcb");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[18]] = lIIlIllIIIIIIlI("rjVDyq6xtf4=", "iqkNG");
        lIIIIIIIIIIII[lIIIIIIIIIIIl[19]] = lIIlIllIIIIIIll("Bx0cBCQ8CA==", "HmyvE");
    }

    private static String lIIlIllIIIIIIIl(String lllllllllllllllIIlIIIIIlIlIlIlII, String lllllllllllllllIIlIIIIIlIlIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIlIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIIIIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIIIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIlIlIlIlIl) {
            lllllllllllllllIIlIIIIIlIlIlIlIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public m(SquireMixologyConfig squireMixologyConfig) {
        this.W = squireMixologyConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    private boolean d(int i) {
        int[] iArr = new int[lIIIIIIIIIIIl[2]];
        iArr[lIIIIIIIIIIIl[0]] = i;
        if (lIIlIllIIIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
            if (lIIlIllIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                SquireMixology.g = lIIIIIIIIIIII[lIIIIIIIIIIIl[10]];
                String[] strArr = new String[lIIIIIIIIIIIl[2]];
                strArr[lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[11]];
                TileObjects.getNearest(strArr).interact(lIIIIIIIIIIII[lIIIIIIIIIIIl[12]]);
                return lIIIIIIIIIIIl[0];
            } else if (lIIlIllIIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                SquireMixology.g = "Withdrawing " + i;
                String[] strArr2 = new String[lIIIIIIIIIIIl[4]];
                strArr2[lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[13]];
                strArr2[lIIIIIIIIIIIl[2]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[14]];
                strArr2[lIIIIIIIIIIIl[3]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[15]];
                Bank.depositAllExcept(strArr2);
                int[] iArr2 = new int[lIIIIIIIIIIIl[2]];
                iArr2[lIIIIIIIIIIIl[0]] = i;
                if (lIIlIllIIIIIllI(Bank.contains(iArr2) ? 1 : 0)) {
                    SquireMixology.j = lIIIIIIIIIIIl[0];
                    return lIIIIIIIIIIIl[0];
                }
                int[] iArr3 = new int[lIIIIIIIIIIIl[2]];
                iArr3[lIIIIIIIIIIIl[0]] = i;
                if (lIIlIllIIIIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
                    Bank.withdrawAll(i, Bank.WithdrawMode.ITEM);
                }
                int[] iArr4 = new int[lIIIIIIIIIIIl[2]];
                iArr4[lIIIIIIIIIIIl[0]] = i;
                if (!lIIlIllIIIIIllI(Bank.contains(iArr4) ? 1 : 0)) {
                    Bank.withdrawAll(i, Bank.WithdrawMode.ITEM);
                    return lIIIIIIIIIIIl[0];
                }
                SquireMixology.g = lIIIIIIIIIIII[lIIIIIIIIIIIl[16]];
                System.out.println("Out of " + i);
                return lIIIIIIIIIIIl[0];
            }
        }
        int[] iArr5 = new int[lIIIIIIIIIIIl[2]];
        iArr5[lIIIIIIIIIIIl[0]] = i;
        if (lIIlIllIIIIlIlI(Inventory.contains(iArr5) ? 1 : 0)) {
            SquireMixology.g = lIIIIIIIIIIII[lIIIIIIIIIIIl[17]];
            String[] strArr3 = new String[lIIIIIIIIIIIl[2]];
            strArr3[lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[18]];
            TileObjects.getNearest(strArr3).interact(lIIIIIIIIIIII[lIIIIIIIIIIIl[19]]);
            return lIIIIIIIIIIIl[0];
        }
        return lIIIIIIIIIIIl[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean d() {
        b[] values = b.values();
        int length = values.length;
        int i = lIIIIIIIIIIIl[0];
        while (lIIlIllIIIIIlll(i, length)) {
            b bVar = values[i];
            String[] strArr = new String[lIIIIIIIIIIIl[2]];
            strArr[lIIIIIIIIIIIl[0]] = bVar.a();
            if (lIIlIllIIIIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
                System.out.println("Found herb in inventory: " + bVar.a());
                return lIIIIIIIIIIIl[2];
            }
            i++;
            "".length();
            if ("   ".length() < "   ".length()) {
                return ((((163 + 53) - 57) + 55) ^ (((34 + 53) - (-23)) + 31)) & (((((154 + 52) - 18) + 29) ^ (((79 + 34) - 82) + 99)) ^ (-" ".length()));
            }
        }
        return lIIIIIIIIIIIl[0];
    }

    private static boolean lIIlIllIIIIlIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIllIIIIlIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIllIIIIlIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIllIIIIlIlI(int i) {
        return i != 0;
    }

    private static String lIIlIllIIIIIIlI(String lllllllllllllllIIlIIIIIlIlIIIlll, String lllllllllllllllIIlIIIIIlIlIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIlIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIIIIIIl[3], lllllllllllllllIIlIIIIIlIlIIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIlIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIlIlIIlIII) {
            lllllllllllllllIIlIIIIIlIlIIlIII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIllIIIIIlIl() {
        lIIIIIIIIIIIl = new int[21];
        lIIIIIIIIIIIl[0] = (71 ^ 66) & ((40 ^ 45) ^ (-1));
        lIIIIIIIIIIIl[1] = (-((-3603) & 24375)) & (-530) & 32637;
        lIIIIIIIIIIIl[2] = " ".length();
        lIIIIIIIIIIIl[3] = "  ".length();
        lIIIIIIIIIIIl[4] = "   ".length();
        lIIIIIIIIIIIl[5] = 160 ^ 164;
        lIIIIIIIIIIIl[6] = (61 ^ 26) ^ (42 ^ 8);
        lIIIIIIIIIIIl[7] = 99 ^ 101;
        lIIIIIIIIIIIl[8] = 29 ^ 26;
        lIIIIIIIIIIIl[9] = 185 ^ 177;
        lIIIIIIIIIIIl[10] = 65 ^ 72;
        lIIIIIIIIIIIl[11] = (((112 + 66) - 68) + 57) ^ (((32 + 55) - 66) + 152);
        lIIIIIIIIIIIl[12] = (38 ^ 4) ^ (44 ^ 5);
        lIIIIIIIIIIIl[13] = 123 ^ 119;
        lIIIIIIIIIIIl[14] = (((102 + 125) - 156) + 76) ^ (((55 + 104) - 3) + 2);
        lIIIIIIIIIIIl[15] = 77 ^ 67;
        lIIIIIIIIIIIl[16] = (57 ^ 36) ^ (15 ^ 29);
        lIIIIIIIIIIIl[17] = 208 ^ 192;
        lIIIIIIIIIIIl[18] = 73 ^ 88;
        lIIIIIIIIIIIl[19] = 62 ^ 44;
        lIIIIIIIIIIIl[20] = 76 ^ 95;
    }

    private static boolean lIIlIllIIIIIlll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v108, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public boolean run() {
        if (!lIIlIllIIIIIllI(s.e() ? 1 : 0) && !lIIlIllIIIIIlll(Vars.getBit(lIIIIIIIIIIIl[1]), lIIIIIIIIIIIl[2])) {
            if (lIIlIllIIIIlIII(this.W.pluginMode(), d.CREATE_PASTE) && lIIlIllIIIIIllI(SquireMixology.j ? 1 : 0)) {
                return lIIIIIIIIIIIl[0];
            }
            if (lIIlIllIIIIlIIl(this.W.pluginMode(), d.CREATE_PASTE) && lIIlIllIIIIIllI(d(this.W.herbPaste().b()) ? 1 : 0)) {
                return lIIIIIIIIIIIl[0];
            }
            if (lIIlIllIIIIlIIl(this.W.pluginMode(), d.MINIGAME) && lIIlIllIIIIlIlI(SquireMixology.j ? 1 : 0)) {
                if (lIIlIllIIIIlIlI(SquireMixology.q.equalsIgnoreCase(lIIIIIIIIIIII[lIIIIIIIIIIIl[0]]) ? 1 : 0)) {
                    String[] strArr = new String[lIIIIIIIIIIIl[2]];
                    strArr[lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[2]];
                    if (lIIlIllIIIIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIIIIIIIIIIl[2]];
                        strArr2[lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[3]];
                        if (lIIlIllIIIIlIll(Inventory.getFirst(strArr2).getQuantity(), this.W.stopAt3000()) && lIIlIllIIIIIllI(d() ? 1 : 0)) {
                            SquireMixology.j = lIIIIIIIIIIIl[0];
                            return lIIIIIIIIIIIl[0];
                        }
                    }
                    if (lIIlIllIIIIIllI(d(this.W.agaHerb().b()) ? 1 : 0)) {
                        return lIIIIIIIIIIIl[0];
                    }
                }
                if (lIIlIllIIIIlIlI(SquireMixology.q.equalsIgnoreCase(lIIIIIIIIIIII[lIIIIIIIIIIIl[4]]) ? 1 : 0)) {
                    String[] strArr3 = new String[lIIIIIIIIIIIl[2]];
                    strArr3[lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[5]];
                    if (lIIlIllIIIIlIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                        String[] strArr4 = new String[lIIIIIIIIIIIl[2]];
                        strArr4[lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[6]];
                        if (lIIlIllIIIIlIll(Inventory.getFirst(strArr4).getQuantity(), this.W.stopAt3000()) && lIIlIllIIIIIllI(d() ? 1 : 0)) {
                            SquireMixology.j = lIIIIIIIIIIIl[0];
                            return lIIIIIIIIIIIl[0];
                        }
                    }
                    if (lIIlIllIIIIIllI(d(this.W.lyeHerb().b()) ? 1 : 0)) {
                        return lIIIIIIIIIIIl[0];
                    }
                }
                if (lIIlIllIIIIlIlI(SquireMixology.q.equalsIgnoreCase(lIIIIIIIIIIII[lIIIIIIIIIIIl[7]]) ? 1 : 0)) {
                    String[] strArr5 = new String[lIIIIIIIIIIIl[2]];
                    strArr5[lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[8]];
                    if (lIIlIllIIIIlIlI(Inventory.contains(strArr5) ? 1 : 0)) {
                        String[] strArr6 = new String[lIIIIIIIIIIIl[2]];
                        strArr6[lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[9]];
                        if (lIIlIllIIIIlIll(Inventory.getFirst(strArr6).getQuantity(), this.W.stopAt3000()) && lIIlIllIIIIIllI(d() ? 1 : 0)) {
                            SquireMixology.j = lIIIIIIIIIIIl[0];
                            return lIIIIIIIIIIIl[0];
                        }
                    }
                    if (lIIlIllIIIIIllI(d(this.W.moxHerb().b()) ? 1 : 0)) {
                        return lIIIIIIIIIIIl[0];
                    }
                }
            }
            return lIIIIIIIIIIIl[0];
        }
        return lIIIIIIIIIIIl[0];
    }

    private static boolean lIIlIllIIIIIllI(int i) {
        return i == 0;
    }

    private static String lIIlIllIIIIIIll(String lllllllllllllllIIlIIIIIlIIllIlll, String lllllllllllllllIIlIIIIIlIIllIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIlIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIIIlIIllIlIl = new StringBuilder();
        char[] lllllllllllllllIIlIIIIIlIIllIlII = lllllllllllllllIIlIIIIIlIIllIIIl.toCharArray();
        int lllllllllllllllIIlIIIIIlIIllIIll = lIIIIIIIIIIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIIIIIIIIIl[0];
        while (lIIlIllIIIIIlll(i, length)) {
            lllllllllllllllIIlIIIIIlIIllIlIl.append((char) (charArray[i] ^ lllllllllllllllIIlIIIIIlIIllIlII[lllllllllllllllIIlIIIIIlIIllIIll % lllllllllllllllIIlIIIIIlIIllIlII.length]));
            "".length();
            lllllllllllllllIIlIIIIIlIIllIIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIIIIlIIllIlIl);
    }
}
