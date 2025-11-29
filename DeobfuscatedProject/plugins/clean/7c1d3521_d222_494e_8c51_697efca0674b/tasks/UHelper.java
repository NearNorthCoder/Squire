/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
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
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class UHelper
implements ac {
    public static  WorldPoint dh;
    static  int di;
    
    public static  WorldPoint de;
    
    static  boolean dj;
    public static  boolean bt;
    
    public static  WorldPoint dg;
    public static  WorldPoint df;
    private static  WorldPoint dk;
    public static  List<d> bv;

    @Override
    public boolean ah() {
        boolean bl;
        if (u.lIllIIIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[57])) {
            bl = llIlIIIIll[0];

            if ((17 + 52 - -58 + 18 ^ 98 + 137 - 130 + 44) <= -1) {
                return ((0x5D ^ 0x7A ^ (4 ^ 0xF)) & (0x10 ^ 0x6A ^ (0x51 ^ 7) ^ -1)) != 0;
            }
        } else {
            bl = llIlIIIIll[1];
        }
        return bl;
    }

    private static boolean lIllIIIIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        u.lIllIIIIIlIIl();
        u.lIllIIIIIlIII();
        bv = new ArrayList<d>();
        de = new WorldPoint(llIlIIIIll[88], llIlIIIIll[89], llIlIIIIll[1]);
        df = new WorldPoint(llIlIIIIll[90], llIlIIIIll[91], llIlIIIIll[1]);
        dg = new WorldPoint(llIlIIIIll[92], llIlIIIIll[93], llIlIIIIll[1]);
        dh = new WorldPoint(llIlIIIIll[94], llIlIIIIll[95], llIlIIIIll[1]);
        dk = null;
        String[] stringArray = new String[llIlIIIIll[4]];
        stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[96]];
        stringArray[u.llIlIIIIll[0]] = llIlIIIIIl[llIlIIIIll[97]];
        stringArray[u.llIlIIIIll[3]] = llIlIIIIIl[llIlIIIIll[98]];
        stringArray[u.llIlIIIIll[9]] = llIlIIIIIl[llIlIIIIll[99]];
        cE = stringArray;
    }

    private static boolean lIllIIIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ae() {
        return llIlIIIIll[1];
    }

    public static void aX() {
        block63: {
            block64: {
                block65: {
                    if (u.lIllIIIIIlIll(bt ? 1 : 0)) {
                        b.a(bv);
                        if (u.lIllIIIIIllII(bv.size(), llIlIIIIll[0])) {
                            System.out.println(llIlIIIIIl[llIlIIIIll[1]]);
                            bt = llIlIIIIll[1];
                        }
                    }
                    if (!u.lIllIIIIIllIl(bt ? 1 : 0)) break block63;
                    if (u.lIllIIIIIllIl(u.an() ? 1 : 0) && u.lIllIIIIIllIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        BankLocation var1 = BankLocation.getNearest();
                        if (u.lIllIIIIIlllI(var1) && u.lIllIIIIIllIl(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[0]];
                            a.a(var1);
                        }
                        if (u.lIllIIIIIlllI(var1) && u.lIllIIIIIlIll(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (u.lIllIIIIIllIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIIIll[2]);

                            }
                            if (u.lIllIIIIIlIll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[3]];
                                if (u.lIllIIIIIllll(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIlIIIIll[4]);

                                }
                                if (u.lIllIIIIIllll(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIlIIIIll[3]);

                                }
                                int[] nArray = new int[llIlIIIIll[5]];
                                nArray[u.llIlIIIIll[1]] = llIlIIIIll[6];
                                nArray[u.llIlIIIIll[0]] = llIlIIIIll[7];
                                nArray[u.llIlIIIIll[3]] = llIlIIIIll[8];
                                nArray[u.llIlIIIIll[9]] = llIlIIIIll[10];
                                nArray[u.llIlIIIIll[4]] = llIlIIIIll[11];
                                nArray[u.llIlIIIIll[12]] = llIlIIIIll[13];
                                if (u.lIllIIIIIllIl(e.c(nArray) ? 1 : 0)) {
                                    u.Q();
                                    System.out.println(llIlIIIIIl[llIlIIIIll[9]]);
                                    bt = llIlIIIIll[0];
                                    return;
                                }
                                int[] nArray2 = new int[llIlIIIIll[5]];
                                nArray2[u.llIlIIIIll[1]] = llIlIIIIll[6];
                                nArray2[u.llIlIIIIll[0]] = llIlIIIIll[7];
                                nArray2[u.llIlIIIIll[3]] = llIlIIIIll[8];
                                nArray2[u.llIlIIIIll[9]] = llIlIIIIll[10];
                                nArray2[u.llIlIIIIll[4]] = llIlIIIIll[11];
                                nArray2[u.llIlIIIIll[12]] = llIlIIIIll[13];
                                if (u.lIllIIIIIlIll(e.c(nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[llIlIIIIll[3]];
                                    nArray3[u.llIlIIIIll[1]] = llIlIIIIll[8];
                                    nArray3[u.llIlIIIIll[0]] = llIlIIIIll[10];
                                    a.a(nArray3);
                                    a.a(llIlIIIIll[6], llIlIIIIll[14]);
                                    a.a(llIlIIIIll[7], llIlIIIIll[14]);
                                    a.a(llIlIIIIll[15], llIlIIIIll[14]);
                                    a.b(f.aW, llIlIIIIll[0]);
                                    a.a(llIlIIIIll[11], llIlIIIIll[4]);
                                    a.a(llIlIIIIll[13], llIlIIIIll[16]);
                                }
                            }
                        }
                    }
                    if (u.lIllIIIIIlIll(Inventory.contains((int[])f.ba) ? 1 : 0) && u.lIllIIIIIllII(Movement.getRunEnergy(), llIlIIIIll[17])) {
                        Inventory.getFirst((int[])f.ba).interact(llIlIIIIIl[llIlIIIIll[4]]);
                        Time.sleepTicks((int)llIlIIIIll[0]);

                    }
                    if (u.lIllIIIIIlIll(u.an() ? 1 : 0) && u.lIllIIIIIllIl(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(de), llIlIIIIll[4])) {
                            if (u.lIllIIIIIlIll(Inventory.contains((int[])f.aW) ? 1 : 0) && u.lIllIIIIIllIl(Equipment.contains((int[])f.aW) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aW).interact(llIlIIIIIl[llIlIIIIll[12]]);
                            }
                            if (u.lIllIIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[5]];
                            Movement.walkTo((WorldPoint)de);

                            Time.sleepTicks((int)llIlIIIIll[0]);

                        }
                        if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(de), llIlIIIIll[4])) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[18]];
                            di = llIlIIIIll[1];
                            if (u.lIllIIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIlIIIIll[0]];
                                stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[16]];
                                TileObjects.getNearest((String[])stringArray).interact(llIlIIIIIl[llIlIIIIll[19]]);
                                Time.sleepTicks((int)llIlIIIIll[3]);

                            }
                            g.a(cE);
                        }
                    }
                    if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[12])) {
                        if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[14]];
                            Movement.walkTo((WorldPoint)df);

                            Time.sleepTicks((int)llIlIIIIll[0]);

                            if (u.lIllIIIIIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIIIll[20], llIlIIIIll[21], llIlIIIIll[1])) ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[22]];
                                e.c(new WorldPoint(llIlIIIIll[23], llIlIIIIll[24], llIlIIIIll[1]));
                                Time.sleepTicks((int)llIlIIIIll[5]);

                            }
                        }
                        if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[25]];
                            g.a(llIlIIIIIl[llIlIIIIll[26]], cE, llIlIIIIll[0]);
                        }
                    }
                    if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[14])) {
                        if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[27]];
                            Movement.walkTo((WorldPoint)dg);

                            Time.sleepTicks((int)llIlIIIIll[0]);

                        }
                        if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                            int[] nArray = new int[llIlIIIIll[0]];
                            nArray[u.llIlIIIIll[1]] = llIlIIIIll[8];
                            if (u.lIllIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray4 = new int[llIlIIIIll[0]];
                                nArray4[u.llIlIIIIll[1]] = llIlIIIIll[8];
                                String[] stringArray = new String[llIlIIIIll[0]];
                                stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[28]];
                                Inventory.getFirst((int[])nArray4).useOn(TileObjects.getNearest((String[])stringArray));
                                Time.sleepTicks((int)llIlIIIIll[3]);

                            }
                        }
                    }
                    if (!u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[28])) break block64;
                    int[] nArray = new int[llIlIIIIll[0]];
                    nArray[u.llIlIIIIll[1]] = llIlIIIIll[10];
                    if (u.lIllIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[llIlIIIIll[0]];
                        nArray5[u.llIlIIIIll[1]] = llIlIIIIll[10];
                        Inventory.getFirst((int[])nArray5).interact(llIlIIIIIl[llIlIIIIll[29]]);
                    }
                    if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                        String[] stringArray = new String[llIlIIIIll[0]];
                        stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[30]];
                        TileObjects.getNearest((String[])stringArray).interact(llIlIIIIIl[llIlIIIIll[31]]);
                        Time.sleepTicks((int)llIlIIIIll[9]);

                    }
                    if (!u.lIllIIIIlIIII(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(llIlIIIIll[32], llIlIIIIll[33])), llIlIIIIll[34])) break block65;
                    String[] stringArray = new String[llIlIIIIll[0]];
                    stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[35]];
                    if (!u.lIllIIIIIlllI(TileObjects.getNearest((String[])stringArray))) break block64;
                }
                String[] stringArray = new String[llIlIIIIll[0]];
                stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[36]];
                if (u.lIllIIIIIlllI(TileObjects.getNearest((String[])stringArray))) {
                    if (u.lIllIIIIlIIII(Players.getLocal().getLocalLocation().getY(), llIlIIIIll[37])) {
                        String[] stringArray2 = new String[llIlIIIIll[0]];
                        stringArray2[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[38]];
                        if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray2).getWorldLocation()), llIlIIIIll[14])) {
                            String[] stringArray3 = new String[llIlIIIIll[0]];
                            stringArray3[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[39]];
                            if (u.lIllIIIIlIIll(NPCs.getNearest((String[])stringArray3))) {
                                AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[40]];
                                String[] stringArray4 = new String[llIlIIIIll[0]];
                                stringArray4[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[41]];
                                TileObjects.getNearest((String[])stringArray4).interact(llIlIIIIIl[llIlIIIIll[42]]);
                                Time.sleepTicks((int)llIlIIIIll[14]);

                            }
                        }
                    }
                    String[] stringArray5 = new String[llIlIIIIll[0]];
                    stringArray5[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[43]];
                    if (u.lIllIIIIlIIll(NPCs.getNearest((String[])stringArray5)) && u.lIllIIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[44]];
                        String[] stringArray6 = new String[llIlIIIIll[0]];
                        stringArray6[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[45]];
                        TileObjects.getNearest((String[])stringArray6).interact(llIlIIIIIl[llIlIIIIll[46]]);
                        Time.sleepTicks((int)llIlIIIIll[12]);

                        g.a(cE);
                    }
                    g.a(cE);
                }
            }
            if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[36])) {
                AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[47]];
                g.a(llIlIIIIIl[llIlIIIIll[48]], cE);
            }
            if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[42])) {
                if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                    String[] stringArray = new String[llIlIIIIll[0]];
                    stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[49]];
                    if (u.lIllIIIIlIIll(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray7 = new String[llIlIIIIll[0]];
                        stringArray7[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[50]];
                        if (u.lIllIIIIIllIl(Equipment.contains((String[])stringArray7) ? 1 : 0)) {
                            String[] stringArray8 = new String[llIlIIIIll[0]];
                            stringArray8[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[51]];
                            if (u.lIllIIIIIlIll(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                String[] stringArray9 = new String[llIlIIIIll[0]];
                                stringArray9[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[52]];
                                Inventory.getFirst((String[])stringArray9).interact(llIlIIIIIl[llIlIIIIll[53]]);
                            }
                        }
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[54]];
                        Movement.walkTo((WorldPoint)dg);

                        Time.sleepTicks((int)llIlIIIIll[0]);

                    }
                }
                if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIIIIll[4])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[55]];
                    String[] stringArray = new String[llIlIIIIll[0]];
                    stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[56]];
                    if (u.lIllIIIIIlllI(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray10 = new String[llIlIIIIll[0]];
                        stringArray10[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[57]];
                        TileObjects.getNearest((String[])stringArray10).interact(llIlIIIIIl[llIlIIIIll[58]]);
                        Time.sleepTicks((int)llIlIIIIll[9]);

                    }
                }
                if (u.lIllIIIIlIIII(Players.getLocal().getLocalLocation().getY(), llIlIIIIll[37])) {
                    String[] stringArray = new String[llIlIIIIll[0]];
                    stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[59]];
                    if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray).getWorldLocation()), llIlIIIIll[18])) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[60]];
                        String[] stringArray11 = new String[llIlIIIIll[0]];
                        stringArray11[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[61]];
                        TileObjects.getNearest((String[])stringArray11).interact(llIlIIIIIl[llIlIIIIll[62]]);
                        Time.sleepTicks((int)llIlIIIIll[14]);

                    }
                }
                if (u.lIllIIIIlIIll(Players.getLocal().getInteracting()) && u.lIllIIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[llIlIIIIll[0]];
                    stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[63]];
                    if (u.lIllIIIIIllIl(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray12 = new String[llIlIIIIll[0]];
                        stringArray12[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[64]];
                        if (u.lIllIIIIIlIll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                            String[] stringArray13 = new String[llIlIIIIll[0]];
                            stringArray13[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[65]];
                            Inventory.getFirst((String[])stringArray13).interact(llIlIIIIIl[llIlIIIIll[66]]);
                        }
                    }
                    int[] nArray = new int[llIlIIIIll[0]];
                    nArray[u.llIlIIIIll[1]] = llIlIIIIll[10];
                    if (u.lIllIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llIlIIIIll[0]];
                        nArray6[u.llIlIIIIll[1]] = llIlIIIIll[10];
                        if (u.lIllIIIIIllIl(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[llIlIIIIll[0]];
                            nArray7[u.llIlIIIIll[1]] = llIlIIIIll[10];
                            Inventory.getFirst((int[])nArray7).interact(llIlIIIIIl[llIlIIIIll[34]]);
                        }
                    }
                    String[] stringArray14 = new String[llIlIIIIll[0]];
                    stringArray14[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[67]];
                    NPCs.getNearest((String[])stringArray14).interact(llIlIIIIIl[llIlIIIIll[68]]);
                    Time.sleepTicks((int)llIlIIIIll[0]);

                }
                if (u.lIllIIIIlIlII(u.lIllIIIIIlIlI(e.w(), 60.0))) {
                    int[] nArray = new int[llIlIIIIll[0]];
                    nArray[u.llIlIIIIll[1]] = llIlIIIIll[13];
                    if (u.lIllIIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[llIlIIIIll[0]];
                        nArray8[u.llIlIIIIll[1]] = llIlIIIIll[13];
                        Inventory.getFirst((int[])nArray8).interact(llIlIIIIIl[llIlIIIIll[69]]);
                        Time.sleepTicks((int)llIlIIIIll[0]);

                    }
                }
                g.a(cE);
            }
            if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[47])) {
                String[] stringArray = new String[llIlIIIIll[0]];
                stringArray[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[70]];
                if (u.lIllIIIIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[71]];
                    String[] stringArray15 = new String[llIlIIIIll[0]];
                    stringArray15[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[72]];
                    TileObjects.getNearest((String[])stringArray15).interact(llIlIIIIIl[llIlIIIIll[73]]);
                    Time.sleepTicks((int)llIlIIIIll[4]);

                }
                String[] stringArray16 = new String[llIlIIIIll[0]];
                stringArray16[u.llIlIIIIll[1]] = llIlIIIIIl[llIlIIIIll[74]];
                if (u.lIllIIIIIlIll(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[75]];
                        Movement.walkTo((WorldPoint)df);

                        Time.sleepTicks((int)llIlIIIIll[0]);

                        if (u.lIllIIIIIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIlIIIIll[20], llIlIIIIll[21], llIlIIIIll[1])) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[76]];
                            e.c(new WorldPoint(llIlIIIIll[23], llIlIIIIll[24], llIlIIIIll[1]));
                            Time.sleepTicks((int)llIlIIIIll[5]);

                        }
                    }
                    if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(df), llIlIIIIll[4])) {
                        AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[77]];
                        g.a(llIlIIIIIl[llIlIIIIll[78]], cE, llIlIIIIll[0]);
                    }
                }
            }
            if (u.lIllIIIIlIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIlIIIIll[52])) {
                if (u.lIllIIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(dh), llIlIIIIll[9])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[79]];
                    Movement.walkTo((WorldPoint)dh);

                    Time.sleepTicks((int)llIlIIIIll[0]);

                }
                if (u.lIllIIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(dh), llIlIIIIll[9])) {
                    AccBuilderSotf.c = llIlIIIIIl[llIlIIIIll[80]];
                    if (u.lIllIIIIIllII(di, llIlIIIIll[0])) {
                        aN.sB += llIlIIIIll[0];
                        aN.UHelper(AccBuilderSotf.m);
                        di += llIlIIIIll[0];
                        aN.sB = llIlIIIIll[1];
                        dj = llIlIIIIll[1];
                    }
                    g.a(llIlIIIIIl[llIlIIIIll[17]], cE);
                }
            }
        }
    }

    private static boolean lIllIIIIlIlII(int n2) {
        return n2 < 0;
    }

    private static boolean lIllIIIIIlllI(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIIIlIIll(Object object) {
        return object == null;
    }

        return String.valueOf(var2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block4: {
            block5: {
                int[] nArray = new int[llIlIIIIll[0]];
                nArray[u.llIlIIIIll[1]] = llIlIIIIll[6];
                if (!u.lIllIIIIIllll(Inventory.getCount((int[])nArray))) break block4;
                int[] nArray2 = new int[llIlIIIIll[0]];
                nArray2[u.llIlIIIIll[1]] = llIlIIIIll[8];
                if (!u.lIllIIIIIllll(Inventory.getCount((int[])nArray2))) break block4;
                int[] nArray3 = new int[llIlIIIIll[0]];
                nArray3[u.llIlIIIIll[1]] = llIlIIIIll[10];
                if (!u.lIllIIIIlIlIl(Inventory.getCount((int[])nArray3))) break block5;
                int[] nArray4 = new int[llIlIIIIll[0]];
                nArray4[u.llIlIIIIll[1]] = llIlIIIIll[10];
                if (!u.lIllIIIIIlIll(Equipment.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            int[] nArray = new int[llIlIIIIll[0]];
            nArray[u.llIlIIIIll[1]] = llIlIIIIll[13];
            if (u.lIllIIIIIllll(Inventory.getCount((int[])nArray))) {
                n2 = llIlIIIIll[0];

                if ((0x7B ^ 0x44 ^ (0x42 ^ 0x79)) >= (23 + 129 - 1 + 0 ^ 102 + 105 - 156 + 96)) return n2 != 0;
                return ((0xA9 ^ 0x87 ^ (0x76 ^ 0x79)) & (7 + 18 - -3 + 140 ^ 52 + 44 - 21 + 62 ^ -1)) != 0;
            }
        }
        n2 = llIlIIIIll[1];
        return n2 != 0;
    }

    private static boolean lIllIIIIIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIlIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIIIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String ag() {
        return llIlIIIIIl[llIlIIIIll[86]];
    }

    private static int lIllIIIIIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void Q() {
        d var3;
        block10: {
            block9: {
                Object var4;
                int[] nArray = new int[llIlIIIIll[0]];
                nArray[u.llIlIIIIll[1]] = llIlIIIIll[8];
                if (u.lIllIIIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(llIlIIIIll[8], llIlIIIIll[0], llIlIIIIll[81]);
                    bv.add(d2);

                }
                int[] nArray2 = new int[llIlIIIIll[0]];
                nArray2[u.llIlIIIIll[1]] = llIlIIIIll[10];
                if (u.lIllIIIIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var4 = new DHelper(llIlIIIIll[10], llIlIIIIll[0], llIlIIIIll[81]);
                    bv.add((DHelper) ar4);

                }
                int[] nArray3 = new int[llIlIIIIll[0]];
                nArray3[u.llIlIIIIll[1]] = llIlIIIIll[13];
                if (u.lIllIIIIIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var4 = new DHelper(llIlIIIIll[13], llIlIIIIll[50], llIlIIIIll[82]);
                    bv.add((DHelper) ar4);

                }
                int[] nArray4 = new int[llIlIIIIll[0]];
                nArray4[u.llIlIIIIll[1]] = llIlIIIIll[11];
                if (u.lIllIIIIIllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var4 = new DHelper(llIlIIIIll[11], llIlIIIIll[12], j.cf);
                    bv.add((DHelper) ar4);

                }
                if (u.lIllIIIIIllIl(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(llIlIIIIIl[llIlIIIIll[87]]))) ? 1 : 0)) {
                    var3 = new DHelper(llIlIIIIll[83], llIlIIIIll[12], llIlIIIIll[84]);
                    bv.add(var3);

                }
                int[] nArray5 = new int[llIlIIIIll[0]];
                nArray5[u.llIlIIIIll[1]] = llIlIIIIll[7];
                if (!u.lIllIIIIIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[llIlIIIIll[0]];
                nArray6[u.llIlIIIIll[1]] = llIlIIIIll[7];
                if (!u.lIllIIIIIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[llIlIIIIll[0]];
                nArray7[u.llIlIIIIll[1]] = llIlIIIIll[7];
                if (!u.lIllIIIIIllII(Bank.getFirst((int[])nArray7).getQuantity(), llIlIIIIll[12])) break block10;
            }
            var3 = new DHelper(llIlIIIIll[7], llIlIIIIll[28], llIlIIIIll[82]);
            bv.add(var3);

        }
        int[] nArray = new int[llIlIIIIll[0]];
        nArray[u.llIlIIIIll[1]] = llIlIIIIll[6];
        if (u.lIllIIIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var3 = new DHelper(llIlIIIIll[6], llIlIIIIll[57], llIlIIIIll[82]);
            bv.add(var3);

        }
    }

    private static void lIllIIIIIlIII() {
        llIlIIIIIl = new String[llIlIIIIll[100]];
        u.llIlIIIIIl[u.llIlIIIIll[1]] = "Finished buying items, switching back to quest";
        u.llIlIIIIIl[u.llIlIIIIll[0]] = "Nav to bank";
        u.llIlIIIIIl[u.llIlIIIIll[3]] = "Handling banking";
        u.llIlIIIIIl[u.llIlIIIIll[9]] = "We are missing quest supplies, switching to BUYING";
        u.llIlIIIIIl[u.llIlIIIIll[4]] = "Drink";
        u.llIlIIIIIl[u.llIlIIIIll[12]] = "Wear";
        u.llIlIIIIIl[u.llIlIIIIll[5]] = "Nav to start";
        u.llIlIIIIIl[u.llIlIIIIll[18]] = "Starting quest";
        u.llIlIIIIIl[u.llIlIIIIll[16]] = "Notice board";
        u.llIlIIIIIl[u.llIlIIIIll[19]] = "Check";
        u.llIlIIIIIl[u.llIlIIIIll[14]] = "Nav to sarah";
        u.llIlIIIIIl[u.llIlIIIIll[22]] = "Stuck, clicking out";
        u.llIlIIIIIl[u.llIlIIIIll[25]] = "Talking sarah";
        u.llIlIIIIIl[u.llIlIIIIll[26]] = "Sarah";
        u.llIlIIIIIl[u.llIlIIIIll[27]] = "Nav to hole";
        u.llIlIIIIIl[u.llIlIIIIll[28]] = "Strange hole";
        u.llIlIIIIIl[u.llIlIIIIll[29]] = "Wield";
        u.llIlIIIIIl[u.llIlIIIIll[30]] = "Strange hole";
        u.llIlIIIIIl[u.llIlIIIIll[31]] = "Climb-down";
        u.llIlIIIIIl[u.llIlIIIIll[35]] = "Skeleton";
        u.llIlIIIIIl[u.llIlIIIIll[36]] = "Skeleton";
        u.llIlIIIIIl[u.llIlIIIIll[38]] = "Blockage";
        u.llIlIIIIIl[u.llIlIIIIll[39]] = "Pig Thing";
        u.llIlIIIIIl[u.llIlIIIIll[40]] = "Climb over blockage";
        u.llIlIIIIIl[u.llIlIIIIll[41]] = "Blockage";
        u.llIlIIIIIl[u.llIlIIIIll[42]] = "Climb-over";
        u.llIlIIIIIl[u.llIlIIIIll[43]] = "Pig Thing";
        u.llIlIIIIIl[u.llIlIIIIll[44]] = "Interact skele";
        u.llIlIIIIIl[u.llIlIIIIll[45]] = "Skeleton";
        u.llIlIIIIIl[u.llIlIIIIll[46]] = "Investigate";
        u.llIlIIIIIl[u.llIlIIIIll[47]] = "Interacting Spira";
        u.llIlIIIIIl[u.llIlIIIIll[48]] = "Spria";
        u.llIlIIIIIl[u.llIlIIIIll[49]] = "Sourhog";
        u.llIlIIIIIl[u.llIlIIIIll[50]] = "Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[51]] = "Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[52]] = "Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[53]] = "Wear";
        u.llIlIIIIIl[u.llIlIIIIll[54]] = "Nav to hole";
        u.llIlIIIIIl[u.llIlIIIIll[55]] = "Climb down hole";
        u.llIlIIIIIl[u.llIlIIIIll[56]] = "Strange hole";
        u.llIlIIIIIl[u.llIlIIIIll[57]] = "Strange hole";
        u.llIlIIIIIl[u.llIlIIIIll[58]] = "Climb-down";
        u.llIlIIIIIl[u.llIlIIIIll[59]] = "Blockage";
        u.llIlIIIIIl[u.llIlIIIIll[60]] = "Climb over blockage";
        u.llIlIIIIIl[u.llIlIIIIll[61]] = "Blockage";
        u.llIlIIIIIl[u.llIlIIIIll[62]] = "Climb-over";
        u.llIlIIIIIl[u.llIlIIIIll[63]] = "Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[64]] = "Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[65]] = "Reinforced goggles";
        u.llIlIIIIIl[u.llIlIIIIll[66]] = "Wear";
        u.llIlIIIIIl[u.llIlIIIIll[34]] = "Wield";
        u.llIlIIIIIl[u.llIlIIIIll[67]] = "Sourhog";
        u.llIlIIIIIl[u.llIlIIIIll[68]] = "Attack";
        u.llIlIIIIIl[u.llIlIIIIll[69]] = "Eat";
        u.llIlIIIIIl[u.llIlIIIIll[70]] = "Sourhog foot";
        u.llIlIIIIIl[u.llIlIIIIll[71]] = "Cutting foot";
        u.llIlIIIIIl[u.llIlIIIIll[72]] = "Dead sourhog";
        u.llIlIIIIIl[u.llIlIIIIll[73]] = "Cut-foot";
        u.llIlIIIIIl[u.llIlIIIIll[74]] = "Sourhog foot";
        u.llIlIIIIIl[u.llIlIIIIll[75]] = "Nav to sarah";
        u.llIlIIIIIl[u.llIlIIIIll[76]] = "Stuck, clicking out";
        u.llIlIIIIIl[u.llIlIIIIll[77]] = "Talking sarah";
        u.llIlIIIIIl[u.llIlIIIIll[78]] = "Sarah";
        u.llIlIIIIIl[u.llIlIIIIll[79]] = "Nav to Spria";
        u.llIlIIIIIl[u.llIlIIIIll[80]] = "Talking spria";
        u.llIlIIIIIl[u.llIlIIIIll[17]] = "Spria";
        u.llIlIIIIIl[u.llIlIIIIll[86]] = "A porceline of interest";
        u.llIlIIIIIl[u.llIlIIIIll[87]] = "ring of wealth (";
        u.llIlIIIIIl[u.llIlIIIIll[96]] = "Yes.";
        u.llIlIIIIIl[u.llIlIIIIll[97]] = "Talk about the bounty.";
        u.llIlIIIIIl[u.llIlIIIIll[98]] = "I think that'll be all for now.";
        u.llIlIIIIIl[u.llIlIIIIll[99]] = "Yes";
    }

    @Override
    public int af() {
        try {
            u.aX();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return llIlIIIIll[85];
    }

    private static boolean lIllIIIIlIlIl(int n2) {
        return n2 <= 0;
    }
}

