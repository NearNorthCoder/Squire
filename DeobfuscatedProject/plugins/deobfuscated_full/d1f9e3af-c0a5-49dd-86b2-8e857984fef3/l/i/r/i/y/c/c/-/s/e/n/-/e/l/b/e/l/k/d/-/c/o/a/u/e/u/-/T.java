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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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

public class T
implements W {
    static /* synthetic */ boolean kg;
    static /* synthetic */ boolean kh;
    static /* synthetic */ boolean ke;
    static /* synthetic */ boolean jZ;
    private static /* synthetic */ int[] lIIIllllI;
    static /* synthetic */ boolean kb;
    static /* synthetic */ boolean kd;
    static /* synthetic */ WorldPoint jT;
    static /* synthetic */ boolean ka;
    static /* synthetic */ String[] bR;
    static /* synthetic */ boolean kj;
    static /* synthetic */ WorldPoint jR;
    static /* synthetic */ boolean ki;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int cl;
    static /* synthetic */ boolean kf;
    static /* synthetic */ WorldArea jV;
    static /* synthetic */ boolean cm;
    static /* synthetic */ WorldPoint jU;
    static /* synthetic */ WorldPoint bX;
    static /* synthetic */ boolean kc;
    static /* synthetic */ WorldPoint cj;
    static /* synthetic */ int kk;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ WorldArea jX;
    private static /* synthetic */ String[] lIIIlllII;
    static /* synthetic */ WorldArea jW;
    static /* synthetic */ WorldPoint jS;
    static /* synthetic */ boolean jY;
    static /* synthetic */ WorldPoint jQ;

    private static String lllIlIlllII(String lIIIlIlllIIlIlI, String lIIIlIlllIIlIIl) {
        try {
            SecretKeySpec lIIIlIlllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIlllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIIIllllI[24]), "DES");
            Cipher lIIIlIlllIIllII = Cipher.getInstance("DES");
            lIIIlIlllIIllII.init(lIIIllllI[5], lIIIlIlllIIllIl);
            return new String(lIIIlIlllIIllII.doFinal(Base64.getDecoder().decode(lIIIlIlllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIlllIIlIll) {
            lIIIlIlllIIlIll.printStackTrace();
            return null;
        }
    }

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
            0;
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
                    lIIIlIlllIlIlIl = new d(lIIIllllI[18], lIIIllllI[54], lIIIllllI[249]);
                    bv.add((d)lIIIlIlllIlIlIl);
                    0;
                }
                int[] nArray = new int[lIIIllllI[4]];
                nArray[T.lIIIllllI[9]] = lIIIllllI[21];
                if (T.lllIlllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    lIIIlIlllIlIlIl = new d(lIIIllllI[21], lIIIllllI[4], lIIIllllI[250]);
                    bv.add((d)lIIIlIlllIlIlIl);
                    0;
                }
                int[] nArray4 = new int[lIIIllllI[4]];
                nArray4[T.lIIIllllI[9]] = lIIIllllI[13];
                if (T.lllIlllIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIIIlIlllIlIlIl = new d(lIIIllllI[13], lIIIllllI[54], lIIIllllI[251]);
                    bv.add((d)lIIIlIlllIlIlIl);
                    0;
                }
                if (T.lllIlllIlll(Bank.contains((Predicate)(lIIIlIlllIlIlIl = item -> item.getName().toLowerCase().contains(lIIIlllII[lIIIllllI[256]]))) ? 1 : 0)) {
                    lIIIlIlllIlIlII = new d(lIIIllllI[252], lIIIllllI[11], lIIIllllI[253]);
                    bv.add(lIIIlIlllIlIlII);
                    0;
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
            lIIIlIlllIlIlII = new d(lIIIllllI[15], lIIIllllI[7], i.bq);
            bv.add(lIIIlIlllIlIlII);
            0;
        }
        int[] nArray = new int[lIIIllllI[4]];
        nArray[T.lIIIllllI[9]] = lIIIllllI[12];
        if (T.lllIlllIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIlIlllIlIlII = new d(lIIIllllI[12], lIIIllllI[19], lIIIllllI[254]);
            bv.add(lIIIlIlllIlIlII);
            0;
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
                                            0;
                                        }
                                        if (T.lllIlllIlIl(Bank.isOpen() ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[5]];
                                            if (T.lllIllllIIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIllllI[7]);
                                                0;
                                            }
                                            if (T.lllIllllIIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIllllI[5]);
                                                0;
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
                                                    0;
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
                                    0;
                                }
                                if (T.lllIlllIlIl(T.ab() ? 1 : 0) && T.lllIlllIlll(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()))) {
                                    if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIllllI[17])) {
                                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[11]];
                                        if (T.lllIlllIlIl(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)bX);
                                        0;
                                        Time.sleepTicks((int)lIIIllllI[4]);
                                        0;
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
                                        0;
                                        Time.sleepTicks((int)lIIIllllI[4]);
                                        0;
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
                                    0;
                                }
                                if (T.lllIlllIlll(jY ? 1 : 0)) {
                                    if (T.lllIlllIlIl(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        String[] stringArray = new String[lIIIllllI[4]];
                                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[31]];
                                        TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[32]]);
                                        Time.sleepTicks((int)lIIIllllI[6]);
                                        0;
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
                                            0;
                                            Time.sleepTicks((int)lIIIllllI[4]);
                                            0;
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
                                            0;
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
                                        0;
                                    }
                                    if (T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        if (T.lllIlllIlIl(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[62]];
                                            String[] stringArray4 = new String[lIIIllllI[4]];
                                            stringArray4[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[63]];
                                            TileObjects.getNearest((String[])stringArray4).interact(lIIIlllII[lIIIllllI[64]]);
                                            Time.sleepTicks((int)lIIIllllI[6]);
                                            0;
                                        }
                                        String[] stringArray5 = new String[lIIIllllI[4]];
                                        stringArray5[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[65]];
                                        if (T.lllIlllllII(NPCs.getNearest((String[])stringArray5)) && T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[6])) {
                                            String[] stringArray6 = new String[lIIIllllI[4]];
                                            stringArray6[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[66]];
                                            if (T.lllIlllllII(NPCs.getNearest((String[])stringArray6))) {
                                                AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[67]];
                                                Movement.walkTo((WorldPoint)jS);
                                                0;
                                                Time.sleepTicks((int)lIIIllllI[4]);
                                                0;
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
                                            0;
                                        }
                                        if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6]) && T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[80]];
                                            Movement.walkTo((WorldPoint)jT);
                                            0;
                                            Time.sleepTicks((int)lIIIllllI[4]);
                                            0;
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
                                                    0;
                                                    
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
                                        0;
                                    }
                                    if (T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        if (T.lllIllllIlI(Players.getLocal().distanceTo(jU), lIIIllllI[6])) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[91]];
                                            Movement.walkTo((WorldPoint)jU);
                                            0;
                                            Time.sleepTicks((int)lIIIllllI[4]);
                                            0;
                                        }
                                        if (T.lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && T.lllIlllIlll(Players.getLocal().getWorldLocation().getPlane()) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                            String[] stringArray = new String[lIIIllllI[4]];
                                            stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[92]];
                                            TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[93]]);
                                            Time.sleepTicks((int)lIIIllllI[8]);
                                            0;
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
                                                0;
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
                                        0;
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
                                                0;
                                                Time.sleepTicks((int)lIIIllllI[4]);
                                                0;
                                            }
                                            if (T.lllIllllIll(Players.getLocal().getWorldLocation().distanceTo(cj), lIIIllllI[7])) {
                                                String[] stringArray11 = new String[lIIIllllI[4]];
                                                stringArray11[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[114]];
                                                TileObjects.getNearest((String[])stringArray11).interact(lIIIlllII[lIIIllllI[115]]);
                                                Time.sleepTicks((int)lIIIllllI[6]);
                                                0;
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
                                                0;
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
                                        0;
                                    }
                                    lIIIlIlllIlllIl = new WorldPoint(lIIIllllI[124], lIIIllllI[125], lIIIllllI[9]);
                                    String[] stringArray13 = new String[lIIIllllI[4]];
                                    stringArray13[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[126]];
                                    if (T.lllIlllllII(NPCs.getNearest((String[])stringArray13))) {
                                        if (T.lllIlllIlll(Players.getLocal().getWorldLocation().equals(lIIIlIlllIlllIl) ? 1 : 0)) {
                                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[127]];
                                            Movement.walkTo((WorldPoint)lIIIlIlllIlllIl);
                                            0;
                                            Time.sleepTicks((int)lIIIllllI[4]);
                                            0;
                                        }
                                        if (T.lllIlllIlIl(Players.getLocal().getWorldLocation().equals(lIIIlIlllIlllIl) ? 1 : 0) && T.lllIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                                            if (T.lllIlllIllI(kk, lIIIllllI[5])) {
                                                String[] stringArray14 = new String[lIIIllllI[4]];
                                                stringArray14[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[128]];
                                                Inventory.getFirst((String[])stringArray14).interact(lIIIlllII[lIIIllllI[129]]);
                                                Time.sleepTicks((int)lIIIllllI[7]);
                                                0;
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
                                            0;
                                            Time.sleepTicks((int)lIIIllllI[4]);
                                            0;
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
                                            0;
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
                                            0;
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
                            0;
                        }
                        if (T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jT), lIIIllllI[6]) && T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIllllI[4]];
                            stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[142]];
                            if (T.lllIlllllII(TileObjects.getNearest((String[])stringArray))) {
                                AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[143]];
                                Movement.walkTo((WorldPoint)jT);
                                0;
                                Time.sleepTicks((int)lIIIllllI[4]);
                                0;
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
                        0;
                    }
                    if (T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIllllI[4]];
                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[154]];
                        if (T.lllIlllllII(NPCs.getNearest((String[])stringArray)) && T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[6])) {
                            AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[155]];
                            Walker.step((WorldPoint)jS);
                            0;
                            Time.sleepTicks((int)lIIIllllI[4]);
                            0;
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
                    0;
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
                        0;
                        Time.sleepTicks((int)lIIIllllI[4]);
                        0;
                    }
                    if (T.lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && T.lllIlllIlll(Players.getLocal().getWorldLocation().getPlane()) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIllllI[4]];
                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[175]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[176]]);
                        Time.sleepTicks((int)lIIIllllI[11]);
                        0;
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
                        0;
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
                        0;
                        Time.sleepTicks((int)lIIIllllI[4]);
                        0;
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
                    0;
                }
                if (T.lllIlllIlll(jV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllllI[4]];
                    stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[197]];
                    if (T.lllIlllllII(NPCs.getNearest((String[])stringArray)) && T.lllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(jS), lIIIllllI[5])) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[198]];
                        Walker.step((WorldPoint)jS);
                        0;
                        Time.sleepTicks((int)lIIIllllI[4]);
                        0;
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
                    0;
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
                        0;
                        Time.sleepTicks((int)lIIIllllI[4]);
                        0;
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
                        0;
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
                    0;
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
                        0;
                        Time.sleepTicks((int)lIIIllllI[4]);
                        0;
                    }
                    if (T.lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && T.lllIlllIlll(Players.getLocal().getWorldLocation().getPlane()) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIIllllI[4]];
                        stringArray[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[223]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlllII[lIIIllllI[224]]);
                        Time.sleepTicks((int)lIIIllllI[11]);
                        0;
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
                    0;
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
                        0;
                        Time.sleepTicks((int)lIIIllllI[4]);
                        0;
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
                        0;
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
                            0;
                        }
                    }
                    if (T.lllIlllllII(Players.getLocal().getInteracting())) {
                        String[] stringArray28 = new String[lIIIllllI[4]];
                        stringArray28[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[238]];
                        NPCs.getNearest((String[])stringArray28).interact(lIIIlllII[lIIIllllI[239]]);
                        Time.sleepTicks((int)lIIIllllI[5]);
                        0;
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
                    0;
                }
                if (T.lllIlllIlll(jW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (T.lllIllllIlI(Players.getLocal().distanceTo(jU), lIIIllllI[6])) {
                        AccBuilderEasyClues.c = lIIIlllII[lIIIllllI[243]];
                        Movement.walkTo((WorldPoint)jU);
                        0;
                        Time.sleepTicks((int)lIIIllllI[4]);
                        0;
                    }
                    if (T.lllIllllIll(Players.getLocal().distanceTo(jU), lIIIllllI[6]) && T.lllIlllIlll(Players.getLocal().getWorldLocation().getPlane())) {
                        String[] stringArray30 = new String[lIIIllllI[4]];
                        stringArray30[T.lIIIllllI[9]] = lIIIlllII[lIIIllllI[244]];
                        TileObjects.getNearest((String[])stringArray30).interact(lIIIlllII[lIIIllllI[245]]);
                        Time.sleepTicks((int)lIIIllllI[6]);
                        0;
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
                    0;
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

    private static String lllIlIllIll(String lIIIlIllIlllIlI, String lIIIlIllIllIlII) {
        lIIIlIllIlllIlI = new String(Base64.getDecoder().decode(lIIIlIllIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlIllIlllIII = new StringBuilder();
        char[] lIIIlIllIllIlll = lIIIlIllIllIlII.toCharArray();
        int lIIIlIllIllIllI = lIIIllllI[9];
        char[] lIIIlIllIllIIII = lIIIlIllIlllIlI.toCharArray();
        int lIIIlIllIlIllll = lIIIlIllIllIIII.length;
        int lIIIlIllIlIlllI = lIIIllllI[9];
        while (T.lllIlllIllI(lIIIlIllIlIlllI, lIIIlIllIlIllll)) {
            char lIIIlIllIlllIll = lIIIlIllIllIIII[lIIIlIllIlIlllI];
            lIIIlIllIlllIII.append((char)(lIIIlIllIlllIll ^ lIIIlIllIllIlll[lIIIlIllIllIllI % lIIIlIllIllIlll.length]));
            0;
            ++lIIIlIllIllIllI;
            ++lIIIlIllIlIlllI;
            0;
            if (((0x26 ^ 0x1D) & ~(0x76 ^ 0x4D)) <= ((0x5E ^ 0x7B) & ~(0x29 ^ 0xC))) continue;
            return null;
        }
        return String.valueOf(lIIIlIllIlllIII);
    }

    @Override
    public int T() {
        try {
            T.cZ();
            0;
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
        T.lIIIlllII[T.lIIIllllI[9]] = T."Finished buying items, switching back to quest";
        T.lIIIlllII[T.lIIIllllI[4]] = T."Nav to bank";
        T.lIIIlllII[T.lIIIllllI[5]] = T."Handling banking";
        T.lIIIlllII[T.lIIIllllI[6]] = T."We are missing quest supplies, switching to BUYING";
        T.lIIIlllII[T.lIIIllllI[7]] = T."Drink";
        T.lIIIlllII[T.lIIIllllI[11]] = T."Nav to start";
        T.lIIIlllII[T.lIIIllllI[8]] = T."Start quest";
        T.lIIIlllII[T.lIIIllllI[23]] = T."Captain Tock";
        T.lIIIlllII[T.lIIIllllI[24]] = T."Nav to boat";
        T.lIIIlllII[T.lIIIllllI[25]] = T."talk npc";
        T.lIIIlllII[T.lIIIllllI[17]] = T."Captain Tock";
        T.lIIIlllII[T.lIIIllllI[29]] = T."Gangplank";
        T.lIIIlllII[T.lIIIllllI[30]] = T."Cross";
        T.lIIIlllII[T.lIIIllllI[31]] = T."Gangplank";
        T.lIIIlllII[T.lIIIllllI[32]] = T."Cross";
        T.lIIIlllII[T.lIIIllllI[26]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[50]] = T."Nav to ithoiTile";
        T.lIIIlllII[T.lIIIllllI[51]] = T."talk npc";
        T.lIIIlllII[T.lIIIllllI[52]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[53]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[54]] = T."Climb";
        T.lIIIlllII[T.lIIIllllI[55]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[56]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[57]] = T."curses are real";
        T.lIIIlllII[T.lIIIllllI[58]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[59]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[60]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[61]] = T."Climb";
        T.lIIIlllII[T.lIIIllllI[62]] = T."Climb down gnocci stairs";
        T.lIIIlllII[T.lIIIllllI[63]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[64]] = T."Climb-down";
        T.lIIIlllII[T.lIIIllllI[65]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[66]] = T."Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[67]] = T."Nav to Arsen";
        T.lIIIlllII[T.lIIIllllI[68]] = T."Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[69]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[70]] = T."Climb-up";
        T.lIIIlllII[T.lIIIllllI[71]] = T."Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[72]] = T."Have you got that relic back from";
        T.lIIIlllII[T.lIIIllllI[73]] = T."Talk npc";
        T.lIIIlllII[T.lIIIllllI[19]] = T."Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[74]] = T."Cabin Boy Colin";
        T.lIIIlllII[T.lIIIllllI[75]] = T."Where did you find";
        T.lIIIlllII[T.lIIIllllI[76]] = T."Talk npc";
        T.lIIIlllII[T.lIIIllllI[77]] = T."Cabin Boy Colin";
        T.lIIIlllII[T.lIIIllllI[78]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[79]] = T."Climb-down";
        T.lIIIlllII[T.lIIIllllI[80]] = T."Nav to Gnocci";
        T.lIIIlllII[T.lIIIllllI[81]] = T."Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[82]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[22]] = T."Climb-up";
        T.lIIIlllII[T.lIIIllllI[83]] = T."Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[84]] = T."Where did you say this";
        T.lIIIlllII[T.lIIIllllI[85]] = T."talkedGnocci";
        T.lIIIlllII[T.lIIIllllI[86]] = T."Talk npc";
        T.lIIIlllII[T.lIIIllllI[87]] = T."Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[88]] = T."Climbing stairs";
        T.lIIIlllII[T.lIIIllllI[89]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[90]] = T."Climb-down";
        T.lIIIlllII[T.lIIIllllI[91]] = T."Nav to boat";
        T.lIIIlllII[T.lIIIllllI[92]] = T."Gangplank";
        T.lIIIlllII[T.lIIIllllI[93]] = T."Cross";
        T.lIIIlllII[T.lIIIllllI[94]] = T."talk npc";
        T.lIIIlllII[T.lIIIllllI[95]] = T."Captain Tock";
        T.lIIIlllII[T.lIIIllllI[96]] = T."About that sacred ogre";
        T.lIIIlllII[T.lIIIllllI[97]] = T."talkedCaptain";
        T.lIIIlllII[T.lIIIllllI[98]] = T."Gangplank";
        T.lIIIlllII[T.lIIIllllI[99]] = T."Cross";
        T.lIIIlllII[T.lIIIllllI[100]] = T."Chief Tess";
        T.lIIIlllII[T.lIIIllllI[101]] = T."Nav to hole";
        T.lIIIlllII[T.lIIIllllI[114]] = T."Hole";
        T.lIIIlllII[T.lIIIllllI[115]] = T."Enter";
        T.lIIIlllII[T.lIIIllllI[116]] = T."Chief Tess";
        T.lIIIlllII[T.lIIIllllI[117]] = T."talk npc";
        T.lIIIlllII[T.lIIIllllI[118]] = T."Chief Tess";
        T.lIIIlllII[T.lIIIllllI[119]] = T."you never cursed the";
        T.lIIIlllII[T.lIIIllllI[120]] = T."talkedChief";
        T.lIIIlllII[T.lIIIllllI[121]] = T."Chief Tess";
        T.lIIIlllII[T.lIIIllllI[122]] = T."Vine ladder";
        T.lIIIlllII[T.lIIIllllI[123]] = T."Climb";
        T.lIIIlllII[T.lIIIllllI[126]] = T."Chief Tess";
        T.lIIIlllII[T.lIIIllllI[127]] = T."Nav to dig";
        T.lIIIlllII[T.lIIIllllI[128]] = T."Spade";
        T.lIIIlllII[T.lIIIllllI[129]] = T."Dig";
        T.lIIIlllII[T.lIIIllllI[130]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[131]] = T."Nav to ithoii";
        T.lIIIlllII[T.lIIIllllI[132]] = T."Telescope";
        T.lIIIlllII[T.lIIIllllI[133]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[134]] = T."Climb";
        T.lIIIlllII[T.lIIIllllI[135]] = T."Telescope";
        T.lIIIlllII[T.lIIIllllI[136]] = T."look telescope ";
        T.lIIIlllII[T.lIIIllllI[137]] = T."Telescope";
        T.lIIIlllII[T.lIIIllllI[138]] = T."Observe";
        T.lIIIlllII[T.lIIIllllI[139]] = T."Telescope";
        T.lIIIlllII[T.lIIIllllI[140]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[141]] = T."Climb";
        T.lIIIlllII[T.lIIIllllI[142]] = T."Telescope";
        T.lIIIlllII[T.lIIIllllI[143]] = T."Nav to Gnocci";
        T.lIIIlllII[T.lIIIllllI[144]] = T."Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[145]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[146]] = T."Climb-up";
        T.lIIIlllII[T.lIIIllllI[147]] = T."Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[148]] = T."Talk npc";
        T.lIIIlllII[T.lIIIllllI[149]] = T."Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[150]] = T."you found the source";
        T.lIIIlllII[T.lIIIllllI[151]] = T."Climb down gnocci stairs";
        T.lIIIlllII[T.lIIIllllI[152]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[153]] = T."Climb-down";
        T.lIIIlllII[T.lIIIllllI[154]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[155]] = T."Nav to Arsen";
        T.lIIIlllII[T.lIIIllllI[156]] = T."Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[157]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[158]] = T."Climb-up";
        T.lIIIlllII[T.lIIIllllI[159]] = T."Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[160]] = T."curse on us by stealing";
        T.lIIIlllII[T.lIIIllllI[161]] = T."Talk npc";
        T.lIIIlllII[T.lIIIllllI[162]] = T."Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[163]] = T."Cabin Boy Colin";
        T.lIIIlllII[T.lIIIllllI[164]] = T."you found out how we";
        T.lIIIlllII[T.lIIIllllI[165]] = T."Talk npc";
        T.lIIIlllII[T.lIIIllllI[166]] = T."Cabin Boy Colin";
        T.lIIIlllII[T.lIIIllllI[167]] = T."Climbing stairs";
        T.lIIIlllII[T.lIIIllllI[168]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[169]] = T."Climb-down";
        T.lIIIlllII[T.lIIIllllI[170]] = T."Nav to boat";
        T.lIIIlllII[T.lIIIllllI[175]] = T."Gangplank";
        T.lIIIlllII[T.lIIIllllI[176]] = T."Cross";
        T.lIIIlllII[T.lIIIllllI[177]] = T."talk npc";
        T.lIIIlllII[T.lIIIllllI[178]] = T."Captain Tock";
        T.lIIIlllII[T.lIIIllllI[179]] = T."Gangplank";
        T.lIIIlllII[T.lIIIllllI[180]] = T."Cross";
        T.lIIIlllII[T.lIIIllllI[181]] = T."Nav to Gnocci";
        T.lIIIlllII[T.lIIIllllI[188]] = T."Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[189]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[190]] = T."Climb-up";
        T.lIIIlllII[T.lIIIllllI[191]] = T."Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[192]] = T."Talk npc";
        T.lIIIlllII[T.lIIIllllI[193]] = T."Gnocci the Cook";
        T.lIIIlllII[T.lIIIllllI[194]] = T."Walk down gnocci stairs";
        T.lIIIlllII[T.lIIIllllI[195]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[196]] = T."Climb-down";
        T.lIIIlllII[T.lIIIllllI[197]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[198]] = T."Nav to Arsen";
        T.lIIIlllII[T.lIIIllllI[199]] = T."Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[200]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[201]] = T."Climb-up";
        T.lIIIlllII[T.lIIIllllI[202]] = T."Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[203]] = T."Talk npc";
        T.lIIIlllII[T.lIIIllllI[204]] = T."Arsen the Thief";
        T.lIIIlllII[T.lIIIllllI[205]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[206]] = T."Climb-down";
        T.lIIIlllII[T.lIIIllllI[207]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[208]] = T."Nav to ithoiTile";
        T.lIIIlllII[T.lIIIllllI[209]] = T."talk npc";
        T.lIIIlllII[T.lIIIllllI[210]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[211]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[212]] = T."Climb";
        T.lIIIlllII[T.lIIIllllI[213]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[214]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[215]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[216]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[217]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[218]] = T."Climb";
        T.lIIIlllII[T.lIIIllllI[219]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[220]] = T."Burning hut";
        T.lIIIlllII[T.lIIIllllI[221]] = T."Driftwood";
        T.lIIIlllII[T.lIIIllllI[222]] = T."Nav to boat";
        T.lIIIlllII[T.lIIIllllI[223]] = T."Gangplank";
        T.lIIIlllII[T.lIIIllllI[224]] = T."Cross";
        T.lIIIlllII[T.lIIIllllI[225]] = T."talk npc";
        T.lIIIlllII[T.lIIIllllI[226]] = T."Captain Tock";
        T.lIIIlllII[T.lIIIllllI[227]] = T."Gangplank";
        T.lIIIlllII[T.lIIIllllI[228]] = T."Cross";
        T.lIIIlllII[T.lIIIllllI[229]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[230]] = T."Nav to ithoiTile";
        T.lIIIlllII[T.lIIIllllI[231]] = T."kill npc";
        T.lIIIlllII[T.lIIIllllI[232]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[233]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[234]] = T."Climb";
        T.lIIIlllII[T.lIIIllllI[235]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[236]] = T."Wield";
        T.lIIIlllII[T.lIIIllllI[237]] = T."Eat";
        T.lIIIlllII[T.lIIIllllI[238]] = T."Ithoi the Navigator";
        T.lIIIlllII[T.lIIIllllI[239]] = T."Attack";
        T.lIIIlllII[T.lIIIllllI[240]] = T."Telescope";
        T.lIIIlllII[T.lIIIllllI[241]] = T."Stairs";
        T.lIIIlllII[T.lIIIllllI[242]] = T."Climb";
        T.lIIIlllII[T.lIIIllllI[243]] = T."Nav to boat";
        T.lIIIlllII[T.lIIIllllI[244]] = T."Gangplank";
        T.lIIIlllII[T.lIIIllllI[245]] = T."Cross";
        T.lIIIlllII[T.lIIIllllI[246]] = T."talk npc";
        T.lIIIlllII[T.lIIIllllI[247]] = T."Captain Tock";
        T.lIIIlllII[T.lIIIllllI[248]] = T."Break";
        T.lIIIlllII[T.lIIIllllI[255]] = T."The Corsair Curse";
        T.lIIIlllII[T.lIIIllllI[256]] = T."ring of wealth (";
        T.lIIIlllII[T.lIIIllllI[267]] = T."Yes.";
        T.lIIIlllII[T.lIIIllllI[268]] = T."What kind of help do you need?";
        T.lIIIlllII[T.lIIIllllI[269]] = T."Okay, I'm ready to go to Corsair Cove.";
        T.lIIIlllII[T.lIIIllllI[270]] = T."Okay, I'm ready go to Corsair Cove.";
        T.lIIIlllII[T.lIIIllllI[271]] = T."I hear you've been cursed.";
        T.lIIIlllII[T.lIIIllllI[272]] = T."Arsen says he gave you a sacred ogre relic.";
        T.lIIIlllII[T.lIIIllllI[273]] = T."I've come to return what Arsen stole.";
        T.lIIIlllII[T.lIIIllllI[274]] = T."Search for the possessed doll and face the consequences.";
        T.lIIIlllII[T.lIIIllllI[275]] = T."I've ruled out all the Corsairs' theories...";
        T.lIIIlllII[T.lIIIllllI[276]] = T."So what do I do now?";
        T.lIIIlllII[T.lIIIllllI[277]] = T."I hear it happened straight after dinner.";
        T.lIIIlllII[T.lIIIllllI[278]] = T."I hear Ithoi cooked the meal you ate that night.";
        T.lIIIlllII[T.lIIIllllI[279]] = T."I hear you cooked the meal they ate before getting sick.";
        T.lIIIlllII[T.lIIIllllI[280]] = T."I hear you cooked the meal they ate before getting sick.";
        T.lIIIlllII[T.lIIIllllI[281]] = T."Maybe because the Captain's thinking of firing you.";
        T.lIIIlllII[T.lIIIllllI[282]] = T."I know you've faked the curse.";
        T.lIIIlllII[T.lIIIllllI[283]] = T."I've seen Ithoi running around. He's not sick at all.";
        T.lIIIlllII[T.lIIIllllI[284]] = T."I've killed Ithoi for poisoning your crew.";
    }

    private static boolean lllIlllllIl(int n2) {
        return n2 < 0;
    }

    private static String lllIlIlllIl(String lIIIlIllIlIIlIl, String lIIIlIllIlIIlII) {
        try {
            SecretKeySpec lIIIlIllIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlIllIlIIlll = Cipher.getInstance("Blowfish");
            lIIIlIllIlIIlll.init(lIIIllllI[5], lIIIlIllIlIlIII);
            return new String(lIIIlIllIlIIlll.doFinal(Base64.getDecoder().decode(lIIIlIllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIllIlIIllI) {
            lIIIlIllIlIIllI.printStackTrace();
            return null;
        }
    }

    private static void lllIlllIIlI() {
        lIIIllllI = new int[286];
        T.lIIIllllI[0] = -(0xFFFFE757 & 0x78AD) & (0xFFFFF7BD & Short.MAX_VALUE);
        T.lIIIllllI[1] = -(0xFFFFECD3 & 0x7B6F) & (0xFFFFFFFE & 0x7FFB);
        T.lIIIllllI[2] = 0xFFFFD7FF & 0x3FBA;
        T.lIIIllllI[3] = 0xFFFFD7BB & 0x3FFF;
        T.lIIIllllI[4] = 1;
        T.lIIIllllI[5] = 2;
        T.lIIIllllI[6] = 3;
        T.lIIIllllI[7] = 0xA7 ^ 0x8A ^ (1 ^ 0x28);
        T.lIIIllllI[8] = 0x29 ^ 0x2F;
        T.lIIIllllI[9] = (0x29 ^ 0x6B) & ~(0x2A ^ 0x68);
        T.lIIIllllI[10] = 0xFFFFBF9E & 0x53E9;
        T.lIIIllllI[11] = 0x4A ^ 0x4F;
        T.lIIIllllI[12] = -(0xFFFFB2FF & 0x6D39) & (0xFFFFBF7F & Short.MAX_VALUE);
        T.lIIIllllI[13] = 0xFFFFDF7D & 0x3FCB;
        T.lIIIllllI[14] = -(3 ^ 0x42) & (0xFFFF8BFE & 0x77F9);
        T.lIIIllllI[15] = 0xFFFFBD79 & 0x73D7;
        T.lIIIllllI[16] = 0xFFFFBF7E & 0x42CF;
        T.lIIIllllI[17] = 0x61 ^ 0x6B;
        T.lIIIllllI[18] = -(0xFFFFBFF7 & 0x7E0D) & (0xFFFFFFFF & 0x3F7F);
        T.lIIIllllI[19] = 0x9F ^ 0xB7;
        T.lIIIllllI[20] = -(0xFFFFD0F1 & 0x3FCF) & (0xFFFF9FF7 & 0x75FB);
        T.lIIIllllI[21] = 0xFFFF95FD & 0x6F37;
        T.lIIIllllI[22] = 0xC ^ 0x3E;
        T.lIIIllllI[23] = 2 ^ 5;
        T.lIIIllllI[24] = 0xC5 ^ 0x90 ^ (0x5B ^ 6);
        T.lIIIllllI[25] = 0x98 ^ 0x91;
        T.lIIIllllI[26] = 0x93 ^ 0x8C ^ (0x5A ^ 0x4A);
        T.lIIIllllI[27] = -(0xFFFFFF6A & 0x41F7) & (0xFFFFFB7F & 0x4FF3);
        T.lIIIllllI[28] = -(0xFFFFFEFF & 0x61E9) & (0xFFFFEFFF & 0x7BFD);
        T.lIIIllllI[29] = 0x47 ^ 0x5E ^ (0x90 ^ 0x82);
        T.lIIIllllI[30] = 134 + 71 - 161 + 133 ^ 55 + 119 - 50 + 65;
        T.lIIIllllI[31] = 0x5E ^ 0x26 ^ (0xB6 ^ 0xC3);
        T.lIIIllllI[32] = 0x47 ^ 0x6C ^ (0x1D ^ 0x38);
        T.lIIIllllI[33] = -(0xFFFFDE27 & 0x75FF) & (0xFFFFFF7F & 0x5FBF);
        T.lIIIllllI[34] = 0xFFFFBFE5 & 0x4B3A;
        T.lIIIllllI[35] = 0xFFFFEBAF & 0x1E5B;
        T.lIIIllllI[36] = -(0xFFFFFC1D & 0x57F6) & (0xFFFFFF77 & 0x5FBF);
        T.lIIIllllI[37] = -(0xFFFFB6BF & 0x7DF3) & (0xFFFFFEBE & 0x3FF7);
        T.lIIIllllI[38] = -(0xFFFFE7E7 & 0x7A1B) & (0xFFFFFBFF & 0x6FFF);
        T.lIIIllllI[39] = 0xFFFFFF76 & 0xBAB;
        T.lIIIllllI[40] = 0xFFFFBBF7 & 0x4DFD;
        T.lIIIllllI[41] = -(0xFFFFF6E9 & 0x3D97) & (0xFFFFFFDF & 0x3FBF);
        T.lIIIllllI[42] = -(0xFFFFD8BD & 0x3753) & (0xFFFFFBFF & 0x1DFE);
        T.lIIIllllI[43] = 0xFFFFEF9F & 0x1B7E;
        T.lIIIllllI[44] = -(0xFFFFF03F & 0x6FC8) & (0xFFFFEBEF & 0x7DFF);
        T.lIIIllllI[45] = -(0xFFFFA56F & 0x7EF1) & (0xFFFFEFFB & 0x3F7F);
        T.lIIIllllI[46] = 0xFFFFCFFD & 0x39E7;
        T.lIIIllllI[47] = 0xFFFFFB57 & 0xFBE;
        T.lIIIllllI[48] = 0xFFFFBFFC & 0x49E7;
        T.lIIIllllI[49] = -(0xFFFFF475 & 0x6FEF) & (0xFFFFEFFF & 0x7F76);
        T.lIIIllllI[50] = 0x5E ^ 0x4E;
        T.lIIIllllI[51] = 0x97 ^ 0x86;
        T.lIIIllllI[52] = 0x96 ^ 0x84;
        T.lIIIllllI[53] = 7 ^ 0x14;
        T.lIIIllllI[54] = 0xCF ^ 0xB7 ^ (0xC5 ^ 0xA9);
        T.lIIIllllI[55] = 104 + 102 - 171 + 92 ^ (0x20 ^ 0x4A);
        T.lIIIllllI[56] = 0x5D ^ 0x4B;
        T.lIIIllllI[57] = 0x98 ^ 0x8F;
        T.lIIIllllI[58] = 0x38 ^ 0x3F ^ (0x89 ^ 0x96);
        T.lIIIllllI[59] = 0xBC ^ 0xA5;
        T.lIIIllllI[60] = 0x10 ^ 0xA;
        T.lIIIllllI[61] = 0x32 ^ 0x17 ^ (0xAF ^ 0x91);
        T.lIIIllllI[62] = 0xB2 ^ 0x97 ^ (0x6D ^ 0x54);
        T.lIIIllllI[63] = 1 ^ 0x2B ^ (0xF4 ^ 0xC3);
        T.lIIIllllI[64] = 0x6C ^ 0x72;
        T.lIIIllllI[65] = 0x28 ^ 0x20 ^ (0x39 ^ 0x2E);
        T.lIIIllllI[66] = 0x36 ^ 0x1F ^ (0x89 ^ 0x80);
        T.lIIIllllI[67] = 0x56 ^ 0x77;
        T.lIIIllllI[68] = 0x39 ^ 0x50 ^ (0x3C ^ 0x77);
        T.lIIIllllI[69] = 89 + 8 - -17 + 16 ^ 154 + 62 - 85 + 30;
        T.lIIIllllI[70] = 0x6A ^ 0x77 ^ (0x7F ^ 0x46);
        T.lIIIllllI[71] = 0xBA ^ 0xB3 ^ (0xEA ^ 0xC6);
        T.lIIIllllI[72] = 4 ^ 0x22;
        T.lIIIllllI[73] = 119 + 40 - 111 + 128 ^ 102 + 51 - 20 + 18;
        T.lIIIllllI[74] = 0x95 ^ 0xBC;
        T.lIIIllllI[75] = 0x45 ^ 0x35 ^ (0xF7 ^ 0xAD);
        T.lIIIllllI[76] = 0xED ^ 0xC6;
        T.lIIIllllI[77] = 0x27 ^ 0x17 ^ (0xF ^ 0x13);
        T.lIIIllllI[78] = 0x4B ^ 0x5F ^ (0x93 ^ 0xAA);
        T.lIIIllllI[79] = 0x20 ^ 0xE;
        T.lIIIllllI[80] = 0xA9 ^ 0x86;
        T.lIIIllllI[81] = 0x68 ^ 0x58;
        T.lIIIllllI[82] = 0x9E ^ 0x93 ^ (0x73 ^ 0x4F);
        T.lIIIllllI[83] = 0x2A ^ 0x19;
        T.lIIIllllI[84] = 0x4C ^ 0x78;
        T.lIIIllllI[85] = 0x8E ^ 0xBB;
        T.lIIIllllI[86] = 0x87 ^ 0xB1;
        T.lIIIllllI[87] = 0x8E ^ 0xB9;
        T.lIIIllllI[88] = 0xB4 ^ 0x8C;
        T.lIIIllllI[89] = 62 + 111 - 69 + 79 ^ 25 + 23 - -42 + 52;
        T.lIIIllllI[90] = 0x82 ^ 0xB8;
        T.lIIIllllI[91] = 231 + 74 - 170 + 114 ^ 133 + 129 - 253 + 185;
        T.lIIIllllI[92] = 0x76 ^ 0x4A;
        T.lIIIllllI[93] = 0x66 ^ 0xF ^ (0x23 ^ 0x77);
        T.lIIIllllI[94] = 80 + 91 - -7 + 2 ^ 86 + 87 - 145 + 110;
        T.lIIIllllI[95] = 0x18 ^ 0x27;
        T.lIIIllllI[96] = 0x6D ^ 0x3E ^ (0x10 ^ 3);
        T.lIIIllllI[97] = 0x38 ^ 0x79;
        T.lIIIllllI[98] = 0x4A ^ 8;
        T.lIIIllllI[99] = 0x58 ^ 0x1B;
        T.lIIIllllI[100] = 0x41 ^ 5;
        T.lIIIllllI[101] = 0x14 ^ 0x51;
        T.lIIIllllI[102] = 0xFFFFDFDA & 0x2B3F;
        T.lIIIllllI[103] = 0xFFFFEEEF & 0x1B1F;
        T.lIIIllllI[104] = 0xFFFFDAD6 & 0x2F2F;
        T.lIIIllllI[105] = -(0xFFFFB041 & 0x6FBF) & (0xFFFFF9FF & 0x2FF6);
        T.lIIIllllI[106] = -(0xFFFFF3D3 & 0x5CFD) & (0xFFFFFFF7 & 0x5BFF);
        T.lIIIllllI[107] = 0xFFFFFBEF & 0xDFF;
        T.lIIIllllI[108] = -(0xFFFFF47D & 0x2FD7) & (0xFFFFAFFD & 0x7F7E);
        T.lIIIllllI[109] = 0xFFFFFF39 & 0xBEF;
        T.lIIIllllI[110] = 0xFFFF89F9 & 0x7FE7;
        T.lIIIllllI[111] = -(0xFFFFBFDF & 0x74F5) & (0xFFFFFFFF & 0x3FFF);
        T.lIIIllllI[112] = -(0xFFFFE56F & 0x7AB3) & (0xFFFFFFFF & 0x69FF);
        T.lIIIllllI[113] = 0xFFFFFB3F & 0xFED;
        T.lIIIllllI[114] = 108 + 89 - 162 + 215 ^ 146 + 98 - 57 + 1;
        T.lIIIllllI[115] = 0xD6 ^ 0xA4 ^ (0x78 ^ 0x4D);
        T.lIIIllllI[116] = 49 + 25 - 64 + 197 ^ 93 + 18 - 11 + 35;
        T.lIIIllllI[117] = 23 + 184 - 63 + 65 ^ 50 + 102 - 75 + 75;
        T.lIIIllllI[118] = 0xF5 ^ 0xBF;
        T.lIIIllllI[119] = 0x37 ^ 0x7C;
        T.lIIIllllI[120] = 0x56 ^ 0x1A;
        T.lIIIllllI[121] = 2 ^ (0x60 ^ 0x2F);
        T.lIIIllllI[122] = 177 + 62 - 39 + 30 ^ 84 + 99 - 30 + 15;
        T.lIIIllllI[123] = 0x8A ^ 0x9C ^ (0xFD ^ 0xA4);
        T.lIIIllllI[124] = 0xFFFFFDDB & 0xBEC;
        T.lIIIllllI[125] = -(0xFFFFFF72 & 0x148F) & (0xFFFFDF3F & 0x3FD9);
        T.lIIIllllI[126] = 180 + 154 - 319 + 238 ^ 15 + 138 - 9 + 29;
        T.lIIIllllI[127] = 0x82 ^ 0xBB ^ (0xC ^ 0x64);
        T.lIIIllllI[128] = 0x11 ^ 0x43;
        T.lIIIllllI[129] = 0x94 ^ 0x9D ^ (0x6B ^ 0x31);
        T.lIIIllllI[130] = 63 + 73 - -27 + 75 ^ 169 + 97 - 91 + 11;
        T.lIIIllllI[131] = 0xF3 ^ 0xA6;
        T.lIIIllllI[132] = 0x50 ^ 6;
        T.lIIIllllI[133] = 0xF8 ^ 0xAF;
        T.lIIIllllI[134] = 0xC3 ^ 0x9B;
        T.lIIIllllI[135] = 0x67 ^ 0x68 ^ (0x4F ^ 0x19);
        T.lIIIllllI[136] = 137 + 107 - 112 + 64 ^ 40 + 51 - -9 + 58;
        T.lIIIllllI[137] = 0x4C ^ 0x17;
        T.lIIIllllI[138] = 0x64 ^ 0x38;
        T.lIIIllllI[139] = 0x27 ^ 0x7A;
        T.lIIIllllI[140] = 0x9C ^ 0xC2;
        T.lIIIllllI[141] = 0x49 ^ 0x16;
        T.lIIIllllI[142] = 0xA5 ^ 0xC5;
        T.lIIIllllI[143] = 0x40 ^ 0x4B ^ (0xCC ^ 0xA6);
        T.lIIIllllI[144] = 0x67 ^ 5;
        T.lIIIllllI[145] = 0x26 ^ 0x32 ^ (0 ^ 0x77);
        T.lIIIllllI[146] = 78 + 64 - 107 + 92 ^ (0xAA ^ 0xB1);
        T.lIIIllllI[147] = 56 + 92 - 10 + 67 ^ 75 + 58 - 69 + 104;
        T.lIIIllllI[148] = 11 + 193 - 156 + 161 ^ 136 + 91 - 60 + 16;
        T.lIIIllllI[149] = 0x2F ^ 0x48;
        T.lIIIllllI[150] = 0x5E ^ 0x39 ^ (0x5B ^ 0x54);
        T.lIIIllllI[151] = 0x51 ^ 0x38;
        T.lIIIllllI[152] = 0x29 ^ 0x4C ^ (0x2D ^ 0x22);
        T.lIIIllllI[153] = 0x39 ^ 0x10 ^ (0xF ^ 0x4D);
        T.lIIIllllI[154] = 0x75 ^ 0x1A ^ 3;
        T.lIIIllllI[155] = 131 + 70 - -19 + 21 ^ 36 + 151 - 145 + 114;
        T.lIIIllllI[156] = 0x9A ^ 0x85 ^ (0xFE ^ 0x8F);
        T.lIIIllllI[157] = 205 + 56 - 219 + 168 ^ 136 + 141 - 163 + 75;
        T.lIIIllllI[158] = 0x36 ^ 0x46;
        T.lIIIllllI[159] = 0xAB ^ 0xBC ^ (0xDC ^ 0xBA);
        T.lIIIllllI[160] = 173 + 117 - 145 + 63 ^ 30 + 104 - 45 + 73;
        T.lIIIllllI[161] = 0x13 ^ 0x25 ^ (0xCB ^ 0x8E);
        T.lIIIllllI[162] = 0xDF ^ 0xAB;
        T.lIIIllllI[163] = 0x40 ^ 0x35;
        T.lIIIllllI[164] = 0xD4 ^ 0xA2;
        T.lIIIllllI[165] = 138 + 49 - 128 + 148 ^ 41 + 128 - 13 + 28;
        T.lIIIllllI[166] = 143 + 179 - 170 + 36 ^ 35 + 131 - 105 + 135;
        T.lIIIllllI[167] = 0x35 ^ 0x4C;
        T.lIIIllllI[168] = 0x7F ^ 5;
        T.lIIIllllI[169] = 0x75 ^ 0x65 ^ (0x3A ^ 0x51);
        T.lIIIllllI[170] = 0xC ^ 0x7C ^ (0x37 ^ 0x3B);
        T.lIIIllllI[171] = -(0xFFFF97EB & 0x6DB5) & (0xFFFFFFE5 & 0xFBF);
        T.lIIIllllI[172] = -(0 + 124 - 34 + 48) & (0xFFFFDBEF & 0x2FBF);
        T.lIIIllllI[173] = -(0xFFFFFA73 & 0x65BF) & (0xFFFFEBBF & 0x7E7F);
        T.lIIIllllI[174] = 0xFFFFEFF9 & 0x1A17;
        T.lIIIllllI[175] = 0x63 ^ 0x1E;
        T.lIIIllllI[176] = 0xD5 ^ 0xAB;
        T.lIIIllllI[177] = (0xBB ^ 0xA0) + (0xFA ^ 0xBF) - (0x89 ^ 0x87) + (0x28 ^ 5);
        T.lIIIllllI[178] = (0x23 ^ 0x4A) + (0x21 ^ 0x25) - (0x7C ^ 0x17) + (0x74 ^ 0xA);
        T.lIIIllllI[179] = (0x13 ^ 0x78) + (36 + 71 - 23 + 43) - (2 + 27 - -17 + 152) + (0xCC ^ 0x91);
        T.lIIIllllI[180] = (0x5C ^ 0x4A) + (117 + 57 - 97 + 51) - (0x76 ^ 0x26) + (0x5E ^ 0x62);
        T.lIIIllllI[181] = 112 + 55 - 66 + 30;
        T.lIIIllllI[182] = -(0xFFFFCB71 & 0x359F) & (0xFFFFFFD9 & 0xB3F);
        T.lIIIllllI[183] = -(0xFFFFDDED & 0x32FF) & (0xFFFF9AFF & 0x7FEF);
        T.lIIIllllI[184] = 0xFFFFDB3D & 0x2FE7;
        T.lIIIllllI[185] = -(0xFFFFF21D & 0x7FE3) & (0xFFFFFBFF & Short.MAX_VALUE);
        T.lIIIllllI[186] = 0xFFFFE9FB & 0x1FFF;
        T.lIIIllllI[187] = -(0xFFFFF359 & 0x7CF7) & (0xFFFFFB7F & 0x7FFE);
        T.lIIIllllI[188] = (1 ^ 0x79) + (0x83 ^ 0xA7) - (133 + 72 - 159 + 101) + (0xFA ^ 0x81);
        T.lIIIllllI[189] = 120 + 115 - 169 + 67;
        T.lIIIllllI[190] = (0xDD ^ 0xB2) + (0x51 ^ 0x1B) - (0x3C ^ 3) + (0x51 ^ 0x5D);
        T.lIIIllllI[191] = 30 + 36 - -40 + 29;
        T.lIIIllllI[192] = 69 + 86 - 117 + 98;
        T.lIIIllllI[193] = (0x6F ^ 0) + (0x38 ^ 0x2C) - (0x1C ^ 0x2E) + (0x2B ^ 0x13);
        T.lIIIllllI[194] = (0x21 ^ 0x5F) + (0x6A ^ 0x65) - (0xF3 ^ 0xC5) + (0x66 ^ 0x55);
        T.lIIIllllI[195] = 49 + 41 - -46 + 3;
        T.lIIIllllI[196] = 38 + 109 - 64 + 57;
        T.lIIIllllI[197] = (0x1E ^ 0x52) + (0xF2 ^ 0xAF) - (0xE5 ^ 0xC5) + (0 ^ 4);
        T.lIIIllllI[198] = 50 + 15 - -1 + 76;
        T.lIIIllllI[199] = (0 ^ 0x7B) + (6 ^ 0x26) - (0xAD ^ 0xA1) + ((0x72 ^ 0x55) & ~(0x9D ^ 0xBA));
        T.lIIIllllI[200] = 88 + 94 - 47 + 9;
        T.lIIIllllI[201] = (0x6D ^ 0x3B) + (0xC1 ^ 0xAB) - (0x52 ^ 2) + (0x43 ^ 0x62);
        T.lIIIllllI[202] = (0x4D ^ 0x6C) + (0x4A ^ 0x7B) - (0x84 ^ 0x95) + (0x75 ^ 0x24);
        T.lIIIllllI[203] = 101 + 58 - 74 + 62;
        T.lIIIllllI[204] = 50 + 105 - 9 + 2;
        T.lIIIllllI[205] = (0x6C ^ 0x68) + (0x80 ^ 0xB4) - 3 + (0x7E ^ 0x1E);
        T.lIIIllllI[206] = 100 + 134 - 120 + 36;
        T.lIIIllllI[207] = (0xBB ^ 0x88) + (0xA6 ^ 0xBC) - -(0xBD ^ 0xA6) + (0x6A ^ 0x45);
        T.lIIIllllI[208] = 104 + 44 - 52 + 56;
        T.lIIIllllI[209] = 6 + 57 - 54 + 144;
        T.lIIIllllI[210] = 60 + 46 - -14 + 29 + (37 + 116 - 26 + 23) - (191 + 145 - 233 + 133) + (0x7A ^ 0x21);
        T.lIIIllllI[211] = 151 + 3 - 52 + 53;
        T.lIIIllllI[212] = 123 + 71 - 151 + 113;
        T.lIIIllllI[213] = 96 + 73 - 51 + 39;
        T.lIIIllllI[214] = (0x3A ^ 0x51) + (0xBC ^ 0xC4) - (198 + 70 - 251 + 209) + (151 + 134 - 227 + 99);
        T.lIIIllllI[215] = (0x28 ^ 0x52) + (0x1E ^ 0x55) - (0x84 ^ 0xC2) + (0x71 ^ 0x51);
        T.lIIIllllI[216] = (0x8E ^ 0xAB) + (0x2E ^ 0x49) - (0x50 ^ 0x29) + (103 + 4 - 60 + 94);
        T.lIIIllllI[217] = 24 + 53 - -76 + 8;
        T.lIIIllllI[218] = (5 ^ 0x23) + (0x1E ^ 0x3B) - -(0x49 ^ 0x57) + (0x11 ^ 0x28);
        T.lIIIllllI[219] = 25 + 98 - 104 + 144;
        T.lIIIllllI[220] = (0x8D ^ 0x95) + (0x30 ^ 0x45) - 2 + (0x7A ^ 0x63);
        T.lIIIllllI[221] = ((0xAC ^ 0x9C) & ~(0x65 ^ 0x55)) + (0x12 ^ 0x37) - -(0xAD ^ 0xA3) + (0x5C ^ 0x2E);
        T.lIIIllllI[222] = 151 + 106 - 159 + 68;
        T.lIIIllllI[223] = (0x8F ^ 0xA9) + (0x43 ^ 0x67) - (0x73 ^ 0x47) + (15 + 107 - 40 + 63);
        T.lIIIllllI[224] = (0x30 ^ 0x1D) + (131 + 15 - 24 + 21) - (0x55 ^ 0x79) + (0x3D ^ 0x25);
        T.lIIIllllI[225] = 147 + 24 - 95 + 93;
        T.lIIIllllI[226] = (0xD3 ^ 0x8C) + (0x6F ^ 2) - (7 + 98 - 55 + 124) + (137 + 75 - 88 + 16);
        T.lIIIllllI[227] = 124 + 4 - -18 + 20 + (0x7F ^ 0x49) - (0x4E ^ 0x7B) + (0xB ^ 0xF);
        T.lIIIllllI[228] = (0x7A ^ 0x77) + (0xB5 ^ 0xAA) - -(0x49 ^ 0x69) + (0x67 ^ 7);
        T.lIIIllllI[229] = (0x2F ^ 0x57) + (135 + 49 - 116 + 71) - (99 + 151 - 139 + 113) + (45 + 99 - 15 + 9);
        T.lIIIllllI[230] = (0xBF ^ 0xC5) + 1 - -(5 ^ 0x2B) + (0x94 ^ 0x91);
        T.lIIIllllI[231] = 53 + 142 - 123 + 73 + (27 + 1 - -101 + 17) - (41 + 117 - 116 + 93) + (0x4D ^ 0x5E);
        T.lIIIllllI[232] = 134 + 151 - 267 + 158;
        T.lIIIllllI[233] = (0xF5 ^ 0xC4) + (41 + 171 - 181 + 145) - (0x14 ^ 0x59) + (0xAA ^ 0xB7);
        T.lIIIllllI[234] = 56 + 148 - 118 + 92;
        T.lIIIllllI[235] = 111 + 119 - 128 + 77;
        T.lIIIllllI[236] = 118 + 19 - 107 + 150;
        T.lIIIllllI[237] = (0x45 ^ 0x6E) + (0x5E ^ 0x55) - -(0x85 ^ 0x97) + (0x74 ^ 0x19);
        T.lIIIllllI[238] = (0x3B ^ 0x15) + (114 + 77 - 190 + 175) - (0x32 ^ 0x7F) + (0x9F ^ 0xBA);
        T.lIIIllllI[239] = 5 + 33 - -85 + 60;
        T.lIIIllllI[240] = 92 + 90 - 10 + 12;
        T.lIIIllllI[241] = 30 + 122 - -23 + 10;
        T.lIIIllllI[242] = (0x5E ^ 0x72) + (106 + 116 - 168 + 84) - (103 + 0 - -24 + 0) + (63 + 7 - 64 + 125);
        T.lIIIllllI[243] = 29 + 29 - 13 + 142;
        T.lIIIllllI[244] = 97 + 155 - 246 + 182;
        T.lIIIllllI[245] = (0x92 ^ 0x89) + (16 + 10 - -46 + 76) - (0x78 ^ 0x36) + (0xEF ^ 0xB3);
        T.lIIIllllI[246] = 22 + 5 - 11 + 159 + (0x1A ^ 0x55) - (5 ^ 0x5B) + (0x5C ^ 0x42);
        T.lIIIllllI[247] = 139 + 145 - 150 + 57;
        T.lIIIllllI[248] = (0x6B ^ 0x57) + (0x78 ^ 0x35) - (0x2E ^ 0x48) + (156 + 31 - 134 + 104);
        T.lIIIllllI[249] = 0xFFFFE26C & 0x1F9B;
        T.lIIIllllI[250] = -(0xFFFFB2FD & 0x5F3F) & (0xFFFFFFFE & 0x777D);
        T.lIIIllllI[251] = -(0xFFFFD77B & 0x78E5) & (0xFFFFFFE9 & 0x57F6);
        T.lIIIllllI[252] = -(0xFFFFCCEF & 0x7332) & (0xFFFFEFFD & 0x7EEF);
        T.lIIIllllI[253] = 0xFFFFE7AA & 0x79FD;
        T.lIIIllllI[254] = 0xFFFFD7FD & 0x2F6E;
        T.lIIIllllI[255] = (0x57 ^ 0x17) + (0x7E ^ 0x7B) - (0x46 ^ 0x5D) + (104 + 22 - 5 + 30);
        T.lIIIllllI[256] = 40 + 68 - 16 + 75 + (0xB7 ^ 0x81) - (0x26 ^ 0x4D) + (0x32 ^ 0x62);
        T.lIIIllllI[257] = 0xFFFFBBDF & 0x4FF7;
        T.lIIIllllI[258] = -(0xFFFF97AB & 0x7B77) & (0xFFFFFFEB & 0x1FFE);
        T.lIIIllllI[259] = 0xFFFFFFDF & 0xB7F;
        T.lIIIllllI[260] = 0xFFFFEE9D & 0x1DFB;
        T.lIIIllllI[261] = 0xFFFF9B2C & 0x6FFF;
        T.lIIIllllI[262] = -(0xFFFFBAE1 & 0x671F) & (0xFFFFFBFF & 0x2FF7);
        T.lIIIllllI[263] = -(0xFFFFF553 & 0x4AAD) & (0xFFFFDFFD & 0x69EE);
        T.lIIIllllI[264] = 0xFFFFBFEB & 0x4B3E;
        T.lIIIllllI[265] = 0xFFFFAA9E & 0x5F6B;
        T.lIIIllllI[266] = -(0xFFFFA4AB & 0x7BFF) & (0xFFFFBFFA & 0x6BBF);
        T.lIIIllllI[267] = 192 + 174 - 217 + 46;
        T.lIIIllllI[268] = 1 + (0x11 ^ 0x5A) - (0x61 ^ 0x67) + (0xDD ^ 0xA3);
        T.lIIIllllI[269] = 133 + 85 - 188 + 152 + (4 + 36 - 34 + 188) - (0xFFFFF159 & 0xFFF) + (99 + 61 - 17 + 23);
        T.lIIIllllI[270] = (7 ^ 0x75) + (0x25 ^ 0) - -(0x3A ^ 0x37) + (0x53 ^ 0x71);
        T.lIIIllllI[271] = (0x22 ^ 0x7A) + (83 + 55 - 72 + 95) - (58 + 76 - 78 + 81) + (0xE5 ^ 0xB2);
        T.lIIIllllI[272] = 88 + 112 - 149 + 95 + (0x89 ^ 0x91) - (0xA6 ^ 0xB6) + (0x34 ^ 0x1A);
        T.lIIIllllI[273] = 113 + 150 - 153 + 55 + (18 + 5 - -77 + 65) - (116 + 113 - 192 + 110) + (0x1F ^ 0xD);
        T.lIIIllllI[274] = (0x8C ^ 0xB3) + (0xC4 ^ 0xA5) - (0xF9 ^ 0xAA) + (0x6D ^ 0x10);
        T.lIIIllllI[275] = (0x1C ^ 0x58) + (0x34 ^ 0x7C) - (0xE ^ 0x44) + (115 + 24 - 95 + 93);
        T.lIIIllllI[276] = 166 + 72 - 89 + 55;
        T.lIIIllllI[277] = 32 + 178 - 172 + 167;
        T.lIIIllllI[278] = (0x64 ^ 0x18) + (60 + 95 - 6 + 27) - (198 + 53 - 243 + 197) + (0x35 ^ 0x5A);
        T.lIIIllllI[279] = (0x54 ^ 0x2D) + (0x31 ^ 0x2B) - (0x4B ^ 0xE) + (17 + 5 - -13 + 94);
        T.lIIIllllI[280] = 54 + 71 - 8 + 91;
        T.lIIIllllI[281] = (0xC0 ^ 0xA3) + (11 + 44 - -61 + 30) - (0x76 ^ 1) + (0xC4 ^ 0x97);
        T.lIIIllllI[282] = 28 + 83 - -68 + 31;
        T.lIIIllllI[283] = (0xA9 ^ 0xB1) + (105 + 154 - 89 + 31) - (79 + 41 - -14 + 8) + (44 + 71 - 46 + 59);
        T.lIIIllllI[284] = (0x88 ^ 0xBB) + (0xCE ^ 0x89) - (0x7D ^ 0x47) + (92 + 28 - 59 + 87);
        T.lIIIllllI[285] = 115 + 209 - 268 + 157;
    }

    @Override
    public boolean V() {
        int n2;
        if (T.lllIllllllI(Vars.getBit((int)QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIllllI[92]) && T.lllIlllIlll(jX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lIIIllllI[4];
            0;
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

