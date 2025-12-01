package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.c  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/c.class */
public final class c {
    public static final /* synthetic */ c MYSTIC_WILL;
    public static final /* synthetic */ c PIETY;
    private final /* synthetic */ Prayer prayer;
    public static final /* synthetic */ c HAWK_EYE;
    public static final /* synthetic */ c EAGLE_EYE;
    private static /* synthetic */ int[] lIIIlIIllIIIl;
    public static final /* synthetic */ c RIGOUR;
    public static final /* synthetic */ c ULTIMATE_STR;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ String[] lIIIlIIllIIII;
    public static final /* synthetic */ c BURST_OF_STR;
    public static final /* synthetic */ c AUGURY;
    public static final /* synthetic */ c MYSTIC_MIGHT;
    public static final /* synthetic */ c SHARP_EYE;
    public static final /* synthetic */ c SUPERHUMAN_STR;
    public static final /* synthetic */ c MYSTIC_LORD;

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public Prayer j() {
        return this.prayer;
    }

    private static String lIIlllllIIlIlIl(String lllllllllllllllIIIIlllllIIlllllI, String lllllllllllllllIIIIlllllIIllllIl) {
        String lllllllllllllllIIIIlllllIIlllllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllllIIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllllIIllllII = new StringBuilder();
        char[] lllllllllllllllIIIIlllllIIlllIll = lllllllllllllllIIIIlllllIIllllIl.toCharArray();
        int lllllllllllllllIIIIlllllIIlllIlI = lIIIlIIllIIIl[0];
        char[] charArray = lllllllllllllllIIIIlllllIIlllllI2.toCharArray();
        int length = charArray.length;
        int i = lIIIlIIllIIIl[0];
        while (lIIlllllIIllIlI(i, length)) {
            lllllllllllllllIIIIlllllIIllllII.append((char) (charArray[i] ^ lllllllllllllllIIIIlllllIIlllIll[lllllllllllllllIIIIlllllIIlllIlI % lllllllllllllllIIIIlllllIIlllIll.length]));
            "".length();
            lllllllllllllllIIIIlllllIIlllIlI++;
            i++;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlllllIIllllII);
    }

    static {
        lIIlllllIIllIIl();
        lIIlllllIIllIII();
        BURST_OF_STR = new c(lIIIlIIllIIII[lIIIlIIllIIIl[0]], lIIIlIIllIIIl[0], Prayer.BURST_OF_STRENGTH);
        SUPERHUMAN_STR = new c(lIIIlIIllIIII[lIIIlIIllIIIl[1]], lIIIlIIllIIIl[1], Prayer.SUPERHUMAN_STRENGTH);
        ULTIMATE_STR = new c(lIIIlIIllIIII[lIIIlIIllIIIl[2]], lIIIlIIllIIIl[2], Prayer.ULTIMATE_STRENGTH);
        PIETY = new c(lIIIlIIllIIII[lIIIlIIllIIIl[3]], lIIIlIIllIIIl[3], Prayer.PIETY);
        SHARP_EYE = new c(lIIIlIIllIIII[lIIIlIIllIIIl[4]], lIIIlIIllIIIl[4], Prayer.EAGLE_EYE);
        HAWK_EYE = new c(lIIIlIIllIIII[lIIIlIIllIIIl[5]], lIIIlIIllIIIl[5], Prayer.EAGLE_EYE);
        EAGLE_EYE = new c(lIIIlIIllIIII[lIIIlIIllIIIl[6]], lIIIlIIllIIIl[6], Prayer.EAGLE_EYE);
        RIGOUR = new c(lIIIlIIllIIII[lIIIlIIllIIIl[7]], lIIIlIIllIIIl[7], Prayer.RIGOUR);
        MYSTIC_WILL = new c(lIIIlIIllIIII[lIIIlIIllIIIl[8]], lIIIlIIllIIIl[8], Prayer.MYSTIC_WILL);
        MYSTIC_LORD = new c(lIIIlIIllIIII[lIIIlIIllIIIl[9]], lIIIlIIllIIIl[9], Prayer.MYSTIC_LORE);
        MYSTIC_MIGHT = new c(lIIIlIIllIIII[lIIIlIIllIIIl[10]], lIIIlIIllIIIl[10], Prayer.MYSTIC_MIGHT);
        AUGURY = new c(lIIIlIIllIIII[lIIIlIIllIIIl[11]], lIIIlIIllIIIl[11], Prayer.AUGURY);
        c[] cVarArr = new c[lIIIlIIllIIIl[12]];
        cVarArr[lIIIlIIllIIIl[0]] = BURST_OF_STR;
        cVarArr[lIIIlIIllIIIl[1]] = SUPERHUMAN_STR;
        cVarArr[lIIIlIIllIIIl[2]] = ULTIMATE_STR;
        cVarArr[lIIIlIIllIIIl[3]] = PIETY;
        cVarArr[lIIIlIIllIIIl[4]] = SHARP_EYE;
        cVarArr[lIIIlIIllIIIl[5]] = HAWK_EYE;
        cVarArr[lIIIlIIllIIIl[6]] = EAGLE_EYE;
        cVarArr[lIIIlIIllIIIl[7]] = RIGOUR;
        cVarArr[lIIIlIIllIIIl[8]] = MYSTIC_WILL;
        cVarArr[lIIIlIIllIIIl[9]] = MYSTIC_LORD;
        cVarArr[lIIIlIIllIIIl[10]] = MYSTIC_MIGHT;
        cVarArr[lIIIlIIllIIIl[11]] = AUGURY;
        $VALUES = cVarArr;
    }

    private static boolean lIIlllllIIllIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIIlllllIIllIII() {
        lIIIlIIllIIII = new String[lIIIlIIllIIIl[12]];
        lIIIlIIllIIII[lIIIlIIllIIIl[0]] = lIIlllllIIlIlIl("EwwWAi4OFgIOKQUL", "QYDQz");
        lIIIlIIllIIII[lIIIlIIllIIIl[1]] = lIIlllllIIlIlIl("PBkEMQsnGRk1FzAfACY=", "oLTtY");
        lIIIlIIllIIII[lIIIlIIllIIIl[2]] = lIIlllllIIlIllI("Z8MlyKFoisLmS+E61dXuBw==", "uKfyJ");
        lIIIlIIllIIII[lIIIlIIllIIIl[3]] = lIIlllllIIlIlIl("HDkMADQ=", "LpITm");
        lIIIlIIllIIII[lIIIlIIllIIIl[4]] = lIIlllllIIlIllI("uCKqkfHCAeBR6SJy1qORGg==", "MsFBd");
        lIIIlIIllIIII[lIIIlIIllIIIl[5]] = lIIlllllIIlIllI("bjsLuqBJBEx+2RCo42cEUw==", "uxcsq");
        lIIIlIIllIIII[lIIIlIIllIIIl[6]] = lIIlllllIIlIlIl("PBUhJjUmET8v", "yTfjp");
        lIIIlIIllIIII[lIIIlIIllIIIl[7]] = lIIlllllIIlIlll("Q6LqJfUPtn4=", "Mvvop");
        lIIIlIIllIIII[lIIIlIIllIIIl[8]] = lIIlllllIIlIllI("BXH2ccU2GibHSv+SJP6hcg==", "BldXk");
        lIIIlIIllIIII[lIIIlIIllIIIl[9]] = lIIlllllIIlIlIl("Ox0WByY1GwkcPTI=", "vDESo");
        lIIIlIIllIIII[lIIIlIIllIIIl[10]] = lIIlllllIIlIllI("z65EvInyWMx83qjdYJJ/SA==", "QrxFW");
        lIIIlIIllIIII[lIIIlIIllIIIl[11]] = lIIlllllIIlIlIl("CRA3NyoR", "HEpbx");
    }

    private static void lIIlllllIIllIIl() {
        lIIIlIIllIIIl = new int[13];
        lIIIlIIllIIIl[0] = ((40 ^ 125) ^ (75 ^ 63)) & (((((152 + 106) - 214) + 127) ^ (((0 + 123) - 106) + 121)) ^ (-" ".length()));
        lIIIlIIllIIIl[1] = " ".length();
        lIIIlIIllIIIl[2] = "  ".length();
        lIIIlIIllIIIl[3] = "   ".length();
        lIIIlIIllIIIl[4] = (45 ^ 33) ^ (201 ^ 193);
        lIIIlIIllIIIl[5] = 105 ^ 108;
        lIIIlIIllIIIl[6] = 111 ^ 105;
        lIIIlIIllIIIl[7] = 182 ^ 177;
        lIIIlIIllIIIl[8] = "  ".length() ^ (75 ^ 65);
        lIIIlIIllIIIl[9] = 179 ^ 186;
        lIIIlIIllIIIl[10] = 58 ^ 48;
        lIIIlIIllIIIl[11] = (106 ^ 126) ^ (110 ^ 113);
        lIIIlIIllIIIl[12] = 97 ^ 109;
    }

    private static String lIIlllllIIlIllI(String lllllllllllllllIIIIlllllIIlIlIIl, String lllllllllllllllIIIIlllllIIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllllIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllllIIlIIllI.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIIIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlIIllIIIl[2], lllllllllllllllIIIIlllllIIlIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllllIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllllIIlIlIlI) {
            lllllllllllllllIIIIlllllIIlIlIlI.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    private static String lIIlllllIIlIlll(String lllllllllllllllIIIIlllllIIIlllII, String lllllllllllllllIIIIlllllIIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllllIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllllIIIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllllIIIllllI.init(lIIIlIIllIIIl[2], secretKeySpec);
            return new String(lllllllllllllllIIIIlllllIIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllllIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllllIIIlllIl) {
            lllllllllllllllIIIIlllllIIIlllIl.printStackTrace();
            return null;
        }
    }

    private c(String str, int i, Prayer prayer) {
        this.prayer = prayer;
    }
}
