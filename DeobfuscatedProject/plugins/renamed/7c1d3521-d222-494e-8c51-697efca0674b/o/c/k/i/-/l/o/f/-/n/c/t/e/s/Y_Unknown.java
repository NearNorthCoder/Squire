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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class Y_Unknown
implements ac {
    static /* synthetic */ boolean dj;
    private static final /* synthetic */ WorldPoint mz;
    public static final /* synthetic */ String[] my;
    static /* synthetic */ int cG;
    private static final /* synthetic */ WorldPoint mC;
    private static /* synthetic */ int[] llIlllllll;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] llIlllllIl;
    private static final /* synthetic */ WorldPoint mB;
    private static final /* synthetic */ WorldPoint mA;
    static /* synthetic */ int di;

    @Override
    public boolean ah() {
        boolean bl;
        if (Y.lIllllIIIllIl(e.j(llIlllllll[6]), llIlllllll[8])) {
            bl = llIlllllll[1];
            0;
            if (((0xB0 ^ 0x82) & ~(0xBC ^ 0x8E)) != 0) {
                return false;
            }
        } else {
            bl = llIlllllll[0];
        }
        return bl;
    }

    private static boolean lIllllIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllllIIIIIII() {
        llIlllllIl = new String[llIlllllll[74]];
        Y.llIlllllIl[Y.llIlllllll[0]] = Y."Buying items";
        Y.llIlllllIl[Y.llIlllllll[1]] = Y."Finished buying items, switching back to quest";
        Y.llIlllllIl[Y.llIlllllll[3]] = Y."Drink";
        Y.llIlllllIl[Y.llIlllllll[5]] = Y."Eat";
        Y.llIlllllIl[Y.llIlllllll[7]] = Y."Nav to bank";
        Y.llIlllllIl[Y.llIlllllll[8]] = Y."Handling banking";
        Y.llIlllllIl[Y.llIlllllll[14]] = Y."We are missing quest supplies, switching to BUYING";
        Y.llIlllllIl[Y.llIlllllll[20]] = Y."Father Aereck";
        Y.llIlllllIl[Y.llIlllllll[18]] = Y."Nav to start";
        Y.llIlllllIl[Y.llIlllllll[21]] = Y."Starting quest";
        Y.llIlllllIl[Y.llIlllllll[15]] = Y."Father Aereck";
        Y.llIlllllIl[Y.llIlllllll[19]] = Y."Nav to necklace guy";
        Y.llIlllllIl[Y.llIlllllll[22]] = Y."Interacting npc";
        Y.llIlllllIl[Y.llIlllllll[23]] = Y."Door";
        Y.llIlllllIl[Y.llIlllllll[24]] = Y."Open";
        Y.llIlllllIl[Y.llIlllllll[25]] = Y."Open";
        Y.llIlllllIl[Y.llIlllllll[26]] = Y."Father Urhney";
        Y.llIlllllIl[Y.llIlllllll[28]] = Y."Wear";
        Y.llIlllllIl[Y.llIlllllll[29]] = Y."Nav to coffin";
        Y.llIlllllIl[Y.llIlllllll[30]] = Y."Handling coffin";
        Y.llIlllllIl[Y.llIlllllll[31]] = Y."Restless ghost";
        Y.llIlllllIl[Y.llIlllllll[32]] = Y."Restless ghost";
        Y.llIlllllIl[Y.llIlllllll[33]] = Y."Coffin";
        Y.llIlllllIl[Y.llIlllllll[34]] = Y."Open";
        Y.llIlllllIl[Y.llIlllllll[35]] = Y."Nav to skull";
        Y.llIlllllIl[Y.llIlllllll[36]] = Y."Getting skull";
        Y.llIlllllIl[Y.llIlllllll[37]] = Y."Altar";
        Y.llIlllllIl[Y.llIlllllll[38]] = Y."Search";
        Y.llIlllllIl[Y.llIlllllll[39]] = Y."Wear";
        Y.llIlllllIl[Y.llIlllllll[40]] = Y."Nav to coffin";
        Y.llIlllllIl[Y.llIlllllll[41]] = Y."Handling coffin";
        Y.llIlllllIl[Y.llIlllllll[42]] = Y."Coffin";
        Y.llIlllllIl[Y.llIlllllll[43]] = Y."Open";
        Y.llIlllllIl[Y.llIlllllll[44]] = Y."Open";
        Y.llIlllllIl[Y.llIlllllll[45]] = Y."Ghost's skull";
        Y.llIlllllIl[Y.llIlllllll[52]] = Y."Restless ghost quest";
        Y.llIlllllIl[Y.llIlllllll[53]] = Y."ring of wealth (";
        Y.llIlllllIl[Y.llIlllllll[54]] = Y."Ok, I'm up for an adventure.";
        Y.llIlllllIl[Y.llIlllllll[55]] = Y."A glass of your finest ale please.";
        Y.llIlllllIl[Y.llIlllllll[56]] = Y."Morgan needs your help!";
        Y.llIlllllIl[Y.llIlllllll[57]] = Y."Yes.";
        Y.llIlllllIl[Y.llIlllllll[58]] = Y."I'm looking for a quest!";
        Y.llIlllllIl[Y.llIlllllll[59]] = Y."Ok, let me help then.";
        Y.llIlllllIl[Y.llIlllllll[60]] = Y."Father Aereck sent me to talk to you.";
        Y.llIlllllIl[Y.llIlllllll[61]] = Y."He's got a ghost haunting his graveyard.";
        Y.llIlllllIl[Y.llIlllllll[62]] = Y."Yep, now tell me what the problem is.";
        Y.llIlllllIl[Y.llIlllllll[63]] = Y."Sure.";
        Y.llIlllllIl[Y.llIlllllll[64]] = Y."I'm wearing an amulet of ghost speak!";
        Y.llIlllllIl[Y.llIlllllll[65]] = Y."Yes, I'm sure.";
        Y.llIlllllIl[Y.llIlllllll[66]] = Y."How can I help?";
    }

    private static boolean lIllllIIIIlll(int n2) {
        return n2 > 0;
    }

    @Override
    public String ag() {
        return llIlllllIl[llIlllllll[52]];
    }

    private static void lIllllIIIIIIl() {
        llIlllllll = new int[75];
        Y.llIlllllll[0] = (0x67 ^ 0x7B) & ~(0xAD ^ 0xB1);
        Y.llIlllllll[1] = 1;
        Y.llIlllllll[2] = 27 + 59 - 34 + 202 ^ 112 + 67 - 79 + 84;
        Y.llIlllllll[3] = 2;
        Y.llIlllllll[4] = -(0xFFFFD64F & 0x69B5) & (0xFFFFE7FF & 0x597F);
        Y.llIlllllll[5] = 3;
        Y.llIlllllll[6] = 0xD6 ^ 0xBD;
        Y.llIlllllll[7] = 0xBE ^ 0xBA;
        Y.llIlllllll[8] = 0x56 ^ 0x53;
        Y.llIlllllll[9] = 0xFFFFD7CE & 0x3BB9;
        Y.llIlllllll[10] = 0xFFFFBEDA & 0x6FEF;
        Y.llIlllllll[11] = 0xFFFF9F69 & 0x7FDE;
        Y.llIlllllll[12] = 0xFFFFFDFD & 0x3353;
        Y.llIlllllll[13] = 0xFFFF9F67 & 0x7FDF;
        Y.llIlllllll[14] = 0x95 ^ 0x93;
        Y.llIlllllll[15] = 0x6A ^ 0x56 ^ (0x19 ^ 0x2F);
        Y.llIlllllll[16] = -(0xFFFFF9F7 & 0x774E) & (0xFFFFFFEF & 0x7DFD);
        Y.llIlllllll[17] = -(0xFFFFEA1B & 0x37F7) & (0xFFFFEEFF & 0x3F96);
        Y.llIlllllll[18] = 0x20 ^ 0x28;
        Y.llIlllllll[19] = 0x41 ^ 0x4A;
        Y.llIlllllll[20] = 0x31 ^ 0x36;
        Y.llIlllllll[21] = 0x87 ^ 0x8E;
        Y.llIlllllll[22] = 0xA9 ^ 0xA5;
        Y.llIlllllll[23] = 0x37 ^ 0x3A;
        Y.llIlllllll[24] = 0x3F ^ 0x5D ^ (0x54 ^ 0x38);
        Y.llIlllllll[25] = 0x9D ^ 0x92;
        Y.llIlllllll[26] = 0xEA ^ 0x94 ^ (0x7D ^ 0x13);
        Y.llIlllllll[27] = -(0xFFFFB599 & 0x7BF7) & (0xFFFFBBBD & 0x77FA);
        Y.llIlllllll[28] = 0x83 ^ 0x92;
        Y.llIlllllll[29] = 0xE ^ 0x7C ^ (0xEF ^ 0x8F);
        Y.llIlllllll[30] = 0x7C ^ 0x6C ^ 3;
        Y.llIlllllll[31] = 0x3B ^ 0x2F;
        Y.llIlllllll[32] = 0xFE ^ 0x86 ^ (0x72 ^ 0x1F);
        Y.llIlllllll[33] = 0xB ^ 0x1D;
        Y.llIlllllll[34] = 2 ^ 0x18 ^ (0x48 ^ 0x45);
        Y.llIlllllll[35] = 0x5B ^ 4 ^ (0x2A ^ 0x6D);
        Y.llIlllllll[36] = 0x90 ^ 0x89;
        Y.llIlllllll[37] = 65 + 82 - 9 + 10 ^ 107 + 59 - 90 + 66;
        Y.llIlllllll[38] = 0x96 ^ 0x8D;
        Y.llIlllllll[39] = 0x60 ^ 0x7C;
        Y.llIlllllll[40] = 0x9F ^ 0x82;
        Y.llIlllllll[41] = 0x95 ^ 0x8B;
        Y.llIlllllll[42] = 0x5E ^ 0x41;
        Y.llIlllllll[43] = 0xB6 ^ 0x96;
        Y.llIlllllll[44] = 0xB4 ^ 0x95;
        Y.llIlllllll[45] = 0x9B ^ 0xB9;
        Y.llIlllllll[46] = -(0xFFFFFDA6 & 0x3FB) & (0xFFFFBFBD & Short.MAX_VALUE);
        Y.llIlllllll[47] = 0xFFFFBFDC & 0x572F;
        Y.llIlllllll[48] = 0xFFFFEFDD & 0x3EEE;
        Y.llIlllllll[49] = -(0xFFFFBE5B & 0x5BAC) & (0xFFFFFFFF & 0x7BAF);
        Y.llIlllllll[50] = 0xFFFFAF7D & 0x57EE;
        Y.llIlllllll[51] = 0x3C ^ 0x58;
        Y.llIlllllll[52] = 0xAC ^ 0x8F;
        Y.llIlllllll[53] = 0xAD ^ 0x89;
        Y.llIlllllll[54] = 0x8F ^ 0xAE ^ (0x50 ^ 0x54);
        Y.llIlllllll[55] = 0x52 ^ 0x74;
        Y.llIlllllll[56] = (0x51 ^ 0xF) & ~(0x78 ^ 0x26) ^ (0xA ^ 0x2D);
        Y.llIlllllll[57] = 0x26 ^ 0xE;
        Y.llIlllllll[58] = 65 + 122 - 159 + 144 ^ 27 + 83 - 56 + 79;
        Y.llIlllllll[59] = 0x77 ^ 0x5F ^ 2;
        Y.llIlllllll[60] = 0xE9 ^ 0xC2;
        Y.llIlllllll[61] = 0xE ^ 0x22;
        Y.llIlllllll[62] = 0x2F ^ 0xF ^ (0x24 ^ 0x29);
        Y.llIlllllll[63] = 0x8D ^ 0x84 ^ (0xBC ^ 0x9B);
        Y.llIlllllll[64] = 0xBE ^ 0xB0 ^ (0x6B ^ 0x4A);
        Y.llIlllllll[65] = 0xB1 ^ 0x81;
        Y.llIlllllll[66] = 3 ^ 0x32;
        Y.llIlllllll[67] = 0xFFFFCDDE & 0x3EAB;
        Y.llIlllllll[68] = 0xFFFFEC6E & 0x1FDB;
        Y.llIlllllll[69] = 0xFFFFAE7E & 0x5DE9;
        Y.llIlllllll[70] = -(0xFFFFF72F & 0x7BDD) & (0xFFFFFFFF & 0x7FBD);
        Y.llIlllllll[71] = -(0xFFFFD7E7 & 0x3B9A) & (0xFFFFBFFB & 0x5FFF);
        Y.llIlllllll[72] = 0xFFFF9FAF & 0x6C7E;
        Y.llIlllllll[73] = 0xFFFFEF5F & 0x35FE;
        Y.llIlllllll[74] = 0x21 ^ 0x13;
    }

    private static boolean lIllllIIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllllIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlllIlllllII(String var21, String var16) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), llIlllllll[18]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llIlllllll[3], var23);
            return new String(var11.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String lIlllIllllllI(String var14, String var10) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(llIlllllll[3], var20);
            return new String(var1.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static void eq() {
        if (Y.lIllllIIIIIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlllllIl[llIlllllll[0]];
            b.a(bv);
            if (Y.lIllllIIIIlII(bv.size(), llIlllllll[1])) {
                System.out.println(llIlllllIl[llIlllllll[1]]);
                bt = llIlllllll[0];
            }
        }
        if (Y.lIllllIIIIlIl(bt ? 1 : 0)) {
            NPC var12;
            BankLocation var5;
            if (Y.lIllllIIIIIll(Inventory.contains((int[])f.ba) ? 1 : 0) && Y.lIllllIIIIlII(Movement.getRunEnergy(), llIlllllll[2])) {
                Inventory.getFirst((int[])f.ba).interact(llIlllllIl[llIlllllll[3]]);
                Time.sleepTicks((int)llIlllllll[1]);
                0;
            }
            if (Y.lIllllIIIIllI(Y.lIllllIIIIIlI(e.w(), 70.0))) {
                int[] nArray = new int[llIlllllll[1]];
                nArray[Y.llIlllllll[0]] = llIlllllll[4];
                if (Y.lIllllIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llIlllllll[1]];
                    nArray2[Y.llIlllllll[0]] = llIlllllll[4];
                    Inventory.getFirst((int[])nArray2).interact(llIlllllIl[llIlllllll[5]]);
                }
            }
            if (Y.lIllllIIIIlIl(Movement.isRunEnabled() ? 1 : 0) && Y.lIllllIIIIlll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (Y.lIllllIIIIlIl(Y.an() ? 1 : 0) && Y.lIllllIIIIlII(e.j(llIlllllll[6]), llIlllllll[1])) {
                var5 = BankLocation.getNearest();
                if (Y.lIllllIIIlIII(var5) && Y.lIllllIIIIlIl(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[7]];
                    a.a(var5);
                    Time.sleepTicks((int)llIlllllll[3]);
                    0;
                }
                if (Y.lIllllIIIlIII(var5) && Y.lIllllIIIIIll(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[8]];
                    if (Y.lIllllIIIIlIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlllllll[9]);
                        0;
                    }
                    if (Y.lIllllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                        if (Y.lIllllIIIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIlllllll[7]);
                            0;
                        }
                        if (Y.lIllllIIIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIlllllll[3]);
                            0;
                        }
                        int[] nArray = new int[llIlllllll[8]];
                        nArray[Y.llIlllllll[0]] = llIlllllll[10];
                        nArray[Y.llIlllllll[1]] = llIlllllll[11];
                        nArray[Y.llIlllllll[3]] = llIlllllll[12];
                        nArray[Y.llIlllllll[5]] = llIlllllll[13];
                        nArray[Y.llIlllllll[7]] = llIlllllll[4];
                        if (Y.lIllllIIIIlIl(e.c(nArray) ? 1 : 0)) {
                            Y.Q();
                            System.out.println(llIlllllIl[llIlllllll[14]]);
                            bt = llIlllllll[1];
                            return;
                        }
                        Bank.withdraw((int)llIlllllll[11], (int)llIlllllll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllllll[1]);
                        0;
                        Bank.withdraw((int)llIlllllll[13], (int)llIlllllll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllllll[1]);
                        0;
                        Bank.withdraw((int)llIlllllll[10], (int)llIlllllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIlllllll[1]);
                        0;
                        a.b(f.ba, llIlllllll[1]);
                        a.a(llIlllllll[4], llIlllllll[15]);
                        a.b(f.bk, llIlllllll[1]);
                    }
                }
            }
            if (Y.lIllllIIIIIll(Y.an() ? 1 : 0) && Y.lIllllIIIIlII(e.j(llIlllllll[6]), llIlllllll[1])) {
                var5 = new WorldArea(llIlllllll[16], llIlllllll[17], llIlllllll[18], llIlllllll[19], llIlllllll[0]);
                String[] stringArray = new String[llIlllllll[1]];
                stringArray[Y.llIlllllll[0]] = llIlllllIl[llIlllllll[20]];
                var12 = NPCs.getNearest((String[])stringArray);
                if (Y.lIllllIIIlIIl(var12) && Y.lIllllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(mz), llIlllllll[5]) && Y.lIllllIIIIlIl(AccBuilderSotf.d ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[18]];
                    if (Y.lIllllIIIIlII(cG, llIlllllll[1])) {
                        e.x();
                        cG += llIlllllll[1];
                    }
                    Movement.walkTo((WorldPoint)mz);
                    0;
                    Time.sleepTicks((int)llIlllllll[1]);
                    0;
                }
                if (Y.lIllllIIIlIII(var12)) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[21]];
                    g.a(llIlllllIl[llIlllllll[15]], my, llIlllllll[1]);
                }
            }
            if (Y.lIllllIIIlIll(e.j(llIlllllll[6]), llIlllllll[1])) {
                if (Y.lIllllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(mA), llIlllllll[14])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[19]];
                    Movement.walkTo((WorldPoint)mA);
                    0;
                    Time.sleepTicks((int)llIlllllll[1]);
                    0;
                }
                if (Y.lIllllIIIllII(Players.getLocal().getWorldLocation().distanceTo(mA), llIlllllll[14])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[22]];
                    String[] stringArray = new String[llIlllllll[1]];
                    stringArray[Y.llIlllllll[0]] = llIlllllIl[llIlllllll[23]];
                    var5 = TileObjects.getNearest((String[])stringArray);
                    if (Y.lIllllIIIlIII(var5)) {
                        String[] stringArray2 = new String[llIlllllll[1]];
                        stringArray2[Y.llIlllllll[0]] = llIlllllIl[llIlllllll[24]];
                        if (Y.lIllllIIIIIll(var5.hasAction(stringArray2) ? 1 : 0)) {
                            var5.interact(llIlllllIl[llIlllllll[25]]);
                            Time.sleepTicks((int)llIlllllll[8]);
                            0;
                        }
                    }
                    g.a(llIlllllIl[llIlllllll[26]], my);
                }
            }
            if (Y.lIllllIIIlIll(e.j(llIlllllll[6]), llIlllllll[3])) {
                if (Y.lIllllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), llIlllllll[3])) {
                    int[] nArray = new int[llIlllllll[1]];
                    nArray[Y.llIlllllll[0]] = llIlllllll[27];
                    if (Y.lIllllIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[llIlllllll[1]];
                        nArray3[Y.llIlllllll[0]] = llIlllllll[27];
                        Inventory.getFirst((int[])nArray3).interact(llIlllllIl[llIlllllll[28]]);
                        Time.sleepTicks((int)llIlllllll[1]);
                        0;
                    }
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[29]];
                    Movement.walkTo((WorldPoint)mB);
                    0;
                    Time.sleepTicks((int)llIlllllll[1]);
                    0;
                }
                if (Y.lIllllIIIllII(Players.getLocal().getWorldLocation().distanceTo(mB), llIlllllll[3])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[30]];
                    String[] stringArray = new String[llIlllllll[1]];
                    stringArray[Y.llIlllllll[0]] = llIlllllIl[llIlllllll[31]];
                    var5 = NPCs.getNearest((String[])stringArray);
                    if (Y.lIllllIIIlIII(var5)) {
                        g.a(llIlllllIl[llIlllllll[32]], my);
                    }
                    if (Y.lIllllIIIlIIl(var5)) {
                        String[] stringArray3 = new String[llIlllllll[1]];
                        stringArray3[Y.llIlllllll[0]] = llIlllllIl[llIlllllll[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(llIlllllIl[llIlllllll[34]]);
                        Time.sleepTicks((int)llIlllllll[3]);
                        0;
                    }
                }
            }
            if (Y.lIllllIIIlIll(e.j(llIlllllll[6]), llIlllllll[5])) {
                di = llIlllllll[0];
                if (Y.lIllllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(mC), llIlllllll[5])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[35]];
                    Movement.walkTo((WorldPoint)mC);
                    0;
                    Time.sleepTicks((int)llIlllllll[1]);
                    0;
                }
                if (Y.lIllllIIIllII(Players.getLocal().getWorldLocation().distanceTo(mC), llIlllllll[5])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[36]];
                    String[] stringArray = new String[llIlllllll[1]];
                    stringArray[Y.llIlllllll[0]] = llIlllllIl[llIlllllll[37]];
                    var5 = TileObjects.getNearest((String[])stringArray);
                    if (Y.lIllllIIIlIII(var5)) {
                        var5.interact(llIlllllIl[llIlllllll[38]]);
                    }
                }
            }
            if (Y.lIllllIIIlIll(e.j(llIlllllll[6]), llIlllllll[7])) {
                if (Y.lIllllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(mB), llIlllllll[3])) {
                    int[] nArray = new int[llIlllllll[1]];
                    nArray[Y.llIlllllll[0]] = llIlllllll[27];
                    if (Y.lIllllIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[llIlllllll[1]];
                        nArray4[Y.llIlllllll[0]] = llIlllllll[27];
                        Inventory.getFirst((int[])nArray4).interact(llIlllllIl[llIlllllll[39]]);
                        Time.sleepTicks((int)llIlllllll[1]);
                        0;
                    }
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[40]];
                    Movement.walkTo((WorldPoint)mB);
                    0;
                    Time.sleepTicks((int)llIlllllll[1]);
                    0;
                }
                if (Y.lIllllIIIllII(Players.getLocal().getWorldLocation().distanceTo(mB), llIlllllll[3])) {
                    AccBuilderSotf.c = llIlllllIl[llIlllllll[41]];
                    String[] stringArray = new String[llIlllllll[1]];
                    stringArray[Y.llIlllllll[0]] = llIlllllIl[llIlllllll[42]];
                    var5 = TileObjects.getNearest((String[])stringArray);
                    if (Y.lIllllIIIlIII(var5)) {
                        String[] stringArray4 = new String[llIlllllll[1]];
                        stringArray4[Y.llIlllllll[0]] = llIlllllIl[llIlllllll[43]];
                        if (Y.lIllllIIIIIll(var5.hasAction(stringArray4) ? 1 : 0)) {
                            var5.interact(llIlllllIl[llIlllllll[44]]);
                            Time.sleepTicks((int)llIlllllll[3]);
                            0;
                        }
                        String[] stringArray5 = new String[llIlllllll[1]];
                        stringArray5[Y.llIlllllll[0]] = llIlllllIl[llIlllllll[45]];
                        var12 = Inventory.getFirst((String[])stringArray5);
                        if (Y.lIllllIIIlIII(var12)) {
                            if (Y.lIllllIIIIlII(di, llIlllllll[1])) {
                                aN.sU += llIlllllll[1];
                                aN.u(AccBuilderSotf.m);
                                di += llIlllllll[1];
                                aN.sU = llIlllllll[0];
                                dj = llIlllllll[0];
                            }
                            var12.useOn((TileObject)var5);
                            Time.sleepTicks((int)llIlllllll[5]);
                            0;
                        }
                    }
                }
                g.a(my);
            }
            g.a(new String[llIlllllll[0]]);
        }
    }

    private static int lIllllIIIIIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String lIlllIlllllIl(String var6, String var9) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var13 = var9.toCharArray();
        int var2 = llIlllllll[0];
        char[] var22 = var6.toCharArray();
        int var4 = var22.length;
        int var8 = llIlllllll[0];
        while (Y.lIllllIIIIlII(var8, var4)) {
            char var15 = var22[var8];
            var7.append((char)(var15 ^ var13[var2 % var13.length]));
            0;
            ++var2;
            ++var8;
            0;
            if (-(0x6A ^ 0x6F) < 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    @Override
    public boolean ae() {
        return llIlllllll[0];
    }

    private static boolean lIllllIIIllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllllIIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIllllIIIlIII(Object object) {
        return object != null;
    }

    private static void Q() {
        d var18;
        Object var19;
        int[] nArray = new int[llIlllllll[1]];
        nArray[Y.llIlllllll[0]] = llIlllllll[10];
        if (Y.lIllllIIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIlllllll[10], llIlllllll[1], llIlllllll[46]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIlllllll[1]];
        nArray2[Y.llIlllllll[0]] = llIlllllll[4];
        if (Y.lIllllIIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var19 = new d(llIlllllll[4], llIlllllll[15], llIlllllll[47]);
            bv.add((d)var19);
            0;
        }
        if (Y.lIllllIIIIlIl(Bank.contains(var19 = item -> item.getName().toLowerCase().contains(llIlllllIl[llIlllllll[53]])) ? 1 : 0)) {
            var18 = new d(llIlllllll[48], llIlllllll[8], llIlllllll[49]);
            bv.add(var18);
            0;
        }
        int[] nArray3 = new int[llIlllllll[1]];
        nArray3[Y.llIlllllll[0]] = llIlllllll[11];
        if (Y.lIllllIIIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var18 = new d(llIlllllll[11], llIlllllll[15], llIlllllll[50]);
            bv.add(var18);
            0;
        }
        int[] nArray4 = new int[llIlllllll[1]];
        nArray4[Y.llIlllllll[0]] = llIlllllll[13];
        if (Y.lIllllIIIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var18 = new d(llIlllllll[13], llIlllllll[31], llIlllllll[50]);
            bv.add(var18);
            0;
        }
        int[] nArray5 = new int[llIlllllll[1]];
        nArray5[Y.llIlllllll[0]] = llIlllllll[12];
        if (Y.lIllllIIIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var18 = new d(llIlllllll[12], llIlllllll[8], j.cf);
            bv.add(var18);
            0;
        }
    }

    private static boolean lIllllIIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllllIIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllIIIIllI(int n2) {
        return n2 < 0;
    }

    private static boolean lIllllIIIIlIl(int n2) {
        return n2 == 0;
    }

    @Override
    public int af() {
        try {
            Y.eq();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 == 3) {
            return (48 + 17 - 24 + 90 ^ 55 + 21 - 67 + 189) & (111 + 185 - 258 + 164 ^ 26 + 62 - 76 + 131 ^ -1);
        }
        return llIlllllll[51];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIlllllll[1]];
        nArray[Y.llIlllllll[0]] = llIlllllll[11];
        if (Y.lIllllIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0) && (!Y.lIllllIIIIlIl(Inventory.contains((int[])f.aW) ? 1 : 0) || Y.lIllllIIIIIll(Equipment.contains((int[])f.aW) ? 1 : 0)) && Y.lIllllIIIIIll(Inventory.contains((int[])f.ba) ? 1 : 0)) {
            int[] nArray2 = new int[llIlllllll[1]];
            nArray2[Y.llIlllllll[0]] = llIlllllll[13];
            if (Y.lIllllIIIIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llIlllllll[1]];
                nArray3[Y.llIlllllll[0]] = llIlllllll[4];
                if (Y.lIllllIIIIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = llIlllllll[1];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = llIlllllll[0];
        return n2 != 0;
    }

    static {
        Y.lIllllIIIIIIl();
        Y.lIllllIIIIIII();
        String[] stringArray = new String[llIlllllll[23]];
        stringArray[Y.llIlllllll[0]] = llIlllllIl[llIlllllll[54]];
        stringArray[Y.llIlllllll[1]] = llIlllllIl[llIlllllll[55]];
        stringArray[Y.llIlllllll[3]] = llIlllllIl[llIlllllll[56]];
        stringArray[Y.llIlllllll[5]] = llIlllllIl[llIlllllll[57]];
        stringArray[Y.llIlllllll[7]] = llIlllllIl[llIlllllll[58]];
        stringArray[Y.llIlllllll[8]] = llIlllllIl[llIlllllll[59]];
        stringArray[Y.llIlllllll[14]] = llIlllllIl[llIlllllll[60]];
        stringArray[Y.llIlllllll[20]] = llIlllllIl[llIlllllll[61]];
        stringArray[Y.llIlllllll[18]] = llIlllllIl[llIlllllll[62]];
        stringArray[Y.llIlllllll[21]] = llIlllllIl[llIlllllll[63]];
        stringArray[Y.llIlllllll[15]] = llIlllllIl[llIlllllll[64]];
        stringArray[Y.llIlllllll[19]] = llIlllllIl[llIlllllll[65]];
        stringArray[Y.llIlllllll[22]] = llIlllllIl[llIlllllll[66]];
        my = stringArray;
        mz = new WorldPoint(llIlllllll[16], llIlllllll[67], llIlllllll[0]);
        mA = new WorldPoint(llIlllllll[68], llIlllllll[69], llIlllllll[0]);
        mB = new WorldPoint(llIlllllll[70], llIlllllll[71], llIlllllll[0]);
        mC = new WorldPoint(llIlllllll[72], llIlllllll[73], llIlllllll[0]);
        bv = new ArrayList<d>();
        cG = llIlllllll[0];
    }
}

