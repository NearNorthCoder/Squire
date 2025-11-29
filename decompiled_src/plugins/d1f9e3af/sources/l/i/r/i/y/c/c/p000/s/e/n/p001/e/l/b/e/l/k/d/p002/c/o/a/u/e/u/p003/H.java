package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.H  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/H.class */
public class H implements W {
    static /* synthetic */ boolean cm;
    public static /* synthetic */ WorldArea iy;
    public static /* synthetic */ WorldPoint iE;
    public static /* synthetic */ WorldPoint iA;
    static /* synthetic */ int cl;
    public static /* synthetic */ WorldPoint iz;
    public static /* synthetic */ WorldPoint iB;
    public static /* synthetic */ WorldPoint iC;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ WorldPoint iD;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint bX;
    private static /* synthetic */ String[] lIIllllll;
    private static /* synthetic */ int[] lIlIIIIII;
    static /* synthetic */ String[] bR;
    /* synthetic */ WorldArea iF = new WorldArea(lIlIIIIII[0], lIlIIIIII[1], lIlIIIIII[2], lIlIIIIII[3], lIlIIIIII[4]);
    /* synthetic */ WorldArea iG = new WorldArea(lIlIIIIII[0], lIlIIIIII[1], lIlIIIIII[2], lIlIIIIII[3], lIlIIIIII[5]);
    /* synthetic */ WorldArea iH = new WorldArea(lIlIIIIII[0], lIlIIIIII[1], lIlIIIIII[2], lIlIIIIII[3], lIlIIIIII[6]);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v539, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v559, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v566, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    public static void bY() {
        if (lIIIIlIllllI(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIIIIlIlllll(bv.size(), lIlIIIIII[5])) {
                System.out.println(lIIllllll[lIlIIIIII[4]]);
                bt = lIlIIIIII[4];
            }
        }
        if (lIIIIllIIIII(bt ? 1 : 0)) {
            if (lIIIIlIlllll(C0004e.j(lIlIIIIII[7]), lIlIIIIII[8])) {
                M.cj();
            }
            if (lIIIIllIIIIl(C0004e.j(lIlIIIIII[7]), lIlIIIIII[8]) && lIIIIlIlllll(C0004e.H(), lIlIIIIII[9])) {
                System.out.println(lIIllllll[lIlIIIIII[5]]);
                AccBuilderEasyClues.d = lIlIIIIII[5];
                return;
            }
            if (lIIIIllIIIII(ab() ? 1 : 0) && lIIIIllIIIII(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId())) && lIIIIllIIIIl(C0004e.j(lIlIIIIII[7]), lIlIIIIII[8]) && lIIIIllIIIlI(C0004e.H(), lIlIIIIII[9])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIllIIIll(nearest) && lIIIIllIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[6]];
                    C0000a.a(nearest);
                }
                if (lIIIIllIIIll(nearest) && lIIIIlIllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIIIllIIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIIIII[10]);
                        "".length();
                    }
                    if (lIIIIlIllllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[11]];
                        if (lIIIIllIIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIIIII[12]);
                            "".length();
                        }
                        if (lIIIIllIIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIIIIII[6]);
                            "".length();
                        }
                        int[] iArr = new int[lIlIIIIII[13]];
                        iArr[lIlIIIIII[4]] = lIlIIIIII[14];
                        iArr[lIlIIIIII[5]] = lIlIIIIII[15];
                        iArr[lIlIIIIII[6]] = lIlIIIIII[16];
                        iArr[lIlIIIIII[11]] = lIlIIIIII[17];
                        iArr[lIlIIIIII[12]] = lIlIIIIII[18];
                        iArr[lIlIIIIII[19]] = lIlIIIIII[20];
                        iArr[lIlIIIIII[21]] = lIlIIIIII[22];
                        iArr[lIlIIIIII[23]] = lIlIIIIII[24];
                        if (lIIIIllIIIII(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIllllll[lIlIIIIII[12]]);
                            bt = lIlIIIIII[5];
                            return;
                        }
                        int[] iArr2 = new int[lIlIIIIII[13]];
                        iArr2[lIlIIIIII[4]] = lIlIIIIII[14];
                        iArr2[lIlIIIIII[5]] = lIlIIIIII[15];
                        iArr2[lIlIIIIII[6]] = lIlIIIIII[16];
                        iArr2[lIlIIIIII[11]] = lIlIIIIII[17];
                        iArr2[lIlIIIIII[12]] = lIlIIIIII[18];
                        iArr2[lIlIIIIII[19]] = lIlIIIIII[20];
                        iArr2[lIlIIIIII[21]] = lIlIIIIII[22];
                        iArr2[lIlIIIIII[23]] = lIlIIIIII[24];
                        if (lIIIIlIllllI(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIlIIIIII[14], lIlIIIIII[25]);
                            C0000a.a(lIlIIIIII[22], lIlIIIIII[25]);
                            C0000a.a(lIlIIIIII[15], lIlIIIIII[6]);
                            C0000a.a(lIlIIIIII[16], lIlIIIIII[5]);
                            C0000a.a(lIlIIIIII[17], lIlIIIIII[5]);
                            C0000a.a(lIlIIIIII[18], lIlIIIIII[5]);
                            C0000a.a(lIlIIIIII[24], lIlIIIIII[5]);
                            C0000a.a(lIlIIIIII[20], lIlIIIIII[5]);
                            C0000a.a(lIlIIIIII[26], lIlIIIIII[6]);
                            C0000a.a(lIlIIIIII[27], lIlIIIIII[5]);
                            C0000a.a(lIlIIIIII[28], lIlIIIIII[19]);
                            int[] iArr3 = new int[lIlIIIIII[5]];
                            iArr3[lIlIIIIII[4]] = lIlIIIIII[15];
                            if (lIIIIllIIIIl(Inventory.getAll(iArr3).size(), lIlIIIIII[5])) {
                                C0000a.a(lIlIIIIII[29], lIlIIIIII[6]);
                            }
                        }
                    }
                }
            }
            if (lIIIIlIllllI(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIlIlllll(Movement.getRunEnergy(), lIlIIIIII[30])) {
                Inventory.getFirst(C0005f.aV).interact(lIIllllll[lIlIIIIII[19]]);
                Time.sleepTicks(lIlIIIIII[5]);
                "".length();
            }
            if (lIIIIlIlllll(Prayers.getPoints(), lIlIIIIII[31]) && lIIIIlIllllI(Inventory.contains(C0005f.aS) ? 1 : 0)) {
                Inventory.getFirst(C0005f.aS).interact(lIIllllll[lIlIIIIII[21]]);
                Time.sleepTicks(lIlIIIIII[6]);
                "".length();
            }
            if (lIIIIlIllllI(ab() ? 1 : 0) && lIIIIllIIIII(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()))) {
                if (lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(bX), lIlIIIIII[19])) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[23]];
                    if (lIIIIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(bX);
                    "".length();
                    Time.sleepTicks(lIlIIIIII[5]);
                    "".length();
                }
                if (lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIlIIIIII[19])) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[13]];
                    C0006g.a(lIIllllll[lIlIIIIII[32]], bR);
                }
            }
            if (!lIIIIllIIlll(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[19]) || lIIIIllIIIIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[23])) {
                C0006g.a(bR);
            }
            if (lIIIIllIIIIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[25])) {
                if (!lIIIIllIIIlI(Vars.getBit(lIlIIIIII[33]), lIlIIIIII[19]) || lIIIIllIIIIl(Vars.getBit(lIlIIIIII[33]), lIlIIIIII[34])) {
                    if (lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iz), lIlIIIIII[5])) {
                        if (lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iA), lIlIIIIII[21])) {
                            String[] strArr = new String[lIlIIIIII[5]];
                            strArr[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[25]];
                            TileObject nearest2 = TileObjects.getNearest(strArr);
                            String[] strArr2 = new String[lIlIIIIII[5]];
                            strArr2[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[35]];
                            if (lIIIIlIllllI(nearest2.hasAction(strArr2) ? 1 : 0)) {
                                String[] strArr3 = new String[lIlIIIIII[5]];
                                strArr3[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[36]];
                                TileObjects.getNearest(strArr3).interact(lIIllllll[lIlIIIIII[37]]);
                                Time.sleepTicks(lIlIIIIII[6]);
                                "".length();
                            }
                            String[] strArr4 = new String[lIlIIIIII[5]];
                            strArr4[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[38]];
                            TileObject nearest3 = TileObjects.getNearest(strArr4);
                            String[] strArr5 = new String[lIlIIIIII[5]];
                            strArr5[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[34]];
                            if (lIIIIllIIIII(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                WorldPoint[] worldPointArr = new WorldPoint[lIlIIIIII[19]];
                                worldPointArr[lIlIIIIII[4]] = new WorldPoint(lIlIIIIII[39], lIlIIIIII[40], lIlIIIIII[4]);
                                worldPointArr[lIlIIIIII[5]] = new WorldPoint(lIlIIIIII[41], lIlIIIIII[42], lIlIIIIII[4]);
                                worldPointArr[lIlIIIIII[6]] = new WorldPoint(lIlIIIIII[43], lIlIIIIII[44], lIlIIIIII[4]);
                                worldPointArr[lIlIIIIII[11]] = new WorldPoint(lIlIIIIII[45], lIlIIIIII[46], lIlIIIIII[4]);
                                worldPointArr[lIlIIIIII[12]] = new WorldPoint(lIlIIIIII[47], lIlIIIIII[48], lIlIIIIII[4]);
                                Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                                "".length();
                                Time.sleepTicks(lIlIIIIII[5]);
                                "".length();
                            }
                        }
                        if (lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iA), lIlIIIIII[21])) {
                            AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[9]];
                            Movement.walkTo(iz);
                            "".length();
                            Time.sleepTicks(lIlIIIIII[5]);
                            "".length();
                        }
                    }
                    if (lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iz), lIlIIIIII[5])) {
                        if (lIIIIllIIIIl(Vars.getBit(lIlIIIIII[33]), lIlIIIIII[34]) && lIIIIllIIIll(Widgets.get(lIlIIIIII[49], lIlIIIIII[6])) && lIIIIllIIIII(Players.getLocal().isAnimating() ? 1 : 0)) {
                            Widgets.get(lIlIIIIII[49], lIlIIIIII[6]).getChild(lIlIIIIII[50]).interact(lIIllllll[lIlIIIIII[51]]);
                            Time.sleepTicks(lIlIIIIII[6]);
                            "".length();
                        }
                        if (lIIIIlIlllll(Vars.getBit(lIlIIIIII[33]), lIlIIIIII[19])) {
                            AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[52]];
                            C0006g.a(lIIllllll[lIlIIIIII[53]], bR);
                        }
                    }
                }
                if (lIIIIllIIIIl(Vars.getBit(lIlIIIIII[33]), lIlIIIIII[19])) {
                    WorldArea worldArea = new WorldArea(lIlIIIIII[54], lIlIIIIII[40], lIlIIIIII[32], lIlIIIIII[25], lIlIIIIII[4]);
                    if (lIIIIllIIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[55]];
                        if (lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iA), lIlIIIIII[21])) {
                            Movement.walkTo(new WorldPoint(lIlIIIIII[41], lIlIIIIII[56], lIlIIIIII[4]));
                            "".length();
                            Time.sleepTicks(lIlIIIIII[5]);
                            "".length();
                        }
                        if (lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iA), lIlIIIIII[21])) {
                            String[] strArr6 = new String[lIlIIIIII[5]];
                            strArr6[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[57]];
                            TileObject nearest4 = TileObjects.getNearest(strArr6);
                            String[] strArr7 = new String[lIlIIIIII[5]];
                            strArr7[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[58]];
                            if (lIIIIlIllllI(nearest4.hasAction(strArr7) ? 1 : 0)) {
                                String[] strArr8 = new String[lIlIIIIII[5]];
                                strArr8[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[31]];
                                TileObjects.getNearest(strArr8).interact(lIIllllll[lIlIIIIII[59]]);
                                Time.sleepTicks(lIlIIIIII[6]);
                                "".length();
                            }
                            String[] strArr9 = new String[lIlIIIIII[5]];
                            strArr9[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[60]];
                            TileObject nearest5 = TileObjects.getNearest(strArr9);
                            String[] strArr10 = new String[lIlIIIIII[5]];
                            strArr10[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[61]];
                            if (lIIIIllIIIII(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                C0006g.a(lIIllllll[lIlIIIIII[62]], bR);
                            }
                        }
                    }
                    if (lIIIIlIllllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[63]];
                        C0006g.a(lIIllllll[lIlIIIIII[64]], bR);
                    }
                }
                if (lIIIIllIIIIl(Vars.getBit(lIlIIIIII[33]), lIlIIIIII[25])) {
                    C0006g.a(bR);
                }
            }
            if (lIIIIllIIIIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[34])) {
                cl = lIlIIIIII[4];
                if (lIIIIllIIIII(Vars.getBit(lIlIIIIII[65]))) {
                    if (lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iB), lIlIIIIII[19])) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[66]];
                        Movement.walkTo(iB);
                        "".length();
                        Time.sleepTicks(lIlIIIIII[5]);
                        "".length();
                    }
                    if (lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iB), lIlIIIIII[19])) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[7]];
                        C0006g.a(lIIllllll[lIlIIIIII[67]], bR);
                    }
                }
                if (lIIIIllIIIIl(Vars.getBit(lIlIIIIII[65]), lIlIIIIII[19])) {
                    if (lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iC), lIlIIIIII[21])) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[68]];
                        Movement.walkTo(iC);
                        "".length();
                        Time.sleepTicks(lIlIIIIII[5]);
                        "".length();
                    }
                    if (lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iC), lIlIIIIII[21])) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[69]];
                        C0006g.a(lIIllllll[lIlIIIIII[70]], bR);
                    }
                }
                if (lIIIIllIIIIl(Vars.getBit(lIlIIIIII[65]), lIlIIIIII[25])) {
                    String[] strArr11 = new String[lIlIIIIII[5]];
                    strArr11[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[71]];
                    if (lIIIIllIIIII(Inventory.contains(strArr11) ? 1 : 0)) {
                        String[] strArr12 = new String[lIlIIIIII[5]];
                        strArr12[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[72]];
                        Item first = Inventory.getFirst(strArr12);
                        String[] strArr13 = new String[lIlIIIIII[5]];
                        strArr13[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[73]];
                        first.useOn(Inventory.getFirst(strArr13));
                        Time.sleepTicks(lIlIIIIII[5]);
                        "".length();
                    }
                    String[] strArr14 = new String[lIlIIIIII[5]];
                    strArr14[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[74]];
                    if (lIIIIlIllllI(Inventory.contains(strArr14) ? 1 : 0)) {
                        if (lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iB), lIlIIIIII[19])) {
                            AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[50]];
                            Movement.walkTo(iB);
                            "".length();
                            Time.sleepTicks(lIlIIIIII[5]);
                            "".length();
                        }
                        if (lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iB), lIlIIIIII[19])) {
                            AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[75]];
                            C0006g.a(lIIllllll[lIlIIIIII[76]], bR);
                        }
                    }
                }
                if (lIIIIllIIIIl(Vars.getBit(lIlIIIIII[65]), lIlIIIIII[70])) {
                    C0006g.a(bR);
                }
                if (lIIIIllIIIIl(Vars.getBit(lIlIIIIII[65]), lIlIIIIII[50])) {
                    if (lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iD), lIlIIIIII[13])) {
                        AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[77]];
                        Movement.walkTo(iD);
                        "".length();
                        Time.sleepTicks(lIlIIIIII[5]);
                        "".length();
                    }
                    if (lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iD), lIlIIIIII[13])) {
                        C0006g.a(lIIllllll[lIlIIIIII[78]], bR);
                    }
                }
                C0006g.a(bR);
            }
            if (lIIIIllIIIIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[55])) {
                if (lIIIIllIIlIl(Players.getLocal().getWorldLocation().distanceTo(iE), lIlIIIIII[19])) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[79]];
                    if (lIIIIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(iE);
                    "".length();
                    Time.sleepTicks(lIlIIIIII[5]);
                    "".length();
                }
                if (lIIIIllIIllI(Players.getLocal().getWorldLocation().distanceTo(iE), lIlIIIIII[19])) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[80]];
                    C0006g.a(lIIllllll[lIlIIIIII[81]], bR);
                }
            }
            if (!lIIIIllIIlll(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[60]) || !lIIIIllIIlll(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[66]) || lIIIIllIIIIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[50])) {
                C0006g.a(bR);
            }
            if (lIIIIllIIIIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[70])) {
                C0006g.a(bR);
                int[] iArr4 = new int[lIlIIIIII[5]];
                iArr4[lIlIIIIII[4]] = lIlIIIIII[27];
                if (lIIIIllIIIII(Equipment.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lIlIIIIII[5]];
                    iArr5[lIlIIIIII[4]] = lIlIIIIII[27];
                    if (lIIIIlIllllI(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIlIIIIII[5]];
                        iArr6[lIlIIIIII[4]] = lIlIIIIII[27];
                        Inventory.getFirst(iArr6).interact(lIIllllll[lIlIIIIII[82]]);
                        Time.sleepTicks(lIlIIIIII[5]);
                        "".length();
                    }
                }
                if (lIIIIllIIIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0) && lIIIIllIIIlI(Skills.getLevel(Skill.PRAYER), lIlIIIIII[77]) && lIIIIllIIlII(Prayers.getPoints())) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                TileObject nearest6 = TileObjects.getNearest(tileObject -> {
                    if (lIIIIlIllllI(tileObject.getName().contains(lIIllllll[lIlIIIIII[96]]) ? 1 : 0)) {
                        String[] strArr15 = new String[lIlIIIIII[5]];
                        strArr15[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[97]];
                        if (lIIIIlIllllI(tileObject.hasAction(strArr15) ? 1 : 0)) {
                            ?? r0 = lIlIIIIII[5];
                            "".length();
                            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIlIIIIII[4];
                });
                if (lIIIIllIIIll(nearest6)) {
                    AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[83]];
                    nearest6.interact(lIIllllll[lIlIIIIII[30]]);
                    Time.sleepTicks(lIlIIIIII[12]);
                    "".length();
                }
                if (lIIIIllIlIII(lIIIIlIlllIl(C0004e.u(), 50.0d))) {
                    int[] iArr7 = new int[lIlIIIIII[5]];
                    iArr7[lIlIIIIII[4]] = lIlIIIIII[28];
                    if (lIIIIlIllllI(Inventory.contains(iArr7) ? 1 : 0)) {
                        int[] iArr8 = new int[lIlIIIIII[5]];
                        iArr8[lIlIIIIII[4]] = lIlIIIIII[28];
                        Inventory.getFirst(iArr8).interact(lIIllllll[lIlIIIIII[84]]);
                        Time.sleepTicks(lIlIIIIII[5]);
                        "".length();
                    }
                }
            }
            if (lIIIIllIIIIl(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[85]) && lIIIIllIIIII(iy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIIllllll[lIlIIIIII[86]];
                if (lIIIIlIlllll(cl, lIlIIIIII[5])) {
                    an.pT += lIlIIIIII[5];
                    an.o(AccBuilderEasyClues.m);
                    cl += lIlIIIIII[5];
                    an.pT = lIlIIIIII[4];
                    cm = lIlIIIIII[4];
                }
                int[] iArr9 = new int[lIlIIIIII[5]];
                iArr9[lIlIIIIII[4]] = lIlIIIIII[14];
                if (lIIIIlIllllI(Inventory.contains(iArr9) ? 1 : 0) && lIIIIllIIIII(Players.getLocal().isAnimating() ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIIIIII[5]];
                    iArr10[lIlIIIIII[4]] = lIlIIIIII[14];
                    Inventory.getFirst(iArr10).interact(lIIllllll[lIlIIIIII[87]]);
                    Time.sleepTicks(lIlIIIIII[12]);
                    "".length();
                }
            }
            C0006g.a(new String[lIlIIIIII[4]]);
        }
    }

    private static boolean lIIIIllIIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIIllIlIII(int i) {
        return i < 0;
    }

    private static int lIIIIlIlllIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void lIIIIlIllIll() {
        lIIllllll = new String[lIlIIIIII[118]];
        lIIllllll[lIlIIIIII[4]] = lIIIIlIIlIll("W6AadSjZnm5VXKWpkcGjmzjHUIM/8TGxUZJJb/RyVt1cvjFrEk0PPsXAk5s+icsj", "GGyxY");
        lIIllllll[lIlIIIIII[5]] = lIIIIlIIllII("D4V4szwAXFjXwJmvyfdiRQ==", "Egbru");
        lIIllllll[lIlIIIIII[6]] = lIIIIlIIllIl("JDkhVxsFeDUWAQE=", "jXWwo");
        lIIllllll[lIlIIIIII[11]] = lIIIIlIIllIl("HC8XLSo9IB5pJDUgEiAoMw==", "TNyIF");
        lIIllllll[lIlIIIIII[12]] = lIIIIlIIlIll("GgOz9qKbWkJ+3Yhzv7V9WEYoF7tnJpWerxbc2NuWgVtJDBoQBqfae1+6rTaAZ8ZMUWOOjPjXRcg=", "dcTkq");
        lIIllllll[lIlIIIIII[19]] = lIIIIlIIllII("H8DuO7xWsWI=", "wobfQ");
        lIIllllll[lIlIIIIII[21]] = lIIIIlIIllII("Mc7mVn4Zv9A=", "OEfNS");
        lIIllllll[lIlIIIIII[23]] = lIIIIlIIlIll("ZFGvdtGUul7FrnfCM9e5/A==", "pjaNF");
        lIIllllll[lIlIIIIII[13]] = lIIIIlIIllIl("JzsTHgMdIRVMBgEqARg=", "tOrlw");
        lIIllllll[lIlIIIIII[32]] = lIIIIlIIllII("vTf8tXmy7pI=", "BnTKj");
        lIIllllll[lIlIIIIII[25]] = lIIIIlIIllIl("OSU6CTAUJjhOPBolJg==", "uJTnX");
        lIIllllll[lIlIIIIII[35]] = lIIIIlIIlIll("pGRnw6DxYNU=", "TDnvj");
        lIIllllll[lIlIIIIII[36]] = lIIIIlIIllIl("Lgc5Az0DBDtEMQ0HJQ==", "bhWdU");
        lIIllllll[lIlIIIIII[37]] = lIIIIlIIllII("4TYT7CUKATU=", "tuSKC");
        lIIllllll[lIlIIIIII[38]] = lIIIIlIIllII("dlXlrYDCg1twQiErYWE57A==", "dPJAH");
        lIIllllll[lIlIIIIII[34]] = lIIIIlIIlIll("N3l4Pw9C5A4=", "bzIKT");
        lIIllllll[lIlIIIIII[9]] = lIIIIlIIlIll("/QWHMO1RZLn7K2tEz0WIyw==", "qUtGP");
        lIIllllll[lIlIIIIII[51]] = lIIIIlIIllIl("JAMRJz0GCw==", "tfcAR");
        lIIllllll[lIlIIIIII[52]] = lIIIIlIIlIll("46g+HTW2Jj0=", "ZQeLc");
        lIIllllll[lIlIIIIII[53]] = lIIIIlIIllII("ILU0rOEIcyY=", "RMfij");
        lIIllllll[lIlIIIIII[55]] = lIIIIlIIllIl("DBIQZD0tUwcwJSMA", "BsfDI");
        lIIllllll[lIlIIIIII[57]] = lIIIIlIIllII("esuNaZIalO4rAZEL6/ok0w==", "ATpPS");
        lIIllllll[lIlIIIIII[58]] = lIIIIlIIllIl("AwI/BA==", "LrZjW");
        lIIllllll[lIlIIIIII[31]] = lIIIIlIIllII("XpUsX8MKrDqoRqKzez9++A==", "zKrzO");
        lIIllllll[lIlIIIIII[59]] = lIIIIlIIlIll("8rs4azCgL7M=", "dgtvg");
        lIIllllll[lIlIIIIII[60]] = lIIIIlIIllII("0+TIXc91Uk+swLeA+PWb0Q==", "CKWAS");
        lIIllllll[lIlIIIIII[61]] = lIIIIlIIllII("ZmATkzihjKs=", "FiwIv");
        lIIllllll[lIlIIIIII[62]] = lIIIIlIIllII("hmdfT9Mu+mo=", "TJDhO");
        lIIllllll[lIlIIIIII[63]] = lIIIIlIIllIl("OSkpDQ==", "MHEfc");
        lIIllllll[lIlIIIIII[64]] = lIIIIlIIllIl("MDo1Jhc=", "qNYGd");
        lIIllllll[lIlIIIIII[66]] = lIIIIlIIllIl("JSAuaRMEYTUoFQckIQ==", "kAXIg");
        lIIllllll[lIlIIIIII[7]] = lIIIIlIIllII("beV7f/7Ej8U=", "bFBKa");
        lIIllllll[lIlIIIIII[67]] = lIIIIlIIllIl("JBQBIDYQ", "iusLS");
        lIIllllll[lIlIIIIII[68]] = lIIIIlIIlIll("2rq9yE+d9QGE3SMpOgmKbg==", "xNWRY");
        lIIllllll[lIlIIIIII[69]] = lIIIIlIIllIl("OCknAg==", "LHKiU");
        lIIllllll[lIlIIIIII[70]] = lIIIIlIIlIll("gSei59gOBp8=", "XegtK");
        lIIllllll[lIlIIIIII[71]] = lIIIIlIIllIl("FjgONCFlPwo7LjIlCD0=", "ELkUJ");
        lIIllllll[lIlIIIIII[72]] = lIIIIlIIllIl("Axc/NAg=", "HyVRm");
        lIIllllll[lIlIIIIII[73]] = lIIIIlIIllII("q6LVqotTd1s=", "TUmfj");
        lIIllllll[lIlIIIIII[74]] = lIIIIlIIlIll("7AGoSHmhtJeMSsMusx6z1w==", "HxEVs");
        lIIllllll[lIlIIIIII[50]] = lIIIIlIIllII("Tk0xbHijxs8tFPslfCJMMQ==", "LHNDA");
        lIIllllll[lIlIIIIII[75]] = lIIIIlIIllIl("NxcKCA==", "cvfca");
        lIIllllll[lIlIIIIII[76]] = lIIIIlIIllII("Nos1w/ygEu8=", "rpgJp");
        lIIllllll[lIlIIIIII[77]] = lIIIIlIIlIll("nPP+iT7oVFm8OcFd/Ycn3A==", "VwPjM");
        lIIllllll[lIlIIIIII[78]] = lIIIIlIIllII("pB/ve3B0Tpg=", "frFTX");
        lIIllllll[lIlIIIIII[79]] = lIIIIlIIllIl("GAkSbDo5SAA5IDENCyI=", "VhdLN");
        lIIllllll[lIlIIIIII[80]] = lIIIIlIIllII("jrmCSSPRvfbGSrKEu5i1Vg==", "LgfYh");
        lIIllllll[lIlIIIIII[81]] = lIIIIlIIllII("1nvzfinSzGY=", "KYpxI");
        lIIllllll[lIlIIIIII[82]] = lIIIIlIIlIll("flZI5WVPV9A=", "VCrYm");
        lIIllllll[lIlIIIIII[83]] = lIIIIlIIllII("WtJF4fHnXYdBfP5oIV6lKQ==", "uqjDb");
        lIIllllll[lIlIIIIII[30]] = lIIIIlIIllIl("HgUgAQ==", "SlNdE");
        lIIllllll[lIlIIIIII[84]] = lIIIIlIIllIl("KSMu", "lBZbS");
        lIIllllll[lIlIIIIII[86]] = lIIIIlIIllII("o54u7eSk+ZwzxMoj+fu8DQ==", "SIocK");
        lIIllllll[lIlIIIIII[87]] = lIIIIlIIllIl("LQoMOAM=", "oxiYh");
        lIIllllll[lIlIIIIII[94]] = lIIIIlIIllII("4GeOQqTDYM4CO8nYajjLa+ITOKe814UH", "iwNKc");
        lIIllllll[lIlIIIIII[95]] = lIIIIlIIlIll("9v+WxWSoj68d+t7NHvQ9XIzrs+euttS/", "oyrPd");
        lIIllllll[lIlIIIIII[96]] = lIIIIlIIllII("H3OjaE2mc1Y=", "KYoER");
        lIIllllll[lIlIIIIII[97]] = lIIIIlIIlIll("eoDV/TkiHzU=", "XUNZG");
        lIIllllll[lIlIIIIII[115]] = lIIIIlIIlIll("v4lMy3BmqV0=", "ZysNj");
        lIIllllll[lIlIIIIII[116]] = lIIIIlIIllIl("AWQ4KzpoMyAkLS02JiQuaC0pajAnMWguaSohbysrJCFvPiZoKS4hLGgpKmooaBc7LygjZDwrJywzJikhdw==", "HDOJI");
        lIIllllll[lIlIIIIII[117]] = lIIIIlIIllIl("OyIkCEI=", "iMGcl");
    }

    private static boolean lIIIIllIIllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIIllIIlll(int i, int i2) {
        return i != i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIllllll[lIlIIIIII[94]];
    }

    private static boolean lIIIIllIIIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIlIlllll(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIIlIlllII();
        lIIIIlIllIll();
        iy = new WorldArea(lIlIIIIII[98], lIlIIIIII[99], lIlIIIIII[100], lIlIIIIII[101], lIlIIIIII[4]);
        bv = new ArrayList();
        bX = new WorldPoint(lIlIIIIII[102], lIlIIIIII[56], lIlIIIIII[4]);
        iz = new WorldPoint(lIlIIIIII[103], lIlIIIIII[104], lIlIIIIII[4]);
        iA = new WorldPoint(lIlIIIIII[105], lIlIIIIII[106], lIlIIIIII[4]);
        iB = new WorldPoint(lIlIIIIII[107], lIlIIIIII[108], lIlIIIIII[4]);
        iC = new WorldPoint(lIlIIIIII[109], lIlIIIIII[110], lIlIIIIII[4]);
        iD = new WorldPoint(lIlIIIIII[111], lIlIIIIII[112], lIlIIIIII[4]);
        iE = new WorldPoint(lIlIIIIII[113], lIlIIIIII[114], lIlIIIIII[4]);
        String[] strArr = new String[lIlIIIIII[11]];
        strArr[lIlIIIIII[4]] = lIIllllll[lIlIIIIII[115]];
        strArr[lIlIIIIII[5]] = lIIllllll[lIlIIIIII[116]];
        strArr[lIlIIIIII[6]] = lIIllllll[lIlIIIIII[117]];
        bR = strArr;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            bY();
            "".length();
            if (0 != 0) {
                return ((((96 + 6) - 61) + 168) ^ (((29 + 110) - 84) + 97)) & (((((11 + 114) - 107) + 220) ^ (((83 + 56) - 92) + 120)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlIIIIII[8];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIlIIIIII[13]];
        iArr[lIlIIIIII[4]] = lIlIIIIII[14];
        iArr[lIlIIIIII[5]] = lIlIIIIII[15];
        iArr[lIlIIIIII[6]] = lIlIIIIII[16];
        iArr[lIlIIIIII[11]] = lIlIIIIII[17];
        iArr[lIlIIIIII[12]] = lIlIIIIII[18];
        iArr[lIlIIIIII[19]] = lIlIIIIII[20];
        iArr[lIlIIIIII[21]] = lIlIIIIII[22];
        iArr[lIlIIIIII[23]] = lIlIIIIII[24];
        int i = lIlIIIIII[4];
        while (lIIIIlIlllll(i, iArr.length)) {
            int[] iArr2 = new int[lIlIIIIII[5]];
            iArr2[lIlIIIIII[4]] = iArr[i];
            if (lIIIIllIIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlIIIIII[4];
            }
            i++;
            "".length();
            if ((104 ^ 108) < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIIIIII[5];
    }

    private static boolean lIIIIllIIlIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (!lIIIIllIIIlI(Vars.getBit(QuestVarbits.QUEST_BELOW_ICE_MOUNTAIN.getId()), lIlIIIIII[85]) || (lIIIIllIIIII(iy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIllIIIII(this.iF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIllIIIII(this.iG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIIIIlIllllI(this.iH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0))) {
            return lIlIIIIII[4];
        }
        ?? r0 = lIlIIIIII[5];
        "".length();
        return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static boolean lIIIIllIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static void af() {
        int[] iArr = new int[lIlIIIIII[5]];
        iArr[lIlIIIIII[4]] = lIlIIIIII[18];
        if (lIIIIllIIIII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIII[18], lIlIIIIII[5], lIlIIIIII[88]));
            "".length();
        }
        int[] iArr2 = new int[lIlIIIIII[5]];
        iArr2[lIlIIIIII[4]] = lIlIIIIII[24];
        if (lIIIIllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIII[24], lIlIIIIII[5], lIlIIIIII[88]));
            "".length();
        }
        int[] iArr3 = new int[lIlIIIIII[5]];
        iArr3[lIlIIIIII[4]] = lIlIIIIII[16];
        if (lIIIIllIIIII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIII[16], lIlIIIIII[5], lIlIIIIII[88]));
            "".length();
        }
        int[] iArr4 = new int[lIlIIIIII[5]];
        iArr4[lIlIIIIII[4]] = lIlIIIIII[20];
        if (lIIIIllIIIII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIII[20], lIlIIIIII[5], lIlIIIIII[89]));
            "".length();
        }
        int[] iArr5 = new int[lIlIIIIII[5]];
        iArr5[lIlIIIIII[4]] = lIlIIIIII[17];
        if (lIIIIllIIIII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIII[17], lIlIIIIII[5], lIlIIIIII[89]));
            "".length();
        }
        int[] iArr6 = new int[lIlIIIIII[5]];
        iArr6[lIlIIIIII[4]] = lIlIIIIII[22];
        if (lIIIIllIIIII(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIII[22], lIlIIIIII[25], lIlIIIIII[90]));
            "".length();
        }
        if (lIIIIllIIIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIllllll[lIlIIIIII[95]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIII[91], lIlIIIIII[19], lIlIIIIII[92]));
            "".length();
        }
        int[] iArr7 = new int[lIlIIIIII[5]];
        iArr7[lIlIIIIII[4]] = lIlIIIIII[15];
        if (lIIIIllIIIII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIII[15], lIlIIIIII[12], C0008i.bq));
            "".length();
        }
        int[] iArr8 = new int[lIlIIIIII[5]];
        iArr8[lIlIIIIII[4]] = lIlIIIIII[14];
        if (lIIIIlIllllI(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIlIIIIII[5]];
            iArr9[lIlIIIIII[4]] = lIlIIIIII[14];
            if (!lIIIIlIllllI(Bank.contains(iArr9) ? 1 : 0)) {
                return;
            }
            int[] iArr10 = new int[lIlIIIIII[5]];
            iArr10[lIlIIIIII[4]] = lIlIIIIII[14];
            if (!lIIIIlIlllll(Bank.getFirst(iArr10).getQuantity(), lIlIIIIII[34])) {
                return;
            }
        }
        bv.add(new C0003d(lIlIIIIII[14], lIlIIIIII[50], lIlIIIIII[93]));
        "".length();
    }

    private static String lIIIIlIIllII(String lllllIIlIIIIlI, String lllllIIlIIIIIl) {
        try {
            SecretKeySpec lllllIIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIII[13]), "DES");
            Cipher lllllIIlIIIlII = Cipher.getInstance("DES");
            lllllIIlIIIlII.init(lIlIIIIII[6], lllllIIlIIIlIl);
            return new String(lllllIIlIIIlII.doFinal(Base64.getDecoder().decode(lllllIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIIlIIIIll) {
            lllllIIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIIlIIlIll(String lllllIIIllIlIl, String lllllIIIllIlII) {
        try {
            SecretKeySpec lllllIIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIII[6], lllllIIIlllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIIIllIllI) {
            lllllIIIllIllI.printStackTrace();
            return null;
        }
    }

    private static String lIIIIlIIllIl(String lllllIIlIlIlll, String lllllIIlIlIllI) {
        String str = new String(Base64.getDecoder().decode(lllllIIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllIIlIlIlII = lllllIIlIlIllI.toCharArray();
        int lllllIIlIlIIll = lIlIIIIII[4];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIII[4];
        while (lIIIIlIlllll(i, length)) {
            char lllllIIlIllIII = charArray[i];
            sb.append((char) (lllllIIlIllIII ^ lllllIIlIlIlII[lllllIIlIlIIll % lllllIIlIlIlII.length]));
            "".length();
            lllllIIlIlIIll++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIIlIlllII() {
        lIlIIIIII = new int[119];
        lIlIIIIII[0] = (-6617) & 7679;
        lIlIIIIII[1] = (-26149) & 28663;
        lIlIIIIII[2] = (-17545) & 20409;
        lIlIIIIII[3] = (-14545) & 16127;
        lIlIIIIII[4] = (133 ^ 142) & ((154 ^ 145) ^ (-1));
        lIlIIIIII[5] = " ".length();
        lIlIIIIII[6] = "  ".length();
        lIlIIIIII[7] = (83 ^ 78) ^ "  ".length();
        lIlIIIIII[8] = 210 ^ 182;
        lIlIIIIII[9] = (7 ^ 103) ^ (242 ^ 130);
        lIlIIIIII[10] = (-24644) & 29643;
        lIlIIIIII[11] = "   ".length();
        lIlIIIIII[12] = (((92 + 28) - (-7)) + 28) ^ (((5 + 63) - 53) + 144);
        lIlIIIIII[13] = 162 ^ 170;
        lIlIIIIII[14] = (-129) & 8135;
        lIlIIIIII[15] = (-17957) & 30581;
        lIlIIIIII[16] = (-((-2705) & 32478)) & (-1) & 30719;
        lIlIIIIII[17] = (-9459) & 11767;
        lIlIIIIII[18] = (-((-22311) & 32679)) & (-3) & 12287;
        lIlIIIIII[19] = 2 ^ 7;
        lIlIIIIII[20] = (-20770) & 22911;
        lIlIIIIII[21] = (105 ^ 5) ^ (244 ^ 158);
        lIlIIIIII[22] = (-((-7433) & 23823)) & (-1) & 24399;
        lIlIIIIII[23] = 27 ^ 28;
        lIlIIIIII[24] = (-15113) & 16377;
        lIlIIIIII[25] = (181 ^ 151) ^ (143 ^ 167);
        lIlIIIIII[26] = (-13946) & 16379;
        lIlIIIIII[27] = (-24707) & 26039;
        lIlIIIIII[28] = (-((-2091) & 27307)) & (-1) & 25595;
        lIlIIIIII[29] = (-16549) & 29175;
        lIlIIIIII[30] = (219 ^ 198) ^ (104 ^ 71);
        lIlIIIIII[31] = 140 ^ 155;
        lIlIIIIII[32] = 35 ^ 42;
        lIlIIIIII[33] = (-16475) & 28539;
        lIlIIIIII[34] = (239 ^ 150) ^ (232 ^ 158);
        lIlIIIIII[35] = 35 ^ 40;
        lIlIIIIII[36] = (62 ^ 13) ^ (28 ^ 35);
        lIlIIIIII[37] = (122 ^ 13) ^ (114 ^ 8);
        lIlIIIIII[38] = 40 ^ 38;
        lIlIIIIII[39] = (-((-20129) & 32443)) & (-705) & 16095;
        lIlIIIIII[40] = (-((-5483) & 14190)) & (-4113) & 16255;
        lIlIIIIII[41] = (-25106) & 28183;
        lIlIIIIII[42] = (-20995) & 24427;
        lIlIIIIII[43] = (-17049) & 20127;
        lIlIIIIII[44] = (-16393) & 19819;
        lIlIIIIII[45] = (-753) & 3835;
        lIlIIIIII[46] = (-((-455) & 25575)) & (-4098) & 32639;
        lIlIIIIII[47] = (-((-12085) & 32759)) & (-529) & 24287;
        lIlIIIIII[48] = (-((-470) & 20951)) & (-8707) & 32603;
        lIlIIIIII[49] = ((80 + 87) - (-42)) + 7;
        lIlIIIIII[50] = 164 ^ 140;
        lIlIIIIII[51] = 164 ^ 181;
        lIlIIIIII[52] = (((136 + 83) - 96) + 23) ^ (((6 + 14) - (-33)) + 75);
        lIlIIIIII[53] = 124 ^ 111;
        lIlIIIIII[54] = (-17114) & 20187;
        lIlIIIIII[55] = (((179 + 107) - 166) + 63) ^ (((20 + 144) - 145) + 144);
        lIlIIIIII[56] = (-12310) & 15743;
        lIlIIIIII[57] = 155 ^ 142;
        lIlIIIIII[58] = 143 ^ 153;
        lIlIIIIII[59] = (164 ^ 143) ^ (95 ^ 108);
        lIlIIIIII[60] = 153 ^ 128;
        lIlIIIIII[61] = (9 ^ 101) ^ (65 ^ 55);
        lIlIIIIII[62] = (161 ^ 146) ^ (62 ^ 22);
        lIlIIIIII[63] = 61 ^ 33;
        lIlIIIIII[64] = 181 ^ 168;
        lIlIIIIII[65] = (-141) & 12204;
        lIlIIIIII[66] = (69 ^ 12) ^ (215 ^ 128);
        lIlIIIIII[67] = (128 ^ 176) ^ (90 ^ 74);
        lIlIIIIII[68] = (217 ^ 175) ^ (35 ^ 116);
        lIlIIIIII[69] = (31 ^ 108) ^ (33 ^ 112);
        lIlIIIIII[70] = (((28 + 93) - (-42)) + 63) ^ (((10 + 59) - 34) + 158);
        lIlIIIIII[71] = (((97 + 88) - 55) + 45) ^ (((27 + 87) - 44) + 69);
        lIlIIIIII[72] = (24 ^ 16) ^ (189 ^ 144);
        lIlIIIIII[73] = 179 ^ 149;
        lIlIIIIII[74] = 137 ^ 174;
        lIlIIIIII[75] = (207 ^ 199) ^ (52 ^ 21);
        lIlIIIIII[76] = 71 ^ 109;
        lIlIIIIII[77] = (129 ^ 185) ^ (71 ^ 84);
        lIlIIIIII[78] = (((54 + 119) - 134) + 109) ^ (((129 + 137) - 221) + 139);
        lIlIIIIII[79] = 160 ^ 141;
        lIlIIIIII[80] = (((20 + 102) - 87) + 131) ^ (((111 + 72) - 49) + 2);
        lIlIIIIII[81] = 155 ^ 180;
        lIlIIIIII[82] = 67 ^ 115;
        lIlIIIIII[83] = 80 ^ 97;
        lIlIIIIII[84] = (((71 + 4) - (-24)) + 31) ^ (((148 + 127) - 253) + 155);
        lIlIIIIII[85] = (96 ^ 76) ^ (44 ^ 120);
        lIlIIIIII[86] = 37 ^ 17;
        lIlIIIIII[87] = 94 ^ 107;
        lIlIIIIII[88] = (-29698) & 32617;
        lIlIIIIII[89] = (-20739) & 30658;
        lIlIIIIII[90] = (-20802) & 22521;
        lIlIIIIII[91] = (-((-10242) & 30995)) & (-35) & 32767;
        lIlIIIIII[92] = (-1537) & 26536;
        lIlIIIIII[93] = (-16517) & 17916;
        lIlIIIIII[94] = (((99 + 32) - 116) + 149) ^ (((102 + 127) - 119) + 36);
        lIlIIIIII[95] = (((36 + 206) - 215) + 219) ^ (((189 + 126) - 172) + 50);
        lIlIIIIII[96] = (43 ^ 61) ^ (181 ^ 155);
        lIlIIIIII[97] = (251 ^ 194) ^ ((110 ^ 37) & ((204 ^ 135) ^ (-1)));
        lIlIIIIII[98] = (-((-3273) & 28623)) & (-129) & 28639;
        lIlIIIIII[99] = (-((-5699) & 30411)) & (-597) & 28670;
        lIlIIIIII[100] = ((71 + 123) - 98) + 32;
        lIlIIIIII[101] = 81 ^ 54;
        lIlIIIIII[102] = (-((-2395) & 11615)) & (-16385) & 28607;
        lIlIIIIII[103] = (-((-16915) & 29555)) & (-17025) & 32750;
        lIlIIIIII[104] = (-8329) & 11743;
        lIlIIIIII[105] = (-((-7251) & 24443)) & (-12371) & 32638;
        lIlIIIIII[106] = (-((-11521) & 32642)) & (-8209) & 32767;
        lIlIIIIII[107] = (-((-10165) & 30718)) & (-291) & 23931;
        lIlIIIIII[108] = (-8229) & 11700;
        lIlIIIIII[109] = (-((-2122) & 27499)) & (-1) & 28607;
        lIlIIIIII[110] = (-((-8199) & 8879)) & (-17) & 4095;
        lIlIIIIII[111] = (-21555) & 24511;
        lIlIIIIII[112] = (-((-2053) & 31447)) & (-5) & 32767;
        lIlIIIIII[113] = (-8193) & 11187;
        lIlIIIIII[114] = (-16969) & 20462;
        lIlIIIIII[115] = 14 ^ 52;
        lIlIIIIII[116] = (130 ^ 159) ^ (32 ^ 6);
        lIlIIIIII[117] = (((34 + 127) - (-51)) + 41) ^ (((141 + 15) - (-22)) + 15);
        lIlIIIIII[118] = 185 ^ 132;
    }

    private static boolean lIIIIllIIIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIIIIII[4];
    }

    private static boolean lIIIIllIIlII(int i) {
        return i > 0;
    }

    private static boolean lIIIIlIllllI(int i) {
        return i != 0;
    }
}
