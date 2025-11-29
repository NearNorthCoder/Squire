package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.RunePouch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.l  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/l.class */
public class C0015l {
    private static /* synthetic */ int[] llllIIIIIlIl;
    private static /* synthetic */ String[] llllIIIIIlII;
    private static final /* synthetic */ Logger bP;

    private static boolean lIIIlllIlIIllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlllIlIIllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean bi() {
        List<Item> all = Inventory.getAll(item -> {
            if (lIIIlllIlIIlllI(item.getName().toLowerCase().endsWith(llllIIIIIlII[llllIIIIIlIl[7]]) ? 1 : 0) && lIIIlllIlIlIIII(item.getQuantity(), llllIIIIIlIl[8])) {
                ?? r0 = llllIIIIIlIl[3];
                "".length();
                return (-((46 ^ 52) ^ (110 ^ 112))) >= 0 ? ((((12 + 177) - 111) + 118) ^ (((159 + 103) - 239) + 142)) & (((85 ^ 45) ^ (155 ^ 130)) ^ (-" ".length())) : r0;
            }
            return llllIIIIIlIl[0];
        });
        Item first = Inventory.getFirst(item2 -> {
            return item2.getName().toLowerCase().contains(llllIIIIIlII[llllIIIIIlIl[6]]);
        });
        if (lIIIlllIlIIlllI(bh() ? 1 : 0) && lIIIlllIlIIlIll(all.isEmpty() ? 1 : 0) && !lIIIlllIlIIllIl(first)) {
            for (Item item3 : all) {
                if (lIIIlllIlIIlIll(a(item3.getName()) ? 1 : 0)) {
                    item3.useOn(first);
                }
                "".length();
                if (0 != 0) {
                    return ((125 ^ 22) ^ (251 ^ 181)) & (((125 ^ 27) ^ (24 ^ 91)) ^ (-" ".length()));
                }
            }
            return llllIIIIIlIl[3];
        }
        return llllIIIIIlIl[0];
    }

    private static boolean lIIIlllIlIIlIlI(Object obj) {
        return obj != null;
    }

    static {
        lIIIlllIlIIlIIl();
        lIIIlllIlIIlIII();
        bP = LoggerFactory.getLogger(C0015l.class);
    }

    private static boolean lIIIlllIlIIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIlllIlIIlIll(int i) {
        return i == 0;
    }

    public String toString() {
        return llllIIIIIlII[llllIIIIIlIl[1]];
    }

    private static boolean lIIIlllIlIlIIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIlllIlIIlllI(int i) {
        return i != 0;
    }

    private static void lIIIlllIlIIlIIl() {
        llllIIIIIlIl = new int[12];
        llllIIIIIlIl[0] = ((126 ^ 71) ^ (186 ^ 178)) & (((((44 + 89) - 34) + 48) ^ (((39 + 126) - 46) + 43)) ^ (-" ".length()));
        llllIIIIIlIl[1] = "   ".length();
        llllIIIIIlIl[2] = 15 ^ 11;
        llllIIIIIlIl[3] = " ".length();
        llllIIIIIlIl[4] = "  ".length();
        llllIIIIIlIl[5] = 159 ^ 154;
        llllIIIIIlIl[6] = 68 ^ 66;
        llllIIIIIlIl[7] = 174 ^ 169;
        llllIIIIIlIl[8] = (-16692) & 32691;
        llllIIIIIlIl[9] = 29 ^ 21;
        llllIIIIIlIl[10] = 204 ^ 197;
        llllIIIIIlIl[11] = (111 ^ 27) ^ (255 ^ 129);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    public static boolean bh() {
        RunePouch.RuneSlot[] values = RunePouch.RuneSlot.values();
        int i = llllIIIIIlIl[0];
        if (lIIIlllIlIIlIlI(Inventory.getFirst(item -> {
            return item.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[10]]);
        }))) {
            i = llllIIIIIlIl[1];
        }
        if (lIIIlllIlIIlIlI(Inventory.getFirst(item2 -> {
            return item2.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[9]]);
        }))) {
            i = llllIIIIIlIl[2];
        }
        if (lIIIlllIlIIlIll(i)) {
            return llllIIIIIlIl[0];
        }
        bP.debug(llllIIIIIlII[llllIIIIIlIl[0]], Integer.valueOf(values.length), Arrays.stream(values).collect(Collectors.toList()));
        int lllllllllllllllIIllIIIIlllllllII = llllIIIIIlIl[0];
        while (lIIIlllIlIIllII(lllllllllllllllIIllIIIIlllllllII, i)) {
            if (lIIIlllIlIIllIl(values[lllllllllllllllIIllIIIIlllllllII].getRuneName())) {
                bP.debug(llllIIIIIlII[llllIIIIIlIl[3]], Integer.valueOf(lllllllllllllllIIllIIIIlllllllII));
                return llllIIIIIlIl[3];
            }
            lllllllllllllllIIllIIIIlllllllII++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llllIIIIIlIl[0];
    }

    public int hashCode() {
        int i = llllIIIIIlIl[3];
        return llllIIIIIlIl[3];
    }

    private static String lIIIlllIlIIIllI(String lllllllllllllllIIllIIIIlllIIlIlI, String lllllllllllllllIIllIIIIlllIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIlllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIlllIIlIIl.getBytes(StandardCharsets.UTF_8)), llllIIIIIlIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIIIlIl[4], lllllllllllllllIIllIIIIlllIIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIlllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIlllIIlIll) {
            lllllllllllllllIIllIIIIlllIIlIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIlIIIlIl(String lllllllllllllllIIllIIIIllIlllIlI, String lllllllllllllllIIllIIIIllIlllIIl) {
        String lllllllllllllllIIllIIIIllIlllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIIllIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIIIllIlllIIl.toCharArray();
        int lllllllllllllllIIllIIIIllIllIllI = llllIIIIIlIl[0];
        char[] charArray2 = lllllllllllllllIIllIIIIllIlllIlI2.toCharArray();
        int lllllllllllllllIIllIIIIllIlIllll = charArray2.length;
        int i = llllIIIIIlIl[0];
        while (lIIIlllIlIIllII(i, lllllllllllllllIIllIIIIllIlIllll)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIIIIllIllIllI % charArray.length]));
            "".length();
            lllllllllllllllIIllIIIIllIllIllI++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean equals(Object obj) {
        if (lIIIlllIlIIllll(obj, this)) {
            return llllIIIIIlIl[3];
        }
        if (!lIIIlllIlIIlIll(obj instanceof C0015l ? 1 : 0) && !lIIIlllIlIIlIll(((C0015l) obj).a(this) ? 1 : 0)) {
            return llllIIIIIlIl[3];
        }
        return llllIIIIIlIl[0];
    }

    protected boolean a(Object obj) {
        return obj instanceof C0015l;
    }

    private static String lIIIlllIlIIIlll(String lllllllllllllllIIllIIIIlllIlIlll, String lllllllllllllllIIllIIIIlllIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIlllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIlllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIIIlIl[4], lllllllllllllllIIllIIIIlllIllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIlllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIlllIllIII) {
            lllllllllllllllIIllIIIIlllIllIII.printStackTrace();
            return null;
        }
    }

    private static void lIIIlllIlIIlIII() {
        llllIIIIIlII = new String[llllIIIIIlIl[11]];
        llllIIIIIlII[llllIIIIIlIl[0]] = lIIIlllIlIIIlIl("NjQbIz1lZVQsM2UjCQ==", "EXtWN");
        llllIIIIIlII[llllIIIIIlIl[3]] = lIIIlllIlIIIllI("KkhNT8+3irxc7UZh2K0/gXlvQlbPRoiHMyKJ+7cqGGd32+jctrAIug==", "rqTRV");
        llllIIIIIlII[llllIIIIIlIl[4]] = lIIIlllIlIIIllI("HwULlUElAdbJ4NeuqQ6JCSl30W5hJtuskGa44GTumRTsPrYW+5CvLXOIE753OyYv6FBCcKe5NChX63kdK8sopz4NorRLw79/z+EOsdEcJB+kIugiCWf1FQ==", "bxLEl");
        llllIIIIIlII[llllIIIIIlIl[1]] = lIIIlllIlIIIlll("dlDYr2MIdHSfuJw3pl3UlUWBxuSOCOiv", "cstHN");
        llllIIIIIlII[llllIIIIIlIl[2]] = lIIIlllIlIIIlll("0yuwHQWC/We6nHX+SfteR1ZBUtnYZR8O", "ATCMm");
        llllIIIIIlII[llllIIIIIlIl[5]] = lIIIlllIlIIIllI("oyZ0zWwuZ+2KqKXOYPyuUg==", "FFMYY");
        llllIIIIIlII[llllIIIIIlIl[6]] = lIIIlllIlIIIllI("S9wSbjNKvg64BkBOiIRqYg==", "uhiNm");
        llllIIIIIlII[llllIIIIIlIl[7]] = lIIIlllIlIIIlll("uCmtyjQTsWY=", "UaWpM");
        llllIIIIIlII[llllIIIIIlIl[9]] = lIIIlllIlIIIlIl("IwogLCIiQyQwIiJDJio5JAs=", "GcVEL");
        llllIIIIIlII[llllIIIIIlIl[10]] = lIIIlllIlIIIllI("Zw6fxEVW/A5Ll+Eh2qQRow==", "IevRX");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    private boolean a(String str) {
        RunePouch.RuneSlot[] values = RunePouch.RuneSlot.values();
        int i = llllIIIIIlIl[0];
        if (lIIIlllIlIIlIlI(Inventory.getFirst(item -> {
            return item.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[5]]);
        }))) {
            i = llllIIIIIlIl[1];
        }
        if (lIIIlllIlIIlIlI(Inventory.getFirst(item2 -> {
            return item2.getName().toLowerCase().startsWith(llllIIIIIlII[llllIIIIIlIl[2]]);
        }))) {
            i = llllIIIIIlIl[2];
        }
        int i2 = llllIIIIIlIl[0];
        while (lIIIlllIlIIllII(i2, i)) {
            String runeName = values[i2].getRuneName();
            if (lIIIlllIlIIllll(runeName, str)) {
                bP.debug(llllIIIIIlII[llllIIIIIlIl[4]], runeName, str);
                return llllIIIIIlIl[3];
            }
            i2++;
            "".length();
            if ("  ".length() <= 0) {
                return ((60 ^ 22) ^ (158 ^ 167)) & (((206 ^ 171) ^ (237 ^ 155)) ^ (-" ".length()));
            }
        }
        return llllIIIIIlIl[0];
    }
}
