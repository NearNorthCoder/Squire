package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.u  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/u.class */
public class C0020u implements S {
    public static final /* synthetic */ WorldPoint dE;
    public static final /* synthetic */ WorldPoint dv;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ String[] bQ;
    public static final /* synthetic */ WorldPoint dB;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint dy;
    private static /* synthetic */ int[] lllllIlIll;
    public static final /* synthetic */ WorldPoint dC;
    static /* synthetic */ WorldArea dG;
    public static final /* synthetic */ WorldPoint dD;
    public static final /* synthetic */ WorldPoint dA;
    static /* synthetic */ int dF;
    public static /* synthetic */ List<C0003d> bu;
    public static final /* synthetic */ WorldPoint dz;
    static /* synthetic */ WorldArea dH;
    public static final /* synthetic */ WorldPoint dw;
    private static /* synthetic */ String[] lllllIlIII;
    public static final /* synthetic */ WorldPoint dx;
    static /* synthetic */ int ck;

    private static boolean llIlIlIIllIll(int i, int i2) {
        return i != i2;
    }

    private static boolean llIlIlIIllIII(Object obj) {
        return obj != null;
    }

    private static boolean llIlIlIIlIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIlIIlIlII(int i) {
        return i != 0;
    }

    private static boolean llIlIlIIlIllI(int i) {
        return i == 0;
    }

    private static boolean llIlIlIIlIlll(int i, int i2) {
        return i >= i2;
    }

    private static void llIlIlIIlIIIl() {
        lllllIlIII = new String[lllllIlIll[140]];
        lllllIlIII[lllllIlIll[1]] = llIlIIlllllIl("Iw4sGAYNAiZRFxAeKx8SRQ42FBgWS2ICAgwTIRkcCwBiExQGDGIFGkUWNxQGEQ==", "egBqu");
        lllllIlIII[lllllIlIll[0]] = llIlIIllllllI("yy7Nz09z/rU=", "CGzot");
        lllllIlIII[lllllIlIll[3]] = llIlIIllllllI("eyVjn8pOgQiy6o9dgOvW/Q==", "UyNlL");
        lllllIlIII[lllllIlIll[5]] = llIlIIlllllIl("OBMNLTYZHARpOBEcCCA0Fw==", "prcIZ");
        lllllIlIII[lllllIlIll[6]] = llIlIIllllllI("c4n9wm/UcWueIkSZfiwFqi5uUhQ1DCdYSMx2XWA0ycknPQKRdFs23UC5Qn3lvZZ2", "rUZmX");
        lllllIlIII[lllllIlIll[15]] = llIlIIlllllIl("NTF1AAEHdDgIABE9OwZTEyEwEgdCJyARAw49MBJfQiciCAcBPDwPFEIgOkExNw0cLzQ=", "bTUas");
        lllllIlIII[lllllIlIll[12]] = llIlIIlllllll("sq84w6l8+jI=", "ELXTD");
        lllllIlIII[lllllIlIll[16]] = llIlIIlllllIl("HScR", "XFegK");
        lllllIlIII[lllllIlIll[19]] = llIlIIllllllI("MVkeMXf6SoadLENpF1tf6A==", "AMicK");
        lllllIlIII[lllllIlIll[25]] = llIlIIlllllll("2Liiyhrof6Duhf6CogLpm8I21DfSJTFl", "ojKMg");
        lllllIlIII[lllllIlIll[20]] = llIlIIlllllll("fcOePm/UNPd5JeuaJHHrq4uDzf4QKjU4", "WnLDQ");
        lllllIlIII[lllllIlIll[27]] = llIlIIllllllI("S6f/GztZhsCmPYf4srlA1Q==", "noVFR");
        lllllIlIII[lllllIlIll[28]] = llIlIIlllllll("nPO1h+NbeVw=", "Ypnoi");
        lllllIlIII[lllllIlIll[23]] = llIlIIlllllIl("NxQQHA==", "xdurO");
        lllllIlIII[lllllIlIll[29]] = llIlIIlllllll("BMw6t5Ap27U=", "yybXy");
        lllllIlIII[lllllIlIll[30]] = llIlIIlllllIl("PBQ3KQ==", "sdRGf");
        lllllIlIII[lllllIlIll[31]] = llIlIIlllllIl("AiEoJg==", "FNGTg");
        lllllIlIII[lllllIlIll[32]] = llIlIIlllllll("r6yv8w+0FAc=", "qTpax");
        lllllIlIII[lllllIlIll[33]] = llIlIIlllllIl("AAYtOwIxBmw/BzsZKXhb", "TtLXi");
        lllllIlIII[lllllIlIll[35]] = llIlIIllllllI("KHvlaRhWSp+nw/GpO2fcKQ==", "TSyJO");
        lllllIlIII[lllllIlIll[36]] = llIlIIllllllI("Jp6chCs6iCj+ctR6ysuCAg==", "CwGhs");
        lllllIlIII[lllllIlIll[38]] = llIlIIlllllIl("CQMlaTIoQic7JyQJNjs=", "GbSIF");
        lllllIlIII[lllllIlIll[39]] = llIlIIlllllll("0c2rdiuvsxx+NJV4R6pQ0Q==", "OtqPK");
        lllllIlIII[lllllIlIll[40]] = llIlIIlllllll("n5koYNmwM4S3nBSsrG+5Hg==", "nowRu");
        lllllIlIII[lllllIlIll[41]] = llIlIIlllllll("zTEIMmt4MHo=", "gPFGK");
        lllllIlIII[lllllIlIll[42]] = llIlIIlllllIl("OgQ6AwgLETc=", "xeVoa");
        lllllIlIII[lllllIlIll[43]] = llIlIIllllllI("FOwUM5nm2jI=", "Zqosc");
        lllllIlIII[lllllIlIll[45]] = llIlIIlllllll("ckeh0d/nLKw=", "XgEOr");
        lllllIlIII[lllllIlIll[46]] = llIlIIlllllIl("WXxndw==", "iLWEK");
        lllllIlIII[lllllIlIll[47]] = llIlIIlllllll("miKtViBUkLg=", "JImsG");
        lllllIlIII[lllllIlIll[48]] = llIlIIlllllIl("SVt3Vg==", "ykGbL");
        lllllIlIII[lllllIlIll[55]] = llIlIIllllllI("1QpbL0dowG7tazHWw56QYA==", "fLwyd");
        lllllIlIII[lllllIlIll[56]] = llIlIIlllllIl("GjMTBgE1JAJLFDgtCg==", "YAfkc");
        lllllIlIII[lllllIlIll[57]] = llIlIIlllllll("EDEmfwkqJSyzthhIVbcKDg==", "FauDj");
        lllllIlIII[lllllIlIll[60]] = llIlIIllllllI("nqSz4prCaeE=", "TVTPn");
        lllllIlIII[lllllIlIll[61]] = llIlIIlllllIl("LQUNCg==", "buhdo");
        lllllIlIII[lllllIlIll[62]] = llIlIIlllllll("TzMPHRM+As4=", "kfzDq");
        lllllIlIII[lllllIlIll[63]] = llIlIIlllllIl("HSESGg==", "RQwtr");
        lllllIlIII[lllllIlIll[64]] = llIlIIlllllIl("NS01Cw==", "qBZyx");
        lllllIlIII[lllllIlIll[65]] = llIlIIlllllll("mUrA4R1fyE0=", "whLCM");
        lllllIlIII[lllllIlIll[66]] = llIlIIlllllIl("LxknNykR", "cxCSL");
        lllllIlIII[lllllIlIll[67]] = llIlIIlllllll("rpHAaB7a6bcnQhX0l3RQvg==", "SXjZZ");
        lllllIlIII[lllllIlIll[68]] = llIlIIlllllIl("JAUlCj0a", "hdAnX");
        lllllIlIII[lllllIlIll[69]] = llIlIIllllllI("N/90Q15C5wH0YNwtkX3P8A==", "thxRF");
        lllllIlIII[lllllIlIll[70]] = llIlIIlllllll("1Fva4k1oPNP4oq9jiKW1Pw==", "cuCKH");
        lllllIlIII[lllllIlIll[2]] = llIlIIlllllIl("AA4APS0nQgwmLTAW", "CboNH");
        lllllIlIII[lllllIlIll[71]] = llIlIIlllllIl("JQgnJwwCRCs8DBUQ", "fdHTi");
        lllllIlIII[lllllIlIll[72]] = llIlIIllllllI("dXsuYeKPvBo=", "sRjdk");
        lllllIlIII[lllllIlIll[73]] = llIlIIllllllI("GzrwspvApqUO0FVPezuvSQ==", "cLkuQ");
        lllllIlIII[lllllIlIll[74]] = llIlIIllllllI("mumrceqxAalB2JGjfpol3w==", "DqsCH");
        lllllIlIII[lllllIlIll[24]] = llIlIIllllllI("n42Xj0Gd5DU=", "imQKr");
        lllllIlIII[lllllIlIll[75]] = llIlIIllllllI("UPO4mTEjoeVJzZ+ic8GEmw==", "PbmTR");
        lllllIlIII[lllllIlIll[76]] = llIlIIllllllI("Sthac6+0XyAuBw7ptC1yukAlfR2XRN+p", "jkJqx");
        lllllIlIII[lllllIlIll[77]] = llIlIIllllllI("M5jef2Q6D/3OlQbAxhYncw==", "JRVfq");
        lllllIlIII[lllllIlIll[78]] = llIlIIlllllll("PE8zSqktAhM=", "ddKtF");
        lllllIlIII[lllllIlIll[79]] = llIlIIlllllll("iET0LEP/wnfuHga/tkisDA==", "dZLBc");
        lllllIlIII[lllllIlIll[80]] = llIlIIllllllI("6lfARZSSvZs=", "qCLgN");
        lllllIlIII[lllllIlIll[81]] = llIlIIlllllIl("OQolHA8USy0RBBkf", "qkKxc");
        lllllIlIII[lllllIlIll[82]] = llIlIIlllllIl("EDsPBzk=", "TIfiR");
        lllllIlIII[lllllIlIll[83]] = llIlIIlllllll("TE0MGR2jqk01zNJw8OzHEh1N/kHaq4M9", "vuDtA");
        lllllIlIII[lllllIlIll[84]] = llIlIIlllllIl("BRI+ITs2Uzo6NyI=", "QsUHU");
        lllllIlIII[lllllIlIll[85]] = llIlIIlllllIl("GjQBOWI6IEM6MDoyBik2PCkN", "UFcJB");
        lllllIlIII[lllllIlIll[86]] = llIlIIlllllIl("JhMYMA==", "rrsUH");
        lllllIlIII[lllllIlIll[87]] = llIlIIllllllI("xGGjJfzoG1QSHSn83xYlXDOIQ4NiVKPk", "FunJE");
        lllllIlIII[lllllIlIll[88]] = llIlIIllllllI("1bUrENBm2RwEazSwiWaI+g==", "MdswI");
        lllllIlIII[lllllIlIll[89]] = llIlIIllllllI("rfcf0kCXVR9MGZOE5o+LOg==", "SusFN");
        lllllIlIII[lllllIlIll[100]] = llIlIIllllllI("hwK7t9fLpTPkvL/OI+06tw==", "vVopx");
        lllllIlIII[lllllIlIll[101]] = llIlIIlllllll("lH9Y2tQJdrhHqTS8r3d4Pw==", "KRMsa");
        lllllIlIII[lllllIlIll[102]] = llIlIIlllllll("DclBXoUdUGhchdCQxeTQGA==", "Rrsaa");
        lllllIlIII[lllllIlIll[109]] = llIlIIlllllll("l56OKEeVEDC2waC1osMsmCeJIPUWKDDt", "gvggT");
        lllllIlIII[lllllIlIll[110]] = llIlIIlllllIl("MCA/PUQtL3EtASMlJTJEag==", "BIQZd");
        lllllIlIII[lllllIlIll[111]] = llIlIIlllllll("5wgIWwTz/ig=", "FLyvQ");
        lllllIlIII[lllllIlIll[130]] = llIlIIllllllI("GrJKy5yNG2W1ZF3Yi76lGIAv9w0N8taB", "WdLid");
        lllllIlIII[lllllIlIll[131]] = llIlIIlllllIl("IlYDNQwHElQ4HEsRGDsdSwIbehEOGgR0", "kvtZy");
        lllllIlIII[lllllIlIll[132]] = llIlIIllllllI("3TbZ7Miwnp8sY+aZ7zXt4rukz1WjuLKLpme2edsAri4=", "GwDbb");
        lllllIlIII[lllllIlIll[133]] = llIlIIlllllIl("C1YCJHU2AxdoODtRDC0mNl8=", "BqnHU");
        lllllIlIII[lllllIlIll[134]] = llIlIIllllllI("38zlEkYTj+n5URh/tDnrXQdBWOctcqqyg66MyJQRHVie4+56A3WnvEO5puVy2Nn16HgmBONIUxI=", "RfIpJ");
        lllllIlIII[lllllIlIll[135]] = llIlIIllllllI("P99BghDGF3U=", "bQjLV");
    }

    static {
        llIlIlIIlIIlI();
        llIlIlIIlIIIl();
        dv = new WorldPoint(lllllIlIll[112], lllllIlIll[113], lllllIlIll[1]);
        dw = new WorldPoint(lllllIlIll[114], lllllIlIll[115], lllllIlIll[1]);
        dx = new WorldPoint(lllllIlIll[116], lllllIlIll[117], lllllIlIll[1]);
        dy = new WorldPoint(lllllIlIll[118], lllllIlIll[119], lllllIlIll[1]);
        dz = new WorldPoint(lllllIlIll[120], lllllIlIll[121], lllllIlIll[1]);
        dA = new WorldPoint(lllllIlIll[122], lllllIlIll[123], lllllIlIll[1]);
        dB = new WorldPoint(lllllIlIll[124], lllllIlIll[125], lllllIlIll[1]);
        dC = new WorldPoint(lllllIlIll[124], lllllIlIll[126], lllllIlIll[1]);
        dD = new WorldPoint(lllllIlIll[127], lllllIlIll[54], lllllIlIll[1]);
        dE = new WorldPoint(lllllIlIll[128], lllllIlIll[129], lllllIlIll[1]);
        bu = new ArrayList();
        String[] strArr = new String[lllllIlIll[12]];
        strArr[lllllIlIll[1]] = lllllIlIII[lllllIlIll[130]];
        strArr[lllllIlIll[0]] = lllllIlIII[lllllIlIll[131]];
        strArr[lllllIlIll[3]] = lllllIlIII[lllllIlIll[132]];
        strArr[lllllIlIll[5]] = lllllIlIII[lllllIlIll[133]];
        strArr[lllllIlIll[6]] = lllllIlIII[lllllIlIll[134]];
        strArr[lllllIlIll[15]] = lllllIlIII[lllllIlIll[135]];
        bQ = strArr;
        dF = lllllIlIll[136];
        dG = new WorldArea(lllllIlIll[137], lllllIlIll[113], lllllIlIll[20], lllllIlIll[12], lllllIlIll[1]);
        dH = new WorldArea(lllllIlIll[138], lllllIlIll[139], lllllIlIll[48], lllllIlIll[30], lllllIlIll[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIlIIlIlll(C0004e.j(dF), lllllIlIll[25])) {
            ?? r0 = lllllIlIll[0];
            "".length();
            return 0 != 0 ? (true ^ true) & ((false ^ true) ^ true) : r0;
        }
        return lllllIlIll[1];
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            bt();
            "".length();
            if (0 != 0) {
                return ((((124 + 128) - 76) + 20) ^ (((36 + 134) - 167) + 152)) & (((240 ^ 196) ^ (74 ^ 33)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
        }
        return lllllIlIll[108];
    }

    private static boolean llIlIlIIlllII(int i, int i2) {
        return i == i2;
    }

    private static String llIlIIlllllIl(String lllllllllllllllllIlIIlIIllIIlIlI, String lllllllllllllllllIlIIlIIllIIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIlIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIlIIllIIlIIl.toCharArray();
        int lllllllllllllllllIlIIlIIllIIIllI = lllllIlIll[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllllIlIll[1];
        while (llIlIlIIlIlIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIlIIlIIllIIIllI % charArray.length]));
            "".length();
            lllllllllllllllllIlIIlIIllIIIllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllllIlIll[1];
    }

    private static boolean llIlIlIIllIlI(int i) {
        return i < 0;
    }

    private static void llIlIlIIlIIlI() {
        lllllIlIll = new int[141];
        lllllIlIll[0] = " ".length();
        lllllIlIll[1] = ((75 ^ 2) ^ " ".length()) & (((67 ^ 107) ^ (1 ^ 97)) ^ (-" ".length()));
        lllllIlIll[2] = (69 ^ 113) ^ (55 ^ 46);
        lllllIlIll[3] = "  ".length();
        lllllIlIll[4] = (-19511) & 24510;
        lllllIlIll[5] = "   ".length();
        lllllIlIll[6] = 123 ^ 127;
        lllllIlIll[7] = (-12673) & 13230;
        lllllIlIll[8] = (-((-3241) & 19647)) & (-7169) & 24574;
        lllllIlIll[9] = (-5249) & 5805;
        lllllIlIll[10] = (-15573) & 16126;
        lllllIlIll[11] = (-((-3175) & 27767)) & (-6153) & 32255;
        lllllIlIll[12] = 53 ^ 51;
        lllllIlIll[13] = (-((-1605) & 26213)) & (-25) & 32639;
        lllllIlIll[14] = (-13898) & 16331;
        lllllIlIll[15] = 198 ^ 195;
        lllllIlIll[16] = (188 ^ 158) ^ (33 ^ 4);
        lllllIlIll[17] = (-19459) & 32083;
        lllllIlIll[18] = (-((-12547) & 31111)) & (-1) & 18943;
        lllllIlIll[19] = (73 ^ 46) ^ (119 ^ 24);
        lllllIlIll[20] = 17 ^ 27;
        lllllIlIll[21] = (-5130) & 5629;
        lllllIlIll[22] = (-10785) & 12284;
        lllllIlIll[23] = (((151 + 52) - 67) + 27) ^ (((89 + 17) - 22) + 90);
        lllllIlIll[24] = (87 ^ 42) ^ (23 ^ 88);
        lllllIlIll[25] = 175 ^ 166;
        lllllIlIll[26] = (-4) & 603;
        lllllIlIll[27] = (8 ^ 60) ^ (43 ^ 20);
        lllllIlIll[28] = 109 ^ 97;
        lllllIlIll[29] = 4 ^ 10;
        lllllIlIll[30] = (((39 + 61) - (-43)) + 37) ^ (((56 + 98) - (-9)) + 24);
        lllllIlIll[31] = 88 ^ 72;
        lllllIlIll[32] = 7 ^ 22;
        lllllIlIll[33] = 98 ^ 112;
        lllllIlIll[34] = (-((-1111) & 30175)) & (-3073) & 32735;
        lllllIlIll[35] = 86 ^ 69;
        lllllIlIll[36] = (242 ^ 168) ^ (224 ^ 174);
        lllllIlIll[37] = (-((-1041) & 31925)) & (-1025) & 32509;
        lllllIlIll[38] = (85 ^ 95) ^ (46 ^ 49);
        lllllIlIll[39] = 4 ^ 18;
        lllllIlIll[40] = (71 ^ 26) ^ (230 ^ 172);
        lllllIlIll[41] = 28 ^ 4;
        lllllIlIll[42] = (((3 + 31) - (-82)) + 11) ^ (85 ^ 51);
        lllllIlIll[43] = 43 ^ 49;
        lllllIlIll[44] = (-1026) & 1627;
        lllllIlIll[45] = 125 ^ 102;
        lllllIlIll[46] = (((118 + 128) - 108) + 9) ^ (((27 + 87) - (-22)) + 7);
        lllllIlIll[47] = (139 ^ 189) ^ (4 ^ 47);
        lllllIlIll[48] = (141 ^ 135) ^ (104 ^ 124);
        lllllIlIll[49] = (-((-15169) & 32629)) & (-12289) & 32253;
        lllllIlIll[50] = (-((-11986) & 32731)) & (-1) & 23999;
        lllllIlIll[51] = (-13364) & 15863;
        lllllIlIll[52] = (-((-11521) & 16141)) & (-24577) & 32447;
        lllllIlIll[53] = (-22049) & 24550;
        lllllIlIll[54] = (-28995) & 32247;
        lllllIlIll[55] = 134 ^ 153;
        lllllIlIll[56] = 5 ^ 37;
        lllllIlIll[57] = (((155 + 16) - 44) + 63) ^ (((134 + 41) - 73) + 57);
        lllllIlIll[58] = (-21013) & 23519;
        lllllIlIll[59] = (-((-3109) & 24167)) & (-5) & 24319;
        lllllIlIll[60] = (61 ^ 119) ^ (197 ^ 173);
        lllllIlIll[61] = (154 ^ 151) ^ (158 ^ 176);
        lllllIlIll[62] = (((72 + 121) - 165) + 118) ^ (((65 + 142) - 45) + 20);
        lllllIlIll[63] = (79 ^ 11) ^ (27 ^ 122);
        lllllIlIll[64] = (((134 + 123) - 243) + 145) ^ (((135 + 161) - 170) + 59);
        lllllIlIll[65] = 152 ^ 191;
        lllllIlIll[66] = (80 ^ 15) ^ (74 ^ 61);
        lllllIlIll[67] = 185 ^ 144;
        lllllIlIll[68] = (163 ^ 177) ^ (165 ^ 157);
        lllllIlIll[69] = (110 ^ 42) ^ (71 ^ 40);
        lllllIlIll[70] = 77 ^ 97;
        lllllIlIll[71] = (187 ^ 128) ^ (88 ^ 77);
        lllllIlIll[72] = 109 ^ 66;
        lllllIlIll[73] = 91 ^ 107;
        lllllIlIll[74] = (73 ^ 37) ^ (23 ^ 74);
        lllllIlIll[75] = 117 ^ 70;
        lllllIlIll[76] = (186 ^ 192) ^ (5 ^ 75);
        lllllIlIll[77] = (53 ^ 117) ^ (111 ^ 26);
        lllllIlIll[78] = 145 ^ 167;
        lllllIlIll[79] = 57 ^ 14;
        lllllIlIll[80] = 120 ^ 64;
        lllllIlIll[81] = (136 ^ 145) ^ (140 ^ 172);
        lllllIlIll[82] = 163 ^ 153;
        lllllIlIll[83] = (((64 + 62) - 95) + 111) ^ (((169 + 3) - 62) + 71);
        lllllIlIll[84] = 70 ^ 122;
        lllllIlIll[85] = (75 ^ 110) ^ (145 ^ 137);
        lllllIlIll[86] = (((165 + 46) - 173) + 135) ^ (((35 + 111) - 115) + 116);
        lllllIlIll[87] = (((27 + 140) - 75) + 58) ^ (((14 + 140) - 38) + 53);
        lllllIlIll[88] = (((65 + 231) - 114) + 54) ^ (((88 + 20) - 20) + 84);
        lllllIlIll[89] = 17 ^ 80;
        lllllIlIll[90] = (-4633) & 7034;
        lllllIlIll[91] = (-((-936) & 30639)) & (-1) & 32759;
        lllllIlIll[92] = (((8 ^ 26) + (((71 + 148) - 151) + 151)) - (100 ^ 18)) + (214 ^ 185);
        lllllIlIll[93] = (((((80 + 97) - 94) + 67) + (151 ^ 144)) - (61 ^ 11)) + (38 ^ 21);
        lllllIlIll[94] = (-((-139) & 20639)) & (-521) & 23551;
        lllllIlIll[95] = (-((-8483) & 9007)) & (-28833) & 32511;
        lllllIlIll[96] = (-24577) & 27095;
        lllllIlIll[97] = (-((-19737) & 28474)) & (-4353) & 16243;
        lllllIlIll[98] = (-17926) & 20439;
        lllllIlIll[99] = (-((-11074) & 31725)) & (-8193) & 31999;
        lllllIlIll[100] = (3 ^ 90) ^ (163 ^ 184);
        lllllIlIll[101] = (170 ^ 195) ^ (5 ^ 47);
        lllllIlIll[102] = 128 ^ 196;
        lllllIlIll[103] = (((112 ^ 75) + (77 ^ 9)) - (249 ^ 128)) + ((152 + 163) - 172) + 51;
        lllllIlIll[104] = (-4099) & 16078;
        lllllIlIll[105] = (-((-1289) & 3402)) & (-5125) & 32237;
        lllllIlIll[106] = (-1382) & 16381;
        lllllIlIll[107] = (-((-4295) & 13511)) & (-18441) & 28556;
        lllllIlIll[108] = (181 ^ 131) ^ (77 ^ 31);
        lllllIlIll[109] = 87 ^ 18;
        lllllIlIll[110] = 4 ^ 66;
        lllllIlIll[111] = 214 ^ 145;
        lllllIlIll[112] = (-16917) & 19455;
        lllllIlIll[113] = (-((-17987) & 18243)) & (-33) & 3455;
        lllllIlIll[114] = (-((-19) & 9271)) & (-20483) & 32254;
        lllllIlIll[115] = (-((-3587) & 32635)) & (-513) & 32767;
        lllllIlIll[116] = (-17443) & 19966;
        lllllIlIll[117] = (-8708) & 11963;
        lllllIlIll[118] = (-((-3326) & 20223)) & (-33) & 19455;
        lllllIlIll[119] = (-4361) & 7612;
        lllllIlIll[120] = (-((-67) & 13951)) & (-16385) & 32767;
        lllllIlIll[121] = (-4417) & 7676;
        lllllIlIll[122] = (-((-2501) & 15855)) & (-22) & 15871;
        lllllIlIll[123] = (-((-3234) & 12005)) & (-16665) & 28671;
        lllllIlIll[124] = (-((-25053) & 30206)) & (-17) & 7679;
        lllllIlIll[125] = (-87) & 3295;
        lllllIlIll[126] = (-((-8871) & 29679)) & (-8193) & 32250;
        lllllIlIll[127] = (-((-18575) & 20143)) & (-16409) & 20479;
        lllllIlIll[128] = (-((-10170) & 14335)) & (-545) & 7167;
        lllllIlIll[129] = (-((-14249) & 30650)) & (-8973) & 28671;
        lllllIlIll[130] = (((91 + 173) - 127) + 61) ^ (((141 + 129) - 177) + 49);
        lllllIlIll[131] = (72 ^ 70) ^ (204 ^ 139);
        lllllIlIll[132] = (((52 + 36) - (-125)) + 41) ^ (((117 + 29) - 98) + 132);
        lllllIlIll[133] = 212 ^ 159;
        lllllIlIll[134] = 139 ^ 199;
        lllllIlIll[135] = (52 ^ 70) ^ (255 ^ 192);
        lllllIlIll[136] = 12 ^ 99;
        lllllIlIll[137] = (-16913) & 19450;
        lllllIlIll[138] = (-((-6169) & 32319)) & (-9) & 28671;
        lllllIlIll[139] = (-((-2665) & 27247)) & (-4641) & 32383;
        lllllIlIll[140] = (93 ^ 121) ^ (112 ^ 26);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[lllllIlIll[5]];
        iArr[lllllIlIll[1]] = lllllIlIll[13];
        iArr[lllllIlIll[0]] = lllllIlIll[11];
        iArr[lllllIlIll[3]] = lllllIlIll[14];
        int i = lllllIlIll[1];
        while (llIlIlIIlIlIl(i, iArr.length)) {
            int[] iArr2 = new int[lllllIlIll[0]];
            iArr2[lllllIlIll[1]] = iArr[i];
            if (llIlIlIIlIllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllllIlIll[1];
            }
            i++;
            "".length();
            if ("   ".length() < (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllllIlIll[0];
    }

    private static boolean llIlIlIIllIIl(int i) {
        return i > 0;
    }

    private static String llIlIIlllllll(String lllllllllllllllllIlIIlIIlIllIlIl, String lllllllllllllllllIlIIlIIlIllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlIIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIlIIlIllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIlIIlIllIlll.init(lllllIlIll[3], secretKeySpec);
            return new String(lllllllllllllllllIlIIlIIlIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlIIlIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIlIIlIllIllI) {
            lllllllllllllllllIlIIlIIlIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIIlllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIlIIllllI(int i, int i2) {
        return i <= i2;
    }

    private static int llIlIlIIlIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String llIlIIllllllI(String lllllllllllllllllIlIIlIIlIlIlIII, String lllllllllllllllllIlIIlIIlIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllllIlIIlIIlIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlIIlIlIIlll.getBytes(StandardCharsets.UTF_8)), lllllIlIll[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIlIll[3], lllllllllllllllllIlIIlIIlIlIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlIIlIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIlIIlIlIlIIl) {
            lllllllllllllllllIlIIlIIlIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static void bu() {
        if (llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dv), lllllIlIll[3])) {
            AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[89]];
            WorldArea worldArea = new WorldArea(lllllIlIll[90], lllllIlIll[91], lllllIlIll[92], lllllIlIll[93], lllllIlIll[1]);
            new WorldPoint(lllllIlIll[94], lllllIlIll[95], lllllIlIll[1]);
            WorldArea worldArea2 = new WorldArea(lllllIlIll[96], lllllIlIll[97], lllllIlIll[35], lllllIlIll[6], lllllIlIll[1]);
            WorldArea worldArea3 = new WorldArea(lllllIlIll[98], lllllIlIll[99], lllllIlIll[19], lllllIlIll[15], lllllIlIll[1]);
            if (llIlIlIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (llIlIlIIlIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Equipment.getFirst(C0005f.aM).interact(lllllIlIII[lllllIlIll[100]]);
                Time.sleepTicks(lllllIlIll[15]);
                "".length();
            }
            if (llIlIlIIlIllI(C0021v.eW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(C0021v.eX);
                "".length();
            }
            if (llIlIlIIlIlII(C0021v.eW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIIlIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIIlIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIIlIllI(dH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Walker.stepAlong(List.of((Object[]) C0021v.eb));
                "".length();
                Time.sleepTicks(lllllIlIll[0]);
                "".length();
            }
            if (!llIlIlIIlIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIlIlIIlIlII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr = new String[lllllIlIll[0]];
                strArr[lllllIlIll[1]] = lllllIlIII[lllllIlIll[101]];
                TileObjects.getNearest(strArr).interact(lllllIlIII[lllllIlIll[102]]);
                Time.sleepTicks(lllllIlIll[6]);
                "".length();
            }
            if ((!llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIlIlIIlIlII(dH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dv), lllllIlIll[3])) {
                Movement.walkTo(dv);
                "".length();
                Time.sleepTicks(lllllIlIll[0]);
                "".length();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b2, code lost:
        if (llIlIlIIlIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIll[8]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f5, code lost:
        if (llIlIlIIlIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIll[8]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0238, code lost:
        if (llIlIlIIlIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIll[8]) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027b, code lost:
        if (llIlIlIIlIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIll[12]) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027e, code lost:
        ae();
        java.lang.System.out.println(e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIII[e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIll[6]]);
        e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.bs = e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0299, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v635, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v656, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v689, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bt() {
        if (llIlIlIIlIlII(bs ? 1 : 0)) {
            C0001b.a(bu);
            if (llIlIlIIlIlIl(bu.size(), lllllIlIll[0])) {
                System.out.println(lllllIlIII[lllllIlIll[1]]);
                bs = lllllIlIll[1];
            }
        }
        if (llIlIlIIlIllI(bs ? 1 : 0)) {
            if (llIlIlIIlIlIl(Skills.getLevel(Skill.PRAYER), lllllIlIll[2])) {
                aa.eA();
            }
            if (llIlIlIIlIlll(Skills.getLevel(Skill.PRAYER), lllllIlIll[2]) && llIlIlIIlIlII(Inventory.contains(C0005f.aZ) ? 1 : 0)) {
                Inventory.getFirst(C0005f.aZ).interact(lllllIlIII[lllllIlIll[0]]);
            }
            if (llIlIlIIlIllI(aa() ? 1 : 0) && llIlIlIIlIlIl(C0004e.j(dF), lllllIlIll[0]) && llIlIlIIlIlll(Skills.getLevel(Skill.PRAYER), lllllIlIll[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIlIIllIII(nearest) && llIlIlIIlIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[3]];
                    C0000a.a(nearest);
                }
                if (llIlIlIIllIII(nearest) && llIlIlIIlIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllllIlIll[4]);
                        "".length();
                    }
                    if (llIlIlIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[5]];
                        if (llIlIlIIllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllllIlIll[6]);
                            "".length();
                        }
                        if (llIlIlIIllIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllllIlIll[3]);
                            "".length();
                        }
                        int[] iArr = new int[lllllIlIll[0]];
                        iArr[lllllIlIll[1]] = lllllIlIll[7];
                        if (llIlIlIIlIlII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lllllIlIll[0]];
                            iArr2[lllllIlIll[1]] = lllllIlIll[7];
                        }
                        int[] iArr3 = new int[lllllIlIll[0]];
                        iArr3[lllllIlIll[1]] = lllllIlIll[9];
                        if (llIlIlIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllllIlIll[0]];
                            iArr4[lllllIlIll[1]] = lllllIlIll[9];
                        }
                        int[] iArr5 = new int[lllllIlIll[0]];
                        iArr5[lllllIlIll[1]] = lllllIlIll[10];
                        if (llIlIlIIlIlII(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lllllIlIll[0]];
                            iArr6[lllllIlIll[1]] = lllllIlIll[10];
                        }
                        int[] iArr7 = new int[lllllIlIll[0]];
                        iArr7[lllllIlIll[1]] = lllllIlIll[11];
                        if (llIlIlIIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lllllIlIll[0]];
                            iArr8[lllllIlIll[1]] = lllllIlIll[11];
                        }
                        int[] iArr9 = new int[lllllIlIll[12]];
                        iArr9[lllllIlIll[1]] = lllllIlIll[13];
                        iArr9[lllllIlIll[0]] = lllllIlIll[11];
                        iArr9[lllllIlIll[3]] = lllllIlIll[14];
                        iArr9[lllllIlIll[5]] = lllllIlIll[10];
                        iArr9[lllllIlIll[6]] = lllllIlIll[9];
                        iArr9[lllllIlIll[15]] = lllllIlIll[7];
                        if (llIlIlIIlIllI(C0004e.b(iArr9) ? 1 : 0)) {
                            ae();
                            System.out.println(lllllIlIII[lllllIlIll[15]]);
                            bs = lllllIlIll[0];
                            return;
                        }
                        while (llIlIlIIlIllI(C0019t.bl() ? 1 : 0)) {
                            C0019t.bj();
                            Time.sleepTicks(lllllIlIll[0]);
                            "".length();
                            "".length();
                            if ((true ^ true) & ((true ^ true) ^ true)) {
                                return;
                            }
                        }
                        if (llIlIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lllllIlIll[12]);
                            "".length();
                        }
                        int[] iArr10 = new int[lllllIlIll[16]];
                        iArr10[lllllIlIll[1]] = lllllIlIll[13];
                        iArr10[lllllIlIll[0]] = lllllIlIll[11];
                        iArr10[lllllIlIll[3]] = lllllIlIll[14];
                        iArr10[lllllIlIll[5]] = lllllIlIll[17];
                        iArr10[lllllIlIll[6]] = lllllIlIll[10];
                        iArr10[lllllIlIll[15]] = lllllIlIll[9];
                        iArr10[lllllIlIll[12]] = lllllIlIll[7];
                        if (llIlIlIIlIlII(C0004e.b(iArr10) ? 1 : 0)) {
                            C0000a.a(lllllIlIll[17], lllllIlIll[6]);
                            C0000a.b(C0005f.aM, lllllIlIll[0]);
                            C0000a.a(lllllIlIll[11], lllllIlIll[12]);
                            C0000a.a(lllllIlIll[18], lllllIlIll[19]);
                            C0000a.a(lllllIlIll[14], lllllIlIll[5]);
                            C0000a.a(lllllIlIll[13], lllllIlIll[20]);
                            int[] iArr11 = new int[lllllIlIll[0]];
                            iArr11[lllllIlIll[1]] = lllllIlIll[7];
                            if (llIlIlIIlIlII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lllllIlIll[0]];
                                iArr12[lllllIlIll[1]] = lllllIlIll[7];
                                if (llIlIlIIlIlIl(Inventory.getCount(iArr12), lllllIlIll[0])) {
                                    Bank.withdraw(lllllIlIll[7], lllllIlIll[21], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllllIlIll[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lllllIlIll[0]];
                                        iArr13[lllllIlIll[1]] = lllllIlIll[7];
                                        if (llIlIlIIllIIl(Inventory.getCount(iArr13))) {
                                            ?? r0 = lllllIlIll[0];
                                            "".length();
                                            return ((122 ^ 97) & ((9 ^ 18) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllllIlIll[1];
                                    }, lllllIlIll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr13 = new int[lllllIlIll[0]];
                            iArr13[lllllIlIll[1]] = lllllIlIll[10];
                            if (llIlIlIIlIlII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lllllIlIll[0]];
                                iArr14[lllllIlIll[1]] = lllllIlIll[10];
                                if (llIlIlIIlIlIl(Inventory.getCount(iArr14), lllllIlIll[0])) {
                                    Bank.withdraw(lllllIlIll[10], lllllIlIll[22], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lllllIlIll[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lllllIlIll[0]];
                                        iArr15[lllllIlIll[1]] = lllllIlIll[10];
                                        if (llIlIlIIllIIl(Inventory.getCount(iArr15))) {
                                            ?? r0 = lllllIlIll[0];
                                            "".length();
                                            return (128 ^ 132) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lllllIlIll[1];
                                    }, lllllIlIll[4]);
                                    "".length();
                                }
                            }
                            if (llIlIlIIlIlIl(Skills.getLevel(Skill.MAGIC), lllllIlIll[23])) {
                                C0000a.a(lllllIlIll[9], lllllIlIll[21]);
                            }
                        }
                    }
                }
            }
            if (llIlIlIIlIlII(Inventory.contains(C0005f.aU) ? 1 : 0) && llIlIlIIlIlIl(Movement.getRunEnergy(), lllllIlIll[24])) {
                Inventory.getFirst(C0005f.aU).interact(lllllIlIII[lllllIlIll[12]]);
                Time.sleepTicks(lllllIlIll[0]);
                "".length();
            }
            if (llIlIlIIllIlI(llIlIlIIlIIll(C0004e.u(), 50.0d))) {
                int[] iArr15 = new int[lllllIlIll[0]];
                iArr15[lllllIlIll[1]] = lllllIlIll[18];
                if (llIlIlIIlIlII(Inventory.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[lllllIlIll[0]];
                    iArr16[lllllIlIll[1]] = lllllIlIll[18];
                    Inventory.getFirst(iArr16).interact(lllllIlIII[lllllIlIll[16]]);
                    Time.sleepTicks(lllllIlIll[0]);
                    "".length();
                }
            }
            if (llIlIlIIlIlII(aa() ? 1 : 0) && llIlIlIIlIlIl(C0004e.j(dF), lllllIlIll[0])) {
                if (llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    bu();
                }
                if (llIlIlIIlIlII(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(lllllIlIII[lllllIlIll[19]], bQ);
                }
            }
            if ((!llIlIlIIllIll(C0004e.j(dF), lllllIlIll[0]) || !llIlIlIIllIll(C0004e.j(dF), lllllIlIll[3]) || llIlIlIIlllII(C0004e.j(dF), lllllIlIll[5])) && llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIIlIllI(dH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dw), lllllIlIll[19]) && llIlIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[25]];
                    Movement.walkTo(dw);
                    "".length();
                    Time.sleepTicks(lllllIlIll[0]);
                    "".length();
                }
                if (llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dw), lllllIlIll[19])) {
                    C0006g.a(lllllIlIII[lllllIlIll[20]], bQ);
                }
            }
            if (llIlIlIIlllII(C0004e.j(dF), lllllIlIll[6])) {
                ck = lllllIlIll[1];
                if (llIlIlIIlIllI(Vars.getBit(lllllIlIll[26]))) {
                    if (llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dy), lllllIlIll[6])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[27]];
                        Movement.walkTo(dy);
                        "".length();
                        Time.sleepTicks(lllllIlIll[0]);
                        "".length();
                    }
                    if (llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dy), lllllIlIll[6])) {
                        String[] strArr = new String[lllllIlIll[0]];
                        strArr[lllllIlIll[1]] = lllllIlIII[lllllIlIll[28]];
                        TileObject nearest2 = TileObjects.getNearest(strArr);
                        String[] strArr2 = new String[lllllIlIll[0]];
                        strArr2[lllllIlIll[1]] = lllllIlIII[lllllIlIll[23]];
                        if (llIlIlIIlIlII(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            String[] strArr3 = new String[lllllIlIll[0]];
                            strArr3[lllllIlIll[1]] = lllllIlIII[lllllIlIll[29]];
                            TileObjects.getNearest(strArr3).interact(lllllIlIII[lllllIlIll[30]]);
                            Time.sleepTicks(lllllIlIll[5]);
                            "".length();
                        }
                        String[] strArr4 = new String[lllllIlIll[0]];
                        strArr4[lllllIlIll[1]] = lllllIlIII[lllllIlIll[31]];
                        TileObject nearest3 = TileObjects.getNearest(strArr4);
                        String[] strArr5 = new String[lllllIlIll[0]];
                        strArr5[lllllIlIll[1]] = lllllIlIII[lllllIlIll[32]];
                        if (llIlIlIIlIllI(nearest3.hasAction(strArr5) ? 1 : 0)) {
                            C0006g.a(lllllIlIII[lllllIlIll[33]], bQ);
                        }
                    }
                }
                if (llIlIlIIlllII(Vars.getBit(lllllIlIll[26]), lllllIlIll[0]) && llIlIlIIlIllI(Vars.getBit(lllllIlIll[34]))) {
                    if (llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dz), lllllIlIll[12])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[35]];
                        Movement.walkTo(dz);
                        "".length();
                        Time.sleepTicks(lllllIlIll[0]);
                        "".length();
                    }
                    if (llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dz), lllllIlIll[12])) {
                        C0006g.a(lllllIlIII[lllllIlIll[36]], bQ);
                    }
                }
                if (llIlIlIIlllII(Vars.getBit(lllllIlIll[26]), lllllIlIll[0]) && llIlIlIIlllII(Vars.getBit(lllllIlIll[34]), lllllIlIll[0]) && llIlIlIIlIllI(Vars.getBit(lllllIlIll[37]))) {
                    if (llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dA), lllllIlIll[12])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[38]];
                        Movement.walkTo(dA);
                        "".length();
                        Time.sleepTicks(lllllIlIll[0]);
                        "".length();
                    }
                    if (llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dA), lllllIlIll[12])) {
                        C0006g.a(lllllIlIII[lllllIlIll[39]], bQ);
                    }
                }
                if (llIlIlIIlllII(Vars.getBit(lllllIlIll[26]), lllllIlIll[0]) && llIlIlIIlllII(Vars.getBit(lllllIlIll[34]), lllllIlIll[0]) && llIlIlIIlllII(Vars.getBit(lllllIlIll[37]), lllllIlIll[0])) {
                    if (llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dB), lllllIlIll[3])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[40]];
                        Movement.walkTo(dB);
                        "".length();
                        Time.sleepTicks(lllllIlIll[0]);
                        "".length();
                    }
                    if (llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dB), lllllIlIll[3])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[41]];
                        if (llIlIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr6 = new String[lllllIlIll[0]];
                            strArr6[lllllIlIll[1]] = lllllIlIII[lllllIlIll[42]];
                            TileObjects.getNearest(strArr6).interact(lllllIlIII[lllllIlIll[43]]);
                            Time.sleepTicks(lllllIlIll[5]);
                            "".length();
                        }
                        int bit = Vars.getBit(lllllIlIll[44]);
                        if (llIlIlIIlIllI(Dialog.getOptions().isEmpty() ? 1 : 0)) {
                            System.out.println("Selecting " + bit);
                            if (llIlIlIIlIllI(bit)) {
                                String[] strArr7 = new String[lllllIlIll[0]];
                                strArr7[lllllIlIll[1]] = lllllIlIII[lllllIlIll[45]];
                                Dialog.chooseOption(strArr7);
                                "".length();
                            }
                            if (llIlIlIIlllII(bit, lllllIlIll[0])) {
                                String[] strArr8 = new String[lllllIlIll[0]];
                                strArr8[lllllIlIll[1]] = lllllIlIII[lllllIlIll[46]];
                                Dialog.chooseOption(strArr8);
                                "".length();
                            }
                            if (llIlIlIIlllII(bit, lllllIlIll[3])) {
                                String[] strArr9 = new String[lllllIlIll[0]];
                                strArr9[lllllIlIll[1]] = lllllIlIII[lllllIlIll[47]];
                                Dialog.chooseOption(strArr9);
                                "".length();
                            }
                            if (llIlIlIIlllII(bit, lllllIlIll[5])) {
                                String[] strArr10 = new String[lllllIlIll[0]];
                                strArr10[lllllIlIll[1]] = lllllIlIII[lllllIlIll[48]];
                                Dialog.chooseOption(strArr10);
                                "".length();
                            }
                            Time.sleepTicks(lllllIlIll[3]);
                            "".length();
                        }
                    }
                }
            }
            if (llIlIlIIlllII(C0004e.j(dF), lllllIlIll[15])) {
                WorldArea worldArea = new WorldArea(lllllIlIll[49], lllllIlIll[50], lllllIlIll[16], lllllIlIll[15], lllllIlIll[1]);
                if (llIlIlIIlIllI(Players.getLocal().getWorldLocation().getPlane())) {
                    WorldArea worldArea2 = new WorldArea(lllllIlIll[51], lllllIlIll[50], lllllIlIll[28], lllllIlIll[12], lllllIlIll[1]);
                    WorldArea worldArea3 = new WorldArea(lllllIlIll[51], lllllIlIll[52], lllllIlIll[6], lllllIlIll[15], lllllIlIll[1]);
                    WorldArea worldArea4 = new WorldArea(lllllIlIll[53], lllllIlIll[54], lllllIlIll[6], lllllIlIll[3], lllllIlIll[1]);
                    WorldArea worldArea5 = new WorldArea(lllllIlIll[53], lllllIlIll[52], lllllIlIll[5], lllllIlIll[5], lllllIlIll[1]);
                    if (llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dC), lllllIlIll[3]) && llIlIlIIlIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIIlIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIIlIllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIlIIlIllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[55]];
                        Movement.walkTo(dC);
                        "".length();
                        Time.sleepTicks(lllllIlIll[0]);
                        "".length();
                    }
                    if (llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dC), lllllIlIll[3]) && llIlIlIIlIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr11 = new String[lllllIlIll[0]];
                        strArr11[lllllIlIll[1]] = lllllIlIII[lllllIlIll[56]];
                        TileObjects.getNearest(strArr11).interact(lllllIlIII[lllllIlIll[57]]);
                        Time.sleepTicks(lllllIlIll[3]);
                        "".length();
                    }
                    if (llIlIlIIlIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIlIll[58], lllllIlIll[59], lllllIlIll[1])), lllllIlIll[3])) {
                            Movement.walkTo(new WorldPoint(lllllIlIll[58], lllllIlIll[59], lllllIlIll[1]));
                            "".length();
                            Time.sleepTicks(lllllIlIll[0]);
                            "".length();
                        }
                        if (llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIlIll[58], lllllIlIll[59], lllllIlIll[1])), lllllIlIll[3])) {
                            String[] strArr12 = new String[lllllIlIll[0]];
                            strArr12[lllllIlIll[1]] = lllllIlIII[lllllIlIll[60]];
                            TileObject nearest4 = TileObjects.getNearest(strArr12);
                            String[] strArr13 = new String[lllllIlIll[0]];
                            strArr13[lllllIlIll[1]] = lllllIlIII[lllllIlIll[61]];
                            if (llIlIlIIlIlII(nearest4.hasAction(strArr13) ? 1 : 0)) {
                                String[] strArr14 = new String[lllllIlIll[0]];
                                strArr14[lllllIlIll[1]] = lllllIlIII[lllllIlIll[62]];
                                TileObjects.getNearest(strArr14).interact(lllllIlIII[lllllIlIll[63]]);
                                Time.sleepTicks(lllllIlIll[3]);
                                "".length();
                            }
                            String[] strArr15 = new String[lllllIlIll[0]];
                            strArr15[lllllIlIll[1]] = lllllIlIII[lllllIlIll[64]];
                            TileObject nearest5 = TileObjects.getNearest(strArr15);
                            String[] strArr16 = new String[lllllIlIll[0]];
                            strArr16[lllllIlIll[1]] = lllllIlIII[lllllIlIll[65]];
                            if (llIlIlIIlIllI(nearest5.hasAction(strArr16) ? 1 : 0)) {
                                String[] strArr17 = new String[lllllIlIll[0]];
                                strArr17[lllllIlIll[1]] = lllllIlIII[lllllIlIll[66]];
                                TileObjects.getNearest(strArr17).interact(lllllIlIII[lllllIlIll[67]]);
                                Time.sleepTicks(lllllIlIll[15]);
                                "".length();
                            }
                        }
                        if (!llIlIlIIlIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !llIlIlIIlIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !llIlIlIIlIllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIlIlIIlIlII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr18 = new String[lllllIlIll[0]];
                            strArr18[lllllIlIll[1]] = lllllIlIII[lllllIlIll[68]];
                            TileObjects.getNearest(strArr18).interact(lllllIlIII[lllllIlIll[69]]);
                            Time.sleepTicks(lllllIlIll[15]);
                            "".length();
                        }
                    }
                }
                if (llIlIlIIlllII(Players.getLocal().getWorldLocation().getPlane(), lllllIlIll[0])) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[70]];
                    String[] strArr19 = new String[lllllIlIll[0]];
                    strArr19[lllllIlIll[1]] = lllllIlIII[lllllIlIll[2]];
                    if (llIlIlIIllIII(TileObjects.getNearest(strArr19))) {
                        String[] strArr20 = new String[lllllIlIll[0]];
                        strArr20[lllllIlIll[1]] = lllllIlIII[lllllIlIll[71]];
                        TileObjects.getNearest(strArr20).interact(lllllIlIII[lllllIlIll[72]]);
                        Time.sleepTicks(lllllIlIll[15]);
                        "".length();
                    }
                    String[] strArr21 = new String[lllllIlIll[0]];
                    strArr21[lllllIlIll[1]] = lllllIlIII[lllllIlIll[73]];
                    if (llIlIlIIllIII(TileObjects.getNearest(strArr21))) {
                        String[] strArr22 = new String[lllllIlIll[0]];
                        strArr22[lllllIlIll[1]] = lllllIlIII[lllllIlIll[74]];
                        TileObjects.getNearest(strArr22).interact(lllllIlIII[lllllIlIll[24]]);
                        Time.sleepTicks(lllllIlIll[3]);
                        "".length();
                    }
                }
            }
            if (llIlIlIIlllII(C0004e.j(dF), lllllIlIll[12])) {
                if (llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    bu();
                }
                if (llIlIlIIlIlII(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(lllllIlIII[lllllIlIll[75]], bQ);
                }
            }
            if (llIlIlIIlllII(C0004e.j(dF), lllllIlIll[16])) {
                if (llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dE), lllllIlIll[25])) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[76]];
                    Movement.walkTo(dE);
                    "".length();
                    Time.sleepTicks(lllllIlIll[3]);
                    "".length();
                }
                if (llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dE), lllllIlIll[25])) {
                    if (llIlIlIIlIllI(C0010k.ac() ? 1 : 0)) {
                        C0010k.ad();
                    }
                    String[] strArr23 = new String[lllllIlIll[0]];
                    strArr23[lllllIlIll[1]] = lllllIlIII[lllllIlIll[77]];
                    NPC nearest6 = NPCs.getNearest(strArr23);
                    NPC nearest7 = NPCs.getNearest(npc -> {
                        if (llIlIlIIlIlII(npc.getName().contains(lllllIlIII[lllllIlIll[111]]) ? 1 : 0) && llIlIlIlIIIII(npc.getInteracting(), Players.getLocal())) {
                            ?? r0 = lllllIlIll[0];
                            "".length();
                            return ((213 ^ 195) & ((38 ^ 48) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllllIlIll[1];
                    });
                    if (llIlIlIIllIII(nearest6) && llIlIlIIlllll(nearest7)) {
                        String[] strArr24 = new String[lllllIlIll[0]];
                        strArr24[lllllIlIll[1]] = lllllIlIII[lllllIlIll[78]];
                        if (llIlIlIIlIllI(nearest6.hasAction(strArr24) ? 1 : 0)) {
                            C0006g.a(lllllIlIII[lllllIlIll[79]], bQ);
                        }
                        String[] strArr25 = new String[lllllIlIll[0]];
                        strArr25[lllllIlIll[1]] = lllllIlIII[lllllIlIll[80]];
                        if (llIlIlIIlIlII(nearest6.hasAction(strArr25) ? 1 : 0) && llIlIlIIlllll(Players.getLocal().getInteracting())) {
                            AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[81]];
                            if (llIlIlIIlIllI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                            }
                        }
                    }
                    if (llIlIlIIlIlIl(Prayers.getPoints(), lllllIlIll[40]) && llIlIlIIlIlII(Inventory.contains(C0005f.aR) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aR).interact(lllllIlIII[lllllIlIll[82]]);
                        Time.sleepTicks(lllllIlIll[0]);
                        "".length();
                    }
                    C0006g.a(bQ);
                }
            }
            if (llIlIlIIlllII(C0004e.j(dF), lllllIlIll[19])) {
                String[] strArr26 = new String[lllllIlIll[0]];
                strArr26[lllllIlIll[1]] = lllllIlIII[lllllIlIll[83]];
                if (llIlIlIIlIllI(Inventory.contains(strArr26) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[84]];
                    String[] strArr27 = new String[lllllIlIll[0]];
                    strArr27[lllllIlIll[1]] = lllllIlIII[lllllIlIll[85]];
                    TileItems.getNearest(strArr27).interact(lllllIlIII[lllllIlIll[86]]);
                    Time.sleepTicks(lllllIlIll[6]);
                    "".length();
                }
                String[] strArr28 = new String[lllllIlIll[0]];
                strArr28[lllllIlIll[1]] = lllllIlIII[lllllIlIll[87]];
                if (llIlIlIIlIlII(Inventory.contains(strArr28) ? 1 : 0)) {
                    if (llIlIlIIlIlII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    if (llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        bu();
                    }
                    if (llIlIlIIlIlII(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIlIlIIlIlIl(ck, lllllIlIll[0])) {
                            ac.kf += lllllIlIll[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllllIlIll[0];
                            ac.kf = lllllIlIll[1];
                            cl = lllllIlIll[1];
                        }
                        C0006g.a(lllllIlIII[lllllIlIll[88]], bQ);
                    }
                }
            }
            C0006g.a(bQ);
        }
    }

    private static boolean llIlIlIIlllll(Object obj) {
        return obj == null;
    }

    private static boolean llIlIlIlIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a9, code lost:
        if (llIlIlIIlIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIll[8]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0233, code lost:
        if (llIlIlIIlIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIll[8]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02bd, code lost:
        if (llIlIlIIlIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIll[8]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0371, code lost:
        if (llIlIlIIlIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIll[6]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIlIlIIlIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0020u.lllllIlIll[12]) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8 = new int[lllllIlIll[0]];
        iArr8[lllllIlIll[1]] = lllllIlIll[11];
        if (llIlIlIIlIlII(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lllllIlIll[0]];
            iArr9[lllllIlIll[1]] = lllllIlIll[11];
            if (llIlIlIIlIlII(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllllIlIll[0]];
                iArr10[lllllIlIll[1]] = lllllIlIll[11];
            }
            if (llIlIlIIlIllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lllllIlIII[lllllIlIll[110]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(lllllIlIll[104], lllllIlIll[15], lllllIlIll[105]));
                "".length();
            }
            iArr = new int[lllllIlIll[0]];
            iArr[lllllIlIll[1]] = lllllIlIll[14];
            if (llIlIlIIlIlII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[lllllIlIll[0]];
                iArr11[lllllIlIll[1]] = lllllIlIll[14];
                if (llIlIlIIlIlIl(Bank.getFirst(iArr11).getQuantity(), lllllIlIll[6])) {
                    int i = lllllIlIll[14];
                    int i2 = lllllIlIll[6];
                    int[] iArr12 = new int[lllllIlIll[0]];
                    iArr12[lllllIlIll[1]] = lllllIlIll[14];
                    bu.add(new C0003d(i, i2 - Bank.getFirst(iArr12).getQuantity(), lllllIlIll[106]));
                    "".length();
                }
            }
            iArr2 = new int[lllllIlIll[0]];
            iArr2[lllllIlIll[1]] = lllllIlIll[9];
            if (llIlIlIIlIlII(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr13 = new int[lllllIlIll[0]];
                iArr13[lllllIlIll[1]] = lllllIlIll[9];
                if (llIlIlIIlIlII(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[lllllIlIll[0]];
                    iArr14[lllllIlIll[1]] = lllllIlIll[9];
                }
                iArr3 = new int[lllllIlIll[0]];
                iArr3[lllllIlIll[1]] = lllllIlIll[7];
                if (llIlIlIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr15 = new int[lllllIlIll[0]];
                    iArr15[lllllIlIll[1]] = lllllIlIll[7];
                    if (llIlIlIIlIlII(Bank.contains(iArr15) ? 1 : 0)) {
                        int[] iArr16 = new int[lllllIlIll[0]];
                        iArr16[lllllIlIll[1]] = lllllIlIll[7];
                    }
                    iArr4 = new int[lllllIlIll[0]];
                    iArr4[lllllIlIll[1]] = lllllIlIll[10];
                    if (llIlIlIIlIlII(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr17 = new int[lllllIlIll[0]];
                        iArr17[lllllIlIll[1]] = lllllIlIll[10];
                        if (llIlIlIIlIlII(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lllllIlIll[0]];
                            iArr18[lllllIlIll[1]] = lllllIlIll[10];
                        }
                        iArr5 = new int[lllllIlIll[0]];
                        iArr5[lllllIlIll[1]] = lllllIlIll[14];
                        if (llIlIlIIlIllI(Bank.contains(iArr5) ? 1 : 0)) {
                            bu.add(new C0003d(lllllIlIll[14], lllllIlIll[6], lllllIlIll[106]));
                            "".length();
                        }
                        iArr6 = new int[lllllIlIll[0]];
                        iArr6[lllllIlIll[1]] = lllllIlIll[17];
                        if (llIlIlIIlIlII(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr19 = new int[lllllIlIll[0]];
                            iArr19[lllllIlIll[1]] = lllllIlIll[17];
                        }
                        bu.add(new C0003d(lllllIlIll[17], lllllIlIll[6], C0008i.bp));
                        "".length();
                        iArr7 = new int[lllllIlIll[0]];
                        iArr7[lllllIlIll[1]] = lllllIlIll[13];
                        if (llIlIlIIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr20 = new int[lllllIlIll[0]];
                            iArr20[lllllIlIll[1]] = lllllIlIll[13];
                            if (!llIlIlIIlIlII(Bank.contains(iArr20) ? 1 : 0)) {
                                return;
                            }
                            int[] iArr21 = new int[lllllIlIll[0]];
                            iArr21[lllllIlIll[1]] = lllllIlIll[13];
                            if (!llIlIlIIlIlIl(Bank.getFirst(iArr21).getQuantity(), lllllIlIll[30])) {
                                return;
                            }
                        }
                        bu.add(new C0003d(lllllIlIll[13], lllllIlIll[66], lllllIlIll[107]));
                        "".length();
                    }
                    bu.add(new C0003d(lllllIlIll[10], lllllIlIll[8], lllllIlIll[20]));
                    "".length();
                    iArr5 = new int[lllllIlIll[0]];
                    iArr5[lllllIlIll[1]] = lllllIlIll[14];
                    if (llIlIlIIlIllI(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    iArr6 = new int[lllllIlIll[0]];
                    iArr6[lllllIlIll[1]] = lllllIlIll[17];
                    if (llIlIlIIlIlII(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(lllllIlIll[17], lllllIlIll[6], C0008i.bp));
                    "".length();
                    iArr7 = new int[lllllIlIll[0]];
                    iArr7[lllllIlIll[1]] = lllllIlIll[13];
                    if (llIlIlIIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bu.add(new C0003d(lllllIlIll[13], lllllIlIll[66], lllllIlIll[107]));
                    "".length();
                }
                bu.add(new C0003d(lllllIlIll[7], lllllIlIll[8], lllllIlIll[20]));
                "".length();
                iArr4 = new int[lllllIlIll[0]];
                iArr4[lllllIlIll[1]] = lllllIlIll[10];
                if (llIlIlIIlIlII(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bu.add(new C0003d(lllllIlIll[10], lllllIlIll[8], lllllIlIll[20]));
                "".length();
                iArr5 = new int[lllllIlIll[0]];
                iArr5[lllllIlIll[1]] = lllllIlIll[14];
                if (llIlIlIIlIllI(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[lllllIlIll[0]];
                iArr6[lllllIlIll[1]] = lllllIlIll[17];
                if (llIlIlIIlIlII(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bu.add(new C0003d(lllllIlIll[17], lllllIlIll[6], C0008i.bp));
                "".length();
                iArr7 = new int[lllllIlIll[0]];
                iArr7[lllllIlIll[1]] = lllllIlIll[13];
                if (llIlIlIIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bu.add(new C0003d(lllllIlIll[13], lllllIlIll[66], lllllIlIll[107]));
                "".length();
            }
            bu.add(new C0003d(lllllIlIll[9], lllllIlIll[8], lllllIlIll[20]));
            "".length();
            iArr3 = new int[lllllIlIll[0]];
            iArr3[lllllIlIll[1]] = lllllIlIll[7];
            if (llIlIlIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bu.add(new C0003d(lllllIlIll[7], lllllIlIll[8], lllllIlIll[20]));
            "".length();
            iArr4 = new int[lllllIlIll[0]];
            iArr4[lllllIlIll[1]] = lllllIlIll[10];
            if (llIlIlIIlIlII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bu.add(new C0003d(lllllIlIll[10], lllllIlIll[8], lllllIlIll[20]));
            "".length();
            iArr5 = new int[lllllIlIll[0]];
            iArr5[lllllIlIll[1]] = lllllIlIll[14];
            if (llIlIlIIlIllI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lllllIlIll[0]];
            iArr6[lllllIlIll[1]] = lllllIlIll[17];
            if (llIlIlIIlIlII(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bu.add(new C0003d(lllllIlIll[17], lllllIlIll[6], C0008i.bp));
            "".length();
            iArr7 = new int[lllllIlIll[0]];
            iArr7[lllllIlIll[1]] = lllllIlIll[13];
            if (llIlIlIIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bu.add(new C0003d(lllllIlIll[13], lllllIlIll[66], lllllIlIll[107]));
            "".length();
        }
        bu.add(new C0003d(lllllIlIll[11], lllllIlIll[12], lllllIlIll[103]));
        "".length();
        if (llIlIlIIlIllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lllllIlIII[lllllIlIll[110]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lllllIlIll[0]];
        iArr[lllllIlIll[1]] = lllllIlIll[14];
        if (llIlIlIIlIlII(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lllllIlIll[0]];
        iArr2[lllllIlIll[1]] = lllllIlIll[9];
        if (llIlIlIIlIlII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bu.add(new C0003d(lllllIlIll[9], lllllIlIll[8], lllllIlIll[20]));
        "".length();
        iArr3 = new int[lllllIlIll[0]];
        iArr3[lllllIlIll[1]] = lllllIlIll[7];
        if (llIlIlIIlIlII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bu.add(new C0003d(lllllIlIll[7], lllllIlIll[8], lllllIlIll[20]));
        "".length();
        iArr4 = new int[lllllIlIll[0]];
        iArr4[lllllIlIll[1]] = lllllIlIll[10];
        if (llIlIlIIlIlII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bu.add(new C0003d(lllllIlIll[10], lllllIlIll[8], lllllIlIll[20]));
        "".length();
        iArr5 = new int[lllllIlIll[0]];
        iArr5[lllllIlIll[1]] = lllllIlIll[14];
        if (llIlIlIIlIllI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lllllIlIll[0]];
        iArr6[lllllIlIll[1]] = lllllIlIll[17];
        if (llIlIlIIlIlII(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bu.add(new C0003d(lllllIlIll[17], lllllIlIll[6], C0008i.bp));
        "".length();
        iArr7 = new int[lllllIlIll[0]];
        iArr7[lllllIlIll[1]] = lllllIlIll[13];
        if (llIlIlIIlIlII(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bu.add(new C0003d(lllllIlIll[13], lllllIlIll[66], lllllIlIll[107]));
        "".length();
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllllIlIII[lllllIlIll[109]];
    }
}
