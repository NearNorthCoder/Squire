package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.u  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/u.class */
public class C0020u implements K {
    static /* synthetic */ WorldPoint di;
    static /* synthetic */ WorldArea dh;
    private static /* synthetic */ int dk;
    private static /* synthetic */ int[] lIlIlllIIl;
    public static /* synthetic */ List<C0003d> bp;
    static /* synthetic */ boolean dd;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ WorldArea dg;
    static /* synthetic */ WorldPoint cV;
    static /* synthetic */ WorldPoint dj;
    private static /* synthetic */ String[] cy;
    static /* synthetic */ int dc;
    static /* synthetic */ WorldArea df;
    private static /* synthetic */ String[] lIlIllIllI;
    private static /* synthetic */ String dl;

    private static boolean lIIlIlIIIIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIlIIIIIll(int i, int i2) {
        return i <= i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            bc();
            "".length();
            if ("  ".length() == 0) {
                return (76 ^ 24) & ((95 ^ 11) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIlllIIl[100];
    }

    private static boolean lIIlIIlllllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIIllllIlI(int i) {
        return i != 0;
    }

    static {
        lIIlIIllllIII();
        lIIlIIlllIlII();
        bp = new ArrayList();
        df = new WorldArea(lIlIlllIIl[163], lIlIlllIIl[56], lIlIlllIIl[16], lIlIlllIIl[4], lIlIlllIIl[1]);
        dg = new WorldArea(lIlIlllIIl[164], lIlIlllIIl[165], lIlIlllIIl[166], lIlIlllIIl[142], lIlIlllIIl[1]);
        dh = new WorldArea(lIlIlllIIl[164], lIlIlllIIl[165], lIlIlllIIl[166], lIlIlllIIl[142], lIlIlllIIl[0]);
        cV = new WorldPoint(lIlIlllIIl[167], lIlIlllIIl[168], lIlIlllIIl[1]);
        di = new WorldPoint(lIlIlllIIl[169], lIlIlllIIl[170], lIlIlllIIl[1]);
        dj = new WorldPoint(lIlIlllIIl[171], lIlIlllIIl[172], lIlIlllIIl[1]);
        String[] strArr = new String[lIlIlllIIl[21]];
        strArr[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[173]];
        strArr[lIlIlllIIl[0]] = lIlIllIllI[lIlIlllIIl[174]];
        strArr[lIlIlllIIl[9]] = lIlIllIllI[lIlIlllIIl[175]];
        strArr[lIlIlllIIl[11]] = lIlIllIllI[lIlIlllIIl[176]];
        strArr[lIlIlllIIl[13]] = lIlIllIllI[lIlIlllIIl[100]];
        strArr[lIlIlllIIl[8]] = lIlIllIllI[lIlIlllIIl[177]];
        strArr[lIlIlllIIl[16]] = lIlIllIllI[lIlIlllIIl[178]];
        strArr[lIlIlllIIl[20]] = lIlIllIllI[lIlIlllIIl[179]];
        cy = strArr;
        dk = lIlIlllIIl[1];
        dl = lIlIllIllI[lIlIlllIIl[180]];
    }

    private static String lIIlIIllIIlll(String lllllllllllllllllllIlIIIIIIlIIlI, String lllllllllllllllllllIlIIIIIIlIIIl) {
        String lllllllllllllllllllIlIIIIIIlIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIlIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllIlIIIIIIlIIIl.toCharArray();
        int lllllllllllllllllllIlIIIIIIIlllI = lIlIlllIIl[1];
        char[] charArray2 = lllllllllllllllllllIlIIIIIIlIIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlllIIl[1];
        while (lIIlIIllllIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllllIlIIIIIIIlllI % charArray.length]));
            "".length();
            lllllllllllllllllllIlIIIIIIIlllI++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIlllllll(Object obj) {
        return obj != null;
    }

    private static void lIIlIIlllIlII() {
        lIlIllIllI = new String[lIlIlllIIl[181]];
        lIlIllIllI[lIlIlllIIl[1]] = lIIlIIllIIllI("vQOKlhY36FAI/ZcxSlK5Kt38Y9iWLkUsmQcsxevM1/+CDJEOquvX/YOX8u4gc1bF", "AQJJV");
        lIlIllIllI[lIlIlllIIl[0]] = lIIlIIllIIlll("PCU6ERENJSIY", "kDNtc");
        lIlIllIllI[lIlIlllIIl[9]] = lIIlIIllIIlll("Pz0aLTgbbxomaz8qASEn", "oOsHK");
        lIlIllIllI[lIlIlllIIl[11]] = lIIlIIllIIllI("Dl6Q+yQ0R3J9EXQXjUklbu3IQndjU5ay", "oUkkh");
        lIlIllIllI[lIlIlllIIl[13]] = lIIlIIllIIlll("BwYTMAAtGhU=", "DtrVt");
        lIlIllIllI[lIlIlllIIl[8]] = lIIlIIllIlIII("O+riMZVUqp4qXFuK2WCHMw==", "Uqsdb");
        lIlIllIllI[lIlIlllIIl[16]] = lIIlIIllIlIII("99PSHqWaEOkda1Z/G/zKBg==", "anhyo");
        lIlIllIllI[lIlIlllIIl[20]] = lIIlIIllIlIII("kaqlgJVvkNOl76skKd/EKw==", "bCwby");
        lIlIllIllI[lIlIlllIIl[21]] = lIIlIIllIIlll("OAsNYwAdLDsl", "jMICD");
        lIlIllIllI[lIlIlllIIl[19]] = lIIlIIllIIllI("7l4InIYsdlW/FliHQ+5NQQ==", "XNQWh");
        lIlIllIllI[lIlIlllIIl[4]] = lIIlIIllIlIII("Yp0Pi38jgUtJDQXJxk2EnQ==", "iWrIS");
        lIlIllIllI[lIlIlllIIl[23]] = lIIlIIllIIllI("bNTmiy4VCkA1IS68FyhkziUEq9+3XBjT", "Skchz");
        lIlIllIllI[lIlIlllIIl[24]] = lIIlIIllIIllI("wSWlH3+GC6jxohDJWPPp0Q==", "LoQVR");
        lIlIllIllI[lIlIlllIIl[25]] = lIIlIIllIlIII("LQhRsnJzlBU=", "ijRbv");
        lIlIllIllI[lIlIlllIIl[26]] = lIIlIIllIIllI("ysmAZc7y7vj6WY84l8Hbnw==", "nfUSA");
        lIlIllIllI[lIlIlllIIl[28]] = lIIlIIllIIllI("BBrybzeWnp15UK3caD4co4LcMFk06wkl", "deXtB");
        lIlIllIllI[lIlIlllIIl[35]] = lIIlIIllIIlll("IDBnGDASdSoQMQQ8KR5iBiAiCjZXJjIJMhs8IgpuVyYwEDYUPS4XJVchKFkAIgwONwU=", "wUGyB");
        lIlIllIllI[lIlIlllIIl[42]] = lIIlIIllIIllI("bCH3sdJru+idG+dkRkhuT7xvk6smaB910s8po2C80UPOkXL7wJMsejAq3gGrabxZwJ1GmclbCGY=", "AUDcs");
        lIlIllIllI[lIlIlllIIl[46]] = lIIlIIllIIllI("F2mHS3SxZT4=", "HqjwK");
        lIlIllIllI[lIlIlllIIl[12]] = lIIlIIllIlIII("iW7KSSoni2s=", "ZHuZE");
        lIlIllIllI[lIlIlllIIl[48]] = lIIlIIllIlIII("xpIbzLwa93o=", "KanLI");
        lIlIllIllI[lIlIlllIIl[49]] = lIIlIIllIIlll("JgMnPzo=", "ukFMQ");
        lIlIllIllI[lIlIlllIIl[50]] = lIIlIIllIlIII("1iM7fpjnQP0=", "lKfaY");
        lIlIllIllI[lIlIlllIIl[51]] = lIIlIIllIlIII("yk15Y5Kbl6tAlQe88dGOXw==", "lPOPL");
        lIlIllIllI[lIlIlllIIl[47]] = lIIlIIllIIllI("wRCMM5xX/Bw=", "xILJJ");
        lIlIllIllI[lIlIlllIIl[54]] = lIIlIIllIIllI("TI4aNBVFtLp0Y3D9rAvXAg==", "Bjogz");
        lIlIllIllI[lIlIlllIIl[55]] = lIIlIIllIIllI("ztbbv11ct9U=", "XEIfj");
        lIlIllIllI[lIlIlllIIl[57]] = lIIlIIllIlIII("wZtlZI5SuJpgQ5aIJftcHg==", "aArpT");
        lIlIllIllI[lIlIlllIIl[58]] = lIIlIIllIIllI("LQ6A8ub5pp0=", "SwjjS");
        lIlIllIllI[lIlIlllIIl[59]] = lIIlIIllIIllI("Iikb1Se2pos=", "XeLms");
        lIlIllIllI[lIlIlllIIl[64]] = lIIlIIllIIlll("OiUFbDcbZBAkIgYwFj4=", "tDsLC");
        lIlIllIllI[lIlIlllIIl[65]] = lIIlIIllIlIII("W64OIktUMjgkDADQl/JbHCVqsKSy02YE", "bhZWp");
        lIlIllIllI[lIlIlllIIl[10]] = lIIlIIllIlIII("Kfm9O7gPw8c=", "iUgVg");
        lIlIllIllI[lIlIlllIIl[66]] = lIIlIIllIIllI("VUmkXs05N80=", "IHlrl");
        lIlIllIllI[lIlIlllIIl[67]] = lIIlIIllIIllI("NdhP+Y3b+PmvHO8fUzGe+A==", "HnYsy");
        lIlIllIllI[lIlIlllIIl[14]] = lIIlIIllIlIII("udure7nIDeQ=", "dRSrc");
        lIlIllIllI[lIlIlllIIl[68]] = lIIlIIllIlIII("MkLhcC8DprJnHSQGptef5g==", "RsMtw");
        lIlIllIllI[lIlIlllIIl[69]] = lIIlIIllIIllI("Mi33PUmphuojcnnwwmXJ3Q==", "uYaOo");
        lIlIllIllI[lIlIlllIIl[70]] = lIIlIIllIIlll("HiUlDQIg", "RJDig");
        lIlIllIllI[lIlIlllIIl[71]] = lIIlIIllIIllI("iQpdDqbi3Fs=", "Cgbsb");
        lIlIllIllI[lIlIlllIIl[22]] = lIIlIIllIIlll("Ej06JwU=", "PRTBv");
        lIlIllIllI[lIlIlllIIl[72]] = lIIlIIllIIllI("kpYq7iOsZow=", "suqQr");
        lIlIllIllI[lIlIlllIIl[75]] = lIIlIIllIIlll("LDYgFSs=", "nYNpX");
        lIlIllIllI[lIlIlllIIl[76]] = lIIlIIllIlIII("CVGlSdUw9SVafqJ5CLcJew==", "kMegW");
        lIlIllIllI[lIlIlllIIl[77]] = lIIlIIllIIllI("rkvp/WXfLkX3AuJGNjVULA==", "cyKmA");
        lIlIllIllI[lIlIlllIIl[78]] = lIIlIIllIlIII("cJogkoDojB+3MQgoZWH1kw==", "VTaoO");
        lIlIllIllI[lIlIlllIIl[79]] = lIIlIIllIIllI("nEaeuyHEFyHTL8kpK28CRA==", "owoFQ");
        lIlIllIllI[lIlIlllIIl[80]] = lIIlIIllIIllI("x7bbCcbiTjY=", "Xzknl");
        lIlIllIllI[lIlIlllIIl[81]] = lIIlIIllIIllI("J24upYelEHgI0VlWLYAldQ==", "BZLWw");
        lIlIllIllI[lIlIlllIIl[82]] = lIIlIIllIIllI("/NfmPZrDz1Aa3XqrShYjLg==", "fvBJo");
        lIlIllIllI[lIlIlllIIl[15]] = lIIlIIllIlIII("496BkSenGAE=", "gdFsE");
        lIlIllIllI[lIlIlllIIl[84]] = lIIlIIllIIlll("DAUgGQo=", "MiIzo");
        lIlIllIllI[lIlIlllIIl[85]] = lIIlIIllIIllI("pIjd3uRuPcQ=", "hIWGl");
        lIlIllIllI[lIlIlllIIl[86]] = lIIlIIllIIlll("EjUFCz8=", "SYlhZ");
        lIlIllIllI[lIlIlllIIl[87]] = lIIlIIllIlIII("oaTDKVqXGk0=", "kncOw");
        lIlIllIllI[lIlIlllIIl[88]] = lIIlIIllIIllI("Z15JEp9qkxg=", "iOnUS");
        lIlIllIllI[lIlIlllIIl[93]] = lIIlIIllIlIII("DH3EA8g6zOM2Vz7vrnxSJw==", "cGOfp");
        lIlIllIllI[lIlIlllIIl[94]] = lIIlIIllIIlll("HRQwSzIgFzoO", "RxTkQ");
        lIlIllIllI[lIlIlllIIl[96]] = lIIlIIllIlIII("pwMpYhqM0xQ=", "eGJGD");
        lIlIllIllI[lIlIlllIIl[98]] = lIIlIIllIIllI("aP4WJHcx80M=", "Obmde");
        lIlIllIllI[lIlIlllIIl[6]] = lIIlIIllIlIII("AbIXP+cZMl4=", "wmdTV");
        lIlIllIllI[lIlIlllIIl[101]] = lIIlIIllIlIII("KtjC2WXJPCd9slnejKspzQ==", "miPOQ");
        lIlIllIllI[lIlIlllIIl[102]] = lIIlIIllIlIII("2q/CyY7VuwsqC/zAQ2rO/A==", "Oeeoh");
        lIlIllIllI[lIlIlllIIl[104]] = lIIlIIllIlIII("Cl0D5O7kH8lIksx6TMt7Nw==", "eQolu");
        lIlIllIllI[lIlIlllIIl[107]] = lIIlIIllIIllI("qh+W4LV7/Jg=", "UdoDJ");
        lIlIllIllI[lIlIlllIIl[3]] = lIIlIIllIIlll("IAItNTA=", "wkYVX");
        lIlIllIllI[lIlIlllIIl[109]] = lIIlIIllIIlll("DA4BVxcvCB0SDg==", "Noswz");
        lIlIllIllI[lIlIlllIIl[113]] = lIIlIIllIIllI("KqIRTCf+ZlPrVORwWtefgw==", "CHVRd");
        lIlIllIllI[lIlIlllIIl[114]] = lIIlIIllIIlll("DTEdJgQ3", "EPpKa");
        lIlIllIllI[lIlIlllIIl[115]] = lIIlIIllIIllI("wtdCz7oZnKkXADc3POoTXw==", "OfgGF");
        lIlIllIllI[lIlIlllIIl[89]] = lIIlIIllIlIII("G+sgSxNKzbmSQ7PF4PldPg==", "iKNjU");
        lIlIllIllI[lIlIlllIIl[119]] = lIIlIIllIlIII("Pmd+RooxKsFxCh5b/y5WdA==", "ryVrr");
        lIlIllIllI[lIlIlllIIl[120]] = lIIlIIllIlIII("NIv8v1Jlbjo=", "ceset");
        lIlIllIllI[lIlIlllIIl[90]] = lIIlIIllIIllI("6GB6a39qeBg=", "KRkXz");
        lIlIllIllI[lIlIlllIIl[125]] = lIIlIIllIIlll("Aw4jTjMiTzseJA==", "MoUnG");
        lIlIllIllI[lIlIlllIIl[126]] = lIIlIIllIIlll("Gj8+CCki", "NJLiL");
        lIlIllIllI[lIlIlllIIl[95]] = lIIlIIllIlIII("ho5wrrf6iyQ=", "vAeOJ");
        lIlIllIllI[lIlIlllIIl[128]] = lIIlIIllIIllI("L7v0SrcHdLa2fuBvplPYHQ==", "ZYPuR");
        lIlIllIllI[lIlIlllIIl[129]] = lIIlIIllIIlll("Bic1DzA3aSUYNDY=", "SIQjQ");
        lIlIllIllI[lIlIlllIIl[130]] = lIIlIIllIIllI("SktmR4utFzo=", "NTkEY");
        lIlIllIllI[lIlIlllIIl[97]] = lIIlIIllIIllI("/BJBN/KSlPbkoqnueeJCPw==", "cMsNy");
        lIlIllIllI[lIlIlllIIl[134]] = lIIlIIllIIlll("GAohAAk4DDpFBiUbNxY=", "JoReh");
        lIlIllIllI[lIlIlllIIl[135]] = lIIlIIllIIlll("GAobFxwgGQ4c", "Lxzyo");
        lIlIllIllI[lIlIlllIIl[138]] = lIIlIIllIIllI("EjtwEkXQhjEDoTckUHsfDg==", "MohSZ");
        lIlIllIllI[lIlIlllIIl[139]] = lIIlIIllIIlll("N249KjUCKz8l", "vNMKA");
        lIlIllIllI[lIlIlllIIl[140]] = lIIlIIllIIllI("7jjGR84flGgTaY6bAwDxMw==", "Kwfuz");
        lIlIllIllI[lIlIlllIIl[142]] = lIIlIIllIIlll("JwUNMi0EGQc=", "ejbYN");
        lIlIllIllI[lIlIlllIIl[143]] = lIIlIIllIIllI("bJC0A8QoXEY=", "eCsnM");
        lIlIllIllI[lIlIlllIIl[144]] = lIIlIIllIlIII("s9/AIZa2R+09LEZDc54QKA==", "eCiNe");
        lIlIllIllI[lIlIlllIIl[145]] = lIIlIIllIIllI("hFK5ur/FcrI=", "LsuDe");
        lIlIllIllI[lIlIlllIIl[99]] = lIIlIIllIIlll("NCM/ACwXPzU=", "vLPkO");
        lIlIllIllI[lIlIlllIIl[146]] = lIIlIIllIIlll("OTwpHA4C", "jYHnm");
        lIlIllIllI[lIlIlllIIl[159]] = lIIlIIllIlIII("Q+y6/DJ09Ks=", "WuBpj");
        lIlIllIllI[lIlIlllIIl[160]] = lIIlIIllIIllI("xETtTggbcPiH2ZgUCTdiC77ZI63dnRqu", "aTVEw");
        lIlIllIllI[lIlIlllIIl[161]] = lIIlIIllIlIII("b+whQITdkLKn939k5DTquSvsKGgafaaF", "kaQwy");
        lIlIllIllI[lIlIlllIIl[162]] = lIIlIIllIIlll("HCsGKA==", "XYiXE");
        lIlIllIllI[lIlIlllIIl[173]] = lIIlIIllIIlll("OA8GQQ==", "ajuoM");
        lIlIllIllI[lIlIlllIIl[174]] = lIIlIIllIlIII("ZyQUmORcD9dfFKLqJWl8GICK0IFjkDtg", "jvopK");
        lIlIllIllI[lIlIlllIIl[175]] = lIIlIIllIlIII("GdYOLaDFvuQ9qqukwVKEgjfHHyyYvZXLc59TDjj7c/EBi8cBnGD00OXWJAJU4ChW", "WEwNo");
        lIlIllIllI[lIlIlllIIl[176]] = lIIlIIllIIlll("MgsgLipRLXUgOwhEISohAgF1ISYYBz4nIAJEOy05XUQhKisfWw==", "qdUBN");
        lIlIllIllI[lIlIlllIIl[100]] = lIIlIIllIlIII("rkrigHYGSTGHppU1lGEKA+gED0gqXl1U", "guegZ");
        lIlIllIllI[lIlIlllIIl[177]] = lIIlIIllIIlll("H1MlYg4zBi1iBzQbPTZGN1Q5NwMlAGY=", "VtHBf");
        lIlIllIllI[lIlIlllIIl[178]] = lIIlIIllIIllI("TeSvp25gX5wV0ubmOEmfiCQmoZfE2Gc+f8X3tPNgUbvsyhPHj0up1YEeFU7h3d/v", "PXsqF");
        lIlIllIllI[lIlIlllIIl[179]] = lIIlIIllIlIII("fpLfCi0ahZWWB8/2IWYIgjWoUyyrzgov", "wkoDc");
        lIlIllIllI[lIlIlllIIl[180]] = lIIlIIllIIlll("", "THcbi");
    }

    private static boolean lIIlIIllllllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIlllIIl[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x069d, code lost:
        if (lIIlIIllllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[8]) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06e0, code lost:
        if (lIIlIIllllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[16]) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0723, code lost:
        if (lIIlIIllllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[28]) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0766, code lost:
        if (lIIlIIllllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[13]) != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x07a9, code lost:
        if (lIIlIIllllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[8]) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x07ec, code lost:
        if (lIIlIIllllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[13]) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x07ef, code lost:
        O();
        java.lang.System.out.println(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIllIllI[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[35]]);
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.bn = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x080a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1131, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v892, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v925, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v311, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v153, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v93, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bc() {
        if (lIIlIIllllIlI(bn ? 1 : 0)) {
            C0001b.a(bp);
            if (lIIlIIllllIll(bp.size(), lIlIlllIIl[0])) {
                System.out.println(lIlIllIllI[lIlIlllIIl[1]]);
                bn = lIlIlllIIl[1];
            }
        }
        if (lIIlIIlllllII(bn ? 1 : 0) && lIIlIIllllIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[2])) {
            if (lIIlIIllllIll(C0004e.j(lIlIlllIIl[3]), lIlIlllIIl[4])) {
                dl = lIlIllIllI[lIlIlllIIl[0]];
                C.bL();
            }
            if (lIIlIIlllllIl(C0004e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && (!lIIlIIllllllI(C0004e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) || lIIlIIllllIll(C0004e.j(lIlIlllIIl[7]), lIlIlllIIl[8]))) {
                dl = lIlIllIllI[lIlIlllIIl[9]];
                C0023x.bk();
            }
            if (lIIlIIlllllIl(C0004e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && lIIlIIllllllI(C0004e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && lIIlIIllllllI(C0004e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && lIIlIIllllIll(C0004e.j(lIlIlllIIl[10]), lIlIlllIIl[11])) {
                dl = lIlIllIllI[lIlIlllIIl[11]];
                F.ce();
            }
            if (lIIlIIlllllIl(C0004e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && lIIlIIllllllI(C0004e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && lIIlIIllllllI(C0004e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && lIIlIIlllllIl(C0004e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && lIIlIIllllIll(Skills.getLevel(Skill.CRAFTING), lIlIlllIIl[12])) {
                dl = lIlIllIllI[lIlIlllIIl[13]];
                V.dr();
            }
            if (lIIlIIlllllIl(C0004e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && lIIlIIllllllI(C0004e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && lIIlIIllllllI(C0004e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && lIIlIIlllllIl(C0004e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && lIIlIIllllllI(Skills.getLevel(Skill.CRAFTING), lIlIlllIIl[12]) && lIIlIIllllIll(Skills.getLevel(Skill.WOODCUTTING), lIlIlllIIl[14])) {
                dl = lIlIllIllI[lIlIlllIIl[8]];
                Y.dQ();
            }
            if (lIIlIIlllllIl(C0004e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && lIIlIIllllllI(C0004e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && lIIlIIllllllI(C0004e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && lIIlIIlllllIl(C0004e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && lIIlIIllllllI(Skills.getLevel(Skill.CRAFTING), lIlIlllIIl[12]) && lIIlIIllllllI(Skills.getLevel(Skill.WOODCUTTING), lIlIlllIIl[14]) && lIIlIIllllIll(Skills.getLevel(Skill.RANGED), lIlIlllIIl[15])) {
                dl = lIlIllIllI[lIlIlllIIl[16]];
                if (lIIlIIllllIll(dk, lIlIlllIIl[0])) {
                    C0014o.cB = lIlIlllIIl[1];
                    dk += lIlIlllIIl[0];
                }
                C0013n.ay();
            }
            if (lIIlIIlllllIl(C0004e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && lIIlIIllllllI(C0004e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && lIIlIIllllllI(C0004e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && lIIlIIlllllIl(C0004e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && lIIlIIllllllI(Skills.getLevel(Skill.CRAFTING), lIlIlllIIl[12]) && lIIlIIllllllI(Skills.getLevel(Skill.WOODCUTTING), lIlIlllIIl[14]) && lIIlIIllllllI(Skills.getLevel(Skill.RANGED), lIlIlllIIl[15])) {
                if (!lIIlIIllllllI(C0004e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) || lIIlIIllllIll(Skills.getLevel(Skill.HUNTER), lIlIlllIIl[19])) {
                    dl = lIlIllIllI[lIlIlllIIl[20]];
                    B.bI();
                }
                if (lIIlIIllllllI(C0004e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) && lIIlIIllllllI(Skills.getLevel(Skill.HUNTER), lIlIlllIIl[19]) && lIIlIIllllIll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6])) {
                    dl = lIlIllIllI[lIlIlllIIl[21]];
                    C0025z.bD();
                }
                if (lIIlIIllllllI(C0004e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) && lIIlIIllllllI(Skills.getLevel(Skill.HUNTER), lIlIlllIIl[19]) && lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6]) && lIIlIIllllIll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlllIIl[22])) {
                    dl = lIlIllIllI[lIlIlllIIl[19]];
                    C0019t.ba();
                }
                if (lIIlIIllllllI(C0004e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) && lIIlIIllllllI(Skills.getLevel(Skill.HUNTER), lIlIlllIIl[19]) && lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6]) && lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlllIIl[22]) && lIIlIIllllIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlIlllIIl[19])) {
                    String[] strArr = new String[lIlIlllIIl[0]];
                    strArr[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[4]];
                    if (lIIlIIlllllII(Inventory.contains(strArr) ? 1 : 0)) {
                        dl = lIlIllIllI[lIlIlllIIl[23]];
                        C0021v.bf();
                    }
                }
                C0021v.bg();
            }
            if (lIIlIIlllllII(al() ? 1 : 0) && lIIlIIlllllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) && lIIlIIllllllI(C0004e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) && lIIlIIllllllI(Skills.getLevel(Skill.HUNTER), lIlIlllIIl[19]) && lIIlIIllllllI(Skills.getLevel(Skill.RANGED), lIlIlllIIl[15]) && lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6]) && lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlllIIl[22]) && lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlIlllIIl[19])) {
                String[] strArr2 = new String[lIlIlllIIl[0]];
                strArr2[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[24]];
                if (lIIlIIlllllII(Inventory.contains(strArr2) ? 1 : 0)) {
                    dl = lIlIllIllI[lIlIlllIIl[25]];
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIIlIIlllllll(nearest) && lIIlIIlllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[26]];
                        C0000a.a(nearest);
                    }
                    if (lIIlIIlllllll(nearest) && lIIlIIllllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIlIIlllllII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIlIlllIIl[27]);
                            "".length();
                        }
                        if (lIIlIIllllIlI(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[28]];
                            if (lIIlIlIIIIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIlIlllIIl[13]);
                                "".length();
                            }
                            if (lIIlIlIIIIIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIlIlllIIl[9]);
                                "".length();
                            }
                            int[] iArr = new int[lIlIlllIIl[0]];
                            iArr[lIlIlllIIl[1]] = lIlIlllIIl[29];
                            if (lIIlIIllllIlI(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIlIlllIIl[0]];
                                iArr2[lIlIlllIIl[1]] = lIlIlllIIl[29];
                            }
                            int[] iArr3 = new int[lIlIlllIIl[0]];
                            iArr3[lIlIlllIIl[1]] = lIlIlllIIl[30];
                            if (lIIlIIllllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIlIlllIIl[0]];
                                iArr4[lIlIlllIIl[1]] = lIlIlllIIl[30];
                            }
                            int[] iArr5 = new int[lIlIlllIIl[0]];
                            iArr5[lIlIlllIIl[1]] = lIlIlllIIl[31];
                            if (lIIlIIllllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlIlllIIl[0]];
                                iArr6[lIlIlllIIl[1]] = lIlIlllIIl[31];
                            }
                            int[] iArr7 = new int[lIlIlllIIl[0]];
                            iArr7[lIlIlllIIl[1]] = lIlIlllIIl[32];
                            if (lIIlIIllllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIlIlllIIl[0]];
                                iArr8[lIlIlllIIl[1]] = lIlIlllIIl[32];
                            }
                            int[] iArr9 = new int[lIlIlllIIl[0]];
                            iArr9[lIlIlllIIl[1]] = lIlIlllIIl[33];
                            if (lIIlIIllllIlI(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIlIlllIIl[0]];
                                iArr10[lIlIlllIIl[1]] = lIlIlllIIl[33];
                            }
                            int[] iArr11 = new int[lIlIlllIIl[0]];
                            iArr11[lIlIlllIIl[1]] = lIlIlllIIl[34];
                            if (lIIlIIllllIlI(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIlIlllIIl[0]];
                                iArr12[lIlIlllIIl[1]] = lIlIlllIIl[34];
                            }
                            int[] iArr13 = new int[lIlIlllIIl[23]];
                            iArr13[lIlIlllIIl[1]] = lIlIlllIIl[36];
                            iArr13[lIlIlllIIl[0]] = lIlIlllIIl[37];
                            iArr13[lIlIlllIIl[9]] = lIlIlllIIl[33];
                            iArr13[lIlIlllIIl[11]] = lIlIlllIIl[38];
                            iArr13[lIlIlllIIl[13]] = lIlIlllIIl[32];
                            iArr13[lIlIlllIIl[8]] = lIlIlllIIl[34];
                            iArr13[lIlIlllIIl[16]] = lIlIlllIIl[39];
                            iArr13[lIlIlllIIl[20]] = lIlIlllIIl[40];
                            iArr13[lIlIlllIIl[21]] = lIlIlllIIl[41];
                            iArr13[lIlIlllIIl[19]] = lIlIlllIIl[30];
                            iArr13[lIlIlllIIl[4]] = lIlIlllIIl[31];
                            if (lIIlIIlllllII(C0004e.b(iArr13) ? 1 : 0)) {
                                O();
                                System.out.println(lIlIllIllI[lIlIlllIIl[42]]);
                                bn = lIlIlllIIl[0];
                                return;
                            }
                            int[] iArr14 = new int[lIlIlllIIl[23]];
                            iArr14[lIlIlllIIl[1]] = lIlIlllIIl[36];
                            iArr14[lIlIlllIIl[0]] = lIlIlllIIl[37];
                            iArr14[lIlIlllIIl[9]] = lIlIlllIIl[33];
                            iArr14[lIlIlllIIl[11]] = lIlIlllIIl[38];
                            iArr14[lIlIlllIIl[13]] = lIlIlllIIl[32];
                            iArr14[lIlIlllIIl[8]] = lIlIlllIIl[34];
                            iArr14[lIlIlllIIl[16]] = lIlIlllIIl[39];
                            iArr14[lIlIlllIIl[20]] = lIlIlllIIl[40];
                            iArr14[lIlIlllIIl[21]] = lIlIlllIIl[41];
                            iArr14[lIlIlllIIl[19]] = lIlIlllIIl[30];
                            iArr14[lIlIlllIIl[4]] = lIlIlllIIl[31];
                            if (lIIlIIllllIlI(C0004e.b(iArr14) ? 1 : 0)) {
                                C0000a.a(lIlIlllIIl[34], lIlIlllIIl[13]);
                                C0000a.a(lIlIlllIIl[37], lIlIlllIIl[0]);
                                C0000a.a(lIlIlllIIl[43], lIlIlllIIl[0]);
                                C0000a.a(lIlIlllIIl[32], lIlIlllIIl[13]);
                                C0000a.a(lIlIlllIIl[29], lIlIlllIIl[13]);
                                C0000a.a(lIlIlllIIl[40], lIlIlllIIl[0]);
                                C0000a.a(lIlIlllIIl[41], lIlIlllIIl[0]);
                                C0000a.a(lIlIlllIIl[36], lIlIlllIIl[4]);
                                C0000a.a(lIlIlllIIl[30], lIlIlllIIl[4]);
                                C0000a.a(lIlIlllIIl[31], lIlIlllIIl[28]);
                                C0000a.a(lIlIlllIIl[44], lIlIlllIIl[0]);
                                C0000a.a(lIlIlllIIl[45], lIlIlllIIl[27]);
                            }
                        }
                    }
                }
            }
            if (lIIlIIllllIlI(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIlIIllllIll(Movement.getRunEnergy(), lIlIlllIIl[15])) {
                Inventory.getFirst(C0005f.aU).interact(lIlIllIllI[lIlIlllIIl[46]]);
                Time.sleepTicks(lIlIlllIIl[0]);
                "".length();
            }
            if (lIIlIIllllIlI(Inventory.contains(C0005f.aR) ? 1 : 0) && lIIlIIllllIll(Prayers.getPoints(), lIlIlllIIl[47])) {
                Inventory.getFirst(C0005f.aR).interact(lIlIllIllI[lIlIlllIIl[12]]);
            }
            if (lIIlIlIIIIIIl(lIIlIIllllIIl(C0004e.u(), 60.0d))) {
                String[] strArr3 = new String[lIlIlllIIl[0]];
                strArr3[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[48]];
                if (lIIlIIllllIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlIlllIIl[0]];
                    strArr4[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[49]];
                    Inventory.getFirst(strArr4).interact(lIlIllIllI[lIlIlllIIl[50]]);
                    Time.sleepTicks(lIlIlllIIl[9]);
                    "".length();
                }
            }
            if (lIIlIIllllIlI(al() ? 1 : 0) && lIIlIIlllllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (lIIlIIlllllII(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
                    AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[51]];
                    if (lIIlIIllllIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(cV);
                    "".length();
                    Time.sleepTicks(lIlIlllIIl[0]);
                    "".length();
                }
                if (lIIlIIllllIlI(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
                    dc = lIlIlllIIl[1];
                    C0006g.a(lIlIllIllI[lIlIlllIIl[47]], cy);
                }
                if (lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIlIlllIIl[52], lIlIlllIIl[53], lIlIlllIIl[1])) ? 1 : 0)) {
                    String[] strArr5 = new String[lIlIlllIIl[0]];
                    strArr5[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[54]];
                    TileObjects.getNearest(strArr5).interact(lIlIllIllI[lIlIlllIIl[55]]);
                    Time.sleepTicks(lIlIlllIIl[9]);
                    "".length();
                }
                if (lIIlIIllllIlI(new WorldArea(lIlIlllIIl[52], lIlIlllIIl[56], lIlIlllIIl[16], lIlIlllIIl[4], lIlIlllIIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr6 = new String[lIlIlllIIl[0]];
                    strArr6[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[57]];
                    TileObjects.getNearest(strArr6).interact(lIlIllIllI[lIlIlllIIl[58]]);
                    Time.sleepTicks(lIlIlllIIl[9]);
                    "".length();
                }
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[4])) {
                int[] iArr15 = new int[lIlIlllIIl[0]];
                iArr15[lIlIlllIIl[1]] = lIlIlllIIl[44];
                if (lIIlIIlllllII(Equipment.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[lIlIlllIIl[0]];
                    iArr16[lIlIlllIIl[1]] = lIlIlllIIl[44];
                    Inventory.getFirst(iArr16).interact(lIlIllIllI[lIlIlllIIl[59]]);
                }
                int[] iArr17 = new int[lIlIlllIIl[0]];
                iArr17[lIlIlllIIl[1]] = lIlIlllIIl[60];
                if (lIIlIIlllllII(Inventory.contains(iArr17) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(lIlIlllIIl[61], lIlIlllIIl[62], lIlIlllIIl[1]);
                    int[] iArr18 = new int[lIlIlllIIl[0]];
                    iArr18[lIlIlllIIl[1]] = lIlIlllIIl[63];
                    if (lIIlIIlllllII(Inventory.contains(iArr18) ? 1 : 0) && lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIlllIIl[48])) {
                        if (lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(di), lIlIlllIIl[8])) {
                            AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[64]];
                            Movement.walkTo(di);
                            "".length();
                            Time.sleepTicks(lIlIlllIIl[0]);
                            "".length();
                        }
                        if (lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(di), lIlIlllIIl[8])) {
                            if (lIIlIIlllllII(Shop.isOpen() ? 1 : 0)) {
                                String[] strArr7 = new String[lIlIlllIIl[0]];
                                strArr7[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[65]];
                                NPCs.getNearest(strArr7).interact(lIlIllIllI[lIlIlllIIl[10]]);
                                Time.sleepTicks(lIlIlllIIl[9]);
                                "".length();
                            }
                            if (lIIlIIllllIlI(Shop.isOpen() ? 1 : 0)) {
                                Shop.buyFive(lIlIlllIIl[63]);
                                Time.sleepTicks(lIlIlllIIl[11]);
                                "".length();
                            }
                        }
                    }
                    int[] iArr19 = new int[lIlIlllIIl[0]];
                    iArr19[lIlIlllIIl[1]] = lIlIlllIIl[63];
                    if (lIIlIIllllIlI(Inventory.contains(iArr19) ? 1 : 0)) {
                        if (lIIlIIlllllII(dg.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIlllllII(dh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[lIlIlllIIl[0]];
                            iArr20[lIlIlllIIl[1]] = lIlIlllIIl[31];
                            if (lIIlIIllllIlI(Inventory.contains(iArr20) ? 1 : 0)) {
                                int[] iArr21 = new int[lIlIlllIIl[0]];
                                iArr21[lIlIlllIIl[1]] = lIlIlllIIl[31];
                                Inventory.getFirst(iArr21).interact(lIlIllIllI[lIlIlllIIl[66]]);
                                Time.sleepTicks(lIlIlllIIl[20]);
                                "".length();
                            }
                        }
                        if (!lIIlIIlllllII(dg.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIlIIllllIlI(dh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(lIlIlllIIl[61], lIlIlllIIl[62], lIlIlllIIl[1]);
                            if (lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlIlllIIl[8]) && lIIlIIlllllII(Players.getLocal().getWorldLocation().getPlane())) {
                                AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[67]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(lIlIlllIIl[0]);
                                "".length();
                            }
                            String[] strArr8 = new String[lIlIlllIIl[0]];
                            strArr8[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[14]];
                            if (lIIlIIllllIlI(Inventory.contains(strArr8) ? 1 : 0)) {
                                if (lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlIlllIIl[8]) && lIIlIIlllllII(Players.getLocal().getWorldLocation().getPlane())) {
                                    String[] strArr9 = new String[lIlIlllIIl[0]];
                                    strArr9[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[68]];
                                    TileObjects.getNearest(strArr9).interact(lIlIllIllI[lIlIlllIIl[69]]);
                                    Time.sleepTicks(lIlIlllIIl[13]);
                                    "".length();
                                }
                                String[] strArr10 = new String[lIlIlllIIl[0]];
                                strArr10[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[70]];
                                if (lIIlIIlllllll(TileObjects.getNearest(strArr10))) {
                                    String[] strArr11 = new String[lIlIlllIIl[0]];
                                    strArr11[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[71]];
                                    if (lIIlIIllllIlI(Inventory.contains(strArr11) ? 1 : 0)) {
                                        String[] strArr12 = new String[lIlIlllIIl[0]];
                                        strArr12[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[22]];
                                        Item first = Inventory.getFirst(strArr12);
                                        String[] strArr13 = new String[lIlIlllIIl[0]];
                                        strArr13[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[72]];
                                        first.useOn(TileObjects.getNearest(strArr13));
                                        Time.sleep(C0004e.c(lIlIlllIIl[73], lIlIlllIIl[74]));
                                        "".length();
                                    }
                                }
                            }
                            String[] strArr14 = new String[lIlIlllIIl[0]];
                            strArr14[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[75]];
                            if (lIIlIIlllllII(Inventory.contains(strArr14) ? 1 : 0)) {
                                if (lIIlIIlllllIl(Players.getLocal().getWorldLocation().getPlane(), lIlIlllIIl[0])) {
                                    String[] strArr15 = new String[lIlIlllIIl[0]];
                                    strArr15[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[76]];
                                    TileObjects.getNearest(strArr15).interact(lIlIllIllI[lIlIlllIIl[77]]);
                                    Time.sleepTicks(lIlIlllIIl[8]);
                                    "".length();
                                }
                                if (lIIlIIlllllII(Players.getLocal().getWorldLocation().getPlane())) {
                                    do {
                                        String[] strArr16 = new String[lIlIlllIIl[0]];
                                        strArr16[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[78]];
                                        if (lIIlIIllllIlI(Inventory.contains(strArr16) ? 1 : 0)) {
                                            String[] strArr17 = new String[lIlIlllIIl[0]];
                                            strArr17[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[79]];
                                            TileObjects.getNearest(strArr17).interact(lIlIllIllI[lIlIlllIIl[80]]);
                                            Time.sleepTicks(lIlIlllIIl[9]);
                                            "".length();
                                            "".length();
                                        }
                                    } while ((117 ^ 112) > 0);
                                    return;
                                }
                            }
                        }
                    }
                    int[] iArr22 = new int[lIlIlllIIl[0]];
                    iArr22[lIlIlllIIl[1]] = lIlIlllIIl[32];
                    if (lIIlIIlllllII(Inventory.contains(iArr22) ? 1 : 0)) {
                        String[] strArr18 = new String[lIlIlllIIl[0]];
                        strArr18[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[81]];
                        if (lIIlIIlllllII(Inventory.contains(strArr18) ? 1 : 0) && lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIlllIIl[48])) {
                            if (lIIlIIlllllII(Dialog.isOpen() ? 1 : 0)) {
                                C0006g.a(lIlIllIllI[lIlIlllIIl[82]], cy);
                                Time.sleepTicks(lIlIlllIIl[0]);
                                "".length();
                            }
                            C0006g.a(cy);
                        }
                    }
                }
                int[] iArr23 = new int[lIlIlllIIl[0]];
                iArr23[lIlIlllIIl[1]] = lIlIlllIIl[60];
                if (lIIlIIllllIlI(Inventory.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[lIlIlllIIl[9]];
                    iArr24[lIlIlllIIl[1]] = lIlIlllIIl[83];
                    iArr24[lIlIlllIIl[0]] = lIlIlllIIl[29];
                    if (lIIlIIllllIlI(Inventory.contains(iArr24) ? 1 : 0)) {
                        int[] iArr25 = new int[lIlIlllIIl[9]];
                        iArr25[lIlIlllIIl[1]] = lIlIlllIIl[83];
                        iArr25[lIlIlllIIl[0]] = lIlIlllIIl[29];
                        Inventory.getAll(iArr25).stream().forEach(item -> {
                            item.interact(lIlIllIllI[lIlIlllIIl[162]]);
                        });
                    }
                    if (lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                        Movement.walkTo(dj);
                        "".length();
                        Time.sleepTicks(lIlIlllIIl[0]);
                        "".length();
                    }
                    if (lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                        C0006g.a(lIlIllIllI[lIlIlllIIl[15]], cy);
                    }
                }
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[48])) {
                C0006g.a(lIlIllIllI[lIlIlllIIl[84]], cy);
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[64])) {
                C0006g.a(lIlIllIllI[lIlIlllIIl[85]], cy);
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[22])) {
                C0006g.a(lIlIllIllI[lIlIlllIIl[86]], cy);
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[15])) {
                C0006g.a(lIlIllIllI[lIlIlllIIl[87]], cy);
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[6])) {
                C0006g.a(lIlIllIllI[lIlIlllIIl[88]], cy);
            }
            if (!lIIlIlIIIIlII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[89]) || lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[90])) {
                WorldPoint worldPoint3 = new WorldPoint(lIlIlllIIl[91], lIlIlllIIl[92], lIlIlllIIl[1]);
                if (lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIlIlllIIl[11])) {
                    AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[93]];
                    Movement.walkTo(worldPoint3);
                    "".length();
                    Time.sleepTicks(lIlIlllIIl[0]);
                    "".length();
                }
                if (lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIlIlllIIl[11])) {
                    C0006g.a(lIlIllIllI[lIlIlllIIl[94]], cy);
                }
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[95])) {
                if (lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                    Movement.walkTo(dj);
                    "".length();
                    Time.sleepTicks(lIlIlllIIl[0]);
                    "".length();
                }
                if (lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                    C0006g.a(lIlIllIllI[lIlIlllIIl[96]], cy);
                }
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[97])) {
                C0006g.a(lIlIllIllI[lIlIlllIIl[98]], cy);
            }
            if (!lIIlIlIIIIlII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[99]) || lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[100])) {
                C0006g.a(lIlIllIllI[lIlIlllIIl[6]], cy);
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[100])) {
                String[] strArr19 = new String[lIlIlllIIl[0]];
                strArr19[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[101]];
                if (lIIlIIllllIlI(Inventory.contains(strArr19) ? 1 : 0)) {
                    String[] strArr20 = new String[lIlIlllIIl[0]];
                    strArr20[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[102]];
                    if (lIIlIIlllllII(Inventory.contains(strArr20) ? 1 : 0)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(Integer.valueOf(lIlIlllIIl[33]), Integer.valueOf(lIlIlllIIl[8]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIlIlllIIl[38]), Integer.valueOf(lIlIlllIIl[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIlIlllIIl[39]), Integer.valueOf(lIlIlllIIl[0]));
                        "".length();
                        hashMap.put(Integer.valueOf(lIlIlllIIl[103]), Integer.valueOf(lIlIlllIIl[0]));
                        "".length();
                        C0004e.a(hashMap, lIlIlllIIl[1], lIlIlllIIl[1]);
                    }
                    String[] strArr21 = new String[lIlIlllIIl[0]];
                    strArr21[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[104]];
                    if (lIIlIIllllIlI(Inventory.contains(strArr21) ? 1 : 0)) {
                        bd();
                    }
                }
            }
            if (!lIIlIlIIIIlII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[105]) || lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[106])) {
                String[] strArr22 = new String[lIlIlllIIl[0]];
                strArr22[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[107]];
                NPC nearest2 = NPCs.getNearest(strArr22);
                if (lIIlIIlllllll(nearest2)) {
                    if (lIIlIIllllIlI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        C0006g.a(lIlIllIllI[lIlIlllIIl[3]], cy);
                    }
                    if (lIIlIIlllllII(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        Movement.walkTo(nearest2);
                        "".length();
                        Time.sleepTicks(lIlIlllIIl[0]);
                        "".length();
                    }
                }
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[108])) {
                String[] strArr23 = new String[lIlIlllIIl[0]];
                strArr23[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[109]];
                if (lIIlIIlllllII(Inventory.contains(strArr23) ? 1 : 0)) {
                    WorldPoint worldPoint4 = new WorldPoint(lIlIlllIIl[110], lIlIlllIIl[111], lIlIlllIIl[1]);
                    WorldPoint worldPoint5 = new WorldPoint(lIlIlllIIl[110], lIlIlllIIl[112], lIlIlllIIl[1]);
                    if (lIIlIIlllllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && lIIlIIlllllII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[113]];
                        Movement.walkTo(worldPoint4);
                        "".length();
                        Time.sleepTicks(lIlIlllIIl[0]);
                        "".length();
                    }
                    if (lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && lIIlIIlllllII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        Movement.walkTo(worldPoint5);
                        "".length();
                    }
                    if (lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                        String[] strArr24 = new String[lIlIlllIIl[0]];
                        strArr24[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[114]];
                        Item first2 = Inventory.getFirst(strArr24);
                        String[] strArr25 = new String[lIlIlllIIl[0]];
                        strArr25[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[115]];
                        first2.useOn(Inventory.getFirst(strArr25));
                        Time.sleepTicks(lIlIlllIIl[11]);
                        "".length();
                    }
                }
                String[] strArr26 = new String[lIlIlllIIl[0]];
                strArr26[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[89]];
                if (lIIlIIllllIlI(Inventory.contains(strArr26) ? 1 : 0)) {
                    bd();
                }
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[116])) {
                WorldPoint worldPoint6 = new WorldPoint(lIlIlllIIl[117], lIlIlllIIl[118], lIlIlllIIl[1]);
                if (lIIlIIlllllII(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    Movement.walkTo(worldPoint6);
                    "".length();
                    Time.sleepTicks(lIlIlllIIl[0]);
                    "".length();
                }
                if (lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    String[] strArr27 = new String[lIlIlllIIl[0]];
                    strArr27[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[119]];
                    NPCs.getNearest(strArr27).interact(lIlIllIllI[lIlIlllIIl[120]]);
                    Time.sleepTicks(lIlIlllIIl[0]);
                    "".length();
                }
            }
            if (!lIIlIlIIIIlII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[121]) || lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[122])) {
                WorldPoint worldPoint7 = new WorldPoint(lIlIlllIIl[123], lIlIlllIIl[124], lIlIlllIIl[1]);
                if (lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIlIlllIIl[9])) {
                    if (lIIlIIllllIlI(Inventory.contains(C0005f.aN) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aN).interact(lIlIllIllI[lIlIlllIIl[90]]);
                    }
                    AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[125]];
                    Movement.walkTo(worldPoint7);
                    "".length();
                    Time.sleepTicks(lIlIlllIIl[0]);
                    "".length();
                }
                if (lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lIlIlllIIl[9])) {
                    String[] strArr28 = new String[lIlIlllIIl[0]];
                    strArr28[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[126]];
                    NPC nearest3 = NPCs.getNearest(strArr28);
                    if (lIIlIIlllllll(nearest3)) {
                        if (lIIlIIllllIlI(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            C0006g.a(lIlIllIllI[lIlIlllIIl[95]], cy);
                        }
                        if (lIIlIIlllllII(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                            Movement.walkTo(nearest3);
                            "".length();
                            Time.sleepTicks(lIlIlllIIl[0]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[127])) {
                String[] strArr29 = new String[lIlIlllIIl[0]];
                strArr29[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[128]];
                if (lIIlIIlllllII(Inventory.contains(strArr29) ? 1 : 0)) {
                    WorldPoint worldPoint8 = new WorldPoint(lIlIlllIIl[117], lIlIlllIIl[118], lIlIlllIIl[1]);
                    if (lIIlIIlllllII(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        Movement.walkTo(worldPoint8);
                        "".length();
                        Time.sleepTicks(lIlIlllIIl[0]);
                        "".length();
                    }
                    if (lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                        String[] strArr30 = new String[lIlIlllIIl[0]];
                        strArr30[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[129]];
                        NPCs.getNearest(strArr30).interact(lIlIllIllI[lIlIlllIIl[130]]);
                        Time.sleepTicks(lIlIlllIIl[0]);
                        "".length();
                    }
                }
                String[] strArr31 = new String[lIlIlllIIl[0]];
                strArr31[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[97]];
                if (lIIlIIllllIlI(Inventory.contains(strArr31) ? 1 : 0)) {
                    bd();
                }
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[131])) {
                bd();
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[132])) {
                if (lIIlIIllllIlI(Widgets.get(lIlIlllIIl[133]).isEmpty() ? 1 : 0)) {
                    String[] strArr32 = new String[lIlIlllIIl[0]];
                    strArr32[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[134]];
                    Inventory.getFirst(strArr32).interact(lIlIllIllI[lIlIlllIIl[135]]);
                    Time.sleepTicks(lIlIlllIIl[13]);
                    "".length();
                }
                if (lIIlIIlllllII(Widgets.get(lIlIlllIIl[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click(Widgets.get(lIlIlllIIl[133], lIlIlllIIl[55]).getClickPoint().getX(), Widgets.get(lIlIlllIIl[133], lIlIlllIIl[55]).getClickPoint().getY(), (boolean) lIlIlllIIl[0]);
                    Time.sleepTicks(lIlIlllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIlIlllIIl[133], lIlIlllIIl[65]).getClickPoint().getX(), Widgets.get(lIlIlllIIl[133], lIlIlllIIl[65]).getClickPoint().getY(), (boolean) lIlIlllIIl[0]);
                    Time.sleepTicks(lIlIlllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIlIlllIIl[133], lIlIlllIIl[67]).getClickPoint().getX(), Widgets.get(lIlIlllIIl[133], lIlIlllIIl[67]).getClickPoint().getY(), (boolean) lIlIlllIIl[0]);
                    Time.sleepTicks(lIlIlllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIlIlllIIl[133], lIlIlllIIl[22]).getClickPoint().getX(), Widgets.get(lIlIlllIIl[133], lIlIlllIIl[22]).getClickPoint().getY(), (boolean) lIlIlllIIl[0]);
                    Time.sleepTicks(lIlIlllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIlIlllIIl[133], lIlIlllIIl[76]).getClickPoint().getX(), Widgets.get(lIlIlllIIl[133], lIlIlllIIl[76]).getClickPoint().getY(), (boolean) lIlIlllIIl[0]);
                    Time.sleepTicks(lIlIlllIIl[9]);
                    "".length();
                    Mouse.click(Widgets.get(lIlIlllIIl[133], lIlIlllIIl[79]).getClickPoint().getX(), Widgets.get(lIlIlllIIl[133], lIlIlllIIl[79]).getClickPoint().getY(), (boolean) lIlIlllIIl[0]);
                    Time.sleepTicks(lIlIlllIIl[8]);
                    "".length();
                }
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[136])) {
                bd();
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[137])) {
                String[] strArr33 = new String[lIlIlllIIl[0]];
                strArr33[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[138]];
                if (lIIlIIllllIlI(Inventory.contains(strArr33) ? 1 : 0)) {
                    String[] strArr34 = new String[lIlIlllIIl[0]];
                    strArr34[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[139]];
                    Item first3 = Inventory.getFirst(strArr34);
                    String[] strArr35 = new String[lIlIlllIIl[0]];
                    strArr35[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[140]];
                    first3.useOn(Inventory.getFirst(strArr35));
                    Time.sleepTicks(lIlIlllIIl[9]);
                    "".length();
                }
            }
            if (lIIlIIlllllIl(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[141])) {
                if (lIIlIIllllIll(dc, lIlIlllIIl[0])) {
                    Z.nh += lIlIlllIIl[0];
                    Z.p(AccBuilderShamans.m);
                    dc += lIlIlllIIl[0];
                    Z.nh = lIlIlllIIl[1];
                    dd = lIlIlllIIl[1];
                }
                bd();
            }
            C0006g.a(cy);
        }
    }

    private static boolean lIIlIIlllllII(int i) {
        return i == 0;
    }

    private static void bd() {
        if (lIIlIIllllIlI(new WorldArea(lIlIlllIIl[52], lIlIlllIIl[56], lIlIlllIIl[16], lIlIlllIIl[4], lIlIlllIIl[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] strArr = new String[lIlIlllIIl[0]];
            strArr[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[142]];
            TileObjects.getNearest(strArr).interact(lIlIllIllI[lIlIlllIIl[143]]);
            Time.sleepTicks(lIlIlllIIl[9]);
            "".length();
        }
        if (lIIlIIlllllII(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
            AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[144]];
            if (lIIlIIllllIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(cV);
            "".length();
            Time.sleepTicks(lIlIlllIIl[0]);
            "".length();
        }
        if (lIIlIIllllIlI(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
            C0006g.a(lIlIllIllI[lIlIlllIIl[145]], cy);
        }
        if (lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIlIlllIIl[52], lIlIlllIIl[53], lIlIlllIIl[1])) ? 1 : 0)) {
            String[] strArr2 = new String[lIlIlllIIl[0]];
            strArr2[lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[99]];
            TileObjects.getNearest(strArr2).interact(lIlIllIllI[lIlIlllIIl[146]]);
            Time.sleepTicks(lIlIlllIIl[9]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean al() {
        int[] iArr = new int[lIlIlllIIl[20]];
        iArr[lIlIlllIIl[1]] = lIlIlllIIl[36];
        iArr[lIlIlllIIl[0]] = lIlIlllIIl[37];
        iArr[lIlIlllIIl[9]] = lIlIlllIIl[34];
        iArr[lIlIlllIIl[11]] = lIlIlllIIl[40];
        iArr[lIlIlllIIl[13]] = lIlIlllIIl[41];
        iArr[lIlIlllIIl[8]] = lIlIlllIIl[30];
        iArr[lIlIlllIIl[16]] = lIlIlllIIl[31];
        int i = lIlIlllIIl[1];
        while (lIIlIIllllIll(i, iArr.length)) {
            int[] iArr2 = new int[lIlIlllIIl[0]];
            iArr2[lIlIlllIIl[1]] = iArr[i];
            if (lIIlIIlllllII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlIlllIIl[1];
            }
            i++;
            "".length();
            if (((92 ^ 89) ^ ((113 ^ 77) & ((169 ^ 149) ^ (-1)))) <= 0) {
                return ((233 ^ 129) ^ (26 ^ 39)) & (((((195 + 169) - 178) + 27) ^ (((14 + 105) - 36) + 45)) ^ (-" ".length()));
            }
        }
        return lIlIlllIIl[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ef, code lost:
        if (lIIlIIllllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[16]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0179, code lost:
        if (lIIlIIllllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[28]) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x028f, code lost:
        if (lIIlIIllllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[13]) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0318, code lost:
        if (lIIlIIllllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[8]) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03a1, code lost:
        if (lIIlIIllllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[8]) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x058d, code lost:
        if (lIIlIIllllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[13]) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
        if (lIIlIIllllIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0020u.lIlIlllIIl[4]) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int[] iArr13;
        int[] iArr14 = new int[lIlIlllIIl[0]];
        iArr14[lIlIlllIIl[1]] = lIlIlllIIl[43];
        if (lIIlIIllllIlI(Bank.contains(iArr14) ? 1 : 0)) {
            int[] iArr15 = new int[lIlIlllIIl[0]];
            iArr15[lIlIlllIIl[1]] = lIlIlllIIl[43];
            if (lIIlIIllllIlI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIlIlllIIl[0]];
                iArr16[lIlIlllIIl[1]] = lIlIlllIIl[43];
            }
            iArr = new int[lIlIlllIIl[0]];
            iArr[lIlIlllIIl[1]] = lIlIlllIIl[30];
            if (lIIlIIllllIlI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr17 = new int[lIlIlllIIl[0]];
                iArr17[lIlIlllIIl[1]] = lIlIlllIIl[30];
                if (lIIlIIllllIlI(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIlIlllIIl[0]];
                    iArr18[lIlIlllIIl[1]] = lIlIlllIIl[30];
                }
                iArr2 = new int[lIlIlllIIl[0]];
                iArr2[lIlIlllIIl[1]] = lIlIlllIIl[31];
                if (lIIlIIllllIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr19 = new int[lIlIlllIIl[0]];
                    iArr19[lIlIlllIIl[1]] = lIlIlllIIl[31];
                    if (lIIlIIllllIlI(Bank.contains(iArr19) ? 1 : 0)) {
                        int[] iArr20 = new int[lIlIlllIIl[0]];
                        iArr20[lIlIlllIIl[1]] = lIlIlllIIl[31];
                    }
                    iArr3 = new int[lIlIlllIIl[0]];
                    iArr3[lIlIlllIIl[1]] = lIlIlllIIl[103];
                    if (lIIlIIlllllII(Bank.contains(iArr3) ? 1 : 0)) {
                        bp.add(new C0003d(lIlIlllIIl[103], lIlIlllIIl[8], lIlIlllIIl[151]));
                        "".length();
                    }
                    iArr4 = new int[lIlIlllIIl[0]];
                    iArr4[lIlIlllIIl[1]] = lIlIlllIIl[37];
                    if (lIIlIIlllllII(Bank.contains(iArr4) ? 1 : 0)) {
                        bp.add(new C0003d(lIlIlllIIl[37], lIlIlllIIl[0], lIlIlllIIl[27]));
                        "".length();
                    }
                    iArr5 = new int[lIlIlllIIl[0]];
                    iArr5[lIlIlllIIl[1]] = lIlIlllIIl[32];
                    if (lIIlIIllllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr21 = new int[lIlIlllIIl[0]];
                        iArr21[lIlIlllIIl[1]] = lIlIlllIIl[32];
                        if (lIIlIIllllIlI(Bank.contains(iArr21) ? 1 : 0)) {
                            int[] iArr22 = new int[lIlIlllIIl[0]];
                            iArr22[lIlIlllIIl[1]] = lIlIlllIIl[32];
                        }
                        iArr6 = new int[lIlIlllIIl[0]];
                        iArr6[lIlIlllIIl[1]] = lIlIlllIIl[33];
                        if (lIIlIIllllIlI(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr23 = new int[lIlIlllIIl[0]];
                            iArr23[lIlIlllIIl[1]] = lIlIlllIIl[33];
                            if (lIIlIIllllIlI(Bank.contains(iArr23) ? 1 : 0)) {
                                int[] iArr24 = new int[lIlIlllIIl[0]];
                                iArr24[lIlIlllIIl[1]] = lIlIlllIIl[33];
                            }
                            iArr7 = new int[lIlIlllIIl[0]];
                            iArr7[lIlIlllIIl[1]] = lIlIlllIIl[29];
                            if (lIIlIIllllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr25 = new int[lIlIlllIIl[0]];
                                iArr25[lIlIlllIIl[1]] = lIlIlllIIl[29];
                                if (lIIlIIllllIlI(Bank.contains(iArr25) ? 1 : 0)) {
                                    int[] iArr26 = new int[lIlIlllIIl[0]];
                                    iArr26[lIlIlllIIl[1]] = lIlIlllIIl[29];
                                }
                                iArr8 = new int[lIlIlllIIl[0]];
                                iArr8[lIlIlllIIl[1]] = lIlIlllIIl[39];
                                if (lIIlIIlllllII(Bank.contains(iArr8) ? 1 : 0)) {
                                    bp.add(new C0003d(lIlIlllIIl[39], lIlIlllIIl[0], lIlIlllIIl[27]));
                                    "".length();
                                }
                                iArr9 = new int[lIlIlllIIl[0]];
                                iArr9[lIlIlllIIl[1]] = lIlIlllIIl[38];
                                if (lIIlIIlllllII(Bank.contains(iArr9) ? 1 : 0)) {
                                    bp.add(new C0003d(lIlIlllIIl[38], lIlIlllIIl[0], lIlIlllIIl[27]));
                                    "".length();
                                }
                                iArr10 = new int[lIlIlllIIl[0]];
                                iArr10[lIlIlllIIl[1]] = lIlIlllIIl[40];
                                if (lIIlIIlllllII(Bank.contains(iArr10) ? 1 : 0)) {
                                    bp.add(new C0003d(lIlIlllIIl[40], lIlIlllIIl[0], lIlIlllIIl[152]));
                                    "".length();
                                }
                                iArr11 = new int[lIlIlllIIl[0]];
                                iArr11[lIlIlllIIl[1]] = lIlIlllIIl[41];
                                if (lIIlIIlllllII(Bank.contains(iArr11) ? 1 : 0)) {
                                    bp.add(new C0003d(lIlIlllIIl[41], lIlIlllIIl[0], lIlIlllIIl[153] + C0004e.c(lIlIlllIIl[154], lIlIlllIIl[155])));
                                    "".length();
                                }
                                if (lIIlIIlllllII(Bank.contains(item -> {
                                    return item.getName().toLowerCase().contains(lIlIllIllI[lIlIlllIIl[161]]);
                                }) ? 1 : 0)) {
                                    bp.add(new C0003d(lIlIlllIIl[156], lIlIlllIIl[8], lIlIlllIIl[157]));
                                    "".length();
                                }
                                iArr12 = new int[lIlIlllIIl[0]];
                                iArr12[lIlIlllIIl[1]] = lIlIlllIIl[34];
                                if (lIIlIIllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
                                    int[] iArr27 = new int[lIlIlllIIl[0]];
                                    iArr27[lIlIlllIIl[1]] = lIlIlllIIl[34];
                                    if (lIIlIIllllIlI(Bank.contains(iArr27) ? 1 : 0)) {
                                        int[] iArr28 = new int[lIlIlllIIl[0]];
                                        iArr28[lIlIlllIIl[1]] = lIlIlllIIl[34];
                                    }
                                    iArr13 = new int[lIlIlllIIl[0]];
                                    iArr13[lIlIlllIIl[1]] = lIlIlllIIl[36];
                                    if (lIIlIIllllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                                        int[] iArr29 = new int[lIlIlllIIl[0]];
                                        iArr29[lIlIlllIIl[1]] = lIlIlllIIl[36];
                                        if (!lIIlIIllllIlI(Bank.contains(iArr29) ? 1 : 0)) {
                                            return;
                                        }
                                        int[] iArr30 = new int[lIlIlllIIl[0]];
                                        iArr30[lIlIlllIIl[1]] = lIlIlllIIl[36];
                                        if (!lIIlIIllllIll(Bank.getFirst(iArr30).getQuantity(), lIlIlllIIl[28])) {
                                            return;
                                        }
                                    }
                                    bp.add(new C0003d(lIlIlllIIl[36], lIlIlllIIl[22], lIlIlllIIl[158]));
                                    "".length();
                                }
                                bp.add(new C0003d(lIlIlllIIl[34], lIlIlllIIl[13], C0009j.bZ));
                                "".length();
                                iArr13 = new int[lIlIlllIIl[0]];
                                iArr13[lIlIlllIIl[1]] = lIlIlllIIl[36];
                                if (lIIlIIllllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                                }
                                bp.add(new C0003d(lIlIlllIIl[36], lIlIlllIIl[22], lIlIlllIIl[158]));
                                "".length();
                            }
                            bp.add(new C0003d(lIlIlllIIl[29], lIlIlllIIl[13], lIlIlllIIl[27]));
                            "".length();
                            iArr8 = new int[lIlIlllIIl[0]];
                            iArr8[lIlIlllIIl[1]] = lIlIlllIIl[39];
                            if (lIIlIIlllllII(Bank.contains(iArr8) ? 1 : 0)) {
                            }
                            iArr9 = new int[lIlIlllIIl[0]];
                            iArr9[lIlIlllIIl[1]] = lIlIlllIIl[38];
                            if (lIIlIIlllllII(Bank.contains(iArr9) ? 1 : 0)) {
                            }
                            iArr10 = new int[lIlIlllIIl[0]];
                            iArr10[lIlIlllIIl[1]] = lIlIlllIIl[40];
                            if (lIIlIIlllllII(Bank.contains(iArr10) ? 1 : 0)) {
                            }
                            iArr11 = new int[lIlIlllIIl[0]];
                            iArr11[lIlIlllIIl[1]] = lIlIlllIIl[41];
                            if (lIIlIIlllllII(Bank.contains(iArr11) ? 1 : 0)) {
                            }
                            if (lIIlIIlllllII(Bank.contains(item2 -> {
                                return item2.getName().toLowerCase().contains(lIlIllIllI[lIlIlllIIl[161]]);
                            }) ? 1 : 0)) {
                            }
                            iArr12 = new int[lIlIlllIIl[0]];
                            iArr12[lIlIlllIIl[1]] = lIlIlllIIl[34];
                            if (lIIlIIllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
                            }
                            bp.add(new C0003d(lIlIlllIIl[34], lIlIlllIIl[13], C0009j.bZ));
                            "".length();
                            iArr13 = new int[lIlIlllIIl[0]];
                            iArr13[lIlIlllIIl[1]] = lIlIlllIIl[36];
                            if (lIIlIIllllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                            }
                            bp.add(new C0003d(lIlIlllIIl[36], lIlIlllIIl[22], lIlIlllIIl[158]));
                            "".length();
                        }
                        bp.add(new C0003d(lIlIlllIIl[33], lIlIlllIIl[8], lIlIlllIIl[27]));
                        "".length();
                        iArr7 = new int[lIlIlllIIl[0]];
                        iArr7[lIlIlllIIl[1]] = lIlIlllIIl[29];
                        if (lIIlIIllllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bp.add(new C0003d(lIlIlllIIl[29], lIlIlllIIl[13], lIlIlllIIl[27]));
                        "".length();
                        iArr8 = new int[lIlIlllIIl[0]];
                        iArr8[lIlIlllIIl[1]] = lIlIlllIIl[39];
                        if (lIIlIIlllllII(Bank.contains(iArr8) ? 1 : 0)) {
                        }
                        iArr9 = new int[lIlIlllIIl[0]];
                        iArr9[lIlIlllIIl[1]] = lIlIlllIIl[38];
                        if (lIIlIIlllllII(Bank.contains(iArr9) ? 1 : 0)) {
                        }
                        iArr10 = new int[lIlIlllIIl[0]];
                        iArr10[lIlIlllIIl[1]] = lIlIlllIIl[40];
                        if (lIIlIIlllllII(Bank.contains(iArr10) ? 1 : 0)) {
                        }
                        iArr11 = new int[lIlIlllIIl[0]];
                        iArr11[lIlIlllIIl[1]] = lIlIlllIIl[41];
                        if (lIIlIIlllllII(Bank.contains(iArr11) ? 1 : 0)) {
                        }
                        if (lIIlIIlllllII(Bank.contains(item22 -> {
                            return item22.getName().toLowerCase().contains(lIlIllIllI[lIlIlllIIl[161]]);
                        }) ? 1 : 0)) {
                        }
                        iArr12 = new int[lIlIlllIIl[0]];
                        iArr12[lIlIlllIIl[1]] = lIlIlllIIl[34];
                        if (lIIlIIllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
                        }
                        bp.add(new C0003d(lIlIlllIIl[34], lIlIlllIIl[13], C0009j.bZ));
                        "".length();
                        iArr13 = new int[lIlIlllIIl[0]];
                        iArr13[lIlIlllIIl[1]] = lIlIlllIIl[36];
                        if (lIIlIIllllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                        }
                        bp.add(new C0003d(lIlIlllIIl[36], lIlIlllIIl[22], lIlIlllIIl[158]));
                        "".length();
                    }
                    bp.add(new C0003d(lIlIlllIIl[32], lIlIlllIIl[13], lIlIlllIIl[27]));
                    "".length();
                    iArr6 = new int[lIlIlllIIl[0]];
                    iArr6[lIlIlllIIl[1]] = lIlIlllIIl[33];
                    if (lIIlIIllllIlI(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bp.add(new C0003d(lIlIlllIIl[33], lIlIlllIIl[8], lIlIlllIIl[27]));
                    "".length();
                    iArr7 = new int[lIlIlllIIl[0]];
                    iArr7[lIlIlllIIl[1]] = lIlIlllIIl[29];
                    if (lIIlIIllllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bp.add(new C0003d(lIlIlllIIl[29], lIlIlllIIl[13], lIlIlllIIl[27]));
                    "".length();
                    iArr8 = new int[lIlIlllIIl[0]];
                    iArr8[lIlIlllIIl[1]] = lIlIlllIIl[39];
                    if (lIIlIIlllllII(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    iArr9 = new int[lIlIlllIIl[0]];
                    iArr9[lIlIlllIIl[1]] = lIlIlllIIl[38];
                    if (lIIlIIlllllII(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    iArr10 = new int[lIlIlllIIl[0]];
                    iArr10[lIlIlllIIl[1]] = lIlIlllIIl[40];
                    if (lIIlIIlllllII(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                    iArr11 = new int[lIlIlllIIl[0]];
                    iArr11[lIlIlllIIl[1]] = lIlIlllIIl[41];
                    if (lIIlIIlllllII(Bank.contains(iArr11) ? 1 : 0)) {
                    }
                    if (lIIlIIlllllII(Bank.contains(item222 -> {
                        return item222.getName().toLowerCase().contains(lIlIllIllI[lIlIlllIIl[161]]);
                    }) ? 1 : 0)) {
                    }
                    iArr12 = new int[lIlIlllIIl[0]];
                    iArr12[lIlIlllIIl[1]] = lIlIlllIIl[34];
                    if (lIIlIIllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
                    }
                    bp.add(new C0003d(lIlIlllIIl[34], lIlIlllIIl[13], C0009j.bZ));
                    "".length();
                    iArr13 = new int[lIlIlllIIl[0]];
                    iArr13[lIlIlllIIl[1]] = lIlIlllIIl[36];
                    if (lIIlIIllllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                    }
                    bp.add(new C0003d(lIlIlllIIl[36], lIlIlllIIl[22], lIlIlllIIl[158]));
                    "".length();
                }
                bp.add(new C0003d(lIlIlllIIl[31], lIlIlllIIl[28], lIlIlllIIl[150]));
                "".length();
                iArr3 = new int[lIlIlllIIl[0]];
                iArr3[lIlIlllIIl[1]] = lIlIlllIIl[103];
                if (lIIlIIlllllII(Bank.contains(iArr3) ? 1 : 0)) {
                }
                iArr4 = new int[lIlIlllIIl[0]];
                iArr4[lIlIlllIIl[1]] = lIlIlllIIl[37];
                if (lIIlIIlllllII(Bank.contains(iArr4) ? 1 : 0)) {
                }
                iArr5 = new int[lIlIlllIIl[0]];
                iArr5[lIlIlllIIl[1]] = lIlIlllIIl[32];
                if (lIIlIIllllIlI(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bp.add(new C0003d(lIlIlllIIl[32], lIlIlllIIl[13], lIlIlllIIl[27]));
                "".length();
                iArr6 = new int[lIlIlllIIl[0]];
                iArr6[lIlIlllIIl[1]] = lIlIlllIIl[33];
                if (lIIlIIllllIlI(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bp.add(new C0003d(lIlIlllIIl[33], lIlIlllIIl[8], lIlIlllIIl[27]));
                "".length();
                iArr7 = new int[lIlIlllIIl[0]];
                iArr7[lIlIlllIIl[1]] = lIlIlllIIl[29];
                if (lIIlIIllllIlI(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bp.add(new C0003d(lIlIlllIIl[29], lIlIlllIIl[13], lIlIlllIIl[27]));
                "".length();
                iArr8 = new int[lIlIlllIIl[0]];
                iArr8[lIlIlllIIl[1]] = lIlIlllIIl[39];
                if (lIIlIIlllllII(Bank.contains(iArr8) ? 1 : 0)) {
                }
                iArr9 = new int[lIlIlllIIl[0]];
                iArr9[lIlIlllIIl[1]] = lIlIlllIIl[38];
                if (lIIlIIlllllII(Bank.contains(iArr9) ? 1 : 0)) {
                }
                iArr10 = new int[lIlIlllIIl[0]];
                iArr10[lIlIlllIIl[1]] = lIlIlllIIl[40];
                if (lIIlIIlllllII(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[lIlIlllIIl[0]];
                iArr11[lIlIlllIIl[1]] = lIlIlllIIl[41];
                if (lIIlIIlllllII(Bank.contains(iArr11) ? 1 : 0)) {
                }
                if (lIIlIIlllllII(Bank.contains(item2222 -> {
                    return item2222.getName().toLowerCase().contains(lIlIllIllI[lIlIlllIIl[161]]);
                }) ? 1 : 0)) {
                }
                iArr12 = new int[lIlIlllIIl[0]];
                iArr12[lIlIlllIIl[1]] = lIlIlllIIl[34];
                if (lIIlIIllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
                }
                bp.add(new C0003d(lIlIlllIIl[34], lIlIlllIIl[13], C0009j.bZ));
                "".length();
                iArr13 = new int[lIlIlllIIl[0]];
                iArr13[lIlIlllIIl[1]] = lIlIlllIIl[36];
                if (lIIlIIllllIlI(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bp.add(new C0003d(lIlIlllIIl[36], lIlIlllIIl[22], lIlIlllIIl[158]));
                "".length();
            }
            bp.add(new C0003d(lIlIlllIIl[30], lIlIlllIIl[16], lIlIlllIIl[149]));
            "".length();
            iArr2 = new int[lIlIlllIIl[0]];
            iArr2[lIlIlllIIl[1]] = lIlIlllIIl[31];
            if (lIIlIIllllIlI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bp.add(new C0003d(lIlIlllIIl[31], lIlIlllIIl[28], lIlIlllIIl[150]));
            "".length();
            iArr3 = new int[lIlIlllIIl[0]];
            iArr3[lIlIlllIIl[1]] = lIlIlllIIl[103];
            if (lIIlIIlllllII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIlIlllIIl[0]];
            iArr4[lIlIlllIIl[1]] = lIlIlllIIl[37];
            if (lIIlIIlllllII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIlIlllIIl[0]];
            iArr5[lIlIlllIIl[1]] = lIlIlllIIl[32];
            if (lIIlIIllllIlI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bp.add(new C0003d(lIlIlllIIl[32], lIlIlllIIl[13], lIlIlllIIl[27]));
            "".length();
            iArr6 = new int[lIlIlllIIl[0]];
            iArr6[lIlIlllIIl[1]] = lIlIlllIIl[33];
            if (lIIlIIllllIlI(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bp.add(new C0003d(lIlIlllIIl[33], lIlIlllIIl[8], lIlIlllIIl[27]));
            "".length();
            iArr7 = new int[lIlIlllIIl[0]];
            iArr7[lIlIlllIIl[1]] = lIlIlllIIl[29];
            if (lIIlIIllllIlI(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bp.add(new C0003d(lIlIlllIIl[29], lIlIlllIIl[13], lIlIlllIIl[27]));
            "".length();
            iArr8 = new int[lIlIlllIIl[0]];
            iArr8[lIlIlllIIl[1]] = lIlIlllIIl[39];
            if (lIIlIIlllllII(Bank.contains(iArr8) ? 1 : 0)) {
            }
            iArr9 = new int[lIlIlllIIl[0]];
            iArr9[lIlIlllIIl[1]] = lIlIlllIIl[38];
            if (lIIlIIlllllII(Bank.contains(iArr9) ? 1 : 0)) {
            }
            iArr10 = new int[lIlIlllIIl[0]];
            iArr10[lIlIlllIIl[1]] = lIlIlllIIl[40];
            if (lIIlIIlllllII(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[lIlIlllIIl[0]];
            iArr11[lIlIlllIIl[1]] = lIlIlllIIl[41];
            if (lIIlIIlllllII(Bank.contains(iArr11) ? 1 : 0)) {
            }
            if (lIIlIIlllllII(Bank.contains(item22222 -> {
                return item22222.getName().toLowerCase().contains(lIlIllIllI[lIlIlllIIl[161]]);
            }) ? 1 : 0)) {
            }
            iArr12 = new int[lIlIlllIIl[0]];
            iArr12[lIlIlllIIl[1]] = lIlIlllIIl[34];
            if (lIIlIIllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
            }
            bp.add(new C0003d(lIlIlllIIl[34], lIlIlllIIl[13], C0009j.bZ));
            "".length();
            iArr13 = new int[lIlIlllIIl[0]];
            iArr13[lIlIlllIIl[1]] = lIlIlllIIl[36];
            if (lIIlIIllllIlI(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bp.add(new C0003d(lIlIlllIIl[36], lIlIlllIIl[22], lIlIlllIIl[158]));
            "".length();
        }
        bp.add(new C0003d(lIlIlllIIl[43], lIlIlllIIl[4], C0004e.c(lIlIlllIIl[147], lIlIlllIIl[148])));
        "".length();
        iArr = new int[lIlIlllIIl[0]];
        iArr[lIlIlllIIl[1]] = lIlIlllIIl[30];
        if (lIIlIIllllIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIlllIIl[30], lIlIlllIIl[16], lIlIlllIIl[149]));
        "".length();
        iArr2 = new int[lIlIlllIIl[0]];
        iArr2[lIlIlllIIl[1]] = lIlIlllIIl[31];
        if (lIIlIIllllIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIlllIIl[31], lIlIlllIIl[28], lIlIlllIIl[150]));
        "".length();
        iArr3 = new int[lIlIlllIIl[0]];
        iArr3[lIlIlllIIl[1]] = lIlIlllIIl[103];
        if (lIIlIIlllllII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIlIlllIIl[0]];
        iArr4[lIlIlllIIl[1]] = lIlIlllIIl[37];
        if (lIIlIIlllllII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIlIlllIIl[0]];
        iArr5[lIlIlllIIl[1]] = lIlIlllIIl[32];
        if (lIIlIIllllIlI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIlllIIl[32], lIlIlllIIl[13], lIlIlllIIl[27]));
        "".length();
        iArr6 = new int[lIlIlllIIl[0]];
        iArr6[lIlIlllIIl[1]] = lIlIlllIIl[33];
        if (lIIlIIllllIlI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIlllIIl[33], lIlIlllIIl[8], lIlIlllIIl[27]));
        "".length();
        iArr7 = new int[lIlIlllIIl[0]];
        iArr7[lIlIlllIIl[1]] = lIlIlllIIl[29];
        if (lIIlIIllllIlI(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIlllIIl[29], lIlIlllIIl[13], lIlIlllIIl[27]));
        "".length();
        iArr8 = new int[lIlIlllIIl[0]];
        iArr8[lIlIlllIIl[1]] = lIlIlllIIl[39];
        if (lIIlIIlllllII(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIlIlllIIl[0]];
        iArr9[lIlIlllIIl[1]] = lIlIlllIIl[38];
        if (lIIlIIlllllII(Bank.contains(iArr9) ? 1 : 0)) {
        }
        iArr10 = new int[lIlIlllIIl[0]];
        iArr10[lIlIlllIIl[1]] = lIlIlllIIl[40];
        if (lIIlIIlllllII(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[lIlIlllIIl[0]];
        iArr11[lIlIlllIIl[1]] = lIlIlllIIl[41];
        if (lIIlIIlllllII(Bank.contains(iArr11) ? 1 : 0)) {
        }
        if (lIIlIIlllllII(Bank.contains(item222222 -> {
            return item222222.getName().toLowerCase().contains(lIlIllIllI[lIlIlllIIl[161]]);
        }) ? 1 : 0)) {
        }
        iArr12 = new int[lIlIlllIIl[0]];
        iArr12[lIlIlllIIl[1]] = lIlIlllIIl[34];
        if (lIIlIIllllIlI(Bank.contains(iArr12) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIlllIIl[34], lIlIlllIIl[13], C0009j.bZ));
        "".length();
        iArr13 = new int[lIlIlllIIl[0]];
        iArr13[lIlIlllIIl[1]] = lIlIlllIIl[36];
        if (lIIlIIllllIlI(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIlllIIl[36], lIlIlllIIl[22], lIlIlllIIl[158]));
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIIllllllI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[2])) {
            ?? r0 = lIlIlllIIl[0];
            "".length();
            return (-" ".length()) > (193 ^ 197) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlllIIl[1];
    }

    private static boolean lIIlIlIIIIIIl(int i) {
        return i < 0;
    }

    private static boolean lIIlIlIIIIIII(int i) {
        return i > 0;
    }

    private static void lIIlIIllllIII() {
        lIlIlllIIl = new int[182];
        lIlIlllIIl[0] = " ".length();
        lIlIlllIIl[1] = (42 ^ 123) & ((127 ^ 46) ^ (-1)) & (((71 ^ 101) & ((156 ^ 190) ^ (-1))) ^ (-1));
        lIlIlllIIl[2] = (((((22 + 116) - 37) + 40) + (((76 + 127) - 102) + 136)) - (((68 + 133) - 40) + 78)) + (46 ^ 75);
        lIlIlllIIl[3] = 52 ^ 117;
        lIlIlllIIl[4] = (87 ^ 112) ^ (106 ^ 71);
        lIlIlllIIl[5] = (-29186) & 29487;
        lIlIlllIIl[6] = (52 ^ 89) ^ (104 ^ 57);
        lIlIlllIIl[7] = (-25613) & 25919;
        lIlIlllIIl[8] = (229 ^ 145) ^ (21 ^ 100);
        lIlIlllIIl[9] = "  ".length();
        lIlIlllIIl[10] = (((95 + 98) - 173) + 116) ^ (((111 + 1) - 65) + 121);
        lIlIlllIIl[11] = "   ".length();
        lIlIlllIIl[12] = (6 ^ 97) ^ (64 ^ 52);
        lIlIlllIIl[13] = (((91 + 90) - 103) + 56) ^ (((76 + 126) - 187) + 115);
        lIlIlllIIl[14] = 46 ^ 13;
        lIlIlllIIl[15] = (80 ^ 84) ^ (83 ^ 101);
        lIlIlllIIl[16] = (76 ^ 7) ^ (196 ^ 137);
        lIlIlllIIl[17] = (-29697) & 30706;
        lIlIlllIIl[18] = (-28673) & 30748;
        lIlIlllIIl[19] = 80 ^ 89;
        lIlIlllIIl[20] = 174 ^ 169;
        lIlIlllIIl[21] = (((21 + 27) - 17) + 104) ^ (((129 + 8) - 114) + 120);
        lIlIlllIIl[22] = 66 ^ 106;
        lIlIlllIIl[23] = (19 ^ 121) ^ (2 ^ 99);
        lIlIlllIIl[24] = 134 ^ 138;
        lIlIlllIIl[25] = 61 ^ 48;
        lIlIlllIIl[26] = (14 ^ 18) ^ (19 ^ 1);
        lIlIlllIIl[27] = (-24610) & 29609;
        lIlIlllIIl[28] = 171 ^ 164;
        lIlIlllIIl[29] = (-28725) & 30655;
        lIlIlllIIl[30] = (-((-17627) & 30427)) & (-33) & 32447;
        lIlIlllIIl[31] = (-531) & 20151;
        lIlIlllIIl[32] = (-((-9039) & 13167)) & (-210) & 4863;
        lIlIlllIIl[33] = (-((-16769) & 17297)) & (-193) & 3071;
        lIlIlllIIl[34] = (-((-1301) & 20415)) & (-1025) & 32763;
        lIlIlllIIl[35] = (143 ^ 164) ^ (113 ^ 74);
        lIlIlllIIl[36] = (-8353) & 16359;
        lIlIlllIIl[37] = (-12337) & 13691;
        lIlIlllIIl[38] = (-((-2291) & 10483)) & (-1041) & 11579;
        lIlIlllIIl[39] = (-((-521) & 31545)) & (-1) & 32767;
        lIlIlllIIl[40] = (-((-5398) & 32095)) & (-1) & 28415;
        lIlIlllIIl[41] = (-((-24869) & 30647)) & (-16389) & 32662;
        lIlIlllIIl[42] = 115 ^ 98;
        lIlIlllIIl[43] = (-((-8971) & 25391)) & (-8321) & 32750;
        lIlIlllIIl[44] = (-((-4277) & 23990)) & (-8323) & 28587;
        lIlIlllIIl[45] = (-10265) & 11259;
        lIlIlllIIl[46] = 170 ^ 184;
        lIlIlllIIl[47] = 181 ^ 173;
        lIlIlllIIl[48] = 151 ^ 131;
        lIlIlllIIl[49] = (166 ^ 145) ^ (3 ^ 33);
        lIlIlllIIl[50] = (((101 + 70) - 116) + 84) ^ (((13 + 89) - (-8)) + 47);
        lIlIlllIIl[51] = (180 ^ 160) ^ "   ".length();
        lIlIlllIIl[52] = (-8643) & 11739;
        lIlIlllIIl[53] = (-((-17698) & 25965)) & (-4113) & 15739;
        lIlIlllIIl[54] = 108 ^ 117;
        lIlIlllIIl[55] = (113 ^ 31) ^ (14 ^ 122);
        lIlIlllIIl[56] = (-8806) & 12159;
        lIlIlllIIl[57] = 108 ^ 119;
        lIlIlllIIl[58] = (88 ^ 101) ^ (79 ^ 110);
        lIlIlllIIl[59] = (((9 + 12) - (-89)) + 22) ^ (((116 + 42) - 86) + 81);
        lIlIlllIIl[60] = (-((-4099) & 32515)) & (-2) & 32695;
        lIlIlllIIl[61] = (-16643) & 20307;
        lIlIlllIIl[62] = (-((-4207) & 29295)) & (-65) & 28671;
        lIlIlllIIl[63] = (-8961) & 13246;
        lIlIlllIIl[64] = (54 ^ 106) ^ (28 ^ 94);
        lIlIlllIIl[65] = (21 ^ 67) ^ (39 ^ 110);
        lIlIlllIIl[66] = 28 ^ 61;
        lIlIlllIIl[67] = 89 ^ 123;
        lIlIlllIIl[68] = 76 ^ 104;
        lIlIlllIIl[69] = 35 ^ 6;
        lIlIlllIIl[70] = 116 ^ 82;
        lIlIlllIIl[71] = (108 ^ 119) ^ (184 ^ 132);
        lIlIlllIIl[72] = (116 ^ 62) ^ (126 ^ 29);
        lIlIlllIIl[73] = (-121) & 58620;
        lIlIlllIIl[74] = (-155) & 63454;
        lIlIlllIIl[75] = 101 ^ 79;
        lIlIlllIIl[76] = (179 ^ 149) ^ (188 ^ 177);
        lIlIlllIIl[77] = 176 ^ 156;
        lIlIlllIIl[78] = (118 ^ 84) ^ (149 ^ 154);
        lIlIlllIIl[79] = 77 ^ 99;
        lIlIlllIIl[80] = 168 ^ 135;
        lIlIlllIIl[81] = (28 ^ 59) ^ (208 ^ 199);
        lIlIlllIIl[82] = 11 ^ 58;
        lIlIlllIIl[83] = (-((-743) & 15087)) & (-35) & 16303;
        lIlIlllIIl[84] = 156 ^ 175;
        lIlIlllIIl[85] = (((40 + 41) - 59) + 118) ^ (((131 + 132) - 119) + 40);
        lIlIlllIIl[86] = 59 ^ 14;
        lIlIlllIIl[87] = "   ".length() ^ (120 ^ 77);
        lIlIlllIIl[88] = (17 ^ 117) ^ (212 ^ 135);
        lIlIlllIIl[89] = 36 ^ 98;
        lIlIlllIIl[90] = (57 ^ 34) ^ (95 ^ 13);
        lIlIlllIIl[91] = (-8793) & 12254;
        lIlIlllIIl[92] = (-4113) & 7671;
        lIlIlllIIl[93] = 119 ^ 79;
        lIlIlllIIl[94] = (250 ^ 199) ^ (24 ^ 28);
        lIlIlllIIl[95] = 89 ^ 21;
        lIlIlllIIl[96] = 185 ^ 131;
        lIlIlllIIl[97] = (((96 + 116) - 38) + 26) ^ (((96 + 66) - 105) + 95);
        lIlIlllIIl[98] = (((48 + 72) - 51) + 86) ^ (((7 + 132) - 41) + 62);
        lIlIlllIIl[99] = 159 ^ 197;
        lIlIlllIIl[100] = 86 ^ 50;
        lIlIlllIIl[101] = 248 ^ 197;
        lIlIlllIIl[102] = 99 ^ 93;
        lIlIlllIIl[103] = (-(8 ^ 27)) & (-16513) & 20383;
        lIlIlllIIl[104] = 161 ^ 158;
        lIlIlllIIl[105] = (((43 + 87) - (-74)) + 23) ^ (((57 + 116) - 48) + 30);
        lIlIlllIIl[106] = (((61 ^ 18) + (((12 + 55) - 1) + 62)) - (120 ^ 2)) + (14 ^ 67);
        lIlIlllIIl[107] = 16 ^ 80;
        lIlIlllIIl[108] = ((53 + 126) - 55) + 16;
        lIlIlllIIl[109] = 135 ^ 197;
        lIlIlllIIl[110] = (-21581) & 24557;
        lIlIlllIIl[111] = (-17153) & 20391;
        lIlIlllIIl[112] = (-((-9289) & 26457)) & (-12356) & 32763;
        lIlIlllIIl[113] = 67 ^ 0;
        lIlIlllIIl[114] = 224 ^ 164;
        lIlIlllIIl[115] = 85 ^ 16;
        lIlIlllIIl[116] = ((59 + 49) - (-18)) + 24;
        lIlIlllIIl[117] = (-987) & 4095;
        lIlIlllIIl[118] = (-((-22529) & 31438)) & (-4097) & 16351;
        lIlIlllIIl[119] = (((215 + 226) - 292) + 88) ^ (((46 + 47) - (-76)) + 1);
        lIlIlllIIl[120] = 109 ^ 37;
        lIlIlllIIl[121] = (((28 ^ 85) + (195 ^ 163)) - (((105 + 59) - 74) + 58)) + ((7 + 131) - 60) + 61;
        lIlIlllIIl[122] = ((63 + 143) - 59) + 23;
        lIlIlllIIl[123] = (-20621) & 23551;
        lIlIlllIIl[124] = (-25136) & 28671;
        lIlIlllIIl[125] = 102 ^ 44;
        lIlIlllIIl[126] = 204 ^ 135;
        lIlIlllIIl[127] = (((142 ^ 153) + (((39 + 17) - 27) + 123)) - (217 ^ 188)) + (115 ^ 25);
        lIlIlllIIl[128] = 19 ^ 94;
        lIlIlllIIl[129] = 140 ^ 194;
        lIlIlllIIl[130] = 244 ^ 187;
        lIlIlllIIl[131] = ((163 + 19) - 16) + 24;
        lIlIlllIIl[132] = ((166 + 121) - 223) + 136;
        lIlIlllIIl[133] = (-28) & 507;
        lIlIlllIIl[134] = 26 ^ 75;
        lIlIlllIIl[135] = (209 ^ 180) ^ (124 ^ 75);
        lIlIlllIIl[136] = ((156 + 21) - 3) + 36;
        lIlIlllIIl[137] = ((112 + 88) - 176) + 196;
        lIlIlllIIl[138] = (((148 + 59) - 105) + 144) ^ (((29 + 15) - (-48)) + 73);
        lIlIlllIIl[139] = (136 ^ 198) ^ (111 ^ 117);
        lIlIlllIIl[140] = 25 ^ 76;
        lIlIlllIIl[141] = (((113 ^ 22) + (130 ^ 149)) - (231 ^ 171)) + ((43 + 172) - 106) + 71;
        lIlIlllIIl[142] = 149 ^ 195;
        lIlIlllIIl[143] = 117 ^ 34;
        lIlIlllIIl[144] = (58 ^ 118) ^ (78 ^ 90);
        lIlIlllIIl[145] = 65 ^ 24;
        lIlIlllIIl[146] = (39 ^ 102) ^ (223 ^ 197);
        lIlIlllIIl[147] = (-((-12493) & 29391)) & (-12290) & 30587;
        lIlIlllIIl[148] = (-2111) & 3710;
        lIlIlllIIl[149] = (-5010) & 14329;
        lIlIlllIIl[150] = (-1158) & 8157;
        lIlIlllIIl[151] = (-((-26277) & 32431)) & (-16422) & 24575;
        lIlIlllIIl[152] = (-((-1454) & 28671)) & (-1) & 32767;
        lIlIlllIIl[153] = (-((-1098) & 5231)) & (-27) & 30719;
        lIlIlllIIl[154] = (-27651) & 28650;
        lIlIlllIIl[155] = (-((-18705) & 23441)) & (-24577) & 32767;
        lIlIlllIIl[156] = (-257) & 12236;
        lIlIlllIIl[157] = (-5701) & 30700;
        lIlIlllIIl[158] = (-18476) & 19775;
        lIlIlllIIl[159] = 157 ^ 193;
        lIlIlllIIl[160] = (((48 + 70) - 95) + 189) ^ (((46 + 29) - (-19)) + 43);
        lIlIlllIIl[161] = 65 ^ 31;
        lIlIlllIIl[162] = (((136 + 161) - 220) + 136) ^ (((45 + 100) - 119) + 112);
        lIlIlllIIl[163] = (-((-19461) & 20453)) & (-16385) & 20467;
        lIlIlllIIl[164] = (-((-3073) & 32403)) & (-1) & 32767;
        lIlIlllIIl[165] = (-((-3749) & 20133)) & (-8273) & 28157;
        lIlIlllIIl[166] = (((((83 + 38) - (-90)) + 36) + (((51 + 87) - 124) + 172)) - ((-13469) & 13822)) + ((72 + 149) - 201) + 156;
        lIlIlllIIl[167] = (-((-1173) & 30207)) & (-1) & 32127;
        lIlIlllIIl[168] = (-((-5429) & 14198)) & (-1) & 12127;
        lIlIlllIIl[169] = (-((-27337) & 32459)) & (-24833) & 32751;
        lIlIlllIIl[170] = (-4266) & 7679;
        lIlIlllIIl[171] = (-16537) & 20156;
        lIlIlllIIl[172] = (-((-7591) & 32687)) & (-4113) & 32735;
        lIlIlllIIl[173] = 106 ^ 10;
        lIlIlllIIl[174] = 61 ^ 92;
        lIlIlllIIl[175] = 194 ^ 160;
        lIlIlllIIl[176] = 67 ^ 32;
        lIlIlllIIl[177] = (((87 + 117) - 14) + 27) ^ (((90 + 56) - 86) + 128);
        lIlIlllIIl[178] = 50 ^ 84;
        lIlIlllIIl[179] = (((40 + 177) - 127) + 102) ^ (((73 + 152) - 68) + 10);
        lIlIlllIIl[180] = 79 ^ 39;
        lIlIlllIIl[181] = 39 ^ 78;
    }

    private static String lIIlIIllIlIII(String lllllllllllllllllllIlIIIIIlIIIlI, String lllllllllllllllllllIlIIIIIlIIIIl) {
        try {
            SecretKeySpec lllllllllllllllllllIlIIIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIlllIIl[21]), "DES");
            Cipher lllllllllllllllllllIlIIIIIlIIlII = Cipher.getInstance("DES");
            lllllllllllllllllllIlIIIIIlIIlII.init(lIlIlllIIl[9], lllllllllllllllllllIlIIIIIlIIlIl);
            return new String(lllllllllllllllllllIlIIIIIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlIIIIIlIIIll) {
            lllllllllllllllllllIlIIIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIlIIIIlII(int i, int i2) {
        return i != i2;
    }

    private static String lIIlIIllIIllI(String lllllllllllllllllllIlIIIIIlIllll, String lllllllllllllllllllIlIIIIIlIlllI) {
        try {
            SecretKeySpec lllllllllllllllllllIlIIIIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIIIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlllIIl[9], lllllllllllllllllllIlIIIIIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlIIIIIllIIII) {
            lllllllllllllllllllIlIIIIIllIIII.printStackTrace();
            return null;
        }
    }

    private static int lIIlIIllllIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIIlIlIIIIlIl(dl, lIlIllIllI[lIlIlllIIl[159]]) ? lIlIllIllI[lIlIlllIIl[160]] : "Animal Magnetism - " + dl;
    }

    private static boolean lIIlIIllllIll(int i, int i2) {
        return i < i2;
    }
}
