/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
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
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;

public class AZHelper
implements ac {
    private static  WorldPoint oJ;
    private static  WorldPoint oK;
    public static  WorldArea oI;

    public static  List<d> bv;
    
    public static  boolean bt;

    public static void Q() {
        d var1;
        Object var2;
        int[] nArray = new int[llIIIIIlIl[1]];
        nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[6];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIIIIIlIl[6], llIIIIIlIl[1], llIIIIIlIl[4]);
            bv.add(d2);

        }
        int[] nArray2 = new int[llIIIIIlIl[1]];
        nArray2[az.llIIIIIlIl[0]] = llIIIIIlIl[8];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(llIIIIIlIl[8], llIIIIIlIl[1], llIIIIIlIl[4]);
            bv.add((DHelper) ar2);

        }
        int[] nArray3 = new int[llIIIIIlIl[1]];
        nArray3[az.llIIIIIlIl[0]] = llIIIIIlIl[10];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(llIIIIIlIl[10], llIIIIIlIl[1], llIIIIIlIl[63]);
            bv.add((DHelper) ar2);

        }
        int[] nArray4 = new int[llIIIIIlIl[1]];
        nArray4[az.llIIIIIlIl[0]] = llIIIIIlIl[14];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new DHelper(llIIIIIlIl[14], llIIIIIlIl[64], llIIIIIlIl[65]);
            bv.add((DHelper) ar2);

        }
        int[] nArray5 = new int[llIIIIIlIl[1]];
        nArray5[az.llIIIIIlIl[0]] = llIIIIIlIl[12];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var2 = new DHelper(llIIIIIlIl[12], llIIIIIlIl[66], llIIIIIlIl[7]);
            bv.add((DHelper) ar2);

        }
        int[] nArray6 = new int[llIIIIIlIl[1]];
        nArray6[az.llIIIIIlIl[0]] = llIIIIIlIl[67];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var2 = new DHelper(llIIIIIlIl[67], llIIIIIlIl[1], llIIIIIlIl[4]);
            bv.add((DHelper) ar2);

        }
        int[] nArray7 = new int[llIIIIIlIl[1]];
        nArray7[az.llIIIIIlIl[0]] = llIIIIIlIl[24];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var2 = new DHelper(llIIIIIlIl[24], llIIIIIlIl[16], llIIIIIlIl[4]);
            bv.add((DHelper) ar2);

        }
        if (az.lIlIIIllIIlII(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(llIIIIIlII[llIIIIIlIl[75]]))) ? 1 : 0)) {
            var1 = new DHelper(llIIIIIlIl[68], llIIIIIlIl[7], llIIIIIlIl[69]);
            bv.add(var1);

        }
        int[] nArray8 = new int[llIIIIIlIl[1]];
        nArray8[az.llIIIIIlIl[0]] = llIIIIIlIl[70];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var1 = new DHelper(llIIIIIlIl[70], llIIIIIlIl[54], llIIIIIlIl[71]);
            bv.add(var1);

        }
    }

    public static void gH() {
        block36: {
            BankLocation var3;
            block37: {
                block44: {
                    block39: {
                        block43: {
                            block42: {
                                block41: {
                                    block40: {
                                        block38: {
                                            if (az.lIlIIIllIIIlI(bt ? 1 : 0)) {
                                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[0]];
                                                b.a(bv);
                                                if (az.lIlIIIllIIIll(bv.size(), llIIIIIlIl[1])) {
                                                    System.out.println(llIIIIIlII[llIIIIIlIl[1]]);
                                                    bt = llIIIIIlIl[0];
                                                }
                                            }
                                            if (!az.lIlIIIllIIlII(bt ? 1 : 0)) break block36;
                                            if (!az.lIlIIIllIIlII(az.an() ? 1 : 0)) break block37;
                                            var3 = BankLocation.getNearest();
                                            if (az.lIlIIIllIIlIl(var3) && az.lIlIIIllIIlII(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[2]];
                                                a.a(var3);
                                            }
                                            if (!az.lIlIIIllIIlIl(var3) || !az.lIlIIIllIIIlI(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block37;
                                            if (az.lIlIIIllIIlII(Bank.isOpen() ? 1 : 0)) {
                                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[3]];
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIIlIl[4]);

                                            }
                                            if (!az.lIlIIIllIIIlI(Bank.isOpen() ? 1 : 0)) break block37;
                                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[5]];
                                            if (az.lIlIIIllIIllI(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)llIIIIIlIl[5]);

                                            }
                                            if (az.lIlIIIllIIllI(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)llIIIIIlIl[2]);

                                            }
                                            int[] nArray = new int[llIIIIIlIl[1]];
                                            nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[6];
                                            if (!az.lIlIIIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                            String[] stringArray = new String[llIIIIIlIl[1]];
                                            stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[7]];
                                            if (!az.lIlIIIllIIlll(Inventory.getCount((String[])stringArray), llIIIIIlIl[1])) break block39;
                                        }
                                        int[] nArray = new int[llIIIIIlIl[1]];
                                        nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[8];
                                        if (!az.lIlIIIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block40;
                                        String[] stringArray = new String[llIIIIIlIl[1]];
                                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[9]];
                                        if (!az.lIlIIIllIIlll(Inventory.getCount((String[])stringArray), llIIIIIlIl[1])) break block39;
                                    }
                                    int[] nArray = new int[llIIIIIlIl[1]];
                                    nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[10];
                                    if (!az.lIlIIIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                    String[] stringArray = new String[llIIIIIlIl[1]];
                                    stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[11]];
                                    if (!az.lIlIIIllIIlll(Inventory.getCount((String[])stringArray), llIIIIIlIl[1])) break block39;
                                }
                                int[] nArray = new int[llIIIIIlIl[1]];
                                nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[12];
                                if (!az.lIlIIIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block42;
                                String[] stringArray = new String[llIIIIIlIl[1]];
                                stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[13]];
                                if (!az.lIlIIIllIIlll(Inventory.getCount((String[])stringArray), llIIIIIlIl[1])) break block39;
                            }
                            int[] nArray = new int[llIIIIIlIl[1]];
                            nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[14];
                            if (!az.lIlIIIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                            String[] stringArray = new String[llIIIIIlIl[1]];
                            stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[15]];
                            if (!az.lIlIIIllIIlll(Inventory.getCount((String[])stringArray), llIIIIIlIl[1])) break block39;
                        }
                        if ((!az.lIlIIIllIIlII(Bank.contains((int[])f.aT) ? 1 : 0) || az.lIlIIIllIIlll(Inventory.getCount((int[])f.aT), llIIIIIlIl[1])) && !az.lIlIIIllIIIlI(Equipment.contains((int[])f.aT) ? 1 : 0)) break block44;
                    }
                    az.Q();
                    System.out.println(llIIIIIlII[llIIIIIlIl[16]]);
                    bt = llIIIIIlIl[1];
                    return;
                }
                int[] nArray = new int[llIIIIIlIl[1]];
                nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[6];
                if (az.lIlIIIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)llIIIIIlII[llIIIIIlIl[17]], (int)llIIIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIIIIIlIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[82]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];

                            if (3 > 3) {
                                return false;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);

                }
                int[] nArray2 = new int[llIIIIIlIl[1]];
                nArray2[az.llIIIIIlIl[0]] = llIIIIIlIl[8];
                if (az.lIlIIIllIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    Bank.withdraw((String)llIIIIIlII[llIIIIIlIl[18]], (int)llIIIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIIIIIlIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[81]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];

                            if (2 <= 0) {
                                return ((76 + 163 - 147 + 116 ^ 112 + 159 - 116 + 38) & (0xDA ^ 0x8A ^ (0xE4 ^ 0xA5) ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);

                }
                int[] nArray3 = new int[llIIIIIlIl[1]];
                nArray3[az.llIIIIIlIl[0]] = llIIIIIlIl[10];
                if (az.lIlIIIllIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdraw((String)llIIIIIlII[llIIIIIlIl[19]], (int)llIIIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIIIIIlIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[80]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];

                            if (((185 + 0 - -2 + 5 ^ 41 + 4 - -108 + 9) & (3 ^ 0x75 ^ (0xD0 ^ 0xC4) ^ -1)) != 0) {
                                return ((179 + 15 - 171 + 211 ^ 10 + 27 - -82 + 62) & (4 ^ 0x26 ^ (1 ^ 0x7C) ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);

                }
                int[] nArray4 = new int[llIIIIIlIl[1]];
                nArray4[az.llIIIIIlIl[0]] = llIIIIIlIl[12];
                if (az.lIlIIIllIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    Bank.withdraw((String)llIIIIIlII[llIIIIIlIl[20]], (int)llIIIIIlIl[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIIIIIlIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[79]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];

                            if (((0x65 ^ 0x4C ^ (0x67 ^ 0x5E)) & (0x1A ^ 0x59 ^ (0x2F ^ 0x7C) ^ -1)) != ((82 + 41 - 61 + 93 ^ 42 + 12 - -59 + 27) & (19 + 125 - -34 + 8 ^ 134 + 134 - 261 + 166 ^ -1))) {
                                return false;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);

                }
                int[] nArray5 = new int[llIIIIIlIl[1]];
                nArray5[az.llIIIIIlIl[0]] = llIIIIIlIl[14];
                if (az.lIlIIIllIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    Bank.withdraw((String)llIIIIIlII[llIIIIIlIl[22]], (int)llIIIIIlIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIIIIIlIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[78]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];

                            if (3 < 0) {
                                return ((0xFC ^ 0xA0 ^ (0xE1 ^ 0xA4)) & (0x75 ^ 0x70 ^ (0x6A ^ 0x76) ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);

                }
                if (az.lIlIIIllIIIlI(Bank.contains((int[])f.aT) ? 1 : 0)) {
                    a.b(f.aT, llIIIIIlIl[1]);
                }
                int[] nArray6 = new int[llIIIIIlIl[1]];
                nArray6[az.llIIIIIlIl[0]] = llIIIIIlIl[24];
                if (az.lIlIIIllIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    a.a(llIIIIIlIl[24], llIIIIIlIl[1]);
                }
            }
            if (az.lIlIIIllIIIlI(az.an() ? 1 : 0)) {
                if (az.lIlIIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (az.lIlIIIllIIIlI(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[25]];
                    System.out.println(llIIIIIlII[llIIIIIlIl[26]]);
                    Inventory.getAll((int[])oy).stream().forEach(Item::drop);
                }
                if (az.lIlIIIllIIlII(Inventory.isFull() ? 1 : 0)) {
                    if (az.lIlIIIllIIIll(Skills.getLevel((Skill)Skill.FISHING), llIIIIIlIl[27])) {
                        if (az.lIlIIIllIIIll(Skills.getLevel((Skill)Skill.FISHING), llIIIIIlIl[7])) {
                            if (az.lIlIIIllIIlII(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && az.lIlIIIllIlIII(Players.getLocal().getWorldLocation().distanceTo(oJ), llIIIIIlIl[7])) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[28]];
                                if (az.lIlIIIllIIIlI(Inventory.contains((int[])f.aT) ? 1 : 0)) {
                                    Inventory.getFirst((int[])f.aT).interact(llIIIIIlII[llIIIIIlIl[29]]);
                                }
                                Movement.walkTo((WorldPoint)oJ);

                                Time.sleepTicks((int)llIIIIIlIl[1]);

                            }
                            if (az.lIlIIIllIIIlI(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[27]];
                                if (az.lIlIIIllIlIIl(Players.getLocal().getAnimation(), llIIIIIlIl[30])) {
                                    int[] nArray = new int[llIIIIIlIl[1]];
                                    nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[31];
                                    var3 = NPCs.getNearest((int[])nArray);
                                    if (az.lIlIIIllIIlIl(var3) && az.lIlIIIllIIIlI(oI.contains((Locatable)var3) ? 1 : 0)) {
                                        int[] nArray7 = new int[llIIIIIlIl[1]];
                                        nArray7[az.llIIIIIlIl[0]] = llIIIIIlIl[31];
                                        NPCs.getNearest((int[])nArray7).interact(llIIIIIlIl[0]);
                                        Time.sleepTicks((int)llIIIIIlIl[2]);

                                    }
                                }
                            }
                        }
                        if (az.lIlIIIllIIlll(Skills.getLevel((Skill)Skill.FISHING), llIIIIIlIl[7]) && az.lIlIIIllIIIll(Skills.getLevel((Skill)Skill.FISHING), llIIIIIlIl[27])) {
                            if (az.lIlIIIllIIlII(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[32]];
                                Movement.walkTo((WorldPoint)oJ);

                                Time.sleepTicks((int)llIIIIIlIl[1]);

                            }
                            if (az.lIlIIIllIIIlI(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[33]];
                                if (az.lIlIIIllIlIIl(Players.getLocal().getAnimation(), llIIIIIlIl[30])) {
                                    int[] nArray = new int[llIIIIIlIl[1]];
                                    nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[31];
                                    var3 = NPCs.getNearest((int[])nArray);
                                    if (az.lIlIIIllIIlIl(var3) && az.lIlIIIllIIIlI(oI.contains((Locatable)var3) ? 1 : 0)) {
                                        int[] nArray8 = new int[llIIIIIlIl[1]];
                                        nArray8[az.llIIIIIlIl[0]] = llIIIIIlIl[31];
                                        NPCs.getNearest((int[])nArray8).interact(llIIIIIlII[llIIIIIlIl[34]]);
                                        Time.sleepTicks((int)llIIIIIlIl[2]);

                                    }
                                }
                            }
                        }
                    }
                    if (az.lIlIIIllIIlll(Skills.getLevel((Skill)Skill.FISHING), llIIIIIlIl[27])) {
                        if (az.lIlIIIllIlIII(Players.getLocal().getWorldLocation().distanceTo(oK), llIIIIIlIl[22])) {
                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[35]];
                            Movement.walkTo((WorldPoint)oK);

                            Time.sleepTicks((int)llIIIIIlIl[1]);

                        }
                        if (az.lIlIIIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(oK), llIIIIIlIl[22])) {
                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[36]];
                            if (az.lIlIIIllIlIIl(Players.getLocal().getAnimation(), llIIIIIlIl[30]) && az.lIlIIIllIIlIl(NPCs.getNearest(nPC -> {
                                int n2;
                                if (az.lIlIIIllIlIIl(nPC.getId(), llIIIIIlIl[77]) && az.lIlIIIllIlIlI(nPC.getWorldLocation().distanceTo(oK), llIIIIIlIl[22])) {
                                    n2 = llIIIIIlIl[1];

                                    }
                                } else {
                                    n2 = llIIIIIlIl[0];
                                }
                                return n2 != 0;
                            }))) {
                                NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (az.lIlIIIllIlIIl(nPC.getId(), llIIIIIlIl[77]) && az.lIlIIIllIlIlI(nPC.getWorldLocation().distanceTo(oK), llIIIIIlIl[22])) {
                                        n2 = llIIIIIlIl[1];

                                        }
                                    } else {
                                        n2 = llIIIIIlIl[0];
                                    }
                                    return n2 != 0;
                                }).interact(llIIIIIlII[llIIIIIlIl[37]]);
                                Time.sleepTicks((int)llIIIIIlIl[2]);

                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public String ag() {
        return llIIIIIlII[llIIIIIlIl[73]];
    }

    private static boolean lIlIIIllIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIllIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int af() {
        az.gH();
        return llIIIIIlIl[72];
    }

    private static boolean lIlIIIllIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ae() {
        return llIIIIIlIl[0];
    }

        return String.valueOf(var4);
    }

    static {
        az.lIlIIIllIIIIl();
        az.lIlIIIlIlllIl();
        oI = new WorldArea(llIIIIIlIl[83], llIIIIIlIl[84], llIIIIIlIl[29], llIIIIIlIl[39], llIIIIIlIl[0]);
        bv = new ArrayList<d>();
        oJ = new WorldPoint(llIIIIIlIl[85], llIIIIIlIl[86], llIIIIIlIl[0]);
        oK = new WorldPoint(llIIIIIlIl[87], llIIIIIlIl[88], llIIIIIlIl[0]);
        int[] nArray = new int[llIIIIIlIl[17]];
        nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[89];
        nArray[az.llIIIIIlIl[1]] = llIIIIIlIl[90];
        nArray[az.llIIIIIlIl[2]] = llIIIIIlIl[91];
        nArray[az.llIIIIIlIl[3]] = llIIIIIlIl[92];
        nArray[az.llIIIIIlIl[5]] = llIIIIIlIl[93];
        nArray[az.llIIIIIlIl[7]] = llIIIIIlIl[94];
        nArray[az.llIIIIIlIl[9]] = llIIIIIlIl[95];
        nArray[az.llIIIIIlIl[11]] = llIIIIIlIl[96];
        nArray[az.llIIIIIlIl[13]] = llIIIIIlIl[97];
        nArray[az.llIIIIIlIl[15]] = llIIIIIlIl[98];
        nArray[az.llIIIIIlIl[16]] = llIIIIIlIl[99];
        oy = nArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        String[] stringArray = new String[llIIIIIlIl[1]];
        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[58]];
        if (az.lIlIIIllIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[llIIIIIlIl[1]];
            stringArray2[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[59]];
            if (az.lIlIIIllIIIlI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[llIIIIIlIl[1]];
                stringArray3[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[60]];
                if (az.lIlIIIllIIIlI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[llIIIIIlIl[1]];
                    stringArray4[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[61]];
                    if (az.lIlIIIllIIIlI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        String[] stringArray5 = new String[llIIIIIlIl[1]];
                        stringArray5[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[62]];
                        if (az.lIlIIIllIIIlI(Inventory.contains((String[])stringArray5) ? 1 : 0) && (!az.lIlIIIllIIlII(Inventory.contains((int[])f.aT) ? 1 : 0) || az.lIlIIIllIIIlI(Equipment.contains((int[])f.aT) ? 1 : 0))) {
                            n2 = llIIIIIlIl[1];

                            if (null == null) return n2 != 0;
                            return ((0xE ^ 0x7D ^ (0x51 ^ 0x63)) & (102 + 109 - 93 + 14 ^ 194 + 105 - 248 + 146 ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = llIIIIIlIl[0];
        return n2 != 0;
    }

    public static boolean gK() {
        int n2;
        String[] stringArray = new String[llIIIIIlIl[1]];
        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[57]];
        if (az.lIlIIIllIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0) && (!az.lIlIIIllIIlII(Inventory.contains((int[])f.aT) ? 1 : 0) || az.lIlIIIllIIIlI(Equipment.contains((int[])f.aT) ? 1 : 0))) {
            n2 = llIIIIIlIl[1];

            if (((0x45 ^ 0x42) & ~(0x42 ^ 0x45) & ~((1 ^ 0x36) & ~(0xF1 ^ 0xC6))) != 0) {
                return false;
            }
        } else {
            n2 = llIIIIIlIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIlIIIllIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (az.lIlIIIllIIlll(Skills.getLevel((Skill)Skill.FISHING), llIIIIIlIl[74])) {
            bl = llIIIIIlIl[1];

            if (((0x13 ^ 0x43 ^ (0xC6 ^ 0x8F)) & (0x66 ^ 0x2C ^ (0x13 ^ 0x40) ^ -1)) != 0) {
                return ((141 + 1 - 53 + 92 ^ 133 + 103 - 224 + 144) & (0xA2 ^ 0x9A ^ (0x54 ^ 0x45) ^ -1)) != 0;
            }
        } else {
            bl = llIIIIIlIl[0];
        }
        return bl;
    }

    private static boolean lIlIIIllIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIIllIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void gI() {
        if (az.lIlIIIllIIIlI(Inventory.isFull() ? 1 : 0)) {
            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[38]];
            System.out.println(llIIIIIlII[llIIIIIlIl[39]]);
            Inventory.getAll((int[])oy).stream().forEach(Item::drop);
        }
        if (az.lIlIIIllIIlII(Inventory.isFull() ? 1 : 0) && az.lIlIIIllIlIIl(Players.getLocal().getAnimation(), llIIIIIlIl[30])) {
            String[] stringArray = new String[llIIIIIlIl[1]];
            stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[40]];
            NPCs.getNearest((String[])stringArray).interact(llIIIIIlII[llIIIIIlIl[41]]);
            Time.sleepTicks((int)llIIIIIlIl[2]);

        }
    }

    private static boolean lIlIIIllIIlIl(Object object) {
        return object != null;
    }

    public static void gJ() {
        block26: {
            BankLocation var5;
            block27: {
                block30: {
                    block29: {
                        block28: {
                            if (az.lIlIIIllIIIlI(bt ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[42]];
                                b.a(bv);
                                if (az.lIlIIIllIIIll(bv.size(), llIIIIIlIl[1])) {
                                    System.out.println(llIIIIIlII[llIIIIIlIl[43]]);
                                    bt = llIIIIIlIl[0];
                                }
                            }
                            if (!az.lIlIIIllIIlII(bt ? 1 : 0)) break block26;
                            if (!az.lIlIIIllIIlII(az.gK() ? 1 : 0)) break block27;
                            var5 = BankLocation.getNearest();
                            if (az.lIlIIIllIIlIl(var5) && az.lIlIIIllIIlII(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[44]];
                                a.a(var5);
                            }
                            if (!az.lIlIIIllIIlIl(var5) || !az.lIlIIIllIIIlI(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                            if (az.lIlIIIllIIlII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[45]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIIlIl[4]);

                            }
                            if (!az.lIlIIIllIIIlI(Bank.isOpen() ? 1 : 0)) break block27;
                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[46]];
                            if (az.lIlIIIllIIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIIIIlIl[5]);

                            }
                            int[] nArray = new int[llIIIIIlIl[1]];
                            nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[6];
                            if (!az.lIlIIIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                            String[] stringArray = new String[llIIIIIlIl[1]];
                            stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[47]];
                            if (!az.lIlIIIllIIlll(Inventory.getCount((String[])stringArray), llIIIIIlIl[1])) break block29;
                        }
                        if (!az.lIlIIIllIIlII(Bank.contains((int[])f.aT) ? 1 : 0) || !az.lIlIIIllIIlII(Inventory.contains((int[])f.aT) ? 1 : 0) || !az.lIlIIIllIIlII(Equipment.contains((int[])f.aT) ? 1 : 0)) break block30;
                    }
                    az.Q();
                    System.out.println(llIIIIIlII[llIIIIIlIl[48]]);
                    bt = llIIIIIlIl[1];
                    return;
                }
                int[] nArray = new int[llIIIIIlIl[1]];
                nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[6];
                if (az.lIlIIIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)llIIIIIlII[llIIIIIlIl[49]], (int)llIIIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIIIIIlIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[76]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];

                            if ((0x5B ^ 0x5F) == -1) {
                                return false;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);

                }
                if (az.lIlIIIllIIIlI(Bank.contains((int[])f.aT) ? 1 : 0)) {
                    a.b(f.aT, llIIIIIlIl[1]);
                }
            }
            if (az.lIlIIIllIIIlI(az.gK() ? 1 : 0)) {
                if (az.lIlIIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (az.lIlIIIllIIIlI(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[llIIIIIlIl[1]];
                    nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[50];
                    if (az.lIlIIIllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        var5 = new WorldPoint(llIIIIIlIl[51], llIIIIIlIl[52], llIIIIIlIl[0]);
                        if (az.lIlIIIllIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var5), llIIIIIlIl[9])) {
                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[53]];
                            Movement.walkTo((WorldPoint)var5);

                            Time.sleepTicks((int)llIIIIIlIl[1]);

                        }
                        if (az.lIlIIIllIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var5), llIIIIIlIl[13])) {
                            if (az.lIlIIIllIIlII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                            }
                            if (az.lIlIIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks((int)llIIIIIlIl[2]);

                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIIIIlIl[2]);

                                a.a(llIIIIIlIl[6], llIIIIIlIl[1]);
                            }
                        }
                    }
                }
                if (az.lIlIIIllIIlII(Inventory.isFull() ? 1 : 0)) {
                    if (az.lIlIIIllIIlII(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && az.lIlIIIllIlIII(Players.getLocal().getWorldLocation().distanceTo(oJ), llIIIIIlIl[7])) {
                        AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[54]];
                        if (az.lIlIIIllIIIlI(Inventory.contains((int[])f.aT) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aT).interact(llIIIIIlII[llIIIIIlIl[55]]);
                        }
                        Movement.walkTo((WorldPoint)oJ);

                        Time.sleepTicks((int)llIIIIIlIl[1]);

                    }
                    if (az.lIlIIIllIIIlI(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[56]];
                        if (az.lIlIIIllIlIIl(Players.getLocal().getAnimation(), llIIIIIlIl[30])) {
                            int[] nArray = new int[llIIIIIlIl[1]];
                            nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[31];
                            if (az.lIlIIIllIIlIl(NPCs.getNearest((int[])nArray))) {
                                int[] nArray2 = new int[llIIIIIlIl[1]];
                                nArray2[az.llIIIIIlIl[0]] = llIIIIIlIl[31];
                                NPCs.getNearest((int[])nArray2).interact(llIIIIIlIl[0]);
                                Time.sleepTicks((int)llIIIIIlIl[7]);

                            }
                        }
                    }
                }
                if (az.lIlIIIllIIIlI(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[llIIIIIlIl[1]];
                    nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[50];
                    if (az.lIlIIIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[llIIIIIlIl[1]];
                        nArray3[az.llIIIIIlIl[0]] = llIIIIIlIl[50];
                        Inventory.getAll((int[])nArray3).stream().forEach(Item::drop);
                    }
                }
            }
        }
    }

    private static void lIlIIIlIlllIl() {
        llIIIIIlII = new String[llIIIIIlIl[100]];
        az.llIIIIIlII[az.llIIIIIlIl[0]] = "Buying items";
        az.llIIIIIlII[az.llIIIIIlIl[1]] = "Finished buying items, switching back to fishing";
        az.llIIIIIlII[az.llIIIIIlIl[2]] = "Navigating to bank";
        az.llIIIIIlII[az.llIIIIIlIl[3]] = "Opening bank";
        az.llIIIIIlII[az.llIIIIIlIl[5]] = "Handling banking";
        az.llIIIIIlII[az.llIIIIIlIl[7]] = "Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[9]] = "Fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[11]] = "Fly fishing rod rod";
        az.llIIIIIlII[az.llIIIIIlIl[13]] = "Feather";
        az.llIIIIIlII[az.llIIIIIlIl[15]] = "Fishing bait";
        az.llIIIIIlII[az.llIIIIIlIl[16]] = "We are missing supplies, switching to BUYING";
        az.llIIIIIlII[az.llIIIIIlIl[17]] = "Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[18]] = "Fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[19]] = "Fly fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[20]] = "Feather";
        az.llIIIIIlII[az.llIIIIIlIl[22]] = "Fishing bait";
        az.llIIIIIlII[az.llIIIIIlIl[25]] = "Dropping logs";
        az.llIIIIIlII[az.llIIIIIlIl[26]] = "Dropping logs";
        az.llIIIIIlII[az.llIIIIIlIl[28]] = "Nav to small fish spot";
        az.llIIIIIlII[az.llIIIIIlIl[29]] = "Wear";
        az.llIIIIIlII[az.llIIIIIlIl[27]] = "Fishing";
        az.llIIIIIlII[az.llIIIIIlIl[32]] = "Nav to small fish spot";
        az.llIIIIIlII[az.llIIIIIlIl[33]] = "Fishing";
        az.llIIIIIlII[az.llIIIIIlIl[34]] = "Bait";
        az.llIIIIIlII[az.llIIIIIlIl[35]] = "Nav to fly fish spot";
        az.llIIIIIlII[az.llIIIIIlIl[36]] = "Fishing";
        az.llIIIIIlII[az.llIIIIIlIl[37]] = "Lure";
        az.llIIIIIlII[az.llIIIIIlIl[38]] = "Dropping logs";
        az.llIIIIIlII[az.llIIIIIlIl[39]] = "Dropping logs";
        az.llIIIIIlII[az.llIIIIIlIl[40]] = "Fishing spot";
        az.llIIIIIlII[az.llIIIIIlIl[41]] = "Use-rod";
        az.llIIIIIlII[az.llIIIIIlIl[42]] = "Buying items";
        az.llIIIIIlII[az.llIIIIIlIl[43]] = "Finished buying items, switching back to fishing";
        az.llIIIIIlII[az.llIIIIIlIl[44]] = "Navigating to bank";
        az.llIIIIIlII[az.llIIIIIlIl[45]] = "Opening bank";
        az.llIIIIIlII[az.llIIIIIlIl[46]] = "Handling banking";
        az.llIIIIIlII[az.llIIIIIlIl[47]] = "Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[48]] = "We are missing supplies, switching to BUYING";
        az.llIIIIIlII[az.llIIIIIlIl[49]] = "Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[53]] = "Nav to bank";
        az.llIIIIIlII[az.llIIIIIlIl[54]] = "Nav to small fish spot";
        az.llIIIIIlII[az.llIIIIIlIl[55]] = "Wear";
        az.llIIIIIlII[az.llIIIIIlIl[56]] = "Fishing";
        az.llIIIIIlII[az.llIIIIIlIl[57]] = "Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[58]] = "Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[59]] = "Fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[60]] = "Fly fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[61]] = "Feather";
        az.llIIIIIlII[az.llIIIIIlIl[62]] = "Fishing bait";
        az.llIIIIIlII[az.llIIIIIlIl[73]] = "Fishing";
        az.llIIIIIlII[az.llIIIIIlIl[75]] = "ring of wealth (";
        az.llIIIIIlII[az.llIIIIIlIl[76]] = "Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[78]] = "Fishing bait";
        az.llIIIIIlII[az.llIIIIIlIl[79]] = "Feather";
        az.llIIIIIlII[az.llIIIIIlIl[80]] = "Fly fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[81]] = "Fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[82]] = "Small fishing net";
    }

    private static boolean lIlIIIllIlIII(int n2, int n3) {
        return n2 > n3;
    }
}

