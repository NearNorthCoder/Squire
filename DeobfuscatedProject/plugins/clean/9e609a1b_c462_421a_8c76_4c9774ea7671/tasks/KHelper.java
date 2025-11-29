/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class KHelper
implements M {
    static  int co;
    public static final  WorldPoint hU;
    private static final  String[] hW;
    public static  List<d> bA;
    public static final  WorldPoint hT;
    
    public static  boolean by;
    static  boolean cp;
    static  int bY;
    public static final  WorldPoint hV;

    public static void cz() {
        block48: {
            BankLocation var1;
            block51: {
                block52: {
                    block50: {
                        block49: {
                            if (K.lIlIIlIlllllIII(by ? 1 : 0)) {
                                AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[0]];
                                b.a(bA);
                                if (K.lIlIIlIlllllIIl(bA.size(), lIIIllllIllIl[1])) {
                                    System.out.println(lIIIllllIlIlI[lIIIllllIllIl[1]]);
                                    by = lIIIllllIllIl[0];
                                }
                            }
                            if (!K.lIlIIlIlllllIlI(by ? 1 : 0)) break block48;
                            if (K.lIlIIlIlllllIII(Inventory.contains((int[])f.ba) ? 1 : 0) && K.lIlIIlIlllllIIl(Movement.getRunEnergy(), lIIIllllIllIl[2])) {
                                Inventory.getFirst((int[])f.ba).interact(lIIIllllIlIlI[lIIIllllIllIl[3]]);
                                Time.sleepTicks((int)lIIIllllIllIl[1]);

                            }
                            if (K.lIlIIlIlllllIll(K.lIlIIlIllllIlll(e.v(), 70.0))) {
                                int[] nArray = new int[lIIIllllIllIl[1]];
                                nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[4];
                                if (K.lIlIIlIlllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray2 = new int[lIIIllllIllIl[1]];
                                    nArray2[K.lIIIllllIllIl[0]] = lIIIllllIllIl[4];
                                    Inventory.getFirst((int[])nArray2).interact(lIIIllllIlIlI[lIIIllllIllIl[5]]);
                                }
                            }
                            if (K.lIlIIlIlllllIlI(Movement.isRunEnabled() ? 1 : 0) && K.lIlIIlIllllllII(Movement.getRunEnergy())) {
                                Movement.toggleRun();
                            }
                            if (!K.lIlIIlIlllllIII(K.S() ? 1 : 0)) break block49;
                            int[] nArray = new int[lIIIllllIllIl[1]];
                            nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[6];
                            if (!K.lIlIIlIllllllII(Inventory.getCount((int[])nArray))) break block50;
                        }
                        if (K.lIlIIlIlllllIIl(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) {
                            var1 = BankLocation.getNearest();
                            if (K.lIlIIlIllllllIl(var1) && K.lIlIIlIlllllIlI(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[8]];
                                Movement.walkTo((BankLocation)var1);

                                Time.sleepTicks((int)lIIIllllIllIl[3]);

                            }
                            if (K.lIlIIlIllllllIl(var1) && K.lIlIIlIlllllIII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[9]];
                                if (K.lIlIIlIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIllIl[10]);

                                }
                                if (K.lIlIIlIlllllIII(Bank.isOpen() ? 1 : 0)) {
                                    if (K.lIlIIlIllllllII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIIllllIllIl[8]);

                                    }
                                    if (K.lIlIIlIllllllII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIIllllIllIl[3]);

                                    }
                                    int[] nArray = new int[lIIIllllIllIl[9]];
                                    nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[11];
                                    nArray[K.lIIIllllIllIl[1]] = lIIIllllIllIl[12];
                                    nArray[K.lIIIllllIllIl[3]] = lIIIllllIllIl[13];
                                    nArray[K.lIIIllllIllIl[5]] = lIIIllllIllIl[14];
                                    nArray[K.lIIIllllIllIl[8]] = lIIIllllIllIl[15];
                                    if (K.lIlIIlIlllllIlI(e.b(nArray) ? 1 : 0)) {
                                        K.W();
                                        System.out.println(lIIIllllIlIlI[lIIIllllIllIl[16]]);
                                        by = lIIIllllIllIl[1];
                                        return;
                                    }
                                    Bank.withdraw((int)lIIIllllIllIl[11], (int)lIIIllllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIllIl[1]);

                                    Bank.withdraw((int)lIIIllllIllIl[14], (int)lIIIllllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIllIl[1]);

                                    Bank.withdraw((int)lIIIllllIllIl[15], (int)lIIIllllIllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIllIl[1]);

                                    Bank.withdraw((int)lIIIllllIllIl[17], (int)lIIIllllIllIl[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIllIl[1]);

                                    Bank.withdraw((int)lIIIllllIllIl[13], (int)lIIIllllIllIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIllIl[1]);

                                    a.b(f.ba, lIIIllllIllIl[1]);
                                    a.a(lIIIllllIllIl[4], lIIIllllIllIl[18]);
                                    a.b(f.bk, lIIIllllIllIl[1]);
                                }
                            }
                        }
                    }
                    if (K.lIlIIlIlllllIIl(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1]) && K.lIlIIlIlllllIII(K.S() ? 1 : 0)) {
                        if (K.lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[5])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[19]];
                            if (K.lIlIIlIlllllIIl(bY, lIIIllllIllIl[1])) {
                                e.w();
                                bY += lIIIllllIllIl[1];
                            }
                            Movement.walkTo((WorldPoint)hT);

                            Time.sleepTicks((int)lIIIllllIllIl[1]);

                        }
                        if (K.lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[9])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[20]];
                            String[] stringArray = new String[lIIIllllIllIl[1]];
                            stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[21]];
                            var1 = TileObjects.getNearest((String[])stringArray);
                            if (K.lIlIIlIllllllIl(var1)) {
                                String[] stringArray2 = new String[lIIIllllIllIl[1]];
                                stringArray2[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[18]];
                                if (K.lIlIIlIlllllIII(var1.hasAction(stringArray2) ? 1 : 0) && K.lIlIIlIllllllll(var1.getWorldLocation().distanceTo(hT), lIIIllllIllIl[16])) {
                                    var1.interact(lIIIllllIlIlI[lIIIllllIllIl[22]]);
                                    Time.sleepTicks((int)lIIIllllIllIl[5]);

                                }
                            }
                            g.a(lIIIllllIlIlI[lIIIllllIllIl[23]], hW, lIIIllllIllIl[1]);
                        }
                    }
                    if (!K.lIlIIllIIIIIIII(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) break block51;
                    String[] stringArray = new String[lIIIllllIllIl[1]];
                    stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[24]];
                    if (!K.lIlIIlIlllllIIl(Inventory.getCount((String[])stringArray), lIIIllllIllIl[1])) break block51;
                    String[] stringArray3 = new String[lIIIllllIllIl[1]];
                    stringArray3[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[25]];
                    if (!K.lIlIIllIIIIIIIl(Inventory.getCount((String[])stringArray3))) break block52;
                    String[] stringArray4 = new String[lIIIllllIllIl[1]];
                    stringArray4[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[26]];
                    if (!K.lIlIIlIllllllII(Inventory.getCount((String[])stringArray4))) break block51;
                }
                co = lIIIllllIllIl[0];
                if (K.lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hU), lIIIllllIllIl[3])) {
                    AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[27]];
                    Movement.walkTo((WorldPoint)hU);

                    Time.sleepTicks((int)lIIIllllIllIl[1]);

                }
                if (K.lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hU), lIIIllllIllIl[3])) {
                    String[] stringArray = new String[lIIIllllIllIl[1]];
                    stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[28]];
                    var1 = Inventory.getFirst((String[])stringArray);
                    String[] stringArray5 = new String[lIIIllllIllIl[1]];
                    stringArray5[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[29]];
                    Item var2 = Inventory.getFirst((String[])stringArray5);
                    if (K.lIlIIlIllllllIl(var1)) {
                        String[] stringArray6 = new String[lIIIllllIllIl[1]];
                        stringArray6[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[30]];
                        var1.useOn(TileObjects.getNearest((String[])stringArray6));
                        Time.sleepTicks((int)lIIIllllIllIl[3]);

                    }
                    if (K.lIlIIlIllllllIl(var2)) {
                        String[] stringArray7 = new String[lIIIllllIllIl[1]];
                        stringArray7[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[31]];
                        var2.useOn(TileObjects.getNearest((String[])stringArray7));
                        Time.sleepTicks((int)lIIIllllIllIl[3]);

                    }
                    Keyboard.type((String)lIIIllllIlIlI[lIIIllllIllIl[32]]);
                }
            }
            if (K.lIlIIllIIIIIIII(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) {
                String[] stringArray = new String[lIIIllllIllIl[1]];
                stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[33]];
                if (K.lIlIIlIllllllII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray8 = new String[lIIIllllIllIl[1]];
                    stringArray8[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[34]];
                    if (K.lIlIIlIlllllIIl(Inventory.getCount((String[])stringArray8), lIIIllllIllIl[1])) {
                        if (K.lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hV), lIIIllllIllIl[3])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[35]];
                            Movement.walkTo((WorldPoint)hV);

                            Time.sleepTicks((int)lIIIllllIllIl[1]);

                        }
                        if (K.lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hV), lIIIllllIllIl[3])) {
                            String[] stringArray9 = new String[lIIIllllIllIl[1]];
                            stringArray9[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[36]];
                            var1 = TileItems.getNearest((String[])stringArray9);
                            if (K.lIlIIllIIIIIIlI(var1)) {
                                String[] stringArray10 = new String[lIIIllllIllIl[1]];
                                stringArray10[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[37]];
                                NPCs.getNearest((String[])stringArray10).interact(lIIIllllIlIlI[lIIIllllIllIl[38]]);
                                Time.sleepTicks((int)lIIIllllIllIl[9]);

                            }
                            if (K.lIlIIlIllllllIl(var1)) {
                                var1.interact(lIIIllllIlIlI[lIIIllllIllIl[39]]);
                                Time.sleepTicks((int)lIIIllllIllIl[3]);

                            }
                        }
                    }
                }
            }
            if (K.lIlIIllIIIIIIII(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[1])) {
                String[] stringArray = new String[lIIIllllIllIl[1]];
                stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[40]];
                if (K.lIlIIlIllllllII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray11 = new String[lIIIllllIllIl[1]];
                    stringArray11[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[41]];
                    if (K.lIlIIlIllllllII(Inventory.getCount((String[])stringArray11))) {
                        if (K.lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[5])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[42]];
                            Movement.walkTo((WorldPoint)hT);

                            Time.sleepTicks((int)lIIIllllIllIl[1]);

                        }
                        if (K.lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[9])) {
                            AccBuilderRat.c = lIIIllllIlIlI[lIIIllllIllIl[43]];
                            g.a(lIIIllllIlIlI[lIIIllllIllIl[44]], hW, lIIIllllIllIl[1]);
                        }
                    }
                }
            }
            if (K.lIlIIllIIIIIIII(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[3])) {
                String[] stringArray = new String[lIIIllllIllIl[1]];
                stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[45]];
                var1 = TileObjects.getNearest((String[])stringArray);
                if (K.lIlIIlIllllllIl(var1)) {
                    String[] stringArray12 = new String[lIIIllllIllIl[1]];
                    stringArray12[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[46]];
                    if (K.lIlIIlIlllllIII(var1.hasAction(stringArray12) ? 1 : 0)) {
                        if (K.lIlIIlIlllllIIl(co, lIIIllllIllIl[1])) {
                            P.ll += lIIIllllIllIl[1];
                            P.d(AccBuilderRat.m);
                            co += lIIIllllIllIl[1];
                            P.ll = lIIIllllIllIl[0];
                            cp = lIIIllllIllIl[0];
                        }
                        var1.interact(lIIIllllIlIlI[lIIIllllIllIl[47]]);
                        Time.sleepTicks((int)lIIIllllIllIl[5]);

                    }
                }
                g.a(hW);
            }
            if (K.lIlIIllIIIIIIII(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[5]) && K.lIlIIlIllllllll(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[41])) {
                int[] nArray = new int[lIIIllllIllIl[1]];
                nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[13];
                if (K.lIlIIlIlllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIIllllIllIl[1]];
                    nArray3[K.lIIIllllIllIl[0]] = lIIIllllIllIl[13];
                    Inventory.getFirst((int[])nArray3).interact(lIIIllllIlIlI[lIIIllllIllIl[48]]);
                    Time.sleepTicks((int)lIIIllllIllIl[16]);

                }
            }
            g.a(new String[lIIIllllIllIl[0]]);
            System.out.println("Setting: " + e.j(lIIIllllIllIl[7]));
        }
    }

    @Override
    public String Z() {
        return lIIIllllIlIlI[lIIIllllIllIl[55]];
    }

    private static boolean lIlIIlIlllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIIIIIIlI(Object object) {
        return object == null;
    }

    @Override
    public boolean aa() {
        int n2;
        if (K.lIlIIllIIIIIIll(e.j(lIIIllllIllIl[7]), lIIIllllIllIl[5]) && K.lIlIIlIlllllllI(Players.getLocal().getWorldLocation().distanceTo(hT), lIIIllllIllIl[41])) {
            n2 = lIIIllllIllIl[1];

            if (((28 + 18 - 31 + 206 ^ 42 + 58 - 41 + 96) & (0xD6 ^ 0x85 ^ (0x7A ^ 0x6F) ^ -1)) != 0) {
                return ((0x5E ^ 0x2B ^ (0xF2 ^ 0xB5)) & (0x8F ^ 0x88 ^ (0x96 ^ 0xA3) ^ -1)) != 0;
            }
        } else {
            n2 = lIIIllllIllIl[0];
        }
        return n2 != 0;
    }

    @Override
    public boolean X() {
        return lIIIllllIllIl[0];
    }

    static {
        K.lIlIIlIllllIllI();
        K.lIlIIlIlllIlIll();
        hT = new WorldPoint(lIIIllllIllIl[57], lIIIllllIllIl[58], lIIIllllIllIl[0]);
        hU = new WorldPoint(lIIIllllIllIl[59], lIIIllllIllIl[60], lIIIllllIllIl[0]);
        hV = new WorldPoint(lIIIllllIllIl[61], lIIIllllIllIl[62], lIIIllllIllIl[0]);
        String[] stringArray = new String[lIIIllllIllIl[5]];
        stringArray[K.lIIIllllIllIl[0]] = lIIIllllIlIlI[lIIIllllIllIl[53]];
        stringArray[K.lIIIllllIllIl[1]] = lIIIllllIlIlI[lIIIllllIllIl[63]];
        stringArray[K.lIIIllllIllIl[3]] = lIIIllllIlIlI[lIIIllllIllIl[64]];
        hW = stringArray;
        bA = new ArrayList<d>();
        bY = lIIIllllIllIl[0];
    }

    private static boolean lIlIIlIlllllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIllllllIl(Object object) {
        return object != null;
    }

        return String.valueOf(var3);
    }

    @Override
    public int Y() {
        try {
            K.cz();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIllllIllIl[54];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIllllIllIl[1]];
        nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[14];
        if (K.lIlIIlIlllllIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIllllIllIl[1]];
            nArray2[K.lIIIllllIllIl[0]] = lIIIllllIllIl[11];
            if (K.lIlIIlIlllllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIllllIllIl[1]];
                nArray3[K.lIIIllllIllIl[0]] = lIIIllllIllIl[15];
                if (K.lIlIIlIlllllIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lIIIllllIllIl[1];

                    if (3 == 3) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIllllIllIl[0];
        return n2 != 0;
    }

    private static void W() {
        d var4;
        Object var5;
        int[] nArray = new int[lIIIllllIllIl[1]];
        nArray[K.lIIIllllIllIl[0]] = lIIIllllIllIl[15];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIIllllIllIl[15], lIIIllllIllIl[1], lIIIllllIllIl[49]);
            bA.add(d2);

        }
        int[] nArray2 = new int[lIIIllllIllIl[1]];
        nArray2[K.lIIIllllIllIl[0]] = lIIIllllIllIl[11];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var5 = new DHelper(lIIIllllIllIl[11], lIIIllllIllIl[1], lIIIllllIllIl[49]);
            bA.add((DHelper) ar5);

        }
        int[] nArray3 = new int[lIIIllllIllIl[1]];
        nArray3[K.lIIIllllIllIl[0]] = lIIIllllIllIl[14];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var5 = new DHelper(lIIIllllIllIl[14], lIIIllllIllIl[1], lIIIllllIllIl[49]);
            bA.add((DHelper) ar5);

        }
        if (K.lIlIIlIlllllIlI(Bank.contains((Predicate)(var5 = item -> item.getName().toLowerCase().contains(lIIIllllIlIlI[lIIIllllIllIl[56]]))) ? 1 : 0)) {
            var4 = new DHelper(lIIIllllIllIl[50], lIIIllllIllIl[9], lIIIllllIllIl[51]);
            bA.add(var4);

        }
        int[] nArray4 = new int[lIIIllllIllIl[1]];
        nArray4[K.lIIIllllIllIl[0]] = lIIIllllIllIl[17];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var4 = new DHelper(lIIIllllIllIl[17], lIIIllllIllIl[18], lIIIllllIllIl[52]);
            bA.add(var4);

        }
        int[] nArray5 = new int[lIIIllllIllIl[1]];
        nArray5[K.lIIIllllIllIl[0]] = lIIIllllIllIl[13];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var4 = new DHelper(lIIIllllIllIl[13], lIIIllllIllIl[53], lIIIllllIllIl[52]);
            bA.add(var4);

        }
        int[] nArray6 = new int[lIIIllllIllIl[1]];
        nArray6[K.lIIIllllIllIl[0]] = lIIIllllIllIl[12];
        if (K.lIlIIlIlllllIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var4 = new DHelper(lIIIllllIllIl[12], lIIIllllIllIl[9], h.bv);
            bA.add(var4);

        }
    }

    private static boolean lIlIIllIIIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIlllllIll(int n2) {
        return n2 < 0;
    }

    private static boolean lIlIIlIllllllII(int n2) {
        return n2 > 0;
    }

    private static void lIlIIlIlllIlIll() {
        lIIIllllIlIlI = new String[lIIIllllIllIl[65]];
        K.lIIIllllIlIlI[K.lIIIllllIllIl[0]] = "Buying items";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[1]] = "Finished buying items, switching back to quest";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[3]] = "Drink";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[5]] = "Eat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[8]] = "Nav to bank";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[9]] = "Handling banking";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[16]] = "We are missing quest supplies, switching to BUYING";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[19]] = "Nav to start";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[20]] = "Starting quest";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[21]] = "Door";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[18]] = "Open";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[22]] = "Open";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[23]] = "Hetty";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[24]] = "Burnt meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[25]] = "Raw rat meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[26]] = "Cooked meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[27]] = "Nav to range";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[28]] = "Raw rat meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[29]] = "Cooked meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[30]] = "Range";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[31]] = "Range";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[32]] = " ";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[33]] = "Burnt meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[34]] = "Rat's tail";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[35]] = "Nav to rat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[36]] = "Rat's tail";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[37]] = "Rat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[38]] = "Attack";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[39]] = "Take";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[40]] = "Burnt meat";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[41]] = "Rat's tail";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[42]] = "Nav to start";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[43]] = "Starting quest";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[44]] = "Hetty";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[45]] = "Cauldron";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[46]] = "Drink From";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[47]] = "Drink From";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[48]] = "Break";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[55]] = "Witches potion quest";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[56]] = "ring of wealth (";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[53]] = "I am in search of a quest.";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[63]] = "Yes, help me become one with my darker side.";
        K.lIIIllllIlIlI[K.lIIIllllIllIl[64]] = "Yes.";
    }

    private static boolean lIlIIllIIIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIlllllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlllllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIllIIIIIIIl(int n2) {
        return n2 <= 0;
    }

    private static int lIlIIlIllllIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIIlIllllllll(int n2, int n3) {
        return n2 <= n3;
    }
}

