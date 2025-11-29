package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aW  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aW.class */
public final class aW {
    private final /* synthetic */ int level = cp();
    public static final /* synthetic */ aW FALADOR;
    public static final /* synthetic */ aW PROGRESSIVE;
    public static final /* synthetic */ aW CAMELOT;
    private final /* synthetic */ Spell spell;
    private static final /* synthetic */ aW[] $VALUES;
    public static final /* synthetic */ aW LUMBRIDGE;
    private static /* synthetic */ String[] lIllIIlI;
    public static final /* synthetic */ aW VARROCK;
    private static /* synthetic */ int[] lIllIIll;

    private static boolean lIlIIIIIll(int i2) {
        return i2 != 0;
    }

    private static void lIlIIIIIIl() {
        lIllIIll = new int[11];
        lIllIIll[0] = " ".length();
        lIllIIll[1] = (134 ^ 177) & ((131 ^ 180) ^ (-1));
        lIllIIll[2] = (((143 + 41) - 24) + 3) ^ (((31 + 53) - (-11)) + 91);
        lIllIIll[3] = 101 ^ 122;
        lIllIIll[4] = "  ".length();
        lIllIIll[5] = 71 ^ 98;
        lIllIIll[6] = "   ".length();
        lIllIIll[7] = 233 ^ 196;
        lIllIIll[8] = 123 ^ 127;
        lIllIIll[9] = 109 ^ 104;
        lIllIIll[10] = (((78 + 180) - 170) + 115) ^ (((109 + 139) - 110) + 57);
    }

    public Spell co() {
        return this.spell;
    }

    public static aW[] values() {
        return (aW[]) $VALUES.clone();
    }

    private static boolean lIlIIIIIlI(int i2, int i3) {
        return i2 >= i3;
    }

    static {
        lIlIIIIIIl();
        lIlIIIIIII();
        VARROCK = new aW(lIllIIlI[lIllIIll[1]], lIllIIll[1], SpellBook.Standard.VARROCK_TELEPORT, lIllIIll[2]);
        LUMBRIDGE = new aW(lIllIIlI[lIllIIll[0]], lIllIIll[0], SpellBook.Standard.LUMBRIDGE_TELEPORT, lIllIIll[3]);
        FALADOR = new aW(lIllIIlI[lIllIIll[4]], lIllIIll[4], SpellBook.Standard.FALADOR_TELEPORT, lIllIIll[5]);
        CAMELOT = new aW(lIllIIlI[lIllIIll[6]], lIllIIll[6], SpellBook.Standard.CAMELOT_TELEPORT, lIllIIll[7]);
        PROGRESSIVE = new aW(lIllIIlI[lIllIIll[8]], lIllIIll[8], SpellBook.Standard.HOME_TELEPORT, lIllIIll[1]);
        aW[] aWVarArr = new aW[lIllIIll[9]];
        aWVarArr[lIllIIll[1]] = VARROCK;
        aWVarArr[lIllIIll[0]] = LUMBRIDGE;
        aWVarArr[lIllIIll[4]] = FALADOR;
        aWVarArr[lIllIIll[6]] = CAMELOT;
        aWVarArr[lIllIIll[8]] = PROGRESSIVE;
        $VALUES = aWVarArr;
    }

    private static String lIIlllllIl(String llIlllIlllIlllI, String llIlllIlllIllIl) {
        String llIlllIlllIlllI2 = new String(Base64.getDecoder().decode(llIlllIlllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIlllIllII = new StringBuilder();
        char[] charArray = llIlllIlllIllIl.toCharArray();
        int llIlllIlllIlIlI = lIllIIll[1];
        char[] charArray2 = llIlllIlllIlllI2.toCharArray();
        int length = charArray2.length;
        int i2 = lIllIIll[1];
        while (lIlIIIIlII(i2, length)) {
            char llIlllIlllIIIIl = charArray2[i2];
            llIlllIlllIllII.append((char) (llIlllIlllIIIIl ^ charArray[llIlllIlllIlIlI % charArray.length]));
            "".length();
            llIlllIlllIlIlI++;
            i2++;
            "".length();
            if (((9 ^ 16) & ((188 ^ 165) ^ (-1))) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llIlllIlllIllII);
    }

    private static String lIIlllllll(String llIlllIlllllllI, String llIlllIllllllIl) {
        try {
            SecretKeySpec llIllllIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIllllllIl.getBytes(StandardCharsets.UTF_8)), lIllIIll[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIll[4], llIllllIIIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlllIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllIllllllll) {
            llIlllIllllllll.printStackTrace();
            return null;
        }
    }

    private aW(String str, int i2, Spell spell, int i3) {
        this.spell = spell;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean cn() {
        if (lIlIIIIIlI(Skills.getBoostedLevel(Skill.MAGIC), this.level) && lIlIIIIIll(this.spell.canCast() ? 1 : 0)) {
            ?? r0 = lIllIIll[0];
            "".length();
            return "   ".length() > "   ".length() ? (((229 ^ 196) & ((49 ^ 16) ^ (-1))) ^ (26 ^ 87)) & (((135 ^ 142) ^ (201 ^ 141)) ^ (-" ".length())) : r0;
        }
        return lIllIIll[1];
    }

    private static boolean lIlIIIIlII(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIIllllllI(String llIllllIIIIlIll, String llIllllIIIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllllIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllllIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllllIIIIllII) {
            llIllllIIIIllII.printStackTrace();
            return null;
        }
    }

    public int cp() {
        return this.level;
    }

    private static void lIlIIIIIII() {
        lIllIIlI = new String[lIllIIll[9]];
        lIllIIlI[lIllIIll[1]] = lIIlllllIl("Jg06PCQzBw==", "pLhnk");
        lIllIIlI[lIllIIll[0]] = lIIlllllIl("GwADFwseEQkQ", "WUNUY");
        lIllIIlI[lIllIIll[4]] = lIIlllllIl("MRg2FDU4Cw==", "wYzUq");
        lIllIIlI[lIllIIll[6]] = lIIllllllI("kg9x8pZ+NNI=", "xmBcy");
        lIllIIlI[lIllIIll[8]] = lIIlllllll("zDe6hRpg+pLVo5z0Hb8a7w==", "eOXfV");
    }

    public static aW valueOf(String str) {
        return (aW) Enum.valueOf(aW.class, str);
    }
}
