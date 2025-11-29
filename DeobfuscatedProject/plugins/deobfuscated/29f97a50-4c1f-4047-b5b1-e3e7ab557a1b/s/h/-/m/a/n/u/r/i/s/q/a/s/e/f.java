/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;

public final class f
extends Enum<f> {
    public static final /* synthetic */ /* enum */ f DIVINE_POTION;
    public static final /* synthetic */ /* enum */ f RANGE_POTION;
    private static /* synthetic */ int[] lIIlIlllllIII;
    private static /* synthetic */ String[] lIIlIllllIlll;
    private static final /* synthetic */ f[] $VALUES;
    private final /* synthetic */ Predicate<Item> test;

    private static String lIlIlllIIIlIIIl(String llllllllllllllIllllIIlllIlIIlIll, String llllllllllllllIllllIIlllIlIIllII) {
        try {
            SecretKeySpec llllllllllllllIllllIIlllIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlllIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIlllIlIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIlllIlIIllll.init(lIIlIlllllIII[5], llllllllllllllIllllIIlllIlIlIIII);
            return new String(llllllllllllllIllllIIlllIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlllIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIlllIlIIlllI) {
            llllllllllllllIllllIIlllIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIIIlIlII() {
        lIIlIlllllIII = new int[14];
        f.lIIlIlllllIII[0] = 1;
        f.lIIlIlllllIII[1] = (0x34 ^ 0x62 ^ (0x1B ^ 0x7B)) & (0xDC ^ 0xA6 ^ (0xF9 ^ 0xB5) ^ -1);
        f.lIIlIlllllIII[2] = 0xE ^ 0xA;
        f.lIIlIlllllIII[3] = -(0xFFFFE8FE & 0x3725) & (0xFFFFEBFF & 0x3DAF);
        f.lIIlIlllllIII[4] = 88 + 88 - 50 + 41 + (48 + 110 - 54 + 44) - (77 + 211 - 156 + 82) + (0x38 ^ 0x7C);
        f.lIIlIlllllIII[5] = 2;
        f.lIIlIlllllIII[6] = 107 + 111 - 191 + 144;
        f.lIIlIlllllIII[7] = 3;
        f.lIIlIlllllIII[8] = 99 + 39 - 71 + 106;
        f.lIIlIlllllIII[9] = -(0xFFFFBF1B & 0x63EF) & (0xFFFFFFFF & 0x7FBF);
        f.lIIlIlllllIII[10] = -(0xFFFFAFC6 & 0x537B) & (0xFFFFDFFB & 0x7FFD);
        f.lIIlIlllllIII[11] = 0xFFFFFFFB & 0x5CBF;
        f.lIIlIlllllIII[12] = -(0xFFFF91D9 & 0x6F67) & (0xFFFFFFFE & 0x5DFF);
        f.lIIlIlllllIII[13] = 22 + 151 - 144 + 130 ^ 48 + 53 - -21 + 29;
    }

    public Predicate<Item> u() {
        return this.test;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private static boolean lIlIlllIIIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        f.lIlIlllIIIlIlII();
        f.lIlIlllIIIlIIll();
        int[] nArray = new int[lIIlIlllllIII[2]];
        nArray[f.lIIlIlllllIII[1]] = lIIlIlllllIII[3];
        nArray[f.lIIlIlllllIII[0]] = lIIlIlllllIII[4];
        nArray[f.lIIlIlllllIII[5]] = lIIlIlllllIII[6];
        nArray[f.lIIlIlllllIII[7]] = lIIlIlllllIII[8];
        RANGE_POTION = new f(nArray);
        int[] nArray2 = new int[lIIlIlllllIII[2]];
        nArray2[f.lIIlIlllllIII[1]] = lIIlIlllllIII[9];
        nArray2[f.lIIlIlllllIII[0]] = lIIlIlllllIII[10];
        nArray2[f.lIIlIlllllIII[5]] = lIIlIlllllIII[11];
        nArray2[f.lIIlIlllllIII[7]] = lIIlIlllllIII[12];
        DIVINE_POTION = new f(nArray2);
        f[] fArray = new f[lIIlIlllllIII[5]];
        fArray[f.lIIlIlllllIII[1]] = RANGE_POTION;
        fArray[f.lIIlIlllllIII[0]] = DIVINE_POTION;
        $VALUES = fArray;
    }

    private static void lIlIlllIIIlIIll() {
        lIIlIllllIlll = new String[lIIlIlllllIII[5]];
        f.lIIlIllllIlll[f.lIIlIlllllIII[1]] = f."RANGE_POTION";
        f.lIIlIllllIlll[f.lIIlIlllllIII[0]] = f."DIVINE_POTION";
    }

    private f(int ... nArray) {
        this.test = item -> IntStream.of(nArray).anyMatch(n2 -> {
            boolean bl;
            if (f.lIlIlllIIIlIlIl(n2, item.getId())) {
                bl = lIIlIlllllIII[0];
                0;
                if (-1 > ((0x26 ^ 0x79) & ~(0x64 ^ 0x3B))) {
                    return ((0x82 ^ 0x95) & ~(0x1D ^ 0xA)) != 0;
                }
            } else {
                bl = lIIlIlllllIII[1];
            }
            return bl;
        });
    }

    private static String lIlIlllIIIlIIII(String llllllllllllllIllllIIlllIlIllIlI, String llllllllllllllIllllIIlllIlIllIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIlllIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlllIlIllIIl.getBytes(StandardCharsets.UTF_8)), lIIlIlllllIII[13]), "DES");
            Cipher llllllllllllllIllllIIlllIlIlllII = Cipher.getInstance("DES");
            llllllllllllllIllllIIlllIlIlllII.init(lIIlIlllllIII[5], llllllllllllllIllllIIlllIlIlllIl);
            return new String(llllllllllllllIllllIIlllIlIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlllIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIlllIlIllIll) {
            llllllllllllllIllllIIlllIlIllIll.printStackTrace();
            return null;
        }
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }
}

