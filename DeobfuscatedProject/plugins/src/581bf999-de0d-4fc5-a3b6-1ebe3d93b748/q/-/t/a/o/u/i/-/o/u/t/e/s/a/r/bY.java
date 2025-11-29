/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class bY
extends Enum<bY> {
    private static /* synthetic */ String[] llIlIllIIll;
    public static final /* synthetic */ /* enum */ bY WAVE;
    private static /* synthetic */ int[] llIlIllIlII;
    public static final /* synthetic */ /* enum */ bY JUG;
    public static final /* synthetic */ /* enum */ bY ATTACK;
    private static final /* synthetic */ bY[] $VALUES;

    private static void lIlIIlllllIIlI() {
        llIlIllIIll = new String[llIlIllIlII[3]];
        bY.llIlIllIIll[bY.llIlIllIlII[0]] = bY.lIlIIlllllIIII("AjEtACQI", "CeyAg");
        bY.llIlIllIIll[bY.llIlIllIlII[1]] = bY.lIlIIlllllIIIl("k8y/gu+U7LY=", "sWziE");
        bY.llIlIllIIll[bY.llIlIllIlII[2]] = bY.lIlIIlllllIIIl("uYT2pGRRRKg=", "jTbKT");
    }

    private static void lIlIIlllllIIll() {
        llIlIllIlII = new int[5];
        bY.llIlIllIlII[0] = (0x73 ^ 0x6D ^ (0 ^ 0x59)) & (0x52 ^ 0x2F ^ (0x38 ^ 2) ^ -" ".length());
        bY.llIlIllIlII[1] = " ".length();
        bY.llIlIllIlII[2] = "  ".length();
        bY.llIlIllIlII[3] = "   ".length();
        bY.llIlIllIlII[4] = 0x68 ^ 0x33 ^ (0xD0 ^ 0x83);
    }

    private static String lIlIIlllllIIIl(String llllllllllllllllIIllIIIllIIlIIII, String llllllllllllllllIIllIIIllIIlIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIllIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), llIlIllIlII[4]), "DES");
            Cipher llllllllllllllllIIllIIIllIIlIlII = Cipher.getInstance("DES");
            llllllllllllllllIIllIIIllIIlIlII.init(llIlIllIlII[2], llllllllllllllllIIllIIIllIIlIlIl);
            return new String(llllllllllllllllIIllIIIllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIIllIIlIIll) {
            llllllllllllllllIIllIIIllIIlIIll.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlllllIIII(String llllllllllllllllIIllIIIllIIIIIlI, String llllllllllllllllIIllIIIlIlllllII) {
        llllllllllllllllIIllIIIllIIIIIlI = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIIllIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIIIllIIIIIII = new StringBuilder();
        char[] llllllllllllllllIIllIIIlIlllllll = llllllllllllllllIIllIIIlIlllllII.toCharArray();
        int llllllllllllllllIIllIIIlIllllllI = llIlIllIlII[0];
        char[] llllllllllllllllIIllIIIlIllllIII = llllllllllllllllIIllIIIllIIIIIlI.toCharArray();
        int llllllllllllllllIIllIIIlIlllIlll = llllllllllllllllIIllIIIlIllllIII.length;
        int llllllllllllllllIIllIIIlIlllIllI = llIlIllIlII[0];
        while (bY.lIlIIlllllIlII(llllllllllllllllIIllIIIlIlllIllI, llllllllllllllllIIllIIIlIlllIlll)) {
            char llllllllllllllllIIllIIIllIIIIIll = llllllllllllllllIIllIIIlIllllIII[llllllllllllllllIIllIIIlIlllIllI];
            llllllllllllllllIIllIIIllIIIIIII.append((char)(llllllllllllllllIIllIIIllIIIIIll ^ llllllllllllllllIIllIIIlIlllllll[llllllllllllllllIIllIIIlIllllllI % llllllllllllllllIIllIIIlIlllllll.length]));
            "".length();
            ++llllllllllllllllIIllIIIlIllllllI;
            ++llllllllllllllllIIllIIIlIlllIllI;
            "".length();
            if ("   ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIIIllIIIIIII);
    }

    static {
        bY.lIlIIlllllIIll();
        bY.lIlIIlllllIIlI();
        ATTACK = new bY();
        WAVE = new bY();
        JUG = new bY();
        bY[] bYArray = new bY[llIlIllIlII[3]];
        bYArray[bY.llIlIllIlII[0]] = ATTACK;
        bYArray[bY.llIlIllIlII[1]] = WAVE;
        bYArray[bY.llIlIllIlII[2]] = JUG;
        $VALUES = bYArray;
    }

    public static bY valueOf(String string) {
        return Enum.valueOf(bY.class, string);
    }

    private static boolean lIlIIlllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    public static bY[] values() {
        return (bY[])$VALUES.clone();
    }
}

