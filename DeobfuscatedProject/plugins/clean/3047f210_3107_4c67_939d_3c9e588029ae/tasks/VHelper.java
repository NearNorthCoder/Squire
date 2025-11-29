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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.WHelper;
import gg.squire.account.AccBuilderTempleTrek;
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

public class VHelper
implements S {
    static  String eT;
    public static  int eJ;
    private static final  WorldPoint ee;
    static  int eM;
    public static final  WorldPoint dO;
    static final  int dU;
    static  WorldPoint eX;
    private static final  WorldPoint eC;
    static  int bS;
    private static final  WorldPoint eh;
    private static final  int eH;
    private static final  WorldPoint eq;
    private static final  int eE;
    public static final  WorldPoint dR;
    private static final  WorldPoint es;
    private static final  WorldPoint eu;
    static  WorldArea eW;
    private static final  WorldPoint ed;
    static  int eL;
    private static final  WorldPoint ep;
    public static final  int[] dI;
    static  int eQ;
    static final  int ea;
    public static final  WorldPoint dP;
    public static final  WorldPoint dQ;
    static final  int dS;
    private static final  WorldPoint ev;
    public static  int eK;
    static  String[] eR;
    static final  int dV;
    private static final  int eF;
    private static final  WorldPoint ez;
    public static  WorldArea eI;
    static final  int dZ;
    private static final  WorldPoint ec;
    static final  int dX;
    static  boolean cl;
    static  String eU;
    private static final  WorldPoint et;
    private static final  WorldPoint er;
    static  int ck;
    static  int eN;
    private static final  WorldPoint ex;
    public static final  WorldPoint dM;
    private static final  int eG;
    public static final  int[] dJ;
    static  String eS;
    static final  int dW;
    private static final  WorldPoint en;
    public static final  int[] dK;
    private static final  WorldPoint ek;
    static  int eO;
    public static final  WorldPoint dN;
    static final  int dY;
    public static final  WorldArea dL;
    private static final  WorldPoint ej;
    private static final  WorldPoint eB;
    private static final  WorldPoint el;
    public static  List<d> bu;
    
    static  WorldArea eY;
    private static final  WorldPoint ey;
    public static  boolean bs;
    private static final  int eD;
    
    private static final  WorldPoint eA;
    static  WorldPoint eV;
    static final  WorldPoint[] eb;
    static final  int dT;
    private static final  WorldPoint ef;
    private static final  WorldPoint eg;
    static  int eP;
    private static final  WorldPoint ew;
    private static final  WorldPoint eo;
    private static final  WorldPoint ei;
    private static final  WorldPoint em;

    private static boolean llIllIlIlllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllIlIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIlIlllll(Object object) {
        return object == null;
    }

    private static boolean llIllIlIllIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIllIlIllIlI(Object object) {
        return object != null;
    }

    private static boolean llIllIlIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        v.llIllIlIlIlII();
        v.llIllIlIlIIll();
        eF = lIIIIIIIllI[303];
        dS = lIIIIIIIllI[10];
        dY = lIIIIIIIllI[11];
        dW = lIIIIIIIllI[6];
        dT = lIIIIIIIllI[1];
        dU = lIIIIIIIllI[3];
        dV = lIIIIIIIllI[5];
        eG = lIIIIIIIllI[306];
        eH = lIIIIIIIllI[143];
        eE = lIIIIIIIllI[145];
        ea = lIIIIIIIllI[19];
        eD = lIIIIIIIllI[49];
        dX = lIIIIIIIllI[7];
        dZ = lIIIIIIIllI[13];
        int[] nArray = new int[lIIIIIIIllI[17]];
        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[318];
        nArray[v.lIIIIIIIllI[1]] = lIIIIIIIllI[333];
        nArray[v.lIIIIIIIllI[3]] = lIIIIIIIllI[334];
        nArray[v.lIIIIIIIllI[5]] = lIIIIIIIllI[335];
        nArray[v.lIIIIIIIllI[6]] = lIIIIIIIllI[336];
        nArray[v.lIIIIIIIllI[7]] = lIIIIIIIllI[337];
        nArray[v.lIIIIIIIllI[11]] = lIIIIIIIllI[338];
        nArray[v.lIIIIIIIllI[9]] = lIIIIIIIllI[339];
        nArray[v.lIIIIIIIllI[13]] = lIIIIIIIllI[339];
        dI = nArray;
        int[] nArray2 = new int[lIIIIIIIllI[6]];
        nArray2[v.lIIIIIIIllI[0]] = lIIIIIIIllI[316];
        nArray2[v.lIIIIIIIllI[1]] = lIIIIIIIllI[340];
        nArray2[v.lIIIIIIIllI[3]] = lIIIIIIIllI[341];
        nArray2[v.lIIIIIIIllI[5]] = lIIIIIIIllI[342];
        dJ = nArray2;
        int[] nArray3 = new int[lIIIIIIIllI[17]];
        nArray3[v.lIIIIIIIllI[0]] = lIIIIIIIllI[24];
        nArray3[v.lIIIIIIIllI[1]] = lIIIIIIIllI[343];
        nArray3[v.lIIIIIIIllI[3]] = lIIIIIIIllI[344];
        nArray3[v.lIIIIIIIllI[5]] = lIIIIIIIllI[345];
        nArray3[v.lIIIIIIIllI[6]] = lIIIIIIIllI[346];
        nArray3[v.lIIIIIIIllI[7]] = lIIIIIIIllI[347];
        nArray3[v.lIIIIIIIllI[11]] = lIIIIIIIllI[348];
        nArray3[v.lIIIIIIIllI[9]] = lIIIIIIIllI[349];
        nArray3[v.lIIIIIIIllI[13]] = lIIIIIIIllI[348];
        dK = nArray3;
        dL = new WorldArea(lIIIIIIIllI[344], lIIIIIIIllI[350], lIIIIIIIllI[26], lIIIIIIIllI[25], lIIIIIIIllI[0]);
        dM = new WorldPoint(lIIIIIIIllI[351], lIIIIIIIllI[352], lIIIIIIIllI[0]);
        dN = new WorldPoint(lIIIIIIIllI[351], lIIIIIIIllI[353], lIIIIIIIllI[0]);
        dO = new WorldPoint(lIIIIIIIllI[351], lIIIIIIIllI[354], lIIIIIIIllI[0]);
        dP = new WorldPoint(lIIIIIIIllI[346], lIIIIIIIllI[354], lIIIIIIIllI[0]);
        dQ = new WorldPoint(lIIIIIIIllI[346], lIIIIIIIllI[353], lIIIIIIIllI[0]);
        dR = new WorldPoint(lIIIIIIIllI[346], lIIIIIIIllI[352], lIIIIIIIllI[0]);
        WorldPoint[] worldPointArray = new WorldPoint[lIIIIIIIllI[7]];
        worldPointArray[v.lIIIIIIIllI[0]] = new WorldPoint(lIIIIIIIllI[355], lIIIIIIIllI[356], lIIIIIIIllI[0]);
        worldPointArray[v.lIIIIIIIllI[1]] = new WorldPoint(lIIIIIIIllI[357], lIIIIIIIllI[358], lIIIIIIIllI[0]);
        worldPointArray[v.lIIIIIIIllI[3]] = new WorldPoint(lIIIIIIIllI[359], lIIIIIIIllI[360], lIIIIIIIllI[0]);
        worldPointArray[v.lIIIIIIIllI[5]] = new WorldPoint(lIIIIIIIllI[361], lIIIIIIIllI[362], lIIIIIIIllI[0]);
        worldPointArray[v.lIIIIIIIllI[6]] = new WorldPoint(lIIIIIIIllI[363], lIIIIIIIllI[364], lIIIIIIIllI[0]);
        eb = worldPointArray;
        ec = new WorldPoint(lIIIIIIIllI[365], lIIIIIIIllI[53], lIIIIIIIllI[0]);
        ed = new WorldPoint(lIIIIIIIllI[366], lIIIIIIIllI[367], lIIIIIIIllI[0]);
        ee = new WorldPoint(lIIIIIIIllI[368], lIIIIIIIllI[369], lIIIIIIIllI[0]);
        ef = new WorldPoint(lIIIIIIIllI[370], lIIIIIIIllI[371], lIIIIIIIllI[0]);
        eg = new WorldPoint(lIIIIIIIllI[372], lIIIIIIIllI[373], lIIIIIIIllI[0]);
        eh = new WorldPoint(lIIIIIIIllI[374], lIIIIIIIllI[375], lIIIIIIIllI[0]);
        ei = new WorldPoint(lIIIIIIIllI[376], lIIIIIIIllI[377], lIIIIIIIllI[0]);
        ej = new WorldPoint(lIIIIIIIllI[374], lIIIIIIIllI[378], lIIIIIIIllI[0]);
        ek = new WorldPoint(lIIIIIIIllI[379], lIIIIIIIllI[380], lIIIIIIIllI[0]);
        el = new WorldPoint(lIIIIIIIllI[379], lIIIIIIIllI[381], lIIIIIIIllI[1]);
        em = new WorldPoint(lIIIIIIIllI[363], lIIIIIIIllI[382], lIIIIIIIllI[0]);
        en = new WorldPoint(lIIIIIIIllI[383], lIIIIIIIllI[384], lIIIIIIIllI[0]);
        eo = new WorldPoint(lIIIIIIIllI[365], lIIIIIIIllI[385], lIIIIIIIllI[0]);
        ep = new WorldPoint(lIIIIIIIllI[386], lIIIIIIIllI[387], lIIIIIIIllI[0]);
        eq = new WorldPoint(lIIIIIIIllI[388], lIIIIIIIllI[389], lIIIIIIIllI[0]);
        er = new WorldPoint(lIIIIIIIllI[390], lIIIIIIIllI[391], lIIIIIIIllI[0]);
        es = new WorldPoint(lIIIIIIIllI[392], lIIIIIIIllI[393], lIIIIIIIllI[0]);
        et = new WorldPoint(lIIIIIIIllI[394], lIIIIIIIllI[395], lIIIIIIIllI[0]);
        eu = new WorldPoint(lIIIIIIIllI[396], lIIIIIIIllI[397], lIIIIIIIllI[0]);
        ev = new WorldPoint(lIIIIIIIllI[398], lIIIIIIIllI[399], lIIIIIIIllI[0]);
        ew = new WorldPoint(lIIIIIIIllI[349], lIIIIIIIllI[350], lIIIIIIIllI[0]);
        ex = new WorldPoint(lIIIIIIIllI[400], lIIIIIIIllI[352], lIIIIIIIllI[0]);
        ey = new WorldPoint(lIIIIIIIllI[400], lIIIIIIIllI[353], lIIIIIIIllI[0]);
        ez = new WorldPoint(lIIIIIIIllI[400], lIIIIIIIllI[354], lIIIIIIIllI[0]);
        eA = new WorldPoint(lIIIIIIIllI[398], lIIIIIIIllI[354], lIIIIIIIllI[0]);
        eB = new WorldPoint(lIIIIIIIllI[398], lIIIIIIIllI[353], lIIIIIIIllI[0]);
        eC = new WorldPoint(lIIIIIIIllI[398], lIIIIIIIllI[352], lIIIIIIIllI[0]);
        bu = new ArrayList<d>();
        eI = new WorldArea(new WorldPoint(lIIIIIIIllI[379], lIIIIIIIllI[53], lIIIIIIIllI[0]), new WorldPoint(lIIIIIIIllI[368], lIIIIIIIllI[401], lIIIIIIIllI[0]));
        eJ = lIIIIIIIllI[40];
        eK = lIIIIIIIllI[41];
        eL = lIIIIIIIllI[0];
        eM = lIIIIIIIllI[0];
        eN = lIIIIIIIllI[0];
        eO = lIIIIIIIllI[0];
        eP = lIIIIIIIllI[0];
        eQ = lIIIIIIIllI[0];
        String[] stringArray = new String[lIIIIIIIllI[5]];
        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[307]];
        stringArray[v.lIIIIIIIllI[1]] = llllllllIl[lIIIIIIIllI[402]];
        stringArray[v.lIIIIIIIllI[3]] = llllllllIl[lIIIIIIIllI[143]];
        eR = stringArray;
        eS = llllllllIl[lIIIIIIIllI[403]];
        eT = llllllllIl[lIIIIIIIllI[404]];
        eU = llllllllIl[lIIIIIIIllI[405]];
        eV = new WorldPoint(lIIIIIIIllI[349], lIIIIIIIllI[406], lIIIIIIIllI[0]);
        eW = new WorldArea(lIIIIIIIllI[407], lIIIIIIIllI[408], lIIIIIIIllI[10], lIIIIIIIllI[84], lIIIIIIIllI[0]);
        eX = new WorldPoint(lIIIIIIIllI[409], lIIIIIIIllI[410], lIIIIIIIllI[0]);
        eY = new WorldArea(lIIIIIIIllI[411], lIIIIIIIllI[412], lIIIIIIIllI[82], lIIIIIIIllI[90], lIIIIIIIllI[0]);
        bS = lIIIIIIIllI[0];
    }

    public static void ae() {
        d var1;
        Object var2;
        block20: {
            block19: {
                int[] nArray = new int[lIIIIIIIllI[1]];
                nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[20];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIIIIIIllI[20], lIIIIIIIllI[44], lIIIIIIIllI[315]);
                    bu.add(d2);

                }
                int[] nArray2 = new int[lIIIIIIIllI[1]];
                nArray2[v.lIIIIIIIllI[0]] = lIIIIIIIllI[316];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var2 = new DHelper(lIIIIIIIllI[316], lIIIIIIIllI[7], i.bp);
                    bu.add((DHelper) ar2);

                }
                int[] nArray3 = new int[lIIIIIIIllI[1]];
                nArray3[v.lIIIIIIIllI[0]] = lIIIIIIIllI[14];
                if (v.llIllIlIlIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIIIIIllI[1]];
                    nArray4[v.lIIIIIIIllI[0]] = lIIIIIIIllI[14];
                    if (v.llIllIlIlIllI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIIIIllI[11])) {
                        var2 = new DHelper(lIIIIIIIllI[14], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                        bu.add((DHelper) ar2);

                    }
                }
                int[] nArray5 = new int[lIIIIIIIllI[1]];
                nArray5[v.lIIIIIIIllI[0]] = lIIIIIIIllI[15];
                if (v.llIllIlIlIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIIIIIllI[1]];
                    nArray6[v.lIIIIIIIllI[0]] = lIIIIIIIllI[15];
                    if (v.llIllIlIlIllI(Bank.getFirst((int[])nArray6).getQuantity(), lIIIIIIIllI[11])) {
                        var2 = new DHelper(lIIIIIIIllI[15], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                        bu.add((DHelper) ar2);

                    }
                }
                int[] nArray7 = new int[lIIIIIIIllI[1]];
                nArray7[v.lIIIIIIIllI[0]] = lIIIIIIIllI[16];
                if (v.llIllIlIlIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIIIIIllI[1]];
                    nArray8[v.lIIIIIIIllI[0]] = lIIIIIIIllI[16];
                    if (v.llIllIlIlIllI(Bank.getFirst((int[])nArray8).getQuantity(), lIIIIIIIllI[11])) {
                        var2 = new DHelper(lIIIIIIIllI[16], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                        bu.add((DHelper) ar2);

                    }
                }
                int[] nArray9 = new int[lIIIIIIIllI[1]];
                nArray9[v.lIIIIIIIllI[0]] = lIIIIIIIllI[14];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    var2 = new DHelper(lIIIIIIIllI[14], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                    bu.add((DHelper) ar2);

                }
                int[] nArray10 = new int[lIIIIIIIllI[1]];
                nArray10[v.lIIIIIIIllI[0]] = lIIIIIIIllI[15];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    var2 = new DHelper(lIIIIIIIllI[15], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                    bu.add((DHelper) ar2);

                }
                int[] nArray11 = new int[lIIIIIIIllI[1]];
                nArray11[v.lIIIIIIIllI[0]] = lIIIIIIIllI[16];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    var2 = new DHelper(lIIIIIIIllI[16], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                    bu.add((DHelper) ar2);

                }
                int[] nArray12 = new int[lIIIIIIIllI[1]];
                nArray12[v.lIIIIIIIllI[0]] = lIIIIIIIllI[14];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    var2 = new DHelper(lIIIIIIIllI[14], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                    bu.add((DHelper) ar2);

                }
                int[] nArray13 = new int[lIIIIIIIllI[1]];
                nArray13[v.lIIIIIIIllI[0]] = lIIIIIIIllI[318];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    var2 = new DHelper(lIIIIIIIllI[318], lIIIIIIIllI[7], lIIIIIIIllI[315]);
                    bu.add((DHelper) ar2);

                }
                int[] nArray14 = new int[lIIIIIIIllI[1]];
                nArray14[v.lIIIIIIIllI[0]] = lIIIIIIIllI[24];
                if (!v.llIllIlIlIlIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block19;
                int[] nArray15 = new int[lIIIIIIIllI[1]];
                nArray15[v.lIIIIIIIllI[0]] = lIIIIIIIllI[24];
                if (!v.llIllIlIlIlIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lIIIIIIIllI[1]];
                nArray16[v.lIIIIIIIllI[0]] = lIIIIIIIllI[24];
                if (!v.llIllIlIlIllI(Bank.getFirst((int[])nArray16).getQuantity(), lIIIIIIIllI[19])) break block20;
            }
            var2 = new DHelper(lIIIIIIIllI[24], lIIIIIIIllI[19], lIIIIIIIllI[319]);
            bu.add((DHelper) ar2);

        }
        int[] nArray = new int[lIIIIIIIllI[1]];
        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[18];
        if (v.llIllIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var2 = new DHelper(lIIIIIIIllI[18], lIIIIIIIllI[7], lIIIIIIIllI[320]);
            bu.add((DHelper) ar2);

        }
        if (v.llIllIlIlIlll(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(llllllllIl[lIIIIIIIllI[326]]))) ? 1 : 0)) {
            var1 = new DHelper(lIIIIIIIllI[321], lIIIIIIIllI[25], lIIIIIIIllI[322]);
            bu.add(var1);

        }
        int[] nArray17 = new int[lIIIIIIIllI[1]];
        nArray17[v.lIIIIIIIllI[0]] = lIIIIIIIllI[323];
        if (v.llIllIlIlIlll(Bank.contains((int[])nArray17) ? 1 : 0)) {
            var1 = new DHelper(lIIIIIIIllI[323], lIIIIIIIllI[58], lIIIIIIIllI[324]);
            bu.add(var1);

        }
    }

    private static boolean llIllIlIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bz() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIIIIIIllI[1]];
                nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[20];
                if (!v.llIllIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0) || !v.llIllIlIlIlIl(Inventory.contains((int[])f.aU) ? 1 : 0)) break block2;
                if (!v.llIllIlIlIlll(Inventory.contains((int[])f.aN) ? 1 : 0)) break block3;
                if (!v.llIllIlIlIlIl(Equipment.contains((int[])f.aN) ? 1 : 0) || v.llIllIlIlIlll(Inventory.contains((int[])f.aM) ? 1 : 0) && !v.llIllIlIlIlIl(Equipment.contains((int[])f.aM) ? 1 : 0)) break block2;
                String[] stringArray = new String[lIIIIIIIllI[1]];
                stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[314]];
                if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
            }
            n2 = lIIIIIIIllI[1];

            if (3 == 3) return n2 != 0;
            return false;
        }
        n2 = lIIIIIIIllI[0];
        return n2 != 0;
    }

        return String.valueOf(var3);
    }

    private static void llIllIlIlIIll() {
        llllllllIl = new String[lIIIIIIIllI[413]];
        v.llllllllIl[v.lIIIIIIIllI[0]] = "Buying items";
        v.llllllllIl[v.lIIIIIIIllI[1]] = "Finished buying items, switching back to questing";
        v.llllllllIl[v.lIIIIIIIllI[3]] = "Drink";
        v.llllllllIl[v.lIIIIIIIllI[5]] = "Shark";
        v.llllllllIl[v.lIIIIIIIllI[6]] = "Shark";
        v.llllllllIl[v.lIIIIIIIllI[7]] = "Eat";
        v.llllllllIl[v.lIIIIIIIllI[11]] = "Navigating to bank";
        v.llllllllIl[v.lIIIIIIIllI[9]] = "Opening bank";
        v.llllllllIl[v.lIIIIIIIllI[13]] = "Handling banking";
        v.llllllllIl[v.lIIIIIIIllI[17]] = "We are missing runessupplies, switching to BUYING";
        v.llllllllIl[v.lIIIIIIIllI[19]] = "Rope";
        v.llllllllIl[v.lIIIIIIIllI[21]] = "Shark";
        v.llllllllIl[v.lIIIIIIIllI[22]] = "We are missing supplies, switching to BUYING";
        v.llllllllIl[v.lIIIIIIIllI[23]] = "Rope";
        v.llllllllIl[v.lIIIIIIIllI[4]] = "Shark";
        v.llllllllIl[v.lIIIIIIIllI[26]] = "Drink";
        v.llllllllIl[v.lIIIIIIIllI[27]] = "Nav to start";
        v.llllllllIl[v.lIIIIIIIllI[28]] = "Chatting";
        v.llllllllIl[v.lIIIIIIIllI[25]] = "Nav to boy";
        v.llllllllIl[v.lIIIIIIIllI[29]] = "Chat boy";
        v.llllllllIl[v.lIIIIIIIllI[30]] = "Nav to bookcase";
        v.llllllllIl[v.lIIIIIIIllI[32]] = "Book on baxtorian";
        v.llllllllIl[v.lIIIIIIIllI[33]] = "Searching bookcase";
        v.llllllllIl[v.lIIIIIIIllI[34]] = "Search";
        v.llllllllIl[v.lIIIIIIIllI[35]] = "Book on baxtorian";
        v.llllllllIl[v.lIIIIIIIllI[37]] = "Book on baxtorian";
        v.llllllllIl[v.lIIIIIIIllI[38]] = "Reading";
        v.llllllllIl[v.lIIIIIIIllI[39]] = "Read";
        v.llllllllIl[v.lIIIIIIIllI[42]] = "Tele to CW";
        v.llllllllIl[v.lIIIIIIIllI[43]] = "Wear";
        v.llllllllIl[v.lIIIIIIIllI[44]] = "Castle Wars";
        v.llllllllIl[v.lIIIIIIIllI[45]] = "Nav to maze ladder";
        v.llllllllIl[v.lIIIIIIIllI[46]] = "Fountain";
        v.llllllllIl[v.lIIIIIIIllI[48]] = "Climb-down";
        v.llllllllIl[v.lIIIIIIIllI[50]] = "nav to box";
        v.llllllllIl[v.lIIIIIIIllI[51]] = "Searching crate";
        v.llllllllIl[v.lIIIIIIIllI[52]] = "Search";
        v.llllllllIl[v.lIIIIIIIllI[54]] = "Nav to cage";
        v.llllllllIl[v.lIIIIIIIllI[56]] = "Entering cage";
        v.llllllllIl[v.lIIIIIIIllI[57]] = "Chat npc";
        v.llllllllIl[v.lIIIIIIIllI[58]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[59]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[60]] = "Nav to tombstone";
        v.llllllllIl[v.lIIIIIIIllI[61]] = "Wear";
        v.llllllllIl[v.lIIIIIIIllI[62]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[63]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[64]] = "Entering tomb";
        v.llllllllIl[v.lIIIIIIIllI[67]] = "Stalagmite";
        v.llllllllIl[v.lIIIIIIIllI[68]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[69]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[2]] = "Getting ammy";
        v.llllllllIl[v.lIIIIIIIllI[71]] = "Open";
        v.llllllllIl[v.lIIIIIIIllI[73]] = "Search";
        v.llllllllIl[v.lIIIIIIIllI[74]] = "Stalagmite";
        v.llllllllIl[v.lIIIIIIIllI[75]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[76]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[77]] = "Getting ammy";
        v.llllllllIl[v.lIIIIIIIllI[78]] = "Open";
        v.llllllllIl[v.lIIIIIIIllI[79]] = "Search";
        v.llllllllIl[v.lIIIIIIIllI[80]] = "Stalagmite";
        v.llllllllIl[v.lIIIIIIIllI[82]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[83]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[84]] = "Getting ashes";
        v.llllllllIl[v.lIIIIIIIllI[85]] = "Search";
        v.llllllllIl[v.lIIIIIIIllI[86]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[10]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[87]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[88]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[89]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[90]] = "Nav to bank";
        v.llllllllIl[v.lIIIIIIIllI[91]] = "Wear";
        v.llllllllIl[v.lIIIIIIIllI[92]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[93]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[94]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[95]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[96]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[97]] = "Opening bank";
        v.llllllllIl[v.lIIIIIIIllI[98]] = "Withdrawing runes";
        v.llllllllIl[v.lIIIIIIIllI[99]] = "Vial";
        v.llllllllIl[v.lIIIIIIIllI[100]] = "Shark";
        v.llllllllIl[v.lIIIIIIIllI[101]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[102]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[103]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[104]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[105]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[106]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[107]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[108]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[109]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[110]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[111]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[112]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[113]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[114]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[115]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[116]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[117]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[118]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[119]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[120]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[121]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[122]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[123]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[124]] = "Nav to door entrance";
        v.llllllllIl[v.lIIIIIIIllI[125]] = "Rope";
        v.llllllllIl[v.lIIIIIIIllI[126]] = "Rock";
        v.llllllllIl[v.lIIIIIIIllI[127]] = "Roping rock";
        v.llllllllIl[v.lIIIIIIIllI[129]] = "Rope";
        v.llllllllIl[v.lIIIIIIIllI[131]] = "Roping tree";
        v.llllllllIl[v.lIIIIIIIllI[132]] = "Door";
        v.llllllllIl[v.lIIIIIIIllI[133]] = "Entering door";
        v.llllllllIl[v.lIIIIIIIllI[134]] = "Open";
        v.llllllllIl[v.lIIIIIIIllI[135]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[136]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[137]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[138]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[139]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[140]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[141]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[142]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[144]] = "Nav to key and get";
        v.llllllllIl[v.lIIIIIIIllI[146]] = "Search";
        v.llllllllIl[v.lIIIIIIIllI[147]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[148]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[149]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[150]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[151]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[152]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[153]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[154]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[155]] = "Nav to last room";
        v.llllllllIl[v.lIIIIIIIllI[156]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[157]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[158]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[159]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[160]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[161]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[162]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[163]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[164]] = "Door";
        v.llllllllIl[v.lIIIIIIIllI[166]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[167]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[168]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[169]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[170]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[171]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[172]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[173]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[174]] = "Door";
        v.llllllllIl[v.lIIIIIIIllI[175]] = "Open";
        v.llllllllIl[v.lIIIIIIIllI[176]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[177]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[178]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[179]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[180]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[181]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[182]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[183]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[184]] = "Nav to SE Pillar";
        v.llllllllIl[v.lIIIIIIIllI[185]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[186]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[187]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[188]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[189]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[190]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[191]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[192]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[193]] = "Using runes";
        v.llllllllIl[v.lIIIIIIIllI[194]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[195]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[196]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[197]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[198]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[199]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[201]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[202]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[203]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[204]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[205]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[206]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[207]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[208]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[209]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[210]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[211]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[212]] = "Using runes";
        v.llllllllIl[v.lIIIIIIIllI[213]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[214]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[215]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[216]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[217]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[218]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[219]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[220]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[221]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[222]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[223]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[224]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[225]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[226]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[227]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[228]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[229]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[230]] = "Using runes";
        v.llllllllIl[v.lIIIIIIIllI[231]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[232]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[233]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[234]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[235]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[236]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[237]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[238]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[239]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[240]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[241]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[242]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[243]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[244]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[245]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[246]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[247]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[248]] = "Using runes";
        v.llllllllIl[v.lIIIIIIIllI[249]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[250]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[251]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[252]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[8]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[253]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[254]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[255]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[256]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[257]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[258]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[259]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[260]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[261]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[262]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[263]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[264]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[265]] = "Using runes";
        v.llllllllIl[v.lIIIIIIIllI[266]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[267]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[268]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[269]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[270]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[271]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[272]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[273]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[274]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[275]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[276]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[277]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[278]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[279]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[280]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[281]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[282]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[283]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[284]] = "Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[285]] = "Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[286]] = "Using runes";
        v.llllllllIl[v.lIIIIIIIllI[287]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[288]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[289]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[290]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[291]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[292]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[293]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[294]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[295]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[296]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[297]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[298]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[299]] = "Air rune";
        v.llllllllIl[v.lIIIIIIIllI[300]] = "Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[301]] = "Water rune";
        v.llllllllIl[v.lIIIIIIIllI[302]] = "Putting neck on statue";
        v.llllllllIl[v.lIIIIIIIllI[305]] = "Putting ashes inside";
        v.llllllllIl[v.lIIIIIIIllI[308]] = "Chalice";
        v.llllllllIl[v.lIIIIIIIllI[309]] = "Statue of Glarial";
        v.llllllllIl[v.lIIIIIIIllI[310]] = "Pillar";
        v.llllllllIl[v.lIIIIIIIllI[311]] = "Teleporting to CW";
        v.llllllllIl[v.lIIIIIIIllI[312]] = "Wear";
        v.llllllllIl[v.lIIIIIIIllI[313]] = "Castle Wars";
        v.llllllllIl[v.lIIIIIIIllI[314]] = "Rope";
        v.llllllllIl[v.lIIIIIIIllI[325]] = "Waterfall quest";
        v.llllllllIl[v.lIIIIIIIllI[326]] = "ring of wealth (";
        v.llllllllIl[v.lIIIIIIIllI[327]] = "Stalagmite";
        v.llllllllIl[v.lIIIIIIIllI[328]] = "Games";
        v.llllllllIl[v.lIIIIIIIllI[329]] = "Games";
        v.llllllllIl[v.lIIIIIIIllI[330]] = "Games";
        v.llllllllIl[v.lIIIIIIIllI[331]] = "dueling";
        v.llllllllIl[v.lIIIIIIIllI[332]] = "dueling";
        v.llllllllIl[v.lIIIIIIIllI[40]] = "dueling";
        v.llllllllIl[v.lIIIIIIIllI[41]] = "dueling";
        v.llllllllIl[v.lIIIIIIIllI[304]] = "dueling";
        v.llllllllIl[v.lIIIIIIIllI[307]] = "How can I help?";
        v.llllllllIl[v.lIIIIIIIllI[402]] = "I'm always happy to help a cook in distress.";
        v.llllllllIl[v.lIIIIIIIllI[143]] = "Yes.";
        v.llllllllIl[v.lIIIIIIIllI[403]] = "Golrie";
        v.llllllllIl[v.lIIIIIIIllI[404]] = "Hudon";
        v.llllllllIl[v.lIIIIIIIllI[405]] = "Almera";
    }

    @Override
    public boolean V() {
        boolean bl;
        if (v.llIllIlIllIIl(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[19])) {
            bl = lIIIIIIIllI[1];

            }
        } else {
            bl = lIIIIIIIllI[0];
        }
        return bl;
    }

    private static boolean llIllIlIlIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public String U() {
        return llllllllIl[lIIIIIIIllI[325]];
    }

    private static boolean llIllIlIllllI(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public int T() {
        try {
            v.by();

        }
        catch (Exception var4) {
            var4.printStackTrace();
        }
        if (((0x3B ^ 6) & ~(0x33 ^ 0xE)) != 0) {
            return (0xD ^ 0x47) & ~(0x78 ^ 0x32);
        }
        return lIIIIIIIllI[121];
    }

    public static void by() {
        block254: {
            block289: {
                Item var5;
                BankLocation var6;
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
                                                                                                        if (v.llIllIlIlIlIl(bs ? 1 : 0)) {
                                                                                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[0]];
                                                                                                            b.a(bu);
                                                                                                            if (v.llIllIlIlIllI(bu.size(), lIIIIIIIllI[1])) {
                                                                                                                System.out.println(llllllllIl[lIIIIIIIllI[1]]);
                                                                                                                bs = lIIIIIIIllI[0];
                                                                                                            }
                                                                                                        }
                                                                                                        if (!v.llIllIlIlIlll(bs ? 1 : 0)) break block254;
                                                                                                        if (v.llIllIlIlIlIl(Inventory.contains((int[])f.aU) ? 1 : 0) && v.llIllIlIlIllI(Movement.getRunEnergy(), lIIIIIIIllI[2]) && v.llIllIlIlIlll(Dialog.isOpen() ? 1 : 0)) {
                                                                                                            Inventory.getFirst((int[])f.aU).interact(llllllllIl[lIIIIIIIllI[3]]);
                                                                                                            Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                                        }
                                                                                                        if (!v.llIllIlIllIII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIIIIIllI[4]) || v.llIllIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                                                            stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[5]];
                                                                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[lIIIIIIIllI[1]];
                                                                                                                stringArray2[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(llllllllIl[lIIIIIIIllI[7]]);
                                                                                                                Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                                            }
                                                                                                        }
                                                                                                        if (v.llIllIlIlIllI(e.j(lIIIIIIIllI[8]), lIIIIIIIllI[9])) {
                                                                                                            w.bF();
                                                                                                        }
                                                                                                        if (!v.llIllIlIlIlll(e.j(lIIIIIIIllI[10])) || !v.llIllIlIllIIl(e.j(lIIIIIIIllI[8]), lIIIIIIIllI[9])) break block255;
                                                                                                        if (!v.llIllIlIlIlll(v.bz() ? 1 : 0)) break block256;
                                                                                                        var6 = BankLocation.getNearest();
                                                                                                        if (v.llIllIlIllIlI(var6) && v.llIllIlIlIlll(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[11]];
                                                                                                            a.a(var6);
                                                                                                        }
                                                                                                        if (!v.llIllIlIllIlI(var6) || !v.llIllIlIlIlIl(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block256;
                                                                                                        if (v.llIllIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                                                                                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[9]];
                                                                                                            a.a();
                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIllI[12]);

                                                                                                        }
                                                                                                        if (!v.llIllIlIlIlIl(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[13]];
                                                                                                        if (v.llIllIlIllIll(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)lIIIIIIIllI[5]);

                                                                                                        }
                                                                                                        if (v.llIllIlIllIll(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)lIIIIIIIllI[3]);

                                                                                                        }
                                                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[14];
                                                                                                        if (!v.llIllIlIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block257;
                                                                                                        int[] nArray2 = new int[lIIIIIIIllI[1]];
                                                                                                        nArray2[v.lIIIIIIIllI[0]] = lIIIIIIIllI[14];
                                                                                                        if (!v.llIllIlIllIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIIIIllI[11])) break block258;
                                                                                                    }
                                                                                                    int[] nArray = new int[lIIIIIIIllI[1]];
                                                                                                    nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[15];
                                                                                                    if (!v.llIllIlIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block259;
                                                                                                    int[] nArray3 = new int[lIIIIIIIllI[1]];
                                                                                                    nArray3[v.lIIIIIIIllI[0]] = lIIIIIIIllI[15];
                                                                                                    if (!v.llIllIlIllIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIIIIllI[11])) break block258;
                                                                                                }
                                                                                                int[] nArray = new int[lIIIIIIIllI[1]];
                                                                                                nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[16];
                                                                                                if (!v.llIllIlIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block260;
                                                                                                int[] nArray4 = new int[lIIIIIIIllI[1]];
                                                                                                nArray4[v.lIIIIIIIllI[0]] = lIIIIIIIllI[16];
                                                                                                if (!v.llIllIlIlIllI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIIIIllI[11])) break block260;
                                                                                            }
                                                                                            v.ae();
                                                                                            System.out.println(llllllllIl[lIIIIIIIllI[17]]);
                                                                                            bs = lIIIIIIIllI[1];
                                                                                            return;
                                                                                        }
                                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[18];
                                                                                        if (!v.llIllIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block261;
                                                                                        String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                                        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[19]];
                                                                                        if (!v.llIllIlIllIIl(Inventory.getCount((String[])stringArray), lIIIIIIIllI[1])) break block262;
                                                                                    }
                                                                                    int[] nArray = new int[lIIIIIIIllI[1]];
                                                                                    nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[20];
                                                                                    if (!v.llIllIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block263;
                                                                                    String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                                    stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[21]];
                                                                                    if (!v.llIllIlIllIIl(Inventory.getCount((String[])stringArray), lIIIIIIIllI[1])) break block262;
                                                                                }
                                                                                if (!(v.llIllIlIlIlll(Bank.contains((int[])f.aN) ? 1 : 0) && !v.llIllIlIllIIl(Inventory.getCount((int[])f.aN), lIIIIIIIllI[1]) || v.llIllIlIlIlll(Bank.contains((int[])f.aM) ? 1 : 0) && !v.llIllIlIllIIl(Inventory.getCount((int[])f.aM), lIIIIIIIllI[1])) && (!v.llIllIlIlIlll(Bank.contains((int[])f.aU) ? 1 : 0) || !v.llIllIlIlIllI(Inventory.getCount((int[])f.aU), lIIIIIIIllI[1]))) break block264;
                                                                            }
                                                                            v.ae();
                                                                            System.out.println(llllllllIl[lIIIIIIIllI[22]]);
                                                                            bs = lIIIIIIIllI[1];
                                                                            return;
                                                                        }
                                                                        String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[23]];
                                                                        if (v.llIllIlIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            a.a(lIIIIIIIllI[18], lIIIIIIIllI[1]);
                                                                        }
                                                                        if (v.llIllIlIlIlll(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                                                                            a.a(f.aN, lIIIIIIIllI[1]);
                                                                        }
                                                                        if (v.llIllIlIlIlll(Inventory.contains((int[])f.aM) ? 1 : 0)) {
                                                                            a.a(lIIIIIIIllI[24], lIIIIIIIllI[1]);
                                                                        }
                                                                        if (v.llIllIlIlIlll(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                                                                            a.a(f.aU, lIIIIIIIllI[6]);
                                                                        }
                                                                        String[] stringArray3 = new String[lIIIIIIIllI[1]];
                                                                        stringArray3[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[4]];
                                                                        if (v.llIllIlIlIlll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                                                            a.a(lIIIIIIIllI[20], lIIIIIIIllI[25]);
                                                                        }
                                                                    }
                                                                    if (v.llIllIlIlIlIl(v.bz() ? 1 : 0)) {
                                                                        if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(eg), lIIIIIIIllI[7])) {
                                                                            if (v.llIllIlIlIlIl(Bank.isOpen() ? 1 : 0)) {
                                                                                Bank.close();
                                                                                Time.sleepTicks((int)lIIIIIIIllI[5]);

                                                                            }
                                                                            if (v.llIllIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                                                                                if (v.llIllIlIlIllI(bS, lIIIIIIIllI[1])) {
                                                                                    if (v.llIllIlIlIlIl(Inventory.contains((int[])f.aU) ? 1 : 0) && v.llIllIlIlIllI(Movement.getRunEnergy(), lIIIIIIIllI[2])) {
                                                                                        Inventory.getFirst((int[])f.aU).interact(llllllllIl[lIIIIIIIllI[26]]);
                                                                                        Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                    }
                                                                                    e.VHelper();
                                                                                    bS += lIIIIIIIllI[1];
                                                                                }
                                                                                AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[27]];
                                                                                Movement.walkTo((WorldPoint)eg);

                                                                                Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                            }
                                                                        }
                                                                        if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(eg), lIIIIIIIllI[7])) {
                                                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[28]];
                                                                            g.a(eU, eR);
                                                                        }
                                                                    }
                                                                }
                                                                if (v.llIllIlIlllIl(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[1])) {
                                                                    if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ej), lIIIIIIIllI[5])) {
                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[25]];
                                                                        Movement.walkTo((WorldPoint)ej);

                                                                    }
                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(ej), lIIIIIIIllI[5])) {
                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[29]];
                                                                        g.a(eT, eR);
                                                                    }
                                                                }
                                                                if (v.llIllIlIlllIl(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[3])) {
                                                                    if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(el), lIIIIIIIllI[6])) {
                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[30]];
                                                                        Movement.walkTo((WorldPoint)el);

                                                                        Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                    }
                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(el), lIIIIIIIllI[6])) {
                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[31];
                                                                        var6 = TileObjects.getNearest((int[])nArray);
                                                                        String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[32]];
                                                                        if (v.llIllIlIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[33]];
                                                                            if (v.llIllIlIllIlI(var6)) {
                                                                                var6.interact(llllllllIl[lIIIIIIIllI[34]]);
                                                                                Time.sleepTicks((int)lIIIIIIIllI[3]);

                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(el), lIIIIIIIllI[19])) {
                                                                    String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                    stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[35]];
                                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0) && v.llIllIlIlllIl(Players.getLocal().getAnimation(), lIIIIIIIllI[36]) && v.llIllIlIllllI(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[5])) {
                                                                        String[] stringArray4 = new String[lIIIIIIIllI[1]];
                                                                        stringArray4[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[37]];
                                                                        var6 = Inventory.getFirst((String[])stringArray4);
                                                                        if (v.llIllIlIllIlI(var6)) {
                                                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[38]];
                                                                            var6.interact(llllllllIl[lIIIIIIIllI[39]]);
                                                                            Time.sleepTicks((int)lIIIIIIIllI[3]);

                                                                        }
                                                                    }
                                                                }
                                                                if (v.llIllIlIlllIl(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[5])) {
                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(el), lIIIIIIIllI[19])) {
                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[40];
                                                                        if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray), lIIIIIIIllI[1])) {
                                                                            int[] nArray5 = new int[lIIIIIIIllI[1]];
                                                                            nArray5[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                            if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray5), lIIIIIIIllI[1])) {
                                                                                AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[42]];
                                                                                if (v.llIllIlIlIlIl(Inventory.contains(item -> item.getName().contains(llllllllIl[lIIIIIIIllI[304]])) ? 1 : 0) && v.llIllIlIlIlll(Equipment.contains(item -> item.getName().contains(llllllllIl[lIIIIIIIllI[41]])) ? 1 : 0)) {
                                                                                    Inventory.getFirst(item -> item.getName().contains(llllllllIl[lIIIIIIIllI[40]])).interact(llllllllIl[lIIIIIIIllI[43]]);
                                                                                }
                                                                                if (v.llIllIlIlIlIl(Equipment.contains(item -> item.getName().contains(llllllllIl[lIIIIIIIllI[332]])) ? 1 : 0) && v.llIllIlIlIlll(Players.getLocal().isAnimating() ? 1 : 0)) {
                                                                                    Equipment.getFirst(item -> item.getName().contains(llllllllIl[lIIIIIIIllI[331]])).interact(llllllllIl[lIIIIIIIllI[44]]);
                                                                                    Time.sleepTicks((int)lIIIIIIIllI[6]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(em), lIIIIIIIllI[5])) {
                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[40];
                                                                        if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray), lIIIIIIIllI[1])) {
                                                                            int[] nArray6 = new int[lIIIIIIIllI[1]];
                                                                            nArray6[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                            if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray6), lIIIIIIIllI[1]) && v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(en), lIIIIIIIllI[44]) && v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(el), lIIIIIIIllI[19])) {
                                                                                AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[45]];
                                                                                if (v.llIllIlIlIlll(eW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)eX);

                                                                                }
                                                                                if (v.llIllIlIlIlIl(eW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(eb));

                                                                                    Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(em), lIIIIIIIllI[5])) {
                                                                        String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[46]];
                                                                        if (v.llIllIlIllIlI(TileObjects.getNearest((String[])stringArray))) {
                                                                            int[] nArray = new int[lIIIIIIIllI[1]];
                                                                            nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[40];
                                                                            if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray), lIIIIIIIllI[1])) {
                                                                                int[] nArray7 = new int[lIIIIIIIllI[1]];
                                                                                nArray7[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                                if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray7), lIIIIIIIllI[1])) {
                                                                                    int[] nArray8 = new int[lIIIIIIIllI[1]];
                                                                                    nArray8[v.lIIIIIIIllI[0]] = lIIIIIIIllI[47];
                                                                                    var6 = TileObjects.getNearest((int[])nArray8);
                                                                                    if (v.llIllIlIllIlI(var6)) {
                                                                                        var6.interact(llllllllIl[lIIIIIIIllI[48]]);
                                                                                        Time.sleepTicks((int)lIIIIIIIllI[5]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(en), lIIIIIIIllI[3])) {
                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[49];
                                                                        if (v.llIllIlIllIlI(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray9 = new int[lIIIIIIIllI[1]];
                                                                            nArray9[v.lIIIIIIIllI[0]] = lIIIIIIIllI[40];
                                                                            if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray9), lIIIIIIIllI[1])) {
                                                                                int[] nArray10 = new int[lIIIIIIIllI[1]];
                                                                                nArray10[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                                if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray10), lIIIIIIIllI[1])) {
                                                                                    AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[50]];
                                                                                    Movement.walkTo((WorldPoint)en);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(en), lIIIIIIIllI[5])) {
                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[49];
                                                                        if (v.llIllIlIllIlI(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray11 = new int[lIIIIIIIllI[1]];
                                                                            nArray11[v.lIIIIIIIllI[0]] = lIIIIIIIllI[40];
                                                                            if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray11), lIIIIIIIllI[1])) {
                                                                                int[] nArray12 = new int[lIIIIIIIllI[1]];
                                                                                nArray12[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                                if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray12), lIIIIIIIllI[1])) {
                                                                                    AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[51]];
                                                                                    int[] nArray13 = new int[lIIIIIIIllI[1]];
                                                                                    nArray13[v.lIIIIIIIllI[0]] = lIIIIIIIllI[49];
                                                                                    var6 = TileObjects.getNearest((int[])nArray13);
                                                                                    if (v.llIllIlIllIlI(var6)) {
                                                                                        var6.interact(llllllllIl[lIIIIIIIllI[52]]);
                                                                                        Time.sleepTicks((int)lIIIIIIIllI[3]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(eo), lIIIIIIIllI[3])) {
                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[40];
                                                                        if (v.llIllIlIllIll(Inventory.getCount((int[])nArray)) && v.llIllIlIlIllI(Players.getLocal().getWorldLocation().getY(), lIIIIIIIllI[53])) {
                                                                            int[] nArray14 = new int[lIIIIIIIllI[1]];
                                                                            nArray14[v.lIIIIIIIllI[0]] = lIIIIIIIllI[40];
                                                                            if (v.llIllIlIllIll(Inventory.getCount((int[])nArray14))) {
                                                                                int[] nArray15 = new int[lIIIIIIIllI[1]];
                                                                                nArray15[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                                if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray15), lIIIIIIIllI[1])) {
                                                                                    AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[54]];
                                                                                    Movement.walkTo((WorldPoint)eo);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(eo), lIIIIIIIllI[3])) {
                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[40];
                                                                        if (v.llIllIlIllIll(Inventory.getCount((int[])nArray)) && v.llIllIlIlIllI(Players.getLocal().getWorldLocation().getY(), lIIIIIIIllI[53])) {
                                                                            int[] nArray16 = new int[lIIIIIIIllI[1]];
                                                                            nArray16[v.lIIIIIIIllI[0]] = lIIIIIIIllI[40];
                                                                            if (v.llIllIlIllIll(Inventory.getCount((int[])nArray16))) {
                                                                                int[] nArray17 = new int[lIIIIIIIllI[1]];
                                                                                nArray17[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                                if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray17), lIIIIIIIllI[1])) {
                                                                                    int[] nArray18 = new int[lIIIIIIIllI[1]];
                                                                                    nArray18[v.lIIIIIIIllI[0]] = lIIIIIIIllI[55];
                                                                                    var6 = TileObjects.getNearest((int[])nArray18);
                                                                                    if (v.llIllIlIllIlI(var6)) {
                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[56]];
                                                                                        int[] nArray19 = new int[lIIIIIIIllI[1]];
                                                                                        nArray19[v.lIIIIIIIllI[0]] = lIIIIIIIllI[40];
                                                                                        var5 = Inventory.getFirst((int[])nArray19);
                                                                                        if (v.llIllIlIllIlI(var5)) {
                                                                                            var5.useOn((TileObject)var6);
                                                                                            Time.sleep((long)1L);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (v.llIllIlIllIIl(Players.getLocal().getWorldLocation().getY(), lIIIIIIIllI[53])) {
                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                        if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray), lIIIIIIIllI[1])) {
                                                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[57]];
                                                                            g.a(eS, eR);
                                                                        }
                                                                    }
                                                                    int[] nArray = new int[lIIIIIIIllI[1]];
                                                                    nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                    if (v.llIllIlIllIll(Inventory.getCount((int[])nArray)) && v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(eq), lIIIIIIIllI[6])) {
                                                                        String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[58]];
                                                                        if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray), lIIIIIIIllI[1])) {
                                                                            String[] stringArray5 = new String[lIIIIIIIllI[1]];
                                                                            stringArray5[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[59]];
                                                                            if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray5), lIIIIIIIllI[1])) {
                                                                                AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[60]];
                                                                                if (v.llIllIlIlIlll(eY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    if (v.llIllIlIlIlIl(Inventory.contains(item -> item.getName().contains(llllllllIl[lIIIIIIIllI[330]])) ? 1 : 0) && v.llIllIlIlIlll(Equipment.contains(item -> item.getName().contains(llllllllIl[lIIIIIIIllI[329]])) ? 1 : 0)) {
                                                                                        Inventory.getFirst(item -> item.getName().contains(llllllllIl[lIIIIIIIllI[328]])).interact(llllllllIl[lIIIIIIIllI[61]]);
                                                                                        Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)eg);

                                                                                    Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                }
                                                                                if (v.llIllIlIlIlIl(eY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)eq);

                                                                                    Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray20 = new int[lIIIIIIIllI[1]];
                                                                    nArray20[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                    if (v.llIllIlIllIll(Inventory.getCount((int[])nArray20)) && v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(eq), lIIIIIIIllI[6])) {
                                                                        String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[62]];
                                                                        if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray), lIIIIIIIllI[1])) {
                                                                            String[] stringArray6 = new String[lIIIIIIIllI[1]];
                                                                            stringArray6[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[63]];
                                                                            if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray6), lIIIIIIIllI[1])) {
                                                                                AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[64]];
                                                                                int[] nArray21 = new int[lIIIIIIIllI[1]];
                                                                                nArray21[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                                var6 = Inventory.getFirst((int[])nArray21);
                                                                                if (v.llIllIlIllIlI(var6)) {
                                                                                    int[] nArray22 = new int[lIIIIIIIllI[1]];
                                                                                    nArray22[v.lIIIIIIIllI[0]] = lIIIIIIIllI[65];
                                                                                    var5 = TileObjects.getNearest((int[])nArray22);
                                                                                    if (v.llIllIlIllIlI(var5)) {
                                                                                        var6.useOn((TileObject)var5);
                                                                                        Time.sleepUntil(() -> {
                                                                                            boolean bl;
                                                                                            String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                                            stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[327]];
                                                                                            if (v.llIllIlIllIlI(TileObjects.getNearest((String[])stringArray))) {
                                                                                                bl = lIIIIIIIllI[1];

                                                                                                if (1 != 1) {
                                                                                                    return false;
                                                                                                }
                                                                                            } else {
                                                                                                bl = lIIIIIIIllI[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)lIIIIIIIllI[66]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray23 = new int[lIIIIIIIllI[1]];
                                                                    nArray23[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                    if (v.llIllIlIllIll(Inventory.getCount((int[])nArray23))) {
                                                                        String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[67]];
                                                                        if (v.llIllIlIllIlI(TileObjects.getNearest((String[])stringArray))) {
                                                                            String[] stringArray7 = new String[lIIIIIIIllI[1]];
                                                                            stringArray7[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[68]];
                                                                            if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray7), lIIIIIIIllI[1])) {
                                                                                String[] stringArray8 = new String[lIIIIIIIllI[1]];
                                                                                stringArray8[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[69]];
                                                                                if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray8), lIIIIIIIllI[1])) {
                                                                                    AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[2]];
                                                                                    if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(er), lIIIIIIIllI[6])) {
                                                                                        Movement.walkTo((WorldPoint)er);

                                                                                    }
                                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(er), lIIIIIIIllI[6])) {
                                                                                        int[] nArray24 = new int[lIIIIIIIllI[1]];
                                                                                        nArray24[v.lIIIIIIIllI[0]] = lIIIIIIIllI[70];
                                                                                        var6 = TileObjects.getNearest((int[])nArray24);
                                                                                        if (v.llIllIlIllIlI(var6)) {
                                                                                            var6.interact(llllllllIl[lIIIIIIIllI[71]]);
                                                                                            Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                        }
                                                                                        int[] nArray25 = new int[lIIIIIIIllI[1]];
                                                                                        nArray25[v.lIIIIIIIllI[0]] = lIIIIIIIllI[72];
                                                                                        var5 = TileObjects.getNearest((int[])nArray25);
                                                                                        if (v.llIllIlIllIlI(var5)) {
                                                                                            var5.interact(llllllllIl[lIIIIIIIllI[73]]);
                                                                                            Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (!v.llIllIlIlllIl(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[6])) break block265;
                                                                ck = lIIIIIIIllI[0];
                                                                int[] nArray = new int[lIIIIIIIllI[1]];
                                                                nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                if (v.llIllIlIllIll(Inventory.getCount((int[])nArray))) {
                                                                    String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                    stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[74]];
                                                                    if (v.llIllIlIllIlI(TileObjects.getNearest((String[])stringArray))) {
                                                                        String[] stringArray9 = new String[lIIIIIIIllI[1]];
                                                                        stringArray9[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[75]];
                                                                        if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray9), lIIIIIIIllI[1])) {
                                                                            String[] stringArray10 = new String[lIIIIIIIllI[1]];
                                                                            stringArray10[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[76]];
                                                                            if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray10), lIIIIIIIllI[1])) {
                                                                                AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[77]];
                                                                                if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(er), lIIIIIIIllI[6])) {
                                                                                    Movement.walkTo((WorldPoint)er);

                                                                                }
                                                                                if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(er), lIIIIIIIllI[6])) {
                                                                                    int[] nArray26 = new int[lIIIIIIIllI[1]];
                                                                                    nArray26[v.lIIIIIIIllI[0]] = lIIIIIIIllI[70];
                                                                                    var6 = TileObjects.getNearest((int[])nArray26);
                                                                                    if (v.llIllIlIllIlI(var6)) {
                                                                                        var6.interact(llllllllIl[lIIIIIIIllI[78]]);
                                                                                        Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                    }
                                                                                    int[] nArray27 = new int[lIIIIIIIllI[1]];
                                                                                    nArray27[v.lIIIIIIIllI[0]] = lIIIIIIIllI[72];
                                                                                    var5 = TileObjects.getNearest((int[])nArray27);
                                                                                    if (v.llIllIlIllIlI(var5)) {
                                                                                        var5.interact(llllllllIl[lIIIIIIIllI[79]]);
                                                                                        Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int[] nArray28 = new int[lIIIIIIIllI[1]];
                                                                nArray28[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                                if (!v.llIllIlIllIll(Inventory.getCount((int[])nArray28))) break block266;
                                                                String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[80]];
                                                                if (!v.llIllIlIlllll(TileObjects.getNearest((String[])stringArray))) break block267;
                                                                int[] nArray29 = new int[lIIIIIIIllI[1]];
                                                                nArray29[v.lIIIIIIIllI[0]] = lIIIIIIIllI[81];
                                                                if (!v.llIllIlIllIlI(TileObjects.getNearest((int[])nArray29))) break block266;
                                                            }
                                                            String[] stringArray = new String[lIIIIIIIllI[1]];
                                                            stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[82]];
                                                            if (v.llIllIlIllIll(Inventory.getCount((String[])stringArray))) {
                                                                String[] stringArray11 = new String[lIIIIIIIllI[1]];
                                                                stringArray11[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[83]];
                                                                if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray11), lIIIIIIIllI[1])) {
                                                                    if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(es), lIIIIIIIllI[5])) {
                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[84]];
                                                                        Movement.walkTo((WorldPoint)es);

                                                                        Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                    }
                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(es), lIIIIIIIllI[5])) {
                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[81];
                                                                        var6 = TileObjects.getNearest((int[])nArray);
                                                                        if (v.llIllIlIllIlI(var6)) {
                                                                            var6.interact(llllllllIl[lIIIIIIIllI[85]]);
                                                                            Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                        if (v.llIllIlIllIll(Inventory.getCount((int[])nArray))) {
                                                            String[] stringArray = new String[lIIIIIIIllI[1]];
                                                            stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[86]];
                                                            if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray), lIIIIIIIllI[1])) {
                                                                String[] stringArray12 = new String[lIIIIIIIllI[1]];
                                                                stringArray12[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[10]];
                                                                if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray12), lIIIIIIIllI[1])) {
                                                                    String[] stringArray13 = new String[lIIIIIIIllI[1]];
                                                                    stringArray13[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[87]];
                                                                    if (v.llIllIlIlIllI(Inventory.getCount((String[])stringArray13), lIIIIIIIllI[1]) && v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(es), lIIIIIIIllI[6])) {
                                                                        String[] stringArray14 = new String[lIIIIIIIllI[1]];
                                                                        stringArray14[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[88]];
                                                                        if (v.llIllIlIllIll(Inventory.getCount((String[])stringArray14))) {
                                                                            String[] stringArray15 = new String[lIIIIIIIllI[1]];
                                                                            stringArray15[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[89]];
                                                                            if (v.llIllIlIllIll(Inventory.getCount((String[])stringArray15))) {
                                                                                AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[90]];
                                                                                if (v.llIllIlIlIlll(Equipment.contains((int[])f.aN) ? 1 : 0) && v.llIllIlIlIlIl(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                                                                                    Inventory.getFirst((int[])f.aN).interact(llllllllIl[lIIIIIIIllI[91]]);
                                                                                    Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                }
                                                                                if (v.llIllIlIlIlIl(Equipment.contains((int[])f.aN) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)ep);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(ep), lIIIIIIIllI[30])) break block268;
                                                        int[] nArray30 = new int[lIIIIIIIllI[1]];
                                                        nArray30[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                        if (!v.llIllIlIllIll(Inventory.getCount((int[])nArray30))) break block268;
                                                        String[] stringArray = new String[lIIIIIIIllI[1]];
                                                        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[92]];
                                                        if (!v.llIllIlIllIIl(Inventory.getCount((String[])stringArray), lIIIIIIIllI[1])) break block269;
                                                        String[] stringArray16 = new String[lIIIIIIIllI[1]];
                                                        stringArray16[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[93]];
                                                        if (!v.llIllIlIllIIl(Inventory.getCount((String[])stringArray16), lIIIIIIIllI[1])) break block269;
                                                        String[] stringArray17 = new String[lIIIIIIIllI[1]];
                                                        stringArray17[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[94]];
                                                        if (!v.llIllIlIlIllI(Inventory.getCount((String[])stringArray17), lIIIIIIIllI[1])) break block268;
                                                    }
                                                    String[] stringArray = new String[lIIIIIIIllI[1]];
                                                    stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[95]];
                                                    if (v.llIllIlIllIll(Inventory.getCount((String[])stringArray))) {
                                                        String[] stringArray18 = new String[lIIIIIIIllI[1]];
                                                        stringArray18[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[96]];
                                                        if (v.llIllIlIllIll(Inventory.getCount((String[])stringArray18))) {
                                                            if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ep), lIIIIIIIllI[6])) {
                                                                Movement.walkTo((WorldPoint)ep);

                                                            }
                                                            if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(ep), lIIIIIIIllI[6])) {
                                                                if (v.llIllIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[97]];
                                                                    a.a();
                                                                }
                                                                if (v.llIllIlIlIlIl(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[98]];
                                                                    String[] stringArray19 = new String[lIIIIIIIllI[1]];
                                                                    stringArray19[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[99]];
                                                                    Bank.depositAll((String[])stringArray19);
                                                                    if (v.llIllIlIllIII(Inventory.getAll().size(), lIIIIIIIllI[34])) {
                                                                        Bank.deposit((String)llllllllIl[lIIIIIIIllI[100]], (int)lIIIIIIIllI[7]);
                                                                    }
                                                                    String[] stringArray20 = new String[lIIIIIIIllI[1]];
                                                                    stringArray20[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[101]];
                                                                    if (v.llIllIlIlIlll(Inventory.contains((String[])stringArray20) ? 1 : 0)) {
                                                                        a.a(lIIIIIIIllI[15], lIIIIIIIllI[11]);
                                                                    }
                                                                    String[] stringArray21 = new String[lIIIIIIIllI[1]];
                                                                    stringArray21[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[102]];
                                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                                                                        String[] stringArray22 = new String[lIIIIIIIllI[1]];
                                                                        stringArray22[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[103]];
                                                                        if (v.llIllIlIlIllI(Inventory.getFirst((String[])stringArray22).getQuantity(), lIIIIIIIllI[11])) {
                                                                            String[] stringArray23 = new String[lIIIIIIIllI[1]];
                                                                            stringArray23[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[105]];
                                                                            Bank.withdraw((String)llllllllIl[lIIIIIIIllI[104]], (int)(lIIIIIIIllI[11] - Inventory.getFirst((String[])stringArray23).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIIIIIllI[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray24 = new String[lIIIIIIIllI[1]];
                                                                    stringArray24[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[106]];
                                                                    if (v.llIllIlIlIlll(Inventory.contains((String[])stringArray24) ? 1 : 0)) {
                                                                        a.a(lIIIIIIIllI[16], lIIIIIIIllI[11]);
                                                                    }
                                                                    String[] stringArray25 = new String[lIIIIIIIllI[1]];
                                                                    stringArray25[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[107]];
                                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                                                                        String[] stringArray26 = new String[lIIIIIIIllI[1]];
                                                                        stringArray26[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[108]];
                                                                        if (v.llIllIlIlIllI(Inventory.getFirst((String[])stringArray26).getQuantity(), lIIIIIIIllI[11])) {
                                                                            String[] stringArray27 = new String[lIIIIIIIllI[1]];
                                                                            stringArray27[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[110]];
                                                                            Bank.withdraw((String)llllllllIl[lIIIIIIIllI[109]], (int)(lIIIIIIIllI[11] - Inventory.getFirst((String[])stringArray27).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIIIIIllI[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray28 = new String[lIIIIIIIllI[1]];
                                                                    stringArray28[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[111]];
                                                                    if (v.llIllIlIlIlll(Inventory.contains((String[])stringArray28) ? 1 : 0)) {
                                                                        a.a(lIIIIIIIllI[14], lIIIIIIIllI[11]);
                                                                    }
                                                                    String[] stringArray29 = new String[lIIIIIIIllI[1]];
                                                                    stringArray29[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[112]];
                                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                                                                        String[] stringArray30 = new String[lIIIIIIIllI[1]];
                                                                        stringArray30[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[113]];
                                                                        if (v.llIllIlIlIllI(Inventory.getFirst((String[])stringArray30).getQuantity(), lIIIIIIIllI[11])) {
                                                                            String[] stringArray31 = new String[lIIIIIIIllI[1]];
                                                                            stringArray31[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[115]];
                                                                            Bank.withdraw((String)llllllllIl[lIIIIIIIllI[114]], (int)(lIIIIIIIllI[11] - Inventory.getFirst((String[])stringArray31).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIIIIIllI[9]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray = new int[lIIIIIIIllI[1]];
                                                nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                if (v.llIllIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIIIIIllI[1]];
                                                    stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[116]];
                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray32 = new String[lIIIIIIIllI[1]];
                                                        stringArray32[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[117]];
                                                        if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray32).getQuantity(), lIIIIIIIllI[11])) {
                                                            String[] stringArray33 = new String[lIIIIIIIllI[1]];
                                                            stringArray33[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[118]];
                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray33) ? 1 : 0)) {
                                                                String[] stringArray34 = new String[lIIIIIIIllI[1]];
                                                                stringArray34[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[119]];
                                                                if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray34).getQuantity(), lIIIIIIIllI[11])) {
                                                                    String[] stringArray35 = new String[lIIIIIIIllI[1]];
                                                                    stringArray35[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[120]];
                                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                                                                        String[] stringArray36 = new String[lIIIIIIIllI[1]];
                                                                        stringArray36[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[121]];
                                                                        if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray36).getQuantity(), lIIIIIIIllI[11])) {
                                                                            String[] stringArray37 = new String[lIIIIIIIllI[1]];
                                                                            stringArray37[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[122]];
                                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                                                                                String[] stringArray38 = new String[lIIIIIIIllI[1]];
                                                                                stringArray38[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[123]];
                                                                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray38) ? 1 : 0) && v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(eu), lIIIIIIIllI[1])) {
                                                                                    if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ej), lIIIIIIIllI[6]) && v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ei), lIIIIIIIllI[6])) {
                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[124]];
                                                                                        if (v.llIllIlIlIlIl(Dialog.isOpen() ? 1 : 0)) {
                                                                                            Dialog.close();
                                                                                        }
                                                                                        Movement.walkTo((WorldPoint)eu);

                                                                                    }
                                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(ej), lIIIIIIIllI[7]) && v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ei), lIIIIIIIllI[6])) {
                                                                                        String[] stringArray39 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray39[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[125]];
                                                                                        var6 = Inventory.getFirst((String[])stringArray39);
                                                                                        String[] stringArray40 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray40[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[126]];
                                                                                        var5 = TileObjects.getNearest((String[])stringArray40);
                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[127]];
                                                                                        if (v.llIllIlIllIlI(var6) && v.llIllIlIllIlI(var5)) {
                                                                                            var6.useOn((TileObject)var5);
                                                                                            Time.sleepUntil(() -> {
                                                                                                boolean bl;
                                                                                                if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(ei), lIIIIIIIllI[6])) {
                                                                                                    bl = lIIIIIIIllI[1];

                                                                                                    if (((0x18 ^ 0x2C) & ~(0xF0 ^ 0xC4)) != 0) {
                                                                                                        return false;
                                                                                                    }
                                                                                                } else {
                                                                                                    bl = lIIIIIIIllI[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)lIIIIIIIllI[128]);

                                                                                        }
                                                                                    }
                                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(ei), lIIIIIIIllI[6])) {
                                                                                        String[] stringArray41 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray41[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[129]];
                                                                                        var6 = Inventory.getFirst((String[])stringArray41);
                                                                                        int[] nArray31 = new int[lIIIIIIIllI[1]];
                                                                                        nArray31[v.lIIIIIIIllI[0]] = lIIIIIIIllI[130];
                                                                                        var5 = TileObjects.getNearest((int[])nArray31);
                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[131]];
                                                                                        if (v.llIllIlIllIlI(var6) && v.llIllIlIllIlI(var5)) {
                                                                                            var6.useOn((TileObject)var5);
                                                                                            Time.sleepTicks((int)lIIIIIIIllI[7]);

                                                                                        }
                                                                                    }
                                                                                    if (v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)et) ? 1 : 0)) {
                                                                                        String[] stringArray42 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray42[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[132]];
                                                                                        var6 = TileObjects.getNearest((String[])stringArray42);
                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[133]];
                                                                                        if (v.llIllIlIllIlI(var6)) {
                                                                                            var6.interact(llllllllIl[lIIIIIIIllI[134]]);
                                                                                            Time.sleepTicks((int)lIIIIIIIllI[3]);

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
                                            if (v.llIllIlIlllIl(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[7])) {
                                                int[] nArray = new int[lIIIIIIIllI[1]];
                                                nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                if (v.llIllIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIIIIIllI[1]];
                                                    stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[135]];
                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray43 = new String[lIIIIIIIllI[1]];
                                                        stringArray43[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[136]];
                                                        if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray43).getQuantity(), lIIIIIIIllI[11])) {
                                                            String[] stringArray44 = new String[lIIIIIIIllI[1]];
                                                            stringArray44[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[137]];
                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray44) ? 1 : 0)) {
                                                                String[] stringArray45 = new String[lIIIIIIIllI[1]];
                                                                stringArray45[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[138]];
                                                                if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray45).getQuantity(), lIIIIIIIllI[11])) {
                                                                    String[] stringArray46 = new String[lIIIIIIIllI[1]];
                                                                    stringArray46[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[139]];
                                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray46) ? 1 : 0)) {
                                                                        String[] stringArray47 = new String[lIIIIIIIllI[1]];
                                                                        stringArray47[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[140]];
                                                                        if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray47).getQuantity(), lIIIIIIIllI[11])) {
                                                                            String[] stringArray48 = new String[lIIIIIIIllI[1]];
                                                                            stringArray48[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[141]];
                                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray48) ? 1 : 0)) {
                                                                                String[] stringArray49 = new String[lIIIIIIIllI[1]];
                                                                                stringArray49[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[142]];
                                                                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray49) ? 1 : 0)) {
                                                                                    int[] nArray32 = new int[lIIIIIIIllI[1]];
                                                                                    nArray32[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                                                                                    if (v.llIllIlIlIllI(Inventory.getCount((int[])nArray32), lIIIIIIIllI[1]) && v.llIllIlIlIlll(Players.getLocal().getWorldLocation().equals((Object)et) ? 1 : 0)) {
                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[144]];
                                                                                        if (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(eu), lIIIIIIIllI[3])) {
                                                                                            Movement.walkTo((WorldPoint)eu);

                                                                                        }
                                                                                        if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(eu), lIIIIIIIllI[3])) {
                                                                                            int[] nArray33 = new int[lIIIIIIIllI[1]];
                                                                                            nArray33[v.lIIIIIIIllI[0]] = lIIIIIIIllI[145];
                                                                                            var6 = TileObjects.getNearest((int[])nArray33);
                                                                                            if (v.llIllIlIllIlI(var6)) {
                                                                                                var6.interact(llllllllIl[lIIIIIIIllI[146]]);
                                                                                                Time.sleepTicks((int)lIIIIIIIllI[3]);

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
                                                int[] nArray34 = new int[lIIIIIIIllI[1]];
                                                nArray34[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                if (v.llIllIlIlIlIl(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIIIIIllI[1]];
                                                    stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[147]];
                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray50 = new String[lIIIIIIIllI[1]];
                                                        stringArray50[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[148]];
                                                        if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray50).getQuantity(), lIIIIIIIllI[11])) {
                                                            String[] stringArray51 = new String[lIIIIIIIllI[1]];
                                                            stringArray51[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[149]];
                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray51) ? 1 : 0)) {
                                                                String[] stringArray52 = new String[lIIIIIIIllI[1]];
                                                                stringArray52[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[150]];
                                                                if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray52).getQuantity(), lIIIIIIIllI[11])) {
                                                                    String[] stringArray53 = new String[lIIIIIIIllI[1]];
                                                                    stringArray53[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[151]];
                                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray53) ? 1 : 0)) {
                                                                        String[] stringArray54 = new String[lIIIIIIIllI[1]];
                                                                        stringArray54[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[152]];
                                                                        if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray54).getQuantity(), lIIIIIIIllI[11])) {
                                                                            String[] stringArray55 = new String[lIIIIIIIllI[1]];
                                                                            stringArray55[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[153]];
                                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray55) ? 1 : 0)) {
                                                                                String[] stringArray56 = new String[lIIIIIIIllI[1]];
                                                                                stringArray56[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[154]];
                                                                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray56) ? 1 : 0)) {
                                                                                    int[] nArray35 = new int[lIIIIIIIllI[1]];
                                                                                    nArray35[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                                                                                    if (v.llIllIlIllIll(Inventory.getCount((int[])nArray35)) && v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ev), lIIIIIIIllI[3]) && v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ew), lIIIIIIIllI[5])) {
                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[155]];
                                                                                        Movement.walkTo((WorldPoint)ev);

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
                                                int[] nArray36 = new int[lIIIIIIIllI[1]];
                                                nArray36[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                if (v.llIllIlIlIlIl(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIIIIIllI[1]];
                                                    stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[156]];
                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray57 = new String[lIIIIIIIllI[1]];
                                                        stringArray57[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[157]];
                                                        if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray57).getQuantity(), lIIIIIIIllI[11])) {
                                                            String[] stringArray58 = new String[lIIIIIIIllI[1]];
                                                            stringArray58[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[158]];
                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray58) ? 1 : 0)) {
                                                                String[] stringArray59 = new String[lIIIIIIIllI[1]];
                                                                stringArray59[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[159]];
                                                                if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray59).getQuantity(), lIIIIIIIllI[11])) {
                                                                    String[] stringArray60 = new String[lIIIIIIIllI[1]];
                                                                    stringArray60[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[160]];
                                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray60) ? 1 : 0)) {
                                                                        String[] stringArray61 = new String[lIIIIIIIllI[1]];
                                                                        stringArray61[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[161]];
                                                                        if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray61).getQuantity(), lIIIIIIIllI[11])) {
                                                                            String[] stringArray62 = new String[lIIIIIIIllI[1]];
                                                                            stringArray62[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[162]];
                                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray62) ? 1 : 0)) {
                                                                                String[] stringArray63 = new String[lIIIIIIIllI[1]];
                                                                                stringArray63[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[163]];
                                                                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray63) ? 1 : 0)) {
                                                                                    int[] nArray37 = new int[lIIIIIIIllI[1]];
                                                                                    nArray37[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                                                                                    if (v.llIllIlIllIll(Inventory.getCount((int[])nArray37)) && v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(ev), lIIIIIIIllI[5])) {
                                                                                        int[] nArray38 = new int[lIIIIIIIllI[1]];
                                                                                        nArray38[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                                                                                        var6 = Inventory.getFirst((int[])nArray38);
                                                                                        String[] stringArray64 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray64[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[164]];
                                                                                        var5 = TileObjects.getNearest((String[])stringArray64);
                                                                                        if (v.llIllIlIllIlI(var6) && v.llIllIlIllIlI(var5)) {
                                                                                            var6.useOn((TileObject)var5);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)et), (int)lIIIIIIIllI[165]);

                                                                                        }
                                                                                        while (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ew), lIIIIIIIllI[3])) {
                                                                                            Movement.walkTo((WorldPoint)ew);

                                                                                            Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                                                            if ((0x4E ^ 0x4A) >= 2) continue;
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
                                                int[] nArray39 = new int[lIIIIIIIllI[1]];
                                                nArray39[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                                if (v.llIllIlIlIlIl(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIIIIIllI[1]];
                                                    stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[166]];
                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray65 = new String[lIIIIIIIllI[1]];
                                                        stringArray65[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[167]];
                                                        if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray65).getQuantity(), lIIIIIIIllI[11])) {
                                                            String[] stringArray66 = new String[lIIIIIIIllI[1]];
                                                            stringArray66[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[168]];
                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray66) ? 1 : 0)) {
                                                                String[] stringArray67 = new String[lIIIIIIIllI[1]];
                                                                stringArray67[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[169]];
                                                                if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray67).getQuantity(), lIIIIIIIllI[11])) {
                                                                    String[] stringArray68 = new String[lIIIIIIIllI[1]];
                                                                    stringArray68[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[170]];
                                                                    if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray68) ? 1 : 0)) {
                                                                        String[] stringArray69 = new String[lIIIIIIIllI[1]];
                                                                        stringArray69[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[171]];
                                                                        if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray69).getQuantity(), lIIIIIIIllI[11])) {
                                                                            String[] stringArray70 = new String[lIIIIIIIllI[1]];
                                                                            stringArray70[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[172]];
                                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray70) ? 1 : 0)) {
                                                                                String[] stringArray71 = new String[lIIIIIIIllI[1]];
                                                                                stringArray71[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[173]];
                                                                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                                                                    int[] nArray40 = new int[lIIIIIIIllI[1]];
                                                                                    nArray40[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                                                                                    if (v.llIllIlIllIll(Inventory.getCount((int[])nArray40)) && v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(ew), lIIIIIIIllI[5])) {
                                                                                        int[] nArray41 = new int[lIIIIIIIllI[1]];
                                                                                        nArray41[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                                                                                        var6 = Inventory.getFirst((int[])nArray41);
                                                                                        String[] stringArray72 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray72[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[174]];
                                                                                        var5 = TileObjects.getNearest((String[])stringArray72);
                                                                                        if (v.llIllIlIllIlI(var6) && v.llIllIlIllIlI(var5)) {
                                                                                            var5.interact(llllllllIl[lIIIIIIIllI[175]]);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)et), (int)lIIIIIIIllI[165]);

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
                                            if (!v.llIllIlIlllIl(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[11])) break block270;
                                            int[] nArray = new int[lIIIIIIIllI[1]];
                                            nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                            if (v.llIllIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                String[] stringArray = new String[lIIIIIIIllI[1]];
                                                stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[176]];
                                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                    String[] stringArray73 = new String[lIIIIIIIllI[1]];
                                                    stringArray73[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[177]];
                                                    if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray73).getQuantity(), lIIIIIIIllI[11])) {
                                                        String[] stringArray74 = new String[lIIIIIIIllI[1]];
                                                        stringArray74[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[178]];
                                                        if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray74) ? 1 : 0)) {
                                                            String[] stringArray75 = new String[lIIIIIIIllI[1]];
                                                            stringArray75[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[179]];
                                                            if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray75).getQuantity(), lIIIIIIIllI[11])) {
                                                                String[] stringArray76 = new String[lIIIIIIIllI[1]];
                                                                stringArray76[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[180]];
                                                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray76) ? 1 : 0)) {
                                                                    String[] stringArray77 = new String[lIIIIIIIllI[1]];
                                                                    stringArray77[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[181]];
                                                                    if (v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray77).getQuantity(), lIIIIIIIllI[11])) {
                                                                        String[] stringArray78 = new String[lIIIIIIIllI[1]];
                                                                        stringArray78[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[182]];
                                                                        if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray78) ? 1 : 0)) {
                                                                            String[] stringArray79 = new String[lIIIIIIIllI[1]];
                                                                            stringArray79[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[183]];
                                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray79) ? 1 : 0)) {
                                                                                int[] nArray42 = new int[lIIIIIIIllI[1]];
                                                                                nArray42[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                                                                                if (v.llIllIlIllIll(Inventory.getCount((int[])nArray42)) && v.llIllIlIlIlIl(dL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(eC), lIIIIIIIllI[1])) {
                                                                                    AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[184]];
                                                                                    Movement.walkTo((WorldPoint)eC);

                                                                                    Time.sleepTicks((int)lIIIIIIIllI[6]);

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
                                            int[] nArray43 = new int[lIIIIIIIllI[1]];
                                            nArray43[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                            if (!v.llIllIlIlIlIl(Inventory.contains((int[])nArray43) ? 1 : 0)) break block248;
                                            String[] stringArray = new String[lIIIIIIIllI[1]];
                                            stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[185]];
                                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block248;
                                            String[] stringArray80 = new String[lIIIIIIIllI[1]];
                                            stringArray80[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[186]];
                                            if (!v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray80).getQuantity(), lIIIIIIIllI[11])) break block248;
                                            String[] stringArray81 = new String[lIIIIIIIllI[1]];
                                            stringArray81[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[187]];
                                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray81) ? 1 : 0)) break block248;
                                            String[] stringArray82 = new String[lIIIIIIIllI[1]];
                                            stringArray82[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[188]];
                                            if (!v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray82).getQuantity(), lIIIIIIIllI[11])) break block248;
                                            String[] stringArray83 = new String[lIIIIIIIllI[1]];
                                            stringArray83[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[189]];
                                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray83) ? 1 : 0)) break block248;
                                            String[] stringArray84 = new String[lIIIIIIIllI[1]];
                                            stringArray84[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[190]];
                                            if (!v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray84).getQuantity(), lIIIIIIIllI[11])) break block248;
                                            String[] stringArray85 = new String[lIIIIIIIllI[1]];
                                            stringArray85[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[191]];
                                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray85) ? 1 : 0)) break block248;
                                            String[] stringArray86 = new String[lIIIIIIIllI[1]];
                                            stringArray86[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[192]];
                                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray86) ? 1 : 0)) break block248;
                                            int[] nArray44 = new int[lIIIIIIIllI[1]];
                                            nArray44[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                                            if (!v.llIllIlIllIll(Inventory.getCount((int[])nArray44)) || !v.llIllIlIlIlIl(dL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(eC), lIIIIIIIllI[3])) break block248;
                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[193]];
                                            do {
                                                block272: {
                                                    block273: {
                                                        block271: {
                                                            String[] stringArray87 = new String[lIIIIIIIllI[1]];
                                                            stringArray87[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[194]];
                                                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray87) ? 1 : 0)) break block271;
                                                            String[] stringArray88 = new String[lIIIIIIIllI[1]];
                                                            stringArray88[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[195]];
                                                            if (!v.llIllIlIlIllI(Inventory.getFirst((String[])stringArray88).getQuantity(), lIIIIIIIllI[11])) break block272;
                                                        }
                                                        String[] stringArray89 = new String[lIIIIIIIllI[1]];
                                                        stringArray89[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[196]];
                                                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray89) ? 1 : 0)) break block273;
                                                        String[] stringArray90 = new String[lIIIIIIIllI[1]];
                                                        stringArray90[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[197]];
                                                        if (!v.llIllIlIlIllI(Inventory.getFirst((String[])stringArray90).getQuantity(), lIIIIIIIllI[11])) break block272;
                                                    }
                                                    String[] stringArray91 = new String[lIIIIIIIllI[1]];
                                                    stringArray91[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[198]];
                                                    if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray91) ? 1 : 0)) break block248;
                                                    String[] stringArray92 = new String[lIIIIIIIllI[1]];
                                                    stringArray92[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[199]];
                                                    if (!v.llIllIlIllIIl(Inventory.getFirst((String[])stringArray92).getQuantity(), lIIIIIIIllI[11])) break block248;
                                                }
                                                if (!v.llIllIlIlIlll(AccBuilderTempleTrek.d ? 1 : 0)) break block248;
                                                int[] nArray45 = new int[lIIIIIIIllI[1]];
                                                nArray45[v.lIIIIIIIllI[0]] = lIIIIIIIllI[200];
                                                var6 = TileObjects.getFirstAt((WorldPoint)dM, (int[])nArray45);
                                                String[] stringArray93 = new String[lIIIIIIIllI[1]];
                                                stringArray93[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[201]];
                                                Inventory.getFirst((String[])stringArray93).useOn((TileObject)var6);
                                                Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                String[] stringArray94 = new String[lIIIIIIIllI[1]];
                                                stringArray94[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)var6);
                                                Time.sleepTicks((int)lIIIIIIIllI[1]);

                                                String[] stringArray95 = new String[lIIIIIIIllI[1]];
                                                stringArray95[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)var6);
                                                Time.sleepTicks((int)lIIIIIIIllI[1]);

                                            } while (3 == 3);
                                            return;
                                        }
                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                        if (!v.llIllIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block249;
                                        String[] stringArray = new String[lIIIIIIIllI[1]];
                                        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[204]];
                                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block249;
                                        String[] stringArray96 = new String[lIIIIIIIllI[1]];
                                        stringArray96[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[205]];
                                        if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray96).getQuantity(), lIIIIIIIllI[7])) break block249;
                                        String[] stringArray97 = new String[lIIIIIIIllI[1]];
                                        stringArray97[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[206]];
                                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray97) ? 1 : 0)) break block249;
                                        String[] stringArray98 = new String[lIIIIIIIllI[1]];
                                        stringArray98[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[207]];
                                        if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray98).getQuantity(), lIIIIIIIllI[7])) break block249;
                                        String[] stringArray99 = new String[lIIIIIIIllI[1]];
                                        stringArray99[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[208]];
                                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray99) ? 1 : 0)) break block249;
                                        String[] stringArray100 = new String[lIIIIIIIllI[1]];
                                        stringArray100[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[209]];
                                        if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray100).getQuantity(), lIIIIIIIllI[7])) break block249;
                                        String[] stringArray101 = new String[lIIIIIIIllI[1]];
                                        stringArray101[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[210]];
                                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray101) ? 1 : 0)) break block249;
                                        String[] stringArray102 = new String[lIIIIIIIllI[1]];
                                        stringArray102[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[211]];
                                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray102) ? 1 : 0)) break block249;
                                        int[] nArray46 = new int[lIIIIIIIllI[1]];
                                        nArray46[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                                        if (!v.llIllIlIllIll(Inventory.getCount((int[])nArray46)) || !v.llIllIlIlIlIl(dL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(eB), lIIIIIIIllI[1])) break block249;
                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[212]];
                                        while (true) {
                                            block275: {
                                                block276: {
                                                    block274: {
                                                        String[] stringArray103 = new String[lIIIIIIIllI[1]];
                                                        stringArray103[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[213]];
                                                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray103) ? 1 : 0)) break block274;
                                                        String[] stringArray104 = new String[lIIIIIIIllI[1]];
                                                        stringArray104[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[214]];
                                                        if (!v.llIllIlIllllI(Inventory.getFirst((String[])stringArray104).getQuantity(), lIIIIIIIllI[7])) break block275;
                                                    }
                                                    String[] stringArray105 = new String[lIIIIIIIllI[1]];
                                                    stringArray105[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[215]];
                                                    if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray105) ? 1 : 0)) break block276;
                                                    String[] stringArray106 = new String[lIIIIIIIllI[1]];
                                                    stringArray106[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[216]];
                                                    if (!v.llIllIlIllllI(Inventory.getFirst((String[])stringArray106).getQuantity(), lIIIIIIIllI[7])) break block275;
                                                }
                                                String[] stringArray107 = new String[lIIIIIIIllI[1]];
                                                stringArray107[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[217]];
                                                if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray107) ? 1 : 0)) break block249;
                                                String[] stringArray108 = new String[lIIIIIIIllI[1]];
                                                stringArray108[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[218]];
                                                if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray108).getQuantity(), lIIIIIIIllI[7])) break block249;
                                            }
                                            if (!v.llIllIlIlIlll(AccBuilderTempleTrek.d ? 1 : 0)) break block249;
                                            if (v.llIllIlIlIlll(Players.getLocal().getWorldLocation().equals((Object)eB) ? 1 : 0)) {
                                                Movement.walkTo((WorldPoint)eB);

                                                Time.sleepTicks((int)lIIIIIIIllI[5]);

                                            }
                                            if (!v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)eB) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[lIIIIIIIllI[1]];
                                            nArray47[v.lIIIIIIIllI[0]] = lIIIIIIIllI[200];
                                            var6 = TileObjects.getFirstAt((WorldPoint)dN, (int[])nArray47);
                                            String[] stringArray109 = new String[lIIIIIIIllI[1]];
                                            stringArray109[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)var6);
                                            Time.sleepTicks((int)lIIIIIIIllI[1]);

                                            String[] stringArray110 = new String[lIIIIIIIllI[1]];
                                            stringArray110[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)var6);
                                            Time.sleepTicks((int)lIIIIIIIllI[1]);

                                            String[] stringArray111 = new String[lIIIIIIIllI[1]];
                                            stringArray111[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)var6);
                                            Time.sleepTicks((int)lIIIIIIIllI[1]);

                                        }
                                        return;
                                    }
                                    int[] nArray = new int[lIIIIIIIllI[1]];
                                    nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                    if (!v.llIllIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block250;
                                    String[] stringArray = new String[lIIIIIIIllI[1]];
                                    stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[222]];
                                    if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block250;
                                    String[] stringArray112 = new String[lIIIIIIIllI[1]];
                                    stringArray112[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[223]];
                                    if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray112).getQuantity(), lIIIIIIIllI[6])) break block250;
                                    String[] stringArray113 = new String[lIIIIIIIllI[1]];
                                    stringArray113[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[224]];
                                    if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray113) ? 1 : 0)) break block250;
                                    String[] stringArray114 = new String[lIIIIIIIllI[1]];
                                    stringArray114[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[225]];
                                    if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray114).getQuantity(), lIIIIIIIllI[6])) break block250;
                                    String[] stringArray115 = new String[lIIIIIIIllI[1]];
                                    stringArray115[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[226]];
                                    if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray115) ? 1 : 0)) break block250;
                                    String[] stringArray116 = new String[lIIIIIIIllI[1]];
                                    stringArray116[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[227]];
                                    if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray116).getQuantity(), lIIIIIIIllI[6])) break block250;
                                    String[] stringArray117 = new String[lIIIIIIIllI[1]];
                                    stringArray117[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[228]];
                                    if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray117) ? 1 : 0)) break block250;
                                    String[] stringArray118 = new String[lIIIIIIIllI[1]];
                                    stringArray118[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[229]];
                                    if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray118) ? 1 : 0)) break block250;
                                    int[] nArray48 = new int[lIIIIIIIllI[1]];
                                    nArray48[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                                    if (!v.llIllIlIllIll(Inventory.getCount((int[])nArray48)) || !v.llIllIlIlIlIl(dL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block250;
                                    AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[230]];
                                    while (true) {
                                        block278: {
                                            block279: {
                                                block277: {
                                                    String[] stringArray119 = new String[lIIIIIIIllI[1]];
                                                    stringArray119[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[231]];
                                                    if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray119) ? 1 : 0)) break block277;
                                                    String[] stringArray120 = new String[lIIIIIIIllI[1]];
                                                    stringArray120[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[232]];
                                                    if (!v.llIllIlIllllI(Inventory.getFirst((String[])stringArray120).getQuantity(), lIIIIIIIllI[6])) break block278;
                                                }
                                                String[] stringArray121 = new String[lIIIIIIIllI[1]];
                                                stringArray121[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[233]];
                                                if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray121) ? 1 : 0)) break block279;
                                                String[] stringArray122 = new String[lIIIIIIIllI[1]];
                                                stringArray122[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[234]];
                                                if (!v.llIllIlIllllI(Inventory.getFirst((String[])stringArray122).getQuantity(), lIIIIIIIllI[6])) break block278;
                                            }
                                            String[] stringArray123 = new String[lIIIIIIIllI[1]];
                                            stringArray123[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[235]];
                                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray123) ? 1 : 0)) break block250;
                                            String[] stringArray124 = new String[lIIIIIIIllI[1]];
                                            stringArray124[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[236]];
                                            if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray124).getQuantity(), lIIIIIIIllI[6])) break block250;
                                        }
                                        if (!v.llIllIlIlIlll(AccBuilderTempleTrek.d ? 1 : 0)) break block250;
                                        if (v.llIllIlIlIlll(Players.getLocal().getWorldLocation().equals((Object)eA) ? 1 : 0)) {
                                            Movement.walkTo((WorldPoint)eA);

                                            Time.sleepTicks((int)lIIIIIIIllI[5]);

                                        }
                                        if (!v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)eA) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[lIIIIIIIllI[1]];
                                        nArray49[v.lIIIIIIIllI[0]] = lIIIIIIIllI[200];
                                        var6 = TileObjects.getFirstAt((WorldPoint)dO, (int[])nArray49);
                                        String[] stringArray125 = new String[lIIIIIIIllI[1]];
                                        stringArray125[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)var6);
                                        Time.sleepTicks((int)lIIIIIIIllI[1]);

                                        String[] stringArray126 = new String[lIIIIIIIllI[1]];
                                        stringArray126[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)var6);
                                        Time.sleepTicks((int)lIIIIIIIllI[1]);

                                        String[] stringArray127 = new String[lIIIIIIIllI[1]];
                                        stringArray127[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)var6);
                                        Time.sleepTicks((int)lIIIIIIIllI[1]);

                                        if (1 >= 2) break;
                                    }
                                    return;
                                }
                                int[] nArray = new int[lIIIIIIIllI[1]];
                                nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                                if (!v.llIllIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block251;
                                String[] stringArray = new String[lIIIIIIIllI[1]];
                                stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[240]];
                                if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block251;
                                String[] stringArray128 = new String[lIIIIIIIllI[1]];
                                stringArray128[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[241]];
                                if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray128).getQuantity(), lIIIIIIIllI[5])) break block251;
                                String[] stringArray129 = new String[lIIIIIIIllI[1]];
                                stringArray129[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[242]];
                                if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray129) ? 1 : 0)) break block251;
                                String[] stringArray130 = new String[lIIIIIIIllI[1]];
                                stringArray130[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[243]];
                                if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray130).getQuantity(), lIIIIIIIllI[5])) break block251;
                                String[] stringArray131 = new String[lIIIIIIIllI[1]];
                                stringArray131[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[244]];
                                if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray131) ? 1 : 0)) break block251;
                                String[] stringArray132 = new String[lIIIIIIIllI[1]];
                                stringArray132[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[245]];
                                if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray132).getQuantity(), lIIIIIIIllI[5])) break block251;
                                String[] stringArray133 = new String[lIIIIIIIllI[1]];
                                stringArray133[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[246]];
                                if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray133) ? 1 : 0)) break block251;
                                String[] stringArray134 = new String[lIIIIIIIllI[1]];
                                stringArray134[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[247]];
                                if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray134) ? 1 : 0)) break block251;
                                int[] nArray50 = new int[lIIIIIIIllI[1]];
                                nArray50[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                                if (!v.llIllIlIllIll(Inventory.getCount((int[])nArray50)) || !v.llIllIlIlIlIl(dL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block251;
                                AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[248]];
                                while (true) {
                                    block281: {
                                        block282: {
                                            block280: {
                                                String[] stringArray135 = new String[lIIIIIIIllI[1]];
                                                stringArray135[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[249]];
                                                if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray135) ? 1 : 0)) break block280;
                                                String[] stringArray136 = new String[lIIIIIIIllI[1]];
                                                stringArray136[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[250]];
                                                if (!v.llIllIlIllllI(Inventory.getFirst((String[])stringArray136).getQuantity(), lIIIIIIIllI[5])) break block281;
                                            }
                                            String[] stringArray137 = new String[lIIIIIIIllI[1]];
                                            stringArray137[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[251]];
                                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray137) ? 1 : 0)) break block282;
                                            String[] stringArray138 = new String[lIIIIIIIllI[1]];
                                            stringArray138[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[252]];
                                            if (!v.llIllIlIllllI(Inventory.getFirst((String[])stringArray138).getQuantity(), lIIIIIIIllI[5])) break block281;
                                        }
                                        String[] stringArray139 = new String[lIIIIIIIllI[1]];
                                        stringArray139[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[8]];
                                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray139) ? 1 : 0)) break block251;
                                        String[] stringArray140 = new String[lIIIIIIIllI[1]];
                                        stringArray140[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[253]];
                                        if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray140).getQuantity(), lIIIIIIIllI[5])) break block251;
                                    }
                                    if (!v.llIllIlIlIlll(AccBuilderTempleTrek.d ? 1 : 0)) break block251;
                                    if (v.llIllIlIlIlll(Players.getLocal().getWorldLocation().equals((Object)ez) ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)ez);

                                        Time.sleepTicks((int)lIIIIIIIllI[5]);

                                    }
                                    if (!v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)ez) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[lIIIIIIIllI[1]];
                                    nArray51[v.lIIIIIIIllI[0]] = lIIIIIIIllI[200];
                                    var6 = TileObjects.getFirstAt((WorldPoint)dP, (int[])nArray51);
                                    String[] stringArray141 = new String[lIIIIIIIllI[1]];
                                    stringArray141[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);

                                    String[] stringArray142 = new String[lIIIIIIIllI[1]];
                                    stringArray142[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);

                                    String[] stringArray143 = new String[lIIIIIIIllI[1]];
                                    stringArray143[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);

                                    if (((174 + 56 - 55 + 23 ^ 14 + 73 - -26 + 42) & (0xFF ^ 0xBF ^ (0x26 ^ 0x3B) ^ -1)) >= (0x5F ^ 0x7A ^ (0x66 ^ 0x47))) break;
                                }
                                return;
                            }
                            int[] nArray = new int[lIIIIIIIllI[1]];
                            nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                            if (!v.llIllIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block252;
                            String[] stringArray = new String[lIIIIIIIllI[1]];
                            stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[257]];
                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block252;
                            String[] stringArray144 = new String[lIIIIIIIllI[1]];
                            stringArray144[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[258]];
                            if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray144).getQuantity(), lIIIIIIIllI[3])) break block252;
                            String[] stringArray145 = new String[lIIIIIIIllI[1]];
                            stringArray145[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[259]];
                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray145) ? 1 : 0)) break block252;
                            String[] stringArray146 = new String[lIIIIIIIllI[1]];
                            stringArray146[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[260]];
                            if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray146).getQuantity(), lIIIIIIIllI[3])) break block252;
                            String[] stringArray147 = new String[lIIIIIIIllI[1]];
                            stringArray147[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[261]];
                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray147) ? 1 : 0)) break block252;
                            String[] stringArray148 = new String[lIIIIIIIllI[1]];
                            stringArray148[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[262]];
                            if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray148).getQuantity(), lIIIIIIIllI[3])) break block252;
                            String[] stringArray149 = new String[lIIIIIIIllI[1]];
                            stringArray149[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[263]];
                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray149) ? 1 : 0)) break block252;
                            String[] stringArray150 = new String[lIIIIIIIllI[1]];
                            stringArray150[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[264]];
                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray150) ? 1 : 0)) break block252;
                            int[] nArray52 = new int[lIIIIIIIllI[1]];
                            nArray52[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                            if (!v.llIllIlIllIll(Inventory.getCount((int[])nArray52)) || !v.llIllIlIlIlIl(dL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block252;
                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[265]];
                            while (true) {
                                block284: {
                                    block285: {
                                        block283: {
                                            String[] stringArray151 = new String[lIIIIIIIllI[1]];
                                            stringArray151[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[266]];
                                            if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray151) ? 1 : 0)) break block283;
                                            String[] stringArray152 = new String[lIIIIIIIllI[1]];
                                            stringArray152[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[267]];
                                            if (!v.llIllIlIllllI(Inventory.getFirst((String[])stringArray152).getQuantity(), lIIIIIIIllI[3])) break block284;
                                        }
                                        String[] stringArray153 = new String[lIIIIIIIllI[1]];
                                        stringArray153[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[268]];
                                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray153) ? 1 : 0)) break block285;
                                        String[] stringArray154 = new String[lIIIIIIIllI[1]];
                                        stringArray154[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[269]];
                                        if (!v.llIllIlIllllI(Inventory.getFirst((String[])stringArray154).getQuantity(), lIIIIIIIllI[3])) break block284;
                                    }
                                    String[] stringArray155 = new String[lIIIIIIIllI[1]];
                                    stringArray155[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[270]];
                                    if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray155) ? 1 : 0)) break block252;
                                    String[] stringArray156 = new String[lIIIIIIIllI[1]];
                                    stringArray156[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[271]];
                                    if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray156).getQuantity(), lIIIIIIIllI[3])) break block252;
                                }
                                if (!v.llIllIlIlIlll(AccBuilderTempleTrek.d ? 1 : 0)) break block252;
                                if (v.llIllIlIlIlll(Players.getLocal().getWorldLocation().equals((Object)ey) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)ey);

                                    Time.sleepTicks((int)lIIIIIIIllI[5]);

                                }
                                if (!v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)ey) ? 1 : 0)) continue;
                                int[] nArray53 = new int[lIIIIIIIllI[1]];
                                nArray53[v.lIIIIIIIllI[0]] = lIIIIIIIllI[200];
                                var6 = TileObjects.getFirstAt((WorldPoint)dQ, (int[])nArray53);
                                String[] stringArray157 = new String[lIIIIIIIllI[1]];
                                stringArray157[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[272]];
                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray157) ? 1 : 0)) {
                                    String[] stringArray158 = new String[lIIIIIIIllI[1]];
                                    stringArray158[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[273]];
                                    Inventory.getFirst((String[])stringArray158).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);

                                }
                                String[] stringArray159 = new String[lIIIIIIIllI[1]];
                                stringArray159[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[274]];
                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[lIIIIIIIllI[1]];
                                    stringArray160[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);

                                }
                                String[] stringArray161 = new String[lIIIIIIIllI[1]];
                                stringArray161[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[276]];
                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[lIIIIIIIllI[1]];
                                    stringArray162[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);

                                }

                                if (((0x99 ^ 0xC6 ^ (0x5E ^ 0x4C)) & (0x6F ^ 0x7B ^ (0xDB ^ 0x82) ^ -1)) <= -1) break;
                            }
                            return;
                        }
                        int[] nArray = new int[lIIIIIIIllI[1]];
                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[41];
                        if (!v.llIllIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block253;
                        String[] stringArray = new String[lIIIIIIIllI[1]];
                        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[278]];
                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block253;
                        String[] stringArray163 = new String[lIIIIIIIllI[1]];
                        stringArray163[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[279]];
                        if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray163).getQuantity(), lIIIIIIIllI[1])) break block253;
                        String[] stringArray164 = new String[lIIIIIIIllI[1]];
                        stringArray164[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[280]];
                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray164) ? 1 : 0)) break block253;
                        String[] stringArray165 = new String[lIIIIIIIllI[1]];
                        stringArray165[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[281]];
                        if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray165).getQuantity(), lIIIIIIIllI[1])) break block253;
                        String[] stringArray166 = new String[lIIIIIIIllI[1]];
                        stringArray166[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[282]];
                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray166) ? 1 : 0)) break block253;
                        String[] stringArray167 = new String[lIIIIIIIllI[1]];
                        stringArray167[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[283]];
                        if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray167).getQuantity(), lIIIIIIIllI[1])) break block253;
                        String[] stringArray168 = new String[lIIIIIIIllI[1]];
                        stringArray168[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[284]];
                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray168) ? 1 : 0)) break block253;
                        String[] stringArray169 = new String[lIIIIIIIllI[1]];
                        stringArray169[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[285]];
                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray169) ? 1 : 0)) break block253;
                        int[] nArray54 = new int[lIIIIIIIllI[1]];
                        nArray54[v.lIIIIIIIllI[0]] = lIIIIIIIllI[143];
                        if (!v.llIllIlIllIll(Inventory.getCount((int[])nArray54)) || !v.llIllIlIlIlIl(dL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block253;
                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[286]];
                        while (true) {
                            block287: {
                                block288: {
                                    block286: {
                                        String[] stringArray170 = new String[lIIIIIIIllI[1]];
                                        stringArray170[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[287]];
                                        if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray170) ? 1 : 0)) break block286;
                                        String[] stringArray171 = new String[lIIIIIIIllI[1]];
                                        stringArray171[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[288]];
                                        if (!v.llIllIlIllllI(Inventory.getFirst((String[])stringArray171).getQuantity(), lIIIIIIIllI[1])) break block287;
                                    }
                                    String[] stringArray172 = new String[lIIIIIIIllI[1]];
                                    stringArray172[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[289]];
                                    if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray172) ? 1 : 0)) break block288;
                                    String[] stringArray173 = new String[lIIIIIIIllI[1]];
                                    stringArray173[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[290]];
                                    if (!v.llIllIlIllllI(Inventory.getFirst((String[])stringArray173).getQuantity(), lIIIIIIIllI[1])) break block287;
                                }
                                String[] stringArray174 = new String[lIIIIIIIllI[1]];
                                stringArray174[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[291]];
                                if (!v.llIllIlIlIlIl(Inventory.contains((String[])stringArray174) ? 1 : 0)) break block253;
                                String[] stringArray175 = new String[lIIIIIIIllI[1]];
                                stringArray175[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[292]];
                                if (!v.llIllIlIlllIl(Inventory.getFirst((String[])stringArray175).getQuantity(), lIIIIIIIllI[1])) break block253;
                            }
                            if (!v.llIllIlIlIlll(AccBuilderTempleTrek.d ? 1 : 0)) break block253;
                            if (v.llIllIlIlIlll(Players.getLocal().getWorldLocation().equals((Object)ex) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)ex);

                            }
                            if (!v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)ex) ? 1 : 0)) continue;
                            int[] nArray55 = new int[lIIIIIIIllI[1]];
                            nArray55[v.lIIIIIIIllI[0]] = lIIIIIIIllI[200];
                            var6 = TileObjects.getFirstAt((WorldPoint)dR, (int[])nArray55);
                            String[] stringArray176 = new String[lIIIIIIIllI[1]];
                            stringArray176[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[293]];
                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray176) ? 1 : 0)) {
                                String[] stringArray177 = new String[lIIIIIIIllI[1]];
                                stringArray177[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[294]];
                                Inventory.getFirst((String[])stringArray177).useOn((TileObject)var6);
                                Time.sleepTicks((int)lIIIIIIIllI[1]);

                            }
                            String[] stringArray178 = new String[lIIIIIIIllI[1]];
                            stringArray178[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[295]];
                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[lIIIIIIIllI[1]];
                                stringArray179[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)var6);
                                Time.sleepTicks((int)lIIIIIIIllI[1]);

                            }
                            String[] stringArray180 = new String[lIIIIIIIllI[1]];
                            stringArray180[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[297]];
                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[lIIIIIIIllI[1]];
                                stringArray181[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)var6);
                                Time.sleepTicks((int)lIIIIIIIllI[1]);

                            }

                            if (2 >= (0xBB ^ 0xBF)) break;
                        }
                        return;
                    }
                    String[] stringArray = new String[lIIIIIIIllI[1]];
                    stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[299]];
                    if (v.llIllIlIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray182 = new String[lIIIIIIIllI[1]];
                        stringArray182[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[300]];
                        if (v.llIllIlIlIlll(Inventory.contains((String[])stringArray182) ? 1 : 0)) {
                            String[] stringArray183 = new String[lIIIIIIIllI[1]];
                            stringArray183[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[301]];
                            if (v.llIllIlIlIlll(Inventory.contains((String[])stringArray183) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[302]];
                                int[] nArray = new int[lIIIIIIIllI[1]];
                                nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[303];
                                var6 = TileObjects.getNearest((int[])nArray);
                                int[] nArray56 = new int[lIIIIIIIllI[1]];
                                nArray56[v.lIIIIIIIllI[0]] = lIIIIIIIllI[304];
                                var5 = Inventory.getFirst((int[])nArray56);
                                if (v.llIllIlIllIlI(var6) && v.llIllIlIllIlI(var5)) {
                                    var5.useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIIIIIllI[5]);

                                }
                            }
                        }
                    }
                }
                if (v.llIllIlIlllIl(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[13])) {
                    AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[305]];
                    int[] nArray = new int[lIIIIIIIllI[1]];
                    nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[306];
                    var6 = TileObjects.getNearest((int[])nArray);
                    int[] nArray57 = new int[lIIIIIIIllI[1]];
                    nArray57[v.lIIIIIIIllI[0]] = lIIIIIIIllI[307];
                    var5 = Inventory.getFirst((int[])nArray57);
                    if (v.llIllIlIlIllI(ck, lIIIIIIIllI[1])) {
                        ac.kl += lIIIIIIIllI[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lIIIIIIIllI[1];
                        ac.kl = lIIIIIIIllI[0];
                        cl = lIIIIIIIllI[0];
                    }
                    if (v.llIllIlIllIlI(var6) && v.llIllIlIllIlI(var5)) {
                        var5.useOn((TileObject)var6);
                        Time.sleepTicks((int)lIIIIIIIllI[7]);

                        g.a(eR);
                    }
                }
                if (!v.llIllIlIlllIl(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[19])) break block254;
                String[] stringArray = new String[lIIIIIIIllI[1]];
                stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[308]];
                if (!v.llIllIlIlllll(TileObjects.getNearest((String[])stringArray))) break block289;
                String[] stringArray184 = new String[lIIIIIIIllI[1]];
                stringArray184[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[309]];
                if (!v.llIllIlIllIlI(TileObjects.getNearest((String[])stringArray184))) break block254;
            }
            String[] stringArray = new String[lIIIIIIIllI[1]];
            stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[310]];
            if (v.llIllIlIllIlI(TileObjects.getNearest((String[])stringArray))) {
                AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[311]];
                if (v.llIllIlIlIlll(Equipment.contains((int[])f.aM) ? 1 : 0) && v.llIllIlIlIlIl(Inventory.contains((int[])f.aM) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aM).interact(llllllllIl[lIIIIIIIllI[312]]);
                    Time.sleepTicks((int)lIIIIIIIllI[6]);

                }
                if (v.llIllIlIlIlIl(Equipment.contains((int[])f.aM) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aM).interact(llllllllIl[lIIIIIIIllI[313]]);
                    Time.sleepTicks((int)lIIIIIIIllI[6]);

                }
            }
        }
    }

    private static boolean llIllIlIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIllIlIllIII(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean S() {
        return lIIIIIIIllI[0];
    }
}

