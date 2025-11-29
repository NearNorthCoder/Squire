package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

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
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.s  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/s.class */
public final class EnumC0022s {
    public static final /* synthetic */ EnumC0022s FIRE_WAVE;
    private final /* synthetic */ Spell spell;
    private final /* synthetic */ String name;
    private static final /* synthetic */ EnumC0022s[] $VALUES;
    public static final /* synthetic */ EnumC0022s FIRE_SURGE;
    public static final /* synthetic */ EnumC0022s FIRE_BOLT;
    public static final /* synthetic */ EnumC0022s FIRE_BLAST;
    private static /* synthetic */ int[] lllIlllllllI;
    private static /* synthetic */ String[] lllIlllllIll;

    private static void lIIIlllIIlllIlI() {
        lllIlllllllI = new int[9];
        lllIlllllllI[0] = (94 ^ 78) & ((3 ^ 19) ^ (-1));
        lllIlllllllI[1] = " ".length();
        lllIlllllllI[2] = "  ".length();
        lllIlllllllI[3] = "   ".length();
        lllIlllllllI[4] = (((28 + 23) - 36) + 126) ^ (((10 + 97) - 73) + 103);
        lllIlllllllI[5] = 91 ^ 94;
        lllIlllllllI[6] = 179 ^ 181;
        lllIlllllllI[7] = 87 ^ 80;
        lllIlllllllI[8] = 76 ^ 68;
    }

    private static String lIIIlllIIllIIlI(String lllllllllllllllIIllIIIlIIIlIllII, String lllllllllllllllIIllIIIlIIIlIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIlIIIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIlIIIlIlIll.getBytes(StandardCharsets.UTF_8)), lllIlllllllI[8]), "DES");
            Cipher lllllllllllllllIIllIIIlIIIlIlllI = Cipher.getInstance("DES");
            lllllllllllllllIIllIIIlIIIlIlllI.init(lllIlllllllI[2], lllllllllllllllIIllIIIlIIIlIllll);
            return new String(lllllllllllllllIIllIIIlIIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIlIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIlIIIlIllIl) {
            lllllllllllllllIIllIIIlIIIlIllIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIIllIIII(String lllllllllllllllIIllIIIlIIlIIIIIl, String lllllllllllllllIIllIIIlIIlIIIIII) {
        String lllllllllllllllIIllIIIlIIlIIIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIlIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIIlIIIllllll = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIIlIIlIIIIII.toCharArray();
        int lllllllllllllllIIllIIIlIIIllllIl = lllIlllllllI[0];
        char[] charArray2 = lllllllllllllllIIllIIIlIIlIIIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIlllllllI[0];
        while (lIIIlllIIlllIll(i, length)) {
            char lllllllllllllllIIllIIIlIIlIIIIlI = charArray2[i];
            lllllllllllllllIIllIIIlIIIllllll.append((char) (lllllllllllllllIIllIIIlIIlIIIIlI ^ charArray[lllllllllllllllIIllIIIlIIIllllIl % charArray.length]));
            "".length();
            lllllllllllllllIIllIIIlIIIllllIl++;
            i++;
            "".length();
            if ((((((151 + 71) - 79) + 57) ^ (((135 + 31) - 133) + 115)) & (((((133 + 187) - 128) + 8) ^ (((108 + 143) - 147) + 44)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIIlIIIllllll);
    }

    static {
        lIIIlllIIlllIlI();
        lIIIlllIIlllIIl();
        FIRE_SURGE = new EnumC0022s(lllIlllllIll[lllIlllllllI[0]], lllIlllllllI[0], SpellBook.Standard.FIRE_SURGE, lllIlllllIll[lllIlllllllI[1]]);
        FIRE_WAVE = new EnumC0022s(lllIlllllIll[lllIlllllllI[2]], lllIlllllllI[1], SpellBook.Standard.FIRE_WAVE, lllIlllllIll[lllIlllllllI[3]]);
        FIRE_BLAST = new EnumC0022s(lllIlllllIll[lllIlllllllI[4]], lllIlllllllI[2], SpellBook.Standard.FIRE_BLAST, lllIlllllIll[lllIlllllllI[5]]);
        FIRE_BOLT = new EnumC0022s(lllIlllllIll[lllIlllllllI[6]], lllIlllllllI[3], SpellBook.Standard.FIRE_BOLT, lllIlllllIll[lllIlllllllI[7]]);
        EnumC0022s[] enumC0022sArr = new EnumC0022s[lllIlllllllI[4]];
        enumC0022sArr[lllIlllllllI[0]] = FIRE_SURGE;
        enumC0022sArr[lllIlllllllI[1]] = FIRE_WAVE;
        enumC0022sArr[lllIlllllllI[2]] = FIRE_BLAST;
        enumC0022sArr[lllIlllllllI[3]] = FIRE_BOLT;
        $VALUES = enumC0022sArr;
    }

    public String bG() {
        return this.name;
    }

    private static void lIIIlllIIlllIIl() {
        lllIlllllIll = new String[lllIlllllllI[8]];
        lllIlllllIll[lllIlllllllI[0]] = lIIIlllIIlIllll("i9V75uYW819jIjnD0/LEjA==", "HsfCK");
        lllIlllllIll[lllIlllllllI[1]] = lIIIlllIIllIIII("LzAqCEE6LCoKBA==", "iYXma");
        lllIlllllIll[lllIlllllllI[2]] = lIIIlllIIlIllll("Dx3W7KpD54y/H1VB67ZjYw==", "dzmVW");
        lllIlllllIll[lllIlllllllI[3]] = lIIIlllIIllIIlI("g4EqsuFCR2BdwgKAfD7pTw==", "DexaP");
        lllIlllllIll[lllIlllllllI[4]] = lIIIlllIIlIllll("0QYQPrmj4TDP+x4PF0sCWA==", "pjCFb");
        lllIlllllIll[lllIlllllllI[5]] = lIIIlllIIlIllll("Q0bMFsaf7x2YLG7qfJ5aAg==", "ujHGo");
        lllIlllllIll[lllIlllllllI[6]] = lIIIlllIIlIllll("3Ii5U6zsUuRtNyhiqB1+7Q==", "Xzzud");
        lllIlllllIll[lllIlllllllI[7]] = lIIIlllIIllIIII("HC8ZJFkYKQc1", "ZFkAy");
    }

    private static boolean lIIIlllIIlllIll(int i, int i2) {
        return i < i2;
    }

    private static String lIIIlllIIlIllll(String lllllllllllllllIIllIIIlIIIIlllll, String lllllllllllllllIIllIIIlIIIIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIlIIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIlIIIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIlIIIlIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIlIIIlIIIIl.init(lllIlllllllI[2], lllllllllllllllIIllIIIlIIIlIIIlI);
            return new String(lllllllllllllllIIllIIIlIIIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIlIIIlIIIII) {
            lllllllllllllllIIllIIIlIIIlIIIII.printStackTrace();
            return null;
        }
    }

    public static EnumC0022s valueOf(String str) {
        return (EnumC0022s) Enum.valueOf(EnumC0022s.class, str);
    }

    public static EnumC0022s[] values() {
        return (EnumC0022s[]) $VALUES.clone();
    }

    public Spell bF() {
        return this.spell;
    }

    private EnumC0022s(String str, int i, Spell spell, String str2) {
        this.spell = spell;
        this.name = str2;
    }
}
