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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/p.class */
public class C0015p implements F {
    static /* synthetic */ int ci;
    private static /* synthetic */ int[] lIlIllIl;
    public static /* synthetic */ WorldPoint ch;
    public static /* synthetic */ WorldPoint ce;
    public static /* synthetic */ WorldPoint cf;
    private static /* synthetic */ String[] bX;
    private static /* synthetic */ String[] lIlIlIll;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ List<C0003d> bB;
    public static /* synthetic */ WorldPoint cg;
    static /* synthetic */ boolean cj;

    private static boolean lIIlIIlIlII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIIlIIlIlII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[57])) {
            ?? r0 = lIlIllIl[0];
            "".length();
            return (-" ".length()) > (((((201 + 22) - 114) + 93) ^ (((10 + 134) - 120) + 112)) & (((((50 + 82) - 127) + 249) ^ (((42 + 163) - 107) + 90)) ^ (-" ".length()))) ? ((((136 + 93) - 143) + 52) ^ (((98 + 6) - 63) + 154)) & (((((178 + 13) - 95) + 108) ^ (((86 + 44) - 126) + 129)) ^ (-" ".length())) : r0;
        }
        return lIlIllIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lIlIllIl[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x065c, code lost:
        if (lIIlIIIllII(net.unethicalite.api.entities.TileObjects.getNearest(r0)) != false) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v473, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v495, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v141, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aA() {
        if (lIIlIIIlIIl(bz ? 1 : 0)) {
            C0001b.a(bB);
            if (lIIlIIIlIlI(bB.size(), lIlIllIl[0])) {
                System.out.println(lIlIlIll[lIlIllIl[1]]);
                bz = lIlIllIl[1];
            }
        }
        if (lIIlIIIlIll(bz ? 1 : 0)) {
            if (lIIlIIIlIll(ac() ? 1 : 0) && lIIlIIIlIll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIIllII(nearest) && lIIlIIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[0]];
                    C0000a.a(nearest);
                }
                if (lIIlIIIllII(nearest) && lIIlIIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlIIIlIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIllIl[2]);
                        "".length();
                    }
                    if (lIIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[3]];
                        if (lIIlIIIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIllIl[4]);
                            "".length();
                        }
                        if (lIIlIIIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIllIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIlIllIl[5]];
                        iArr[lIlIllIl[1]] = lIlIllIl[6];
                        iArr[lIlIllIl[0]] = lIlIllIl[7];
                        iArr[lIlIllIl[3]] = lIlIllIl[8];
                        iArr[lIlIllIl[9]] = lIlIllIl[10];
                        iArr[lIlIllIl[4]] = lIlIllIl[11];
                        iArr[lIlIllIl[12]] = lIlIllIl[13];
                        if (lIIlIIIlIll(C0004e.b(iArr) ? 1 : 0)) {
                            ag();
                            System.out.println(lIlIlIll[lIlIllIl[9]]);
                            bz = lIlIllIl[0];
                            return;
                        }
                        int[] iArr2 = new int[lIlIllIl[5]];
                        iArr2[lIlIllIl[1]] = lIlIllIl[6];
                        iArr2[lIlIllIl[0]] = lIlIllIl[7];
                        iArr2[lIlIllIl[3]] = lIlIllIl[8];
                        iArr2[lIlIllIl[9]] = lIlIllIl[10];
                        iArr2[lIlIllIl[4]] = lIlIllIl[11];
                        iArr2[lIlIllIl[12]] = lIlIllIl[13];
                        if (lIIlIIIlIIl(C0004e.b(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIlIllIl[3]];
                            iArr3[lIlIllIl[1]] = lIlIllIl[8];
                            iArr3[lIlIllIl[0]] = lIlIllIl[10];
                            C0000a.a(iArr3);
                            C0000a.a(lIlIllIl[6], lIlIllIl[14]);
                            C0000a.a(lIlIllIl[7], lIlIllIl[14]);
                            C0000a.a(lIlIllIl[15], lIlIllIl[14]);
                            C0000a.b(C0005f.aX, lIlIllIl[0]);
                            C0000a.a(lIlIllIl[11], lIlIllIl[4]);
                            C0000a.a(lIlIllIl[13], lIlIllIl[16]);
                        }
                    }
                }
            }
            if (lIIlIIIlIIl(Inventory.contains(C0005f.bb) ? 1 : 0) && lIIlIIIlIlI(Movement.getRunEnergy(), lIlIllIl[17])) {
                Inventory.getFirst(C0005f.bb).interact(lIlIlIll[lIlIllIl[4]]);
                Time.sleepTicks(lIlIllIl[0]);
                "".length();
            }
            if (lIIlIIIlIIl(ac() ? 1 : 0) && lIIlIIIlIll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                if (lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(ce), lIlIllIl[4])) {
                    if (lIIlIIIlIIl(Inventory.contains(C0005f.aX) ? 1 : 0) && lIIlIIIlIll(Equipment.contains(C0005f.aX) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aX).interact(lIlIlIll[lIlIllIl[12]]);
                    }
                    if (lIIlIIIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[5]];
                    Movement.walkTo(ce);
                    "".length();
                    Time.sleepTicks(lIlIllIl[0]);
                    "".length();
                }
                if (lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(ce), lIlIllIl[4])) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[18]];
                    ci = lIlIllIl[1];
                    if (lIIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[lIlIllIl[0]];
                        strArr[lIlIllIl[1]] = lIlIlIll[lIlIllIl[16]];
                        TileObjects.getNearest(strArr).interact(lIlIlIll[lIlIllIl[19]]);
                        Time.sleepTicks(lIlIllIl[3]);
                        "".length();
                    }
                    C0006g.a(bX);
                }
            }
            if (lIIlIIlIIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[12])) {
                if (lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(cf), lIlIllIl[4])) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[14]];
                    Movement.walkTo(cf);
                    "".length();
                    Time.sleepTicks(lIlIllIl[0]);
                    "".length();
                    if (lIIlIIIlIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIlIllIl[20], lIlIllIl[21], lIlIllIl[1])) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[22]];
                        C0004e.c(new WorldPoint(lIlIllIl[23], lIlIllIl[24], lIlIllIl[1]));
                        Time.sleepTicks(lIlIllIl[5]);
                        "".length();
                    }
                }
                if (lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(cf), lIlIllIl[4])) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[25]];
                    C0006g.a(lIlIlIll[lIlIllIl[26]], bX, lIlIllIl[0]);
                }
            }
            if (lIIlIIlIIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[14])) {
                if (lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(cg), lIlIllIl[4])) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[27]];
                    Movement.walkTo(cg);
                    "".length();
                    Time.sleepTicks(lIlIllIl[0]);
                    "".length();
                }
                if (lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIlIllIl[4])) {
                    int[] iArr4 = new int[lIlIllIl[0]];
                    iArr4[lIlIllIl[1]] = lIlIllIl[8];
                    if (lIIlIIIlIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIlIllIl[0]];
                        iArr5[lIlIllIl[1]] = lIlIllIl[8];
                        Item first = Inventory.getFirst(iArr5);
                        String[] strArr2 = new String[lIlIllIl[0]];
                        strArr2[lIlIllIl[1]] = lIlIlIll[lIlIllIl[28]];
                        first.useOn(TileObjects.getNearest(strArr2));
                        Time.sleepTicks(lIlIllIl[3]);
                        "".length();
                    }
                }
            }
            if (lIIlIIlIIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[28])) {
                int[] iArr6 = new int[lIlIllIl[0]];
                iArr6[lIlIllIl[1]] = lIlIllIl[10];
                if (lIIlIIIlIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[lIlIllIl[0]];
                    iArr7[lIlIllIl[1]] = lIlIllIl[10];
                    Inventory.getFirst(iArr7).interact(lIlIlIll[lIlIllIl[29]]);
                }
                if (lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIlIllIl[4])) {
                    String[] strArr3 = new String[lIlIllIl[0]];
                    strArr3[lIlIllIl[1]] = lIlIlIll[lIlIllIl[30]];
                    TileObjects.getNearest(strArr3).interact(lIlIlIll[lIlIllIl[31]]);
                    Time.sleepTicks(lIlIllIl[9]);
                    "".length();
                }
                if (lIIlIIIlllI(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(lIlIllIl[32], lIlIllIl[33])), lIlIllIl[34])) {
                    String[] strArr4 = new String[lIlIllIl[0]];
                    strArr4[lIlIllIl[1]] = lIlIlIll[lIlIllIl[35]];
                }
                String[] strArr5 = new String[lIlIllIl[0]];
                strArr5[lIlIllIl[1]] = lIlIlIll[lIlIllIl[36]];
                if (lIIlIIIllII(TileObjects.getNearest(strArr5))) {
                    if (lIIlIIIlllI(Players.getLocal().getLocalLocation().getY(), lIlIllIl[37])) {
                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                        String[] strArr6 = new String[lIlIllIl[0]];
                        strArr6[lIlIllIl[1]] = lIlIlIll[lIlIllIl[38]];
                        if (lIIlIIIllll(worldLocation.distanceTo(TileObjects.getNearest(strArr6).getWorldLocation()), lIlIllIl[14])) {
                            String[] strArr7 = new String[lIlIllIl[0]];
                            strArr7[lIlIllIl[1]] = lIlIlIll[lIlIllIl[39]];
                            if (lIIlIIlIIIl(NPCs.getNearest(strArr7))) {
                                AccBuilderBarrows.c = lIlIlIll[lIlIllIl[40]];
                                String[] strArr8 = new String[lIlIllIl[0]];
                                strArr8[lIlIllIl[1]] = lIlIlIll[lIlIllIl[41]];
                                TileObjects.getNearest(strArr8).interact(lIlIlIll[lIlIllIl[42]]);
                                Time.sleepTicks(lIlIllIl[14]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr9 = new String[lIlIllIl[0]];
                    strArr9[lIlIllIl[1]] = lIlIlIll[lIlIllIl[43]];
                    if (lIIlIIlIIIl(NPCs.getNearest(strArr9)) && lIIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[44]];
                        String[] strArr10 = new String[lIlIllIl[0]];
                        strArr10[lIlIllIl[1]] = lIlIlIll[lIlIllIl[45]];
                        TileObjects.getNearest(strArr10).interact(lIlIlIll[lIlIllIl[46]]);
                        Time.sleepTicks(lIlIllIl[12]);
                        "".length();
                        C0006g.a(bX);
                    }
                    C0006g.a(bX);
                }
            }
            if (lIIlIIlIIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[36])) {
                AccBuilderBarrows.c = lIlIlIll[lIlIllIl[47]];
                C0006g.a(lIlIlIll[lIlIllIl[48]], bX);
            }
            if (lIIlIIlIIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[42])) {
                if (lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(cg), lIlIllIl[4])) {
                    String[] strArr11 = new String[lIlIllIl[0]];
                    strArr11[lIlIllIl[1]] = lIlIlIll[lIlIllIl[49]];
                    if (lIIlIIlIIIl(NPCs.getNearest(strArr11))) {
                        String[] strArr12 = new String[lIlIllIl[0]];
                        strArr12[lIlIllIl[1]] = lIlIlIll[lIlIllIl[50]];
                        if (lIIlIIIlIll(Equipment.contains(strArr12) ? 1 : 0)) {
                            String[] strArr13 = new String[lIlIllIl[0]];
                            strArr13[lIlIllIl[1]] = lIlIlIll[lIlIllIl[51]];
                            if (lIIlIIIlIIl(Inventory.contains(strArr13) ? 1 : 0)) {
                                String[] strArr14 = new String[lIlIllIl[0]];
                                strArr14[lIlIllIl[1]] = lIlIlIll[lIlIllIl[52]];
                                Inventory.getFirst(strArr14).interact(lIlIlIll[lIlIllIl[53]]);
                            }
                        }
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[54]];
                        Movement.walkTo(cg);
                        "".length();
                        Time.sleepTicks(lIlIllIl[0]);
                        "".length();
                    }
                }
                if (lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIlIllIl[4])) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[55]];
                    String[] strArr15 = new String[lIlIllIl[0]];
                    strArr15[lIlIllIl[1]] = lIlIlIll[lIlIllIl[56]];
                    if (lIIlIIIllII(TileObjects.getNearest(strArr15))) {
                        String[] strArr16 = new String[lIlIllIl[0]];
                        strArr16[lIlIllIl[1]] = lIlIlIll[lIlIllIl[57]];
                        TileObjects.getNearest(strArr16).interact(lIlIlIll[lIlIllIl[58]]);
                        Time.sleepTicks(lIlIllIl[9]);
                        "".length();
                    }
                }
                if (lIIlIIIlllI(Players.getLocal().getLocalLocation().getY(), lIlIllIl[37])) {
                    WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
                    String[] strArr17 = new String[lIlIllIl[0]];
                    strArr17[lIlIllIl[1]] = lIlIlIll[lIlIllIl[59]];
                    if (lIIlIIIlllI(worldLocation2.distanceTo(TileObjects.getNearest(strArr17).getWorldLocation()), lIlIllIl[18])) {
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[60]];
                        String[] strArr18 = new String[lIlIllIl[0]];
                        strArr18[lIlIllIl[1]] = lIlIlIll[lIlIllIl[61]];
                        TileObjects.getNearest(strArr18).interact(lIlIlIll[lIlIllIl[62]]);
                        Time.sleepTicks(lIlIllIl[14]);
                        "".length();
                    }
                }
                if (lIIlIIlIIIl(Players.getLocal().getInteracting()) && lIIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr19 = new String[lIlIllIl[0]];
                    strArr19[lIlIllIl[1]] = lIlIlIll[lIlIllIl[63]];
                    if (lIIlIIIlIll(Equipment.contains(strArr19) ? 1 : 0)) {
                        String[] strArr20 = new String[lIlIllIl[0]];
                        strArr20[lIlIllIl[1]] = lIlIlIll[lIlIllIl[64]];
                        if (lIIlIIIlIIl(Inventory.contains(strArr20) ? 1 : 0)) {
                            String[] strArr21 = new String[lIlIllIl[0]];
                            strArr21[lIlIllIl[1]] = lIlIlIll[lIlIllIl[65]];
                            Inventory.getFirst(strArr21).interact(lIlIlIll[lIlIllIl[66]]);
                        }
                    }
                    int[] iArr8 = new int[lIlIllIl[0]];
                    iArr8[lIlIllIl[1]] = lIlIllIl[10];
                    if (lIIlIIIlIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIlIllIl[0]];
                        iArr9[lIlIllIl[1]] = lIlIllIl[10];
                        if (lIIlIIIlIll(Equipment.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lIlIllIl[0]];
                            iArr10[lIlIllIl[1]] = lIlIllIl[10];
                            Inventory.getFirst(iArr10).interact(lIlIlIll[lIlIllIl[34]]);
                        }
                    }
                    String[] strArr22 = new String[lIlIllIl[0]];
                    strArr22[lIlIllIl[1]] = lIlIlIll[lIlIllIl[67]];
                    NPCs.getNearest(strArr22).interact(lIlIlIll[lIlIllIl[68]]);
                    Time.sleepTicks(lIlIllIl[0]);
                    "".length();
                }
                if (lIIlIIlIIlI(lIIlIIIIlIl(C0004e.v(), 60.0d))) {
                    int[] iArr11 = new int[lIlIllIl[0]];
                    iArr11[lIlIllIl[1]] = lIlIllIl[13];
                    if (lIIlIIIlIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[lIlIllIl[0]];
                        iArr12[lIlIllIl[1]] = lIlIllIl[13];
                        Inventory.getFirst(iArr12).interact(lIlIlIll[lIlIllIl[69]]);
                        Time.sleepTicks(lIlIllIl[0]);
                        "".length();
                    }
                }
                C0006g.a(bX);
            }
            if (lIIlIIlIIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[47])) {
                String[] strArr23 = new String[lIlIllIl[0]];
                strArr23[lIlIllIl[1]] = lIlIlIll[lIlIllIl[70]];
                if (lIIlIIIlIll(Inventory.contains(strArr23) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[71]];
                    String[] strArr24 = new String[lIlIllIl[0]];
                    strArr24[lIlIllIl[1]] = lIlIlIll[lIlIllIl[72]];
                    TileObjects.getNearest(strArr24).interact(lIlIlIll[lIlIllIl[73]]);
                    Time.sleepTicks(lIlIllIl[4]);
                    "".length();
                }
                String[] strArr25 = new String[lIlIllIl[0]];
                strArr25[lIlIllIl[1]] = lIlIlIll[lIlIllIl[74]];
                if (lIIlIIIlIIl(Inventory.contains(strArr25) ? 1 : 0)) {
                    if (lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(cf), lIlIllIl[4])) {
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[75]];
                        Movement.walkTo(cf);
                        "".length();
                        Time.sleepTicks(lIlIllIl[0]);
                        "".length();
                        if (lIIlIIIlIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIlIllIl[20], lIlIllIl[21], lIlIllIl[1])) ? 1 : 0)) {
                            AccBuilderBarrows.c = lIlIlIll[lIlIllIl[76]];
                            C0004e.c(new WorldPoint(lIlIllIl[23], lIlIllIl[24], lIlIllIl[1]));
                            Time.sleepTicks(lIlIllIl[5]);
                            "".length();
                        }
                    }
                    if (lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(cf), lIlIllIl[4])) {
                        AccBuilderBarrows.c = lIlIlIll[lIlIllIl[77]];
                        C0006g.a(lIlIlIll[lIlIllIl[78]], bX, lIlIllIl[0]);
                    }
                }
            }
            if (lIIlIIlIIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIllIl[52])) {
                if (lIIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(ch), lIlIllIl[9])) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[79]];
                    Movement.walkTo(ch);
                    "".length();
                    Time.sleepTicks(lIlIllIl[0]);
                    "".length();
                }
                if (lIIlIIIllll(Players.getLocal().getWorldLocation().distanceTo(ch), lIlIllIl[9])) {
                    AccBuilderBarrows.c = lIlIlIll[lIlIllIl[80]];
                    if (lIIlIIIlIlI(ci, lIlIllIl[0])) {
                        Q.lX += lIlIllIl[0];
                        Q.o(AccBuilderBarrows.m);
                        ci += lIlIllIl[0];
                        Q.lX = lIlIllIl[1];
                        cj = lIlIllIl[1];
                    }
                    C0006g.a(lIlIlIll[lIlIllIl[17]], bX);
                }
            }
        }
    }

    private static boolean lIIlIIIlIll(int i) {
        return i == 0;
    }

    static {
        lIIlIIIIlII();
        lIIlIIIIIll();
        bB = new ArrayList();
        ce = new WorldPoint(lIlIllIl[88], lIlIllIl[89], lIlIllIl[1]);
        cf = new WorldPoint(lIlIllIl[90], lIlIllIl[91], lIlIllIl[1]);
        cg = new WorldPoint(lIlIllIl[92], lIlIllIl[93], lIlIllIl[1]);
        ch = new WorldPoint(lIlIllIl[94], lIlIllIl[95], lIlIllIl[1]);
        ck = null;
        String[] strArr = new String[lIlIllIl[4]];
        strArr[lIlIllIl[1]] = lIlIlIll[lIlIllIl[96]];
        strArr[lIlIllIl[0]] = lIlIlIll[lIlIllIl[97]];
        strArr[lIlIllIl[3]] = lIlIlIll[lIlIllIl[98]];
        strArr[lIlIllIl[9]] = lIlIlIll[lIlIllIl[99]];
        bX = strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (lIIlIIIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ac() {
        int[] iArr = new int[lIlIllIl[0]];
        iArr[lIlIllIl[1]] = lIlIllIl[6];
        if (lIIlIIIllIl(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIlIllIl[0]];
            iArr2[lIlIllIl[1]] = lIlIllIl[8];
            if (lIIlIIIllIl(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIlIllIl[0]];
                iArr3[lIlIllIl[1]] = lIlIllIl[10];
                if (lIIlIIlIIll(Inventory.getCount(iArr3))) {
                    int[] iArr4 = new int[lIlIllIl[0]];
                    iArr4[lIlIllIl[1]] = lIlIllIl[10];
                }
                int[] iArr5 = new int[lIlIllIl[0]];
                iArr5[lIlIllIl[1]] = lIlIllIl[13];
                if (lIIlIIIllIl(Inventory.getCount(iArr5))) {
                    ?? r0 = lIlIllIl[0];
                    "".length();
                    return (((110 ^ 127) ^ (249 ^ 169)) & (((((201 + 97) - 291) + 243) ^ (((23 + 62) - 14) + 116)) ^ (-" ".length()))) < 0 ? ((39 ^ 66) ^ (66 ^ 9)) & (((96 ^ 35) ^ (75 ^ 38)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIlIllIl[1];
    }

    private static String lIIIlllIIlI(String lIlllIlIllllIlI, String lIlllIlIllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIlIllllIIl.getBytes(StandardCharsets.UTF_8)), lIlIllIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlllIlIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIlIllllIll) {
            lIlllIlIllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIllIl(int i) {
        return i > 0;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            aA();
            "".length();
            if ((176 ^ 180) <= ((182 ^ 157) & ((103 ^ 76) ^ (-1)))) {
                return (175 ^ 176) & ((57 ^ 38) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIllIl[85];
    }

    private static boolean lIIlIIIlIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a9, code lost:
        if (lIIlIIIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0015p.lIlIllIl[12]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ag() {
        int[] iArr;
        int[] iArr2 = new int[lIlIllIl[0]];
        iArr2[lIlIllIl[1]] = lIlIllIl[8];
        if (lIIlIIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllIl[8], lIlIllIl[0], lIlIllIl[81]));
            "".length();
        }
        int[] iArr3 = new int[lIlIllIl[0]];
        iArr3[lIlIllIl[1]] = lIlIllIl[10];
        if (lIIlIIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllIl[10], lIlIllIl[0], lIlIllIl[81]));
            "".length();
        }
        int[] iArr4 = new int[lIlIllIl[0]];
        iArr4[lIlIllIl[1]] = lIlIllIl[13];
        if (lIIlIIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllIl[13], lIlIllIl[50], lIlIllIl[82]));
            "".length();
        }
        int[] iArr5 = new int[lIlIllIl[0]];
        iArr5[lIlIllIl[1]] = lIlIllIl[11];
        if (lIIlIIIlIll(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllIl[11], lIlIllIl[12], C0008i.bw));
            "".length();
        }
        if (lIIlIIIlIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIlIll[lIlIllIl[87]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllIl[83], lIlIllIl[12], lIlIllIl[84]));
            "".length();
        }
        int[] iArr6 = new int[lIlIllIl[0]];
        iArr6[lIlIllIl[1]] = lIlIllIl[7];
        if (lIIlIIIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIlIllIl[0]];
            iArr7[lIlIllIl[1]] = lIlIllIl[7];
            if (lIIlIIIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIllIl[0]];
                iArr8[lIlIllIl[1]] = lIlIllIl[7];
            }
            iArr = new int[lIlIllIl[0]];
            iArr[lIlIllIl[1]] = lIlIllIl[6];
            if (lIIlIIIlIll(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bB.add(new C0003d(lIlIllIl[6], lIlIllIl[57], lIlIllIl[82]));
            "".length();
            return;
        }
        bB.add(new C0003d(lIlIllIl[7], lIlIllIl[28], lIlIllIl[82]));
        "".length();
        iArr = new int[lIlIllIl[0]];
        iArr[lIlIllIl[1]] = lIlIllIl[6];
        if (lIIlIIIlIll(Bank.contains(iArr) ? 1 : 0)) {
        }
    }

    private static String lIIIlllIlII(String lIlllIllIIlllII, String lIlllIllIIllIll) {
        String lIlllIllIIlllII2 = new String(Base64.getDecoder().decode(lIlllIllIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIllIIllIlI = new StringBuilder();
        char[] charArray = lIlllIllIIllIll.toCharArray();
        int lIlllIllIIllIII = lIlIllIl[1];
        char[] charArray2 = lIlllIllIIlllII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIllIl[1];
        while (lIIlIIIlIlI(i, length)) {
            char lIlllIllIIlllIl = charArray2[i];
            lIlllIllIIllIlI.append((char) (lIlllIllIIlllIl ^ charArray[lIlllIllIIllIII % charArray.length]));
            "".length();
            lIlllIllIIllIII++;
            i++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(lIlllIllIIllIlI);
    }

    private static void lIIlIIIIIll() {
        lIlIlIll = new String[lIlIllIl[100]];
        lIlIlIll[lIlIllIl[1]] = lIIIlllIIlI("55LbAlF4XK+4Av5nAG1FY1v7MZp/EAppvUXAnQMjdOK5V13ZH64vtj/ELSMOPMXQ", "QRErf");
        lIlIlIll[lIlIllIl[0]] = lIIIlllIIll("d3R7eKXrZc9ecJaBm/s+IA==", "ZNYdw");
        lIlIlIll[lIlIllIl[3]] = lIIIlllIIll("OvZJgWgcicGoKPiQopCAeeUKRWBXwVhf", "thPpQ");
        lIlIlIll[lIlIllIl[9]] = lIIIlllIIll("c1NK6E8Aa4IxgE2AH/8vYallsPQSnGwQEBNyoV4cvg20HQKtid4HVK+s0wYS9S0AVuHhrwkHQRw=", "MAXsB");
        lIlIlIll[lIlIllIl[4]] = lIIIlllIIlI("IyJpMoevL2I=", "XXbdR");
        lIlIlIll[lIlIllIl[12]] = lIIIlllIlII("OTcZJw==", "nRxUh");
        lIlIlIll[lIlIllIl[5]] = lIIIlllIIlI("bmV6KoxCsLmuNZcWAi8XrA==", "qELkz");
        lIlIlIll[lIlIllIl[18]] = lIIIlllIIll("8zrveIYECuAn1hwfgTG5Vw==", "jPrAl");
        lIlIlIll[lIlIllIl[16]] = lIIIlllIIlI("ijYNefhzeDrWL83pYRb/Xg==", "cxVaK");
        lIlIlIll[lIlIllIl[19]] = lIIIlllIIll("4JK6LQkRdeg=", "EOUHi");
        lIlIlIll[lIlIllIl[14]] = lIIIlllIIll("eekszsneIVH5JqCmBsoVJg==", "Flqva");
        lIlIlIll[lIlIllIl[22]] = lIIIlllIlII("PCI3CT9DdiEGPQw9KwQzTzk3Hg==", "oVBjT");
        lIlIlIll[lIlIllIl[25]] = lIIIlllIIll("zWcSnAJ2jS9qPEumf1OyyQ==", "sHGZP");
        lIlIlIll[lIlIllIl[26]] = lIIIlllIIlI("b6FdyrkAad8=", "cRZCz");
        lIlIlIll[lIlIllIl[27]] = lIIIlllIIll("KiFm6rToe1y+m2CznAhYDA==", "EHskx");
        lIlIlIll[lIlIllIl[28]] = lIIIlllIIlI("hlGzH5L7VbYm0/QPccGZXQ==", "LCnhb");
        lIlIlIll[lIlIllIl[29]] = lIIIlllIIll("Rah3XJ6I8Bk=", "vtpwl");
        lIlIlIll[lIlIllIl[30]] = lIIIlllIlII("IyYmMAoXN3Q5Cxw3", "pRTQd");
        lIlIlIll[lIlIllIl[31]] = lIIIlllIlII("GiUwDBV0LTYWGQ==", "YIYaw");
        lIlIlIll[lIlIllIl[35]] = lIIIlllIIlI("FgqJ+goZT+pcKJfMHJk7MA==", "yoTef");
        lIlIlIll[lIlIllIl[36]] = lIIIlllIIlI("BWKoYRsdXUDfMOfy+J1pOQ==", "gGjvz");
        lIlIlIll[lIlIllIl[38]] = lIIIlllIlII("FhYhGwE1HSs=", "TzNxj");
        lIlIlIll[lIlIllIl[39]] = lIIIlllIIll("rpvj3ZJVWSy9Wt7Xz4N2Jg==", "Itrao");
        lIlIlIll[lIlIllIl[40]] = lIIIlllIIlI("SSkzy1k+dFLC7MDc08U46NnIcbhnJmgy", "WBYER");
        lIlIlIll[lIlIllIl[41]] = lIIIlllIIll("8FCiOCXfEli4o632AvgnSg==", "KKzTa");
        lIlIlIll[lIlIllIl[42]] = lIIIlllIIlI("v79EV6Yusn36TWh9BjaT7Q==", "hfavl");
        lIlIlIll[lIlIllIl[43]] = lIIIlllIIll("5uIkBPUirASzaPbqit6XMg==", "vuEPY");
        lIlIlIll[lIlIllIl[44]] = lIIIlllIIll("tbOsI+MzopTnkGF+kWCm2A==", "TuSRG");
        lIlIlIll[lIlIllIl[45]] = lIIIlllIlII("FCkwJSwzLTs=", "GBUII");
        lIlIlIll[lIlIllIl[46]] = lIIIlllIIll("B3pAFxHaTujtIf33XCYg1w==", "evnsa");
        lIlIlIll[lIlIllIl[47]] = lIIIlllIIll("66guGxv3EygpMnbpicpym85YcJjoz44V", "tUHwC");
        lIlIlIll[lIlIllIl[48]] = lIIIlllIIlI("LVfg5zrzPVc=", "DIXMf");
        lIlIlIll[lIlIllIl[49]] = lIIIlllIlII("MCYNAyQMLg==", "cIxqL");
        lIlIlIll[lIlIllIl[50]] = lIIIlllIIlI("kSvu2IZoOFGOEGKSawXdpb3+7/hFbWbi", "TKidv");
        lIlIlIll[lIlIllIl[51]] = lIIIlllIIlI("pM7y0O0uBa6LdanoL4Kdc1kUDBqa0GEE", "OFCpg");
        lIlIlIll[lIlIllIl[52]] = lIIIlllIIlI("97UE9s+bxbQd9+Emv9Q3yL7dWJv4fCfo", "SGhJQ");
        lIlIlIll[lIlIllIl[53]] = lIIIlllIlII("LRMKPw==", "zvkMp");
        lIlIlIll[lIlIllIl[54]] = lIIIlllIIlI("5c+7b/CkVSVSeD4cPxbbyQ==", "NJsLm");
        lIlIlIll[lIlIllIl[55]] = lIIIlllIIlI("D0eCQ+pAgOq2kfNcFyd7Uw==", "IfgEw");
        lIlIlIll[lIlIllIl[56]] = lIIIlllIlII("KycqLSIfNngkIxQ2", "xSXLL");
        lIlIlIll[lIlIllIl[57]] = lIIIlllIIlI("gAU39vi+EKQHppGG+8On2g==", "QhsYg");
        lIlIlIll[lIlIllIl[58]] = lIIIlllIIlI("cqUH3MdMyVSIWIDGK4FtXQ==", "vxnJK");
        lIlIlIll[lIlIllIl[59]] = lIIIlllIIll("M9SFRSvkNtWYdX8mPZ2AKg==", "WSJQc");
        lIlIlIll[lIlIllIl[60]] = lIIIlllIIll("nCF/NKSc9YQerA/8UC6sP0HQM/46cn3U", "kNagi");
        lIlIlIll[lIlIllIl[61]] = lIIIlllIIll("26bb92f29s6TggWFWINxvQ==", "qNLzi");
        lIlIlIll[lIlIllIl[62]] = lIIIlllIlII("CgsiKDBkCD0gIA==", "IgKER");
        lIlIlIll[lIlIllIl[63]] = lIIIlllIIlI("FqkMJBobM07CUzxYMiZgQemnNG4FD3wC", "jDPil");
        lIlIlIll[lIlIllIl[64]] = lIIIlllIIll("FSprmRht+BE4RN27Y7/WPlEHDz//tsvD", "HpEqw");
        lIlIlIll[lIlIllIl[65]] = lIIIlllIIll("wcyVNNLY3kKcvPM6YdeI6vj7JdfBV4SQ", "tHfLC");
        lIlIlIll[lIlIllIl[66]] = lIIIlllIlII("DhwOPg==", "YyoLu");
        lIlIlIll[lIlIllIl[34]] = lIIIlllIIlI("OoaICS1wyG4=", "Thxkh");
        lIlIlIll[lIlIllIl[67]] = lIIIlllIIlI("Une8/ZXVTac=", "uMJJR");
        lIlIlIll[lIlIllIl[68]] = lIIIlllIIll("KdGqb1hmrOw=", "OEfBl");
        lIlIlIll[lIlIllIl[69]] = lIIIlllIIlI("8MxS54GCG4M=", "ckAMX");
        lIlIlIll[lIlIllIl[70]] = lIIIlllIlII("ERgyMQktEGclDi0D", "BwGCa");
        lIlIlIll[lIlIllIl[71]] = lIIIlllIIll("rbfqm1ERZVA2+U2veTt02A==", "xDjyt");
        lIlIlIll[lIlIllIl[72]] = lIIIlllIlII("IikMKmYVIxg8Lgkr", "fLmNF");
        lIlIlIll[lIlIllIl[73]] = lIIIlllIIll("q5fK2nrSmgwzq2ryGO4rwg==", "kxhBT");
        lIlIlIll[lIlIllIl[74]] = lIIIlllIlII("Gh4AMzgmFlUnPyYF", "IquAP");
        lIlIlIll[lIlIllIl[75]] = lIIIlllIlII("JxYAYgMGVwUjBQgf", "iwvBw");
        lIlIlIll[lIlIllIl[76]] = lIIIlllIlII("HRs8ACpiTyoPKC0EIA0mbgA8Fw==", "NoIcA");
        lIlIlIll[lIlIllIl[77]] = lIIIlllIlII("OhUNCSsAE0ERIxwVCQ==", "ntabB");
        lIlIlIll[lIlIllIl[78]] = lIIIlllIlII("ORMwKR0=", "jrBHu");
        lIlIlIll[lIlIllIl[79]] = lIIIlllIIlI("fIaVLZZgme0yp4Lo2BhU2A==", "jlQPP");
        lIlIlIll[lIlIllIl[80]] = lIIIlllIIlI("VVOvrfd6SbMTY0GeEWOh/A==", "IGgtX");
        lIlIlIll[lIlIllIl[17]] = lIIIlllIIlI("ggRhQAeiCH8=", "KjZuJ");
        lIlIlIll[lIlIllIl[86]] = lIIIlllIIll("Yhbobm66CYVVGyuEoxGglguwZnxfkNE9", "ULFwf");
        lIlIlIll[lIlIllIl[87]] = lIIIlllIIlI("D/KNIGeuC9L7bawo4/h/vhnqC2BtFJLY", "wicDw");
        lIlIlIll[lIlIllIl[96]] = lIIIlllIlII("PAMgeA==", "efSVl");
        lIlIlIll[lIlIllIl[97]] = lIIIlllIIll("5W+aCkgp0ebt/4V+6t4cBn/xiT4yYHS6", "bWlVI");
        lIlIlIll[lIlIllIl[98]] = lIIIlllIIll("yalzx0FrzaPjSNN1j16SETsUKdiTsKuve0X9KQOeguw=", "FZbio");
        lIlIlIll[lIlIllIl[99]] = lIIIlllIIll("juyGA3UYjdA=", "ieVKX");
    }

    private static boolean lIIlIIlIIll(int i) {
        return i <= 0;
    }

    private static void lIIlIIIIlII() {
        lIlIllIl = new int[101];
        lIlIllIl[0] = " ".length();
        lIlIllIl[1] = (43 ^ 103) & ((196 ^ 136) ^ (-1));
        lIlIllIl[2] = (-8306) & 13305;
        lIlIllIl[3] = "  ".length();
        lIlIllIl[4] = (((74 + 47) - 108) + 125) ^ (((90 + 19) - 33) + 66);
        lIlIllIl[5] = 187 ^ 189;
        lIlIllIl[6] = (-16529) & 24535;
        lIlIllIl[7] = (-8230) & 16237;
        lIlIllIl[8] = (-30721) & 31674;
        lIlIllIl[9] = "   ".length();
        lIlIllIl[10] = (-((-16431) & 31471)) & (-1) & 16371;
        lIlIllIl[11] = (-((-16641) & 18215)) & (-16385) & 30583;
        lIlIllIl[12] = 180 ^ 177;
        lIlIllIl[13] = (-((-10633) & 32141)) & (-2689) & 24575;
        lIlIllIl[14] = (16 ^ 112) ^ (200 ^ 162);
        lIlIllIl[15] = (-"   ".length()) & (-16517) & 24527;
        lIlIllIl[16] = 0 ^ 8;
        lIlIllIl[17] = 114 ^ 51;
        lIlIllIl[18] = 113 ^ 118;
        lIlIllIl[19] = 110 ^ 103;
        lIlIllIl[20] = (-((-6690) & 15935)) & (-4097) & 16383;
        lIlIllIl[21] = (-28695) & 31999;
        lIlIllIl[22] = 120 ^ 115;
        lIlIllIl[23] = (-29729) & 32767;
        lIlIllIl[24] = (-4625) & 7921;
        lIlIllIl[25] = (((147 + 66) - 203) + 168) ^ (((184 + 62) - 104) + 48);
        lIlIllIl[26] = (11 ^ 121) ^ (((57 + 40) - 37) + 67);
        lIlIllIl[27] = (39 ^ 51) ^ (58 ^ 32);
        lIlIllIl[28] = 120 ^ 119;
        lIlIllIl[29] = (22 ^ 47) ^ (22 ^ 63);
        lIlIllIl[30] = (((49 + 5) - 14) + 112) ^ (((97 + 30) - 113) + 123);
        lIlIllIl[31] = (56 ^ 4) ^ (141 ^ 163);
        lIlIllIl[32] = (-25658) & 32633;
        lIlIllIl[33] = (-8215) & 14550;
        lIlIllIl[34] = (((103 + 56) - 78) + 109) ^ (((60 + 88) - 13) + 5);
        lIlIllIl[35] = 177 ^ 162;
        lIlIllIl[36] = (94 ^ 23) ^ (215 ^ 138);
        lIlIllIl[37] = (-((-9868) & 26303)) & (-9225) & 30715;
        lIlIllIl[38] = 89 ^ 76;
        lIlIllIl[39] = 209 ^ 199;
        lIlIllIl[40] = 133 ^ 146;
        lIlIllIl[41] = 48 ^ 40;
        lIlIllIl[42] = (((55 + 53) - 12) + 84) ^ (((13 + 47) - 51) + 164);
        lIlIllIl[43] = 4 ^ 30;
        lIlIllIl[44] = (((73 + 122) - 177) + 139) ^ (((64 + 125) - 100) + 45);
        lIlIllIl[45] = 74 ^ 86;
        lIlIllIl[46] = (((6 + 142) - (-4)) + 3) ^ (((26 + 101) - 42) + 49);
        lIlIllIl[47] = (44 ^ 96) ^ (96 ^ 50);
        lIlIllIl[48] = (59 ^ 71) ^ (229 ^ 134);
        lIlIllIl[49] = 165 ^ 133;
        lIlIllIl[50] = 160 ^ 129;
        lIlIllIl[51] = (((129 + 62) - 143) + 130) ^ (((42 + 79) - 84) + 107);
        lIlIllIl[52] = 155 ^ 184;
        lIlIllIl[53] = (33 ^ 87) ^ (148 ^ 198);
        lIlIllIl[54] = 4 ^ 33;
        lIlIllIl[55] = (((112 + 72) - 111) + 74) ^ (((67 + 101) - 33) + 46);
        lIlIllIl[56] = (108 ^ 56) ^ (202 ^ 185);
        lIlIllIl[57] = 57 ^ 17;
        lIlIllIl[58] = 8 ^ 33;
        lIlIllIl[59] = 155 ^ 177;
        lIlIllIl[60] = (180 ^ 139) ^ (79 ^ 91);
        lIlIllIl[61] = (115 ^ 63) ^ (44 ^ 76);
        lIlIllIl[62] = 108 ^ 65;
        lIlIllIl[63] = 50 ^ 28;
        lIlIllIl[64] = 114 ^ 93;
        lIlIllIl[65] = 104 ^ 88;
        lIlIllIl[66] = 132 ^ 181;
        lIlIllIl[67] = 50 ^ 1;
        lIlIllIl[68] = (((125 + 17) - 56) + 160) ^ (((172 + 58) - 77) + 41);
        lIlIllIl[69] = 91 ^ 110;
        lIlIllIl[70] = 157 ^ 171;
        lIlIllIl[71] = 6 ^ 49;
        lIlIllIl[72] = 41 ^ 17;
        lIlIllIl[73] = (243 ^ 165) ^ (120 ^ 23);
        lIlIllIl[74] = 149 ^ 175;
        lIlIllIl[75] = (((48 + 103) - 134) + 167) ^ (((5 + 129) - 130) + 127);
        lIlIllIl[76] = 77 ^ 113;
        lIlIllIl[77] = 60 ^ 1;
        lIlIllIl[78] = (119 ^ 78) ^ (84 ^ 83);
        lIlIllIl[79] = 139 ^ 180;
        lIlIllIl[80] = 114 ^ 50;
        lIlIllIl[81] = (-4184) & 13183;
        lIlIllIl[82] = (-((-17921) & 30299)) & (-17442) & 30719;
        lIlIllIl[83] = (-((-11459) & 28150)) & (-1) & 28671;
        lIlIllIl[84] = (-535) & 25534;
        lIlIllIl[85] = (87 ^ 107) ^ (58 ^ 98);
        lIlIllIl[86] = (((202 + 213) - 215) + 29) ^ (((10 + 34) - (-73)) + 50);
        lIlIllIl[87] = 209 ^ 146;
        lIlIllIl[88] = (-((-18629) & 22997)) & (-25121) & 32573;
        lIlIllIl[89] = (-((-2519) & 31199)) & (-5) & 31935;
        lIlIllIl[90] = (-((-18615) & 31927)) & (-2) & 16349;
        lIlIllIl[91] = (-17153) & 20446;
        lIlIllIl[92] = (-((-3169) & 16244)) & (-16417) & 32639;
        lIlIllIl[93] = (-((-20431) & 32719)) & (-16389) & 32023;
        lIlIllIl[94] = (-((-15377) & 16253)) & (-129) & 4095;
        lIlIllIl[95] = (-((-31797) & 32575)) & (-16433) & 20475;
        lIlIllIl[96] = (((110 + 153) - 237) + 177) ^ (((105 + 9) - (-12)) + 17);
        lIlIllIl[97] = 85 ^ 16;
        lIlIllIl[98] = 200 ^ 142;
        lIlIllIl[99] = (((174 + 136) - 197) + 79) ^ (((35 + 74) - 82) + 108);
        lIlIllIl[100] = 115 ^ 59;
    }

    private static String lIIIlllIIll(String lIlllIllIIIIlll, String lIlllIllIIIIllI) {
        try {
            SecretKeySpec lIlllIllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIllIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIl[3], lIlllIllIIIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlllIllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIllIIIlIII) {
            lIlllIllIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIlIIlI(int i) {
        return i < 0;
    }

    private static boolean lIIlIIlIIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIIIllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIIIllII(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIIlllI(int i, int i2) {
        return i > i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lIlIlIll[lIlIllIl[86]];
    }

    private static int lIIlIIIIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }
}
