package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.z  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/z.class */
public final class z {
    public static final /* synthetic */ z LV5_ENCHANT;
    public static final /* synthetic */ z NONE;
    public /* synthetic */ Spell spell;
    public static final /* synthetic */ z LV4_ENCHANT;
    public static final /* synthetic */ z LV3_ENCHANT;
    public static final /* synthetic */ z LV2_ENCHANT;
    public static final /* synthetic */ z LV1_ENCHANT;
    public static final /* synthetic */ z LV6_ENCHANT;
    private static final /* synthetic */ z[] $VALUES;
    private static /* synthetic */ String[] lllIIlIIllII;
    private static /* synthetic */ int[] lllIIlIIllIl;

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    private static void lIIIlIIlllllllI() {
        lllIIlIIllIl = new int[9];
        lllIIlIIllIl[0] = (237 ^ 180) & ((222 ^ 135) ^ (-1));
        lllIIlIIllIl[1] = " ".length();
        lllIIlIIllIl[2] = "  ".length();
        lllIIlIIllIl[3] = "   ".length();
        lllIIlIIllIl[4] = (((160 + 170) - 228) + 92) ^ (((94 + 29) - (-68)) + 7);
        lllIIlIIllIl[5] = (((39 + 70) - 12) + 64) ^ (((115 + 130) - 198) + 117);
        lllIIlIIllIl[6] = (218 ^ 186) ^ (116 ^ 18);
        lllIIlIIllIl[7] = 136 ^ 143;
        lllIIlIIllIl[8] = (((139 + 167) - 117) + 17) ^ (((110 + 102) - 84) + 70);
    }

    private z(String str, int i, Spell spell) {
        this.spell = spell;
    }

    private static boolean lIIIlIIllllllll(int i, int i2) {
        return i < i2;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    private static String lIIIlIIlllllIlI(String lllllllllllllllIIllIlIllIlIIIIIl, String lllllllllllllllIIllIlIllIIlllllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIllIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIllIIlllllI.getBytes(StandardCharsets.UTF_8)), lllIIlIIllIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlIIllIl[2], lllllllllllllllIIllIlIllIlIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIllIlIIIIlI) {
            lllllllllllllllIIllIlIllIlIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIllllllII(String lllllllllllllllIIllIlIllIIllIIIl, String lllllllllllllllIIllIlIllIIllIIII) {
        String lllllllllllllllIIllIlIllIIllIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIllIIlIllll = new StringBuilder();
        char[] lllllllllllllllIIllIlIllIIlIlllI = lllllllllllllllIIllIlIllIIllIIII.toCharArray();
        int lllllllllllllllIIllIlIllIIlIllIl = lllIIlIIllIl[0];
        char[] charArray = lllllllllllllllIIllIlIllIIllIIIl2.toCharArray();
        int lllllllllllllllIIllIlIllIIlIIllI = charArray.length;
        int lllllllllllllllIIllIlIllIIlIIlIl = lllIIlIIllIl[0];
        while (lIIIlIIllllllll(lllllllllllllllIIllIlIllIIlIIlIl, lllllllllllllllIIllIlIllIIlIIllI)) {
            lllllllllllllllIIllIlIllIIlIllll.append((char) (charArray[lllllllllllllllIIllIlIllIIlIIlIl] ^ lllllllllllllllIIllIlIllIIlIlllI[lllllllllllllllIIllIlIllIIlIllIl % lllllllllllllllIIllIlIllIIlIlllI.length]));
            "".length();
            lllllllllllllllIIllIlIllIIlIllIl++;
            lllllllllllllllIIllIlIllIIlIIlIl++;
            "".length();
            if ((10 ^ 14) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlIllIIlIllll);
    }

    private static String lIIIlIIlllllIll(String lllllllllllllllIIllIlIllIIIlllII, String lllllllllllllllIIllIlIllIIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIllIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIlIIllIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIllIIIlllIl) {
            lllllllllllllllIIllIlIllIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIllllllIl() {
        lllIIlIIllII = new String[lllIIlIIllIl[7]];
        lllIIlIIllII[lllIIlIIllIl[0]] = lIIIlIIlllllIlI("OY7zf/EKGKE=", "jfRni");
        lllIIlIIllII[lllIIlIIllIl[1]] = lIIIlIIlllllIll("gVmEMV+pdO5yOFQ24EwrlA==", "KhFFF");
        lllIIlIIllII[lllIIlIIllIl[2]] = lIIIlIIlllllIlI("f/qVcTXaXc/We9c5dPVjWw==", "CWNCj");
        lllIIlIIllII[lllIIlIIllIl[3]] = lIIIlIIlllllIll("Oq9z84umFQV/kTNRbPo1OQ==", "cIWzO");
        lllIIlIIllII[lllIIlIIllIl[4]] = lIIIlIIlllllIll("p0GgdMVZ9/wpRey4p3hA1g==", "cWdxY");
        lllIIlIIllII[lllIIlIIllIl[5]] = lIIIlIIllllllII("Lx5hOQItCxwnCTc=", "cHTfG");
        lllIIlIIllII[lllIIlIIllIl[6]] = lIIIlIIllllllII("NhJkOyc0BxolLC4=", "zDRdb");
    }

    static {
        lIIIlIIlllllllI();
        lIIIlIIllllllIl();
        NONE = new z(lllIIlIIllII[lllIIlIIllIl[0]], lllIIlIIllIl[0], null);
        LV1_ENCHANT = new z(lllIIlIIllII[lllIIlIIllIl[1]], lllIIlIIllIl[1], SpellBook.Standard.LVL_1_ENCHANT);
        LV2_ENCHANT = new z(lllIIlIIllII[lllIIlIIllIl[2]], lllIIlIIllIl[2], SpellBook.Standard.LVL_2_ENCHANT);
        LV3_ENCHANT = new z(lllIIlIIllII[lllIIlIIllIl[3]], lllIIlIIllIl[3], SpellBook.Standard.LVL_3_ENCHANT);
        LV4_ENCHANT = new z(lllIIlIIllII[lllIIlIIllIl[4]], lllIIlIIllIl[4], SpellBook.Standard.LVL_4_ENCHANT);
        LV5_ENCHANT = new z(lllIIlIIllII[lllIIlIIllIl[5]], lllIIlIIllIl[5], SpellBook.Standard.LVL_5_ENCHANT);
        LV6_ENCHANT = new z(lllIIlIIllII[lllIIlIIllIl[6]], lllIIlIIllIl[6], SpellBook.Standard.LVL_6_ENCHANT);
        z[] zVarArr = new z[lllIIlIIllIl[7]];
        zVarArr[lllIIlIIllIl[0]] = NONE;
        zVarArr[lllIIlIIllIl[1]] = LV1_ENCHANT;
        zVarArr[lllIIlIIllIl[2]] = LV2_ENCHANT;
        zVarArr[lllIIlIIllIl[3]] = LV3_ENCHANT;
        zVarArr[lllIIlIIllIl[4]] = LV4_ENCHANT;
        zVarArr[lllIIlIIllIl[5]] = LV5_ENCHANT;
        zVarArr[lllIIlIIllIl[6]] = LV6_ENCHANT;
        $VALUES = zVarArr;
    }
}
