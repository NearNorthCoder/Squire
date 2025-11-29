package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.at  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/at.class */
public final class EnumC0020at implements InterfaceC0023aw {
    public static final /* synthetic */ EnumC0020at IRIT;
    public static final /* synthetic */ EnumC0020at TARROMIN;
    public static final /* synthetic */ EnumC0020at DEFAULT;
    private static final /* synthetic */ EnumC0020at[] $VALUES;
    private static /* synthetic */ int[] llIIIIlIllll;
    public static final /* synthetic */ EnumC0020at DWARF_WEED;
    private static /* synthetic */ String[] llIIIIlIlllI;
    public static final /* synthetic */ EnumC0020at TORSTOL;
    public static final /* synthetic */ EnumC0020at AVANTOE;
    public static final /* synthetic */ EnumC0020at LANTADYME;
    private final /* synthetic */ EnumC0022av produceSeed;
    public static final /* synthetic */ EnumC0020at CADANTINE;
    public static final /* synthetic */ EnumC0020at KWUARM;
    public static final /* synthetic */ EnumC0020at GUAM;
    public static final /* synthetic */ EnumC0020at TOADFLAX;
    public static final /* synthetic */ EnumC0020at RANARR;
    public static final /* synthetic */ EnumC0020at SNAPDRAGON;
    public static final /* synthetic */ EnumC0020at NOTHING;
    public static final /* synthetic */ EnumC0020at HARRALANDER;

    public static EnumC0020at[] values() {
        return (EnumC0020at[]) $VALUES.clone();
    }

    static {
        llllIIlIllIlIl();
        llllIIlIllIlII();
        NOTHING = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[0]], llIIIIlIllll[0], null);
        DEFAULT = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[1]], llIIIIlIllll[1], EnumC0022av.DEFAULT);
        GUAM = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[2]], llIIIIlIllll[2], EnumC0022av.GUAM);
        TARROMIN = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[3]], llIIIIlIllll[3], EnumC0022av.TARROMIN);
        HARRALANDER = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[4]], llIIIIlIllll[4], EnumC0022av.HARRALANDER);
        RANARR = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[5]], llIIIIlIllll[5], EnumC0022av.RANNAR_WEED);
        SNAPDRAGON = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[6]], llIIIIlIllll[6], EnumC0022av.SNAPDRAGON);
        TOADFLAX = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[7]], llIIIIlIllll[7], EnumC0022av.TOADFLAX);
        IRIT = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[8]], llIIIIlIllll[8], EnumC0022av.IRIT);
        CADANTINE = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[9]], llIIIIlIllll[9], EnumC0022av.CADANTINE);
        LANTADYME = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[10]], llIIIIlIllll[10], EnumC0022av.LANTADYME);
        DWARF_WEED = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[11]], llIIIIlIllll[11], EnumC0022av.DWARF_WEED);
        TORSTOL = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[12]], llIIIIlIllll[12], EnumC0022av.TORSTOL);
        AVANTOE = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[13]], llIIIIlIllll[13], EnumC0022av.AVANTOE);
        KWUARM = new EnumC0020at(llIIIIlIlllI[llIIIIlIllll[14]], llIIIIlIllll[14], EnumC0022av.KWUARM);
        EnumC0020at[] enumC0020atArr = new EnumC0020at[llIIIIlIllll[15]];
        enumC0020atArr[llIIIIlIllll[0]] = NOTHING;
        enumC0020atArr[llIIIIlIllll[1]] = DEFAULT;
        enumC0020atArr[llIIIIlIllll[2]] = GUAM;
        enumC0020atArr[llIIIIlIllll[3]] = TARROMIN;
        enumC0020atArr[llIIIIlIllll[4]] = HARRALANDER;
        enumC0020atArr[llIIIIlIllll[5]] = RANARR;
        enumC0020atArr[llIIIIlIllll[6]] = SNAPDRAGON;
        enumC0020atArr[llIIIIlIllll[7]] = TOADFLAX;
        enumC0020atArr[llIIIIlIllll[8]] = IRIT;
        enumC0020atArr[llIIIIlIllll[9]] = CADANTINE;
        enumC0020atArr[llIIIIlIllll[10]] = LANTADYME;
        enumC0020atArr[llIIIIlIllll[11]] = DWARF_WEED;
        enumC0020atArr[llIIIIlIllll[12]] = TORSTOL;
        enumC0020atArr[llIIIIlIllll[13]] = AVANTOE;
        enumC0020atArr[llIIIIlIllll[14]] = KWUARM;
        $VALUES = enumC0020atArr;
    }

    public static EnumC0020at valueOf(String str) {
        return (EnumC0020at) Enum.valueOf(EnumC0020at.class, str);
    }

    private static String llllIIlIllIIlI(String lllllllllllllllIlIlIlIlIllIllIll, String lllllllllllllllIlIlIlIlIllIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIlIllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIllIllIlI.getBytes(StandardCharsets.UTF_8)), llIIIIlIllll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIlIllll[2], lllllllllllllllIlIlIlIlIllIllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIlIllIlllII) {
            lllllllllllllllIlIlIlIlIllIlllII.printStackTrace();
            return null;
        }
    }

    private static String llllIIlIlIlllI(String lllllllllllllllIlIlIlIllIIIIIIII, String lllllllllllllllIlIlIlIlIllllllll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIllIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIlIllll[2], lllllllllllllllIlIlIlIllIIIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIllIIIIIIIl) {
            lllllllllllllllIlIlIlIllIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static String llllIIlIlIllII(String lllllllllllllllIlIlIlIlIlllIlIll, String lllllllllllllllIlIlIlIlIlllIllll) {
        String lllllllllllllllIlIlIlIlIlllIlIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIlllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlIlIlllIlllI = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIlIlIlllIllll.toCharArray();
        int lllllllllllllllIlIlIlIlIlllIllII = llIIIIlIllll[0];
        char[] charArray2 = lllllllllllllllIlIlIlIlIlllIlIll2.toCharArray();
        int length = charArray2.length;
        int i = llIIIIlIllll[0];
        while (llllIIlIllIllI(i, length)) {
            lllllllllllllllIlIlIlIlIlllIlllI.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIlIlIlIlllIllII % charArray.length]));
            "".length();
            lllllllllllllllIlIlIlIlIlllIllII++;
            i++;
            "".length();
            if ("  ".length() == ((151 ^ 171) ^ (114 ^ 74))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIlIlIlllIlllI);
    }

    private EnumC0020at(String str, int i, EnumC0022av enumC0022av) {
        this.produceSeed = enumC0022av;
    }

    private static void llllIIlIllIlII() {
        llIIIIlIlllI = new String[llIIIIlIllll[15]];
        llIIIIlIlllI[llIIIIlIllll[0]] = llllIIlIlIllII("Dy0COTMPJQ==", "AbVqz");
        llIIIIlIlllI[llIIIIlIllll[1]] = llllIIlIlIllII("AgM0Jy8KEg==", "FFrfz");
        llIIIIlIlllI[llIIIIlIllll[2]] = llllIIlIlIlllI("rav7U32ldPs=", "CYICb");
        llIIIIlIlllI[llIIIIlIllll[3]] = llllIIlIllIIlI("+p4tuz4rvMYO2NUzj+zniQ==", "oAqqZ");
        llIIIIlIlllI[llIIIIlIllll[4]] = llllIIlIlIllII("ATQhBCcFND0SIxs=", "IusVf");
        llIIIIlIlllI[llIIIIlIllll[5]] = llllIIlIlIlllI("wkjKuguNgPc=", "HYXeL");
        llIIIIlIlllI[llIIIIlIllll[6]] = llllIIlIlIllII("Fy0IIykWIg48Iw==", "DcIsm");
        llIIIIlIlllI[llIIIIlIllll[7]] = llllIIlIllIIlI("3rz5W0q1wh6ptu44pM5fKQ==", "jutzF");
        llIIIIlIlllI[llIIIIlIllll[8]] = llllIIlIlIlllI("IAfz2rhvsyw=", "Mljha");
        llIIIIlIlllI[llIIIIlIllll[9]] = llllIIlIlIllII("MQsNKSQmAwct", "rJIhj");
        llIIIIlIlllI[llIIIIlIllll[10]] = llllIIlIlIllII("GgsBNjYSEwIn", "VJObw");
        llIIIIlIlllI[llIIIIlIllll[11]] = llllIIlIlIlllI("uq/+/w9Qek3/iHkQ0haJlw==", "BNGHR");
        llIIIIlIlllI[llIIIIlIllll[12]] = llllIIlIlIllII("ATo0ARAaOQ==", "UufRD");
        llIIIIlIlllI[llIIIIlIllll[13]] = llllIIlIllIIlI("0CZhIfLcbd0=", "YumQy");
        llIIIIlIlllI[llIIIIlIllll[14]] = llllIIlIlIlllI("26QT0tFKcsI=", "VjbdY");
    }

    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.InterfaceC0023aw
    public EnumC0022av bf() {
        return this.produceSeed;
    }

    private static void llllIIlIllIlIl() {
        llIIIIlIllll = new int[16];
        llIIIIlIllll[0] = ((((135 + 128) - 216) + 119) ^ (((16 + 77) - (-33)) + 32)) & (((54 ^ 27) ^ (157 ^ 136)) ^ (-" ".length()));
        llIIIIlIllll[1] = " ".length();
        llIIIIlIllll[2] = "  ".length();
        llIIIIlIllll[3] = "   ".length();
        llIIIIlIllll[4] = 1 ^ 5;
        llIIIIlIllll[5] = 196 ^ 193;
        llIIIIlIllll[6] = 51 ^ 53;
        llIIIIlIllll[7] = 91 ^ 92;
        llIIIIlIllll[8] = 136 ^ 128;
        llIIIIlIllll[9] = 169 ^ 160;
        llIIIIlIllll[10] = 149 ^ 159;
        llIIIIlIllll[11] = (7 ^ 115) ^ (((98 + 63) - 107) + 73);
        llIIIIlIllll[12] = 17 ^ 29;
        llIIIIlIllll[13] = (29 ^ 93) ^ (86 ^ 27);
        llIIIIlIllll[14] = 139 ^ 133;
        llIIIIlIllll[15] = (((119 + 128) - 205) + 115) ^ (((71 + 3) - 44) + 116);
    }

    private static boolean llllIIlIllIllI(int i, int i2) {
        return i < i2;
    }
}
