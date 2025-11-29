package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.af  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/af.class */
public class C0006af implements InterfaceC0003ac {
    public static /* synthetic */ List<C0017d> bv;
    public static final /* synthetic */ WorldPoint na;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIIIllIIl;
    public static final /* synthetic */ int nb;
    private static /* synthetic */ String[] llIIIlIlll;
    static /* synthetic */ String[] cE;

    private static void lIlIIllIIlIII() {
        llIIIlIlll = new String[llIIIllIIl[141]];
        llIIIlIlll[llIIIllIIl[0]] = lIlIIllIIIlII("JjINMBQDZx0tHwk0", "dGtYz");
        llIIIlIlll[llIIIllIIl[1]] = lIlIIllIIIlII("Cw4aPTslAhB0KjgeHTovbQ4AMSU+S1QnPyQTFzwhIwBUNikuDFQgJ20EGzo7ORUBNzwkCBo=", "MgtTH");
        llIIIlIlll[llIIIllIIl[3]] = lIlIIllIIIlIl("vjroXiunrQmqFOX8kkZ3WxElh2gFTSnT", "NsBdj");
        llIIIlIlll[llIIIllIIl[4]] = lIlIIllIIIlII("Di8mLjQobgI7Kj4=", "MNUZX");
        llIIIlIlll[llIIIllIIl[6]] = lIlIIllIIIlIl("3aK8ICWtCFw=", "jlJiG");
        llIIIlIlll[llIIIllIIl[2]] = lIlIIllIIIllI("kq9i6zfZsoFLBBOv63X/niNX9t9UtCDO", "Qcwnm");
        llIIIlIlll[llIIIllIIl[9]] = lIlIIllIIIlIl("GI8YITWtc8OlYlf7wkXfktXnkooZi9IlDYOt6oHiVQIiGIUYQuAHPgWJRUJ8aWeQ", "FfKYL");
        llIIIlIlll[llIIIllIIl[11]] = lIlIIllIIIlIl("tYSwIA6ehEymDeCTH8FUclABMwDU7jcE/VbmYaX+gD7Y71or36vCOA==", "IHOcB");
        llIIIlIlll[llIIIllIIl[13]] = lIlIIllIIIllI("IOCobeTP5tyaeNvbKJnbXj9y/Gtn+eUAIjwaWhoxQq/lprHvUHJWuMqyeUZNY8rV", "mJSHl");
        llIIIlIlll[llIIIllIIl[15]] = lIlIIllIIIlIl("4lOhFh5kbf100o0YZ0n1AX4IEiljiClWneJM0SJPXvD3qZsfrnZex6YRr9XR95Tj", "LsRip");
        llIIIlIlll[llIIIllIIl[18]] = lIlIIllIIIlII("PzdaMSMNchc5Ihs7FDdxBjMTPCJEcgknOBwxEjk/D3IOP3EqByMZHy8=", "hRzPQ");
        llIIIlIlll[llIIIllIIl[20]] = lIlIIllIIIlII("BS5WNxM3axs/EiEiGDFBIicXOAp+awUhCCYoHj8PNWsCOUEQHi8fLxU=", "RKvVa");
        llIIIlIlll[llIIIllIIl[22]] = lIlIIllIIIllI("Xmu05fMn9LV8lquCv2VLrB2+w973gdbU6pfrAfyw5r6pTjiFLQ5mJNghaXFrRl67", "wbFjo");
        llIIIlIlll[llIIIllIIl[29]] = lIlIIllIIIllI("dlLm5vBbIyQHJqcJ8fmfhQ==", "yIoHu");
        llIIIlIlll[llIIIllIIl[30]] = lIlIIllIIIllI("0Nil+79PsXQ=", "zYRhC");
        llIIIlIlll[llIIIllIIl[32]] = lIlIIllIIIllI("ndRoPMhn2zXD4jNmlRxV9uEbYm/gGDf5", "GAQsQ");
        llIIIlIlll[llIIIllIIl[33]] = lIlIIllIIIlII("NgEeTBEbARQJ", "ttgly");
        llIIIlIlll[llIIIllIIl[34]] = lIlIIllIIIllI("dhIwdy+uRZPAHdn11jurEw==", "GiYeG");
        llIIIlIlll[llIIIllIIl[36]] = lIlIIllIIIllI("Ogz2Dk/q0qTBaoBaawj3iA==", "QtQpR");
        llIIIlIlll[llIIIllIIl[37]] = lIlIIllIIIlII("JiEYDgVEOR4GBA==", "dTqba");
        llIIIlIlll[llIIIllIIl[39]] = lIlIIllIIIllI("KZcNMtyuM0tfvH2gyBai5A==", "EKlTd");
        llIIIlIlll[llIIIllIIl[40]] = lIlIIllIIIllI("jFxpLBBbDRc=", "QrqKj");
        llIIIlIlll[llIIIllIIl[41]] = lIlIIllIIIlIl("BGUtKHMDkIKZKuakvixEF1Zps7nTWf47", "vYqcF");
        llIIIlIlll[llIIIllIIl[16]] = lIlIIllIIIlII("NSs5", "lNJan");
        llIIIlIlll[llIIIllIIl[43]] = lIlIIllIIIlIl("bVwVZiDWiRg6fNh1LygVSA==", "YTdsZ");
        llIIIlIlll[llIIIllIIl[46]] = lIlIIllIIIlIl("xMXT9zx1/hQ=", "zFKln");
        llIIIlIlll[llIIIllIIl[48]] = lIlIIllIIIlII("Fg48OzgtBTY=", "DkQTN");
        llIIIlIlll[llIIIllIIl[49]] = lIlIIllIIIllI("wI84a/lcPHw=", "WGfxN");
        llIIIlIlll[llIIIllIIl[27]] = lIlIIllIIIlIl("K4VhEUm9xuk=", "DnBdc");
        llIIIlIlll[llIIIllIIl[51]] = lIlIIllIIIllI("wFjSEAsAZk4Y1285MYn8KyqtKIP8LUvA", "YnkDS");
        llIIIlIlll[llIIIllIIl[53]] = lIlIIllIIIlII("OiYcNSo=", "xSuYN");
        llIIIlIlll[llIIIllIIl[55]] = lIlIIllIIIlIl("eXsw6mzX2Lf05yMmhakHRw==", "TzCKG");
        llIIIlIlll[llIIIllIIl[56]] = lIlIIllIIIllI("WXa2IfpB7lM=", "AJpxV");
        llIIIlIlll[llIIIllIIl[57]] = lIlIIllIIIllI("Kxed+fc7+zw=", "ynCLv");
        llIIIlIlll[llIIIllIIl[58]] = lIlIIllIIIlII("IxogHzBBACgYdBUOKx8x", "aoIsT");
        llIIIlIlll[llIIIllIIl[61]] = lIlIIllIIIlIl("cJywknbbUUw=", "KSWLP");
        llIIIlIlll[llIIIllIIl[63]] = lIlIIllIIIlII("NQQPATgODwU=", "gabnN");
        llIIIlIlll[llIIIllIIl[64]] = lIlIIllIIIlIl("B6xRUDmeWss=", "lMASP");
        llIIIlIlll[llIIIllIIl[65]] = lIlIIllIIIllI("TuLm4u6qqMM=", "lCEeZ");
        llIIIlIlll[llIIIllIIl[66]] = lIlIIllIIIllI("M7Ri5f+ORhb4nL6GaiNV8x9LrVcSXcyG", "iRmPV");
        llIIIlIlll[llIIIllIIl[67]] = lIlIIllIIIlIl("3kXGoXubfCY=", "XojRo");
        llIIIlIlll[llIIIllIIl[68]] = lIlIIllIIIlII("CyM7ISc=", "IVRMC");
        llIIIlIlll[llIIIllIIl[70]] = lIlIIllIIIlII("EzA5CQUoOzM=", "AUTfs");
        llIIIlIlll[llIIIllIIl[71]] = lIlIIllIIIlIl("cRVK1QmWEJo=", "PiPSp");
        llIIIlIlll[llIIIllIIl[72]] = lIlIIllIIIlII("CRA3", "PuDYI");
        llIIIlIlll[llIIIllIIl[73]] = lIlIIllIIIlII("BCElJCMvOitoNSk7ITs=", "FTLHG");
        llIIIlIlll[llIIIllIIl[77]] = lIlIIllIIIlIl("D2VLbg99QLe5Z9S73O/0KRKDLOMk80gP", "sDjfa");
        llIIIlIlll[llIIIllIIl[79]] = lIlIIllIIIllI("LugoK2dcgCA=", "jJmrI");
        llIIIlIlll[llIIIllIIl[81]] = lIlIIllIIIlIl("TRdyo62kiDo=", "YkThG");
        llIIIlIlll[llIIIllIIl[83]] = lIlIIllIIIllI("f1Cb86l++zo46fb/+/MwKQ==", "SvkBi");
        llIIIlIlll[llIIIllIIl[84]] = lIlIIllIIIllI("0o0gozSr7w0=", "lPQUK");
        llIIIlIlll[llIIIllIIl[85]] = lIlIIllIIIllI("dLoTTzr7M1A=", "VNWsp");
        llIIIlIlll[llIIIllIIl[87]] = lIlIIllIIIllI("xh6EKxI2rMzusdpbbBc/IZmofNsZR35P", "RPAnP");
        llIIIlIlll[llIIIllIIl[88]] = lIlIIllIIIlIl("HrH4/CdPhOA=", "kGElh");
        llIIIlIlll[llIIIllIIl[89]] = lIlIIllIIIlIl("gS/7/EbSYtj85avDiKX4jaWKk1MNXbMR", "GNCCR");
        llIIIlIlll[llIIIllIIl[90]] = lIlIIllIIIlIl("U/ZdD1N8ucs=", "MuIlS");
        llIIIlIlll[llIIIllIIl[91]] = lIlIIllIIIlIl("s6qLN7Gir18=", "UNkDc");
        llIIIlIlll[llIIIllIIl[93]] = lIlIIllIIIllI("AcViNTWjdysMAR1p+93/cQ==", "LGuEt");
        llIIIlIlll[llIIIllIIl[94]] = lIlIIllIIIllI("rsWvv+imvANiru3l7iprnQ==", "DvyXD");
        llIIIlIlll[llIIIllIIl[95]] = lIlIIllIIIlII("ISsKDg==", "eDdkR");
        llIIIlIlll[llIIIllIIl[96]] = lIlIIllIIIlII("FiEUBzcwPEwKLzotCh4qJis=", "UNaiC");
        llIIIlIlll[llIIIllIIl[97]] = lIlIIllIIIllI("htD7+cOuNfY=", "KTkxg");
        llIIIlIlll[llIIIllIIl[86]] = lIlIIllIIIllI("bDvEulic2Eo=", "egSBK");
        llIIIlIlll[llIIIllIIl[98]] = lIlIIllIIIlII("FB0JJ3YKGxkjM2I7HCQ/LRof", "BtlPV");
        llIIIlIlll[llIIIllIIl[99]] = lIlIIllIIIlII("DAA=", "CnhWI");
        llIIIlIlll[llIIIllIIl[80]] = lIlIIllIIIlII("ITE1CXAGIjMLIw==", "hCZgP");
        llIIIlIlll[llIIIllIIl[104]] = lIlIIllIIIlIl("QmRBU9V7g1Li0opgPd2M1F9HQghKvIbp", "jVgLf");
        llIIIlIlll[llIIIllIIl[105]] = lIlIIllIIIlIl("xcTrJpxM/6Y=", "EksyA");
        llIIIlIlll[llIIIllIIl[106]] = lIlIIllIIIlII("ACAkJzY6", "HAIJS");
        llIIIlIlll[llIIIllIIl[107]] = lIlIIllIIIlII("OxUTKT0=", "kyrGV");
        llIIIlIlll[llIIIllIIl[108]] = lIlIIllIIIllI("jfAxLOhS6ww=", "YnUNa");
        llIIIlIlll[llIIIllIIl[109]] = lIlIIllIIIlIl("F3Oo9XFIPfBX3Uobe5Jlug==", "LiVNM");
        llIIIlIlll[llIIIllIIl[110]] = lIlIIllIIIllI("ydCQVCGlqmHZrzF2uemUrox8upFMIg8u", "ulhPb");
        llIIIlIlll[llIIIllIIl[111]] = lIlIIllIIIlII("FiQA", "EEwHz");
        llIIIlIlll[llIIIllIIl[112]] = lIlIIllIIIlII("IRcpKwkb", "ivDFl");
        llIIIlIlll[llIIIllIIl[113]] = lIlIIllIIIllI("IHFgkg+p1XM=", "MWGYC");
        llIIIlIlll[llIIIllIIl[114]] = lIlIIllIIIlIl("gIVX5HHLxVg=", "KFHlS");
        llIIIlIlll[llIIIllIIl[115]] = lIlIIllIIIlII("HAcFKx0nEB1uGSdCASEYOwc=", "HbiNm");
        llIIIlIlll[llIIIllIIl[116]] = lIlIIllIIIllI("zSnDph4GDmU=", "QwxfQ");
        llIIIlIlll[llIIIllIIl[117]] = lIlIIllIIIlII("OwQvBBIB", "seBiw");
        llIIIlIlll[llIIIllIIl[118]] = lIlIIllIIIlIl("8N/KAtovqPPbSV+cGPMc/+MvBOxG0vT/", "pncma");
        llIIIlIlll[llIIIllIIl[119]] = lIlIIllIIIlII("HQMb", "Nbldm");
        llIIIlIlll[llIIIllIIl[120]] = lIlIIllIIIlII("GgQqKiog", "ReGGO");
        llIIIlIlll[llIIIllIIl[92]] = lIlIIllIIIllI("0y42fj2sVnivsPtJOMltqg==", "JsLuG");
        llIIIlIlll[llIIIllIIl[134]] = lIlIIllIIIllI("tEScSfUBRtzjEyiSPYP4mJZEJ9gygjys", "ZeWPN");
        llIIIlIlll[llIIIllIIl[135]] = lIlIIllIIIlII("Cz0vI1cWMmEgAhw4KCoQUQ==", "yTADw");
        llIIIlIlll[llIIIllIIl[136]] = lIlIIllIIIllI("R7oTPSaHIDmd0PodqqBQ/05DklMqezaD", "WKRxL");
        llIIIlIlll[llIIIllIIl[139]] = lIlIIllIIIlIl("mbjEhaFXfbkrjMWAhveN/yFE2trsvc9p", "RjRnc");
        llIIIlIlll[llIIIllIIl[140]] = lIlIIllIIIlII("AQI+Wio0AiwJP3k=", "XgMzZ");
    }

    private static String lIlIIllIIIlII(String llllllllllllllllllIlIlIlllIIIllI, String llllllllllllllllllIlIlIlllIIIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIlIlIlllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIlIlIlllIIIIll = llllllllllllllllllIlIlIlllIIIlIl.toCharArray();
        int llllllllllllllllllIlIlIlllIIIIlI = llIIIllIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIllIIl[0];
        while (lIlIIllIIlllI(i, length)) {
            char llllllllllllllllllIlIlIlllIIIlll = charArray[i];
            sb.append((char) (llllllllllllllllllIlIlIlllIIIlll ^ llllllllllllllllllIlIlIlllIIIIll[llllllllllllllllllIlIlIlllIIIIlI % llllllllllllllllllIlIlIlllIIIIll.length]));
            "".length();
            llllllllllllllllllIlIlIlllIIIIlI++;
            i++;
            "".length();
            if (((!true) & ((true ^ true) ^ true)) == (true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIIllIIlIll() {
        llIIIllIIl = new int[142];
        llIIIllIIl[0] = (27 ^ 65) & ((218 ^ 128) ^ (-1));
        llIIIllIIl[1] = " ".length();
        llIIIllIIl[2] = (44 ^ 8) ^ (54 ^ 23);
        llIIIllIIl[3] = "  ".length();
        llIIIllIIl[4] = "   ".length();
        llIIIllIIl[5] = (-((-7457) & 8170)) & (-23555) & 32767;
        llIIIllIIl[6] = 179 ^ 183;
        llIIIllIIl[7] = (-19527) & 24526;
        llIIIllIIl[8] = (-((-16415) & 25695)) & (-20483) & 32762;
        llIIIllIIl[9] = (((75 + 126) - 83) + 47) ^ (((1 + 109) - 52) + 105);
        llIIIllIIl[10] = (-((-8721) & 10773)) & (-17826) & 28671;
        llIIIllIIl[11] = 137 ^ 142;
        llIIIllIIl[12] = (-((-931) & 13223)) & (-16529) & 31167;
        llIIIllIIl[13] = (((56 + 174) - 86) + 31) ^ (((82 + 3) - 57) + 139);
        llIIIllIIl[14] = (-51) & 8063;
        llIIIllIIl[15] = 175 ^ 166;
        llIIIllIIl[16] = (244 ^ 164) ^ (201 ^ 142);
        llIIIllIIl[17] = (-((-5745) & 8060)) & (-16385) & 23519;
        llIIIllIIl[18] = 142 ^ 132;
        llIIIllIIl[19] = (-((-17551) & 25775)) & (-1039) & 10222;
        llIIIllIIl[20] = 183 ^ 188;
        llIIIllIIl[21] = (-6422) & 15199;
        llIIIllIIl[22] = (63 ^ 33) ^ (104 ^ 122);
        llIIIllIIl[23] = (-(214 ^ 199)) & (-31745) & 32760;
        llIIIllIIl[24] = (-23633) & 23932;
        llIIIllIIl[25] = (-((-16611) & 30955)) & (-17425) & 32763;
        llIIIllIIl[26] = (-6232) & 31231;
        llIIIllIIl[27] = 221 ^ 193;
        llIIIllIIl[28] = (-((-5617) & 22514)) & (-12295) & 31743;
        llIIIllIIl[29] = 115 ^ 126;
        llIIIllIIl[30] = 183 ^ 185;
        llIIIllIIl[31] = (-((-18442) & 31003)) & (-1) & 13299;
        llIIIllIIl[32] = 122 ^ 117;
        llIIIllIIl[33] = "  ".length() ^ (114 ^ 96);
        llIIIllIIl[34] = (161 ^ 168) ^ (137 ^ 145);
        llIIIllIIl[35] = (-(((83 + 82) - 119) + 91)) & (-1) & 15614;
        llIIIllIIl[36] = (((58 + 71) - 64) + 62) ^ (200 ^ 165);
        llIIIllIIl[37] = (((54 + 82) - 75) + 130) ^ (((167 + 111) - 274) + 168);
        llIIIllIIl[38] = (-3649) & 8173;
        llIIIllIIl[39] = (14 ^ 105) ^ (55 ^ 68);
        llIIIllIIl[40] = (247 ^ 191) ^ (108 ^ 49);
        llIIIllIIl[41] = 135 ^ 145;
        llIIIllIIl[42] = (-((-21329) & 29531)) & (-3649) & 16367;
        llIIIllIIl[43] = (7 ^ 9) ^ (138 ^ 156);
        llIIIllIIl[44] = (-((-2241) & 32469)) & (-33) & 30718;
        llIIIllIIl[45] = (-19009) & 23508;
        llIIIllIIl[46] = 137 ^ 144;
        llIIIllIIl[47] = (-((-15910) & 32687)) & (-1031) & 24559;
        llIIIllIIl[48] = (148 ^ 164) ^ (99 ^ 73);
        llIIIllIIl[49] = 48 ^ 43;
        llIIIllIIl[50] = (-977) & 16379;
        llIIIllIIl[51] = 130 ^ 159;
        llIIIllIIl[52] = (-((-1025) & 23586)) & (-129) & 32189;
        llIIIllIIl[53] = 170 ^ 180;
        llIIIllIIl[54] = (-259) & 13823;
        llIIIllIIl[55] = (207 ^ 153) ^ (217 ^ 144);
        llIIIllIIl[56] = (114 ^ 21) ^ (39 ^ 96);
        llIIIllIIl[57] = (((162 + 125) - 162) + 48) ^ (((26 + 95) - 37) + 56);
        llIIIllIIl[58] = (((150 + 98) - 143) + 54) ^ (((15 + 132) - 12) + 54);
        llIIIllIIl[59] = (-17457) & 32755;
        llIIIllIIl[60] = (-((-4258) & 30379)) & (-17) & 32637;
        llIIIllIIl[61] = 62 ^ 29;
        llIIIllIIl[62] = (-19465) & 32765;
        llIIIllIIl[63] = (233 ^ 144) ^ (20 ^ 73);
        llIIIllIIl[64] = (((69 + 131) - 53) + 34) ^ (((15 + 25) - 13) + 117);
        llIIIllIIl[65] = (103 ^ 74) ^ (191 ^ 180);
        llIIIllIIl[66] = (210 ^ 168) ^ (45 ^ 112);
        llIIIllIIl[67] = (71 ^ 63) ^ (18 ^ 66);
        llIIIllIIl[68] = (10 ^ 29) ^ (76 ^ 114);
        llIIIllIIl[69] = (-((-5223) & 24167)) & (-1) & 32510;
        llIIIllIIl[70] = (((124 + 115) - 93) + 35) ^ (((52 + 77) - 117) + 147);
        llIIIllIIl[71] = 94 ^ 117;
        llIIIllIIl[72] = (59 ^ 25) ^ (74 ^ 68);
        llIIIllIIl[73] = (56 ^ 68) ^ (233 ^ 184);
        llIIIllIIl[74] = (((((26 + 20) - (-36)) + 68) + (((18 + 111) - 83) + 119)) - ((-4246) & 4543)) + ((89 + 12) - 27) + 121;
        llIIIllIIl[75] = (-19466) & 19887;
        llIIIllIIl[76] = 3 ^ 119;
        llIIIllIIl[77] = 158 ^ 176;
        llIIIllIIl[78] = (-((-6193) & 24253)) & (-12290) & 30719;
        llIIIllIIl[79] = 2 ^ 45;
        llIIIllIIl[80] = (31 ^ 52) ^ (64 ^ 42);
        llIIIllIIl[81] = 32 ^ 16;
        llIIIllIIl[82] = 7 ^ 92;
        llIIIllIIl[83] = 106 ^ 91;
        llIIIllIIl[84] = (((89 + 44) - 32) + 55) ^ (((154 + 58) - 82) + 44);
        llIIIllIIl[85] = 66 ^ 113;
        llIIIllIIl[86] = (121 ^ 88) ^ (142 ^ 145);
        llIIIllIIl[87] = (20 ^ 40) ^ (102 ^ 110);
        llIIIllIIl[88] = (188 ^ 156) ^ (10 ^ 31);
        llIIIllIIl[89] = 160 ^ 150;
        llIIIllIIl[90] = (((6 + 123) - 98) + 119) ^ (((75 + 101) - 15) + 0);
        llIIIllIIl[91] = (111 ^ 69) ^ (147 ^ 129);
        llIIIllIIl[92] = (143 ^ 130) ^ (50 ^ 108);
        llIIIllIIl[93] = (119 ^ 39) ^ (21 ^ 124);
        llIIIllIIl[94] = 91 ^ 97;
        llIIIllIIl[95] = 121 ^ 66;
        llIIIllIIl[96] = (111 ^ 33) ^ (106 ^ 24);
        llIIIllIIl[97] = 98 ^ 95;
        llIIIllIIl[98] = (1 ^ 113) ^ (196 ^ 139);
        llIIIllIIl[99] = 218 ^ 154;
        llIIIllIIl[100] = (-((-11441) & 12215)) & (-17) & 16191;
        llIIIllIIl[101] = (-((-10957) & 27343)) & (-49) & 31735;
        llIIIllIIl[102] = (-16410) & 31707;
        llIIIllIIl[103] = (-((-321) & 25435)) & (-358) & 27647;
        llIIIllIIl[104] = (245 ^ 168) ^ (188 ^ 163);
        llIIIllIIl[105] = 57 ^ 122;
        llIIIllIIl[106] = (174 ^ 199) ^ (55 ^ 26);
        llIIIllIIl[107] = 36 ^ 97;
        llIIIllIIl[108] = 33 ^ 103;
        llIIIllIIl[109] = (165 ^ 153) ^ (5 ^ 126);
        llIIIllIIl[110] = (((89 + 65) - 44) + 102) ^ (((8 + 83) - 53) + 118);
        llIIIllIIl[111] = "  ".length() ^ (7 ^ 76);
        llIIIllIIl[112] = 245 ^ 191;
        llIIIllIIl[113] = (((62 + 99) - 38) + 124) ^ (((1 + 13) - (-4)) + 170);
        llIIIllIIl[114] = 36 ^ 104;
        llIIIllIIl[115] = (241 ^ 170) ^ (79 ^ 89);
        llIIIllIIl[116] = (((91 + 128) - 160) + 137) ^ (((13 + 23) - 19) + 121);
        llIIIllIIl[117] = (96 ^ 27) ^ (172 ^ 152);
        llIIIllIIl[118] = (((4 + 37) - (-76)) + 27) ^ (((64 + 70) - (-31)) + 27);
        llIIIllIIl[119] = (((181 + 151) - 323) + 203) ^ (((108 + 3) - 102) + 124);
        llIIIllIIl[120] = "  ".length() ^ (196 ^ 148);
        llIIIllIIl[121] = (-28866) & 29125;
        llIIIllIIl[122] = (-9798) & 10237;
        llIIIllIIl[123] = (-((-4109) & 29229)) & (-5) & 25590;
        llIIIllIIl[124] = (-((-873) & 22377)) & (-8201) & 30204;
        llIIIllIIl[125] = (-23707) & 24286;
        llIIIllIIl[126] = ((108 + 18) - (-2)) + 122;
        llIIIllIIl[127] = (-((-1700) & 14267)) & (-19521) & 32767;
        llIIIllIIl[128] = (-(49 ^ 25)) & (-2201) & 7679;
        llIIIllIIl[129] = (-((-1106) & 7295)) & (-16385) & 24573;
        llIIIllIIl[130] = (-((-11785) & 15930)) & (-257) & 16381;
        llIIIllIIl[131] = (-24593) & 32599;
        llIIIllIIl[132] = (-((-8478) & 15743)) & (-27) & 8191;
        llIIIllIIl[133] = 253 ^ 153;
        llIIIllIIl[134] = (55 ^ 15) ^ (21 ^ 121);
        llIIIllIIl[135] = (112 ^ 18) ^ (46 ^ 25);
        llIIIllIIl[136] = 231 ^ 177;
        llIIIllIIl[137] = (-21249) & 24488;
        llIIIllIIl[138] = (-21093) & 24566;
        llIIIllIIl[139] = (229 ^ 156) ^ (180 ^ 154);
        llIIIllIIl[140] = 208 ^ 136;
        llIIIllIIl[141] = 16 ^ 73;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x038a, code lost:
        if (lIlIIllIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0006af.llIIIllIIl[13]) != false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v207, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v231, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v234, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v242, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v245, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v248, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v251, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v301, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void eH() {
        if (lIlIIllIIllIl(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[0]];
            C0015b.a(bv);
            if (lIlIIllIIlllI(bv.size(), llIIIllIIl[1])) {
                System.out.println(llIIIlIlll[llIIIllIIl[1]]);
                bt = llIIIllIIl[0];
            }
        }
        if (lIlIIllIlIIII(bt ? 1 : 0) && lIlIIllIIlllI(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[2])) {
            if (lIlIIllIlIIII(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIllIlIIlI(nearest) && lIlIIllIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[3]];
                    if (lIlIIllIIllIl(Equipment.contains(C0019f.aS) ? 1 : 0)) {
                        Equipment.getFirst(C0019f.aS).interact(llIIIlIlll[llIIIllIIl[4]]);
                        Time.sleepUntil(() -> {
                            int[] iArr = new int[llIIIllIIl[1]];
                            iArr[llIIIllIIl[0]] = llIIIllIIl[38];
                            if (lIlIIllIlllIl(TileObjects.getNearest(iArr))) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return (-" ".length()) >= 0 ? ((94 ^ 7) ^ (127 ^ 35)) & (((78 ^ 25) ^ (192 ^ 146)) ^ (-" ".length())) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[5]);
                        "".length();
                    }
                    if (lIlIIllIlIIII(Equipment.contains(C0019f.aS) ? 1 : 0) && lIlIIllIIllIl(Inventory.contains(C0019f.aS) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.aS).interact(llIIIlIlll[llIIIllIIl[6]]);
                    }
                    if (lIlIIllIlIIII(Equipment.contains(C0019f.aS) ? 1 : 0) && lIlIIllIlIIII(Inventory.contains(C0019f.aS) ? 1 : 0)) {
                        C0000a.a(nearest);
                        Time.sleepTicks(llIIIllIIl[1]);
                        "".length();
                    }
                }
                if (lIlIIllIlIIlI(nearest) && lIlIIllIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[2]];
                    if (lIlIIllIlIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIllIIl[7]);
                        "".length();
                    }
                    if (lIlIIllIIllIl(Bank.isOpen() ? 1 : 0) && lIlIIllIlIlII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepUntil(() -> {
                            if (lIlIIllIlIIII(Inventory.getAll().size())) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return (84 ^ 81) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[8]);
                        "".length();
                        Time.sleepTicks(llIIIllIIl[1]);
                        "".length();
                    }
                    if (lIlIIllIlIIII(Bank.contains(item -> {
                        return item.getName().toLowerCase().contains(llIIIlIlll[llIIIllIIl[136]]);
                    }) ? 1 : 0)) {
                        Q();
                        System.out.println(llIIIlIlll[llIIIllIIl[9]]);
                        bt = llIIIllIIl[1];
                        return;
                    }
                    int[] iArr = new int[llIIIllIIl[1]];
                    iArr[llIIIllIIl[0]] = llIIIllIIl[10];
                    if (lIlIIllIlIIII(Bank.contains(iArr) ? 1 : 0)) {
                        Q();
                        System.out.println(llIIIlIlll[llIIIllIIl[11]]);
                        bt = llIIIllIIl[1];
                        return;
                    }
                    int[] iArr2 = new int[llIIIllIIl[1]];
                    iArr2[llIIIllIIl[0]] = llIIIllIIl[12];
                    if (lIlIIllIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
                        Q();
                        System.out.println(llIIIlIlll[llIIIllIIl[13]]);
                        bt = llIIIllIIl[1];
                        return;
                    }
                    int[] iArr3 = new int[llIIIllIIl[1]];
                    iArr3[llIIIllIIl[0]] = llIIIllIIl[14];
                    if (lIlIIllIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIIIllIIl[1]];
                        iArr4[llIIIllIIl[0]] = llIIIllIIl[14];
                        if (lIlIIllIlIIII(Inventory.contains(iArr4) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIIlIlll[llIIIllIIl[15]]);
                            bt = llIIIllIIl[1];
                            return;
                        }
                    }
                    if (lIlIIllIIlllI(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[16])) {
                        int[] iArr5 = new int[llIIIllIIl[1]];
                        iArr5[llIIIllIIl[0]] = llIIIllIIl[17];
                        if (lIlIIllIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIIlIlll[llIIIllIIl[18]]);
                            bt = llIIIllIIl[1];
                            return;
                        }
                        int[] iArr6 = new int[llIIIllIIl[1]];
                        iArr6[llIIIllIIl[0]] = llIIIllIIl[19];
                        if (lIlIIllIlIIII(Bank.contains(iArr6) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIIlIlll[llIIIllIIl[20]]);
                            bt = llIIIllIIl[1];
                            return;
                        }
                    }
                    if (lIlIIllIllIII(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[16])) {
                        int[] iArr7 = new int[llIIIllIIl[1]];
                        iArr7[llIIIllIIl[0]] = llIIIllIIl[21];
                        if (lIlIIllIIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[llIIIllIIl[1]];
                            iArr8[llIIIllIIl[0]] = llIIIllIIl[21];
                            if (lIlIIllIIllIl(Bank.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[llIIIllIIl[1]];
                                iArr9[llIIIllIIl[0]] = llIIIllIIl[21];
                            }
                        }
                        Q();
                        System.out.println(llIIIlIlll[llIIIllIIl[22]]);
                        bt = llIIIllIIl[1];
                        return;
                    }
                    if (lIlIIllIlIIII(Equipment.contains(C0019f.aS) ? 1 : 0) && lIlIIllIlIIII(Inventory.contains(C0019f.aS) ? 1 : 0)) {
                        C0000a.b(C0019f.aS, llIIIllIIl[1]);
                        Time.sleepTicks(llIIIllIIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr10 = new int[llIIIllIIl[1]];
                            iArr10[llIIIllIIl[0]] = llIIIllIIl[28];
                            if (lIlIIllIlIlII(Inventory.getCount(iArr10))) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[7]);
                        "".length();
                    }
                    if (lIlIIllIIlllI(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[16])) {
                        C0000a.a(llIIIllIIl[17], llIIIllIIl[23]);
                        C0000a.a(llIIIllIIl[14], llIIIllIIl[24]);
                        C0000a.a(llIIIllIIl[10], llIIIllIIl[1]);
                        C0000a.a(llIIIllIIl[12], llIIIllIIl[1]);
                        C0000a.a(llIIIllIIl[25], llIIIllIIl[26]);
                        C0000a.a(llIIIllIIl[19], llIIIllIIl[27]);
                    }
                    if (lIlIIllIllIII(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[16])) {
                        C0000a.a(llIIIllIIl[14], llIIIllIIl[24]);
                        C0000a.a(llIIIllIIl[10], llIIIllIIl[1]);
                        C0000a.a(llIIIllIIl[12], llIIIllIIl[1]);
                        C0000a.a(llIIIllIIl[21], llIIIllIIl[27]);
                    }
                }
            }
            if (lIlIIllIIllIl(an() ? 1 : 0)) {
                int[] iArr10 = new int[llIIIllIIl[1]];
                iArr10[llIIIllIIl[0]] = llIIIllIIl[28];
                if (lIlIIllIIllIl(Inventory.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[llIIIllIIl[1]];
                    iArr11[llIIIllIIl[0]] = llIIIllIIl[28];
                    if (lIlIIllIlIIII(Equipment.contains(iArr11) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[29]];
                        Bank.close();
                        Time.sleepTicks(llIIIllIIl[1]);
                        "".length();
                        int[] iArr12 = new int[llIIIllIIl[1]];
                        iArr12[llIIIllIIl[0]] = llIIIllIIl[28];
                        Item first = Inventory.getFirst(iArr12);
                        if (lIlIIllIlIIlI(first)) {
                            first.interact(llIIIlIlll[llIIIllIIl[30]]);
                            Time.sleepTicks(llIIIllIIl[4]);
                            "".length();
                        }
                    }
                }
                if (lIlIIllIIlllI(C0018e.j(llIIIllIIl[31]), llIIIllIIl[1])) {
                    if (lIlIIllIIllIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIlIIllIllIIl(Players.getLocal().getWorldLocation().distanceTo(na), llIIIllIIl[3]) && lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[32]];
                        Movement.walkTo(na);
                        "".length();
                        Time.sleepTicks(llIIIllIIl[1]);
                        "".length();
                    }
                    if (lIlIIllIllIll(Players.getLocal().getWorldLocation().distanceTo(na), llIIIllIIl[4])) {
                        AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[33]];
                        C0020g.a(llIIIlIlll[llIIIllIIl[34]], cE);
                    }
                }
                if (lIlIIllIlIlII(C0018e.j(llIIIllIIl[31]))) {
                    int[] iArr13 = new int[llIIIllIIl[1]];
                    iArr13[llIIIllIIl[0]] = llIIIllIIl[35];
                    if (lIlIIllIlIIlI(TileObjects.getNearest(iArr13))) {
                        AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[36]];
                        int[] iArr14 = new int[llIIIllIIl[1]];
                        iArr14[llIIIllIIl[0]] = llIIIllIIl[35];
                        TileObjects.getNearest(iArr14).interact(llIIIlIlll[llIIIllIIl[37]]);
                        Time.sleepUntil(() -> {
                            int[] iArr15 = new int[llIIIllIIl[1]];
                            iArr15[llIIIllIIl[0]] = llIIIllIIl[38];
                            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr15))) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return (((172 ^ 194) ^ (87 ^ 52)) & (((123 ^ 101) ^ (182 ^ 165)) ^ (-" ".length()))) < 0 ? ((((15 + 73) - (-61)) + 103) ^ (((156 + 158) - 257) + 139)) & (("   ".length() ^ (132 ^ 191)) ^ (-" ".length())) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[5]);
                        "".length();
                    }
                    int[] iArr15 = new int[llIIIllIIl[1]];
                    iArr15[llIIIllIIl[0]] = llIIIllIIl[38];
                    if (lIlIIllIlllIl(TileObjects.getNearest(iArr15))) {
                        int[] iArr16 = new int[llIIIllIIl[1]];
                        iArr16[llIIIllIIl[0]] = llIIIllIIl[35];
                        if (lIlIIllIlllIl(TileObjects.getNearest(iArr16))) {
                            AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[39]];
                            Bank.close();
                            int[] iArr17 = new int[llIIIllIIl[1]];
                            iArr17[llIIIllIIl[0]] = llIIIllIIl[14];
                            Inventory.getFirst(iArr17).interact(llIIIlIlll[llIIIllIIl[40]]);
                            Time.sleepUntil(() -> {
                                int[] iArr18 = new int[llIIIllIIl[1]];
                                iArr18[llIIIllIIl[0]] = llIIIllIIl[38];
                                if (lIlIIllIlIIlI(TileObjects.getNearest(iArr18))) {
                                    ?? r0 = llIIIllIIl[1];
                                    "".length();
                                    return (-(105 ^ 109)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIIllIIl[0];
                            }, llIIIllIIl[5]);
                            "".length();
                            Time.sleepTicks(llIIIllIIl[4]);
                            "".length();
                        }
                    }
                    int[] iArr18 = new int[llIIIllIIl[1]];
                    iArr18[llIIIllIIl[0]] = llIIIllIIl[38];
                    if (lIlIIllIlIIlI(TileObjects.getNearest(iArr18))) {
                        if (lIlIIllIlIIII(eO() ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[41]];
                            eK();
                        }
                        if (lIlIIllIIllIl(eO() ? 1 : 0)) {
                            if (lIlIIllIllIII(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[18]) && lIlIIllIlIIII(eN() ? 1 : 0)) {
                                eJ();
                            }
                            if (lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                                eI();
                            }
                            String[] strArr = new String[llIIIllIIl[1]];
                            strArr[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[16]];
                            C0020g.a(strArr);
                        }
                    }
                }
            }
        }
    }

    private static boolean lIlIIllIlIlII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    static boolean eM() {
        int[] iArr = new int[llIIIllIIl[1]];
        iArr[llIIIllIIl[0]] = llIIIllIIl[101];
        if (lIlIIllIlIIlI(TileObjects.getNearest(iArr))) {
            ?? r0 = llIIIllIIl[1];
            "".length();
            return 0 != 0 ? ((((224 + 26) - 158) + 135) ^ (((92 + 145) - 201) + 133)) & (((((9 + 113) - 21) + 92) ^ (((98 + 38) - 28) + 31)) ^ (-" ".length())) : r0;
        }
        return llIIIllIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIllIllIII(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[2])) {
            ?? r0 = llIIIllIIl[1];
            "".length();
            return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIllIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIIllIIl[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIIlIlll[llIIIllIIl[92]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    static boolean eN() {
        int[] iArr = new int[llIIIllIIl[1]];
        iArr[llIIIllIIl[0]] = llIIIllIIl[100];
        if (lIlIIllIlIIlI(TileObjects.getNearest(iArr))) {
            int[] iArr2 = new int[llIIIllIIl[1]];
            iArr2[llIIIllIIl[0]] = llIIIllIIl[102];
            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr2))) {
                ?? r0 = llIIIllIIl[1];
                "".length();
                return 0 != 0 ? ((49 ^ 123) ^ (172 ^ 182)) & (((124 ^ 24) ^ (97 ^ 85)) ^ (-" ".length())) : r0;
            }
        }
        return llIIIllIIl[0];
    }

    private static boolean lIlIIllIllIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIIllIlllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIllIIllIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0102, code lost:
        if (lIlIIllIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0006af.llIIIllIIl[121(0x79, float:1.7E-43)]) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019e, code lost:
        if (lIlIIllIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0006af.llIIIllIIl[121(0x79, float:1.7E-43)]) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0228, code lost:
        if (lIlIIllIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0006af.llIIIllIIl[67]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
        if (lIlIIllIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0006af.llIIIllIIl[67]) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (lIlIIllIIlllI(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[16])) {
            int[] iArr5 = new int[llIIIllIIl[1]];
            iArr5[llIIIllIIl[0]] = llIIIllIIl[19];
            if (lIlIIllIIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIIllIIl[1]];
                iArr6[llIIIllIIl[0]] = llIIIllIIl[19];
                if (lIlIIllIIllIl(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[llIIIllIIl[1]];
                    iArr7[llIIIllIIl[0]] = llIIIllIIl[19];
                }
                iArr4 = new int[llIIIllIIl[1]];
                iArr4[llIIIllIIl[0]] = llIIIllIIl[17];
                if (lIlIIllIIllIl(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr8 = new int[llIIIllIIl[1]];
                    iArr8[llIIIllIIl[0]] = llIIIllIIl[17];
                    if (lIlIIllIIllIl(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[llIIIllIIl[1]];
                        iArr9[llIIIllIIl[0]] = llIIIllIIl[17];
                    }
                }
                bv.add(new C0017d(llIIIllIIl[17], llIIIllIIl[23], llIIIllIIl[67]));
                "".length();
            }
            bv.add(new C0017d(llIIIllIIl[19], llIIIllIIl[121], C0018e.c(llIIIllIIl[122], llIIIllIIl[123])));
            "".length();
            iArr4 = new int[llIIIllIIl[1]];
            iArr4[llIIIllIIl[0]] = llIIIllIIl[17];
            if (lIlIIllIIllIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIllIIl[17], llIIIllIIl[23], llIIIllIIl[67]));
            "".length();
        }
        if (lIlIIllIllIII(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[16])) {
            int[] iArr10 = new int[llIIIllIIl[1]];
            iArr10[llIIIllIIl[0]] = llIIIllIIl[21];
            if (lIlIIllIIllIl(Bank.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIIIllIIl[1]];
                iArr11[llIIIllIIl[0]] = llIIIllIIl[21];
                if (lIlIIllIIllIl(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llIIIllIIl[1]];
                    iArr12[llIIIllIIl[0]] = llIIIllIIl[21];
                }
            }
            bv.add(new C0017d(llIIIllIIl[21], llIIIllIIl[124], llIIIllIIl[125]));
            "".length();
        }
        int[] iArr13 = new int[llIIIllIIl[1]];
        iArr13[llIIIllIIl[0]] = llIIIllIIl[14];
        if (lIlIIllIIllIl(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[llIIIllIIl[1]];
            iArr14[llIIIllIIl[0]] = llIIIllIIl[14];
            if (lIlIIllIIllIl(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIIIllIIl[1]];
                iArr15[llIIIllIIl[0]] = llIIIllIIl[14];
            }
            iArr = new int[llIIIllIIl[1]];
            iArr[llIIIllIIl[0]] = llIIIllIIl[12];
            if (lIlIIllIlIIII(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(llIIIllIIl[12], llIIIllIIl[1], llIIIllIIl[128]));
                "".length();
            }
            iArr2 = new int[llIIIllIIl[1]];
            iArr2[llIIIllIIl[0]] = llIIIllIIl[10];
            if (lIlIIllIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(llIIIllIIl[10], llIIIllIIl[1], llIIIllIIl[128]));
                "".length();
            }
            if (lIlIIllIlIIII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llIIIlIlll[llIIIllIIl[135]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(llIIIllIIl[28], llIIIllIIl[39], llIIIllIIl[129]));
                "".length();
            }
            if (lIlIIllIlIIII(Bank.contains(item2 -> {
                return item2.getName().toLowerCase().contains(llIIIlIlll[llIIIllIIl[134]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(llIIIllIIl[130], llIIIllIIl[3], llIIIllIIl[26]));
                "".length();
            }
            iArr3 = new int[llIIIllIIl[1]];
            iArr3[llIIIllIIl[0]] = llIIIllIIl[131];
            if (lIlIIllIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                return;
            }
            bv.add(new C0017d(llIIIllIIl[131], llIIIllIIl[67], llIIIllIIl[132]));
            "".length();
            return;
        }
        bv.add(new C0017d(llIIIllIIl[14], llIIIllIIl[126], llIIIllIIl[127]));
        "".length();
        iArr = new int[llIIIllIIl[1]];
        iArr[llIIIllIIl[0]] = llIIIllIIl[12];
        if (lIlIIllIlIIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[llIIIllIIl[1]];
        iArr2[llIIIllIIl[0]] = llIIIllIIl[10];
        if (lIlIIllIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        if (lIlIIllIlIIII(Bank.contains(item3 -> {
            return item3.getName().toLowerCase().contains(llIIIlIlll[llIIIllIIl[135]]);
        }) ? 1 : 0)) {
        }
        if (lIlIIllIlIIII(Bank.contains(item22 -> {
            return item22.getName().toLowerCase().contains(llIIIlIlll[llIIIllIIl[134]]);
        }) ? 1 : 0)) {
        }
        iArr3 = new int[llIIIllIIl[1]];
        iArr3[llIIIllIIl[0]] = llIIIllIIl[131];
        if (lIlIIllIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean lIlIIllIlIIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v92, types: [boolean] */
    private static void eI() {
        if (lIlIIllIIlllI(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[18])) {
            int[] iArr = new int[llIIIllIIl[1]];
            iArr[llIIIllIIl[0]] = llIIIllIIl[42];
            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr))) {
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[43]];
                if (lIlIIllIlIIII(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    Widget widget = Widgets.get(llIIIllIIl[44], llIIIllIIl[6]);
                    if (lIlIIllIlIIlI(widget)) {
                        Mouse.click(widget.getChild(llIIIllIIl[9]).getClickPoint().getX(), widget.getChild(llIIIllIIl[9]).getClickPoint().getY(), (boolean) llIIIllIIl[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr2 = new int[llIIIllIIl[1]];
                            iArr2[llIIIllIIl[0]] = llIIIllIIl[47];
                            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr2))) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return (((165 ^ 192) ^ (36 ^ 10)) & (((((115 + 12) - 64) + 176) ^ (((109 + 6) - 14) + 63)) ^ (-" ".length()))) != 0 ? ((209 ^ 146) ^ (68 ^ 29)) & (((((97 + 92) - 152) + 186) ^ (((133 + 149) - 246) + 161)) ^ (-" ".length())) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[45]);
                        "".length();
                    }
                }
                if (lIlIIllIIllIl(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr2 = new int[llIIIllIIl[1]];
                    iArr2[llIIIllIIl[0]] = llIIIllIIl[42];
                    if (lIlIIllIlIIlI(TileObjects.getNearest(iArr2))) {
                        int[] iArr3 = new int[llIIIllIIl[1]];
                        iArr3[llIIIllIIl[0]] = llIIIllIIl[42];
                        TileObjects.getNearest(iArr3).interact(llIIIlIlll[llIIIllIIl[46]]);
                        Time.sleepUntil(() -> {
                            if (lIlIIllIlIIII(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return (-(31 ^ 27)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[45]);
                        "".length();
                    }
                }
            }
            int[] iArr4 = new int[llIIIllIIl[1]];
            iArr4[llIIIllIIl[0]] = llIIIllIIl[47];
            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr4))) {
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[48]];
                if (lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIllIIl[1]);
                    "".length();
                    int[] iArr5 = new int[llIIIllIIl[1]];
                    iArr5[llIIIllIIl[0]] = llIIIllIIl[47];
                    TileObjects.getNearest(iArr5).interact(llIIIlIlll[llIIIllIIl[49]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, llIIIllIIl[45]);
                    "".length();
                }
                String[] strArr = new String[llIIIllIIl[1]];
                strArr[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[27]];
                C0020g.a(strArr);
            }
        }
        if (lIlIIllIllIII(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[18]) && lIlIIllIIlllI(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[16]) && lIlIIllIIllIl(eN() ? 1 : 0)) {
            int[] iArr6 = new int[llIIIllIIl[1]];
            iArr6[llIIIllIIl[0]] = llIIIllIIl[50];
            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr6))) {
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[51]];
                if (lIlIIllIlIIII(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    Widget widget2 = Widgets.get(llIIIllIIl[44], llIIIllIIl[6]);
                    if (lIlIIllIlIIlI(widget2)) {
                        Mouse.click(widget2.getChild(llIIIllIIl[9]).getClickPoint().getX(), widget2.getChild(llIIIllIIl[9]).getClickPoint().getY(), (boolean) llIIIllIIl[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr7 = new int[llIIIllIIl[1]];
                            iArr7[llIIIllIIl[0]] = llIIIllIIl[50];
                            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr7))) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return "  ".length() >= (122 ^ 126) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[52]);
                        "".length();
                    }
                }
                if (lIlIIllIIllIl(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr7 = new int[llIIIllIIl[1]];
                    iArr7[llIIIllIIl[0]] = llIIIllIIl[50];
                    if (lIlIIllIlIIlI(TileObjects.getNearest(iArr7))) {
                        int[] iArr8 = new int[llIIIllIIl[1]];
                        iArr8[llIIIllIIl[0]] = llIIIllIIl[50];
                        TileObjects.getNearest(iArr8).interact(llIIIlIlll[llIIIllIIl[53]]);
                        Time.sleepUntil(() -> {
                            if (lIlIIllIlIIII(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return ((true ^ true) & ((true ^ true) ^ true)) == (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[45]);
                        "".length();
                    }
                }
            }
            int[] iArr9 = new int[llIIIllIIl[1]];
            iArr9[llIIIllIIl[0]] = llIIIllIIl[54];
            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr9))) {
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[55]];
                if (lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIllIIl[1]);
                    "".length();
                    int[] iArr10 = new int[llIIIllIIl[1]];
                    iArr10[llIIIllIIl[0]] = llIIIllIIl[54];
                    TileObjects.getNearest(iArr10).interact(llIIIlIlll[llIIIllIIl[56]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, llIIIllIIl[45]);
                    "".length();
                }
                String[] strArr2 = new String[llIIIllIIl[1]];
                strArr2[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[57]];
                C0020g.a(strArr2);
            }
        }
        if (lIlIIllIllIII(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[16]) && lIlIIllIIlllI(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[57]) && lIlIIllIIllIl(eN() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[58]];
            int[] iArr11 = new int[llIIIllIIl[1]];
            iArr11[llIIIllIIl[0]] = llIIIllIIl[59];
            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr11))) {
                if (lIlIIllIlIIII(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    Widget widget3 = Widgets.get(llIIIllIIl[44], llIIIllIIl[2]);
                    if (lIlIIllIlIIlI(widget3)) {
                        Mouse.click(widget3.getChild(llIIIllIIl[6]).getClickPoint().getX(), widget3.getChild(llIIIllIIl[6]).getClickPoint().getY(), (boolean) llIIIllIIl[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr12 = new int[llIIIllIIl[1]];
                            iArr12[llIIIllIIl[0]] = llIIIllIIl[62];
                            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr12))) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return " ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[60]);
                        "".length();
                    }
                }
                if (lIlIIllIIllIl(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr12 = new int[llIIIllIIl[1]];
                    iArr12[llIIIllIIl[0]] = llIIIllIIl[59];
                    if (lIlIIllIlIIlI(TileObjects.getNearest(iArr12))) {
                        int[] iArr13 = new int[llIIIllIIl[1]];
                        iArr13[llIIIllIIl[0]] = llIIIllIIl[59];
                        TileObjects.getNearest(iArr13).interact(llIIIlIlll[llIIIllIIl[61]]);
                        Time.sleepUntil(() -> {
                            if (lIlIIllIlIIII(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return "   ".length() != "   ".length() ? ((177 ^ 148) ^ (46 ^ 92)) & (((((156 + 101) - 62) + 51) ^ (((53 + 64) - 76) + 120)) ^ (-" ".length())) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[45]);
                        "".length();
                    }
                }
            }
            int[] iArr14 = new int[llIIIllIIl[1]];
            iArr14[llIIIllIIl[0]] = llIIIllIIl[62];
            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr14))) {
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[63]];
                if (lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIllIIl[1]);
                    "".length();
                    int[] iArr15 = new int[llIIIllIIl[1]];
                    iArr15[llIIIllIIl[0]] = llIIIllIIl[62];
                    TileObjects.getNearest(iArr15).interact(llIIIlIlll[llIIIllIIl[64]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, llIIIllIIl[45]);
                    "".length();
                }
                String[] strArr3 = new String[llIIIllIIl[1]];
                strArr3[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[65]];
                C0020g.a(strArr3);
            }
        }
        if (lIlIIllIllIII(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[57]) && lIlIIllIIllIl(eN() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[66]];
            int[] iArr16 = new int[llIIIllIIl[1]];
            iArr16[llIIIllIIl[0]] = llIIIllIIl[54];
            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr16)) && lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                Time.sleepTicks(llIIIllIIl[1]);
                "".length();
                int[] iArr17 = new int[llIIIllIIl[1]];
                iArr17[llIIIllIIl[0]] = llIIIllIIl[54];
                TileObjects.getNearest(iArr17).interact(llIIIlIlll[llIIIllIIl[67]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llIIIllIIl[45]);
                "".length();
            }
            int[] iArr18 = new int[llIIIllIIl[1]];
            iArr18[llIIIllIIl[0]] = llIIIllIIl[50];
            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr18))) {
                if (lIlIIllIlIIII(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    Widget widget4 = Widgets.get(llIIIllIIl[44], llIIIllIIl[2]);
                    if (lIlIIllIlIIlI(widget4)) {
                        Mouse.click(widget4.getChild(llIIIllIIl[6]).getClickPoint().getX(), widget4.getChild(llIIIllIIl[6]).getClickPoint().getY(), (boolean) llIIIllIIl[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr19 = new int[llIIIllIIl[1]];
                            iArr19[llIIIllIIl[0]] = llIIIllIIl[69];
                            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr19))) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[60]);
                        "".length();
                    }
                }
                if (lIlIIllIIllIl(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr19 = new int[llIIIllIIl[1]];
                    iArr19[llIIIllIIl[0]] = llIIIllIIl[50];
                    if (lIlIIllIlIIlI(TileObjects.getNearest(iArr19))) {
                        int[] iArr20 = new int[llIIIllIIl[1]];
                        iArr20[llIIIllIIl[0]] = llIIIllIIl[50];
                        TileObjects.getNearest(iArr20).interact(llIIIlIlll[llIIIllIIl[68]]);
                        Time.sleepUntil(() -> {
                            if (lIlIIllIlIIII(Widgets.get(llIIIllIIl[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = llIIIllIIl[1];
                                "".length();
                                return " ".length() > " ".length() ? ((92 ^ 45) ^ (221 ^ 167)) & (((93 ^ 65) ^ (103 ^ 112)) ^ (-" ".length())) : r0;
                            }
                            return llIIIllIIl[0];
                        }, llIIIllIIl[45]);
                        "".length();
                    }
                }
            }
            int[] iArr21 = new int[llIIIllIIl[1]];
            iArr21[llIIIllIIl[0]] = llIIIllIIl[69];
            if (lIlIIllIlIIlI(TileObjects.getNearest(iArr21))) {
                AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[70]];
                if (lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(llIIIllIIl[1]);
                    "".length();
                    int[] iArr22 = new int[llIIIllIIl[1]];
                    iArr22[llIIIllIIl[0]] = llIIIllIIl[69];
                    TileObjects.getNearest(iArr22).interact(llIIIlIlll[llIIIllIIl[71]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, llIIIllIIl[45]);
                    "".length();
                }
                String[] strArr4 = new String[llIIIllIIl[1]];
                strArr4[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[72]];
                C0020g.a(strArr4);
            }
        }
    }

    private static boolean lIlIIllIllIIl(int i, int i2) {
        return i > i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            eH();
            "".length();
            if (0 != 0) {
                return ((45 ^ 90) ^ (85 ^ 3)) & (((208 ^ 134) ^ (61 ^ 74)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIIllIIl[133];
    }

    private static void eJ() {
        AccBuilderSotf.c = llIIIlIlll[llIIIllIIl[73]];
        if (lIlIIllIlIIII(eL() ? 1 : 0)) {
            if (lIlIIllIIllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (lIlIIllIIllIl(Widgets.get(llIIIllIIl[74]).isEmpty() ? 1 : 0) && lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                if (lIlIIllIlllIl(Widgets.get(llIIIllIIl[75], llIIIllIIl[2]))) {
                    if (lIlIIllIlIIlI(Widgets.get(llIIIllIIl[76], llIIIllIIl[55]))) {
                        Widgets.get(llIIIllIIl[76], llIIIllIIl[55]).interact(llIIIlIlll[llIIIllIIl[77]]);
                        Time.sleepTicks(llIIIllIIl[3]);
                        "".length();
                    }
                    if (lIlIIllIlIIlI(Widgets.get(llIIIllIIl[78], llIIIllIIl[1]))) {
                        Widgets.get(llIIIllIIl[78], llIIIllIIl[1]).interact(llIIIlIlll[llIIIllIIl[79]]);
                        Time.sleepTicks(llIIIllIIl[6]);
                        "".length();
                    }
                }
                if (lIlIIllIlIIlI(Widgets.get(llIIIllIIl[75], llIIIllIIl[2]))) {
                    Widget widget = Widgets.get(llIIIllIIl[75], llIIIllIIl[80]);
                    String[] strArr = new String[llIIIllIIl[1]];
                    strArr[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[81]];
                    if (lIlIIllIlIIII(widget.hasAction(strArr) ? 1 : 0)) {
                        Widgets.get(llIIIllIIl[75], llIIIllIIl[2]).getChild(llIIIllIIl[82]).interact(llIIIlIlll[llIIIllIIl[83]]);
                        Time.sleepTicks(llIIIllIIl[4]);
                        "".length();
                    }
                }
            }
            if (lIlIIllIlIIII(Widgets.get(llIIIllIIl[74]).isEmpty() ? 1 : 0) && lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get(llIIIllIIl[74], llIIIllIIl[15]).interact(llIIIlIlll[llIIIllIIl[84]]);
                Time.sleepTicks(llIIIllIIl[2]);
                "".length();
            }
            if (lIlIIllIlIIlI(Widgets.get(llIIIllIIl[75], llIIIllIIl[2]))) {
                Widget widget2 = Widgets.get(llIIIllIIl[75], llIIIllIIl[80]);
                String[] strArr2 = new String[llIIIllIIl[1]];
                strArr2[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[85]];
                if (lIlIIllIIllIl(widget2.hasAction(strArr2) ? 1 : 0)) {
                    Widgets.get(llIIIllIIl[75], llIIIllIIl[86]).interact(llIIIlIlll[llIIIllIIl[87]]);
                    Time.sleepTicks(llIIIllIIl[3]);
                    "".length();
                    Widgets.get(llIIIllIIl[75], llIIIllIIl[80]).interact(llIIIlIlll[llIIIllIIl[88]]);
                    Time.sleepTicks(llIIIllIIl[4]);
                    "".length();
                }
            }
        }
        if (lIlIIllIlIIII(eM() ? 1 : 0) && lIlIIllIIllIl(eL() ? 1 : 0)) {
            if (lIlIIllIIllIl(Widgets.get(llIIIllIIl[74]).isEmpty() ? 1 : 0) && lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                if (lIlIIllIlllIl(Widgets.get(llIIIllIIl[75], llIIIllIIl[2]))) {
                    if (lIlIIllIlIIlI(Widgets.get(llIIIllIIl[76], llIIIllIIl[55]))) {
                        Widgets.get(llIIIllIIl[76], llIIIllIIl[55]).interact(llIIIlIlll[llIIIllIIl[89]]);
                        Time.sleepTicks(llIIIllIIl[3]);
                        "".length();
                    }
                    if (lIlIIllIlIIlI(Widgets.get(llIIIllIIl[78], llIIIllIIl[1]))) {
                        Widgets.get(llIIIllIIl[78], llIIIllIIl[1]).interact(llIIIlIlll[llIIIllIIl[90]]);
                        Time.sleepTicks(llIIIllIIl[6]);
                        "".length();
                    }
                }
                if (lIlIIllIlIIlI(Widgets.get(llIIIllIIl[75], llIIIllIIl[2]))) {
                    Widget widget3 = Widgets.get(llIIIllIIl[75], llIIIllIIl[80]);
                    String[] strArr3 = new String[llIIIllIIl[1]];
                    strArr3[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[91]];
                    if (lIlIIllIlIIII(widget3.hasAction(strArr3) ? 1 : 0)) {
                        Widgets.get(llIIIllIIl[75], llIIIllIIl[2]).getChild(llIIIllIIl[92]).interact(llIIIlIlll[llIIIllIIl[93]]);
                        Time.sleepTicks(llIIIllIIl[4]);
                        "".length();
                    }
                }
            }
            if (lIlIIllIlIIII(Widgets.get(llIIIllIIl[74]).isEmpty() ? 1 : 0) && lIlIIllIlIIII(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get(llIIIllIIl[74], llIIIllIIl[20]).interact(llIIIlIlll[llIIIllIIl[94]]);
                Time.sleepTicks(llIIIllIIl[2]);
                "".length();
            }
            if (lIlIIllIlIIlI(Widgets.get(llIIIllIIl[75], llIIIllIIl[2]))) {
                Widget widget4 = Widgets.get(llIIIllIIl[75], llIIIllIIl[80]);
                String[] strArr4 = new String[llIIIllIIl[1]];
                strArr4[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[95]];
                if (lIlIIllIIllIl(widget4.hasAction(strArr4) ? 1 : 0)) {
                    Widgets.get(llIIIllIIl[75], llIIIllIIl[86]).interact(llIIIlIlll[llIIIllIIl[96]]);
                    Time.sleepTicks(llIIIllIIl[3]);
                    "".length();
                    Widgets.get(llIIIllIIl[75], llIIIllIIl[80]).interact(llIIIlIlll[llIIIllIIl[97]]);
                    Time.sleepTicks(llIIIllIIl[4]);
                    "".length();
                }
            }
        }
        String[] strArr5 = new String[llIIIllIIl[1]];
        strArr5[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[86]];
        C0020g.a(strArr5);
    }

    private static boolean lIlIIllIIlllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIllIllIII(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIIllIIIllI(String llllllllllllllllllIlIlIllIlIIlII, String llllllllllllllllllIlIlIllIlIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlIllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIllIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlIllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIlIllIlIIlIl) {
            llllllllllllllllllIlIlIllIlIIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v180, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    private static boolean an() {
        if (lIlIIllIIlllI(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[18])) {
            String[] strArr = new String[llIIIllIIl[1]];
            strArr[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[80]];
            if (lIlIIllIIllIl(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[llIIIllIIl[1]];
                strArr2[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[104]];
                if (lIlIIllIIllIl(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[llIIIllIIl[1]];
                    strArr3[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[105]];
                    if (lIlIIllIIllIl(Inventory.contains(strArr3) ? 1 : 0)) {
                        String[] strArr4 = new String[llIIIllIIl[1]];
                        strArr4[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[106]];
                        if (lIlIIllIIllIl(Inventory.contains(strArr4) ? 1 : 0)) {
                            int[] iArr = new int[llIIIllIIl[1]];
                            iArr[llIIIllIIl[0]] = llIIIllIIl[25];
                            if (lIlIIllIIllIl(Inventory.contains(iArr) ? 1 : 0)) {
                                String[] strArr5 = new String[llIIIllIIl[1]];
                                strArr5[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[107]];
                                if (lIlIIllIIllIl(Inventory.contains(strArr5) ? 1 : 0)) {
                                    String[] strArr6 = new String[llIIIllIIl[1]];
                                    strArr6[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[108]];
                                    if (lIlIIllIllIII(Inventory.getAll(strArr6).size(), llIIIllIIl[3]) && (!lIlIIllIlIIII(Inventory.contains(C0019f.aS) ? 1 : 0) || lIlIIllIIllIl(Equipment.contains(C0019f.aS) ? 1 : 0))) {
                                        ?? r0 = llIIIllIIl[1];
                                        "".length();
                                        return "   ".length() > ((121 ^ 73) ^ (96 ^ 84)) ? ((245 ^ 184) ^ (94 ^ 68)) & ((" ".length() ^ (40 ^ 126)) ^ (-" ".length())) : r0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return llIIIllIIl[0];
        } else if (lIlIIllIllIII(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[18]) && lIlIIllIIlllI(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[16])) {
            String[] strArr7 = new String[llIIIllIIl[1]];
            strArr7[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[109]];
            if (lIlIIllIIllIl(Inventory.contains(strArr7) ? 1 : 0)) {
                String[] strArr8 = new String[llIIIllIIl[1]];
                strArr8[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[110]];
                if (lIlIIllIIllIl(Inventory.contains(strArr8) ? 1 : 0)) {
                    String[] strArr9 = new String[llIIIllIIl[1]];
                    strArr9[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[111]];
                    if (lIlIIllIIllIl(Inventory.contains(strArr9) ? 1 : 0)) {
                        String[] strArr10 = new String[llIIIllIIl[1]];
                        strArr10[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[112]];
                        if (lIlIIllIIllIl(Inventory.contains(strArr10) ? 1 : 0)) {
                            int[] iArr2 = new int[llIIIllIIl[1]];
                            iArr2[llIIIllIIl[0]] = llIIIllIIl[25];
                            if (lIlIIllIIllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                                String[] strArr11 = new String[llIIIllIIl[1]];
                                strArr11[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[113]];
                                if (lIlIIllIIllIl(Inventory.contains(strArr11) ? 1 : 0)) {
                                    String[] strArr12 = new String[llIIIllIIl[1]];
                                    strArr12[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[114]];
                                    if (lIlIIllIllIII(Inventory.getAll(strArr12).size(), llIIIllIIl[13]) && (!lIlIIllIlIIII(Inventory.contains(C0019f.aS) ? 1 : 0) || lIlIIllIIllIl(Equipment.contains(C0019f.aS) ? 1 : 0))) {
                                        ?? r02 = llIIIllIIl[1];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return llIIIllIIl[0];
        } else if (lIlIIllIllIII(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[16]) && lIlIIllIIlllI(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[57])) {
            String[] strArr13 = new String[llIIIllIIl[1]];
            strArr13[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[115]];
            if (lIlIIllIIllIl(Inventory.contains(strArr13) ? 1 : 0)) {
                String[] strArr14 = new String[llIIIllIIl[1]];
                strArr14[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[116]];
                if (lIlIIllIIllIl(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[llIIIllIIl[1]];
                    strArr15[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[117]];
                    if (lIlIIllIIllIl(Inventory.contains(strArr15) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIIllIIl[1]];
                        iArr3[llIIIllIIl[0]] = llIIIllIIl[21];
                        if (lIlIIllIIllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIIllIIl[1]];
                            iArr4[llIIIllIIl[0]] = llIIIllIIl[21];
                            if (lIlIIllIllIII(Inventory.getAll(iArr4).size(), llIIIllIIl[6]) && (!lIlIIllIlIIII(Inventory.contains(C0019f.aS) ? 1 : 0) || lIlIIllIIllIl(Equipment.contains(C0019f.aS) ? 1 : 0))) {
                                ?? r03 = llIIIllIIl[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                            }
                        }
                    }
                }
            }
            return llIIIllIIl[0];
        } else if (lIlIIllIllIII(Skills.getLevel(Skill.CONSTRUCTION), llIIIllIIl[57])) {
            String[] strArr16 = new String[llIIIllIIl[1]];
            strArr16[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[118]];
            if (lIlIIllIIllIl(Inventory.contains(strArr16) ? 1 : 0)) {
                String[] strArr17 = new String[llIIIllIIl[1]];
                strArr17[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[119]];
                if (lIlIIllIIllIl(Inventory.contains(strArr17) ? 1 : 0)) {
                    String[] strArr18 = new String[llIIIllIIl[1]];
                    strArr18[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[120]];
                    if (lIlIIllIIllIl(Inventory.contains(strArr18) ? 1 : 0)) {
                        int[] iArr5 = new int[llIIIllIIl[1]];
                        iArr5[llIIIllIIl[0]] = llIIIllIIl[21];
                        if (lIlIIllIIllIl(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIIllIIl[1]];
                            iArr6[llIIIllIIl[0]] = llIIIllIIl[21];
                            if (lIlIIllIllIII(Inventory.getAll(iArr6).size(), llIIIllIIl[13]) && (!lIlIIllIlIIII(Inventory.contains(C0019f.aS) ? 1 : 0) || lIlIIllIIllIl(Equipment.contains(C0019f.aS) ? 1 : 0))) {
                                ?? r04 = llIIIllIIl[1];
                                "".length();
                                return (115 ^ 119) < ((37 ^ 102) & ((84 ^ 23) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return llIIIllIIl[0];
        } else {
            return llIIIllIIl[0];
        }
    }

    private static void eK() {
        if (lIlIIllIIllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIIllIlIIlI(Widgets.get(llIIIllIIl[76], llIIIllIIl[55]))) {
            Widgets.get(llIIIllIIl[76], llIIIllIIl[55]).interact(llIIIlIlll[llIIIllIIl[98]]);
            Time.sleepTicks(llIIIllIIl[3]);
            "".length();
        }
        if (lIlIIllIlIIlI(Widgets.get(llIIIllIIl[78], llIIIllIIl[2]))) {
            Widgets.get(llIIIllIIl[78], llIIIllIIl[2]).interact(llIIIlIlll[llIIIllIIl[99]]);
            Time.sleepTicks(llIIIllIIl[6]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private static boolean eO() {
        if (lIlIIlllIIIIl(Vars.getBit(llIIIllIIl[103]), llIIIllIIl[1])) {
            ?? r0 = llIIIllIIl[1];
            "".length();
            return (-" ".length()) >= 0 ? ((56 ^ 111) ^ (58 ^ 82)) & (((((155 + 42) - 111) + 84) ^ (((18 + 69) - (-17)) + 45)) ^ (-" ".length())) : r0;
        }
        return llIIIllIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    static boolean eL() {
        int[] iArr = new int[llIIIllIIl[1]];
        iArr[llIIIllIIl[0]] = llIIIllIIl[100];
        if (lIlIIllIlIIlI(TileObjects.getNearest(iArr))) {
            ?? r0 = llIIIllIIl[1];
            "".length();
            return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIllIIl[0];
    }

    private static boolean lIlIIllIlIIII(int i) {
        return i == 0;
    }

    static {
        lIlIIllIIlIll();
        lIlIIllIIlIII();
        nb = llIIIllIIl[31];
        na = new WorldPoint(llIIIllIIl[137], llIIIllIIl[138], llIIIllIIl[0]);
        bv = new ArrayList();
        String[] strArr = new String[llIIIllIIl[3]];
        strArr[llIIIllIIl[0]] = llIIIlIlll[llIIIllIIl[139]];
        strArr[llIIIllIIl[1]] = llIIIlIlll[llIIIllIIl[140]];
        cE = strArr;
    }

    private static boolean lIlIIlllIIIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIlIIllIIIlIl(String llllllllllllllllllIlIlIllIllIIIl, String llllllllllllllllllIlIlIllIllIIII) {
        try {
            SecretKeySpec llllllllllllllllllIlIlIllIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlIllIllIIII.getBytes(StandardCharsets.UTF_8)), llIIIllIIl[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllIIl[3], llllllllllllllllllIlIlIllIllIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlIllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIlIllIlIllIl) {
            llllllllllllllllllIlIlIllIlIllIl.printStackTrace();
            return null;
        }
    }
}
