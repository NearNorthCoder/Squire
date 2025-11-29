package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.d  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/d.class */
public final class d {
    private final /* synthetic */ int itemID;
    private final /* synthetic */ Predicate<Item> test;
    public static final /* synthetic */ d ANTIPOISON;
    public static final /* synthetic */ d SUPERANTIPOISON;
    public static final /* synthetic */ d ANTIDOTE;
    private static /* synthetic */ String[] lIIllIIIIIllI;
    private static /* synthetic */ int[] lIIllIIIIIlll;
    private static final /* synthetic */ d[] $VALUES;

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    private static String lIlIlllIlIIIlll(String llllllllllllllIllllIIlIllIlIllII, String llllllllllllllIllllIIlIllIlIlIll) {
        try {
            SecretKeySpec llllllllllllllIllllIIlIllIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIllIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIIIIlll[2], llllllllllllllIllllIIlIllIlIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIllIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIlIllIlIllIl) {
            llllllllllllllIllllIIlIllIlIllIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIlIIlIlI() {
        lIIllIIIIIllI = new String[lIIllIIIIIlll[9]];
        lIIllIIIIIllI[lIIllIIIIIlll[0]] = lIlIlllIlIIIlll("dmJxcaqiltnNp+9Usuq7cQ==", "HuTZs");
        lIIllIIIIIllI[lIIllIIIIIlll[1]] = lIlIlllIlIIlIII("YjmNxaDg+9X/gCxooTjiYQ==", "cwydQ");
        lIIllIIIIIllI[lIIllIIIIIlll[2]] = lIlIlllIlIIlIIl("JyMDHz8JJAQZIQ==", "fMwvO");
        lIIllIIIIIllI[lIIllIIIIIlll[3]] = lIlIlllIlIIIlll("6Uo4/5ojAeJfgkQOYQiCFw==", "SMSvH");
        lIIllIIIIIllI[lIIllIIIIIlll[5]] = lIlIlllIlIIlIIl("AhMgMjUQCCQ+Nx4PIzgp", "QFpwg");
        lIIllIIIIIllI[lIIllIIIIIlll[7]] = lIlIlllIlIIIlll("NIKx3HeBC4jv1h3RAW5+vg==", "Qartb");
    }

    private static String lIlIlllIlIIlIIl(String llllllllllllllIllllIIlIlllIIlllI, String llllllllllllllIllllIIlIlllIIllIl) {
        String llllllllllllllIllllIIlIlllIIlllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlIlllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIIlIlllIIlIll = llllllllllllllIllllIIlIlllIIllIl.toCharArray();
        int llllllllllllllIllllIIlIlllIIlIlI = lIIllIIIIIlll[0];
        char[] charArray = llllllllllllllIllllIIlIlllIIlllI2.toCharArray();
        int length = charArray.length;
        int i = lIIllIIIIIlll[0];
        while (lIlIlllIlIIllII(i, length)) {
            char llllllllllllllIllllIIlIlllIIllll = charArray[i];
            sb.append((char) (llllllllllllllIllllIIlIlllIIllll ^ llllllllllllllIllllIIlIlllIIlIll[llllllllllllllIllllIIlIlllIIlIlI % llllllllllllllIllllIIlIlllIIlIll.length]));
            "".length();
            llllllllllllllIllllIIlIlllIIlIlI++;
            i++;
            "".length();
            if ((-" ".length()) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlIlllIlIIlIll();
        lIlIlllIlIIlIlI();
        ANTIPOISON = new d(lIIllIIIIIllI[lIIllIIIIIlll[3]], lIIllIIIIIlll[0], item -> {
            return item.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[2]]);
        }, lIIllIIIIIlll[4]);
        SUPERANTIPOISON = new d(lIIllIIIIIllI[lIIllIIIIIlll[5]], lIIllIIIIIlll[1], item2 -> {
            return item2.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[1]]);
        }, lIIllIIIIIlll[6]);
        ANTIDOTE = new d(lIIllIIIIIllI[lIIllIIIIIlll[7]], lIIllIIIIIlll[2], item3 -> {
            return item3.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[0]]);
        }, lIIllIIIIIlll[8]);
        d[] dVarArr = new d[lIIllIIIIIlll[3]];
        dVarArr[lIIllIIIIIlll[0]] = ANTIPOISON;
        dVarArr[lIIllIIIIIlll[1]] = SUPERANTIPOISON;
        dVarArr[lIIllIIIIIlll[2]] = ANTIDOTE;
        $VALUES = dVarArr;
    }

    private d(String str, int i, Predicate predicate, int i2) {
        this.test = predicate;
        this.itemID = i2;
    }

    private static void lIlIlllIlIIlIll() {
        lIIllIIIIIlll = new int[11];
        lIIllIIIIIlll[0] = ((207 ^ 131) ^ (32 ^ 100)) & (((((125 + 57) - 119) + 79) ^ (((37 + 50) - (-22)) + 25)) ^ (-" ".length()));
        lIIllIIIIIlll[1] = " ".length();
        lIIllIIIIIlll[2] = "  ".length();
        lIIllIIIIIlll[3] = "   ".length();
        lIIllIIIIIlll[4] = (-((-27382) & 32503)) & (-16465) & 24031;
        lIIllIIIIIlll[5] = (83 ^ 84) ^ "   ".length();
        lIIllIIIIIlll[6] = (-((-8953) & 30461)) & (-8258) & 32213;
        lIIllIIIIIlll[7] = 173 ^ 168;
        lIIllIIIIIlll[8] = (-8329) & 14271;
        lIIllIIIIIlll[9] = (87 ^ 33) ^ (70 ^ 54);
        lIIllIIIIIlll[10] = 8 ^ 0;
    }

    private static boolean lIlIlllIlIIllII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlllIlIIlIII(String llllllllllllllIllllIIlIllIlllIIl, String llllllllllllllIllllIIlIllIlllIII) {
        try {
            SecretKeySpec llllllllllllllIllllIIlIllIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIllIlllIII.getBytes(StandardCharsets.UTF_8)), lIIllIIIIIlll[10]), "DES");
            Cipher llllllllllllllIllllIIlIllIlllIll = Cipher.getInstance("DES");
            llllllllllllllIllllIIlIllIlllIll.init(lIIllIIIIIlll[2], llllllllllllllIllllIIlIllIllllII);
            return new String(llllllllllllllIllllIIlIllIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIlIllIlllIlI) {
            llllllllllllllIllllIIlIllIlllIlI.printStackTrace();
            return null;
        }
    }

    public Predicate<Item> u() {
        return this.test;
    }

    public int v() {
        return this.itemID;
    }
}
