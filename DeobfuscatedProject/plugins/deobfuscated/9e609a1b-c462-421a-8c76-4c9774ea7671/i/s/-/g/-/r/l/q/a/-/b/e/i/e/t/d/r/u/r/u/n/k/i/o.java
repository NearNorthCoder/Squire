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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.p;
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
public class o
implements M {
    private static final /* synthetic */ WorldPoint dh;
    public static /* synthetic */ int dH;
    static /* synthetic */ int dJ;
    public static final /* synthetic */ int[] cH;
    static final /* synthetic */ int cS;
    private static final /* synthetic */ int dC;
    private static final /* synthetic */ WorldPoint dk;
    private static final /* synthetic */ WorldPoint dA;
    private static final /* synthetic */ WorldPoint dg;
    private static final /* synthetic */ WorldPoint dn;
    private static final /* synthetic */ WorldPoint dv;
    private static /* synthetic */ String[] lIIIllllIIlII;
    private static final /* synthetic */ WorldPoint di;
    private static final /* synthetic */ WorldPoint do;
    static /* synthetic */ WorldPoint dT;
    private static /* synthetic */ int[] lIIIllllIIlll;
    public static /* synthetic */ int dI;
    private static final /* synthetic */ WorldPoint dy;
    private static final /* synthetic */ WorldPoint df;
    static final /* synthetic */ WorldPoint[] cZ;
    private static final /* synthetic */ WorldPoint dm;
    static /* synthetic */ WorldArea dU;
    static /* synthetic */ int co;
    static /* synthetic */ int dL;
    public static final /* synthetic */ WorldPoint cL;
    public static final /* synthetic */ int[] cG;
    private static final /* synthetic */ WorldPoint dw;
    public static final /* synthetic */ WorldPoint cM;
    static /* synthetic */ String dS;
    public static final /* synthetic */ WorldPoint cN;
    private static final /* synthetic */ WorldPoint de;
    private static final /* synthetic */ WorldPoint dt;
    private static final /* synthetic */ WorldPoint du;
    static /* synthetic */ WorldPoint dV;
    static final /* synthetic */ int cU;
    public static final /* synthetic */ WorldPoint cO;
    static /* synthetic */ int dM;
    static /* synthetic */ String dR;
    private static final /* synthetic */ int dE;
    static final /* synthetic */ int cQ;
    public static /* synthetic */ boolean by;
    static /* synthetic */ int dN;
    private static final /* synthetic */ WorldPoint ds;
    public static final /* synthetic */ WorldPoint cK;
    static /* synthetic */ WorldArea dW;
    static /* synthetic */ String dQ;
    static final /* synthetic */ int cV;
    private static final /* synthetic */ WorldPoint dl;
    private static final /* synthetic */ WorldPoint dp;
    static final /* synthetic */ int cT;
    private static final /* synthetic */ WorldPoint dc;
    static final /* synthetic */ int cR;
    static /* synthetic */ int dO;
    private static final /* synthetic */ WorldPoint dx;
    private static final /* synthetic */ WorldPoint dr;
    private static final /* synthetic */ WorldPoint dd;
    static final /* synthetic */ int cW;
    public static final /* synthetic */ int[] cI;
    private static final /* synthetic */ WorldPoint da;
    private static final /* synthetic */ int dF;
    public static /* synthetic */ WorldArea dG;
    public static /* synthetic */ List<d> bA;
    static final /* synthetic */ int cX;
    public static final /* synthetic */ WorldPoint cP;
    private static final /* synthetic */ WorldPoint dz;
    private static final /* synthetic */ WorldPoint dq;
    public static final /* synthetic */ WorldArea cJ;
    private static final /* synthetic */ WorldPoint dj;
    private static final /* synthetic */ int dB;
    static /* synthetic */ String[] dP;
    static /* synthetic */ int dK;
    private static final /* synthetic */ int dD;
    static /* synthetic */ int bY;
    private static final /* synthetic */ WorldPoint db;
    static final /* synthetic */ int cY;
    static /* synthetic */ boolean cp;

    private static boolean lIlIIlIllIIIlIl(int n2) {
        return n2 != 0;
    }

    private static String lIlIIlIlIllIIIl(String lllllllllllllllIIIIIIlllIlIIIIIl, String lllllllllllllllIIIIIIlllIlIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIlllIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIIllllIIlll[13]), "DES");
            Cipher lllllllllllllllIIIIIIlllIlIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIlllIlIIIlIl.init(lIIIllllIIlll[3], lllllllllllllllIIIIIIlllIlIIIllI);
            return new String(lllllllllllllllIIIIIIlllIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlllIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIlllIlIIIlII) {
            lllllllllllllllIIIIIIlllIlIIIlII.printStackTrace();
            return null;
        }
    }

    public static void W() {
        d lllllllllllllllIIIIIIlllIlllIIlI;
        Object lllllllllllllllIIIIIIlllIlllIIll;
        block20: {
            block19: {
                int[] nArray = new int[lIIIllllIIlll[1]];
                nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[20];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIIllllIIlll[20], lIIIllllIIlll[44], lIIIllllIIlll[315]);
                    bA.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIIIllllIIlll[1]];
                nArray2[o.lIIIllllIIlll[0]] = lIIIllllIIlll[316];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlllIlllIIll = new d(lIIIllllIIlll[316], lIIIllllIIlll[7], h.bv);
                    bA.add((d)lllllllllllllllIIIIIIlllIlllIIll);
                    0;
                }
                int[] nArray3 = new int[lIIIllllIIlll[1]];
                nArray3[o.lIIIllllIIlll[0]] = lIIIllllIIlll[14];
                if (o.lIlIIlIllIIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIllllIIlll[1]];
                    nArray4[o.lIIIllllIIlll[0]] = lIIIllllIIlll[14];
                    if (o.lIlIIlIllIIIllI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIllllIIlll[11])) {
                        lllllllllllllllIIIIIIlllIlllIIll = new d(lIIIllllIIlll[14], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                        bA.add((d)lllllllllllllllIIIIIIlllIlllIIll);
                        0;
                    }
                }
                int[] nArray5 = new int[lIIIllllIIlll[1]];
                nArray5[o.lIIIllllIIlll[0]] = lIIIllllIIlll[15];
                if (o.lIlIIlIllIIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIIIllllIIlll[1]];
                    nArray6[o.lIIIllllIIlll[0]] = lIIIllllIIlll[15];
                    if (o.lIlIIlIllIIIllI(Bank.getFirst((int[])nArray6).getQuantity(), lIIIllllIIlll[11])) {
                        lllllllllllllllIIIIIIlllIlllIIll = new d(lIIIllllIIlll[15], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                        bA.add((d)lllllllllllllllIIIIIIlllIlllIIll);
                        0;
                    }
                }
                int[] nArray7 = new int[lIIIllllIIlll[1]];
                nArray7[o.lIIIllllIIlll[0]] = lIIIllllIIlll[16];
                if (o.lIlIIlIllIIIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIllllIIlll[1]];
                    nArray8[o.lIIIllllIIlll[0]] = lIIIllllIIlll[16];
                    if (o.lIlIIlIllIIIllI(Bank.getFirst((int[])nArray8).getQuantity(), lIIIllllIIlll[11])) {
                        lllllllllllllllIIIIIIlllIlllIIll = new d(lIIIllllIIlll[16], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                        bA.add((d)lllllllllllllllIIIIIIlllIlllIIll);
                        0;
                    }
                }
                int[] nArray9 = new int[lIIIllllIIlll[1]];
                nArray9[o.lIIIllllIIlll[0]] = lIIIllllIIlll[14];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlllIlllIIll = new d(lIIIllllIIlll[14], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                    bA.add((d)lllllllllllllllIIIIIIlllIlllIIll);
                    0;
                }
                int[] nArray10 = new int[lIIIllllIIlll[1]];
                nArray10[o.lIIIllllIIlll[0]] = lIIIllllIIlll[15];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlllIlllIIll = new d(lIIIllllIIlll[15], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                    bA.add((d)lllllllllllllllIIIIIIlllIlllIIll);
                    0;
                }
                int[] nArray11 = new int[lIIIllllIIlll[1]];
                nArray11[o.lIIIllllIIlll[0]] = lIIIllllIIlll[16];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlllIlllIIll = new d(lIIIllllIIlll[16], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                    bA.add((d)lllllllllllllllIIIIIIlllIlllIIll);
                    0;
                }
                int[] nArray12 = new int[lIIIllllIIlll[1]];
                nArray12[o.lIIIllllIIlll[0]] = lIIIllllIIlll[14];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlllIlllIIll = new d(lIIIllllIIlll[14], lIIIllllIIlll[317], lIIIllllIIlll[19]);
                    bA.add((d)lllllllllllllllIIIIIIlllIlllIIll);
                    0;
                }
                int[] nArray13 = new int[lIIIllllIIlll[1]];
                nArray13[o.lIIIllllIIlll[0]] = lIIIllllIIlll[318];
                if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    lllllllllllllllIIIIIIlllIlllIIll = new d(lIIIllllIIlll[318], lIIIllllIIlll[7], lIIIllllIIlll[315]);
                    bA.add((d)lllllllllllllllIIIIIIlllIlllIIll);
                    0;
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
            lllllllllllllllIIIIIIlllIlllIIll = new d(lIIIllllIIlll[24], lIIIllllIIlll[19], lIIIllllIIlll[319]);
            bA.add((d)lllllllllllllllIIIIIIlllIlllIIll);
            0;
        }
        int[] nArray = new int[lIIIllllIIlll[1]];
        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[18];
        if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllIIIIIIlllIlllIIll = new d(lIIIllllIIlll[18], lIIIllllIIlll[7], lIIIllllIIlll[320]);
            bA.add((d)lllllllllllllllIIIIIIlllIlllIIll);
            0;
        }
        if (o.lIlIIlIllIIIlll(Bank.contains((Predicate)(lllllllllllllllIIIIIIlllIlllIIll = item -> item.getName().toLowerCase().contains(lIIIllllIIlII[lIIIllllIIlll[326]]))) ? 1 : 0)) {
            lllllllllllllllIIIIIIlllIlllIIlI = new d(lIIIllllIIlll[321], lIIIllllIIlll[25], lIIIllllIIlll[322]);
            bA.add(lllllllllllllllIIIIIIlllIlllIIlI);
            0;
        }
        int[] nArray17 = new int[lIIIllllIIlll[1]];
        nArray17[o.lIIIllllIIlll[0]] = lIIIllllIIlll[323];
        if (o.lIlIIlIllIIIlll(Bank.contains((int[])nArray17) ? 1 : 0)) {
            lllllllllllllllIIIIIIlllIlllIIlI = new d(lIIIllllIIlll[323], lIIIllllIIlll[58], lIIIllllIIlll[324]);
            bA.add(lllllllllllllllIIIIIIlllIlllIIlI);
            0;
        }
    }

    @Override
    public int Y() {
        try {
            o.aI();
            0;
        }
        catch (Exception lllllllllllllllIIIIIIlllIlllIIII) {
            lllllllllllllllIIIIIIlllIlllIIII.printStackTrace();
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

    private static String lIlIIlIlIllIIII(String lllllllllllllllIIIIIIlllIllIlIII, String lllllllllllllllIIIIIIlllIllIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIlllIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlllIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIIlllIllIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIIlllIllIlIlI.init(lIIIllllIIlll[3], lllllllllllllllIIIIIIlllIllIlIll);
            return new String(lllllllllllllllIIIIIIlllIllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlllIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIlllIllIlIIl) {
            lllllllllllllllIIIIIIlllIllIlIIl.printStackTrace();
            return null;
        }
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
        o.lIIIllllIIlII[o.lIIIllllIIlll[0]] = o."Buying items";
        o.lIIIllllIIlII[o.lIIIllllIIlll[1]] = o."Finished buying items, switching back to questing";
        o.lIIIllllIIlII[o.lIIIllllIIlll[3]] = o."Drink";
        o.lIIIllllIIlII[o.lIIIllllIIlll[5]] = o."Shark";
        o.lIIIllllIIlII[o.lIIIllllIIlll[6]] = o."Shark";
        o.lIIIllllIIlII[o.lIIIllllIIlll[7]] = o."Eat";
        o.lIIIllllIIlII[o.lIIIllllIIlll[11]] = o."Navigating to bank";
        o.lIIIllllIIlII[o.lIIIllllIIlll[9]] = o."Opening bank";
        o.lIIIllllIIlII[o.lIIIllllIIlll[13]] = o."Handling banking";
        o.lIIIllllIIlII[o.lIIIllllIIlll[17]] = o."We are missing runessupplies, switching to BUYING";
        o.lIIIllllIIlII[o.lIIIllllIIlll[19]] = o."Rope";
        o.lIIIllllIIlII[o.lIIIllllIIlll[21]] = o."Shark";
        o.lIIIllllIIlII[o.lIIIllllIIlll[22]] = o."We are missing supplies, switching to BUYING";
        o.lIIIllllIIlII[o.lIIIllllIIlll[23]] = o."Rope";
        o.lIIIllllIIlII[o.lIIIllllIIlll[4]] = o."Shark";
        o.lIIIllllIIlII[o.lIIIllllIIlll[26]] = o."Drink";
        o.lIIIllllIIlII[o.lIIIllllIIlll[27]] = o."Nav to start";
        o.lIIIllllIIlII[o.lIIIllllIIlll[28]] = o."Chatting";
        o.lIIIllllIIlII[o.lIIIllllIIlll[25]] = o."Nav to boy";
        o.lIIIllllIIlII[o.lIIIllllIIlll[29]] = o."Chat boy";
        o.lIIIllllIIlII[o.lIIIllllIIlll[30]] = o."Nav to bookcase";
        o.lIIIllllIIlII[o.lIIIllllIIlll[32]] = o."Book on baxtorian";
        o.lIIIllllIIlII[o.lIIIllllIIlll[33]] = o."Searching bookcase";
        o.lIIIllllIIlII[o.lIIIllllIIlll[34]] = o."Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[35]] = o."Book on baxtorian";
        o.lIIIllllIIlII[o.lIIIllllIIlll[37]] = o."Book on baxtorian";
        o.lIIIllllIIlII[o.lIIIllllIIlll[38]] = o."Reading";
        o.lIIIllllIIlII[o.lIIIllllIIlll[39]] = o."Read";
        o.lIIIllllIIlII[o.lIIIllllIIlll[42]] = o."Tele to CW";
        o.lIIIllllIIlII[o.lIIIllllIIlll[43]] = o."Wear";
        o.lIIIllllIIlII[o.lIIIllllIIlll[44]] = o."Castle Wars";
        o.lIIIllllIIlII[o.lIIIllllIIlll[45]] = o."Nav to maze ladder";
        o.lIIIllllIIlII[o.lIIIllllIIlll[46]] = o."Fountain";
        o.lIIIllllIIlII[o.lIIIllllIIlll[48]] = o."Climb-down";
        o.lIIIllllIIlII[o.lIIIllllIIlll[50]] = o."nav to box";
        o.lIIIllllIIlII[o.lIIIllllIIlll[51]] = o."Searching crate";
        o.lIIIllllIIlII[o.lIIIllllIIlll[52]] = o."Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[54]] = o."Nav to cage";
        o.lIIIllllIIlII[o.lIIIllllIIlll[56]] = o."Entering cage";
        o.lIIIllllIIlII[o.lIIIllllIIlll[57]] = o."Chat npc";
        o.lIIIllllIIlII[o.lIIIllllIIlll[58]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[59]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[60]] = o."Nav to tombstone";
        o.lIIIllllIIlII[o.lIIIllllIIlll[61]] = o."Wear";
        o.lIIIllllIIlII[o.lIIIllllIIlll[62]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[63]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[64]] = o."Entering tomb";
        o.lIIIllllIIlII[o.lIIIllllIIlll[67]] = o."Stalagmite";
        o.lIIIllllIIlII[o.lIIIllllIIlll[68]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[69]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[2]] = o."Getting ammy";
        o.lIIIllllIIlII[o.lIIIllllIIlll[71]] = o."Open";
        o.lIIIllllIIlII[o.lIIIllllIIlll[73]] = o."Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[74]] = o."Stalagmite";
        o.lIIIllllIIlII[o.lIIIllllIIlll[75]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[76]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[77]] = o."Getting ammy";
        o.lIIIllllIIlII[o.lIIIllllIIlll[78]] = o."Open";
        o.lIIIllllIIlII[o.lIIIllllIIlll[79]] = o."Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[80]] = o."Stalagmite";
        o.lIIIllllIIlII[o.lIIIllllIIlll[82]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[83]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[84]] = o."Getting ashes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[85]] = o."Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[86]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[10]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[87]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[88]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[89]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[90]] = o."Nav to bank";
        o.lIIIllllIIlII[o.lIIIllllIIlll[91]] = o."Wear";
        o.lIIIllllIIlII[o.lIIIllllIIlll[92]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[93]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[94]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[95]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[96]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[97]] = o."Opening bank";
        o.lIIIllllIIlII[o.lIIIllllIIlll[98]] = o."Withdrawing runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[99]] = o."Vial";
        o.lIIIllllIIlII[o.lIIIllllIIlll[100]] = o."Shark";
        o.lIIIllllIIlII[o.lIIIllllIIlll[101]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[102]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[103]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[104]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[105]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[106]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[107]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[108]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[109]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[110]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[111]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[112]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[113]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[114]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[115]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[116]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[117]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[118]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[119]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[120]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[121]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[122]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[123]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[124]] = o."Nav to door entrance";
        o.lIIIllllIIlII[o.lIIIllllIIlll[125]] = o."Rope";
        o.lIIIllllIIlII[o.lIIIllllIIlll[126]] = o."Rock";
        o.lIIIllllIIlII[o.lIIIllllIIlll[127]] = o."Roping rock";
        o.lIIIllllIIlII[o.lIIIllllIIlll[129]] = o."Rope";
        o.lIIIllllIIlII[o.lIIIllllIIlll[131]] = o."Roping tree";
        o.lIIIllllIIlII[o.lIIIllllIIlll[132]] = o."Door";
        o.lIIIllllIIlII[o.lIIIllllIIlll[133]] = o."Entering door";
        o.lIIIllllIIlII[o.lIIIllllIIlll[134]] = o."Open";
        o.lIIIllllIIlII[o.lIIIllllIIlll[135]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[136]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[137]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[138]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[139]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[140]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[141]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[142]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[144]] = o."Nav to key and get";
        o.lIIIllllIIlII[o.lIIIllllIIlll[146]] = o."Search";
        o.lIIIllllIIlII[o.lIIIllllIIlll[147]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[148]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[149]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[150]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[151]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[152]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[153]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[154]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[155]] = o."Nav to last room";
        o.lIIIllllIIlII[o.lIIIllllIIlll[156]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[157]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[158]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[159]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[160]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[161]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[162]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[163]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[164]] = o."Door";
        o.lIIIllllIIlII[o.lIIIllllIIlll[166]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[167]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[168]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[169]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[170]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[171]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[172]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[173]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[174]] = o."Door";
        o.lIIIllllIIlII[o.lIIIllllIIlll[175]] = o."Open";
        o.lIIIllllIIlII[o.lIIIllllIIlll[176]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[177]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[178]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[179]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[180]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[181]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[182]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[183]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[184]] = o."Nav to SE Pillar";
        o.lIIIllllIIlII[o.lIIIllllIIlll[185]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[186]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[187]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[188]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[189]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[190]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[191]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[192]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[193]] = o."Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[194]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[195]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[196]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[197]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[198]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[199]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[201]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[202]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[203]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[204]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[205]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[206]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[207]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[208]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[209]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[210]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[211]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[212]] = o."Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[213]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[214]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[215]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[216]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[217]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[218]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[219]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[220]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[221]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[222]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[223]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[224]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[225]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[226]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[227]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[228]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[229]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[230]] = o."Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[231]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[232]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[233]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[234]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[235]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[236]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[237]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[238]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[239]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[240]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[241]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[242]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[243]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[244]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[245]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[246]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[247]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[248]] = o."Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[249]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[250]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[251]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[252]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[8]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[253]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[254]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[255]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[256]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[257]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[258]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[259]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[260]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[261]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[262]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[263]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[264]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[265]] = o."Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[266]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[267]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[268]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[269]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[270]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[271]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[272]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[273]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[274]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[275]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[276]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[277]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[278]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[279]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[280]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[281]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[282]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[283]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[284]] = o."Glarial's amulet";
        o.lIIIllllIIlII[o.lIIIllllIIlll[285]] = o."Glarial's urn";
        o.lIIIllllIIlII[o.lIIIllllIIlll[286]] = o."Using runes";
        o.lIIIllllIIlII[o.lIIIllllIIlll[287]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[288]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[289]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[290]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[291]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[292]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[293]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[294]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[295]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[296]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[297]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[298]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[299]] = o."Air rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[300]] = o."Earth rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[301]] = o."Water rune";
        o.lIIIllllIIlII[o.lIIIllllIIlll[302]] = o."Putting neck on statue";
        o.lIIIllllIIlII[o.lIIIllllIIlll[305]] = o."Putting ashes inside";
        o.lIIIllllIIlII[o.lIIIllllIIlll[308]] = o."Chalice";
        o.lIIIllllIIlII[o.lIIIllllIIlll[309]] = o."Statue of Glarial";
        o.lIIIllllIIlII[o.lIIIllllIIlll[310]] = o."Pillar";
        o.lIIIllllIIlII[o.lIIIllllIIlll[311]] = o."Teleporting to CW";
        o.lIIIllllIIlII[o.lIIIllllIIlll[312]] = o."Wear";
        o.lIIIllllIIlII[o.lIIIllllIIlll[313]] = o."Castle Wars";
        o.lIIIllllIIlII[o.lIIIllllIIlll[314]] = o."Rope";
        o.lIIIllllIIlII[o.lIIIllllIIlll[325]] = o."Waterfall quest";
        o.lIIIllllIIlII[o.lIIIllllIIlll[326]] = o."ring of wealth (";
        o.lIIIllllIIlII[o.lIIIllllIIlll[327]] = o."Stalagmite";
        o.lIIIllllIIlII[o.lIIIllllIIlll[328]] = o."Games";
        o.lIIIllllIIlII[o.lIIIllllIIlll[329]] = o."Games";
        o.lIIIllllIIlII[o.lIIIllllIIlll[330]] = o."Games";
        o.lIIIllllIIlII[o.lIIIllllIIlll[331]] = o."dueling";
        o.lIIIllllIIlII[o.lIIIllllIIlll[332]] = o."dueling";
        o.lIIIllllIIlII[o.lIIIllllIIlll[40]] = o."dueling";
        o.lIIIllllIIlII[o.lIIIllllIIlll[41]] = o."dueling";
        o.lIIIllllIIlII[o.lIIIllllIIlll[304]] = o."dueling";
        o.lIIIllllIIlII[o.lIIIllllIIlll[307]] = o."How can I help?";
        o.lIIIllllIIlII[o.lIIIllllIIlll[402]] = o."I'm always happy to help a cook in distress.";
        o.lIIIllllIIlII[o.lIIIllllIIlll[143]] = o."Yes.";
        o.lIIIllllIIlII[o.lIIIllllIIlll[403]] = o."Golrie";
        o.lIIIllllIIlII[o.lIIIllllIIlll[404]] = o."Hudon";
        o.lIIIllllIIlII[o.lIIIllllIIlll[405]] = o."Almera";
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
            0;
            if (null != null) {
                return ((0xD9 ^ 0x88) & ~(0x7C ^ 0x2D)) != 0;
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

    private static void lIlIIlIllIIIlII() {
        lIIIllllIIlll = new int[414];
        o.lIIIllllIIlll[0] = (0x34 ^ 0x6C) & ~(0xC7 ^ 0x9F);
        o.lIIIllllIIlll[1] = 1;
        o.lIIIllllIIlll[2] = 0xD8 ^ 0x93 ^ (3 ^ 0x7A);
        o.lIIIllllIIlll[3] = 2;
        o.lIIIllllIIlll[4] = 0x24 ^ 0x41 ^ (0x7B ^ 0x10);
        o.lIIIllllIIlll[5] = 3;
        o.lIIIllllIIlll[6] = 0x40 ^ 0x44;
        o.lIIIllllIIlll[7] = 0x58 ^ 0x5D;
        o.lIIIllllIIlll[8] = 102 + 43 - -64 + 3 + (0x3C ^ 0x6F) - (158 + 18 - 89 + 130) + (147 + 27 - 149 + 123);
        o.lIIIllllIIlll[9] = 0x79 ^ 0x58 ^ (0xB8 ^ 0x9E);
        o.lIIIllllIIlll[10] = 0xF4 ^ 0xB5;
        o.lIIIllllIIlll[11] = 0xBC ^ 0xBA;
        o.lIIIllllIIlll[12] = 0xFFFF9B9F & 0x77E8;
        o.lIIIllllIIlll[13] = 0x8B ^ 0x83;
        o.lIIIllllIIlll[14] = -(0xFFFFBA1F & 0x4DF1) & (0xFFFFBF3F & 0x4AFB);
        o.lIIIllllIIlll[15] = 0xFFFF8E3D & 0x73EE;
        o.lIIIllllIIlll[16] = -(0xFFFFDB0F & 0x65F3) & (0xFFFFEBEF & 0x573F);
        o.lIIIllllIIlll[17] = 0x74 ^ 0x53 ^ (0x9B ^ 0xB5);
        o.lIIIllllIIlll[18] = 0xFFFFBBFF & 0x47BA;
        o.lIIIllllIIlll[19] = 0x65 ^ 0x6F;
        o.lIIIllllIIlll[20] = 0xFFFF87D5 & 0x79AB;
        o.lIIIllllIIlll[21] = 0x22 ^ 0x69 ^ (0x7C ^ 0x3C);
        o.lIIIllllIIlll[22] = 0xB2 ^ 0xBE;
        o.lIIIllllIIlll[23] = 8 ^ 5;
        o.lIIIllllIIlll[24] = -(0xFFFFFE9F & 0x5766) & (0xFFFFFFFD & 0x5FFF);
        o.lIIIllllIIlll[25] = 0x66 ^ 0x56 ^ (0x9E ^ 0xBC);
        o.lIIIllllIIlll[26] = 3 ^ (0xBE ^ 0xB2);
        o.lIIIllllIIlll[27] = 0x36 ^ 0x79 ^ (0xFF ^ 0xA0);
        o.lIIIllllIIlll[28] = 0x52 ^ 9 ^ (0x63 ^ 0x29);
        o.lIIIllllIIlll[29] = 0x6D ^ 0x7E;
        o.lIIIllllIIlll[30] = 0x15 ^ 1;
        o.lIIIllllIIlll[31] = 0xFFFFFFED & 0x7D7;
        o.lIIIllllIIlll[32] = 78 + 26 - -31 + 42 ^ 159 + 145 - 209 + 69;
        o.lIIIllllIIlll[33] = 40 + 73 - 25 + 58 ^ 105 + 122 - 203 + 108;
        o.lIIIllllIIlll[34] = 1 + 162 - 16 + 67 ^ 168 + 156 - 140 + 9;
        o.lIIIllllIIlll[35] = 0x84 ^ 0x8C ^ (0xD5 ^ 0xC5);
        o.lIIIllllIIlll[36] = -1;
        o.lIIIllllIIlll[37] = 0x14 ^ 0xD;
        o.lIIIllllIIlll[38] = 0xA ^ 0x50 ^ (0xCF ^ 0x8F);
        o.lIIIllllIIlll[39] = 16 + 88 - 70 + 94 ^ 42 + 107 - 122 + 128;
        o.lIIIllllIIlll[40] = -(0xFFFFC7D3 & 0x7AEF) & (0xFFFFC3EF & 0x7FF7);
        o.lIIIllllIIlll[41] = -(0xFFFFFCFA & 0x3F97) & (0xFFFFBFBF & 0x7DF7);
        o.lIIIllllIIlll[42] = 0x3C ^ 0x20;
        o.lIIIllllIIlll[43] = 0x43 ^ 0x2D ^ (0x2F ^ 0x5C);
        o.lIIIllllIIlll[44] = 0x7B ^ 0x65;
        o.lIIIllllIIlll[45] = 0xAF ^ 0xA1 ^ (0x19 ^ 8);
        o.lIIIllllIIlll[46] = 55 + 57 - 49 + 65 ^ 31 + 140 - 163 + 152;
        o.lIIIllllIIlll[47] = -(0xFFFFE3F6 & 0x5F3B) & (0xFFFFDFB3 & 0x77FF);
        o.lIIIllllIIlll[48] = 45 + 73 - 115 + 145 ^ 139 + 162 - 234 + 114;
        o.lIIIllllIIlll[49] = 0xFFFF8FCE & 0x77F7;
        o.lIIIllllIIlll[50] = 0x5C ^ 0x71 ^ (0x64 ^ 0x6B);
        o.lIIIllllIIlll[51] = 0x70 ^ 0x53;
        o.lIIIllllIIlll[52] = 0x65 ^ 0x41;
        o.lIIIllllIIlll[53] = -(0xFFFF9E9E & 0x7BF7) & (0xFFFFFFFD & 0x3FFF);
        o.lIIIllllIIlll[54] = 0x7A ^ 0x5F;
        o.lIIIllllIIlll[55] = 0xFFFFF7CF & 0xFF7;
        o.lIIIllllIIlll[56] = 0xD1 ^ 0xB3 ^ (0x4B ^ 0xF);
        o.lIIIllllIIlll[57] = 0xFC ^ 0xAF ^ (0xF4 ^ 0x80);
        o.lIIIllllIIlll[58] = 0x59 ^ 0x73 ^ 2;
        o.lIIIllllIIlll[59] = 73 + 83 - 48 + 40 ^ 1 + 53 - -89 + 46;
        o.lIIIllllIIlll[60] = 145 + 0 - 31 + 54 ^ 15 + 33 - 9 + 91;
        o.lIIIllllIIlll[61] = 0x2E ^ 5;
        o.lIIIllllIIlll[62] = 0xB1 ^ 0x9D;
        o.lIIIllllIIlll[63] = 0x92 ^ 0xBF;
        o.lIIIllllIIlll[64] = 0x21 ^ 0xF;
        o.lIIIllllIIlll[65] = -(0xFFFFF9EB & 0x4E15) & (0xFFFFDFFC & 0x6FCB);
        o.lIIIllllIIlll[66] = -(0xFFFFDB62 & 0x7CFF) & (0xFFFFFFFD & 0x7D7F);
        o.lIIIllllIIlll[67] = 0x66 ^ 0x49;
        o.lIIIllllIIlll[68] = 0x66 ^ 0x56;
        o.lIIIllllIIlll[69] = 0x20 ^ 0x14 ^ (0xB7 ^ 0xB2);
        o.lIIIllllIIlll[70] = -(0xFFFFD8BD & 0x2F47) & (0xFFFFFFFF & 0xFCE);
        o.lIIIllllIIlll[71] = 0xBA ^ 0x89;
        o.lIIIllllIIlll[72] = 0xFFFF9FDF & 0x67EB;
        o.lIIIllllIIlll[73] = 91 + 124 - 92 + 6 ^ 144 + 146 - 119 + 10;
        o.lIIIllllIIlll[74] = 0x35 ^ 0;
        o.lIIIllllIIlll[75] = 0x35 ^ 3;
        o.lIIIllllIIlll[76] = 0x7F ^ 0x48;
        o.lIIIllllIIlll[77] = 0x59 ^ 0x61;
        o.lIIIllllIIlll[78] = 0x76 ^ 0x4F;
        o.lIIIllllIIlll[79] = 0x2A ^ 0x10;
        o.lIIIllllIIlll[80] = 2 + 144 - 68 + 103 ^ 75 + 139 - 93 + 21;
        o.lIIIllllIIlll[81] = -(0xFFFFCCB7 & 0x3B6B) & (0xFFFF8FEF & 0x7FFB);
        o.lIIIllllIIlll[82] = 0x6C ^ 0x50;
        o.lIIIllllIIlll[83] = 3 + 78 - 35 + 142 ^ 65 + 58 - 54 + 60;
        o.lIIIllllIIlll[84] = 107 + 149 - 244 + 155 ^ 148 + 52 - 50 + 3;
        o.lIIIllllIIlll[85] = 0xA4 ^ 0x8F ^ (0x1C ^ 8);
        o.lIIIllllIIlll[86] = 0x57 ^ 0x17;
        o.lIIIllllIIlll[87] = 234 + 208 - 269 + 74 ^ 87 + 100 - 24 + 18;
        o.lIIIllllIIlll[88] = 37 + 108 - -31 + 16 ^ 26 + 11 - -5 + 89;
        o.lIIIllllIIlll[89] = 0xB3 ^ 0x8D ^ (0xFF ^ 0x85);
        o.lIIIllllIIlll[90] = 0x31 ^ 0x74;
        o.lIIIllllIIlll[91] = 0x29 ^ 0x6F;
        o.lIIIllllIIlll[92] = 0x16 ^ 0x54 ^ (0x1A ^ 0x1F);
        o.lIIIllllIIlll[93] = 230 + 80 - 303 + 242 ^ 6 + 146 - 90 + 115;
        o.lIIIllllIIlll[94] = 0x93 ^ 0x84 ^ (5 ^ 0x5B);
        o.lIIIllllIIlll[95] = 0x6B ^ 0x21;
        o.lIIIllllIIlll[96] = 0xD8 ^ 0x93 ^ (0x44 ^ 0x5B) & ~(0x25 ^ 0x3A);
        o.lIIIllllIIlll[97] = 0xAA ^ 0xC6 ^ (0x83 ^ 0xA3);
        o.lIIIllllIIlll[98] = 0x3A ^ 0x36 ^ (0xEA ^ 0xAB);
        o.lIIIllllIIlll[99] = 77 + 42 - 17 + 35 ^ 152 + 103 - 122 + 66;
        o.lIIIllllIIlll[100] = 0xEE ^ 0xA1;
        o.lIIIllllIIlll[101] = 0xF7 ^ 0xA7;
        o.lIIIllllIIlll[102] = 0xDC ^ 0x8D;
        o.lIIIllllIIlll[103] = 0xC7 ^ 0x95;
        o.lIIIllllIIlll[104] = 0x75 ^ 0x26;
        o.lIIIllllIIlll[105] = 103 + 96 - 3 + 8 ^ 79 + 83 - 144 + 134;
        o.lIIIllllIIlll[106] = 0xC8 ^ 0x9D;
        o.lIIIllllIIlll[107] = 172 + 213 - 378 + 230 ^ 167 + 133 - 289 + 176;
        o.lIIIllllIIlll[108] = 8 ^ 4 ^ (0x51 ^ 0xA);
        o.lIIIllllIIlll[109] = 0xAA ^ 0x97 ^ (0x57 ^ 0x32);
        o.lIIIllllIIlll[110] = 0x52 ^ 0xB;
        o.lIIIllllIIlll[111] = 0x9D ^ 0xA7 ^ (0xC7 ^ 0xA7);
        o.lIIIllllIIlll[112] = 106 + 54 - -22 + 36 ^ 96 + 68 - 65 + 30;
        o.lIIIllllIIlll[113] = 0x9E ^ 0xC2;
        o.lIIIllllIIlll[114] = 0x7B ^ 0x26;
        o.lIIIllllIIlll[115] = 0x27 ^ 0x79;
        o.lIIIllllIIlll[116] = 0xE6 ^ 0xB9;
        o.lIIIllllIIlll[117] = 0xEE ^ 0x8E;
        o.lIIIllllIIlll[118] = 0xCC ^ 0xB8 ^ (0x13 ^ 6);
        o.lIIIllllIIlll[119] = 0x7C ^ 0x1E;
        o.lIIIllllIIlll[120] = 0x52 ^ 0x31;
        o.lIIIllllIIlll[121] = 0xE0 ^ 0x84;
        o.lIIIllllIIlll[122] = 0xDA ^ 0xB1 ^ (0xA9 ^ 0xA7);
        o.lIIIllllIIlll[123] = 142 + 188 - 325 + 235 ^ 58 + 51 - 89 + 130;
        o.lIIIllllIIlll[124] = 0x43 ^ 0x10 ^ (0x6A ^ 0x5E);
        o.lIIIllllIIlll[125] = 0x23 ^ 0x28 ^ (9 ^ 0x6A);
        o.lIIIllllIIlll[126] = 172 + 168 - 293 + 163 ^ 174 + 86 - 240 + 167;
        o.lIIIllllIIlll[127] = 0x65 ^ 0xF;
        o.lIIIllllIIlll[128] = 0xFFFFDBDE & 0x3F79;
        o.lIIIllllIIlll[129] = 58 + 138 - 157 + 183 ^ 83 + 92 - 135 + 141;
        o.lIIIllllIIlll[130] = -(0xFFFFBDCF & 0x723B) & (0xFFFFFFEE & 0x37FF);
        o.lIIIllllIIlll[131] = 0x33 ^ 0x5F;
        o.lIIIllllIIlll[132] = 175 + 233 - 203 + 30 ^ 114 + 99 - 96 + 17;
        o.lIIIllllIIlll[133] = 0xE3 ^ 0x8D;
        o.lIIIllllIIlll[134] = 0x50 ^ 0x3F;
        o.lIIIllllIIlll[135] = 0x7B ^ 0x26 ^ (0x4C ^ 0x61);
        o.lIIIllllIIlll[136] = 0x66 ^ 1 ^ (0x9E ^ 0x88);
        o.lIIIllllIIlll[137] = 0xF6 ^ 0x84;
        o.lIIIllllIIlll[138] = 0x1C ^ 9 ^ (0x56 ^ 0x30);
        o.lIIIllllIIlll[139] = 0x22 ^ 0x68 ^ (0x69 ^ 0x57);
        o.lIIIllllIIlll[140] = 0xB5 ^ 0xC0;
        o.lIIIllllIIlll[141] = 0x44 ^ 0x26 ^ (0x16 ^ 2);
        o.lIIIllllIIlll[142] = 121 + 180 - 148 + 86 ^ 28 + 100 - 101 + 125;
        o.lIIIllllIIlll[143] = -(0xFFFFFFDF & 0x6C75) & (0xFFFFEF7F & 0x7DFE);
        o.lIIIllllIIlll[144] = 0x57 ^ 0x2F;
        o.lIIIllllIIlll[145] = -(0xFFFFFC7D & 0x23A3) & (0xFFFFAFFF & 0x77EF);
        o.lIIIllllIIlll[146] = 0x49 ^ 0x30;
        o.lIIIllllIIlll[147] = 9 + 2 - -71 + 103 ^ 5 + 133 - -54 + 3;
        o.lIIIllllIIlll[148] = 0x41 ^ 0x3A;
        o.lIIIllllIIlll[149] = 0xC2 ^ 0xBE;
        o.lIIIllllIIlll[150] = 0xE3 ^ 0xBB ^ (0x3C ^ 0x19);
        o.lIIIllllIIlll[151] = 0xE2 ^ 0x99 ^ (0x78 ^ 0x7D);
        o.lIIIllllIIlll[152] = 91 + 10 - -11 + 15;
        o.lIIIllllIIlll[153] = 29 + 57 - 57 + 99;
        o.lIIIllllIIlll[154] = 69 + 82 - 37 + 15;
        o.lIIIllllIIlll[155] = 114 + 116 - 180 + 80;
        o.lIIIllllIIlll[156] = (0x7E ^ 9) + (0x51 ^ 0x44) - (0x52 ^ 0x33) + (0x18 ^ 0x40);
        o.lIIIllllIIlll[157] = (0x6A ^ 0x75) + (0xA5 ^ 0x8C) - (0x71 ^ 0x75) + (0xED ^ 0xAD);
        o.lIIIllllIIlll[158] = 80 + 108 - 150 + 95;
        o.lIIIllllIIlll[159] = 55 + 16 - 9 + 70 + (0x26 ^ 0x10) - (0xE8 ^ 0x96) + (0xB ^ 0x41);
        o.lIIIllllIIlll[160] = (0xE4 ^ 0x96) + (0xB9 ^ 0x94) - (0x8E ^ 0xAF) + (0xC9 ^ 0xC0);
        o.lIIIllllIIlll[161] = (0xB ^ 0x56) + (0x32 ^ 0x52) - (109 + 107 - 78 + 25) + (0xD1 ^ 0xBF);
        o.lIIIllllIIlll[162] = 43 + 28 - 22 + 88;
        o.lIIIllllIIlll[163] = (0x1C ^ 0x49) + (0x61 ^ 0x37) - (126 + 100 - 79 + 19) + (61 + 48 - 66 + 90);
        o.lIIIllllIIlll[164] = 133 + 99 - 166 + 73;
        o.lIIIllllIIlll[165] = -(0xFFFFD767 & 0x6ED9) & (0xFFFFEF75 & 0x77FE);
        o.lIIIllllIIlll[166] = 27 + 123 - 84 + 74;
        o.lIIIllllIIlll[167] = (0x50 ^ 0x58) + (0xD9 ^ 0xB2) - (0x7F ^ 0x5B) + (0x2C ^ 0x12);
        o.lIIIllllIIlll[168] = (0x20 ^ 0x27) + 3 - -(0x60 ^ 0x3A) + (0x1F ^ 0x35);
        o.lIIIllllIIlll[169] = 38 + 10 - -43 + 52;
        o.lIIIllllIIlll[170] = 106 + 74 - 167 + 131;
        o.lIIIllllIIlll[171] = (0x2E ^ 0xB) + (0xC0 ^ 0xB9) - (0x25 ^ 0x1D) + (0xAC ^ 0x87);
        o.lIIIllllIIlll[172] = (0x2F ^ 0x75) + (0xB4 ^ 0x8E) - (58 + 115 - 118 + 85) + (79 + 114 - 97 + 42);
        o.lIIIllllIIlll[173] = 0 + 102 - -2 + 43;
        o.lIIIllllIIlll[174] = 99 + 141 - 183 + 91;
        o.lIIIllllIIlll[175] = 51 + 125 - 119 + 70 + (0xB7 ^ 0xAB) - (0x1B ^ 0x6E) + (0xCA ^ 0xA5);
        o.lIIIllllIIlll[176] = 103 + 30 - 121 + 138;
        o.lIIIllllIIlll[177] = 56 + 107 - 19 + 7;
        o.lIIIllllIIlll[178] = 104 + 114 - 141 + 55 + ((0xB ^ 0x2A) & ~(0xBB ^ 0x9A)) - (0x46 ^ 0x24) + (0xF ^ 0x79);
        o.lIIIllllIIlll[179] = 34 + 28 - -76 + 15;
        o.lIIIllllIIlll[180] = 8 + 90 - -9 + 47;
        o.lIIIllllIIlll[181] = (0x6B ^ 0x31) + (57 + 118 - 68 + 23) - (0x56 ^ 0x2F) + (7 ^ 0x3F);
        o.lIIIllllIIlll[182] = 120 + 145 - 255 + 146;
        o.lIIIllllIIlll[183] = (0x5D ^ 0x26) + (0x22 ^ 0x7E) - (11 + 25 - -67 + 24) + (0xD ^ 0x48);
        o.lIIIllllIIlll[184] = 15 + 6 - -62 + 75;
        o.lIIIllllIIlll[185] = (0x27 ^ 0x21) + (0x96 ^ 0xBE) - -(0x15 ^ 0x45) + (0x92 ^ 0xB3);
        o.lIIIllllIIlll[186] = (0xDB ^ 0xB5) + (39 + 37 - 37 + 93) - (76 + 162 - 37 + 12) + (48 + 60 - 41 + 64);
        o.lIIIllllIIlll[187] = (8 ^ 0x62) + (0xEB ^ 0x8A) - (0x52 ^ 0x17) + (0x83 ^ 0x98);
        o.lIIIllllIIlll[188] = (0xE ^ 0x16) + (0x9C ^ 0xAA) - -(0x62 ^ 0x2E) + (0x9E ^ 0x96);
        o.lIIIllllIIlll[189] = (0x20 ^ 0x51) + (4 ^ 0x18) - -(0x41 ^ 0x44) + (0xB3 ^ 0xA2);
        o.lIIIllllIIlll[190] = 56 + 9 - -20 + 79;
        o.lIIIllllIIlll[191] = 98 + 120 - 91 + 27 + (0x6D ^ 0xC) - (0xA9 ^ 0xC5) + (7 ^ 0x11);
        o.lIIIllllIIlll[192] = 99 + 4 - 41 + 104;
        o.lIIIllllIIlll[193] = 83 + 132 - 62 + 14;
        o.lIIIllllIIlll[194] = 38 + 116 - 88 + 102;
        o.lIIIllllIIlll[195] = 92 + 28 - 15 + 54 + (0x47 ^ 0x3A) - (0xFFFF97AF & 0x6957) + (95 + 73 - 36 + 16);
        o.lIIIllllIIlll[196] = 12 + 31 - -91 + 17 + (1 ^ 0x12) - (0x76 ^ 0x31) + (0 ^ 0x47);
        o.lIIIllllIIlll[197] = (0x2B ^ 0x70) + (114 + 55 - 135 + 97) - (0x76 ^ 0x48) + (0xAD ^ 0xA6);
        o.lIIIllllIIlll[198] = 101 + 116 - 183 + 128 + (0x38 ^ 0xA) - (0xE2 ^ 0xA2) + (7 ^ 0x1F);
        o.lIIIllllIIlll[199] = 46 + 14 - 55 + 130 + (29 + 130 - 25 + 14) - (179 + 22 - 111 + 124) + (0x67 ^ 0xF);
        o.lIIIllllIIlll[200] = -(0xB0 ^ 0x93) & (0xFFFFA7FF & 0x5FF7);
        o.lIIIllllIIlll[201] = 55 + 136 - 141 + 118 + (0x3F ^ 0x52) - (32 + 55 - -16 + 45) + (0x4C ^ 0x61);
        o.lIIIllllIIlll[202] = 166 + 117 - 253 + 145;
        o.lIIIllllIIlll[203] = (4 ^ 0x2F) + (0x4F ^ 0x61) - -(0x86 ^ 0xAB) + (0x71 ^ 0x5B);
        o.lIIIllllIIlll[204] = 80 + 45 - -14 + 38;
        o.lIIIllllIIlll[205] = 148 + 72 - 217 + 175;
        o.lIIIllllIIlll[206] = 119 + 57 - 110 + 67 + (0x3D ^ 0x6F) - (2 + 20 - 16 + 145) + (0xE1 ^ 0x92);
        o.lIIIllllIIlll[207] = (0xF5 ^ 0xB3) + (0x81 ^ 0xB1) - (0x29 ^ 0x7D) + (79 + 125 - 92 + 34);
        o.lIIIllllIIlll[208] = 59 + 37 - 79 + 164;
        o.lIIIllllIIlll[209] = 52 + 112 - 161 + 179;
        o.lIIIllllIIlll[210] = 73 + 0 - 19 + 129;
        o.lIIIllllIIlll[211] = 5 + 153 - 5 + 31;
        o.lIIIllllIIlll[212] = 95 + 9 - 20 + 101;
        o.lIIIllllIIlll[213] = 16 + 73 - 7 + 85 + (0xF2 ^ 0x82) - (52 + 55 - 94 + 135) + (0x67 ^ 0x50);
        o.lIIIllllIIlll[214] = (0x47 ^ 0x3E) + (0x51 ^ 0x7C) - (0x35 ^ 0x39) + (0x78 ^ 0x59);
        o.lIIIllllIIlll[215] = 77 + 40 - -26 + 45;
        o.lIIIllllIIlll[216] = 64 + 82 - 113 + 156;
        o.lIIIllllIIlll[217] = 156 + 70 - 221 + 185;
        o.lIIIllllIIlll[218] = 172 + 109 - 195 + 105;
        o.lIIIllllIIlll[219] = (0x33 ^ 0xF) + (0xC4 ^ 0x82) - (0x1E ^ 0x42) + (71 + 40 - -16 + 27);
        o.lIIIllllIIlll[220] = 67 + 112 - -7 + 7;
        o.lIIIllllIIlll[221] = (0x39 ^ 0x49) + (27 + 133 - 91 + 65) - (128 + 14 - 39 + 34) + (0x3A ^ 0x6F);
        o.lIIIllllIIlll[222] = 182 + 56 - 67 + 24;
        o.lIIIllllIIlll[223] = 115 + 49 - 25 + 16 + (0x5F ^ 0x51) - (96 + 59 - 140 + 123) + (110 + 32 - -6 + 17);
        o.lIIIllllIIlll[224] = (0x46 ^ 0x53) + (0x61 ^ 0x43) - -(0x6A ^ 0x44) + (0xC1 ^ 0xA1);
        o.lIIIllllIIlll[225] = (0xAD ^ 0x92) + (11 + 75 - -63 + 16) - (0x1C ^ 0x67) + (0x18 ^ 0x45);
        o.lIIIllllIIlll[226] = 101 + 156 - 238 + 180;
        o.lIIIllllIIlll[227] = (0x5E ^ 0x56) + (0xF8 ^ 0x82) - -(0x9A ^ 0x8D) + (0xB6 ^ 0x99);
        o.lIIIllllIIlll[228] = (0xEA ^ 0xAC) + (73 + 103 - 147 + 144) - (0x16 ^ 0x4B) + (0x80 ^ 0xB3);
        o.lIIIllllIIlll[229] = 50 + 167 - 182 + 167;
        o.lIIIllllIIlll[230] = (2 ^ 0x6F) + (0x48 ^ 0x4E) - (0x15 ^ 0x29) + (17 + 52 - 33 + 112);
        o.lIIIllllIIlll[231] = 90 + 105 - 164 + 173;
        o.lIIIllllIIlll[232] = 8 + 58 - -91 + 48;
        o.lIIIllllIIlll[233] = (0x7F ^ 0x28) + (0xAF ^ 0xA4) - -(0x2F ^ 0x46) + 3;
        o.lIIIllllIIlll[234] = 110 + 22 - -70 + 5;
        o.lIIIllllIIlll[235] = 120 + 59 - 52 + 12 + (0x32 ^ 0x7A) - (0xFD ^ 0x9A) + (0xD ^ 0x69);
        o.lIIIllllIIlll[236] = (8 ^ 0x5B) + (61 + 81 - 139 + 150) - (202 + 83 - 173 + 123) + (19 + 44 - -24 + 121);
        o.lIIIllllIIlll[237] = (0xAB ^ 0x83) + (186 + 163 - 334 + 179) - (2 + 125 - 83 + 156) + (140 + 131 - 214 + 119);
        o.lIIIllllIIlll[238] = 120 + 150 - 81 + 22;
        o.lIIIllllIIlll[239] = 85 + 63 - 145 + 209;
        o.lIIIllllIIlll[240] = 152 + 121 - 151 + 49 + (90 + 41 - -13 + 16) - (143 + 53 - 173 + 126) + (8 ^ 0x17);
        o.lIIIllllIIlll[241] = (0x3D ^ 0x1B) + (87 + 11 - -27 + 15) - (0x9F ^ 0xC0) + (107 + 89 - 105 + 40);
        o.lIIIllllIIlll[242] = 98 + 194 - 106 + 29;
        o.lIIIllllIIlll[243] = (0x12 ^ 0x33) + (0xF ^ 0x55) - (0xB ^ 0x61) + (171 + 91 - 187 + 124);
        o.lIIIllllIIlll[244] = 86 + 34 - -64 + 33;
        o.lIIIllllIIlll[245] = 45 + 140 - 153 + 186;
        o.lIIIllllIIlll[246] = 97 + 154 - 115 + 29 + (78 + 40 - 27 + 53) - (94 + 126 - 197 + 115) + (0x7F ^ 0x4F);
        o.lIIIllllIIlll[247] = 135 + 101 - 62 + 46;
        o.lIIIllllIIlll[248] = (0xFB ^ 0xB6) + (0x82 ^ 0x97) - (0xAF ^ 0xBB) + (35 + 80 - -8 + 20);
        o.lIIIllllIIlll[249] = (0x76 ^ 0x70) + (0x2F ^ 0x15) - -(17 + 102 - 56 + 68) + (6 ^ 0x1D);
        o.lIIIllllIIlll[250] = 199 + 103 - 284 + 205;
        o.lIIIllllIIlll[251] = 31 + 79 - -29 + 85;
        o.lIIIllllIIlll[252] = 53 + 156 - 80 + 43 + (3 + 181 - 134 + 138) - (159 + 176 - 292 + 148) + (0x81 ^ 0xB9);
        o.lIIIllllIIlll[253] = 115 + 189 - 271 + 194;
        o.lIIIllllIIlll[254] = 28 + 81 - -85 + 34;
        o.lIIIllllIIlll[255] = 1 + 8 - -149 + 71;
        o.lIIIllllIIlll[256] = 2 + 1 - -202 + 25;
        o.lIIIllllIIlll[257] = (0xA4 ^ 0xA3) + (123 + 102 - 79 + 65) - (58 + 117 - 144 + 166) + (196 + 116 - 182 + 80);
        o.lIIIllllIIlll[258] = 3 + 137 - 15 + 107;
        o.lIIIllllIIlll[259] = (0xC6 ^ 0x88) + (0xD7 ^ 0xAA) - (0x2C ^ 0x77) + (0xBC ^ 0xC5);
        o.lIIIllllIIlll[260] = 103 + 156 - 172 + 128 + (166 + 158 - 270 + 135) - (0xFFFF9FBA & 0x6177) + (109 + 68 - 105 + 64);
        o.lIIIllllIIlll[261] = 10 + 15 - -192 + 18;
        o.lIIIllllIIlll[262] = 110 + 146 - 218 + 198;
        o.lIIIllllIIlll[263] = 84 + 28 - 106 + 231;
        o.lIIIllllIIlll[264] = 18 + 163 - 122 + 179;
        o.lIIIllllIIlll[265] = 153 + 57 - 59 + 88;
        o.lIIIllllIIlll[266] = (0xB8 ^ 0xC4) + (0xEB ^ 0x96) - (93 + 44 - -28 + 12) + (84 + 41 - 28 + 71);
        o.lIIIllllIIlll[267] = 67 + 206 - 270 + 238;
        o.lIIIllllIIlll[268] = 232 + 69 - 223 + 164;
        o.lIIIllllIIlll[269] = (0xFC ^ 0x91) + (188 + 55 - 137 + 99) - (142 + 37 - 127 + 175) + (32 + 58 - -63 + 3);
        o.lIIIllllIIlll[270] = 70 + 78 - 66 + 156 + (0xC3 ^ 0x90) - (86 + 125 - 60 + 17) + (0xFF ^ 0xA4);
        o.lIIIllllIIlll[271] = 197 + 72 - 113 + 89;
        o.lIIIllllIIlll[272] = (3 ^ 0xC) + (80 + 57 - 136 + 138) - -(0x6B ^ 0x6F) + (0x2C ^ 0x74);
        o.lIIIllllIIlll[273] = 199 + 133 - 192 + 107;
        o.lIIIllllIIlll[274] = 41 + 136 - 152 + 223;
        o.lIIIllllIIlll[275] = 188 + 63 - 134 + 132;
        o.lIIIllllIIlll[276] = (0xC0 ^ 0x8F) + (10 + 108 - 94 + 205) - (0x3D ^ 0x6E) + (0x8C ^ 0x95);
        o.lIIIllllIIlll[277] = 185 + 95 - 193 + 137 + (0x91 ^ 0xB6) - (0x6C ^ 0x54) + (0x29 ^ 5);
        o.lIIIllllIIlll[278] = 176 + 199 - 350 + 227;
        o.lIIIllllIIlll[279] = (0x76 ^ 0x43) + (0x4C ^ 0xE) - (0xEE ^ 0xA4) + (121 + 53 - -7 + 27);
        o.lIIIllllIIlll[280] = 194 + 25 - 185 + 220;
        o.lIIIllllIIlll[281] = 151 + 238 - 143 + 9;
        o.lIIIllllIIlll[282] = 0xFFFF9B18 & 0x65E7;
        o.lIIIllllIIlll[283] = -(0xFFFFEEBF & 0x3BFF) & (0xFFFFBFFF & 0x6BBF);
        o.lIIIllllIIlll[284] = 0xFFFFCF62 & 0x319F;
        o.lIIIllllIIlll[285] = 0xFFFFBDB7 & 0x434B;
        o.lIIIllllIIlll[286] = 0xFFFFCBFF & 0x3504;
        o.lIIIllllIIlll[287] = 0xFFFFEBDF & 0x1525;
        o.lIIIllllIIlll[288] = -(0xFFFFFAF2 & Short.MAX_VALUE) & (0xFFFFFFFF & 0x7BF7);
        o.lIIIllllIIlll[289] = -(0xFFFFF2EF & 0x2FF9) & (0xFFFFAFEF & 0x73FF);
        o.lIIIllllIIlll[290] = 0xFFFFC1DF & 0x3F28;
        o.lIIIllllIIlll[291] = 0xFFFFFDEF & 0x319;
        o.lIIIllllIIlll[292] = 0xFFFF899F & 0x776A;
        o.lIIIllllIIlll[293] = 0xFFFFA7AB & 0x595F;
        o.lIIIllllIIlll[294] = 0xFFFF8BAD & 0x755E;
        o.lIIIllllIIlll[295] = 0xFFFFD9FD & 0x270F;
        o.lIIIllllIIlll[296] = -(0xFFFFAEF6 & 0x792B) & (0xFFFFE9AF & 0x3F7F);
        o.lIIIllllIIlll[297] = -(0xFFFFFFFD & 0x2C53) & (0xFFFFBD7F & 0x6FDF);
        o.lIIIllllIIlll[298] = -(0xFFFFEDEA & 0x56BF) & (0xFFFFEDFF & 0x57B9);
        o.lIIIllllIIlll[299] = 0xFFFFD393 & 0x2D7D;
        o.lIIIllllIIlll[300] = -(0xFFFFCAFD & 0x7D67) & (0xFFFFFF7F & 0x49F6);
        o.lIIIllllIIlll[301] = -(0xFFFFFFEF & 0x6E7D) & (0xFFFFEFFF & 0x7F7F);
        o.lIIIllllIIlll[302] = -(0xFFFFF2B6 & 0x6FED) & (0xFFFFEFFF & 0x73B7);
        o.lIIIllllIIlll[303] = 0xFFFFFFDE & 0x7F7;
        o.lIIIllllIIlll[304] = -(0xFFFFFFFB & 0x7485) & (0xFFFFF5AF & 0x7FF7);
        o.lIIIllllIIlll[305] = -(0xFFFFBDEB & 0x5E9D) & (0xFFFFFFBD & 0x1DDF);
        o.lIIIllllIIlll[306] = 0xFFFFBFDF & 0x47FE;
        o.lIIIllllIIlll[307] = -(0xFFFFE73F & 0x1AD8) & (0xFFFFDF3F & 0x23FF);
        o.lIIIllllIIlll[308] = -(0xFFFFEFFE & 0x3ACB) & (0xFFFFEFFF & 0x3BDF);
        o.lIIIllllIIlll[309] = 0xFFFFADB7 & 0x535F;
        o.lIIIllllIIlll[310] = -(0xFFFFF3EF & 0x7EF2) & (0xFFFFF3FB & 0x7FFD);
        o.lIIIllllIIlll[311] = -(0xFFFFF6A7 & 0x3FFF) & (0xFFFFFFFF & 0x37BF);
        o.lIIIllllIIlll[312] = 0xFFFF8F1E & 0x71FB;
        o.lIIIllllIIlll[313] = 0xFFFFEB9F & 0x157B;
        o.lIIIllllIIlll[314] = 0xFFFFCD7F & 0x339C;
        o.lIIIllllIIlll[315] = -(0xFFFFFD6F & 0x76D7) & (0xFFFFFFFF & 0x7FFE);
        o.lIIIllllIIlll[316] = 0xFFFFB55B & 0x7BF5;
        o.lIIIllllIIlll[317] = -(0xFFFFFCBB & 0x7355) & (0xFFFFFFFB & 0x73FC);
        o.lIIIllllIIlll[318] = -(0xFB ^ 0x8A) & (0xFFFF9FFF & 0x6F7D);
        o.lIIIllllIIlll[319] = -(0xFFFFA8BF & 0x7F67) & (0xFFFFFFF6 & 0x2FFF);
        o.lIIIllllIIlll[320] = 0xFFFFFEFE & 0x3B99;
        o.lIIIllllIIlll[321] = 0xFFFFBEED & 0x6FDE;
        o.lIIIllllIIlll[322] = -(0xFFFFAF36 & 0x5DDD) & (0xFFFFEFFF & 0x5F7B);
        o.lIIIllllIIlll[323] = 0xFFFFFFF7 & 0x1F4F;
        o.lIIIllllIIlll[324] = -(0xFFFFE3E6 & 0x7E5D) & (0xFFFFE7D7 & 0x7F7F);
        o.lIIIllllIIlll[325] = 0xFFFFC15D & 0x3FBF;
        o.lIIIllllIIlll[326] = -(0xFFFFDFD3 & 0x2AEE) & (0xFFFF9BDF & 0x6FFF);
        o.lIIIllllIIlll[327] = -(0xFFFFC799 & 0x3EE7) & (0xFFFF8FBF & 0x77DF);
        o.lIIIllllIIlll[328] = -(0xFFFFC8FF & 0x7F8F) & (0xFFFFDFFF & 0x69AE);
        o.lIIIllllIIlll[329] = 0xFFFFC5E1 & 0x3B3F;
        o.lIIIllllIIlll[330] = 0xFFFFF537 & 0xBEA;
        o.lIIIllllIIlll[331] = -(0xFFFFFDDD & 0x72E3) & (0xFFFFFDF3 & 0x73EF);
        o.lIIIllllIIlll[332] = 0xFFFFB52C & 0x4BF7;
        o.lIIIllllIIlll[333] = -(0xFFFFA823 & 0x77DD) & (0xFFFFEF8F & 0x3F7F);
        o.lIIIllllIIlll[334] = -(0xFFFFE8DB & 0x57EF) & (0xFFFFEFDF & 0x5FFB);
        o.lIIIllllIIlll[335] = 0xFFFF9F5F & 0x6FB3;
        o.lIIIllllIIlll[336] = -(0xFFFFFCE3 & 0x73FD) & (0xFFFFFFFF & 0x7FF5);
        o.lIIIllllIIlll[337] = -(0xFFFFFA3B & 0x55E5) & (0xFFFFFFBF & 0x5F77);
        o.lIIIllllIIlll[338] = 0xFFFFEFD9 & 0x1F3F;
        o.lIIIllllIIlll[339] = -(0xFFFFED75 & 0x528F) & (0xFFFFCF1F & Short.MAX_VALUE);
        o.lIIIllllIIlll[340] = 0xFFFFF77F & 0x39D3;
        o.lIIIllllIIlll[341] = -(0xFFFFAEBF & 0x53E3) & (0xFFFFFFF7 & 0x33FF);
        o.lIIIllllIIlll[342] = -(0xFFFFCFFD & 0x74AB) & (0xFFFFF5FF & Short.MAX_VALUE);
        o.lIIIllllIIlll[343] = -(0xFFFFFFA5 & 0x465B) & (0xFFFFCFFF & 0x7FFA);
        o.lIIIllllIIlll[344] = -(0xFFFFA7B7 & 0x784A) & (0xFFFFE9FF & 0x3FFF);
        o.lIIIllllIIlll[345] = 0xFFFFBB11 & 0x4EEE;
        o.lIIIllllIIlll[346] = -(0xFFFFE7FE & 0x5DEB) & (0xFFFFDFFF & 0x6FEB);
        o.lIIIllllIIlll[347] = -(0xFFFFE3FF & 0x7D79) & (0xFFFFEFFF & 0x7B7C);
        o.lIIIllllIIlll[348] = -(0xFFFFBE8F & 0x5771) & (0xFFFFFFFD & 0x1FFE);
        o.lIIIllllIIlll[349] = 0xFFFFEFB7 & 0x1A4E;
        o.lIIIllllIIlll[350] = 0xFFFFEFEF & 0x36BD;
        o.lIIIllllIIlll[351] = -(0xFFFFF9FF & 0x4775) & (0xFFFFDBFF & 0x6F7D);
        o.lIIIllllIIlll[352] = 0xFFFFEFB7 & 0x36FE;
        o.lIIIllllIIlll[353] = -(0xFFFFFEE7 & 0x115F) & (0xFFFFBEFF & 0x77FE);
        o.lIIIllllIIlll[354] = -(0xFFFF9C1E & 0x7BE3) & (0xFFFFFEBB & 0x3FFF);
        o.lIIIllllIIlll[355] = 0xFFFFF9EB & 0xFDD;
        o.lIIIllllIIlll[356] = -2 & (0xFFFFDFFF & 0x2C77);
        o.lIIIllllIIlll[357] = -(0xFFFFB329 & 0x7EF7) & (0xFFFFFFFE & 0x3BFB);
        o.lIIIllllIIlll[358] = -(0xFFFFE2B9 & 0x7FCE) & (0xFFFFEFFF & 0x7EF7);
        o.lIIIllllIIlll[359] = -(0x38 ^ 0x29) & (0xFFFF8DFB & 0x7BFD);
        o.lIIIllllIIlll[360] = 0xFFFFFDEF & 0xE79;
        o.lIIIllllIIlll[361] = 0xFFFF99FB & 0x6FF5;
        o.lIIIllllIIlll[362] = 0xFFFF8C57 & Short.MAX_VALUE;
        o.lIIIllllIIlll[363] = -(0xFFFFB63F & 0x7BD2) & (0xFFFFBBF7 & Short.MAX_VALUE);
        o.lIIIllllIIlll[364] = -(0xFFFFCBD7 & 0x752D) & (0xFFFFEF7F & 0x5DD7);
        o.lIIIllllIIlll[365] = -(0xFFFFAE39 & 0x77C7) & (0xFFFFBFFB & 0x6FD7);
        o.lIIIllllIIlll[366] = -(0xFFFFED29 & 0x36F7) & (0xFFFFAFFF & 0x7DFF);
        o.lIIIllllIIlll[367] = -(0xFFFFE66F & 0x5BBB) & (0xFFFFDF7F & 0x6FFF);
        o.lIIIllllIIlll[368] = 0xFFFFDBFF & 0x2DCE;
        o.lIIIllllIIlll[369] = 0xFFFFDDB7 & 0x2FEE;
        o.lIIIllllIIlll[370] = 0xFFFFBC5F & 0x4FFD;
        o.lIIIllllIIlll[371] = 0xFFFFCDBF & 0x3FDE;
        o.lIIIllllIIlll[372] = 0xFFFFCDDB & 0x3BFD;
        o.lIIIllllIIlll[373] = -(0xFFFFFA57 & 0x35EB) & (0xFFFFFDFB & 0x3FEE);
        o.lIIIllllIIlll[374] = 0xFFFF9BFB & 0x6DD4;
        o.lIIIllllIIlll[375] = -(0xFFFFF7F7 & 0x6A4B) & (0xFFFFFFF7 & 0x6FDF);
        o.lIIIllllIIlll[376] = -(0xFFFFEB3B & 0x76CD) & (0xFFFFEFDD & 0x7BFB);
        o.lIIIllllIIlll[377] = 0xFFFFFDBE & 0xFCD;
        o.lIIIllllIIlll[378] = 0xFFFFBDFF & 0x4F99;
        o.lIIIllllIIlll[379] = 0xFFFF89D7 & Short.MAX_VALUE;
        o.lIIIllllIIlll[380] = -(85 + 49 - 102 + 97) & (0xFFFFDDFF & 0x2FE6);
        o.lIIIllllIIlll[381] = -(0xFFFFF3E9 & 0x3E1F) & (0xFFFFFFEB & 0x3F7F);
        o.lIIIllllIIlll[382] = -(0xFFFFC87D & 0x77AB) & (0xFFFFCC7E & 0x7FFD);
        o.lIIIllllIIlll[383] = 0xFFFFFFFE & 0x9F5;
        o.lIIIllllIIlll[384] = -(0xFFFFDDBB & 0x62E5) & (0xFFFFE5FF & 0x7FFE);
        o.lIIIllllIIlll[385] = -(0xFFFFEA5B & 0x1FB6) & (0xFFFFBF7F & 0x6FF7);
        o.lIIIllllIIlll[386] = 0xFFFF9DE7 & 0x6BFF;
        o.lIIIllllIIlll[387] = -(0x9D ^ 0x94) & (0xFFFFEDFF & 0x1FFD);
        o.lIIIllllIIlll[388] = -(0xFFFFF765 & 0x6E9B) & (0xFFFFEFFD & Short.MAX_VALUE);
        o.lIIIllllIIlll[389] = 0xFFFFDDF5 & 0x2F7F;
        o.lIIIllllIIlll[390] = -(0xFFFF966F & 0x7B99) & (0xFFFFBBFD & 0x5FEF);
        o.lIIIllllIIlll[391] = 0xFFFFE676 & 0x3FFD;
        o.lIIIllllIIlll[392] = 0xFFFF8FFE & 0x79EF;
        o.lIIIllllIIlll[393] = -(115 + 43 - 89 + 60) & (0xFFFFF6D6 & 0x2FFB);
        o.lIIIllllIIlll[394] = 0xFFFFCDFF & 0x3BCF;
        o.lIIIllllIIlll[395] = -(0xFFFFDA19 & 0x37FF) & (0xFFFFFFFF & 0x1F9F);
        o.lIIIllllIIlll[396] = -(0xFFFFFDEF & 0x7633) & (0xFFFFFEBE & 0x7F7F);
        o.lIIIllllIIlll[397] = -(0xFFFFEF5A & 0x51EF) & (0xFFFFFFFD & 0x67EB);
        o.lIIIllllIIlll[398] = -(0xFFFFF7DF & 0xD67) & (0xFFFFFFCF & 0xF7E);
        o.lIIIllllIIlll[399] = 0xFFFFB6EF & 0x6FB5;
        o.lIIIllllIIlll[400] = 0xFFFFFAB3 & 0xF4F;
        o.lIIIllllIIlll[401] = -(0xFFFFFB83 & 0x56FD) & (0xFFFFF7F6 & Short.MAX_VALUE);
        o.lIIIllllIIlll[402] = 0xFFFFE1A9 & 0x1F7F;
        o.lIIIllllIIlll[403] = 0xFFFF956F & 0x6BBB;
        o.lIIIllllIIlll[404] = -(0xFFFFF3BB & 0x2ED7) & (0xFFFFEFFF & 0x33BE);
        o.lIIIllllIIlll[405] = -(0xFFFFD5DD & 0x7EF3) & (0xFFFFDFFF & 0x75FD);
        o.lIIIllllIIlll[406] = -(0xFFFFE63F & 0x59D1) & (0xFFFFF7FE & 0x6EBF);
        o.lIIIllllIIlll[407] = -(0xFFFFFFE3 & 0x225D) & (0xFFFFFBFF & 0x2FFF);
        o.lIIIllllIIlll[408] = 0xFFFF8F3D & 0x7CFF;
        o.lIIIllllIIlll[409] = 0xFFFFCDDE & 0x3BE7;
        o.lIIIllllIIlll[410] = -(0xFFFFF2B7 & 0x3D4B) & (0xFFFFFDFF & 0x3E7A);
        o.lIIIllllIIlll[411] = -(0xFFFFB897 & 0x577B) & (0xFFFFB9FF & 0x5FDF);
        o.lIIIllllIIlll[412] = -(0xFFFFEBE5 & 0x769B) & (0xFFFFEFFE & 0x7FEF);
        o.lIIIllllIIlll[413] = 0xFFFFA9AE & 0x577F;
    }

    private static String lIlIIlIlIlIllll(String lllllllllllllllIIIIIIlllIlIllIII, String lllllllllllllllIIIIIIlllIlIlIlll) {
        lllllllllllllllIIIIIIlllIlIllIII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIlllIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIIlllIlIlIllI = new StringBuilder();
        char[] lllllllllllllllIIIIIIlllIlIlIlIl = lllllllllllllllIIIIIIlllIlIlIlll.toCharArray();
        int lllllllllllllllIIIIIIlllIlIlIlII = lIIIllllIIlll[0];
        char[] lllllllllllllllIIIIIIlllIlIIlllI = lllllllllllllllIIIIIIlllIlIllIII.toCharArray();
        int lllllllllllllllIIIIIIlllIlIIllIl = lllllllllllllllIIIIIIlllIlIIlllI.length;
        int lllllllllllllllIIIIIIlllIlIIllII = lIIIllllIIlll[0];
        while (o.lIlIIlIllIIIllI(lllllllllllllllIIIIIIlllIlIIllII, lllllllllllllllIIIIIIlllIlIIllIl)) {
            char lllllllllllllllIIIIIIlllIlIllIIl = lllllllllllllllIIIIIIlllIlIIlllI[lllllllllllllllIIIIIIlllIlIIllII];
            lllllllllllllllIIIIIIlllIlIlIllI.append((char)(lllllllllllllllIIIIIIlllIlIllIIl ^ lllllllllllllllIIIIIIlllIlIlIlIl[lllllllllllllllIIIIIIlllIlIlIlII % lllllllllllllllIIIIIIlllIlIlIlIl.length]));
            0;
            ++lllllllllllllllIIIIIIlllIlIlIlII;
            ++lllllllllllllllIIIIIIlllIlIIllII;
            0;
            if (2 > ((0x71 ^ 0x64 ^ (0x61 ^ 0x31)) & (25 + 63 - -104 + 46 ^ 126 + 42 - 81 + 84 ^ -1))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIIlllIlIlIllI);
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
            0;
            if (3 > 1) return n2 != 0;
            return ((58 + 87 - 43 + 109 ^ 66 + 130 - 78 + 40) & (89 + 127 - 174 + 171 ^ 101 + 74 - 96 + 73 ^ -1)) != 0;
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
                Item lllllllllllllllIIIIIIlllIlllIllI;
                BankLocation lllllllllllllllIIIIIIlllIlllIlll;
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
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!o.lIlIIlIllIIlIII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIIIllllIIlll[4]) || o.lIlIIlIllIIIlIl(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                                                            stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[5]];
                                                                                                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[lIIIllllIIlll[1]];
                                                                                                                stringArray2[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(lIIIllllIIlII[lIIIllllIIlll[7]]);
                                                                                                                Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                                                                0;
                                                                                                            }
                                                                                                        }
                                                                                                        if (o.lIlIIlIllIIIllI(e.j(lIIIllllIIlll[8]), lIIIllllIIlll[9])) {
                                                                                                            p.aP();
                                                                                                        }
                                                                                                        if (!o.lIlIIlIllIIIlll(e.j(lIIIllllIIlll[10])) || !o.lIlIIlIllIIlIIl(e.j(lIIIllllIIlll[8]), lIIIllllIIlll[9])) break block255;
                                                                                                        if (!o.lIlIIlIllIIIlll(o.aJ() ? 1 : 0)) break block256;
                                                                                                        lllllllllllllllIIIIIIlllIlllIlll = BankLocation.getNearest();
                                                                                                        if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll) && o.lIlIIlIllIIIlll(lllllllllllllllIIIIIIlllIlllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[11]];
                                                                                                            a.a(lllllllllllllllIIIIIIlllIlllIlll);
                                                                                                        }
                                                                                                        if (!o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll) || !o.lIlIIlIllIIIlIl(lllllllllllllllIIIIIIlllIlllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block256;
                                                                                                        if (o.lIlIIlIllIIIlll(Bank.isOpen() ? 1 : 0)) {
                                                                                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[9]];
                                                                                                            a.a();
                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIIlll[12]);
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!o.lIlIIlIllIIIlIl(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[13]];
                                                                                                        if (o.lIlIIlIllIIlIll(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)lIIIllllIIlll[5]);
                                                                                                            0;
                                                                                                        }
                                                                                                        if (o.lIlIIlIllIIlIll(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)lIIIllllIIlll[3]);
                                                                                                            0;
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
                                                                                0;
                                                                            }
                                                                            if (o.lIlIIlIllIIIlll(Bank.isOpen() ? 1 : 0)) {
                                                                                if (o.lIlIIlIllIIIllI(bY, lIIIllllIIlll[1])) {
                                                                                    if (o.lIlIIlIllIIIlIl(Inventory.contains((int[])f.ba) ? 1 : 0) && o.lIlIIlIllIIIllI(Movement.getRunEnergy(), lIIIllllIIlll[2])) {
                                                                                        Inventory.getFirst((int[])f.ba).interact(lIIIllllIIlII[lIIIllllIIlll[26]]);
                                                                                        Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                                        0;
                                                                                    }
                                                                                    e.w();
                                                                                    bY += lIIIllllIIlll[1];
                                                                                }
                                                                                AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[27]];
                                                                                Movement.walkTo((WorldPoint)de);
                                                                                0;
                                                                                Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                                0;
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
                                                                        0;
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
                                                                        0;
                                                                        Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                        0;
                                                                    }
                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dj), lIIIllllIIlll[6])) {
                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[31];
                                                                        lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getNearest((int[])nArray);
                                                                        String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                        stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[32]];
                                                                        if (o.lIlIIlIllIIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[33]];
                                                                            if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll)) {
                                                                                lllllllllllllllIIIIIIlllIlllIlll.interact(lIIIllllIIlII[lIIIllllIIlll[34]]);
                                                                                Time.sleepTicks((int)lIIIllllIIlll[3]);
                                                                                0;
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
                                                                        lllllllllllllllIIIIIIlllIlllIlll = Inventory.getFirst((String[])stringArray4);
                                                                        if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll)) {
                                                                            AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[38]];
                                                                            lllllllllllllllIIIIIIlllIlllIlll.interact(lIIIllllIIlII[lIIIllllIIlll[39]]);
                                                                            Time.sleepTicks((int)lIIIllllIIlll[3]);
                                                                            0;
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
                                                                                    0;
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
                                                                                    0;
                                                                                }
                                                                                if (o.lIlIIlIllIIIlIl(dU.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(cZ));
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                                    0;
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
                                                                                    lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getNearest((int[])nArray8);
                                                                                    if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll)) {
                                                                                        lllllllllllllllIIIIIIlllIlllIlll.interact(lIIIllllIIlII[lIIIllllIIlll[48]]);
                                                                                        Time.sleepTicks((int)lIIIllllIIlll[5]);
                                                                                        0;
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
                                                                                    0;
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
                                                                                    lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getNearest((int[])nArray13);
                                                                                    if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll)) {
                                                                                        lllllllllllllllIIIIIIlllIlllIlll.interact(lIIIllllIIlII[lIIIllllIIlll[52]]);
                                                                                        Time.sleepTicks((int)lIIIllllIIlll[3]);
                                                                                        0;
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
                                                                                    0;
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
                                                                                    lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getNearest((int[])nArray18);
                                                                                    if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll)) {
                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[56]];
                                                                                        int[] nArray19 = new int[lIIIllllIIlll[1]];
                                                                                        nArray19[o.lIIIllllIIlll[0]] = lIIIllllIIlll[40];
                                                                                        lllllllllllllllIIIIIIlllIlllIllI = Inventory.getFirst((int[])nArray19);
                                                                                        if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIllI)) {
                                                                                            lllllllllllllllIIIIIIlllIlllIllI.useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                                                                            Time.sleep((long)1L);
                                                                                            0;
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
                                                                                        0;
                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)de);
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                                    0;
                                                                                }
                                                                                if (o.lIlIIlIllIIIlIl(dW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)do);
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                                    0;
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
                                                                                lllllllllllllllIIIIIIlllIlllIlll = Inventory.getFirst((int[])nArray21);
                                                                                if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll)) {
                                                                                    int[] nArray22 = new int[lIIIllllIIlll[1]];
                                                                                    nArray22[o.lIIIllllIIlll[0]] = lIIIllllIIlll[65];
                                                                                    lllllllllllllllIIIIIIlllIlllIllI = TileObjects.getNearest((int[])nArray22);
                                                                                    if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIllI)) {
                                                                                        lllllllllllllllIIIIIIlllIlllIlll.useOn((TileObject)lllllllllllllllIIIIIIlllIlllIllI);
                                                                                        Time.sleepUntil(() -> {
                                                                                            boolean bl;
                                                                                            String[] stringArray = new String[lIIIllllIIlll[1]];
                                                                                            stringArray[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[327]];
                                                                                            if (o.lIlIIlIllIIlIlI(TileObjects.getNearest((String[])stringArray))) {
                                                                                                bl = lIIIllllIIlll[1];
                                                                                                0;
                                                                                                if (((0x14 ^ 2) & ~(0x14 ^ 2)) != 0) {
                                                                                                    return ((0xC8 ^ 0x85) & ~(0xD4 ^ 0x99)) != 0;
                                                                                                }
                                                                                            } else {
                                                                                                bl = lIIIllllIIlll[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)lIIIllllIIlll[66]);
                                                                                        0;
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
                                                                                        0;
                                                                                    }
                                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIllllIIlll[6])) {
                                                                                        int[] nArray24 = new int[lIIIllllIIlll[1]];
                                                                                        nArray24[o.lIIIllllIIlll[0]] = lIIIllllIIlll[70];
                                                                                        lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getNearest((int[])nArray24);
                                                                                        if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll)) {
                                                                                            lllllllllllllllIIIIIIlllIlllIlll.interact(lIIIllllIIlII[lIIIllllIIlll[71]]);
                                                                                            Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray25 = new int[lIIIllllIIlll[1]];
                                                                                        nArray25[o.lIIIllllIIlll[0]] = lIIIllllIIlll[72];
                                                                                        lllllllllllllllIIIIIIlllIlllIllI = TileObjects.getNearest((int[])nArray25);
                                                                                        if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIllI)) {
                                                                                            lllllllllllllllIIIIIIlllIlllIllI.interact(lIIIllllIIlII[lIIIllllIIlll[73]]);
                                                                                            Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                                            0;
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
                                                                                    0;
                                                                                }
                                                                                if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dp), lIIIllllIIlll[6])) {
                                                                                    int[] nArray26 = new int[lIIIllllIIlll[1]];
                                                                                    nArray26[o.lIIIllllIIlll[0]] = lIIIllllIIlll[70];
                                                                                    lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getNearest((int[])nArray26);
                                                                                    if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll)) {
                                                                                        lllllllllllllllIIIIIIlllIlllIlll.interact(lIIIllllIIlII[lIIIllllIIlll[78]]);
                                                                                        Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                                        0;
                                                                                    }
                                                                                    int[] nArray27 = new int[lIIIllllIIlll[1]];
                                                                                    nArray27[o.lIIIllllIIlll[0]] = lIIIllllIIlll[72];
                                                                                    lllllllllllllllIIIIIIlllIlllIllI = TileObjects.getNearest((int[])nArray27);
                                                                                    if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIllI)) {
                                                                                        lllllllllllllllIIIIIIlllIlllIllI.interact(lIIIllllIIlII[lIIIllllIIlll[79]]);
                                                                                        Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                                        0;
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
                                                                        0;
                                                                        Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                        0;
                                                                    }
                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dq), lIIIllllIIlll[5])) {
                                                                        int[] nArray = new int[lIIIllllIIlll[1]];
                                                                        nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[81];
                                                                        lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getNearest((int[])nArray);
                                                                        if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll)) {
                                                                            lllllllllllllllIIIIIIlllIlllIlll.interact(lIIIllllIIlII[lIIIllllIIlll[85]]);
                                                                            Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                            0;
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
                                                                                    0;
                                                                                }
                                                                                if (o.lIlIIlIllIIIlIl(Equipment.contains((int[])f.aT) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)dn);
                                                                                    0;
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
                                                                0;
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
                                                                            0;
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
                                                                            0;
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
                                                                            0;
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
                                                                                        0;
                                                                                    }
                                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dh), lIIIllllIIlll[7]) && o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIllllIIlll[6])) {
                                                                                        String[] stringArray39 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray39[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[125]];
                                                                                        lllllllllllllllIIIIIIlllIlllIlll = Inventory.getFirst((String[])stringArray39);
                                                                                        String[] stringArray40 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray40[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[126]];
                                                                                        lllllllllllllllIIIIIIlllIlllIllI = TileObjects.getNearest((String[])stringArray40);
                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[127]];
                                                                                        if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll) && o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIllI)) {
                                                                                            lllllllllllllllIIIIIIlllIlllIlll.useOn((TileObject)lllllllllllllllIIIIIIlllIlllIllI);
                                                                                            Time.sleepUntil(() -> {
                                                                                                boolean bl;
                                                                                                if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIllllIIlll[6])) {
                                                                                                    bl = lIIIllllIIlll[1];
                                                                                                    0;
                                                                                                    if (null != null) {
                                                                                                        return ((0x86 ^ 0x96 ^ (0x53 ^ 0xB)) & (0x2A ^ 0x36 ^ (0xD3 ^ 0x87) ^ -1)) != 0;
                                                                                                    }
                                                                                                } else {
                                                                                                    bl = lIIIllllIIlll[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)lIIIllllIIlll[128]);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                    if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(dg), lIIIllllIIlll[6])) {
                                                                                        String[] stringArray41 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray41[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[129]];
                                                                                        lllllllllllllllIIIIIIlllIlllIlll = Inventory.getFirst((String[])stringArray41);
                                                                                        int[] nArray31 = new int[lIIIllllIIlll[1]];
                                                                                        nArray31[o.lIIIllllIIlll[0]] = lIIIllllIIlll[130];
                                                                                        lllllllllllllllIIIIIIlllIlllIllI = TileObjects.getNearest((int[])nArray31);
                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[131]];
                                                                                        if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll) && o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIllI)) {
                                                                                            lllllllllllllllIIIIIIlllIlllIlll.useOn((TileObject)lllllllllllllllIIIIIIlllIlllIllI);
                                                                                            Time.sleepTicks((int)lIIIllllIIlll[7]);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                    if (o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dr) ? 1 : 0)) {
                                                                                        String[] stringArray42 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray42[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[132]];
                                                                                        lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getNearest((String[])stringArray42);
                                                                                        AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[133]];
                                                                                        if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll)) {
                                                                                            lllllllllllllllIIIIIIlllIlllIlll.interact(lIIIllllIIlII[lIIIllllIIlll[134]]);
                                                                                            Time.sleepTicks((int)lIIIllllIIlll[3]);
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
                                                                                            0;
                                                                                        }
                                                                                        if (o.lIlIIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(ds), lIIIllllIIlll[3])) {
                                                                                            int[] nArray33 = new int[lIIIllllIIlll[1]];
                                                                                            nArray33[o.lIIIllllIIlll[0]] = lIIIllllIIlll[145];
                                                                                            lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getNearest((int[])nArray33);
                                                                                            if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll)) {
                                                                                                lllllllllllllllIIIIIIlllIlllIlll.interact(lIIIllllIIlII[lIIIllllIIlll[146]]);
                                                                                                Time.sleepTicks((int)lIIIllllIIlll[3]);
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
                                                                                        lllllllllllllllIIIIIIlllIlllIlll = Inventory.getFirst((int[])nArray38);
                                                                                        String[] stringArray64 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray64[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[164]];
                                                                                        lllllllllllllllIIIIIIlllIlllIllI = TileObjects.getNearest((String[])stringArray64);
                                                                                        if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll) && o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIllI)) {
                                                                                            lllllllllllllllIIIIIIlllIlllIlll.useOn((TileObject)lllllllllllllllIIIIIIlllIlllIllI);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)dr), (int)lIIIllllIIlll[165]);
                                                                                            0;
                                                                                        }
                                                                                        while (o.lIlIIlIllIIlIII(Players.getLocal().getWorldLocation().distanceTo(du), lIIIllllIIlll[3])) {
                                                                                            Movement.walkTo((WorldPoint)du);
                                                                                            0;
                                                                                            Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                                                            0;
                                                                                            0;
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
                                                                                        lllllllllllllllIIIIIIlllIlllIlll = Inventory.getFirst((int[])nArray41);
                                                                                        String[] stringArray72 = new String[lIIIllllIIlll[1]];
                                                                                        stringArray72[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[174]];
                                                                                        lllllllllllllllIIIIIIlllIlllIllI = TileObjects.getNearest((String[])stringArray72);
                                                                                        if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll) && o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIllI)) {
                                                                                            lllllllllllllllIIIIIIlllIlllIllI.interact(lIIIllllIIlII[lIIIllllIIlll[175]]);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)dr), (int)lIIIllllIIlll[165]);
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
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIIIllllIIlll[6]);
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
                                                lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getFirstAt((WorldPoint)cK, (int[])nArray45);
                                                String[] stringArray93 = new String[lIIIllllIIlll[1]];
                                                stringArray93[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[201]];
                                                Inventory.getFirst((String[])stringArray93).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                                Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                0;
                                                String[] stringArray94 = new String[lIIIllllIIlll[1]];
                                                stringArray94[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                                Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                0;
                                                String[] stringArray95 = new String[lIIIllllIIlll[1]];
                                                stringArray95[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                                Time.sleepTicks((int)lIIIllllIIlll[1]);
                                                0;
                                                0;
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
                                                0;
                                                Time.sleepTicks((int)lIIIllllIIlll[5]);
                                                0;
                                            }
                                            if (!o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dz) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[lIIIllllIIlll[1]];
                                            nArray47[o.lIIIllllIIlll[0]] = lIIIllllIIlll[200];
                                            lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getFirstAt((WorldPoint)cL, (int[])nArray47);
                                            String[] stringArray109 = new String[lIIIllllIIlll[1]];
                                            stringArray109[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                            Time.sleepTicks((int)lIIIllllIIlll[1]);
                                            0;
                                            String[] stringArray110 = new String[lIIIllllIIlll[1]];
                                            stringArray110[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                            Time.sleepTicks((int)lIIIllllIIlll[1]);
                                            0;
                                            String[] stringArray111 = new String[lIIIllllIIlll[1]];
                                            stringArray111[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                            Time.sleepTicks((int)lIIIllllIIlll[1]);
                                            0;
                                            0;
                                            if (null != null) break;
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
                                            0;
                                            Time.sleepTicks((int)lIIIllllIIlll[5]);
                                            0;
                                        }
                                        if (!o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dy) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[lIIIllllIIlll[1]];
                                        nArray49[o.lIIIllllIIlll[0]] = lIIIllllIIlll[200];
                                        lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getFirstAt((WorldPoint)cM, (int[])nArray49);
                                        String[] stringArray125 = new String[lIIIllllIIlll[1]];
                                        stringArray125[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                        Time.sleepTicks((int)lIIIllllIIlll[1]);
                                        0;
                                        String[] stringArray126 = new String[lIIIllllIIlll[1]];
                                        stringArray126[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                        Time.sleepTicks((int)lIIIllllIIlll[1]);
                                        0;
                                        String[] stringArray127 = new String[lIIIllllIIlll[1]];
                                        stringArray127[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                        Time.sleepTicks((int)lIIIllllIIlll[1]);
                                        0;
                                        0;
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
                                        0;
                                        Time.sleepTicks((int)lIIIllllIIlll[5]);
                                        0;
                                    }
                                    if (!o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dx) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[lIIIllllIIlll[1]];
                                    nArray51[o.lIIIllllIIlll[0]] = lIIIllllIIlll[200];
                                    lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getFirstAt((WorldPoint)cN, (int[])nArray51);
                                    String[] stringArray141 = new String[lIIIllllIIlll[1]];
                                    stringArray141[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);
                                    0;
                                    String[] stringArray142 = new String[lIIIllllIIlll[1]];
                                    stringArray142[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);
                                    0;
                                    String[] stringArray143 = new String[lIIIllllIIlll[1]];
                                    stringArray143[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);
                                    0;
                                    0;
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
                                    0;
                                    Time.sleepTicks((int)lIIIllllIIlll[5]);
                                    0;
                                }
                                if (!o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dw) ? 1 : 0)) continue;
                                int[] nArray53 = new int[lIIIllllIIlll[1]];
                                nArray53[o.lIIIllllIIlll[0]] = lIIIllllIIlll[200];
                                lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getFirstAt((WorldPoint)cO, (int[])nArray53);
                                String[] stringArray157 = new String[lIIIllllIIlll[1]];
                                stringArray157[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[272]];
                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray157) ? 1 : 0)) {
                                    String[] stringArray158 = new String[lIIIllllIIlll[1]];
                                    stringArray158[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[273]];
                                    Inventory.getFirst((String[])stringArray158).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);
                                    0;
                                }
                                String[] stringArray159 = new String[lIIIllllIIlll[1]];
                                stringArray159[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[274]];
                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[lIIIllllIIlll[1]];
                                    stringArray160[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);
                                    0;
                                }
                                String[] stringArray161 = new String[lIIIllllIIlll[1]];
                                stringArray161[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[276]];
                                if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[lIIIllllIIlll[1]];
                                    stringArray162[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                    Time.sleepTicks((int)lIIIllllIIlll[1]);
                                    0;
                                }
                                0;
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
                                0;
                            }
                            if (!o.lIlIIlIllIIIlIl(Players.getLocal().getWorldLocation().equals((Object)dv) ? 1 : 0)) continue;
                            int[] nArray55 = new int[lIIIllllIIlll[1]];
                            nArray55[o.lIIIllllIIlll[0]] = lIIIllllIIlll[200];
                            lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getFirstAt((WorldPoint)cP, (int[])nArray55);
                            String[] stringArray176 = new String[lIIIllllIIlll[1]];
                            stringArray176[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[293]];
                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray176) ? 1 : 0)) {
                                String[] stringArray177 = new String[lIIIllllIIlll[1]];
                                stringArray177[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[294]];
                                Inventory.getFirst((String[])stringArray177).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                Time.sleepTicks((int)lIIIllllIIlll[1]);
                                0;
                            }
                            String[] stringArray178 = new String[lIIIllllIIlll[1]];
                            stringArray178[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[295]];
                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[lIIIllllIIlll[1]];
                                stringArray179[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                Time.sleepTicks((int)lIIIllllIIlll[1]);
                                0;
                            }
                            String[] stringArray180 = new String[lIIIllllIIlll[1]];
                            stringArray180[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[297]];
                            if (o.lIlIIlIllIIIlIl(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[lIIIllllIIlll[1]];
                                stringArray181[o.lIIIllllIIlll[0]] = lIIIllllIIlII[lIIIllllIIlll[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                Time.sleepTicks((int)lIIIllllIIlll[1]);
                                0;
                            }
                            0;
                            if (null != null) break;
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
                                lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getNearest((int[])nArray);
                                int[] nArray56 = new int[lIIIllllIIlll[1]];
                                nArray56[o.lIIIllllIIlll[0]] = lIIIllllIIlll[304];
                                lllllllllllllllIIIIIIlllIlllIllI = Inventory.getFirst((int[])nArray56);
                                if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll) && o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIllI)) {
                                    lllllllllllllllIIIIIIlllIlllIllI.useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                                    Time.sleepTicks((int)lIIIllllIIlll[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (o.lIlIIlIllIIllIl(e.j(lIIIllllIIlll[10]), lIIIllllIIlll[13])) {
                    AccBuilderRat.c = lIIIllllIIlII[lIIIllllIIlll[305]];
                    int[] nArray = new int[lIIIllllIIlll[1]];
                    nArray[o.lIIIllllIIlll[0]] = lIIIllllIIlll[306];
                    lllllllllllllllIIIIIIlllIlllIlll = TileObjects.getNearest((int[])nArray);
                    int[] nArray57 = new int[lIIIllllIIlll[1]];
                    nArray57[o.lIIIllllIIlll[0]] = lIIIllllIIlll[307];
                    lllllllllllllllIIIIIIlllIlllIllI = Inventory.getFirst((int[])nArray57);
                    if (o.lIlIIlIllIIIllI(co, lIIIllllIIlll[1])) {
                        P.iN += lIIIllllIIlll[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIllllIIlll[1];
                        P.iN = lIIIllllIIlll[0];
                        cp = lIIIllllIIlll[0];
                    }
                    if (o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIlll) && o.lIlIIlIllIIlIlI(lllllllllllllllIIIIIIlllIlllIllI)) {
                        lllllllllllllllIIIIIIlllIlllIllI.useOn((TileObject)lllllllllllllllIIIIIIlllIlllIlll);
                        Time.sleepTicks((int)lIIIllllIIlll[7]);
                        0;
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
                    0;
                }
                if (o.lIlIIlIllIIIlIl(Equipment.contains((int[])f.aS) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aS).interact(lIIIllllIIlII[lIIIllllIIlll[313]]);
                    Time.sleepTicks((int)lIIIllllIIlll[6]);
                    0;
                }
            }
        }
    }

    private static boolean lIlIIlIllIIlllI(int n2, int n3) {
        return n2 != n3;
    }
}

