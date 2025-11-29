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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GameEnum;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
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

public class EHelper
implements W {
    public static final  String eT;
    public static final  String ft;
    public static final  String fD;
    public static final  String eD;
    public static final  String fs;
    public static final  String eQ;
    public static final  int ei;
    public static final  String fQ;
    public static  boolean bt;
    public static final  String eR;
    public static final  String eB;
    public static final  String eU;
    public static final  String eC;
    public static final  int ek;
    public static final  String eM;
    public static final  String fL;
    public static final  String fK;
    public static final  WorldPoint er;
    public static final  int dY;
    public static final  String eP;
    public static final  String fI;
    public static final  String fY;
    public static final  int eg;
    public static final  String fC;
    public static final  String ex;
    public static final  String fj;
    public static final  String fR;
    public static final  WorldPoint eq;
    public static final  String ev;
    public static final  String fg;
    public static final  String fG;
    public static final  String eF;
    public static final  String fe;
    public static final  String fl;
    public static final  String fM;
    public static final  String fA;
    public static final  String eK;
    public static final  int ef;
    public static final  String eS;
    static  boolean cm;
    public static final  int em;
    public static final  String fx;
    public static final  String fr;
    public static final  String ey;
    public static final  String fm;
    public static final  int ea;
    static  int cl;
    public static final  String fb;
    public static final  String eL;
    public static final  String fc;
    public static final  String fH;
    public static final  WorldPoint eo;
    public static final  String fp;
    public static final  int el;
    public static final  String fN;
    public static  WorldArea bS;
    public static final  String ez;
    public static final  int ee;
    public static final  String fB;
    public static final  String fk;
    public static final  String fP;
    
    public static final  String fE;
    public static final  String fn;
    public static final  WorldPoint ep;
    public static final  String eO;
    
    public static  String[] gb;
    public static final  String eJ;
    public static final  String fq;
    public static final  String fJ;
    public static final  String fU;
    public static final  String fv;
    public static final  String ff;
    public static final  WorldPoint et;
    public static final  String fZ;
    public static final  String eY;
    public static final  String fW;
    public static final  String fO;
    public static final  String ew;
    public static final  int en;
    public static final  int eb;
    public static final  String fT;
    public static final  String fh;
    public static final  String fy;
    public static final  WorldPoint eu;
    public static  List<d> bv;
    public static final  String fz;
    public static final  String ga;
    public static final  String fi;
    public static final  int eh;
    public static final  String fw;
    public static final  String fX;
    public static final  String fo;
    public static final  String eX;
    public static final  int dX;
    public static final  String eE;
    public static final  String fu;
    public static final  String eI;
    public static final  int dZ;
    public static final  int ec;
    public static final  String eA;
    public static final  WorldPoint es;
    public static final  String eN;
    public static final  int ej;
    public static final  String fS;
    public static final  String eZ;
    public static final  String fd;
    public static final  String fa;
    public static final  String eG;
    public static final  String fV;
    public static final  String fF;
    public static final  String eW;
    public static final  int ed;
    public static final  String eH;
    public static final  String eV;

    @Override
    public boolean V() {
        int n2;
        if (E.llllllIIlIl(e.j(lIIlIlllI[14]), lIIlIlllI[56]) && E.llllllIIlIl(Skills.getLevel((Skill)Skill.HUNTER), lIIlIlllI[17])) {
            n2 = lIIlIlllI[2];

            if (1 < 0) {
                return ((0xF5 ^ 0x9E ^ (0x88 ^ 0xA0)) & (17 + 80 - -10 + 108 ^ 13 + 145 - 66 + 56 ^ -1)) != 0;
            }
        } else {
            n2 = lIIlIlllI[1];
        }
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIIlIlllI[1];
    }

    private static boolean llllllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        E.lllllIllIll();
        E.lllllIllIlI();
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
        bv = new ArrayList<d>();
        String[] stringArray = new String[lIIlIlllI[2]];
        stringArray[E.lIIlIlllI[1]] = lIIlIllIl[lIIlIlllI[165]];
        gb = stringArray;
        bS = new WorldArea(lIIlIlllI[166], lIIlIlllI[167], lIIlIlllI[168], lIIlIlllI[169], lIIlIlllI[1]);
    }

    public static void bD() {
        if (E.lllllIlllII(Inventory.contains((int[])f.aV) ? 1 : 0) && E.lllllIlllIl(Movement.getRunEnergy(), lIIlIlllI[0])) {
            Inventory.getFirst((int[])f.aV).interact(lIIlIllIl[lIIlIlllI[1]]);
            Time.sleepTicks((int)lIIlIlllI[2]);

        }
        if (E.lllllIllllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (E.lllllIlllII(bt ? 1 : 0)) {
            b.a(bv);
            if (E.lllllIlllIl(bv.size(), lIIlIlllI[2])) {
                System.out.println(lIIlIllIl[lIIlIlllI[2]]);
                bt = lIIlIlllI[1];
            }
        }
        if (E.lllllIllllI(bt ? 1 : 0)) {
            if (E.lllllIllllI(E.ab() ? 1 : 0) && E.lllllIlllIl(e.j(lIIlIlllI[3]), lIIlIlllI[2])) {
                BankLocation lIIIIIllllIlIII = BankLocation.getNearest();
                if (E.lllllIlllll(lIIIIIllllIlIII) && E.lllllIllllI(lIIIIIllllIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    a.a(lIIIIIllllIlIII);
                }
                if (E.lllllIlllll(lIIIIIllllIlIII) && E.lllllIlllII(lIIIIIllllIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (E.lllllIllllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIlllI[4]);

                    }
                    if (E.lllllIlllII(Bank.isOpen() ? 1 : 0)) {
                        if (E.llllllIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIlllI[5]);

                        }
                        if (E.llllllIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIlIlllI[6]);

                        }
                        int[] nArray = new int[lIIlIlllI[6]];
                        nArray[E.lIIlIlllI[1]] = lIIlIlllI[7];
                        nArray[E.lIIlIlllI[2]] = lIIlIlllI[8];
                        if (E.lllllIllllI(e.b(nArray) ? 1 : 0)) {
                            E.af();
                            System.out.println(lIIlIllIl[lIIlIlllI[6]]);
                            bt = lIIlIlllI[2];
                            return;
                        }
                        int[] nArray2 = new int[lIIlIlllI[6]];
                        nArray2[E.lIIlIlllI[1]] = lIIlIlllI[7];
                        nArray2[E.lIIlIlllI[2]] = lIIlIlllI[8];
                        if (E.lllllIlllII(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIIlIlllI[7], lIIlIlllI[9]);
                            a.b(f.aV, lIIlIlllI[10]);
                        }
                    }
                }
            }
            if (E.lllllIlllII(E.ab() ? 1 : 0) && E.lllllIllllI(e.j(lIIlIlllI[3]))) {
                if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(ep), lIIlIlllI[11])) {
                    if (E.lllllIlllII(bS.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray = new int[lIIlIlllI[2]];
                        nArray[E.lIIlIlllI[1]] = lIIlIlllI[7];
                        if (E.lllllIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray3 = new int[lIIlIlllI[2]];
                            nArray3[E.lIIlIlllI[1]] = lIIlIlllI[7];
                            Inventory.getFirst((int[])nArray3).interact(lIIlIllIl[lIIlIlllI[12]]);
                            Time.sleepTicks((int)lIIlIlllI[13]);

                        }
                    }
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[5]];
                    Movement.walkTo((WorldPoint)ep);

                    Time.sleepTicks((int)lIIlIlllI[2]);

                }
                if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ep), lIIlIlllI[13])) {
                    g.a(lIIlIllIl[lIIlIlllI[10]], gb);
                    Time.sleepTicks((int)lIIlIlllI[2]);

                }
            }
            if (E.llllllIIIII(e.j(lIIlIlllI[3]))) {
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[15])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[16]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eq), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)eq);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eq), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[18]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[20])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[21]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eq), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)eq);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eq), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[22]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[23])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[13]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)er);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[24]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[25])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[17]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)er);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[26]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[27])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[9]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)er);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[28]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[29])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[30]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)er);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(er), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[31]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[32])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[33]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(es), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)es);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(es), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[34]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[35])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[36]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(es), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)es);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(es), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[37]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[38])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[39]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(et), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)et);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(et), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[40]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[41])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[42]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(et), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)et);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(et), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[43]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[44])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[45]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)eu);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[46]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[47])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[48]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)eu);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[49]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[50])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[51]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)eu);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[52]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[53])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[54]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        Movement.walkTo((WorldPoint)eu);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(eu), lIIlIlllI[17])) {
                        E.p(lIIlIlllI[55]);
                        if (!E.lllllIlllII(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.lllllIlllll(Widgets.get((int)lIIlIlllI[19]))) {
                            E.bE();
                        }
                    }
                }
                if (E.llllllIIIll(e.j(lIIlIlllI[14]), lIIlIlllI[56]) && E.lllllIlllIl(Skills.getLevel((Skill)Skill.HUNTER), lIIlIlllI[17])) {
                    AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[57]];
                    if (E.llllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(ep), lIIlIlllI[13])) {
                        AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[58]];
                        Movement.walkTo((WorldPoint)ep);

                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                    if (E.llllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ep), lIIlIlllI[13])) {
                        AccBuilderEasyClues.c = lIIlIllIl[lIIlIlllI[59]];
                        g.a(lIIlIllIl[lIIlIlllI[60]], gb);
                        Time.sleepTicks((int)lIIlIlllI[2]);

                    }
                }
            }
            System.out.println(e.j(lIIlIlllI[14]));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void bE() {
        void lIIIIIllllIIIll;
        Widget widget2 = Widgets.get((int)lIIlIlllI[19], (int)lIIlIlllI[61]);
        if (E.llllllIIlII(widget2)) {
            System.out.println(lIIlIllIl[lIIlIlllI[62]]);
            return;
        }
        if (E.lllllIlllll(lIIIIIllllIIIll)) {
            System.out.println(lIIIIIllllIIIll.getText());
        }
        int lIIIIIllllIIIlI = lIIlIlllI[1];
        while (E.lllllIlllIl(lIIIIIllllIIIlI, h.values().length)) {
            if (E.lllllIlllII(lIIIIIllllIIIll.getText().equalsIgnoreCase(h.values()[lIIIIIllllIIIlI].O()) ? 1 : 0)) {
                System.out.println("answer: " + h.values()[lIIIIIllllIIIlI].P());
                int lIIIIIllllIIIIl = lIIIIIllllIIIlI;
                Widget lIIIIIllllIIIII = Widgets.get((int)lIIlIlllI[19], widget -> widget.getText().strip().contains(h.values()[lIIIIIllllIIIIl].P()));
                if (E.lllllIlllll(lIIIIIllllIIIII)) {
                    System.out.println(lIIlIllIl[lIIlIlllI[63]]);
                    Mouse.click((int)lIIIIIllllIIIII.getClickPoint().getX(), (int)lIIIIIllllIIIII.getClickPoint().getY(), (boolean)lIIlIlllI[2]);
                    Time.sleepTicks((int)lIIlIlllI[6]);

                    if (1 == 1) break;
                    return;
                }
            }
            ++lIIIIIllllIIIlI;

            if (-1 == -1) continue;
            return;
        }
    }

    private static void af() {
        d lIIIIIlllIllIlI;
        Predicate<Item> lIIIIIlllIllIll;
        int[] nArray = new int[lIIlIlllI[2]];
        nArray[E.lIIlIlllI[1]] = lIIlIlllI[8];
        if (E.lllllIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIlIlllI[8], lIIlIlllI[10], i.bq);
            bv.add(d2);

        }
        if (E.lllllIllllI(Bank.contains(lIIIIIlllIllIll = item -> item.getName().toLowerCase().contains(lIIlIllIl[lIIlIlllI[61]])) ? 1 : 0)) {
            lIIIIIlllIllIlI = new DHelper(lIIlIlllI[65], lIIlIlllI[10], lIIlIlllI[66]);
            bv.add(lIIIIIlllIllIlI);

        }
        int[] nArray2 = new int[lIIlIlllI[2]];
        nArray2[E.lIIlIlllI[1]] = lIIlIlllI[7];
        if (E.lllllIllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIIIIlllIllIlI = new DHelper(lIIlIlllI[7], lIIlIlllI[11], lIIlIlllI[67]);
            bv.add(lIIIIIlllIllIlI);

        }
    }

    @Override
    public int T() {
        try {
            E.bD();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x27 ^ 0x16 ^ (0x1C ^ 0x29)) <= ((0x55 ^ 0x53 ^ (0x6A ^ 0x5E)) & (0xE0 ^ 0x98 ^ (0xEB ^ 0xA1) ^ -1))) {
            return (0x5E ^ 0x37 ^ (0x1A ^ 0x48)) & (0xF5 ^ 0xA2 ^ (0xC1 ^ 0xAD) ^ -1);
        }
        return lIIlIlllI[68];
    }

    private static boolean lllllIlllII(int n2) {
        return n2 != 0;
    }

        return String.valueOf(lIIIIIlllIIlIll);
    }

    private static boolean llllllIIIll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public String U() {
        return lIIlIllIl[lIIlIlllI[69]];
    }

    private static boolean llllllIIlII(Object object) {
        return object == null;
    }

    private static boolean llllllIIIII(int n2) {
        return n2 > 0;
    }

    private static void p(int n2) {
        if (!E.lllllIllllI(Widgets.get((int)lIIlIlllI[19]).isEmpty() ? 1 : 0) || E.llllllIIlII(Widgets.get((int)lIIlIlllI[19]))) {
            int lIIIIIlllIllllI;
            int[] nArray = new int[lIIlIlllI[2]];
            nArray[E.lIIlIlllI[1]] = lIIIIIlllIllllI;
            if (E.lllllIlllll(TileObjects.getNearest((int[])nArray))) {
                int[] nArray2 = new int[lIIlIlllI[2]];
                nArray2[E.lIIlIlllI[1]] = lIIIIIlllIllllI;
                TileObjects.getNearest((int[])nArray2).interact(lIIlIllIl[lIIlIlllI[64]]);
                Time.sleepTicks((int)lIIlIlllI[6]);

            }
        }
    }

    private static boolean llllllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        if (E.llllllIIIII(Inventory.getCount((int[])f.aV))) {
            int[] nArray = new int[lIIlIlllI[2]];
            nArray[E.lIIlIlllI[1]] = lIIlIlllI[7];
            if (E.llllllIIIII(Inventory.getCount((int[])nArray))) {
                n2 = lIIlIlllI[2];

                if (null == null) return n2 != 0;
                return false;
            }
        }
        n2 = lIIlIlllI[1];
        return n2 != 0;
    }

    private static boolean lllllIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIllllI(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lllllIllIlI() {
        lIIlIllIl = new String[lIIlIlllI[170]];
        E.lIIlIllIl[E.lIIlIlllI[1]] = "Drink";
        E.lIIlIllIl[E.lIIlIlllI[2]] = "Finished buying items, switching back to quest";
        E.lIIlIllIl[E.lIIlIlllI[6]] = "We are missing quest supplies, switching to BUYING";
        E.lIIlIllIl[E.lIIlIlllI[12]] = "Break";
        E.lIIlIllIl[E.lIIlIlllI[5]] = "Nav to start";
        E.lIIlIllIl[E.lIIlIlllI[10]] = "Orlando Smith";
        E.lIIlIllIl[E.lIIlIlllI[16]] = "Solving terror bird";
        E.lIIlIllIl[E.lIIlIlllI[21]] = "Solving kalphite";
        E.lIIlIllIl[E.lIIlIlllI[13]] = "Solving Monkey";
        E.lIIlIllIl[E.lIIlIlllI[17]] = "Solving sea slug";
        E.lIIlIllIl[E.lIIlIlllI[9]] = "Solving snake";
        E.lIIlIllIl[E.lIIlIlllI[30]] = "Solving east snail";
        E.lIIlIllIl[E.lIIlIlllI[33]] = "Solving wyvern";
        E.lIIlIllIl[E.lIIlIlllI[36]] = "Solving dragon";
        E.lIIlIllIl[E.lIIlIlllI[39]] = "Solving tort";
        E.lIIlIllIl[E.lIIlIlllI[42]] = "Solving croc";
        E.lIIlIllIl[E.lIIlIlllI[45]] = "Solving leech";
        E.lIIlIllIl[E.lIIlIlllI[48]] = "Solving camel";
        E.lIIlIllIl[E.lIIlIlllI[51]] = "Solving mole";
        E.lIIlIllIl[E.lIIlIlllI[54]] = "Solving leech";
        E.lIIlIllIl[E.lIIlIlllI[57]] = "Handing in quest";
        E.lIIlIllIl[E.lIIlIlllI[58]] = "Nav to start";
        E.lIIlIllIl[E.lIIlIlllI[59]] = "Talking";
        E.lIIlIllIl[E.lIIlIlllI[60]] = "Orlando Smith";
        E.lIIlIllIl[E.lIIlIlllI[62]] = "null question";
        E.lIIlIllIl[E.lIIlIlllI[63]] = "Found answer";
        E.lIIlIllIl[E.lIIlIlllI[64]] = "Study";
        E.lIIlIllIl[E.lIIlIlllI[69]] = "Varrock Quiz";
        E.lIIlIllIl[E.lIIlIlllI[61]] = "ring of wealth (";
        E.lIIlIllIl[E.lIIlIlllI[70]] = "Spitting acid";
        E.lIIlIllIl[E.lIIlIlllI[71]] = "Scarab beetles";
        E.lIIlIllIl[E.lIIlIlllI[72]] = "Sight";
        E.lIIlIllIl[E.lIIlIlllI[73]] = "Anti-dragon-breath shield";
        E.lIIlIllIl[E.lIIlIlllI[74]] = "Twenty years";
        E.lIIlIllIl[E.lIIlIlllI[75]] = "Al Kharid";
        E.lIIlIllIl[E.lIIlIlllI[76]] = "Below room temperature";
        E.lIIlIllIl[E.lIIlIlllI[77]] = "Harmless";
        E.lIIlIllIl[E.lIIlIlllI[78]] = "Nematocysts";
        E.lIIlIllIl[E.lIIlIlllI[79]] = "Reptiles";
        E.lIIlIllIl[E.lIIlIlllI[80]] = "Old battle sites";
        E.lIIlIllIl[E.lIIlIlllI[11]] = "The Slayer Masters";
        E.lIIlIllIl[E.lIIlIlllI[81]] = "Stones";
        E.lIIlIllIl[E.lIIlIlllI[82]] = "Stomach acid";
        E.lIIlIllIl[E.lIIlIlllI[83]] = "During breeding";
        E.lIIlIllIl[E.lIIlIlllI[84]] = "Ardougne";
        E.lIIlIllIl[E.lIIlIlllI[85]] = "Red";
        E.lIIlIllIl[E.lIIlIlllI[86]] = "Lamellae";
        E.lIIlIllIl[E.lIIlIlllI[87]] = "Subterranean";
        E.lIIlIllIl[E.lIIlIlllI[88]] = "It is resistant to acid";
        E.lIIlIllIl[E.lIIlIlllI[89]] = "Sunlight";
        E.lIIlIllIl[E.lIIlIlllI[0]] = "Scabaras";
        E.lIIlIllIl[E.lIIlIlllI[90]] = "Pasha";
        E.lIIlIllIl[E.lIIlIlllI[91]] = "Eating plants";
        E.lIIlIllIl[E.lIIlIlllI[92]] = "It doubles in size";
        E.lIIlIllIl[E.lIIlIlllI[93]] = "Unknown";
        E.lIIlIllIl[E.lIIlIlllI[94]] = "Defence";
        E.lIIlIllIl[E.lIIlIlllI[95]] = "Vegetables";
        E.lIIlIllIl[E.lIIlIlllI[96]] = "Bitternuts";
        E.lIIlIllIl[E.lIIlIlllI[97]] = "Cold";
        E.lIIlIllIl[E.lIIlIlllI[98]] = "They attack by jumping";
        E.lIIlIllIl[E.lIIlIlllI[99]] = "Annoyed";
        E.lIIlIllIl[E.lIIlIlllI[100]] = "Gnomes";
        E.lIIlIllIl[E.lIIlIlllI[101]] = "Twelve";
        E.lIIlIllIl[E.lIIlIlllI[102]] = "Wyson the Gardener";
        E.lIIlIllIl[E.lIIlIlllI[103]] = "Hair";
        E.lIIlIllIl[E.lIIlIlllI[104]] = "The Talpidae family";
        E.lIIlIllIl[E.lIIlIlllI[105]] = "Squamata";
        E.lIIlIllIl[E.lIIlIlllI[106]] = "Mibbiwocket";
        E.lIIlIllIl[E.lIIlIlllI[107]] = "Apples";
        E.lIIlIllIl[E.lIIlIlllI[108]] = "Four";
        E.lIIlIllIl[E.lIIlIlllI[109]] = "Squamata";
        E.lIIlIllIl[E.lIIlIlllI[110]] = "Worker";
        E.lIIlIllIl[E.lIIlIlllI[111]] = "'Y'-shaped";
        E.lIIlIllIl[E.lIIlIlllI[112]] = "An operculum";
        E.lIIlIllIl[E.lIIlIlllI[113]] = "Climate change";
        E.lIIlIllIl[E.lIIlIlllI[114]] = "Three";
        E.lIIlIllIl[E.lIIlIlllI[115]] = "Dragons";
        E.lIIlIllIl[E.lIIlIlllI[116]] = "Social";
        E.lIIlIllIl[E.lIIlIlllI[117]] = "Acid-spitting snail";
        E.lIIlIllIl[E.lIIlIlllI[118]] = "Milk";
        E.lIIlIllIl[E.lIIlIlllI[119]] = "Seaweed";
        E.lIIlIllIl[E.lIIlIlllI[120]] = "Orlando Smith";
        E.lIIlIllIl[E.lIIlIlllI[121]] = "Simian";
        E.lIIlIllIl[E.lIIlIlllI[122]] = "Omnivore";
        E.lIIlIllIl[E.lIIlIlllI[123]] = "Runite";
        E.lIIlIllIl[E.lIIlIlllI[124]] = "It becomes sleepy";
        E.lIIlIllIl[E.lIIlIlllI[125]] = "They have";
        E.lIIlIllIl[E.lIIlIlllI[126]] = "Admiral Bake";
        E.lIIlIllIl[E.lIIlIlllI[127]] = "Two";
        E.lIIlIllIl[E.lIIlIlllI[128]] = "Toxic dung";
        E.lIIlIllIl[E.lIIlIlllI[129]] = "Constriction";
        E.lIIlIllIl[E.lIIlIlllI[130]] = "Elemental";
        E.lIIlIllIl[E.lIIlIlllI[131]] = "Seaweed";
        E.lIIlIllIl[E.lIIlIlllI[132]] = "A layer of fat";
        E.lIIlIllIl[E.lIIlIlllI[133]] = "Anywhere";
        E.lIIlIllIl[E.lIIlIlllI[134]] = "Fireproof oil";
        E.lIIlIllIl[E.lIIlIlllI[135]] = "Asgarnia";
        E.lIIlIllIl[E.lIIlIlllI[136]] = "0";
        E.lIIlIllIl[E.lIIlIlllI[137]] = "Contracting and stretching";
        E.lIIlIllIl[E.lIIlIlllI[138]] = "Insects and other invertebrates";
        E.lIIlIllIl[E.lIIlIlllI[68]] = "Environment";
        E.lIIlIllIl[E.lIIlIlllI[139]] = "The researchers";
        E.lIIlIllIl[E.lIIlIlllI[140]] = "A labour";
        E.lIIlIllIl[E.lIIlIlllI[141]] = "Water";
        E.lIIlIllIl[E.lIIlIlllI[142]] = "Anything";
        E.lIIlIllIl[E.lIIlIlllI[143]] = "Gnomes";
        E.lIIlIllIl[E.lIIlIlllI[144]] = "Planning";
        E.lIIlIllIl[E.lIIlIlllI[145]] = "Hard shell";
        E.lIIlIllIl[E.lIIlIlllI[146]] = "Seeing how you smell";
        E.lIIlIllIl[E.lIIlIlllI[147]] = "Tongue";
        E.lIIlIllIl[E.lIIlIlllI[148]] = "Two";
        E.lIIlIllIl[E.lIIlIlllI[149]] = "Carnivores";
        E.lIIlIllIl[E.lIIlIlllI[150]] = "They dig holes";
        E.lIIlIllIl[E.lIIlIlllI[165]] = "Sure thing.";
    }

    private static boolean lllllIlllll(Object object) {
        return object != null;
    }
}

