/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.QHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.ZHelper;
import gg.squire.account.AccBuilderBarrows;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class YHelper
implements F {
    static  int gu;
    private static final  int gm;
    private static final  WorldPoint gi;
    private static final  WorldPoint gf;
    static final  int fA;
    public static final  WorldPoint fv;
    public static  boolean bz;
    public static  List<d> bB;
    private static final  WorldPoint fL;
    public static  int gq;
    private static final  WorldPoint fU;
    static  int ci;
    static  WorldArea gE;
    private static final  WorldPoint gg;
    private static final  int gk;
    static final  int fE;
    static final  int fB;
    static  boolean cj;
    static  String gy;
    static  String gA;
    static  WorldPoint gD;
    static final  int fz;
    private static final  WorldPoint ga;
    private static final  WorldPoint fT;
    
    static final  int fy;
    public static final  int[] fq;
    public static final  WorldPoint fw;
    private static final  int gn;
    private static final  WorldPoint ge;
    private static final  WorldPoint fJ;
    static final  WorldPoint[] fH;
    private static final  WorldPoint fO;
    static  int gw;
    static  int gr;
    public static final  WorldPoint fx;
    static final  int fG;
    private static final  WorldPoint fY;
    private static final  WorldPoint fV;
    private static final  int gl;
    private static final  WorldPoint fK;
    private static final  WorldPoint fQ;
    private static final  WorldPoint gb;
    private static final  WorldPoint gh;
    public static  WorldArea go;
    private static final  WorldPoint fZ;
    static  int bZ;
    private static final  WorldPoint fR;
    public static final  int[] fp;
    private static final  WorldPoint fM;
    static  int gv;
    private static final  WorldPoint fN;
    public static final  WorldArea fr;
    public static final  WorldPoint fu;
    static  WorldArea gC;
    static  String gz;
    static final  int fD;
    private static final  WorldPoint gc;
    static final  int fC;
    static  int gt;
    public static final  WorldPoint fs;
    static  int gs;
    public static final  int[] fo;
    private static final  WorldPoint fW;
    static  WorldPoint gB;
    private static final  WorldPoint fS;
    private static final  int gj;
    private static final  WorldPoint fI;
    static final  int fF;
    private static final  WorldPoint gd;
    private static final  WorldPoint fX;
    private static final  WorldPoint fP;
    public static final  WorldPoint ft;
    static  String[] gx;
    public static  int gp;

    static {
        y.lIlIIllIlIl();
        y.lIlIIllIlII();
        gn = llIIlIll[143];
        fB = llIIlIll[5];
        fE = llIIlIll[11];
        fF = llIIlIll[13];
        fz = llIIlIll[1];
        fy = llIIlIll[10];
        fA = llIIlIll[3];
        fG = llIIlIll[19];
        gj = llIIlIll[49];
        gl = llIIlIll[303];
        fC = llIIlIll[6];
        fD = llIIlIll[7];
        gk = llIIlIll[145];
        gm = llIIlIll[306];
        int[] nArray = new int[llIIlIll[17]];
        nArray[y.llIIlIll[0]] = llIIlIll[318];
        nArray[y.llIIlIll[1]] = llIIlIll[333];
        nArray[y.llIIlIll[3]] = llIIlIll[334];
        nArray[y.llIIlIll[5]] = llIIlIll[335];
        nArray[y.llIIlIll[6]] = llIIlIll[336];
        nArray[y.llIIlIll[7]] = llIIlIll[337];
        nArray[y.llIIlIll[11]] = llIIlIll[338];
        nArray[y.llIIlIll[9]] = llIIlIll[339];
        nArray[y.llIIlIll[13]] = llIIlIll[339];
        fo = nArray;
        int[] nArray2 = new int[llIIlIll[6]];
        nArray2[y.llIIlIll[0]] = llIIlIll[316];
        nArray2[y.llIIlIll[1]] = llIIlIll[340];
        nArray2[y.llIIlIll[3]] = llIIlIll[341];
        nArray2[y.llIIlIll[5]] = llIIlIll[342];
        fp = nArray2;
        int[] nArray3 = new int[llIIlIll[17]];
        nArray3[y.llIIlIll[0]] = llIIlIll[24];
        nArray3[y.llIIlIll[1]] = llIIlIll[343];
        nArray3[y.llIIlIll[3]] = llIIlIll[344];
        nArray3[y.llIIlIll[5]] = llIIlIll[345];
        nArray3[y.llIIlIll[6]] = llIIlIll[346];
        nArray3[y.llIIlIll[7]] = llIIlIll[347];
        nArray3[y.llIIlIll[11]] = llIIlIll[348];
        nArray3[y.llIIlIll[9]] = llIIlIll[349];
        nArray3[y.llIIlIll[13]] = llIIlIll[348];
        fq = nArray3;
        fr = new WorldArea(llIIlIll[344], llIIlIll[350], llIIlIll[26], llIIlIll[25], llIIlIll[0]);
        fs = new WorldPoint(llIIlIll[351], llIIlIll[352], llIIlIll[0]);
        ft = new WorldPoint(llIIlIll[351], llIIlIll[353], llIIlIll[0]);
        fu = new WorldPoint(llIIlIll[351], llIIlIll[354], llIIlIll[0]);
        fv = new WorldPoint(llIIlIll[346], llIIlIll[354], llIIlIll[0]);
        fw = new WorldPoint(llIIlIll[346], llIIlIll[353], llIIlIll[0]);
        fx = new WorldPoint(llIIlIll[346], llIIlIll[352], llIIlIll[0]);
        WorldPoint[] worldPointArray = new WorldPoint[llIIlIll[7]];
        worldPointArray[y.llIIlIll[0]] = new WorldPoint(llIIlIll[355], llIIlIll[356], llIIlIll[0]);
        worldPointArray[y.llIIlIll[1]] = new WorldPoint(llIIlIll[357], llIIlIll[358], llIIlIll[0]);
        worldPointArray[y.llIIlIll[3]] = new WorldPoint(llIIlIll[359], llIIlIll[360], llIIlIll[0]);
        worldPointArray[y.llIIlIll[5]] = new WorldPoint(llIIlIll[361], llIIlIll[362], llIIlIll[0]);
        worldPointArray[y.llIIlIll[6]] = new WorldPoint(llIIlIll[363], llIIlIll[364], llIIlIll[0]);
        fH = worldPointArray;
        fI = new WorldPoint(llIIlIll[365], llIIlIll[53], llIIlIll[0]);
        fJ = new WorldPoint(llIIlIll[366], llIIlIll[367], llIIlIll[0]);
        fK = new WorldPoint(llIIlIll[368], llIIlIll[369], llIIlIll[0]);
        fL = new WorldPoint(llIIlIll[370], llIIlIll[371], llIIlIll[0]);
        fM = new WorldPoint(llIIlIll[372], llIIlIll[373], llIIlIll[0]);
        fN = new WorldPoint(llIIlIll[374], llIIlIll[375], llIIlIll[0]);
        fO = new WorldPoint(llIIlIll[376], llIIlIll[377], llIIlIll[0]);
        fP = new WorldPoint(llIIlIll[374], llIIlIll[378], llIIlIll[0]);
        fQ = new WorldPoint(llIIlIll[379], llIIlIll[380], llIIlIll[0]);
        fR = new WorldPoint(llIIlIll[379], llIIlIll[381], llIIlIll[1]);
        fS = new WorldPoint(llIIlIll[363], llIIlIll[382], llIIlIll[0]);
        fT = new WorldPoint(llIIlIll[383], llIIlIll[384], llIIlIll[0]);
        fU = new WorldPoint(llIIlIll[365], llIIlIll[385], llIIlIll[0]);
        fV = new WorldPoint(llIIlIll[386], llIIlIll[387], llIIlIll[0]);
        fW = new WorldPoint(llIIlIll[388], llIIlIll[389], llIIlIll[0]);
        fX = new WorldPoint(llIIlIll[390], llIIlIll[391], llIIlIll[0]);
        fY = new WorldPoint(llIIlIll[392], llIIlIll[393], llIIlIll[0]);
        fZ = new WorldPoint(llIIlIll[394], llIIlIll[395], llIIlIll[0]);
        ga = new WorldPoint(llIIlIll[396], llIIlIll[397], llIIlIll[0]);
        gb = new WorldPoint(llIIlIll[398], llIIlIll[399], llIIlIll[0]);
        gc = new WorldPoint(llIIlIll[349], llIIlIll[350], llIIlIll[0]);
        gd = new WorldPoint(llIIlIll[400], llIIlIll[352], llIIlIll[0]);
        ge = new WorldPoint(llIIlIll[400], llIIlIll[353], llIIlIll[0]);
        gf = new WorldPoint(llIIlIll[400], llIIlIll[354], llIIlIll[0]);
        gg = new WorldPoint(llIIlIll[398], llIIlIll[354], llIIlIll[0]);
        gh = new WorldPoint(llIIlIll[398], llIIlIll[353], llIIlIll[0]);
        gi = new WorldPoint(llIIlIll[398], llIIlIll[352], llIIlIll[0]);
        bB = new ArrayList<d>();
        go = new WorldArea(new WorldPoint(llIIlIll[379], llIIlIll[53], llIIlIll[0]), new WorldPoint(llIIlIll[368], llIIlIll[401], llIIlIll[0]));
        gp = llIIlIll[40];
        gq = llIIlIll[41];
        gr = llIIlIll[0];
        gs = llIIlIll[0];
        gt = llIIlIll[0];
        gu = llIIlIll[0];
        gv = llIIlIll[0];
        gw = llIIlIll[0];
        String[] stringArray = new String[llIIlIll[5]];
        stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[307]];
        stringArray[y.llIIlIll[1]] = llIIIIll[llIIlIll[402]];
        stringArray[y.llIIlIll[3]] = llIIIIll[llIIlIll[143]];
        gx = stringArray;
        gy = llIIIIll[llIIlIll[403]];
        gz = llIIIIll[llIIlIll[404]];
        gA = llIIIIll[llIIlIll[405]];
        gB = new WorldPoint(llIIlIll[349], llIIlIll[406], llIIlIll[0]);
        gC = new WorldArea(llIIlIll[407], llIIlIll[408], llIIlIll[10], llIIlIll[84], llIIlIll[0]);
        gD = new WorldPoint(llIIlIll[409], llIIlIll[410], llIIlIll[0]);
        gE = new WorldArea(llIIlIll[411], llIIlIll[412], llIIlIll[82], llIIlIll[90], llIIlIll[0]);
        bZ = llIIlIll[0];
    }

    private static boolean lIlIIlllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean T() {
        return llIIlIll[0];
    }

        return String.valueOf(lIlIlIIllllllll);
    }

    private static boolean lIlIIlllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlllIll(Object object) {
        return object != null;
    }

    public static void ag() {
        d lIlIlIlIIIIlllI;
        Object lIlIlIlIIIIllll;
        block20: {
            block19: {
                int[] nArray = new int[llIIlIll[1]];
                nArray[y.llIIlIll[0]] = llIIlIll[20];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(llIIlIll[20], llIIlIll[44], llIIlIll[315]);
                    bB.add(d2);

                }
                int[] nArray2 = new int[llIIlIll[1]];
                nArray2[y.llIIlIll[0]] = llIIlIll[316];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new DHelper(llIIlIll[316], llIIlIll[7], i.bw);
                    bB.add((DHelper) IlIlIlIIIIllll);

                }
                int[] nArray3 = new int[llIIlIll[1]];
                nArray3[y.llIIlIll[0]] = llIIlIll[14];
                if (y.lIlIIllIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[llIIlIll[1]];
                    nArray4[y.llIIlIll[0]] = llIIlIll[14];
                    if (y.lIlIIllIlll(Bank.getFirst((int[])nArray4).getQuantity(), llIIlIll[11])) {
                        lIlIlIlIIIIllll = new DHelper(llIIlIll[14], llIIlIll[317], llIIlIll[19]);
                        bB.add((DHelper) IlIlIlIIIIllll);

                    }
                }
                int[] nArray5 = new int[llIIlIll[1]];
                nArray5[y.llIIlIll[0]] = llIIlIll[15];
                if (y.lIlIIllIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[llIIlIll[1]];
                    nArray6[y.llIIlIll[0]] = llIIlIll[15];
                    if (y.lIlIIllIlll(Bank.getFirst((int[])nArray6).getQuantity(), llIIlIll[11])) {
                        lIlIlIlIIIIllll = new DHelper(llIIlIll[15], llIIlIll[317], llIIlIll[19]);
                        bB.add((DHelper) IlIlIlIIIIllll);

                    }
                }
                int[] nArray7 = new int[llIIlIll[1]];
                nArray7[y.llIIlIll[0]] = llIIlIll[16];
                if (y.lIlIIllIllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[llIIlIll[1]];
                    nArray8[y.llIIlIll[0]] = llIIlIll[16];
                    if (y.lIlIIllIlll(Bank.getFirst((int[])nArray8).getQuantity(), llIIlIll[11])) {
                        lIlIlIlIIIIllll = new DHelper(llIIlIll[16], llIIlIll[317], llIIlIll[19]);
                        bB.add((DHelper) IlIlIlIIIIllll);

                    }
                }
                int[] nArray9 = new int[llIIlIll[1]];
                nArray9[y.llIIlIll[0]] = llIIlIll[14];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new DHelper(llIIlIll[14], llIIlIll[317], llIIlIll[19]);
                    bB.add((DHelper) IlIlIlIIIIllll);

                }
                int[] nArray10 = new int[llIIlIll[1]];
                nArray10[y.llIIlIll[0]] = llIIlIll[15];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new DHelper(llIIlIll[15], llIIlIll[317], llIIlIll[19]);
                    bB.add((DHelper) IlIlIlIIIIllll);

                }
                int[] nArray11 = new int[llIIlIll[1]];
                nArray11[y.llIIlIll[0]] = llIIlIll[16];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new DHelper(llIIlIll[16], llIIlIll[317], llIIlIll[19]);
                    bB.add((DHelper) IlIlIlIIIIllll);

                }
                int[] nArray12 = new int[llIIlIll[1]];
                nArray12[y.llIIlIll[0]] = llIIlIll[14];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new DHelper(llIIlIll[14], llIIlIll[317], llIIlIll[19]);
                    bB.add((DHelper) IlIlIlIIIIllll);

                }
                int[] nArray13 = new int[llIIlIll[1]];
                nArray13[y.llIIlIll[0]] = llIIlIll[318];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new DHelper(llIIlIll[318], llIIlIll[7], llIIlIll[315]);
                    bB.add((DHelper) IlIlIlIIIIllll);

                }
                int[] nArray14 = new int[llIIlIll[1]];
                nArray14[y.llIIlIll[0]] = llIIlIll[24];
                if (!y.lIlIIllIllI(Bank.contains((int[])nArray14) ? 1 : 0)) break block19;
                int[] nArray15 = new int[llIIlIll[1]];
                nArray15[y.llIIlIll[0]] = llIIlIll[24];
                if (!y.lIlIIllIllI(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[llIIlIll[1]];
                nArray16[y.llIIlIll[0]] = llIIlIll[24];
                if (!y.lIlIIllIlll(Bank.getFirst((int[])nArray16).getQuantity(), llIIlIll[19])) break block20;
            }
            lIlIlIlIIIIllll = new DHelper(llIIlIll[24], llIIlIll[19], llIIlIll[319]);
            bB.add((DHelper) IlIlIlIIIIllll);

        }
        int[] nArray = new int[llIIlIll[1]];
        nArray[y.llIIlIll[0]] = llIIlIll[18];
        if (y.lIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlIlIlIIIIllll = new DHelper(llIIlIll[18], llIIlIll[7], llIIlIll[320]);
            bB.add((DHelper) IlIlIlIIIIllll);

        }
        if (y.lIlIIlllIII(Bank.contains((Predicate)(lIlIlIlIIIIllll = item -> item.getName().toLowerCase().contains(llIIIIll[llIIlIll[326]]))) ? 1 : 0)) {
            lIlIlIlIIIIlllI = new DHelper(llIIlIll[321], llIIlIll[25], llIIlIll[322]);
            bB.add(lIlIlIlIIIIlllI);

        }
        int[] nArray17 = new int[llIIlIll[1]];
        nArray17[y.llIIlIll[0]] = llIIlIll[323];
        if (y.lIlIIlllIII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lIlIlIlIIIIlllI = new DHelper(llIIlIll[323], llIIlIll[58], llIIlIll[324]);
            bB.add(lIlIlIlIIIIlllI);

        }
    }

    private static boolean lIlIlIIIIII(Object object) {
        return object == null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bm() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[llIIlIll[1]];
                nArray[y.llIIlIll[0]] = llIIlIll[20];
                if (!y.lIlIIllIllI(Inventory.contains((int[])nArray) ? 1 : 0) || !y.lIlIIllIllI(Inventory.contains((int[])f.bb) ? 1 : 0)) break block2;
                if (!y.lIlIIlllIII(Inventory.contains((int[])f.aU) ? 1 : 0)) break block3;
                if (!y.lIlIIllIllI(Equipment.contains((int[])f.aU) ? 1 : 0) || y.lIlIIlllIII(Inventory.contains((int[])f.aT) ? 1 : 0) && !y.lIlIIllIllI(Equipment.contains((int[])f.aT) ? 1 : 0)) break block2;
                String[] stringArray = new String[llIIlIll[1]];
                stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[314]];
                if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
            }
            n2 = llIIlIll[1];

            if (-1 < 0) return n2 != 0;
            return false;
        }
        n2 = llIIlIll[0];
        return n2 != 0;
    }

    @Override
    public String V() {
        return llIIIIll[llIIlIll[325]];
    }

    private static boolean lIlIIllllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlllIII(int n2) {
        return n2 == 0;
    }

    public static void bl() {
        block254: {
            block289: {
                Item lIlIlIlIIIlIIlI;
                BankLocation lIlIlIlIIIlIIll;
                block270: {
                    block253: {
                        block252: {
                            block251: {
                                block250: {
                                    block249: {
                                        block248: {
                                            block265: {
                                                block268: {
                                                    block269: {
                                                        block266: {
                                                            block267: {
                                                                block255: {
                                                                    block256: {
                                                                        block264: {
                                                                            block262: {
                                                                                block263: {
                                                                                    block261: {
                                                                                        block260: {
                                                                                            block258: {
                                                                                                block259: {
                                                                                                    block257: {
                                                                                                        if (y.lIlIIllIllI(bz ? 1 : 0)) {
                                                                                                            AccBuilderBarrows.c = llIIIIll[llIIlIll[0]];
                                                                                                            b.a(bB);
                                                                                                            if (y.lIlIIllIlll(bB.size(), llIIlIll[1])) {
                                                                                                                System.out.println(llIIIIll[llIIlIll[1]]);
                                                                                                                bz = llIIlIll[0];
                                                                                                            }
                                                                                                        }
                                                                                                        if (!y.lIlIIlllIII(bz ? 1 : 0)) break block254;
                                                                                                        if (y.lIlIIllIllI(Inventory.contains((int[])f.bb) ? 1 : 0) && y.lIlIIllIlll(Movement.getRunEnergy(), llIIlIll[2]) && y.lIlIIlllIII(Dialog.isOpen() ? 1 : 0)) {
                                                                                                            Inventory.getFirst((int[])f.bb).interact(llIIIIll[llIIlIll[3]]);
                                                                                                            Time.sleepTicks((int)llIIlIll[1]);

                                                                                                        }
                                                                                                        if (!y.lIlIIlllIIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIIlIll[4]) || y.lIlIIllIllI(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[llIIlIll[1]];
                                                                                                            stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[5]];
                                                                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[llIIlIll[1]];
                                                                                                                stringArray2[y.llIIlIll[0]] = llIIIIll[llIIlIll[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(llIIIIll[llIIlIll[7]]);
                                                                                                                Time.sleepTicks((int)llIIlIll[1]);

                                                                                                            }
                                                                                                        }
                                                                                                        if (y.lIlIIllIlll(e.j(llIIlIll[8]), llIIlIll[9])) {
                                                                                                            z.bs();
                                                                                                        }
                                                                                                        if (!y.lIlIIlllIII(e.j(llIIlIll[10])) || !y.lIlIIlllIlI(e.j(llIIlIll[8]), llIIlIll[9])) break block255;
                                                                                                        if (!y.lIlIIlllIII(y.bm() ? 1 : 0)) break block256;
                                                                                                        lIlIlIlIIIlIIll = BankLocation.getNearest();
                                                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIll) && y.lIlIIlllIII(lIlIlIlIIIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                            AccBuilderBarrows.c = llIIIIll[llIIlIll[11]];
                                                                                                            a.a(lIlIlIlIIIlIIll);
                                                                                                        }
                                                                                                        if (!y.lIlIIlllIll(lIlIlIlIIIlIIll) || !y.lIlIIllIllI(lIlIlIlIIIlIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block256;
                                                                                                        if (y.lIlIIlllIII(Bank.isOpen() ? 1 : 0)) {
                                                                                                            AccBuilderBarrows.c = llIIIIll[llIIlIll[9]];
                                                                                                            a.a();
                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIll[12]);

                                                                                                        }
                                                                                                        if (!y.lIlIIllIllI(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[13]];
                                                                                                        if (y.lIlIIllllII(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)llIIlIll[5]);

                                                                                                        }
                                                                                                        if (y.lIlIIllllII(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)llIIlIll[3]);

                                                                                                        }
                                                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                                                        nArray[y.llIIlIll[0]] = llIIlIll[14];
                                                                                                        if (!y.lIlIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block257;
                                                                                                        int[] nArray2 = new int[llIIlIll[1]];
                                                                                                        nArray2[y.llIIlIll[0]] = llIIlIll[14];
                                                                                                        if (!y.lIlIIlllIlI(Bank.getFirst((int[])nArray2).getQuantity(), llIIlIll[11])) break block258;
                                                                                                    }
                                                                                                    int[] nArray = new int[llIIlIll[1]];
                                                                                                    nArray[y.llIIlIll[0]] = llIIlIll[15];
                                                                                                    if (!y.lIlIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block259;
                                                                                                    int[] nArray3 = new int[llIIlIll[1]];
                                                                                                    nArray3[y.llIIlIll[0]] = llIIlIll[15];
                                                                                                    if (!y.lIlIIlllIlI(Bank.getFirst((int[])nArray3).getQuantity(), llIIlIll[11])) break block258;
                                                                                                }
                                                                                                int[] nArray = new int[llIIlIll[1]];
                                                                                                nArray[y.llIIlIll[0]] = llIIlIll[16];
                                                                                                if (!y.lIlIIllIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block260;
                                                                                                int[] nArray4 = new int[llIIlIll[1]];
                                                                                                nArray4[y.llIIlIll[0]] = llIIlIll[16];
                                                                                                if (!y.lIlIIllIlll(Bank.getFirst((int[])nArray4).getQuantity(), llIIlIll[11])) break block260;
                                                                                            }
                                                                                            y.ag();
                                                                                            System.out.println(llIIIIll[llIIlIll[17]]);
                                                                                            bz = llIIlIll[1];
                                                                                            return;
                                                                                        }
                                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                                        nArray[y.llIIlIll[0]] = llIIlIll[18];
                                                                                        if (!y.lIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block261;
                                                                                        String[] stringArray = new String[llIIlIll[1]];
                                                                                        stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[19]];
                                                                                        if (!y.lIlIIlllIlI(Inventory.getCount((String[])stringArray), llIIlIll[1])) break block262;
                                                                                    }
                                                                                    int[] nArray = new int[llIIlIll[1]];
                                                                                    nArray[y.llIIlIll[0]] = llIIlIll[20];
                                                                                    if (!y.lIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) break block263;
                                                                                    String[] stringArray = new String[llIIlIll[1]];
                                                                                    stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[21]];
                                                                                    if (!y.lIlIIlllIlI(Inventory.getCount((String[])stringArray), llIIlIll[1])) break block262;
                                                                                }
                                                                                if (!(y.lIlIIlllIII(Bank.contains((int[])f.aU) ? 1 : 0) && !y.lIlIIlllIlI(Inventory.getCount((int[])f.aU), llIIlIll[1]) || y.lIlIIlllIII(Bank.contains((int[])f.aT) ? 1 : 0) && !y.lIlIIlllIlI(Inventory.getCount((int[])f.aT), llIIlIll[1])) && (!y.lIlIIlllIII(Bank.contains((int[])f.bb) ? 1 : 0) || !y.lIlIIllIlll(Inventory.getCount((int[])f.bb), llIIlIll[1]))) break block264;
                                                                            }
                                                                            y.ag();
                                                                            System.out.println(llIIIIll[llIIlIll[22]]);
                                                                            bz = llIIlIll[1];
                                                                            return;
                                                                        }
                                                                        String[] stringArray = new String[llIIlIll[1]];
                                                                        stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[23]];
                                                                        if (y.lIlIIlllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            a.a(llIIlIll[18], llIIlIll[1]);
                                                                        }
                                                                        if (y.lIlIIlllIII(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                                                                            a.a(f.aU, llIIlIll[1]);
                                                                        }
                                                                        if (y.lIlIIlllIII(Inventory.contains((int[])f.aT) ? 1 : 0)) {
                                                                            a.a(llIIlIll[24], llIIlIll[1]);
                                                                        }
                                                                        if (y.lIlIIlllIII(Inventory.contains((int[])f.bb) ? 1 : 0)) {
                                                                            a.a(f.bb, llIIlIll[6]);
                                                                        }
                                                                        String[] stringArray3 = new String[llIIlIll[1]];
                                                                        stringArray3[y.llIIlIll[0]] = llIIIIll[llIIlIll[4]];
                                                                        if (y.lIlIIlllIII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                                                            a.a(llIIlIll[20], llIIlIll[25]);
                                                                        }
                                                                    }
                                                                    if (y.lIlIIllIllI(y.bm() ? 1 : 0)) {
                                                                        if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fM), llIIlIll[7])) {
                                                                            if (y.lIlIIllIllI(Bank.isOpen() ? 1 : 0)) {
                                                                                Bank.close();
                                                                                Time.sleepTicks((int)llIIlIll[5]);

                                                                            }
                                                                            if (y.lIlIIlllIII(Bank.isOpen() ? 1 : 0)) {
                                                                                if (y.lIlIIllIlll(bZ, llIIlIll[1])) {
                                                                                    if (y.lIlIIllIllI(Inventory.contains((int[])f.bb) ? 1 : 0) && y.lIlIIllIlll(Movement.getRunEnergy(), llIIlIll[2])) {
                                                                                        Inventory.getFirst((int[])f.bb).interact(llIIIIll[llIIlIll[26]]);
                                                                                        Time.sleepTicks((int)llIIlIll[1]);

                                                                                    }
                                                                                    e.w();
                                                                                    bZ += llIIlIll[1];
                                                                                }
                                                                                AccBuilderBarrows.c = llIIIIll[llIIlIll[27]];
                                                                                Movement.walkTo((WorldPoint)fM);

                                                                                Time.sleepTicks((int)llIIlIll[1]);

                                                                            }
                                                                        }
                                                                        if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fM), llIIlIll[7])) {
                                                                            AccBuilderBarrows.c = llIIIIll[llIIlIll[28]];
                                                                            g.a(gA, gx);
                                                                        }
                                                                    }
                                                                }
                                                                if (y.lIlIIlllllI(e.j(llIIlIll[10]), llIIlIll[1])) {
                                                                    if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fP), llIIlIll[5])) {
                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[25]];
                                                                        Movement.walkTo((WorldPoint)fP);

                                                                    }
                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fP), llIIlIll[5])) {
                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[29]];
                                                                        g.a(gz, gx);
                                                                    }
                                                                }
                                                                if (y.lIlIIlllllI(e.j(llIIlIll[10]), llIIlIll[3])) {
                                                                    if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fR), llIIlIll[6])) {
                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[30]];
                                                                        Movement.walkTo((WorldPoint)fR);

                                                                        Time.sleepTicks((int)llIIlIll[1]);

                                                                    }
                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fR), llIIlIll[6])) {
                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                        nArray[y.llIIlIll[0]] = llIIlIll[31];
                                                                        lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray);
                                                                        String[] stringArray = new String[llIIlIll[1]];
                                                                        stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[32]];
                                                                        if (y.lIlIIlllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            AccBuilderBarrows.c = llIIIIll[llIIlIll[33]];
                                                                            if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[34]]);
                                                                                Time.sleepTicks((int)llIIlIll[3]);

                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fR), llIIlIll[19])) {
                                                                    String[] stringArray = new String[llIIlIll[1]];
                                                                    stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[35]];
                                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0) && y.lIlIIlllllI(Players.getLocal().getAnimation(), llIIlIll[36]) && y.lIlIIllllll(e.j(llIIlIll[10]), llIIlIll[5])) {
                                                                        String[] stringArray4 = new String[llIIlIll[1]];
                                                                        stringArray4[y.llIIlIll[0]] = llIIIIll[llIIlIll[37]];
                                                                        lIlIlIlIIIlIIll = Inventory.getFirst((String[])stringArray4);
                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                            AccBuilderBarrows.c = llIIIIll[llIIlIll[38]];
                                                                            lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[39]]);
                                                                            Time.sleepTicks((int)llIIlIll[3]);

                                                                        }
                                                                    }
                                                                }
                                                                if (y.lIlIIlllllI(e.j(llIIlIll[10]), llIIlIll[5])) {
                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fR), llIIlIll[19])) {
                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                        nArray[y.llIIlIll[0]] = llIIlIll[40];
                                                                        if (y.lIlIIllIlll(Inventory.getCount((int[])nArray), llIIlIll[1])) {
                                                                            int[] nArray5 = new int[llIIlIll[1]];
                                                                            nArray5[y.llIIlIll[0]] = llIIlIll[41];
                                                                            if (y.lIlIIllIlll(Inventory.getCount((int[])nArray5), llIIlIll[1])) {
                                                                                AccBuilderBarrows.c = llIIIIll[llIIlIll[42]];
                                                                                if (y.lIlIIllIllI(Inventory.contains(item -> item.getName().contains(llIIIIll[llIIlIll[304]])) ? 1 : 0) && y.lIlIIlllIII(Equipment.contains(item -> item.getName().contains(llIIIIll[llIIlIll[41]])) ? 1 : 0)) {
                                                                                    Inventory.getFirst(item -> item.getName().contains(llIIIIll[llIIlIll[40]])).interact(llIIIIll[llIIlIll[43]]);
                                                                                }
                                                                                if (y.lIlIIllIllI(Equipment.contains(item -> item.getName().contains(llIIIIll[llIIlIll[332]])) ? 1 : 0) && y.lIlIIlllIII(Players.getLocal().isAnimating() ? 1 : 0)) {
                                                                                    Equipment.getFirst(item -> item.getName().contains(llIIIIll[llIIlIll[331]])).interact(llIIIIll[llIIlIll[44]]);
                                                                                    Time.sleepTicks((int)llIIlIll[6]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fS), llIIlIll[5])) {
                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                        nArray[y.llIIlIll[0]] = llIIlIll[40];
                                                                        if (y.lIlIIllIlll(Inventory.getCount((int[])nArray), llIIlIll[1])) {
                                                                            int[] nArray6 = new int[llIIlIll[1]];
                                                                            nArray6[y.llIIlIll[0]] = llIIlIll[41];
                                                                            if (y.lIlIIllIlll(Inventory.getCount((int[])nArray6), llIIlIll[1]) && y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fT), llIIlIll[44]) && y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fR), llIIlIll[19])) {
                                                                                AccBuilderBarrows.c = llIIIIll[llIIlIll[45]];
                                                                                if (y.lIlIIlllIII(gC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)gD);

                                                                                }
                                                                                if (y.lIlIIllIllI(gC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(fH));

                                                                                    Time.sleepTicks((int)llIIlIll[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fS), llIIlIll[5])) {
                                                                        String[] stringArray = new String[llIIlIll[1]];
                                                                        stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[46]];
                                                                        if (y.lIlIIlllIll(TileObjects.getNearest((String[])stringArray))) {
                                                                            int[] nArray = new int[llIIlIll[1]];
                                                                            nArray[y.llIIlIll[0]] = llIIlIll[40];
                                                                            if (y.lIlIIllIlll(Inventory.getCount((int[])nArray), llIIlIll[1])) {
                                                                                int[] nArray7 = new int[llIIlIll[1]];
                                                                                nArray7[y.llIIlIll[0]] = llIIlIll[41];
                                                                                if (y.lIlIIllIlll(Inventory.getCount((int[])nArray7), llIIlIll[1])) {
                                                                                    int[] nArray8 = new int[llIIlIll[1]];
                                                                                    nArray8[y.llIIlIll[0]] = llIIlIll[47];
                                                                                    lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray8);
                                                                                    if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                        lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[48]]);
                                                                                        Time.sleepTicks((int)llIIlIll[5]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fT), llIIlIll[3])) {
                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                        nArray[y.llIIlIll[0]] = llIIlIll[49];
                                                                        if (y.lIlIIlllIll(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray9 = new int[llIIlIll[1]];
                                                                            nArray9[y.llIIlIll[0]] = llIIlIll[40];
                                                                            if (y.lIlIIllIlll(Inventory.getCount((int[])nArray9), llIIlIll[1])) {
                                                                                int[] nArray10 = new int[llIIlIll[1]];
                                                                                nArray10[y.llIIlIll[0]] = llIIlIll[41];
                                                                                if (y.lIlIIllIlll(Inventory.getCount((int[])nArray10), llIIlIll[1])) {
                                                                                    AccBuilderBarrows.c = llIIIIll[llIIlIll[50]];
                                                                                    Movement.walkTo((WorldPoint)fT);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fT), llIIlIll[5])) {
                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                        nArray[y.llIIlIll[0]] = llIIlIll[49];
                                                                        if (y.lIlIIlllIll(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray11 = new int[llIIlIll[1]];
                                                                            nArray11[y.llIIlIll[0]] = llIIlIll[40];
                                                                            if (y.lIlIIllIlll(Inventory.getCount((int[])nArray11), llIIlIll[1])) {
                                                                                int[] nArray12 = new int[llIIlIll[1]];
                                                                                nArray12[y.llIIlIll[0]] = llIIlIll[41];
                                                                                if (y.lIlIIllIlll(Inventory.getCount((int[])nArray12), llIIlIll[1])) {
                                                                                    AccBuilderBarrows.c = llIIIIll[llIIlIll[51]];
                                                                                    int[] nArray13 = new int[llIIlIll[1]];
                                                                                    nArray13[y.llIIlIll[0]] = llIIlIll[49];
                                                                                    lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray13);
                                                                                    if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                        lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[52]]);
                                                                                        Time.sleepTicks((int)llIIlIll[3]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fU), llIIlIll[3])) {
                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                        nArray[y.llIIlIll[0]] = llIIlIll[40];
                                                                        if (y.lIlIIllllII(Inventory.getCount((int[])nArray)) && y.lIlIIllIlll(Players.getLocal().getWorldLocation().getY(), llIIlIll[53])) {
                                                                            int[] nArray14 = new int[llIIlIll[1]];
                                                                            nArray14[y.llIIlIll[0]] = llIIlIll[40];
                                                                            if (y.lIlIIllllII(Inventory.getCount((int[])nArray14))) {
                                                                                int[] nArray15 = new int[llIIlIll[1]];
                                                                                nArray15[y.llIIlIll[0]] = llIIlIll[41];
                                                                                if (y.lIlIIllIlll(Inventory.getCount((int[])nArray15), llIIlIll[1])) {
                                                                                    AccBuilderBarrows.c = llIIIIll[llIIlIll[54]];
                                                                                    Movement.walkTo((WorldPoint)fU);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fU), llIIlIll[3])) {
                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                        nArray[y.llIIlIll[0]] = llIIlIll[40];
                                                                        if (y.lIlIIllllII(Inventory.getCount((int[])nArray)) && y.lIlIIllIlll(Players.getLocal().getWorldLocation().getY(), llIIlIll[53])) {
                                                                            int[] nArray16 = new int[llIIlIll[1]];
                                                                            nArray16[y.llIIlIll[0]] = llIIlIll[40];
                                                                            if (y.lIlIIllllII(Inventory.getCount((int[])nArray16))) {
                                                                                int[] nArray17 = new int[llIIlIll[1]];
                                                                                nArray17[y.llIIlIll[0]] = llIIlIll[41];
                                                                                if (y.lIlIIllIlll(Inventory.getCount((int[])nArray17), llIIlIll[1])) {
                                                                                    int[] nArray18 = new int[llIIlIll[1]];
                                                                                    nArray18[y.llIIlIll[0]] = llIIlIll[55];
                                                                                    lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray18);
                                                                                    if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[56]];
                                                                                        int[] nArray19 = new int[llIIlIll[1]];
                                                                                        nArray19[y.llIIlIll[0]] = llIIlIll[40];
                                                                                        lIlIlIlIIIlIIlI = Inventory.getFirst((int[])nArray19);
                                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                                                                                            lIlIlIlIIIlIIlI.useOn((TileObject)lIlIlIlIIIlIIll);
                                                                                            Time.sleep((long)1L);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (y.lIlIIlllIlI(Players.getLocal().getWorldLocation().getY(), llIIlIll[53])) {
                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                        nArray[y.llIIlIll[0]] = llIIlIll[41];
                                                                        if (y.lIlIIllIlll(Inventory.getCount((int[])nArray), llIIlIll[1])) {
                                                                            AccBuilderBarrows.c = llIIIIll[llIIlIll[57]];
                                                                            g.a(gy, gx);
                                                                        }
                                                                    }
                                                                    int[] nArray = new int[llIIlIll[1]];
                                                                    nArray[y.llIIlIll[0]] = llIIlIll[41];
                                                                    if (y.lIlIIllllII(Inventory.getCount((int[])nArray)) && y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fW), llIIlIll[6])) {
                                                                        String[] stringArray = new String[llIIlIll[1]];
                                                                        stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[58]];
                                                                        if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray), llIIlIll[1])) {
                                                                            String[] stringArray5 = new String[llIIlIll[1]];
                                                                            stringArray5[y.llIIlIll[0]] = llIIIIll[llIIlIll[59]];
                                                                            if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray5), llIIlIll[1])) {
                                                                                AccBuilderBarrows.c = llIIIIll[llIIlIll[60]];
                                                                                if (y.lIlIIlllIII(gE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    if (y.lIlIIllIllI(Inventory.contains(item -> item.getName().contains(llIIIIll[llIIlIll[330]])) ? 1 : 0) && y.lIlIIlllIII(Equipment.contains(item -> item.getName().contains(llIIIIll[llIIlIll[329]])) ? 1 : 0)) {
                                                                                        Inventory.getFirst(item -> item.getName().contains(llIIIIll[llIIlIll[328]])).interact(llIIIIll[llIIlIll[61]]);
                                                                                        Time.sleepTicks((int)llIIlIll[1]);

                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)fM);

                                                                                    Time.sleepTicks((int)llIIlIll[1]);

                                                                                }
                                                                                if (y.lIlIIllIllI(gE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)fW);

                                                                                    Time.sleepTicks((int)llIIlIll[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray20 = new int[llIIlIll[1]];
                                                                    nArray20[y.llIIlIll[0]] = llIIlIll[41];
                                                                    if (y.lIlIIllllII(Inventory.getCount((int[])nArray20)) && y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fW), llIIlIll[6])) {
                                                                        String[] stringArray = new String[llIIlIll[1]];
                                                                        stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[62]];
                                                                        if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray), llIIlIll[1])) {
                                                                            String[] stringArray6 = new String[llIIlIll[1]];
                                                                            stringArray6[y.llIIlIll[0]] = llIIIIll[llIIlIll[63]];
                                                                            if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray6), llIIlIll[1])) {
                                                                                AccBuilderBarrows.c = llIIIIll[llIIlIll[64]];
                                                                                int[] nArray21 = new int[llIIlIll[1]];
                                                                                nArray21[y.llIIlIll[0]] = llIIlIll[41];
                                                                                lIlIlIlIIIlIIll = Inventory.getFirst((int[])nArray21);
                                                                                if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                    int[] nArray22 = new int[llIIlIll[1]];
                                                                                    nArray22[y.llIIlIll[0]] = llIIlIll[65];
                                                                                    lIlIlIlIIIlIIlI = TileObjects.getNearest((int[])nArray22);
                                                                                    if (y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                                                                                        lIlIlIlIIIlIIll.useOn((TileObject)lIlIlIlIIIlIIlI);
                                                                                        Time.sleepUntil(() -> {
                                                                                            boolean bl;
                                                                                            String[] stringArray = new String[llIIlIll[1]];
                                                                                            stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[327]];
                                                                                            if (y.lIlIIlllIll(TileObjects.getNearest((String[])stringArray))) {
                                                                                                bl = llIIlIll[1];

                                                                                            } else {
                                                                                                bl = llIIlIll[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)llIIlIll[66]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray23 = new int[llIIlIll[1]];
                                                                    nArray23[y.llIIlIll[0]] = llIIlIll[41];
                                                                    if (y.lIlIIllllII(Inventory.getCount((int[])nArray23))) {
                                                                        String[] stringArray = new String[llIIlIll[1]];
                                                                        stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[67]];
                                                                        if (y.lIlIIlllIll(TileObjects.getNearest((String[])stringArray))) {
                                                                            String[] stringArray7 = new String[llIIlIll[1]];
                                                                            stringArray7[y.llIIlIll[0]] = llIIIIll[llIIlIll[68]];
                                                                            if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray7), llIIlIll[1])) {
                                                                                String[] stringArray8 = new String[llIIlIll[1]];
                                                                                stringArray8[y.llIIlIll[0]] = llIIIIll[llIIlIll[69]];
                                                                                if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray8), llIIlIll[1])) {
                                                                                    AccBuilderBarrows.c = llIIIIll[llIIlIll[2]];
                                                                                    if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fX), llIIlIll[6])) {
                                                                                        Movement.walkTo((WorldPoint)fX);

                                                                                    }
                                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fX), llIIlIll[6])) {
                                                                                        int[] nArray24 = new int[llIIlIll[1]];
                                                                                        nArray24[y.llIIlIll[0]] = llIIlIll[70];
                                                                                        lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray24);
                                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                            lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[71]]);
                                                                                            Time.sleepTicks((int)llIIlIll[1]);

                                                                                        }
                                                                                        int[] nArray25 = new int[llIIlIll[1]];
                                                                                        nArray25[y.llIIlIll[0]] = llIIlIll[72];
                                                                                        lIlIlIlIIIlIIlI = TileObjects.getNearest((int[])nArray25);
                                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                                                                                            lIlIlIlIIIlIIlI.interact(llIIIIll[llIIlIll[73]]);
                                                                                            Time.sleepTicks((int)llIIlIll[1]);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (!y.lIlIIlllllI(e.j(llIIlIll[10]), llIIlIll[6])) break block265;
                                                                ci = llIIlIll[0];
                                                                int[] nArray = new int[llIIlIll[1]];
                                                                nArray[y.llIIlIll[0]] = llIIlIll[41];
                                                                if (y.lIlIIllllII(Inventory.getCount((int[])nArray))) {
                                                                    String[] stringArray = new String[llIIlIll[1]];
                                                                    stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[74]];
                                                                    if (y.lIlIIlllIll(TileObjects.getNearest((String[])stringArray))) {
                                                                        String[] stringArray9 = new String[llIIlIll[1]];
                                                                        stringArray9[y.llIIlIll[0]] = llIIIIll[llIIlIll[75]];
                                                                        if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray9), llIIlIll[1])) {
                                                                            String[] stringArray10 = new String[llIIlIll[1]];
                                                                            stringArray10[y.llIIlIll[0]] = llIIIIll[llIIlIll[76]];
                                                                            if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray10), llIIlIll[1])) {
                                                                                AccBuilderBarrows.c = llIIIIll[llIIlIll[77]];
                                                                                if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fX), llIIlIll[6])) {
                                                                                    Movement.walkTo((WorldPoint)fX);

                                                                                }
                                                                                if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fX), llIIlIll[6])) {
                                                                                    int[] nArray26 = new int[llIIlIll[1]];
                                                                                    nArray26[y.llIIlIll[0]] = llIIlIll[70];
                                                                                    lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray26);
                                                                                    if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                        lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[78]]);
                                                                                        Time.sleepTicks((int)llIIlIll[1]);

                                                                                    }
                                                                                    int[] nArray27 = new int[llIIlIll[1]];
                                                                                    nArray27[y.llIIlIll[0]] = llIIlIll[72];
                                                                                    lIlIlIlIIIlIIlI = TileObjects.getNearest((int[])nArray27);
                                                                                    if (y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                                                                                        lIlIlIlIIIlIIlI.interact(llIIIIll[llIIlIll[79]]);
                                                                                        Time.sleepTicks((int)llIIlIll[1]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int[] nArray28 = new int[llIIlIll[1]];
                                                                nArray28[y.llIIlIll[0]] = llIIlIll[41];
                                                                if (!y.lIlIIllllII(Inventory.getCount((int[])nArray28))) break block266;
                                                                String[] stringArray = new String[llIIlIll[1]];
                                                                stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[80]];
                                                                if (!y.lIlIlIIIIII(TileObjects.getNearest((String[])stringArray))) break block267;
                                                                int[] nArray29 = new int[llIIlIll[1]];
                                                                nArray29[y.llIIlIll[0]] = llIIlIll[81];
                                                                if (!y.lIlIIlllIll(TileObjects.getNearest((int[])nArray29))) break block266;
                                                            }
                                                            String[] stringArray = new String[llIIlIll[1]];
                                                            stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[82]];
                                                            if (y.lIlIIllllII(Inventory.getCount((String[])stringArray))) {
                                                                String[] stringArray11 = new String[llIIlIll[1]];
                                                                stringArray11[y.llIIlIll[0]] = llIIIIll[llIIlIll[83]];
                                                                if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray11), llIIlIll[1])) {
                                                                    if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fY), llIIlIll[5])) {
                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[84]];
                                                                        Movement.walkTo((WorldPoint)fY);

                                                                        Time.sleepTicks((int)llIIlIll[1]);

                                                                    }
                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fY), llIIlIll[5])) {
                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                        nArray[y.llIIlIll[0]] = llIIlIll[81];
                                                                        lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray);
                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                            lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[85]]);
                                                                            Time.sleepTicks((int)llIIlIll[1]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int[] nArray = new int[llIIlIll[1]];
                                                        nArray[y.llIIlIll[0]] = llIIlIll[41];
                                                        if (y.lIlIIllllII(Inventory.getCount((int[])nArray))) {
                                                            String[] stringArray = new String[llIIlIll[1]];
                                                            stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[86]];
                                                            if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray), llIIlIll[1])) {
                                                                String[] stringArray12 = new String[llIIlIll[1]];
                                                                stringArray12[y.llIIlIll[0]] = llIIIIll[llIIlIll[10]];
                                                                if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray12), llIIlIll[1])) {
                                                                    String[] stringArray13 = new String[llIIlIll[1]];
                                                                    stringArray13[y.llIIlIll[0]] = llIIIIll[llIIlIll[87]];
                                                                    if (y.lIlIIllIlll(Inventory.getCount((String[])stringArray13), llIIlIll[1]) && y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fY), llIIlIll[6])) {
                                                                        String[] stringArray14 = new String[llIIlIll[1]];
                                                                        stringArray14[y.llIIlIll[0]] = llIIIIll[llIIlIll[88]];
                                                                        if (y.lIlIIllllII(Inventory.getCount((String[])stringArray14))) {
                                                                            String[] stringArray15 = new String[llIIlIll[1]];
                                                                            stringArray15[y.llIIlIll[0]] = llIIIIll[llIIlIll[89]];
                                                                            if (y.lIlIIllllII(Inventory.getCount((String[])stringArray15))) {
                                                                                AccBuilderBarrows.c = llIIIIll[llIIlIll[90]];
                                                                                if (y.lIlIIlllIII(Equipment.contains((int[])f.aU) ? 1 : 0) && y.lIlIIllIllI(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                                                                                    Inventory.getFirst((int[])f.aU).interact(llIIIIll[llIIlIll[91]]);
                                                                                    Time.sleepTicks((int)llIIlIll[1]);

                                                                                }
                                                                                if (y.lIlIIllIllI(Equipment.contains((int[])f.aU) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)fV);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fV), llIIlIll[30])) break block268;
                                                        int[] nArray30 = new int[llIIlIll[1]];
                                                        nArray30[y.llIIlIll[0]] = llIIlIll[41];
                                                        if (!y.lIlIIllllII(Inventory.getCount((int[])nArray30))) break block268;
                                                        String[] stringArray = new String[llIIlIll[1]];
                                                        stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[92]];
                                                        if (!y.lIlIIlllIlI(Inventory.getCount((String[])stringArray), llIIlIll[1])) break block269;
                                                        String[] stringArray16 = new String[llIIlIll[1]];
                                                        stringArray16[y.llIIlIll[0]] = llIIIIll[llIIlIll[93]];
                                                        if (!y.lIlIIlllIlI(Inventory.getCount((String[])stringArray16), llIIlIll[1])) break block269;
                                                        String[] stringArray17 = new String[llIIlIll[1]];
                                                        stringArray17[y.llIIlIll[0]] = llIIIIll[llIIlIll[94]];
                                                        if (!y.lIlIIllIlll(Inventory.getCount((String[])stringArray17), llIIlIll[1])) break block268;
                                                    }
                                                    String[] stringArray = new String[llIIlIll[1]];
                                                    stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[95]];
                                                    if (y.lIlIIllllII(Inventory.getCount((String[])stringArray))) {
                                                        String[] stringArray18 = new String[llIIlIll[1]];
                                                        stringArray18[y.llIIlIll[0]] = llIIIIll[llIIlIll[96]];
                                                        if (y.lIlIIllllII(Inventory.getCount((String[])stringArray18))) {
                                                            if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fV), llIIlIll[6])) {
                                                                Movement.walkTo((WorldPoint)fV);

                                                            }
                                                            if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fV), llIIlIll[6])) {
                                                                if (y.lIlIIlllIII(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderBarrows.c = llIIIIll[llIIlIll[97]];
                                                                    a.a();
                                                                }
                                                                if (y.lIlIIllIllI(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderBarrows.c = llIIIIll[llIIlIll[98]];
                                                                    String[] stringArray19 = new String[llIIlIll[1]];
                                                                    stringArray19[y.llIIlIll[0]] = llIIIIll[llIIlIll[99]];
                                                                    Bank.depositAll((String[])stringArray19);
                                                                    if (y.lIlIIlllIIl(Inventory.getAll().size(), llIIlIll[34])) {
                                                                        Bank.deposit((String)llIIIIll[llIIlIll[100]], (int)llIIlIll[7]);
                                                                    }
                                                                    String[] stringArray20 = new String[llIIlIll[1]];
                                                                    stringArray20[y.llIIlIll[0]] = llIIIIll[llIIlIll[101]];
                                                                    if (y.lIlIIlllIII(Inventory.contains((String[])stringArray20) ? 1 : 0)) {
                                                                        a.a(llIIlIll[15], llIIlIll[11]);
                                                                    }
                                                                    String[] stringArray21 = new String[llIIlIll[1]];
                                                                    stringArray21[y.llIIlIll[0]] = llIIIIll[llIIlIll[102]];
                                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                                                                        String[] stringArray22 = new String[llIIlIll[1]];
                                                                        stringArray22[y.llIIlIll[0]] = llIIIIll[llIIlIll[103]];
                                                                        if (y.lIlIIllIlll(Inventory.getFirst((String[])stringArray22).getQuantity(), llIIlIll[11])) {
                                                                            String[] stringArray23 = new String[llIIlIll[1]];
                                                                            stringArray23[y.llIIlIll[0]] = llIIIIll[llIIlIll[105]];
                                                                            Bank.withdraw((String)llIIIIll[llIIlIll[104]], (int)(llIIlIll[11] - Inventory.getFirst((String[])stringArray23).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)llIIlIll[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray24 = new String[llIIlIll[1]];
                                                                    stringArray24[y.llIIlIll[0]] = llIIIIll[llIIlIll[106]];
                                                                    if (y.lIlIIlllIII(Inventory.contains((String[])stringArray24) ? 1 : 0)) {
                                                                        a.a(llIIlIll[16], llIIlIll[11]);
                                                                    }
                                                                    String[] stringArray25 = new String[llIIlIll[1]];
                                                                    stringArray25[y.llIIlIll[0]] = llIIIIll[llIIlIll[107]];
                                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                                                                        String[] stringArray26 = new String[llIIlIll[1]];
                                                                        stringArray26[y.llIIlIll[0]] = llIIIIll[llIIlIll[108]];
                                                                        if (y.lIlIIllIlll(Inventory.getFirst((String[])stringArray26).getQuantity(), llIIlIll[11])) {
                                                                            String[] stringArray27 = new String[llIIlIll[1]];
                                                                            stringArray27[y.llIIlIll[0]] = llIIIIll[llIIlIll[110]];
                                                                            Bank.withdraw((String)llIIIIll[llIIlIll[109]], (int)(llIIlIll[11] - Inventory.getFirst((String[])stringArray27).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)llIIlIll[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray28 = new String[llIIlIll[1]];
                                                                    stringArray28[y.llIIlIll[0]] = llIIIIll[llIIlIll[111]];
                                                                    if (y.lIlIIlllIII(Inventory.contains((String[])stringArray28) ? 1 : 0)) {
                                                                        a.a(llIIlIll[14], llIIlIll[11]);
                                                                    }
                                                                    String[] stringArray29 = new String[llIIlIll[1]];
                                                                    stringArray29[y.llIIlIll[0]] = llIIIIll[llIIlIll[112]];
                                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                                                                        String[] stringArray30 = new String[llIIlIll[1]];
                                                                        stringArray30[y.llIIlIll[0]] = llIIIIll[llIIlIll[113]];
                                                                        if (y.lIlIIllIlll(Inventory.getFirst((String[])stringArray30).getQuantity(), llIIlIll[11])) {
                                                                            String[] stringArray31 = new String[llIIlIll[1]];
                                                                            stringArray31[y.llIIlIll[0]] = llIIIIll[llIIlIll[115]];
                                                                            Bank.withdraw((String)llIIIIll[llIIlIll[114]], (int)(llIIlIll[11] - Inventory.getFirst((String[])stringArray31).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)llIIlIll[9]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray = new int[llIIlIll[1]];
                                                nArray[y.llIIlIll[0]] = llIIlIll[41];
                                                if (y.lIlIIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[llIIlIll[1]];
                                                    stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[116]];
                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray32 = new String[llIIlIll[1]];
                                                        stringArray32[y.llIIlIll[0]] = llIIIIll[llIIlIll[117]];
                                                        if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray32).getQuantity(), llIIlIll[11])) {
                                                            String[] stringArray33 = new String[llIIlIll[1]];
                                                            stringArray33[y.llIIlIll[0]] = llIIIIll[llIIlIll[118]];
                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray33) ? 1 : 0)) {
                                                                String[] stringArray34 = new String[llIIlIll[1]];
                                                                stringArray34[y.llIIlIll[0]] = llIIIIll[llIIlIll[119]];
                                                                if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray34).getQuantity(), llIIlIll[11])) {
                                                                    String[] stringArray35 = new String[llIIlIll[1]];
                                                                    stringArray35[y.llIIlIll[0]] = llIIIIll[llIIlIll[120]];
                                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                                                                        String[] stringArray36 = new String[llIIlIll[1]];
                                                                        stringArray36[y.llIIlIll[0]] = llIIIIll[llIIlIll[121]];
                                                                        if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray36).getQuantity(), llIIlIll[11])) {
                                                                            String[] stringArray37 = new String[llIIlIll[1]];
                                                                            stringArray37[y.llIIlIll[0]] = llIIIIll[llIIlIll[122]];
                                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                                                                                String[] stringArray38 = new String[llIIlIll[1]];
                                                                                stringArray38[y.llIIlIll[0]] = llIIIIll[llIIlIll[123]];
                                                                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray38) ? 1 : 0) && y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ga), llIIlIll[1])) {
                                                                                    if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fP), llIIlIll[6]) && y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fO), llIIlIll[6])) {
                                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[124]];
                                                                                        if (y.lIlIIllIllI(Dialog.isOpen() ? 1 : 0)) {
                                                                                            Dialog.close();
                                                                                        }
                                                                                        Movement.walkTo((WorldPoint)ga);

                                                                                    }
                                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fP), llIIlIll[7]) && y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(fO), llIIlIll[6])) {
                                                                                        String[] stringArray39 = new String[llIIlIll[1]];
                                                                                        stringArray39[y.llIIlIll[0]] = llIIIIll[llIIlIll[125]];
                                                                                        lIlIlIlIIIlIIll = Inventory.getFirst((String[])stringArray39);
                                                                                        String[] stringArray40 = new String[llIIlIll[1]];
                                                                                        stringArray40[y.llIIlIll[0]] = llIIIIll[llIIlIll[126]];
                                                                                        lIlIlIlIIIlIIlI = TileObjects.getNearest((String[])stringArray40);
                                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[127]];
                                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIll) && y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                                                                                            lIlIlIlIIIlIIll.useOn((TileObject)lIlIlIlIIIlIIlI);
                                                                                            Time.sleepUntil(() -> {
                                                                                                boolean bl;
                                                                                                if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fO), llIIlIll[6])) {
                                                                                                    bl = llIIlIll[1];

                                                                                                    if (2 >= (0x2E ^ 0x2A)) {
                                                                                                        return false;
                                                                                                    }
                                                                                                } else {
                                                                                                    bl = llIIlIll[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)llIIlIll[128]);

                                                                                        }
                                                                                    }
                                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fO), llIIlIll[6])) {
                                                                                        String[] stringArray41 = new String[llIIlIll[1]];
                                                                                        stringArray41[y.llIIlIll[0]] = llIIIIll[llIIlIll[129]];
                                                                                        lIlIlIlIIIlIIll = Inventory.getFirst((String[])stringArray41);
                                                                                        int[] nArray31 = new int[llIIlIll[1]];
                                                                                        nArray31[y.llIIlIll[0]] = llIIlIll[130];
                                                                                        lIlIlIlIIIlIIlI = TileObjects.getNearest((int[])nArray31);
                                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[131]];
                                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIll) && y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                                                                                            lIlIlIlIIIlIIll.useOn((TileObject)lIlIlIlIIIlIIlI);
                                                                                            Time.sleepTicks((int)llIIlIll[7]);

                                                                                        }
                                                                                    }
                                                                                    if (y.lIlIIllIllI(Players.getLocal().getWorldLocation().equals((Object)fZ) ? 1 : 0)) {
                                                                                        String[] stringArray42 = new String[llIIlIll[1]];
                                                                                        stringArray42[y.llIIlIll[0]] = llIIIIll[llIIlIll[132]];
                                                                                        lIlIlIlIIIlIIll = TileObjects.getNearest((String[])stringArray42);
                                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[133]];
                                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                            lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[134]]);
                                                                                            Time.sleepTicks((int)llIIlIll[3]);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (y.lIlIIlllllI(e.j(llIIlIll[10]), llIIlIll[7])) {
                                                int[] nArray = new int[llIIlIll[1]];
                                                nArray[y.llIIlIll[0]] = llIIlIll[41];
                                                if (y.lIlIIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[llIIlIll[1]];
                                                    stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[135]];
                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray43 = new String[llIIlIll[1]];
                                                        stringArray43[y.llIIlIll[0]] = llIIIIll[llIIlIll[136]];
                                                        if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray43).getQuantity(), llIIlIll[11])) {
                                                            String[] stringArray44 = new String[llIIlIll[1]];
                                                            stringArray44[y.llIIlIll[0]] = llIIIIll[llIIlIll[137]];
                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray44) ? 1 : 0)) {
                                                                String[] stringArray45 = new String[llIIlIll[1]];
                                                                stringArray45[y.llIIlIll[0]] = llIIIIll[llIIlIll[138]];
                                                                if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray45).getQuantity(), llIIlIll[11])) {
                                                                    String[] stringArray46 = new String[llIIlIll[1]];
                                                                    stringArray46[y.llIIlIll[0]] = llIIIIll[llIIlIll[139]];
                                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray46) ? 1 : 0)) {
                                                                        String[] stringArray47 = new String[llIIlIll[1]];
                                                                        stringArray47[y.llIIlIll[0]] = llIIIIll[llIIlIll[140]];
                                                                        if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray47).getQuantity(), llIIlIll[11])) {
                                                                            String[] stringArray48 = new String[llIIlIll[1]];
                                                                            stringArray48[y.llIIlIll[0]] = llIIIIll[llIIlIll[141]];
                                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray48) ? 1 : 0)) {
                                                                                String[] stringArray49 = new String[llIIlIll[1]];
                                                                                stringArray49[y.llIIlIll[0]] = llIIIIll[llIIlIll[142]];
                                                                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray49) ? 1 : 0)) {
                                                                                    int[] nArray32 = new int[llIIlIll[1]];
                                                                                    nArray32[y.llIIlIll[0]] = llIIlIll[143];
                                                                                    if (y.lIlIIllIlll(Inventory.getCount((int[])nArray32), llIIlIll[1]) && y.lIlIIlllIII(Players.getLocal().getWorldLocation().equals((Object)fZ) ? 1 : 0)) {
                                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[144]];
                                                                                        if (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ga), llIIlIll[3])) {
                                                                                            Movement.walkTo((WorldPoint)ga);

                                                                                        }
                                                                                        if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(ga), llIIlIll[3])) {
                                                                                            int[] nArray33 = new int[llIIlIll[1]];
                                                                                            nArray33[y.llIIlIll[0]] = llIIlIll[145];
                                                                                            lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray33);
                                                                                            if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                                lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[146]]);
                                                                                                Time.sleepTicks((int)llIIlIll[3]);

                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray34 = new int[llIIlIll[1]];
                                                nArray34[y.llIIlIll[0]] = llIIlIll[41];
                                                if (y.lIlIIllIllI(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                                                    String[] stringArray = new String[llIIlIll[1]];
                                                    stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[147]];
                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray50 = new String[llIIlIll[1]];
                                                        stringArray50[y.llIIlIll[0]] = llIIIIll[llIIlIll[148]];
                                                        if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray50).getQuantity(), llIIlIll[11])) {
                                                            String[] stringArray51 = new String[llIIlIll[1]];
                                                            stringArray51[y.llIIlIll[0]] = llIIIIll[llIIlIll[149]];
                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray51) ? 1 : 0)) {
                                                                String[] stringArray52 = new String[llIIlIll[1]];
                                                                stringArray52[y.llIIlIll[0]] = llIIIIll[llIIlIll[150]];
                                                                if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray52).getQuantity(), llIIlIll[11])) {
                                                                    String[] stringArray53 = new String[llIIlIll[1]];
                                                                    stringArray53[y.llIIlIll[0]] = llIIIIll[llIIlIll[151]];
                                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray53) ? 1 : 0)) {
                                                                        String[] stringArray54 = new String[llIIlIll[1]];
                                                                        stringArray54[y.llIIlIll[0]] = llIIIIll[llIIlIll[152]];
                                                                        if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray54).getQuantity(), llIIlIll[11])) {
                                                                            String[] stringArray55 = new String[llIIlIll[1]];
                                                                            stringArray55[y.llIIlIll[0]] = llIIIIll[llIIlIll[153]];
                                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray55) ? 1 : 0)) {
                                                                                String[] stringArray56 = new String[llIIlIll[1]];
                                                                                stringArray56[y.llIIlIll[0]] = llIIIIll[llIIlIll[154]];
                                                                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray56) ? 1 : 0)) {
                                                                                    int[] nArray35 = new int[llIIlIll[1]];
                                                                                    nArray35[y.llIIlIll[0]] = llIIlIll[143];
                                                                                    if (y.lIlIIllllII(Inventory.getCount((int[])nArray35)) && y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(gb), llIIlIll[3]) && y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(gc), llIIlIll[5])) {
                                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[155]];
                                                                                        Movement.walkTo((WorldPoint)gb);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray36 = new int[llIIlIll[1]];
                                                nArray36[y.llIIlIll[0]] = llIIlIll[41];
                                                if (y.lIlIIllIllI(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                                                    String[] stringArray = new String[llIIlIll[1]];
                                                    stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[156]];
                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray57 = new String[llIIlIll[1]];
                                                        stringArray57[y.llIIlIll[0]] = llIIIIll[llIIlIll[157]];
                                                        if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray57).getQuantity(), llIIlIll[11])) {
                                                            String[] stringArray58 = new String[llIIlIll[1]];
                                                            stringArray58[y.llIIlIll[0]] = llIIIIll[llIIlIll[158]];
                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray58) ? 1 : 0)) {
                                                                String[] stringArray59 = new String[llIIlIll[1]];
                                                                stringArray59[y.llIIlIll[0]] = llIIIIll[llIIlIll[159]];
                                                                if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray59).getQuantity(), llIIlIll[11])) {
                                                                    String[] stringArray60 = new String[llIIlIll[1]];
                                                                    stringArray60[y.llIIlIll[0]] = llIIIIll[llIIlIll[160]];
                                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray60) ? 1 : 0)) {
                                                                        String[] stringArray61 = new String[llIIlIll[1]];
                                                                        stringArray61[y.llIIlIll[0]] = llIIIIll[llIIlIll[161]];
                                                                        if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray61).getQuantity(), llIIlIll[11])) {
                                                                            String[] stringArray62 = new String[llIIlIll[1]];
                                                                            stringArray62[y.llIIlIll[0]] = llIIIIll[llIIlIll[162]];
                                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray62) ? 1 : 0)) {
                                                                                String[] stringArray63 = new String[llIIlIll[1]];
                                                                                stringArray63[y.llIIlIll[0]] = llIIIIll[llIIlIll[163]];
                                                                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray63) ? 1 : 0)) {
                                                                                    int[] nArray37 = new int[llIIlIll[1]];
                                                                                    nArray37[y.llIIlIll[0]] = llIIlIll[143];
                                                                                    if (y.lIlIIllllII(Inventory.getCount((int[])nArray37)) && y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(gb), llIIlIll[5])) {
                                                                                        int[] nArray38 = new int[llIIlIll[1]];
                                                                                        nArray38[y.llIIlIll[0]] = llIIlIll[143];
                                                                                        lIlIlIlIIIlIIll = Inventory.getFirst((int[])nArray38);
                                                                                        String[] stringArray64 = new String[llIIlIll[1]];
                                                                                        stringArray64[y.llIIlIll[0]] = llIIIIll[llIIlIll[164]];
                                                                                        lIlIlIlIIIlIIlI = TileObjects.getNearest((String[])stringArray64);
                                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIll) && y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                                                                                            lIlIlIlIIIlIIll.useOn((TileObject)lIlIlIlIIIlIIlI);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)fZ), (int)llIIlIll[165]);

                                                                                        }
                                                                                        while (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(gc), llIIlIll[3])) {
                                                                                            Movement.walkTo((WorldPoint)gc);

                                                                                            Time.sleepTicks((int)llIIlIll[1]);

                                                                                            if (3 == 3) continue;
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray39 = new int[llIIlIll[1]];
                                                nArray39[y.llIIlIll[0]] = llIIlIll[41];
                                                if (y.lIlIIllIllI(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                                                    String[] stringArray = new String[llIIlIll[1]];
                                                    stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[166]];
                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray65 = new String[llIIlIll[1]];
                                                        stringArray65[y.llIIlIll[0]] = llIIIIll[llIIlIll[167]];
                                                        if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray65).getQuantity(), llIIlIll[11])) {
                                                            String[] stringArray66 = new String[llIIlIll[1]];
                                                            stringArray66[y.llIIlIll[0]] = llIIIIll[llIIlIll[168]];
                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray66) ? 1 : 0)) {
                                                                String[] stringArray67 = new String[llIIlIll[1]];
                                                                stringArray67[y.llIIlIll[0]] = llIIIIll[llIIlIll[169]];
                                                                if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray67).getQuantity(), llIIlIll[11])) {
                                                                    String[] stringArray68 = new String[llIIlIll[1]];
                                                                    stringArray68[y.llIIlIll[0]] = llIIIIll[llIIlIll[170]];
                                                                    if (y.lIlIIllIllI(Inventory.contains((String[])stringArray68) ? 1 : 0)) {
                                                                        String[] stringArray69 = new String[llIIlIll[1]];
                                                                        stringArray69[y.llIIlIll[0]] = llIIIIll[llIIlIll[171]];
                                                                        if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray69).getQuantity(), llIIlIll[11])) {
                                                                            String[] stringArray70 = new String[llIIlIll[1]];
                                                                            stringArray70[y.llIIlIll[0]] = llIIIIll[llIIlIll[172]];
                                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray70) ? 1 : 0)) {
                                                                                String[] stringArray71 = new String[llIIlIll[1]];
                                                                                stringArray71[y.llIIlIll[0]] = llIIIIll[llIIlIll[173]];
                                                                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                                                                    int[] nArray40 = new int[llIIlIll[1]];
                                                                                    nArray40[y.llIIlIll[0]] = llIIlIll[143];
                                                                                    if (y.lIlIIllllII(Inventory.getCount((int[])nArray40)) && y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(gc), llIIlIll[5])) {
                                                                                        int[] nArray41 = new int[llIIlIll[1]];
                                                                                        nArray41[y.llIIlIll[0]] = llIIlIll[143];
                                                                                        lIlIlIlIIIlIIll = Inventory.getFirst((int[])nArray41);
                                                                                        String[] stringArray72 = new String[llIIlIll[1]];
                                                                                        stringArray72[y.llIIlIll[0]] = llIIIIll[llIIlIll[174]];
                                                                                        lIlIlIlIIIlIIlI = TileObjects.getNearest((String[])stringArray72);
                                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIll) && y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                                                                                            lIlIlIlIIIlIIlI.interact(llIIIIll[llIIlIll[175]]);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)fZ), (int)llIIlIll[165]);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (!y.lIlIIlllllI(e.j(llIIlIll[10]), llIIlIll[11])) break block270;
                                            int[] nArray = new int[llIIlIll[1]];
                                            nArray[y.llIIlIll[0]] = llIIlIll[41];
                                            if (y.lIlIIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                String[] stringArray = new String[llIIlIll[1]];
                                                stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[176]];
                                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                    String[] stringArray73 = new String[llIIlIll[1]];
                                                    stringArray73[y.llIIlIll[0]] = llIIIIll[llIIlIll[177]];
                                                    if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray73).getQuantity(), llIIlIll[11])) {
                                                        String[] stringArray74 = new String[llIIlIll[1]];
                                                        stringArray74[y.llIIlIll[0]] = llIIIIll[llIIlIll[178]];
                                                        if (y.lIlIIllIllI(Inventory.contains((String[])stringArray74) ? 1 : 0)) {
                                                            String[] stringArray75 = new String[llIIlIll[1]];
                                                            stringArray75[y.llIIlIll[0]] = llIIIIll[llIIlIll[179]];
                                                            if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray75).getQuantity(), llIIlIll[11])) {
                                                                String[] stringArray76 = new String[llIIlIll[1]];
                                                                stringArray76[y.llIIlIll[0]] = llIIIIll[llIIlIll[180]];
                                                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray76) ? 1 : 0)) {
                                                                    String[] stringArray77 = new String[llIIlIll[1]];
                                                                    stringArray77[y.llIIlIll[0]] = llIIIIll[llIIlIll[181]];
                                                                    if (y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray77).getQuantity(), llIIlIll[11])) {
                                                                        String[] stringArray78 = new String[llIIlIll[1]];
                                                                        stringArray78[y.llIIlIll[0]] = llIIIIll[llIIlIll[182]];
                                                                        if (y.lIlIIllIllI(Inventory.contains((String[])stringArray78) ? 1 : 0)) {
                                                                            String[] stringArray79 = new String[llIIlIll[1]];
                                                                            stringArray79[y.llIIlIll[0]] = llIIIIll[llIIlIll[183]];
                                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray79) ? 1 : 0)) {
                                                                                int[] nArray42 = new int[llIIlIll[1]];
                                                                                nArray42[y.llIIlIll[0]] = llIIlIll[143];
                                                                                if (y.lIlIIllllII(Inventory.getCount((int[])nArray42)) && y.lIlIIllIllI(fr.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(gi), llIIlIll[1])) {
                                                                                    AccBuilderBarrows.c = llIIIIll[llIIlIll[184]];
                                                                                    Movement.walkTo((WorldPoint)gi);

                                                                                    Time.sleepTicks((int)llIIlIll[6]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            int[] nArray43 = new int[llIIlIll[1]];
                                            nArray43[y.llIIlIll[0]] = llIIlIll[41];
                                            if (!y.lIlIIllIllI(Inventory.contains((int[])nArray43) ? 1 : 0)) break block248;
                                            String[] stringArray = new String[llIIlIll[1]];
                                            stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[185]];
                                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block248;
                                            String[] stringArray80 = new String[llIIlIll[1]];
                                            stringArray80[y.llIIlIll[0]] = llIIIIll[llIIlIll[186]];
                                            if (!y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray80).getQuantity(), llIIlIll[11])) break block248;
                                            String[] stringArray81 = new String[llIIlIll[1]];
                                            stringArray81[y.llIIlIll[0]] = llIIIIll[llIIlIll[187]];
                                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray81) ? 1 : 0)) break block248;
                                            String[] stringArray82 = new String[llIIlIll[1]];
                                            stringArray82[y.llIIlIll[0]] = llIIIIll[llIIlIll[188]];
                                            if (!y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray82).getQuantity(), llIIlIll[11])) break block248;
                                            String[] stringArray83 = new String[llIIlIll[1]];
                                            stringArray83[y.llIIlIll[0]] = llIIIIll[llIIlIll[189]];
                                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray83) ? 1 : 0)) break block248;
                                            String[] stringArray84 = new String[llIIlIll[1]];
                                            stringArray84[y.llIIlIll[0]] = llIIIIll[llIIlIll[190]];
                                            if (!y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray84).getQuantity(), llIIlIll[11])) break block248;
                                            String[] stringArray85 = new String[llIIlIll[1]];
                                            stringArray85[y.llIIlIll[0]] = llIIIIll[llIIlIll[191]];
                                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray85) ? 1 : 0)) break block248;
                                            String[] stringArray86 = new String[llIIlIll[1]];
                                            stringArray86[y.llIIlIll[0]] = llIIIIll[llIIlIll[192]];
                                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray86) ? 1 : 0)) break block248;
                                            int[] nArray44 = new int[llIIlIll[1]];
                                            nArray44[y.llIIlIll[0]] = llIIlIll[143];
                                            if (!y.lIlIIllllII(Inventory.getCount((int[])nArray44)) || !y.lIlIIllIllI(fr.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(gi), llIIlIll[3])) break block248;
                                            AccBuilderBarrows.c = llIIIIll[llIIlIll[193]];
                                            do {
                                                block272: {
                                                    block273: {
                                                        block271: {
                                                            String[] stringArray87 = new String[llIIlIll[1]];
                                                            stringArray87[y.llIIlIll[0]] = llIIIIll[llIIlIll[194]];
                                                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray87) ? 1 : 0)) break block271;
                                                            String[] stringArray88 = new String[llIIlIll[1]];
                                                            stringArray88[y.llIIlIll[0]] = llIIIIll[llIIlIll[195]];
                                                            if (!y.lIlIIllIlll(Inventory.getFirst((String[])stringArray88).getQuantity(), llIIlIll[11])) break block272;
                                                        }
                                                        String[] stringArray89 = new String[llIIlIll[1]];
                                                        stringArray89[y.llIIlIll[0]] = llIIIIll[llIIlIll[196]];
                                                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray89) ? 1 : 0)) break block273;
                                                        String[] stringArray90 = new String[llIIlIll[1]];
                                                        stringArray90[y.llIIlIll[0]] = llIIIIll[llIIlIll[197]];
                                                        if (!y.lIlIIllIlll(Inventory.getFirst((String[])stringArray90).getQuantity(), llIIlIll[11])) break block272;
                                                    }
                                                    String[] stringArray91 = new String[llIIlIll[1]];
                                                    stringArray91[y.llIIlIll[0]] = llIIIIll[llIIlIll[198]];
                                                    if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray91) ? 1 : 0)) break block248;
                                                    String[] stringArray92 = new String[llIIlIll[1]];
                                                    stringArray92[y.llIIlIll[0]] = llIIIIll[llIIlIll[199]];
                                                    if (!y.lIlIIlllIlI(Inventory.getFirst((String[])stringArray92).getQuantity(), llIIlIll[11])) break block248;
                                                }
                                                if (!y.lIlIIlllIII(AccBuilderBarrows.d ? 1 : 0)) break block248;
                                                int[] nArray45 = new int[llIIlIll[1]];
                                                nArray45[y.llIIlIll[0]] = llIIlIll[200];
                                                lIlIlIlIIIlIIll = TileObjects.getFirstAt((WorldPoint)fs, (int[])nArray45);
                                                String[] stringArray93 = new String[llIIlIll[1]];
                                                stringArray93[y.llIIlIll[0]] = llIIIIll[llIIlIll[201]];
                                                Inventory.getFirst((String[])stringArray93).useOn((TileObject)lIlIlIlIIIlIIll);
                                                Time.sleepTicks((int)llIIlIll[1]);

                                                String[] stringArray94 = new String[llIIlIll[1]];
                                                stringArray94[y.llIIlIll[0]] = llIIIIll[llIIlIll[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)lIlIlIlIIIlIIll);
                                                Time.sleepTicks((int)llIIlIll[1]);

                                                String[] stringArray95 = new String[llIIlIll[1]];
                                                stringArray95[y.llIIlIll[0]] = llIIIIll[llIIlIll[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)lIlIlIlIIIlIIll);
                                                Time.sleepTicks((int)llIIlIll[1]);

                                            } while (-2 <= 0);
                                            return;
                                        }
                                        int[] nArray = new int[llIIlIll[1]];
                                        nArray[y.llIIlIll[0]] = llIIlIll[41];
                                        if (!y.lIlIIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block249;
                                        String[] stringArray = new String[llIIlIll[1]];
                                        stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[204]];
                                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block249;
                                        String[] stringArray96 = new String[llIIlIll[1]];
                                        stringArray96[y.llIIlIll[0]] = llIIIIll[llIIlIll[205]];
                                        if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray96).getQuantity(), llIIlIll[7])) break block249;
                                        String[] stringArray97 = new String[llIIlIll[1]];
                                        stringArray97[y.llIIlIll[0]] = llIIIIll[llIIlIll[206]];
                                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray97) ? 1 : 0)) break block249;
                                        String[] stringArray98 = new String[llIIlIll[1]];
                                        stringArray98[y.llIIlIll[0]] = llIIIIll[llIIlIll[207]];
                                        if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray98).getQuantity(), llIIlIll[7])) break block249;
                                        String[] stringArray99 = new String[llIIlIll[1]];
                                        stringArray99[y.llIIlIll[0]] = llIIIIll[llIIlIll[208]];
                                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray99) ? 1 : 0)) break block249;
                                        String[] stringArray100 = new String[llIIlIll[1]];
                                        stringArray100[y.llIIlIll[0]] = llIIIIll[llIIlIll[209]];
                                        if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray100).getQuantity(), llIIlIll[7])) break block249;
                                        String[] stringArray101 = new String[llIIlIll[1]];
                                        stringArray101[y.llIIlIll[0]] = llIIIIll[llIIlIll[210]];
                                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray101) ? 1 : 0)) break block249;
                                        String[] stringArray102 = new String[llIIlIll[1]];
                                        stringArray102[y.llIIlIll[0]] = llIIIIll[llIIlIll[211]];
                                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray102) ? 1 : 0)) break block249;
                                        int[] nArray46 = new int[llIIlIll[1]];
                                        nArray46[y.llIIlIll[0]] = llIIlIll[143];
                                        if (!y.lIlIIllllII(Inventory.getCount((int[])nArray46)) || !y.lIlIIllIllI(fr.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(gh), llIIlIll[1])) break block249;
                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[212]];
                                        while (true) {
                                            block275: {
                                                block276: {
                                                    block274: {
                                                        String[] stringArray103 = new String[llIIlIll[1]];
                                                        stringArray103[y.llIIlIll[0]] = llIIIIll[llIIlIll[213]];
                                                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray103) ? 1 : 0)) break block274;
                                                        String[] stringArray104 = new String[llIIlIll[1]];
                                                        stringArray104[y.llIIlIll[0]] = llIIIIll[llIIlIll[214]];
                                                        if (!y.lIlIIllllll(Inventory.getFirst((String[])stringArray104).getQuantity(), llIIlIll[7])) break block275;
                                                    }
                                                    String[] stringArray105 = new String[llIIlIll[1]];
                                                    stringArray105[y.llIIlIll[0]] = llIIIIll[llIIlIll[215]];
                                                    if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray105) ? 1 : 0)) break block276;
                                                    String[] stringArray106 = new String[llIIlIll[1]];
                                                    stringArray106[y.llIIlIll[0]] = llIIIIll[llIIlIll[216]];
                                                    if (!y.lIlIIllllll(Inventory.getFirst((String[])stringArray106).getQuantity(), llIIlIll[7])) break block275;
                                                }
                                                String[] stringArray107 = new String[llIIlIll[1]];
                                                stringArray107[y.llIIlIll[0]] = llIIIIll[llIIlIll[217]];
                                                if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray107) ? 1 : 0)) break block249;
                                                String[] stringArray108 = new String[llIIlIll[1]];
                                                stringArray108[y.llIIlIll[0]] = llIIIIll[llIIlIll[218]];
                                                if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray108).getQuantity(), llIIlIll[7])) break block249;
                                            }
                                            if (!y.lIlIIlllIII(AccBuilderBarrows.d ? 1 : 0)) break block249;
                                            if (y.lIlIIlllIII(Players.getLocal().getWorldLocation().equals((Object)gh) ? 1 : 0)) {
                                                Movement.walkTo((WorldPoint)gh);

                                                Time.sleepTicks((int)llIIlIll[5]);

                                            }
                                            if (!y.lIlIIllIllI(Players.getLocal().getWorldLocation().equals((Object)gh) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[llIIlIll[1]];
                                            nArray47[y.llIIlIll[0]] = llIIlIll[200];
                                            lIlIlIlIIIlIIll = TileObjects.getFirstAt((WorldPoint)ft, (int[])nArray47);
                                            String[] stringArray109 = new String[llIIlIll[1]];
                                            stringArray109[y.llIIlIll[0]] = llIIIIll[llIIlIll[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)lIlIlIlIIIlIIll);
                                            Time.sleepTicks((int)llIIlIll[1]);

                                            String[] stringArray110 = new String[llIIlIll[1]];
                                            stringArray110[y.llIIlIll[0]] = llIIIIll[llIIlIll[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)lIlIlIlIIIlIIll);
                                            Time.sleepTicks((int)llIIlIll[1]);

                                            String[] stringArray111 = new String[llIIlIll[1]];
                                            stringArray111[y.llIIlIll[0]] = llIIIIll[llIIlIll[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)lIlIlIlIIIlIIll);
                                            Time.sleepTicks((int)llIIlIll[1]);

                                            if (((0x74 ^ 0x62) & ~(0xBB ^ 0xAD)) == 2) break;
                                        }
                                        return;
                                    }
                                    int[] nArray = new int[llIIlIll[1]];
                                    nArray[y.llIIlIll[0]] = llIIlIll[41];
                                    if (!y.lIlIIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block250;
                                    String[] stringArray = new String[llIIlIll[1]];
                                    stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[222]];
                                    if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block250;
                                    String[] stringArray112 = new String[llIIlIll[1]];
                                    stringArray112[y.llIIlIll[0]] = llIIIIll[llIIlIll[223]];
                                    if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray112).getQuantity(), llIIlIll[6])) break block250;
                                    String[] stringArray113 = new String[llIIlIll[1]];
                                    stringArray113[y.llIIlIll[0]] = llIIIIll[llIIlIll[224]];
                                    if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray113) ? 1 : 0)) break block250;
                                    String[] stringArray114 = new String[llIIlIll[1]];
                                    stringArray114[y.llIIlIll[0]] = llIIIIll[llIIlIll[225]];
                                    if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray114).getQuantity(), llIIlIll[6])) break block250;
                                    String[] stringArray115 = new String[llIIlIll[1]];
                                    stringArray115[y.llIIlIll[0]] = llIIIIll[llIIlIll[226]];
                                    if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray115) ? 1 : 0)) break block250;
                                    String[] stringArray116 = new String[llIIlIll[1]];
                                    stringArray116[y.llIIlIll[0]] = llIIIIll[llIIlIll[227]];
                                    if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray116).getQuantity(), llIIlIll[6])) break block250;
                                    String[] stringArray117 = new String[llIIlIll[1]];
                                    stringArray117[y.llIIlIll[0]] = llIIIIll[llIIlIll[228]];
                                    if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray117) ? 1 : 0)) break block250;
                                    String[] stringArray118 = new String[llIIlIll[1]];
                                    stringArray118[y.llIIlIll[0]] = llIIIIll[llIIlIll[229]];
                                    if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray118) ? 1 : 0)) break block250;
                                    int[] nArray48 = new int[llIIlIll[1]];
                                    nArray48[y.llIIlIll[0]] = llIIlIll[143];
                                    if (!y.lIlIIllllII(Inventory.getCount((int[])nArray48)) || !y.lIlIIllIllI(fr.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block250;
                                    AccBuilderBarrows.c = llIIIIll[llIIlIll[230]];
                                    while (true) {
                                        block278: {
                                            block279: {
                                                block277: {
                                                    String[] stringArray119 = new String[llIIlIll[1]];
                                                    stringArray119[y.llIIlIll[0]] = llIIIIll[llIIlIll[231]];
                                                    if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray119) ? 1 : 0)) break block277;
                                                    String[] stringArray120 = new String[llIIlIll[1]];
                                                    stringArray120[y.llIIlIll[0]] = llIIIIll[llIIlIll[232]];
                                                    if (!y.lIlIIllllll(Inventory.getFirst((String[])stringArray120).getQuantity(), llIIlIll[6])) break block278;
                                                }
                                                String[] stringArray121 = new String[llIIlIll[1]];
                                                stringArray121[y.llIIlIll[0]] = llIIIIll[llIIlIll[233]];
                                                if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray121) ? 1 : 0)) break block279;
                                                String[] stringArray122 = new String[llIIlIll[1]];
                                                stringArray122[y.llIIlIll[0]] = llIIIIll[llIIlIll[234]];
                                                if (!y.lIlIIllllll(Inventory.getFirst((String[])stringArray122).getQuantity(), llIIlIll[6])) break block278;
                                            }
                                            String[] stringArray123 = new String[llIIlIll[1]];
                                            stringArray123[y.llIIlIll[0]] = llIIIIll[llIIlIll[235]];
                                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray123) ? 1 : 0)) break block250;
                                            String[] stringArray124 = new String[llIIlIll[1]];
                                            stringArray124[y.llIIlIll[0]] = llIIIIll[llIIlIll[236]];
                                            if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray124).getQuantity(), llIIlIll[6])) break block250;
                                        }
                                        if (!y.lIlIIlllIII(AccBuilderBarrows.d ? 1 : 0)) break block250;
                                        if (y.lIlIIlllIII(Players.getLocal().getWorldLocation().equals((Object)gg) ? 1 : 0)) {
                                            Movement.walkTo((WorldPoint)gg);

                                            Time.sleepTicks((int)llIIlIll[5]);

                                        }
                                        if (!y.lIlIIllIllI(Players.getLocal().getWorldLocation().equals((Object)gg) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[llIIlIll[1]];
                                        nArray49[y.llIIlIll[0]] = llIIlIll[200];
                                        lIlIlIlIIIlIIll = TileObjects.getFirstAt((WorldPoint)fu, (int[])nArray49);
                                        String[] stringArray125 = new String[llIIlIll[1]];
                                        stringArray125[y.llIIlIll[0]] = llIIIIll[llIIlIll[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)lIlIlIlIIIlIIll);
                                        Time.sleepTicks((int)llIIlIll[1]);

                                        String[] stringArray126 = new String[llIIlIll[1]];
                                        stringArray126[y.llIIlIll[0]] = llIIIIll[llIIlIll[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)lIlIlIlIIIlIIll);
                                        Time.sleepTicks((int)llIIlIll[1]);

                                        String[] stringArray127 = new String[llIIlIll[1]];
                                        stringArray127[y.llIIlIll[0]] = llIIIIll[llIIlIll[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)lIlIlIlIIIlIIll);
                                        Time.sleepTicks((int)llIIlIll[1]);

                                        if ((0x64 ^ 0x5D ^ (0x1D ^ 0x20)) == 0) break;
                                    }
                                    return;
                                }
                                int[] nArray = new int[llIIlIll[1]];
                                nArray[y.llIIlIll[0]] = llIIlIll[41];
                                if (!y.lIlIIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block251;
                                String[] stringArray = new String[llIIlIll[1]];
                                stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[240]];
                                if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block251;
                                String[] stringArray128 = new String[llIIlIll[1]];
                                stringArray128[y.llIIlIll[0]] = llIIIIll[llIIlIll[241]];
                                if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray128).getQuantity(), llIIlIll[5])) break block251;
                                String[] stringArray129 = new String[llIIlIll[1]];
                                stringArray129[y.llIIlIll[0]] = llIIIIll[llIIlIll[242]];
                                if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray129) ? 1 : 0)) break block251;
                                String[] stringArray130 = new String[llIIlIll[1]];
                                stringArray130[y.llIIlIll[0]] = llIIIIll[llIIlIll[243]];
                                if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray130).getQuantity(), llIIlIll[5])) break block251;
                                String[] stringArray131 = new String[llIIlIll[1]];
                                stringArray131[y.llIIlIll[0]] = llIIIIll[llIIlIll[244]];
                                if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray131) ? 1 : 0)) break block251;
                                String[] stringArray132 = new String[llIIlIll[1]];
                                stringArray132[y.llIIlIll[0]] = llIIIIll[llIIlIll[245]];
                                if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray132).getQuantity(), llIIlIll[5])) break block251;
                                String[] stringArray133 = new String[llIIlIll[1]];
                                stringArray133[y.llIIlIll[0]] = llIIIIll[llIIlIll[246]];
                                if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray133) ? 1 : 0)) break block251;
                                String[] stringArray134 = new String[llIIlIll[1]];
                                stringArray134[y.llIIlIll[0]] = llIIIIll[llIIlIll[247]];
                                if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray134) ? 1 : 0)) break block251;
                                int[] nArray50 = new int[llIIlIll[1]];
                                nArray50[y.llIIlIll[0]] = llIIlIll[143];
                                if (!y.lIlIIllllII(Inventory.getCount((int[])nArray50)) || !y.lIlIIllIllI(fr.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block251;
                                AccBuilderBarrows.c = llIIIIll[llIIlIll[248]];
                                while (true) {
                                    block281: {
                                        block282: {
                                            block280: {
                                                String[] stringArray135 = new String[llIIlIll[1]];
                                                stringArray135[y.llIIlIll[0]] = llIIIIll[llIIlIll[249]];
                                                if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray135) ? 1 : 0)) break block280;
                                                String[] stringArray136 = new String[llIIlIll[1]];
                                                stringArray136[y.llIIlIll[0]] = llIIIIll[llIIlIll[250]];
                                                if (!y.lIlIIllllll(Inventory.getFirst((String[])stringArray136).getQuantity(), llIIlIll[5])) break block281;
                                            }
                                            String[] stringArray137 = new String[llIIlIll[1]];
                                            stringArray137[y.llIIlIll[0]] = llIIIIll[llIIlIll[251]];
                                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray137) ? 1 : 0)) break block282;
                                            String[] stringArray138 = new String[llIIlIll[1]];
                                            stringArray138[y.llIIlIll[0]] = llIIIIll[llIIlIll[252]];
                                            if (!y.lIlIIllllll(Inventory.getFirst((String[])stringArray138).getQuantity(), llIIlIll[5])) break block281;
                                        }
                                        String[] stringArray139 = new String[llIIlIll[1]];
                                        stringArray139[y.llIIlIll[0]] = llIIIIll[llIIlIll[8]];
                                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray139) ? 1 : 0)) break block251;
                                        String[] stringArray140 = new String[llIIlIll[1]];
                                        stringArray140[y.llIIlIll[0]] = llIIIIll[llIIlIll[253]];
                                        if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray140).getQuantity(), llIIlIll[5])) break block251;
                                    }
                                    if (!y.lIlIIlllIII(AccBuilderBarrows.d ? 1 : 0)) break block251;
                                    if (y.lIlIIlllIII(Players.getLocal().getWorldLocation().equals((Object)gf) ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)gf);

                                        Time.sleepTicks((int)llIIlIll[5]);

                                    }
                                    if (!y.lIlIIllIllI(Players.getLocal().getWorldLocation().equals((Object)gf) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[llIIlIll[1]];
                                    nArray51[y.llIIlIll[0]] = llIIlIll[200];
                                    lIlIlIlIIIlIIll = TileObjects.getFirstAt((WorldPoint)fv, (int[])nArray51);
                                    String[] stringArray141 = new String[llIIlIll[1]];
                                    stringArray141[y.llIIlIll[0]] = llIIIIll[llIIlIll[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[1]);

                                    String[] stringArray142 = new String[llIIlIll[1]];
                                    stringArray142[y.llIIlIll[0]] = llIIIIll[llIIlIll[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[1]);

                                    String[] stringArray143 = new String[llIIlIll[1]];
                                    stringArray143[y.llIIlIll[0]] = llIIIIll[llIIlIll[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[1]);

                                    if (3 <= 0) break;
                                }
                                return;
                            }
                            int[] nArray = new int[llIIlIll[1]];
                            nArray[y.llIIlIll[0]] = llIIlIll[41];
                            if (!y.lIlIIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block252;
                            String[] stringArray = new String[llIIlIll[1]];
                            stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[257]];
                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block252;
                            String[] stringArray144 = new String[llIIlIll[1]];
                            stringArray144[y.llIIlIll[0]] = llIIIIll[llIIlIll[258]];
                            if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray144).getQuantity(), llIIlIll[3])) break block252;
                            String[] stringArray145 = new String[llIIlIll[1]];
                            stringArray145[y.llIIlIll[0]] = llIIIIll[llIIlIll[259]];
                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray145) ? 1 : 0)) break block252;
                            String[] stringArray146 = new String[llIIlIll[1]];
                            stringArray146[y.llIIlIll[0]] = llIIIIll[llIIlIll[260]];
                            if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray146).getQuantity(), llIIlIll[3])) break block252;
                            String[] stringArray147 = new String[llIIlIll[1]];
                            stringArray147[y.llIIlIll[0]] = llIIIIll[llIIlIll[261]];
                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray147) ? 1 : 0)) break block252;
                            String[] stringArray148 = new String[llIIlIll[1]];
                            stringArray148[y.llIIlIll[0]] = llIIIIll[llIIlIll[262]];
                            if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray148).getQuantity(), llIIlIll[3])) break block252;
                            String[] stringArray149 = new String[llIIlIll[1]];
                            stringArray149[y.llIIlIll[0]] = llIIIIll[llIIlIll[263]];
                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray149) ? 1 : 0)) break block252;
                            String[] stringArray150 = new String[llIIlIll[1]];
                            stringArray150[y.llIIlIll[0]] = llIIIIll[llIIlIll[264]];
                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray150) ? 1 : 0)) break block252;
                            int[] nArray52 = new int[llIIlIll[1]];
                            nArray52[y.llIIlIll[0]] = llIIlIll[143];
                            if (!y.lIlIIllllII(Inventory.getCount((int[])nArray52)) || !y.lIlIIllIllI(fr.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block252;
                            AccBuilderBarrows.c = llIIIIll[llIIlIll[265]];
                            while (true) {
                                block284: {
                                    block285: {
                                        block283: {
                                            String[] stringArray151 = new String[llIIlIll[1]];
                                            stringArray151[y.llIIlIll[0]] = llIIIIll[llIIlIll[266]];
                                            if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray151) ? 1 : 0)) break block283;
                                            String[] stringArray152 = new String[llIIlIll[1]];
                                            stringArray152[y.llIIlIll[0]] = llIIIIll[llIIlIll[267]];
                                            if (!y.lIlIIllllll(Inventory.getFirst((String[])stringArray152).getQuantity(), llIIlIll[3])) break block284;
                                        }
                                        String[] stringArray153 = new String[llIIlIll[1]];
                                        stringArray153[y.llIIlIll[0]] = llIIIIll[llIIlIll[268]];
                                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray153) ? 1 : 0)) break block285;
                                        String[] stringArray154 = new String[llIIlIll[1]];
                                        stringArray154[y.llIIlIll[0]] = llIIIIll[llIIlIll[269]];
                                        if (!y.lIlIIllllll(Inventory.getFirst((String[])stringArray154).getQuantity(), llIIlIll[3])) break block284;
                                    }
                                    String[] stringArray155 = new String[llIIlIll[1]];
                                    stringArray155[y.llIIlIll[0]] = llIIIIll[llIIlIll[270]];
                                    if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray155) ? 1 : 0)) break block252;
                                    String[] stringArray156 = new String[llIIlIll[1]];
                                    stringArray156[y.llIIlIll[0]] = llIIIIll[llIIlIll[271]];
                                    if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray156).getQuantity(), llIIlIll[3])) break block252;
                                }
                                if (!y.lIlIIlllIII(AccBuilderBarrows.d ? 1 : 0)) break block252;
                                if (y.lIlIIlllIII(Players.getLocal().getWorldLocation().equals((Object)ge) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)ge);

                                    Time.sleepTicks((int)llIIlIll[5]);

                                }
                                if (!y.lIlIIllIllI(Players.getLocal().getWorldLocation().equals((Object)ge) ? 1 : 0)) continue;
                                int[] nArray53 = new int[llIIlIll[1]];
                                nArray53[y.llIIlIll[0]] = llIIlIll[200];
                                lIlIlIlIIIlIIll = TileObjects.getFirstAt((WorldPoint)fw, (int[])nArray53);
                                String[] stringArray157 = new String[llIIlIll[1]];
                                stringArray157[y.llIIlIll[0]] = llIIIIll[llIIlIll[272]];
                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray157) ? 1 : 0)) {
                                    String[] stringArray158 = new String[llIIlIll[1]];
                                    stringArray158[y.llIIlIll[0]] = llIIIIll[llIIlIll[273]];
                                    Inventory.getFirst((String[])stringArray158).useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[1]);

                                }
                                String[] stringArray159 = new String[llIIlIll[1]];
                                stringArray159[y.llIIlIll[0]] = llIIIIll[llIIlIll[274]];
                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[llIIlIll[1]];
                                    stringArray160[y.llIIlIll[0]] = llIIIIll[llIIlIll[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[1]);

                                }
                                String[] stringArray161 = new String[llIIlIll[1]];
                                stringArray161[y.llIIlIll[0]] = llIIIIll[llIIlIll[276]];
                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[llIIlIll[1]];
                                    stringArray162[y.llIIlIll[0]] = llIIIIll[llIIlIll[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[1]);

                                }

                                if (-(0x8B ^ 0x99 ^ (0x77 ^ 0x61)) >= 0) break;
                            }
                            return;
                        }
                        int[] nArray = new int[llIIlIll[1]];
                        nArray[y.llIIlIll[0]] = llIIlIll[41];
                        if (!y.lIlIIllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block253;
                        String[] stringArray = new String[llIIlIll[1]];
                        stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[278]];
                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block253;
                        String[] stringArray163 = new String[llIIlIll[1]];
                        stringArray163[y.llIIlIll[0]] = llIIIIll[llIIlIll[279]];
                        if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray163).getQuantity(), llIIlIll[1])) break block253;
                        String[] stringArray164 = new String[llIIlIll[1]];
                        stringArray164[y.llIIlIll[0]] = llIIIIll[llIIlIll[280]];
                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray164) ? 1 : 0)) break block253;
                        String[] stringArray165 = new String[llIIlIll[1]];
                        stringArray165[y.llIIlIll[0]] = llIIIIll[llIIlIll[281]];
                        if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray165).getQuantity(), llIIlIll[1])) break block253;
                        String[] stringArray166 = new String[llIIlIll[1]];
                        stringArray166[y.llIIlIll[0]] = llIIIIll[llIIlIll[282]];
                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray166) ? 1 : 0)) break block253;
                        String[] stringArray167 = new String[llIIlIll[1]];
                        stringArray167[y.llIIlIll[0]] = llIIIIll[llIIlIll[283]];
                        if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray167).getQuantity(), llIIlIll[1])) break block253;
                        String[] stringArray168 = new String[llIIlIll[1]];
                        stringArray168[y.llIIlIll[0]] = llIIIIll[llIIlIll[284]];
                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray168) ? 1 : 0)) break block253;
                        String[] stringArray169 = new String[llIIlIll[1]];
                        stringArray169[y.llIIlIll[0]] = llIIIIll[llIIlIll[285]];
                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray169) ? 1 : 0)) break block253;
                        int[] nArray54 = new int[llIIlIll[1]];
                        nArray54[y.llIIlIll[0]] = llIIlIll[143];
                        if (!y.lIlIIllllII(Inventory.getCount((int[])nArray54)) || !y.lIlIIllIllI(fr.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block253;
                        AccBuilderBarrows.c = llIIIIll[llIIlIll[286]];
                        while (true) {
                            block287: {
                                block288: {
                                    block286: {
                                        String[] stringArray170 = new String[llIIlIll[1]];
                                        stringArray170[y.llIIlIll[0]] = llIIIIll[llIIlIll[287]];
                                        if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray170) ? 1 : 0)) break block286;
                                        String[] stringArray171 = new String[llIIlIll[1]];
                                        stringArray171[y.llIIlIll[0]] = llIIIIll[llIIlIll[288]];
                                        if (!y.lIlIIllllll(Inventory.getFirst((String[])stringArray171).getQuantity(), llIIlIll[1])) break block287;
                                    }
                                    String[] stringArray172 = new String[llIIlIll[1]];
                                    stringArray172[y.llIIlIll[0]] = llIIIIll[llIIlIll[289]];
                                    if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray172) ? 1 : 0)) break block288;
                                    String[] stringArray173 = new String[llIIlIll[1]];
                                    stringArray173[y.llIIlIll[0]] = llIIIIll[llIIlIll[290]];
                                    if (!y.lIlIIllllll(Inventory.getFirst((String[])stringArray173).getQuantity(), llIIlIll[1])) break block287;
                                }
                                String[] stringArray174 = new String[llIIlIll[1]];
                                stringArray174[y.llIIlIll[0]] = llIIIIll[llIIlIll[291]];
                                if (!y.lIlIIllIllI(Inventory.contains((String[])stringArray174) ? 1 : 0)) break block253;
                                String[] stringArray175 = new String[llIIlIll[1]];
                                stringArray175[y.llIIlIll[0]] = llIIIIll[llIIlIll[292]];
                                if (!y.lIlIIlllllI(Inventory.getFirst((String[])stringArray175).getQuantity(), llIIlIll[1])) break block253;
                            }
                            if (!y.lIlIIlllIII(AccBuilderBarrows.d ? 1 : 0)) break block253;
                            if (y.lIlIIlllIII(Players.getLocal().getWorldLocation().equals((Object)gd) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)gd);

                            }
                            if (!y.lIlIIllIllI(Players.getLocal().getWorldLocation().equals((Object)gd) ? 1 : 0)) continue;
                            int[] nArray55 = new int[llIIlIll[1]];
                            nArray55[y.llIIlIll[0]] = llIIlIll[200];
                            lIlIlIlIIIlIIll = TileObjects.getFirstAt((WorldPoint)fx, (int[])nArray55);
                            String[] stringArray176 = new String[llIIlIll[1]];
                            stringArray176[y.llIIlIll[0]] = llIIIIll[llIIlIll[293]];
                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray176) ? 1 : 0)) {
                                String[] stringArray177 = new String[llIIlIll[1]];
                                stringArray177[y.llIIlIll[0]] = llIIIIll[llIIlIll[294]];
                                Inventory.getFirst((String[])stringArray177).useOn((TileObject)lIlIlIlIIIlIIll);
                                Time.sleepTicks((int)llIIlIll[1]);

                            }
                            String[] stringArray178 = new String[llIIlIll[1]];
                            stringArray178[y.llIIlIll[0]] = llIIIIll[llIIlIll[295]];
                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[llIIlIll[1]];
                                stringArray179[y.llIIlIll[0]] = llIIIIll[llIIlIll[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)lIlIlIlIIIlIIll);
                                Time.sleepTicks((int)llIIlIll[1]);

                            }
                            String[] stringArray180 = new String[llIIlIll[1]];
                            stringArray180[y.llIIlIll[0]] = llIIIIll[llIIlIll[297]];
                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[llIIlIll[1]];
                                stringArray181[y.llIIlIll[0]] = llIIIIll[llIIlIll[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)lIlIlIlIIIlIIll);
                                Time.sleepTicks((int)llIIlIll[1]);

                            }

                            if (-1 == 1) break;
                        }
                        return;
                    }
                    String[] stringArray = new String[llIIlIll[1]];
                    stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[299]];
                    if (y.lIlIIlllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray182 = new String[llIIlIll[1]];
                        stringArray182[y.llIIlIll[0]] = llIIIIll[llIIlIll[300]];
                        if (y.lIlIIlllIII(Inventory.contains((String[])stringArray182) ? 1 : 0)) {
                            String[] stringArray183 = new String[llIIlIll[1]];
                            stringArray183[y.llIIlIll[0]] = llIIIIll[llIIlIll[301]];
                            if (y.lIlIIlllIII(Inventory.contains((String[])stringArray183) ? 1 : 0)) {
                                AccBuilderBarrows.c = llIIIIll[llIIlIll[302]];
                                int[] nArray = new int[llIIlIll[1]];
                                nArray[y.llIIlIll[0]] = llIIlIll[303];
                                lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray);
                                int[] nArray56 = new int[llIIlIll[1]];
                                nArray56[y.llIIlIll[0]] = llIIlIll[304];
                                lIlIlIlIIIlIIlI = Inventory.getFirst((int[])nArray56);
                                if (y.lIlIIlllIll(lIlIlIlIIIlIIll) && y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                                    lIlIlIlIIIlIIlI.useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[5]);

                                }
                            }
                        }
                    }
                }
                if (y.lIlIIlllllI(e.j(llIIlIll[10]), llIIlIll[13])) {
                    AccBuilderBarrows.c = llIIIIll[llIIlIll[305]];
                    int[] nArray = new int[llIIlIll[1]];
                    nArray[y.llIIlIll[0]] = llIIlIll[306];
                    lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray);
                    int[] nArray57 = new int[llIIlIll[1]];
                    nArray57[y.llIIlIll[0]] = llIIlIll[307];
                    lIlIlIlIIIlIIlI = Inventory.getFirst((int[])nArray57);
                    if (y.lIlIIllIlll(ci, llIIlIll[1])) {
                        Q.jM += llIIlIll[1];
                        Q.o(AccBuilderBarrows.m);
                        ci += llIIlIll[1];
                        Q.jM = llIIlIll[0];
                        cj = llIIlIll[0];
                    }
                    if (y.lIlIIlllIll(lIlIlIlIIIlIIll) && y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                        lIlIlIlIIIlIIlI.useOn((TileObject)lIlIlIlIIIlIIll);
                        Time.sleepTicks((int)llIIlIll[7]);

                        g.a(gx);
                    }
                }
                if (!y.lIlIIlllllI(e.j(llIIlIll[10]), llIIlIll[19])) break block254;
                String[] stringArray = new String[llIIlIll[1]];
                stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[308]];
                if (!y.lIlIlIIIIII(TileObjects.getNearest((String[])stringArray))) break block289;
                String[] stringArray184 = new String[llIIlIll[1]];
                stringArray184[y.llIIlIll[0]] = llIIIIll[llIIlIll[309]];
                if (!y.lIlIIlllIll(TileObjects.getNearest((String[])stringArray184))) break block254;
            }
            String[] stringArray = new String[llIIlIll[1]];
            stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[310]];
            if (y.lIlIIlllIll(TileObjects.getNearest((String[])stringArray))) {
                AccBuilderBarrows.c = llIIIIll[llIIlIll[311]];
                if (y.lIlIIlllIII(Equipment.contains((int[])f.aT) ? 1 : 0) && y.lIlIIllIllI(Inventory.contains((int[])f.aT) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aT).interact(llIIIIll[llIIlIll[312]]);
                    Time.sleepTicks((int)llIIlIll[6]);

                }
                if (y.lIlIIllIllI(Equipment.contains((int[])f.aT) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aT).interact(llIIIIll[llIIlIll[313]]);
                    Time.sleepTicks((int)llIIlIll[6]);

                }
            }
        }
    }

    @Override
    public boolean W() {
        boolean bl;
        if (y.lIlIIlllIlI(e.j(llIIlIll[10]), llIIlIll[19])) {
            bl = llIIlIll[1];

            if (2 >= (0x22 ^ 0x2C ^ (0x61 ^ 0x6B))) {
                return ((15 + 2 - -55 + 71 ^ 108 + 109 - 142 + 87) & (0x3A ^ 0xA ^ (0x2F ^ 0x32) ^ -1)) != 0;
            }
        } else {
            bl = llIIlIll[0];
        }
        return bl;
    }

    private static void lIlIIllIlII() {
        llIIIIll = new String[llIIlIll[413]];
        y.llIIIIll[y.llIIlIll[0]] = "Buying items";
        y.llIIIIll[y.llIIlIll[1]] = "Finished buying items, switching back to questing";
        y.llIIIIll[y.llIIlIll[3]] = "Drink";
        y.llIIIIll[y.llIIlIll[5]] = "Shark";
        y.llIIIIll[y.llIIlIll[6]] = "Shark";
        y.llIIIIll[y.llIIlIll[7]] = "Eat";
        y.llIIIIll[y.llIIlIll[11]] = "Navigating to bank";
        y.llIIIIll[y.llIIlIll[9]] = "Opening bank";
        y.llIIIIll[y.llIIlIll[13]] = "Handling banking";
        y.llIIIIll[y.llIIlIll[17]] = "We are missing runessupplies, switching to BUYING";
        y.llIIIIll[y.llIIlIll[19]] = "Rope";
        y.llIIIIll[y.llIIlIll[21]] = "Shark";
        y.llIIIIll[y.llIIlIll[22]] = "We are missing supplies, switching to BUYING";
        y.llIIIIll[y.llIIlIll[23]] = "Rope";
        y.llIIIIll[y.llIIlIll[4]] = "Shark";
        y.llIIIIll[y.llIIlIll[26]] = "Drink";
        y.llIIIIll[y.llIIlIll[27]] = "Nav to start";
        y.llIIIIll[y.llIIlIll[28]] = "Chatting";
        y.llIIIIll[y.llIIlIll[25]] = "Nav to boy";
        y.llIIIIll[y.llIIlIll[29]] = "Chat boy";
        y.llIIIIll[y.llIIlIll[30]] = "Nav to bookcase";
        y.llIIIIll[y.llIIlIll[32]] = "Book on baxtorian";
        y.llIIIIll[y.llIIlIll[33]] = "Searching bookcase";
        y.llIIIIll[y.llIIlIll[34]] = "Search";
        y.llIIIIll[y.llIIlIll[35]] = "Book on baxtorian";
        y.llIIIIll[y.llIIlIll[37]] = "Book on baxtorian";
        y.llIIIIll[y.llIIlIll[38]] = "Reading";
        y.llIIIIll[y.llIIlIll[39]] = "Read";
        y.llIIIIll[y.llIIlIll[42]] = "Tele to CW";
        y.llIIIIll[y.llIIlIll[43]] = "Wear";
        y.llIIIIll[y.llIIlIll[44]] = "Castle Wars";
        y.llIIIIll[y.llIIlIll[45]] = "Nav to maze ladder";
        y.llIIIIll[y.llIIlIll[46]] = "Fountain";
        y.llIIIIll[y.llIIlIll[48]] = "Climb-down";
        y.llIIIIll[y.llIIlIll[50]] = "nav to box";
        y.llIIIIll[y.llIIlIll[51]] = "Searching crate";
        y.llIIIIll[y.llIIlIll[52]] = "Search";
        y.llIIIIll[y.llIIlIll[54]] = "Nav to cage";
        y.llIIIIll[y.llIIlIll[56]] = "Entering cage";
        y.llIIIIll[y.llIIlIll[57]] = "Chat npc";
        y.llIIIIll[y.llIIlIll[58]] = "Air rune";
        y.llIIIIll[y.llIIlIll[59]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[60]] = "Nav to tombstone";
        y.llIIIIll[y.llIIlIll[61]] = "Wear";
        y.llIIIIll[y.llIIlIll[62]] = "Air rune";
        y.llIIIIll[y.llIIlIll[63]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[64]] = "Entering tomb";
        y.llIIIIll[y.llIIlIll[67]] = "Stalagmite";
        y.llIIIIll[y.llIIlIll[68]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[69]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[2]] = "Getting ammy";
        y.llIIIIll[y.llIIlIll[71]] = "Open";
        y.llIIIIll[y.llIIlIll[73]] = "Search";
        y.llIIIIll[y.llIIlIll[74]] = "Stalagmite";
        y.llIIIIll[y.llIIlIll[75]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[76]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[77]] = "Getting ammy";
        y.llIIIIll[y.llIIlIll[78]] = "Open";
        y.llIIIIll[y.llIIlIll[79]] = "Search";
        y.llIIIIll[y.llIIlIll[80]] = "Stalagmite";
        y.llIIIIll[y.llIIlIll[82]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[83]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[84]] = "Getting ashes";
        y.llIIIIll[y.llIIlIll[85]] = "Search";
        y.llIIIIll[y.llIIlIll[86]] = "Air rune";
        y.llIIIIll[y.llIIlIll[10]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[87]] = "Water rune";
        y.llIIIIll[y.llIIlIll[88]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[89]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[90]] = "Nav to bank";
        y.llIIIIll[y.llIIlIll[91]] = "Wear";
        y.llIIIIll[y.llIIlIll[92]] = "Air rune";
        y.llIIIIll[y.llIIlIll[93]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[94]] = "Water rune";
        y.llIIIIll[y.llIIlIll[95]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[96]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[97]] = "Opening bank";
        y.llIIIIll[y.llIIlIll[98]] = "Withdrawing runes";
        y.llIIIIll[y.llIIlIll[99]] = "Vial";
        y.llIIIIll[y.llIIlIll[100]] = "Shark";
        y.llIIIIll[y.llIIlIll[101]] = "Air rune";
        y.llIIIIll[y.llIIlIll[102]] = "Air rune";
        y.llIIIIll[y.llIIlIll[103]] = "Air rune";
        y.llIIIIll[y.llIIlIll[104]] = "Air rune";
        y.llIIIIll[y.llIIlIll[105]] = "Air rune";
        y.llIIIIll[y.llIIlIll[106]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[107]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[108]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[109]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[110]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[111]] = "Water rune";
        y.llIIIIll[y.llIIlIll[112]] = "Water rune";
        y.llIIIIll[y.llIIlIll[113]] = "Water rune";
        y.llIIIIll[y.llIIlIll[114]] = "Water rune";
        y.llIIIIll[y.llIIlIll[115]] = "Water rune";
        y.llIIIIll[y.llIIlIll[116]] = "Air rune";
        y.llIIIIll[y.llIIlIll[117]] = "Air rune";
        y.llIIIIll[y.llIIlIll[118]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[119]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[120]] = "Water rune";
        y.llIIIIll[y.llIIlIll[121]] = "Water rune";
        y.llIIIIll[y.llIIlIll[122]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[123]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[124]] = "Nav to door entrance";
        y.llIIIIll[y.llIIlIll[125]] = "Rope";
        y.llIIIIll[y.llIIlIll[126]] = "Rock";
        y.llIIIIll[y.llIIlIll[127]] = "Roping rock";
        y.llIIIIll[y.llIIlIll[129]] = "Rope";
        y.llIIIIll[y.llIIlIll[131]] = "Roping tree";
        y.llIIIIll[y.llIIlIll[132]] = "Door";
        y.llIIIIll[y.llIIlIll[133]] = "Entering door";
        y.llIIIIll[y.llIIlIll[134]] = "Open";
        y.llIIIIll[y.llIIlIll[135]] = "Air rune";
        y.llIIIIll[y.llIIlIll[136]] = "Air rune";
        y.llIIIIll[y.llIIlIll[137]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[138]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[139]] = "Water rune";
        y.llIIIIll[y.llIIlIll[140]] = "Water rune";
        y.llIIIIll[y.llIIlIll[141]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[142]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[144]] = "Nav to key and get";
        y.llIIIIll[y.llIIlIll[146]] = "Search";
        y.llIIIIll[y.llIIlIll[147]] = "Air rune";
        y.llIIIIll[y.llIIlIll[148]] = "Air rune";
        y.llIIIIll[y.llIIlIll[149]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[150]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[151]] = "Water rune";
        y.llIIIIll[y.llIIlIll[152]] = "Water rune";
        y.llIIIIll[y.llIIlIll[153]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[154]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[155]] = "Nav to last room";
        y.llIIIIll[y.llIIlIll[156]] = "Air rune";
        y.llIIIIll[y.llIIlIll[157]] = "Air rune";
        y.llIIIIll[y.llIIlIll[158]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[159]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[160]] = "Water rune";
        y.llIIIIll[y.llIIlIll[161]] = "Water rune";
        y.llIIIIll[y.llIIlIll[162]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[163]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[164]] = "Door";
        y.llIIIIll[y.llIIlIll[166]] = "Air rune";
        y.llIIIIll[y.llIIlIll[167]] = "Air rune";
        y.llIIIIll[y.llIIlIll[168]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[169]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[170]] = "Water rune";
        y.llIIIIll[y.llIIlIll[171]] = "Water rune";
        y.llIIIIll[y.llIIlIll[172]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[173]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[174]] = "Door";
        y.llIIIIll[y.llIIlIll[175]] = "Open";
        y.llIIIIll[y.llIIlIll[176]] = "Air rune";
        y.llIIIIll[y.llIIlIll[177]] = "Air rune";
        y.llIIIIll[y.llIIlIll[178]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[179]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[180]] = "Water rune";
        y.llIIIIll[y.llIIlIll[181]] = "Water rune";
        y.llIIIIll[y.llIIlIll[182]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[183]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[184]] = "Nav to SE Pillar";
        y.llIIIIll[y.llIIlIll[185]] = "Air rune";
        y.llIIIIll[y.llIIlIll[186]] = "Air rune";
        y.llIIIIll[y.llIIlIll[187]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[188]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[189]] = "Water rune";
        y.llIIIIll[y.llIIlIll[190]] = "Water rune";
        y.llIIIIll[y.llIIlIll[191]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[192]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[193]] = "Using runes";
        y.llIIIIll[y.llIIlIll[194]] = "Air rune";
        y.llIIIIll[y.llIIlIll[195]] = "Air rune";
        y.llIIIIll[y.llIIlIll[196]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[197]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[198]] = "Water rune";
        y.llIIIIll[y.llIIlIll[199]] = "Water rune";
        y.llIIIIll[y.llIIlIll[201]] = "Air rune";
        y.llIIIIll[y.llIIlIll[202]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[203]] = "Water rune";
        y.llIIIIll[y.llIIlIll[204]] = "Air rune";
        y.llIIIIll[y.llIIlIll[205]] = "Air rune";
        y.llIIIIll[y.llIIlIll[206]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[207]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[208]] = "Water rune";
        y.llIIIIll[y.llIIlIll[209]] = "Water rune";
        y.llIIIIll[y.llIIlIll[210]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[211]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[212]] = "Using runes";
        y.llIIIIll[y.llIIlIll[213]] = "Air rune";
        y.llIIIIll[y.llIIlIll[214]] = "Air rune";
        y.llIIIIll[y.llIIlIll[215]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[216]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[217]] = "Water rune";
        y.llIIIIll[y.llIIlIll[218]] = "Water rune";
        y.llIIIIll[y.llIIlIll[219]] = "Air rune";
        y.llIIIIll[y.llIIlIll[220]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[221]] = "Water rune";
        y.llIIIIll[y.llIIlIll[222]] = "Air rune";
        y.llIIIIll[y.llIIlIll[223]] = "Air rune";
        y.llIIIIll[y.llIIlIll[224]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[225]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[226]] = "Water rune";
        y.llIIIIll[y.llIIlIll[227]] = "Water rune";
        y.llIIIIll[y.llIIlIll[228]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[229]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[230]] = "Using runes";
        y.llIIIIll[y.llIIlIll[231]] = "Air rune";
        y.llIIIIll[y.llIIlIll[232]] = "Air rune";
        y.llIIIIll[y.llIIlIll[233]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[234]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[235]] = "Water rune";
        y.llIIIIll[y.llIIlIll[236]] = "Water rune";
        y.llIIIIll[y.llIIlIll[237]] = "Air rune";
        y.llIIIIll[y.llIIlIll[238]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[239]] = "Water rune";
        y.llIIIIll[y.llIIlIll[240]] = "Air rune";
        y.llIIIIll[y.llIIlIll[241]] = "Air rune";
        y.llIIIIll[y.llIIlIll[242]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[243]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[244]] = "Water rune";
        y.llIIIIll[y.llIIlIll[245]] = "Water rune";
        y.llIIIIll[y.llIIlIll[246]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[247]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[248]] = "Using runes";
        y.llIIIIll[y.llIIlIll[249]] = "Air rune";
        y.llIIIIll[y.llIIlIll[250]] = "Air rune";
        y.llIIIIll[y.llIIlIll[251]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[252]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[8]] = "Water rune";
        y.llIIIIll[y.llIIlIll[253]] = "Water rune";
        y.llIIIIll[y.llIIlIll[254]] = "Air rune";
        y.llIIIIll[y.llIIlIll[255]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[256]] = "Water rune";
        y.llIIIIll[y.llIIlIll[257]] = "Air rune";
        y.llIIIIll[y.llIIlIll[258]] = "Air rune";
        y.llIIIIll[y.llIIlIll[259]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[260]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[261]] = "Water rune";
        y.llIIIIll[y.llIIlIll[262]] = "Water rune";
        y.llIIIIll[y.llIIlIll[263]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[264]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[265]] = "Using runes";
        y.llIIIIll[y.llIIlIll[266]] = "Air rune";
        y.llIIIIll[y.llIIlIll[267]] = "Air rune";
        y.llIIIIll[y.llIIlIll[268]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[269]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[270]] = "Water rune";
        y.llIIIIll[y.llIIlIll[271]] = "Water rune";
        y.llIIIIll[y.llIIlIll[272]] = "Air rune";
        y.llIIIIll[y.llIIlIll[273]] = "Air rune";
        y.llIIIIll[y.llIIlIll[274]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[275]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[276]] = "Water rune";
        y.llIIIIll[y.llIIlIll[277]] = "Water rune";
        y.llIIIIll[y.llIIlIll[278]] = "Air rune";
        y.llIIIIll[y.llIIlIll[279]] = "Air rune";
        y.llIIIIll[y.llIIlIll[280]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[281]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[282]] = "Water rune";
        y.llIIIIll[y.llIIlIll[283]] = "Water rune";
        y.llIIIIll[y.llIIlIll[284]] = "Glarial's amulet";
        y.llIIIIll[y.llIIlIll[285]] = "Glarial's urn";
        y.llIIIIll[y.llIIlIll[286]] = "Using runes";
        y.llIIIIll[y.llIIlIll[287]] = "Air rune";
        y.llIIIIll[y.llIIlIll[288]] = "Air rune";
        y.llIIIIll[y.llIIlIll[289]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[290]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[291]] = "Water rune";
        y.llIIIIll[y.llIIlIll[292]] = "Water rune";
        y.llIIIIll[y.llIIlIll[293]] = "Air rune";
        y.llIIIIll[y.llIIlIll[294]] = "Air rune";
        y.llIIIIll[y.llIIlIll[295]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[296]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[297]] = "Water rune";
        y.llIIIIll[y.llIIlIll[298]] = "Water rune";
        y.llIIIIll[y.llIIlIll[299]] = "Air rune";
        y.llIIIIll[y.llIIlIll[300]] = "Earth rune";
        y.llIIIIll[y.llIIlIll[301]] = "Water rune";
        y.llIIIIll[y.llIIlIll[302]] = "Putting neck on statue";
        y.llIIIIll[y.llIIlIll[305]] = "Putting ashes inside";
        y.llIIIIll[y.llIIlIll[308]] = "Chalice";
        y.llIIIIll[y.llIIlIll[309]] = "Statue of Glarial";
        y.llIIIIll[y.llIIlIll[310]] = "Pillar";
        y.llIIIIll[y.llIIlIll[311]] = "Teleporting to CW";
        y.llIIIIll[y.llIIlIll[312]] = "Wear";
        y.llIIIIll[y.llIIlIll[313]] = "Castle Wars";
        y.llIIIIll[y.llIIlIll[314]] = "Rope";
        y.llIIIIll[y.llIIlIll[325]] = "Waterfall quest";
        y.llIIIIll[y.llIIlIll[326]] = "ring of wealth (";
        y.llIIIIll[y.llIIlIll[327]] = "Stalagmite";
        y.llIIIIll[y.llIIlIll[328]] = "Games";
        y.llIIIIll[y.llIIlIll[329]] = "Games";
        y.llIIIIll[y.llIIlIll[330]] = "Games";
        y.llIIIIll[y.llIIlIll[331]] = "dueling";
        y.llIIIIll[y.llIIlIll[332]] = "dueling";
        y.llIIIIll[y.llIIlIll[40]] = "dueling";
        y.llIIIIll[y.llIIlIll[41]] = "dueling";
        y.llIIIIll[y.llIIlIll[304]] = "dueling";
        y.llIIIIll[y.llIIlIll[307]] = "How can I help?";
        y.llIIIIll[y.llIIlIll[402]] = "I'm always happy to help a cook in distress.";
        y.llIIIIll[y.llIIlIll[143]] = "Yes.";
        y.llIIIIll[y.llIIlIll[403]] = "Golrie";
        y.llIIIIll[y.llIIlIll[404]] = "Hudon";
        y.llIIIIll[y.llIIlIll[405]] = "Almera";
    }

    @Override
    public int U() {
        try {
            y.bl();

        }
        catch (Exception lIlIlIlIIIIllII) {
            lIlIlIlIIIIllII.printStackTrace();
        }
        if (1 != 1) {
            return (1 ^ 0x5D ^ (6 ^ 0xC)) & (0xAF ^ 0xBD ^ (0x3F ^ 0x7B) ^ -1);
        }
        return llIIlIll[121];
    }
}

