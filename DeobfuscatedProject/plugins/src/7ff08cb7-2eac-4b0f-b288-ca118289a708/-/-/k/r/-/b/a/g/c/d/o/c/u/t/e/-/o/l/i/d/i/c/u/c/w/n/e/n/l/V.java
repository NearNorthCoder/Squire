/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
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
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
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
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
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
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class V
implements ab {
    private static /* synthetic */ String[] llIIlIIll;
    private static /* synthetic */ int[] llIIlIlII;
    public static /* synthetic */ WorldPoint lq;
    static /* synthetic */ int dk;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ List<d> bx;
    static /* synthetic */ boolean dl;
    private static final /* synthetic */ String[] lp;
    static /* synthetic */ int cI;

    static {
        V.lIlIlIlIIIll();
        V.lIlIlIlIIIlI();
        String[] stringArray = new String[llIIlIlII[15]];
        stringArray[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[64]];
        stringArray[V.llIIlIlII[1]] = llIIlIIll[llIIlIlII[65]];
        stringArray[V.llIIlIlII[3]] = llIIlIIll[llIIlIlII[66]];
        stringArray[V.llIIlIlII[5]] = llIIlIIll[llIIlIlII[67]];
        stringArray[V.llIIlIlII[6]] = llIIlIIll[llIIlIlII[68]];
        stringArray[V.llIIlIlII[8]] = llIIlIIll[llIIlIlII[69]];
        stringArray[V.llIIlIlII[10]] = llIIlIIll[llIIlIlII[70]];
        lp = stringArray;
        bx = new ArrayList<d>();
        lq = new WorldPoint(llIIlIlII[71], llIIlIlII[72], llIIlIlII[0]);
        cI = llIIlIlII[0];
    }

    private static void lIlIlIlIIIll() {
        llIIlIlII = new int[74];
        V.llIIlIlII[0] = (0xBF ^ 0x90 ^ (0xFC ^ 0x97)) & (184 + 80 - 125 + 57 ^ 12 + 55 - 1 + 62 ^ -" ".length());
        V.llIIlIlII[1] = " ".length();
        V.llIIlIlII[2] = 0x64 ^ 0x2F;
        V.llIIlIlII[3] = "  ".length();
        V.llIIlIlII[4] = 2 ^ 0x3C;
        V.llIIlIlII[5] = "   ".length();
        V.llIIlIlII[6] = 5 + 69 - 33 + 100 ^ 2 + 51 - -83 + 1;
        V.llIIlIlII[7] = 0xFFFFB7AE & 0x5BD9;
        V.llIIlIlII[8] = 0x7E ^ 0x7B;
        V.llIIlIlII[9] = 0xFFFFF9B1 & 0x76E;
        V.llIIlIlII[10] = 0x9B ^ 0x9D;
        V.llIIlIlII[11] = -(0xFFFFAF2B & 0x51DD) & (0xFFFFEFEF & 0x17FF);
        V.llIIlIlII[12] = -(0xFFFFE81B & 0x37E5) & (0xFFFFAFED & 0x76FB);
        V.llIIlIlII[13] = 0xFFFFB755 & 0x79FB;
        V.llIIlIlII[14] = -(0xFFFFF5EB & 0x6AB5) & (0xFFFFFFE9 & Short.MAX_VALUE);
        V.llIIlIlII[15] = 72 + 138 - 119 + 67 ^ 26 + 70 - -22 + 35;
        V.llIIlIlII[16] = 0x44 ^ 0x4C;
        V.llIIlIlII[17] = " ".length() ^ (0xB6 ^ 0xBE);
        V.llIIlIlII[18] = 0x12 ^ 0x41 ^ (3 ^ 0x5A);
        V.llIIlIlII[19] = 0x76 ^ 0x7B ^ (0xC1 ^ 0xC7);
        V.llIIlIlII[20] = 127 + 43 - 68 + 78 ^ 21 + 172 - 185 + 176;
        V.llIIlIlII[21] = 0xBA ^ 0xB7;
        V.llIIlIlII[22] = 0xFFFFFEE6 & 0x3B9;
        V.llIIlIlII[23] = -(0xFFFFFC91 & 0x6F6F) & (0xFFFFEFAB & 0x7EF5);
        V.llIIlIlII[24] = -(0xFFFFFFEB & 0x1955) & (0xFFFFFFFF & 0x1BDF);
        V.llIIlIlII[25] = 0xE7 ^ 0x9F ^ (0x50 ^ 0x26);
        V.llIIlIlII[26] = 0xC ^ 0x5E ^ (0x2B ^ 0x76);
        V.llIIlIlII[27] = 0x62 ^ 0x72;
        V.llIIlIlII[28] = 0x16 ^ 7;
        V.llIIlIlII[29] = "   ".length() ^ (0x50 ^ 0x41);
        V.llIIlIlII[30] = 0x3C ^ 0x2F;
        V.llIIlIlII[31] = 0x5D ^ 0 ^ (0x48 ^ 1);
        V.llIIlIlII[32] = 0x42 ^ 0x57;
        V.llIIlIlII[33] = 0x64 ^ 0x72;
        V.llIIlIlII[34] = 0x67 ^ 0x32 ^ (0xC ^ 0x4E);
        V.llIIlIlII[35] = -(0xFFFFB2DD & 0x5D63) & (0xFFFFD265 & 0x3FDE);
        V.llIIlIlII[36] = 0xDA ^ 0x8B ^ (7 ^ 0x4E);
        V.llIIlIlII[37] = 81 + 151 - 115 + 54 ^ 6 + 6 - 4 + 170;
        V.llIIlIlII[38] = 0xC4 ^ 0xA1 ^ 78 + 83 - 89 + 55;
        V.llIIlIlII[39] = 0x47 ^ 0x5C;
        V.llIIlIlII[40] = 0x24 ^ 0x38;
        V.llIIlIlII[41] = 0xFFFFE527 & 0x1EDD;
        V.llIIlIlII[42] = 0xBF ^ 0xA2;
        V.llIIlIlII[43] = 0x1A ^ 0x52 ^ (0x1F ^ 0x49);
        V.llIIlIlII[44] = 0xF6 ^ 0x8D ^ (0xDF ^ 0xBB);
        V.llIIlIlII[45] = -(0xFFFFF7EB & 0x6EDF) & (0xFFFFEFFF & 0x77DF);
        V.llIIlIlII[46] = 0x87 ^ 0xA7;
        V.llIIlIlII[47] = 0x17 ^ 0x36;
        V.llIIlIlII[48] = 43 + 102 - 90 + 114 ^ 67 + 137 - 142 + 77;
        V.llIIlIlII[49] = 0x6D ^ 0x4E;
        V.llIIlIlII[50] = 0x6C ^ 0x48;
        V.llIIlIlII[51] = 0x15 ^ 0x10 ^ (0xAC ^ 0x8C);
        V.llIIlIlII[52] = 0x3B ^ 0x1D;
        V.llIIlIlII[53] = 0x4F ^ 0x55 ^ (0xF ^ 0x32);
        V.llIIlIlII[54] = 0xA0 ^ 0x88;
        V.llIIlIlII[55] = 0x77 ^ 0x4D ^ (0x69 ^ 0x7A);
        V.llIIlIlII[56] = -(0xFFFFDFCB & 0x7CB7) & (0xFFFFFFFE & 0x7FAB);
        V.llIIlIlII[57] = -(0xFFFF813F & 0x7FD3) & (0xFFFFBFDE & 0x6FFF);
        V.llIIlIlII[58] = -(0xFFFF9E5E & 0x67F5) & (0xFFFFF7FB & 0x6FFF);
        V.llIIlIlII[59] = -(0xFFFFFFDD & 0x40BB) & (0xFFFFFFFF & 0x5FDF);
        V.llIIlIlII[60] = -(0xFFFFCF97 & 0x70F9) & (0xFFFFEFFC & 0x57FF);
        V.llIIlIlII[61] = 0xFB ^ 0x9F;
        V.llIIlIlII[62] = 8 ^ 0x11 ^ (0 ^ 0x33);
        V.llIIlIlII[63] = 0xF3 ^ 0xAD ^ (0x37 ^ 0x42);
        V.llIIlIlII[64] = 64 + 70 - 106 + 117 ^ 162 + 32 - 68 + 63;
        V.llIIlIlII[65] = 0x55 ^ 0x78;
        V.llIIlIlII[66] = 0x61 ^ 0x4F;
        V.llIIlIlII[67] = 0xF4 ^ 0xA4 ^ 92 + 56 - 106 + 85;
        V.llIIlIlII[68] = 9 ^ 0x10 ^ (0xF ^ 0x26);
        V.llIIlIlII[69] = 0x38 ^ 9;
        V.llIIlIlII[70] = 0x7A ^ 0x48;
        V.llIIlIlII[71] = -(0xFFFFED77 & 0x76AB) & (0xFFFFFFEF & 0x6FBF);
        V.llIIlIlII[72] = 0xFFFF8FBC & 0x7DFB;
        V.llIIlIlII[73] = 0x1B ^ 0x28;
    }

    private static String lIlIlIlIIIII(String lIllIIIIllIllI, String lIllIIIIllIlIl) {
        try {
            SecretKeySpec lIllIIIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIIIlllIlI = Cipher.getInstance("Blowfish");
            lIllIIIIlllIlI.init(llIIlIlII[3], lIllIIIIlllIll);
            return new String(lIllIIIIlllIlI.doFinal(Base64.getDecoder().decode(lIllIIIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIIlllIIl) {
            lIllIIIIlllIIl.printStackTrace();
            return null;
        }
    }

    public static void dh() {
        block49: {
            BankLocation lIllIIIllIlIII;
            block52: {
                block53: {
                    block51: {
                        block50: {
                            if (V.lIlIlIlIIlII(bv ? 1 : 0)) {
                                AccBuilderGWD.c = llIIlIIll[llIIlIlII[0]];
                                b.a(bx);
                                if (V.lIlIlIlIIlIl(bx.size(), llIIlIlII[1])) {
                                    System.out.println(llIIlIIll[llIIlIlII[1]]);
                                    bv = llIIlIlII[0];
                                }
                            }
                            if (!V.lIlIlIlIIllI(bv ? 1 : 0)) break block49;
                            if (V.lIlIlIlIIlII(Inventory.contains((int[])f.bc) ? 1 : 0) && V.lIlIlIlIIlIl(Movement.getRunEnergy(), llIIlIlII[2]) && V.lIlIlIlIIllI(Dialog.isOpen() ? 1 : 0)) {
                                Inventory.getFirst((int[])f.bc).interact(llIIlIIll[llIIlIlII[3]]);
                                Time.sleepTicks((int)llIIlIlII[1]);
                                "".length();
                            }
                            if (V.lIlIlIlIIllI(V.an() ? 1 : 0) && V.lIlIlIlIIlIl(e.j(llIIlIlII[4]), llIIlIlII[1])) {
                                lIllIIIllIlIII = BankLocation.getNearest();
                                if (V.lIlIlIlIIlll(lIllIIIllIlIII) && V.lIlIlIlIIllI(lIllIIIllIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = llIIlIIll[llIIlIlII[5]];
                                    a.a(lIllIIIllIlIII);
                                }
                                if (V.lIlIlIlIIlll(lIllIIIllIlIII) && V.lIlIlIlIIlII(lIllIIIllIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (V.lIlIlIlIIllI(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[6]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIlII[7]);
                                        "".length();
                                    }
                                    if (V.lIlIlIlIIlII(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[8]];
                                        if (V.lIlIlIlIlIII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)llIIlIlII[6]);
                                            "".length();
                                        }
                                        if (V.lIlIlIlIlIII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)llIIlIlII[3]);
                                            "".length();
                                        }
                                        int[] nArray = new int[llIIlIlII[1]];
                                        nArray[V.llIIlIlII[0]] = llIIlIlII[9];
                                        if (V.lIlIlIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                            int[] nArray2 = new int[llIIlIlII[1]];
                                            nArray2[V.llIIlIlII[0]] = llIIlIlII[9];
                                            if (V.lIlIlIlIIlIl(Bank.getFirst((int[])nArray2).getQuantity(), llIIlIlII[5])) {
                                                V.Q();
                                                System.out.println(llIIlIIll[llIIlIlII[10]]);
                                                bv = llIIlIlII[1];
                                                return;
                                            }
                                        }
                                        int[] nArray3 = new int[llIIlIlII[8]];
                                        nArray3[V.llIIlIlII[0]] = llIIlIlII[11];
                                        nArray3[V.llIIlIlII[1]] = llIIlIlII[12];
                                        nArray3[V.llIIlIlII[3]] = llIIlIlII[9];
                                        nArray3[V.llIIlIlII[5]] = llIIlIlII[13];
                                        nArray3[V.llIIlIlII[6]] = llIIlIlII[14];
                                        if (V.lIlIlIlIIllI(e.d(nArray3) ? 1 : 0)) {
                                            V.Q();
                                            System.out.println(llIIlIIll[llIIlIlII[15]]);
                                            bv = llIIlIlII[1];
                                            return;
                                        }
                                    }
                                    int[] nArray = new int[llIIlIlII[8]];
                                    nArray[V.llIIlIlII[0]] = llIIlIlII[11];
                                    nArray[V.llIIlIlII[1]] = llIIlIlII[12];
                                    nArray[V.llIIlIlII[3]] = llIIlIlII[9];
                                    nArray[V.llIIlIlII[5]] = llIIlIlII[13];
                                    nArray[V.llIIlIlII[6]] = llIIlIlII[14];
                                    if (V.lIlIlIlIIlII(e.d(nArray) ? 1 : 0)) {
                                        Bank.withdraw((int)llIIlIlII[11], (int)llIIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llIIlIlII[1]);
                                        "".length();
                                        Bank.withdraw((int)llIIlIlII[12], (int)llIIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llIIlIlII[1]);
                                        "".length();
                                        Bank.withdraw((int)llIIlIlII[9], (int)llIIlIlII[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llIIlIlII[1]);
                                        "".length();
                                        Bank.withdraw((int)llIIlIlII[13], (int)llIIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llIIlIlII[1]);
                                        "".length();
                                        Bank.withdraw((int)llIIlIlII[14], (int)llIIlIlII[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llIIlIlII[1]);
                                        "".length();
                                        a.b(f.bm, llIIlIlII[1]);
                                        Time.sleepTicks((int)llIIlIlII[5]);
                                        "".length();
                                    }
                                }
                            }
                            if (V.lIlIlIlIIlII(V.an() ? 1 : 0) && V.lIlIlIlIIlIl(e.j(llIIlIlII[4]), llIIlIlII[1])) {
                                if (V.lIlIlIlIIlIl(cI, llIIlIlII[1])) {
                                    e.x();
                                    cI += llIIlIlII[1];
                                }
                                if (V.lIlIlIlIlIII(cI)) {
                                    if (V.lIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(lq), llIIlIlII[8])) {
                                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[16]];
                                        Movement.walkTo((WorldPoint)lq);
                                        "".length();
                                        Time.sleepTicks((int)llIIlIlII[1]);
                                        "".length();
                                    }
                                    if (V.lIlIlIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(lq), llIIlIlII[8])) {
                                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[17]];
                                        String[] stringArray = new String[llIIlIlII[1]];
                                        stringArray[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[18]];
                                        lIllIIIllIlIII = TileObjects.getNearest((String[])stringArray);
                                        if (V.lIlIlIlIIlll(lIllIIIllIlIII)) {
                                            String[] stringArray2 = new String[llIIlIlII[1]];
                                            stringArray2[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[19]];
                                            if (V.lIlIlIlIIlII(lIllIIIllIlIII.hasAction(stringArray2) ? 1 : 0)) {
                                                lIllIIIllIlIII.interact(llIIlIIll[llIIlIlII[20]]);
                                                Time.sleepTicks((int)llIIlIlII[5]);
                                                "".length();
                                            }
                                        }
                                        g.a(llIIlIIll[llIIlIlII[21]], lp);
                                    }
                                }
                            }
                            int[] nArray = new int[llIIlIlII[1]];
                            nArray[V.llIIlIlII[0]] = llIIlIlII[22];
                            if (!V.lIlIlIlIIlll(NPCs.getNearest((int[])nArray))) break block50;
                            int[] nArray4 = new int[llIIlIlII[1]];
                            nArray4[V.llIIlIlII[0]] = llIIlIlII[23];
                            if (!V.lIlIlIlIIlll(NPCs.getNearest((int[])nArray4))) break block50;
                            int[] nArray5 = new int[llIIlIlII[1]];
                            nArray5[V.llIIlIlII[0]] = llIIlIlII[24];
                            if (!V.lIlIlIlIlIll(NPCs.getNearest((int[])nArray5))) break block51;
                        }
                        g.a(lp);
                    }
                    if (!V.lIlIlIlIllII(e.j(llIIlIlII[4]), llIIlIlII[5])) break block52;
                    String[] stringArray = new String[llIIlIlII[1]];
                    stringArray[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[25]];
                    if (!V.lIlIlIlIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block53;
                    String[] stringArray3 = new String[llIIlIlII[1]];
                    stringArray3[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[26]];
                    if (!V.lIlIlIlIIlII(Inventory.contains((String[])stringArray3) ? 1 : 0)) break block52;
                }
                int[] nArray = new int[llIIlIlII[1]];
                nArray[V.llIIlIlII[0]] = llIIlIlII[9];
                if (V.lIlIlIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlIIll[llIIlIlII[27]];
                    String[] stringArray = new String[llIIlIlII[1]];
                    stringArray[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[28]];
                    lIllIIIllIlIII = Inventory.getFirst((String[])stringArray);
                    String[] stringArray4 = new String[llIIlIlII[1]];
                    stringArray4[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[29]];
                    Item lIllIIIllIIlll = Inventory.getFirst((String[])stringArray4);
                    int[] nArray6 = new int[llIIlIlII[1]];
                    nArray6[V.llIIlIlII[0]] = llIIlIlII[9];
                    Item lIllIIIllIIllI = Inventory.getFirst((int[])nArray6);
                    if (V.lIlIlIlIIlll(lIllIIIllIlIII) && V.lIlIlIlIIlll(lIllIIIllIIllI)) {
                        lIllIIIllIlIII.useOn(lIllIIIllIIllI);
                        Time.sleepTicks((int)llIIlIlII[1]);
                        "".length();
                    }
                    int[] nArray7 = new int[llIIlIlII[1]];
                    nArray7[V.llIIlIlII[0]] = llIIlIlII[9];
                    lIllIIIllIIllI = Inventory.getFirst((int[])nArray7);
                    if (V.lIlIlIlIIlll(lIllIIIllIIlll) && V.lIlIlIlIIlll(lIllIIIllIIllI)) {
                        lIllIIIllIIlll.useOn(lIllIIIllIIllI);
                    }
                }
            }
            if (V.lIlIlIlIllII(e.j(llIIlIlII[4]), llIIlIlII[5])) {
                int[] nArray = new int[llIIlIlII[1]];
                nArray[V.llIIlIlII[0]] = llIIlIlII[9];
                if (V.lIlIlIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[llIIlIlII[1]];
                    stringArray[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[30]];
                    if (V.lIlIlIlIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        V.bm();
                    }
                }
            }
            if (V.lIlIlIlIllII(e.j(llIIlIlII[4]), llIIlIlII[5])) {
                int[] nArray = new int[llIIlIlII[1]];
                nArray[V.llIIlIlII[0]] = llIIlIlII[9];
                if (V.lIlIlIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[llIIlIlII[1]];
                    stringArray[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[31]];
                    if (V.lIlIlIlIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        dk = llIIlIlII[0];
                        if (V.lIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(lq), llIIlIlII[8])) {
                            AccBuilderGWD.c = llIIlIIll[llIIlIlII[32]];
                            Movement.walkTo((WorldPoint)lq);
                            "".length();
                            Time.sleepTicks((int)llIIlIlII[1]);
                            "".length();
                        }
                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[33]];
                        g.a(llIIlIIll[llIIlIlII[34]], lp, llIIlIlII[1]);
                    }
                }
            }
            if (V.lIlIlIlIllII(e.j(llIIlIlII[4]), llIIlIlII[35])) {
                String[] stringArray = new String[llIIlIlII[1]];
                stringArray[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[36]];
                if (V.lIlIlIlIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    V.bm();
                }
            }
            if (V.lIlIlIlIllII(e.j(llIIlIlII[4]), llIIlIlII[35])) {
                String[] stringArray = new String[llIIlIlII[1]];
                stringArray[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[37]];
                if (V.lIlIlIlIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (V.lIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(lq), llIIlIlII[8])) {
                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[38]];
                        Movement.walkTo((WorldPoint)lq);
                        "".length();
                        Time.sleepTicks((int)llIIlIlII[1]);
                        "".length();
                    }
                    AccBuilderGWD.c = llIIlIIll[llIIlIlII[39]];
                    g.a(llIIlIIll[llIIlIlII[40]], lp, llIIlIlII[1]);
                }
            }
            if (V.lIlIlIlIllII(e.j(llIIlIlII[4]), llIIlIlII[41])) {
                int[] nArray = new int[llIIlIlII[1]];
                nArray[V.llIIlIlII[0]] = llIIlIlII[9];
                if (V.lIlIlIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    V.bm();
                }
            }
            if (V.lIlIlIlIllII(e.j(llIIlIlII[4]), llIIlIlII[41])) {
                int[] nArray = new int[llIIlIlII[1]];
                nArray[V.llIIlIlII[0]] = llIIlIlII[9];
                if (V.lIlIlIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlIIll[llIIlIlII[42]];
                    if (V.lIlIlIlIIlIl(dk, llIIlIlII[1])) {
                        as.pV += llIIlIlII[1];
                        as.u(AccBuilderGWD.m);
                        dk += llIIlIlII[1];
                        as.pV = llIIlIlII[0];
                        dl = llIIlIlII[0];
                    }
                    if (V.lIlIlIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(lq), llIIlIlII[8])) {
                        AccBuilderGWD.c = llIIlIIll[llIIlIlII[43]];
                        Movement.walkTo((WorldPoint)lq);
                        "".length();
                        Time.sleepTicks((int)llIIlIlII[1]);
                        "".length();
                    }
                    g.a(llIIlIIll[llIIlIlII[44]], lp, llIIlIlII[1]);
                }
            }
            if (V.lIlIlIlIIlll(lIllIIIllIlIII = Widgets.get((int)llIIlIlII[45], (int)llIIlIlII[26]))) {
                lIllIIIllIlIII.interact(llIIlIlII[0]);
            }
            g.a(new String[llIIlIlII[0]]);
        }
    }

    @Override
    public String ag() {
        return llIIlIIll[llIIlIlII[62]];
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void lIllIIIllIIlII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (V.lIlIlIlIIlll(bankLocation) && V.lIlIlIlIIllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIlIIll[llIIlIlII[46]];
            a.a(bankLocation);
        }
        if (V.lIlIlIlIIlll(lIllIIIllIIlII) && V.lIlIlIlIIlII(lIllIIIllIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (V.lIlIlIlIIllI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = llIIlIIll[llIIlIlII[47]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIlII[7]);
                "".length();
            }
            if (V.lIlIlIlIIlII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = llIIlIIll[llIIlIlII[48]];
                if (V.lIlIlIlIlIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIIlIlII[6]);
                    "".length();
                }
                if (V.lIlIlIlIlIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)llIIlIlII[3]);
                    "".length();
                }
                int[] nArray = new int[llIIlIlII[1]];
                nArray[V.llIIlIlII[0]] = llIIlIlII[9];
                if (V.lIlIlIlIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llIIlIlII[1]];
                    nArray2[V.llIIlIlII[0]] = llIIlIlII[9];
                    if (V.lIlIlIlIIlIl(Bank.getFirst((int[])nArray2).getQuantity(), llIIlIlII[5])) {
                        V.Q();
                        System.out.println(llIIlIIll[llIIlIlII[49]]);
                        bv = llIIlIlII[1];
                        return;
                    }
                }
                int[] nArray3 = new int[llIIlIlII[8]];
                nArray3[V.llIIlIlII[0]] = llIIlIlII[11];
                nArray3[V.llIIlIlII[1]] = llIIlIlII[12];
                nArray3[V.llIIlIlII[3]] = llIIlIlII[9];
                nArray3[V.llIIlIlII[5]] = llIIlIlII[13];
                nArray3[V.llIIlIlII[6]] = llIIlIlII[14];
                if (V.lIlIlIlIIllI(e.d(nArray3) ? 1 : 0)) {
                    V.Q();
                    System.out.println(llIIlIIll[llIIlIlII[50]]);
                    bv = llIIlIlII[1];
                    return;
                }
            }
            int[] nArray = new int[llIIlIlII[8]];
            nArray[V.llIIlIlII[0]] = llIIlIlII[11];
            nArray[V.llIIlIlII[1]] = llIIlIlII[12];
            nArray[V.llIIlIlII[3]] = llIIlIlII[9];
            nArray[V.llIIlIlII[5]] = llIIlIlII[13];
            nArray[V.llIIlIlII[6]] = llIIlIlII[14];
            if (V.lIlIlIlIIlII(e.d(nArray) ? 1 : 0)) {
                Bank.withdraw((int)llIIlIlII[11], (int)llIIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llIIlIlII[1]);
                "".length();
                Bank.withdraw((int)llIIlIlII[12], (int)llIIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llIIlIlII[1]);
                "".length();
                Bank.withdraw((int)llIIlIlII[9], (int)llIIlIlII[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llIIlIlII[1]);
                "".length();
                Bank.withdraw((int)llIIlIlII[13], (int)llIIlIlII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llIIlIlII[1]);
                "".length();
                Bank.withdraw((int)llIIlIlII[14], (int)llIIlIlII[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llIIlIlII[1]);
                "".length();
                a.b(f.bm, llIIlIlII[1]);
                Time.sleepTicks((int)llIIlIlII[5]);
                "".length();
                Bank.close();
                V.di();
            }
        }
    }

    private static boolean lIlIlIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIIlIlII[1]];
        nArray[V.llIIlIlII[0]] = llIIlIlII[11];
        if (V.lIlIlIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llIIlIlII[1]];
            nArray2[V.llIIlIlII[0]] = llIIlIlII[12];
            if (V.lIlIlIlIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llIIlIlII[1]];
                nArray3[V.llIIlIlII[0]] = llIIlIlII[9];
                if (V.lIlIlIlIIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = llIIlIlII[1];
                    "".length();
                    if ("   ".length() < (0xD2 ^ 0xA7 ^ (0x6C ^ 0x1D))) return n2 != 0;
                    return ((0xE2 ^ 0xAC ^ (0x48 ^ 0x22)) & (0x11 ^ 0xC ^ (0x2B ^ 0x12) ^ -" ".length())) != 0;
                }
            }
        }
        n2 = llIIlIlII[0];
        return n2 != 0;
    }

    private static boolean lIlIlIlIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void di() {
        block8: {
            block7: {
                String[] stringArray = new String[llIIlIlII[1]];
                stringArray[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[51]];
                if (!V.lIlIlIlIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block7;
                String[] stringArray2 = new String[llIIlIlII[1]];
                stringArray2[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[52]];
                if (!V.lIlIlIlIIlII(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block8;
            }
            int[] nArray = new int[llIIlIlII[1]];
            nArray[V.llIIlIlII[0]] = llIIlIlII[9];
            if (V.lIlIlIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (V.lIlIlIlIIlII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks((int)e.c(llIIlIlII[3], llIIlIlII[5]));
                    "".length();
                }
                AccBuilderGWD.c = llIIlIIll[llIIlIlII[53]];
                String[] stringArray = new String[llIIlIlII[1]];
                stringArray[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[54]];
                Item lIllIIIllIIIII = Inventory.getFirst((String[])stringArray);
                String[] stringArray3 = new String[llIIlIlII[1]];
                stringArray3[V.llIIlIlII[0]] = llIIlIIll[llIIlIlII[55]];
                Item lIllIIIlIlllll = Inventory.getFirst((String[])stringArray3);
                int[] nArray2 = new int[llIIlIlII[1]];
                nArray2[V.llIIlIlII[0]] = llIIlIlII[9];
                Item lIllIIIlIllllI = Inventory.getFirst((int[])nArray2);
                if (V.lIlIlIlIIlll(lIllIIIllIIIII) && V.lIlIlIlIIlll(lIllIIIlIllllI)) {
                    lIllIIIllIIIII.useOn(lIllIIIlIllllI);
                    Time.sleepTicks((int)llIIlIlII[1]);
                    "".length();
                }
                int[] nArray3 = new int[llIIlIlII[1]];
                nArray3[V.llIIlIlII[0]] = llIIlIlII[9];
                lIllIIIlIllllI = Inventory.getFirst((int[])nArray3);
                if (V.lIlIlIlIIlll(lIllIIIlIlllll) && V.lIlIlIlIIlll(lIllIIIlIllllI)) {
                    lIllIIIlIlllll.useOn(lIllIIIlIllllI);
                }
            }
        }
    }

    private static String lIlIlIIlllll(String lIllIIIlIIllIl, String lIllIIIlIIllII) {
        lIllIIIlIIllIl = new String(Base64.getDecoder().decode(lIllIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIIlIIlIll = new StringBuilder();
        char[] lIllIIIlIIlIlI = lIllIIIlIIllII.toCharArray();
        int lIllIIIlIIlIIl = llIIlIlII[0];
        char[] lIllIIIlIIIIll = lIllIIIlIIllIl.toCharArray();
        int lIllIIIlIIIIlI = lIllIIIlIIIIll.length;
        int lIllIIIlIIIIIl = llIIlIlII[0];
        while (V.lIlIlIlIIlIl(lIllIIIlIIIIIl, lIllIIIlIIIIlI)) {
            char lIllIIIlIIlllI = lIllIIIlIIIIll[lIllIIIlIIIIIl];
            lIllIIIlIIlIll.append((char)(lIllIIIlIIlllI ^ lIllIIIlIIlIlI[lIllIIIlIIlIIl % lIllIIIlIIlIlI.length]));
            "".length();
            ++lIllIIIlIIlIIl;
            ++lIllIIIlIIIIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIllIIIlIIlIll);
    }

    private static boolean lIlIlIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ae() {
        return llIIlIlII[0];
    }

    private static String lIlIlIlIIIIl(String lIllIIIIlIlIll, String lIllIIIIlIlIII) {
        try {
            SecretKeySpec lIllIIIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIIIlIlIII.getBytes(StandardCharsets.UTF_8)), llIIlIlII[16]), "DES");
            Cipher lIllIIIIlIllIl = Cipher.getInstance("DES");
            lIllIIIIlIllIl.init(llIIlIlII[3], lIllIIIIlIlllI);
            return new String(lIllIIIIlIllIl.doFinal(Base64.getDecoder().decode(lIllIIIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIIlIllII) {
            lIllIIIIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIlIlIll(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIlIlIII(int n2) {
        return n2 > 0;
    }

    @Override
    public int af() {
        try {
            V.dh();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-(3 ^ 0x39 ^ (0x9E ^ 0xA0)) >= 0) {
            return (141 + 152 - 266 + 161 ^ 39 + 138 - 30 + 7) & (0x18 ^ 0x5D ^ (0xC3 ^ 0xA0) ^ -" ".length());
        }
        return llIIlIlII[61];
    }

    private static boolean lIlIlIlIlllI(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIlIlIIIlI() {
        llIIlIIll = new String[llIIlIlII[73]];
        V.llIIlIIll[V.llIIlIlII[0]] = V.lIlIlIIlllll("Fw8pASUyWjkcLjgJ", "UzPhK");
        V.llIIlIIll[V.llIIlIlII[1]] = V.lIlIlIlIIIII("yD1AtBkFkjRfpSP7BSkmFmS3yZuKULqpGmYMCyl8g4IuzaBh0gL+zgXOmIQ1dCCv", "IilyY");
        V.llIIlIIll[V.llIIlIlII[3]] = V.lIlIlIIlllll("MyM8Pxk=", "wQUQr");
        V.llIIlIIll[V.llIIlIlII[5]] = V.lIlIlIlIIIII("EJPfMtZkutjhXH7HZK/lfOohjobjbSLk", "niSjN");
        V.llIIlIIll[V.llIIlIlII[6]] = V.lIlIlIlIIIII("/5cwMonW0BhQ5ByOSxzdAg==", "bXUhG");
        V.llIIlIIll[V.llIIlIlII[8]] = V.lIlIlIlIIIII("y1Hbpr2EBNfAZbHOHPiKl52OjQ0fBhQP", "yQJDH");
        V.llIIlIIll[V.llIIlIlII[10]] = V.lIlIlIIlllll("HQ91OSIvSjgxIzkDOz9wOx8wKyRqGSAoICYDMCt8ahkiMSQpAjw2N2oeOngSHzMcFhc=", "JjUXP");
        V.llIIlIIll[V.llIIlIlII[15]] = V.lIlIlIIlllll("GAJGIDkqRwsoODwOCCZrPhIDMj9vFBMxOyMOAzJnbxQRKD8sDw8vLG8TCWEJGj4vDww=", "OgfAK");
        V.llIIlIIll[V.llIIlIlII[16]] = V.lIlIlIIlllll("HCwCdyU9bQcjMCA5", "RMtWQ");
        V.llIIlIIll[V.llIIlIlII[17]] = V.lIlIlIIlllll("CRksAS0zAypTKC8IPgc=", "ZmMsY");
        V.llIIlIIll[V.llIIlIlII[18]] = V.lIlIlIIlllll("CjsiJiNmPj8uNA==", "FZPAF");
        V.llIIlIIll[V.llIIlIlII[19]] = V.lIlIlIlIIIIl("7ieRuoi+8Cs=", "uxZmt");
        V.llIIlIIll[V.llIIlIlII[20]] = V.lIlIlIlIIIII("0CqRJ8yBqXk=", "PKhFP");
        V.llIIlIIll[V.llIIlIlII[21]] = V.lIlIlIlIIIIl("vnPRUqxl5dN4R3wdJoo5vXC+11P+fmyh", "UdRrf");
        V.llIIlIIll[V.llIIlIlII[25]] = V.lIlIlIlIIIIl("4NFpajiN0Z0vfsp+MXVdYQ==", "gpsiR");
        V.llIIlIIll[V.llIIlIlII[26]] = V.lIlIlIlIIIII("gelWalgfSuWnhuz6scUI6g==", "CiMoI");
        V.llIIlIIll[V.llIIlIlII[27]] = V.lIlIlIIlllll("NBQ7DDNQDCAPOwI=", "pmRbT");
        V.llIIlIIll[V.llIIlIlII[28]] = V.lIlIlIlIIIII("gDxvYB8WnI3eRZion33Fvw==", "lZXRo");
        V.llIIlIIll[V.llIIlIlII[29]] = V.lIlIlIlIIIIl("n6h4KPfjfxIPqbJkw1f1XA==", "hSYbx");
        V.llIIlIIll[V.llIIlIlII[30]] = V.lIlIlIIlllll("FwYADww9VAYOCTQdD0EGOR0N", "Xtaak");
        V.llIIlIIll[V.llIIlIlII[31]] = V.lIlIlIlIIIII("Amf/Z6yHiBoCOvJFHymmNr5pXYF0IS+W", "ktJpK");
        V.llIIlIIll[V.llIIlIlII[32]] = V.lIlIlIlIIIIl("t//AkqxuTeQNsmNQeIabuQ==", "CVoez");
        V.llIIlIIll[V.llIIlIlII[33]] = V.lIlIlIIlllll("Ij4nIREYLHUmFlYkJy4WES4=", "vKUOx");
        V.llIIlIIll[V.llIIlIlII[34]] = V.lIlIlIlIIIIl("sRCI0POpvt1kKlEsL4ugVhO67hlIK9GR", "YayQr");
        V.llIIlIIll[V.llIIlIlII[36]] = V.lIlIlIIlllll("CRYHHGUsFRAVLCVaHxgsJw==", "KzryE");
        V.llIIlIIll[V.llIIlIlII[37]] = V.lIlIlIlIIIII("3pXiT53iZmbS5t4mOfvZfkYCbMBWxKRc", "kVOVz");
        V.llIIlIIll[V.llIIlIlII[38]] = V.lIlIlIlIIIII("Z2EaY53beSW8q8abXQQzIQ==", "nYySQ");
        V.llIIlIIll[V.llIIlIlII[39]] = V.lIlIlIlIIIII("V+hrM2Ca5MHKxFC7BgH1iw==", "OQaBI");
        V.llIIlIIll[V.llIIlIlII[40]] = V.lIlIlIIlllll("Hg48ED44B3I3KTcfPBo2PA==", "YkRuL");
        V.llIIlIIll[V.llIIlIlII[42]] = V.lIlIlIIlllll("NiI3ACIMMGUHJUI1NwE8DA==", "bWEnK");
        V.llIIlIIll[V.llIIlIlII[43]] = V.lIlIlIlIIIIl("4i/WyAGMIjlrbip2mT/0nQ==", "rDSzP");
        V.llIIlIIll[V.llIIlIlII[44]] = V.lIlIlIlIIIIl("cjANWLGzQPgL0rSI3zEh6IZKMHThboS2", "ShPaU");
        V.llIIlIIll[V.llIIlIlII[46]] = V.lIlIlIIlllll("OQofDQMWHwAKA1cfBkQGFgUC", "wkidd");
        V.llIIlIIll[V.llIIlIlII[47]] = V.lIlIlIlIIIII("1ObVhwsHq5TNWT1lWohSKw==", "wkJyn");
        V.llIIlIIll[V.llIIlIlII[48]] = V.lIlIlIlIIIIl("G6tfBqLJqg1cwnV+pRRRDF/p5WDfC7DI", "iSJdC");
        V.llIIlIIll[V.llIIlIlII[49]] = V.lIlIlIlIIIII("zNoh1jwTRhgkEYl4mEXiIw/M/ZzZcmO+4BAd1n8sYII9UZeBKzUe1tpKAmaxJUyEZ0+yqvnoXVo=", "NPnpK");
        V.llIIlIIll[V.llIIlIlII[50]] = V.lIlIlIlIIIIl("lBDgPSc60ygDGnRw6B8rw9+OuVZfRQw6WiEL2g52vQGKUpU6zbDb9q3ZywaEZxkburnb/VO8lPU=", "Uzper");
        V.llIIlIIll[V.llIIlIlII[51]] = V.lIlIlIIlllll("Cj0UAFksKAQ=", "HQaey");
        V.llIIlIIll[V.llIIlIlII[52]] = V.lIlIlIIlllll("KRErKioDQy49KA==", "fcJDM");
        V.llIIlIIll[V.llIIlIlII[53]] = V.lIlIlIIlllll("FzsdAilzIwYBISE=", "SBtlN");
        V.llIIlIIll[V.llIIlIlII[54]] = V.lIlIlIIlllll("CxEiLDchQyc7NQ==", "DcCBP");
        V.llIIlIIll[V.llIIlIlII[55]] = V.lIlIlIlIIIIl("NhDykauPaO19zdWAkjURtA==", "AhqvG");
        V.llIIlIIll[V.llIIlIlII[62]] = V.lIlIlIlIIIII("kps1lu0Z8Fm8g9qUiUWRkxsWDX+K+VoU", "McYYH");
        V.llIIlIIll[V.llIIlIlII[63]] = V.lIlIlIlIIIII("lrqYp5lDE0oiEDof2tbunZM8t+20Ba9C", "Yaoga");
        V.llIIlIIll[V.llIIlIlII[64]] = V.lIlIlIIlllll("HQ8Xdg==", "DjdXK");
        V.llIIlIIll[V.llIIlIlII[65]] = V.lIlIlIIlllll("FRt5LiskVC42KiVUNDJkJRt5Jy0yH3k2KnEVKzorJAZ5NCs9GywlZDcbK3c9PgFm", "QtYWD");
        V.llIIlIIll[V.llIIlIlII[66]] = V.lIlIlIIlllll("IBECN00WGww2GVcYQycEER8GMQgZDUMgAhsWFjFS", "wycCm");
        V.llIIlIIll[V.llIIlIlII[67]] = V.lIlIlIlIIIIl("Adcl3kjka7HDmN2uvGVzX7nkj4QjQA4U3eO8JGsJg88=", "SwPGN");
        V.llIIlIIll[V.llIIlIlII[68]] = V.lIlIlIIlllll("EHIhCjM8cjoEKDxyKwcwPHIoGSg2JztLLTwgLEU=", "YRIkE");
        V.llIIlIIll[V.llIIlIlII[69]] = V.lIlIlIIlllll("C2UMKgcnZRckHCdlBjkeNStEKgMvKhE5USogFi5f", "BEdKq");
        V.llIIlIIll[V.llIIlIlII[70]] = V.lIlIlIlIIIIl("RuqfsDsvrPo64zUuVDZeI5n0lI4BVBRB", "FxcVz");
    }

    private static boolean lIlIlIlIIllI(int n2) {
        return n2 == 0;
    }

    private static void Q() {
        d lIllIIIlIllIlI;
        Object lIllIIIlIllIll;
        block10: {
            block9: {
                int[] nArray = new int[llIIlIlII[1]];
                nArray[V.llIIlIlII[0]] = llIIlIlII[11];
                if (V.lIlIlIlIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llIIlIlII[11], llIIlIlII[1], llIIlIlII[56]);
                    bx.add(d2);
                    "".length();
                }
                int[] nArray2 = new int[llIIlIlII[1]];
                nArray2[V.llIIlIlII[0]] = llIIlIlII[12];
                if (V.lIlIlIlIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIllIIIlIllIll = new d(llIIlIlII[12], llIIlIlII[1], llIIlIlII[56]);
                    bx.add((d)lIllIIIlIllIll);
                    "".length();
                }
                int[] nArray3 = new int[llIIlIlII[1]];
                nArray3[V.llIIlIlII[0]] = llIIlIlII[9];
                if (!V.lIlIlIlIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                int[] nArray4 = new int[llIIlIlII[1]];
                nArray4[V.llIIlIlII[0]] = llIIlIlII[9];
                if (!V.lIlIlIlIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) break block10;
                int[] nArray5 = new int[llIIlIlII[1]];
                nArray5[V.llIIlIlII[0]] = llIIlIlII[9];
                if (!V.lIlIlIlIIlIl(Bank.getFirst((int[])nArray5).getQuantity(), llIIlIlII[5])) break block10;
            }
            lIllIIIlIllIll = new d(llIIlIlII[9], llIIlIlII[5], llIIlIlII[56]);
            bx.add((d)lIllIIIlIllIll);
            "".length();
        }
        int[] nArray = new int[llIIlIlII[1]];
        nArray[V.llIIlIlII[0]] = llIIlIlII[14];
        if (V.lIlIlIlIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIllIIIlIllIll = new d(llIIlIlII[14], llIIlIlII[8], llIIlIlII[56]);
            bx.add((d)lIllIIIlIllIll);
            "".length();
        }
        if (V.lIlIlIlIIllI(Bank.contains((Predicate)(lIllIIIlIllIll = item -> item.getName().toLowerCase().contains(llIIlIIll[llIIlIlII[63]]))) ? 1 : 0)) {
            lIllIIIlIllIlI = new d(llIIlIlII[57], llIIlIlII[8], llIIlIlII[58]);
            bx.add(lIllIIIlIllIlI);
            "".length();
        }
        int[] nArray6 = new int[llIIlIlII[1]];
        nArray6[V.llIIlIlII[0]] = llIIlIlII[59];
        if (V.lIlIlIlIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIllIIIlIllIlI = new d(llIIlIlII[59], llIIlIlII[54], llIIlIlII[60]);
            bx.add(lIllIIIlIllIlI);
            "".length();
        }
        int[] nArray7 = new int[llIIlIlII[1]];
        nArray7[V.llIIlIlII[0]] = llIIlIlII[13];
        if (V.lIlIlIlIIllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIllIIIlIllIlI = new d(llIIlIlII[13], llIIlIlII[8], j.ch);
            bx.add(lIllIIIlIllIlI);
            "".length();
        }
    }

    private static boolean lIlIlIlIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIIlll(Object object) {
        return object != null;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (V.lIlIlIlIllIl(e.j(llIIlIlII[4]), llIIlIlII[10]) && !V.lIlIlIlIllIl(e.j(llIIlIlII[4]), llIIlIlII[18]) || V.lIlIlIlIlllI(Quests.getState((Quest)Quest.GOBLIN_DIPLOMACY), QuestState.FINISHED)) {
            bl = llIIlIlII[1];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x13 ^ 0xB ^ (0x8D ^ 0x86)) & (0x30 ^ 0x6E ^ (0xDF ^ 0x92) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIIlIlII[0];
        }
        return bl;
    }
}

