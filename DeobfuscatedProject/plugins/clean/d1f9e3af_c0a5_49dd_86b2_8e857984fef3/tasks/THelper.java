/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
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

public class THelper
implements W {
    static  boolean kg;
    static  boolean kh;
    static  boolean ke;
    static  boolean jZ;
    
    static  boolean kb;
    static  boolean kd;
    static  WorldPoint jT;
    static  boolean ka;
    static  String[] bR;
    static  boolean kj;
    static  WorldPoint jR;
    static  boolean ki;
    public static  boolean bt;
    static  int cl;
    static  boolean kf;
    static  WorldArea jV;
    static  boolean cm;
    static  WorldPoint jU;
    static  WorldPoint bX;
    static  boolean kc;
    static  WorldPoint cj;
    static  int kk;
    public static  List<d> bv;
    static  WorldArea jX;
    
    static  WorldArea jW;
    static  WorldPoint jS;
    static  boolean jY;
    static  WorldPoint jQ;

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void lIIIlIlllIllIIl;
        int[] nArray = new int[lIIIllllI[11]];
        nArray[T.lIIIllllI[9]] = lIIIllllI[12];
        nArray[T.lIIIllllI[4]] = lIIIllllI[13];
        nArray[T.lIIIllllI[5]] = lIIIllllI[14];
        nArray[T.lIIIllllI[6]] = lIIIllllI[15];
        nArray[T.lIIIllllI[7]] = lIIIllllI[16];
        int[] nArray2 = nArray;
        int lIIIlIlllIllIII = lIIIllllI[9];
        while (T.lllIlllIllI(lIIIlIlllIllIII, ((void)lIIIlIlllIllIIl).length)) {
            int[] nArray3 = new int[lIIIllllI[4]];
            nArray3[T.lIIIllllI[9]] = lIIIlIlllIllIIl[lIIIlIlllIllIII];
            if (T.lllIlllIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIllllI[9];
            }
            ++lIIIlIlllIllIII;

            if (1 < (0xA2 ^ 0xA6)) continue;
            return false;
        }
        return lIIIllllI[4];
    }

    private static void af() {
        d lIIIlIlllIlIlII;
        block13: {
            block12: {
                Object lIIIlIlllIlIlIl;
                block11: {
                    block10: {
                        int[] nArray = new int[lIIIllllI[4]];
                        nArray[T.lIIIllllI[9]] = lIIIllllI[18];
                        if (!T.lllIlllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block10;
                        int[] nArray2 = new int[lIIIllllI[4]];
                        nArray2[T.lIIIllllI[9]] = lIIIllllI[18];
                        if (!T.lllIlllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block11;
                        int[] nArray3 = new int[lIIIllllI[4]];
                        nArray3[T.lIIIllllI[9]] = lIIIllllI[18];
                        if (!T.lllIlllIllI(Bank.getFirst((int[])nArray3).getQuantity(), lIIIllllI[26])) break block11;
                    }
                    lIIIlIlllIlIlIl = new DHelper(lIIIllllI[18], lIIIllllI[54], lIIIllllI[249]);
                    bv.add((DHelper) IIIlIlllIlIlIl);

                }
                int[] nArray = new int[lIIIllllI[4]];
                nArray[T.lIIIllllI[9]] = lIIIllllI[21];
                if (T.lllIlllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lIIIlIlllIlIlIl = new DHelper(lIIIllllI[21], lIIIllllI[4], lIIIllllI[250]);
                    bv.add((DHelper) IIIlIlllIlIlIl);

                }
                int[] nArray4 = new int[lIIIllllI[4]];
                nArray4[T.lIIIllllI[9]] = lIIIllllI[13];
                if (T.lllIlllIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIIIlIlllIlIlIl = new DHelper(lIIIllllI[13], lIIIllllI[54], lIIIllllI[251]);
                    bv.add((DHelper) IIIlIlllIlIlIl);

                }
                if (T.lllIlllIlll(Bank.contains((Predicate)(lIIIlIlllIlIlIl = item -> item.getName().toLowerCase().contains(lIIIlllII[lIIIllllI[256]]))) ? 1 : 0)) {
                    lIIIlIlllIlIlII = new DHelper(lIIIllllI[252], lIIIllllI[11], lIIIllllI[253]);
                    bv.add(lIIIlIlllIlIlII);

                }
                int[] nArray5 = new int[lIIIllllI[4]];
                nArray5[T.lIIIllllI[9]] = lIIIllllI[15];
                if (!T.lllIlllIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block12;
                int[] nArray6 = new int[lIIIllllI[4]];
                nArray6[T.lIIIllllI[9]] = lIIIllllI[15];
                if (!T.lllIlllIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block13;
                int[] nArray7 = new int[lIIIllllI[4]];
                nArray7[T.lIIIllllI[9]] = lIIIllllI[15];
                if (!T.lllIlllIllI(Bank.getFirst((int[])nArray7).getQuantity(), lIIIllllI[7])) break block13;
            }
            lIIIlIlllIlIlII = new DHelper(lIIIllllI[15], lIIIllllI[7], i.bq);
            bv.add(lIIIlIlllIlIlII);

        }
        int[] nArray = new int[lIIIllllI[4]];
        nArray[T.lIIIllllI[9]] = lIIIllllI[12];
        if (T.lllIlllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIlIlllIlIlII = new DHelper(lIIIllllI[12], lIIIllllI[19], lIIIllllI[254]);
            bv.add(lIIIlIlllIlIlII);

        }
    }

    private static int lllIlllIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void cZ() {
        block185: {
            WorldPoint[] lIIIlIlllIllllI;
            block186: {
                Object lIIIlIlllIlllIl;
                block187: {
                    block188: {
                        block190: {
                            block189: {
                                int lIIIlIlllIlllII;
                                System.out.println("6073: " + Vars.getBit((int)lIIIllllI[0]));
                                System.out.println("6072: " + Vars.getBit((int)lIIIllllI[1]));
                                System.out.println("6074: " + Vars.getBit((int)lIIIllllI[2]));
                                System.out.println("6075: " + Vars.getBit((int)lIIIllllI[3]));
                                if (T.lllIlllIlII(Vars.getBit((int)lIIIllllI[3]), lIIIllllI[4])) {
                                    jY = lIIIllllI[4];
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)lIIIllllI[1]), lIIIllllI[4])) {
                                    ka = lIIIllllI[4];
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)lIIIllllI[1]), lIIIllllI[5])) {
                                    ka = lIIIllllI[4];
                                    kf = lIIIllllI[4];
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)lIIIllllI[1]), lIIIllllI[6])) {
                                    ka = lIIIllllI[4];
                                    ki = lIIIllllI[4];
                                    kf = lIIIllllI[4];
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)lIIIllllI[0]), lIIIllllI[4])) {
                                    kb = lIIIllllI[4];
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)lIIIllllI[0]), lIIIllllI[5])) {
                                    ke = lIIIllllI[4];
                                    kb = lIIIllllI[4];
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)lIIIllllI[0]), lIIIllllI[6])) {
                                    ke = lIIIllllI[4];
                                    kg = lIIIllllI[4];
                                    kb = lIIIllllI[4];
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)lIIIllllI[2]), lIIIllllI[5])) {
                                    jZ = lIIIllllI[4];
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)lIIIllllI[2]), lIIIllllI[6])) {
                                    kc = lIIIllllI[4];
                                    jZ = lIIIllllI[4];
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)lIIIllllI[2]), lIIIllllI[7])) {
                                    kd = lIIIllllI[4];
                                    jZ = lIIIllllI[4];
                                    kc = lIIIllllI[4];
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)lIIIllllI[2]), lIIIllllI[8])) {
                                    kd = lIIIllllI[4];
                                    jZ = lIIIllllI[4];
                                    kh = lIIIllllI[4];
                                    kc = lIIIllllI[4];
                                }
                                if (T.lllIlllIlIl(bt ? 1 : 0)) {
                                    b.a(bv);
                                    if (T.lllIlllIllI(bv.size(), lIIIllllI[4])) {
                                        System.out.println(lIIIlllII[lIIIllllI[9]]);
                                        bt = lIIIllllI[9];
                                    }
                                }
                                if (!T.lllIlllIlll(bt ? 1 : 0)) break block185;
                                if (T.lllIlllIlll(T.ab() ? 1 : 0) && T.lllIlllIlll(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()))) {
                                    lIIIlIlllIllllI = BankLocation.getNearest();
                                    if (T.lllIllllIII(lIIIlIlllIllllI) && T.lllIlllIlll(lIIIlIlllIllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[4]];
                                        a.a((BankLocation)lIIIlIlllIllllI);
                                    }
                                    if (T.lllIllllIII(lIIIlIlllIllllI) && T.lllIlllIlIl(lIIIlIlllIllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        if (T.lllIlllIlll(Bank.isOpen() ? 1 : 0)) {
                                            a.a();
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllI[10]);

                                        }
                                        if (T.lllIlllIlIl(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[5]];
                                            if (T.lllIllllIIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIllllI[7]);

                                            }
                                            if (T.lllIllllIIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIllllI[5]);

                                            }
                                            int[] nArray = new int[lIIIllllI[11]];
                                            nArray[T.lIIIllllI[9]] = lIIIllllI[12];
                                            nArray[T.lIIIllllI[4]] = lIIIllllI[13];
                                            nArray[T.lIIIllllI[5]] = lIIIllllI[14];
                                            nArray[T.lIIIllllI[6]] = lIIIllllI[15];
                                            nArray[T.lIIIllllI[7]] = lIIIllllI[16];
                                            if (T.lllIlllIlll(e.b(nArray) ? 1 : 0)) {
                                                T.af();
                                                System.out.println(lIIIlllII[lIIIllllI[6]]);
                                                bt = lIIIllllI[4];
                                                return;
                                            }
                                            int[] nArray2 = new int[lIIIllllI[11]];
                                            nArray2[T.lIIIllllI[9]] = lIIIllllI[12];
                                            nArray2[T.lIIIllllI[4]] = lIIIllllI[13];
                                            nArray2[T.lIIIllllI[5]] = lIIIllllI[14];
                                            nArray2[T.lIIIllllI[6]] = lIIIllllI[15];
                                            nArray2[T.lIIIllllI[7]] = lIIIllllI[16];
                                            if (T.lllIlllIlIl(e.b(nArray2) ? 1 : 0)) {
                                                a.a(lIIIllllI[12], lIIIllllI[17]);
                                                a.a(lIIIllllI[13], lIIIllllI[17]);
                                                a.a(lIIIllllI[14], lIIIllllI[4]);
                                                a.a(lIIIllllI[16], lIIIllllI[4]);
                                                a.a(lIIIllllI[15], lIIIllllI[5]);
                                                a.a(lIIIllllI[18], lIIIllllI[17]);
                                                if (T.lllIlllIllI(Skills.getLevel((Skill)Skill.ATTACK), lIIIllllI[19])) {
                                                    a.a(lIIIllllI[20], lIIIllllI[4]);

                                                    if (2 <= 0) {
                                                        return;
                                                    }
                                                } else {
                                                    a.a(lIIIllllI[21], lIIIllllI[4]);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (T.lllIlllIlIl(Inventory.contains((int[])f.aV) ? 1 : 0) && T.lllIlllIllI(Movement.getRunEnergy(), lIIIllllI[22])) {
                                    Inventory.getFirst((int[])f.aV).interact(lIIIlllII[lIIIllllI[7]]);
                                    Time.sleepTicks((int)lIIIllllI[4]);

                                }
                                if (T.lllIlllIlIl(T.ab() ? 1 : 0) && T.lllIlllIlll(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()))) {
                                    if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllllI[17])) {
                                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[11]];
                                        if (T.lllIlllIlIl(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)bX);

                                        Time.sleepTicks((int)lIIIllllI[4]);

                                    }
                                    if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllllI[17])) {
                                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[8]];
                                        g.a(lIIIlllII[lIIIllllI[23]], bR);
                                    }
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[11])) {
                                    g.a(bR);
                                }
                                if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[17])) {
                                    if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jQ), lIIIllllI[11])) {
                                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[24]];
                                        Movement.walkTo((WorldPoint)jQ);

                                        Time.sleepTicks((int)lIIIllllI[4]);

                                    }
                                    if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jQ), lIIIllllI[11])) {
                                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[25]];
                                        g.a(lIIIlllII[lIIIllllI[17]], bR);
                                    }
                                }
                                if (!T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[26])) break block186;
                                cl = lIIIllllI[9];
                                lIIIlIlllIllllI = new WorldPoint(lIIIllllI[27], lIIIllllI[28], lIIIllllI[4]);
                                if (T.lllIlllIlIl(Players.getLocal().getWorldLocation().equals((Object)lIIIlIlllIllllI) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIllllI[4]];
                                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[29]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[30]]);
                                    Time.sleepTicks((int)lIIIllllI[5]);

                                }
                                if (T.lllIlllIlll(jY ? 1 : 0)) {
                                    if (T.lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIIllllI[4]];
                                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[31]];
                                        TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[32]]);
                                        Time.sleepTicks((int)lIIIllllI[6]);

                                    }
                                    if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                                        String[] stringArray = new String[lIIIllllI[4]];
                                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[26]];
                                        if (T.lllIlllllII(NPCs.getNearest((String[])stringArray)) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            WorldPoint[] worldPointArray = new WorldPoint[lIIIllllI[17]];
                                            worldPointArray[T.lIIIllllI[9]] = new WorldPoint(lIIIllllI[27], lIIIllllI[33], lIIIllllI[9]);
                                            worldPointArray[T.lIIIllllI[4]] = new WorldPoint(lIIIllllI[27], lIIIllllI[34], lIIIllllI[9]);
                                            worldPointArray[T.lIIIllllI[5]] = new WorldPoint(lIIIllllI[35], lIIIllllI[36], lIIIllllI[9]);
                                            worldPointArray[T.lIIIllllI[6]] = new WorldPoint(lIIIllllI[37], lIIIllllI[36], lIIIllllI[9]);
                                            worldPointArray[T.lIIIllllI[7]] = new WorldPoint(lIIIllllI[38], lIIIllllI[39], lIIIllllI[9]);
                                            worldPointArray[T.lIIIllllI[11]] = new WorldPoint(lIIIllllI[40], lIIIllllI[41], lIIIllllI[9]);
                                            worldPointArray[T.lIIIllllI[8]] = new WorldPoint(lIIIllllI[42], lIIIllllI[43], lIIIllllI[9]);
                                            worldPointArray[T.lIIIllllI[23]] = new WorldPoint(lIIIllllI[44], lIIIllllI[45], lIIIllllI[9]);
                                            worldPointArray[T.lIIIllllI[24]] = new WorldPoint(lIIIllllI[46], lIIIllllI[47], lIIIllllI[9]);
                                            worldPointArray[T.lIIIllllI[25]] = new WorldPoint(lIIIllllI[48], lIIIllllI[49], lIIIllllI[9]);
                                            lIIIlIlllIlllIl = worldPointArray;
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[50]];
                                            Walker.walkAlong(Arrays.asList(lIIIlIlllIlllIl), new HashMap());

                                            Time.sleepTicks((int)lIIIllllI[4]);

                                        }
                                    }
                                    if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[51]];
                                        String[] stringArray = new String[lIIIllllI[4]];
                                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[52]];
                                        if (T.lllIlllllII(NPCs.getNearest((String[])stringArray))) {
                                            String[] stringArray2 = new String[lIIIllllI[4]];
                                            stringArray2[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[53]];
                                            TileObjects.getNearest((String[])stringArray2).interact(lIIIlllII[lIIIllllI[54]]);
                                            Time.sleepTicks((int)lIIIllllI[6]);

                                        }
                                        g.a(lIIIlllII[lIIIllllI[55]], bR);
                                    }
                                    String[] stringArray = new String[lIIIllllI[4]];
                                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[56]];
                                    if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                                        lIIIlIlllIlllIl = Dialog.getText();
                                        if (T.lllIllllIII(lIIIlIlllIlllIl) && T.lllIlllIlIl(lIIIlIlllIlllIl.contains(lIIIlllII[lIIIllllI[57]]) ? 1 : 0)) {
                                            jY = lIIIllllI[4];
                                        }
                                        g.a(lIIIlllII[lIIIllllI[58]], bR);
                                    }
                                }
                                if (T.lllIlllIlll(jZ ? 1 : 0) && T.lllIlllIlIl(jY ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIllllI[4]];
                                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[59]];
                                    if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                                        String[] stringArray3 = new String[lIIIllllI[4]];
                                        stringArray3[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[60]];
                                        TileObjects.getNearest((String[])stringArray3).interact(lIIIlllII[lIIIllllI[61]]);
                                        Time.sleepTicks((int)lIIIllllI[6]);

                                    }
                                    if (T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        if (T.lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[62]];
                                            String[] stringArray4 = new String[lIIIllllI[4]];
                                            stringArray4[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[63]];
                                            TileObjects.getNearest((String[])stringArray4).interact(lIIIlllII[lIIIllllI[64]]);
                                            Time.sleepTicks((int)lIIIllllI[6]);

                                        }
                                        String[] stringArray5 = new String[lIIIllllI[4]];
                                        stringArray5[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[65]];
                                        if (T.lllIlllllII(NPCs.getNearest((String[])stringArray5)) && T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[6])) {
                                            String[] stringArray6 = new String[lIIIllllI[4]];
                                            stringArray6[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[66]];
                                            if (T.lllIlllllII(NPCs.getNearest((String[])stringArray6))) {
                                                AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[67]];
                                                Movement.walkTo((WorldPoint)jS);

                                                Time.sleepTicks((int)lIIIllllI[4]);

                                            }
                                        }
                                        if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[6])) {
                                            String[] stringArray7 = new String[lIIIllllI[4]];
                                            stringArray7[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[68]];
                                            if (T.lllIlllllII(NPCs.getNearest((String[])stringArray7)) && T.lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                                                String[] stringArray8 = new String[lIIIllllI[4]];
                                                stringArray8[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[69]];
                                                TileObjects.getNearest((String[])stringArray8).interact(lIIIlllII[lIIIllllI[70]]);
                                            }
                                        }
                                    }
                                    if (T.lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray9 = new String[lIIIllllI[4]];
                                        stringArray9[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[71]];
                                        if (T.lllIllllIII(NPCs.getNearest((String[])stringArray9))) {
                                            lIIIlIlllIlllIl = Dialog.getText();
                                            if (T.lllIllllIII(lIIIlIlllIlllIl) && T.lllIlllIlIl(lIIIlIlllIlllIl.contains(lIIIlllII[lIIIllllI[72]]) ? 1 : 0)) {
                                                jZ = lIIIllllI[4];
                                            }
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[73]];
                                            g.a(lIIIlllII[lIIIllllI[19]], bR);
                                        }
                                    }
                                }
                                if (T.lllIlllIlll(ka ? 1 : 0) && T.lllIlllIlIl(jZ ? 1 : 0) && T.lllIlllIlIl(jY ? 1 : 0) && T.lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIllllI[4]];
                                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[74]];
                                    if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                                        lIIIlIlllIlllIl = Dialog.getOptions();
                                        if (T.lllIlllIlll(lIIIlIlllIlllIl.isEmpty() ? 1 : 0) && T.lllIlllIlIl(lIIIlIlllIlllIl.contains(lIIIlllII[lIIIllllI[75]]) ? 1 : 0)) {
                                            ka = lIIIllllI[4];
                                        }
                                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[76]];
                                        g.a(lIIIlllII[lIIIllllI[77]], bR);
                                    }
                                }
                                if (T.lllIlllIlll(kb ? 1 : 0) && T.lllIlllIlIl(ka ? 1 : 0) && T.lllIlllIlIl(jZ ? 1 : 0) && T.lllIlllIlIl(jY ? 1 : 0)) {
                                    if (T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        if (T.lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            String[] stringArray = new String[lIIIllllI[4]];
                                            stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[78]];
                                            TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[79]]);
                                            Time.sleepTicks((int)lIIIllllI[6]);

                                        }
                                        if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6]) && T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[80]];
                                            Movement.walkTo((WorldPoint)jT);

                                            Time.sleepTicks((int)lIIIllllI[4]);

                                        }
                                        if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6])) {
                                            String[] stringArray = new String[lIIIllllI[4]];
                                            stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[81]];
                                            if (T.lllIlllllII(NPCs.getNearest((String[])stringArray)) && T.lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                                                String[] stringArray10 = new String[lIIIllllI[4]];
                                                stringArray10[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[82]];
                                                TileObjects.getNearest((String[])stringArray10).interact(lIIIlllII[lIIIllllI[22]]);
                                            }
                                        }
                                    }
                                    if (T.lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIIllllI[4]];
                                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[83]];
                                        if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                                            lIIIlIlllIlllIl = Dialog.getOptions();
                                            if (T.lllIlllIlll(lIIIlIlllIlllIl.isEmpty() ? 1 : 0)) {
                                                lIIIlIlllIlllII = lIIIllllI[9];
                                                while (T.lllIlllIllI(lIIIlIlllIlllII, lIIIlIlllIlllIl.size())) {
                                                    if (T.lllIlllIlIl(((Widget)lIIIlIlllIlllIl.get(lIIIlIlllIlllII)).getText().contains(lIIIlllII[lIIIllllI[84]]) ? 1 : 0)) {
                                                        System.out.println(lIIIlllII[lIIIllllI[85]]);
                                                        kb = lIIIllllI[4];
                                                    }
                                                    ++lIIIlIlllIlllII;

                                                    return;
                                                }
                                            }
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[86]];
                                            g.a(lIIIlllII[lIIIllllI[87]], bR);
                                        }
                                    }
                                }
                                if (T.lllIlllIlll(kc ? 1 : 0) && T.lllIlllIlIl(kb ? 1 : 0) && T.lllIlllIlIl(ka ? 1 : 0) && T.lllIlllIlIl(jZ ? 1 : 0) && T.lllIlllIlIl(jY ? 1 : 0)) {
                                    if (T.lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[88]];
                                        String[] stringArray = new String[lIIIllllI[4]];
                                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[89]];
                                        TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[90]]);
                                        Time.sleepTicks((int)lIIIllllI[6]);

                                    }
                                    if (T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        if (T.lllIllllIlI(Players.getLocal().distanceTo(jU), lIIIllllI[6])) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[91]];
                                            Movement.walkTo((WorldPoint)jU);

                                            Time.sleepTicks((int)lIIIllllI[4]);

                                        }
                                        if (T.lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && T.lllIlllIlll(Players.getLocal().getWorldLocation().getPlane()) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            String[] stringArray = new String[lIIIllllI[4]];
                                            stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[92]];
                                            TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[93]]);
                                            Time.sleepTicks((int)lIIIllllI[8]);

                                        }
                                    }
                                    if (T.lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[94]];
                                        g.a(lIIIlllII[lIIIllllI[95]], bR);
                                        lIIIlIlllIlllIl = Dialog.getOptions();
                                        if (T.lllIlllIlll(lIIIlIlllIlllIl.isEmpty() ? 1 : 0)) {
                                            lIIIlIlllIlllII = lIIIllllI[9];
                                            while (T.lllIlllIllI(lIIIlIlllIlllII, lIIIlIlllIlllIl.size())) {
                                                if (T.lllIlllIlIl(((Widget)lIIIlIlllIlllIl.get(lIIIlIlllIlllII)).getText().contains(lIIIlllII[lIIIllllI[96]]) ? 1 : 0)) {
                                                    System.out.println(lIIIlllII[lIIIllllI[97]]);
                                                    kc = lIIIllllI[4];
                                                }
                                                ++lIIIlIlllIlllII;

                                                if (-1 <= 2) continue;
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (T.lllIlllIlll(kd ? 1 : 0) && T.lllIlllIlIl(kc ? 1 : 0) && T.lllIlllIlIl(kb ? 1 : 0) && T.lllIlllIlIl(ka ? 1 : 0) && T.lllIlllIlIl(jZ ? 1 : 0) && T.lllIlllIlIl(jY ? 1 : 0)) {
                                    if (T.lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIIllllI[4]];
                                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[98]];
                                        TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[99]]);
                                        Time.sleepTicks((int)lIIIllllI[11]);

                                    }
                                    if (T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIIllllI[4]];
                                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[100]];
                                        if (T.lllIlllllII(NPCs.getNearest((String[])stringArray))) {
                                            if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIIllllI[7])) {
                                                AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[101]];
                                                WorldPoint[] worldPointArray = new WorldPoint[lIIIllllI[17]];
                                                worldPointArray[T.lIIIllllI[9]] = new WorldPoint(lIIIllllI[27], lIIIllllI[102], lIIIllllI[9]);
                                                worldPointArray[T.lIIIllllI[4]] = new WorldPoint(lIIIllllI[27], lIIIllllI[34], lIIIllllI[9]);
                                                worldPointArray[T.lIIIllllI[5]] = new WorldPoint(lIIIllllI[103], lIIIllllI[36], lIIIllllI[9]);
                                                worldPointArray[T.lIIIllllI[6]] = new WorldPoint(lIIIllllI[104], lIIIllllI[36], lIIIllllI[9]);
                                                worldPointArray[T.lIIIllllI[7]] = new WorldPoint(lIIIllllI[38], lIIIllllI[36], lIIIllllI[9]);
                                                worldPointArray[T.lIIIllllI[11]] = new WorldPoint(lIIIllllI[105], lIIIllllI[106], lIIIllllI[9]);
                                                worldPointArray[T.lIIIllllI[8]] = new WorldPoint(lIIIllllI[107], lIIIllllI[108], lIIIllllI[9]);
                                                worldPointArray[T.lIIIllllI[23]] = new WorldPoint(lIIIllllI[44], lIIIllllI[109], lIIIllllI[9]);
                                                worldPointArray[T.lIIIllllI[24]] = new WorldPoint(lIIIllllI[110], lIIIllllI[111], lIIIllllI[9]);
                                                worldPointArray[T.lIIIllllI[25]] = new WorldPoint(lIIIllllI[112], lIIIllllI[113], lIIIllllI[9]);
                                                lIIIlIlllIlllIl = worldPointArray;
                                                Walker.walkAlong(Arrays.asList(lIIIlIlllIlllIl), new HashMap());

                                                Time.sleepTicks((int)lIIIllllI[4]);

                                            }
                                            if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(cj), lIIIllllI[7])) {
                                                String[] stringArray11 = new String[lIIIllllI[4]];
                                                stringArray11[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[114]];
                                                TileObjects.getNearest((String[])stringArray11).interact(lIIIlllII[lIIIllllI[115]]);
                                                Time.sleepTicks((int)lIIIllllI[6]);

                                            }
                                        }
                                    }
                                    String[] stringArray = new String[lIIIllllI[4]];
                                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[116]];
                                    if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[117]];
                                        g.a(lIIIlllII[lIIIllllI[118]], bR);
                                        lIIIlIlllIlllIl = Dialog.getOptions();
                                        if (T.lllIlllIlll(lIIIlIlllIlllIl.isEmpty() ? 1 : 0)) {
                                            lIIIlIlllIlllII = lIIIllllI[9];
                                            while (T.lllIlllIllI(lIIIlIlllIlllII, lIIIlIlllIlllIl.size())) {
                                                if (T.lllIlllIlIl(((Widget)lIIIlIlllIlllIl.get(lIIIlIlllIlllII)).getText().contains(lIIIlllII[lIIIllllI[119]]) ? 1 : 0)) {
                                                    System.out.println(lIIIlllII[lIIIllllI[120]]);
                                                    kd = lIIIllllI[4];
                                                }
                                                ++lIIIlIlllIlllII;

                                                if (1 > ((0x76 ^ 0x57 ^ (0xF4 ^ 0x95)) & (165 + 95 - 209 + 148 ^ 128 + 110 - 141 + 38 ^ -1))) continue;
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (T.lllIlllIlll(ke ? 1 : 0) && T.lllIlllIlIl(kd ? 1 : 0) && T.lllIlllIlIl(kc ? 1 : 0) && T.lllIlllIlIl(kb ? 1 : 0) && T.lllIlllIlIl(ka ? 1 : 0) && T.lllIlllIlIl(jZ ? 1 : 0) && T.lllIlllIlIl(jY ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIllllI[4]];
                                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[121]];
                                    if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                                        String[] stringArray12 = new String[lIIIllllI[4]];
                                        stringArray12[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[122]];
                                        TileObjects.getNearest((String[])stringArray12).interact(lIIIlllII[lIIIllllI[123]]);
                                        Time.sleepTicks((int)lIIIllllI[6]);

                                    }
                                    lIIIlIlllIlllIl = new WorldPoint(lIIIllllI[124], lIIIllllI[125], lIIIllllI[9]);
                                    String[] stringArray13 = new String[lIIIllllI[4]];
                                    stringArray13[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[126]];
                                    if (T.lllIlllllII(NPCs.getNearest((String[])stringArray13))) {
                                        if (T.lllIlllIlll(Players.getLocal().getWorldLocation().equals(lIIIlIlllIlllIl) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[127]];
                                            Movement.walkTo((WorldPoint)lIIIlIlllIlllIl);

                                            Time.sleepTicks((int)lIIIllllI[4]);

                                        }
                                        if (T.lllIlllIlIl(Players.getLocal().getWorldLocation().equals(lIIIlIlllIlllIl) ? 1 : 0) && T.lllIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                                            if (T.lllIlllIllI(kk, lIIIllllI[5])) {
                                                String[] stringArray14 = new String[lIIIllllI[4]];
                                                stringArray14[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[128]];
                                                Inventory.getFirst((String[])stringArray14).interact(lIIIlllII[lIIIllllI[129]]);
                                                Time.sleepTicks((int)lIIIllllI[7]);

                                                kk += lIIIllllI[4];
                                            }
                                            if (T.lllIlllIlII(kk, lIIIllllI[5])) {
                                                ke = lIIIllllI[4];
                                            }
                                        }
                                    }
                                }
                                if (T.lllIlllIlll(kf ? 1 : 0) && T.lllIlllIlIl(ke ? 1 : 0) && T.lllIlllIlIl(kd ? 1 : 0) && T.lllIlllIlIl(kc ? 1 : 0) && T.lllIlllIlIl(kb ? 1 : 0) && T.lllIlllIlIl(ka ? 1 : 0) && T.lllIlllIlIl(jZ ? 1 : 0) && T.lllIlllIlIl(jY ? 1 : 0)) {
                                    if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                                        String[] stringArray = new String[lIIIllllI[4]];
                                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[130]];
                                        if (T.lllIlllllII(NPCs.getNearest((String[])stringArray))) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[131]];
                                            Movement.walkTo((WorldPoint)jR);

                                            Time.sleepTicks((int)lIIIllllI[4]);

                                        }
                                    }
                                    if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                                        String[] stringArray = new String[lIIIllllI[4]];
                                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[132]];
                                        if (T.lllIlllllII(TileObjects.getNearest((String[])stringArray))) {
                                            String[] stringArray15 = new String[lIIIllllI[4]];
                                            stringArray15[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[133]];
                                            TileObjects.getNearest((String[])stringArray15).interact(lIIIlllII[lIIIllllI[134]]);
                                            Time.sleepTicks((int)lIIIllllI[7]);

                                        }
                                    }
                                    if (T.lllIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                                        String[] stringArray = new String[lIIIllllI[4]];
                                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[135]];
                                        if (T.lllIllllIII(TileObjects.getNearest((String[])stringArray))) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[136]];
                                            String[] stringArray16 = new String[lIIIllllI[4]];
                                            stringArray16[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[137]];
                                            TileObjects.getNearest((String[])stringArray16).interact(lIIIlllII[lIIIllllI[138]]);
                                            Time.sleepTicks((int)lIIIllllI[6]);

                                        }
                                    }
                                }
                                if (!T.lllIlllIlll(kg ? 1 : 0) || !T.lllIlllIlIl(kf ? 1 : 0) || !T.lllIlllIlIl(ke ? 1 : 0) || !T.lllIlllIlIl(kd ? 1 : 0) || !T.lllIlllIlIl(kc ? 1 : 0) || !T.lllIlllIlIl(kb ? 1 : 0) || !T.lllIlllIlIl(ka ? 1 : 0) || !T.lllIlllIlIl(jZ ? 1 : 0) || !T.lllIlllIlIl(jY ? 1 : 0)) break block187;
                                if (!T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block188;
                                if (!T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block189;
                                String[] stringArray = new String[lIIIllllI[4]];
                                stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[139]];
                                if (!T.lllIllllIII(TileObjects.getNearest((String[])stringArray))) break block190;
                            }
                            String[] stringArray = new String[lIIIllllI[4]];
                            stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[140]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[141]]);
                            Time.sleepTicks((int)lIIIllllI[6]);

                        }
                        if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6]) && T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIllllI[4]];
                            stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[142]];
                            if (T.lllIlllllII(TileObjects.getNearest((String[])stringArray))) {
                                AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[143]];
                                Movement.walkTo((WorldPoint)jT);

                                Time.sleepTicks((int)lIIIllllI[4]);

                            }
                        }
                        if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6])) {
                            String[] stringArray = new String[lIIIllllI[4]];
                            stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[144]];
                            if (T.lllIlllllII(NPCs.getNearest((String[])stringArray)) && T.lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] stringArray17 = new String[lIIIllllI[4]];
                                stringArray17[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[145]];
                                TileObjects.getNearest((String[])stringArray17).interact(lIIIlllII[lIIIllllI[146]]);
                            }
                        }
                    }
                    if (T.lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIllllI[4]];
                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[147]];
                        if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[148]];
                            g.a(lIIIlllII[lIIIllllI[149]], bR);
                            lIIIlIlllIlllIl = Dialog.getText();
                            if (T.lllIllllIII(lIIIlIlllIlllIl) && T.lllIlllIlIl(lIIIlIlllIlllIl.contains(lIIIlllII[lIIIllllI[150]]) ? 1 : 0)) {
                                kg = lIIIllllI[4];
                            }
                        }
                    }
                }
                if (T.lllIlllIlll(kh ? 1 : 0) && T.lllIlllIlIl(kg ? 1 : 0) && T.lllIlllIlIl(kf ? 1 : 0) && T.lllIlllIlIl(ke ? 1 : 0) && T.lllIlllIlIl(kd ? 1 : 0) && T.lllIlllIlIl(kc ? 1 : 0) && T.lllIlllIlIl(kb ? 1 : 0) && T.lllIlllIlIl(ka ? 1 : 0) && T.lllIlllIlIl(jZ ? 1 : 0) && T.lllIlllIlIl(jY ? 1 : 0)) {
                    if (T.lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[151]];
                        String[] stringArray = new String[lIIIllllI[4]];
                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[152]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[153]]);
                        Time.sleepTicks((int)lIIIllllI[6]);

                    }
                    if (T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIllllI[4]];
                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[154]];
                        if (T.lllIlllllII(NPCs.getNearest((String[])stringArray)) && T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[6])) {
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[155]];
                            Walker.step((WorldPoint)jS);

                            Time.sleepTicks((int)lIIIllllI[4]);

                        }
                        if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[6])) {
                            String[] stringArray18 = new String[lIIIllllI[4]];
                            stringArray18[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[156]];
                            if (T.lllIlllllII(NPCs.getNearest((String[])stringArray18)) && T.lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] stringArray19 = new String[lIIIllllI[4]];
                                stringArray19[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[157]];
                                TileObjects.getNearest((String[])stringArray19).interact(lIIIlllII[lIIIllllI[158]]);
                            }
                        }
                    }
                    if (T.lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIllllI[4]];
                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[159]];
                        if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                            lIIIlIlllIlllIl = Dialog.getText();
                            if (T.lllIllllIII(lIIIlIlllIlllIl) && T.lllIlllIlIl(lIIIlIlllIlllIl.contains(lIIIlllII[lIIIllllI[160]]) ? 1 : 0)) {
                                kh = lIIIllllI[4];
                            }
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[161]];
                            g.a(lIIIlllII[lIIIllllI[162]], bR);
                        }
                    }
                }
                if (T.lllIlllIlll(ki ? 1 : 0) && T.lllIlllIlIl(kh ? 1 : 0) && T.lllIlllIlIl(kg ? 1 : 0) && T.lllIlllIlIl(kf ? 1 : 0) && T.lllIlllIlIl(ke ? 1 : 0) && T.lllIlllIlIl(kd ? 1 : 0) && T.lllIlllIlIl(kc ? 1 : 0) && T.lllIlllIlIl(kb ? 1 : 0) && T.lllIlllIlIl(ka ? 1 : 0) && T.lllIlllIlIl(jZ ? 1 : 0) && T.lllIlllIlIl(jY ? 1 : 0) && T.lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[163]];
                    if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                        lIIIlIlllIlllIl = Dialog.getText();
                        if (T.lllIllllIII(lIIIlIlllIlllIl) && T.lllIlllIlIl(lIIIlIlllIlllIl.contains(lIIIlllII[lIIIllllI[164]]) ? 1 : 0)) {
                            ki = lIIIllllI[4];
                        }
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[165]];
                        g.a(lIIIlllII[lIIIllllI[166]], bR);
                    }
                }
                g.a(bR);
            }
            if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[54])) {
                if (T.lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[167]];
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[168]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[169]]);
                    Time.sleepTicks((int)lIIIllllI[6]);

                }
                if (T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (T.lllIllllIlI(Players.getLocal().distanceTo(jU), lIIIllllI[6])) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[170]];
                        WorldPoint[] worldPointArray = new WorldPoint[lIIIllllI[8]];
                        worldPointArray[T.lIIIllllI[9]] = new WorldPoint(lIIIllllI[38], lIIIllllI[108], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[4]] = new WorldPoint(lIIIllllI[171], lIIIllllI[172], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[5]] = new WorldPoint(lIIIllllI[173], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[6]] = new WorldPoint(lIIIllllI[174], lIIIllllI[34], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[7]] = new WorldPoint(lIIIllllI[27], lIIIllllI[102], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[11]] = new WorldPoint(lIIIllllI[27], lIIIllllI[125], lIIIllllI[9]);
                        lIIIlIlllIllllI = worldPointArray;
                        Walker.walkAlong(Arrays.asList(lIIIlIlllIllllI), new HashMap());

                        Time.sleepTicks((int)lIIIllllI[4]);

                    }
                    if (T.lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && T.lllIlllIlll(Players.getLocal().getWorldLocation().getPlane()) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIllllI[4]];
                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[175]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[176]]);
                        Time.sleepTicks((int)lIIIllllI[11]);

                    }
                }
                if (T.lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[177]];
                    g.a(lIIIlllII[lIIIllllI[178]], bR);
                }
            }
            if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[59])) {
                if (T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (T.lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIllllI[4]];
                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[179]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[180]]);
                        Time.sleepTicks((int)lIIIllllI[11]);

                    }
                    if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6]) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[181]];
                        WorldPoint[] worldPointArray = new WorldPoint[lIIIllllI[24]];
                        worldPointArray[T.lIIIllllI[9]] = new WorldPoint(lIIIllllI[27], lIIIllllI[33], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[4]] = new WorldPoint(lIIIllllI[27], lIIIllllI[43], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[5]] = new WorldPoint(lIIIllllI[103], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[6]] = new WorldPoint(lIIIllllI[182], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[7]] = new WorldPoint(lIIIllllI[183], lIIIllllI[184], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[11]] = new WorldPoint(lIIIllllI[185], lIIIllllI[109], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[8]] = new WorldPoint(lIIIllllI[186], lIIIllllI[113], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[23]] = new WorldPoint(lIIIllllI[105], lIIIllllI[187], lIIIllllI[9]);
                        lIIIlIlllIllllI = worldPointArray;
                        Walker.walkAlong(Arrays.asList(lIIIlIlllIllllI), new HashMap());

                        Time.sleepTicks((int)lIIIllllI[4]);

                    }
                    if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6])) {
                        String[] stringArray = new String[lIIIllllI[4]];
                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[188]];
                        if (T.lllIlllllII(NPCs.getNearest((String[])stringArray)) && T.lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] stringArray20 = new String[lIIIllllI[4]];
                            stringArray20[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[189]];
                            TileObjects.getNearest((String[])stringArray20).interact(lIIIlllII[lIIIllllI[190]]);
                        }
                    }
                }
                if (T.lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[191]];
                    if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[192]];
                        g.a(lIIIlllII[lIIIllllI[193]], bR);
                    }
                }
            }
            if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[64])) {
                if (T.lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[194]];
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[195]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[196]]);
                    Time.sleepTicks((int)lIIIllllI[6]);

                }
                if (T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[197]];
                    if (T.lllIlllllII(NPCs.getNearest((String[])stringArray)) && T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[5])) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[198]];
                        Walker.step((WorldPoint)jS);

                        Time.sleepTicks((int)lIIIllllI[4]);

                    }
                    if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[5])) {
                        String[] stringArray21 = new String[lIIIllllI[4]];
                        stringArray21[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[199]];
                        if (T.lllIlllllII(NPCs.getNearest((String[])stringArray21)) && T.lllIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] stringArray22 = new String[lIIIllllI[4]];
                            stringArray22[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[200]];
                            TileObjects.getNearest((String[])stringArray22).interact(lIIIlllII[lIIIllllI[201]]);
                        }
                    }
                }
                if (T.lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[202]];
                    if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[203]];
                        g.a(lIIIlllII[lIIIllllI[204]], bR);
                    }
                }
            }
            if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[69])) {
                if (T.lllIlllIlIl(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[205]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[206]]);
                    Time.sleepTicks((int)lIIIllllI[6]);

                }
                if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[207]];
                    if (T.lllIlllllII(NPCs.getNearest((String[])stringArray)) && T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint[] worldPointArray = new WorldPoint[lIIIllllI[17]];
                        worldPointArray[T.lIIIllllI[9]] = new WorldPoint(lIIIllllI[27], lIIIllllI[33], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[4]] = new WorldPoint(lIIIllllI[27], lIIIllllI[34], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[5]] = new WorldPoint(lIIIllllI[35], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[6]] = new WorldPoint(lIIIllllI[37], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[7]] = new WorldPoint(lIIIllllI[38], lIIIllllI[39], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[11]] = new WorldPoint(lIIIllllI[40], lIIIllllI[41], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[8]] = new WorldPoint(lIIIllllI[42], lIIIllllI[43], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[23]] = new WorldPoint(lIIIllllI[44], lIIIllllI[45], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[24]] = new WorldPoint(lIIIllllI[46], lIIIllllI[47], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[25]] = new WorldPoint(lIIIllllI[48], lIIIllllI[49], lIIIllllI[9]);
                        lIIIlIlllIllllI = worldPointArray;
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[208]];
                        Walker.walkAlong(Arrays.asList(lIIIlIlllIllllI), new HashMap());

                        Time.sleepTicks((int)lIIIllllI[4]);

                    }
                }
                if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[209]];
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[210]];
                    if (T.lllIlllllII(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray23 = new String[lIIIllllI[4]];
                        stringArray23[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[211]];
                        TileObjects.getNearest((String[])stringArray23).interact(lIIIlllII[lIIIllllI[212]]);
                        Time.sleepTicks((int)lIIIllllI[6]);

                    }
                }
                String[] stringArray = new String[lIIIllllI[4]];
                stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[213]];
                if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                    g.a(lIIIlllII[lIIIllllI[214]], bR);
                }
            }
            if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[19])) {
                g.a(lIIIlllII[lIIIllllI[215]], bR);
            }
            if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[78])) {
                String[] stringArray = new String[lIIIllllI[4]];
                stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[216]];
                if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                    String[] stringArray24 = new String[lIIIllllI[4]];
                    stringArray24[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[217]];
                    TileObjects.getNearest((String[])stringArray24).interact(lIIIlllII[lIIIllllI[218]]);
                }
                String[] stringArray25 = new String[lIIIllllI[4]];
                stringArray25[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[219]];
                if (T.lllIlllllII(NPCs.getNearest((String[])stringArray25)) && T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[24])) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[220]];
                    int[] nArray = new int[lIIIllllI[4]];
                    nArray[T.lIIIllllI[9]] = lIIIllllI[16];
                    String[] stringArray26 = new String[lIIIllllI[4]];
                    stringArray26[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[221]];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray26));
                    Time.sleepTicks((int)lIIIllllI[7]);

                }
            }
            if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[82])) {
                g.a(bR);
            }
            if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[22])) {
                if (T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (T.lllIllllIlI(Players.getLocal().distanceTo(jU), lIIIllllI[6])) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[222]];
                        Movement.walkTo((WorldPoint)jU);

                        Time.sleepTicks((int)lIIIllllI[4]);

                    }
                    if (T.lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && T.lllIlllIlll(Players.getLocal().getWorldLocation().getPlane()) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIllllI[4]];
                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[223]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[224]]);
                        Time.sleepTicks((int)lIIIllllI[11]);

                    }
                }
                if (T.lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[225]];
                    g.a(lIIIlllII[lIIIllllI[226]], bR);
                }
            }
            if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[84])) {
                if (T.lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[227]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[228]]);
                    Time.sleepTicks((int)lIIIllllI[6]);

                }
                if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[229]];
                    if (T.lllIlllllII(NPCs.getNearest((String[])stringArray)) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint[] worldPointArray = new WorldPoint[lIIIllllI[17]];
                        worldPointArray[T.lIIIllllI[9]] = new WorldPoint(lIIIllllI[27], lIIIllllI[33], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[4]] = new WorldPoint(lIIIllllI[27], lIIIllllI[34], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[5]] = new WorldPoint(lIIIllllI[35], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[6]] = new WorldPoint(lIIIllllI[37], lIIIllllI[36], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[7]] = new WorldPoint(lIIIllllI[38], lIIIllllI[39], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[11]] = new WorldPoint(lIIIllllI[40], lIIIllllI[41], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[8]] = new WorldPoint(lIIIllllI[42], lIIIllllI[43], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[23]] = new WorldPoint(lIIIllllI[44], lIIIllllI[45], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[24]] = new WorldPoint(lIIIllllI[46], lIIIllllI[47], lIIIllllI[9]);
                        worldPointArray[T.lIIIllllI[25]] = new WorldPoint(lIIIllllI[48], lIIIllllI[49], lIIIllllI[9]);
                        lIIIlIlllIllllI = worldPointArray;
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[230]];
                        Walker.walkAlong(Arrays.asList(lIIIlIlllIllllI), new HashMap());

                        Time.sleepTicks((int)lIIIllllI[4]);

                    }
                }
                if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(jR), lIIIllllI[11])) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[231]];
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[232]];
                    if (T.lllIlllllII(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray27 = new String[lIIIllllI[4]];
                        stringArray27[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[233]];
                        TileObjects.getNearest((String[])stringArray27).interact(lIIIlllII[lIIIllllI[234]]);
                        Time.sleepTicks((int)lIIIllllI[6]);

                    }
                }
                String[] stringArray = new String[lIIIllllI[4]];
                stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[235]];
                if (T.lllIllllIII(NPCs.getNearest((String[])stringArray))) {
                    int[] nArray = new int[lIIIllllI[4]];
                    nArray[T.lIIIllllI[9]] = lIIIllllI[21];
                    if (T.lllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIIllllI[4]];
                        nArray3[T.lIIIllllI[9]] = lIIIllllI[21];
                        if (T.lllIlllIlll(Equipment.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIIIllllI[4]];
                            nArray4[T.lIIIllllI[9]] = lIIIllllI[21];
                            Inventory.getFirst((int[])nArray4).interact(lIIIlllII[lIIIllllI[236]]);
                        }
                    }
                    int[] nArray5 = new int[lIIIllllI[4]];
                    nArray5[T.lIIIllllI[9]] = lIIIllllI[21];
                    if (T.lllIlllIlll(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                        e.l(lIIIllllI[20]);
                    }
                    if (T.lllIlllllIl(T.lllIlllIIll(e.u(), 55.0))) {
                        int[] nArray6 = new int[lIIIllllI[4]];
                        nArray6[T.lIIIllllI[9]] = lIIIllllI[18];
                        if (T.lllIlllIlIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[lIIIllllI[4]];
                            nArray7[T.lIIIllllI[9]] = lIIIllllI[18];
                            Inventory.getFirst((int[])nArray7).interact(lIIIlllII[lIIIllllI[237]]);
                            Time.sleepTicks((int)lIIIllllI[4]);

                        }
                    }
                    if (T.lllIlllllII(Players.getLocal().getInteracting())) {
                        String[] stringArray28 = new String[lIIIllllI[4]];
                        stringArray28[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[238]];
                        NPCs.getNearest((String[])stringArray28).interact(lIIIlllII[lIIIllllI[239]]);
                        Time.sleepTicks((int)lIIIllllI[5]);

                    }
                }
            }
            if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[87])) {
                String[] stringArray = new String[lIIIllllI[4]];
                stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[240]];
                if (T.lllIllllIII(TileObjects.getNearest((String[])stringArray)) && T.lllIlllIlII(Players.getLocal().getWorldLocation().getPlane(), lIIIllllI[4])) {
                    String[] stringArray29 = new String[lIIIllllI[4]];
                    stringArray29[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[241]];
                    TileObjects.getNearest((String[])stringArray29).interact(lIIIlllII[lIIIllllI[242]]);
                    Time.sleepTicks((int)lIIIllllI[6]);

                }
                if (T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (T.lllIllllIlI(Players.getLocal().distanceTo(jU), lIIIllllI[6])) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[243]];
                        Movement.walkTo((WorldPoint)jU);

                        Time.sleepTicks((int)lIIIllllI[4]);

                    }
                    if (T.lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && T.lllIlllIlll(Players.getLocal().getWorldLocation().getPlane())) {
                        String[] stringArray30 = new String[lIIIllllI[4]];
                        stringArray30[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[244]];
                        TileObjects.getNearest((String[])stringArray30).interact(lIIIlllII[lIIIllllI[245]]);
                        Time.sleepTicks((int)lIIIllllI[6]);

                    }
                }
                if (T.lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[246]];
                    if (T.lllIlllIllI(cl, lIIIllllI[4])) {
                        an.pQ += lIIIllllI[4];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIIIllllI[4];
                        an.pQ = lIIIllllI[9];
                        cm = lIIIllllI[9];
                    }
                    g.a(lIIIlllII[lIIIllllI[247]], bR);
                }
            }
            if (T.lllIlllIlII(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[92])) {
                int[] nArray = new int[lIIIllllI[4]];
                nArray[T.lIIIllllI[9]] = lIIIllllI[12];
                if (T.lllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0) && T.lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray8 = new int[lIIIllllI[4]];
                    nArray8[T.lIIIllllI[9]] = lIIIllllI[12];
                    Inventory.getFirst((int[])nArray8).interact(lIIIlllII[lIIIllllI[248]]);
                    Time.sleepTicks((int)lIIIllllI[11]);

                }
            }
            g.a(bR);
        }
    }

    private static boolean lllIlllllII(Object object) {
        return object == null;
    }

    private static boolean lllIlllIlll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(lIIIlIllIlllIII);
    }

    @Override
    public int THelper() {
        try {
            T.cZ();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIllllI[146];
    }

    private static boolean lllIlllIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllIllIlllI() {
        lIIIlllII = new String[lIIIllllI[285]];
        T.lIIIlllII[T.lIIIllllI[9]] = "Finished buying items, switching back to quest";
        T.lIIIlllII[T.lIIIllllI[4]] = "Nav to bank";
        T.lIIIlllII[T.lIIIllllI[5]] = "Handling banking";
        T.lIIIlllII[T.lIIIllllI[6]] = "We are missing quest supplies, switching to BUYING";
        T.lIIIlllII[T.lIIIllllI[7]] = "Drink";
        T.lIIIlllII[T.lIIIllllI[11]] = "Nav to start";
        T.lIIIlllII[T.lIIIllllI[8]] = "Start quest";
        T.lIIIlllII[T.lIIIllllI[23]] = "Captain Tock";
        T.lIIIlllII[T.lIIIllllI[24]] = "Nav to boat";
        T.lIIIlllII[T.lIIIllllI[25]] = "talk npc";
        T.lIIIlllII[T.lIIIllllI[17]] = "Captain Tock";
        T.lIIIlllII[T.lIIIllllI[29]] = "Gangplank";
        T.lIIIlllII[T.lIIIllllI[30]] = "Cross";
        T.lIIIlllII[T.lIIIllllI[31]] = "Gangplank";
        T.lIIIlllII[T.lIIIllllI[32]] = "Cross";
        T.lIIIlllII[T.lIIIllllI[26]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[50]] = "Nav to ithoiTile";
        T.lIIIlllII[T.lIIIllllI[51]] = "talk npc";
        T.lIIIlllII[T.lIIIllllI[52]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[53]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[54]] = "Climb";
        T.lIIIlllII[T.lIIIllllI[55]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[56]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[57]] = "curses are real";
        T.lIIIlllII[T.lIIIllllI[58]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[59]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[60]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[61]] = "Climb";
        T.lIIIlllII[T.lIIIllllI[62]] = "Climb down gnocci stairs";
        T.lIIIlllII[T.lIIIllllI[63]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[64]] = "Climb-down";
        T.lIIIlllII[T.lIIIllllI[65]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[66]] = "Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[67]] = "Nav to Arsen";
        T.lIIIlllII[T.lIIIllllI[68]] = "Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[69]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[70]] = "Climb-up";
        T.lIIIlllII[T.lIIIllllI[71]] = "Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[72]] = "Have you got that relic back from";
        T.lIIIlllII[T.lIIIllllI[73]] = "Talk npc";
        T.lIIIlllII[T.lIIIllllI[19]] = "Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[74]] = "Cabin Boy Colin";
        T.lIIIlllII[T.lIIIllllI[75]] = "Where did you find";
        T.lIIIlllII[T.lIIIllllI[76]] = "Talk npc";
        T.lIIIlllII[T.lIIIllllI[77]] = "Cabin Boy Colin";
        T.lIIIlllII[T.lIIIllllI[78]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[79]] = "Climb-down";
        T.lIIIlllII[T.lIIIllllI[80]] = "Nav to Gnocci";
        T.lIIIlllII[T.lIIIllllI[81]] = "Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[82]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[22]] = "Climb-up";
        T.lIIIlllII[T.lIIIllllI[83]] = "Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[84]] = "Where did you say this";
        T.lIIIlllII[T.lIIIllllI[85]] = "talkedGnocci";
        T.lIIIlllII[T.lIIIllllI[86]] = "Talk npc";
        T.lIIIlllII[T.lIIIllllI[87]] = "Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[88]] = "Climbing stairs";
        T.lIIIlllII[T.lIIIllllI[89]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[90]] = "Climb-down";
        T.lIIIlllII[T.lIIIllllI[91]] = "Nav to boat";
        T.lIIIlllII[T.lIIIllllI[92]] = "Gangplank";
        T.lIIIlllII[T.lIIIllllI[93]] = "Cross";
        T.lIIIlllII[T.lIIIllllI[94]] = "talk npc";
        T.lIIIlllII[T.lIIIllllI[95]] = "Captain Tock";
        T.lIIIlllII[T.lIIIllllI[96]] = "About that sacred ogre";
        T.lIIIlllII[T.lIIIllllI[97]] = "talkedCaptain";
        T.lIIIlllII[T.lIIIllllI[98]] = "Gangplank";
        T.lIIIlllII[T.lIIIllllI[99]] = "Cross";
        T.lIIIlllII[T.lIIIllllI[100]] = "Chief Tess";
        T.lIIIlllII[T.lIIIllllI[101]] = "Nav to hole";
        T.lIIIlllII[T.lIIIllllI[114]] = "Hole";
        T.lIIIlllII[T.lIIIllllI[115]] = "Enter";
        T.lIIIlllII[T.lIIIllllI[116]] = "Chief Tess";
        T.lIIIlllII[T.lIIIllllI[117]] = "talk npc";
        T.lIIIlllII[T.lIIIllllI[118]] = "Chief Tess";
        T.lIIIlllII[T.lIIIllllI[119]] = "you never cursed the";
        T.lIIIlllII[T.lIIIllllI[120]] = "talkedChief";
        T.lIIIlllII[T.lIIIllllI[121]] = "Chief Tess";
        T.lIIIlllII[T.lIIIllllI[122]] = "Vine ladder";
        T.lIIIlllII[T.lIIIllllI[123]] = "Climb";
        T.lIIIlllII[T.lIIIllllI[126]] = "Chief Tess";
        T.lIIIlllII[T.lIIIllllI[127]] = "Nav to dig";
        T.lIIIlllII[T.lIIIllllI[128]] = "Spade";
        T.lIIIlllII[T.lIIIllllI[129]] = "Dig";
        T.lIIIlllII[T.lIIIllllI[130]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[131]] = "Nav to ithoii";
        T.lIIIlllII[T.lIIIllllI[132]] = "Telescope";
        T.lIIIlllII[T.lIIIllllI[133]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[134]] = "Climb";
        T.lIIIlllII[T.lIIIllllI[135]] = "Telescope";
        T.lIIIlllII[T.lIIIllllI[136]] = "look telescope ";
        T.lIIIlllII[T.lIIIllllI[137]] = "Telescope";
        T.lIIIlllII[T.lIIIllllI[138]] = "Observe";
        T.lIIIlllII[T.lIIIllllI[139]] = "Telescope";
        T.lIIIlllII[T.lIIIllllI[140]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[141]] = "Climb";
        T.lIIIlllII[T.lIIIllllI[142]] = "Telescope";
        T.lIIIlllII[T.lIIIllllI[143]] = "Nav to Gnocci";
        T.lIIIlllII[T.lIIIllllI[144]] = "Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[145]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[146]] = "Climb-up";
        T.lIIIlllII[T.lIIIllllI[147]] = "Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[148]] = "Talk npc";
        T.lIIIlllII[T.lIIIllllI[149]] = "Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[150]] = "you found the source";
        T.lIIIlllII[T.lIIIllllI[151]] = "Climb down gnocci stairs";
        T.lIIIlllII[T.lIIIllllI[152]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[153]] = "Climb-down";
        T.lIIIlllII[T.lIIIllllI[154]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[155]] = "Nav to Arsen";
        T.lIIIlllII[T.lIIIllllI[156]] = "Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[157]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[158]] = "Climb-up";
        T.lIIIlllII[T.lIIIllllI[159]] = "Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[160]] = "curse on us by stealing";
        T.lIIIlllII[T.lIIIllllI[161]] = "Talk npc";
        T.lIIIlllII[T.lIIIllllI[162]] = "Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[163]] = "Cabin Boy Colin";
        T.lIIIlllII[T.lIIIllllI[164]] = "you found out how we";
        T.lIIIlllII[T.lIIIllllI[165]] = "Talk npc";
        T.lIIIlllII[T.lIIIllllI[166]] = "Cabin Boy Colin";
        T.lIIIlllII[T.lIIIllllI[167]] = "Climbing stairs";
        T.lIIIlllII[T.lIIIllllI[168]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[169]] = "Climb-down";
        T.lIIIlllII[T.lIIIllllI[170]] = "Nav to boat";
        T.lIIIlllII[T.lIIIllllI[175]] = "Gangplank";
        T.lIIIlllII[T.lIIIllllI[176]] = "Cross";
        T.lIIIlllII[T.lIIIllllI[177]] = "talk npc";
        T.lIIIlllII[T.lIIIllllI[178]] = "Captain Tock";
        T.lIIIlllII[T.lIIIllllI[179]] = "Gangplank";
        T.lIIIlllII[T.lIIIllllI[180]] = "Cross";
        T.lIIIlllII[T.lIIIllllI[181]] = "Nav to Gnocci";
        T.lIIIlllII[T.lIIIllllI[188]] = "Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[189]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[190]] = "Climb-up";
        T.lIIIlllII[T.lIIIllllI[191]] = "Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[192]] = "Talk npc";
        T.lIIIlllII[T.lIIIllllI[193]] = "Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[194]] = "Walk down gnocci stairs";
        T.lIIIlllII[T.lIIIllllI[195]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[196]] = "Climb-down";
        T.lIIIlllII[T.lIIIllllI[197]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[198]] = "Nav to Arsen";
        T.lIIIlllII[T.lIIIllllI[199]] = "Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[200]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[201]] = "Climb-up";
        T.lIIIlllII[T.lIIIllllI[202]] = "Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[203]] = "Talk npc";
        T.lIIIlllII[T.lIIIllllI[204]] = "Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[205]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[206]] = "Climb-down";
        T.lIIIlllII[T.lIIIllllI[207]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[208]] = "Nav to ithoiTile";
        T.lIIIlllII[T.lIIIllllI[209]] = "talk npc";
        T.lIIIlllII[T.lIIIllllI[210]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[211]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[212]] = "Climb";
        T.lIIIlllII[T.lIIIllllI[213]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[214]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[215]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[216]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[217]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[218]] = "Climb";
        T.lIIIlllII[T.lIIIllllI[219]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[220]] = "Burning hut";
        T.lIIIlllII[T.lIIIllllI[221]] = "Driftwood";
        T.lIIIlllII[T.lIIIllllI[222]] = "Nav to boat";
        T.lIIIlllII[T.lIIIllllI[223]] = "Gangplank";
        T.lIIIlllII[T.lIIIllllI[224]] = "Cross";
        T.lIIIlllII[T.lIIIllllI[225]] = "talk npc";
        T.lIIIlllII[T.lIIIllllI[226]] = "Captain Tock";
        T.lIIIlllII[T.lIIIllllI[227]] = "Gangplank";
        T.lIIIlllII[T.lIIIllllI[228]] = "Cross";
        T.lIIIlllII[T.lIIIllllI[229]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[230]] = "Nav to ithoiTile";
        T.lIIIlllII[T.lIIIllllI[231]] = "kill npc";
        T.lIIIlllII[T.lIIIllllI[232]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[233]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[234]] = "Climb";
        T.lIIIlllII[T.lIIIllllI[235]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[236]] = "Wield";
        T.lIIIlllII[T.lIIIllllI[237]] = "Eat";
        T.lIIIlllII[T.lIIIllllI[238]] = "Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[239]] = "Attack";
        T.lIIIlllII[T.lIIIllllI[240]] = "Telescope";
        T.lIIIlllII[T.lIIIllllI[241]] = "Stairs";
        T.lIIIlllII[T.lIIIllllI[242]] = "Climb";
        T.lIIIlllII[T.lIIIllllI[243]] = "Nav to boat";
        T.lIIIlllII[T.lIIIllllI[244]] = "Gangplank";
        T.lIIIlllII[T.lIIIllllI[245]] = "Cross";
        T.lIIIlllII[T.lIIIllllI[246]] = "talk npc";
        T.lIIIlllII[T.lIIIllllI[247]] = "Captain Tock";
        T.lIIIlllII[T.lIIIllllI[248]] = "Break";
        T.lIIIlllII[T.lIIIllllI[255]] = "The Corsair Curse";
        T.lIIIlllII[T.lIIIllllI[256]] = "ring of wealth (";
        T.lIIIlllII[T.lIIIllllI[267]] = "Yes.";
        T.lIIIlllII[T.lIIIllllI[268]] = "What kind of help do you need?";
        T.lIIIlllII[T.lIIIllllI[269]] = "Okay, I'm ready to go to Corsair Cove.";
        T.lIIIlllII[T.lIIIllllI[270]] = "Okay, I'm ready go to Corsair Cove.";
        T.lIIIlllII[T.lIIIllllI[271]] = "I hear you've been cursed.";
        T.lIIIlllII[T.lIIIllllI[272]] = "Arsen says he gave you a sacred ogre relic.";
        T.lIIIlllII[T.lIIIllllI[273]] = "I've come to return what Arsen stole.";
        T.lIIIlllII[T.lIIIllllI[274]] = "Search for the possessed doll and face the consequences.";
        T.lIIIlllII[T.lIIIllllI[275]] = "I've ruled out all the Corsairs' theories...";
        T.lIIIlllII[T.lIIIllllI[276]] = "So what do I do now?";
        T.lIIIlllII[T.lIIIllllI[277]] = "I hear it happened straight after dinner.";
        T.lIIIlllII[T.lIIIllllI[278]] = "I hear Ithoi cooked the meal you ate that night.";
        T.lIIIlllII[T.lIIIllllI[279]] = "I hear you cooked the meal they ate before getting sick.";
        T.lIIIlllII[T.lIIIllllI[280]] = "I hear you cooked the meal they ate before getting sick.";
        T.lIIIlllII[T.lIIIllllI[281]] = "Maybe because the Captain's thinking of firing you.";
        T.lIIIlllII[T.lIIIllllI[282]] = "I know you've faked the curse.";
        T.lIIIlllII[T.lIIIllllI[283]] = "I've seen Ithoi running around. He's not sick at all.";
        T.lIIIlllII[T.lIIIllllI[284]] = "I've killed Ithoi for poisoning your crew.";
    }

    private static boolean lllIlllllIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean V() {
        int n2;
        if (T.lllIllllllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[92]) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lIIIllllI[4];

            if (1 < 1) {
                return false;
            }
        } else {
            n2 = lIIIllllI[9];
        }
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIIIlllII[lIIIllllI[255]];
    }

    static {
        T.lllIlllIIlI();
        T.lllIllIlllI();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIIIllllI[257], lIIIllllI[258], lIIIllllI[9]);
        jQ = new WorldPoint(lIIIllllI[259], lIIIllllI[260], lIIIllllI[9]);
        jR = new WorldPoint(lIIIllllI[48], lIIIllllI[49], lIIIllllI[9]);
        jS = new WorldPoint(lIIIllllI[186], lIIIllllI[109], lIIIllllI[9]);
        jT = new WorldPoint(lIIIllllI[105], lIIIllllI[187], lIIIllllI[9]);
        jU = new WorldPoint(lIIIllllI[27], lIIIllllI[125], lIIIllllI[9]);
        cj = new WorldPoint(lIIIllllI[112], lIIIllllI[261], lIIIllllI[9]);
        jV = new WorldArea(lIIIllllI[262], lIIIllllI[36], lIIIllllI[17], lIIIllllI[25], lIIIllllI[4]);
        jW = new WorldArea(lIIIllllI[263], lIIIllllI[264], lIIIllllI[25], lIIIllllI[25], lIIIllllI[4]);
        jX = new WorldArea(lIIIllllI[265], lIIIllllI[266], lIIIllllI[26], lIIIllllI[25], lIIIllllI[4]);
        String[] stringArray = new String[lIIIllllI[52]];
        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[267]];
        stringArray[T.lIIIllllI[4]] = lIIIlllII[lIIIllllI[268]];
        stringArray[T.lIIIllllI[5]] = lIIIlllII[lIIIllllI[269]];
        stringArray[T.lIIIllllI[6]] = lIIIlllII[lIIIllllI[270]];
        stringArray[T.lIIIllllI[7]] = lIIIlllII[lIIIllllI[271]];
        stringArray[T.lIIIllllI[11]] = lIIIlllII[lIIIllllI[272]];
        stringArray[T.lIIIllllI[8]] = lIIIlllII[lIIIllllI[273]];
        stringArray[T.lIIIllllI[23]] = lIIIlllII[lIIIllllI[274]];
        stringArray[T.lIIIllllI[24]] = lIIIlllII[lIIIllllI[275]];
        stringArray[T.lIIIllllI[25]] = lIIIlllII[lIIIllllI[276]];
        stringArray[T.lIIIllllI[17]] = lIIIlllII[lIIIllllI[277]];
        stringArray[T.lIIIllllI[29]] = lIIIlllII[lIIIllllI[278]];
        stringArray[T.lIIIllllI[30]] = lIIIlllII[lIIIllllI[279]];
        stringArray[T.lIIIllllI[31]] = lIIIlllII[lIIIllllI[280]];
        stringArray[T.lIIIllllI[32]] = lIIIlllII[lIIIllllI[281]];
        stringArray[T.lIIIllllI[26]] = lIIIlllII[lIIIllllI[282]];
        stringArray[T.lIIIllllI[50]] = lIIIlllII[lIIIllllI[283]];
        stringArray[T.lIIIllllI[51]] = lIIIlllII[lIIIllllI[284]];
        bR = stringArray;
        kk = lIIIllllI[9];
    }

    @Override
    public boolean S() {
        return lIIIllllI[9];
    }

    private static boolean lllIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlllIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIllllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lllIllllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIllllIII(Object object) {
        return object != null;
    }

    private static boolean lllIllllllI(int n2, int n3) {
        return n2 >= n3;
    }
}

