package m.u.a.p000.e.s.q.t.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.u.a.-.e.s.q.t.i.r.c  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/c.class */
public final class c {
    private final /* synthetic */ int childID = lllIllIIIllI[0];
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ int[] lllIllIIIllI;
    private final /* synthetic */ int parentID;
    private static /* synthetic */ String[] lllIllIIIlIl;
    public static final /* synthetic */ c ALCHEMY;
    public static final /* synthetic */ c TELEKENETIC;
    public static final /* synthetic */ c ENCHANTMENT;
    public static final /* synthetic */ c GRAVEYARD;
    private final /* synthetic */ String teleportObject;

    private static String lIIIllIIllIlllI(String lllllllllllllllIIllIlIIIlIIIlIII, String lllllllllllllllIIllIlIIIlIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlIIIIlll.getBytes(StandardCharsets.UTF_8)), lllIllIIIllI[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllIIIllI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIlIIIlIIl) {
            lllllllllllllllIIllIlIIIlIIIlIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIIllIIlllIIIl();
        lIIIllIIlllIIII();
        GRAVEYARD = new c(lllIllIIIlIl[lllIllIIIllI[1]], lllIllIIIllI[1], lllIllIIIlIl[lllIllIIIllI[2]], lllIllIIIllI[3]);
        TELEKENETIC = new c(lllIllIIIlIl[lllIllIIIllI[4]], lllIllIIIllI[2], lllIllIIIlIl[lllIllIIIllI[5]], lllIllIIIllI[6]);
        ALCHEMY = new c(lllIllIIIlIl[lllIllIIIllI[7]], lllIllIIIllI[4], lllIllIIIlIl[lllIllIIIllI[8]], lllIllIIIllI[9]);
        ENCHANTMENT = new c(lllIllIIIlIl[lllIllIIIllI[0]], lllIllIIIllI[5], lllIllIIIlIl[lllIllIIIllI[10]], lllIllIIIllI[11]);
        c[] cVarArr = new c[lllIllIIIllI[7]];
        cVarArr[lllIllIIIllI[1]] = GRAVEYARD;
        cVarArr[lllIllIIIllI[2]] = TELEKENETIC;
        cVarArr[lllIllIIIllI[4]] = ALCHEMY;
        cVarArr[lllIllIIIllI[5]] = ENCHANTMENT;
        $VALUES = cVarArr;
    }

    private static void lIIIllIIlllIIIl() {
        lllIllIIIllI = new int[13];
        lllIllIIIllI[0] = 194 ^ 196;
        lllIllIIIllI[1] = ("   ".length() ^ (70 ^ 28)) & (((((5 + 23) - (-81)) + 43) ^ (((107 + 52) - 19) + 53)) ^ (-" ".length()));
        lllIllIIIllI[2] = " ".length();
        lllIllIIIllI[3] = (((57 ^ 54) + (((40 + 139) - 150) + 122)) - (((44 + 9) - (-62)) + 30)) + ((82 + 91) - 47) + 49;
        lllIllIIIllI[4] = "  ".length();
        lllIllIIIllI[5] = "   ".length();
        lllIllIIIllI[6] = (((63 ^ 44) + (144 ^ 195)) - (-(104 ^ 69))) + (131 ^ 176);
        lllIllIIIllI[7] = 186 ^ 190;
        lllIllIIIllI[8] = (67 ^ 77) ^ (200 ^ 195);
        lllIllIIIllI[9] = ((112 + 144) - 145) + 83;
        lllIllIIIllI[10] = (225 ^ 197) ^ (118 ^ 85);
        lllIllIIIllI[11] = (((201 ^ 162) + (164 ^ 160)) - (-(29 ^ 92))) + (31 ^ 12);
        lllIllIIIllI[12] = 10 ^ 2;
    }

    private static String lIIIllIIllIllll(String lllllllllllllllIIllIlIIIlIlIllIl, String lllllllllllllllIIllIlIIIlIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIllIIIllI[4], lllllllllllllllIIllIlIIIlIllIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIIlIlIlllI) {
            lllllllllllllllIIllIlIIIlIlIlllI.printStackTrace();
            return null;
        }
    }

    private c(String str, int i, String str2, int i2) {
        this.parentID = i2;
        this.teleportObject = str2;
    }

    public int h() {
        Objects.requireNonNull(this);
        "".length();
        return lllIllIIIllI[0];
    }

    private static void lIIIllIIlllIIII() {
        lllIllIIIlIl = new String[lllIllIIIllI[12]];
        lllIllIIIlIl[lllIllIIIllI[1]] = lIIIllIIllIllIl("NxAOORQpAx0r", "pBOoQ");
        lllIllIIIlIl[lllIllIIIllI[2]] = lIIIllIIllIlllI("buRAeRV14npHPh7vv64YIk4ZSxpfVm/F", "JNhHn");
        lllIllIIIlIl[lllIllIIIllI[4]] = lIIIllIIllIllll("2JelLiWpmjT/DcBS2AEMcQ==", "Rmtsq");
        lllIllIIIlIl[lllIllIIIllI[5]] = lIIIllIIllIllIl("MCQVLxINLxw+EAdhLS8VATEWOA0=", "dAyJy");
        lllIllIIIlIl[lllIllIIIllI[7]] = lIIIllIIllIllIl("ACcSDAgMMg==", "AkQDM");
        lllIllIIIlIl[lllIllIIIllI[8]] = lIIIllIIllIlllI("H/Z4PsXo76wlRYWnpTaZ0ssylfmY0TDu", "faxnR");
        lllIllIIIlIl[lllIllIIIllI[0]] = lIIIllIIllIlllI("nVfxLn73ZOtK3DY3oTgayw==", "zVorW");
        lllIllIIIlIl[lllIllIIIllI[10]] = lIIIllIIllIlllI("efUcEVmRJ87eLJFPCN+3nTBA9maI9b9n", "xjNQW");
    }

    private static boolean lIIIllIIlllIIlI(int i, int i2) {
        return i < i2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    private static String lIIIllIIllIllIl(String lllllllllllllllIIllIlIIIlIIlllIl, String lllllllllllllllIIllIlIIIlIIlllII) {
        String lllllllllllllllIIllIlIIIlIIlllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIlIIIlIIlllII.toCharArray();
        int lllllllllllllllIIllIlIIIlIIllIIl = lllIllIIIllI[1];
        char[] charArray2 = lllllllllllllllIIllIlIIIlIIlllIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIllIIIllI[1];
        while (lIIIllIIlllIIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIlIIIlIIllIIl % charArray.length]));
            "".length();
            lllllllllllllllIIllIlIIIlIIllIIl++;
            i++;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public String g() {
        return this.teleportObject;
    }

    public int f() {
        return this.parentID;
    }
}
