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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.M;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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

public class H
implements W {
    static /* synthetic */ boolean cm;
    /* synthetic */ WorldArea iG;
    public static /* synthetic */ WorldArea iy;
    public static /* synthetic */ WorldPoint iE;
    public static /* synthetic */ WorldPoint iA;
    static /* synthetic */ int cl;
    public static /* synthetic */ WorldPoint iz;
    /* synthetic */ WorldArea iF;
    public static /* synthetic */ WorldPoint iB;
    public static /* synthetic */ WorldPoint iC;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ WorldPoint iD;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint bX;
    private static /* synthetic */ String[] lIIllllll;
    /* synthetic */ WorldArea iH;
    private static /* synthetic */ int[] lIlIIIIII;
    static /* synthetic */ String[] bR;

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
            if (H.lIIIIllIIIIl(e.j(lIlIIIIII[7]), lIlIIIIII[8]) && H.lIIIIlIlllll(e.H(), lIlIIIIII[9])) {
                System.out.println(lIIllllll[lIlIIIIII[5]]);
                AccBuilderEasyClues.d = lIlIIIIII[5];
                return;
            }
            if (H.lIIIIllIIIII(H.ab() ? 1 : 0) && H.lIIIIllIIIII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId())) && H.lIIIIllIIIIl(e.j(lIlIIIIII[7]), lIlIIIIII[8]) && H.lIIIIllIIIlI(e.H(), lIlIIIIII[9])) {
                lllllIIlllIIII = BankLocation.getNearest();
                if (H.lIIIIllIIIll(lllllIIlllIIII) && H.lIIIIllIIIII(lllllIIlllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[6]];
                    a.a((BankLocation)lllllIIlllIIII);
                }
                if (H.lIIIIllIIIll(lllllIIlllIIII) && H.lIIIIlIllllI(lllllIIlllIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (H.lIIIIllIIIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIIII[10]);
                        0;
                    }
                    if (H.lIIIIlIllllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[11]];
                        if (H.lIIIIllIIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlIIIIII[12]);
                            0;
                        }
                        if (H.lIIIIllIIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlIIIIII[6]);
                            0;
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
                0;
            }
            if (H.lIIIIlIlllll(Prayers.getPoints(), lIlIIIIII[31]) && H.lIIIIlIllllI(Inventory.contains((int[])f.aS) ? 1 : 0)) {
                Inventory.getFirst((int[])f.aS).interact(lIIllllll[lIlIIIIII[21]]);
                Time.sleepTicks((int)lIlIIIIII[6]);
                0;
            }
            if (H.lIIIIlIllllI(H.ab() ? 1 : 0) && H.lIIIIllIIIII(Vars.getBit((int)QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()))) {
                if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(bX), lIlIIIIII[19])) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[23]];
                    if (H.lIIIIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)bX);
                    0;
                    Time.sleepTicks((int)lIlIIIIII[5]);
                    0;
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
                                0;
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
                                0;
                                Time.sleepTicks((int)lIlIIIIII[5]);
                                0;
                            }
                        }
                        if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iA), lIlIIIIII[21])) {
                            AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[9]];
                            Movement.walkTo((WorldPoint)iz);
                            0;
                            Time.sleepTicks((int)lIlIIIIII[5]);
                            0;
                        }
                    }
                    if (H.lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iz), lIlIIIIII[5])) {
                        if (H.lIIIIllIIIIl(Vars.getBit((int)lIlIIIIII[33]), lIlIIIIII[34]) && H.lIIIIllIIIll(Widgets.get((int)lIlIIIIII[49], (int)lIlIIIIII[6])) && H.lIIIIllIIIII(Players.getLocal().isAnimating() ? 1 : 0)) {
                            Widgets.get((int)lIlIIIIII[49], (int)lIlIIIIII[6]).getChild(lIlIIIIII[50]).interact(lIIllllll[lIlIIIIII[51]]);
                            Time.sleepTicks((int)lIlIIIIII[6]);
                            0;
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
                            0;
                            Time.sleepTicks((int)lIlIIIIII[5]);
                            0;
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
                                0;
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
                        0;
                        Time.sleepTicks((int)lIlIIIIII[5]);
                        0;
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
                        0;
                        Time.sleepTicks((int)lIlIIIIII[5]);
                        0;
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
                        0;
                    }
                    String[] stringArray12 = new String[lIlIIIIII[5]];
                    stringArray12[H.lIlIIIIII[4]] = lIIllllll[lIlIIIIII[74]];
                    if (H.lIIIIlIllllI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                        if (H.lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iB), lIlIIIIII[19])) {
                            AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[50]];
                            Movement.walkTo((WorldPoint)iB);
                            0;
                            Time.sleepTicks((int)lIlIIIIII[5]);
                            0;
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
                        0;
                        Time.sleepTicks((int)lIlIIIIII[5]);
                        0;
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
                    0;
                    Time.sleepTicks((int)lIlIIIIII[5]);
                    0;
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
                        0;
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
                            0;
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
                    0;
                }
                if (H.lIIIIllIlIII(H.lIIIIlIlllIl(e.u(), 50.0))) {
                    int[] nArray6 = new int[lIlIIIIII[5]];
                    nArray6[H.lIlIIIIII[4]] = lIlIIIIII[28];
                    if (H.lIIIIlIllllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                        int[] nArray7 = new int[lIlIIIIII[5]];
                        nArray7[H.lIlIIIIII[4]] = lIlIIIIII[28];
                        Inventory.getFirst((int[])nArray7).interact(lIIllllll[lIlIIIIII[84]]);
                        Time.sleepTicks((int)lIlIIIIII[5]);
                        0;
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
                    0;
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
        H.lIIllllll[H.lIlIIIIII[4]] = H."Finished buying items, switching back to quest";
        H.lIIllllll[H.lIlIIIIII[5]] = H."Need 16 QP";
        H.lIIllllll[H.lIlIIIIII[6]] = H."Nav to bank";
        H.lIIllllll[H.lIlIIIIII[11]] = H."Handling banking";
        H.lIIllllll[H.lIlIIIIII[12]] = H."We are missing quest supplies, switching to BUYING";
        H.lIIllllll[H.lIlIIIIII[19]] = H."Drink";
        H.lIIllllll[H.lIlIIIIII[21]] = H."Drink";
        H.lIIllllll[H.lIlIIIIII[23]] = H."Nav to start";
        H.lIIllllll[H.lIlIIIIII[13]] = H."Starting quest";
        H.lIIllllll[H.lIlIIIIII[32]] = H."Willow";
        H.lIIllllll[H.lIlIIIIII[25]] = H."Longhall door";
        H.lIIllllll[H.lIlIIIIII[35]] = H."Open";
        H.lIIllllll[H.lIlIIIIII[36]] = H."Longhall door";
        H.lIIllllll[H.lIlIIIIII[37]] = H."Open";
        H.lIIllllll[H.lIlIIIIII[38]] = H."Longhall door";
        H.lIIllllll[H.lIlIIIIII[34]] = H."Open";
        H.lIIllllll[H.lIlIIIIII[9]] = H."Nav to checkal";
        H.lIIllllll[H.lIlIIIIII[51]] = H."Perform";
        H.lIIllllll[H.lIlIIIIII[52]] = H."talk";
        H.lIIllllll[H.lIlIIIIII[53]] = H."Checkal";
        H.lIIllllll[H.lIlIIIIII[55]] = H."Nav to atlas";
        H.lIIllllll[H.lIlIIIIII[57]] = H."Longhall door";
        H.lIIllllll[H.lIlIIIIII[58]] = H."Open";
        H.lIIllllll[H.lIlIIIIII[31]] = H."Longhall door";
        H.lIIllllll[H.lIlIIIIII[59]] = H."Open";
        H.lIIllllll[H.lIlIIIIII[60]] = H."Longhall door";
        H.lIIllllll[H.lIlIIIIII[61]] = H."Open";
        H.lIIllllll[H.lIlIIIIII[62]] = H."Atlas";
        H.lIIllllll[H.lIlIIIIII[63]] = H."talk";
        H.lIIllllll[H.lIlIIIIII[64]] = H."Atlas";
        H.lIIllllll[H.lIlIIIIII[66]] = H."Nav to marley";
        H.lIIllllll[H.lIlIIIIII[7]] = H."Talk";
        H.lIIllllll[H.lIlIIIIII[67]] = H."Marley";
        H.lIIllllll[H.lIlIIIIII[68]] = H."Nav to cook";
        H.lIIllllll[H.lIlIIIIII[69]] = H."talk";
        H.lIIllllll[H.lIlIIIIII[70]] = H."Cook";
        H.lIIllllll[H.lIlIIIIII[71]] = H."Steak sandwich";
        H.lIIllllll[H.lIlIIIIII[72]] = H."Knife";
        H.lIIllllll[H.lIlIIIIII[73]] = H."Bread";
        H.lIIllllll[H.lIlIIIIII[74]] = H."Steak sandwich";
        H.lIIllllll[H.lIlIIIIII[50]] = H."Nav to marley";
        H.lIIllllll[H.lIlIIIIII[75]] = H."Talk";
        H.lIIllllll[H.lIlIIIIII[76]] = H."Marley";
        H.lIIllllll[H.lIlIIIIII[77]] = H."Nav to burntof";
        H.lIIllllll[H.lIlIIIIII[78]] = H."Burntof";
        H.lIIllllll[H.lIlIIIIII[79]] = H."Nav to dungeon";
        H.lIIllllll[H.lIlIIIIII[80]] = H."Starting quest";
        H.lIIllllll[H.lIlIIIIII[81]] = H."Willow";
        H.lIIllllll[H.lIlIIIIII[82]] = H."Wield";
        H.lIIllllll[H.lIlIIIIII[83]] = H."Mining pillars";
        H.lIIllllll[H.lIlIIIIII[30]] = H."Mine";
        H.lIIllllll[H.lIlIIIIII[84]] = H."Eat";
        H.lIIllllll[H.lIlIIIIII[86]] = H."Tele to varrock";
        H.lIIllllll[H.lIlIIIIII[87]] = H."Break";
        H.lIIllllll[H.lIlIIIIII[94]] = H."Below Ice Mountain";
        H.lIIllllll[H.lIlIIIIII[95]] = H."ring of wealth (";
        H.lIIllllll[H.lIlIIIIII[96]] = H."pillar";
        H.lIIllllll[H.lIlIIIIII[97]] = H."Mine";
        H.lIIllllll[H.lIlIIIIII[115]] = H."Yes.";
        H.lIIllllll[H.lIlIIIIII[116]] = H."I was wondering if you'd be able to make me a Steak sandwich?";
        H.lIIllllll[H.lIlIIIIII[117]] = H."Rock.";
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
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIlIIIIII[8];
    }

    public H() {
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
            0;
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
            0;
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
                    d d2 = new d(lIlIIIIII[18], lIlIIIIII[5], lIlIIIIII[88]);
                    bv.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIlIIIIII[5]];
                nArray2[H.lIlIIIIII[4]] = lIlIIIIII[24];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllIIllIlIIl = new d(lIlIIIIII[24], lIlIIIIII[5], lIlIIIIII[88]);
                    bv.add((d)lllllIIllIlIIl);
                    0;
                }
                int[] nArray3 = new int[lIlIIIIII[5]];
                nArray3[H.lIlIIIIII[4]] = lIlIIIIII[16];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllIIllIlIIl = new d(lIlIIIIII[16], lIlIIIIII[5], lIlIIIIII[88]);
                    bv.add((d)lllllIIllIlIIl);
                    0;
                }
                int[] nArray4 = new int[lIlIIIIII[5]];
                nArray4[H.lIlIIIIII[4]] = lIlIIIIII[20];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllIIllIlIIl = new d(lIlIIIIII[20], lIlIIIIII[5], lIlIIIIII[89]);
                    bv.add((d)lllllIIllIlIIl);
                    0;
                }
                int[] nArray5 = new int[lIlIIIIII[5]];
                nArray5[H.lIlIIIIII[4]] = lIlIIIIII[17];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    lllllIIllIlIIl = new d(lIlIIIIII[17], lIlIIIIII[5], lIlIIIIII[89]);
                    bv.add((d)lllllIIllIlIIl);
                    0;
                }
                int[] nArray6 = new int[lIlIIIIII[5]];
                nArray6[H.lIlIIIIII[4]] = lIlIIIIII[22];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    lllllIIllIlIIl = new d(lIlIIIIII[22], lIlIIIIII[25], lIlIIIIII[90]);
                    bv.add((d)lllllIIllIlIIl);
                    0;
                }
                if (H.lIIIIllIIIII(Bank.contains((Predicate)(lllllIIllIlIIl = item -> item.getName().toLowerCase().contains(lIIllllll[lIlIIIIII[95]]))) ? 1 : 0)) {
                    lllllIIllIlIII = new d(lIlIIIIII[91], lIlIIIIII[19], lIlIIIIII[92]);
                    bv.add(lllllIIllIlIII);
                    0;
                }
                int[] nArray7 = new int[lIlIIIIII[5]];
                nArray7[H.lIlIIIIII[4]] = lIlIIIIII[15];
                if (H.lIIIIllIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    lllllIIllIlIII = new d(lIlIIIIII[15], lIlIIIIII[12], i.bq);
                    bv.add(lllllIIllIlIII);
                    0;
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
            lllllIIllIlIII = new d(lIlIIIIII[14], lIlIIIIII[50], lIlIIIIII[93]);
            bv.add(lllllIIllIlIII);
            0;
        }
    }

    private static String lIIIIlIIllII(String lllllIIlIIIIII, String lllllIIlIIIIIl) {
        try {
            SecretKeySpec lllllIIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIII[13]), "DES");
            Cipher lllllIIlIIIlII = Cipher.getInstance("DES");
            lllllIIlIIIlII.init(lIlIIIIII[6], lllllIIlIIIlIl);
            return new String(lllllIIlIIIlII.doFinal(Base64.getDecoder().decode(lllllIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIlIIIIll) {
            lllllIIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIIlIIlIll(String lllllIIIllIlIl, String lllllIIIllIlII) {
        try {
            SecretKeySpec lllllIIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIIIllIlll = Cipher.getInstance("Blowfish");
            lllllIIIllIlll.init(lIlIIIIII[6], lllllIIIlllIII);
            return new String(lllllIIIllIlll.doFinal(Base64.getDecoder().decode(lllllIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIIIllIllI) {
            lllllIIIllIllI.printStackTrace();
            return null;
        }
    }

    private static String lIIIIlIIllIl(String lllllIIlIlIlll, String lllllIIlIlIllI) {
        lllllIIlIlIlll = new String(Base64.getDecoder().decode(lllllIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIIlIlIlIl = new StringBuilder();
        char[] lllllIIlIlIlII = lllllIIlIlIllI.toCharArray();
        int lllllIIlIlIIll = lIlIIIIII[4];
        char[] lllllIIlIIllIl = lllllIIlIlIlll.toCharArray();
        int lllllIIlIIllII = lllllIIlIIllIl.length;
        int lllllIIlIIlIll = lIlIIIIII[4];
        while (H.lIIIIlIlllll(lllllIIlIIlIll, lllllIIlIIllII)) {
            char lllllIIlIllIII = lllllIIlIIllIl[lllllIIlIIlIll];
            lllllIIlIlIlIl.append((char)(lllllIIlIllIII ^ lllllIIlIlIlII[lllllIIlIlIIll % lllllIIlIlIlII.length]));
            0;
            ++lllllIIlIlIIll;
            ++lllllIIlIIlIll;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllIIlIlIlIl);
    }

    private static void lIIIIlIlllII() {
        lIlIIIIII = new int[119];
        H.lIlIIIIII[0] = 0xFFFFE627 & 0x1DFF;
        H.lIlIIIIII[1] = 0xFFFF99DB & 0x6FF7;
        H.lIlIIIIII[2] = 0xFFFFBB77 & 0x4FB9;
        H.lIlIIIIII[3] = 0xFFFFC72F & 0x3EFF;
        H.lIlIIIIII[4] = (0x85 ^ 0x8E) & ~(0x9A ^ 0x91);
        H.lIlIIIIII[5] = 1;
        H.lIlIIIIII[6] = 2;
        H.lIlIIIIII[7] = 0x53 ^ 0x4E ^ 2;
        H.lIlIIIIII[8] = 0xD2 ^ 0xB6;
        H.lIlIIIIII[9] = 7 ^ 0x67 ^ (0xF2 ^ 0x82);
        H.lIlIIIIII[10] = 0xFFFF9FBC & 0x73CB;
        H.lIlIIIIII[11] = 3;
        H.lIlIIIIII[12] = 92 + 28 - -7 + 28 ^ 5 + 63 - 53 + 144;
        H.lIlIIIIII[13] = 0xA2 ^ 0xAA;
        H.lIlIIIIII[14] = 0xFFFFFF7F & 0x1FC7;
        H.lIlIIIIII[15] = 0xFFFFB9DB & 0x7775;
        H.lIlIIIIII[16] = -(0xFFFFF56F & 0x7EDE) & (0xFFFFFFFF & 0x77FF);
        H.lIlIIIIII[17] = 0xFFFFDB0D & 0x2DF7;
        H.lIlIIIIII[18] = -(0xFFFFA8D9 & 0x7FA7) & (0xFFFFFFFD & 0x2FFF);
        H.lIlIIIIII[19] = 2 ^ 7;
        H.lIlIIIIII[20] = 0xFFFFAEDE & 0x597F;
        H.lIlIIIIII[21] = 0x69 ^ 5 ^ (0xF4 ^ 0x9E);
        H.lIlIIIIII[22] = -(0xFFFFE2F7 & 0x5D0F) & (0xFFFFFFFF & 0x5F4F);
        H.lIlIIIIII[23] = 0x1B ^ 0x1C;
        H.lIlIIIIII[24] = 0xFFFFC4F7 & 0x3FF9;
        H.lIlIIIIII[25] = 0xB5 ^ 0x97 ^ (0x8F ^ 0xA7);
        H.lIlIIIIII[26] = 0xFFFFC986 & 0x3FFB;
        H.lIlIIIIII[27] = 0xFFFF9F7D & 0x65B7;
        H.lIlIIIIII[28] = -(0xFFFFF7D5 & 0x6AAB) & (0xFFFFFFFF & 0x63FB);
        H.lIlIIIIII[29] = 0xFFFFBF5B & 0x71F7;
        H.lIlIIIIII[30] = 0xDB ^ 0xC6 ^ (0x68 ^ 0x47);
        H.lIlIIIIII[31] = 0x8C ^ 0x9B;
        H.lIlIIIIII[32] = 0x23 ^ 0x2A;
        H.lIlIIIIII[33] = 0xFFFFBFA5 & 0x6F7B;
        H.lIlIIIIII[34] = 0xEF ^ 0x96 ^ (0xE8 ^ 0x9E);
        H.lIlIIIIII[35] = 0x23 ^ 0x28;
        H.lIlIIIIII[36] = 0x3E ^ 0xD ^ (0x1C ^ 0x23);
        H.lIlIIIIII[37] = 0x7A ^ 0xD ^ (0x72 ^ 8);
        H.lIlIIIIII[38] = 0x28 ^ 0x26;
        H.lIlIIIIII[39] = -(0xFFFFB15F & 0x7EBB) & (0xFFFFFD3F & 0x3EDF);
        H.lIlIIIIII[40] = -(0xFFFFEA95 & 0x376E) & (0xFFFFEFEF & 0x3F7F);
        H.lIlIIIIII[41] = 0xFFFF9DEE & 0x6E17;
        H.lIlIIIIII[42] = 0xFFFFADFD & 0x5F6B;
        H.lIlIIIIII[43] = 0xFFFFBD67 & 0x4E9F;
        H.lIlIIIIII[44] = 0xFFFFBFF7 & 0x4D6B;
        H.lIlIIIIII[45] = 0xFFFFFD0F & 0xEFB;
        H.lIlIIIIII[46] = -(0xFFFFFE39 & 0x63E7) & (0xFFFFEFFE & 0x7F7F);
        H.lIlIIIIII[47] = -(0xFFFFD0CB & 0x7FF7) & (0xFFFFFDEF & 0x5EDF);
        H.lIlIIIIII[48] = -(0xFFFFFE2A & 0x51D7) & (0xFFFFDDFD & 0x7F5B);
        H.lIlIIIIII[49] = 80 + 87 - -42 + 7;
        H.lIlIIIIII[50] = 0xA4 ^ 0x8C;
        H.lIlIIIIII[51] = 0xA4 ^ 0xB5;
        H.lIlIIIIII[52] = 136 + 83 - 96 + 23 ^ 6 + 14 - -33 + 75;
        H.lIlIIIIII[53] = 0x7C ^ 0x6F;
        H.lIlIIIIII[54] = 0xFFFFBD26 & 0x4EDB;
        H.lIlIIIIII[55] = 179 + 107 - 166 + 63 ^ 20 + 144 - 145 + 144;
        H.lIlIIIIII[56] = 0xFFFFCFEA & 0x3D7F;
        H.lIlIIIIII[57] = 0x9B ^ 0x8E;
        H.lIlIIIIII[58] = 0x8F ^ 0x99;
        H.lIlIIIIII[59] = 0xA4 ^ 0x8F ^ (0x5F ^ 0x6C);
        H.lIlIIIIII[60] = 0x99 ^ 0x80;
        H.lIlIIIIII[61] = 9 ^ 0x65 ^ (0x41 ^ 0x37);
        H.lIlIIIIII[62] = 0xA1 ^ 0x92 ^ (0x3E ^ 0x16);
        H.lIlIIIIII[63] = 0x3D ^ 0x21;
        H.lIlIIIIII[64] = 0xB5 ^ 0xA8;
        H.lIlIIIIII[65] = 0xFFFFFF73 & 0x2FAC;
        H.lIlIIIIII[66] = 0x45 ^ 0xC ^ (0xD7 ^ 0x80);
        H.lIlIIIIII[67] = 0x80 ^ 0xB0 ^ (0x5A ^ 0x4A);
        H.lIlIIIIII[68] = 0xD9 ^ 0xAF ^ (0x23 ^ 0x74);
        H.lIlIIIIII[69] = 0x1F ^ 0x6C ^ (0x21 ^ 0x70);
        H.lIlIIIIII[70] = 28 + 93 - -42 + 63 ^ 10 + 59 - 34 + 158;
        H.lIlIIIIII[71] = 97 + 88 - 55 + 45 ^ 27 + 87 - 44 + 69;
        H.lIlIIIIII[72] = 0x18 ^ 0x10 ^ (0xBD ^ 0x90);
        H.lIlIIIIII[73] = 0xB3 ^ 0x95;
        H.lIlIIIIII[74] = 0x89 ^ 0xAE;
        H.lIlIIIIII[75] = 0xCF ^ 0xC7 ^ (0x34 ^ 0x15);
        H.lIlIIIIII[76] = 0x47 ^ 0x6D;
        H.lIlIIIIII[77] = 0x81 ^ 0xB9 ^ (0x47 ^ 0x54);
        H.lIlIIIIII[78] = 54 + 119 - 134 + 109 ^ 129 + 137 - 221 + 139;
        H.lIlIIIIII[79] = 0xA0 ^ 0x8D;
        H.lIlIIIIII[80] = 20 + 102 - 87 + 131 ^ 111 + 72 - 49 + 2;
        H.lIlIIIIII[81] = 0x9B ^ 0xB4;
        H.lIlIIIIII[82] = 0x43 ^ 0x73;
        H.lIlIIIIII[83] = 0x50 ^ 0x61;
        H.lIlIIIIII[84] = 71 + 4 - -24 + 31 ^ 148 + 127 - 253 + 155;
        H.lIlIIIIII[85] = 0x60 ^ 0x4C ^ (0x2C ^ 0x78);
        H.lIlIIIIII[86] = 0x25 ^ 0x11;
        H.lIlIIIIII[87] = 0x5E ^ 0x6B;
        H.lIlIIIIII[88] = 0xFFFF8BFE & 0x7F69;
        H.lIlIIIIII[89] = 0xFFFFAEFD & 0x77C2;
        H.lIlIIIIII[90] = 0xFFFFAEBE & 0x57F9;
        H.lIlIIIIII[91] = -(0xFFFFD7FE & 0x7913) & (0xFFFFFFDD & Short.MAX_VALUE);
        H.lIlIIIIII[92] = 0xFFFFF9FF & 0x67A8;
        H.lIlIIIIII[93] = 0xFFFFBF7B & 0x45FC;
        H.lIlIIIIII[94] = 99 + 32 - 116 + 149 ^ 102 + 127 - 119 + 36;
        H.lIlIIIIII[95] = 36 + 206 - 215 + 219 ^ 189 + 126 - 172 + 50;
        H.lIlIIIIII[96] = 0x2B ^ 0x3D ^ (0xB5 ^ 0x9B);
        H.lIlIIIIII[97] = 0xFB ^ 0xC2 ^ (0x6E ^ 0x25) & ~(0xCC ^ 0x87);
        H.lIlIIIIII[98] = -(0xFFFFF337 & 0x6FCF) & (0xFFFFFF7F & 0x6FDF);
        H.lIlIIIIII[99] = -(0xFFFFE9BD & 0x76CB) & (0xFFFFFDAB & 0x6FFE);
        H.lIlIIIIII[100] = 71 + 123 - 98 + 32;
        H.lIlIIIIII[101] = 0x51 ^ 0x36;
        H.lIlIIIIII[102] = -(0xFFFFF6A5 & 0x2D5F) & (0xFFFFBFFF & 0x6FBF);
        H.lIlIIIIII[103] = -(0xFFFFBDED & 0x7373) & (0xFFFFBD7F & 0x7FEE);
        H.lIlIIIIII[104] = 0xFFFFDF77 & 0x2DDF;
        H.lIlIIIIII[105] = -(0xFFFFE3AD & 0x5F7B) & (0xFFFFCFAD & 0x7F7E);
        H.lIlIIIIII[106] = -(0xFFFFD2FF & 0x7F82) & (0xFFFFDFEF & Short.MAX_VALUE);
        H.lIlIIIIII[107] = -(0xFFFFD84B & 0x77FE) & (0xFFFFFEDD & 0x5D7B);
        H.lIlIIIIII[108] = 0xFFFFDFDB & 0x2DB4;
        H.lIlIIIIII[109] = -(0xFFFFF7B6 & 0x6B6B) & (0xFFFFFFFF & 0x6FBF);
        H.lIlIIIIII[110] = -(0xFFFFDFF9 & 0x22AF) & (0xFFFFFFEF & 0xFFF);
        H.lIlIIIIII[111] = 0xFFFFABCD & 0x5FBF;
        H.lIlIIIIII[112] = -(0xFFFFF7FB & 0x7AD7) & (0xFFFFFFFB & Short.MAX_VALUE);
        H.lIlIIIIII[113] = 0xFFFFDFFF & 0x2BB3;
        H.lIlIIIIII[114] = 0xFFFFBDB7 & 0x4FEE;
        H.lIlIIIIII[115] = 0xE ^ 0x34;
        H.lIlIIIIII[116] = 0x82 ^ 0x9F ^ (0x20 ^ 6);
        H.lIlIIIIII[117] = 34 + 127 - -51 + 41 ^ 141 + 15 - -22 + 15;
        H.lIlIIIIII[118] = 0xB9 ^ 0x84;
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

