/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.MHelper;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

public class HHelper
implements W {
    static  boolean cm;
     WorldArea iG;
    public static  WorldArea iy;
    public static  WorldPoint iE;
    public static  WorldPoint iA;
    static  int cl;
    public static  WorldPoint iz;
     WorldArea iF;
    public static  WorldPoint iB;
    public static  WorldPoint iC;
    public static  List<d> bv;
    public static  WorldPoint iD;
    public static  boolean bt;
    public static  WorldPoint bX;
    
     WorldArea iH;
    
    static  String[] bR;

    public static void bY() {
        if (H.lIIIIlIllllI(bt ? 1 : 0)) {
            b.a(bv);
            if (H.lIIIIlIlllll(bv.size(), lIlIIIIII[5])) {
                System.out.println(lIIllllll[lIlIIIIII[4]]);
                bt = lIlIIIIII[4];
            }
        }
        if (H.lIIIIllIIIII(bt ? 1 : 0)) {
            WorldArea lllllIIlllIIII;
            if (H.lIIIIlIlllll(e.j(lIlIIIIII[7]), lIlIIIIII[8])) {
                M.cj();
            }
            if (H.lIIIIllIIIIl(e.j(lIlIIIIII[7]), lIlIIIIII[8]) && H.lIIIIlIlllll(e.HHelper(), lIlIIIIII[9])) {
                System.out.println(lIIllllll[lIlIIIIII[5]]);
                AccBuilderEasyClues.d = lIlIIIIII[5];
                return;
            }
            if (H.lIIIIllIIIII(H.ab() ? 1 : 0) && H.lIIIIllIIIII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId())) && H.lIIIIllIIIIl(e.j(lIlIIIIII[7]), lIlIIIIII[8]) && H.lIIIIllIIIlI(e.HHelper(), lIlIIIIII[9])) {
                lllllIIlllIIII = BankLocation.getNearest();
                if (H.lIIIIllIIIll(lllllIIlllIIII) && H.lIIIIllIIIII(lllllIIlllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[6]];
                    a.a((BankLocation)lllllIIlllIIII);
                }
                if (H.lIIIIllIIIll(lllllIIlllIIII) && H.lIIIIlIllllI(lllllIIlllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (H.lIIIIllIIIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIIII[10]);

                    }
                    if (H.lIIIIlIllllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[11]];
                        if (H.lIIIIllIIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlIIIIII[12]);

                        }
                        if (H.lIIIIllIIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlIIIIII[6]);

                        }
                        int[] nArray = new int[lIlIIIIII[13]];
                        nArray[H.lIlIIIIII[4]] = lIlIIIIII[14];
                        nArray[H.lIlIIIIII[5]] = lIlIIIIII[15];
                        nArray[H.lIlIIIIII[6]] = lIlIIIIII[16];
                        nArray[H.lIlIIIIII[11]] = lIlIIIIII[17];
                        nArray[H.lIlIIIIII[12]] = lIlIIIIII[18];
                        nArray[H.lIlIIIIII[19]] = lIlIIIIII[20];
                        nArray[H.lIlIIIIII[21]] = lIlIIIIII[22];
                        nArray[H.lIlIIIIII[23]] = lIlIIIIII[24];
                        if (H.lIIIIllIIIII(e.b(nArray) ? 1 : 0)) {
                            H.af();
                            System.out.println(lIIllllll[lIlIIIIII[12]]);
                            bt = lIlIIIIII[5];
                            return;
                        }
                        int[] nArray2 = new int[lIlIIIIII[13]];
                        nArray2[H.lIlIIIIII[4]] = lIlIIIIII[14];
                        nArray2[H.lIlIIIIII[5]] = lIlIIIIII[15];
                        nArray2[H.lIlIIIIII[6]] = lIlIIIIII[16];
                        nArray2[H.lIlIIIIII[11]] = lIlIIIIII[17];
                        nArray2[H.lIlIIIIII[12]] = lIlIIIIII[18];
                        nArray2[H.lIlIIIIII[19]] = lIlIIIIII[20];
                        nArray2[H.lIlIIIIII[21]] = lIlIIIIII[22];
                        nArray2[H.lIlIIIIII[23]] = lIlIIIIII[24];
                        if (H.lIIIIlIllllI(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIlIIIIII[14], lIlIIIIII[25]);
                            a.a(lIlIIIIII[22], lIlIIIIII[25]);
                            a.a(lIlIIIIII[15], lIlIIIIII[6]);
                            a.a(lIlIIIIII[16], lIlIIIIII[5]);
                            a.a(lIlIIIIII[17], lIlIIIIII[5]);
                            a.a(lIlIIIIII[18], lIlIIIIII[5]);
                            a.a(lIlIIIIII[24], lIlIIIIII[5]);
                            a.a(lIlIIIIII[20], lIlIIIIII[5]);
                            a.a(lIlIIIIII[26], lIlIIIIII[6]);
                            a.a(lIlIIIIII[27], lIlIIIIII[5]);
                            a.a(lIlIIIIII[28], lIlIIIIII[19]);
                            int[] nArray3 = new int[lIlIIIIII[5]];
                            nArray3[H.lIlIIIIII[4]] = lIlIIIIII[15];
                            if (H.lIIIIllIIIIl(Inventory.getAll((int[])nArray3).size(), lIlIIIIII[5])) {
                                a.a(lIlIIIIII[29], lIlIIIIII[6]);
                            }
                        }
                    }
                }
            }
            if (H.lIIIIlIllllI(Inventory.contains((int[])f.aV) ? 1 : 0) && H.lIIIIlIlllll(Movement.getRunEnergy(), lIlIIIIII[30])) {
                Inventory.getFirst((int[])f.aV).interact(lIIllllll[lIlIIIIII[19]]);
                Time.sleepTicks((int)lIlIIIIII[5]);

            }
            if (H.lIIIIlIlllll(Prayers.getPoints(), lIlIIIIII[31]) && H.lIIIIlIllllI(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                Inventory.getFirst((int[])f.aS).interact(lIIllllll[lIlIIIIII[21]]);
                Time.sleepTicks((int)lIlIIIIII[6]);

            }
            if (H.lIIIIlIllllI(H.ab() ? 1 : 0) && H.lIIIIllIIIII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()))) {
                if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(bX), lIlIIIIII[19])) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[23]];
                    if (H.lIIIIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)bX);

                    Time.sleepTicks((int)lIlIIIIII[5]);

                }
                if (H.lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIlIIIIII[19])) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[13]];
                    g.a(lIIllllll[lIlIIIIII[32]], bR);
                }
            }
            if (!H.lIIIIllIIlll(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[19]) || H.lIIIIllIIIIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[23])) {
                g.a(bR);
            }
            if (H.lIIIIllIIIIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[25])) {
                if (!H.lIIIIllIIIlI(Vars.getBit((int)lIlIIIIII[33]), lIlIIIIII[19]) || H.lIIIIllIIIIl(Vars.getBit((int)lIlIIIIII[33]), lIlIIIIII[34])) {
                    if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iz), lIlIIIIII[5])) {
                        if (H.lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iA), lIlIIIIII[21])) {
                            String[] stringArray = new String[lIlIIIIII[5]];
                            stringArray[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[25]];
                            String[] stringArray2 = new String[lIlIIIIII[5]];
                            stringArray2[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[35]];
                            if (H.lIIIIlIllllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                String[] stringArray3 = new String[lIlIIIIII[5]];
                                stringArray3[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[36]];
                                TileObjects.getNearest((String[])stringArray3).interact(lIIllllll[lIlIIIIII[37]]);
                                Time.sleepTicks((int)lIlIIIIII[6]);

                            }
                            String[] stringArray4 = new String[lIlIIIIII[5]];
                            stringArray4[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[38]];
                            String[] stringArray5 = new String[lIlIIIIII[5]];
                            stringArray5[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[34]];
                            if (H.lIIIIllIIIII(TileObjects.getNearest((String[])stringArray4).hasAction(stringArray5) ? 1 : 0)) {
                                WorldArea worldArea = new WorldPoint[lIlIIIIII[19]];
                                worldArea[H.lIlIIIIII[4]] = new WorldPoint(lIlIIIIII[39], lIlIIIIII[40], lIlIIIIII[4]);
                                worldArea[H.lIlIIIIII[5]] = new WorldPoint(lIlIIIIII[41], lIlIIIIII[42], lIlIIIIII[4]);
                                worldArea[H.lIlIIIIII[6]] = new WorldPoint(lIlIIIIII[43], lIlIIIIII[44], lIlIIIIII[4]);
                                worldArea[H.lIlIIIIII[11]] = new WorldPoint(lIlIIIIII[45], lIlIIIIII[46], lIlIIIIII[4]);
                                worldArea[H.lIlIIIIII[12]] = new WorldPoint(lIlIIIIII[47], lIlIIIIII[48], lIlIIIIII[4]);
                                lllllIIlllIIII = worldArea;
                                Walker.walkAlong(Arrays.asList(lllllIIlllIIII), new HashMap());

                                Time.sleepTicks((int)lIlIIIIII[5]);

                            }
                        }
                        if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iA), lIlIIIIII[21])) {
                            AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[9]];
                            Movement.walkTo((WorldPoint)iz);

                            Time.sleepTicks((int)lIlIIIIII[5]);

                        }
                    }
                    if (H.lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iz), lIlIIIIII[5])) {
                        if (H.lIIIIllIIIIl(Vars.getBit((int)lIlIIIIII[33]), lIlIIIIII[34]) && H.lIIIIllIIIll(Widgets.get((int)lIlIIIIII[49], (int)lIlIIIIII[6])) && H.lIIIIllIIIII(Players.getLocal().isAnimating() ? 1 : 0)) {
                            Widgets.get((int)lIlIIIIII[49], (int)lIlIIIIII[6]).getChild(lIlIIIIII[50]).interact(lIIllllll[lIlIIIIII[51]]);
                            Time.sleepTicks((int)lIlIIIIII[6]);

                        }
                        if (H.lIIIIlIlllll(Vars.getBit((int)lIlIIIIII[33]), lIlIIIIII[19])) {
                            AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[52]];
                            g.a(lIIllllll[lIlIIIIII[53]], bR);
                        }
                    }
                }
                if (H.lIIIIllIIIIl(Vars.getBit((int)lIlIIIIII[33]), lIlIIIIII[19])) {
                    lllllIIlllIIII = new WorldArea(lIlIIIIII[54], lIlIIIIII[40], lIlIIIIII[32], lIlIIIIII[25], lIlIIIIII[4]);
                    if (H.lIIIIllIIIII(lllllIIlllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[55]];
                        if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iA), lIlIIIIII[21])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIlIIIIII[41], lIlIIIIII[56], lIlIIIIII[4]));

                            Time.sleepTicks((int)lIlIIIIII[5]);

                        }
                        if (H.lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iA), lIlIIIIII[21])) {
                            String[] stringArray = new String[lIlIIIIII[5]];
                            stringArray[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[57]];
                            String[] stringArray6 = new String[lIlIIIIII[5]];
                            stringArray6[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[58]];
                            if (H.lIIIIlIllllI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[lIlIIIIII[5]];
                                stringArray7[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[31]];
                                TileObjects.getNearest((String[])stringArray7).interact(lIIllllll[lIlIIIIII[59]]);
                                Time.sleepTicks((int)lIlIIIIII[6]);

                            }
                            String[] stringArray8 = new String[lIlIIIIII[5]];
                            stringArray8[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[60]];
                            String[] stringArray9 = new String[lIlIIIIII[5]];
                            stringArray9[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[61]];
                            if (H.lIIIIllIIIII(TileObjects.getNearest((String[])stringArray8).hasAction(stringArray9) ? 1 : 0)) {
                                g.a(lIIllllll[lIlIIIIII[62]], bR);
                            }
                        }
                    }
                    if (H.lIIIIlIllllI(lllllIIlllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[63]];
                        g.a(lIIllllll[lIlIIIIII[64]], bR);
                    }
                }
                if (H.lIIIIllIIIIl(Vars.getBit((int)lIlIIIIII[33]), lIlIIIIII[25])) {
                    g.a(bR);
                }
            }
            if (H.lIIIIllIIIIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[34])) {
                cl = lIlIIIIII[4];
                if (H.lIIIIllIIIII(Vars.getBit((int)lIlIIIIII[65]))) {
                    if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iB), lIlIIIIII[19])) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[66]];
                        Movement.walkTo((WorldPoint)iB);

                        Time.sleepTicks((int)lIlIIIIII[5]);

                    }
                    if (H.lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iB), lIlIIIIII[19])) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[7]];
                        g.a(lIIllllll[lIlIIIIII[67]], bR);
                    }
                }
                if (H.lIIIIllIIIIl(Vars.getBit((int)lIlIIIIII[65]), lIlIIIIII[19])) {
                    if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iC), lIlIIIIII[21])) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[68]];
                        Movement.walkTo((WorldPoint)iC);

                        Time.sleepTicks((int)lIlIIIIII[5]);

                    }
                    if (H.lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iC), lIlIIIIII[21])) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[69]];
                        g.a(lIIllllll[lIlIIIIII[70]], bR);
                    }
                }
                if (H.lIIIIllIIIIl(Vars.getBit((int)lIlIIIIII[65]), lIlIIIIII[25])) {
                    String[] stringArray = new String[lIlIIIIII[5]];
                    stringArray[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[71]];
                    if (H.lIIIIllIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray10 = new String[lIlIIIIII[5]];
                        stringArray10[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[72]];
                        String[] stringArray11 = new String[lIlIIIIII[5]];
                        stringArray11[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[73]];
                        Inventory.getFirst((String[])stringArray10).useOn(Inventory.getFirst((String[])stringArray11));
                        Time.sleepTicks((int)lIlIIIIII[5]);

                    }
                    String[] stringArray12 = new String[lIlIIIIII[5]];
                    stringArray12[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[74]];
                    if (H.lIIIIlIllllI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iB), lIlIIIIII[19])) {
                            AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[50]];
                            Movement.walkTo((WorldPoint)iB);

                            Time.sleepTicks((int)lIlIIIIII[5]);

                        }
                        if (H.lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iB), lIlIIIIII[19])) {
                            AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[75]];
                            g.a(lIIllllll[lIlIIIIII[76]], bR);
                        }
                    }
                }
                if (H.lIIIIllIIIIl(Vars.getBit((int)lIlIIIIII[65]), lIlIIIIII[70])) {
                    g.a(bR);
                }
                if (H.lIIIIllIIIIl(Vars.getBit((int)lIlIIIIII[65]), lIlIIIIII[50])) {
                    if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iD), lIlIIIIII[13])) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[77]];
                        Movement.walkTo((WorldPoint)iD);

                        Time.sleepTicks((int)lIlIIIIII[5]);

                    }
                    if (H.lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iD), lIlIIIIII[13])) {
                        g.a(lIIllllll[lIlIIIIII[78]], bR);
                    }
                }
                g.a(bR);
            }
            if (H.lIIIIllIIIIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[55])) {
                if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iE), lIlIIIIII[19])) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[79]];
                    if (H.lIIIIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)iE);

                    Time.sleepTicks((int)lIlIIIIII[5]);

                }
                if (H.lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iE), lIlIIIIII[19])) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[80]];
                    g.a(lIIllllll[lIlIIIIII[81]], bR);
                }
            }
            if (!H.lIIIIllIIlll(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[60]) || !H.lIIIIllIIlll(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[66]) || H.lIIIIllIIIIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[50])) {
                g.a(bR);
            }
            if (H.lIIIIllIIIIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[70])) {
                g.a(bR);
                int[] nArray = new int[lIlIIIIII[5]];
                nArray[H.lIlIIIIII[4]] = lIlIIIIII[27];
                if (H.lIIIIllIIIII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray4 = new int[lIlIIIIII[5]];
                    nArray4[H.lIlIIIIII[4]] = lIlIIIIII[27];
                    if (H.lIIIIlIllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIlIIIIII[5]];
                        nArray5[H.lIlIIIIII[4]] = lIlIIIIII[27];
                        Inventory.getFirst((int[])nArray5).interact(lIIllllll[lIlIIIIII[82]]);
                        Time.sleepTicks((int)lIlIIIIII[5]);

                    }
                }
                if (H.lIIIIllIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && H.lIIIIllIIIlI(Skills.getLevel((Skill)Skill.PRAYER), lIlIIIIII[77]) && H.lIIIIllIIlII(Prayers.getPoints())) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                if (H.lIIIIllIIIll(lllllIIlllIIII = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (H.lIIIIlIllllI(tileObject.getName().contains(lIIllllll[lIlIIIIII[96]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIIII[5]];
                        stringArray[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[97]];
                        if (H.lIIIIlIllllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIlIIIIII[5];

                            if (-3 <= 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIlIIIIII[4];
                    return n2 != 0;
                }))) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[83]];
                    lllllIIlllIIII.interact(lIIllllll[lIlIIIIII[30]]);
                    Time.sleepTicks((int)lIlIIIIII[12]);

                }
                if (H.lIIIIllIlIII(H.lIIIIlIlllIl(e.u(), 50.0))) {
                    int[] nArray6 = new int[lIlIIIIII[5]];
                    nArray6[H.lIlIIIIII[4]] = lIlIIIIII[28];
                    if (H.lIIIIlIllllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                        int[] nArray7 = new int[lIlIIIIII[5]];
                        nArray7[H.lIlIIIIII[4]] = lIlIIIIII[28];
                        Inventory.getFirst((int[])nArray7).interact(lIIllllll[lIlIIIIII[84]]);
                        Time.sleepTicks((int)lIlIIIIII[5]);

                    }
                }
            }
            if (H.lIIIIllIIIIl(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[85]) && H.lIIIIllIIIII(iy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[86]];
                if (H.lIIIIlIlllll(cl, lIlIIIIII[5])) {
                    an.pT += lIlIIIIII[5];
                    an.o(AccBuilderEasyClues.m);
                    cl += lIlIIIIII[5];
                    an.pT = lIlIIIIII[4];
                    cm = lIlIIIIII[4];
                }
                int[] nArray = new int[lIlIIIIII[5]];
                nArray[H.lIlIIIIII[4]] = lIlIIIIII[14];
                if (H.lIIIIlIllllI(Inventory.contains((int[])nArray) ? 1 : 0) && H.lIIIIllIIIII(Players.getLocal().isAnimating() ? 1 : 0)) {
                    int[] nArray8 = new int[lIlIIIIII[5]];
                    nArray8[H.lIlIIIIII[4]] = lIlIIIIII[14];
                    Inventory.getFirst((int[])nArray8).interact(lIIllllll[lIlIIIIII[87]]);
                    Time.sleepTicks((int)lIlIIIIII[12]);

                }
            }
            g.a(new String[lIlIIIIII[4]]);
        }
    }

    private static boolean lIIIIllIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIllIlIII(int n2) {
        return n2 < 0;
    }

    private static int lIIIIlIlllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void lIIIIlIllIll() {
        lIIllllll = new String[lIlIIIIII[118]];
        H.lIIllllll[H.lIlIIIIII[4]] = "Finished buying items, switching back to quest";
        H.lIIllllll[H.lIlIIIIII[5]] = "Need 16 QP";
        H.lIIllllll[H.lIlIIIIII[6]] = "Nav to bank";
        H.lIIllllll[H.lIlIIIIII[11]] = "Handling banking";
        H.lIIllllll[H.lIlIIIIII[12]] = "We are missing quest supplies, switching to BUYING";
        H.lIIllllll[H.lIlIIIIII[19]] = "Drink";
        H.lIIllllll[H.lIlIIIIII[21]] = "Drink";
        H.lIIllllll[H.lIlIIIIII[23]] = "Nav to start";
        H.lIIllllll[H.lIlIIIIII[13]] = "Starting quest";
        H.lIIllllll[H.lIlIIIIII[32]] = "Willow";
        H.lIIllllll[H.lIlIIIIII[25]] = "Longhall door";
        H.lIIllllll[H.lIlIIIIII[35]] = "Open";
        H.lIIllllll[H.lIlIIIIII[36]] = "Longhall door";
        H.lIIllllll[H.lIlIIIIII[37]] = "Open";
        H.lIIllllll[H.lIlIIIIII[38]] = "Longhall door";
        H.lIIllllll[H.lIlIIIIII[34]] = "Open";
        H.lIIllllll[H.lIlIIIIII[9]] = "Nav to checkal";
        H.lIIllllll[H.lIlIIIIII[51]] = "Perform";
        H.lIIllllll[H.lIlIIIIII[52]] = "talk";
        H.lIIllllll[H.lIlIIIIII[53]] = "Checkal";
        H.lIIllllll[H.lIlIIIIII[55]] = "Nav to atlas";
        H.lIIllllll[H.lIlIIIIII[57]] = "Longhall door";
        H.lIIllllll[H.lIlIIIIII[58]] = "Open";
        H.lIIllllll[H.lIlIIIIII[31]] = "Longhall door";
        H.lIIllllll[H.lIlIIIIII[59]] = "Open";
        H.lIIllllll[H.lIlIIIIII[60]] = "Longhall door";
        H.lIIllllll[H.lIlIIIIII[61]] = "Open";
        H.lIIllllll[H.lIlIIIIII[62]] = "Atlas";
        H.lIIllllll[H.lIlIIIIII[63]] = "talk";
        H.lIIllllll[H.lIlIIIIII[64]] = "Atlas";
        H.lIIllllll[H.lIlIIIIII[66]] = "Nav to marley";
        H.lIIllllll[H.lIlIIIIII[7]] = "Talk";
        H.lIIllllll[H.lIlIIIIII[67]] = "Marley";
        H.lIIllllll[H.lIlIIIIII[68]] = "Nav to cook";
        H.lIIllllll[H.lIlIIIIII[69]] = "talk";
        H.lIIllllll[H.lIlIIIIII[70]] = "Cook";
        H.lIIllllll[H.lIlIIIIII[71]] = "Steak sandwich";
        H.lIIllllll[H.lIlIIIIII[72]] = "Knife";
        H.lIIllllll[H.lIlIIIIII[73]] = "Bread";
        H.lIIllllll[H.lIlIIIIII[74]] = "Steak sandwich";
        H.lIIllllll[H.lIlIIIIII[50]] = "Nav to marley";
        H.lIIllllll[H.lIlIIIIII[75]] = "Talk";
        H.lIIllllll[H.lIlIIIIII[76]] = "Marley";
        H.lIIllllll[H.lIlIIIIII[77]] = "Nav to burntof";
        H.lIIllllll[H.lIlIIIIII[78]] = "Burntof";
        H.lIIllllll[H.lIlIIIIII[79]] = "Nav to dungeon";
        H.lIIllllll[H.lIlIIIIII[80]] = "Starting quest";
        H.lIIllllll[H.lIlIIIIII[81]] = "Willow";
        H.lIIllllll[H.lIlIIIIII[82]] = "Wield";
        H.lIIllllll[H.lIlIIIIII[83]] = "Mining pillars";
        H.lIIllllll[H.lIlIIIIII[30]] = "Mine";
        H.lIIllllll[H.lIlIIIIII[84]] = "Eat";
        H.lIIllllll[H.lIlIIIIII[86]] = "Tele to varrock";
        H.lIIllllll[H.lIlIIIIII[87]] = "Break";
        H.lIIllllll[H.lIlIIIIII[94]] = "Below Ice Mountain";
        H.lIIllllll[H.lIlIIIIII[95]] = "ring of wealth (";
        H.lIIllllll[H.lIlIIIIII[96]] = "pillar";
        H.lIIllllll[H.lIlIIIIII[97]] = "Mine";
        H.lIIllllll[H.lIlIIIIII[115]] = "Yes.";
        H.lIIllllll[H.lIlIIIIII[116]] = "I was wondering if you'd be able to make me a Steak sandwich?";
        H.lIIllllll[H.lIlIIIIII[117]] = "Rock.";
    }

    private static boolean lIIIIllIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIllIIlll(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String U() {
        return lIIllllll[lIlIIIIII[94]];
    }

    private static boolean lIIIIllIIIll(Object object) {
        return object != null;
    }

    private static boolean lIIIIlIlllll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        H.lIIIIlIlllII();
        H.lIIIIlIllIll();
        iy = new WorldArea(lIlIIIIII[98], lIlIIIIII[99], lIlIIIIII[100], lIlIIIIII[101], lIlIIIIII[4]);
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIlIIIIII[102], lIlIIIIII[56], lIlIIIIII[4]);
        iz = new WorldPoint(lIlIIIIII[103], lIlIIIIII[104], lIlIIIIII[4]);
        iA = new WorldPoint(lIlIIIIII[105], lIlIIIIII[106], lIlIIIIII[4]);
        iB = new WorldPoint(lIlIIIIII[107], lIlIIIIII[108], lIlIIIIII[4]);
        iC = new WorldPoint(lIlIIIIII[109], lIlIIIIII[110], lIlIIIIII[4]);
        iD = new WorldPoint(lIlIIIIII[111], lIlIIIIII[112], lIlIIIIII[4]);
        iE = new WorldPoint(lIlIIIIII[113], lIlIIIIII[114], lIlIIIIII[4]);
        String[] stringArray = new String[lIlIIIIII[11]];
        stringArray[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[115]];
        stringArray[H.lIlIIIIII[5]] = lIIllllll[lIlIIIIII[116]];
        stringArray[H.lIlIIIIII[6]] = lIIllllll[lIlIIIIII[117]];
        bR = stringArray;
    }

    @Override
    public int T() {
        try {
            H.bY();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIlIIIIII[8];
    }

    public HHelper() {
        this.iF = new WorldArea(lIlIIIIII[0], lIlIIIIII[1], lIlIIIIII[2], lIlIIIIII[3], lIlIIIIII[4]);
        this.iG = new WorldArea(lIlIIIIII[0], lIlIIIIII[1], lIlIIIIII[2], lIlIIIIII[3], lIlIIIIII[5]);
        this.iH = new WorldArea(lIlIIIIII[0], lIlIIIIII[1], lIlIIIIII[2], lIlIIIIII[3], lIlIIIIII[6]);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lllllIIllIllIl;
        int[] nArray = new int[lIlIIIIII[13]];
        nArray[H.lIlIIIIII[4]] = lIlIIIIII[14];
        nArray[H.lIlIIIIII[5]] = lIlIIIIII[15];
        nArray[H.lIlIIIIII[6]] = lIlIIIIII[16];
        nArray[H.lIlIIIIII[11]] = lIlIIIIII[17];
        nArray[H.lIlIIIIII[12]] = lIlIIIIII[18];
        nArray[H.lIlIIIIII[19]] = lIlIIIIII[20];
        nArray[H.lIlIIIIII[21]] = lIlIIIIII[22];
        nArray[H.lIlIIIIII[23]] = lIlIIIIII[24];
        int[] nArray2 = nArray;
        int lllllIIllIllII = lIlIIIIII[4];
        while (H.lIIIIlIlllll(lllllIIllIllII, ((void)lllllIIllIllIl).length)) {
            int[] nArray3 = new int[lIlIIIIII[5]];
            nArray3[H.lIlIIIIII[4]] = lllllIIllIllIl[lllllIIllIllII];
            if (H.lIIIIllIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIlIIIIII[4];
            }
            ++lllllIIllIllII;

            if ((0x68 ^ 0x6C) >= 0) continue;
            return false;
        }
        return lIlIIIIII[5];
    }

    private static boolean lIIIIllIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (!(!H.lIIIIllIIIlI(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[85]) || H.lIIIIllIIIII(iy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lIIIIllIIIII(this.iF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && H.lIIIIllIIIII(this.iG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !H.lIIIIlIllllI(this.iH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0))) {
            n2 = lIlIIIIII[5];

            if (2 != 2) {
                return false;
            }
        } else {
            n2 = lIlIIIIII[4];
        }
        return n2 != 0;
    }

    private static boolean lIIIIllIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void af() {
        block12: {
            d lllllIIllIlIII;
            block11: {
                Object lllllIIllIlIIl;
                int[] nArray = new int[lIlIIIIII[5]];
                nArray[H.lIlIIIIII[4]] = lIlIIIIII[18];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIlIIIIII[18], lIlIIIIII[5], lIlIIIIII[88]);
                    bv.add(d2);

                }
                int[] nArray2 = new int[lIlIIIIII[5]];
                nArray2[H.lIlIIIIII[4]] = lIlIIIIII[24];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllIIllIlIIl = new DHelper(lIlIIIIII[24], lIlIIIIII[5], lIlIIIIII[88]);
                    bv.add((DHelper) llllIIllIlIIl);

                }
                int[] nArray3 = new int[lIlIIIIII[5]];
                nArray3[H.lIlIIIIII[4]] = lIlIIIIII[16];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllIIllIlIIl = new DHelper(lIlIIIIII[16], lIlIIIIII[5], lIlIIIIII[88]);
                    bv.add((DHelper) llllIIllIlIIl);

                }
                int[] nArray4 = new int[lIlIIIIII[5]];
                nArray4[H.lIlIIIIII[4]] = lIlIIIIII[20];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllIIllIlIIl = new DHelper(lIlIIIIII[20], lIlIIIIII[5], lIlIIIIII[89]);
                    bv.add((DHelper) llllIIllIlIIl);

                }
                int[] nArray5 = new int[lIlIIIIII[5]];
                nArray5[H.lIlIIIIII[4]] = lIlIIIIII[17];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    lllllIIllIlIIl = new DHelper(lIlIIIIII[17], lIlIIIIII[5], lIlIIIIII[89]);
                    bv.add((DHelper) llllIIllIlIIl);

                }
                int[] nArray6 = new int[lIlIIIIII[5]];
                nArray6[H.lIlIIIIII[4]] = lIlIIIIII[22];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    lllllIIllIlIIl = new DHelper(lIlIIIIII[22], lIlIIIIII[25], lIlIIIIII[90]);
                    bv.add((DHelper) llllIIllIlIIl);

                }
                if (H.lIIIIllIIIII(Bank.contains((Predicate)(lllllIIllIlIIl = item -> item.getName().toLowerCase().contains(lIIllllll[lIlIIIIII[95]]))) ? 1 : 0)) {
                    lllllIIllIlIII = new DHelper(lIlIIIIII[91], lIlIIIIII[19], lIlIIIIII[92]);
                    bv.add(lllllIIllIlIII);

                }
                int[] nArray7 = new int[lIlIIIIII[5]];
                nArray7[H.lIlIIIIII[4]] = lIlIIIIII[15];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    lllllIIllIlIII = new DHelper(lIlIIIIII[15], lIlIIIIII[12], i.bq);
                    bv.add(lllllIIllIlIII);

                }
                int[] nArray8 = new int[lIlIIIIII[5]];
                nArray8[H.lIlIIIIII[4]] = lIlIIIIII[14];
                if (!H.lIIIIlIllllI(Bank.contains((int[])nArray8) ? 1 : 0)) break block11;
                int[] nArray9 = new int[lIlIIIIII[5]];
                nArray9[H.lIlIIIIII[4]] = lIlIIIIII[14];
                if (!H.lIIIIlIllllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block12;
                int[] nArray10 = new int[lIlIIIIII[5]];
                nArray10[H.lIlIIIIII[4]] = lIlIIIIII[14];
                if (!H.lIIIIlIlllll(Bank.getFirst((int[])nArray10).getQuantity(), lIlIIIIII[34])) break block12;
            }
            lllllIIllIlIII = new DHelper(lIlIIIIII[14], lIlIIIIII[50], lIlIIIIII[93]);
            bv.add(lllllIIllIlIII);

        }
    }

        return String.valueOf(lllllIIlIlIlIl);
    }

    private static boolean lIIIIllIIIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean S() {
        return lIlIIIIII[4];
    }

    private static boolean lIIIIllIIlII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIlIllllI(int n2) {
        return n2 != 0;
    }
}

