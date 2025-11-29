package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/e.class */
public class C0004e {
    public static /* synthetic */ int O;
    public static /* synthetic */ int K;
    public static /* synthetic */ List<String> T;
    public static /* synthetic */ int M;
    private static /* synthetic */ String[] lIlllIIIIIIl;
    public static /* synthetic */ int L;
    public static /* synthetic */ int P;
    public static /* synthetic */ int J;
    public static /* synthetic */ int R;
    public static /* synthetic */ int Q;
    public static /* synthetic */ int I;
    public static /* synthetic */ List<String> U;
    public static /* synthetic */ List<String> S;
    private static /* synthetic */ int[] lIlllIIIIlII;
    public static /* synthetic */ int N;

    public static WorldArea l(TileObject tileObject) {
        return new WorldArea(k(tileObject), lIlllIIIIlII[3], lIlllIIIIlII[4]);
    }

    public static WorldPoint o(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[7]).dy(lIlllIIIIlII[1]);
    }

    public static WorldPoint h(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[8]);
    }

    static {
        lllIlIlIlIlllI();
        lllIlIlIlIIIll();
        I = lIlllIIIIlII[12];
        J = lIlllIIIIlII[13];
        K = lIlllIIIIlII[14];
        L = lIlllIIIIlII[15];
        M = lIlllIIIIlII[16];
        N = lIlllIIIIlII[17];
        O = lIlllIIIIlII[18];
        P = lIlllIIIIlII[19];
        Q = lIlllIIIIlII[20];
        R = lIlllIIIIlII[21];
        String[] strArr = new String[lIlllIIIIlII[22]];
        strArr[lIlllIIIIlII[10]] = lIlllIIIIIIl[lIlllIIIIlII[10]];
        strArr[lIlllIIIIlII[4]] = lIlllIIIIIIl[lIlllIIIIlII[4]];
        strArr[lIlllIIIIlII[11]] = lIlllIIIIIIl[lIlllIIIIlII[11]];
        strArr[lIlllIIIIlII[6]] = lIlllIIIIIIl[lIlllIIIIlII[6]];
        strArr[lIlllIIIIlII[7]] = lIlllIIIIIIl[lIlllIIIIlII[7]];
        strArr[lIlllIIIIlII[0]] = lIlllIIIIIIl[lIlllIIIIlII[0]];
        strArr[lIlllIIIIlII[23]] = lIlllIIIIIIl[lIlllIIIIlII[23]];
        strArr[lIlllIIIIlII[24]] = lIlllIIIIIIl[lIlllIIIIlII[24]];
        strArr[lIlllIIIIlII[9]] = lIlllIIIIIIl[lIlllIIIIlII[9]];
        strArr[lIlllIIIIlII[25]] = lIlllIIIIIIl[lIlllIIIIlII[25]];
        strArr[lIlllIIIIlII[26]] = lIlllIIIIIIl[lIlllIIIIlII[26]];
        strArr[lIlllIIIIlII[3]] = lIlllIIIIIIl[lIlllIIIIlII[3]];
        strArr[lIlllIIIIlII[27]] = lIlllIIIIIIl[lIlllIIIIlII[27]];
        strArr[lIlllIIIIlII[28]] = lIlllIIIIIIl[lIlllIIIIlII[28]];
        strArr[lIlllIIIIlII[29]] = lIlllIIIIIIl[lIlllIIIIlII[29]];
        strArr[lIlllIIIIlII[30]] = lIlllIIIIIIl[lIlllIIIIlII[30]];
        strArr[lIlllIIIIlII[31]] = lIlllIIIIIIl[lIlllIIIIlII[31]];
        strArr[lIlllIIIIlII[32]] = lIlllIIIIIIl[lIlllIIIIlII[32]];
        strArr[lIlllIIIIlII[1]] = lIlllIIIIIIl[lIlllIIIIlII[1]];
        strArr[lIlllIIIIlII[33]] = lIlllIIIIIIl[lIlllIIIIlII[33]];
        strArr[lIlllIIIIlII[34]] = lIlllIIIIIIl[lIlllIIIIlII[34]];
        strArr[lIlllIIIIlII[35]] = lIlllIIIIIIl[lIlllIIIIlII[35]];
        strArr[lIlllIIIIlII[36]] = lIlllIIIIIIl[lIlllIIIIlII[36]];
        strArr[lIlllIIIIlII[37]] = lIlllIIIIIIl[lIlllIIIIlII[37]];
        strArr[lIlllIIIIlII[38]] = lIlllIIIIIIl[lIlllIIIIlII[38]];
        strArr[lIlllIIIIlII[39]] = lIlllIIIIIIl[lIlllIIIIlII[39]];
        strArr[lIlllIIIIlII[40]] = lIlllIIIIIIl[lIlllIIIIlII[40]];
        strArr[lIlllIIIIlII[41]] = lIlllIIIIIIl[lIlllIIIIlII[41]];
        strArr[lIlllIIIIlII[42]] = lIlllIIIIIIl[lIlllIIIIlII[42]];
        strArr[lIlllIIIIlII[43]] = lIlllIIIIIIl[lIlllIIIIlII[43]];
        strArr[lIlllIIIIlII[44]] = lIlllIIIIIIl[lIlllIIIIlII[44]];
        strArr[lIlllIIIIlII[45]] = lIlllIIIIIIl[lIlllIIIIlII[45]];
        S = List.of((Object[]) strArr);
        T = List.of(lIlllIIIIIIl[lIlllIIIIlII[22]], lIlllIIIIIIl[lIlllIIIIlII[46]]);
        U = List.of(lIlllIIIIIIl[lIlllIIIIlII[47]], lIlllIIIIIIl[lIlllIIIIlII[48]], lIlllIIIIIIl[lIlllIIIIlII[49]], lIlllIIIIIIl[lIlllIIIIlII[50]], lIlllIIIIIIl[lIlllIIIIlII[51]], lIlllIIIIIIl[lIlllIIIIlII[52]]);
    }

    public static WorldPoint m(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[5]).dy(lIlllIIIIlII[1]);
    }

    private static boolean lllIlIlIllIIII(int i, int i2) {
        return i < i2;
    }

    public static WorldPoint n(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[6]).dy(lIlllIIIIlII[1]);
    }

    private static String lllIlIlIlIIIlI(String lllllllllllllllIlIlllIIIlIlllIlI, String lllllllllllllllIlIlllIIIlIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIIlIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIlIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIIIlII[11], lllllllllllllllIlIlllIIIlIllllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIlIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIIlIlllIll) {
            lllllllllllllllIlIlllIIIlIlllIll.printStackTrace();
            return null;
        }
    }

    private static void lllIlIlIlIIIll() {
        lIlllIIIIIIl = new String[lIlllIIIIlII[53]];
        lIlllIIIIIIl[lIlllIIIIlII[10]] = lllIlIlIlIIIII("DyodNwAlNwJ4BCIlACw=", "LBoXm");
        lIlllIIIIIIl[lIlllIIIIlII[4]] = lllIlIlIlIIIIl("rSRqu2B5NxybKuhSO5HAlg==", "ojJUN");
        lIlllIIIIIIl[lIlllIIIIlII[11]] = lllIlIlIlIIIlI("OKlCOQsPELp4Q8460grxeQ==", "OBUFE");
        lIlllIIIIIIl[lIlllIIIIlII[6]] = lllIlIlIlIIIII("HB4AFSU5Vx8AIyE=", "JwraP");
        lIlllIIIIIIl[lIlllIIIIlII[7]] = lllIlIlIlIIIlI("WMS87qI7/ofFQh0J5iu1Yw==", "PQpLd");
        lIlllIIIIIIl[lIlllIIIIlII[0]] = lllIlIlIlIIIlI("o4TfsA6h+tOLrrorpdzTNV6mRaXMI+8x", "EVwUJ");
        lIlllIIIIIIl[lIlllIIIIlII[23]] = lllIlIlIlIIIIl("cUpEUt4jBcN2RfCuETH1nA==", "daEOG");
        lIlllIIIIIIl[lIlllIIIIlII[24]] = lllIlIlIlIIIII("Gj4nAjg+O3MJIjY+PQglMy4=", "WWSjJ");
        lIlllIIIIIIl[lIlllIIIIlII[9]] = lllIlIlIlIIIIl("Kx+cTfhadQIa/KvvjU3ZPs6HIiUa5Z00", "GfVmm");
        lIlllIIIIIIl[lIlllIIIIlII[25]] = lllIlIlIlIIIII("MRAkKi0bQjUhIwEHKSglBg==", "ubEMB");
        lIlllIIIIIIl[lIlllIIIIlII[26]] = lllIlIlIlIIIIl("hMK4tLCTcZk=", "qsQFT");
        lIlllIIIIIIl[lIlllIIIIlII[3]] = lllIlIlIlIIIlI("JcHYllyqawNcUEiTFVTbjA==", "ZDxLG");
        lIlllIIIIIIl[lIlllIIIIlII[27]] = lllIlIlIlIIIII("Axs7J087DyMnAzgAdSoKMAom", "QnUBo");
        lIlllIIIIIIl[lIlllIIIIlII[28]] = lllIlIlIlIIIIl("7znGTai4TQBfkUlUCTGw0b+LeaPkb8ei", "ihKWm");
        lIlllIIIIIIl[lIlllIIIIlII[29]] = lllIlIlIlIIIII("GDoXPxttJgEoFg==", "MTtJo");
        lIlllIIIIIIl[lIlllIIIIlII[30]] = lllIlIlIlIIIII("DQ8KHBt4BQAIAjcPDQ==", "Xaiio");
        lIlllIIIIIIl[lIlllIIIIlII[31]] = lllIlIlIlIIIlI("0jldhaaQmo41Fsn8noHVcA==", "OkdOk");
        lIlllIIIIIIl[lIlllIIIIlII[32]] = lllIlIlIlIIIIl("VYQoL/FwdAuwSnmUs0ix5edLr5RUaqex", "sJbxM");
        lIlllIIIIIIl[lIlllIIIIlII[1]] = lllIlIlIlIIIlI("up7B/Klbi8nimYEW5SqzpQ==", "PypqP");
        lIlllIIIIIIl[lIlllIIIIlII[33]] = lllIlIlIlIIIIl("oCtTPWIuBAccLQin9lES9w==", "gxxqC");
        lIlllIIIIIIl[lIlllIIIIlII[34]] = lllIlIlIlIIIlI("LX8M/y/OcWff4u6sEnK3xw==", "eyIlm");
        lIlllIIIIIIl[lIlllIIIIlII[35]] = lllIlIlIlIIIlI("B6JojEAdpklXeWDaz7MKkg==", "ypMQk");
        lIlllIIIIIIl[lIlllIIIIlII[36]] = lllIlIlIlIIIIl("FI6dULhxveU=", "MQnfc");
        lIlllIIIIIIl[lIlllIIIIlII[37]] = lllIlIlIlIIIII("FBwIMQ==", "FijHU");
        lIlllIIIIIIl[lIlllIIIIlII[38]] = lllIlIlIlIIIlI("RgvxwFqbXrzonHZhpbSHsg==", "ypKJt");
        lIlllIIIIIIl[lIlllIIIIlII[39]] = lllIlIlIlIIIlI("DadSExQrexWX2PGv/SeW/Q==", "MYwHa");
        lIlllIIIIIIl[lIlllIIIIlII[40]] = lllIlIlIlIIIIl("IAqvY3Rygp6qUKmFyhxwqQ==", "YxgcR");
        lIlllIIIIIIl[lIlllIIIIlII[41]] = lllIlIlIlIIIlI("XOj6KRTBSACegyFLUwGWpQ==", "JgXwA");
        lIlllIIIIIIl[lIlllIIIIlII[42]] = lllIlIlIlIIIII("OT4wJmsYJCsv", "jQEJK");
        lIlllIIIIIIl[lIlllIIIIlII[43]] = lllIlIlIlIIIII("Lw8CdSgbCBU=", "nfpUZ");
        lIlllIIIIIIl[lIlllIIIIlII[44]] = lllIlIlIlIIIlI("yrPcyO9y4jpHNm2A1jGNIA==", "xEKjC");
        lIlllIIIIIIl[lIlllIIIIlII[45]] = lllIlIlIlIIIII("BBUFHwYsRx4EAS4CHg==", "Bgjec");
        lIlllIIIIIIl[lIlllIIIIlII[22]] = lllIlIlIlIIIlI("t0T4wsTPVYUx4siy3xMAJscU8QBhgxWa", "QiwfO");
        lIlllIIIIIIl[lIlllIIIIlII[46]] = lllIlIlIlIIIlI("o/UJcom83jdrG6/YyHV03YQUNu2Aucqq", "LVLnc");
        lIlllIIIIIIl[lIlllIIIIlII[47]] = lllIlIlIlIIIIl("MwMxFKU0R04K7VBKMZhOqA==", "SdZrc");
        lIlllIIIIIIl[lIlllIIIIlII[48]] = lllIlIlIlIIIII("HwM2MQxyGzAhHzoZKj8=", "RvERm");
        lIlllIIIIIIl[lIlllIIIIlII[49]] = lllIlIlIlIIIlI("gv5I0AYVWK+kuE8XO1480w==", "YysMJ");
        lIlllIIIIIIl[lIlllIIIIlII[50]] = lllIlIlIlIIIIl("OcqkdVaOI0qFaEzRA/JLYA==", "jbjgO");
        lIlllIIIIIIl[lIlllIIIIlII[51]] = lllIlIlIlIIIIl("AL6DDrz1AcmNzcnZGSqicQ==", "gdacW");
        lIlllIIIIIIl[lIlllIIIIlII[52]] = lllIlIlIlIIIlI("SeqJ09LXN5SZlyTNYM7dBhU+9JKxAcUP", "LJvSa");
    }

    public static WorldPoint p(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[6]).dy(lIlllIIIIlII[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public static boolean r(TileObject tileObject) {
        Player local = Players.getLocal();
        if (!lllIlIlIlIllll(local) && lllIlIlIllIIIl(local.getWorldX() - lIlllIIIIlII[11], tileObject.getWorldX())) {
            ?? r0 = lIlllIIIIlII[4];
            "".length();
            return ((72 ^ 16) & ((206 ^ 150) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllIIIIlII[10];
    }

    private static void lllIlIlIlIlllI() {
        lIlllIIIIlII = new int[54];
        lIlllIIIIlII[0] = 23 ^ 18;
        lIlllIIIIlII[1] = (142 ^ 170) ^ (183 ^ 129);
        lIlllIIIIlII[2] = -(117 ^ 112);
        lIlllIIIIlII[3] = (90 ^ 67) ^ (62 ^ 44);
        lIlllIIIIlII[4] = " ".length();
        lIlllIIIIlII[5] = -(50 ^ 54);
        lIlllIIIIlII[6] = "   ".length();
        lIlllIIIIlII[7] = (203 ^ 130) ^ (229 ^ 168);
        lIlllIIIIlII[8] = -(31 ^ 25);
        lIlllIIIIlII[9] = 100 ^ 108;
        lIlllIIIIlII[10] = (253 ^ 195) & ((30 ^ 32) ^ (-1));
        lIlllIIIIlII[11] = "  ".length();
        lIlllIIIIlII[12] = (-16386) & 28583;
        lIlllIIIIlII[13] = (-((-10631) & 16279)) & (-24581) & 32671;
        lIlllIIIIlII[14] = (-4107) & 14286;
        lIlllIIIIlII[15] = (-((-18017) & 20070)) & (-20515) & 32751;
        lIlllIIIIlII[16] = (-17489) & 19924;
        lIlllIIIIlII[17] = (-(152 ^ 193)) & (-14337) & 15871;
        lIlllIIIIlII[18] = (-5314) & 5851;
        lIlllIIIIlII[19] = (-16457) & 28655;
        lIlllIIIIlII[20] = (-16468) & 28667;
        lIlllIIIIlII[21] = (-((-1677) & 22239)) & (-5) & 32767;
        lIlllIIIIlII[22] = (((70 + 38) - (-20)) + 5) ^ (((148 + 63) - 125) + 79);
        lIlllIIIIlII[23] = 139 ^ 141;
        lIlllIIIIlII[24] = 136 ^ 143;
        lIlllIIIIlII[25] = (77 ^ 86) ^ (155 ^ 137);
        lIlllIIIIlII[26] = (205 ^ 186) ^ (59 ^ 70);
        lIlllIIIIlII[27] = (((23 + 95) - (-7)) + 47) ^ (((74 + 65) - 28) + 49);
        lIlllIIIIlII[28] = 94 ^ 83;
        lIlllIIIIlII[29] = 133 ^ 139;
        lIlllIIIIlII[30] = 147 ^ 156;
        lIlllIIIIlII[31] = 110 ^ 126;
        lIlllIIIIlII[32] = (((142 + 157) - 167) + 76) ^ (((167 + 145) - 289) + 170);
        lIlllIIIIlII[33] = 99 ^ 112;
        lIlllIIIIlII[34] = (((11 + 67) - (-103)) + 0) ^ (((41 + 119) - 44) + 45);
        lIlllIIIIlII[35] = 109 ^ 120;
        lIlllIIIIlII[36] = 16 ^ 6;
        lIlllIIIIlII[37] = (((82 + 21) - 50) + 93) ^ (((88 + 92) - 164) + 117);
        lIlllIIIIlII[38] = (22 ^ 99) ^ (55 ^ 90);
        lIlllIIIIlII[39] = (((2 + 32) - 22) + 119) ^ (((100 + 2) - 50) + 102);
        lIlllIIIIlII[40] = "  ".length() ^ (34 ^ 58);
        lIlllIIIIlII[41] = 48 ^ 43;
        lIlllIIIIlII[42] = 89 ^ 69;
        lIlllIIIIlII[43] = (((59 + 69) - 124) + 142) ^ (((2 + 129) - 19) + 31);
        lIlllIIIIlII[44] = (((99 + 75) - 45) + 49) ^ (((127 + 48) - 103) + 100);
        lIlllIIIIlII[45] = 52 ^ 43;
        lIlllIIIIlII[46] = (((49 + 27) - (-7)) + 67) ^ (((64 + 153) - 124) + 90);
        lIlllIIIIlII[47] = 95 ^ 125;
        lIlllIIIIlII[48] = (174 ^ 198) ^ (204 ^ 135);
        lIlllIIIIlII[49] = 14 ^ 42;
        lIlllIIIIlII[50] = 138 ^ 175;
        lIlllIIIIlII[51] = 176 ^ 150;
        lIlllIIIIlII[52] = (138 ^ 155) ^ (182 ^ 128);
        lIlllIIIIlII[53] = 133 ^ 173;
    }

    private static boolean lllIlIlIllIIIl(int i, int i2) {
        return i > i2;
    }

    public static WorldArea i(TileObject tileObject) {
        return new WorldArea(h(tileObject), lIlllIIIIlII[3], lIlllIIIIlII[9]);
    }

    private static String lllIlIlIlIIIIl(String lllllllllllllllIlIlllIIIlIIlIlIl, String lllllllllllllllIlIlllIIIlIIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIlIIlIlII.getBytes(StandardCharsets.UTF_8)), lIlllIIIIlII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIIIIlII[11], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIIlIIlIllI) {
            lllllllllllllllIlIlllIIIlIIlIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public static boolean q(TileObject tileObject) {
        Player local = Players.getLocal();
        if (!lllIlIlIlIllll(local) && lllIlIlIllIIII(local.getWorldX() + lIlllIIIIlII[11], tileObject.getWorldX())) {
            ?? r0 = lIlllIIIIlII[4];
            "".length();
            return (((((43 + 4) - (-49)) + 54) ^ (((94 + 18) - (-33)) + 20)) & (("  ".length() ^ (42 ^ 27)) ^ (-" ".length()))) != 0 ? ((((117 + 184) - 180) + 117) ^ (((20 + 86) - (-63)) + 2)) & (((((126 + 152) - 191) + 111) ^ (((38 + 33) - 52) + 112)) ^ (-" ".length())) : r0;
        }
        return lIlllIIIIlII[10];
    }

    public static WorldPoint k(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[2]).dy(lIlllIIIIlII[1]);
    }

    private static boolean lllIlIlIlIllll(Object obj) {
        return obj == null;
    }

    private static String lllIlIlIlIIIII(String lllllllllllllllIlIlllIIIlIlIlIlI, String lllllllllllllllIlIlllIIIlIlIlIIl) {
        String lllllllllllllllIlIlllIIIlIlIlIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIIIlIlIlIII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIIIlIlIlIIl.toCharArray();
        int lllllllllllllllIlIlllIIIlIlIIllI = lIlllIIIIlII[10];
        char[] charArray2 = lllllllllllllllIlIlllIIIlIlIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIlllIIIIlII[10];
        while (lllIlIlIllIIII(i, length)) {
            char lllllllllllllllIlIlllIIIlIlIlIll = charArray2[i];
            lllllllllllllllIlIlllIIIlIlIlIII.append((char) (lllllllllllllllIlIlllIIIlIlIlIll ^ charArray[lllllllllllllllIlIlllIIIlIlIIllI % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIIIlIlIIllI++;
            i++;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIIIlIlIlIII);
    }

    public static WorldPoint g(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[0]).dy(lIlllIIIIlII[1]);
    }
}
