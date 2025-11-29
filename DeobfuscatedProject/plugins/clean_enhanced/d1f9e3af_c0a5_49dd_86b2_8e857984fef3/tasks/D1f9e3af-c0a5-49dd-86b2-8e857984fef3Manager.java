/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
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
 *  net.unethicalite.client.Static
 */
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
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
import net.unethicalite.client.Static;

public class D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager
implements W {
    static  WorldPoint iY;
    static  boolean cm;
    static  WorldPoint iV;
    private final  int ja = 0;
    static  WorldPoint iX;
    static  WorldPoint iT;
    static  WorldPoint iW;
    public static  boolean bt;
    private static  String[] iZ;
    private static  String[] lIlIIlIIl;
    static  int cl;
    public static  List<d> bv;
    private static  int[] lIlIIlIlI;
    static  WorldPoint iU;
    static  String[] bR;
    static  WorldPoint bX;
    public static  boolean iS;
    private static final  String iR;
    private static final  HashMap<Integer, String> iQ;

    public static void ce() {
        block77: {
            block78: {
                Object var1;
                block80: {
                    block79: {
                        if (K.var2(bt)) {
                            b.a(bv);
                            if (K.var3(bv.size(), lIlIIlIlI[1])) {
                                System.out.println(lIlIIlIIl[lIlIIlIlI[0]]);
                                bt = lIlIIlIlI[0];
                            }
                        }
                        if (!K.var4(bt)) break block77;
                        if (K.var4(K.ab() ? 1 : 0) && K.var4(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            var1 = BankLocation.getNearest();
                            if (K.var5(var1) && K.var4(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[1]];
                                a.a((BankLocation)var1);
                            }
                            if (K.var5(var1) && K.var2(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (K.var4(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIlIlI[2]);
                                    0;
                                }
                                if (K.var2(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[3]];
                                    if (K.var6(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIlIIlIlI[4]);
                                        0;
                                    }
                                    if (K.var6(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIlIIlIlI[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lIlIIlIlI[5]];
                                    nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
                                    nArray[K.lIlIIlIlI[1]] = lIlIIlIlI[7];
                                    nArray[K.lIlIIlIlI[3]] = lIlIIlIlI[8];
                                    if (K.var4(e.b(nArray) ? 1 : 0)) {
                                        K.af();
                                        System.out.println(lIlIIlIIl[lIlIIlIlI[5]]);
                                        bt = lIlIIlIlI[1];
                                        return;
                                    }
                                    int[] nArray2 = new int[lIlIIlIlI[1]];
                                    nArray2[K.lIlIIlIlI[0]] = lIlIIlIlI[7];
                                    if (K.var2(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                        int[] nArray3 = new int[lIlIIlIlI[1]];
                                        nArray3[K.lIlIIlIlI[0]] = lIlIIlIlI[7];
                                        if (K.var3(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIlIlI[9])) {
                                            K.af();
                                            System.out.println(lIlIIlIIl[lIlIIlIlI[4]]);
                                            bt = lIlIIlIlI[1];
                                            return;
                                        }
                                    }
                                    int[] nArray4 = new int[lIlIIlIlI[5]];
                                    nArray4[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
                                    nArray4[K.lIlIIlIlI[1]] = lIlIIlIlI[7];
                                    nArray4[K.lIlIIlIlI[3]] = lIlIIlIlI[8];
                                    if (K.var2(e.b(nArray4) ? 1 : 0)) {
                                        if (K.var4(Equipment.contains((int[])f.aR) ? 1 : 0) && K.var4(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                                            a.b(f.aR, lIlIIlIlI[1]);
                                        }
                                        if (K.var2(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                                            Inventory.getFirst((int[])f.aR).interact(lIlIIlIIl[lIlIIlIlI[10]]);
                                            Time.sleepTicks((int)lIlIIlIlI[5]);
                                            0;
                                        }
                                        if (K.var4(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepTicks((int)lIlIIlIlI[5]);
                                            0;
                                        }
                                        a.a(lIlIIlIlI[11], lIlIIlIlI[1]);
                                        a.a(lIlIIlIlI[8], lIlIIlIlI[1]);
                                        a.a(lIlIIlIlI[6], lIlIIlIlI[12]);
                                        a.a(lIlIIlIlI[13], lIlIIlIlI[14]);
                                    }
                                }
                            }
                        }
                        if (K.var2(Inventory.contains((int[])f.aV) ? 1 : 0) && K.var3(Movement.getRunEnergy(), lIlIIlIlI[15])) {
                            Inventory.getFirst((int[])f.aV).interact(lIlIIlIIl[lIlIIlIlI[16]]);
                            Time.sleepTicks((int)lIlIIlIlI[1]);
                            0;
                        }
                        int[] nArray = new int[lIlIIlIlI[1]];
                        nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[17];
                        if (K.var2(Inventory.contains((int[])nArray) ? 1 : 0) && K.var7(K.var8(e.u(), 55.0))) {
                            int[] nArray5 = new int[lIlIIlIlI[1]];
                            nArray5[K.lIlIIlIlI[0]] = lIlIIlIlI[17];
                            Inventory.getFirst((int[])nArray5).interact(lIlIIlIIl[lIlIIlIlI[18]]);
                        }
                        if (K.var2(K.ab() ? 1 : 0) && K.var4(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()))) {
                            if (K.var9(Players.getLocal().getWorldLocation().distanceTo(bX), lIlIIlIlI[4]) && K.var4(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[19]];
                                Movement.walkTo((WorldPoint)bX);
                                0;
                                Time.sleepTicks((int)lIlIIlIlI[1]);
                                0;
                            }
                            if (K.var10(Players.getLocal().getWorldLocation().distanceTo(bX), lIlIIlIlI[4])) {
                                g.a(lIlIIlIIl[lIlIIlIlI[20]], bR);
                            }
                        }
                        if (K.var11(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIlIIlIlI[1])) {
                            var1 = new WorldArea(lIlIIlIlI[21], lIlIIlIlI[22], lIlIIlIlI[19], lIlIIlIlI[18], lIlIIlIlI[0]);
                            if (K.var4(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[12]];
                                Movement.walkTo((WorldPoint)iT);
                                0;
                                Time.sleepTicks((int)lIlIIlIlI[1]);
                                0;
                            }
                            if (K.var2(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                g.a(lIlIIlIIl[lIlIIlIlI[23]], bR);
                            }
                        }
                        if (!K.var11(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIlIIlIlI[3])) break block78;
                        cl = lIlIIlIlI[0];
                        int[] nArray6 = new int[lIlIIlIlI[1]];
                        nArray6[K.lIlIIlIlI[0]] = lIlIIlIlI[24];
                        if (K.var4(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            String[] stringArray = new String[lIlIIlIlI[1]];
                            stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[25]];
                            if (K.var4(Equipment.contains((String[])stringArray) ? 1 : 0) && K.var4(iS)) {
                                if (!K.var10(Players.getLocal().getWorldLocation().distanceTo(iU), lIlIIlIlI[4]) || K.var12(Players.getLocal().getWorldLocation().getPlane(), lIlIIlIlI[3])) {
                                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[26]];
                                    Movement.walkTo((WorldPoint)iU);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIlI[1]);
                                    0;
                                }
                                if (K.var10(Players.getLocal().getWorldLocation().distanceTo(iU), lIlIIlIlI[4])) {
                                    g.a(lIlIIlIIl[lIlIIlIlI[27]], bR);
                                }
                            }
                        }
                        int[] nArray7 = new int[lIlIIlIlI[1]];
                        nArray7[K.lIlIIlIlI[0]] = lIlIIlIlI[24];
                        if (K.var2(Inventory.contains((int[])nArray7) ? 1 : 0) && K.var4(iS)) {
                            String[] stringArray = new String[lIlIIlIlI[1]];
                            stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[28]];
                            if (K.var2(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (K.var9(Players.getLocal().getWorldLocation().distanceTo(iV), lIlIIlIlI[4])) {
                                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[29]];
                                    Movement.walkTo((WorldPoint)iV);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIlI[1]);
                                    0;
                                }
                                if (K.var10(Players.getLocal().getWorldLocation().distanceTo(iV), lIlIIlIlI[4])) {
                                    String[] stringArray2 = new String[lIlIIlIlI[1]];
                                    stringArray2[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[30]];
                                    String[] stringArray3 = new String[lIlIIlIlI[1]];
                                    stringArray3[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[31]];
                                    Inventory.getFirst((String[])stringArray2).useOn(TileObjects.getNearest((String[])stringArray3));
                                    Time.sleepTicks((int)lIlIIlIlI[10]);
                                    0;
                                }
                            }
                            String[] stringArray4 = new String[lIlIIlIlI[1]];
                            stringArray4[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[32]];
                            if (K.var4(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                                if (K.var9(Players.getLocal().getWorldLocation().distanceTo(iW), lIlIIlIlI[4])) {
                                    AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[33]];
                                    String[] stringArray5 = new String[lIlIIlIlI[1]];
                                    stringArray5[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[34]];
                                    if (K.var5(TileObjects.getNearest((String[])stringArray5))) {
                                        String[] stringArray6 = new String[lIlIIlIlI[1]];
                                        stringArray6[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[35]];
                                        String[] stringArray7 = new String[lIlIIlIlI[1]];
                                        stringArray7[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[36]];
                                        if (K.var2(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                            String[] stringArray8 = new String[lIlIIlIlI[1]];
                                            stringArray8[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[37]];
                                            TileObjects.getNearest((String[])stringArray8).interact(lIlIIlIIl[lIlIIlIlI[9]]);
                                            Time.sleepTicks((int)lIlIIlIlI[3]);
                                            0;
                                        }
                                    }
                                    String[] stringArray9 = new String[lIlIIlIlI[1]];
                                    stringArray9[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[38]];
                                    if (K.var5(TileObjects.getNearest((String[])stringArray9))) {
                                        String[] stringArray10 = new String[lIlIIlIlI[1]];
                                        stringArray10[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[39]];
                                        String[] stringArray11 = new String[lIlIIlIlI[1]];
                                        stringArray11[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[40]];
                                        if (K.var2(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                                            String[] stringArray12 = new String[lIlIIlIlI[1]];
                                            stringArray12[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[41]];
                                            TileObjects.getNearest((String[])stringArray12).interact(lIlIIlIIl[lIlIIlIlI[42]]);
                                            Time.sleepTicks((int)lIlIIlIlI[3]);
                                            0;
                                        }
                                    }
                                    Movement.walkTo((WorldPoint)iW);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIlI[1]);
                                    0;
                                }
                                if (K.var10(Players.getLocal().getWorldLocation().distanceTo(iW), lIlIIlIlI[4])) {
                                    String[] stringArray13 = new String[lIlIIlIlI[1]];
                                    stringArray13[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[43]];
                                    if (K.var5(TileObjects.getNearest((String[])stringArray13))) {
                                        String[] stringArray14 = new String[lIlIIlIlI[1]];
                                        stringArray14[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[44]];
                                        TileObjects.getNearest((String[])stringArray14).interact(lIlIIlIIl[lIlIIlIlI[45]]);
                                        Time.sleepTicks((int)lIlIIlIlI[4]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lIlIIlIlI[1]];
                        nArray8[K.lIlIIlIlI[0]] = lIlIIlIlI[24];
                        if (K.var2(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lIlIIlIlI[1]];
                            nArray9[K.lIlIIlIlI[0]] = lIlIIlIlI[46];
                            if (K.var2(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                iS = lIlIIlIlI[1];
                            }
                        }
                        if (K.var2(iS)) {
                            String[] stringArray = new String[lIlIIlIlI[1]];
                            stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[47]];
                            if (K.var4(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlIIlIlI[1]];
                                nArray10[K.lIlIIlIlI[0]] = lIlIIlIlI[48];
                                if (K.var4(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    String[] stringArray15 = new String[lIlIIlIlI[1]];
                                    stringArray15[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[49]];
                                    if (K.var4(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                                        K.cg();
                                    }
                                    String[] stringArray16 = new String[lIlIIlIlI[1]];
                                    stringArray16[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[50]];
                                    if (K.var2(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                                        if (K.var9(Players.getLocal().getWorldLocation().distanceTo(iX), lIlIIlIlI[3])) {
                                            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[51]];
                                            Movement.walkTo((WorldPoint)iX);
                                            0;
                                            Time.sleepTicks((int)lIlIIlIlI[1]);
                                            0;
                                        }
                                        if (K.var10(Players.getLocal().getWorldLocation().distanceTo(iX), lIlIIlIlI[3])) {
                                            g.a(lIlIIlIIl[lIlIIlIlI[52]], bR);
                                        }
                                    }
                                }
                            }
                        }
                        if (K.var2(iS)) {
                            int[] nArray11 = new int[lIlIIlIlI[1]];
                            nArray11[K.lIlIIlIlI[0]] = lIlIIlIlI[48];
                            if (K.var2(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                String[] stringArray = new String[lIlIIlIlI[1]];
                                stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[53]];
                                if (K.var4(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                                    int[] nArray12 = new int[lIlIIlIlI[1]];
                                    nArray12[K.lIlIIlIlI[0]] = lIlIIlIlI[24];
                                    if (K.var4(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                        K.cg();
                                    }
                                    int[] nArray13 = new int[lIlIIlIlI[1]];
                                    nArray13[K.lIlIIlIlI[0]] = lIlIIlIlI[24];
                                    if (K.var2(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                                        var1 = new WorldArea(lIlIIlIlI[21], lIlIIlIlI[22], lIlIIlIlI[19], lIlIIlIlI[18], lIlIIlIlI[0]);
                                        if (K.var4(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[54]];
                                            Movement.walkTo((WorldPoint)iT);
                                            0;
                                            Time.sleepTicks((int)lIlIIlIlI[1]);
                                            0;
                                        }
                                        if (K.var2(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            g.a(lIlIIlIIl[lIlIIlIlI[55]], bR);
                                        }
                                    }
                                }
                            }
                        }
                        String[] stringArray = new String[lIlIIlIlI[1]];
                        stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[56]];
                        if (!K.var2(Equipment.contains((String[])stringArray) ? 1 : 0)) break block78;
                        String[] stringArray17 = new String[lIlIIlIlI[1]];
                        stringArray17[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[57]];
                        if (K.var13(NPCs.getNearest((String[])stringArray17))) {
                            String[] stringArray18 = new String[lIlIIlIlI[1]];
                            stringArray18[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[58]];
                            if (K.var13(NPCs.getNearest((String[])stringArray18))) {
                                AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[59]];
                                Movement.walkTo((WorldPoint)iY);
                                0;
                                Time.sleepTicks((int)lIlIIlIlI[1]);
                                0;
                            }
                        }
                        String[] stringArray19 = new String[lIlIIlIlI[1]];
                        stringArray19[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[60]];
                        if (!K.var13(NPCs.getNearest((String[])stringArray19))) break block79;
                        String[] stringArray20 = new String[lIlIIlIlI[1]];
                        stringArray20[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[61]];
                        if (!K.var5(NPCs.getNearest((String[])stringArray20))) break block80;
                    }
                    if (K.var13(iZ)) {
                        K.cf();
                    }
                    if (K.var5(var1 = NPCs.getNearest(nPC -> {
                        int n2;
                        if (K.var2(nPC.getName().contains(lIlIIlIIl[lIlIIlIlI[89]]) ? 1 : 0) && K.var14(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIlIIlIlI[1];
                            0;
                            if ((0xB0 ^ 0xB4) <= -1) {
                                return ((3 ^ 0x48) & ~(0x22 ^ 0x69)) != 0;
                            }
                        } else {
                            n2 = lIlIIlIlI[0];
                        }
                        return n2 != 0;
                    })) && K.var13(Players.getLocal().getInteracting())) {
                        var1.interact(lIlIIlIIl[lIlIIlIlI[62]]);
                        Time.sleepTicks((int)lIlIIlIlI[3]);
                        0;
                    }
                    if (K.var13(var1) && K.var13(Players.getLocal().getInteracting())) {
                        String[] stringArray = new String[lIlIIlIlI[1]];
                        stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[63]];
                        if (K.var5(NPCs.getNearest((String[])stringArray))) {
                            String[] stringArray21 = new String[lIlIIlIlI[1]];
                            stringArray21[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[15]];
                            if (K.var4(NPCs.getNearest((String[])stringArray21).isDead() ? 1 : 0) && K.var4(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray22 = new String[lIlIIlIlI[1]];
                                stringArray22[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[64]];
                                NPCs.getNearest((String[])stringArray22).interact(lIlIIlIIl[lIlIIlIlI[65]]);
                            }
                        }
                    }
                    if (K.var2(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[66]];
                        List var15 = Dialog.getOptions();
                        if (K.var4(var15.isEmpty() ? 1 : 0)) {
                            int var16 = lIlIIlIlI[0];
                            while (K.var3(var16, var15.size())) {
                                if (K.var2(((Widget)var15.get(var16)).getText().contains(lIlIIlIIl[lIlIIlIlI[67]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIlIIlIlI[1]];
                                    stringArray[K.lIlIIlIlI[0]] = ((Widget)var15.get(var16)).getText();
                                    Dialog.chooseOption((String[])stringArray);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIlI[3]);
                                    0;
                                    0;
                                    if (((0xF9 ^ 0xA3) & ~(0xEF ^ 0xB5)) >= 0) break;
                                    return;
                                }
                                ++var16;
                                0;
                                if ((0x72 ^ 0x39 ^ (0xFB ^ 0xB4)) <= (0x9D ^ 0x92 ^ (0x21 ^ 0x2A))) continue;
                                return;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lIlIIlIlI[1]];
                stringArray[K.lIlIIlIlI[0]] = lIlIIlIIl[lIlIIlIlI[68]];
                if (K.var5(NPCs.getNearest((String[])stringArray))) {
                    if (K.var3(cl, lIlIIlIlI[1]) && K.var4(cm)) {
                        an.pP += lIlIIlIlI[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlIIlIlI[1];
                        an.pP = lIlIIlIlI[0];
                        cm = lIlIIlIlI[1];
                    }
                    if (K.var2(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[69]];
                        var1 = Dialog.getOptions();
                        if (K.var4(var1.isEmpty() ? 1 : 0)) {
                            int var15 = lIlIIlIlI[0];
                            while (K.var3(var15, var1.size())) {
                                String var16 = iZ[var15];
                                int var17 = lIlIIlIlI[0];
                                while (K.var3(var17, var1.size())) {
                                    if (K.var2(((Widget)var1.get(var17)).getText().contains(var16) ? 1 : 0)) {
                                        System.out.println("Selecting: " + ((Widget)var1.get(var17)).getText());
                                        Time.sleepTicks((int)lIlIIlIlI[3]);
                                        0;
                                        String[] stringArray23 = new String[lIlIIlIlI[1]];
                                        stringArray23[K.lIlIIlIlI[0]] = ((Widget)var1.get(var17)).getText();
                                        Dialog.chooseOption((String[])stringArray23);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIlI[12]);
                                        0;
                                        0;
                                        if (2 == 2) break;
                                        return;
                                    }
                                    ++var17;
                                    0;
                                    if (2 > 0) continue;
                                    return;
                                }
                                ++var15;
                                0;
                                if (1 != 0) continue;
                                return;
                            }
                        }
                    }
                }
            }
            g.a(bR);
        }
    }

    private static void var18() {
        lIlIIlIlI = new int[122];
        K.lIlIIlIlI[0] = 2 & ~2;
        K.lIlIIlIlI[1] = 1;
        K.lIlIIlIlI[2] = 0xFFFFDBA8 & 0x37DF;
        K.lIlIIlIlI[3] = 2;
        K.lIlIIlIlI[4] = 117 + 124 - 159 + 63 ^ 77 + 138 - 97 + 31;
        K.lIlIIlIlI[5] = 3;
        K.lIlIIlIlI[6] = -(0xFFFFEEBF & 0x3171) & (0xFFFFFF7F & 0x3FF7);
        K.lIlIIlIlI[7] = -(0xFFFFB9E6 & 0x7EBB) & (0xFFFFFBBF & 0x3EEF);
        K.lIlIIlIlI[8] = 0xFFFFCFE9 & 0x379F;
        K.lIlIIlIlI[9] = 0x80 ^ 0xBD ^ (0x47 ^ 0x63);
        K.lIlIIlIlI[10] = 0x86 ^ 0x83;
        K.lIlIIlIlI[11] = 0xFFFFF975 & 0x37DB;
        K.lIlIIlIlI[12] = 0xA8 ^ 0x8B ^ (0x3B ^ 0x12);
        K.lIlIIlIlI[13] = -(0xFFFFED1D & 0x7EFF) & (0xFFFFFFFF & 0x6FFF);
        K.lIlIIlIlI[14] = 0xFFFFBFFD & 0x43EA;
        K.lIlIIlIlI[15] = 0xF ^ 0x1C ^ (0x60 ^ 0x41);
        K.lIlIIlIlI[16] = 0x17 ^ 0x11;
        K.lIlIIlIlI[17] = -(0xFFFFFD67 & 0x7E9D) & (0xFFFFFF7F & 0x7DFF);
        K.lIlIIlIlI[18] = 0x29 ^ 0x33 ^ (0x2E ^ 0x33);
        K.lIlIIlIlI[19] = 0x4F ^ 0x47;
        K.lIlIIlIlI[20] = 167 + 149 - 280 + 146 ^ 155 + 45 - 52 + 43;
        K.lIlIIlIlI[21] = -(0xFFFFE79B & 0x5BE5) & (0xFFFFDFFF & 0x6FFF);
        K.lIlIIlIlI[22] = -(0xFFFFD263 & 0x6FDD) & (0xFFFFEFDF & 0x5FED);
        K.lIlIIlIlI[23] = 0x77 ^ 0x4C ^ (0xF6 ^ 0xC6);
        K.lIlIIlIlI[24] = -(0xFFFFE7CF & 0x7E39) & (0xFFFFFFEC & 0x6F7B);
        K.lIlIIlIlI[25] = 0x30 ^ 0x3C;
        K.lIlIIlIlI[26] = 0x47 ^ 0x4A;
        K.lIlIIlIlI[27] = 0x85 ^ 0x8B;
        K.lIlIIlIlI[28] = 0x95 ^ 0xAF ^ (0x37 ^ 2);
        K.lIlIIlIlI[29] = 0x16 ^ 6;
        K.lIlIIlIlI[30] = 114 + 0 - 61 + 97 ^ 133 + 124 - 196 + 74;
        K.lIlIIlIlI[31] = 203 + 2 - 103 + 106 ^ 119 + 35 - -14 + 26;
        K.lIlIIlIlI[32] = 0x8F ^ 0x9C;
        K.lIlIIlIlI[33] = 0x40 ^ 0x54;
        K.lIlIIlIlI[34] = 0x85 ^ 0x90;
        K.lIlIIlIlI[35] = 0x80 ^ 0x96;
        K.lIlIIlIlI[36] = 90 + 23 - 107 + 137 ^ 40 + 83 - 12 + 41;
        K.lIlIIlIlI[37] = 0xC8 ^ 0x93 ^ (0x43 ^ 0);
        K.lIlIIlIlI[38] = 0xA ^ 0x33 ^ (0x35 ^ 0x16);
        K.lIlIIlIlI[39] = 0xB0 ^ 0xB7 ^ (0xB0 ^ 0xAC);
        K.lIlIIlIlI[40] = 0xB3 ^ 0x94 ^ (0x7E ^ 0x45);
        K.lIlIIlIlI[41] = 98 + 92 - 105 + 131 ^ 196 + 92 - 99 + 8;
        K.lIlIIlIlI[42] = 0x1D ^ 0x33 ^ (0x2A ^ 0x1A);
        K.lIlIIlIlI[43] = 0xBC ^ 0xA3;
        K.lIlIIlIlI[44] = 0x3F ^ 0x1F;
        K.lIlIIlIlI[45] = 11 + 143 - 79 + 72 ^ 171 + 174 - 338 + 171;
        K.lIlIIlIlI[46] = 0xFFFF8BFF & 0x7D61;
        K.lIlIIlIlI[47] = 0x59 ^ 0x7B;
        K.lIlIIlIlI[48] = -1 & (0xFFFFEBDF & 0x1D7F);
        K.lIlIIlIlI[49] = 0xE3 ^ 0xC0;
        K.lIlIIlIlI[50] = 0xA9 ^ 0x82 ^ (0x82 ^ 0x8D);
        K.lIlIIlIlI[51] = 0x68 ^ 0x79 ^ (0x47 ^ 0x73);
        K.lIlIIlIlI[52] = 0xD6 ^ 0x99 ^ (0xD4 ^ 0xBD);
        K.lIlIIlIlI[53] = 0xE0 ^ 0xC7;
        K.lIlIIlIlI[54] = 103 + 49 - 125 + 104 ^ 4 + 91 - -2 + 74;
        K.lIlIIlIlI[55] = 0x7D ^ 0x54;
        K.lIlIIlIlI[56] = 0xE ^ 0x1B ^ (0xB2 ^ 0x8D);
        K.lIlIIlIlI[57] = 0xC ^ 0x41 ^ (0x19 ^ 0x7F);
        K.lIlIIlIlI[58] = 0xA6 ^ 0x8A;
        K.lIlIIlIlI[59] = 0x28 ^ 5;
        K.lIlIIlIlI[60] = 50 + 119 - 143 + 109 ^ 84 + 160 - 232 + 157;
        K.lIlIIlIlI[61] = 1 ^ (0x59 ^ 0x77);
        K.lIlIIlIlI[62] = 0x14 ^ 0x3B ^ (0x5B ^ 0x44);
        K.lIlIIlIlI[63] = 0x57 ^ 0x66;
        K.lIlIIlIlI[64] = 0x19 ^ 9 ^ (0xAA ^ 0x89);
        K.lIlIIlIlI[65] = 78 + 16 - -31 + 47 ^ 50 + 64 - -3 + 35;
        K.lIlIIlIlI[66] = 20 + 24 - 23 + 120 ^ 158 + 114 - 137 + 49;
        K.lIlIIlIlI[67] = 0xB2 ^ 0x84;
        K.lIlIIlIlI[68] = 0x4A ^ 0x66 ^ (0xAB ^ 0xB0);
        K.lIlIIlIlI[69] = 0x26 ^ 0x1E;
        K.lIlIIlIlI[70] = 0xFFFFBFCE & 0x4A33;
        K.lIlIIlIlI[71] = 0xFFFFCF97 & 0x3A6B;
        K.lIlIIlIlI[72] = -(0xFFFFAFFF & 0x75A3) & (0xFFFFEFA7 & 0x3FFE);
        K.lIlIIlIlI[73] = -(0xFFFFF2D9 & 0x2DF7) & (0xFFFFEEF7 & 0x3BDD);
        K.lIlIIlIlI[74] = 0xFFFF8A1E & 0x7FE7;
        K.lIlIIlIlI[75] = 0x46 ^ 0x7F;
        K.lIlIIlIlI[76] = 0x52 ^ 0x68;
        K.lIlIIlIlI[77] = 0xD4 ^ 0xBA ^ (0x1B ^ 0x4E);
        K.lIlIIlIlI[78] = -(0xFFFF9FBF & 0x6EE9) & (0xFFFFBFFB & Short.MAX_VALUE);
        K.lIlIIlIlI[79] = 0x1C ^ 0x20;
        K.lIlIIlIlI[80] = -(0xFFFFE1EB & 0x7E55) & (0xFFFFE2F6 & 0x7FDD);
        K.lIlIIlIlI[81] = 0xFFFFF7F0 & 0xF8F;
        K.lIlIIlIlI[82] = 0xFFFFBEFD & 0x6FCE;
        K.lIlIIlIlI[83] = -(0xFFFFDFF7 & 0x361F) & (0xFFFFF7BE & Short.MAX_VALUE);
        K.lIlIIlIlI[84] = 0xFFFFC5FF & 0x3B2C;
        K.lIlIIlIlI[85] = -(0xFFFFE9CF & 0x7633) & (0xFFFFF7EF & 0x6F7E);
        K.lIlIIlIlI[86] = 0x44 ^ 0x20;
        K.lIlIIlIlI[87] = 0x73 ^ 0x4E;
        K.lIlIIlIlI[88] = 52 + 100 - 91 + 102 ^ 65 + 63 - 92 + 121;
        K.lIlIIlIlI[89] = 0x11 ^ 0x30 ^ (0x36 ^ 0x28);
        K.lIlIIlIlI[90] = 0x78 ^ 0x38;
        K.lIlIIlIlI[91] = -(0xFFFFFA75 & 0x77BF) & (0xFFFFFFFF & 0x7EB7);
        K.lIlIIlIlI[92] = 0xFFFFDD6F & 0x2FF0;
        K.lIlIIlIlI[93] = -(0xFFFFC74F & 0x79F4) & (0xFFFFCDD7 & 0x7FEF);
        K.lIlIIlIlI[94] = 0xFFFF9DFA & 0x6F95;
        K.lIlIIlIlI[95] = 0xFFFF8DAD & 0x7FFB;
        K.lIlIIlIlI[96] = -(0xFFFFFF2F & 0x72F6) & (0xFFFFFFBF & 0x7EFF);
        K.lIlIIlIlI[97] = 0xFFFFBFAA & 0x4DFD;
        K.lIlIIlIlI[98] = 0xFFFFA7AF & 0x7EF9;
        K.lIlIIlIlI[99] = -(0xFFFFF34F & 0x6EF1) & (0xFFFFFE79 & 0x6FEF);
        K.lIlIIlIlI[100] = 0xFFFFAFDA & 0x5C7F;
        K.lIlIIlIlI[101] = 0xFFFFEF9F & 0x1CFB;
        K.lIlIIlIlI[102] = 0xFFFF9D7B & 0x6FAF;
        K.lIlIIlIlI[103] = 0x38 ^ 0x77 ^ (0x4E ^ 0x40);
        K.lIlIIlIlI[104] = 0xCA ^ 0x88;
        K.lIlIIlIlI[105] = 0x76 ^ 0x35;
        K.lIlIIlIlI[106] = 0x12 ^ 0x56;
        K.lIlIIlIlI[107] = 0x63 ^ 0x26;
        K.lIlIIlIlI[108] = 0xFE ^ 0xBC ^ (0x93 ^ 0x97);
        K.lIlIIlIlI[109] = 0x4B ^ 0xC;
        K.lIlIIlIlI[110] = 0x60 ^ 0x28;
        K.lIlIIlIlI[111] = 0xA8 ^ 0x9F ^ (0xB8 ^ 0xC6);
        K.lIlIIlIlI[112] = 156 + 87 - 217 + 227 ^ 118 + 45 - 58 + 78;
        K.lIlIIlIlI[113] = 0x27 ^ 0x6C;
        K.lIlIIlIlI[114] = 0xF0 ^ 0xBC;
        K.lIlIIlIlI[115] = 0x48 ^ 5;
        K.lIlIIlIlI[116] = 0x5B ^ 0x15;
        K.lIlIIlIlI[117] = 0x7E ^ 0x31;
        K.lIlIIlIlI[118] = 0x7C ^ 0x2C;
        K.lIlIIlIlI[119] = 0x54 ^ 0x50 ^ (0x5B ^ 0xE);
        K.lIlIIlIlI[120] = 0x52 ^ 0x44 ^ (0xD8 ^ 0x9C);
        K.lIlIIlIlI[121] = 0x1B ^ 0x48;
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var6(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean S() {
        return lIlIIlIlI[0];
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static void af() {
        block17: {
            d var25;
            block16: {
                block15: {
                    block14: {
                        Object var26;
                        block13: {
                            block12: {
                                int[] nArray = new int[lIlIIlIlI[1]];
                                nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[7];
                                if (!K.var2(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lIlIIlIlI[1]];
                                nArray2[K.lIlIIlIlI[0]] = lIlIIlIlI[7];
                                if (!K.var2(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lIlIIlIlI[1]];
                                nArray3[K.lIlIIlIlI[0]] = lIlIIlIlI[7];
                                if (!K.var3(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIlIlI[9])) break block13;
                            }
                            var26 = new DHelper(lIlIIlIlI[7], lIlIIlIlI[9], lIlIIlIlI[80]);
                            bv.add((d)var26);
                            0;
                        }
                        int[] nArray = new int[lIlIIlIlI[1]];
                        nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[8];
                        if (K.var4(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var26 = new DHelper(lIlIIlIlI[8], lIlIIlIlI[1], lIlIIlIlI[81]);
                            bv.add((d)var26);
                            0;
                        }
                        if (K.var4(Bank.contains((Predicate)(var26 = item -> item.getName().toLowerCase().contains(lIlIIlIIl[lIlIIlIlI[88]]))) ? 1 : 0)) {
                            var25 = new DHelper(lIlIIlIlI[82], lIlIIlIlI[10], lIlIIlIlI[83]);
                            bv.add(var25);
                            0;
                        }
                        int[] nArray4 = new int[lIlIIlIlI[1]];
                        nArray4[K.lIlIIlIlI[0]] = lIlIIlIlI[17];
                        if (!K.var2(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                        int[] nArray5 = new int[lIlIIlIlI[1]];
                        nArray5[K.lIlIIlIlI[0]] = lIlIIlIlI[17];
                        if (!K.var2(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                        int[] nArray6 = new int[lIlIIlIlI[1]];
                        nArray6[K.lIlIIlIlI[0]] = lIlIIlIlI[17];
                        if (!K.var3(Bank.getFirst((int[])nArray6).getQuantity(), lIlIIlIlI[10])) break block15;
                    }
                    var25 = new DHelper(lIlIIlIlI[17], lIlIIlIlI[12], lIlIIlIlI[84]);
                    bv.add(var25);
                    0;
                }
                int[] nArray = new int[lIlIIlIlI[1]];
                nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[11];
                if (K.var4(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var25 = new DHelper(lIlIIlIlI[11], lIlIIlIlI[4], i.bq);
                    bv.add(var25);
                    0;
                }
                int[] nArray7 = new int[lIlIIlIlI[1]];
                nArray7[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
                if (!K.var2(Bank.contains((int[])nArray7) ? 1 : 0)) break block16;
                int[] nArray8 = new int[lIlIIlIlI[1]];
                nArray8[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
                if (!K.var2(Bank.contains((int[])nArray8) ? 1 : 0)) break block17;
                int[] nArray9 = new int[lIlIIlIlI[1]];
                nArray9[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
                if (!K.var3(Bank.getFirst((int[])nArray9).getQuantity(), lIlIIlIlI[28])) break block17;
            }
            var25 = new DHelper(lIlIIlIlI[6], lIlIIlIlI[54], lIlIIlIlI[85]);
            bv.add(var25);
            0;
        }
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = lIlIIlIlI[0];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = lIlIIlIlI[0];
        while (K.var3(var35, var34)) {
            char var36 = var33[var35];
            var30.append((char)(var36 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if (((0xAD ^ 0x85 ^ (0x4B ^ 0x27)) & (0x94 ^ 0x92 ^ (0x67 ^ 0x25) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var30);
    }

    @Override
    public String U() {
        return lIlIIlIIl[lIlIIlIlI[87]];
    }

    private static boolean var13(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void var37;
        int[] nArray = new int[lIlIIlIlI[3]];
        nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[6];
        nArray[K.lIlIIlIlI[1]] = lIlIIlIlI[8];
        int[] nArray2 = nArray;
        int var38 = lIlIIlIlI[0];
        while (K.var3(var38, ((void)var37).length)) {
            int[] nArray3 = new int[lIlIIlIlI[1]];
            nArray3[K.lIlIIlIlI[0]] = var37[var38];
            if (K.var4(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIlIIlIlI[0];
            }
            ++var38;
            0;
            
            return ((122 + 64 - 48 + 20 ^ 82 + 43 - 2 + 25) & (112 + 66 - 147 + 110 ^ 73 + 13 - -27 + 22 ^ -1)) != 0;
        }
        return lIlIIlIlI[1];
    }

    private static boolean var7(int n2) {
        return n2 < 0;
    }

    @Override
    public int T() {
        try {
            K.ce();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if null != null {
            return (0x8D ^ 0xA2) & ~(0x4C ^ 0x63);
        }
        return lIlIIlIlI[86];
    }

        catch (Exception var45) {
            var45.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (K.var46(Vars.getBit((int)QuestVarbits.QUEST_DEMON_SLAYER.getId()), lIlIIlIlI[5])) {
            bl = lIlIIlIlI[1];
            0;
            if (1 < 1) {
                return ((0x4B ^ 4 ^ (0xC0 ^ 0x81)) & (0x22 ^ 0x3D ^ (0xD6 ^ 0xC7) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIlIlI[0];
        }
        return bl;
    }

    private static boolean var10(int n2, int n3) {
        return n2 <= n3;
    }

    private static int var8(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean var12(int n2, int n3) {
        return n2 != n3;
    }

    public D1f9e3af-c0a5-49dd-86b2-8e857984fef3Manager() {
        this.ja = lIlIIlIlI[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void cg() {
        void var47;
        BankLocation bankLocation = BankLocation.getNearest();
        if (K.var5(bankLocation) && K.var4(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[76]];
            a.a(bankLocation);
        }
        if (K.var5(var47) && K.var2(var47.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (K.var4(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIlIlI[2]);
                0;
                Time.sleepTicks((int)lIlIIlIlI[5]);
                0;
            }
            if (K.var2(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIlIIl[lIlIIlIlI[77]];
                if (K.var2(iS)) {
                    int[] nArray = new int[lIlIIlIlI[1]];
                    nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[48];
                    if (K.var4(Inventory.contains((int[])nArray) ? 1 : 0) && K.var6(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIlIIlIlI[4]);
                        0;
                    }
                }
                if (K.var6(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIlIIlIlI[3]);
                    0;
                }
                if (K.var2(iS)) {
                    int[] nArray = new int[lIlIIlIlI[1]];
                    nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[48];
                    if (K.var2(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        a.a(lIlIIlIlI[11], lIlIIlIlI[1]);
                        a.a(lIlIIlIlI[6], lIlIIlIlI[12]);
                        a.a(lIlIIlIlI[48], lIlIIlIlI[1]);
                        a.a(lIlIIlIlI[24], lIlIIlIlI[1]);
                        a.a(lIlIIlIlI[46], lIlIIlIlI[1]);
                        Time.sleepTicks((int)lIlIIlIlI[1]);
                        0;
                        int[] nArray2 = new int[lIlIIlIlI[1]];
                        nArray2[K.lIlIIlIlI[0]] = lIlIIlIlI[11];
                        if (K.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            a.a(lIlIIlIlI[78], lIlIIlIlI[1]);
                        }
                        a.a(lIlIIlIlI[17], Inventory.getFreeSlots() - lIlIIlIlI[1]);
                    }
                }
                if (K.var2(iS)) {
                    int[] nArray = new int[lIlIIlIlI[1]];
                    nArray[K.lIlIIlIlI[0]] = lIlIIlIlI[48];
                    if (K.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (K.var4(Equipment.contains((int[])f.aR) ? 1 : 0) && K.var4(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                            a.b(f.aR, lIlIIlIlI[1]);
                        }
                        if (K.var2(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aR).interact(lIlIIlIIl[lIlIIlIlI[79]]);
                            Time.sleepTicks((int)lIlIIlIlI[5]);
                            0;
                        }
                        if (K.var4(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIlIIlIlI[10]);
                            0;
                        }
                        if (K.var2(Bank.isOpen() ? 1 : 0)) {
                            a.a(lIlIIlIlI[11], lIlIIlIlI[1]);
                            a.a(lIlIIlIlI[6], lIlIIlIlI[12]);
                            a.a(lIlIIlIlI[7], lIlIIlIlI[9]);
                        }
                    }
                }
            }
        }
    }

    private static void var39() {
        lIlIIlIIl = new String[lIlIIlIlI[121]];
        K.lIlIIlIIl[K.lIlIIlIlI[0]] = "Finished buying items, switching back to quest";
        K.lIlIIlIIl[K.lIlIIlIlI[1]] = "Nav to bank";
        K.lIlIIlIIl[K.lIlIIlIlI[3]] = "Handling banking";
        K.lIlIIlIIl[K.lIlIIlIlI[5]] = "We are missing quest supplies, switching to BUYING";
        K.lIlIIlIIl[K.lIlIIlIlI[4]] = "We are missing quest supplies, switching to BUYING";
        K.lIlIIlIIl[K.lIlIIlIlI[10]] = "Wear";
        K.lIlIIlIIl[K.lIlIIlIlI[16]] = "Drink";
        K.lIlIIlIIl[K.lIlIIlIlI[18]] = "Eat";
        K.lIlIIlIIl[K.lIlIIlIlI[19]] = "Nav to start";
        K.lIlIIlIIl[K.lIlIIlIlI[20]] = "Aris";
        K.lIlIIlIIl[K.lIlIIlIlI[12]] = "Nav to sir pyrsin";
        K.lIlIIlIIl[K.lIlIIlIlI[23]] = "Sir Prysin";
        K.lIlIIlIIl[K.lIlIIlIlI[25]] = "Silverlight";
        K.lIlIIlIIl[K.lIlIIlIlI[26]] = "Nav to captain";
        K.lIlIIlIIl[K.lIlIIlIlI[27]] = "Captain Rovin";
        K.lIlIIlIIl[K.lIlIIlIlI[28]] = "Bucket of water";
        K.lIlIIlIIl[K.lIlIIlIlI[29]] = "Nav to drain";
        K.lIlIIlIIl[K.lIlIIlIlI[30]] = "Bucket of water";
        K.lIlIIlIIl[K.lIlIIlIlI[31]] = "Drain";
        K.lIlIIlIIl[K.lIlIIlIlI[32]] = "Bucket of water";
        K.lIlIIlIIl[K.lIlIIlIlI[33]] = "Nav to sewer key";
        K.lIlIIlIIl[K.lIlIIlIlI[34]] = "Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[35]] = "Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[36]] = "Open";
        K.lIlIIlIIl[K.lIlIIlIlI[37]] = "Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[9]] = "Open";
        K.lIlIIlIIl[K.lIlIIlIlI[38]] = "Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[39]] = "Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[40]] = "Climb-down";
        K.lIlIIlIIl[K.lIlIIlIlI[41]] = "Manhole";
        K.lIlIIlIIl[K.lIlIIlIlI[42]] = "Climb-down";
        K.lIlIIlIIl[K.lIlIIlIlI[43]] = "Rusty key";
        K.lIlIIlIIl[K.lIlIIlIlI[44]] = "Rusty key";
        K.lIlIIlIIl[K.lIlIIlIlI[45]] = "Take";
        K.lIlIIlIIl[K.lIlIIlIlI[47]] = "Silverlight";
        K.lIlIIlIIl[K.lIlIIlIlI[49]] = "Bones";
        K.lIlIIlIIl[K.lIlIIlIlI[50]] = "Bones";
        K.lIlIIlIIl[K.lIlIIlIlI[51]] = "Nav to wizard";
        K.lIlIIlIIl[K.lIlIIlIlI[52]] = "Wizard Traiborn";
        K.lIlIIlIIl[K.lIlIIlIlI[53]] = "Silverlight";
        K.lIlIIlIIl[K.lIlIIlIlI[54]] = "Nav to sir pyrsin";
        K.lIlIIlIIl[K.lIlIIlIlI[55]] = "Sir Prysin";
        K.lIlIIlIIl[K.lIlIIlIlI[56]] = "Silverlight";
        K.lIlIIlIIl[K.lIlIIlIlI[57]] = "Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[58]] = "Weakened Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[59]] = "Nav to demon";
        K.lIlIIlIIl[K.lIlIIlIlI[60]] = "Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[61]] = "Weakened Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[62]] = "Attack";
        K.lIlIIlIIl[K.lIlIIlIlI[63]] = "Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[15]] = "Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[64]] = "Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[65]] = "Attack";
        K.lIlIIlIIl[K.lIlIIlIlI[66]] = "Banishing";
        K.lIlIIlIIl[K.lIlIIlIlI[67]] = "[";
        K.lIlIIlIIl[K.lIlIIlIlI[68]] = "Weakened Delrith";
        K.lIlIIlIIl[K.lIlIIlIlI[69]] = "Banishing";
        K.lIlIIlIIl[K.lIlIIlIlI[75]] = ", ";
        K.lIlIIlIIl[K.lIlIIlIlI[76]] = "Nav to bank";
        K.lIlIIlIIl[K.lIlIIlIlI[77]] = "Handling banking";
        K.lIlIIlIIl[K.lIlIIlIlI[79]] = "Wear";
        K.lIlIIlIIl[K.lIlIIlIlI[87]] = "Demon Slayer";
        K.lIlIIlIIl[K.lIlIIlIlI[88]] = "ring of wealth (";
        K.lIlIIlIIl[K.lIlIIlIlI[89]] = "wizard";
        K.lIlIIlIIl[K.lIlIIlIlI[90]] = "Now what was that incantation again?";
        K.lIlIIlIIl[K.lIlIIlIlI[103]] = "Yes.";
        K.lIlIIlIIl[K.lIlIIlIlI[104]] = "The Demon Slayer Quest";
        K.lIlIIlIIl[K.lIlIIlIlI[105]] = "Okay, where is he? I'll kill him for you!";
        K.lIlIIlIIl[K.lIlIIlIlI[106]] = "So how did Wally kill Delrith?";
        K.lIlIIlIIl[K.lIlIIlIlI[107]] = "What is the magical incantation?";
        K.lIlIIlIIl[K.lIlIIlIlI[108]] = "Aris said I should come and talk to you.";
        K.lIlIIlIIl[K.lIlIIlIlI[109]] = "I need to find Silverlight.";
        K.lIlIIlIIl[K.lIlIIlIlI[110]] = "He's back and unfortunately I've got to deal with him.";
        K.lIlIIlIIl[K.lIlIIlIlI[111]] = "So give me the keys!";
        K.lIlIIlIIl[K.lIlIIlIlI[112]] = "Yes I know, but this is important.";
        K.lIlIIlIIl[K.lIlIIlIlI[113]] = "There's a demon who wants to invade this city.";
        K.lIlIIlIIl[K.lIlIIlIlI[114]] = "Yes, very.";
        K.lIlIIlIIl[K.lIlIIlIlI[115]] = "It's not them who are going to fight the demon, it's me.";
        K.lIlIIlIIl[K.lIlIIlIlI[116]] = "Sir Prysin said you would give me the key.";
        K.lIlIIlIIl[K.lIlIIlIlI[117]] = "Why did he give you one of the keys then?";
        K.lIlIIlIIl[K.lIlIIlIlI[118]] = "Talk about Demon Slayer.";
        K.lIlIIlIIl[K.lIlIIlIlI[119]] = "Well, have you got any keys knocking around?";
        K.lIlIIlIIl[K.lIlIIlIlI[120]] = "I'll get the bones for you.";
    }

    private static void cf() {
        if (!K.var13(iZ) || K.var4(Vars.getBit((int)lIlIIlIlI[70])) && K.var4(Vars.getBit((int)lIlIIlIlI[71]))) {
            return;
        }
        String[] stringArray = new String[lIlIIlIlI[10]];
        stringArray[K.lIlIIlIlI[0]] = iQ.get(Vars.getBit((int)lIlIIlIlI[70]));
        stringArray[K.lIlIIlIlI[1]] = iQ.get(Vars.getBit((int)lIlIIlIlI[71]));
        stringArray[K.lIlIIlIlI[3]] = iQ.get(Vars.getBit((int)lIlIIlIlI[72]));
        stringArray[K.lIlIIlIlI[5]] = iQ.get(Vars.getBit((int)lIlIIlIlI[73]));
        stringArray[K.lIlIIlIlI[4]] = iQ.get(Vars.getBit((int)lIlIIlIlI[74]));
        iZ = stringArray;
        String string = "Say the following in order: " + String.join((CharSequence)lIlIIlIIl[lIlIIlIlI[75]], iZ);
        System.out.println(string);
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var46(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var11(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var14(Object object, Object object2) {
        return object == object2;
    }
}

