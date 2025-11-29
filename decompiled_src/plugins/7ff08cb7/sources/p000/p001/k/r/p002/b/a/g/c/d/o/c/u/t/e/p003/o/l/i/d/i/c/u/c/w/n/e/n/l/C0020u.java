package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.u  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/u.class */
public class C0020u implements ab {
    public static /* synthetic */ List<C0003d> bx;
    public static /* synthetic */ WorldPoint dg;
    public static /* synthetic */ WorldPoint dj;
    public static /* synthetic */ WorldPoint dh;
    private static /* synthetic */ String[] llIIlIIlI;
    private static /* synthetic */ String[] cG;
    private static /* synthetic */ int[] llIIlIlIl;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ boolean dl;
    static /* synthetic */ int dk;
    public static /* synthetic */ WorldPoint di;
    private static /* synthetic */ WorldPoint dm;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (lIlIlIllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        int[] iArr = new int[llIIlIlIl[0]];
        iArr[llIIlIlIl[1]] = llIIlIlIl[6];
        if (lIlIlIllIlIl(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[llIIlIlIl[0]];
            iArr2[llIIlIlIl[1]] = llIIlIlIl[8];
            if (lIlIlIllIlIl(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[llIIlIlIl[0]];
                iArr3[llIIlIlIl[1]] = llIIlIlIl[10];
                if (lIlIlIlllIll(Inventory.getCount(iArr3))) {
                    int[] iArr4 = new int[llIIlIlIl[0]];
                    iArr4[llIIlIlIl[1]] = llIIlIlIl[10];
                }
                int[] iArr5 = new int[llIIlIlIl[0]];
                iArr5[llIIlIlIl[1]] = llIIlIlIl[13];
                if (lIlIlIllIlIl(Inventory.getCount(iArr5))) {
                    ?? r0 = llIIlIlIl[0];
                    "".length();
                    return (-"  ".length()) >= 0 ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                }
            }
        }
        return llIIlIlIl[1];
    }

    private static String lIlIlIIlIIIl(String lIlIllllllIlII, String lIlIllllllIIll) {
        try {
            SecretKeySpec lIlIllllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllllllIllI = Cipher.getInstance("Blowfish");
            lIlIllllllIllI.init(llIIlIlIl[3], lIlIllllllIlll);
            return new String(lIlIllllllIllI.doFinal(Base64.getDecoder().decode(lIlIllllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllllllIlIl) {
            lIlIllllllIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIlII(Object obj) {
        return obj != null;
    }

    static {
        lIlIlIlIllll();
        lIlIlIIllllI();
        bx = new ArrayList();
        dg = new WorldPoint(llIIlIlIl[88], llIIlIlIl[89], llIIlIlIl[1]);
        dh = new WorldPoint(llIIlIlIl[90], llIIlIlIl[91], llIIlIlIl[1]);
        di = new WorldPoint(llIIlIlIl[92], llIIlIlIl[93], llIIlIlIl[1]);
        dj = new WorldPoint(llIIlIlIl[94], llIIlIlIl[95], llIIlIlIl[1]);
        dm = null;
        String[] strArr = new String[llIIlIlIl[4]];
        strArr[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[96]];
        strArr[llIIlIlIl[0]] = llIIlIIlI[llIIlIlIl[97]];
        strArr[llIIlIlIl[3]] = llIIlIIlI[llIIlIlIl[98]];
        strArr[llIIlIlIl[9]] = llIIlIIlI[llIIlIlIl[99]];
        cG = strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a9, code lost:
        if (lIlIlIllIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0020u.llIIlIlIl[12]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2 = new int[llIIlIlIl[0]];
        iArr2[llIIlIlIl[1]] = llIIlIlIl[8];
        if (lIlIlIllIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIlIl[8], llIIlIlIl[0], llIIlIlIl[81]));
            "".length();
        }
        int[] iArr3 = new int[llIIlIlIl[0]];
        iArr3[llIIlIlIl[1]] = llIIlIlIl[10];
        if (lIlIlIllIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIlIl[10], llIIlIlIl[0], llIIlIlIl[81]));
            "".length();
        }
        int[] iArr4 = new int[llIIlIlIl[0]];
        iArr4[llIIlIlIl[1]] = llIIlIlIl[13];
        if (lIlIlIllIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIlIl[13], llIIlIlIl[50], llIIlIlIl[82]));
            "".length();
        }
        int[] iArr5 = new int[llIIlIlIl[0]];
        iArr5[llIIlIlIl[1]] = llIIlIlIl[11];
        if (lIlIlIllIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIlIl[11], llIIlIlIl[12], C0009j.ch));
            "".length();
        }
        if (lIlIlIllIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIlIIlI[llIIlIlIl[87]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(llIIlIlIl[83], llIIlIlIl[12], llIIlIlIl[84]));
            "".length();
        }
        int[] iArr6 = new int[llIIlIlIl[0]];
        iArr6[llIIlIlIl[1]] = llIIlIlIl[7];
        if (lIlIlIllIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[llIIlIlIl[0]];
            iArr7[llIIlIlIl[1]] = llIIlIlIl[7];
            if (lIlIlIllIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIlIlIl[0]];
                iArr8[llIIlIlIl[1]] = llIIlIlIl[7];
            }
            iArr = new int[llIIlIlIl[0]];
            iArr[llIIlIlIl[1]] = llIIlIlIl[6];
            if (lIlIlIllIIll(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bx.add(new C0003d(llIIlIlIl[6], llIIlIlIl[57], llIIlIlIl[82]));
            "".length();
            return;
        }
        bx.add(new C0003d(llIIlIlIl[7], llIIlIlIl[28], llIIlIlIl[82]));
        "".length();
        iArr = new int[llIIlIlIl[0]];
        iArr[llIIlIlIl[1]] = llIIlIlIl[6];
        if (lIlIlIllIIll(Bank.contains(iArr) ? 1 : 0)) {
        }
    }

    private static boolean lIlIlIllllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIlIllIllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x065c, code lost:
        if (lIlIlIllIlII(net.unethicalite.api.entities.TileObjects.getNearest(r0)) != false) goto L98;
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
    public static void aX() {
        if (lIlIlIllIIIl(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (lIlIlIllIIlI(bx.size(), llIIlIlIl[0])) {
                System.out.println(llIIlIIlI[llIIlIlIl[1]]);
                bv = llIIlIlIl[1];
            }
        }
        if (lIlIlIllIIll(bv ? 1 : 0)) {
            if (lIlIlIllIIll(an() ? 1 : 0) && lIlIlIllIIll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlIllIlII(nearest) && lIlIlIllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[0]];
                    C0000a.a(nearest);
                }
                if (lIlIlIllIlII(nearest) && lIlIlIllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIlIllIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIlIlIl[2]);
                        "".length();
                    }
                    if (lIlIlIllIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[3]];
                        if (lIlIlIllIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIlIlIl[4]);
                            "".length();
                        }
                        if (lIlIlIllIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIlIlIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[llIIlIlIl[5]];
                        iArr[llIIlIlIl[1]] = llIIlIlIl[6];
                        iArr[llIIlIlIl[0]] = llIIlIlIl[7];
                        iArr[llIIlIlIl[3]] = llIIlIlIl[8];
                        iArr[llIIlIlIl[9]] = llIIlIlIl[10];
                        iArr[llIIlIlIl[4]] = llIIlIlIl[11];
                        iArr[llIIlIlIl[12]] = llIIlIlIl[13];
                        if (lIlIlIllIIll(C0004e.d(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIlIIlI[llIIlIlIl[9]]);
                            bv = llIIlIlIl[0];
                            return;
                        }
                        int[] iArr2 = new int[llIIlIlIl[5]];
                        iArr2[llIIlIlIl[1]] = llIIlIlIl[6];
                        iArr2[llIIlIlIl[0]] = llIIlIlIl[7];
                        iArr2[llIIlIlIl[3]] = llIIlIlIl[8];
                        iArr2[llIIlIlIl[9]] = llIIlIlIl[10];
                        iArr2[llIIlIlIl[4]] = llIIlIlIl[11];
                        iArr2[llIIlIlIl[12]] = llIIlIlIl[13];
                        if (lIlIlIllIIIl(C0004e.d(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[llIIlIlIl[3]];
                            iArr3[llIIlIlIl[1]] = llIIlIlIl[8];
                            iArr3[llIIlIlIl[0]] = llIIlIlIl[10];
                            C0000a.a(iArr3);
                            C0000a.a(llIIlIlIl[6], llIIlIlIl[14]);
                            C0000a.a(llIIlIlIl[7], llIIlIlIl[14]);
                            C0000a.a(llIIlIlIl[15], llIIlIlIl[14]);
                            C0000a.b(C0005f.aY, llIIlIlIl[0]);
                            C0000a.a(llIIlIlIl[11], llIIlIlIl[4]);
                            C0000a.a(llIIlIlIl[13], llIIlIlIl[16]);
                        }
                    }
                }
            }
            if (lIlIlIllIIIl(Inventory.contains(C0005f.bc) ? 1 : 0) && lIlIlIllIIlI(Movement.getRunEnergy(), llIIlIlIl[17])) {
                Inventory.getFirst(C0005f.bc).interact(llIIlIIlI[llIIlIlIl[4]]);
                Time.sleepTicks(llIIlIlIl[0]);
                "".length();
            }
            if (lIlIlIllIIIl(an() ? 1 : 0) && lIlIlIllIIll(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()))) {
                if (lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dg), llIIlIlIl[4])) {
                    if (lIlIlIllIIIl(Inventory.contains(C0005f.aY) ? 1 : 0) && lIlIlIllIIll(Equipment.contains(C0005f.aY) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aY).interact(llIIlIIlI[llIIlIlIl[12]]);
                    }
                    if (lIlIlIllIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[5]];
                    Movement.walkTo(dg);
                    "".length();
                    Time.sleepTicks(llIIlIlIl[0]);
                    "".length();
                }
                if (lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dg), llIIlIlIl[4])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[18]];
                    dk = llIIlIlIl[1];
                    if (lIlIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[llIIlIlIl[0]];
                        strArr[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[16]];
                        TileObjects.getNearest(strArr).interact(llIIlIIlI[llIIlIlIl[19]]);
                        Time.sleepTicks(llIIlIlIl[3]);
                        "".length();
                    }
                    C0006g.a(cG);
                }
            }
            if (lIlIlIlllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[12])) {
                if (lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[14]];
                    Movement.walkTo(dh);
                    "".length();
                    Time.sleepTicks(llIIlIlIl[0]);
                    "".length();
                    if (lIlIlIllIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIlIlIl[20], llIIlIlIl[21], llIIlIlIl[1])) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[22]];
                        C0004e.c(new WorldPoint(llIIlIlIl[23], llIIlIlIl[24], llIIlIlIl[1]));
                        Time.sleepTicks(llIIlIlIl[5]);
                        "".length();
                    }
                }
                if (lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[25]];
                    C0006g.a(llIIlIIlI[llIIlIlIl[26]], cG, llIIlIlIl[0]);
                }
            }
            if (lIlIlIlllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[14])) {
                if (lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[27]];
                    Movement.walkTo(di);
                    "".length();
                    Time.sleepTicks(llIIlIlIl[0]);
                    "".length();
                }
                if (lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                    int[] iArr4 = new int[llIIlIlIl[0]];
                    iArr4[llIIlIlIl[1]] = llIIlIlIl[8];
                    if (lIlIlIllIIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIIlIlIl[0]];
                        iArr5[llIIlIlIl[1]] = llIIlIlIl[8];
                        Item first = Inventory.getFirst(iArr5);
                        String[] strArr2 = new String[llIIlIlIl[0]];
                        strArr2[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[28]];
                        first.useOn(TileObjects.getNearest(strArr2));
                        Time.sleepTicks(llIIlIlIl[3]);
                        "".length();
                    }
                }
            }
            if (lIlIlIlllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[28])) {
                int[] iArr6 = new int[llIIlIlIl[0]];
                iArr6[llIIlIlIl[1]] = llIIlIlIl[10];
                if (lIlIlIllIIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[llIIlIlIl[0]];
                    iArr7[llIIlIlIl[1]] = llIIlIlIl[10];
                    Inventory.getFirst(iArr7).interact(llIIlIIlI[llIIlIlIl[29]]);
                }
                if (lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                    String[] strArr3 = new String[llIIlIlIl[0]];
                    strArr3[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[30]];
                    TileObjects.getNearest(strArr3).interact(llIIlIIlI[llIIlIlIl[31]]);
                    Time.sleepTicks(llIIlIlIl[9]);
                    "".length();
                }
                if (lIlIlIllIllI(Players.getLocal().getLocalLocation().distanceTo(new LocalPoint(llIIlIlIl[32], llIIlIlIl[33])), llIIlIlIl[34])) {
                    String[] strArr4 = new String[llIIlIlIl[0]];
                    strArr4[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[35]];
                }
                String[] strArr5 = new String[llIIlIlIl[0]];
                strArr5[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[36]];
                if (lIlIlIllIlII(TileObjects.getNearest(strArr5))) {
                    if (lIlIlIllIllI(Players.getLocal().getLocalLocation().getY(), llIIlIlIl[37])) {
                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                        String[] strArr6 = new String[llIIlIlIl[0]];
                        strArr6[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[38]];
                        if (lIlIlIllIlll(worldLocation.distanceTo(TileObjects.getNearest(strArr6).getWorldLocation()), llIIlIlIl[14])) {
                            String[] strArr7 = new String[llIIlIlIl[0]];
                            strArr7[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[39]];
                            if (lIlIlIlllIIl(NPCs.getNearest(strArr7))) {
                                AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[40]];
                                String[] strArr8 = new String[llIIlIlIl[0]];
                                strArr8[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[41]];
                                TileObjects.getNearest(strArr8).interact(llIIlIIlI[llIIlIlIl[42]]);
                                Time.sleepTicks(llIIlIlIl[14]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr9 = new String[llIIlIlIl[0]];
                    strArr9[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[43]];
                    if (lIlIlIlllIIl(NPCs.getNearest(strArr9)) && lIlIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[44]];
                        String[] strArr10 = new String[llIIlIlIl[0]];
                        strArr10[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[45]];
                        TileObjects.getNearest(strArr10).interact(llIIlIIlI[llIIlIlIl[46]]);
                        Time.sleepTicks(llIIlIlIl[12]);
                        "".length();
                        C0006g.a(cG);
                    }
                    C0006g.a(cG);
                }
            }
            if (lIlIlIlllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[36])) {
                AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[47]];
                C0006g.a(llIIlIIlI[llIIlIlIl[48]], cG);
            }
            if (lIlIlIlllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[42])) {
                if (lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                    String[] strArr11 = new String[llIIlIlIl[0]];
                    strArr11[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[49]];
                    if (lIlIlIlllIIl(NPCs.getNearest(strArr11))) {
                        String[] strArr12 = new String[llIIlIlIl[0]];
                        strArr12[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[50]];
                        if (lIlIlIllIIll(Equipment.contains(strArr12) ? 1 : 0)) {
                            String[] strArr13 = new String[llIIlIlIl[0]];
                            strArr13[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[51]];
                            if (lIlIlIllIIIl(Inventory.contains(strArr13) ? 1 : 0)) {
                                String[] strArr14 = new String[llIIlIlIl[0]];
                                strArr14[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[52]];
                                Inventory.getFirst(strArr14).interact(llIIlIIlI[llIIlIlIl[53]]);
                            }
                        }
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[54]];
                        Movement.walkTo(di);
                        "".length();
                        Time.sleepTicks(llIIlIlIl[0]);
                        "".length();
                    }
                }
                if (lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(di), llIIlIlIl[4])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[55]];
                    String[] strArr15 = new String[llIIlIlIl[0]];
                    strArr15[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[56]];
                    if (lIlIlIllIlII(TileObjects.getNearest(strArr15))) {
                        String[] strArr16 = new String[llIIlIlIl[0]];
                        strArr16[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[57]];
                        TileObjects.getNearest(strArr16).interact(llIIlIIlI[llIIlIlIl[58]]);
                        Time.sleepTicks(llIIlIlIl[9]);
                        "".length();
                    }
                }
                if (lIlIlIllIllI(Players.getLocal().getLocalLocation().getY(), llIIlIlIl[37])) {
                    WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
                    String[] strArr17 = new String[llIIlIlIl[0]];
                    strArr17[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[59]];
                    if (lIlIlIllIllI(worldLocation2.distanceTo(TileObjects.getNearest(strArr17).getWorldLocation()), llIIlIlIl[18])) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[60]];
                        String[] strArr18 = new String[llIIlIlIl[0]];
                        strArr18[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[61]];
                        TileObjects.getNearest(strArr18).interact(llIIlIIlI[llIIlIlIl[62]]);
                        Time.sleepTicks(llIIlIlIl[14]);
                        "".length();
                    }
                }
                if (lIlIlIlllIIl(Players.getLocal().getInteracting()) && lIlIlIllIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr19 = new String[llIIlIlIl[0]];
                    strArr19[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[63]];
                    if (lIlIlIllIIll(Equipment.contains(strArr19) ? 1 : 0)) {
                        String[] strArr20 = new String[llIIlIlIl[0]];
                        strArr20[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[64]];
                        if (lIlIlIllIIIl(Inventory.contains(strArr20) ? 1 : 0)) {
                            String[] strArr21 = new String[llIIlIlIl[0]];
                            strArr21[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[65]];
                            Inventory.getFirst(strArr21).interact(llIIlIIlI[llIIlIlIl[66]]);
                        }
                    }
                    int[] iArr8 = new int[llIIlIlIl[0]];
                    iArr8[llIIlIlIl[1]] = llIIlIlIl[10];
                    if (lIlIlIllIIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[llIIlIlIl[0]];
                        iArr9[llIIlIlIl[1]] = llIIlIlIl[10];
                        if (lIlIlIllIIll(Equipment.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[llIIlIlIl[0]];
                            iArr10[llIIlIlIl[1]] = llIIlIlIl[10];
                            Inventory.getFirst(iArr10).interact(llIIlIIlI[llIIlIlIl[34]]);
                        }
                    }
                    String[] strArr22 = new String[llIIlIlIl[0]];
                    strArr22[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[67]];
                    NPCs.getNearest(strArr22).interact(llIIlIIlI[llIIlIlIl[68]]);
                    Time.sleepTicks(llIIlIlIl[0]);
                    "".length();
                }
                if (lIlIlIlllIlI(lIlIlIllIIII(C0004e.w(), 60.0d))) {
                    int[] iArr11 = new int[llIIlIlIl[0]];
                    iArr11[llIIlIlIl[1]] = llIIlIlIl[13];
                    if (lIlIlIllIIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[llIIlIlIl[0]];
                        iArr12[llIIlIlIl[1]] = llIIlIlIl[13];
                        Inventory.getFirst(iArr12).interact(llIIlIIlI[llIIlIlIl[69]]);
                        Time.sleepTicks(llIIlIlIl[0]);
                        "".length();
                    }
                }
                C0006g.a(cG);
            }
            if (lIlIlIlllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[47])) {
                String[] strArr23 = new String[llIIlIlIl[0]];
                strArr23[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[70]];
                if (lIlIlIllIIll(Inventory.contains(strArr23) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[71]];
                    String[] strArr24 = new String[llIIlIlIl[0]];
                    strArr24[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[72]];
                    TileObjects.getNearest(strArr24).interact(llIIlIIlI[llIIlIlIl[73]]);
                    Time.sleepTicks(llIIlIlIl[4]);
                    "".length();
                }
                String[] strArr25 = new String[llIIlIlIl[0]];
                strArr25[llIIlIlIl[1]] = llIIlIIlI[llIIlIlIl[74]];
                if (lIlIlIllIIIl(Inventory.contains(strArr25) ? 1 : 0)) {
                    if (lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[75]];
                        Movement.walkTo(dh);
                        "".length();
                        Time.sleepTicks(llIIlIlIl[0]);
                        "".length();
                        if (lIlIlIllIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIlIlIl[20], llIIlIlIl[21], llIIlIlIl[1])) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[76]];
                            C0004e.c(new WorldPoint(llIIlIlIl[23], llIIlIlIl[24], llIIlIlIl[1]));
                            Time.sleepTicks(llIIlIlIl[5]);
                            "".length();
                        }
                    }
                    if (lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dh), llIIlIlIl[4])) {
                        AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[77]];
                        C0006g.a(llIIlIIlI[llIIlIlIl[78]], cG, llIIlIlIl[0]);
                    }
                }
            }
            if (lIlIlIlllIII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[52])) {
                if (lIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(dj), llIIlIlIl[9])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[79]];
                    Movement.walkTo(dj);
                    "".length();
                    Time.sleepTicks(llIIlIlIl[0]);
                    "".length();
                }
                if (lIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(dj), llIIlIlIl[9])) {
                    AccBuilderGWD.c = llIIlIIlI[llIIlIlIl[80]];
                    if (lIlIlIllIIlI(dk, llIIlIlIl[0])) {
                        as.pw += llIIlIlIl[0];
                        as.u(AccBuilderGWD.m);
                        dk += llIIlIlIl[0];
                        as.pw = llIIlIlIl[1];
                        dl = llIIlIlIl[1];
                    }
                    C0006g.a(llIIlIIlI[llIIlIlIl[17]], cG);
                }
            }
        }
    }

    private static boolean lIlIlIllIlll(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIlIIlIIII(String lIlIllllIlIlll, String lIlIllllIlIllI) {
        String str = new String(Base64.getDecoder().decode(lIlIllllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIlIllllIlIlII = lIlIllllIlIllI.toCharArray();
        int lIlIllllIlIIll = llIIlIlIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIlIlIl[1];
        while (lIlIlIllIIlI(i, length)) {
            sb.append((char) (charArray[i] ^ lIlIllllIlIlII[lIlIllllIlIIll % lIlIllllIlIlII.length]));
            "".length();
            lIlIllllIlIIll++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            aX();
            "".length();
            if ("   ".length() <= 0) {
                return (37 ^ 71) & ((10 ^ 104) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIlIlIl[85];
    }

    private static boolean lIlIlIllIlIl(int i) {
        return i > 0;
    }

    private static boolean lIlIlIlllIll(int i) {
        return i <= 0;
    }

    private static void lIlIlIlIllll() {
        llIIlIlIl = new int[101];
        llIIlIlIl[0] = " ".length();
        llIIlIlIl[1] = ((73 ^ 27) ^ (74 ^ 78)) & (((118 ^ 82) ^ (59 ^ 73)) ^ (-" ".length()));
        llIIlIlIl[2] = (-24692) & 29691;
        llIIlIlIl[3] = "  ".length();
        llIIlIlIl[4] = 80 ^ 84;
        llIIlIlIl[5] = 173 ^ 171;
        llIIlIlIl[6] = (-(((49 + 84) - 125) + 137)) & (-33) & 8183;
        llIIlIlIl[7] = (-((-2433) & 27009)) & (-22) & 32605;
        llIIlIlIl[8] = (-((-12593) & 32054)) & (-65) & 20479;
        llIIlIlIl[9] = "   ".length();
        llIIlIlIl[10] = (-((-11543) & 16223)) & (-18561) & 24571;
        llIIlIlIl[11] = (-17451) & 30075;
        llIIlIlIl[12] = (((17 + 96) - 64) + 92) ^ (((118 + 36) - 101) + 83);
        llIIlIlIl[13] = (-24193) & 24571;
        llIIlIlIl[14] = 69 ^ 79;
        llIIlIlIl[15] = (-8231) & 16239;
        llIIlIlIl[16] = 35 ^ 43;
        llIIlIlIl[17] = (80 ^ 100) ^ (93 ^ 40);
        llIIlIlIl[18] = 93 ^ 90;
        llIIlIlIl[19] = (((84 + 118) - 70) + 74) ^ (((11 + 23) - (-132)) + 33);
        llIIlIlIl[20] = (-(157 ^ 143)) & (-4105) & 7163;
        llIIlIlIl[21] = (-((-30121) & 30653)) & (-12545) & 16381;
        llIIlIlIl[22] = 98 ^ 105;
        llIIlIlIl[23] = (-1) & 3039;
        llIIlIlIl[24] = (-25355) & 28651;
        llIIlIlIl[25] = 12 ^ 0;
        llIIlIlIl[26] = 74 ^ 71;
        llIIlIlIl[27] = 203 ^ 197;
        llIIlIlIl[28] = 127 ^ 112;
        llIIlIlIl[29] = (133 ^ 145) ^ (15 ^ 11);
        llIIlIlIl[30] = 20 ^ 5;
        llIIlIlIl[31] = (114 ^ 123) ^ (92 ^ 71);
        llIIlIlIl[32] = (-16540) & 23515;
        llIIlIlIl[33] = (-((-10753) & 11055)) & (-8722) & 15359;
        llIIlIlIl[34] = 137 ^ 187;
        llIIlIlIl[35] = 190 ^ 173;
        llIIlIlIl[36] = (((176 + 23) - 167) + 158) ^ (((164 + 115) - 244) + 135);
        llIIlIlIl[37] = (-((-31653) & 32679)) & (-24638) & 30719;
        llIIlIlIl[38] = (88 ^ 36) ^ (17 ^ 120);
        llIIlIlIl[39] = (9 ^ 43) ^ (118 ^ 66);
        llIIlIlIl[40] = " ".length() ^ (63 ^ 41);
        llIIlIlIl[41] = 78 ^ 86;
        llIIlIlIl[42] = (245 ^ 131) ^ (252 ^ 147);
        llIIlIlIl[43] = 168 ^ 178;
        llIIlIlIl[44] = 52 ^ 47;
        llIIlIlIl[45] = 22 ^ 10;
        llIIlIlIl[46] = (58 ^ 54) ^ (208 ^ 193);
        llIIlIlIl[47] = 181 ^ 171;
        llIIlIlIl[48] = (250 ^ 188) ^ (63 ^ 102);
        llIIlIlIl[49] = 146 ^ 178;
        llIIlIlIl[50] = (((35 + 146) - 87) + 57) ^ (((65 + 127) - 167) + 157);
        llIIlIlIl[51] = 85 ^ 119;
        llIIlIlIl[52] = 83 ^ 112;
        llIIlIlIl[53] = (145 ^ 175) ^ (179 ^ 169);
        llIIlIlIl[54] = 74 ^ 111;
        llIIlIlIl[55] = 169 ^ 143;
        llIIlIlIl[56] = 102 ^ 65;
        llIIlIlIl[57] = (((51 + 24) - 1) + 71) ^ (((155 + 87) - 137) + 80);
        llIIlIlIl[58] = 113 ^ 88;
        llIIlIlIl[59] = 136 ^ 162;
        llIIlIlIl[60] = 88 ^ 115;
        llIIlIlIl[61] = (((129 + 111) - 114) + 57) ^ (((120 + 148) - 114) + 1);
        llIIlIlIl[62] = (((27 + 123) - 135) + 128) ^ (((21 + 66) - (-20)) + 55);
        llIIlIlIl[63] = (182 ^ 176) ^ (183 ^ 159);
        llIIlIlIl[64] = (((51 + 11) - 42) + 131) ^ (((140 + 59) - 72) + 57);
        llIIlIlIl[65] = 179 ^ 131;
        llIIlIlIl[66] = 142 ^ 191;
        llIIlIlIl[67] = (100 ^ 71) ^ (87 ^ 71);
        llIIlIlIl[68] = 102 ^ 82;
        llIIlIlIl[69] = (((60 + 131) - 98) + 94) ^ (((72 + 110) - 181) + 141);
        llIIlIlIl[70] = 160 ^ 150;
        llIIlIlIl[71] = 190 ^ 137;
        llIIlIlIl[72] = 64 ^ 120;
        llIIlIlIl[73] = (((49 + 144) - 14) + 10) ^ (((0 + 97) - 14) + 49);
        llIIlIlIl[74] = (((123 + 41) - 89) + 52) ^ (207 ^ 138);
        llIIlIlIl[75] = (((75 + 128) - 94) + 58) ^ (((35 + 22) - (-24)) + 75);
        llIIlIlIl[76] = 124 ^ 64;
        llIIlIlIl[77] = 139 ^ 182;
        llIIlIlIl[78] = 249 ^ 199;
        llIIlIlIl[79] = (((163 + 19) - 166) + 175) ^ (((27 + 95) - 36) + 42);
        llIIlIlIl[80] = (168 ^ 167) ^ (218 ^ 149);
        llIIlIlIl[81] = (-((-324) & 23895)) & (-197) & 32767;
        llIIlIlIl[82] = (-26643) & 27542;
        llIIlIlIl[83] = (-20532) & 32511;
        llIIlIlIl[84] = (-((-1954) & 6131)) & (-3077) & 32253;
        llIIlIlIl[85] = (54 ^ 105) ^ (14 ^ 53);
        llIIlIlIl[86] = 238 ^ 172;
        llIIlIlIl[87] = 87 ^ 20;
        llIIlIlIl[88] = (-787) & 3871;
        llIIlIlIl[89] = (-12873) & 16123;
        llIIlIlIl[90] = (-((-573) & 26173)) & (-4) & 28639;
        llIIlIlIl[91] = (-((-8406) & 29687)) & (-1) & 24575;
        llIIlIlIl[92] = (-((-3417) & 16249)) & (-16386) & 32365;
        llIIlIlIl[93] = (-((-2839) & 31743)) & (-5) & 32255;
        llIIlIlIl[94] = (-8489) & 11579;
        llIIlIlIl[95] = (-((-12761) & 13307)) & (-16661) & 20471;
        llIIlIlIl[96] = 63 ^ 123;
        llIIlIlIl[97] = 10 ^ 79;
        llIIlIlIl[98] = (202 ^ 149) ^ (112 ^ 105);
        llIIlIlIl[99] = (((14 + 133) - 72) + 124) ^ (((62 + 95) - 121) + 92);
        llIIlIlIl[100] = (216 ^ 175) ^ (39 ^ 24);
    }

    private static boolean lIlIlIllIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIIlIlIl[1];
    }

    private static boolean lIlIlIlllIIl(Object obj) {
        return obj == null;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIIlIIlI[llIIlIlIl[86]];
    }

    private static void lIlIlIIllllI() {
        llIIlIIlI = new String[llIIlIlIl[100]];
        llIIlIIlI[llIIlIlIl[1]] = lIlIlIIlIIII("JwoKGDYJBgBRJxQaDR8iQQoQFCgST0QCMggXBxksDwREEyQCCEQFKkESERQ2FQ==", "acdqE");
        llIIlIIlI[llIIlIlIl[0]] = lIlIlIIlIIIl("OP1YKIkt+P3cI/gdnzzlTA==", "GaogV");
        llIIlIIlI[llIIlIlIl[3]] = lIlIlIIlIIIl("gUy7fLxEVmTyJgC/xqd2jyTO5DRAl7cU", "PPBVo");
        llIIlIIlI[llIIlIlIl[9]] = lIlIlIIlllII("VuG8brhbAPKBVt9d8HfrvXXie//FRjouyAEyCwauHFPBi0IBjRWJSE+ZibI9SNQyrpLmMFI4g9I=", "uFEpn");
        llIIlIIlI[llIIlIlIl[4]] = lIlIlIIlllII("e0MfCrDRiHc=", "CvPut");
        llIIlIIlI[llIIlIlIl[12]] = lIlIlIIlllII("gLIH8PcnRTU=", "zunrI");
        llIIlIIlI[llIIlIlIl[5]] = lIlIlIIlllII("emNGDLT5ZUvbLtNQjZ7iFQ==", "iUtQE");
        llIIlIIlI[llIIlIlIl[18]] = lIlIlIIlIIIl("GWIhBudwyb5Yr8hHK5vzuA==", "KelZf");
        llIIlIIlI[llIIlIlIl[16]] = lIlIlIIlIIIl("vakNSMnL1rYsZrj44O4fkw==", "vfGgq");
        llIIlIIlI[llIIlIlIl[19]] = lIlIlIIlllII("U4kuka5jPuw=", "FfFYL");
        llIIlIIlI[llIIlIlIl[14]] = lIlIlIIlIIII("OwQhYw4aRSQiCBQN", "ueWCz");
        llIIlIIlI[llIIlIlIl[22]] = lIlIlIIlllII("ws3EFbku57V+cJ69rM7tcsumFPglDd4g", "LXmXg");
        llIIlIIlI[llIIlIlIl[25]] = lIlIlIIlIIII("FhUcBissE1AeIzAVGA==", "BtpmB");
        llIIlIIlI[llIIlIlIl[26]] = lIlIlIIlIIII("ODckIzI=", "kVVBZ");
        llIIlIIlI[llIIlIlIl[27]] = lIlIlIIlIIII("Hy48ZTY+byIqLjQ=", "QOJEB");
        llIIlIIlI[llIIlIlIl[28]] = lIlIlIIlllII("iVEtXpV3ZyCtDTsuXAcFjg==", "CJXHq");
        llIIlIIlI[llIIlIlIl[29]] = lIlIlIIlIIII("EwgoBj0=", "DaMjY");
        llIIlIIlI[llIIlIlIl[30]] = lIlIlIIlllII("UGkKm3SYgx45TgkZOK/E2Q==", "FOVKV");
        llIIlIIlI[llIIlIlIl[31]] = lIlIlIIlIIIl("MXV7Cws4TlpWNeT2GJv7Ew==", "oDmRY");
        llIIlIIlI[llIIlIlIl[35]] = lIlIlIIlllII("DQCFkWq7PXC59558TuPOpw==", "yLhwc");
        llIIlIIlI[llIIlIlIl[36]] = lIlIlIIlllII("mCznT8iiMSveRQMyPaSDwQ==", "nGTRJ");
        llIIlIIlI[llIIlIlIl[38]] = lIlIlIIlIIII("KhUlBycJHi8=", "hyJdL");
        llIIlIIlI[llIIlIlIl[39]] = lIlIlIIlllII("+vmtBp74f5CnhjPtJIIzCQ==", "ZsNPJ");
        llIIlIIlI[llIIlIlIl[40]] = lIlIlIIlllII("KxBs+az/u4qsmsVloxn54cZR4Kq0g9rg", "VgGDO");
        llIIlIIlI[llIIlIlIl[41]] = lIlIlIIlIIII("BAYdBignDRc=", "FjreC");
        llIIlIIlI[llIIlIlIl[42]] = lIlIlIIlIIIl("ye7jDMeN7+Qu9yiLZ0zjDA==", "aKWWH");
        llIIlIIlI[llIIlIlIl[43]] = lIlIlIIlIIIl("f/uUOTgc3wTpQrUj2Xhvig==", "tjqsP");
        llIIlIIlI[llIIlIlIl[44]] = lIlIlIIlllII("J9eq5cL7D+nODsJKWXmfDQ==", "FkdvQ");
        llIIlIIlI[llIIlIlIl[45]] = lIlIlIIlIIIl("Ov+X9rMVSFyMEutDU4XWjg==", "Spwfz");
        llIIlIIlI[llIIlIlIl[46]] = lIlIlIIlllII("wJybS/kgQQKwzitwUotejg==", "yelPq");
        llIIlIIlI[llIIlIlIl[47]] = lIlIlIIlllII("hOz9InUrL+Oksg0SDxvHL5WXpOoI+Gkw", "LlBAy");
        llIIlIIlI[llIIlIlIl[48]] = lIlIlIIlIIIl("qnyfatcHfMc=", "HFeXG");
        llIIlIIlI[llIIlIlIl[49]] = lIlIlIIlllII("rbhmSjbeKBw=", "Mxjxp");
        llIIlIIlI[llIIlIlIl[50]] = lIlIlIIlIIIl("TVpa2dM7hZcWDETRWEbec8XGhjkHu442", "LMIWG");
        llIIlIIlI[llIIlIlIl[51]] = lIlIlIIlIIIl("lLoC1HewL4RirCrjoxH2F9u0NqrDDDYJ", "ucYtd");
        llIIlIIlI[llIIlIlIl[52]] = lIlIlIIlIIII("CgIOOiI3FQQxIHgACDMjNAIU", "XggTD");
        llIIlIIlI[llIIlIlIl[53]] = lIlIlIIlllII("r1ZvYiAyfW8=", "cBRbF");
        llIIlIIlI[llIIlIlIl[54]] = lIlIlIIlIIIl("n15i8hKxjhqw7X+IGNDZTQ==", "BmzvL");
        llIIlIIlI[llIIlIlIl[55]] = lIlIlIIlIIII("NAMICy9XCw4RI1cHDgoo", "woafM");
        llIIlIIlI[llIIlIlIl[56]] = lIlIlIIlIIII("PTknDj8JKHUHPgIo", "nMUoQ");
        llIIlIIlI[llIIlIlIl[57]] = lIlIlIIlIIII("Jh87KyMSDmkiIhkO", "ukIJM");
        llIIlIIlI[llIIlIlIl[58]] = lIlIlIIlllII("Uah2HxeLD//7a1spDozsnA==", "DrZVM");
        llIIlIIlI[llIIlIlIl[59]] = lIlIlIIlIIIl("yRVVR9m8wzYDLNxqxICn7g==", "ovenp");
        llIIlIIlI[llIIlIlIl[60]] = lIlIlIIlIIIl("G4iaIyzPwB5n76uJyhkrI+aN7N4TkuWT", "iTCTm");
        llIIlIIlI[llIIlIlIl[61]] = lIlIlIIlllII("akxGEqTby7Z6jQ6zDdMt8A==", "AfAOb");
        llIIlIIlI[llIIlIlIl[62]] = lIlIlIIlIIII("CyAjOAZlIzwwFg==", "HLJUd");
        llIIlIIlI[llIIlIlIl[63]] = lIlIlIIlllII("YGE+NcYZNYhgs9KqtZfvRAJHSbknM9V6", "yhxsh");
        llIIlIIlI[llIIlIlIl[64]] = lIlIlIIlIIII("ChIxLQk3BTsmC3gQNyQINBIr", "XwXCo");
        llIIlIIlI[llIIlIlIl[65]] = lIlIlIIlIIII("PyENJwwCNgcsDk0jCy4NASEX", "mDdIj");
        llIIlIIlI[llIIlIlIl[66]] = lIlIlIIlIIIl("xyk1qtqxytQ=", "dAMMa");
        llIIlIIlI[llIIlIlIl[34]] = lIlIlIIlllII("ZxQuHYD85ao=", "NHZYw");
        llIIlIIlI[llIIlIlIl[67]] = lIlIlIIlllII("bQC/Ytms+Zw=", "blmDD");
        llIIlIIlI[llIIlIlIl[68]] = lIlIlIIlIIIl("6ZYGFLcyLQc=", "XrrFD");
        llIIlIIlI[llIIlIlIl[69]] = lIlIlIIlIIII("NRk2", "pxBqe");
        llIIlIIlI[llIIlIlIl[70]] = lIlIlIIlllII("hym5CfxjbB1j8pI5KkGn/g==", "vAbZK");
        llIIlIIlI[llIIlIlIl[71]] = lIlIlIIlllII("umtL3sP+sQsSEEEwKXeEBw==", "PuBxF");
        llIIlIIlI[llIIlIlIl[72]] = lIlIlIIlllII("W5w5GvDm3FCZXbEq04YkaQ==", "zOMEp");
        llIIlIIlI[llIIlIlIl[73]] = lIlIlIIlIIIl("4S/OnRTM1mUUwzCJYDncww==", "tnERq");
        llIIlIIlI[llIIlIlIl[74]] = lIlIlIIlIIII("AQcbGDI9D04MNT0c", "RhnjZ");
        llIIlIIlI[llIIlIlIl[75]] = lIlIlIIlIIIl("I5LKrUgztXp/AVrA736tNA==", "SbwwY");
        llIIlIIlI[llIIlIlIl[76]] = lIlIlIIlIIII("HQ0/Dh1iWSkBHy0SIwMRbhY/GQ==", "NyJmv");
        llIIlIIlI[llIIlIlIl[77]] = lIlIlIIlIIII("PC0PMgYGK0MqDhotCw==", "hLcYo");
        llIIlIIlI[llIIlIlIl[78]] = lIlIlIIlIIII("CRslLzE=", "ZzWNY");
        llIIlIIlI[llIIlIlIl[79]] = lIlIlIIlIIII("PDgwYjEdeRUyNxs4", "rYFBE");
        llIIlIIlI[llIIlIlIl[80]] = lIlIlIIlIIII("ExsAChspHUwSAjUTDQ==", "Gzlar");
        llIIlIIlI[llIIlIlIl[17]] = lIlIlIIlIIIl("CypbFRz2tL4=", "zXPCJ");
        llIIlIIlI[llIIlIlIl[86]] = lIlIlIIlIIII("NG0ENigWKBgwNBBtGz96HCMAPCgQPgA=", "uMtYZ");
        llIIlIIlI[llIIlIlIl[87]] = lIlIlIIlIIII("JBAYEGg5H1YALTcVAh9ofg==", "VyvwH");
        llIIlIIlI[llIIlIlIl[96]] = lIlIlIIlIIIl("MkYxTjCsia4=", "nbfsy");
        llIIlIIlI[llIIlIlIl[97]] = lIlIlIIlIIII("OxE2BncOEjUYI08EMgh3DR8vAyMWXg==", "opZmW");
        llIIlIIlI[llIIlIlIl[98]] = lIlIlIIlIIII("HUIMEDw6CVgMPTUWXxQ5dAAdWDQ4DlgeOiZCFhcieg==", "TbxxU");
        llIIlIIlI[llIIlIlIl[99]] = lIlIlIIlIIII("Mgc6", "kbIaJ");
    }

    private static boolean lIlIlIlllIlI(int i) {
        return i < 0;
    }

    private static boolean lIlIlIlllIII(int i, int i2) {
        return i == i2;
    }

    private static int lIlIlIllIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIlIlIllllII(Vars.getBit(QuestVarbits.QUEST_A_PORCINE_OF_INTEREST.getId()), llIIlIlIl[57])) {
            ?? r0 = llIIlIlIl[0];
            "".length();
            return (-(51 ^ 55)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlIlIl[1];
    }

    private static String lIlIlIIlllII(String lIlIlllllIIlll, String lIlIlllllIIllI) {
        try {
            SecretKeySpec lIlIlllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlllllIIllI.getBytes(StandardCharsets.UTF_8)), llIIlIlIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIlIl[3], lIlIlllllIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllllIlIII) {
            lIlIlllllIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlIllIIll(int i) {
        return i == 0;
    }
}
