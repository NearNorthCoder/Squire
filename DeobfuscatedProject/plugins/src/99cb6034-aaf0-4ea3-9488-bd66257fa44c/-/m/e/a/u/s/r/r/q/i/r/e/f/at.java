/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aw;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class at
extends Enum<at>
implements aw {
    public static final /* synthetic */ /* enum */ at IRIT;
    public static final /* synthetic */ /* enum */ at TARROMIN;
    public static final /* synthetic */ /* enum */ at DEFAULT;
    private static final /* synthetic */ at[] $VALUES;
    private static /* synthetic */ int[] llIIIIlIllll;
    public static final /* synthetic */ /* enum */ at DWARF_WEED;
    private static /* synthetic */ String[] llIIIIlIlllI;
    public static final /* synthetic */ /* enum */ at TORSTOL;
    public static final /* synthetic */ /* enum */ at AVANTOE;
    public static final /* synthetic */ /* enum */ at LANTADYME;
    private final /* synthetic */ av produceSeed;
    public static final /* synthetic */ /* enum */ at CADANTINE;
    public static final /* synthetic */ /* enum */ at KWUARM;
    public static final /* synthetic */ /* enum */ at GUAM;
    public static final /* synthetic */ /* enum */ at TOADFLAX;
    public static final /* synthetic */ /* enum */ at RANARR;
    public static final /* synthetic */ /* enum */ at SNAPDRAGON;
    public static final /* synthetic */ /* enum */ at NOTHING;
    public static final /* synthetic */ /* enum */ at HARRALANDER;

    public static at[] values() {
        return (at[])$VALUES.clone();
    }

    static {
        at.llllIIlIllIlIl();
        at.llllIIlIllIlII();
        NOTHING = new at(null);
        DEFAULT = new at(av.DEFAULT);
        GUAM = new at(av.GUAM);
        TARROMIN = new at(av.TARROMIN);
        HARRALANDER = new at(av.HARRALANDER);
        RANARR = new at(av.RANNAR_WEED);
        SNAPDRAGON = new at(av.SNAPDRAGON);
        TOADFLAX = new at(av.TOADFLAX);
        IRIT = new at(av.IRIT);
        CADANTINE = new at(av.CADANTINE);
        LANTADYME = new at(av.LANTADYME);
        DWARF_WEED = new at(av.DWARF_WEED);
        TORSTOL = new at(av.TORSTOL);
        AVANTOE = new at(av.AVANTOE);
        KWUARM = new at(av.KWUARM);
        at[] atArray = new at[llIIIIlIllll[15]];
        atArray[at.llIIIIlIllll[0]] = NOTHING;
        atArray[at.llIIIIlIllll[1]] = DEFAULT;
        atArray[at.llIIIIlIllll[2]] = GUAM;
        atArray[at.llIIIIlIllll[3]] = TARROMIN;
        atArray[at.llIIIIlIllll[4]] = HARRALANDER;
        atArray[at.llIIIIlIllll[5]] = RANARR;
        atArray[at.llIIIIlIllll[6]] = SNAPDRAGON;
        atArray[at.llIIIIlIllll[7]] = TOADFLAX;
        atArray[at.llIIIIlIllll[8]] = IRIT;
        atArray[at.llIIIIlIllll[9]] = CADANTINE;
        atArray[at.llIIIIlIllll[10]] = LANTADYME;
        atArray[at.llIIIIlIllll[11]] = DWARF_WEED;
        atArray[at.llIIIIlIllll[12]] = TORSTOL;
        atArray[at.llIIIIlIllll[13]] = AVANTOE;
        atArray[at.llIIIIlIllll[14]] = KWUARM;
        $VALUES = atArray;
    }

    public static at valueOf(String string) {
        return Enum.valueOf(at.class, string);
    }

    private static String llllIIlIllIIlI(String lllllllllllllllIlIlIlIlIllIllIll, String lllllllllllllllIlIlIlIlIllIllIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIlIllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIllIllIII.getBytes(StandardCharsets.UTF_8)), llIIIIlIllll[8]), "DES");
            Cipher lllllllllllllllIlIlIlIlIllIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlIlIllIlllIl.init(llIIIIlIllll[2], lllllllllllllllIlIlIlIlIllIllllI);
            return new String(lllllllllllllllIlIlIlIlIllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlIlIllIlllII) {
            lllllllllllllllIlIlIlIlIllIlllII.printStackTrace();
            return null;
        }
    }

    private static String llllIIlIlIlllI(String lllllllllllllllIlIlIlIllIIIIIIII, String lllllllllllllllIlIlIlIlIllllllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIllIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlIllIIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIllIIIIIIlI.init(llIIIIlIllll[2], lllllllllllllllIlIlIlIllIIIIIIll);
            return new String(lllllllllllllllIlIlIlIllIIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlIllIIIIIIIl) {
            lllllllllllllllIlIlIlIllIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static String llllIIlIlIllII(String lllllllllllllllIlIlIlIlIllllIIII, String lllllllllllllllIlIlIlIlIlllIllll) {
        lllllllllllllllIlIlIlIlIllllIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlIlIlllIlllI = new StringBuilder();
        char[] lllllllllllllllIlIlIlIlIlllIllIl = lllllllllllllllIlIlIlIlIlllIllll.toCharArray();
        int lllllllllllllllIlIlIlIlIlllIllII = llIIIIlIllll[0];
        char[] lllllllllllllllIlIlIlIlIlllIIllI = lllllllllllllllIlIlIlIlIllllIIII.toCharArray();
        int lllllllllllllllIlIlIlIlIlllIIlIl = lllllllllllllllIlIlIlIlIlllIIllI.length;
        int lllllllllllllllIlIlIlIlIlllIIlII = llIIIIlIllll[0];
        while (at.llllIIlIllIllI(lllllllllllllllIlIlIlIlIlllIIlII, lllllllllllllllIlIlIlIlIlllIIlIl)) {
            char lllllllllllllllIlIlIlIlIllllIIIl = lllllllllllllllIlIlIlIlIlllIIllI[lllllllllllllllIlIlIlIlIlllIIlII];
            lllllllllllllllIlIlIlIlIlllIlllI.append((char)(lllllllllllllllIlIlIlIlIllllIIIl ^ lllllllllllllllIlIlIlIlIlllIllIl[lllllllllllllllIlIlIlIlIlllIllII % lllllllllllllllIlIlIlIlIlllIllIl.length]));
            "".length();
            ++lllllllllllllllIlIlIlIlIlllIllII;
            ++lllllllllllllllIlIlIlIlIlllIIlII;
            "".length();
            if ("  ".length() != (0x97 ^ 0xAB ^ (0x72 ^ 0x4A))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIlIlIlllIlllI);
    }

    private at(av av2) {
        this.produceSeed = av2;
    }

    private static void llllIIlIllIlII() {
        llIIIIlIlllI = new String[llIIIIlIllll[15]];
        at.llIIIIlIlllI[at.llIIIIlIllll[0]] = at.llllIIlIlIllII("Dy0COTMPJQ==", "AbVqz");
        at.llIIIIlIlllI[at.llIIIIlIllll[1]] = at.llllIIlIlIllII("AgM0Jy8KEg==", "FFrfz");
        at.llIIIIlIlllI[at.llIIIIlIllll[2]] = at.llllIIlIlIlllI("rav7U32ldPs=", "CYICb");
        at.llIIIIlIlllI[at.llIIIIlIllll[3]] = at.llllIIlIllIIlI("+p4tuz4rvMYO2NUzj+zniQ==", "oAqqZ");
        at.llIIIIlIlllI[at.llIIIIlIllll[4]] = at.llllIIlIlIllII("ATQhBCcFND0SIxs=", "IusVf");
        at.llIIIIlIlllI[at.llIIIIlIllll[5]] = at.llllIIlIlIlllI("wkjKuguNgPc=", "HYXeL");
        at.llIIIIlIlllI[at.llIIIIlIllll[6]] = at.llllIIlIlIllII("Fy0IIykWIg48Iw==", "DcIsm");
        at.llIIIIlIlllI[at.llIIIIlIllll[7]] = at.llllIIlIllIIlI("3rz5W0q1wh6ptu44pM5fKQ==", "jutzF");
        at.llIIIIlIlllI[at.llIIIIlIllll[8]] = at.llllIIlIlIlllI("IAfz2rhvsyw=", "Mljha");
        at.llIIIIlIlllI[at.llIIIIlIllll[9]] = at.llllIIlIlIllII("MQsNKSQmAwct", "rJIhj");
        at.llIIIIlIlllI[at.llIIIIlIllll[10]] = at.llllIIlIlIllII("GgsBNjYSEwIn", "VJObw");
        at.llIIIIlIlllI[at.llIIIIlIllll[11]] = at.llllIIlIlIlllI("uq/+/w9Qek3/iHkQ0haJlw==", "BNGHR");
        at.llIIIIlIlllI[at.llIIIIlIllll[12]] = at.llllIIlIlIllII("ATo0ARAaOQ==", "UufRD");
        at.llIIIIlIlllI[at.llIIIIlIllll[13]] = at.llllIIlIllIIlI("0CZhIfLcbd0=", "YumQy");
        at.llIIIIlIlllI[at.llIIIIlIllll[14]] = at.llllIIlIlIlllI("26QT0tFKcsI=", "VjbdY");
    }

    @Override
    public av bf() {
        return this.produceSeed;
    }

    private static void llllIIlIllIlIl() {
        llIIIIlIllll = new int[16];
        at.llIIIIlIllll[0] = (135 + 128 - 216 + 119 ^ 16 + 77 - -33 + 32) & (0x36 ^ 0x1B ^ (0x9D ^ 0x88) ^ -" ".length());
        at.llIIIIlIllll[1] = " ".length();
        at.llIIIIlIllll[2] = "  ".length();
        at.llIIIIlIllll[3] = "   ".length();
        at.llIIIIlIllll[4] = 1 ^ 5;
        at.llIIIIlIllll[5] = 0xC4 ^ 0xC1;
        at.llIIIIlIllll[6] = 0x33 ^ 0x35;
        at.llIIIIlIllll[7] = 0x5B ^ 0x5C;
        at.llIIIIlIllll[8] = 0x88 ^ 0x80;
        at.llIIIIlIllll[9] = 0xA9 ^ 0xA0;
        at.llIIIIlIllll[10] = 0x95 ^ 0x9F;
        at.llIIIIlIllll[11] = 7 ^ 0x73 ^ 98 + 63 - 107 + 73;
        at.llIIIIlIllll[12] = 0x11 ^ 0x1D;
        at.llIIIIlIllll[13] = 0x1D ^ 0x5D ^ (0x56 ^ 0x1B);
        at.llIIIIlIllll[14] = 0x8B ^ 0x85;
        at.llIIIIlIllll[15] = 119 + 128 - 205 + 115 ^ 71 + 3 - 44 + 116;
    }

    private static boolean llllIIlIllIllI(int n2, int n3) {
        return n2 < n3;
    }
}

