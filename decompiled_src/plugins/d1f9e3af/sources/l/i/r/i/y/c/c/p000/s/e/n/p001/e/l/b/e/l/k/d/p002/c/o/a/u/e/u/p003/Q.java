package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.Q  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/Q.class */
public class Q implements W {
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldPoint bX;
    private static final /* synthetic */ int jA;
    private static /* synthetic */ String[] lIIlIIIll;
    static /* synthetic */ WorldPoint jF;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ String[] bR;
    static /* synthetic */ WorldPoint jE;
    private static /* synthetic */ int[] lIIlIIlll;
    static /* synthetic */ int cl;
    static /* synthetic */ WorldPoint jD;
    static /* synthetic */ boolean jG;
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ WorldPoint jB;
    static /* synthetic */ WorldPoint jC;

    private static String llllIIllIlI(String lIIIlIIIlIIlIlI, String lIIIlIIIlIIlIIl) {
        String str = new String(Base64.getDecoder().decode(lIIIlIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIIIlIIIlIIIlll = lIIIlIIIlIIlIIl.toCharArray();
        int lIIIlIIIlIIIllI = lIIlIIlll[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIIlll[1];
        while (llllIlIlIIl(i, length)) {
            char lIIIlIIIlIIlIll = charArray[i];
            sb.append((char) (lIIIlIIIlIIlIll ^ lIIIlIIIlIIIlll[lIIIlIIIlIIIllI % lIIIlIIIlIIIlll.length]));
            "".length();
            lIIIlIIIlIIIllI++;
            i++;
            "".length();
            if ((175 ^ 171) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llllIlIIlIl() {
        lIIlIIIll = new String[lIIlIIlll[129]];
        lIIlIIIll[lIIlIIlll[1]] = llllIIllIIl("qwLdi7UgMqGIKefbI3if77NhaayLLenoEDLvf0CcuEy4AVlGm+4ouDeZz3CuqWlz", "JFjzw");
        lIIlIIIll[lIIlIIlll[0]] = llllIIllIlI("ABMebDwhUgotJiU=", "NrhLH");
        lIIlIIIll[lIIlIIlll[4]] = llllIIllIIl("kEtqwMf8LcbxCWPRPti+WSYouk22MXfI", "yIfIN");
        lIIlIIIll[lIIlIIlll[7]] = llllIIllIll("AgzyUtCS33u7JoGutNPgvKZSRerL1r55H74sDR/KtR1EiY7a/rt80N1DRyrmctbXOXKKkW8D2Vk=", "elSpW");
        lIIlIIIll[lIIlIIlll[5]] = llllIIllIIl("9KlV89eo+6wIYfibjvYB0SNSKX3p+yCmGF+l7PWbzBSJtEGIqCF8jK3Pf9JdvWeHfj4UkIpu4gw=", "bAjgw");
        lIIlIIIll[lIIlIIlll[14]] = llllIIllIll("DEf3o/bwtl0=", "ygNyz");
        lIIlIIIll[lIIlIIlll[16]] = llllIIllIll("U9V3DP1S0q4=", "rGRUw");
        lIIlIIIll[lIIlIIlll[18]] = llllIIllIIl("5YmNFqRmpoJSDXmWgfU3sQ==", "ayGdX");
        lIIlIIIll[lIIlIIlll[20]] = llllIIllIlI("IRoKJRoHHgckC0I6CjgKAxw=", "brkKy");
        lIIlIIIll[lIIlIIlll[22]] = llllIIllIlI("JiwvYgMHbTYxGgkj", "hMYBw");
        lIIlIIIll[lIIlIIlll[24]] = llllIIllIIl("dQvLK/H+MnA=", "JfhTf");
        lIIlIIIll[lIIlIIlll[25]] = llllIIllIIl("9a5ER5Ng7zI=", "VoHnT");
        lIIlIIIll[lIIlIIlll[8]] = llllIIllIIl("7sUbyV5+fRo=", "pEEBW");
        lIIlIIIll[lIIlIIlll[34]] = llllIIllIIl("zjmnjIJraD/pWk//Wh6vrQ==", "RNOUf");
        lIIlIIIll[lIIlIIlll[35]] = llllIIllIIl("YqTQWDore4E=", "gUMlA");
        lIIlIIIll[lIIlIIlll[36]] = llllIIllIIl("/pYDmue2zJ0=", "WfvIC");
        lIIlIIIll[lIIlIIlll[37]] = llllIIllIlI("CQ0VESs=", "YlfeN");
        lIIlIIIll[lIIlIIlll[38]] = llllIIllIll("UoPHjuRYagw=", "ARCjt");
        lIIlIIIll[lIIlIIlll[39]] = llllIIllIlI("AAMyOzM=", "AdURV");
        lIIlIIIll[lIIlIIlll[42]] = llllIIllIIl("/gtQGbXDXE8=", "qYQJG");
        lIIlIIIll[lIIlIIlll[33]] = llllIIllIIl("SRSgk9qnqkc=", "wtPDm");
        lIIlIIIll[lIIlIIlll[43]] = llllIIllIll("SI43B4OqlDI=", "fcXFH");
        lIIlIIIll[lIIlIIlll[44]] = llllIIllIlI("Lh8UVgoXEwMC", "ezmvz");
        lIIlIIIll[lIIlIIlll[46]] = llllIIllIlI("IQUMZwAARBEiGAY=", "odzGt");
        lIIlIIIll[lIIlIIlll[52]] = llllIIllIlI("Aw81EFIECz0A", "OnQir");
        lIIlIIIll[lIIlIIlll[45]] = llllIIllIll("b+dmjgR5CII=", "xQJqp");
        lIIlIIIll[lIIlIIlll[53]] = llllIIllIIl("hFJSHajkcpQ=", "qWJfG");
        lIIlIIIll[lIIlIIlll[54]] = llllIIllIIl("PXVPJmuZG8oeDmu/xPuc2w==", "VSbBR");
        lIIlIIIll[lIIlIIlll[55]] = llllIIllIIl("Kz9Kql8AQgRoXOeqF86ayg==", "OUtoS");
        lIIlIIIll[lIIlIIlll[56]] = llllIIllIll("/vnuSsN6YcE=", "UJnkp");
        lIIlIIIll[lIIlIIlll[57]] = llllIIllIll("7R2VXlQv8f7j2l6RWh0vfA==", "Assff");
        lIIlIIIll[lIIlIIlll[58]] = llllIIllIlI("DRZDBiFKFQYXIgs=", "jycrN");
        lIIlIIIll[lIIlIIlll[59]] = llllIIllIlI("FQoG", "BcaWj");
        lIIlIIIll[lIIlIIlll[60]] = llllIIllIlI("JA0KJD0=", "tlyPX");
        lIIlIIIll[lIIlIIlll[61]] = llllIIllIll("dNP/DSXysr8=", "mFZvR");
        lIIlIIIll[lIIlIIlll[62]] = llllIIllIIl("KioNrH+FoVCmQLCcj7TNdg==", "pwqgB");
        lIIlIIIll[lIIlIIlll[63]] = llllIIllIIl("zuLEtKYTl52aO1nbuI5Q+w==", "KVFDu");
        lIIlIIIll[lIIlIIlll[64]] = llllIIllIll("l5nTo+0qUoI=", "rAGGT");
        lIIlIIIll[lIIlIIlll[65]] = llllIIllIIl("VLCmmo4Czk0=", "tvgQy");
        lIIlIIIll[lIIlIIlll[66]] = llllIIllIll("PIGXUAm0UnQ=", "meEJi");
        lIIlIIIll[lIIlIIlll[67]] = llllIIllIlI("J08YPlgJDQByHwEBGjVW", "nhtRx");
        lIIlIIIll[lIIlIIlll[68]] = llllIIllIIl("5tBEkQSbaeXTn93HJGwvuw==", "HuRhj");
        lIIlIIIll[lIIlIIlll[69]] = llllIIllIlI("NR0pPRk=", "yxLQx");
        lIIlIIIll[lIIlIIlll[70]] = llllIIllIlI("NQg6ICASWj4rIw==", "wzUNZ");
        lIIlIIIll[lIIlIIlll[73]] = llllIIllIll("n0ERVjPXvsorbFDItCJchg==", "NqPeQ");
        lIIlIIIll[lIIlIIlll[74]] = llllIIllIll("27yVE8D9zohH4XMI3W6iZw==", "PpXCz");
        lIIlIIIll[lIIlIIlll[75]] = llllIIllIlI("HAw1", "VcPac");
        lIIlIIIll[lIIlIIlll[76]] = llllIIllIll("qngQh47qy1g=", "PEplZ");
        lIIlIIIll[lIIlIIlll[77]] = llllIIllIIl("n7SKBQHrGSSX/asxAhemsg==", "hEFbr");
        lIIlIIIll[lIIlIIlll[78]] = llllIIllIll("4jLadn+bQ2w=", "NWhUa");
        lIIlIIIll[lIIlIIlll[32]] = llllIIllIIl("iArTWL8wBelJNB5grxODjw==", "kCkLY");
        lIIlIIIll[lIIlIIlll[79]] = llllIIllIIl("kS4ZF4qAWWU6+8YqEC+A0A==", "koAZz");
        lIIlIIIll[lIIlIIlll[80]] = llllIIllIIl("Ob4shWKro/BefrGJWCoC/Q==", "WLRNd");
        lIIlIIIll[lIIlIIlll[81]] = llllIIllIll("GJ7BlPUXEvDho7YKjpqGGQ==", "XAKNg");
        lIIlIIIll[lIIlIIlll[82]] = llllIIllIll("op2uJ5Mooi7I7FVIhFlTvw==", "VRTZG");
        lIIlIIIll[lIIlIIlll[84]] = llllIIllIIl("wmXoU9Otlpc=", "HWIiq");
        lIIlIIIll[lIIlIIlll[87]] = llllIIllIll("yJodRR2YhRAIzxP6bnwvWg==", "wZSjn");
        lIIlIIIll[lIIlIIlll[88]] = llllIIllIIl("JmSbOkxm5Po=", "cIPRi");
        lIIlIIIll[lIIlIIlll[89]] = llllIIllIIl("cOa9SdKUjQQ=", "Isoji");
        lIIlIIIll[lIIlIIlll[90]] = llllIIllIIl("RSzdhLjr+PdWW/mkXd8T+g==", "YVWNy");
        lIIlIIIll[lIIlIIlll[91]] = llllIIllIll("fUgEPHxeRClvC4tpeSozelOq5qbAu2f/", "AEqcD");
        lIIlIIIll[lIIlIIlll[97]] = llllIIllIlI("OSc7PgYMdRM8DEkHNyMGHDA=", "iURPe");
        lIIlIIIll[lIIlIIlll[99]] = llllIIllIll("7h18qtZFstZiJfhZmw5c4MHdQ7SqGM15", "whwdT");
        lIIlIIIll[lIIlIIlll[100]] = llllIIllIlI("KxYfPiE=", "LzpLX");
        lIIlIIIll[lIIlIIlll[101]] = llllIIllIll("UTclVHjrFv0=", "KCnNj");
        lIIlIIIll[lIIlIIlll[102]] = llllIIllIll("2S5zWxvh1BA=", "rTKWU");
        lIIlIIIll[lIIlIIlll[103]] = llllIIllIlI("Px4tMTQ=", "XrBCM");
        lIIlIIIll[lIIlIIlll[116]] = llllIIllIll("YY+0Fo2B/BU=", "vTStO");
        lIIlIIIll[lIIlIIlll[117]] = llllIIllIll("gLIRcTK2LzMzmEhrD5tjWdV/8EQ17HtkdfF0wrgWctX9huOxGskWLQ==", "txiJP");
        lIIlIIIll[lIIlIIlll[118]] = llllIIllIlI("KwY+OiZIECQjYgUIIDNiBx0jMzBIHSM/LA8aazcyCRs/diQaBiZ2MAcZLmk=", "hiKVB");
        lIIlIIIll[lIIlIIlll[119]] = llllIIllIlI("OCgccgcSKB4mRgMoBjdGAygZJkYfIUslDxd4", "pGkRf");
        lIIlIIIll[lIIlIIlll[120]] = llllIIllIIl("0lpojOdcS8POLzGLiltJn2BM7yKwwLrCxjC0pf0OHkKDOzI668GwKQ==", "pTrrZ");
        lIIlIIIll[lIIlIIlll[121]] = llllIIllIIl("ZRHhqQD+JWCw19q3tMSdyoOCncpkbQovt483uE25qYc=", "FoKLr");
        lIIlIIIll[lIIlIIlll[122]] = llllIIllIIl("0sKhPL3ERo17smQieUXNH3t0vlDLt89eFiDPDxc7zf6GixaLSNSHlA==", "NqQvU");
        lIIlIIIll[lIIlIIlll[123]] = llllIIllIll("1jwPn11eK/vp2Gx97ySq9+KN2ZRrTaVr7YFRQ2tSsxmPa7MR+1YjBaEjWfEGx+QG", "TsTdL");
        lIIlIIIll[lIIlIIlll[124]] = llllIIllIll("nTvOnSno4UivuUsVdShU6k/D792vpD3eSIKxFJGm/Y8=", "xZzky");
        lIIlIIIll[lIIlIIlll[125]] = llllIIllIlI("Pz8DcD4YcA0/L1c7Gj8tVyMbPT8YPhFwLRg+UyR6AyINcC4YcBIiPxJwHDk3SA==", "wPtPZ");
        lIIlIIIll[lIIlIIlll[126]] = llllIIllIll("z6vFF6c4Z+MlCU7WiKDLyUM9aGZUUqGu6Cdc2WwW4GE=", "viwDw");
        lIIlIIIll[lIIlIIlll[127]] = llllIIllIIl("4XMlOsSJgtQiavmyNQs6+ZoNjI3ohBZcHew1mjxNOsoUvIk/It/PiRxsXuf//EC+", "ksdOJ");
        lIIlIIIll[lIIlIIlll[128]] = llllIIllIll("kKppFW2rA1eEVfhmcfhUby5iynLqL5yI1HHQy0tbt/RET50O3okcIA==", "rPJUh");
    }

    private static boolean llllIlIlllI(int i, int i2) {
        return i > i2;
    }

    private static boolean llllIlIllll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIlIIlll[1];
    }

    private static boolean llllIlIlIlI(int i) {
        return i == 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            cS();
            "".length();
            if ("  ".length() < 0) {
                return " ".length() & (" ".length() ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIIlll[83];
    }

    private static boolean llllIllIIII(int i, int i2) {
        return i == i2;
    }

    private static boolean llllIllIIIl(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (llllIllIIlI(C0004e.j(lIIlIIlll[2]), lIIlIIlll[98])) {
            ?? r0 = lIIlIIlll[0];
            "".length();
            return (((100 ^ 94) ^ (153 ^ 132)) & (((11 ^ 115) ^ (0 ^ 95)) ^ (-" ".length()))) < 0 ? ((121 ^ 104) ^ (104 ^ 115)) & (((175 ^ 140) ^ (99 ^ 74)) ^ (-" ".length())) : r0;
        }
        return lIIlIIlll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIlIIlll[8]];
        iArr[lIIlIIlll[1]] = lIIlIIlll[9];
        iArr[lIIlIIlll[0]] = lIIlIIlll[10];
        iArr[lIIlIIlll[4]] = lIIlIIlll[11];
        iArr[lIIlIIlll[7]] = lIIlIIlll[12];
        iArr[lIIlIIlll[5]] = lIIlIIlll[13];
        iArr[lIIlIIlll[14]] = lIIlIIlll[15];
        iArr[lIIlIIlll[16]] = lIIlIIlll[17];
        iArr[lIIlIIlll[18]] = lIIlIIlll[19];
        iArr[lIIlIIlll[20]] = lIIlIIlll[21];
        iArr[lIIlIIlll[22]] = lIIlIIlll[23];
        iArr[lIIlIIlll[24]] = lIIlIIlll[6];
        iArr[lIIlIIlll[25]] = lIIlIIlll[26];
        int i = lIIlIIlll[1];
        while (llllIlIlIIl(i, iArr.length)) {
            int[] iArr2 = new int[lIIlIIlll[0]];
            iArr2[lIIlIIlll[1]] = iArr[i];
            if (llllIlIlIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIlIIlll[1];
            }
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return ((61 ^ 90) ^ (113 ^ 30)) & (((193 ^ 176) ^ (16 ^ 105)) ^ (-" ".length()));
            }
        }
        return lIIlIIlll[0];
    }

    private static void llllIlIIllI() {
        lIIlIIlll = new int[130];
        lIIlIIlll[0] = " ".length();
        lIIlIIlll[1] = (144 ^ 190) & ((188 ^ 146) ^ (-1));
        lIIlIIlll[2] = (-((-4613) & 31471)) & (-1541) & 28671;
        lIIlIIlll[3] = (-27752) & 32751;
        lIIlIIlll[4] = "  ".length();
        lIIlIIlll[5] = (30 ^ 75) ^ (104 ^ 57);
        lIIlIIlll[6] = (-129) & 2045;
        lIIlIIlll[7] = "   ".length();
        lIIlIIlll[8] = (((81 + 130) - 171) + 110) ^ (((24 + 98) - (-31)) + 1);
        lIIlIIlll[9] = (-41) & 8047;
        lIIlIIlll[10] = (-((-9637) & 32175)) & (-1) & 24299;
        lIIlIIlll[11] = (-((-14425) & 30841)) & (-2305) & 20479;
        lIIlIIlll[12] = (-((-27169) & 31283)) & (-10249) & 16127;
        lIIlIIlll[13] = (-((-4157) & 20605)) & (-33) & 18431;
        lIIlIIlll[14] = 121 ^ 124;
        lIIlIIlll[15] = (-((-4497) & 20923)) & (-10497) & 27514;
        lIIlIIlll[16] = (214 ^ 157) ^ (91 ^ 22);
        lIIlIIlll[17] = (-3) & 1931;
        lIIlIIlll[18] = (249 ^ 148) ^ (91 ^ 49);
        lIIlIIlll[19] = (-8291) & 10223;
        lIIlIIlll[20] = 40 ^ 32;
        lIIlIIlll[21] = (-20995) & 23343;
        lIIlIIlll[22] = (84 ^ 52) ^ (69 ^ 44);
        lIIlIIlll[23] = (-((-5441) & 32075)) & (-1025) & 28671;
        lIIlIIlll[24] = (75 ^ 14) ^ (80 ^ 31);
        lIIlIIlll[25] = (((105 + 14) - (-7)) + 36) ^ (((112 + 37) - 32) + 52);
        lIIlIIlll[26] = (-28673) & 29626;
        lIIlIIlll[27] = (-22149) & 22527;
        lIIlIIlll[28] = (-16417) & 28394;
        lIIlIIlll[29] = (-3721) & 16345;
        lIIlIIlll[30] = (-((-18183) & 28447)) & (-4101) & 15359;
        lIIlIIlll[31] = (-5122) & 6121;
        lIIlIIlll[32] = 28 ^ 46;
        lIIlIIlll[33] = (96 ^ 53) ^ (45 ^ 108);
        lIIlIIlll[34] = 73 ^ 68;
        lIIlIIlll[35] = 150 ^ 152;
        lIIlIIlll[36] = 73 ^ 70;
        lIIlIIlll[37] = 78 ^ 94;
        lIIlIIlll[38] = (((30 + 62) - (-22)) + 41) ^ (((18 + 123) - 139) + 136);
        lIIlIIlll[39] = (38 ^ 72) ^ (1 ^ 125);
        lIIlIIlll[40] = (-29157) & 32239;
        lIIlIIlll[41] = (-12290) & 15545;
        lIIlIIlll[42] = (((26 + 1) - (-44)) + 66) ^ (((19 + 131) - 8) + 12);
        lIIlIIlll[43] = (217 ^ 162) ^ (218 ^ 180);
        lIIlIIlll[44] = (((53 + 90) - 88) + 100) ^ (((19 + 56) - (-24)) + 42);
        lIIlIIlll[45] = 183 ^ 174;
        lIIlIIlll[46] = 69 ^ 82;
        lIIlIIlll[47] = (-16645) & 19772;
        lIIlIIlll[48] = (-((-8875) & 25579)) & (-8721) & 28670;
        lIIlIIlll[49] = (-((-8731) & 25179)) & (-13073) & 32767;
        lIIlIIlll[50] = (-((-8273) & 13139)) & (-129) & 8123;
        lIIlIIlll[51] = (-((-11233) & 27635)) & (-12609) & 32255;
        lIIlIIlll[52] = (230 ^ 137) ^ (206 ^ 185);
        lIIlIIlll[53] = 109 ^ 119;
        lIIlIIlll[54] = 123 ^ 96;
        lIIlIIlll[55] = 116 ^ 104;
        lIIlIIlll[56] = 77 ^ 80;
        lIIlIIlll[57] = 41 ^ 55;
        lIIlIIlll[58] = (91 ^ 103) ^ (160 ^ 131);
        lIIlIIlll[59] = (((26 + 76) - (-39)) + 88) ^ (((175 + 31) - 136) + 127);
        lIIlIIlll[60] = (135 ^ 151) ^ (63 ^ 14);
        lIIlIIlll[61] = 67 ^ 97;
        lIIlIIlll[62] = 183 ^ 148;
        lIIlIIlll[63] = (132 ^ 168) ^ (38 ^ 46);
        lIIlIIlll[64] = 183 ^ 146;
        lIIlIIlll[65] = 59 ^ 29;
        lIIlIIlll[66] = 113 ^ 86;
        lIIlIIlll[67] = (56 ^ 80) ^ (220 ^ 156);
        lIIlIIlll[68] = (((141 + 140) - 223) + 92) ^ (((140 + 168) - 277) + 160);
        lIIlIIlll[69] = (3 ^ 65) ^ (254 ^ 150);
        lIIlIIlll[70] = (((129 + 19) - 128) + 124) ^ (((152 + 49) - 56) + 42);
        lIIlIIlll[71] = (-21387) & 24507;
        lIIlIIlll[72] = (-((-3395) & 32090)) & (-65) & 31999;
        lIIlIIlll[73] = 182 ^ 154;
        lIIlIIlll[74] = 167 ^ 138;
        lIIlIIlll[75] = 166 ^ 136;
        lIIlIIlll[76] = (9 ^ 37) ^ "   ".length();
        lIIlIIlll[77] = (72 ^ 33) ^ (4 ^ 93);
        lIIlIIlll[78] = (70 ^ 42) ^ (198 ^ 155);
        lIIlIIlll[79] = 191 ^ 140;
        lIIlIIlll[80] = (237 ^ 194) ^ (134 ^ 157);
        lIIlIIlll[81] = (6 ^ 34) ^ (117 ^ 100);
        lIIlIIlll[82] = (34 ^ 18) ^ (137 ^ 143);
        lIIlIIlll[83] = 35 ^ 71;
        lIIlIIlll[84] = 16 ^ 39;
        lIIlIIlll[85] = (-((-19603) & 20382)) & (-16449) & 20447;
        lIIlIIlll[86] = (-(106 ^ 71)) & (-12801) & 16111;
        lIIlIIlll[87] = (120 ^ 53) ^ (68 ^ 49);
        lIIlIIlll[88] = (((33 + 59) - 39) + 89) ^ (((67 + 75) - 53) + 94);
        lIIlIIlll[89] = 57 ^ 3;
        lIIlIIlll[90] = (171 ^ 197) ^ (22 ^ 67);
        lIIlIIlll[91] = (((91 + 2) - (-58)) + 39) ^ (((18 + 93) - 27) + 46);
        lIIlIIlll[92] = (-((-29) & 9117)) & (-4098) & 32685;
        lIIlIIlll[93] = (-((-2149) & 26727)) & (-2050) & 32127;
        lIIlIIlll[94] = (-((-5781) & 22455)) & (-17) & 28670;
        lIIlIIlll[95] = (-4178) & 29177;
        lIIlIIlll[96] = (-20609) & 22508;
        lIIlIIlll[97] = 33 ^ 28;
        lIIlIIlll[98] = 68 ^ 42;
        lIIlIIlll[99] = (((23 + 17) - (-53)) + 65) ^ (((2 + 158) - 3) + 3);
        lIIlIIlll[100] = 3 ^ 60;
        lIIlIIlll[101] = 105 ^ 41;
        lIIlIIlll[102] = 236 ^ 173;
        lIIlIIlll[103] = (174 ^ 171) ^ (20 ^ 83);
        lIIlIIlll[104] = (-13077) & 16375;
        lIIlIIlll[105] = (-((-5675) & 22447)) & (-12801) & 32733;
        lIIlIIlll[106] = (-((-7055) & 23471)) & (-4869) & 24574;
        lIIlIIlll[107] = (-((-22647) & 31735)) & (-20481) & 32750;
        lIIlIIlll[108] = (-97) & 3194;
        lIIlIIlll[109] = (-((-17715) & 22391)) & (-16641) & 24574;
        lIIlIIlll[110] = (-4385) & 7469;
        lIIlIIlll[111] = (-4097) & 7355;
        lIIlIIlll[112] = (-8514) & 11639;
        lIIlIIlll[113] = (-21333) & 24575;
        lIIlIIlll[114] = (-472) & 3583;
        lIIlIIlll[115] = (-((-9313) & 30306)) & (-1) & 24255;
        lIIlIIlll[116] = (108 ^ 34) ^ (154 ^ 151);
        lIIlIIlll[117] = (((96 + 138) - 67) + 42) ^ (((68 + 93) - 92) + 80);
        lIIlIIlll[118] = 120 ^ 61;
        lIIlIIlll[119] = (241 ^ 173) ^ (125 ^ 103);
        lIIlIIlll[120] = (116 ^ 113) ^ (23 ^ 85);
        lIIlIIlll[121] = 223 ^ 151;
        lIIlIIlll[122] = 57 ^ 112;
        lIIlIIlll[123] = (92 ^ 6) ^ (135 ^ 151);
        lIIlIIlll[124] = 139 ^ 192;
        lIIlIIlll[125] = 0 ^ 76;
        lIIlIIlll[126] = 138 ^ 199;
        lIIlIIlll[127] = 47 ^ 97;
        lIIlIIlll[128] = (59 ^ 97) ^ (48 ^ 37);
        lIIlIIlll[129] = (((169 + 191) - 315) + 192) ^ (((84 + 97) - 134) + 142);
    }

    private static boolean llllIlIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llllIlIlIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0171, code lost:
        if (llllIlIlIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.Q.lIIlIIlll[7]) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0419  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10 = new int[lIIlIIlll[0]];
        iArr10[lIIlIIlll[1]] = lIIlIIlll[28];
        if (llllIlIlIlI(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlll[28], lIIlIIlll[0], lIIlIIlll[92]));
            "".length();
        }
        int[] iArr11 = new int[lIIlIIlll[0]];
        iArr11[lIIlIIlll[1]] = lIIlIIlll[26];
        if (llllIlIlIlI(Bank.contains(iArr11) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlll[26], lIIlIIlll[0], lIIlIIlll[93]));
            "".length();
        }
        int[] iArr12 = new int[lIIlIIlll[0]];
        iArr12[lIIlIIlll[1]] = lIIlIIlll[23];
        if (llllIlIlIlI(Bank.contains(iArr12) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlll[23], lIIlIIlll[0], lIIlIIlll[93]));
            "".length();
        }
        int[] iArr13 = new int[lIIlIIlll[0]];
        iArr13[lIIlIIlll[1]] = lIIlIIlll[21];
        if (llllIlIlIlI(Bank.contains(iArr13) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIlll[21], lIIlIIlll[0], lIIlIIlll[93]));
            "".length();
        }
        int[] iArr14 = new int[lIIlIIlll[0]];
        iArr14[lIIlIIlll[1]] = lIIlIIlll[6];
        if (llllIlIlIII(Bank.contains(iArr14) ? 1 : 0)) {
            int[] iArr15 = new int[lIIlIIlll[0]];
            iArr15[lIIlIIlll[1]] = lIIlIIlll[6];
            if (llllIlIlIII(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIlIIlll[0]];
                iArr16[lIIlIIlll[1]] = lIIlIIlll[6];
            }
            iArr = new int[lIIlIIlll[0]];
            iArr[lIIlIIlll[1]] = lIIlIIlll[15];
            if (llllIlIlIlI(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIlll[15], lIIlIIlll[0], lIIlIIlll[93]));
                "".length();
            }
            iArr2 = new int[lIIlIIlll[0]];
            iArr2[lIIlIIlll[1]] = lIIlIIlll[17];
            if (llllIlIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIlll[17], lIIlIIlll[0], lIIlIIlll[93]));
                "".length();
            }
            iArr3 = new int[lIIlIIlll[0]];
            iArr3[lIIlIIlll[1]] = lIIlIIlll[19];
            if (llllIlIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIlll[19], lIIlIIlll[0], lIIlIIlll[93]));
                "".length();
            }
            iArr4 = new int[lIIlIIlll[0]];
            iArr4[lIIlIIlll[1]] = lIIlIIlll[13];
            if (llllIlIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIlll[13], lIIlIIlll[0], lIIlIIlll[93]));
                "".length();
            }
            iArr5 = new int[lIIlIIlll[0]];
            iArr5[lIIlIIlll[1]] = lIIlIIlll[12];
            if (llllIlIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIlll[12], lIIlIIlll[0], lIIlIIlll[93]));
                "".length();
            }
            iArr6 = new int[lIIlIIlll[0]];
            iArr6[lIIlIIlll[1]] = lIIlIIlll[11];
            if (llllIlIlIlI(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIlll[11], lIIlIIlll[7], lIIlIIlll[93]));
                "".length();
            }
            iArr7 = new int[lIIlIIlll[0]];
            iArr7[lIIlIIlll[1]] = lIIlIIlll[10];
            if (llllIlIlIlI(Bank.contains(iArr7) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIlll[10], lIIlIIlll[0], lIIlIIlll[93]));
                "".length();
            }
            if (llllIlIlIlI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIlIIIll[lIIlIIlll[99]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIlll[94], lIIlIIlll[14], lIIlIIlll[95]));
                "".length();
            }
            iArr8 = new int[lIIlIIlll[0]];
            iArr8[lIIlIIlll[1]] = lIIlIIlll[29];
            if (llllIlIlIlI(Bank.contains(iArr8) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIlll[29], lIIlIIlll[5], C0008i.bq));
                "".length();
            }
            iArr9 = new int[lIIlIIlll[0]];
            iArr9[lIIlIIlll[1]] = lIIlIIlll[9];
            if (llllIlIlIII(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr17 = new int[lIIlIIlll[0]];
                iArr17[lIIlIIlll[1]] = lIIlIIlll[9];
                if (!llllIlIlIII(Bank.contains(iArr17) ? 1 : 0)) {
                    return;
                }
                int[] iArr18 = new int[lIIlIIlll[0]];
                iArr18[lIIlIIlll[1]] = lIIlIIlll[9];
                if (!llllIlIlIIl(Bank.getFirst(iArr18).getQuantity(), lIIlIIlll[36])) {
                    return;
                }
            }
            bv.add(new C0003d(lIIlIIlll[9], lIIlIIlll[67], lIIlIIlll[96]));
            "".length();
        }
        bv.add(new C0003d(lIIlIIlll[6], lIIlIIlll[7], lIIlIIlll[93]));
        "".length();
        iArr = new int[lIIlIIlll[0]];
        iArr[lIIlIIlll[1]] = lIIlIIlll[15];
        if (llllIlIlIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIlIIlll[0]];
        iArr2[lIIlIIlll[1]] = lIIlIIlll[17];
        if (llllIlIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIlIIlll[0]];
        iArr3[lIIlIIlll[1]] = lIIlIIlll[19];
        if (llllIlIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIIlIIlll[0]];
        iArr4[lIIlIIlll[1]] = lIIlIIlll[13];
        if (llllIlIlIlI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIlIIlll[0]];
        iArr5[lIIlIIlll[1]] = lIIlIIlll[12];
        if (llllIlIlIlI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIIlIIlll[0]];
        iArr6[lIIlIIlll[1]] = lIIlIIlll[11];
        if (llllIlIlIlI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIIlIIlll[0]];
        iArr7[lIIlIIlll[1]] = lIIlIIlll[10];
        if (llllIlIlIlI(Bank.contains(iArr7) ? 1 : 0)) {
        }
        if (llllIlIlIlI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIlIIIll[lIIlIIlll[99]]);
        }) ? 1 : 0)) {
        }
        iArr8 = new int[lIIlIIlll[0]];
        iArr8[lIIlIIlll[1]] = lIIlIIlll[29];
        if (llllIlIlIlI(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIIlIIlll[0]];
        iArr9[lIIlIIlll[1]] = lIIlIIlll[9];
        if (llllIlIlIII(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIlll[9], lIIlIIlll[67], lIIlIIlll[96]));
        "".length();
    }

    private static boolean llllIlIlIll(Object obj) {
        return obj != null;
    }

    private static boolean llllIlIllIl(int i) {
        return i < 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIlIIIll[lIIlIIlll[97]];
    }

    private static String llllIIllIIl(String lIIIlIIIlIllIlI, String lIIIlIIIlIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIIIlIllIIl.getBytes(StandardCharsets.UTF_8)), lIIlIIlll[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIlll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIlIIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIIIlIllIll) {
            lIIIlIIIlIllIll.printStackTrace();
            return null;
        }
    }

    private static String llllIIllIll(String lIIIlIIIIllIlIl, String lIIIlIIIIllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlIIIIllIlll = Cipher.getInstance("Blowfish");
            lIIIlIIIIllIlll.init(lIIlIIlll[4], secretKeySpec);
            return new String(lIIIlIIIIllIlll.doFinal(Base64.getDecoder().decode(lIIIlIIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIIIIllIllI) {
            lIIIlIIIIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlIllII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v268, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v313, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v566, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v575, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v597, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v121, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v136, types: [boolean] */
    public static void cS() {
        if (llllIlIlIII(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (llllIlIlIIl(bv.size(), lIIlIIlll[0])) {
                System.out.println(lIIlIIIll[lIIlIIlll[1]]);
                bt = lIIlIIlll[1];
            }
        }
        if (llllIlIlIlI(bt ? 1 : 0)) {
            if (llllIlIlIlI(ab() ? 1 : 0) && llllIlIlIIl(C0004e.j(lIIlIIlll[2]), lIIlIIlll[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llllIlIlIll(nearest) && llllIlIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[0]];
                    C0000a.a(nearest);
                }
                if (llllIlIlIll(nearest) && llllIlIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llllIlIlIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIlll[3]);
                        "".length();
                    }
                    if (llllIlIlIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[4]];
                        if (llllIlIllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIlll[5]);
                            "".length();
                        }
                        if (llllIlIllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIIlll[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIIlll[0]];
                        iArr[lIIlIIlll[1]] = lIIlIIlll[6];
                        if (llllIlIlIII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIlIIlll[0]];
                            iArr2[lIIlIIlll[1]] = lIIlIIlll[6];
                            if (llllIlIlIIl(Bank.getFirst(iArr2).getQuantity(), lIIlIIlll[7])) {
                                af();
                                System.out.println(lIIlIIIll[lIIlIIlll[7]]);
                                bt = lIIlIIlll[0];
                                return;
                            }
                        }
                        int[] iArr3 = new int[lIIlIIlll[8]];
                        iArr3[lIIlIIlll[1]] = lIIlIIlll[9];
                        iArr3[lIIlIIlll[0]] = lIIlIIlll[10];
                        iArr3[lIIlIIlll[4]] = lIIlIIlll[11];
                        iArr3[lIIlIIlll[7]] = lIIlIIlll[12];
                        iArr3[lIIlIIlll[5]] = lIIlIIlll[13];
                        iArr3[lIIlIIlll[14]] = lIIlIIlll[15];
                        iArr3[lIIlIIlll[16]] = lIIlIIlll[17];
                        iArr3[lIIlIIlll[18]] = lIIlIIlll[19];
                        iArr3[lIIlIIlll[20]] = lIIlIIlll[21];
                        iArr3[lIIlIIlll[22]] = lIIlIIlll[23];
                        iArr3[lIIlIIlll[24]] = lIIlIIlll[6];
                        iArr3[lIIlIIlll[25]] = lIIlIIlll[26];
                        if (llllIlIlIlI(C0004e.b(iArr3) ? 1 : 0)) {
                            af();
                            System.out.println(lIIlIIIll[lIIlIIlll[5]]);
                            bt = lIIlIIlll[0];
                            return;
                        }
                        int[] iArr4 = new int[lIIlIIlll[8]];
                        iArr4[lIIlIIlll[1]] = lIIlIIlll[9];
                        iArr4[lIIlIIlll[0]] = lIIlIIlll[10];
                        iArr4[lIIlIIlll[4]] = lIIlIIlll[11];
                        iArr4[lIIlIIlll[7]] = lIIlIIlll[12];
                        iArr4[lIIlIIlll[5]] = lIIlIIlll[13];
                        iArr4[lIIlIIlll[14]] = lIIlIIlll[15];
                        iArr4[lIIlIIlll[16]] = lIIlIIlll[17];
                        iArr4[lIIlIIlll[18]] = lIIlIIlll[19];
                        iArr4[lIIlIIlll[20]] = lIIlIIlll[21];
                        iArr4[lIIlIIlll[22]] = lIIlIIlll[23];
                        iArr4[lIIlIIlll[24]] = lIIlIIlll[6];
                        iArr4[lIIlIIlll[25]] = lIIlIIlll[26];
                        if (llllIlIlIII(C0004e.b(iArr4) ? 1 : 0)) {
                            C0000a.a(lIIlIIlll[10], lIIlIIlll[0]);
                            C0000a.a(lIIlIIlll[12], lIIlIIlll[0]);
                            C0000a.a(lIIlIIlll[13], lIIlIIlll[0]);
                            C0000a.a(lIIlIIlll[15], lIIlIIlll[0]);
                            C0000a.a(lIIlIIlll[17], lIIlIIlll[0]);
                            C0000a.a(lIIlIIlll[21], lIIlIIlll[0]);
                            C0000a.a(lIIlIIlll[19], lIIlIIlll[0]);
                            C0000a.a(lIIlIIlll[23], lIIlIIlll[0]);
                            C0000a.a(lIIlIIlll[26], lIIlIIlll[0]);
                            C0000a.a(lIIlIIlll[27], lIIlIIlll[14]);
                            C0000a.a(lIIlIIlll[9], lIIlIIlll[24]);
                            C0000a.a(lIIlIIlll[28], lIIlIIlll[0]);
                            C0000a.a(lIIlIIlll[6], lIIlIIlll[7]);
                            C0000a.a(lIIlIIlll[11], lIIlIIlll[7]);
                            C0000a.a(lIIlIIlll[29], lIIlIIlll[4]);
                            C0000a.a(lIIlIIlll[30], lIIlIIlll[31]);
                        }
                    }
                }
            }
            if (llllIlIlIII(Inventory.contains(C0005f.aV) ? 1 : 0) && llllIlIlIIl(Movement.getRunEnergy(), lIIlIIlll[32])) {
                Inventory.getFirst(C0005f.aV).interact(lIIlIIIll[lIIlIIlll[14]]);
                Time.sleepTicks(lIIlIIlll[0]);
                "".length();
            }
            int[] iArr5 = new int[lIIlIIlll[0]];
            iArr5[lIIlIIlll[1]] = lIIlIIlll[27];
            if (llllIlIlIII(Inventory.contains(iArr5) ? 1 : 0) && llllIlIllIl(llllIlIIlll(C0004e.u(), 50.0d))) {
                int[] iArr6 = new int[lIIlIIlll[0]];
                iArr6[lIIlIIlll[1]] = lIIlIIlll[27];
                Inventory.getFirst(iArr6).interact(lIIlIIIll[lIIlIIlll[16]]);
                Time.sleepTicks(lIIlIIlll[0]);
                "".length();
            }
            if (llllIlIlIII(ab() ? 1 : 0) && llllIlIlIlI(C0004e.j(lIIlIIlll[2]))) {
                if (llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIIlIIlll[18])) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[18]];
                    Movement.walkTo(bX);
                    "".length();
                    Time.sleepTicks(lIIlIIlll[0]);
                    "".length();
                }
                if (llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIlIIlll[18])) {
                    C0006g.a(lIIlIIIll[lIIlIIlll[20]], bR);
                }
            }
            if (llllIllIIII(C0004e.j(lIIlIIlll[2]), lIIlIIlll[24])) {
                if (llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[14])) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[22]];
                    Movement.walkTo(jB);
                    "".length();
                    Time.sleepTicks(lIIlIIlll[0]);
                    "".length();
                }
                if (llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[14])) {
                    C0006g.a(lIIlIIIll[lIIlIIlll[24]], bR);
                }
            }
            if (llllIllIIII(C0004e.j(lIIlIIlll[2]), lIIlIIlll[33])) {
                cl = lIIlIIlll[1];
                String[] strArr = new String[lIIlIIlll[0]];
                strArr[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[25]];
                if (llllIlIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
                    if (llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jC), lIIlIIlll[4])) {
                        if (llllIlIlIII(Inventory.contains(item -> {
                            return item.getName().contains(lIIlIIIll[lIIlIIlll[103]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item2 -> {
                                return item2.getName().contains(lIIlIIIll[lIIlIIlll[102]]);
                            }).interact(lIIlIIIll[lIIlIIlll[8]]);
                        }
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[34]];
                        Movement.walkTo(jC);
                        "".length();
                        Time.sleepTicks(lIIlIIlll[0]);
                        "".length();
                    }
                    if (llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jC), lIIlIIlll[4])) {
                        C0006g.a(lIIlIIIll[lIIlIIlll[35]], bR);
                    }
                }
                String[] strArr2 = new String[lIIlIIlll[0]];
                strArr2[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[36]];
                if (llllIlIlIII(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[lIIlIIlll[0]];
                    strArr3[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[37]];
                    if (llllIlIlIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIlIIlll[0]];
                        iArr7[lIIlIIlll[1]] = lIIlIIlll[12];
                        if (llllIlIlIII(Inventory.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIIlIIlll[0]];
                            iArr8[lIIlIIlll[1]] = lIIlIIlll[12];
                            Item first = Inventory.getFirst(iArr8);
                            String[] strArr4 = new String[lIIlIIlll[0]];
                            strArr4[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[38]];
                            first.useOn(Inventory.getFirst(strArr4));
                            Time.sleepTicks(lIIlIIlll[4]);
                            "".length();
                        }
                        int[] iArr9 = new int[lIIlIIlll[0]];
                        iArr9[lIIlIIlll[1]] = lIIlIIlll[12];
                        if (llllIlIlIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                            String[] strArr5 = new String[lIIlIIlll[0]];
                            strArr5[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[39]];
                            NPC nearest2 = NPCs.getNearest(strArr5);
                            new WorldArea(lIIlIIlll[40], lIIlIIlll[41], lIIlIIlll[14], lIIlIIlll[16], lIIlIIlll[1]);
                            if (!llllIlIlIll(nearest2) || (llllIlIlIll(nearest2) && llllIlIlIlI(Reachable.isInteractable(nearest2) ? 1 : 0))) {
                                Movement.walkTo(jD);
                                "".length();
                                Time.sleepTicks(lIIlIIlll[0]);
                                "".length();
                            }
                            if (llllIlIlIll(nearest2)) {
                                C0006g.a(lIIlIIIll[lIIlIIlll[42]], bR, lIIlIIlll[0]);
                            }
                        }
                    }
                }
                String[] strArr6 = new String[lIIlIIlll[0]];
                strArr6[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[33]];
                if (llllIlIlIII(Inventory.contains(strArr6) ? 1 : 0)) {
                    String[] strArr7 = new String[lIIlIIlll[0]];
                    strArr7[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[43]];
                    if (llllIlIlIII(Inventory.contains(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[lIIlIIlll[0]];
                        strArr8[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[44]];
                        if (llllIlIlIlI(Inventory.contains(strArr8) ? 1 : 0) && llllIlIlIlI(jG ? 1 : 0)) {
                            if (llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jE), lIIlIIlll[18]) && llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[45])) {
                                AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[46]];
                                Movement.walkTo(jE);
                                "".length();
                                Time.sleepTicks(lIIlIIlll[0]);
                                "".length();
                            }
                            if (llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jE), lIIlIIlll[18])) {
                                WorldPoint worldPoint = new WorldPoint(lIIlIIlll[47], lIIlIIlll[48], lIIlIIlll[1]);
                                WorldPoint worldPoint2 = new WorldPoint(lIIlIIlll[47], lIIlIIlll[49], lIIlIIlll[1]);
                                if ((!llllIlIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || llllIlIlIII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) && llllIlIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    Movement.walkTo(new WorldPoint(lIIlIIlll[50], lIIlIIlll[51], lIIlIIlll[1]));
                                    "".length();
                                    Time.sleepTicks(lIIlIIlll[7]);
                                    "".length();
                                }
                                C0006g.a(lIIlIIIll[lIIlIIlll[52]], bR, lIIlIIlll[0]);
                            }
                        }
                    }
                }
                String[] strArr9 = new String[lIIlIIlll[0]];
                strArr9[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[45]];
                if (llllIlIlIII(Inventory.contains(strArr9) ? 1 : 0)) {
                    String[] strArr10 = new String[lIIlIIlll[0]];
                    strArr10[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[53]];
                    if (llllIlIlIII(Inventory.contains(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[lIIlIIlll[0]];
                        strArr11[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[54]];
                        if (llllIlIlIII(Inventory.contains(strArr11) ? 1 : 0) && llllIlIlIlI(jG ? 1 : 0)) {
                            if (llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[14])) {
                                AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[55]];
                                Movement.walkTo(jB);
                                "".length();
                                Time.sleepTicks(lIIlIIlll[0]);
                                "".length();
                            }
                            if (llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[14])) {
                                C0006g.a(lIIlIIIll[lIIlIIlll[56]], bR);
                                List options = Dialog.getOptions();
                                if (llllIlIlIlI(options.isEmpty() ? 1 : 0)) {
                                    int i = lIIlIIlll[1];
                                    while (llllIlIlIIl(i, options.size())) {
                                        if (llllIlIlIII(((Widget) options.get(i)).getText().contains(lIIlIIIll[lIIlIIlll[57]]) ? 1 : 0)) {
                                            System.out.println(lIIlIIIll[lIIlIIlll[58]]);
                                            jG = lIIlIIlll[0];
                                        }
                                        i++;
                                        "".length();
                                        if ((((230 ^ 144) ^ (91 ^ 27)) & (((189 ^ 137) ^ "  ".length()) ^ (-" ".length()))) > " ".length()) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jB), lIIlIIlll[20]) && llllIlIlIlI(jG ? 1 : 0)) {
                    String[] strArr12 = new String[lIIlIIlll[0]];
                    strArr12[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[59]];
                    if (llllIlIlIII(Inventory.contains(strArr12) ? 1 : 0)) {
                        String[] strArr13 = new String[lIIlIIlll[0]];
                        strArr13[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[60]];
                        if (llllIlIlIII(Inventory.contains(strArr13) ? 1 : 0)) {
                            C0006g.a(lIIlIIIll[lIIlIIlll[61]], bR);
                            List options2 = Dialog.getOptions();
                            if (llllIlIlIlI(options2.isEmpty() ? 1 : 0)) {
                                int i2 = lIIlIIlll[1];
                                while (llllIlIlIIl(i2, options2.size())) {
                                    if (llllIlIlIII(((Widget) options2.get(i2)).getText().contains(lIIlIIIll[lIIlIIlll[62]]) ? 1 : 0)) {
                                        System.out.println(lIIlIIIll[lIIlIIlll[63]]);
                                        jG = lIIlIIlll[0];
                                    }
                                    i2++;
                                    "".length();
                                    if ("   ".length() < "   ".length()) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                if (llllIlIlIII(jG ? 1 : 0)) {
                    String[] strArr14 = new String[lIIlIIlll[0]];
                    strArr14[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[64]];
                    if (llllIlIlIII(Inventory.contains(strArr14) ? 1 : 0)) {
                        String[] strArr15 = new String[lIIlIIlll[0]];
                        strArr15[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[65]];
                        if (llllIlIlIII(Inventory.contains(strArr15) ? 1 : 0)) {
                            if (llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(jF), lIIlIIlll[16])) {
                                if (llllIlIlIII(Inventory.contains(item3 -> {
                                    return item3.getName().contains(lIIlIIIll[lIIlIIlll[101]]);
                                }) ? 1 : 0)) {
                                    Inventory.getFirst(item4 -> {
                                        return item4.getName().contains(lIIlIIIll[lIIlIIlll[100]]);
                                    }).interact(lIIlIIIll[lIIlIIlll[66]]);
                                }
                                if (llllIlIlIII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr16 = new String[lIIlIIlll[0]];
                                strArr16[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[67]];
                                C0006g.a(strArr16);
                                AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[68]];
                                Movement.walkTo(jF);
                                "".length();
                                Time.sleepTicks(lIIlIIlll[0]);
                                "".length();
                            }
                            if (llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(jF), lIIlIIlll[16])) {
                                C0006g.a(lIIlIIIll[lIIlIIlll[69]], bR);
                            }
                        }
                    }
                }
            }
            if (!llllIllIIIl(C0004e.j(lIIlIIlll[2]), lIIlIIlll[57]) || llllIllIIII(C0004e.j(lIIlIIlll[2]), lIIlIIlll[58])) {
                String[] strArr17 = new String[lIIlIIlll[0]];
                strArr17[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[70]];
                if (llllIlIlIII(Inventory.contains(strArr17) ? 1 : 0)) {
                    WorldArea worldArea = new WorldArea(lIIlIIlll[71], lIIlIIlll[72], lIIlIIlll[24], lIIlIIlll[18], lIIlIIlll[1]);
                    C0006g.a(bR);
                    if (llllIlIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[73]];
                        Movement.walkTo(jE);
                        "".length();
                        Time.sleepTicks(lIIlIIlll[0]);
                        "".length();
                    }
                    if (llllIlIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[74]];
                        C0006g.a(lIIlIIIll[lIIlIIlll[75]], bR, lIIlIIlll[0]);
                    }
                }
            }
            if (llllIllIIII(C0004e.j(lIIlIIlll[2]), lIIlIIlll[67])) {
                String[] strArr18 = new String[lIIlIIlll[0]];
                strArr18[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[76]];
                if (llllIlIlIII(Inventory.contains(strArr18) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[77]];
                    String[] strArr19 = new String[lIIlIIlll[0]];
                    strArr19[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[78]];
                    Item first2 = Inventory.getFirst(strArr19);
                    String[] strArr20 = new String[lIIlIIlll[0]];
                    strArr20[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[32]];
                    first2.useOn(NPCs.getNearest(strArr20));
                    Time.sleepTicks(lIIlIIlll[20]);
                    "".length();
                }
            }
            if (llllIllIIII(C0004e.j(lIIlIIlll[2]), lIIlIIlll[32])) {
                WorldArea worldArea2 = new WorldArea(lIIlIIlll[71], lIIlIIlll[72], lIIlIIlll[14], lIIlIIlll[5], lIIlIIlll[1]);
                if (llllIlIlIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[79]];
                    String[] strArr21 = new String[lIIlIIlll[0]];
                    strArr21[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[80]];
                    Item first3 = Inventory.getFirst(strArr21);
                    String[] strArr22 = new String[lIIlIIlll[0]];
                    strArr22[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[81]];
                    first3.useOn(TileObjects.getNearest(strArr22));
                    Time.sleepTicks(lIIlIIlll[7]);
                    "".length();
                }
                if (llllIlIlIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(lIIlIIIll[lIIlIIlll[82]], bR);
                }
            }
            if (llllIllIIII(C0004e.j(lIIlIIlll[2]), lIIlIIlll[83])) {
                if (llllIlIlllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIIlIIlll[18])) {
                    if (llllIlIlIII(new WorldArea(lIIlIIlll[71], lIIlIIlll[72], lIIlIIlll[14], lIIlIIlll[5], lIIlIIlll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlIlIlI(Equipment.contains(C0005f.aR) ? 1 : 0)) {
                        int[] iArr10 = new int[lIIlIIlll[0]];
                        iArr10[lIIlIIlll[1]] = lIIlIIlll[9];
                        if (llllIlIlIII(Inventory.contains(iArr10) ? 1 : 0)) {
                            int[] iArr11 = new int[lIIlIIlll[0]];
                            iArr11[lIIlIIlll[1]] = lIIlIIlll[9];
                            Inventory.getFirst(iArr11).interact(lIIlIIIll[lIIlIIlll[84]]);
                            Time.sleepTicks(C0004e.c(lIIlIIlll[16], lIIlIIlll[20]));
                            "".length();
                        }
                    }
                    if (llllIlIlIII(new WorldArea(lIIlIIlll[51], lIIlIIlll[85], lIIlIIlll[52], lIIlIIlll[55], lIIlIIlll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llllIlIllll(Players.getLocal().getWorldLocation().getX(), lIIlIIlll[86])) {
                        AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[87]];
                        String[] strArr23 = new String[lIIlIIlll[0]];
                        strArr23[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[88]];
                        TileObjects.getNearest(strArr23).interact(lIIlIIIll[lIIlIIlll[89]]);
                        Time.sleepTicks(C0004e.c(lIIlIIlll[5], lIIlIIlll[16]));
                        "".length();
                    }
                    AccBuilderEasyClues.c = lIIlIIIll[lIIlIIlll[90]];
                    Movement.walkTo(bX);
                    "".length();
                    Time.sleepTicks(lIIlIIlll[0]);
                    "".length();
                }
                if (llllIlIllll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIlIIlll[18])) {
                    if (llllIlIlIIl(cl, lIIlIIlll[0])) {
                        an.pG += lIIlIIlll[0];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIlIIlll[0];
                        an.pG = lIIlIIlll[1];
                        cm = lIIlIIlll[1];
                    }
                    C0006g.a(lIIlIIIll[lIIlIIlll[91]], bR);
                }
            }
            C0006g.a(new String[lIIlIIlll[1]]);
        }
    }

    private static int llllIlIIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        llllIlIIllI();
        llllIlIIlIl();
        jA = lIIlIIlll[2];
        bv = new ArrayList();
        bX = new WorldPoint(lIIlIIlll[104], lIIlIIlll[105], lIIlIIlll[1]);
        jB = new WorldPoint(lIIlIIlll[106], lIIlIIlll[107], lIIlIIlll[1]);
        jC = new WorldPoint(lIIlIIlll[108], lIIlIIlll[109], lIIlIIlll[1]);
        jD = new WorldPoint(lIIlIIlll[110], lIIlIIlll[111], lIIlIIlll[1]);
        jE = new WorldPoint(lIIlIIlll[112], lIIlIIlll[113], lIIlIIlll[1]);
        jF = new WorldPoint(lIIlIIlll[114], lIIlIIlll[115], lIIlIIlll[1]);
        String[] strArr = new String[lIIlIIlll[34]];
        strArr[lIIlIIlll[1]] = lIIlIIIll[lIIlIIlll[116]];
        strArr[lIIlIIlll[0]] = lIIlIIIll[lIIlIIlll[117]];
        strArr[lIIlIIlll[4]] = lIIlIIIll[lIIlIIlll[118]];
        strArr[lIIlIIlll[7]] = lIIlIIIll[lIIlIIlll[119]];
        strArr[lIIlIIlll[5]] = lIIlIIIll[lIIlIIlll[120]];
        strArr[lIIlIIlll[14]] = lIIlIIIll[lIIlIIlll[121]];
        strArr[lIIlIIlll[16]] = lIIlIIIll[lIIlIIlll[122]];
        strArr[lIIlIIlll[18]] = lIIlIIIll[lIIlIIlll[123]];
        strArr[lIIlIIlll[20]] = lIIlIIIll[lIIlIIlll[124]];
        strArr[lIIlIIlll[22]] = lIIlIIIll[lIIlIIlll[125]];
        strArr[lIIlIIlll[24]] = lIIlIIIll[lIIlIIlll[126]];
        strArr[lIIlIIlll[25]] = lIIlIIIll[lIIlIIlll[127]];
        strArr[lIIlIIlll[8]] = lIIlIIIll[lIIlIIlll[128]];
        bR = strArr;
    }

    private static boolean llllIllIIlI(int i, int i2) {
        return i >= i2;
    }
}
