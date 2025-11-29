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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class W
implements ac {
    public static /* synthetic */ WorldPoint ml;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIIllIllI;
    private static final /* synthetic */ String[] mk;
    static /* synthetic */ boolean dj;
    static /* synthetic */ int di;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ int cG;
    private static /* synthetic */ String[] llIIllIIll;

    @Override
    public boolean ae() {
        return llIIllIllI[0];
    }

    private static void Q() {
        d var6;
        Object var21;
        block10: {
            block9: {
                int[] nArray = new int[llIIllIllI[1]];
                nArray[W.llIIllIllI[0]] = llIIllIllI[11];
                if (W.lIlIllIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llIIllIllI[11], llIIllIllI[1], llIIllIllI[56]);
                    bv.add(d2);
                    0;
                }
                int[] nArray2 = new int[llIIllIllI[1]];
                nArray2[W.llIIllIllI[0]] = llIIllIllI[12];
                if (W.lIlIllIlIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var21 = new d(llIIllIllI[12], llIIllIllI[1], llIIllIllI[56]);
                    bv.add((d)var21);
                    0;
                }
                int[] nArray3 = new int[llIIllIllI[1]];
                nArray3[W.llIIllIllI[0]] = llIIllIllI[9];
                if (!W.lIlIllIlIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                int[] nArray4 = new int[llIIllIllI[1]];
                nArray4[W.llIIllIllI[0]] = llIIllIllI[9];
                if (!W.lIlIllIlIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block10;
                int[] nArray5 = new int[llIIllIllI[1]];
                nArray5[W.llIIllIllI[0]] = llIIllIllI[9];
                if (!W.lIlIllIlIIllI(Bank.getFirst((int[])nArray5).getQuantity(), llIIllIllI[5])) break block10;
            }
            var21 = new d(llIIllIllI[9], llIIllIllI[5], llIIllIllI[56]);
            bv.add((d)var21);
            0;
        }
        int[] nArray = new int[llIIllIllI[1]];
        nArray[W.llIIllIllI[0]] = llIIllIllI[14];
        if (W.lIlIllIlIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var21 = new d(llIIllIllI[14], llIIllIllI[8], llIIllIllI[56]);
            bv.add((d)var21);
            0;
        }
        if (W.lIlIllIlIIlll(Bank.contains((Predicate)(var21 = item -> item.getName().toLowerCase().contains(llIIllIIll[llIIllIllI[63]]))) ? 1 : 0)) {
            var6 = new d(llIIllIllI[57], llIIllIllI[8], llIIllIllI[58]);
            bv.add(var6);
            0;
        }
        int[] nArray6 = new int[llIIllIllI[1]];
        nArray6[W.llIIllIllI[0]] = llIIllIllI[59];
        if (W.lIlIllIlIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var6 = new d(llIIllIllI[59], llIIllIllI[54], llIIllIllI[60]);
            bv.add(var6);
            0;
        }
        int[] nArray7 = new int[llIIllIllI[1]];
        nArray7[W.llIIllIllI[0]] = llIIllIllI[13];
        if (W.lIlIllIlIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var6 = new d(llIIllIllI[13], llIIllIllI[8], j.cf);
            bv.add(var6);
            0;
        }
    }

    private static boolean lIlIllIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        W.lIlIllIlIIlII();
        W.lIlIllIlIIIll();
        String[] stringArray = new String[llIIllIllI[15]];
        stringArray[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[64]];
        stringArray[W.llIIllIllI[1]] = llIIllIIll[llIIllIllI[65]];
        stringArray[W.llIIllIllI[3]] = llIIllIIll[llIIllIllI[66]];
        stringArray[W.llIIllIllI[5]] = llIIllIIll[llIIllIllI[67]];
        stringArray[W.llIIllIllI[6]] = llIIllIIll[llIIllIllI[68]];
        stringArray[W.llIIllIllI[8]] = llIIllIIll[llIIllIllI[69]];
        stringArray[W.llIIllIllI[10]] = llIIllIIll[llIIllIllI[70]];
        mk = stringArray;
        bv = new ArrayList<d>();
        ml = new WorldPoint(llIIllIllI[71], llIIllIllI[72], llIIllIllI[0]);
        cG = llIIllIllI[0];
    }

    private static boolean lIlIllIlIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (W.lIlIllIlIlllI(e.j(llIIllIllI[4]), llIIllIllI[10]) && !W.lIlIllIlIlllI(e.j(llIIllIllI[4]), llIIllIllI[18]) || W.lIlIllIlIllll(Quests.getState((Quest)Quest.GOBLIN_DIPLOMACY), QuestState.FINISHED)) {
            bl = llIIllIllI[1];
            0;
            if ((0xEC ^ 0xA3 ^ (0x17 ^ 0x5C)) < 0) {
                return ((11 + 10 - -55 + 52 ^ 100 + 128 - 223 + 141) & (0x5B ^ 0x72 ^ (0xA0 ^ 0x9B) ^ -1)) != 0;
            }
        } else {
            bl = llIIllIllI[0];
        }
        return bl;
    }

    private static boolean lIlIllIlIllll(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public int af() {
        try {
            W.dO();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 1) {
            return (0x4A ^ 5) & ~(0xD8 ^ 0x97);
        }
        return llIIllIllI[61];
    }

    private static String lIlIllIIlIIll(String var26, String var8) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var28 = Cipher.getInstance("Blowfish");
            var28.init(llIIllIllI[3], var24);
            return new String(var28.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static void dO() {
        block49: {
            BankLocation var14;
            block52: {
                block53: {
                    block51: {
                        block50: {
                            if (W.lIlIllIlIIlIl(bt ? 1 : 0)) {
                                AccBuilderSotf.c = llIIllIIll[llIIllIllI[0]];
                                b.a(bv);
                                if (W.lIlIllIlIIllI(bv.size(), llIIllIllI[1])) {
                                    System.out.println(llIIllIIll[llIIllIllI[1]]);
                                    bt = llIIllIllI[0];
                                }
                            }
                            if (!W.lIlIllIlIIlll(bt ? 1 : 0)) break block49;
                            if (W.lIlIllIlIIlIl(Inventory.contains((int[])f.ba) ? 1 : 0) && W.lIlIllIlIIllI(Movement.getRunEnergy(), llIIllIllI[2]) && W.lIlIllIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                                Inventory.getFirst((int[])f.ba).interact(llIIllIIll[llIIllIllI[3]]);
                                Time.sleepTicks((int)llIIllIllI[1]);
                                0;
                            }
                            if (W.lIlIllIlIIlll(W.an() ? 1 : 0) && W.lIlIllIlIIllI(e.j(llIIllIllI[4]), llIIllIllI[1])) {
                                var14 = BankLocation.getNearest();
                                if (W.lIlIllIlIlIII(var14) && W.lIlIllIlIIlll(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIIllIIll[llIIllIllI[5]];
                                    a.a(var14);
                                }
                                if (W.lIlIllIlIlIII(var14) && W.lIlIllIlIIlIl(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (W.lIlIllIlIIlll(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[6]];
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllIllI[7]);
                                        0;
                                    }
                                    if (W.lIlIllIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[8]];
                                        if (W.lIlIllIlIlIIl(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)llIIllIllI[6]);
                                            0;
                                        }
                                        if (W.lIlIllIlIlIIl(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)llIIllIllI[3]);
                                            0;
                                        }
                                        int[] nArray = new int[llIIllIllI[1]];
                                        nArray[W.llIIllIllI[0]] = llIIllIllI[9];
                                        if (W.lIlIllIlIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                            int[] nArray2 = new int[llIIllIllI[1]];
                                            nArray2[W.llIIllIllI[0]] = llIIllIllI[9];
                                            if (W.lIlIllIlIIllI(Bank.getFirst((int[])nArray2).getQuantity(), llIIllIllI[5])) {
                                                W.Q();
                                                System.out.println(llIIllIIll[llIIllIllI[10]]);
                                                bt = llIIllIllI[1];
                                                return;
                                            }
                                        }
                                        int[] nArray3 = new int[llIIllIllI[8]];
                                        nArray3[W.llIIllIllI[0]] = llIIllIllI[11];
                                        nArray3[W.llIIllIllI[1]] = llIIllIllI[12];
                                        nArray3[W.llIIllIllI[3]] = llIIllIllI[9];
                                        nArray3[W.llIIllIllI[5]] = llIIllIllI[13];
                                        nArray3[W.llIIllIllI[6]] = llIIllIllI[14];
                                        if (W.lIlIllIlIIlll(e.c(nArray3) ? 1 : 0)) {
                                            W.Q();
                                            System.out.println(llIIllIIll[llIIllIllI[15]]);
                                            bt = llIIllIllI[1];
                                            return;
                                        }
                                    }
                                    int[] nArray = new int[llIIllIllI[8]];
                                    nArray[W.llIIllIllI[0]] = llIIllIllI[11];
                                    nArray[W.llIIllIllI[1]] = llIIllIllI[12];
                                    nArray[W.llIIllIllI[3]] = llIIllIllI[9];
                                    nArray[W.llIIllIllI[5]] = llIIllIllI[13];
                                    nArray[W.llIIllIllI[6]] = llIIllIllI[14];
                                    if (W.lIlIllIlIIlIl(e.c(nArray) ? 1 : 0)) {
                                        Bank.withdraw((int)llIIllIllI[11], (int)llIIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llIIllIllI[1]);
                                        0;
                                        Bank.withdraw((int)llIIllIllI[12], (int)llIIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llIIllIllI[1]);
                                        0;
                                        Bank.withdraw((int)llIIllIllI[9], (int)llIIllIllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llIIllIllI[1]);
                                        0;
                                        Bank.withdraw((int)llIIllIllI[13], (int)llIIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llIIllIllI[1]);
                                        0;
                                        Bank.withdraw((int)llIIllIllI[14], (int)llIIllIllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                        Time.sleepTicks((int)llIIllIllI[1]);
                                        0;
                                        a.b(f.bk, llIIllIllI[1]);
                                        Time.sleepTicks((int)llIIllIllI[5]);
                                        0;
                                    }
                                }
                            }
                            if (W.lIlIllIlIIlIl(W.an() ? 1 : 0) && W.lIlIllIlIIllI(e.j(llIIllIllI[4]), llIIllIllI[1])) {
                                if (W.lIlIllIlIIllI(cG, llIIllIllI[1])) {
                                    e.x();
                                    cG += llIIllIllI[1];
                                }
                                if (W.lIlIllIlIlIIl(cG)) {
                                    if (W.lIlIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(ml), llIIllIllI[8])) {
                                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[16]];
                                        Movement.walkTo((WorldPoint)ml);
                                        0;
                                        Time.sleepTicks((int)llIIllIllI[1]);
                                        0;
                                    }
                                    if (W.lIlIllIlIlIll(Players.getLocal().getWorldLocation().distanceTo(ml), llIIllIllI[8])) {
                                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[17]];
                                        String[] stringArray = new String[llIIllIllI[1]];
                                        stringArray[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[18]];
                                        var14 = TileObjects.getNearest((String[])stringArray);
                                        if (W.lIlIllIlIlIII(var14)) {
                                            String[] stringArray2 = new String[llIIllIllI[1]];
                                            stringArray2[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[19]];
                                            if (W.lIlIllIlIIlIl(var14.hasAction(stringArray2) ? 1 : 0)) {
                                                var14.interact(llIIllIIll[llIIllIllI[20]]);
                                                Time.sleepTicks((int)llIIllIllI[5]);
                                                0;
                                            }
                                        }
                                        g.a(llIIllIIll[llIIllIllI[21]], mk);
                                    }
                                }
                            }
                            int[] nArray = new int[llIIllIllI[1]];
                            nArray[W.llIIllIllI[0]] = llIIllIllI[22];
                            if (!W.lIlIllIlIlIII(NPCs.getNearest((int[])nArray))) break block50;
                            int[] nArray4 = new int[llIIllIllI[1]];
                            nArray4[W.llIIllIllI[0]] = llIIllIllI[23];
                            if (!W.lIlIllIlIlIII(NPCs.getNearest((int[])nArray4))) break block50;
                            int[] nArray5 = new int[llIIllIllI[1]];
                            nArray5[W.llIIllIllI[0]] = llIIllIllI[24];
                            if (!W.lIlIllIlIllII(NPCs.getNearest((int[])nArray5))) break block51;
                        }
                        g.a(mk);
                    }
                    if (!W.lIlIllIlIllIl(e.j(llIIllIllI[4]), llIIllIllI[5])) break block52;
                    String[] stringArray = new String[llIIllIllI[1]];
                    stringArray[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[25]];
                    if (!W.lIlIllIlIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block53;
                    String[] stringArray3 = new String[llIIllIllI[1]];
                    stringArray3[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[26]];
                    if (!W.lIlIllIlIIlIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) break block52;
                }
                int[] nArray = new int[llIIllIllI[1]];
                nArray[W.llIIllIllI[0]] = llIIllIllI[9];
                if (W.lIlIllIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllIIll[llIIllIllI[27]];
                    String[] stringArray = new String[llIIllIllI[1]];
                    stringArray[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[28]];
                    var14 = Inventory.getFirst((String[])stringArray);
                    String[] stringArray4 = new String[llIIllIllI[1]];
                    stringArray4[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[29]];
                    Item var22 = Inventory.getFirst((String[])stringArray4);
                    int[] nArray6 = new int[llIIllIllI[1]];
                    nArray6[W.llIIllIllI[0]] = llIIllIllI[9];
                    Item var13 = Inventory.getFirst((int[])nArray6);
                    if (W.lIlIllIlIlIII(var14) && W.lIlIllIlIlIII(var13)) {
                        var14.useOn(var13);
                        Time.sleepTicks((int)llIIllIllI[1]);
                        0;
                    }
                    int[] nArray7 = new int[llIIllIllI[1]];
                    nArray7[W.llIIllIllI[0]] = llIIllIllI[9];
                    var13 = Inventory.getFirst((int[])nArray7);
                    if (W.lIlIllIlIlIII(var22) && W.lIlIllIlIlIII(var13)) {
                        var22.useOn(var13);
                    }
                }
            }
            if (W.lIlIllIlIllIl(e.j(llIIllIllI[4]), llIIllIllI[5])) {
                int[] nArray = new int[llIIllIllI[1]];
                nArray[W.llIIllIllI[0]] = llIIllIllI[9];
                if (W.lIlIllIlIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[llIIllIllI[1]];
                    stringArray[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[30]];
                    if (W.lIlIllIlIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        W.dA();
                    }
                }
            }
            if (W.lIlIllIlIllIl(e.j(llIIllIllI[4]), llIIllIllI[5])) {
                int[] nArray = new int[llIIllIllI[1]];
                nArray[W.llIIllIllI[0]] = llIIllIllI[9];
                if (W.lIlIllIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    String[] stringArray = new String[llIIllIllI[1]];
                    stringArray[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[31]];
                    if (W.lIlIllIlIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        di = llIIllIllI[0];
                        if (W.lIlIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(ml), llIIllIllI[8])) {
                            AccBuilderSotf.c = llIIllIIll[llIIllIllI[32]];
                            Movement.walkTo((WorldPoint)ml);
                            0;
                            Time.sleepTicks((int)llIIllIllI[1]);
                            0;
                        }
                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[33]];
                        g.a(llIIllIIll[llIIllIllI[34]], mk, llIIllIllI[1]);
                    }
                }
            }
            if (W.lIlIllIlIllIl(e.j(llIIllIllI[4]), llIIllIllI[35])) {
                String[] stringArray = new String[llIIllIllI[1]];
                stringArray[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[36]];
                if (W.lIlIllIlIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    W.dA();
                }
            }
            if (W.lIlIllIlIllIl(e.j(llIIllIllI[4]), llIIllIllI[35])) {
                String[] stringArray = new String[llIIllIllI[1]];
                stringArray[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[37]];
                if (W.lIlIllIlIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (W.lIlIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(ml), llIIllIllI[8])) {
                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[38]];
                        Movement.walkTo((WorldPoint)ml);
                        0;
                        Time.sleepTicks((int)llIIllIllI[1]);
                        0;
                    }
                    AccBuilderSotf.c = llIIllIIll[llIIllIllI[39]];
                    g.a(llIIllIIll[llIIllIllI[40]], mk, llIIllIllI[1]);
                }
            }
            if (W.lIlIllIlIllIl(e.j(llIIllIllI[4]), llIIllIllI[41])) {
                int[] nArray = new int[llIIllIllI[1]];
                nArray[W.llIIllIllI[0]] = llIIllIllI[9];
                if (W.lIlIllIlIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    W.dA();
                }
            }
            if (W.lIlIllIlIllIl(e.j(llIIllIllI[4]), llIIllIllI[41])) {
                int[] nArray = new int[llIIllIllI[1]];
                nArray[W.llIIllIllI[0]] = llIIllIllI[9];
                if (W.lIlIllIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllIIll[llIIllIllI[42]];
                    if (W.lIlIllIlIIllI(di, llIIllIllI[1])) {
                        aN.ta += llIIllIllI[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIIllIllI[1];
                        aN.ta = llIIllIllI[0];
                        dj = llIIllIllI[0];
                    }
                    if (W.lIlIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(ml), llIIllIllI[8])) {
                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[43]];
                        Movement.walkTo((WorldPoint)ml);
                        0;
                        Time.sleepTicks((int)llIIllIllI[1]);
                        0;
                    }
                    g.a(llIIllIIll[llIIllIllI[44]], mk, llIIllIllI[1]);
                }
            }
            if (W.lIlIllIlIlIII(var14 = Widgets.get((int)llIIllIllI[45], (int)llIIllIllI[26]))) {
                var14.interact(llIIllIllI[0]);
            }
            g.a(new String[llIIllIllI[0]]);
        }
    }

    private static boolean lIlIllIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlIlIIl(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void dA() {
        void var17;
        BankLocation bankLocation = BankLocation.getNearest();
        if (W.lIlIllIlIlIII(bankLocation) && W.lIlIllIlIIlll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIllIIll[llIIllIllI[46]];
            a.a(bankLocation);
        }
        if (W.lIlIllIlIlIII(var17) && W.lIlIllIlIIlIl(var17.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (W.lIlIllIlIIlll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = llIIllIIll[llIIllIllI[47]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllIllI[7]);
                0;
            }
            if (W.lIlIllIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = llIIllIIll[llIIllIllI[48]];
                if (W.lIlIllIlIlIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIIllIllI[6]);
                    0;
                }
                if (W.lIlIllIlIlIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)llIIllIllI[3]);
                    0;
                }
                int[] nArray = new int[llIIllIllI[1]];
                nArray[W.llIIllIllI[0]] = llIIllIllI[9];
                if (W.lIlIllIlIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llIIllIllI[1]];
                    nArray2[W.llIIllIllI[0]] = llIIllIllI[9];
                    if (W.lIlIllIlIIllI(Bank.getFirst((int[])nArray2).getQuantity(), llIIllIllI[5])) {
                        W.Q();
                        System.out.println(llIIllIIll[llIIllIllI[49]]);
                        bt = llIIllIllI[1];
                        return;
                    }
                }
                int[] nArray3 = new int[llIIllIllI[8]];
                nArray3[W.llIIllIllI[0]] = llIIllIllI[11];
                nArray3[W.llIIllIllI[1]] = llIIllIllI[12];
                nArray3[W.llIIllIllI[3]] = llIIllIllI[9];
                nArray3[W.llIIllIllI[5]] = llIIllIllI[13];
                nArray3[W.llIIllIllI[6]] = llIIllIllI[14];
                if (W.lIlIllIlIIlll(e.c(nArray3) ? 1 : 0)) {
                    W.Q();
                    System.out.println(llIIllIIll[llIIllIllI[50]]);
                    bt = llIIllIllI[1];
                    return;
                }
            }
            int[] nArray = new int[llIIllIllI[8]];
            nArray[W.llIIllIllI[0]] = llIIllIllI[11];
            nArray[W.llIIllIllI[1]] = llIIllIllI[12];
            nArray[W.llIIllIllI[3]] = llIIllIllI[9];
            nArray[W.llIIllIllI[5]] = llIIllIllI[13];
            nArray[W.llIIllIllI[6]] = llIIllIllI[14];
            if (W.lIlIllIlIIlIl(e.c(nArray) ? 1 : 0)) {
                Bank.withdraw((int)llIIllIllI[11], (int)llIIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llIIllIllI[1]);
                0;
                Bank.withdraw((int)llIIllIllI[12], (int)llIIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llIIllIllI[1]);
                0;
                Bank.withdraw((int)llIIllIllI[9], (int)llIIllIllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llIIllIllI[1]);
                0;
                Bank.withdraw((int)llIIllIllI[13], (int)llIIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llIIllIllI[1]);
                0;
                Bank.withdraw((int)llIIllIllI[14], (int)llIIllIllI[5], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks((int)llIIllIllI[1]);
                0;
                a.b(f.bk, llIIllIllI[1]);
                Time.sleepTicks((int)llIIllIllI[5]);
                0;
                Bank.close();
                W.dP();
            }
        }
    }

    private static void lIlIllIlIIlII() {
        llIIllIllI = new int[74];
        W.llIIllIllI[0] = (0x2B ^ 0x7C) & ~(0x1F ^ 0x48);
        W.llIIllIllI[1] = 1;
        W.llIIllIllI[2] = 0x63 ^ 0x78 ^ (0xD5 ^ 0x85);
        W.llIIllIllI[3] = 2;
        W.llIIllIllI[4] = 0xF9 ^ 0xC7;
        W.llIIllIllI[5] = 3;
        W.llIIllIllI[6] = 130 + 83 - 185 + 144 ^ 52 + 26 - 38 + 128;
        W.llIIllIllI[7] = -(0xFFFFEE5F & 0x5DB2) & (0xFFFFDFDD & 0x7FBB);
        W.llIIllIllI[8] = 0x2A ^ 4 ^ (0x5D ^ 0x76);
        W.llIIllIllI[9] = -(0xFFFFFBCD & 0x4EBE) & (0xFFFFCFAF & 0x7BFB);
        W.llIIllIllI[10] = 4 ^ 2;
        W.llIIllIllI[11] = 0xFFFFA7FF & 0x5EE7;
        W.llIIllIllI[12] = -(0xFFFFFFFF & 0x2917) & (0xFFFFBFFF & 0x6FFF);
        W.llIIllIllI[13] = 0xFFFFF35B & 0x3DF5;
        W.llIIllIllI[14] = -(0xFFFFC73D & 0x78F7) & (0xFFFFDF7F & 0x7FFD);
        W.llIIllIllI[15] = 0x8C ^ 0x8B;
        W.llIIllIllI[16] = 0x44 ^ 0x4C;
        W.llIIllIllI[17] = 0x94 ^ 0x9D;
        W.llIIllIllI[18] = 0xA1 ^ 0x98 ^ (0x5D ^ 0x6E);
        W.llIIllIllI[19] = 0x52 ^ 0x59;
        W.llIIllIllI[20] = 0x23 ^ 0x2F;
        W.llIIllIllI[21] = 0x38 ^ 0x35;
        W.llIIllIllI[22] = -(0xFFFFB8EF & 0x4F5C) & (0xFFFFFBEB & 0xEFF);
        W.llIIllIllI[23] = 0xFFFF92EF & 0x6FB1;
        W.llIIllIllI[24] = 0xFFFFC2FF & 0x3F9F;
        W.llIIllIllI[25] = 0x1C ^ 0x12;
        W.llIIllIllI[26] = 0x40 ^ 0x4F;
        W.llIIllIllI[27] = 0x6D ^ 0x7D;
        W.llIIllIllI[28] = 0x6C ^ 0x7D;
        W.llIIllIllI[29] = 0xB9 ^ 0xAB;
        W.llIIllIllI[30] = 0x17 ^ 4;
        W.llIIllIllI[31] = 93 + 0 - 48 + 114 ^ 48 + 25 - 44 + 110;
        W.llIIllIllI[32] = 0x76 ^ 0x63;
        W.llIIllIllI[33] = 129 + 60 - 118 + 120 ^ 13 + 23 - -111 + 22;
        W.llIIllIllI[34] = 50 + 119 - 61 + 26 ^ 43 + 2 - -31 + 69;
        W.llIIllIllI[35] = 0xFFFFCB56 & 0x36AD;
        W.llIIllIllI[36] = 1 + 50 - 3 + 95 ^ 108 + 52 - 16 + 7;
        W.llIIllIllI[37] = 104 + 110 - 130 + 62 ^ 83 + 49 - 17 + 24;
        W.llIIllIllI[38] = 110 + 55 - 124 + 150 ^ 148 + 105 - 228 + 140;
        W.llIIllIllI[39] = 0x6D ^ 0x60 ^ (0x98 ^ 0x8E);
        W.llIIllIllI[40] = 150 + 141 - 115 + 46 ^ 105 + 96 - 36 + 29;
        W.llIIllIllI[41] = -(0xFFFFF7CB & 0x6BFD) & (0xFFFFF7FD & 0x6FCF);
        W.llIIllIllI[42] = 0x69 ^ 2 ^ (0x60 ^ 0x16);
        W.llIIllIllI[43] = 0xBE ^ 0xA0;
        W.llIIllIllI[44] = 103 + 124 - 60 + 17 ^ 90 + 16 - -4 + 57;
        W.llIIllIllI[45] = -(0xFFFFFEEF & 0x7FD9) & (0xFFFFFFDF & 0x7FFD);
        W.llIIllIllI[46] = 0x74 ^ 0x58 ^ (0x20 ^ 0x2C);
        W.llIIllIllI[47] = 0x7C ^ 0x5D;
        W.llIIllIllI[48] = 0xB4 ^ 0x96;
        W.llIIllIllI[49] = 0xC5 ^ 0xAC ^ (0xF8 ^ 0xB2);
        W.llIIllIllI[50] = 0x77 ^ 0x53;
        W.llIIllIllI[51] = 0xAA ^ 0x8F;
        W.llIIllIllI[52] = 0xA1 ^ 0x87;
        W.llIIllIllI[53] = 0x25 ^ 2;
        W.llIIllIllI[54] = 9 + 29 - -24 + 124 ^ 143 + 16 - 78 + 65;
        W.llIIllIllI[55] = 0x47 ^ 0x6E;
        W.llIIllIllI[56] = -(0xFFFFECF7 & 0x5BCF) & (0xFFFFFBEE & 0x6FFF);
        W.llIIllIllI[57] = -(0xFFFFDDA1 & 0x327F) & (0xFFFFFEEE & 0x3FFD);
        W.llIIllIllI[58] = -(0xFFFF9E79 & 0x7BCE) & (0xFFFFFBEF & Short.MAX_VALUE);
        W.llIIllIllI[59] = -(0xFFFFE9BD & 0x56C3) & (0xFFFFDFC7 & Short.MAX_VALUE);
        W.llIIllIllI[60] = 0xFFFF9FFD & 0x676E;
        W.llIIllIllI[61] = 3 + 70 - 61 + 184 ^ 2 + 70 - 33 + 121;
        W.llIIllIllI[62] = 0x70 ^ 0x63 ^ (0x54 ^ 0x6D);
        W.llIIllIllI[63] = 0xEE ^ 0xC5;
        W.llIIllIllI[64] = 69 + 11 - 24 + 89 ^ 174 + 100 - 219 + 134;
        W.llIIllIllI[65] = 0x2A ^ 7;
        W.llIIllIllI[66] = 2 ^ (0x8B ^ 0xA7);
        W.llIIllIllI[67] = 7 ^ 0x28;
        W.llIIllIllI[68] = 0x2B ^ 0x48 ^ (0x2D ^ 0x7E);
        W.llIIllIllI[69] = 0xB9 ^ 0x88;
        W.llIIllIllI[70] = 0x93 ^ 0xA4 ^ (0x2C ^ 0x29);
        W.llIIllIllI[71] = -(0xFFFFE8A7 & 0x775B) & (0xFFFFEBEF & 0x7F9F);
        W.llIIllIllI[72] = 0xFFFFAFFE & 0x5DB9;
        W.llIIllIllI[73] = 0x95 ^ 0xA6;
    }

    private static boolean lIlIllIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIllIIlIlII(String var15, String var25) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var2 = var25.toCharArray();
        int var9 = llIIllIllI[0];
        char[] var23 = var15.toCharArray();
        int var20 = var23.length;
        int var11 = llIIllIllI[0];
        while (W.lIlIllIlIIllI(var11, var20)) {
            char var18 = var23[var11];
            var10.append((char)(var18 ^ var2[var9 % var2.length]));
            0;
            ++var9;
            ++var11;
            0;
            if (((0x57 ^ 0x22 ^ (0x45 ^ 0x2C)) & (0xB0 ^ 0xA6 ^ (2 ^ 8) ^ -1)) <= ((2 ^ 0x31 ^ (0xFF ^ 0x97)) & (207 + 5 - 35 + 69 ^ 17 + 51 - -27 + 78 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean lIlIllIlIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void dP() {
        block8: {
            block7: {
                String[] stringArray = new String[llIIllIllI[1]];
                stringArray[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[51]];
                if (!W.lIlIllIlIIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block7;
                String[] stringArray2 = new String[llIIllIllI[1]];
                stringArray2[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[52]];
                if (!W.lIlIllIlIIlIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block8;
            }
            int[] nArray = new int[llIIllIllI[1]];
            nArray[W.llIIllIllI[0]] = llIIllIllI[9];
            if (W.lIlIllIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (W.lIlIllIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                    Time.sleepTicks((int)e.c(llIIllIllI[3], llIIllIllI[5]));
                    0;
                }
                AccBuilderSotf.c = llIIllIIll[llIIllIllI[53]];
                String[] stringArray = new String[llIIllIllI[1]];
                stringArray[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[54]];
                Item var7 = Inventory.getFirst((String[])stringArray);
                String[] stringArray3 = new String[llIIllIllI[1]];
                stringArray3[W.llIIllIllI[0]] = llIIllIIll[llIIllIllI[55]];
                Item var4 = Inventory.getFirst((String[])stringArray3);
                int[] nArray2 = new int[llIIllIllI[1]];
                nArray2[W.llIIllIllI[0]] = llIIllIllI[9];
                Item var5 = Inventory.getFirst((int[])nArray2);
                if (W.lIlIllIlIlIII(var7) && W.lIlIllIlIlIII(var5)) {
                    var7.useOn(var5);
                    Time.sleepTicks((int)llIIllIllI[1]);
                    0;
                }
                int[] nArray3 = new int[llIIllIllI[1]];
                nArray3[W.llIIllIllI[0]] = llIIllIllI[9];
                var5 = Inventory.getFirst((int[])nArray3);
                if (W.lIlIllIlIlIII(var4) && W.lIlIllIlIlIII(var5)) {
                    var4.useOn(var5);
                }
            }
        }
    }

    private static boolean lIlIllIlIlIII(Object object) {
        return object != null;
    }

    private static String lIlIllIIlIIlI(String var1, String var19) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llIIllIllI[16]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(llIIllIllI[3], var16);
            return new String(var12.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIIllIllI[1]];
        nArray[W.llIIllIllI[0]] = llIIllIllI[11];
        if (W.lIlIllIlIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llIIllIllI[1]];
            nArray2[W.llIIllIllI[0]] = llIIllIllI[12];
            if (W.lIlIllIlIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llIIllIllI[1]];
                nArray3[W.llIIllIllI[0]] = llIIllIllI[9];
                if (W.lIlIllIlIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = llIIllIllI[1];
                    0;
                    if (((0x3F ^ 0xF) & ~(0x2E ^ 0x1E)) == 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = llIIllIllI[0];
        return n2 != 0;
    }

    private static void lIlIllIlIIIll() {
        llIIllIIll = new String[llIIllIllI[73]];
        W.llIIllIIll[W.llIIllIllI[0]] = W."Buying items";
        W.llIIllIIll[W.llIIllIllI[1]] = W."Finished buying items, switching back to quest";
        W.llIIllIIll[W.llIIllIllI[3]] = W."Drink";
        W.llIIllIIll[W.llIIllIllI[5]] = W."Navigating to bank";
        W.llIIllIIll[W.llIIllIllI[6]] = W."Opening bank";
        W.llIIllIIll[W.llIIllIllI[8]] = W."Handling banking";
        W.llIIllIIll[W.llIIllIllI[10]] = W."We are missing quest supplies, switching to BUYING";
        W.llIIllIIll[W.llIIllIllI[15]] = W."We are missing quest supplies, switching to BUYING";
        W.llIIllIIll[W.llIIllIllI[16]] = W."Nav to start";
        W.llIIllIIll[W.llIIllIllI[17]] = W."Starting quest";
        W.llIIllIIll[W.llIIllIllI[18]] = W."Large door";
        W.llIIllIIll[W.llIIllIllI[19]] = W."Open";
        W.llIIllIIll[W.llIIllIllI[20]] = W."Open";
        W.llIIllIIll[W.llIIllIllI[21]] = W."General Bentnoze";
        W.llIIllIIll[W.llIIllIllI[25]] = W."Blue dye";
        W.llIIllIIll[W.llIIllIllI[26]] = W."Orange dye";
        W.llIIllIIll[W.llIIllIllI[27]] = W."Dying armor";
        W.llIIllIIll[W.llIIllIllI[28]] = W."Orange dye";
        W.llIIllIIll[W.llIIllIllI[29]] = W."Blue dye";
        W.llIIllIIll[W.llIIllIllI[30]] = W."Orange goblin mail";
        W.llIIllIIll[W.llIIllIllI[31]] = W."Orange goblin mail";
        W.llIIllIIll[W.llIIllIllI[32]] = W."Nav to start";
        W.llIIllIIll[W.llIIllIllI[33]] = W."Turning in orange";
        W.llIIllIIll[W.llIIllIllI[34]] = W."General Bentnoze";
        W.llIIllIIll[W.llIIllIllI[36]] = W."Blue goblin mail";
        W.llIIllIIll[W.llIIllIllI[37]] = W."Blue goblin mail";
        W.llIIllIIll[W.llIIllIllI[38]] = W."Nav to start";
        W.llIIllIIll[W.llIIllIllI[39]] = W."Turning in blue";
        W.llIIllIIll[W.llIIllIllI[40]] = W."General Bentnoze";
        W.llIIllIIll[W.llIIllIllI[42]] = W."Turning in brown";
        W.llIIllIIll[W.llIIllIllI[43]] = W."Nav to start";
        W.llIIllIIll[W.llIIllIllI[44]] = W."General Bentnoze";
        W.llIIllIIll[W.llIIllIllI[46]] = W."Navigating to bank";
        W.llIIllIIll[W.llIIllIllI[47]] = W."Opening bank";
        W.llIIllIIll[W.llIIllIllI[48]] = W."Handling banking";
        W.llIIllIIll[W.llIIllIllI[49]] = W."We are missing quest supplies, switching to BUYING";
        W.llIIllIIll[W.llIIllIllI[50]] = W."We are missing quest supplies, switching to BUYING";
        W.llIIllIIll[W.llIIllIllI[51]] = W."Blue dye";
        W.llIIllIIll[W.llIIllIllI[52]] = W."Orange dye";
        W.llIIllIIll[W.llIIllIllI[53]] = W."Dying armor";
        W.llIIllIIll[W.llIIllIllI[54]] = W."Orange dye";
        W.llIIllIIll[W.llIIllIllI[55]] = W."Blue dye";
        W.llIIllIIll[W.llIIllIllI[62]] = W."Goblin Diplomacy";
        W.llIIllIIll[W.llIIllIllI[63]] = W."ring of wealth (";
        W.llIIllIIll[W.llIIllIllI[64]] = W."Yes.";
        W.llIIllIIll[W.llIIllIllI[65]] = W."Do you want me to pick an armour colour for you?";
        W.llIIllIIll[W.llIIllIllI[66]] = W."What about a different colour?";
        W.llIIllIIll[W.llIIllIllI[67]] = W."I have some orange armour here.";
        W.llIIllIIll[W.llIIllIllI[68]] = W."I have some blue armour here.";
        W.llIIllIIll[W.llIIllIllI[69]] = W."I have some brown armour here.";
        W.llIIllIIll[W.llIIllIllI[70]] = W."I'll leave you to it.";
    }

    private static boolean lIlIllIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIlIllII(Object object) {
        return object == null;
    }

    @Override
    public String ag() {
        return llIIllIIll[llIIllIllI[62]];
    }
}

