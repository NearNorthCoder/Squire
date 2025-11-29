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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.i;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
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

public class B
implements K {
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
    public static /* synthetic */ List<d> bp;
    public static final /* synthetic */ String fF;
    public static final /* synthetic */ String fX;
    public static final /* synthetic */ String fD;
    public static final /* synthetic */ String ff;
    public static final /* synthetic */ String fo;
    public static final /* synthetic */ int ee;

    private static boolean lIIllIlllllII(Object object) {
        return object != null;
    }

    private static boolean lIIllIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void q(int n2) {
        if (!B.lIIllIllllIll(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIlllIIIIIIl(Widgets.get((int)lIlllIIIlI[19]))) {
            int var21;
            int[] nArray = new int[lIlllIIIlI[2]];
            nArray[B.lIlllIIIlI[1]] = var21;
            if (B.lIIllIlllllII(TileObjects.getNearest((int[])nArray))) {
                int[] nArray2 = new int[lIlllIIIlI[2]];
                nArray2[B.lIlllIIIlI[1]] = var21;
                TileObjects.getNearest((int[])nArray2).interact(lIlllIIIII[lIlllIIIlI[64]]);
                Time.sleepTicks((int)lIlllIIIlI[6]);
                0;
            }
        }
    }

    private static boolean lIIlllIIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean af() {
        int n2;
        if (B.lIIlllIIIIIlI(e.j(lIlllIIIlI[14]), lIlllIIIlI[56]) && B.lIIlllIIIIIlI(Skills.getLevel((Skill)Skill.HUNTER), lIlllIIIlI[17])) {
            n2 = lIlllIIIlI[2];
            0;
            if (-3 > 0) {
                return false;
            }
        } else {
            n2 = lIlllIIIlI[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void bJ() {
        void var24;
        Widget widget2 = Widgets.get((int)lIlllIIIlI[19], (int)lIlllIIIlI[61]);
        if (B.lIIlllIIIIIIl(widget2)) {
            System.out.println(lIlllIIIII[lIlllIIIlI[62]]);
            return;
        }
        if (B.lIIllIlllllII(var24)) {
            System.out.println(var24.getText());
        }
        int var1 = lIlllIIIlI[1];
        while (B.lIIllIllllIlI(var1, i.values().length)) {
            if (B.lIIllIllllIIl(var24.getText().equalsIgnoreCase(i.values()[var1].Y()) ? 1 : 0)) {
                System.out.println("answer: " + i.values()[var1].Z());
                int var22 = var1;
                Widget var10 = Widgets.get((int)lIlllIIIlI[19], widget -> widget.getText().strip().contains(i.values()[var22].Z()));
                if (B.lIIllIlllllII(var10)) {
                    System.out.println(lIlllIIIII[lIlllIIIlI[63]]);
                    Mouse.click((int)var10.getClickPoint().getX(), (int)var10.getClickPoint().getY(), (boolean)lIlllIIIlI[2]);
                    Time.sleepTicks((int)lIlllIIIlI[6]);
                    0;
                    0;
                    if (1 < 2) break;
                    return;
                }
            }
            ++var1;
            0;
            if (((0xC0 ^ 0x98 ^ (0x83 ^ 0x88)) & (21 + 41 - 47 + 185 ^ 117 + 5 - 59 + 92 ^ -1)) == 0) continue;
            return;
        }
    }

    private static String lIIllIlllIIIl(String var27, String var16) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var5 = var16.toCharArray();
        int var15 = lIlllIIIlI[1];
        char[] var23 = var27.toCharArray();
        int var20 = var23.length;
        int var14 = lIlllIIIlI[1];
        while (B.lIIllIllllIlI(var14, var20)) {
            char var13 = var23[var14];
            var8.append((char)(var13 ^ var5[var15 % var5.length]));
            0;
            ++var15;
            ++var14;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        if (B.lIIllIlllllIl(Inventory.getCount((int[])f.aU))) {
            int[] nArray = new int[lIlllIIIlI[2]];
            nArray[B.lIlllIIIlI[1]] = lIlllIIIlI[7];
            if (B.lIIllIlllllIl(Inventory.getCount((int[])nArray))) {
                n2 = lIlllIIIlI[2];
                0;
                if (null == null) return n2 != 0;
                return false;
            }
        }
        n2 = lIlllIIIlI[1];
        return n2 != 0;
    }

    private static boolean lIIllIllllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIllIlllIIlI(String var3, String var7) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIlllIIIlI[13]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIlllIIIlI[6], var18);
            return new String(var12.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ac() {
        return lIlllIIIlI[1];
    }

    private static boolean lIIlllIIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllIllllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIlllllIl(int n2) {
        return n2 > 0;
    }

    @Override
    public int ad() {
        try {
            B.bI();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 != 3) {
            return (85 + 53 - 15 + 33 ^ 89 + 112 - 72 + 66) & (0x5E ^ 0x64 ^ (0x70 ^ 0x15) ^ -1);
        }
        return lIlllIIIlI[68];
    }

    static {
        B.lIIllIllllIII();
        B.lIIllIlllIlll();
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
        bp = new ArrayList<d>();
        String[] stringArray = new String[lIlllIIIlI[2]];
        stringArray[B.lIlllIIIlI[1]] = lIlllIIIII[lIlllIIIlI[165]];
        gd = stringArray;
        cz = new WorldArea(lIlllIIIlI[166], lIlllIIIlI[167], lIlllIIIlI[168], lIlllIIIlI[169], lIlllIIIlI[1]);
    }

    @Override
    public String ae() {
        return lIlllIIIII[lIlllIIIlI[69]];
    }

    private static boolean lIIllIllllIll(int n2) {
        return n2 == 0;
    }

    public static void bI() {
        if (B.lIIllIllllIIl(Inventory.contains((int[])f.aU) ? 1 : 0) && B.lIIllIllllIlI(Movement.getRunEnergy(), lIlllIIIlI[0])) {
            Inventory.getFirst((int[])f.aU).interact(lIlllIIIII[lIlllIIIlI[1]]);
            Time.sleepTicks((int)lIlllIIIlI[2]);
            0;
        }
        if (B.lIIllIllllIll(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (B.lIIllIllllIIl(bn ? 1 : 0)) {
            b.a(bp);
            if (B.lIIllIllllIlI(bp.size(), lIlllIIIlI[2])) {
                System.out.println(lIlllIIIII[lIlllIIIlI[2]]);
                bn = lIlllIIIlI[1];
            }
        }
        if (B.lIIllIllllIll(bn ? 1 : 0)) {
            if (B.lIIllIllllIll(B.al() ? 1 : 0) && B.lIIllIllllIlI(e.j(lIlllIIIlI[3]), lIlllIIIlI[2])) {
                BankLocation var11 = BankLocation.getNearest();
                if (B.lIIllIlllllII(var11) && B.lIIllIllllIll(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    a.a(var11);
                }
                if (B.lIIllIlllllII(var11) && B.lIIllIllllIIl(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (B.lIIllIllllIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIIIlI[4]);
                        0;
                    }
                    if (B.lIIllIllllIIl(Bank.isOpen() ? 1 : 0)) {
                        if (B.lIIllIlllllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllIIIlI[5]);
                            0;
                        }
                        if (B.lIIllIlllllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlllIIIlI[6]);
                            0;
                        }
                        int[] nArray = new int[lIlllIIIlI[6]];
                        nArray[B.lIlllIIIlI[1]] = lIlllIIIlI[7];
                        nArray[B.lIlllIIIlI[2]] = lIlllIIIlI[8];
                        if (B.lIIllIllllIll(e.b(nArray) ? 1 : 0)) {
                            B.O();
                            System.out.println(lIlllIIIII[lIlllIIIlI[6]]);
                            bn = lIlllIIIlI[2];
                            return;
                        }
                        int[] nArray2 = new int[lIlllIIIlI[6]];
                        nArray2[B.lIlllIIIlI[1]] = lIlllIIIlI[7];
                        nArray2[B.lIlllIIIlI[2]] = lIlllIIIlI[8];
                        if (B.lIIllIllllIIl(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIlllIIIlI[7], lIlllIIIlI[9]);
                            a.b(f.aU, lIlllIIIlI[10]);
                        }
                    }
                }
            }
            if (B.lIIllIllllIIl(B.al() ? 1 : 0) && B.lIIllIllllIll(e.j(lIlllIIIlI[3]))) {
                if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(er), lIlllIIIlI[11])) {
                    if (B.lIIllIllllIIl(cz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[lIlllIIIlI[2]];
                        nArray[B.lIlllIIIlI[1]] = lIlllIIIlI[7];
                        if (B.lIIllIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray3 = new int[lIlllIIIlI[2]];
                            nArray3[B.lIlllIIIlI[1]] = lIlllIIIlI[7];
                            Inventory.getFirst((int[])nArray3).interact(lIlllIIIII[lIlllIIIlI[12]]);
                            Time.sleepTicks((int)lIlllIIIlI[13]);
                            0;
                        }
                    }
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[5]];
                    Movement.walkTo((WorldPoint)er);
                    0;
                    Time.sleepTicks((int)lIlllIIIlI[2]);
                    0;
                }
                if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(er), lIlllIIIlI[13])) {
                    g.a(lIlllIIIII[lIlllIIIlI[10]], gd);
                    Time.sleepTicks((int)lIlllIIIlI[2]);
                    0;
                }
            }
            if (B.lIIllIlllllIl(e.j(lIlllIIIlI[3]))) {
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[15])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[16]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(es), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)es);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(es), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[18]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[20])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[21]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(es), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)es);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(es), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[22]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[23])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[13]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)et);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[24]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[25])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[17]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)et);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[26]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[27])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[9]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)et);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[28]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[29])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[30]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)et);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(et), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[31]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[32])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[33]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(eu), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)eu);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(eu), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[34]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[35])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[36]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(eu), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)eu);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(eu), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[37]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[38])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[39]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ev), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)ev);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ev), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[40]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[41])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[42]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ev), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)ev);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ev), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[43]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[44])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[45]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)ew);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[46]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[47])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[48]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)ew);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[49]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[50])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[51]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)ew);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[52]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[53])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[54]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)ew);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ew), lIlllIIIlI[17])) {
                        B.q(lIlllIIIlI[55]);
                        if (!B.lIIllIllllIIl(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIllIlllllII(Widgets.get((int)lIlllIIIlI[19]))) {
                            B.bJ();
                        }
                    }
                }
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[56]) && B.lIIllIllllIlI(Skills.getLevel((Skill)Skill.HUNTER), lIlllIIIlI[17])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[57]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(er), lIlllIIIlI[13])) {
                        AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[58]];
                        Movement.walkTo((WorldPoint)er);
                        0;
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(er), lIlllIIIlI[13])) {
                        AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[59]];
                        g.a(lIlllIIIII[lIlllIIIlI[60]], gd);
                        Time.sleepTicks((int)lIlllIIIlI[2]);
                        0;
                    }
                }
            }
            System.out.println(e.j(lIlllIIIlI[14]));
        }
    }

    private static boolean lIIllIlllllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlllIIIIIIl(Object object) {
        return object == null;
    }

    private static void lIIllIlllIlll() {
        lIlllIIIII = new String[lIlllIIIlI[170]];
        B.lIlllIIIII[B.lIlllIIIlI[1]] = B."Drink";
        B.lIlllIIIII[B.lIlllIIIlI[2]] = B."Finished buying items, switching back to quest";
        B.lIlllIIIII[B.lIlllIIIlI[6]] = B."We are missing quest supplies, switching to BUYING";
        B.lIlllIIIII[B.lIlllIIIlI[12]] = B."Break";
        B.lIlllIIIII[B.lIlllIIIlI[5]] = B."Nav to start";
        B.lIlllIIIII[B.lIlllIIIlI[10]] = B."Orlando Smith";
        B.lIlllIIIII[B.lIlllIIIlI[16]] = B."Solving terror bird";
        B.lIlllIIIII[B.lIlllIIIlI[21]] = B."Solving kalphite";
        B.lIlllIIIII[B.lIlllIIIlI[13]] = B."Solving Monkey";
        B.lIlllIIIII[B.lIlllIIIlI[17]] = B."Solving sea slug";
        B.lIlllIIIII[B.lIlllIIIlI[9]] = B."Solving snake";
        B.lIlllIIIII[B.lIlllIIIlI[30]] = B."Solving east snail";
        B.lIlllIIIII[B.lIlllIIIlI[33]] = B."Solving wyvern";
        B.lIlllIIIII[B.lIlllIIIlI[36]] = B."Solving dragon";
        B.lIlllIIIII[B.lIlllIIIlI[39]] = B."Solving tort";
        B.lIlllIIIII[B.lIlllIIIlI[42]] = B."Solving croc";
        B.lIlllIIIII[B.lIlllIIIlI[45]] = B."Solving leech";
        B.lIlllIIIII[B.lIlllIIIlI[48]] = B."Solving camel";
        B.lIlllIIIII[B.lIlllIIIlI[51]] = B."Solving mole";
        B.lIlllIIIII[B.lIlllIIIlI[54]] = B."Solving leech";
        B.lIlllIIIII[B.lIlllIIIlI[57]] = B."Handing in quest";
        B.lIlllIIIII[B.lIlllIIIlI[58]] = B."Nav to start";
        B.lIlllIIIII[B.lIlllIIIlI[59]] = B."Talking";
        B.lIlllIIIII[B.lIlllIIIlI[60]] = B."Orlando Smith";
        B.lIlllIIIII[B.lIlllIIIlI[62]] = B."null question";
        B.lIlllIIIII[B.lIlllIIIlI[63]] = B."Found answer";
        B.lIlllIIIII[B.lIlllIIIlI[64]] = B."Study";
        B.lIlllIIIII[B.lIlllIIIlI[69]] = B."Varrock Quiz";
        B.lIlllIIIII[B.lIlllIIIlI[61]] = B."ring of wealth (";
        B.lIlllIIIII[B.lIlllIIIlI[70]] = B."Squamata";
        B.lIlllIIIII[B.lIlllIIIlI[71]] = B."The Slayer Masters";
        B.lIlllIIIII[B.lIlllIIIlI[72]] = B."Below room temperature";
        B.lIlllIIIII[B.lIlllIIIlI[73]] = B."An operculum";
        B.lIlllIIIII[B.lIlllIIIlI[74]] = B."Worker";
        B.lIlllIIIII[B.lIlllIIIlI[75]] = B."0";
        B.lIlllIIIII[B.lIlllIIIlI[76]] = B."Anti-dragon-breath shield";
        B.lIlllIIIII[B.lIlllIIIlI[77]] = B."Asgarnia";
        B.lIlllIIIII[B.lIlllIIIlI[78]] = B."Water";
        B.lIlllIIIII[B.lIlllIIIlI[79]] = B."Stomach acid";
        B.lIlllIIIII[B.lIlllIIIlI[80]] = B."Carnivores";
        B.lIlllIIIII[B.lIlllIIIlI[11]] = B."Seaweed";
        B.lIlllIIIII[B.lIlllIIIlI[81]] = B."Anything";
        B.lIlllIIIII[B.lIlllIIIlI[82]] = B."Sunlight";
        B.lIlllIIIII[B.lIlllIIIlI[83]] = B."Constriction";
        B.lIlllIIIII[B.lIlllIIIlI[84]] = B."Acid-spitting snail";
        B.lIlllIIIII[B.lIlllIIIlI[85]] = B."Pasha";
        B.lIlllIIIII[B.lIlllIIIlI[86]] = B."Reptiles";
        B.lIlllIIIII[B.lIlllIIIlI[87]] = B."Three";
        B.lIlllIIIII[B.lIlllIIIlI[88]] = B."'Y'-shaped";
        B.lIlllIIIII[B.lIlllIIIlI[89]] = B."Scabaras";
        B.lIlllIIIII[B.lIlllIIIlI[0]] = B."Nematocysts";
        B.lIlllIIIII[B.lIlllIIIlI[90]] = B."It becomes sleepy";
        B.lIlllIIIII[B.lIlllIIIlI[91]] = B."Cold";
        B.lIlllIIIII[B.lIlllIIIlI[92]] = B."The Talpidae family";
        B.lIlllIIIII[B.lIlllIIIlI[93]] = B."Harmless";
        B.lIlllIIIII[B.lIlllIIIlI[94]] = B."Unknown";
        B.lIlllIIIII[B.lIlllIIIlI[95]] = B."Social";
        B.lIlllIIIII[B.lIlllIIIlI[96]] = B."Orlando Smith";
        B.lIlllIIIII[B.lIlllIIIlI[97]] = B."They dig holes";
        B.lIlllIIIII[B.lIlllIIIlI[98]] = B."Sight";
        B.lIlllIIIII[B.lIlllIIIlI[99]] = B."Seeing how you smell";
        B.lIlllIIIII[B.lIlllIIIlI[100]] = B."Toxic dung";
        B.lIlllIIIII[B.lIlllIIIlI[101]] = B."Tongue";
        B.lIlllIIIII[B.lIlllIIIlI[102]] = B."Simian";
        B.lIlllIIIII[B.lIlllIIIlI[103]] = B."Climate change";
        B.lIlllIIIII[B.lIlllIIIlI[104]] = B."Fireproof oil";
        B.lIlllIIIII[B.lIlllIIIlI[105]] = B."Omnivore";
        B.lIlllIIIII[B.lIlllIIIlI[106]] = B."They attack by jumping";
        B.lIlllIIIII[B.lIlllIIIlI[107]] = B."A labour";
        B.lIlllIIIII[B.lIlllIIIlI[108]] = B."Anywhere";
        B.lIlllIIIII[B.lIlllIIIlI[109]] = B."Gnomes";
        B.lIlllIIIII[B.lIlllIIIlI[110]] = B."Red";
        B.lIlllIIIII[B.lIlllIIIlI[111]] = B."Twenty years";
        B.lIlllIIIII[B.lIlllIIIlI[112]] = B."It is resistant to acid";
        B.lIlllIIIII[B.lIlllIIIlI[113]] = B."Hard shell";
        B.lIlllIIIII[B.lIlllIIIlI[114]] = B."Al Kharid";
        B.lIlllIIIII[B.lIlllIIIlI[115]] = B."Ardougne";
        B.lIlllIIIII[B.lIlllIIIlI[116]] = B."Contracting and stretching";
        B.lIlllIIIII[B.lIlllIIIlI[117]] = B."Runite";
        B.lIlllIIIII[B.lIlllIIIlI[118]] = B."Two";
        B.lIlllIIIII[B.lIlllIIIlI[119]] = B."Scarab beetles";
        B.lIlllIIIII[B.lIlllIIIlI[120]] = B."Stones";
        B.lIlllIIIII[B.lIlllIIIlI[121]] = B."Seaweed";
        B.lIlllIIIII[B.lIlllIIIlI[122]] = B."Planning";
        B.lIlllIIIII[B.lIlllIIIlI[123]] = B."Milk";
        B.lIlllIIIII[B.lIlllIIIlI[124]] = B."Environment";
        B.lIlllIIIII[B.lIlllIIIlI[125]] = B."Gnomes";
        B.lIlllIIIII[B.lIlllIIIlI[126]] = B."A layer of fat";
        B.lIlllIIIII[B.lIlllIIIlI[127]] = B."Wyson the Gardener";
        B.lIlllIIIII[B.lIlllIIIlI[128]] = B."Apples";
        B.lIlllIIIII[B.lIlllIIIlI[129]] = B."Lamellae";
        B.lIlllIIIII[B.lIlllIIIlI[130]] = B."Subterranean";
        B.lIlllIIIII[B.lIlllIIIlI[131]] = B."Elemental";
        B.lIlllIIIII[B.lIlllIIIlI[132]] = B."Bitternuts";
        B.lIlllIIIII[B.lIlllIIIlI[133]] = B."The researchers";
        B.lIlllIIIII[B.lIlllIIIlI[134]] = B."Insects and other invertebrates";
        B.lIlllIIIII[B.lIlllIIIlI[135]] = B."Admiral Bake";
        B.lIlllIIIII[B.lIlllIIIlI[136]] = B."Two";
        B.lIlllIIIII[B.lIlllIIIlI[137]] = B."Eating plants";
        B.lIlllIIIII[B.lIlllIIIlI[138]] = B."Four";
        B.lIlllIIIII[B.lIlllIIIlI[68]] = B."Annoyed";
        B.lIlllIIIII[B.lIlllIIIlI[139]] = B."Dragons";
        B.lIlllIIIII[B.lIlllIIIlI[140]] = B."Hair";
        B.lIlllIIIII[B.lIlllIIIlI[141]] = B."Defence";
        B.lIlllIIIII[B.lIlllIIIlI[142]] = B."Squamata";
        B.lIlllIIIII[B.lIlllIIIlI[143]] = B."Old battle sites";
        B.lIlllIIIII[B.lIlllIIIlI[144]] = B."They have";
        B.lIlllIIIII[B.lIlllIIIlI[145]] = B."During breeding";
        B.lIlllIIIII[B.lIlllIIIlI[146]] = B."Twelve";
        B.lIlllIIIII[B.lIlllIIIlI[147]] = B."Mibbiwocket";
        B.lIlllIIIII[B.lIlllIIIlI[148]] = B."Vegetables";
        B.lIlllIIIII[B.lIlllIIIlI[149]] = B."Spitting acid";
        B.lIlllIIIII[B.lIlllIIIlI[150]] = B."It doubles in size";
        B.lIlllIIIII[B.lIlllIIIlI[165]] = B."Sure thing.";
    }

    private static String lIIllIlllIIll(String var6, String var4) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var26 = Cipher.getInstance("Blowfish");
            var26.init(lIlllIIIlI[6], var19);
            return new String(var26.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static void lIIllIllllIII() {
        lIlllIIIlI = new int[171];
        B.lIlllIIIlI[0] = 0x74 ^ 0x46;
        B.lIlllIIIlI[1] = (82 + 68 - 103 + 119 ^ 64 + 85 - 143 + 193) & (0x5E ^ 0x66 ^ (0x6C ^ 0x35) ^ -1);
        B.lIlllIIIlI[2] = 1;
        B.lIlllIIIlI[3] = -(0xFFFFF44A & 0x5BBF) & (0xFFFFD7FF & 0x7BFF);
        B.lIlllIIIlI[4] = -(0xFFFFE5FA & 0x7A1D) & (0xFFFFFB9F & 0x77FF);
        B.lIlllIIIlI[5] = 0x39 ^ 0x4B ^ (0x7E ^ 8);
        B.lIlllIIIlI[6] = 2;
        B.lIlllIIIlI[7] = 0xFFFFBF77 & 0x5FCF;
        B.lIlllIIIlI[8] = -(0xFFFFDF2F & 0x6CFF) & (0xFFFFFFFF & 0x7D7F);
        B.lIlllIIIlI[9] = 0xCA ^ 0xAB ^ (0x49 ^ 0x22);
        B.lIlllIIIlI[10] = 2 ^ 7;
        B.lIlllIIIlI[11] = 0x34 ^ 0x1C;
        B.lIlllIIIlI[12] = 3;
        B.lIlllIIIlI[13] = 0x3C ^ 0x34;
        B.lIlllIIIlI[14] = -(0xFFFFFF2E & 0x68DB) & (0xFFFFFBFB & 0x6FFF);
        B.lIlllIIIlI[15] = -(0xFFFFB5F7 & 0x7A7B) & (0xFFFFF87F & 0x3FF2);
        B.lIlllIIIlI[16] = 0x63 ^ 0x65;
        B.lIlllIIIlI[17] = 0xB3 ^ 0xBA;
        B.lIlllIIIlI[18] = -(0xFFFFFD15 & 0xEFF) & (0xFFFFFF3F & 0x6CFD);
        B.lIlllIIIlI[19] = 0xFFFFC7F7 & 0x3A1D;
        B.lIlllIIIlI[20] = -(0xFFFFFD75 & 0x32BF) & (0xFFFFBE37 & 0x79FE);
        B.lIlllIIIlI[21] = 0xA7 ^ 0xA0;
        B.lIlllIIIlI[22] = 0xFFFFE8EF & 0x773A;
        B.lIlllIIIlI[23] = -(0xFFFFD5E9 & 0x7EFF) & (0xFFFFFDFF & 0x5EEC);
        B.lIlllIIIlI[24] = 0xFFFFFBFF & 0x6427;
        B.lIlllIIIlI[25] = -(0xFFFFDB52 & 0x66FF) & (0xFFFFEF7F & 0x5AD7);
        B.lIlllIIIlI[26] = -(0xFFFFFFDE & 0x10F7) & (0xFFFFF4FF & 0x7BFD);
        B.lIlllIIIlI[27] = -(0xFFFFE575 & 0x3EDF) & (0xFFFFAEFC & 0x7D5F);
        B.lIlllIIIlI[28] = 0xFFFFFE7F & 0x61A6;
        B.lIlllIIIlI[29] = -(0xFFFFF2EB & 0x1DF5) & (0xFFFFFCEF & 0x1BFA);
        B.lIlllIIIlI[30] = 0x16 ^ 0x6D ^ (0xE7 ^ 0x97);
        B.lIlllIIIlI[31] = 0xFFFFFB75 & 0x64AF;
        B.lIlllIIIlI[32] = 0xFFFF8DCC & 0x7A3F;
        B.lIlllIIIlI[33] = 0xB6 ^ 0xC3 ^ (0x79 ^ 0);
        B.lIlllIIIlI[34] = -(0xFFFFFE95 & 0x1BFB) & (0xFFFFFFF2 & 0x7ABD);
        B.lIlllIIIlI[35] = 0xFFFFA98F & 0x5E7E;
        B.lIlllIIIlI[36] = 176 + 180 - 321 + 169 ^ 42 + 130 - 69 + 90;
        B.lIlllIIIlI[37] = 0xFFFFE01F & Short.MAX_VALUE;
        B.lIlllIIIlI[38] = -(0xFFFFBF0F & 0x77FF) & (0xFFFFFF3E & 0x3FDF);
        B.lIlllIIIlI[39] = 0x62 ^ 0x6C;
        B.lIlllIIIlI[40] = 0xFFFFE5DE & 0x7A3F;
        B.lIlllIIIlI[41] = 0xFFFFDC93 & 0x2B7E;
        B.lIlllIIIlI[42] = 0x14 ^ 0x1B;
        B.lIlllIIIlI[43] = -(0xFFFFBFB3 & 0x5B6D) & (0xFFFFFB3F & 0x7FFD);
        B.lIlllIIIlI[44] = -(0xFFFFDFE7 & 0x773C) & (0xFFFFFF3F & 0x5FF7);
        B.lIlllIIIlI[45] = 0x71 ^ 0x61;
        B.lIlllIIIlI[46] = 0xFFFFEDEB & 0x7236;
        B.lIlllIIIlI[47] = 0xFFFF8A1E & 0x7DF7;
        B.lIlllIIIlI[48] = 0x4A ^ 0x5B;
        B.lIlllIIIlI[49] = 0xFFFFF12D & 0x6EF3;
        B.lIlllIIIlI[50] = -(0xFFFFFECD & 0x77F6) & (0xFFFFFEFB & 0x7FDF);
        B.lIlllIIIlI[51] = 0x20 ^ 0x32;
        B.lIlllIIIlI[52] = 0xFFFFF537 & 0x6AEB;
        B.lIlllIIIlI[53] = -(0xFFFFDFFF & 0x75C6) & (0xFFFFFFDF & 0x5DFF);
        B.lIlllIIIlI[54] = 0xC ^ 0x1F;
        B.lIlllIIIlI[55] = -(0xFFFFEDDB & 0x1BFF) & (0xFFFFEBFE & 0x7DFF);
        B.lIlllIIIlI[56] = 0xFFFFEA9F & 0x1D7C;
        B.lIlllIIIlI[57] = 0x62 ^ 0x76;
        B.lIlllIIIlI[58] = 0x18 ^ 0xD;
        B.lIlllIIIlI[59] = 0xC ^ 0x62 ^ (0xC3 ^ 0xBB);
        B.lIlllIIIlI[60] = 0x4B ^ 0x5C;
        B.lIlllIIIlI[61] = 0x78 ^ 0x64;
        B.lIlllIIIlI[62] = 0x16 ^ 0xE;
        B.lIlllIIIlI[63] = 0x3E ^ 0x27;
        B.lIlllIIIlI[64] = 133 + 86 - 121 + 57 ^ 65 + 35 - 67 + 96;
        B.lIlllIIIlI[65] = -(0xFFFFFD73 & 0x53AE) & (0xFFFFFFED & Short.MAX_VALUE);
        B.lIlllIIIlI[66] = -(0xFFFFBF46 & 0x5EFD) & (0xFFFFFFFB & 0x7FEF);
        B.lIlllIIIlI[67] = 0xFFFF938F & 0x6FF4;
        B.lIlllIIIlI[68] = 0x57 ^ 0x43 ^ (0xD8 ^ 0xA8);
        B.lIlllIIIlI[69] = 0x85 ^ 0x9E;
        B.lIlllIIIlI[70] = 0xF4 ^ 0x83 ^ (0xD8 ^ 0xB2);
        B.lIlllIIIlI[71] = 0xB5 ^ 0xAB;
        B.lIlllIIIlI[72] = 121 + 201 - 278 + 177 ^ 92 + 178 - 259 + 183;
        B.lIlllIIIlI[73] = 0x73 ^ 0x53;
        B.lIlllIIIlI[74] = 0x85 ^ 0xA4;
        B.lIlllIIIlI[75] = 0x2A ^ 8;
        B.lIlllIIIlI[76] = 0x5B ^ 0x78;
        B.lIlllIIIlI[77] = 0x49 ^ 0x6D;
        B.lIlllIIIlI[78] = 0x6E ^ 0x62 ^ (0x37 ^ 0x1E);
        B.lIlllIIIlI[79] = 0x57 ^ 0x71;
        B.lIlllIIIlI[80] = 0xB9 ^ 0xB6 ^ (0x89 ^ 0xA1);
        B.lIlllIIIlI[81] = 0x5A ^ 0x73;
        B.lIlllIIIlI[82] = 0x9B ^ 0xB1;
        B.lIlllIIIlI[83] = 0x86 ^ 0xAD;
        B.lIlllIIIlI[84] = 0x49 ^ 0x65;
        B.lIlllIIIlI[85] = 4 ^ 0x29;
        B.lIlllIIIlI[86] = 70 + 71 - -37 + 58 ^ 82 + 100 - 167 + 179;
        B.lIlllIIIlI[87] = 110 + 68 - 145 + 122 ^ 151 + 110 - 256 + 175;
        B.lIlllIIIlI[88] = 0xA6 ^ 0x96;
        B.lIlllIIIlI[89] = 37 + 6 - -118 + 21 ^ 56 + 134 - 118 + 63;
        B.lIlllIIIlI[90] = 0x5D ^ 0x6E;
        B.lIlllIIIlI[91] = 0x76 ^ 0x42;
        B.lIlllIIIlI[92] = 0x69 ^ 0x5C;
        B.lIlllIIIlI[93] = 0xC9 ^ 0xBC ^ (0xEA ^ 0xA9);
        B.lIlllIIIlI[94] = 0x21 ^ 0x16;
        B.lIlllIIIlI[95] = 159 + 49 - 161 + 125 ^ 95 + 30 - 121 + 144;
        B.lIlllIIIlI[96] = 0x44 ^ 0x21 ^ (0x20 ^ 0x7C);
        B.lIlllIIIlI[97] = 0x54 ^ 0x60 ^ (5 ^ 0xB);
        B.lIlllIIIlI[98] = 151 + 99 - 162 + 80 ^ 5 + 62 - 53 + 133;
        B.lIlllIIIlI[99] = 0x48 ^ 0x74;
        B.lIlllIIIlI[100] = 9 ^ 0x72 ^ (0xB ^ 0x4D);
        B.lIlllIIIlI[101] = 0xC3 ^ 0xAC ^ (0x7B ^ 0x2A);
        B.lIlllIIIlI[102] = 8 ^ 0x17 ^ (0x26 ^ 6);
        B.lIlllIIIlI[103] = 0xCE ^ 0x8E;
        B.lIlllIIIlI[104] = 0xD ^ 0x4C;
        B.lIlllIIIlI[105] = 0xE6 ^ 0x9A ^ (0x3E ^ 0);
        B.lIlllIIIlI[106] = 0x6E ^ 0x2D;
        B.lIlllIIIlI[107] = 0x74 ^ 2 ^ (0x54 ^ 0x66);
        B.lIlllIIIlI[108] = 0xAB ^ 0x82 ^ (0xDB ^ 0xB7);
        B.lIlllIIIlI[109] = 0x53 ^ 0x15;
        B.lIlllIIIlI[110] = 0x7F ^ 0x38;
        B.lIlllIIIlI[111] = 0x78 ^ 0xF ^ (0x33 ^ 0xC);
        B.lIlllIIIlI[112] = 0x16 ^ 0x3D ^ (0x62 ^ 0);
        B.lIlllIIIlI[113] = 0x2D ^ 0x74 ^ (0xD3 ^ 0xC0);
        B.lIlllIIIlI[114] = 0x3C ^ 0x77;
        B.lIlllIIIlI[115] = 251 + 243 - 336 + 95 ^ 166 + 44 - 182 + 149;
        B.lIlllIIIlI[116] = 0x3F ^ 0x72;
        B.lIlllIIIlI[117] = 0x8D ^ 0xC3;
        B.lIlllIIIlI[118] = 198 + 192 - 332 + 183 ^ 187 + 59 - 132 + 76;
        B.lIlllIIIlI[119] = 9 ^ 0x59;
        B.lIlllIIIlI[120] = 0x70 ^ 0x21;
        B.lIlllIIIlI[121] = 0x29 ^ 0x7B;
        B.lIlllIIIlI[122] = 0x2A ^ 0x4D ^ (0x32 ^ 6);
        B.lIlllIIIlI[123] = 0xD6 ^ 0x82;
        B.lIlllIIIlI[124] = 0x6F ^ 2 ^ (0x4F ^ 0x77);
        B.lIlllIIIlI[125] = 0x4A ^ 0x55 ^ (0xEE ^ 0xA7);
        B.lIlllIIIlI[126] = 0x52 ^ 5;
        B.lIlllIIIlI[127] = 0xDE ^ 0x86;
        B.lIlllIIIlI[128] = 158 + 35 - 123 + 148 ^ 69 + 6 - 5 + 61;
        B.lIlllIIIlI[129] = 0xF4 ^ 0xAE;
        B.lIlllIIIlI[130] = 0x12 ^ 0x49;
        B.lIlllIIIlI[131] = 0x6B ^ 0x4A ^ (0xF6 ^ 0x8B);
        B.lIlllIIIlI[132] = 0xC4 ^ 0xAD ^ (0x3C ^ 8);
        B.lIlllIIIlI[133] = 0xF6 ^ 0xA8;
        B.lIlllIIIlI[134] = 0x6A ^ 0x35;
        B.lIlllIIIlI[135] = 0xC3 ^ 0xA3;
        B.lIlllIIIlI[136] = 0xFE ^ 0x9F;
        B.lIlllIIIlI[137] = 0xB2 ^ 0xA8 ^ (0x42 ^ 0x3A);
        B.lIlllIIIlI[138] = 0xC2 ^ 0xBA ^ (0x43 ^ 0x58);
        B.lIlllIIIlI[139] = 0x1B ^ 0x7E;
        B.lIlllIIIlI[140] = 0x13 ^ 0x33 ^ (0x63 ^ 0x25);
        B.lIlllIIIlI[141] = 0xCF ^ 0xA8;
        B.lIlllIIIlI[142] = 0x13 ^ 0x7B;
        B.lIlllIIIlI[143] = 1 + 14 - -184 + 5 ^ 4 + 85 - -22 + 54;
        B.lIlllIIIlI[144] = 0x1E ^ 0x6A ^ (0x8F ^ 0x91);
        B.lIlllIIIlI[145] = 0x5A ^ 7 ^ (0xBF ^ 0x89);
        B.lIlllIIIlI[146] = 0x29 ^ 6 ^ (0x7B ^ 0x38);
        B.lIlllIIIlI[147] = 0x5A ^ 0x37;
        B.lIlllIIIlI[148] = 0x29 ^ 0x55 ^ (0x45 ^ 0x57);
        B.lIlllIIIlI[149] = 0x33 ^ 0x5C;
        B.lIlllIIIlI[150] = 0xC2 ^ 0xB2;
        B.lIlllIIIlI[151] = -(0xFFFFE536 & 0x7BCF) & (0xFFFFFFFF & 0x6DBF);
        B.lIlllIIIlI[152] = 0xFFFFCDFC & 0x3F7F;
        B.lIlllIIIlI[153] = -(0xFFFFDB3B & 0x6DE5) & (0xFFFFFFFE & 0x4FFF);
        B.lIlllIIIlI[154] = -(0xFFFFCAE1 & 0x7D9F) & (0xFFFFDFFF & 0x7BDB);
        B.lIlllIIIlI[155] = -(0xFFFFA929 & 0x76F7) & (0xFFFFE6FD & 0x3FFF);
        B.lIlllIIIlI[156] = 0xFFFFD74F & 0x3BFB;
        B.lIlllIIIlI[157] = 0xFFFFDFF1 & 0x26FF;
        B.lIlllIIIlI[158] = -(0xFFFFBCA3 & 0x6F5D) & (0xFFFFFF7F & 0x3FDF);
        B.lIlllIIIlI[159] = -(0xFFFFE15A & 0x7FB7) & (0xFFFFEFFF & 0x77FD);
        B.lIlllIIIlI[160] = 0xFFFFB373 & 0x5FFD;
        B.lIlllIIIlI[161] = 0xFFFFA7FA & 0x5ED7;
        B.lIlllIIIlI[162] = 0xFFFFDB73 & 0x37FC;
        B.lIlllIIIlI[163] = -(0xFFFFAA71 & 0x7DBF) & (0xFFFFBFFE & 0x6EFF);
        B.lIlllIIIlI[164] = 0xFFFFF7FC & 0x1B63;
        B.lIlllIIIlI[165] = 0xC5 ^ 0xB4;
        B.lIlllIIIlI[166] = -(0xFFFFF9FE & 0x1F73) & (0xFFFF9DFF & Short.MAX_VALUE);
        B.lIlllIIIlI[167] = -(0xFFFFA2C4 & 0x5FFF) & (0xFFFFDFFF & 0x2FFB);
        B.lIlllIIIlI[168] = -(0xFFFFBC33 & 0x6FED) & (0xFFFFBFFB & 0x6F37);
        B.lIlllIIIlI[169] = -(0xFFFFFF49 & 0xDF7) & (0xFFFFDFFF & 0x2FF7);
        B.lIlllIIIlI[170] = 141 + 63 - 52 + 76 ^ 34 + 63 - -13 + 40;
    }

    private static void O() {
        d var25;
        Predicate<Item> var17;
        int[] nArray = new int[lIlllIIIlI[2]];
        nArray[B.lIlllIIIlI[1]] = lIlllIIIlI[8];
        if (B.lIIllIllllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlllIIIlI[8], lIlllIIIlI[10], j.bZ);
            bp.add(d2);
            0;
        }
        if (B.lIIllIllllIll(Bank.contains(var17 = item -> item.getName().toLowerCase().contains(lIlllIIIII[lIlllIIIlI[61]])) ? 1 : 0)) {
            var25 = new d(lIlllIIIlI[65], lIlllIIIlI[10], lIlllIIIlI[66]);
            bp.add(var25);
            0;
        }
        int[] nArray2 = new int[lIlllIIIlI[2]];
        nArray2[B.lIlllIIIlI[1]] = lIlllIIIlI[7];
        if (B.lIIllIllllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var25 = new d(lIlllIIIlI[7], lIlllIIIlI[11], lIlllIIIlI[67]);
            bp.add(var25);
            0;
        }
    }
}

