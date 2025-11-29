/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.PHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class XHelper
implements G {
    static  int ck;
    public static  List<d> bv;
    public static final  WorldPoint dj;
    
    static  boolean cl;
    
    public static  boolean bt;
    
    public static final  WorldPoint dk;

    private static boolean lIIIIIIIlllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIIIIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIIllIIIII[3]];
        stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[49]];
        if (x.lIIIIIIIlllII(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIllIIIII[3]];
            nArray[x.lIIllIIIII[4]] = lIIllIIIII[14];
            if (x.lIIIIIIIlllII(Inventory.getCount((int[])nArray))) {
                String[] stringArray2 = new String[lIIllIIIII[3]];
                stringArray2[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[50]];
                if (x.lIIIIIIIllIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIllIIIII[3]];
                    nArray2[x.lIIllIIIII[4]] = lIIllIIIII[18];
                    if (x.lIIIIIIIllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIllIIIII[3]];
                        nArray3[x.lIIllIIIII[4]] = lIIllIIIII[11];
                        if (x.lIIIIIIIllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            n2 = lIIllIIIII[3];

                            if ((0x4D ^ 0x49) >= 0) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lIIllIIIII[4];
        return n2 != 0;
    }

    private static boolean lIIIIIIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void af() {
        block16: {
            d var2;
            block15: {
                Object var3;
                block14: {
                    block13: {
                        int[] nArray = new int[lIIllIIIII[3]];
                        nArray[x.lIIllIIIII[4]] = lIIllIIIII[19];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIllIIIII[19], lIIllIIIII[2], i.bq);
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[lIIllIIIII[3]];
                        nArray2[x.lIIllIIIII[4]] = lIIllIIIII[11];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var3 = new DHelper(lIIllIIIII[11], lIIllIIIII[3], lIIllIIIII[51]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray3 = new int[lIIllIIIII[3]];
                        nArray3[x.lIIllIIIII[4]] = lIIllIIIII[14];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var3 = new DHelper(lIIllIIIII[14], lIIllIIIII[3], lIIllIIIII[51]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray4 = new int[lIIllIIIII[3]];
                        nArray4[x.lIIllIIIII[4]] = lIIllIIIII[18];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var3 = new DHelper(lIIllIIIII[18], lIIllIIIII[3], lIIllIIIII[51]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray5 = new int[lIIllIIIII[3]];
                        nArray5[x.lIIllIIIII[4]] = lIIllIIIII[16];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var3 = new DHelper(lIIllIIIII[16], lIIllIIIII[3], lIIllIIIII[51]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray6 = new int[lIIllIIIII[3]];
                        nArray6[x.lIIllIIIII[4]] = lIIllIIIII[13];
                        if (x.lIIIIIIIllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var3 = new DHelper(lIIllIIIII[13], lIIllIIIII[3], lIIllIIIII[52]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray7 = new int[lIIllIIIII[3]];
                        nArray7[x.lIIllIIIII[4]] = lIIllIIIII[10];
                        if (!x.lIIIIIIIllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block13;
                        int[] nArray8 = new int[lIIllIIIII[3]];
                        nArray8[x.lIIllIIIII[4]] = lIIllIIIII[10];
                        if (!x.lIIIIIIIllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                        int[] nArray9 = new int[lIIllIIIII[3]];
                        nArray9[x.lIIllIIIII[4]] = lIIllIIIII[10];
                        if (!x.lIIIIIIIlIllI(Bank.getFirst((int[])nArray9).getQuantity(), lIIllIIIII[2])) break block14;
                    }
                    var3 = new DHelper(lIIllIIIII[10], lIIllIIIII[2], lIIllIIIII[53]);
                    bv.add((DHelper) ar3);

                }
                if (x.lIIIIIIIllIlI(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(lIIlIllllI[lIIllIIIII[59]]))) ? 1 : 0)) {
                    var2 = new DHelper(lIIllIIIII[54], lIIllIIIII[15], lIIllIIIII[55]);
                    bv.add(var2);

                }
                int[] nArray = new int[lIIllIIIII[3]];
                nArray[x.lIIllIIIII[4]] = lIIllIIIII[9];
                if (!x.lIIIIIIIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                int[] nArray10 = new int[lIIllIIIII[3]];
                nArray10[x.lIIllIIIII[4]] = lIIllIIIII[9];
                if (!x.lIIIIIIIllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block16;
                int[] nArray11 = new int[lIIllIIIII[3]];
                nArray11[x.lIIllIIIII[4]] = lIIllIIIII[9];
                if (!x.lIIIIIIIlIllI(Bank.getFirst((int[])nArray11).getQuantity(), lIIllIIIII[2])) break block16;
            }
            var2 = new DHelper(lIIllIIIII[9], lIIllIIIII[56], lIIllIIIII[52]);
            bv.add(var2);

        }
    }

    @Override
    public int T() {
        try {
            System.out.println("678: " + e.j(lIIllIIIII[5]));
            x.bh();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 == ((0x95 ^ 0x80) & ~(0x80 ^ 0x95))) {
            return (0xBE ^ 0x85) & ~(0x18 ^ 0x23);
        }
        return lIIllIIIII[57];
    }

    private static boolean lIIIIIIIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIIIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIIIllIIl(int n2) {
        return n2 != 0;
    }

    static {
        x.lIIIIIIIlIlIl();
        x.lIIIIIIIlIlII();
        dj = new WorldPoint(lIIllIIIII[67], lIIllIIIII[68], lIIllIIIII[4]);
        dk = new WorldPoint(lIIllIIIII[69], lIIllIIIII[70], lIIllIIIII[4]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[lIIllIIIII[23]];
        stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[71]];
        stringArray[x.lIIllIIIII[3]] = lIIlIllllI[lIIllIIIII[72]];
        stringArray[x.lIIllIIIII[1]] = lIIlIllllI[lIIllIIIII[73]];
        stringArray[x.lIIllIIIII[12]] = lIIlIllllI[lIIllIIIII[74]];
        stringArray[x.lIIllIIIII[7]] = lIIlIllllI[lIIllIIIII[75]];
        stringArray[x.lIIllIIIII[15]] = lIIlIllllI[lIIllIIIII[76]];
        stringArray[x.lIIllIIIII[17]] = lIIlIllllI[lIIllIIIII[77]];
        stringArray[x.lIIllIIIII[8]] = lIIlIllllI[lIIllIIIII[78]];
        bR = stringArray;
    }

    private static boolean lIIIIIIIlllll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    public static void bh() {
        if (x.lIIIIIIIlIllI(e.j(lIIllIIIII[0]), lIIllIIIII[1])) {
            B.bF();
        }
        if (x.lIIIIIIIlIllI(Skills.getLevel((Skill)Skill.COOKING), lIIllIIIII[2]) && x.lIIIIIIIlIlll(e.j(lIIllIIIII[0]), lIIllIIIII[1])) {
            P.cL();
        }
        if (x.lIIIIIIIllIII(Skills.getLevel((Skill)Skill.COOKING), lIIllIIIII[2]) && x.lIIIIIIIlIlll(e.j(lIIllIIIII[0]), lIIllIIIII[1])) {
            if (x.lIIIIIIIllIIl(bt ? 1 : 0)) {
                b.a(bv);
                if (x.lIIIIIIIlIllI(bv.size(), lIIllIIIII[3])) {
                    System.out.println(lIIlIllllI[lIIllIIIII[4]]);
                    bt = lIIllIIIII[4];
                }
            }
            if (x.lIIIIIIIllIlI(bt ? 1 : 0)) {
                BankLocation var4;
                if (x.lIIIIIIIllIlI(x.ab() ? 1 : 0) && x.lIIIIIIIllIlI(e.j(lIIllIIIII[5]))) {
                    var4 = BankLocation.getNearest();
                    if (x.lIIIIIIIllIll(var4) && x.lIIIIIIIllIlI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[3]];
                        a.a(var4);
                    }
                    if (x.lIIIIIIIllIll(var4) && x.lIIIIIIIllIIl(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (x.lIIIIIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIIIII[6]);

                        }
                        if (x.lIIIIIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[1]];
                            if (x.lIIIIIIIlllII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIllIIIII[7]);

                            }
                            if (x.lIIIIIIIlllII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIllIIIII[1]);

                            }
                            int[] nArray = new int[lIIllIIIII[8]];
                            nArray[x.lIIllIIIII[4]] = lIIllIIIII[9];
                            nArray[x.lIIllIIIII[3]] = lIIllIIIII[10];
                            nArray[x.lIIllIIIII[1]] = lIIllIIIII[11];
                            nArray[x.lIIllIIIII[12]] = lIIllIIIII[13];
                            nArray[x.lIIllIIIII[7]] = lIIllIIIII[14];
                            nArray[x.lIIllIIIII[15]] = lIIllIIIII[16];
                            nArray[x.lIIllIIIII[17]] = lIIllIIIII[18];
                            if (x.lIIIIIIIllIlI(e.b(nArray) ? 1 : 0)) {
                                x.af();
                                System.out.println(lIIlIllllI[lIIllIIIII[12]]);
                                bt = lIIllIIIII[3];
                                return;
                            }
                            int[] nArray2 = new int[lIIllIIIII[8]];
                            nArray2[x.lIIllIIIII[4]] = lIIllIIIII[9];
                            nArray2[x.lIIllIIIII[3]] = lIIllIIIII[10];
                            nArray2[x.lIIllIIIII[1]] = lIIllIIIII[11];
                            nArray2[x.lIIllIIIII[12]] = lIIllIIIII[13];
                            nArray2[x.lIIllIIIII[7]] = lIIllIIIII[14];
                            nArray2[x.lIIllIIIII[15]] = lIIllIIIII[16];
                            nArray2[x.lIIllIIIII[17]] = lIIllIIIII[18];
                            if (x.lIIIIIIIllIIl(e.b(nArray2) ? 1 : 0)) {
                                a.a(lIIllIIIII[9], lIIllIIIII[2]);
                                a.a(lIIllIIIII[10], lIIllIIIII[2]);
                                a.a(lIIllIIIII[11], lIIllIIIII[3]);
                                a.a(lIIllIIIII[13], lIIllIIIII[3]);
                                a.a(lIIllIIIII[14], lIIllIIIII[3]);
                                a.a(lIIllIIIII[16], lIIllIIIII[3]);
                                a.a(lIIllIIIII[18], lIIllIIIII[3]);
                                a.a(lIIllIIIII[19], lIIllIIIII[1]);
                                a.a(lIIllIIIII[20], lIIllIIIII[6]);
                            }
                        }
                    }
                }
                if (x.lIIIIIIIllIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && x.lIIIIIIIlIllI(Movement.getRunEnergy(), lIIllIIIII[21])) {
                    Inventory.getFirst((int[])f.aV).interact(lIIlIllllI[lIIllIIIII[7]]);
                    Time.sleepTicks((int)lIIllIIIII[3]);

                }
                if (x.lIIIIIIIllIlI(e.j(lIIllIIIII[5])) && x.lIIIIIIIllIIl(x.ab() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[15]];
                    if (x.lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                        if (x.lIIIIIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dj);

                        Time.sleepTicks((int)lIIllIIIII[3]);

                    }
                    if (x.lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                        AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[17]];
                        g.a(lIIlIllllI[lIIllIIIII[8]], bR);
                    }
                }
                if (x.lIIIIIIIlIlll(e.j(lIIllIIIII[5]), lIIllIIIII[3])) {
                    int[] nArray = new int[lIIllIIIII[3]];
                    nArray[x.lIIllIIIII[4]] = lIIllIIIII[22];
                    if (x.lIIIIIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIIIII[3]];
                        stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[23]];
                        if (x.lIIIIIIIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            ck = lIIllIIIII[4];
                            if (x.lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dk), lIIllIIIII[7])) {
                                AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[24]];
                                var4 = new WorldArea(lIIllIIIII[25], lIIllIIIII[26], lIIllIIIII[27], lIIllIIIII[28], lIIllIIIII[4]);
                                if (x.lIIIIIIIllIlI(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (x.lIIIIIIIllIIl(Inventory.contains(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[66]])) ? 1 : 0) && x.lIIIIIIIllIlI(Equipment.contains(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[56]])) ? 1 : 0)) {
                                        Inventory.getFirst(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[65]])).interact(lIIlIllllI[lIIllIIIII[2]]);
                                    }
                                    if (x.lIIIIIIIllIIl(Equipment.contains(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[64]])) ? 1 : 0) && x.lIIIIIIIlIlll(Players.getLocal().getAnimation(), lIIllIIIII[29])) {
                                        Equipment.getFirst(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[63]])).interact(lIIlIllllI[lIIllIIIII[30]]);
                                        Time.sleepTicks((int)lIIllIIIII[7]);

                                    }
                                }
                                if (x.lIIIIIIIllIIl(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)dk);

                                    Time.sleepTicks((int)lIIllIIIII[3]);

                                }
                            }
                            if (x.lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dk), lIIllIIIII[7])) {
                                AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[31]];
                                if (x.lIIIIIIIllIIl(Widgets.get((int)lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIIllIIIII[3]];
                                    stringArray2[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[33]];
                                    NPCs.getNearest((String[])stringArray2).interact(lIIlIllllI[lIIllIIIII[34]]);
                                    Time.sleepTicks((int)lIIllIIIII[12]);

                                }
                                if (x.lIIIIIIIllIlI(Widgets.get((int)lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIIllIIIII[32], (int)lIIllIIIII[35], (int)lIIllIIIII[3]).interact(lIIlIllllI[lIIllIIIII[36]]);
                                    Time.sleepTicks((int)lIIllIIIII[1]);

                                }
                                int[] nArray3 = new int[lIIllIIIII[3]];
                                nArray3[x.lIIllIIIII[4]] = lIIllIIIII[22];
                                if (x.lIIIIIIIllIIl(Inventory.contains((int[])nArray3) ? 1 : 0) && x.lIIIIIIIllIlI(Widgets.get((int)lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIIllIIIII[32], (int)lIIllIIIII[3], (int)lIIllIIIII[30]).interact(lIIlIllllI[lIIllIIIII[35]]);
                                    Time.sleepTicks((int)lIIllIIIII[3]);

                                }
                            }
                        }
                    }
                    int[] nArray4 = new int[lIIllIIIII[3]];
                    nArray4[x.lIIllIIIII[4]] = lIIllIIIII[22];
                    if (x.lIIIIIIIllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIIIII[3]];
                        stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[37]];
                        if (x.lIIIIIIIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIllIIIII[3]];
                            nArray5[x.lIIllIIIII[4]] = lIIllIIIII[22];
                            if (x.lIIIIIIIllIIl(Inventory.contains((int[])nArray5) ? 1 : 0) && x.lIIIIIIIllIlI(Widgets.get((int)lIIllIIIII[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get((int)lIIllIIIII[32], (int)lIIllIIIII[3], (int)lIIllIIIII[30]).interact(lIIlIllllI[lIIllIIIII[38]]);
                                Time.sleepTicks((int)lIIllIIIII[3]);

                            }
                            int[] nArray6 = new int[lIIllIIIII[3]];
                            nArray6[x.lIIllIIIII[4]] = lIIllIIIII[18];
                            String[] stringArray3 = new String[lIIllIIIII[3]];
                            stringArray3[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[39]];
                            Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((String[])stringArray3));
                            Time.sleepTicks((int)lIIllIIIII[1]);

                        }
                    }
                    String[] stringArray = new String[lIIllIIIII[3]];
                    stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[40]];
                    if (x.lIIIIIIIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (x.lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                            if (x.lIIIIIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (x.lIIIIIIIllIIl(Inventory.contains(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[62]])) ? 1 : 0) && x.lIIIIIIIllIlI(Equipment.contains(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[61]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIIlIllllI[lIIllIIIII[60]])).interact(lIIlIllllI[lIIllIIIII[41]]);
                                Time.sleepTicks((int)lIIllIIIII[1]);

                            }
                            Movement.walkTo((WorldPoint)dj);

                            Time.sleepTicks((int)lIIllIIIII[3]);

                        }
                        if (x.lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                            AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[42]];
                            if (x.lIIIIIIIlIllI(ck, lIIllIIIII[3])) {
                                U.lq += lIIllIIIII[3];
                                U.o(AccBuilderRogues.m);
                                ck += lIIllIIIII[3];
                                U.lq = lIIllIIIII[4];
                                cl = lIIllIIIII[4];
                            }
                            g.a(lIIlIllllI[lIIllIIIII[43]], bR);
                        }
                    }
                }
                if (x.lIIIIIIIlIlll(e.j(lIIllIIIII[5]), lIIllIIIII[1])) {
                    String[] stringArray = new String[lIIllIIIII[3]];
                    stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[44]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIllllI[lIIllIIIII[45]]);
                    Time.sleepTicks((int)lIIllIIIII[1]);

                }
            }
        }
    }

    @Override
    public boolean S() {
        return lIIllIIIII[4];
    }

    @Override
    public String U() {
        return lIIlIllllI[lIIllIIIII[58]];
    }

    private static void lIIIIIIIlIlII() {
        lIIlIllllI = new String[lIIllIIIII[21]];
        x.lIIlIllllI[x.lIIllIIIII[4]] = "Finished buying items, switching back to quest";
        x.lIIlIllllI[x.lIIllIIIII[3]] = "Nav to bank";
        x.lIIlIllllI[x.lIIllIIIII[1]] = "Handling banking";
        x.lIIlIllllI[x.lIIllIIIII[12]] = "We are missing quest supplies, switching to BUYING";
        x.lIIlIllllI[x.lIIllIIIII[7]] = "Drink";
        x.lIIlIllllI[x.lIIllIIIII[15]] = "Nav to start";
        x.lIIlIllllI[x.lIIllIIIII[17]] = "Handling dialog";
        x.lIIlIllllI[x.lIIllIIIII[8]] = "Cook";
        x.lIIlIllllI[x.lIIllIIIII[23]] = "Dirty blast";
        x.lIIlIllllI[x.lIIllIIIII[24]] = "Nav to rotten tomato";
        x.lIIlIllllI[x.lIIllIIIII[2]] = "Wear";
        x.lIIlIllllI[x.lIIllIIIII[30]] = "PvP Arena";
        x.lIIlIllllI[x.lIIllIIIII[31]] = "Getting tomato";
        x.lIIlIllllI[x.lIIllIIIII[33]] = "Fadli";
        x.lIIlIllllI[x.lIIllIIIII[34]] = "Buy";
        x.lIIlIllllI[x.lIIllIIIII[36]] = "Buy 1";
        x.lIIlIllllI[x.lIIllIIIII[35]] = "Close";
        x.lIIlIllllI[x.lIIllIIIII[37]] = "Dirty blast";
        x.lIIlIllllI[x.lIIllIIIII[38]] = "Close";
        x.lIIlIllllI[x.lIIllIIIII[39]] = "Fruit blast";
        x.lIIlIllllI[x.lIIllIIIII[40]] = "Dirty blast";
        x.lIIlIllllI[x.lIIllIIIII[41]] = "Wear";
        x.lIIlIllllI[x.lIIllIIIII[42]] = "Handling dialog";
        x.lIIlIllllI[x.lIIllIIIII[43]] = "Cook";
        x.lIIlIllllI[x.lIIllIIIII[44]] = "Door";
        x.lIIlIllllI[x.lIIllIIIII[45]] = "Open";
        x.lIIlIllllI[x.lIIllIIIII[46]] = "Aris";
        x.lIIlIllllI[x.lIIllIIIII[47]] = "Entering room";
        x.lIIlIllllI[x.lIIllIIIII[48]] = "Door";
        x.lIIlIllllI[x.lIIllIIIII[0]] = "Open";
        x.lIIlIllllI[x.lIIllIIIII[49]] = "Eye of newt";
        x.lIIlIllllI[x.lIIllIIIII[50]] = "Fruit blast";
        x.lIIlIllllI[x.lIIllIIIII[58]] = "RFD start quest";
        x.lIIlIllllI[x.lIIllIIIII[59]] = "ring of wealth (";
        x.lIIlIllllI[x.lIIllIIIII[60]] = "dueling";
        x.lIIlIllllI[x.lIIllIIIII[61]] = "dueling";
        x.lIIlIllllI[x.lIIllIIIII[62]] = "dueling";
        x.lIIlIllllI[x.lIIllIIIII[63]] = "dueling";
        x.lIIlIllllI[x.lIIllIIIII[64]] = "dueling";
        x.lIIlIllllI[x.lIIllIIIII[65]] = "dueling";
        x.lIIlIllllI[x.lIIllIIIII[56]] = "dueling";
        x.lIIlIllllI[x.lIIllIIIII[66]] = "dueling";
        x.lIIlIllllI[x.lIIllIIIII[71]] = "Can you make me a cake?";
        x.lIIlIllllI[x.lIIllIIIII[72]] = "I'm always happy to help a cook in distress.";
        x.lIIlIllllI[x.lIIllIIIII[73]] = "Actually, I know where to find this stuff.";
        x.lIIlIllllI[x.lIIllIIIII[74]] = "Yes.";
        x.lIIlIllllI[x.lIIllIIIII[75]] = "What's wrong?";
        x.lIIlIllllI[x.lIIllIIIII[76]] = "Do you have any other quests for me?";
        x.lIIlIllllI[x.lIIllIIIII[77]] = "Angry! It makes me angry!";
        x.lIIlIllllI[x.lIIllIIIII[78]] = "What seems to be the problem?";
    }

    private static boolean lIIIIIIIllIll(Object object) {
        return object != null;
    }

    public static void bi() {
        String[] stringArray = new String[lIIllIIIII[3]];
        stringArray[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[46]];
        if (x.lIIIIIIIlllll(NPCs.getNearest((String[])stringArray))) {
            if (x.lIIIIIIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                if (x.lIIIIIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)dj);

                Time.sleepTicks((int)lIIllIIIII[3]);

            }
            if (x.lIIIIIIIllllI(Players.getLocal().getWorldLocation().distanceTo(dj), lIIllIIIII[12])) {
                AccBuilderRogues.c = lIIlIllllI[lIIllIIIII[47]];
                String[] stringArray2 = new String[lIIllIIIII[3]];
                stringArray2[x.lIIllIIIII[4]] = lIIlIllllI[lIIllIIIII[48]];
                TileObjects.getNearest((String[])stringArray2).interact(lIIlIllllI[lIIllIIIII[0]]);
                Time.sleepTicks((int)lIIllIIIII[1]);

            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (x.lIIIIIIlIIIII(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            bl = lIIllIIIII[3];

            }
        } else {
            bl = lIIllIIIII[4];
        }
        return bl;
    }
}

