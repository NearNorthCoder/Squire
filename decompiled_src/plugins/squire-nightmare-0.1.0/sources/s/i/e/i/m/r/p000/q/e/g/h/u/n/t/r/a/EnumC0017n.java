package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.n  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/n.class */
public final class EnumC0017n {
    private static final /* synthetic */ EnumC0017n[] $VALUES;
    public static final /* synthetic */ EnumC0017n CRUSH;
    public static final /* synthetic */ EnumC0017n EMITS_A_JET_OF_FLAME;
    public static final /* synthetic */ EnumC0017n SPELLCASTING;
    private static /* synthetic */ int[] llllIlllIlIl;
    public static final /* synthetic */ EnumC0017n STAB;
    public static final /* synthetic */ EnumC0017n NONE;
    public static final /* synthetic */ EnumC0017n SLASH;
    public static final /* synthetic */ EnumC0017n MAGIC;
    private static /* synthetic */ String[] llllIlllIlII;
    public static final /* synthetic */ EnumC0017n DEFENSIVE_CASTING;
    public static final /* synthetic */ EnumC0017n RANGED;
    public static final /* synthetic */ EnumC0017n FIRES_AN_EXPLOSIVE_ROUND;

    private static void lIIlIIIllllIlII() {
        llllIlllIlIl = new int[11];
        llllIlllIlIl[0] = (154 ^ 135) & ((179 ^ 174) ^ (-1));
        llllIlllIlIl[1] = " ".length();
        llllIlllIlIl[2] = "  ".length();
        llllIlllIlIl[3] = "   ".length();
        llllIlllIlIl[4] = 103 ^ 99;
        llllIlllIlIl[5] = (((118 + 30) - 130) + 153) ^ (((81 + 90) - 42) + 45);
        llllIlllIlIl[6] = 49 ^ 55;
        llllIlllIlIl[7] = (92 ^ 72) ^ (146 ^ 129);
        llllIlllIlIl[8] = 0 ^ 8;
        llllIlllIlIl[9] = (19 ^ 94) ^ (206 ^ 138);
        llllIlllIlIl[10] = (((116 + 145) - 127) + 34) ^ (((151 + 6) - 153) + 158);
    }

    public static EnumC0017n valueOf(String str) {
        return (EnumC0017n) Enum.valueOf(EnumC0017n.class, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean bj() {
        C0018o bq = C0019p.bq();
        return lIIlIIIllllIlIl(bq) ? llllIlllIlIl[0] : Objects.equals(bq.bm(), this);
    }

    private static boolean lIIlIIIllllIlIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean bk() {
        EnumC0017n[] enumC0017nArr = new EnumC0017n[llllIlllIlIl[1]];
        enumC0017nArr[llllIlllIlIl[0]] = this;
        if (lIIlIIIllllIllI(C0019p.a(enumC0017nArr).isEmpty() ? 1 : 0)) {
            ?? r0 = llllIlllIlIl[1];
            "".length();
            return ((38 ^ 29) & ((89 ^ 98) ^ (-1))) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIlllIlIl[0];
    }

    private static void lIIlIIIllllIIll() {
        llllIlllIlII = new String[llllIlllIlIl[10]];
        llllIlllIlII[llllIlllIlIl[0]] = lIIlIIIllllIIII("UIgVWgdVnI4=", "WRhTl");
        llllIlllIlII[llllIlllIlIl[1]] = lIIlIIIllllIIII("UGSxoQSl55g7iFWSbYMbLDAaZ13BZJLm", "lODsk");
        llllIlllIlII[llllIlllIlIl[2]] = lIIlIIIllllIIlI("Ex8QJykJEwY5PwINFjUlEB4YPj8=", "VRYsz");
        llllIlllIlII[llllIlllIlIl[3]] = lIIlIIIllllIIlI("DAcIIR0VDxQ7CxIeFisdAxgfOxwFGxQg", "JNZdN");
        llllIlllIlII[llllIlllIlIl[4]] = lIIlIIIllllIIlI("OBkRKDs=", "uXVax");
        llllIlllIlII[llllIlllIlIl[5]] = lIIlIIIllllIIlI("KwgWJA==", "eGXav");
        llllIlllIlII[llllIlllIlIl[6]] = lIIlIIIllllIIlI("EAIpFhYG", "BCgQS");
        llllIlllIlII[llllIlllIlIl[7]] = lIIlIIIllllIIII("sOHDbHIxKyg=", "rWZDw");
        llllIlllIlII[llllIlllIlIl[8]] = lIIlIIIllllIIlI("AyoUBQUTOwIdAB49", "PzQII");
        llllIlllIlII[llllIlllIlIl[9]] = lIIlIIIllllIIII("mekjIKk0ioI=", "qwSHS");
    }

    private static String lIIlIIIllllIIlI(String lllllllllllllllIIlIlIllIIllIIlIl, String lllllllllllllllIIlIlIllIIllIIlII) {
        String lllllllllllllllIIlIlIllIIllIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlIllIIllIIlII.toCharArray();
        int lllllllllllllllIIlIlIllIIllIIIIl = llllIlllIlIl[0];
        char[] charArray2 = lllllllllllllllIIlIlIllIIllIIlIl2.toCharArray();
        int lllllllllllllllIIlIlIllIIlIllIlI = charArray2.length;
        int i = llllIlllIlIl[0];
        while (lIIlIIIllllIlll(i, lllllllllllllllIIlIlIllIIlIllIlI)) {
            char lllllllllllllllIIlIlIllIIllIIllI = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIlIllIIllIIllI ^ charArray[lllllllllllllllIIlIlIllIIllIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIlIllIIllIIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private EnumC0017n(String str, int i) {
    }

    private static boolean lIIlIIIllllIlll(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIIIllllIIII(String lllllllllllllllIIlIlIllIIlIlIIII, String lllllllllllllllIIlIlIllIIlIIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIllIIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIllIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlllIlIl[2], lllllllllllllllIIlIlIllIIlIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIllIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIllIIlIlIIIl) {
            lllllllllllllllIIlIlIllIIlIlIIIl.printStackTrace();
            return null;
        }
    }

    public static EnumC0017n[] values() {
        return (EnumC0017n[]) $VALUES.clone();
    }

    private static boolean lIIlIIIllllIllI(int i) {
        return i == 0;
    }

    static {
        lIIlIIIllllIlII();
        lIIlIIIllllIIll();
        CRUSH = new EnumC0017n(llllIlllIlII[llllIlllIlIl[0]], llllIlllIlIl[0]);
        DEFENSIVE_CASTING = new EnumC0017n(llllIlllIlII[llllIlllIlIl[1]], llllIlllIlIl[1]);
        EMITS_A_JET_OF_FLAME = new EnumC0017n(llllIlllIlII[llllIlllIlIl[2]], llllIlllIlIl[2]);
        FIRES_AN_EXPLOSIVE_ROUND = new EnumC0017n(llllIlllIlII[llllIlllIlIl[3]], llllIlllIlIl[3]);
        MAGIC = new EnumC0017n(llllIlllIlII[llllIlllIlIl[4]], llllIlllIlIl[4]);
        NONE = new EnumC0017n(llllIlllIlII[llllIlllIlIl[5]], llllIlllIlIl[5]);
        RANGED = new EnumC0017n(llllIlllIlII[llllIlllIlIl[6]], llllIlllIlIl[6]);
        SLASH = new EnumC0017n(llllIlllIlII[llllIlllIlIl[7]], llllIlllIlIl[7]);
        SPELLCASTING = new EnumC0017n(llllIlllIlII[llllIlllIlIl[8]], llllIlllIlIl[8]);
        STAB = new EnumC0017n(llllIlllIlII[llllIlllIlIl[9]], llllIlllIlIl[9]);
        EnumC0017n[] enumC0017nArr = new EnumC0017n[llllIlllIlIl[10]];
        enumC0017nArr[llllIlllIlIl[0]] = CRUSH;
        enumC0017nArr[llllIlllIlIl[1]] = DEFENSIVE_CASTING;
        enumC0017nArr[llllIlllIlIl[2]] = EMITS_A_JET_OF_FLAME;
        enumC0017nArr[llllIlllIlIl[3]] = FIRES_AN_EXPLOSIVE_ROUND;
        enumC0017nArr[llllIlllIlIl[4]] = MAGIC;
        enumC0017nArr[llllIlllIlIl[5]] = NONE;
        enumC0017nArr[llllIlllIlIl[6]] = RANGED;
        enumC0017nArr[llllIlllIlIl[7]] = SLASH;
        enumC0017nArr[llllIlllIlIl[8]] = SPELLCASTING;
        enumC0017nArr[llllIlllIlIl[9]] = STAB;
        $VALUES = enumC0017nArr;
    }
}
