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
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GameEnum;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.JHelper;
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

public class BHelper
implements K {
    public static final  String fu;
    public static final  String eB;
    public static final  String eR;
    public static final  String eK;
    public static final  String eA;
    public static final  String ft;
    public static final  String fW;
    public static final  int el;
    public static final  WorldPoint ev;
    public static final  WorldPoint ew;
    public static final  String eF;
    public static final  String fq;
    public static final  int ec;
    public static final  String fC;
    public static final  String eU;
    public static final  WorldPoint et;
    public static final  String fL;
    public static final  String ga;
    public static final  String fi;
    public static final  String eJ;
    public static final  int eb;
    public static final  String eS;
    public static final  String fb;
    public static final  String fQ;
    public static final  String fd;
    public static final  int ef;
    public static final  String eO;
    public static final  int eo;
    public static final  String fE;
    public static final  String fB;
    public static final  String eI;
    public static final  String eL;
    public static final  String fK;
    static  boolean dd;
    
    public static final  String fr;
    public static final  String ez;
    public static final  int eg;
    public static final  int ej;
    public static final  String fw;
    public static  boolean bn;
    public static final  String fS;
    public static final  String eQ;
    public static final  String fy;
    public static  String[] gd;
    public static final  String fM;
    public static final  String fa;
    public static final  int ed;
    public static final  String fh;
    public static final  String fk;
    public static final  String fe;
    public static final  String fR;
    public static final  int en;
    public static final  String fv;
    public static final  String eW;
    public static final  int ea;
    public static final  String eT;
    public static final  int ek;
    public static final  WorldPoint eu;
    public static final  String eZ;
    public static final  WorldPoint eq;
    public static final  String fZ;
    public static final  String eH;
    public static final  String fl;
    public static final  String eY;
    public static final  String fY;
    public static final  String fG;
    public static final  String fH;
    public static final  String eV;
    public static final  String fc;
    public static final  int ei;
    public static final  String fm;
    public static final  String eD;
    public static final  WorldPoint er;
    public static final  String ey;
    public static final  String fA;
    public static final  String eP;
    public static final  String eG;
    public static final  String fs;
    public static final  String fg;
    public static final  String eC;
    public static final  String fp;
    public static final  String eM;
    static  int dc;
    public static final  String gc;
    public static final  WorldPoint es;
    public static final  String ex;
    public static final  int eh;
    public static final  String fj;
    public static final  int em;
    public static final  String fx;
    
    public static final  String fN;
    public static  WorldArea cz;
    public static final  String fz;
    public static final  String fV;
    public static final  String fU;
    public static final  String fJ;
    public static final  int dZ;
    public static final  String fO;
    public static final  String fn;
    public static final  String eE;
    public static final  String eN;
    public static final  String eX;
    public static final  String fT;
    public static final  String gb;
    public static final  int ep;
    public static final  String fP;
    public static final  String fI;
    public static  List<d> bp;
    public static final  String fF;
    public static final  String fX;
    public static final  String fD;
    public static final  String ff;
    public static final  String fo;
    public static final  int ee;

    private static boolean lIIllIlllllII(Object object) {
        return object != null;
    }

    private static boolean lIIllIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void q(int n2) {
        if (!B.lIIllIllllIll(Widgets.get((int)lIlllIIIlI[19]).isEmpty() ? 1 : 0) || B.lIIlllIIIIIIl(Widgets.get((int)lIlllIIIlI[19]))) {
            int var1;
            int[] nArray = new int[lIlllIIIlI[2]];
            nArray[B.lIlllIIIlI[1]] = var1;
            if (B.lIIllIlllllII(TileObjects.getNearest((int[])nArray))) {
                int[] nArray2 = new int[lIlllIIIlI[2]];
                nArray2[B.lIlllIIIlI[1]] = var1;
                TileObjects.getNearest((int[])nArray2).interact(lIlllIIIII[lIlllIIIlI[64]]);
                Time.sleepTicks((int)lIlllIIIlI[6]);

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

        } else {
            n2 = lIlllIIIlI[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void bJ() {
        void var2;
        Widget widget2 = Widgets.get((int)lIlllIIIlI[19], (int)lIlllIIIlI[61]);
        if (B.lIIlllIIIIIIl(widget2)) {
            System.out.println(lIlllIIIII[lIlllIIIlI[62]]);
            return;
        }
        if (B.lIIllIlllllII(var2)) {
            System.out.println(var2.getText());
        }
        int var3 = lIlllIIIlI[1];
        while (B.lIIllIllllIlI(var3, i.values().length)) {
            if (B.lIIllIllllIIl(var2.getText().equalsIgnoreCase(i.values()[var3].Y()) ? 1 : 0)) {
                System.out.println("answer: " + i.values()[var3].Z());
                int var4 = var3;
                Widget var5 = Widgets.get((int)lIlllIIIlI[19], widget -> widget.getText().strip().contains(i.values()[var4].Z()));
                if (B.lIIllIlllllII(var5)) {
                    System.out.println(lIlllIIIII[lIlllIIIlI[63]]);
                    Mouse.click((int)var5.getClickPoint().getX(), (int)var5.getClickPoint().getY(), (boolean)lIlllIIIlI[2]);
                    Time.sleepTicks((int)lIlllIIIlI[6]);

                    if (1 < 2) break;
                    return;
                }
            }
            ++var3;

            if (((0xC0 ^ 0x98 ^ (0x83 ^ 0x88)) & (21 + 41 - 47 + 185 ^ 117 + 5 - 59 + 92 ^ -1)) == 0) continue;
            return;
        }
    }

        return String.valueOf(var6);
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
                BankLocation var7 = BankLocation.getNearest();
                if (B.lIIllIlllllII(var7) && B.lIIllIllllIll(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    a.a(var7);
                }
                if (B.lIIllIlllllII(var7) && B.lIIllIllllIIl(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (B.lIIllIllllIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIIIlI[4]);

                    }
                    if (B.lIIllIllllIIl(Bank.isOpen() ? 1 : 0)) {
                        if (B.lIIllIlllllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllIIIlI[5]);

                        }
                        if (B.lIIllIlllllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlllIIIlI[6]);

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

                        }
                    }
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[5]];
                    Movement.walkTo((WorldPoint)er);

                    Time.sleepTicks((int)lIlllIIIlI[2]);

                }
                if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(er), lIlllIIIlI[13])) {
                    g.a(lIlllIIIII[lIlllIIIlI[10]], gd);
                    Time.sleepTicks((int)lIlllIIIlI[2]);

                }
            }
            if (B.lIIllIlllllIl(e.j(lIlllIIIlI[3]))) {
                if (B.lIIlllIIIIIII(e.j(lIlllIIIlI[14]), lIlllIIIlI[15])) {
                    AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[16]];
                    if (B.lIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(es), lIlllIIIlI[17])) {
                        Movement.walkTo((WorldPoint)es);

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

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

                        Time.sleepTicks((int)lIlllIIIlI[2]);

                    }
                    if (B.lIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(er), lIlllIIIlI[13])) {
                        AccBuilderShamans.c = lIlllIIIII[lIlllIIIlI[59]];
                        g.a(lIlllIIIII[lIlllIIIlI[60]], gd);
                        Time.sleepTicks((int)lIlllIIIlI[2]);

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
        B.lIlllIIIII[B.lIlllIIIlI[1]] = "Drink";
        B.lIlllIIIII[B.lIlllIIIlI[2]] = "Finished buying items, switching back to quest";
        B.lIlllIIIII[B.lIlllIIIlI[6]] = "We are missing quest supplies, switching to BUYING";
        B.lIlllIIIII[B.lIlllIIIlI[12]] = "Break";
        B.lIlllIIIII[B.lIlllIIIlI[5]] = "Nav to start";
        B.lIlllIIIII[B.lIlllIIIlI[10]] = "Orlando Smith";
        B.lIlllIIIII[B.lIlllIIIlI[16]] = "Solving terror bird";
        B.lIlllIIIII[B.lIlllIIIlI[21]] = "Solving kalphite";
        B.lIlllIIIII[B.lIlllIIIlI[13]] = "Solving Monkey";
        B.lIlllIIIII[B.lIlllIIIlI[17]] = "Solving sea slug";
        B.lIlllIIIII[B.lIlllIIIlI[9]] = "Solving snake";
        B.lIlllIIIII[B.lIlllIIIlI[30]] = "Solving east snail";
        B.lIlllIIIII[B.lIlllIIIlI[33]] = "Solving wyvern";
        B.lIlllIIIII[B.lIlllIIIlI[36]] = "Solving dragon";
        B.lIlllIIIII[B.lIlllIIIlI[39]] = "Solving tort";
        B.lIlllIIIII[B.lIlllIIIlI[42]] = "Solving croc";
        B.lIlllIIIII[B.lIlllIIIlI[45]] = "Solving leech";
        B.lIlllIIIII[B.lIlllIIIlI[48]] = "Solving camel";
        B.lIlllIIIII[B.lIlllIIIlI[51]] = "Solving mole";
        B.lIlllIIIII[B.lIlllIIIlI[54]] = "Solving leech";
        B.lIlllIIIII[B.lIlllIIIlI[57]] = "Handing in quest";
        B.lIlllIIIII[B.lIlllIIIlI[58]] = "Nav to start";
        B.lIlllIIIII[B.lIlllIIIlI[59]] = "Talking";
        B.lIlllIIIII[B.lIlllIIIlI[60]] = "Orlando Smith";
        B.lIlllIIIII[B.lIlllIIIlI[62]] = "null question";
        B.lIlllIIIII[B.lIlllIIIlI[63]] = "Found answer";
        B.lIlllIIIII[B.lIlllIIIlI[64]] = "Study";
        B.lIlllIIIII[B.lIlllIIIlI[69]] = "Varrock Quiz";
        B.lIlllIIIII[B.lIlllIIIlI[61]] = "ring of wealth (";
        B.lIlllIIIII[B.lIlllIIIlI[70]] = "Squamata";
        B.lIlllIIIII[B.lIlllIIIlI[71]] = "The Slayer Masters";
        B.lIlllIIIII[B.lIlllIIIlI[72]] = "Below room temperature";
        B.lIlllIIIII[B.lIlllIIIlI[73]] = "An operculum";
        B.lIlllIIIII[B.lIlllIIIlI[74]] = "Worker";
        B.lIlllIIIII[B.lIlllIIIlI[75]] = "0";
        B.lIlllIIIII[B.lIlllIIIlI[76]] = "Anti-dragon-breath shield";
        B.lIlllIIIII[B.lIlllIIIlI[77]] = "Asgarnia";
        B.lIlllIIIII[B.lIlllIIIlI[78]] = "Water";
        B.lIlllIIIII[B.lIlllIIIlI[79]] = "Stomach acid";
        B.lIlllIIIII[B.lIlllIIIlI[80]] = "Carnivores";
        B.lIlllIIIII[B.lIlllIIIlI[11]] = "Seaweed";
        B.lIlllIIIII[B.lIlllIIIlI[81]] = "Anything";
        B.lIlllIIIII[B.lIlllIIIlI[82]] = "Sunlight";
        B.lIlllIIIII[B.lIlllIIIlI[83]] = "Constriction";
        B.lIlllIIIII[B.lIlllIIIlI[84]] = "Acid-spitting snail";
        B.lIlllIIIII[B.lIlllIIIlI[85]] = "Pasha";
        B.lIlllIIIII[B.lIlllIIIlI[86]] = "Reptiles";
        B.lIlllIIIII[B.lIlllIIIlI[87]] = "Three";
        B.lIlllIIIII[B.lIlllIIIlI[88]] = "'Y'-shaped";
        B.lIlllIIIII[B.lIlllIIIlI[89]] = "Scabaras";
        B.lIlllIIIII[B.lIlllIIIlI[0]] = "Nematocysts";
        B.lIlllIIIII[B.lIlllIIIlI[90]] = "It becomes sleepy";
        B.lIlllIIIII[B.lIlllIIIlI[91]] = "Cold";
        B.lIlllIIIII[B.lIlllIIIlI[92]] = "The Talpidae family";
        B.lIlllIIIII[B.lIlllIIIlI[93]] = "Harmless";
        B.lIlllIIIII[B.lIlllIIIlI[94]] = "Unknown";
        B.lIlllIIIII[B.lIlllIIIlI[95]] = "Social";
        B.lIlllIIIII[B.lIlllIIIlI[96]] = "Orlando Smith";
        B.lIlllIIIII[B.lIlllIIIlI[97]] = "They dig holes";
        B.lIlllIIIII[B.lIlllIIIlI[98]] = "Sight";
        B.lIlllIIIII[B.lIlllIIIlI[99]] = "Seeing how you smell";
        B.lIlllIIIII[B.lIlllIIIlI[100]] = "Toxic dung";
        B.lIlllIIIII[B.lIlllIIIlI[101]] = "Tongue";
        B.lIlllIIIII[B.lIlllIIIlI[102]] = "Simian";
        B.lIlllIIIII[B.lIlllIIIlI[103]] = "Climate change";
        B.lIlllIIIII[B.lIlllIIIlI[104]] = "Fireproof oil";
        B.lIlllIIIII[B.lIlllIIIlI[105]] = "Omnivore";
        B.lIlllIIIII[B.lIlllIIIlI[106]] = "They attack by jumping";
        B.lIlllIIIII[B.lIlllIIIlI[107]] = "A labour";
        B.lIlllIIIII[B.lIlllIIIlI[108]] = "Anywhere";
        B.lIlllIIIII[B.lIlllIIIlI[109]] = "Gnomes";
        B.lIlllIIIII[B.lIlllIIIlI[110]] = "Red";
        B.lIlllIIIII[B.lIlllIIIlI[111]] = "Twenty years";
        B.lIlllIIIII[B.lIlllIIIlI[112]] = "It is resistant to acid";
        B.lIlllIIIII[B.lIlllIIIlI[113]] = "Hard shell";
        B.lIlllIIIII[B.lIlllIIIlI[114]] = "Al Kharid";
        B.lIlllIIIII[B.lIlllIIIlI[115]] = "Ardougne";
        B.lIlllIIIII[B.lIlllIIIlI[116]] = "Contracting and stretching";
        B.lIlllIIIII[B.lIlllIIIlI[117]] = "Runite";
        B.lIlllIIIII[B.lIlllIIIlI[118]] = "Two";
        B.lIlllIIIII[B.lIlllIIIlI[119]] = "Scarab beetles";
        B.lIlllIIIII[B.lIlllIIIlI[120]] = "Stones";
        B.lIlllIIIII[B.lIlllIIIlI[121]] = "Seaweed";
        B.lIlllIIIII[B.lIlllIIIlI[122]] = "Planning";
        B.lIlllIIIII[B.lIlllIIIlI[123]] = "Milk";
        B.lIlllIIIII[B.lIlllIIIlI[124]] = "Environment";
        B.lIlllIIIII[B.lIlllIIIlI[125]] = "Gnomes";
        B.lIlllIIIII[B.lIlllIIIlI[126]] = "A layer of fat";
        B.lIlllIIIII[B.lIlllIIIlI[127]] = "Wyson the Gardener";
        B.lIlllIIIII[B.lIlllIIIlI[128]] = "Apples";
        B.lIlllIIIII[B.lIlllIIIlI[129]] = "Lamellae";
        B.lIlllIIIII[B.lIlllIIIlI[130]] = "Subterranean";
        B.lIlllIIIII[B.lIlllIIIlI[131]] = "Elemental";
        B.lIlllIIIII[B.lIlllIIIlI[132]] = "Bitternuts";
        B.lIlllIIIII[B.lIlllIIIlI[133]] = "The researchers";
        B.lIlllIIIII[B.lIlllIIIlI[134]] = "Insects and other invertebrates";
        B.lIlllIIIII[B.lIlllIIIlI[135]] = "Admiral Bake";
        B.lIlllIIIII[B.lIlllIIIlI[136]] = "Two";
        B.lIlllIIIII[B.lIlllIIIlI[137]] = "Eating plants";
        B.lIlllIIIII[B.lIlllIIIlI[138]] = "Four";
        B.lIlllIIIII[B.lIlllIIIlI[68]] = "Annoyed";
        B.lIlllIIIII[B.lIlllIIIlI[139]] = "Dragons";
        B.lIlllIIIII[B.lIlllIIIlI[140]] = "Hair";
        B.lIlllIIIII[B.lIlllIIIlI[141]] = "Defence";
        B.lIlllIIIII[B.lIlllIIIlI[142]] = "Squamata";
        B.lIlllIIIII[B.lIlllIIIlI[143]] = "Old battle sites";
        B.lIlllIIIII[B.lIlllIIIlI[144]] = "They have";
        B.lIlllIIIII[B.lIlllIIIlI[145]] = "During breeding";
        B.lIlllIIIII[B.lIlllIIIlI[146]] = "Twelve";
        B.lIlllIIIII[B.lIlllIIIlI[147]] = "Mibbiwocket";
        B.lIlllIIIII[B.lIlllIIIlI[148]] = "Vegetables";
        B.lIlllIIIII[B.lIlllIIIlI[149]] = "Spitting acid";
        B.lIlllIIIII[B.lIlllIIIlI[150]] = "It doubles in size";
        B.lIlllIIIII[B.lIlllIIIlI[165]] = "Sure thing.";
    }

    private static void O() {
        d var8;
        Predicate<Item> var9;
        int[] nArray = new int[lIlllIIIlI[2]];
        nArray[B.lIlllIIIlI[1]] = lIlllIIIlI[8];
        if (B.lIIllIllllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIlllIIIlI[8], lIlllIIIlI[10], j.bZ);
            bp.add(d2);

        }
        if (B.lIIllIllllIll(Bank.contains(var9 = item -> item.getName().toLowerCase().contains(lIlllIIIII[lIlllIIIlI[61]])) ? 1 : 0)) {
            var8 = new DHelper(lIlllIIIlI[65], lIlllIIIlI[10], lIlllIIIlI[66]);
            bp.add(var8);

        }
        int[] nArray2 = new int[lIlllIIIlI[2]];
        nArray2[B.lIlllIIIlI[1]] = lIlllIIIlI[7];
        if (B.lIIllIllllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var8 = new DHelper(lIlllIIIlI[7], lIlllIIIlI[11], lIlllIIIlI[67]);
            bp.add(var8);

        }
    }
}

