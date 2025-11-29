package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.w  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/w.class */
public class w implements F {
    static /* synthetic */ boolean cj;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] lIllIIlI;
    public static /* synthetic */ List<C0003d> bB;
    static /* synthetic */ int ci;
    private static /* synthetic */ int[] lIllIlII;
    public static final /* synthetic */ WorldPoint dh;
    public static final /* synthetic */ WorldPoint di;
    private static /* synthetic */ String[] bX;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ac() {
        String[] strArr = new String[lIllIlII[3]];
        strArr[lIllIlII[4]] = lIllIIlI[lIllIlII[49]];
        if (lIIlIllIllI(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIllIlII[3]];
            iArr[lIllIlII[4]] = lIllIlII[14];
            if (lIIlIllIllI(Inventory.getCount(iArr))) {
                String[] strArr2 = new String[lIllIlII[3]];
                strArr2[lIllIlII[4]] = lIllIIlI[lIllIlII[50]];
                if (lIIlIllIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                    int[] iArr2 = new int[lIllIlII[3]];
                    iArr2[lIllIlII[4]] = lIllIlII[18];
                    if (lIIlIllIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIllIlII[3]];
                        iArr3[lIllIlII[4]] = lIllIlII[11];
                        if (lIIlIllIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                            ?? r0 = lIllIlII[3];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                }
            }
        }
        return lIllIlII[4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v300, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v322, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    public static void bf() {
        if (lIIlIllIIII(C0004e.j(lIllIlII[0]), lIllIlII[1])) {
            A.bD();
        }
        if (lIIlIllIIII(Skills.getLevel(Skill.COOKING), lIllIlII[2]) && lIIlIllIIIl(C0004e.j(lIllIlII[0]), lIllIlII[1])) {
            L.cC();
        }
        if (lIIlIllIIlI(Skills.getLevel(Skill.COOKING), lIllIlII[2]) && lIIlIllIIIl(C0004e.j(lIllIlII[0]), lIllIlII[1])) {
            if (lIIlIllIIll(bz ? 1 : 0)) {
                C0001b.a(bB);
                if (lIIlIllIIII(bB.size(), lIllIlII[3])) {
                    System.out.println(lIllIIlI[lIllIlII[4]]);
                    bz = lIllIlII[4];
                }
            }
            if (lIIlIllIlII(bz ? 1 : 0)) {
                if (lIIlIllIlII(ac() ? 1 : 0) && lIIlIllIlII(C0004e.j(lIllIlII[5]))) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIIlIllIlIl(nearest) && lIIlIllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIllIIlI[lIllIlII[3]];
                        C0000a.a(nearest);
                    }
                    if (lIIlIllIlIl(nearest) && lIIlIllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIlIllIlII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIllIlII[6]);
                            "".length();
                        }
                        if (lIIlIllIIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = lIllIIlI[lIllIlII[1]];
                            if (lIIlIllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIllIlII[7]);
                                "".length();
                            }
                            if (lIIlIllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIllIlII[1]);
                                "".length();
                            }
                            int[] iArr = new int[lIllIlII[8]];
                            iArr[lIllIlII[4]] = lIllIlII[9];
                            iArr[lIllIlII[3]] = lIllIlII[10];
                            iArr[lIllIlII[1]] = lIllIlII[11];
                            iArr[lIllIlII[12]] = lIllIlII[13];
                            iArr[lIllIlII[7]] = lIllIlII[14];
                            iArr[lIllIlII[15]] = lIllIlII[16];
                            iArr[lIllIlII[17]] = lIllIlII[18];
                            if (lIIlIllIlII(C0004e.b(iArr) ? 1 : 0)) {
                                ag();
                                System.out.println(lIllIIlI[lIllIlII[12]]);
                                bz = lIllIlII[3];
                                return;
                            }
                            int[] iArr2 = new int[lIllIlII[8]];
                            iArr2[lIllIlII[4]] = lIllIlII[9];
                            iArr2[lIllIlII[3]] = lIllIlII[10];
                            iArr2[lIllIlII[1]] = lIllIlII[11];
                            iArr2[lIllIlII[12]] = lIllIlII[13];
                            iArr2[lIllIlII[7]] = lIllIlII[14];
                            iArr2[lIllIlII[15]] = lIllIlII[16];
                            iArr2[lIllIlII[17]] = lIllIlII[18];
                            if (lIIlIllIIll(C0004e.b(iArr2) ? 1 : 0)) {
                                C0000a.a(lIllIlII[9], lIllIlII[2]);
                                C0000a.a(lIllIlII[10], lIllIlII[2]);
                                C0000a.a(lIllIlII[11], lIllIlII[3]);
                                C0000a.a(lIllIlII[13], lIllIlII[3]);
                                C0000a.a(lIllIlII[14], lIllIlII[3]);
                                C0000a.a(lIllIlII[16], lIllIlII[3]);
                                C0000a.a(lIllIlII[18], lIllIlII[3]);
                                C0000a.a(lIllIlII[19], lIllIlII[1]);
                                C0000a.a(lIllIlII[20], lIllIlII[6]);
                            }
                        }
                    }
                }
                if (lIIlIllIIll(Inventory.contains(C0005f.bb) ? 1 : 0) && lIIlIllIIII(Movement.getRunEnergy(), lIllIlII[21])) {
                    Inventory.getFirst(C0005f.bb).interact(lIllIIlI[lIllIlII[7]]);
                    Time.sleepTicks(lIllIlII[3]);
                    "".length();
                }
                if (lIIlIllIlII(C0004e.j(lIllIlII[5])) && lIIlIllIIll(ac() ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllIIlI[lIllIlII[15]];
                    if (lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                        if (lIIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(dh);
                        "".length();
                        Time.sleepTicks(lIllIlII[3]);
                        "".length();
                    }
                    if (lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                        AccBuilderBarrows.c = lIllIIlI[lIllIlII[17]];
                        C0006g.a(lIllIIlI[lIllIlII[8]], bX);
                    }
                }
                if (lIIlIllIIIl(C0004e.j(lIllIlII[5]), lIllIlII[3])) {
                    int[] iArr3 = new int[lIllIlII[3]];
                    iArr3[lIllIlII[4]] = lIllIlII[22];
                    if (lIIlIllIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                        String[] strArr = new String[lIllIlII[3]];
                        strArr[lIllIlII[4]] = lIllIIlI[lIllIlII[23]];
                        if (lIIlIllIlII(Inventory.contains(strArr) ? 1 : 0)) {
                            ci = lIllIlII[4];
                            if (lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), lIllIlII[7])) {
                                AccBuilderBarrows.c = lIllIIlI[lIllIlII[24]];
                                WorldArea worldArea = new WorldArea(lIllIlII[25], lIllIlII[26], lIllIlII[27], lIllIlII[28], lIllIlII[4]);
                                if (lIIlIllIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIIlIllIIll(Inventory.contains(item -> {
                                        return item.getName().contains(lIllIIlI[lIllIlII[66]]);
                                    }) ? 1 : 0) && lIIlIllIlII(Equipment.contains(item2 -> {
                                        return item2.getName().contains(lIllIIlI[lIllIlII[56]]);
                                    }) ? 1 : 0)) {
                                        Inventory.getFirst(item3 -> {
                                            return item3.getName().contains(lIllIIlI[lIllIlII[65]]);
                                        }).interact(lIllIIlI[lIllIlII[2]]);
                                    }
                                    if (lIIlIllIIll(Equipment.contains(item4 -> {
                                        return item4.getName().contains(lIllIIlI[lIllIlII[64]]);
                                    }) ? 1 : 0) && lIIlIllIIIl(Players.getLocal().getAnimation(), lIllIlII[29])) {
                                        Equipment.getFirst(item5 -> {
                                            return item5.getName().contains(lIllIIlI[lIllIlII[63]]);
                                        }).interact(lIllIIlI[lIllIlII[30]]);
                                        Time.sleepTicks(lIllIlII[7]);
                                        "".length();
                                    }
                                }
                                if (lIIlIllIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo(di);
                                    "".length();
                                    Time.sleepTicks(lIllIlII[3]);
                                    "".length();
                                }
                            }
                            if (lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(di), lIllIlII[7])) {
                                AccBuilderBarrows.c = lIllIIlI[lIllIlII[31]];
                                if (lIIlIllIIll(Widgets.get(lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                    String[] strArr2 = new String[lIllIlII[3]];
                                    strArr2[lIllIlII[4]] = lIllIIlI[lIllIlII[33]];
                                    NPCs.getNearest(strArr2).interact(lIllIIlI[lIllIlII[34]]);
                                    Time.sleepTicks(lIllIlII[12]);
                                    "".length();
                                }
                                if (lIIlIllIlII(Widgets.get(lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(lIllIlII[32], lIllIlII[35], lIllIlII[3]).interact(lIllIIlI[lIllIlII[36]]);
                                    Time.sleepTicks(lIllIlII[1]);
                                    "".length();
                                }
                                int[] iArr4 = new int[lIllIlII[3]];
                                iArr4[lIllIlII[4]] = lIllIlII[22];
                                if (lIIlIllIIll(Inventory.contains(iArr4) ? 1 : 0) && lIIlIllIlII(Widgets.get(lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(lIllIlII[32], lIllIlII[3], lIllIlII[30]).interact(lIllIIlI[lIllIlII[35]]);
                                    Time.sleepTicks(lIllIlII[3]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIllIlII[3]];
                    iArr5[lIllIlII[4]] = lIllIlII[22];
                    if (lIIlIllIIll(Inventory.contains(iArr5) ? 1 : 0)) {
                        String[] strArr3 = new String[lIllIlII[3]];
                        strArr3[lIllIlII[4]] = lIllIIlI[lIllIlII[37]];
                        if (lIIlIllIlII(Inventory.contains(strArr3) ? 1 : 0)) {
                            int[] iArr6 = new int[lIllIlII[3]];
                            iArr6[lIllIlII[4]] = lIllIlII[22];
                            if (lIIlIllIIll(Inventory.contains(iArr6) ? 1 : 0) && lIIlIllIlII(Widgets.get(lIllIlII[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get(lIllIlII[32], lIllIlII[3], lIllIlII[30]).interact(lIllIIlI[lIllIlII[38]]);
                                Time.sleepTicks(lIllIlII[3]);
                                "".length();
                            }
                            int[] iArr7 = new int[lIllIlII[3]];
                            iArr7[lIllIlII[4]] = lIllIlII[18];
                            Item first = Inventory.getFirst(iArr7);
                            String[] strArr4 = new String[lIllIlII[3]];
                            strArr4[lIllIlII[4]] = lIllIIlI[lIllIlII[39]];
                            first.useOn(Inventory.getFirst(strArr4));
                            Time.sleepTicks(lIllIlII[1]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[lIllIlII[3]];
                    strArr5[lIllIlII[4]] = lIllIIlI[lIllIlII[40]];
                    if (lIIlIllIIll(Inventory.contains(strArr5) ? 1 : 0)) {
                        if (lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                            if (lIIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (lIIlIllIIll(Inventory.contains(item6 -> {
                                return item6.getName().contains(lIllIIlI[lIllIlII[62]]);
                            }) ? 1 : 0) && lIIlIllIlII(Equipment.contains(item7 -> {
                                return item7.getName().contains(lIllIIlI[lIllIlII[61]]);
                            }) ? 1 : 0)) {
                                Inventory.getFirst(item8 -> {
                                    return item8.getName().contains(lIllIIlI[lIllIlII[60]]);
                                }).interact(lIllIIlI[lIllIlII[41]]);
                                Time.sleepTicks(lIllIlII[1]);
                                "".length();
                            }
                            Movement.walkTo(dh);
                            "".length();
                            Time.sleepTicks(lIllIlII[3]);
                            "".length();
                        }
                        if (lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                            AccBuilderBarrows.c = lIllIIlI[lIllIlII[42]];
                            if (lIIlIllIIII(ci, lIllIlII[3])) {
                                Q.kX += lIllIlII[3];
                                Q.o(AccBuilderBarrows.m);
                                ci += lIllIlII[3];
                                Q.kX = lIllIlII[4];
                                cj = lIllIlII[4];
                            }
                            C0006g.a(lIllIIlI[lIllIlII[43]], bX);
                        }
                    }
                }
                if (lIIlIllIIIl(C0004e.j(lIllIlII[5]), lIllIlII[1])) {
                    String[] strArr6 = new String[lIllIlII[3]];
                    strArr6[lIllIlII[4]] = lIllIIlI[lIllIlII[44]];
                    TileObjects.getNearest(strArr6).interact(lIllIIlI[lIllIlII[45]]);
                    Time.sleepTicks(lIllIlII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIlIllIIIl(int i, int i2) {
        return i == i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            System.out.println("678: " + C0004e.j(lIllIlII[5]));
            bf();
            "".length();
            if (((((11 + 89) - (-28)) + 13) ^ (((108 + 3) - (-19)) + 6)) <= 0) {
                return ((((89 + 203) - 158) + 89) ^ (((92 + 63) - 37) + 28)) & (((42 ^ 78) ^ (167 ^ 142)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIllIlII[57];
    }

    private static void lIIlIlIllll() {
        lIllIlII = new int[79];
        lIllIlII[0] = (((63 + 120) - 147) + 122) ^ (((25 + 75) - 8) + 39);
        lIllIlII[1] = "  ".length();
        lIllIlII[2] = 170 ^ 160;
        lIllIlII[3] = " ".length();
        lIllIlII[4] = (202 ^ 138) & ((247 ^ 183) ^ (-1));
        lIllIlII[5] = (-20505) & 21182;
        lIllIlII[6] = (-((-8842) & 27357)) & (-8225) & 31739;
        lIllIlII[7] = (((23 + 0) - 6) + 129) ^ (((142 + 104) - 192) + 96);
        lIllIlII[8] = 73 ^ 78;
        lIllIlII[9] = (-(163 ^ 154)) & (-16385) & 24447;
        lIllIlII[10] = (-((-5442) & 21975)) & (-1) & 24541;
        lIllIlII[11] = (-((-19169) & 20199)) & (-8193) & 11774;
        lIllIlII[12] = "   ".length();
        lIllIlII[13] = (((88 ^ 9) + (((26 + 88) - 91) + 126)) - (((72 + 153) - 166) + 95)) + ((39 + 109) - 27) + 24;
        lIllIlII[14] = (-30729) & 32637;
        lIllIlII[15] = 3 ^ 6;
        lIllIlII[16] = (-30354) & 32437;
        lIllIlII[17] = 131 ^ 133;
        lIllIlII[18] = (-31907) & 32498;
        lIllIlII[19] = (-(((51 + 19) - (-1)) + 96)) & (-513) & 13303;
        lIllIlII[20] = (-((-97) & 31865)) & (-5) & 32767;
        lIllIlII[21] = (50 ^ 60) ^ (30 ^ 34);
        lIllIlII[22] = (-13353) & 15870;
        lIllIlII[23] = 185 ^ 177;
        lIllIlII[24] = (((122 + 71) - 98) + 48) ^ (((119 + 122) - 182) + 75);
        lIllIlII[25] = (-((-97) & 25443)) & (-33) & 28671;
        lIllIlII[26] = (-4105) & 7294;
        lIllIlII[27] = (((201 + 251) - 400) + 203) ^ (((31 + 5) - 8) + 109);
        lIllIlII[28] = (((95 ^ 72) + (162 ^ 180)) - (-(134 ^ 154))) + (59 ^ 123);
        lIllIlII[29] = -" ".length();
        lIllIlII[30] = (15 ^ 30) ^ (61 ^ 39);
        lIllIlII[31] = (((17 + 77) - 55) + 108) ^ (((83 + 143) - 164) + 97);
        lIllIlII[32] = (-((-563) & 31350)) & (-1025) & 32111;
        lIllIlII[33] = (100 ^ 43) ^ (223 ^ 157);
        lIllIlII[34] = (50 ^ 112) ^ (9 ^ 69);
        lIllIlII[35] = 55 ^ 39;
        lIllIlII[36] = (((17 + 71) - (-78)) + 38) ^ (((131 + 135) - 140) + 69);
        lIllIlII[37] = 117 ^ 100;
        lIllIlII[38] = (101 ^ 57) ^ (56 ^ 118);
        lIllIlII[39] = 70 ^ 85;
        lIllIlII[40] = 13 ^ 25;
        lIllIlII[41] = (31 ^ 5) ^ (145 ^ 158);
        lIllIlII[42] = (248 ^ 146) ^ (120 ^ 4);
        lIllIlII[43] = 12 ^ 27;
        lIllIlII[44] = (((170 + 118) - 248) + 148) ^ (((104 + 112) - 56) + 4);
        lIllIlII[45] = (56 ^ 21) ^ (171 ^ 159);
        lIllIlII[46] = (62 ^ 64) ^ (194 ^ 166);
        lIllIlII[47] = 102 ^ 125;
        lIllIlII[48] = (165 ^ 151) ^ (159 ^ 177);
        lIllIlII[49] = 111 ^ 113;
        lIllIlII[50] = (110 ^ 27) ^ (250 ^ 144);
        lIllIlII[51] = (-((-378) & 22911)) & (-1027) & 32559;
        lIllIlII[52] = (-((-7) & 30727)) & (-28) & 31647;
        lIllIlII[53] = (-8322) & 10221;
        lIllIlII[54] = (-((-2203) & 22942)) & (-49) & 32767;
        lIllIlII[55] = (-1043) & 26042;
        lIllIlII[56] = 148 ^ 188;
        lIllIlII[57] = (((171 + 186) - 288) + 153) ^ (((145 + 19) - 123) + 145);
        lIllIlII[58] = 160 ^ 128;
        lIllIlII[59] = 155 ^ 186;
        lIllIlII[60] = 40 ^ 10;
        lIllIlII[61] = 95 ^ 124;
        lIllIlII[62] = (((95 + 144) - 201) + 131) ^ (((81 + 8) - 14) + 66);
        lIllIlII[63] = 166 ^ 131;
        lIllIlII[64] = (((96 + 22) - 99) + 160) ^ (((112 + 132) - 217) + 122);
        lIllIlII[65] = 76 ^ 107;
        lIllIlII[66] = 19 ^ 58;
        lIllIlII[67] = (-25457) & 28663;
        lIllIlII[68] = (-16913) & 20126;
        lIllIlII[69] = (-4682) & 8063;
        lIllIlII[70] = (-16949) & 20215;
        lIllIlII[71] = 76 ^ 102;
        lIllIlII[72] = 20 ^ 63;
        lIllIlII[73] = (((117 + 6) - 55) + 170) ^ (((81 + 159) - 168) + 122);
        lIllIlII[74] = (((44 + 153) - 137) + 125) ^ (((33 + 82) - 92) + 125);
        lIllIlII[75] = 143 ^ 161;
        lIllIlII[76] = (((43 + 126) - 8) + 9) ^ (((116 + 121) - 178) + 74);
        lIllIlII[77] = (((134 + 45) - 115) + 177) ^ (((142 + 161) - 154) + 44);
        lIllIlII[78] = 3 ^ 50;
    }

    private static boolean lIIlIllIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIllIIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIIlIlllIlI(Quests.getState(Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            ?? r0 = lIllIlII[3];
            "".length();
            return ((107 ^ 55) & ((210 ^ 142) ^ (-1))) >= (2 ^ 6) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIlII[4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lIllIlII[4];
    }

    private static String lIIlIlIlIII(String lIllIIlllIlIIIl, String lIllIIlllIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIlllIlIIll = Cipher.getInstance("Blowfish");
            lIllIIlllIlIIll.init(lIllIlII[1], secretKeySpec);
            return new String(lIllIIlllIlIIll.doFinal(Base64.getDecoder().decode(lIllIIlllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIlllIlIIlI) {
            lIllIIlllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIIll(int i) {
        return i != 0;
    }

    private static boolean lIIlIlllIIl(Object obj) {
        return obj == null;
    }

    private static String lIIlIlIIlll(String lIllIIllllIIllI, String lIllIIllllIIlIl) {
        String str = new String(Base64.getDecoder().decode(lIllIIllllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIllllIIlII = new StringBuilder();
        char[] lIllIIllllIIIll = lIllIIllllIIlIl.toCharArray();
        int lIllIIllllIIIlI = lIllIlII[4];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIlII[4];
        while (lIIlIllIIII(i, length)) {
            char lIllIIllllIIlll = charArray[i];
            lIllIIllllIIlII.append((char) (lIllIIllllIIlll ^ lIllIIllllIIIll[lIllIIllllIIIlI % lIllIIllllIIIll.length]));
            "".length();
            lIllIIllllIIIlI++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lIllIIllllIIlII);
    }

    private static void lIIlIlIllIl() {
        lIllIIlI = new String[lIllIlII[21]];
        lIllIIlI[lIllIlII[4]] = lIIlIlIIlll("ERsCHAQ/FwhVFSILBRsQdxsYEBokXkwGAD4GDx0eORVMFxY0GUwBGHcDGRAEIw==", "Wrluw");
        lIllIIlI[lIllIlII[3]] = lIIlIlIlIII("vwBHWl1JdMZq4VVT68wbmA==", "VOYbO");
        lIllIIlI[lIllIlII[1]] = lIIlIlIlIIl("xCjluUUY1BIzhGXN4NfxAyMMBfw6Drtr", "PIqKY");
        lIllIIlI[lIllIlII[12]] = lIIlIlIIlll("BgFhCRo0RCwBGyINLw9IIBEkGxxxFzQYGD0NJBtEcRc2ARwyDCgGD3EQLkgqBD0IJi8=", "QdAhh");
        lIllIIlI[lIllIlII[7]] = lIIlIlIlIII("fP5owRyj0hI=", "IWwLG");
        lIllIIlI[lIllIlII[15]] = lIIlIlIIlll("IjsAbzsDegU7Lh4u", "lZvOO");
        lIllIIlI[lIllIlII[17]] = lIIlIlIlIIl("Ftdt3jfnHY+40iy6ZKt/IA==", "uTlWe");
        lIllIIlI[lIllIlII[8]] = lIIlIlIlIIl("DIuxFEbJEGA=", "LXLpb");
        lIllIIlI[lIllIlII[23]] = lIIlIlIlIII("A9L3FbAlypha4DjUO3LRlw==", "ZxDYA");
        lIllIIlI[lIllIlII[24]] = lIIlIlIIlll("PgA4ZCUfQTwrJQQEIGQlHwwvMD4=", "paNDQ");
        lIllIIlI[lIllIlII[2]] = lIIlIlIIlll("JAobPg==", "sozLm");
        lIllIIlI[lIllIlII[30]] = lIIlIlIlIII("1vOe3BPtuPBDvucU9wtnIA==", "dfbuf");
        lIllIIlI[lIllIlII[31]] = lIIlIlIlIII("f/IXlRdQrcGXA1NwWykqdg==", "osTxL");
        lIllIIlI[lIllIlII[33]] = lIIlIlIIlll("Hw8mPC8=", "YnBPF");
        lIllIIlI[lIllIlII[34]] = lIIlIlIlIIl("sZs2a6coaIY=", "bRazn");
        lIllIIlI[lIllIlII[36]] = lIIlIlIlIIl("BdZyJ7BHtkI=", "WTCIy");
        lIllIIlI[lIllIlII[35]] = lIIlIlIlIII("hsmWmL5j/hk=", "qETtH");
        lIllIIlI[lIllIlII[37]] = lIIlIlIlIII("id3XWQPoem2eJ1Ji+zZPkg==", "wZwvK");
        lIllIIlI[lIllIlII[38]] = lIIlIlIIlll("LzwXPQ8=", "lPxNj");
        lIllIIlI[lIllIlII[39]] = lIIlIlIIlll("BR4kPwZjDj03ATc=", "ClQVr");
        lIllIIlI[lIllIlII[40]] = lIIlIlIlIII("wuiD6dK07+tdjNRupmNVSA==", "ipDmU");
        lIllIIlI[lIllIlII[41]] = lIIlIlIlIII("WIU8yp3XjpY=", "pJNil");
        lIllIIlI[lIllIlII[42]] = lIIlIlIIlll("AzkcMgEiNhV2CSI5HjkK", "KXrVm");
        lIllIIlI[lIllIlII[43]] = lIIlIlIlIIl("5KvbM7wPNNk=", "FuLYN");
        lIllIIlI[lIllIlII[44]] = lIIlIlIlIIl("13lgWsZdXPk=", "Efcfo");
        lIllIIlI[lIllIlII[45]] = lIIlIlIlIII("tzzi6Pd8zXE=", "fsZty");
        lIllIIlI[lIllIlII[46]] = lIIlIlIlIIl("CF4aJHl02xE=", "uuIqH");
        lIllIIlI[lIllIlII[47]] = lIIlIlIIlll("Ix83Fx8PHyRSHwkeLg==", "fqCrm");
        lIllIIlI[lIllIlII[48]] = lIIlIlIlIIl("erIBXbC/nPo=", "yyEFg");
        lIllIIlI[lIllIlII[0]] = lIIlIlIlIII("tFDLURXmAHY=", "OBkFS");
        lIllIIlI[lIllIlII[49]] = lIIlIlIlIIl("nGO4UR67PsP2urzcuZrQDQ==", "gyXxl");
        lIllIIlI[lIllIlII[50]] = lIIlIlIlIIl("bF88g7+htOem96X3M9tQUw==", "KmEDa");
        lIllIIlI[lIllIlII[58]] = lIIlIlIlIII("bIU5z2XH+M6P/QZyax434A==", "RblBm");
        lIllIIlI[lIllIlII[59]] = lIIlIlIlIIl("5gHti7lyVcwoecasCmXFBAYO/zxN+kVt", "nFGwC");
        lIllIIlI[lIllIlII[60]] = lIIlIlIIlll("Dxk9Gx0FCw==", "klXwt");
        lIllIIlI[lIllIlII[61]] = lIIlIlIlIIl("bphlrED9g0M=", "uvrVl");
        lIllIIlI[lIllIlII[62]] = lIIlIlIlIIl("11bYVtDTEUI=", "irVJp");
        lIllIIlI[lIllIlII[63]] = lIIlIlIlIIl("q7dr7X1h54k=", "BYZeF");
        lIllIIlI[lIllIlII[64]] = lIIlIlIlIIl("c6+FvGd006s=", "vFryi");
        lIllIIlI[lIllIlII[65]] = lIIlIlIlIII("D8jqmIwxe1U=", "Jjtdh");
        lIllIIlI[lIllIlII[56]] = lIIlIlIlIIl("WzipSbVDwMQ=", "KKhxk");
        lIllIIlI[lIllIlII[66]] = lIIlIlIlIIl("XRWaYSYsl4Q=", "pGUiV");
        lIllIIlI[lIllIlII[71]] = lIIlIlIlIII("n+gCw87QvXlsymSTdZMTIgVUnmnYoC2E", "wBZYf");
        lIllIIlI[lIllIlII[72]] = lIIlIlIlIII("Q2mztCfxRoIqytTT8ENcBvpolsCXmnst6NBfsIw32uUcFUimePzsCtrmbQ95ZewH", "BsezA");
        lIllIIlI[lIllIlII[73]] = lIIlIlIlIIl("aa1gmujnzU1P99b8qAKqHDNjwm6wXOOWt4owTrnBMqrZH7AjpzeIJE6E/m4zEmgE", "QOWil");
        lIllIIlI[lIllIlII[74]] = lIIlIlIlIIl("O6+ugJjPFkc=", "TtSIk");
        lIllIIlI[lIllIlII[75]] = lIIlIlIlIII("2asb/zYTOdLjhxci1+UQ1A==", "pzwqs");
        lIllIIlI[lIllIlII[76]] = lIIlIlIlIIl("i1obf48MRrZyUigiPr+2RfUsy349SoUoBHEsxSmBRMBW7tatySau6w==", "zHBnB");
        lIllIIlI[lIllIlII[77]] = lIIlIlIlIIl("4qvZZB2RqF9bIP9v8zqBBZzgRG3hXC2QlPXJNikrfAU=", "rBSic");
        lIllIIlI[lIllIlII[78]] = lIIlIlIlIII("QrPUlDA7YzKKAhI+nqV1pP+m39q+pY5txG7uIcxi/aw=", "sSWfm");
    }

    static {
        lIIlIlIllll();
        lIIlIlIllIl();
        dh = new WorldPoint(lIllIlII[67], lIllIlII[68], lIllIlII[4]);
        di = new WorldPoint(lIllIlII[69], lIllIlII[70], lIllIlII[4]);
        bB = new ArrayList();
        String[] strArr = new String[lIllIlII[23]];
        strArr[lIllIlII[4]] = lIllIIlI[lIllIlII[71]];
        strArr[lIllIlII[3]] = lIllIIlI[lIllIlII[72]];
        strArr[lIllIlII[1]] = lIllIIlI[lIllIlII[73]];
        strArr[lIllIlII[12]] = lIllIIlI[lIllIlII[74]];
        strArr[lIllIlII[7]] = lIllIIlI[lIllIlII[75]];
        strArr[lIllIlII[15]] = lIllIIlI[lIllIlII[76]];
        strArr[lIllIlII[17]] = lIllIIlI[lIllIlII[77]];
        strArr[lIllIlII[8]] = lIllIIlI[lIllIlII[78]];
        bX = strArr;
    }

    private static boolean lIIlIlllIII(int i, int i2) {
        return i <= i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lIllIIlI[lIllIlII[58]];
    }

    private static boolean lIIlIllIlIl(Object obj) {
        return obj != null;
    }

    private static String lIIlIlIlIIl(String lIllIIlllIIIlII, String lIllIIlllIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIlllIIIIll.getBytes(StandardCharsets.UTF_8)), lIllIlII[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlII[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIIlllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIlllIIIlIl) {
            lIllIIlllIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlII(int i) {
        return i == 0;
    }

    private static boolean lIIlIlllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIllIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIllIllI(int i) {
        return i > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01f7, code lost:
        if (lIIlIllIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.w.lIllIlII[2]) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ag() {
        int[] iArr;
        int[] iArr2 = new int[lIllIlII[3]];
        iArr2[lIllIlII[4]] = lIllIlII[19];
        if (lIIlIllIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(lIllIlII[19], lIllIlII[2], C0008i.bw));
            "".length();
        }
        int[] iArr3 = new int[lIllIlII[3]];
        iArr3[lIllIlII[4]] = lIllIlII[11];
        if (lIIlIllIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(lIllIlII[11], lIllIlII[3], lIllIlII[51]));
            "".length();
        }
        int[] iArr4 = new int[lIllIlII[3]];
        iArr4[lIllIlII[4]] = lIllIlII[14];
        if (lIIlIllIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(lIllIlII[14], lIllIlII[3], lIllIlII[51]));
            "".length();
        }
        int[] iArr5 = new int[lIllIlII[3]];
        iArr5[lIllIlII[4]] = lIllIlII[18];
        if (lIIlIllIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(lIllIlII[18], lIllIlII[3], lIllIlII[51]));
            "".length();
        }
        int[] iArr6 = new int[lIllIlII[3]];
        iArr6[lIllIlII[4]] = lIllIlII[16];
        if (lIIlIllIlII(Bank.contains(iArr6) ? 1 : 0)) {
            bB.add(new C0003d(lIllIlII[16], lIllIlII[3], lIllIlII[51]));
            "".length();
        }
        int[] iArr7 = new int[lIllIlII[3]];
        iArr7[lIllIlII[4]] = lIllIlII[13];
        if (lIIlIllIlII(Bank.contains(iArr7) ? 1 : 0)) {
            bB.add(new C0003d(lIllIlII[13], lIllIlII[3], lIllIlII[52]));
            "".length();
        }
        int[] iArr8 = new int[lIllIlII[3]];
        iArr8[lIllIlII[4]] = lIllIlII[10];
        if (lIIlIllIIll(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIllIlII[3]];
            iArr9[lIllIlII[4]] = lIllIlII[10];
            if (lIIlIllIIll(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIllIlII[3]];
                iArr10[lIllIlII[4]] = lIllIlII[10];
            }
            if (lIIlIllIlII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIllIIlI[lIllIlII[59]]);
            }) ? 1 : 0)) {
                bB.add(new C0003d(lIllIlII[54], lIllIlII[15], lIllIlII[55]));
                "".length();
            }
            iArr = new int[lIllIlII[3]];
            iArr[lIllIlII[4]] = lIllIlII[9];
            if (lIIlIllIIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[lIllIlII[3]];
                iArr11[lIllIlII[4]] = lIllIlII[9];
                if (!lIIlIllIIll(Bank.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIllIlII[3]];
                iArr12[lIllIlII[4]] = lIllIlII[9];
                if (!lIIlIllIIII(Bank.getFirst(iArr12).getQuantity(), lIllIlII[2])) {
                    return;
                }
            }
            bB.add(new C0003d(lIllIlII[9], lIllIlII[56], lIllIlII[52]));
            "".length();
        }
        bB.add(new C0003d(lIllIlII[10], lIllIlII[2], lIllIlII[53]));
        "".length();
        if (lIIlIllIlII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIllIIlI[lIllIlII[59]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIllIlII[3]];
        iArr[lIllIlII[4]] = lIllIlII[9];
        if (lIIlIllIIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bB.add(new C0003d(lIllIlII[9], lIllIlII[56], lIllIlII[52]));
        "".length();
    }

    public static void bg() {
        String[] strArr = new String[lIllIlII[3]];
        strArr[lIllIlII[4]] = lIllIIlI[lIllIlII[46]];
        if (lIIlIlllIIl(NPCs.getNearest(strArr))) {
            if (lIIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                if (lIIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo(dh);
                "".length();
                Time.sleepTicks(lIllIlII[3]);
                "".length();
            }
            if (lIIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(dh), lIllIlII[12])) {
                AccBuilderBarrows.c = lIllIIlI[lIllIlII[47]];
                String[] strArr2 = new String[lIllIlII[3]];
                strArr2[lIllIlII[4]] = lIllIIlI[lIllIlII[48]];
                TileObjects.getNearest(strArr2).interact(lIllIIlI[lIllIlII[0]]);
                Time.sleepTicks(lIllIlII[1]);
                "".length();
            }
        }
    }
}
