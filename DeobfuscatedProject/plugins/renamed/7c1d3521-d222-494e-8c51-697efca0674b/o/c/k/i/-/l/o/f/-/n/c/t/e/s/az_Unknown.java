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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;

public class az_Unknown
implements ac {
    private static /* synthetic */ WorldPoint oJ;
    private static /* synthetic */ WorldPoint oK;
    public static /* synthetic */ WorldArea oI;
    private static /* synthetic */ int[] oy;
    private static /* synthetic */ String[] llIIIIIlII;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] llIIIIIlIl;
    public static /* synthetic */ boolean bt;

    public static void Q() {
        d var5;
        Object var15;
        int[] nArray = new int[llIIIIIlIl[1]];
        nArray[az.llIIIIIlIl[0]] = llIIIIIlIl[6];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIIIIlIl[6], llIIIIIlIl[1], llIIIIIlIl[4]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIIIIIlIl[1]];
        nArray2[az.llIIIIIlIl[0]] = llIIIIIlIl[8];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var15 = new d(llIIIIIlIl[8], llIIIIIlIl[1], llIIIIIlIl[4]);
            bv.add((d)var15);
            0;
        }
        int[] nArray3 = new int[llIIIIIlIl[1]];
        nArray3[az.llIIIIIlIl[0]] = llIIIIIlIl[10];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var15 = new d(llIIIIIlIl[10], llIIIIIlIl[1], llIIIIIlIl[63]);
            bv.add((d)var15);
            0;
        }
        int[] nArray4 = new int[llIIIIIlIl[1]];
        nArray4[az.llIIIIIlIl[0]] = llIIIIIlIl[14];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var15 = new d(llIIIIIlIl[14], llIIIIIlIl[64], llIIIIIlIl[65]);
            bv.add((d)var15);
            0;
        }
        int[] nArray5 = new int[llIIIIIlIl[1]];
        nArray5[az.llIIIIIlIl[0]] = llIIIIIlIl[12];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var15 = new d(llIIIIIlIl[12], llIIIIIlIl[66], llIIIIIlIl[7]);
            bv.add((d)var15);
            0;
        }
        int[] nArray6 = new int[llIIIIIlIl[1]];
        nArray6[az.llIIIIIlIl[0]] = llIIIIIlIl[67];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var15 = new d(llIIIIIlIl[67], llIIIIIlIl[1], llIIIIIlIl[4]);
            bv.add((d)var15);
            0;
        }
        int[] nArray7 = new int[llIIIIIlIl[1]];
        nArray7[az.llIIIIIlIl[0]] = llIIIIIlIl[24];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var15 = new d(llIIIIIlIl[24], llIIIIIlIl[16], llIIIIIlIl[4]);
            bv.add((d)var15);
            0;
        }
        if (az.lIlIIIllIIlII(Bank.contains((Predicate)(var15 = item -> item.getName().toLowerCase().contains(llIIIIIlII[llIIIIIlIl[75]]))) ? 1 : 0)) {
            var5 = new d(llIIIIIlIl[68], llIIIIIlIl[7], llIIIIIlIl[69]);
            bv.add(var5);
            0;
        }
        int[] nArray8 = new int[llIIIIIlIl[1]];
        nArray8[az.llIIIIIlIl[0]] = llIIIIIlIl[70];
        if (az.lIlIIIllIIlII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var5 = new d(llIIIIIlIl[70], llIIIIIlIl[54], llIIIIIlIl[71]);
            bv.add(var5);
            0;
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
                                                0;
                                            }
                                            if (!az.lIlIIIllIIIlI(Bank.isOpen() ? 1 : 0)) break block37;
                                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[5]];
                                            if (az.lIlIIIllIIllI(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)llIIIIIlIl[5]);
                                                0;
                                            }
                                            if (az.lIlIIIllIIllI(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)llIIIIIlIl[2]);
                                                0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[82]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];
                            0;
                            if (3 > 3) {
                                return false;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);
                    0;
                }
                int[] nArray2 = new int[llIIIIIlIl[1]];
                nArray2[az.llIIIIIlIl[0]] = llIIIIIlIl[8];
                if (az.lIlIIIllIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    Bank.withdraw((String)llIIIIIlII[llIIIIIlIl[18]], (int)llIIIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIIIIIlIl[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[81]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];
                            0;
                            if (2 <= 0) {
                                return ((76 + 163 - 147 + 116 ^ 112 + 159 - 116 + 38) & (0xDA ^ 0x8A ^ (0xE4 ^ 0xA5) ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);
                    0;
                }
                int[] nArray3 = new int[llIIIIIlIl[1]];
                nArray3[az.llIIIIIlIl[0]] = llIIIIIlIl[10];
                if (az.lIlIIIllIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdraw((String)llIIIIIlII[llIIIIIlIl[19]], (int)llIIIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIIIIIlIl[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[80]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];
                            0;
                            if (((185 + 0 - -2 + 5 ^ 41 + 4 - -108 + 9) & (3 ^ 0x75 ^ (0xD0 ^ 0xC4) ^ -1)) != 0) {
                                return ((179 + 15 - 171 + 211 ^ 10 + 27 - -82 + 62) & (4 ^ 0x26 ^ (1 ^ 0x7C) ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);
                    0;
                }
                int[] nArray4 = new int[llIIIIIlIl[1]];
                nArray4[az.llIIIIIlIl[0]] = llIIIIIlIl[12];
                if (az.lIlIIIllIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    Bank.withdraw((String)llIIIIIlII[llIIIIIlIl[20]], (int)llIIIIIlIl[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIIIIIlIl[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[79]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];
                            0;
                            if (((0x65 ^ 0x4C ^ (0x67 ^ 0x5E)) & (0x1A ^ 0x59 ^ (0x2F ^ 0x7C) ^ -1)) != ((82 + 41 - 61 + 93 ^ 42 + 12 - -59 + 27) & (19 + 125 - -34 + 8 ^ 134 + 134 - 261 + 166 ^ -1))) {
                                return false;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);
                    0;
                }
                int[] nArray5 = new int[llIIIIIlIl[1]];
                nArray5[az.llIIIIIlIl[0]] = llIIIIIlIl[14];
                if (az.lIlIIIllIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    Bank.withdraw((String)llIIIIIlII[llIIIIIlIl[22]], (int)llIIIIIlIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llIIIIIlIl[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[78]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];
                            0;
                            if (3 < 0) {
                                return ((0xFC ^ 0xA0 ^ (0xE1 ^ 0xA4)) & (0x75 ^ 0x70 ^ (0x6A ^ 0x76) ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);
                    0;
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
                                0;
                                Time.sleepTicks((int)llIIIIIlIl[1]);
                                0;
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
                                        0;
                                    }
                                }
                            }
                        }
                        if (az.lIlIIIllIIlll(Skills.getLevel((Skill)Skill.FISHING), llIIIIIlIl[7]) && az.lIlIIIllIIIll(Skills.getLevel((Skill)Skill.FISHING), llIIIIIlIl[27])) {
                            if (az.lIlIIIllIIlII(oI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[32]];
                                Movement.walkTo((WorldPoint)oJ);
                                0;
                                Time.sleepTicks((int)llIIIIIlIl[1]);
                                0;
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
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (az.lIlIIIllIIlll(Skills.getLevel((Skill)Skill.FISHING), llIIIIIlIl[27])) {
                        if (az.lIlIIIllIlIII(Players.getLocal().getWorldLocation().distanceTo(oK), llIIIIIlIl[22])) {
                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[35]];
                            Movement.walkTo((WorldPoint)oK);
                            0;
                            Time.sleepTicks((int)llIIIIIlIl[1]);
                            0;
                        }
                        if (az.lIlIIIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(oK), llIIIIIlIl[22])) {
                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[36]];
                            if (az.lIlIIIllIlIIl(Players.getLocal().getAnimation(), llIIIIIlIl[30]) && az.lIlIIIllIIlIl(NPCs.getNearest(nPC -> {
                                int n2;
                                if (az.lIlIIIllIlIIl(nPC.getId(), llIIIIIlIl[77]) && az.lIlIIIllIlIlI(nPC.getWorldLocation().distanceTo(oK), llIIIIIlIl[22])) {
                                    n2 = llIIIIIlIl[1];
                                    0;
                                    
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
                                        0;
                                        
                                        }
                                    } else {
                                        n2 = llIIIIIlIl[0];
                                    }
                                    return n2 != 0;
                                }).interact(llIIIIIlII[llIIIIIlIl[37]]);
                                Time.sleepTicks((int)llIIIIIlIl[2]);
                                0;
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

    private static void lIlIIIllIIIIl() {
        llIIIIIlIl = new int[101];
        az.llIIIIIlIl[0] = (43 + 114 - 100 + 102 ^ 25 + 62 - 49 + 128) & (0xA5 ^ 0xB8 ^ (0x20 ^ 4) ^ -1);
        az.llIIIIIlIl[1] = 1;
        az.llIIIIIlIl[2] = 2;
        az.llIIIIIlIl[3] = 3;
        az.llIIIIIlIl[4] = 0xFFFFBFEF & 0x5398;
        az.llIIIIIlIl[5] = 112 + 162 - 235 + 130 ^ 146 + 84 - 188 + 131;
        az.llIIIIIlIl[6] = -(0xFFFFFEDB & 0x43F5) & (0xFFFFE3FF & 0x5FFF);
        az.llIIIIIlIl[7] = 0xC6 ^ 0xC3;
        az.llIIIIIlIl[8] = -(0xFFFFDECF & 0x6FFD) & (0xFFFFCFFF & Short.MAX_VALUE);
        az.llIIIIIlIl[9] = 0xAE ^ 0xA1 ^ (0x38 ^ 0x31);
        az.llIIIIIlIl[10] = 0xFFFFF1FD & 0xF37;
        az.llIIIIIlIl[11] = 0x44 ^ 0x43;
        az.llIIIIIlIl[12] = -(0xFFFFFDFB & 0x6E45) & (0xFFFFFFFB & 0x6D7E);
        az.llIIIIIlIl[13] = 0xA4 ^ 0xAC;
        az.llIIIIIlIl[14] = 0xFFFF853D & 0x7BFB;
        az.llIIIIIlIl[15] = 0x2A ^ 0x23;
        az.llIIIIIlIl[16] = 0x4B ^ 0x28 ^ (0x26 ^ 0x4F);
        az.llIIIIIlIl[17] = 0x85 ^ 0x8E;
        az.llIIIIIlIl[18] = 41 + 105 - 138 + 146 ^ 20 + 71 - 70 + 129;
        az.llIIIIIlIl[19] = 0x18 ^ 0x15;
        az.llIIIIIlIl[20] = 0x9F ^ 0x91;
        az.llIIIIIlIl[21] = -(0xFFFFA9F7 & 0x7F5F) & (0xFFFFEFF7 & 0x1BFFE);
        az.llIIIIIlIl[22] = 0x44 ^ 0x4B;
        az.llIIIIIlIl[23] = 0xFFFF93EE & 0x6FF9;
        az.llIIIIIlIl[24] = 0xFFFFDF5D & 0x3FEA;
        az.llIIIIIlIl[25] = 0x35 ^ 0x2E ^ (0x9E ^ 0x95);
        az.llIIIIIlIl[26] = 0x73 ^ 0x62;
        az.llIIIIIlIl[27] = 125 + 34 - 53 + 40 ^ 6 + 62 - -43 + 23;
        az.llIIIIIlIl[28] = 0x8C ^ 0x9E;
        az.llIIIIIlIl[29] = 0x33 ^ 0x20;
        az.llIIIIIlIl[30] = -1;
        az.llIIIIIlIl[31] = -(0xFFFFFBBE & 0x5CC9) & (0xFFFFDEBF & 0x7FCF);
        az.llIIIIIlIl[32] = 0x28 ^ 0x3D;
        az.llIIIIIlIl[33] = 141 + 7 - 126 + 129 ^ 34 + 46 - 4 + 53;
        az.llIIIIIlIl[34] = 0xC2 ^ 0xA9 ^ (0xC4 ^ 0xB8);
        az.llIIIIIlIl[35] = 111 + 29 - 75 + 73 ^ 23 + 45 - -7 + 71;
        az.llIIIIIlIl[36] = 0x2C ^ 0x35;
        az.llIIIIIlIl[37] = 0x32 ^ 0x28;
        az.llIIIIIlIl[38] = 0x19 ^ 0x35 ^ (0x1C ^ 0x2B);
        az.llIIIIIlIl[39] = 0x80 ^ 0x9C;
        az.llIIIIIlIl[40] = 0x31 ^ 0x2C;
        az.llIIIIIlIl[41] = 0x55 ^ 0x4B;
        az.llIIIIIlIl[42] = 0x79 ^ 0x66;
        az.llIIIIIlIl[43] = 161 + 14 - 34 + 23 ^ 111 + 26 - 85 + 80;
        az.llIIIIIlIl[44] = 0x32 ^ 0x13;
        az.llIIIIIlIl[45] = 56 + 79 - 98 + 105 ^ 115 + 63 - 32 + 26;
        az.llIIIIIlIl[46] = 0xB2 ^ 0x91;
        az.llIIIIIlIl[47] = 0x8F ^ 0xAB;
        az.llIIIIIlIl[48] = 0x63 ^ 0x5F ^ (0x8C ^ 0x95);
        az.llIIIIIlIl[49] = 0x46 ^ 0x70 ^ (0x89 ^ 0x99);
        az.llIIIIIlIl[50] = -(0xFFFFDABB & 0x777F) & (0xFFFFDBFB & 0x777F);
        az.llIIIIIlIl[51] = -(0xFFFFFAD9 & 0x572F) & (0xFFFFDBFF & 0x7FEF);
        az.llIIIIIlIl[52] = -(0xFFFFDA7F & 0x778B) & (0xFFFFFFFF & 0x5FFF);
        az.llIIIIIlIl[53] = 0x2E ^ 0x4B ^ (0xCD ^ 0x8F);
        az.llIIIIIlIl[54] = 55 + 47 - 32 + 99 ^ 122 + 94 - 134 + 47;
        az.llIIIIIlIl[55] = 176 + 97 - 159 + 70 ^ 85 + 87 - 118 + 91;
        az.llIIIIIlIl[56] = 92 + 82 - 52 + 34 ^ 174 + 160 - 240 + 88;
        az.llIIIIIlIl[57] = 177 + 150 - 147 + 58 ^ 149 + 77 - 150 + 121;
        az.llIIIIIlIl[58] = 0x7F ^ 0x23 ^ (0x2F ^ 0x5F);
        az.llIIIIIlIl[59] = 82 + 109 - 105 + 49 ^ 5 + 126 - 0 + 39;
        az.llIIIIIlIl[60] = 0x1F ^ 0x2F ^ (0xA8 ^ 0xB6);
        az.llIIIIIlIl[61] = 0x91 ^ 0xA7 ^ (0x1D ^ 4);
        az.llIIIIIlIl[62] = 0x88 ^ 0xB8;
        az.llIIIIIlIl[63] = 0xFFFFAFAB & 0x737C;
        az.llIIIIIlIl[64] = 0xFFFFAFED & 0x513E;
        az.llIIIIIlIl[65] = 0xFFFFCDF5 & 0x33FE;
        az.llIIIIIlIl[66] = -(0xFFFFD12F & 0x6FF7) & (0xFFFFFBFE & 0x77EF);
        az.llIIIIIlIl[67] = 0xFFFFCF0F & 0x3FFD;
        az.llIIIIIlIl[68] = 0xFFFFAEEE & 0x7FDD;
        az.llIIIIIlIl[69] = 0xFFFFE5BF & 0x7BE8;
        az.llIIIIIlIl[70] = -(0xFFFFEEDF & 0x71B9) & (0xFFFFFFFF & 0x7FDF);
        az.llIIIIIlIl[71] = 0xFFFFD7DC & 0x2BA7;
        az.llIIIIIlIl[72] = 37 + 21 - -118 + 44 ^ 139 + 113 - 107 + 39;
        az.llIIIIIlIl[73] = 0x29 ^ 0x7D ^ (0x37 ^ 0x52);
        az.llIIIIIlIl[74] = 78 + 87 - 23 + 65 ^ 88 + 134 - 213 + 163;
        az.llIIIIIlIl[75] = 58 + 76 - -27 + 18 ^ 78 + 78 - 64 + 37;
        az.llIIIIIlIl[76] = 21 + 139 - 37 + 65 ^ 15 + 42 - -52 + 34;
        az.llIIIIIlIl[77] = 0xFFFFC5E6 & 0x3FFD;
        az.llIIIIIlIl[78] = 0x7C ^ 0x48;
        az.llIIIIIlIl[79] = 0x10 ^ 0x25;
        az.llIIIIIlIl[80] = 0x88 ^ 0xBE;
        az.llIIIIIlIl[81] = 0x82 ^ 0xB5;
        az.llIIIIIlIl[82] = 0x8D ^ 0x84 ^ (0xAF ^ 0x9E);
        az.llIIIIIlIl[83] = 0xFFFFDFCB & 0x29FE;
        az.llIIIIIlIl[84] = 0xFFFFEDF5 & 0x1FEE;
        az.llIIIIIlIl[85] = 0xFFFFEBF5 & 0x1DDF;
        az.llIIIIIlIl[86] = 0xFFFFCFF7 & 0x3DFC;
        az.llIIIIIlIl[87] = 0xFFFFBDFE & 0x4BE5;
        az.llIIIIIlIl[88] = 0xFFFFDDD4 & 0x2F7F;
        az.llIIIIIlIl[89] = -(0xFFFFF27F & 0x6D99) & (0xFFFFF7FF & 0x6DFF);
        az.llIIIIIlIl[90] = 0xFFFF9DF7 & 0x67F9;
        az.llIIIIIlIl[91] = -(0xFFFFEBB7 & 0x7659) & (0xFFFFFFFF & 0x67FF);
        az.llIIIIIlIl[92] = 0xFFFFAD3D & 0x53FF;
        az.llIIIIIlIl[93] = 0xFFFFDFCF & 0x2177;
        az.llIIIIIlIl[94] = -(0xFFFFDEB5 & 0x69DF) & (0xFFFFCDFF & 0x7BDF);
        az.llIIIIIlIl[95] = 0xFFFFCB5F & 0x35F9;
        az.llIIIIIlIl[96] = 0xFFFF97CF & 0x697F;
        az.llIIIIIlIl[97] = -(0xFFFFCFBD & 0x7277) & (0xFFFFEE77 & 0x7FFE);
        az.llIIIIIlIl[98] = 0xFFFFAD56 & 0x7EED;
        az.llIIIIIlIl[99] = 0xFFFFAF59 & 0x7CE6;
        az.llIIIIIlIl[100] = 0x88 ^ 0xB1;
    }

    private static String lIlIIIlIllIll(String var23, String var7) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), llIIIIIlIl[13]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(llIIIIIlIl[2], var12);
            return new String(var17.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ae() {
        return llIIIIIlIl[0];
    }

    private static String lIlIIIlIlllII(String var4, String var13) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var16 = var13.toCharArray();
        int var19 = llIIIIIlIl[0];
        char[] var8 = var4.toCharArray();
        int var2 = var8.length;
        int var6 = llIIIIIlIl[0];
        while (az.lIlIIIllIIIll(var6, var2)) {
            char var1 = var8[var6];
            var21.append((char)(var1 ^ var16[var19 % var16.length]));
            0;
            ++var19;
            ++var6;
            0;
            if ((0x34 ^ 0x3D ^ (0x34 ^ 0x39)) != 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static String lIlIIIlIllIlI(String var20, String var22) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIIIIIlIl[2], var9);
            return new String(var10.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
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
                            0;
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
            0;
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
            0;
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
            0;
        }
    }

    private static boolean lIlIIIllIIlIl(Object object) {
        return object != null;
    }

    public static void gJ() {
        block26: {
            BankLocation var14;
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
                            var14 = BankLocation.getNearest();
                            if (az.lIlIIIllIIlIl(var14) && az.lIlIIIllIIlII(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[44]];
                                a.a(var14);
                            }
                            if (!az.lIlIIIllIIlIl(var14) || !az.lIlIIIllIIIlI(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                            if (az.lIlIIIllIIlII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[45]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIIlIl[4]);
                                0;
                            }
                            if (!az.lIlIIIllIIIlI(Bank.isOpen() ? 1 : 0)) break block27;
                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[46]];
                            if (az.lIlIIIllIIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIIIIlIl[5]);
                                0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIIIIIlIl[1]];
                        stringArray[az.llIIIIIlIl[0]] = llIIIIIlII[llIIIIIlIl[76]];
                        if (az.lIlIIIllIIllI(Inventory.getCount((String[])stringArray))) {
                            bl = llIIIIIlIl[1];
                            0;
                            if ((0x5B ^ 0x5F) == -1) {
                                return false;
                            }
                        } else {
                            bl = llIIIIIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIIIlIl[4]);
                    0;
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
                        var14 = new WorldPoint(llIIIIIlIl[51], llIIIIIlIl[52], llIIIIIlIl[0]);
                        if (az.lIlIIIllIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var14), llIIIIIlIl[9])) {
                            AccBuilderSotf.c = llIIIIIlII[llIIIIIlIl[53]];
                            Movement.walkTo((WorldPoint)var14);
                            0;
                            Time.sleepTicks((int)llIIIIIlIl[1]);
                            0;
                        }
                        if (az.lIlIIIllIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var14), llIIIIIlIl[13])) {
                            if (az.lIlIIIllIIlII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                            }
                            if (az.lIlIIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks((int)llIIIIIlIl[2]);
                                0;
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIIIIlIl[2]);
                                0;
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
                        0;
                        Time.sleepTicks((int)llIIIIIlIl[1]);
                        0;
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
                                0;
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
        az.llIIIIIlII[az.llIIIIIlIl[0]] = az."Buying items";
        az.llIIIIIlII[az.llIIIIIlIl[1]] = az."Finished buying items, switching back to fishing";
        az.llIIIIIlII[az.llIIIIIlIl[2]] = az."Navigating to bank";
        az.llIIIIIlII[az.llIIIIIlIl[3]] = az."Opening bank";
        az.llIIIIIlII[az.llIIIIIlIl[5]] = az."Handling banking";
        az.llIIIIIlII[az.llIIIIIlIl[7]] = az."Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[9]] = az."Fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[11]] = az."Fly fishing rod rod";
        az.llIIIIIlII[az.llIIIIIlIl[13]] = az."Feather";
        az.llIIIIIlII[az.llIIIIIlIl[15]] = az."Fishing bait";
        az.llIIIIIlII[az.llIIIIIlIl[16]] = az."We are missing supplies, switching to BUYING";
        az.llIIIIIlII[az.llIIIIIlIl[17]] = az."Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[18]] = az."Fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[19]] = az."Fly fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[20]] = az."Feather";
        az.llIIIIIlII[az.llIIIIIlIl[22]] = az."Fishing bait";
        az.llIIIIIlII[az.llIIIIIlIl[25]] = az."Dropping logs";
        az.llIIIIIlII[az.llIIIIIlIl[26]] = az."Dropping logs";
        az.llIIIIIlII[az.llIIIIIlIl[28]] = az."Nav to small fish spot";
        az.llIIIIIlII[az.llIIIIIlIl[29]] = az."Wear";
        az.llIIIIIlII[az.llIIIIIlIl[27]] = az."Fishing";
        az.llIIIIIlII[az.llIIIIIlIl[32]] = az."Nav to small fish spot";
        az.llIIIIIlII[az.llIIIIIlIl[33]] = az."Fishing";
        az.llIIIIIlII[az.llIIIIIlIl[34]] = az."Bait";
        az.llIIIIIlII[az.llIIIIIlIl[35]] = az."Nav to fly fish spot";
        az.llIIIIIlII[az.llIIIIIlIl[36]] = az."Fishing";
        az.llIIIIIlII[az.llIIIIIlIl[37]] = az."Lure";
        az.llIIIIIlII[az.llIIIIIlIl[38]] = az."Dropping logs";
        az.llIIIIIlII[az.llIIIIIlIl[39]] = az."Dropping logs";
        az.llIIIIIlII[az.llIIIIIlIl[40]] = az."Fishing spot";
        az.llIIIIIlII[az.llIIIIIlIl[41]] = az."Use-rod";
        az.llIIIIIlII[az.llIIIIIlIl[42]] = az."Buying items";
        az.llIIIIIlII[az.llIIIIIlIl[43]] = az."Finished buying items, switching back to fishing";
        az.llIIIIIlII[az.llIIIIIlIl[44]] = az."Navigating to bank";
        az.llIIIIIlII[az.llIIIIIlIl[45]] = az."Opening bank";
        az.llIIIIIlII[az.llIIIIIlIl[46]] = az."Handling banking";
        az.llIIIIIlII[az.llIIIIIlIl[47]] = az."Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[48]] = az."We are missing supplies, switching to BUYING";
        az.llIIIIIlII[az.llIIIIIlIl[49]] = az."Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[53]] = az."Nav to bank";
        az.llIIIIIlII[az.llIIIIIlIl[54]] = az."Nav to small fish spot";
        az.llIIIIIlII[az.llIIIIIlIl[55]] = az."Wear";
        az.llIIIIIlII[az.llIIIIIlIl[56]] = az."Fishing";
        az.llIIIIIlII[az.llIIIIIlIl[57]] = az."Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[58]] = az."Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[59]] = az."Fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[60]] = az."Fly fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[61]] = az."Feather";
        az.llIIIIIlII[az.llIIIIIlIl[62]] = az."Fishing bait";
        az.llIIIIIlII[az.llIIIIIlIl[73]] = az."Fishing";
        az.llIIIIIlII[az.llIIIIIlIl[75]] = az."ring of wealth (";
        az.llIIIIIlII[az.llIIIIIlIl[76]] = az."Small fishing net";
        az.llIIIIIlII[az.llIIIIIlIl[78]] = az."Fishing bait";
        az.llIIIIIlII[az.llIIIIIlIl[79]] = az."Feather";
        az.llIIIIIlII[az.llIIIIIlIl[80]] = az."Fly fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[81]] = az."Fishing rod";
        az.llIIIIIlII[az.llIIIIIlIl[82]] = az."Small fishing net";
    }

    private static boolean lIlIIIllIlIII(int n2, int n3) {
        return n2 > n3;
    }
}

