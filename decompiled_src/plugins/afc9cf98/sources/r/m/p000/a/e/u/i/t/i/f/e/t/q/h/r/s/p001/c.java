package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.c  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/c.class */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ String[] lIlIIIIIIllll;
    public static final /* synthetic */ c BOLOGANO;
    public static final /* synthetic */ c GOLOVANOVA;
    public static final /* synthetic */ c BEST_OPTION;
    private static /* synthetic */ int[] lIlIIIIIlIIIl;
    public static final /* synthetic */ c LOGAVANO;

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    private static void lIllIllIllIllII() {
        lIlIIIIIlIIIl = new int[9];
        lIlIIIIIlIIIl[0] = 82 ^ 24;
        lIlIIIIIlIIIl[1] = (((124 + 111) - 141) + 38) ^ (((59 + 131) - 123) + 111);
        lIlIIIIIlIIIl[2] = ((48 ^ 28) ^ (123 ^ 19)) & (((61 ^ 49) ^ (193 ^ 137)) ^ (-" ".length()));
        lIlIIIIIlIIIl[3] = " ".length();
        lIlIIIIIlIIIl[4] = "  ".length();
        lIlIIIIIlIIIl[5] = "   ".length();
        lIlIIIIIlIIIl[6] = 155 ^ 159;
        lIlIIIIIlIIIl[7] = 31 ^ 26;
        lIlIIIIIlIIIl[8] = (95 ^ 90) ^ (121 ^ 116);
    }

    private static void lIllIllIllIlIll() {
        lIlIIIIIIllll = new String[lIlIIIIIlIIIl[7]];
        lIlIIIIIIllll[lIlIIIIIlIIIl[2]] = lIllIllIlIlllll("xyqN5CJUY8t/bV/C86GzBvfyzgH7JMLjFIDpHbdPND4=", "VazWn");
        lIlIIIIIIllll[lIlIIIIIlIIIl[3]] = lIllIllIllIlIIl("CCwrGz0OLSgCKg==", "OcgTk");
        lIlIIIIIIllll[lIlIIIIIlIIIl[4]] = lIllIllIllIlIIl("FxoZIi4UGxo=", "UUUmi");
        lIlIIIIIIllll[lIlIIIIIlIIIl[5]] = lIllIllIllIlIlI("3FVW3OGb5dGuEsdkdjignw==", "DiMkM");
        lIlIIIIIIllll[lIlIIIIIlIIIl[6]] = lIllIllIlIlllll("w7xN2fpr1VxONv5JZ0Kr2A==", "JQexE");
    }

    private static String lIllIllIlIlllll(String llllllllllllllIlllIIlIIIllIIllII, String llllllllllllllIlllIIlIIIllIIlIll) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIIIllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIlIIIl[4], llllllllllllllIlllIIlIIIllIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIIllIIllIl) {
            llllllllllllllIlllIIlIIIllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIllIllll(int i) {
        return i == 0;
    }

    private static boolean lIllIllIllIlllI(Object obj) {
        return obj == null;
    }

    private static boolean lIllIllIllIllIl(int i, int i2) {
        return i >= i2;
    }

    public f i() {
        switch (d.n[ordinal()]) {
            case 1:
                return f.GOLOVANOVA;
            case 2:
                return f.BOLOGANO;
            case 3:
                return f.LOGAVANO;
            case 4:
                int llllllllllllllIlllIIlIIIllIlllII = Skills.getLevel(Skill.FARMING);
                return lIllIllIllIllIl(llllllllllllllIlllIIlIIIllIlllII, lIlIIIIIlIIIl[0]) ? f.LOGAVANO : lIllIllIllIllIl(llllllllllllllIlllIIlIIIllIlllII, lIlIIIIIlIIIl[1]) ? f.BOLOGANO : f.GOLOVANOVA;
            default:
                return null;
        }
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    private static String lIllIllIllIlIIl(String llllllllllllllIlllIIlIIIlIllllII, String llllllllllllllIlllIIlIIIlIlllIll) {
        String llllllllllllllIlllIIlIIIlIllllII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIlIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIlIIIlIlllIll.toCharArray();
        int llllllllllllllIlllIIlIIIlIlllIII = lIlIIIIIlIIIl[2];
        char[] charArray2 = llllllllllllllIlllIIlIIIlIllllII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIIIlIIIl[2];
        while (lIllIllIlllIIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIIlIIIlIlllIII % charArray.length]));
            "".length();
            llllllllllllllIlllIIlIIIlIlllIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIllIllIlIlI(String llllllllllllllIlllIIlIIIlIlIIlll, String llllllllllllllIlllIIlIIIlIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIlIIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIIlIlIIIll) {
            llllllllllllllIlllIIlIIIlIlIIIll.printStackTrace();
            return null;
        }
    }

    private c(String str, int i) {
    }

    static {
        lIllIllIllIllII();
        lIllIllIllIlIll();
        GOLOVANOVA = new c(lIlIIIIIIllll[lIlIIIIIlIIIl[3]], lIlIIIIIlIIIl[2]);
        BOLOGANO = new c(lIlIIIIIIllll[lIlIIIIIlIIIl[4]], lIlIIIIIlIIIl[3]);
        LOGAVANO = new c(lIlIIIIIIllll[lIlIIIIIlIIIl[5]], lIlIIIIIlIIIl[4]);
        BEST_OPTION = new c(lIlIIIIIIllll[lIlIIIIIlIIIl[6]], lIlIIIIIlIIIl[5]);
        c[] cVarArr = new c[lIlIIIIIlIIIl[6]];
        cVarArr[lIlIIIIIlIIIl[2]] = GOLOVANOVA;
        cVarArr[lIlIIIIIlIIIl[3]] = BOLOGANO;
        cVarArr[lIlIIIIIlIIIl[4]] = LOGAVANO;
        cVarArr[lIlIIIIIlIIIl[5]] = BEST_OPTION;
        $VALUES = cVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean a(Item item) {
        f i = i();
        if (lIllIllIllIlllI(i)) {
            String str = lIlIIIIIIllll[lIlIIIIIlIIIl[2]];
            Object[] objArr = new Object[lIlIIIIIlIIIl[3]];
            objArr[lIlIIIIIlIIIl[2]] = this;
            Log.info(str, objArr);
            return lIlIIIIIlIIIl[2];
        }
        if (lIllIllIllIllll(item.getName().contains(i.j()) ? 1 : 0)) {
            ?? r0 = lIlIIIIIlIIIl[3];
            "".length();
            return (-" ".length()) != (-" ".length()) ? ((171 ^ 197) ^ (126 ^ 62)) & (((((88 + 8) - 55) + 124) ^ (((108 + 39) - 53) + 45)) ^ (-" ".length())) : r0;
        }
        return lIlIIIIIlIIIl[2];
    }

    private static boolean lIllIllIlllIIII(int i, int i2) {
        return i < i2;
    }
}
