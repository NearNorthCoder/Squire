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

public class y
implements M {
    public static /* synthetic */ List<d> bA;
    static /* synthetic */ boolean cp;
    static /* synthetic */ int co;
    private static final /* synthetic */ String[] fZ;
    public static /* synthetic */ WorldPoint ga;
    private static /* synthetic */ int[] lIIIllllllllI;
    static /* synthetic */ int bY;
    public static /* synthetic */ boolean by;
    private static /* synthetic */ String[] lIIIlllllllIl;

    private static String lIlIIllIlIllIlI(String llllllllllllllIlllllllllllIIllII, String llllllllllllllIlllllllllllIIlIIl) {
        try {
            SecretKeySpec llllllllllllllIlllllllllllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllllllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIIIllllllllI[16]), "DES");
            Cipher llllllllllllllIlllllllllllIIlllI = Cipher.getInstance("DES");
            llllllllllllllIlllllllllllIIlllI.init(lIIIllllllllI[3], llllllllllllllIlllllllllllIIllll);
            return new String(llllllllllllllIlllllllllllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllllllllIIllIl) {
            llllllllllllllIlllllllllllIIllIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void lllllllllllllllIIIIIIIIIIIIIIlIl;
        BankLocation bankLocation = BankLocation.getNearest();
        if (y.lIlIIllIllIIIII(bankLocation) && y.lIlIIllIlIlllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[46]];
            a.a(bankLocation);
        }
        if (y.lIlIIllIllIIIII(lllllllllllllllIIIIIIIIIIIIIIlIl) && y.lIlIIllIlIlllIl(lllllllllllllllIIIIIIIIIIIIIIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (y.lIlIIllIlIlllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[47]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllllllI[7]);
                "".length();
            }
            if (y.lIlIIllIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[48]];
                if (y.lIlIIllIllIIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIllllllllI[6]);
                    "".length();
                }
                if (y.lIlIIllIllIIIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIllllllllI[3]);
                    "".length();
                }
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIIllllllllI[1]];
                    nArray2[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                    if (y.lIlIIllIlIllllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIllllllllI[5])) {
                        y.W();
                        System.out.println(lIIIlllllllIl[lIIIllllllllI[49]]);
                        by = lIIIllllllllI[1];
                        return;
                    }
                }
                int[] nArray3 = new int[lIIIllllllllI[8]];
                nArray3[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
                nArray3[y.lIIIllllllllI[1]] = lIIIllllllllI[12];
                nArray3[y.lIIIllllllllI[3]] = lIIIllllllllI[9];
                nArray3[y.lIIIllllllllI[5]] = lIIIllllllllI[13];
                nArray3[y.lIIIllllllllI[6]] = lIIIllllllllI[14];
                if (y.lIlIIllIlIlllll(e.b(nArray3) ? 1 : 0)) {
                    y.W();
                    System.out.println(lIIIlllllllIl[lIIIllllllllI[50]]);
                    by = lIIIllllllllI[1];
                    return;
                }
            }
            int[] nArray = new int[lIIIllllllllI[8]];
            nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
            nArray[y.lIIIllllllllI[1]] = lIIIllllllllI[12];
            nArray[y.lIIIllllllllI[3]] = lIIIllllllllI[9];
            nArray[y.lIIIllllllllI[5]] = lIIIllllllllI[13];
            nArray[y.lIIIllllllllI[6]] = lIIIllllllllI[14];
            if (y.lIlIIllIlIlllIl(e.b(nArray) ? 1 : 0)) {
                Bank.withdraw((int)lIIIllllllllI[11], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIIIllllllllI[1]);
                "".length();
                Bank.withdraw((int)lIIIllllllllI[12], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIIIllllllllI[1]);
                "".length();
                Bank.withdraw((int)lIIIllllllllI[9], (int)lIIIllllllllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIIIllllllllI[1]);
                "".length();
                Bank.withdraw((int)lIIIllllllllI[13], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIIIllllllllI[1]);
                "".length();
                Bank.withdraw((int)lIIIllllllllI[14], (int)lIIIllllllllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIIIllllllllI[1]);
                "".length();
                a.b(f.bk, lIIIllllllllI[1]);
                Time.sleepTicks((int)lIIIllllllllI[5]);
                "".length();
                Bank.close();
                y.bB();
            }
        }
    }

    private static boolean lIlIIllIlIlllIl(int n2) {
        return n2 != 0;
    }

    @Override
    public String Z() {
        return lIIIlllllllIl[lIIIllllllllI[62]];
    }

    private static boolean lIlIIllIllIIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIllIllIIlll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIllllllllI[1]];
        nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
        if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllllllllI[1]];
            nArray2[y.lIIIllllllllI[0]] = lIIIllllllllI[12];
            if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIllllllllI[1]];
                nArray3[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIIllllllllI[1];
                    "".length();
                    if (((0x9B ^ 0xB4) & ~(0x1B ^ 0x34)) == 0) return n2 != 0;
                    return ((0x6F ^ 0x31) & ~(0x4C ^ 0x12)) != 0;
                }
            }
        }
        n2 = lIIIllllllllI[0];
        return n2 != 0;
    }

    private static boolean lIlIIllIlIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIllIlIllIII(String llllllllllllllIllllllllllllIlIIl, String llllllllllllllIllllllllllllIllIl) {
        llllllllllllllIllllllllllllIlIIl = new String(Base64.getDecoder().decode(llllllllllllllIllllllllllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllllllllllIllII = new StringBuilder();
        char[] llllllllllllllIllllllllllllIlIll = llllllllllllllIllllllllllllIllIl.toCharArray();
        int llllllllllllllIllllllllllllIlIlI = lIIIllllllllI[0];
        char[] llllllllllllllIllllllllllllIIlII = llllllllllllllIllllllllllllIlIIl.toCharArray();
        int llllllllllllllIllllllllllllIIIll = llllllllllllllIllllllllllllIIlII.length;
        int llllllllllllllIllllllllllllIIIlI = lIIIllllllllI[0];
        while (y.lIlIIllIlIllllI(llllllllllllllIllllllllllllIIIlI, llllllllllllllIllllllllllllIIIll)) {
            char llllllllllllllIllllllllllllIllll = llllllllllllllIllllllllllllIIlII[llllllllllllllIllllllllllllIIIlI];
            llllllllllllllIllllllllllllIllII.append((char)(llllllllllllllIllllllllllllIllll ^ llllllllllllllIllllllllllllIlIll[llllllllllllllIllllllllllllIlIlI % llllllllllllllIllllllllllllIlIll.length]));
            "".length();
            ++llllllllllllllIllllllllllllIlIlI;
            ++llllllllllllllIllllllllllllIIIlI;
            "".length();
            if (" ".length() <= "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllllllllllIllII);
    }

    private static void bB() {
        block8: {
            block7: {
                String[] stringArray = new String[lIIIllllllllI[1]];
                stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[51]];
                if (!y.lIlIIllIlIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block7;
                String[] stringArray2 = new String[lIIIllllllllI[1]];
                stringArray2[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[52]];
                if (!y.lIlIIllIlIlllIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block8;
            }
            int[] nArray = new int[lIIIllllllllI[1]];
            nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
            if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (y.lIlIIllIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks((int)e.c(lIIIllllllllI[3], lIIIllllllllI[5]));
                    "".length();
                }
                AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[53]];
                String[] stringArray = new String[lIIIllllllllI[1]];
                stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[54]];
                Item lllllllllllllllIIIIIIIIIIIIIIIIl = Inventory.getFirst((String[])stringArray);
                String[] stringArray3 = new String[lIIIllllllllI[1]];
                stringArray3[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[55]];
                Item lllllllllllllllIIIIIIIIIIIIIIIII = Inventory.getFirst((String[])stringArray3);
                int[] nArray2 = new int[lIIIllllllllI[1]];
                nArray2[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                Item llllllllllllllIlllllllllllllllll = Inventory.getFirst((int[])nArray2);
                if (y.lIlIIllIllIIIII(lllllllllllllllIIIIIIIIIIIIIIIIl) && y.lIlIIllIllIIIII(llllllllllllllIlllllllllllllllll)) {
                    lllllllllllllllIIIIIIIIIIIIIIIIl.useOn(llllllllllllllIlllllllllllllllll);
                    Time.sleepTicks((int)lIIIllllllllI[1]);
                    "".length();
                }
                int[] nArray3 = new int[lIIIllllllllI[1]];
                nArray3[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                llllllllllllllIlllllllllllllllll = Inventory.getFirst((int[])nArray3);
                if (y.lIlIIllIllIIIII(lllllllllllllllIIIIIIIIIIIIIIIII) && y.lIlIIllIllIIIII(llllllllllllllIlllllllllllllllll)) {
                    lllllllllllllllIIIIIIIIIIIIIIIII.useOn(llllllllllllllIlllllllllllllllll);
                }
            }
        }
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (y.lIlIIllIllIIllI(e.j(lIIIllllllllI[4]), lIIIllllllllI[10]) && !y.lIlIIllIllIIllI(e.j(lIIIllllllllI[4]), lIIIllllllllI[18]) || y.lIlIIllIllIIlll(Quests.getState((Quest)Quest.GOBLIN_DIPLOMACY), QuestState.FINISHED)) {
            bl = lIIIllllllllI[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                return ((0xA5 ^ 0x89) & ~(0x3A ^ 0x16)) != 0;
            }
        } else {
            bl = lIIIllllllllI[0];
        }
        return bl;
    }

    @Override
    public boolean X() {
        return lIIIllllllllI[0];
    }

    private static void lIlIIllIlIlllII() {
        lIIIllllllllI = new int[74];
        y.lIIIllllllllI[0] = (0x14 ^ 0x3D) & ~(0x1F ^ 0x36);
        y.lIIIllllllllI[1] = " ".length();
        y.lIIIllllllllI[2] = 0x2F ^ 0x64;
        y.lIIIllllllllI[3] = "  ".length();
        y.lIIIllllllllI[4] = 0x81 ^ 0xBF;
        y.lIIIllllllllI[5] = "   ".length();
        y.lIIIllllllllI[6] = 0x5D ^ 0x4C ^ (0x1B ^ 0xE);
        y.lIIIllllllllI[7] = 0xFFFFBB9A & 0x57ED;
        y.lIIIllllllllI[8] = 0x6B ^ 0x1B ^ (0xD8 ^ 0xAD);
        y.lIIIllllllllI[9] = -(0xFFFF9CDF & 0x77F7) & (0xFFFFB7FE & 0x5DF7);
        y.lIIIllllllllI[10] = 0xB8 ^ 0xBE;
        y.lIIIllllllllI[11] = -(0xFFFFEA79 & 0x7D97) & (0xFFFFEFFF & 0x7EF7);
        y.lIIIllllllllI[12] = 0xFFFFCFFF & 0x36E9;
        y.lIIIllllllllI[13] = -(0xFFFFCF8F & 0x3EF9) & (0xFFFFFFF9 & 0x3FDF);
        y.lIIIllllllllI[14] = 0xFFFFFFCD & 0x1F7B;
        y.lIIIllllllllI[15] = 61 + 127 - 173 + 138 ^ 88 + 6 - 84 + 148;
        y.lIIIllllllllI[16] = 0x33 ^ 0x3B;
        y.lIIIllllllllI[17] = 164 + 164 - 223 + 74 ^ 93 + 110 - 58 + 41;
        y.lIIIllllllllI[18] = 0xE7 ^ 0xB1 ^ (0x68 ^ 0x34);
        y.lIIIllllllllI[19] = 0x64 ^ 0x23 ^ (0xDB ^ 0x97);
        y.lIIIllllllllI[20] = 22 + 121 - 100 + 106 ^ 65 + 112 - 162 + 138;
        y.lIIIllllllllI[21] = 8 ^ 5;
        y.lIIIllllllllI[22] = 0xFFFFD6B2 & 0x2BED;
        y.lIIIllllllllI[23] = 0xFFFFF3E1 & 0xEBF;
        y.lIIIllllllllI[24] = 0xFFFFA6FF & 0x5B9F;
        y.lIIIllllllllI[25] = 0x4A ^ 0x44;
        y.lIIIllllllllI[26] = 0x49 ^ 0x46;
        y.lIIIllllllllI[27] = 8 + 37 - 17 + 153 ^ 63 + 49 - 62 + 115;
        y.lIIIllllllllI[28] = 0xD7 ^ 0xC6;
        y.lIIIllllllllI[29] = 87 + 165 - 158 + 73 ^ 33 + 107 - 89 + 130;
        y.lIIIllllllllI[30] = 0x7E ^ 0x6D;
        y.lIIIllllllllI[31] = 114 + 108 - 179 + 95 ^ 90 + 1 - 75 + 142;
        y.lIIIllllllllI[32] = 0x82 ^ 0x97;
        y.lIIIllllllllI[33] = 0xF2 ^ 0x9B ^ 95 + 123 - 201 + 110;
        y.lIIIllllllllI[34] = 0x15 ^ 0x7C ^ (0x25 ^ 0x5B);
        y.lIIIllllllllI[35] = -(0xFFFF9FB2 & 0x68EF) & (0xFFFF8EFD & 0x7BA7);
        y.lIIIllllllllI[36] = 23 + 77 - -26 + 42 ^ 120 + 37 - 94 + 113;
        y.lIIIllllllllI[37] = 78 + 175 - 188 + 114 ^ 24 + 86 - -37 + 23;
        y.lIIIllllllllI[38] = 0x55 ^ 0x4F;
        y.lIIIllllllllI[39] = 0x2D ^ 0x36;
        y.lIIIllllllllI[40] = 4 ^ 0x3A ^ (0x86 ^ 0xA4);
        y.lIIIllllllllI[41] = 0xFFFF9FBD & 0x6447;
        y.lIIIllllllllI[42] = 0x45 ^ 0x58;
        y.lIIIllllllllI[43] = 0x52 ^ 0xC ^ (0xC8 ^ 0x88);
        y.lIIIllllllllI[44] = 0x88 ^ 0x97;
        y.lIIIllllllllI[45] = -(0xFFFFFEFF & 0x7F89) & (0xFFFFFF9F & 0x7FFD);
        y.lIIIllllllllI[46] = 0x2E ^ 0xE;
        y.lIIIllllllllI[47] = 41 + 29 - -16 + 73 ^ 41 + 125 - 150 + 174;
        y.lIIIllllllllI[48] = 84 + 130 - 212 + 152 ^ 67 + 81 - 39 + 75;
        y.lIIIllllllllI[49] = 0x2C ^ 0xF;
        y.lIIIllllllllI[50] = 0x12 ^ 0x31 ^ (0x3F ^ 0x38);
        y.lIIIllllllllI[51] = 0x70 ^ 0x55;
        y.lIIIllllllllI[52] = 0x6C ^ 0x4A;
        y.lIIIllllllllI[53] = 0x87 ^ 0xA0;
        y.lIIIllllllllI[54] = 0x24 ^ 0x3E ^ (5 ^ 0x37);
        y.lIIIllllllllI[55] = 0xAB ^ 0xB4 ^ (0x6E ^ 0x58);
        y.lIIIllllllllI[56] = 0xFFFFA7BA & 0x7B6D;
        y.lIIIllllllllI[57] = 0xFFFFFEEF & 0x2FDC;
        y.lIIIllllllllI[58] = 0xFFFFE7BC & 0x79EB;
        y.lIIIllllllllI[59] = -(0xFFFFC1A9 & 0x7E5F) & (0xFFFFDFCF & 0x7F7F);
        y.lIIIllllllllI[60] = 0xFFFF876F & 0x7FFC;
        y.lIIIllllllllI[61] = 0x2E ^ 0x4A;
        y.lIIIllllllllI[62] = 0x34 ^ 0x1E;
        y.lIIIllllllllI[63] = 0xB0 ^ 0x9B;
        y.lIIIllllllllI[64] = 0x4D ^ 0x61;
        y.lIIIllllllllI[65] = 0 ^ 0x2E ^ "   ".length();
        y.lIIIllllllllI[66] = 0xD5 ^ 0xB2 ^ (0xDC ^ 0x95);
        y.lIIIllllllllI[67] = 1 ^ 0x2E;
        y.lIIIllllllllI[68] = 0xAF ^ 0x9F;
        y.lIIIllllllllI[69] = 0xA9 ^ 0x98;
        y.lIIIllllllllI[70] = 0x95 ^ 0xBD ^ (0xB4 ^ 0xAE);
        y.lIIIllllllllI[71] = -(0xFFFFD13F & 0x3EF3) & (0xFFFF9FBF & 0x7BFF);
        y.lIIIllllllllI[72] = -(0xFFFFB3E4 & 0x7C5F) & (0xFFFFBFFB & 0x7DFF);
        y.lIIIllllllllI[73] = 0x50 ^ 0x63;
    }

    private static String lIlIIllIlIllIIl(String llllllllllllllIlllllllllllIllIIl, String llllllllllllllIlllllllllllIllIII) {
        try {
            SecretKeySpec llllllllllllllIlllllllllllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllllllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllllllllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllllllllIllIll.init(lIIIllllllllI[3], llllllllllllllIlllllllllllIlllII);
            return new String(llllllllllllllIlllllllllllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllllllllIllIlI) {
            llllllllllllllIlllllllllllIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIllIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIllIllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        y.lIlIIllIlIlllII();
        y.lIlIIllIlIllIll();
        String[] stringArray = new String[lIIIllllllllI[15]];
        stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[64]];
        stringArray[y.lIIIllllllllI[1]] = lIIIlllllllIl[lIIIllllllllI[65]];
        stringArray[y.lIIIllllllllI[3]] = lIIIlllllllIl[lIIIllllllllI[66]];
        stringArray[y.lIIIllllllllI[5]] = lIIIlllllllIl[lIIIllllllllI[67]];
        stringArray[y.lIIIllllllllI[6]] = lIIIlllllllIl[lIIIllllllllI[68]];
        stringArray[y.lIIIllllllllI[8]] = lIIIlllllllIl[lIIIllllllllI[69]];
        stringArray[y.lIIIllllllllI[10]] = lIIIlllllllIl[lIIIllllllllI[70]];
        fZ = stringArray;
        bA = new ArrayList<d>();
        ga = new WorldPoint(lIIIllllllllI[71], lIIIllllllllI[72], lIIIllllllllI[0]);
        bY = lIIIllllllllI[0];
    }

    private static void W() {
        d llllllllllllllIllllllllllllllIll;
        Object llllllllllllllIlllllllllllllllII;
        block10: {
            block9: {
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
                if (y.lIlIIllIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIIllllllllI[11], lIIIllllllllI[1], lIIIllllllllI[56]);
                    bA.add(d2);
                    "".length();
                }
                int[] nArray2 = new int[lIIIllllllllI[1]];
                nArray2[y.lIIIllllllllI[0]] = lIIIllllllllI[12];
                if (y.lIlIIllIlIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    llllllllllllllIlllllllllllllllII = new d(lIIIllllllllI[12], lIIIllllllllI[1], lIIIllllllllI[56]);
                    bA.add((d)llllllllllllllIlllllllllllllllII);
                    "".length();
                }
                int[] nArray3 = new int[lIIIllllllllI[1]];
                nArray3[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (!y.lIlIIllIlIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                int[] nArray4 = new int[lIIIllllllllI[1]];
                nArray4[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (!y.lIlIIllIlIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block10;
                int[] nArray5 = new int[lIIIllllllllI[1]];
                nArray5[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (!y.lIlIIllIlIllllI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIllllllllI[5])) break block10;
            }
            llllllllllllllIlllllllllllllllII = new d(lIIIllllllllI[9], lIIIllllllllI[5], lIIIllllllllI[56]);
            bA.add((d)llllllllllllllIlllllllllllllllII);
            "".length();
        }
        int[] nArray = new int[lIIIllllllllI[1]];
        nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[14];
        if (y.lIlIIllIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllllllllllllIlllllllllllllllII = new d(lIIIllllllllI[14], lIIIllllllllI[8], lIIIllllllllI[56]);
            bA.add((d)llllllllllllllIlllllllllllllllII);
            "".length();
        }
        if (y.lIlIIllIlIlllll(Bank.contains((Predicate)(llllllllllllllIlllllllllllllllII = item -> item.getName().toLowerCase().contains(lIIIlllllllIl[lIIIllllllllI[63]]))) ? 1 : 0)) {
            llllllllllllllIllllllllllllllIll = new d(lIIIllllllllI[57], lIIIllllllllI[8], lIIIllllllllI[58]);
            bA.add(llllllllllllllIllllllllllllllIll);
            "".length();
        }
        int[] nArray6 = new int[lIIIllllllllI[1]];
        nArray6[y.lIIIllllllllI[0]] = lIIIllllllllI[59];
        if (y.lIlIIllIlIlllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllllllllllllIllllllllllllllIll = new d(lIIIllllllllI[59], lIIIllllllllI[54], lIIIllllllllI[60]);
            bA.add(llllllllllllllIllllllllllllllIll);
            "".length();
        }
        int[] nArray7 = new int[lIIIllllllllI[1]];
        nArray7[y.lIIIllllllllI[0]] = lIIIllllllllI[13];
        if (y.lIlIIllIlIlllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            llllllllllllllIllllllllllllllIll = new d(lIIIllllllllI[13], lIIIllllllllI[8], h.bv);
            bA.add(llllllllllllllIllllllllllllllIll);
            "".length();
        }
    }

    private static boolean lIlIIllIllIIlII(Object object) {
        return object == null;
    }

    private static boolean lIlIIllIlIlllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllIllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllIllIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int Y() {
        try {
            y.bA();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0x38 ^ 0x1B) & ~(0x7F ^ 0x5C);
        }
        return lIIIllllllllI[61];
    }

    private static boolean lIlIIllIllIIIIl(int n2) {
        return n2 > 0;
    }

    private static void lIlIIllIlIllIll() {
        lIIIlllllllIl = new String[lIIIllllllllI[73]];
        y.lIIIlllllllIl[y.lIIIllllllllI[0]] = y.lIlIIllIlIllIII("KjA2ABkPZSYdEgU2", "hEOiw");
        y.lIIIlllllllIl[y.lIIIllllllllI[1]] = y.lIlIIllIlIllIIl("UF+yL7PpGG7NluQqDLn5dzkX1HyU1rniQRdFsk5aNzV6i51LfqVTpyfhokajIvpV", "itibl");
        y.lIIIlllllllIl[y.lIIIllllllllI[3]] = y.lIlIIllIlIllIII("MhkKBSY=", "vkckM");
        y.lIIIlllllllIl[y.lIIIllllllllI[5]] = y.lIlIIllIlIllIlI("QdexLgRJ8prSPu3EqXo8w6xGb0qVRcV2", "RJvfF");
        y.lIIIlllllllIl[y.lIIIllllllllI[6]] = y.lIlIIllIlIllIIl("kdLR1puZU4v0xT59vwDB+w==", "KGzpA");
        y.lIIIlllllllIl[y.lIIIllllllllI[8]] = y.lIlIIllIlIllIlI("31uweZF2VOyYNyuaC30hOTlIwGyKQ8m7", "jRcNb");
        y.lIIIlllllllIl[y.lIIIllllllllI[10]] = y.lIlIIllIlIllIII("BhR5Njc0UTQ+NiIYNzBlIAQ8JDFxAiwnNT0YPCRpcQIuPjEyGTA5InEFNncHBCgQGQI=", "QqYWE");
        y.lIIIlllllllIl[y.lIIIllllllllI[15]] = y.lIlIIllIlIllIlI("4puDHTfvbsd80TBx2ljDv8LvYSrF9J32LKtgfEQphoSb3gEIvUoRFtEhvS7oj0g5g9xgGK1+s2g=", "SKaVy");
        y.lIIIlllllllIl[y.lIIIllllllllI[16]] = y.lIlIIllIlIllIIl("J+MXYTnKofJO1AocFMwcJw==", "zvYxH");
        y.lIIIlllllllIl[y.lIIIllllllllI[17]] = y.lIlIIllIlIllIII("GTUnFj4jLyFEOz8kNRA=", "JAFdJ");
        y.lIIIlllllllIl[y.lIIIllllllllI[18]] = y.lIlIIllIlIllIIl("QF+K1avv/G8Jrxcw5vJFMg==", "vydNI");
        y.lIIIlllllllIl[y.lIIIllllllllI[19]] = y.lIlIIllIlIllIII("LCYxGg==", "cVTtt");
        y.lIIIlllllllIl[y.lIIIllllllllI[20]] = y.lIlIIllIlIllIII("ACMdNg==", "OSxXy");
        y.lIIIlllllllIl[y.lIIIllllllllI[21]] = y.lIlIIllIlIllIII("MhYGHAMUH0g7FBsHBhYLEA==", "ushyq");
        y.lIIIlllllllIl[y.lIIIllllllllI[25]] = y.lIlIIllIlIllIIl("3xxLumGOQrXPJ82UpVRdTg==", "bgvfH");
        y.lIIIlllllllIl[y.lIIIllllllllI[26]] = y.lIlIIllIlIllIII("CB85Px0iTTwoHw==", "GmXQz");
        y.lIIIlllllllIl[y.lIIIllllllllI[27]] = y.lIlIIllIlIllIlI("pPF8V9Gx5eRlCXN1xKzNlw==", "UnOtI");
        y.lIIIlllllllIl[y.lIIIllllllllI[28]] = y.lIlIIllIlIllIIl("KXEStB+Kj7iSbmk4BsLDhQ==", "ucGEw");
        y.lIIIlllllllIl[y.lIIIllllllllI[29]] = y.lIlIIllIlIllIlI("3Be4Zk19TSv/G7j8ltGP9g==", "JwEUf");
        y.lIIIlllllllIl[y.lIIIllllllllI[30]] = y.lIlIIllIlIllIlI("ifoCoP99bcTlNhWAURcIpmVEC+nvg+7w", "ZBLcc");
        y.lIIIlllllllIl[y.lIIIllllllllI[31]] = y.lIlIIllIlIllIIl("GmRs5mjii4+YmbW4HV1ujzz6YK5mnXhZ", "BdbtV");
        y.lIIIlllllllIl[y.lIIIllllllllI[32]] = y.lIlIIllIlIllIlI("XoSFEOcyp91u4gdeGjCdyw==", "uNQMx");
        y.lIIIlllllllIl[y.lIIIllllllllI[33]] = y.lIlIIllIlIllIII("FyMrFj8tMXkROGM5Kxk4JDM=", "CVYxV");
        y.lIIIlllllllIl[y.lIIIllllllllI[34]] = y.lIlIIllIlIllIlI("LZoQR4S3Y3Mjvhd2X8WBhQ3pDsMbUS56", "VQVtB");
        y.lIIIlllllllIl[y.lIIIllllllllI[36]] = y.lIlIIllIlIllIIl("GPjWHczef7ru/3hUeTQg2bn57go/e3WY", "fyhGL");
        y.lIIIlllllllIl[y.lIIIllllllllI[37]] = y.lIlIIllIlIllIII("ECcaImM1JA0rKjxrAiYqPg==", "RKoGC");
        y.lIIIlllllllIl[y.lIIIllllllllI[38]] = y.lIlIIllIlIllIlI("4vbKOdVi58nIPyCfw7OrSg==", "KvXVx");
        y.lIIIlllllllIl[y.lIIIllllllllI[39]] = y.lIlIIllIlIllIlI("BA5jqg8vQZU5V/l5O6tNcQ==", "PyrVn");
        y.lIIIlllllllIl[y.lIIIllllllllI[40]] = y.lIlIIllIlIllIIl("odYZzI8ND6rSLuA91NGFrC5UnUnC24k5", "GNzac");
        y.lIIIlllllllIl[y.lIIIllllllllI[42]] = y.lIlIIllIlIllIII("HBIoBwImAHoABWgFKAYcJg==", "HgZik");
        y.lIIIlllllllIl[y.lIIIllllllllI[43]] = y.lIlIIllIlIllIII("PhQwVDgfVTUALQIB", "puFtL");
        y.lIIIlllllllIl[y.lIIIllllllllI[44]] = y.lIlIIllIlIllIlI("zqAzohu5G3P3g9droTWW6DsGtt1CdRIu", "ldHve");
        y.lIIIlllllllIl[y.lIIIllllllllI[46]] = y.lIlIIllIlIllIII("Gg8EIiA1GhslIHQaHWslNQAZ", "TnrKG");
        y.lIIIlllllllIl[y.lIIIllllllllI[47]] = y.lIlIIllIlIllIlI("vn1J8WH8c7v+UoIXvc6UjQ==", "PYetP");
        y.lIIIlllllllIl[y.lIIIllllllllI[48]] = y.lIlIIllIlIllIII("OC40CgAZIT1ODhEhMQcCFw==", "pOZnl");
        y.lIIIlllllllIl[y.lIIIllllllllI[49]] = y.lIlIIllIlIllIII("EBxjBwgiWS4PCTQQLQFaNgwmFQ5nCjYWCisQJhVWZwo0Dw4kESoIHWcNLEY4EiAKKD0=", "GyCfz");
        y.lIIIlllllllIl[y.lIIIllllllllI[50]] = y.lIlIIllIlIllIIl("l0LzD92NTqQWt60NoRaUXV6xADmrht159+Qqsnm0ljwEhX2xCvJDeo0Ra6xdM/ZTifXAINxrnXo=", "TBjHK");
        y.lIIIlllllllIl[y.lIIIllllllllI[51]] = y.lIlIIllIlIllIII("DS0XH20rOAc=", "OAbzM");
        y.lIIIlllllllIl[y.lIIIllllllllI[52]] = y.lIlIIllIlIllIlI("AqCBQtOzbG3k70lPCmU8KQ==", "zNaPN");
        y.lIIIlllllllIl[y.lIIIllllllllI[53]] = y.lIlIIllIlIllIlI("nQ9qZKm70sTUfN8+Gl1Mbg==", "Npabh");
        y.lIIIlllllllIl[y.lIIIllllllllI[54]] = y.lIlIIllIlIllIII("BzYWJjYtZBMxNA==", "HDwHQ");
        y.lIIIlllllllIl[y.lIIIllllllllI[55]] = y.lIlIIllIlIllIIl("Zq3pCHPCiGcE4EYZDbX5yw==", "nlUoW");
        y.lIIIlllllllIl[y.lIIIllllllllI[62]] = y.lIlIIllIlIllIII("NBwpPysdUw86Mh8cJjIhCg==", "ssKSB");
        y.lIIIlllllllIl[y.lIIIllllllllI[63]] = y.lIlIIllIlIllIII("ADAaPmUdP1QuIBM1ADFlWg==", "rYtYE");
        y.lIIIlllllllIl[y.lIIIllllllllI[64]] = y.lIlIIllIlIllIII("MTA4eg==", "hUKTv");
        y.lIIIlllllllIl[y.lIIIllllllllI[65]] = y.lIlIIllIlIllIlI("wa4ny8+vqE8xgThAiBj9ZQK5E4DeTv59tcnur1av2Dp326Mi13EaZLP8PKB3zdyw08tmMDghTgE=", "glMVG");
        y.lIIIlllllllIl[y.lIIIllllllllI[66]] = y.lIlIIllIlIllIlI("j+XxNtQBAZstxZCVlaDmcy4ctny0AkEmifc8fbuu4kc=", "XDGSX");
        y.lIIIlllllllIl[y.lIIIllllllllI[67]] = y.lIlIIllIlIllIIl("b0o5lQ8cwsmUIbvlsA882LMqJO2WEf7NPDskdM3UOp8=", "KPCum");
        y.lIIIlllllllIl[y.lIIIllllllllI[68]] = y.lIlIIllIlIllIIl("uJgXTs/qCXy1c2BY/j7rAyCgQjX+KwlcEkRdtkKnd0Q=", "uOjnA");
        y.lIIIlllllllIl[y.lIIIllllllllI[69]] = y.lIlIIllIlIllIIl("I3OUMzqghUnlhhHqWKPZpZ/LCh2WYOVhnlqwsRs3X5Q=", "ysfBW");
        y.lIIIlllllllIl[y.lIIIllllllllI[70]] = y.lIlIIllIlIllIlI("d0rbz9Bp19gqm7WtA4Eo7Bh+gfE1H6io", "jvGgH");
    }

    public static void bA() {
        block49: {
            BankLocation lllllllllllllllIIIIIIIIIIIIIlIIl;
            block52: {
                block53: {
                    block51: {
                        block50: {
                            if (y.lIlIIllIlIlllIl(by ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[0]];
                                b.a(bA);
                                if (y.lIlIIllIlIllllI(bA.size(), lIIIllllllllI[1])) {
                                    System.out.println(lIIIlllllllIl[lIIIllllllllI[1]]);
                                    by = lIIIllllllllI[0];
                                }
                            }
                            if (!y.lIlIIllIlIlllll(by ? 1 : 0)) break block49;
                            if (y.lIlIIllIlIlllIl(Inventory.contains((int[])f.ba) ? 1 : 0) && y.lIlIIllIlIllllI(Movement.getRunEnergy(), lIIIllllllllI[2]) && y.lIlIIllIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                Inventory.getFirst((int[])f.ba).interact(lIIIlllllllIl[lIIIllllllllI[3]]);
                                Time.sleepTicks((int)lIIIllllllllI[1]);
                                "".length();
                            }
                            if (y.lIlIIllIlIlllll(y.S() ? 1 : 0) && y.lIlIIllIlIllllI(e.j(lIIIllllllllI[4]), lIIIllllllllI[1])) {
                                lllllllllllllllIIIIIIIIIIIIIlIIl = BankLocation.getNearest();
                                if (y.lIlIIllIllIIIII(lllllllllllllllIIIIIIIIIIIIIlIIl) && y.lIlIIllIlIlllll(lllllllllllllllIIIIIIIIIIIIIlIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[5]];
                                    a.a(lllllllllllllllIIIIIIIIIIIIIlIIl);
                                }
                                if (y.lIlIIllIllIIIII(lllllllllllllllIIIIIIIIIIIIIlIIl) && y.lIlIIllIlIlllIl(lllllllllllllllIIIIIIIIIIIIIlIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (y.lIlIIllIlIlllll(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[6]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllllllI[7]);
                                        "".length();
                                    }
                                    if (y.lIlIIllIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[8]];
                                        if (y.lIlIIllIllIIIIl(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIIIllllllllI[6]);
                                            "".length();
                                        }
                                        if (y.lIlIIllIllIIIIl(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIIIllllllllI[3]);
                                            "".length();
                                        }
                                        int[] nArray = new int[lIIIllllllllI[1]];
                                        nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                                        if (y.lIlIIllIlIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                            int[] nArray2 = new int[lIIIllllllllI[1]];
                                            nArray2[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                                            if (y.lIlIIllIlIllllI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIllllllllI[5])) {
                                                y.W();
                                                System.out.println(lIIIlllllllIl[lIIIllllllllI[10]]);
                                                by = lIIIllllllllI[1];
                                                return;
                                            }
                                        }
                                        int[] nArray3 = new int[lIIIllllllllI[8]];
                                        nArray3[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
                                        nArray3[y.lIIIllllllllI[1]] = lIIIllllllllI[12];
                                        nArray3[y.lIIIllllllllI[3]] = lIIIllllllllI[9];
                                        nArray3[y.lIIIllllllllI[5]] = lIIIllllllllI[13];
                                        nArray3[y.lIIIllllllllI[6]] = lIIIllllllllI[14];
                                        if (y.lIlIIllIlIlllll(e.b(nArray3) ? 1 : 0)) {
                                            y.W();
                                            System.out.println(lIIIlllllllIl[lIIIllllllllI[15]]);
                                            by = lIIIllllllllI[1];
                                            return;
                                        }
                                    }
                                    int[] nArray = new int[lIIIllllllllI[8]];
                                    nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[11];
                                    nArray[y.lIIIllllllllI[1]] = lIIIllllllllI[12];
                                    nArray[y.lIIIllllllllI[3]] = lIIIllllllllI[9];
                                    nArray[y.lIIIllllllllI[5]] = lIIIllllllllI[13];
                                    nArray[y.lIIIllllllllI[6]] = lIIIllllllllI[14];
                                    if (y.lIlIIllIlIlllIl(e.b(nArray) ? 1 : 0)) {
                                        Bank.withdraw((int)lIIIllllllllI[11], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIIIllllllllI[1]);
                                        "".length();
                                        Bank.withdraw((int)lIIIllllllllI[12], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIIIllllllllI[1]);
                                        "".length();
                                        Bank.withdraw((int)lIIIllllllllI[9], (int)lIIIllllllllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIIIllllllllI[1]);
                                        "".length();
                                        Bank.withdraw((int)lIIIllllllllI[13], (int)lIIIllllllllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIIIllllllllI[1]);
                                        "".length();
                                        Bank.withdraw((int)lIIIllllllllI[14], (int)lIIIllllllllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIIIllllllllI[1]);
                                        "".length();
                                        a.b(f.bk, lIIIllllllllI[1]);
                                        Time.sleepTicks((int)lIIIllllllllI[5]);
                                        "".length();
                                    }
                                }
                            }
                            if (y.lIlIIllIlIlllIl(y.S() ? 1 : 0) && y.lIlIIllIlIllllI(e.j(lIIIllllllllI[4]), lIIIllllllllI[1])) {
                                if (y.lIlIIllIlIllllI(bY, lIIIllllllllI[1])) {
                                    e.w();
                                    bY += lIIIllllllllI[1];
                                }
                                if (y.lIlIIllIllIIIIl(bY)) {
                                    if (y.lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[16]];
                                        Movement.walkTo((WorldPoint)ga);
                                        "".length();
                                        Time.sleepTicks((int)lIIIllllllllI[1]);
                                        "".length();
                                    }
                                    if (y.lIlIIllIllIIIll(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[17]];
                                        String[] stringArray = new String[lIIIllllllllI[1]];
                                        stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[18]];
                                        lllllllllllllllIIIIIIIIIIIIIlIIl = TileObjects.getNearest((String[])stringArray);
                                        if (y.lIlIIllIllIIIII(lllllllllllllllIIIIIIIIIIIIIlIIl)) {
                                            String[] stringArray2 = new String[lIIIllllllllI[1]];
                                            stringArray2[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[19]];
                                            if (y.lIlIIllIlIlllIl(lllllllllllllllIIIIIIIIIIIIIlIIl.hasAction(stringArray2) ? 1 : 0)) {
                                                lllllllllllllllIIIIIIIIIIIIIlIIl.interact(lIIIlllllllIl[lIIIllllllllI[20]]);
                                                Time.sleepTicks((int)lIIIllllllllI[5]);
                                                "".length();
                                            }
                                        }
                                        g.a(lIIIlllllllIl[lIIIllllllllI[21]], fZ);
                                    }
                                }
                            }
                            int[] nArray = new int[lIIIllllllllI[1]];
                            nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[22];
                            if (!y.lIlIIllIllIIIII(NPCs.getNearest((int[])nArray))) break block50;
                            int[] nArray4 = new int[lIIIllllllllI[1]];
                            nArray4[y.lIIIllllllllI[0]] = lIIIllllllllI[23];
                            if (!y.lIlIIllIllIIIII(NPCs.getNearest((int[])nArray4))) break block50;
                            int[] nArray5 = new int[lIIIllllllllI[1]];
                            nArray5[y.lIIIllllllllI[0]] = lIIIllllllllI[24];
                            if (!y.lIlIIllIllIIlII(NPCs.getNearest((int[])nArray5))) break block51;
                        }
                        g.a(fZ);
                    }
                    if (!y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[5])) break block52;
                    String[] stringArray = new String[lIIIllllllllI[1]];
                    stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[25]];
                    if (!y.lIlIIllIlIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block53;
                    String[] stringArray3 = new String[lIIIllllllllI[1]];
                    stringArray3[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[26]];
                    if (!y.lIlIIllIlIlllIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) break block52;
                }
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[27]];
                    String[] stringArray = new String[lIIIllllllllI[1]];
                    stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[28]];
                    lllllllllllllllIIIIIIIIIIIIIlIIl = Inventory.getFirst((String[])stringArray);
                    String[] stringArray4 = new String[lIIIllllllllI[1]];
                    stringArray4[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[29]];
                    Item lllllllllllllllIIIIIIIIIIIIIlIII = Inventory.getFirst((String[])stringArray4);
                    int[] nArray6 = new int[lIIIllllllllI[1]];
                    nArray6[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                    Item lllllllllllllllIIIIIIIIIIIIIIlll = Inventory.getFirst((int[])nArray6);
                    if (y.lIlIIllIllIIIII(lllllllllllllllIIIIIIIIIIIIIlIIl) && y.lIlIIllIllIIIII(lllllllllllllllIIIIIIIIIIIIIIlll)) {
                        lllllllllllllllIIIIIIIIIIIIIlIIl.useOn(lllllllllllllllIIIIIIIIIIIIIIlll);
                        Time.sleepTicks((int)lIIIllllllllI[1]);
                        "".length();
                    }
                    int[] nArray7 = new int[lIIIllllllllI[1]];
                    nArray7[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                    lllllllllllllllIIIIIIIIIIIIIIlll = Inventory.getFirst((int[])nArray7);
                    if (y.lIlIIllIllIIIII(lllllllllllllllIIIIIIIIIIIIIlIII) && y.lIlIIllIllIIIII(lllllllllllllllIIIIIIIIIIIIIIlll)) {
                        lllllllllllllllIIIIIIIIIIIIIlIII.useOn(lllllllllllllllIIIIIIIIIIIIIIlll);
                    }
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[5])) {
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllllllllI[1]];
                    stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[30]];
                    if (y.lIlIIllIlIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        y.bm();
                    }
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[5])) {
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllllllllI[1]];
                    stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[31]];
                    if (y.lIlIIllIlIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        co = lIIIllllllllI[0];
                        if (y.lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                            AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[32]];
                            Movement.walkTo((WorldPoint)ga);
                            "".length();
                            Time.sleepTicks((int)lIIIllllllllI[1]);
                            "".length();
                        }
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[33]];
                        g.a(lIIIlllllllIl[lIIIllllllllI[34]], fZ, lIIIllllllllI[1]);
                    }
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[35])) {
                String[] stringArray = new String[lIIIllllllllI[1]];
                stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[36]];
                if (y.lIlIIllIlIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    y.bm();
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[35])) {
                String[] stringArray = new String[lIIIllllllllI[1]];
                stringArray[y.lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[37]];
                if (y.lIlIIllIlIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (y.lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[38]];
                        Movement.walkTo((WorldPoint)ga);
                        "".length();
                        Time.sleepTicks((int)lIIIllllllllI[1]);
                        "".length();
                    }
                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[39]];
                    g.a(lIIIlllllllIl[lIIIllllllllI[40]], fZ, lIIIllllllllI[1]);
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[41])) {
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    y.bm();
                }
            }
            if (y.lIlIIllIllIIlIl(e.j(lIIIllllllllI[4]), lIIIllllllllI[41])) {
                int[] nArray = new int[lIIIllllllllI[1]];
                nArray[y.lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (y.lIlIIllIlIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[42]];
                    if (y.lIlIIllIlIllllI(co, lIIIllllllllI[1])) {
                        P.lx += lIIIllllllllI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIllllllllI[1];
                        P.lx = lIIIllllllllI[0];
                        cp = lIIIllllllllI[0];
                    }
                    if (y.lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[43]];
                        Movement.walkTo((WorldPoint)ga);
                        "".length();
                        Time.sleepTicks((int)lIIIllllllllI[1]);
                        "".length();
                    }
                    g.a(lIIIlllllllIl[lIIIllllllllI[44]], fZ, lIIIllllllllI[1]);
                }
            }
            if (y.lIlIIllIllIIIII(lllllllllllllllIIIIIIIIIIIIIlIIl = Widgets.get((int)lIIIllllllllI[45], (int)lIIIllllllllI[26]))) {
                lllllllllllllllIIIIIIIIIIIIIlIIl.interact(lIIIllllllllI[0]);
            }
            g.a(new String[lIIIllllllllI[0]]);
        }
    }
}

