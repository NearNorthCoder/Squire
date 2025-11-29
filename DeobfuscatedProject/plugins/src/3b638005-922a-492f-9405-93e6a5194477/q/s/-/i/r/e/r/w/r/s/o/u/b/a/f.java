/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

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

public final class f
extends Enum<f> {
    public static final /* synthetic */ /* enum */ f RIGOUR;
    public static final /* synthetic */ /* enum */ f EAGLE_EYE;
    public static final /* synthetic */ /* enum */ f PIETY;
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ /* enum */ f MYSTIC_MIGHT;
    public static final /* synthetic */ /* enum */ f CHIVALRY;
    public static final /* synthetic */ /* enum */ f ULTIMATE_STRENGTH;
    private static /* synthetic */ String[] llllIlIlllI;
    private final /* synthetic */ List<Prayer> prayers;
    public static final /* synthetic */ /* enum */ f AUGURY;
    private static /* synthetic */ int[] llllIllIIII;

    private static String lIllIlIlllllIl(String llllllllllllllllIIIllIIIllIIIIII, String llllllllllllllllIIIllIIIlIlllllI) {
        llllllllllllllllIIIllIIIllIIIIII = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIIIllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIIIllIIIlII = new StringBuilder();
        char[] llllllllllllllllIIIllIIIllIIIIlI = llllllllllllllllIIIllIIIlIlllllI.toCharArray();
        int llllllllllllllllIIIllIIIllIIIIIl = llllIllIIII[0];
        char[] llllllllllllllllIIIllIIIlIlllIII = llllllllllllllllIIIllIIIllIIIIII.toCharArray();
        int llllllllllllllllIIIllIIIlIllIllI = llllllllllllllllIIIllIIIlIlllIII.length;
        int llllllllllllllllIIIllIIIlIllIlIl = llllIllIIII[0];
        while (f.lIllIllIIIlIIl(llllllllllllllllIIIllIIIlIllIlIl, llllllllllllllllIIIllIIIlIllIllI)) {
            char llllllllllllllllIIIllIIIllIIlIlI = llllllllllllllllIIIllIIIlIlllIII[llllllllllllllllIIIllIIIlIllIlIl];
            llllllllllllllllIIIllIIIllIIIlII.append((char)(llllllllllllllllIIIllIIIllIIlIlI ^ llllllllllllllllIIIllIIIllIIIIlI[llllllllllllllllIIIllIIIllIIIIIl % llllllllllllllllIIIllIIIllIIIIlI.length]));
            "".length();
            ++llllllllllllllllIIIllIIIllIIIIIl;
            ++llllllllllllllllIIIllIIIlIllIlIl;
            "".length();
            if (" ".length() >= " ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIllIIIllIIIlII);
    }

    private f(Prayer ... prayerArray) {
        this.prayers = Stream.of(prayerArray).collect(Collectors.toList());
    }

    private static String lIllIlIlllllII(String llllllllllllllllIIIllIIIlIlIlIII, String llllllllllllllllIIIllIIIlIlIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIIIllIIIlIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIIIlIlIllII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIIIlIlIllII.init(llllIllIIII[2], llllllllllllllllIIIllIIIlIlIllIl);
            return new String(llllllllllllllllIIIllIIIlIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIIlIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIIIlIlIlIll) {
            llllllllllllllllIIIllIIIlIlIlIll.printStackTrace();
            return null;
        }
    }

    public List<Prayer> I() {
        return this.prayers;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static String lIllIlIllllIll(String llllllllllllllllIIIllIIIlllIIIll, String llllllllllllllllIIIllIIIlllIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIIllIIIlllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIIlllIIIlI.getBytes(StandardCharsets.UTF_8)), llllIllIIII[8]), "DES");
            Cipher llllllllllllllllIIIllIIIlllIIlIl = Cipher.getInstance("DES");
            llllllllllllllllIIIllIIIlllIIlIl.init(llllIllIIII[2], llllllllllllllllIIIllIIIlllIIllI);
            return new String(llllllllllllllllIIIllIIIlllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIIIlllIIlII) {
            llllllllllllllllIIIllIIIlllIIlII.printStackTrace();
            return null;
        }
    }

    static {
        f.lIllIllIIIlIII();
        f.lIllIlIlllllll();
        Prayer[] prayerArray = new Prayer[llllIllIIII[1]];
        prayerArray[f.llllIllIIII[0]] = Prayer.RIGOUR;
        RIGOUR = new f(prayerArray);
        Prayer[] prayerArray2 = new Prayer[llllIllIIII[1]];
        prayerArray2[f.llllIllIIII[0]] = Prayer.AUGURY;
        AUGURY = new f(prayerArray2);
        Prayer[] prayerArray3 = new Prayer[llllIllIIII[1]];
        prayerArray3[f.llllIllIIII[0]] = Prayer.PIETY;
        PIETY = new f(prayerArray3);
        Prayer[] prayerArray4 = new Prayer[llllIllIIII[1]];
        prayerArray4[f.llllIllIIII[0]] = Prayer.CHIVALRY;
        CHIVALRY = new f(prayerArray4);
        Prayer[] prayerArray5 = new Prayer[llllIllIIII[3]];
        prayerArray5[f.llllIllIIII[0]] = Prayer.ULTIMATE_STRENGTH;
        prayerArray5[f.llllIllIIII[1]] = Prayer.INCREDIBLE_REFLEXES;
        prayerArray5[f.llllIllIIII[2]] = Prayer.STEEL_SKIN;
        ULTIMATE_STRENGTH = new f(prayerArray5);
        Prayer[] prayerArray6 = new Prayer[llllIllIIII[1]];
        prayerArray6[f.llllIllIIII[0]] = Prayer.EAGLE_EYE;
        EAGLE_EYE = new f(prayerArray6);
        Prayer[] prayerArray7 = new Prayer[llllIllIIII[1]];
        prayerArray7[f.llllIllIIII[0]] = Prayer.MYSTIC_MIGHT;
        MYSTIC_MIGHT = new f(prayerArray7);
        f[] fArray = new f[llllIllIIII[7]];
        fArray[f.llllIllIIII[0]] = RIGOUR;
        fArray[f.llllIllIIII[1]] = AUGURY;
        fArray[f.llllIllIIII[2]] = PIETY;
        fArray[f.llllIllIIII[3]] = CHIVALRY;
        fArray[f.llllIllIIII[4]] = ULTIMATE_STRENGTH;
        fArray[f.llllIllIIII[5]] = EAGLE_EYE;
        fArray[f.llllIllIIII[6]] = MYSTIC_MIGHT;
        $VALUES = fArray;
    }

    private static void lIllIllIIIlIII() {
        llllIllIIII = new int[9];
        f.llllIllIIII[0] = (0x3A ^ 0x1B) & ~(0xB7 ^ 0x96);
        f.llllIllIIII[1] = " ".length();
        f.llllIllIIII[2] = "  ".length();
        f.llllIllIIII[3] = "   ".length();
        f.llllIllIIII[4] = 0x83 ^ 0x87;
        f.llllIllIIII[5] = 103 + 163 - 232 + 153 ^ 106 + 40 - 23 + 67;
        f.llllIllIIII[6] = 0x23 ^ 0x5B ^ (0xC9 ^ 0xB7);
        f.llllIllIIII[7] = 0x2E ^ 4 ^ (0x40 ^ 0x6D);
        f.llllIllIIII[8] = 0x1C ^ 0x14;
    }

    private static void lIllIlIlllllll() {
        llllIlIlllI = new String[llllIllIIII[7]];
        f.llllIlIlllI[f.llllIllIIII[0]] = f.lIllIlIllllIll("E7qLrPTWJIk=", "DbYcp");
        f.llllIlIlllI[f.llllIllIIII[1]] = f.lIllIlIlllllII("pNveP9zw8CM=", "EDXcQ");
        f.llllIlIlllI[f.llllIllIIII[2]] = f.lIllIlIlllllIl("BhwhJhI=", "VUdrK");
        f.llllIlIlllI[f.llllIllIIII[3]] = f.lIllIlIlllllII("otcWPseb/egn16WWv1dWnQ==", "lYdmG");
        f.llllIlIlllI[f.llllIllIIII[4]] = f.lIllIlIlllllIl("LSk9IAM5MSw2HSw3LCcJLC0=", "xeiiN");
        f.llllIlIlllI[f.llllIllIIII[5]] = f.lIllIlIlllllII("XJkTsT7ureO17CHeXurUbQ==", "XqSjG");
        f.llllIlIlllI[f.llllIllIIII[6]] = f.lIllIlIlllllIl("ICgBPxwuLh8iEiUl", "mqRkU");
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private static boolean lIllIllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }
}

