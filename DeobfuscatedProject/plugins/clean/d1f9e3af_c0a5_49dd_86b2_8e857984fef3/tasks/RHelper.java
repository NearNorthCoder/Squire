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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
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

public class RHelper
implements W {
    
    public static  WorldPoint ci;
    private static  WorldPoint cn;
    static  boolean cm;
    
    public static  WorldPoint bX;
    public static  WorldPoint ck;
    public static  WorldPoint cj;
    static  int cl;
    public static  boolean bt;
    public static  List<d> bv;

    private static boolean llllllllIlI(int n2) {
        return n2 <= 0;
    }

    private static boolean lllllllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (r.llllllllIll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[57])) {
            bl = lIIllIIIl[0];

            if ((0x5E ^ 0x5A) < 2) {
                return false;
            }
        } else {
            bl = lIIllIIIl[1];
        }
        return bl;
    }

    public static void aG() {
        block63: {
            block64: {
                block65: {
                    if (r.lllllllIIII(bt ? 1 : 0)) {
                        b.a(bv);
                        if (r.lllllllIIIl(bv.size(), lIIllIIIl[0])) {
                            System.out.println(lIIllIIII[lIIllIIIl[1]]);
                            bt = lIIllIIIl[1];
                        }
                    }
                    if (!r.lllllllIIlI(bt ? 1 : 0)) break block63;
                    if (r.lllllllIIlI(r.ab() ? 1 : 0) && r.lllllllIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        BankLocation lIIIIIllIIIIllI = BankLocation.getNearest();
                        if (r.lllllllIIll(lIIIIIllIIIIllI) && r.lllllllIIlI(lIIIIIllIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[0]];
                            a.a(lIIIIIllIIIIllI);
                        }
                        if (r.lllllllIIll(lIIIIIllIIIIllI) && r.lllllllIIII(lIIIIIllIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (r.lllllllIIlI(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIIIl[2]);

                            }
                            if (r.lllllllIIII(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[3]];
                                if (r.lllllllIlII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIIllIIIl[4]);

                                }
                                if (r.lllllllIlII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIIllIIIl[3]);

                                }
                                int[] nArray = new int[lIIllIIIl[5]];
                                nArray[r.lIIllIIIl[1]] = lIIllIIIl[6];
                                nArray[r.lIIllIIIl[0]] = lIIllIIIl[7];
                                nArray[r.lIIllIIIl[3]] = lIIllIIIl[8];
                                nArray[r.lIIllIIIl[9]] = lIIllIIIl[10];
                                nArray[r.lIIllIIIl[4]] = lIIllIIIl[11];
                                nArray[r.lIIllIIIl[12]] = lIIllIIIl[13];
                                if (r.lllllllIIlI(e.b(nArray) ? 1 : 0)) {
                                    r.af();
                                    System.out.println(lIIllIIII[lIIllIIIl[9]]);
                                    bt = lIIllIIIl[0];
                                    return;
                                }
                                int[] nArray2 = new int[lIIllIIIl[5]];
                                nArray2[r.lIIllIIIl[1]] = lIIllIIIl[6];
                                nArray2[r.lIIllIIIl[0]] = lIIllIIIl[7];
                                nArray2[r.lIIllIIIl[3]] = lIIllIIIl[8];
                                nArray2[r.lIIllIIIl[9]] = lIIllIIIl[10];
                                nArray2[r.lIIllIIIl[4]] = lIIllIIIl[11];
                                nArray2[r.lIIllIIIl[12]] = lIIllIIIl[13];
                                if (r.lllllllIIII(e.b(nArray2) ? 1 : 0)) {
                                    int[] nArray3 = new int[lIIllIIIl[3]];
                                    nArray3[r.lIIllIIIl[1]] = lIIllIIIl[8];
                                    nArray3[r.lIIllIIIl[0]] = lIIllIIIl[10];
                                    a.a(nArray3);
                                    a.a(lIIllIIIl[6], lIIllIIIl[14]);
                                    a.a(lIIllIIIl[7], lIIllIIIl[14]);
                                    a.a(lIIllIIIl[15], lIIllIIIl[14]);
                                    a.b(f.aR, lIIllIIIl[0]);
                                    a.a(lIIllIIIl[11], lIIllIIIl[4]);
                                    a.a(lIIllIIIl[13], lIIllIIIl[16]);
                                }
                            }
                        }
                    }
                    if (r.lllllllIIII(Inventory.contains((int[])f.aV) ? 1 : 0) && r.lllllllIIIl(Movement.getRunEnergy(), lIIllIIIl[17])) {
                        Inventory.getFirst((int[])f.aV).interact(lIIllIIII[lIIllIIIl[4]]);
                        Time.sleepTicks((int)lIIllIIIl[0]);

                    }
                    if (r.lllllllIIII(r.ab() ? 1 : 0) && r.lllllllIIlI(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                        if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(bX), lIIllIIIl[4])) {
                            if (r.lllllllIIII(Inventory.contains((int[])f.aR) ? 1 : 0) && r.lllllllIIlI(Equipment.contains((int[])f.aR) ? 1 : 0)) {
                                Inventory.getFirst((int[])f.aR).interact(lIIllIIII[lIIllIIIl[12]]);
                            }
                            if (r.lllllllIIII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[5]];
                            Movement.walkTo((WorldPoint)bX);

                            Time.sleepTicks((int)lIIllIIIl[0]);

                        }
                        if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIIllIIIl[4])) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[18]];
                            cl = lIIllIIIl[1];
                            if (r.lllllllIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIIllIIIl[0]];
                                stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[16]];
                                TileObjects.getNearest((String[])stringArray).interact(lIIllIIII[lIIllIIIl[19]]);
                                Time.sleepTicks((int)lIIllIIIl[3]);

                            }
                            g.a(bR);
                        }
                    }
                    if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[12])) {
                        if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[14]];
                            Movement.walkTo((WorldPoint)ci);

                            Time.sleepTicks((int)lIIllIIIl[0]);

                            if (r.lllllllIIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIllIIIl[20], lIIllIIIl[21], lIIllIIIl[1])) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[22]];
                                e.c(new WorldPoint(lIIllIIIl[23], lIIllIIIl[24], lIIllIIIl[1]));
                                Time.sleepTicks((int)lIIllIIIl[5]);

                            }
                        }
                        if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[25]];
                            g.a(lIIllIIII[lIIllIIIl[26]], bR, lIIllIIIl[0]);
                        }
                    }
                    if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[14])) {
                        if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[27]];
                            Movement.walkTo((WorldPoint)cj);

                            Time.sleepTicks((int)lIIllIIIl[0]);

                        }
                        if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                            int[] nArray = new int[lIIllIIIl[0]];
                            nArray[r.lIIllIIIl[1]] = lIIllIIIl[8];
                            if (r.lllllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIllIIIl[0]];
                                nArray4[r.lIIllIIIl[1]] = lIIllIIIl[8];
                                String[] stringArray = new String[lIIllIIIl[0]];
                                stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[28]];
                                Inventory.getFirst((int[])nArray4).useOn(TileObjects.getNearest((String[])stringArray));
                                Time.sleepTicks((int)lIIllIIIl[3]);

                            }
                        }
                    }
                    if (!r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[28])) break block64;
                    int[] nArray = new int[lIIllIIIl[0]];
                    nArray[r.lIIllIIIl[1]] = lIIllIIIl[10];
                    if (r.lllllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIllIIIl[0]];
                        nArray5[r.lIIllIIIl[1]] = lIIllIIIl[10];
                        Inventory.getFirst((int[])nArray5).interact(lIIllIIII[lIIllIIIl[29]]);
                    }
                    if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                        String[] stringArray = new String[lIIllIIIl[0]];
                        stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[30]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIllIIII[lIIllIIIl[31]]);
                        Time.sleepTicks((int)lIIllIIIl[9]);

                    }
                    if (!r.lllllllIlIl(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(lIIllIIIl[32], lIIllIIIl[33])), lIIllIIIl[34])) break block65;
                    String[] stringArray = new String[lIIllIIIl[0]];
                    stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[35]];
                    if (!r.lllllllIIll(TileObjects.getNearest((String[])stringArray))) break block64;
                }
                String[] stringArray = new String[lIIllIIIl[0]];
                stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[36]];
                if (r.lllllllIIll(TileObjects.getNearest((String[])stringArray))) {
                    if (r.lllllllIlIl(Players.getLocal().getLocalLocation().getY(), lIIllIIIl[37])) {
                        String[] stringArray2 = new String[lIIllIIIl[0]];
                        stringArray2[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[38]];
                        if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray2).getWorldLocation()), lIIllIIIl[14])) {
                            String[] stringArray3 = new String[lIIllIIIl[0]];
                            stringArray3[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[39]];
                            if (r.llllllllIII(NPCs.getNearest((String[])stringArray3))) {
                                AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[40]];
                                String[] stringArray4 = new String[lIIllIIIl[0]];
                                stringArray4[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[41]];
                                TileObjects.getNearest((String[])stringArray4).interact(lIIllIIII[lIIllIIIl[42]]);
                                Time.sleepTicks((int)lIIllIIIl[14]);

                            }
                        }
                    }
                    String[] stringArray5 = new String[lIIllIIIl[0]];
                    stringArray5[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[43]];
                    if (r.llllllllIII(NPCs.getNearest((String[])stringArray5)) && r.lllllllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[44]];
                        String[] stringArray6 = new String[lIIllIIIl[0]];
                        stringArray6[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[45]];
                        TileObjects.getNearest((String[])stringArray6).interact(lIIllIIII[lIIllIIIl[46]]);
                        Time.sleepTicks((int)lIIllIIIl[12]);

                        g.a(bR);
                    }
                    g.a(bR);
                }
            }
            if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[36])) {
                AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[47]];
                g.a(lIIllIIII[lIIllIIIl[48]], bR);
            }
            if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[42])) {
                if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                    String[] stringArray = new String[lIIllIIIl[0]];
                    stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[49]];
                    if (r.llllllllIII(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray7 = new String[lIIllIIIl[0]];
                        stringArray7[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[50]];
                        if (r.lllllllIIlI(Equipment.contains((String[])stringArray7) ? 1 : 0)) {
                            String[] stringArray8 = new String[lIIllIIIl[0]];
                            stringArray8[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[51]];
                            if (r.lllllllIIII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                                String[] stringArray9 = new String[lIIllIIIl[0]];
                                stringArray9[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[52]];
                                Inventory.getFirst((String[])stringArray9).interact(lIIllIIII[lIIllIIIl[53]]);
                            }
                        }
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[54]];
                        Movement.walkTo((WorldPoint)cj);

                        Time.sleepTicks((int)lIIllIIIl[0]);

                    }
                }
                if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIllIIIl[4])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[55]];
                    String[] stringArray = new String[lIIllIIIl[0]];
                    stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[56]];
                    if (r.lllllllIIll(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray10 = new String[lIIllIIIl[0]];
                        stringArray10[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[57]];
                        TileObjects.getNearest((String[])stringArray10).interact(lIIllIIII[lIIllIIIl[58]]);
                        Time.sleepTicks((int)lIIllIIIl[9]);

                    }
                }
                if (r.lllllllIlIl(Players.getLocal().getLocalLocation().getY(), lIIllIIIl[37])) {
                    String[] stringArray = new String[lIIllIIIl[0]];
                    stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[59]];
                    if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray).getWorldLocation()), lIIllIIIl[18])) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[60]];
                        String[] stringArray11 = new String[lIIllIIIl[0]];
                        stringArray11[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[61]];
                        TileObjects.getNearest((String[])stringArray11).interact(lIIllIIII[lIIllIIIl[62]]);
                        Time.sleepTicks((int)lIIllIIIl[14]);

                    }
                }
                if (r.llllllllIII(Players.getLocal().getInteracting()) && r.lllllllIIlI(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIIIl[0]];
                    stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[63]];
                    if (r.lllllllIIlI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray12 = new String[lIIllIIIl[0]];
                        stringArray12[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[64]];
                        if (r.lllllllIIII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                            String[] stringArray13 = new String[lIIllIIIl[0]];
                            stringArray13[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[65]];
                            Inventory.getFirst((String[])stringArray13).interact(lIIllIIII[lIIllIIIl[66]]);
                        }
                    }
                    int[] nArray = new int[lIIllIIIl[0]];
                    nArray[r.lIIllIIIl[1]] = lIIllIIIl[10];
                    if (r.lllllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[lIIllIIIl[0]];
                        nArray6[r.lIIllIIIl[1]] = lIIllIIIl[10];
                        if (r.lllllllIIlI(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[lIIllIIIl[0]];
                            nArray7[r.lIIllIIIl[1]] = lIIllIIIl[10];
                            Inventory.getFirst((int[])nArray7).interact(lIIllIIII[lIIllIIIl[34]]);
                        }
                    }
                    String[] stringArray14 = new String[lIIllIIIl[0]];
                    stringArray14[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[67]];
                    NPCs.getNearest((String[])stringArray14).interact(lIIllIIII[lIIllIIIl[68]]);
                    Time.sleepTicks((int)lIIllIIIl[0]);

                }
                if (r.llllllllIIl(r.llllllIllll(e.u(), 60.0))) {
                    int[] nArray = new int[lIIllIIIl[0]];
                    nArray[r.lIIllIIIl[1]] = lIIllIIIl[13];
                    if (r.lllllllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIIllIIIl[0]];
                        nArray8[r.lIIllIIIl[1]] = lIIllIIIl[13];
                        Inventory.getFirst((int[])nArray8).interact(lIIllIIII[lIIllIIIl[69]]);
                        Time.sleepTicks((int)lIIllIIIl[0]);

                    }
                }
                g.a(bR);
            }
            if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[47])) {
                String[] stringArray = new String[lIIllIIIl[0]];
                stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[70]];
                if (r.lllllllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[71]];
                    String[] stringArray15 = new String[lIIllIIIl[0]];
                    stringArray15[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[72]];
                    TileObjects.getNearest((String[])stringArray15).interact(lIIllIIII[lIIllIIIl[73]]);
                    Time.sleepTicks((int)lIIllIIIl[4]);

                }
                String[] stringArray16 = new String[lIIllIIIl[0]];
                stringArray16[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[74]];
                if (r.lllllllIIII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                    if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[75]];
                        Movement.walkTo((WorldPoint)ci);

                        Time.sleepTicks((int)lIIllIIIl[0]);

                        if (r.lllllllIIII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIllIIIl[20], lIIllIIIl[21], lIIllIIIl[1])) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[76]];
                            e.c(new WorldPoint(lIIllIIIl[23], lIIllIIIl[24], lIIllIIIl[1]));
                            Time.sleepTicks((int)lIIllIIIl[5]);

                        }
                    }
                    if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(ci), lIIllIIIl[4])) {
                        AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[77]];
                        g.a(lIIllIIII[lIIllIIIl[78]], bR, lIIllIIIl[0]);
                    }
                }
            }
            if (r.lllllllIlll(Vars.getBit((int)QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIllIIIl[52])) {
                if (r.lllllllIlIl(Players.getLocal().getWorldLocation().distanceTo(ck), lIIllIIIl[9])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[79]];
                    Movement.walkTo((WorldPoint)ck);

                    Time.sleepTicks((int)lIIllIIIl[0]);

                }
                if (r.lllllllIllI(Players.getLocal().getWorldLocation().distanceTo(ck), lIIllIIIl[9])) {
                    AccBuilderEasyClues.c = lIIllIIII[lIIllIIIl[80]];
                    if (r.lllllllIIIl(cl, lIIllIIIl[0])) {
                        an.pm += lIIllIIIl[0];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIllIIIl[0];
                        an.pm = lIIllIIIl[1];
                        cm = lIIllIIIl[1];
                    }
                    g.a(lIIllIIII[lIIllIIIl[17]], bR);
                }
            }
        }
    }

    private static void llllllIllIl() {
        lIIllIIII = new String[lIIllIIIl[100]];
        r.lIIllIIII[r.lIIllIIIl[1]] = "Finished buying items, switching back to quest";
        r.lIIllIIII[r.lIIllIIIl[0]] = "Nav to bank";
        r.lIIllIIII[r.lIIllIIIl[3]] = "Handling banking";
        r.lIIllIIII[r.lIIllIIIl[9]] = "We are missing quest supplies, switching to BUYING";
        r.lIIllIIII[r.lIIllIIIl[4]] = "Drink";
        r.lIIllIIII[r.lIIllIIIl[12]] = "Wear";
        r.lIIllIIII[r.lIIllIIIl[5]] = "Nav to start";
        r.lIIllIIII[r.lIIllIIIl[18]] = "Starting quest";
        r.lIIllIIII[r.lIIllIIIl[16]] = "Notice board";
        r.lIIllIIII[r.lIIllIIIl[19]] = "Check";
        r.lIIllIIII[r.lIIllIIIl[14]] = "Nav to sarah";
        r.lIIllIIII[r.lIIllIIIl[22]] = "Stuck, clicking out";
        r.lIIllIIII[r.lIIllIIIl[25]] = "Talking sarah";
        r.lIIllIIII[r.lIIllIIIl[26]] = "Sarah";
        r.lIIllIIII[r.lIIllIIIl[27]] = "Nav to hole";
        r.lIIllIIII[r.lIIllIIIl[28]] = "Strange hole";
        r.lIIllIIII[r.lIIllIIIl[29]] = "Wield";
        r.lIIllIIII[r.lIIllIIIl[30]] = "Strange hole";
        r.lIIllIIII[r.lIIllIIIl[31]] = "Climb-down";
        r.lIIllIIII[r.lIIllIIIl[35]] = "Skeleton";
        r.lIIllIIII[r.lIIllIIIl[36]] = "Skeleton";
        r.lIIllIIII[r.lIIllIIIl[38]] = "Blockage";
        r.lIIllIIII[r.lIIllIIIl[39]] = "Pig Thing";
        r.lIIllIIII[r.lIIllIIIl[40]] = "Climb over blockage";
        r.lIIllIIII[r.lIIllIIIl[41]] = "Blockage";
        r.lIIllIIII[r.lIIllIIIl[42]] = "Climb-over";
        r.lIIllIIII[r.lIIllIIIl[43]] = "Pig Thing";
        r.lIIllIIII[r.lIIllIIIl[44]] = "Interact skele";
        r.lIIllIIII[r.lIIllIIIl[45]] = "Skeleton";
        r.lIIllIIII[r.lIIllIIIl[46]] = "Investigate";
        r.lIIllIIII[r.lIIllIIIl[47]] = "Interacting Spira";
        r.lIIllIIII[r.lIIllIIIl[48]] = "Spria";
        r.lIIllIIII[r.lIIllIIIl[49]] = "Sourhog";
        r.lIIllIIII[r.lIIllIIIl[50]] = "Reinforced goggles";
        r.lIIllIIII[r.lIIllIIIl[51]] = "Reinforced goggles";
        r.lIIllIIII[r.lIIllIIIl[52]] = "Reinforced goggles";
        r.lIIllIIII[r.lIIllIIIl[53]] = "Wear";
        r.lIIllIIII[r.lIIllIIIl[54]] = "Nav to hole";
        r.lIIllIIII[r.lIIllIIIl[55]] = "Climb down hole";
        r.lIIllIIII[r.lIIllIIIl[56]] = "Strange hole";
        r.lIIllIIII[r.lIIllIIIl[57]] = "Strange hole";
        r.lIIllIIII[r.lIIllIIIl[58]] = "Climb-down";
        r.lIIllIIII[r.lIIllIIIl[59]] = "Blockage";
        r.lIIllIIII[r.lIIllIIIl[60]] = "Climb over blockage";
        r.lIIllIIII[r.lIIllIIIl[61]] = "Blockage";
        r.lIIllIIII[r.lIIllIIIl[62]] = "Climb-over";
        r.lIIllIIII[r.lIIllIIIl[63]] = "Reinforced goggles";
        r.lIIllIIII[r.lIIllIIIl[64]] = "Reinforced goggles";
        r.lIIllIIII[r.lIIllIIIl[65]] = "Reinforced goggles";
        r.lIIllIIII[r.lIIllIIIl[66]] = "Wear";
        r.lIIllIIII[r.lIIllIIIl[34]] = "Wield";
        r.lIIllIIII[r.lIIllIIIl[67]] = "Sourhog";
        r.lIIllIIII[r.lIIllIIIl[68]] = "Attack";
        r.lIIllIIII[r.lIIllIIIl[69]] = "Eat";
        r.lIIllIIII[r.lIIllIIIl[70]] = "Sourhog foot";
        r.lIIllIIII[r.lIIllIIIl[71]] = "Cutting foot";
        r.lIIllIIII[r.lIIllIIIl[72]] = "Dead sourhog";
        r.lIIllIIII[r.lIIllIIIl[73]] = "Cut-foot";
        r.lIIllIIII[r.lIIllIIIl[74]] = "Sourhog foot";
        r.lIIllIIII[r.lIIllIIIl[75]] = "Nav to sarah";
        r.lIIllIIII[r.lIIllIIIl[76]] = "Stuck, clicking out";
        r.lIIllIIII[r.lIIllIIIl[77]] = "Talking sarah";
        r.lIIllIIII[r.lIIllIIIl[78]] = "Sarah";
        r.lIIllIIII[r.lIIllIIIl[79]] = "Nav to Spria";
        r.lIIllIIII[r.lIIllIIIl[80]] = "Talking spria";
        r.lIIllIIII[r.lIIllIIIl[17]] = "Spria";
        r.lIIllIIII[r.lIIllIIIl[86]] = "A porceline of interest";
        r.lIIllIIII[r.lIIllIIIl[87]] = "ring of wealth (";
        r.lIIllIIII[r.lIIllIIIl[96]] = "Yes.";
        r.lIIllIIII[r.lIIllIIIl[97]] = "Talk about the bounty.";
        r.lIIllIIII[r.lIIllIIIl[98]] = "I think that'll be all for now.";
        r.lIIllIIII[r.lIIllIIIl[99]] = "Yes";
    }

    private static boolean lllllllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllllllIIl(int n2) {
        return n2 < 0;
    }

    private static int llllllIllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lllllllIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllllllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllllIlII(int n2) {
        return n2 > 0;
    }

    private static boolean lllllllIIlI(int n2) {
        return n2 == 0;
    }

    static {
        r.llllllIlllI();
        r.llllllIllIl();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIIllIIIl[88], lIIllIIIl[89], lIIllIIIl[1]);
        ci = new WorldPoint(lIIllIIIl[90], lIIllIIIl[91], lIIllIIIl[1]);
        cj = new WorldPoint(lIIllIIIl[92], lIIllIIIl[93], lIIllIIIl[1]);
        ck = new WorldPoint(lIIllIIIl[94], lIIllIIIl[95], lIIllIIIl[1]);
        cn = null;
        String[] stringArray = new String[lIIllIIIl[4]];
        stringArray[r.lIIllIIIl[1]] = lIIllIIII[lIIllIIIl[96]];
        stringArray[r.lIIllIIIl[0]] = lIIllIIII[lIIllIIIl[97]];
        stringArray[r.lIIllIIIl[3]] = lIIllIIII[lIIllIIIl[98]];
        stringArray[r.lIIllIIIl[9]] = lIIllIIII[lIIllIIIl[99]];
        bR = stringArray;
    }

    private static boolean lllllllIIll(Object object) {
        return object != null;
    }

        return String.valueOf(lIIIIIlIllIIllI);
    }

    @Override
    public int T() {
        try {
            r.aG();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 <= 2) {
            return (0x4C ^ 0x2D) & ~(0xD ^ 0x6C);
        }
        return lIIllIIIl[85];
    }

    private static boolean llllllllIII(Object object) {
        return object == null;
    }

    private static void af() {
        d lIIIIIllIIIIIlI;
        block10: {
            block9: {
                Object lIIIIIllIIIIIll;
                int[] nArray = new int[lIIllIIIl[0]];
                nArray[r.lIIllIIIl[1]] = lIIllIIIl[8];
                if (r.lllllllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIllIIIl[8], lIIllIIIl[0], lIIllIIIl[81]);
                    bv.add(d2);

                }
                int[] nArray2 = new int[lIIllIIIl[0]];
                nArray2[r.lIIllIIIl[1]] = lIIllIIIl[10];
                if (r.lllllllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIIIIIllIIIIIll = new DHelper(lIIllIIIl[10], lIIllIIIl[0], lIIllIIIl[81]);
                    bv.add((DHelper) IIIIIllIIIIIll);

                }
                int[] nArray3 = new int[lIIllIIIl[0]];
                nArray3[r.lIIllIIIl[1]] = lIIllIIIl[13];
                if (r.lllllllIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIIIIIllIIIIIll = new DHelper(lIIllIIIl[13], lIIllIIIl[50], lIIllIIIl[82]);
                    bv.add((DHelper) IIIIIllIIIIIll);

                }
                int[] nArray4 = new int[lIIllIIIl[0]];
                nArray4[r.lIIllIIIl[1]] = lIIllIIIl[11];
                if (r.lllllllIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIIIIIllIIIIIll = new DHelper(lIIllIIIl[11], lIIllIIIl[12], i.bq);
                    bv.add((DHelper) IIIIIllIIIIIll);

                }
                if (r.lllllllIIlI(Bank.contains((Predicate)(lIIIIIllIIIIIll = item -> item.getName().toLowerCase().contains(lIIllIIII[lIIllIIIl[87]]))) ? 1 : 0)) {
                    lIIIIIllIIIIIlI = new DHelper(lIIllIIIl[83], lIIllIIIl[12], lIIllIIIl[84]);
                    bv.add(lIIIIIllIIIIIlI);

                }
                int[] nArray5 = new int[lIIllIIIl[0]];
                nArray5[r.lIIllIIIl[1]] = lIIllIIIl[7];
                if (!r.lllllllIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIIllIIIl[0]];
                nArray6[r.lIIllIIIl[1]] = lIIllIIIl[7];
                if (!r.lllllllIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[lIIllIIIl[0]];
                nArray7[r.lIIllIIIl[1]] = lIIllIIIl[7];
                if (!r.lllllllIIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIllIIIl[12])) break block10;
            }
            lIIIIIllIIIIIlI = new DHelper(lIIllIIIl[7], lIIllIIIl[28], lIIllIIIl[82]);
            bv.add(lIIIIIllIIIIIlI);

        }
        int[] nArray = new int[lIIllIIIl[0]];
        nArray[r.lIIllIIIl[1]] = lIIllIIIl[6];
        if (r.lllllllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIIIllIIIIIlI = new DHelper(lIIllIIIl[6], lIIllIIIl[57], lIIllIIIl[82]);
            bv.add(lIIIIIllIIIIIlI);

        }
    }

    private static boolean lllllllIIII(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        block4: {
            block5: {
                int[] nArray = new int[lIIllIIIl[0]];
                nArray[r.lIIllIIIl[1]] = lIIllIIIl[6];
                if (!r.lllllllIlII(Inventory.getCount((int[])nArray))) break block4;
                int[] nArray2 = new int[lIIllIIIl[0]];
                nArray2[r.lIIllIIIl[1]] = lIIllIIIl[8];
                if (!r.lllllllIlII(Inventory.getCount((int[])nArray2))) break block4;
                int[] nArray3 = new int[lIIllIIIl[0]];
                nArray3[r.lIIllIIIl[1]] = lIIllIIIl[10];
                if (!r.llllllllIlI(Inventory.getCount((int[])nArray3))) break block5;
                int[] nArray4 = new int[lIIllIIIl[0]];
                nArray4[r.lIIllIIIl[1]] = lIIllIIIl[10];
                if (!r.lllllllIIII(Equipment.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            int[] nArray = new int[lIIllIIIl[0]];
            nArray[r.lIIllIIIl[1]] = lIIllIIIl[13];
            if (r.lllllllIlII(Inventory.getCount((int[])nArray))) {
                n2 = lIIllIIIl[0];

                if (((0x52 ^ 0x13) & ~(0xEE ^ 0xAF)) < 3) return n2 != 0;
                return false;
            }
        }
        n2 = lIIllIIIl[1];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIllIIII[lIIllIIIl[86]];
    }

    private static boolean llllllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean S() {
        return lIIllIIIl[1];
    }
}

