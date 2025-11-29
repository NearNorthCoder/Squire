/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;

public class AXHelper
implements ac {
    
    public static final  int oC;
    public static final  int oB;
    public static final  WorldPoint oF;
    public static  List<d> bv;
    
    public static  boolean bt;
    public static final  int oD;
    public static final  WorldPoint oE;

    private static boolean an() {
        boolean bl;
        if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
            boolean bl2;
            int[] nArray = new int[llIllllIII[1]];
            nArray[ax.llIllllIII[0]] = llIllllIII[11];
            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                bl2 = llIllllIII[1];

                if (3 <= 0) {
                    return ((136 + 14 - 47 + 150 ^ 70 + 17 - -80 + 22) & (0x5A ^ 0x1D ^ (0xA1 ^ 0xA6) ^ -1)) != 0;
                }
            } else {
                bl2 = llIllllIII[0];
            }
            return bl2;
        }
        if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5]) && ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
            boolean bl3;
            int[] nArray = new int[llIllllIII[1]];
            nArray[ax.llIllllIII[0]] = llIllllIII[9];
            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                bl3 = llIllllIII[1];

            } else {
                bl3 = llIllllIII[0];
            }
            return bl3;
        }
        int[] nArray = new int[llIllllIII[1]];
        nArray[ax.llIllllIII[0]] = llIllllIII[6];
        if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
            bl = llIllllIII[1];

            if (((0x3F ^ 0x23) & ~(0x59 ^ 0x45) & ~((0x6C ^ 0x2D) & ~(0xC0 ^ 0x81))) >= 1) {
                return false;
            }
        } else {
            bl = llIllllIII[0];
        }
        return bl;
    }

    private static boolean lIlllIlIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ae() {
        return llIllllIII[0];
    }

    private static void lIlllIlIIllIl() {
        llIlllIlll = new String[llIllllIII[41]];
        ax.llIlllIlll[ax.llIllllIII[0]] = "Buying items";
        ax.llIlllIlll[ax.llIllllIII[1]] = "Finished buying items, switching back to cooking";
        ax.llIlllIlll[ax.llIllllIII[2]] = "Navigating to bank";
        ax.llIlllIlll[ax.llIllllIII[3]] = "Handling banking";
        ax.llIlllIlll[ax.llIllllIII[7]] = "We are missing supplies, switching to BUYING";
        ax.llIlllIlll[ax.llIllllIII[10]] = "We are missing supplies, switching to BUYING";
        ax.llIlllIlll[ax.llIllllIII[12]] = "We are missing supplies, switching to BUYING";
        ax.llIlllIlll[ax.llIllllIII[15]] = "Equiping duel";
        ax.llIlllIlll[ax.llIllllIII[16]] = "Wear";
        ax.llIlllIlll[ax.llIllllIII[17]] = "Navigate to range";
        ax.llIlllIlll[ax.llIllllIII[18]] = "Cooking";
        ax.llIlllIlll[ax.llIllllIII[19]] = "Range";
        ax.llIlllIlll[ax.llIllllIII[20]] = "Cook";
        ax.llIlllIlll[ax.llIllllIII[34]] = "Cooking";
        ax.llIlllIlll[ax.llIllllIII[36]] = "ring of wealth (";
        ax.llIlllIlll[ax.llIllllIII[5]] = "ring of dueling(";
    }

    private static void Q() {
        d var1;
        Object var2;
        Object var3;
        if (ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5])) {
            d d2 = new DHelper(llIllllIII[6], llIllllIII[22], llIllllIII[23]);
            bv.add(d2);

        }
        if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5]) && ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
            var3 = new DHelper(llIllllIII[9], llIllllIII[24], llIllllIII[25]);
            bv.add((DHelper) ar3);

        }
        if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
            var3 = new DHelper(llIllllIII[11], llIllllIII[24], llIllllIII[25]);
            bv.add((DHelper) ar3);

        }
        if (ax.lIlllIlIlIIIl(Bank.contains(var3 = item -> item.getName().toLowerCase().contains(llIlllIlll[llIllllIII[5]])) ? 1 : 0)) {
            var2 = new DHelper(llIllllIII[13], llIllllIII[26], llIllllIII[27]);
            bv.add((DHelper) ar2);

        }
        if (ax.lIlllIlIlIIIl(Bank.contains(var2 = item -> item.getName().toLowerCase().contains(llIlllIlll[llIllllIII[36]])) ? 1 : 0)) {
            var1 = new DHelper(llIllllIII[28], llIllllIII[10], llIllllIII[29]);
            bv.add(var1);

        }
        int[] nArray = new int[llIllllIII[1]];
        nArray[ax.llIllllIII[0]] = llIllllIII[30];
        if (ax.lIlllIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var1 = new DHelper(llIllllIII[30], llIllllIII[31], llIllllIII[32]);
            bv.add(var1);

        }
    }

    private static boolean lIlllIlIlIIIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var4);
    }

    static {
        ax.lIlllIlIIlllI();
        ax.lIlllIlIIllIl();
        oD = llIllllIII[11];
        oC = llIllllIII[9];
        oB = llIllllIII[6];
        oE = new WorldPoint(llIllllIII[37], llIllllIII[38], llIllllIII[0]);
        oF = new WorldPoint(llIllllIII[39], llIllllIII[40], llIllllIII[0]);
        bv = new ArrayList<d>();
    }

    @Override
    public int af() {
        ax.gz();
        return llIllllIII[33];
    }

    private static boolean lIlllIlIIllll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[35])) {
            bl = llIllllIII[1];

            }
        } else {
            bl = llIllllIII[0];
        }
        return bl;
    }

    private static boolean lIlllIlIlIIlI(Object object) {
        return object != null;
    }

    private static boolean lIlllIlIlIIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlllIlIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String ag() {
        return llIlllIlll[llIllllIII[34]];
    }

    private static boolean lIlllIlIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlllIlIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    public static void gz() {
        if (ax.lIlllIlIIllll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIlll[llIllllIII[0]];
            b.a(bv);
            if (ax.lIlllIlIlIIII(bv.size(), llIllllIII[1])) {
                System.out.println(llIlllIlll[llIllllIII[1]]);
                bt = llIllllIII[0];
            }
        }
        if (ax.lIlllIlIlIIIl(bt ? 1 : 0)) {
            BankLocation var5;
            if (ax.lIlllIlIlIIIl(ax.an() ? 1 : 0)) {
                var5 = BankLocation.getNearest();
                if (ax.lIlllIlIlIIlI(var5) && ax.lIlllIlIlIIIl(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[2]];
                    a.a(var5);
                }
                if (ax.lIlllIlIlIIlI(var5) && ax.lIlllIlIIllll(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[3]];
                    if (ax.lIlllIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIllllIII[4]);

                    }
                    if (ax.lIlllIlIIllll(Bank.isOpen() ? 1 : 0)) {
                        if (ax.lIlllIlIlIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIllllIII[1]);

                        }
                        if (ax.lIlllIlIlIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIllllIII[2]);

                        }
                    }
                    if (ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5])) {
                        int[] nArray = new int[llIllllIII[1]];
                        nArray[ax.llIllllIII[0]] = llIllllIII[6];
                        if (ax.lIlllIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ax.Q();
                            System.out.println(llIlllIlll[llIllllIII[7]]);
                            bt = llIllllIII[1];
                            return;
                        }
                    }
                    if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5]) && ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
                        int[] nArray = new int[llIllllIII[1]];
                        nArray[ax.llIllllIII[0]] = llIllllIII[9];
                        if (ax.lIlllIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ax.Q();
                            System.out.println(llIlllIlll[llIllllIII[10]]);
                            bt = llIllllIII[1];
                            return;
                        }
                    }
                    if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
                        int[] nArray = new int[llIllllIII[1]];
                        nArray[ax.llIllllIII[0]] = llIllllIII[11];
                        if (ax.lIlllIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ax.Q();
                            System.out.println(llIlllIlll[llIllllIII[12]]);
                            bt = llIllllIII[1];
                            return;
                        }
                    }
                    int[] nArray = new int[llIllllIII[1]];
                    nArray[ax.llIllllIII[0]] = llIllllIII[13];
                    if (ax.lIlllIlIlIIIl(Equipment.contains((int[])nArray) ? 1 : 0) && ax.lIlllIlIlIlIl(Players.getLocal().getWorldLocation().distanceTo(oF), llIllllIII[14])) {
                        a.b(f.aS, llIllllIII[1]);
                        Time.sleepTicks((int)llIllllIII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIllllIII[1]];
                            nArray[ax.llIllllIII[0]] = llIllllIII[13];
                            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIllllIII[1];

                                if (((0xD2 ^ 0x80) & ~(0xF8 ^ 0xAA)) != ((0xFA ^ 0xB5) & ~(0xF2 ^ 0xBD))) {
                                    return false;
                                }
                            } else {
                                bl = llIllllIII[0];
                            }
                            return bl;
                        }, (int)llIllllIII[4]);

                    }
                    if (ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5])) {
                        Bank.withdrawAll((int)llIllllIII[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIllllIII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIllllIII[1]];
                            nArray[ax.llIllllIII[0]] = llIllllIII[6];
                            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIllllIII[1];

                                if (3 < 2) {
                                    return false;
                                }
                            } else {
                                bl = llIllllIII[0];
                            }
                            return bl;
                        }, (int)llIllllIII[4]);

                    }
                    if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[5]) && ax.lIlllIlIlIIII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
                        Bank.withdrawAll((int)llIllllIII[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIllllIII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIllllIII[1]];
                            nArray[ax.llIllllIII[0]] = llIllllIII[9];
                            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIllllIII[1];

                                if (-1 >= 2) {
                                    return false;
                                }
                            } else {
                                bl = llIllllIII[0];
                            }
                            return bl;
                        }, (int)llIllllIII[4]);

                    }
                    if (ax.lIlllIlIlIlII(Skills.getLevel((Skill)Skill.COOKING), llIllllIII[8])) {
                        Bank.withdrawAll((int)llIllllIII[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIllllIII[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[llIllllIII[1]];
                            nArray[ax.llIllllIII[0]] = llIllllIII[11];
                            if (ax.lIlllIlIlIIll(Inventory.getCount((int[])nArray))) {
                                bl = llIllllIII[1];

                                if (2 <= 0) {
                                    return ((0xAC ^ 0x8A ^ (0x22 ^ 0x1A)) & (0xB7 ^ 0x85 ^ (0x9B ^ 0xB7) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIllllIII[0];
                            }
                            return bl;
                        }, (int)llIllllIII[4]);

                    }
                }
            }
            if (ax.lIlllIlIIllll(ax.an() ? 1 : 0)) {
                int[] nArray = new int[llIllllIII[1]];
                nArray[ax.llIllllIII[0]] = llIllllIII[13];
                if (ax.lIlllIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llIllllIII[1]];
                    nArray2[ax.llIllllIII[0]] = llIllllIII[13];
                    if (ax.lIlllIlIlIIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlllIlll[llIllllIII[15]];
                        int[] nArray3 = new int[llIllllIII[1]];
                        nArray3[ax.llIllllIII[0]] = llIllllIII[13];
                        var5 = Inventory.getFirst((int[])nArray3);
                        if (ax.lIlllIlIlIIlI(var5)) {
                            var5.interact(llIlllIlll[llIllllIII[16]]);
                            Time.sleepTicks((int)llIllllIII[3]);

                        }
                    }
                }
                if (ax.lIlllIlIlIlIl(Players.getLocal().getWorldLocation().distanceTo(oF), llIllllIII[10])) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[17]];
                    Movement.walkTo((WorldPoint)oF);

                    Time.sleepTicks((int)llIllllIII[7]);

                }
                if (ax.lIlllIlIlIllI(Players.getLocal().getWorldLocation().distanceTo(oF), llIllllIII[10])) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[18]];
                    String[] stringArray = new String[llIllllIII[1]];
                    stringArray[ax.llIllllIII[0]] = llIlllIlll[llIllllIII[19]];
                    var5 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
                    if (ax.lIlllIlIlIIlI(var5)) {
                        if (ax.lIlllIlIlIIIl(Production.isOpen() ? 1 : 0)) {
                            var5.interact(llIlllIlll[llIllllIII[20]]);
                            Time.sleepTicks((int)llIllllIII[2]);

                            Time.sleepUntil(() -> Production.isOpen(), (int)llIllllIII[4]);

                        }
                        if (ax.lIlllIlIIllll(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption((int)llIllllIII[1]);
                            Time.sleepTicks((int)llIllllIII[7]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!ax.lIlllIlIIllll(ax.an() ? 1 : 0) || ax.lIlllIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = llIllllIII[1];

                                    if ((0x2D ^ 0x59 ^ (0xE ^ 0x7E)) <= 0) {
                                        return ((0xD ^ 0x50 ^ (0x3A ^ 0x5E)) & (128 + 85 - 204 + 162 ^ 45 + 97 - 2 + 6 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIllllIII[0];
                                }
                                return bl;
                            }, (int)llIllllIII[21]);

                        }
                    }
                }
            }
        }
    }
}

