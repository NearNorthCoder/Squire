/*
 * Decompiled with CFR 0.152.
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.e;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.f;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.g;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.h;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.i;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.j;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.k;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
extends Enum<d> {
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d LOBSTER;
    public static final /* synthetic */ /* enum */ d XP_TOME;
    private static /* synthetic */ int[] lIIllIIllIIIl;
    private final /* synthetic */ List<Integer> rewardIds;
    public static final /* synthetic */ /* enum */ d WATERMELON_SEED;
    public static final /* synthetic */ /* enum */ d PURE_ESSENCE;
    private static /* synthetic */ String[] lIIllIIlIllll;
    public static final /* synthetic */ /* enum */ d SILVER_BAR;
    public static final /* synthetic */ /* enum */ d BOW_STRING;
    public static final /* synthetic */ /* enum */ d COAL_AND_IRON;
    private final /* synthetic */ int interfaceId;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ d HERB;

    private static String lIlIllllllIlllI(String llllllllllllllIllllIIIIlIIlIlIII, String llllllllllllllIllllIIIIlIIlIIlll) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIlIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), lIIllIIllIIIl[11]), "DES");
            Cipher llllllllllllllIllllIIIIlIIlIlIlI = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIlIIlIlIlI.init(lIIllIIllIIIl[2], llllllllllllllIllllIIIIlIIlIlIll);
            return new String(llllllllllllllIllllIIIIlIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIlIIlIlIIl) {
            llllllllllllllIllllIIIIlIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllllllIIll() {
        lIIllIIllIIIl = new int[20];
        d.lIIllIIllIIIl[0] = (0x7C ^ 0xB ^ (0x84 ^ 0xBE)) & (0x49 ^ 0x38 ^ (0x64 ^ 0x58) ^ -" ".length());
        d.lIIllIIllIIIl[1] = " ".length();
        d.lIIllIIllIIIl[2] = "  ".length();
        d.lIIllIIllIIIl[3] = "   ".length();
        d.lIIllIIllIIIl[4] = 0x51 ^ 0x13 ^ (0x80 ^ 0xC6);
        d.lIIllIIllIIIl[5] = 0xBF ^ 0xBA;
        d.lIIllIIllIIIl[6] = 128 + 40 - 120 + 143 ^ 138 + 133 - 129 + 43;
        d.lIIllIIllIIIl[7] = 0xFFFFDFFF & 0x2BEA;
        d.lIIllIIllIIIl[8] = (0xC7 ^ 0xA7) + (6 ^ 0x35) - (0x72 ^ 0xF) + (158 + 160 - 138 + 4);
        d.lIIllIIllIIIl[9] = 178 + 122 - 197 + 101;
        d.lIIllIIllIIIl[10] = 0x15 ^ 0x12;
        d.lIIllIIllIIIl[11] = 0x78 ^ 0x70;
        d.lIIllIIllIIIl[12] = 0x77 ^ 0x72 ^ (0xBC ^ 0xB0);
        d.lIIllIIllIIIl[13] = 0x92 ^ 0x98;
        d.lIIllIIllIIIl[14] = 0x55 ^ 0x5E;
        d.lIIllIIllIIIl[15] = 0xB5 ^ 0xB9;
        d.lIIllIIllIIIl[16] = 0x77 ^ 0x7A;
        d.lIIllIIllIIIl[17] = 8 ^ 0x50 ^ (0x37 ^ 0x61);
        d.lIIllIIllIIIl[18] = 10 + 70 - -4 + 90 ^ 62 + 122 - 137 + 114;
        d.lIIllIIllIIIl[19] = 0x57 ^ 0x21 ^ (0x31 ^ 0x57);
    }

    private static String lIlIllllllIllll(String llllllllllllllIllllIIIIlIIllIIll, String llllllllllllllIllllIIIIlIIllIlII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIlIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIlIIllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIlIIllIlll.init(lIIllIIllIIIl[2], llllllllllllllIllllIIIIlIIlllIII);
            return new String(llllllllllllllIllllIIIIlIIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIlIIllIllI) {
            llllllllllllllIllllIIIIlIIllIllI.printStackTrace();
            return null;
        }
    }

    private static String lIlIllllllIllIl(String llllllllllllllIllllIIIIlIIIllIII, String llllllllllllllIllllIIIIlIIIlIlll) {
        llllllllllllllIllllIIIIlIIIllIII = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIIlIIIlIllI = new StringBuilder();
        char[] llllllllllllllIllllIIIIlIIIlIlIl = llllllllllllllIllllIIIIlIIIlIlll.toCharArray();
        int llllllllllllllIllllIIIIlIIIlIlII = lIIllIIllIIIl[0];
        char[] llllllllllllllIllllIIIIlIIIIlllI = llllllllllllllIllllIIIIlIIIllIII.toCharArray();
        int llllllllllllllIllllIIIIlIIIIllIl = llllllllllllllIllllIIIIlIIIIlllI.length;
        int llllllllllllllIllllIIIIlIIIIllII = lIIllIIllIIIl[0];
        while (d.lIlIlllllllIlII(llllllllllllllIllllIIIIlIIIIllII, llllllllllllllIllllIIIIlIIIIllIl)) {
            char llllllllllllllIllllIIIIlIIIllIIl = llllllllllllllIllllIIIIlIIIIlllI[llllllllllllllIllllIIIIlIIIIllII];
            llllllllllllllIllllIIIIlIIIlIllI.append((char)(llllllllllllllIllllIIIIlIIIllIIl ^ llllllllllllllIllllIIIIlIIIlIlIl[llllllllllllllIllllIIIIlIIIlIlII % llllllllllllllIllllIIIIlIIIlIlIl.length]));
            "".length();
            ++llllllllllllllIllllIIIIlIIIlIlII;
            ++llllllllllllllIllllIIIIlIIIIllII;
            "".length();
            if ("  ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIIIlIIIlIllI);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public String y() {
        return this.name;
    }

    private d(int n3, List<Integer> list, String string2) {
        this.interfaceId = n3;
        this.rewardIds = list;
        this.name = string2;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public List<Integer> w() {
        return this.rewardIds;
    }

    private static void lIlIlllllllIIlI() {
        lIIllIIlIllll = new String[lIIllIIllIIIl[19]];
        d.lIIllIIlIllll[d.lIIllIIllIIIl[0]] = d.lIlIllllllIllIl("Hjg8KDwLPj0oLQ0o", "Nmnmc");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[1]] = d.lIlIllllllIlllI("PcKVBPq/lHMoviHNekz1fA==", "aaYlX");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[2]] = d.lIlIllllllIllll("Bcum+xFcphKs0XZ1NrUypg==", "dRfKK");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[3]] = d.lIlIllllllIllIl("Jx40WAMRAyoWFw==", "eqCxp");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[4]] = d.lIlIllllllIlllI("sThju1cn7oubwHx5WFJtpQ==", "GHxip");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[5]] = d.lIlIllllllIllll("qzsOI06ucjwtWLHP89nXQg==", "bThTZ");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[6]] = d.lIlIllllllIlllI("JcuiLicBj+U=", "opUjC");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[10]] = d.lIlIllllllIllIl("Ox0CJzo=", "sxpEI");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[11]] = d.lIlIllllllIllll("8tibqOyB8suRkQ48lz1rfw==", "bFHkN");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[12]] = d.lIlIllllllIlllI("L5yrT3a66ww=", "WWnlT");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[13]] = d.lIlIllllllIllll("puNRouNeuS5WCbOU25w1+Q==", "whqMq");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[14]] = d.lIlIllllllIllll("h461GjyslXmsORR2OegJXA==", "XpRHG");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[15]] = d.lIlIllllllIllIl("AyQmKzoKOQ==", "Okdxn");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[16]] = d.lIlIllllllIllIl("BAs2RDo5CDIQMyQ=", "VjAdV");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[17]] = d.lIlIllllllIllIl("Kzg+HCA+LQ==", "shaHo");
        d.lIIllIIlIllll[d.lIIllIIllIIIl[18]] = d.lIlIllllllIllIl("Ki0+DjscaD0AJB07", "xHIoI");
    }

    private static boolean lIlIlllllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    public int x() {
        return this.interfaceId;
    }

    static {
        d.lIlIlllllllIIll();
        d.lIlIlllllllIIlI();
        PURE_ESSENCE = new d(lIIllIIllIIIl[0], new e(), lIIllIIlIllll[lIIllIIllIIIl[1]]);
        BOW_STRING = new d(lIIllIIllIIIl[1], new f(), lIIllIIlIllll[lIIllIIllIIIl[3]]);
        SILVER_BAR = new d(lIIllIIllIIIl[2], new g(), lIIllIIlIllll[lIIllIIllIIIl[5]]);
        HERB = new d(lIIllIIllIIIl[3], List.of(Integer.valueOf(lIIllIIllIIIl[7]), Integer.valueOf(lIIllIIllIIIl[8]), Integer.valueOf(lIIllIIllIIIl[9])), lIIllIIlIllll[lIIllIIllIIIl[10]]);
        COAL_AND_IRON = new d(lIIllIIllIIIl[4], new h(), lIIllIIlIllll[lIIllIIllIIIl[12]]);
        WATERMELON_SEED = new d(lIIllIIllIIIl[5], new i(), lIIllIIlIllll[lIIllIIllIIIl[14]]);
        LOBSTER = new d(lIIllIIllIIIl[6], new j(), lIIllIIlIllll[lIIllIIllIIIl[16]]);
        XP_TOME = new d(lIIllIIllIIIl[10], new k(), lIIllIIlIllll[lIIllIIllIIIl[18]]);
        d[] dArray = new d[lIIllIIllIIIl[11]];
        dArray[d.lIIllIIllIIIl[0]] = PURE_ESSENCE;
        dArray[d.lIIllIIllIIIl[1]] = BOW_STRING;
        dArray[d.lIIllIIllIIIl[2]] = SILVER_BAR;
        dArray[d.lIIllIIllIIIl[3]] = HERB;
        dArray[d.lIIllIIllIIIl[4]] = COAL_AND_IRON;
        dArray[d.lIIllIIllIIIl[5]] = WATERMELON_SEED;
        dArray[d.lIIllIIllIIIl[6]] = LOBSTER;
        dArray[d.lIIllIIllIIIl[10]] = XP_TOME;
        $VALUES = dArray;
    }
}

