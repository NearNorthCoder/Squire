/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.o_Unknown;
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
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class J_Unknown
implements M {
    static /* synthetic */ int bY;
    public static final /* synthetic */ WorldPoint hR;
    public static final /* synthetic */ WorldPoint hO;
    public static final /* synthetic */ WorldPoint hQ;
    private static /* synthetic */ int[] lIIIllllIIIIl;
    public static final /* synthetic */ String[] hS;
    public static final /* synthetic */ WorldPoint hP;
    static /* synthetic */ boolean cp;
    static /* synthetic */ int co;
    private static /* synthetic */ String[] lIIIlllIlllll;
    public static /* synthetic */ boolean by;
    public static /* synthetic */ List<d> bA;

    private static boolean lIlIIlIlIlIlIII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean aa() {
        int n2;
        if (J.lIlIIlIlIlIlllI(e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[7]) && J.lIlIIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(hR), lIIIllllIIIIl[43])) {
            n2 = lIIIllllIIIIl[1];
            0;
            if ((0x3F ^ 0x3B) > (0xB9 ^ 0xBD)) {
                return false;
            }
        } else {
            n2 = lIIIllllIIIIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIlIIlIlIlIlIIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIlIlIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean X() {
        return lIIIllllIIIIl[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        String[] stringArray = new String[lIIIllllIIIIl[1]];
        stringArray[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[47]];
        if (J.lIlIIlIlIlIIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIllllIIIIl[1]];
            stringArray2[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[48]];
            if (J.lIlIIlIlIlIIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIIIllllIIIIl[1]];
                stringArray3[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[49]];
                if (J.lIlIIlIlIlIIIll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    n2 = lIIIllllIIIIl[1];
                    0;
                    if (1 != 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIllllIIIIl[0];
        return n2 != 0;
    }

    private static String lIlIIlIlIIlIIIl(String var20, String var1) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lIIIllllIIIIl[5], var6);
            return new String(var9.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public int Y() {
        try {
            J.cx();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-(0x44 ^ 0x5A ^ (0x17 ^ 0xC)) >= 0) {
            return (136 + 127 - 119 + 16 ^ 74 + 130 - 96 + 67) & (27 + 54 - 43 + 97 ^ 86 + 45 - 66 + 71 ^ -1);
        }
        return lIIIllllIIIIl[59];
    }

    private static boolean lIlIIlIlIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIlIlIIlll(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIIlIlIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIlIlIllIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIlIlIlIIlIl(int n2) {
        return n2 == 0;
    }

    @Override
    public String Z() {
        return lIIIlllIlllll[lIIIllllIIIIl[60]];
    }

    private static boolean lIlIIlIlIlIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlIlIllII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIlIlIlIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIlIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        J.lIlIIlIlIlIIIIl();
        J.lIlIIlIlIlIIIII();
        hO = new WorldPoint(lIIIllllIIIIl[62], lIIIllllIIIIl[63], lIIIllllIIIIl[0]);
        hP = new WorldPoint(lIIIllllIIIIl[64], lIIIllllIIIIl[65], lIIIllllIIIIl[0]);
        hQ = new WorldPoint(lIIIllllIIIIl[66], lIIIllllIIIIl[67], lIIIllllIIIIl[0]);
        hR = new WorldPoint(lIIIllllIIIIl[68], lIIIllllIIIIl[69], lIIIllllIIIIl[0]);
        String[] stringArray = new String[lIIIllllIIIIl[10]];
        stringArray[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[70]];
        stringArray[J.lIIIllllIIIIl[1]] = lIIIlllIlllll[lIIIllllIIIIl[53]];
        stringArray[J.lIIIllllIIIIl[5]] = lIIIlllIlllll[lIIIllllIIIIl[71]];
        stringArray[J.lIIIllllIIIIl[7]] = lIIIlllIlllll[lIIIllllIIIIl[72]];
        hS = stringArray;
        bA = new ArrayList<d>();
        bY = lIIIllllIIIIl[0];
    }

    private static String lIlIIlIlIIlIIII(String var16, String var2) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIIIllllIIIIl[21]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIIllllIIIIl[5], var21);
            return new String(var18.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIlIlIIIII() {
        lIIIlllIlllll = new String[lIIIllllIIIIl[73]];
        J.lIIIlllIlllll[J.lIIIllllIIIIl[0]] = J."Buying items";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[1]] = J."Finished buying items, switching back to quest";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[5]] = J."Drink";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[7]] = J."Eat";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[10]] = J."Nav to bank";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[11]] = J."Handling banking";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[18]] = J."We are missing quest supplies, switching to BUYING";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[20]] = J."Nav to start";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[21]] = J."Wear";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[22]] = J."Talking npc";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[3]] = J."Morgan";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[23]] = J."Nav to pub";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[24]] = J."Talk to drunk";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[25]] = J."Dr Harlow";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[26]] = J."Beer";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[27]] = J."Stake";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[28]] = J."Talk to drunk";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[29]] = J."Dr Harlow";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[30]] = J."Beer";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[31]] = J."Stake";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[32]] = J."Nav to stairs";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[34]] = J."Draynor Village";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[35]] = J."Walking down stairs";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[36]] = J."Stairs";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[37]] = J."Walk-Down";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[38]] = J."Count Draynor";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[39]] = J."Starting fight";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[40]] = J."Coffin";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[41]] = J."Open";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[42]] = J."Count Draynor";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[43]] = J."Fighting";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[44]] = J."Wield";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[45]] = J."Attack";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[46]] = J."Break";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[47]] = J."Beer";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[48]] = J."Garlic";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[49]] = J."Hammer";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[60]] = J."Vampire slayer quest";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[61]] = J."ring of wealth (";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[70]] = J."Ok, I'm up for an adventure.";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[53]] = J."A glass of your finest ale please.";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[71]] = J."Morgan needs your help!";
        J.lIIIlllIlllll[J.lIIIllllIIIIl[72]] = J."Yes.";
    }

    private static int lIlIIlIlIlIIIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void lIlIIlIlIlIIIIl() {
        lIIIllllIIIIl = new int[74];
        J.lIIIllllIIIIl[0] = (0x6C ^ 0x4B ^ (0x95 ^ 0xA8)) & (0x6C ^ 8 ^ (0xE3 ^ 0x9D) ^ -1);
        J.lIIIllllIIIIl[1] = 1;
        J.lIIIllllIIIIl[2] = 0xF8 ^ 0xBB ^ 2;
        J.lIIIllllIIIIl[3] = 0x6A ^ 0x66 ^ (0x6B ^ 0x6D);
        J.lIIIllllIIIIl[4] = 0x48 ^ 0xE;
        J.lIIIllllIIIIl[5] = 2;
        J.lIIIllllIIIIl[6] = 0xFFFFF97B & 0x7FF;
        J.lIIIllllIIIIl[7] = 3;
        J.lIIIllllIIIIl[8] = -(0xFFFFF971 & 0x3E9F) & (0xFFFFFBF3 & 0x3FFF);
        J.lIIIllllIIIIl[9] = 177 + 110 - 283 + 174;
        J.lIIIllllIIIIl[10] = 2 ^ (0x28 ^ 0x2E);
        J.lIIIllllIIIIl[11] = 0x78 ^ 0x68 ^ (0x73 ^ 0x66);
        J.lIIIllllIIIIl[12] = -(0xFFFFEA33 & 0x3DDF) & (0xFFFFBB9E & 0x7FFB);
        J.lIIIllllIIIIl[13] = -(0xFFFFCA47 & 0x7DBB) & (0xFFFFEF7F & 0x5FFF);
        J.lIIIllllIIIIl[14] = -(0xFFFFF1F9 & 0x3E57) & (0xFFFFB6DF & 0x7F7E);
        J.lIIIllllIIIIl[15] = -(0xFFFFF6D5 & 0x1DEF) & (0xFFFFFDFF & 0x1FEF);
        J.lIIIllllIIIIl[16] = -(0xFFFFADB3 & 0x72CD) & (0xFFFFFFC7 & 0x3FFF);
        J.lIIIllllIIIIl[17] = -(0xFFFFFFDF & 0x6AEB) & (0xFFFFFFFF & 0x6FFF);
        J.lIIIllllIIIIl[18] = 0x73 ^ 0x75;
        J.lIIIllllIIIIl[19] = -(0xFFFF8537 & 0x7BEA) & (0xFFFFAFFF & 0x7FEB);
        J.lIIIllllIIIIl[20] = 0x82 ^ 0x96 ^ (0x9A ^ 0x89);
        J.lIIIllllIIIIl[21] = 75 + 56 - 43 + 59 ^ 139 + 119 - 191 + 88;
        J.lIIIllllIIIIl[22] = 27 + 114 - 101 + 104 ^ 40 + 81 - 55 + 87;
        J.lIIIllllIIIIl[23] = 106 + 71 - 142 + 142 ^ 0 + 145 - 18 + 59;
        J.lIIIllllIIIIl[24] = 0xCF ^ 0xC3;
        J.lIIIllllIIIIl[25] = 0x5C ^ 0x51;
        J.lIIIllllIIIIl[26] = 0x7B ^ 0x48 ^ (0x63 ^ 0x5E);
        J.lIIIllllIIIIl[27] = 8 ^ 7;
        J.lIIIllllIIIIl[28] = 16 + 11 - -80 + 72 ^ 58 + 155 - 177 + 127;
        J.lIIIllllIIIIl[29] = 104 + 32 - 16 + 42 ^ 68 + 48 - 102 + 165;
        J.lIIIllllIIIIl[30] = 0x77 ^ 0x65;
        J.lIIIllllIIIIl[31] = 0x42 ^ 0x51;
        J.lIIIllllIIIIl[32] = 0x53 ^ 0x47;
        J.lIIIllllIIIIl[33] = -(0xFFFFF837 & 0x5FFD) & (0xFFFFDAFE & Short.MAX_VALUE);
        J.lIIIllllIIIIl[34] = 0x2C ^ 0x39;
        J.lIIIllllIIIIl[35] = 0x38 ^ 0x67 ^ (0xF1 ^ 0xB8);
        J.lIIIllllIIIIl[36] = 0x99 ^ 0x8E;
        J.lIIIllllIIIIl[37] = 0x99 ^ 0x81;
        J.lIIIllllIIIIl[38] = 0x92 ^ 0x97 ^ (0xA9 ^ 0xB5);
        J.lIIIllllIIIIl[39] = 132 + 2 - 11 + 20 ^ 82 + 54 - 79 + 92;
        J.lIIIllllIIIIl[40] = 0x49 ^ 0x52;
        J.lIIIllllIIIIl[41] = 0x66 ^ 0x7A;
        J.lIIIllllIIIIl[42] = 0x2F ^ 0x32;
        J.lIIIllllIIIIl[43] = 0xAA ^ 0xB4;
        J.lIIIllllIIIIl[44] = 0x6C ^ 0x69 ^ (0x31 ^ 0x2B);
        J.lIIIllllIIIIl[45] = 0x13 ^ 0x7D ^ (0x37 ^ 0x79);
        J.lIIIllllIIIIl[46] = 0x80 ^ 0x9A ^ (0x61 ^ 0x5A);
        J.lIIIllllIIIIl[47] = 0xBE ^ 0x9C;
        J.lIIIllllIIIIl[48] = 0x2F ^ 0xC;
        J.lIIIllllIIIIl[49] = 0x80 ^ 0xA4;
        J.lIIIllllIIIIl[50] = 0xFFFFF76E & 0x1F9D;
        J.lIIIllllIIIIl[51] = -(0xFFFFBAF7 & 0x5F4A) & (0xFFFFFF6D & Short.MAX_VALUE);
        J.lIIIllllIIIIl[52] = 0xFFFFBFDE & 0x7E3D;
        J.lIIIllllIIIIl[53] = 0 ^ 0x28;
        J.lIIIllllIIIIl[54] = -(0xFFFFF7FD & 0x3E67) & (0xFFFFB7F7 & 0x7FFC);
        J.lIIIllllIIIIl[55] = -(0x6C ^ 0x68) & (0xFFFFBECF & 0x6FFF);
        J.lIIIllllIIIIl[56] = -(0xFFFF8FD9 & 0x7C3E) & (0xFFFFFDFF & 0x6FBF);
        J.lIIIllllIIIIl[57] = -(0xFFFFFDF3 & 0x129D) & (0xFFFFD7FC & 0x3FFF);
        J.lIIIllllIIIIl[58] = -(0xFFFFCEEF & 0x7FB3) & (0xFFFFFFF7 & 0x7FFB);
        J.lIIIllllIIIIl[59] = 0x36 ^ 0x1F ^ (0x19 ^ 0x54);
        J.lIIIllllIIIIl[60] = 137 + 16 - 92 + 117 ^ 124 + 136 - 120 + 11;
        J.lIIIllllIIIIl[61] = 0x5C ^ 0x1C ^ (0xE4 ^ 0x82);
        J.lIIIllllIIIIl[62] = 0xFFFFAD1F & 0x5EFA;
        J.lIIIllllIIIIl[63] = 0xFFFFEDD7 & 0x1EEC;
        J.lIIIllllIIIIl[64] = -(0xFFFFF7FD & 0x3B4B) & (0xFFFFFFFF & 0x3FDF);
        J.lIIIllllIIIIl[65] = 0xFFFF9D67 & 0x6FDB;
        J.lIIIllllIIIIl[66] = 0xFFFF8F2F & 0x7CFC;
        J.lIIIllllIIIIl[67] = 0xFFFFAF3D & 0x5DDE;
        J.lIIIllllIIIIl[68] = 0xFFFFCCEF & 0x3F15;
        J.lIIIllllIIIIl[69] = 0xFFFFF7EF & 0x2E3B;
        J.lIIIllllIIIIl[70] = 0x88 ^ 0xB7 ^ (0x60 ^ 0x78);
        J.lIIIllllIIIIl[71] = 0xFD ^ 0xBD ^ (0x20 ^ 0x49);
        J.lIIIllllIIIIl[72] = 0x88 ^ 0xA8 ^ (0x7D ^ 0x77);
        J.lIIIllllIIIIl[73] = 0xA9 ^ 0xB0 ^ (0x1B ^ 0x29);
    }

    private static void W() {
        d var22;
        Object var3;
        int[] nArray = new int[lIIIllllIIIIl[1]];
        nArray[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[13];
        if (J.lIlIIlIlIlIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIllllIIIIl[13], lIIIllllIIIIl[1], lIIIllllIIIIl[50]);
            bA.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIllllIIIIl[1]];
        nArray2[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[15];
        if (J.lIlIIlIlIlIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var3 = new d(lIIIllllIIIIl[15], lIIIllllIIIIl[1], lIIIllllIIIIl[50]);
            bA.add((d)var3);
            0;
        }
        int[] nArray3 = new int[lIIIllllIIIIl[1]];
        nArray3[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[17];
        if (J.lIlIIlIlIlIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var3 = new d(lIIIllllIIIIl[17], lIIIllllIIIIl[1], lIIIllllIIIIl[51]);
            bA.add((d)var3);
            0;
        }
        int[] nArray4 = new int[lIIIllllIIIIl[1]];
        nArray4[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[14];
        if (J.lIlIIlIlIlIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var3 = new d(lIIIllllIIIIl[14], lIIIllllIIIIl[1], lIIIllllIIIIl[50]);
            bA.add((d)var3);
            0;
        }
        int[] nArray5 = new int[lIIIllllIIIIl[1]];
        nArray5[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[19];
        if (J.lIlIIlIlIlIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var3 = new d(lIIIllllIIIIl[19], lIIIllllIIIIl[1], lIIIllllIIIIl[52]);
            bA.add((d)var3);
            0;
        }
        int[] nArray6 = new int[lIIIllllIIIIl[1]];
        nArray6[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[6];
        if (J.lIlIIlIlIlIIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var3 = new d(lIIIllllIIIIl[6], lIIIllllIIIIl[3], lIIIllllIIIIl[50]);
            bA.add((d)var3);
            0;
        }
        int[] nArray7 = new int[lIIIllllIIIIl[1]];
        nArray7[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[6];
        if (J.lIlIIlIlIlIIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            int[] nArray8 = new int[lIIIllllIIIIl[1]];
            nArray8[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[6];
            if (J.lIlIIlIlIlIIlII(Bank.getFirst((int[])nArray8).getQuantity(), lIIIllllIIIIl[32])) {
                var3 = new d(lIIIllllIIIIl[6], lIIIllllIIIIl[53], lIIIllllIIIIl[54]);
                bA.add((d)var3);
                0;
            }
        }
        if (J.lIlIIlIlIlIIlIl(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(lIIIlllIlllll[lIIIllllIIIIl[61]]))) ? 1 : 0)) {
            var22 = new d(lIIIllllIIIIl[55], lIIIllllIIIIl[11], lIIIllllIIIIl[56]);
            bA.add(var22);
            0;
        }
        int[] nArray9 = new int[lIIIllllIIIIl[1]];
        nArray9[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[16];
        if (J.lIlIIlIlIlIIlIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
            var22 = new d(lIIIllllIIIIl[16], lIIIllllIIIIl[53], lIIIllllIIIIl[57]);
            bA.add(var22);
            0;
        }
        int[] nArray10 = new int[lIIIllllIIIIl[1]];
        nArray10[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[58];
        if (J.lIlIIlIlIlIIlIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
            var22 = new d(lIIIllllIIIIl[58], lIIIllllIIIIl[11], h.bv);
            bA.add(var22);
            0;
        }
    }

    public static void cx() {
        block44: {
            BankLocation var17;
            block47: {
                block48: {
                    block46: {
                        block45: {
                            if (J.lIlIIlIlIlIIIll(by ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[0]];
                                b.a(bA);
                                if (J.lIlIIlIlIlIIlII(bA.size(), lIIIllllIIIIl[1])) {
                                    System.out.println(lIIIlllIlllll[lIIIllllIIIIl[1]]);
                                    by = lIIIllllIIIIl[0];
                                }
                            }
                            if (J.lIlIIlIlIlIIlIl(by ? 1 : 0) && J.lIlIIlIlIlIIlII(e.j(lIIIllllIIIIl[2]), lIIIllllIIIIl[3])) {
                                o.aI();
                            }
                            if (!J.lIlIIlIlIlIIlIl(by ? 1 : 0) || !J.lIlIIlIlIlIIllI(e.j(lIIIllllIIIIl[2]), lIIIllllIIIIl[3])) break block44;
                            if (J.lIlIIlIlIlIIIll(Inventory.contains((int[])f.ba) ? 1 : 0) && J.lIlIIlIlIlIIlII(Movement.getRunEnergy(), lIIIllllIIIIl[4])) {
                                Inventory.getFirst((int[])f.ba).interact(lIIIlllIlllll[lIIIllllIIIIl[5]]);
                                Time.sleepTicks((int)lIIIllllIIIIl[1]);
                                0;
                            }
                            if (J.lIlIIlIlIlIIlll(J.lIlIIlIlIlIIIlI(e.v(), 70.0))) {
                                int[] nArray = new int[lIIIllllIIIIl[1]];
                                nArray[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[6];
                                if (J.lIlIIlIlIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray2 = new int[lIIIllllIIIIl[1]];
                                    nArray2[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[6];
                                    Inventory.getFirst((int[])nArray2).interact(lIIIlllIlllll[lIIIllllIIIIl[7]]);
                                }
                            }
                            if (J.lIlIIlIlIlIIlIl(Movement.isRunEnabled() ? 1 : 0) && J.lIlIIlIlIlIlIII(Movement.getRunEnergy())) {
                                Movement.toggleRun();
                            }
                            if (!J.lIlIIlIlIlIIIll(J.S() ? 1 : 0)) break block45;
                            int[] nArray = new int[lIIIllllIIIIl[1]];
                            nArray[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[8];
                            if (!J.lIlIIlIlIlIlIII(Inventory.getCount((int[])nArray))) break block46;
                        }
                        if (J.lIlIIlIlIlIIlII(e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[1])) {
                            var17 = BankLocation.getNearest();
                            if (J.lIlIIlIlIlIlIIl(var17) && J.lIlIIlIlIlIIlIl(var17.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[10]];
                                a.a(var17);
                                Time.sleepTicks((int)lIIIllllIIIIl[5]);
                                0;
                            }
                            if (J.lIlIIlIlIlIlIIl(var17) && J.lIlIIlIlIlIIIll(var17.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[11]];
                                if (J.lIlIIlIlIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIIIIl[12]);
                                    0;
                                }
                                if (J.lIlIIlIlIlIIIll(Bank.isOpen() ? 1 : 0)) {
                                    if (J.lIlIIlIlIlIlIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIllllIIIIl[10]);
                                        0;
                                    }
                                    if (J.lIlIIlIlIlIlIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIllllIIIIl[5]);
                                        0;
                                    }
                                    int[] nArray = new int[lIIIllllIIIIl[11]];
                                    nArray[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[13];
                                    nArray[J.lIIIllllIIIIl[1]] = lIIIllllIIIIl[14];
                                    nArray[J.lIIIllllIIIIl[5]] = lIIIllllIIIIl[15];
                                    nArray[J.lIIIllllIIIIl[7]] = lIIIllllIIIIl[16];
                                    nArray[J.lIIIllllIIIIl[10]] = lIIIllllIIIIl[17];
                                    if (J.lIlIIlIlIlIIlIl(e.b(nArray) ? 1 : 0)) {
                                        J.W();
                                        System.out.println(lIIIlllIlllll[lIIIllllIIIIl[18]]);
                                        by = lIIIllllIIIIl[1];
                                        return;
                                    }
                                    Bank.withdraw((int)lIIIllllIIIIl[13], (int)lIIIllllIIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIIl[1]);
                                    0;
                                    Bank.withdraw((int)lIIIllllIIIIl[14], (int)lIIIllllIIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIIl[1]);
                                    0;
                                    Bank.withdraw((int)lIIIllllIIIIl[15], (int)lIIIllllIIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIIl[1]);
                                    0;
                                    Bank.withdraw((int)lIIIllllIIIIl[16], (int)lIIIllllIIIIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIIl[1]);
                                    0;
                                    Bank.withdraw((int)lIIIllllIIIIl[19], (int)lIIIllllIIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIIl[1]);
                                    0;
                                    Bank.withdraw((int)lIIIllllIIIIl[17], (int)lIIIllllIIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIIl[1]);
                                    0;
                                    a.b(f.ba, lIIIllllIIIIl[1]);
                                    a.a(lIIIllllIIIIl[6], lIIIllllIIIIl[3]);
                                    a.b(f.bk, lIIIllllIIIIl[1]);
                                }
                            }
                        }
                    }
                    if (J.lIlIIlIlIlIIIll(J.S() ? 1 : 0) && J.lIlIIlIlIlIIlII(e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[1])) {
                        if (J.lIlIIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(hO), lIIIllllIIIIl[5])) {
                            AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[20]];
                            if (J.lIlIIlIlIlIIlIl(Equipment.contains((int[])f.aW) ? 1 : 0) && J.lIlIIlIlIlIIIll(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aW).interact(lIIIlllIlllll[lIIIllllIIIIl[21]]);
                                Time.sleepTicks((int)lIIIllllIIIIl[1]);
                                0;
                            }
                            if (J.lIlIIlIlIlIIlII(bY, lIIIllllIIIIl[1])) {
                                e.w();
                                bY += lIIIllllIIIIl[1];
                            }
                            Movement.walkTo((WorldPoint)hO);
                            0;
                            Time.sleepTicks((int)lIIIllllIIIIl[1]);
                            0;
                        }
                        if (J.lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hO), lIIIllllIIIIl[7])) {
                            AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[22]];
                            g.a(lIIIlllIlllll[lIIIllllIIIIl[3]], hS);
                        }
                    }
                    if (J.lIlIIlIlIlIIllI(e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[1])) {
                        co = lIIIllllIIIIl[0];
                        if (J.lIlIIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIllllIIIIl[21])) {
                            AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[23]];
                            Movement.walkTo((WorldPoint)hP);
                            0;
                            Time.sleepTicks((int)lIIIllllIIIIl[1]);
                            0;
                        }
                        if (J.lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIllllIIIIl[21])) {
                            AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[24]];
                            g.a(lIIIlllIlllll[lIIIllllIIIIl[25]], hS);
                        }
                    }
                    if (!J.lIlIIlIlIlIIllI(e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[5])) break block47;
                    String[] stringArray = new String[lIIIllllIIIIl[1]];
                    stringArray[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[26]];
                    if (!J.lIlIIlIlIlIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block48;
                    String[] stringArray2 = new String[lIIIllllIIIIl[1]];
                    stringArray2[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[27]];
                    if (!J.lIlIIlIlIlIIlIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block47;
                }
                AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[28]];
                g.a(lIIIlllIlllll[lIIIllllIIIIl[29]], hS);
                g.a(hS);
            }
            if (J.lIlIIlIlIlIIllI(e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[5])) {
                String[] stringArray = new String[lIIIllllIIIIl[1]];
                stringArray[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[30]];
                if (J.lIlIIlIlIlIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIllllIIIIl[1]];
                    stringArray3[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[31]];
                    if (J.lIlIIlIlIlIIIll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                        if (J.lIlIIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(hQ), lIIIllllIIIIl[5]) && J.lIlIIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(hR), lIIIllllIIIIl[3])) {
                            AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[32]];
                            if (J.lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hP), lIIIllllIIIIl[3]) && J.lIlIIlIlIlIIIll(Equipment.contains((int[])f.aW) ? 1 : 0) && J.lIlIIlIlIlIllII(Players.getLocal().getAnimation(), lIIIllllIIIIl[33])) {
                                Equipment.getFirst((int[])f.aW).interact(lIIIlllIlllll[lIIIllllIIIIl[34]]);
                                Time.sleepTicks((int)lIIIllllIIIIl[7]);
                                0;
                            }
                            Movement.walkTo((WorldPoint)hQ);
                            0;
                            Time.sleepTicks((int)lIIIllllIIIIl[1]);
                            0;
                        }
                        if (J.lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hQ), lIIIllllIIIIl[10])) {
                            AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[35]];
                            String[] stringArray4 = new String[lIIIllllIIIIl[1]];
                            stringArray4[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[36]];
                            var17 = TileObjects.getNearest((String[])stringArray4);
                            var17.interact(lIIIlllIlllll[lIIIllllIIIIl[37]]);
                            Time.sleepTicks((int)lIIIllllIIIIl[7]);
                            0;
                        }
                        if (J.lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hR), lIIIllllIIIIl[3])) {
                            String[] stringArray5 = new String[lIIIllllIIIIl[1]];
                            stringArray5[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[38]];
                            if (J.lIlIIlIlIlIllIl(NPCs.getNearest((String[])stringArray5))) {
                                AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[39]];
                                if (J.lIlIIlIlIlIIlII(co, lIIIllllIIIIl[1])) {
                                    P.lm += lIIIllllIIIIl[1];
                                    P.d(AccBuilderRat.m);
                                    co += lIIIllllIIIIl[1];
                                    P.lm = lIIIllllIIIIl[0];
                                    cp = lIIIllllIIIIl[0];
                                }
                                String[] stringArray6 = new String[lIIIllllIIIIl[1]];
                                stringArray6[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[40]];
                                TileObjects.getNearest((String[])stringArray6).interact(lIIIlllIlllll[lIIIllllIIIIl[41]]);
                                Time.sleepTicks((int)lIIIllllIIIIl[10]);
                                0;
                            }
                            String[] stringArray7 = new String[lIIIllllIIIIl[1]];
                            stringArray7[J.lIIIllllIIIIl[0]] = lIIIlllIlllll[lIIIllllIIIIl[42]];
                            var17 = NPCs.getNearest((String[])stringArray7);
                            if (J.lIlIIlIlIlIlIIl(var17)) {
                                AccBuilderRat.c = lIIIlllIlllll[lIIIllllIIIIl[43]];
                                int[] nArray = new int[lIIIllllIIIIl[1]];
                                nArray[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[17];
                                if (J.lIlIIlIlIlIIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray3 = new int[lIIIllllIIIIl[1]];
                                    nArray3[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[17];
                                    if (J.lIlIIlIlIlIIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                        int[] nArray4 = new int[lIIIllllIIIIl[1]];
                                        nArray4[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[17];
                                        Inventory.getFirst((int[])nArray4).interact(lIIIlllIlllll[lIIIllllIIIIl[44]]);
                                        Time.sleepTicks((int)lIIIllllIIIIl[1]);
                                        0;
                                    }
                                }
                                if (J.lIlIIlIlIlIllIl(Players.getLocal().getInteracting()) && J.lIlIIlIlIlIIlIl(var17.isDead() ? 1 : 0)) {
                                    var17.interact(lIIIlllIlllll[lIIIllllIIIIl[45]]);
                                    Time.sleepTicks((int)lIIIllllIIIIl[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
            }
            if (J.lIlIIlIlIlIIllI(e.j(lIIIllllIIIIl[9]), lIIIllllIIIIl[7]) && J.lIlIIlIlIlIlIll(Players.getLocal().getWorldLocation().distanceTo(hR), lIIIllllIIIIl[3])) {
                int[] nArray = new int[lIIIllllIIIIl[1]];
                nArray[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[16];
                if (J.lIlIIlIlIlIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray5 = new int[lIIIllllIIIIl[1]];
                    nArray5[J.lIIIllllIIIIl[0]] = lIIIllllIIIIl[16];
                    Inventory.getFirst((int[])nArray5).interact(lIIIlllIlllll[lIIIllllIIIIl[46]]);
                    Time.sleepTicks((int)lIIIllllIIIIl[5]);
                    0;
                }
            }
            g.a(new String[lIIIllllIIIIl[0]]);
        }
    }

    private static String lIlIIlIlIIIllll(String var13, String var4) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var4.toCharArray();
        int var19 = lIIIllllIIIIl[0];
        char[] var12 = var13.toCharArray();
        int var11 = var12.length;
        int var7 = lIIIllllIIIIl[0];
        while (J.lIlIIlIlIlIIlII(var7, var11)) {
            char var5 = var12[var7];
            var14.append((char)(var5 ^ var15[var19 % var15.length]));
            0;
            ++var19;
            ++var7;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }
}

