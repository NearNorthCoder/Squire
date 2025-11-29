/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class y
extends Enum<y> {
    public static final /* synthetic */ /* enum */ y CRYSTAL_HALBERD;
    public static final /* synthetic */ /* enum */ y NONE;
    private static final /* synthetic */ y[] $VALUES;
    public static final /* synthetic */ /* enum */ y OSMUMTENS_FANG;
    public static final /* synthetic */ /* enum */ y ARMADYL_GODSWORD;
    private final /* synthetic */ boolean twoHanded;
    public static final /* synthetic */ /* enum */ y BANDOS_GODSWORD;
    public static final /* synthetic */ /* enum */ y ANCIENT_GODSWORD;
    public static final /* synthetic */ /* enum */ y DRAGON_MACE;
    private final /* synthetic */ int itemID;
    private final /* synthetic */ int specAmount;
    private static /* synthetic */ int[] lllIlllIlIII;
    public static final /* synthetic */ /* enum */ y VOID_WAKER;
    public static final /* synthetic */ /* enum */ y DRAGON_WARHAMMER;
    public static final /* synthetic */ /* enum */ y GRANITE_MAUL;
    public static final /* synthetic */ /* enum */ y DRAGON_CLAWS;
    public static final /* synthetic */ /* enum */ y SARADOMIN_GODSWORD;
    private static /* synthetic */ String[] lllIlllIIIll;

    static {
        y.lIIIllIlllIlIll();
        y.lIIIllIlllIIlII();
        GRANITE_MAUL = new y(lllIlllIlIII[1], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_CLAWS = new y(lllIlllIlIII[4], lllIlllIlIII[2], lllIlllIlIII[3]);
        VOID_WAKER = new y(lllIlllIlIII[6], lllIlllIlIII[2], lllIlllIlIII[0]);
        ANCIENT_GODSWORD = new y(lllIlllIlIII[8], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_MACE = new y(lllIlllIlIII[10], lllIlllIlIII[11], lllIlllIlIII[0]);
        OSMUMTENS_FANG = new y(lllIlllIlIII[13], lllIlllIlIII[11], lllIlllIlIII[0]);
        SARADOMIN_GODSWORD = new y(lllIlllIlIII[15], lllIlllIlIII[2], lllIlllIlIII[3]);
        DRAGON_WARHAMMER = new y(lllIlllIlIII[17], lllIlllIlIII[2], lllIlllIlIII[0]);
        ARMADYL_GODSWORD = new y(lllIlllIlIII[19], lllIlllIlIII[2], lllIlllIlIII[3]);
        BANDOS_GODSWORD = new y(lllIlllIlIII[21], lllIlllIlIII[2], lllIlllIlIII[3]);
        CRYSTAL_HALBERD = new y(lllIlllIlIII[23], lllIlllIlIII[24], lllIlllIlIII[3]);
        NONE = new y(lllIlllIlIII[26], lllIlllIlIII[0], lllIlllIlIII[0]);
        y[] yArray = new y[lllIlllIlIII[27]];
        yArray[y.lllIlllIlIII[0]] = GRANITE_MAUL;
        yArray[y.lllIlllIlIII[3]] = DRAGON_CLAWS;
        yArray[y.lllIlllIlIII[5]] = VOID_WAKER;
        yArray[y.lllIlllIlIII[7]] = ANCIENT_GODSWORD;
        yArray[y.lllIlllIlIII[9]] = DRAGON_MACE;
        yArray[y.lllIlllIlIII[12]] = OSMUMTENS_FANG;
        yArray[y.lllIlllIlIII[14]] = SARADOMIN_GODSWORD;
        yArray[y.lllIlllIlIII[16]] = DRAGON_WARHAMMER;
        yArray[y.lllIlllIlIII[18]] = ARMADYL_GODSWORD;
        yArray[y.lllIlllIlIII[20]] = BANDOS_GODSWORD;
        yArray[y.lllIlllIlIII[22]] = CRYSTAL_HALBERD;
        yArray[y.lllIlllIlIII[25]] = NONE;
        $VALUES = yArray;
    }

    private static void lIIIllIlllIIlII() {
        lllIlllIIIll = new String[lllIlllIlIII[27]];
        y.lllIlllIIIll[y.lllIlllIlIII[0]] = y.lIIIllIllIlllIl("DDQ7Hg8fIyUdBx4q", "KfzPF");
        y.lllIlllIIIll[y.lllIlllIlIII[3]] = y.lIIIllIllIllllI("we1ZSdXl4o87NAAsHoLvdQ==", "QOVYM");
        y.lllIlllIIIll[y.lllIlllIlIII[5]] = y.lIIIllIllIllllI("hAHkYnEuy+6EnLKSnojK2A==", "pQPHT");
        y.lllIlllIIIll[y.lllIlllIlIII[7]] = y.lIIIllIllIlllIl("DgInOj8BGDs0NQsfMzwoCw==", "OLdsz");
        y.lllIlllIIIll[y.lllIlllIlIII[9]] = y.lIIIllIllIlllIl("HiEiMw4ULC41Ah8=", "ZsctA");
        y.lllIlllIIIll[y.lllIlllIlIII[12]] = y.lIIIllIllIllllI("I8FQ+lW5cVlpQ99d7dcCtQ==", "apnkT");
        y.lllIlllIIIll[y.lllIlllIlIII[14]] = y.lIIIllIllIllllI("2oPBsDLogLPHpjoZeaBypAesFwHoetGw", "aMXOK");
        y.lllIlllIIIll[y.lllIlllIlIII[16]] = y.lIIIllIllIlllIl("KjA1JC0gPSMiMCYjOS4nPA==", "nbtcb");
        y.lllIlllIIIll[y.lllIlllIlIII[18]] = y.lIIIllIlllIIIlI("QXAPX5ZJJOWniE42DXfIX8PeeJrjRwQI", "qdujH");
        y.lllIlllIIIll[y.lllIlllIlIII[20]] = y.lIIIllIlllIIIlI("v02kfd5y9B+BDG1hC47kag==", "bFLwv");
        y.lllIlllIIIll[y.lllIlllIlIII[22]] = y.lIIIllIllIlllIl("DjYBGDgMKAcDLQEmHRko", "MdXKl");
        y.lllIlllIIIll[y.lllIlllIlIII[25]] = y.lIIIllIllIllllI("3M9X26NSXwM=", "AEYbR");
    }

    private y(int n3, int n4, boolean bl) {
        this.itemID = n3;
        this.specAmount = n4;
        this.twoHanded = bl;
    }

    public int bH() {
        return this.itemID;
    }

    private static String lIIIllIllIllllI(String lllllllllllllllIIllIIlIIlIllIIII, String lllllllllllllllIIllIIlIIlIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIIlIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIIlIllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIIlIllIlII.init(lllIlllIlIII[5], lllllllllllllllIIllIIlIIlIllIlIl);
            return new String(lllllllllllllllIIllIIlIIlIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIIlIllIIll) {
            lllllllllllllllIIllIIlIIlIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlllIllII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean bR() {
        return this.twoHanded;
    }

    public static y[] values() {
        return (y[])$VALUES.clone();
    }

    private static void lIIIllIlllIlIll() {
        lllIlllIlIII = new int[28];
        y.lllIlllIlIII[0] = (28 + 176 - 160 + 147 ^ 72 + 36 - 91 + 145) & (0x59 ^ 0x17 ^ (0x95 ^ 0xC6) ^ -" ".length());
        y.lllIlllIlIII[1] = 0xFFFFDFE7 & 0x7EB9;
        y.lllIlllIlIII[2] = 0x7C ^ 0x4E;
        y.lllIlllIlIII[3] = " ".length();
        y.lllIlllIlIII[4] = 0xFFFFF57C & 0x3FD7;
        y.lllIlllIlIII[5] = "  ".length();
        y.lllIlllIlIII[6] = 0xFFFFEF6A & 0x7CBF;
        y.lllIlllIlIII[7] = "   ".length();
        y.lllIlllIlIII[8] = -(0xFFFFDDB7 & 0x3A4D) & (0xFFFFFF7D & 0x7EFF);
        y.lllIlllIlIII[9] = 0xF ^ 0xB;
        y.lllIlllIlIII[10] = 0xFFFF95FE & 0x6F9B;
        y.lllIlllIlIII[11] = 61 + 36 - -6 + 29 ^ 107 + 70 - 46 + 26;
        y.lllIlllIlIII[12] = 0xA6 ^ 0xA3;
        y.lllIlllIlIII[13] = 0xFFFFEE6F & 0x77FB;
        y.lllIlllIlIII[14] = 0x89 ^ 0x8F;
        y.lllIlllIlIII[15] = -(0xFFFFEDEF & 0x1371) & (0xFFFFEF7E & 0x3FFF);
        y.lllIlllIlIII[16] = 96 + 103 - 123 + 102 ^ 58 + 7 - -102 + 14;
        y.lllIlllIlIII[17] = -(0xFFFF8E74 & 0x7BEF) & (0xFFFFFFEB & 0x3F7F);
        y.lllIlllIlIII[18] = 0x14 ^ 0x1C;
        y.lllIlllIlIII[19] = 0xFFFFFF3A & 0x2EDF;
        y.lllIlllIlIII[20] = 0xC0 ^ 0xB7 ^ (0x32 ^ 0x4C);
        y.lllIlllIlIII[21] = 0xFFFFEF9E & 0x3E7D;
        y.lllIlllIlIII[22] = 110 + 130 - 141 + 41 ^ 84 + 101 - 130 + 79;
        y.lllIlllIlIII[23] = -(0xFFFFB3DD & 0x4E2B) & (0xFFFFDFBF & 0x7FFB);
        y.lllIlllIlIII[24] = 0xD2 ^ 0xB9 ^ (0xDE ^ 0xAB);
        y.lllIlllIlIII[25] = 1 ^ 0xA;
        y.lllIlllIlIII[26] = -" ".length();
        y.lllIlllIlIII[27] = 0x8C ^ 0x80;
    }

    private static String lIIIllIlllIIIlI(String lllllllllllllllIIllIIlIIlIlIIlIl, String lllllllllllllllIIllIIlIIlIlIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIIlIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), lllIlllIlIII[18]), "DES");
            Cipher lllllllllllllllIIllIIlIIlIlIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIIlIlIIlll.init(lllIlllIlIII[5], lllllllllllllllIIllIIlIIlIlIlIII);
            return new String(lllllllllllllllIIllIIlIIlIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlIIlIlIIllI) {
            lllllllllllllllIIllIIlIIlIlIIllI.printStackTrace();
            return null;
        }
    }

    public static y valueOf(String string) {
        return Enum.valueOf(y.class, string);
    }

    private static String lIIIllIllIlllIl(String lllllllllllllllIIllIIlIIllIIIlll, String lllllllllllllllIIllIIlIIllIIIIIl) {
        lllllllllllllllIIllIIlIIllIIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIIllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIIllIIIlIl = new StringBuilder();
        char[] lllllllllllllllIIllIIlIIllIIIlII = lllllllllllllllIIllIIlIIllIIIIIl.toCharArray();
        int lllllllllllllllIIllIIlIIllIIIIll = lllIlllIlIII[0];
        char[] lllllllllllllllIIllIIlIIlIllllIl = lllllllllllllllIIllIIlIIllIIIlll.toCharArray();
        int lllllllllllllllIIllIIlIIlIllllII = lllllllllllllllIIllIIlIIlIllllIl.length;
        int lllllllllllllllIIllIIlIIlIlllIll = lllIlllIlIII[0];
        while (y.lIIIllIlllIllII(lllllllllllllllIIllIIlIIlIlllIll, lllllllllllllllIIllIIlIIlIllllII)) {
            char lllllllllllllllIIllIIlIIllIIlIII = lllllllllllllllIIllIIlIIlIllllIl[lllllllllllllllIIllIIlIIlIlllIll];
            lllllllllllllllIIllIIlIIllIIIlIl.append((char)(lllllllllllllllIIllIIlIIllIIlIII ^ lllllllllllllllIIllIIlIIllIIIlII[lllllllllllllllIIllIIlIIllIIIIll % lllllllllllllllIIllIIlIIllIIIlII.length]));
            "".length();
            ++lllllllllllllllIIllIIlIIllIIIIll;
            ++lllllllllllllllIIllIIlIIlIlllIll;
            "".length();
            if (((0x9C ^ 0x9B ^ (0x63 ^ 0x47)) & (0x2D ^ 0x3B ^ (0x21 ^ 0x14) ^ -" ".length())) >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIlIIllIIIlIl);
    }

    public int bQ() {
        return this.specAmount;
    }
}

