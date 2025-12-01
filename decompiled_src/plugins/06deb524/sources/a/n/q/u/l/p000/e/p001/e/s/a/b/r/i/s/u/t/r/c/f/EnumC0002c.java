package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/c.class */
public final class EnumC0002c {
    private static /* synthetic */ String[] lIIllIIIlIIl;
    public static final /* synthetic */ EnumC0002c STEEL;
    public static final /* synthetic */ EnumC0002c ADAMANTITE;
    public static final /* synthetic */ EnumC0002c RUNITE;
    public static final /* synthetic */ EnumC0002c GOLD;
    private static final /* synthetic */ EnumC0002c[] $VALUES;
    private static /* synthetic */ int[] lIIllIIIlIlI;
    public static final /* synthetic */ EnumC0002c MITHRIL;

    static {
        llIIlllIIIIllI();
        llIIlllIIIIlIl();
        STEEL = new EnumC0002c(lIIllIIIlIIl[lIIllIIIlIlI[0]], lIIllIIIlIlI[0]);
        GOLD = new EnumC0002c(lIIllIIIlIIl[lIIllIIIlIlI[1]], lIIllIIIlIlI[1]);
        MITHRIL = new EnumC0002c(lIIllIIIlIIl[lIIllIIIlIlI[2]], lIIllIIIlIlI[2]);
        ADAMANTITE = new EnumC0002c(lIIllIIIlIIl[lIIllIIIlIlI[3]], lIIllIIIlIlI[3]);
        RUNITE = new EnumC0002c(lIIllIIIlIIl[lIIllIIIlIlI[4]], lIIllIIIlIlI[4]);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[lIIllIIIlIlI[5]];
        enumC0002cArr[lIIllIIIlIlI[0]] = STEEL;
        enumC0002cArr[lIIllIIIlIlI[1]] = GOLD;
        enumC0002cArr[lIIllIIIlIlI[2]] = MITHRIL;
        enumC0002cArr[lIIllIIIlIlI[3]] = ADAMANTITE;
        enumC0002cArr[lIIllIIIlIlI[4]] = RUNITE;
        $VALUES = enumC0002cArr;
    }

    private static String llIIlllIIIIlII(String lllllllllllllllIlllIlllllllIIlIl, String lllllllllllllllIlllIlllllllIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllllllIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIIIlIlI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIIlIlI[2], lllllllllllllllIlllIlllllllIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlllllllIIllI) {
            lllllllllllllllIlllIlllllllIIllI.printStackTrace();
            return null;
        }
    }

    private static void llIIlllIIIIllI() {
        lIIllIIIlIlI = new int[7];
        lIIllIIIlIlI[0] = (5 ^ 102) & ((74 ^ 41) ^ (-1));
        lIIllIIIlIlI[1] = " ".length();
        lIIllIIIlIlI[2] = "  ".length();
        lIIllIIIlIlI[3] = "   ".length();
        lIIllIIIlIlI[4] = 33 ^ 37;
        lIIllIIIlIlI[5] = (62 ^ 16) ^ (94 ^ 117);
        lIIllIIIlIlI[6] = (113 ^ 6) ^ (((23 + 49) - (-11)) + 44);
    }

    private EnumC0002c(String str, int i) {
    }

    public static EnumC0002c valueOf(String str) {
        return (EnumC0002c) Enum.valueOf(EnumC0002c.class, str);
    }

    public static EnumC0002c[] values() {
        return (EnumC0002c[]) $VALUES.clone();
    }

    private static String llIIlllIIIIIll(String lllllllllllllllIlllIllllllIllIII, String lllllllllllllllIlllIllllllIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlllIllllllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIllllllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIllllllIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIllllllIllIlI.init(lIIllIIIlIlI[2], lllllllllllllllIlllIllllllIllIll);
            return new String(lllllllllllllllIlllIllllllIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIllllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIllllllIllIIl) {
            lllllllllllllllIlllIllllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIlllIIIIlIl() {
        lIIllIIIlIIl = new String[lIIllIIIlIlI[5]];
        lIIllIIIlIIl[lIIllIIIlIlI[0]] = llIIlllIIIIIll("NEteD1vpVwU=", "XanhR");
        lIIllIIIlIIl[lIIllIIIlIlI[1]] = llIIlllIIIIlII("QDRHSBP2Pzw=", "wadaO");
        lIIllIIIlIIl[lIIllIIIlIlI[2]] = llIIlllIIIIlII("htVX8By8oCY=", "NGFqZ");
        lIIllIIIlIIl[lIIllIIIlIlI[3]] = llIIlllIIIIlII("Ysm3DPRbm8/lw4eZxoVsQQ==", "Enebv");
        lIIllIIIlIIl[lIIllIIIlIlI[4]] = llIIlllIIIIIll("GSqFiZJcYnQ=", "CStzc");
    }
}
