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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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

public class O
implements W {
    static /* synthetic */ boolean cm;
    static /* synthetic */ int cl;
    static /* synthetic */ int bT;
    private static final /* synthetic */ String[] jm;
    private static /* synthetic */ String[] lIlIlIlII;
    public static /* synthetic */ WorldPoint jn;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] lIlIlIlll;

    static {
        O.lIIlIIIIIlIl();
        O.lIIlIIIIIlII();
        String[] stringArray = new String[lIlIlIlll[15]];
        stringArray[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[64]];
        stringArray[O.lIlIlIlll[1]] = lIlIlIlII[lIlIlIlll[65]];
        stringArray[O.lIlIlIlll[3]] = lIlIlIlII[lIlIlIlll[66]];
        stringArray[O.lIlIlIlll[5]] = lIlIlIlII[lIlIlIlll[67]];
        stringArray[O.lIlIlIlll[6]] = lIlIlIlII[lIlIlIlll[68]];
        stringArray[O.lIlIlIlll[8]] = lIlIlIlII[lIlIlIlll[69]];
        stringArray[O.lIlIlIlll[10]] = lIlIlIlII[lIlIlIlll[70]];
        jm = stringArray;
        bv = new ArrayList<d>();
        jn = new WorldPoint(lIlIlIlll[71], lIlIlIlll[72], lIlIlIlll[0]);
        bT = lIlIlIlll[0];
    }

    private static boolean lIIlIIIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static void cr() {
        block8: {
            block7: {
                String[] stringArray = new String[lIlIlIlll[1]];
                stringArray[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[51]];
                if (!O.lIIlIIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block7;
                String[] stringArray2 = new String[lIlIlIlll[1]];
                stringArray2[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[52]];
                if (!O.lIIlIIIIIllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block8;
            }
            int[] nArray = new int[lIlIlIlll[1]];
            nArray[O.lIlIlIlll[0]] = lIlIlIlll[9];
            if (O.lIIlIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (O.lIIlIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks((int)e.c(lIlIlIlll[3], lIlIlIlll[5]));
                    0;
                }
                AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[53]];
                String[] stringArray = new String[lIlIlIlll[1]];
                stringArray[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[54]];
                Item lllIIllIIIlIlI = Inventory.getFirst((String[])stringArray);
                String[] stringArray3 = new String[lIlIlIlll[1]];
                stringArray3[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[55]];
                Item lllIIllIIIlIIl = Inventory.getFirst((String[])stringArray3);
                int[] nArray2 = new int[lIlIlIlll[1]];
                nArray2[O.lIlIlIlll[0]] = lIlIlIlll[9];
                Item lllIIllIIIlIII = Inventory.getFirst((int[])nArray2);
                if (O.lIIlIIIIlIIl(lllIIllIIIlIlI) && O.lIIlIIIIlIIl(lllIIllIIIlIII)) {
                    lllIIllIIIlIlI.useOn(lllIIllIIIlIII);
                    Time.sleepTicks((int)lIlIlIlll[1]);
                    0;
                }
                int[] nArray3 = new int[lIlIlIlll[1]];
                nArray3[O.lIlIlIlll[0]] = lIlIlIlll[9];
                lllIIllIIIlIII = Inventory.getFirst((int[])nArray3);
                if (O.lIIlIIIIlIIl(lllIIllIIIlIIl) && O.lIIlIIIIlIIl(lllIIllIIIlIII)) {
                    lllIIllIIIlIIl.useOn(lllIIllIIIlIII);
                }
            }
        }
    }

    private static void af() {
        d lllIIllIIIIlII;
        Object lllIIllIIIIlIl;
        block10: {
            block9: {
                int[] nArray = new int[lIlIlIlll[1]];
                nArray[O.lIlIlIlll[0]] = lIlIlIlll[11];
                if (O.lIIlIIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIlIlIlll[11], lIlIlIlll[1], lIlIlIlll[56]);
                    bv.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIlIlIlll[1]];
                nArray2[O.lIlIlIlll[0]] = lIlIlIlll[12];
                if (O.lIIlIIIIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllIIllIIIIlIl = new d(lIlIlIlll[12], lIlIlIlll[1], lIlIlIlll[56]);
                    bv.add((d)lllIIllIIIIlIl);
                    0;
                }
                int[] nArray3 = new int[lIlIlIlll[1]];
                nArray3[O.lIlIlIlll[0]] = lIlIlIlll[9];
                if (!O.lIIlIIIIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                int[] nArray4 = new int[lIlIlIlll[1]];
                nArray4[O.lIlIlIlll[0]] = lIlIlIlll[9];
                if (!O.lIIlIIIIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) break block10;
                int[] nArray5 = new int[lIlIlIlll[1]];
                nArray5[O.lIlIlIlll[0]] = lIlIlIlll[9];
                if (!O.lIIlIIIIIlll(Bank.getFirst((int[])nArray5).getQuantity(), lIlIlIlll[5])) break block10;
            }
            lllIIllIIIIlIl = new d(lIlIlIlll[9], lIlIlIlll[5], lIlIlIlll[56]);
            bv.add((d)lllIIllIIIIlIl);
            0;
        }
        int[] nArray = new int[lIlIlIlll[1]];
        nArray[O.lIlIlIlll[0]] = lIlIlIlll[14];
        if (O.lIIlIIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllIIllIIIIlIl = new d(lIlIlIlll[14], lIlIlIlll[8], lIlIlIlll[56]);
            bv.add((d)lllIIllIIIIlIl);
            0;
        }
        if (O.lIIlIIIIlIII(Bank.contains((Predicate)(lllIIllIIIIlIl = item -> item.getName().toLowerCase().contains(lIlIlIlII[lIlIlIlll[63]]))) ? 1 : 0)) {
            lllIIllIIIIlII = new d(lIlIlIlll[57], lIlIlIlll[8], lIlIlIlll[58]);
            bv.add(lllIIllIIIIlII);
            0;
        }
        int[] nArray6 = new int[lIlIlIlll[1]];
        nArray6[O.lIlIlIlll[0]] = lIlIlIlll[59];
        if (O.lIIlIIIIlIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllIIllIIIIlII = new d(lIlIlIlll[59], lIlIlIlll[54], lIlIlIlll[60]);
            bv.add(lllIIllIIIIlII);
            0;
        }
        int[] nArray7 = new int[lIlIlIlll[1]];
        nArray7[O.lIlIlIlll[0]] = lIlIlIlll[13];
        if (O.lIIlIIIIlIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lllIIllIIIIlII = new d(lIlIlIlll[13], lIlIlIlll[8], i.bq);
            bv.add(lllIIllIIIIlII);
            0;
        }
    }

    private static boolean lIIlIIIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIllllIIII(String lllIIlIllIllIl, String lllIIlIllIlIlI) {
        try {
            SecretKeySpec lllIIlIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIlIllIllll = Cipher.getInstance("Blowfish");
            lllIIlIllIllll.init(lIlIlIlll[3], lllIIlIlllIIII);
            return new String(lllIIlIllIllll.doFinal(Base64.getDecoder().decode(lllIIlIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIllIlllI) {
            lllIIlIllIlllI.printStackTrace();
            return null;
        }
    }

    private static String lIIIllllIIIl(String lllIIlIllllIII, String lllIIlIlllIlll) {
        try {
            SecretKeySpec lllIIlIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIlllIlll.getBytes(StandardCharsets.UTF_8)), lIlIlIlll[16]), "DES");
            Cipher lllIIlIlllllII = Cipher.getInstance("DES");
            lllIIlIlllllII.init(lIlIlIlll[3], lllIIlIlllllIl);
            return new String(lllIIlIlllllII.doFinal(Base64.getDecoder().decode(lllIIlIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIllllIll) {
            lllIIlIllllIll.printStackTrace();
            return null;
        }
    }

    @Override
    public int T() {
        try {
            O.cq();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIlIlIlll[61];
    }

    private static void lIIlIIIIIlII() {
        lIlIlIlII = new String[lIlIlIlll[73]];
        O.lIlIlIlII[O.lIlIlIlll[0]] = O."Buying items";
        O.lIlIlIlII[O.lIlIlIlll[1]] = O."Finished buying items, switching back to quest";
        O.lIlIlIlII[O.lIlIlIlll[3]] = O."Drink";
        O.lIlIlIlII[O.lIlIlIlll[5]] = O."Navigating to bank";
        O.lIlIlIlII[O.lIlIlIlll[6]] = O."Opening bank";
        O.lIlIlIlII[O.lIlIlIlll[8]] = O."Handling banking";
        O.lIlIlIlII[O.lIlIlIlll[10]] = O."We are missing quest supplies, switching to BUYING";
        O.lIlIlIlII[O.lIlIlIlll[15]] = O."We are missing quest supplies, switching to BUYING";
        O.lIlIlIlII[O.lIlIlIlll[16]] = O."Nav to start";
        O.lIlIlIlII[O.lIlIlIlll[17]] = O."Starting quest";
        O.lIlIlIlII[O.lIlIlIlll[18]] = O."Large door";
        O.lIlIlIlII[O.lIlIlIlll[19]] = O."Open";
        O.lIlIlIlII[O.lIlIlIlll[20]] = O."Open";
        O.lIlIlIlII[O.lIlIlIlll[21]] = O."General Bentnoze";
        O.lIlIlIlII[O.lIlIlIlll[25]] = O."Blue dye";
        O.lIlIlIlII[O.lIlIlIlll[26]] = O."Orange dye";
        O.lIlIlIlII[O.lIlIlIlll[27]] = O."Dying armor";
        O.lIlIlIlII[O.lIlIlIlll[28]] = O."Orange dye";
        O.lIlIlIlII[O.lIlIlIlll[29]] = O."Blue dye";
        O.lIlIlIlII[O.lIlIlIlll[30]] = O."Orange goblin mail";
        O.lIlIlIlII[O.lIlIlIlll[31]] = O."Orange goblin mail";
        O.lIlIlIlII[O.lIlIlIlll[32]] = O."Nav to start";
        O.lIlIlIlII[O.lIlIlIlll[33]] = O."Turning in orange";
        O.lIlIlIlII[O.lIlIlIlll[34]] = O."General Bentnoze";
        O.lIlIlIlII[O.lIlIlIlll[36]] = O."Blue goblin mail";
        O.lIlIlIlII[O.lIlIlIlll[37]] = O."Blue goblin mail";
        O.lIlIlIlII[O.lIlIlIlll[38]] = O."Nav to start";
        O.lIlIlIlII[O.lIlIlIlll[39]] = O."Turning in blue";
        O.lIlIlIlII[O.lIlIlIlll[40]] = O."General Bentnoze";
        O.lIlIlIlII[O.lIlIlIlll[42]] = O."Turning in brown";
        O.lIlIlIlII[O.lIlIlIlll[43]] = O."Nav to start";
        O.lIlIlIlII[O.lIlIlIlll[44]] = O."General Bentnoze";
        O.lIlIlIlII[O.lIlIlIlll[46]] = O."Navigating to bank";
        O.lIlIlIlII[O.lIlIlIlll[47]] = O."Opening bank";
        O.lIlIlIlII[O.lIlIlIlll[48]] = O."Handling banking";
        O.lIlIlIlII[O.lIlIlIlll[49]] = O."We are missing quest supplies, switching to BUYING";
        O.lIlIlIlII[O.lIlIlIlll[50]] = O."We are missing quest supplies, switching to BUYING";
        O.lIlIlIlII[O.lIlIlIlll[51]] = O."Blue dye";
        O.lIlIlIlII[O.lIlIlIlll[52]] = O."Orange dye";
        O.lIlIlIlII[O.lIlIlIlll[53]] = O."Dying armor";
        O.lIlIlIlII[O.lIlIlIlll[54]] = O."Orange dye";
        O.lIlIlIlII[O.lIlIlIlll[55]] = O."Blue dye";
        O.lIlIlIlII[O.lIlIlIlll[62]] = O."Goblin Diplomacy";
        O.lIlIlIlII[O.lIlIlIlll[63]] = O."ring of wealth (";
        O.lIlIlIlII[O.lIlIlIlll[64]] = O."Yes.";
        O.lIlIlIlII[O.lIlIlIlll[65]] = O."Do you want me to pick an armour colour for you?";
        O.lIlIlIlII[O.lIlIlIlll[66]] = O."What about a different colour?";
        O.lIlIlIlII[O.lIlIlIlll[67]] = O."I have some orange armour here.";
        O.lIlIlIlII[O.lIlIlIlll[68]] = O."I have some blue armour here.";
        O.lIlIlIlII[O.lIlIlIlll[69]] = O."I have some brown armour here.";
        O.lIlIlIlII[O.lIlIlIlll[70]] = O."I'll leave you to it.";
    }

    private static boolean lIIlIIIlIIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIIIIllII(int n2, int n3) {
        return n2 <= n3;
    }

    public static void cq() {
        block49: {
            BankLocation lllIIllIIlIIlI;
            block52: {
                block53: {
                    block51: {
                        block50: {
                            if (O.lIIlIIIIIllI(bt ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[0]];
                                b.a(bv);
                                if (O.lIIlIIIIIlll(bv.size(), lIlIlIlll[1])) {
                                    System.out.println(lIlIlIlII[lIlIlIlll[1]]);
                                    bt = lIlIlIlll[0];
                                }
                            }
                            if (!O.lIIlIIIIlIII(bt ? 1 : 0)) break block49;
                            if (O.lIIlIIIIIllI(Inventory.contains((int[])f.aV) ? 1 : 0) && O.lIIlIIIIIlll(Movement.getRunEnergy(), lIlIlIlll[2]) && O.lIIlIIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aV).interact(lIlIlIlII[lIlIlIlll[3]]);
                                Time.sleepTicks((int)lIlIlIlll[1]);
                                0;
                            }
                            if (O.lIIlIIIIlIII(O.ab() ? 1 : 0) && O.lIIlIIIIIlll(e.j(lIlIlIlll[4]), lIlIlIlll[1])) {
                                lllIIllIIlIIlI = BankLocation.getNearest();
                                if (O.lIIlIIIIlIIl(lllIIllIIlIIlI) && O.lIIlIIIIlIII(lllIIllIIlIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[5]];
                                    a.a(lllIIllIIlIIlI);
                                }
                                if (O.lIIlIIIIlIIl(lllIIllIIlIIlI) && O.lIIlIIIIIllI(lllIIllIIlIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (O.lIIlIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[6]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIlll[7]);
                                        0;
                                    }
                                    if (O.lIIlIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[8]];
                                        if (O.lIIlIIIIlIlI(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIlIlIlll[6]);
                                            0;
                                        }
                                        if (O.lIIlIIIIlIlI(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIlIlIlll[3]);
                                            0;
                                        }
                                        int[] nArray = new int[lIlIlIlll[1]];
                                        nArray[O.lIlIlIlll[0]] = lIlIlIlll[9];
                                        if (O.lIIlIIIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                            int[] nArray2 = new int[lIlIlIlll[1]];
                                            nArray2[O.lIlIlIlll[0]] = lIlIlIlll[9];
                                            if (O.lIIlIIIIIlll(Bank.getFirst((int[])nArray2).getQuantity(), lIlIlIlll[5])) {
                                                O.af();
                                                System.out.println(lIlIlIlII[lIlIlIlll[10]]);
                                                bt = lIlIlIlll[1];
                                                return;
                                            }
                                        }
                                        int[] nArray3 = new int[lIlIlIlll[8]];
                                        nArray3[O.lIlIlIlll[0]] = lIlIlIlll[11];
                                        nArray3[O.lIlIlIlll[1]] = lIlIlIlll[12];
                                        nArray3[O.lIlIlIlll[3]] = lIlIlIlll[9];
                                        nArray3[O.lIlIlIlll[5]] = lIlIlIlll[13];
                                        nArray3[O.lIlIlIlll[6]] = lIlIlIlll[14];
                                        if (O.lIIlIIIIlIII(e.b(nArray3) ? 1 : 0)) {
                                            O.af();
                                            System.out.println(lIlIlIlII[lIlIlIlll[15]]);
                                            bt = lIlIlIlll[1];
                                            return;
                                        }
                                    }
                                    int[] nArray = new int[lIlIlIlll[8]];
                                    nArray[O.lIlIlIlll[0]] = lIlIlIlll[11];
                                    nArray[O.lIlIlIlll[1]] = lIlIlIlll[12];
                                    nArray[O.lIlIlIlll[3]] = lIlIlIlll[9];
                                    nArray[O.lIlIlIlll[5]] = lIlIlIlll[13];
                                    nArray[O.lIlIlIlll[6]] = lIlIlIlll[14];
                                    if (O.lIIlIIIIIllI(e.b(nArray) ? 1 : 0)) {
                                        Bank.withdraw((int)lIlIlIlll[11], (int)lIlIlIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIlIlIlll[1]);
                                        0;
                                        Bank.withdraw((int)lIlIlIlll[12], (int)lIlIlIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIlIlIlll[1]);
                                        0;
                                        Bank.withdraw((int)lIlIlIlll[9], (int)lIlIlIlll[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIlIlIlll[1]);
                                        0;
                                        Bank.withdraw((int)lIlIlIlll[13], (int)lIlIlIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIlIlIlll[1]);
                                        0;
                                        Bank.withdraw((int)lIlIlIlll[14], (int)lIlIlIlll[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)lIlIlIlll[1]);
                                        0;
                                        a.b(f.bf, lIlIlIlll[1]);
                                        Time.sleepTicks((int)lIlIlIlll[5]);
                                        0;
                                    }
                                }
                            }
                            if (O.lIIlIIIIIllI(O.ab() ? 1 : 0) && O.lIIlIIIIIlll(e.j(lIlIlIlll[4]), lIlIlIlll[1])) {
                                if (O.lIIlIIIIIlll(bT, lIlIlIlll[1])) {
                                    e.v();
                                    bT += lIlIlIlll[1];
                                }
                                if (O.lIIlIIIIlIlI(bT)) {
                                    if (O.lIIlIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(jn), lIlIlIlll[8])) {
                                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[16]];
                                        Movement.walkTo((WorldPoint)jn);
                                        0;
                                        Time.sleepTicks((int)lIlIlIlll[1]);
                                        0;
                                    }
                                    if (O.lIIlIIIIllII(Players.getLocal().getWorldLocation().distanceTo(jn), lIlIlIlll[8])) {
                                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[17]];
                                        String[] stringArray = new String[lIlIlIlll[1]];
                                        stringArray[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[18]];
                                        lllIIllIIlIIlI = TileObjects.getNearest((String[])stringArray);
                                        if (O.lIIlIIIIlIIl(lllIIllIIlIIlI)) {
                                            String[] stringArray2 = new String[lIlIlIlll[1]];
                                            stringArray2[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[19]];
                                            if (O.lIIlIIIIIllI(lllIIllIIlIIlI.hasAction(stringArray2) ? 1 : 0)) {
                                                lllIIllIIlIIlI.interact(lIlIlIlII[lIlIlIlll[20]]);
                                                Time.sleepTicks((int)lIlIlIlll[5]);
                                                0;
                                            }
                                        }
                                        g.a(lIlIlIlII[lIlIlIlll[21]], jm);
                                    }
                                }
                            }
                            int[] nArray = new int[lIlIlIlll[1]];
                            nArray[O.lIlIlIlll[0]] = lIlIlIlll[22];
                            if (!O.lIIlIIIIlIIl(NPCs.getNearest((int[])nArray))) break block50;
                            int[] nArray4 = new int[lIlIlIlll[1]];
                            nArray4[O.lIlIlIlll[0]] = lIlIlIlll[23];
                            if (!O.lIIlIIIIlIIl(NPCs.getNearest((int[])nArray4))) break block50;
                            int[] nArray5 = new int[lIlIlIlll[1]];
                            nArray5[O.lIlIlIlll[0]] = lIlIlIlll[24];
                            if (!O.lIIlIIIIllIl(NPCs.getNearest((int[])nArray5))) break block51;
                        }
                        g.a(jm);
                    }
                    if (!O.lIIlIIIIlllI(e.j(lIlIlIlll[4]), lIlIlIlll[5])) break block52;
                    String[] stringArray = new String[lIlIlIlll[1]];
                    stringArray[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[25]];
                    if (!O.lIIlIIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block53;
                    String[] stringArray3 = new String[lIlIlIlll[1]];
                    stringArray3[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[26]];
                    if (!O.lIIlIIIIIllI(Inventory.contains((String[])stringArray3) ? 1 : 0)) break block52;
                }
                int[] nArray = new int[lIlIlIlll[1]];
                nArray[O.lIlIlIlll[0]] = lIlIlIlll[9];
                if (O.lIIlIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[27]];
                    String[] stringArray = new String[lIlIlIlll[1]];
                    stringArray[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[28]];
                    lllIIllIIlIIlI = Inventory.getFirst((String[])stringArray);
                    String[] stringArray4 = new String[lIlIlIlll[1]];
                    stringArray4[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[29]];
                    Item lllIIllIIlIIIl = Inventory.getFirst((String[])stringArray4);
                    int[] nArray6 = new int[lIlIlIlll[1]];
                    nArray6[O.lIlIlIlll[0]] = lIlIlIlll[9];
                    Item lllIIllIIlIIII = Inventory.getFirst((int[])nArray6);
                    if (O.lIIlIIIIlIIl(lllIIllIIlIIlI) && O.lIIlIIIIlIIl(lllIIllIIlIIII)) {
                        lllIIllIIlIIlI.useOn(lllIIllIIlIIII);
                        Time.sleepTicks((int)lIlIlIlll[1]);
                        0;
                    }
                    int[] nArray7 = new int[lIlIlIlll[1]];
                    nArray7[O.lIlIlIlll[0]] = lIlIlIlll[9];
                    lllIIllIIlIIII = Inventory.getFirst((int[])nArray7);
                    if (O.lIIlIIIIlIIl(lllIIllIIlIIIl) && O.lIIlIIIIlIIl(lllIIllIIlIIII)) {
                        lllIIllIIlIIIl.useOn(lllIIllIIlIIII);
                    }
                }
            }
            if (O.lIIlIIIIlllI(e.j(lIlIlIlll[4]), lIlIlIlll[5])) {
                int[] nArray = new int[lIlIlIlll[1]];
                nArray[O.lIlIlIlll[0]] = lIlIlIlll[9];
                if (O.lIIlIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlIlll[1]];
                    stringArray[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[30]];
                    if (O.lIIlIIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        O.ck();
                    }
                }
            }
            if (O.lIIlIIIIlllI(e.j(lIlIlIlll[4]), lIlIlIlll[5])) {
                int[] nArray = new int[lIlIlIlll[1]];
                nArray[O.lIlIlIlll[0]] = lIlIlIlll[9];
                if (O.lIIlIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIlIlll[1]];
                    stringArray[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[31]];
                    if (O.lIIlIIIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        cl = lIlIlIlll[0];
                        if (O.lIIlIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(jn), lIlIlIlll[8])) {
                            AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[32]];
                            Movement.walkTo((WorldPoint)jn);
                            0;
                            Time.sleepTicks((int)lIlIlIlll[1]);
                            0;
                        }
                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[33]];
                        g.a(lIlIlIlII[lIlIlIlll[34]], jm, lIlIlIlll[1]);
                    }
                }
            }
            if (O.lIIlIIIIlllI(e.j(lIlIlIlll[4]), lIlIlIlll[35])) {
                String[] stringArray = new String[lIlIlIlll[1]];
                stringArray[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[36]];
                if (O.lIIlIIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    O.ck();
                }
            }
            if (O.lIIlIIIIlllI(e.j(lIlIlIlll[4]), lIlIlIlll[35])) {
                String[] stringArray = new String[lIlIlIlll[1]];
                stringArray[O.lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[37]];
                if (O.lIIlIIIIIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (O.lIIlIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(jn), lIlIlIlll[8])) {
                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[38]];
                        Movement.walkTo((WorldPoint)jn);
                        0;
                        Time.sleepTicks((int)lIlIlIlll[1]);
                        0;
                    }
                    AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[39]];
                    g.a(lIlIlIlII[lIlIlIlll[40]], jm, lIlIlIlll[1]);
                }
            }
            if (O.lIIlIIIIlllI(e.j(lIlIlIlll[4]), lIlIlIlll[41])) {
                int[] nArray = new int[lIlIlIlll[1]];
                nArray[O.lIlIlIlll[0]] = lIlIlIlll[9];
                if (O.lIIlIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    O.ck();
                }
            }
            if (O.lIIlIIIIlllI(e.j(lIlIlIlll[4]), lIlIlIlll[41])) {
                int[] nArray = new int[lIlIlIlll[1]];
                nArray[O.lIlIlIlll[0]] = lIlIlIlll[9];
                if (O.lIIlIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[42]];
                    if (O.lIIlIIIIIlll(cl, lIlIlIlll[1])) {
                        an.pL += lIlIlIlll[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlIlIlll[1];
                        an.pL = lIlIlIlll[0];
                        cm = lIlIlIlll[0];
                    }
                    if (O.lIIlIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(jn), lIlIlIlll[8])) {
                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[43]];
                        Movement.walkTo((WorldPoint)jn);
                        0;
                        Time.sleepTicks((int)lIlIlIlll[1]);
                        0;
                    }
                    g.a(lIlIlIlII[lIlIlIlll[44]], jm, lIlIlIlll[1]);
                }
            }
            if (O.lIIlIIIIlIIl(lllIIllIIlIIlI = Widgets.get((int)lIlIlIlll[45], (int)lIlIlIlll[26]))) {
                lllIIllIIlIIlI.interact(lIlIlIlll[0]);
            }
            g.a(new String[lIlIlIlll[0]]);
        }
    }

    private static boolean lIIlIIIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIIllI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (O.lIIlIIIIllll(e.j(lIlIlIlll[4]), lIlIlIlll[10]) && !O.lIIlIIIIllll(e.j(lIlIlIlll[4]), lIlIlIlll[18]) || O.lIIlIIIlIIII(Quests.getState((Quest)Quest.GOBLIN_DIPLOMACY), QuestState.FINISHED)) {
            bl = lIlIlIlll[1];
            0;
            if (2 > (0x83 ^ 0xBF ^ (0x20 ^ 0x18))) {
                return ((89 + 22 - 11 + 140 ^ 194 + 15 - 198 + 186) & (0x79 ^ 0x54 ^ (0x93 ^ 0x8B) ^ -1)) != 0;
            }
        } else {
            bl = lIlIlIlll[0];
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        int[] nArray = new int[lIlIlIlll[1]];
        nArray[O.lIlIlIlll[0]] = lIlIlIlll[11];
        if (O.lIIlIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIlll[1]];
            nArray2[O.lIlIlIlll[0]] = lIlIlIlll[12];
            if (O.lIIlIIIIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIlIlIlll[1]];
                nArray3[O.lIlIlIlll[0]] = lIlIlIlll[9];
                if (O.lIIlIIIIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIlIlIlll[1];
                    0;
                    if (1 == 1) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIlIlIlll[0];
        return n2 != 0;
    }

    private static boolean lIIlIIIIlIII(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIIIlIl() {
        lIlIlIlll = new int[74];
        O.lIlIlIlll[0] = (123 + 96 - 170 + 91 ^ 87 + 3 - -23 + 19) & (0x5A ^ 1 ^ (0xC ^ 0x5F) ^ -1);
        O.lIlIlIlll[1] = 1;
        O.lIlIlIlll[2] = 0x6F ^ 0x24;
        O.lIlIlIlll[3] = 2;
        O.lIlIlIlll[4] = 91 + 103 - 24 + 8 ^ 56 + 100 - 24 + 8;
        O.lIlIlIlll[5] = 3;
        O.lIlIlIlll[6] = 0xE7 ^ 0xB5 ^ (0xE1 ^ 0xB7);
        O.lIlIlIlll[7] = 0xFFFFD3CE & 0x3FB9;
        O.lIlIlIlll[8] = 0xA3 ^ 0xA6;
        O.lIlIlIlll[9] = -(0xFFFFA757 & 0x7AEA) & (0xFFFFF3F3 & 0x2F6D);
        O.lIlIlIlll[10] = 0x92 ^ 0x94;
        O.lIlIlIlll[11] = 0xFFFFCFFF & 0x36E7;
        O.lIlIlIlll[12] = 0xFFFFCFFD & 0x36EB;
        O.lIlIlIlll[13] = 0xFFFFB7FF & 0x7951;
        O.lIlIlIlll[14] = -(0xFFFFF7FF & 0x4835) & (0xFFFFFFFD & 0x5F7F);
        O.lIlIlIlll[15] = 0x10 ^ 0x17;
        O.lIlIlIlll[16] = 0x5D ^ 0x6E ^ (0xF ^ 0x34);
        O.lIlIlIlll[17] = 83 + 124 - 109 + 30 ^ 106 + 136 - 224 + 119;
        O.lIlIlIlll[18] = 0x43 ^ 0x49;
        O.lIlIlIlll[19] = 0x7D ^ 0x36 ^ (0x76 ^ 0x36);
        O.lIlIlIlll[20] = 0x13 ^ 0x1F;
        O.lIlIlIlll[21] = 0x71 ^ 0x7C;
        O.lIlIlIlll[22] = -(0xFFFFD45E & 0x3FFD) & (0xFFFFDFFB & 0x36FF);
        O.lIlIlIlll[23] = 0xFFFFAAF7 & 0x57A9;
        O.lIlIlIlll[24] = 0xFFFF9B9F & 0x66FF;
        O.lIlIlIlll[25] = 0x59 ^ 0x57;
        O.lIlIlIlll[26] = 0xB9 ^ 0xC0 ^ (0x45 ^ 0x33);
        O.lIlIlIlll[27] = 0x8C ^ 0x9C;
        O.lIlIlIlll[28] = 0x97 ^ 0x86;
        O.lIlIlIlll[29] = 0x53 ^ 0x41;
        O.lIlIlIlll[30] = 0x21 ^ 0x4D ^ 18 + 5 - 8 + 112;
        O.lIlIlIlll[31] = 0xA8 ^ 0xBC;
        O.lIlIlIlll[32] = 0x19 ^ 0xC;
        O.lIlIlIlll[33] = 15 + 153 - 136 + 182 ^ 130 + 183 - 156 + 35;
        O.lIlIlIlll[34] = 0x74 ^ 0x58 ^ (0 ^ 0x3B);
        O.lIlIlIlll[35] = 0xFFFFFF95 & 0x26E;
        O.lIlIlIlll[36] = 0xB6 ^ 0xAE;
        O.lIlIlIlll[37] = 10 + 14 - -89 + 47 ^ 12 + 117 - -25 + 31;
        O.lIlIlIlll[38] = 0xD9 ^ 0xC3;
        O.lIlIlIlll[39] = 0x93 ^ 0x88;
        O.lIlIlIlll[40] = 0x4E ^ 0x52;
        O.lIlIlIlll[41] = -(0xFFFFFBD9 & 0x66AF) & (0xFFFFE6CF & 0x7FBD);
        O.lIlIlIlll[42] = 0xE7 ^ 0xB8 ^ (0xEB ^ 0xA9);
        O.lIlIlIlll[43] = 0x74 ^ 0x6A;
        O.lIlIlIlll[44] = 0x62 ^ 0x7D;
        O.lIlIlIlll[45] = -(0xFFFFFFFF & 0x3AEB) & (0xFFFFFBFF & 0x3FFF);
        O.lIlIlIlll[46] = 0xE1 ^ 0xC1;
        O.lIlIlIlll[47] = 0x27 ^ 6;
        O.lIlIlIlll[48] = 0x67 ^ 3 ^ (0x21 ^ 0x67);
        O.lIlIlIlll[49] = 0x5D ^ 0x38 ^ (0x1C ^ 0x5A);
        O.lIlIlIlll[50] = 0x2C ^ 8;
        O.lIlIlIlll[51] = 0x60 ^ 0x45;
        O.lIlIlIlll[52] = 174 + 122 - 285 + 177 ^ 146 + 134 - 173 + 47;
        O.lIlIlIlll[53] = 0xC8 ^ 0x9B ^ (0xED ^ 0x99);
        O.lIlIlIlll[54] = 0x2B ^ 3;
        O.lIlIlIlll[55] = 55 + 1 - -24 + 47 ^ (0x33 ^ 0x65);
        O.lIlIlIlll[56] = 0xFFFFEB7D & 0x37AA;
        O.lIlIlIlll[57] = 0xFFFFEECD & 0x3FFE;
        O.lIlIlIlll[58] = 0xFFFFF1BE & 0x6FE9;
        O.lIlIlIlll[59] = 0xFFFFDFCF & 0x3F77;
        O.lIlIlIlll[60] = -(0xFFFFF4C5 & 0x3B3E) & (0xFFFFB76F & Short.MAX_VALUE);
        O.lIlIlIlll[61] = 100 + 79 - 164 + 216 ^ 22 + 13 - -76 + 20;
        O.lIlIlIlll[62] = 72 + 161 - 158 + 91 ^ 132 + 88 - 114 + 34;
        O.lIlIlIlll[63] = 0x17 ^ 0x3C;
        O.lIlIlIlll[64] = 0xF2 ^ 0x95 ^ (0x5D ^ 0x16);
        O.lIlIlIlll[65] = 0x56 ^ 0x7B;
        O.lIlIlIlll[66] = 0x34 ^ 0x3A ^ (0x46 ^ 0x66);
        O.lIlIlIlll[67] = 14 + 4 - -13 + 134 ^ 70 + 41 - 8 + 35;
        O.lIlIlIlll[68] = 80 + 118 - 144 + 127 ^ 52 + 58 - -4 + 19;
        O.lIlIlIlll[69] = 0x49 ^ 0x78;
        O.lIlIlIlll[70] = 0x4F ^ 8 ^ (0xF8 ^ 0x8D);
        O.lIlIlIlll[71] = 0xFFFFAFEF & 0x5B9D;
        O.lIlIlIlll[72] = -(0xFFFFFF59 & 0x72EE) & (0xFFFFFFFF & Short.MAX_VALUE);
        O.lIlIlIlll[73] = 59 + 189 - 57 + 54 ^ 75 + 85 - 144 + 182;
    }

    private static boolean lIIlIIIIlIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean S() {
        return lIlIlIlll[0];
    }

    private static boolean lIIlIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void ck() {
        void lllIIllIIIlllI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (O.lIIlIIIIlIIl(bankLocation) && O.lIIlIIIIlIII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[46]];
            a.a(bankLocation);
        }
        if (O.lIIlIIIIlIIl(lllIIllIIIlllI) && O.lIIlIIIIIllI(lllIIllIIIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (O.lIIlIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[47]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIlIlll[7]);
                0;
            }
            if (O.lIIlIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[48]];
                if (O.lIIlIIIIlIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIlIlIlll[6]);
                    0;
                }
                if (O.lIIlIIIIlIlI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIlIlIlll[3]);
                    0;
                }
                int[] nArray = new int[lIlIlIlll[1]];
                nArray[O.lIlIlIlll[0]] = lIlIlIlll[9];
                if (O.lIIlIIIIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIlIlIlll[1]];
                    nArray2[O.lIlIlIlll[0]] = lIlIlIlll[9];
                    if (O.lIIlIIIIIlll(Bank.getFirst((int[])nArray2).getQuantity(), lIlIlIlll[5])) {
                        O.af();
                        System.out.println(lIlIlIlII[lIlIlIlll[49]]);
                        bt = lIlIlIlll[1];
                        return;
                    }
                }
                int[] nArray3 = new int[lIlIlIlll[8]];
                nArray3[O.lIlIlIlll[0]] = lIlIlIlll[11];
                nArray3[O.lIlIlIlll[1]] = lIlIlIlll[12];
                nArray3[O.lIlIlIlll[3]] = lIlIlIlll[9];
                nArray3[O.lIlIlIlll[5]] = lIlIlIlll[13];
                nArray3[O.lIlIlIlll[6]] = lIlIlIlll[14];
                if (O.lIIlIIIIlIII(e.b(nArray3) ? 1 : 0)) {
                    O.af();
                    System.out.println(lIlIlIlII[lIlIlIlll[50]]);
                    bt = lIlIlIlll[1];
                    return;
                }
            }
            int[] nArray = new int[lIlIlIlll[8]];
            nArray[O.lIlIlIlll[0]] = lIlIlIlll[11];
            nArray[O.lIlIlIlll[1]] = lIlIlIlll[12];
            nArray[O.lIlIlIlll[3]] = lIlIlIlll[9];
            nArray[O.lIlIlIlll[5]] = lIlIlIlll[13];
            nArray[O.lIlIlIlll[6]] = lIlIlIlll[14];
            if (O.lIIlIIIIIllI(e.b(nArray) ? 1 : 0)) {
                Bank.withdraw((int)lIlIlIlll[11], (int)lIlIlIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIlIlIlll[1]);
                0;
                Bank.withdraw((int)lIlIlIlll[12], (int)lIlIlIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIlIlIlll[1]);
                0;
                Bank.withdraw((int)lIlIlIlll[9], (int)lIlIlIlll[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIlIlIlll[1]);
                0;
                Bank.withdraw((int)lIlIlIlll[13], (int)lIlIlIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIlIlIlll[1]);
                0;
                Bank.withdraw((int)lIlIlIlll[14], (int)lIlIlIlll[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)lIlIlIlll[1]);
                0;
                a.b(f.bf, lIlIlIlll[1]);
                Time.sleepTicks((int)lIlIlIlll[5]);
                0;
                Bank.close();
                O.cr();
            }
        }
    }

    private static String lIIIlllIllll(String lllIIlIlIllIII, String lllIIlIlIlllII) {
        lllIIlIlIllIII = new String(Base64.getDecoder().decode(lllIIlIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlIlIllIll = new StringBuilder();
        char[] lllIIlIlIllIlI = lllIIlIlIlllII.toCharArray();
        int lllIIlIlIllIIl = lIlIlIlll[0];
        char[] lllIIlIlIlIIll = lllIIlIlIllIII.toCharArray();
        int lllIIlIlIlIIlI = lllIIlIlIlIIll.length;
        int lllIIlIlIlIIIl = lIlIlIlll[0];
        while (O.lIIlIIIIIlll(lllIIlIlIlIIIl, lllIIlIlIlIIlI)) {
            char lllIIlIlIllllI = lllIIlIlIlIIll[lllIIlIlIlIIIl];
            lllIIlIlIllIll.append((char)(lllIIlIlIllllI ^ lllIIlIlIllIlI[lllIIlIlIllIIl % lllIIlIlIllIlI.length]));
            0;
            ++lllIIlIlIllIIl;
            ++lllIIlIlIlIIIl;
            0;
            if (2 <= 3) continue;
            return null;
        }
        return String.valueOf(lllIIlIlIllIll);
    }

    private static boolean lIIlIIIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String U() {
        return lIlIlIlII[lIlIlIlll[62]];
    }

    private static boolean lIIlIIIIlIIl(Object object) {
        return object != null;
    }
}

