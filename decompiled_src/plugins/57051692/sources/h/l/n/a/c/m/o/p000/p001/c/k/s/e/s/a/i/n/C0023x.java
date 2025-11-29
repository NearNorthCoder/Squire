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
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.x  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/x.class */
public class C0023x implements K {
    static /* synthetic */ boolean dd;
    public static final /* synthetic */ WorldPoint dK;
    private static /* synthetic */ String[] lIllIIIlII;
    public static final /* synthetic */ WorldPoint dM;
    public static /* synthetic */ int dR;
    public static final /* synthetic */ WorldPoint dL;
    private static /* synthetic */ int[] lIllIIIllI;
    public static final /* synthetic */ WorldPoint dN;
    public static final /* synthetic */ WorldPoint dH;
    static /* synthetic */ ArrayList<Integer> dS;
    public static /* synthetic */ int dQ;
    public static final /* synthetic */ WorldPoint dO;
    public static final /* synthetic */ WorldPoint dJ;
    static /* synthetic */ int dc;
    static /* synthetic */ String[] cy;
    public static /* synthetic */ boolean bn;
    public static final /* synthetic */ WorldPoint dI;
    public static /* synthetic */ boolean dP;
    public static /* synthetic */ List<C0003d> bp;

    private static boolean lIIlIllIlIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0172, code lost:
        if (lIIlIllIlIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0023x.lIllIIIllI[15]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O() {
        int[] iArr;
        int[] iArr2 = new int[lIllIIIllI[0]];
        iArr2[lIllIIIllI[1]] = lIllIIIllI[14];
        if (lIIlIllIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIllI[14], lIllIIIllI[0], lIllIIIllI[142]));
            "".length();
        }
        int[] iArr3 = new int[lIllIIIllI[0]];
        iArr3[lIllIIIllI[1]] = lIllIIIllI[8];
        if (lIIlIllIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIllI[8], lIllIIIllI[0], lIllIIIllI[142]));
            "".length();
        }
        int[] iArr4 = new int[lIllIIIllI[0]];
        iArr4[lIllIIIllI[1]] = lIllIIIllI[11];
        if (lIIlIllIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIllI[11], lIllIIIllI[3], C0009j.bZ));
            "".length();
        }
        int[] iArr5 = new int[lIllIIIllI[0]];
        iArr5[lIllIIIllI[1]] = lIllIIIllI[12];
        if (lIIlIllIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIllI[12], lIllIIIllI[41], lIllIIIllI[143]));
            "".length();
        }
        int[] iArr6 = new int[lIllIIIllI[0]];
        iArr6[lIllIIIllI[1]] = lIllIIIllI[9];
        if (lIIlIllIIllll(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIllIIIllI[0]];
            iArr7[lIllIIIllI[1]] = lIllIIIllI[9];
            if (lIIlIllIIllll(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIllIIIllI[0]];
                iArr8[lIllIIIllI[1]] = lIllIIIllI[9];
            }
            if (lIIlIllIlIIIl(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIllIIIlII[lIllIIIllI[148]]);
            }) ? 1 : 0)) {
                bp.add(new C0003d(lIllIIIllI[144], lIllIIIllI[3], lIllIIIllI[145]));
                "".length();
            }
            iArr = new int[lIllIIIllI[0]];
            iArr[lIllIIIllI[1]] = lIllIIIllI[7];
            if (lIIlIllIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bp.add(new C0003d(lIllIIIllI[7], lIllIIIllI[51], lIllIIIllI[146]));
            "".length();
            return;
        }
        bp.add(new C0003d(lIllIIIllI[9], lIllIIIllI[15], lIllIIIllI[107]));
        "".length();
        if (lIIlIllIlIIIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIllIIIlII[lIllIIIllI[148]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIllIIIllI[0]];
        iArr[lIllIIIllI[1]] = lIllIIIllI[7];
        if (lIIlIllIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
    }

    private static boolean lIIlIllIlIlIl(int i) {
        return i < 0;
    }

    private static boolean lIIlIllIIllll(int i) {
        return i != 0;
    }

    private static String lIIlIlIllllII(String lllllllllllllllllllIIlIIllIIIllI, String lllllllllllllllllllIIlIIllIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllllllIIlIIllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), lIllIIIllI[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIllI[5], lllllllllllllllllllIIlIIllIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlIIllIIIlll) {
            lllllllllllllllllllIIlIIllIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIllIIIllI[1];
    }

    static {
        lIIlIllIIllIl();
        lIIlIllIIllII();
        dH = new WorldPoint(lIllIIIllI[149], lIllIIIllI[150], lIllIIIllI[1]);
        dI = new WorldPoint(lIllIIIllI[151], lIllIIIllI[152], lIllIIIllI[1]);
        dJ = new WorldPoint(lIllIIIllI[25], lIllIIIllI[153], lIllIIIllI[1]);
        dK = new WorldPoint(lIllIIIllI[154], lIllIIIllI[155], lIllIIIllI[1]);
        dL = new WorldPoint(lIllIIIllI[156], lIllIIIllI[152], lIllIIIllI[5]);
        dM = new WorldPoint(lIllIIIllI[157], lIllIIIllI[158], lIllIIIllI[1]);
        dN = new WorldPoint(lIllIIIllI[159], lIllIIIllI[160], lIllIIIllI[1]);
        dO = new WorldPoint(lIllIIIllI[161], lIllIIIllI[162], lIllIIIllI[1]);
        bp = new ArrayList();
        dQ = lIllIIIllI[163];
        dR = lIllIIIllI[164];
        String[] strArr = new String[lIllIIIllI[31]];
        strArr[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[165]];
        strArr[lIllIIIllI[0]] = lIllIIIlII[lIllIIIllI[166]];
        strArr[lIllIIIllI[5]] = lIllIIIlII[lIllIIIllI[167]];
        strArr[lIllIIIllI[10]] = lIllIIIlII[lIllIIIllI[168]];
        strArr[lIllIIIllI[6]] = lIllIIIlII[lIllIIIllI[169]];
        strArr[lIllIIIllI[3]] = lIllIIIlII[lIllIIIllI[170]];
        strArr[lIllIIIllI[16]] = lIllIIIlII[lIllIIIllI[171]];
        strArr[lIllIIIllI[17]] = lIllIIIlII[lIllIIIllI[172]];
        strArr[lIllIIIllI[18]] = lIllIIIlII[lIllIIIllI[173]];
        strArr[lIllIIIllI[19]] = lIllIIIlII[lIllIIIllI[174]];
        strArr[lIllIIIllI[13]] = lIllIIIlII[lIllIIIllI[175]];
        strArr[lIllIIIllI[20]] = lIllIIIlII[lIllIIIllI[176]];
        strArr[lIllIIIllI[21]] = lIllIIIlII[lIllIIIllI[177]];
        strArr[lIllIIIllI[22]] = lIllIIIlII[lIllIIIllI[178]];
        strArr[lIllIIIllI[23]] = lIllIIIlII[lIllIIIllI[179]];
        strArr[lIllIIIllI[24]] = lIllIIIlII[lIllIIIllI[180]];
        strArr[lIllIIIllI[27]] = lIllIIIlII[lIllIIIllI[181]];
        strArr[lIllIIIllI[28]] = lIllIIIlII[lIllIIIllI[182]];
        strArr[lIllIIIllI[29]] = lIllIIIlII[lIllIIIllI[183]];
        strArr[lIllIIIllI[30]] = lIllIIIlII[lIllIIIllI[184]];
        cy = strArr;
        dS = new ArrayList<>();
    }

    private static boolean lIIlIllIlIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean al() {
        String[] strArr = new String[lIllIIIllI[0]];
        strArr[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[141]];
        if (lIIlIllIlIlII(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIllIIIllI[0]];
            iArr[lIllIIIllI[1]] = lIllIIIllI[12];
            if (lIIlIllIlIlII(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[lIllIIIllI[0]];
                iArr2[lIllIIIllI[1]] = lIllIIIllI[7];
                if (lIIlIllIIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIllIIIllI[0]];
                    iArr3[lIllIIIllI[1]] = lIllIIIllI[9];
                    if (lIIlIllIIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = lIllIIIllI[0];
                        "".length();
                        return " ".length() <= 0 ? ((((12 + 104) - 41) + 59) ^ (((45 + 89) - 72) + 81)) & (((((153 + 1) - 36) + 43) ^ (((32 + 120) - 53) + 69)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return lIllIIIllI[1];
    }

    private static void bm() {
        if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[131]];
            WorldArea worldArea = new WorldArea(lIllIIIllI[93], lIllIIIllI[94], lIllIIIllI[60], lIllIIIllI[43], lIllIIIllI[1]);
            if (lIIlIllIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(lIllIIIllI[95], lIllIIIllI[96], lIllIIIllI[48], lIllIIIllI[63], lIllIIIllI[1]);
                if (lIIlIllIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                    "".length();
                    Time.sleepTicks(lIllIIIllI[0]);
                    "".length();
                }
                if (lIIlIllIIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                        Movement.walkTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                        "".length();
                        Time.sleepTicks(lIllIIIllI[0]);
                        "".length();
                    }
                    if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                        String[] strArr = new String[lIllIIIllI[0]];
                        strArr[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[2]];
                        TileObject nearest = TileObjects.getNearest(strArr);
                        if (lIIlIllIlIIll(nearest)) {
                            String[] strArr2 = new String[lIllIIIllI[0]];
                            strArr2[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[132]];
                            if (lIIlIllIIllll(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(lIllIIIlII[lIllIIIllI[133]]);
                                Time.sleepTicks(lIllIIIllI[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[lIllIIIllI[0]];
                            strArr3[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[134]];
                            if (lIIlIllIIllll(nearest.hasAction(strArr3) ? 1 : 0)) {
                                nearest.interact(lIllIIIlII[lIllIIIllI[135]]);
                                Time.sleepTicks(lIllIIIllI[10]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIIlIllIIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(dO);
                "".length();
                Time.sleepTicks(lIllIIIllI[0]);
                "".length();
            }
        }
    }

    private static boolean lIIlIllIlIlll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIllIlIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIllIllIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v563, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v797, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v819, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void bk() {
        if (lIIlIllIIllll(bn ? 1 : 0)) {
            C0001b.a(bp);
            if (lIIlIllIlIIII(bp.size(), lIllIIIllI[0])) {
                System.out.println(lIllIIIlII[lIllIIIllI[1]]);
                bn = lIllIIIllI[1];
            }
        }
        if (lIIlIllIlIIIl(bn ? 1 : 0)) {
            if (lIIlIllIlIIII(C0004e.j(lIllIIIllI[2]), lIllIIIllI[3])) {
                I.cJ();
            }
            if (lIIlIllIlIIIl(bp() ? 1 : 0) && lIIlIllIlIIII(C0004e.j(dQ), lIllIIIllI[0]) && lIIlIllIlIIlI(C0004e.j(lIllIIIllI[2]), lIllIIIllI[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIllIlIIll(nearest) && lIIlIllIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[0]];
                    C0000a.a(nearest);
                }
                if (lIIlIllIlIIll(nearest) && lIIlIllIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIIIllI[4]);
                        "".length();
                    }
                    if (lIIlIllIIllll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[5]];
                        if (lIIlIllIlIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllIIIllI[6]);
                            "".length();
                        }
                        if (lIIlIllIlIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllIIIllI[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIllIIIllI[3]];
                        iArr[lIllIIIllI[1]] = lIllIIIllI[7];
                        iArr[lIllIIIllI[0]] = lIllIIIllI[8];
                        iArr[lIllIIIllI[5]] = lIllIIIllI[9];
                        iArr[lIllIIIllI[10]] = lIllIIIllI[11];
                        iArr[lIllIIIllI[6]] = lIllIIIllI[12];
                        if (lIIlIllIlIIIl(C0004e.b(iArr) ? 1 : 0)) {
                            O();
                            System.out.println(lIllIIIlII[lIllIIIllI[10]]);
                            bn = lIllIIIllI[0];
                            return;
                        }
                        int[] iArr2 = new int[lIllIIIllI[3]];
                        iArr2[lIllIIIllI[1]] = lIllIIIllI[7];
                        iArr2[lIllIIIllI[0]] = lIllIIIllI[8];
                        iArr2[lIllIIIllI[5]] = lIllIIIllI[9];
                        iArr2[lIllIIIllI[10]] = lIllIIIllI[11];
                        iArr2[lIllIIIllI[6]] = lIllIIIllI[12];
                        if (lIIlIllIIllll(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIllIIIllI[7], lIllIIIllI[13]);
                            C0000a.a(lIllIIIllI[14], lIllIIIllI[0]);
                            C0000a.a(lIllIIIllI[8], lIllIIIllI[0]);
                            C0000a.a(lIllIIIllI[11], lIllIIIllI[6]);
                            C0000a.a(lIllIIIllI[12], lIllIIIllI[13]);
                        }
                    }
                }
            }
            if (lIIlIllIIllll(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIlIllIlIIII(Movement.getRunEnergy(), lIllIIIllI[15])) {
                Inventory.getFirst(C0005f.aU).interact(lIllIIIlII[lIllIIIllI[6]]);
                Time.sleepTicks(lIllIIIllI[0]);
                "".length();
            }
            int[] iArr3 = new int[lIllIIIllI[0]];
            iArr3[lIllIIIllI[1]] = lIllIIIllI[12];
            if (lIIlIllIIllll(Inventory.contains(iArr3) ? 1 : 0) && lIIlIllIlIlIl(lIIlIllIIlllI(C0004e.u(), 60.0d))) {
                int[] iArr4 = new int[lIllIIIllI[0]];
                iArr4[lIllIIIllI[1]] = lIllIIIllI[12];
                Inventory.getFirst(iArr4).interact(lIllIIIlII[lIllIIIllI[3]]);
                Time.sleepTicks(lIllIIIllI[0]);
                "".length();
            }
            if (lIIlIllIlIIII(C0004e.j(dQ), lIllIIIllI[0]) && lIIlIllIIllll(bp() ? 1 : 0)) {
                if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[16]];
                    if (lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(dH);
                    "".length();
                    Time.sleepTicks(lIllIIIllI[0]);
                    "".length();
                }
                if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[17]];
                    C0006g.a(lIllIIIlII[lIllIIIllI[18]], cy);
                }
            }
            if (lIIlIllIlIIlI(C0004e.j(dQ), lIllIIIllI[0])) {
                if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[19]];
                    Movement.walkTo(dI);
                    "".length();
                    Time.sleepTicks(lIllIIIllI[0]);
                    "".length();
                }
                if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[13]];
                    if (lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[lIllIIIllI[0]];
                        strArr[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[20]];
                        TileObjects.getNearest(strArr).interact(lIllIIIlII[lIllIIIllI[21]]);
                    }
                    C0006g.a(cy);
                }
            }
            if (lIIlIllIlIIlI(C0004e.j(dQ), lIllIIIllI[5])) {
                String[] strArr2 = new String[lIllIIIllI[0]];
                strArr2[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[22]];
                if (lIIlIllIllIII(NPCs.getNearest(strArr2))) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[23]];
                    String[] strArr3 = new String[lIllIIIllI[0]];
                    strArr3[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[24]];
                    TileObject nearest2 = TileObjects.getNearest(strArr3);
                    if (lIIlIllIlIIll(nearest2) && lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(nearest2), lIllIIIllI[6]) && lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                        C0006g.a(cy);
                    }
                    if (!lIIlIllIIllll(Dialog.isOpen() ? 1 : 0) || lIIlIllIlIllI(Players.getLocal().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[26], lIllIIIllI[1])), lIllIIIllI[3])) {
                        Movement.walkTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[26], lIllIIIllI[1]));
                        "".length();
                        Time.sleepTicks(lIllIIIllI[10]);
                        "".length();
                    }
                }
                if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[26], lIllIIIllI[1])), lIllIIIllI[3])) {
                    String[] strArr4 = new String[lIllIIIllI[0]];
                    strArr4[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[27]];
                    if (lIIlIllIllIII(NPCs.getNearest(strArr4))) {
                        String[] strArr5 = new String[lIllIIIllI[0]];
                        strArr5[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[28]];
                        TileObject nearest3 = TileObjects.getNearest(strArr5);
                        if (lIIlIllIlIIll(nearest3) && lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr6 = new String[lIllIIIllI[0]];
                            strArr6[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[29]];
                            if (lIIlIllIIllll(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                nearest3.interact(lIllIIIlII[lIllIIIllI[30]]);
                                Time.sleepTicks(lIllIIIllI[5]);
                                "".length();
                            }
                            String[] strArr7 = new String[lIllIIIllI[0]];
                            strArr7[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[31]];
                            if (lIIlIllIIllll(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                nearest3.interact(lIllIIIlII[lIllIIIllI[32]]);
                                Time.sleepTicks(lIllIIIllI[5]);
                                "".length();
                            }
                        }
                        C0006g.a(cy);
                    }
                }
                String[] strArr8 = new String[lIllIIIllI[0]];
                strArr8[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[33]];
                if (lIIlIllIlIIll(NPCs.getNearest(strArr8))) {
                    int[] iArr5 = new int[lIllIIIllI[0]];
                    iArr5[lIllIIIllI[1]] = lIllIIIllI[14];
                    if (lIIlIllIIllll(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIllIIIllI[0]];
                        iArr6[lIllIIIllI[1]] = lIllIIIllI[14];
                        if (lIIlIllIlIIIl(Equipment.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[lIllIIIllI[0]];
                            iArr7[lIllIIIllI[1]] = lIllIIIllI[14];
                            Inventory.getFirst(iArr7).interact(lIllIIIlII[lIllIIIllI[34]]);
                        }
                    }
                    if (lIIlIllIllIII(Players.getLocal().getInteracting())) {
                        String[] strArr9 = new String[lIllIIIllI[0]];
                        strArr9[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[35]];
                        NPCs.getNearest(strArr9).interact(lIllIIIlII[lIllIIIllI[36]]);
                        Time.sleepTicks(lIllIIIllI[5]);
                        "".length();
                    }
                }
            }
            if (lIIlIllIlIIlI(C0004e.j(dQ), lIllIIIllI[10])) {
                if (lIIlIllIlIIIl(dP ? 1 : 0)) {
                    if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                        String[] strArr10 = new String[lIllIIIllI[0]];
                        strArr10[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[37]];
                        if (lIIlIllIlIIll(TileObjects.getNearest(strArr10))) {
                            int[] iArr8 = new int[lIllIIIllI[0]];
                            iArr8[lIllIIIllI[1]] = lIllIIIllI[7];
                            if (lIIlIllIIllll(Inventory.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[lIllIIIllI[0]];
                                iArr9[lIllIIIllI[1]] = lIllIIIllI[7];
                                Inventory.getFirst(iArr9).interact(lIllIIIlII[lIllIIIllI[38]]);
                                Time.sleepTicks(lIllIIIllI[3]);
                                "".length();
                            }
                        }
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[39]];
                        Movement.walkTo(dI);
                        "".length();
                        Time.sleepTicks(lIllIIIllI[0]);
                        "".length();
                    }
                    if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[40]];
                        if (lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr11 = new String[lIllIIIllI[0]];
                            strArr11[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[41]];
                            TileObjects.getNearest(strArr11).interact(lIllIIIlII[lIllIIIllI[42]]);
                        }
                        C0006g.a(cy);
                        if (lIIlIllIIllll(Dialog.isOpen() ? 1 : 0) && lIIlIllIIllll(Dialog.getText().contains(lIllIIIlII[lIllIIIllI[43]]) ? 1 : 0)) {
                            dP = lIllIIIllI[0];
                        }
                    }
                }
                if (lIIlIllIIllll(dP ? 1 : 0)) {
                    if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[44]];
                        Movement.walkTo(dH);
                        "".length();
                        Time.sleepTicks(lIllIIIllI[0]);
                        "".length();
                    }
                    if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[45]];
                        C0006g.a(lIllIIIlII[lIllIIIllI[46]], cy);
                    }
                }
            }
            if (lIIlIllIlIIlI(C0004e.j(dQ), lIllIIIllI[6])) {
                dc = lIllIIIllI[1];
                if (lIIlIllIlIIIl(al() ? 1 : 0)) {
                    bo();
                }
                if (lIIlIllIIllll(al() ? 1 : 0)) {
                    if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[47]];
                        if (lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(dL);
                        "".length();
                        Time.sleepTicks(lIllIIIllI[0]);
                        "".length();
                    }
                    if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[48]];
                        if (lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr12 = new String[lIllIIIllI[0]];
                            strArr12[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[49]];
                            TileObjects.getNearest(strArr12).interact(lIllIIIlII[lIllIIIllI[50]]);
                        }
                        C0006g.a(cy);
                    }
                }
            }
            if (lIIlIllIlIIlI(C0004e.j(dQ), lIllIIIllI[3])) {
                String[] strArr13 = new String[lIllIIIllI[0]];
                strArr13[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[51]];
                if (lIIlIllIlIIIl(Inventory.contains(strArr13) ? 1 : 0)) {
                    String[] strArr14 = new String[lIllIIIllI[0]];
                    strArr14[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[52]];
                    if (lIIlIllIlIIIl(Inventory.contains(strArr14) ? 1 : 0)) {
                        if (!lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dM), lIllIIIllI[17]) || lIIlIllIIllll(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[53]];
                            Movement.walkTo(dM);
                            "".length();
                            Time.sleepTicks(lIllIIIllI[0]);
                            "".length();
                        }
                        if (!lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dM), lIllIIIllI[17]) || lIIlIllIlIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            if (lIIlIllIllIII(Players.getLocal().getInteracting())) {
                                int[] iArr10 = new int[lIllIIIllI[0]];
                                iArr10[lIllIIIllI[1]] = lIllIIIllI[54];
                                NPCs.getNearest(iArr10).interact(lIllIIIlII[lIllIIIllI[55]]);
                                Time.sleepTicks(lIllIIIllI[5]);
                                "".length();
                            }
                            String[] strArr15 = new String[lIllIIIllI[0]];
                            strArr15[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[56]];
                            TileItem nearest4 = TileItems.getNearest(strArr15);
                            if (lIIlIllIIllll(Inventory.isFull() ? 1 : 0)) {
                                int[] iArr11 = new int[lIllIIIllI[0]];
                                iArr11[lIllIIIllI[1]] = lIllIIIllI[12];
                                Inventory.getFirst(iArr11).interact(lIllIIIlII[lIllIIIllI[57]]);
                                Time.sleepTicks(lIllIIIllI[0]);
                                "".length();
                            }
                            if (lIIlIllIlIIll(nearest4)) {
                                nearest4.interact(lIllIIIlII[lIllIIIllI[58]]);
                                Time.sleepTicks(lIllIIIllI[5]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr16 = new String[lIllIIIllI[0]];
                strArr16[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[59]];
                if (lIIlIllIIllll(Inventory.contains(strArr16) ? 1 : 0)) {
                    if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dN), lIllIIIllI[13])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[60]];
                        Movement.walkTo(dN);
                        "".length();
                        Time.sleepTicks(lIllIIIllI[0]);
                        "".length();
                    }
                    if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dN), lIllIIIllI[13])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[61]];
                        bl();
                    }
                }
                String[] strArr17 = new String[lIllIIIllI[0]];
                strArr17[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[15]];
                if (lIIlIllIIllll(Inventory.contains(strArr17) ? 1 : 0)) {
                    String[] strArr18 = new String[lIllIIIllI[0]];
                    strArr18[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[62]];
                    if (lIIlIllIlIIIl(Inventory.contains(strArr18) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[63]];
                        String[] strArr19 = new String[lIllIIIllI[0]];
                        strArr19[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[64]];
                        Item first = Inventory.getFirst(strArr19);
                        int[] iArr12 = new int[lIllIIIllI[0]];
                        iArr12[lIllIIIllI[1]] = lIllIIIllI[65];
                        first.useOn(TileObjects.getNearest(iArr12));
                        Time.sleepTicks(lIllIIIllI[6]);
                        "".length();
                    }
                }
                String[] strArr20 = new String[lIllIIIllI[0]];
                strArr20[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[66]];
                if (lIIlIllIIllll(Inventory.contains(strArr20) ? 1 : 0)) {
                    String[] strArr21 = new String[lIllIIIllI[0]];
                    strArr21[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[67]];
                    if (lIIlIllIIllll(Inventory.contains(strArr21) ? 1 : 0)) {
                        if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[68]];
                            if (lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(dL);
                            "".length();
                            Time.sleepTicks(lIllIIIllI[0]);
                            "".length();
                        }
                        if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[69]];
                            String[] strArr22 = new String[lIllIIIllI[0]];
                            strArr22[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[70]];
                            Item first2 = Inventory.getFirst(strArr22);
                            String[] strArr23 = new String[lIllIIIllI[0]];
                            strArr23[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[71]];
                            first2.useOn(TileObjects.getNearest(strArr23));
                            Time.sleepTicks(lIllIIIllI[10]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIlIllIlIIlI(C0004e.j(dQ), lIllIIIllI[16])) {
                String[] strArr24 = new String[lIllIIIllI[0]];
                strArr24[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[72]];
                NPC nearest5 = NPCs.getNearest(strArr24);
                String[] strArr25 = new String[lIllIIIllI[0]];
                strArr25[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[73]];
                if (lIIlIllIlIIIl(Inventory.contains(strArr25) ? 1 : 0) && lIIlIllIlIIll(nearest5)) {
                    if (lIIlIllIIllll(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[74]];
                        C0006g.a(lIllIIIlII[lIllIIIllI[75]], cy);
                    }
                    if (lIIlIllIlIIIl(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[76]];
                        String[] strArr26 = new String[lIllIIIllI[0]];
                        strArr26[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[77]];
                        TileObjects.getNearest(strArr26).interact(lIllIIIlII[lIllIIIllI[78]]);
                        Time.sleepTicks(lIllIIIllI[5]);
                        "".length();
                    }
                }
                String[] strArr27 = new String[lIllIIIllI[0]];
                strArr27[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[79]];
                if (lIIlIllIIllll(Inventory.contains(strArr27) ? 1 : 0)) {
                    String[] strArr28 = new String[lIllIIIllI[0]];
                    strArr28[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[80]];
                    TileObject nearest6 = TileObjects.getNearest(strArr28);
                    if (lIIlIllIlIIll(nearest6)) {
                        if (lIIlIllIIllll(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[81]];
                            String[] strArr29 = new String[lIllIIIllI[0]];
                            strArr29[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[82]];
                            Inventory.getFirst(strArr29).useOn(nearest6);
                            Time.sleepTicks(lIllIIIllI[5]);
                            "".length();
                        }
                        if (lIIlIllIlIIIl(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[83]];
                            String[] strArr30 = new String[lIllIIIllI[0]];
                            strArr30[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[84]];
                            TileObjects.getNearest(strArr30).interact(lIllIIIlII[lIllIIIllI[85]]);
                            Time.sleepTicks(lIllIIIllI[5]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIlIllIlIIlI(C0004e.j(dQ), lIllIIIllI[17])) {
                String[] strArr31 = new String[lIllIIIllI[0]];
                strArr31[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[86]];
                NPC nearest7 = NPCs.getNearest(strArr31);
                if (lIIlIllIlIIll(nearest7)) {
                    if (lIIlIllIIllll(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[87]];
                        C0006g.a(lIllIIIlII[lIllIIIllI[88]], cy);
                    }
                    if (lIIlIllIlIIIl(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[89]];
                        String[] strArr32 = new String[lIllIIIllI[0]];
                        strArr32[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[90]];
                        TileObjects.getNearest(strArr32).interact(lIllIIIlII[lIllIIIllI[91]]);
                        Time.sleepTicks(lIllIIIllI[5]);
                        "".length();
                    }
                }
            }
            if (lIIlIllIlIIlI(C0004e.j(dQ), lIllIIIllI[18])) {
                if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[92]];
                    WorldArea worldArea = new WorldArea(lIllIIIllI[93], lIllIIIllI[94], lIllIIIllI[60], lIllIIIllI[43], lIllIIIllI[1]);
                    if (lIIlIllIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(lIllIIIllI[95], lIllIIIllI[96], lIllIIIllI[48], lIllIIIllI[63], lIllIIIllI[1]);
                        if (lIIlIllIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                            "".length();
                            Time.sleepTicks(lIllIIIllI[0]);
                            "".length();
                        }
                        if (lIIlIllIIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                Movement.walkTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                                "".length();
                                Time.sleepTicks(lIllIIIllI[0]);
                                "".length();
                            }
                            if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                String[] strArr33 = new String[lIllIIIllI[0]];
                                strArr33[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[98]];
                                TileObject nearest8 = TileObjects.getNearest(strArr33);
                                if (lIIlIllIlIIll(nearest8)) {
                                    String[] strArr34 = new String[lIllIIIllI[0]];
                                    strArr34[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[99]];
                                    if (lIIlIllIIllll(nearest8.hasAction(strArr34) ? 1 : 0)) {
                                        nearest8.interact(lIllIIIlII[lIllIIIllI[100]]);
                                        Time.sleepTicks(lIllIIIllI[10]);
                                        "".length();
                                    }
                                    String[] strArr35 = new String[lIllIIIllI[0]];
                                    strArr35[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[101]];
                                    if (lIIlIllIIllll(nearest8.hasAction(strArr35) ? 1 : 0)) {
                                        nearest8.interact(lIllIIIlII[lIllIIIllI[102]]);
                                        Time.sleepTicks(lIllIIIllI[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIIlIllIIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(dO);
                        "".length();
                        Time.sleepTicks(lIllIIIllI[0]);
                        "".length();
                    }
                }
                if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[103]];
                    C0006g.a(lIllIIIlII[lIllIIIllI[104]], cy);
                }
            }
            if (lIIlIllIllIIl(C0004e.j(dQ), lIllIIIllI[13]) && lIIlIllIlIIII(C0004e.j(dQ), lIllIIIllI[72])) {
                if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    String[] strArr36 = new String[lIllIIIllI[0]];
                    strArr36[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[105]];
                    if (lIIlIllIIllll(Inventory.contains(strArr36) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[106]];
                        if (lIIlIllIlIIII(dc, lIllIIIllI[0])) {
                            Z.lN += lIllIIIllI[0];
                            Z.p(AccBuilderShamans.m);
                            dc += lIllIIIllI[0];
                            Z.lN = lIllIIIllI[1];
                            dd = lIllIIIllI[1];
                        }
                        C0006g.a(lIllIIIlII[lIllIIIllI[107]], cy);
                    }
                }
                String[] strArr37 = new String[lIllIIIllI[0]];
                strArr37[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[108]];
                if (lIIlIllIlIIIl(Inventory.contains(strArr37) ? 1 : 0) && lIIlIllIlIIII(C0004e.j(dQ), lIllIIIllI[72])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[109]];
                    bn();
                }
                String[] strArr38 = new String[lIllIIIllI[0]];
                strArr38[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[110]];
                if (lIIlIllIIllll(Inventory.contains(strArr38) ? 1 : 0) && lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3]) && lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[111]];
                    WorldArea worldArea3 = new WorldArea(lIllIIIllI[93], lIllIIIllI[94], lIllIIIllI[60], lIllIIIllI[43], lIllIIIllI[1]);
                    if (lIIlIllIlIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea4 = new WorldArea(lIllIIIllI[95], lIllIIIllI[96], lIllIIIllI[48], lIllIIIllI[63], lIllIIIllI[1]);
                        if (lIIlIllIlIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                            "".length();
                            Time.sleepTicks(lIllIIIllI[0]);
                            "".length();
                        }
                        if (lIIlIllIIllll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                Movement.walkTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                                "".length();
                                Time.sleepTicks(lIllIIIllI[0]);
                                "".length();
                            }
                            if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                String[] strArr39 = new String[lIllIIIllI[0]];
                                strArr39[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[112]];
                                TileObject nearest9 = TileObjects.getNearest(strArr39);
                                if (lIIlIllIlIIll(nearest9)) {
                                    String[] strArr40 = new String[lIllIIIllI[0]];
                                    strArr40[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[113]];
                                    if (lIIlIllIIllll(nearest9.hasAction(strArr40) ? 1 : 0)) {
                                        nearest9.interact(lIllIIIlII[lIllIIIllI[114]]);
                                        Time.sleepTicks(lIllIIIllI[10]);
                                        "".length();
                                    }
                                    String[] strArr41 = new String[lIllIIIllI[0]];
                                    strArr41[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[115]];
                                    if (lIIlIllIIllll(nearest9.hasAction(strArr41) ? 1 : 0)) {
                                        nearest9.interact(lIllIIIlII[lIllIIIllI[116]]);
                                        Time.sleepTicks(lIllIIIllI[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIIlIllIIllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(dO);
                        "".length();
                        Time.sleepTicks(lIllIIIllI[0]);
                        "".length();
                    }
                }
            }
            if (lIIlIllIllIIl(C0004e.j(dQ), lIllIIIllI[72]) && lIIlIllIlIIII(C0004e.j(dR), lIllIIIllI[3])) {
                AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[117]];
                if (lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    bm();
                }
                if (lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    if (lIIlIllIlIIll(Widgets.get(lIllIIIllI[118], lIllIIIllI[27]))) {
                        Mouse.click(Widgets.get(lIllIIIllI[118], lIllIIIllI[27]).getClickPoint().getX(), Widgets.get(lIllIIIllI[118], lIllIIIllI[27]).getClickPoint().getY(), (boolean) lIllIIIllI[0]);
                        Time.sleepTicks(lIllIIIllI[10]);
                        "".length();
                    }
                    C0006g.a(lIllIIIlII[lIllIIIllI[119]], cy);
                    C0006g.a(cy);
                }
            }
            C0006g.a(cy);
        }
    }

    private static String lIIlIlIlllllI(String lllllllllllllllllllIIlIIllIlIIll, String lllllllllllllllllllIIlIIllIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllllllIIlIIllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIIllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIlIIllIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIlIIllIlIlIl.init(lIllIIIllI[5], lllllllllllllllllllIIlIIllIlIllI);
            return new String(lllllllllllllllllllIIlIIllIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlIIllIlIlII) {
            lllllllllllllllllllIIlIIllIlIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIllIIllII() {
        lIllIIIlII = new String[lIllIIIllI[185]];
        lIllIIIlII[lIllIIIllI[1]] = lIIlIlIllllII("yXcOqAmqWEgX3tqdf3Oug9iFYdGwVXbUAakx47dPhWn/1g5vpkMoC5p5+kHdoBvJ", "EmBOC");
        lIllIIIlII[lIllIIIllI[0]] = lIIlIlIllllIl("LSA6RjUMYS4HLwg=", "cALfA");
        lIllIIIlII[lIllIIIllI[5]] = lIIlIlIlllllI("VNR1vrayFPPB9t4o2uAAiZ2AbhmKag5u", "qyfhg");
        lIllIIIlII[lIllIIIllI[10]] = lIIlIlIllllIl("ASJUGRYzZxkRFyUuGh9EJzIRCxB2NAEIFDouEQtIdjQDERA1Lx0WA3YzG1gmAx49NiM=", "VGtxd");
        lIllIIIlII[lIllIIIllI[6]] = lIIlIlIllllII("kYKHNxgTGHs=", "GBygv");
        lIllIIIlII[lIllIIIllI[3]] = lIIlIlIllllII("mGHtqgssY6s=", "JvWLc");
        lIllIIIlII[lIllIIIllI[16]] = lIIlIlIllllII("3v1GutT6ItURnIW6a+RL/g==", "CkfVQ");
        lIllIIIlII[lIllIIIllI[17]] = lIIlIlIllllIl("PBooFy4GAC5FKxoLOhE=", "onIeZ");
        lIllIIIlII[lIllIIIllI[18]] = lIIlIlIllllIl("BCI4IFodJDcrHg==", "OKVGz");
        lIllIIIlII[lIllIIIllI[19]] = lIIlIlIllllII("BPHvEa/FS825Rs+Mn/G/InwMEhoLeddh", "vqFUO");
        lIllIIIlII[lIllIIIllI[13]] = lIIlIlIllllIl("KCUhEiAEOCEePAZrMRg9Ew==", "aKUwR");
        lIllIIIlII[lIllIIIllI[20]] = lIIlIlIllllIl("ACAiLDJsJT8kJQ==", "LAPKW");
        lIllIIIlII[lIllIIIllI[21]] = lIIlIlIllllIl("GCcHOA==", "WWbVC");
        lIllIIIlII[lIllIIIllI[22]] = lIIlIlIllllIl("IT0PEQoQeCUUBwc8CwAI", "uXbaf");
        lIllIIIlII[lIllIIIllI[23]] = lIIlIlIllllIl("HisbUAQ/agkfFzcl", "PJmpp");
        lIllIIIlII[lIllIIIllI[24]] = lIIlIlIllllIl("OTgyPQsCJSE=", "mJSMo");
        lIllIIIlII[lIllIIIllI[27]] = lIIlIlIllllII("x+obScj/HwG3oJYbwZTNYQ==", "wEgxt");
        lIllIIIlII[lIllIIIllI[28]] = lIIlIlIllllIl("ODgZGzQDJQo=", "lJxkP");
        lIllIIIlII[lIllIIIllI[29]] = lIIlIlIllllII("OCqooWN2FlA=", "ozVrS");
        lIllIIIlII[lIllIIIllI[30]] = lIIlIlIllllII("dDo1gLv+vnI=", "UNdWx");
        lIllIIIlII[lIllIIIllI[31]] = lIIlIlIlllllI("u8ojvrs2U5uKByhrmd7ShQ==", "zhqDj");
        lIllIIIlII[lIllIIIllI[32]] = lIIlIlIllllII("wjf63oT7aCyYXJBZa/M93w==", "mqIfh");
        lIllIIIlII[lIllIIIllI[33]] = lIIlIlIllllIl("MBQMPykBUSY6JBYVCC4r", "dqaOE");
        lIllIIIlII[lIllIIIllI[34]] = lIIlIlIlllllI("OrNoPgN6OIA=", "ZDaho");
        lIllIIIlII[lIllIIIllI[35]] = lIIlIlIllllII("8c8A737EhE/jylbf5p57dw==", "WARsG");
        lIllIIIlII[lIllIIIllI[36]] = lIIlIlIllllIl("AxkgLQ0p", "BmTLn");
        lIllIIIlII[lIllIIIllI[37]] = lIIlIlIllllII("09p3wrKnEi42F9YIWVSz1Q==", "FYKjc");
        lIllIIIlII[lIllIIIllI[38]] = lIIlIlIllllII("r7i46m6EPu4=", "YIbsB");
        lIllIIIlII[lIllIIIllI[39]] = lIIlIlIllllIl("Bxc8aT8mVj4sJjkaL2kvJhk4", "IvJIK");
        lIllIIIlII[lIllIIIllI[40]] = lIIlIlIllllIl("MTYhFR0ZOyEZAR94MR8ACg==", "xXUpo");
        lIllIIIlII[lIllIIIllI[41]] = lIIlIlIllllIl("CjEIMDNmNBU4JA==", "FPzWV");
        lIllIIIlII[lIllIIIllI[42]] = lIIlIlIllllII("jbUvB7Jbnoc=", "KIVgg");
        lIllIIIlII[lIllIIIllI[43]] = lIIlIlIllllII("W+zjjIIr/4tqql6kOeI0xg==", "BQEYQ");
        lIllIIIlII[lIllIIIllI[44]] = lIIlIlIlllllI("OHNKUod9YmBVaHY1EVSV0A==", "LYveE");
        lIllIIIlII[lIllIIIllI[45]] = lIIlIlIllllII("cQhwC+MQaczyX8Iu6XF7fA==", "upoyx");
        lIllIIIlII[lIllIIIllI[46]] = lIIlIlIlllllI("Z1g4WWIeSFoWVLzVLmI77w==", "ZPEHk");
        lIllIIIlII[lIllIIIllI[47]] = lIIlIlIlllllI("OvLCwOrwmNQ5hjzX7W4PuQ==", "LkCHe");
        lIllIIIlII[lIllIIIllI[48]] = lIIlIlIllllIl("CgAEKTomHQQlJiROFCMnMQ==", "CnpLH");
        lIllIIIlII[lIllIIIllI[49]] = lIIlIlIllllIl("MSovBnMWICwY", "rOCjS");
        lIllIIIlII[lIllIIIllI[50]] = lIIlIlIllllII("OPi6mGoWZNY=", "TLrGY");
        lIllIIIlII[lIllIIIllI[51]] = lIIlIlIllllIl("NBsVITUdVBIgKQ==", "styEP");
        lIllIIIlII[lIllIIIllI[52]] = lIIlIlIllllIl("HzspKGk9LD8=", "VIFFI");
        lIllIIIlII[lIllIIIllI[53]] = lIIlIlIlllllI("hrk6IPaoYK6C65OtsAvNTTiiWgsaZjYs", "RDNEb");
        lIllIIIlII[lIllIIIllI[55]] = lIIlIlIlllllI("REapjxREZmA=", "bRIJs");
        lIllIIIlII[lIllIIIllI[56]] = lIIlIlIlllllI("sZbIzvUgB2cnTqvzBzDzPg==", "XsLOP");
        lIllIIIlII[lIllIIIllI[57]] = lIIlIlIlllllI("dvA1qFIdsHM=", "gVLVl");
        lIllIIIlII[lIllIIIllI[58]] = lIIlIlIlllllI("jPmkYLN/KUE=", "fHTAr");
        lIllIIIlII[lIllIIIllI[59]] = lIIlIlIllllIl("EQ4tKAE4QSopHQ==", "VaALd");
        lIllIIIlII[lIllIIIllI[60]] = lIIlIlIllllII("twDDKork3DV7GmnSzhle8Q==", "OAlxL");
        lIllIIIlII[lIllIIIllI[61]] = lIIlIlIllllII("yDmT0EXJ/KDsIY1ILDEq2w==", "KhrOD");
        lIllIIIlII[lIllIIIllI[15]] = lIIlIlIllllIl("Cj8fB3IoKAk=", "CMpiR");
        lIllIIIlII[lIllIIIllI[62]] = lIIlIlIlllllI("0eRHnEAFl8/u9GXQw7ujQw==", "nYFPd");
        lIllIIIlII[lIllIIIllI[63]] = lIIlIlIllllIl("MwQnPgsaBnM9AwAEIQ==", "taSJb");
        lIllIIIlII[lIllIIIllI[64]] = lIIlIlIllllII("uutIpEq+H2k=", "UoCDD");
        lIllIIIlII[lIllIIIllI[66]] = lIIlIlIllllIl("AxkYKE0hDg4=", "JkwFm");
        lIllIIIlII[lIllIIIllI[67]] = lIIlIlIllllII("yXRlONv10q608wY0Jt9X3A==", "stwHP");
        lIllIIIlII[lIllIIIllI[68]] = lIIlIlIllllII("tkZJ3BIdLii1Rh7reSeuVw==", "BUJSj");
        lIllIIIlII[lIllIIIllI[69]] = lIIlIlIlllllI("/rA97f4V7MYdvoPAJd+++41rcCoVruTx", "CkZof");
        lIllIIIlII[lIllIIIllI[70]] = lIIlIlIllllII("qCgBNkcmhyl0KHf2iA1xCA==", "hxbXk");
        lIllIIIlII[lIllIIIllI[71]] = lIIlIlIllllIl("OwMOGkwcCQ0E", "xfbvl");
        lIllIIIlII[lIllIIIllI[72]] = lIIlIlIllllII("91foRZKwxwA=", "ouOCk");
        lIllIIIlII[lIllIIIllI[73]] = lIIlIlIllllIl("FgEMJgQxCUkiFiAIGw==", "TmiUw");
        lIllIIIlII[lIllIIIllI[74]] = lIIlIlIllllIl("PAsNLzQdBARrOxwLFw==", "tjcKX");
        lIllIIIlII[lIllIIIllI[75]] = lIIlIlIlllllI("CJ8N3gavFqI=", "jjZtc");
        lIllIIIlII[lIllIIIllI[76]] = lIIlIlIllllII("R6Hw5GVR4uFPMSk8FWMaLw==", "YsoPH");
        lIllIIIlII[lIllIIIllI[77]] = lIIlIlIllllIl("EywaAEw0Jhke", "PIvll");
        lIllIIIlII[lIllIIIllI[78]] = lIIlIlIllllIl("LjMgAQ==", "aCEoj");
        lIllIIIlII[lIllIIIllI[79]] = lIIlIlIllllII("DfCINbNEfEtAmqFETJSZqg==", "zpRwo");
        lIllIIIlII[lIllIIIllI[80]] = lIIlIlIllllIl("KRwzIxkE", "jsUEp");
        lIllIIIlII[lIllIIIllI[81]] = lIIlIlIllllII("5xo+WocC+SFAwdMP3jUv7/5rdEh0bO58", "dZigJ");
        lIllIIIlII[lIllIIIllI[82]] = lIIlIlIllllIl("CgMwPgotC3U6GDwKJw==", "HoUMy");
        lIllIIIlII[lIllIIIllI[83]] = lIIlIlIllllII("Dz+CNvVwDHLanwjlvKaykQ==", "jdNjw");
        lIllIIIlII[lIllIIIllI[84]] = lIIlIlIlllllI("7e7NEKQ3eq02lMG7ANLeNA==", "KPmTT");
        lIllIIIlII[lIllIIIllI[85]] = lIIlIlIllllII("GkGwkKR6rcc=", "frwsX");
        lIllIIIlII[lIllIIIllI[86]] = lIIlIlIllllII("hKxMSeZcvI0=", "XeWCD");
        lIllIIIlII[lIllIIIllI[87]] = lIIlIlIlllllI("VLiI6wApEFdrtD0cQNppZg==", "pAPBi");
        lIllIIIlII[lIllIIIllI[88]] = lIIlIlIllllIl("ISMqCz0J", "eQOqX");
        lIllIIIlII[lIllIIIllI[89]] = lIIlIlIlllllI("dB0EnVmGQtwlP79yRxfG0A==", "mQISH");
        lIllIIIlII[lIllIIIllI[90]] = lIIlIlIllllII("HviM9Ftt3xXk+TNR3jJsag==", "MWxRD");
        lIllIIIlII[lIllIIIllI[91]] = lIIlIlIllllII("fiOh6CVJyN0=", "uheXU");
        lIllIIIlII[lIllIIIllI[92]] = lIIlIlIlllllI("NHa5VdP+x2/qS3yDHVOsqXIBo2MKO2Jn", "tixQh");
        lIllIIIlII[lIllIIIllI[98]] = lIIlIlIllllIl("IzoPARwYJxw=", "wHnqx");
        lIllIIIlII[lIllIIIllI[99]] = lIIlIlIlllllI("hFWq2vtN3Qo=", "Yqhcn");
        lIllIIIlII[lIllIIIllI[100]] = lIIlIlIlllllI("NaQvtTLcYmk=", "dqbuz");
        lIllIIIlII[lIllIIIllI[101]] = lIIlIlIllllII("onCq62Mlv8IVQ2sWg4+Rog==", "RXXjw");
        lIllIIIlII[lIllIIIllI[102]] = lIIlIlIllllIl("NiY/JixYLjk8IA==", "uJVKN");
        lIllIIIlII[lIllIIIllI[103]] = lIIlIlIllllIl("MSkiFSUQJitRKhEpOA==", "yHLqI");
        lIllIIIlII[lIllIIIllI[104]] = lIIlIlIlllllI("SLBq95HEQuc=", "xIoTV");
        lIllIIIlII[lIllIIIllI[105]] = lIIlIlIlllllI("KNwh3msWagrz5g28Mq2Ong==", "TGSXe");
        lIllIIIlII[lIllIIIllI[106]] = lIIlIlIlllllI("NPE5rAnep8tFwuKJpmp8jA==", "HmiFS");
        lIllIIIlII[lIllIIIllI[107]] = lIIlIlIllllII("v2OpX7z8Ni0=", "zsFjZ");
        lIllIIIlII[lIllIIIllI[108]] = lIIlIlIllllII("9hY3B1wjCH/rSF3fEwwUxQ==", "bfKgR");
        lIllIIIlII[lIllIIIllI[109]] = lIIlIlIlllllI("BOFcJ+iks1qDAL3zbIHbE9StqUUwWKdY", "TkUSD");
        lIllIIIlII[lIllIIIllI[110]] = lIIlIlIlllllI("EkNUIARI2gpzV7c90wi24w==", "WqXLl");
        lIllIIIlII[lIllIIIllI[111]] = lIIlIlIllllIl("AgMuTyAjQj4GOi0OeBs9IAc=", "LbXoT");
        lIllIIIlII[lIllIIIllI[112]] = lIIlIlIllllII("b1TYxeU2dUnS82THmS3MTA==", "RnvBf");
        lIllIIIlII[lIllIIIllI[113]] = lIIlIlIllllIl("PRMRHw==", "rctqs");
        lIllIIIlII[lIllIIIllI[114]] = lIIlIlIllllIl("NjogLw==", "yJEAS");
        lIllIIIlII[lIllIIIllI[115]] = lIIlIlIlllllI("krZuCqHgeWXqtSAUZpVtuQ==", "wpSzO");
        lIllIIIlII[lIllIIIllI[116]] = lIIlIlIllllIl("FiIYFRF4Kh4PHQ==", "UNqxs");
        lIllIIIlII[lIllIIIllI[117]] = lIIlIlIllllII("mZC0KG6QrYKEZ0BZjhb9ncyylmfJ6LAEQX7+A8e/TFI7nrIS9XWuBg==", "DaIdJ");
        lIllIIIlII[lIllIIIllI[119]] = lIIlIlIllllIl("FDYtHyo8", "PDHeO");
        lIllIIIlII[lIllIIIllI[127]] = lIIlIlIllllIl("CjE5BkYoJi8=", "CCVhf");
        lIllIIIlII[lIllIIIllI[128]] = lIIlIlIllllIl("NS0eLBYcYhktCg==", "rBrHs");
        lIllIIIlII[lIllIIIllI[129]] = lIIlIlIllllII("1eGPJ/iFIxaQQ+0JhX3g8g==", "RqRgF");
        lIllIIIlII[lIllIIIllI[130]] = lIIlIlIllllII("V6qvI6Ho3uJhDuavzucnGA==", "XQdoQ");
        lIllIIIlII[lIllIIIllI[131]] = lIIlIlIllllII("kfBWwPJaQhNW4WhbrnmV82EYhkh20408", "aRzVV");
        lIllIIIlII[lIllIIIllI[2]] = lIIlIlIllllIl("IjkKCDwZJBk=", "vKkxX");
        lIllIIIlII[lIllIIIllI[132]] = lIIlIlIllllIl("LjMJBA==", "aCljj");
        lIllIIIlII[lIllIIIllI[133]] = lIIlIlIllllII("7bXJ6UQ29t0=", "oQltc");
        lIllIIIlII[lIllIIIllI[134]] = lIIlIlIlllllI("YOmjljGZx2rUA0kBBgAu4w==", "EjDFi");
        lIllIIIlII[lIllIIIllI[135]] = lIIlIlIllllIl("FSgqPBJ7ICwmHg==", "VDCQp");
        lIllIIIlII[lIllIIIllI[136]] = lIIlIlIllllIl("PgUaUDMfRA4RKRs=", "pdlpG");
        lIllIIIlII[lIllIIIllI[137]] = lIIlIlIlllllI("ynJ1jp1E+t1EoWuebQLwnDVA9Ka1w+Mp", "lruti");
        lIllIIIlII[lIllIIIllI[138]] = lIIlIlIlllllI("9kxSF0iCPlPyxq1kJREtnQ==", "btYpI");
        lIllIIIlII[lIllIIIllI[139]] = lIIlIlIllllII("oseyQM18UWA4Cp78jW5aNvGMJZUHZ7f4", "jxhfZ");
        lIllIIIlII[lIllIIIllI[140]] = lIIlIlIllllII("tfUztS5L/gE=", "CflNN");
        lIllIIIlII[lIllIIIllI[141]] = lIIlIlIllllII("jbQ7qscbKDg=", "faKEE");
        lIllIIIlII[lIllIIIllI[147]] = lIIlIlIllllII("LGVac+XBoU9HjV61z/j7cg==", "OQgAC");
        lIllIIIlII[lIllIIIllI[148]] = lIIlIlIllllII("jz88oK6O2iQ+NxK1hK1xjJNAw0kz54ZF", "aXrJB");
        lIllIIIlII[lIllIIIllI[165]] = lIIlIlIllllII("LSjsMrA7niSvp+3dxRldOB0kOfDxdLcSA0jZ7MOWWYw=", "sQmmv");
        lIllIIIlII[lIllIIIllI[166]] = lIIlIlIlllllI("JUPHQMEDu/o=", "QNpVJ");
        lIllIIIlII[lIllIIIllI[167]] = lIIlIlIllllII("6yMjhf/ekAUf+powDwuf84reW2B1+i/9", "addIR");
        lIllIIIlII[lIllIIIllI[168]] = lIIlIlIllllIl("DCMfeng7KRh2LDAqA3Y1MGYYPjkhZhs+PXU2HTk6OSMCdjEmaA==", "UFoVX");
        lIllIIIlII[lIllIIIllI[169]] = lIIlIlIlllllI("VSAkfrTElvQ=", "suASy");
        lIllIIIlII[lIllIIIllI[170]] = lIIlIlIlllllI("+gE/XYaCr3Ey2xhuZA2X1vq6A7BsL2LE", "mhWLY");
        lIllIIIlII[lIllIIIllI[171]] = lIIlIlIllllII("bMBdz7uTlBh6TxAuBgKtLhDVmTmY1TMzEokRcxslN4AA44RhfyDu3FQIr+oIbDNIeAAJhuWIzqA=", "BVMgO");
        lIllIIIlII[lIllIIIllI[172]] = lIIlIlIllllII("JrFcES2hiUD/vuuLAzRtgaFhCS6ynYhlo1bMw2TOI8bTEjGluZ4XYEZLMJwc3jDy", "UzTag");
        lIllIIIlII[lIllIIIllI[173]] = lIIlIlIllllII("Ya5u81Yy6eWx8JzUK5wWJhMB4AG9/DhO9XYqxZcSEsE=", "emQiT");
        lIllIIIlII[lIllIIIllI[174]] = lIIlIlIllllII("AhwY+zgTUlEIISVjMh/HkQ==", "aeIDv");
        lIllIIIlII[lIllIIIllI[175]] = lIIlIlIllllII("evsqvFOANn8/gOS5mESoXQ==", "YedTs");
        lIllIIIlII[lIllIIIllI[176]] = lIIlIlIllllII("WE9qsxdMltO9KpbBknbPgw==", "beOkG");
        lIllIIIlII[lIllIIIllI[177]] = lIIlIlIllllIl("EEoxMRo3AWUQVC8PZSocNRwgPVMtAiB5AywQPzUWeA==", "YjEYs");
        lIllIIIlII[lIllIIIllI[178]] = lIIlIlIllllIl("OSkGdgYQKFEfRRkjHSZa", "qFqVe");
        lIllIIIlII[lIllIIIllI[179]] = lIIlIlIlllllI("IfkMtbeJoqjGnynd29uI+DiE6A1iBjp0M5j6LRI1xHwBJPtG3Qs8xg==", "vknPF");
        lIllIIIlII[lIllIIIllI[180]] = lIIlIlIllllIl("IzE4cgsHeTU6B1QrKCQHBnkyJwEceSByBRs2JXIGET8kPAERZg==", "tYARb");
        lIllIIIlII[lIllIIIllI[181]] = lIIlIlIlllllI("+tEkF6sTuahOTpiXYEOY5Ex7wOK6sCKu", "ibKIO");
        lIllIIIlII[lIllIIIllI[182]] = lIIlIlIlllllI("6lGjxKGu/PRYMXm/qwDCHw==", "dnPpl");
        lIllIIIlII[lIllIIIllI[183]] = lIIlIlIlllllI("dfbz91Y33rmqbdAylaU31K01JAQ3tR5V399nKxQZ4kKXKgXK8SeoJ7DZjHkUZZ2q", "fciVy");
        lIllIIIlII[lIllIIIllI[184]] = lIIlIlIllllII("ay2BGw+bfYqtVhYsKiqnJvr9H9DuwICqdcdxV9e7pIRm6ZoWcpypnuRv9N6k771/", "vLQsU");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIllIllIIl(C0004e.j(dQ), lIllIIIllI[72]) && lIIlIllIllIIl(C0004e.j(dR), lIllIIIllI[3])) {
            ?? r0 = lIllIIIllI[0];
            "".length();
            return (100 ^ 96) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIIllI[1];
    }

    private static String lIIlIlIllllIl(String lllllllllllllllllllIIlIIlIllIllI, String lllllllllllllllllllIIlIIlIllIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIIlIIlIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIlIIlIllIlII = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIlIIlIllIlIl.toCharArray();
        int lllllllllllllllllllIIlIIlIllIIlI = lIllIIIllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIllI[1];
        while (lIIlIllIlIIII(i, length)) {
            char lllllllllllllllllllIIlIIlIllIlll = charArray2[i];
            lllllllllllllllllllIIlIIlIllIlII.append((char) (lllllllllllllllllllIIlIIlIllIlll ^ charArray[lllllllllllllllllllIIlIIlIllIIlI % charArray.length]));
            "".length();
            lllllllllllllllllllIIlIIlIllIIlI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllIIlIIlIllIlII);
    }

    private static void lIIlIllIIllIl() {
        lIllIIIllI = new int[186];
        lIllIIIllI[0] = " ".length();
        lIllIIIllI[1] = ((((155 + 143) - 241) + 187) ^ (((17 + 160) - 36) + 33)) & ((" ".length() ^ (43 ^ 112)) ^ (-" ".length()));
        lIllIIIllI[2] = 102 ^ 13;
        lIllIIIllI[3] = 199 ^ 194;
        lIllIIIllI[4] = (-16386) & 21385;
        lIllIIIllI[5] = "  ".length();
        lIllIIIllI[6] = (((113 + 35) - 24) + 41) ^ (((66 + 16) - (-2)) + 77);
        lIllIIIllI[7] = (-((-5957) & 22501)) & (-8201) & 32751;
        lIllIIIllI[8] = (-((-1905) & 28529)) & (-4201) & 32749;
        lIllIIIllI[9] = (-((-7947) & 24447)) & (-139) & 24574;
        lIllIIIllI[10] = "   ".length();
        lIllIIIllI[11] = (-((-8785) & 10835)) & (-16905) & 31579;
        lIllIIIllI[12] = (-((-4475) & 32127)) & (-129) & 28159;
        lIllIIIllI[13] = 174 ^ 164;
        lIllIIIllI[14] = (-29321) & 30651;
        lIllIIIllI[15] = 19 ^ 33;
        lIllIIIllI[16] = (((80 + 142) - 102) + 79) ^ (((180 + 143) - 130) + 0);
        lIllIIIllI[17] = 129 ^ 134;
        lIllIIIllI[18] = 8 ^ 0;
        lIllIIIllI[19] = (79 ^ 45) ^ (206 ^ 165);
        lIllIIIllI[20] = 87 ^ 92;
        lIllIIIllI[21] = 201 ^ 197;
        lIllIIIllI[22] = (((29 + 91) - 57) + 64) ^ (240 ^ 130);
        lIllIIIllI[23] = 68 ^ 74;
        lIllIIIllI[24] = 17 ^ 30;
        lIllIIIllI[25] = (-4257) & 7661;
        lIllIIIllI[26] = (-12366) & 15871;
        lIllIIIllI[27] = 53 ^ 37;
        lIllIIIllI[28] = 33 ^ 48;
        lIllIIIllI[29] = 43 ^ 57;
        lIllIIIllI[30] = 5 ^ 22;
        lIllIIIllI[31] = 122 ^ 110;
        lIllIIIllI[32] = (((5 + 93) - 15) + 62) ^ (((55 + 66) - 105) + 116);
        lIllIIIllI[33] = (71 ^ 46) ^ (((123 + 122) - 149) + 31);
        lIllIIIllI[34] = (125 ^ 58) ^ (79 ^ 31);
        lIllIIIllI[35] = 14 ^ 22;
        lIllIIIllI[36] = (185 ^ 129) ^ (68 ^ 101);
        lIllIIIllI[37] = 180 ^ 174;
        lIllIIIllI[38] = (87 ^ 72) ^ (40 ^ 44);
        lIllIIIllI[39] = 18 ^ 14;
        lIllIIIllI[40] = (((125 + 84) - 143) + 64) ^ (((43 + 90) - 66) + 92);
        lIllIIIllI[41] = (200 ^ 161) ^ (213 ^ 162);
        lIllIIIllI[42] = 89 ^ 70;
        lIllIIIllI[43] = (125 ^ 22) ^ (103 ^ 44);
        lIllIIIllI[44] = 123 ^ 90;
        lIllIIIllI[45] = 86 ^ 116;
        lIllIIIllI[46] = (70 ^ 95) ^ (27 ^ 33);
        lIllIIIllI[47] = 65 ^ 101;
        lIllIIIllI[48] = 174 ^ 139;
        lIllIIIllI[49] = (((129 + 34) - 139) + 130) ^ (((88 + 86) - 27) + 41);
        lIllIIIllI[50] = 139 ^ 172;
        lIllIIIllI[51] = (((179 + 159) - 200) + 99) ^ (((101 + 104) - 134) + 126);
        lIllIIIllI[52] = 64 ^ 105;
        lIllIIIllI[53] = (((57 + 131) - 119) + 64) ^ (((73 + 81) - 17) + 38);
        lIllIIIllI[54] = (-((-18627) & 23267)) & (-24642) & 32767;
        lIllIIIllI[55] = 29 ^ 54;
        lIllIIIllI[56] = (156 ^ 178) ^ "  ".length();
        lIllIIIllI[57] = (57 ^ 0) ^ (75 ^ 95);
        lIllIIIllI[58] = (112 ^ 7) ^ (237 ^ 180);
        lIllIIIllI[59] = 91 ^ 116;
        lIllIIIllI[60] = 158 ^ 174;
        lIllIIIllI[61] = 152 ^ 169;
        lIllIIIllI[62] = 22 ^ 37;
        lIllIIIllI[63] = 77 ^ 121;
        lIllIIIllI[64] = (102 ^ 46) ^ (63 ^ 66);
        lIllIIIllI[65] = (-((-283) & 29051)) & (-515) & 32767;
        lIllIIIllI[66] = (190 ^ 165) ^ (119 ^ 90);
        lIllIIIllI[67] = 240 ^ 199;
        lIllIIIllI[68] = 109 ^ 85;
        lIllIIIllI[69] = 177 ^ 136;
        lIllIIIllI[70] = 43 ^ 17;
        lIllIIIllI[71] = (233 ^ 134) ^ (198 ^ 146);
        lIllIIIllI[72] = 120 ^ 68;
        lIllIIIllI[73] = 170 ^ 151;
        lIllIIIllI[74] = (79 ^ 12) ^ (84 ^ 41);
        lIllIIIllI[75] = 89 ^ 102;
        lIllIIIllI[76] = ((53 ^ 35) & ((146 ^ 132) ^ (-1))) ^ (226 ^ 162);
        lIllIIIllI[77] = 192 ^ 129;
        lIllIIIllI[78] = (((180 + 13) - 140) + 142) ^ (((81 + 75) - 56) + 29);
        lIllIIIllI[79] = 217 ^ 154;
        lIllIIIllI[80] = 208 ^ 148;
        lIllIIIllI[81] = 115 ^ 54;
        lIllIIIllI[82] = (185 ^ 140) ^ (40 ^ 91);
        lIllIIIllI[83] = 255 ^ 184;
        lIllIIIllI[84] = (((37 + 135) - 148) + 116) ^ (((161 + 188) - 331) + 178);
        lIllIIIllI[85] = (166 ^ 189) ^ (75 ^ 25);
        lIllIIIllI[86] = 226 ^ 168;
        lIllIIIllI[87] = (((90 + 49) - 116) + 113) ^ (((143 + 74) - 154) + 132);
        lIllIIIllI[88] = (202 ^ 153) ^ (176 ^ 175);
        lIllIIIllI[89] = 13 ^ 64;
        lIllIIIllI[90] = 111 ^ 33;
        lIllIIIllI[91] = (70 ^ 101) ^ (116 ^ 24);
        lIllIIIllI[92] = 121 ^ 41;
        lIllIIIllI[93] = (-24713) & 28111;
        lIllIIIllI[94] = (-18729) & 28607;
        lIllIIIllI[95] = (-((-18761) & 23372)) & (-24641) & 32639;
        lIllIIIllI[96] = (-((-19271) & 23383)) & (-8266) & 15839;
        lIllIIIllI[97] = (-12872) & 16375;
        lIllIIIllI[98] = (71 ^ 63) ^ (127 ^ 86);
        lIllIIIllI[99] = (((36 + 238) - 130) + 106) ^ (((55 + 27) - 15) + 101);
        lIllIIIllI[100] = (211 ^ 195) ^ (50 ^ 113);
        lIllIIIllI[101] = (((114 + 23) - (-1)) + 93) ^ (((6 + 153) - 112) + 132);
        lIllIIIllI[102] = (4 ^ 29) ^ (64 ^ 12);
        lIllIIIllI[103] = (((160 + 129) - 205) + 125) ^ (((68 + 107) - 113) + 73);
        lIllIIIllI[104] = (86 ^ 116) ^ (116 ^ 1);
        lIllIIIllI[105] = 228 ^ 188;
        lIllIIIllI[106] = (153 ^ 147) ^ (0 ^ 83);
        lIllIIIllI[107] = 72 ^ 18;
        lIllIIIllI[108] = (248 ^ 188) ^ (115 ^ 108);
        lIllIIIllI[109] = 240 ^ 172;
        lIllIIIllI[110] = 215 ^ 138;
        lIllIIIllI[111] = 88 ^ 6;
        lIllIIIllI[112] = (10 ^ 70) ^ (101 ^ 118);
        lIllIIIllI[113] = (238 ^ 146) ^ (130 ^ 158);
        lIllIIIllI[114] = 207 ^ 174;
        lIllIIIllI[115] = (22 ^ 117) ^ " ".length();
        lIllIIIllI[116] = 118 ^ 21;
        lIllIIIllI[117] = 121 ^ 29;
        lIllIIIllI[118] = ((97 + 36) - 71) + 91;
        lIllIIIllI[119] = (((52 + 133) - 76) + 58) ^ (((68 + 161) - 98) + 63);
        lIllIIIllI[120] = (-29207) & 32702;
        lIllIIIllI[121] = (-12306) & 15803;
        lIllIIIllI[122] = (-((-19823) & 32623)) & (-89) & 16383;
        lIllIIIllI[123] = (-16979) & 20475;
        lIllIIIllI[124] = (-4185) & 7678;
        lIllIIIllI[125] = (-16897) & 20395;
        lIllIIIllI[126] = (-((-8577) & 29635)) & (-8193) & 32743;
        lIllIIIllI[127] = 75 ^ 45;
        lIllIIIllI[128] = (((49 + 178) - 63) + 49) ^ (((85 + 53) - 58) + 98);
        lIllIIIllI[129] = 110 ^ 6;
        lIllIIIllI[130] = (98 ^ 67) ^ (26 ^ 82);
        lIllIIIllI[131] = (243 ^ 195) ^ (228 ^ 190);
        lIllIIIllI[132] = (((148 + 118) - 264) + 230) ^ (((68 + 41) - 84) + 107);
        lIllIIIllI[133] = 16 ^ 125;
        lIllIIIllI[134] = 58 ^ 84;
        lIllIIIllI[135] = 230 ^ 137;
        lIllIIIllI[136] = 225 ^ 145;
        lIllIIIllI[137] = (((50 + 5) - (-3)) + 141) ^ (((29 + 178) - 201) + 176);
        lIllIIIllI[138] = 211 ^ 161;
        lIllIIIllI[139] = 33 ^ 82;
        lIllIIIllI[140] = 226 ^ 150;
        lIllIIIllI[141] = " ".length() ^ (86 ^ 34);
        lIllIIIllI[142] = (-((-26405) & 32764)) & (-17409) & 32767;
        lIllIIIllI[143] = (-((-265) & 25481)) & (-5124) & 30639;
        lIllIIIllI[144] = (-20754) & 32733;
        lIllIIIllI[145] = (-6213) & 31212;
        lIllIIIllI[146] = (-((-2581) & 24182)) & (-2051) & 24551;
        lIllIIIllI[147] = 12 ^ 122;
        lIllIIIllI[148] = 126 ^ 9;
        lIllIIIllI[149] = (-265) & 3486;
        lIllIIIllI[150] = (-8227) & 11699;
        lIllIIIllI[151] = (-20513) & 23919;
        lIllIIIllI[152] = (-4165) & 7653;
        lIllIIIllI[153] = (-((-3641) & 7994)) & (-65) & 14319;
        lIllIIIllI[154] = (-((-16385) & 24723)) & (-16385) & 32735;
        lIllIIIllI[155] = (-((-4115) & 30459)) & (-2) & 32767;
        lIllIIIllI[156] = (-12801) & 16215;
        lIllIIIllI[157] = (-12298) & 15709;
        lIllIIIllI[158] = (-24589) & 28076;
        lIllIIIllI[159] = (-((-26962) & 27635)) & (-8193) & 12287;
        lIllIIIllI[160] = (-16449) & 26335;
        lIllIIIllI[161] = (-((-3193) & 23673)) & (-643) & 24562;
        lIllIIIllI[162] = (-6425) & 16319;
        lIllIIIllI[163] = (-23185) & 23486;
        lIllIIIllI[164] = (-23749) & 24055;
        lIllIIIllI[165] = (104 ^ 32) ^ (155 ^ 171);
        lIllIIIllI[166] = 109 ^ 20;
        lIllIIIllI[167] = (((116 + 170) - 168) + 81) ^ (((40 + 37) - (-103)) + 9);
        lIllIIIllI[168] = 102 ^ 29;
        lIllIIIllI[169] = 114 ^ 14;
        lIllIIIllI[170] = (39 ^ 90) ^ ((216 ^ 143) & ((242 ^ 165) ^ (-1)));
        lIllIIIllI[171] = 187 ^ 197;
        lIllIIIllI[172] = (((192 ^ 137) + (229 ^ 194)) - (124 ^ 66)) + (237 ^ 160);
        lIllIIIllI[173] = ((106 + 104) - 114) + 32;
        lIllIIIllI[174] = ((108 + 95) - 78) + 4;
        lIllIIIllI[175] = ((119 + 2) - 13) + 22;
        lIllIIIllI[176] = ((130 + 88) - 99) + 12;
        lIllIIIllI[177] = ((96 + 49) - 86) + 73;
        lIllIIIllI[178] = ((25 + 12) - (-69)) + 27;
        lIllIIIllI[179] = ((98 + 45) - 26) + 17;
        lIllIIIllI[180] = (((220 ^ 182) + (19 ^ 8)) - (((119 + 38) - 59) + 31)) + ((29 + 5) - (-79)) + 18;
        lIllIIIllI[181] = (((221 ^ 158) + (233 ^ 158)) - (23 ^ 33)) + (124 ^ 120);
        lIllIIIllI[182] = (((250 ^ 142) + (52 ^ 96)) - (((133 + 91) - 58) + 5)) + (202 ^ 166);
        lIllIIIllI[183] = ((67 + 70) - 100) + 101;
        lIllIIIllI[184] = (((((9 + 12) - (-101)) + 9) + (37 ^ 1)) - (88 ^ 104)) + (88 ^ 76);
        lIllIIIllI[185] = (((104 ^ 97) + (102 ^ 0)) - (113 ^ 83)) + (122 ^ 69);
    }

    private static void bo() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIlIllIlIIll(nearest) && lIIlIllIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[138]];
            C0000a.a(nearest);
        }
        if (lIIlIllIlIIll(nearest) && lIIlIllIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIllIIIllI[4]);
                "".length();
            }
            if (lIIlIllIIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[139]];
                if (lIIlIllIlIlII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIllIIIllI[6]);
                    "".length();
                }
                C0000a.a(lIllIIIllI[7], lIllIIIllI[13]);
                C0000a.a(lIllIIIllI[8], lIllIIIllI[0]);
                C0000a.a(lIllIIIllI[11], lIllIIIllI[0]);
                C0000a.a(lIllIIIllI[12], lIllIIIllI[3]);
                C0000a.a(lIllIIIllI[9], lIllIIIllI[41]);
            }
        }
    }

    private static boolean lIIlIllIlIlII(int i) {
        return i > 0;
    }

    private static boolean lIIlIllIlIllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean bp() {
        String[] strArr = new String[lIllIIIllI[0]];
        strArr[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[140]];
        if (lIIlIllIlIlII(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIllIIIllI[0]];
            iArr[lIllIIIllI[1]] = lIllIIIllI[12];
            if (lIIlIllIlIlII(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[lIllIIIllI[0]];
                iArr2[lIllIIIllI[1]] = lIllIIIllI[11];
                if (lIIlIllIlIlII(Inventory.getCount(iArr2))) {
                    int[] iArr3 = new int[lIllIIIllI[0]];
                    iArr3[lIllIIIllI[1]] = lIllIIIllI[7];
                    if (lIIlIllIIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = lIllIIIllI[0];
                        "".length();
                        return (-((190 ^ 180) ^ (189 ^ 179))) > 0 ? ((((11 + 171) - 163) + 215) ^ (((161 + 49) - 173) + 125)) & (((176 ^ 191) ^ (81 ^ 22)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return lIllIIIllI[1];
    }

    private static int lIIlIllIIlllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void bn() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIlIllIlIIll(nearest) && lIIlIllIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[136]];
            C0000a.a(nearest);
        }
        if (lIIlIllIlIIll(nearest) && lIIlIllIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIllIIIllI[4]);
                "".length();
            }
            if (lIIlIllIIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[137]];
                if (lIIlIllIlIlII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIllIIIllI[6]);
                    "".length();
                }
                C0000a.a(lIllIIIllI[7], lIllIIIllI[13]);
                C0000a.a(lIllIIIllI[11], lIllIIIllI[0]);
                C0000a.a(lIllIIIllI[9], lIllIIIllI[41]);
            }
        }
    }

    private static void bl() {
        dS.add(Integer.valueOf(lIllIIIllI[120]));
        "".length();
        dS.add(Integer.valueOf(lIllIIIllI[121]));
        "".length();
        dS.add(Integer.valueOf(lIllIIIllI[122]));
        "".length();
        dS.add(Integer.valueOf(lIllIIIllI[123]));
        "".length();
        dS.add(Integer.valueOf(lIllIIIllI[124]));
        "".length();
        dS.add(Integer.valueOf(lIllIIIllI[125]));
        "".length();
        dS.add(Integer.valueOf(lIllIIIllI[126]));
        "".length();
        while (lIIlIllIlIIIl(dS.isEmpty() ? 1 : 0) && lIIlIllIlIIIl(dS.isEmpty() ? 1 : 0)) {
            String[] strArr = new String[lIllIIIllI[0]];
            strArr[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[127]];
            if (lIIlIllIIllll(Inventory.contains(strArr) ? 1 : 0)) {
                "".length();
                if ("  ".length() == "   ".length()) {
                    return;
                }
                return;
            }
            int[] iArr = new int[lIllIIIllI[0]];
            iArr[lIllIIIllI[1]] = dS.get(lIllIIIllI[1]).intValue();
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIIlIllIlIIll(nearest)) {
                String[] strArr2 = new String[lIllIIIllI[0]];
                strArr2[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[128]];
                if (lIIlIllIIllll(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[lIllIIIllI[0]];
                    strArr3[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[129]];
                    Inventory.getFirst(strArr3).useOn(nearest);
                    Time.sleepTicks(lIllIIIllI[3]);
                    "".length();
                }
            }
            String[] strArr4 = new String[lIllIIIllI[0]];
            strArr4[lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[130]];
            if (lIIlIllIlIIIl(Inventory.contains(strArr4) ? 1 : 0)) {
                dS.remove(lIllIIIllI[1]);
                "".length();
                Time.sleepTicks(lIllIIIllI[5]);
                "".length();
            }
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
    }

    private static boolean lIIlIllIllIIl(int i, int i2) {
        return i >= i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIllIIIlII[lIllIIIllI[147]];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            bk();
            "".length();
            if ("   ".length() > ((0 ^ 25) ^ (147 ^ 142))) {
                return ((((37 + 40) - (-105)) + 12) ^ (((80 + 79) - 86) + 66)) & (((111 ^ 45) ^ (173 ^ 166)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIllIIIllI[117];
    }
}
