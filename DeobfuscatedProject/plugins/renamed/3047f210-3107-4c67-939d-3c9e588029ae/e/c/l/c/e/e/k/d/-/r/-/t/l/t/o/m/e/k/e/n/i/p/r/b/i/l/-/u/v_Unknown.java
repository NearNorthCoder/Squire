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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.w_Unknown;
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

public class v_Unknown
implements S {
    static /* synthetic */ String eT;
    public static /* synthetic */ int eJ;
    private static final /* synthetic */ WorldPoint ee;
    static /* synthetic */ int eM;
    public static final /* synthetic */ WorldPoint dO;
    static final /* synthetic */ int dU;
    static /* synthetic */ WorldPoint eX;
    private static final /* synthetic */ WorldPoint eC;
    static /* synthetic */ int bS;
    private static final /* synthetic */ WorldPoint eh;
    private static final /* synthetic */ int eH;
    private static final /* synthetic */ WorldPoint eq;
    private static final /* synthetic */ int eE;
    public static final /* synthetic */ WorldPoint dR;
    private static final /* synthetic */ WorldPoint es;
    private static final /* synthetic */ WorldPoint eu;
    static /* synthetic */ WorldArea eW;
    private static final /* synthetic */ WorldPoint ed;
    static /* synthetic */ int eL;
    private static final /* synthetic */ WorldPoint ep;
    public static final /* synthetic */ int[] dI;
    static /* synthetic */ int eQ;
    static final /* synthetic */ int ea;
    public static final /* synthetic */ WorldPoint dP;
    public static final /* synthetic */ WorldPoint dQ;
    static final /* synthetic */ int dS;
    private static final /* synthetic */ WorldPoint ev;
    public static /* synthetic */ int eK;
    static /* synthetic */ String[] eR;
    static final /* synthetic */ int dV;
    private static final /* synthetic */ int eF;
    private static final /* synthetic */ WorldPoint ez;
    public static /* synthetic */ WorldArea eI;
    static final /* synthetic */ int dZ;
    private static final /* synthetic */ WorldPoint ec;
    static final /* synthetic */ int dX;
    static /* synthetic */ boolean cl;
    static /* synthetic */ String eU;
    private static final /* synthetic */ WorldPoint et;
    private static final /* synthetic */ WorldPoint er;
    static /* synthetic */ int ck;
    static /* synthetic */ int eN;
    private static final /* synthetic */ WorldPoint ex;
    public static final /* synthetic */ WorldPoint dM;
    private static final /* synthetic */ int eG;
    public static final /* synthetic */ int[] dJ;
    static /* synthetic */ String eS;
    static final /* synthetic */ int dW;
    private static final /* synthetic */ WorldPoint en;
    public static final /* synthetic */ int[] dK;
    private static final /* synthetic */ WorldPoint ek;
    static /* synthetic */ int eO;
    public static final /* synthetic */ WorldPoint dN;
    static final /* synthetic */ int dY;
    public static final /* synthetic */ WorldArea dL;
    private static final /* synthetic */ WorldPoint ej;
    private static final /* synthetic */ WorldPoint eB;
    private static final /* synthetic */ WorldPoint el;
    public static /* synthetic */ List<d> bu;
    private static /* synthetic */ int[] lIIIIIIIllI;
    static /* synthetic */ WorldArea eY;
    private static final /* synthetic */ WorldPoint ey;
    public static /* synthetic */ boolean bs;
    private static final /* synthetic */ int eD;
    private static /* synthetic */ String[] llllllllIl;
    private static final /* synthetic */ WorldPoint eA;
    static /* synthetic */ WorldPoint eV;
    static final /* synthetic */ WorldPoint[] eb;
    static final /* synthetic */ int dT;
    private static final /* synthetic */ WorldPoint ef;
    private static final /* synthetic */ WorldPoint eg;
    static /* synthetic */ int eP;
    private static final /* synthetic */ WorldPoint ew;
    private static final /* synthetic */ WorldPoint eo;
    private static final /* synthetic */ WorldPoint ei;
    private static final /* synthetic */ WorldPoint em;

    private static boolean llIllIlIlllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllIlIlIlIl(int n2) {
        return n2 != 0;
    }

    private static String llIllIIIlllll(String var16, String var23) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIIIIIIllI[3], var5);
            return new String(var3.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
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
        d var4;
        Object var19;
        block20: {
            block19: {
                int[] nArray = new int[lIIIIIIIllI[1]];
                nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[20];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIIIIIIllI[20], lIIIIIIIllI[44], lIIIIIIIllI[315]);
                    bu.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIIIIIIIllI[1]];
                nArray2[v.lIIIIIIIllI[0]] = lIIIIIIIllI[316];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var19 = new d(lIIIIIIIllI[316], lIIIIIIIllI[7], i.bp);
                    bu.add((d)var19);
                    0;
                }
                int[] nArray3 = new int[lIIIIIIIllI[1]];
                nArray3[v.lIIIIIIIllI[0]] = lIIIIIIIllI[14];
                if (v.llIllIlIlIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIIIIIllI[1]];
                    nArray4[v.lIIIIIIIllI[0]] = lIIIIIIIllI[14];
                    if (v.llIllIlIlIllI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIIIIllI[11])) {
                        var19 = new d(lIIIIIIIllI[14], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                        bu.add((d)var19);
                        0;
                    }
                }
                int[] nArray5 = new int[lIIIIIIIllI[1]];
                nArray5[v.lIIIIIIIllI[0]] = lIIIIIIIllI[15];
                if (v.llIllIlIlIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIIIIIllI[1]];
                    nArray6[v.lIIIIIIIllI[0]] = lIIIIIIIllI[15];
                    if (v.llIllIlIlIllI(Bank.getFirst((int[])nArray6).getQuantity(), lIIIIIIIllI[11])) {
                        var19 = new d(lIIIIIIIllI[15], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                        bu.add((d)var19);
                        0;
                    }
                }
                int[] nArray7 = new int[lIIIIIIIllI[1]];
                nArray7[v.lIIIIIIIllI[0]] = lIIIIIIIllI[16];
                if (v.llIllIlIlIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIIIIIllI[1]];
                    nArray8[v.lIIIIIIIllI[0]] = lIIIIIIIllI[16];
                    if (v.llIllIlIlIllI(Bank.getFirst((int[])nArray8).getQuantity(), lIIIIIIIllI[11])) {
                        var19 = new d(lIIIIIIIllI[16], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                        bu.add((d)var19);
                        0;
                    }
                }
                int[] nArray9 = new int[lIIIIIIIllI[1]];
                nArray9[v.lIIIIIIIllI[0]] = lIIIIIIIllI[14];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    var19 = new d(lIIIIIIIllI[14], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                    bu.add((d)var19);
                    0;
                }
                int[] nArray10 = new int[lIIIIIIIllI[1]];
                nArray10[v.lIIIIIIIllI[0]] = lIIIIIIIllI[15];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    var19 = new d(lIIIIIIIllI[15], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                    bu.add((d)var19);
                    0;
                }
                int[] nArray11 = new int[lIIIIIIIllI[1]];
                nArray11[v.lIIIIIIIllI[0]] = lIIIIIIIllI[16];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    var19 = new d(lIIIIIIIllI[16], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                    bu.add((d)var19);
                    0;
                }
                int[] nArray12 = new int[lIIIIIIIllI[1]];
                nArray12[v.lIIIIIIIllI[0]] = lIIIIIIIllI[14];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    var19 = new d(lIIIIIIIllI[14], lIIIIIIIllI[317], lIIIIIIIllI[19]);
                    bu.add((d)var19);
                    0;
                }
                int[] nArray13 = new int[lIIIIIIIllI[1]];
                nArray13[v.lIIIIIIIllI[0]] = lIIIIIIIllI[318];
                if (v.llIllIlIlIlll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    var19 = new d(lIIIIIIIllI[318], lIIIIIIIllI[7], lIIIIIIIllI[315]);
                    bu.add((d)var19);
                    0;
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
            var19 = new d(lIIIIIIIllI[24], lIIIIIIIllI[19], lIIIIIIIllI[319]);
            bu.add((d)var19);
            0;
        }
        int[] nArray = new int[lIIIIIIIllI[1]];
        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[18];
        if (v.llIllIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var19 = new d(lIIIIIIIllI[18], lIIIIIIIllI[7], lIIIIIIIllI[320]);
            bu.add((d)var19);
            0;
        }
        if (v.llIllIlIlIlll(Bank.contains((Predicate)(var19 = item -> item.getName().toLowerCase().contains(llllllllIl[lIIIIIIIllI[326]]))) ? 1 : 0)) {
            var4 = new d(lIIIIIIIllI[321], lIIIIIIIllI[25], lIIIIIIIllI[322]);
            bu.add(var4);
            0;
        }
        int[] nArray17 = new int[lIIIIIIIllI[1]];
        nArray17[v.lIIIIIIIllI[0]] = lIIIIIIIllI[323];
        if (v.llIllIlIlIlll(Bank.contains((int[])nArray17) ? 1 : 0)) {
            var4 = new d(lIIIIIIIllI[323], lIIIIIIIllI[58], lIIIIIIIllI[324]);
            bu.add(var4);
            0;
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
            0;
            if (3 == 3) return n2 != 0;
            return false;
        }
        n2 = lIIIIIIIllI[0];
        return n2 != 0;
    }

    private static String llIllIIlIIlII(String var18, String var17) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var11 = var17.toCharArray();
        int var20 = lIIIIIIIllI[0];
        char[] var8 = var18.toCharArray();
        int var14 = var8.length;
        int var12 = lIIIIIIIllI[0];
        while (v.llIllIlIlIllI(var12, var14)) {
            char var6 = var8[var12];
            var2.append((char)(var6 ^ var11[var20 % var11.length]));
            0;
            ++var20;
            ++var12;
            0;
            if ((0x26 ^ 0x18 ^ (0xA9 ^ 0x93)) >= 3) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static void llIllIlIlIlII() {
        lIIIIIIIllI = new int[414];
        v.lIIIIIIIllI[0] = (0x12 ^ 0x2B) & ~(0x91 ^ 0xA8);
        v.lIIIIIIIllI[1] = 1;
        v.lIIIIIIIllI[2] = 0x3E ^ 0xC;
        v.lIIIIIIIllI[3] = 2;
        v.lIIIIIIIllI[4] = 0xB9 ^ 0xB7;
        v.lIIIIIIIllI[5] = 3;
        v.lIIIIIIIllI[6] = 0x4E ^ 0x2F ^ (0x44 ^ 0x21);
        v.lIIIIIIIllI[7] = 0xBE ^ 0xBB;
        v.lIIIIIIIllI[8] = 155 + 10 - -42 + 19;
        v.lIIIIIIIllI[9] = 0xAE ^ 0xA9;
        v.lIIIIIIIllI[10] = 0xEF ^ 0x8E ^ (0x50 ^ 0x70);
        v.lIIIIIIIllI[11] = 0x98 ^ 0x9E;
        v.lIIIIIIIllI[12] = 0xFFFFDFF8 & 0x338F;
        v.lIIIIIIIllI[13] = 0x36 ^ 0x3E;
        v.lIIIIIIIllI[14] = 0xFFFFA3AF & 0x5E7B;
        v.lIIIIIIIllI[15] = -(0xFFFFB5D7 & 0x7BA9) & (0xFFFFFFBD & 0x33EE);
        v.lIIIIIIIllI[16] = 0xFFFF9BED & 0x663F;
        v.lIIIIIIIllI[17] = 66 + 55 - 53 + 121 ^ 133 + 22 - 11 + 36;
        v.lIIIIIIIllI[18] = 0xFFFFDFBE & 0x23FB;
        v.lIIIIIIIllI[19] = 85 + 128 - 97 + 28 ^ 137 + 29 - 33 + 21;
        v.lIIIIIIIllI[20] = -(0xFFFFD07F & 0x7F87) & (0xFFFFF18F & 0x5FF7);
        v.lIIIIIIIllI[21] = 0x11 ^ 0x15 ^ (0x83 ^ 0x8C);
        v.lIIIIIIIllI[22] = 0x4C ^ 0x1A ^ (0x6D ^ 0x37);
        v.lIIIIIIIllI[23] = 0xBA ^ 0xB7;
        v.lIIIIIIIllI[24] = -(0xFFFFFD6F & 0x2698) & (0xFFFFFDFF & 0x2FFF);
        v.lIIIIIIIllI[25] = 0x25 ^ 0x37;
        v.lIIIIIIIllI[26] = 0xBD ^ 0xB2;
        v.lIIIIIIIllI[27] = 0x86 ^ 0x9C ^ (0xD ^ 7);
        v.lIIIIIIIllI[28] = 0xA2 ^ 0xB3;
        v.lIIIIIIIllI[29] = 34 + 8 - -13 + 72 ^ (0xD3 ^ 0xBF);
        v.lIIIIIIIllI[30] = 0xD7 ^ 0xC3;
        v.lIIIIIIIllI[31] = -(0xFFFFF973 & 0x5E9D) & (0xFFFFFFDD & 0x5FF7);
        v.lIIIIIIIllI[32] = 0x69 ^ 0x5E ^ (0x82 ^ 0xA0);
        v.lIIIIIIIllI[33] = 0xA ^ 0x2F ^ (0x93 ^ 0xA0);
        v.lIIIIIIIllI[34] = 2 + 92 - 68 + 118 ^ 131 + 120 - 126 + 10;
        v.lIIIIIIIllI[35] = 0xCD ^ 0xA5 ^ (0xDE ^ 0xAE);
        v.lIIIIIIIllI[36] = -1;
        v.lIIIIIIIllI[37] = 0x44 ^ 0x5D;
        v.lIIIIIIIllI[38] = 0xA7 ^ 0xBD;
        v.lIIIIIIIllI[39] = 0x8F ^ 0x94;
        v.lIIIIIIIllI[40] = -(0xFFFFBFB3 & 0x4EDD) & (0xFFFF8FF5 & 0x7FBF);
        v.lIIIIIIIllI[41] = 0xFFFFBFEF & 0x4136;
        v.lIIIIIIIllI[42] = 0x64 ^ 0x3A ^ (0x15 ^ 0x57);
        v.lIIIIIIIllI[43] = 123 + 38 - 63 + 64 ^ 113 + 137 - 234 + 175;
        v.lIIIIIIIllI[44] = 0x7D ^ 0x63;
        v.lIIIIIIIllI[45] = 8 + 119 - 52 + 93 ^ 162 + 56 - 163 + 128;
        v.lIIIIIIIllI[46] = 0x67 ^ 0x47;
        v.lIIIIIIIllI[47] = 0xFFFFFFAF & 0x14D2;
        v.lIIIIIIIllI[48] = 0x73 ^ 0x52;
        v.lIIIIIIIllI[49] = 0xFFFFE7CE & 0x1FF7;
        v.lIIIIIIIllI[50] = 0x98 ^ 0xA7 ^ (0x17 ^ 0xA);
        v.lIIIIIIIllI[51] = 129 + 78 - 191 + 170 ^ 147 + 106 - 242 + 142;
        v.lIIIIIIIllI[52] = 0x31 ^ 0x15;
        v.lIIIIIIIllI[53] = 0xFFFFA5FB & 0x7F6C;
        v.lIIIIIIIllI[54] = 99 + 119 - 116 + 75 ^ 112 + 3 - 18 + 51;
        v.lIIIIIIIllI[55] = -(0xFFFFE0FF & 0x5F29) & (0xFFFFD7EF & 0x6FFF);
        v.lIIIIIIIllI[56] = 130 + 97 - 130 + 61 ^ 132 + 36 - 3 + 19;
        v.lIIIIIIIllI[57] = 14 + 116 - 83 + 92 ^ 132 + 81 - 114 + 73;
        v.lIIIIIIIllI[58] = 145 + 88 - 109 + 56 ^ 75 + 139 - 196 + 138;
        v.lIIIIIIIllI[59] = 0x5D ^ 0x74;
        v.lIIIIIIIllI[60] = 0x45 ^ 0x6F;
        v.lIIIIIIIllI[61] = 118 + 8 - 60 + 67 ^ 131 + 6 - 70 + 107;
        v.lIIIIIIIllI[62] = 0x8D ^ 0xA2 ^ 3;
        v.lIIIIIIIllI[63] = 0xB0 ^ 0x9D;
        v.lIIIIIIIllI[64] = 0xB2 ^ 0x9C;
        v.lIIIIIIIllI[65] = -(0xFFFFEBF3 & 0x343F) & (0xFFFFE7FE & 0x3FFB);
        v.lIIIIIIIllI[66] = 0xFFFFEF9C & 0x357F;
        v.lIIIIIIIllI[67] = 0x3B ^ 0x14;
        v.lIIIIIIIllI[68] = 0xBE ^ 0x8E;
        v.lIIIIIIIllI[69] = 0x9F ^ 0xAE;
        v.lIIIIIIIllI[70] = 0xFFFF97CE & 0x6FFB;
        v.lIIIIIIIllI[71] = 36 + 161 - 62 + 111 ^ 121 + 33 - -36 + 7;
        v.lIIIIIIIllI[72] = 0xFFFFFFCF & 0x7FB;
        v.lIIIIIIIllI[73] = 77 + 135 - 133 + 99 ^ 91 + 115 - 151 + 79;
        v.lIIIIIIIllI[74] = 0xD0 ^ 0x92 ^ (0xFD ^ 0x8A);
        v.lIIIIIIIllI[75] = 124 + 65 - 42 + 5 ^ 120 + 148 - 248 + 154;
        v.lIIIIIIIllI[76] = 0x8F ^ 0xB8;
        v.lIIIIIIIllI[77] = 101 + 102 - 200 + 146 ^ 81 + 159 - 153 + 86;
        v.lIIIIIIIllI[78] = 0x5C ^ 0x65;
        v.lIIIIIIIllI[79] = 0xB2 ^ 0x88;
        v.lIIIIIIIllI[80] = 0x1C ^ 0x62 ^ (0xCA ^ 0x8F);
        v.lIIIIIIIllI[81] = -(0xFFFFFD33 & 0x7AFF) & (0xFFFFFFFB & Short.MAX_VALUE);
        v.lIIIIIIIllI[82] = 0x8A ^ 0xB6;
        v.lIIIIIIIllI[83] = 0x85 ^ 0xB8;
        v.lIIIIIIIllI[84] = 0x71 ^ 0x4F;
        v.lIIIIIIIllI[85] = 0x88 ^ 0xB7;
        v.lIIIIIIIllI[86] = 0x25 ^ 0x32 ^ (0x61 ^ 0x36);
        v.lIIIIIIIllI[87] = 0xC6 ^ 0xB8 ^ (0x41 ^ 0x7D);
        v.lIIIIIIIllI[88] = 22 + 31 - -163 + 3 ^ 39 + 117 - 73 + 69;
        v.lIIIIIIIllI[89] = 61 + 25 - 8 + 54 ^ 11 + 18 - -6 + 157;
        v.lIIIIIIIllI[90] = 0x70 ^ 0x35;
        v.lIIIIIIIllI[91] = 0x74 ^ 0x32;
        v.lIIIIIIIllI[92] = 0xD4 ^ 0x93;
        v.lIIIIIIIllI[93] = 77 + 66 - 72 + 126 ^ 88 + 107 - 102 + 48;
        v.lIIIIIIIllI[94] = 30 + 50 - 61 + 182 ^ 83 + 115 - 167 + 97;
        v.lIIIIIIIllI[95] = 0x43 ^ 9;
        v.lIIIIIIIllI[96] = 0x18 ^ 0x25 ^ (0xEF ^ 0x99);
        v.lIIIIIIIllI[97] = 0x44 ^ 8;
        v.lIIIIIIIllI[98] = 0x65 ^ 0x28;
        v.lIIIIIIIllI[99] = 0x1D ^ 0x53;
        v.lIIIIIIIllI[100] = 173 + 117 - 263 + 174 ^ 107 + 21 - 98 + 104;
        v.lIIIIIIIllI[101] = 0xE3 ^ 0xB3;
        v.lIIIIIIIllI[102] = 0xCA ^ 0x9B;
        v.lIIIIIIIllI[103] = 0xF6 ^ 0xBD ^ (0xA0 ^ 0xB9);
        v.lIIIIIIIllI[104] = 0xD4 ^ 0x87;
        v.lIIIIIIIllI[105] = 0x7F ^ 0x4E ^ (0xD4 ^ 0xB1);
        v.lIIIIIIIllI[106] = 0x19 ^ 0x1D ^ (0x73 ^ 0x22);
        v.lIIIIIIIllI[107] = 0x2B ^ 0x7D;
        v.lIIIIIIIllI[108] = 189 + 214 - 157 + 5 ^ 21 + 129 - 22 + 44;
        v.lIIIIIIIllI[109] = 0xCA ^ 0x92;
        v.lIIIIIIIllI[110] = 0xEA ^ 0xB3;
        v.lIIIIIIIllI[111] = 0xEB ^ 0xB1;
        v.lIIIIIIIllI[112] = 0xF ^ 0x54;
        v.lIIIIIIIllI[113] = 0xC0 ^ 0x9C;
        v.lIIIIIIIllI[114] = 0x17 ^ 0x4A;
        v.lIIIIIIIllI[115] = 0x58 ^ 0x2F ^ (0xA9 ^ 0x80);
        v.lIIIIIIIllI[116] = 151 + 52 - 111 + 67 ^ 58 + 149 - 46 + 31;
        v.lIIIIIIIllI[117] = 0x1C ^ 0x78 ^ (0xF ^ 0xB);
        v.lIIIIIIIllI[118] = 133 + 100 - 121 + 49 ^ 168 + 173 - 185 + 36;
        v.lIIIIIIIllI[119] = 0x1A ^ 0x27 ^ (0x1C ^ 0x43);
        v.lIIIIIIIllI[120] = 0x6D ^ 0x60 ^ (0x5A ^ 0x34);
        v.lIIIIIIIllI[121] = 0x24 ^ 0x40;
        v.lIIIIIIIllI[122] = 0x6C ^ 0x36 ^ (0x64 ^ 0x5B);
        v.lIIIIIIIllI[123] = 243 + 244 - 482 + 244 ^ 129 + 123 - 191 + 98;
        v.lIIIIIIIllI[124] = 35 + 133 - 56 + 50 ^ 158 + 30 - 93 + 102;
        v.lIIIIIIIllI[125] = 0xF1 ^ 0xA4 ^ (0x24 ^ 0x19);
        v.lIIIIIIIllI[126] = 0x6D ^ 4;
        v.lIIIIIIIllI[127] = 0x94 ^ 0xB5 ^ (0x38 ^ 0x73);
        v.lIIIIIIIllI[128] = 0xFFFF9B5C & 0x7FFB;
        v.lIIIIIIIllI[129] = 0x81 ^ 0xC7 ^ (0x78 ^ 0x55);
        v.lIIIIIIIllI[130] = 0xFFFFF7EE & 0xFF5;
        v.lIIIIIIIllI[131] = 0xE7 ^ 0x8B;
        v.lIIIIIIIllI[132] = 0xC3 ^ 0xAE;
        v.lIIIIIIIllI[133] = 0x74 ^ 0x1A;
        v.lIIIIIIIllI[134] = 0x66 ^ 0x2C ^ (0x18 ^ 0x3D);
        v.lIIIIIIIllI[135] = 0x36 ^ 0x32 ^ (0x65 ^ 0x11);
        v.lIIIIIIIllI[136] = 0x10 ^ 0x61;
        v.lIIIIIIIllI[137] = 0xE8 ^ 0x91 ^ (0x47 ^ 0x4C);
        v.lIIIIIIIllI[138] = 0x4E ^ 0x3D;
        v.lIIIIIIIllI[139] = 0x7E ^ 0xA;
        v.lIIIIIIIllI[140] = 96 + 142 - 109 + 71 ^ 165 + 119 - 193 + 98;
        v.lIIIIIIIllI[141] = 0xEA ^ 0x9C;
        v.lIIIIIIIllI[142] = 0x30 ^ 0xB ^ (0x64 ^ 0x28);
        v.lIIIIIIIllI[143] = 0xFFFF8DBA & 0x736F;
        v.lIIIIIIIllI[144] = 0xC4 ^ 0xBC;
        v.lIIIIIIIllI[145] = -(0xFFFF98BB & 0x7775) & (0xFFFFFFFF & 0x17FF);
        v.lIIIIIIIllI[146] = 226 + 169 - 229 + 62 ^ 88 + 146 - 85 + 8;
        v.lIIIIIIIllI[147] = 118 + 147 - 46 + 1 ^ 122 + 161 - 151 + 34;
        v.lIIIIIIIllI[148] = 0x61 ^ 0x2A ^ (0xB4 ^ 0x84);
        v.lIIIIIIIllI[149] = 0xBA ^ 0xC6;
        v.lIIIIIIIllI[150] = 0xEB ^ 0xC7 ^ (0x63 ^ 0x32);
        v.lIIIIIIIllI[151] = 34 + 9 - -74 + 107 ^ 92 + 131 - 178 + 113;
        v.lIIIIIIIllI[152] = (0x2D ^ 0x3B) + (0xE0 ^ 0x8E) - (0x85 ^ 0x99) + (0x4C ^ 0x5B);
        v.lIIIIIIIllI[153] = 78 + 107 - 154 + 97;
        v.lIIIIIIIllI[154] = (0x7D ^ 0x7A) + (7 ^ 0x25) - (0x1D ^ 5) + (0xF0 ^ 0x80);
        v.lIIIIIIIllI[155] = 100 + 93 - 187 + 124;
        v.lIIIIIIIllI[156] = (0x27 ^ 0x2D) + (0x44 ^ 0x5A) - -(0xEC ^ 0xC3) + (0x80 ^ 0xAC);
        v.lIIIIIIIllI[157] = 120 + 74 - 137 + 75;
        v.lIIIIIIIllI[158] = (0x70 ^ 0x31) + (2 & ~2) - (0x60 ^ 0x42) + (0x32 ^ 0x54);
        v.lIIIIIIIllI[159] = (0xAA ^ 0xBE) + (0x4F ^ 0x1C) - (0x3C ^ 0x59) + (119 + 1 - 22 + 34);
        v.lIIIIIIIllI[160] = (0x55 ^ 0x2F) + (0x8C ^ 0x93) - (0xC4 ^ 0xA5) + (0x6A ^ 0x25);
        v.lIIIIIIIllI[161] = 135 + 90 - 219 + 130;
        v.lIIIIIIIllI[162] = 72 + 66 - 90 + 84 + (0x53 ^ 0x22) - (29 + 161 - 24 + 43) + (0xA6 ^ 0xC3);
        v.lIIIIIIIllI[163] = (0x44 ^ 0x7C) + (0xB9 ^ 0xAD) - (0x26 ^ 0x35) + (0x3B ^ 0x6A);
        v.lIIIIIIIllI[164] = (0x77 ^ 0x3D) + (0xE0 ^ 0xA6) - (0x5F ^ 0x27) + (0xC6 ^ 0xB5);
        v.lIIIIIIIllI[165] = -(0xFFFF93BB & 0x6ECF) & (0xFFFFA3BE & Short.MAX_VALUE);
        v.lIIIIIIIllI[166] = 101 + 93 - 129 + 75;
        v.lIIIIIIIllI[167] = 0 + 123 - 115 + 133;
        v.lIIIIIIIllI[168] = 22 + 111 - 58 + 67;
        v.lIIIIIIIllI[169] = 22 + 31 - 19 + 109;
        v.lIIIIIIIllI[170] = ((0xA ^ 0x14) & ~(0x42 ^ 0x5C)) + (0x58 ^ 0x52) - -(0x39 ^ 0x48) + (0x3F ^ 0x2A);
        v.lIIIIIIIllI[171] = 6 + 88 - 41 + 86 + (0x57 ^ 0x51) - 3 + 3;
        v.lIIIIIIIllI[172] = 5 + 143 - 104 + 102;
        v.lIIIIIIIllI[173] = 92 + 18 - 74 + 111;
        v.lIIIIIIIllI[174] = (0x76 ^ 0x65) + (0x47 ^ 0x64) - (0x4D ^ 0x52) + (0x1E ^ 0x63);
        v.lIIIIIIIllI[175] = 66 + 47 - -25 + 11;
        v.lIIIIIIIllI[176] = 30 + 121 - 138 + 137;
        v.lIIIIIIIllI[177] = (0x1A ^ 0x78) + (0x66 ^ 0x7E) - (0xAB ^ 0xB8) + (0x74 ^ 0x44);
        v.lIIIIIIIllI[178] = 100 + 94 - 57 + 15;
        v.lIIIIIIIllI[179] = (0x79 ^ 0x32) + (7 + 84 - 23 + 73) - (13 + 123 - 20 + 50) + (0x25 ^ 0x42);
        v.lIIIIIIIllI[180] = 17 + 56 - 67 + 148;
        v.lIIIIIIIllI[181] = (0xA3 ^ 0xB1) + (0xC ^ 0x7E) - -(0x99 ^ 0x90) + (0x59 ^ 0x57);
        v.lIIIIIIIllI[182] = 7 + 30 - 25 + 144;
        v.lIIIIIIIllI[183] = 24 + 126 - 105 + 112;
        v.lIIIIIIIllI[184] = 156 + 70 - 194 + 126;
        v.lIIIIIIIllI[185] = 43 + 77 - 76 + 115;
        v.lIIIIIIIllI[186] = (0x6C ^ 0x60) + (0xA4 ^ 0x8A) - (0x81 ^ 0xAA) + (99 + 13 - -15 + 18);
        v.lIIIIIIIllI[187] = (0x2B ^ 0x76) + (96 + 2 - -38 + 20) - (145 + 151 - 75 + 18) + (118 + 146 - 239 + 126);
        v.lIIIIIIIllI[188] = 3 + (0xE9 ^ 0x90) - (0x7B ^ 0x1A) + (21 + 31 - -50 + 33);
        v.lIIIIIIIllI[189] = 99 + 7 - 89 + 146;
        v.lIIIIIIIllI[190] = 122 + 128 - 240 + 154;
        v.lIIIIIIIllI[191] = 83 + 74 - 83 + 91;
        v.lIIIIIIIllI[192] = 151 + 23 - 33 + 25;
        v.lIIIIIIIllI[193] = 66 + 12 - 24 + 113;
        v.lIIIIIIIllI[194] = 137 + 63 - 196 + 164;
        v.lIIIIIIIllI[195] = (0x57 ^ 0x4D) + (10 + 78 - -74 + 0) - (129 + 111 - 165 + 58) + (0xE9 ^ 0x9B);
        v.lIIIIIIIllI[196] = 11 + 77 - -2 + 80;
        v.lIIIIIIIllI[197] = (0xE3 ^ 0xA1) + 3 - -(0x81 ^ 0xC2) + (0xE2 ^ 0xC1);
        v.lIIIIIIIllI[198] = (0xDB ^ 0x8D) + (67 + 111 - 84 + 49) - (84 + 8 - -61 + 47) + (30 + 1 - -5 + 107);
        v.lIIIIIIIllI[199] = 121 + 81 - 157 + 128;
        v.lIIIIIIIllI[200] = 0xFFFFAFFF & 0x57D5;
        v.lIIIIIIIllI[201] = 127 + 35 - -10 + 2;
        v.lIIIIIIIllI[202] = 13 + 34 - 33 + 161;
        v.lIIIIIIIllI[203] = 79 + 127 - 151 + 121;
        v.lIIIIIIIllI[204] = (0x6C ^ 0x50) + (0x18 ^ 0x53) - (0x23 ^ 0x34) + (0x5C ^ 0x1D);
        v.lIIIIIIIllI[205] = (0xDA ^ 0xA6) + (97 + 41 - 101 + 117) - (0xBD ^ 0xC1) + (0x59 ^ 0x41);
        v.lIIIIIIIllI[206] = (0xD8 ^ 0x8D) + (0x8E ^ 0x95) - (0x9D ^ 0x8B) + (0x23 ^ 0x7A);
        v.lIIIIIIIllI[207] = (0x23 ^ 0x12) + (77 + 9 - 73 + 127) - (0x5D ^ 0x46) + (0xA2 ^ 0xB0);
        v.lIIIIIIIllI[208] = 78 + 0 - -14 + 89;
        v.lIIIIIIIllI[209] = (0x7B ^ 0x6A) + (0xDE ^ 0xB4) - (0x33 ^ 0xC) + (0x3A ^ 0x40);
        v.lIIIIIIIllI[210] = 168 + 118 - 163 + 60;
        v.lIIIIIIIllI[211] = 0 + 94 - 4 + 94;
        v.lIIIIIIIllI[212] = 102 + 29 - 7 + 22 + (0xE4 ^ 0xBC) - (106 + 178 - 81 + 19) + (158 + 6 - 78 + 87);
        v.lIIIIIIIllI[213] = 40 + 114 - 86 + 59 + (38 + 98 - 101 + 101) - (0x67 ^ 0x34) + (1 ^ 7);
        v.lIIIIIIIllI[214] = 9 + 69 - -81 + 28;
        v.lIIIIIIIllI[215] = (0x99 ^ 0xA2) + (0x5C ^ 0x75) - (0x35 ^ 0xB) + (72 + 110 - 32 + 0);
        v.lIIIIIIIllI[216] = 176 + 35 - 24 + 2;
        v.lIIIIIIIllI[217] = (0xC8 ^ 0x86) + (41 + 72 - 69 + 104) - (0x2C ^ 0x58) + (0xDE ^ 0x8E);
        v.lIIIIIIIllI[218] = (0x2B ^ 0) + (0x9E ^ 0xC0) - (0x68 ^ 0x42) + (0x3B ^ 0x5B);
        v.lIIIIIIIllI[219] = 142 + 150 - 109 + 9;
        v.lIIIIIIIllI[220] = 169 + 83 - 123 + 64;
        v.lIIIIIIIllI[221] = 90 + 92 - 163 + 175;
        v.lIIIIIIIllI[222] = (0x26 ^ 0x1D) + (48 + 28 - -4 + 80) - (0x10 ^ 0x26) + (0x75 ^ 0x6B);
        v.lIIIIIIIllI[223] = (0x9C ^ 0x82) + (65 + 17 - 6 + 104) - (2 ^ 0x67) + (0x38 ^ 0x6F);
        v.lIIIIIIIllI[224] = (0x2B ^ 0x3F) + (12 + 116 - 68 + 77) - (0xE6 ^ 0x9A) + (133 + 29 - 39 + 41);
        v.lIIIIIIIllI[225] = 97 + 37 - -49 + 15;
        v.lIIIIIIIllI[226] = (0x4E ^ 0x6B) + (0xEC ^ 0xA6) - -(0x76 ^ 0x26) + (0x3E ^ 0x36);
        v.lIIIIIIIllI[227] = (0x20 ^ 0x65) + (0xCC ^ 0xB5) - -(0x17 ^ 0x10) + 3;
        v.lIIIIIIIllI[228] = 178 + 190 - 273 + 106;
        v.lIIIIIIIllI[229] = (0xE4 ^ 0xA1) + ((0x4F ^ 0x7F) & ~(0x1C ^ 0x2C)) - 1 + (115 + 93 - 161 + 87);
        v.lIIIIIIIllI[230] = 136 + 196 - 217 + 88;
        v.lIIIIIIIllI[231] = (0x21 ^ 0x5B) + (0x83 ^ 0x94) - (0x69 ^ 0x1C) + (56 + 105 - 19 + 34);
        v.lIIIIIIIllI[232] = 127 + 86 - 144 + 136;
        v.lIIIIIIIllI[233] = 137 + 202 - 185 + 52;
        v.lIIIIIIIllI[234] = (0x5F ^ 0x3A) + (82 + 31 - 104 + 169) - (98 + 52 - 148 + 189) + (0xD3 ^ 0xA4);
        v.lIIIIIIIllI[235] = 161 + 121 - 138 + 64;
        v.lIIIIIIIllI[236] = (0x33 ^ 7) + (132 + 50 - 171 + 144) - (163 + 94 - 61 + 6) + (85 + 189 - 122 + 52);
        v.lIIIIIIIllI[237] = 25 + 99 - 54 + 106 + (99 + 24 - -30 + 56) - (0xFFFFCDBB & 0x336C) + (0x15 ^ 0x6C);
        v.lIIIIIIIllI[238] = (0xF3 ^ 0xBD) + (83 + 51 - 119 + 173) - (47 + 65 - 5 + 30) + (0xA ^ 0x58);
        v.lIIIIIIIllI[239] = (0x10 ^ 0x3B) + (84 + 108 - 134 + 131) - (0x81 ^ 0xAE) + (0x4A ^ 0x51);
        v.lIIIIIIIllI[240] = 120 + 137 - 170 + 126;
        v.lIIIIIIIllI[241] = 13 + 165 - 69 + 105;
        v.lIIIIIIIllI[242] = 204 + 93 - 149 + 67;
        v.lIIIIIIIllI[243] = (0x5C ^ 0x3B) + (0 + 114 - 51 + 101) - (0xC0 ^ 0xB2) + (0x42 ^ 0x7D);
        v.lIIIIIIIllI[244] = 164 + 17 - 30 + 66;
        v.lIIIIIIIllI[245] = 43 + 40 - -104 + 31;
        v.lIIIIIIIllI[246] = 65 + 104 - 68 + 118;
        v.lIIIIIIIllI[247] = 178 + 82 - 128 + 88;
        v.lIIIIIIIllI[248] = (0x20 ^ 0x6D) + (31 + 179 - 82 + 52) - (128 + 157 - 229 + 125) + (108 + 18 - 68 + 87);
        v.lIIIIIIIllI[249] = 216 + 174 - 178 + 9 + (0x1D ^ 0x47) - (20 + 184 - 120 + 161) + (52 + 134 - 131 + 101);
        v.lIIIIIIIllI[250] = 108 + 31 - 32 + 116;
        v.lIIIIIIIllI[251] = (0xE0 ^ 0x8D) + (3 ^ 0x1E) - (0xED ^ 0x8F) + (55 + 36 - 69 + 162);
        v.lIIIIIIIllI[252] = 88 + 180 - 214 + 171;
        v.lIIIIIIIllI[253] = 121 + 85 - 183 + 204;
        v.lIIIIIIIllI[254] = 92 + 179 - 45 + 2;
        v.lIIIIIIIllI[255] = 116 + 207 - 273 + 179;
        v.lIIIIIIIllI[256] = 71 + 153 - 205 + 211;
        v.lIIIIIIIllI[257] = 100 + 95 - 134 + 170;
        v.lIIIIIIIllI[258] = 91 + 21 - 58 + 178;
        v.lIIIIIIIllI[259] = 160 + 59 - 8 + 3 + (0x39 ^ 0x5D) - (91 + 36 - 11 + 98) + (75 + 106 - 172 + 124);
        v.lIIIIIIIllI[260] = (0x1C ^ 0x39) + (108 + 89 - 117 + 57) - -(0xC ^ 0x22) + (5 ^ 0xB);
        v.lIIIIIIIllI[261] = 60 + 65 - -11 + 99;
        v.lIIIIIIIllI[262] = 156 + 224 - 185 + 41;
        v.lIIIIIIIllI[263] = 152 + 60 - 134 + 109 + (0xAC ^ 0xB4) - (0x5E ^ 0x60) + (0x3F ^ 0x67);
        v.lIIIIIIIllI[264] = (0x76 ^ 0x29) + (0x4B ^ 0x69) - (0xE6 ^ 0xBE) + (26 + 51 - -29 + 91);
        v.lIIIIIIIllI[265] = 187 + 175 - 301 + 178;
        v.lIIIIIIIllI[266] = (0xAE ^ 0xC5) + (0xC ^ 0x24) - -(8 ^ 0x12) + (0x6D ^ 0x2E);
        v.lIIIIIIIllI[267] = 55 + 215 - 36 + 7;
        v.lIIIIIIIllI[268] = 228 + 37 - 127 + 104;
        v.lIIIIIIIllI[269] = 70 + 66 - 119 + 148 + (0x7A ^ 0x6D) - (0xC6 ^ 0xBF) + (118 + 43 - 49 + 64);
        v.lIIIIIIIllI[270] = (0xEF ^ 0xAD) + (184 + 201 - 248 + 80) - (57 + 58 - 70 + 170) + (62 + 76 - 113 + 151);
        v.lIIIIIIIllI[271] = (0x32 ^ 0x74) + (87 + 9 - 64 + 103) - (0x70 ^ 0x2C) + (121 + 121 - 169 + 59);
        v.lIIIIIIIllI[272] = 91 + 88 - 43 + 110;
        v.lIIIIIIIllI[273] = 160 + 153 - 284 + 218;
        v.lIIIIIIIllI[274] = 161 + 31 - 92 + 148;
        v.lIIIIIIIllI[275] = 10 + 148 - 47 + 138;
        v.lIIIIIIIllI[276] = 228 + 25 - 208 + 205;
        v.lIIIIIIIllI[277] = 208 + 30 - 40 + 39 + (0x9C ^ 0x91) - (108 + 113 - 159 + 79) + (32 + 113 - 3 + 0);
        v.lIIIIIIIllI[278] = 57 + 144 - 101 + 46 + (127 + 142 - 184 + 71) - (66 + 245 - 181 + 118) + (135 + 125 - 207 + 145);
        v.lIIIIIIIllI[279] = 3 + 247 - 88 + 91;
        v.lIIIIIIIllI[280] = 168 + 201 - 319 + 204;
        v.lIIIIIIIllI[281] = 96 + 152 - 117 + 23 + (0xCA ^ 0x8B) - (78 + 75 - 52 + 60) + (130 + 31 - 82 + 118);
        v.lIIIIIIIllI[282] = 0xFFFFD9EE & 0x2711;
        v.lIIIIIIIllI[283] = -(0xFFFFAED7 & 0x717B) & (0xFFFFBF53 & 0x61FF);
        v.lIIIIIIIllI[284] = -(0xFFFFEE87 & 0x77FD) & (0xFFFFFFA7 & 0x67DE);
        v.lIIIIIIIllI[285] = -(0xFFFFDCCF & 0x3F7D) & (0xFFFFFF7F & 0x1DCF);
        v.lIIIIIIIllI[286] = -(0xFFFF94DF & 0x7BFB) & (0xFFFFD5DE & 0x3BFF);
        v.lIIIIIIIllI[287] = -(0xFFFFBEDD & 0x6FBB) & (0xFFFFAFDF & 0x7FBD);
        v.lIIIIIIIllI[288] = -(0xFFFFFFB2 & 0x7AFF) & (0xFFFFFFB7 & 0x7BFF);
        v.lIIIIIIIllI[289] = 0xFFFF8777 & 0x798F;
        v.lIIIIIIIllI[290] = -(0xFFFFDAFF & 0x7DB5) & (0xFFFFF9FC & 0x5FBF);
        v.lIIIIIIIllI[291] = 0xFFFFB70B & 0x49FD;
        v.lIIIIIIIllI[292] = -(0xFFFFFFFF & 0x72B6) & (0xFFFFFBFF & 0x77BF);
        v.lIIIIIIIllI[293] = -(0xFFFFFF47 & 0x26BD) & (0xFFFFBF6F & 0x679F);
        v.lIIIIIIIllI[294] = 0xFFFFD95E & 0x27AD;
        v.lIIIIIIIllI[295] = 0xFFFF997F & 0x678D;
        v.lIIIIIIIllI[296] = -(0xFFFFD6F9 & 0x7F57) & (0xFFFFDF7F & 0x77DE);
        v.lIIIIIIIllI[297] = -(0xFFFFFFB7 & 0x6C59) & (0xFFFFFD3F & 0x6FDF);
        v.lIIIIIIIllI[298] = 0xFFFF9735 & 0x69DA;
        v.lIIIIIIIllI[299] = 0xFFFFA135 & 0x5FDB;
        v.lIIIIIIIllI[300] = 0xFFFFA15A & 0x5FB7;
        v.lIIIIIIIllI[301] = 0xFFFFC99F & 0x3773;
        v.lIIIIIIIllI[302] = 0xFFFFF1DD & 0xF36;
        v.lIIIIIIIllI[303] = -(0xFFFFF31B & 0x7CE6) & (0xFFFFFFF7 & 0x77DF);
        v.lIIIIIIIllI[304] = -(0xFFFFFB6F & 0x7699) & (0xFFFFFF2F & 0x73FF);
        v.lIIIIIIIllI[305] = 0xFFFF9555 & 0x6BBF;
        v.lIIIIIIIllI[306] = 0xFFFFD7FF & 0x2FDE;
        v.lIIIIIIIllI[307] = 0xFFFFEFEA & 0x113D;
        v.lIIIIIIIllI[308] = 0xFFFFD1DE & 0x2F37;
        v.lIIIIIIIllI[309] = -(0xFFFFF54B & 0x3EFD) & (0xFFFFFD7F & 0x37DF);
        v.lIIIIIIIllI[310] = 0xFFFFE73A & 0x19DD;
        v.lIIIIIIIllI[311] = 0xFFFF81DB & 0x7F3D;
        v.lIIIIIIIllI[312] = -(0xFFFF8C8E & 0x7FF3) & (0xFFFF8DFF & 0x7F9B);
        v.lIIIIIIIllI[313] = 0xFFFFFB9B & 0x57F;
        v.lIIIIIIIllI[314] = 0xFFFFC93E & 0x37DD;
        v.lIIIIIIIllI[315] = -(0xFFFFBD66 & 0x46DF) & (0xFFFFFFFD & 0xFFF);
        v.lIIIIIIIllI[316] = -(0xFFFFFF6F & 0x4E9F) & (0xFFFFFF5F & Short.MAX_VALUE);
        v.lIIIIIIIllI[317] = 0xFFFFABE8 & 0x57FF;
        v.lIIIIIIIllI[318] = -(0xFFFFF66B & 0x7995) & (0xFFFFFF2F & 0x7FDD);
        v.lIIIIIIIllI[319] = 0xFFFFFFF2 & 0x7DD;
        v.lIIIIIIIllI[320] = -(0xFFFFE4CF & 0x1F78) & (0xFFFFBFFF & 0x7EDF);
        v.lIIIIIIIllI[321] = -(0xFFFFE17E & 0x5FB3) & (0xFFFFEFFD & Short.MAX_VALUE);
        v.lIIIIIIIllI[322] = -(0xFFFFBDC8 & 0x7E3F) & (0xFFFFFE7F & 0x7FEF);
        v.lIIIIIIIllI[323] = -(0xFFFFEF7B & 0x709D) & (0xFFFFFF7F & 0x7FDF);
        v.lIIIIIIIllI[324] = 0xFFFFF775 & 0xD9E;
        v.lIIIIIIIllI[325] = 0xFFFFB1FF & 0x4F1D;
        v.lIIIIIIIllI[326] = -(0xFFFFEECA & 0x77F7) & (0xFFFFFFDF & 0x67FF);
        v.lIIIIIIIllI[327] = -(0xFFFFBE03 & 0x79FD) & (0xFFFFFF9F & 0x397F);
        v.lIIIIIIIllI[328] = -(0xFFFFFEFC & 0x55C7) & (0xFFFFF7E7 & 0x5DFB);
        v.lIIIIIIIllI[329] = 0xFFFFD1E3 & 0x2F3D;
        v.lIIIIIIIllI[330] = -(0xFFFFBD66 & 0x7EDB) & (0xFFFFFF7F & 0x3DE3);
        v.lIIIIIIIllI[331] = 0xFFFFC7F3 & 0x392F;
        v.lIIIIIIIllI[332] = -(0xFFFFFA7D & 0x45C6) & (0xFFFFD777 & 0x69EF);
        v.lIIIIIIIllI[333] = 0xFFFFFFFF & 0xF0F;
        v.lIIIIIIIllI[334] = 0xFFFFCF5B & 0x3FB5;
        v.lIIIIIIIllI[335] = -(40 + 70 - 104 + 131) & (0xFFFFBFFB & 0x4F9F);
        v.lIIIIIIIllI[336] = -(58 + 140 - 176 + 171) & (0xFFFFFFDF & 0xFF5);
        v.lIIIIIIIllI[337] = 0xFFFFFFBF & 0xF57;
        v.lIIIIIIIllI[338] = 0xFFFFFF5D & 0xFBB;
        v.lIIIIIIIllI[339] = 0xFFFF8FFB & 0x7F1F;
        v.lIIIIIIIllI[340] = 0xFFFFBD7B & 0x73D7;
        v.lIIIIIIIllI[341] = -(0xFFFFDFAD & 0x6EF3) & (0xFFFFFFFD & 0x7FF7);
        v.lIIIIIIIllI[342] = 0xFFFFBF5F & 0x71F7;
        v.lIIIIIIIllI[343] = -(0xFFFFBF3B & 0x72C5) & (0xFFFFBFFE & 0x7BFB);
        v.lIIIIIIIllI[344] = 0xFFFFADFF & 0x5BFE;
        v.lIIIIIIIllI[345] = -(0xFFFFD1EB & 0x6F3D) & (0xFFFFFB29 & 0x4FFE);
        v.lIIIIIIIllI[346] = 0xFFFFCE2F & 0x3BD2;
        v.lIIIIIIIllI[347] = 0xFFFFAE87 & 0x5B7C;
        v.lIIIIIIIllI[348] = 0xFFFFA9FE & 0x5FFD;
        v.lIIIIIIIllI[349] = -(0xFFFFBBFA & 0x65FF) & (0xFFFFBBFF & 0x6FFF);
        v.lIIIIIIIllI[350] = -(0xFFFFDCDB & 0x7335) & (0xFFFFFEBD & 0x77FF);
        v.lIIIIIIIllI[351] = -(0xFFFFEF39 & 0x51E7) & (0xFFFFFF2D & 0x4BFB);
        v.lIIIIIIIllI[352] = 0xFFFFBEFE & 0x67B7;
        v.lIIIIIIIllI[353] = -(0xFFFFCBF6 & 0x3D4B) & (0xFFFFEFFD & 0x3FFB);
        v.lIIIIIIIllI[354] = 0xFFFFEFFA & 0x36BF;
        v.lIIIIIIIllI[355] = -(0xFFFFBE3F & 0x77D7) & (0xFFFFFFFF & 0x3FDF);
        v.lIIIIIIIllI[356] = 0xFFFF9DFF & 0x6E76;
        v.lIIIIIIIllI[357] = -(0xFFFFF769 & 0x5AB7) & (0xFFFFDFFA & 0x7BFF);
        v.lIIIIIIIllI[358] = 0xFFFFBE73 & 0x4DFC;
        v.lIIIIIIIllI[359] = 0xFFFF8DE9 & 0x7BFF;
        v.lIIIIIIIllI[360] = 0xFFFFACFD & 0x5F6B;
        v.lIIIIIIIllI[361] = 0xFFFFDBFF & 0x2DF1;
        v.lIIIIIIIllI[362] = 0xFFFFAF57 & 0x5CFF;
        v.lIIIIIIIllI[363] = 0xFFFFABFE & 0x5DE7;
        v.lIIIIIIIllI[364] = -(0xFFFFB37D & 0x6FAB) & (0xFFFFEF7B & 0x3FFF);
        v.lIIIIIIIllI[365] = -(0xFFFFD22D & 0x3DDF) & (0xFFFFBDDF & 0x5BFF);
        v.lIIIIIIIllI[366] = 0xFFFF9DFF & 0x6BDF;
        v.lIIIIIIIllI[367] = -(0xFFFFB3EB & 0x5EBF) & (0xFFFFBFFF & 0x5FFF);
        v.lIIIIIIIllI[368] = 0xFFFFDBFE & 0x2DCF;
        v.lIIIIIIIllI[369] = 0xFFFFDDEE & 0x2FB7;
        v.lIIIIIIIllI[370] = 0xFFFFBEFD & 0x4D5F;
        v.lIIIIIIIllI[371] = 0xFFFFBFBE & 0x4DDF;
        v.lIIIIIIIllI[372] = -(0xFFFFF73D & 0x5EE7) & (0xFFFFFFFD & 0x5FFF);
        v.lIIIIIIIllI[373] = -(0xFFFFF7FF & 0x3A11) & (0xFFFFFFFA & 0x3FBD);
        v.lIIIIIIIllI[374] = -(0xFFFFEBAE & 0x567D) & (0xFFFFEBFB & 0x5FFF);
        v.lIIIIIIIllI[375] = 0xFFFFED9F & 0x1FF5;
        v.lIIIIIIIllI[376] = 0xFFFFEFD7 & 0x19F9;
        v.lIIIIIIIllI[377] = -(0xFFFFFAFB & 0x7746) & (0xFFFFFFDF & 0x7FED);
        v.lIIIIIIIllI[378] = -(0xFFFFFBEF & 0x6617) & (0xFFFFEFFF & 0x7F9F);
        v.lIIIIIIIllI[379] = -(0xFFFFF42F & 0x7FD1) & (0xFFFFFFDF & 0x7DF7);
        v.lIIIIIIIllI[380] = -(0xFFFFF49F & 0x1BF2) & (0xFFFFDDF7 & 0x3FFF);
        v.lIIIIIIIllI[381] = -(0xFFFFD11D & 0x7EFF) & (0xFFFFFFFF & 0x5D7F);
        v.lIIIIIIIllI[382] = 0xFFFF8FD7 & 0x7C7C;
        v.lIIIIIIIllI[383] = 0xFFFF8DF5 & 0x7BFE;
        v.lIIIIIIIllI[384] = -(95 + 87 - 161 + 109) & (0xFFFFF5FF & 0x2FDF);
        v.lIIIIIIIllI[385] = 0xFFFFB7EE & 0x6D77;
        v.lIIIIIIIllI[386] = 0xFFFFDFFF & 0x29E7;
        v.lIIIIIIIllI[387] = -(0xFFFFF55F & 0x5AA9) & (0xFFFFFDFD & 0x5FFF);
        v.lIIIIIIIllI[388] = -(0xFFFFF733 & 0x58CF) & (0xFFFFF9FF & 0x5FFF);
        v.lIIIIIIIllI[389] = -(0xFFFFF39F & 0x3EE9) & (0xFFFFFFFF & 0x3FFD);
        v.lIIIIIIIllI[390] = 0xFFFF8DED & 0x7BF7;
        v.lIIIIIIIllI[391] = 0xFFFFF67F & 0x2FF4;
        v.lIIIIIIIllI[392] = 0xFFFF99EE & 0x6FFF;
        v.lIIIIIIIllI[393] = 0xFFFFF6F6 & 0x2F5B;
        v.lIIIIIIIllI[394] = -(0xFFFFF413 & 0x1BED) & (0xFFFFB9FF & 0x5FCF);
        v.lIIIIIIIllI[395] = -(0xFFFFE257 & 0x1FF9) & (0xFFFF9FFF & 0x6FD7);
        v.lIIIIIIIllI[396] = 0xFFFFBE9D & 0x4B7E;
        v.lIIIIIIIllI[397] = 0xFFFFB6EB & 0x6FB4;
        v.lIIIIIIIllI[398] = -(0xFFFFBFD4 & 0x74BF) & (0xFFFFFFBF & 0x3EDB);
        v.lIIIIIIIllI[399] = -(0xFFFFF3FF & 0x5D53) & (0xFFFFF7F7 & Short.MAX_VALUE);
        v.lIIIIIIIllI[400] = 0xFFFFEB97 & 0x1E6B;
        v.lIIIIIIIllI[401] = -(0xFFFFFE31 & 0x9CF) & (0xFFFFFF77 & 0x2DFE);
        v.lIIIIIIIllI[402] = 0xFFFF9DED & 0x633B;
        v.lIIIIIIIllI[403] = -(0xFFFFFB91 & 0x7EEF) & (0xFFFFFFAB & 0x7BFF);
        v.lIIIIIIIllI[404] = -(0xFFFFEDF5 & 0x1EDE) & (0xFFFFBFFF & 0x4DFF);
        v.lIIIIIIIllI[405] = 0xFFFFE3BF & 0x1D6D;
        v.lIIIIIIIllI[406] = -(0xFFFFFD3F & 0x52D2) & (0xFFFFF6FF & 0x7FBF);
        v.lIIIIIIIllI[407] = -(0xFFFFF2D1 & 0xF6F) & (0xFFFFBFFF & 0x4BFF);
        v.lIIIIIIIllI[408] = -(0xFFFFFA4B & 0x77F5) & (0xFFFFFE7F & 0x7FFD);
        v.lIIIIIIIllI[409] = 0xFFFF9DE7 & 0x6BDE;
        v.lIIIIIIIllI[410] = 0xFFFFEC78 & 0x1FFF;
        v.lIIIIIIIllI[411] = 0xFFFF99DF & 0x6FED;
        v.lIIIIIIIllI[412] = -(0xFFFFF47F & 0x3B91) & (0xFFFFBFFE & 0x7D7F);
        v.lIIIIIIIllI[413] = -(0xFFFFFCD7 & 0x77FA) & (0xFFFFF7FF & 0x7DFF);
    }

    private static void llIllIlIlIIll() {
        llllllllIl = new String[lIIIIIIIllI[413]];
        v.llllllllIl[v.lIIIIIIIllI[0]] = v."Buying items";
        v.llllllllIl[v.lIIIIIIIllI[1]] = v."Finished buying items, switching back to questing";
        v.llllllllIl[v.lIIIIIIIllI[3]] = v."Drink";
        v.llllllllIl[v.lIIIIIIIllI[5]] = v."Shark";
        v.llllllllIl[v.lIIIIIIIllI[6]] = v."Shark";
        v.llllllllIl[v.lIIIIIIIllI[7]] = v."Eat";
        v.llllllllIl[v.lIIIIIIIllI[11]] = v."Navigating to bank";
        v.llllllllIl[v.lIIIIIIIllI[9]] = v."Opening bank";
        v.llllllllIl[v.lIIIIIIIllI[13]] = v."Handling banking";
        v.llllllllIl[v.lIIIIIIIllI[17]] = v."We are missing runessupplies, switching to BUYING";
        v.llllllllIl[v.lIIIIIIIllI[19]] = v."Rope";
        v.llllllllIl[v.lIIIIIIIllI[21]] = v."Shark";
        v.llllllllIl[v.lIIIIIIIllI[22]] = v."We are missing supplies, switching to BUYING";
        v.llllllllIl[v.lIIIIIIIllI[23]] = v."Rope";
        v.llllllllIl[v.lIIIIIIIllI[4]] = v."Shark";
        v.llllllllIl[v.lIIIIIIIllI[26]] = v."Drink";
        v.llllllllIl[v.lIIIIIIIllI[27]] = v."Nav to start";
        v.llllllllIl[v.lIIIIIIIllI[28]] = v."Chatting";
        v.llllllllIl[v.lIIIIIIIllI[25]] = v."Nav to boy";
        v.llllllllIl[v.lIIIIIIIllI[29]] = v."Chat boy";
        v.llllllllIl[v.lIIIIIIIllI[30]] = v."Nav to bookcase";
        v.llllllllIl[v.lIIIIIIIllI[32]] = v."Book on baxtorian";
        v.llllllllIl[v.lIIIIIIIllI[33]] = v."Searching bookcase";
        v.llllllllIl[v.lIIIIIIIllI[34]] = v."Search";
        v.llllllllIl[v.lIIIIIIIllI[35]] = v."Book on baxtorian";
        v.llllllllIl[v.lIIIIIIIllI[37]] = v."Book on baxtorian";
        v.llllllllIl[v.lIIIIIIIllI[38]] = v."Reading";
        v.llllllllIl[v.lIIIIIIIllI[39]] = v."Read";
        v.llllllllIl[v.lIIIIIIIllI[42]] = v."Tele to CW";
        v.llllllllIl[v.lIIIIIIIllI[43]] = v."Wear";
        v.llllllllIl[v.lIIIIIIIllI[44]] = v."Castle Wars";
        v.llllllllIl[v.lIIIIIIIllI[45]] = v."Nav to maze ladder";
        v.llllllllIl[v.lIIIIIIIllI[46]] = v."Fountain";
        v.llllllllIl[v.lIIIIIIIllI[48]] = v."Climb-down";
        v.llllllllIl[v.lIIIIIIIllI[50]] = v."nav to box";
        v.llllllllIl[v.lIIIIIIIllI[51]] = v."Searching crate";
        v.llllllllIl[v.lIIIIIIIllI[52]] = v."Search";
        v.llllllllIl[v.lIIIIIIIllI[54]] = v."Nav to cage";
        v.llllllllIl[v.lIIIIIIIllI[56]] = v."Entering cage";
        v.llllllllIl[v.lIIIIIIIllI[57]] = v."Chat npc";
        v.llllllllIl[v.lIIIIIIIllI[58]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[59]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[60]] = v."Nav to tombstone";
        v.llllllllIl[v.lIIIIIIIllI[61]] = v."Wear";
        v.llllllllIl[v.lIIIIIIIllI[62]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[63]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[64]] = v."Entering tomb";
        v.llllllllIl[v.lIIIIIIIllI[67]] = v."Stalagmite";
        v.llllllllIl[v.lIIIIIIIllI[68]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[69]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[2]] = v."Getting ammy";
        v.llllllllIl[v.lIIIIIIIllI[71]] = v."Open";
        v.llllllllIl[v.lIIIIIIIllI[73]] = v."Search";
        v.llllllllIl[v.lIIIIIIIllI[74]] = v."Stalagmite";
        v.llllllllIl[v.lIIIIIIIllI[75]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[76]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[77]] = v."Getting ammy";
        v.llllllllIl[v.lIIIIIIIllI[78]] = v."Open";
        v.llllllllIl[v.lIIIIIIIllI[79]] = v."Search";
        v.llllllllIl[v.lIIIIIIIllI[80]] = v."Stalagmite";
        v.llllllllIl[v.lIIIIIIIllI[82]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[83]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[84]] = v."Getting ashes";
        v.llllllllIl[v.lIIIIIIIllI[85]] = v."Search";
        v.llllllllIl[v.lIIIIIIIllI[86]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[10]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[87]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[88]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[89]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[90]] = v."Nav to bank";
        v.llllllllIl[v.lIIIIIIIllI[91]] = v."Wear";
        v.llllllllIl[v.lIIIIIIIllI[92]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[93]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[94]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[95]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[96]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[97]] = v."Opening bank";
        v.llllllllIl[v.lIIIIIIIllI[98]] = v."Withdrawing runes";
        v.llllllllIl[v.lIIIIIIIllI[99]] = v."Vial";
        v.llllllllIl[v.lIIIIIIIllI[100]] = v."Shark";
        v.llllllllIl[v.lIIIIIIIllI[101]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[102]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[103]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[104]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[105]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[106]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[107]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[108]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[109]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[110]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[111]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[112]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[113]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[114]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[115]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[116]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[117]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[118]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[119]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[120]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[121]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[122]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[123]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[124]] = v."Nav to door entrance";
        v.llllllllIl[v.lIIIIIIIllI[125]] = v."Rope";
        v.llllllllIl[v.lIIIIIIIllI[126]] = v."Rock";
        v.llllllllIl[v.lIIIIIIIllI[127]] = v."Roping rock";
        v.llllllllIl[v.lIIIIIIIllI[129]] = v."Rope";
        v.llllllllIl[v.lIIIIIIIllI[131]] = v."Roping tree";
        v.llllllllIl[v.lIIIIIIIllI[132]] = v."Door";
        v.llllllllIl[v.lIIIIIIIllI[133]] = v."Entering door";
        v.llllllllIl[v.lIIIIIIIllI[134]] = v."Open";
        v.llllllllIl[v.lIIIIIIIllI[135]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[136]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[137]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[138]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[139]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[140]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[141]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[142]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[144]] = v."Nav to key and get";
        v.llllllllIl[v.lIIIIIIIllI[146]] = v."Search";
        v.llllllllIl[v.lIIIIIIIllI[147]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[148]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[149]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[150]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[151]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[152]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[153]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[154]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[155]] = v."Nav to last room";
        v.llllllllIl[v.lIIIIIIIllI[156]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[157]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[158]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[159]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[160]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[161]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[162]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[163]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[164]] = v."Door";
        v.llllllllIl[v.lIIIIIIIllI[166]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[167]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[168]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[169]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[170]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[171]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[172]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[173]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[174]] = v."Door";
        v.llllllllIl[v.lIIIIIIIllI[175]] = v."Open";
        v.llllllllIl[v.lIIIIIIIllI[176]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[177]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[178]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[179]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[180]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[181]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[182]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[183]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[184]] = v."Nav to SE Pillar";
        v.llllllllIl[v.lIIIIIIIllI[185]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[186]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[187]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[188]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[189]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[190]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[191]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[192]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[193]] = v."Using runes";
        v.llllllllIl[v.lIIIIIIIllI[194]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[195]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[196]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[197]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[198]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[199]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[201]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[202]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[203]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[204]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[205]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[206]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[207]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[208]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[209]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[210]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[211]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[212]] = v."Using runes";
        v.llllllllIl[v.lIIIIIIIllI[213]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[214]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[215]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[216]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[217]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[218]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[219]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[220]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[221]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[222]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[223]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[224]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[225]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[226]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[227]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[228]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[229]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[230]] = v."Using runes";
        v.llllllllIl[v.lIIIIIIIllI[231]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[232]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[233]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[234]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[235]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[236]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[237]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[238]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[239]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[240]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[241]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[242]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[243]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[244]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[245]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[246]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[247]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[248]] = v."Using runes";
        v.llllllllIl[v.lIIIIIIIllI[249]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[250]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[251]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[252]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[8]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[253]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[254]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[255]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[256]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[257]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[258]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[259]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[260]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[261]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[262]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[263]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[264]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[265]] = v."Using runes";
        v.llllllllIl[v.lIIIIIIIllI[266]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[267]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[268]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[269]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[270]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[271]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[272]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[273]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[274]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[275]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[276]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[277]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[278]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[279]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[280]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[281]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[282]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[283]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[284]] = v."Glarial's amulet";
        v.llllllllIl[v.lIIIIIIIllI[285]] = v."Glarial's urn";
        v.llllllllIl[v.lIIIIIIIllI[286]] = v."Using runes";
        v.llllllllIl[v.lIIIIIIIllI[287]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[288]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[289]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[290]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[291]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[292]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[293]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[294]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[295]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[296]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[297]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[298]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[299]] = v."Air rune";
        v.llllllllIl[v.lIIIIIIIllI[300]] = v."Earth rune";
        v.llllllllIl[v.lIIIIIIIllI[301]] = v."Water rune";
        v.llllllllIl[v.lIIIIIIIllI[302]] = v."Putting neck on statue";
        v.llllllllIl[v.lIIIIIIIllI[305]] = v."Putting ashes inside";
        v.llllllllIl[v.lIIIIIIIllI[308]] = v."Chalice";
        v.llllllllIl[v.lIIIIIIIllI[309]] = v."Statue of Glarial";
        v.llllllllIl[v.lIIIIIIIllI[310]] = v."Pillar";
        v.llllllllIl[v.lIIIIIIIllI[311]] = v."Teleporting to CW";
        v.llllllllIl[v.lIIIIIIIllI[312]] = v."Wear";
        v.llllllllIl[v.lIIIIIIIllI[313]] = v."Castle Wars";
        v.llllllllIl[v.lIIIIIIIllI[314]] = v."Rope";
        v.llllllllIl[v.lIIIIIIIllI[325]] = v."Waterfall quest";
        v.llllllllIl[v.lIIIIIIIllI[326]] = v."ring of wealth (";
        v.llllllllIl[v.lIIIIIIIllI[327]] = v."Stalagmite";
        v.llllllllIl[v.lIIIIIIIllI[328]] = v."Games";
        v.llllllllIl[v.lIIIIIIIllI[329]] = v."Games";
        v.llllllllIl[v.lIIIIIIIllI[330]] = v."Games";
        v.llllllllIl[v.lIIIIIIIllI[331]] = v."dueling";
        v.llllllllIl[v.lIIIIIIIllI[332]] = v."dueling";
        v.llllllllIl[v.lIIIIIIIllI[40]] = v."dueling";
        v.llllllllIl[v.lIIIIIIIllI[41]] = v."dueling";
        v.llllllllIl[v.lIIIIIIIllI[304]] = v."dueling";
        v.llllllllIl[v.lIIIIIIIllI[307]] = v."How can I help?";
        v.llllllllIl[v.lIIIIIIIllI[402]] = v."I'm always happy to help a cook in distress.";
        v.llllllllIl[v.lIIIIIIIllI[143]] = v."Yes.";
        v.llllllllIl[v.lIIIIIIIllI[403]] = v."Golrie";
        v.llllllllIl[v.lIIIIIIIllI[404]] = v."Hudon";
        v.llllllllIl[v.lIIIIIIIllI[405]] = v."Almera";
    }

    @Override
    public boolean V() {
        boolean bl;
        if (v.llIllIlIllIIl(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[19])) {
            bl = lIIIIIIIllI[1];
            0;
            
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
            0;
        }
        catch (Exception var13) {
            var13.printStackTrace();
        }
        if (((0x3B ^ 6) & ~(0x33 ^ 0xE)) != 0) {
            return (0xD ^ 0x47) & ~(0x78 ^ 0x32);
        }
        return lIIIIIIIllI[121];
    }

    private static String llIllIIlIIlIl(String var21, String var7) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIIIIIIIllI[13]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIIIIIIIllI[3], var1);
            return new String(var9.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public static void by() {
        block254: {
            block289: {
                Item var22;
                BankLocation var15;
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
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!v.llIllIlIllIII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIIIIIllI[4]) || v.llIllIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                                                            stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[5]];
                                                                                                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[lIIIIIIIllI[1]];
                                                                                                                stringArray2[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(llllllllIl[lIIIIIIIllI[7]]);
                                                                                                                Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                                                                0;
                                                                                                            }
                                                                                                        }
                                                                                                        if (v.llIllIlIlIllI(e.j(lIIIIIIIllI[8]), lIIIIIIIllI[9])) {
                                                                                                            w.bF();
                                                                                                        }
                                                                                                        if (!v.llIllIlIlIlll(e.j(lIIIIIIIllI[10])) || !v.llIllIlIllIIl(e.j(lIIIIIIIllI[8]), lIIIIIIIllI[9])) break block255;
                                                                                                        if (!v.llIllIlIlIlll(v.bz() ? 1 : 0)) break block256;
                                                                                                        var15 = BankLocation.getNearest();
                                                                                                        if (v.llIllIlIllIlI(var15) && v.llIllIlIlIlll(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[11]];
                                                                                                            a.a(var15);
                                                                                                        }
                                                                                                        if (!v.llIllIlIllIlI(var15) || !v.llIllIlIlIlIl(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block256;
                                                                                                        if (v.llIllIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                                                                                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[9]];
                                                                                                            a.a();
                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIllI[12]);
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!v.llIllIlIlIlIl(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[13]];
                                                                                                        if (v.llIllIlIllIll(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)lIIIIIIIllI[5]);
                                                                                                            0;
                                                                                                        }
                                                                                                        if (v.llIllIlIllIll(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)lIIIIIIIllI[3]);
                                                                                                            0;
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
                                                                                0;
                                                                            }
                                                                            if (v.llIllIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                                                                                if (v.llIllIlIlIllI(bS, lIIIIIIIllI[1])) {
                                                                                    if (v.llIllIlIlIlIl(Inventory.contains((int[])f.aU) ? 1 : 0) && v.llIllIlIlIllI(Movement.getRunEnergy(), lIIIIIIIllI[2])) {
                                                                                        Inventory.getFirst((int[])f.aU).interact(llllllllIl[lIIIIIIIllI[26]]);
                                                                                        Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                                        0;
                                                                                    }
                                                                                    e.v();
                                                                                    bS += lIIIIIIIllI[1];
                                                                                }
                                                                                AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[27]];
                                                                                Movement.walkTo((WorldPoint)eg);
                                                                                0;
                                                                                Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                                0;
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
                                                                        0;
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
                                                                        0;
                                                                        Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                        0;
                                                                    }
                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(el), lIIIIIIIllI[6])) {
                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[31];
                                                                        var15 = TileObjects.getNearest((int[])nArray);
                                                                        String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                        stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[32]];
                                                                        if (v.llIllIlIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[33]];
                                                                            if (v.llIllIlIllIlI(var15)) {
                                                                                var15.interact(llllllllIl[lIIIIIIIllI[34]]);
                                                                                Time.sleepTicks((int)lIIIIIIIllI[3]);
                                                                                0;
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
                                                                        var15 = Inventory.getFirst((String[])stringArray4);
                                                                        if (v.llIllIlIllIlI(var15)) {
                                                                            AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[38]];
                                                                            var15.interact(llllllllIl[lIIIIIIIllI[39]]);
                                                                            Time.sleepTicks((int)lIIIIIIIllI[3]);
                                                                            0;
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
                                                                                    0;
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
                                                                                    0;
                                                                                }
                                                                                if (v.llIllIlIlIlIl(eW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(eb));
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                                    0;
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
                                                                                    var15 = TileObjects.getNearest((int[])nArray8);
                                                                                    if (v.llIllIlIllIlI(var15)) {
                                                                                        var15.interact(llllllllIl[lIIIIIIIllI[48]]);
                                                                                        Time.sleepTicks((int)lIIIIIIIllI[5]);
                                                                                        0;
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
                                                                                    0;
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
                                                                                    var15 = TileObjects.getNearest((int[])nArray13);
                                                                                    if (v.llIllIlIllIlI(var15)) {
                                                                                        var15.interact(llllllllIl[lIIIIIIIllI[52]]);
                                                                                        Time.sleepTicks((int)lIIIIIIIllI[3]);
                                                                                        0;
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
                                                                                    0;
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
                                                                                    var15 = TileObjects.getNearest((int[])nArray18);
                                                                                    if (v.llIllIlIllIlI(var15)) {
                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[56]];
                                                                                        int[] nArray19 = new int[lIIIIIIIllI[1]];
                                                                                        nArray19[v.lIIIIIIIllI[0]] = lIIIIIIIllI[40];
                                                                                        var22 = Inventory.getFirst((int[])nArray19);
                                                                                        if (v.llIllIlIllIlI(var22)) {
                                                                                            var22.useOn((TileObject)var15);
                                                                                            Time.sleep((long)1L);
                                                                                            0;
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
                                                                                        0;
                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)eg);
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                                    0;
                                                                                }
                                                                                if (v.llIllIlIlIlIl(eY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)eq);
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                                    0;
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
                                                                                var15 = Inventory.getFirst((int[])nArray21);
                                                                                if (v.llIllIlIllIlI(var15)) {
                                                                                    int[] nArray22 = new int[lIIIIIIIllI[1]];
                                                                                    nArray22[v.lIIIIIIIllI[0]] = lIIIIIIIllI[65];
                                                                                    var22 = TileObjects.getNearest((int[])nArray22);
                                                                                    if (v.llIllIlIllIlI(var22)) {
                                                                                        var15.useOn((TileObject)var22);
                                                                                        Time.sleepUntil(() -> {
                                                                                            boolean bl;
                                                                                            String[] stringArray = new String[lIIIIIIIllI[1]];
                                                                                            stringArray[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[327]];
                                                                                            if (v.llIllIlIllIlI(TileObjects.getNearest((String[])stringArray))) {
                                                                                                bl = lIIIIIIIllI[1];
                                                                                                0;
                                                                                                if (1 != 1) {
                                                                                                    return false;
                                                                                                }
                                                                                            } else {
                                                                                                bl = lIIIIIIIllI[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)lIIIIIIIllI[66]);
                                                                                        0;
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
                                                                                        0;
                                                                                    }
                                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(er), lIIIIIIIllI[6])) {
                                                                                        int[] nArray24 = new int[lIIIIIIIllI[1]];
                                                                                        nArray24[v.lIIIIIIIllI[0]] = lIIIIIIIllI[70];
                                                                                        var15 = TileObjects.getNearest((int[])nArray24);
                                                                                        if (v.llIllIlIllIlI(var15)) {
                                                                                            var15.interact(llllllllIl[lIIIIIIIllI[71]]);
                                                                                            Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray25 = new int[lIIIIIIIllI[1]];
                                                                                        nArray25[v.lIIIIIIIllI[0]] = lIIIIIIIllI[72];
                                                                                        var22 = TileObjects.getNearest((int[])nArray25);
                                                                                        if (v.llIllIlIllIlI(var22)) {
                                                                                            var22.interact(llllllllIl[lIIIIIIIllI[73]]);
                                                                                            Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                                            0;
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
                                                                                    0;
                                                                                }
                                                                                if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(er), lIIIIIIIllI[6])) {
                                                                                    int[] nArray26 = new int[lIIIIIIIllI[1]];
                                                                                    nArray26[v.lIIIIIIIllI[0]] = lIIIIIIIllI[70];
                                                                                    var15 = TileObjects.getNearest((int[])nArray26);
                                                                                    if (v.llIllIlIllIlI(var15)) {
                                                                                        var15.interact(llllllllIl[lIIIIIIIllI[78]]);
                                                                                        Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                                        0;
                                                                                    }
                                                                                    int[] nArray27 = new int[lIIIIIIIllI[1]];
                                                                                    nArray27[v.lIIIIIIIllI[0]] = lIIIIIIIllI[72];
                                                                                    var22 = TileObjects.getNearest((int[])nArray27);
                                                                                    if (v.llIllIlIllIlI(var22)) {
                                                                                        var22.interact(llllllllIl[lIIIIIIIllI[79]]);
                                                                                        Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                                        0;
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
                                                                        0;
                                                                        Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                        0;
                                                                    }
                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(es), lIIIIIIIllI[5])) {
                                                                        int[] nArray = new int[lIIIIIIIllI[1]];
                                                                        nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[81];
                                                                        var15 = TileObjects.getNearest((int[])nArray);
                                                                        if (v.llIllIlIllIlI(var15)) {
                                                                            var15.interact(llllllllIl[lIIIIIIIllI[85]]);
                                                                            Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                            0;
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
                                                                                    0;
                                                                                }
                                                                                if (v.llIllIlIlIlIl(Equipment.contains((int[])f.aN) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)ep);
                                                                                    0;
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
                                                                0;
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
                                                                            0;
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
                                                                            0;
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
                                                                            0;
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
                                                                                        0;
                                                                                    }
                                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(ej), lIIIIIIIllI[7]) && v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ei), lIIIIIIIllI[6])) {
                                                                                        String[] stringArray39 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray39[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[125]];
                                                                                        var15 = Inventory.getFirst((String[])stringArray39);
                                                                                        String[] stringArray40 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray40[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[126]];
                                                                                        var22 = TileObjects.getNearest((String[])stringArray40);
                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[127]];
                                                                                        if (v.llIllIlIllIlI(var15) && v.llIllIlIllIlI(var22)) {
                                                                                            var15.useOn((TileObject)var22);
                                                                                            Time.sleepUntil(() -> {
                                                                                                boolean bl;
                                                                                                if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(ei), lIIIIIIIllI[6])) {
                                                                                                    bl = lIIIIIIIllI[1];
                                                                                                    0;
                                                                                                    if (((0x18 ^ 0x2C) & ~(0xF0 ^ 0xC4)) != 0) {
                                                                                                        return false;
                                                                                                    }
                                                                                                } else {
                                                                                                    bl = lIIIIIIIllI[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)lIIIIIIIllI[128]);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                    if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(ei), lIIIIIIIllI[6])) {
                                                                                        String[] stringArray41 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray41[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[129]];
                                                                                        var15 = Inventory.getFirst((String[])stringArray41);
                                                                                        int[] nArray31 = new int[lIIIIIIIllI[1]];
                                                                                        nArray31[v.lIIIIIIIllI[0]] = lIIIIIIIllI[130];
                                                                                        var22 = TileObjects.getNearest((int[])nArray31);
                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[131]];
                                                                                        if (v.llIllIlIllIlI(var15) && v.llIllIlIllIlI(var22)) {
                                                                                            var15.useOn((TileObject)var22);
                                                                                            Time.sleepTicks((int)lIIIIIIIllI[7]);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                    if (v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)et) ? 1 : 0)) {
                                                                                        String[] stringArray42 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray42[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[132]];
                                                                                        var15 = TileObjects.getNearest((String[])stringArray42);
                                                                                        AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[133]];
                                                                                        if (v.llIllIlIllIlI(var15)) {
                                                                                            var15.interact(llllllllIl[lIIIIIIIllI[134]]);
                                                                                            Time.sleepTicks((int)lIIIIIIIllI[3]);
                                                                                            0;
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
                                                                                            0;
                                                                                        }
                                                                                        if (v.llIllIlIlllII(Players.getLocal().getWorldLocation().distanceTo(eu), lIIIIIIIllI[3])) {
                                                                                            int[] nArray33 = new int[lIIIIIIIllI[1]];
                                                                                            nArray33[v.lIIIIIIIllI[0]] = lIIIIIIIllI[145];
                                                                                            var15 = TileObjects.getNearest((int[])nArray33);
                                                                                            if (v.llIllIlIllIlI(var15)) {
                                                                                                var15.interact(llllllllIl[lIIIIIIIllI[146]]);
                                                                                                Time.sleepTicks((int)lIIIIIIIllI[3]);
                                                                                                0;
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
                                                                                        0;
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
                                                                                        var15 = Inventory.getFirst((int[])nArray38);
                                                                                        String[] stringArray64 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray64[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[164]];
                                                                                        var22 = TileObjects.getNearest((String[])stringArray64);
                                                                                        if (v.llIllIlIllIlI(var15) && v.llIllIlIllIlI(var22)) {
                                                                                            var15.useOn((TileObject)var22);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)et), (int)lIIIIIIIllI[165]);
                                                                                            0;
                                                                                        }
                                                                                        while (v.llIllIlIllIII(Players.getLocal().getWorldLocation().distanceTo(ew), lIIIIIIIllI[3])) {
                                                                                            Movement.walkTo((WorldPoint)ew);
                                                                                            0;
                                                                                            Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                                                            0;
                                                                                            0;
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
                                                                                        var15 = Inventory.getFirst((int[])nArray41);
                                                                                        String[] stringArray72 = new String[lIIIIIIIllI[1]];
                                                                                        stringArray72[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[174]];
                                                                                        var22 = TileObjects.getNearest((String[])stringArray72);
                                                                                        if (v.llIllIlIllIlI(var15) && v.llIllIlIllIlI(var22)) {
                                                                                            var22.interact(llllllllIl[lIIIIIIIllI[175]]);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)et), (int)lIIIIIIIllI[165]);
                                                                                            0;
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
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIIIIIllI[6]);
                                                                                    0;
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
                                                var15 = TileObjects.getFirstAt((WorldPoint)dM, (int[])nArray45);
                                                String[] stringArray93 = new String[lIIIIIIIllI[1]];
                                                stringArray93[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[201]];
                                                Inventory.getFirst((String[])stringArray93).useOn((TileObject)var15);
                                                Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                0;
                                                String[] stringArray94 = new String[lIIIIIIIllI[1]];
                                                stringArray94[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)var15);
                                                Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                0;
                                                String[] stringArray95 = new String[lIIIIIIIllI[1]];
                                                stringArray95[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)var15);
                                                Time.sleepTicks((int)lIIIIIIIllI[1]);
                                                0;
                                                0;
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
                                                0;
                                                Time.sleepTicks((int)lIIIIIIIllI[5]);
                                                0;
                                            }
                                            if (!v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)eB) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[lIIIIIIIllI[1]];
                                            nArray47[v.lIIIIIIIllI[0]] = lIIIIIIIllI[200];
                                            var15 = TileObjects.getFirstAt((WorldPoint)dN, (int[])nArray47);
                                            String[] stringArray109 = new String[lIIIIIIIllI[1]];
                                            stringArray109[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)var15);
                                            Time.sleepTicks((int)lIIIIIIIllI[1]);
                                            0;
                                            String[] stringArray110 = new String[lIIIIIIIllI[1]];
                                            stringArray110[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)var15);
                                            Time.sleepTicks((int)lIIIIIIIllI[1]);
                                            0;
                                            String[] stringArray111 = new String[lIIIIIIIllI[1]];
                                            stringArray111[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)var15);
                                            Time.sleepTicks((int)lIIIIIIIllI[1]);
                                            0;
                                            0;
                                            
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
                                            0;
                                            Time.sleepTicks((int)lIIIIIIIllI[5]);
                                            0;
                                        }
                                        if (!v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)eA) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[lIIIIIIIllI[1]];
                                        nArray49[v.lIIIIIIIllI[0]] = lIIIIIIIllI[200];
                                        var15 = TileObjects.getFirstAt((WorldPoint)dO, (int[])nArray49);
                                        String[] stringArray125 = new String[lIIIIIIIllI[1]];
                                        stringArray125[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)var15);
                                        Time.sleepTicks((int)lIIIIIIIllI[1]);
                                        0;
                                        String[] stringArray126 = new String[lIIIIIIIllI[1]];
                                        stringArray126[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)var15);
                                        Time.sleepTicks((int)lIIIIIIIllI[1]);
                                        0;
                                        String[] stringArray127 = new String[lIIIIIIIllI[1]];
                                        stringArray127[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)var15);
                                        Time.sleepTicks((int)lIIIIIIIllI[1]);
                                        0;
                                        0;
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
                                        0;
                                        Time.sleepTicks((int)lIIIIIIIllI[5]);
                                        0;
                                    }
                                    if (!v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)ez) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[lIIIIIIIllI[1]];
                                    nArray51[v.lIIIIIIIllI[0]] = lIIIIIIIllI[200];
                                    var15 = TileObjects.getFirstAt((WorldPoint)dP, (int[])nArray51);
                                    String[] stringArray141 = new String[lIIIIIIIllI[1]];
                                    stringArray141[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)var15);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);
                                    0;
                                    String[] stringArray142 = new String[lIIIIIIIllI[1]];
                                    stringArray142[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)var15);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);
                                    0;
                                    String[] stringArray143 = new String[lIIIIIIIllI[1]];
                                    stringArray143[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)var15);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);
                                    0;
                                    0;
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
                                    0;
                                    Time.sleepTicks((int)lIIIIIIIllI[5]);
                                    0;
                                }
                                if (!v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)ey) ? 1 : 0)) continue;
                                int[] nArray53 = new int[lIIIIIIIllI[1]];
                                nArray53[v.lIIIIIIIllI[0]] = lIIIIIIIllI[200];
                                var15 = TileObjects.getFirstAt((WorldPoint)dQ, (int[])nArray53);
                                String[] stringArray157 = new String[lIIIIIIIllI[1]];
                                stringArray157[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[272]];
                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray157) ? 1 : 0)) {
                                    String[] stringArray158 = new String[lIIIIIIIllI[1]];
                                    stringArray158[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[273]];
                                    Inventory.getFirst((String[])stringArray158).useOn((TileObject)var15);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);
                                    0;
                                }
                                String[] stringArray159 = new String[lIIIIIIIllI[1]];
                                stringArray159[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[274]];
                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[lIIIIIIIllI[1]];
                                    stringArray160[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)var15);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);
                                    0;
                                }
                                String[] stringArray161 = new String[lIIIIIIIllI[1]];
                                stringArray161[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[276]];
                                if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[lIIIIIIIllI[1]];
                                    stringArray162[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)var15);
                                    Time.sleepTicks((int)lIIIIIIIllI[1]);
                                    0;
                                }
                                0;
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
                                0;
                            }
                            if (!v.llIllIlIlIlIl(Players.getLocal().getWorldLocation().equals((Object)ex) ? 1 : 0)) continue;
                            int[] nArray55 = new int[lIIIIIIIllI[1]];
                            nArray55[v.lIIIIIIIllI[0]] = lIIIIIIIllI[200];
                            var15 = TileObjects.getFirstAt((WorldPoint)dR, (int[])nArray55);
                            String[] stringArray176 = new String[lIIIIIIIllI[1]];
                            stringArray176[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[293]];
                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray176) ? 1 : 0)) {
                                String[] stringArray177 = new String[lIIIIIIIllI[1]];
                                stringArray177[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[294]];
                                Inventory.getFirst((String[])stringArray177).useOn((TileObject)var15);
                                Time.sleepTicks((int)lIIIIIIIllI[1]);
                                0;
                            }
                            String[] stringArray178 = new String[lIIIIIIIllI[1]];
                            stringArray178[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[295]];
                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[lIIIIIIIllI[1]];
                                stringArray179[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)var15);
                                Time.sleepTicks((int)lIIIIIIIllI[1]);
                                0;
                            }
                            String[] stringArray180 = new String[lIIIIIIIllI[1]];
                            stringArray180[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[297]];
                            if (v.llIllIlIlIlIl(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[lIIIIIIIllI[1]];
                                stringArray181[v.lIIIIIIIllI[0]] = llllllllIl[lIIIIIIIllI[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)var15);
                                Time.sleepTicks((int)lIIIIIIIllI[1]);
                                0;
                            }
                            0;
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
                                var15 = TileObjects.getNearest((int[])nArray);
                                int[] nArray56 = new int[lIIIIIIIllI[1]];
                                nArray56[v.lIIIIIIIllI[0]] = lIIIIIIIllI[304];
                                var22 = Inventory.getFirst((int[])nArray56);
                                if (v.llIllIlIllIlI(var15) && v.llIllIlIllIlI(var22)) {
                                    var22.useOn((TileObject)var15);
                                    Time.sleepTicks((int)lIIIIIIIllI[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (v.llIllIlIlllIl(e.j(lIIIIIIIllI[10]), lIIIIIIIllI[13])) {
                    AccBuilderTempleTrek.c = llllllllIl[lIIIIIIIllI[305]];
                    int[] nArray = new int[lIIIIIIIllI[1]];
                    nArray[v.lIIIIIIIllI[0]] = lIIIIIIIllI[306];
                    var15 = TileObjects.getNearest((int[])nArray);
                    int[] nArray57 = new int[lIIIIIIIllI[1]];
                    nArray57[v.lIIIIIIIllI[0]] = lIIIIIIIllI[307];
                    var22 = Inventory.getFirst((int[])nArray57);
                    if (v.llIllIlIlIllI(ck, lIIIIIIIllI[1])) {
                        ac.kl += lIIIIIIIllI[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lIIIIIIIllI[1];
                        ac.kl = lIIIIIIIllI[0];
                        cl = lIIIIIIIllI[0];
                    }
                    if (v.llIllIlIllIlI(var15) && v.llIllIlIllIlI(var22)) {
                        var22.useOn((TileObject)var15);
                        Time.sleepTicks((int)lIIIIIIIllI[7]);
                        0;
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
                    0;
                }
                if (v.llIllIlIlIlIl(Equipment.contains((int[])f.aM) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aM).interact(llllllllIl[lIIIIIIIllI[313]]);
                    Time.sleepTicks((int)lIIIIIIIllI[6]);
                    0;
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

