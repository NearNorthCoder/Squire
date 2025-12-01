package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.q  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/q.class */
public class C0016q implements G {
    public static /* synthetic */ WorldPoint cj;
    private static /* synthetic */ String[] lIIlIlIIIl;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ WorldPoint cg;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ WorldPoint ch;
    private static /* synthetic */ int[] lIIlIlIIlI;
    private static /* synthetic */ WorldPoint cm;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int ck;
    public static /* synthetic */ WorldPoint ci;

    private static boolean llllllIlIIIl(int i) {
        return i != 0;
    }

    private static String lllllIlllllI(String lllllllllllllllllllllllIlIIIIIII, String lllllllllllllllllllllllIIlllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllllIlIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllllIlIIIIIlI.init(lIIlIlIIlI[3], secretKeySpec);
            return new String(lllllllllllllllllllllllIlIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllllIlIIIIIIl) {
            lllllllllllllllllllllllIlIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIllIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (llllllIlllII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[57])) {
            ?? r0 = lIIlIlIIlI[0];
            "".length();
            return ((((137 + 102) - 90) + 6) ^ (((133 + 102) - 186) + 110)) < "   ".length() ? ((80 ^ 110) ^ (103 ^ 10)) & (((124 ^ 27) ^ (3 ^ 55)) ^ (-" ".length())) : r0;
        }
        return lIIlIlIIlI[1];
    }

    private static boolean llllllIlllII(int i, int i2) {
        return i >= i2;
    }

    private static int llllllIlIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x065c, code lost:
        if (llllllIlIlII(net.unethicalite.api.entities.TileObjects.getNearest(r0)) != false) goto L98;
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
    public static void aC() {
        if (llllllIlIIIl(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (llllllIlIIlI(bv.size(), lIIlIlIIlI[0])) {
                System.out.println(lIIlIlIIIl[lIIlIlIIlI[1]]);
                bt = lIIlIlIIlI[1];
            }
        }
        if (llllllIlIIll(bt ? 1 : 0)) {
            if (llllllIlIIll(ab() ? 1 : 0) && llllllIlIIll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (llllllIlIlII(nearest) && llllllIlIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[0]];
                    C0000a.a(nearest);
                }
                if (llllllIlIlII(nearest) && llllllIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llllllIlIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIlIIlI[2]);
                        "".length();
                    }
                    if (llllllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[3]];
                        if (llllllIlIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIlIIlI[4]);
                            "".length();
                        }
                        if (llllllIlIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIlIIlI[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIlIIlI[5]];
                        iArr[lIIlIlIIlI[1]] = lIIlIlIIlI[6];
                        iArr[lIIlIlIIlI[0]] = lIIlIlIIlI[7];
                        iArr[lIIlIlIIlI[3]] = lIIlIlIIlI[8];
                        iArr[lIIlIlIIlI[9]] = lIIlIlIIlI[10];
                        iArr[lIIlIlIIlI[4]] = lIIlIlIIlI[11];
                        iArr[lIIlIlIIlI[12]] = lIIlIlIIlI[13];
                        if (llllllIlIIll(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIlIlIIIl[lIIlIlIIlI[9]]);
                            bt = lIIlIlIIlI[0];
                            return;
                        }
                        int[] iArr2 = new int[lIIlIlIIlI[5]];
                        iArr2[lIIlIlIIlI[1]] = lIIlIlIIlI[6];
                        iArr2[lIIlIlIIlI[0]] = lIIlIlIIlI[7];
                        iArr2[lIIlIlIIlI[3]] = lIIlIlIIlI[8];
                        iArr2[lIIlIlIIlI[9]] = lIIlIlIIlI[10];
                        iArr2[lIIlIlIIlI[4]] = lIIlIlIIlI[11];
                        iArr2[lIIlIlIIlI[12]] = lIIlIlIIlI[13];
                        if (llllllIlIIIl(C0004e.b(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIIlIlIIlI[3]];
                            iArr3[lIIlIlIIlI[1]] = lIIlIlIIlI[8];
                            iArr3[lIIlIlIIlI[0]] = lIIlIlIIlI[10];
                            C0000a.a(iArr3);
                            C0000a.a(lIIlIlIIlI[6], lIIlIlIIlI[14]);
                            C0000a.a(lIIlIlIIlI[7], lIIlIlIIlI[14]);
                            C0000a.a(lIIlIlIIlI[15], lIIlIlIIlI[14]);
                            C0000a.b(C0005f.aR, lIIlIlIIlI[0]);
                            C0000a.a(lIIlIlIIlI[11], lIIlIlIIlI[4]);
                            C0000a.a(lIIlIlIIlI[13], lIIlIlIIlI[16]);
                        }
                    }
                }
            }
            if (llllllIlIIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && llllllIlIIlI(Movement.getRunEnergy(), lIIlIlIIlI[17])) {
                Inventory.getFirst(C0005f.aV).interact(lIIlIlIIIl[lIIlIlIIlI[4]]);
                Time.sleepTicks(lIIlIlIIlI[0]);
                "".length();
            }
            if (llllllIlIIIl(ab() ? 1 : 0) && llllllIlIIll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                if (llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIlIIlI[4])) {
                    if (llllllIlIIIl(Inventory.contains(C0005f.aR) ? 1 : 0) && llllllIlIIll(Equipment.contains(C0005f.aR) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aR).interact(lIIlIlIIIl[lIIlIlIIlI[12]]);
                    }
                    if (llllllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[5]];
                    Movement.walkTo(cg);
                    "".length();
                    Time.sleepTicks(lIIlIlIIlI[0]);
                    "".length();
                }
                if (llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIlIlIIlI[4])) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[18]];
                    ck = lIIlIlIIlI[1];
                    if (llllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[lIIlIlIIlI[0]];
                        strArr[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[16]];
                        TileObjects.getNearest(strArr).interact(lIIlIlIIIl[lIIlIlIIlI[19]]);
                        Time.sleepTicks(lIIlIlIIlI[3]);
                        "".length();
                    }
                    C0006g.a(bR);
                }
            }
            if (llllllIllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[12])) {
                if (llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(ch), lIIlIlIIlI[4])) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[14]];
                    Movement.walkTo(ch);
                    "".length();
                    Time.sleepTicks(lIIlIlIIlI[0]);
                    "".length();
                    if (llllllIlIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIlIlIIlI[20], lIIlIlIIlI[21], lIIlIlIIlI[1])) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[22]];
                        C0004e.c(new WorldPoint(lIIlIlIIlI[23], lIIlIlIIlI[24], lIIlIlIIlI[1]));
                        Time.sleepTicks(lIIlIlIIlI[5]);
                        "".length();
                    }
                }
                if (llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIlIlIIlI[4])) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[25]];
                    C0006g.a(lIIlIlIIIl[lIIlIlIIlI[26]], bR, lIIlIlIIlI[0]);
                }
            }
            if (llllllIllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[14])) {
                if (llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(ci), lIIlIlIIlI[4])) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[27]];
                    Movement.walkTo(ci);
                    "".length();
                    Time.sleepTicks(lIIlIlIIlI[0]);
                    "".length();
                }
                if (llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ci), lIIlIlIIlI[4])) {
                    int[] iArr4 = new int[lIIlIlIIlI[0]];
                    iArr4[lIIlIlIIlI[1]] = lIIlIlIIlI[8];
                    if (llllllIlIIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIlIlIIlI[0]];
                        iArr5[lIIlIlIIlI[1]] = lIIlIlIIlI[8];
                        Item first = Inventory.getFirst(iArr5);
                        String[] strArr2 = new String[lIIlIlIIlI[0]];
                        strArr2[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[28]];
                        first.useOn(TileObjects.getNearest(strArr2));
                        Time.sleepTicks(lIIlIlIIlI[3]);
                        "".length();
                    }
                }
            }
            if (llllllIllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[28])) {
                int[] iArr6 = new int[lIIlIlIIlI[0]];
                iArr6[lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                if (llllllIlIIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[lIIlIlIIlI[0]];
                    iArr7[lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                    Inventory.getFirst(iArr7).interact(lIIlIlIIIl[lIIlIlIIlI[29]]);
                }
                if (llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ci), lIIlIlIIlI[4])) {
                    String[] strArr3 = new String[lIIlIlIIlI[0]];
                    strArr3[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[30]];
                    TileObjects.getNearest(strArr3).interact(lIIlIlIIIl[lIIlIlIIlI[31]]);
                    Time.sleepTicks(lIIlIlIIlI[9]);
                    "".length();
                }
                if (llllllIlIllI(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(lIIlIlIIlI[32], lIIlIlIIlI[33])), lIIlIlIIlI[34])) {
                    String[] strArr4 = new String[lIIlIlIIlI[0]];
                    strArr4[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[35]];
                }
                String[] strArr5 = new String[lIIlIlIIlI[0]];
                strArr5[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[36]];
                if (llllllIlIlII(TileObjects.getNearest(strArr5))) {
                    if (llllllIlIllI(Players.getLocal().getLocalLocation().getY(), lIIlIlIIlI[37])) {
                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                        String[] strArr6 = new String[lIIlIlIIlI[0]];
                        strArr6[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[38]];
                        if (llllllIlIlll(worldLocation.distanceTo(TileObjects.getNearest(strArr6).getWorldLocation()), lIIlIlIIlI[14])) {
                            String[] strArr7 = new String[lIIlIlIIlI[0]];
                            strArr7[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[39]];
                            if (llllllIllIIl(NPCs.getNearest(strArr7))) {
                                AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[40]];
                                String[] strArr8 = new String[lIIlIlIIlI[0]];
                                strArr8[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[41]];
                                TileObjects.getNearest(strArr8).interact(lIIlIlIIIl[lIIlIlIIlI[42]]);
                                Time.sleepTicks(lIIlIlIIlI[14]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr9 = new String[lIIlIlIIlI[0]];
                    strArr9[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[43]];
                    if (llllllIllIIl(NPCs.getNearest(strArr9)) && llllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[44]];
                        String[] strArr10 = new String[lIIlIlIIlI[0]];
                        strArr10[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[45]];
                        TileObjects.getNearest(strArr10).interact(lIIlIlIIIl[lIIlIlIIlI[46]]);
                        Time.sleepTicks(lIIlIlIIlI[12]);
                        "".length();
                        C0006g.a(bR);
                    }
                    C0006g.a(bR);
                }
            }
            if (llllllIllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[36])) {
                AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[47]];
                C0006g.a(lIIlIlIIIl[lIIlIlIIlI[48]], bR);
            }
            if (llllllIllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[42])) {
                if (llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(ci), lIIlIlIIlI[4])) {
                    String[] strArr11 = new String[lIIlIlIIlI[0]];
                    strArr11[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[49]];
                    if (llllllIllIIl(NPCs.getNearest(strArr11))) {
                        String[] strArr12 = new String[lIIlIlIIlI[0]];
                        strArr12[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[50]];
                        if (llllllIlIIll(Equipment.contains(strArr12) ? 1 : 0)) {
                            String[] strArr13 = new String[lIIlIlIIlI[0]];
                            strArr13[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[51]];
                            if (llllllIlIIIl(Inventory.contains(strArr13) ? 1 : 0)) {
                                String[] strArr14 = new String[lIIlIlIIlI[0]];
                                strArr14[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[52]];
                                Inventory.getFirst(strArr14).interact(lIIlIlIIIl[lIIlIlIIlI[53]]);
                            }
                        }
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[54]];
                        Movement.walkTo(ci);
                        "".length();
                        Time.sleepTicks(lIIlIlIIlI[0]);
                        "".length();
                    }
                }
                if (llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ci), lIIlIlIIlI[4])) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[55]];
                    String[] strArr15 = new String[lIIlIlIIlI[0]];
                    strArr15[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[56]];
                    if (llllllIlIlII(TileObjects.getNearest(strArr15))) {
                        String[] strArr16 = new String[lIIlIlIIlI[0]];
                        strArr16[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[57]];
                        TileObjects.getNearest(strArr16).interact(lIIlIlIIIl[lIIlIlIIlI[58]]);
                        Time.sleepTicks(lIIlIlIIlI[9]);
                        "".length();
                    }
                }
                if (llllllIlIllI(Players.getLocal().getLocalLocation().getY(), lIIlIlIIlI[37])) {
                    WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
                    String[] strArr17 = new String[lIIlIlIIlI[0]];
                    strArr17[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[59]];
                    if (llllllIlIllI(worldLocation2.distanceTo(TileObjects.getNearest(strArr17).getWorldLocation()), lIIlIlIIlI[18])) {
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[60]];
                        String[] strArr18 = new String[lIIlIlIIlI[0]];
                        strArr18[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[61]];
                        TileObjects.getNearest(strArr18).interact(lIIlIlIIIl[lIIlIlIIlI[62]]);
                        Time.sleepTicks(lIIlIlIIlI[14]);
                        "".length();
                    }
                }
                if (llllllIllIIl(Players.getLocal().getInteracting()) && llllllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr19 = new String[lIIlIlIIlI[0]];
                    strArr19[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[63]];
                    if (llllllIlIIll(Equipment.contains(strArr19) ? 1 : 0)) {
                        String[] strArr20 = new String[lIIlIlIIlI[0]];
                        strArr20[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[64]];
                        if (llllllIlIIIl(Inventory.contains(strArr20) ? 1 : 0)) {
                            String[] strArr21 = new String[lIIlIlIIlI[0]];
                            strArr21[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[65]];
                            Inventory.getFirst(strArr21).interact(lIIlIlIIIl[lIIlIlIIlI[66]]);
                        }
                    }
                    int[] iArr8 = new int[lIIlIlIIlI[0]];
                    iArr8[lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                    if (llllllIlIIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIIlIlIIlI[0]];
                        iArr9[lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                        if (llllllIlIIll(Equipment.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lIIlIlIIlI[0]];
                            iArr10[lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                            Inventory.getFirst(iArr10).interact(lIIlIlIIIl[lIIlIlIIlI[34]]);
                        }
                    }
                    String[] strArr22 = new String[lIIlIlIIlI[0]];
                    strArr22[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[67]];
                    NPCs.getNearest(strArr22).interact(lIIlIlIIIl[lIIlIlIIlI[68]]);
                    Time.sleepTicks(lIIlIlIIlI[0]);
                    "".length();
                }
                if (llllllIllIlI(llllllIlIIII(C0004e.u(), 60.0d))) {
                    int[] iArr11 = new int[lIIlIlIIlI[0]];
                    iArr11[lIIlIlIIlI[1]] = lIIlIlIIlI[13];
                    if (llllllIlIIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[lIIlIlIIlI[0]];
                        iArr12[lIIlIlIIlI[1]] = lIIlIlIIlI[13];
                        Inventory.getFirst(iArr12).interact(lIIlIlIIIl[lIIlIlIIlI[69]]);
                        Time.sleepTicks(lIIlIlIIlI[0]);
                        "".length();
                    }
                }
                C0006g.a(bR);
            }
            if (llllllIllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[47])) {
                String[] strArr23 = new String[lIIlIlIIlI[0]];
                strArr23[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[70]];
                if (llllllIlIIll(Inventory.contains(strArr23) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[71]];
                    String[] strArr24 = new String[lIIlIlIIlI[0]];
                    strArr24[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[72]];
                    TileObjects.getNearest(strArr24).interact(lIIlIlIIIl[lIIlIlIIlI[73]]);
                    Time.sleepTicks(lIIlIlIIlI[4]);
                    "".length();
                }
                String[] strArr25 = new String[lIIlIlIIlI[0]];
                strArr25[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[74]];
                if (llllllIlIIIl(Inventory.contains(strArr25) ? 1 : 0)) {
                    if (llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(ch), lIIlIlIIlI[4])) {
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[75]];
                        Movement.walkTo(ch);
                        "".length();
                        Time.sleepTicks(lIIlIlIIlI[0]);
                        "".length();
                        if (llllllIlIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIlIlIIlI[20], lIIlIlIIlI[21], lIIlIlIIlI[1])) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[76]];
                            C0004e.c(new WorldPoint(lIIlIlIIlI[23], lIIlIlIIlI[24], lIIlIlIIlI[1]));
                            Time.sleepTicks(lIIlIlIIlI[5]);
                            "".length();
                        }
                    }
                    if (llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIlIlIIlI[4])) {
                        AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[77]];
                        C0006g.a(lIIlIlIIIl[lIIlIlIIlI[78]], bR, lIIlIlIIlI[0]);
                    }
                }
            }
            if (llllllIllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIIlIlIIlI[52])) {
                if (llllllIlIllI(Players.getLocal().getWorldLocation().distanceTo(cj), lIIlIlIIlI[9])) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[79]];
                    Movement.walkTo(cj);
                    "".length();
                    Time.sleepTicks(lIIlIlIIlI[0]);
                    "".length();
                }
                if (llllllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cj), lIIlIlIIlI[9])) {
                    AccBuilderRogues.c = lIIlIlIIIl[lIIlIlIIlI[80]];
                    if (llllllIlIIlI(ck, lIIlIlIIlI[0])) {
                        U.mq += lIIlIlIIlI[0];
                        U.o(AccBuilderRogues.m);
                        ck += lIIlIlIIlI[0];
                        U.mq = lIIlIlIIlI[1];
                        cl = lIIlIlIIlI[1];
                    }
                    C0006g.a(lIIlIlIIIl[lIIlIlIIlI[17]], bR);
                }
            }
        }
    }

    private static String lllllIllllII(String lllllllllllllllllllllllIlIIIllIl, String lllllllllllllllllllllllIlIIIllII) {
        try {
            SecretKeySpec lllllllllllllllllllllllIlIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllIlIIIllII.getBytes(StandardCharsets.UTF_8)), lIIlIlIIlI[16]), "DES");
            Cipher lllllllllllllllllllllllIlIIIllll = Cipher.getInstance("DES");
            lllllllllllllllllllllllIlIIIllll.init(lIIlIlIIlI[3], lllllllllllllllllllllllIlIIlIIII);
            return new String(lllllllllllllllllllllllIlIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllllIlIIIlllI) {
            lllllllllllllllllllllllIlIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlIllI(int i, int i2) {
        return i > i2;
    }

    private static boolean llllllIlIlIl(int i) {
        return i > 0;
    }

    private static boolean llllllIllIll(int i) {
        return i <= 0;
    }

    private static boolean llllllIlIlll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llllllIlIIll(int i) {
        return i == 0;
    }

    private static void lllllIllllll() {
        lIIlIlIIIl = new String[lIIlIlIIlI[100]];
        lIIlIlIIIl[lIIlIlIIlI[1]] = lllllIllllII("WEkR+Fij1Pl9AoYDKwabXtMW+yaruS7hS2+yI//ebUWnAqgigkO5u4aJqbx3AXEB", "YpGOO");
        lIIlIlIIIl[lIIlIlIIlI[0]] = lllllIllllII("luaU3b/7Dhfg6FP9rPN9bQ==", "riYuo");
        lIIlIlIIIl[lIIlIlIIlI[3]] = lllllIllllIl("MSAUKSYQLx1tKBgvESQkHg==", "yAzMJ");
        lIIlIlIIIl[lIIlIlIIlI[9]] = lllllIlllllI("MtgFyE88xJJofRvbvpfM+U85Z+JrNWNukbpcgbKmZaUpBAZz2HDFZrULlewu+TzcG+FNZK3SAm0=", "NWBYJ");
        lIIlIlIIIl[lIIlIlIIlI[4]] = lllllIllllIl("LAgiDxs=", "hzKap");
        lIIlIlIIIl[lIIlIlIIlI[12]] = lllllIllllIl("OwcrFg==", "lbJdS");
        lIIlIlIIIl[lIIlIlIIlI[5]] = lllllIlllllI("Wu51JPVRcb30dYwANPZy6Q==", "HBeja");
        lIIlIlIIIl[lIIlIlIIlI[18]] = lllllIllllIl("ByESNwU9OxRlACEwADE=", "TUsEq");
        lIIlIlIIIl[lIIlIlIIlI[16]] = lllllIllllIl("ISYdHDcKaQsaNR0t", "oIiuT");
        lIIlIlIIIl[lIIlIlIIlI[19]] = lllllIlllllI("y64FUQ4H1tM=", "DmONV");
        lIIlIlIIIl[lIIlIlIIlI[14]] = lllllIlllllI("untFTgXP5gfzbvWcj/rgnA==", "WSwPh");
        lIIlIlIIIl[lIIlIlIIlI[22]] = lllllIllllII("H0aC5ontVO2KQF2fRiishKn1Qdq2CRQ3", "AHGjr");
        lIIlIlIIIl[lIIlIlIIlI[25]] = lllllIllllII("Hpp7Dbw6KAGIMPVLbdn/1A==", "BxvLY");
        lIIlIlIIIl[lIIlIlIIlI[26]] = lllllIllllIl("GCAgDDo=", "KARmR");
        lIIlIlIIIl[lIIlIlIIlI[27]] = lllllIlllllI("B/RFadQcAHKt+qPFxXVFfA==", "vqHYV");
        lIIlIlIIIl[lIIlIlIIlI[28]] = lllllIlllllI("iLbA+CcAMgKpp9MgLpDv5g==", "Gfjdu");
        lIIlIlIIIl[lIIlIlIIlI[29]] = lllllIllllIl("HxMEKzU=", "HzaGQ");
        lIIlIlIIIl[lIIlIlIIlI[30]] = lllllIllllIl("BxUYBQ8zBEoMDjgE", "Tajda");
        lIIlIlIIIl[lIIlIlIIlI[31]] = lllllIllllIl("DA0bNDViBR0uOQ==", "OarYW");
        lIIlIlIIIl[lIIlIlIIlI[35]] = lllllIllllII("ey9IdliiX8Xfzo/sqqAdQw==", "OyxRE");
        lIIlIlIIIl[lIIlIlIIlI[36]] = lllllIlllllI("yKQlL/t1jfVtfiQaiLDB/A==", "CUMML");
        lIIlIlIIIl[lIIlIlIIlI[38]] = lllllIlllllI("9S7l0BOSATVNVsg8GijNXg==", "OElDh");
        lIIlIlIIIl[lIIlIlIIlI[39]] = lllllIllllII("ExAI/yX8gnu7zBqftD9oyg==", "SZDIG");
        lIIlIlIIIl[lIIlIlIIlI[40]] = lllllIllllII("3zR8RHVAIM8KBj37fbGqXhKm2Ug3tlkz", "qtxvd");
        lIIlIlIIIl[lIIlIlIIlI[41]] = lllllIllllIl("DAkKKCAvAgA=", "NeeKK");
        lIIlIlIIIl[lIIlIlIIlI[42]] = lllllIllllIl("JgEcJxFIAgMvAQ==", "emuJs");
        lIIlIlIIIl[lIIlIlIIlI[43]] = lllllIlllllI("lDNCyZf/6mHW+/NMiE3wHw==", "RxtXm");
        lIIlIlIIIl[lIIlIlIIlI[44]] = lllllIlllllI("plHbYca2XuA1WTo1oyQVRA==", "vNsPi");
        lIIlIlIIIl[lIIlIlIIlI[45]] = lllllIlllllI("1L8USlxU5dCpd0CDVn9Wxg==", "LBRvx");
        lIIlIlIIIl[lIIlIlIIlI[46]] = lllllIllllII("UfCkwyXmAMrTqjqKTwWusg==", "PCOsC");
        lIIlIlIIIl[lIIlIlIIlI[47]] = lllllIllllIl("BRgMJzMtFQwrLytWKzIoPhc=", "LvxBA");
        lIIlIlIIIl[lIIlIlIIlI[48]] = lllllIllllII("xjLv059UKws=", "lQhKj");
        lIIlIlIIIl[lIIlIlIIlI[49]] = lllllIllllIl("Hi4GMyQiJg==", "MAsAL");
        lIIlIlIIIl[lIIlIlIIlI[50]] = lllllIllllII("B/UcT19/HLugFUSzZMIfbxN33z1/sbXQ", "rplgh");
        lIIlIlIIIl[lIIlIlIIlI[51]] = lllllIlllllI("S9XWslGLzm4g9hTcG2dutprraiQMMLZc", "tJfXq");
        lIIlIlIIIl[lIIlIlIIlI[52]] = lllllIllllIl("NTYGHTMIIQwWMUc0ABQyCzYc", "gSosU");
        lIIlIlIIIl[lIIlIlIIlI[53]] = lllllIlllllI("rHnk7Lv4Wmw=", "CqKyF");
        lIIlIlIIIl[lIIlIlIIlI[54]] = lllllIllllII("thukynUWvDq9gI70qDU/fA==", "AUunb");
        lIIlIlIIIl[lIIlIlIIlI[55]] = lllllIllllIl("FAQPPCB3DAkmLHcACT0n", "WhfQB");
        lIIlIlIIIl[lIIlIlIIlI[56]] = lllllIlllllI("ZUjyvqlx5rVR6pyLPZXKHQ==", "UQXxJ");
        lIIlIlIIIl[lIIlIlIIlI[57]] = lllllIlllllI("5tbrCxFyixSGSoLdzF6Z4w==", "dmfHT");
        lIIlIlIIIl[lIIlIlIIlI[58]] = lllllIllllII("JE4us0wYHjZcp4Ia++lOcQ==", "yqsBT");
        lIIlIlIIIl[lIIlIlIIlI[59]] = lllllIllllII("0SrPtnvdLLZ/sILbp80F/w==", "tnKkc");
        lIIlIlIIIl[lIIlIlIIlI[60]] = lllllIlllllI("0USNZoRbI+hibAkw8tC+9T5e9qqLoa3F", "IApVr");
        lIIlIlIIIl[lIIlIlIIlI[61]] = lllllIllllII("OHkm5eVuR6dnBAFkInib3A==", "UlOcn");
        lIIlIlIIIl[lIIlIlIIlI[62]] = lllllIllllIl("Fgs6JCx4CCUsPA==", "UgSIN");
        lIIlIlIIIl[lIIlIlIIlI[63]] = lllllIllllIl("ER85AigsCDMJKmMdPwspLx8j", "CzPlN");
        lIIlIlIIIl[lIIlIlIIlI[64]] = lllllIllllIl("NRQxJxAIAzssEkcWNy4RCxQr", "gqXIv");
        lIIlIlIIIl[lIIlIlIIlI[65]] = lllllIllllII("yiF6qNhyCtNdgha7i4BAYwvg516Q+I9P", "HVQZf");
        lIIlIlIIIl[lIIlIlIIlI[66]] = lllllIllllII("8V4KZFYqm7g=", "VSeCW");
        lIIlIlIIIl[lIIlIlIIlI[34]] = lllllIllllII("eV9uw4ztBhU=", "EUbuW");
        lIIlIlIIIl[lIIlIlIIlI[67]] = lllllIllllIl("HhUkIhwiHQ==", "MzQPt");
        lIIlIlIIIl[lIIlIlIIlI[68]] = lllllIllllII("Hmz9r2SOr7k=", "fPZff");
        lIIlIlIIIl[lIIlIlIIlI[69]] = lllllIllllII("f4fucRtbeKo=", "FejmW");
        lIIlIlIIIl[lIIlIlIIlI[70]] = lllllIllllII("fT545T/e273jShBB7bvTaw==", "bBfhD");
        lIIlIlIIIl[lIIlIlIIlI[71]] = lllllIllllII("ljj9D+JTKIexLA+23J622Q==", "etJWV");
        lIIlIlIIIl[lIIlIlIIlI[72]] = lllllIllllII("AgAQbYOctuaH/BIlFgUZKg==", "YWIaJ");
        lIIlIlIIIl[lIIlIlIIlI[73]] = lllllIllllIl("JBwiZBYIBiI=", "giVIp");
        lIIlIlIIIl[lIIlIlIIlI[74]] = lllllIlllllI("Z9/brWU8Q88QSq0PCJDYMw==", "QacOQ");
        lIIlIlIIIl[lIIlIlIIlI[75]] = lllllIllllII("9UCgrU+/NNTc9nJowJlKbQ==", "VkeXp");
        lIIlIlIIIl[lIIlIlIIlI[76]] = lllllIllllII("XjYPIDi0Kc6uFPnvlE0+Y76Ve0g20unh", "CvJyV");
        lIIlIlIIIl[lIIlIlIIlI[77]] = lllllIlllllI("BKL9G/H+DmQt34SnBbtROw==", "vfTwM");
        lIIlIlIIIl[lIIlIlIIlI[78]] = lllllIlllllI("3D4un8FrWZQ=", "yLpKb");
        lIIlIlIIIl[lIIlIlIIlI[79]] = lllllIllllII("ecoJ2WxJnLNko+a+M4D3jQ==", "tcdnH");
        lIIlIlIIIl[lIIlIlIIlI[80]] = lllllIlllllI("R6E10Iuji0o1sLn4BJQfwg==", "lWcEt");
        lIIlIlIIIl[lIIlIlIIlI[17]] = lllllIllllIl("MioKCCM=", "aZxaB");
        lIIlIlIIIl[lIIlIlIIlI[86]] = lllllIlllllI("05lc0gFv09FgnTDfO6K6cxwb7K6n4Dh3", "DFFGt");
        lIIlIlIIIl[lIIlIlIIlI[87]] = lllllIllllIl("FwgFLmEKB0s+JAQNHyFhTQ==", "eakIA");
        lIIlIlIIIl[lIIlIlIIlI[96]] = lllllIllllII("rdi19T16qfU=", "HasWx");
        lIIlIlIIIl[lIIlIlIIlI[97]] = lllllIllllII("tOtXPHWA/a3Us/7frJR9bUA3vQTMGbNn", "xfQwS");
        lIIlIlIIIl[lIIlIlIIlI[98]] = lllllIllllIl("HGckHgQ7LHACBTQzdxoBdSU1Vgw5K3AQAidnPhkaew==", "UGPvm");
        lIIlIlIIIl[lIIlIlIIlI[99]] = lllllIllllIl("GCQg", "AASzT");
    }

    private static boolean llllllIlIlII(Object obj) {
        return obj != null;
    }

    private static boolean llllllIlIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIlIIlI[1];
    }

    static {
        llllllIIllll();
        lllllIllllll();
        bv = new ArrayList();
        cg = new WorldPoint(lIIlIlIIlI[88], lIIlIlIIlI[89], lIIlIlIIlI[1]);
        ch = new WorldPoint(lIIlIlIIlI[90], lIIlIlIIlI[91], lIIlIlIIlI[1]);
        ci = new WorldPoint(lIIlIlIIlI[92], lIIlIlIIlI[93], lIIlIlIIlI[1]);
        cj = new WorldPoint(lIIlIlIIlI[94], lIIlIlIIlI[95], lIIlIlIIlI[1]);
        cm = null;
        String[] strArr = new String[lIIlIlIIlI[4]];
        strArr[lIIlIlIIlI[1]] = lIIlIlIIIl[lIIlIlIIlI[96]];
        strArr[lIIlIlIIlI[0]] = lIIlIlIIIl[lIIlIlIIlI[97]];
        strArr[lIIlIlIIlI[3]] = lIIlIlIIIl[lIIlIlIIlI[98]];
        strArr[lIIlIlIIlI[9]] = lIIlIlIIIl[lIIlIlIIlI[99]];
        bR = strArr;
    }

    private static boolean llllllIllIIl(Object obj) {
        return obj == null;
    }

    private static String lllllIllllIl(String lllllllllllllllllllllllIlIlIIIlI, String lllllllllllllllllllllllIlIlIIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllllllIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllllllIlIlIIIIl.toCharArray();
        int lllllllllllllllllllllllIlIIllllI = lIIlIlIIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIIlI[1];
        while (llllllIlIIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllllllllIlIIllllI % charArray.length]));
            "".length();
            lllllllllllllllllllllllIlIIllllI++;
            i++;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llllllIIllll() {
        lIIlIlIIlI = new int[101];
        lIIlIlIIlI[0] = " ".length();
        lIIlIlIIlI[1] = (168 ^ 176) & ((168 ^ 176) ^ (-1));
        lIIlIlIIlI[2] = (-19559) & 24558;
        lIIlIlIIlI[3] = "  ".length();
        lIIlIlIIlI[4] = (111 ^ 51) ^ (255 ^ 167);
        lIIlIlIIlI[5] = (5 ^ 87) ^ (31 ^ 75);
        lIIlIlIIlI[6] = (-((-2833) & 27569)) & (-1) & 32743;
        lIIlIlIIlI[7] = (-164) & 8171;
        lIIlIlIIlI[8] = (-17409) & 18362;
        lIIlIlIIlI[9] = "   ".length();
        lIIlIlIIlI[10] = (-12425) & 13755;
        lIIlIlIIlI[11] = (-16931) & 29555;
        lIIlIlIIlI[12] = (115 ^ 4) ^ (81 ^ 35);
        lIIlIlIIlI[13] = (-1153) & 1531;
        lIIlIlIIlI[14] = 54 ^ 60;
        lIIlIlIIlI[15] = (-8357) & 16365;
        lIIlIlIIlI[16] = (127 ^ 105) ^ (24 ^ 6);
        lIIlIlIIlI[17] = 223 ^ 158;
        lIIlIlIIlI[18] = 96 ^ 103;
        lIIlIlIIlI[19] = 0 ^ 9;
        lIIlIlIIlI[20] = (-((-17281) & 30602)) & (-16385) & 32747;
        lIIlIlIIlI[21] = (-4627) & 7931;
        lIIlIlIIlI[22] = (144 ^ 174) ^ (181 ^ 128);
        lIIlIlIIlI[23] = (-29697) & 32735;
        lIIlIlIIlI[24] = (-16385) & 19681;
        lIIlIlIIlI[25] = (168 ^ 130) ^ (125 ^ 91);
        lIIlIlIIlI[26] = 33 ^ 44;
        lIIlIlIIlI[27] = (213 ^ 182) ^ (247 ^ 154);
        lIIlIlIIlI[28] = 95 ^ 80;
        lIIlIlIIlI[29] = (((48 + 206) - 84) + 41) ^ (((68 + 110) - 167) + 184);
        lIIlIlIIlI[30] = (((12 + 140) - 39) + 68) ^ (((80 + 43) - (-36)) + 5);
        lIIlIlIIlI[31] = 21 ^ 7;
        lIIlIlIIlI[32] = (-190) & 7165;
        lIIlIlIIlI[33] = (-25348) & 31683;
        lIIlIlIIlI[34] = (103 ^ 30) ^ (232 ^ 163);
        lIIlIlIIlI[35] = 122 ^ 105;
        lIIlIlIIlI[36] = (128 ^ 156) ^ (140 ^ 132);
        lIIlIlIIlI[37] = (-24610) & 29665;
        lIIlIlIIlI[38] = 31 ^ 10;
        lIIlIlIIlI[39] = 86 ^ 64;
        lIIlIlIIlI[40] = 71 ^ 80;
        lIIlIlIIlI[41] = (196 ^ 163) ^ (((83 + 109) - 145) + 80);
        lIIlIlIIlI[42] = 95 ^ 70;
        lIIlIlIIlI[43] = (((51 + 103) - 98) + 88) ^ (((93 + 100) - 99) + 44);
        lIIlIlIIlI[44] = (116 ^ 25) ^ (107 ^ 29);
        lIIlIlIIlI[45] = 177 ^ 173;
        lIIlIlIIlI[46] = 50 ^ 47;
        lIIlIlIIlI[47] = 41 ^ 55;
        lIIlIlIIlI[48] = 138 ^ 149;
        lIIlIlIIlI[49] = (((24 + 134) - 112) + 180) ^ (((158 + 61) - 42) + 17);
        lIIlIlIIlI[50] = 32 ^ 1;
        lIIlIlIIlI[51] = (((82 + 178) - 225) + 150) ^ (((82 + 48) - 114) + 139);
        lIIlIlIIlI[52] = (((29 + 65) - 21) + 151) ^ (((107 + 148) - 94) + 34);
        lIIlIlIIlI[53] = 64 ^ 100;
        lIIlIlIIlI[54] = (89 ^ 81) ^ (165 ^ 136);
        lIIlIlIIlI[55] = 165 ^ 131;
        lIIlIlIIlI[56] = 36 ^ 3;
        lIIlIlIIlI[57] = (((140 + 6) - 44) + 60) ^ (((30 + 25) - (-76)) + 7);
        lIIlIlIIlI[58] = 44 ^ 5;
        lIIlIlIIlI[59] = (53 ^ 3) ^ (156 ^ 128);
        lIIlIlIIlI[60] = (176 ^ 160) ^ (35 ^ 24);
        lIIlIlIIlI[61] = (((138 + 184) - 274) + 184) ^ (((11 + 142) - 130) + 173);
        lIIlIlIIlI[62] = (167 ^ 147) ^ (150 ^ 143);
        lIIlIlIIlI[63] = 97 ^ 79;
        lIIlIlIIlI[64] = (154 ^ 164) ^ (60 ^ 45);
        lIIlIlIIlI[65] = (40 ^ 31) ^ (24 ^ 31);
        lIIlIlIIlI[66] = (163 ^ 150) ^ (70 ^ 66);
        lIIlIlIIlI[67] = (((48 + 94) - 106) + 106) ^ (((39 + 18) - (-66)) + 66);
        lIIlIlIIlI[68] = 98 ^ 86;
        lIIlIlIIlI[69] = (50 ^ 122) ^ (100 ^ 25);
        lIIlIlIIlI[70] = (152 ^ 181) ^ (33 ^ 58);
        lIIlIlIIlI[71] = 69 ^ 114;
        lIIlIlIIlI[72] = (21 ^ 62) ^ (173 ^ 190);
        lIIlIlIIlI[73] = 82 ^ 107;
        lIIlIlIIlI[74] = 79 ^ 117;
        lIIlIlIIlI[75] = (235 ^ 130) ^ (222 ^ 140);
        lIIlIlIIlI[76] = 152 ^ 164;
        lIIlIlIIlI[77] = 178 ^ 143;
        lIIlIlIIlI[78] = (103 ^ 126) ^ (4 ^ 35);
        lIIlIlIIlI[79] = (((6 + 18) - (-43)) + 89) ^ (((64 + 40) - 56) + 115);
        lIIlIlIIlI[80] = (((30 + 23) - (-150)) + 14) ^ (((63 + 96) - 122) + 116);
        lIIlIlIIlI[81] = (-20548) & 29547;
        lIIlIlIIlI[82] = (-((-4869) & 32638)) & (-3) & 28671;
        lIIlIlIIlI[83] = (-308) & 12287;
        lIIlIlIIlI[84] = (-((-22945) & 23478)) & (-65) & 25597;
        lIIlIlIIlI[85] = 237 ^ 137;
        lIIlIlIIlI[86] = 200 ^ 138;
        lIIlIlIIlI[87] = 57 ^ 122;
        lIIlIlIIlI[88] = (-21123) & 24207;
        lIIlIlIIlI[89] = (-24641) & 27891;
        lIIlIlIIlI[90] = (-5124) & 8159;
        lIIlIlIIlI[91] = (-4610) & 7903;
        lIIlIlIIlI[92] = (-(((160 + 121) - 242) + 124)) & (-29442) & 32751;
        lIIlIlIIlI[93] = (-8237) & 11583;
        lIIlIlIIlI[94] = (-((-1345) & 30701)) & (-65) & 32511;
        lIIlIlIIlI[95] = (-20509) & 23773;
        lIIlIlIIlI[96] = 120 ^ 60;
        lIIlIlIIlI[97] = (((157 + 62) - 207) + 184) ^ (((112 + 3) - 95) + 109);
        lIIlIlIIlI[98] = 123 ^ 61;
        lIIlIlIIlI[99] = 254 ^ 185;
        lIIlIlIIlI[100] = 197 ^ 141;
    }

    private static boolean llllllIllIlI(int i) {
        return i < 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (llllllIlIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        int[] iArr = new int[lIIlIlIIlI[0]];
        iArr[lIIlIlIIlI[1]] = lIIlIlIIlI[6];
        if (llllllIlIlIl(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIlIlIIlI[0]];
            iArr2[lIIlIlIIlI[1]] = lIIlIlIIlI[8];
            if (llllllIlIlIl(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIlIlIIlI[0]];
                iArr3[lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                if (llllllIllIll(Inventory.getCount(iArr3))) {
                    int[] iArr4 = new int[lIIlIlIIlI[0]];
                    iArr4[lIIlIlIIlI[1]] = lIIlIlIIlI[10];
                }
                int[] iArr5 = new int[lIIlIlIIlI[0]];
                iArr5[lIIlIlIIlI[1]] = lIIlIlIIlI[13];
                if (llllllIlIlIl(Inventory.getCount(iArr5))) {
                    ?? r0 = lIIlIlIIlI[0];
                    "".length();
                    return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIIlIlIIlI[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a9, code lost:
        if (llllllIlIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0016q.lIIlIlIIlI[12]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2 = new int[lIIlIlIIlI[0]];
        iArr2[lIIlIlIIlI[1]] = lIIlIlIIlI[8];
        if (llllllIlIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIlI[8], lIIlIlIIlI[0], lIIlIlIIlI[81]));
            "".length();
        }
        int[] iArr3 = new int[lIIlIlIIlI[0]];
        iArr3[lIIlIlIIlI[1]] = lIIlIlIIlI[10];
        if (llllllIlIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIlI[10], lIIlIlIIlI[0], lIIlIlIIlI[81]));
            "".length();
        }
        int[] iArr4 = new int[lIIlIlIIlI[0]];
        iArr4[lIIlIlIIlI[1]] = lIIlIlIIlI[13];
        if (llllllIlIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIlI[13], lIIlIlIIlI[50], lIIlIlIIlI[82]));
            "".length();
        }
        int[] iArr5 = new int[lIIlIlIIlI[0]];
        iArr5[lIIlIlIIlI[1]] = lIIlIlIIlI[11];
        if (llllllIlIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIlI[11], lIIlIlIIlI[12], C0008i.bq));
            "".length();
        }
        if (llllllIlIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlIlIIIl[lIIlIlIIlI[87]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIlI[83], lIIlIlIIlI[12], lIIlIlIIlI[84]));
            "".length();
        }
        int[] iArr6 = new int[lIIlIlIIlI[0]];
        iArr6[lIIlIlIIlI[1]] = lIIlIlIIlI[7];
        if (llllllIlIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIIlIlIIlI[0]];
            iArr7[lIIlIlIIlI[1]] = lIIlIlIIlI[7];
            if (llllllIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIlIlIIlI[0]];
                iArr8[lIIlIlIIlI[1]] = lIIlIlIIlI[7];
            }
            iArr = new int[lIIlIlIIlI[0]];
            iArr[lIIlIlIIlI[1]] = lIIlIlIIlI[6];
            if (llllllIlIIll(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bv.add(new C0003d(lIIlIlIIlI[6], lIIlIlIIlI[57], lIIlIlIIlI[82]));
            "".length();
            return;
        }
        bv.add(new C0003d(lIIlIlIIlI[7], lIIlIlIIlI[28], lIIlIlIIlI[82]));
        "".length();
        iArr = new int[lIIlIlIIlI[0]];
        iArr[lIIlIlIIlI[1]] = lIIlIlIIlI[6];
        if (llllllIlIIll(Bank.contains(iArr) ? 1 : 0)) {
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlIlIIIl[lIIlIlIIlI[86]];
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            aC();
            "".length();
            if ((((210 ^ 141) ^ " ".length()) & (((112 ^ 87) ^ (53 ^ 76)) ^ (-" ".length()))) <= (-" ".length())) {
                return ((((49 + 120) - 69) + 53) ^ (((2 + 145) - 81) + 90)) & (((127 ^ 62) ^ (216 ^ 156)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIlIIlI[85];
    }
}
