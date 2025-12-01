package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Healing up", priority = 1000)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.D  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/D.class */
public class D extends AbstractC0000a {
    private static /* synthetic */ int[] lIIlllIIIlIIl;
    public static final /* synthetic */ Predicate<String> av;
    private static /* synthetic */ String[] lIIlllIIIlIII;

    private static String lIllIIlIIllIllI(String llllllllllllllIlllIllIIllllIIIll, String llllllllllllllIlllIllIIllllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllllIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlIIl[8]), "DES");
            Cipher llllllllllllllIlllIllIIllllIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIllIIllllIIlIl.init(lIIlllIIIlIIl[5], secretKeySpec);
            return new String(llllllllllllllIlllIllIIllllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIllllIIlII) {
            llllllllllllllIlllIllIIllllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlllIlI(int i) {
        return i != 0;
    }

    private static boolean lIllIIlIlIIIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIlIlIIIIll(int i, int i2) {
        return i < i2;
    }

    private static String lIllIIlIIllIlll(String llllllllllllllIlllIllIIlllIlIIll, String llllllllllllllIlllIllIIlllIlIIlI) {
        String llllllllllllllIlllIllIIlllIlIIll2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIlllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIlllIlIIIl = new StringBuilder();
        char[] llllllllllllllIlllIllIIlllIlIIII = llllllllllllllIlllIllIIlllIlIIlI.toCharArray();
        int llllllllllllllIlllIllIIlllIIllll = lIIlllIIIlIIl[0];
        char[] charArray = llllllllllllllIlllIllIIlllIlIIll2.toCharArray();
        int length = charArray.length;
        int i = lIIlllIIIlIIl[0];
        while (lIllIIlIlIIIIll(i, length)) {
            char llllllllllllllIlllIllIIlllIlIlII = charArray[i];
            llllllllllllllIlllIllIIlllIlIIIl.append((char) (llllllllllllllIlllIllIIlllIlIlII ^ llllllllllllllIlllIllIIlllIlIIII[llllllllllllllIlllIllIIlllIIllll % llllllllllllllIlllIllIIlllIlIIII.length]));
            "".length();
            llllllllllllllIlllIllIIlllIIllll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIllIIlllIlIIIl);
    }

    private static boolean lIllIIlIIllllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIlIIllllll(int i, int i2) {
        return i <= i2;
    }

    @Inject
    public D(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIlIIlllllI(int i) {
        return i > 0;
    }

    private static boolean lIllIIlIlIIIIlI(int i) {
        return i == 0;
    }

    static {
        lIllIIlIIlllIIl();
        lIllIIlIIlllIII();
        av = str -> {
            if (!lIllIIlIlIIIIIl(str) || (lIllIIlIlIIIIlI(str.equals(lIIlllIIIlIII[lIIlllIIIlIIl[6]]) ? 1 : 0) && !lIllIIlIIlllIlI(str.equals(lIIlllIIIlIII[lIIlllIIIlIIl[7]]) ? 1 : 0))) {
                return lIIlllIIIlIIl[0];
            }
            ?? r0 = lIIlllIIIlIIl[1];
            "".length();
            return "   ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean K() {
        Item first = Inventory.getFirst(item -> {
            if (lIllIIlIlIIIIIl(item.getActions()) && lIllIIlIIlllIlI(item.hasAction(av) ? 1 : 0) && lIllIIlIlIIIIlI(item.getName().equals(lIIlllIIIlIII[lIIlllIIIlIIl[1]]) ? 1 : 0)) {
                ?? r0 = lIIlllIIIlIIl[1];
                "".length();
                return ((((49 + 4) - (-42)) + 87) ^ (((157 + 68) - 150) + 103)) <= "  ".length() ? ((179 ^ 193) ^ (106 ^ 53)) & (((75 ^ 50) ^ (93 ^ 9)) ^ (-" ".length())) : r0;
            }
            return lIIlllIIIlIIl[0];
        });
        if (lIllIIlIlIIIIII(first)) {
            return lIIlllIIIlIIl[0];
        }
        first.interact(av);
        return lIIlllIIIlIIl[1];
    }

    private static boolean lIllIIlIIlllIll(int i) {
        return i <= 0;
    }

    private static boolean lIllIIlIlIIIIIl(Object obj) {
        return obj != null;
    }

    private static void lIllIIlIIlllIIl() {
        lIIlllIIIlIIl = new int[9];
        lIIlllIIIlIIl[0] = (96 ^ 75) & ((157 ^ 182) ^ (-1));
        lIIlllIIIlIIl[1] = " ".length();
        lIIlllIIIlIIl[2] = (-4365) & 29149;
        lIIlllIIIlIIl[3] = 40 ^ 45;
        lIIlllIIIlIIl[4] = 136 ^ 142;
        lIIlllIIIlIIl[5] = "  ".length();
        lIIlllIIIlIIl[6] = "   ".length();
        lIIlllIIIlIIl[7] = 158 ^ 154;
        lIIlllIIIlIIl[8] = 18 ^ 26;
    }

    private static boolean lIllIIlIIllllII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.AbstractC0000a
    public boolean l() {
        int i;
        if (lIllIIlIIlllIlI(Bank.isOpen() ? 1 : 0)) {
            return lIIlllIIIlIIl[0];
        }
        if (lIllIIlIIlllIll(Inventory.getCount(item -> {
            if (lIllIIlIIlllIlI(item.hasAction(av) ? 1 : 0) && lIllIIlIlIIIIlI(item.getName().equals(lIIlllIIIlIII[lIIlllIIIlIIl[5]]) ? 1 : 0)) {
                ?? r0 = lIIlllIIIlIIl[1];
                "".length();
                return "   ".length() <= "  ".length() ? ((((21 + 4) - (-163)) + 53) ^ (((141 + 112) - 139) + 55)) & (((89 ^ 74) ^ (255 ^ 180)) ^ (-" ".length())) : r0;
            }
            return lIIlllIIIlIIl[0];
        })) && lIllIIlIIllllII(this.p.pickpocketFood(), EnumC0004e.NONE)) {
            return lIIlllIIIlIIl[0];
        }
        int[] iArr = new int[lIIlllIIIlIIl[1]];
        iArr[lIIlllIIIlIIl[0]] = lIIlllIIIlIIl[2];
        if (lIllIIlIIlllIlI(Inventory.contains(iArr) ? 1 : 0) && lIllIIlIIllllIl(Combat.getMissingHealth(), lIIlllIIIlIIl[3])) {
            int[] iArr2 = new int[lIIlllIIIlIIl[1]];
            iArr2[lIIlllIIIlIIl[0]] = lIIlllIIIlIIl[2];
            Inventory.getFirst(iArr2).interact(lIIlllIIIlIII[lIIlllIIIlIIl[0]]);
            return lIIlllIIIlIIl[1];
        } else if (!lIllIIlIIlllIlI(this.p.redemptionHeal() ? 1 : 0) || !lIllIIlIIlllllI(Prayers.getPoints())) {
            return lIllIIlIIllllll(Combat.getCurrentHealth(), this.p.eatHP()) ? K() : lIIlllIIIlIIl[0];
        } else {
            if (lIllIIlIIllllll(Combat.getCurrentHealth(), lIIlllIIIlIIl[4])) {
                i = lIIlllIIIlIIl[1];
                "".length();
                if ((((((153 + 75) - 179) + 119) ^ (((130 + 112) - 176) + 69)) & (((80 ^ 87) ^ (37 ^ 13)) ^ (-" ".length()))) != 0) {
                    return (((60 ^ 16) & ((90 ^ 118) ^ (-1))) ^ (85 ^ 72)) & (((37 ^ 66) ^ (220 ^ 166)) ^ (-" ".length()));
                }
            } else {
                i = lIIlllIIIlIIl[0];
            }
            return lIllIIlIIlllIlI(i) ? K() : lIIlllIIIlIIl[0];
        }
    }

    private static void lIllIIlIIlllIII() {
        lIIlllIIIlIII = new String[lIIlllIIIlIIl[3]];
        lIIlllIIIlIII[lIIlllIIIlIIl[0]] = lIllIIlIIllIlIl("YXUVfNRfqg4=", "IeEZA");
        lIIlllIIIlIII[lIIlllIIIlIIl[1]] = lIllIIlIIllIlIl("TBN3WMsXcq1OE0/f+HlLvg==", "xJjdr");
        lIIlllIIIlIII[lIIlllIIIlIIl[5]] = lIllIIlIIllIllI("KTsYUAmNLEyChfSRFFzXfA==", "XYkrK");
        lIIlllIIIlIII[lIIlllIIIlIIl[6]] = lIllIIlIIllIlll("PCA4", "yALqR");
        lIIlllIIIlIII[lIIlllIIIlIIl[7]] = lIllIIlIIllIlll("FD4vPCk=", "PLFRB");
    }

    private static String lIllIIlIIllIlIl(String llllllllllllllIlllIllIIlllllIIII, String llllllllllllllIlllIllIIllllIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIlllllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIlllllIIlI.init(lIIlllIIIlIIl[5], secretKeySpec);
            return new String(llllllllllllllIlllIllIIlllllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIlllllIIIl) {
            llllllllllllllIlllIllIIlllllIIIl.printStackTrace();
            return null;
        }
    }
}
