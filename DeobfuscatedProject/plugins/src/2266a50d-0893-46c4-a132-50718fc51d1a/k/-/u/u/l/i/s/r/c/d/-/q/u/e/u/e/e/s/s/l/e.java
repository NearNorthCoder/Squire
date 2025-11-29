/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

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

public class e {
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
        return new WorldArea(e.k(tileObject), lIlllIIIIlII[3], lIlllIIIIlII[4]);
    }

    public static WorldPoint o(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[7]).dy(lIlllIIIIlII[1]);
    }

    public static WorldPoint h(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[8]);
    }

    static {
        e.lllIlIlIlIlllI();
        e.lllIlIlIlIIIll();
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
        String[] stringArray = new String[lIlllIIIIlII[22]];
        stringArray[e.lIlllIIIIlII[10]] = lIlllIIIIIIl[lIlllIIIIlII[10]];
        stringArray[e.lIlllIIIIlII[4]] = lIlllIIIIIIl[lIlllIIIIlII[4]];
        stringArray[e.lIlllIIIIlII[11]] = lIlllIIIIIIl[lIlllIIIIlII[11]];
        stringArray[e.lIlllIIIIlII[6]] = lIlllIIIIIIl[lIlllIIIIlII[6]];
        stringArray[e.lIlllIIIIlII[7]] = lIlllIIIIIIl[lIlllIIIIlII[7]];
        stringArray[e.lIlllIIIIlII[0]] = lIlllIIIIIIl[lIlllIIIIlII[0]];
        stringArray[e.lIlllIIIIlII[23]] = lIlllIIIIIIl[lIlllIIIIlII[23]];
        stringArray[e.lIlllIIIIlII[24]] = lIlllIIIIIIl[lIlllIIIIlII[24]];
        stringArray[e.lIlllIIIIlII[9]] = lIlllIIIIIIl[lIlllIIIIlII[9]];
        stringArray[e.lIlllIIIIlII[25]] = lIlllIIIIIIl[lIlllIIIIlII[25]];
        stringArray[e.lIlllIIIIlII[26]] = lIlllIIIIIIl[lIlllIIIIlII[26]];
        stringArray[e.lIlllIIIIlII[3]] = lIlllIIIIIIl[lIlllIIIIlII[3]];
        stringArray[e.lIlllIIIIlII[27]] = lIlllIIIIIIl[lIlllIIIIlII[27]];
        stringArray[e.lIlllIIIIlII[28]] = lIlllIIIIIIl[lIlllIIIIlII[28]];
        stringArray[e.lIlllIIIIlII[29]] = lIlllIIIIIIl[lIlllIIIIlII[29]];
        stringArray[e.lIlllIIIIlII[30]] = lIlllIIIIIIl[lIlllIIIIlII[30]];
        stringArray[e.lIlllIIIIlII[31]] = lIlllIIIIIIl[lIlllIIIIlII[31]];
        stringArray[e.lIlllIIIIlII[32]] = lIlllIIIIIIl[lIlllIIIIlII[32]];
        stringArray[e.lIlllIIIIlII[1]] = lIlllIIIIIIl[lIlllIIIIlII[1]];
        stringArray[e.lIlllIIIIlII[33]] = lIlllIIIIIIl[lIlllIIIIlII[33]];
        stringArray[e.lIlllIIIIlII[34]] = lIlllIIIIIIl[lIlllIIIIlII[34]];
        stringArray[e.lIlllIIIIlII[35]] = lIlllIIIIIIl[lIlllIIIIlII[35]];
        stringArray[e.lIlllIIIIlII[36]] = lIlllIIIIIIl[lIlllIIIIlII[36]];
        stringArray[e.lIlllIIIIlII[37]] = lIlllIIIIIIl[lIlllIIIIlII[37]];
        stringArray[e.lIlllIIIIlII[38]] = lIlllIIIIIIl[lIlllIIIIlII[38]];
        stringArray[e.lIlllIIIIlII[39]] = lIlllIIIIIIl[lIlllIIIIlII[39]];
        stringArray[e.lIlllIIIIlII[40]] = lIlllIIIIIIl[lIlllIIIIlII[40]];
        stringArray[e.lIlllIIIIlII[41]] = lIlllIIIIIIl[lIlllIIIIlII[41]];
        stringArray[e.lIlllIIIIlII[42]] = lIlllIIIIIIl[lIlllIIIIlII[42]];
        stringArray[e.lIlllIIIIlII[43]] = lIlllIIIIIIl[lIlllIIIIlII[43]];
        stringArray[e.lIlllIIIIlII[44]] = lIlllIIIIIIl[lIlllIIIIlII[44]];
        stringArray[e.lIlllIIIIlII[45]] = lIlllIIIIIIl[lIlllIIIIlII[45]];
        S = List.of(stringArray);
        T = List.of(lIlllIIIIIIl[lIlllIIIIlII[22]], lIlllIIIIIIl[lIlllIIIIlII[46]]);
        U = List.of(lIlllIIIIIIl[lIlllIIIIlII[47]], lIlllIIIIIIl[lIlllIIIIlII[48]], lIlllIIIIIIl[lIlllIIIIlII[49]], lIlllIIIIIIl[lIlllIIIIlII[50]], lIlllIIIIIIl[lIlllIIIIlII[51]], lIlllIIIIIIl[lIlllIIIIlII[52]]);
    }

    public static WorldPoint m(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[5]).dy(lIlllIIIIlII[1]);
    }

    private static boolean lllIlIlIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    public static WorldPoint n(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[6]).dy(lIlllIIIIlII[1]);
    }

    private static String lllIlIlIlIIIlI(String lllllllllllllllIlIlllIIIlIlllIII, String lllllllllllllllIlIlllIIIlIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIIlIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIlIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIIIlIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIIIlIllllII.init(lIlllIIIIlII[11], lllllllllllllllIlIlllIIIlIllllIl);
            return new String(lllllllllllllllIlIlllIIIlIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIIIlIlllIll) {
            lllllllllllllllIlIlllIIIlIlllIll.printStackTrace();
            return null;
        }
    }

    private static void lllIlIlIlIIIll() {
        lIlllIIIIIIl = new String[lIlllIIIIlII[53]];
        e.lIlllIIIIIIl[e.lIlllIIIIlII[10]] = e.lllIlIlIlIIIII("DyodNwAlNwJ4BCIlACw=", "LBoXm");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[4]] = e.lllIlIlIlIIIIl("rSRqu2B5NxybKuhSO5HAlg==", "ojJUN");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[11]] = e.lllIlIlIlIIIlI("OKlCOQsPELp4Q8460grxeQ==", "OBUFE");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[6]] = e.lllIlIlIlIIIII("HB4AFSU5Vx8AIyE=", "JwraP");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[7]] = e.lllIlIlIlIIIlI("WMS87qI7/ofFQh0J5iu1Yw==", "PQpLd");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[0]] = e.lllIlIlIlIIIlI("o4TfsA6h+tOLrrorpdzTNV6mRaXMI+8x", "EVwUJ");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[23]] = e.lllIlIlIlIIIIl("cUpEUt4jBcN2RfCuETH1nA==", "daEOG");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[24]] = e.lllIlIlIlIIIII("Gj4nAjg+O3MJIjY+PQglMy4=", "WWSjJ");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[9]] = e.lllIlIlIlIIIIl("Kx+cTfhadQIa/KvvjU3ZPs6HIiUa5Z00", "GfVmm");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[25]] = e.lllIlIlIlIIIII("MRAkKi0bQjUhIwEHKSglBg==", "ubEMB");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[26]] = e.lllIlIlIlIIIIl("hMK4tLCTcZk=", "qsQFT");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[3]] = e.lllIlIlIlIIIlI("JcHYllyqawNcUEiTFVTbjA==", "ZDxLG");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[27]] = e.lllIlIlIlIIIII("Axs7J087DyMnAzgAdSoKMAom", "QnUBo");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[28]] = e.lllIlIlIlIIIIl("7znGTai4TQBfkUlUCTGw0b+LeaPkb8ei", "ihKWm");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[29]] = e.lllIlIlIlIIIII("GDoXPxttJgEoFg==", "MTtJo");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[30]] = e.lllIlIlIlIIIII("DQ8KHBt4BQAIAjcPDQ==", "Xaiio");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[31]] = e.lllIlIlIlIIIlI("0jldhaaQmo41Fsn8noHVcA==", "OkdOk");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[32]] = e.lllIlIlIlIIIIl("VYQoL/FwdAuwSnmUs0ix5edLr5RUaqex", "sJbxM");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[1]] = e.lllIlIlIlIIIlI("up7B/Klbi8nimYEW5SqzpQ==", "PypqP");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[33]] = e.lllIlIlIlIIIIl("oCtTPWIuBAccLQin9lES9w==", "gxxqC");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[34]] = e.lllIlIlIlIIIlI("LX8M/y/OcWff4u6sEnK3xw==", "eyIlm");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[35]] = e.lllIlIlIlIIIlI("B6JojEAdpklXeWDaz7MKkg==", "ypMQk");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[36]] = e.lllIlIlIlIIIIl("FI6dULhxveU=", "MQnfc");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[37]] = e.lllIlIlIlIIIII("FBwIMQ==", "FijHU");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[38]] = e.lllIlIlIlIIIlI("RgvxwFqbXrzonHZhpbSHsg==", "ypKJt");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[39]] = e.lllIlIlIlIIIlI("DadSExQrexWX2PGv/SeW/Q==", "MYwHa");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[40]] = e.lllIlIlIlIIIIl("IAqvY3Rygp6qUKmFyhxwqQ==", "YxgcR");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[41]] = e.lllIlIlIlIIIlI("XOj6KRTBSACegyFLUwGWpQ==", "JgXwA");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[42]] = e.lllIlIlIlIIIII("OT4wJmsYJCsv", "jQEJK");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[43]] = e.lllIlIlIlIIIII("Lw8CdSgbCBU=", "nfpUZ");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[44]] = e.lllIlIlIlIIIlI("yrPcyO9y4jpHNm2A1jGNIA==", "xEKjC");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[45]] = e.lllIlIlIlIIIII("BBUFHwYsRx4EAS4CHg==", "Bgjec");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[22]] = e.lllIlIlIlIIIlI("t0T4wsTPVYUx4siy3xMAJscU8QBhgxWa", "QiwfO");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[46]] = e.lllIlIlIlIIIlI("o/UJcom83jdrG6/YyHV03YQUNu2Aucqq", "LVLnc");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[47]] = e.lllIlIlIlIIIIl("MwMxFKU0R04K7VBKMZhOqA==", "SdZrc");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[48]] = e.lllIlIlIlIIIII("HwM2MQxyGzAhHzoZKj8=", "RvERm");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[49]] = e.lllIlIlIlIIIlI("gv5I0AYVWK+kuE8XO1480w==", "YysMJ");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[50]] = e.lllIlIlIlIIIIl("OcqkdVaOI0qFaEzRA/JLYA==", "jbjgO");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[51]] = e.lllIlIlIlIIIIl("AL6DDrz1AcmNzcnZGSqicQ==", "gdacW");
        e.lIlllIIIIIIl[e.lIlllIIIIlII[52]] = e.lllIlIlIlIIIlI("SeqJ09LXN5SZlyTNYM7dBhU+9JKxAcUP", "LJvSa");
    }

    public static WorldPoint p(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[6]).dy(lIlllIIIIlII[1]);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean r(TileObject tileObject) {
        boolean bl;
        TileObject lllllllllllllllIlIlllIIIllIIIIll;
        void lllllllllllllllIlIlllIIIllIIIIlI;
        Player player = Players.getLocal();
        if (e.lllIlIlIlIllll(player)) {
            return lIlllIIIIlII[10];
        }
        if (e.lllIlIlIllIIIl(lllllllllllllllIlIlllIIIllIIIIlI.getWorldX() - lIlllIIIIlII[11], lllllllllllllllIlIlllIIIllIIIIll.getWorldX())) {
            bl = lIlllIIIIlII[4];
            "".length();
            if (((0x48 ^ 0x10) & ~(0xCE ^ 0x96)) < 0) {
                return ((0xE1 ^ 0xC6) & ~(0xAC ^ 0x8B)) != 0;
            }
        } else {
            bl = lIlllIIIIlII[10];
        }
        return bl;
    }

    private static void lllIlIlIlIlllI() {
        lIlllIIIIlII = new int[54];
        e.lIlllIIIIlII[0] = 0x17 ^ 0x12;
        e.lIlllIIIIlII[1] = 0x8E ^ 0xAA ^ (0xB7 ^ 0x81);
        e.lIlllIIIIlII[2] = -(0x75 ^ 0x70);
        e.lIlllIIIIlII[3] = 0x5A ^ 0x43 ^ (0x3E ^ 0x2C);
        e.lIlllIIIIlII[4] = " ".length();
        e.lIlllIIIIlII[5] = -(0x32 ^ 0x36);
        e.lIlllIIIIlII[6] = "   ".length();
        e.lIlllIIIIlII[7] = 0xCB ^ 0x82 ^ (0xE5 ^ 0xA8);
        e.lIlllIIIIlII[8] = -(0x1F ^ 0x19);
        e.lIlllIIIIlII[9] = 0x64 ^ 0x6C;
        e.lIlllIIIIlII[10] = (0xFD ^ 0xC3) & ~(0x1E ^ 0x20);
        e.lIlllIIIIlII[11] = "  ".length();
        e.lIlllIIIIlII[12] = 0xFFFFBFFE & 0x6FA7;
        e.lIlllIIIIlII[13] = -(0xFFFFD679 & 0x3F97) & (0xFFFF9FFB & 0x7F9F);
        e.lIlllIIIIlII[14] = 0xFFFFEFF5 & 0x37CE;
        e.lIlllIIIIlII[15] = -(0xFFFFB99F & 0x4E66) & (0xFFFFAFDD & 0x7FEF);
        e.lIlllIIIIlII[16] = 0xFFFFBBAF & 0x4DD4;
        e.lIlllIIIIlII[17] = -(0x98 ^ 0xC1) & (0xFFFFC7FF & 0x3DFF);
        e.lIlllIIIIlII[18] = 0xFFFFEB3E & 0x16DB;
        e.lIlllIIIIlII[19] = 0xFFFFBFB7 & 0x6FEF;
        e.lIlllIIIIlII[20] = 0xFFFFBFAC & 0x6FFB;
        e.lIlllIIIIlII[21] = -(0xFFFFF973 & 0x56DF) & (0xFFFFFFFB & Short.MAX_VALUE);
        e.lIlllIIIIlII[22] = 70 + 38 - -20 + 5 ^ 148 + 63 - 125 + 79;
        e.lIlllIIIIlII[23] = 0x8B ^ 0x8D;
        e.lIlllIIIIlII[24] = 0x88 ^ 0x8F;
        e.lIlllIIIIlII[25] = 0x4D ^ 0x56 ^ (0x9B ^ 0x89);
        e.lIlllIIIIlII[26] = 0xCD ^ 0xBA ^ (0x3B ^ 0x46);
        e.lIlllIIIIlII[27] = 23 + 95 - -7 + 47 ^ 74 + 65 - 28 + 49;
        e.lIlllIIIIlII[28] = 0x5E ^ 0x53;
        e.lIlllIIIIlII[29] = 0x85 ^ 0x8B;
        e.lIlllIIIIlII[30] = 0x93 ^ 0x9C;
        e.lIlllIIIIlII[31] = 0x6E ^ 0x7E;
        e.lIlllIIIIlII[32] = 142 + 157 - 167 + 76 ^ 167 + 145 - 289 + 170;
        e.lIlllIIIIlII[33] = 0x63 ^ 0x70;
        e.lIlllIIIIlII[34] = 11 + 67 - -103 + 0 ^ 41 + 119 - 44 + 45;
        e.lIlllIIIIlII[35] = 0x6D ^ 0x78;
        e.lIlllIIIIlII[36] = 0x10 ^ 6;
        e.lIlllIIIIlII[37] = 82 + 21 - 50 + 93 ^ 88 + 92 - 164 + 117;
        e.lIlllIIIIlII[38] = 0x16 ^ 0x63 ^ (0x37 ^ 0x5A);
        e.lIlllIIIIlII[39] = 2 + 32 - 22 + 119 ^ 100 + 2 - 50 + 102;
        e.lIlllIIIIlII[40] = "  ".length() ^ (0x22 ^ 0x3A);
        e.lIlllIIIIlII[41] = 0x30 ^ 0x2B;
        e.lIlllIIIIlII[42] = 0x59 ^ 0x45;
        e.lIlllIIIIlII[43] = 59 + 69 - 124 + 142 ^ 2 + 129 - 19 + 31;
        e.lIlllIIIIlII[44] = 99 + 75 - 45 + 49 ^ 127 + 48 - 103 + 100;
        e.lIlllIIIIlII[45] = 0x34 ^ 0x2B;
        e.lIlllIIIIlII[46] = 49 + 27 - -7 + 67 ^ 64 + 153 - 124 + 90;
        e.lIlllIIIIlII[47] = 0x5F ^ 0x7D;
        e.lIlllIIIIlII[48] = 0xAE ^ 0xC6 ^ (0xCC ^ 0x87);
        e.lIlllIIIIlII[49] = 0xE ^ 0x2A;
        e.lIlllIIIIlII[50] = 0x8A ^ 0xAF;
        e.lIlllIIIIlII[51] = 0xB0 ^ 0x96;
        e.lIlllIIIIlII[52] = 0x8A ^ 0x9B ^ (0xB6 ^ 0x80);
        e.lIlllIIIIlII[53] = 0x85 ^ 0xAD;
    }

    private static boolean lllIlIlIllIIIl(int n2, int n3) {
        return n2 > n3;
    }

    public static WorldArea i(TileObject tileObject) {
        return new WorldArea(e.h(tileObject), lIlllIIIIlII[3], lIlllIIIIlII[9]);
    }

    private static String lllIlIlIlIIIIl(String lllllllllllllllIlIlllIIIlIIlIIll, String lllllllllllllllIlIlllIIIlIIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIIlIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIlIIlIlII.getBytes(StandardCharsets.UTF_8)), lIlllIIIIlII[9]), "DES");
            Cipher lllllllllllllllIlIlllIIIlIIlIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIIIlIIlIlll.init(lIlllIIIIlII[11], lllllllllllllllIlIlllIIIlIIllIII);
            return new String(lllllllllllllllIlIlllIIIlIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIIIlIIlIllI) {
            lllllllllllllllIlIlllIIIlIIlIllI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static boolean q(TileObject tileObject) {
        boolean bl;
        TileObject lllllllllllllllIlIlllIIIllIIIlll;
        void lllllllllllllllIlIlllIIIllIIIllI;
        Player player = Players.getLocal();
        if (e.lllIlIlIlIllll(player)) {
            return lIlllIIIIlII[10];
        }
        if (e.lllIlIlIllIIII(lllllllllllllllIlIlllIIIllIIIllI.getWorldX() + lIlllIIIIlII[11], lllllllllllllllIlIlllIIIllIIIlll.getWorldX())) {
            bl = lIlllIIIIlII[4];
            "".length();
            if (((43 + 4 - -49 + 54 ^ 94 + 18 - -33 + 20) & ("  ".length() ^ (0x2A ^ 0x1B) ^ -" ".length())) != 0) {
                return ((117 + 184 - 180 + 117 ^ 20 + 86 - -63 + 2) & (126 + 152 - 191 + 111 ^ 38 + 33 - 52 + 112 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlllIIIIlII[10];
        }
        return bl;
    }

    public static WorldPoint k(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[2]).dy(lIlllIIIIlII[1]);
    }

    private static boolean lllIlIlIlIllll(Object object) {
        return object == null;
    }

    private static String lllIlIlIlIIIII(String lllllllllllllllIlIlllIIIlIlIIlIl, String lllllllllllllllIlIlllIIIlIlIlIIl) {
        lllllllllllllllIlIlllIIIlIlIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIIIlIlIlIII = new StringBuilder();
        char[] lllllllllllllllIlIlllIIIlIlIIlll = lllllllllllllllIlIlllIIIlIlIlIIl.toCharArray();
        int lllllllllllllllIlIlllIIIlIlIIllI = lIlllIIIIlII[10];
        char[] lllllllllllllllIlIlllIIIlIlIIIII = lllllllllllllllIlIlllIIIlIlIIlIl.toCharArray();
        int lllllllllllllllIlIlllIIIlIIlllll = lllllllllllllllIlIlllIIIlIlIIIII.length;
        int lllllllllllllllIlIlllIIIlIIllllI = lIlllIIIIlII[10];
        while (e.lllIlIlIllIIII(lllllllllllllllIlIlllIIIlIIllllI, lllllllllllllllIlIlllIIIlIIlllll)) {
            char lllllllllllllllIlIlllIIIlIlIlIll = lllllllllllllllIlIlllIIIlIlIIIII[lllllllllllllllIlIlllIIIlIIllllI];
            lllllllllllllllIlIlllIIIlIlIlIII.append((char)(lllllllllllllllIlIlllIIIlIlIlIll ^ lllllllllllllllIlIlllIIIlIlIIlll[lllllllllllllllIlIlllIIIlIlIIllI % lllllllllllllllIlIlllIIIlIlIIlll.length]));
            "".length();
            ++lllllllllllllllIlIlllIIIlIlIIllI;
            ++lllllllllllllllIlIlllIIIlIIllllI;
            "".length();
            if (" ".length() <= "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIIIlIlIlIII);
    }

    public static WorldPoint g(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIlllIIIIlII[0]).dy(lIlllIIIIlII[1]);
    }
}

