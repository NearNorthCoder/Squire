package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.f  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/f.class */
public final class f {
    public static final /* synthetic */ f DIVINE_POTION;
    public static final /* synthetic */ f RANGE_POTION;
    private static /* synthetic */ int[] lIIlIlllllIII;
    private static /* synthetic */ String[] lIIlIllllIlll;
    private static final /* synthetic */ f[] $VALUES;
    private final /* synthetic */ Predicate<Item> test;

    private static String lIlIlllIIIlIIIl(String llllllllllllllIllllIIlllIlIIllIl, String llllllllllllllIllllIIlllIlIIllII) {
        try {
            SecretKeySpec llllllllllllllIllllIIlllIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlllIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIlllIlIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIlllIlIIllll.init(lIIlIlllllIII[5], llllllllllllllIllllIIlllIlIlIIII);
            return new String(llllllllllllllIllllIIlllIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlllIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIlllIlIIlllI) {
            llllllllllllllIllllIIlllIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIIIlIlII() {
        lIIlIlllllIII = new int[14];
        lIIlIlllllIII[0] = " ".length();
        lIIlIlllllIII[1] = ((52 ^ 98) ^ (27 ^ 123)) & (((220 ^ 166) ^ (249 ^ 181)) ^ (-" ".length()));
        lIIlIlllllIII[2] = 14 ^ 10;
        lIIlIlllllIII[3] = (-((-5890) & 14117)) & (-5121) & 15791;
        lIIlIlllllIII[4] = (((((88 + 88) - 50) + 41) + (((48 + 110) - 54) + 44)) - (((77 + 211) - 156) + 82)) + (56 ^ 124);
        lIIlIlllllIII[5] = "  ".length();
        lIIlIlllllIII[6] = ((107 + 111) - 191) + 144;
        lIIlIlllllIII[7] = "   ".length();
        lIIlIlllllIII[8] = ((99 + 39) - 71) + 106;
        lIIlIlllllIII[9] = (-((-16613) & 25583)) & (-1) & 32703;
        lIIlIlllllIII[10] = (-((-20538) & 21371)) & (-8197) & 32765;
        lIIlIlllllIII[11] = (-5) & 23743;
        lIIlIlllllIII[12] = (-((-28199) & 28519)) & (-2) & 24063;
        lIIlIlllllIII[13] = (((22 + 151) - 144) + 130) ^ (((48 + 53) - (-21)) + 29);
    }

    public Predicate<Item> u() {
        return this.test;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    private static boolean lIlIlllIIIlIlIl(int i, int i2) {
        return i == i2;
    }

    static {
        lIlIlllIIIlIlII();
        lIlIlllIIIlIIll();
        String str = lIIlIllllIlll[lIIlIlllllIII[1]];
        int i = lIIlIlllllIII[1];
        int[] iArr = new int[lIIlIlllllIII[2]];
        iArr[lIIlIlllllIII[1]] = lIIlIlllllIII[3];
        iArr[lIIlIlllllIII[0]] = lIIlIlllllIII[4];
        iArr[lIIlIlllllIII[5]] = lIIlIlllllIII[6];
        iArr[lIIlIlllllIII[7]] = lIIlIlllllIII[8];
        RANGE_POTION = new f(str, i, iArr);
        String str2 = lIIlIllllIlll[lIIlIlllllIII[0]];
        int i2 = lIIlIlllllIII[0];
        int[] iArr2 = new int[lIIlIlllllIII[2]];
        iArr2[lIIlIlllllIII[1]] = lIIlIlllllIII[9];
        iArr2[lIIlIlllllIII[0]] = lIIlIlllllIII[10];
        iArr2[lIIlIlllllIII[5]] = lIIlIlllllIII[11];
        iArr2[lIIlIlllllIII[7]] = lIIlIlllllIII[12];
        DIVINE_POTION = new f(str2, i2, iArr2);
        f[] fVarArr = new f[lIIlIlllllIII[5]];
        fVarArr[lIIlIlllllIII[1]] = RANGE_POTION;
        fVarArr[lIIlIlllllIII[0]] = DIVINE_POTION;
        $VALUES = fVarArr;
    }

    private static void lIlIlllIIIlIIll() {
        lIIlIllllIlll = new String[lIIlIlllllIII[5]];
        lIIlIllllIlll[lIIlIlllllIII[1]] = lIlIlllIIIlIIII("9YPPb8R1UjpVLvLbjq/QTw==", "CjSXD");
        lIIlIllllIlll[lIIlIlllllIII[0]] = lIlIlllIIIlIIIl("eLdzZt3s778DGEhm3JxsTg==", "qoXdj");
    }

    private f(String str, int i, int... iArr) {
        this.test = item -> {
            return IntStream.of(iArr).anyMatch(i2 -> {
                if (lIlIlllIIIlIlIl(i2, item.getId())) {
                    ?? r0 = lIIlIlllllIII[0];
                    "".length();
                    return (-" ".length()) > ((38 ^ 121) & ((100 ^ 59) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIlIlllllIII[1];
            });
        };
    }

    private static String lIlIlllIIIlIIII(String llllllllllllllIllllIIlllIlIllIII, String llllllllllllllIllllIIlllIlIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlllIlIllIIl.getBytes(StandardCharsets.UTF_8)), lIIlIlllllIII[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlllllIII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIlllIlIllIll) {
            llllllllllllllIllllIIlllIlIllIll.printStackTrace();
            return null;
        }
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
