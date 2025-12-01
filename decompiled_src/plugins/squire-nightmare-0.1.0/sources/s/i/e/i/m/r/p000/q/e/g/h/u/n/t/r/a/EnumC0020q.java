package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.q  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/q.class */
public final class EnumC0020q {
    public static final /* synthetic */ EnumC0020q SCORCH;
    public static final /* synthetic */ EnumC0020q SHORT_FUSE;
    public static final /* synthetic */ EnumC0020q REAP;
    public static final /* synthetic */ EnumC0020q BASH;
    public static final /* synthetic */ EnumC0020q JAB;
    private static final /* synthetic */ EnumC0020q[] $VALUES;
    public static final /* synthetic */ EnumC0020q FLICK;
    public static final /* synthetic */ EnumC0020q LONG_FUSE;
    public static final /* synthetic */ EnumC0020q LUNGE;
    public static final /* synthetic */ EnumC0020q LASH;
    public static final /* synthetic */ EnumC0020q FLARE;
    public static final /* synthetic */ EnumC0020q SMASH;
    public static final /* synthetic */ EnumC0020q PUNCH;
    public static final /* synthetic */ EnumC0020q CHOP;
    public static final /* synthetic */ EnumC0020q MEDIUM_FUSE;
    public static final /* synthetic */ EnumC0020q STAB;
    public static final /* synthetic */ EnumC0020q HACK;
    public static final /* synthetic */ EnumC0020q POUND;
    private final /* synthetic */ String action;
    public static final /* synthetic */ EnumC0020q FLAMER;
    public static final /* synthetic */ EnumC0020q SPELL_DEFENSIVE;
    public static final /* synthetic */ EnumC0020q EXPLOSIVE;
    public static final /* synthetic */ EnumC0020q DEFLECT;
    public static final /* synthetic */ EnumC0020q LONGRANGE;
    public static final /* synthetic */ EnumC0020q FOCUS;
    public static final /* synthetic */ EnumC0020q AIM_AND_FIRE;
    public static final /* synthetic */ EnumC0020q RAPID;
    public static final /* synthetic */ EnumC0020q BLOCK;
    public static final /* synthetic */ EnumC0020q PUMMEL;
    public static final /* synthetic */ EnumC0020q SLASH;
    private static /* synthetic */ String[] llllIllIIIIl;
    public static final /* synthetic */ EnumC0020q FEND;
    public static final /* synthetic */ EnumC0020q SPIKE;
    public static final /* synthetic */ EnumC0020q SWIPE;
    public static final /* synthetic */ EnumC0020q KICK;
    public static final /* synthetic */ EnumC0020q IMPALE;
    public static final /* synthetic */ EnumC0020q ACCURATE;
    private static /* synthetic */ int[] llllIllIIlII;
    public static final /* synthetic */ EnumC0020q BLAZE;
    public static final /* synthetic */ EnumC0020q SPELL;

    private static boolean lIIlIIIlIllIlIl(int i) {
        return i == 0;
    }

    private EnumC0020q(String str, int i, String str2) {
        this.action = str2;
    }

    static {
        lIIlIIIlIllIIll();
        lIIlIIIlIllIIlI();
        ACCURATE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[0]], llllIllIIlII[0]);
        AIM_AND_FIRE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[1]], llllIllIIlII[1]);
        BASH = new EnumC0020q(llllIllIIIIl[llllIllIIlII[2]], llllIllIIlII[2]);
        BLAZE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[3]], llllIllIIlII[3]);
        BLOCK = new EnumC0020q(llllIllIIIIl[llllIllIIlII[4]], llllIllIIlII[4]);
        CHOP = new EnumC0020q(llllIllIIIIl[llllIllIIlII[5]], llllIllIIlII[5]);
        DEFLECT = new EnumC0020q(llllIllIIIIl[llllIllIIlII[6]], llllIllIIlII[6]);
        EXPLOSIVE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[7]], llllIllIIlII[7]);
        FEND = new EnumC0020q(llllIllIIIIl[llllIllIIlII[8]], llllIllIIlII[8]);
        FLAMER = new EnumC0020q(llllIllIIIIl[llllIllIIlII[9]], llllIllIIlII[9]);
        FLARE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[10]], llllIllIIlII[10]);
        FLICK = new EnumC0020q(llllIllIIIIl[llllIllIIlII[11]], llllIllIIlII[11]);
        FOCUS = new EnumC0020q(llllIllIIIIl[llllIllIIlII[12]], llllIllIIlII[12]);
        HACK = new EnumC0020q(llllIllIIIIl[llllIllIIlII[13]], llllIllIIlII[13]);
        IMPALE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[14]], llllIllIIlII[14]);
        JAB = new EnumC0020q(llllIllIIIIl[llllIllIIlII[15]], llllIllIIlII[15]);
        KICK = new EnumC0020q(llllIllIIIIl[llllIllIIlII[16]], llllIllIIlII[16]);
        LASH = new EnumC0020q(llllIllIIIIl[llllIllIIlII[17]], llllIllIIlII[17]);
        LONG_FUSE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[18]], llllIllIIlII[18]);
        LONGRANGE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[19]], llllIllIIlII[19]);
        LUNGE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[20]], llllIllIIlII[20]);
        MEDIUM_FUSE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[21]], llllIllIIlII[21]);
        POUND = new EnumC0020q(llllIllIIIIl[llllIllIIlII[22]], llllIllIIlII[22]);
        PUMMEL = new EnumC0020q(llllIllIIIIl[llllIllIIlII[23]], llllIllIIlII[23]);
        PUNCH = new EnumC0020q(llllIllIIIIl[llllIllIIlII[24]], llllIllIIlII[24]);
        RAPID = new EnumC0020q(llllIllIIIIl[llllIllIIlII[25]], llllIllIIlII[25]);
        REAP = new EnumC0020q(llllIllIIIIl[llllIllIIlII[26]], llllIllIIlII[26]);
        SCORCH = new EnumC0020q(llllIllIIIIl[llllIllIIlII[27]], llllIllIIlII[27]);
        SHORT_FUSE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[28]], llllIllIIlII[28]);
        SLASH = new EnumC0020q(llllIllIIIIl[llllIllIIlII[29]], llllIllIIlII[29]);
        SMASH = new EnumC0020q(llllIllIIIIl[llllIllIIlII[30]], llllIllIIlII[30]);
        SPELL = new EnumC0020q(llllIllIIIIl[llllIllIIlII[31]], llllIllIIlII[31]);
        SPELL_DEFENSIVE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[32]], llllIllIIlII[32]);
        SPIKE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[33]], llllIllIIlII[33]);
        STAB = new EnumC0020q(llllIllIIIIl[llllIllIIlII[34]], llllIllIIlII[34]);
        SWIPE = new EnumC0020q(llllIllIIIIl[llllIllIIlII[35]], llllIllIIlII[35]);
        EnumC0020q[] enumC0020qArr = new EnumC0020q[llllIllIIlII[36]];
        enumC0020qArr[llllIllIIlII[0]] = ACCURATE;
        enumC0020qArr[llllIllIIlII[1]] = AIM_AND_FIRE;
        enumC0020qArr[llllIllIIlII[2]] = BASH;
        enumC0020qArr[llllIllIIlII[3]] = BLAZE;
        enumC0020qArr[llllIllIIlII[4]] = BLOCK;
        enumC0020qArr[llllIllIIlII[5]] = CHOP;
        enumC0020qArr[llllIllIIlII[6]] = DEFLECT;
        enumC0020qArr[llllIllIIlII[7]] = EXPLOSIVE;
        enumC0020qArr[llllIllIIlII[8]] = FEND;
        enumC0020qArr[llllIllIIlII[9]] = FLAMER;
        enumC0020qArr[llllIllIIlII[10]] = FLARE;
        enumC0020qArr[llllIllIIlII[11]] = FLICK;
        enumC0020qArr[llllIllIIlII[12]] = FOCUS;
        enumC0020qArr[llllIllIIlII[13]] = HACK;
        enumC0020qArr[llllIllIIlII[14]] = IMPALE;
        enumC0020qArr[llllIllIIlII[15]] = JAB;
        enumC0020qArr[llllIllIIlII[16]] = KICK;
        enumC0020qArr[llllIllIIlII[17]] = LASH;
        enumC0020qArr[llllIllIIlII[18]] = LONG_FUSE;
        enumC0020qArr[llllIllIIlII[19]] = LONGRANGE;
        enumC0020qArr[llllIllIIlII[20]] = LUNGE;
        enumC0020qArr[llllIllIIlII[21]] = MEDIUM_FUSE;
        enumC0020qArr[llllIllIIlII[22]] = POUND;
        enumC0020qArr[llllIllIIlII[23]] = PUMMEL;
        enumC0020qArr[llllIllIIlII[24]] = PUNCH;
        enumC0020qArr[llllIllIIlII[25]] = RAPID;
        enumC0020qArr[llllIllIIlII[26]] = REAP;
        enumC0020qArr[llllIllIIlII[27]] = SCORCH;
        enumC0020qArr[llllIllIIlII[28]] = SHORT_FUSE;
        enumC0020qArr[llllIllIIlII[29]] = SLASH;
        enumC0020qArr[llllIllIIlII[30]] = SMASH;
        enumC0020qArr[llllIllIIlII[31]] = SPELL;
        enumC0020qArr[llllIllIIlII[32]] = SPELL_DEFENSIVE;
        enumC0020qArr[llllIllIIlII[33]] = SPIKE;
        enumC0020qArr[llllIllIIlII[34]] = STAB;
        enumC0020qArr[llllIllIIlII[35]] = SWIPE;
        $VALUES = enumC0020qArr;
    }

    private static boolean lIIlIIIlIllIllI(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIIIlIllIIlI() {
        llllIllIIIIl = new String[llllIllIIlII[36]];
        llllIllIIIIl[llllIllIIlII[0]] = lIIlIIIlIlIIlII("vUhzRxzYZI9dNjhMdvvcoQ==", "subEF");
        llllIllIIIIl[llllIllIIlII[1]] = lIIlIIIlIlIIlII("bWJ+/f7p+LPb2lMy8i5JRw==", "ITMCR");
        llllIllIIIIl[llllIllIIlII[2]] = lIIlIIIlIlIIlII("qSuxywDkydk=", "Njtgt");
        llllIllIIIIl[llllIllIIlII[3]] = lIIlIIIlIlIIlIl("OjwkOCc=", "xpebb");
        llllIllIIIIl[llllIllIIlII[4]] = lIIlIIIlIlIIlIl("FRQoMwU=", "WXgpN");
        llllIllIIIIl[llllIllIIlII[5]] = lIIlIIIlIlIIlIl("Eg4oBw==", "QFgWw");
        llllIllIIIIl[llllIllIIlII[6]] = lIIlIIIlIlIIllI("BlhILIXpRaQ=", "LfDhr");
        llllIllIIIIl[llllIllIIlII[7]] = lIIlIIIlIlIIlII("iMY4J8gPXtuP2te1uqsTOQ==", "GuOYy");
        llllIllIIIIl[llllIllIIlII[8]] = lIIlIIIlIlIIlIl("KBULMg==", "nPEvJ");
        llllIllIIIIl[llllIllIIlII[9]] = lIIlIIIlIlIIlIl("HyQTIh0L", "YhRoX");
        llllIllIIIIl[llllIllIIlII[10]] = lIIlIIIlIlIIlII("eNGl4yurPw0=", "EeBUP");
        llllIllIIIIl[llllIllIIlII[11]] = lIIlIIIlIlIIlII("IUDMhRk8WZQ=", "nShSQ");
        llllIllIIIIl[llllIllIIlII[12]] = lIIlIIIlIlIIlII("KLFA5E8hD4M=", "DmHNg");
        llllIllIIIIl[llllIllIIlII[13]] = lIIlIIIlIlIIlII("vQqoQVopFNI=", "dvMWV");
        llllIllIIIIl[llllIllIIlII[14]] = lIIlIIIlIlIIlIl("OyglERw3", "reuPP");
        llllIllIIIIl[llllIllIIlII[15]] = lIIlIIIlIlIIlIl("ASst", "KjoNh");
        llllIllIIIIl[llllIllIIlII[16]] = lIIlIIIlIlIIllI("H4On3MFTajs=", "LCYbx");
        llllIllIIIIl[llllIllIIlII[17]] = lIIlIIIlIlIIlIl("JxApMQ==", "kQzyB");
        llllIllIIIIl[llllIllIIlII[18]] = lIIlIIIlIlIIlIl("JhopDjosADQM", "jUgIe");
        llllIllIIIIl[llllIllIIlII[19]] = lIIlIIIlIlIIlIl("LxckIQQiFi0j", "cXjfV");
        llllIllIIIIl[llllIllIIlII[20]] = lIIlIIIlIlIIlII("TyX3VQPgexI=", "VDrrS");
        llllIllIIIIl[llllIllIIlII[21]] = lIIlIIIlIlIIlII("053tDuC3D7AXuiHViKnoYQ==", "meUSr");
        llllIllIIIIl[llllIllIIlII[22]] = lIIlIIIlIlIIlIl("FikYBjQ=", "FfMHp");
        llllIllIIIIl[llllIllIIlII[23]] = lIIlIIIlIlIIlIl("CQYFBh0V", "YSHKX");
        llllIllIIIIl[llllIllIIlII[24]] = lIIlIIIlIlIIlIl("GyckJgA=", "KrjeH");
        llllIllIIIIl[llllIllIIlII[25]] = lIIlIIIlIlIIlIl("PTc7KDI=", "ovkav");
        llllIllIIIIl[llllIllIIlII[26]] = lIIlIIIlIlIIlII("yCCHpUiRQkQ=", "vgmCj");
        llllIllIIIIl[llllIllIIlII[27]] = lIIlIIIlIlIIllI("TtLrBbVnAzw=", "bhxzV");
        llllIllIIIIl[llllIllIIlII[28]] = lIIlIIIlIlIIlII("XRQ3PkhZ+vOAnkdlMjvehw==", "mtdMR");
        llllIllIIIIl[llllIllIIlII[29]] = lIIlIIIlIlIIllI("/da1+JFt33Q=", "JzItM");
        llllIllIIIIl[llllIllIIlII[30]] = lIIlIIIlIlIIlII("ugrT7e2Qq5o=", "BYArJ");
        llllIllIIIIl[llllIllIIlII[31]] = lIIlIIIlIlIIlIl("JQMwGiA=", "vSuVl");
        llllIllIIIIl[llllIllIIlII[32]] = lIIlIIIlIlIIlII("tmS2uCya3y3jq2Oc5w2jSQ==", "xUQDc");
        llllIllIIIIl[llllIllIIlII[33]] = lIIlIIIlIlIIlIl("IioBJx8=", "qzHlZ");
        llllIllIIIIl[llllIllIIlII[34]] = lIIlIIIlIlIIlII("m5P1I+kLO0M=", "GAjXi");
        llllIllIIIIl[llllIllIIlII[35]] = lIIlIIIlIlIIlIl("EQUlPwA=", "BRloE");
    }

    public static EnumC0020q valueOf(String str) {
        return (EnumC0020q) Enum.valueOf(EnumC0020q.class, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean bj() {
        C0018o bq = C0019p.bq();
        return lIIlIIIlIllIlII(bq) ? llllIllIIlII[0] : Objects.equals(bq.bl(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean bk() {
        EnumC0020q[] enumC0020qArr = new EnumC0020q[llllIllIIlII[1]];
        enumC0020qArr[llllIllIIlII[0]] = this;
        if (lIIlIIIlIllIlIl(C0019p.a(enumC0020qArr).isEmpty() ? 1 : 0)) {
            ?? r0 = llllIllIIlII[1];
            "".length();
            return (-" ".length()) >= 0 ? ((68 ^ 106) ^ (209 ^ 178)) & (((((52 + 212) - 44) + 4) ^ (((56 + 120) - 16) + 13)) ^ (-" ".length())) : r0;
        }
        return llllIllIIlII[0];
    }

    public String bC() {
        return this.action;
    }

    private static void lIIlIIIlIllIIll() {
        llllIllIIlII = new int[37];
        llllIllIIlII[0] = (87 ^ 71) & ((130 ^ 146) ^ (-1));
        llllIllIIlII[1] = " ".length();
        llllIllIIlII[2] = "  ".length();
        llllIllIIlII[3] = "   ".length();
        llllIllIIlII[4] = (251 ^ 169) ^ (41 ^ 127);
        llllIllIIlII[5] = 124 ^ 121;
        llllIllIIlII[6] = 87 ^ 81;
        llllIllIIlII[7] = 131 ^ 132;
        llllIllIIlII[8] = 96 ^ 104;
        llllIllIIlII[9] = 98 ^ 107;
        llllIllIIlII[10] = (((47 + 9) - (-5)) + 80) ^ (((3 + 48) - (-6)) + 78);
        llllIllIIlII[11] = (((134 + 58) - 88) + 57) ^ (((34 + 3) - (-48)) + 85);
        llllIllIIlII[12] = (((17 + 11) - (-71)) + 53) ^ (((101 + 20) - 56) + 83);
        llllIllIIlII[13] = (210 ^ 168) ^ (193 ^ 182);
        llllIllIIlII[14] = 59 ^ 53;
        llllIllIIlII[15] = (24 ^ 84) ^ (234 ^ 169);
        llllIllIIlII[16] = 77 ^ 93;
        llllIllIIlII[17] = 168 ^ 185;
        llllIllIIlII[18] = 34 ^ 48;
        llllIllIIlII[19] = (((80 + 86) - 110) + 74) ^ (((47 + 47) - 24) + 75);
        llllIllIIlII[20] = 171 ^ 191;
        llllIllIIlII[21] = (209 ^ 135) ^ (35 ^ 96);
        llllIllIIlII[22] = (((64 + 11) - (-20)) + 95) ^ (((140 + 137) - 165) + 56);
        llllIllIIlII[23] = 57 ^ 46;
        llllIllIIlII[24] = 118 ^ 110;
        llllIllIIlII[25] = (29 ^ 119) ^ (219 ^ 168);
        llllIllIIlII[26] = (27 ^ 81) ^ (147 ^ 195);
        llllIllIIlII[27] = (46 ^ 8) ^ (12 ^ 49);
        llllIllIIlII[28] = (((118 + 103) - 122) + 45) ^ (((125 + 134) - 207) + 88);
        llllIllIIlII[29] = (97 ^ 24) ^ (201 ^ 173);
        llllIllIIlII[30] = (((71 + 68) - 95) + 91) ^ (((121 + 89) - 119) + 62);
        llllIllIIlII[31] = 30 ^ 1;
        llllIllIIlII[32] = "   ".length() ^ (128 ^ 163);
        llllIllIIlII[33] = (36 ^ 93) ^ (220 ^ 132);
        llllIllIIlII[34] = (220 ^ 197) ^ (13 ^ 54);
        llllIllIIlII[35] = 0 ^ 35;
        llllIllIIlII[36] = 93 ^ 121;
    }

    private static String lIIlIIIlIlIIlIl(String lllllllllllllllIIlIllIIIIIlIIlIl, String lllllllllllllllIIlIllIIIIIIlllll) {
        String lllllllllllllllIIlIllIIIIIlIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIIIIIIlllll.toCharArray();
        int lllllllllllllllIIlIllIIIIIlIIIIl = llllIllIIlII[0];
        char[] charArray2 = lllllllllllllllIIlIllIIIIIlIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = llllIllIIlII[0];
        while (lIIlIIIlIllIllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIllIIIIIlIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIIIIIlIIIIl++;
            i++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0020q[] values() {
        return (EnumC0020q[]) $VALUES.clone();
    }

    private EnumC0020q(String str, int i) {
        this(str, i, null);
    }

    private static boolean lIIlIIIlIllIlII(Object obj) {
        return obj == null;
    }

    private static String lIIlIIIlIlIIlII(String lllllllllllllllIIlIllIIIIIIIIIll, String lllllllllllllllIIlIllIIIIIIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIIIIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIIIIIIIlIl.init(llllIllIIlII[2], secretKeySpec);
            return new String(lllllllllllllllIIlIllIIIIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIIIIIIIlII) {
            lllllllllllllllIIlIllIIIIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIlIlIIllI(String lllllllllllllllIIlIllIIIIIIlIIII, String lllllllllllllllIIlIllIIIIIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), llllIllIIlII[8]), "DES");
            Cipher lllllllllllllllIIlIllIIIIIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIIIIIIlIIlI.init(llllIllIIlII[2], secretKeySpec);
            return new String(lllllllllllllllIIlIllIIIIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIIIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIIIIIlIIIl) {
            lllllllllllllllIIlIllIIIIIIlIIIl.printStackTrace();
            return null;
        }
    }
}
