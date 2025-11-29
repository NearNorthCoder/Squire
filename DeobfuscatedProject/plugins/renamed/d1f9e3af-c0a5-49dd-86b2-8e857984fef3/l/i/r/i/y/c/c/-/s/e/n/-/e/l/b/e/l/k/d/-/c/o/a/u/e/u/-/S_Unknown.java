/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class S_Unknown
implements W {
    static /* synthetic */ boolean cm;
    private static /* synthetic */ String[] lIllllIlI;
    private static /* synthetic */ int[] lIlllllII;
    public static final /* synthetic */ WorldPoint jO;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ int cl;
    public static /* synthetic */ String[] bR;
    static /* synthetic */ int bT;
    public static final /* synthetic */ WorldPoint jM;
    public static final /* synthetic */ WorldPoint jP;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint jN;

    static {
        S.lIIllllIllll();
        S.lIIllllIlllI();
        jM = new WorldPoint(lIlllllII[61], lIlllllII[62], lIlllllII[0]);
        jN = new WorldPoint(lIlllllII[63], lIlllllII[64], lIlllllII[1]);
        jO = new WorldPoint(lIlllllII[65], lIlllllII[66], lIlllllII[0]);
        jP = new WorldPoint(lIlllllII[67], lIlllllII[68], lIlllllII[0]);
        String[] stringArray = new String[lIlllllII[15]];
        stringArray[S.lIlllllII[0]] = lIllllIlI[lIlllllII[69]];
        stringArray[S.lIlllllII[1]] = lIllllIlI[lIlllllII[70]];
        stringArray[S.lIlllllII[3]] = lIllllIlI[lIlllllII[71]];
        stringArray[S.lIlllllII[6]] = lIllllIlI[lIlllllII[72]];
        stringArray[S.lIlllllII[7]] = lIllllIlI[lIlllllII[2]];
        stringArray[S.lIlllllII[10]] = lIllllIlI[lIlllllII[73]];
        stringArray[S.lIlllllII[14]] = lIllllIlI[lIlllllII[74]];
        bR = stringArray;
        bv = new ArrayList<d>();
        bT = lIlllllII[0];
    }

    private static void lIIllllIlllI() {
        lIllllIlI = new String[lIlllllII[75]];
        S.lIllllIlI[S.lIlllllII[0]] = S."Buying items";
        S.lIllllIlI[S.lIlllllII[1]] = S."Finished buying items, switching back to quest";
        S.lIllllIlI[S.lIlllllII[3]] = S."Drink";
        S.lIllllIlI[S.lIlllllII[6]] = S."Nav to bank";
        S.lIllllIlI[S.lIlllllII[7]] = S."Handling banking";
        S.lIllllIlI[S.lIlllllII[10]] = S."We are missing quest supplies, switching to BUYING";
        S.lIllllIlI[S.lIlllllII[14]] = S."Nav to romeo";
        S.lIllllIlI[S.lIlllllII[15]] = S."Starting quest";
        S.lIllllIlI[S.lIlllllII[13]] = S."Romeo";
        S.lIllllIlI[S.lIlllllII[16]] = S."Wear";
        S.lIllllIlI[S.lIlllllII[12]] = S."Nav to juliet";
        S.lIllllIlI[S.lIlllllII[17]] = S."Talk to juliet";
        S.lIllllIlI[S.lIlllllII[18]] = S."Open";
        S.lIllllIlI[S.lIlllllII[19]] = S."Juliet";
        S.lIllllIlI[S.lIlllllII[21]] = S."Nav to romeo";
        S.lIllllIlI[S.lIlllllII[22]] = S."Starting quest";
        S.lIllllIlI[S.lIlllllII[23]] = S."Romeo";
        S.lIllllIlI[S.lIlllllII[25]] = S."Nav to father";
        S.lIllllIlI[S.lIlllllII[26]] = S."talk father";
        S.lIllllIlI[S.lIlllllII[27]] = S."Father Lawrence";
        S.lIllllIlI[S.lIlllllII[20]] = S."Nav to potion guy";
        S.lIllllIlI[S.lIlllllII[29]] = S."talk potions";
        S.lIllllIlI[S.lIlllllII[30]] = S."Apothecary";
        S.lIllllIlI[S.lIlllllII[31]] = S."Cadava potion";
        S.lIllllIlI[S.lIlllllII[32]] = S."Nav to potion guy";
        S.lIllllIlI[S.lIlllllII[33]] = S."Cadava potion";
        S.lIllllIlI[S.lIlllllII[34]] = S."talk potions";
        S.lIllllIlI[S.lIlllllII[35]] = S."Apothecary";
        S.lIllllIlI[S.lIlllllII[36]] = S."Cadava potion";
        S.lIllllIlI[S.lIlllllII[37]] = S."Wear";
        S.lIllllIlI[S.lIlllllII[24]] = S."Nav to juliet";
        S.lIllllIlI[S.lIlllllII[38]] = S."Talk to juliet";
        S.lIllllIlI[S.lIlllllII[39]] = S."Open";
        S.lIllllIlI[S.lIlllllII[40]] = S."Juliet";
        S.lIllllIlI[S.lIlllllII[42]] = S."Nav to romeo";
        S.lIllllIlI[S.lIlllllII[43]] = S."Finishing quest";
        S.lIllllIlI[S.lIlllllII[44]] = S."Romeo";
        S.lIllllIlI[S.lIlllllII[45]] = S."Nav to bank";
        S.lIllllIlI[S.lIlllllII[46]] = S."Handling banking";
        S.lIllllIlI[S.lIlllllII[47]] = S."We are missing quest supplies, switching to BUYING";
        S.lIllllIlI[S.lIlllllII[28]] = S."Romeo & Juliet quest";
        S.lIllllIlI[S.lIlllllII[54]] = S."ring of wealth (";
        S.lIllllIlI[S.lIlllllII[55]] = S."Door";
        S.lIllllIlI[S.lIlllllII[58]] = S."Open";
        S.lIllllIlI[S.lIlllllII[59]] = S."Door";
        S.lIllllIlI[S.lIlllllII[60]] = S."Open";
        S.lIllllIlI[S.lIlllllII[69]] = S."Yes, I have seen her actually!";
        S.lIllllIlI[S.lIlllllII[70]] = S."Yes, ok, I'll let her know.";
        S.lIllllIlI[S.lIlllllII[71]] = S."Ok, thanks.";
        S.lIllllIlI[S.lIlllllII[72]] = S."Talk about something else.";
        S.lIllllIlI[S.lIlllllII[2]] = S."Talk about Romeo & Juliet.";
        S.lIllllIlI[S.lIlllllII[73]] = S."Ok, thanks.";
        S.lIllllIlI[S.lIlllllII[74]] = S."Yes.";
    }

    private static void af() {
        d llIIIIllIllllI;
        Object llIIIIllIlllll;
        int[] nArray = new int[lIlllllII[1]];
        nArray[S.lIlllllII[0]] = lIlllllII[48];
        if (S.lIIlllllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlllllII[48], lIlllllII[10], i.bq);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlllllII[1]];
        nArray2[S.lIlllllII[0]] = lIlllllII[9];
        if (S.lIIlllllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIIIIllIlllll = new d(lIlllllII[9], lIlllllII[1], lIlllllII[49]);
            bv.add((d)llIIIIllIlllll);
            0;
        }
        if (S.lIIlllllIIlI(Bank.contains(llIIIIllIlllll = item -> item.getName().toLowerCase().contains(lIllllIlI[lIlllllII[54]])) ? 1 : 0)) {
            llIIIIllIllllI = new d(lIlllllII[50], lIlllllII[10], lIlllllII[51]);
            bv.add(llIIIIllIllllI);
            0;
        }
        int[] nArray3 = new int[lIlllllII[1]];
        nArray3[S.lIlllllII[0]] = lIlllllII[11];
        if (S.lIIlllllIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIIIIllIllllI = new d(lIlllllII[11], lIlllllII[20], lIlllllII[52]);
            bv.add(llIIIIllIllllI);
            0;
        }
    }

    private static boolean lIIlllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllllllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllllIlII(Object object) {
        return object != null;
    }

    private static void lIIllllIllll() {
        lIlllllII = new int[76];
        S.lIlllllII[0] = (0x50 ^ 0xC) & ~(0x52 ^ 0xE);
        S.lIlllllII[1] = 1;
        S.lIlllllII[2] = 0x36 ^ 4;
        S.lIlllllII[3] = 2;
        S.lIlllllII[4] = -(0xFFFFAE3D & 0x71DB) & (0xFFFFEBFB & 0x37FF);
        S.lIlllllII[5] = 119 + 92 - 136 + 69;
        S.lIlllllII[6] = 3;
        S.lIlllllII[7] = 0x95 ^ 0x91;
        S.lIlllllII[8] = 0xFFFFB7EE & 0x5B99;
        S.lIlllllII[9] = 0xFFFFAAF7 & 0x57F9;
        S.lIlllllII[10] = 0x8B ^ 0x90 ^ (0x40 ^ 0x5E);
        S.lIlllllII[11] = -(0xFFFFF61F & 0x69E1) & (0xFFFFFFE7 & 0x7F5F);
        S.lIlllllII[12] = 58 + 103 - 53 + 28 ^ 40 + 35 - 62 + 117;
        S.lIlllllII[13] = 0x74 ^ 0x7C;
        S.lIlllllII[14] = 17 + 118 - -22 + 15 ^ 3 + 3 - -122 + 42;
        S.lIlllllII[15] = 0x4A ^ 0x4D;
        S.lIlllllII[16] = 0xB9 ^ 0xB0;
        S.lIlllllII[17] = 0x13 ^ 0x18;
        S.lIlllllII[18] = 0x3B ^ 0x37;
        S.lIlllllII[19] = 0x4C ^ 0x46 ^ (0x80 ^ 0x87);
        S.lIlllllII[20] = 0xBB ^ 0xAF;
        S.lIlllllII[21] = 1 ^ (0x3E ^ 0x31);
        S.lIlllllII[22] = 116 + 40 - 55 + 100 ^ 117 + 193 - 252 + 140;
        S.lIlllllII[23] = 0x31 ^ 0x35 ^ (7 ^ 0x13);
        S.lIlllllII[24] = 0x4F ^ 8 ^ (0xC ^ 0x55);
        S.lIlllllII[25] = 0x34 ^ 0x25;
        S.lIlllllII[26] = 0x14 ^ 6;
        S.lIlllllII[27] = 0x7F ^ 0x6C;
        S.lIlllllII[28] = 0x55 ^ 0x1E ^ (0x5A ^ 0x39);
        S.lIlllllII[29] = 86 + 130 - 100 + 49 ^ 126 + 110 - 147 + 87;
        S.lIlllllII[30] = 0x8C ^ 0xB7 ^ (0x20 ^ 0xD);
        S.lIlllllII[31] = 0xD6 ^ 0xC1;
        S.lIlllllII[32] = 123 + 140 - 215 + 108 ^ 128 + 109 - 189 + 84;
        S.lIlllllII[33] = 0x43 ^ 0x5A;
        S.lIlllllII[34] = 0x33 ^ 0x6E ^ (0x54 ^ 0x13);
        S.lIlllllII[35] = 0x62 ^ 0x79;
        S.lIlllllII[36] = 0x53 ^ 0x35 ^ (0x1B ^ 0x61);
        S.lIlllllII[37] = 0x26 ^ 0x3B;
        S.lIlllllII[38] = 0xA ^ 0x15;
        S.lIlllllII[39] = 0x35 ^ 0x15;
        S.lIlllllII[40] = 0x86 ^ 0xA7;
        S.lIlllllII[41] = 0x11 ^ 0x2D;
        S.lIlllllII[42] = 0x57 ^ 0x75;
        S.lIlllllII[43] = 0x96 ^ 0xB9 ^ (0x6E ^ 0x62);
        S.lIlllllII[44] = 0x6C ^ 0x12 ^ (0x5C ^ 6);
        S.lIlllllII[45] = 0x70 ^ 0x28 ^ (0x4C ^ 0x31);
        S.lIlllllII[46] = 0x14 ^ 0x32;
        S.lIlllllII[47] = 0x90 ^ 0xB7;
        S.lIlllllII[48] = 0xFFFFBFD9 & 0x7177;
        S.lIlllllII[49] = 0xFFFFBFDD & 0x572E;
        S.lIlllllII[50] = -(0xFFFFBBB7 & 0x5479) & (0xFFFFFFFF & 0x3EFC);
        S.lIlllllII[51] = -(0xFFFFDED7 & 0x357A) & (0xFFFFFDF9 & 0x77FF);
        S.lIlllllII[52] = -(0xFFFFDA3B & 0x7DD7) & (0xFFFFFFFF & 0x5F7E);
        S.lIlllllII[53] = 0x65 ^ 1;
        S.lIlllllII[54] = 0x54 ^ 0x24 ^ (0x4A ^ 0x13);
        S.lIlllllII[55] = 0x62 ^ 0x74 ^ (0x95 ^ 0xA9);
        S.lIlllllII[56] = 0xFFFFCFD6 & 0x3C7F;
        S.lIlllllII[57] = -(0xFFFFE1FF & 0x5E95) & (0xFFFFEFFE & 0x5DF7);
        S.lIlllllII[58] = 0x6A ^ 0x41;
        S.lIlllllII[59] = 0x14 ^ 0x24 ^ (0x36 ^ 0x2A);
        S.lIlllllII[60] = 27 + 130 - 66 + 61 ^ 76 + 36 - 20 + 89;
        S.lIlllllII[61] = 0xFFFFAF9F & 0x5CEC;
        S.lIlllllII[62] = 0xFFFFFF78 & 0xDE7;
        S.lIlllllII[63] = 0xFFFFADF5 & 0x5E5F;
        S.lIlllllII[64] = -(0xFFFFFF2F & 0x20D7) & (0xFFFFEDFF & 0x3F67);
        S.lIlllllII[65] = -(0xFFFFE7CF & 0x7971) & (0xFFFFFFF7 & 0x6DFF);
        S.lIlllllII[66] = -(0xFFFFFEBE & 0x3145) & (0xFFFFFFDF & 0x3DBF);
        S.lIlllllII[67] = 0xFFFFBC7B & 0x4FFF;
        S.lIlllllII[68] = 0xFFFFBD5F & 0x4FEC;
        S.lIlllllII[69] = 0x3E ^ 0x10;
        S.lIlllllII[70] = 19 + 108 - -16 + 8 ^ 80 + 180 - 151 + 75;
        S.lIlllllII[71] = 129 + 40 - -17 + 5 ^ 94 + 83 - 57 + 23;
        S.lIlllllII[72] = 0x9C ^ 0xA3 ^ (0xC9 ^ 0xC7);
        S.lIlllllII[73] = 0x17 ^ 0x24;
        S.lIlllllII[74] = 0x34 ^ 0;
        S.lIlllllII[75] = 0x58 ^ 0x6D;
    }

    private static String lIIllllIllII(String llIIIIlIlIlIIl, String llIIIIlIlIlIII) {
        try {
            SecretKeySpec llIIIIlIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIlIlIllIl = Cipher.getInstance("Blowfish");
            llIIIIlIlIllIl.init(lIlllllII[3], llIIIIlIlIlllI);
            return new String(llIIIIlIlIllIl.doFinal(Base64.getDecoder().decode(llIIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIlIlIllII) {
            llIIIIlIlIllII.printStackTrace();
            return null;
        }
    }

    @Override
    public int T() {
        try {
            S.cW();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 >= 3) {
            return (0xC0 ^ 0xA2 ^ (0x78 ^ 0x23)) & (0x2C ^ 0x3E ^ (0x31 ^ 0x1A) ^ -1);
        }
        return lIlllllII[53];
    }

    /*
     * WARNING - void declaration
     */
    private static void ck() {
        void llIIIIlllIIIlI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (S.lIIlllllIlII(bankLocation) && S.lIIlllllIIlI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIllllIlI[lIlllllII[45]];
            a.a(bankLocation);
            Time.sleepTicks((int)lIlllllII[3]);
            0;
        }
        if (S.lIIlllllIlII(llIIIIlllIIIlI) && S.lIIlllllIIII(llIIIIlllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIllllIlI[lIlllllII[46]];
            if (S.lIIlllllIIlI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllllII[8]);
                0;
            }
            if (S.lIIlllllIIII(Bank.isOpen() ? 1 : 0)) {
                if (S.lIIlllllIIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIlllllII[7]);
                    0;
                }
                if (S.lIIlllllIIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIlllllII[3]);
                    0;
                }
                int[] nArray = new int[lIlllllII[1]];
                nArray[S.lIlllllII[0]] = lIlllllII[9];
                if (S.lIIlllllIIlI(e.b(nArray) ? 1 : 0)) {
                    S.af();
                    System.out.println(lIllllIlI[lIlllllII[47]]);
                    bt = lIlllllII[1];
                    return;
                }
                int[] nArray2 = new int[lIlllllII[1]];
                nArray2[S.lIlllllII[0]] = lIlllllII[9];
                if (S.lIIlllllIIII(e.b(nArray2) ? 1 : 0)) {
                    a.a(lIlllllII[9], lIlllllII[1]);
                    a.b(f.aV, lIlllllII[3]);
                    a.a(lIlllllII[11], lIlllllII[12]);
                    a.b(f.bf, lIlllllII[1]);
                }
            }
        }
    }

    private static String lIIllllIlIll(String llIIIIllIIllIl, String llIIIIllIIIlll) {
        llIIIIllIIllIl = new String(Base64.getDecoder().decode(llIIIIllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIllIIlIll = new StringBuilder();
        char[] llIIIIllIIlIlI = llIIIIllIIIlll.toCharArray();
        int llIIIIllIIlIIl = lIlllllII[0];
        char[] llIIIIllIIIIll = llIIIIllIIllIl.toCharArray();
        int llIIIIllIIIIlI = llIIIIllIIIIll.length;
        int llIIIIllIIIIIl = lIlllllII[0];
        while (S.lIIlllllIIIl(llIIIIllIIIIIl, llIIIIllIIIIlI)) {
            char llIIIIllIIlllI = llIIIIllIIIIll[llIIIIllIIIIIl];
            llIIIIllIIlIll.append((char)(llIIIIllIIlllI ^ llIIIIllIIlIlI[llIIIIllIIlIIl % llIIIIllIIlIlI.length]));
            0;
            ++llIIIIllIIlIIl;
            ++llIIIIllIIIIIl;
            0;
            if ((0x6D ^ 0x69) >= 3) continue;
            return null;
        }
        return String.valueOf(llIIIIllIIlIll);
    }

    private static boolean lIIlllllIIll(int n2) {
        return n2 > 0;
    }

    private static boolean ab() {
        int[] nArray = new int[lIlllllII[1]];
        nArray[S.lIlllllII[0]] = lIlllllII[9];
        return Inventory.contains((int[])nArray);
    }

    private static String lIIllllIlIlI(String llIIIIlIllIllI, String llIIIIlIllIlll) {
        try {
            SecretKeySpec llIIIIlIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIlIllIlll.getBytes(StandardCharsets.UTF_8)), lIlllllII[13]), "DES");
            Cipher llIIIIlIlllIlI = Cipher.getInstance("DES");
            llIIIIlIlllIlI.init(lIlllllII[3], llIIIIlIlllIll);
            return new String(llIIIIlIlllIlI.doFinal(Base64.getDecoder().decode(llIIIIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIlIlllIIl) {
            llIIIIlIlllIIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (S.lIIllllllIII(e.j(lIlllllII[5]), lIlllllII[53])) {
            bl = lIlllllII[1];
            0;
            if ((0xB0 ^ 0xB4) == 0) {
                return false;
            }
        } else {
            bl = lIlllllII[0];
        }
        return bl;
    }

    private static boolean lIIlllllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlllllIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIlllllII[0];
    }

    private static boolean lIIlllllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    public static void cW() {
        block52: {
            BankLocation llIIIIlllIIlII;
            block54: {
                block53: {
                    if (S.lIIlllllIIII(bt ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[0]];
                        b.a(bv);
                        if (S.lIIlllllIIIl(bv.size(), lIlllllII[1])) {
                            System.out.println(lIllllIlI[lIlllllII[1]]);
                            bt = lIlllllII[0];
                        }
                    }
                    if (!S.lIIlllllIIlI(bt ? 1 : 0)) break block52;
                    if (S.lIIlllllIIII(Inventory.contains((int[])f.aV) ? 1 : 0) && S.lIIlllllIIIl(Movement.getRunEnergy(), lIlllllII[2])) {
                        Inventory.getFirst((int[])f.aV).interact(lIllllIlI[lIlllllII[3]]);
                        Time.sleepTicks((int)lIlllllII[1]);
                        0;
                    }
                    if (S.lIIlllllIIlI(Movement.isRunEnabled() ? 1 : 0) && S.lIIlllllIIll(Movement.getRunEnergy())) {
                        Movement.toggleRun();
                    }
                    if (!S.lIIlllllIIII(S.ab() ? 1 : 0)) break block53;
                    int[] nArray = new int[lIlllllII[1]];
                    nArray[S.lIlllllII[0]] = lIlllllII[4];
                    if (!S.lIIlllllIIll(Inventory.getCount((int[])nArray))) break block54;
                }
                if (S.lIIlllllIIIl(e.j(lIlllllII[5]), lIlllllII[1])) {
                    llIIIIlllIIlII = BankLocation.getNearest();
                    if (S.lIIlllllIlII(llIIIIlllIIlII) && S.lIIlllllIIlI(llIIIIlllIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[6]];
                        a.a(llIIIIlllIIlII);
                        Time.sleepTicks((int)lIlllllII[3]);
                        0;
                    }
                    if (S.lIIlllllIlII(llIIIIlllIIlII) && S.lIIlllllIIII(llIIIIlllIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[7]];
                        if (S.lIIlllllIIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllllII[8]);
                            0;
                        }
                        if (S.lIIlllllIIII(Bank.isOpen() ? 1 : 0)) {
                            if (S.lIIlllllIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlllllII[7]);
                                0;
                            }
                            if (S.lIIlllllIIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlllllII[3]);
                                0;
                            }
                            int[] nArray = new int[lIlllllII[1]];
                            nArray[S.lIlllllII[0]] = lIlllllII[9];
                            if (S.lIIlllllIIlI(e.b(nArray) ? 1 : 0)) {
                                S.af();
                                System.out.println(lIllllIlI[lIlllllII[10]]);
                                bt = lIlllllII[1];
                                return;
                            }
                            int[] nArray2 = new int[lIlllllII[1]];
                            nArray2[S.lIlllllII[0]] = lIlllllII[9];
                            if (S.lIIlllllIIII(e.b(nArray2) ? 1 : 0)) {
                                a.a(lIlllllII[9], lIlllllII[1]);
                                a.b(f.aV, lIlllllII[3]);
                                a.a(lIlllllII[11], lIlllllII[12]);
                                a.b(f.bf, lIlllllII[1]);
                            }
                        }
                    }
                }
            }
            if (S.lIIlllllIIII(S.ab() ? 1 : 0) && S.lIIlllllIIIl(e.j(lIlllllII[5]), lIlllllII[1])) {
                if (S.lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[14]];
                    if (S.lIIlllllIIIl(bT, lIlllllII[1])) {
                        e.v();
                        bT += lIlllllII[1];
                    }
                    Movement.walkTo((WorldPoint)jM);
                    0;
                    Time.sleepTicks((int)lIlllllII[1]);
                    0;
                }
                if (S.lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[15]];
                    g.a(lIllllIlI[lIlllllII[13]], bR);
                }
            }
            if (S.lIIlllllIlll(e.j(lIlllllII[5]), lIlllllII[12])) {
                if (S.lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jN), lIlllllII[3])) {
                    if (S.lIIlllllIIII(Inventory.contains((int[])f.bf) ? 1 : 0) && S.lIIlllllIIlI(Equipment.contains((int[])f.bf) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.bf).interact(lIllllIlI[lIlllllII[16]]);
                        Time.sleepTicks((int)lIlllllII[1]);
                        0;
                    }
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[12]];
                    Movement.walkTo((WorldPoint)jN);
                    0;
                    Time.sleepTicks((int)lIlllllII[1]);
                    0;
                }
                if (S.lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jN), lIlllllII[3])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[17]];
                    llIIIIlllIIlII = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (S.lIIlllllIIII(tileObject.getName().contains(lIllllIlI[lIlllllII[59]]) ? 1 : 0) && S.lIIlllllIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllllII[56], lIlllllII[57], lIlllllII[1])), lIlllllII[3])) {
                            String[] stringArray = new String[lIlllllII[1]];
                            stringArray[S.lIlllllII[0]] = lIllllIlI[lIlllllII[60]];
                            if (S.lIIlllllIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIlllllII[1];
                                0;
                                if (null == null) return n2 != 0;
                                return ((173 + 57 - 6 + 8 ^ 175 + 145 - 268 + 144) & (0x74 ^ 0x4B ^ (0x3D ^ 0x2E) ^ -1)) != 0;
                            }
                        }
                        n2 = lIlllllII[0];
                        return n2 != 0;
                    });
                    if (S.lIIlllllIlII(llIIIIlllIIlII)) {
                        llIIIIlllIIlII.interact(lIllllIlI[lIlllllII[18]]);
                        Time.sleepTicks((int)lIlllllII[6]);
                        0;
                    }
                    g.a(lIllllIlI[lIlllllII[19]], bR);
                }
            }
            if (S.lIIlllllIlll(e.j(lIlllllII[5]), lIlllllII[20])) {
                if (S.lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[21]];
                    Movement.walkTo((WorldPoint)jM);
                    0;
                    Time.sleepTicks((int)lIlllllII[1]);
                    0;
                }
                if (S.lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[22]];
                    g.a(lIllllIlI[lIlllllII[23]], bR);
                }
            }
            if (S.lIIlllllIlll(e.j(lIlllllII[5]), lIlllllII[24])) {
                if (S.lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jO), lIlllllII[10])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[25]];
                    Movement.walkTo((WorldPoint)jO);
                    0;
                    Time.sleepTicks((int)lIlllllII[1]);
                    0;
                }
                if (S.lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jO), lIlllllII[10])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[26]];
                    g.a(lIllllIlI[lIlllllII[27]], bR);
                }
                g.a(bR);
            }
            if (S.lIIlllllIlll(e.j(lIlllllII[5]), lIlllllII[28])) {
                if (S.lIIlllllIIlI(S.ab() ? 1 : 0)) {
                    S.ck();
                }
                if (S.lIIlllllIIII(S.ab() ? 1 : 0)) {
                    if (S.lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jP), lIlllllII[10])) {
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[20]];
                        Movement.walkTo((WorldPoint)jP);
                        0;
                        Time.sleepTicks((int)lIlllllII[1]);
                        0;
                    }
                    if (S.lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jP), lIlllllII[10])) {
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[29]];
                        g.a(lIllllIlI[lIlllllII[30]], bR);
                    }
                }
            }
            if (S.lIIlllllIlll(e.j(lIlllllII[5]), lIlllllII[2])) {
                String[] stringArray = new String[lIlllllII[1]];
                stringArray[S.lIlllllII[0]] = lIllllIlI[lIlllllII[31]];
                if (S.lIIlllllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0) && S.lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jP), lIlllllII[10])) {
                    if (S.lIIlllllIIlI(S.ab() ? 1 : 0)) {
                        S.ck();
                    }
                    if (S.lIIlllllIIII(S.ab() ? 1 : 0) && S.lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jP), lIlllllII[10])) {
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[32]];
                        Movement.walkTo((WorldPoint)jP);
                        0;
                        Time.sleepTicks((int)lIlllllII[1]);
                        0;
                    }
                }
            }
            if (S.lIIlllllIlll(e.j(lIlllllII[5]), lIlllllII[2])) {
                String[] stringArray = new String[lIlllllII[1]];
                stringArray[S.lIlllllII[0]] = lIllllIlI[lIlllllII[33]];
                if (S.lIIlllllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0) && S.lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jP), lIlllllII[10])) {
                    cl = lIlllllII[0];
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[34]];
                    g.a(lIllllIlI[lIlllllII[35]], bR);
                }
            }
            if (S.lIIlllllIlll(e.j(lIlllllII[5]), lIlllllII[2])) {
                String[] stringArray = new String[lIlllllII[1]];
                stringArray[S.lIlllllII[0]] = lIllllIlI[lIlllllII[36]];
                if (S.lIIlllllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (S.lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jN), lIlllllII[3])) {
                        if (S.lIIlllllIIII(Inventory.contains((int[])f.bf) ? 1 : 0) && S.lIIlllllIIlI(Equipment.contains((int[])f.bf) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.bf).interact(lIllllIlI[lIlllllII[37]]);
                            Time.sleepTicks((int)lIlllllII[1]);
                            0;
                        }
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[24]];
                        Movement.walkTo((WorldPoint)jN);
                        0;
                        Time.sleepTicks((int)lIlllllII[1]);
                        0;
                    }
                    if (S.lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jN), lIlllllII[3])) {
                        AccBuilderEasyClues.c = lIllllIlI[lIlllllII[38]];
                        llIIIIlllIIlII = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (S.lIIlllllIIII(tileObject.getName().contains(lIllllIlI[lIlllllII[55]]) ? 1 : 0) && S.lIIlllllIllI(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlllllII[56], lIlllllII[57], lIlllllII[1])), lIlllllII[3])) {
                                String[] stringArray = new String[lIlllllII[1]];
                                stringArray[S.lIlllllII[0]] = lIllllIlI[lIlllllII[58]];
                                if (S.lIIlllllIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIlllllII[1];
                                    0;
                                    if (2 >= ((0x12 ^ 0x58) & ~(0x7E ^ 0x34))) return n2 != 0;
                                    return false;
                                }
                            }
                            n2 = lIlllllII[0];
                            return n2 != 0;
                        });
                        if (S.lIIlllllIlII(llIIIIlllIIlII)) {
                            llIIIIlllIIlII.interact(lIllllIlI[lIlllllII[39]]);
                            Time.sleepTicks((int)lIlllllII[6]);
                            0;
                        }
                        g.a(lIllllIlI[lIlllllII[40]], bR);
                    }
                    g.a(bR);
                }
            }
            if (S.lIIlllllIlll(e.j(lIlllllII[5]), lIlllllII[41])) {
                if (S.lIIlllllIlIl(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13]) && S.lIIlllllIIlI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[42]];
                    Movement.walkTo((WorldPoint)jM);
                    0;
                    Time.sleepTicks((int)lIlllllII[1]);
                    0;
                }
                if (S.lIIlllllIllI(Players.getLocal().getWorldLocation().distanceTo(jM), lIlllllII[13])) {
                    AccBuilderEasyClues.c = lIllllIlI[lIlllllII[43]];
                    if (S.lIIlllllIIIl(cl, lIlllllII[1])) {
                        an.pE += lIlllllII[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlllllII[1];
                        an.pE = lIlllllII[0];
                        cm = lIlllllII[0];
                    }
                    g.a(lIllllIlI[lIlllllII[44]], bR);
                    Time.sleepTicks((int)lIlllllII[10]);
                    0;
                }
            }
            g.a(bR);
            System.out.println("Setting: " + e.j(lIlllllII[5]));
        }
    }

    private static boolean lIIlllllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllllIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public String U() {
        return lIllllIlI[lIlllllII[28]];
    }
}

