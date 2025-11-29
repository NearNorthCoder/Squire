package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/o.class */
public final class EnumC0040o {
    private static final /* synthetic */ EnumC0040o[] $VALUES;
    public static final /* synthetic */ EnumC0040o BIRD_HOUSE;
    private static /* synthetic */ int[] lIllllllIIII;
    public static final /* synthetic */ EnumC0040o HERBS;
    public static final /* synthetic */ EnumC0040o SEAWEED;
    public static final /* synthetic */ EnumC0040o TREES;
    private static /* synthetic */ String[] lIlllllIllll;

    private static void lllIllllllllII() {
        lIlllllIllll = new String[lIllllllIIII[4]];
        lIlllllIllll[lIllllllIIII[0]] = lllIlllllllIlI("gqFMm0nE57s=", "ZYVxY");
        lIlllllIllll[lIllllllIIII[1]] = lllIlllllllIll("Ej43KQM=", "FlrlP");
        lIlllllIllll[lIllllllIIII[2]] = lllIlllllllIll("KBM6IxIiFT00CA==", "jZhgM");
        lIlllllIllll[lIllllllIIII[3]] = lllIlllllllIlI("r2SQ4lteKrI=", "oEVDm");
    }

    private static String lllIlllllllIll(String lllllllllllllllIlIlIlllllllIllII, String lllllllllllllllIlIlIlllllllIlIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlllllllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlllllllIlIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIlllllllIlIll.toCharArray();
        int lllllllllllllllIlIlIlllllllIlIII = lIllllllIIII[0];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllIlIlIlllllllIIIIl = charArray2.length;
        int i = lIllllllIIII[0];
        while (lllIlllllllllI(i, lllllllllllllllIlIlIlllllllIIIIl)) {
            char lllllllllllllllIlIlIlllllllIllIl = charArray2[i];
            lllllllllllllllIlIlIlllllllIlIlI.append((char) (lllllllllllllllIlIlIlllllllIllIl ^ charArray[lllllllllllllllIlIlIlllllllIlIII % charArray.length]));
            "".length();
            lllllllllllllllIlIlIlllllllIlIII++;
            i++;
            "".length();
            if ("  ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIlllllllIlIlI);
    }

    public static EnumC0040o valueOf(String str) {
        return (EnumC0040o) Enum.valueOf(EnumC0040o.class, str);
    }

    private EnumC0040o(String str, int i) {
    }

    private static boolean lllIlllllllllI(int i, int i2) {
        return i < i2;
    }

    private static void lllIllllllllIl() {
        lIllllllIIII = new int[6];
        lIllllllIIII[0] = (163 ^ 183) & ((35 ^ 55) ^ (-1));
        lIllllllIIII[1] = " ".length();
        lIllllllIIII[2] = "  ".length();
        lIllllllIIII[3] = "   ".length();
        lIllllllIIII[4] = (55 ^ 97) ^ (210 ^ 128);
        lIllllllIIII[5] = 75 ^ 67;
    }

    public static EnumC0040o[] values() {
        return (EnumC0040o[]) $VALUES.clone();
    }

    private static String lllIlllllllIlI(String lllllllllllllllIlIlIllllllIlIlll, String lllllllllllllllIlIlIllllllIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllllllIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllllllIlIllI.getBytes(StandardCharsets.UTF_8)), lIllllllIIII[5]), "DES");
            Cipher lllllllllllllllIlIlIllllllIllIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIllllllIllIIl.init(lIllllllIIII[2], lllllllllllllllIlIlIllllllIllIlI);
            return new String(lllllllllllllllIlIlIllllllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllllllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIllllllIllIII) {
            lllllllllllllllIlIlIllllllIllIII.printStackTrace();
            return null;
        }
    }

    static {
        lllIllllllllIl();
        lllIllllllllII();
        HERBS = new EnumC0040o(lIlllllIllll[lIllllllIIII[0]], lIllllllIIII[0]);
        TREES = new EnumC0040o(lIlllllIllll[lIllllllIIII[1]], lIllllllIIII[1]);
        BIRD_HOUSE = new EnumC0040o(lIlllllIllll[lIllllllIIII[2]], lIllllllIIII[2]);
        SEAWEED = new EnumC0040o(lIlllllIllll[lIllllllIIII[3]], lIllllllIIII[3]);
        EnumC0040o[] enumC0040oArr = new EnumC0040o[lIllllllIIII[4]];
        enumC0040oArr[lIllllllIIII[0]] = HERBS;
        enumC0040oArr[lIllllllIIII[1]] = TREES;
        enumC0040oArr[lIllllllIIII[2]] = BIRD_HOUSE;
        enumC0040oArr[lIllllllIIII[3]] = SEAWEED;
        $VALUES = enumC0040oArr;
    }
}
