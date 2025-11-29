package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.y  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/y.class */
public final class EnumC0028y {
    public static final /* synthetic */ EnumC0028y CRYSTAL_HALBERD;
    public static final /* synthetic */ EnumC0028y NONE;
    private static final /* synthetic */ EnumC0028y[] $VALUES;
    public static final /* synthetic */ EnumC0028y OSMUMTENS_FANG;
    public static final /* synthetic */ EnumC0028y ARMADYL_GODSWORD;
    private final /* synthetic */ boolean twoHanded;
    public static final /* synthetic */ EnumC0028y BANDOS_GODSWORD;
    public static final /* synthetic */ EnumC0028y ANCIENT_GODSWORD;
    public static final /* synthetic */ EnumC0028y DRAGON_MACE;
    private final /* synthetic */ int itemID;
    private final /* synthetic */ int specAmount;
    private static /* synthetic */ int[] lllIlllIlIII;
    public static final /* synthetic */ EnumC0028y VOID_WAKER;
    public static final /* synthetic */ EnumC0028y DRAGON_WARHAMMER;
    public static final /* synthetic */ EnumC0028y GRANITE_MAUL;
    public static final /* synthetic */ EnumC0028y DRAGON_CLAWS;
    public static final /* synthetic */ EnumC0028y SARADOMIN_GODSWORD;
    private static /* synthetic */ String[] lllIlllIIIll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    static {
        lIIIllIlllIlIll();
        lIIIllIlllIIlII();
        GRANITE_MAUL = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[0]], lllIlllIlIII[0], lllIlllIlIII[1], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_CLAWS = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[3]], lllIlllIlIII[3], lllIlllIlIII[4], lllIlllIlIII[2], lllIlllIlIII[3]);
        VOID_WAKER = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[5]], lllIlllIlIII[5], lllIlllIlIII[6], lllIlllIlIII[2], lllIlllIlIII[0]);
        ANCIENT_GODSWORD = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[7]], lllIlllIlIII[7], lllIlllIlIII[8], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_MACE = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[9]], lllIlllIlIII[9], lllIlllIlIII[10], lllIlllIlIII[11], lllIlllIlIII[0]);
        OSMUMTENS_FANG = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[12]], lllIlllIlIII[12], lllIlllIlIII[13], lllIlllIlIII[11], lllIlllIlIII[0]);
        SARADOMIN_GODSWORD = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[14]], lllIlllIlIII[14], lllIlllIlIII[15], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_WARHAMMER = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[16]], lllIlllIlIII[16], lllIlllIlIII[17], lllIlllIlIII[2], lllIlllIlIII[0]);
        ARMADYL_GODSWORD = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[18]], lllIlllIlIII[18], lllIlllIlIII[19], lllIlllIlIII[2], lllIlllIlIII[3]);
        BANDOS_GODSWORD = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[20]], lllIlllIlIII[20], lllIlllIlIII[21], lllIlllIlIII[2], lllIlllIlIII[3]);
        CRYSTAL_HALBERD = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[22]], lllIlllIlIII[22], lllIlllIlIII[23], lllIlllIlIII[24], lllIlllIlIII[3]);
        NONE = new EnumC0028y(lllIlllIIIll[lllIlllIlIII[25]], lllIlllIlIII[25], lllIlllIlIII[26], lllIlllIlIII[0], lllIlllIlIII[0]);
        EnumC0028y[] enumC0028yArr = new EnumC0028y[lllIlllIlIII[27]];
        enumC0028yArr[lllIlllIlIII[0]] = GRANITE_MAUL;
        enumC0028yArr[lllIlllIlIII[3]] = DRAGON_CLAWS;
        enumC0028yArr[lllIlllIlIII[5]] = VOID_WAKER;
        enumC0028yArr[lllIlllIlIII[7]] = ANCIENT_GODSWORD;
        enumC0028yArr[lllIlllIlIII[9]] = DRAGON_MACE;
        enumC0028yArr[lllIlllIlIII[12]] = OSMUMTENS_FANG;
        enumC0028yArr[lllIlllIlIII[14]] = SARADOMIN_GODSWORD;
        enumC0028yArr[lllIlllIlIII[16]] = DRAGON_WARHAMMER;
        enumC0028yArr[lllIlllIlIII[18]] = ARMADYL_GODSWORD;
        enumC0028yArr[lllIlllIlIII[20]] = BANDOS_GODSWORD;
        enumC0028yArr[lllIlllIlIII[22]] = CRYSTAL_HALBERD;
        enumC0028yArr[lllIlllIlIII[25]] = NONE;
        $VALUES = enumC0028yArr;
    }

    private static void lIIIllIlllIIlII() {
        lllIlllIIIll = new String[lllIlllIlIII[27]];
        lllIlllIIIll[lllIlllIlIII[0]] = lIIIllIllIlllIl("DDQ7Hg8fIyUdBx4q", "KfzPF");
        lllIlllIIIll[lllIlllIlIII[3]] = lIIIllIllIllllI("we1ZSdXl4o87NAAsHoLvdQ==", "QOVYM");
        lllIlllIIIll[lllIlllIlIII[5]] = lIIIllIllIllllI("hAHkYnEuy+6EnLKSnojK2A==", "pQPHT");
        lllIlllIIIll[lllIlllIlIII[7]] = lIIIllIllIlllIl("DgInOj8BGDs0NQsfMzwoCw==", "OLdsz");
        lllIlllIIIll[lllIlllIlIII[9]] = lIIIllIllIlllIl("HiEiMw4ULC41Ah8=", "ZsctA");
        lllIlllIIIll[lllIlllIlIII[12]] = lIIIllIllIllllI("I8FQ+lW5cVlpQ99d7dcCtQ==", "apnkT");
        lllIlllIIIll[lllIlllIlIII[14]] = lIIIllIllIllllI("2oPBsDLogLPHpjoZeaBypAesFwHoetGw", "aMXOK");
        lllIlllIIIll[lllIlllIlIII[16]] = lIIIllIllIlllIl("KjA1JC0gPSMiMCYjOS4nPA==", "nbtcb");
        lllIlllIIIll[lllIlllIlIII[18]] = lIIIllIlllIIIlI("QXAPX5ZJJOWniE42DXfIX8PeeJrjRwQI", "qdujH");
        lllIlllIIIll[lllIlllIlIII[20]] = lIIIllIlllIIIlI("v02kfd5y9B+BDG1hC47kag==", "bFLwv");
        lllIlllIIIll[lllIlllIlIII[22]] = lIIIllIllIlllIl("DjYBGDgMKAcDLQEmHRko", "MdXKl");
        lllIlllIIIll[lllIlllIlIII[25]] = lIIIllIllIllllI("3M9X26NSXwM=", "AEYbR");
    }

    private EnumC0028y(String str, int i, int i2, int i3, boolean z) {
        this.itemID = i2;
        this.specAmount = i3;
        this.twoHanded = z;
    }

    public int bH() {
        return this.itemID;
    }

    private static String lIIIllIllIllllI(String lllllllllllllllIIllIIlIIlIllIIlI, String lllllllllllllllIIllIIlIIlIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIIlIllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIIlIllIlII.init(lllIlllIlIII[5], secretKeySpec);
            return new String(lllllllllllllllIIllIIlIIlIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIlIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIIlIllIIll) {
            lllllllllllllllIIllIIlIIlIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlllIllII(int i, int i2) {
        return i < i2;
    }

    public boolean bR() {
        return this.twoHanded;
    }

    public static EnumC0028y[] values() {
        return (EnumC0028y[]) $VALUES.clone();
    }

    private static void lIIIllIlllIlIll() {
        lllIlllIlIII = new int[28];
        lllIlllIlIII[0] = ((((28 + 176) - 160) + 147) ^ (((72 + 36) - 91) + 145)) & (((89 ^ 23) ^ (149 ^ 198)) ^ (-" ".length()));
        lllIlllIlIII[1] = (-8217) & 32441;
        lllIlllIlIII[2] = 124 ^ 78;
        lllIlllIlIII[3] = " ".length();
        lllIlllIlIII[4] = (-2692) & 16343;
        lllIlllIlIII[5] = "  ".length();
        lllIlllIlIII[6] = (-4246) & 31935;
        lllIlllIlIII[7] = "   ".length();
        lllIlllIlIII[8] = (-((-8777) & 14925)) & (-131) & 32511;
        lllIlllIlIII[9] = 15 ^ 11;
        lllIlllIlIII[10] = (-27138) & 28571;
        lllIlllIlIII[11] = (((61 + 36) - (-6)) + 29) ^ (((107 + 70) - 46) + 26);
        lllIlllIlIII[12] = 166 ^ 163;
        lllIlllIlIII[13] = (-4497) & 30715;
        lllIlllIlIII[14] = 137 ^ 143;
        lllIlllIlIII[15] = (-((-4625) & 4977)) & (-4226) & 16383;
        lllIlllIlIII[16] = (((96 + 103) - 123) + 102) ^ (((58 + 7) - (-102)) + 14);
        lllIlllIlIII[17] = (-((-29068) & 31727)) & (-21) & 16255;
        lllIlllIlIII[18] = 20 ^ 28;
        lllIlllIlIII[19] = (-198) & 11999;
        lllIlllIlIII[20] = (192 ^ 183) ^ (50 ^ 76);
        lllIlllIlIII[21] = (-4194) & 15997;
        lllIlllIlIII[22] = (((110 + 130) - 141) + 41) ^ (((84 + 101) - 130) + 79);
        lllIlllIlIII[23] = (-((-19491) & 20011)) & (-8257) & 32763;
        lllIlllIlIII[24] = (210 ^ 185) ^ (222 ^ 171);
        lllIlllIlIII[25] = 1 ^ 10;
        lllIlllIlIII[26] = -" ".length();
        lllIlllIlIII[27] = 140 ^ 128;
    }

    private static String lIIIllIlllIIIlI(String lllllllllllllllIIllIIlIIlIlIIlIl, String lllllllllllllllIIllIIlIIlIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIIlIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIlIlIIlII.getBytes(StandardCharsets.UTF_8)), lllIlllIlIII[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIlllIlIII[5], lllllllllllllllIIllIIlIIlIlIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIIlIlIIllI) {
            lllllllllllllllIIllIIlIIlIlIIllI.printStackTrace();
            return null;
        }
    }

    public static EnumC0028y valueOf(String str) {
        return (EnumC0028y) Enum.valueOf(EnumC0028y.class, str);
    }

    private static String lIIIllIllIlllIl(String lllllllllllllllIIllIIlIIllIIIlll, String lllllllllllllllIIllIIlIIllIIIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIIllIIIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIlIIllIIIllI.toCharArray();
        int lllllllllllllllIIllIIlIIllIIIIll = lllIlllIlIII[0];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllIIllIIlIIlIllllII = charArray2.length;
        int i = lllIlllIlIII[0];
        while (lIIIllIlllIllII(i, lllllllllllllllIIllIIlIIlIllllII)) {
            lllllllllllllllIIllIIlIIllIIIlIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIIlIIllIIIIll % charArray.length]));
            "".length();
            lllllllllllllllIIllIIlIIllIIIIll++;
            i++;
            "".length();
            if ((((156 ^ 155) ^ (99 ^ 71)) & (((45 ^ 59) ^ (33 ^ 20)) ^ (-" ".length()))) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIlIIllIIIlIl);
    }

    public int bQ() {
        return this.specAmount;
    }
}
