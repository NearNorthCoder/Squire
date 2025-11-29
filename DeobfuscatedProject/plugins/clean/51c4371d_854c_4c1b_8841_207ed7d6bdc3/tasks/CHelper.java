/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
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
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.QHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.UHelper;
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
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CHelper
implements F {
    private static final  int ia;
    static  String hI;
    static  int ci;
    private static final  int ig;
    private static final  int hZ;
    private static final  int ih;
    private static final  int hY;
    
    public static  List<d> bB;
    static  boolean cj;
    private static final  WorldPoint hW;
    
    private static final  int if;
    static  String[] gx;
    private static final  int hX;
    private static final  int ic;
    static  int bZ;
    private static final  int id;
    public static  boolean bz;
    private static final  int ib;
    private static final  int ie;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean bm() {
        int n2;
        String[] stringArray = new String[lIlllIIl[1]];
        stringArray[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[67]];
        if (C.lIIllIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIlllIIl[1]];
            stringArray2[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[68]];
            if (C.lIIllIlllIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIlllIIl[1]];
                stringArray3[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[45]];
                if (C.lIIllIlllIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIlllIIl[1]];
                    stringArray4[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[69]];
                    if (C.lIIllIlllIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        int[] nArray = new int[lIlllIIl[1]];
                        nArray[C.lIlllIIl[0]] = lIlllIIl[10];
                        if (C.lIIllIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIlllIIl[1]];
                            nArray2[C.lIlllIIl[0]] = lIlllIIl[15];
                            if (C.lIIllIlllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                int[] nArray3 = new int[lIlllIIl[1]];
                                nArray3[C.lIlllIIl[0]] = lIlllIIl[13];
                                if (C.lIIllIlllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    int[] nArray4 = new int[lIlllIIl[1]];
                                    nArray4[C.lIlllIIl[0]] = lIlllIIl[7];
                                    if (C.lIIllIlllIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                        int[] nArray5 = new int[lIlllIIl[1]];
                                        nArray5[C.lIlllIIl[0]] = lIlllIIl[25];
                                        if (C.lIIllIlllIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                            String[] stringArray5 = new String[lIlllIIl[1]];
                                            stringArray5[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[70]];
                                            if (C.lIIllIlllIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                                n2 = lIlllIIl[1];

                                                if (2 > 0) return n2 != 0;
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlllIIl[0];
        return n2 != 0;
    }

    private static boolean lIIllIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIlllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void bJ() {
        void lIlIllllIllIIll;
        BankLocation bankLocation = BankLocation.getNearest();
        if (C.lIIlllIIIII(bankLocation) && C.lIIllIlllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlll[lIlllIIl[71]];
            a.a(bankLocation);
        }
        if (C.lIIlllIIIII(lIlIllllIllIIll) && C.lIIllIlllIl(lIlIllllIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (C.lIIllIlllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlll[lIlllIIl[72]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIIl[5]);

            }
            if (C.lIIllIlllIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderBarrows.c = lIllIlll[lIlllIIl[73]];
                if (C.lIIlllIIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIlllIIl[4]);

                }
                if (C.lIIlllIIIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIlllIIl[3]);

                }
                String[] stringArray = new String[lIlllIIl[1]];
                stringArray[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[74]];
                if (C.lIIllIlllIl(Bank.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIlllIIl[1]];
                    stringArray2[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[75]];
                    if (C.lIIllIllllI(Bank.getFirst((String[])stringArray2).getQuantity(), lIlllIIl[11])) {
                        C.ag();
                        System.out.println(lIllIlll[lIlllIIl[76]]);
                        bz = lIlllIIl[1];
                        return;
                    }
                }
                String[] stringArray3 = new String[lIlllIIl[1]];
                stringArray3[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[77]];
                if (C.lIIllIlllIl(Bank.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIlllIIl[1]];
                    stringArray4[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[78]];
                    if (C.lIIllIllllI(Bank.getFirst((String[])stringArray4).getQuantity(), lIlllIIl[11])) {
                        C.ag();
                        System.out.println(lIllIlll[lIlllIIl[79]]);
                        bz = lIlllIIl[1];
                        return;
                    }
                }
                String[] stringArray5 = new String[lIlllIIl[1]];
                stringArray5[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[80]];
                if (C.lIIllIlllIl(Bank.contains((String[])stringArray5) ? 1 : 0)) {
                    String[] stringArray6 = new String[lIlllIIl[1]];
                    stringArray6[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[81]];
                    if (C.lIIllIllllI(Bank.getFirst((String[])stringArray6).getQuantity(), lIlllIIl[11])) {
                        C.ag();
                        System.out.println(lIllIlll[lIlllIIl[82]]);
                        bz = lIlllIIl[1];
                        return;
                    }
                }
                int[] nArray = new int[lIlllIIl[19]];
                nArray[C.lIlllIIl[0]] = lIlllIIl[20];
                nArray[C.lIlllIIl[1]] = lIlllIIl[21];
                nArray[C.lIlllIIl[3]] = lIlllIIl[22];
                nArray[C.lIlllIIl[4]] = lIlllIIl[23];
                nArray[C.lIlllIIl[6]] = lIlllIIl[24];
                nArray[C.lIlllIIl[9]] = lIlllIIl[7];
                nArray[C.lIlllIIl[12]] = lIlllIIl[17];
                nArray[C.lIlllIIl[14]] = lIlllIIl[25];
                nArray[C.lIlllIIl[16]] = lIlllIIl[10];
                nArray[C.lIlllIIl[18]] = lIlllIIl[15];
                nArray[C.lIlllIIl[8]] = lIlllIIl[13];
                if (C.lIIllIlllll(e.b(nArray) ? 1 : 0)) {
                    C.ag();
                    System.out.println(lIllIlll[lIlllIIl[83]]);
                    bz = lIlllIIl[1];
                    return;
                }
                while (C.lIIllIlllll(u.aV() ? 1 : 0)) {
                    u.aT();
                    Time.sleepTicks((int)lIlllIIl[1]);

                    if (3 != ((0xA7 ^ 0xA2) & ~(0xB6 ^ 0xB3))) continue;
                    return;
                }
                if (C.lIIllIlllll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lIlllIIl[6]);

                }
                int[] nArray2 = new int[lIlllIIl[1]];
                nArray2[C.lIlllIIl[0]] = lIlllIIl[22];
                if (C.lIIllIlllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIlllIIl[1]];
                    nArray3[C.lIlllIIl[0]] = lIlllIIl[22];
                    if (C.lIIllIllllI(Inventory.getCount((int[])nArray3), lIlllIIl[1])) {
                        Bank.withdraw((int)lIlllIIl[22], (int)lIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[22];
                            if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIl[1];

                            } else {
                                bl = lIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIl[5]);

                    }
                }
                int[] nArray4 = new int[lIlllIIl[1]];
                nArray4[C.lIlllIIl[0]] = lIlllIIl[23];
                if (C.lIIllIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[lIlllIIl[1]];
                    nArray5[C.lIlllIIl[0]] = lIlllIIl[23];
                    if (C.lIIllIllllI(Inventory.getCount((int[])nArray5), lIlllIIl[1])) {
                        Bank.withdraw((int)lIlllIIl[23], (int)lIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[23];
                            if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIl[1];

                                if (((0x9C ^ 0xC5) & ~(0xF1 ^ 0xA8)) != 0) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIl[5]);

                    }
                }
                int[] nArray6 = new int[lIlllIIl[1]];
                nArray6[C.lIlllIIl[0]] = lIlllIIl[21];
                if (C.lIIllIlllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    int[] nArray7 = new int[lIlllIIl[1]];
                    nArray7[C.lIlllIIl[0]] = lIlllIIl[21];
                    if (C.lIIllIllllI(Inventory.getCount((int[])nArray7), lIlllIIl[1])) {
                        Bank.withdraw((int)lIlllIIl[21], (int)lIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[21];
                            if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIl[1];

                                if (-(0xD1 ^ 0x96 ^ (0x18 ^ 0x5B)) >= 0) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIl[5]);

                    }
                }
                int[] nArray8 = new int[lIlllIIl[1]];
                nArray8[C.lIlllIIl[0]] = lIlllIIl[24];
                if (C.lIIllIlllIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    int[] nArray9 = new int[lIlllIIl[1]];
                    nArray9[C.lIlllIIl[0]] = lIlllIIl[24];
                    if (C.lIIllIllllI(Inventory.getCount((int[])nArray9), lIlllIIl[1])) {
                        Bank.withdraw((int)lIlllIIl[24], (int)lIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[24];
                            if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIl[1];

                            } else {
                                bl = lIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIl[5]);

                    }
                }
                int[] nArray10 = new int[lIlllIIl[1]];
                nArray10[C.lIlllIIl[0]] = lIlllIIl[7];
                if (C.lIIllIlllIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    int[] nArray11 = new int[lIlllIIl[1]];
                    nArray11[C.lIlllIIl[0]] = lIlllIIl[7];
                    if (C.lIIllIllllI(Inventory.getCount((int[])nArray11), lIlllIIl[1])) {
                        Bank.withdraw((int)lIlllIIl[7], (int)lIlllIIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[7];
                            if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIl[1];

                            } else {
                                bl = lIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIl[5]);

                    }
                }
                int[] nArray12 = new int[lIlllIIl[1]];
                nArray12[C.lIlllIIl[0]] = lIlllIIl[17];
                if (C.lIIllIlllIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    int[] nArray13 = new int[lIlllIIl[1]];
                    nArray13[C.lIlllIIl[0]] = lIlllIIl[17];
                    if (C.lIIllIllllI(Inventory.getCount((int[])nArray13), lIlllIIl[1])) {
                        Bank.withdraw((int)lIlllIIl[17], (int)lIlllIIl[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[17];
                            if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIl[1];

                                if (1 == 0) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIl[5]);

                    }
                }
                int[] nArray14 = new int[lIlllIIl[1]];
                nArray14[C.lIlllIIl[0]] = lIlllIIl[10];
                if (C.lIIllIlllIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    int[] nArray15 = new int[lIlllIIl[1]];
                    nArray15[C.lIlllIIl[0]] = lIlllIIl[10];
                    if (C.lIIllIllllI(Inventory.getCount((int[])nArray15), lIlllIIl[1])) {
                        Bank.withdraw((int)lIlllIIl[10], (int)lIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[10];
                            if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIl[1];

                                if (3 < 2) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIl[5]);

                    }
                }
                int[] nArray16 = new int[lIlllIIl[1]];
                nArray16[C.lIlllIIl[0]] = lIlllIIl[15];
                if (C.lIIllIlllIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlllIIl[1]];
                    nArray17[C.lIlllIIl[0]] = lIlllIIl[15];
                    if (C.lIIllIllllI(Inventory.getCount((int[])nArray17), lIlllIIl[1])) {
                        Bank.withdraw((int)lIlllIIl[15], (int)lIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[15];
                            if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIl[1];

                                if (1 > (21 + 86 - 63 + 152 ^ 64 + 105 - 100 + 123)) {
                                    return ((3 ^ 0x5F ^ (0x43 ^ 0x4C)) & (0x57 ^ 0x2F ^ (0x1F ^ 0x34) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIl[5]);

                    }
                }
                int[] nArray18 = new int[lIlllIIl[1]];
                nArray18[C.lIlllIIl[0]] = lIlllIIl[13];
                if (C.lIIllIlllIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                    int[] nArray19 = new int[lIlllIIl[1]];
                    nArray19[C.lIlllIIl[0]] = lIlllIIl[13];
                    if (C.lIIllIllllI(Inventory.getCount((int[])nArray19), lIlllIIl[1])) {
                        Bank.withdraw((int)lIlllIIl[13], (int)lIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[13];
                            if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIl[1];

                                if ((6 ^ 2) == 0) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIl[5]);

                    }
                }
                int[] nArray20 = new int[lIlllIIl[1]];
                nArray20[C.lIlllIIl[0]] = lIlllIIl[27];
                if (C.lIIllIlllIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIlllIIl[1]];
                    nArray21[C.lIlllIIl[0]] = lIlllIIl[27];
                    if (C.lIIllIlllll(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                        Bank.withdraw((int)lIlllIIl[27], (int)lIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIl[1]);

                        Time.sleepUntil(() -> {
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[27];
                            return Inventory.contains((int[])nArray);
                        }, (int)lIlllIIl[5]);

                    }
                }
                int[] nArray22 = new int[lIlllIIl[1]];
                nArray22[C.lIlllIIl[0]] = lIlllIIl[25];
                if (C.lIIllIlllIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lIlllIIl[1]];
                    nArray23[C.lIlllIIl[0]] = lIlllIIl[25];
                    if (C.lIIllIllllI(Inventory.getCount((int[])nArray23), lIlllIIl[1])) {
                        Bank.withdrawAll((int)lIlllIIl[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlllIIl[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[25];
                            if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIlllIIl[1];

                                if (((0x5E ^ 0x1A) & ~(0xCE ^ 0x8A)) >= 3) {
                                    return false;
                                }
                            } else {
                                bl = lIlllIIl[0];
                            }
                            return bl;
                        }, (int)lIlllIIl[5]);

                    }
                }
            }
        }
    }

    @Override
    public int U() {
        try {
            C.bI();

        }
        catch (Exception lIlIllllIlIlIll) {
            lIlIllllIlIlIll.printStackTrace();
        }
        if (2 <= 0) {
            return (0x6E ^ 0x46) & ~(0xA9 ^ 0x81);
        }
        return lIlllIIl[42];
    }

    @Override
    public boolean T() {
        return lIlllIIl[0];
    }

    private static boolean lIIlllIIIIl(int n2) {
        return n2 > 0;
    }

    @Override
    public String V() {
        return lIllIlll[lIlllIIl[84]];
    }

    private static boolean lIIlllIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (C.lIIlllIIlIl(e.j(lIlllIIl[2]), lIlllIIl[3])) {
            bl = lIlllIIl[1];

            }
        } else {
            bl = lIlllIIl[0];
        }
        return bl;
    }

    public static void bI() {
        if (C.lIIllIlllIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIllIlll[lIlllIIl[0]];
            b.a(bB);
            if (C.lIIllIllllI(bB.size(), lIlllIIl[1])) {
                System.out.println(lIllIlll[lIlllIIl[1]]);
                bz = lIlllIIl[0];
            }
        }
        if (C.lIIllIlllll(bz ? 1 : 0)) {
            if (C.lIIllIlllll(e.j(lIlllIIl[2]))) {
                BankLocation lIlIllllllIIIIl;
                if (C.lIIllIlllll(C.bm() ? 1 : 0)) {
                    lIlIllllllIIIIl = BankLocation.getNearest();
                    if (C.lIIlllIIIII(lIlIllllllIIIIl) && C.lIIllIlllll(lIlIllllllIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIllIlll[lIlllIIl[3]];
                        a.a(lIlIllllllIIIIl);
                    }
                    if (C.lIIlllIIIII(lIlIllllllIIIIl) && C.lIIllIlllIl(lIlIllllllIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (C.lIIllIlllll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = lIllIlll[lIlllIIl[4]];
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIIl[5]);

                        }
                        if (C.lIIllIlllIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = lIllIlll[lIlllIIl[6]];
                            if (C.lIIlllIIIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlllIIl[4]);

                            }
                            if (C.lIIlllIIIIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlllIIl[3]);

                            }
                            int[] nArray = new int[lIlllIIl[1]];
                            nArray[C.lIlllIIl[0]] = lIlllIIl[7];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIlllIIl[1]];
                                nArray2[C.lIlllIIl[0]] = lIlllIIl[7];
                                if (C.lIIllIllllI(Bank.getFirst((int[])nArray2).getQuantity(), lIlllIIl[8])) {
                                    C.ag();
                                    System.out.println(lIllIlll[lIlllIIl[9]]);
                                    bz = lIlllIIl[1];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIlllIIl[1]];
                            nArray3[C.lIlllIIl[0]] = lIlllIIl[10];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlllIIl[1]];
                                nArray4[C.lIlllIIl[0]] = lIlllIIl[10];
                                if (C.lIIllIllllI(Bank.getFirst((int[])nArray4).getQuantity(), lIlllIIl[11])) {
                                    C.ag();
                                    System.out.println(lIllIlll[lIlllIIl[12]]);
                                    bz = lIlllIIl[1];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lIlllIIl[1]];
                            nArray5[C.lIlllIIl[0]] = lIlllIIl[13];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIlllIIl[1]];
                                nArray6[C.lIlllIIl[0]] = lIlllIIl[13];
                                if (C.lIIllIllllI(Bank.getFirst((int[])nArray6).getQuantity(), lIlllIIl[11])) {
                                    C.ag();
                                    System.out.println(lIllIlll[lIlllIIl[14]]);
                                    bz = lIlllIIl[1];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lIlllIIl[1]];
                            nArray7[C.lIlllIIl[0]] = lIlllIIl[15];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIlllIIl[1]];
                                nArray8[C.lIlllIIl[0]] = lIlllIIl[15];
                                if (C.lIIllIllllI(Bank.getFirst((int[])nArray8).getQuantity(), lIlllIIl[11])) {
                                    C.ag();
                                    System.out.println(lIllIlll[lIlllIIl[16]]);
                                    bz = lIlllIIl[1];
                                    return;
                                }
                            }
                            int[] nArray9 = new int[lIlllIIl[1]];
                            nArray9[C.lIlllIIl[0]] = lIlllIIl[17];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlllIIl[1]];
                                nArray10[C.lIlllIIl[0]] = lIlllIIl[17];
                                if (C.lIIllIllllI(Bank.getFirst((int[])nArray10).getQuantity(), lIlllIIl[9])) {
                                    C.ag();
                                    System.out.println(lIllIlll[lIlllIIl[18]]);
                                    bz = lIlllIIl[1];
                                    return;
                                }
                            }
                            int[] nArray11 = new int[lIlllIIl[19]];
                            nArray11[C.lIlllIIl[0]] = lIlllIIl[20];
                            nArray11[C.lIlllIIl[1]] = lIlllIIl[21];
                            nArray11[C.lIlllIIl[3]] = lIlllIIl[22];
                            nArray11[C.lIlllIIl[4]] = lIlllIIl[23];
                            nArray11[C.lIlllIIl[6]] = lIlllIIl[24];
                            nArray11[C.lIlllIIl[9]] = lIlllIIl[7];
                            nArray11[C.lIlllIIl[12]] = lIlllIIl[17];
                            nArray11[C.lIlllIIl[14]] = lIlllIIl[25];
                            nArray11[C.lIlllIIl[16]] = lIlllIIl[10];
                            nArray11[C.lIlllIIl[18]] = lIlllIIl[15];
                            nArray11[C.lIlllIIl[8]] = lIlllIIl[13];
                            if (C.lIIllIlllll(e.b(nArray11) ? 1 : 0)) {
                                C.ag();
                                System.out.println(lIllIlll[lIlllIIl[8]]);
                                bz = lIlllIIl[1];
                                return;
                            }
                            while (C.lIIllIlllll(u.aV() ? 1 : 0)) {
                                u.aT();
                                Time.sleepTicks((int)lIlllIIl[1]);

                                if (1 >= 0) continue;
                                return;
                            }
                            if (C.lIIllIlllll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepTicks((int)lIlllIIl[6]);

                            }
                            int[] nArray12 = new int[lIlllIIl[1]];
                            nArray12[C.lIlllIIl[0]] = lIlllIIl[22];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                int[] nArray13 = new int[lIlllIIl[1]];
                                nArray13[C.lIlllIIl[0]] = lIlllIIl[22];
                                if (C.lIIllIllllI(Inventory.getCount((int[])nArray13), lIlllIIl[1])) {
                                    Bank.withdraw((int)lIlllIIl[22], (int)lIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIIl[1]];
                                        nArray[C.lIlllIIl[0]] = lIlllIIl[22];
                                        if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIIl[1];

                                            if (-1 > 2) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIIl[5]);

                                }
                            }
                            int[] nArray14 = new int[lIlllIIl[1]];
                            nArray14[C.lIlllIIl[0]] = lIlllIIl[23];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                int[] nArray15 = new int[lIlllIIl[1]];
                                nArray15[C.lIlllIIl[0]] = lIlllIIl[23];
                                if (C.lIIllIllllI(Inventory.getCount((int[])nArray15), lIlllIIl[1])) {
                                    Bank.withdraw((int)lIlllIIl[23], (int)lIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIIl[1]];
                                        nArray[C.lIlllIIl[0]] = lIlllIIl[23];
                                        if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIIl[1];

                                            if (3 < 0) {
                                                return ((57 + 118 - 48 + 1 ^ 40 + 82 - -49 + 19) & (0x35 ^ 0x62 ^ (0x6F ^ 6) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIIl[5]);

                                }
                            }
                            int[] nArray16 = new int[lIlllIIl[1]];
                            nArray16[C.lIlllIIl[0]] = lIlllIIl[21];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                int[] nArray17 = new int[lIlllIIl[1]];
                                nArray17[C.lIlllIIl[0]] = lIlllIIl[21];
                                if (C.lIIllIllllI(Inventory.getCount((int[])nArray17), lIlllIIl[1])) {
                                    Bank.withdraw((int)lIlllIIl[21], (int)lIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIIl[1]];
                                        nArray[C.lIlllIIl[0]] = lIlllIIl[21];
                                        if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIIl[1];

                                            }
                                        } else {
                                            bl = lIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIIl[5]);

                                }
                            }
                            int[] nArray18 = new int[lIlllIIl[1]];
                            nArray18[C.lIlllIIl[0]] = lIlllIIl[24];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                int[] nArray19 = new int[lIlllIIl[1]];
                                nArray19[C.lIlllIIl[0]] = lIlllIIl[24];
                                if (C.lIIllIllllI(Inventory.getCount((int[])nArray19), lIlllIIl[1])) {
                                    Bank.withdraw((int)lIlllIIl[24], (int)lIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIIl[1]];
                                        nArray[C.lIlllIIl[0]] = lIlllIIl[24];
                                        if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIIl[1];

                                            if (2 <= ((0x41 ^ 0x48) & ~(0x10 ^ 0x19))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIIl[5]);

                                }
                            }
                            int[] nArray20 = new int[lIlllIIl[1]];
                            nArray20[C.lIlllIIl[0]] = lIlllIIl[7];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                int[] nArray21 = new int[lIlllIIl[1]];
                                nArray21[C.lIlllIIl[0]] = lIlllIIl[7];
                                if (C.lIIllIllllI(Inventory.getCount((int[])nArray21), lIlllIIl[1])) {
                                    Bank.withdraw((int)lIlllIIl[7], (int)lIlllIIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIIl[1]];
                                        nArray[C.lIlllIIl[0]] = lIlllIIl[7];
                                        if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIIl[1];

                                            if (3 != 3) {
                                                return ((0xC0 ^ 0xBC ^ (0x36 ^ 0x5B)) & (0x88 ^ 0xC4 ^ (0xDD ^ 0x80) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIIl[5]);

                                }
                            }
                            int[] nArray22 = new int[lIlllIIl[1]];
                            nArray22[C.lIlllIIl[0]] = lIlllIIl[17];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                int[] nArray23 = new int[lIlllIIl[1]];
                                nArray23[C.lIlllIIl[0]] = lIlllIIl[17];
                                if (C.lIIllIllllI(Inventory.getCount((int[])nArray23), lIlllIIl[1])) {
                                    Bank.withdraw((int)lIlllIIl[17], (int)lIlllIIl[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIIl[1]];
                                        nArray[C.lIlllIIl[0]] = lIlllIIl[17];
                                        if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIIl[1];

                                            if (-(51 + 98 - 105 + 89 ^ 8 + 44 - -12 + 64) >= 0) {
                                                return ((115 + 60 - 85 + 118 ^ 146 + 80 - 182 + 106) & (0x80 ^ 0x8F ^ (0xC9 ^ 0x80) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIIl[5]);

                                }
                            }
                            int[] nArray24 = new int[lIlllIIl[1]];
                            nArray24[C.lIlllIIl[0]] = lIlllIIl[10];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
                                int[] nArray25 = new int[lIlllIIl[1]];
                                nArray25[C.lIlllIIl[0]] = lIlllIIl[10];
                                if (C.lIIllIllllI(Inventory.getCount((int[])nArray25), lIlllIIl[1])) {
                                    Bank.withdraw((int)lIlllIIl[10], (int)lIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIIl[1]];
                                        nArray[C.lIlllIIl[0]] = lIlllIIl[10];
                                        if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIIl[1];

                                            }
                                        } else {
                                            bl = lIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIIl[5]);

                                }
                            }
                            int[] nArray26 = new int[lIlllIIl[1]];
                            nArray26[C.lIlllIIl[0]] = lIlllIIl[15];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray26) ? 1 : 0)) {
                                int[] nArray27 = new int[lIlllIIl[1]];
                                nArray27[C.lIlllIIl[0]] = lIlllIIl[15];
                                if (C.lIIllIllllI(Inventory.getCount((int[])nArray27), lIlllIIl[1])) {
                                    Bank.withdraw((int)lIlllIIl[15], (int)lIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIIl[1]];
                                        nArray[C.lIlllIIl[0]] = lIlllIIl[15];
                                        if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIIl[1];

                                            }
                                        } else {
                                            bl = lIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIIl[5]);

                                }
                            }
                            int[] nArray28 = new int[lIlllIIl[1]];
                            nArray28[C.lIlllIIl[0]] = lIlllIIl[13];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray28) ? 1 : 0)) {
                                int[] nArray29 = new int[lIlllIIl[1]];
                                nArray29[C.lIlllIIl[0]] = lIlllIIl[13];
                                if (C.lIIllIllllI(Inventory.getCount((int[])nArray29), lIlllIIl[1])) {
                                    Bank.withdraw((int)lIlllIIl[13], (int)lIlllIIl[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIIl[1]];
                                        nArray[C.lIlllIIl[0]] = lIlllIIl[13];
                                        if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIIl[1];

                                            }
                                        } else {
                                            bl = lIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIIl[5]);

                                }
                            }
                            int[] nArray30 = new int[lIlllIIl[1]];
                            nArray30[C.lIlllIIl[0]] = lIlllIIl[27];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray30) ? 1 : 0)) {
                                int[] nArray31 = new int[lIlllIIl[1]];
                                nArray31[C.lIlllIIl[0]] = lIlllIIl[27];
                                if (C.lIIllIlllll(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                                    Bank.withdraw((int)lIlllIIl[27], (int)lIlllIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIlllIIl[1]];
                                        nArray[C.lIlllIIl[0]] = lIlllIIl[27];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIlllIIl[5]);

                                }
                            }
                            int[] nArray32 = new int[lIlllIIl[1]];
                            nArray32[C.lIlllIIl[0]] = lIlllIIl[25];
                            if (C.lIIllIlllIl(Bank.contains((int[])nArray32) ? 1 : 0)) {
                                int[] nArray33 = new int[lIlllIIl[1]];
                                nArray33[C.lIlllIIl[0]] = lIlllIIl[25];
                                if (C.lIIllIllllI(Inventory.getCount((int[])nArray33), lIlllIIl[1])) {
                                    Bank.withdrawAll((int)lIlllIIl[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlllIIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlllIIl[1]];
                                        nArray[C.lIlllIIl[0]] = lIlllIIl[25];
                                        if (C.lIIlllIIIIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlllIIl[1];

                                            if (((0xB4 ^ 0x8E) & ~(0x87 ^ 0xBD)) > ((0xD6 ^ 0xC6) & ~(0x22 ^ 0x32))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIlllIIl[0];
                                        }
                                        return bl;
                                    }, (int)lIlllIIl[5]);

                                }
                            }
                        }
                    }
                }
                if (C.lIIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIIl[6]) && C.lIIlllIIIll(Players.getLocal().getWorldLocation().getPlane(), lIlllIIl[3]) && C.lIIllIlllIl(C.bm() ? 1 : 0)) {
                    if (C.lIIllIlllIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIlllIIl[6]);

                    }
                    AccBuilderBarrows.c = lIllIlll[lIlllIIl[19]];
                    if (C.lIIllIlllll(Bank.isOpen() ? 1 : 0)) {
                        if (C.lIIllIllllI(bZ, lIlllIIl[1])) {
                            e.w();
                            bZ += lIlllIIl[1];
                        }
                        if (C.lIIllIlllIl((lIlIllllllIIIIl = new WorldArea(lIlllIIl[28], lIlllIIl[29], lIlllIIl[30], lIlllIIl[31], lIlllIIl[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lIlllIIl[1]];
                            stringArray[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[32]];
                            TileObjects.getNearest((String[])stringArray).interact(lIllIlll[lIlllIIl[33]]);
                            Time.sleepTicks((int)e.c(lIlllIIl[12], lIlllIIl[16]));

                        }
                        Movement.walkTo((WorldPoint)hW);

                        Time.sleepTicks((int)lIlllIIl[3]);

                    }
                }
                if (C.lIIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIIl[12])) {
                    AccBuilderBarrows.c = lIllIlll[lIlllIIl[34]];
                    ci = lIlllIIl[0];
                    g.a(hI, gx);
                    if (C.lIIllIlllIl(g.L() ? 1 : 0)) {
                        g.a(gx);
                    }
                }
            }
            if (C.lIIlllIIIIl(e.j(lIlllIIl[2])) && C.lIIllIllllI(e.j(lIlllIIl[2]), lIlllIIl[3])) {
                if (C.lIIllIlllll(C.bm() ? 1 : 0)) {
                    C.bJ();
                }
                if (C.lIIllIlllIl(C.bm() ? 1 : 0)) {
                    if (C.lIIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIIl[12])) {
                        AccBuilderBarrows.c = lIllIlll[lIlllIIl[31]];
                        if (C.lIIllIlllIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)hW);

                        Time.sleepTicks((int)lIlllIIl[1]);

                    }
                    if (C.lIIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIIl[12])) {
                        AccBuilderBarrows.c = lIllIlll[lIlllIIl[35]];
                        if (C.lIIllIllllI(ci, lIlllIIl[1])) {
                            Q.mv += lIlllIIl[1];
                            Q.o(AccBuilderBarrows.m);
                            ci += lIlllIIl[1];
                            Q.mv = lIlllIIl[0];
                            cj = lIlllIIl[0];
                        }
                        g.a(hI, gx);
                        if (C.lIIllIlllIl(g.L() ? 1 : 0)) {
                            g.a(gx);
                        }
                    }
                }
            }
            System.out.println("Setting: " + e.j(lIlllIIl[2]));
            g.a(new String[lIlllIIl[0]]);
        }
    }

    private static boolean lIIlllIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllIlllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void ag() {
        d lIlIlllllIlllIl;
        block37: {
            block36: {
                block35: {
                    block34: {
                        Object lIlIlllllIllllI;
                        block33: {
                            block32: {
                                int[] nArray = new int[lIlllIIl[1]];
                                nArray[C.lIlllIIl[0]] = lIlllIIl[21];
                                if (C.lIIllIlllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    System.out.println(lIllIlll[lIlllIIl[36]]);
                                    d d2 = new DHelper(lIlllIIl[21], lIlllIIl[1], lIlllIIl[37]);
                                    bB.add(d2);

                                }
                                int[] nArray2 = new int[lIlllIIl[1]];
                                nArray2[C.lIlllIIl[0]] = lIlllIIl[22];
                                if (C.lIIllIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    System.out.println(lIllIlll[lIlllIIl[38]]);
                                    lIlIlllllIllllI = new DHelper(lIlllIIl[22], lIlllIIl[1], lIlllIIl[39]);
                                    bB.add((DHelper) IlIlllllIllllI);

                                }
                                int[] nArray3 = new int[lIlllIIl[1]];
                                nArray3[C.lIlllIIl[0]] = lIlllIIl[23];
                                if (C.lIIllIlllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    System.out.println(lIllIlll[lIlllIIl[40]]);
                                    lIlIlllllIllllI = new DHelper(lIlllIIl[23], lIlllIIl[1], lIlllIIl[39]);
                                    bB.add((DHelper) IlIlllllIllllI);

                                }
                                int[] nArray4 = new int[lIlllIIl[1]];
                                nArray4[C.lIlllIIl[0]] = lIlllIIl[24];
                                if (C.lIIllIlllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    System.out.println(lIllIlll[lIlllIIl[30]]);
                                    lIlIlllllIllllI = new DHelper(lIlllIIl[24], lIlllIIl[1], lIlllIIl[39]);
                                    bB.add((DHelper) IlIlllllIllllI);

                                }
                                int[] nArray5 = new int[lIlllIIl[1]];
                                nArray5[C.lIlllIIl[0]] = lIlllIIl[25];
                                if (C.lIIllIlllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    System.out.println(lIllIlll[lIlllIIl[41]]);
                                    lIlIlllllIllllI = new DHelper(lIlllIIl[25], lIlllIIl[42], lIlllIIl[43]);
                                    bB.add((DHelper) IlIlllllIllllI);

                                }
                                int[] nArray6 = new int[lIlllIIl[1]];
                                nArray6[C.lIlllIIl[0]] = lIlllIIl[25];
                                if (C.lIIllIlllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                    int[] nArray7 = new int[lIlllIIl[1]];
                                    nArray7[C.lIlllIIl[0]] = lIlllIIl[25];
                                    if (C.lIIllIllllI(Bank.getFirst((int[])nArray7).getQuantity(), lIlllIIl[30])) {
                                        System.out.println(lIllIlll[lIlllIIl[44]]);
                                        lIlIlllllIllllI = new DHelper(lIlllIIl[25], lIlllIIl[45], lIlllIIl[43]);
                                        bB.add((DHelper) IlIlllllIllllI);

                                    }
                                }
                                int[] nArray8 = new int[lIlllIIl[1]];
                                nArray8[C.lIlllIIl[0]] = lIlllIIl[17];
                                if (C.lIIllIlllll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                    System.out.println(lIllIlll[lIlllIIl[46]]);
                                    lIlIlllllIllllI = new DHelper(lIlllIIl[17], lIlllIIl[9], lIlllIIl[47]);
                                    bB.add((DHelper) IlIlllllIllllI);

                                }
                                int[] nArray9 = new int[lIlllIIl[1]];
                                nArray9[C.lIlllIIl[0]] = lIlllIIl[17];
                                if (!C.lIIllIlllIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block32;
                                int[] nArray10 = new int[lIlllIIl[1]];
                                nArray10[C.lIlllIIl[0]] = lIlllIIl[17];
                                if (!C.lIIllIlllIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block33;
                                int[] nArray11 = new int[lIlllIIl[1]];
                                nArray11[C.lIlllIIl[0]] = lIlllIIl[17];
                                if (!C.lIIllIllllI(Bank.getFirst((int[])nArray11).getQuantity(), lIlllIIl[9])) break block33;
                            }
                            System.out.println(lIllIlll[lIlllIIl[48]]);
                            lIlIlllllIllllI = new DHelper(lIlllIIl[17], lIlllIIl[9], lIlllIIl[47]);
                            bB.add((DHelper) IlIlllllIllllI);

                        }
                        if (C.lIIllIlllll(Bank.contains((Predicate)(lIlIlllllIllllI = item -> item.getName().toLowerCase().contains(lIllIlll[lIlllIIl[85]]))) ? 1 : 0)) {
                            System.out.println(lIllIlll[lIlllIIl[49]]);
                            lIlIlllllIlllIl = new DHelper(lIlllIIl[50], lIlllIIl[38], lIlllIIl[51]);
                            bB.add(lIlIlllllIlllIl);

                        }
                        int[] nArray = new int[lIlllIIl[1]];
                        nArray[C.lIlllIIl[0]] = lIlllIIl[20];
                        if (!C.lIIllIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray12 = new int[lIlllIIl[1]];
                        nArray12[C.lIlllIIl[0]] = lIlllIIl[20];
                        if (!C.lIIllIlllIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block35;
                        int[] nArray13 = new int[lIlllIIl[1]];
                        nArray13[C.lIlllIIl[0]] = lIlllIIl[20];
                        if (!C.lIIllIllllI(Bank.getFirst((int[])nArray13).getQuantity(), lIlllIIl[30])) break block35;
                    }
                    System.out.println(lIllIlll[lIlllIIl[52]]);
                    lIlIlllllIlllIl = new DHelper(lIlllIIl[20], lIlllIIl[45], lIlllIIl[53]);
                    bB.add(lIlIlllllIlllIl);

                }
                int[] nArray = new int[lIlllIIl[1]];
                nArray[C.lIlllIIl[0]] = lIlllIIl[7];
                if (C.lIIllIlllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    System.out.println(lIllIlll[lIlllIIl[54]]);
                    lIlIlllllIlllIl = new DHelper(lIlllIIl[7], lIlllIIl[30], lIlllIIl[53]);
                    bB.add(lIlIlllllIlllIl);

                }
                int[] nArray14 = new int[lIlllIIl[1]];
                nArray14[C.lIlllIIl[0]] = lIlllIIl[7];
                if (!C.lIIllIlllIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block36;
                int[] nArray15 = new int[lIlllIIl[1]];
                nArray15[C.lIlllIIl[0]] = lIlllIIl[7];
                if (!C.lIIllIlllIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block37;
                int[] nArray16 = new int[lIlllIIl[1]];
                nArray16[C.lIlllIIl[0]] = lIlllIIl[7];
                if (!C.lIIllIllllI(Bank.getFirst((int[])nArray16).getQuantity(), lIlllIIl[30])) break block37;
            }
            System.out.println(lIllIlll[lIlllIIl[55]]);
            lIlIlllllIlllIl = new DHelper(lIlllIIl[7], lIlllIIl[30], lIlllIIl[53]);
            bB.add(lIlIlllllIlllIl);

        }
        int[] nArray = new int[lIlllIIl[1]];
        nArray[C.lIlllIIl[0]] = lIlllIIl[27];
        if (C.lIIllIlllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(lIllIlll[lIlllIIl[56]]);
            lIlIlllllIlllIl = new DHelper(lIlllIIl[27], lIlllIIl[9], i.bw);
            bB.add(lIlIlllllIlllIl);

        }
        int[] nArray17 = new int[lIlllIIl[1]];
        nArray17[C.lIlllIIl[0]] = lIlllIIl[10];
        if (C.lIIllIlllIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
            int[] nArray18 = new int[lIlllIIl[1]];
            nArray18[C.lIlllIIl[0]] = lIlllIIl[10];
            if (C.lIIllIllllI(Bank.getFirst((int[])nArray18).getQuantity(), lIlllIIl[11])) {
                System.out.println(lIllIlll[lIlllIIl[57]]);
                lIlIlllllIlllIl = new DHelper(lIlllIIl[10], lIlllIIl[58], lIlllIIl[14]);
                bB.add(lIlIlllllIlllIl);

            }
        }
        int[] nArray19 = new int[lIlllIIl[1]];
        nArray19[C.lIlllIIl[0]] = lIlllIIl[59];
        if (C.lIIllIlllIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[lIlllIIl[1]];
            nArray20[C.lIlllIIl[0]] = lIlllIIl[59];
            if (C.lIIllIllllI(Bank.getFirst((int[])nArray20).getQuantity(), lIlllIIl[11])) {
                System.out.println(lIllIlll[lIlllIIl[60]]);
                lIlIlllllIlllIl = new DHelper(lIlllIIl[59], lIlllIIl[58], lIlllIIl[14]);
                bB.add(lIlIlllllIlllIl);

            }
        }
        int[] nArray21 = new int[lIlllIIl[1]];
        nArray21[C.lIlllIIl[0]] = lIlllIIl[15];
        if (C.lIIllIlllIl(Bank.contains((int[])nArray21) ? 1 : 0)) {
            int[] nArray22 = new int[lIlllIIl[1]];
            nArray22[C.lIlllIIl[0]] = lIlllIIl[15];
            if (C.lIIllIllllI(Bank.getFirst((int[])nArray22).getQuantity(), lIlllIIl[11])) {
                System.out.println(lIllIlll[lIlllIIl[61]]);
                lIlIlllllIlllIl = new DHelper(lIlllIIl[15], lIlllIIl[58], lIlllIIl[14]);
                bB.add(lIlIlllllIlllIl);

            }
        }
        int[] nArray23 = new int[lIlllIIl[1]];
        nArray23[C.lIlllIIl[0]] = lIlllIIl[13];
        if (C.lIIllIlllIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
            int[] nArray24 = new int[lIlllIIl[1]];
            nArray24[C.lIlllIIl[0]] = lIlllIIl[13];
            if (C.lIIllIllllI(Bank.getFirst((int[])nArray24).getQuantity(), lIlllIIl[11])) {
                System.out.println(lIllIlll[lIlllIIl[62]]);
                lIlIlllllIlllIl = new DHelper(lIlllIIl[13], lIlllIIl[58], lIlllIIl[14]);
                bB.add(lIlIlllllIlllIl);

            }
        }
        int[] nArray25 = new int[lIlllIIl[1]];
        nArray25[C.lIlllIIl[0]] = lIlllIIl[59];
        if (C.lIIllIlllll(Bank.contains((int[])nArray25) ? 1 : 0)) {
            System.out.println(lIllIlll[lIlllIIl[63]]);
            lIlIlllllIlllIl = new DHelper(lIlllIIl[59], lIlllIIl[58], lIlllIIl[14]);
            bB.add(lIlIlllllIlllIl);

        }
        int[] nArray26 = new int[lIlllIIl[1]];
        nArray26[C.lIlllIIl[0]] = lIlllIIl[15];
        if (C.lIIllIlllll(Bank.contains((int[])nArray26) ? 1 : 0)) {
            System.out.println(lIllIlll[lIlllIIl[64]]);
            lIlIlllllIlllIl = new DHelper(lIlllIIl[15], lIlllIIl[58], lIlllIIl[14]);
            bB.add(lIlIlllllIlllIl);

        }
        int[] nArray27 = new int[lIlllIIl[1]];
        nArray27[C.lIlllIIl[0]] = lIlllIIl[13];
        if (C.lIIllIlllll(Bank.contains((int[])nArray27) ? 1 : 0)) {
            System.out.println(lIllIlll[lIlllIIl[65]]);
            lIlIlllllIlllIl = new DHelper(lIlllIIl[13], lIlllIIl[58], lIlllIIl[14]);
            bB.add(lIlIlllllIlllIl);

        }
        int[] nArray28 = new int[lIlllIIl[1]];
        nArray28[C.lIlllIIl[0]] = lIlllIIl[10];
        if (C.lIIllIlllll(Bank.contains((int[])nArray28) ? 1 : 0)) {
            System.out.println(lIllIlll[lIlllIIl[66]]);
            lIlIlllllIlllIl = new DHelper(lIlllIIl[10], lIlllIIl[58], lIlllIIl[14]);
            bB.add(lIlIlllllIlllIl);

        }
    }

    private static boolean lIIlllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        C.lIIllIllIll();
        C.lIIllIlIlll();
        ic = lIlllIIl[10];
        if = lIlllIIl[86];
        hX = lIlllIIl[2];
        id = lIlllIIl[15];
        ie = lIlllIIl[13];
        ia = lIlllIIl[23];
        ih = lIlllIIl[17];
        hY = lIlllIIl[21];
        ig = lIlllIIl[25];
        hZ = lIlllIIl[22];
        ib = lIlllIIl[24];
        hW = new WorldPoint(lIlllIIl[87], lIlllIIl[88], lIlllIIl[3]);
        bB = new ArrayList<d>();
        hI = lIllIlll[lIlllIIl[89]];
        String[] stringArray = new String[lIlllIIl[12]];
        stringArray[C.lIlllIIl[0]] = lIllIlll[lIlllIIl[90]];
        stringArray[C.lIlllIIl[1]] = lIllIlll[lIlllIIl[91]];
        stringArray[C.lIlllIIl[3]] = lIllIlll[lIlllIIl[92]];
        stringArray[C.lIlllIIl[4]] = lIllIlll[lIlllIIl[93]];
        stringArray[C.lIlllIIl[6]] = lIllIlll[lIlllIIl[94]];
        stringArray[C.lIlllIIl[9]] = lIllIlll[lIlllIIl[95]];
        gx = stringArray;
        bZ = lIlllIIl[0];
    }

    private static boolean lIIlllIIIII(Object object) {
        return object != null;
    }

    private static void lIIllIlIlll() {
        lIllIlll = new String[lIlllIIl[96]];
        C.lIllIlll[C.lIlllIIl[0]] = "Buying items";
        C.lIllIlll[C.lIlllIIl[1]] = "Finished buying items, switching back to questing";
        C.lIllIlll[C.lIlllIIl[3]] = "Navigating to bank";
        C.lIllIlll[C.lIlllIIl[4]] = "Opening bank";
        C.lIllIlll[C.lIlllIIl[6]] = "Handling banking";
        C.lIllIlll[C.lIlllIIl[9]] = "We are missing supplies, switching to BUYING";
        C.lIllIlll[C.lIlllIIl[12]] = "We are missing supplies, switching to BUYING";
        C.lIllIlll[C.lIlllIIl[14]] = "We are missing supplies, switching to BUYING";
        C.lIllIlll[C.lIlllIIl[16]] = "We are missing supplies, switching to BUYING";
        C.lIllIlll[C.lIlllIIl[18]] = "We are missing supplies, switching to BUYING";
        C.lIllIlll[C.lIlllIIl[8]] = "We are missing supplies, switching to BUYING";
        C.lIllIlll[C.lIlllIIl[19]] = "Walking to imp start";
        C.lIllIlll[C.lIlllIIl[32]] = "Magic Portal";
        C.lIllIlll[C.lIlllIIl[33]] = "Enter";
        C.lIllIlll[C.lIlllIIl[34]] = "Handling quest";
        C.lIllIlll[C.lIlllIIl[31]] = "Nav to start";
        C.lIllIlll[C.lIlllIIl[35]] = "Finishing quest";
        C.lIllIlll[C.lIlllIIl[36]] = "Adding red bead to buy list";
        C.lIllIlll[C.lIlllIIl[38]] = "Adding yellow bead to buy list";
        C.lIllIlll[C.lIlllIIl[40]] = "Adding black bead to buy list";
        C.lIllIlll[C.lIlllIIl[30]] = "Adding white bead to buy list";
        C.lIllIlll[C.lIlllIIl[41]] = "Adding lobster to buy list";
        C.lIllIlll[C.lIlllIIl[44]] = "Adding lobster to buy list";
        C.lIllIlll[C.lIlllIIl[46]] = "Adding cheese to buy list";
        C.lIllIlll[C.lIlllIIl[48]] = "Adding cheese to buy list";
        C.lIllIlll[C.lIlllIIl[49]] = "Adding wealth to buy list";
        C.lIllIlll[C.lIlllIIl[52]] = "Adding varrock tabs to buy list";
        C.lIllIlll[C.lIlllIIl[54]] = "Adding fally tabs to buy list";
        C.lIllIlll[C.lIlllIIl[55]] = "Adding fally tabs to buy list";
        C.lIllIlll[C.lIlllIIl[56]] = "Adding staminas to buy list";
        C.lIllIlll[C.lIlllIIl[57]] = "Adding mind runes to buy list";
        C.lIllIlll[C.lIlllIIl[60]] = "Adding air runes to buy list";
        C.lIllIlll[C.lIlllIIl[61]] = "Adding water runes to buy list";
        C.lIllIlll[C.lIlllIIl[62]] = "Adding earth runes to buy list";
        C.lIllIlll[C.lIlllIIl[63]] = "Adding air runes to buy list";
        C.lIllIlll[C.lIlllIIl[64]] = "Adding water runes to buy list";
        C.lIllIlll[C.lIlllIIl[65]] = "Adding earth runes to buy list";
        C.lIllIlll[C.lIlllIIl[66]] = "Adding mind runes to buy list";
        C.lIllIlll[C.lIlllIIl[67]] = "Red bead";
        C.lIllIlll[C.lIlllIIl[68]] = "Yellow bead";
        C.lIllIlll[C.lIlllIIl[45]] = "Black bead";
        C.lIllIlll[C.lIlllIIl[69]] = "White bead";
        C.lIllIlll[C.lIlllIIl[70]] = "Cheese";
        C.lIllIlll[C.lIlllIIl[71]] = "Navigating to bank";
        C.lIllIlll[C.lIlllIIl[72]] = "Opening bank";
        C.lIllIlll[C.lIlllIIl[73]] = "Handling banking";
        C.lIllIlll[C.lIlllIIl[74]] = "Mind rune";
        C.lIllIlll[C.lIlllIIl[75]] = "Mind rune";
        C.lIllIlll[C.lIlllIIl[76]] = "We are missing supplies, switching to BUYING";
        C.lIllIlll[C.lIlllIIl[77]] = "Earth rune";
        C.lIllIlll[C.lIlllIIl[78]] = "Earth rune";
        C.lIllIlll[C.lIlllIIl[79]] = "We are missing supplies, switching to BUYING";
        C.lIllIlll[C.lIlllIIl[80]] = "Water rune";
        C.lIllIlll[C.lIlllIIl[81]] = "Water rune";
        C.lIllIlll[C.lIlllIIl[82]] = "We are missing supplies, switching to BUYING";
        C.lIllIlll[C.lIlllIIl[83]] = "We are missing supplies, switching to BUYING";
        C.lIllIlll[C.lIlllIIl[84]] = "Imp Catcher quest";
        C.lIllIlll[C.lIlllIIl[85]] = "ring of wealth (";
        C.lIllIlll[C.lIlllIIl[89]] = "Wizard Mizgog";
        C.lIllIlll[C.lIlllIIl[90]] = "Give me a quest please.";
        C.lIllIlll[C.lIlllIIl[91]] = "I'll try.";
        C.lIllIlll[C.lIlllIIl[92]] = "Actually, I know where to find this stuff.";
        C.lIllIlll[C.lIlllIIl[93]] = "Yes.";
        C.lIllIlll[C.lIlllIIl[94]] = "What's the matter?";
        C.lIllIlll[C.lIlllIIl[95]] = "Ok, I'll see what I can do.";
    }

        return String.valueOf(lIlIlllIlIlIlll);
    }

}

