package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bG  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bG.class */
public final class bG {
    private final /* synthetic */ boolean twoHanded;
    public static final /* synthetic */ bG DRAGON_WARHAMMER;
    public static final /* synthetic */ bG SARADOMIN_BLESSED_SWORD;
    private static /* synthetic */ int[] llllIlII;
    private static /* synthetic */ String[] llllIIll;
    public static final /* synthetic */ bG DRAGON_LONGSWORD;
    private static final /* synthetic */ bG[] $VALUES;
    public static final /* synthetic */ bG BANDOS_GODSWORD;
    public static final /* synthetic */ bG ARMADYL_GODSWORD;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ bG SARADOMIN_GODSWORD;
    public static final /* synthetic */ bG DRAGON_DAGGER_PP;
    public static final /* synthetic */ bG DRAGON_DAGGER;
    public static final /* synthetic */ bG CRYSTAL_HALBERD;
    public static final /* synthetic */ bG DRAGON_HALBERD;
    public static final /* synthetic */ bG SARADOMIN_SWORD;
    public static final /* synthetic */ bG DRAGON_DAGGER_P;
    public static final /* synthetic */ bG DRAGON_BATTLEAXE;
    public static final /* synthetic */ bG DRAGON_DAGGER_PPP;
    public static final /* synthetic */ bG DRAGON_CLAWS;
    private final /* synthetic */ int specAmount;
    public static final /* synthetic */ bG DRAGON_MACE;

    public static bG[] values() {
        return (bG[]) $VALUES.clone();
    }

    private static void llIlIIllll() {
        llllIIll = new String[llllIlII[37]];
        llllIIll[llllIlII[0]] = llIlIIllII("AgYIETcICwsXLBIYDBcgAw==", "FTIVx");
        llllIIll[llllIlII[3]] = llIlIIllIl("5FZiTKh2Ol6rlsU97PdrjA==", "SeliE");
        llllIIll[llllIlII[6]] = llIlIIllIl("A69stZRdMnbAl91MfA/ubQ==", "pdGET");
        llllIIll[llllIlII[9]] = llIlIIlllI("Y6ZBGDBO2ybXi62RdkGwjg==", "FiKsS");
        llllIIll[llllIlII[11]] = llIlIIllII("KhQlBRggGSADECkDNh0HPg==", "nFdBW");
        llllIIll[llllIlII[13]] = llIlIIllIl("DKOEJ2Wv2BfQZ98xE12c4pCpAJBtbGGR", "nECPi");
        llllIIll[llllIlII[15]] = llIlIIllII("KxcbKCUhGhIuJi0ACCs=", "oEZoj");
        llllIIll[llllIlII[18]] = llIlIIllII("Ayc0EjgJKjkaOQAmIholAw==", "GuuUw");
        llllIIll[llllIlII[20]] = llIlIIllII("Nj4DFik8Mw8QJTc=", "rlBQf");
        llllIIll[llllIlII[22]] = llIlIIllII("NRkmAQo/FDAHFzkKKgsAIw==", "qKgFE");
        llllIIll[llllIlII[24]] = llIlIIlllI("nh9pm2AHdgb9ACti13WRpK9hVyHQDx4P", "uUILi");
        llllIIll[llllIlII[26]] = llIlIIllIl("Eld5UyKureMpamTw/63qEg==", "Emgvc");
        llllIIll[llllIlII[28]] = llIlIIllII("EQggAwANBDsMGwUGNhETDRs2", "BIrBD");
        llllIIll[llllIlII[30]] = llIlIIllIl("OKMHDtrnbwuRMtBh0iulEQ==", "jheeT");
        llllIIll[llllIlII[32]] = llIlIIlllI("7hpa7PDnQeu73ZnaoI/xKsIXnHw6dche", "CfveM");
        llllIIll[llllIlII[35]] = llIlIIllIl("4u80eme1enRrXl8lFlWpPA==", "ebVpn");
    }

    private static void llIlIlIIIl() {
        llllIlII = new int[38];
        llllIlII[0] = (61 ^ 35) & ((104 ^ 118) ^ (-1));
        llllIlII[1] = (-18961) & 20337;
        llllIlII[2] = 248 ^ 156;
        llllIlII[3] = " ".length();
        llllIlII[4] = (-((-12685) & 31117)) & (-676) & 32759;
        llllIlII[5] = 189 ^ 143;
        llllIlII[6] = "  ".length();
        llllIlII[7] = (-12545) & 13759;
        llllIlII[8] = (209 ^ 143) ^ (118 ^ 49);
        llllIlII[9] = "   ".length();
        llllIlII[10] = (-((-13837) & 32573)) & (-4097) & 24063;
        llllIlII[11] = (8 ^ 120) ^ (239 ^ 155);
        llllIlII[12] = (-198) & 5877;
        llllIlII[13] = (234 ^ 188) ^ (25 ^ 74);
        llllIlII[14] = (-8602) & 14299;
        llllIlII[15] = (((24 + 86) - 60) + 139) ^ (((100 + 114) - 38) + 11);
        llllIlII[16] = (-4444) & 7647;
        llllIlII[17] = 164 ^ 186;
        llllIlII[18] = 7 ^ 0;
        llllIlII[19] = (-((-1091) & 29891)) & (-2147) & 32251;
        llllIlII[20] = (((112 + 52) - 137) + 134) ^ (((16 + 119) - (-32)) + 2);
        llllIlII[21] = (-14914) & 16347;
        llllIlII[22] = (((33 + 72) - 49) + 130) ^ (((46 + 133) - 39) + 39);
        llllIlII[23] = (-16465) & 30040;
        llllIlII[24] = 182 ^ 188;
        llllIlII[25] = (-(((109 + 66) - 14) + 1)) & (-4353) & 16315;
        llllIlII[26] = 65 ^ 74;
        llllIlII[27] = (-20834) & 32637;
        llllIlII[28] = 177 ^ 189;
        llllIlII[29] = (-((-4262) & 20967)) & (-129) & 28639;
        llllIlII[30] = 41 ^ 36;
        llllIlII[31] = (-"  ".length()) & (-4225) & 16063;
        llllIlII[32] = (36 ^ 42) ^ ((156 ^ 187) & ((44 ^ 11) ^ (-1)));
        llllIlII[33] = (-3475) & 16283;
        llllIlII[34] = (((103 + 76) - 82) + 125) ^ (((51 + 111) - 65) + 62);
        llllIlII[35] = 77 ^ 66;
        llllIlII[36] = (-8709) & 32695;
        llllIlII[37] = 160 ^ 176;
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
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    static {
        llIlIlIIIl();
        llIlIIllll();
        DRAGON_BATTLEAXE = new bG(llllIIll[llllIlII[0]], llllIlII[0], llllIlII[1], llllIlII[2], llllIlII[0]);
        DRAGON_CLAWS = new bG(llllIIll[llllIlII[3]], llllIlII[3], llllIlII[4], llllIlII[5], llllIlII[3]);
        DRAGON_DAGGER = new bG(llllIIll[llllIlII[6]], llllIlII[6], llllIlII[7], llllIlII[8], llllIlII[0]);
        DRAGON_DAGGER_P = new bG(llllIIll[llllIlII[9]], llllIlII[9], llllIlII[10], llllIlII[8], llllIlII[0]);
        DRAGON_DAGGER_PP = new bG(llllIIll[llllIlII[11]], llllIlII[11], llllIlII[12], llllIlII[8], llllIlII[0]);
        DRAGON_DAGGER_PPP = new bG(llllIIll[llllIlII[13]], llllIlII[13], llllIlII[14], llllIlII[8], llllIlII[0]);
        DRAGON_HALBERD = new bG(llllIIll[llllIlII[15]], llllIlII[15], llllIlII[16], llllIlII[17], llllIlII[3]);
        DRAGON_LONGSWORD = new bG(llllIIll[llllIlII[18]], llllIlII[18], llllIlII[19], llllIlII[8], llllIlII[0]);
        DRAGON_MACE = new bG(llllIIll[llllIlII[20]], llllIlII[20], llllIlII[21], llllIlII[8], llllIlII[0]);
        DRAGON_WARHAMMER = new bG(llllIIll[llllIlII[22]], llllIlII[22], llllIlII[23], llllIlII[5], llllIlII[0]);
        ARMADYL_GODSWORD = new bG(llllIIll[llllIlII[24]], llllIlII[24], llllIlII[25], llllIlII[5], llllIlII[3]);
        BANDOS_GODSWORD = new bG(llllIIll[llllIlII[26]], llllIlII[26], llllIlII[27], llllIlII[5], llllIlII[3]);
        SARADOMIN_GODSWORD = new bG(llllIIll[llllIlII[28]], llllIlII[28], llllIlII[29], llllIlII[5], llllIlII[3]);
        SARADOMIN_SWORD = new bG(llllIIll[llllIlII[30]], llllIlII[30], llllIlII[31], llllIlII[2], llllIlII[3]);
        SARADOMIN_BLESSED_SWORD = new bG(llllIIll[llllIlII[32]], llllIlII[32], llllIlII[33], llllIlII[34], llllIlII[3]);
        CRYSTAL_HALBERD = new bG(llllIIll[llllIlII[35]], llllIlII[35], llllIlII[36], llllIlII[17], llllIlII[3]);
        bG[] bGVarArr = new bG[llllIlII[37]];
        bGVarArr[llllIlII[0]] = DRAGON_BATTLEAXE;
        bGVarArr[llllIlII[3]] = DRAGON_CLAWS;
        bGVarArr[llllIlII[6]] = DRAGON_DAGGER;
        bGVarArr[llllIlII[9]] = DRAGON_DAGGER_P;
        bGVarArr[llllIlII[11]] = DRAGON_DAGGER_PP;
        bGVarArr[llllIlII[13]] = DRAGON_DAGGER_PPP;
        bGVarArr[llllIlII[15]] = DRAGON_HALBERD;
        bGVarArr[llllIlII[18]] = DRAGON_LONGSWORD;
        bGVarArr[llllIlII[20]] = DRAGON_MACE;
        bGVarArr[llllIlII[22]] = DRAGON_WARHAMMER;
        bGVarArr[llllIlII[24]] = ARMADYL_GODSWORD;
        bGVarArr[llllIlII[26]] = BANDOS_GODSWORD;
        bGVarArr[llllIlII[28]] = SARADOMIN_GODSWORD;
        bGVarArr[llllIlII[30]] = SARADOMIN_SWORD;
        bGVarArr[llllIlII[32]] = SARADOMIN_BLESSED_SWORD;
        bGVarArr[llllIlII[35]] = CRYSTAL_HALBERD;
        $VALUES = bGVarArr;
    }

    private bG(String str, int i2, int i3, int i4, boolean z) {
        this.itemID = i3;
        this.specAmount = i4;
        this.twoHanded = z;
    }

    private static String llIlIIllIl(String llIlIIIllllIlII, String llIlIIIllllIIll) {
        try {
            SecretKeySpec llIlIIIllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIIllllIIll.getBytes(StandardCharsets.UTF_8)), llllIlII[20]), "DES");
            Cipher llIlIIIllllIllI = Cipher.getInstance("DES");
            llIlIIIllllIllI.init(llllIlII[6], llIlIIIllllIlll);
            return new String(llIlIIIllllIllI.doFinal(Base64.getDecoder().decode(llIlIIIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIIllllIlIl) {
            llIlIIIllllIlIl.printStackTrace();
            return null;
        }
    }

    public boolean at() {
        return this.twoHanded;
    }

    private static String llIlIIlllI(String llIlIIlIIIIIIIl, String llIlIIlIIIIIIII) {
        try {
            SecretKeySpec llIlIIlIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIlIIIIIIll = Cipher.getInstance("Blowfish");
            llIlIIlIIIIIIll.init(llllIlII[6], llIlIIlIIIIIlII);
            return new String(llIlIIlIIIIIIll.doFinal(Base64.getDecoder().decode(llIlIIlIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIlIIIIIIlI) {
            llIlIIlIIIIIIlI.printStackTrace();
            return null;
        }
    }

    public static bG valueOf(String str) {
        return (bG) Enum.valueOf(bG.class, str);
    }

    private static boolean llIlIlIIlI(int i2, int i3) {
        return i2 < i3;
    }

    public int as() {
        return this.specAmount;
    }

    private static String llIlIIllII(String llIlIIIlllIIlII, String llIlIIIlllIIIll) {
        String str = new String(Base64.getDecoder().decode(llIlIIIlllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIlIIIlllIIIll.toCharArray();
        int llIlIIIlllIIIII = llllIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llllIlII[0];
        while (llIlIlIIlI(i2, length)) {
            sb.append((char) (charArray2[i2] ^ charArray[llIlIIIlllIIIII % charArray.length]));
            "".length();
            llIlIIIlllIIIII++;
            i2++;
            "".length();
            if ((((((2 + 90) - 50) + 118) ^ (((149 + 63) - 172) + 153)) & (((33 ^ 113) ^ (102 ^ 87)) ^ (-" ".length()))) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public int ar() {
        return this.itemID;
    }
}
