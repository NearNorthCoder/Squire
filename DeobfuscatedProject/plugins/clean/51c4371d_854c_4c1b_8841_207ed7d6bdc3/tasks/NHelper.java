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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.account.AccBuilderBarrows;
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

public class NHelper
implements F {
    public static  List<d> bB;

    private static  WorldPoint iX;
    public static  WorldArea iW;
    private static  WorldPoint iY;
    public static  boolean bz;

    @Override
    public boolean T() {
        return llllIIll[0];
    }

    @Override
    public boolean W() {
        boolean bl;
        if (N.llIIlIIlIlI(Skills.getLevel((Skill)Skill.FISHING), llllIIll[74])) {
            bl = llllIIll[1];

            if ((0x40 ^ 0x5D ^ (0x7C ^ 0x65)) <= 3) {
                return false;
            }
        } else {
            bl = llllIIll[0];
        }
        return bl;
    }

    private static boolean llIIlIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        N.llIIlIIIlII();
        N.llIIlIIIIll();
        iW = new WorldArea(llllIIll[83], llllIIll[84], llllIIll[29], llllIIll[39], llllIIll[0]);
        bB = new ArrayList<d>();
        iX = new WorldPoint(llllIIll[85], llllIIll[86], llllIIll[0]);
        iY = new WorldPoint(llllIIll[87], llllIIll[88], llllIIll[0]);
        int[] nArray = new int[llllIIll[17]];
        nArray[N.llllIIll[0]] = llllIIll[89];
        nArray[N.llllIIll[1]] = llllIIll[90];
        nArray[N.llllIIll[2]] = llllIIll[91];
        nArray[N.llllIIll[3]] = llllIIll[92];
        nArray[N.llllIIll[5]] = llllIIll[93];
        nArray[N.llllIIll[7]] = llllIIll[94];
        nArray[N.llllIIll[9]] = llllIIll[95];
        nArray[N.llllIIll[11]] = llllIIll[96];
        nArray[N.llllIIll[13]] = llllIIll[97];
        nArray[N.llllIIll[15]] = llllIIll[98];
        nArray[N.llllIIll[16]] = llllIIll[99];
        iZ = nArray;
    }

    private static boolean llIIlIIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String V() {
        return llllIIlI[llllIIll[73]];
    }

    private static boolean llIIlIIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public static void cX() {
        block36: {
            BankLocation lIIlllIlIIIIllI;
            block37: {
                block44: {
                    block39: {
                        block43: {
                            block42: {
                                block41: {
                                    block40: {
                                        block38: {
                                            if (N.llIIlIIIlIl(bz ? 1 : 0)) {
                                                AccBuilderBarrows.c = llllIIlI[llllIIll[0]];
                                                b.a(bB);
                                                if (N.llIIlIIIllI(bB.size(), llllIIll[1])) {
                                                    System.out.println(llllIIlI[llllIIll[1]]);
                                                    bz = llllIIll[0];
                                                }
                                            }
                                            if (!N.llIIlIIIlll(bz ? 1 : 0)) break block36;
                                            if (!N.llIIlIIIlll(N.ac() ? 1 : 0)) break block37;
                                            lIIlllIlIIIIllI = BankLocation.getNearest();
                                            if (N.llIIlIIlIII(lIIlllIlIIIIllI) && N.llIIlIIIlll(lIIlllIlIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderBarrows.c = llllIIlI[llllIIll[2]];
                                                a.a(lIIlllIlIIIIllI);
                                            }
                                            if (!N.llIIlIIlIII(lIIlllIlIIIIllI) || !N.llIIlIIIlIl(lIIlllIlIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block37;
                                            if (N.llIIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                                                AccBuilderBarrows.c = llllIIlI[llllIIll[3]];
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIll[4]);

                                            }
                                            if (!N.llIIlIIIlIl(Bank.isOpen() ? 1 : 0)) break block37;
                                            AccBuilderBarrows.c = llllIIlI[llllIIll[5]];
                                            if (N.llIIlIIlIIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)llllIIll[5]);

                                            }
                                            if (N.llIIlIIlIIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)llllIIll[2]);

                                            }
                                            int[] nArray = new int[llllIIll[1]];
                                            nArray[N.llllIIll[0]] = llllIIll[6];
                                            if (!N.llIIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                            String[] stringArray = new String[llllIIll[1]];
                                            stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[7]];
                                            if (!N.llIIlIIlIlI(Inventory.getCount((String[])stringArray), llllIIll[1])) break block39;
                                        }
                                        int[] nArray = new int[llllIIll[1]];
                                        nArray[N.llllIIll[0]] = llllIIll[8];
                                        if (!N.llIIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block40;
                                        String[] stringArray = new String[llllIIll[1]];
                                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[9]];
                                        if (!N.llIIlIIlIlI(Inventory.getCount((String[])stringArray), llllIIll[1])) break block39;
                                    }
                                    int[] nArray = new int[llllIIll[1]];
                                    nArray[N.llllIIll[0]] = llllIIll[10];
                                    if (!N.llIIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                    String[] stringArray = new String[llllIIll[1]];
                                    stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[11]];
                                    if (!N.llIIlIIlIlI(Inventory.getCount((String[])stringArray), llllIIll[1])) break block39;
                                }
                                int[] nArray = new int[llllIIll[1]];
                                nArray[N.llllIIll[0]] = llllIIll[12];
                                if (!N.llIIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block42;
                                String[] stringArray = new String[llllIIll[1]];
                                stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[13]];
                                if (!N.llIIlIIlIlI(Inventory.getCount((String[])stringArray), llllIIll[1])) break block39;
                            }
                            int[] nArray = new int[llllIIll[1]];
                            nArray[N.llllIIll[0]] = llllIIll[14];
                            if (!N.llIIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                            String[] stringArray = new String[llllIIll[1]];
                            stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[15]];
                            if (!N.llIIlIIlIlI(Inventory.getCount((String[])stringArray), llllIIll[1])) break block39;
                        }
                        if ((!N.llIIlIIIlll(Bank.contains((int[])f.aU) ? 1 : 0) || N.llIIlIIlIlI(Inventory.getCount((int[])f.aU), llllIIll[1])) && !N.llIIlIIIlIl(Equipment.contains((int[])f.aU) ? 1 : 0)) break block44;
                    }
                    N.ag();
                    System.out.println(llllIIlI[llllIIll[16]]);
                    bz = llllIIll[1];
                    return;
                }
                int[] nArray = new int[llllIIll[1]];
                nArray[N.llllIIll[0]] = llllIIll[6];
                if (N.llIIlIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)llllIIlI[llllIIll[17]], (int)llllIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllIIll[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[82]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];

                            if (1 >= 3) {
                                return false;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);

                }
                int[] nArray2 = new int[llllIIll[1]];
                nArray2[N.llllIIll[0]] = llllIIll[8];
                if (N.llIIlIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    Bank.withdraw((String)llllIIlI[llllIIll[18]], (int)llllIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllIIll[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[81]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];

                            if (1 >= 3) {
                                return false;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);

                }
                int[] nArray3 = new int[llllIIll[1]];
                nArray3[N.llllIIll[0]] = llllIIll[10];
                if (N.llIIlIIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdraw((String)llllIIlI[llllIIll[19]], (int)llllIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllIIll[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[80]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];

                            if (((0xD ^ 0x7A ^ (0x55 ^ 0x7C)) & (0x76 ^ 0x65 ^ (0x8C ^ 0xC1) ^ -1)) > 1) {
                                return ((8 ^ 0x5E ^ (0xCA ^ 0x84)) & (93 + 125 - 47 + 10 ^ 133 + 42 - 136 + 134 ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);

                }
                int[] nArray4 = new int[llllIIll[1]];
                nArray4[N.llllIIll[0]] = llllIIll[12];
                if (N.llIIlIIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    Bank.withdraw((String)llllIIlI[llllIIll[20]], (int)llllIIll[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllIIll[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[79]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];

                            if (-1 > 1) {
                                return ((117 + 52 - 29 + 6 ^ 71 + 27 - 46 + 79) & (0x30 ^ 0x2D ^ (0x5B ^ 0x57) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);

                }
                int[] nArray5 = new int[llllIIll[1]];
                nArray5[N.llllIIll[0]] = llllIIll[14];
                if (N.llIIlIIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    Bank.withdraw((String)llllIIlI[llllIIll[22]], (int)llllIIll[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllIIll[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[78]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];

                            if (3 <= -1) {
                                return false;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);

                }
                if (N.llIIlIIIlIl(Bank.contains((int[])f.aU) ? 1 : 0)) {
                    a.b(f.aU, llllIIll[1]);
                }
                int[] nArray6 = new int[llllIIll[1]];
                nArray6[N.llllIIll[0]] = llllIIll[24];
                if (N.llIIlIIIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    a.a(llllIIll[24], llllIIll[1]);
                }
            }
            if (N.llIIlIIIlIl(N.ac() ? 1 : 0)) {
                if (N.llIIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (N.llIIlIIIlIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderBarrows.c = llllIIlI[llllIIll[25]];
                    System.out.println(llllIIlI[llllIIll[26]]);
                    Inventory.getAll((int[])iZ).stream().forEach(Item::drop);
                }
                if (N.llIIlIIIlll(Inventory.isFull() ? 1 : 0)) {
                    if (N.llIIlIIIllI(Skills.getLevel((Skill)Skill.FISHING), llllIIll[27])) {
                        if (N.llIIlIIIllI(Skills.getLevel((Skill)Skill.FISHING), llllIIll[7])) {
                            if (N.llIIlIIIlll(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.llIIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(iX), llllIIll[7])) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[28]];
                                if (N.llIIlIIIlIl(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                                    Inventory.getFirst((int[])f.aU).interact(llllIIlI[llllIIll[29]]);
                                }
                                Movement.walkTo((WorldPoint)iX);

                                Time.sleepTicks((int)llllIIll[1]);

                            }
                            if (N.llIIlIIIlIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[27]];
                                if (N.llIIlIIllII(Players.getLocal().getAnimation(), llllIIll[30])) {
                                    int[] nArray = new int[llllIIll[1]];
                                    nArray[N.llllIIll[0]] = llllIIll[31];
                                    lIIlllIlIIIIllI = NPCs.getNearest((int[])nArray);
                                    if (N.llIIlIIlIII(lIIlllIlIIIIllI) && N.llIIlIIIlIl(iW.contains((Locatable)lIIlllIlIIIIllI) ? 1 : 0)) {
                                        int[] nArray7 = new int[llllIIll[1]];
                                        nArray7[N.llllIIll[0]] = llllIIll[31];
                                        NPCs.getNearest((int[])nArray7).interact(llllIIll[0]);
                                        Time.sleepTicks((int)llllIIll[2]);

                                    }
                                }
                            }
                        }
                        if (N.llIIlIIlIlI(Skills.getLevel((Skill)Skill.FISHING), llllIIll[7]) && N.llIIlIIIllI(Skills.getLevel((Skill)Skill.FISHING), llllIIll[27])) {
                            if (N.llIIlIIIlll(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[32]];
                                Movement.walkTo((WorldPoint)iX);

                                Time.sleepTicks((int)llllIIll[1]);

                            }
                            if (N.llIIlIIIlIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[33]];
                                if (N.llIIlIIllII(Players.getLocal().getAnimation(), llllIIll[30])) {
                                    int[] nArray = new int[llllIIll[1]];
                                    nArray[N.llllIIll[0]] = llllIIll[31];
                                    lIIlllIlIIIIllI = NPCs.getNearest((int[])nArray);
                                    if (N.llIIlIIlIII(lIIlllIlIIIIllI) && N.llIIlIIIlIl(iW.contains((Locatable)lIIlllIlIIIIllI) ? 1 : 0)) {
                                        int[] nArray8 = new int[llllIIll[1]];
                                        nArray8[N.llllIIll[0]] = llllIIll[31];
                                        NPCs.getNearest((int[])nArray8).interact(llllIIlI[llllIIll[34]]);
                                        Time.sleepTicks((int)llllIIll[2]);

                                    }
                                }
                            }
                        }
                    }
                    if (N.llIIlIIlIlI(Skills.getLevel((Skill)Skill.FISHING), llllIIll[27])) {
                        if (N.llIIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(iY), llllIIll[22])) {
                            AccBuilderBarrows.c = llllIIlI[llllIIll[35]];
                            Movement.walkTo((WorldPoint)iY);

                            Time.sleepTicks((int)llllIIll[1]);

                        }
                        if (N.llIIlIIllIl(Players.getLocal().getWorldLocation().distanceTo(iY), llllIIll[22])) {
                            AccBuilderBarrows.c = llllIIlI[llllIIll[36]];
                            if (N.llIIlIIllII(Players.getLocal().getAnimation(), llllIIll[30]) && N.llIIlIIlIII(NPCs.getNearest(nPC -> {
                                int n2;
                                if (N.llIIlIIllII(nPC.getId(), llllIIll[77]) && N.llIIlIIllIl(nPC.getWorldLocation().distanceTo(iY), llllIIll[22])) {
                                    n2 = llllIIll[1];

                                    if (-1 < -1) {
                                        return false;
                                    }
                                } else {
                                    n2 = llllIIll[0];
                                }
                                return n2 != 0;
                            }))) {
                                NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (N.llIIlIIllII(nPC.getId(), llllIIll[77]) && N.llIIlIIllIl(nPC.getWorldLocation().distanceTo(iY), llllIIll[22])) {
                                        n2 = llllIIll[1];

                                        if (1 < 0) {
                                            return ((0x58 ^ 8 ^ (0x41 ^ 0x3F)) & (78 + 44 - 89 + 120 ^ 134 + 69 - 75 + 55 ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = llllIIll[0];
                                    }
                                    return n2 != 0;
                                }).interact(llllIIlI[llllIIll[37]]);
                                Time.sleepTicks((int)llllIIll[2]);

                            }
                        }
                    }
                }
            }
        }
    }

    private static void llIIlIIIIll() {
        llllIIlI = new String[llllIIll[100]];
        N.llllIIlI[N.llllIIll[0]] = "Buying items";
        N.llllIIlI[N.llllIIll[1]] = "Finished buying items, switching back to fishing";
        N.llllIIlI[N.llllIIll[2]] = "Navigating to bank";
        N.llllIIlI[N.llllIIll[3]] = "Opening bank";
        N.llllIIlI[N.llllIIll[5]] = "Handling banking";
        N.llllIIlI[N.llllIIll[7]] = "Small fishing net";
        N.llllIIlI[N.llllIIll[9]] = "Fishing rod";
        N.llllIIlI[N.llllIIll[11]] = "Fly fishing rod rod";
        N.llllIIlI[N.llllIIll[13]] = "Feather";
        N.llllIIlI[N.llllIIll[15]] = "Fishing bait";
        N.llllIIlI[N.llllIIll[16]] = "We are missing supplies, switching to BUYING";
        N.llllIIlI[N.llllIIll[17]] = "Small fishing net";
        N.llllIIlI[N.llllIIll[18]] = "Fishing rod";
        N.llllIIlI[N.llllIIll[19]] = "Fly fishing rod";
        N.llllIIlI[N.llllIIll[20]] = "Feather";
        N.llllIIlI[N.llllIIll[22]] = "Fishing bait";
        N.llllIIlI[N.llllIIll[25]] = "Dropping logs";
        N.llllIIlI[N.llllIIll[26]] = "Dropping logs";
        N.llllIIlI[N.llllIIll[28]] = "Nav to small fish spot";
        N.llllIIlI[N.llllIIll[29]] = "Wear";
        N.llllIIlI[N.llllIIll[27]] = "Fishing";
        N.llllIIlI[N.llllIIll[32]] = "Nav to small fish spot";
        N.llllIIlI[N.llllIIll[33]] = "Fishing";
        N.llllIIlI[N.llllIIll[34]] = "Bait";
        N.llllIIlI[N.llllIIll[35]] = "Nav to fly fish spot";
        N.llllIIlI[N.llllIIll[36]] = "Fishing";
        N.llllIIlI[N.llllIIll[37]] = "Lure";
        N.llllIIlI[N.llllIIll[38]] = "Dropping logs";
        N.llllIIlI[N.llllIIll[39]] = "Dropping logs";
        N.llllIIlI[N.llllIIll[40]] = "Fishing spot";
        N.llllIIlI[N.llllIIll[41]] = "Use-rod";
        N.llllIIlI[N.llllIIll[42]] = "Buying items";
        N.llllIIlI[N.llllIIll[43]] = "Finished buying items, switching back to fishing";
        N.llllIIlI[N.llllIIll[44]] = "Navigating to bank";
        N.llllIIlI[N.llllIIll[45]] = "Opening bank";
        N.llllIIlI[N.llllIIll[46]] = "Handling banking";
        N.llllIIlI[N.llllIIll[47]] = "Small fishing net";
        N.llllIIlI[N.llllIIll[48]] = "We are missing supplies, switching to BUYING";
        N.llllIIlI[N.llllIIll[49]] = "Small fishing net";
        N.llllIIlI[N.llllIIll[53]] = "Nav to bank";
        N.llllIIlI[N.llllIIll[54]] = "Nav to small fish spot";
        N.llllIIlI[N.llllIIll[55]] = "Wear";
        N.llllIIlI[N.llllIIll[56]] = "Fishing";
        N.llllIIlI[N.llllIIll[57]] = "Small fishing net";
        N.llllIIlI[N.llllIIll[58]] = "Small fishing net";
        N.llllIIlI[N.llllIIll[59]] = "Fishing rod";
        N.llllIIlI[N.llllIIll[60]] = "Fly fishing rod";
        N.llllIIlI[N.llllIIll[61]] = "Feather";
        N.llllIIlI[N.llllIIll[62]] = "Fishing bait";
        N.llllIIlI[N.llllIIll[73]] = "Fishing";
        N.llllIIlI[N.llllIIll[75]] = "ring of wealth (";
        N.llllIIlI[N.llllIIll[76]] = "Small fishing net";
        N.llllIIlI[N.llllIIll[78]] = "Fishing bait";
        N.llllIIlI[N.llllIIll[79]] = "Feather";
        N.llllIIlI[N.llllIIll[80]] = "Fly fishing rod";
        N.llllIIlI[N.llllIIll[81]] = "Fishing rod";
        N.llllIIlI[N.llllIIll[82]] = "Small fishing net";
    }

    public static void cY() {
        if (N.llIIlIIIlIl(Inventory.isFull() ? 1 : 0)) {
            AccBuilderBarrows.c = llllIIlI[llllIIll[38]];
            System.out.println(llllIIlI[llllIIll[39]]);
            Inventory.getAll((int[])iZ).stream().forEach(Item::drop);
        }
        if (N.llIIlIIIlll(Inventory.isFull() ? 1 : 0) && N.llIIlIIllII(Players.getLocal().getAnimation(), llllIIll[30])) {
            String[] stringArray = new String[llllIIll[1]];
            stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[40]];
            NPCs.getNearest((String[])stringArray).interact(llllIIlI[llllIIll[41]]);
            Time.sleepTicks((int)llllIIll[2]);

        }
    }

    private static boolean llIIlIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIlIIl(int n2) {
        return n2 > 0;
    }

    public static void ag() {
        d lIIlllIlIIIIIII;
        Object lIIlllIlIIIIIIl;
        int[] nArray = new int[llllIIll[1]];
        nArray[N.llllIIll[0]] = llllIIll[6];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llllIIll[6], llllIIll[1], llllIIll[4]);
            bB.add(d2);

        }
        int[] nArray2 = new int[llllIIll[1]];
        nArray2[N.llllIIll[0]] = llllIIll[8];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new DHelper(llllIIll[8], llllIIll[1], llllIIll[4]);
            bB.add((DHelper) IIlllIlIIIIIIl);

        }
        int[] nArray3 = new int[llllIIll[1]];
        nArray3[N.llllIIll[0]] = llllIIll[10];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new DHelper(llllIIll[10], llllIIll[1], llllIIll[63]);
            bB.add((DHelper) IIlllIlIIIIIIl);

        }
        int[] nArray4 = new int[llllIIll[1]];
        nArray4[N.llllIIll[0]] = llllIIll[14];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new DHelper(llllIIll[14], llllIIll[64], llllIIll[65]);
            bB.add((DHelper) IIlllIlIIIIIIl);

        }
        int[] nArray5 = new int[llllIIll[1]];
        nArray5[N.llllIIll[0]] = llllIIll[12];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new DHelper(llllIIll[12], llllIIll[66], llllIIll[7]);
            bB.add((DHelper) IIlllIlIIIIIIl);

        }
        int[] nArray6 = new int[llllIIll[1]];
        nArray6[N.llllIIll[0]] = llllIIll[67];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new DHelper(llllIIll[67], llllIIll[1], llllIIll[4]);
            bB.add((DHelper) IIlllIlIIIIIIl);

        }
        int[] nArray7 = new int[llllIIll[1]];
        nArray7[N.llllIIll[0]] = llllIIll[24];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new DHelper(llllIIll[24], llllIIll[16], llllIIll[4]);
            bB.add((DHelper) IIlllIlIIIIIIl);

        }
        if (N.llIIlIIIlll(Bank.contains((Predicate)(lIIlllIlIIIIIIl = item -> item.getName().toLowerCase().contains(llllIIlI[llllIIll[75]]))) ? 1 : 0)) {
            lIIlllIlIIIIIII = new DHelper(llllIIll[68], llllIIll[7], llllIIll[69]);
            bB.add(lIIlllIlIIIIIII);

        }
        int[] nArray8 = new int[llllIIll[1]];
        nArray8[N.llllIIll[0]] = llllIIll[70];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIIlllIlIIIIIII = new DHelper(llllIIll[70], llllIIll[54], llllIIll[71]);
            bB.add(lIIlllIlIIIIIII);

        }
    }

    public static void cZ() {
        block26: {
            BankLocation lIIlllIlIIIIlII;
            block27: {
                block30: {
                    block29: {
                        block28: {
                            if (N.llIIlIIIlIl(bz ? 1 : 0)) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[42]];
                                b.a(bB);
                                if (N.llIIlIIIllI(bB.size(), llllIIll[1])) {
                                    System.out.println(llllIIlI[llllIIll[43]]);
                                    bz = llllIIll[0];
                                }
                            }
                            if (!N.llIIlIIIlll(bz ? 1 : 0)) break block26;
                            if (!N.llIIlIIIlll(N.da() ? 1 : 0)) break block27;
                            lIIlllIlIIIIlII = BankLocation.getNearest();
                            if (N.llIIlIIlIII(lIIlllIlIIIIlII) && N.llIIlIIIlll(lIIlllIlIIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[44]];
                                a.a(lIIlllIlIIIIlII);
                            }
                            if (!N.llIIlIIlIII(lIIlllIlIIIIlII) || !N.llIIlIIIlIl(lIIlllIlIIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                            if (N.llIIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[45]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIll[4]);

                            }
                            if (!N.llIIlIIIlIl(Bank.isOpen() ? 1 : 0)) break block27;
                            AccBuilderBarrows.c = llllIIlI[llllIIll[46]];
                            if (N.llIIlIIlIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llllIIll[5]);

                            }
                            int[] nArray = new int[llllIIll[1]];
                            nArray[N.llllIIll[0]] = llllIIll[6];
                            if (!N.llIIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                            String[] stringArray = new String[llllIIll[1]];
                            stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[47]];
                            if (!N.llIIlIIlIlI(Inventory.getCount((String[])stringArray), llllIIll[1])) break block29;
                        }
                        if (!N.llIIlIIIlll(Bank.contains((int[])f.aU) ? 1 : 0) || !N.llIIlIIIlll(Inventory.contains((int[])f.aU) ? 1 : 0) || !N.llIIlIIIlll(Equipment.contains((int[])f.aU) ? 1 : 0)) break block30;
                    }
                    N.ag();
                    System.out.println(llllIIlI[llllIIll[48]]);
                    bz = llllIIll[1];
                    return;
                }
                int[] nArray = new int[llllIIll[1]];
                nArray[N.llllIIll[0]] = llllIIll[6];
                if (N.llIIlIIIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)llllIIlI[llllIIll[49]], (int)llllIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllIIll[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[76]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];

                            if (2 <= 0) {
                                return false;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);

                }
                if (N.llIIlIIIlIl(Bank.contains((int[])f.aU) ? 1 : 0)) {
                    a.b(f.aU, llllIIll[1]);
                }
            }
            if (N.llIIlIIIlIl(N.da() ? 1 : 0)) {
                if (N.llIIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (N.llIIlIIIlIl(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[llllIIll[1]];
                    nArray[N.llllIIll[0]] = llllIIll[50];
                    if (N.llIIlIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        lIIlllIlIIIIlII = new WorldPoint(llllIIll[51], llllIIll[52], llllIIll[0]);
                        if (N.llIIlIIlIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlllIlIIIIlII), llllIIll[9])) {
                            AccBuilderBarrows.c = llllIIlI[llllIIll[53]];
                            Movement.walkTo((WorldPoint)lIIlllIlIIIIlII);

                            Time.sleepTicks((int)llllIIll[1]);

                        }
                        if (N.llIIlIIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlllIlIIIIlII), llllIIll[13])) {
                            if (N.llIIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                            }
                            if (N.llIIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks((int)llllIIll[2]);

                                Bank.depositInventory();
                                Time.sleepTicks((int)llllIIll[2]);

                                a.a(llllIIll[6], llllIIll[1]);
                            }
                        }
                    }
                }
                if (N.llIIlIIIlll(Inventory.isFull() ? 1 : 0)) {
                    if (N.llIIlIIIlll(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && N.llIIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(iX), llllIIll[7])) {
                        AccBuilderBarrows.c = llllIIlI[llllIIll[54]];
                        if (N.llIIlIIIlIl(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aU).interact(llllIIlI[llllIIll[55]]);
                        }
                        Movement.walkTo((WorldPoint)iX);

                        Time.sleepTicks((int)llllIIll[1]);

                    }
                    if (N.llIIlIIIlIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIlI[llllIIll[56]];
                        if (N.llIIlIIllII(Players.getLocal().getAnimation(), llllIIll[30])) {
                            int[] nArray = new int[llllIIll[1]];
                            nArray[N.llllIIll[0]] = llllIIll[31];
                            if (N.llIIlIIlIII(NPCs.getNearest((int[])nArray))) {
                                int[] nArray2 = new int[llllIIll[1]];
                                nArray2[N.llllIIll[0]] = llllIIll[31];
                                NPCs.getNearest((int[])nArray2).interact(llllIIll[0]);
                                Time.sleepTicks((int)llllIIll[7]);

                            }
                        }
                    }
                }
                if (N.llIIlIIIlIl(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[llllIIll[1]];
                    nArray[N.llllIIll[0]] = llllIIll[50];
                    if (N.llIIlIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[llllIIll[1]];
                        nArray3[N.llllIIll[0]] = llllIIll[50];
                        Inventory.getAll((int[])nArray3).stream().forEach(Item::drop);
                    }
                }
            }
        }
    }

    private static boolean llIIlIIlIII(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ac() {
        int n2;
        String[] stringArray = new String[llllIIll[1]];
        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[58]];
        if (N.llIIlIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[llllIIll[1]];
            stringArray2[N.llllIIll[0]] = llllIIlI[llllIIll[59]];
            if (N.llIIlIIIlIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[llllIIll[1]];
                stringArray3[N.llllIIll[0]] = llllIIlI[llllIIll[60]];
                if (N.llIIlIIIlIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[llllIIll[1]];
                    stringArray4[N.llllIIll[0]] = llllIIlI[llllIIll[61]];
                    if (N.llIIlIIIlIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        String[] stringArray5 = new String[llllIIll[1]];
                        stringArray5[N.llllIIll[0]] = llllIIlI[llllIIll[62]];
                        if (N.llIIlIIIlIl(Inventory.contains((String[])stringArray5) ? 1 : 0) && (!N.llIIlIIIlll(Inventory.contains((int[])f.aU) ? 1 : 0) || N.llIIlIIIlIl(Equipment.contains((int[])f.aU) ? 1 : 0))) {
                            n2 = llllIIll[1];

                            if (-1 <= (5 ^ 1)) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = llllIIll[0];
        return n2 != 0;
    }

    public static boolean da() {
        int n2;
        String[] stringArray = new String[llllIIll[1]];
        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[57]];
        if (N.llIIlIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0) && (!N.llIIlIIIlll(Inventory.contains((int[])f.aU) ? 1 : 0) || N.llIIlIIIlIl(Equipment.contains((int[])f.aU) ? 1 : 0))) {
            n2 = llllIIll[1];

            if (((0x32 ^ 0x64) & ~(0xF7 ^ 0xA1)) >= 3) {
                return false;
            }
        } else {
            n2 = llllIIll[0];
        }
        return n2 != 0;
    }

    private static boolean llIIlIIllII(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(lIIlllIIlIlIlIl);
    }

    private static boolean llIIlIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int U() {
        N.cX();
        return llllIIll[72];
    }
}

