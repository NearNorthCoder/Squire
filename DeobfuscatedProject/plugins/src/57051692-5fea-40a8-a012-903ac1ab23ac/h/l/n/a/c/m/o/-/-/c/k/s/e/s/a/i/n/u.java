/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.B;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.C;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.F;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.V;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Y;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.n;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.o;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.t;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.v;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.x;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.z;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
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

public class u
implements K {
    static /* synthetic */ WorldPoint di;
    static /* synthetic */ WorldArea dh;
    private static /* synthetic */ int dk;
    private static /* synthetic */ int[] lIlIlllIIl;
    public static /* synthetic */ List<d> bp;
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

    private static boolean lIIlIlIIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int ad() {
        try {
            u.bc();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("  ".length() == 0) {
            return (0x4C ^ 0x18) & ~(0x5F ^ 0xB);
        }
        return lIlIlllIIl[100];
    }

    private static boolean lIIlIIlllllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIllllIlI(int n2) {
        return n2 != 0;
    }

    static {
        u.lIIlIIllllIII();
        u.lIIlIIlllIlII();
        bp = new ArrayList<d>();
        df = new WorldArea(lIlIlllIIl[163], lIlIlllIIl[56], lIlIlllIIl[16], lIlIlllIIl[4], lIlIlllIIl[1]);
        dg = new WorldArea(lIlIlllIIl[164], lIlIlllIIl[165], lIlIlllIIl[166], lIlIlllIIl[142], lIlIlllIIl[1]);
        dh = new WorldArea(lIlIlllIIl[164], lIlIlllIIl[165], lIlIlllIIl[166], lIlIlllIIl[142], lIlIlllIIl[0]);
        cV = new WorldPoint(lIlIlllIIl[167], lIlIlllIIl[168], lIlIlllIIl[1]);
        di = new WorldPoint(lIlIlllIIl[169], lIlIlllIIl[170], lIlIlllIIl[1]);
        dj = new WorldPoint(lIlIlllIIl[171], lIlIlllIIl[172], lIlIlllIIl[1]);
        String[] stringArray = new String[lIlIlllIIl[21]];
        stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[173]];
        stringArray[u.lIlIlllIIl[0]] = lIlIllIllI[lIlIlllIIl[174]];
        stringArray[u.lIlIlllIIl[9]] = lIlIllIllI[lIlIlllIIl[175]];
        stringArray[u.lIlIlllIIl[11]] = lIlIllIllI[lIlIlllIIl[176]];
        stringArray[u.lIlIlllIIl[13]] = lIlIllIllI[lIlIlllIIl[100]];
        stringArray[u.lIlIlllIIl[8]] = lIlIllIllI[lIlIlllIIl[177]];
        stringArray[u.lIlIlllIIl[16]] = lIlIllIllI[lIlIlllIIl[178]];
        stringArray[u.lIlIlllIIl[20]] = lIlIllIllI[lIlIlllIIl[179]];
        cy = stringArray;
        dk = lIlIlllIIl[1];
        dl = lIlIllIllI[lIlIlllIIl[180]];
    }

    private static String lIIlIIllIIlll(String lllllllllllllllllllIlIIIIIIIllIl, String lllllllllllllllllllIlIIIIIIIllII) {
        lllllllllllllllllllIlIIIIIIIllIl = new String(Base64.getDecoder().decode(lllllllllllllllllllIlIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIlIIIIIIlIIII = new StringBuilder();
        char[] lllllllllllllllllllIlIIIIIIIllll = lllllllllllllllllllIlIIIIIIIllII.toCharArray();
        int lllllllllllllllllllIlIIIIIIIlllI = lIlIlllIIl[1];
        char[] lllllllllllllllllllIlIIIIIIIlIII = lllllllllllllllllllIlIIIIIIIllIl.toCharArray();
        int lllllllllllllllllllIlIIIIIIIIlll = lllllllllllllllllllIlIIIIIIIlIII.length;
        int lllllllllllllllllllIlIIIIIIIIllI = lIlIlllIIl[1];
        while (u.lIIlIIllllIll(lllllllllllllllllllIlIIIIIIIIllI, lllllllllllllllllllIlIIIIIIIIlll)) {
            char lllllllllllllllllllIlIIIIIIlIIll = lllllllllllllllllllIlIIIIIIIlIII[lllllllllllllllllllIlIIIIIIIIllI];
            lllllllllllllllllllIlIIIIIIlIIII.append((char)(lllllllllllllllllllIlIIIIIIlIIll ^ lllllllllllllllllllIlIIIIIIIllll[lllllllllllllllllllIlIIIIIIIlllI % lllllllllllllllllllIlIIIIIIIllll.length]));
            "".length();
            ++lllllllllllllllllllIlIIIIIIIlllI;
            ++lllllllllllllllllllIlIIIIIIIIllI;
            "".length();
            if ("   ".length() != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIlIIIIIIlIIII);
    }

    private static boolean lIIlIIlllllll(Object object) {
        return object != null;
    }

    private static void lIIlIIlllIlII() {
        lIlIllIllI = new String[lIlIlllIIl[181]];
        u.lIlIllIllI[u.lIlIlllIIl[1]] = u.lIIlIIllIIllI("vQOKlhY36FAI/ZcxSlK5Kt38Y9iWLkUsmQcsxevM1/+CDJEOquvX/YOX8u4gc1bF", "AQJJV");
        u.lIlIllIllI[u.lIlIlllIIl[0]] = u.lIIlIIllIIlll("PCU6ERENJSIY", "kDNtc");
        u.lIlIllIllI[u.lIlIlllIIl[9]] = u.lIIlIIllIIlll("Pz0aLTgbbxomaz8qASEn", "oOsHK");
        u.lIlIllIllI[u.lIlIlllIIl[11]] = u.lIIlIIllIIllI("Dl6Q+yQ0R3J9EXQXjUklbu3IQndjU5ay", "oUkkh");
        u.lIlIllIllI[u.lIlIlllIIl[13]] = u.lIIlIIllIIlll("BwYTMAAtGhU=", "DtrVt");
        u.lIlIllIllI[u.lIlIlllIIl[8]] = u.lIIlIIllIlIII("O+riMZVUqp4qXFuK2WCHMw==", "Uqsdb");
        u.lIlIllIllI[u.lIlIlllIIl[16]] = u.lIIlIIllIlIII("99PSHqWaEOkda1Z/G/zKBg==", "anhyo");
        u.lIlIllIllI[u.lIlIlllIIl[20]] = u.lIIlIIllIlIII("kaqlgJVvkNOl76skKd/EKw==", "bCwby");
        u.lIlIllIllI[u.lIlIlllIIl[21]] = u.lIIlIIllIIlll("OAsNYwAdLDsl", "jMICD");
        u.lIlIllIllI[u.lIlIlllIIl[19]] = u.lIIlIIllIIllI("7l4InIYsdlW/FliHQ+5NQQ==", "XNQWh");
        u.lIlIllIllI[u.lIlIlllIIl[4]] = u.lIIlIIllIlIII("Yp0Pi38jgUtJDQXJxk2EnQ==", "iWrIS");
        u.lIlIllIllI[u.lIlIlllIIl[23]] = u.lIIlIIllIIllI("bNTmiy4VCkA1IS68FyhkziUEq9+3XBjT", "Skchz");
        u.lIlIllIllI[u.lIlIlllIIl[24]] = u.lIIlIIllIIllI("wSWlH3+GC6jxohDJWPPp0Q==", "LoQVR");
        u.lIlIllIllI[u.lIlIlllIIl[25]] = u.lIIlIIllIlIII("LQhRsnJzlBU=", "ijRbv");
        u.lIlIllIllI[u.lIlIlllIIl[26]] = u.lIIlIIllIIllI("ysmAZc7y7vj6WY84l8Hbnw==", "nfUSA");
        u.lIlIllIllI[u.lIlIlllIIl[28]] = u.lIIlIIllIIllI("BBrybzeWnp15UK3caD4co4LcMFk06wkl", "deXtB");
        u.lIlIllIllI[u.lIlIlllIIl[35]] = u.lIIlIIllIIlll("IDBnGDASdSoQMQQ8KR5iBiAiCjZXJjIJMhs8IgpuVyYwEDYUPS4XJVchKFkAIgwONwU=", "wUGyB");
        u.lIlIllIllI[u.lIlIlllIIl[42]] = u.lIIlIIllIIllI("bCH3sdJru+idG+dkRkhuT7xvk6smaB910s8po2C80UPOkXL7wJMsejAq3gGrabxZwJ1GmclbCGY=", "AUDcs");
        u.lIlIllIllI[u.lIlIlllIIl[46]] = u.lIIlIIllIIllI("F2mHS3SxZT4=", "HqjwK");
        u.lIlIllIllI[u.lIlIlllIIl[12]] = u.lIIlIIllIlIII("iW7KSSoni2s=", "ZHuZE");
        u.lIlIllIllI[u.lIlIlllIIl[48]] = u.lIIlIIllIlIII("xpIbzLwa93o=", "KanLI");
        u.lIlIllIllI[u.lIlIlllIIl[49]] = u.lIIlIIllIIlll("JgMnPzo=", "ukFMQ");
        u.lIlIllIllI[u.lIlIlllIIl[50]] = u.lIIlIIllIlIII("1iM7fpjnQP0=", "lKfaY");
        u.lIlIllIllI[u.lIlIlllIIl[51]] = u.lIIlIIllIlIII("yk15Y5Kbl6tAlQe88dGOXw==", "lPOPL");
        u.lIlIllIllI[u.lIlIlllIIl[47]] = u.lIIlIIllIIllI("wRCMM5xX/Bw=", "xILJJ");
        u.lIlIllIllI[u.lIlIlllIIl[54]] = u.lIIlIIllIIllI("TI4aNBVFtLp0Y3D9rAvXAg==", "Bjogz");
        u.lIlIllIllI[u.lIlIlllIIl[55]] = u.lIIlIIllIIllI("ztbbv11ct9U=", "XEIfj");
        u.lIlIllIllI[u.lIlIlllIIl[57]] = u.lIIlIIllIlIII("wZtlZI5SuJpgQ5aIJftcHg==", "aArpT");
        u.lIlIllIllI[u.lIlIlllIIl[58]] = u.lIIlIIllIIllI("LQ6A8ub5pp0=", "SwjjS");
        u.lIlIllIllI[u.lIlIlllIIl[59]] = u.lIIlIIllIIllI("Iikb1Se2pos=", "XeLms");
        u.lIlIllIllI[u.lIlIlllIIl[64]] = u.lIIlIIllIIlll("OiUFbDcbZBAkIgYwFj4=", "tDsLC");
        u.lIlIllIllI[u.lIlIlllIIl[65]] = u.lIIlIIllIlIII("W64OIktUMjgkDADQl/JbHCVqsKSy02YE", "bhZWp");
        u.lIlIllIllI[u.lIlIlllIIl[10]] = u.lIIlIIllIlIII("Kfm9O7gPw8c=", "iUgVg");
        u.lIlIllIllI[u.lIlIlllIIl[66]] = u.lIIlIIllIIllI("VUmkXs05N80=", "IHlrl");
        u.lIlIllIllI[u.lIlIlllIIl[67]] = u.lIIlIIllIIllI("NdhP+Y3b+PmvHO8fUzGe+A==", "HnYsy");
        u.lIlIllIllI[u.lIlIlllIIl[14]] = u.lIIlIIllIlIII("udure7nIDeQ=", "dRSrc");
        u.lIlIllIllI[u.lIlIlllIIl[68]] = u.lIIlIIllIlIII("MkLhcC8DprJnHSQGptef5g==", "RsMtw");
        u.lIlIllIllI[u.lIlIlllIIl[69]] = u.lIIlIIllIIllI("Mi33PUmphuojcnnwwmXJ3Q==", "uYaOo");
        u.lIlIllIllI[u.lIlIlllIIl[70]] = u.lIIlIIllIIlll("HiUlDQIg", "RJDig");
        u.lIlIllIllI[u.lIlIlllIIl[71]] = u.lIIlIIllIIllI("iQpdDqbi3Fs=", "Cgbsb");
        u.lIlIllIllI[u.lIlIlllIIl[22]] = u.lIIlIIllIIlll("Ej06JwU=", "PRTBv");
        u.lIlIllIllI[u.lIlIlllIIl[72]] = u.lIIlIIllIIllI("kpYq7iOsZow=", "suqQr");
        u.lIlIllIllI[u.lIlIlllIIl[75]] = u.lIIlIIllIIlll("LDYgFSs=", "nYNpX");
        u.lIlIllIllI[u.lIlIlllIIl[76]] = u.lIIlIIllIlIII("CVGlSdUw9SVafqJ5CLcJew==", "kMegW");
        u.lIlIllIllI[u.lIlIlllIIl[77]] = u.lIIlIIllIIllI("rkvp/WXfLkX3AuJGNjVULA==", "cyKmA");
        u.lIlIllIllI[u.lIlIlllIIl[78]] = u.lIIlIIllIlIII("cJogkoDojB+3MQgoZWH1kw==", "VTaoO");
        u.lIlIllIllI[u.lIlIlllIIl[79]] = u.lIIlIIllIIllI("nEaeuyHEFyHTL8kpK28CRA==", "owoFQ");
        u.lIlIllIllI[u.lIlIlllIIl[80]] = u.lIIlIIllIIllI("x7bbCcbiTjY=", "Xzknl");
        u.lIlIllIllI[u.lIlIlllIIl[81]] = u.lIIlIIllIIllI("J24upYelEHgI0VlWLYAldQ==", "BZLWw");
        u.lIlIllIllI[u.lIlIlllIIl[82]] = u.lIIlIIllIIllI("/NfmPZrDz1Aa3XqrShYjLg==", "fvBJo");
        u.lIlIllIllI[u.lIlIlllIIl[15]] = u.lIIlIIllIlIII("496BkSenGAE=", "gdFsE");
        u.lIlIllIllI[u.lIlIlllIIl[84]] = u.lIIlIIllIIlll("DAUgGQo=", "MiIzo");
        u.lIlIllIllI[u.lIlIlllIIl[85]] = u.lIIlIIllIIllI("pIjd3uRuPcQ=", "hIWGl");
        u.lIlIllIllI[u.lIlIlllIIl[86]] = u.lIIlIIllIIlll("EjUFCz8=", "SYlhZ");
        u.lIlIllIllI[u.lIlIlllIIl[87]] = u.lIIlIIllIlIII("oaTDKVqXGk0=", "kncOw");
        u.lIlIllIllI[u.lIlIlllIIl[88]] = u.lIIlIIllIIllI("Z15JEp9qkxg=", "iOnUS");
        u.lIlIllIllI[u.lIlIlllIIl[93]] = u.lIIlIIllIlIII("DH3EA8g6zOM2Vz7vrnxSJw==", "cGOfp");
        u.lIlIllIllI[u.lIlIlllIIl[94]] = u.lIIlIIllIIlll("HRQwSzIgFzoO", "RxTkQ");
        u.lIlIllIllI[u.lIlIlllIIl[96]] = u.lIIlIIllIlIII("pwMpYhqM0xQ=", "eGJGD");
        u.lIlIllIllI[u.lIlIlllIIl[98]] = u.lIIlIIllIIllI("aP4WJHcx80M=", "Obmde");
        u.lIlIllIllI[u.lIlIlllIIl[6]] = u.lIIlIIllIlIII("AbIXP+cZMl4=", "wmdTV");
        u.lIlIllIllI[u.lIlIlllIIl[101]] = u.lIIlIIllIlIII("KtjC2WXJPCd9slnejKspzQ==", "miPOQ");
        u.lIlIllIllI[u.lIlIlllIIl[102]] = u.lIIlIIllIlIII("2q/CyY7VuwsqC/zAQ2rO/A==", "Oeeoh");
        u.lIlIllIllI[u.lIlIlllIIl[104]] = u.lIIlIIllIlIII("Cl0D5O7kH8lIksx6TMt7Nw==", "eQolu");
        u.lIlIllIllI[u.lIlIlllIIl[107]] = u.lIIlIIllIIllI("qh+W4LV7/Jg=", "UdoDJ");
        u.lIlIllIllI[u.lIlIlllIIl[3]] = u.lIIlIIllIIlll("IAItNTA=", "wkYVX");
        u.lIlIllIllI[u.lIlIlllIIl[109]] = u.lIIlIIllIIlll("DA4BVxcvCB0SDg==", "Noswz");
        u.lIlIllIllI[u.lIlIlllIIl[113]] = u.lIIlIIllIIllI("KqIRTCf+ZlPrVORwWtefgw==", "CHVRd");
        u.lIlIllIllI[u.lIlIlllIIl[114]] = u.lIIlIIllIIlll("DTEdJgQ3", "EPpKa");
        u.lIlIllIllI[u.lIlIlllIIl[115]] = u.lIIlIIllIIllI("wtdCz7oZnKkXADc3POoTXw==", "OfgGF");
        u.lIlIllIllI[u.lIlIlllIIl[89]] = u.lIIlIIllIlIII("G+sgSxNKzbmSQ7PF4PldPg==", "iKNjU");
        u.lIlIllIllI[u.lIlIlllIIl[119]] = u.lIIlIIllIlIII("Pmd+RooxKsFxCh5b/y5WdA==", "ryVrr");
        u.lIlIllIllI[u.lIlIlllIIl[120]] = u.lIIlIIllIlIII("NIv8v1Jlbjo=", "ceset");
        u.lIlIllIllI[u.lIlIlllIIl[90]] = u.lIIlIIllIIllI("6GB6a39qeBg=", "KRkXz");
        u.lIlIllIllI[u.lIlIlllIIl[125]] = u.lIIlIIllIIlll("Aw4jTjMiTzseJA==", "MoUnG");
        u.lIlIllIllI[u.lIlIlllIIl[126]] = u.lIIlIIllIIlll("Gj8+CCki", "NJLiL");
        u.lIlIllIllI[u.lIlIlllIIl[95]] = u.lIIlIIllIlIII("ho5wrrf6iyQ=", "vAeOJ");
        u.lIlIllIllI[u.lIlIlllIIl[128]] = u.lIIlIIllIIllI("L7v0SrcHdLa2fuBvplPYHQ==", "ZYPuR");
        u.lIlIllIllI[u.lIlIlllIIl[129]] = u.lIIlIIllIIlll("Bic1DzA3aSUYNDY=", "SIQjQ");
        u.lIlIllIllI[u.lIlIlllIIl[130]] = u.lIIlIIllIIllI("SktmR4utFzo=", "NTkEY");
        u.lIlIllIllI[u.lIlIlllIIl[97]] = u.lIIlIIllIIllI("/BJBN/KSlPbkoqnueeJCPw==", "cMsNy");
        u.lIlIllIllI[u.lIlIlllIIl[134]] = u.lIIlIIllIIlll("GAohAAk4DDpFBiUbNxY=", "JoReh");
        u.lIlIllIllI[u.lIlIlllIIl[135]] = u.lIIlIIllIIlll("GAobFxwgGQ4c", "Lxzyo");
        u.lIlIllIllI[u.lIlIlllIIl[138]] = u.lIIlIIllIIllI("EjtwEkXQhjEDoTckUHsfDg==", "MohSZ");
        u.lIlIllIllI[u.lIlIlllIIl[139]] = u.lIIlIIllIIlll("N249KjUCKz8l", "vNMKA");
        u.lIlIllIllI[u.lIlIlllIIl[140]] = u.lIIlIIllIIllI("7jjGR84flGgTaY6bAwDxMw==", "Kwfuz");
        u.lIlIllIllI[u.lIlIlllIIl[142]] = u.lIIlIIllIIlll("JwUNMi0EGQc=", "ejbYN");
        u.lIlIllIllI[u.lIlIlllIIl[143]] = u.lIIlIIllIIllI("bJC0A8QoXEY=", "eCsnM");
        u.lIlIllIllI[u.lIlIlllIIl[144]] = u.lIIlIIllIlIII("s9/AIZa2R+09LEZDc54QKA==", "eCiNe");
        u.lIlIllIllI[u.lIlIlllIIl[145]] = u.lIIlIIllIIllI("hFK5ur/FcrI=", "LsuDe");
        u.lIlIllIllI[u.lIlIlllIIl[99]] = u.lIIlIIllIIlll("NCM/ACwXPzU=", "vLPkO");
        u.lIlIllIllI[u.lIlIlllIIl[146]] = u.lIIlIIllIIlll("OTwpHA4C", "jYHnm");
        u.lIlIllIllI[u.lIlIlllIIl[159]] = u.lIIlIIllIlIII("Q+y6/DJ09Ks=", "WuBpj");
        u.lIlIllIllI[u.lIlIlllIIl[160]] = u.lIIlIIllIIllI("xETtTggbcPiH2ZgUCTdiC77ZI63dnRqu", "aTVEw");
        u.lIlIllIllI[u.lIlIlllIIl[161]] = u.lIIlIIllIlIII("b+whQITdkLKn939k5DTquSvsKGgafaaF", "kaQwy");
        u.lIlIllIllI[u.lIlIlllIIl[162]] = u.lIIlIIllIIlll("HCsGKA==", "XYiXE");
        u.lIlIllIllI[u.lIlIlllIIl[173]] = u.lIIlIIllIIlll("OA8GQQ==", "ajuoM");
        u.lIlIllIllI[u.lIlIlllIIl[174]] = u.lIIlIIllIlIII("ZyQUmORcD9dfFKLqJWl8GICK0IFjkDtg", "jvopK");
        u.lIlIllIllI[u.lIlIlllIIl[175]] = u.lIIlIIllIlIII("GdYOLaDFvuQ9qqukwVKEgjfHHyyYvZXLc59TDjj7c/EBi8cBnGD00OXWJAJU4ChW", "WEwNo");
        u.lIlIllIllI[u.lIlIlllIIl[176]] = u.lIIlIIllIIlll("MgsgLipRLXUgOwhEISohAgF1ISYYBz4nIAJEOy05XUQhKisfWw==", "qdUBN");
        u.lIlIllIllI[u.lIlIlllIIl[100]] = u.lIIlIIllIlIII("rkrigHYGSTGHppU1lGEKA+gED0gqXl1U", "guegZ");
        u.lIlIllIllI[u.lIlIlllIIl[177]] = u.lIIlIIllIIlll("H1MlYg4zBi1iBzQbPTZGN1Q5NwMlAGY=", "VtHBf");
        u.lIlIllIllI[u.lIlIlllIIl[178]] = u.lIIlIIllIIllI("TeSvp25gX5wV0ubmOEmfiCQmoZfE2Gc+f8X3tPNgUbvsyhPHj0up1YEeFU7h3d/v", "PXsqF");
        u.lIlIllIllI[u.lIlIlllIIl[179]] = u.lIIlIIllIlIII("fpLfCi0ahZWWB8/2IWYIgjWoUyyrzgov", "wkoDc");
        u.lIlIllIllI[u.lIlIlllIIl[180]] = u.lIIlIIllIIlll("", "THcbi");
    }

    private static boolean lIIlIIllllllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ac() {
        return lIlIlllIIl[1];
    }

    public static void bc() {
        block115: {
            WorldPoint lllllllllllllllllllIlIIIIlIIIIll;
            Object lllllllllllllllllllIlIIIIlIIIlII;
            block116: {
                block123: {
                    block118: {
                        block122: {
                            block121: {
                                block120: {
                                    block119: {
                                        block117: {
                                            if (u.lIIlIIllllIlI(bn ? 1 : 0)) {
                                                b.a(bp);
                                                if (u.lIIlIIllllIll(bp.size(), lIlIlllIIl[0])) {
                                                    System.out.println(lIlIllIllI[lIlIlllIIl[1]]);
                                                    bn = lIlIlllIIl[1];
                                                }
                                            }
                                            if (!u.lIIlIIlllllII(bn ? 1 : 0) || !u.lIIlIIllllIll(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[2])) break block115;
                                            if (u.lIIlIIllllIll(e.j(lIlIlllIIl[3]), lIlIlllIIl[4])) {
                                                dl = lIlIllIllI[lIlIlllIIl[0]];
                                                C.bL();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && (!u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) || u.lIIlIIllllIll(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]))) {
                                                dl = lIlIllIllI[lIlIlllIIl[9]];
                                                x.bk();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && u.lIIlIIllllIll(e.j(lIlIlllIIl[10]), lIlIlllIIl[11])) {
                                                dl = lIlIllIllI[lIlIlllIIl[11]];
                                                F.ce();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && u.lIIlIIlllllIl(e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && u.lIIlIIllllIll(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIIl[12])) {
                                                dl = lIlIllIllI[lIlIlllIIl[13]];
                                                V.dr();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && u.lIIlIIlllllIl(e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIIl[12]) && u.lIIlIIllllIll(Skills.getLevel((Skill)Skill.WOODCUTTING), lIlIlllIIl[14])) {
                                                dl = lIlIllIllI[lIlIlllIIl[8]];
                                                Y.dQ();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && u.lIIlIIlllllIl(e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIIl[12]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIlIlllIIl[14]) && u.lIIlIIllllIll(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIIl[15])) {
                                                dl = lIlIllIllI[lIlIlllIIl[16]];
                                                if (u.lIIlIIllllIll(dk, lIlIlllIIl[0])) {
                                                    o.cB = lIlIlllIIl[1];
                                                    dk += lIlIlllIIl[0];
                                                }
                                                n.ay();
                                            }
                                            if (u.lIIlIIlllllIl(e.j(lIlIlllIIl[3]), lIlIlllIIl[4]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[5]), lIlIlllIIl[6]) && u.lIIlIIllllllI(e.j(lIlIlllIIl[7]), lIlIlllIIl[8]) && u.lIIlIIlllllIl(e.j(lIlIlllIIl[10]), lIlIlllIIl[11]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.CRAFTING), lIlIlllIIl[12]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.WOODCUTTING), lIlIlllIIl[14]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIIl[15])) {
                                                if (!u.lIIlIIllllllI(e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) || u.lIIlIIllllIll(Skills.getLevel((Skill)Skill.HUNTER), lIlIlllIIl[19])) {
                                                    dl = lIlIllIllI[lIlIlllIIl[20]];
                                                    B.bI();
                                                }
                                                if (u.lIIlIIllllllI(e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.HUNTER), lIlIlllIIl[19]) && u.lIIlIIllllIll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6])) {
                                                    dl = lIlIllIllI[lIlIlllIIl[21]];
                                                    z.bD();
                                                }
                                                if (u.lIIlIIllllllI(e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.HUNTER), lIlIlllIIl[19]) && u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6]) && u.lIIlIIllllIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlllIIl[22])) {
                                                    dl = lIlIllIllI[lIlIlllIIl[19]];
                                                    t.ba();
                                                }
                                                if (u.lIIlIIllllllI(e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) && u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.HUNTER), lIlIlllIIl[19]) && u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6]) && u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlllIIl[22]) && u.lIIlIIllllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlIlllIIl[19])) {
                                                    String[] stringArray = new String[lIlIlllIIl[0]];
                                                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[4]];
                                                    if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        dl = lIlIllIllI[lIlIlllIIl[23]];
                                                        v.bf();
                                                    }
                                                }
                                                v.bg();
                                            }
                                            if (!u.lIIlIIlllllII(u.al() ? 1 : 0) || !u.lIIlIIlllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId())) || !u.lIIlIIllllllI(e.j(lIlIlllIIl[17]), lIlIlllIIl[18]) || !u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.HUNTER), lIlIlllIIl[19]) || !u.lIIlIIllllllI(Skills.getLevel((Skill)Skill.RANGED), lIlIlllIIl[15]) || !u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIlllIIl[6]) || !u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlllIIl[22]) || !u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlIlllIIl[19])) break block116;
                                            String[] stringArray = new String[lIlIlllIIl[0]];
                                            stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[24]];
                                            if (!u.lIIlIIlllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block116;
                                            dl = lIlIllIllI[lIlIlllIIl[25]];
                                            lllllllllllllllllllIlIIIIlIIIlII = BankLocation.getNearest();
                                            if (u.lIIlIIlllllll(lllllllllllllllllllIlIIIIlIIIlII) && u.lIIlIIlllllII(lllllllllllllllllllIlIIIIlIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[26]];
                                                a.a((BankLocation)lllllllllllllllllllIlIIIIlIIIlII);
                                            }
                                            if (!u.lIIlIIlllllll(lllllllllllllllllllIlIIIIlIIIlII) || !u.lIIlIIllllIlI(lllllllllllllllllllIlIIIIlIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block116;
                                            if (u.lIIlIIlllllII(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlllIIl[27]);
                                                "".length();
                                            }
                                            if (!u.lIIlIIllllIlI(Bank.isOpen() ? 1 : 0)) break block116;
                                            AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[28]];
                                            if (u.lIIlIlIIIIIII(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIlIlllIIl[13]);
                                                "".length();
                                            }
                                            if (u.lIIlIlIIIIIII(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIlIlllIIl[9]);
                                                "".length();
                                            }
                                            int[] nArray = new int[lIlIlllIIl[0]];
                                            nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[29];
                                            if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block117;
                                            int[] nArray2 = new int[lIlIlllIIl[0]];
                                            nArray2[u.lIlIlllIIl[1]] = lIlIlllIIl[29];
                                            if (!u.lIIlIIllllllI(Bank.getFirst((int[])nArray2).getQuantity(), lIlIlllIIl[8])) break block118;
                                        }
                                        int[] nArray = new int[lIlIlllIIl[0]];
                                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[30];
                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block119;
                                        int[] nArray3 = new int[lIlIlllIIl[0]];
                                        nArray3[u.lIlIlllIIl[1]] = lIlIlllIIl[30];
                                        if (!u.lIIlIIllllllI(Bank.getFirst((int[])nArray3).getQuantity(), lIlIlllIIl[16])) break block118;
                                    }
                                    int[] nArray = new int[lIlIlllIIl[0]];
                                    nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                    if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block120;
                                    int[] nArray4 = new int[lIlIlllIIl[0]];
                                    nArray4[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                    if (!u.lIIlIIllllllI(Bank.getFirst((int[])nArray4).getQuantity(), lIlIlllIIl[28])) break block118;
                                }
                                int[] nArray = new int[lIlIlllIIl[0]];
                                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block121;
                                int[] nArray5 = new int[lIlIlllIIl[0]];
                                nArray5[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                                if (!u.lIIlIIllllllI(Bank.getFirst((int[])nArray5).getQuantity(), lIlIlllIIl[13])) break block118;
                            }
                            int[] nArray = new int[lIlIlllIIl[0]];
                            nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[33];
                            if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block122;
                            int[] nArray6 = new int[lIlIlllIIl[0]];
                            nArray6[u.lIlIlllIIl[1]] = lIlIlllIIl[33];
                            if (!u.lIIlIIllllllI(Bank.getFirst((int[])nArray6).getQuantity(), lIlIlllIIl[8])) break block118;
                        }
                        int[] nArray = new int[lIlIlllIIl[0]];
                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[34];
                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block123;
                        int[] nArray7 = new int[lIlIlllIIl[0]];
                        nArray7[u.lIlIlllIIl[1]] = lIlIlllIIl[34];
                        if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray7).getQuantity(), lIlIlllIIl[13])) break block123;
                    }
                    u.O();
                    System.out.println(lIlIllIllI[lIlIlllIIl[35]]);
                    bn = lIlIlllIIl[0];
                    return;
                }
                int[] nArray = new int[lIlIlllIIl[23]];
                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
                nArray[u.lIlIlllIIl[0]] = lIlIlllIIl[37];
                nArray[u.lIlIlllIIl[9]] = lIlIlllIIl[33];
                nArray[u.lIlIlllIIl[11]] = lIlIlllIIl[38];
                nArray[u.lIlIlllIIl[13]] = lIlIlllIIl[32];
                nArray[u.lIlIlllIIl[8]] = lIlIlllIIl[34];
                nArray[u.lIlIlllIIl[16]] = lIlIlllIIl[39];
                nArray[u.lIlIlllIIl[20]] = lIlIlllIIl[40];
                nArray[u.lIlIlllIIl[21]] = lIlIlllIIl[41];
                nArray[u.lIlIlllIIl[19]] = lIlIlllIIl[30];
                nArray[u.lIlIlllIIl[4]] = lIlIlllIIl[31];
                if (u.lIIlIIlllllII(e.b(nArray) ? 1 : 0)) {
                    u.O();
                    System.out.println(lIlIllIllI[lIlIlllIIl[42]]);
                    bn = lIlIlllIIl[0];
                    return;
                }
                int[] nArray8 = new int[lIlIlllIIl[23]];
                nArray8[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
                nArray8[u.lIlIlllIIl[0]] = lIlIlllIIl[37];
                nArray8[u.lIlIlllIIl[9]] = lIlIlllIIl[33];
                nArray8[u.lIlIlllIIl[11]] = lIlIlllIIl[38];
                nArray8[u.lIlIlllIIl[13]] = lIlIlllIIl[32];
                nArray8[u.lIlIlllIIl[8]] = lIlIlllIIl[34];
                nArray8[u.lIlIlllIIl[16]] = lIlIlllIIl[39];
                nArray8[u.lIlIlllIIl[20]] = lIlIlllIIl[40];
                nArray8[u.lIlIlllIIl[21]] = lIlIlllIIl[41];
                nArray8[u.lIlIlllIIl[19]] = lIlIlllIIl[30];
                nArray8[u.lIlIlllIIl[4]] = lIlIlllIIl[31];
                if (u.lIIlIIllllIlI(e.b(nArray8) ? 1 : 0)) {
                    a.a(lIlIlllIIl[34], lIlIlllIIl[13]);
                    a.a(lIlIlllIIl[37], lIlIlllIIl[0]);
                    a.a(lIlIlllIIl[43], lIlIlllIIl[0]);
                    a.a(lIlIlllIIl[32], lIlIlllIIl[13]);
                    a.a(lIlIlllIIl[29], lIlIlllIIl[13]);
                    a.a(lIlIlllIIl[40], lIlIlllIIl[0]);
                    a.a(lIlIlllIIl[41], lIlIlllIIl[0]);
                    a.a(lIlIlllIIl[36], lIlIlllIIl[4]);
                    a.a(lIlIlllIIl[30], lIlIlllIIl[4]);
                    a.a(lIlIlllIIl[31], lIlIlllIIl[28]);
                    a.a(lIlIlllIIl[44], lIlIlllIIl[0]);
                    a.a(lIlIlllIIl[45], lIlIlllIIl[27]);
                }
            }
            if (u.lIIlIIllllIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && u.lIIlIIllllIll(Movement.getRunEnergy(), lIlIlllIIl[15])) {
                Inventory.getFirst((int[])f.aU).interact(lIlIllIllI[lIlIlllIIl[46]]);
                Time.sleepTicks((int)lIlIlllIIl[0]);
                "".length();
            }
            if (u.lIIlIIllllIlI(Inventory.contains((int[])f.aR) ? 1 : 0) && u.lIIlIIllllIll(Prayers.getPoints(), lIlIlllIIl[47])) {
                Inventory.getFirst((int[])f.aR).interact(lIlIllIllI[lIlIlllIIl[12]]);
            }
            if (u.lIIlIlIIIIIIl(u.lIIlIIllllIIl(e.u(), 60.0))) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[48]];
                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIlIlllIIl[0]];
                    stringArray2[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[49]];
                    Inventory.getFirst((String[])stringArray2).interact(lIlIllIllI[lIlIlllIIl[50]]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);
                    "".length();
                }
            }
            if (u.lIIlIIllllIlI(u.al() ? 1 : 0) && u.lIIlIIlllllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()))) {
                if (u.lIIlIIlllllII(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
                    AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[51]];
                    if (u.lIIlIIllllIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)cV);
                    "".length();
                    Time.sleepTicks((int)lIlIlllIIl[0]);
                    "".length();
                }
                if (u.lIIlIIllllIlI(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
                    dc = lIlIlllIIl[1];
                    g.a(lIlIllIllI[lIlIlllIIl[47]], cy);
                }
                if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIlllIIl[52], lIlIlllIIl[53], lIlIlllIIl[1])) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlllIIl[0]];
                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[54]];
                    TileObjects.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[55]]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);
                    "".length();
                }
                if (u.lIIlIIllllIlI((lllllllllllllllllllIlIIIIlIIIlII = new WorldArea(lIlIlllIIl[52], lIlIlllIIl[56], lIlIlllIIl[16], lIlIlllIIl[4], lIlIlllIIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlllIIl[0]];
                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[57]];
                    TileObjects.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[58]]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);
                    "".length();
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[4])) {
                int[] nArray = new int[lIlIlllIIl[0]];
                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[44];
                if (u.lIIlIIlllllII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray9 = new int[lIlIlllIIl[0]];
                    nArray9[u.lIlIlllIIl[1]] = lIlIlllIIl[44];
                    Inventory.getFirst((int[])nArray9).interact(lIlIllIllI[lIlIlllIIl[59]]);
                }
                int[] nArray10 = new int[lIlIlllIIl[0]];
                nArray10[u.lIlIlllIIl[1]] = lIlIlllIIl[60];
                if (u.lIIlIIlllllII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    block114: {
                        lllllllllllllllllllIlIIIIlIIIlII = new WorldPoint(lIlIlllIIl[61], lIlIlllIIl[62], lIlIlllIIl[1]);
                        int[] nArray11 = new int[lIlIlllIIl[0]];
                        nArray11[u.lIlIlllIIl[1]] = lIlIlllIIl[63];
                        if (u.lIIlIIlllllII(Inventory.contains((int[])nArray11) ? 1 : 0) && u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIlII), lIlIlllIIl[48])) {
                            if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(di), lIlIlllIIl[8])) {
                                AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[64]];
                                Movement.walkTo((WorldPoint)di);
                                "".length();
                                Time.sleepTicks((int)lIlIlllIIl[0]);
                                "".length();
                            }
                            if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(di), lIlIlllIIl[8])) {
                                if (u.lIIlIIlllllII(Shop.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIlIlllIIl[0]];
                                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[65]];
                                    NPCs.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[10]]);
                                    Time.sleepTicks((int)lIlIlllIIl[9]);
                                    "".length();
                                }
                                if (u.lIIlIIllllIlI(Shop.isOpen() ? 1 : 0)) {
                                    Shop.buyFive((int)lIlIlllIIl[63]);
                                    Time.sleepTicks((int)lIlIlllIIl[11]);
                                    "".length();
                                }
                            }
                        }
                        int[] nArray12 = new int[lIlIlllIIl[0]];
                        nArray12[u.lIlIlllIIl[1]] = lIlIlllIIl[63];
                        if (u.lIIlIIllllIlI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                            if (u.lIIlIIlllllII(dg.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.lIIlIIlllllII(dh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                int[] nArray13 = new int[lIlIlllIIl[0]];
                                nArray13[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                if (u.lIIlIIllllIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                    int[] nArray14 = new int[lIlIlllIIl[0]];
                                    nArray14[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                    Inventory.getFirst((int[])nArray14).interact(lIlIllIllI[lIlIlllIIl[66]]);
                                    Time.sleepTicks((int)lIlIlllIIl[20]);
                                    "".length();
                                }
                            }
                            if (!u.lIIlIIlllllII(dg.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || u.lIIlIIllllIlI(dh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                lllllllllllllllllllIlIIIIlIIIIll = new WorldPoint(lIlIlllIIl[61], lIlIlllIIl[62], lIlIlllIIl[1]);
                                if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllllIlIIIIlIIIIll), lIlIlllIIl[8]) && u.lIIlIIlllllII(Players.getLocal().getWorldLocation().getPlane())) {
                                    AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[67]];
                                    Movement.walkTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIIll);
                                    "".length();
                                    Time.sleepTicks((int)lIlIlllIIl[0]);
                                    "".length();
                                }
                                String[] stringArray = new String[lIlIlllIIl[0]];
                                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[14]];
                                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllllIlIIIIlIIIIll), lIlIlllIIl[8]) && u.lIIlIIlllllII(Players.getLocal().getWorldLocation().getPlane())) {
                                        String[] stringArray3 = new String[lIlIlllIIl[0]];
                                        stringArray3[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[68]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lIlIllIllI[lIlIlllIIl[69]]);
                                        Time.sleepTicks((int)lIlIlllIIl[13]);
                                        "".length();
                                    }
                                    String[] stringArray4 = new String[lIlIlllIIl[0]];
                                    stringArray4[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[70]];
                                    if (u.lIIlIIlllllll(TileObjects.getNearest((String[])stringArray4))) {
                                        String[] stringArray5 = new String[lIlIlllIIl[0]];
                                        stringArray5[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[71]];
                                        if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                            String[] stringArray6 = new String[lIlIlllIIl[0]];
                                            stringArray6[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[22]];
                                            String[] stringArray7 = new String[lIlIlllIIl[0]];
                                            stringArray7[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[72]];
                                            Inventory.getFirst((String[])stringArray6).useOn(TileObjects.getNearest((String[])stringArray7));
                                            Time.sleep((long)e.c(lIlIlllIIl[73], lIlIlllIIl[74]));
                                            "".length();
                                        }
                                    }
                                }
                                String[] stringArray8 = new String[lIlIlllIIl[0]];
                                stringArray8[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[75]];
                                if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                    if (u.lIIlIIlllllIl(Players.getLocal().getWorldLocation().getPlane(), lIlIlllIIl[0])) {
                                        String[] stringArray9 = new String[lIlIlllIIl[0]];
                                        stringArray9[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[76]];
                                        TileObjects.getNearest((String[])stringArray9).interact(lIlIllIllI[lIlIlllIIl[77]]);
                                        Time.sleepTicks((int)lIlIlllIIl[8]);
                                        "".length();
                                    }
                                    if (u.lIIlIIlllllII(Players.getLocal().getWorldLocation().getPlane())) {
                                        do {
                                            String[] stringArray10 = new String[lIlIlllIIl[0]];
                                            stringArray10[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[78]];
                                            if (!u.lIIlIIllllIlI(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block114;
                                            String[] stringArray11 = new String[lIlIlllIIl[0]];
                                            stringArray11[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[79]];
                                            TileObjects.getNearest((String[])stringArray11).interact(lIlIllIllI[lIlIlllIIl[80]]);
                                            Time.sleepTicks((int)lIlIlllIIl[9]);
                                            "".length();
                                            "".length();
                                        } while ((0x75 ^ 0x70) > 0);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    int[] nArray15 = new int[lIlIlllIIl[0]];
                    nArray15[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                    if (u.lIIlIIlllllII(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIlllIIl[0]];
                        stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[81]];
                        if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray) ? 1 : 0) && u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIlII), lIlIlllIIl[48])) {
                            if (u.lIIlIIlllllII(Dialog.isOpen() ? 1 : 0)) {
                                g.a(lIlIllIllI[lIlIlllIIl[82]], cy);
                                Time.sleepTicks((int)lIlIlllIIl[0]);
                                "".length();
                            }
                            g.a(cy);
                        }
                    }
                }
                int[] nArray16 = new int[lIlIlllIIl[0]];
                nArray16[u.lIlIlllIIl[1]] = lIlIlllIIl[60];
                if (u.lIIlIIllllIlI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIlllIIl[9]];
                    nArray17[u.lIlIlllIIl[1]] = lIlIlllIIl[83];
                    nArray17[u.lIlIlllIIl[0]] = lIlIlllIIl[29];
                    if (u.lIIlIIllllIlI(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                        int[] nArray18 = new int[lIlIlllIIl[9]];
                        nArray18[u.lIlIlllIIl[1]] = lIlIlllIIl[83];
                        nArray18[u.lIlIlllIIl[0]] = lIlIlllIIl[29];
                        Inventory.getAll((int[])nArray18).stream().forEach(item -> item.interact(lIlIllIllI[lIlIlllIIl[162]]));
                    }
                    if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                        Movement.walkTo((WorldPoint)dj);
                        "".length();
                        Time.sleepTicks((int)lIlIlllIIl[0]);
                        "".length();
                    }
                    if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                        g.a(lIlIllIllI[lIlIlllIIl[15]], cy);
                    }
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[48])) {
                g.a(lIlIllIllI[lIlIlllIIl[84]], cy);
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[64])) {
                g.a(lIlIllIllI[lIlIlllIIl[85]], cy);
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[22])) {
                g.a(lIlIllIllI[lIlIlllIIl[86]], cy);
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[15])) {
                g.a(lIlIllIllI[lIlIlllIIl[87]], cy);
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[6])) {
                g.a(lIlIllIllI[lIlIlllIIl[88]], cy);
            }
            if (!u.lIIlIlIIIIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[89]) || u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[90])) {
                lllllllllllllllllllIlIIIIlIIIlII = new WorldPoint(lIlIlllIIl[91], lIlIlllIIl[92], lIlIlllIIl[1]);
                if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIlII), lIlIlllIIl[11])) {
                    AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[93]];
                    Movement.walkTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIlII);
                    "".length();
                    Time.sleepTicks((int)lIlIlllIIl[0]);
                    "".length();
                }
                if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIlII), lIlIlllIIl[11])) {
                    g.a(lIlIllIllI[lIlIlllIIl[94]], cy);
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[95])) {
                if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                    Movement.walkTo((WorldPoint)dj);
                    "".length();
                    Time.sleepTicks((int)lIlIlllIIl[0]);
                    "".length();
                }
                if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(dj), lIlIlllIIl[20])) {
                    g.a(lIlIllIllI[lIlIlllIIl[96]], cy);
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[97])) {
                g.a(lIlIllIllI[lIlIlllIIl[98]], cy);
            }
            if (!u.lIIlIlIIIIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[99]) || u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[100])) {
                g.a(lIlIllIllI[lIlIlllIIl[6]], cy);
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[100])) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[101]];
                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray12 = new String[lIlIlllIIl[0]];
                    stringArray12[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[102]];
                    if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        lllllllllllllllllllIlIIIIlIIIlII = new HashMap();
                        ((HashMap)lllllllllllllllllllIlIIIIlIIIlII).put(lIlIlllIIl[33], lIlIlllIIl[8]);
                        "".length();
                        ((HashMap)lllllllllllllllllllIlIIIIlIIIlII).put(lIlIlllIIl[38], lIlIlllIIl[0]);
                        "".length();
                        ((HashMap)lllllllllllllllllllIlIIIIlIIIlII).put(lIlIlllIIl[39], lIlIlllIIl[0]);
                        "".length();
                        ((HashMap)lllllllllllllllllllIlIIIIlIIIlII).put(lIlIlllIIl[103], lIlIlllIIl[0]);
                        "".length();
                        e.a((HashMap<Integer, Integer>)lllllllllllllllllllIlIIIIlIIIlII, lIlIlllIIl[1], lIlIlllIIl[1]);
                    }
                    String[] stringArray13 = new String[lIlIlllIIl[0]];
                    stringArray13[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[104]];
                    if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        u.bd();
                    }
                }
            }
            if (!u.lIIlIlIIIIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[105]) || u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[106])) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[107]];
                lllllllllllllllllllIlIIIIlIIIlII = NPCs.getNearest((String[])stringArray);
                if (u.lIIlIIlllllll(lllllllllllllllllllIlIIIIlIIIlII)) {
                    if (u.lIIlIIllllIlI(Reachable.isInteractable((Locatable)lllllllllllllllllllIlIIIIlIIIlII) ? 1 : 0)) {
                        g.a(lIlIllIllI[lIlIlllIIl[3]], cy);
                    }
                    if (u.lIIlIIlllllII(Reachable.isInteractable((Locatable)lllllllllllllllllllIlIIIIlIIIlII) ? 1 : 0)) {
                        Movement.walkTo((Locatable)lllllllllllllllllllIlIIIIlIIIlII);
                        "".length();
                        Time.sleepTicks((int)lIlIlllIIl[0]);
                        "".length();
                    }
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[108])) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[109]];
                if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lllllllllllllllllllIlIIIIlIIIlII = new WorldPoint(lIlIlllIIl[110], lIlIlllIIl[111], lIlIlllIIl[1]);
                    lllllllllllllllllllIlIIIIlIIIIll = new WorldPoint(lIlIlllIIl[110], lIlIlllIIl[112], lIlIlllIIl[1]);
                    if (u.lIIlIIlllllII(Players.getLocal().getWorldLocation().equals(lllllllllllllllllllIlIIIIlIIIlII) ? 1 : 0) && u.lIIlIIlllllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllllIlIIIIlIIIIll) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[113]];
                        Movement.walkTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIlII);
                        "".length();
                        Time.sleepTicks((int)lIlIlllIIl[0]);
                        "".length();
                    }
                    if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(lllllllllllllllllllIlIIIIlIIIlII) ? 1 : 0) && u.lIIlIIlllllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllllIlIIIIlIIIIll) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIIll);
                        "".length();
                    }
                    if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllllIlIIIIlIIIIll) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIlIlllIIl[0]];
                        stringArray14[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[114]];
                        String[] stringArray15 = new String[lIlIlllIIl[0]];
                        stringArray15[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[115]];
                        Inventory.getFirst((String[])stringArray14).useOn(Inventory.getFirst((String[])stringArray15));
                        Time.sleepTicks((int)lIlIlllIIl[11]);
                        "".length();
                    }
                }
                String[] stringArray16 = new String[lIlIlllIIl[0]];
                stringArray16[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[89]];
                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    u.bd();
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[116])) {
                lllllllllllllllllllIlIIIIlIIIlII = new WorldPoint(lIlIlllIIl[117], lIlIlllIIl[118], lIlIlllIIl[1]);
                if (u.lIIlIIlllllII(Players.getLocal().getWorldLocation().equals(lllllllllllllllllllIlIIIIlIIIlII) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIlII);
                    "".length();
                    Time.sleepTicks((int)lIlIlllIIl[0]);
                    "".length();
                }
                if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(lllllllllllllllllllIlIIIIlIIIlII) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlllIIl[0]];
                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[119]];
                    NPCs.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[120]]);
                    Time.sleepTicks((int)lIlIlllIIl[0]);
                    "".length();
                }
            }
            if (!u.lIIlIlIIIIlII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[121]) || u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[122])) {
                lllllllllllllllllllIlIIIIlIIIlII = new WorldPoint(lIlIlllIIl[123], lIlIlllIIl[124], lIlIlllIIl[1]);
                if (u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIlII), lIlIlllIIl[9])) {
                    if (u.lIIlIIllllIlI(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aN).interact(lIlIllIllI[lIlIlllIIl[90]]);
                    }
                    AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[125]];
                    Movement.walkTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIlII);
                    "".length();
                    Time.sleepTicks((int)lIlIlllIIl[0]);
                    "".length();
                }
                if (u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIlII), lIlIlllIIl[9])) {
                    String[] stringArray = new String[lIlIlllIIl[0]];
                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[126]];
                    lllllllllllllllllllIlIIIIlIIIIll = NPCs.getNearest((String[])stringArray);
                    if (u.lIIlIIlllllll(lllllllllllllllllllIlIIIIlIIIIll)) {
                        if (u.lIIlIIllllIlI(Reachable.isInteractable((Locatable)lllllllllllllllllllIlIIIIlIIIIll) ? 1 : 0)) {
                            g.a(lIlIllIllI[lIlIlllIIl[95]], cy);
                        }
                        if (u.lIIlIIlllllII(Reachable.isInteractable((Locatable)lllllllllllllllllllIlIIIIlIIIIll) ? 1 : 0)) {
                            Movement.walkTo((Locatable)lllllllllllllllllllIlIIIIlIIIIll);
                            "".length();
                            Time.sleepTicks((int)lIlIlllIIl[0]);
                            "".length();
                        }
                    }
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[127])) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[128]];
                if (u.lIIlIIlllllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    lllllllllllllllllllIlIIIIlIIIlII = new WorldPoint(lIlIlllIIl[117], lIlIlllIIl[118], lIlIlllIIl[1]);
                    if (u.lIIlIIlllllII(Players.getLocal().getWorldLocation().equals(lllllllllllllllllllIlIIIIlIIIlII) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)lllllllllllllllllllIlIIIIlIIIlII);
                        "".length();
                        Time.sleepTicks((int)lIlIlllIIl[0]);
                        "".length();
                    }
                    if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals(lllllllllllllllllllIlIIIIlIIIlII) ? 1 : 0)) {
                        String[] stringArray17 = new String[lIlIlllIIl[0]];
                        stringArray17[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[129]];
                        NPCs.getNearest((String[])stringArray17).interact(lIlIllIllI[lIlIlllIIl[130]]);
                        Time.sleepTicks((int)lIlIlllIIl[0]);
                        "".length();
                    }
                }
                String[] stringArray18 = new String[lIlIlllIIl[0]];
                stringArray18[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[97]];
                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray18) ? 1 : 0)) {
                    u.bd();
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[131])) {
                u.bd();
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[132])) {
                if (u.lIIlIIllllIlI(Widgets.get((int)lIlIlllIIl[133]).isEmpty() ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlllIIl[0]];
                    stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[134]];
                    Inventory.getFirst((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[135]]);
                    Time.sleepTicks((int)lIlIlllIIl[13]);
                    "".length();
                }
                if (u.lIIlIIlllllII(Widgets.get((int)lIlIlllIIl[133]).isEmpty() ? 1 : 0)) {
                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[55]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[55]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);
                    "".length();
                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[65]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[65]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);
                    "".length();
                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[67]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[67]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);
                    "".length();
                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[22]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[22]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);
                    "".length();
                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[76]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[76]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[9]);
                    "".length();
                    Mouse.click((int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[79]).getClickPoint().getX(), (int)Widgets.get((int)lIlIlllIIl[133], (int)lIlIlllIIl[79]).getClickPoint().getY(), (boolean)lIlIlllIIl[0]);
                    Time.sleepTicks((int)lIlIlllIIl[8]);
                    "".length();
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[136])) {
                u.bd();
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[137])) {
                String[] stringArray = new String[lIlIlllIIl[0]];
                stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[138]];
                if (u.lIIlIIllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray19 = new String[lIlIlllIIl[0]];
                    stringArray19[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[139]];
                    String[] stringArray20 = new String[lIlIlllIIl[0]];
                    stringArray20[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[140]];
                    Inventory.getFirst((String[])stringArray19).useOn(Inventory.getFirst((String[])stringArray20));
                    Time.sleepTicks((int)lIlIlllIIl[9]);
                    "".length();
                }
            }
            if (u.lIIlIIlllllIl(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[141])) {
                if (u.lIIlIIllllIll(dc, lIlIlllIIl[0])) {
                    Z.nh += lIlIlllIIl[0];
                    Z.p(AccBuilderShamans.m);
                    dc += lIlIlllIIl[0];
                    Z.nh = lIlIlllIIl[1];
                    dd = lIlIlllIIl[1];
                }
                u.bd();
            }
            g.a(cy);
        }
    }

    private static boolean lIIlIIlllllII(int n2) {
        return n2 == 0;
    }

    private static void bd() {
        WorldArea worldArea = new WorldArea(lIlIlllIIl[52], lIlIlllIIl[56], lIlIlllIIl[16], lIlIlllIIl[4], lIlIlllIIl[1]);
        if (u.lIIlIIllllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlllIIl[0]];
            stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[142]];
            TileObjects.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[143]]);
            Time.sleepTicks((int)lIlIlllIIl[9]);
            "".length();
        }
        if (u.lIIlIIlllllII(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.lIIlIlIIIIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
            AccBuilderShamans.c = lIlIllIllI[lIlIlllIIl[144]];
            if (u.lIIlIIllllIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)cV);
            "".length();
            Time.sleepTicks((int)lIlIlllIIl[0]);
            "".length();
        }
        if (u.lIIlIIllllIlI(df.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.lIIlIlIIIIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlllIIl[21])) {
            g.a(lIlIllIllI[lIlIlllIIl[145]], cy);
        }
        if (u.lIIlIIllllIlI(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIlIlllIIl[52], lIlIlllIIl[53], lIlIlllIIl[1])) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlllIIl[0]];
            stringArray[u.lIlIlllIIl[1]] = lIlIllIllI[lIlIlllIIl[99]];
            TileObjects.getNearest((String[])stringArray).interact(lIlIllIllI[lIlIlllIIl[146]]);
            Time.sleepTicks((int)lIlIlllIIl[9]);
            "".length();
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean al() {
        void lllllllllllllllllllIlIIIIIlllllI;
        int[] nArray = new int[lIlIlllIIl[20]];
        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
        nArray[u.lIlIlllIIl[0]] = lIlIlllIIl[37];
        nArray[u.lIlIlllIIl[9]] = lIlIlllIIl[34];
        nArray[u.lIlIlllIIl[11]] = lIlIlllIIl[40];
        nArray[u.lIlIlllIIl[13]] = lIlIlllIIl[41];
        nArray[u.lIlIlllIIl[8]] = lIlIlllIIl[30];
        nArray[u.lIlIlllIIl[16]] = lIlIlllIIl[31];
        int[] nArray2 = nArray;
        int lllllllllllllllllllIlIIIIIllllIl = lIlIlllIIl[1];
        while (u.lIIlIIllllIll(lllllllllllllllllllIlIIIIIllllIl, ((void)lllllllllllllllllllIlIIIIIlllllI).length)) {
            int[] nArray3 = new int[lIlIlllIIl[0]];
            nArray3[u.lIlIlllIIl[1]] = lllllllllllllllllllIlIIIIIlllllI[lllllllllllllllllllIlIIIIIllllIl];
            if (u.lIIlIIlllllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIlIlllIIl[1];
            }
            ++lllllllllllllllllllIlIIIIIllllIl;
            "".length();
            if ((0x5C ^ 0x59 ^ (0x71 ^ 0x4D) & ~(0xA9 ^ 0x95)) > 0) continue;
            return ((0xE9 ^ 0x81 ^ (0x1A ^ 0x27)) & (195 + 169 - 178 + 27 ^ 14 + 105 - 36 + 45 ^ -" ".length())) != 0;
        }
        return lIlIlllIIl[0];
    }

    private static void O() {
        block46: {
            d lllllllllllllllllllIlIIIIIlllIIl;
            block45: {
                block44: {
                    block43: {
                        Object lllllllllllllllllllIlIIIIIlllIlI;
                        block42: {
                            block41: {
                                block40: {
                                    block39: {
                                        block38: {
                                            block37: {
                                                block36: {
                                                    block35: {
                                                        block34: {
                                                            block33: {
                                                                block32: {
                                                                    block31: {
                                                                        int[] nArray = new int[lIlIlllIIl[0]];
                                                                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[43];
                                                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                        int[] nArray2 = new int[lIlIlllIIl[0]];
                                                                        nArray2[u.lIlIlllIIl[1]] = lIlIlllIIl[43];
                                                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block32;
                                                                        int[] nArray3 = new int[lIlIlllIIl[0]];
                                                                        nArray3[u.lIlIlllIIl[1]] = lIlIlllIIl[43];
                                                                        if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray3).getQuantity(), lIlIlllIIl[4])) break block32;
                                                                    }
                                                                    lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[43], lIlIlllIIl[4], e.c(lIlIlllIIl[147], lIlIlllIIl[148]));
                                                                    bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                                                                    "".length();
                                                                }
                                                                int[] nArray = new int[lIlIlllIIl[0]];
                                                                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[30];
                                                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                int[] nArray4 = new int[lIlIlllIIl[0]];
                                                                nArray4[u.lIlIlllIIl[1]] = lIlIlllIIl[30];
                                                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block34;
                                                                int[] nArray5 = new int[lIlIlllIIl[0]];
                                                                nArray5[u.lIlIlllIIl[1]] = lIlIlllIIl[30];
                                                                if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray5).getQuantity(), lIlIlllIIl[16])) break block34;
                                                            }
                                                            lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[30], lIlIlllIIl[16], lIlIlllIIl[149]);
                                                            bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                                                            "".length();
                                                        }
                                                        int[] nArray = new int[lIlIlllIIl[0]];
                                                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block35;
                                                        int[] nArray6 = new int[lIlIlllIIl[0]];
                                                        nArray6[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block36;
                                                        int[] nArray7 = new int[lIlIlllIIl[0]];
                                                        nArray7[u.lIlIlllIIl[1]] = lIlIlllIIl[31];
                                                        if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray7).getQuantity(), lIlIlllIIl[28])) break block36;
                                                    }
                                                    lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[31], lIlIlllIIl[28], lIlIlllIIl[150]);
                                                    bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                                                    "".length();
                                                }
                                                int[] nArray = new int[lIlIlllIIl[0]];
                                                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[103];
                                                if (u.lIIlIIlllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[103], lIlIlllIIl[8], lIlIlllIIl[151]);
                                                    bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                                                    "".length();
                                                }
                                                int[] nArray8 = new int[lIlIlllIIl[0]];
                                                nArray8[u.lIlIlllIIl[1]] = lIlIlllIIl[37];
                                                if (u.lIIlIIlllllII(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                                    lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[37], lIlIlllIIl[0], lIlIlllIIl[27]);
                                                    bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                                                    "".length();
                                                }
                                                int[] nArray9 = new int[lIlIlllIIl[0]];
                                                nArray9[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block37;
                                                int[] nArray10 = new int[lIlIlllIIl[0]];
                                                nArray10[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block38;
                                                int[] nArray11 = new int[lIlIlllIIl[0]];
                                                nArray11[u.lIlIlllIIl[1]] = lIlIlllIIl[32];
                                                if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray11).getQuantity(), lIlIlllIIl[13])) break block38;
                                            }
                                            lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[32], lIlIlllIIl[13], lIlIlllIIl[27]);
                                            bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                                            "".length();
                                        }
                                        int[] nArray = new int[lIlIlllIIl[0]];
                                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[33];
                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block39;
                                        int[] nArray12 = new int[lIlIlllIIl[0]];
                                        nArray12[u.lIlIlllIIl[1]] = lIlIlllIIl[33];
                                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray12) ? 1 : 0)) break block40;
                                        int[] nArray13 = new int[lIlIlllIIl[0]];
                                        nArray13[u.lIlIlllIIl[1]] = lIlIlllIIl[33];
                                        if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray13).getQuantity(), lIlIlllIIl[8])) break block40;
                                    }
                                    lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[33], lIlIlllIIl[8], lIlIlllIIl[27]);
                                    bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                                    "".length();
                                }
                                int[] nArray = new int[lIlIlllIIl[0]];
                                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[29];
                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                int[] nArray14 = new int[lIlIlllIIl[0]];
                                nArray14[u.lIlIlllIIl[1]] = lIlIlllIIl[29];
                                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray14) ? 1 : 0)) break block42;
                                int[] nArray15 = new int[lIlIlllIIl[0]];
                                nArray15[u.lIlIlllIIl[1]] = lIlIlllIIl[29];
                                if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray15).getQuantity(), lIlIlllIIl[8])) break block42;
                            }
                            lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[29], lIlIlllIIl[13], lIlIlllIIl[27]);
                            bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                            "".length();
                        }
                        int[] nArray = new int[lIlIlllIIl[0]];
                        nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[39];
                        if (u.lIIlIIlllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[39], lIlIlllIIl[0], lIlIlllIIl[27]);
                            bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                            "".length();
                        }
                        int[] nArray16 = new int[lIlIlllIIl[0]];
                        nArray16[u.lIlIlllIIl[1]] = lIlIlllIIl[38];
                        if (u.lIIlIIlllllII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                            lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[38], lIlIlllIIl[0], lIlIlllIIl[27]);
                            bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                            "".length();
                        }
                        int[] nArray17 = new int[lIlIlllIIl[0]];
                        nArray17[u.lIlIlllIIl[1]] = lIlIlllIIl[40];
                        if (u.lIIlIIlllllII(Bank.contains((int[])nArray17) ? 1 : 0)) {
                            lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[40], lIlIlllIIl[0], lIlIlllIIl[152]);
                            bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                            "".length();
                        }
                        int[] nArray18 = new int[lIlIlllIIl[0]];
                        nArray18[u.lIlIlllIIl[1]] = lIlIlllIIl[41];
                        if (u.lIIlIIlllllII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            lllllllllllllllllllIlIIIIIlllIlI = new d(lIlIlllIIl[41], lIlIlllIIl[0], lIlIlllIIl[153] + e.c(lIlIlllIIl[154], lIlIlllIIl[155]));
                            bp.add((d)lllllllllllllllllllIlIIIIIlllIlI);
                            "".length();
                        }
                        if (u.lIIlIIlllllII(Bank.contains((Predicate)(lllllllllllllllllllIlIIIIIlllIlI = item -> item.getName().toLowerCase().contains(lIlIllIllI[lIlIlllIIl[161]]))) ? 1 : 0)) {
                            lllllllllllllllllllIlIIIIIlllIIl = new d(lIlIlllIIl[156], lIlIlllIIl[8], lIlIlllIIl[157]);
                            bp.add(lllllllllllllllllllIlIIIIIlllIIl);
                            "".length();
                        }
                        int[] nArray19 = new int[lIlIlllIIl[0]];
                        nArray19[u.lIlIlllIIl[1]] = lIlIlllIIl[34];
                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray19) ? 1 : 0)) break block43;
                        int[] nArray20 = new int[lIlIlllIIl[0]];
                        nArray20[u.lIlIlllIIl[1]] = lIlIlllIIl[34];
                        if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray20) ? 1 : 0)) break block44;
                        int[] nArray21 = new int[lIlIlllIIl[0]];
                        nArray21[u.lIlIlllIIl[1]] = lIlIlllIIl[34];
                        if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray21).getQuantity(), lIlIlllIIl[13])) break block44;
                    }
                    lllllllllllllllllllIlIIIIIlllIIl = new d(lIlIlllIIl[34], lIlIlllIIl[13], j.bZ);
                    bp.add(lllllllllllllllllllIlIIIIIlllIIl);
                    "".length();
                }
                int[] nArray = new int[lIlIlllIIl[0]];
                nArray[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray22 = new int[lIlIlllIIl[0]];
                nArray22[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
                if (!u.lIIlIIllllIlI(Bank.contains((int[])nArray22) ? 1 : 0)) break block46;
                int[] nArray23 = new int[lIlIlllIIl[0]];
                nArray23[u.lIlIlllIIl[1]] = lIlIlllIIl[36];
                if (!u.lIIlIIllllIll(Bank.getFirst((int[])nArray23).getQuantity(), lIlIlllIIl[28])) break block46;
            }
            lllllllllllllllllllIlIIIIIlllIIl = new d(lIlIlllIIl[36], lIlIlllIIl[22], lIlIlllIIl[158]);
            bp.add(lllllllllllllllllllIlIIIIIlllIIl);
            "".length();
        }
    }

    @Override
    public boolean af() {
        boolean bl;
        if (u.lIIlIIllllllI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlIlllIIl[2])) {
            bl = lIlIlllIIl[0];
            "".length();
            if (-" ".length() > (0xC1 ^ 0xC5)) {
                return ((0x2E ^ 0x7A) & ~(0x76 ^ 0x22)) != 0;
            }
        } else {
            bl = lIlIlllIIl[1];
        }
        return bl;
    }

    private static boolean lIIlIlIIIIIIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlIlIIIIIII(int n2) {
        return n2 > 0;
    }

    private static void lIIlIIllllIII() {
        lIlIlllIIl = new int[182];
        u.lIlIlllIIl[0] = " ".length();
        u.lIlIlllIIl[1] = (0x2A ^ 0x7B) & ~(0x7F ^ 0x2E) & ~((0x47 ^ 0x65) & ~(0x9C ^ 0xBE));
        u.lIlIlllIIl[2] = 22 + 116 - 37 + 40 + (76 + 127 - 102 + 136) - (68 + 133 - 40 + 78) + (0x2E ^ 0x4B);
        u.lIlIlllIIl[3] = 0x34 ^ 0x75;
        u.lIlIlllIIl[4] = 0x57 ^ 0x70 ^ (0x6A ^ 0x47);
        u.lIlIlllIIl[5] = 0xFFFF8DFE & 0x732F;
        u.lIlIlllIIl[6] = 0x34 ^ 0x59 ^ (0x68 ^ 0x39);
        u.lIlIlllIIl[7] = 0xFFFF9BF3 & 0x653F;
        u.lIlIlllIIl[8] = 0xE5 ^ 0x91 ^ (0x15 ^ 0x64);
        u.lIlIlllIIl[9] = "  ".length();
        u.lIlIlllIIl[10] = 95 + 98 - 173 + 116 ^ 111 + 1 - 65 + 121;
        u.lIlIlllIIl[11] = "   ".length();
        u.lIlIlllIIl[12] = 6 ^ 0x61 ^ (0x40 ^ 0x34);
        u.lIlIlllIIl[13] = 91 + 90 - 103 + 56 ^ 76 + 126 - 187 + 115;
        u.lIlIlllIIl[14] = 0x2E ^ 0xD;
        u.lIlIlllIIl[15] = 0x50 ^ 0x54 ^ (0x53 ^ 0x65);
        u.lIlIlllIIl[16] = 0x4C ^ 7 ^ (0xC4 ^ 0x89);
        u.lIlIlllIIl[17] = 0xFFFF8BFF & 0x77F2;
        u.lIlIlllIIl[18] = 0xFFFF8FFF & 0x781C;
        u.lIlIlllIIl[19] = 0x50 ^ 0x59;
        u.lIlIlllIIl[20] = 0xAE ^ 0xA9;
        u.lIlIlllIIl[21] = 21 + 27 - 17 + 104 ^ 129 + 8 - 114 + 120;
        u.lIlIlllIIl[22] = 0x42 ^ 0x6A;
        u.lIlIlllIIl[23] = 0x13 ^ 0x79 ^ (2 ^ 0x63);
        u.lIlIlllIIl[24] = 0x86 ^ 0x8A;
        u.lIlIlllIIl[25] = 0x3D ^ 0x30;
        u.lIlIlllIIl[26] = 0xE ^ 0x12 ^ (0x13 ^ 1);
        u.lIlIlllIIl[27] = 0xFFFF9FDE & 0x73A9;
        u.lIlIlllIIl[28] = 0xAB ^ 0xA4;
        u.lIlIlllIIl[29] = 0xFFFF8FCB & 0x77BF;
        u.lIlIlllIIl[30] = -(0xFFFFBB25 & 0x76DB) & (0xFFFFFFDF & 0x7EBF);
        u.lIlIlllIIl[31] = 0xFFFFFDED & 0x4EB7;
        u.lIlIlllIIl[32] = -(0xFFFFDCB1 & 0x336F) & (0xFFFFFF2E & 0x12FF);
        u.lIlIlllIIl[33] = -(0xFFFFBE7F & 0x4391) & (0xFFFFFF3F & 0xBFF);
        u.lIlIlllIIl[34] = -(0xFFFFFAEB & 0x4FBF) & (0xFFFFFBFF & 0x7FFB);
        u.lIlIlllIIl[35] = 0x8F ^ 0xA4 ^ (0x71 ^ 0x4A);
        u.lIlIlllIIl[36] = 0xFFFFDF5F & 0x3FE7;
        u.lIlIlllIIl[37] = 0xFFFFCFCF & 0x357B;
        u.lIlIlllIIl[38] = -(0xFFFFF70D & 0x28F3) & (0xFFFFFBEF & 0x2D3B);
        u.lIlIlllIIl[39] = -(0xFFFFFDF7 & 0x7B39) & (0xFFFFFFFF & Short.MAX_VALUE);
        u.lIlIlllIIl[40] = -(0xFFFFEAEA & 0x7D5F) & (0xFFFFFFFF & 0x6EFF);
        u.lIlIlllIIl[41] = -(0xFFFF9EDB & 0x77B7) & (0xFFFFBFFB & 0x7F96);
        u.lIlIlllIIl[42] = 0x73 ^ 0x62;
        u.lIlIlllIIl[43] = -(0xFFFFDCF5 & 0x632F) & (0xFFFFDF7F & 0x7FEE);
        u.lIlIlllIIl[44] = -(0xFFFFEF4B & 0x5DB6) & (0xFFFFDF7D & 0x6FAB);
        u.lIlIlllIIl[45] = 0xFFFFD7E7 & 0x2BFB;
        u.lIlIlllIIl[46] = 0xAA ^ 0xB8;
        u.lIlIlllIIl[47] = 0xB5 ^ 0xAD;
        u.lIlIlllIIl[48] = 0x97 ^ 0x83;
        u.lIlIlllIIl[49] = 0xA6 ^ 0x91 ^ (3 ^ 0x21);
        u.lIlIlllIIl[50] = 101 + 70 - 116 + 84 ^ 13 + 89 - -8 + 47;
        u.lIlIlllIIl[51] = 0xB4 ^ 0xA0 ^ "   ".length();
        u.lIlIlllIIl[52] = 0xFFFFDE3D & 0x2DDB;
        u.lIlIlllIIl[53] = -(0xFFFFBADE & 0x656D) & (0xFFFFEFEF & 0x3D7B);
        u.lIlIlllIIl[54] = 0x6C ^ 0x75;
        u.lIlIlllIIl[55] = 0x71 ^ 0x1F ^ (0xE ^ 0x7A);
        u.lIlIlllIIl[56] = 0xFFFFDD9A & 0x2F7F;
        u.lIlIlllIIl[57] = 0x6C ^ 0x77;
        u.lIlIlllIIl[58] = 0x58 ^ 0x65 ^ (0x4F ^ 0x6E);
        u.lIlIlllIIl[59] = 9 + 12 - -89 + 22 ^ 116 + 42 - 86 + 81;
        u.lIlIlllIIl[60] = -(0xFFFFEFFD & 0x7F03) & (0xFFFFFFFE & 0x7FB7);
        u.lIlIlllIIl[61] = 0xFFFFBEFD & 0x4F53;
        u.lIlIlllIIl[62] = -(0xFFFFEF91 & 0x726F) & (0xFFFFFFBF & 0x6FFF);
        u.lIlIlllIIl[63] = 0xFFFFDCFF & 0x33BE;
        u.lIlIlllIIl[64] = 0x36 ^ 0x6A ^ (0x1C ^ 0x5E);
        u.lIlIlllIIl[65] = 0x15 ^ 0x43 ^ (0x27 ^ 0x6E);
        u.lIlIlllIIl[66] = 0x1C ^ 0x3D;
        u.lIlIlllIIl[67] = 0x59 ^ 0x7B;
        u.lIlIlllIIl[68] = 0x4C ^ 0x68;
        u.lIlIlllIIl[69] = 0x23 ^ 6;
        u.lIlIlllIIl[70] = 0x74 ^ 0x52;
        u.lIlIlllIIl[71] = 0x6C ^ 0x77 ^ (0xB8 ^ 0x84);
        u.lIlIlllIIl[72] = 0x74 ^ 0x3E ^ (0x7E ^ 0x1D);
        u.lIlIlllIIl[73] = 0xFFFFFF87 & 0xE4FC;
        u.lIlIlllIIl[74] = 0xFFFFFF65 & 0xF7DE;
        u.lIlIlllIIl[75] = 0x65 ^ 0x4F;
        u.lIlIlllIIl[76] = 0xB3 ^ 0x95 ^ (0xBC ^ 0xB1);
        u.lIlIlllIIl[77] = 0xB0 ^ 0x9C;
        u.lIlIlllIIl[78] = 0x76 ^ 0x54 ^ (0x95 ^ 0x9A);
        u.lIlIlllIIl[79] = 0x4D ^ 0x63;
        u.lIlIlllIIl[80] = 0xA8 ^ 0x87;
        u.lIlIlllIIl[81] = 0x1C ^ 0x3B ^ (0xD0 ^ 0xC7);
        u.lIlIlllIIl[82] = 0xB ^ 0x3A;
        u.lIlIlllIIl[83] = -(0xFFFFFD19 & 0x3AEF) & (0xFFFFFFDD & 0x3FAF);
        u.lIlIlllIIl[84] = 0x9C ^ 0xAF;
        u.lIlIlllIIl[85] = 40 + 41 - 59 + 118 ^ 131 + 132 - 119 + 40;
        u.lIlIlllIIl[86] = 0x3B ^ 0xE;
        u.lIlIlllIIl[87] = "   ".length() ^ (0x78 ^ 0x4D);
        u.lIlIlllIIl[88] = 0x11 ^ 0x75 ^ (0xD4 ^ 0x87);
        u.lIlIlllIIl[89] = 0x24 ^ 0x62;
        u.lIlIlllIIl[90] = 0x39 ^ 0x22 ^ (0x5F ^ 0xD);
        u.lIlIlllIIl[91] = 0xFFFFDDA7 & 0x2FDE;
        u.lIlIlllIIl[92] = 0xFFFFEFEF & 0x1DF7;
        u.lIlIlllIIl[93] = 0x77 ^ 0x4F;
        u.lIlIlllIIl[94] = 0xFA ^ 0xC7 ^ (0x18 ^ 0x1C);
        u.lIlIlllIIl[95] = 0x59 ^ 0x15;
        u.lIlIlllIIl[96] = 0xB9 ^ 0x83;
        u.lIlIlllIIl[97] = 96 + 116 - 38 + 26 ^ 96 + 66 - 105 + 95;
        u.lIlIlllIIl[98] = 48 + 72 - 51 + 86 ^ 7 + 132 - 41 + 62;
        u.lIlIlllIIl[99] = 0x9F ^ 0xC5;
        u.lIlIlllIIl[100] = 0x56 ^ 0x32;
        u.lIlIlllIIl[101] = 0xF8 ^ 0xC5;
        u.lIlIlllIIl[102] = 0x63 ^ 0x5D;
        u.lIlIlllIIl[103] = -(8 ^ 0x1B) & (0xFFFFBF7F & 0x4F9F);
        u.lIlIlllIIl[104] = 0xA1 ^ 0x9E;
        u.lIlIlllIIl[105] = 43 + 87 - -74 + 23 ^ 57 + 116 - 48 + 30;
        u.lIlIlllIIl[106] = (0x3D ^ 0x12) + (12 + 55 - 1 + 62) - (0x78 ^ 2) + (0xE ^ 0x43);
        u.lIlIlllIIl[107] = 0x10 ^ 0x50;
        u.lIlIlllIIl[108] = 53 + 126 - 55 + 16;
        u.lIlIlllIIl[109] = 0x87 ^ 0xC5;
        u.lIlIlllIIl[110] = 0xFFFFABB3 & 0x5FED;
        u.lIlIlllIIl[111] = 0xFFFFBCFF & 0x4FA7;
        u.lIlIlllIIl[112] = -(0xFFFFDBB7 & 0x6759) & (0xFFFFCFBC & 0x7FFB);
        u.lIlIlllIIl[113] = 0x43 ^ 0;
        u.lIlIlllIIl[114] = 0xE0 ^ 0xA4;
        u.lIlIlllIIl[115] = 0x55 ^ 0x10;
        u.lIlIlllIIl[116] = 59 + 49 - -18 + 24;
        u.lIlIlllIIl[117] = 0xFFFFFC25 & 0xFFF;
        u.lIlIlllIIl[118] = -(0xFFFFA7FF & 0x7ACE) & (0xFFFFEFFF & 0x3FDF);
        u.lIlIlllIIl[119] = 215 + 226 - 292 + 88 ^ 46 + 47 - -76 + 1;
        u.lIlIlllIIl[120] = 0x6D ^ 0x25;
        u.lIlIlllIIl[121] = (0x1C ^ 0x55) + (0xC3 ^ 0xA3) - (105 + 59 - 74 + 58) + (7 + 131 - 60 + 61);
        u.lIlIlllIIl[122] = 63 + 143 - 59 + 23;
        u.lIlIlllIIl[123] = 0xFFFFAF73 & 0x5BFF;
        u.lIlIlllIIl[124] = 0xFFFF9DD0 & 0x6FFF;
        u.lIlIlllIIl[125] = 0x66 ^ 0x2C;
        u.lIlIlllIIl[126] = 0xCC ^ 0x87;
        u.lIlIlllIIl[127] = (0x8E ^ 0x99) + (39 + 17 - 27 + 123) - (0xD9 ^ 0xBC) + (0x73 ^ 0x19);
        u.lIlIlllIIl[128] = 0x13 ^ 0x5E;
        u.lIlIlllIIl[129] = 0x8C ^ 0xC2;
        u.lIlIlllIIl[130] = 0xF4 ^ 0xBB;
        u.lIlIlllIIl[131] = 163 + 19 - 16 + 24;
        u.lIlIlllIIl[132] = 166 + 121 - 223 + 136;
        u.lIlIlllIIl[133] = 0xFFFFFFE4 & 0x1FB;
        u.lIlIlllIIl[134] = 0x1A ^ 0x4B;
        u.lIlIlllIIl[135] = 0xD1 ^ 0xB4 ^ (0x7C ^ 0x4B);
        u.lIlIlllIIl[136] = 156 + 21 - 3 + 36;
        u.lIlIlllIIl[137] = 112 + 88 - 176 + 196;
        u.lIlIlllIIl[138] = 148 + 59 - 105 + 144 ^ 29 + 15 - -48 + 73;
        u.lIlIlllIIl[139] = 0x88 ^ 0xC6 ^ (0x6F ^ 0x75);
        u.lIlIlllIIl[140] = 0x19 ^ 0x4C;
        u.lIlIlllIIl[141] = (0x71 ^ 0x16) + (0x82 ^ 0x95) - (0xE7 ^ 0xAB) + (43 + 172 - 106 + 71);
        u.lIlIlllIIl[142] = 0x95 ^ 0xC3;
        u.lIlIlllIIl[143] = 0x75 ^ 0x22;
        u.lIlIlllIIl[144] = 0x3A ^ 0x76 ^ (0x4E ^ 0x5A);
        u.lIlIlllIIl[145] = 0x41 ^ 0x18;
        u.lIlIlllIIl[146] = 0x27 ^ 0x66 ^ (0xDF ^ 0xC5);
        u.lIlIlllIIl[147] = -(0xFFFFCF33 & 0x72CF) & (0xFFFFCFFE & 0x777B);
        u.lIlIlllIIl[148] = 0xFFFFF7C1 & 0xE7E;
        u.lIlIlllIIl[149] = 0xFFFFEC6E & 0x37F9;
        u.lIlIlllIIl[150] = 0xFFFFFB7A & 0x1FDD;
        u.lIlIlllIIl[151] = -(0xFFFF995B & 0x7EAF) & (0xFFFFBFDA & 0x5FFF);
        u.lIlIlllIIl[152] = -(0xFFFFFA52 & 0x6FFF) & (0xFFFFFFFF & Short.MAX_VALUE);
        u.lIlIlllIIl[153] = -(0xFFFFFBB6 & 0x146F) & (0xFFFFFFE5 & 0x77FF);
        u.lIlIlllIIl[154] = 0xFFFF93FD & 0x6FEA;
        u.lIlIlllIIl[155] = -(0xFFFFB6EF & 0x5B91) & (0xFFFF9FFF & Short.MAX_VALUE);
        u.lIlIlllIIl[156] = 0xFFFFFEFF & 0x2FCC;
        u.lIlIlllIIl[157] = 0xFFFFE9BB & 0x77EC;
        u.lIlIlllIIl[158] = 0xFFFFB7D4 & 0x4D3F;
        u.lIlIlllIIl[159] = 0x9D ^ 0xC1;
        u.lIlIlllIIl[160] = 48 + 70 - 95 + 189 ^ 46 + 29 - -19 + 43;
        u.lIlIlllIIl[161] = 0x41 ^ 0x1F;
        u.lIlIlllIIl[162] = 136 + 161 - 220 + 136 ^ 45 + 100 - 119 + 112;
        u.lIlIlllIIl[163] = -(0xFFFFB3FB & 0x4FE5) & (0xFFFFBFFF & 0x4FF3);
        u.lIlIlllIIl[164] = -(0xFFFFF3FF & 0x7E93) & (0xFFFFFFFF & Short.MAX_VALUE);
        u.lIlIlllIIl[165] = -(0xFFFFF15B & 0x4EA5) & (0xFFFFDFAF & 0x6DFD);
        u.lIlIlllIIl[166] = 83 + 38 - -90 + 36 + (51 + 87 - 124 + 172) - (0xFFFFCB63 & 0x35FE) + (72 + 149 - 201 + 156);
        u.lIlIlllIIl[167] = -(0xFFFFFB6B & 0x75FF) & (0xFFFFFFFF & 0x7D7F);
        u.lIlIlllIIl[168] = -(0xFFFFEACB & 0x3776) & (0xFFFFFFFF & 0x2F5F);
        u.lIlIlllIIl[169] = -(0xFFFF9537 & 0x7ECB) & (0xFFFF9EFF & 0x7FEF);
        u.lIlIlllIIl[170] = 0xFFFFEF56 & 0x1DFF;
        u.lIlIlllIIl[171] = 0xFFFFBF67 & 0x4EBC;
        u.lIlIlllIIl[172] = -(0xFFFFE259 & 0x7FAF) & (0xFFFFEFEF & 0x7FDF);
        u.lIlIlllIIl[173] = 0x6A ^ 0xA;
        u.lIlIlllIIl[174] = 0x3D ^ 0x5C;
        u.lIlIlllIIl[175] = 0xC2 ^ 0xA0;
        u.lIlIlllIIl[176] = 0x43 ^ 0x20;
        u.lIlIlllIIl[177] = 87 + 117 - 14 + 27 ^ 90 + 56 - 86 + 128;
        u.lIlIlllIIl[178] = 0x32 ^ 0x54;
        u.lIlIlllIIl[179] = 40 + 177 - 127 + 102 ^ 73 + 152 - 68 + 10;
        u.lIlIlllIIl[180] = 0x4F ^ 0x27;
        u.lIlIlllIIl[181] = 0x27 ^ 0x4E;
    }

    private static String lIIlIIllIlIII(String lllllllllllllllllllIlIIIIIlIIIlI, String lllllllllllllllllllIlIIIIIIlllll) {
        try {
            SecretKeySpec lllllllllllllllllllIlIIIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIIIIIlllll.getBytes(StandardCharsets.UTF_8)), lIlIlllIIl[21]), "DES");
            Cipher lllllllllllllllllllIlIIIIIlIIlII = Cipher.getInstance("DES");
            lllllllllllllllllllIlIIIIIlIIlII.init(lIlIlllIIl[9], lllllllllllllllllllIlIIIIIlIIlIl);
            return new String(lllllllllllllllllllIlIIIIIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIlIIIIIlIIIll) {
            lllllllllllllllllllIlIIIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlIIIIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIIlIIllIIllI(String lllllllllllllllllllIlIIIIIlIllIl, String lllllllllllllllllllIlIIIIIlIllII) {
        try {
            SecretKeySpec lllllllllllllllllllIlIIIIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIIIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIlIIIIIllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIlIIIIIllIIIl.init(lIlIlllIIl[9], lllllllllllllllllllIlIIIIIllIIlI);
            return new String(lllllllllllllllllllIlIIIIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIlIIIIIllIIII) {
            lllllllllllllllllllIlIIIIIllIIII.printStackTrace();
            return null;
        }
    }

    private static int lIIlIIllllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public String ae() {
        if (u.lIIlIlIIIIlIl(dl, lIlIllIllI[lIlIlllIIl[159]])) {
            return lIlIllIllI[lIlIlllIIl[160]];
        }
        return "Animal Magnetism - " + dl;
    }

    private static boolean lIIlIIllllIll(int n2, int n3) {
        return n2 < n3;
    }
}

