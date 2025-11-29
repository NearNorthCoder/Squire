package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.B  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/B.class */
public class B implements K {
    public static final /* synthetic */ String fu;
    public static final /* synthetic */ String eB;
    public static final /* synthetic */ String eR;
    public static final /* synthetic */ String eK;
    public static final /* synthetic */ String eA;
    public static final /* synthetic */ String ft;
    public static final /* synthetic */ String fW;
    public static final /* synthetic */ int el;
    public static final /* synthetic */ WorldPoint ev;
    public static final /* synthetic */ WorldPoint ew;
    public static final /* synthetic */ String eF;
    public static final /* synthetic */ String fq;
    public static final /* synthetic */ int ec;
    public static final /* synthetic */ String fC;
    public static final /* synthetic */ String eU;
    public static final /* synthetic */ WorldPoint et;
    public static final /* synthetic */ String fL;
    public static final /* synthetic */ String ga;
    public static final /* synthetic */ String fi;
    public static final /* synthetic */ String eJ;
    public static final /* synthetic */ int eb;
    public static final /* synthetic */ String eS;
    public static final /* synthetic */ String fb;
    public static final /* synthetic */ String fQ;
    public static final /* synthetic */ String fd;
    public static final /* synthetic */ int ef;
    public static final /* synthetic */ String eO;
    public static final /* synthetic */ int eo;
    public static final /* synthetic */ String fE;
    public static final /* synthetic */ String fB;
    public static final /* synthetic */ String eI;
    public static final /* synthetic */ String eL;
    public static final /* synthetic */ String fK;
    static /* synthetic */ boolean dd;
    private static /* synthetic */ String[] lIlllIIIII;
    public static final /* synthetic */ String fr;
    public static final /* synthetic */ String ez;
    public static final /* synthetic */ int eg;
    public static final /* synthetic */ int ej;
    public static final /* synthetic */ String fw;
    public static /* synthetic */ boolean bn;
    public static final /* synthetic */ String fS;
    public static final /* synthetic */ String eQ;
    public static final /* synthetic */ String fy;
    public static /* synthetic */ String[] gd;
    public static final /* synthetic */ String fM;
    public static final /* synthetic */ String fa;
    public static final /* synthetic */ int ed;
    public static final /* synthetic */ String fh;
    public static final /* synthetic */ String fk;
    public static final /* synthetic */ String fe;
    public static final /* synthetic */ String fR;
    public static final /* synthetic */ int en;
    public static final /* synthetic */ String fv;
    public static final /* synthetic */ String eW;
    public static final /* synthetic */ int ea;
    public static final /* synthetic */ String eT;
    public static final /* synthetic */ int ek;
    public static final /* synthetic */ WorldPoint eu;
    public static final /* synthetic */ String eZ;
    public static final /* synthetic */ WorldPoint eq;
    public static final /* synthetic */ String fZ;
    public static final /* synthetic */ String eH;
    public static final /* synthetic */ String fl;
    public static final /* synthetic */ String eY;
    public static final /* synthetic */ String fY;
    public static final /* synthetic */ String fG;
    public static final /* synthetic */ String fH;
    public static final /* synthetic */ String eV;
    public static final /* synthetic */ String fc;
    public static final /* synthetic */ int ei;
    public static final /* synthetic */ String fm;
    public static final /* synthetic */ String eD;
    public static final /* synthetic */ WorldPoint er;
    public static final /* synthetic */ String ey;
    public static final /* synthetic */ String fA;
    public static final /* synthetic */ String eP;
    public static final /* synthetic */ String eG;
    public static final /* synthetic */ String fs;
    public static final /* synthetic */ String fg;
    public static final /* synthetic */ String eC;
    public static final /* synthetic */ String fp;
    public static final /* synthetic */ String eM;
    static /* synthetic */ int dc;
    public static final /* synthetic */ String gc;
    public static final /* synthetic */ WorldPoint es;
    public static final /* synthetic */ String ex;
    public static final /* synthetic */ int eh;
    public static final /* synthetic */ String fj;
    public static final /* synthetic */ int em;
    public static final /* synthetic */ String fx;
    private static /* synthetic */ int[] lIlllIIIlI;
    public static final /* synthetic */ String fN;
    public static /* synthetic */ WorldArea cz;
    public static final /* synthetic */ String fz;
    public static final /* synthetic */ String fV;
    public static final /* synthetic */ String fU;
    public static final /* synthetic */ String fJ;
    public static final /* synthetic */ int dZ;
    public static final /* synthetic */ String fO;
    public static final /* synthetic */ String fn;
    public static final /* synthetic */ String eE;
    public static final /* synthetic */ String eN;
    public static final /* synthetic */ String eX;
    public static final /* synthetic */ String fT;
    public static final /* synthetic */ String gb;
    public static final /* synthetic */ int ep;
    public static final /* synthetic */ String fP;
    public static final /* synthetic */ String fI;
    public static /* synthetic */ List<C0003d> bp;
    public static final /* synthetic */ String fF;
    public static final /* synthetic */ String fX;
    public static final /* synthetic */ String fD;
    public static final /* synthetic */ String ff;
    public static final /* synthetic */ String fo;
    public static final /* synthetic */ int ee;

    private static boolean lIIllIlllllII(Object obj) {
        return obj != null;
    }

    private static boolean lIIllIllllIlI(int i, int i2) {
        return i < i2;
    }

    private static void q(int i) {
        if (!lIIllIllllIll(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIlllIIIIIIl(Widgets.get(lIlllIIIlI[19]))) {
            int[] iArr = new int[lIlllIIIlI[2]];
            iArr[lIlllIIIlI[1]] = i;
            if (lIIllIlllllII(TileObjects.getNearest(iArr))) {
                int[] iArr2 = new int[lIlllIIIlI[2]];
                iArr2[lIlllIIIlI[1]] = i;
                TileObjects.getNearest(iArr2).interact(lIlllIIIII[lIlllIIIlI[64]]);
                Time.sleepTicks(lIlllIIIlI[6]);
                "".length();
            }
        }
    }

    private static boolean lIIlllIIIIIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlllIIIIIlI(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[56]) && lIIlllIIIIIlI(Skills.getLevel(Skill.HUNTER), lIlllIIIlI[17])) {
            ?? r0 = lIlllIIIlI[2];
            "".length();
            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllIIIlI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean] */
    private static void bJ() {
        Widget widget = Widgets.get(lIlllIIIlI[19], lIlllIIIlI[61]);
        if (lIIlllIIIIIIl(widget)) {
            System.out.println(lIlllIIIII[lIlllIIIlI[62]]);
            return;
        }
        if (lIIllIlllllII(widget)) {
            System.out.println(widget.getText());
        }
        int i = lIlllIIIlI[1];
        while (lIIllIllllIlI(i, EnumC0008i.values().length)) {
            if (lIIllIllllIIl(widget.getText().equalsIgnoreCase(EnumC0008i.values()[i].Y()) ? 1 : 0)) {
                System.out.println("answer: " + EnumC0008i.values()[i].Z());
                int i2 = i;
                Widget widget2 = Widgets.get(lIlllIIIlI[19], widget3 -> {
                    return widget3.getText().strip().contains(EnumC0008i.values()[i2].Z());
                });
                if (lIIllIlllllII(widget2)) {
                    System.out.println(lIlllIIIII[lIlllIIIlI[63]]);
                    Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) lIlllIIIlI[2]);
                    Time.sleepTicks(lIlllIIIlI[6]);
                    "".length();
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return;
                    }
                    return;
                }
            }
            i++;
            "".length();
            if ((((192 ^ 152) ^ (131 ^ 136)) & (((((21 + 41) - 47) + 185) ^ (((117 + 5) - 59) + 92)) ^ (-" ".length()))) != 0) {
                return;
            }
        }
    }

    private static String lIIllIlllIIIl(String lllllllllllllllllllIIIIIIIlllIlI, String lllllllllllllllllllIIIIIIIlllIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllllIIIIIIIllIlll = lllllllllllllllllllIIIIIIIlllIIl.toCharArray();
        int lllllllllllllllllllIIIIIIIllIllI = lIlllIIIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlllIIIlI[1];
        while (lIIllIllllIlI(i, length)) {
            char lllllllllllllllllllIIIIIIIlllIll = charArray[i];
            sb.append((char) (lllllllllllllllllllIIIIIIIlllIll ^ lllllllllllllllllllIIIIIIIllIlll[lllllllllllllllllllIIIIIIIllIllI % lllllllllllllllllllIIIIIIIllIlll.length]));
            "".length();
            lllllllllllllllllllIIIIIIIllIllI++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private static boolean al() {
        if (lIIllIlllllIl(Inventory.getCount(C0005f.aU))) {
            int[] iArr = new int[lIlllIIIlI[2]];
            iArr[lIlllIIIlI[1]] = lIlllIIIlI[7];
            if (lIIllIlllllIl(Inventory.getCount(iArr))) {
                ?? r0 = lIlllIIIlI[2];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlllIIIlI[1];
    }

    private static boolean lIIllIllllllI(int i, int i2) {
        return i > i2;
    }

    private static String lIIllIlllIIlI(String lllllllllllllllllllIIIIIIlIlIlll, String lllllllllllllllllllIIIIIIlIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), lIlllIIIlI[13]), "DES");
            Cipher lllllllllllllllllllIIIIIIlIllIIl = Cipher.getInstance("DES");
            lllllllllllllllllllIIIIIIlIllIIl.init(lIlllIIIlI[6], secretKeySpec);
            return new String(lllllllllllllllllllIIIIIIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIIIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIIIIlIllIII) {
            lllllllllllllllllllIIIIIIlIllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlllIIIlI[1];
    }

    private static boolean lIIlllIIIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIllIllllIIl(int i) {
        return i != 0;
    }

    private static boolean lIIllIlllllIl(int i) {
        return i > 0;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            bI();
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((((85 + 53) - 15) + 33) ^ (((89 + 112) - 72) + 66)) & (((94 ^ 100) ^ (112 ^ 21)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlllIIIlI[68];
    }

    static {
        lIIllIllllIII();
        lIIllIlllIlll();
        ep = lIlllIIIlI[55];
        fq = lIlllIIIII[lIlllIIIlI[70]];
        fo = lIlllIIIII[lIlllIIIlI[71]];
        fa = lIlllIIIII[lIlllIIIlI[72]];
        eU = lIlllIIIII[lIlllIIIlI[73]];
        fu = lIlllIIIII[lIlllIIIlI[74]];
        eo = lIlllIIIlI[52];
        fE = lIlllIIIII[lIlllIIIlI[75]];
        dZ = lIlllIIIlI[3];
        fc = lIlllIIIII[lIlllIIIlI[76]];
        eX = lIlllIIIII[lIlllIIIlI[77]];
        fX = lIlllIIIII[lIlllIIIlI[78]];
        eJ = lIlllIIIII[lIlllIIIlI[79]];
        fw = lIlllIIIII[lIlllIIIlI[80]];
        ee = lIlllIIIlI[24];
        eF = lIlllIIIII[lIlllIIIlI[11]];
        fz = lIlllIIIII[lIlllIIIlI[81]];
        fn = lIlllIIIII[lIlllIIIlI[82]];
        eM = lIlllIIIII[lIlllIIIlI[83]];
        eg = lIlllIIIlI[28];
        en = lIlllIIIlI[49];
        eS = lIlllIIIII[lIlllIIIlI[84]];
        ft = lIlllIIIII[lIlllIIIlI[85]];
        eY = lIlllIIIII[lIlllIIIlI[86]];
        fp = lIlllIIIII[lIlllIIIlI[87]];
        fY = lIlllIIIII[lIlllIIIlI[88]];
        fy = lIlllIIIII[lIlllIIIlI[89]];
        eD = lIlllIIIII[lIlllIIIlI[0]];
        fr = lIlllIIIII[lIlllIIIlI[90]];
        fI = lIlllIIIII[lIlllIIIlI[91]];
        fQ = lIlllIIIII[lIlllIIIlI[92]];
        ez = lIlllIIIII[lIlllIIIlI[93]];
        ej = lIlllIIIlI[37];
        em = lIlllIIIlI[46];
        fd = lIlllIIIII[lIlllIIIlI[94]];
        fJ = lIlllIIIII[lIlllIIIlI[95]];
        ex = lIlllIIIII[lIlllIIIlI[96]];
        fM = lIlllIIIII[lIlllIIIlI[97]];
        ei = lIlllIIIlI[34];
        fF = lIlllIIIII[lIlllIIIlI[98]];
        eL = lIlllIIIII[lIlllIIIlI[99]];
        fR = lIlllIIIII[lIlllIIIlI[100]];
        eK = lIlllIIIII[lIlllIIIlI[101]];
        ec = lIlllIIIlI[18];
        ey = lIlllIIIII[lIlllIIIlI[102]];
        eV = lIlllIIIII[lIlllIIIlI[103]];
        eR = lIlllIIIII[lIlllIIIlI[104]];
        fT = lIlllIIIII[lIlllIIIlI[105]];
        gb = lIlllIIIII[lIlllIIIlI[106]];
        fO = lIlllIIIII[lIlllIIIlI[107]];
        eO = lIlllIIIII[lIlllIIIlI[108]];
        fm = lIlllIIIII[lIlllIIIlI[109]];
        eB = lIlllIIIII[lIlllIIIlI[110]];
        fl = lIlllIIIII[lIlllIIIlI[111]];
        eP = lIlllIIIII[lIlllIIIlI[112]];
        eb = lIlllIIIlI[19];
        fk = lIlllIIIII[lIlllIIIlI[113]];
        fV = lIlllIIIII[lIlllIIIlI[114]];
        eH = lIlllIIIII[lIlllIIIlI[115]];
        eT = lIlllIIIII[lIlllIIIlI[116]];
        fb = lIlllIIIII[lIlllIIIlI[117]];
        eW = lIlllIIIII[lIlllIIIlI[118]];
        fx = lIlllIIIII[lIlllIIIlI[119]];
        fD = lIlllIIIII[lIlllIIIlI[120]];
        eC = lIlllIIIII[lIlllIIIlI[121]];
        fG = lIlllIIIII[lIlllIIIlI[122]];
        fW = lIlllIIIII[lIlllIIIlI[123]];
        ga = lIlllIIIII[lIlllIIIlI[124]];
        fA = lIlllIIIII[lIlllIIIlI[125]];
        fH = lIlllIIIII[lIlllIIIlI[126]];
        fN = lIlllIIIII[lIlllIIIlI[127]];
        fZ = lIlllIIIII[lIlllIIIlI[128]];
        fv = lIlllIIIII[lIlllIIIlI[129]];
        fL = lIlllIIIII[lIlllIIIlI[130]];
        fe = lIlllIIIII[lIlllIIIlI[131]];
        eA = lIlllIIIII[lIlllIIIlI[132]];
        eE = lIlllIIIII[lIlllIIIlI[133]];
        ea = lIlllIIIlI[6];
        fP = lIlllIIIII[lIlllIIIlI[134]];
        fj = lIlllIIIII[lIlllIIIlI[135]];
        fS = lIlllIIIII[lIlllIIIlI[136]];
        fB = lIlllIIIII[lIlllIIIlI[137]];
        el = lIlllIIIlI[43];
        ef = lIlllIIIlI[26];
        fC = lIlllIIIII[lIlllIIIlI[138]];
        fU = lIlllIIIII[lIlllIIIlI[68]];
        eZ = lIlllIIIII[lIlllIIIlI[139]];
        fs = lIlllIIIII[lIlllIIIlI[140]];
        ed = lIlllIIIlI[22];
        eG = lIlllIIIII[lIlllIIIlI[141]];
        eN = lIlllIIIII[lIlllIIIlI[142]];
        eh = lIlllIIIlI[31];
        ff = lIlllIIIII[lIlllIIIlI[143]];
        eI = lIlllIIIII[lIlllIIIlI[144]];
        fK = lIlllIIIII[lIlllIIIlI[145]];
        ek = lIlllIIIlI[40];
        fg = lIlllIIIII[lIlllIIIlI[146]];
        fh = lIlllIIIII[lIlllIIIlI[147]];
        fi = lIlllIIIII[lIlllIIIlI[148]];
        eQ = lIlllIIIII[lIlllIIIlI[149]];
        gc = lIlllIIIII[lIlllIIIlI[150]];
        eq = new WorldPoint(lIlllIIIlI[151], lIlllIIIlI[152], lIlllIIIlI[1]);
        er = new WorldPoint(lIlllIIIlI[153], lIlllIIIlI[154], lIlllIIIlI[1]);
        es = new WorldPoint(lIlllIIIlI[155], lIlllIIIlI[156], lIlllIIIlI[1]);
        et = new WorldPoint(lIlllIIIlI[157], lIlllIIIlI[158], lIlllIIIlI[1]);
        eu = new WorldPoint(lIlllIIIlI[159], lIlllIIIlI[160], lIlllIIIlI[1]);
        ev = new WorldPoint(lIlllIIIlI[161], lIlllIIIlI[162], lIlllIIIlI[1]);
        ew = new WorldPoint(lIlllIIIlI[163], lIlllIIIlI[164], lIlllIIIlI[1]);
        bp = new ArrayList();
        String[] strArr = new String[lIlllIIIlI[2]];
        strArr[lIlllIIIlI[1]] = lIlllIIIII[lIlllIIIlI[165]];
        gd = strArr;
        cz = new WorldArea(lIlllIIIlI[166], lIlllIIIlI[167], lIlllIIIlI[168], lIlllIIIlI[169], lIlllIIIlI[1]);
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlllIIIII[lIlllIIIlI[69]];
    }

    private static boolean lIIllIllllIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v546, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v566, types: [boolean] */
    public static void bI() {
        if (lIIllIllllIIl(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIllIllllIlI(Movement.getRunEnergy(), lIlllIIIlI[0])) {
            Inventory.getFirst(C0005f.aU).interact(lIlllIIIII[lIlllIIIlI[1]]);
            Time.sleepTicks(lIlllIIIlI[2]);
            "".length();
        }
        if (lIIllIllllIll(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (lIIllIllllIIl(bn ? 1 : 0)) {
            C0001b.a(bp);
            if (lIIllIllllIlI(bp.size(), lIlllIIIlI[2])) {
                System.out.println(lIlllIIIII[lIlllIIIlI[2]]);
                bn = lIlllIIIlI[1];
            }
        }
        if (lIIllIllllIll(bn ? 1 : 0)) {
            if (lIIllIllllIll(al() ? 1 : 0) && lIIllIllllIlI(C0004e.j(lIlllIIIlI[3]), lIlllIIIlI[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIllIlllllII(nearest) && lIIllIllllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0000a.a(nearest);
                }
                if (lIIllIlllllII(nearest) && lIIllIllllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIllIllllIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllIIIlI[4]);
                        "".length();
                    }
                    if (lIIllIllllIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllIlllllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllIIIlI[5]);
                            "".length();
                        }
                        if (lIIllIlllllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlllIIIlI[6]);
                            "".length();
                        }
                        int[] iArr = new int[lIlllIIIlI[6]];
                        iArr[lIlllIIIlI[1]] = lIlllIIIlI[7];
                        iArr[lIlllIIIlI[2]] = lIlllIIIlI[8];
                        if (lIIllIllllIll(C0004e.b(iArr) ? 1 : 0)) {
                            O();
                            System.out.println(lIlllIIIII[lIlllIIIlI[6]]);
                            bn = lIlllIIIlI[2];
                            return;
                        }
                        int[] iArr2 = new int[lIlllIIIlI[6]];
                        iArr2[lIlllIIIlI[1]] = lIlllIIIlI[7];
                        iArr2[lIlllIIIlI[2]] = lIlllIIIlI[8];
                        if (lIIllIllllIIl(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIlllIIIlI[7], lIlllIIIlI[9]);
                            C0000a.b(C0005f.aU, lIlllIIIlI[10]);
                        }
                    }
                }
            }
            if (lIIllIllllIIl(al() ? 1 : 0) && lIIllIllllIll(C0004e.j(lIlllIIIlI[3]))) {
                if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(er), lIlllIIIlI[11])) {
                    if (lIIllIllllIIl(cz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] iArr3 = new int[lIlllIIIlI[2]];
                        iArr3[lIlllIIIlI[1]] = lIlllIIIlI[7];
                        if (lIIllIllllIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIlllIIIlI[2]];
                            iArr4[lIlllIIIlI[1]] = lIlllIIIlI[7];
                            Inventory.getFirst(iArr4).interact(lIlllIIIII[lIlllIIIlI[12]]);
                            Time.sleepTicks(lIlllIIIlI[13]);
                            "".length();
                        }
                    }
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[5]];
                    Movement.walkTo(er);
                    "".length();
                    Time.sleepTicks(lIlllIIIlI[2]);
                    "".length();
                }
                if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(er), lIlllIIIlI[13])) {
                    C0006g.a(lIlllIIIII[lIlllIIIlI[10]], gd);
                    Time.sleepTicks(lIlllIIIlI[2]);
                    "".length();
                }
            }
            if (lIIllIlllllIl(C0004e.j(lIlllIIIlI[3]))) {
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[15])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[16]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(es), lIlllIIIlI[17])) {
                        Movement.walkTo(es);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(es), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[18]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[20])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[21]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(es), lIlllIIIlI[17])) {
                        Movement.walkTo(es);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(es), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[22]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[23])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[13]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        Movement.walkTo(et);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[24]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[25])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[17]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        Movement.walkTo(et);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[26]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[27])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[9]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        Movement.walkTo(et);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[28]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[29])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[30]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        Movement.walkTo(et);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[31]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[32])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[33]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(eu), lIlllIIIlI[17])) {
                        Movement.walkTo(eu);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(eu), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[34]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[35])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[36]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(eu), lIlllIIIlI[17])) {
                        Movement.walkTo(eu);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(eu), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[37]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[38])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[39]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ev), lIlllIIIlI[17])) {
                        Movement.walkTo(ev);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ev), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[40]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[41])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[42]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ev), lIlllIIIlI[17])) {
                        Movement.walkTo(ev);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ev), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[43]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[44])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[45]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        Movement.walkTo(ew);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[46]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[47])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[48]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        Movement.walkTo(ew);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[49]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[50])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[51]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        Movement.walkTo(ew);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[52]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[53])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[54]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        Movement.walkTo(ew);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        q(lIlllIIIlI[55]);
                        if (!lIIllIllllIIl(Widgets.get(lIlllIIIlI[19]).isEmpty() ? 1 : 0) || lIIllIlllllII(Widgets.get(lIlllIIIlI[19]))) {
                            bJ();
                        }
                    }
                }
                if (lIIlllIIIIIII(C0004e.j(lIlllIIIlI[14]), lIlllIIIlI[56]) && lIIllIllllIlI(Skills.getLevel(Skill.HUNTER), lIlllIIIlI[17])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[57]];
                    if (lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(er), lIlllIIIlI[13])) {
                        AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[58]];
                        Movement.walkTo(er);
                        "".length();
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                    if (lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(er), lIlllIIIlI[13])) {
                        AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[59]];
                        C0006g.a(lIlllIIIII[lIlllIIIlI[60]], gd);
                        Time.sleepTicks(lIlllIIIlI[2]);
                        "".length();
                    }
                }
            }
            System.out.println(C0004e.j(lIlllIIIlI[14]));
        }
    }

    private static boolean lIIllIlllllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlllIIIIIIl(Object obj) {
        return obj == null;
    }

    private static void lIIllIlllIlll() {
        lIlllIIIII = new String[lIlllIIIlI[170]];
        lIlllIIIII[lIlllIIIlI[1]] = lIIllIlllIIIl("LDMrADw=", "hABnW");
        lIlllIIIII[lIlllIIIlI[2]] = lIIllIlllIIIl("EwsLPiA9BwF3MSAbDDk0dQsRMj4mTkUkJDwWBj86OwVFNTI2CUUjPHUTEDIgIQ==", "UbeWS");
        lIlllIIIII[lIlllIIIlI[6]] = lIIllIlllIIlI("/hTRFrig5gGn/KJ3r5EidrkSSGd1rCCoe8Tq+Yi97kA0udH66xe6f9GheXBNvHmupZTjpx4+OCA=", "QdVWb");
        lIlllIIIII[lIlllIIIlI[12]] = lIIllIlllIIlI("K5jBOA5Pe7c=", "vlKQN");
        lIlllIIIII[lIlllIIIlI[5]] = lIIllIlllIIll("tei7J1xSsNb8zg0nBL9dHw==", "Hfsmv");
        lIlllIIIII[lIlllIIIlI[10]] = lIIllIlllIIIl("OzAkMQcQLWgDBB02IA==", "tBHPi");
        lIlllIIIII[lIlllIIIlI[16]] = lIIllIlllIIIl("Ogg/OwQHAHM5CBsVPD9NCw4hKQ==", "igSMm");
        lIlllIIIII[lIlllIIIlI[21]] = lIIllIlllIIlI("G7Z2+bO5C+2vITKth5SZ6thfdMXL9WQ0", "dvmzn");
        lIlllIIIII[lIlllIIIlI[13]] = lIIllIlllIIll("ZElY9anxh/KnXKw0cs5NTw==", "OMDfx");
        lIlllIIIII[lIlllIIIlI[17]] = lIIllIlllIIIl("PiwqBDgDJGYBNAxjNR4kCg==", "mCFrQ");
        lIlllIIIII[lIlllIIIlI[9]] = lIIllIlllIIll("NkzTtzDuLT8RH9WHWASb6w==", "KrerM");
        lIlllIIIII[lIlllIIIlI[30]] = lIIllIlllIIll("c9YWg6dXojJPK5wT+eb3zdTvnYjhy8Bt", "pnmQd");
        lIlllIIIII[lIlllIIIlI[33]] = lIIllIlllIIIl("KyIdJj4WKlEnLg4oAz4=", "xMqPW");
        lIlllIIIII[lIlllIIIlI[36]] = lIIllIlllIIlI("Qs7U6wtTgUt78XvT8Vxsmg==", "mlJuf");
        lIlllIIIII[lIlllIIIlI[39]] = lIIllIlllIIIl("FxsNAzwqE0EBOjYA", "DtauU");
        lIlllIIIII[lIlllIIIlI[42]] = lIIllIlllIIll("HsZcOwhhREHFKP8Rorxa+Q==", "WyGyk");
        lIlllIIIII[lIlllIIIlI[45]] = lIIllIlllIIIl("BCMaMiI5K1YoLjIvHg==", "WLvDK");
        lIlllIIIII[lIlllIIIlI[48]] = lIIllIlllIIll("PJqCh4YMlQpQVb39jfvUTg==", "OLAbZ");
        lIlllIIIII[lIlllIIIlI[51]] = lIIllIlllIIlI("hIDupqV8WHIUFKn5KxqzlA==", "yxNyJ");
        lIlllIIIII[lIlllIIIlI[54]] = lIIllIlllIIIl("NjwPETELNEMLPQAwCw==", "eScgX");
        lIlllIIIII[lIlllIIIlI[57]] = lIIllIlllIIll("XpPNIt7PYrfBrjxLuQhx+KFUfFLZTx0l", "RDYuN");
        lIlllIIIII[lIlllIIIlI[58]] = lIIllIlllIIIl("NgQ0VDIXRTEAJwoR", "xeBtF");
        lIlllIIIII[lIlllIIIlI[59]] = lIIllIlllIIIl("Pyc+LioFIQ==", "kFREC");
        lIlllIIIII[lIlllIIIlI[60]] = lIIllIlllIIIl("IiI4BQAJP3Q3AwQkPA==", "mPTdn");
        lIlllIIIII[lIlllIIIlI[62]] = lIIllIlllIIlI("hUdbFrcz1dFk71qWTRWPfA==", "XgOeA");
        lIlllIIIII[lIlllIIIlI[63]] = lIIllIlllIIll("k4dhORvEx+Xi/AcMP+2S+w==", "aPltc");
        lIlllIIIII[lIlllIIIlI[64]] = lIIllIlllIIlI("Y2BlZRrA/CM=", "QMFPz");
        lIlllIIIII[lIlllIIIlI[69]] = lIIllIlllIIll("MnVwtY5LP356CQGnpJxmsg==", "zcbph");
        lIlllIIIII[lIlllIIIlI[61]] = lIIllIlllIIll("k61dLVPhFwRd3EscGnK1OR54/KRDZbin", "ebJLJ");
        lIlllIIIII[lIlllIIIlI[70]] = lIIllIlllIIll("0DhPo0JoxJ2uBjh6whpWOg==", "pkqGe");
        lIlllIIIII[lIlllIIIlI[71]] = lIIllIlllIIIl("DQ4vSic1BzMPBnkrKxkAPBQ5", "YfJjt");
        lIlllIIIII[lIlllIIIlI[72]] = lIIllIlllIIll("Pd3yw/SjIHte7DeVF//ZkR8nvLnDZL78", "ykIib");
        lIlllIIIII[lIlllIIIlI[73]] = lIIllIlllIIlI("B7OAZ+cVWzZq9sqFVD7W8g==", "LHARt");
        lIlllIIIII[lIlllIIIlI[74]] = lIIllIlllIIIl("DT8BLCso", "ZPsGN");
        lIlllIIIII[lIlllIIIlI[75]] = lIIllIlllIIIl("RA==", "tJByb");
        lIlllIIIII[lIlllIIIlI[76]] = lIIllIlllIIlI("U4yXsJmOnvxQAUso3CSgNuodQ+dC9hKGrkBOMPjKXVk=", "GpqEc");
        lIlllIIIII[lIlllIIIlI[77]] = lIIllIlllIIIl("LQcMDDsCHQo=", "ltkmI");
        lIlllIIIII[lIlllIIIlI[78]] = lIIllIlllIIIl("EiwxAxU=", "EMEfg");
        lIlllIIIII[lIlllIIIlI[79]] = lIIllIlllIIIl("OCUCOQkIOU01CwI1", "kQmTh");
        lIlllIIIII[lIlllIIIlI[80]] = lIIllIlllIIll("39kCPSc5kDXSsXH3WldsvA==", "FLeBN");
        lIlllIIIII[lIlllIIIlI[11]] = lIIllIlllIIlI("Fc1fOeN5Wn8=", "DeUSJ");
        lIlllIIIII[lIlllIIIlI[81]] = lIIllIlllIIlI("BHv596PwAEgCe0brdH3Sbw==", "EOVhP");
        lIlllIIIII[lIlllIIIlI[82]] = lIIllIlllIIll("2UZnXP0S1YrVOX4r3J78Og==", "XAiIS");
        lIlllIIIII[lIlllIIIlI[83]] = lIIllIlllIIll("wS4PdA1xdf4GM5WDbPJU2Q==", "DhKDA");
        lIlllIIIII[lIlllIIIlI[84]] = lIIllIlllIIlI("jgMHxoa6jWtLsDr0BUdHGonErf+/PWop", "yWPrB");
        lIlllIIIII[lIlllIIIlI[85]] = lIIllIlllIIIl("ISUDAAk=", "qDphh");
        lIlllIIIII[lIlllIIIlI[86]] = lIIllIlllIIll("sYu9GPzIAV9Y3aLQ2a0mbw==", "KHAOY");
        lIlllIIIII[lIlllIIIlI[87]] = lIIllIlllIIlI("a+VreGhv3WE=", "XkCUC");
        lIlllIIIII[lIlllIIIlI[88]] = lIIllIlllIIlI("9/I8fuxdHJYDJ3KT+xovzw==", "WhIhG");
        lIlllIIIII[lIlllIIIlI[89]] = lIIllIlllIIIl("ATYQMiIgNAI=", "RUqPC");
        lIlllIIIII[lIlllIIIlI[0]] = lIIllIlllIIlI("UTRZj8uXmcm4sIipinspag==", "tbxRd");
        lIlllIIIII[lIlllIIIlI[90]] = lIIllIlllIIIl("DiZxNCQkPTwzMmchPTMkNys=", "GRQVA");
        lIlllIIIII[lIlllIIIlI[91]] = lIIllIlllIIIl("DjoePQ==", "MUrYo");
        lIlllIIIII[lIlllIIIlI[92]] = lIIllIlllIIlI("/cZMgpFwdtOFaQ2hOvayw6ZF06YnAFYR", "hRNJA");
        lIlllIIIII[lIlllIIIlI[93]] = lIIllIlllIIlI("pLTmEq2OeFCd/m8dl7HTqg==", "mMMXU");
        lIlllIIIII[lIlllIIIlI[94]] = lIIllIlllIIll("jw7XVWEjKCQ=", "bWiAe");
        lIlllIIIII[lIlllIIIlI[95]] = lIIllIlllIIlI("BIeq2E+HVGQ=", "DqnJQ");
        lIlllIIIII[lIlllIIIlI[96]] = lIIllIlllIIlI("bkzrnZqyCw7o/U35Dfge0g==", "KpUwz");
        lIlllIIIII[lIlllIIIlI[97]] = lIIllIlllIIll("NWKiwmdEav4xfJGLDFb7Lw==", "ADlxe");
        lIlllIIIII[lIlllIIIlI[98]] = lIIllIlllIIIl("PzguMRY=", "lQIYb");
        lIlllIIIII[lIlllIIIlI[99]] = lIIllIlllIIIl("MSMVIQIFZhgnG0I/Hz1MESsVJAA=", "bFpHl");
        lIlllIIIII[lIlllIIIlI[100]] = lIIllIlllIIll("WS4En1Wttrl6NUC78g78Pg==", "xrEIo");
        lIlllIIIII[lIlllIIIlI[101]] = lIIllIlllIIlI("P1vQ8JFrDKw=", "lNcMA");
        lIlllIIIII[lIlllIIIlI[102]] = lIIllIlllIIlI("eN+AHJ2h934=", "xflgZ");
        lIlllIIIII[lIlllIIIlI[103]] = lIIllIlllIIll("nonKAPtzQYyRd7+CP6qGcQ==", "FtoFy");
        lIlllIIIII[lIlllIIIlI[104]] = lIIllIlllIIlI("I+qpA+ihKz2EshBUwpO+oQ==", "FNbHy");
        lIlllIIIII[lIlllIIIlI[105]] = lIIllIlllIIIl("BQgFJh0lFw4=", "JekOk");
        lIlllIIIII[lIlllIIIlI[106]] = lIIllIlllIIlI("TC0NWWhrVSgu0GniUIve4gL5mb7sF/bn", "nDIAl");
        lIlllIIIII[lIlllIIIlI[107]] = lIIllIlllIIIl("E1I4GBM9ByY=", "RrTyq");
        lIlllIIIII[lIlllIIIlI[108]] = lIIllIlllIIlI("kKz26bAtYpOxP5SgzlyG7A==", "bqrqq");
        lIlllIIIII[lIlllIIIlI[109]] = lIIllIlllIIlI("V2XxD/m9yks=", "ctlBI");
        lIlllIIIII[lIlllIIIlI[110]] = lIIllIlllIIll("pss8dQU/bVU=", "nMDLo");
        lIlllIIIII[lIlllIIIlI[111]] = lIIllIlllIIlI("xEvCaFAZAa3wRZgGdNiS3g==", "aQMxK");
        lIlllIIIII[lIlllIIIlI[112]] = lIIllIlllIIll("WqK2Iv6/joh8R5JfPn15L7AifXTvTpZb", "rPMyr");
        lIlllIIIII[lIlllIIIlI[113]] = lIIllIlllIIIl("OA44CkEDBy8CDQ==", "poJna");
        lIlllIIIII[lIlllIIIlI[114]] = lIIllIlllIIll("I7LNQl+LklGTRp9YQmIQdw==", "pOUjJ");
        lIlllIIIII[lIlllIIIlI[115]] = lIIllIlllIIll("tGNhMNNpFnuAdelBUo/aBw==", "Fgesj");
        lIlllIIIII[lIlllIIIlI[116]] = lIIllIlllIIIl("MAseGjQSBwQHKBREEQAiUxcEHCMHBxgHKBQ=", "sdpnF");
        lIlllIIIII[lIlllIIIlI[117]] = lIIllIlllIIIl("Bw0NHgMw", "Uxcww");
        lIlllIIIII[lIlllIIIlI[118]] = lIIllIlllIIIl("GgYi", "NqMyW");
        lIlllIIIII[lIlllIIIlI[119]] = lIIllIlllIIlI("DjsenfjpxDvFxXtVi7jTjA==", "Bmbhs");
        lIlllIIIII[lIlllIIIlI[120]] = lIIllIlllIIll("0F8gDp1tdpg=", "nKmzG");
        lIlllIIIII[lIlllIIIlI[121]] = lIIllIlllIIIl("MSgGBAsHKQ==", "bMgsn");
        lIlllIIIII[lIlllIIIlI[122]] = lIIllIlllIIll("fOGwKS4Ue5uQkq4/j59avQ==", "SoALu");
        lIlllIIIII[lIlllIIIlI[123]] = lIIllIlllIIIl("IBEcBQ==", "mxpnN");
        lIlllIIIII[lIlllIIIlI[124]] = lIIllIlllIIll("m8eica1X0ucOXfyAvuknsg==", "oqaQF");
        lIlllIIIII[lIlllIIIlI[125]] = lIIllIlllIIll("83RSPaUx6z8=", "JNERZ");
        lIlllIIIII[lIlllIIIlI[126]] = lIIllIlllIIIl("M3IHKSsXIEsnNFI0Cjw=", "rRkHR");
        lIlllIIIII[lIlllIIIlI[127]] = lIIllIlllIIIl("Iwk/GiVUBCQQazMRPhEuGhU+", "tpLuK");
        lIlllIIIII[lIlllIIIlI[128]] = lIIllIlllIIll("A/6O0SnSO1U=", "SebLv");
        lIlllIIIII[lIlllIIIlI[129]] = lIIllIlllIIIl("ICYHBgcAJg8=", "lGjck");
        lIlllIIIII[lIlllIIIlI[130]] = lIIllIlllIIll("Iu8SbzWZV+b9lHrxLNL4Jw==", "gynOL");
        lIlllIIIII[lIlllIIIlI[131]] = lIIllIlllIIll("p7h1FkGx+11oc2jaj5LVpQ==", "wBwlI");
        lIlllIIIII[lIlllIIIlI[132]] = lIIllIlllIIll("bvne9jx7f0gNzs7ZAAUb9w==", "JVPiy");
        lIlllIIIII[lIlllIIIlI[133]] = lIIllIlllIIll("goaK2ha7JrOYqXFdIzfmww==", "VrQcn");
        lIlllIIIII[lIlllIIIlI[134]] = lIIllIlllIIlI("NipESCornb8Sxqdpx2EiVUkyETo5ZwNJ/zM2WD2yAtc=", "GxauI");
        lIlllIIIII[lIlllIIIlI[135]] = lIIllIlllIIIl("JDAHERcEOEo6BA4x", "eTjxe");
        lIlllIIIII[lIlllIIIlI[136]] = lIIllIlllIIll("cJTthVMb5wQ=", "aXZXG");
        lIlllIIIII[lIlllIIIlI[137]] = lIIllIlllIIlI("DzluqJYutKnzV7tORmQp1g==", "OZoNG");
        lIlllIIIII[lIlllIIIlI[138]] = lIIllIlllIIlI("GKpcizViKoQ=", "VoNUI");
        lIlllIIIII[lIlllIIIlI[68]] = lIIllIlllIIIl("KQYsHQENDA==", "hhBrx");
        lIlllIIIII[lIlllIIIlI[139]] = lIIllIlllIIll("V96FbqCiJoE=", "JhJZS");
        lIlllIIIII[lIlllIIIlI[140]] = lIIllIlllIIIl("JCsGPw==", "lJoMD");
        lIlllIIIII[lIlllIIIlI[141]] = lIIllIlllIIlI("/jH+RWEaufE=", "OTqQT");
        lIlllIIIII[lIlllIIIlI[142]] = lIIllIlllIIll("/+8y7iK0hdEnnUFM2aQkMg==", "rQSiv");
        lIlllIIIII[lIlllIIIlI[143]] = lIIllIlllIIIl("NxsheSwZAzE1K1gELC0rCw==", "xwEYN");
        lIlllIIIII[lIlllIIIlI[144]] = lIIllIlllIIll("i4tW7Su+40eL1rPoQCPe0w==", "oAnOk");
        lIlllIIIII[lIlllIIIlI[145]] = lIIllIlllIIIl("IDYbLC0DYws3JgEnACsk", "dCiEC");
        lIlllIIIII[lIlllIIIlI[146]] = lIIllIlllIIlI("KfswNUaQZ14=", "DHfrK");
        lIlllIIIII[lIlllIIIlI[147]] = lIIllIlllIIlI("LyoMTwRSBQ8mKUQMVtIo8Q==", "DweGJ");
        lIlllIIIII[lIlllIIIlI[148]] = lIIllIlllIIll("tvNH4eEWEZ8pclWbZythQg==", "KZsJp");
        lIlllIIIII[lIlllIIIlI[149]] = lIIllIlllIIlI("9jlc9WcuNFtkL97zwmO7uA==", "ktdoA");
        lIlllIIIII[lIlllIIIlI[150]] = lIIllIlllIIIl("CzFXMjo3JxszJmIsGXYmKz8S", "BEwVU");
        lIlllIIIII[lIlllIIIlI[165]] = lIIllIlllIIll("TX90F18/mefoXeFbU476pw==", "rlRRc");
    }

    private static String lIIllIlllIIll(String lllllllllllllllllllIIIIIIlIIlIlI, String lllllllllllllllllllIIIIIIlIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIIIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIIIIlIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIIIIlIIllII.init(lIlllIIIlI[6], lllllllllllllllllllIIIIIIlIIllIl);
            return new String(lllllllllllllllllllIIIIIIlIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIIIIlIIlIll) {
            lllllllllllllllllllIIIIIIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static void lIIllIllllIII() {
        lIlllIIIlI = new int[171];
        lIlllIIIlI[0] = 116 ^ 70;
        lIlllIIIlI[1] = ((((82 + 68) - 103) + 119) ^ (((64 + 85) - 143) + 193)) & (((94 ^ 102) ^ (108 ^ 53)) ^ (-" ".length()));
        lIlllIIIlI[2] = " ".length();
        lIlllIIIlI[3] = (-((-2998) & 23487)) & (-10241) & 31743;
        lIlllIIIlI[4] = (-((-6662) & 31261)) & (-1121) & 30719;
        lIlllIIIlI[5] = (57 ^ 75) ^ (126 ^ 8);
        lIlllIIIlI[6] = "  ".length();
        lIlllIIIlI[7] = (-16521) & 24527;
        lIlllIIIlI[8] = (-((-8401) & 27903)) & (-1) & 32127;
        lIlllIIIlI[9] = (202 ^ 171) ^ (73 ^ 34);
        lIlllIIIlI[10] = 2 ^ 7;
        lIlllIIIlI[11] = 52 ^ 28;
        lIlllIIIlI[12] = "   ".length();
        lIlllIIIlI[13] = 60 ^ 52;
        lIlllIIIlI[14] = (-((-210) & 26843)) & (-1029) & 28671;
        lIlllIIIlI[15] = (-((-18953) & 31355)) & (-1921) & 16370;
        lIlllIIIlI[16] = 99 ^ 101;
        lIlllIIIlI[17] = 179 ^ 186;
        lIlllIIIlI[18] = (-((-747) & 3839)) & (-193) & 27901;
        lIlllIIIlI[19] = (-14345) & 14877;
        lIlllIIIlI[20] = (-((-651) & 12991)) & (-16841) & 31230;
        lIlllIIIlI[21] = 167 ^ 160;
        lIlllIIIlI[22] = (-5905) & 30522;
        lIlllIIIlI[23] = (-((-10775) & 32511)) & (-513) & 24300;
        lIlllIIIlI[24] = (-1025) & 25639;
        lIlllIIIlI[25] = (-((-9390) & 26367)) & (-4225) & 23255;
        lIlllIIIlI[26] = (-((-34) & 4343)) & (-2817) & 31741;
        lIlllIIIlI[27] = (-((-6795) & 16095)) & (-20740) & 32095;
        lIlllIIIlI[28] = (-385) & 24998;
        lIlllIIIlI[29] = (-((-3349) & 7669)) & (-785) & 7162;
        lIlllIIIlI[30] = (22 ^ 109) ^ (231 ^ 151);
        lIlllIIIlI[31] = (-1163) & 25775;
        lIlllIIIlI[32] = (-29236) & 31295;
        lIlllIIIlI[33] = (182 ^ 195) ^ (121 ^ 0);
        lIlllIIIlI[34] = (-((-363) & 7163)) & (-14) & 31421;
        lIlllIIIlI[35] = (-22129) & 24190;
        lIlllIIIlI[36] = (((176 + 180) - 321) + 169) ^ (((42 + 130) - 69) + 90);
        lIlllIIIlI[37] = (-8161) & 32767;
        lIlllIIIlI[38] = (-((-16625) & 30719)) & (-194) & 16351;
        lIlllIIIlI[39] = 98 ^ 108;
        lIlllIIIlI[40] = (-6690) & 31295;
        lIlllIIIlI[41] = (-9069) & 11134;
        lIlllIIIlI[42] = 20 ^ 27;
        lIlllIIIlI[43] = (-((-16461) & 23405)) & (-1217) & 32765;
        lIlllIIIlI[44] = (-((-8217) & 30524)) & (-193) & 24567;
        lIlllIIIlI[45] = 113 ^ 97;
        lIlllIIIlI[46] = (-4629) & 29238;
        lIlllIIIlI[47] = (-30178) & 32247;
        lIlllIIIlI[48] = 74 ^ 91;
        lIlllIIIlI[49] = (-3795) & 28403;
        lIlllIIIlI[50] = (-((-307) & 30710)) & (-261) & 32735;
        lIlllIIIlI[51] = 32 ^ 50;
        lIlllIIIlI[52] = (-2761) & 27371;
        lIlllIIIlI[53] = (-((-8193) & 30150)) & (-33) & 24063;
        lIlllIIIlI[54] = 12 ^ 31;
        lIlllIIIlI[55] = (-((-4645) & 7167)) & (-5122) & 32255;
        lIlllIIIlI[56] = (-5473) & 7548;
        lIlllIIIlI[57] = 98 ^ 118;
        lIlllIIIlI[58] = 24 ^ 13;
        lIlllIIIlI[59] = (12 ^ 98) ^ (195 ^ 187);
        lIlllIIIlI[60] = 75 ^ 92;
        lIlllIIIlI[61] = 120 ^ 100;
        lIlllIIIlI[62] = 22 ^ 14;
        lIlllIIIlI[63] = 62 ^ 39;
        lIlllIIIlI[64] = (((133 + 86) - 121) + 57) ^ (((65 + 35) - 67) + 96);
        lIlllIIIlI[65] = (-((-653) & 21422)) & (-19) & 32767;
        lIlllIIIlI[66] = (-((-16570) & 24317)) & (-5) & 32751;
        lIlllIIIlI[67] = (-27761) & 28660;
        lIlllIIIlI[68] = (87 ^ 67) ^ (216 ^ 168);
        lIlllIIIlI[69] = 133 ^ 158;
        lIlllIIIlI[70] = (244 ^ 131) ^ (216 ^ 178);
        lIlllIIIlI[71] = 181 ^ 171;
        lIlllIIIlI[72] = (((121 + 201) - 278) + 177) ^ (((92 + 178) - 259) + 183);
        lIlllIIIlI[73] = 115 ^ 83;
        lIlllIIIlI[74] = 133 ^ 164;
        lIlllIIIlI[75] = 42 ^ 8;
        lIlllIIIlI[76] = 91 ^ 120;
        lIlllIIIlI[77] = 73 ^ 109;
        lIlllIIIlI[78] = (110 ^ 98) ^ (55 ^ 30);
        lIlllIIIlI[79] = 87 ^ 113;
        lIlllIIIlI[80] = (185 ^ 182) ^ (137 ^ 161);
        lIlllIIIlI[81] = 90 ^ 115;
        lIlllIIIlI[82] = 155 ^ 177;
        lIlllIIIlI[83] = 134 ^ 173;
        lIlllIIIlI[84] = 73 ^ 101;
        lIlllIIIlI[85] = 4 ^ 41;
        lIlllIIIlI[86] = (((70 + 71) - (-37)) + 58) ^ (((82 + 100) - 167) + 179);
        lIlllIIIlI[87] = (((110 + 68) - 145) + 122) ^ (((151 + 110) - 256) + 175);
        lIlllIIIlI[88] = 166 ^ 150;
        lIlllIIIlI[89] = (((37 + 6) - (-118)) + 21) ^ (((56 + 134) - 118) + 63);
        lIlllIIIlI[90] = 93 ^ 110;
        lIlllIIIlI[91] = 118 ^ 66;
        lIlllIIIlI[92] = 105 ^ 92;
        lIlllIIIlI[93] = (201 ^ 188) ^ (234 ^ 169);
        lIlllIIIlI[94] = 33 ^ 22;
        lIlllIIIlI[95] = (((159 + 49) - 161) + 125) ^ (((95 + 30) - 121) + 144);
        lIlllIIIlI[96] = (68 ^ 33) ^ (32 ^ 124);
        lIlllIIIlI[97] = (84 ^ 96) ^ (5 ^ 11);
        lIlllIIIlI[98] = (((151 + 99) - 162) + 80) ^ (((5 + 62) - 53) + 133);
        lIlllIIIlI[99] = 72 ^ 116;
        lIlllIIIlI[100] = (9 ^ 114) ^ (11 ^ 77);
        lIlllIIIlI[101] = (195 ^ 172) ^ (123 ^ 42);
        lIlllIIIlI[102] = (8 ^ 23) ^ (38 ^ 6);
        lIlllIIIlI[103] = 206 ^ 142;
        lIlllIIIlI[104] = 13 ^ 76;
        lIlllIIIlI[105] = (230 ^ 154) ^ (62 ^ 0);
        lIlllIIIlI[106] = 110 ^ 45;
        lIlllIIIlI[107] = (116 ^ 2) ^ (84 ^ 102);
        lIlllIIIlI[108] = (171 ^ 130) ^ (219 ^ 183);
        lIlllIIIlI[109] = 83 ^ 21;
        lIlllIIIlI[110] = 127 ^ 56;
        lIlllIIIlI[111] = (120 ^ 15) ^ (51 ^ 12);
        lIlllIIIlI[112] = (22 ^ 61) ^ (98 ^ 0);
        lIlllIIIlI[113] = (45 ^ 116) ^ (211 ^ 192);
        lIlllIIIlI[114] = 60 ^ 119;
        lIlllIIIlI[115] = (((251 + 243) - 336) + 95) ^ (((166 + 44) - 182) + 149);
        lIlllIIIlI[116] = 63 ^ 114;
        lIlllIIIlI[117] = 141 ^ 195;
        lIlllIIIlI[118] = (((198 + 192) - 332) + 183) ^ (((187 + 59) - 132) + 76);
        lIlllIIIlI[119] = 9 ^ 89;
        lIlllIIIlI[120] = 112 ^ 33;
        lIlllIIIlI[121] = 41 ^ 123;
        lIlllIIIlI[122] = (42 ^ 77) ^ (50 ^ 6);
        lIlllIIIlI[123] = 214 ^ 130;
        lIlllIIIlI[124] = (111 ^ 2) ^ (79 ^ 119);
        lIlllIIIlI[125] = (74 ^ 85) ^ (238 ^ 167);
        lIlllIIIlI[126] = 82 ^ 5;
        lIlllIIIlI[127] = 222 ^ 134;
        lIlllIIIlI[128] = (((158 + 35) - 123) + 148) ^ (((69 + 6) - 5) + 61);
        lIlllIIIlI[129] = 244 ^ 174;
        lIlllIIIlI[130] = 18 ^ 73;
        lIlllIIIlI[131] = (107 ^ 74) ^ (246 ^ 139);
        lIlllIIIlI[132] = (196 ^ 173) ^ (60 ^ 8);
        lIlllIIIlI[133] = 246 ^ 168;
        lIlllIIIlI[134] = 106 ^ 53;
        lIlllIIIlI[135] = 195 ^ 163;
        lIlllIIIlI[136] = 254 ^ 159;
        lIlllIIIlI[137] = (178 ^ 168) ^ (66 ^ 58);
        lIlllIIIlI[138] = (194 ^ 186) ^ (67 ^ 88);
        lIlllIIIlI[139] = 27 ^ 126;
        lIlllIIIlI[140] = (19 ^ 51) ^ (99 ^ 37);
        lIlllIIIlI[141] = 207 ^ 168;
        lIlllIIIlI[142] = 19 ^ 123;
        lIlllIIIlI[143] = (((1 + 14) - (-184)) + 5) ^ (((4 + 85) - (-22)) + 54);
        lIlllIIIlI[144] = (30 ^ 106) ^ (143 ^ 145);
        lIlllIIIlI[145] = (90 ^ 7) ^ (191 ^ 137);
        lIlllIIIlI[146] = (41 ^ 6) ^ (123 ^ 56);
        lIlllIIIlI[147] = 90 ^ 55;
        lIlllIIIlI[148] = (41 ^ 85) ^ (69 ^ 87);
        lIlllIIIlI[149] = 51 ^ 92;
        lIlllIIIlI[150] = 194 ^ 178;
        lIlllIIIlI[151] = (-((-6858) & 31695)) & (-1) & 28095;
        lIlllIIIlI[152] = (-12804) & 16255;
        lIlllIIIlI[153] = (-((-9413) & 28133)) & (-2) & 20479;
        lIlllIIIlI[154] = (-((-13599) & 32159)) & (-8193) & 31707;
        lIlllIIIlI[155] = (-((-22231) & 30455)) & (-6403) & 16383;
        lIlllIIIlI[156] = (-10417) & 15355;
        lIlllIIIlI[157] = (-8207) & 9983;
        lIlllIIIlI[158] = (-((-17245) & 28509)) & (-129) & 16351;
        lIlllIIIlI[159] = (-((-7846) & 32695)) & (-4097) & 30717;
        lIlllIIIlI[160] = (-19597) & 24573;
        lIlllIIIlI[161] = (-22534) & 24279;
        lIlllIIIlI[162] = (-9357) & 14332;
        lIlllIIIlI[163] = (-((-21903) & 32191)) & (-16386) & 28415;
        lIlllIIIlI[164] = (-2052) & 7011;
        lIlllIIIlI[165] = 197 ^ 180;
        lIlllIIIlI[166] = (-((-1538) & 8051)) & (-25089) & 32767;
        lIlllIIIlI[167] = (-((-23868) & 24575)) & (-8193) & 12283;
        lIlllIIIlI[168] = (-((-17357) & 28653)) & (-16389) & 28471;
        lIlllIIIlI[169] = (-((-183) & 3575)) & (-8193) & 12279;
        lIlllIIIlI[170] = (((141 + 63) - 52) + 76) ^ (((34 + 63) - (-13)) + 40);
    }

    private static void O() {
        int[] iArr = new int[lIlllIIIlI[2]];
        iArr[lIlllIIIlI[1]] = lIlllIIIlI[8];
        if (lIIllIllllIll(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIIlI[8], lIlllIIIlI[10], C0009j.bZ));
            "".length();
        }
        if (lIIllIllllIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlllIIIII[lIlllIIIlI[61]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIIlI[65], lIlllIIIlI[10], lIlllIIIlI[66]));
            "".length();
        }
        int[] iArr2 = new int[lIlllIIIlI[2]];
        iArr2[lIlllIIIlI[1]] = lIlllIIIlI[7];
        if (lIIllIllllIll(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIIlI[7], lIlllIIIlI[11], lIlllIIIlI[67]));
            "".length();
        }
    }
}
