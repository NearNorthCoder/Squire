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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f_Unknown;
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

public class N_Unknown
implements F {
    public static /* synthetic */ List<d> bB;
    private static /* synthetic */ int[] llllIIll;
    private static /* synthetic */ int[] iZ;
    private static /* synthetic */ String[] llllIIlI;
    private static /* synthetic */ WorldPoint iX;
    public static /* synthetic */ WorldArea iW;
    private static /* synthetic */ WorldPoint iY;
    public static /* synthetic */ boolean bz;

    @Override
    public boolean T() {
        return llllIIll[0];
    }

    @Override
    public boolean W() {
        boolean bl;
        if (N.llIIlIIlIlI(Skills.getLevel((Skill)Skill.FISHING), llllIIll[74])) {
            bl = llllIIll[1];
            0;
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
                                                0;
                                            }
                                            if (!N.llIIlIIIlIl(Bank.isOpen() ? 1 : 0)) break block37;
                                            AccBuilderBarrows.c = llllIIlI[llllIIll[5]];
                                            if (N.llIIlIIlIIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)llllIIll[5]);
                                                0;
                                            }
                                            if (N.llIIlIIlIIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)llllIIll[2]);
                                                0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[82]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];
                            0;
                            if (1 >= 3) {
                                return false;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);
                    0;
                }
                int[] nArray2 = new int[llllIIll[1]];
                nArray2[N.llllIIll[0]] = llllIIll[8];
                if (N.llIIlIIIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    Bank.withdraw((String)llllIIlI[llllIIll[18]], (int)llllIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllIIll[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[81]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];
                            0;
                            if (1 >= 3) {
                                return false;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);
                    0;
                }
                int[] nArray3 = new int[llllIIll[1]];
                nArray3[N.llllIIll[0]] = llllIIll[10];
                if (N.llIIlIIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdraw((String)llllIIlI[llllIIll[19]], (int)llllIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllIIll[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[80]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];
                            0;
                            if (((0xD ^ 0x7A ^ (0x55 ^ 0x7C)) & (0x76 ^ 0x65 ^ (0x8C ^ 0xC1) ^ -1)) > 1) {
                                return ((8 ^ 0x5E ^ (0xCA ^ 0x84)) & (93 + 125 - 47 + 10 ^ 133 + 42 - 136 + 134 ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);
                    0;
                }
                int[] nArray4 = new int[llllIIll[1]];
                nArray4[N.llllIIll[0]] = llllIIll[12];
                if (N.llIIlIIIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    Bank.withdraw((String)llllIIlI[llllIIll[20]], (int)llllIIll[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllIIll[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[79]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];
                            0;
                            if (-1 > 1) {
                                return ((117 + 52 - 29 + 6 ^ 71 + 27 - 46 + 79) & (0x30 ^ 0x2D ^ (0x5B ^ 0x57) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);
                    0;
                }
                int[] nArray5 = new int[llllIIll[1]];
                nArray5[N.llllIIll[0]] = llllIIll[14];
                if (N.llIIlIIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    Bank.withdraw((String)llllIIlI[llllIIll[22]], (int)llllIIll[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)llllIIll[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[78]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];
                            0;
                            if (3 <= -1) {
                                return false;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);
                    0;
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
                                0;
                                Time.sleepTicks((int)llllIIll[1]);
                                0;
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
                                        0;
                                    }
                                }
                            }
                        }
                        if (N.llIIlIIlIlI(Skills.getLevel((Skill)Skill.FISHING), llllIIll[7]) && N.llIIlIIIllI(Skills.getLevel((Skill)Skill.FISHING), llllIIll[27])) {
                            if (N.llIIlIIIlll(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llllIIlI[llllIIll[32]];
                                Movement.walkTo((WorldPoint)iX);
                                0;
                                Time.sleepTicks((int)llllIIll[1]);
                                0;
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
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (N.llIIlIIlIlI(Skills.getLevel((Skill)Skill.FISHING), llllIIll[27])) {
                        if (N.llIIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(iY), llllIIll[22])) {
                            AccBuilderBarrows.c = llllIIlI[llllIIll[35]];
                            Movement.walkTo((WorldPoint)iY);
                            0;
                            Time.sleepTicks((int)llllIIll[1]);
                            0;
                        }
                        if (N.llIIlIIllIl(Players.getLocal().getWorldLocation().distanceTo(iY), llllIIll[22])) {
                            AccBuilderBarrows.c = llllIIlI[llllIIll[36]];
                            if (N.llIIlIIllII(Players.getLocal().getAnimation(), llllIIll[30]) && N.llIIlIIlIII(NPCs.getNearest(nPC -> {
                                int n2;
                                if (N.llIIlIIllII(nPC.getId(), llllIIll[77]) && N.llIIlIIllIl(nPC.getWorldLocation().distanceTo(iY), llllIIll[22])) {
                                    n2 = llllIIll[1];
                                    0;
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
                                        0;
                                        if (1 < 0) {
                                            return ((0x58 ^ 8 ^ (0x41 ^ 0x3F)) & (78 + 44 - 89 + 120 ^ 134 + 69 - 75 + 55 ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = llllIIll[0];
                                    }
                                    return n2 != 0;
                                }).interact(llllIIlI[llllIIll[37]]);
                                Time.sleepTicks((int)llllIIll[2]);
                                0;
                            }
                        }
                    }
                }
            }
        }
    }

    private static void llIIlIIIIll() {
        llllIIlI = new String[llllIIll[100]];
        N.llllIIlI[N.llllIIll[0]] = N."Buying items";
        N.llllIIlI[N.llllIIll[1]] = N."Finished buying items, switching back to fishing";
        N.llllIIlI[N.llllIIll[2]] = N."Navigating to bank";
        N.llllIIlI[N.llllIIll[3]] = N."Opening bank";
        N.llllIIlI[N.llllIIll[5]] = N."Handling banking";
        N.llllIIlI[N.llllIIll[7]] = N."Small fishing net";
        N.llllIIlI[N.llllIIll[9]] = N."Fishing rod";
        N.llllIIlI[N.llllIIll[11]] = N."Fly fishing rod rod";
        N.llllIIlI[N.llllIIll[13]] = N."Feather";
        N.llllIIlI[N.llllIIll[15]] = N."Fishing bait";
        N.llllIIlI[N.llllIIll[16]] = N."We are missing supplies, switching to BUYING";
        N.llllIIlI[N.llllIIll[17]] = N."Small fishing net";
        N.llllIIlI[N.llllIIll[18]] = N."Fishing rod";
        N.llllIIlI[N.llllIIll[19]] = N."Fly fishing rod";
        N.llllIIlI[N.llllIIll[20]] = N."Feather";
        N.llllIIlI[N.llllIIll[22]] = N."Fishing bait";
        N.llllIIlI[N.llllIIll[25]] = N."Dropping logs";
        N.llllIIlI[N.llllIIll[26]] = N."Dropping logs";
        N.llllIIlI[N.llllIIll[28]] = N."Nav to small fish spot";
        N.llllIIlI[N.llllIIll[29]] = N."Wear";
        N.llllIIlI[N.llllIIll[27]] = N."Fishing";
        N.llllIIlI[N.llllIIll[32]] = N."Nav to small fish spot";
        N.llllIIlI[N.llllIIll[33]] = N."Fishing";
        N.llllIIlI[N.llllIIll[34]] = N."Bait";
        N.llllIIlI[N.llllIIll[35]] = N."Nav to fly fish spot";
        N.llllIIlI[N.llllIIll[36]] = N."Fishing";
        N.llllIIlI[N.llllIIll[37]] = N."Lure";
        N.llllIIlI[N.llllIIll[38]] = N."Dropping logs";
        N.llllIIlI[N.llllIIll[39]] = N."Dropping logs";
        N.llllIIlI[N.llllIIll[40]] = N."Fishing spot";
        N.llllIIlI[N.llllIIll[41]] = N."Use-rod";
        N.llllIIlI[N.llllIIll[42]] = N."Buying items";
        N.llllIIlI[N.llllIIll[43]] = N."Finished buying items, switching back to fishing";
        N.llllIIlI[N.llllIIll[44]] = N."Navigating to bank";
        N.llllIIlI[N.llllIIll[45]] = N."Opening bank";
        N.llllIIlI[N.llllIIll[46]] = N."Handling banking";
        N.llllIIlI[N.llllIIll[47]] = N."Small fishing net";
        N.llllIIlI[N.llllIIll[48]] = N."We are missing supplies, switching to BUYING";
        N.llllIIlI[N.llllIIll[49]] = N."Small fishing net";
        N.llllIIlI[N.llllIIll[53]] = N."Nav to bank";
        N.llllIIlI[N.llllIIll[54]] = N."Nav to small fish spot";
        N.llllIIlI[N.llllIIll[55]] = N."Wear";
        N.llllIIlI[N.llllIIll[56]] = N."Fishing";
        N.llllIIlI[N.llllIIll[57]] = N."Small fishing net";
        N.llllIIlI[N.llllIIll[58]] = N."Small fishing net";
        N.llllIIlI[N.llllIIll[59]] = N."Fishing rod";
        N.llllIIlI[N.llllIIll[60]] = N."Fly fishing rod";
        N.llllIIlI[N.llllIIll[61]] = N."Feather";
        N.llllIIlI[N.llllIIll[62]] = N."Fishing bait";
        N.llllIIlI[N.llllIIll[73]] = N."Fishing";
        N.llllIIlI[N.llllIIll[75]] = N."ring of wealth (";
        N.llllIIlI[N.llllIIll[76]] = N."Small fishing net";
        N.llllIIlI[N.llllIIll[78]] = N."Fishing bait";
        N.llllIIlI[N.llllIIll[79]] = N."Feather";
        N.llllIIlI[N.llllIIll[80]] = N."Fly fishing rod";
        N.llllIIlI[N.llllIIll[81]] = N."Fishing rod";
        N.llllIIlI[N.llllIIll[82]] = N."Small fishing net";
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
            0;
        }
    }

    private static String llIIlIIIIlI(String lIIlllIIlllIlII, String lIIlllIIlllIIll) {
        try {
            SecretKeySpec lIIlllIIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlllIIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlllIIlllIllI = Cipher.getInstance("Blowfish");
            lIIlllIIlllIllI.init(llllIIll[2], lIIlllIIlllIlll);
            return new String(lIIlllIIlllIllI.doFinal(Base64.getDecoder().decode(lIIlllIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlllIIlllIlIl) {
            lIIlllIIlllIlIl.printStackTrace();
            return null;
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
            d d2 = new d(llllIIll[6], llllIIll[1], llllIIll[4]);
            bB.add(d2);
            0;
        }
        int[] nArray2 = new int[llllIIll[1]];
        nArray2[N.llllIIll[0]] = llllIIll[8];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new d(llllIIll[8], llllIIll[1], llllIIll[4]);
            bB.add((d)lIIlllIlIIIIIIl);
            0;
        }
        int[] nArray3 = new int[llllIIll[1]];
        nArray3[N.llllIIll[0]] = llllIIll[10];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new d(llllIIll[10], llllIIll[1], llllIIll[63]);
            bB.add((d)lIIlllIlIIIIIIl);
            0;
        }
        int[] nArray4 = new int[llllIIll[1]];
        nArray4[N.llllIIll[0]] = llllIIll[14];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new d(llllIIll[14], llllIIll[64], llllIIll[65]);
            bB.add((d)lIIlllIlIIIIIIl);
            0;
        }
        int[] nArray5 = new int[llllIIll[1]];
        nArray5[N.llllIIll[0]] = llllIIll[12];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new d(llllIIll[12], llllIIll[66], llllIIll[7]);
            bB.add((d)lIIlllIlIIIIIIl);
            0;
        }
        int[] nArray6 = new int[llllIIll[1]];
        nArray6[N.llllIIll[0]] = llllIIll[67];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new d(llllIIll[67], llllIIll[1], llllIIll[4]);
            bB.add((d)lIIlllIlIIIIIIl);
            0;
        }
        int[] nArray7 = new int[llllIIll[1]];
        nArray7[N.llllIIll[0]] = llllIIll[24];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIIlllIlIIIIIIl = new d(llllIIll[24], llllIIll[16], llllIIll[4]);
            bB.add((d)lIIlllIlIIIIIIl);
            0;
        }
        if (N.llIIlIIIlll(Bank.contains((Predicate)(lIIlllIlIIIIIIl = item -> item.getName().toLowerCase().contains(llllIIlI[llllIIll[75]]))) ? 1 : 0)) {
            lIIlllIlIIIIIII = new d(llllIIll[68], llllIIll[7], llllIIll[69]);
            bB.add(lIIlllIlIIIIIII);
            0;
        }
        int[] nArray8 = new int[llllIIll[1]];
        nArray8[N.llllIIll[0]] = llllIIll[70];
        if (N.llIIlIIIlll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIIlllIlIIIIIII = new d(llllIIll[70], llllIIll[54], llllIIll[71]);
            bB.add(lIIlllIlIIIIIII);
            0;
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
                                0;
                            }
                            if (!N.llIIlIIIlIl(Bank.isOpen() ? 1 : 0)) break block27;
                            AccBuilderBarrows.c = llllIIlI[llllIIll[46]];
                            if (N.llIIlIIlIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llllIIll[5]);
                                0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llllIIll[1]];
                        stringArray[N.llllIIll[0]] = llllIIlI[llllIIll[76]];
                        if (N.llIIlIIlIIl(Inventory.getCount((String[])stringArray))) {
                            bl = llllIIll[1];
                            0;
                            if (2 <= 0) {
                                return false;
                            }
                        } else {
                            bl = llllIIll[0];
                        }
                        return bl;
                    }, (int)llllIIll[4]);
                    0;
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
                            0;
                            Time.sleepTicks((int)llllIIll[1]);
                            0;
                        }
                        if (N.llIIlIIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIlllIlIIIIlII), llllIIll[13])) {
                            if (N.llIIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                            }
                            if (N.llIIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks((int)llllIIll[2]);
                                0;
                                Bank.depositInventory();
                                Time.sleepTicks((int)llllIIll[2]);
                                0;
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
                        0;
                        Time.sleepTicks((int)llllIIll[1]);
                        0;
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
                                0;
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

    private static void llIIlIIIlII() {
        llllIIll = new int[101];
        N.llllIIll[0] = (3 ^ 7) & ~(0x61 ^ 0x65);
        N.llllIIll[1] = 1;
        N.llllIIll[2] = 2;
        N.llllIIll[3] = 3;
        N.llllIIll[4] = 0xFFFF97BA & 0x7BCD;
        N.llllIIll[5] = 43 + 38 - 24 + 94 ^ 69 + 51 - 46 + 73;
        N.llllIIll[6] = -(0xFFFFFFFF & 0x3E01) & (0xFFFFBF3F & 0x7FEF);
        N.llllIIll[7] = 138 + 10 - 69 + 62 ^ 41 + 21 - -12 + 62;
        N.llllIIll[8] = 0xFFFF833F & 0x7DF3;
        N.llllIIll[9] = 0xB7 ^ 0xAD ^ (0x2A ^ 0x36);
        N.llllIIll[10] = 0xFFFFB1BF & 0x4F75;
        N.llllIIll[11] = 0xA7 ^ 0xAD ^ (0x52 ^ 0x5F);
        N.llllIIll[12] = -(0xFFFFAFB7 & 0x7A4D) & (0xFFFFFF3E & 0x2BFF);
        N.llllIIll[13] = 0xB5 ^ 0x8D ^ (0x1F ^ 0x2F);
        N.llllIIll[14] = 0xFFFFF77B & 0x9BD;
        N.llllIIll[15] = 1 ^ (0x79 ^ 0x71);
        N.llllIIll[16] = 0xA6 ^ 0xAC;
        N.llllIIll[17] = 0x37 ^ 0x3D ^ 1;
        N.llllIIll[18] = 0x19 ^ 0x15;
        N.llllIIll[19] = 0xA5 ^ 0x8D ^ (0xE5 ^ 0xC0);
        N.llllIIll[20] = 0x6D ^ 0x7F ^ (0x9F ^ 0x83);
        N.llllIIll[21] = 0xFFFF8FF7 & 0x1F6A8;
        N.llllIIll[22] = 0x6E ^ 0x34 ^ (0xD3 ^ 0x86);
        N.llllIIll[23] = -(0xFFFFEEFF & 0x7517) & (0xFFFFE7FF & 0x7FFE);
        N.llllIIll[24] = 0xFFFF9F7B & 0x7FCC;
        N.llllIIll[25] = 0x2C ^ 2 ^ (0xAB ^ 0x95);
        N.llllIIll[26] = 0x16 ^ 0x3B ^ (0x7C ^ 0x40);
        N.llllIIll[27] = 121 + 23 - 21 + 68 ^ 91 + 15 - -60 + 5;
        N.llllIIll[28] = 0x26 ^ 0x34;
        N.llllIIll[29] = 0x34 ^ 0x27;
        N.llllIIll[30] = -1;
        N.llllIIll[31] = 0xFFFFD6AD & 0x2F5A;
        N.llllIIll[32] = 0xF ^ 0x1A;
        N.llllIIll[33] = 0x8E ^ 0x98;
        N.llllIIll[34] = 0xB5 ^ 0xA2;
        N.llllIIll[35] = 0x57 ^ 0x13 ^ (0xDA ^ 0x86);
        N.llllIIll[36] = 0x59 ^ 0x40;
        N.llllIIll[37] = 0x3F ^ 0x25;
        N.llllIIll[38] = 0x9A ^ 0x81;
        N.llllIIll[39] = 8 ^ 0x14;
        N.llllIIll[40] = 124 + 22 - 5 + 13 ^ 14 + 76 - 31 + 76;
        N.llllIIll[41] = 0 ^ 0x1E;
        N.llllIIll[42] = 117 + 73 - 137 + 111 ^ 158 + 2 - 0 + 27;
        N.llllIIll[43] = 0x6A ^ 0x4A;
        N.llllIIll[44] = 0x13 ^ 0x32;
        N.llllIIll[45] = 9 ^ 0x2B;
        N.llllIIll[46] = 0xF9 ^ 0xC2 ^ (0x9D ^ 0x85);
        N.llllIIll[47] = 0x1D ^ 0x39;
        N.llllIIll[48] = 0x59 ^ 0x7C;
        N.llllIIll[49] = 0xE0 ^ 0xC6;
        N.llllIIll[50] = -(0xFFFFFCFB & 0x2BB7) & (0xFFFFEFF7 & 0x39FB);
        N.llllIIll[51] = 0xFFFFA9F7 & 0x5FEF;
        N.llllIIll[52] = 0xFFFF9DFD & 0x6FF7;
        N.llllIIll[53] = 0x15 ^ 0x32;
        N.llllIIll[54] = 0x25 ^ 0xD;
        N.llllIIll[55] = 0x6E ^ 0x47;
        N.llllIIll[56] = 0x78 ^ 0x52;
        N.llllIIll[57] = 0x1C ^ 0x40 ^ (0xCF ^ 0xB8);
        N.llllIIll[58] = 0xBA ^ 0x91 ^ (0x87 ^ 0x80);
        N.llllIIll[59] = 0x9A ^ 0xB7;
        N.llllIIll[60] = 115 + 22 - 114 + 105 ^ 131 + 159 - 228 + 112;
        N.llllIIll[61] = 0x14 ^ 0x3B;
        N.llllIIll[62] = 0x4A ^ 0x2F ^ (0xD1 ^ 0x84);
        N.llllIIll[63] = -(0xFFFFFBEE & 0x5C19) & (0xFFFFFFFF & 0x7B2F);
        N.llllIIll[64] = -(0xFFFFFFD5 & 0x7A6B) & (0xFFFFFF6C & 0x7BFF);
        N.llllIIll[65] = 0xFFFFF5FE & 0xBF5;
        N.llllIIll[66] = 0xFFFFF3DC & 0x3EEB;
        N.llllIIll[67] = -(0xFFFFE741 & 0x58FF) & (0xFFFFFF6F & 0x4FDD);
        N.llllIIll[68] = 0xFFFFEFDD & 0x3EEE;
        N.llllIIll[69] = -(0xFFFF9673 & 0x7FDE) & (0xFFFFF7FF & 0x7FF9);
        N.llllIIll[70] = 0xFFFFDF6F & 0x3FD7;
        N.llllIIll[71] = -(0xFFFFF7BF & 0x7C74) & (0xFFFFF7F7 & 0x7FBF);
        N.llllIIll[72] = 0xD5 ^ 0xB1;
        N.llllIIll[73] = 0x33 ^ 0x26 ^ (0x52 ^ 0x76);
        N.llllIIll[74] = 0xC2 ^ 0xA1;
        N.llllIIll[75] = 0xD6 ^ 0xB0 ^ (0x62 ^ 0x36);
        N.llllIIll[76] = 72 + 40 - 2 + 31 ^ 58 + 150 - 47 + 29;
        N.llllIIll[77] = -(0xFFFFEC75 & 0x7B9B) & (0xFFFFFDFD & 0x6FF6);
        N.llllIIll[78] = 0xA7 ^ 0x93;
        N.llllIIll[79] = 0x79 ^ 0x4C;
        N.llllIIll[80] = 0x6A ^ 0x3D ^ (0x41 ^ 0x20);
        N.llllIIll[81] = 155 + 211 - 235 + 110 ^ 77 + 7 - 31 + 145;
        N.llllIIll[82] = 0x31 ^ 9;
        N.llllIIll[83] = -(0xFFFFEE7E & 0x7783) & (0xFFFFEFFF & 0x7FCB);
        N.llllIIll[84] = -(0xFFFFB773 & 0x5A9F) & (0xFFFFDFFF & 0x3FF6);
        N.llllIIll[85] = 0xFFFF99F7 & 0x6FDD;
        N.llllIIll[86] = 0xFFFFCFFD & 0x3DF6;
        N.llllIIll[87] = 0xFFFFABEC & 0x5DF7;
        N.llllIIll[88] = 0xFFFF9DD5 & 0x6F7E;
        N.llllIIll[89] = 0xFFFFB7F7 & 0x4DEF;
        N.llllIIll[90] = -(0xFFFFFBEF & 0x741B) & (0xFFFFFDFF & 0x77FB);
        N.llllIIll[91] = 0xFFFFB5EF & 0x4FFF;
        N.llllIIll[92] = -(0xFFFFBF67 & 0x7CD9) & (0xFFFFBDFF & 0x7F7D);
        N.llllIIll[93] = -(0xFFFFFD5F & 0x7EB9) & (0xFFFFFDFF & 0x7F5F);
        N.llllIIll[94] = -(0xFFFFF263 & 0x3F9D) & (0xFFFFFB7B & 0x37CF);
        N.llllIIll[95] = -(0xFFFFFE7D & 0x7DA7) & (0xFFFFFDFD & 0x7F7F);
        N.llllIIll[96] = 0xFFFFC3EF & 0x3D5F;
        N.llllIIll[97] = -(0xFFFFFAFE & 0x4733) & (0xFFFFFF77 & 0x6EFB);
        N.llllIIll[98] = -(0xFFFFD31E & 0x6DED) & (0xFFFFFD4F & 0x6FFF);
        N.llllIIll[99] = 0xFFFFBF57 & 0x6CE8;
        N.llllIIll[100] = 10 + 116 - -7 + 51 ^ 49 + 11 - 24 + 93;
    }

    private static String llIIlIIIIII(String lIIlllIIllIIlIl, String lIIlllIIllIIllI) {
        try {
            SecretKeySpec lIIlllIIllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlllIIllIIllI.getBytes(StandardCharsets.UTF_8)), llllIIll[13]), "DES");
            Cipher lIIlllIIllIlIIl = Cipher.getInstance("DES");
            lIIlllIIllIlIIl.init(llllIIll[2], lIIlllIIllIlIlI);
            return new String(lIIlllIIllIlIIl.doFinal(Base64.getDecoder().decode(lIIlllIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlllIIllIlIII) {
            lIIlllIIllIlIII.printStackTrace();
            return null;
        }
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
                            0;
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
            0;
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

    private static String llIIlIIIIIl(String lIIlllIIlIlIlll, String lIIlllIIlIlIllI) {
        lIIlllIIlIlIlll = new String(Base64.getDecoder().decode(lIIlllIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlllIIlIlIlIl = new StringBuilder();
        char[] lIIlllIIlIlIlII = lIIlllIIlIlIllI.toCharArray();
        int lIIlllIIlIlIIll = llllIIll[0];
        char[] lIIlllIIlIIllIl = lIIlllIIlIlIlll.toCharArray();
        int lIIlllIIlIIllII = lIIlllIIlIIllIl.length;
        int lIIlllIIlIIlIll = llllIIll[0];
        while (N.llIIlIIIllI(lIIlllIIlIIlIll, lIIlllIIlIIllII)) {
            char lIIlllIIlIllIII = lIIlllIIlIIllIl[lIIlllIIlIIlIll];
            lIIlllIIlIlIlIl.append((char)(lIIlllIIlIllIII ^ lIIlllIIlIlIlII[lIIlllIIlIlIIll % lIIlllIIlIlIlII.length]));
            0;
            ++lIIlllIIlIlIIll;
            ++lIIlllIIlIIlIll;
            0;
            
            return null;
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

