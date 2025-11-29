package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Updating state", priority = 2147482310)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.B  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/B.class */
public class B extends AbstractC0000a {
    private static /* synthetic */ String[] lIIlllIIIIlII;
    private static /* synthetic */ int[] lIIlllIIIIlIl;

    private static boolean lIllIIlIIlIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIllIIlIIlIIlIl() {
        lIIlllIIIIlII = new String[lIIlllIIIIlIl[10]];
        lIIlllIIIIlII[lIIlllIIIIlIl[0]] = lIllIIlIIlIIIlI("vbY12MJdkMg=", "vQrQe");
        lIIlllIIIIlII[lIIlllIIIIlIl[1]] = lIllIIlIIlIIIll("DAw1", "ImArd");
        lIIlllIIIIlII[lIIlllIIIIlIl[2]] = lIllIIlIIlIIIlI("w438ekuZI7o=", "IMJRO");
        lIIlllIIIIlII[lIIlllIIIIlIl[4]] = lIllIIlIIlIIIlI("ugZrvtgcxgE=", "WSLgv");
        lIIlllIIIIlII[lIIlllIIIIlIl[5]] = lIllIIlIIlIIlII("oSquF+WXEtM=", "ZYxwh");
        lIIlllIIIIlII[lIIlllIIIIlIl[6]] = lIllIIlIIlIIIll("NwkE", "rhpyF");
        lIIlllIIIIlII[lIIlllIIIIlIl[7]] = lIllIIlIIlIIlII("g8gpiVYM2/4=", "whvgt");
        lIIlllIIIIlII[lIIlllIIIIlIl[8]] = lIllIIlIIlIIIlI("KktZkS4zXsI=", "vXRIm");
        lIIlllIIIIlII[lIIlllIIIIlIl[9]] = lIllIIlIIlIIIll("Hgg2HQ==", "QxSsx");
    }

    private static String lIllIIlIIlIIIll(String llllllllllllllIlllIllIlIIlllIIIl, String llllllllllllllIlllIllIlIIlllIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllIlIIlllIIII.toCharArray();
        int llllllllllllllIlllIllIlIIllIllIl = lIIlllIIIIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIIIIlIl[0];
        while (lIllIIlIIlIlllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIllIlIIllIllIl % charArray.length]));
            "".length();
            llllllllllllllIlllIllIlIIllIllIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIlIIlIlIlI(int i) {
        return i > 0;
    }

    private static boolean lIllIIlIIlIlIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIllIIlIIlIIlII(String llllllllllllllIlllIllIlIIlIlllII, String llllllllllllllIlllIllIlIIlIllIll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIlIIlIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIlIIlIllllI.init(lIIlllIIIIlIl[2], llllllllllllllIlllIllIlIIlIlllll);
            return new String(llllllllllllllIlllIllIlIIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlIIlIlllIl) {
            llllllllllllllIlllIllIlIIlIlllIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIlIIllI() {
        lIIlllIIIIlIl = new int[11];
        lIIlllIIIIlIl[0] = ((171 ^ 134) ^ " ".length()) & (((12 ^ 103) ^ (63 ^ 120)) ^ (-" ".length()));
        lIIlllIIIIlIl[1] = " ".length();
        lIIlllIIIIlIl[2] = "  ".length();
        lIIlllIIIIlIl[3] = (-2409) & 23551;
        lIIlllIIIIlIl[4] = "   ".length();
        lIIlllIIIIlIl[5] = (((90 + 157) - 221) + 145) ^ (((15 + 118) - 39) + 81);
        lIIlllIIIIlIl[6] = (47 ^ 37) ^ (18 ^ 29);
        lIIlllIIIIlIl[7] = 56 ^ 62;
        lIIlllIIIIlIl[8] = 62 ^ 57;
        lIIlllIIIIlIl[9] = 155 ^ 147;
        lIIlllIIIIlIl[10] = (130 ^ 188) ^ (148 ^ 163);
    }

    private static boolean lIllIIlIIlIlllI(int i, int i2) {
        return i < i2;
    }

    private static String lIllIIlIIlIIIlI(String llllllllllllllIlllIllIlIIlIIllll, String llllllllllllllIlllIllIlIIlIIllII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIIlIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIIlIIllII.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIlIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIIIlIl[2], llllllllllllllIlllIllIlIIlIlIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlIIlIlIIII) {
            llllllllllllllIlllIllIlIIlIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlIlIIl(Object obj) {
        return obj != null;
    }

    static {
        lIllIIlIIlIIllI();
        lIllIIlIIlIIlIl();
    }

    @Inject
    public B(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIlIIlIlIII(int i) {
        return i == 0;
    }

    private static boolean lIllIIlIIlIllIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIIlIIlIIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v36, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.AbstractC0000a
    public boolean l() {
        int i;
        int i2;
        if (!lIllIIlIIlIIlll(this.p.depositSeedVault() ? 1 : 0) && !lIllIIlIIlIlIII(this.p.pickpocketFoodAmount()) && !lIllIIlIIlIIlll(this.o.j() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                if (lIllIIlIIlIIlll(item.getName().toLowerCase().contains(lIIlllIIIIlII[lIIlllIIIIlIl[8]]) ? 1 : 0)) {
                    String[] strArr = new String[lIIlllIIIIlIl[1]];
                    strArr[lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[9]];
                    if (lIllIIlIIlIIlll(item.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIIlllIIIIlIl[1];
                        "".length();
                        return (-" ".length()) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIIlllIIIIlIl[0];
            });
            if (lIllIIlIIlIIlll(this.p.gemBag() ? 1 : 0) && lIllIIlIIlIlIIl(first)) {
                first.interact(lIIlllIIIIlII[lIIlllIIIIlIl[0]]);
            }
            if (lIllIIlIIlIIlll(Inventory.contains(item2 -> {
                String[] strArr = new String[lIIlllIIIIlIl[1]];
                strArr[lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[6]];
                if (lIllIIlIIlIlIII(item2.hasAction(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIlllIIIIlIl[1]];
                    strArr2[lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[7]];
                    if (!lIllIIlIIlIIlll(item2.hasAction(strArr2) ? 1 : 0)) {
                        return lIIlllIIIIlIl[0];
                    }
                }
                ?? r0 = lIIlllIIIIlIl[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }) ? 1 : 0) && lIllIIlIIlIlIlI(Combat.getMissingHealth())) {
                i = lIIlllIIIIlIl[1];
                "".length();
                if ("   ".length() <= (((((41 + 3) - (-51)) + 71) ^ (((60 + 74) - 46) + 91)) & (((((101 + 38) - 120) + 148) ^ (((72 + 147) - 159) + 118)) ^ (-" ".length())))) {
                    return ((39 ^ 115) ^ (54 ^ 38)) & (((67 ^ 109) ^ (169 ^ 195)) ^ (-" ".length()));
                }
            } else {
                i = lIIlllIIIIlIl[0];
            }
            int i3 = i;
            if (!lIllIIlIIlIlIll(this.p.pickpocketTarget(), EnumC0005f.VYRE) || lIllIIlIIlIllII(this.p.pickpocketTarget(), EnumC0005f.ELF)) {
                i2 = lIIlllIIIIlIl[1];
                "".length();
                if ((((((173 + 22) - 24) + 20) ^ (((30 + 66) - (-29)) + 38)) & (((39 ^ 85) ^ (83 ^ 61)) ^ (-" ".length()))) == ((((22 + 105) - 102) + 109) ^ (((90 + 84) - 61) + 17))) {
                    return ((63 ^ 34) ^ (86 ^ 90)) & (((93 ^ 36) ^ (85 ^ 61)) ^ (-" ".length()));
                }
            } else {
                i2 = lIIlllIIIIlIl[0];
            }
            if (lIllIIlIIlIIlll(i2) && lIllIIlIIlIllIl(Inventory.getFreeSlots(), lIIlllIIIIlIl[2])) {
                if (!lIllIIlIIlIIlll(i3)) {
                    this.o.b((boolean) lIIlllIIIIlIl[1]);
                    return lIIlllIIIIlIl[1];
                }
                Item first2 = Inventory.getFirst(item3 -> {
                    String[] strArr = new String[lIIlllIIIIlIl[1]];
                    strArr[lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[4]];
                    if (lIllIIlIIlIlIII(item3.hasAction(strArr) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIlllIIIIlIl[1]];
                        strArr2[lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[5]];
                        if (!lIllIIlIIlIIlll(item3.hasAction(strArr2) ? 1 : 0)) {
                            return lIIlllIIIIlIl[0];
                        }
                    }
                    ?? r0 = lIIlllIIIIlIl[1];
                    "".length();
                    return 0 != 0 ? ((105 ^ 97) ^ (252 ^ 163)) & (((((119 + 175) - 69) + 11) ^ (((102 + 161) - 143) + 67)) ^ (-" ".length())) : r0;
                });
                String[] strArr = new String[lIIlllIIIIlIl[2]];
                strArr[lIIlllIIIIlIl[0]] = lIIlllIIIIlII[lIIlllIIIIlIl[1]];
                strArr[lIIlllIIIIlIl[1]] = lIIlllIIIIlII[lIIlllIIIIlIl[2]];
                first2.interact(strArr);
                return lIIlllIIIIlIl[1];
            } else if (lIllIIlIIlIIlll(Inventory.isFull() ? 1 : 0)) {
                this.o.b((boolean) lIIlllIIIIlIl[1]);
                return lIIlllIIIIlIl[1];
            } else {
                if (lIllIIlIIlIlIll(this.p.pickpocketFood(), EnumC0004e.NONE)) {
                    int[] iArr = new int[lIIlllIIIIlIl[1]];
                    iArr[lIIlllIIIIlIl[0]] = this.p.pickpocketFood().x();
                    if (lIllIIlIIlIlIII(Inventory.contains(iArr) ? 1 : 0) && lIllIIlIIlIllIl(Combat.getCurrentHealth(), this.p.eatHP())) {
                        this.o.b((boolean) lIIlllIIIIlIl[1]);
                        return lIIlllIIIIlIl[1];
                    }
                }
                if (lIllIIlIIlIIlll(this.p.dodgyNecklace() ? 1 : 0)) {
                    int[] iArr2 = new int[lIIlllIIIIlIl[1]];
                    iArr2[lIIlllIIIIlIl[0]] = lIIlllIIIIlIl[3];
                    if (lIllIIlIIlIlIII(Inventory.contains(iArr2) ? 1 : 0)) {
                        this.o.b((boolean) lIIlllIIIIlIl[1]);
                        return lIIlllIIIIlIl[1];
                    }
                }
                return lIIlllIIIIlIl[0];
            }
        }
        return lIIlllIIIIlIl[0];
    }
}
