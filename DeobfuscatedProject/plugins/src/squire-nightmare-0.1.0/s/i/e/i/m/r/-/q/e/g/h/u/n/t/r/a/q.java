/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.o;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.p;

public final class q
extends Enum<q> {
    public static final /* synthetic */ /* enum */ q SCORCH;
    public static final /* synthetic */ /* enum */ q SHORT_FUSE;
    public static final /* synthetic */ /* enum */ q REAP;
    public static final /* synthetic */ /* enum */ q BASH;
    public static final /* synthetic */ /* enum */ q JAB;
    private static final /* synthetic */ q[] $VALUES;
    public static final /* synthetic */ /* enum */ q FLICK;
    public static final /* synthetic */ /* enum */ q LONG_FUSE;
    public static final /* synthetic */ /* enum */ q LUNGE;
    public static final /* synthetic */ /* enum */ q LASH;
    public static final /* synthetic */ /* enum */ q FLARE;
    public static final /* synthetic */ /* enum */ q SMASH;
    public static final /* synthetic */ /* enum */ q PUNCH;
    public static final /* synthetic */ /* enum */ q CHOP;
    public static final /* synthetic */ /* enum */ q MEDIUM_FUSE;
    public static final /* synthetic */ /* enum */ q STAB;
    public static final /* synthetic */ /* enum */ q HACK;
    public static final /* synthetic */ /* enum */ q POUND;
    private final /* synthetic */ String action;
    public static final /* synthetic */ /* enum */ q FLAMER;
    public static final /* synthetic */ /* enum */ q SPELL_DEFENSIVE;
    public static final /* synthetic */ /* enum */ q EXPLOSIVE;
    public static final /* synthetic */ /* enum */ q DEFLECT;
    public static final /* synthetic */ /* enum */ q LONGRANGE;
    public static final /* synthetic */ /* enum */ q FOCUS;
    public static final /* synthetic */ /* enum */ q AIM_AND_FIRE;
    public static final /* synthetic */ /* enum */ q RAPID;
    public static final /* synthetic */ /* enum */ q BLOCK;
    public static final /* synthetic */ /* enum */ q PUMMEL;
    public static final /* synthetic */ /* enum */ q SLASH;
    private static /* synthetic */ String[] llllIllIIIIl;
    public static final /* synthetic */ /* enum */ q FEND;
    public static final /* synthetic */ /* enum */ q SPIKE;
    public static final /* synthetic */ /* enum */ q SWIPE;
    public static final /* synthetic */ /* enum */ q KICK;
    public static final /* synthetic */ /* enum */ q IMPALE;
    public static final /* synthetic */ /* enum */ q ACCURATE;
    private static /* synthetic */ int[] llllIllIIlII;
    public static final /* synthetic */ /* enum */ q BLAZE;
    public static final /* synthetic */ /* enum */ q SPELL;

    private static boolean lIIlIIIlIllIlIl(int n2) {
        return n2 == 0;
    }

    private q(String string2) {
        this.action = string2;
    }

    static {
        q.lIIlIIIlIllIIll();
        q.lIIlIIIlIllIIlI();
        ACCURATE = new q();
        AIM_AND_FIRE = new q();
        BASH = new q();
        BLAZE = new q();
        BLOCK = new q();
        CHOP = new q();
        DEFLECT = new q();
        EXPLOSIVE = new q();
        FEND = new q();
        FLAMER = new q();
        FLARE = new q();
        FLICK = new q();
        FOCUS = new q();
        HACK = new q();
        IMPALE = new q();
        JAB = new q();
        KICK = new q();
        LASH = new q();
        LONG_FUSE = new q();
        LONGRANGE = new q();
        LUNGE = new q();
        MEDIUM_FUSE = new q();
        POUND = new q();
        PUMMEL = new q();
        PUNCH = new q();
        RAPID = new q();
        REAP = new q();
        SCORCH = new q();
        SHORT_FUSE = new q();
        SLASH = new q();
        SMASH = new q();
        SPELL = new q();
        SPELL_DEFENSIVE = new q();
        SPIKE = new q();
        STAB = new q();
        SWIPE = new q();
        q[] qArray = new q[llllIllIIlII[36]];
        qArray[q.llllIllIIlII[0]] = ACCURATE;
        qArray[q.llllIllIIlII[1]] = AIM_AND_FIRE;
        qArray[q.llllIllIIlII[2]] = BASH;
        qArray[q.llllIllIIlII[3]] = BLAZE;
        qArray[q.llllIllIIlII[4]] = BLOCK;
        qArray[q.llllIllIIlII[5]] = CHOP;
        qArray[q.llllIllIIlII[6]] = DEFLECT;
        qArray[q.llllIllIIlII[7]] = EXPLOSIVE;
        qArray[q.llllIllIIlII[8]] = FEND;
        qArray[q.llllIllIIlII[9]] = FLAMER;
        qArray[q.llllIllIIlII[10]] = FLARE;
        qArray[q.llllIllIIlII[11]] = FLICK;
        qArray[q.llllIllIIlII[12]] = FOCUS;
        qArray[q.llllIllIIlII[13]] = HACK;
        qArray[q.llllIllIIlII[14]] = IMPALE;
        qArray[q.llllIllIIlII[15]] = JAB;
        qArray[q.llllIllIIlII[16]] = KICK;
        qArray[q.llllIllIIlII[17]] = LASH;
        qArray[q.llllIllIIlII[18]] = LONG_FUSE;
        qArray[q.llllIllIIlII[19]] = LONGRANGE;
        qArray[q.llllIllIIlII[20]] = LUNGE;
        qArray[q.llllIllIIlII[21]] = MEDIUM_FUSE;
        qArray[q.llllIllIIlII[22]] = POUND;
        qArray[q.llllIllIIlII[23]] = PUMMEL;
        qArray[q.llllIllIIlII[24]] = PUNCH;
        qArray[q.llllIllIIlII[25]] = RAPID;
        qArray[q.llllIllIIlII[26]] = REAP;
        qArray[q.llllIllIIlII[27]] = SCORCH;
        qArray[q.llllIllIIlII[28]] = SHORT_FUSE;
        qArray[q.llllIllIIlII[29]] = SLASH;
        qArray[q.llllIllIIlII[30]] = SMASH;
        qArray[q.llllIllIIlII[31]] = SPELL;
        qArray[q.llllIllIIlII[32]] = SPELL_DEFENSIVE;
        qArray[q.llllIllIIlII[33]] = SPIKE;
        qArray[q.llllIllIIlII[34]] = STAB;
        qArray[q.llllIllIIlII[35]] = SWIPE;
        $VALUES = qArray;
    }

    private static boolean lIIlIIIlIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIIlIllIIlI() {
        llllIllIIIIl = new String[llllIllIIlII[36]];
        q.llllIllIIIIl[q.llllIllIIlII[0]] = q.lIIlIIIlIlIIlII("vUhzRxzYZI9dNjhMdvvcoQ==", "subEF");
        q.llllIllIIIIl[q.llllIllIIlII[1]] = q.lIIlIIIlIlIIlII("bWJ+/f7p+LPb2lMy8i5JRw==", "ITMCR");
        q.llllIllIIIIl[q.llllIllIIlII[2]] = q.lIIlIIIlIlIIlII("qSuxywDkydk=", "Njtgt");
        q.llllIllIIIIl[q.llllIllIIlII[3]] = q.lIIlIIIlIlIIlIl("OjwkOCc=", "xpebb");
        q.llllIllIIIIl[q.llllIllIIlII[4]] = q.lIIlIIIlIlIIlIl("FRQoMwU=", "WXgpN");
        q.llllIllIIIIl[q.llllIllIIlII[5]] = q.lIIlIIIlIlIIlIl("Eg4oBw==", "QFgWw");
        q.llllIllIIIIl[q.llllIllIIlII[6]] = q.lIIlIIIlIlIIllI("BlhILIXpRaQ=", "LfDhr");
        q.llllIllIIIIl[q.llllIllIIlII[7]] = q.lIIlIIIlIlIIlII("iMY4J8gPXtuP2te1uqsTOQ==", "GuOYy");
        q.llllIllIIIIl[q.llllIllIIlII[8]] = q.lIIlIIIlIlIIlIl("KBULMg==", "nPEvJ");
        q.llllIllIIIIl[q.llllIllIIlII[9]] = q.lIIlIIIlIlIIlIl("HyQTIh0L", "YhRoX");
        q.llllIllIIIIl[q.llllIllIIlII[10]] = q.lIIlIIIlIlIIlII("eNGl4yurPw0=", "EeBUP");
        q.llllIllIIIIl[q.llllIllIIlII[11]] = q.lIIlIIIlIlIIlII("IUDMhRk8WZQ=", "nShSQ");
        q.llllIllIIIIl[q.llllIllIIlII[12]] = q.lIIlIIIlIlIIlII("KLFA5E8hD4M=", "DmHNg");
        q.llllIllIIIIl[q.llllIllIIlII[13]] = q.lIIlIIIlIlIIlII("vQqoQVopFNI=", "dvMWV");
        q.llllIllIIIIl[q.llllIllIIlII[14]] = q.lIIlIIIlIlIIlIl("OyglERw3", "reuPP");
        q.llllIllIIIIl[q.llllIllIIlII[15]] = q.lIIlIIIlIlIIlIl("ASst", "KjoNh");
        q.llllIllIIIIl[q.llllIllIIlII[16]] = q.lIIlIIIlIlIIllI("H4On3MFTajs=", "LCYbx");
        q.llllIllIIIIl[q.llllIllIIlII[17]] = q.lIIlIIIlIlIIlIl("JxApMQ==", "kQzyB");
        q.llllIllIIIIl[q.llllIllIIlII[18]] = q.lIIlIIIlIlIIlIl("JhopDjosADQM", "jUgIe");
        q.llllIllIIIIl[q.llllIllIIlII[19]] = q.lIIlIIIlIlIIlIl("LxckIQQiFi0j", "cXjfV");
        q.llllIllIIIIl[q.llllIllIIlII[20]] = q.lIIlIIIlIlIIlII("TyX3VQPgexI=", "VDrrS");
        q.llllIllIIIIl[q.llllIllIIlII[21]] = q.lIIlIIIlIlIIlII("053tDuC3D7AXuiHViKnoYQ==", "meUSr");
        q.llllIllIIIIl[q.llllIllIIlII[22]] = q.lIIlIIIlIlIIlIl("FikYBjQ=", "FfMHp");
        q.llllIllIIIIl[q.llllIllIIlII[23]] = q.lIIlIIIlIlIIlIl("CQYFBh0V", "YSHKX");
        q.llllIllIIIIl[q.llllIllIIlII[24]] = q.lIIlIIIlIlIIlIl("GyckJgA=", "KrjeH");
        q.llllIllIIIIl[q.llllIllIIlII[25]] = q.lIIlIIIlIlIIlIl("PTc7KDI=", "ovkav");
        q.llllIllIIIIl[q.llllIllIIlII[26]] = q.lIIlIIIlIlIIlII("yCCHpUiRQkQ=", "vgmCj");
        q.llllIllIIIIl[q.llllIllIIlII[27]] = q.lIIlIIIlIlIIllI("TtLrBbVnAzw=", "bhxzV");
        q.llllIllIIIIl[q.llllIllIIlII[28]] = q.lIIlIIIlIlIIlII("XRQ3PkhZ+vOAnkdlMjvehw==", "mtdMR");
        q.llllIllIIIIl[q.llllIllIIlII[29]] = q.lIIlIIIlIlIIllI("/da1+JFt33Q=", "JzItM");
        q.llllIllIIIIl[q.llllIllIIlII[30]] = q.lIIlIIIlIlIIlII("ugrT7e2Qq5o=", "BYArJ");
        q.llllIllIIIIl[q.llllIllIIlII[31]] = q.lIIlIIIlIlIIlIl("JQMwGiA=", "vSuVl");
        q.llllIllIIIIl[q.llllIllIIlII[32]] = q.lIIlIIIlIlIIlII("tmS2uCya3y3jq2Oc5w2jSQ==", "xUQDc");
        q.llllIllIIIIl[q.llllIllIIlII[33]] = q.lIIlIIIlIlIIlIl("IioBJx8=", "qzHlZ");
        q.llllIllIIIIl[q.llllIllIIlII[34]] = q.lIIlIIIlIlIIlII("m5P1I+kLO0M=", "GAjXi");
        q.llllIllIIIIl[q.llllIllIIlII[35]] = q.lIIlIIIlIlIIlIl("EQUlPwA=", "BRloE");
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    public boolean bj() {
        o o2 = p.bq();
        if (q.lIIlIIIlIllIlII(o2)) {
            return llllIllIIlII[0];
        }
        return Objects.equals((Object)o2.bl(), (Object)this);
    }

    public boolean bk() {
        boolean bl;
        q[] qArray = new q[llllIllIIlII[1]];
        qArray[q.llllIllIIlII[0]] = this;
        if (q.lIIlIIIlIllIlIl(p.a(qArray).isEmpty() ? 1 : 0)) {
            bl = llllIllIIlII[1];
            "".length();
            if (-" ".length() >= 0) {
                return ((0x44 ^ 0x6A ^ (0xD1 ^ 0xB2)) & (52 + 212 - 44 + 4 ^ 56 + 120 - 16 + 13 ^ -" ".length())) != 0;
            }
        } else {
            bl = llllIllIIlII[0];
        }
        return bl;
    }

    public String bC() {
        return this.action;
    }

    private static void lIIlIIIlIllIIll() {
        llllIllIIlII = new int[37];
        q.llllIllIIlII[0] = (0x57 ^ 0x47) & ~(0x82 ^ 0x92);
        q.llllIllIIlII[1] = " ".length();
        q.llllIllIIlII[2] = "  ".length();
        q.llllIllIIlII[3] = "   ".length();
        q.llllIllIIlII[4] = 0xFB ^ 0xA9 ^ (0x29 ^ 0x7F);
        q.llllIllIIlII[5] = 0x7C ^ 0x79;
        q.llllIllIIlII[6] = 0x57 ^ 0x51;
        q.llllIllIIlII[7] = 0x83 ^ 0x84;
        q.llllIllIIlII[8] = 0x60 ^ 0x68;
        q.llllIllIIlII[9] = 0x62 ^ 0x6B;
        q.llllIllIIlII[10] = 47 + 9 - -5 + 80 ^ 3 + 48 - -6 + 78;
        q.llllIllIIlII[11] = 134 + 58 - 88 + 57 ^ 34 + 3 - -48 + 85;
        q.llllIllIIlII[12] = 17 + 11 - -71 + 53 ^ 101 + 20 - 56 + 83;
        q.llllIllIIlII[13] = 0xD2 ^ 0xA8 ^ (0xC1 ^ 0xB6);
        q.llllIllIIlII[14] = 0x3B ^ 0x35;
        q.llllIllIIlII[15] = 0x18 ^ 0x54 ^ (0xEA ^ 0xA9);
        q.llllIllIIlII[16] = 0x4D ^ 0x5D;
        q.llllIllIIlII[17] = 0xA8 ^ 0xB9;
        q.llllIllIIlII[18] = 0x22 ^ 0x30;
        q.llllIllIIlII[19] = 80 + 86 - 110 + 74 ^ 47 + 47 - 24 + 75;
        q.llllIllIIlII[20] = 0xAB ^ 0xBF;
        q.llllIllIIlII[21] = 0xD1 ^ 0x87 ^ (0x23 ^ 0x60);
        q.llllIllIIlII[22] = 64 + 11 - -20 + 95 ^ 140 + 137 - 165 + 56;
        q.llllIllIIlII[23] = 0x39 ^ 0x2E;
        q.llllIllIIlII[24] = 0x76 ^ 0x6E;
        q.llllIllIIlII[25] = 0x1D ^ 0x77 ^ (0xDB ^ 0xA8);
        q.llllIllIIlII[26] = 0x1B ^ 0x51 ^ (0x93 ^ 0xC3);
        q.llllIllIIlII[27] = 0x2E ^ 8 ^ (0xC ^ 0x31);
        q.llllIllIIlII[28] = 118 + 103 - 122 + 45 ^ 125 + 134 - 207 + 88;
        q.llllIllIIlII[29] = 0x61 ^ 0x18 ^ (0xC9 ^ 0xAD);
        q.llllIllIIlII[30] = 71 + 68 - 95 + 91 ^ 121 + 89 - 119 + 62;
        q.llllIllIIlII[31] = 0x1E ^ 1;
        q.llllIllIIlII[32] = "   ".length() ^ (0x80 ^ 0xA3);
        q.llllIllIIlII[33] = 0x24 ^ 0x5D ^ (0xDC ^ 0x84);
        q.llllIllIIlII[34] = 0xDC ^ 0xC5 ^ (0xD ^ 0x36);
        q.llllIllIIlII[35] = 0 ^ 0x23;
        q.llllIllIIlII[36] = 0x5D ^ 0x79;
    }

    private static String lIIlIIIlIlIIlIl(String lllllllllllllllIIlIllIIIIIlIIIII, String lllllllllllllllIIlIllIIIIIlIIlII) {
        lllllllllllllllIIlIllIIIIIlIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIIIIlIIIll = new StringBuilder();
        char[] lllllllllllllllIIlIllIIIIIlIIIlI = lllllllllllllllIIlIllIIIIIlIIlII.toCharArray();
        int lllllllllllllllIIlIllIIIIIlIIIIl = llllIllIIlII[0];
        char[] lllllllllllllllIIlIllIIIIIIllIll = lllllllllllllllIIlIllIIIIIlIIIII.toCharArray();
        int lllllllllllllllIIlIllIIIIIIllIlI = lllllllllllllllIIlIllIIIIIIllIll.length;
        int lllllllllllllllIIlIllIIIIIIllIIl = llllIllIIlII[0];
        while (q.lIIlIIIlIllIllI(lllllllllllllllIIlIllIIIIIIllIIl, lllllllllllllllIIlIllIIIIIIllIlI)) {
            char lllllllllllllllIIlIllIIIIIlIIllI = lllllllllllllllIIlIllIIIIIIllIll[lllllllllllllllIIlIllIIIIIIllIIl];
            lllllllllllllllIIlIllIIIIIlIIIll.append((char)(lllllllllllllllIIlIllIIIIIlIIllI ^ lllllllllllllllIIlIllIIIIIlIIIlI[lllllllllllllllIIlIllIIIIIlIIIIl % lllllllllllllllIIlIllIIIIIlIIIlI.length]));
            "".length();
            ++lllllllllllllllIIlIllIIIIIlIIIIl;
            ++lllllllllllllllIIlIllIIIIIIllIIl;
            "".length();
            if ((0xB6 ^ 0x98 ^ (2 ^ 0x29)) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIIIIIlIIIll);
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    private q() {
        this(null);
    }

    private static boolean lIIlIIIlIllIlII(Object object) {
        return object == null;
    }

    private static String lIIlIIIlIlIIlII(String lllllllllllllllIIlIllIIIIIIIIIll, String lllllllllllllllIIlIllIIIIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIIIIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIIIIIIIlIl.init(llllIllIIlII[2], lllllllllllllllIIlIllIIIIIIIIllI);
            return new String(lllllllllllllllIIlIllIIIIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIIIIIIIlII) {
            lllllllllllllllIIlIllIIIIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIlIlIIllI(String lllllllllllllllIIlIllIIIIIIIlllI, String lllllllllllllllIIlIllIIIIIIIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIIIIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIIIIllll.getBytes(StandardCharsets.UTF_8)), llllIllIIlII[8]), "DES");
            Cipher lllllllllllllllIIlIllIIIIIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIIIIIlIIlI.init(llllIllIIlII[2], lllllllllllllllIIlIllIIIIIIlIIll);
            return new String(lllllllllllllllIIlIllIIIIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIIIIIIlIIIl) {
            lllllllllllllllIIlIllIIIIIIlIIIl.printStackTrace();
            return null;
        }
    }
}

