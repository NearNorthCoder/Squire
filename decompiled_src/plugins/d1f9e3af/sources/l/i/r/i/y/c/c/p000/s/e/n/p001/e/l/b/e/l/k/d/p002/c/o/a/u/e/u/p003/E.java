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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.E  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/E.class */
public class E implements W {
    public static final /* synthetic */ String eT;
    public static final /* synthetic */ String ft;
    public static final /* synthetic */ String fD;
    public static final /* synthetic */ String eD;
    public static final /* synthetic */ String fs;
    public static final /* synthetic */ String eQ;
    public static final /* synthetic */ int ei;
    public static final /* synthetic */ String fQ;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ String eR;
    public static final /* synthetic */ String eB;
    public static final /* synthetic */ String eU;
    public static final /* synthetic */ String eC;
    public static final /* synthetic */ int ek;
    public static final /* synthetic */ String eM;
    public static final /* synthetic */ String fL;
    public static final /* synthetic */ String fK;
    public static final /* synthetic */ WorldPoint er;
    public static final /* synthetic */ int dY;
    public static final /* synthetic */ String eP;
    public static final /* synthetic */ String fI;
    public static final /* synthetic */ String fY;
    public static final /* synthetic */ int eg;
    public static final /* synthetic */ String fC;
    public static final /* synthetic */ String ex;
    public static final /* synthetic */ String fj;
    public static final /* synthetic */ String fR;
    public static final /* synthetic */ WorldPoint eq;
    public static final /* synthetic */ String ev;
    public static final /* synthetic */ String fg;
    public static final /* synthetic */ String fG;
    public static final /* synthetic */ String eF;
    public static final /* synthetic */ String fe;
    public static final /* synthetic */ String fl;
    public static final /* synthetic */ String fM;
    public static final /* synthetic */ String fA;
    public static final /* synthetic */ String eK;
    public static final /* synthetic */ int ef;
    public static final /* synthetic */ String eS;
    static /* synthetic */ boolean cm;
    public static final /* synthetic */ int em;
    public static final /* synthetic */ String fx;
    public static final /* synthetic */ String fr;
    public static final /* synthetic */ String ey;
    public static final /* synthetic */ String fm;
    public static final /* synthetic */ int ea;
    static /* synthetic */ int cl;
    public static final /* synthetic */ String fb;
    public static final /* synthetic */ String eL;
    public static final /* synthetic */ String fc;
    public static final /* synthetic */ String fH;
    public static final /* synthetic */ WorldPoint eo;
    public static final /* synthetic */ String fp;
    public static final /* synthetic */ int el;
    public static final /* synthetic */ String fN;
    public static /* synthetic */ WorldArea bS;
    public static final /* synthetic */ String ez;
    public static final /* synthetic */ int ee;
    public static final /* synthetic */ String fB;
    public static final /* synthetic */ String fk;
    public static final /* synthetic */ String fP;
    private static /* synthetic */ String[] lIIlIllIl;
    public static final /* synthetic */ String fE;
    public static final /* synthetic */ String fn;
    public static final /* synthetic */ WorldPoint ep;
    public static final /* synthetic */ String eO;
    private static /* synthetic */ int[] lIIlIlllI;
    public static /* synthetic */ String[] gb;
    public static final /* synthetic */ String eJ;
    public static final /* synthetic */ String fq;
    public static final /* synthetic */ String fJ;
    public static final /* synthetic */ String fU;
    public static final /* synthetic */ String fv;
    public static final /* synthetic */ String ff;
    public static final /* synthetic */ WorldPoint et;
    public static final /* synthetic */ String fZ;
    public static final /* synthetic */ String eY;
    public static final /* synthetic */ String fW;
    public static final /* synthetic */ String fO;
    public static final /* synthetic */ String ew;
    public static final /* synthetic */ int en;
    public static final /* synthetic */ int eb;
    public static final /* synthetic */ String fT;
    public static final /* synthetic */ String fh;
    public static final /* synthetic */ String fy;
    public static final /* synthetic */ WorldPoint eu;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ String fz;
    public static final /* synthetic */ String ga;
    public static final /* synthetic */ String fi;
    public static final /* synthetic */ int eh;
    public static final /* synthetic */ String fw;
    public static final /* synthetic */ String fX;
    public static final /* synthetic */ String fo;
    public static final /* synthetic */ String eX;
    public static final /* synthetic */ int dX;
    public static final /* synthetic */ String eE;
    public static final /* synthetic */ String fu;
    public static final /* synthetic */ String eI;
    public static final /* synthetic */ int dZ;
    public static final /* synthetic */ int ec;
    public static final /* synthetic */ String eA;
    public static final /* synthetic */ WorldPoint es;
    public static final /* synthetic */ String eN;
    public static final /* synthetic */ int ej;
    public static final /* synthetic */ String fS;
    public static final /* synthetic */ String eZ;
    public static final /* synthetic */ String fd;
    public static final /* synthetic */ String fa;
    public static final /* synthetic */ String eG;
    public static final /* synthetic */ String fV;
    public static final /* synthetic */ String fF;
    public static final /* synthetic */ String eW;
    public static final /* synthetic */ int ed;
    public static final /* synthetic */ String eH;
    public static final /* synthetic */ String eV;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (llllllIIlIl(C0004e.j(lIIlIlllI[14]), lIIlIlllI[56]) && llllllIIlIl(Skills.getLevel(Skill.HUNTER), lIIlIlllI[17])) {
            ?? r0 = lIIlIlllI[2];
            "".length();
            return " ".length() < 0 ? ((245 ^ 158) ^ (136 ^ 160)) & (((((17 + 80) - (-10)) + 108) ^ (((13 + 145) - 66) + 56)) ^ (-" ".length())) : r0;
        }
        return lIIlIlllI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIlIlllI[1];
    }

    private static boolean llllllIIIIl(int i, int i2) {
        return i > i2;
    }

    static {
        lllllIllIll();
        lllllIllIlI();
        eO = lIIlIllIl[lIIlIlllI[70]];
        fv = lIIlIllIl[lIIlIlllI[71]];
        fD = lIIlIllIl[lIIlIlllI[72]];
        ee = lIIlIlllI[28];
        en = lIIlIlllI[55];
        fa = lIIlIllIl[lIIlIlllI[73]];
        fj = lIIlIllIl[lIIlIlllI[74]];
        fT = lIIlIllIl[lIIlIlllI[75]];
        el = lIIlIlllI[49];
        eY = lIIlIllIl[lIIlIlllI[76]];
        ex = lIIlIllIl[lIIlIlllI[77]];
        eB = lIIlIllIl[lIIlIlllI[78]];
        eW = lIIlIllIl[lIIlIlllI[79]];
        fd = lIIlIllIl[lIIlIlllI[80]];
        fm = lIIlIllIl[lIIlIlllI[11]];
        eh = lIIlIlllI[37];
        fB = lIIlIllIl[lIIlIlllI[81]];
        eH = lIIlIllIl[lIIlIlllI[82]];
        fI = lIIlIllIl[lIIlIlllI[83]];
        eF = lIIlIllIl[lIIlIlllI[84]];
        ez = lIIlIllIl[lIIlIlllI[85]];
        ft = lIIlIllIl[lIIlIlllI[86]];
        fJ = lIIlIllIl[lIIlIlllI[87]];
        eN = lIIlIllIl[lIIlIlllI[88]];
        fl = lIIlIllIl[lIIlIlllI[89]];
        fw = lIIlIllIl[lIIlIlllI[0]];
        ek = lIIlIlllI[46];
        fr = lIIlIllIl[lIIlIlllI[90]];
        fz = lIIlIllIl[lIIlIlllI[91]];
        ga = lIIlIllIl[lIIlIlllI[92]];
        fb = lIIlIllIl[lIIlIlllI[93]];
        eE = lIIlIllIl[lIIlIlllI[94]];
        fg = lIIlIllIl[lIIlIlllI[95]];
        dY = lIIlIlllI[6];
        ey = lIIlIllIl[lIIlIlllI[96]];
        fG = lIIlIllIl[lIIlIlllI[97]];
        em = lIIlIlllI[52];
        fZ = lIIlIllIl[lIIlIlllI[98]];
        fS = lIIlIllIl[lIIlIlllI[99]];
        fk = lIIlIllIl[lIIlIlllI[100]];
        fe = lIIlIllIl[lIIlIlllI[101]];
        fL = lIIlIllIl[lIIlIlllI[102]];
        fq = lIIlIllIl[lIIlIlllI[103]];
        fO = lIIlIllIl[lIIlIlllI[104]];
        eL = lIIlIllIl[lIIlIlllI[105]];
        ff = lIIlIllIl[lIIlIlllI[106]];
        ed = lIIlIlllI[26];
        fX = lIIlIllIl[lIIlIlllI[107]];
        fA = lIIlIllIl[lIIlIlllI[108]];
        fo = lIIlIllIl[lIIlIlllI[109]];
        fs = lIIlIllIl[lIIlIlllI[110]];
        fW = lIIlIllIl[lIIlIlllI[111]];
        eS = lIIlIllIl[lIIlIlllI[112]];
        eT = lIIlIllIl[lIIlIlllI[113]];
        fn = lIIlIllIl[lIIlIlllI[114]];
        eX = lIIlIllIl[lIIlIlllI[115]];
        fH = lIIlIllIl[lIIlIlllI[116]];
        eQ = lIIlIllIl[lIIlIlllI[117]];
        fU = lIIlIllIl[lIIlIlllI[118]];
        eD = lIIlIllIl[lIIlIlllI[119]];
        ev = lIIlIllIl[lIIlIlllI[120]];
        ew = lIIlIllIl[lIIlIlllI[121]];
        fR = lIIlIllIl[lIIlIlllI[122]];
        eZ = lIIlIllIl[lIIlIlllI[123]];
        fp = lIIlIllIl[lIIlIlllI[124]];
        eG = lIIlIllIl[lIIlIlllI[125]];
        fh = lIIlIllIl[lIIlIlllI[126]];
        eU = lIIlIllIl[lIIlIlllI[127]];
        fP = lIIlIllIl[lIIlIlllI[128]];
        eK = lIIlIllIl[lIIlIlllI[129]];
        dX = lIIlIlllI[3];
        fc = lIIlIllIl[lIIlIlllI[130]];
        eA = lIIlIllIl[lIIlIlllI[131]];
        fF = lIIlIllIl[lIIlIlllI[132]];
        eM = lIIlIllIl[lIIlIlllI[133]];
        eg = lIIlIlllI[34];
        eP = lIIlIllIl[lIIlIlllI[134]];
        eV = lIIlIllIl[lIIlIlllI[135]];
        fC = lIIlIllIl[lIIlIlllI[136]];
        ea = lIIlIlllI[18];
        eR = lIIlIllIl[lIIlIlllI[137]];
        fN = lIIlIllIl[lIIlIlllI[138]];
        fY = lIIlIllIl[lIIlIlllI[68]];
        ei = lIIlIlllI[40];
        ej = lIIlIlllI[43];
        eC = lIIlIllIl[lIIlIlllI[139]];
        fM = lIIlIllIl[lIIlIlllI[140]];
        fV = lIIlIllIl[lIIlIlllI[141]];
        eb = lIIlIlllI[22];
        ef = lIIlIlllI[31];
        fx = lIIlIllIl[lIIlIlllI[142]];
        fy = lIIlIllIl[lIIlIlllI[143]];
        fE = lIIlIllIl[lIIlIlllI[144]];
        fi = lIIlIllIl[lIIlIlllI[145]];
        eJ = lIIlIllIl[lIIlIlllI[146]];
        eI = lIIlIllIl[lIIlIlllI[147]];
        fQ = lIIlIllIl[lIIlIlllI[148]];
        ec = lIIlIlllI[24];
        dZ = lIIlIlllI[19];
        fu = lIIlIllIl[lIIlIlllI[149]];
        fK = lIIlIllIl[lIIlIlllI[150]];
        eo = new WorldPoint(lIIlIlllI[151], lIIlIlllI[152], lIIlIlllI[1]);
        ep = new WorldPoint(lIIlIlllI[153], lIIlIlllI[154], lIIlIlllI[1]);
        eq = new WorldPoint(lIIlIlllI[155], lIIlIlllI[156], lIIlIlllI[1]);
        er = new WorldPoint(lIIlIlllI[157], lIIlIlllI[158], lIIlIlllI[1]);
        es = new WorldPoint(lIIlIlllI[159], lIIlIlllI[160], lIIlIlllI[1]);
        et = new WorldPoint(lIIlIlllI[161], lIIlIlllI[162], lIIlIlllI[1]);
        eu = new WorldPoint(lIIlIlllI[163], lIIlIlllI[164], lIIlIlllI[1]);
        bv = new ArrayList();
        String[] strArr = new String[lIIlIlllI[2]];
        strArr[lIIlIlllI[1]] = lIIlIllIl[lIIlIlllI[165]];
        gb = strArr;
        bS = new WorldArea(lIIlIlllI[166], lIIlIlllI[167], lIIlIlllI[168], lIIlIlllI[169], lIIlIlllI[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v546, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v566, types: [boolean] */
    public static void bD() {
        if (lllllIlllII(Inventory.contains(C0005f.aV) ? 1 : 0) && lllllIlllIl(Movement.getRunEnergy(), lIIlIlllI[0])) {
            Inventory.getFirst(C0005f.aV).interact(lIIlIllIl[lIIlIlllI[1]]);
            Time.sleepTicks(lIIlIlllI[2]);
            "".length();
        }
        if (lllllIllllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (lllllIlllII(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lllllIlllIl(bv.size(), lIIlIlllI[2])) {
                System.out.println(lIIlIllIl[lIIlIlllI[2]]);
                bt = lIIlIlllI[1];
            }
        }
        if (lllllIllllI(bt ? 1 : 0)) {
            if (lllllIllllI(ab() ? 1 : 0) && lllllIlllIl(C0004e.j(lIIlIlllI[3]), lIIlIlllI[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllllIlllll(nearest) && lllllIllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0000a.a(nearest);
                }
                if (lllllIlllll(nearest) && lllllIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllllIllllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIlllI[4]);
                        "".length();
                    }
                    if (lllllIlllII(Bank.isOpen() ? 1 : 0)) {
                        if (llllllIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIlllI[5]);
                            "".length();
                        }
                        if (llllllIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIlllI[6]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIlllI[6]];
                        iArr[lIIlIlllI[1]] = lIIlIlllI[7];
                        iArr[lIIlIlllI[2]] = lIIlIlllI[8];
                        if (lllllIllllI(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIlIllIl[lIIlIlllI[6]]);
                            bt = lIIlIlllI[2];
                            return;
                        }
                        int[] iArr2 = new int[lIIlIlllI[6]];
                        iArr2[lIIlIlllI[1]] = lIIlIlllI[7];
                        iArr2[lIIlIlllI[2]] = lIIlIlllI[8];
                        if (lllllIlllII(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIlIlllI[7], lIIlIlllI[9]);
                            C0000a.b(C0005f.aV, lIIlIlllI[10]);
                        }
                    }
                }
            }
            if (lllllIlllII(ab() ? 1 : 0) && lllllIllllI(C0004e.j(lIIlIlllI[3]))) {
                if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(ep), lIIlIlllI[11])) {
                    if (lllllIlllII(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIlIlllI[2]];
                        iArr3[lIIlIlllI[1]] = lIIlIlllI[7];
                        if (lllllIlllII(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIlIlllI[2]];
                            iArr4[lIIlIlllI[1]] = lIIlIlllI[7];
                            Inventory.getFirst(iArr4).interact(lIIlIllIl[lIIlIlllI[12]]);
                            Time.sleepTicks(lIIlIlllI[13]);
                            "".length();
                        }
                    }
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[5]];
                    Movement.walkTo(ep);
                    "".length();
                    Time.sleepTicks(lIIlIlllI[2]);
                    "".length();
                }
                if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ep), lIIlIlllI[13])) {
                    C0006g.a(lIIlIllIl[lIIlIlllI[10]], gb);
                    Time.sleepTicks(lIIlIlllI[2]);
                    "".length();
                }
            }
            if (llllllIIIII(C0004e.j(lIIlIlllI[3]))) {
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[15])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[16]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eq), lIIlIlllI[17])) {
                        Movement.walkTo(eq);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eq), lIIlIlllI[17])) {
                        p(lIIlIlllI[18]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[20])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[21]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eq), lIIlIlllI[17])) {
                        Movement.walkTo(eq);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eq), lIIlIlllI[17])) {
                        p(lIIlIlllI[22]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[23])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[13]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        Movement.walkTo(er);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        p(lIIlIlllI[24]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[25])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[17]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        Movement.walkTo(er);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        p(lIIlIlllI[26]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[27])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[9]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        Movement.walkTo(er);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        p(lIIlIlllI[28]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[29])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[30]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        Movement.walkTo(er);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        p(lIIlIlllI[31]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[32])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[33]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(es), lIIlIlllI[17])) {
                        Movement.walkTo(es);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(es), lIIlIlllI[17])) {
                        p(lIIlIlllI[34]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[35])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[36]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(es), lIIlIlllI[17])) {
                        Movement.walkTo(es);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(es), lIIlIlllI[17])) {
                        p(lIIlIlllI[37]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[38])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[39]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(et), lIIlIlllI[17])) {
                        Movement.walkTo(et);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(et), lIIlIlllI[17])) {
                        p(lIIlIlllI[40]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[41])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[42]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(et), lIIlIlllI[17])) {
                        Movement.walkTo(et);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(et), lIIlIlllI[17])) {
                        p(lIIlIlllI[43]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[44])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[45]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        Movement.walkTo(eu);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        p(lIIlIlllI[46]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[47])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[48]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        Movement.walkTo(eu);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        p(lIIlIlllI[49]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[50])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[51]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        Movement.walkTo(eu);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        p(lIIlIlllI[52]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[53])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[54]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        Movement.walkTo(eu);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        p(lIIlIlllI[55]);
                        if (!lllllIlllII(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || lllllIlllll(Widgets.get(lIIlIlllI[19]))) {
                            bE();
                        }
                    }
                }
                if (llllllIIIll(C0004e.j(lIIlIlllI[14]), lIIlIlllI[56]) && lllllIlllIl(Skills.getLevel(Skill.HUNTER), lIIlIlllI[17])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[57]];
                    if (llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(ep), lIIlIlllI[13])) {
                        AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[58]];
                        Movement.walkTo(ep);
                        "".length();
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                    if (llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ep), lIIlIlllI[13])) {
                        AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[59]];
                        C0006g.a(lIIlIllIl[lIIlIlllI[60]], gb);
                        Time.sleepTicks(lIIlIlllI[2]);
                        "".length();
                    }
                }
            }
            System.out.println(C0004e.j(lIIlIlllI[14]));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    private static void bE() {
        Widget widget = Widgets.get(lIIlIlllI[19], lIIlIlllI[61]);
        if (llllllIIlII(widget)) {
            System.out.println(lIIlIllIl[lIIlIlllI[62]]);
            return;
        }
        if (lllllIlllll(widget)) {
            System.out.println(widget.getText());
        }
        int i = lIIlIlllI[1];
        while (lllllIlllIl(i, EnumC0007h.values().length)) {
            if (lllllIlllII(widget.getText().equalsIgnoreCase(EnumC0007h.values()[i].O()) ? 1 : 0)) {
                System.out.println("answer: " + EnumC0007h.values()[i].P());
                int lIIIIIllllIIIIl = i;
                Widget widget2 = Widgets.get(lIIlIlllI[19], widget3 -> {
                    return widget3.getText().strip().contains(EnumC0007h.values()[lIIIIIllllIIIIl].P());
                });
                if (lllllIlllll(widget2)) {
                    System.out.println(lIIlIllIl[lIIlIlllI[63]]);
                    Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) lIIlIlllI[2]);
                    Time.sleepTicks(lIIlIlllI[6]);
                    "".length();
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                    return;
                }
            }
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return;
            }
        }
    }

    private static void af() {
        int[] iArr = new int[lIIlIlllI[2]];
        iArr[lIIlIlllI[1]] = lIIlIlllI[8];
        if (lllllIllllI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlllI[8], lIIlIlllI[10], C0008i.bq));
            "".length();
        }
        if (lllllIllllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlIllIl[lIIlIlllI[61]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlllI[65], lIIlIlllI[10], lIIlIlllI[66]));
            "".length();
        }
        int[] iArr2 = new int[lIIlIlllI[2]];
        iArr2[lIIlIlllI[1]] = lIIlIlllI[7];
        if (lllllIllllI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlllI[7], lIIlIlllI[11], lIIlIlllI[67]));
            "".length();
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            bD();
            "".length();
            if (((39 ^ 22) ^ (28 ^ 41)) <= (((85 ^ 83) ^ (106 ^ 94)) & (((224 ^ 152) ^ (235 ^ 161)) ^ (-" ".length())))) {
                return ((94 ^ 55) ^ (26 ^ 72)) & (((245 ^ 162) ^ (193 ^ 173)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIlllI[68];
    }

    private static boolean lllllIlllII(int i) {
        return i != 0;
    }

    private static void lllllIllIll() {
        lIIlIlllI = new int[171];
        lIIlIlllI[0] = (193 ^ 169) ^ (75 ^ 17);
        lIIlIlllI[1] = ((((130 + 12) - 134) + 150) ^ (((103 + 65) - 101) + 73)) & (((158 ^ 166) ^ (160 ^ 138)) ^ (-" ".length()));
        lIIlIlllI[2] = " ".length();
        lIIlIlllI[3] = (-30729) & 31742;
        lIIlIlllI[4] = (-((-16781) & 19870)) & (-16449) & 24537;
        lIIlIlllI[5] = (((8 + 24) - (-15)) + 85) ^ (((5 + 24) - 27) + 126);
        lIIlIlllI[6] = "  ".length();
        lIIlIlllI[7] = (-((-3905) & 20337)) & (-1) & 24439;
        lIIlIlllI[8] = (-((-8373) & 28351)) & (-1) & 32603;
        lIIlIlllI[9] = 19 ^ 25;
        lIIlIlllI[10] = (((33 + 130) - 139) + 109) ^ (((22 + 26) - (-67)) + 13);
        lIIlIlllI[11] = (((15 + 154) - 87) + 97) ^ (((125 + 0) - 51) + 81);
        lIIlIlllI[12] = "   ".length();
        lIIlIlllI[13] = 140 ^ 132;
        lIIlIlllI[14] = (-(131 ^ 134)) & (-26633) & 27646;
        lIIlIlllI[15] = (-5019) & 7066;
        lIIlIlllI[16] = (8 ^ 42) ^ (119 ^ 83);
        lIIlIlllI[17] = 166 ^ 175;
        lIIlIlllI[18] = (-((-16441) & 23613)) & (-707) & 32495;
        lIIlIlllI[19] = (-27113) & 27645;
        lIIlIlllI[20] = (-((-10358) & 16383)) & (-8293) & 16367;
        lIIlIlllI[21] = " ".length() ^ (20 ^ 18);
        lIIlIlllI[22] = (-662) & 25279;
        lIIlIlllI[23] = (-17563) & 19614;
        lIIlIlllI[24] = (-1153) & 25767;
        lIIlIlllI[25] = (-((-18850) & 32243)) & (-16905) & 32351;
        lIIlIlllI[26] = (-6017) & 30632;
        lIIlIlllI[27] = (-5331) & 7386;
        lIIlIlllI[28] = (-((-20614) & 24031)) & (-641) & 28671;
        lIIlIlllI[29] = (-8785) & 10842;
        lIIlIlllI[30] = (((132 + 44) - 110) + 119) ^ (((156 + 108) - 116) + 30);
        lIIlIlllI[31] = (-4177) & 28789;
        lIIlIlllI[32] = (-26468) & 28527;
        lIIlIlllI[33] = 178 ^ 190;
        lIIlIlllI[34] = (-((-4139) & 7679)) & (-4612) & 32759;
        lIIlIlllI[35] = (-((-1226) & 22523)) & (-1089) & 24447;
        lIIlIlllI[36] = 4 ^ 9;
        lIIlIlllI[37] = (-((-4191) & 8159)) & (-4129) & 32703;
        lIIlIlllI[38] = (-((-4658) & 22453)) & (-12901) & 32759;
        lIIlIlllI[39] = 64 ^ 78;
        lIIlIlllI[40] = (-418) & 25023;
        lIIlIlllI[41] = (-25898) & 27963;
        lIIlIlllI[42] = 4 ^ 11;
        lIIlIlllI[43] = (-((-29781) & 32245)) & (-5123) & 32191;
        lIIlIlllI[44] = (-((-10757) & 28295)) & (-12841) & 32446;
        lIIlIlllI[45] = 179 ^ 163;
        lIIlIlllI[46] = (-2257) & 26866;
        lIIlIlllI[47] = (-((-581) & 21101)) & (-8194) & 30783;
        lIIlIlllI[48] = (((10 + 97) - 6) + 32) ^ (((146 + 27) - 78) + 53);
        lIIlIlllI[49] = (-((-8433) & 11519)) & (-385) & 28079;
        lIIlIlllI[50] = (-25347) & 27418;
        lIIlIlllI[51] = 34 ^ 48;
        lIIlIlllI[52] = (-2197) & 26807;
        lIIlIlllI[53] = (-17350) & 19423;
        lIIlIlllI[54] = 61 ^ 46;
        lIIlIlllI[55] = (-((-46) & 6383)) & (-1811) & 32759;
        lIIlIlllI[56] = (-((-13) & 16751)) & (-129) & 18942;
        lIIlIlllI[57] = 156 ^ 136;
        lIIlIlllI[58] = 211 ^ 198;
        lIIlIlllI[59] = (((57 + 145) - 124) + 108) ^ (((109 + 59) - 38) + 42);
        lIIlIlllI[60] = 104 ^ 127;
        lIIlIlllI[61] = 67 ^ 95;
        lIIlIlllI[62] = (((77 + 143) - 214) + 138) ^ (((102 + 123) - 104) + 15);
        lIIlIlllI[63] = 146 ^ 139;
        lIIlIlllI[64] = 128 ^ 154;
        lIIlIlllI[65] = (-((-3530) & 19917)) & (-4145) & 32511;
        lIIlIlllI[66] = (-3143) & 28142;
        lIIlIlllI[67] = (-((-8260) & 31871)) & (-65) & 24575;
        lIIlIlllI[68] = (14 ^ 102) ^ (100 ^ 104);
        lIIlIlllI[69] = 49 ^ 42;
        lIIlIlllI[70] = (((56 + 164) - 214) + 177) ^ (((145 + 125) - 170) + 70);
        lIIlIlllI[71] = 9 ^ 23;
        lIIlIlllI[72] = 145 ^ 142;
        lIIlIlllI[73] = 122 ^ 90;
        lIIlIlllI[74] = (((40 + 129) - (-9)) + 8) ^ (((125 + 5) - 35) + 60);
        lIIlIlllI[75] = (111 ^ 19) ^ (50 ^ 108);
        lIIlIlllI[76] = 70 ^ 101;
        lIIlIlllI[77] = 20 ^ 48;
        lIIlIlllI[78] = (((93 + 23) - 33) + 66) ^ (((34 + 14) - (-102)) + 26);
        lIIlIlllI[79] = 107 ^ 77;
        lIIlIlllI[80] = (177 ^ 184) ^ (72 ^ 102);
        lIIlIlllI[81] = 24 ^ 49;
        lIIlIlllI[82] = (127 ^ 6) ^ (51 ^ 96);
        lIIlIlllI[83] = 79 ^ 100;
        lIIlIlllI[84] = 118 ^ 90;
        lIIlIlllI[85] = (8 ^ 81) ^ (81 ^ 37);
        lIIlIlllI[86] = (223 ^ 171) ^ (73 ^ 19);
        lIIlIlllI[87] = (239 ^ 176) ^ (96 ^ 16);
        lIIlIlllI[88] = 247 ^ 199;
        lIIlIlllI[89] = 58 ^ 11;
        lIIlIlllI[90] = (76 ^ 2) ^ (10 ^ 119);
        lIIlIlllI[91] = 161 ^ 149;
        lIIlIlllI[92] = (139 ^ 186) ^ (157 ^ 153);
        lIIlIlllI[93] = 81 ^ 103;
        lIIlIlllI[94] = (((143 + 5) - 143) + 157) ^ (((11 + 50) - (-33)) + 55);
        lIIlIlllI[95] = (78 ^ 105) ^ (123 ^ 100);
        lIIlIlllI[96] = (92 ^ 34) ^ (221 ^ 154);
        lIIlIlllI[97] = (169 ^ 138) ^ (73 ^ 80);
        lIIlIlllI[98] = (105 ^ 27) ^ (196 ^ 141);
        lIIlIlllI[99] = 161 ^ 157;
        lIIlIlllI[100] = (8 ^ 53) ^ ((53 ^ 107) & ((94 ^ 0) ^ (-1)));
        lIIlIlllI[101] = (99 ^ 56) ^ (53 ^ 80);
        lIIlIlllI[102] = 255 ^ 192;
        lIIlIlllI[103] = (((15 + 188) - 99) + 142) ^ (((165 + 120) - 271) + 168);
        lIIlIlllI[104] = (117 ^ 100) ^ (244 ^ 164);
        lIIlIlllI[105] = (225 ^ 136) ^ (151 ^ 188);
        lIIlIlllI[106] = 119 ^ 52;
        lIIlIlllI[107] = (((208 + 211) - 303) + 99) ^ (((8 + 15) - (-19)) + 105);
        lIIlIlllI[108] = (94 ^ 83) ^ (127 ^ 55);
        lIIlIlllI[109] = 88 ^ 30;
        lIIlIlllI[110] = 89 ^ 30;
        lIIlIlllI[111] = 233 ^ 161;
        lIIlIlllI[112] = (((122 + 95) - 159) + 79) ^ (((128 + 164) - 264) + 164);
        lIIlIlllI[113] = 208 ^ 154;
        lIIlIlllI[114] = (((126 + 59) - 136) + 192) ^ (((130 + 137) - 130) + 49);
        lIIlIlllI[115] = (((199 + 96) - 82) + 41) ^ (((158 + 53) - 192) + 159);
        lIIlIlllI[116] = 71 ^ 10;
        lIIlIlllI[117] = (((51 + 30) - 21) + 76) ^ (((92 + 84) - 100) + 122);
        lIIlIlllI[118] = 84 ^ 27;
        lIIlIlllI[119] = (((114 + 48) - 155) + 198) ^ (((90 + 19) - 34) + 82);
        lIIlIlllI[120] = 203 ^ 154;
        lIIlIlllI[121] = 121 ^ 43;
        lIIlIlllI[122] = 210 ^ 129;
        lIIlIlllI[123] = 217 ^ 141;
        lIIlIlllI[124] = 114 ^ 39;
        lIIlIlllI[125] = 86 ^ 0;
        lIIlIlllI[126] = (233 ^ 185) ^ (126 ^ 121);
        lIIlIlllI[127] = 2 ^ 90;
        lIIlIlllI[128] = 44 ^ 117;
        lIIlIlllI[129] = (96 ^ 25) ^ (59 ^ 24);
        lIIlIlllI[130] = (((132 + 17) - 111) + 114) ^ (((39 + 125) - 143) + 174);
        lIIlIlllI[131] = 38 ^ 122;
        lIIlIlllI[132] = (210 ^ 160) ^ (127 ^ 80);
        lIIlIlllI[133] = (105 ^ 21) ^ (161 ^ 131);
        lIIlIlllI[134] = (86 ^ 2) ^ (138 ^ 129);
        lIIlIlllI[135] = (245 ^ 192) ^ (198 ^ 147);
        lIIlIlllI[136] = 40 ^ 73;
        lIIlIlllI[137] = 255 ^ 157;
        lIIlIlllI[138] = (13 ^ 7) ^ (216 ^ 177);
        lIIlIlllI[139] = (244 ^ 163) ^ (144 ^ 162);
        lIIlIlllI[140] = (((211 + 242) - 411) + 208) ^ (((8 + 23) - (-1)) + 124);
        lIIlIlllI[141] = (((64 + 193) - 215) + 152) ^ (((2 + 163) - 139) + 139);
        lIIlIlllI[142] = "   ".length() ^ (45 ^ 70);
        lIIlIlllI[143] = 234 ^ 131;
        lIIlIlllI[144] = 115 ^ 25;
        lIIlIlllI[145] = 205 ^ 166;
        lIIlIlllI[146] = (((5 + 194) - 132) + 133) ^ (((36 + 150) - 133) + 111);
        lIIlIlllI[147] = (106 ^ 95) ^ (219 ^ 131);
        lIIlIlllI[148] = (62 ^ 72) ^ (129 ^ 153);
        lIIlIlllI[149] = (17 ^ 119) ^ (54 ^ 63);
        lIIlIlllI[150] = 125 ^ 13;
        lIIlIlllI[151] = (-4162) & 7419;
        lIIlIlllI[152] = (-25090) & 28541;
        lIIlIlllI[153] = (-((-10121) & 14218)) & (-2049) & 7903;
        lIIlIlllI[154] = (-26657) & 31611;
        lIIlIlllI[155] = (-28929) & 30685;
        lIIlIlllI[156] = (-24725) & 29663;
        lIIlIlllI[157] = (-((-26147) & 32555)) & (-16385) & 24569;
        lIIlIlllI[158] = (-((-8593) & 28081)) & (-129) & 24575;
        lIIlIlllI[159] = (-((-18612) & 30903)) & (-273) & 14335;
        lIIlIlllI[160] = (-(((31 + 5) - (-6)) + 89)) & (-24577) & 29683;
        lIIlIlllI[161] = (-((-1026) & 29999)) & (-2049) & 32767;
        lIIlIlllI[162] = (-8326) & 13301;
        lIIlIlllI[163] = (-((-13965) & 30366)) & (-14337) & 32479;
        lIIlIlllI[164] = (-((-12578) & 31029)) & (-1153) & 24563;
        lIIlIlllI[165] = 127 ^ 14;
        lIIlIlllI[166] = (-13105) & 14270;
        lIIlIlllI[167] = (-((-12305) & 28887)) & (-4610) & 24575;
        lIIlIlllI[168] = (-((-3747) & 32483)) & (-3117) & 32639;
        lIIlIlllI[169] = (-((-4141) & 32109)) & (-9) & 28671;
        lIIlIlllI[170] = (243 ^ 185) ^ (149 ^ 173);
    }

    private static String lllllIIlllI(String lIIIIIllIlIlIll, String lIIIIIllIlIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIIllIlIllIl = Cipher.getInstance("Blowfish");
            lIIIIIllIlIllIl.init(lIIlIlllI[6], secretKeySpec);
            return new String(lIIIIIllIlIllIl.doFinal(Base64.getDecoder().decode(lIIIIIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIllIlIllII) {
            lIIIIIllIlIllII.printStackTrace();
            return null;
        }
    }

    private static String lllllIIllll(String lIIIIIlllIIllIl, String lIIIIIlllIIllII) {
        String str = new String(Base64.getDecoder().decode(lIIIIIlllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIIlllIIlIll = new StringBuilder();
        char[] charArray = lIIIIIlllIIllII.toCharArray();
        int lIIIIIlllIIlIIl = lIIlIlllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlllI[1];
        while (lllllIlllIl(i, length)) {
            lIIIIIlllIIlIll.append((char) (charArray2[i] ^ charArray[lIIIIIlllIIlIIl % charArray.length]));
            "".length();
            lIIIIIlllIIlIIl++;
            i++;
            "".length();
            if (((32 ^ 115) & ((107 ^ 56) ^ (-1))) > 0) {
                return null;
            }
        }
        return String.valueOf(lIIIIIlllIIlIll);
    }

    private static boolean llllllIIIll(int i, int i2) {
        return i == i2;
    }

    private static String lllllIIllIl(String lIIIIIllIlllIII, String lIIIIIllIllIlll) {
        try {
            SecretKeySpec lIIIIIllIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIllIllIlll.getBytes(StandardCharsets.UTF_8)), lIIlIlllI[13]), "DES");
            Cipher lIIIIIllIlllIlI = Cipher.getInstance("DES");
            lIIIIIllIlllIlI.init(lIIlIlllI[6], lIIIIIllIlllIll);
            return new String(lIIIIIllIlllIlI.doFinal(Base64.getDecoder().decode(lIIIIIllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIIllIlllIIl) {
            lIIIIIllIlllIIl.printStackTrace();
            return null;
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIlIllIl[lIIlIlllI[69]];
    }

    private static boolean llllllIIlII(Object obj) {
        return obj == null;
    }

    private static boolean llllllIIIII(int i) {
        return i > 0;
    }

    private static void p(int i) {
        if (!lllllIllllI(Widgets.get(lIIlIlllI[19]).isEmpty() ? 1 : 0) || llllllIIlII(Widgets.get(lIIlIlllI[19]))) {
            int[] iArr = new int[lIIlIlllI[2]];
            iArr[lIIlIlllI[1]] = i;
            if (lllllIlllll(TileObjects.getNearest(iArr))) {
                int[] iArr2 = new int[lIIlIlllI[2]];
                iArr2[lIIlIlllI[1]] = i;
                TileObjects.getNearest(iArr2).interact(lIIlIllIl[lIIlIlllI[64]]);
                Time.sleepTicks(lIIlIlllI[6]);
                "".length();
            }
        }
    }

    private static boolean llllllIIlIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private static boolean ab() {
        if (llllllIIIII(Inventory.getCount(C0005f.aV))) {
            int[] iArr = new int[lIIlIlllI[2]];
            iArr[lIIlIlllI[1]] = lIIlIlllI[7];
            if (llllllIIIII(Inventory.getCount(iArr))) {
                ?? r0 = lIIlIlllI[2];
                "".length();
                return 0 != 0 ? ((((192 + 82) - 202) + 157) ^ (((1 + 31) - (-132)) + 20)) & (((((82 + 46) - 57) + 82) ^ (((31 + 191) - 160) + 134)) ^ (-" ".length())) : r0;
            }
        }
        return lIIlIlllI[1];
    }

    private static boolean lllllIlllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lllllIllllI(int i) {
        return i == 0;
    }

    private static boolean llllllIIIlI(int i, int i2) {
        return i <= i2;
    }

    private static void lllllIllIlI() {
        lIIlIllIl = new String[lIIlIlllI[170]];
        lIIlIllIl[lIIlIlllI[1]] = lllllIIllIl("RnNTbPvm7t8=", "xnNeD");
        lIIlIllIl[lIIlIlllI[2]] = lllllIIlllI("0i0XbczEEp5Z4yDCIQ6dvB1hzaQjyIUD8ktWPidblKmQLIB5GOB4Ik7rymTkYmiy", "xSOSP");
        lIIlIllIl[lIIlIlllI[6]] = lllllIIllll("LyhTOzcdbR4zNgskHT1lCTgWKTFYPgYqNRQkFilpWD4EMzEbJRo0Ilg5HHoHLRQ6FAI=", "xMsZE");
        lIIlIllIl[lIIlIlllI[12]] = lllllIIlllI("qvunjSDm4/c=", "SZeME");
        lIIlIllIl[lIIlIlllI[5]] = lllllIIllll("AS8ZVh4gbhwCCz06", "ONovj");
        lIIlIllIl[lIIlIlllI[10]] = lllllIIllIl("sQDCB/OLZ6KSGkEF65pa5A==", "UprLo");
        lIIlIllIl[lIIlIlllI[16]] = lllllIIllIl("ATC6T3I8cd8Zcb/7MFnzegjF3goEsPwp", "OMMaT");
        lIIlIllIl[lIIlIlllI[21]] = lllllIIllll("AScFNTg8L0koMD44ASolNw==", "RHiCQ");
        lIIlIllIl[lIIlIlllI[13]] = lllllIIllll("Nw4qIQMKBmYaBQoKIy4=", "daFWj");
        lIIlIllIl[lIIlIlllI[17]] = lllllIIlllI("ktkArG9X8lrOeMPmlr7A6PkTB1WdOLec", "ynsgq");
        lIIlIllIl[lIIlIlllI[9]] = lllllIIllll("BSE7OS84KXc8KDclMg==", "VNWOF");
        lIIlIllIl[lIIlIlllI[30]] = lllllIIllll("IS0YGCwcJVQLJAE2VB0rEysY", "rBtnE");
        lIIlIllIl[lIIlIlllI[33]] = lllllIIllll("Bh8+MCw7F3IxPCMVICg=", "UpRFE");
        lIIlIllIl[lIIlIlllI[36]] = lllllIIllll("FgMiPjwrC24sJyQLISY=", "ElNHU");
        lIIlIllIl[lIIlIlllI[39]] = lllllIIlllI("kK4e+R2FXg5al1RMgFf6Wg==", "JIOZm");
        lIIlIllIl[lIIlIlllI[42]] = lllllIIlllI("zxntmqcgLHgbww6Fib+vmg==", "fIQmN");
        lIIlIllIl[lIIlIlllI[45]] = lllllIIllIl("oYcwkG+i4YQ/E09f4CYIxg==", "HcVlc");
        lIIlIllIl[lIIlIlllI[48]] = lllllIIllll("CTckGAI0P2gNCjc9JA==", "ZXHnk");
        lIIlIllIl[lIIlIlllI[51]] = lllllIIlllI("B9Iw6sNCV/yYx4QQGSojHg==", "FFNdN");
        lIIlIllIl[lIIlIlllI[54]] = lllllIIlllI("/3JVKNdIAVrevAiuL7IVEQ==", "KbSnO");
        lIIlIllIl[lIIlIlllI[57]] = lllllIIllIl("YoCsD8eymeNwneNsy0D2aakg+w8i7oXc", "EWWlf");
        lIIlIllIl[lIIlIlllI[58]] = lllllIIllIl("HJqSvHAm7rmFAdlf+pR6cQ==", "mNyuT");
        lIIlIllIl[lIIlIlllI[59]] = lllllIIllIl("ZsrN/57uaT0=", "MkDfL");
        lIIlIllIl[lIIlIlllI[60]] = lllllIIllll("GgYJOzkxG0UJOjwADQ==", "UteZW");
        lIIlIllIl[lIIlIlllI[62]] = lllllIIllll("GBM2L1QHEz8wAB8JNA==", "vfZCt");
        lIIlIllIl[lIIlIlllI[63]] = lllllIIllll("PhogJxNYFDs6AB0H", "xuUIw");
        lIIlIllIl[lIIlIlllI[64]] = lllllIIlllI("F4GgvCBP+24=", "yTtve");
        lIIlIllIl[lIIlIlllI[69]] = lllllIIllll("IBAYOxUVGkoYDx8L", "vqjIz");
        lIIlIllIl[lIIlIlllI[61]] = lllllIIlllI("OUcjndFH2HfqM6GmtQvzy8JlSHUtAUaH", "xMWRu");
        lIIlIllIl[lIIlIlllI[70]] = lllllIIllIl("RwzUaNzH1gPvdO/ce/YP2w==", "ADhQK");
        lIIlIllIl[lIIlIlllI[71]] = lllllIIllll("AhslGQUzWCYOASUUIRg=", "QxDkd");
        lIIlIllIl[lIIlIlllI[72]] = lllllIIllIl("j5ZH/Af+s9A=", "EhsNS");
        lIIlIllIl[lIIlIlllI[73]] = lllllIIlllI("ytQdUOmFRhA7zykM8kjAMyZEa4Xax8U53QptqOlRAKI=", "qJAOD");
        lIIlIllIl[lIIlIlllI[74]] = lllllIIllll("Ay0hJyYuej0sMyUp", "WZDIR");
        lIIlIllIl[lIIlIlllI[75]] = lllllIIllIl("oStNvilzp1rqMC0vdjrb3g==", "Vlmyn");
        lIIlIllIl[lIIlIlllI[76]] = lllllIIllll("MxEGCx5RBgULBFEADwkZFAYLEBwDEQ==", "qtjdi");
        lIIlIllIl[lIIlIlllI[77]] = lllllIIllIl("16Jaj2pR1vOk5sKcVQw+2g==", "BwYHY");
        lIIlIllIl[lIIlIlllI[78]] = lllllIIlllI("3fFLTR0fBRcq8Qdc7dgfgw==", "EAFsq");
        lIIlIllIl[lIIlIlllI[79]] = lllllIIllll("BTcSOxs7NxE=", "WRbOr");
        lIIlIllIl[lIIlIlllI[80]] = lllllIIllll("JhwlSTQIBDUFM0kDKB0zGg==", "ipAiV");
        lIIlIllIl[lIIlIlllI[11]] = lllllIIllll("DhsHQTs2EhsEGno+AxIcPwER", "Zsbah");
        lIIlIllIl[lIIlIlllI[81]] = lllllIIllIl("WluxfdjTsNA=", "tVkzA");
        lIIlIllIl[lIIlIlllI[82]] = lllllIIllll("OwE9CgoLHXIGCAER", "huRgk");
        lIIlIllIl[lIIlIlllI[83]] = lllllIIllll("KBwTJgMLSQM9CAkNCCEK", "liaOm");
        lIIlIllIl[lIIlIlllI[84]] = lllllIIllIl("K9VerVsaZLYac5ocz2z8ng==", "enxIV");
        lIIlIllIl[lIIlIlllI[85]] = lllllIIllIl("byT8/DYyIqY=", "rSnTn");
        lIIlIllIl[lIIlIlllI[86]] = lllllIIllll("GCgjDh04KCs=", "TINkq");
        lIIlIllIl[lIIlIlllI[87]] = lllllIIllIl("lzrRx5goLlSmHMzNnhLE0Q==", "ZEZuB");
        lIIlIllIl[lIIlIlllI[88]] = lllllIIlllI("tzWk7n6GPUuYgq4LpiAF7yiEyIN/GOSY", "eeoZD");
        lIIlIllIl[lIIlIlllI[89]] = lllllIIllll("ADMtACQ0Ljc=", "SFClM");
        lIIlIllIl[lIIlIlllI[0]] = lllllIIllIl("HrAFK3yfCc6vjMGgPiC8Kw==", "LoYgd");
        lIIlIllIl[lIIlIlllI[90]] = lllllIIlllI("wb1lreGMvzE=", "sRgxJ");
        lIIlIllIl[lIIlIlllI[91]] = lllllIIllIl("QkQPbdWBbj9Ay4wu26SdKw==", "aupdI");
        lIIlIllIl[lIIlIlllI[92]] = lllllIIllIl("vDFJQEuCm8LiTHieJDSrZITx22weyjCt", "USGpT");
        lIIlIllIl[lIIlIlllI[93]] = lllllIIllIl("ps1ObjrZ6CI=", "ixhit");
        lIIlIllIl[lIIlIlllI[94]] = lllllIIllIl("ZY7nORhosqI=", "nQPOH");
        lIIlIllIl[lIIlIlllI[95]] = lllllIIllIl("oHoJv+9TyrDNZ6QCP/WC0g==", "gwjlS");
        lIIlIllIl[lIIlIlllI[96]] = lllllIIllIl("uKmjYAwPk9P8AYNTMRw8gg==", "ArxQR");
        lIIlIllIl[lIIlIlllI[97]] = lllllIIllIl("uc14sjab+5w=", "YoqJv");
        lIIlIllIl[lIIlIlllI[98]] = lllllIIllIl("RiljY4dvjiscN8+wHePuCH6oo4dgKlyl", "bllER");
        lIIlIllIl[lIIlIlllI[99]] = lllllIIlllI("FClhaFwzDoc=", "IyaDY");
        lIIlIllIl[lIIlIlllI[100]] = lllllIIlllI("3uCuDPKnpvE=", "YXgDO");
        lIIlIllIl[lIIlIlllI[101]] = lllllIIllll("PAQrFhQN", "hsNzb");
        lIIlIllIl[lIIlIlllI[102]] = lllllIIlllI("KL8gpPZ1E1CB/Od2NKzemwjsrpPvxOAZ", "SSnnN");
        lIIlIllIl[lIIlIlllI[103]] = lllllIIllll("GSMoMw==", "QBAAB");
        lIIlIllIl[lIIlIlllI[104]] = lllllIIlllI("SsGQwW8HWevajHw9I6kILgC2NytaSCf8", "dfnOb");
        lIIlIllIl[lIIlIlllI[105]] = lllllIIlllI("3ZX+6L8TguU9+OQUmRiPZQ==", "CmsPa");
        lIIlIllIl[lIIlIlllI[106]] = lllllIIlllI("qMg0ygLre+h4ML4fFHPacQ==", "AiMAd");
        lIIlIllIl[lIIlIlllI[107]] = lllllIIllll("JjwXBykU", "gLgkL");
        lIIlIllIl[lIIlIlllI[108]] = lllllIIlllI("If7xnVW5RQU=", "RJkPR");
        lIIlIllIl[lIIlIlllI[109]] = lllllIIllll("GhsUGSUoHgA=", "IjaxH");
        lIIlIllIl[lIIlIlllI[110]] = lllllIIlllI("IDW/VPbUwPU=", "hJJGA");
        lIIlIllIl[lIIlIlllI[111]] = lllllIIllll("dBJSXTE7KgUVJg==", "SKupB");
        lIIlIllIl[lIIlIlllI[112]] = lllllIIllIl("Dnaj3myNnUvlcPmXYB/EJw==", "MSLYy");
        lIIlIllIl[lIIlIlllI[113]] = lllllIIllll("CyUeBw88LFcJBiknEA8=", "HIwjn");
        lIIlIllIl[lIIlIlllI[114]] = lllllIIlllI("Xao7f+1UR4c=", "TJiHp");
        lIIlIllIl[lIIlIlllI[115]] = lllllIIllll("EzolKQs5Ow==", "WHDNd");
        lIIlIllIl[lIIlIlllI[116]] = lllllIIllll("OxkEPgkE", "hvgWh");
        lIIlIllIl[lIIlIlllI[117]] = lllllIIlllI("8FYMRcIGSnUeLcvm7KSTavmhWNvsnwkL", "DroZX");
        lIIlIllIl[lIIlIlllI[118]] = lllllIIllll("HjAeJQ==", "SYrNZ");
        lIIlIllIl[lIIlIlllI[119]] = lllllIIlllI("3/GNbfcslSQ=", "fNdWS");
        lIIlIllIl[lIIlIlllI[120]] = lllllIIllIl("7MVLAM2O3Gx2yxUnDDfLxA==", "VvWBp");
        lIIlIllIl[lIIlIlllI[121]] = lllllIIllll("ICEBDg8d", "sHlgn");
        lIIlIllIl[lIIlIlllI[122]] = lllllIIllll("LBcoAxgMCCM=", "czFjn");
        lIIlIllIl[lIIlIlllI[123]] = lllllIIlllI("zelFbHmT78o=", "zKLnG");
        lIIlIllIl[lIIlIlllI[124]] = lllllIIlllI("M4tLpXfKyh3Ks6nN/Of78d+qrBPYjPvg", "GBhUn");
        lIIlIllIl[lIIlIlllI[125]] = lllllIIllIl("/mpvoboekUvtx8QuRhH4RA==", "opJeU");
        lIIlIllIl[lIIlIlllI[126]] = lllllIIllIl("1aQw3Q4SrJ0jN7tA0nogZQ==", "DPRAB");
        lIIlIllIl[lIIlIlllI[127]] = lllllIIllll("Ej8A", "FHoBj");
        lIIlIllIl[lIIlIlllI[128]] = lllllIIllll("PCUCPRNILg86Fw==", "hJzTp");
        lIIlIllIl[lIIlIlllI[129]] = lllllIIllIl("r/eJ+2lrMjrSnLPzS+88Lw==", "vTkHi");
        lIIlIllIl[lIIlIlllI[130]] = lllllIIllIl("5ObEOJmkkMLE54O4IBf1RQ==", "lqncy");
        lIIlIllIl[lIIlIlllI[131]] = lllllIIlllI("iru6HQAfJTw=", "WhWUn");
        lIIlIllIl[lIIlIlllI[132]] = lllllIIlllI("4rib+S0Y8hPnKNfaQS1gjQ==", "BOLmr");
        lIIlIllIl[lIIlIlllI[133]] = lllllIIllIl("B+u8/EWp6Vd21ikYPAnCng==", "mHmQc");
        lIIlIllIl[lIIlIlllI[134]] = lllllIIlllI("paEkZDLy4v+3aAFy2vlI/Q==", "ydIhy");
        lIIlIllIl[lIIlIlllI[135]] = lllllIIllIl("7FBdQnjrsNK0C0HEVBL9pA==", "UArgG");
        lIIlIllIl[lIIlIlllI[136]] = lllllIIllll("fQ==", "MTwVF");
        lIIlIllIl[lIIlIlllI[137]] = lllllIIllll("FR84DhE3EyITDTFQNxQHdgMiCAYiEz4TDTE=", "VpVzc");
        lIIlIllIl[lIIlIlllI[138]] = lllllIIlllI("jersSoTYe17nCNZfUGfBDUOk+lmWtNRvoKVmqxQl/eI=", "mJOSG");
        lIIlIllIl[lIIlIlllI[68]] = lllllIIllIl("0j0fhKVo5T9Ujb9OFaBpHw==", "jggVM");
        lIIlIllIl[lIIlIlllI[139]] = lllllIIllll("GREGYxQoCgYiFC4RBjEV", "MycCf");
        lIIlIllIl[lIIlIlllI[140]] = lllllIIllIl("C+6K6Oyde8YEyIGJTwF8jA==", "DDgnQ");
        lIIlIllIl[lIIlIlllI[141]] = lllllIIllIl("wK6ZZGln5co=", "XUZTN");
        lIIlIllIl[lIIlIlllI[142]] = lllllIIllIl("K5/ynV/m13GVXNfpH6r5og==", "Hfeah");
        lIIlIllIl[lIIlIlllI[143]] = lllllIIlllI("cc1mkmy9BSY=", "UOiTA");
        lIIlIllIl[lIIlIlllI[144]] = lllllIIllll("NyoLJiYOKA0=", "gFjHH");
        lIIlIllIl[lIIlIlllI[145]] = lllllIIlllI("RZWAoQQdz6cfZd4khO+N4w==", "SwzAd");
        lIIlIllIl[lIIlIlllI[146]] = lllllIIlllI("BiCX/noao/p3Pk3g7E75pos/MyWIKeoY", "nxmvJ");
        lIIlIllIl[lIIlIlllI[147]] = lllllIIllll("MSIfIyEA", "eMqDT");
        lIIlIllIl[lIIlIlllI[148]] = lllllIIllIl("cqHvPfWyYHc=", "yEULt");
        lIIlIllIl[lIIlIlllI[149]] = lllllIIllIl("3PJXaYOCSyLTa4SwTbn67w==", "WXtUA");
        lIIlIllIl[lIIlIlllI[150]] = lllllIIlllI("lVvo6QbFgOxKDU4agtG+mw==", "ZgseF");
        lIIlIllIl[lIIlIlllI[165]] = lllllIIllIl("uRAJvUzdlFOROSBzTFDJwA==", "YmzTw");
    }

    private static boolean lllllIlllll(Object obj) {
        return obj != null;
    }
}
