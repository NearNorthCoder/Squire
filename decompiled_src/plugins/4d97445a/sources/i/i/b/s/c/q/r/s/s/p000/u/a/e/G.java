package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.G  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/G.class */
public final class G {
    public static final /* synthetic */ G CRYSTAL_HALBERD;
    private static /* synthetic */ String[] lIIlllllI;
    public static final /* synthetic */ G DRAGON_DAGGER;
    public static final /* synthetic */ G DRAGON_LONGSWORD;
    public static final /* synthetic */ G SARADOMIN_SWORD;
    public static final /* synthetic */ G DRAGON_DAGGER_PPP;
    public static final /* synthetic */ G DRAGON_DAGGER_PP;
    public static final /* synthetic */ G DRAGON_CLAWS;
    public static final /* synthetic */ G TOXIC_BLOWPIPE;
    public static final /* synthetic */ G DRAGON_DAGGER_P;
    public static final /* synthetic */ G SARADOMIN_BLESSED_SWORD;
    public static final /* synthetic */ G ARMADYL_GODSWORD;
    public static final /* synthetic */ G BANDOS_GODSWORD;
    public static final /* synthetic */ G DRAGON_BATTLEAXE;
    private static /* synthetic */ int[] lIIllllll;
    private static final /* synthetic */ G[] $VALUES;
    private final /* synthetic */ int itemID;
    private final /* synthetic */ int specAmount;
    public static final /* synthetic */ G DRAGON_MACE;
    public static final /* synthetic */ G SARADOMIN_GODSWORD;
    public static final /* synthetic */ G OSMUMTENS_FANG;
    public static final /* synthetic */ G VOIDWAKER;
    public static final /* synthetic */ G DRAGON_WARHAMMER;
    public static final /* synthetic */ G DRAGON_HALBERD;
    private final /* synthetic */ boolean twoHanded;

    private G(String str, int i2, int i3, int i4, boolean z) {
        this.itemID = i3;
        this.specAmount = i4;
        this.twoHanded = z;
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    private static String lIIIlIllIII(String llIIIlIIIlllIIl, String llIIIlIIIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIIIlllIII.getBytes(StandardCharsets.UTF_8)), lIIllllll[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIlIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlIIIlllIlI) {
            llIIIlIIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlllIl(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIIIlIllIll() {
        lIIlllllI = new String[lIIllllll[43]];
        lIIlllllI[lIIllllll[0]] = lIIIlIllIII("r25UnRqJCwXYMg9pVy0wz4yrljitZiHR", "SuAnz");
        lIIlllllI[lIIllllll[3]] = lIIIlIllIIl("KiAtBDsgLS8PNTkh", "nrlCt");
        lIIlllllI[lIIllllll[6]] = lIIIlIllIlI("NAhy5WTv1li+XINGOWziSA==", "RqQcR");
        lIIlllllI[lIIllllll[9]] = lIIIlIllIlI("YqcHGm/zT8UJLu0r2WYoIA==", "btXNg");
        lIIlllllI[lIIllllll[11]] = lIIIlIllIII("FZ8LL4fOpwIi22AR3j08aB1f4M2C4uMN", "hUyrp");
        lIIlllllI[lIIllllll[13]] = lIIIlIllIII("zu1wahXgr6sDBp1UOXJ7E0TobUZj/D6i", "rSwwr");
        lIIlllllI[lIIllllll[15]] = lIIIlIllIIl("NBQwHyY+GTkZJTIDIxw=", "pFqXi");
        lIIlllllI[lIIllllll[18]] = lIIIlIllIIl("IzkEIgMpNAkqAiA4EioeIw==", "gkEeL");
        lIIlllllI[lIIllllll[20]] = lIIIlIllIlI("2r0HW79dxKwdgwpLEs2gJQ==", "ngncs");
        lIIlllllI[lIIllllll[22]] = lIIIlIllIlI("CXBaP77NJNbhBbR/Y5HoxGPbJ/xn6ioM", "PjzRm");
        lIIlllllI[lIIllllll[24]] = lIIIlIllIlI("hJjRo8LkyCFK+/+HQtKCv8itFLZAoPu9", "DudTv");
        lIIlllllI[lIIllllll[26]] = lIIIlIllIII("+Iyyr2o6M//XRFBbiDw5EA==", "AmzUl");
        lIIlllllI[lIIllllll[28]] = lIIIlIllIIl("GisEMBQGJx8/Dw4lEiIHBjgS", "IjVqP");
        lIIlllllI[lIIllllll[30]] = lIIIlIllIII("ftt0bdgCkdTfDh93ZE0tjQ==", "pBUyy");
        lIIlllllI[lIIllllll[32]] = lIIIlIllIIl("Jy4/Dj07IiQBJjYjKBwqMSsyHC47PSk=", "tomOy");
        lIIlllllI[lIIllllll[35]] = lIIIlIllIII("e/rbgDwxrtYfbfwlFfF9pg==", "CFsZC");
        lIIlllllI[lIIllllll[37]] = lIIIlIllIlI("+wr4MpvKS8a1IvHVfvpnyQ==", "EJrJt");
        lIIlllllI[lIIllllll[39]] = lIIIlIllIlI("sbHpy+/l8lqDbVwO/we+RA==", "wFlfU");
        lIIlllllI[lIIllllll[41]] = lIIIlIllIII("3CGpfBBqpk3FmyW79laM2g==", "pOcRA");
    }

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
    /* JADX WARN: Type inference failed for: r6v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    static {
        lIIIlIlllII();
        lIIIlIllIll();
        DRAGON_BATTLEAXE = new G(lIIlllllI[lIIllllll[0]], lIIllllll[0], lIIllllll[1], lIIllllll[2], lIIllllll[0]);
        DRAGON_CLAWS = new G(lIIlllllI[lIIllllll[3]], lIIllllll[3], lIIllllll[4], lIIllllll[5], lIIllllll[3]);
        DRAGON_DAGGER = new G(lIIlllllI[lIIllllll[6]], lIIllllll[6], lIIllllll[7], lIIllllll[8], lIIllllll[0]);
        DRAGON_DAGGER_P = new G(lIIlllllI[lIIllllll[9]], lIIllllll[9], lIIllllll[10], lIIllllll[8], lIIllllll[0]);
        DRAGON_DAGGER_PP = new G(lIIlllllI[lIIllllll[11]], lIIllllll[11], lIIllllll[12], lIIllllll[8], lIIllllll[0]);
        DRAGON_DAGGER_PPP = new G(lIIlllllI[lIIllllll[13]], lIIllllll[13], lIIllllll[14], lIIllllll[8], lIIllllll[0]);
        DRAGON_HALBERD = new G(lIIlllllI[lIIllllll[15]], lIIllllll[15], lIIllllll[16], lIIllllll[17], lIIllllll[3]);
        DRAGON_LONGSWORD = new G(lIIlllllI[lIIllllll[18]], lIIllllll[18], lIIllllll[19], lIIllllll[8], lIIllllll[0]);
        DRAGON_MACE = new G(lIIlllllI[lIIllllll[20]], lIIllllll[20], lIIllllll[21], lIIllllll[8], lIIllllll[0]);
        DRAGON_WARHAMMER = new G(lIIlllllI[lIIllllll[22]], lIIllllll[22], lIIllllll[23], lIIllllll[5], lIIllllll[0]);
        ARMADYL_GODSWORD = new G(lIIlllllI[lIIllllll[24]], lIIllllll[24], lIIllllll[25], lIIllllll[5], lIIllllll[3]);
        BANDOS_GODSWORD = new G(lIIlllllI[lIIllllll[26]], lIIllllll[26], lIIllllll[27], lIIllllll[5], lIIllllll[3]);
        SARADOMIN_GODSWORD = new G(lIIlllllI[lIIllllll[28]], lIIllllll[28], lIIllllll[29], lIIllllll[5], lIIllllll[3]);
        SARADOMIN_SWORD = new G(lIIlllllI[lIIllllll[30]], lIIllllll[30], lIIllllll[31], lIIllllll[2], lIIllllll[3]);
        SARADOMIN_BLESSED_SWORD = new G(lIIlllllI[lIIllllll[32]], lIIllllll[32], lIIllllll[33], lIIllllll[34], lIIllllll[3]);
        VOIDWAKER = new G(lIIlllllI[lIIllllll[35]], lIIllllll[35], lIIllllll[36], lIIllllll[5], lIIllllll[0]);
        TOXIC_BLOWPIPE = new G(lIIlllllI[lIIllllll[37]], lIIllllll[37], lIIllllll[38], lIIllllll[5], lIIllllll[3]);
        OSMUMTENS_FANG = new G(lIIlllllI[lIIllllll[39]], lIIllllll[39], lIIllllll[40], lIIllllll[8], lIIllllll[3]);
        CRYSTAL_HALBERD = new G(lIIlllllI[lIIllllll[41]], lIIllllll[41], lIIllllll[42], lIIllllll[17], lIIllllll[3]);
        G[] gArr = new G[lIIllllll[43]];
        gArr[lIIllllll[0]] = DRAGON_BATTLEAXE;
        gArr[lIIllllll[3]] = DRAGON_CLAWS;
        gArr[lIIllllll[6]] = DRAGON_DAGGER;
        gArr[lIIllllll[9]] = DRAGON_DAGGER_P;
        gArr[lIIllllll[11]] = DRAGON_DAGGER_PP;
        gArr[lIIllllll[13]] = DRAGON_DAGGER_PPP;
        gArr[lIIllllll[15]] = DRAGON_HALBERD;
        gArr[lIIllllll[18]] = DRAGON_LONGSWORD;
        gArr[lIIllllll[20]] = DRAGON_MACE;
        gArr[lIIllllll[22]] = DRAGON_WARHAMMER;
        gArr[lIIllllll[24]] = ARMADYL_GODSWORD;
        gArr[lIIllllll[26]] = BANDOS_GODSWORD;
        gArr[lIIllllll[28]] = SARADOMIN_GODSWORD;
        gArr[lIIllllll[30]] = SARADOMIN_SWORD;
        gArr[lIIllllll[32]] = SARADOMIN_BLESSED_SWORD;
        gArr[lIIllllll[35]] = VOIDWAKER;
        gArr[lIIllllll[37]] = TOXIC_BLOWPIPE;
        gArr[lIIllllll[39]] = OSMUMTENS_FANG;
        gArr[lIIllllll[41]] = CRYSTAL_HALBERD;
        $VALUES = gArr;
    }

    public int ar() {
        return this.itemID;
    }

    private static String lIIIlIllIlI(String llIIIlIIIIlIlII, String llIIIlIIIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllllll[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIlIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlIIIIlIlIl) {
            llIIIlIIIIlIlIl.printStackTrace();
            return null;
        }
    }

    public static G[] values() {
        return (G[]) $VALUES.clone();
    }

    private static String lIIIlIllIIl(String llIIIlIIIlIlIIl, String llIIIlIIIlIlIII) {
        String llIIIlIIIlIlIIl2 = new String(Base64.getDecoder().decode(llIIIlIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIIlIIIlIlIII.toCharArray();
        int llIIIlIIIlIIlIl = lIIllllll[0];
        char[] charArray2 = llIIIlIIIlIlIIl2.toCharArray();
        int llIIIlIIIIllllI = charArray2.length;
        int i2 = lIIllllll[0];
        while (lIIIlIlllIl(i2, llIIIlIIIIllllI)) {
            char llIIIlIIIlIlIlI = charArray2[i2];
            sb.append((char) (llIIIlIIIlIlIlI ^ charArray[llIIIlIIIlIIlIl % charArray.length]));
            "".length();
            llIIIlIIIlIIlIl++;
            i2++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public int as() {
        return this.specAmount;
    }

    private static void lIIIlIlllII() {
        lIIllllll = new int[44];
        lIIllllll[0] = ((72 ^ 28) ^ (96 ^ 24)) & (((216 ^ 158) ^ (245 ^ 159)) ^ (-" ".length()));
        lIIllllll[1] = (-23061) & 24437;
        lIIllllll[2] = 31 ^ 123;
        lIIllllll[3] = " ".length();
        lIIllllll[4] = (-((-13857) & 32297)) & (-34) & 32125;
        lIIllllll[5] = (((44 + 145) - 103) + 85) ^ (((21 + 32) - (-88)) + 12);
        lIIllllll[6] = "  ".length();
        lIIllllll[7] = (-26945) & 28159;
        lIIllllll[8] = (((168 + 88) - 92) + 24) ^ (((152 + 60) - 127) + 80);
        lIIllllll[9] = "   ".length();
        lIIllllll[10] = (-2593) & 3823;
        lIIllllll[11] = 79 ^ 75;
        lIIllllll[12] = (-2186) & 7865;
        lIIllllll[13] = 126 ^ 123;
        lIIllllll[14] = (-((-17474) & 27863)) & (-33) & 16119;
        lIIllllll[15] = (((118 + 60) - 48) + 25) ^ (((84 + 35) - 81) + 119);
        lIIllllll[16] = (-((-22) & 29503)) & (-67) & 32751;
        lIIllllll[17] = 177 ^ 175;
        lIIllllll[18] = (240 ^ 145) ^ (43 ^ 77);
        lIIllllll[19] = (-4099) & 5403;
        lIIllllll[20] = (217 ^ 149) ^ (57 ^ 125);
        lIIllllll[21] = (-8294) & 9727;
        lIIllllll[22] = (((17 + 57) - (-30)) + 79) ^ (((88 + 158) - 218) + 162);
        lIIllllll[23] = (-18648) & 32223;
        lIIllllll[24] = 0 ^ 10;
        lIIllllll[25] = (-((-8281) & 25086)) & (-65) & 28671;
        lIIllllll[26] = 98 ^ 105;
        lIIllllll[27] = (-4483) & 16286;
        lIIllllll[28] = (222 ^ 164) ^ (76 ^ 58);
        lIIllllll[29] = (-((-9279) & 30207)) & (-2) & 32735;
        lIIllllll[30] = 61 ^ 48;
        lIIllllll[31] = (-20481) & 32318;
        lIIllllll[32] = 124 ^ 114;
        lIIllllll[33] = (-((-21383) & 22487)) & (-163) & 14075;
        lIIllllll[34] = 117 ^ 52;
        lIIllllll[35] = (202 ^ 176) ^ (202 ^ 191);
        lIIllllll[36] = (-918) & 28607;
        lIIllllll[37] = 74 ^ 90;
        lIIllllll[38] = (-((-8358) & 11687)) & (-16385) & 32639;
        lIIllllll[39] = 159 ^ 142;
        lIIllllll[40] = (-((-20855) & 23031)) & (-273) & 28667;
        lIIllllll[41] = (((85 + 98) - 90) + 75) ^ (((123 + 154) - 229) + 138);
        lIIllllll[42] = (-8709) & 32695;
        lIIllllll[43] = 2 ^ 17;
    }

    public boolean at() {
        return this.twoHanded;
    }
}
