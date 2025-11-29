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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.QHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AXHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class KHelper
implements ac {
    public static  List<d> bv;

    public static final  WorldPoint gl;
    static  boolean dj;
    static  int di;
    public static final  WorldPoint gk;
    public static  boolean bt;

    static {
        K.lIlIIIllIllll();
        K.lIlIIIllIlllI();
        gk = new WorldPoint(llIIIIlIII[67], llIIIIlIII[68], llIIIIlIII[4]);
        gl = new WorldPoint(llIIIIlIII[69], llIIIIlIII[70], llIIIIlIII[4]);
        bv = new ArrayList<d>();
        String[] stringArray = new String[llIIIIlIII[23]];
        stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[71]];
        stringArray[K.llIIIIlIII[3]] = llIIIIIlll[llIIIIlIII[72]];
        stringArray[K.llIIIIlIII[1]] = llIIIIIlll[llIIIIlIII[73]];
        stringArray[K.llIIIIlIII[12]] = llIIIIIlll[llIIIIlIII[74]];
        stringArray[K.llIIIIlIII[7]] = llIIIIIlll[llIIIIlIII[75]];
        stringArray[K.llIIIIlIII[15]] = llIIIIIlll[llIIIIlIII[76]];
        stringArray[K.llIIIIlIII[17]] = llIIIIIlll[llIIIIlIII[77]];
        stringArray[K.llIIIIlIII[8]] = llIIIIIlll[llIIIIlIII[78]];
        cE = stringArray;
    }

    private static boolean lIlIIIlllIlIl(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return llIIIIlIII[4];
    }

        return String.valueOf(var1);
    }

    @Override
    public int af() {
        try {
            System.out.println("678: " + e.j(llIIIIlIII[5]));
            K.cy();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 == ((0xAE ^ 0xA9 ^ (0x1D ^ 0x4E)) & (195 + 82 - 275 + 194 ^ 37 + 92 - 15 + 30 ^ -1))) {
            return (69 + 58 - 47 + 90 ^ 74 + 16 - -37 + 25) & (0xCF ^ 0xA6 ^ (0x55 ^ 0xE) ^ -1);
        }
        return llIIIIlIII[57];
    }

    private static void Q() {
        block16: {
            d var2;
            block15: {
                Object var3;
                block14: {
                    block13: {
                        int[] nArray = new int[llIIIIlIII[3]];
                        nArray[K.llIIIIlIII[4]] = llIIIIlIII[19];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(llIIIIlIII[19], llIIIIlIII[2], j.cf);
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[llIIIIlIII[3]];
                        nArray2[K.llIIIIlIII[4]] = llIIIIlIII[11];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var3 = new DHelper(llIIIIlIII[11], llIIIIlIII[3], llIIIIlIII[51]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray3 = new int[llIIIIlIII[3]];
                        nArray3[K.llIIIIlIII[4]] = llIIIIlIII[14];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var3 = new DHelper(llIIIIlIII[14], llIIIIlIII[3], llIIIIlIII[51]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray4 = new int[llIIIIlIII[3]];
                        nArray4[K.llIIIIlIII[4]] = llIIIIlIII[18];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var3 = new DHelper(llIIIIlIII[18], llIIIIlIII[3], llIIIIlIII[51]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray5 = new int[llIIIIlIII[3]];
                        nArray5[K.llIIIIlIII[4]] = llIIIIlIII[16];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var3 = new DHelper(llIIIIlIII[16], llIIIIlIII[3], llIIIIlIII[51]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray6 = new int[llIIIIlIII[3]];
                        nArray6[K.llIIIIlIII[4]] = llIIIIlIII[13];
                        if (K.lIlIIIlllIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var3 = new DHelper(llIIIIlIII[13], llIIIIlIII[3], llIIIIlIII[52]);
                            bv.add((DHelper) ar3);

                        }
                        int[] nArray7 = new int[llIIIIlIII[3]];
                        nArray7[K.llIIIIlIII[4]] = llIIIIlIII[10];
                        if (!K.lIlIIIlllIIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block13;
                        int[] nArray8 = new int[llIIIIlIII[3]];
                        nArray8[K.llIIIIlIII[4]] = llIIIIlIII[10];
                        if (!K.lIlIIIlllIIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                        int[] nArray9 = new int[llIIIIlIII[3]];
                        nArray9[K.llIIIIlIII[4]] = llIIIIlIII[10];
                        if (!K.lIlIIIlllIIII(Bank.getFirst((int[])nArray9).getQuantity(), llIIIIlIII[2])) break block14;
                    }
                    var3 = new DHelper(llIIIIlIII[10], llIIIIlIII[2], llIIIIlIII[53]);
                    bv.add((DHelper) ar3);

                }
                if (K.lIlIIIlllIlII(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(llIIIIIlll[llIIIIlIII[59]]))) ? 1 : 0)) {
                    var2 = new DHelper(llIIIIlIII[54], llIIIIlIII[15], llIIIIlIII[55]);
                    bv.add(var2);

                }
                int[] nArray = new int[llIIIIlIII[3]];
                nArray[K.llIIIIlIII[4]] = llIIIIlIII[9];
                if (!K.lIlIIIlllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                int[] nArray10 = new int[llIIIIlIII[3]];
                nArray10[K.llIIIIlIII[4]] = llIIIIlIII[9];
                if (!K.lIlIIIlllIIll(Bank.contains((int[])nArray10) ? 1 : 0)) break block16;
                int[] nArray11 = new int[llIIIIlIII[3]];
                nArray11[K.llIIIIlIII[4]] = llIIIIlIII[9];
                if (!K.lIlIIIlllIIII(Bank.getFirst((int[])nArray11).getQuantity(), llIIIIlIII[2])) break block16;
            }
            var2 = new DHelper(llIIIIlIII[9], llIIIIlIII[56], llIIIIlIII[52]);
            bv.add(var2);

        }
    }

    public static void cz() {
        String[] stringArray = new String[llIIIIlIII[3]];
        stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[46]];
        if (K.lIlIIIllllIIl(NPCs.getNearest((String[])stringArray))) {
            if (K.lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                if (K.lIlIIIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)gk);

                Time.sleepTicks((int)llIIIIlIII[3]);

            }
            if (K.lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[47]];
                String[] stringArray2 = new String[llIIIIlIII[3]];
                stringArray2[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[48]];
                TileObjects.getNearest((String[])stringArray2).interact(llIIIIIlll[llIIIIlIII[0]]);
                Time.sleepTicks((int)llIIIIlIII[1]);

            }
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (K.lIlIIIllllIlI(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            bl = llIIIIlIII[3];

            }
        } else {
            bl = llIIIIlIII[4];
        }
        return bl;
    }

    private static boolean lIlIIIlllIIII(int n2, int n3) {
        return n2 < n3;
    }

    public static void cy() {
        if (K.lIlIIIlllIIII(e.j(llIIIIlIII[0]), llIIIIlIII[1])) {
            Q.ds();
        }
        if (K.lIlIIIlllIIII(Skills.getLevel((Skill)Skill.COOKING), llIIIIlIII[2]) && K.lIlIIIlllIIIl(e.j(llIIIIlIII[0]), llIIIIlIII[1])) {
            ax.gz();
        }
        if (K.lIlIIIlllIIlI(Skills.getLevel((Skill)Skill.COOKING), llIIIIlIII[2]) && K.lIlIIIlllIIIl(e.j(llIIIIlIII[0]), llIIIIlIII[1])) {
            if (K.lIlIIIlllIIll(bt ? 1 : 0)) {
                b.a(bv);
                if (K.lIlIIIlllIIII(bv.size(), llIIIIlIII[3])) {
                    System.out.println(llIIIIIlll[llIIIIlIII[4]]);
                    bt = llIIIIlIII[4];
                }
            }
            if (K.lIlIIIlllIlII(bt ? 1 : 0)) {
                BankLocation var4;
                if (K.lIlIIIlllIlII(K.an() ? 1 : 0) && K.lIlIIIlllIlII(e.j(llIIIIlIII[5]))) {
                    var4 = BankLocation.getNearest();
                    if (K.lIlIIIlllIlIl(var4) && K.lIlIIIlllIlII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[3]];
                        a.a(var4);
                    }
                    if (K.lIlIIIlllIlIl(var4) && K.lIlIIIlllIIll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (K.lIlIIIlllIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIlIII[6]);

                        }
                        if (K.lIlIIIlllIIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[1]];
                            if (K.lIlIIIlllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIIIlIII[7]);

                            }
                            if (K.lIlIIIlllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIIIlIII[1]);

                            }
                            int[] nArray = new int[llIIIIlIII[8]];
                            nArray[K.llIIIIlIII[4]] = llIIIIlIII[9];
                            nArray[K.llIIIIlIII[3]] = llIIIIlIII[10];
                            nArray[K.llIIIIlIII[1]] = llIIIIlIII[11];
                            nArray[K.llIIIIlIII[12]] = llIIIIlIII[13];
                            nArray[K.llIIIIlIII[7]] = llIIIIlIII[14];
                            nArray[K.llIIIIlIII[15]] = llIIIIlIII[16];
                            nArray[K.llIIIIlIII[17]] = llIIIIlIII[18];
                            if (K.lIlIIIlllIlII(e.c(nArray) ? 1 : 0)) {
                                K.Q();
                                System.out.println(llIIIIIlll[llIIIIlIII[12]]);
                                bt = llIIIIlIII[3];
                                return;
                            }
                            int[] nArray2 = new int[llIIIIlIII[8]];
                            nArray2[K.llIIIIlIII[4]] = llIIIIlIII[9];
                            nArray2[K.llIIIIlIII[3]] = llIIIIlIII[10];
                            nArray2[K.llIIIIlIII[1]] = llIIIIlIII[11];
                            nArray2[K.llIIIIlIII[12]] = llIIIIlIII[13];
                            nArray2[K.llIIIIlIII[7]] = llIIIIlIII[14];
                            nArray2[K.llIIIIlIII[15]] = llIIIIlIII[16];
                            nArray2[K.llIIIIlIII[17]] = llIIIIlIII[18];
                            if (K.lIlIIIlllIIll(e.c(nArray2) ? 1 : 0)) {
                                a.a(llIIIIlIII[9], llIIIIlIII[2]);
                                a.a(llIIIIlIII[10], llIIIIlIII[2]);
                                a.a(llIIIIlIII[11], llIIIIlIII[3]);
                                a.a(llIIIIlIII[13], llIIIIlIII[3]);
                                a.a(llIIIIlIII[14], llIIIIlIII[3]);
                                a.a(llIIIIlIII[16], llIIIIlIII[3]);
                                a.a(llIIIIlIII[18], llIIIIlIII[3]);
                                a.a(llIIIIlIII[19], llIIIIlIII[1]);
                                a.a(llIIIIlIII[20], llIIIIlIII[6]);
                            }
                        }
                    }
                }
                if (K.lIlIIIlllIIll(Inventory.contains((int[])f.ba) ? 1 : 0) && K.lIlIIIlllIIII(Movement.getRunEnergy(), llIIIIlIII[21])) {
                    Inventory.getFirst((int[])f.ba).interact(llIIIIIlll[llIIIIlIII[7]]);
                    Time.sleepTicks((int)llIIIIlIII[3]);

                }
                if (K.lIlIIIlllIlII(e.j(llIIIIlIII[5])) && K.lIlIIIlllIIll(K.an() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[15]];
                    if (K.lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                        if (K.lIlIIIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)gk);

                        Time.sleepTicks((int)llIIIIlIII[3]);

                    }
                    if (K.lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                        AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[17]];
                        g.a(llIIIIIlll[llIIIIlIII[8]], cE);
                    }
                }
                if (K.lIlIIIlllIIIl(e.j(llIIIIlIII[5]), llIIIIlIII[3])) {
                    int[] nArray = new int[llIIIIlIII[3]];
                    nArray[K.llIIIIlIII[4]] = llIIIIlIII[22];
                    if (K.lIlIIIlllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[llIIIIlIII[3]];
                        stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[23]];
                        if (K.lIlIIIlllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            di = llIIIIlIII[4];
                            if (K.lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gl), llIIIIlIII[7])) {
                                AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[24]];
                                var4 = new WorldArea(llIIIIlIII[25], llIIIIlIII[26], llIIIIlIII[27], llIIIIlIII[28], llIIIIlIII[4]);
                                if (K.lIlIIIlllIlII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (K.lIlIIIlllIIll(Inventory.contains(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[66]])) ? 1 : 0) && K.lIlIIIlllIlII(Equipment.contains(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[56]])) ? 1 : 0)) {
                                        Inventory.getFirst(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[65]])).interact(llIIIIIlll[llIIIIlIII[2]]);
                                    }
                                    if (K.lIlIIIlllIIll(Equipment.contains(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[64]])) ? 1 : 0) && K.lIlIIIlllIIIl(Players.getLocal().getAnimation(), llIIIIlIII[29])) {
                                        Equipment.getFirst(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[63]])).interact(llIIIIIlll[llIIIIlIII[30]]);
                                        Time.sleepTicks((int)llIIIIlIII[7]);

                                    }
                                }
                                if (K.lIlIIIlllIIll(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)gl);

                                    Time.sleepTicks((int)llIIIIlIII[3]);

                                }
                            }
                            if (K.lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gl), llIIIIlIII[7])) {
                                AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[31]];
                                if (K.lIlIIIlllIIll(Widgets.get((int)llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray2 = new String[llIIIIlIII[3]];
                                    stringArray2[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[33]];
                                    NPCs.getNearest((String[])stringArray2).interact(llIIIIIlll[llIIIIlIII[34]]);
                                    Time.sleepTicks((int)llIIIIlIII[12]);

                                }
                                if (K.lIlIIIlllIlII(Widgets.get((int)llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)llIIIIlIII[32], (int)llIIIIlIII[35], (int)llIIIIlIII[3]).interact(llIIIIIlll[llIIIIlIII[36]]);
                                    Time.sleepTicks((int)llIIIIlIII[1]);

                                }
                                int[] nArray3 = new int[llIIIIlIII[3]];
                                nArray3[K.llIIIIlIII[4]] = llIIIIlIII[22];
                                if (K.lIlIIIlllIIll(Inventory.contains((int[])nArray3) ? 1 : 0) && K.lIlIIIlllIlII(Widgets.get((int)llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)llIIIIlIII[32], (int)llIIIIlIII[3], (int)llIIIIlIII[30]).interact(llIIIIIlll[llIIIIlIII[35]]);
                                    Time.sleepTicks((int)llIIIIlIII[3]);

                                }
                            }
                        }
                    }
                    int[] nArray4 = new int[llIIIIlIII[3]];
                    nArray4[K.llIIIIlIII[4]] = llIIIIlIII[22];
                    if (K.lIlIIIlllIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        String[] stringArray = new String[llIIIIlIII[3]];
                        stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[37]];
                        if (K.lIlIIIlllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            int[] nArray5 = new int[llIIIIlIII[3]];
                            nArray5[K.llIIIIlIII[4]] = llIIIIlIII[22];
                            if (K.lIlIIIlllIIll(Inventory.contains((int[])nArray5) ? 1 : 0) && K.lIlIIIlllIlII(Widgets.get((int)llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get((int)llIIIIlIII[32], (int)llIIIIlIII[3], (int)llIIIIlIII[30]).interact(llIIIIIlll[llIIIIlIII[38]]);
                                Time.sleepTicks((int)llIIIIlIII[3]);

                            }
                            int[] nArray6 = new int[llIIIIlIII[3]];
                            nArray6[K.llIIIIlIII[4]] = llIIIIlIII[18];
                            String[] stringArray3 = new String[llIIIIlIII[3]];
                            stringArray3[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[39]];
                            Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((String[])stringArray3));
                            Time.sleepTicks((int)llIIIIlIII[1]);

                        }
                    }
                    String[] stringArray = new String[llIIIIlIII[3]];
                    stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[40]];
                    if (K.lIlIIIlllIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (K.lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                            if (K.lIlIIIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (K.lIlIIIlllIIll(Inventory.contains(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[62]])) ? 1 : 0) && K.lIlIIIlllIlII(Equipment.contains(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[61]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(llIIIIIlll[llIIIIlIII[60]])).interact(llIIIIIlll[llIIIIlIII[41]]);
                                Time.sleepTicks((int)llIIIIlIII[1]);

                            }
                            Movement.walkTo((WorldPoint)gk);

                            Time.sleepTicks((int)llIIIIlIII[3]);

                        }
                        if (K.lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                            AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[42]];
                            if (K.lIlIIIlllIIII(di, llIIIIlIII[3])) {
                                aN.rB += llIIIIlIII[3];
                                aN.u(AccBuilderSotf.m);
                                di += llIIIIlIII[3];
                                aN.rB = llIIIIlIII[4];
                                dj = llIIIIlIII[4];
                            }
                            g.a(llIIIIIlll[llIIIIlIII[43]], cE);
                        }
                    }
                }
                if (K.lIlIIIlllIIIl(e.j(llIIIIlIII[5]), llIIIIlIII[1])) {
                    String[] stringArray = new String[llIIIIlIII[3]];
                    stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[44]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIIIIlll[llIIIIlIII[45]]);
                    Time.sleepTicks((int)llIIIIlIII[1]);

                }
            }
        }
    }

    private static boolean lIlIIIlllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIllllIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIllllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIlllIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llIIIIIlll[llIIIIlIII[58]];
    }

    private static boolean lIlIIIlllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIlllIllI(int n2) {
        return n2 > 0;
    }

    private static void lIlIIIllIlllI() {
        llIIIIIlll = new String[llIIIIlIII[21]];
        K.llIIIIIlll[K.llIIIIlIII[4]] = "Finished buying items, switching back to quest";
        K.llIIIIIlll[K.llIIIIlIII[3]] = "Nav to bank";
        K.llIIIIIlll[K.llIIIIlIII[1]] = "Handling banking";
        K.llIIIIIlll[K.llIIIIlIII[12]] = "We are missing quest supplies, switching to BUYING";
        K.llIIIIIlll[K.llIIIIlIII[7]] = "Drink";
        K.llIIIIIlll[K.llIIIIlIII[15]] = "Nav to start";
        K.llIIIIIlll[K.llIIIIlIII[17]] = "Handling dialog";
        K.llIIIIIlll[K.llIIIIlIII[8]] = "Cook";
        K.llIIIIIlll[K.llIIIIlIII[23]] = "Dirty blast";
        K.llIIIIIlll[K.llIIIIlIII[24]] = "Nav to rotten tomato";
        K.llIIIIIlll[K.llIIIIlIII[2]] = "Wear";
        K.llIIIIIlll[K.llIIIIlIII[30]] = "PvP Arena";
        K.llIIIIIlll[K.llIIIIlIII[31]] = "Getting tomato";
        K.llIIIIIlll[K.llIIIIlIII[33]] = "Fadli";
        K.llIIIIIlll[K.llIIIIlIII[34]] = "Buy";
        K.llIIIIIlll[K.llIIIIlIII[36]] = "Buy 1";
        K.llIIIIIlll[K.llIIIIlIII[35]] = "Close";
        K.llIIIIIlll[K.llIIIIlIII[37]] = "Dirty blast";
        K.llIIIIIlll[K.llIIIIlIII[38]] = "Close";
        K.llIIIIIlll[K.llIIIIlIII[39]] = "Fruit blast";
        K.llIIIIIlll[K.llIIIIlIII[40]] = "Dirty blast";
        K.llIIIIIlll[K.llIIIIlIII[41]] = "Wear";
        K.llIIIIIlll[K.llIIIIlIII[42]] = "Handling dialog";
        K.llIIIIIlll[K.llIIIIlIII[43]] = "Cook";
        K.llIIIIIlll[K.llIIIIlIII[44]] = "Door";
        K.llIIIIIlll[K.llIIIIlIII[45]] = "Open";
        K.llIIIIIlll[K.llIIIIlIII[46]] = "Aris";
        K.llIIIIIlll[K.llIIIIlIII[47]] = "Entering room";
        K.llIIIIIlll[K.llIIIIlIII[48]] = "Door";
        K.llIIIIIlll[K.llIIIIlIII[0]] = "Open";
        K.llIIIIIlll[K.llIIIIlIII[49]] = "Eye of newt";
        K.llIIIIIlll[K.llIIIIlIII[50]] = "Fruit blast";
        K.llIIIIIlll[K.llIIIIlIII[58]] = "RFD start quest";
        K.llIIIIIlll[K.llIIIIlIII[59]] = "ring of wealth (";
        K.llIIIIIlll[K.llIIIIlIII[60]] = "dueling";
        K.llIIIIIlll[K.llIIIIlIII[61]] = "dueling";
        K.llIIIIIlll[K.llIIIIlIII[62]] = "dueling";
        K.llIIIIIlll[K.llIIIIlIII[63]] = "dueling";
        K.llIIIIIlll[K.llIIIIlIII[64]] = "dueling";
        K.llIIIIIlll[K.llIIIIlIII[65]] = "dueling";
        K.llIIIIIlll[K.llIIIIlIII[56]] = "dueling";
        K.llIIIIIlll[K.llIIIIlIII[66]] = "dueling";
        K.llIIIIIlll[K.llIIIIlIII[71]] = "Can you make me a cake?";
        K.llIIIIIlll[K.llIIIIlIII[72]] = "I'm always happy to help a cook in distress.";
        K.llIIIIIlll[K.llIIIIlIII[73]] = "Actually, I know where to find this stuff.";
        K.llIIIIIlll[K.llIIIIlIII[74]] = "Yes.";
        K.llIIIIIlll[K.llIIIIlIII[75]] = "What's wrong?";
        K.llIIIIIlll[K.llIIIIlIII[76]] = "Do you have any other quests for me?";
        K.llIIIIIlll[K.llIIIIlIII[77]] = "Angry! It makes me angry!";
        K.llIIIIIlll[K.llIIIIlIII[78]] = "What seems to be the problem?";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llIIIIlIII[3]];
        stringArray[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[49]];
        if (K.lIlIIIlllIllI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llIIIIlIII[3]];
            nArray[K.llIIIIlIII[4]] = llIIIIlIII[14];
            if (K.lIlIIIlllIllI(Inventory.getCount((int[])nArray))) {
                String[] stringArray2 = new String[llIIIIlIII[3]];
                stringArray2[K.llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[50]];
                if (K.lIlIIIlllIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    int[] nArray2 = new int[llIIIIlIII[3]];
                    nArray2[K.llIIIIlIII[4]] = llIIIIlIII[18];
                    if (K.lIlIIIlllIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[llIIIIlIII[3]];
                        nArray3[K.llIIIIlIII[4]] = llIIIIlIII[11];
                        if (K.lIlIIIlllIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            n2 = llIIIIlIII[3];

                            if ((0x5F ^ 0x23 ^ (0xEA ^ 0x92)) == (0x4F ^ 5 ^ (0xC5 ^ 0x8B))) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = llIIIIlIII[4];
        return n2 != 0;
    }

    private static boolean lIlIIIllllIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIIlllIIIl(int n2, int n3) {
        return n2 == n3;
    }
}

