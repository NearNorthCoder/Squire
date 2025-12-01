package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.t  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/t.class */
public class C0019t implements K {
    public static /* synthetic */ WorldPoint cV;
    public static /* synthetic */ List<C0003d> bp;
    public static /* synthetic */ WorldPoint cZ;
    private static /* synthetic */ int[] lIlIlIlIIl;
    private static /* synthetic */ String[] cy;
    static /* synthetic */ boolean dd;
    public static /* synthetic */ WorldPoint db;
    private static /* synthetic */ String[] lIlIlIIllI;
    static /* synthetic */ int dc;
    public static /* synthetic */ WorldPoint da;
    private static /* synthetic */ WorldPoint de;
    public static /* synthetic */ boolean bn;

    private static boolean lIIlIIIIlllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIIlIIIIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (lIIlIIIIllIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean al() {
        int[] iArr = new int[lIlIlIlIIl[0]];
        iArr[lIlIlIlIIl[1]] = lIlIlIlIIl[6];
        if (lIIlIIIIlllll(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIlIlIlIIl[0]];
            iArr2[lIlIlIlIIl[1]] = lIlIlIlIIl[8];
            if (lIIlIIIIlllll(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIlIlIlIIl[0]];
                iArr3[lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                if (lIIlIIIlIIlIl(Inventory.getCount(iArr3))) {
                    int[] iArr4 = new int[lIlIlIlIIl[0]];
                    iArr4[lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                }
                int[] iArr5 = new int[lIlIlIlIIl[0]];
                iArr5[lIlIlIlIIl[1]] = lIlIlIlIIl[13];
                if (lIIlIIIIlllll(Inventory.getCount(iArr5))) {
                    ?? r0 = lIlIlIlIIl[0];
                    "".length();
                    return " ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIlIlIlIIl[1];
    }

    private static String lIIlIIIIIIlII(String lllllllllllllllllllIlllIIIlIlIlI, String lllllllllllllllllllIlllIIIlIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlllIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIlIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlllIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlllIIIlIlIll) {
            lllllllllllllllllllIlllIIIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIllllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x065c, code lost:
        if (lIIlIIIIllllI(net.unethicalite.api.entities.TileObjects.getNearest(r0)) != false) goto L98;
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
    public static void ba() {
        if (lIIlIIIIllIll(bn ? 1 : 0)) {
            C0001b.a(bp);
            if (lIIlIIIIlllII(bp.size(), lIlIlIlIIl[0])) {
                System.out.println(lIlIlIIllI[lIlIlIlIIl[1]]);
                bn = lIlIlIlIIl[1];
            }
        }
        if (lIIlIIIIlllIl(bn ? 1 : 0)) {
            if (lIIlIIIIlllIl(al() ? 1 : 0) && lIIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIIIllllI(nearest) && lIIlIIIIlllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[0]];
                    C0000a.a(nearest);
                }
                if (lIIlIIIIllllI(nearest) && lIIlIIIIllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlIIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIlIlIIl[2]);
                        "".length();
                    }
                    if (lIIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[3]];
                        if (lIIlIIIIlllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIlIlIIl[4]);
                            "".length();
                        }
                        if (lIIlIIIIlllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIlIlIIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIlIlIlIIl[5]];
                        iArr[lIlIlIlIIl[1]] = lIlIlIlIIl[6];
                        iArr[lIlIlIlIIl[0]] = lIlIlIlIIl[7];
                        iArr[lIlIlIlIIl[3]] = lIlIlIlIIl[8];
                        iArr[lIlIlIlIIl[9]] = lIlIlIlIIl[10];
                        iArr[lIlIlIlIIl[4]] = lIlIlIlIIl[11];
                        iArr[lIlIlIlIIl[12]] = lIlIlIlIIl[13];
                        if (lIIlIIIIlllIl(C0004e.b(iArr) ? 1 : 0)) {
                            O();
                            System.out.println(lIlIlIIllI[lIlIlIlIIl[9]]);
                            bn = lIlIlIlIIl[0];
                            return;
                        }
                        int[] iArr2 = new int[lIlIlIlIIl[5]];
                        iArr2[lIlIlIlIIl[1]] = lIlIlIlIIl[6];
                        iArr2[lIlIlIlIIl[0]] = lIlIlIlIIl[7];
                        iArr2[lIlIlIlIIl[3]] = lIlIlIlIIl[8];
                        iArr2[lIlIlIlIIl[9]] = lIlIlIlIIl[10];
                        iArr2[lIlIlIlIIl[4]] = lIlIlIlIIl[11];
                        iArr2[lIlIlIlIIl[12]] = lIlIlIlIIl[13];
                        if (lIIlIIIIllIll(C0004e.b(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIlIlIlIIl[3]];
                            iArr3[lIlIlIlIIl[1]] = lIlIlIlIIl[8];
                            iArr3[lIlIlIlIIl[0]] = lIlIlIlIIl[10];
                            C0000a.a(iArr3);
                            C0000a.a(lIlIlIlIIl[6], lIlIlIlIIl[14]);
                            C0000a.a(lIlIlIlIIl[7], lIlIlIlIIl[14]);
                            C0000a.a(lIlIlIlIIl[15], lIlIlIlIIl[14]);
                            C0000a.b(C0005f.aQ, lIlIlIlIIl[0]);
                            C0000a.a(lIlIlIlIIl[11], lIlIlIlIIl[4]);
                            C0000a.a(lIlIlIlIIl[13], lIlIlIlIIl[16]);
                        }
                    }
                }
            }
            if (lIIlIIIIllIll(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIlIIIIlllII(Movement.getRunEnergy(), lIlIlIlIIl[17])) {
                Inventory.getFirst(C0005f.aU).interact(lIlIlIIllI[lIlIlIlIIl[4]]);
                Time.sleepTicks(lIlIlIlIIl[0]);
                "".length();
            }
            if (lIIlIIIIllIll(al() ? 1 : 0) && lIIlIIIIlllIl(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                if (lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlIlIIl[4])) {
                    if (lIIlIIIIllIll(Inventory.contains(C0005f.aQ) ? 1 : 0) && lIIlIIIIlllIl(Equipment.contains(C0005f.aQ) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aQ).interact(lIlIlIIllI[lIlIlIlIIl[12]]);
                    }
                    if (lIIlIIIIllIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[5]];
                    Movement.walkTo(cV);
                    "".length();
                    Time.sleepTicks(lIlIlIlIIl[0]);
                    "".length();
                }
                if (lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIlIlIIl[4])) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[18]];
                    dc = lIlIlIlIIl[1];
                    if (lIIlIIIIlllIl(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[lIlIlIlIIl[0]];
                        strArr[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[16]];
                        TileObjects.getNearest(strArr).interact(lIlIlIIllI[lIlIlIlIIl[19]]);
                        Time.sleepTicks(lIlIlIlIIl[3]);
                        "".length();
                    }
                    C0006g.a(cy);
                }
            }
            if (lIIlIIIlIIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[12])) {
                if (lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cZ), lIlIlIlIIl[4])) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[14]];
                    Movement.walkTo(cZ);
                    "".length();
                    Time.sleepTicks(lIlIlIlIIl[0]);
                    "".length();
                    if (lIIlIIIIllIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIlIlIlIIl[20], lIlIlIlIIl[21], lIlIlIlIIl[1])) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[22]];
                        C0004e.c(new WorldPoint(lIlIlIlIIl[23], lIlIlIlIIl[24], lIlIlIlIIl[1]));
                        Time.sleepTicks(lIlIlIlIIl[5]);
                        "".length();
                    }
                }
                if (lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(cZ), lIlIlIlIIl[4])) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[25]];
                    C0006g.a(lIlIlIIllI[lIlIlIlIIl[26]], cy, lIlIlIlIIl[0]);
                }
            }
            if (lIIlIIIlIIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[14])) {
                if (lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(da), lIlIlIlIIl[4])) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[27]];
                    Movement.walkTo(da);
                    "".length();
                    Time.sleepTicks(lIlIlIlIIl[0]);
                    "".length();
                }
                if (lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(da), lIlIlIlIIl[4])) {
                    int[] iArr4 = new int[lIlIlIlIIl[0]];
                    iArr4[lIlIlIlIIl[1]] = lIlIlIlIIl[8];
                    if (lIIlIIIIllIll(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIlIlIlIIl[0]];
                        iArr5[lIlIlIlIIl[1]] = lIlIlIlIIl[8];
                        Item first = Inventory.getFirst(iArr5);
                        String[] strArr2 = new String[lIlIlIlIIl[0]];
                        strArr2[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[28]];
                        first.useOn(TileObjects.getNearest(strArr2));
                        Time.sleepTicks(lIlIlIlIIl[3]);
                        "".length();
                    }
                }
            }
            if (lIIlIIIlIIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[28])) {
                int[] iArr6 = new int[lIlIlIlIIl[0]];
                iArr6[lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                if (lIIlIIIIllIll(Inventory.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[lIlIlIlIIl[0]];
                    iArr7[lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                    Inventory.getFirst(iArr7).interact(lIlIlIIllI[lIlIlIlIIl[29]]);
                }
                if (lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(da), lIlIlIlIIl[4])) {
                    String[] strArr3 = new String[lIlIlIlIIl[0]];
                    strArr3[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[30]];
                    TileObjects.getNearest(strArr3).interact(lIlIlIIllI[lIlIlIlIIl[31]]);
                    Time.sleepTicks(lIlIlIlIIl[9]);
                    "".length();
                }
                if (lIIlIIIlIIIII(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(lIlIlIlIIl[32], lIlIlIlIIl[33])), lIlIlIlIIl[34])) {
                    String[] strArr4 = new String[lIlIlIlIIl[0]];
                    strArr4[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[35]];
                }
                String[] strArr5 = new String[lIlIlIlIIl[0]];
                strArr5[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[36]];
                if (lIIlIIIIllllI(TileObjects.getNearest(strArr5))) {
                    if (lIIlIIIlIIIII(Players.getLocal().getLocalLocation().getY(), lIlIlIlIIl[37])) {
                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                        String[] strArr6 = new String[lIlIlIlIIl[0]];
                        strArr6[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[38]];
                        if (lIIlIIIlIIIIl(worldLocation.distanceTo(TileObjects.getNearest(strArr6).getWorldLocation()), lIlIlIlIIl[14])) {
                            String[] strArr7 = new String[lIlIlIlIIl[0]];
                            strArr7[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[39]];
                            if (lIIlIIIlIIIll(NPCs.getNearest(strArr7))) {
                                AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[40]];
                                String[] strArr8 = new String[lIlIlIlIIl[0]];
                                strArr8[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[41]];
                                TileObjects.getNearest(strArr8).interact(lIlIlIIllI[lIlIlIlIIl[42]]);
                                Time.sleepTicks(lIlIlIlIIl[14]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr9 = new String[lIlIlIlIIl[0]];
                    strArr9[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[43]];
                    if (lIIlIIIlIIIll(NPCs.getNearest(strArr9)) && lIIlIIIIlllIl(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[44]];
                        String[] strArr10 = new String[lIlIlIlIIl[0]];
                        strArr10[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[45]];
                        TileObjects.getNearest(strArr10).interact(lIlIlIIllI[lIlIlIlIIl[46]]);
                        Time.sleepTicks(lIlIlIlIIl[12]);
                        "".length();
                        C0006g.a(cy);
                    }
                    C0006g.a(cy);
                }
            }
            if (lIIlIIIlIIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[36])) {
                AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[47]];
                C0006g.a(lIlIlIIllI[lIlIlIlIIl[48]], cy);
            }
            if (lIIlIIIlIIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[42])) {
                if (lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(da), lIlIlIlIIl[4])) {
                    String[] strArr11 = new String[lIlIlIlIIl[0]];
                    strArr11[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[49]];
                    if (lIIlIIIlIIIll(NPCs.getNearest(strArr11))) {
                        String[] strArr12 = new String[lIlIlIlIIl[0]];
                        strArr12[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[50]];
                        if (lIIlIIIIlllIl(Equipment.contains(strArr12) ? 1 : 0)) {
                            String[] strArr13 = new String[lIlIlIlIIl[0]];
                            strArr13[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[51]];
                            if (lIIlIIIIllIll(Inventory.contains(strArr13) ? 1 : 0)) {
                                String[] strArr14 = new String[lIlIlIlIIl[0]];
                                strArr14[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[52]];
                                Inventory.getFirst(strArr14).interact(lIlIlIIllI[lIlIlIlIIl[53]]);
                            }
                        }
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[54]];
                        Movement.walkTo(da);
                        "".length();
                        Time.sleepTicks(lIlIlIlIIl[0]);
                        "".length();
                    }
                }
                if (lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(da), lIlIlIlIIl[4])) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[55]];
                    String[] strArr15 = new String[lIlIlIlIIl[0]];
                    strArr15[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[56]];
                    if (lIIlIIIIllllI(TileObjects.getNearest(strArr15))) {
                        String[] strArr16 = new String[lIlIlIlIIl[0]];
                        strArr16[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[57]];
                        TileObjects.getNearest(strArr16).interact(lIlIlIIllI[lIlIlIlIIl[58]]);
                        Time.sleepTicks(lIlIlIlIIl[9]);
                        "".length();
                    }
                }
                if (lIIlIIIlIIIII(Players.getLocal().getLocalLocation().getY(), lIlIlIlIIl[37])) {
                    WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
                    String[] strArr17 = new String[lIlIlIlIIl[0]];
                    strArr17[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[59]];
                    if (lIIlIIIlIIIII(worldLocation2.distanceTo(TileObjects.getNearest(strArr17).getWorldLocation()), lIlIlIlIIl[18])) {
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[60]];
                        String[] strArr18 = new String[lIlIlIlIIl[0]];
                        strArr18[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[61]];
                        TileObjects.getNearest(strArr18).interact(lIlIlIIllI[lIlIlIlIIl[62]]);
                        Time.sleepTicks(lIlIlIlIIl[14]);
                        "".length();
                    }
                }
                if (lIIlIIIlIIIll(Players.getLocal().getInteracting()) && lIIlIIIIlllIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr19 = new String[lIlIlIlIIl[0]];
                    strArr19[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[63]];
                    if (lIIlIIIIlllIl(Equipment.contains(strArr19) ? 1 : 0)) {
                        String[] strArr20 = new String[lIlIlIlIIl[0]];
                        strArr20[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[64]];
                        if (lIIlIIIIllIll(Inventory.contains(strArr20) ? 1 : 0)) {
                            String[] strArr21 = new String[lIlIlIlIIl[0]];
                            strArr21[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[65]];
                            Inventory.getFirst(strArr21).interact(lIlIlIIllI[lIlIlIlIIl[66]]);
                        }
                    }
                    int[] iArr8 = new int[lIlIlIlIIl[0]];
                    iArr8[lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                    if (lIIlIIIIllIll(Inventory.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIlIlIlIIl[0]];
                        iArr9[lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                        if (lIIlIIIIlllIl(Equipment.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lIlIlIlIIl[0]];
                            iArr10[lIlIlIlIIl[1]] = lIlIlIlIIl[10];
                            Inventory.getFirst(iArr10).interact(lIlIlIIllI[lIlIlIlIIl[34]]);
                        }
                    }
                    String[] strArr22 = new String[lIlIlIlIIl[0]];
                    strArr22[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[67]];
                    NPCs.getNearest(strArr22).interact(lIlIlIIllI[lIlIlIlIIl[68]]);
                    Time.sleepTicks(lIlIlIlIIl[0]);
                    "".length();
                }
                if (lIIlIIIlIIlII(lIIlIIIIllIlI(C0004e.u(), 60.0d))) {
                    int[] iArr11 = new int[lIlIlIlIIl[0]];
                    iArr11[lIlIlIlIIl[1]] = lIlIlIlIIl[13];
                    if (lIIlIIIIllIll(Inventory.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[lIlIlIlIIl[0]];
                        iArr12[lIlIlIlIIl[1]] = lIlIlIlIIl[13];
                        Inventory.getFirst(iArr12).interact(lIlIlIIllI[lIlIlIlIIl[69]]);
                        Time.sleepTicks(lIlIlIlIIl[0]);
                        "".length();
                    }
                }
                C0006g.a(cy);
            }
            if (lIIlIIIlIIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[47])) {
                String[] strArr23 = new String[lIlIlIlIIl[0]];
                strArr23[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[70]];
                if (lIIlIIIIlllIl(Inventory.contains(strArr23) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[71]];
                    String[] strArr24 = new String[lIlIlIlIIl[0]];
                    strArr24[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[72]];
                    TileObjects.getNearest(strArr24).interact(lIlIlIIllI[lIlIlIlIIl[73]]);
                    Time.sleepTicks(lIlIlIlIIl[4]);
                    "".length();
                }
                String[] strArr25 = new String[lIlIlIlIIl[0]];
                strArr25[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[74]];
                if (lIIlIIIIllIll(Inventory.contains(strArr25) ? 1 : 0)) {
                    if (lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cZ), lIlIlIlIIl[4])) {
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[75]];
                        Movement.walkTo(cZ);
                        "".length();
                        Time.sleepTicks(lIlIlIlIIl[0]);
                        "".length();
                        if (lIIlIIIIllIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIlIlIlIIl[20], lIlIlIlIIl[21], lIlIlIlIIl[1])) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[76]];
                            C0004e.c(new WorldPoint(lIlIlIlIIl[23], lIlIlIlIIl[24], lIlIlIlIIl[1]));
                            Time.sleepTicks(lIlIlIlIIl[5]);
                            "".length();
                        }
                    }
                    if (lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(cZ), lIlIlIlIIl[4])) {
                        AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[77]];
                        C0006g.a(lIlIlIIllI[lIlIlIlIIl[78]], cy, lIlIlIlIIl[0]);
                    }
                }
            }
            if (lIIlIIIlIIIlI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[52])) {
                if (lIIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(db), lIlIlIlIIl[9])) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[79]];
                    Movement.walkTo(db);
                    "".length();
                    Time.sleepTicks(lIlIlIlIIl[0]);
                    "".length();
                }
                if (lIIlIIIlIIIIl(Players.getLocal().getWorldLocation().distanceTo(db), lIlIlIlIIl[9])) {
                    AccBuilderShamans.c = lIlIlIIllI[lIlIlIlIIl[80]];
                    if (lIIlIIIIlllII(dc, lIlIlIlIIl[0])) {
                        Z.nI += lIlIlIlIIl[0];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlIlIlIIl[0];
                        Z.nI = lIlIlIlIIl[1];
                        dd = lIlIlIlIIl[1];
                    }
                    C0006g.a(lIlIlIIllI[lIlIlIlIIl[17]], cy);
                }
            }
        }
    }

    private static void lIIlIIIIllIII() {
        lIlIlIIllI = new String[lIlIlIlIIl[100]];
        lIlIlIIllI[lIlIlIlIIl[1]] = lIIlIIIIIIlII("WBSy4u3D1ibFH0VF1/PVvzw7fAp5N5e7+BXybq06SJ4G/LHpsimzZ9FoNzcg1YSM", "vcIHk");
        lIlIlIIllI[lIlIlIlIIl[0]] = lIIlIIIIIIlIl("PhxNn5vRXsMk2EKrout8ig==", "Cnssa");
        lIlIlIIllI[lIlIlIlIIl[3]] = lIIlIIIIIIlIl("i4/HTq7ECC5hP7eA4hIRMm9dZDds7s7N", "wvwPk");
        lIlIlIIllI[lIlIlIlIIl[9]] = lIIlIIIIIIlIl("LnIPXzA09dSNdqPoF+XmRK65zRGvsOzihIRcn+BTRyF/60vaZEi2sVys3ctG7vRncUGdTJ2/Ie4=", "MEzqX");
        lIlIlIIllI[lIlIlIlIIl[4]] = lIIlIIIIIIllI("DQc6ODg=", "IuSVS");
        lIlIlIIllI[lIlIlIlIIl[12]] = lIIlIIIIIIlIl("C7cYA1LYZuM=", "EbCTs");
        lIlIlIIllI[lIlIlIlIIl[5]] = lIIlIIIIIIllI("NAYEVwMVRwEDFggT", "zgrww");
        lIlIlIIllI[lIlIlIlIIl[18]] = lIIlIIIIIIlII("Ak1i7IH1c4RES6I2w2nsQQ==", "NITsG");
        lIlIlIIllI[lIlIlIlIIl[16]] = lIIlIIIIIIllI("Bj02PA0tciA6Dzo2", "HRBUn");
        lIlIlIIllI[lIlIlIlIIl[19]] = lIIlIIIIIIlII("1Uj1E4V9ZlE=", "BPqOe");
        lIlIlIIllI[lIlIlIlIIl[14]] = lIIlIIIIIIlIl("2TWpNc7Qyzeb0BD9xkAsTw==", "sVmkn");
        lIlIlIIllI[lIlIlIlIIl[22]] = lIIlIIIIIIlII("GzrDN1XQI9dXbix9H3T/LmMK/W8v5Jfc", "AhLoz");
        lIlIlIIllI[lIlIlIlIIl[25]] = lIIlIIIIIIllI("NTMGJC8PNUo8JxMzAg==", "aRjOF");
        lIlIlIIllI[lIlIlIlIIl[26]] = lIIlIIIIIIllI("PAo7Lxo=", "okINr");
        lIlIlIIllI[lIlIlIlIIl[27]] = lIIlIIIIIIlII("Q+g/l2Rgqq/ueDMiUbr4JA==", "wToCH");
        lIlIlIIllI[lIlIlIlIIl[28]] = lIIlIIIIIIlII("F+CbatYQXYN0yxJJ7aOG7w==", "zPmeq");
        lIlIlIIllI[lIlIlIlIIl[29]] = lIIlIIIIIIlIl("x9mPfxjHBq0=", "tbfGf");
        lIlIlIIllI[lIlIlIlIIl[30]] = lIIlIIIIIIllI("MB8mIiAEDnQrIQ8O", "ckTCN");
        lIlIlIIllI[lIlIlIlIIl[31]] = lIIlIIIIIIlII("AUJnuquT5zHtdWgVgz46pA==", "MtQZO");
        lIlIlIIllI[lIlIlIlIIl[35]] = lIIlIIIIIIlII("lc0koonSlut3oZEG2DjksA==", "NQfsk");
        lIlIlIIllI[lIlIlIlIIl[36]] = lIIlIIIIIIlIl("mO89lEjz31UA6TQXafvqxw==", "OwnNM");
        lIlIlIIllI[lIlIlIlIIl[38]] = lIIlIIIIIIllI("KBkqLScLEiA=", "juENL");
        lIlIlIIllI[lIlIlIlIIl[39]] = lIIlIIIIIIllI("PDMRWSwEMxge", "lZvyx");
        lIlIlIIllI[lIlIlIlIIl[40]] = lIIlIIIIIIllI("JgkfKyRFCgAjNEUHGiklDgQRIw==", "eevFF");
        lIlIlIIllI[lIlIlIlIIl[41]] = lIIlIIIIIIlII("MYizxERBY3x89kFWbUQ7nA==", "jaPCa");
        lIlIlIIllI[lIlIlIlIIl[42]] = lIIlIIIIIIlIl("i8O3mGLNqnwBDySg9wtuwQ==", "VhVbE");
        lIlIlIIllI[lIlIlIlIIl[43]] = lIIlIIIIIIllI("NgEzdAMOAToz", "fhTTW");
        lIlIlIIllI[lIlIlIlIIl[44]] = lIIlIIIIIIlII("iUO8SkkiuefStxRMfu3+RQ==", "EpPDY");
        lIlIlIIllI[lIlIlIlIIl[45]] = lIIlIIIIIIlIl("NGAWOIB437M61INVB874sg==", "nTzCn");
        lIlIlIIllI[lIlIlIlIIl[46]] = lIIlIIIIIIlII("Z6U83nv07Xe5CmP7+dzmpA==", "YbulJ");
        lIlIlIIllI[lIlIlIlIIl[47]] = lIIlIIIIIIlII("AXlFHq0MNR730uAmLqe5qJdUlQX6+j6Z", "EfcfG");
        lIlIlIIllI[lIlIlIlIIl[48]] = lIIlIIIIIIlIl("DFEksKomwKM=", "ZkDbV");
        lIlIlIIllI[lIlIlIlIIl[49]] = lIIlIIIIIIlIl("0gv0ffC+CmA=", "EENfh");
        lIlIlIIllI[lIlIlIlIIl[50]] = lIIlIIIIIIlIl("zW22LDQWWgZ3wqmBAG7sFUrlCugwuy8y", "tAzju");
        lIlIlIIllI[lIlIlIlIIl[51]] = lIIlIIIIIIlII("LqjKxaC7p1vI8mmcdNTwrpFkSCiiHy+X", "YWwiP");
        lIlIlIIllI[lIlIlIlIIl[52]] = lIIlIIIIIIlIl("W9KMUadL0LMPgEHDOpsV0Zni9CqDKp3U", "tgMYs");
        lIlIlIIllI[lIlIlIlIIl[53]] = lIIlIIIIIIlIl("jy+hdfMo/n8=", "VFHhQ");
        lIlIlIIllI[lIlIlIlIIl[54]] = lIIlIIIIIIlII("Lr5l81Mruuf2uKTgWla0JQ==", "grAEZ");
        lIlIlIIllI[lIlIlIlIIl[55]] = lIIlIIIIIIlIl("h2ACABSnOwoe2RgBUO/BgQ==", "uzSzl");
        lIlIlIIllI[lIlIlIlIIl[56]] = lIIlIIIIIIlIl("hE1XmPR4ALPIiQ9HYK70MQ==", "vvyOC");
        lIlIlIIllI[lIlIlIlIIl[57]] = lIIlIIIIIIllI("ByI2LCUzM2QlJDgz", "TVDMK");
        lIlIlIIllI[lIlIlIlIIl[58]] = lIIlIIIIIIlIl("6/3bL9MBnPdEana2AnbY8A==", "zMccn");
        lIlIlIIllI[lIlIlIlIIl[59]] = lIIlIIIIIIlIl("tUSg0JQSJeA+U7eb2zcJIA==", "DkBeU");
        lIlIlIIllI[lIlIlIlIIl[60]] = lIIlIIIIIIlII("Y80giuGk8+UkIH0lVIc4AVUgCqmS1+OH", "RobMB");
        lIlIlIIllI[lIlIlIlIIl[61]] = lIIlIIIIIIlII("44DL1rbeqMFu4BKrW5HS/w==", "rlZwh");
        lIlIlIIllI[lIlIlIlIIl[62]] = lIIlIIIIIIlII("uxu8VlDoJUwH2wQpCJ8bTg==", "ppGLE");
        lIlIlIIllI[lIlIlIlIIl[63]] = lIIlIIIIIIlII("TuSZwnxNyM7ndhm0T3n5hE50+Aj+GJkf", "HEcJT");
        lIlIlIIllI[lIlIlIlIIl[64]] = lIIlIIIIIIllI("FCkwFg0pPjodD2YrNh8MKikq", "FLYxk");
        lIlIlIIllI[lIlIlIlIIl[65]] = lIIlIIIIIIllI("CjIYGQg3JRISCngwHhAJNDIC", "XWqwn");
        lIlIlIIllI[lIlIlIlIIl[66]] = lIIlIIIIIIlIl("ZcYP+wbwpsk=", "JSikV");
        lIlIlIIllI[lIlIlIlIIl[34]] = lIIlIIIIIIlIl("apsAxl42b0w=", "WEQlF");
        lIlIlIIllI[lIlIlIlIIl[67]] = lIIlIIIIIIlII("zYzyGESIGCU=", "vgLbo");
        lIlIlIIllI[lIlIlIlIIl[68]] = lIIlIIIIIIllI("BSMCCRIv", "DWvhq");
        lIlIlIIllI[lIlIlIlIIl[69]] = lIIlIIIIIIlII("jDKE5x/MA3M=", "CKjNr");
        lIlIlIIllI[lIlIlIlIIl[70]] = lIIlIIIIIIlII("KDJ0Kvp4TIVlCn3s6SUWaA==", "yDkfT");
        lIlIlIIllI[lIlIlIlIIl[71]] = lIIlIIIIIIllI("MxAGJwYeAlI1AB8R", "perSo");
        lIlIlIIllI[lIlIlIlIIl[72]] = lIIlIIIIIIlII("BXWas9GcmsgmMlHRu4R/HA==", "HtHpH");
        lIlIlIIllI[lIlIlIlIIl[73]] = lIIlIIIIIIlII("Z8HoOC57fyz0PMSy7T2XQA==", "PVYEY");
        lIlIlIIllI[lIlIlIlIIl[74]] = lIIlIIIIIIllI("CR8MOzA1F1kvNzUE", "ZpyIX");
        lIlIlIIllI[lIlIlIlIIl[75]] = lIIlIIIIIIlII("cjR2FIr8RNuoZq1V/XbyIw==", "lXfvY");
        lIlIlIIllI[lIlIlIlIIl[76]] = lIIlIIIIIIlII("8FEfCNOAmVvu8mfpjI23T2hSJCWC7Y4T", "OGsjc");
        lIlIlIIllI[lIlIlIlIIl[77]] = lIIlIIIIIIllI("HzEnHwwlN2sHBDkxIw==", "KPKte");
        lIlIlIIllI[lIlIlIlIIl[78]] = lIIlIIIIIIllI("IQ4gLTk=", "roRLQ");
        lIlIlIIllI[lIlIlIlIIl[79]] = lIIlIIIIIIlIl("tgnxw9qRjC+tTE3PVO2B0w==", "gdtOU");
        lIlIlIIllI[lIlIlIlIIl[80]] = lIIlIIIIIIlII("IeUL73lulk8SA1fpZN6f9A==", "NpMFY");
        lIlIlIIllI[lIlIlIlIIl[17]] = lIIlIIIIIIlIl("BBLLi6t/RMM=", "OOBBw");
        lIlIlIIllI[lIlIlIlIIl[86]] = lIIlIIIIIIlII("d+Orw0D7n23WMuUNXCnVJ4zJRk6mDiFK", "txkfC");
        lIlIlIIllI[lIlIlIlIIl[87]] = lIIlIIIIIIlIl("CdGfKNvFIDcP36gC6mdf+KBSLV/mv+/4", "rTGaF");
        lIlIlIIllI[lIlIlIlIIl[96]] = lIIlIIIIIIllI("CQIbQg==", "Pghlo");
        lIlIlIIllI[lIlIlIlIIl[97]] = lIIlIIIIIIllI("Agk5AEg3CjoeHHYcPQ5INAcgBRwvRg==", "VhUkh");
        lIlIlIIllI[lIlIlIlIIl[98]] = lIIlIIIIIIlIl("DK3bK/QrgBz8yYHULh23CQqq9NTPp3R1OU2qv06avJs=", "uuvag");
        lIlIlIIllI[lIlIlIlIIl[99]] = lIIlIIIIIIlII("vRZRw0TvR5s=", "zZsRk");
    }

    private static boolean lIIlIIIlIIIlI(int i, int i2) {
        return i == i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            ba();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (27 ^ 17) & ((9 ^ 3) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIlIlIIl[85];
    }

    private static boolean lIIlIIIIlllIl(int i) {
        return i == 0;
    }

    private static void lIIlIIIIllIIl() {
        lIlIlIlIIl = new int[101];
        lIlIlIlIIl[0] = " ".length();
        lIlIlIlIIl[1] = ((197 ^ 160) ^ (((41 + 54) - (-26)) + 6)) & (((49 ^ 122) ^ (147 ^ 194)) ^ (-" ".length()));
        lIlIlIlIIl[2] = (-((-18982) & 28199)) & (-39) & 14255;
        lIlIlIlIIl[3] = "  ".length();
        lIlIlIlIIl[4] = 137 ^ 141;
        lIlIlIlIIl[5] = 134 ^ 128;
        lIlIlIlIIl[6] = (-9) & 8015;
        lIlIlIlIIl[7] = (-((-13578) & 30139)) & (-8199) & 32767;
        lIlIlIlIIl[8] = (-29766) & 30719;
        lIlIlIlIIl[9] = "   ".length();
        lIlIlIlIIl[10] = (-20613) & 21943;
        lIlIlIlIIl[11] = (-3747) & 16371;
        lIlIlIlIIl[12] = 112 ^ 117;
        lIlIlIlIIl[13] = (-((-17737) & 24521)) & (-1029) & 8191;
        lIlIlIlIIl[14] = (((1 + 31) - (-47)) + 126) ^ (((75 + 131) - 50) + 43);
        lIlIlIlIIl[15] = (-((-269) & 24879)) & (-129) & 32747;
        lIlIlIlIIl[16] = (((38 + 58) - 30) + 64) ^ (((55 + 129) - 159) + 113);
        lIlIlIlIIl[17] = 228 ^ 165;
        lIlIlIlIIl[18] = (((135 + 15) - 13) + 42) ^ (((67 + 132) - 155) + 136);
        lIlIlIlIIl[19] = 204 ^ 197;
        lIlIlIlIIl[20] = (-((-7473) & 32062)) & (-1025) & 28655;
        lIlIlIlIIl[21] = (-((-17591) & 18359)) & (-8197) & 12269;
        lIlIlIlIIl[22] = 93 ^ 86;
        lIlIlIlIIl[23] = (-((-3775) & 24255)) & (-8193) & 31711;
        lIlIlIlIIl[24] = (-((-1185) & 6067)) & (-13) & 8191;
        lIlIlIlIIl[25] = 180 ^ 184;
        lIlIlIlIIl[26] = (97 ^ 2) ^ (105 ^ 7);
        lIlIlIlIIl[27] = 160 ^ 174;
        lIlIlIlIIl[28] = (32 ^ 63) ^ (105 ^ 121);
        lIlIlIlIIl[29] = (((5 + 73) - 25) + 128) ^ (((143 + 136) - 160) + 46);
        lIlIlIlIIl[30] = (((78 + 137) - 93) + 54) ^ (((36 + 83) - 98) + 140);
        lIlIlIlIIl[31] = (76 ^ 40) ^ (41 ^ 95);
        lIlIlIlIIl[32] = (-((-15234) & 16319)) & (-8323) & 16383;
        lIlIlIlIIl[33] = (-((-67) & 17767)) & (-8219) & 32254;
        lIlIlIlIIl[34] = (((117 + 13) - 38) + 78) ^ (((132 + 92) - 98) + 26);
        lIlIlIlIIl[35] = (35 ^ 120) ^ (55 ^ 127);
        lIlIlIlIIl[36] = 54 ^ 34;
        lIlIlIlIIl[37] = (-8223) & 13278;
        lIlIlIlIIl[38] = 156 ^ 137;
        lIlIlIlIIl[39] = 22 ^ 0;
        lIlIlIlIIl[40] = 209 ^ 198;
        lIlIlIlIIl[41] = 43 ^ 51;
        lIlIlIlIIl[42] = (((110 + 131) - 219) + 112) ^ (((20 + 46) - 27) + 120);
        lIlIlIlIIl[43] = (242 ^ 143) ^ (162 ^ 197);
        lIlIlIlIIl[44] = 13 ^ 22;
        lIlIlIlIIl[45] = 27 ^ 7;
        lIlIlIlIIl[46] = 34 ^ 63;
        lIlIlIlIIl[47] = 28 ^ 2;
        lIlIlIlIIl[48] = (94 ^ 57) ^ (108 ^ 20);
        lIlIlIlIIl[49] = 105 ^ 73;
        lIlIlIlIIl[50] = 98 ^ 67;
        lIlIlIlIIl[51] = (45 ^ 116) ^ (217 ^ 162);
        lIlIlIlIIl[52] = (46 ^ 98) ^ (223 ^ 176);
        lIlIlIlIIl[53] = (((35 + 122) - 4) + 15) ^ (((44 + 44) - 54) + 106);
        lIlIlIlIIl[54] = (86 ^ 52) ^ (231 ^ 160);
        lIlIlIlIIl[55] = (105 ^ 29) ^ (192 ^ 146);
        lIlIlIlIIl[56] = (127 ^ 6) ^ (42 ^ 116);
        lIlIlIlIIl[57] = (((51 + 157) - 164) + 129) ^ (((128 + 118) - 147) + 34);
        lIlIlIlIIl[58] = 39 ^ 14;
        lIlIlIlIIl[59] = (((45 + 69) - (-76)) + 1) ^ (((78 + 31) - 38) + 78);
        lIlIlIlIIl[60] = 123 ^ 80;
        lIlIlIlIIl[61] = (((51 + 28) - 68) + 117) ^ (((88 + 110) - 182) + 156);
        lIlIlIlIIl[62] = (115 ^ 126) ^ (134 ^ 166);
        lIlIlIlIIl[63] = 20 ^ 58;
        lIlIlIlIIl[64] = (90 ^ 42) ^ (65 ^ 30);
        lIlIlIlIIl[65] = (((29 + 97) - 123) + 147) ^ (((144 + 140) - 223) + 105);
        lIlIlIlIIl[66] = (54 ^ 1) ^ (173 ^ 171);
        lIlIlIlIIl[67] = (122 ^ 47) ^ (14 ^ 104);
        lIlIlIlIIl[68] = (89 ^ 45) ^ (234 ^ 170);
        lIlIlIlIIl[69] = (((46 + 143) - 38) + 0) ^ (((7 + 126) - 113) + 142);
        lIlIlIlIIl[70] = (123 ^ 52) ^ (66 ^ 59);
        lIlIlIlIIl[71] = 51 ^ 4;
        lIlIlIlIIl[72] = 27 ^ 35;
        lIlIlIlIIl[73] = 163 ^ 154;
        lIlIlIlIIl[74] = (13 ^ 18) ^ (44 ^ 9);
        lIlIlIlIIl[75] = 54 ^ 13;
        lIlIlIlIIl[76] = 136 ^ 180;
        lIlIlIlIIl[77] = (175 ^ 165) ^ (64 ^ 119);
        lIlIlIlIIl[78] = 254 ^ 192;
        lIlIlIlIIl[79] = 165 ^ 154;
        lIlIlIlIIl[80] = 217 ^ 153;
        lIlIlIlIIl[81] = (-((-12601) & 32255)) & (-4098) & 32751;
        lIlIlIlIIl[82] = (-10346) & 11245;
        lIlIlIlIIl[83] = (-290) & 12269;
        lIlIlIlIIl[84] = (-4614) & 29613;
        lIlIlIlIIl[85] = 102 ^ 2;
        lIlIlIlIIl[86] = 78 ^ 12;
        lIlIlIlIIl[87] = (((198 + 136) - 197) + 66) ^ (((49 + 82) - 104) + 109);
        lIlIlIlIIl[88] = (-24833) & 27917;
        lIlIlIlIIl[89] = (-29193) & 32443;
        lIlIlIlIIl[90] = (-4130) & 7165;
        lIlIlIlIIl[91] = (-((-6467) & 7011)) & (-12290) & 16127;
        lIlIlIlIIl[92] = (-((-1551) & 30623)) & (-4) & 32223;
        lIlIlIlIIl[93] = (-8397) & 11743;
        lIlIlIlIIl[94] = (-((-16905) & 29577)) & (-16393) & 32155;
        lIlIlIlIIl[95] = (-((-1025) & 5143)) & (-16681) & 24063;
        lIlIlIlIIl[96] = (167 ^ 135) ^ (58 ^ 94);
        lIlIlIlIIl[97] = (18 ^ 75) ^ (139 ^ 151);
        lIlIlIlIIl[98] = (7 ^ 73) ^ (86 ^ 94);
        lIlIlIlIIl[99] = 228 ^ 163;
        lIlIlIlIIl[100] = 124 ^ 52;
    }

    private static int lIIlIIIIllIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlIIIlIIlII(int i) {
        return i < 0;
    }

    private static boolean lIIlIIIIlllll(int i) {
        return i > 0;
    }

    private static boolean lIIlIIIlIIlIl(int i) {
        return i <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIIIlIIllI(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), lIlIlIlIIl[57])) {
            ?? r0 = lIlIlIlIIl[0];
            "".length();
            return " ".length() != " ".length() ? ((((192 + 96) - 228) + 179) ^ (((46 + 93) - 62) + 120)) & (((((154 + 60) - 203) + 161) ^ (((88 + 64) - 35) + 17)) ^ (-" ".length())) : r0;
        }
        return lIlIlIlIIl[1];
    }

    private static String lIIlIIIIIIllI(String lllllllllllllllllllIlllIIlIIllII, String lllllllllllllllllllIlllIIlIIlIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIlllIIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIlllIIlIIlIlI = new StringBuilder();
        char[] lllllllllllllllllllIlllIIlIIlIIl = lllllllllllllllllllIlllIIlIIlIll.toCharArray();
        int lllllllllllllllllllIlllIIlIIlIII = lIlIlIlIIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlIlIIl[1];
        while (lIIlIIIIlllII(i, length)) {
            lllllllllllllllllllIlllIIlIIlIlI.append((char) (charArray[i] ^ lllllllllllllllllllIlllIIlIIlIIl[lllllllllllllllllllIlllIIlIIlIII % lllllllllllllllllllIlllIIlIIlIIl.length]));
            "".length();
            lllllllllllllllllllIlllIIlIIlIII++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllIlllIIlIIlIlI);
    }

    static {
        lIIlIIIIllIIl();
        lIIlIIIIllIII();
        bp = new ArrayList();
        cV = new WorldPoint(lIlIlIlIIl[88], lIlIlIlIIl[89], lIlIlIlIIl[1]);
        cZ = new WorldPoint(lIlIlIlIIl[90], lIlIlIlIIl[91], lIlIlIlIIl[1]);
        da = new WorldPoint(lIlIlIlIIl[92], lIlIlIlIIl[93], lIlIlIlIIl[1]);
        db = new WorldPoint(lIlIlIlIIl[94], lIlIlIlIIl[95], lIlIlIlIIl[1]);
        de = null;
        String[] strArr = new String[lIlIlIlIIl[4]];
        strArr[lIlIlIlIIl[1]] = lIlIlIIllI[lIlIlIlIIl[96]];
        strArr[lIlIlIlIIl[0]] = lIlIlIIllI[lIlIlIlIIl[97]];
        strArr[lIlIlIlIIl[3]] = lIlIlIIllI[lIlIlIlIIl[98]];
        strArr[lIlIlIlIIl[9]] = lIlIlIIllI[lIlIlIlIIl[99]];
        cy = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIlIlIIl[1];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIlIIllI[lIlIlIlIIl[86]];
    }

    private static boolean lIIlIIIlIIllI(int i, int i2) {
        return i >= i2;
    }

    private static String lIIlIIIIIIlIl(String lllllllllllllllllllIlllIIIllIlll, String lllllllllllllllllllIlllIIIllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlllIIIllIllI.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIlIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlllIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlllIIIllIIll) {
            lllllllllllllllllllIlllIIIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIlIIIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIIlIIIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIIIllIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a9, code lost:
        if (lIIlIIIIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0019t.lIlIlIlIIl[12]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O() {
        int[] iArr;
        int[] iArr2 = new int[lIlIlIlIIl[0]];
        iArr2[lIlIlIlIIl[1]] = lIlIlIlIIl[8];
        if (lIIlIIIIlllIl(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIlIIl[8], lIlIlIlIIl[0], lIlIlIlIIl[81]));
            "".length();
        }
        int[] iArr3 = new int[lIlIlIlIIl[0]];
        iArr3[lIlIlIlIIl[1]] = lIlIlIlIIl[10];
        if (lIIlIIIIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIlIIl[10], lIlIlIlIIl[0], lIlIlIlIIl[81]));
            "".length();
        }
        int[] iArr4 = new int[lIlIlIlIIl[0]];
        iArr4[lIlIlIlIIl[1]] = lIlIlIlIIl[13];
        if (lIIlIIIIlllIl(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIlIIl[13], lIlIlIlIIl[50], lIlIlIlIIl[82]));
            "".length();
        }
        int[] iArr5 = new int[lIlIlIlIIl[0]];
        iArr5[lIlIlIlIIl[1]] = lIlIlIlIIl[11];
        if (lIIlIIIIlllIl(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIlIIl[11], lIlIlIlIIl[12], C0009j.bZ));
            "".length();
        }
        if (lIIlIIIIlllIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIlIIllI[lIlIlIlIIl[87]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIlIIl[83], lIlIlIlIIl[12], lIlIlIlIIl[84]));
            "".length();
        }
        int[] iArr6 = new int[lIlIlIlIIl[0]];
        iArr6[lIlIlIlIIl[1]] = lIlIlIlIIl[7];
        if (lIIlIIIIllIll(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIlIlIlIIl[0]];
            iArr7[lIlIlIlIIl[1]] = lIlIlIlIIl[7];
            if (lIIlIIIIllIll(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIlIlIIl[0]];
                iArr8[lIlIlIlIIl[1]] = lIlIlIlIIl[7];
            }
            iArr = new int[lIlIlIlIIl[0]];
            iArr[lIlIlIlIIl[1]] = lIlIlIlIIl[6];
            if (lIIlIIIIlllIl(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bp.add(new C0003d(lIlIlIlIIl[6], lIlIlIlIIl[57], lIlIlIlIIl[82]));
            "".length();
            return;
        }
        bp.add(new C0003d(lIlIlIlIIl[7], lIlIlIlIIl[28], lIlIlIlIIl[82]));
        "".length();
        iArr = new int[lIlIlIlIIl[0]];
        iArr[lIlIlIlIIl[1]] = lIlIlIlIIl[6];
        if (lIIlIIIIlllIl(Bank.contains(iArr) ? 1 : 0)) {
        }
    }
}
