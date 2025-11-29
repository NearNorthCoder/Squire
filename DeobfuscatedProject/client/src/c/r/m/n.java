/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import c.r.m.G;
import c.r.m.o;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class n
extends Enum<n> {
    private static final /* synthetic */ Logger log;
    private static /* synthetic */ int[] lIIllIl;
    public static final /* synthetic */ /* enum */ n DIRECTDRAW;
    public static final /* synthetic */ /* enum */ n OFF;
    public static final /* synthetic */ /* enum */ n OPENGL;
    private static final /* synthetic */ n[] $VALUES;
    public static final /* synthetic */ /* enum */ n METAL;
    private static /* synthetic */ String[] lIIlIlI;

    private static void lIIlIllI() {
        lIIllIl = new int[16];
        n.lIIllIl[0] = (124 + 69 - 187 + 157 ^ 138 + 10 - 95 + 113) & (0x81 ^ 0xB4 ^ (0x7D ^ 0x4D) ^ -" ".length());
        n.lIIllIl[1] = " ".length();
        n.lIIllIl[2] = "  ".length();
        n.lIIllIl[3] = "   ".length();
        n.lIIllIl[4] = 0xFA ^ 0xC3 ^ (0x66 ^ 0x5B);
        n.lIIllIl[5] = 55 + 134 - 59 + 5 ^ 33 + 113 - 86 + 70;
        n.lIIllIl[6] = 0x21 ^ 0x34 ^ (0x32 ^ 0x21);
        n.lIIllIl[7] = 0x2F ^ 0x28;
        n.lIIllIl[8] = 118 + 80 - 176 + 121 ^ 54 + 20 - -9 + 52;
        n.lIIllIl[9] = 0x69 ^ 0x39 ^ (0x7F ^ 0x26);
        n.lIIllIl[10] = 0x7E ^ 0x74;
        n.lIIllIl[11] = 0x20 ^ 0x2B;
        n.lIIllIl[12] = 6 + 12 - 5 + 133 ^ 107 + 44 - 84 + 91;
        n.lIIllIl[13] = 0xBB ^ 0xB6;
        n.lIIllIl[14] = 0x11 ^ 0x60 ^ 15 + 29 - -40 + 43;
        n.lIIllIl[15] = 0x62 ^ 9 ^ (0x1A ^ 0x7E);
    }

    private static boolean lIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIlIl() {
        lIIlIlI = new String[lIIllIl[15]];
        n.lIIlIlI[n.lIIllIl[0]] = n.lIIlIIIl("+/kKtz9FtsyhuJvWVNbiwhMxj2EgN01xHoWMPOOZJ7jlYeT3M3RI4Q==", "WoFzz");
        n.lIIlIlI[n.lIIllIl[1]] = n.lIIlIIlI("bxccISZsOQ4iKXA3QTB7Jm4bJj0n", "BSoTH");
        n.lIIlIlI[n.lIIllIl[2]] = n.lIIlIIIl("UU4oF9PzBjn4ommWTSMTq4VP3NipqmzKpMYmX1o7QHc=", "RImBh");
        n.lIIlIlI[n.lIIllIl[3]] = n.lIIlIIll("XGziOWM35QyQ7ryvySHQU5xuvgrdlHzG", "iqVmr");
        n.lIIlIlI[n.lIIllIl[4]] = n.lIIlIIll("YVYM/OX2kRZfSgnjsLIzSr/JPbNoUks9NL5PpyEFC6k=", "Pqejn");
        n.lIIlIlI[n.lIIllIl[5]] = n.lIIlIIIl("gCfNxivme5EIzfdkiKcCPDvYaMP3+c1AwyLVOOtDPWQ=", "UiKWW");
        n.lIIlIlI[n.lIIllIl[6]] = n.lIIlIIlI("SjcLEDtJGRkTNFUXVgFmA04eBDkUFg==", "gsxeU");
        n.lIIlIlI[n.lIIllIl[7]] = n.lIIlIIll("McB1l1rXBV3XFhCiJ+skJZoDum0wf3MT1cLM6TQfoDNYiaKYOZwRvcTkD2jYSF8wtQM9CDU4LJJGZCl+joZMxiTpluf1GbyJ", "aystd");
        n.lIIlIlI[n.lIIllIl[8]] = n.lIIlIIll("iuHXdMkUi5v2eV+akEY8rwDFzGgBP6ttAV43KQLX/kY=", "rZqaJ");
        n.lIIlIlI[n.lIIllIl[9]] = n.lIIlIIIl("KAElWdyQd0/irW4RB0nLwRNjpOU2/8dhoXcfOg9Ac1k9I7xyOhgBQQ==", "HaZUt");
        n.lIIlIlI[n.lIIllIl[10]] = n.lIIlIIIl("B9oNGR04YUfyYT8VmDmb2gdVs/0vtacM", "JEifB");
        n.lIIlIlI[n.lIIllIl[11]] = n.lIIlIIIl("HwAohMxFhm8=", "wgMyW");
        n.lIIlIlI[n.lIIllIl[12]] = n.lIIlIIlI("IzA7MyszPTs3Pw==", "gyivh");
        n.lIIlIlI[n.lIIllIl[13]] = n.lIIlIIll("CuT3GadETv4=", "lxZGB");
        n.lIIlIlI[n.lIIllIl[14]] = n.lIIlIIlI("FBUMNjw=", "YPXwp");
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    static {
        n.lIIlIllI();
        n.lIIlIlIl();
        OFF = new n();
        DIRECTDRAW = new n();
        OPENGL = new n();
        METAL = new n();
        n[] nArray = new n[lIIllIl[4]];
        nArray[n.lIIllIl[0]] = OFF;
        nArray[n.lIIllIl[1]] = DIRECTDRAW;
        nArray[n.lIIllIl[2]] = OPENGL;
        nArray[n.lIIllIl[3]] = METAL;
        $VALUES = nArray;
        log = LoggerFactory.getLogger(n.class);
    }

    private static String lIIlIIlI(String llllIlIIIllIlll, String llllIlIIIllIllI) {
        llllIlIIIllIlll = new String(Base64.getDecoder().decode(llllIlIIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlIIIllIlIl = new StringBuilder();
        char[] llllIlIIIllIlII = llllIlIIIllIllI.toCharArray();
        int llllIlIIIllIIll = lIIllIl[0];
        char[] llllIlIIIlIllIl = llllIlIIIllIlll.toCharArray();
        int llllIlIIIlIllII = llllIlIIIlIllIl.length;
        int llllIlIIIlIlIll = lIIllIl[0];
        while (n.lIIllIIl(llllIlIIIlIlIll, llllIlIIIlIllII)) {
            char llllIlIIIlllIII = llllIlIIIlIllIl[llllIlIIIlIlIll];
            llllIlIIIllIlIl.append((char)(llllIlIIIlllIII ^ llllIlIIIllIlII[llllIlIIIllIIll % llllIlIIIllIlII.length]));
            "".length();
            ++llllIlIIIllIIll;
            ++llllIlIIIlIlIll;
            "".length();
            if (-"  ".length() < 0) continue;
            return null;
        }
        return String.valueOf(llllIlIIIllIlIl);
    }

    /*
     * WARNING - void declaration
     */
    public List<String> a(G g) {
        ArrayList<String> arrayList = new ArrayList<String>();
        switch (o.ak[this.ordinal()]) {
            case 1: {
                void llllIlIIlIIIIlI;
                void llllIlIIlIIIIll;
                if (n.lIIlIlll(llllIlIIlIIIIll, (Object)G.Windows)) {
                    throw new IllegalArgumentException(lIIlIlI[lIIllIl[0]]);
                }
                llllIlIIlIIIIlI.add(lIIlIlI[lIIllIl[1]]);
                "".length();
                llllIlIIlIIIIlI.add(lIIlIlI[lIIllIl[2]]);
                "".length();
                "".length();
                if ((0xBF ^ 0xBB) > " ".length()) break;
                return null;
            }
            case 2: {
                void llllIlIIlIIIIlI;
                void llllIlIIlIIIIll;
                if (n.lIIllIII(llllIlIIlIIIIll, (Object)G.Windows)) {
                    llllIlIIlIIIIlI.add(lIIlIlI[lIIllIl[3]]);
                    "".length();
                    "".length();
                    if ((0xB6 ^ 0xB2) <= 0) {
                        return null;
                    }
                } else if (n.lIIllIII(llllIlIIlIIIIll, (Object)G.MacOS)) {
                    llllIlIIlIIIIlI.add(lIIlIlI[lIIllIl[4]]);
                    "".length();
                }
                llllIlIIlIIIIlI.add(lIIlIlI[lIIllIl[5]]);
                "".length();
                "".length();
                if (null == null) break;
                return null;
            }
            case 3: {
                void llllIlIIlIIIIlI;
                void llllIlIIlIIIIll;
                if (n.lIIllIII(llllIlIIlIIIIll, (Object)G.Windows)) {
                    llllIlIIlIIIIlI.add(lIIlIlI[lIIllIl[6]]);
                    "".length();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                } else if (n.lIIllIII(llllIlIIlIIIIll, (Object)G.MacOS)) {
                    throw new IllegalArgumentException(lIIlIlI[lIIllIl[7]]);
                }
                llllIlIIlIIIIlI.add(lIIlIlI[lIIllIl[8]]);
                "".length();
                "".length();
                if (((125 + 44 - 129 + 107 ^ 149 + 22 - 101 + 84) & (125 + 97 - 185 + 118 ^ 50 + 19 - 56 + 133 ^ -" ".length())) == 0) break;
                return null;
            }
            case 4: {
                void llllIlIIlIIIIlI;
                void llllIlIIlIIIIll;
                if (n.lIIlIlll(llllIlIIlIIIIll, (Object)G.MacOS)) {
                    throw new IllegalArgumentException(lIIlIlI[lIIllIl[9]]);
                }
                llllIlIIlIIIIlI.add(lIIlIlI[lIIllIl[10]]);
                "".length();
            }
        }
        return arrayList;
    }

    private static String lIIlIIIl(String llllIlIIIIlIIll, String llllIlIIIIlIlII) {
        try {
            SecretKeySpec llllIlIIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIIIIlIlII.getBytes(StandardCharsets.UTF_8)), lIIllIl[8]), "DES");
            Cipher llllIlIIIIlIlll = Cipher.getInstance("DES");
            llllIlIIIIlIlll.init(lIIllIl[2], llllIlIIIIllIII);
            return new String(llllIlIIIIlIlll.doFinal(Base64.getDecoder().decode(llllIlIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlIIIIlIllI) {
            llllIlIIIIlIllI.printStackTrace();
            return null;
        }
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    private static boolean lIIllIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlll(Object object, Object object2) {
        return object != object2;
    }

    private static String lIIlIIll(String llllIlIIIlIIIII, String llllIlIIIlIIIIl) {
        try {
            SecretKeySpec llllIlIIIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlIIIlIIlII = Cipher.getInstance("Blowfish");
            llllIlIIIlIIlII.init(lIIllIl[2], llllIlIIIlIIlIl);
            return new String(llllIlIIIlIIlII.doFinal(Base64.getDecoder().decode(llllIlIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlIIIlIIIll) {
            llllIlIIIlIIIll.printStackTrace();
            return null;
        }
    }
}
