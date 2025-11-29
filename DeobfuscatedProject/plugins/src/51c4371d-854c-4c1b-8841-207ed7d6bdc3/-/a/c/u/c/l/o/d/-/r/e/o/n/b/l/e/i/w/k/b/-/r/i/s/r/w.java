/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.A;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.L;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
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
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class w
implements F {
    static /* synthetic */ boolean cj;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] lIllIIlI;
    public static /* synthetic */ List<d> bB;
    static /* synthetic */ int ci;
    private static /* synthetic */ int[] lIllIlII;
    public static final /* synthetic */ WorldPoint dh;
    public static final /* synthetic */ WorldPoint di;
    private static /* synthetic */ String[] bX;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        String[] stringArray = new String[lIllIlII[3]];
        stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[49]];
        if (w.lIIlIllIllI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIllIlII[3]];
            nArray[w.lIllIlII[4]] = lIllIlII[14];
            if (w.lIIlIllIllI(Inventory.getCount((int[])nArray))) {
                String[] stringArray2 = new String[lIllIlII[3]];
                stringArray2[w.lIllIlII[4]] = lIllIIlI[lIllIlII[50]];
                if (w.lIIlIllIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllIlII[3]];
                    nArray2[w.lIllIlII[4]] = lIllIlII[18];
                    if (w.lIIlIllIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIllIlII[3]];
                        nArray3[w.lIllIlII[4]] = lIllIlII[11];
                        if (w.lIIlIllIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            n2 = lIllIlII[3];
                            "".length();
                            if (null == null) return n2 != 0;
                            return ((0x61 ^ 0x53) & ~(0xA2 ^ 0x90)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lIllIlII[4];
        return n2 != 0;
    }

    public static void bf() {
        if (w.lIIlIllIIII(e.j(lIllIlII[0]), lIllIlII[1])) {
            A.bD();
        }
        if (w.lIIlIllIIII(Skills.getLevel((Skill)Skill.COOKING), lIllIlII[2]) && w.lIIlIllIIIl(e.j(lIllIlII[0]), lIllIlII[1])) {
            L.cC();
        }
        if (w.lIIlIllIIlI(Skills.getLevel((Skill)Skill.COOKING), lIllIlII[2]) && w.lIIlIllIIIl(e.j(lIllIlII[0]), lIllIlII[1])) {
            if (w.lIIlIllIIll(bz ? 1 : 0)) {
                b.a(bB);
                if (w.lIIlIllIIII(bB.size(), lIllIlII[3])) {
                    System.out.println(lIllIIlI[lIllIlII[4]]);
                    bz = lIllIlII[4];
                }
            }
            if (w.lIIlIllIlII(bz ? 1 : 0)) {
                BankLocation lIllIIlllllIlll;
                if (w.lIIlIllIlII(w.ac() ? 1 : 0) && w.lIIlIllIlII(e.j(lIllIlII[5]))) {
                    lIllIIlllllIlll = BankLocation.getNearest();
                    if (w.lIIlIllIlIl(lIllIIlllllIlll) && w.lIIlIllIlII(lIllIIlllllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIllIIlI[lIllIlII[3]];
                        a.a(lIllIIlllllIlll);
                    }
                    if (w.lIIlIllIlIl(lIllIIlllllIlll) && w.lIIlIllIIll(lIllIIlllllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (w.lIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIlII[6]);
                            "".length();
                        }
                        if (w.lIIlIllIIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = lIllIIlI[lIllIlII[1]];
                            if (w.lIIlIllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIllIlII[7]);
                                "".length();
                            }
                            if (w.lIIlIllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIllIlII[1]);
                                "".length();
                            }
                            int[] nArray = new int[lIllIlII[8]];
                            nArray[w.lIllIlII[4]] = lIllIlII[9];
                            nArray[w.lIllIlII[3]] = lIllIlII[10];
                            nArray[w.lIllIlII[1]] = lIllIlII[11];
                            nArray[w.lIllIlII[12]] = lIllIlII[13];
                            nArray[w.lIllIlII[7]] = lIllIlII[14];
                            nArray[w.lIllIlII[15]] = lIllIlII[16];
                            nArray[w.lIllIlII[17]] = lIllIlII[18];
                            if (w.lIIlIllIlII(e.b(nArray) ? 1 : 0)) {
                                w.ag();
                                System.out.println(lIllIIlI[lIllIlII[12]]);
                                bz = lIllIlII[3];
                                return;
                            }
                            int[] nArray2 = new int[lIllIlII[8]];
                            nArray2[w.lIllIlII[4]] = lIllIlII[9];
                            nArray2[w.lIllIlII[3]] = lIllIlII[10];
                            nArray2[w.lIllIlII[1]] = lIllIlII[11];
                            nArray2[w.lIllIlII[12]] = lIllIlII[13];
                            nArray2[w.lIllIlII[7]] = lIllIlII[14];
                            nArray2[w.lIllIlII[15]] = lIllIlII[16];
                            nArray2[w.lIllIlII[17]] = lIllIlII[18];
                            if (w.lIIlIllIIll(e.b(nArray2) ? 1 : 0)) {
                                a.a(lIllIlII[9], lIllIlII[2]);
                                a.a(lIllIlII[10], lIllIlII[2]);
                                a.a(lIllIlII[11], lIllIlII[3]);
                                a.a(lIllIlII[13], lIllIlII[3]);
                                a.a(lIllIlII[14], lIllIlII[3]);
                                a.a(lIllIlII[16], lIllIlII[3]);
                                a.a(lIllIlII[18], lIllIlII[3]);
                                a.a(lIllIlII[19], lIllIlII[1]);
                                a.a(lIllIlII[20], lIllIlII[6]);
                            }
                        }
                    }
                }
                if (w.lIIlIllIIll(Inventory.contains((int[])f.bb) ? 1 : 0) && w.lIIlIllIIII(Movement.getRunEnergy(), lIllIlII[21])) {
                    Inventory.getFirst((int[])f.bb).interact(lIllIIlI[lIllIlII[7]]);
                    Time.sleepTicks((int)lIllIlII[3]);
                    "".length();
                }
                if (w.lIIlIllIlII(e.j(lIllIlII[5])) && w.lIIlIllIIll(w.ac() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIIlI[lIllIlII[15]];
                    if (w.lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                        if (w.lIIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dh);
                        "".length();
                        Time.sleepTicks((int)lIllIlII[3]);
                        "".length();
                    }
                    if (w.lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                        AccBuilderBarrows.c = lIllIIlI[lIllIlII[17]];
                        g.a(lIllIIlI[lIllIlII[8]], bX);
                    }
                }
                if (w.lIIlIllIIIl(e.j(lIllIlII[5]), lIllIlII[3])) {
                    int[] nArray = new int[lIllIlII[3]];
                    nArray[w.lIllIlII[4]] = lIllIlII[22];
                    if (w.lIIlIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIlII[3]];
                        stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[23]];
                        if (w.lIIlIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            ci = lIllIlII[4];
                            if (w.lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), lIllIlII[7])) {
                                AccBuilderBarrows.c = lIllIIlI[lIllIlII[24]];
                                lIllIIlllllIlll = new WorldArea(lIllIlII[25], lIllIlII[26], lIllIlII[27], lIllIlII[28], lIllIlII[4]);
                                if (w.lIIlIllIlII(lIllIIlllllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (w.lIIlIllIIll(Inventory.contains(item -> item.getName().contains(lIllIIlI[lIllIlII[66]])) ? 1 : 0) && w.lIIlIllIlII(Equipment.contains(item -> item.getName().contains(lIllIIlI[lIllIlII[56]])) ? 1 : 0)) {
                                        Inventory.getFirst(item -> item.getName().contains(lIllIIlI[lIllIlII[65]])).interact(lIllIIlI[lIllIlII[2]]);
                                    }
                                    if (w.lIIlIllIIll(Equipment.contains(item -> item.getName().contains(lIllIIlI[lIllIlII[64]])) ? 1 : 0) && w.lIIlIllIIIl(Players.getLocal().getAnimation(), lIllIlII[29])) {
                                        Equipment.getFirst(item -> item.getName().contains(lIllIIlI[lIllIlII[63]])).interact(lIllIIlI[lIllIlII[30]]);
                                        Time.sleepTicks((int)lIllIlII[7]);
                                        "".length();
                                    }
                                }
                                if (w.lIIlIllIIll(lIllIIlllllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)di);
                                    "".length();
                                    Time.sleepTicks((int)lIllIlII[3]);
                                    "".length();
                                }
                            }
                            if (w.lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(di), lIllIlII[7])) {
                                AccBuilderBarrows.c = lIllIIlI[lIllIlII[31]];
                                if (w.lIIlIllIIll(Widgets.get((int)lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIllIlII[3]];
                                    stringArray2[w.lIllIlII[4]] = lIllIIlI[lIllIlII[33]];
                                    NPCs.getNearest((String[])stringArray2).interact(lIllIIlI[lIllIlII[34]]);
                                    Time.sleepTicks((int)lIllIlII[12]);
                                    "".length();
                                }
                                if (w.lIIlIllIlII(Widgets.get((int)lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIllIlII[32], (int)lIllIlII[35], (int)lIllIlII[3]).interact(lIllIIlI[lIllIlII[36]]);
                                    Time.sleepTicks((int)lIllIlII[1]);
                                    "".length();
                                }
                                int[] nArray3 = new int[lIllIlII[3]];
                                nArray3[w.lIllIlII[4]] = lIllIlII[22];
                                if (w.lIIlIllIIll(Inventory.contains((int[])nArray3) ? 1 : 0) && w.lIIlIllIlII(Widgets.get((int)lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get((int)lIllIlII[32], (int)lIllIlII[3], (int)lIllIlII[30]).interact(lIllIIlI[lIllIlII[35]]);
                                    Time.sleepTicks((int)lIllIlII[3]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] nArray4 = new int[lIllIlII[3]];
                    nArray4[w.lIllIlII[4]] = lIllIlII[22];
                    if (w.lIIlIllIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIlII[3]];
                        stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[37]];
                        if (w.lIIlIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            int[] nArray5 = new int[lIllIlII[3]];
                            nArray5[w.lIllIlII[4]] = lIllIlII[22];
                            if (w.lIIlIllIIll(Inventory.contains((int[])nArray5) ? 1 : 0) && w.lIIlIllIlII(Widgets.get((int)lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get((int)lIllIlII[32], (int)lIllIlII[3], (int)lIllIlII[30]).interact(lIllIIlI[lIllIlII[38]]);
                                Time.sleepTicks((int)lIllIlII[3]);
                                "".length();
                            }
                            int[] nArray6 = new int[lIllIlII[3]];
                            nArray6[w.lIllIlII[4]] = lIllIlII[18];
                            String[] stringArray3 = new String[lIllIlII[3]];
                            stringArray3[w.lIllIlII[4]] = lIllIIlI[lIllIlII[39]];
                            Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((String[])stringArray3));
                            Time.sleepTicks((int)lIllIlII[1]);
                            "".length();
                        }
                    }
                    String[] stringArray = new String[lIllIlII[3]];
                    stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[40]];
                    if (w.lIIlIllIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        if (w.lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                            if (w.lIIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (w.lIIlIllIIll(Inventory.contains(item -> item.getName().contains(lIllIIlI[lIllIlII[62]])) ? 1 : 0) && w.lIIlIllIlII(Equipment.contains(item -> item.getName().contains(lIllIIlI[lIllIlII[61]])) ? 1 : 0)) {
                                Inventory.getFirst(item -> item.getName().contains(lIllIIlI[lIllIlII[60]])).interact(lIllIIlI[lIllIlII[41]]);
                                Time.sleepTicks((int)lIllIlII[1]);
                                "".length();
                            }
                            Movement.walkTo((WorldPoint)dh);
                            "".length();
                            Time.sleepTicks((int)lIllIlII[3]);
                            "".length();
                        }
                        if (w.lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                            AccBuilderBarrows.c = lIllIIlI[lIllIlII[42]];
                            if (w.lIIlIllIIII(ci, lIllIlII[3])) {
                                Q.kX += lIllIlII[3];
                                Q.o(AccBuilderBarrows.m);
                                ci += lIllIlII[3];
                                Q.kX = lIllIlII[4];
                                cj = lIllIlII[4];
                            }
                            g.a(lIllIIlI[lIllIlII[43]], bX);
                        }
                    }
                }
                if (w.lIIlIllIIIl(e.j(lIllIlII[5]), lIllIlII[1])) {
                    String[] stringArray = new String[lIllIlII[3]];
                    stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[44]];
                    TileObjects.getNearest((String[])stringArray).interact(lIllIIlI[lIllIlII[45]]);
                    Time.sleepTicks((int)lIllIlII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIlIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int U() {
        try {
            System.out.println("678: " + e.j(lIllIlII[5]));
            w.bf();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((11 + 89 - -28 + 13 ^ 108 + 3 - -19 + 6) <= 0) {
            return (89 + 203 - 158 + 89 ^ 92 + 63 - 37 + 28) & (0x2A ^ 0x4E ^ (0xA7 ^ 0x8E) ^ -" ".length());
        }
        return lIllIlII[57];
    }

    private static void lIIlIlIllll() {
        lIllIlII = new int[79];
        w.lIllIlII[0] = 63 + 120 - 147 + 122 ^ 25 + 75 - 8 + 39;
        w.lIllIlII[1] = "  ".length();
        w.lIllIlII[2] = 0xAA ^ 0xA0;
        w.lIllIlII[3] = " ".length();
        w.lIllIlII[4] = (0xCA ^ 0x8A) & ~(0xF7 ^ 0xB7);
        w.lIllIlII[5] = 0xFFFFAFE7 & 0x52BE;
        w.lIllIlII[6] = -(0xFFFFDD76 & 0x6ADD) & (0xFFFFDFDF & 0x7BFB);
        w.lIllIlII[7] = 23 + 0 - 6 + 129 ^ 142 + 104 - 192 + 96;
        w.lIllIlII[8] = 0x49 ^ 0x4E;
        w.lIllIlII[9] = -(0xA3 ^ 0x9A) & (0xFFFFBFFF & 0x5F7F);
        w.lIllIlII[10] = -(0xFFFFEABE & 0x55D7) & (0xFFFFFFFF & 0x5FDD);
        w.lIllIlII[11] = -(0xFFFFB51F & 0x4EE7) & (0xFFFFDFFF & 0x2DFE);
        w.lIllIlII[12] = "   ".length();
        w.lIllIlII[13] = (0x58 ^ 9) + (26 + 88 - 91 + 126) - (72 + 153 - 166 + 95) + (39 + 109 - 27 + 24);
        w.lIllIlII[14] = 0xFFFF87F7 & 0x7F7D;
        w.lIllIlII[15] = 3 ^ 6;
        w.lIllIlII[16] = 0xFFFF896E & 0x7EB5;
        w.lIllIlII[17] = 0x83 ^ 0x85;
        w.lIllIlII[18] = 0xFFFF835D & 0x7EF2;
        w.lIllIlII[19] = -(51 + 19 - -1 + 96) & (0xFFFFFDFF & 0x33F7);
        w.lIllIlII[20] = -(0xFFFFFF9F & 0x7C79) & (0xFFFFFFFB & Short.MAX_VALUE);
        w.lIllIlII[21] = 0x32 ^ 0x3C ^ (0x1E ^ 0x22);
        w.lIllIlII[22] = 0xFFFFCBD7 & 0x3DFE;
        w.lIllIlII[23] = 0xB9 ^ 0xB1;
        w.lIllIlII[24] = 122 + 71 - 98 + 48 ^ 119 + 122 - 182 + 75;
        w.lIllIlII[25] = -(0xFFFFFF9F & 0x6363) & (0xFFFFFFDF & 0x6FFF);
        w.lIllIlII[26] = 0xFFFFEFF7 & 0x1C7E;
        w.lIllIlII[27] = 201 + 251 - 400 + 203 ^ 31 + 5 - 8 + 109;
        w.lIllIlII[28] = (0x5F ^ 0x48) + (0xA2 ^ 0xB4) - -(0x86 ^ 0x9A) + (0x3B ^ 0x7B);
        w.lIllIlII[29] = -" ".length();
        w.lIllIlII[30] = 0xF ^ 0x1E ^ (0x3D ^ 0x27);
        w.lIllIlII[31] = 17 + 77 - 55 + 108 ^ 83 + 143 - 164 + 97;
        w.lIllIlII[32] = -(0xFFFFFDCD & 0x7A76) & (0xFFFFFBFF & 0x7D6F);
        w.lIllIlII[33] = 0x64 ^ 0x2B ^ (0xDF ^ 0x9D);
        w.lIllIlII[34] = 0x32 ^ 0x70 ^ (9 ^ 0x45);
        w.lIllIlII[35] = 0x37 ^ 0x27;
        w.lIllIlII[36] = 17 + 71 - -78 + 38 ^ 131 + 135 - 140 + 69;
        w.lIllIlII[37] = 0x75 ^ 0x64;
        w.lIllIlII[38] = 0x65 ^ 0x39 ^ (0x38 ^ 0x76);
        w.lIllIlII[39] = 0x46 ^ 0x55;
        w.lIllIlII[40] = 0xD ^ 0x19;
        w.lIllIlII[41] = 0x1F ^ 5 ^ (0x91 ^ 0x9E);
        w.lIllIlII[42] = 0xF8 ^ 0x92 ^ (0x78 ^ 4);
        w.lIllIlII[43] = 0xC ^ 0x1B;
        w.lIllIlII[44] = 170 + 118 - 248 + 148 ^ 104 + 112 - 56 + 4;
        w.lIllIlII[45] = 0x38 ^ 0x15 ^ (0xAB ^ 0x9F);
        w.lIllIlII[46] = 0x3E ^ 0x40 ^ (0xC2 ^ 0xA6);
        w.lIllIlII[47] = 0x66 ^ 0x7D;
        w.lIllIlII[48] = 0xA5 ^ 0x97 ^ (0x9F ^ 0xB1);
        w.lIllIlII[49] = 0x6F ^ 0x71;
        w.lIllIlII[50] = 0x6E ^ 0x1B ^ (0xFA ^ 0x90);
        w.lIllIlII[51] = -(0xFFFFFE86 & 0x597F) & (0xFFFFFBFD & 0x7F2F);
        w.lIllIlII[52] = -(0xFFFFFFF9 & 0x7807) & (0xFFFFFFE4 & 0x7B9F);
        w.lIllIlII[53] = 0xFFFFDF7E & 0x27ED;
        w.lIllIlII[54] = -(0xFFFFF765 & 0x599E) & (0xFFFFFFCF & Short.MAX_VALUE);
        w.lIllIlII[55] = 0xFFFFFBED & 0x65BA;
        w.lIllIlII[56] = 0x94 ^ 0xBC;
        w.lIllIlII[57] = 171 + 186 - 288 + 153 ^ 145 + 19 - 123 + 145;
        w.lIllIlII[58] = 0xA0 ^ 0x80;
        w.lIllIlII[59] = 0x9B ^ 0xBA;
        w.lIllIlII[60] = 0x28 ^ 0xA;
        w.lIllIlII[61] = 0x5F ^ 0x7C;
        w.lIllIlII[62] = 95 + 144 - 201 + 131 ^ 81 + 8 - 14 + 66;
        w.lIllIlII[63] = 0xA6 ^ 0x83;
        w.lIllIlII[64] = 96 + 22 - 99 + 160 ^ 112 + 132 - 217 + 122;
        w.lIllIlII[65] = 0x4C ^ 0x6B;
        w.lIllIlII[66] = 0x13 ^ 0x3A;
        w.lIllIlII[67] = 0xFFFF9C8F & 0x6FF7;
        w.lIllIlII[68] = 0xFFFFBDEF & 0x4E9E;
        w.lIllIlII[69] = 0xFFFFEDB6 & 0x1F7F;
        w.lIllIlII[70] = 0xFFFFBDCB & 0x4EF7;
        w.lIllIlII[71] = 0x4C ^ 0x66;
        w.lIllIlII[72] = 0x14 ^ 0x3F;
        w.lIllIlII[73] = 117 + 6 - 55 + 170 ^ 81 + 159 - 168 + 122;
        w.lIllIlII[74] = 44 + 153 - 137 + 125 ^ 33 + 82 - 92 + 125;
        w.lIllIlII[75] = 0x8F ^ 0xA1;
        w.lIllIlII[76] = 43 + 126 - 8 + 9 ^ 116 + 121 - 178 + 74;
        w.lIllIlII[77] = 134 + 45 - 115 + 177 ^ 142 + 161 - 154 + 44;
        w.lIllIlII[78] = 3 ^ 0x32;
    }

    private static boolean lIIlIllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (w.lIIlIlllIlI(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            bl = lIllIlII[3];
            "".length();
            if (((0x6B ^ 0x37) & ~(0xD2 ^ 0x8E)) >= (2 ^ 6)) {
                return ((0xA3 ^ 0xA5) & ~(0xAA ^ 0xAC)) != 0;
            }
        } else {
            bl = lIllIlII[4];
        }
        return bl;
    }

    @Override
    public boolean T() {
        return lIllIlII[4];
    }

    private static String lIIlIlIlIII(String lIllIIlllIlIIIl, String lIllIIlllIIlllI) {
        try {
            SecretKeySpec lIllIIlllIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIlllIlIIll = Cipher.getInstance("Blowfish");
            lIllIIlllIlIIll.init(lIllIlII[1], lIllIIlllIlIlII);
            return new String(lIllIIlllIlIIll.doFinal(Base64.getDecoder().decode(lIllIIlllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIlllIlIIlI) {
            lIllIIlllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlllIIl(Object object) {
        return object == null;
    }

    private static String lIIlIlIIlll(String lIllIIllllIIllI, String lIllIIllllIIlIl) {
        lIllIIllllIIllI = new String(Base64.getDecoder().decode(lIllIIllllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIllllIIlII = new StringBuilder();
        char[] lIllIIllllIIIll = lIllIIllllIIlIl.toCharArray();
        int lIllIIllllIIIlI = lIllIlII[4];
        char[] lIllIIlllIlllII = lIllIIllllIIllI.toCharArray();
        int lIllIIlllIllIll = lIllIIlllIlllII.length;
        int lIllIIlllIllIlI = lIllIlII[4];
        while (w.lIIlIllIIII(lIllIIlllIllIlI, lIllIIlllIllIll)) {
            char lIllIIllllIIlll = lIllIIlllIlllII[lIllIIlllIllIlI];
            lIllIIllllIIlII.append((char)(lIllIIllllIIlll ^ lIllIIllllIIIll[lIllIIllllIIIlI % lIllIIllllIIIll.length]));
            "".length();
            ++lIllIIllllIIIlI;
            ++lIllIIlllIllIlI;
            "".length();
            if ("  ".length() == "  ".length()) continue;
            return null;
        }
        return String.valueOf(lIllIIllllIIlII);
    }

    private static void lIIlIlIllIl() {
        lIllIIlI = new String[lIllIlII[21]];
        w.lIllIIlI[w.lIllIlII[4]] = w.lIIlIlIIlll("ERsCHAQ/FwhVFSILBRsQdxsYEBokXkwGAD4GDx0eORVMFxY0GUwBGHcDGRAEIw==", "Wrluw");
        w.lIllIIlI[w.lIllIlII[3]] = w.lIIlIlIlIII("vwBHWl1JdMZq4VVT68wbmA==", "VOYbO");
        w.lIllIIlI[w.lIllIlII[1]] = w.lIIlIlIlIIl("xCjluUUY1BIzhGXN4NfxAyMMBfw6Drtr", "PIqKY");
        w.lIllIIlI[w.lIllIlII[12]] = w.lIIlIlIIlll("BgFhCRo0RCwBGyINLw9IIBEkGxxxFzQYGD0NJBtEcRc2ARwyDCgGD3EQLkgqBD0IJi8=", "QdAhh");
        w.lIllIIlI[w.lIllIlII[7]] = w.lIIlIlIlIII("fP5owRyj0hI=", "IWwLG");
        w.lIllIIlI[w.lIllIlII[15]] = w.lIIlIlIIlll("IjsAbzsDegU7Lh4u", "lZvOO");
        w.lIllIIlI[w.lIllIlII[17]] = w.lIIlIlIlIIl("Ftdt3jfnHY+40iy6ZKt/IA==", "uTlWe");
        w.lIllIIlI[w.lIllIlII[8]] = w.lIIlIlIlIIl("DIuxFEbJEGA=", "LXLpb");
        w.lIllIIlI[w.lIllIlII[23]] = w.lIIlIlIlIII("A9L3FbAlypha4DjUO3LRlw==", "ZxDYA");
        w.lIllIIlI[w.lIllIlII[24]] = w.lIIlIlIIlll("PgA4ZCUfQTwrJQQEIGQlHwwvMD4=", "paNDQ");
        w.lIllIIlI[w.lIllIlII[2]] = w.lIIlIlIIlll("JAobPg==", "sozLm");
        w.lIllIIlI[w.lIllIlII[30]] = w.lIIlIlIlIII("1vOe3BPtuPBDvucU9wtnIA==", "dfbuf");
        w.lIllIIlI[w.lIllIlII[31]] = w.lIIlIlIlIII("f/IXlRdQrcGXA1NwWykqdg==", "osTxL");
        w.lIllIIlI[w.lIllIlII[33]] = w.lIIlIlIIlll("Hw8mPC8=", "YnBPF");
        w.lIllIIlI[w.lIllIlII[34]] = w.lIIlIlIlIIl("sZs2a6coaIY=", "bRazn");
        w.lIllIIlI[w.lIllIlII[36]] = w.lIIlIlIlIIl("BdZyJ7BHtkI=", "WTCIy");
        w.lIllIIlI[w.lIllIlII[35]] = w.lIIlIlIlIII("hsmWmL5j/hk=", "qETtH");
        w.lIllIIlI[w.lIllIlII[37]] = w.lIIlIlIlIII("id3XWQPoem2eJ1Ji+zZPkg==", "wZwvK");
        w.lIllIIlI[w.lIllIlII[38]] = w.lIIlIlIIlll("LzwXPQ8=", "lPxNj");
        w.lIllIIlI[w.lIllIlII[39]] = w.lIIlIlIIlll("BR4kPwZjDj03ATc=", "ClQVr");
        w.lIllIIlI[w.lIllIlII[40]] = w.lIIlIlIlIII("wuiD6dK07+tdjNRupmNVSA==", "ipDmU");
        w.lIllIIlI[w.lIllIlII[41]] = w.lIIlIlIlIII("WIU8yp3XjpY=", "pJNil");
        w.lIllIIlI[w.lIllIlII[42]] = w.lIIlIlIIlll("AzkcMgEiNhV2CSI5HjkK", "KXrVm");
        w.lIllIIlI[w.lIllIlII[43]] = w.lIIlIlIlIIl("5KvbM7wPNNk=", "FuLYN");
        w.lIllIIlI[w.lIllIlII[44]] = w.lIIlIlIlIIl("13lgWsZdXPk=", "Efcfo");
        w.lIllIIlI[w.lIllIlII[45]] = w.lIIlIlIlIII("tzzi6Pd8zXE=", "fsZty");
        w.lIllIIlI[w.lIllIlII[46]] = w.lIIlIlIlIIl("CF4aJHl02xE=", "uuIqH");
        w.lIllIIlI[w.lIllIlII[47]] = w.lIIlIlIIlll("Ix83Fx8PHyRSHwkeLg==", "fqCrm");
        w.lIllIIlI[w.lIllIlII[48]] = w.lIIlIlIlIIl("erIBXbC/nPo=", "yyEFg");
        w.lIllIIlI[w.lIllIlII[0]] = w.lIIlIlIlIII("tFDLURXmAHY=", "OBkFS");
        w.lIllIIlI[w.lIllIlII[49]] = w.lIIlIlIlIIl("nGO4UR67PsP2urzcuZrQDQ==", "gyXxl");
        w.lIllIIlI[w.lIllIlII[50]] = w.lIIlIlIlIIl("bF88g7+htOem96X3M9tQUw==", "KmEDa");
        w.lIllIIlI[w.lIllIlII[58]] = w.lIIlIlIlIII("bIU5z2XH+M6P/QZyax434A==", "RblBm");
        w.lIllIIlI[w.lIllIlII[59]] = w.lIIlIlIlIIl("5gHti7lyVcwoecasCmXFBAYO/zxN+kVt", "nFGwC");
        w.lIllIIlI[w.lIllIlII[60]] = w.lIIlIlIIlll("Dxk9Gx0FCw==", "klXwt");
        w.lIllIIlI[w.lIllIlII[61]] = w.lIIlIlIlIIl("bphlrED9g0M=", "uvrVl");
        w.lIllIIlI[w.lIllIlII[62]] = w.lIIlIlIlIIl("11bYVtDTEUI=", "irVJp");
        w.lIllIIlI[w.lIllIlII[63]] = w.lIIlIlIlIIl("q7dr7X1h54k=", "BYZeF");
        w.lIllIIlI[w.lIllIlII[64]] = w.lIIlIlIlIIl("c6+FvGd006s=", "vFryi");
        w.lIllIIlI[w.lIllIlII[65]] = w.lIIlIlIlIII("D8jqmIwxe1U=", "Jjtdh");
        w.lIllIIlI[w.lIllIlII[56]] = w.lIIlIlIlIIl("WzipSbVDwMQ=", "KKhxk");
        w.lIllIIlI[w.lIllIlII[66]] = w.lIIlIlIlIIl("XRWaYSYsl4Q=", "pGUiV");
        w.lIllIIlI[w.lIllIlII[71]] = w.lIIlIlIlIII("n+gCw87QvXlsymSTdZMTIgVUnmnYoC2E", "wBZYf");
        w.lIllIIlI[w.lIllIlII[72]] = w.lIIlIlIlIII("Q2mztCfxRoIqytTT8ENcBvpolsCXmnst6NBfsIw32uUcFUimePzsCtrmbQ95ZewH", "BsezA");
        w.lIllIIlI[w.lIllIlII[73]] = w.lIIlIlIlIIl("aa1gmujnzU1P99b8qAKqHDNjwm6wXOOWt4owTrnBMqrZH7AjpzeIJE6E/m4zEmgE", "QOWil");
        w.lIllIIlI[w.lIllIlII[74]] = w.lIIlIlIlIIl("O6+ugJjPFkc=", "TtSIk");
        w.lIllIIlI[w.lIllIlII[75]] = w.lIIlIlIlIII("2asb/zYTOdLjhxci1+UQ1A==", "pzwqs");
        w.lIllIIlI[w.lIllIlII[76]] = w.lIIlIlIlIIl("i1obf48MRrZyUigiPr+2RfUsy349SoUoBHEsxSmBRMBW7tatySau6w==", "zHBnB");
        w.lIllIIlI[w.lIllIlII[77]] = w.lIIlIlIlIIl("4qvZZB2RqF9bIP9v8zqBBZzgRG3hXC2QlPXJNikrfAU=", "rBSic");
        w.lIllIIlI[w.lIllIlII[78]] = w.lIIlIlIlIII("QrPUlDA7YzKKAhI+nqV1pP+m39q+pY5txG7uIcxi/aw=", "sSWfm");
    }

    static {
        w.lIIlIlIllll();
        w.lIIlIlIllIl();
        dh = new WorldPoint(lIllIlII[67], lIllIlII[68], lIllIlII[4]);
        di = new WorldPoint(lIllIlII[69], lIllIlII[70], lIllIlII[4]);
        bB = new ArrayList<d>();
        String[] stringArray = new String[lIllIlII[23]];
        stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[71]];
        stringArray[w.lIllIlII[3]] = lIllIIlI[lIllIlII[72]];
        stringArray[w.lIllIlII[1]] = lIllIIlI[lIllIlII[73]];
        stringArray[w.lIllIlII[12]] = lIllIIlI[lIllIlII[74]];
        stringArray[w.lIllIlII[7]] = lIllIIlI[lIllIlII[75]];
        stringArray[w.lIllIlII[15]] = lIllIIlI[lIllIlII[76]];
        stringArray[w.lIllIlII[17]] = lIllIIlI[lIllIlII[77]];
        stringArray[w.lIllIlII[8]] = lIllIIlI[lIllIlII[78]];
        bX = stringArray;
    }

    private static boolean lIIlIlllIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String V() {
        return lIllIIlI[lIllIlII[58]];
    }

    private static boolean lIIlIllIlIl(Object object) {
        return object != null;
    }

    private static String lIIlIlIlIIl(String lIllIIlllIIIlII, String lIllIIlllIIIIIl) {
        try {
            SecretKeySpec lIllIIlllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIlllIIIIIl.getBytes(StandardCharsets.UTF_8)), lIllIlII[23]), "DES");
            Cipher lIllIIlllIIIllI = Cipher.getInstance("DES");
            lIllIIlllIIIllI.init(lIllIlII[1], lIllIIlllIIIlll);
            return new String(lIllIIlllIIIllI.doFinal(Base64.getDecoder().decode(lIllIIlllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIlllIIIlIl) {
            lIllIIlllIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIllIllI(int n2) {
        return n2 > 0;
    }

    private static void ag() {
        block16: {
            d lIllIIlllllIIll;
            block15: {
                Object lIllIIlllllIlII;
                block14: {
                    block13: {
                        int[] nArray = new int[lIllIlII[3]];
                        nArray[w.lIllIlII[4]] = lIllIlII[19];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIllIlII[19], lIllIlII[2], i.bw);
                            bB.add(d2);
                            "".length();
                        }
                        int[] nArray2 = new int[lIllIlII[3]];
                        nArray2[w.lIllIlII[4]] = lIllIlII[11];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lIllIIlllllIlII = new d(lIllIlII[11], lIllIlII[3], lIllIlII[51]);
                            bB.add((d)lIllIIlllllIlII);
                            "".length();
                        }
                        int[] nArray3 = new int[lIllIlII[3]];
                        nArray3[w.lIllIlII[4]] = lIllIlII[14];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lIllIIlllllIlII = new d(lIllIlII[14], lIllIlII[3], lIllIlII[51]);
                            bB.add((d)lIllIIlllllIlII);
                            "".length();
                        }
                        int[] nArray4 = new int[lIllIlII[3]];
                        nArray4[w.lIllIlII[4]] = lIllIlII[18];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lIllIIlllllIlII = new d(lIllIlII[18], lIllIlII[3], lIllIlII[51]);
                            bB.add((d)lIllIIlllllIlII);
                            "".length();
                        }
                        int[] nArray5 = new int[lIllIlII[3]];
                        nArray5[w.lIllIlII[4]] = lIllIlII[16];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lIllIIlllllIlII = new d(lIllIlII[16], lIllIlII[3], lIllIlII[51]);
                            bB.add((d)lIllIIlllllIlII);
                            "".length();
                        }
                        int[] nArray6 = new int[lIllIlII[3]];
                        nArray6[w.lIllIlII[4]] = lIllIlII[13];
                        if (w.lIIlIllIlII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIllIIlllllIlII = new d(lIllIlII[13], lIllIlII[3], lIllIlII[52]);
                            bB.add((d)lIllIIlllllIlII);
                            "".length();
                        }
                        int[] nArray7 = new int[lIllIlII[3]];
                        nArray7[w.lIllIlII[4]] = lIllIlII[10];
                        if (!w.lIIlIllIIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block13;
                        int[] nArray8 = new int[lIllIlII[3]];
                        nArray8[w.lIllIlII[4]] = lIllIlII[10];
                        if (!w.lIIlIllIIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                        int[] nArray9 = new int[lIllIlII[3]];
                        nArray9[w.lIllIlII[4]] = lIllIlII[10];
                        if (!w.lIIlIllIIII(Bank.getFirst((int[])nArray9).getQuantity(), lIllIlII[2])) break block14;
                    }
                    lIllIIlllllIlII = new d(lIllIlII[10], lIllIlII[2], lIllIlII[53]);
                    bB.add((d)lIllIIlllllIlII);
                    "".length();
                }
                if (w.lIIlIllIlII(Bank.contains((Predicate)(lIllIIlllllIlII = item -> item.getName().toLowerCase().contains(lIllIIlI[lIllIlII[59]]))) ? 1 : 0)) {
                    lIllIIlllllIIll = new d(lIllIlII[54], lIllIlII[15], lIllIlII[55]);
                    bB.add(lIllIIlllllIIll);
                    "".length();
                }
                int[] nArray = new int[lIllIlII[3]];
                nArray[w.lIllIlII[4]] = lIllIlII[9];
                if (!w.lIIlIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block15;
                int[] nArray10 = new int[lIllIlII[3]];
                nArray10[w.lIllIlII[4]] = lIllIlII[9];
                if (!w.lIIlIllIIll(Bank.contains((int[])nArray10) ? 1 : 0)) break block16;
                int[] nArray11 = new int[lIllIlII[3]];
                nArray11[w.lIllIlII[4]] = lIllIlII[9];
                if (!w.lIIlIllIIII(Bank.getFirst((int[])nArray11).getQuantity(), lIllIlII[2])) break block16;
            }
            lIllIIlllllIIll = new d(lIllIlII[9], lIllIlII[56], lIllIlII[52]);
            bB.add(lIllIIlllllIIll);
            "".length();
        }
    }

    public static void bg() {
        String[] stringArray = new String[lIllIlII[3]];
        stringArray[w.lIllIlII[4]] = lIllIIlI[lIllIlII[46]];
        if (w.lIIlIlllIIl(NPCs.getNearest((String[])stringArray))) {
            if (w.lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                if (w.lIIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo((WorldPoint)dh);
                "".length();
                Time.sleepTicks((int)lIllIlII[3]);
                "".length();
            }
            if (w.lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                AccBuilderBarrows.c = lIllIIlI[lIllIlII[47]];
                String[] stringArray2 = new String[lIllIlII[3]];
                stringArray2[w.lIllIlII[4]] = lIllIIlI[lIllIlII[48]];
                TileObjects.getNearest((String[])stringArray2).interact(lIllIIlI[lIllIlII[0]]);
                Time.sleepTicks((int)lIllIlII[1]);
                "".length();
            }
        }
    }
}

