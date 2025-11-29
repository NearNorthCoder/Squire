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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.z;
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

public class y
implements F {
    static /* synthetic */ int gu;
    private static final /* synthetic */ int gm;
    private static final /* synthetic */ WorldPoint gi;
    private static final /* synthetic */ WorldPoint gf;
    static final /* synthetic */ int fA;
    public static final /* synthetic */ WorldPoint fv;
    public static /* synthetic */ boolean bz;
    public static /* synthetic */ List<d> bB;
    private static final /* synthetic */ WorldPoint fL;
    public static /* synthetic */ int gq;
    private static final /* synthetic */ WorldPoint fU;
    static /* synthetic */ int ci;
    static /* synthetic */ WorldArea gE;
    private static final /* synthetic */ WorldPoint gg;
    private static final /* synthetic */ int gk;
    static final /* synthetic */ int fE;
    static final /* synthetic */ int fB;
    static /* synthetic */ boolean cj;
    static /* synthetic */ String gy;
    static /* synthetic */ String gA;
    static /* synthetic */ WorldPoint gD;
    static final /* synthetic */ int fz;
    private static final /* synthetic */ WorldPoint ga;
    private static final /* synthetic */ WorldPoint fT;
    private static /* synthetic */ int[] llIIlIll;
    static final /* synthetic */ int fy;
    public static final /* synthetic */ int[] fq;
    public static final /* synthetic */ WorldPoint fw;
    private static final /* synthetic */ int gn;
    private static final /* synthetic */ WorldPoint ge;
    private static final /* synthetic */ WorldPoint fJ;
    static final /* synthetic */ WorldPoint[] fH;
    private static final /* synthetic */ WorldPoint fO;
    static /* synthetic */ int gw;
    static /* synthetic */ int gr;
    public static final /* synthetic */ WorldPoint fx;
    static final /* synthetic */ int fG;
    private static final /* synthetic */ WorldPoint fY;
    private static final /* synthetic */ WorldPoint fV;
    private static final /* synthetic */ int gl;
    private static final /* synthetic */ WorldPoint fK;
    private static final /* synthetic */ WorldPoint fQ;
    private static final /* synthetic */ WorldPoint gb;
    private static final /* synthetic */ WorldPoint gh;
    public static /* synthetic */ WorldArea go;
    private static final /* synthetic */ WorldPoint fZ;
    static /* synthetic */ int bZ;
    private static final /* synthetic */ WorldPoint fR;
    public static final /* synthetic */ int[] fp;
    private static final /* synthetic */ WorldPoint fM;
    static /* synthetic */ int gv;
    private static final /* synthetic */ WorldPoint fN;
    public static final /* synthetic */ WorldArea fr;
    public static final /* synthetic */ WorldPoint fu;
    static /* synthetic */ WorldArea gC;
    static /* synthetic */ String gz;
    static final /* synthetic */ int fD;
    private static final /* synthetic */ WorldPoint gc;
    static final /* synthetic */ int fC;
    static /* synthetic */ int gt;
    public static final /* synthetic */ WorldPoint fs;
    static /* synthetic */ int gs;
    public static final /* synthetic */ int[] fo;
    private static final /* synthetic */ WorldPoint fW;
    static /* synthetic */ WorldPoint gB;
    private static final /* synthetic */ WorldPoint fS;
    private static final /* synthetic */ int gj;
    private static final /* synthetic */ WorldPoint fI;
    static final /* synthetic */ int fF;
    private static final /* synthetic */ WorldPoint gd;
    private static final /* synthetic */ WorldPoint fX;
    private static final /* synthetic */ WorldPoint fP;
    public static final /* synthetic */ WorldPoint ft;
    static /* synthetic */ String[] gx;
    public static /* synthetic */ int gp;
    private static /* synthetic */ String[] llIIIIll;

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

    private static String lIlIIIllIIl(String lIlIlIIllllllII, String lIlIlIlIIIIIIII) {
        lIlIlIIllllllII = new String(Base64.getDecoder().decode(lIlIlIIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIIllllllll = new StringBuilder();
        char[] lIlIlIIlllllllI = lIlIlIlIIIIIIII.toCharArray();
        int lIlIlIIllllllIl = llIIlIll[0];
        char[] lIlIlIIllllIlll = lIlIlIIllllllII.toCharArray();
        int lIlIlIIllllIllI = lIlIlIIllllIlll.length;
        int lIlIlIIllllIlIl = llIIlIll[0];
        while (y.lIlIIllIlll(lIlIlIIllllIlIl, lIlIlIIllllIllI)) {
            char lIlIlIlIIIIIIlI = lIlIlIIllllIlll[lIlIlIIllllIlIl];
            lIlIlIIllllllll.append((char)(lIlIlIlIIIIIIlI ^ lIlIlIIlllllllI[lIlIlIIllllllIl % lIlIlIIlllllllI.length]));
            0;
            ++lIlIlIIllllllIl;
            ++lIlIlIIllllIlIl;
            0;
            if (2 >= 0) continue;
            return null;
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

    private static String lIlIIIllIlI(String lIlIlIIllIlllIl, String lIlIlIIllIllllI) {
        try {
            SecretKeySpec lIlIlIIlllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIllIllllI.getBytes(StandardCharsets.UTF_8)), llIIlIll[13]), "DES");
            Cipher lIlIlIIlllIIIIl = Cipher.getInstance("DES");
            lIlIlIIlllIIIIl.init(llIIlIll[3], lIlIlIIlllIIIlI);
            return new String(lIlIlIIlllIIIIl.doFinal(Base64.getDecoder().decode(lIlIlIIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIlllIIIII) {
            lIlIlIIlllIIIII.printStackTrace();
            return null;
        }
    }

    public static void ag() {
        d lIlIlIlIIIIlllI;
        Object lIlIlIlIIIIllll;
        block20: {
            block19: {
                int[] nArray = new int[llIIlIll[1]];
                nArray[y.llIIlIll[0]] = llIIlIll[20];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llIIlIll[20], llIIlIll[44], llIIlIll[315]);
                    bB.add(d2);
                    0;
                }
                int[] nArray2 = new int[llIIlIll[1]];
                nArray2[y.llIIlIll[0]] = llIIlIll[316];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new d(llIIlIll[316], llIIlIll[7], i.bw);
                    bB.add((d)lIlIlIlIIIIllll);
                    0;
                }
                int[] nArray3 = new int[llIIlIll[1]];
                nArray3[y.llIIlIll[0]] = llIIlIll[14];
                if (y.lIlIIllIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[llIIlIll[1]];
                    nArray4[y.llIIlIll[0]] = llIIlIll[14];
                    if (y.lIlIIllIlll(Bank.getFirst((int[])nArray4).getQuantity(), llIIlIll[11])) {
                        lIlIlIlIIIIllll = new d(llIIlIll[14], llIIlIll[317], llIIlIll[19]);
                        bB.add((d)lIlIlIlIIIIllll);
                        0;
                    }
                }
                int[] nArray5 = new int[llIIlIll[1]];
                nArray5[y.llIIlIll[0]] = llIIlIll[15];
                if (y.lIlIIllIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[llIIlIll[1]];
                    nArray6[y.llIIlIll[0]] = llIIlIll[15];
                    if (y.lIlIIllIlll(Bank.getFirst((int[])nArray6).getQuantity(), llIIlIll[11])) {
                        lIlIlIlIIIIllll = new d(llIIlIll[15], llIIlIll[317], llIIlIll[19]);
                        bB.add((d)lIlIlIlIIIIllll);
                        0;
                    }
                }
                int[] nArray7 = new int[llIIlIll[1]];
                nArray7[y.llIIlIll[0]] = llIIlIll[16];
                if (y.lIlIIllIllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[llIIlIll[1]];
                    nArray8[y.llIIlIll[0]] = llIIlIll[16];
                    if (y.lIlIIllIlll(Bank.getFirst((int[])nArray8).getQuantity(), llIIlIll[11])) {
                        lIlIlIlIIIIllll = new d(llIIlIll[16], llIIlIll[317], llIIlIll[19]);
                        bB.add((d)lIlIlIlIIIIllll);
                        0;
                    }
                }
                int[] nArray9 = new int[llIIlIll[1]];
                nArray9[y.llIIlIll[0]] = llIIlIll[14];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new d(llIIlIll[14], llIIlIll[317], llIIlIll[19]);
                    bB.add((d)lIlIlIlIIIIllll);
                    0;
                }
                int[] nArray10 = new int[llIIlIll[1]];
                nArray10[y.llIIlIll[0]] = llIIlIll[15];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new d(llIIlIll[15], llIIlIll[317], llIIlIll[19]);
                    bB.add((d)lIlIlIlIIIIllll);
                    0;
                }
                int[] nArray11 = new int[llIIlIll[1]];
                nArray11[y.llIIlIll[0]] = llIIlIll[16];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new d(llIIlIll[16], llIIlIll[317], llIIlIll[19]);
                    bB.add((d)lIlIlIlIIIIllll);
                    0;
                }
                int[] nArray12 = new int[llIIlIll[1]];
                nArray12[y.llIIlIll[0]] = llIIlIll[14];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new d(llIIlIll[14], llIIlIll[317], llIIlIll[19]);
                    bB.add((d)lIlIlIlIIIIllll);
                    0;
                }
                int[] nArray13 = new int[llIIlIll[1]];
                nArray13[y.llIIlIll[0]] = llIIlIll[318];
                if (y.lIlIIlllIII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    lIlIlIlIIIIllll = new d(llIIlIll[318], llIIlIll[7], llIIlIll[315]);
                    bB.add((d)lIlIlIlIIIIllll);
                    0;
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
            lIlIlIlIIIIllll = new d(llIIlIll[24], llIIlIll[19], llIIlIll[319]);
            bB.add((d)lIlIlIlIIIIllll);
            0;
        }
        int[] nArray = new int[llIIlIll[1]];
        nArray[y.llIIlIll[0]] = llIIlIll[18];
        if (y.lIlIIlllIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlIlIlIIIIllll = new d(llIIlIll[18], llIIlIll[7], llIIlIll[320]);
            bB.add((d)lIlIlIlIIIIllll);
            0;
        }
        if (y.lIlIIlllIII(Bank.contains((Predicate)(lIlIlIlIIIIllll = item -> item.getName().toLowerCase().contains(llIIIIll[llIIlIll[326]]))) ? 1 : 0)) {
            lIlIlIlIIIIlllI = new d(llIIlIll[321], llIIlIll[25], llIIlIll[322]);
            bB.add(lIlIlIlIIIIlllI);
            0;
        }
        int[] nArray17 = new int[llIIlIll[1]];
        nArray17[y.llIIlIll[0]] = llIIlIll[323];
        if (y.lIlIIlllIII(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lIlIlIlIIIIlllI = new d(llIIlIll[323], llIIlIll[58], llIIlIll[324]);
            bB.add(lIlIlIlIIIIlllI);
            0;
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
            0;
            if (-1 < 0) return n2 != 0;
            return ((0x2C ^ 0x38) & ~(1 ^ 0x15)) != 0;
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

    private static String lIlIIIllIII(String lIlIlIIlllIllII, String lIlIlIIlllIlIll) {
        try {
            SecretKeySpec lIlIlIIlllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIlllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIlllIlllI = Cipher.getInstance("Blowfish");
            lIlIlIIlllIlllI.init(llIIlIll[3], lIlIlIIlllIllll);
            return new String(lIlIlIIlllIlllI.doFinal(Base64.getDecoder().decode(lIlIlIIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIlllIllIl) {
            lIlIlIIlllIllIl.printStackTrace();
            return null;
        }
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
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!y.lIlIIlllIIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIIlIll[4]) || y.lIlIIllIllI(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[llIIlIll[1]];
                                                                                                            stringArray[y.llIIlIll[0]] = llIIIIll[llIIlIll[5]];
                                                                                                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[llIIlIll[1]];
                                                                                                                stringArray2[y.llIIlIll[0]] = llIIIIll[llIIlIll[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(llIIIIll[llIIlIll[7]]);
                                                                                                                Time.sleepTicks((int)llIIlIll[1]);
                                                                                                                0;
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
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!y.lIlIIllIllI(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderBarrows.c = llIIIIll[llIIlIll[13]];
                                                                                                        if (y.lIlIIllllII(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)llIIlIll[5]);
                                                                                                            0;
                                                                                                        }
                                                                                                        if (y.lIlIIllllII(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)llIIlIll[3]);
                                                                                                            0;
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
                                                                                0;
                                                                            }
                                                                            if (y.lIlIIlllIII(Bank.isOpen() ? 1 : 0)) {
                                                                                if (y.lIlIIllIlll(bZ, llIIlIll[1])) {
                                                                                    if (y.lIlIIllIllI(Inventory.contains((int[])f.bb) ? 1 : 0) && y.lIlIIllIlll(Movement.getRunEnergy(), llIIlIll[2])) {
                                                                                        Inventory.getFirst((int[])f.bb).interact(llIIIIll[llIIlIll[26]]);
                                                                                        Time.sleepTicks((int)llIIlIll[1]);
                                                                                        0;
                                                                                    }
                                                                                    e.w();
                                                                                    bZ += llIIlIll[1];
                                                                                }
                                                                                AccBuilderBarrows.c = llIIIIll[llIIlIll[27]];
                                                                                Movement.walkTo((WorldPoint)fM);
                                                                                0;
                                                                                Time.sleepTicks((int)llIIlIll[1]);
                                                                                0;
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
                                                                        0;
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
                                                                        0;
                                                                        Time.sleepTicks((int)llIIlIll[1]);
                                                                        0;
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
                                                                                0;
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
                                                                            0;
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
                                                                                    0;
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
                                                                                    0;
                                                                                }
                                                                                if (y.lIlIIllIllI(gC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(fH));
                                                                                    0;
                                                                                    Time.sleepTicks((int)llIIlIll[1]);
                                                                                    0;
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
                                                                                        0;
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
                                                                                    0;
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
                                                                                        0;
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
                                                                                    0;
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
                                                                                            0;
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
                                                                                        0;
                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)fM);
                                                                                    0;
                                                                                    Time.sleepTicks((int)llIIlIll[1]);
                                                                                    0;
                                                                                }
                                                                                if (y.lIlIIllIllI(gE.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)fW);
                                                                                    0;
                                                                                    Time.sleepTicks((int)llIIlIll[1]);
                                                                                    0;
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
                                                                                                0;
                                                                                                if (-2 > 0) {
                                                                                                    return ((0x20 ^ 0x2C) & ~(0xB6 ^ 0xBA)) != 0;
                                                                                                }
                                                                                            } else {
                                                                                                bl = llIIlIll[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)llIIlIll[66]);
                                                                                        0;
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
                                                                                        0;
                                                                                    }
                                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fX), llIIlIll[6])) {
                                                                                        int[] nArray24 = new int[llIIlIll[1]];
                                                                                        nArray24[y.llIIlIll[0]] = llIIlIll[70];
                                                                                        lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray24);
                                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                            lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[71]]);
                                                                                            Time.sleepTicks((int)llIIlIll[1]);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray25 = new int[llIIlIll[1]];
                                                                                        nArray25[y.llIIlIll[0]] = llIIlIll[72];
                                                                                        lIlIlIlIIIlIIlI = TileObjects.getNearest((int[])nArray25);
                                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                                                                                            lIlIlIlIIIlIIlI.interact(llIIIIll[llIIlIll[73]]);
                                                                                            Time.sleepTicks((int)llIIlIll[1]);
                                                                                            0;
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
                                                                                    0;
                                                                                }
                                                                                if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fX), llIIlIll[6])) {
                                                                                    int[] nArray26 = new int[llIIlIll[1]];
                                                                                    nArray26[y.llIIlIll[0]] = llIIlIll[70];
                                                                                    lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray26);
                                                                                    if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                        lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[78]]);
                                                                                        Time.sleepTicks((int)llIIlIll[1]);
                                                                                        0;
                                                                                    }
                                                                                    int[] nArray27 = new int[llIIlIll[1]];
                                                                                    nArray27[y.llIIlIll[0]] = llIIlIll[72];
                                                                                    lIlIlIlIIIlIIlI = TileObjects.getNearest((int[])nArray27);
                                                                                    if (y.lIlIIlllIll(lIlIlIlIIIlIIlI)) {
                                                                                        lIlIlIlIIIlIIlI.interact(llIIIIll[llIIlIll[79]]);
                                                                                        Time.sleepTicks((int)llIIlIll[1]);
                                                                                        0;
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
                                                                        0;
                                                                        Time.sleepTicks((int)llIIlIll[1]);
                                                                        0;
                                                                    }
                                                                    if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(fY), llIIlIll[5])) {
                                                                        int[] nArray = new int[llIIlIll[1]];
                                                                        nArray[y.llIIlIll[0]] = llIIlIll[81];
                                                                        lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray);
                                                                        if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                            lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[85]]);
                                                                            Time.sleepTicks((int)llIIlIll[1]);
                                                                            0;
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
                                                                                    0;
                                                                                }
                                                                                if (y.lIlIIllIllI(Equipment.contains((int[])f.aU) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)fV);
                                                                                    0;
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
                                                                0;
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
                                                                            0;
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
                                                                            0;
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
                                                                            0;
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
                                                                                        0;
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
                                                                                                    0;
                                                                                                    if (2 >= (0x2E ^ 0x2A)) {
                                                                                                        return ((0x98 ^ 0xB4) & ~(0x58 ^ 0x74)) != 0;
                                                                                                    }
                                                                                                } else {
                                                                                                    bl = llIIlIll[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)llIIlIll[128]);
                                                                                            0;
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
                                                                                            0;
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
                                                                                            0;
                                                                                        }
                                                                                        if (y.lIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(ga), llIIlIll[3])) {
                                                                                            int[] nArray33 = new int[llIIlIll[1]];
                                                                                            nArray33[y.llIIlIll[0]] = llIIlIll[145];
                                                                                            lIlIlIlIIIlIIll = TileObjects.getNearest((int[])nArray33);
                                                                                            if (y.lIlIIlllIll(lIlIlIlIIIlIIll)) {
                                                                                                lIlIlIlIIIlIIll.interact(llIIIIll[llIIlIll[146]]);
                                                                                                Time.sleepTicks((int)llIIlIll[3]);
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
                                                                                            0;
                                                                                        }
                                                                                        while (y.lIlIIlllIIl(Players.getLocal().getWorldLocation().distanceTo(gc), llIIlIll[3])) {
                                                                                            Movement.walkTo((WorldPoint)gc);
                                                                                            0;
                                                                                            Time.sleepTicks((int)llIIlIll[1]);
                                                                                            0;
                                                                                            0;
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
                                                                                    0;
                                                                                    Time.sleepTicks((int)llIIlIll[6]);
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
                                                0;
                                                String[] stringArray94 = new String[llIIlIll[1]];
                                                stringArray94[y.llIIlIll[0]] = llIIIIll[llIIlIll[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)lIlIlIlIIIlIIll);
                                                Time.sleepTicks((int)llIIlIll[1]);
                                                0;
                                                String[] stringArray95 = new String[llIIlIll[1]];
                                                stringArray95[y.llIIlIll[0]] = llIIIIll[llIIlIll[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)lIlIlIlIIIlIIll);
                                                Time.sleepTicks((int)llIIlIll[1]);
                                                0;
                                                0;
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
                                                0;
                                                Time.sleepTicks((int)llIIlIll[5]);
                                                0;
                                            }
                                            if (!y.lIlIIllIllI(Players.getLocal().getWorldLocation().equals((Object)gh) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[llIIlIll[1]];
                                            nArray47[y.llIIlIll[0]] = llIIlIll[200];
                                            lIlIlIlIIIlIIll = TileObjects.getFirstAt((WorldPoint)ft, (int[])nArray47);
                                            String[] stringArray109 = new String[llIIlIll[1]];
                                            stringArray109[y.llIIlIll[0]] = llIIIIll[llIIlIll[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)lIlIlIlIIIlIIll);
                                            Time.sleepTicks((int)llIIlIll[1]);
                                            0;
                                            String[] stringArray110 = new String[llIIlIll[1]];
                                            stringArray110[y.llIIlIll[0]] = llIIIIll[llIIlIll[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)lIlIlIlIIIlIIll);
                                            Time.sleepTicks((int)llIIlIll[1]);
                                            0;
                                            String[] stringArray111 = new String[llIIlIll[1]];
                                            stringArray111[y.llIIlIll[0]] = llIIIIll[llIIlIll[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)lIlIlIlIIIlIIll);
                                            Time.sleepTicks((int)llIIlIll[1]);
                                            0;
                                            0;
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
                                            0;
                                            Time.sleepTicks((int)llIIlIll[5]);
                                            0;
                                        }
                                        if (!y.lIlIIllIllI(Players.getLocal().getWorldLocation().equals((Object)gg) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[llIIlIll[1]];
                                        nArray49[y.llIIlIll[0]] = llIIlIll[200];
                                        lIlIlIlIIIlIIll = TileObjects.getFirstAt((WorldPoint)fu, (int[])nArray49);
                                        String[] stringArray125 = new String[llIIlIll[1]];
                                        stringArray125[y.llIIlIll[0]] = llIIIIll[llIIlIll[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)lIlIlIlIIIlIIll);
                                        Time.sleepTicks((int)llIIlIll[1]);
                                        0;
                                        String[] stringArray126 = new String[llIIlIll[1]];
                                        stringArray126[y.llIIlIll[0]] = llIIIIll[llIIlIll[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)lIlIlIlIIIlIIll);
                                        Time.sleepTicks((int)llIIlIll[1]);
                                        0;
                                        String[] stringArray127 = new String[llIIlIll[1]];
                                        stringArray127[y.llIIlIll[0]] = llIIIIll[llIIlIll[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)lIlIlIlIIIlIIll);
                                        Time.sleepTicks((int)llIIlIll[1]);
                                        0;
                                        0;
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
                                        0;
                                        Time.sleepTicks((int)llIIlIll[5]);
                                        0;
                                    }
                                    if (!y.lIlIIllIllI(Players.getLocal().getWorldLocation().equals((Object)gf) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[llIIlIll[1]];
                                    nArray51[y.llIIlIll[0]] = llIIlIll[200];
                                    lIlIlIlIIIlIIll = TileObjects.getFirstAt((WorldPoint)fv, (int[])nArray51);
                                    String[] stringArray141 = new String[llIIlIll[1]];
                                    stringArray141[y.llIIlIll[0]] = llIIIIll[llIIlIll[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[1]);
                                    0;
                                    String[] stringArray142 = new String[llIIlIll[1]];
                                    stringArray142[y.llIIlIll[0]] = llIIIIll[llIIlIll[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[1]);
                                    0;
                                    String[] stringArray143 = new String[llIIlIll[1]];
                                    stringArray143[y.llIIlIll[0]] = llIIIIll[llIIlIll[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[1]);
                                    0;
                                    0;
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
                                    0;
                                    Time.sleepTicks((int)llIIlIll[5]);
                                    0;
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
                                    0;
                                }
                                String[] stringArray159 = new String[llIIlIll[1]];
                                stringArray159[y.llIIlIll[0]] = llIIIIll[llIIlIll[274]];
                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[llIIlIll[1]];
                                    stringArray160[y.llIIlIll[0]] = llIIIIll[llIIlIll[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[1]);
                                    0;
                                }
                                String[] stringArray161 = new String[llIIlIll[1]];
                                stringArray161[y.llIIlIll[0]] = llIIIIll[llIIlIll[276]];
                                if (y.lIlIIllIllI(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[llIIlIll[1]];
                                    stringArray162[y.llIIlIll[0]] = llIIIIll[llIIlIll[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)lIlIlIlIIIlIIll);
                                    Time.sleepTicks((int)llIIlIll[1]);
                                    0;
                                }
                                0;
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
                                0;
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
                                0;
                            }
                            String[] stringArray178 = new String[llIIlIll[1]];
                            stringArray178[y.llIIlIll[0]] = llIIIIll[llIIlIll[295]];
                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[llIIlIll[1]];
                                stringArray179[y.llIIlIll[0]] = llIIIIll[llIIlIll[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)lIlIlIlIIIlIIll);
                                Time.sleepTicks((int)llIIlIll[1]);
                                0;
                            }
                            String[] stringArray180 = new String[llIIlIll[1]];
                            stringArray180[y.llIIlIll[0]] = llIIIIll[llIIlIll[297]];
                            if (y.lIlIIllIllI(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[llIIlIll[1]];
                                stringArray181[y.llIIlIll[0]] = llIIIIll[llIIlIll[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)lIlIlIlIIIlIIll);
                                Time.sleepTicks((int)llIIlIll[1]);
                                0;
                            }
                            0;
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
                                    0;
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
                        0;
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
                    0;
                }
                if (y.lIlIIllIllI(Equipment.contains((int[])f.aT) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aT).interact(llIIIIll[llIIlIll[313]]);
                    Time.sleepTicks((int)llIIlIll[6]);
                    0;
                }
            }
        }
    }

    @Override
    public boolean W() {
        boolean bl;
        if (y.lIlIIlllIlI(e.j(llIIlIll[10]), llIIlIll[19])) {
            bl = llIIlIll[1];
            0;
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
        y.llIIIIll[y.llIIlIll[0]] = y."Buying items";
        y.llIIIIll[y.llIIlIll[1]] = y."Finished buying items, switching back to questing";
        y.llIIIIll[y.llIIlIll[3]] = y."Drink";
        y.llIIIIll[y.llIIlIll[5]] = y."Shark";
        y.llIIIIll[y.llIIlIll[6]] = y."Shark";
        y.llIIIIll[y.llIIlIll[7]] = y."Eat";
        y.llIIIIll[y.llIIlIll[11]] = y."Navigating to bank";
        y.llIIIIll[y.llIIlIll[9]] = y."Opening bank";
        y.llIIIIll[y.llIIlIll[13]] = y."Handling banking";
        y.llIIIIll[y.llIIlIll[17]] = y."We are missing runessupplies, switching to BUYING";
        y.llIIIIll[y.llIIlIll[19]] = y."Rope";
        y.llIIIIll[y.llIIlIll[21]] = y."Shark";
        y.llIIIIll[y.llIIlIll[22]] = y."We are missing supplies, switching to BUYING";
        y.llIIIIll[y.llIIlIll[23]] = y."Rope";
        y.llIIIIll[y.llIIlIll[4]] = y."Shark";
        y.llIIIIll[y.llIIlIll[26]] = y."Drink";
        y.llIIIIll[y.llIIlIll[27]] = y."Nav to start";
        y.llIIIIll[y.llIIlIll[28]] = y."Chatting";
        y.llIIIIll[y.llIIlIll[25]] = y."Nav to boy";
        y.llIIIIll[y.llIIlIll[29]] = y."Chat boy";
        y.llIIIIll[y.llIIlIll[30]] = y."Nav to bookcase";
        y.llIIIIll[y.llIIlIll[32]] = y."Book on baxtorian";
        y.llIIIIll[y.llIIlIll[33]] = y."Searching bookcase";
        y.llIIIIll[y.llIIlIll[34]] = y."Search";
        y.llIIIIll[y.llIIlIll[35]] = y."Book on baxtorian";
        y.llIIIIll[y.llIIlIll[37]] = y."Book on baxtorian";
        y.llIIIIll[y.llIIlIll[38]] = y."Reading";
        y.llIIIIll[y.llIIlIll[39]] = y."Read";
        y.llIIIIll[y.llIIlIll[42]] = y."Tele to CW";
        y.llIIIIll[y.llIIlIll[43]] = y."Wear";
        y.llIIIIll[y.llIIlIll[44]] = y."Castle Wars";
        y.llIIIIll[y.llIIlIll[45]] = y."Nav to maze ladder";
        y.llIIIIll[y.llIIlIll[46]] = y."Fountain";
        y.llIIIIll[y.llIIlIll[48]] = y."Climb-down";
        y.llIIIIll[y.llIIlIll[50]] = y."nav to box";
        y.llIIIIll[y.llIIlIll[51]] = y."Searching crate";
        y.llIIIIll[y.llIIlIll[52]] = y."Search";
        y.llIIIIll[y.llIIlIll[54]] = y."Nav to cage";
        y.llIIIIll[y.llIIlIll[56]] = y."Entering cage";
        y.llIIIIll[y.llIIlIll[57]] = y."Chat npc";
        y.llIIIIll[y.llIIlIll[58]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[59]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[60]] = y."Nav to tombstone";
        y.llIIIIll[y.llIIlIll[61]] = y."Wear";
        y.llIIIIll[y.llIIlIll[62]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[63]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[64]] = y."Entering tomb";
        y.llIIIIll[y.llIIlIll[67]] = y."Stalagmite";
        y.llIIIIll[y.llIIlIll[68]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[69]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[2]] = y."Getting ammy";
        y.llIIIIll[y.llIIlIll[71]] = y."Open";
        y.llIIIIll[y.llIIlIll[73]] = y."Search";
        y.llIIIIll[y.llIIlIll[74]] = y."Stalagmite";
        y.llIIIIll[y.llIIlIll[75]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[76]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[77]] = y."Getting ammy";
        y.llIIIIll[y.llIIlIll[78]] = y."Open";
        y.llIIIIll[y.llIIlIll[79]] = y."Search";
        y.llIIIIll[y.llIIlIll[80]] = y."Stalagmite";
        y.llIIIIll[y.llIIlIll[82]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[83]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[84]] = y."Getting ashes";
        y.llIIIIll[y.llIIlIll[85]] = y."Search";
        y.llIIIIll[y.llIIlIll[86]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[10]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[87]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[88]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[89]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[90]] = y."Nav to bank";
        y.llIIIIll[y.llIIlIll[91]] = y."Wear";
        y.llIIIIll[y.llIIlIll[92]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[93]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[94]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[95]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[96]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[97]] = y."Opening bank";
        y.llIIIIll[y.llIIlIll[98]] = y."Withdrawing runes";
        y.llIIIIll[y.llIIlIll[99]] = y."Vial";
        y.llIIIIll[y.llIIlIll[100]] = y."Shark";
        y.llIIIIll[y.llIIlIll[101]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[102]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[103]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[104]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[105]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[106]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[107]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[108]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[109]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[110]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[111]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[112]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[113]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[114]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[115]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[116]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[117]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[118]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[119]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[120]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[121]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[122]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[123]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[124]] = y."Nav to door entrance";
        y.llIIIIll[y.llIIlIll[125]] = y."Rope";
        y.llIIIIll[y.llIIlIll[126]] = y."Rock";
        y.llIIIIll[y.llIIlIll[127]] = y."Roping rock";
        y.llIIIIll[y.llIIlIll[129]] = y."Rope";
        y.llIIIIll[y.llIIlIll[131]] = y."Roping tree";
        y.llIIIIll[y.llIIlIll[132]] = y."Door";
        y.llIIIIll[y.llIIlIll[133]] = y."Entering door";
        y.llIIIIll[y.llIIlIll[134]] = y."Open";
        y.llIIIIll[y.llIIlIll[135]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[136]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[137]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[138]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[139]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[140]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[141]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[142]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[144]] = y."Nav to key and get";
        y.llIIIIll[y.llIIlIll[146]] = y."Search";
        y.llIIIIll[y.llIIlIll[147]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[148]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[149]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[150]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[151]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[152]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[153]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[154]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[155]] = y."Nav to last room";
        y.llIIIIll[y.llIIlIll[156]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[157]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[158]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[159]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[160]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[161]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[162]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[163]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[164]] = y."Door";
        y.llIIIIll[y.llIIlIll[166]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[167]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[168]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[169]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[170]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[171]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[172]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[173]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[174]] = y."Door";
        y.llIIIIll[y.llIIlIll[175]] = y."Open";
        y.llIIIIll[y.llIIlIll[176]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[177]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[178]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[179]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[180]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[181]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[182]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[183]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[184]] = y."Nav to SE Pillar";
        y.llIIIIll[y.llIIlIll[185]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[186]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[187]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[188]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[189]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[190]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[191]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[192]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[193]] = y."Using runes";
        y.llIIIIll[y.llIIlIll[194]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[195]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[196]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[197]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[198]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[199]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[201]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[202]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[203]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[204]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[205]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[206]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[207]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[208]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[209]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[210]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[211]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[212]] = y."Using runes";
        y.llIIIIll[y.llIIlIll[213]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[214]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[215]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[216]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[217]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[218]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[219]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[220]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[221]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[222]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[223]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[224]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[225]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[226]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[227]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[228]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[229]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[230]] = y."Using runes";
        y.llIIIIll[y.llIIlIll[231]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[232]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[233]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[234]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[235]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[236]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[237]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[238]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[239]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[240]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[241]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[242]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[243]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[244]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[245]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[246]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[247]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[248]] = y."Using runes";
        y.llIIIIll[y.llIIlIll[249]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[250]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[251]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[252]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[8]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[253]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[254]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[255]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[256]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[257]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[258]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[259]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[260]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[261]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[262]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[263]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[264]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[265]] = y."Using runes";
        y.llIIIIll[y.llIIlIll[266]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[267]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[268]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[269]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[270]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[271]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[272]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[273]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[274]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[275]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[276]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[277]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[278]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[279]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[280]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[281]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[282]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[283]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[284]] = y."Glarial's amulet";
        y.llIIIIll[y.llIIlIll[285]] = y."Glarial's urn";
        y.llIIIIll[y.llIIlIll[286]] = y."Using runes";
        y.llIIIIll[y.llIIlIll[287]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[288]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[289]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[290]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[291]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[292]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[293]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[294]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[295]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[296]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[297]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[298]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[299]] = y."Air rune";
        y.llIIIIll[y.llIIlIll[300]] = y."Earth rune";
        y.llIIIIll[y.llIIlIll[301]] = y."Water rune";
        y.llIIIIll[y.llIIlIll[302]] = y."Putting neck on statue";
        y.llIIIIll[y.llIIlIll[305]] = y."Putting ashes inside";
        y.llIIIIll[y.llIIlIll[308]] = y."Chalice";
        y.llIIIIll[y.llIIlIll[309]] = y."Statue of Glarial";
        y.llIIIIll[y.llIIlIll[310]] = y."Pillar";
        y.llIIIIll[y.llIIlIll[311]] = y."Teleporting to CW";
        y.llIIIIll[y.llIIlIll[312]] = y."Wear";
        y.llIIIIll[y.llIIlIll[313]] = y."Castle Wars";
        y.llIIIIll[y.llIIlIll[314]] = y."Rope";
        y.llIIIIll[y.llIIlIll[325]] = y."Waterfall quest";
        y.llIIIIll[y.llIIlIll[326]] = y."ring of wealth (";
        y.llIIIIll[y.llIIlIll[327]] = y."Stalagmite";
        y.llIIIIll[y.llIIlIll[328]] = y."Games";
        y.llIIIIll[y.llIIlIll[329]] = y."Games";
        y.llIIIIll[y.llIIlIll[330]] = y."Games";
        y.llIIIIll[y.llIIlIll[331]] = y."dueling";
        y.llIIIIll[y.llIIlIll[332]] = y."dueling";
        y.llIIIIll[y.llIIlIll[40]] = y."dueling";
        y.llIIIIll[y.llIIlIll[41]] = y."dueling";
        y.llIIIIll[y.llIIlIll[304]] = y."dueling";
        y.llIIIIll[y.llIIlIll[307]] = y."How can I help?";
        y.llIIIIll[y.llIIlIll[402]] = y."I'm always happy to help a cook in distress.";
        y.llIIIIll[y.llIIlIll[143]] = y."Yes.";
        y.llIIIIll[y.llIIlIll[403]] = y."Golrie";
        y.llIIIIll[y.llIIlIll[404]] = y."Hudon";
        y.llIIIIll[y.llIIlIll[405]] = y."Almera";
    }

    private static void lIlIIllIlIl() {
        llIIlIll = new int[414];
        y.llIIlIll[0] = (85 + 18 - 79 + 103 ^ (0xF5 ^ 0xB6)) & (0x7C ^ 0x30 ^ (7 ^ 0x77) ^ -1);
        y.llIIlIll[1] = 1;
        y.llIIlIll[2] = 0x33 ^ 0x39 ^ (0x74 ^ 0x4C);
        y.llIIlIll[3] = 2;
        y.llIIlIll[4] = 0x46 ^ 0x3C ^ (0x7B ^ 0xF);
        y.llIIlIll[5] = 3;
        y.llIIlIll[6] = 0x32 ^ 0x71 ^ (0x60 ^ 0x27);
        y.llIIlIll[7] = 0x9F ^ 0x9A;
        y.llIIlIll[8] = (0x49 ^ 0x42) + (36 + 131 - -36 + 1) - (0xC7 ^ 0xAC) + (0x45 ^ 0x33);
        y.llIIlIll[9] = 57 + 59 - -73 + 8 ^ 98 + 140 - 218 + 174;
        y.llIIlIll[10] = 0xB9 ^ 0x92 ^ (0xE9 ^ 0x83);
        y.llIIlIll[11] = 0x82 ^ 0x84;
        y.llIIlIll[12] = -(0xFFFFF7FE & 0x6839) & (0xFFFFFFFF & 0x73BF);
        y.llIIlIll[13] = 167 + 93 - 247 + 192 ^ 195 + 93 - 93 + 2;
        y.llIIlIll[14] = 0xFFFFA2BF & 0x5F6B;
        y.llIIlIll[15] = 0xFFFF922E & 0x6FFD;
        y.llIIlIll[16] = -(0xFFFFFB73 & 0x1DDD) & (0xFFFF9FFD & 0x7B7F);
        y.llIIlIll[17] = 0xB7 ^ 0xBE;
        y.llIIlIll[18] = 0xFFFFF7FA & 0xBBF;
        y.llIIlIll[19] = 0x2E ^ 0x24;
        y.llIIlIll[20] = 0xFFFF978D & 0x69F3;
        y.llIIlIll[21] = 0xCA ^ 0xC1;
        y.llIIlIll[22] = 0x17 ^ 0x1B;
        y.llIIlIll[23] = 0x49 ^ 0x4C ^ (0x13 ^ 0x1B);
        y.llIIlIll[24] = -(0xFFFFFF06 & 0x70FB) & (0xFFFFFDF9 & 0x7BFF);
        y.llIIlIll[25] = 0x2B ^ 0x39;
        y.llIIlIll[26] = 0xB0 ^ 0xBF;
        y.llIIlIll[27] = 16 + 84 - -48 + 16 ^ 155 + 143 - 121 + 3;
        y.llIIlIll[28] = 0x75 ^ 0x64;
        y.llIIlIll[29] = 12 + 140 - 94 + 86 ^ 115 + 80 - 194 + 130;
        y.llIIlIll[30] = 0xB1 ^ 0xA5;
        y.llIIlIll[31] = -(0xFFFFCDF7 & 0x7A29) & (0xFFFFFFED & 0x4FF7);
        y.llIIlIll[32] = 0x22 ^ 0x34 ^ 3;
        y.llIIlIll[33] = 129 + 11 - 68 + 67 ^ 11 + 105 - 12 + 53;
        y.llIIlIll[34] = 0x4E ^ 0x18 ^ (0xD5 ^ 0x94);
        y.llIIlIll[35] = 0x33 ^ 0x2B;
        y.llIIlIll[36] = -1;
        y.llIIlIll[37] = 0xD5 ^ 0xC5 ^ (0xF ^ 6);
        y.llIIlIll[38] = 0x15 ^ 0x3C ^ (0x9F ^ 0xAC);
        y.llIIlIll[39] = 0x85 ^ 0x9E;
        y.llIIlIll[40] = 0xFFFFF3ED & 0xD37;
        y.llIIlIll[41] = -(0xFFFFFCFA & 0x63DF) & (0xFFFFE3FF & 0x7DFF);
        y.llIIlIll[42] = 62 + 21 - 58 + 111 ^ 63 + 142 - 155 + 98;
        y.llIIlIll[43] = 0x4D ^ 0x50;
        y.llIIlIll[44] = 74 + 35 - -14 + 96 ^ 146 + 141 - 193 + 103;
        y.llIIlIll[45] = 0x53 ^ 0x4C;
        y.llIIlIll[46] = 4 ^ 0x24;
        y.llIIlIll[47] = -(0xFFFFF873 & 0x4FFD) & (0xFFFFDEFA & 0x7DF7);
        y.llIIlIll[48] = 136 + 70 - 130 + 106 ^ 18 + 39 - 26 + 120;
        y.llIIlIll[49] = 0xFFFFC7E6 & 0x3FDF;
        y.llIIlIll[50] = 0x18 ^ 0x3A;
        y.llIIlIll[51] = 74 + 75 - 76 + 63 ^ 139 + 149 - 260 + 143;
        y.llIIlIll[52] = 0x57 ^ 0x73;
        y.llIIlIll[53] = 0xFFFFADFD & 0x776A;
        y.llIIlIll[54] = 0x29 ^ 0xC;
        y.llIIlIll[55] = 0xFFFFA7EF & 0x5FD7;
        y.llIIlIll[56] = 0x69 ^ 0x4F;
        y.llIIlIll[57] = 0x40 ^ 0x2A ^ (0x1B ^ 0x56);
        y.llIIlIll[58] = 6 ^ 0x2E;
        y.llIIlIll[59] = 0xFD ^ 0x98 ^ (0xFD ^ 0xB1);
        y.llIIlIll[60] = 0x10 ^ 0x4C ^ (0x1C ^ 0x6A);
        y.llIIlIll[61] = 0x4B ^ 0x60;
        y.llIIlIll[62] = 0x1A ^ 0x41 ^ (0x43 ^ 0x34);
        y.llIIlIll[63] = 0x6E ^ 0x43;
        y.llIIlIll[64] = 0x2B ^ 0x70 ^ (0xC2 ^ 0xB7);
        y.llIIlIll[65] = 0xFFFF97D9 & 0x6FEE;
        y.llIIlIll[66] = 0xFFFFA75E & 0x7DBD;
        y.llIIlIll[67] = 0x54 ^ 0x26 ^ (0x31 ^ 0x6C);
        y.llIIlIll[68] = 0x4B ^ 0x7B;
        y.llIIlIll[69] = 0xFF ^ 0xA0 ^ (0x61 ^ 0xF);
        y.llIIlIll[70] = 0xFFFFCFFF & 0x37CA;
        y.llIIlIll[71] = 0x84 ^ 0xB7;
        y.llIIlIll[72] = 0xFFFFD7EF & 0x2FDB;
        y.llIIlIll[73] = 0x6B ^ 0x27 ^ (0xF8 ^ 0x80);
        y.llIIlIll[74] = 0x38 ^ 0xD;
        y.llIIlIll[75] = 159 + 103 - 146 + 128 ^ 65 + 72 - 3 + 60;
        y.llIIlIll[76] = 0xC1 ^ 0x9A ^ (0x2D ^ 0x41);
        y.llIIlIll[77] = 0xFD ^ 0xB4 ^ (0x2A ^ 0x5B);
        y.llIIlIll[78] = 0x74 ^ 0x4D;
        y.llIIlIll[79] = 80 + 88 - 22 + 1 ^ 106 + 3 - 38 + 98;
        y.llIIlIll[80] = 133 + 148 - 135 + 40 ^ 20 + 16 - -78 + 15;
        y.llIIlIll[81] = -(0xFFFFB137 & 0x7EFB) & (0xFFFFB7FB & Short.MAX_VALUE);
        y.llIIlIll[82] = 0x58 ^ 0x64;
        y.llIIlIll[83] = 0x43 ^ 0x7E;
        y.llIIlIll[84] = 70 + 81 - 75 + 61 ^ 21 + 56 - 74 + 180;
        y.llIIlIll[85] = 93 + 14 - 23 + 53 ^ 172 + 38 - 106 + 78;
        y.llIIlIll[86] = 0x53 ^ 0x66 ^ (0x67 ^ 0x12);
        y.llIIlIll[87] = 0x76 ^ 0x36 ^ 2;
        y.llIIlIll[88] = 0x69 ^ 0x2A;
        y.llIIlIll[89] = 0xF0 ^ 0xB4;
        y.llIIlIll[90] = 0x35 ^ 0x70;
        y.llIIlIll[91] = 0x2E ^ 0x68;
        y.llIIlIll[92] = 4 ^ 0x23 ^ (0xC ^ 0x6C);
        y.llIIlIll[93] = 0x6F ^ 0x27;
        y.llIIlIll[94] = 0xE9 ^ 0xA0;
        y.llIIlIll[95] = 139 + 70 - 136 + 70 ^ 56 + 60 - 6 + 87;
        y.llIIlIll[96] = 0xE7 ^ 0xAC;
        y.llIIlIll[97] = 165 + 235 - 167 + 18 ^ 135 + 144 - 149 + 53;
        y.llIIlIll[98] = 2 ^ 0x4F;
        y.llIIlIll[99] = 0xD7 ^ 0xA3 ^ (0x81 ^ 0xBB);
        y.llIIlIll[100] = 106 + 34 - 94 + 91 ^ 64 + 159 - 44 + 19;
        y.llIIlIll[101] = 152 + 195 - 133 + 40 ^ 105 + 29 - 58 + 98;
        y.llIIlIll[102] = 0x90 ^ 0xC1;
        y.llIIlIll[103] = 0xD7 ^ 0x85;
        y.llIIlIll[104] = 0x76 ^ 0x25;
        y.llIIlIll[105] = 0xF8 ^ 0xAC;
        y.llIIlIll[106] = 0x34 ^ 0x61;
        y.llIIlIll[107] = 154 + 231 - 320 + 185 ^ 157 + 13 - 115 + 117;
        y.llIIlIll[108] = 2 ^ 0x55;
        y.llIIlIll[109] = 0x5B ^ 0x27 ^ (0x26 ^ 2);
        y.llIIlIll[110] = 0x50 ^ 0x65 ^ (0x42 ^ 0x2E);
        y.llIIlIll[111] = 54 + 137 - 5 + 33 ^ 114 + 26 - 84 + 73;
        y.llIIlIll[112] = 0x81 ^ 0x8F ^ (0x50 ^ 5);
        y.llIIlIll[113] = 0xA0 ^ 0x8D ^ (0x7F ^ 0xE);
        y.llIIlIll[114] = 0x75 ^ 0x18 ^ (0x5F ^ 0x6F);
        y.llIIlIll[115] = 0x2E ^ 0x70;
        y.llIIlIll[116] = 0x69 ^ 0x36;
        y.llIIlIll[117] = 0xEC ^ 0x8C;
        y.llIIlIll[118] = 0xCD ^ 0xAC;
        y.llIIlIll[119] = 0xA4 ^ 0x95 ^ (0xC1 ^ 0x92);
        y.llIIlIll[120] = 0xD6 ^ 0xB5;
        y.llIIlIll[121] = 0xF8 ^ 0x8D ^ (0xA ^ 0x1B);
        y.llIIlIll[122] = 0xA9 ^ 0x99 ^ (0x37 ^ 0x62);
        y.llIIlIll[123] = 0xC4 ^ 0xAF ^ (0x19 ^ 0x14);
        y.llIIlIll[124] = 0x67 ^ 0x31 ^ (0x6A ^ 0x5B);
        y.llIIlIll[125] = 0xE0 ^ 0x88;
        y.llIIlIll[126] = 0x43 ^ 0x2A;
        y.llIIlIll[127] = 0xCC ^ 0xA6;
        y.llIIlIll[128] = 0xFFFFFFDD & 0x1B7A;
        y.llIIlIll[129] = 0xDD ^ 0xB6;
        y.llIIlIll[130] = 0xFFFF9FE6 & 0x67FD;
        y.llIIlIll[131] = 136 + 228 - 286 + 176 ^ 96 + 109 - 90 + 31;
        y.llIIlIll[132] = 75 + 141 - 178 + 212 ^ 24 + 128 - 138 + 137;
        y.llIIlIll[133] = 0x5C ^ 0x32;
        y.llIIlIll[134] = 0x3B ^ 0x54;
        y.llIIlIll[135] = 0xC1 ^ 0xB1;
        y.llIIlIll[136] = 0x38 ^ 0x49;
        y.llIIlIll[137] = 148 + 90 - 230 + 221 ^ 63 + 1 - -30 + 57;
        y.llIIlIll[138] = 0x3B ^ 0x48;
        y.llIIlIll[139] = 0xEF ^ 0x9B;
        y.llIIlIll[140] = 5 ^ 0x70;
        y.llIIlIll[141] = 0x16 ^ 0x25 ^ (0x50 ^ 0x15);
        y.llIIlIll[142] = 0x40 ^ 6 ^ (0x99 ^ 0xA8);
        y.llIIlIll[143] = -(0xFFFF9646 & 0x7DFF) & (0xFFFFD7FF & 0x3D6F);
        y.llIIlIll[144] = 0x25 ^ 0x5D;
        y.llIIlIll[145] = 0xFFFFE7EF & 0x1FDF;
        y.llIIlIll[146] = 6 ^ 0x7F;
        y.llIIlIll[147] = 0x1D ^ 0x67;
        y.llIIlIll[148] = 0xD0 ^ 0xAB;
        y.llIIlIll[149] = 76 + 211 - 227 + 157 ^ 113 + 74 - 155 + 133;
        y.llIIlIll[150] = 0x4C ^ 0x43 ^ (0x51 ^ 0x23);
        y.llIIlIll[151] = 0x2A ^ 0x54;
        y.llIIlIll[152] = (0xC2 ^ 0x9D) + (0x4B ^ 0x5D) - (0xA2 ^ 0xA5) + (0x73 ^ 0x62);
        y.llIIlIll[153] = (0x71 ^ 0x1C) + (0xA ^ 0x6A) - (0xEE ^ 0x8D) + (0x67 ^ 0x71);
        y.llIIlIll[154] = 90 + 93 - 118 + 64;
        y.llIIlIll[155] = (0xB2 ^ 0x8F) + (0x41 ^ 0x1F) - (32 + 23 - 21 + 107) + (0x6A ^ 0x1E);
        y.llIIlIll[156] = 43 + 64 - 72 + 96;
        y.llIIlIll[157] = (0x5D ^ 0xF) + (0x2E ^ 0x19) - (0xC3 ^ 0x9E) + (0xD5 ^ 0x8D);
        y.llIIlIll[158] = 27 + 69 - 42 + 79;
        y.llIIlIll[159] = 5 + 120 - 115 + 124;
        y.llIIlIll[160] = (0x63 ^ 0x2A) + (0x3C ^ 6) - (0x22 ^ 0xA) + (0x67 ^ 0x4B);
        y.llIIlIll[161] = (0x77 ^ 0x10) + (7 ^ 0x19) - (0x10 ^ 9) + (0xAC ^ 0xB0);
        y.llIIlIll[162] = 128 + 43 - 44 + 10;
        y.llIIlIll[163] = 56 + 54 - 37 + 65;
        y.llIIlIll[164] = (0x32 ^ 0x2A) + (0x38 ^ 0x54) - (5 ^ 0x3A) + (0xC1 ^ 0x87);
        y.llIIlIll[165] = 0xFFFFE5FE & 0x3B35;
        y.llIIlIll[166] = 78 + 78 - 29 + 13;
        y.llIIlIll[167] = 89 + 11 - 97 + 138;
        y.llIIlIll[168] = 110 + 128 - 216 + 120;
        y.llIIlIll[169] = (0x1A ^ 0x2C) + (9 ^ 0x11) - -(0x6E ^ 0x79) + (0xA6 ^ 0x8C);
        y.llIIlIll[170] = 99 + 106 - 187 + 126;
        y.llIIlIll[171] = (0x47 ^ 0x5C) + (0x17 ^ 0x38) - -(0x3F ^ 6) + (0x15 ^ 0x1B);
        y.llIIlIll[172] = 61 + 38 - 94 + 130 + (0x13 ^ 0xB) - (0xFD ^ 0xBB) + (0x94 ^ 0xAD);
        y.llIIlIll[173] = (0x2B ^ 0x7A) + (0xE8 ^ 0x85) - (0x39 ^ 0x77) + (0x33 ^ 0x10);
        y.llIIlIll[174] = 96 + 53 - 17 + 16;
        y.llIIlIll[175] = (0x7B ^ 0xE) + (0xF5 ^ 0x87) - (25 + 150 - 19 + 51) + (0x2F ^ 0x52);
        y.llIIlIll[176] = 13 + 12 - -115 + 10;
        y.llIIlIll[177] = 82 + 119 - 72 + 22;
        y.llIIlIll[178] = (0x61 ^ 0x11) + (0xA ^ 0x27) - (0x9B ^ 0x84) + (0x80 ^ 0x9A);
        y.llIIlIll[179] = 61 + 82 - 129 + 139;
        y.llIIlIll[180] = 2 + (140 + 79 - 217 + 141) - (0x5C ^ 8) + (0xD1 ^ 0x8C);
        y.llIIlIll[181] = (0xF9 ^ 0x84) + (0x7F ^ 0x35) - (0xF4 ^ 0x8D) + (0xD3 ^ 0x9E);
        y.llIIlIll[182] = (0x13 ^ 0x76) + (0x77 ^ 0x66) - (0x2F ^ 0x4E) + (0 + 67 - 0 + 68);
        y.llIIlIll[183] = (0x2C ^ 0x36) + (36 + 110 - 141 + 148) - (0x24 ^ 6) + (0x5E ^ 0x52);
        y.llIIlIll[184] = 66 + 95 - 74 + 71;
        y.llIIlIll[185] = 68 + 110 - 57 + 16 + (3 + 87 - 13 + 73) - (0xFFFFE936 & 0x17CD) + (20 + 13 - 28 + 127);
        y.llIIlIll[186] = 112 + 44 - 12 + 16;
        y.llIIlIll[187] = 77 + 97 - 45 + 32;
        y.llIIlIll[188] = 43 + 72 - 99 + 146;
        y.llIIlIll[189] = 66 + 89 - 148 + 156;
        y.llIIlIll[190] = 85 + 60 - 109 + 128;
        y.llIIlIll[191] = 7 + 57 - -99 + 2;
        y.llIIlIll[192] = 146 + 150 - 214 + 84;
        y.llIIlIll[193] = (0x6F ^ 0x4D) + (19 + 148 - 70 + 56) - (0x7D ^ 0) + (0xE8 ^ 0x81);
        y.llIIlIll[194] = (0xEB ^ 0x89) + (0x6E ^ 0xE) - (123 + 145 - 177 + 83) + (40 + 147 - 100 + 61);
        y.llIIlIll[195] = (0x88 ^ 0x83) + (0x81 ^ 0xA4) - -(0x7A ^ 0x41) + (0x59 ^ 0x67);
        y.llIIlIll[196] = 100 + 163 - 115 + 22;
        y.llIIlIll[197] = (0xD4 ^ 0xB3) + (0xB1 ^ 0x9E) - (0x8D ^ 0x88) + (0xB2 ^ 0xA8);
        y.llIIlIll[198] = 55 + 89 - 77 + 103 + (0x4B ^ 0x4E) - (58 + 31 - 17 + 81) + (31 + 44 - 25 + 100);
        y.llIIlIll[199] = 154 + 121 - 134 + 32;
        y.llIIlIll[200] = -(0xFFFFF3B9 & 0x1C6F) & (0xFFFFD7FF & 0x3FFD);
        y.llIIlIll[201] = 119 + 86 - 154 + 123;
        y.llIIlIll[202] = (7 ^ 0x52) + (0x9C ^ 0x8F) - (0x77 ^ 0x54) + (0xF9 ^ 0x93);
        y.llIIlIll[203] = (7 ^ 0xC) + (56 + 23 - -11 + 60) - (155 + 83 - 119 + 40) + (49 + 18 - -18 + 89);
        y.llIIlIll[204] = (0x73 ^ 0x74) + (27 + 66 - 14 + 49) - (0x64 ^ 0x39) + (46 + 11 - 54 + 132);
        y.llIIlIll[205] = (0x7D ^ 0x3B) + (2 ^ 0x19) - (0x95 ^ 0x9F) + (0x59 ^ 2);
        y.llIIlIll[206] = 30 + 80 - 57 + 126;
        y.llIIlIll[207] = 102 + 90 - 54 + 42;
        y.llIIlIll[208] = 114 + 23 - 15 + 13 + (121 + 47 - 161 + 161) - (92 + 31 - 44 + 69) + (0xB ^ 0x11);
        y.llIIlIll[209] = 128 + 34 - 38 + 58;
        y.llIIlIll[210] = 15 + 72 - 81 + 177;
        y.llIIlIll[211] = 81 + 0 - 45 + 110 + (0x3E ^ 0x2F) - (0x3D ^ 0x7A) + (0xE7 ^ 0xBB);
        y.llIIlIll[212] = 51 + 144 - 191 + 181;
        y.llIIlIll[213] = 67 + 139 - 106 + 86;
        y.llIIlIll[214] = 136 + 175 - 280 + 156;
        y.llIIlIll[215] = 5 + 114 - -46 + 23;
        y.llIIlIll[216] = 147 + 16 - -2 + 24;
        y.llIIlIll[217] = 22 + 38 - -2 + 112 + (115 + 138 - 70 + 0) - (76 + 71 - 52 + 93) + (0x92 ^ 0x87);
        y.llIIlIll[218] = (0x2A ^ 2) + (0x2A ^ 0x6F) - (0xCE ^ 0xAF) + (119 + 76 - 57 + 41);
        y.llIIlIll[219] = 0 + 110 - -2 + 80;
        y.llIIlIll[220] = (0x4B ^ 0x2B) + (0xEF ^ 0xC7) - -(0x4C ^ 0x7C) + (0xAB ^ 0xA2);
        y.llIIlIll[221] = (0x72 ^ 0x74) + (83 + 90 - 36 + 49) - (113 + 5 - -10 + 19) + (8 + 15 - -38 + 88);
        y.llIIlIll[222] = (0x55 ^ 0x78) + (97 + 54 - 146 + 150) - (85 + 69 - 59 + 102) + (44 + 65 - 95 + 178);
        y.llIIlIll[223] = 95 + 143 - 59 + 17;
        y.llIIlIll[224] = 116 + 169 - 283 + 195;
        y.llIIlIll[225] = 44 + 170 - 95 + 79;
        y.llIIlIll[226] = 160 + 19 - 34 + 27 + (102 + 119 - 180 + 108) - (70 + 102 - 62 + 37) + (0x5F ^ 0x46);
        y.llIIlIll[227] = 157 + 42 - 56 + 57;
        y.llIIlIll[228] = 0 + 133 - 79 + 147;
        y.llIIlIll[229] = 156 + 95 - 171 + 122;
        y.llIIlIll[230] = 160 + 111 - 83 + 15;
        y.llIIlIll[231] = (0x32 ^ 0x72) + (149 + 67 - 194 + 137) - (0x2E ^ 0x7A) + (0x70 ^ 0x31);
        y.llIIlIll[232] = 60 + 103 - 129 + 171;
        y.llIIlIll[233] = 75 + 134 - 117 + 71 + (20 + 32 - -49 + 62) - (0xFFFF8B5B & 0x75A5) + (131 + 130 - 133 + 9);
        y.llIIlIll[234] = 177 + 102 - 236 + 164;
        y.llIIlIll[235] = 68 + 205 - 213 + 148;
        y.llIIlIll[236] = 112 + 189 - 183 + 91;
        y.llIIlIll[237] = 15 + 104 - 116 + 207;
        y.llIIlIll[238] = 133 + 67 - 154 + 165;
        y.llIIlIll[239] = 63 + 32 - -3 + 60 + (0x6F ^ 0x4F) - (0x1C ^ 0x12) + (0x96 ^ 0xB2);
        y.llIIlIll[240] = (0x1B ^ 7) + (0x5B ^ 0x6C) - (0x2B ^ 0xE) + (60 + 26 - -14 + 67);
        y.llIIlIll[241] = (0x42 ^ 0x26) + (0x55 ^ 0x14) - (0x3F ^ 0x2A) + (0x6F ^ 0x29);
        y.llIIlIll[242] = (0x50 ^ 0x64) + (26 + 126 - 113 + 103) - (17 + 16 - -64 + 39) + (61 + 41 - 8 + 63);
        y.llIIlIll[243] = 61 + 21 - -50 + 84;
        y.llIIlIll[244] = 106 + 82 - 67 + 96;
        y.llIIlIll[245] = (0xDE ^ 0x89) + (0x23 ^ 0x7A) - (89 + 141 - 197 + 109) + (49 + 79 - 84 + 140);
        y.llIIlIll[246] = (0x24 ^ 0) + (161 + 7 - 37 + 66) - (82 + 125 - 58 + 33) + (113 + 84 - 82 + 53);
        y.llIIlIll[247] = 57 + 184 - 31 + 10;
        y.llIIlIll[248] = 120 + 38 - 107 + 92 + (0x7E ^ 0x24) - (79 + 171 - 224 + 194) + (9 + 60 - -135 + 4);
        y.llIIlIll[249] = 66 + 51 - -105 + 0;
        y.llIIlIll[250] = 9 + 113 - -27 + 65 + (0x58 ^ 0x19) - (121 + 146 - 126 + 74) + (143 + 23 - 128 + 121);
        y.llIIlIll[251] = 11 + 88 - -39 + 86;
        y.llIIlIll[252] = 123 + 187 - 101 + 16;
        y.llIIlIll[253] = 88 + 166 - 171 + 144;
        y.llIIlIll[254] = (0xCD ^ 0xA9) + (0xB4 ^ 0xC5) - (0x2C ^ 0x15) + (0x68 ^ 0x20);
        y.llIIlIll[255] = 178 + 192 - 318 + 177;
        y.llIIlIll[256] = (0x3A ^ 0x4C) + (133 + 96 - 166 + 86) - (138 + 115 - 241 + 139) + (0x2E ^ 0x5C);
        y.llIIlIll[257] = 174 + 229 - 187 + 15;
        y.llIIlIll[258] = 210 + 95 - 263 + 190;
        y.llIIlIll[259] = 163 + 195 - 175 + 50;
        y.llIIlIll[260] = 181 + 175 - 345 + 223;
        y.llIIlIll[261] = 8 + 56 - -128 + 43;
        y.llIIlIll[262] = 225 + 39 - 247 + 219;
        y.llIIlIll[263] = 174 + 152 - 281 + 192;
        y.llIIlIll[264] = (0x6F ^ 0x3D) + (0xA2 ^ 0x81) - -(0xD5 ^ 0xA0) + (0xC1 ^ 0xC5);
        y.llIIlIll[265] = (0xD8 ^ 0x95) + (0xAE ^ 0xBF) - -(126 + 21 - 23 + 15) + (0xC ^ 0xA);
        y.llIIlIll[266] = 186 + 183 - 161 + 32;
        y.llIIlIll[267] = 2 + 156 - 48 + 103 + (53 + 135 - 116 + 110) - (160 + 114 - 217 + 111) + (0xBD ^ 0xB3);
        y.llIIlIll[268] = 147 + 86 - 68 + 77;
        y.llIIlIll[269] = 176 + 158 - 190 + 99;
        y.llIIlIll[270] = 171 + 77 - 182 + 147 + (69 + 137 - 85 + 91) - (0xFFFFB7A7 & 0x49F9) + (7 + 182 - -30 + 17);
        y.llIIlIll[271] = (0x7F ^ 0x6C) + (0x21 ^ 0x3E) - -(0x1E ^ 0xC) + (17 + 92 - 63 + 131);
        y.llIIlIll[272] = 29 + 137 - 21 + 53 + (0 ^ 9) - (0x61 ^ 9) + (79 + 139 - 155 + 80);
        y.llIIlIll[273] = 88 + 230 - 170 + 99;
        y.llIIlIll[274] = 231 + 239 - 450 + 228;
        y.llIIlIll[275] = 17 + 77 - -61 + 94;
        y.llIIlIll[276] = (0x7A ^ 0x22) + (157 + 137 - 245 + 131) - (71 + 141 - 117 + 123) + (182 + 68 - 179 + 129);
        y.llIIlIll[277] = 158 + 94 - 155 + 66 + (94 + 136 - 169 + 82) - (93 + 141 - 219 + 215) + (82 + 78 - -3 + 12);
        y.llIIlIll[278] = 54 + 119 - 2 + 81;
        y.llIIlIll[279] = 123 + 252 - 292 + 170;
        y.llIIlIll[280] = 143 + 28 - 168 + 251;
        y.llIIlIll[281] = (0x57 ^ 0x7C) + (203 + 5 - 155 + 179) - (144 + 89 - 95 + 71) + (61 + 87 - 108 + 149);
        y.llIIlIll[282] = 0xFFFFE12A & 0x1FD5;
        y.llIIlIll[283] = -(0xFFFFFA9B & 0x1FF5) & (0xFFFF9FFD & 0x7B93);
        y.llIIlIll[284] = 0xFFFFEF93 & 0x116E;
        y.llIIlIll[285] = 0xFFFFBF67 & 0x419B;
        y.llIIlIll[286] = -(0xFFFF9A6D & 0x7DBB) & (0xFFFFFD2D & 0x1BFE);
        y.llIIlIll[287] = -(0xFFFFEFF7 & 0x123B) & (0xFFFFBB3F & 0x47F7);
        y.llIIlIll[288] = 0xFFFFF73F & 0x9C6;
        y.llIIlIll[289] = 0xFFFF8367 & 0x7D9F;
        y.llIIlIll[290] = -(0xFFFFBFFE & 0x4AB9) & (0xFFFFBBFF & 0x4FBF);
        y.llIIlIll[291] = -(0xFFFF9FF7 & 0x780B) & (0xFFFF99BB & 0x7F4F);
        y.llIIlIll[292] = 0xFFFFCDAF & 0x335A;
        y.llIIlIll[293] = 0xFFFFFD5F & 0x3AB;
        y.llIIlIll[294] = -(0xFFFFFC36 & 0x6FEB) & (0xFFFFFDAD & 0x6F7F);
        y.llIIlIll[295] = 0xFFFFD93F & 0x27CD;
        y.llIIlIll[296] = 0xFFFF89AE & 0x775F;
        y.llIIlIll[297] = 0xFFFFC17F & 0x3F8F;
        y.llIIlIll[298] = -(0xFFFFBE7B & 0x5F85) & (0xFFFFFFB1 & 0x1F5E);
        y.llIIlIll[299] = 0xFFFFFD95 & 0x37B;
        y.llIIlIll[300] = 0xFFFFD393 & 0x2D7E;
        y.llIIlIll[301] = 0xFFFF8997 & 0x777B;
        y.llIIlIll[302] = -(0xFFFFF7DB & 0x2CEF) & (0xFFFFB5FE & 0x6FDF);
        y.llIIlIll[303] = -(0xFFFFB8CF & 0x7739) & (0xFFFFFFDE & 0x37FF);
        y.llIIlIll[304] = 0xFFFF9DFF & 0x6327;
        y.llIIlIll[305] = 0xFFFF9D57 & 0x63BD;
        y.llIIlIll[306] = 0xFFFFAFDE & 0x57FF;
        y.llIIlIll[307] = 0xFFFFDFA8 & 0x217F;
        y.llIIlIll[308] = 0xFFFFD977 & 0x279E;
        y.llIIlIll[309] = -(0xFFFFFEFF & 0x7F61) & (0xFFFFFFFF & 0x7F77);
        y.llIIlIll[310] = 0xFFFFD57E & 0x2B99;
        y.llIIlIll[311] = -(0xFFFFFBB5 & 0x6EEB) & (0xFFFFEFFD & 0x7BBB);
        y.llIIlIll[312] = -(0xFFFFDAFF & 0x3F86) & (0xFFFF9B9F & Short.MAX_VALUE);
        y.llIIlIll[313] = -(0xFFFFFD87 & 0x6EFD) & (0xFFFFEDDF & 0x7FBF);
        y.llIIlIll[314] = 0xFFFFAD5E & 0x53BD;
        y.llIIlIll[315] = -(0xFFFFEE4A & 0x35F7) & (0xFFFFBFFF & 0x6FF9);
        y.llIIlIll[316] = -(0xFFFFE2D5 & 0x5F2B) & (0xFFFFF373 & 0x7FDD);
        y.llIIlIll[317] = -(0xFFFF9B1F & 0x74F3) & (0xFFFFF3FE & 0x1FFB);
        y.llIIlIll[318] = -(0xFFFFF8DF & 0x3761) & (0xFFFFFFDD & 0x3F6F);
        y.llIIlIll[319] = -(0xFFFFD877 & 0x67AD) & (0xFFFFD7F7 & 0x6FFC);
        y.llIIlIll[320] = -(0xFFFFE7FD & 0x5C27) & (0xFFFFFEBC & Short.MAX_VALUE);
        y.llIIlIll[321] = -(0xFFFF9137 & 0x6FFB) & (0xFFFFEFFE & 0x3FFF);
        y.llIIlIll[322] = -(0xFFFFB1DD & 0x7FB6) & (0xFFFFF3FF & 0x7FFB);
        y.llIIlIll[323] = -(0xFFFFEBB9 & 0x34EF) & (0xFFFFBFEF & Short.MAX_VALUE);
        y.llIIlIll[324] = 0xFFFFEF14 & 0x15FF;
        y.llIIlIll[325] = 0xFFFF8BFF & 0x751D;
        y.llIIlIll[326] = -(0xFFFFDFF7 & 0x70CA) & (0xFFFFF7FF & 0x59DF);
        y.llIIlIll[327] = 0xFFFFCF7F & 0x319F;
        y.llIIlIll[328] = 0xFFFF892E & 0x77F1;
        y.llIIlIll[329] = 0xFFFFE96D & 0x17B3;
        y.llIIlIll[330] = 0xFFFFC722 & 0x39FF;
        y.llIIlIll[331] = -(0xFFFFFFCF & 0x66F1) & (0xFFFFFFEB & 0x67F7);
        y.llIIlIll[332] = -(0xFFFFBCF7 & 0x7359) & (0xFFFFB7F7 & 0x797C);
        y.llIIlIll[333] = -(0xFFFFDCBB & 0x7375) & (0xFFFFFFBF & 0x5F7F);
        y.llIIlIll[334] = 0xFFFFDFD1 & 0x2F3F;
        y.llIIlIll[335] = 0xFFFFBF3F & 0x4FD3;
        y.llIIlIll[336] = -(85 + 79 - 124 + 161) & (0xFFFFEFDD & 0x1FFF);
        y.llIIlIll[337] = 0xFFFFEFFF & 0x1F17;
        y.llIIlIll[338] = -(0xFFFFDFFF & 0x70E5) & (0xFFFFFFFF & 0x5FFD);
        y.llIIlIll[339] = -(0xFFFFA947 & 0x76FD) & (0xFFFFBF7F & 0x6FDF);
        y.llIIlIll[340] = -(0xFFFFD2DD & 0x6FA3) & (0xFFFFF7FB & 0x7BD7);
        y.llIIlIll[341] = 0xFFFFFBFF & 0x3555;
        y.llIIlIll[342] = 0xFFFFF177 & 0x3FDF;
        y.llIIlIll[343] = -(0xFFFFB68B & 0x6D75) & (0xFFFFEFFF & 0x3DFA);
        y.llIIlIll[344] = -(0xFFFFD2C7 & 0x7D39) & (0xFFFFDBFF & 0x7DFE);
        y.llIIlIll[345] = -(0xFFFFFDDE & 0x16FD) & (0xFFFFDEDB & 0x3FFF);
        y.llIIlIll[346] = 0xFFFFAB0B & 0x5EF6;
        y.llIIlIll[347] = 0xFFFFCB96 & 0x3E6D;
        y.llIIlIll[348] = 0xFFFFDDFC & 0x2BFF;
        y.llIIlIll[349] = -(0xFFFFF6FD & 0x49EB) & (0xFFFFEFEF & 0x5AFE);
        y.llIIlIll[350] = 0xFFFFE6FD & 0x3FAF;
        y.llIIlIll[351] = 0xFFFFCBD9 & 0x3E2F;
        y.llIIlIll[352] = -(0xFFFFD957 & 0x7EA9) & (0xFFFFFFF6 & 0x7EBF);
        y.llIIlIll[353] = -(0xFFFFFF9B & 0x5965) & (0xFFFFFFBE & 0x7FF9);
        y.llIIlIll[354] = -(0xFFFFDDFB & 0x7B46) & (0xFFFFFFFB & Short.MAX_VALUE);
        y.llIIlIll[355] = 0xFFFFC9DD & 0x3FEB;
        y.llIIlIll[356] = -(0xFFFFF51B & 0x7BED) & (0xFFFFFFFF & 0x7D7E);
        y.llIIlIll[357] = 0xFFFFCDFB & 0x3BDE;
        y.llIIlIll[358] = -(0xFFFFFB8F & 0x677B) & (0xFFFFFF7E & 0x6FFB);
        y.llIIlIll[359] = 0xFFFFD9EB & 0x2FFD;
        y.llIIlIll[360] = -(0xFFFF9BBF & 0x67D3) & (0xFFFFFFFB & 0xFFF);
        y.llIIlIll[361] = 0xFFFFABFB & 0x5DF5;
        y.llIIlIll[362] = -(0xFFFFBFE3 & 0x53BD) & (0xFFFFBFFF & 0x5FF7);
        y.llIIlIll[363] = -(0xFFFFFE6A & 0x619F) & (0xFFFFFDFF & 0x6BEF);
        y.llIIlIll[364] = 0xFFFF9ED3 & 0x6D7F;
        y.llIIlIll[365] = -(0xFFFFBA3D & 0x67EF) & (0xFFFFFBFF & 0x2FFF);
        y.llIIlIll[366] = -(0xFFFFC7F3 & 0x3A0D) & (0xFFFFFFDF & 0xBFF);
        y.llIIlIll[367] = -(0xFFFFF6ED & 0x7BBB) & (0xFFFFFFFD & Short.MAX_VALUE);
        y.llIIlIll[368] = 0xFFFFA9CF & 0x5FFE;
        y.llIIlIll[369] = 0xFFFFFFBE & 0xDE7;
        y.llIIlIll[370] = 0xFFFFBF7F & 0x4CDD;
        y.llIIlIll[371] = 0xFFFFADFE & 0x5F9F;
        y.llIIlIll[372] = 0xFFFFABDF & 0x5DF9;
        y.llIIlIll[373] = 0xFFFFEFBA & 0x1DED;
        y.llIIlIll[374] = -(0xFFFFFBFA & 0x360D) & (0xFFFFFBDF & 0x3FF7);
        y.llIIlIll[375] = -(0xFFFFBCFD & 0x7363) & (0xFFFFFFF5 & 0x3DFF);
        y.llIIlIll[376] = -(0xFFFFF715 & 0x4EEB) & (0xFFFFCFF3 & 0x7FDD);
        y.llIIlIll[377] = 0xFFFFCDED & 0x3F9E;
        y.llIIlIll[378] = -(0xFFFFD167 & 0x7EBF) & (0xFFFFFFFF & 0x5DBF);
        y.llIIlIll[379] = 0xFFFFABDF & 0x5DF7;
        y.llIIlIll[380] = -(0xFFFFFE95 & 0x73FB) & (0xFFFFFFF6 & Short.MAX_VALUE);
        y.llIIlIll[381] = -(0xFFFFDAC9 & 0x6737) & (0xFFFFCFFB & 0x7F67);
        y.llIIlIll[382] = 0xFFFFEC74 & 0x1FDF;
        y.llIIlIll[383] = 0xFFFFDFF4 & 0x29FF;
        y.llIIlIll[384] = 0xFFFFFDFE & 0x275F;
        y.llIIlIll[385] = -(0x1A ^ 0x10) & (0xFFFFB77F & 0x6DEF);
        y.llIIlIll[386] = 0xFFFFBFEF & 0x49F7;
        y.llIIlIll[387] = -(0xFFFFB8B9 & 0x674F) & (0xFFFFFFFF & 0x2DFD);
        y.llIIlIll[388] = -(0xFFFFAE0B & 0x73F7) & (0xFFFFFFFF & 0x2BFF);
        y.llIIlIll[389] = -(0xFFFFCA9F & 0x3769) & (0xFFFFAFFF & 0x5F7D);
        y.llIIlIll[390] = 0xFFFFFFE7 & 0x9FD;
        y.llIIlIll[391] = -(0xFFFFD732 & 0x78CF) & (0xFFFFF67D & 0x7FF7);
        y.llIIlIll[392] = -(0xFFFFF21B & 0x1FF5) & (0xFFFFBBFF & 0x5FFE);
        y.llIIlIll[393] = 0xFFFFAE7A & 0x77D7;
        y.llIIlIll[394] = 0xFFFF89CF & Short.MAX_VALUE;
        y.llIIlIll[395] = 0xFFFFDD87 & 0x2FFF;
        y.llIIlIll[396] = -(0xFFFFF7EE & 0x6D55) & (0xFFFFEF7F & 0x7FDF);
        y.llIIlIll[397] = 0xFFFFE7B4 & 0x3EEB;
        y.llIIlIll[398] = 0xFFFFEF2E & 0x1AD9;
        y.llIIlIll[399] = -(0xFFFFF8DB & 0x1F6F) & (0xFFFFFEEF & 0x3FFF);
        y.llIIlIll[400] = -(0xFFFFB5EB & 0x7FFD) & (0xFFFFFFEF & 0x3FFB);
        y.llIIlIll[401] = 0xFFFFEDFE & 0x3777;
        y.llIIlIll[402] = 0xFFFFD1AB & 0x2F7D;
        y.llIIlIll[403] = 0xFFFF857B & 0x7BAF;
        y.llIIlIll[404] = 0xFFFF912F & 0x6FFC;
        y.llIIlIll[405] = -(0xFFFFFFD7 & 0x3EAB) & (0xFFFFFFAF & 0x3FFF);
        y.llIIlIll[406] = 0xFFFFE7EE & 0x3EBF;
        y.llIIlIll[407] = -(0xFFFFE7E7 & 0x7E19) & (0xFFFFEFFF & 0x7FBF);
        y.llIIlIll[408] = -(0xFFFFDAAF & 0x75D3) & (0xFFFFDFBF & 0x7CFF);
        y.llIIlIll[409] = -(0xFFFFFF3E & 0x56EB) & (0xFFFFFFEF & 0x5FFF);
        y.llIIlIll[410] = 0xFFFFCD7E & 0x3EF9;
        y.llIIlIll[411] = -(0xFFFFF5F3 & 0x5E2F) & (0xFFFFDFEF & 0x7DFF);
        y.llIIlIll[412] = 0xFFFFFFFE & 0xD6F;
        y.llIIlIll[413] = 0xFFFFEF3F & 0x11EE;
    }

    @Override
    public int U() {
        try {
            y.bl();
            0;
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

