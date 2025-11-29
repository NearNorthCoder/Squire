/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Widgets
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.h;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class y
implements G {
    public static final /* synthetic */ String ek;
    public static final /* synthetic */ String er;
    public static final /* synthetic */ int dz;
    public static final /* synthetic */ String eJ;
    public static final /* synthetic */ String dX;
    public static final /* synthetic */ int dq;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ String ej;
    public static final /* synthetic */ String em;
    public static final /* synthetic */ String fo;
    public static final /* synthetic */ String fb;
    public static final /* synthetic */ String eW;
    public static final /* synthetic */ String eo;
    public static /* synthetic */ WorldArea bS;
    public static final /* synthetic */ int dB;
    public static final /* synthetic */ String dW;
    public static final /* synthetic */ String fd;
    public static final /* synthetic */ String eZ;
    public static final /* synthetic */ String eG;
    public static final /* synthetic */ String eU;
    public static final /* synthetic */ String eX;
    public static final /* synthetic */ int dA;
    public static final /* synthetic */ String fa;
    public static final /* synthetic */ String dM;
    public static final /* synthetic */ int dw;
    public static final /* synthetic */ String el;
    public static final /* synthetic */ String ef;
    public static final /* synthetic */ String eS;
    static /* synthetic */ int ck;
    public static final /* synthetic */ String eb;
    public static /* synthetic */ String[] fp;
    public static final /* synthetic */ String en;
    public static final /* synthetic */ String eD;
    public static final /* synthetic */ String eB;
    public static final /* synthetic */ String ex;
    public static final /* synthetic */ String ep;
    public static final /* synthetic */ WorldPoint dI;
    public static final /* synthetic */ String dO;
    public static final /* synthetic */ String eN;
    public static final /* synthetic */ String es;
    public static final /* synthetic */ String fe;
    public static final /* synthetic */ String eg;
    public static final /* synthetic */ String fm;
    public static final /* synthetic */ String dN;
    public static final /* synthetic */ String fl;
    public static final /* synthetic */ String ec;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ String ey;
    public static final /* synthetic */ int dn;
    public static final /* synthetic */ String dQ;
    public static final /* synthetic */ String eL;
    public static final /* synthetic */ int do;
    public static final /* synthetic */ String dT;
    public static final /* synthetic */ WorldPoint dE;
    public static final /* synthetic */ String ev;
    public static final /* synthetic */ String et;
    public static final /* synthetic */ String eY;
    public static final /* synthetic */ String fk;
    public static final /* synthetic */ WorldPoint dC;
    public static final /* synthetic */ int dl;
    public static final /* synthetic */ String dZ;
    public static final /* synthetic */ int dx;
    public static final /* synthetic */ int dv;
    public static final /* synthetic */ int dp;
    public static final /* synthetic */ int dr;
    public static final /* synthetic */ String ed;
    public static final /* synthetic */ String ez;
    public static final /* synthetic */ String dP;
    public static final /* synthetic */ String ew;
    public static final /* synthetic */ String ea;
    public static final /* synthetic */ String fn;
    public static final /* synthetic */ String eu;
    public static final /* synthetic */ String eh;
    public static final /* synthetic */ String eC;
    public static final /* synthetic */ String dS;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ String fj;
    public static final /* synthetic */ WorldPoint dH;
    public static final /* synthetic */ String dU;
    public static final /* synthetic */ String eV;
    public static final /* synthetic */ String eR;
    public static final /* synthetic */ String eA;
    public static final /* synthetic */ String eE;
    public static final /* synthetic */ String fg;
    public static final /* synthetic */ String eK;
    public static final /* synthetic */ String dV;
    public static final /* synthetic */ String ei;
    public static final /* synthetic */ String dJ;
    public static final /* synthetic */ String dL;
    public static final /* synthetic */ int du;
    public static final /* synthetic */ String eF;
    public static final /* synthetic */ String dR;
    public static final /* synthetic */ String eO;
    public static final /* synthetic */ WorldPoint dF;
    public static final /* synthetic */ String eT;
    public static final /* synthetic */ String eQ;
    public static final /* synthetic */ String eM;
    public static final /* synthetic */ int dm;
    public static final /* synthetic */ String fi;
    public static final /* synthetic */ String ff;
    public static final /* synthetic */ String dK;
    public static final /* synthetic */ String fc;
    public static final /* synthetic */ String eq;
    public static final /* synthetic */ int ds;
    public static final /* synthetic */ String eI;
    private static /* synthetic */ int[] lIIlIIlIll;
    public static final /* synthetic */ String fh;
    public static final /* synthetic */ String dY;
    public static final /* synthetic */ String eP;
    public static final /* synthetic */ WorldPoint dD;
    public static final /* synthetic */ WorldPoint dG;
    public static final /* synthetic */ int dy;
    public static final /* synthetic */ int dt;
    public static final /* synthetic */ String ee;
    private static /* synthetic */ String[] lIIlIIlIIl;
    public static final /* synthetic */ String eH;

    private static boolean lllllIIlIlII(int n2) {
        return n2 == 0;
    }

    private static String lllllIIIIIll(String lIIIll, String lIIlII) {
        try {
            SecretKeySpec lIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlll = Cipher.getInstance("Blowfish");
            lIIlll.init(lIIlIIlIll[6], lIlIII);
            return new String(lIIlll.doFinal(Base64.getDecoder().decode(lIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllI) {
            lIIllI.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        if (y.lllllIIlIllI(Inventory.getCount((int[])f.aV))) {
            int[] nArray = new int[lIIlIIlIll[2]];
            nArray[y.lIIlIIlIll[1]] = lIIlIIlIll[7];
            if (y.lllllIIlIllI(Inventory.getCount((int[])nArray))) {
                n2 = lIIlIIlIll[2];
                0;
                if (((0x6A ^ 0x50 ^ (0x20 ^ 0x16)) & (0xD7 ^ 0xAE ^ (0xDA ^ 0xAF) ^ -1)) >= -1) return n2 != 0;
                return ((44 + 129 - 48 + 11 ^ 85 + 30 - 50 + 108) & (0xEE ^ 0xC0 ^ (0x3A ^ 0x31) ^ -1)) != 0;
            }
        }
        n2 = lIIlIIlIll[1];
        return n2 != 0;
    }

    static {
        y.lllllIIlIIIl();
        y.lllllIIlIIII();
        dm = lIIlIIlIll[6];
        er = lIIlIIlIIl[lIIlIIlIll[70]];
        eB = lIIlIIlIIl[lIIlIIlIll[71]];
        eu = lIIlIIlIIl[lIIlIIlIll[72]];
        dQ = lIIlIIlIIl[lIIlIIlIll[73]];
        eR = lIIlIIlIIl[lIIlIIlIll[74]];
        fa = lIIlIIlIIl[lIIlIIlIll[75]];
        dw = lIIlIIlIll[40];
        eM = lIIlIIlIIl[lIIlIIlIll[76]];
        dP = lIIlIIlIIl[lIIlIIlIll[77]];
        fn = lIIlIIlIIl[lIIlIIlIll[78]];
        eY = lIIlIIlIIl[lIIlIIlIll[79]];
        ea = lIIlIIlIIl[lIIlIIlIll[80]];
        eD = lIIlIIlIIl[lIIlIIlIll[11]];
        eQ = lIIlIIlIIl[lIIlIIlIll[81]];
        eS = lIIlIIlIIl[lIIlIIlIll[82]];
        ey = lIIlIIlIIl[lIIlIIlIll[83]];
        dA = lIIlIIlIll[52];
        dy = lIIlIIlIll[46];
        dr = lIIlIIlIll[26];
        ds = lIIlIIlIll[28];
        eW = lIIlIIlIIl[lIIlIIlIll[84]];
        ez = lIIlIIlIIl[lIIlIIlIll[85]];
        dL = lIIlIIlIIl[lIIlIIlIll[86]];
        fe = lIIlIIlIIl[lIIlIIlIll[87]];
        eU = lIIlIIlIIl[lIIlIIlIll[88]];
        ef = lIIlIIlIIl[lIIlIIlIll[89]];
        dp = lIIlIIlIll[22];
        eX = lIIlIIlIIl[lIIlIIlIll[0]];
        eo = lIIlIIlIIl[lIIlIIlIll[90]];
        fk = lIIlIIlIIl[lIIlIIlIll[91]];
        eb = lIIlIIlIIl[lIIlIIlIll[92]];
        dU = lIIlIIlIIl[lIIlIIlIll[93]];
        eP = lIIlIIlIIl[lIIlIIlIll[94]];
        ek = lIIlIIlIIl[lIIlIIlIll[95]];
        eK = lIIlIIlIIl[lIIlIIlIll[96]];
        eG = lIIlIIlIIl[lIIlIIlIll[97]];
        fj = lIIlIIlIIl[lIIlIIlIll[98]];
        et = lIIlIIlIIl[lIIlIIlIll[99]];
        eE = lIIlIIlIIl[lIIlIIlIll[100]];
        dx = lIIlIIlIll[43];
        eT = lIIlIIlIIl[lIIlIIlIll[101]];
        dK = lIIlIIlIIl[lIIlIIlIll[102]];
        eq = lIIlIIlIIl[lIIlIIlIll[103]];
        ep = lIIlIIlIIl[lIIlIIlIll[104]];
        eN = lIIlIIlIIl[lIIlIIlIll[105]];
        el = lIIlIIlIIl[lIIlIIlIll[106]];
        eh = lIIlIIlIIl[lIIlIIlIll[107]];
        dl = lIIlIIlIll[3];
        ff = lIIlIIlIIl[lIIlIIlIll[108]];
        dz = lIIlIIlIll[49];
        dB = lIIlIIlIll[55];
        fi = lIIlIIlIIl[lIIlIIlIll[109]];
        es = lIIlIIlIIl[lIIlIIlIll[110]];
        fo = lIIlIIlIIl[lIIlIIlIll[111]];
        ew = lIIlIIlIIl[lIIlIIlIll[112]];
        fl = lIIlIIlIIl[lIIlIIlIll[113]];
        ex = lIIlIIlIIl[lIIlIIlIll[114]];
        eJ = lIIlIIlIIl[lIIlIIlIll[115]];
        dn = lIIlIIlIll[19];
        dM = lIIlIIlIIl[lIIlIIlIll[116]];
        dW = lIIlIIlIIl[lIIlIIlIll[117]];
        ei = lIIlIIlIIl[lIIlIIlIll[118]];
        fd = lIIlIIlIIl[lIIlIIlIll[119]];
        eH = lIIlIIlIIl[lIIlIIlIll[120]];
        dZ = lIIlIIlIIl[lIIlIIlIll[121]];
        ej = lIIlIIlIIl[lIIlIIlIll[122]];
        en = lIIlIIlIIl[lIIlIIlIll[123]];
        fh = lIIlIIlIIl[lIIlIIlIll[124]];
        eL = lIIlIIlIIl[lIIlIIlIll[125]];
        dR = lIIlIIlIIl[lIIlIIlIll[126]];
        dq = lIIlIIlIll[24];
        ec = lIIlIIlIIl[lIIlIIlIll[127]];
        dT = lIIlIIlIIl[lIIlIIlIll[128]];
        eO = lIIlIIlIIl[lIIlIIlIll[129]];
        dJ = lIIlIIlIIl[lIIlIIlIll[130]];
        ee = lIIlIIlIIl[lIIlIIlIll[131]];
        dt = lIIlIIlIll[31];
        dX = lIIlIIlIIl[lIIlIIlIll[132]];
        eC = lIIlIIlIIl[lIIlIIlIll[133]];
        eZ = lIIlIIlIIl[lIIlIIlIll[134]];
        dN = lIIlIIlIIl[lIIlIIlIll[135]];
        fg = lIIlIIlIIl[lIIlIIlIll[136]];
        dS = lIIlIIlIIl[lIIlIIlIll[137]];
        fb = lIIlIIlIIl[lIIlIIlIll[138]];
        fc = lIIlIIlIIl[lIIlIIlIll[68]];
        dO = lIIlIIlIIl[lIIlIIlIll[139]];
        do = lIIlIIlIll[18];
        ev = lIIlIIlIIl[lIIlIIlIll[140]];
        du = lIIlIIlIll[34];
        em = lIIlIIlIIl[lIIlIIlIll[141]];
        eF = lIIlIIlIIl[lIIlIIlIll[142]];
        eg = lIIlIIlIIl[lIIlIIlIll[143]];
        eI = lIIlIIlIIl[lIIlIIlIll[144]];
        fm = lIIlIIlIIl[lIIlIIlIll[145]];
        dv = lIIlIIlIll[37];
        ed = lIIlIIlIIl[lIIlIIlIll[146]];
        dV = lIIlIIlIIl[lIIlIIlIll[147]];
        eV = lIIlIIlIIl[lIIlIIlIll[148]];
        dY = lIIlIIlIIl[lIIlIIlIll[149]];
        eA = lIIlIIlIIl[lIIlIIlIll[150]];
        dC = new WorldPoint(lIIlIIlIll[151], lIIlIIlIll[152], lIIlIIlIll[1]);
        dD = new WorldPoint(lIIlIIlIll[153], lIIlIIlIll[154], lIIlIIlIll[1]);
        dE = new WorldPoint(lIIlIIlIll[155], lIIlIIlIll[156], lIIlIIlIll[1]);
        dF = new WorldPoint(lIIlIIlIll[157], lIIlIIlIll[158], lIIlIIlIll[1]);
        dG = new WorldPoint(lIIlIIlIll[159], lIIlIIlIll[160], lIIlIIlIll[1]);
        dH = new WorldPoint(lIIlIIlIll[161], lIIlIIlIll[162], lIIlIIlIll[1]);
        dI = new WorldPoint(lIIlIIlIll[163], lIIlIIlIll[164], lIIlIIlIll[1]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[lIIlIIlIll[2]];
        stringArray[y.lIIlIIlIll[1]] = lIIlIIlIIl[lIIlIIlIll[165]];
        fp = stringArray;
        bS = new WorldArea(lIIlIIlIll[166], lIIlIIlIll[167], lIIlIIlIll[168], lIIlIIlIll[169], lIIlIIlIll[1]);
    }

    private static boolean lllllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllllIIlIIII() {
        lIIlIIlIIl = new String[lIIlIIlIll[170]];
        y.lIIlIIlIIl[y.lIIlIIlIll[1]] = y."Drink";
        y.lIIlIIlIIl[y.lIIlIIlIll[2]] = y."Finished buying items, switching back to quest";
        y.lIIlIIlIIl[y.lIIlIIlIll[6]] = y."We are missing quest supplies, switching to BUYING";
        y.lIIlIIlIIl[y.lIIlIIlIll[12]] = y."Break";
        y.lIIlIIlIIl[y.lIIlIIlIll[5]] = y."Nav to start";
        y.lIIlIIlIIl[y.lIIlIIlIll[10]] = y."Orlando Smith";
        y.lIIlIIlIIl[y.lIIlIIlIll[16]] = y."Solving terror bird";
        y.lIIlIIlIIl[y.lIIlIIlIll[21]] = y."Solving kalphite";
        y.lIIlIIlIIl[y.lIIlIIlIll[13]] = y."Solving Monkey";
        y.lIIlIIlIIl[y.lIIlIIlIll[17]] = y."Solving sea slug";
        y.lIIlIIlIIl[y.lIIlIIlIll[9]] = y."Solving snake";
        y.lIIlIIlIIl[y.lIIlIIlIll[30]] = y."Solving east snail";
        y.lIIlIIlIIl[y.lIIlIIlIll[33]] = y."Solving wyvern";
        y.lIIlIIlIIl[y.lIIlIIlIll[36]] = y."Solving dragon";
        y.lIIlIIlIIl[y.lIIlIIlIll[39]] = y."Solving tort";
        y.lIIlIIlIIl[y.lIIlIIlIll[42]] = y."Solving croc";
        y.lIIlIIlIIl[y.lIIlIIlIll[45]] = y."Solving leech";
        y.lIIlIIlIIl[y.lIIlIIlIll[48]] = y."Solving camel";
        y.lIIlIIlIIl[y.lIIlIIlIll[51]] = y."Solving mole";
        y.lIIlIIlIIl[y.lIIlIIlIll[54]] = y."Solving leech";
        y.lIIlIIlIIl[y.lIIlIIlIll[57]] = y."Handing in quest";
        y.lIIlIIlIIl[y.lIIlIIlIll[58]] = y."Nav to start";
        y.lIIlIIlIIl[y.lIIlIIlIll[59]] = y."Talking";
        y.lIIlIIlIIl[y.lIIlIIlIll[60]] = y."Orlando Smith";
        y.lIIlIIlIIl[y.lIIlIIlIll[62]] = y."null question";
        y.lIIlIIlIIl[y.lIIlIIlIll[63]] = y."Found answer";
        y.lIIlIIlIIl[y.lIIlIIlIll[64]] = y."Study";
        y.lIIlIIlIIl[y.lIIlIIlIll[69]] = y."Varrock Quiz";
        y.lIIlIIlIIl[y.lIIlIIlIll[61]] = y."ring of wealth (";
        y.lIIlIIlIIl[y.lIIlIIlIll[70]] = y."Old battle sites";
        y.lIIlIIlIIl[y.lIIlIIlIll[71]] = y."Three";
        y.lIIlIIlIIl[y.lIIlIIlIll[72]] = y."Vegetables";
        y.lIIlIIlIIl[y.lIIlIIlIll[73]] = y."The researchers";
        y.lIIlIIlIIl[y.lIIlIIlIll[74]] = y."Sight";
        y.lIIlIIlIIl[y.lIIlIIlIll[75]] = y."A labour";
        y.lIIlIIlIIl[y.lIIlIIlIll[76]] = y."Gnomes";
        y.lIIlIIlIIl[y.lIIlIIlIll[77]] = y."Nematocysts";
        y.lIIlIIlIIl[y.lIIlIIlIll[78]] = y."They attack by jumping";
        y.lIIlIIlIIl[y.lIIlIIlIll[79]] = y."They dig holes";
        y.lIIlIIlIIl[y.lIIlIIlIll[80]] = y."Anywhere";
        y.lIIlIIlIIl[y.lIIlIIlIll[11]] = y."It becomes sleepy";
        y.lIIlIIlIIl[y.lIIlIIlIll[81]] = y."0";
        y.lIIlIIlIIl[y.lIIlIIlIll[82]] = y."Planning";
        y.lIIlIIlIIl[y.lIIlIIlIll[83]] = y."Gnomes";
        y.lIIlIIlIIl[y.lIIlIIlIll[84]] = y."During breeding";
        y.lIIlIIlIIl[y.lIIlIIlIll[85]] = y."Sunlight";
        y.lIIlIIlIIl[y.lIIlIIlIll[86]] = y."Harmless";
        y.lIIlIIlIIl[y.lIIlIIlIll[87]] = y."Two";
        y.lIIlIIlIIl[y.lIIlIIlIll[88]] = y."Cold";
        y.lIIlIIlIIl[y.lIIlIIlIll[89]] = y."Contracting and stretching";
        y.lIIlIIlIIl[y.lIIlIIlIll[0]] = y."Subterranean";
        y.lIIlIIlIIl[y.lIIlIIlIll[90]] = y."Anti-dragon-breath shield";
        y.lIIlIIlIIl[y.lIIlIIlIll[91]] = y."'Y'-shaped";
        y.lIIlIIlIIl[y.lIIlIIlIll[92]] = y."It is resistant to acid";
        y.lIIlIIlIIl[y.lIIlIIlIll[93]] = y."They have";
        y.lIIlIIlIIl[y.lIIlIIlIll[94]] = y."Stones";
        y.lIIlIIlIIl[y.lIIlIIlIll[95]] = y."Reptiles";
        y.lIIlIIlIIl[y.lIIlIIlIll[96]] = y."Scabaras";
        y.lIIlIIlIIl[y.lIIlIIlIll[97]] = y."Worker";
        y.lIIlIIlIIl[y.lIIlIIlIll[98]] = y."Water";
        y.lIIlIIlIIl[y.lIIlIIlIll[99]] = y."Mibbiwocket";
        y.lIIlIIlIIl[y.lIIlIIlIll[100]] = y."Hair";
        y.lIIlIIlIIl[y.lIIlIIlIll[101]] = y."A layer of fat";
        y.lIIlIIlIIl[y.lIIlIIlIll[102]] = y."Simian";
        y.lIIlIIlIIl[y.lIIlIIlIll[103]] = y."Elemental";
        y.lIIlIIlIIl[y.lIIlIIlIll[104]] = y."Unknown";
        y.lIIlIIlIIl[y.lIIlIIlIll[105]] = y."Eating plants";
        y.lIIlIIlIIl[y.lIIlIIlIll[106]] = y."Dragons";
        y.lIIlIIlIIl[y.lIIlIIlIll[107]] = y."Climate change";
        y.lIIlIIlIIl[y.lIIlIIlIll[108]] = y."Omnivore";
        y.lIIlIIlIIl[y.lIIlIIlIll[109]] = y."Milk";
        y.lIIlIIlIIl[y.lIIlIIlIll[110]] = y."Twelve";
        y.lIIlIIlIIl[y.lIIlIIlIll[111]] = y."It doubles in size";
        y.lIIlIIlIIl[y.lIIlIIlIll[112]] = y."Hard shell";
        y.lIIlIIlIIl[y.lIIlIIlIll[113]] = y."Apples";
        y.lIIlIIlIIl[y.lIIlIIlIll[114]] = y."Twenty years";
        y.lIIlIIlIIl[y.lIIlIIlIll[115]] = y."Scarab beetles";
        y.lIIlIIlIIl[y.lIIlIIlIll[116]] = y."Bitternuts";
        y.lIIlIIlIIl[y.lIIlIIlIll[117]] = y."Tongue";
        y.lIIlIIlIIl[y.lIIlIIlIll[118]] = y."Two";
        y.lIIlIIlIIl[y.lIIlIIlIll[119]] = y."Toxic dung";
        y.lIIlIIlIIl[y.lIIlIIlIll[120]] = y."Lamellae";
        y.lIIlIIlIIl[y.lIIlIIlIll[121]] = y."Squamata";
        y.lIIlIIlIIl[y.lIIlIIlIll[122]] = y."Asgarnia";
        y.lIIlIIlIIl[y.lIIlIIlIll[123]] = y."Runite";
        y.lIIlIIlIIl[y.lIIlIIlIll[124]] = y."Al Kharid";
        y.lIIlIIlIIl[y.lIIlIIlIll[125]] = y."Anything";
        y.lIIlIIlIIl[y.lIIlIIlIll[126]] = y."Seaweed";
        y.lIIlIIlIIl[y.lIIlIIlIll[127]] = y."Spitting acid";
        y.lIIlIIlIIl[y.lIIlIIlIll[128]] = y."Ardougne";
        y.lIIlIIlIIl[y.lIIlIIlIll[129]] = y."Four";
        y.lIIlIIlIIl[y.lIIlIIlIll[130]] = y."Orlando Smith";
        y.lIIlIIlIIl[y.lIIlIIlIll[131]] = y."Acid-spitting snail";
        y.lIIlIIlIIl[y.lIIlIIlIll[132]] = y."Seeing how you smell";
        y.lIIlIIlIIl[y.lIIlIIlIll[133]] = y."Squamata";
        y.lIIlIIlIIl[y.lIIlIIlIll[134]] = y."Wyson the Gardener";
        y.lIIlIIlIIl[y.lIIlIIlIll[135]] = y."Red";
        y.lIIlIIlIIl[y.lIIlIIlIll[136]] = y."Annoyed";
        y.lIIlIIlIIl[y.lIIlIIlIll[137]] = y."Defence";
        y.lIIlIIlIIl[y.lIIlIIlIll[138]] = y."Insects and other invertebrates";
        y.lIIlIIlIIl[y.lIIlIIlIll[68]] = y."The Talpidae family";
        y.lIIlIIlIIl[y.lIIlIIlIll[139]] = y."Seaweed";
        y.lIIlIIlIIl[y.lIIlIIlIll[140]] = y."Admiral Bake";
        y.lIIlIIlIIl[y.lIIlIIlIll[141]] = y."Below room temperature";
        y.lIIlIIlIIl[y.lIIlIIlIll[142]] = y."Pasha";
        y.lIIlIIlIIl[y.lIIlIIlIll[143]] = y."An operculum";
        y.lIIlIIlIIl[y.lIIlIIlIll[144]] = y."Carnivores";
        y.lIIlIIlIIl[y.lIIlIIlIll[145]] = y."Environment";
        y.lIIlIIlIIl[y.lIIlIIlIll[146]] = y."Fireproof oil";
        y.lIIlIIlIIl[y.lIIlIIlIll[147]] = y."Stomach acid";
        y.lIIlIIlIIl[y.lIIlIIlIll[148]] = y."Social";
        y.lIIlIIlIIl[y.lIIlIIlIll[149]] = y."Constriction";
        y.lIIlIIlIIl[y.lIIlIIlIll[150]] = y."The Slayer Masters";
        y.lIIlIIlIIl[y.lIIlIIlIll[165]] = y."Sure thing.";
    }

    private static boolean lllllIIlIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (y.lllllIIllIll(e.j(lIIlIIlIll[14]), lIIlIIlIll[56]) && y.lllllIIllIll(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIlIll[17])) {
            n2 = lIIlIIlIll[2];
            0;
            
            }
        } else {
            n2 = lIIlIIlIll[1];
        }
        return n2 != 0;
    }

    private static boolean lllllIIlIlIl(Object object) {
        return object != null;
    }

    private static boolean lllllIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static String lllllIIIIIlI(String lIII, String lI) {
        lIII = new String(Base64.getDecoder().decode(lIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llI = new StringBuilder();
        char[] lIl = lI.toCharArray();
        int lII = lIIlIIlIll[1];
        char[] var1 = lIII.toCharArray();
        int var3 = var1.length;
        int var2 = lIIlIIlIll[1];
        while (y.lllllIIlIIll(var2, var3)) {
            char lIIl = var1[var2];
            llI.append((char)(lIIl ^ lIl[lII % lIl.length]));
            0;
            ++lII;
            ++var2;
            0;
            if (-(0xA6 ^ 0xA3) < 0) continue;
            return null;
        }
        return String.valueOf(llI);
    }

    @Override
    public String U() {
        return lIIlIIlIIl[lIIlIIlIll[69]];
    }

    private static boolean lllllIIlIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lllllIIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean S() {
        return lIIlIIlIll[1];
    }

    public static void bk() {
        if (y.lllllIIlIIlI(Inventory.contains((int[])f.aV) ? 1 : 0) && y.lllllIIlIIll(Movement.getRunEnergy(), lIIlIIlIll[0])) {
            Inventory.getFirst((int[])f.aV).interact(lIIlIIlIIl[lIIlIIlIll[1]]);
            Time.sleepTicks((int)lIIlIIlIll[2]);
            0;
        }
        if (y.lllllIIlIlII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (y.lllllIIlIIlI(bt ? 1 : 0)) {
            b.a(bv);
            if (y.lllllIIlIIll(bv.size(), lIIlIIlIll[2])) {
                System.out.println(lIIlIIlIIl[lIIlIIlIll[2]]);
                bt = lIIlIIlIll[1];
            }
        }
        if (y.lllllIIlIlII(bt ? 1 : 0)) {
            if (y.lllllIIlIlII(y.ab() ? 1 : 0) && y.lllllIIlIIll(e.j(lIIlIIlIll[3]), lIIlIIlIll[2])) {
                BankLocation llllIl = BankLocation.getNearest();
                if (y.lllllIIlIlIl(llllIl) && y.lllllIIlIlII(llllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    a.a(llllIl);
                }
                if (y.lllllIIlIlIl(llllIl) && y.lllllIIlIIlI(llllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (y.lllllIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIlIll[4]);
                        0;
                    }
                    if (y.lllllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (y.lllllIIlIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIIlIll[5]);
                            0;
                        }
                        if (y.lllllIIlIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIIlIll[6]);
                            0;
                        }
                        int[] nArray = new int[lIIlIIlIll[6]];
                        nArray[y.lIIlIIlIll[1]] = lIIlIIlIll[7];
                        nArray[y.lIIlIIlIll[2]] = lIIlIIlIll[8];
                        if (y.lllllIIlIlII(e.b(nArray) ? 1 : 0)) {
                            y.af();
                            System.out.println(lIIlIIlIIl[lIIlIIlIll[6]]);
                            bt = lIIlIIlIll[2];
                            return;
                        }
                        int[] nArray2 = new int[lIIlIIlIll[6]];
                        nArray2[y.lIIlIIlIll[1]] = lIIlIIlIll[7];
                        nArray2[y.lIIlIIlIll[2]] = lIIlIIlIll[8];
                        if (y.lllllIIlIIlI(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIIlIIlIll[7], lIIlIIlIll[9]);
                            a.b(f.aV, lIIlIIlIll[10]);
                        }
                    }
                }
            }
            if (y.lllllIIlIIlI(y.ab() ? 1 : 0) && y.lllllIIlIlII(e.j(lIIlIIlIll[3]))) {
                if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dD), lIIlIIlIll[11])) {
                    if (y.lllllIIlIIlI(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[lIIlIIlIll[2]];
                        nArray[y.lIIlIIlIll[1]] = lIIlIIlIll[7];
                        if (y.lllllIIlIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIlIIlIll[2]];
                            nArray3[y.lIIlIIlIll[1]] = lIIlIIlIll[7];
                            Inventory.getFirst((int[])nArray3).interact(lIIlIIlIIl[lIIlIIlIll[12]]);
                            Time.sleepTicks((int)lIIlIIlIll[13]);
                            0;
                        }
                    }
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[5]];
                    Movement.walkTo((WorldPoint)dD);
                    0;
                    Time.sleepTicks((int)lIIlIIlIll[2]);
                    0;
                }
                if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dD), lIIlIIlIll[13])) {
                    g.a(lIIlIIlIIl[lIIlIIlIll[10]], fp);
                    Time.sleepTicks((int)lIIlIIlIll[2]);
                    0;
                }
            }
            if (y.lllllIIlIllI(e.j(lIIlIIlIll[3]))) {
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[15])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[16]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dE), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dE);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dE), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[18]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[20])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[21]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dE), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dE);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dE), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[22]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[23])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[13]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dF);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[24]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[25])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[17]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dF);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[26]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[27])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[9]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dF);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[28]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[29])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[30]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dF);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dF), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[31]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[32])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[33]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dG), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dG);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dG), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[34]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[35])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[36]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dG), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dG);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dG), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[37]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[38])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[39]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dH), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dH);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dH), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[40]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[41])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[42]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dH), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dH);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dH), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[43]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[44])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[45]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dI);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[46]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[47])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[48]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dI);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[49]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[50])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[51]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dI);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[52]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[53])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[54]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dI);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dI), lIIlIIlIll[17])) {
                        y.p(lIIlIIlIll[55]);
                        if (!y.lllllIIlIIlI(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIlIlIl(Widgets.get((int)lIIlIIlIll[19]))) {
                            y.bl();
                        }
                    }
                }
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[56]) && y.lllllIIlIIll(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIlIll[17])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[57]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dD), lIIlIIlIll[13])) {
                        AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[58]];
                        Movement.walkTo((WorldPoint)dD);
                        0;
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dD), lIIlIIlIll[13])) {
                        AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[59]];
                        g.a(lIIlIIlIIl[lIIlIIlIll[60]], fp);
                        Time.sleepTicks((int)lIIlIIlIll[2]);
                        0;
                    }
                }
            }
            System.out.println(e.j(lIIlIIlIll[14]));
        }
    }

    private static void lllllIIlIIIl() {
        lIIlIIlIll = new int[171];
        y.lIIlIIlIll[0] = 2 ^ 0x30;
        y.lIIlIIlIll[1] = (0x54 ^ 7) & ~(0xEC ^ 0xBF);
        y.lIIlIIlIll[2] = 1;
        y.lIIlIIlIll[3] = -(0xFFFFDE3A & 0x65CF) & (0xFFFFFFFF & 0x47FF);
        y.lIIlIIlIll[4] = -(0xFFFF85EF & 0x7E75) & (0xFFFF9FFD & 0x77EE);
        y.lIIlIIlIll[5] = 0x16 ^ 0x12;
        y.lIIlIIlIll[6] = 2;
        y.lIIlIIlIll[7] = 0xFFFFBFCF & 0x5F77;
        y.lIIlIIlIll[8] = -(0xFFFFD56D & 0x6ABB) & (0xFFFFF1F9 & 0x7F7F);
        y.lIIlIIlIll[9] = 0xD6 ^ 0xB5 ^ (0x51 ^ 0x38);
        y.lIIlIIlIll[10] = 0xC2 ^ 0xAB ^ (0x74 ^ 0x18);
        y.lIIlIIlIll[11] = 0x30 ^ 0x18;
        y.lIIlIIlIll[12] = 3;
        y.lIIlIIlIll[13] = 11 + 80 - 50 + 108 ^ 148 + 9 - 77 + 77;
        y.lIIlIIlIll[14] = 0xFFFFB7FE & 0x4BF3;
        y.lIIlIIlIll[15] = -(0xFFFFAD7F & 0x76CC) & (0xFFFFEF4F & 0x3CFB);
        y.lIIlIIlIll[16] = 0x6E ^ 0x36 ^ (0x60 ^ 0x3E);
        y.lIIlIIlIll[17] = 0x48 ^ 0x41;
        y.lIIlIIlIll[18] = 0xFFFFF13F & 0x6EE9;
        y.lIIlIIlIll[19] = -(0xFFFFFEBF & 0x6549) & (0xFFFFFF5D & 0x66BF);
        y.lIIlIIlIll[20] = -(0xFFFFFFEF & 0x56DE) & (0xFFFFDFCF & 0x7EFF);
        y.lIIlIIlIll[21] = 122 + 121 - 207 + 110 ^ 25 + 128 - 106 + 102;
        y.lIIlIIlIll[22] = -(0xFFFFB9CA & 0x57F7) & (0xFFFFFDFB & 0x73EF);
        y.lIIlIIlIll[23] = 0xFFFF8F1E & 0x78E5;
        y.lIIlIIlIll[24] = 0xFFFFF76F & 0x68B7;
        y.lIIlIIlIll[25] = 0xFFFF9F46 & 0x68BF;
        y.lIIlIIlIll[26] = 0xFFFFF16D & 0x6EBA;
        y.lIIlIIlIll[27] = -(0xFFFFF23F & 0x1FF7) & (0xFFFFDFBF & 0x3A7E);
        y.lIIlIIlIll[28] = -(0x63 ^ 0x6A) & (0xFFFFF96F & 0x66BE);
        y.lIIlIIlIll[29] = -(0xFFFFF7F1 & 0x3B7F) & (0xFFFFFBFA & 0x3F7F);
        y.lIIlIIlIll[30] = 0x4A ^ 0x58 ^ (0x28 ^ 0x31);
        y.lIIlIIlIll[31] = 0xFFFFE17D & 0x7EA7;
        y.lIIlIIlIll[32] = -(0xFFFFF6DB & 0x7B75) & (0xFFFFFFFC & 0x7A5F);
        y.lIIlIIlIll[33] = 136 + 66 - 77 + 58 ^ 95 + 145 - 86 + 33;
        y.lIIlIIlIll[34] = -(0xFFFFBF7F & 0x4F9E) & (0xFFFFFFBF & 0x6F7D);
        y.lIIlIIlIll[35] = -(0xFFFFF7FB & 0x7CC5) & (0xFFFFFDFE & 0x7ECF);
        y.lIIlIIlIll[36] = 0xB1 ^ 0xBC;
        y.lIIlIIlIll[37] = -(0xFFFFD36B & 0x3F95) & (0xFFFFF33F & 0x7FDF);
        y.lIIlIIlIll[38] = 0xFFFFAD7D & 0x5A92;
        y.lIIlIIlIll[39] = 0x1F ^ 0x56 ^ (0xEB ^ 0xAC);
        y.lIIlIIlIll[40] = 0xFFFFFB3E & 0x64DF;
        y.lIIlIIlIll[41] = -(0xFFFFB7BF & 0x7FCD) & (0xFFFFFFDE & 0x3FBF);
        y.lIIlIIlIll[42] = 0x9D ^ 0x92;
        y.lIIlIIlIll[43] = -(0xFFFF8F5F & 0x7DA3) & (0xFFFFFFFF & 0x6D1F);
        y.lIIlIIlIll[44] = -(0xFFFFB7E3 & 0x7F9D) & (0xFFFFBF9F & 0x7FF4);
        y.lIIlIIlIll[45] = 47 + 70 - 89 + 102 ^ 46 + 99 - 110 + 111;
        y.lIIlIIlIll[46] = -(0xFFFFD6DF & 0x3DBE) & (0xFFFFF6FF & 0x7DBF);
        y.lIIlIIlIll[47] = -(0xFFFFB5DF & 0x7FEA) & (0xFFFFFDFF & 0x3FDF);
        y.lIIlIIlIll[48] = 117 + 101 - 96 + 23 ^ 77 + 59 - 25 + 17;
        y.lIIlIIlIll[49] = -(0xFFFFC3BD & 0x3F4B) & (0xFFFFF3FF & 0x6F29);
        y.lIIlIIlIll[50] = -(0xFFFFF5EE & 0x5FD5) & (0xFFFFFDDF & 0x5FFB);
        y.lIIlIIlIll[51] = 0xD6 ^ 0xC4;
        y.lIIlIIlIll[52] = 0xFFFFFAFF & 0x6523;
        y.lIIlIIlIll[53] = 0xFFFFA81E & 0x5FFB;
        y.lIIlIIlIll[54] = 0 ^ 9 ^ (0x8D ^ 0x97);
        y.lIIlIIlIll[55] = -(0xFFFFAFDE & 0x5EFD) & (0xFFFFFFFF & 0x6EFF);
        y.lIIlIIlIll[56] = -(0xFFFF87D9 & 0x7DE7) & (0xFFFFAFFC & 0x5DDF);
        y.lIIlIIlIll[57] = 0x54 ^ 0x35 ^ (0xF9 ^ 0x8C);
        y.lIIlIIlIll[58] = 0x7D ^ 0x2D ^ (0x4D ^ 8);
        y.lIIlIIlIll[59] = 0x8C ^ 0x9A;
        y.lIIlIIlIll[60] = 0x19 ^ 0xE;
        y.lIIlIIlIll[61] = 0x93 ^ 0x8F;
        y.lIIlIIlIll[62] = 2 ^ 6 ^ (0xBC ^ 0xA0);
        y.lIIlIIlIll[63] = 0x86 ^ 0x9F;
        y.lIIlIIlIll[64] = 57 + 111 - 55 + 78 ^ 138 + 9 - 103 + 121;
        y.lIIlIIlIll[65] = -(0xFFFFD5F2 & 0x6B3F) & (0xFFFFFFFD & 0x6FFF);
        y.lIIlIIlIll[66] = -(0xFFFFDF37 & 0x3EDF) & (0xFFFFFFFE & 0x7FBF);
        y.lIIlIIlIll[67] = 0xFFFFE38E & 0x1FF5;
        y.lIIlIIlIll[68] = 3 ^ 0x67;
        y.lIIlIIlIll[69] = 9 + 128 - 76 + 108 ^ 94 + 73 - 18 + 29;
        y.lIIlIIlIll[70] = 0xE9 ^ 0xC5 ^ (0x20 ^ 0x11);
        y.lIIlIIlIll[71] = 27 + 116 - 123 + 133 ^ 48 + 131 - 132 + 88;
        y.lIIlIIlIll[72] = 0x73 ^ 0x2D ^ (0x41 ^ 0);
        y.lIIlIIlIll[73] = 86 + 145 - 84 + 12 ^ 155 + 37 - 108 + 107;
        y.lIIlIIlIll[74] = 154 + 154 - 238 + 104 ^ 50 + 69 - 60 + 84;
        y.lIIlIIlIll[75] = 0x88 ^ 0x9A ^ (0x2A ^ 0x1A);
        y.lIIlIIlIll[76] = 0xB0 ^ 0x93;
        y.lIIlIIlIll[77] = 0x9E ^ 0xB1 ^ (0x3D ^ 0x36);
        y.lIIlIIlIll[78] = 0x43 ^ 0x66;
        y.lIIlIIlIll[79] = 6 + 46 - -64 + 20 ^ 120 + 83 - 106 + 77;
        y.lIIlIIlIll[80] = 0xA3 ^ 0x84;
        y.lIIlIIlIll[81] = 51 + 21 - 65 + 137 ^ 142 + 35 - 43 + 51;
        y.lIIlIIlIll[82] = 0x9F ^ 0xB5;
        y.lIIlIIlIll[83] = 0xD2 ^ 0x81 ^ (0x2D ^ 0x55);
        y.lIIlIIlIll[84] = 0x61 ^ 0x4D;
        y.lIIlIIlIll[85] = 0xA6 ^ 0x8B;
        y.lIIlIIlIll[86] = 0xBC ^ 0x98 ^ (0x72 ^ 0x78);
        y.lIIlIIlIll[87] = 0x2C ^ 0x49 ^ (0x8B ^ 0xC1);
        y.lIIlIIlIll[88] = 0xB1 ^ 0x81;
        y.lIIlIIlIll[89] = 0x51 ^ 0x3A ^ (0x3D ^ 0x67);
        y.lIIlIIlIll[90] = 0x16 ^ 0x25;
        y.lIIlIIlIll[91] = 28 + 110 - 31 + 72 ^ 5 + 2 - -57 + 71;
        y.lIIlIIlIll[92] = 0x8B ^ 0xBE;
        y.lIIlIIlIll[93] = 0xD ^ 0x2B ^ (0x12 ^ 2);
        y.lIIlIIlIll[94] = 0x8C ^ 0xBB;
        y.lIIlIIlIll[95] = 0xE9 ^ 0x9D ^ (0x8F ^ 0xC3);
        y.lIIlIIlIll[96] = 0xFA ^ 0xB1 ^ (0x5E ^ 0x2C);
        y.lIIlIIlIll[97] = 0x68 ^ 0x22 ^ (0xEE ^ 0x9E);
        y.lIIlIIlIll[98] = 67 + 156 - 83 + 49 ^ 34 + 34 - 5 + 71;
        y.lIIlIIlIll[99] = 0x55 ^ 0x69;
        y.lIIlIIlIll[100] = 0x89 ^ 0xB4;
        y.lIIlIIlIll[101] = 0x80 ^ 0xBE;
        y.lIIlIIlIll[102] = 0x9F ^ 0xBE ^ (0xA3 ^ 0xBD);
        y.lIIlIIlIll[103] = 0x3E ^ 0x7E;
        y.lIIlIIlIll[104] = 0x61 ^ 0x11 ^ (0x88 ^ 0xB9);
        y.lIIlIIlIll[105] = 0x43 ^ 1;
        y.lIIlIIlIll[106] = 0x30 ^ 0x77 ^ (0x96 ^ 0x92);
        y.lIIlIIlIll[107] = 114 + 84 - 149 + 82 ^ 120 + 147 - 189 + 121;
        y.lIIlIIlIll[108] = 0xCA ^ 0x8F;
        y.lIIlIIlIll[109] = 3 ^ 0x60 ^ (0xD ^ 0x28);
        y.lIIlIIlIll[110] = 0x6B ^ 0x2C;
        y.lIIlIIlIll[111] = 0x7B ^ 0x33;
        y.lIIlIIlIll[112] = 0x8B ^ 0xC2;
        y.lIIlIIlIll[113] = 0x5B ^ 0x11;
        y.lIIlIIlIll[114] = 128 + 7 - 0 + 87 ^ 135 + 108 - 147 + 53;
        y.lIIlIIlIll[115] = 0x91 ^ 0xA1 ^ (0xBD ^ 0xC1);
        y.lIIlIIlIll[116] = 76 + 48 - 101 + 104 ^ (0x10 ^ 0x22);
        y.lIIlIIlIll[117] = 0x11 ^ 0x5F;
        y.lIIlIIlIll[118] = 0x31 ^ 0x7E;
        y.lIIlIIlIll[119] = 114 + 123 - 229 + 206 ^ 111 + 78 - 182 + 127;
        y.lIIlIIlIll[120] = 0x6A ^ 0x34 ^ (0xCC ^ 0xC3);
        y.lIIlIIlIll[121] = 0x68 ^ 0x3A;
        y.lIIlIIlIll[122] = 0x7E ^ 0x2D;
        y.lIIlIIlIll[123] = 63 + 32 - 0 + 54 ^ 57 + 187 - 167 + 116;
        y.lIIlIIlIll[124] = 0x1F ^ 0x4A;
        y.lIIlIIlIll[125] = 0x96 ^ 0xC0;
        y.lIIlIIlIll[126] = 0x9C ^ 0xB6 ^ (0x7C ^ 1);
        y.lIIlIIlIll[127] = 0xED ^ 0x8E ^ (0x3B ^ 0);
        y.lIIlIIlIll[128] = 3 ^ 0x5A;
        y.lIIlIIlIll[129] = 0x40 ^ 0x59 ^ (0x36 ^ 0x75);
        y.lIIlIIlIll[130] = 55 + 180 - 153 + 121 ^ 138 + 51 - 164 + 119;
        y.lIIlIIlIll[131] = 0x2B ^ 0x77;
        y.lIIlIIlIll[132] = 0x2D ^ 0x10 ^ (0x36 ^ 0x56);
        y.lIIlIIlIll[133] = 0x13 ^ 0x4D;
        y.lIIlIIlIll[134] = 0x19 ^ 0x46;
        y.lIIlIIlIll[135] = 0x3D ^ 0x5D;
        y.lIIlIIlIll[136] = 69 + 10 - 52 + 173 ^ 35 + 3 - -86 + 45;
        y.lIIlIIlIll[137] = 58 + 138 - 120 + 161 ^ 39 + 33 - -48 + 23;
        y.lIIlIIlIll[138] = 0x56 ^ 3 ^ (0x17 ^ 0x21);
        y.lIIlIIlIll[139] = 0xF4 ^ 0x91;
        y.lIIlIIlIll[140] = 3 ^ (0x51 ^ 0x34);
        y.lIIlIIlIll[141] = 0xF4 ^ 0xB6 ^ (0x83 ^ 0xA6);
        y.lIIlIIlIll[142] = 38 + 114 - 148 + 170 ^ 17 + 20 - -114 + 47;
        y.lIIlIIlIll[143] = 0x61 ^ 0x65 ^ (0x4F ^ 0x22);
        y.lIIlIIlIll[144] = 114 + 65 - -14 + 17 ^ 179 + 81 - 159 + 83;
        y.lIIlIIlIll[145] = 0x31 ^ 0x1B ^ (0x2E ^ 0x6F);
        y.lIIlIIlIll[146] = 112 + 117 - 226 + 124 ^ (0x8A ^ 0x99);
        y.lIIlIIlIll[147] = 0x3B ^ 0x56;
        y.lIIlIIlIll[148] = 0xEB ^ 0x8A ^ (0xB3 ^ 0xBC);
        y.lIIlIIlIll[149] = 0x31 ^ 0x5E;
        y.lIIlIIlIll[150] = 0x30 ^ 0x40;
        y.lIIlIIlIll[151] = 0xFFFF8FFE & 0x7CBB;
        y.lIIlIIlIll[152] = -(0xFFFFDBAA & 0x74D7) & (0xFFFFFDFD & 0x5FFF);
        y.lIIlIIlIll[153] = 0xFFFFC7FF & 0x3EDE;
        y.lIIlIIlIll[154] = 0xFFFF937B & 0x7FDF;
        y.lIIlIIlIll[155] = 0xFFFFEFFD & 0x16DF;
        y.lIIlIIlIll[156] = -(0xFFFFEDF5 & 0x7E8F) & (0xFFFFFFCF & Short.MAX_VALUE);
        y.lIIlIIlIll[157] = 0xFFFFC7F9 & 0x3EF7;
        y.lIIlIIlIll[158] = 0xFFFFB37F & 0x5FDF;
        y.lIIlIIlIll[159] = 0xFFFFDEFC & 0x27EF;
        y.lIIlIIlIll[160] = 0xFFFF97FF & 0x7B71;
        y.lIIlIIlIll[161] = -(0xFFFFF577 & 0x7BAE) & (0xFFFFF7F7 & Short.MAX_VALUE);
        y.lIIlIIlIll[162] = -(0xFFFFFCAB & 0xF5F) & (0xFFFFBF7F & 0x5FFA);
        y.lIIlIIlIll[163] = -(0xFFFFFD8F & 0x3A71) & (0xFFFFFECE & 0x3FFF);
        y.lIIlIIlIll[164] = -(0xFFFFDCBF & 0x6FD3) & (0xFFFFFFF7 & 0x5FFA);
        y.lIIlIIlIll[165] = 5 ^ 0x74;
        y.lIIlIIlIll[166] = -(0xFFFFFAF3 & 0x5F1E) & (0xFFFFFFDF & 0x5EBF);
        y.lIIlIIlIll[167] = 0xFFFFFDBA & 0xF7D;
        y.lIIlIIlIll[168] = 0xFFFF9717 & 0x6BFB;
        y.lIIlIIlIll[169] = 0xFFFF9EF7 & 0x63BF;
        y.lIIlIIlIll[170] = 0x7B ^ 0x71 ^ (0x54 ^ 0x2C);
    }

    private static boolean lllllIIllIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int T() {
        try {
            y.bk();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIlIIlIll[68];
    }

    private static void af() {
        d lIllll;
        Predicate<Item> llIIII;
        int[] nArray = new int[lIIlIIlIll[2]];
        nArray[y.lIIlIIlIll[1]] = lIIlIIlIll[8];
        if (y.lllllIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIlIIlIll[8], lIIlIIlIll[10], i.bq);
            bv.add(d2);
            0;
        }
        if (y.lllllIIlIlII(Bank.contains(llIIII = item -> item.getName().toLowerCase().contains(lIIlIIlIIl[lIIlIIlIll[61]])) ? 1 : 0)) {
            lIllll = new d(lIIlIIlIll[65], lIIlIIlIll[10], lIIlIIlIll[66]);
            bv.add(lIllll);
            0;
        }
        int[] nArray2 = new int[lIIlIIlIll[2]];
        nArray2[y.lIIlIIlIll[1]] = lIIlIIlIll[7];
        if (y.lllllIIlIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIllll = new d(lIIlIIlIll[7], lIIlIIlIll[11], lIIlIIlIll[67]);
            bv.add(lIllll);
            0;
        }
    }

    private static boolean lllllIIllIlI(Object object) {
        return object == null;
    }

    private static String lllllIIIIlII(String llIII, String lIlll) {
        try {
            SecretKeySpec llIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlll.getBytes(StandardCharsets.UTF_8)), lIIlIIlIll[13]), "DES");
            Cipher llIlI = Cipher.getInstance("DES");
            llIlI.init(lIIlIIlIll[6], llIll);
            return new String(llIlI.doFinal(Base64.getDecoder().decode(llIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIl) {
            llIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIllIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void bl() {
        void lllIII;
        Widget widget2 = Widgets.get((int)lIIlIIlIll[19], (int)lIIlIIlIll[61]);
        if (y.lllllIIllIlI(widget2)) {
            System.out.println(lIIlIIlIIl[lIIlIIlIll[62]]);
            return;
        }
        if (y.lllllIIlIlIl(lllIII)) {
            System.out.println(lllIII.getText());
        }
        int llIlll = lIIlIIlIll[1];
        while (y.lllllIIlIIll(llIlll, h.values().length)) {
            if (y.lllllIIlIIlI(lllIII.getText().equalsIgnoreCase(h.values()[llIlll].O()) ? 1 : 0)) {
                System.out.println("answer: " + h.values()[llIlll].P());
                int llIllI = llIlll;
                Widget llIlIl = Widgets.get((int)lIIlIIlIll[19], widget -> widget.getText().strip().contains(h.values()[llIllI].P()));
                if (y.lllllIIlIlIl(llIlIl)) {
                    System.out.println(lIIlIIlIIl[lIIlIIlIll[63]]);
                    Mouse.click((int)llIlIl.getClickPoint().getX(), (int)llIlIl.getClickPoint().getY(), (boolean)lIIlIIlIll[2]);
                    Time.sleepTicks((int)lIIlIIlIll[6]);
                    0;
                    0;
                    if (-1 <= ((0xCF ^ 0xA9 ^ (0xFE ^ 0xA6)) & (0xA1 ^ 0xC6 ^ (0xC1 ^ 0x98) ^ -1))) break;
                    return;
                }
            }
            ++llIlll;
            0;
            if (-(126 + 68 - 147 + 136 ^ 49 + 17 - -38 + 75) <= 0) continue;
            return;
        }
    }

    private static void p(int n2) {
        if (!y.lllllIIlIlII(Widgets.get((int)lIIlIIlIll[19]).isEmpty() ? 1 : 0) || y.lllllIIllIlI(Widgets.get((int)lIIlIIlIll[19]))) {
            int llIIll;
            int[] nArray = new int[lIIlIIlIll[2]];
            nArray[y.lIIlIIlIll[1]] = llIIll;
            if (y.lllllIIlIlIl(TileObjects.getNearest((int[])nArray))) {
                int[] nArray2 = new int[lIIlIIlIll[2]];
                nArray2[y.lIIlIIlIll[1]] = llIIll;
                TileObjects.getNearest((int[])nArray2).interact(lIIlIIlIIl[lIIlIIlIll[64]]);
                Time.sleepTicks((int)lIIlIIlIll[6]);
                0;
            }
        }
    }
}

