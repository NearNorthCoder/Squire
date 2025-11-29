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
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OHelper
implements M {
    private static final  WorldPoint dh;
    public static  int dH;
    static  int dJ;
    public static final  int[] cH;
    static final  int cS;
    private static final  int dC;
    private static final  WorldPoint dk;
    private static final  WorldPoint dA;
    private static final  WorldPoint dg;
    private static final  WorldPoint dn;
    private static final  WorldPoint dv;
    
    private static final  WorldPoint di;
    private static final  WorldPoint do;
    static  WorldPoint dT;
    
    public static  int dI;
    private static final  WorldPoint dy;
    private static final  WorldPoint df;
    static final  WorldPoint[] cZ;
    private static final  WorldPoint dm;
    static  WorldArea dU;
    static  int co;
    static  int dL;
    public static final  WorldPoint cL;
    public static final  int[] cG;
    private static final  WorldPoint dw;
    public static final  WorldPoint cM;
    static  String dS;
    public static final  WorldPoint cN;
    private static final  WorldPoint de;
    private static final  WorldPoint dt;
    private static final  WorldPoint du;
    static  WorldPoint dV;
    static final  int cU;
    public static final  WorldPoint cO;
    static  int dM;
    static  String dR;
    private static final  int dE;
    static final  int cQ;
    public static  boolean by;
    static  int dN;
    private static final  WorldPoint ds;
    public static final  WorldPoint cK;
    static  WorldArea dW;
    static  String dQ;
    static final  int cV;
    private static final  WorldPoint dl;
    private static final  WorldPoint dp;
    static final  int cT;
    private static final  WorldPoint dc;
    static final  int cR;
    static  int dO;
    private static final  WorldPoint dx;
    private static final  WorldPoint dr;
    private static final  WorldPoint dd;
    static final  int cW;
    public static final  int[] cI;
    private static final  WorldPoint da;
    private static final  int dF;
    public static  WorldArea dG;
    public static  List<d> bA;
    static final  int cX;
    public static final  WorldPoint cP;
    private static final  WorldPoint dz;
    private static final  WorldPoint dq;
    public static final  WorldArea cJ;
    private static final  WorldPoint dj;
    private static final  int dB;
    static  String[] dP;
    static  int dK;
    private static final  int dD;
    static  int bY;
    private static final  WorldPoint db;
    static final  int cY;
    static  boolean cp;

    private static boolean lIlIIlIllIIIlIl(int n2) {
        return n2 != 0;
    }

    public static void W() {
        d var1;
        Object var2;
        block20: {
            block19: {
                int[] nArray = new int[lIIIllllIIlll[1]];
                nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[20];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIIllllIIlll[20], lIIIllllIIlll[44], lIIIllllIIlll[315]);
                    bA.add(d2);

                }
                int[] nArray2 = new int[lIIIllllIIlll[1]];
                nArray2[o.lIIIllllIIlll[0]] = lIIIllllIIlll[316];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var2 = new DHelper(lIIIllllIIlll[316], lIIIllllIIlll[7], h.bv);
                    bA.add((DHelper) ar2);

                }
                int[] nArray3 = new int[lIIIllllIIlll[1]];
                nArray3[o.lIIIllllIIlll[0]] = lIIIllllIIlll[14];
                if (o.lIlIIlIllIIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIllllIIlll[1]];
                    nArray4[o.lIIIllllIIlll[0]] = lIIIllllIIlll[14];
                    if (o.lIlIIlIllIIIllI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIllllIIlll[11])) {
                        var2 = new DHelper(lIIIllllIIlll[14], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                        bA.add((DHelper) ar2);

                    }
                }
                int[] nArray5 = new int[lIIIllllIIlll[1]];
                nArray5[o.lIIIllllIIlll[0]] = lIIIllllIIlll[15];
                if (o.lIlIIlIllIIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIllllIIlll[1]];
                    nArray6[o.lIIIllllIIlll[0]] = lIIIllllIIlll[15];
                    if (o.lIlIIlIllIIIllI(Bank.getFirst((int[])nArray6).getQuantity(), lIIIllllIIlll[11])) {
                        var2 = new DHelper(lIIIllllIIlll[15], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                        bA.add((DHelper) ar2);

                    }
                }
                int[] nArray7 = new int[lIIIllllIIlll[1]];
                nArray7[o.lIIIllllIIlll[0]] = lIIIllllIIlll[16];
                if (o.lIlIIlIllIIIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIllllIIlll[1]];
                    nArray8[o.lIIIllllIIlll[0]] = lIIIllllIIlll[16];
                    if (o.lIlIIlIllIIIllI(Bank.getFirst((int[])nArray8).getQuantity(), lIIIllllIIlll[11])) {
                        var2 = new DHelper(lIIIllllIIlll[16], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                        bA.add((DHelper) ar2);

                    }
                }
                int[] nArray9 = new int[lIIIllllIIlll[1]];
                nArray9[o.lIIIllllIIlll[0]] = lIIIllllIIlll[14];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    var2 = new DHelper(lIIIllllIIlll[14], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                    bA.add((DHelper) ar2);

                }
                int[] nArray10 = new int[lIIIllllIIlll[1]];
                nArray10[o.lIIIllllIIlll[0]] = lIIIllllIIlll[15];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    var2 = new DHelper(lIIIllllIIlll[15], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                    bA.add((DHelper) ar2);

                }
                int[] nArray11 = new int[lIIIllllIIlll[1]];
                nArray11[o.lIIIllllIIlll[0]] = lIIIllllIIlll[16];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    var2 = new DHelper(lIIIllllIIlll[16], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                    bA.add((DHelper) ar2);

                }
                int[] nArray12 = new int[lIIIllllIIlll[1]];
                nArray12[o.lIIIllllIIlll[0]] = lIIIllllIIlll[14];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    var2 = new DHelper(lIIIllllIIlll[14], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                    bA.add((DHelper) ar2);

                }
                int[] nArray13 = new int[lIIIllllIIlll[1]];
                nArray13[o.lIIIllllIIlll[0]] = lIIIllllIIlll[318];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    var2 = new DHelper(lIIIllllIIlll[318], lIIIllllIIlll[7], lIIIllllIIlll[315]);
                    bA.add((DHelper) ar2);

                }
                int[] nArray14 = new int[lIIIllllIIlll[1]];
                nArray14[o.lIIIllllIIlll[0]] = lIIIllllIIlll[24];
                if (!o.lIlIIlIllIIIlIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block19;
                int[] nArray15 = new int[lIIIllllIIlll[1]];
                nArray15[o.lIIIllllIIlll[0]] = lIIIllllIIlll[24];
                if (!o.lIlIIlIllIIIlIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lIIIllllIIlll[1]];
                nArray16[o.lIIIllllIIlll[0]] = lIIIllllIIlll[24];
                if (!o.lIlIIlIllIIIllI(Bank.getFirst((int[])nArray16).getQuantity(), lIIIllllIIlll[19])) break block20;
            }
            var2 = new DHelper(lIIIllllIIlll[24], lIIIllllIIlll[19], lIIIllllIIlll[319]);
            bA.add((DHelper) ar2);

        }
        int[] nArray = new int[lIIIllllIIlll[1]];
        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[18];
        if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var2 = new DHelper(lIIIllllIIlll[18], lIIIllllIIlll[7], lIIIllllIIlll[320]);
            bA.add((DHelper) ar2);

        }
        if (o.lIlIIlIllIIIlll(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lIIIllllIIlII[lIIIllllIIlll[326]]))) ? 1 : 0)) {
            var1 = new DHelper(lIIIllllIIlll[321], lIIIllllIIlll[25], lIIIllllIIlll[322]);
            bA.add(var1);

        }
        int[] nArray17 = new int[lIIIllllIIlll[1]];
        nArray17[o.lIIIllllIIlll[0]] = lIIIllllIIlll[323];
        if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray17) ? 1 : 0)) {
            var1 = new DHelper(lIIIllllIIlll[323], lIIIllllIIlll[58], lIIIllllIIlll[324]);
            bA.add(var1);

        }
    }

    @Override
    public int Y() {
        try {
            o.aI();

        }
        catch (Exception var3) {
            var3.printStackTrace();
        }
        if ((0x39 ^ 0x3D) < (0x7A ^ 0x7E)) {
            return (0x92 ^ 0x88) & ~(0xDC ^ 0xC6);
        }
        return lIIIllllIIlll[121];
    }

    static {
        o.lIlIIlIllIIIlII();
        o.lIlIIlIllIIIIll();
        cY = lIIIllllIIlll[19];
        cQ = lIIIllllIIlll[10];
        cV = lIIIllllIIlll[7];
        dE = lIIIllllIIlll[306];
        cU = lIIIllllIIlll[6];
        dC = lIIIllllIIlll[145];
        dB = lIIIllllIIlll[49];
        cR = lIIIllllIIlll[1];
        cS = lIIIllllIIlll[3];
        cT = lIIIllllIIlll[5];
        cX = lIIIllllIIlll[13];
        dD = lIIIllllIIlll[303];
        cW = lIIIllllIIlll[11];
        dF = lIIIllllIIlll[143];
        int[] nArray = new int[lIIIllllIIlll[17]];
        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[318];
        nArray[o.lIIIllllIIlll[1]] = lIIIllllIIlll[333];
        nArray[o.lIIIllllIIlll[3]] = lIIIllllIIlll[334];
        nArray[o.lIIIllllIIlll[5]] = lIIIllllIIlll[335];
        nArray[o.lIIIllllIIlll[6]] = lIIIllllIIlll[336];
        nArray[o.lIIIllllIIlll[7]] = lIIIllllIIlll[337];
        nArray[o.lIIIllllIIlll[11]] = lIIIllllIIlll[338];
        nArray[o.lIIIllllIIlll[9]] = lIIIllllIIlll[339];
        nArray[o.lIIIllllIIlll[13]] = lIIIllllIIlll[339];
        cG = nArray;
        int[] nArray2 = new int[lIIIllllIIlll[6]];
        nArray2[o.lIIIllllIIlll[0]] = lIIIllllIIlll[316];
        nArray2[o.lIIIllllIIlll[1]] = lIIIllllIIlll[340];
        nArray2[o.lIIIllllIIlll[3]] = lIIIllllIIlll[341];
        nArray2[o.lIIIllllIIlll[5]] = lIIIllllIIlll[342];
        cH = nArray2;
        int[] nArray3 = new int[lIIIllllIIlll[17]];
        nArray3[o.lIIIllllIIlll[0]] = lIIIllllIIlll[24];
        nArray3[o.lIIIllllIIlll[1]] = lIIIllllIIlll[343];
        nArray3[o.lIIIllllIIlll[3]] = lIIIllllIIlll[344];
        nArray3[o.lIIIllllIIlll[5]] = lIIIllllIIlll[345];
        nArray3[o.lIIIllllIIlll[6]] = lIIIllllIIlll[346];
        nArray3[o.lIIIllllIIlll[7]] = lIIIllllIIlll[347];
        nArray3[o.lIIIllllIIlll[11]] = lIIIllllIIlll[348];
        nArray3[o.lIIIllllIIlll[9]] = lIIIllllIIlll[349];
        nArray3[o.lIIIllllIIlll[13]] = lIIIllllIIlll[348];
        cI = nArray3;
        cJ = new WorldArea(lIIIllllIIlll[344], lIIIllllIIlll[350], lIIIllllIIlll[26], lIIIllllIIlll[25], lIIIllllIIlll[0]);
        cK = new WorldPoint(lIIIllllIIlll[351], lIIIllllIIlll[352], lIIIllllIIlll[0]);
        cL = new WorldPoint(lIIIllllIIlll[351], lIIIllllIIlll[353], lIIIllllIIlll[0]);
        cM = new WorldPoint(lIIIllllIIlll[351], lIIIllllIIlll[354], lIIIllllIIlll[0]);
        cN = new WorldPoint(lIIIllllIIlll[346], lIIIllllIIlll[354], lIIIllllIIlll[0]);
        cO = new WorldPoint(lIIIllllIIlll[346], lIIIllllIIlll[353], lIIIllllIIlll[0]);
        cP = new WorldPoint(lIIIllllIIlll[346], lIIIllllIIlll[352], lIIIllllIIlll[0]);
        WorldPoint[] worldPointArray = new WorldPoint[lIIIllllIIlll[7]];
        worldPointArray[o.lIIIllllIIlll[0]] = new WorldPoint(lIIIllllIIlll[355], lIIIllllIIlll[356], lIIIllllIIlll[0]);
        worldPointArray[o.lIIIllllIIlll[1]] = new WorldPoint(lIIIllllIIlll[357], lIIIllllIIlll[358], lIIIllllIIlll[0]);
        worldPointArray[o.lIIIllllIIlll[3]] = new WorldPoint(lIIIllllIIlll[359], lIIIllllIIlll[360], lIIIllllIIlll[0]);
        worldPointArray[o.lIIIllllIIlll[5]] = new WorldPoint(lIIIllllIIlll[361], lIIIllllIIlll[362], lIIIllllIIlll[0]);
        worldPointArray[o.lIIIllllIIlll[6]] = new WorldPoint(lIIIllllIIlll[363], lIIIllllIIlll[364], lIIIllllIIlll[0]);
        cZ = worldPointArray;
        da = new WorldPoint(lIIIllllIIlll[365], lIIIllllIIlll[53], lIIIllllIIlll[0]);
        db = new WorldPoint(lIIIllllIIlll[366], lIIIllllIIlll[367], lIIIllllIIlll[0]);
        dc = new WorldPoint(lIIIllllIIlll[368], lIIIllllIIlll[369], lIIIllllIIlll[0]);
        dd = new WorldPoint(lIIIllllIIlll[370], lIIIllllIIlll[371], lIIIllllIIlll[0]);
        de = new WorldPoint(lIIIllllIIlll[372], lIIIllllIIlll[373], lIIIllllIIlll[0]);
        df = new WorldPoint(lIIIllllIIlll[374], lIIIllllIIlll[375], lIIIllllIIlll[0]);
        dg = new WorldPoint(lIIIllllIIlll[376], lIIIllllIIlll[377], lIIIllllIIlll[0]);
        dh = new WorldPoint(lIIIllllIIlll[374], lIIIllllIIlll[378], lIIIllllIIlll[0]);
        di = new WorldPoint(lIIIllllIIlll[379], lIIIllllIIlll[380], lIIIllllIIlll[0]);
        dj = new WorldPoint(lIIIllllIIlll[379], lIIIllllIIlll[381], lIIIllllIIlll[1]);
        dk = new WorldPoint(lIIIllllIIlll[363], lIIIllllIIlll[382], lIIIllllIIlll[0]);
        dl = new WorldPoint(lIIIllllIIlll[383], lIIIllllIIlll[384], lIIIllllIIlll[0]);
        dm = new WorldPoint(lIIIllllIIlll[365], lIIIllllIIlll[385], lIIIllllIIlll[0]);
        dn = new WorldPoint(lIIIllllIIlll[386], lIIIllllIIlll[387], lIIIllllIIlll[0]);
        do = new WorldPoint(lIIIllllIIlll[388], lIIIllllIIlll[389], lIIIllllIIlll[0]);
        dp = new WorldPoint(lIIIllllIIlll[390], lIIIllllIIlll[391], lIIIllllIIlll[0]);
        dq = new WorldPoint(lIIIllllIIlll[392], lIIIllllIIlll[393], lIIIllllIIlll[0]);
        dr = new WorldPoint(lIIIllllIIlll[394], lIIIllllIIlll[395], lIIIllllIIlll[0]);
        ds = new WorldPoint(lIIIllllIIlll[396], lIIIllllIIlll[397], lIIIllllIIlll[0]);
        dt = new WorldPoint(lIIIllllIIlll[398], lIIIllllIIlll[399], lIIIllllIIlll[0]);
        du = new WorldPoint(lIIIllllIIlll[349], lIIIllllIIlll[350], lIIIllllIIlll[0]);
        dv = new WorldPoint(lIIIllllIIlll[400], lIIIllllIIlll[352], lIIIllllIIlll[0]);
        dw = new WorldPoint(lIIIllllIIlll[400], lIIIllllIIlll[353], lIIIllllIIlll[0]);
        dx = new WorldPoint(lIIIllllIIlll[400], lIIIllllIIlll[354], lIIIllllIIlll[0]);
        dy = new WorldPoint(lIIIllllIIlll[398], lIIIllllIIlll[354], lIIIllllIIlll[0]);
        dz = new WorldPoint(lIIIllllIIlll[398], lIIIllllIIlll[353], lIIIllllIIlll[0]);
        dA = new WorldPoint(lIIIllllIIlll[398], lIIIllllIIlll[352], lIIIllllIIlll[0]);
        bA = new ArrayList<d>();
        dG = new WorldArea(new WorldPoint(lIIIllllIIlll[379], lIIIllllIIlll[53], lIIIllllIIlll[0]), new WorldPoint(lIIIllllIIlll[368], lIIIllllIIlll[401], lIIIllllIIlll[0]));
        dH = lIIIllllIIlll[40];
        dI = lIIIllllIIlll[41];
        dJ = lIIIllllIIlll[0];
        dK = lIIIllllIIlll[0];
        dL = lIIIllllIIlll[0];
        dM = lIIIllllIIlll[0];
        dN = lIIIllllIIlll[0];
        dO = lIIIllllIIlll[0];
        String[] stringArray = new String[lIIIllllIIlll[5]];
        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[307]];
        stringArray[o.lIIIllllIIlll[1]] = lIIIllllIIlII[lIIIllllIIlll[402]];
        stringArray[o.lIIIllllIIlll[3]] = lIIIllllIIlII[lIIIllllIIlll[143]];
        dP = stringArray;
        dQ = lIIIllllIIlII[lIIIllllIIlll[403]];
        dR = lIIIllllIIlII[lIIIllllIIlll[404]];
        dS = lIIIllllIIlII[lIIIllllIIlll[405]];
        dT = new WorldPoint(lIIIllllIIlll[349], lIIIllllIIlll[406], lIIIllllIIlll[0]);
        dU = new WorldArea(lIIIllllIIlll[407], lIIIllllIIlll[408], lIIIllllIIlll[10], lIIIllllIIlll[84], lIIIllllIIlll[0]);
        dV = new WorldPoint(lIIIllllIIlll[409], lIIIllllIIlll[410], lIIIllllIIlll[0]);
        dW = new WorldArea(lIIIllllIIlll[411], lIIIllllIIlll[412], lIIIllllIIlll[82], lIIIllllIIlll[90], lIIIllllIIlll[0]);
        bY = lIIIllllIIlll[0];
    }

    private static boolean lIlIIlIllIIlIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIllIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String Z() {
        return lIIIllllIIlII[lIIIllllIIlll[325]];
    }

    private static void lIlIIlIllIIIIll() {
        lIIIllllIIlII = new String[lIIIllllIIlll[413]];
        o.lIIIllllIIlII[o.lIIIllllIIlll[0]] = "Buying items";
        o.lIIIllllIIlII[o.lIIIllllIIlll[1]] = "Finished buying items, switching back to questing";
        o.lIIIllllIIlII[o.lIIIllllIIlll[3]] = "Drink";
        o.lIIIllllIIlII[o.lIIIllllIIlll[5]] = "Shark";
        o.lIIIllllIIlII[o.lIIIllllIIlll[6]] = "Shark";
        o.lIIIllllIIlII[o.lIIIllllIIlll[7]] = "Eat";
        o.lIIIllllIIlII[o.lIIIllllIIlll[11]] = "Navigating to bank";
        o.lIIIllllIIlII[o.lIIIllllIIlll[9]] = "Opening bank";
        o.lIIIllllIIlII[o.lIIIllllIIlll[13]] = "Handling banking";
        o.lIIIllllIIlII[o.lIIIllllIIlll[17]] = "We are missing runessupplies, switching to BUYING";
        o.lIIIllllIIlII[o.lIIIllllIIlll[19]] = "Rope";
        o.lIIIllllIIlII[o.lIIIllllIIlll[21]] = "Shark";
        o.lIIIllllIIlII[o.lIIIllllIIlll[22]] = "We are missing supplies, switching to BUYING";
        o.lIIIllllIIlII[o.lIIIllllIIlll[23]] = "Rope";
        o.lIIIllllIIlII[o.lIIIllllIIlll[4]] = "Shark";
        o.lIIIllllIIlII[o.lIIIllllIIlll[26]] = "Drink";
        o.lIIIllllIIlII[o.lIIIllllIIlll[27]] = "Nav to start";
        o.lIIIllllIIlII[o.lIIIllllIIlll[28]] = "Chatting";
        o.lIIIllllIIlII[o.lIIIllllIIlll[25]] = "Nav to boy";
        o.lIIIllllIIlII[o.lIIIllllIIlll[29]] = "Chat boy";
        o.lIIIllllIIlII[o.lIIIllllIIlll[30]] = "Nav to bookcase";
        o.lIIIllllIIlII[o.lIIIllllIIlll[32]] = "Book on baxtorian";
        o.lIIIllllIIlII[o.lIIIllllIIlll[33]] = "Searching bookcase";
        o.lIIIllllIIlII[o.lIIIllllIIlll[34]] = "Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[35]] = "Book on baxtorian";
        o.lIIIllllIIlII[o.lIIIllllIIlll[37]] = "Book on baxtorian";
        o.lIIIllllIIlII[o.lIIIllllIIlll[38]] = "Reading";
        o.lIIIllllIIlII[o.lIIIllllIIlll[39]] = "Read";
        o.lIIIllllIIlII[o.lIIIllllIIlll[42]] = "Tele to CW";
        o.lIIIllllIIlII[o.lIIIllllIIlll[43]] = "Wear";
        o.lIIIllllIIlII[o.lIIIllllIIlll[44]] = "Castle Wars";
        o.lIIIllllIIlII[o.lIIIllllIIlll[45]] = "Nav to maze ladder";
        o.lIIIllllIIlII[o.lIIIllllIIlll[46]] = "Fountain";
        o.lIIIllllIIlII[o.lIIIllllIIlll[48]] = "Climb-down";
        o.lIIIllllIIlII[o.lIIIllllIIlll[50]] = "nav to box";
        o.lIIIllllIIlII[o.lIIIllllIIlll[51]] = "Searching crate";
        o.lIIIllllIIlII[o.lIIIllllIIlll[52]] = "Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[54]] = "Nav to cage";
        o.lIIIllllIIlII[o.lIIIllllIIlll[56]] = "Entering cage";
        o.lIIIllllIIlII[o.lIIIllllIIlll[57]] = "Chat npc";
        o.lIIIllllIIlII[o.lIIIllllIIlll[58]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[59]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[60]] = "Nav to tombstone";
        o.lIIIllllIIlII[o.lIIIllllIIlll[61]] = "Wear";
        o.lIIIllllIIlII[o.lIIIllllIIlll[62]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[63]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[64]] = "Entering tomb";
        o.lIIIllllIIlII[o.lIIIllllIIlll[67]] = "Stalagmite";
        o.lIIIllllIIlII[o.lIIIllllIIlll[68]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[69]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[2]] = "Getting ammy";
        o.lIIIllllIIlII[o.lIIIllllIIlll[71]] = "Open";
        o.lIIIllllIIlII[o.lIIIllllIIlll[73]] = "Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[74]] = "Stalagmite";
        o.lIIIllllIIlII[o.lIIIllllIIlll[75]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[76]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[77]] = "Getting ammy";
        o.lIIIllllIIlII[o.lIIIllllIIlll[78]] = "Open";
        o.lIIIllllIIlII[o.lIIIllllIIlll[79]] = "Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[80]] = "Stalagmite";
        o.lIIIllllIIlII[o.lIIIllllIIlll[82]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[83]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[84]] = "Getting ashes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[85]] = "Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[86]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[10]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[87]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[88]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[89]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[90]] = "Nav to bank";
        o.lIIIllllIIlII[o.lIIIllllIIlll[91]] = "Wear";
        o.lIIIllllIIlII[o.lIIIllllIIlll[92]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[93]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[94]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[95]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[96]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[97]] = "Opening bank";
        o.lIIIllllIIlII[o.lIIIllllIIlll[98]] = "Withdrawing runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[99]] = "Vial";
        o.lIIIllllIIlII[o.lIIIllllIIlll[100]] = "Shark";
        o.lIIIllllIIlII[o.lIIIllllIIlll[101]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[102]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[103]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[104]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[105]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[106]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[107]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[108]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[109]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[110]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[111]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[112]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[113]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[114]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[115]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[116]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[117]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[118]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[119]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[120]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[121]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[122]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[123]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[124]] = "Nav to door entrance";
        o.lIIIllllIIlII[o.lIIIllllIIlll[125]] = "Rope";
        o.lIIIllllIIlII[o.lIIIllllIIlll[126]] = "Rock";
        o.lIIIllllIIlII[o.lIIIllllIIlll[127]] = "Roping rock";
        o.lIIIllllIIlII[o.lIIIllllIIlll[129]] = "Rope";
        o.lIIIllllIIlII[o.lIIIllllIIlll[131]] = "Roping tree";
        o.lIIIllllIIlII[o.lIIIllllIIlll[132]] = "Door";
        o.lIIIllllIIlII[o.lIIIllllIIlll[133]] = "Entering door";
        o.lIIIllllIIlII[o.lIIIllllIIlll[134]] = "Open";
        o.lIIIllllIIlII[o.lIIIllllIIlll[135]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[136]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[137]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[138]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[139]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[140]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[141]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[142]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[144]] = "Nav to key and get";
        o.lIIIllllIIlII[o.lIIIllllIIlll[146]] = "Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[147]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[148]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[149]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[150]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[151]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[152]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[153]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[154]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[155]] = "Nav to last room";
        o.lIIIllllIIlII[o.lIIIllllIIlll[156]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[157]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[158]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[159]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[160]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[161]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[162]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[163]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[164]] = "Door";
        o.lIIIllllIIlII[o.lIIIllllIIlll[166]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[167]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[168]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[169]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[170]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[171]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[172]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[173]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[174]] = "Door";
        o.lIIIllllIIlII[o.lIIIllllIIlll[175]] = "Open";
        o.lIIIllllIIlII[o.lIIIllllIIlll[176]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[177]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[178]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[179]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[180]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[181]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[182]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[183]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[184]] = "Nav to SE Pillar";
        o.lIIIllllIIlII[o.lIIIllllIIlll[185]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[186]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[187]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[188]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[189]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[190]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[191]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[192]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[193]] = "Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[194]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[195]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[196]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[197]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[198]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[199]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[201]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[202]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[203]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[204]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[205]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[206]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[207]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[208]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[209]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[210]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[211]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[212]] = "Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[213]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[214]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[215]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[216]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[217]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[218]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[219]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[220]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[221]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[222]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[223]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[224]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[225]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[226]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[227]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[228]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[229]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[230]] = "Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[231]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[232]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[233]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[234]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[235]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[236]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[237]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[238]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[239]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[240]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[241]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[242]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[243]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[244]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[245]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[246]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[247]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[248]] = "Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[249]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[250]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[251]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[252]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[8]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[253]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[254]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[255]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[256]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[257]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[258]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[259]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[260]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[261]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[262]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[263]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[264]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[265]] = "Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[266]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[267]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[268]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[269]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[270]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[271]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[272]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[273]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[274]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[275]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[276]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[277]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[278]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[279]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[280]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[281]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[282]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[283]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[284]] = "Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[285]] = "Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[286]] = "Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[287]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[288]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[289]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[290]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[291]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[292]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[293]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[294]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[295]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[296]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[297]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[298]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[299]] = "Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[300]] = "Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[301]] = "Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[302]] = "Putting neck on statue";
        o.lIIIllllIIlII[o.lIIIllllIIlll[305]] = "Putting ashes inside";
        o.lIIIllllIIlII[o.lIIIllllIIlll[308]] = "Chalice";
        o.lIIIllllIIlII[o.lIIIllllIIlll[309]] = "Statue of Glarial";
        o.lIIIllllIIlII[o.lIIIllllIIlll[310]] = "Pillar";
        o.lIIIllllIIlII[o.lIIIllllIIlll[311]] = "Teleporting to CW";
        o.lIIIllllIIlII[o.lIIIllllIIlll[312]] = "Wear";
        o.lIIIllllIIlII[o.lIIIllllIIlll[313]] = "Castle Wars";
        o.lIIIllllIIlII[o.lIIIllllIIlll[314]] = "Rope";
        o.lIIIllllIIlII[o.lIIIllllIIlll[325]] = "Waterfall quest";
        o.lIIIllllIIlII[o.lIIIllllIIlll[326]] = "ring of wealth (";
        o.lIIIllllIIlII[o.lIIIllllIIlll[327]] = "Stalagmite";
        o.lIIIllllIIlII[o.lIIIllllIIlll[328]] = "Games";
        o.lIIIllllIIlII[o.lIIIllllIIlll[329]] = "Games";
        o.lIIIllllIIlII[o.lIIIllllIIlll[330]] = "Games";
        o.lIIIllllIIlII[o.lIIIllllIIlll[331]] = "dueling";
        o.lIIIllllIIlII[o.lIIIllllIIlll[332]] = "dueling";
        o.lIIIllllIIlII[o.lIIIllllIIlll[40]] = "dueling";
        o.lIIIllllIIlII[o.lIIIllllIIlll[41]] = "dueling";
        o.lIIIllllIIlII[o.lIIIllllIIlll[304]] = "dueling";
        o.lIIIllllIIlII[o.lIIIllllIIlll[307]] = "How can I help?";
        o.lIIIllllIIlII[o.lIIIllllIIlll[402]] = "I'm always happy to help a cook in distress.";
        o.lIIIllllIIlII[o.lIIIllllIIlll[143]] = "Yes.";
        o.lIIIllllIIlII[o.lIIIllllIIlll[403]] = "Golrie";
        o.lIIIllllIIlII[o.lIIIllllIIlll[404]] = "Hudon";
        o.lIIIllllIIlII[o.lIIIllllIIlll[405]] = "Almera";
    }

    private static boolean lIlIIlIllIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean X() {
        return lIIIllllIIlll[0];
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (o.lIlIIlIllIIlIIl(e.j(lIIIllllIIlll[10]), lIIIllllIIlll[19])) {
            bl = lIIIllllIIlll[1];

            }
        } else {
            bl = lIIIllllIIlll[0];
        }
        return bl;
    }

    private static boolean lIlIIlIllIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIllIIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIIlIllIIllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlIllIIlIlI(Object object) {
        return object != null;
    }

        return String.valueOf(var4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aJ() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIIllllIIlll[1]];
                nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[20];
                if (!o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0) || !o.lIlIIlIllIIIlIl(Inventory.contains((int[])f.ba) ? 1 : 0)) break block2;
                if (!o.lIlIIlIllIIIlll(Inventory.contains((int[])f.aT) ? 1 : 0)) break block3;
                if (!o.lIlIIlIllIIIlIl(Equipment.contains((int[])f.aT) ? 1 : 0) || o.lIlIIlIllIIIlll(Inventory.contains((int[])f.aS) ? 1 : 0) && !o.lIlIIlIllIIIlIl(Equipment.contains((int[])f.aS) ? 1 : 0)) break block2;
                String[] stringArray = new String[lIIIllllIIlll[1]];
                stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[314]];
                if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
            }
            n2 = lIIIllllIIlll[1];

            if (3 > 1) return n2 != 0;
            return false;
        }
        n2 = lIIIllllIIlll[0];
        return n2 != 0;
    }

    private static boolean lIlIIlIllIIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIllIIIlll(int n2) {
        return n2 == 0;
    }

    public static void aI() {
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
                                                                                                        if (o.lIlIIlIllIIIlIl(by ? 1 : 0)) {
                                                                                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[0]];
                                                                                                            b.a(bA);
                                                                                                            if (o.lIlIIlIllIIIllI(bA.size(), lIIIllllIIlll[1])) {
                                                                                                                System.out.println(lIIIllllIIlII[lIIIllllIIlll[1]]);
                                                                                                                by = lIIIllllIIlll[0];
                                                                                                            }
                                                                                                        }
                                                                                                        if (!o.lIlIIlIllIIIlll(by ? 1 : 0)) break block254;
                                                                                                        if (o.lIlIIlIllIIIlIl(Inventory.contains((int[])f.ba) ? 1 : 0) && o.lIlIIlIllIIIllI(Movement.getRunEnergy(), lIIIllllIIlll[2]) && o.lIlIIlIllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                                                                                                            Inventory.getFirst((int[])f.ba).interact(lIIIllllIIlII[lIIIllllIIlll[3]]);
                                                                                                            Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                                        }
                                                                                                        if (!o.lIlIIlIllIIlIII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIllllIIlll[4]) || o.lIlIIlIllIIIlIl(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                                                            stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[5]];
                                                                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[lIIIllllIIlll[1]];
                                                                                                                stringArray2[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(lIIIllllIIlII[lIIIllllIIlll[7]]);
                                                                                                                Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                                            }
                                                                                                        }
                                                                                                        if (o.lIlIIlIllIIIllI(e.j(lIIIllllIIlll[8]), lIIIllllIIlll[9])) {
                                                                                                            p.aP();
                                                                                                        }
                                                                                                        if (!o.lIlIIlIllIIIlll(e.j(lIIIllllIIlll[10])) || !o.lIlIIlIllIIlIIl(e.j(lIIIllllIIlll[8]), lIIIllllIIlll[9])) break block255;
                                                                                                        if (!o.lIlIIlIllIIIlll(o.aJ() ? 1 : 0)) break block256;
                                                                                                        var6 = BankLocation.getNearest();
                                                                                                        if (o.lIlIIlIllIIlIlI(var6) && o.lIlIIlIllIIIlll(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[11]];
                                                                                                            a.a(var6);
                                                                                                        }
                                                                                                        if (!o.lIlIIlIllIIlIlI(var6) || !o.lIlIIlIllIIIlIl(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block256;
                                                                                                        if (o.lIlIIlIllIIIlll(Bank.isOpen() ? 1 : 0)) {
                                                                                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[9]];
                                                                                                            a.a();
                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIIlll[12]);

                                                                                                        }
                                                                                                        if (!o.lIlIIlIllIIIlIl(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[13]];
                                                                                                        if (o.lIlIIlIllIIlIll(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)lIIIllllIIlll[5]);

                                                                                                        }
                                                                                                        if (o.lIlIIlIllIIlIll(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)lIIIllllIIlll[3]);

                                                                                                        }
                                                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[14];
                                                                                                        if (!o.lIlIIlIllIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block257;
                                                                                                        int[] nArray2 = new int[lIIIllllIIlll[1]];
                                                                                                        nArray2[o.lIIIllllIIlll[0]] = lIIIllllIIlll[14];
                                                                                                        if (!o.lIlIIlIllIIlIIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIIllllIIlll[11])) break block258;
                                                                                                    }
                                                                                                    int[] nArray = new int[lIIIllllIIlll[1]];
                                                                                                    nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[15];
                                                                                                    if (!o.lIlIIlIllIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block259;
                                                                                                    int[] nArray3 = new int[lIIIllllIIlll[1]];
                                                                                                    nArray3[o.lIIIllllIIlll[0]] = lIIIllllIIlll[15];
                                                                                                    if (!o.lIlIIlIllIIlIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIllllIIlll[11])) break block258;
                                                                                                }
                                                                                                int[] nArray = new int[lIIIllllIIlll[1]];
                                                                                                nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[16];
                                                                                                if (!o.lIlIIlIllIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block260;
                                                                                                int[] nArray4 = new int[lIIIllllIIlll[1]];
                                                                                                nArray4[o.lIIIllllIIlll[0]] = lIIIllllIIlll[16];
                                                                                                if (!o.lIlIIlIllIIIllI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIllllIIlll[11])) break block260;
                                                                                            }
                                                                                            o.W();
                                                                                            System.out.println(lIIIllllIIlII[lIIIllllIIlll[17]]);
                                                                                            by = lIIIllllIIlll[1];
                                                                                            return;
                                                                                        }
                                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[18];
                                                                                        if (!o.lIlIIlIllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block261;
                                                                                        String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                                        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[19]];
                                                                                        if (!o.lIlIIlIllIIlIIl(Inventory.getCount((String[])stringArray), lIIIllllIIlll[1])) break block262;
                                                                                    }
                                                                                    int[] nArray = new int[lIIIllllIIlll[1]];
                                                                                    nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[20];
                                                                                    if (!o.lIlIIlIllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block263;
                                                                                    String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                                    stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[21]];
                                                                                    if (!o.lIlIIlIllIIlIIl(Inventory.getCount((String[])stringArray), lIIIllllIIlll[1])) break block262;
                                                                                }
                                                                                if (!(o.lIlIIlIllIIIlll(Bank.contains((int[])f.aT) ? 1 : 0) && !o.lIlIIlIllIIlIIl(Inventory.getCount((int[])f.aT), lIIIllllIIlll[1]) || o.lIlIIlIllIIIlll(Bank.contains((int[])f.aS) ? 1 : 0) && !o.lIlIIlIllIIlIIl(Inventory.getCount((int[])f.aS), lIIIllllIIlll[1])) && (!o.lIlIIlIllIIIlll(Bank.contains((int[])f.ba) ? 1 : 0) || !o.lIlIIlIllIIIllI(Inventory.getCount((int[])f.ba), lIIIllllIIlll[1]))) break block264;
                                                                            }
                                                                            o.W();
                                                                            System.out.println(lIIIllllIIlII[lIIIllllIIlll[22]]);
                                                                            by = lIIIllllIIlll[1];
                                                                            return;
                                                                        }
                                                                        String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[23]];
                                                                        if (o.lIlIIlIllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            a.a(lIIIllllIIlll[18], lIIIllllIIlll[1]);
                                                                        }
                                                                        if (o.lIlIIlIllIIIlll(Inventory.contains((int[])f.aT) ? 1 : 0)) {
                                                                            a.a(f.aT, lIIIllllIIlll[1]);
                                                                        }
                                                                        if (o.lIlIIlIllIIIlll(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                                                                            a.a(lIIIllllIIlll[24], lIIIllllIIlll[1]);
                                                                        }
                                                                        if (o.lIlIIlIllIIIlll(Inventory.contains((int[])f.ba) ? 1 : 0)) {
                                                                            a.a(f.ba, lIIIllllIIlll[6]);
                                                                        }
                                                                        String[] stringArray3 = new String[lIIIllllIIlll[1]];
                                                                        stringArray3[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[4]];
                                                                        if (o.lIlIIlIllIIIlll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                                                            a.a(lIIIllllIIlll[20], lIIIllllIIlll[25]);
                                                                        }
                                                                    }
                                                                    if (o.lIlIIlIllIIIlIl(o.aJ() ? 1 : 0)) {
                                                                        if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(de), lIIIllllIIlll[7])) {
                                                                            if (o.lIlIIlIllIIIlIl(Bank.isOpen() ? 1 : 0)) {
                                                                                Bank.close();
                                                                                Time.sleepTicks((int)lIIIllllIIlll[5]);

                                                                            }
                                                                            if (o.lIlIIlIllIIIlll(Bank.isOpen() ? 1 : 0)) {
                                                                                if (o.lIlIIlIllIIIllI(bY, lIIIllllIIlll[1])) {
                                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((int[])f.ba) ? 1 : 0) && o.lIlIIlIllIIIllI(Movement.getRunEnergy(), lIIIllllIIlll[2])) {
                                                                                        Inventory.getFirst((int[])f.ba).interact(lIIIllllIIlII[lIIIllllIIlll[26]]);
                                                                                        Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                    }
                                                                                    e.w();
                                                                                    bY += lIIIllllIIlll[1];
                                                                                }
                                                                                AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[27]];
                                                                                Movement.walkTo((WorldPoint)de);

                                                                                Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                            }
                                                                        }
                                                                        if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(de), lIIIllllIIlll[7])) {
                                                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[28]];
                                                                            g.a(dS, dP);
                                                                        }
                                                                    }
                                                                }
                                                                if (o.lIlIIlIllIIllIl(e.j(lIIIllllIIlll[10]), lIIIllllIIlll[1])) {
                                                                    if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dh), lIIIllllIIlll[5])) {
                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[25]];
                                                                        Movement.walkTo((WorldPoint)dh);

                                                                    }
                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dh), lIIIllllIIlll[5])) {
                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[29]];
                                                                        g.a(dR, dP);
                                                                    }
                                                                }
                                                                if (o.lIlIIlIllIIllIl(e.j(lIIIllllIIlll[10]), lIIIllllIIlll[3])) {
                                                                    if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIllllIIlll[6])) {
                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[30]];
                                                                        Movement.walkTo((WorldPoint)dj);

                                                                        Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                    }
                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIllllIIlll[6])) {
                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[31];
                                                                        var6 = TileObjects.getNearest((int[])nArray);
                                                                        String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[32]];
                                                                        if (o.lIlIIlIllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[33]];
                                                                            if (o.lIlIIlIllIIlIlI(var6)) {
                                                                                var6.interact(lIIIllllIIlII[lIIIllllIIlll[34]]);
                                                                                Time.sleepTicks((int)lIIIllllIIlll[3]);

                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIllllIIlll[19])) {
                                                                    String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                    stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[35]];
                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0) && o.lIlIIlIllIIllIl(Players.getLocal().getAnimation(), lIIIllllIIlll[36]) && o.lIlIIlIllIIlllI(e.j(lIIIllllIIlll[10]), lIIIllllIIlll[5])) {
                                                                        String[] stringArray4 = new String[lIIIllllIIlll[1]];
                                                                        stringArray4[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[37]];
                                                                        var6 = Inventory.getFirst((String[])stringArray4);
                                                                        if (o.lIlIIlIllIIlIlI(var6)) {
                                                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[38]];
                                                                            var6.interact(lIIIllllIIlII[lIIIllllIIlll[39]]);
                                                                            Time.sleepTicks((int)lIIIllllIIlll[3]);

                                                                        }
                                                                    }
                                                                }
                                                                if (o.lIlIIlIllIIllIl(e.j(lIIIllllIIlll[10]), lIIIllllIIlll[5])) {
                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIllllIIlll[19])) {
                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[40];
                                                                        if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray), lIIIllllIIlll[1])) {
                                                                            int[] nArray5 = new int[lIIIllllIIlll[1]];
                                                                            nArray5[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                            if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray5), lIIIllllIIlll[1])) {
                                                                                AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[42]];
                                                                                if (o.lIlIIlIllIIIlIl(Inventory.contains(item -> item.getName().contains(lIIIllllIIlII[lIIIllllIIlll[304]])) ? 1 : 0) && o.lIlIIlIllIIIlll(Equipment.contains(item -> item.getName().contains(lIIIllllIIlII[lIIIllllIIlll[41]])) ? 1 : 0)) {
                                                                                    Inventory.getFirst(item -> item.getName().contains(lIIIllllIIlII[lIIIllllIIlll[40]])).interact(lIIIllllIIlII[lIIIllllIIlll[43]]);
                                                                                }
                                                                                if (o.lIlIIlIllIIIlIl(Equipment.contains(item -> item.getName().contains(lIIIllllIIlII[lIIIllllIIlll[332]])) ? 1 : 0) && o.lIlIIlIllIIIlll(Players.getLocal().isAnimating() ? 1 : 0)) {
                                                                                    Equipment.getFirst(item -> item.getName().contains(lIIIllllIIlII[lIIIllllIIlll[331]])).interact(lIIIllllIIlII[lIIIllllIIlll[44]]);
                                                                                    Time.sleepTicks((int)lIIIllllIIlll[6]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dk), lIIIllllIIlll[5])) {
                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[40];
                                                                        if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray), lIIIllllIIlll[1])) {
                                                                            int[] nArray6 = new int[lIIIllllIIlll[1]];
                                                                            nArray6[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                            if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray6), lIIIllllIIlll[1]) && o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dl), lIIIllllIIlll[44]) && o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIllllIIlll[19])) {
                                                                                AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[45]];
                                                                                if (o.lIlIIlIllIIIlll(dU.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)dV);

                                                                                }
                                                                                if (o.lIlIIlIllIIIlIl(dU.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(cZ));

                                                                                    Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dk), lIIIllllIIlll[5])) {
                                                                        String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[46]];
                                                                        if (o.lIlIIlIllIIlIlI(TileObjects.getNearest((String[])stringArray))) {
                                                                            int[] nArray = new int[lIIIllllIIlll[1]];
                                                                            nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[40];
                                                                            if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray), lIIIllllIIlll[1])) {
                                                                                int[] nArray7 = new int[lIIIllllIIlll[1]];
                                                                                nArray7[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                                if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray7), lIIIllllIIlll[1])) {
                                                                                    int[] nArray8 = new int[lIIIllllIIlll[1]];
                                                                                    nArray8[o.lIIIllllIIlll[0]] = lIIIllllIIlll[47];
                                                                                    var6 = TileObjects.getNearest((int[])nArray8);
                                                                                    if (o.lIlIIlIllIIlIlI(var6)) {
                                                                                        var6.interact(lIIIllllIIlII[lIIIllllIIlll[48]]);
                                                                                        Time.sleepTicks((int)lIIIllllIIlll[5]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dl), lIIIllllIIlll[3])) {
                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[49];
                                                                        if (o.lIlIIlIllIIlIlI(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray9 = new int[lIIIllllIIlll[1]];
                                                                            nArray9[o.lIIIllllIIlll[0]] = lIIIllllIIlll[40];
                                                                            if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray9), lIIIllllIIlll[1])) {
                                                                                int[] nArray10 = new int[lIIIllllIIlll[1]];
                                                                                nArray10[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                                if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray10), lIIIllllIIlll[1])) {
                                                                                    AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[50]];
                                                                                    Movement.walkTo((WorldPoint)dl);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dl), lIIIllllIIlll[5])) {
                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[49];
                                                                        if (o.lIlIIlIllIIlIlI(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray11 = new int[lIIIllllIIlll[1]];
                                                                            nArray11[o.lIIIllllIIlll[0]] = lIIIllllIIlll[40];
                                                                            if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray11), lIIIllllIIlll[1])) {
                                                                                int[] nArray12 = new int[lIIIllllIIlll[1]];
                                                                                nArray12[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                                if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray12), lIIIllllIIlll[1])) {
                                                                                    AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[51]];
                                                                                    int[] nArray13 = new int[lIIIllllIIlll[1]];
                                                                                    nArray13[o.lIIIllllIIlll[0]] = lIIIllllIIlll[49];
                                                                                    var6 = TileObjects.getNearest((int[])nArray13);
                                                                                    if (o.lIlIIlIllIIlIlI(var6)) {
                                                                                        var6.interact(lIIIllllIIlII[lIIIllllIIlll[52]]);
                                                                                        Time.sleepTicks((int)lIIIllllIIlll[3]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dm), lIIIllllIIlll[3])) {
                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[40];
                                                                        if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray)) && o.lIlIIlIllIIIllI(Players.getLocal().getWorldLocation().getY(), lIIIllllIIlll[53])) {
                                                                            int[] nArray14 = new int[lIIIllllIIlll[1]];
                                                                            nArray14[o.lIIIllllIIlll[0]] = lIIIllllIIlll[40];
                                                                            if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray14))) {
                                                                                int[] nArray15 = new int[lIIIllllIIlll[1]];
                                                                                nArray15[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                                if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray15), lIIIllllIIlll[1])) {
                                                                                    AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[54]];
                                                                                    Movement.walkTo((WorldPoint)dm);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dm), lIIIllllIIlll[3])) {
                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[40];
                                                                        if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray)) && o.lIlIIlIllIIIllI(Players.getLocal().getWorldLocation().getY(), lIIIllllIIlll[53])) {
                                                                            int[] nArray16 = new int[lIIIllllIIlll[1]];
                                                                            nArray16[o.lIIIllllIIlll[0]] = lIIIllllIIlll[40];
                                                                            if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray16))) {
                                                                                int[] nArray17 = new int[lIIIllllIIlll[1]];
                                                                                nArray17[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                                if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray17), lIIIllllIIlll[1])) {
                                                                                    int[] nArray18 = new int[lIIIllllIIlll[1]];
                                                                                    nArray18[o.lIIIllllIIlll[0]] = lIIIllllIIlll[55];
                                                                                    var6 = TileObjects.getNearest((int[])nArray18);
                                                                                    if (o.lIlIIlIllIIlIlI(var6)) {
                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[56]];
                                                                                        int[] nArray19 = new int[lIIIllllIIlll[1]];
                                                                                        nArray19[o.lIIIllllIIlll[0]] = lIIIllllIIlll[40];
                                                                                        var5 = Inventory.getFirst((int[])nArray19);
                                                                                        if (o.lIlIIlIllIIlIlI(var5)) {
                                                                                            var5.useOn((TileObject)var6);
                                                                                            Time.sleep((long)1L);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (o.lIlIIlIllIIlIIl(Players.getLocal().getWorldLocation().getY(), lIIIllllIIlll[53])) {
                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                        if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray), lIIIllllIIlll[1])) {
                                                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[57]];
                                                                            g.a(dQ, dP);
                                                                        }
                                                                    }
                                                                    int[] nArray = new int[lIIIllllIIlll[1]];
                                                                    nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                    if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray)) && o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(do), lIIIllllIIlll[6])) {
                                                                        String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[58]];
                                                                        if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray), lIIIllllIIlll[1])) {
                                                                            String[] stringArray5 = new String[lIIIllllIIlll[1]];
                                                                            stringArray5[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[59]];
                                                                            if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray5), lIIIllllIIlll[1])) {
                                                                                AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[60]];
                                                                                if (o.lIlIIlIllIIIlll(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains(item -> item.getName().contains(lIIIllllIIlII[lIIIllllIIlll[330]])) ? 1 : 0) && o.lIlIIlIllIIIlll(Equipment.contains(item -> item.getName().contains(lIIIllllIIlII[lIIIllllIIlll[329]])) ? 1 : 0)) {
                                                                                        Inventory.getFirst(item -> item.getName().contains(lIIIllllIIlII[lIIIllllIIlll[328]])).interact(lIIIllllIIlII[lIIIllllIIlll[61]]);
                                                                                        Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)de);

                                                                                    Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                }
                                                                                if (o.lIlIIlIllIIIlIl(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)do);

                                                                                    Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray20 = new int[lIIIllllIIlll[1]];
                                                                    nArray20[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                    if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray20)) && o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(do), lIIIllllIIlll[6])) {
                                                                        String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[62]];
                                                                        if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray), lIIIllllIIlll[1])) {
                                                                            String[] stringArray6 = new String[lIIIllllIIlll[1]];
                                                                            stringArray6[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[63]];
                                                                            if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray6), lIIIllllIIlll[1])) {
                                                                                AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[64]];
                                                                                int[] nArray21 = new int[lIIIllllIIlll[1]];
                                                                                nArray21[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                                var6 = Inventory.getFirst((int[])nArray21);
                                                                                if (o.lIlIIlIllIIlIlI(var6)) {
                                                                                    int[] nArray22 = new int[lIIIllllIIlll[1]];
                                                                                    nArray22[o.lIIIllllIIlll[0]] = lIIIllllIIlll[65];
                                                                                    var5 = TileObjects.getNearest((int[])nArray22);
                                                                                    if (o.lIlIIlIllIIlIlI(var5)) {
                                                                                        var6.useOn((TileObject)var5);
                                                                                        Time.sleepUntil(() -> {
                                                                                            boolean bl;
                                                                                            String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                                            stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[327]];
                                                                                            if (o.lIlIIlIllIIlIlI(TileObjects.getNearest((String[])stringArray))) {
                                                                                                bl = lIIIllllIIlll[1];

                                                                                                if (((0x14 ^ 2) & ~(0x14 ^ 2)) != 0) {
                                                                                                    return false;
                                                                                                }
                                                                                            } else {
                                                                                                bl = lIIIllllIIlll[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)lIIIllllIIlll[66]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray23 = new int[lIIIllllIIlll[1]];
                                                                    nArray23[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                    if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray23))) {
                                                                        String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[67]];
                                                                        if (o.lIlIIlIllIIlIlI(TileObjects.getNearest((String[])stringArray))) {
                                                                            String[] stringArray7 = new String[lIIIllllIIlll[1]];
                                                                            stringArray7[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[68]];
                                                                            if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray7), lIIIllllIIlll[1])) {
                                                                                String[] stringArray8 = new String[lIIIllllIIlll[1]];
                                                                                stringArray8[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[69]];
                                                                                if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray8), lIIIllllIIlll[1])) {
                                                                                    AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[2]];
                                                                                    if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIllllIIlll[6])) {
                                                                                        Movement.walkTo((WorldPoint)dp);

                                                                                    }
                                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIllllIIlll[6])) {
                                                                                        int[] nArray24 = new int[lIIIllllIIlll[1]];
                                                                                        nArray24[o.lIIIllllIIlll[0]] = lIIIllllIIlll[70];
                                                                                        var6 = TileObjects.getNearest((int[])nArray24);
                                                                                        if (o.lIlIIlIllIIlIlI(var6)) {
                                                                                            var6.interact(lIIIllllIIlII[lIIIllllIIlll[71]]);
                                                                                            Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                        }
                                                                                        int[] nArray25 = new int[lIIIllllIIlll[1]];
                                                                                        nArray25[o.lIIIllllIIlll[0]] = lIIIllllIIlll[72];
                                                                                        var5 = TileObjects.getNearest((int[])nArray25);
                                                                                        if (o.lIlIIlIllIIlIlI(var5)) {
                                                                                            var5.interact(lIIIllllIIlII[lIIIllllIIlll[73]]);
                                                                                            Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (!o.lIlIIlIllIIllIl(e.j(lIIIllllIIlll[10]), lIIIllllIIlll[6])) break block265;
                                                                co = lIIIllllIIlll[0];
                                                                int[] nArray = new int[lIIIllllIIlll[1]];
                                                                nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray))) {
                                                                    String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                    stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[74]];
                                                                    if (o.lIlIIlIllIIlIlI(TileObjects.getNearest((String[])stringArray))) {
                                                                        String[] stringArray9 = new String[lIIIllllIIlll[1]];
                                                                        stringArray9[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[75]];
                                                                        if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray9), lIIIllllIIlll[1])) {
                                                                            String[] stringArray10 = new String[lIIIllllIIlll[1]];
                                                                            stringArray10[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[76]];
                                                                            if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray10), lIIIllllIIlll[1])) {
                                                                                AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[77]];
                                                                                if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIllllIIlll[6])) {
                                                                                    Movement.walkTo((WorldPoint)dp);

                                                                                }
                                                                                if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIllllIIlll[6])) {
                                                                                    int[] nArray26 = new int[lIIIllllIIlll[1]];
                                                                                    nArray26[o.lIIIllllIIlll[0]] = lIIIllllIIlll[70];
                                                                                    var6 = TileObjects.getNearest((int[])nArray26);
                                                                                    if (o.lIlIIlIllIIlIlI(var6)) {
                                                                                        var6.interact(lIIIllllIIlII[lIIIllllIIlll[78]]);
                                                                                        Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                    }
                                                                                    int[] nArray27 = new int[lIIIllllIIlll[1]];
                                                                                    nArray27[o.lIIIllllIIlll[0]] = lIIIllllIIlll[72];
                                                                                    var5 = TileObjects.getNearest((int[])nArray27);
                                                                                    if (o.lIlIIlIllIIlIlI(var5)) {
                                                                                        var5.interact(lIIIllllIIlII[lIIIllllIIlll[79]]);
                                                                                        Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int[] nArray28 = new int[lIIIllllIIlll[1]];
                                                                nArray28[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                                if (!o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray28))) break block266;
                                                                String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[80]];
                                                                if (!o.lIlIIlIllIIllll(TileObjects.getNearest((String[])stringArray))) break block267;
                                                                int[] nArray29 = new int[lIIIllllIIlll[1]];
                                                                nArray29[o.lIIIllllIIlll[0]] = lIIIllllIIlll[81];
                                                                if (!o.lIlIIlIllIIlIlI(TileObjects.getNearest((int[])nArray29))) break block266;
                                                            }
                                                            String[] stringArray = new String[lIIIllllIIlll[1]];
                                                            stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[82]];
                                                            if (o.lIlIIlIllIIlIll(Inventory.getCount((String[])stringArray))) {
                                                                String[] stringArray11 = new String[lIIIllllIIlll[1]];
                                                                stringArray11[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[83]];
                                                                if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray11), lIIIllllIIlll[1])) {
                                                                    if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dq), lIIIllllIIlll[5])) {
                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[84]];
                                                                        Movement.walkTo((WorldPoint)dq);

                                                                        Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                    }
                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dq), lIIIllllIIlll[5])) {
                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[81];
                                                                        var6 = TileObjects.getNearest((int[])nArray);
                                                                        if (o.lIlIIlIllIIlIlI(var6)) {
                                                                            var6.interact(lIIIllllIIlII[lIIIllllIIlll[85]]);
                                                                            Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                        if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray))) {
                                                            String[] stringArray = new String[lIIIllllIIlll[1]];
                                                            stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[86]];
                                                            if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray), lIIIllllIIlll[1])) {
                                                                String[] stringArray12 = new String[lIIIllllIIlll[1]];
                                                                stringArray12[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[10]];
                                                                if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray12), lIIIllllIIlll[1])) {
                                                                    String[] stringArray13 = new String[lIIIllllIIlll[1]];
                                                                    stringArray13[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[87]];
                                                                    if (o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray13), lIIIllllIIlll[1]) && o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dq), lIIIllllIIlll[6])) {
                                                                        String[] stringArray14 = new String[lIIIllllIIlll[1]];
                                                                        stringArray14[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[88]];
                                                                        if (o.lIlIIlIllIIlIll(Inventory.getCount((String[])stringArray14))) {
                                                                            String[] stringArray15 = new String[lIIIllllIIlll[1]];
                                                                            stringArray15[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[89]];
                                                                            if (o.lIlIIlIllIIlIll(Inventory.getCount((String[])stringArray15))) {
                                                                                AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[90]];
                                                                                if (o.lIlIIlIllIIIlll(Equipment.contains((int[])f.aT) ? 1 : 0) && o.lIlIIlIllIIIlIl(Inventory.contains((int[])f.aT) ? 1 : 0)) {
                                                                                    Inventory.getFirst((int[])f.aT).interact(lIIIllllIIlII[lIIIllllIIlll[91]]);
                                                                                    Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                }
                                                                                if (o.lIlIIlIllIIIlIl(Equipment.contains((int[])f.aT) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)dn);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dn), lIIIllllIIlll[30])) break block268;
                                                        int[] nArray30 = new int[lIIIllllIIlll[1]];
                                                        nArray30[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                        if (!o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray30))) break block268;
                                                        String[] stringArray = new String[lIIIllllIIlll[1]];
                                                        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[92]];
                                                        if (!o.lIlIIlIllIIlIIl(Inventory.getCount((String[])stringArray), lIIIllllIIlll[1])) break block269;
                                                        String[] stringArray16 = new String[lIIIllllIIlll[1]];
                                                        stringArray16[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[93]];
                                                        if (!o.lIlIIlIllIIlIIl(Inventory.getCount((String[])stringArray16), lIIIllllIIlll[1])) break block269;
                                                        String[] stringArray17 = new String[lIIIllllIIlll[1]];
                                                        stringArray17[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[94]];
                                                        if (!o.lIlIIlIllIIIllI(Inventory.getCount((String[])stringArray17), lIIIllllIIlll[1])) break block268;
                                                    }
                                                    String[] stringArray = new String[lIIIllllIIlll[1]];
                                                    stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[95]];
                                                    if (o.lIlIIlIllIIlIll(Inventory.getCount((String[])stringArray))) {
                                                        String[] stringArray18 = new String[lIIIllllIIlll[1]];
                                                        stringArray18[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[96]];
                                                        if (o.lIlIIlIllIIlIll(Inventory.getCount((String[])stringArray18))) {
                                                            if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dn), lIIIllllIIlll[6])) {
                                                                Movement.walkTo((WorldPoint)dn);

                                                            }
                                                            if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dn), lIIIllllIIlll[6])) {
                                                                if (o.lIlIIlIllIIIlll(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[97]];
                                                                    a.a();
                                                                }
                                                                if (o.lIlIIlIllIIIlIl(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[98]];
                                                                    String[] stringArray19 = new String[lIIIllllIIlll[1]];
                                                                    stringArray19[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[99]];
                                                                    Bank.depositAll((String[])stringArray19);
                                                                    if (o.lIlIIlIllIIlIII(Inventory.getAll().size(), lIIIllllIIlll[34])) {
                                                                        Bank.deposit((String)lIIIllllIIlII[lIIIllllIIlll[100]], (int)lIIIllllIIlll[7]);
                                                                    }
                                                                    String[] stringArray20 = new String[lIIIllllIIlll[1]];
                                                                    stringArray20[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[101]];
                                                                    if (o.lIlIIlIllIIIlll(Inventory.contains((String[])stringArray20) ? 1 : 0)) {
                                                                        a.a(lIIIllllIIlll[15], lIIIllllIIlll[11]);
                                                                    }
                                                                    String[] stringArray21 = new String[lIIIllllIIlll[1]];
                                                                    stringArray21[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[102]];
                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                                                                        String[] stringArray22 = new String[lIIIllllIIlll[1]];
                                                                        stringArray22[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[103]];
                                                                        if (o.lIlIIlIllIIIllI(Inventory.getFirst((String[])stringArray22).getQuantity(), lIIIllllIIlll[11])) {
                                                                            String[] stringArray23 = new String[lIIIllllIIlll[1]];
                                                                            stringArray23[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[105]];
                                                                            Bank.withdraw((String)lIIIllllIIlII[lIIIllllIIlll[104]], (int)(lIIIllllIIlll[11] - Inventory.getFirst((String[])stringArray23).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIllllIIlll[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray24 = new String[lIIIllllIIlll[1]];
                                                                    stringArray24[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[106]];
                                                                    if (o.lIlIIlIllIIIlll(Inventory.contains((String[])stringArray24) ? 1 : 0)) {
                                                                        a.a(lIIIllllIIlll[16], lIIIllllIIlll[11]);
                                                                    }
                                                                    String[] stringArray25 = new String[lIIIllllIIlll[1]];
                                                                    stringArray25[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[107]];
                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                                                                        String[] stringArray26 = new String[lIIIllllIIlll[1]];
                                                                        stringArray26[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[108]];
                                                                        if (o.lIlIIlIllIIIllI(Inventory.getFirst((String[])stringArray26).getQuantity(), lIIIllllIIlll[11])) {
                                                                            String[] stringArray27 = new String[lIIIllllIIlll[1]];
                                                                            stringArray27[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[110]];
                                                                            Bank.withdraw((String)lIIIllllIIlII[lIIIllllIIlll[109]], (int)(lIIIllllIIlll[11] - Inventory.getFirst((String[])stringArray27).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIllllIIlll[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray28 = new String[lIIIllllIIlll[1]];
                                                                    stringArray28[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[111]];
                                                                    if (o.lIlIIlIllIIIlll(Inventory.contains((String[])stringArray28) ? 1 : 0)) {
                                                                        a.a(lIIIllllIIlll[14], lIIIllllIIlll[11]);
                                                                    }
                                                                    String[] stringArray29 = new String[lIIIllllIIlll[1]];
                                                                    stringArray29[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[112]];
                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                                                                        String[] stringArray30 = new String[lIIIllllIIlll[1]];
                                                                        stringArray30[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[113]];
                                                                        if (o.lIlIIlIllIIIllI(Inventory.getFirst((String[])stringArray30).getQuantity(), lIIIllllIIlll[11])) {
                                                                            String[] stringArray31 = new String[lIIIllllIIlll[1]];
                                                                            stringArray31[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[115]];
                                                                            Bank.withdraw((String)lIIIllllIIlII[lIIIllllIIlll[114]], (int)(lIIIllllIIlll[11] - Inventory.getFirst((String[])stringArray31).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIIIllllIIlll[9]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray = new int[lIIIllllIIlll[1]];
                                                nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIllllIIlll[1]];
                                                    stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[116]];
                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray32 = new String[lIIIllllIIlll[1]];
                                                        stringArray32[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[117]];
                                                        if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray32).getQuantity(), lIIIllllIIlll[11])) {
                                                            String[] stringArray33 = new String[lIIIllllIIlll[1]];
                                                            stringArray33[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[118]];
                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray33) ? 1 : 0)) {
                                                                String[] stringArray34 = new String[lIIIllllIIlll[1]];
                                                                stringArray34[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[119]];
                                                                if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray34).getQuantity(), lIIIllllIIlll[11])) {
                                                                    String[] stringArray35 = new String[lIIIllllIIlll[1]];
                                                                    stringArray35[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[120]];
                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                                                                        String[] stringArray36 = new String[lIIIllllIIlll[1]];
                                                                        stringArray36[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[121]];
                                                                        if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray36).getQuantity(), lIIIllllIIlll[11])) {
                                                                            String[] stringArray37 = new String[lIIIllllIIlll[1]];
                                                                            stringArray37[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[122]];
                                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                                                                                String[] stringArray38 = new String[lIIIllllIIlll[1]];
                                                                                stringArray38[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[123]];
                                                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray38) ? 1 : 0) && o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(ds), lIIIllllIIlll[1])) {
                                                                                    if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dh), lIIIllllIIlll[6]) && o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIllllIIlll[6])) {
                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[124]];
                                                                                        if (o.lIlIIlIllIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                                                                            Dialog.close();
                                                                                        }
                                                                                        Movement.walkTo((WorldPoint)ds);

                                                                                    }
                                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dh), lIIIllllIIlll[7]) && o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIllllIIlll[6])) {
                                                                                        String[] stringArray39 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray39[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[125]];
                                                                                        var6 = Inventory.getFirst((String[])stringArray39);
                                                                                        String[] stringArray40 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray40[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[126]];
                                                                                        var5 = TileObjects.getNearest((String[])stringArray40);
                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[127]];
                                                                                        if (o.lIlIIlIllIIlIlI(var6) && o.lIlIIlIllIIlIlI(var5)) {
                                                                                            var6.useOn((TileObject)var5);
                                                                                            Time.sleepUntil(() -> {
                                                                                                boolean bl;
                                                                                                if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIllllIIlll[6])) {
                                                                                                    bl = lIIIllllIIlll[1];

                                                                                                    }
                                                                                                } else {
                                                                                                    bl = lIIIllllIIlll[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)lIIIllllIIlll[128]);

                                                                                        }
                                                                                    }
                                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIllllIIlll[6])) {
                                                                                        String[] stringArray41 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray41[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[129]];
                                                                                        var6 = Inventory.getFirst((String[])stringArray41);
                                                                                        int[] nArray31 = new int[lIIIllllIIlll[1]];
                                                                                        nArray31[o.lIIIllllIIlll[0]] = lIIIllllIIlll[130];
                                                                                        var5 = TileObjects.getNearest((int[])nArray31);
                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[131]];
                                                                                        if (o.lIlIIlIllIIlIlI(var6) && o.lIlIIlIllIIlIlI(var5)) {
                                                                                            var6.useOn((TileObject)var5);
                                                                                            Time.sleepTicks((int)lIIIllllIIlll[7]);

                                                                                        }
                                                                                    }
                                                                                    if (o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dr) ? 1 : 0)) {
                                                                                        String[] stringArray42 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray42[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[132]];
                                                                                        var6 = TileObjects.getNearest((String[])stringArray42);
                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[133]];
                                                                                        if (o.lIlIIlIllIIlIlI(var6)) {
                                                                                            var6.interact(lIIIllllIIlII[lIIIllllIIlll[134]]);
                                                                                            Time.sleepTicks((int)lIIIllllIIlll[3]);

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
                                            if (o.lIlIIlIllIIllIl(e.j(lIIIllllIIlll[10]), lIIIllllIIlll[7])) {
                                                int[] nArray = new int[lIIIllllIIlll[1]];
                                                nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIllllIIlll[1]];
                                                    stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[135]];
                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray43 = new String[lIIIllllIIlll[1]];
                                                        stringArray43[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[136]];
                                                        if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray43).getQuantity(), lIIIllllIIlll[11])) {
                                                            String[] stringArray44 = new String[lIIIllllIIlll[1]];
                                                            stringArray44[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[137]];
                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray44) ? 1 : 0)) {
                                                                String[] stringArray45 = new String[lIIIllllIIlll[1]];
                                                                stringArray45[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[138]];
                                                                if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray45).getQuantity(), lIIIllllIIlll[11])) {
                                                                    String[] stringArray46 = new String[lIIIllllIIlll[1]];
                                                                    stringArray46[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[139]];
                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray46) ? 1 : 0)) {
                                                                        String[] stringArray47 = new String[lIIIllllIIlll[1]];
                                                                        stringArray47[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[140]];
                                                                        if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray47).getQuantity(), lIIIllllIIlll[11])) {
                                                                            String[] stringArray48 = new String[lIIIllllIIlll[1]];
                                                                            stringArray48[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[141]];
                                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray48) ? 1 : 0)) {
                                                                                String[] stringArray49 = new String[lIIIllllIIlll[1]];
                                                                                stringArray49[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[142]];
                                                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray49) ? 1 : 0)) {
                                                                                    int[] nArray32 = new int[lIIIllllIIlll[1]];
                                                                                    nArray32[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                                                                                    if (o.lIlIIlIllIIIllI(Inventory.getCount((int[])nArray32), lIIIllllIIlll[1]) && o.lIlIIlIllIIIlll(Players.getLocal().getWorldLocation().equals((Object)dr) ? 1 : 0)) {
                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[144]];
                                                                                        if (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(ds), lIIIllllIIlll[3])) {
                                                                                            Movement.walkTo((WorldPoint)ds);

                                                                                        }
                                                                                        if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(ds), lIIIllllIIlll[3])) {
                                                                                            int[] nArray33 = new int[lIIIllllIIlll[1]];
                                                                                            nArray33[o.lIIIllllIIlll[0]] = lIIIllllIIlll[145];
                                                                                            var6 = TileObjects.getNearest((int[])nArray33);
                                                                                            if (o.lIlIIlIllIIlIlI(var6)) {
                                                                                                var6.interact(lIIIllllIIlII[lIIIllllIIlll[146]]);
                                                                                                Time.sleepTicks((int)lIIIllllIIlll[3]);

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
                                                int[] nArray34 = new int[lIIIllllIIlll[1]];
                                                nArray34[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIllllIIlll[1]];
                                                    stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[147]];
                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray50 = new String[lIIIllllIIlll[1]];
                                                        stringArray50[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[148]];
                                                        if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray50).getQuantity(), lIIIllllIIlll[11])) {
                                                            String[] stringArray51 = new String[lIIIllllIIlll[1]];
                                                            stringArray51[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[149]];
                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray51) ? 1 : 0)) {
                                                                String[] stringArray52 = new String[lIIIllllIIlll[1]];
                                                                stringArray52[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[150]];
                                                                if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray52).getQuantity(), lIIIllllIIlll[11])) {
                                                                    String[] stringArray53 = new String[lIIIllllIIlll[1]];
                                                                    stringArray53[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[151]];
                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray53) ? 1 : 0)) {
                                                                        String[] stringArray54 = new String[lIIIllllIIlll[1]];
                                                                        stringArray54[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[152]];
                                                                        if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray54).getQuantity(), lIIIllllIIlll[11])) {
                                                                            String[] stringArray55 = new String[lIIIllllIIlll[1]];
                                                                            stringArray55[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[153]];
                                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray55) ? 1 : 0)) {
                                                                                String[] stringArray56 = new String[lIIIllllIIlll[1]];
                                                                                stringArray56[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[154]];
                                                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray56) ? 1 : 0)) {
                                                                                    int[] nArray35 = new int[lIIIllllIIlll[1]];
                                                                                    nArray35[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                                                                                    if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray35)) && o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dt), lIIIllllIIlll[3]) && o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(du), lIIIllllIIlll[5])) {
                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[155]];
                                                                                        Movement.walkTo((WorldPoint)dt);

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
                                                int[] nArray36 = new int[lIIIllllIIlll[1]];
                                                nArray36[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIllllIIlll[1]];
                                                    stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[156]];
                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray57 = new String[lIIIllllIIlll[1]];
                                                        stringArray57[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[157]];
                                                        if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray57).getQuantity(), lIIIllllIIlll[11])) {
                                                            String[] stringArray58 = new String[lIIIllllIIlll[1]];
                                                            stringArray58[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[158]];
                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray58) ? 1 : 0)) {
                                                                String[] stringArray59 = new String[lIIIllllIIlll[1]];
                                                                stringArray59[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[159]];
                                                                if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray59).getQuantity(), lIIIllllIIlll[11])) {
                                                                    String[] stringArray60 = new String[lIIIllllIIlll[1]];
                                                                    stringArray60[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[160]];
                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray60) ? 1 : 0)) {
                                                                        String[] stringArray61 = new String[lIIIllllIIlll[1]];
                                                                        stringArray61[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[161]];
                                                                        if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray61).getQuantity(), lIIIllllIIlll[11])) {
                                                                            String[] stringArray62 = new String[lIIIllllIIlll[1]];
                                                                            stringArray62[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[162]];
                                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray62) ? 1 : 0)) {
                                                                                String[] stringArray63 = new String[lIIIllllIIlll[1]];
                                                                                stringArray63[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[163]];
                                                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray63) ? 1 : 0)) {
                                                                                    int[] nArray37 = new int[lIIIllllIIlll[1]];
                                                                                    nArray37[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                                                                                    if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray37)) && o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dt), lIIIllllIIlll[5])) {
                                                                                        int[] nArray38 = new int[lIIIllllIIlll[1]];
                                                                                        nArray38[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                                                                                        var6 = Inventory.getFirst((int[])nArray38);
                                                                                        String[] stringArray64 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray64[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[164]];
                                                                                        var5 = TileObjects.getNearest((String[])stringArray64);
                                                                                        if (o.lIlIIlIllIIlIlI(var6) && o.lIlIIlIllIIlIlI(var5)) {
                                                                                            var6.useOn((TileObject)var5);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)dr), (int)lIIIllllIIlll[165]);

                                                                                        }
                                                                                        while (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(du), lIIIllllIIlll[3])) {
                                                                                            Movement.walkTo((WorldPoint)du);

                                                                                            Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                                                            if ((0x62 ^ 0x66) != 0) continue;
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
                                                int[] nArray39 = new int[lIIIllllIIlll[1]];
                                                nArray39[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIIIllllIIlll[1]];
                                                    stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[166]];
                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray65 = new String[lIIIllllIIlll[1]];
                                                        stringArray65[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[167]];
                                                        if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray65).getQuantity(), lIIIllllIIlll[11])) {
                                                            String[] stringArray66 = new String[lIIIllllIIlll[1]];
                                                            stringArray66[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[168]];
                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray66) ? 1 : 0)) {
                                                                String[] stringArray67 = new String[lIIIllllIIlll[1]];
                                                                stringArray67[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[169]];
                                                                if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray67).getQuantity(), lIIIllllIIlll[11])) {
                                                                    String[] stringArray68 = new String[lIIIllllIIlll[1]];
                                                                    stringArray68[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[170]];
                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray68) ? 1 : 0)) {
                                                                        String[] stringArray69 = new String[lIIIllllIIlll[1]];
                                                                        stringArray69[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[171]];
                                                                        if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray69).getQuantity(), lIIIllllIIlll[11])) {
                                                                            String[] stringArray70 = new String[lIIIllllIIlll[1]];
                                                                            stringArray70[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[172]];
                                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray70) ? 1 : 0)) {
                                                                                String[] stringArray71 = new String[lIIIllllIIlll[1]];
                                                                                stringArray71[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[173]];
                                                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                                                                    int[] nArray40 = new int[lIIIllllIIlll[1]];
                                                                                    nArray40[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                                                                                    if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray40)) && o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(du), lIIIllllIIlll[5])) {
                                                                                        int[] nArray41 = new int[lIIIllllIIlll[1]];
                                                                                        nArray41[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                                                                                        var6 = Inventory.getFirst((int[])nArray41);
                                                                                        String[] stringArray72 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray72[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[174]];
                                                                                        var5 = TileObjects.getNearest((String[])stringArray72);
                                                                                        if (o.lIlIIlIllIIlIlI(var6) && o.lIlIIlIllIIlIlI(var5)) {
                                                                                            var5.interact(lIIIllllIIlII[lIIIllllIIlll[175]]);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)dr), (int)lIIIllllIIlll[165]);

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
                                            if (!o.lIlIIlIllIIllIl(e.j(lIIIllllIIlll[10]), lIIIllllIIlll[11])) break block270;
                                            int[] nArray = new int[lIIIllllIIlll[1]];
                                            nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                String[] stringArray = new String[lIIIllllIIlll[1]];
                                                stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[176]];
                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                    String[] stringArray73 = new String[lIIIllllIIlll[1]];
                                                    stringArray73[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[177]];
                                                    if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray73).getQuantity(), lIIIllllIIlll[11])) {
                                                        String[] stringArray74 = new String[lIIIllllIIlll[1]];
                                                        stringArray74[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[178]];
                                                        if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray74) ? 1 : 0)) {
                                                            String[] stringArray75 = new String[lIIIllllIIlll[1]];
                                                            stringArray75[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[179]];
                                                            if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray75).getQuantity(), lIIIllllIIlll[11])) {
                                                                String[] stringArray76 = new String[lIIIllllIIlll[1]];
                                                                stringArray76[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[180]];
                                                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray76) ? 1 : 0)) {
                                                                    String[] stringArray77 = new String[lIIIllllIIlll[1]];
                                                                    stringArray77[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[181]];
                                                                    if (o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray77).getQuantity(), lIIIllllIIlll[11])) {
                                                                        String[] stringArray78 = new String[lIIIllllIIlll[1]];
                                                                        stringArray78[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[182]];
                                                                        if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray78) ? 1 : 0)) {
                                                                            String[] stringArray79 = new String[lIIIllllIIlll[1]];
                                                                            stringArray79[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[183]];
                                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray79) ? 1 : 0)) {
                                                                                int[] nArray42 = new int[lIIIllllIIlll[1]];
                                                                                nArray42[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                                                                                if (o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray42)) && o.lIlIIlIllIIIlIl(cJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dA), lIIIllllIIlll[1])) {
                                                                                    AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[184]];
                                                                                    Movement.walkTo((WorldPoint)dA);

                                                                                    Time.sleepTicks((int)lIIIllllIIlll[6]);

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
                                            int[] nArray43 = new int[lIIIllllIIlll[1]];
                                            nArray43[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray43) ? 1 : 0)) break block248;
                                            String[] stringArray = new String[lIIIllllIIlll[1]];
                                            stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[185]];
                                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block248;
                                            String[] stringArray80 = new String[lIIIllllIIlll[1]];
                                            stringArray80[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[186]];
                                            if (!o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray80).getQuantity(), lIIIllllIIlll[11])) break block248;
                                            String[] stringArray81 = new String[lIIIllllIIlll[1]];
                                            stringArray81[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[187]];
                                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray81) ? 1 : 0)) break block248;
                                            String[] stringArray82 = new String[lIIIllllIIlll[1]];
                                            stringArray82[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[188]];
                                            if (!o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray82).getQuantity(), lIIIllllIIlll[11])) break block248;
                                            String[] stringArray83 = new String[lIIIllllIIlll[1]];
                                            stringArray83[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[189]];
                                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray83) ? 1 : 0)) break block248;
                                            String[] stringArray84 = new String[lIIIllllIIlll[1]];
                                            stringArray84[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[190]];
                                            if (!o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray84).getQuantity(), lIIIllllIIlll[11])) break block248;
                                            String[] stringArray85 = new String[lIIIllllIIlll[1]];
                                            stringArray85[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[191]];
                                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray85) ? 1 : 0)) break block248;
                                            String[] stringArray86 = new String[lIIIllllIIlll[1]];
                                            stringArray86[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[192]];
                                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray86) ? 1 : 0)) break block248;
                                            int[] nArray44 = new int[lIIIllllIIlll[1]];
                                            nArray44[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                                            if (!o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray44)) || !o.lIlIIlIllIIIlIl(cJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dA), lIIIllllIIlll[3])) break block248;
                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[193]];
                                            do {
                                                block272: {
                                                    block273: {
                                                        block271: {
                                                            String[] stringArray87 = new String[lIIIllllIIlll[1]];
                                                            stringArray87[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[194]];
                                                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray87) ? 1 : 0)) break block271;
                                                            String[] stringArray88 = new String[lIIIllllIIlll[1]];
                                                            stringArray88[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[195]];
                                                            if (!o.lIlIIlIllIIIllI(Inventory.getFirst((String[])stringArray88).getQuantity(), lIIIllllIIlll[11])) break block272;
                                                        }
                                                        String[] stringArray89 = new String[lIIIllllIIlll[1]];
                                                        stringArray89[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[196]];
                                                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray89) ? 1 : 0)) break block273;
                                                        String[] stringArray90 = new String[lIIIllllIIlll[1]];
                                                        stringArray90[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[197]];
                                                        if (!o.lIlIIlIllIIIllI(Inventory.getFirst((String[])stringArray90).getQuantity(), lIIIllllIIlll[11])) break block272;
                                                    }
                                                    String[] stringArray91 = new String[lIIIllllIIlll[1]];
                                                    stringArray91[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[198]];
                                                    if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray91) ? 1 : 0)) break block248;
                                                    String[] stringArray92 = new String[lIIIllllIIlll[1]];
                                                    stringArray92[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[199]];
                                                    if (!o.lIlIIlIllIIlIIl(Inventory.getFirst((String[])stringArray92).getQuantity(), lIIIllllIIlll[11])) break block248;
                                                }
                                                if (!o.lIlIIlIllIIIlll(AccBuilderRat.d ? 1 : 0)) break block248;
                                                int[] nArray45 = new int[lIIIllllIIlll[1]];
                                                nArray45[o.lIIIllllIIlll[0]] = lIIIllllIIlll[200];
                                                var6 = TileObjects.getFirstAt((WorldPoint)cK, (int[])nArray45);
                                                String[] stringArray93 = new String[lIIIllllIIlll[1]];
                                                stringArray93[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[201]];
                                                Inventory.getFirst((String[])stringArray93).useOn((TileObject)var6);
                                                Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                String[] stringArray94 = new String[lIIIllllIIlll[1]];
                                                stringArray94[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)var6);
                                                Time.sleepTicks((int)lIIIllllIIlll[1]);

                                                String[] stringArray95 = new String[lIIIllllIIlll[1]];
                                                stringArray95[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)var6);
                                                Time.sleepTicks((int)lIIIllllIIlll[1]);

                                            } while ((47 + 91 - 68 + 114 ^ 11 + 5 - -89 + 84) != 0);
                                            return;
                                        }
                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block249;
                                        String[] stringArray = new String[lIIIllllIIlll[1]];
                                        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[204]];
                                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block249;
                                        String[] stringArray96 = new String[lIIIllllIIlll[1]];
                                        stringArray96[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[205]];
                                        if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray96).getQuantity(), lIIIllllIIlll[7])) break block249;
                                        String[] stringArray97 = new String[lIIIllllIIlll[1]];
                                        stringArray97[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[206]];
                                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray97) ? 1 : 0)) break block249;
                                        String[] stringArray98 = new String[lIIIllllIIlll[1]];
                                        stringArray98[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[207]];
                                        if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray98).getQuantity(), lIIIllllIIlll[7])) break block249;
                                        String[] stringArray99 = new String[lIIIllllIIlll[1]];
                                        stringArray99[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[208]];
                                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray99) ? 1 : 0)) break block249;
                                        String[] stringArray100 = new String[lIIIllllIIlll[1]];
                                        stringArray100[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[209]];
                                        if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray100).getQuantity(), lIIIllllIIlll[7])) break block249;
                                        String[] stringArray101 = new String[lIIIllllIIlll[1]];
                                        stringArray101[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[210]];
                                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray101) ? 1 : 0)) break block249;
                                        String[] stringArray102 = new String[lIIIllllIIlll[1]];
                                        stringArray102[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[211]];
                                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray102) ? 1 : 0)) break block249;
                                        int[] nArray46 = new int[lIIIllllIIlll[1]];
                                        nArray46[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                                        if (!o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray46)) || !o.lIlIIlIllIIIlIl(cJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dz), lIIIllllIIlll[1])) break block249;
                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[212]];
                                        while (true) {
                                            block275: {
                                                block276: {
                                                    block274: {
                                                        String[] stringArray103 = new String[lIIIllllIIlll[1]];
                                                        stringArray103[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[213]];
                                                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray103) ? 1 : 0)) break block274;
                                                        String[] stringArray104 = new String[lIIIllllIIlll[1]];
                                                        stringArray104[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[214]];
                                                        if (!o.lIlIIlIllIIlllI(Inventory.getFirst((String[])stringArray104).getQuantity(), lIIIllllIIlll[7])) break block275;
                                                    }
                                                    String[] stringArray105 = new String[lIIIllllIIlll[1]];
                                                    stringArray105[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[215]];
                                                    if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray105) ? 1 : 0)) break block276;
                                                    String[] stringArray106 = new String[lIIIllllIIlll[1]];
                                                    stringArray106[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[216]];
                                                    if (!o.lIlIIlIllIIlllI(Inventory.getFirst((String[])stringArray106).getQuantity(), lIIIllllIIlll[7])) break block275;
                                                }
                                                String[] stringArray107 = new String[lIIIllllIIlll[1]];
                                                stringArray107[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[217]];
                                                if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray107) ? 1 : 0)) break block249;
                                                String[] stringArray108 = new String[lIIIllllIIlll[1]];
                                                stringArray108[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[218]];
                                                if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray108).getQuantity(), lIIIllllIIlll[7])) break block249;
                                            }
                                            if (!o.lIlIIlIllIIIlll(AccBuilderRat.d ? 1 : 0)) break block249;
                                            if (o.lIlIIlIllIIIlll(Players.getLocal().getWorldLocation().equals((Object)dz) ? 1 : 0)) {
                                                Movement.walkTo((WorldPoint)dz);

                                                Time.sleepTicks((int)lIIIllllIIlll[5]);

                                            }
                                            if (!o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dz) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[lIIIllllIIlll[1]];
                                            nArray47[o.lIIIllllIIlll[0]] = lIIIllllIIlll[200];
                                            var6 = TileObjects.getFirstAt((WorldPoint)cL, (int[])nArray47);
                                            String[] stringArray109 = new String[lIIIllllIIlll[1]];
                                            stringArray109[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)var6);
                                            Time.sleepTicks((int)lIIIllllIIlll[1]);

                                            String[] stringArray110 = new String[lIIIllllIIlll[1]];
                                            stringArray110[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)var6);
                                            Time.sleepTicks((int)lIIIllllIIlll[1]);

                                            String[] stringArray111 = new String[lIIIllllIIlll[1]];
                                            stringArray111[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)var6);
                                            Time.sleepTicks((int)lIIIllllIIlll[1]);

                                        }
                                        return;
                                    }
                                    int[] nArray = new int[lIIIllllIIlll[1]];
                                    nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                    if (!o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block250;
                                    String[] stringArray = new String[lIIIllllIIlll[1]];
                                    stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[222]];
                                    if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block250;
                                    String[] stringArray112 = new String[lIIIllllIIlll[1]];
                                    stringArray112[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[223]];
                                    if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray112).getQuantity(), lIIIllllIIlll[6])) break block250;
                                    String[] stringArray113 = new String[lIIIllllIIlll[1]];
                                    stringArray113[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[224]];
                                    if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray113) ? 1 : 0)) break block250;
                                    String[] stringArray114 = new String[lIIIllllIIlll[1]];
                                    stringArray114[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[225]];
                                    if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray114).getQuantity(), lIIIllllIIlll[6])) break block250;
                                    String[] stringArray115 = new String[lIIIllllIIlll[1]];
                                    stringArray115[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[226]];
                                    if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray115) ? 1 : 0)) break block250;
                                    String[] stringArray116 = new String[lIIIllllIIlll[1]];
                                    stringArray116[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[227]];
                                    if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray116).getQuantity(), lIIIllllIIlll[6])) break block250;
                                    String[] stringArray117 = new String[lIIIllllIIlll[1]];
                                    stringArray117[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[228]];
                                    if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray117) ? 1 : 0)) break block250;
                                    String[] stringArray118 = new String[lIIIllllIIlll[1]];
                                    stringArray118[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[229]];
                                    if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray118) ? 1 : 0)) break block250;
                                    int[] nArray48 = new int[lIIIllllIIlll[1]];
                                    nArray48[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                                    if (!o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray48)) || !o.lIlIIlIllIIIlIl(cJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block250;
                                    AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[230]];
                                    while (true) {
                                        block278: {
                                            block279: {
                                                block277: {
                                                    String[] stringArray119 = new String[lIIIllllIIlll[1]];
                                                    stringArray119[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[231]];
                                                    if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray119) ? 1 : 0)) break block277;
                                                    String[] stringArray120 = new String[lIIIllllIIlll[1]];
                                                    stringArray120[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[232]];
                                                    if (!o.lIlIIlIllIIlllI(Inventory.getFirst((String[])stringArray120).getQuantity(), lIIIllllIIlll[6])) break block278;
                                                }
                                                String[] stringArray121 = new String[lIIIllllIIlll[1]];
                                                stringArray121[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[233]];
                                                if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray121) ? 1 : 0)) break block279;
                                                String[] stringArray122 = new String[lIIIllllIIlll[1]];
                                                stringArray122[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[234]];
                                                if (!o.lIlIIlIllIIlllI(Inventory.getFirst((String[])stringArray122).getQuantity(), lIIIllllIIlll[6])) break block278;
                                            }
                                            String[] stringArray123 = new String[lIIIllllIIlll[1]];
                                            stringArray123[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[235]];
                                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray123) ? 1 : 0)) break block250;
                                            String[] stringArray124 = new String[lIIIllllIIlll[1]];
                                            stringArray124[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[236]];
                                            if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray124).getQuantity(), lIIIllllIIlll[6])) break block250;
                                        }
                                        if (!o.lIlIIlIllIIIlll(AccBuilderRat.d ? 1 : 0)) break block250;
                                        if (o.lIlIIlIllIIIlll(Players.getLocal().getWorldLocation().equals((Object)dy) ? 1 : 0)) {
                                            Movement.walkTo((WorldPoint)dy);

                                            Time.sleepTicks((int)lIIIllllIIlll[5]);

                                        }
                                        if (!o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dy) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[lIIIllllIIlll[1]];
                                        nArray49[o.lIIIllllIIlll[0]] = lIIIllllIIlll[200];
                                        var6 = TileObjects.getFirstAt((WorldPoint)cM, (int[])nArray49);
                                        String[] stringArray125 = new String[lIIIllllIIlll[1]];
                                        stringArray125[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)var6);
                                        Time.sleepTicks((int)lIIIllllIIlll[1]);

                                        String[] stringArray126 = new String[lIIIllllIIlll[1]];
                                        stringArray126[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)var6);
                                        Time.sleepTicks((int)lIIIllllIIlll[1]);

                                        String[] stringArray127 = new String[lIIIllllIIlll[1]];
                                        stringArray127[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)var6);
                                        Time.sleepTicks((int)lIIIllllIIlll[1]);

                                        if (1 == 3) break;
                                    }
                                    return;
                                }
                                int[] nArray = new int[lIIIllllIIlll[1]];
                                nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                                if (!o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block251;
                                String[] stringArray = new String[lIIIllllIIlll[1]];
                                stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[240]];
                                if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block251;
                                String[] stringArray128 = new String[lIIIllllIIlll[1]];
                                stringArray128[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[241]];
                                if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray128).getQuantity(), lIIIllllIIlll[5])) break block251;
                                String[] stringArray129 = new String[lIIIllllIIlll[1]];
                                stringArray129[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[242]];
                                if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray129) ? 1 : 0)) break block251;
                                String[] stringArray130 = new String[lIIIllllIIlll[1]];
                                stringArray130[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[243]];
                                if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray130).getQuantity(), lIIIllllIIlll[5])) break block251;
                                String[] stringArray131 = new String[lIIIllllIIlll[1]];
                                stringArray131[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[244]];
                                if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray131) ? 1 : 0)) break block251;
                                String[] stringArray132 = new String[lIIIllllIIlll[1]];
                                stringArray132[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[245]];
                                if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray132).getQuantity(), lIIIllllIIlll[5])) break block251;
                                String[] stringArray133 = new String[lIIIllllIIlll[1]];
                                stringArray133[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[246]];
                                if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray133) ? 1 : 0)) break block251;
                                String[] stringArray134 = new String[lIIIllllIIlll[1]];
                                stringArray134[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[247]];
                                if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray134) ? 1 : 0)) break block251;
                                int[] nArray50 = new int[lIIIllllIIlll[1]];
                                nArray50[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                                if (!o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray50)) || !o.lIlIIlIllIIIlIl(cJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block251;
                                AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[248]];
                                while (true) {
                                    block281: {
                                        block282: {
                                            block280: {
                                                String[] stringArray135 = new String[lIIIllllIIlll[1]];
                                                stringArray135[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[249]];
                                                if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray135) ? 1 : 0)) break block280;
                                                String[] stringArray136 = new String[lIIIllllIIlll[1]];
                                                stringArray136[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[250]];
                                                if (!o.lIlIIlIllIIlllI(Inventory.getFirst((String[])stringArray136).getQuantity(), lIIIllllIIlll[5])) break block281;
                                            }
                                            String[] stringArray137 = new String[lIIIllllIIlll[1]];
                                            stringArray137[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[251]];
                                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray137) ? 1 : 0)) break block282;
                                            String[] stringArray138 = new String[lIIIllllIIlll[1]];
                                            stringArray138[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[252]];
                                            if (!o.lIlIIlIllIIlllI(Inventory.getFirst((String[])stringArray138).getQuantity(), lIIIllllIIlll[5])) break block281;
                                        }
                                        String[] stringArray139 = new String[lIIIllllIIlll[1]];
                                        stringArray139[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[8]];
                                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray139) ? 1 : 0)) break block251;
                                        String[] stringArray140 = new String[lIIIllllIIlll[1]];
                                        stringArray140[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[253]];
                                        if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray140).getQuantity(), lIIIllllIIlll[5])) break block251;
                                    }
                                    if (!o.lIlIIlIllIIIlll(AccBuilderRat.d ? 1 : 0)) break block251;
                                    if (o.lIlIIlIllIIIlll(Players.getLocal().getWorldLocation().equals((Object)dx) ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)dx);

                                        Time.sleepTicks((int)lIIIllllIIlll[5]);

                                    }
                                    if (!o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dx) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[lIIIllllIIlll[1]];
                                    nArray51[o.lIIIllllIIlll[0]] = lIIIllllIIlll[200];
                                    var6 = TileObjects.getFirstAt((WorldPoint)cN, (int[])nArray51);
                                    String[] stringArray141 = new String[lIIIllllIIlll[1]];
                                    stringArray141[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);

                                    String[] stringArray142 = new String[lIIIllllIIlll[1]];
                                    stringArray142[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);

                                    String[] stringArray143 = new String[lIIIllllIIlll[1]];
                                    stringArray143[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);

                                    if ((0xAD ^ 0x8F ^ (0x1D ^ 0x3A)) <= 0) break;
                                }
                                return;
                            }
                            int[] nArray = new int[lIIIllllIIlll[1]];
                            nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block252;
                            String[] stringArray = new String[lIIIllllIIlll[1]];
                            stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[257]];
                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block252;
                            String[] stringArray144 = new String[lIIIllllIIlll[1]];
                            stringArray144[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[258]];
                            if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray144).getQuantity(), lIIIllllIIlll[3])) break block252;
                            String[] stringArray145 = new String[lIIIllllIIlll[1]];
                            stringArray145[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[259]];
                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray145) ? 1 : 0)) break block252;
                            String[] stringArray146 = new String[lIIIllllIIlll[1]];
                            stringArray146[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[260]];
                            if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray146).getQuantity(), lIIIllllIIlll[3])) break block252;
                            String[] stringArray147 = new String[lIIIllllIIlll[1]];
                            stringArray147[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[261]];
                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray147) ? 1 : 0)) break block252;
                            String[] stringArray148 = new String[lIIIllllIIlll[1]];
                            stringArray148[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[262]];
                            if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray148).getQuantity(), lIIIllllIIlll[3])) break block252;
                            String[] stringArray149 = new String[lIIIllllIIlll[1]];
                            stringArray149[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[263]];
                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray149) ? 1 : 0)) break block252;
                            String[] stringArray150 = new String[lIIIllllIIlll[1]];
                            stringArray150[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[264]];
                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray150) ? 1 : 0)) break block252;
                            int[] nArray52 = new int[lIIIllllIIlll[1]];
                            nArray52[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                            if (!o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray52)) || !o.lIlIIlIllIIIlIl(cJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block252;
                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[265]];
                            while (true) {
                                block284: {
                                    block285: {
                                        block283: {
                                            String[] stringArray151 = new String[lIIIllllIIlll[1]];
                                            stringArray151[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[266]];
                                            if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray151) ? 1 : 0)) break block283;
                                            String[] stringArray152 = new String[lIIIllllIIlll[1]];
                                            stringArray152[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[267]];
                                            if (!o.lIlIIlIllIIlllI(Inventory.getFirst((String[])stringArray152).getQuantity(), lIIIllllIIlll[3])) break block284;
                                        }
                                        String[] stringArray153 = new String[lIIIllllIIlll[1]];
                                        stringArray153[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[268]];
                                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray153) ? 1 : 0)) break block285;
                                        String[] stringArray154 = new String[lIIIllllIIlll[1]];
                                        stringArray154[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[269]];
                                        if (!o.lIlIIlIllIIlllI(Inventory.getFirst((String[])stringArray154).getQuantity(), lIIIllllIIlll[3])) break block284;
                                    }
                                    String[] stringArray155 = new String[lIIIllllIIlll[1]];
                                    stringArray155[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[270]];
                                    if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray155) ? 1 : 0)) break block252;
                                    String[] stringArray156 = new String[lIIIllllIIlll[1]];
                                    stringArray156[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[271]];
                                    if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray156).getQuantity(), lIIIllllIIlll[3])) break block252;
                                }
                                if (!o.lIlIIlIllIIIlll(AccBuilderRat.d ? 1 : 0)) break block252;
                                if (o.lIlIIlIllIIIlll(Players.getLocal().getWorldLocation().equals((Object)dw) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)dw);

                                    Time.sleepTicks((int)lIIIllllIIlll[5]);

                                }
                                if (!o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dw) ? 1 : 0)) continue;
                                int[] nArray53 = new int[lIIIllllIIlll[1]];
                                nArray53[o.lIIIllllIIlll[0]] = lIIIllllIIlll[200];
                                var6 = TileObjects.getFirstAt((WorldPoint)cO, (int[])nArray53);
                                String[] stringArray157 = new String[lIIIllllIIlll[1]];
                                stringArray157[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[272]];
                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray157) ? 1 : 0)) {
                                    String[] stringArray158 = new String[lIIIllllIIlll[1]];
                                    stringArray158[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[273]];
                                    Inventory.getFirst((String[])stringArray158).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);

                                }
                                String[] stringArray159 = new String[lIIIllllIIlll[1]];
                                stringArray159[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[274]];
                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[lIIIllllIIlll[1]];
                                    stringArray160[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);

                                }
                                String[] stringArray161 = new String[lIIIllllIIlll[1]];
                                stringArray161[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[276]];
                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[lIIIllllIIlll[1]];
                                    stringArray162[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);

                                }

                                if (-(0x17 ^ 0x5A ^ (0xFE ^ 0xB7)) >= 0) break;
                            }
                            return;
                        }
                        int[] nArray = new int[lIIIllllIIlll[1]];
                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[41];
                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block253;
                        String[] stringArray = new String[lIIIllllIIlll[1]];
                        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[278]];
                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block253;
                        String[] stringArray163 = new String[lIIIllllIIlll[1]];
                        stringArray163[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[279]];
                        if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray163).getQuantity(), lIIIllllIIlll[1])) break block253;
                        String[] stringArray164 = new String[lIIIllllIIlll[1]];
                        stringArray164[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[280]];
                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray164) ? 1 : 0)) break block253;
                        String[] stringArray165 = new String[lIIIllllIIlll[1]];
                        stringArray165[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[281]];
                        if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray165).getQuantity(), lIIIllllIIlll[1])) break block253;
                        String[] stringArray166 = new String[lIIIllllIIlll[1]];
                        stringArray166[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[282]];
                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray166) ? 1 : 0)) break block253;
                        String[] stringArray167 = new String[lIIIllllIIlll[1]];
                        stringArray167[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[283]];
                        if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray167).getQuantity(), lIIIllllIIlll[1])) break block253;
                        String[] stringArray168 = new String[lIIIllllIIlll[1]];
                        stringArray168[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[284]];
                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray168) ? 1 : 0)) break block253;
                        String[] stringArray169 = new String[lIIIllllIIlll[1]];
                        stringArray169[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[285]];
                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray169) ? 1 : 0)) break block253;
                        int[] nArray54 = new int[lIIIllllIIlll[1]];
                        nArray54[o.lIIIllllIIlll[0]] = lIIIllllIIlll[143];
                        if (!o.lIlIIlIllIIlIll(Inventory.getCount((int[])nArray54)) || !o.lIlIIlIllIIIlIl(cJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block253;
                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[286]];
                        while (true) {
                            block287: {
                                block288: {
                                    block286: {
                                        String[] stringArray170 = new String[lIIIllllIIlll[1]];
                                        stringArray170[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[287]];
                                        if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray170) ? 1 : 0)) break block286;
                                        String[] stringArray171 = new String[lIIIllllIIlll[1]];
                                        stringArray171[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[288]];
                                        if (!o.lIlIIlIllIIlllI(Inventory.getFirst((String[])stringArray171).getQuantity(), lIIIllllIIlll[1])) break block287;
                                    }
                                    String[] stringArray172 = new String[lIIIllllIIlll[1]];
                                    stringArray172[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[289]];
                                    if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray172) ? 1 : 0)) break block288;
                                    String[] stringArray173 = new String[lIIIllllIIlll[1]];
                                    stringArray173[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[290]];
                                    if (!o.lIlIIlIllIIlllI(Inventory.getFirst((String[])stringArray173).getQuantity(), lIIIllllIIlll[1])) break block287;
                                }
                                String[] stringArray174 = new String[lIIIllllIIlll[1]];
                                stringArray174[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[291]];
                                if (!o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray174) ? 1 : 0)) break block253;
                                String[] stringArray175 = new String[lIIIllllIIlll[1]];
                                stringArray175[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[292]];
                                if (!o.lIlIIlIllIIllIl(Inventory.getFirst((String[])stringArray175).getQuantity(), lIIIllllIIlll[1])) break block253;
                            }
                            if (!o.lIlIIlIllIIIlll(AccBuilderRat.d ? 1 : 0)) break block253;
                            if (o.lIlIIlIllIIIlll(Players.getLocal().getWorldLocation().equals((Object)dv) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)dv);

                            }
                            if (!o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dv) ? 1 : 0)) continue;
                            int[] nArray55 = new int[lIIIllllIIlll[1]];
                            nArray55[o.lIIIllllIIlll[0]] = lIIIllllIIlll[200];
                            var6 = TileObjects.getFirstAt((WorldPoint)cP, (int[])nArray55);
                            String[] stringArray176 = new String[lIIIllllIIlll[1]];
                            stringArray176[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[293]];
                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray176) ? 1 : 0)) {
                                String[] stringArray177 = new String[lIIIllllIIlll[1]];
                                stringArray177[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[294]];
                                Inventory.getFirst((String[])stringArray177).useOn((TileObject)var6);
                                Time.sleepTicks((int)lIIIllllIIlll[1]);

                            }
                            String[] stringArray178 = new String[lIIIllllIIlll[1]];
                            stringArray178[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[295]];
                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[lIIIllllIIlll[1]];
                                stringArray179[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)var6);
                                Time.sleepTicks((int)lIIIllllIIlll[1]);

                            }
                            String[] stringArray180 = new String[lIIIllllIIlll[1]];
                            stringArray180[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[297]];
                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[lIIIllllIIlll[1]];
                                stringArray181[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)var6);
                                Time.sleepTicks((int)lIIIllllIIlll[1]);

                            }

                        }
                        return;
                    }
                    String[] stringArray = new String[lIIIllllIIlll[1]];
                    stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[299]];
                    if (o.lIlIIlIllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray182 = new String[lIIIllllIIlll[1]];
                        stringArray182[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[300]];
                        if (o.lIlIIlIllIIIlll(Inventory.contains((String[])stringArray182) ? 1 : 0)) {
                            String[] stringArray183 = new String[lIIIllllIIlll[1]];
                            stringArray183[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[301]];
                            if (o.lIlIIlIllIIIlll(Inventory.contains((String[])stringArray183) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[302]];
                                int[] nArray = new int[lIIIllllIIlll[1]];
                                nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[303];
                                var6 = TileObjects.getNearest((int[])nArray);
                                int[] nArray56 = new int[lIIIllllIIlll[1]];
                                nArray56[o.lIIIllllIIlll[0]] = lIIIllllIIlll[304];
                                var5 = Inventory.getFirst((int[])nArray56);
                                if (o.lIlIIlIllIIlIlI(var6) && o.lIlIIlIllIIlIlI(var5)) {
                                    var5.useOn((TileObject)var6);
                                    Time.sleepTicks((int)lIIIllllIIlll[5]);

                                }
                            }
                        }
                    }
                }
                if (o.lIlIIlIllIIllIl(e.j(lIIIllllIIlll[10]), lIIIllllIIlll[13])) {
                    AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[305]];
                    int[] nArray = new int[lIIIllllIIlll[1]];
                    nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[306];
                    var6 = TileObjects.getNearest((int[])nArray);
                    int[] nArray57 = new int[lIIIllllIIlll[1]];
                    nArray57[o.lIIIllllIIlll[0]] = lIIIllllIIlll[307];
                    var5 = Inventory.getFirst((int[])nArray57);
                    if (o.lIlIIlIllIIIllI(co, lIIIllllIIlll[1])) {
                        P.iN += lIIIllllIIlll[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIllllIIlll[1];
                        P.iN = lIIIllllIIlll[0];
                        cp = lIIIllllIIlll[0];
                    }
                    if (o.lIlIIlIllIIlIlI(var6) && o.lIlIIlIllIIlIlI(var5)) {
                        var5.useOn((TileObject)var6);
                        Time.sleepTicks((int)lIIIllllIIlll[7]);

                        g.a(dP);
                    }
                }
                if (!o.lIlIIlIllIIllIl(e.j(lIIIllllIIlll[10]), lIIIllllIIlll[19])) break block254;
                String[] stringArray = new String[lIIIllllIIlll[1]];
                stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[308]];
                if (!o.lIlIIlIllIIllll(TileObjects.getNearest((String[])stringArray))) break block289;
                String[] stringArray184 = new String[lIIIllllIIlll[1]];
                stringArray184[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[309]];
                if (!o.lIlIIlIllIIlIlI(TileObjects.getNearest((String[])stringArray184))) break block254;
            }
            String[] stringArray = new String[lIIIllllIIlll[1]];
            stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[310]];
            if (o.lIlIIlIllIIlIlI(TileObjects.getNearest((String[])stringArray))) {
                AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[311]];
                if (o.lIlIIlIllIIIlll(Equipment.contains((int[])f.aS) ? 1 : 0) && o.lIlIIlIllIIIlIl(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aS).interact(lIIIllllIIlII[lIIIllllIIlll[312]]);
                    Time.sleepTicks((int)lIIIllllIIlll[6]);

                }
                if (o.lIlIIlIllIIIlIl(Equipment.contains((int[])f.aS) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aS).interact(lIIIllllIIlII[lIIIllllIIlll[313]]);
                    Time.sleepTicks((int)lIIIllllIIlll[6]);

                }
            }
        }
    }

    private static boolean lIlIIlIllIIlllI(int n2, int n3) {
        return n2 != n3;
    }
}

