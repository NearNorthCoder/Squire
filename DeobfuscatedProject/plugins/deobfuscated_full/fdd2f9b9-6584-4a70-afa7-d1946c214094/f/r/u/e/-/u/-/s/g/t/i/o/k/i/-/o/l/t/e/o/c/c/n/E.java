/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
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

public class E
implements G {
    private static /* synthetic */ int[] lIIIllllII;
    public static final /* synthetic */ String[] ik;
    static /* synthetic */ boolean cl;
    static /* synthetic */ int bT;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ WorldPoint il;
    private static final /* synthetic */ WorldPoint im;
    private static final /* synthetic */ WorldPoint io;
    private static /* synthetic */ String[] lIIIlllIlI;
    private static final /* synthetic */ WorldPoint in;
    static /* synthetic */ int ck;
    public static /* synthetic */ List<d> bv;

    private static boolean llllIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llllIIIlllll() {
        lIIIlllIlI = new String[lIIIllllII[74]];
        E.lIIIlllIlI[E.lIIIllllII[0]] = E."Buying items";
        E.lIIIlllIlI[E.lIIIllllII[1]] = E."Finished buying items, switching back to quest";
        E.lIIIlllIlI[E.lIIIllllII[3]] = E."Drink";
        E.lIIIlllIlI[E.lIIIllllII[5]] = E."Eat";
        E.lIIIlllIlI[E.lIIIllllII[7]] = E."Nav to bank";
        E.lIIIlllIlI[E.lIIIllllII[8]] = E."Handling banking";
        E.lIIIlllIlI[E.lIIIllllII[14]] = E."We are missing quest supplies, switching to BUYING";
        E.lIIIlllIlI[E.lIIIllllII[20]] = E."Father Aereck";
        E.lIIIlllIlI[E.lIIIllllII[18]] = E."Nav to start";
        E.lIIIlllIlI[E.lIIIllllII[21]] = E."Starting quest";
        E.lIIIlllIlI[E.lIIIllllII[15]] = E."Father Aereck";
        E.lIIIlllIlI[E.lIIIllllII[19]] = E."Nav to necklace guy";
        E.lIIIlllIlI[E.lIIIllllII[22]] = E."Interacting npc";
        E.lIIIlllIlI[E.lIIIllllII[23]] = E."Door";
        E.lIIIlllIlI[E.lIIIllllII[24]] = E."Open";
        E.lIIIlllIlI[E.lIIIllllII[25]] = E."Open";
        E.lIIIlllIlI[E.lIIIllllII[26]] = E."Father Urhney";
        E.lIIIlllIlI[E.lIIIllllII[28]] = E."Wear";
        E.lIIIlllIlI[E.lIIIllllII[29]] = E."Nav to coffin";
        E.lIIIlllIlI[E.lIIIllllII[30]] = E."Handling coffin";
        E.lIIIlllIlI[E.lIIIllllII[31]] = E."Restless ghost";
        E.lIIIlllIlI[E.lIIIllllII[32]] = E."Restless ghost";
        E.lIIIlllIlI[E.lIIIllllII[33]] = E."Coffin";
        E.lIIIlllIlI[E.lIIIllllII[34]] = E."Open";
        E.lIIIlllIlI[E.lIIIllllII[35]] = E."Nav to skull";
        E.lIIIlllIlI[E.lIIIllllII[36]] = E."Getting skull";
        E.lIIIlllIlI[E.lIIIllllII[37]] = E."Altar";
        E.lIIIlllIlI[E.lIIIllllII[38]] = E."Search";
        E.lIIIlllIlI[E.lIIIllllII[39]] = E."Wear";
        E.lIIIlllIlI[E.lIIIllllII[40]] = E."Nav to coffin";
        E.lIIIlllIlI[E.lIIIllllII[41]] = E."Handling coffin";
        E.lIIIlllIlI[E.lIIIllllII[42]] = E."Coffin";
        E.lIIIlllIlI[E.lIIIllllII[43]] = E."Open";
        E.lIIIlllIlI[E.lIIIllllII[44]] = E."Open";
        E.lIIIlllIlI[E.lIIIllllII[45]] = E."Ghost's skull";
        E.lIIIlllIlI[E.lIIIllllII[52]] = E."Restless ghost quest";
        E.lIIIlllIlI[E.lIIIllllII[53]] = E."ring of wealth (";
        E.lIIIlllIlI[E.lIIIllllII[54]] = E."Ok, I'm up for an adventure.";
        E.lIIIlllIlI[E.lIIIllllII[55]] = E."A glass of your finest ale please.";
        E.lIIIlllIlI[E.lIIIllllII[56]] = E."Morgan needs your help!";
        E.lIIIlllIlI[E.lIIIllllII[57]] = E."Yes.";
        E.lIIIlllIlI[E.lIIIllllII[58]] = E."I'm looking for a quest!";
        E.lIIIlllIlI[E.lIIIllllII[59]] = E."Ok, let me help then.";
        E.lIIIlllIlI[E.lIIIllllII[60]] = E."Father Aereck sent me to talk to you.";
        E.lIIIlllIlI[E.lIIIllllII[61]] = E."He's got a ghost haunting his graveyard.";
        E.lIIIlllIlI[E.lIIIllllII[62]] = E."Yep, now tell me what the problem is.";
        E.lIIIlllIlI[E.lIIIllllII[63]] = E."Sure.";
        E.lIIIlllIlI[E.lIIIllllII[64]] = E."I'm wearing an amulet of ghost speak!";
        E.lIIIlllIlI[E.lIIIllllII[65]] = E."Yes, I'm sure.";
        E.lIIIlllIlI[E.lIIIllllII[66]] = E."How can I help?";
    }

    private static boolean llllIIlIIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (E.llllIIlIllll(e.j(lIIIllllII[6]), lIIIllllII[8])) {
            bl = lIIIllllII[1];
            0;
            if (-2 > 0) {
                return false;
            }
        } else {
            bl = lIIIllllII[0];
        }
        return bl;
    }

    @Override
    public int T() {
        try {
            E.ck();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIllllII[51];
    }

    private static int llllIIlIIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llllIIlIlIll(Object object) {
        return object == null;
    }

    private static String llllIIIlllIl(String llIlIIIIIIl, String llIlIIIIIII) {
        try {
            SecretKeySpec llIlIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIIIll = Cipher.getInstance("Blowfish");
            llIlIIIIIll.init(lIIIllllII[3], llIlIIIIlII);
            return new String(llIlIIIIIll.doFinal(Base64.getDecoder().decode(llIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIIIlI) {
            llIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String llllIIIllllI(String llIIlllIlII, String llIIlllIIIl) {
        try {
            SecretKeySpec llIIlllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlllIIIl.getBytes(StandardCharsets.UTF_8)), lIIIllllII[18]), "DES");
            Cipher llIIlllIllI = Cipher.getInstance("DES");
            llIIlllIllI.init(lIIIllllII[3], llIIlllIlll);
            return new String(llIIlllIllI.doFinal(Base64.getDecoder().decode(llIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlllIlIl) {
            llIIlllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIlIlIII(int n2) {
        return n2 < 0;
    }

    private static boolean llllIIlIlIlI(Object object) {
        return object != null;
    }

    private static boolean llllIIlIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllIIlIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void af() {
        d llIlIIIlIll;
        Object llIlIIIllII;
        int[] nArray = new int[lIIIllllII[1]];
        nArray[E.lIIIllllII[0]] = lIIIllllII[10];
        if (E.llllIIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIIllllII[10], lIIIllllII[1], lIIIllllII[46]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIllllII[1]];
        nArray2[E.lIIIllllII[0]] = lIIIllllII[4];
        if (E.llllIIlIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIlIIIllII = new d(lIIIllllII[4], lIIIllllII[15], lIIIllllII[47]);
            bv.add((d)llIlIIIllII);
            0;
        }
        if (E.llllIIlIIlll(Bank.contains(llIlIIIllII = item -> item.getName().toLowerCase().contains(lIIIlllIlI[lIIIllllII[53]])) ? 1 : 0)) {
            llIlIIIlIll = new d(lIIIllllII[48], lIIIllllII[8], lIIIllllII[49]);
            bv.add(llIlIIIlIll);
            0;
        }
        int[] nArray3 = new int[lIIIllllII[1]];
        nArray3[E.lIIIllllII[0]] = lIIIllllII[11];
        if (E.llllIIlIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIlIIIlIll = new d(lIIIllllII[11], lIIIllllII[15], lIIIllllII[50]);
            bv.add(llIlIIIlIll);
            0;
        }
        int[] nArray4 = new int[lIIIllllII[1]];
        nArray4[E.lIIIllllII[0]] = lIIIllllII[13];
        if (E.llllIIlIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIlIIIlIll = new d(lIIIllllII[13], lIIIllllII[31], lIIIllllII[50]);
            bv.add(llIlIIIlIll);
            0;
        }
        int[] nArray5 = new int[lIIIllllII[1]];
        nArray5[E.lIIIllllII[0]] = lIIIllllII[12];
        if (E.llllIIlIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llIlIIIlIll = new d(lIIIllllII[12], lIIIllllII[8], i.bq);
            bv.add(llIlIIIlIll);
            0;
        }
    }

    private static boolean llllIIlIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIlIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llllIIlIIIll() {
        lIIIllllII = new int[75];
        E.lIIIllllII[0] = (0xA3 ^ 0x9C) & ~(0x96 ^ 0xA9);
        E.lIIIllllII[1] = 1;
        E.lIIIllllII[2] = 192 + 90 - 194 + 163 ^ 47 + 85 - 88 + 145;
        E.lIIIllllII[3] = 2;
        E.lIIIllllII[4] = -(0xFFFFEFCB & 0x58B5) & (0xFFFFDDFF & 0x6BFB);
        E.lIIIllllII[5] = 3;
        E.lIIIllllII[6] = 0x52 ^ 0x39;
        E.lIIIllllII[7] = 55 + 95 - 17 + 57 ^ 142 + 170 - 173 + 47;
        E.lIIIllllII[8] = 48 + 104 - 89 + 76 ^ 47 + 44 - -19 + 32;
        E.lIIIllllII[9] = -(0xFFFFEEFC & 0x797B) & (0xFFFFFBFF & Short.MAX_VALUE);
        E.lIIIllllII[10] = -(0xFFFFD0A5 & 0x7F5B) & (0xFFFFFFFF & 0x7ECA);
        E.lIIIllllII[11] = -(0xFFFFCD1E & 0x72E7) & (0xFFFFFFEF & 0x5F5D);
        E.lIIIllllII[12] = 0xFFFFF553 & 0x3BFD;
        E.lIIIllllII[13] = -(0xFFFFB7ED & 0x68BB) & (0xFFFFBFEF & Short.MAX_VALUE);
        E.lIIIllllII[14] = 45 + 86 - -11 + 45 ^ 69 + 49 - 67 + 138;
        E.lIIIllllII[15] = 0x93 ^ 0x99;
        E.lIIIllllII[16] = -(0xFFFFDDFF & 0x7347) & (0xFFFFDDFF & 0x7FEE);
        E.lIIIllllII[17] = -(0xFFFF83F7 & 0x7E5A) & (0xFFFFCFDD & 0x3EF7);
        E.lIIIllllII[18] = 0x3B ^ 0x33;
        E.lIIIllllII[19] = 0x9D ^ 0x96;
        E.lIIIllllII[20] = 0x63 ^ 0x6B ^ (0x6B ^ 0x64);
        E.lIIIllllII[21] = 0x9E ^ 0x9B ^ (0x21 ^ 0x2D);
        E.lIIIllllII[22] = 8 + 109 - -3 + 8 ^ 71 + 81 - 127 + 115;
        E.lIIIllllII[23] = 0x14 ^ 0x11 ^ (0xCF ^ 0xC7);
        E.lIIIllllII[24] = 0x1D ^ 0x13;
        E.lIIIllllII[25] = 0x58 ^ 0x17 ^ (5 ^ 0x45);
        E.lIIIllllII[26] = 0x6B ^ 0x7B;
        E.lIIIllllII[27] = -(0xFFFFAB75 & 0x5C9B) & (0xFFFFDFBC & 0x2A7B);
        E.lIIIllllII[28] = 0x43 ^ 0x52;
        E.lIIIllllII[29] = 0x73 ^ 0x61;
        E.lIIIllllII[30] = 0x74 ^ 0x7E ^ (0x69 ^ 0x70);
        E.lIIIllllII[31] = 0xD1 ^ 0xC5;
        E.lIIIllllII[32] = 163 + 181 - 225 + 63 ^ 62 + 37 - 12 + 76;
        E.lIIIllllII[33] = 0xA7 ^ 0xB1;
        E.lIIIllllII[34] = 39 + 16 - -18 + 62 ^ 94 + 28 - 50 + 72;
        E.lIIIllllII[35] = 0x96 ^ 0xC0 ^ (0x32 ^ 0x7C);
        E.lIIIllllII[36] = 0x2F ^ 0x6A ^ (0xE1 ^ 0xBD);
        E.lIIIllllII[37] = 6 ^ 0x1C;
        E.lIIIllllII[38] = 0x27 ^ 0x3C;
        E.lIIIllllII[39] = 0xDE ^ 0xC2;
        E.lIIIllllII[40] = 0x3C ^ 0x21;
        E.lIIIllllII[41] = 0x59 ^ 0x28 ^ (0x5D ^ 0x32);
        E.lIIIllllII[42] = 0x66 ^ 0x79;
        E.lIIIllllII[43] = 61 + 102 - 119 + 144 ^ 64 + 43 - 20 + 69;
        E.lIIIllllII[44] = 0x32 ^ 0x13;
        E.lIIIllllII[45] = 125 + 65 - 159 + 116 ^ 166 + 124 - 129 + 16;
        E.lIIIllllII[46] = 0xFFFFBE3E & 0x7FDD;
        E.lIIIllllII[47] = -(0xFFFFEFED & 0x18F6) & (0xFFFFFFFF & 0x1FEF);
        E.lIIIllllII[48] = -(0xFFFFF1BF & 0x5E52) & (0xFFFFFFDD & 0x7EFF);
        E.lIIIllllII[49] = 0xFFFFF5E9 & 0x6BBE;
        E.lIIIllllII[50] = 0xFFFFAFFC & 0x576F;
        E.lIIIllllII[51] = 0xE ^ 0x6A;
        E.lIIIllllII[52] = 2 ^ (0x31 ^ 0x10);
        E.lIIIllllII[53] = 0xDE ^ 0xC7 ^ (0x8E ^ 0xB3);
        E.lIIIllllII[54] = 0xE7 ^ 0xC2;
        E.lIIIllllII[55] = 29 + 56 - 72 + 115 ^ 14 + 59 - -80 + 13;
        E.lIIIllllII[56] = 130 + 80 - 95 + 38 ^ 44 + 159 - 59 + 46;
        E.lIIIllllII[57] = 0x77 ^ 0x5F;
        E.lIIIllllII[58] = 0x62 ^ 0x4B;
        E.lIIIllllII[59] = 0x51 ^ 0x7B;
        E.lIIIllllII[60] = 0x46 ^ 0x6D;
        E.lIIIllllII[61] = 105 + 104 - 84 + 8 ^ 6 + 91 - 69 + 141;
        E.lIIIllllII[62] = 32 + 26 - -154 + 23 ^ 17 + 134 - 105 + 152;
        E.lIIIllllII[63] = 0x95 ^ 0xBB;
        E.lIIIllllII[64] = 0x9F ^ 0xB0;
        E.lIIIllllII[65] = 0x7C ^ 0x24 ^ (0xD3 ^ 0xBB);
        E.lIIIllllII[66] = 0x75 ^ 0x44;
        E.lIIIllllII[67] = 0xFFFFFC9B & 0xFEE;
        E.lIIIllllII[68] = -(0xFFFFF217 & 0x1FFA) & (0xFFFFFFDF & 0x1E7B);
        E.lIIIllllII[69] = 0xFFFFDCE8 & 0x2F7F;
        E.lIIIllllII[70] = 0xFFFFDFB9 & 0x2CF7;
        E.lIIIllllII[71] = -(0xFFFF9ADF & 0x75A5) & (0xFFFF9CFE & Short.MAX_VALUE);
        E.lIIIllllII[72] = 0xFFFFDD3E & 0x2EEF;
        E.lIIIllllII[73] = 0xFFFFBDFE & 0x675F;
        E.lIIIllllII[74] = 0x16 ^ 0x24;
    }

    private static boolean llllIIlIlIIl(int n2) {
        return n2 > 0;
    }

    @Override
    public String U() {
        return lIIIlllIlI[lIIIllllII[52]];
    }

    private static String llllIIIlllII(String llIIlIlllll, String llIIlIllllI) {
        llIIlIlllll = new String(Base64.getDecoder().decode(llIIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIllIIIlI = new StringBuilder();
        char[] llIIllIIIIl = llIIlIllllI.toCharArray();
        int llIIllIIIII = lIIIllllII[0];
        char[] llIIlIllIlI = llIIlIlllll.toCharArray();
        int llIIlIllIIl = llIIlIllIlI.length;
        int llIIlIllIII = lIIIllllII[0];
        while (E.llllIIlIIllI(llIIlIllIII, llIIlIllIIl)) {
            char llIIllIIlIl = llIIlIllIlI[llIIlIllIII];
            llIIllIIIlI.append((char)(llIIllIIlIl ^ llIIllIIIIl[llIIllIIIII % llIIllIIIIl.length]));
            0;
            ++llIIllIIIII;
            ++llIIlIllIII;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(llIIllIIIlI);
    }

    static {
        E.llllIIlIIIll();
        E.llllIIIlllll();
        String[] stringArray = new String[lIIIllllII[23]];
        stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[54]];
        stringArray[E.lIIIllllII[1]] = lIIIlllIlI[lIIIllllII[55]];
        stringArray[E.lIIIllllII[3]] = lIIIlllIlI[lIIIllllII[56]];
        stringArray[E.lIIIllllII[5]] = lIIIlllIlI[lIIIllllII[57]];
        stringArray[E.lIIIllllII[7]] = lIIIlllIlI[lIIIllllII[58]];
        stringArray[E.lIIIllllII[8]] = lIIIlllIlI[lIIIllllII[59]];
        stringArray[E.lIIIllllII[14]] = lIIIlllIlI[lIIIllllII[60]];
        stringArray[E.lIIIllllII[20]] = lIIIlllIlI[lIIIllllII[61]];
        stringArray[E.lIIIllllII[18]] = lIIIlllIlI[lIIIllllII[62]];
        stringArray[E.lIIIllllII[21]] = lIIIlllIlI[lIIIllllII[63]];
        stringArray[E.lIIIllllII[15]] = lIIIlllIlI[lIIIllllII[64]];
        stringArray[E.lIIIllllII[19]] = lIIIlllIlI[lIIIllllII[65]];
        stringArray[E.lIIIllllII[22]] = lIIIlllIlI[lIIIllllII[66]];
        ik = stringArray;
        il = new WorldPoint(lIIIllllII[16], lIIIllllII[67], lIIIllllII[0]);
        im = new WorldPoint(lIIIllllII[68], lIIIllllII[69], lIIIllllII[0]);
        in = new WorldPoint(lIIIllllII[70], lIIIllllII[71], lIIIllllII[0]);
        io = new WorldPoint(lIIIllllII[72], lIIIllllII[73], lIIIllllII[0]);
        bv = new ArrayList<d>();
        bT = lIIIllllII[0];
    }

    public static void ck() {
        if (E.llllIIlIIlIl(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[0]];
            b.a(bv);
            if (E.llllIIlIIllI(bv.size(), lIIIllllII[1])) {
                System.out.println(lIIIlllIlI[lIIIllllII[1]]);
                bt = lIIIllllII[0];
            }
        }
        if (E.llllIIlIIlll(bt ? 1 : 0)) {
            NPC llIlIIIllll;
            BankLocation llIlIIlIIII;
            if (E.llllIIlIIlIl(Inventory.contains((int[])f.aV) ? 1 : 0) && E.llllIIlIIllI(Movement.getRunEnergy(), lIIIllllII[2])) {
                Inventory.getFirst((int[])f.aV).interact(lIIIlllIlI[lIIIllllII[3]]);
                Time.sleepTicks((int)lIIIllllII[1]);
                0;
            }
            if (E.llllIIlIlIII(E.llllIIlIIlII(e.u(), 70.0))) {
                int[] nArray = new int[lIIIllllII[1]];
                nArray[E.lIIIllllII[0]] = lIIIllllII[4];
                if (E.llllIIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIllllII[1]];
                    nArray2[E.lIIIllllII[0]] = lIIIllllII[4];
                    Inventory.getFirst((int[])nArray2).interact(lIIIlllIlI[lIIIllllII[5]]);
                }
            }
            if (E.llllIIlIIlll(Movement.isRunEnabled() ? 1 : 0) && E.llllIIlIlIIl(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (E.llllIIlIIlll(E.ab() ? 1 : 0) && E.llllIIlIIllI(e.j(lIIIllllII[6]), lIIIllllII[1])) {
                llIlIIlIIII = BankLocation.getNearest();
                if (E.llllIIlIlIlI(llIlIIlIIII) && E.llllIIlIIlll(llIlIIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[7]];
                    a.a(llIlIIlIIII);
                    Time.sleepTicks((int)lIIIllllII[3]);
                    0;
                }
                if (E.llllIIlIlIlI(llIlIIlIIII) && E.llllIIlIIlIl(llIlIIlIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[8]];
                    if (E.llllIIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllII[9]);
                        0;
                    }
                    if (E.llllIIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (E.llllIIlIlIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIllllII[7]);
                            0;
                        }
                        if (E.llllIIlIlIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIllllII[3]);
                            0;
                        }
                        int[] nArray = new int[lIIIllllII[8]];
                        nArray[E.lIIIllllII[0]] = lIIIllllII[10];
                        nArray[E.lIIIllllII[1]] = lIIIllllII[11];
                        nArray[E.lIIIllllII[3]] = lIIIllllII[12];
                        nArray[E.lIIIllllII[5]] = lIIIllllII[13];
                        nArray[E.lIIIllllII[7]] = lIIIllllII[4];
                        if (E.llllIIlIIlll(e.b(nArray) ? 1 : 0)) {
                            E.af();
                            System.out.println(lIIIlllIlI[lIIIllllII[14]]);
                            bt = lIIIllllII[1];
                            return;
                        }
                        Bank.withdraw((int)lIIIllllII[11], (int)lIIIllllII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllII[1]);
                        0;
                        Bank.withdraw((int)lIIIllllII[13], (int)lIIIllllII[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllII[1]);
                        0;
                        Bank.withdraw((int)lIIIllllII[10], (int)lIIIllllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllII[1]);
                        0;
                        a.b(f.aV, lIIIllllII[1]);
                        a.a(lIIIllllII[4], lIIIllllII[15]);
                        a.b(f.bf, lIIIllllII[1]);
                    }
                }
            }
            if (E.llllIIlIIlIl(E.ab() ? 1 : 0) && E.llllIIlIIllI(e.j(lIIIllllII[6]), lIIIllllII[1])) {
                llIlIIlIIII = new WorldArea(lIIIllllII[16], lIIIllllII[17], lIIIllllII[18], lIIIllllII[19], lIIIllllII[0]);
                String[] stringArray = new String[lIIIllllII[1]];
                stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[20]];
                llIlIIIllll = NPCs.getNearest((String[])stringArray);
                if (E.llllIIlIlIll(llIlIIIllll) && E.llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(il), lIIIllllII[5]) && E.llllIIlIIlll(AccBuilderRogues.d ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[18]];
                    if (E.llllIIlIIllI(bT, lIIIllllII[1])) {
                        e.v();
                        bT += lIIIllllII[1];
                    }
                    Movement.walkTo((WorldPoint)il);
                    0;
                    Time.sleepTicks((int)lIIIllllII[1]);
                    0;
                }
                if (E.llllIIlIlIlI(llIlIIIllll)) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[21]];
                    g.a(lIIIlllIlI[lIIIllllII[15]], ik, lIIIllllII[1]);
                }
            }
            if (E.llllIIlIllIl(e.j(lIIIllllII[6]), lIIIllllII[1])) {
                if (E.llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(im), lIIIllllII[14])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[19]];
                    Movement.walkTo((WorldPoint)im);
                    0;
                    Time.sleepTicks((int)lIIIllllII[1]);
                    0;
                }
                if (E.llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(im), lIIIllllII[14])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[22]];
                    String[] stringArray = new String[lIIIllllII[1]];
                    stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[23]];
                    llIlIIlIIII = TileObjects.getNearest((String[])stringArray);
                    if (E.llllIIlIlIlI(llIlIIlIIII)) {
                        String[] stringArray2 = new String[lIIIllllII[1]];
                        stringArray2[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[24]];
                        if (E.llllIIlIIlIl(llIlIIlIIII.hasAction(stringArray2) ? 1 : 0)) {
                            llIlIIlIIII.interact(lIIIlllIlI[lIIIllllII[25]]);
                            Time.sleepTicks((int)lIIIllllII[8]);
                            0;
                        }
                    }
                    g.a(lIIIlllIlI[lIIIllllII[26]], ik);
                }
            }
            if (E.llllIIlIllIl(e.j(lIIIllllII[6]), lIIIllllII[3])) {
                if (E.llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    int[] nArray = new int[lIIIllllII[1]];
                    nArray[E.lIIIllllII[0]] = lIIIllllII[27];
                    if (E.llllIIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIIllllII[1]];
                        nArray3[E.lIIIllllII[0]] = lIIIllllII[27];
                        Inventory.getFirst((int[])nArray3).interact(lIIIlllIlI[lIIIllllII[28]]);
                        Time.sleepTicks((int)lIIIllllII[1]);
                        0;
                    }
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[29]];
                    Movement.walkTo((WorldPoint)in);
                    0;
                    Time.sleepTicks((int)lIIIllllII[1]);
                    0;
                }
                if (E.llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[30]];
                    String[] stringArray = new String[lIIIllllII[1]];
                    stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[31]];
                    llIlIIlIIII = NPCs.getNearest((String[])stringArray);
                    if (E.llllIIlIlIlI(llIlIIlIIII)) {
                        g.a(lIIIlllIlI[lIIIllllII[32]], ik);
                    }
                    if (E.llllIIlIlIll(llIlIIlIIII)) {
                        String[] stringArray3 = new String[lIIIllllII[1]];
                        stringArray3[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(lIIIlllIlI[lIIIllllII[34]]);
                        Time.sleepTicks((int)lIIIllllII[3]);
                        0;
                    }
                }
            }
            if (E.llllIIlIllIl(e.j(lIIIllllII[6]), lIIIllllII[5])) {
                ck = lIIIllllII[0];
                if (E.llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(io), lIIIllllII[5])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[35]];
                    Movement.walkTo((WorldPoint)io);
                    0;
                    Time.sleepTicks((int)lIIIllllII[1]);
                    0;
                }
                if (E.llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(io), lIIIllllII[5])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[36]];
                    String[] stringArray = new String[lIIIllllII[1]];
                    stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[37]];
                    llIlIIlIIII = TileObjects.getNearest((String[])stringArray);
                    if (E.llllIIlIlIlI(llIlIIlIIII)) {
                        llIlIIlIIII.interact(lIIIlllIlI[lIIIllllII[38]]);
                    }
                }
            }
            if (E.llllIIlIllIl(e.j(lIIIllllII[6]), lIIIllllII[7])) {
                if (E.llllIIlIllII(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    int[] nArray = new int[lIIIllllII[1]];
                    nArray[E.lIIIllllII[0]] = lIIIllllII[27];
                    if (E.llllIIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lIIIllllII[1]];
                        nArray4[E.lIIIllllII[0]] = lIIIllllII[27];
                        Inventory.getFirst((int[])nArray4).interact(lIIIlllIlI[lIIIllllII[39]]);
                        Time.sleepTicks((int)lIIIllllII[1]);
                        0;
                    }
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[40]];
                    Movement.walkTo((WorldPoint)in);
                    0;
                    Time.sleepTicks((int)lIIIllllII[1]);
                    0;
                }
                if (E.llllIIlIlllI(Players.getLocal().getWorldLocation().distanceTo(in), lIIIllllII[3])) {
                    AccBuilderRogues.c = lIIIlllIlI[lIIIllllII[41]];
                    String[] stringArray = new String[lIIIllllII[1]];
                    stringArray[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[42]];
                    llIlIIlIIII = TileObjects.getNearest((String[])stringArray);
                    if (E.llllIIlIlIlI(llIlIIlIIII)) {
                        String[] stringArray4 = new String[lIIIllllII[1]];
                        stringArray4[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[43]];
                        if (E.llllIIlIIlIl(llIlIIlIIII.hasAction(stringArray4) ? 1 : 0)) {
                            llIlIIlIIII.interact(lIIIlllIlI[lIIIllllII[44]]);
                            Time.sleepTicks((int)lIIIllllII[3]);
                            0;
                        }
                        String[] stringArray5 = new String[lIIIllllII[1]];
                        stringArray5[E.lIIIllllII[0]] = lIIIlllIlI[lIIIllllII[45]];
                        llIlIIIllll = Inventory.getFirst((String[])stringArray5);
                        if (E.llllIIlIlIlI(llIlIIIllll)) {
                            if (E.llllIIlIIllI(ck, lIIIllllII[1])) {
                                U.mJ += lIIIllllII[1];
                                U.o(AccBuilderRogues.m);
                                ck += lIIIllllII[1];
                                U.mJ = lIIIllllII[0];
                                cl = lIIIllllII[0];
                            }
                            llIlIIIllll.useOn((TileObject)llIlIIlIIII);
                            Time.sleepTicks((int)lIIIllllII[5]);
                            0;
                        }
                    }
                }
                g.a(ik);
            }
            g.a(new String[lIIIllllII[0]]);
        }
    }

    @Override
    public boolean S() {
        return lIIIllllII[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIIIllllII[1]];
        nArray[E.lIIIllllII[0]] = lIIIllllII[11];
        if (E.llllIIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0) && (!E.llllIIlIIlll(Inventory.contains((int[])f.aR) ? 1 : 0) || E.llllIIlIIlIl(Equipment.contains((int[])f.aR) ? 1 : 0)) && E.llllIIlIIlIl(Inventory.contains((int[])f.aV) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllllII[1]];
            nArray2[E.lIIIllllII[0]] = lIIIllllII[13];
            if (E.llllIIlIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIllllII[1]];
                nArray3[E.lIIIllllII[0]] = lIIIllllII[4];
                if (E.llllIIlIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIIllllII[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x6A ^ 0x71 ^ (0xCC ^ 0x91)) & (0xB9 ^ 0x9E ^ (0xE8 ^ 0x89) ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIllllII[0];
        return n2 != 0;
    }
}

