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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GameEnum;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
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
public class YHelper
implements G {
    public static final  String ek;
    public static final  String er;
    public static final  int dz;
    public static final  String eJ;
    public static final  String dX;
    public static final  int dq;
    static  boolean cl;
    public static final  String ej;
    public static final  String em;
    public static final  String fo;
    public static final  String fb;
    public static final  String eW;
    public static final  String eo;
    public static  WorldArea bS;
    public static final  int dB;
    public static final  String dW;
    public static final  String fd;
    public static final  String eZ;
    public static final  String eG;
    public static final  String eU;
    public static final  String eX;
    public static final  int dA;
    public static final  String fa;
    public static final  String dM;
    public static final  int dw;
    public static final  String el;
    public static final  String ef;
    public static final  String eS;
    static  int ck;
    public static final  String eb;
    public static  String[] fp;
    public static final  String en;
    public static final  String eD;
    public static final  String eB;
    public static final  String ex;
    public static final  String ep;
    public static final  WorldPoint dI;
    public static final  String dO;
    public static final  String eN;
    public static final  String es;
    public static final  String fe;
    public static final  String eg;
    public static final  String fm;
    public static final  String dN;
    public static final  String fl;
    public static final  String ec;
    public static  List<d> bv;
    public static final  String ey;
    public static final  int dn;
    public static final  String dQ;
    public static final  String eL;
    public static final  int do;
    public static final  String dT;
    public static final  WorldPoint dE;
    public static final  String ev;
    public static final  String et;
    public static final  String eY;
    public static final  String fk;
    public static final  WorldPoint dC;
    public static final  int dl;
    public static final  String dZ;
    public static final  int dx;
    public static final  int dv;
    public static final  int dp;
    public static final  int dr;
    public static final  String ed;
    public static final  String ez;
    public static final  String dP;
    public static final  String ew;
    public static final  String ea;
    public static final  String fn;
    public static final  String eu;
    public static final  String eh;
    public static final  String eC;
    public static final  String dS;
    public static  boolean bt;
    public static final  String fj;
    public static final  WorldPoint dH;
    public static final  String dU;
    public static final  String eV;
    public static final  String eR;
    public static final  String eA;
    public static final  String eE;
    public static final  String fg;
    public static final  String eK;
    public static final  String dV;
    public static final  String ei;
    public static final  String dJ;
    public static final  String dL;
    public static final  int du;
    public static final  String eF;
    public static final  String dR;
    public static final  String eO;
    public static final  WorldPoint dF;
    public static final  String eT;
    public static final  String eQ;
    public static final  String eM;
    public static final  int dm;
    public static final  String fi;
    public static final  String ff;
    public static final  String dK;
    public static final  String fc;
    public static final  String eq;
    public static final  int ds;
    public static final  String eI;
    
    public static final  String fh;
    public static final  String dY;
    public static final  String eP;
    public static final  WorldPoint dD;
    public static final  WorldPoint dG;
    public static final  int dy;
    public static final  int dt;
    public static final  String ee;
    
    public static final  String eH;

    private static boolean lllllIIlIlII(int n2) {
        return n2 == 0;
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
        y.lIIlIIlIIl[y.lIIlIIlIll[1]] = "Drink";
        y.lIIlIIlIIl[y.lIIlIIlIll[2]] = "Finished buying items, switching back to quest";
        y.lIIlIIlIIl[y.lIIlIIlIll[6]] = "We are missing quest supplies, switching to BUYING";
        y.lIIlIIlIIl[y.lIIlIIlIll[12]] = "Break";
        y.lIIlIIlIIl[y.lIIlIIlIll[5]] = "Nav to start";
        y.lIIlIIlIIl[y.lIIlIIlIll[10]] = "Orlando Smith";
        y.lIIlIIlIIl[y.lIIlIIlIll[16]] = "Solving terror bird";
        y.lIIlIIlIIl[y.lIIlIIlIll[21]] = "Solving kalphite";
        y.lIIlIIlIIl[y.lIIlIIlIll[13]] = "Solving Monkey";
        y.lIIlIIlIIl[y.lIIlIIlIll[17]] = "Solving sea slug";
        y.lIIlIIlIIl[y.lIIlIIlIll[9]] = "Solving snake";
        y.lIIlIIlIIl[y.lIIlIIlIll[30]] = "Solving east snail";
        y.lIIlIIlIIl[y.lIIlIIlIll[33]] = "Solving wyvern";
        y.lIIlIIlIIl[y.lIIlIIlIll[36]] = "Solving dragon";
        y.lIIlIIlIIl[y.lIIlIIlIll[39]] = "Solving tort";
        y.lIIlIIlIIl[y.lIIlIIlIll[42]] = "Solving croc";
        y.lIIlIIlIIl[y.lIIlIIlIll[45]] = "Solving leech";
        y.lIIlIIlIIl[y.lIIlIIlIll[48]] = "Solving camel";
        y.lIIlIIlIIl[y.lIIlIIlIll[51]] = "Solving mole";
        y.lIIlIIlIIl[y.lIIlIIlIll[54]] = "Solving leech";
        y.lIIlIIlIIl[y.lIIlIIlIll[57]] = "Handing in quest";
        y.lIIlIIlIIl[y.lIIlIIlIll[58]] = "Nav to start";
        y.lIIlIIlIIl[y.lIIlIIlIll[59]] = "Talking";
        y.lIIlIIlIIl[y.lIIlIIlIll[60]] = "Orlando Smith";
        y.lIIlIIlIIl[y.lIIlIIlIll[62]] = "null question";
        y.lIIlIIlIIl[y.lIIlIIlIll[63]] = "Found answer";
        y.lIIlIIlIIl[y.lIIlIIlIll[64]] = "Study";
        y.lIIlIIlIIl[y.lIIlIIlIll[69]] = "Varrock Quiz";
        y.lIIlIIlIIl[y.lIIlIIlIll[61]] = "ring of wealth (";
        y.lIIlIIlIIl[y.lIIlIIlIll[70]] = "Old battle sites";
        y.lIIlIIlIIl[y.lIIlIIlIll[71]] = "Three";
        y.lIIlIIlIIl[y.lIIlIIlIll[72]] = "Vegetables";
        y.lIIlIIlIIl[y.lIIlIIlIll[73]] = "The researchers";
        y.lIIlIIlIIl[y.lIIlIIlIll[74]] = "Sight";
        y.lIIlIIlIIl[y.lIIlIIlIll[75]] = "A labour";
        y.lIIlIIlIIl[y.lIIlIIlIll[76]] = "Gnomes";
        y.lIIlIIlIIl[y.lIIlIIlIll[77]] = "Nematocysts";
        y.lIIlIIlIIl[y.lIIlIIlIll[78]] = "They attack by jumping";
        y.lIIlIIlIIl[y.lIIlIIlIll[79]] = "They dig holes";
        y.lIIlIIlIIl[y.lIIlIIlIll[80]] = "Anywhere";
        y.lIIlIIlIIl[y.lIIlIIlIll[11]] = "It becomes sleepy";
        y.lIIlIIlIIl[y.lIIlIIlIll[81]] = "0";
        y.lIIlIIlIIl[y.lIIlIIlIll[82]] = "Planning";
        y.lIIlIIlIIl[y.lIIlIIlIll[83]] = "Gnomes";
        y.lIIlIIlIIl[y.lIIlIIlIll[84]] = "During breeding";
        y.lIIlIIlIIl[y.lIIlIIlIll[85]] = "Sunlight";
        y.lIIlIIlIIl[y.lIIlIIlIll[86]] = "Harmless";
        y.lIIlIIlIIl[y.lIIlIIlIll[87]] = "Two";
        y.lIIlIIlIIl[y.lIIlIIlIll[88]] = "Cold";
        y.lIIlIIlIIl[y.lIIlIIlIll[89]] = "Contracting and stretching";
        y.lIIlIIlIIl[y.lIIlIIlIll[0]] = "Subterranean";
        y.lIIlIIlIIl[y.lIIlIIlIll[90]] = "Anti-dragon-breath shield";
        y.lIIlIIlIIl[y.lIIlIIlIll[91]] = "'Y'-shaped";
        y.lIIlIIlIIl[y.lIIlIIlIll[92]] = "It is resistant to acid";
        y.lIIlIIlIIl[y.lIIlIIlIll[93]] = "They have";
        y.lIIlIIlIIl[y.lIIlIIlIll[94]] = "Stones";
        y.lIIlIIlIIl[y.lIIlIIlIll[95]] = "Reptiles";
        y.lIIlIIlIIl[y.lIIlIIlIll[96]] = "Scabaras";
        y.lIIlIIlIIl[y.lIIlIIlIll[97]] = "Worker";
        y.lIIlIIlIIl[y.lIIlIIlIll[98]] = "Water";
        y.lIIlIIlIIl[y.lIIlIIlIll[99]] = "Mibbiwocket";
        y.lIIlIIlIIl[y.lIIlIIlIll[100]] = "Hair";
        y.lIIlIIlIIl[y.lIIlIIlIll[101]] = "A layer of fat";
        y.lIIlIIlIIl[y.lIIlIIlIll[102]] = "Simian";
        y.lIIlIIlIIl[y.lIIlIIlIll[103]] = "Elemental";
        y.lIIlIIlIIl[y.lIIlIIlIll[104]] = "Unknown";
        y.lIIlIIlIIl[y.lIIlIIlIll[105]] = "Eating plants";
        y.lIIlIIlIIl[y.lIIlIIlIll[106]] = "Dragons";
        y.lIIlIIlIIl[y.lIIlIIlIll[107]] = "Climate change";
        y.lIIlIIlIIl[y.lIIlIIlIll[108]] = "Omnivore";
        y.lIIlIIlIIl[y.lIIlIIlIll[109]] = "Milk";
        y.lIIlIIlIIl[y.lIIlIIlIll[110]] = "Twelve";
        y.lIIlIIlIIl[y.lIIlIIlIll[111]] = "It doubles in size";
        y.lIIlIIlIIl[y.lIIlIIlIll[112]] = "Hard shell";
        y.lIIlIIlIIl[y.lIIlIIlIll[113]] = "Apples";
        y.lIIlIIlIIl[y.lIIlIIlIll[114]] = "Twenty years";
        y.lIIlIIlIIl[y.lIIlIIlIll[115]] = "Scarab beetles";
        y.lIIlIIlIIl[y.lIIlIIlIll[116]] = "Bitternuts";
        y.lIIlIIlIIl[y.lIIlIIlIll[117]] = "Tongue";
        y.lIIlIIlIIl[y.lIIlIIlIll[118]] = "Two";
        y.lIIlIIlIIl[y.lIIlIIlIll[119]] = "Toxic dung";
        y.lIIlIIlIIl[y.lIIlIIlIll[120]] = "Lamellae";
        y.lIIlIIlIIl[y.lIIlIIlIll[121]] = "Squamata";
        y.lIIlIIlIIl[y.lIIlIIlIll[122]] = "Asgarnia";
        y.lIIlIIlIIl[y.lIIlIIlIll[123]] = "Runite";
        y.lIIlIIlIIl[y.lIIlIIlIll[124]] = "Al Kharid";
        y.lIIlIIlIIl[y.lIIlIIlIll[125]] = "Anything";
        y.lIIlIIlIIl[y.lIIlIIlIll[126]] = "Seaweed";
        y.lIIlIIlIIl[y.lIIlIIlIll[127]] = "Spitting acid";
        y.lIIlIIlIIl[y.lIIlIIlIll[128]] = "Ardougne";
        y.lIIlIIlIIl[y.lIIlIIlIll[129]] = "Four";
        y.lIIlIIlIIl[y.lIIlIIlIll[130]] = "Orlando Smith";
        y.lIIlIIlIIl[y.lIIlIIlIll[131]] = "Acid-spitting snail";
        y.lIIlIIlIIl[y.lIIlIIlIll[132]] = "Seeing how you smell";
        y.lIIlIIlIIl[y.lIIlIIlIll[133]] = "Squamata";
        y.lIIlIIlIIl[y.lIIlIIlIll[134]] = "Wyson the Gardener";
        y.lIIlIIlIIl[y.lIIlIIlIll[135]] = "Red";
        y.lIIlIIlIIl[y.lIIlIIlIll[136]] = "Annoyed";
        y.lIIlIIlIIl[y.lIIlIIlIll[137]] = "Defence";
        y.lIIlIIlIIl[y.lIIlIIlIll[138]] = "Insects and other invertebrates";
        y.lIIlIIlIIl[y.lIIlIIlIll[68]] = "The Talpidae family";
        y.lIIlIIlIIl[y.lIIlIIlIll[139]] = "Seaweed";
        y.lIIlIIlIIl[y.lIIlIIlIll[140]] = "Admiral Bake";
        y.lIIlIIlIIl[y.lIIlIIlIll[141]] = "Below room temperature";
        y.lIIlIIlIIl[y.lIIlIIlIll[142]] = "Pasha";
        y.lIIlIIlIIl[y.lIIlIIlIll[143]] = "An operculum";
        y.lIIlIIlIIl[y.lIIlIIlIll[144]] = "Carnivores";
        y.lIIlIIlIIl[y.lIIlIIlIll[145]] = "Environment";
        y.lIIlIIlIIl[y.lIIlIIlIll[146]] = "Fireproof oil";
        y.lIIlIIlIIl[y.lIIlIIlIll[147]] = "Stomach acid";
        y.lIIlIIlIIl[y.lIIlIIlIll[148]] = "Social";
        y.lIIlIIlIIl[y.lIIlIIlIll[149]] = "Constriction";
        y.lIIlIIlIIl[y.lIIlIIlIll[150]] = "The Slayer Masters";
        y.lIIlIIlIIl[y.lIIlIIlIll[165]] = "Sure thing.";
    }

    private static boolean lllllIIlIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (y.lllllIIllIll(e.j(lIIlIIlIll[14]), lIIlIIlIll[56]) && y.lllllIIllIll(Skills.getLevel((Skill)Skill.HUNTER), lIIlIIlIll[17])) {
            n2 = lIIlIIlIll[2];

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

                    }
                    if (y.lllllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (y.lllllIIlIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIIlIll[5]);

                        }
                        if (y.lllllIIlIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIIlIll[6]);

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

                        }
                    }
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[5]];
                    Movement.walkTo((WorldPoint)dD);

                    Time.sleepTicks((int)lIIlIIlIll[2]);

                }
                if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dD), lIIlIIlIll[13])) {
                    g.a(lIIlIIlIIl[lIIlIIlIll[10]], fp);
                    Time.sleepTicks((int)lIIlIIlIll[2]);

                }
            }
            if (y.lllllIIlIllI(e.j(lIIlIIlIll[3]))) {
                if (y.lllllIIllIIl(e.j(lIIlIIlIll[14]), lIIlIIlIll[15])) {
                    AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[16]];
                    if (y.lllllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(dE), lIIlIIlIll[17])) {
                        Movement.walkTo((WorldPoint)dE);

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

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

                        Time.sleepTicks((int)lIIlIIlIll[2]);

                    }
                    if (y.lllllIIllIII(Players.getLocal().getWorldLocation().distanceTo(dD), lIIlIIlIll[13])) {
                        AccBuilderRogues.c = lIIlIIlIIl[lIIlIIlIll[59]];
                        g.a(lIIlIIlIIl[lIIlIIlIll[60]], fp);
                        Time.sleepTicks((int)lIIlIIlIll[2]);

                    }
                }
            }
            System.out.println(e.j(lIIlIIlIll[14]));
        }
    }

    private static boolean lllllIIllIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int T() {
        try {
            y.bk();

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
            d d2 = new DHelper(lIIlIIlIll[8], lIIlIIlIll[10], i.bq);
            bv.add(d2);

        }
        if (y.lllllIIlIlII(Bank.contains(llIIII = item -> item.getName().toLowerCase().contains(lIIlIIlIIl[lIIlIIlIll[61]])) ? 1 : 0)) {
            lIllll = new DHelper(lIIlIIlIll[65], lIIlIIlIll[10], lIIlIIlIll[66]);
            bv.add(lIllll);

        }
        int[] nArray2 = new int[lIIlIIlIll[2]];
        nArray2[y.lIIlIIlIll[1]] = lIIlIIlIll[7];
        if (y.lllllIIlIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIllll = new DHelper(lIIlIIlIll[7], lIIlIIlIll[11], lIIlIIlIll[67]);
            bv.add(lIllll);

        }
    }

    private static boolean lllllIIllIlI(Object object) {
        return object == null;
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

                    if (-1 <= ((0xCF ^ 0xA9 ^ (0xFE ^ 0xA6)) & (0xA1 ^ 0xC6 ^ (0xC1 ^ 0x98) ^ -1))) break;
                    return;
                }
            }
            ++llIlll;

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

            }
        }
    }
}

