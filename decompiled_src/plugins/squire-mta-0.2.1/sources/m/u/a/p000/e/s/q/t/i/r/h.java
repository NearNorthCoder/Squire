package m.u.a.p000.e.s.q.t.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.SpellBook;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.u.a.-.e.s.q.t.i.r.h  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/h.class */
public final class h {
    public static final /* synthetic */ h LVL4_ENCHANT;
    public static final /* synthetic */ h LVL6_ENCHANT;
    private final /* synthetic */ SpellBook.Standard spell;
    private final /* synthetic */ Rune rune;
    private static /* synthetic */ String[] lllIlIIllIlI;
    public static final /* synthetic */ h LVL3_ENCHANT;
    public static final /* synthetic */ h LVL1_ENCHANT;
    private static final /* synthetic */ h[] $VALUES;
    public static final /* synthetic */ h LVL5_ENCHANT;
    private static /* synthetic */ int[] lllIlIIllIll;
    public static final /* synthetic */ h LVL2_ENCHANT;

    private h(String str, int i, SpellBook.Standard standard, Rune rune) {
        this.spell = standard;
        this.rune = rune;
    }

    private static boolean lIIIlIlllIlllII(int i, int i2) {
        return i < i2;
    }

    public SpellBook.Standard u() {
        return this.spell;
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    private static String lIIIlIlllIllIII(String lllllllllllllllIIllIllIlllIIllIl, String lllllllllllllllIIllIllIlllIIllII) {
        String lllllllllllllllIIllIllIlllIIllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIlllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIllIlllIIlIlI = lllllllllllllllIIllIllIlllIIllII.toCharArray();
        int lllllllllllllllIIllIllIlllIIlIIl = lllIlIIllIll[0];
        char[] charArray = lllllllllllllllIIllIllIlllIIllIl2.toCharArray();
        int lllllllllllllllIIllIllIlllIIIIlI = charArray.length;
        int i = lllIlIIllIll[0];
        while (lIIIlIlllIlllII(i, lllllllllllllllIIllIllIlllIIIIlI)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIllIllIlllIIlIlI[lllllllllllllllIIllIllIlllIIlIIl % lllllllllllllllIIllIllIlllIIlIlI.length]));
            "".length();
            lllllllllllllllIIllIllIlllIIlIIl++;
            i++;
            "".length();
            if ((((113 ^ 19) ^ (61 ^ 121)) & (((((48 + 51) - 16) + 58) ^ (((125 + 42) - 49) + 53)) ^ (-" ".length()))) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIIlIlllIllIll();
        lIIIlIlllIllIlI();
        LVL1_ENCHANT = new h(lllIlIIllIlI[lllIlIIllIll[0]], lllIlIIllIll[0], SpellBook.Standard.LVL_1_ENCHANT, Rune.WATER);
        LVL2_ENCHANT = new h(lllIlIIllIlI[lllIlIIllIll[1]], lllIlIIllIll[1], SpellBook.Standard.LVL_2_ENCHANT, Rune.AIR);
        LVL3_ENCHANT = new h(lllIlIIllIlI[lllIlIIllIll[2]], lllIlIIllIll[2], SpellBook.Standard.LVL_3_ENCHANT, Rune.FIRE);
        LVL4_ENCHANT = new h(lllIlIIllIlI[lllIlIIllIll[3]], lllIlIIllIll[3], SpellBook.Standard.LVL_4_ENCHANT, Rune.EARTH);
        LVL5_ENCHANT = new h(lllIlIIllIlI[lllIlIIllIll[4]], lllIlIIllIll[4], SpellBook.Standard.LVL_5_ENCHANT, Rune.WATER);
        LVL6_ENCHANT = new h(lllIlIIllIlI[lllIlIIllIll[5]], lllIlIIllIll[5], SpellBook.Standard.LVL_6_ENCHANT, Rune.EARTH);
        h[] hVarArr = new h[lllIlIIllIll[6]];
        hVarArr[lllIlIIllIll[0]] = LVL1_ENCHANT;
        hVarArr[lllIlIIllIll[1]] = LVL2_ENCHANT;
        hVarArr[lllIlIIllIll[2]] = LVL3_ENCHANT;
        hVarArr[lllIlIIllIll[3]] = LVL4_ENCHANT;
        hVarArr[lllIlIIllIll[4]] = LVL5_ENCHANT;
        hVarArr[lllIlIIllIll[5]] = LVL6_ENCHANT;
        $VALUES = hVarArr;
    }

    private static String lIIIlIlllIllIIl(String lllllllllllllllIIllIllIllIlllIII, String lllllllllllllllIIllIllIllIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIllIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIllIllIlll.getBytes(StandardCharsets.UTF_8)), lllIlIIllIll[7]), "DES");
            Cipher lllllllllllllllIIllIllIllIlllIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIllIllIlllIlI.init(lllIlIIllIll[2], lllllllllllllllIIllIllIllIlllIll);
            return new String(lllllllllllllllIIllIllIllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIllIlllIIl) {
            lllllllllllllllIIllIllIllIlllIIl.printStackTrace();
            return null;
        }
    }

    public Rune t() {
        return this.rune;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    private static void lIIIlIlllIllIll() {
        lllIlIIllIll = new int[8];
        lllIlIIllIll[0] = (134 ^ 196) & ((55 ^ 117) ^ (-1));
        lllIlIIllIll[1] = " ".length();
        lllIlIIllIll[2] = "  ".length();
        lllIlIIllIll[3] = "   ".length();
        lllIlIIllIll[4] = 71 ^ 67;
        lllIlIIllIll[5] = (23 ^ 11) ^ (124 ^ 101);
        lllIlIIllIll[6] = (104 ^ 125) ^ (109 ^ 126);
        lllIlIIllIll[7] = 41 ^ 33;
    }

    private static void lIIIlIlllIllIlI() {
        lllIlIIllIlI = new String[lllIlIIllIll[6]];
        lllIlIIllIlI[lllIlIIllIll[0]] = lIIIlIlllIllIII("CRUPfQ4ADQAEEAsX", "ECCLQ");
        lllIlIIllIlI[lllIlIIllIll[1]] = lIIIlIlllIllIII("LzAlYBcmKCoaCS0y", "cfiRH");
        lllIlIIllIlI[lllIlIIllIll[2]] = lIIIlIlllIllIIl("ZakpRxO69pahWwnO6Sftzw==", "EgEoC");
        lllIlIIllIlI[lllIlIIllIll[3]] = lIIIlIlllIllIIl("qFtaGQZNufTazpgjNCdXRg==", "KtiRF");
        lllIlIIllIlI[lllIlIIllIll[4]] = lIIIlIlllIllIIl("JwpdZ/XKTfmrfFEIdAshhg==", "Vexya");
        lllIlIIllIlI[lllIlIIllIll[5]] = lIIIlIlllIllIIl("MMePl9AwBdC0bE8FvTS9ag==", "VeBny");
    }
}
