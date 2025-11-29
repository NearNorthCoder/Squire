package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.c  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/c.class */
public final class EnumC0002c {
    public static final /* synthetic */ EnumC0002c DONE;
    public static final /* synthetic */ EnumC0002c TRANSPORTING_ZULRAH;
    public static final /* synthetic */ EnumC0002c BANKING;
    private static final /* synthetic */ EnumC0002c[] $VALUES;
    public static final /* synthetic */ EnumC0002c COLLECTING_ZULRAH;
    private static /* synthetic */ String[] lIllIlIIlIIII;
    private static /* synthetic */ int[] lIllIlIIlIIIl;

    private static String llIIIllllIIlIIl(String llllllllllllllIllIIIllllIIlllIlI, String llllllllllllllIllIIIllllIIlllIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllllIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIllllIIlllIIl.toCharArray();
        int llllllllllllllIllIIIllllIIllIllI = lIllIlIIlIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIIlIIIl[0];
        while (llIIIllllIIllII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIIllllIIllIllI % charArray.length]));
            "".length();
            llllllllllllllIllIIIllllIIllIllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIIIllllIIlIll() {
        lIllIlIIlIIIl = new int[6];
        lIllIlIIlIIIl[0] = (87 ^ 114) & ((95 ^ 122) ^ (-1));
        lIllIlIIlIIIl[1] = " ".length();
        lIllIlIIlIIIl[2] = "  ".length();
        lIllIlIIlIIIl[3] = "   ".length();
        lIllIlIIlIIIl[4] = (240 ^ 132) ^ (125 ^ 13);
        lIllIlIIlIIIl[5] = (((127 + 203) - 230) + 104) ^ (((87 + 139) - 106) + 76);
    }

    private static String llIIIllllIIlIII(String llllllllllllllIllIIIllllIIlIIlIl, String llllllllllllllIllIIIllllIIlIIlII) {
        try {
            SecretKeySpec llllllllllllllIllIIIllllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllllIIlIIlII.getBytes(StandardCharsets.UTF_8)), lIllIlIIlIIIl[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIIlIIIl[2], llllllllllllllIllIIIllllIIlIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllllIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllllIIlIIllI) {
            llllllllllllllIllIIIllllIIlIIllI.printStackTrace();
            return null;
        }
    }

    public static EnumC0002c[] values() {
        return (EnumC0002c[]) $VALUES.clone();
    }

    private static void llIIIllllIIlIlI() {
        lIllIlIIlIIII = new String[lIllIlIIlIIIl[4]];
        lIllIlIIlIIII[lIllIlIIlIIIl[0]] = llIIIllllIIlIII("580ksT5Rcyc=", "AOTvB");
        lIllIlIIlIIII[lIllIlIIlIIIl[1]] = llIIIllllIIlIIl("OhsRLyA+BgI1OiAODzsmIhsRKQ==", "nIPas");
        lIllIlIIlIIII[lIllIlIIlIIIl[2]] = llIIIllllIIlIIl("BgQEJA8GHwEmDRoRHSQYBAM=", "EKHhJ");
        lIllIlIIlIIII[lIllIlIIlIIIl[3]] = llIIIllllIIlIII("Tne0uca0PzQ=", "yhiiv");
    }

    public static EnumC0002c valueOf(String str) {
        return (EnumC0002c) Enum.valueOf(EnumC0002c.class, str);
    }

    static {
        llIIIllllIIlIll();
        llIIIllllIIlIlI();
        BANKING = new EnumC0002c(lIllIlIIlIIII[lIllIlIIlIIIl[0]], lIllIlIIlIIIl[0]);
        TRANSPORTING_ZULRAH = new EnumC0002c(lIllIlIIlIIII[lIllIlIIlIIIl[1]], lIllIlIIlIIIl[1]);
        COLLECTING_ZULRAH = new EnumC0002c(lIllIlIIlIIII[lIllIlIIlIIIl[2]], lIllIlIIlIIIl[2]);
        DONE = new EnumC0002c(lIllIlIIlIIII[lIllIlIIlIIIl[3]], lIllIlIIlIIIl[3]);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[lIllIlIIlIIIl[4]];
        enumC0002cArr[lIllIlIIlIIIl[0]] = BANKING;
        enumC0002cArr[lIllIlIIlIIIl[1]] = TRANSPORTING_ZULRAH;
        enumC0002cArr[lIllIlIIlIIIl[2]] = COLLECTING_ZULRAH;
        enumC0002cArr[lIllIlIIlIIIl[3]] = DONE;
        $VALUES = enumC0002cArr;
    }

    private EnumC0002c(String str, int i) {
    }

    private static boolean llIIIllllIIllII(int i, int i2) {
        return i < i2;
    }
}
