package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.v  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/v.class */
public final class EnumC0025v {
    public static final /* synthetic */ EnumC0025v INQUISITORS_MACE;
    public static final /* synthetic */ EnumC0025v SARADOMIN_GODSWORD;
    private static final /* synthetic */ EnumC0025v[] $VALUES;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ EnumC0025v DRAGON_MACE;
    public static final /* synthetic */ EnumC0025v NONE;
    private static /* synthetic */ String[] llllIIIIlllI;
    public static final /* synthetic */ EnumC0025v ARMADYL_GODSWORD;
    public static final /* synthetic */ EnumC0025v BANDOS_GODSWORD;
    public static final /* synthetic */ EnumC0025v ELDER_MAUL;
    public static final /* synthetic */ EnumC0025v TZHAAR_KET_OM;
    private static /* synthetic */ int[] llllIIIlIIIl;
    public static final /* synthetic */ EnumC0025v ANCIENT_GODSWORD;
    public static final /* synthetic */ EnumC0025v DRAGON_WARHAMMER;

    private static String lIIIlllIllIllIl(String lllllllllllllllIIllIIIIIIlllllll, String lllllllllllllllIIllIIIIIIllllllI) {
        String lllllllllllllllIIllIIIIIIlllllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIIIIIlllllIl = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIIIIIllllllI.toCharArray();
        int lllllllllllllllIIllIIIIIIllllIll = llllIIIlIIIl[0];
        char[] charArray2 = lllllllllllllllIIllIIIIIIlllllll2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIIllIIIIIIlllIIll = llllIIIlIIIl[0];
        while (lIIIlllIllllIII(lllllllllllllllIIllIIIIIIlllIIll, length)) {
            lllllllllllllllIIllIIIIIIlllllIl.append((char) (charArray2[lllllllllllllllIIllIIIIIIlllIIll] ^ charArray[lllllllllllllllIIllIIIIIIllllIll % charArray.length]));
            "".length();
            lllllllllllllllIIllIIIIIIllllIll++;
            lllllllllllllllIIllIIIIIIlllIIll++;
            "".length();
            if (((((154 + 94) - 130) + 45) ^ (((91 + 1) - 40) + 115)) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIIIIIlllllIl);
    }

    private EnumC0025v(String str, int i, int i2) {
        this.itemID = i2;
    }

    private static void lIIIlllIlllIlII() {
        llllIIIIlllI = new String[llllIIIlIIIl[20]];
        llllIIIIlllI[llllIIIlIIIl[0]] = lIIIlllIllIllIl("CwMAEDcRAgUAKQ==", "NODUe");
        llllIIIIlllI[llllIIIlIIIl[2]] = lIIIlllIllIllIl("HQg/IycBBCQsPAkGKTE0ARsp", "NImbc");
        llllIIIIlllI[llllIIIlIIIl[4]] = lIIIlllIllIllIl("NBw/BQAsAi0DCzEdJQsWMQ==", "uNrDD");
        llllIIIIlllI[llllIIIlIIIl[6]] = lIIIlllIllIlllI("8QY4RSYl5SarTXYxlmwFPA==", "UrbsY");
        llllIIIIlllI[llllIIIlIIIl[8]] = lIIIlllIllIllll("X7vVsSGXaAzR4KhMf091wZO/pnRw0xXa", "BalVQ");
        llllIIIIlllI[llllIIIlIIIl[10]] = lIIIlllIllIllIl("JjMiJCsgNiEgPi0mJw==", "rijej");
        llllIIIIlllI[llllIIIlIIIl[12]] = lIIIlllIllIllll("ek/oQRqQuuLNUhPbP1RmRdAIxlxDQuUY", "HDucy");
        llllIIIIlllI[llllIIIlIIIl[14]] = lIIIlllIllIllIl("DTcoKx0HOiQtEQw=", "IeilR");
        llllIIIIlllI[llllIIIlIIIl[16]] = lIIIlllIllIlllI("5ay6QN4pF9egU1i0tJjvqI/zO72BRsxh", "oYclB");
        llllIIIIlllI[llllIIIlIIIl[18]] = lIIIlllIllIlllI("xA0IOJ1VivU=", "kESnP");
    }

    private static String lIIIlllIllIllll(String lllllllllllllllIIllIIIIIlIIIllll, String lllllllllllllllIIllIIIIIlIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIIIlIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIIIlIIlIIIl.init(llllIIIlIIIl[4], secretKeySpec);
            return new String(lllllllllllllllIIllIIIIIlIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIIlIIlIIII) {
            lllllllllllllllIIllIIIIIlIIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIllllIII(int i, int i2) {
        return i < i2;
    }

    public int bH() {
        return this.itemID;
    }

    static {
        lIIIlllIlllIlll();
        lIIIlllIlllIlII();
        ELDER_MAUL = new EnumC0025v(llllIIIIlllI[llllIIIlIIIl[0]], llllIIIlIIIl[0], llllIIIlIIIl[1]);
        SARADOMIN_GODSWORD = new EnumC0025v(llllIIIIlllI[llllIIIlIIIl[2]], llllIIIlIIIl[2], llllIIIlIIIl[3]);
        ARMADYL_GODSWORD = new EnumC0025v(llllIIIIlllI[llllIIIlIIIl[4]], llllIIIlIIIl[4], llllIIIlIIIl[5]);
        BANDOS_GODSWORD = new EnumC0025v(llllIIIIlllI[llllIIIlIIIl[6]], llllIIIlIIIl[6], llllIIIlIIIl[7]);
        ANCIENT_GODSWORD = new EnumC0025v(llllIIIIlllI[llllIIIlIIIl[8]], llllIIIlIIIl[8], llllIIIlIIIl[9]);
        TZHAAR_KET_OM = new EnumC0025v(llllIIIIlllI[llllIIIlIIIl[10]], llllIIIlIIIl[10], llllIIIlIIIl[11]);
        INQUISITORS_MACE = new EnumC0025v(llllIIIIlllI[llllIIIlIIIl[12]], llllIIIlIIIl[12], llllIIIlIIIl[13]);
        DRAGON_MACE = new EnumC0025v(llllIIIIlllI[llllIIIlIIIl[14]], llllIIIlIIIl[14], llllIIIlIIIl[15]);
        DRAGON_WARHAMMER = new EnumC0025v(llllIIIIlllI[llllIIIlIIIl[16]], llllIIIlIIIl[16], llllIIIlIIIl[17]);
        NONE = new EnumC0025v(llllIIIIlllI[llllIIIlIIIl[18]], llllIIIlIIIl[18], llllIIIlIIIl[19]);
        EnumC0025v[] enumC0025vArr = new EnumC0025v[llllIIIlIIIl[20]];
        enumC0025vArr[llllIIIlIIIl[0]] = ELDER_MAUL;
        enumC0025vArr[llllIIIlIIIl[2]] = SARADOMIN_GODSWORD;
        enumC0025vArr[llllIIIlIIIl[4]] = ARMADYL_GODSWORD;
        enumC0025vArr[llllIIIlIIIl[6]] = BANDOS_GODSWORD;
        enumC0025vArr[llllIIIlIIIl[8]] = ANCIENT_GODSWORD;
        enumC0025vArr[llllIIIlIIIl[10]] = TZHAAR_KET_OM;
        enumC0025vArr[llllIIIlIIIl[12]] = INQUISITORS_MACE;
        enumC0025vArr[llllIIIlIIIl[14]] = DRAGON_MACE;
        enumC0025vArr[llllIIIlIIIl[16]] = DRAGON_WARHAMMER;
        enumC0025vArr[llllIIIlIIIl[18]] = NONE;
        $VALUES = enumC0025vArr;
    }

    public static EnumC0025v[] values() {
        return (EnumC0025v[]) $VALUES.clone();
    }

    private static String lIIIlllIllIlllI(String lllllllllllllllIIllIIIIIIllIlIlI, String lllllllllllllllIIllIIIIIIllIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIIllIlIIl.getBytes(StandardCharsets.UTF_8)), llllIIIlIIIl[16]), "DES");
            Cipher lllllllllllllllIIllIIIIIIllIllII = Cipher.getInstance("DES");
            lllllllllllllllIIllIIIIIIllIllII.init(llllIIIlIIIl[4], lllllllllllllllIIllIIIIIIllIllIl);
            return new String(lllllllllllllllIIllIIIIIIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIIIIllIlIll) {
            lllllllllllllllIIllIIIIIIllIlIll.printStackTrace();
            return null;
        }
    }

    public static EnumC0025v valueOf(String str) {
        return (EnumC0025v) Enum.valueOf(EnumC0025v.class, str);
    }

    private static void lIIIlllIlllIlll() {
        llllIIIlIIIl = new int[21];
        llllIIIlIIIl[0] = ((70 ^ 21) ^ (119 ^ 60)) & (((((163 + 134) - 287) + 162) ^ (((133 + 28) - 76) + 95)) ^ (-" ".length()));
        llllIIIlIIIl[1] = (-1505) & 22507;
        llllIIIlIIIl[2] = " ".length();
        llllIIIlIIIl[3] = (-4449) & 16254;
        llllIIIlIIIl[4] = "  ".length();
        llllIIIlIIIl[5] = (-4357) & 16158;
        llllIIIlIIIl[6] = "   ".length();
        llllIIIlIIIl[7] = (-((-8601) & 25081)) & (-4354) & 32637;
        llllIIIlIIIl[8] = (234 ^ 131) ^ (250 ^ 151);
        llllIIIlIIIl[9] = (-((-25161) & 29517)) & (-129) & 30717;
        llllIIIlIIIl[10] = (((85 + 152) - 233) + 184) ^ (((102 + 121) - 49) + 11);
        llllIIIlIIIl[11] = (-17938) & 24465;
        llllIIIlIIIl[12] = (59 ^ 115) ^ (102 ^ 40);
        llllIIIlIIIl[13] = (-(((111 + 27) - 79) + 70)) & (-27) & 24571;
        llllIIIlIIIl[14] = "  ".length() ^ (10 ^ 15);
        llllIIIlIIIl[15] = (-6657) & 8090;
        llllIIIlIIIl[16] = (((105 + 173) - 102) + 27) ^ (((161 + 60) - 200) + 174);
        llllIIIlIIIl[17] = (-2278) & 15853;
        llllIIIlIIIl[18] = (229 ^ 164) ^ (55 ^ 127);
        llllIIIlIIIl[19] = -" ".length();
        llllIIIlIIIl[20] = (((38 + 70) - 78) + 111) ^ (((29 + 78) - 83) + 111);
    }
}
