package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.f  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/f.class */
public final class f {
    public static final /* synthetic */ f RIGOUR;
    public static final /* synthetic */ f EAGLE_EYE;
    public static final /* synthetic */ f PIETY;
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ f MYSTIC_MIGHT;
    public static final /* synthetic */ f CHIVALRY;
    public static final /* synthetic */ f ULTIMATE_STRENGTH;
    private static /* synthetic */ String[] llllIlIlllI;
    private final /* synthetic */ List<Prayer> prayers;
    public static final /* synthetic */ f AUGURY;
    private static /* synthetic */ int[] llllIllIIII;

    private static String lIllIlIlllllIl(String llllllllllllllllIIIllIIIllIIlIII, String llllllllllllllllIIIllIIIllIIIllI) {
        String llllllllllllllllIIIllIIIllIIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIIIllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIIIllIIIlII = new StringBuilder();
        char[] charArray = llllllllllllllllIIIllIIIllIIIllI.toCharArray();
        int llllllllllllllllIIIllIIIllIIIIIl = llllIllIIII[0];
        char[] charArray2 = llllllllllllllllIIIllIIIllIIlIII2.toCharArray();
        int length = charArray2.length;
        int i = llllIllIIII[0];
        while (lIllIllIIIlIIl(i, length)) {
            char llllllllllllllllIIIllIIIllIIlIlI = charArray2[i];
            llllllllllllllllIIIllIIIllIIIlII.append((char) (llllllllllllllllIIIllIIIllIIlIlI ^ charArray[llllllllllllllllIIIllIIIllIIIIIl % charArray.length]));
            "".length();
            llllllllllllllllIIIllIIIllIIIIIl++;
            i++;
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIIllIIIllIIIlII);
    }

    private f(String str, int i, Prayer... prayerArr) {
        this.prayers = (List) Stream.of((Object[]) prayerArr).collect(Collectors.toList());
    }

    private static String lIllIlIlllllII(String llllllllllllllllIIIllIIIlIlIlIlI, String llllllllllllllllIIIllIIIlIlIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIIIllIIIlIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIIIlIlIllII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIIIlIlIllII.init(llllIllIIII[2], llllllllllllllllIIIllIIIlIlIllIl);
            return new String(llllllllllllllllIIIllIIIlIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIIIlIlIlIll) {
            llllllllllllllllIIIllIIIlIlIlIll.printStackTrace();
            return null;
        }
    }

    public List<Prayer> I() {
        return this.prayers;
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    private static String lIllIlIllllIll(String llllllllllllllllIIIllIIIlllIIIll, String llllllllllllllllIIIllIIIlllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIIlllIIIlI.getBytes(StandardCharsets.UTF_8)), llllIllIIII[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIllIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIIIlllIIlII) {
            llllllllllllllllIIIllIIIlllIIlII.printStackTrace();
            return null;
        }
    }

    static {
        lIllIllIIIlIII();
        lIllIlIlllllll();
        String str = llllIlIlllI[llllIllIIII[0]];
        int i = llllIllIIII[0];
        Prayer[] prayerArr = new Prayer[llllIllIIII[1]];
        prayerArr[llllIllIIII[0]] = Prayer.RIGOUR;
        RIGOUR = new f(str, i, prayerArr);
        String str2 = llllIlIlllI[llllIllIIII[1]];
        int i2 = llllIllIIII[1];
        Prayer[] prayerArr2 = new Prayer[llllIllIIII[1]];
        prayerArr2[llllIllIIII[0]] = Prayer.AUGURY;
        AUGURY = new f(str2, i2, prayerArr2);
        String str3 = llllIlIlllI[llllIllIIII[2]];
        int i3 = llllIllIIII[2];
        Prayer[] prayerArr3 = new Prayer[llllIllIIII[1]];
        prayerArr3[llllIllIIII[0]] = Prayer.PIETY;
        PIETY = new f(str3, i3, prayerArr3);
        String str4 = llllIlIlllI[llllIllIIII[3]];
        int i4 = llllIllIIII[3];
        Prayer[] prayerArr4 = new Prayer[llllIllIIII[1]];
        prayerArr4[llllIllIIII[0]] = Prayer.CHIVALRY;
        CHIVALRY = new f(str4, i4, prayerArr4);
        String str5 = llllIlIlllI[llllIllIIII[4]];
        int i5 = llllIllIIII[4];
        Prayer[] prayerArr5 = new Prayer[llllIllIIII[3]];
        prayerArr5[llllIllIIII[0]] = Prayer.ULTIMATE_STRENGTH;
        prayerArr5[llllIllIIII[1]] = Prayer.INCREDIBLE_REFLEXES;
        prayerArr5[llllIllIIII[2]] = Prayer.STEEL_SKIN;
        ULTIMATE_STRENGTH = new f(str5, i5, prayerArr5);
        String str6 = llllIlIlllI[llllIllIIII[5]];
        int i6 = llllIllIIII[5];
        Prayer[] prayerArr6 = new Prayer[llllIllIIII[1]];
        prayerArr6[llllIllIIII[0]] = Prayer.EAGLE_EYE;
        EAGLE_EYE = new f(str6, i6, prayerArr6);
        String str7 = llllIlIlllI[llllIllIIII[6]];
        int i7 = llllIllIIII[6];
        Prayer[] prayerArr7 = new Prayer[llllIllIIII[1]];
        prayerArr7[llllIllIIII[0]] = Prayer.MYSTIC_MIGHT;
        MYSTIC_MIGHT = new f(str7, i7, prayerArr7);
        f[] fVarArr = new f[llllIllIIII[7]];
        fVarArr[llllIllIIII[0]] = RIGOUR;
        fVarArr[llllIllIIII[1]] = AUGURY;
        fVarArr[llllIllIIII[2]] = PIETY;
        fVarArr[llllIllIIII[3]] = CHIVALRY;
        fVarArr[llllIllIIII[4]] = ULTIMATE_STRENGTH;
        fVarArr[llllIllIIII[5]] = EAGLE_EYE;
        fVarArr[llllIllIIII[6]] = MYSTIC_MIGHT;
        $VALUES = fVarArr;
    }

    private static void lIllIllIIIlIII() {
        llllIllIIII = new int[9];
        llllIllIIII[0] = (58 ^ 27) & ((183 ^ 150) ^ (-1));
        llllIllIIII[1] = " ".length();
        llllIllIIII[2] = "  ".length();
        llllIllIIII[3] = "   ".length();
        llllIllIIII[4] = 131 ^ 135;
        llllIllIIII[5] = (((103 + 163) - 232) + 153) ^ (((106 + 40) - 23) + 67);
        llllIllIIII[6] = (35 ^ 91) ^ (201 ^ 183);
        llllIllIIII[7] = (46 ^ 4) ^ (64 ^ 109);
        llllIllIIII[8] = 28 ^ 20;
    }

    private static void lIllIlIlllllll() {
        llllIlIlllI = new String[llllIllIIII[7]];
        llllIlIlllI[llllIllIIII[0]] = lIllIlIllllIll("E7qLrPTWJIk=", "DbYcp");
        llllIlIlllI[llllIllIIII[1]] = lIllIlIlllllII("pNveP9zw8CM=", "EDXcQ");
        llllIlIlllI[llllIllIIII[2]] = lIllIlIlllllIl("BhwhJhI=", "VUdrK");
        llllIlIlllI[llllIllIIII[3]] = lIllIlIlllllII("otcWPseb/egn16WWv1dWnQ==", "lYdmG");
        llllIlIlllI[llllIllIIII[4]] = lIllIlIlllllIl("LSk9IAM5MSw2HSw3LCcJLC0=", "xeiiN");
        llllIlIlllI[llllIllIIII[5]] = lIllIlIlllllII("XJkTsT7ureO17CHeXurUbQ==", "XqSjG");
        llllIlIlllI[llllIllIIII[6]] = lIllIlIlllllIl("ICgBPxwuLh8iEiUl", "mqRkU");
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    private static boolean lIllIllIIIlIIl(int i, int i2) {
        return i < i2;
    }
}
