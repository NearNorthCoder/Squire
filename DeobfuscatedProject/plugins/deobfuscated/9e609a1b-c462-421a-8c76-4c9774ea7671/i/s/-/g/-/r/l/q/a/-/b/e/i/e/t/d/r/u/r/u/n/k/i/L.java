/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Widgets
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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;

public class L
implements M {
    private static final /* synthetic */ WorldPoint ib;
    private static final /* synthetic */ WorldPoint id;
    public static /* synthetic */ List<d> bA;
    private static final /* synthetic */ WorldPoint ia;
    private static final /* synthetic */ WorldPoint ic;
    private static final /* synthetic */ WorldPoint hZ;
    static /* synthetic */ int co;
    static /* synthetic */ boolean cp;
    public static final /* synthetic */ String[] hX;
    public static /* synthetic */ long g;
    public static /* synthetic */ boolean by;
    private static /* synthetic */ String[] lIIlIIIIllIIl;
    private static final /* synthetic */ WorldPoint hY;
    static /* synthetic */ int bY;
    private static /* synthetic */ int[] lIIlIIIIllIlI;

    private static boolean lIlIlIIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static int lIlIlIIIIIllIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIlIlIIIIIllIll(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIIIIIlIlIl(String llllllllllllllIllllllIlIlIIIIIlI, String llllllllllllllIllllllIlIlIIIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllllIlIlIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllIlIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIIIIllIlI[18]), "DES");
            Cipher llllllllllllllIllllllIlIlIIIIlII = Cipher.getInstance("DES");
            llllllllllllllIllllllIlIlIIIIlII.init(lIIlIIIIllIlI[3], llllllllllllllIllllllIlIlIIIIlIl);
            return new String(llllllllllllllIllllllIlIlIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllIlIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllllIlIlIIIIIll) {
            llllllllllllllIllllllIlIlIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIIIlllll(int n2) {
        return n2 > 0;
    }

    private static String lIlIlIIIIIlIlII(String llllllllllllllIllllllIlIlIlIIlIl, String llllllllllllllIllllllIlIlIlIIllI) {
        try {
            SecretKeySpec llllllllllllllIllllllIlIlIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllIlIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllllIlIlIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllllIlIlIlIlIIl.init(lIIlIIIIllIlI[3], llllllllllllllIllllllIlIlIlIlIlI);
            return new String(llllllllllllllIllllllIlIlIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllllIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllllIlIlIlIlIII) {
            llllllllllllllIllllllIlIlIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIIlIIIll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int Y() {
        try {
            L.cB();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 == 0) {
            return (0xF ^ 0x2C) & ~(0x9D ^ 0xBE);
        }
        return lIIlIIIIllIlI[54];
    }

    private static void W() {
        d llllllllllllllIllllllIlIlIllIIIl;
        Object llllllllllllllIllllllIlIlIllIIlI;
        int[] nArray = new int[lIIlIIIIllIlI[1]];
        nArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[10];
        if (L.lIlIlIIIIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIlIIIIllIlI[10], lIIlIIIIllIlI[1], lIIlIIIIllIlI[46]);
            bA.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIlIIIIllIlI[1]];
        nArray2[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[14];
        if (L.lIlIlIIIIIlllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllIllllllIlIlIllIIlI = new d(lIIlIIIIllIlI[14], lIIlIIIIllIlI[1], lIIlIIIIllIlI[47]);
            bA.add((d)llllllllllllllIllllllIlIlIllIIlI);
            0;
        }
        int[] nArray3 = new int[lIIlIIIIllIlI[1]];
        nArray3[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[4];
        if (L.lIlIlIIIIIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllIllllllIlIlIllIIlI = new d(lIIlIIIIllIlI[4], lIIlIIIIllIlI[48], lIIlIIIIllIlI[49]);
            bA.add((d)llllllllllllllIllllllIlIlIllIIlI);
            0;
        }
        if (L.lIlIlIIIIIlllIl(Bank.contains((Predicate)(llllllllllllllIllllllIlIlIllIIlI = item -> item.getName().toLowerCase().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[56]]))) ? 1 : 0)) {
            llllllllllllllIllllllIlIlIllIIIl = new d(lIIlIIIIllIlI[50], lIIlIIIIllIlI[7], lIIlIIIIllIlI[51]);
            bA.add(llllllllllllllIllllllIlIlIllIIIl);
            0;
        }
        int[] nArray4 = new int[lIIlIIIIllIlI[1]];
        nArray4[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[11];
        if (L.lIlIlIIIIIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllIllllllIlIlIllIIIl = new d(lIIlIIIIllIlI[11], lIIlIIIIllIlI[15], lIIlIIIIllIlI[52]);
            bA.add(llllllllllllllIllllllIlIlIllIIIl);
            0;
        }
        int[] nArray5 = new int[lIIlIIIIllIlI[1]];
        nArray5[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[16];
        if (L.lIlIlIIIIIlllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllllllllllllIllllllIlIlIllIIIl = new d(lIIlIIIIllIlI[16], lIIlIIIIllIlI[15], lIIlIIIIllIlI[52]);
            bA.add(llllllllllllllIllllllIlIlIllIIIl);
            0;
        }
        int[] nArray6 = new int[lIIlIIIIllIlI[1]];
        nArray6[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[13];
        if (L.lIlIlIIIIIlllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllllllllllllIllllllIlIlIllIIIl = new d(lIIlIIIIllIlI[13], lIIlIIIIllIlI[53], lIIlIIIIllIlI[52]);
            bA.add(llllllllllllllIllllllIlIlIllIIIl);
            0;
        }
        int[] nArray7 = new int[lIIlIIIIllIlI[1]];
        nArray7[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[12];
        if (L.lIlIlIIIIIlllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            llllllllllllllIllllllIlIlIllIIIl = new d(lIIlIIIIllIlI[12], lIIlIIIIllIlI[7], h.bv);
            bA.add(llllllllllllllIllllllIlIlIllIIIl);
            0;
        }
    }

    private static boolean lIlIlIIIIlIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        L.lIlIlIIIIIllIII();
        L.lIlIlIIIIIlIlll();
        String[] stringArray = new String[lIIlIIIIllIlI[24]];
        stringArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[62]];
        stringArray[L.lIIlIIIIllIlI[1]] = lIIlIIIIllIIl[lIIlIIIIllIlI[63]];
        stringArray[L.lIIlIIIIllIlI[3]] = lIIlIIIIllIIl[lIIlIIIIllIlI[64]];
        stringArray[L.lIIlIIIIllIlI[5]] = lIIlIIIIllIIl[lIIlIIIIllIlI[65]];
        stringArray[L.lIIlIIIIllIlI[6]] = lIIlIIIIllIIl[lIIlIIIIllIlI[66]];
        stringArray[L.lIIlIIIIllIlI[7]] = lIIlIIIIllIIl[lIIlIIIIllIlI[67]];
        stringArray[L.lIIlIIIIllIlI[9]] = lIIlIIIIllIIl[lIIlIIIIllIlI[68]];
        stringArray[L.lIIlIIIIllIlI[17]] = lIIlIIIIllIIl[lIIlIIIIllIlI[69]];
        stringArray[L.lIIlIIIIllIlI[18]] = lIIlIIIIllIIl[lIIlIIIIllIlI[70]];
        stringArray[L.lIIlIIIIllIlI[19]] = lIIlIIIIllIIl[lIIlIIIIllIlI[71]];
        stringArray[L.lIIlIIIIllIlI[15]] = lIIlIIIIllIIl[lIIlIIIIllIlI[72]];
        stringArray[L.lIIlIIIIllIlI[20]] = lIIlIIIIllIIl[lIIlIIIIllIlI[73]];
        stringArray[L.lIIlIIIIllIlI[21]] = lIIlIIIIllIIl[lIIlIIIIllIlI[48]];
        stringArray[L.lIIlIIIIllIlI[22]] = lIIlIIIIllIIl[lIIlIIIIllIlI[74]];
        stringArray[L.lIIlIIIIllIlI[23]] = lIIlIIIIllIIl[lIIlIIIIllIlI[75]];
        hX = stringArray;
        hY = new WorldPoint(lIIlIIIIllIlI[76], lIIlIIIIllIlI[77], lIIlIIIIllIlI[0]);
        hZ = new WorldPoint(lIIlIIIIllIlI[78], lIIlIIIIllIlI[79], lIIlIIIIllIlI[0]);
        ia = new WorldPoint(lIIlIIIIllIlI[80], lIIlIIIIllIlI[81], lIIlIIIIllIlI[0]);
        ib = new WorldPoint(lIIlIIIIllIlI[82], lIIlIIIIllIlI[83], lIIlIIIIllIlI[0]);
        ic = new WorldPoint(lIIlIIIIllIlI[84], lIIlIIIIllIlI[85], lIIlIIIIllIlI[0]);
        id = new WorldPoint(lIIlIIIIllIlI[86], lIIlIIIIllIlI[87], lIIlIIIIllIlI[0]);
        bA = new ArrayList<d>();
        bY = lIIlIIIIllIlI[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        String[] stringArray = new String[lIIlIIIIllIlI[1]];
        stringArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[45]];
        if (L.lIlIlIIIIIllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            int[] nArray = new int[lIIlIIIIllIlI[1]];
            nArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[4];
            if (L.lIlIlIIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIlIIIIllIlI[1];
                0;
                if (((81 + 100 - 123 + 70 ^ 43 + 110 - 149 + 152) & (0xD3 ^ 0x93 ^ (0xF ^ 0x53) ^ -1)) >= 0) return n2 != 0;
                return ((0xE6 ^ 0xC2 ^ (0x10 ^ 0x54)) & (0xA3 ^ 0x82 ^ (0xEE ^ 0xAF) ^ -1)) != 0;
            }
        }
        n2 = lIIlIIIIllIlI[0];
        return n2 != 0;
    }

    private static int lIlIlIIIIIllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIlIIIIlIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlIlIIIIIllIII() {
        lIIlIIIIllIlI = new int[89];
        L.lIIlIIIIllIlI[0] = (0xBE ^ 0x8B ^ (0x6B ^ 0x4F)) & (0x53 ^ 0x1E ^ (0x32 ^ 0x6E) ^ -1);
        L.lIIlIIIIllIlI[1] = 1;
        L.lIIlIIIIllIlI[2] = 213 + 86 - 278 + 221 ^ 1 + 138 - 67 + 108;
        L.lIIlIIIIllIlI[3] = 2;
        L.lIIlIIIIllIlI[4] = -(0xFFFFDE9F & 0x35E1) & (0xFFFF95FB & Short.MAX_VALUE);
        L.lIIlIIIIllIlI[5] = 3;
        L.lIIlIIIIllIlI[6] = 0xD ^ 0x27 ^ (0xB4 ^ 0x9A);
        L.lIIlIIIIllIlI[7] = 0x28 ^ 0x2D;
        L.lIIlIIIIllIlI[8] = -(0xFFFFE9FD & 0x5E27) & (0xFFFFDFED & 0x7BBE);
        L.lIIlIIIIllIlI[9] = 0x1A ^ 0x1C;
        L.lIIlIIIIllIlI[10] = -(0xFFFFDD37 & 0x23FE) & (0xFFFFAFFF & Short.MAX_VALUE);
        L.lIIlIIIIllIlI[11] = 0xFFFFBF6E & 0x5FD9;
        L.lIIlIIIIllIlI[12] = 0xFFFFF5DD & 0x3B73;
        L.lIIlIIIIllIlI[13] = -(0x69 ^ 0x48) & (0xFFFFDF67 & 0x3FFF);
        L.lIIlIIIIllIlI[14] = -(0xFFFFFE55 & 0x71AF) & (0xFFFFFBBF & 0x77FC);
        L.lIIlIIIIllIlI[15] = 129 + 8 - 60 + 55 ^ 27 + 110 - 44 + 49;
        L.lIIlIIIIllIlI[16] = 0xFFFFFFC9 & 0x1F7F;
        L.lIIlIIIIllIlI[17] = 0x4A ^ 0x64 ^ (0xB8 ^ 0x91);
        L.lIIlIIIIllIlI[18] = 0x97 ^ 0x9F;
        L.lIIlIIIIllIlI[19] = 0xC4 ^ 0x9F ^ (0x5F ^ 0xD);
        L.lIIlIIIIllIlI[20] = 0x33 ^ 0x60 ^ (0x46 ^ 0x1E);
        L.lIIlIIIIllIlI[21] = 0x9B ^ 0xAE ^ (0x17 ^ 0x2E);
        L.lIIlIIIIllIlI[22] = 0x29 ^ 0x24;
        L.lIIlIIIIllIlI[23] = 0x2F ^ 0x21;
        L.lIIlIIIIllIlI[24] = 65 + 18 - 51 + 101 ^ 81 + 121 - 173 + 109;
        L.lIIlIIIIllIlI[25] = 0xAF ^ 0xBF;
        L.lIIlIIIIllIlI[26] = 0xBB ^ 0xAA;
        L.lIIlIIIIllIlI[27] = 0x2E ^ 0x5B ^ (0x1E ^ 0x79);
        L.lIIlIIIIllIlI[28] = 120 + 91 - 116 + 65 ^ 134 + 9 - 78 + 114;
        L.lIIlIIIIllIlI[29] = 8 + 9 - -60 + 76 ^ 97 + 101 - 66 + 9;
        L.lIIlIIIIllIlI[30] = 0x58 ^ 0x4D;
        L.lIIlIIIIllIlI[31] = 0xA7 ^ 0xA9 ^ (0x37 ^ 0x2F);
        L.lIIlIIIIllIlI[32] = 0x14 ^ 3;
        L.lIIlIIIIllIlI[33] = 0x54 ^ 0x4C;
        L.lIIlIIIIllIlI[34] = 0x1F ^ 6;
        L.lIIlIIIIllIlI[35] = 0x46 ^ 0x5C;
        L.lIIlIIIIllIlI[36] = 0xA5 ^ 0xBE;
        L.lIIlIIIIllIlI[37] = 0x41 ^ 0x5D;
        L.lIIlIIIIllIlI[38] = -(0xFFFFBDEE & 0x6757) & (0xFFFFFFED & 0x7F77);
        L.lIIlIIIIllIlI[39] = 7 + 101 - 79 + 147 + (0xE3 ^ 0x8A) - (81 + 3 - -29 + 64) + (51 + 115 - 97 + 67);
        L.lIIlIIIIllIlI[40] = 0x8E ^ 0x93;
        L.lIIlIIIIllIlI[41] = 62 + 27 - -11 + 37 ^ 117 + 8 - -11 + 15;
        L.lIIlIIIIllIlI[42] = 0x65 ^ 0x38 ^ (0x57 ^ 0x15);
        L.lIIlIIIIllIlI[43] = 0x21 ^ 0x7E ^ 98 + 114 - 209 + 124;
        L.lIIlIIIIllIlI[44] = 0x5E ^ 0x2A ^ (0xCB ^ 0x9E);
        L.lIIlIIIIllIlI[45] = 0xB4 ^ 0x96;
        L.lIIlIIIIllIlI[46] = 0xFFFFFE7F & 0x3F9C;
        L.lIIlIIIIllIlI[47] = -(101 + 168 - 143 + 67) & (0xFFFF97DC & 0x7FEF);
        L.lIIlIIIIllIlI[48] = 59 + 4 - -72 + 23 ^ 84 + 166 - 83 + 2;
        L.lIIlIIIIllIlI[49] = -(0xFFFFDD39 & 0x3EC7) & (0xFFFF9FFC & 0x7DF7);
        L.lIIlIIIIllIlI[50] = -(0xFFFFD43B & 0x6BF6) & (0xFFFFEEFD & Short.MAX_VALUE);
        L.lIIlIIIIllIlI[51] = -(0xFFFFDF77 & 0x349F) & (0xFFFFFDFE & 0x77BF);
        L.lIIlIIIIllIlI[52] = 0xFFFFEF6C & 0x17FF;
        L.lIIlIIIIllIlI[53] = 0xA9 ^ 0x8A ^ (1 ^ 0xA);
        L.lIIlIIIIllIlI[54] = 0xDD ^ 0xB9;
        L.lIIlIIIIllIlI[55] = 61 + 90 - 31 + 55 ^ 57 + 129 - 66 + 20;
        L.lIIlIIIIllIlI[56] = 0x7A ^ 6 ^ (0x1A ^ 0x42);
        L.lIIlIIIIllIlI[57] = 0xD3 ^ 0x90 ^ (0xE5 ^ 0x83);
        L.lIIlIIIIllIlI[58] = 0x76 ^ 0x50;
        L.lIIlIIIIllIlI[59] = 0xDD ^ 0x95 ^ (0x46 ^ 0x29);
        L.lIIlIIIIllIlI[60] = 0x8D ^ 0xB1 ^ (0xA2 ^ 0xB7);
        L.lIIlIIIIllIlI[61] = 0x4F ^ 0 ^ (0xCA ^ 0xAF);
        L.lIIlIIIIllIlI[62] = 0xBA ^ 0x91;
        L.lIIlIIIIllIlI[63] = 0x4A ^ 0x74 ^ (0xB3 ^ 0xA1);
        L.lIIlIIIIllIlI[64] = 0xB9 ^ 0xC3 ^ (0x35 ^ 0x62);
        L.lIIlIIIIllIlI[65] = 0xB5 ^ 0x8D ^ (0x9C ^ 0x8A);
        L.lIIlIIIIllIlI[66] = 0xDA ^ 0x9A ^ (0x6D ^ 2);
        L.lIIlIIIIllIlI[67] = 0x2D ^ 0x1D;
        L.lIIlIIIIllIlI[68] = 0x3C ^ 0xD ^ (0x12 ^ 0x14) & ~(6 ^ 0);
        L.lIIlIIIIllIlI[69] = 0x70 ^ 0x25 ^ (0xA0 ^ 0xC7);
        L.lIIlIIIIllIlI[70] = 38 + 44 - -41 + 24 ^ 147 + 151 - 213 + 75;
        L.lIIlIIIIllIlI[71] = 0x8F ^ 0xBB;
        L.lIIlIIIIllIlI[72] = 0xE5 ^ 0xA7 ^ (0x52 ^ 0x25);
        L.lIIlIIIIllIlI[73] = 21 + 126 - 131 + 226 ^ 46 + 152 - 169 + 167;
        L.lIIlIIIIllIlI[74] = 6 ^ 0x27 ^ (0x5F ^ 0x46);
        L.lIIlIIIIllIlI[75] = 0xB3 ^ 0xC4 ^ (0x74 ^ 0x3A);
        L.lIIlIIIIllIlI[76] = -(0x26 ^ 0x65) & (0xFFFFBCFF & 0x4FDF);
        L.lIIlIIIIllIlI[77] = -(0xFFFFF39D & 0x7E67) & (0xFFFFFEEE & 0x7FBD);
        L.lIIlIIIIllIlI[78] = -(0xFFFFCFAB & 0x7375) & (0xFFFFCFBF & 0x7FFE);
        L.lIIlIIIIllIlI[79] = -(0xFFFFD8FF & 0x6777) & (0xFFFFECFF & 0x5FFF);
        L.lIIlIIIIllIlI[80] = 0xFFFFDCB7 & 0x2FCB;
        L.lIIlIIIIllIlI[81] = -(0xFFFFEF7B & 0x32F7) & (0xFFFFBFFE & 0x6EFF);
        L.lIIlIIIIllIlI[82] = 0xFFFFBCFD & 0x4F27;
        L.lIIlIIIIllIlI[83] = 0xFFFF8EFF & 0x7DC0;
        L.lIIlIIIIllIlI[84] = -(0xFFFFEFB9 & 0x727F) & (0xFFFFFEBF & 0x6F7E);
        L.lIIlIIIIllIlI[85] = 0xFFFFEEFB & 0x1DBF;
        L.lIIlIIIIllIlI[86] = 0xFFFF8BFE & 0x7FEF;
        L.lIIlIIIIllIlI[87] = -(0xFFFFF456 & 0x7BBB) & (0xFFFFFDFF & 0x7EBF);
        L.lIIlIIIIllIlI[88] = 0x55 ^ 0x6F;
    }

    private static void lIlIlIIIIIlIlll() {
        lIIlIIIIllIIl = new String[lIIlIIIIllIlI[88]];
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[0]] = L."Buying items";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[1]] = L."Finished buying items, switching back to quest";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[3]] = L."Drink";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[5]] = L."Eat";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[6]] = L."Nav to bank";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[7]] = L."Handling banking";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[9]] = L."We are missing quest supplies, switching to BUYING";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[17]] = L."Nav to start";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[18]] = L."Interact npc";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[19]] = L."Drop";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[15]] = L."Veos";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[20]] = L."Treasure scroll";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[21]] = L."Wear";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[22]] = L."Wear";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[23]] = L."Nav to dig 1";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[24]] = L."Spade";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[25]] = L."Dig";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[26]] = L."Nav to dig 2";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[27]] = L."Spade";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[28]] = L."Dig";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[29]] = L."Nav to dig 3";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[30]] = L."Spade";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[31]] = L."Dig";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[32]] = L."Nav to dig 4";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[33]] = L."Spade";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[34]] = L."Dig";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[35]] = L."Nav to veos finish";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[36]] = L."Interact npc";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[37]] = L."Veos";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[40]] = L."Rubbing lamp";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[41]] = L."Rub";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[42]] = L."Selecting slayer";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[43]] = L."Slayer";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[44]] = L."Confirm";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[45]] = L."Spade";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[55]] = L."X marks the spot quest";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[56]] = L."ring of wealth (";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[57]] = L."wealth";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[58]] = L."wealth";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[59]] = L."wealth";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[53]] = L."glory";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[60]] = L."glory";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[61]] = L."glory";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[62]] = L."Ok, I'm up for an adventure.";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[63]] = L."A glass of your finest ale please.";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[64]] = L."Morgan needs your help!";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[65]] = L."Yes.";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[66]] = L."I'm looking for a quest!";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[67]] = L."Ok, let me help then.";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[68]] = L."Father Aereck sent me to talk to you.";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[69]] = L."He's got a ghost haunting his graveyard.";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[70]] = L."Yep, now tell me what the problem is.";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[71]] = L."Sure.";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[72]] = L."I'm wearing an amulet of ghost speak!";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[73]] = L."Yes, I'm sure.";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[48]] = L."How can I help?";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[74]] = L."I'm looking for a quest.";
        L.lIIlIIIIllIIl[L.lIIlIIIIllIlI[75]] = L."Can I help?";
    }

    private static String lIlIlIIIIIlIllI(String llllllllllllllIllllllIlIlIIlIIlI, String llllllllllllllIllllllIlIlIIlIllI) {
        llllllllllllllIllllllIlIlIIlIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllllllIlIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllllIlIlIIlIlIl = new StringBuilder();
        char[] llllllllllllllIllllllIlIlIIlIlII = llllllllllllllIllllllIlIlIIlIllI.toCharArray();
        int llllllllllllllIllllllIlIlIIlIIll = lIIlIIIIllIlI[0];
        char[] llllllllllllllIllllllIlIlIIIllIl = llllllllllllllIllllllIlIlIIlIIlI.toCharArray();
        int llllllllllllllIllllllIlIlIIIllII = llllllllllllllIllllllIlIlIIIllIl.length;
        int llllllllllllllIllllllIlIlIIIlIll = lIIlIIIIllIlI[0];
        while (L.lIlIlIIIIIlllII(llllllllllllllIllllllIlIlIIIlIll, llllllllllllllIllllllIlIlIIIllII)) {
            char llllllllllllllIllllllIlIlIIllIII = llllllllllllllIllllllIlIlIIIllIl[llllllllllllllIllllllIlIlIIIlIll];
            llllllllllllllIllllllIlIlIIlIlIl.append((char)(llllllllllllllIllllllIlIlIIllIII ^ llllllllllllllIllllllIlIlIIlIlII[llllllllllllllIllllllIlIlIIlIIll % llllllllllllllIllllllIlIlIIlIlII.length]));
            0;
            ++llllllllllllllIllllllIlIlIIlIIll;
            ++llllllllllllllIllllllIlIlIIIlIll;
            0;
            if (1 != -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllllIlIlIIlIlIl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean aa() {
        int n2;
        if (L.lIlIlIIIIlIIlII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[18])) {
            int[] nArray = new int[lIIlIIIIllIlI[1]];
            nArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[38];
            if (L.lIlIlIIIIIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIlIIIIllIlI[1];
                0;
                if (((0x6A ^ 0x3A ^ (0x43 ^ 0x21)) & (0xB1 ^ 0xAA ^ (0x9C ^ 0xB5) ^ -1)) < (100 + 128 - 142 + 48 ^ 43 + 20 - 35 + 102)) return n2 != 0;
                return ((0x42 ^ 0x39 ^ (0xCC ^ 0xA7)) & (0x4C ^ 0x36 ^ (0x1B ^ 0x71) ^ -1) & ((52 + 83 - 64 + 118 ^ 117 + 143 - 132 + 53) & (0xF9 ^ 0xC0 ^ (0xAA ^ 0x9B) ^ -1) ^ -1)) != 0;
            }
        }
        n2 = lIIlIIIIllIlI[0];
        return n2 != 0;
    }

    private static boolean lIlIlIIIIlIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIIIIlIIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIlIIIIIllllI(int n2) {
        return n2 < 0;
    }

    public static void cB() {
        if (L.lIlIlIIIIIllIll(by ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[0]];
            b.a(bA);
            if (L.lIlIlIIIIIlllII(bA.size(), lIIlIIIIllIlI[1])) {
                System.out.println(lIIlIIIIllIIl[lIIlIIIIllIlI[1]]);
                by = lIIlIIIIllIlI[0];
            }
        }
        if (L.lIlIlIIIIIlllIl(by ? 1 : 0)) {
            block49: {
                BankLocation llllllllllllllIllllllIlIlIllIllI;
                if (L.lIlIlIIIIIllIll(Inventory.contains((int[])f.ba) ? 1 : 0) && L.lIlIlIIIIIlllII(Movement.getRunEnergy(), lIIlIIIIllIlI[2])) {
                    Inventory.getFirst((int[])f.ba).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[3]]);
                    Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                    0;
                }
                if (L.lIlIlIIIIIllllI(L.lIlIlIIIIIllIIl(e.v(), 70.0))) {
                    int[] nArray = new int[lIIlIIIIllIlI[1]];
                    nArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[4];
                    if (L.lIlIlIIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIlIIIIllIlI[1]];
                        nArray2[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[4];
                        Inventory.getFirst((int[])nArray2).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[5]]);
                    }
                }
                if (L.lIlIlIIIIIlllIl(Movement.isRunEnabled() ? 1 : 0) && L.lIlIlIIIIIlllll(Movement.getRunEnergy())) {
                    Movement.toggleRun();
                }
                if (L.lIlIlIIIIIlllIl(L.S() ? 1 : 0) && L.lIlIlIIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                    llllllllllllllIllllllIlIlIllIllI = BankLocation.getNearest();
                    if (L.lIlIlIIIIlIIIII(llllllllllllllIllllllIlIlIllIllI) && L.lIlIlIIIIIlllIl(llllllllllllllIllllllIlIlIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[6]];
                        a.a(llllllllllllllIllllllIlIlIllIllI);
                        Time.sleepTicks((int)lIIlIIIIllIlI[3]);
                        0;
                    }
                    if (L.lIlIlIIIIlIIIII(llllllllllllllIllllllIlIlIllIllI) && L.lIlIlIIIIIllIll(llllllllllllllIllllllIlIlIllIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[7]];
                        if (L.lIlIlIIIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIllIlI[8]);
                            0;
                        }
                        if (L.lIlIlIIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                            if (L.lIlIlIIIIIlllll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIIIIllIlI[6]);
                                0;
                            }
                            if (L.lIlIlIIIIIlllll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIlIIIIllIlI[3]);
                                0;
                            }
                            int[] nArray = new int[lIIlIIIIllIlI[9]];
                            nArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[10];
                            nArray[L.lIIlIIIIllIlI[1]] = lIIlIIIIllIlI[11];
                            nArray[L.lIIlIIIIllIlI[3]] = lIIlIIIIllIlI[12];
                            nArray[L.lIIlIIIIllIlI[5]] = lIIlIIIIllIlI[13];
                            nArray[L.lIIlIIIIllIlI[6]] = lIIlIIIIllIlI[4];
                            nArray[L.lIIlIIIIllIlI[7]] = lIIlIIIIllIlI[14];
                            if (L.lIlIlIIIIIlllIl(e.b(nArray) ? 1 : 0)) {
                                L.W();
                                System.out.println(lIIlIIIIllIIl[lIIlIIIIllIlI[9]]);
                                by = lIIlIIIIllIlI[1];
                                return;
                            }
                            int[] nArray3 = new int[lIIlIIIIllIlI[9]];
                            nArray3[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[10];
                            nArray3[L.lIIlIIIIllIlI[1]] = lIIlIIIIllIlI[11];
                            nArray3[L.lIIlIIIIllIlI[3]] = lIIlIIIIllIlI[12];
                            nArray3[L.lIIlIIIIllIlI[5]] = lIIlIIIIllIlI[13];
                            nArray3[L.lIIlIIIIllIlI[6]] = lIIlIIIIllIlI[4];
                            nArray3[L.lIIlIIIIllIlI[7]] = lIIlIIIIllIlI[14];
                            if (L.lIlIlIIIIIllIll(e.b(nArray3) ? 1 : 0)) {
                                Bank.withdraw((int)lIIlIIIIllIlI[11], (int)lIIlIIIIllIlI[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                                0;
                                Bank.withdraw((int)lIIlIIIIllIlI[14], (int)lIIlIIIIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                                0;
                                Bank.withdraw((int)lIIlIIIIllIlI[16], (int)lIIlIIIIllIlI[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                                0;
                                Bank.withdraw((int)lIIlIIIIllIlI[13], (int)lIIlIIIIllIlI[7], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                                0;
                                Bank.withdraw((int)lIIlIIIIllIlI[10], (int)lIIlIIIIllIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                                0;
                                a.b(f.ba, lIIlIIIIllIlI[6]);
                                a.a(lIIlIIIIllIlI[4], lIIlIIIIllIlI[15]);
                                a.b(f.bk, lIIlIIIIllIlI[1]);
                            }
                        }
                    }
                }
                if (L.lIlIlIIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && L.lIlIlIIIIIllIll(L.S() ? 1 : 0)) {
                    if (L.lIlIlIIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(hY), lIIlIIIIllIlI[3])) {
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[17]];
                        if (L.lIlIlIIIIIlllII(bY, lIIlIIIIllIlI[1])) {
                            e.w();
                            bY += lIIlIIIIllIlI[1];
                        }
                        Movement.walkTo((WorldPoint)hY);
                        0;
                        Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                        0;
                    }
                    if (L.lIlIlIIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(hY), lIIlIIIIllIlI[3])) {
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[18]];
                        if (L.lIlIlIIIIIlllIl(L.lIlIlIIIIIllIlI(g, 0L))) {
                            g = System.currentTimeMillis();
                        }
                        if (L.lIlIlIIIIIllIll(L.lIlIlIIIIIllIlI(g, 0L)) && L.lIlIlIIIIIlllll(L.lIlIlIIIIIllIlI(e.a(g), 30000L))) {
                            bY = lIIlIIIIllIlI[0];
                            g = System.currentTimeMillis();
                        }
                        if (L.lIlIlIIIIIlllII(bY, lIIlIIIIllIlI[1])) {
                            e.w();
                            bY += lIIlIIIIllIlI[1];
                        }
                        if (L.lIlIlIIIIIllIll(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray = new int[lIIlIIIIllIlI[1]];
                            nArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[4];
                            Inventory.getFirst((int[])nArray).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[19]]);
                            Time.sleepTicks((int)lIIlIIIIllIlI[3]);
                            0;
                        }
                        i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g.a(lIIlIIIIllIIl[lIIlIIIIllIlI[15]], hX, lIIlIIIIllIlI[1]);
                    }
                }
                if (L.lIlIlIIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[1])) {
                    co = lIIlIIIIllIlI[0];
                    String[] stringArray = new String[lIIlIIIIllIlI[1]];
                    stringArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[20]];
                    if (L.lIlIlIIIIIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g.a(hX);
                    }
                }
                if (L.lIlIlIIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[3])) {
                    if (L.lIlIlIIIIIllIll(Inventory.contains(item -> item.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[61]])) ? 1 : 0) && L.lIlIlIIIIIlllIl(Equipment.contains(item -> item.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[60]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[53]])).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[21]]);
                    }
                    if (L.lIlIlIIIIIllIll(Inventory.contains(item -> item.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[59]])) ? 1 : 0) && L.lIlIlIIIIIlllIl(Equipment.contains(item -> item.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[58]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIlIIIIllIIl[lIIlIIIIllIlI[57]])).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[22]]);
                    }
                    if (L.lIlIlIIIIIlllIl(Players.getLocal().getWorldLocation().equals((Object)hZ) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[23]];
                        Movement.walkTo((WorldPoint)hZ);
                        0;
                        Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                        0;
                    }
                    if (L.lIlIlIIIIIllIll(Players.getLocal().getWorldLocation().equals((Object)hZ) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIllIlI[1]];
                        stringArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[24]];
                        Inventory.getFirst((String[])stringArray).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[25]]);
                        Time.sleepTicks((int)lIIlIIIIllIlI[3]);
                        0;
                    }
                }
                if (L.lIlIlIIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[5])) {
                    if (L.lIlIlIIIIIlllIl(Players.getLocal().getWorldLocation().equals((Object)ia) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[26]];
                        Movement.walkTo((WorldPoint)ia);
                        0;
                        Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                        0;
                    }
                    if (L.lIlIlIIIIIllIll(Players.getLocal().getWorldLocation().equals((Object)ia) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIllIlI[1]];
                        stringArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[27]];
                        Inventory.getFirst((String[])stringArray).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[28]]);
                        Time.sleepTicks((int)lIIlIIIIllIlI[3]);
                        0;
                    }
                }
                if (L.lIlIlIIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[6])) {
                    if (L.lIlIlIIIIIlllIl(Players.getLocal().getWorldLocation().equals((Object)ib) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[29]];
                        Movement.walkTo((WorldPoint)ib);
                        0;
                        Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                        0;
                    }
                    if (L.lIlIlIIIIIllIll(Players.getLocal().getWorldLocation().equals((Object)ib) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIllIlI[1]];
                        stringArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[30]];
                        Inventory.getFirst((String[])stringArray).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[31]]);
                        Time.sleepTicks((int)lIIlIIIIllIlI[3]);
                        0;
                    }
                }
                if (L.lIlIlIIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[7])) {
                    if (L.lIlIlIIIIIlllIl(Players.getLocal().getWorldLocation().equals((Object)ic) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[32]];
                        Movement.walkTo((WorldPoint)ic);
                        0;
                        Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                        0;
                    }
                    if (L.lIlIlIIIIIllIll(Players.getLocal().getWorldLocation().equals((Object)ic) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIllIlI[1]];
                        stringArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIIl[lIIlIIIIllIlI[33]];
                        Inventory.getFirst((String[])stringArray).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[34]]);
                        Time.sleepTicks((int)lIIlIIIIllIlI[3]);
                        0;
                    }
                }
                if (L.lIlIlIIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[9])) {
                    if (L.lIlIlIIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(id), lIIlIIIIllIlI[5])) {
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[35]];
                        Movement.walkTo((WorldPoint)id);
                        0;
                        Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                        0;
                    }
                    if (L.lIlIlIIIIlIIIlI(Players.getLocal().getWorldLocation().distanceTo(id), lIIlIIIIllIlI[5])) {
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[36]];
                        if (L.lIlIlIIIIIlllII(co, lIIlIIIIllIlI[1])) {
                            P.lk += lIIlIIIIllIlI[1];
                            P.d(AccBuilderRat.m);
                            co += lIIlIIIIllIlI[1];
                            P.lk = lIIlIIIIllIlI[0];
                            cp = lIIlIIIIllIlI[0];
                        }
                        i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g.a(lIIlIIIIllIIl[lIIlIIIIllIlI[37]], hX);
                    }
                }
                if (L.lIlIlIIIIlIIIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIlIIIIllIlI[17])) {
                    i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g.a(hX);
                }
                do {
                    int[] nArray = new int[lIIlIIIIllIlI[1]];
                    nArray[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[38];
                    if (!L.lIlIlIIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block49;
                    if (L.lIlIlIIIIlIIIII(Widgets.get((int)lIIlIIIIllIlI[39]))) {
                        Widget llllllllllllllIllllllIlIlIllIlIl;
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[40]];
                        int[] nArray4 = new int[lIIlIIIIllIlI[1]];
                        nArray4[L.lIIlIIIIllIlI[0]] = lIIlIIIIllIlI[38];
                        Inventory.getFirst((int[])nArray4).interact(lIIlIIIIllIIl[lIIlIIIIllIlI[41]]);
                        Time.sleepTicks((int)lIIlIIIIllIlI[6]);
                        0;
                        AccBuilderRat.c = lIIlIIIIllIIl[lIIlIIIIllIlI[42]];
                        llllllllllllllIllllllIlIlIllIllI = Widgets.get((int)lIIlIIIIllIlI[39], (int)lIIlIIIIllIlI[23]);
                        if (L.lIlIlIIIIlIIIII(llllllllllllllIllllllIlIlIllIllI)) {
                            llllllllllllllIllllllIlIlIllIllI.interact(lIIlIIIIllIIl[lIIlIIIIllIlI[43]]);
                            Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                            0;
                        }
                        if (L.lIlIlIIIIlIIIII(llllllllllllllIllllllIlIlIllIlIl = Widgets.get((int)lIIlIIIIllIlI[39], (int)lIIlIIIIllIlI[35]))) {
                            llllllllllllllIllllllIlIlIllIlIl.interact(lIIlIIIIllIIl[lIIlIIIIllIlI[44]]);
                            Time.sleepTicks((int)lIIlIIIIllIlI[3]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)lIIlIIIIllIlI[1]);
                    0;
                    0;
                } while ((0x72 ^ 0x61 ^ (0xD0 ^ 0xC7)) > 1);
                return;
            }
            i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g.a(new String[lIIlIIIIllIlI[0]]);
        }
    }

    private static boolean lIlIlIIIIIlllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean X() {
        return lIIlIIIIllIlI[0];
    }

    @Override
    public String Z() {
        return lIIlIIIIllIIl[lIIlIIIIllIlI[55]];
    }
}

