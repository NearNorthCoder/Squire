package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.L  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/L.class */
public class L implements ab {
    public static /* synthetic */ WorldArea gb;
    public static /* synthetic */ WorldArea gd;
    public static /* synthetic */ List<C0003d> bx;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldPoint dg;
    static /* synthetic */ int dL;
    public static /* synthetic */ WorldArea gc;
    static /* synthetic */ int[] ge;
    private static /* synthetic */ String[] cG;
    private static /* synthetic */ int[] llIlIIlII;
    static /* synthetic */ int dk;
    public static /* synthetic */ WorldArea ga;
    static /* synthetic */ String h;
    static /* synthetic */ String dc;
    private static /* synthetic */ String[] llIIllIll;

    private static boolean lIllIIlllIll(int i) {
        return i > 0;
    }

    private static boolean lIllIIlllllI(int i, int i2) {
        return i == i2;
    }

    private static String lIlIllIllIIl(String lIIlIlIIIllIlI, String lIIlIlIIIllIIl) {
        try {
            SecretKeySpec lIIlIlIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIlIIIllIIl.getBytes(StandardCharsets.UTF_8)), llIlIIlII[26]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIlII[5], lIIlIlIIIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIlIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIlIIIllIll) {
            lIIlIlIIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllIlll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x0c0d, code lost:
        if (lIllIIlllIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e2, code lost:
        if (lIllIIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[11]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0225, code lost:
        if (lIllIIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[11]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0268, code lost:
        if (lIllIIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[11]) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02ab, code lost:
        if (lIllIIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[11]) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02ee, code lost:
        if (lIllIIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[16]) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0331, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[11]) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0334, code lost:
        Q();
        java.lang.System.out.println(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIIllIll[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[18]]);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.bv = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x034f, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v785, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v818, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v854, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v253, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cl() {
        if (lIllIIllIllI(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (lIllIIllIlll(bx.size(), llIlIIlII[0])) {
                System.out.println(llIIllIll[llIlIIlII[1]]);
                bv = llIlIIlII[1];
            }
        }
        if (lIllIIlllIII(bv ? 1 : 0)) {
            if (lIllIIllIlll(Skills.getLevel(Skill.PRAYER), llIlIIlII[2])) {
                dc = llIIllIll[llIlIIlII[0]];
                aq.ea();
            }
            if (lIllIIlllIIl(Skills.getLevel(Skill.PRAYER), llIlIIlII[2]) && lIllIIllIlll(C0004e.j(llIlIIlII[3]), llIlIIlII[4])) {
                dc = llIIllIll[llIlIIlII[5]];
                C0023x.bf();
            }
            if (lIllIIlllIII(an() ? 1 : 0) && lIllIIllIlll(C0004e.j(dL), llIlIIlII[0]) && lIllIIlllIIl(C0004e.j(llIlIIlII[3]), llIlIIlII[4]) && lIllIIlllIIl(Skills.getLevel(Skill.PRAYER), llIlIIlII[2])) {
                dc = llIIllIll[llIlIIlII[6]];
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIIlllIlI(nearest) && lIllIIlllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIllIll[llIlIIlII[7]];
                    C0000a.a(nearest);
                }
                if (lIllIIlllIlI(nearest) && lIllIIllIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIllIIlllIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIIlII[8]);
                        "".length();
                    }
                    if (lIllIIllIllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[9]];
                        if (lIllIIlllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIIlII[7]);
                            "".length();
                        }
                        if (lIllIIlllIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlIIlII[5]);
                            "".length();
                        }
                        int[] iArr = new int[llIlIIlII[0]];
                        iArr[llIlIIlII[1]] = llIlIIlII[10];
                        if (lIllIIllIllI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIlIIlII[0]];
                            iArr2[llIlIIlII[1]] = llIlIIlII[10];
                        }
                        int[] iArr3 = new int[llIlIIlII[0]];
                        iArr3[llIlIIlII[1]] = llIlIIlII[12];
                        if (lIllIIllIllI(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIlIIlII[0]];
                            iArr4[llIlIIlII[1]] = llIlIIlII[12];
                        }
                        int[] iArr5 = new int[llIlIIlII[0]];
                        iArr5[llIlIIlII[1]] = llIlIIlII[13];
                        if (lIllIIllIllI(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIlIIlII[0]];
                            iArr6[llIlIIlII[1]] = llIlIIlII[13];
                        }
                        int[] iArr7 = new int[llIlIIlII[0]];
                        iArr7[llIlIIlII[1]] = llIlIIlII[14];
                        if (lIllIIllIllI(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[llIlIIlII[0]];
                            iArr8[llIlIIlII[1]] = llIlIIlII[14];
                        }
                        int[] iArr9 = new int[llIlIIlII[0]];
                        iArr9[llIlIIlII[1]] = llIlIIlII[15];
                        if (lIllIIllIllI(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[llIlIIlII[0]];
                            iArr10[llIlIIlII[1]] = llIlIIlII[15];
                        }
                        int[] iArr11 = new int[llIlIIlII[0]];
                        iArr11[llIlIIlII[1]] = llIlIIlII[17];
                        if (lIllIIllIllI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIlIIlII[0]];
                            iArr12[llIlIIlII[1]] = llIlIIlII[17];
                        }
                        int[] iArr13 = new int[llIlIIlII[19]];
                        iArr13[llIlIIlII[1]] = llIlIIlII[20];
                        iArr13[llIlIIlII[0]] = llIlIIlII[21];
                        iArr13[llIlIIlII[5]] = llIlIIlII[22];
                        iArr13[llIlIIlII[6]] = llIlIIlII[23];
                        iArr13[llIlIIlII[7]] = llIlIIlII[24];
                        iArr13[llIlIIlII[9]] = llIlIIlII[15];
                        iArr13[llIlIIlII[18]] = llIlIIlII[14];
                        iArr13[llIlIIlII[25]] = llIlIIlII[13];
                        iArr13[llIlIIlII[26]] = llIlIIlII[17];
                        iArr13[llIlIIlII[27]] = llIlIIlII[12];
                        if (lIllIIlllIII(C0004e.d(iArr13) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIllIll[llIlIIlII[25]]);
                            bv = llIlIIlII[0];
                            return;
                        }
                        while (lIllIIlllIII(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks(llIlIIlII[0]);
                            "".length();
                            "".length();
                            if (0 != 0) {
                                return;
                            }
                        }
                        if (lIllIIlllIII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIlIIlII[18]);
                            "".length();
                        }
                        if (lIllIIllIllI(Bank.isOpen() ? 1 : 0)) {
                            int[] iArr14 = new int[llIlIIlII[19]];
                            iArr14[llIlIIlII[1]] = llIlIIlII[20];
                            iArr14[llIlIIlII[0]] = llIlIIlII[21];
                            iArr14[llIlIIlII[5]] = llIlIIlII[22];
                            iArr14[llIlIIlII[6]] = llIlIIlII[23];
                            iArr14[llIlIIlII[7]] = llIlIIlII[24];
                            iArr14[llIlIIlII[9]] = llIlIIlII[15];
                            iArr14[llIlIIlII[18]] = llIlIIlII[14];
                            iArr14[llIlIIlII[25]] = llIlIIlII[13];
                            iArr14[llIlIIlII[26]] = llIlIIlII[17];
                            iArr14[llIlIIlII[27]] = llIlIIlII[12];
                            if (lIllIIllIllI(C0004e.d(iArr14) ? 1 : 0)) {
                                C0000a.a(llIlIIlII[20], llIlIIlII[19]);
                                C0000a.a(llIlIIlII[28], llIlIIlII[6]);
                                C0000a.a(llIlIIlII[21], llIlIIlII[6]);
                                C0000a.a(llIlIIlII[22], llIlIIlII[0]);
                                C0000a.a(llIlIIlII[23], llIlIIlII[0]);
                                C0000a.a(llIlIIlII[24], llIlIIlII[9]);
                                C0000a.a(llIlIIlII[12], llIlIIlII[11]);
                                C0000a.a(llIlIIlII[17], llIlIIlII[11]);
                                C0000a.a(llIlIIlII[14], llIlIIlII[11]);
                                C0000a.a(llIlIIlII[13], llIlIIlII[11]);
                                C0000a.a(llIlIIlII[15], llIlIIlII[11]);
                                C0000a.a(llIlIIlII[10], llIlIIlII[11]);
                            }
                        }
                    }
                }
            }
            if (lIllIIllIllI(Inventory.contains(C0005f.bc) ? 1 : 0) && lIllIIllIlll(Movement.getRunEnergy(), llIlIIlII[29])) {
                Inventory.getFirst(C0005f.bc).interact(llIIllIll[llIlIIlII[26]]);
                Time.sleepTicks(llIlIIlII[0]);
                "".length();
            }
            if (lIllIIllIllI(Inventory.contains(C0005f.aZ) ? 1 : 0) && lIllIIllIlll(Prayers.getPoints(), llIlIIlII[30])) {
                Inventory.getFirst(C0005f.aZ).interact(llIIllIll[llIlIIlII[27]]);
            }
            if (lIllIIllllII(lIllIIllIlIl(C0004e.w(), 60.0d))) {
                String[] strArr = new String[llIlIIlII[0]];
                strArr[llIlIIlII[1]] = llIIllIll[llIlIIlII[19]];
                if (lIllIIllIllI(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIlIIlII[0]];
                    strArr2[llIlIIlII[1]] = llIIllIll[llIlIIlII[31]];
                    Inventory.getFirst(strArr2).interact(llIIllIll[llIlIIlII[32]]);
                    Time.sleepTicks(llIlIIlII[5]);
                    "".length();
                }
            }
            if (lIllIIllIllI(an() ? 1 : 0) && lIllIIlllIII(C0004e.j(dL))) {
                String[] strArr3 = new String[llIlIIlII[0]];
                strArr3[llIlIIlII[1]] = llIIllIll[llIlIIlII[33]];
                if (lIllIIllllIl(NPCs.getNearest(strArr3))) {
                    AccBuilderGWD.c = llIIllIll[llIlIIlII[34]];
                    if (lIllIIllIllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0004e.l(llIlIIlII[22]);
                    Movement.walkTo(dg);
                    "".length();
                    Time.sleepTicks(llIlIIlII[0]);
                    "".length();
                }
                String[] strArr4 = new String[llIlIIlII[0]];
                strArr4[llIlIIlII[1]] = llIIllIll[llIlIIlII[35]];
                if (lIllIIlllIlI(NPCs.getNearest(strArr4))) {
                    C0006g.a(llIIllIll[llIlIIlII[36]], cG, llIlIIlII[0]);
                }
            }
            if (lIllIIlllllI(C0004e.j(dL), llIlIIlII[19])) {
                C0004e.l(llIlIIlII[23]);
                WorldArea worldArea = new WorldArea(llIlIIlII[37], llIlIIlII[38], llIlIIlII[39], llIlIIlII[40], llIlIIlII[1]);
                if (lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldArea worldArea2 = new WorldArea(llIlIIlII[41], llIlIIlII[42], llIlIIlII[29], llIlIIlII[43], llIlIIlII[1]);
                    if (lIllIIlllIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(llIlIIlII[44], llIlIIlII[45], llIlIIlII[1]);
                        if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[46]];
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(llIlIIlII[0]);
                            "".length();
                        }
                        if (lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[43]];
                            String[] strArr5 = new String[llIlIIlII[0]];
                            strArr5[llIlIIlII[1]] = llIIllIll[llIlIIlII[47]];
                            TileObjects.getNearest(strArr5).interact(llIIllIll[llIlIIlII[48]]);
                            Time.sleepTicks(llIlIIlII[7]);
                            "".length();
                        }
                    }
                    if (lIllIIllIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint2 = new WorldPoint(llIlIIlII[49], llIlIIlII[50], llIlIIlII[1]);
                        WorldPoint worldPoint3 = new WorldPoint(llIlIIlII[51], llIlIIlII[50], llIlIIlII[1]);
                        WorldPoint worldPoint4 = new WorldPoint(llIlIIlII[51], llIlIIlII[52], llIlIIlII[1]);
                        TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                            if (lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[328]]) ? 1 : 0) && lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint2), llIlIIlII[9])) {
                                ?? r0 = llIlIIlII[0];
                                "".length();
                                return "  ".length() < 0 ? ((113 ^ 117) ^ (13 ^ 1)) & (((80 ^ 79) ^ (211 ^ 196)) ^ (-" ".length())) : r0;
                            }
                            return llIlIIlII[1];
                        });
                        if (lIllIIlllIlI(nearest2) && lIllIIllIlll(Players.getLocal().getWorldLocation().getX(), llIlIIlII[53])) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[54]];
                            nearest2.interact(llIIllIll[llIlIIlII[55]]);
                            Time.sleepTicks(llIlIIlII[6]);
                            "".length();
                        }
                        if (!lIllIIlllIII(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || !lIllIIlllIII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) || lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) {
                            WorldPoint worldPoint5 = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]);
                            TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                                if (lIllIIllIllI(tileObject2.getName().contains(llIIllIll[llIlIIlII[327]]) ? 1 : 0) && lIllIlIIIIII(tileObject2.getWorldLocation().distanceTo(worldPoint5), llIlIIlII[9])) {
                                    ?? r0 = llIlIIlII[0];
                                    "".length();
                                    return "   ".length() > ((41 ^ 59) ^ (55 ^ 33)) ? ((((169 + 110) - 180) + 90) ^ (((14 + 103) - (-5)) + 24)) & (((((15 + 70) - 84) + 138) ^ (((119 + 128) - 200) + 117)) ^ (-" ".length())) : r0;
                                }
                                return llIlIIlII[1];
                            });
                            if ((lIllIIlllIlI(nearest3) && lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[51]) && !lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[58])) || !lIllIIlllIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) || lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[59], llIlIIlII[1])) ? 1 : 0)) {
                                AccBuilderGWD.c = llIIllIll[llIlIIlII[60]];
                                nearest3.interact(llIIllIll[llIlIIlII[30]]);
                                Time.sleepTicks(llIlIIlII[6]);
                                "".length();
                            }
                        }
                        if (lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[61])) {
                            if (lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) {
                                WorldPoint worldPoint6 = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]);
                                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                                    if (lIllIIllIllI(tileObject3.getName().contains(llIIllIll[llIlIIlII[326]]) ? 1 : 0) && lIllIlIIIIII(tileObject3.getWorldLocation().distanceTo(worldPoint6), llIlIIlII[9])) {
                                        ?? r0 = llIlIIlII[0];
                                        "".length();
                                        return "  ".length() > (125 ^ 121) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIlIIlII[1];
                                });
                                if (lIllIIlllIlI(nearest4)) {
                                    AccBuilderGWD.c = llIIllIll[llIlIIlII[62]];
                                    nearest4.interact(llIIllIll[llIlIIlII[40]]);
                                    Time.sleepTicks(llIlIIlII[6]);
                                    "".length();
                                }
                            }
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[63]];
                            String[] strArr6 = new String[llIlIIlII[0]];
                            strArr6[llIlIIlII[1]] = llIIllIll[llIlIIlII[64]];
                            TileObjects.getNearest(strArr6).interact(llIIllIll[llIlIIlII[65]]);
                            Time.sleepTicks(llIlIIlII[6]);
                            "".length();
                        }
                    }
                }
                if (lIllIIllIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIlllllI(Vars.getBit(llIlIIlII[7]), llIlIIlII[0])) {
                    if (lIllIIlllIII(Vars.getBit(llIlIIlII[6]))) {
                        C0006g.a(llIIllIll[llIlIIlII[39]], cG);
                    }
                    if (lIllIIlllllI(Vars.getBit(llIlIIlII[6]), llIlIIlII[0])) {
                        WorldPoint worldPoint7 = new WorldPoint(llIlIIlII[37], llIlIIlII[66], llIlIIlII[1]);
                        if (lIllIIlllIII(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[67]];
                            C0004e.c(worldPoint7);
                            Time.sleepTicks(llIlIIlII[0]);
                            "".length();
                        }
                        if (lIllIIllIllI(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                            if (!lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[33]) || lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[46])) {
                                String[] strArr7 = new String[llIlIIlII[0]];
                                strArr7[llIlIIlII[1]] = llIIllIll[llIlIIlII[68]];
                            }
                            Magic.cast(SpellBook.Standard.FIRE_STRIKE, NPCs.getNearest(npc -> {
                                if (lIllIIllIllI(npc.getName().equalsIgnoreCase(llIIllIll[llIlIIlII[325]]) ? 1 : 0) && lIllIIlllIII(npc.isDead() ? 1 : 0)) {
                                    ?? r0 = llIlIIlII[0];
                                    "".length();
                                    return (-(20 ^ 17)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIIlII[1];
                            }));
                            Time.sleepTicks(llIlIIlII[5]);
                            "".length();
                            String[] strArr8 = new String[llIlIIlII[0]];
                            strArr8[llIlIIlII[1]] = llIIllIll[llIlIIlII[69]];
                            if (lIllIIllIllI(Inventory.contains(strArr8) ? 1 : 0)) {
                                if (lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[46]) && lIllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlIIlII[60])) {
                                    Magic.cast(SpellBook.Standard.WIND_BOLT, NPCs.getNearest(npc2 -> {
                                        if (lIllIIllIllI(npc2.getName().equalsIgnoreCase(llIIllIll[llIlIIlII[324]]) ? 1 : 0) && lIllIIlllIII(npc2.isDead() ? 1 : 0)) {
                                            ?? r0 = llIlIIlII[0];
                                            "".length();
                                            return (((22 ^ 97) ^ (30 ^ 93)) & (((142 ^ 148) ^ (94 ^ 112)) ^ (-" ".length()))) != 0 ? ((((154 + 151) - 247) + 112) ^ (((111 + 94) - 135) + 91)) & (((234 ^ 147) ^ (199 ^ 181)) ^ (-" ".length())) : r0;
                                        }
                                        return llIlIIlII[1];
                                    }));
                                    Time.sleepTicks(llIlIIlII[5]);
                                    "".length();
                                }
                                if (lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[60]) && lIllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlIIlII[65])) {
                                    Magic.cast(SpellBook.Standard.WATER_BOLT, NPCs.getNearest(npc3 -> {
                                        if (lIllIIllIllI(npc3.getName().equalsIgnoreCase(llIIllIll[llIlIIlII[323]]) ? 1 : 0) && lIllIIlllIII(npc3.isDead() ? 1 : 0)) {
                                            ?? r0 = llIlIIlII[0];
                                            "".length();
                                            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIlIIlII[1];
                                    }));
                                    Time.sleepTicks(llIlIIlII[5]);
                                    "".length();
                                }
                                if (lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[65]) && lIllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlIIlII[70])) {
                                    Magic.cast(SpellBook.Standard.EARTH_BOLT, NPCs.getNearest(npc4 -> {
                                        if (lIllIIllIllI(npc4.getName().equalsIgnoreCase(llIIllIll[llIlIIlII[322]]) ? 1 : 0) && lIllIIlllIII(npc4.isDead() ? 1 : 0)) {
                                            ?? r0 = llIlIIlII[0];
                                            "".length();
                                            return "   ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIlIIlII[1];
                                    }));
                                    Time.sleepTicks(llIlIIlII[5]);
                                    "".length();
                                }
                                if (lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[70])) {
                                    Magic.cast(SpellBook.Standard.FIRE_BOLT, NPCs.getNearest(npc5 -> {
                                        if (lIllIIllIllI(npc5.getName().equalsIgnoreCase(llIIllIll[llIlIIlII[321]]) ? 1 : 0) && lIllIIlllIII(npc5.isDead() ? 1 : 0)) {
                                            ?? r0 = llIlIIlII[0];
                                            "".length();
                                            return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIlIIlII[1];
                                    }));
                                    Time.sleepTicks(llIlIIlII[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
            }
            if (lIllIIlllllI(C0004e.j(dL), llIlIIlII[48])) {
                if (lIllIIllIllI(Dialog.isOpen() ? 1 : 0)) {
                    C0006g.a(cG);
                }
                WorldArea worldArea3 = new WorldArea(llIlIIlII[37], llIlIIlII[38], llIlIIlII[39], llIlIIlII[40], llIlIIlII[1]);
                if (lIllIIllIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIllIll[llIlIIlII[71]];
                    String[] strArr9 = new String[llIlIIlII[0]];
                    strArr9[llIlIIlII[1]] = llIIllIll[llIlIIlII[70]];
                    TileObjects.getNearest(strArr9).interact(llIIllIll[llIlIIlII[72]]);
                    Time.sleepTicks(llIlIIlII[6]);
                    "".length();
                }
                if (lIllIIlllIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldArea worldArea4 = new WorldArea(llIlIIlII[37], llIlIIlII[73], llIlIIlII[68], llIlIIlII[43], llIlIIlII[1]);
                    String[] strArr10 = new String[llIlIIlII[0]];
                    strArr10[llIlIIlII[1]] = llIIllIll[llIlIIlII[74]];
                    if (lIllIIlllIlI(TileObjects.getNearest(strArr10)) && lIllIIllIllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[75]];
                        String[] strArr11 = new String[llIlIIlII[0]];
                        strArr11[llIlIIlII[1]] = llIIllIll[llIlIIlII[76]];
                        TileObjects.getNearest(strArr11).interact(llIIllIll[llIlIIlII[77]]);
                        Time.sleepTicks(llIlIIlII[6]);
                        "".length();
                    }
                }
                if (lIllIIllIllI(new WorldArea(llIlIIlII[78], llIlIIlII[79], llIlIIlII[68], llIlIIlII[55], llIlIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIllIll[llIlIIlII[80]];
                    TileObjects.getNearest(tileObject4 -> {
                        if (lIllIIllIllI(tileObject4.getName().contains(llIIllIll[llIlIIlII[320]]) ? 1 : 0) && lIllIlIIIIII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[260], llIlIIlII[295], llIlIIlII[1])), llIlIIlII[9])) {
                            ?? r0 = llIlIIlII[0];
                            "".length();
                            return (((212 ^ 129) ^ (1 ^ 91)) & (((201 ^ 152) ^ (205 ^ 147)) ^ (-" ".length()))) >= "  ".length() ? ((((37 + 85) - (-34)) + 23) ^ (((36 + 50) - (-41)) + 23)) & (((((92 + 99) - 126) + 97) ^ (((76 + 44) - 31) + 46)) ^ (-" ".length())) : r0;
                        }
                        return llIlIIlII[1];
                    }).interact(llIIllIll[llIlIIlII[81]]);
                    Time.sleepTicks(llIlIIlII[6]);
                    "".length();
                }
                WorldPoint[] worldPointArr = new WorldPoint[llIlIIlII[67]];
                worldPointArr[llIlIIlII[1]] = new WorldPoint(llIlIIlII[82], llIlIIlII[83], llIlIIlII[1]);
                worldPointArr[llIlIIlII[0]] = new WorldPoint(llIlIIlII[84], llIlIIlII[85], llIlIIlII[1]);
                worldPointArr[llIlIIlII[5]] = new WorldPoint(llIlIIlII[86], llIlIIlII[87], llIlIIlII[1]);
                worldPointArr[llIlIIlII[6]] = new WorldPoint(llIlIIlII[88], llIlIIlII[89], llIlIIlII[1]);
                worldPointArr[llIlIIlII[7]] = new WorldPoint(llIlIIlII[90], llIlIIlII[91], llIlIIlII[1]);
                worldPointArr[llIlIIlII[9]] = new WorldPoint(llIlIIlII[90], llIlIIlII[92], llIlIIlII[1]);
                worldPointArr[llIlIIlII[18]] = new WorldPoint(llIlIIlII[86], llIlIIlII[93], llIlIIlII[1]);
                worldPointArr[llIlIIlII[25]] = new WorldPoint(llIlIIlII[94], llIlIIlII[95], llIlIIlII[1]);
                worldPointArr[llIlIIlII[26]] = new WorldPoint(llIlIIlII[96], llIlIIlII[97], llIlIIlII[1]);
                worldPointArr[llIlIIlII[27]] = new WorldPoint(llIlIIlII[98], llIlIIlII[99], llIlIIlII[1]);
                worldPointArr[llIlIIlII[19]] = new WorldPoint(llIlIIlII[100], llIlIIlII[101], llIlIIlII[1]);
                worldPointArr[llIlIIlII[31]] = new WorldPoint(llIlIIlII[102], llIlIIlII[99], llIlIIlII[1]);
                worldPointArr[llIlIIlII[32]] = new WorldPoint(llIlIIlII[103], llIlIIlII[104], llIlIIlII[1]);
                worldPointArr[llIlIIlII[33]] = new WorldPoint(llIlIIlII[58], llIlIIlII[95], llIlIIlII[1]);
                worldPointArr[llIlIIlII[34]] = new WorldPoint(llIlIIlII[105], llIlIIlII[93], llIlIIlII[1]);
                worldPointArr[llIlIIlII[35]] = new WorldPoint(llIlIIlII[106], llIlIIlII[107], llIlIIlII[1]);
                worldPointArr[llIlIIlII[36]] = new WorldPoint(llIlIIlII[108], llIlIIlII[109], llIlIIlII[1]);
                worldPointArr[llIlIIlII[46]] = new WorldPoint(llIlIIlII[110], llIlIIlII[111], llIlIIlII[1]);
                worldPointArr[llIlIIlII[43]] = new WorldPoint(llIlIIlII[110], llIlIIlII[89], llIlIIlII[1]);
                worldPointArr[llIlIIlII[47]] = new WorldPoint(llIlIIlII[112], llIlIIlII[87], llIlIIlII[1]);
                worldPointArr[llIlIIlII[48]] = new WorldPoint(llIlIIlII[51], llIlIIlII[113], llIlIIlII[1]);
                worldPointArr[llIlIIlII[54]] = new WorldPoint(llIlIIlII[44], llIlIIlII[87], llIlIIlII[1]);
                worldPointArr[llIlIIlII[55]] = new WorldPoint(llIlIIlII[114], llIlIIlII[115], llIlIIlII[1]);
                worldPointArr[llIlIIlII[60]] = new WorldPoint(llIlIIlII[116], llIlIIlII[117], llIlIIlII[1]);
                worldPointArr[llIlIIlII[30]] = new WorldPoint(llIlIIlII[116], llIlIIlII[118], llIlIIlII[1]);
                worldPointArr[llIlIIlII[62]] = new WorldPoint(llIlIIlII[119], llIlIIlII[120], llIlIIlII[1]);
                worldPointArr[llIlIIlII[40]] = new WorldPoint(llIlIIlII[121], llIlIIlII[122], llIlIIlII[1]);
                worldPointArr[llIlIIlII[63]] = new WorldPoint(llIlIIlII[49], llIlIIlII[123], llIlIIlII[1]);
                worldPointArr[llIlIIlII[64]] = new WorldPoint(llIlIIlII[124], llIlIIlII[95], llIlIIlII[1]);
                worldPointArr[llIlIIlII[65]] = new WorldPoint(llIlIIlII[125], llIlIIlII[126], llIlIIlII[1]);
                worldPointArr[llIlIIlII[39]] = new WorldPoint(llIlIIlII[127], llIlIIlII[93], llIlIIlII[1]);
                if (lIllIIllIllI(ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint8 = new WorldPoint(llIlIIlII[128], llIlIIlII[129], llIlIIlII[1]);
                    if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint8), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[2]];
                        if (lIllIIlllIlI(NPCs.getNearest(npc6 -> {
                            return npc6.getName().contains(llIIllIll[llIlIIlII[319]]);
                        })) && lIllIIlllIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                            Prayers.toggle(Prayer.PROTECT_FROM_MISSILES);
                        }
                        if (lIllIIllllIl(NPCs.getNearest(npc7 -> {
                            return npc7.getName().contains(llIIllIll[llIlIIlII[318]]);
                        })) && lIllIIllIllI(Prayers.isEnabled(Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                            Prayers.toggle(Prayer.PROTECT_FROM_MISSILES);
                        }
                        Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                        "".length();
                        Time.sleepTicks(llIlIIlII[0]);
                        "".length();
                    }
                    if (lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint8), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[130]];
                        String[] strArr12 = new String[llIlIIlII[0]];
                        strArr12[llIlIIlII[1]] = llIIllIll[llIlIIlII[131]];
                        TileObjects.getNearest(strArr12).interact(llIIllIll[llIlIIlII[132]]);
                        Time.sleepTicks(llIlIIlII[6]);
                        "".length();
                    }
                }
                if (lIllIIllIllI(cq() ? 1 : 0)) {
                    int[] iArr15 = new int[llIlIIlII[0]];
                    iArr15[llIlIIlII[1]] = llIlIIlII[133];
                    if (lIllIIlllIII(Inventory.contains(iArr15) ? 1 : 0)) {
                        WorldPoint worldPoint9 = new WorldPoint(llIlIIlII[134], llIlIIlII[135], llIlIIlII[5]);
                        if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint9), llIlIIlII[25])) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[136]];
                            Movement.walkTo(worldPoint9);
                            "".length();
                            Time.sleepTicks(llIlIIlII[0]);
                            "".length();
                        }
                        if (lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint9), llIlIIlII[25])) {
                            int[] iArr16 = new int[llIlIIlII[0]];
                            iArr16[llIlIIlII[1]] = llIlIIlII[133];
                            if (lIllIIlllIlI(TileItems.getNearest(iArr16))) {
                                int[] iArr17 = new int[llIlIIlII[0]];
                                iArr17[llIlIIlII[1]] = llIlIIlII[133];
                                TileItems.getNearest(iArr17).interact(llIIllIll[llIlIIlII[137]]);
                                Time.sleepTicks(llIlIIlII[5]);
                                "".length();
                            }
                            int[] iArr18 = new int[llIlIIlII[0]];
                            iArr18[llIlIIlII[1]] = llIlIIlII[133];
                            if (lIllIIllllIl(TileItems.getNearest(iArr18))) {
                                t(llIIllIll[llIlIIlII[138]]);
                                Time.sleepTicks(llIlIIlII[0]);
                                "".length();
                            }
                        }
                    }
                    int[] iArr19 = new int[llIlIIlII[0]];
                    iArr19[llIlIIlII[1]] = llIlIIlII[133];
                    if (lIllIIllIllI(Inventory.contains(iArr19) ? 1 : 0)) {
                        if (lIllIIllIllI(gb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint10 = new WorldPoint(llIlIIlII[139], llIlIIlII[140], llIlIIlII[5]);
                            if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint10), llIlIIlII[7])) {
                                AccBuilderGWD.c = llIIllIll[llIlIIlII[29]];
                                Movement.walkTo(worldPoint10);
                                "".length();
                                Time.sleepTicks(llIlIIlII[0]);
                                "".length();
                            }
                            if (lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint10), llIlIIlII[7])) {
                                String[] strArr13 = new String[llIlIIlII[0]];
                                strArr13[llIlIIlII[1]] = llIIllIll[llIlIIlII[141]];
                                TileObjects.getNearest(strArr13).interact(llIIllIll[llIlIIlII[142]]);
                                Time.sleepTicks(llIlIIlII[6]);
                                "".length();
                            }
                        }
                        if (lIllIIllIllI(gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            TileObject nearest5 = TileObjects.getNearest(tileObject5 -> {
                                if (lIllIIllIllI(tileObject5.getName().contains(llIIllIll[llIlIIlII[316]]) ? 1 : 0)) {
                                    String[] strArr14 = new String[llIlIIlII[0]];
                                    strArr14[llIlIIlII[1]] = llIIllIll[llIlIIlII[317]];
                                    if (lIllIIllIllI(tileObject5.hasAction(strArr14) ? 1 : 0)) {
                                        ?? r0 = llIlIIlII[0];
                                        "".length();
                                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                }
                                return llIlIIlII[1];
                            });
                            if (lIllIIlllIlI(nearest5)) {
                                if (lIllIIlllIII(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                                    AccBuilderGWD.c = llIIllIll[llIlIIlII[143]];
                                    Movement.walkTo(nearest5.getWorldLocation());
                                    "".length();
                                    Time.sleepTicks(llIlIIlII[0]);
                                    "".length();
                                }
                                if (lIllIIllIllI(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                                    nearest5.interact(llIIllIll[llIlIIlII[144]]);
                                    Time.sleepTicks(llIlIIlII[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
            }
            if (lIllIIlllllI(C0004e.j(dL), llIlIIlII[39])) {
                if (lIllIIllIllI(gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    TileObject nearest6 = TileObjects.getNearest(tileObject6 -> {
                        if (lIllIIllIllI(tileObject6.getName().contains(llIIllIll[llIlIIlII[314]]) ? 1 : 0)) {
                            String[] strArr14 = new String[llIlIIlII[0]];
                            strArr14[llIlIIlII[1]] = llIIllIll[llIlIIlII[315]];
                            if (lIllIIllIllI(tileObject6.hasAction(strArr14) ? 1 : 0)) {
                                ?? r0 = llIlIIlII[0];
                                "".length();
                                return (30 ^ 26) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                        return llIlIIlII[1];
                    });
                    if (lIllIIlllIlI(nearest6)) {
                        if (lIllIIlllIII(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[145]];
                            Movement.walkTo(nearest6.getWorldLocation());
                            "".length();
                            Time.sleepTicks(llIlIIlII[0]);
                            "".length();
                        }
                        if (lIllIIllIllI(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            nearest6.interact(llIIllIll[llIlIIlII[146]]);
                            Time.sleepTicks(llIlIIlII[5]);
                            "".length();
                        }
                    }
                }
                if (lIllIIllIllI(gd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint11 = new WorldPoint(llIlIIlII[147], llIlIIlII[148], llIlIIlII[1]);
                    if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint11), llIlIIlII[19])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[149]];
                        Movement.walkTo(worldPoint11);
                        "".length();
                        Time.sleepTicks(llIlIIlII[0]);
                        "".length();
                    }
                    if (lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint11), llIlIIlII[19])) {
                        if (lIllIIlllIII(Vars.getBit(llIlIIlII[1]))) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[150]];
                            int[] iArr20 = new int[llIlIIlII[0]];
                            iArr20[llIlIIlII[1]] = llIlIIlII[151];
                            if (lIllIIlllIII(Inventory.contains(iArr20) ? 1 : 0)) {
                                if (lIllIIlllIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                }
                                int[] iArr21 = new int[llIlIIlII[0]];
                                iArr21[llIlIIlII[1]] = llIlIIlII[151];
                                if (lIllIIllllIl(TileItems.getNearest(iArr21))) {
                                    t(llIIllIll[llIlIIlII[152]]);
                                    Time.sleepTicks(llIlIIlII[0]);
                                    "".length();
                                }
                                int[] iArr22 = new int[llIlIIlII[0]];
                                iArr22[llIlIIlII[1]] = llIlIIlII[151];
                                if (lIllIIlllIlI(TileItems.getNearest(iArr22))) {
                                    int[] iArr23 = new int[llIlIIlII[0]];
                                    iArr23[llIlIIlII[1]] = llIlIIlII[151];
                                    TileItems.getNearest(iArr23).interact(llIIllIll[llIlIIlII[153]]);
                                    Time.sleepTicks(llIlIIlII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr24 = new int[llIlIIlII[0]];
                            iArr24[llIlIIlII[1]] = llIlIIlII[151];
                            if (lIllIIllIllI(Inventory.contains(iArr24) ? 1 : 0)) {
                                TileObject nearest7 = TileObjects.getNearest(tileObject7 -> {
                                    if (lIllIIllIllI(tileObject7.getName().contains(llIIllIll[llIlIIlII[313]]) ? 1 : 0) && lIllIlIIIIII(tileObject7.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[206], llIlIIlII[148], llIlIIlII[1])), llIlIIlII[6])) {
                                        ?? r0 = llIlIIlII[0];
                                        "".length();
                                        return (-" ".length()) > ((91 ^ 124) & ((95 ^ 120) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIlIIlII[1];
                                });
                                int[] iArr25 = new int[llIlIIlII[0]];
                                iArr25[llIlIIlII[1]] = llIlIIlII[151];
                                Inventory.getFirst(iArr25).useOn(nearest7);
                                Time.sleepTicks(llIlIIlII[5]);
                                "".length();
                            }
                        }
                        if (lIllIIlllllI(Vars.getBit(llIlIIlII[1]), llIlIIlII[0])) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[154]];
                            int[] iArr26 = new int[llIlIIlII[0]];
                            iArr26[llIlIIlII[1]] = llIlIIlII[155];
                            if (lIllIIlllIII(Inventory.contains(iArr26) ? 1 : 0)) {
                                if (lIllIIlllIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                }
                                int[] iArr27 = new int[llIlIIlII[0]];
                                iArr27[llIlIIlII[1]] = llIlIIlII[155];
                                if (lIllIIllllIl(TileItems.getNearest(iArr27))) {
                                    t(llIIllIll[llIlIIlII[156]]);
                                    Time.sleepTicks(llIlIIlII[0]);
                                    "".length();
                                }
                                int[] iArr28 = new int[llIlIIlII[0]];
                                iArr28[llIlIIlII[1]] = llIlIIlII[155];
                                if (lIllIIlllIlI(TileItems.getNearest(iArr28))) {
                                    int[] iArr29 = new int[llIlIIlII[0]];
                                    iArr29[llIlIIlII[1]] = llIlIIlII[155];
                                    TileItems.getNearest(iArr29).interact(llIIllIll[llIlIIlII[157]]);
                                    Time.sleepTicks(llIlIIlII[5]);
                                    "".length();
                                }
                            }
                            int[] iArr30 = new int[llIlIIlII[0]];
                            iArr30[llIlIIlII[1]] = llIlIIlII[155];
                            if (lIllIIllIllI(Inventory.contains(iArr30) ? 1 : 0)) {
                                TileObject nearest8 = TileObjects.getNearest(tileObject8 -> {
                                    if (lIllIIllIllI(tileObject8.getName().contains(llIIllIll[llIlIIlII[311]]) ? 1 : 0) && lIllIlIIIIII(tileObject8.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[312], llIlIIlII[135], llIlIIlII[1])), llIlIIlII[6])) {
                                        ?? r0 = llIlIIlII[0];
                                        "".length();
                                        return "   ".length() == " ".length() ? ((81 ^ 56) ^ (15 ^ 70)) & (((4 ^ 15) ^ (58 ^ 17)) ^ (-" ".length())) : r0;
                                    }
                                    return llIlIIlII[1];
                                });
                                int[] iArr31 = new int[llIlIIlII[0]];
                                iArr31[llIlIIlII[1]] = llIlIIlII[155];
                                Inventory.getFirst(iArr31).useOn(nearest8);
                                Time.sleepTicks(llIlIIlII[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIllIIlllllI(C0004e.j(dL), llIlIIlII[77])) {
                if (lIllIIllIllI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                WorldPoint worldPoint12 = new WorldPoint(llIlIIlII[158], llIlIIlII[159], llIlIIlII[1]);
                if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), llIlIIlII[9])) {
                    AccBuilderGWD.c = llIIllIll[llIlIIlII[160]];
                    Movement.walkTo(worldPoint12);
                    "".length();
                    Time.sleepTicks(llIlIIlII[0]);
                    "".length();
                }
                if (lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), llIlIIlII[9])) {
                    if (lIllIIllIlll(dk, llIlIIlII[0])) {
                        as.nE += llIlIIlII[0];
                        as.u(AccBuilderGWD.m);
                        dk += llIlIIlII[0];
                        as.nE = llIlIIlII[1];
                    }
                    C0006g.a(llIIllIll[llIlIIlII[161]], cG, llIlIIlII[0]);
                }
            }
            C0004e.c(ge);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIlIIlII[7]];
        iArr[llIlIIlII[1]] = llIlIIlII[20];
        iArr[llIlIIlII[0]] = llIlIIlII[28];
        iArr[llIlIIlII[5]] = llIlIIlII[21];
        iArr[llIlIIlII[6]] = llIlIIlII[23];
        int i = llIlIIlII[1];
        while (lIllIIllIlll(i, iArr.length)) {
            int[] iArr2 = new int[llIlIIlII[0]];
            iArr2[llIlIIlII[1]] = iArr[i];
            if (lIllIIlllIII(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIlIIlII[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((152 ^ 147) ^ (135 ^ 147)) & (((213 ^ 157) ^ (111 ^ 56)) ^ (-" ".length()));
            }
        }
        return llIlIIlII[0];
    }

    private static boolean lIllIIlllIII(int i) {
        return i == 0;
    }

    private static boolean lIllIIlllIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIlllIIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIllIIIllIIl() {
        llIIllIll = new String[llIlIIlII[344]];
        llIIllIll[llIlIIlII[1]] = lIlIllIllIII("bqmniugVDr5Z149su1FMUvcerauW1FocMyTKTU2qTuwSCRGSuxAT9Uy3IXyjRMlH", "QATyw");
        llIIllIll[llIlIIlII[0]] = lIlIllIllIIl("4IThmQppXdN4HJFXLfcZzA==", "OKHRL");
        llIIllIll[llIlIIlII[5]] = lIlIllIllIlI("VFkSBC0NEXYxIBgNMwA5", "yyVaL");
        llIIllIll[llIlIIlII[6]] = lIlIllIllIlI("", "ZWjuW");
        llIIllIll[llIlIIlII[7]] = lIlIllIllIlI("JxUycC4GVCYxNAI=", "itDPZ");
        llIIllIll[llIlIIlII[9]] = lIlIllIllIlI("MQgMNS0QBwVxIxgHCTgvHg==", "yibQA");
        llIIllIll[llIlIIlII[18]] = lIlIllIllIII("8zut1P7bD7fQlMyarZ4Qogp3J87ww3ri+JTi8XbrR56VfZeTzBcVeOTy+7YFurd+hqzJZeiNmJU=", "bRtkd");
        llIIllIll[llIlIIlII[25]] = lIlIllIllIlI("AAtCBhMyTg8OEiQHDABBJhsHFBV3HRcXETsHBxRNdx0VDhU0BgsJBncaDUcjAjcrKSY=", "Wnbga");
        llIIllIll[llIlIIlII[26]] = lIlIllIllIlI("HRoFLBo=", "YhlBq");
        llIIllIll[llIlIIlII[27]] = lIlIllIllIII("/3a2UaXI8DY=", "upFAy");
        llIIllIll[llIlIIlII[19]] = lIlIllIllIIl("ORp9f71j0x4=", "ayzNe");
        llIIllIll[llIlIIlII[31]] = lIlIllIllIlI("MBsmJSo=", "csGWA");
        llIIllIll[llIlIIlII[32]] = lIlIllIllIlI("FgIh", "ScUBo");
        llIIllIll[llIlIIlII[33]] = lIlIllIllIIl("ZtPMql7Mn5I=", "bhwQR");
        llIIllIll[llIlIIlII[34]] = lIlIllIllIIl("vsqIX/vJ2shWwO5esBDLFQ==", "fqSKi");
        llIIllIll[llIlIIlII[35]] = lIlIllIllIlI("BhElIwY2HA==", "BtKVj");
        llIIllIll[llIlIIlII[36]] = lIlIllIllIlI("FSw0IgglIQ==", "QIZWd");
        llIIllIll[llIlIIlII[46]] = lIlIllIllIII("S0LV86WeA1TSU2XII1evig==", "HYSpp");
        llIIllIll[llIlIIlII[43]] = lIlIllIllIIl("lp014rlirXZJE5ifK5NL8J5wuxdyjpGN", "HCKlI");
        llIIllIll[llIlIIlII[47]] = lIlIllIllIlI("KBgaADk=", "zwykJ");
        llIIllIll[llIlIIlII[48]] = lIlIllIllIII("zGD9LPr8PwM=", "BIvTc");
        llIIllIll[llIlIIlII[54]] = lIlIllIllIlI("NBYMOTceFAJ0JhIZCjoxVwgKNz4E", "wzeTU");
        llIIllIll[llIlIIlII[55]] = lIlIllIllIII("P+T5Iew7elI=", "JrvWw");
        llIIllIll[llIlIIlII[60]] = lIlIllIllIIl("/42yL387K0ay51jS+jINkqGhJzOk7L7j", "uPpzR");
        llIIllIll[llIlIIlII[30]] = lIlIllIllIII("cVE2qa4Zstc=", "nagJT");
        llIIllIll[llIlIIlII[62]] = lIlIllIllIlI("NAEAFCoeAw5ZPB8EGx1oBQIKEjs=", "wmiyH");
        llIIllIll[llIlIIlII[40]] = lIlIllIllIII("01gdOnHpNAU=", "ClTUF");
        llIIllIll[llIlIIlII[63]] = lIlIllIllIlI("NyoWJDobKgVhKQAhDCA=", "rDbAH");
        llIIllIll[llIlIIlII[64]] = lIlIllIllIlI("CigHJxtrHww9CCo0ASw=", "KZbIz");
        llIIllIll[llIlIIlII[65]] = lIlIllIllIlI("PRk3Og==", "riRTM");
        llIIllIll[llIlIIlII[39]] = lIlIllIllIlI("MgUe", "vdzxb");
        llIIllIll[llIlIIlII[67]] = lIlIllIllIII("Dx0SNNeRk7GTI7udHp+7+Q==", "GQaAs");
        llIIllIll[llIlIIlII[68]] = lIlIllIllIII("dgTSmUzquhtThdBNTSmMGQ==", "sIOnI");
        llIIllIll[llIlIIlII[69]] = lIlIllIllIII("TNaWgpviogZPvKycrbei5A==", "rjRbd");
        llIIllIll[llIlIIlII[71]] = lIlIllIllIlI("KSgYGicCN1EPPAk+EA==", "lPqnN");
        llIIllIll[llIlIIlII[70]] = lIlIllIllIII("zTGlXrNomLrRF/V3NiUjfw==", "jqkEs");
        llIIllIll[llIlIIlII[72]] = lIlIllIllIII("aq3zJ/u1yCs=", "pFNel");
        llIIllIll[llIlIIlII[74]] = lIlIllIllIlI("Eik8JlYUJj4xFz8rLw==", "QHJCv");
        llIIllIll[llIlIIlII[75]] = lIlIllIllIII("6Lhs7tm8F/jitNK7NJY8lQ==", "VrgDr");
        llIIllIll[llIlIIlII[76]] = lIlIllIllIII("3NOqIEh2uDBhV4lxuSxhiw==", "NTibl");
        llIIllIll[llIlIIlII[77]] = lIlIllIllIIl("XQTw1lnTzmc=", "gDNme");
        llIIllIll[llIlIIlII[80]] = lIlIllIllIIl("VHaEeJVm5xRN7b49SDvuuQ==", "uehKU");
        llIIllIll[llIlIIlII[81]] = lIlIllIllIIl("+TphoIkt/To=", "kVQUF");
        llIIllIll[llIlIIlII[2]] = lIlIllIllIIl("lUTdQ7lMh5nJhoepXvcU6PFyMbs6oL8H2cXnBCqEDuM=", "BVahx");
        llIIllIll[llIlIIlII[130]] = lIlIllIllIlI("AgM7BjsuAyhDOjMfIA0uLwIjBw==", "GmOcI");
        llIIllIll[llIlIIlII[131]] = lIlIllIllIlI("ET8XOAwlIwo7Bg==", "BKeWb");
        llIIllIll[llIlIIlII[132]] = lIlIllIllIIl("FdNSLsfDq0s=", "TpQIn");
        llIIllIll[llIlIIlII[136]] = lIlIllIllIII("Bam2t7g6GqfCZjzvYETWUw==", "InZHP");
        llIIllIll[llIlIIlII[137]] = lIlIllIllIlI("Ag0OEg==", "Vlewi");
        llIIllIll[llIlIIlII[138]] = lIlIllIllIIl("p8Xui953BsfdSN2LWei63Q==", "wLmql");
        llIIllIll[llIlIIlII[29]] = lIlIllIllIII("TFCVG99HufwJ3jn/BPR2Rw==", "vQqpT");
        llIIllIll[llIlIIlII[141]] = lIlIllIllIlI("FRw7ChFmOyAFHTQLNRcR", "FhTdt");
        llIIllIll[llIlIIlII[142]] = lIlIllIllIII("I2oarUqByKzQVejcDJlzcQ==", "XVBlF");
        llIIllIll[llIlIIlII[143]] = lIlIllIllIII("g3gPwzBMGVCfHGQw5WwZtQ==", "cBfBe");
        llIIllIll[llIlIIlII[144]] = lIlIllIllIII("HUPhhs8fLT8Kjo9y3wU8GQ==", "HDfxv");
        llIIllIll[llIlIIlII[145]] = lIlIllIllIlI("JhkhTxkHWCQbDAEK", "hxWom");
        llIIllIll[llIlIIlII[146]] = lIlIllIllIlI("Gg0lJjR0BSM8OA==", "YaLKV");
        llIIllIll[llIlIIlII[149]] = lIlIllIllIII("EVoZkV9iRZAdJCaWGi2ebw==", "QhaWb");
        llIIllIll[llIlIIlII[150]] = lIlIllIllIII("lLnQyaRHm0YaxrCZwLXyXw==", "ZSucE");
        llIIllIll[llIlIIlII[152]] = lIlIllIllIlI("MhY3ExY=", "psEao");
        llIIllIll[llIlIIlII[153]] = lIlIllIllIIl("wm58NzjF5cY=", "xaqwE");
        llIIllIll[llIlIIlII[154]] = lIlIllIllIlI("JRQfFEwkCR4DBQA=", "cfzql");
        llIIllIll[llIlIIlII[156]] = lIlIllIllIII("FuOsRkFwDz8=", "uLHug");
        llIIllIll[llIlIIlII[157]] = lIlIllIllIlI("Mg8CEg==", "fniwb");
        llIIllIll[llIlIIlII[160]] = lIlIllIllIII("uQeKzuY8anHU4U5wcY3hLA==", "UwTfl");
        llIIllIll[llIlIIlII[161]] = lIlIllIllIIl("/nUmI33Szws=", "bfHgy");
        llIIllIll[llIlIIlII[169]] = lIlIllIllIlI("CSolZi0oayEpOiw4", "GKSFY");
        llIIllIll[llIlIIlII[170]] = lIlIllIllIlI("GQ4FAzN6BAUcIi5CHgEyMRE=", "ZblnQ");
        llIIllIll[llIlIIlII[171]] = lIlIllIllIIl("G9ke7HRLncQ=", "NgUoJ");
        llIIllIll[llIlIIlII[172]] = lIlIllIllIII("W90RRhj+n7U=", "SmcEA");
        llIIllIll[llIlIIlII[173]] = lIlIllIllIII("T+JlGOCuG3nlJv7kxT3f6uNTICDF/qSi", "JGZGd");
        llIIllIll[llIlIIlII[174]] = lIlIllIllIIl("p0KOjoBEVN0=", "YtUtA");
        llIIllIll[llIlIIlII[175]] = lIlIllIllIII("WVm7UTwrHkV67hHqUB3y127F94mGWKFG", "lZrWE");
        llIIllIll[llIlIIlII[176]] = lIlIllIllIIl("kSsKZtKsMAg=", "ZkKso");
        llIIllIll[llIlIIlII[177]] = lIlIllIllIIl("PFR9onQ36OC/Q0p2MLZLfJXyCPTveZXF", "FruAm");
        llIIllIll[llIlIIlII[178]] = lIlIllIllIII("9gFoeNnShPA=", "jaZII");
        llIIllIll[llIlIIlII[179]] = lIlIllIllIlI("BwIVAB8rAgZFDDAJDwQ=", "Blaem");
        llIIllIll[llIlIIlII[180]] = lIlIllIllIlI("DQoIOBZsPQMiBS0WDjM=", "LxmVw");
        llIIllIll[llIlIIlII[181]] = lIlIllIllIIl("uOGlJqdwyQA=", "HZjUG");
        llIIllIll[llIlIIlII[182]] = lIlIllIllIIl("BZN2xn59v2APC1WlSEXAvA==", "bkjbP");
        llIIllIll[llIlIIlII[4]] = lIlIllIllIIl("F2C/sxrkJ9v5LnaQPfxa6w==", "Kijot");
        llIIllIll[llIlIIlII[183]] = lIlIllIllIII("WsrIdfbdqLA=", "RmKZr");
        llIIllIll[llIlIIlII[184]] = lIlIllIllIII("+6jN3twzOzRsUuHeZA+cnw==", "WbVLj");
        llIIllIll[llIlIIlII[185]] = lIlIllIllIIl("x3iPs5KWYw4Yl+yjlbiVyw==", "hHhRY");
        llIIllIll[llIlIIlII[186]] = lIlIllIllIII("79xn/JdmHD7dTc2fqAJ6+w==", "BjEkR");
        llIIllIll[llIlIIlII[187]] = lIlIllIllIlI("KQ0yPBs=", "lcFYi");
        llIIllIll[llIlIIlII[164]] = lIlIllIllIlI("LhQiACAFC2sXKB0J", "klKtI");
        llIIllIll[llIlIIlII[188]] = lIlIllIllIIl("PUdD2EtijAQ=", "kvjTq");
        llIIllIll[llIlIIlII[212]] = lIlIllIllIIl("MnQcbhy5UNIT7Xk2AxcBvfuK67xCNViK", "gAwNc");
        llIIllIll[llIlIIlII[213]] = lIlIllIllIII("13jru0Kc8lMqHEFsemErTQ==", "yFlIX");
        llIIllIll[llIlIIlII[214]] = lIlIllIllIII("Y+WgnsKNcvt16MkA+azMb0rDTq7CfRKN", "jnNMN");
        llIIllIll[llIlIIlII[215]] = lIlIllIllIII("JawObEeCp6c=", "mNMvx");
        llIIllIll[llIlIIlII[216]] = lIlIllIllIIl("+gFLexoAl6c=", "vuIck");
        llIIllIll[llIlIIlII[217]] = lIlIllIllIIl("FlutfwrvawrfuRuYU5GHA0a8gXf6TcAs", "QOFuW");
        llIIllIll[llIlIIlII[165]] = lIlIllIllIlI("GgYBABo=", "Yjhmx");
        llIIllIll[llIlIIlII[218]] = lIlIllIllIII("Lg1qaeL+mK1FJ9485Pyj+BhusX/bwcnW", "OYOaf");
        llIIllIll[llIlIIlII[219]] = lIlIllIllIII("JKla9H52Pz8=", "jkRTb");
        llIIllIll[llIlIIlII[220]] = lIlIllIllIlI("JQYtGDsPBCNVLQ4DNhF5FAUnHio=", "fjDuY");
        llIIllIll[llIlIIlII[221]] = lIlIllIllIIl("slPKDMjcHOU=", "QfCXy");
        llIIllIll[llIlIIlII[222]] = lIlIllIllIIl("UsAGqGv80ylNHfD7dUa9yQ==", "knKWC");
        llIIllIll[llIlIIlII[223]] = lIlIllIllIlI("KDEzDTVJBjgXJggtNQY=", "iCVcT");
        llIIllIll[llIlIIlII[224]] = lIlIllIllIlI("KD8tFg==", "gOHxq");
        llIIllIll[llIlIIlII[225]] = lIlIllIllIlI("Hz4GDQ40IU8YFT8oDg==", "ZFoyg");
        llIIllIll[llIlIIlII[226]] = lIlIllIllIII("undylOslYnUHRGoamkgzwQ==", "dhAYV");
        llIIllIll[llIlIIlII[227]] = lIlIllIllIIl("ba8a835ZdzQ=", "gGoKH");
        llIIllIll[llIlIIlII[228]] = lIlIllIllIII("jLep0Jaex4/gVJiBw7UBqg==", "CPcvd");
        llIIllIll[llIlIIlII[229]] = lIlIllIllIII("FRCWKFXEUJt8huX1iXwMZg==", "gcvHQ");
        llIIllIll[llIlIIlII[230]] = lIlIllIllIlI("MyclJmU1KCcxJB4lNg==", "pFSCE");
        llIIllIll[llIlIIlII[231]] = lIlIllIllIlI("Chg5NBk=", "OvMQk");
        llIIllIll[llIlIIlII[232]] = lIlIllIllIlI("EhE4ETs5DnEGMyEM", "WiQeR");
        llIIllIll[llIlIIlII[233]] = lIlIllIllIlI("EBwwPA==", "UdYHm");
        llIIllIll[llIlIIlII[234]] = lIlIllIllIIl("0fH4NqJbgKDdhM2F4jPBq2V3Sdj6WXw4Vg9DI89UZQM=", "slxNC");
        llIIllIll[llIlIIlII[235]] = lIlIllIllIlI("IxQnLh4PFDRrHxIIPCULDhU/Lw==", "fzSKl");
        llIIllIll[llIlIIlII[236]] = lIlIllIllIII("sP4pzqVmdbX60kd6Sf5KCw==", "oucBZ");
        llIIllIll[llIlIIlII[237]] = lIlIllIllIlI("MysGAQo=", "vErdx");
        llIIllIll[llIlIIlII[238]] = lIlIllIllIIl("f/5732Kg5cXq1QGnY76Jrg==", "LuCJI");
        llIIllIll[llIlIIlII[239]] = lIlIllIllIlI("Nw0cAQhUBxweGQBBBwMJHxI=", "taulj");
        llIIllIll[llIlIIlII[240]] = lIlIllIllIII("a9bvyRzcwdA=", "gPtwi");
        llIIllIll[llIlIIlII[168]] = lIlIllIllIIl("zp9alxL6TSQ=", "hshwV");
        llIIllIll[llIlIIlII[241]] = lIlIllIllIII("+hO9YD3B0qfkxrGpk4uk2/5S2MkDn7j6", "Mhdtr");
        llIIllIll[llIlIIlII[242]] = lIlIllIllIlI("EDkZBi8=", "SUpkM");
        llIIllIll[llIlIIlII[243]] = lIlIllIllIIl("fsBTlGYj5Jg7anFIQfnuDCkNhsopjitr", "gAeyk");
        llIIllIll[llIlIIlII[244]] = lIlIllIllIlI("ASABJBI=", "BLhIp");
        llIIllIll[llIlIIlII[245]] = lIlIllIllIlI("OTQnOwkTNil2HxIxPDJLCDctPRg=", "zXNVk");
        llIIllIll[llIlIIlII[246]] = lIlIllIllIII("mP85+XdyMpY=", "KXUfU");
        llIIllIll[llIlIIlII[247]] = lIlIllIllIIl("GmJvOjF6BgZQzUqzIi5L5g==", "Ljkfc");
        llIIllIll[llIlIIlII[248]] = lIlIllIllIIl("80gqh+tfwdorHnsvJ/KdBg==", "ryfeQ");
        llIIllIll[llIlIIlII[249]] = lIlIllIllIlI("KyMVDQ==", "dSpcK");
        llIIllIll[llIlIIlII[250]] = lIlIllIllIIl("3TyQIVyClT9zcIDAjAhvQA==", "dOanV");
        llIIllIll[llIlIIlII[251]] = lIlIllIllIIl("/n1FkubnrVV8MABAJ65aGg==", "XCDVw");
        llIIllIll[llIlIIlII[252]] = lIlIllIllIIl("ZC2DtyUP6uU=", "fcyhn");
        llIIllIll[llIlIIlII[253]] = lIlIllIllIlI("KQMVEHYvDBcHNwQBBg==", "jbcuV");
        llIIllIll[llIlIIlII[254]] = lIlIllIllIIl("hGjn6Zouxo9h95tvmBhFSg==", "auTMj");
        llIIllIll[llIlIIlII[255]] = lIlIllIllIIl("wCBvUxM1pYMRQZDgSK9RYA==", "tRWOI");
        llIIllIll[llIlIIlII[256]] = lIlIllIllIIl("95nlgJFcu1g=", "nmBij");
        llIIllIll[llIlIIlII[257]] = lIlIllIllIII("TgNcIUVQWSKr5hUPZM+ymw==", "xXDUs");
        llIIllIll[llIlIIlII[258]] = lIlIllIllIlI("HT88Jg==", "XGURH");
        llIIllIll[llIlIIlII[273]] = lIlIllIllIlI("JwodSzwGSy4KLA4KGRhoCgodDg==", "ikkkH");
        llIIllIll[llIlIIlII[274]] = lIlIllIllIlI("Jz8eFTcLPw1QJgMnDw==", "bQjpE");
        llIIllIll[llIlIIlII[275]] = lIlIllIllIII("j6RVzTHmirht0hyBKpOoEw==", "DYpNO");
        llIIllIll[llIlIIlII[276]] = lIlIllIllIIl("QsmGYJtTPyk=", "KxXov");
        llIIllIll[llIlIIlII[277]] = lIlIllIllIIl("dW1ZdVPJl4oyk+m8v8aQyg==", "mroVV");
        llIIllIll[llIlIIlII[278]] = lIlIllIllIlI("CiAwATJpOiQAJA==", "IHQnA");
        llIIllIll[llIlIIlII[291]] = lIlIllIllIII("a56Ir6Krq3iotLCmujkK0e78PYG6v1Q7", "ATINW");
        llIIllIll[llIlIIlII[292]] = lIlIllIllIlI("Mh8bIRkDBQ==", "fwiNn");
        llIIllIll[llIlIIlII[293]] = lIlIllIllIlI("OSUWGgMIPw==", "mMdut");
        llIIllIll[llIlIIlII[294]] = lIlIllIllIlI("KC81CnkuNiob", "kNCoY");
        llIIllIll[llIlIIlII[296]] = lIlIllIllIlI("AzgpERI=", "QWJza");
        llIIllIll[llIlIIlII[297]] = lIlIllIllIII("Hq2Dl68XDF4=", "DdCpw");
        llIIllIll[llIlIIlII[298]] = lIlIllIllIlI("NTUrLik=", "gZHEZ");
        llIIllIll[llIlIIlII[299]] = lIlIllIllIIl("p3wqxOIrLDo=", "EwNKi");
        llIIllIll[llIlIIlII[300]] = lIlIllIllIII("QWzMR9DG8d0=", "CWXwJ");
        llIIllIll[llIlIIlII[301]] = lIlIllIllIlI("LhYyPGEoDy0t", "mwDYA");
        llIIllIll[llIlIIlII[302]] = lIlIllIllIIl("CUZvD9wmW38=", "wgqAw");
        llIIllIll[llIlIIlII[303]] = lIlIllIllIlI("EB4UDwc=", "Bqwdt");
        llIIllIll[llIlIIlII[304]] = lIlIllIllIIl("6oZ182wuQA4=", "gkben");
        llIIllIll[llIlIIlII[305]] = lIlIllIllIII("20MCjHvHwtQ=", "kTLkX");
        llIIllIll[llIlIIlII[306]] = lIlIllIllIII("WU5cu6J0KD0=", "DARlO");
        llIIllIll[llIlIIlII[307]] = lIlIllIllIII("ma+mp84Kd5PWx/6OCgQmqw==", "qHffc");
        llIIllIll[llIlIIlII[308]] = lIlIllIllIlI("NCsRIiM=", "fDrIP");
        llIIllIll[llIlIIlII[309]] = lIlIllIllIII("aTGmqdUJFWo=", "AEXGT");
        llIIllIll[llIlIIlII[310]] = lIlIllIllIIl("5FfmZXEKxqs=", "PvpHj");
        llIIllIll[llIlIIlII[311]] = lIlIllIllIIl("t2U1pjsTYsnOVuZPshz4dA==", "sqAkj");
        llIIllIll[llIlIIlII[313]] = lIlIllIllIII("n8ZZ+P8CB810y0+jV2vtgw==", "DKnUz");
        llIIllIll[llIlIIlII[314]] = lIlIllIllIlI("AAAIHQIwFRoR", "Stitp");
        llIIllIll[llIlIIlII[315]] = lIlIllIllIIl("NtMvIgf6qGeCDaFGdy5j8g==", "ljqlw");
        llIIllIll[llIlIIlII[316]] = lIlIllIllIII("3hm0iBujaaLkQCX9X6SdYA==", "CiWgB");
        llIIllIll[llIlIIlII[317]] = lIlIllIllIII("PpKLdtSguln/3R8KmrnhoQ==", "rZZSi");
        llIIllIll[llIlIIlII[318]] = lIlIllIllIlI("LS4LJDMcNA==", "yFyKD");
        llIIllIll[llIlIIlII[319]] = lIlIllIllIIl("x09jVApMQ5k=", "Cwjlx");
        llIIllIll[llIlIIlII[320]] = lIlIllIllIII("R9i95nr5ORoQdv+p+b+0MQ==", "loPSU");
        llIIllIll[llIlIIlII[321]] = lIlIllIllIlI("MQkC", "uhflR");
        llIIllIll[llIlIIlII[322]] = lIlIllIllIII("ojsnICj7aks=", "scDEj");
        llIIllIll[llIlIIlII[323]] = lIlIllIllIlI("NAQx", "peUnS");
        llIIllIll[llIlIIlII[324]] = lIlIllIllIIl("DgZ4WEbjqmE=", "RXUct");
        llIIllIll[llIlIIlII[325]] = lIlIllIllIIl("vbYi4SH2ztc=", "kDErL");
        llIIllIll[llIlIIlII[326]] = lIlIllIllIIl("4Mk3qgsOP2I=", "weLXd");
        llIIllIll[llIlIIlII[327]] = lIlIllIllIII("5NWmFT4EvEo=", "QYbuN");
        llIIllIll[llIlIIlII[328]] = lIlIllIllIIl("Gb3P1Yb7dIU=", "yTBRQ");
        llIIllIll[llIlIIlII[339]] = lIlIllIllIIl("U4yh2rzD0DI=", "YNLrz");
        llIIllIll[llIlIIlII[283]] = lIlIllIllIlI("MSUICS5FBBMXLQswDwouAXc=", "eWgeB");
        llIIllIll[llIlIIlII[340]] = lIlIllIllIlI("FxI6fQ==", "NwISC");
        llIIllIll[llIlIIlII[341]] = lIlIllIllIIl("SYlTF94H+Qd+T7PcrTbyjh6Y62OpgJuJXPgfh3MlenjROepiCGTA7A==", "uIPCD");
        llIIllIll[llIlIIlII[342]] = lIlIllIllIIl("SiiUkLFIW6su+BuAcYnYkAY1pI7J6DmsWoBsuW9SvVQ=", "OMPXe");
        llIIllIll[llIlIIlII[343]] = lIlIllIllIII("ksYgcJnxpy4LEhICh6ciiZ+xHvMp2y4g", "UTxKP");
    }

    private static boolean lIllIlIIIIII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean cm() {
        WorldArea worldArea = new WorldArea(llIlIIlII[162], llIlIIlII[163], llIlIIlII[164], llIlIIlII[165], llIlIIlII[1]);
        WorldArea worldArea2 = new WorldArea(llIlIIlII[166], llIlIIlII[167], llIlIIlII[168], llIlIIlII[161], llIlIIlII[1]);
        if (!lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIllIIllIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            ?? r0 = llIlIIlII[0];
            "".length();
            return "  ".length() != "  ".length() ? ((((161 + 92) - 174) + 161) ^ (((145 + 107) - 182) + 109)) & (((99 ^ 1) ^ (226 ^ 195)) ^ (-" ".length())) : r0;
        }
        return llIlIIlII[1];
    }

    static {
        lIllIIllIlII();
        lIllIIIllIIl();
        bx = new ArrayList();
        ga = new WorldArea(llIlIIlII[329], llIlIIlII[330], llIlIIlII[183], llIlIIlII[146], llIlIIlII[1]);
        gb = new WorldArea(llIlIIlII[331], llIlIIlII[332], llIlIIlII[138], llIlIIlII[170], llIlIIlII[5]);
        gc = new WorldArea(llIlIIlII[333], llIlIIlII[334], llIlIIlII[136], llIlIIlII[161], llIlIIlII[0]);
        gd = new WorldArea(llIlIIlII[331], llIlIIlII[335], llIlIIlII[149], llIlIIlII[171], llIlIIlII[1]);
        dg = new WorldPoint(llIlIIlII[336], llIlIIlII[337], llIlIIlII[1]);
        dL = llIlIIlII[338];
        dk = llIlIIlII[1];
        ge = new int[llIlIIlII[1]];
        dc = llIIllIll[llIlIIlII[339]];
        h = llIIllIll[llIlIIlII[283]];
        String[] strArr = new String[llIlIIlII[7]];
        strArr[llIlIIlII[1]] = llIIllIll[llIlIIlII[340]];
        strArr[llIlIIlII[0]] = llIIllIll[llIlIIlII[341]];
        strArr[llIlIIlII[5]] = llIIllIll[llIlIIlII[342]];
        strArr[llIlIIlII[6]] = llIIllIll[llIlIIlII[343]];
        cG = strArr;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            cl();
            "".length();
            if ("   ".length() >= ((85 ^ 113) ^ (83 ^ 115))) {
                return ((97 ^ 43) ^ (65 ^ 4)) & (((164 ^ 179) ^ (87 ^ 79)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIlIIlII[223];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIllIIlllIIl(C0004e.j(dL), llIlIIlII[29])) {
            ?? r0 = llIlIIlII[0];
            "".length();
            return " ".length() < (-" ".length()) ? ((247 ^ 131) ^ (173 ^ 151)) & (((107 ^ 101) ^ (24 ^ 88)) ^ (-" ".length())) : r0;
        }
        return llIlIIlII[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (lIllIIlllIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void t(String str) {
        if (!lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[33]) || lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[46])) {
            String[] strArr = new String[llIlIIlII[0]];
            strArr[llIlIIlII[1]] = llIIllIll[llIlIIlII[277]];
        }
        Magic.cast(SpellBook.Standard.FIRE_STRIKE, NPCs.getNearest(npc -> {
            if (lIllIIllIllI(npc.getName().equalsIgnoreCase(str) ? 1 : 0) && lIllIIlllIII(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIlIIlII[0];
                "".length();
                return " ".length() != " ".length() ? ((155 ^ 132) ^ (85 ^ 117)) & (((233 ^ 148) ^ (229 ^ 167)) ^ (-" ".length())) : r0;
            }
            return llIlIIlII[1];
        }));
        Time.sleepTicks(llIlIIlII[5]);
        "".length();
        String[] strArr2 = new String[llIlIIlII[0]];
        strArr2[llIlIIlII[1]] = llIIllIll[llIlIIlII[278]];
        if (lIllIIllIllI(Inventory.contains(strArr2) ? 1 : 0)) {
            if (lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[46]) && lIllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlIIlII[60])) {
                Magic.cast(SpellBook.Standard.WIND_BOLT, NPCs.getNearest(npc2 -> {
                    if (lIllIIllIllI(npc2.getName().equalsIgnoreCase(str) ? 1 : 0) && lIllIIlllIII(npc2.isDead() ? 1 : 0)) {
                        ?? r0 = llIlIIlII[0];
                        "".length();
                        return (-" ".length()) > ((176 ^ 144) & ((186 ^ 154) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIIlII[1];
                }));
                Time.sleepTicks(llIlIIlII[5]);
                "".length();
            }
            if (lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[60]) && lIllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlIIlII[65])) {
                Magic.cast(SpellBook.Standard.WATER_BOLT, NPCs.getNearest(npc3 -> {
                    if (lIllIIllIllI(npc3.getName().equalsIgnoreCase(str) ? 1 : 0) && lIllIIlllIII(npc3.isDead() ? 1 : 0)) {
                        ?? r0 = llIlIIlII[0];
                        "".length();
                        return 0 != 0 ? ((((61 + 143) - 135) + 108) ^ (((51 + 124) - 172) + 158)) & (((((0 + 152) - (-26)) + 3) ^ (((133 + 61) - 137) + 108)) ^ (-" ".length())) : r0;
                    }
                    return llIlIIlII[1];
                }));
                Time.sleepTicks(llIlIIlII[5]);
                "".length();
            }
            if (lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[65]) && lIllIIllIlll(Skills.getLevel(Skill.MAGIC), llIlIIlII[70])) {
                Magic.cast(SpellBook.Standard.EARTH_BOLT, NPCs.getNearest(npc4 -> {
                    if (lIllIIllIllI(npc4.getName().equalsIgnoreCase(str) ? 1 : 0) && lIllIIlllIII(npc4.isDead() ? 1 : 0)) {
                        ?? r0 = llIlIIlII[0];
                        "".length();
                        return 0 != 0 ? ((((32 + 7) - (-79)) + 30) ^ (((4 + 80) - (-38)) + 56)) & (((129 ^ 184) ^ (102 ^ 121)) ^ (-" ".length())) : r0;
                    }
                    return llIlIIlII[1];
                }));
                Time.sleepTicks(llIlIIlII[5]);
                "".length();
            }
            if (lIllIIlllIIl(Skills.getLevel(Skill.MAGIC), llIlIIlII[70])) {
                Magic.cast(SpellBook.Standard.FIRE_BOLT, NPCs.getNearest(npc5 -> {
                    if (lIllIIllIllI(npc5.getName().equalsIgnoreCase(str) ? 1 : 0) && lIllIIlllIII(npc5.isDead() ? 1 : 0)) {
                        ?? r0 = llIlIIlII[0];
                        "".length();
                        return (((62 ^ 111) ^ (246 ^ 133)) & (((39 ^ 57) ^ (162 ^ 158)) ^ (-" ".length()))) != 0 ? ((30 ^ 39) ^ (66 ^ 105)) & (((80 ^ 14) ^ (243 ^ 191)) ^ (-" ".length())) : r0;
                    }
                    return llIlIIlII[1];
                }));
                Time.sleepTicks(llIlIIlII[5]);
                "".length();
            }
        }
    }

    private static String lIlIllIllIII(String lIIlIlIIIIllIl, String lIIlIlIIIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIlII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIlIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIlIIIIlllI) {
            lIIlIlIIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIllllII(int i) {
        return i < 0;
    }

    private static int lIllIIllIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return h + dc;
    }

    private static boolean lIllIIllllll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0181, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[11]) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x020a, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[11]) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0293, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[11]) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x031c, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[11]) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03a5, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[16]) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x042f, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[11]) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x04b8, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[11]) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x05c4, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[7]) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[19]) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x064e, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[7]) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x06d4, code lost:
        if (lIllIIllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.L.llIlIIlII[48]) != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x071e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        int[] iArr13;
        int[] iArr14;
        int[] iArr15 = new int[llIlIIlII[0]];
        iArr15[llIlIIlII[1]] = llIlIIlII[279];
        if (lIllIIllIllI(Bank.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[llIlIIlII[0]];
            iArr16[llIlIIlII[1]] = llIlIIlII[279];
            if (lIllIIllIllI(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIlIIlII[0]];
                iArr17[llIlIIlII[1]] = llIlIIlII[279];
            }
            iArr = new int[llIlIIlII[0]];
            iArr[llIlIIlII[1]] = llIlIIlII[22];
            if (lIllIIlllIII(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(llIlIIlII[22], llIlIIlII[5], llIlIIlII[282]));
                "".length();
            }
            iArr2 = new int[llIlIIlII[0]];
            iArr2[llIlIIlII[1]] = llIlIIlII[23];
            if (lIllIIlllIII(Bank.contains(iArr2) ? 1 : 0)) {
                bx.add(new C0003d(llIlIIlII[23], llIlIIlII[0], llIlIIlII[282]));
                "".length();
            }
            iArr3 = new int[llIlIIlII[0]];
            iArr3[llIlIIlII[1]] = llIlIIlII[10];
            if (lIllIIllIllI(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr18 = new int[llIlIIlII[0]];
                iArr18[llIlIIlII[1]] = llIlIIlII[10];
                if (lIllIIllIllI(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[llIlIIlII[0]];
                    iArr19[llIlIIlII[1]] = llIlIIlII[10];
                }
                iArr4 = new int[llIlIIlII[0]];
                iArr4[llIlIIlII[1]] = llIlIIlII[17];
                if (lIllIIllIllI(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr20 = new int[llIlIIlII[0]];
                    iArr20[llIlIIlII[1]] = llIlIIlII[17];
                    if (lIllIIllIllI(Bank.contains(iArr20) ? 1 : 0)) {
                        int[] iArr21 = new int[llIlIIlII[0]];
                        iArr21[llIlIIlII[1]] = llIlIIlII[17];
                    }
                    iArr5 = new int[llIlIIlII[0]];
                    iArr5[llIlIIlII[1]] = llIlIIlII[14];
                    if (lIllIIllIllI(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr22 = new int[llIlIIlII[0]];
                        iArr22[llIlIIlII[1]] = llIlIIlII[14];
                        if (lIllIIllIllI(Bank.contains(iArr22) ? 1 : 0)) {
                            int[] iArr23 = new int[llIlIIlII[0]];
                            iArr23[llIlIIlII[1]] = llIlIIlII[14];
                        }
                        iArr6 = new int[llIlIIlII[0]];
                        iArr6[llIlIIlII[1]] = llIlIIlII[13];
                        if (lIllIIllIllI(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr24 = new int[llIlIIlII[0]];
                            iArr24[llIlIIlII[1]] = llIlIIlII[13];
                            if (lIllIIllIllI(Bank.contains(iArr24) ? 1 : 0)) {
                                int[] iArr25 = new int[llIlIIlII[0]];
                                iArr25[llIlIIlII[1]] = llIlIIlII[13];
                            }
                            iArr7 = new int[llIlIIlII[0]];
                            iArr7[llIlIIlII[1]] = llIlIIlII[15];
                            if (lIllIIllIllI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr26 = new int[llIlIIlII[0]];
                                iArr26[llIlIIlII[1]] = llIlIIlII[15];
                                if (lIllIIllIllI(Bank.contains(iArr26) ? 1 : 0)) {
                                    int[] iArr27 = new int[llIlIIlII[0]];
                                    iArr27[llIlIIlII[1]] = llIlIIlII[15];
                                }
                                iArr8 = new int[llIlIIlII[0]];
                                iArr8[llIlIIlII[1]] = llIlIIlII[12];
                                if (lIllIIllIllI(Bank.contains(iArr8) ? 1 : 0)) {
                                    int[] iArr28 = new int[llIlIIlII[0]];
                                    iArr28[llIlIIlII[1]] = llIlIIlII[12];
                                    if (lIllIIllIllI(Bank.contains(iArr28) ? 1 : 0)) {
                                        int[] iArr29 = new int[llIlIIlII[0]];
                                        iArr29[llIlIIlII[1]] = llIlIIlII[12];
                                    }
                                    iArr9 = new int[llIlIIlII[0]];
                                    iArr9[llIlIIlII[1]] = llIlIIlII[12];
                                    if (lIllIIllIllI(Bank.contains(iArr9) ? 1 : 0)) {
                                        int[] iArr30 = new int[llIlIIlII[0]];
                                        iArr30[llIlIIlII[1]] = llIlIIlII[12];
                                        if (lIllIIllIllI(Bank.contains(iArr30) ? 1 : 0)) {
                                            int[] iArr31 = new int[llIlIIlII[0]];
                                            iArr31[llIlIIlII[1]] = llIlIIlII[12];
                                        }
                                        if (lIllIIlllIII(Bank.contains(item -> {
                                            return item.getName().toLowerCase().contains(llIIllIll[llIlIIlII[291]]);
                                        }) ? 1 : 0)) {
                                            bx.add(new C0003d(llIlIIlII[284], llIlIIlII[9], llIlIIlII[285]));
                                            "".length();
                                        }
                                        iArr10 = new int[llIlIIlII[0]];
                                        iArr10[llIlIIlII[1]] = llIlIIlII[286];
                                        if (lIllIIlllIII(Bank.contains(iArr10) ? 1 : 0)) {
                                            bx.add(new C0003d(llIlIIlII[286], llIlIIlII[0], llIlIIlII[287]));
                                            "".length();
                                        }
                                        iArr11 = new int[llIlIIlII[0]];
                                        iArr11[llIlIIlII[1]] = llIlIIlII[21];
                                        if (lIllIIllIllI(Bank.contains(iArr11) ? 1 : 0)) {
                                            int[] iArr32 = new int[llIlIIlII[0]];
                                            iArr32[llIlIIlII[1]] = llIlIIlII[21];
                                            if (lIllIIllIllI(Bank.contains(iArr32) ? 1 : 0)) {
                                                int[] iArr33 = new int[llIlIIlII[0]];
                                                iArr33[llIlIIlII[1]] = llIlIIlII[21];
                                            }
                                            iArr12 = new int[llIlIIlII[0]];
                                            iArr12[llIlIIlII[1]] = llIlIIlII[28];
                                            if (lIllIIllIllI(Bank.contains(iArr12) ? 1 : 0)) {
                                                int[] iArr34 = new int[llIlIIlII[0]];
                                                iArr34[llIlIIlII[1]] = llIlIIlII[28];
                                                if (lIllIIllIllI(Bank.contains(iArr34) ? 1 : 0)) {
                                                    int[] iArr35 = new int[llIlIIlII[0]];
                                                    iArr35[llIlIIlII[1]] = llIlIIlII[28];
                                                }
                                                iArr13 = new int[llIlIIlII[0]];
                                                iArr13[llIlIIlII[1]] = llIlIIlII[24];
                                                if (lIllIIllIllI(Bank.contains(iArr13) ? 1 : 0)) {
                                                    int[] iArr36 = new int[llIlIIlII[0]];
                                                    iArr36[llIlIIlII[1]] = llIlIIlII[24];
                                                    if (lIllIIllIllI(Bank.contains(iArr36) ? 1 : 0)) {
                                                        int[] iArr37 = new int[llIlIIlII[0]];
                                                        iArr37[llIlIIlII[1]] = llIlIIlII[24];
                                                    }
                                                    iArr14 = new int[llIlIIlII[0]];
                                                    iArr14[llIlIIlII[1]] = llIlIIlII[20];
                                                    if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
                                                        int[] iArr38 = new int[llIlIIlII[0]];
                                                        iArr38[llIlIIlII[1]] = llIlIIlII[20];
                                                        if (!lIllIIllIllI(Bank.contains(iArr38) ? 1 : 0)) {
                                                            return;
                                                        }
                                                        int[] iArr39 = new int[llIlIIlII[0]];
                                                        iArr39[llIlIIlII[1]] = llIlIIlII[20];
                                                        if (!lIllIIllIlll(Bank.getFirst(iArr39).getQuantity(), llIlIIlII[35])) {
                                                            return;
                                                        }
                                                    }
                                                    bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
                                                    "".length();
                                                }
                                                bx.add(new C0003d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]));
                                                "".length();
                                                iArr14 = new int[llIlIIlII[0]];
                                                iArr14[llIlIIlII[1]] = llIlIIlII[20];
                                                if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
                                                }
                                                bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
                                                "".length();
                                            }
                                            bx.add(new C0003d(llIlIIlII[28], llIlIIlII[7], C0009j.ch));
                                            "".length();
                                            iArr13 = new int[llIlIIlII[0]];
                                            iArr13[llIlIIlII[1]] = llIlIIlII[24];
                                            if (lIllIIllIllI(Bank.contains(iArr13) ? 1 : 0)) {
                                            }
                                            bx.add(new C0003d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]));
                                            "".length();
                                            iArr14 = new int[llIlIIlII[0]];
                                            iArr14[llIlIIlII[1]] = llIlIIlII[20];
                                            if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
                                            }
                                            bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
                                            "".length();
                                        }
                                        bx.add(new C0003d(llIlIIlII[21], llIlIIlII[7], llIlIIlII[288]));
                                        "".length();
                                        iArr12 = new int[llIlIIlII[0]];
                                        iArr12[llIlIIlII[1]] = llIlIIlII[28];
                                        if (lIllIIllIllI(Bank.contains(iArr12) ? 1 : 0)) {
                                        }
                                        bx.add(new C0003d(llIlIIlII[28], llIlIIlII[7], C0009j.ch));
                                        "".length();
                                        iArr13 = new int[llIlIIlII[0]];
                                        iArr13[llIlIIlII[1]] = llIlIIlII[24];
                                        if (lIllIIllIllI(Bank.contains(iArr13) ? 1 : 0)) {
                                        }
                                        bx.add(new C0003d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]));
                                        "".length();
                                        iArr14 = new int[llIlIIlII[0]];
                                        iArr14[llIlIIlII[1]] = llIlIIlII[20];
                                        if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
                                        }
                                        bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
                                        "".length();
                                    }
                                    bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
                                    "".length();
                                    if (lIllIIlllIII(Bank.contains(item2 -> {
                                        return item2.getName().toLowerCase().contains(llIIllIll[llIlIIlII[291]]);
                                    }) ? 1 : 0)) {
                                    }
                                    iArr10 = new int[llIlIIlII[0]];
                                    iArr10[llIlIIlII[1]] = llIlIIlII[286];
                                    if (lIllIIlllIII(Bank.contains(iArr10) ? 1 : 0)) {
                                    }
                                    iArr11 = new int[llIlIIlII[0]];
                                    iArr11[llIlIIlII[1]] = llIlIIlII[21];
                                    if (lIllIIllIllI(Bank.contains(iArr11) ? 1 : 0)) {
                                    }
                                    bx.add(new C0003d(llIlIIlII[21], llIlIIlII[7], llIlIIlII[288]));
                                    "".length();
                                    iArr12 = new int[llIlIIlII[0]];
                                    iArr12[llIlIIlII[1]] = llIlIIlII[28];
                                    if (lIllIIllIllI(Bank.contains(iArr12) ? 1 : 0)) {
                                    }
                                    bx.add(new C0003d(llIlIIlII[28], llIlIIlII[7], C0009j.ch));
                                    "".length();
                                    iArr13 = new int[llIlIIlII[0]];
                                    iArr13[llIlIIlII[1]] = llIlIIlII[24];
                                    if (lIllIIllIllI(Bank.contains(iArr13) ? 1 : 0)) {
                                    }
                                    bx.add(new C0003d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]));
                                    "".length();
                                    iArr14 = new int[llIlIIlII[0]];
                                    iArr14[llIlIIlII[1]] = llIlIIlII[20];
                                    if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
                                    }
                                    bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
                                    "".length();
                                }
                                bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
                                "".length();
                                iArr9 = new int[llIlIIlII[0]];
                                iArr9[llIlIIlII[1]] = llIlIIlII[12];
                                if (lIllIIllIllI(Bank.contains(iArr9) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
                                "".length();
                                if (lIllIIlllIII(Bank.contains(item22 -> {
                                    return item22.getName().toLowerCase().contains(llIIllIll[llIlIIlII[291]]);
                                }) ? 1 : 0)) {
                                }
                                iArr10 = new int[llIlIIlII[0]];
                                iArr10[llIlIIlII[1]] = llIlIIlII[286];
                                if (lIllIIlllIII(Bank.contains(iArr10) ? 1 : 0)) {
                                }
                                iArr11 = new int[llIlIIlII[0]];
                                iArr11[llIlIIlII[1]] = llIlIIlII[21];
                                if (lIllIIllIllI(Bank.contains(iArr11) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(llIlIIlII[21], llIlIIlII[7], llIlIIlII[288]));
                                "".length();
                                iArr12 = new int[llIlIIlII[0]];
                                iArr12[llIlIIlII[1]] = llIlIIlII[28];
                                if (lIllIIllIllI(Bank.contains(iArr12) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(llIlIIlII[28], llIlIIlII[7], C0009j.ch));
                                "".length();
                                iArr13 = new int[llIlIIlII[0]];
                                iArr13[llIlIIlII[1]] = llIlIIlII[24];
                                if (lIllIIllIllI(Bank.contains(iArr13) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]));
                                "".length();
                                iArr14 = new int[llIlIIlII[0]];
                                iArr14[llIlIIlII[1]] = llIlIIlII[20];
                                if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
                                }
                                bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
                                "".length();
                            }
                            bx.add(new C0003d(llIlIIlII[15], llIlIIlII[16], llIlIIlII[283]));
                            "".length();
                            iArr8 = new int[llIlIIlII[0]];
                            iArr8[llIlIIlII[1]] = llIlIIlII[12];
                            if (lIllIIllIllI(Bank.contains(iArr8) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
                            "".length();
                            iArr9 = new int[llIlIIlII[0]];
                            iArr9[llIlIIlII[1]] = llIlIIlII[12];
                            if (lIllIIllIllI(Bank.contains(iArr9) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
                            "".length();
                            if (lIllIIlllIII(Bank.contains(item222 -> {
                                return item222.getName().toLowerCase().contains(llIIllIll[llIlIIlII[291]]);
                            }) ? 1 : 0)) {
                            }
                            iArr10 = new int[llIlIIlII[0]];
                            iArr10[llIlIIlII[1]] = llIlIIlII[286];
                            if (lIllIIlllIII(Bank.contains(iArr10) ? 1 : 0)) {
                            }
                            iArr11 = new int[llIlIIlII[0]];
                            iArr11[llIlIIlII[1]] = llIlIIlII[21];
                            if (lIllIIllIllI(Bank.contains(iArr11) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIlIIlII[21], llIlIIlII[7], llIlIIlII[288]));
                            "".length();
                            iArr12 = new int[llIlIIlII[0]];
                            iArr12[llIlIIlII[1]] = llIlIIlII[28];
                            if (lIllIIllIllI(Bank.contains(iArr12) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIlIIlII[28], llIlIIlII[7], C0009j.ch));
                            "".length();
                            iArr13 = new int[llIlIIlII[0]];
                            iArr13[llIlIIlII[1]] = llIlIIlII[24];
                            if (lIllIIllIllI(Bank.contains(iArr13) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]));
                            "".length();
                            iArr14 = new int[llIlIIlII[0]];
                            iArr14[llIlIIlII[1]] = llIlIIlII[20];
                            if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
                            "".length();
                        }
                        bx.add(new C0003d(llIlIIlII[13], llIlIIlII[11], llIlIIlII[19]));
                        "".length();
                        iArr7 = new int[llIlIIlII[0]];
                        iArr7[llIlIIlII[1]] = llIlIIlII[15];
                        if (lIllIIllIllI(Bank.contains(iArr7) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIlIIlII[15], llIlIIlII[16], llIlIIlII[283]));
                        "".length();
                        iArr8 = new int[llIlIIlII[0]];
                        iArr8[llIlIIlII[1]] = llIlIIlII[12];
                        if (lIllIIllIllI(Bank.contains(iArr8) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
                        "".length();
                        iArr9 = new int[llIlIIlII[0]];
                        iArr9[llIlIIlII[1]] = llIlIIlII[12];
                        if (lIllIIllIllI(Bank.contains(iArr9) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
                        "".length();
                        if (lIllIIlllIII(Bank.contains(item2222 -> {
                            return item2222.getName().toLowerCase().contains(llIIllIll[llIlIIlII[291]]);
                        }) ? 1 : 0)) {
                        }
                        iArr10 = new int[llIlIIlII[0]];
                        iArr10[llIlIIlII[1]] = llIlIIlII[286];
                        if (lIllIIlllIII(Bank.contains(iArr10) ? 1 : 0)) {
                        }
                        iArr11 = new int[llIlIIlII[0]];
                        iArr11[llIlIIlII[1]] = llIlIIlII[21];
                        if (lIllIIllIllI(Bank.contains(iArr11) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIlIIlII[21], llIlIIlII[7], llIlIIlII[288]));
                        "".length();
                        iArr12 = new int[llIlIIlII[0]];
                        iArr12[llIlIIlII[1]] = llIlIIlII[28];
                        if (lIllIIllIllI(Bank.contains(iArr12) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIlIIlII[28], llIlIIlII[7], C0009j.ch));
                        "".length();
                        iArr13 = new int[llIlIIlII[0]];
                        iArr13[llIlIIlII[1]] = llIlIIlII[24];
                        if (lIllIIllIllI(Bank.contains(iArr13) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]));
                        "".length();
                        iArr14 = new int[llIlIIlII[0]];
                        iArr14[llIlIIlII[1]] = llIlIIlII[20];
                        if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
                        "".length();
                    }
                    bx.add(new C0003d(llIlIIlII[14], llIlIIlII[11], llIlIIlII[19]));
                    "".length();
                    iArr6 = new int[llIlIIlII[0]];
                    iArr6[llIlIIlII[1]] = llIlIIlII[13];
                    if (lIllIIllIllI(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIlIIlII[13], llIlIIlII[11], llIlIIlII[19]));
                    "".length();
                    iArr7 = new int[llIlIIlII[0]];
                    iArr7[llIlIIlII[1]] = llIlIIlII[15];
                    if (lIllIIllIllI(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIlIIlII[15], llIlIIlII[16], llIlIIlII[283]));
                    "".length();
                    iArr8 = new int[llIlIIlII[0]];
                    iArr8[llIlIIlII[1]] = llIlIIlII[12];
                    if (lIllIIllIllI(Bank.contains(iArr8) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
                    "".length();
                    iArr9 = new int[llIlIIlII[0]];
                    iArr9[llIlIIlII[1]] = llIlIIlII[12];
                    if (lIllIIllIllI(Bank.contains(iArr9) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
                    "".length();
                    if (lIllIIlllIII(Bank.contains(item22222 -> {
                        return item22222.getName().toLowerCase().contains(llIIllIll[llIlIIlII[291]]);
                    }) ? 1 : 0)) {
                    }
                    iArr10 = new int[llIlIIlII[0]];
                    iArr10[llIlIIlII[1]] = llIlIIlII[286];
                    if (lIllIIlllIII(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                    iArr11 = new int[llIlIIlII[0]];
                    iArr11[llIlIIlII[1]] = llIlIIlII[21];
                    if (lIllIIllIllI(Bank.contains(iArr11) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIlIIlII[21], llIlIIlII[7], llIlIIlII[288]));
                    "".length();
                    iArr12 = new int[llIlIIlII[0]];
                    iArr12[llIlIIlII[1]] = llIlIIlII[28];
                    if (lIllIIllIllI(Bank.contains(iArr12) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIlIIlII[28], llIlIIlII[7], C0009j.ch));
                    "".length();
                    iArr13 = new int[llIlIIlII[0]];
                    iArr13[llIlIIlII[1]] = llIlIIlII[24];
                    if (lIllIIllIllI(Bank.contains(iArr13) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]));
                    "".length();
                    iArr14 = new int[llIlIIlII[0]];
                    iArr14[llIlIIlII[1]] = llIlIIlII[20];
                    if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
                    "".length();
                }
                bx.add(new C0003d(llIlIIlII[17], llIlIIlII[11], llIlIIlII[19]));
                "".length();
                iArr5 = new int[llIlIIlII[0]];
                iArr5[llIlIIlII[1]] = llIlIIlII[14];
                if (lIllIIllIllI(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlIIlII[14], llIlIIlII[11], llIlIIlII[19]));
                "".length();
                iArr6 = new int[llIlIIlII[0]];
                iArr6[llIlIIlII[1]] = llIlIIlII[13];
                if (lIllIIllIllI(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlIIlII[13], llIlIIlII[11], llIlIIlII[19]));
                "".length();
                iArr7 = new int[llIlIIlII[0]];
                iArr7[llIlIIlII[1]] = llIlIIlII[15];
                if (lIllIIllIllI(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlIIlII[15], llIlIIlII[16], llIlIIlII[283]));
                "".length();
                iArr8 = new int[llIlIIlII[0]];
                iArr8[llIlIIlII[1]] = llIlIIlII[12];
                if (lIllIIllIllI(Bank.contains(iArr8) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
                "".length();
                iArr9 = new int[llIlIIlII[0]];
                iArr9[llIlIIlII[1]] = llIlIIlII[12];
                if (lIllIIllIllI(Bank.contains(iArr9) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
                "".length();
                if (lIllIIlllIII(Bank.contains(item222222 -> {
                    return item222222.getName().toLowerCase().contains(llIIllIll[llIlIIlII[291]]);
                }) ? 1 : 0)) {
                }
                iArr10 = new int[llIlIIlII[0]];
                iArr10[llIlIIlII[1]] = llIlIIlII[286];
                if (lIllIIlllIII(Bank.contains(iArr10) ? 1 : 0)) {
                }
                iArr11 = new int[llIlIIlII[0]];
                iArr11[llIlIIlII[1]] = llIlIIlII[21];
                if (lIllIIllIllI(Bank.contains(iArr11) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlIIlII[21], llIlIIlII[7], llIlIIlII[288]));
                "".length();
                iArr12 = new int[llIlIIlII[0]];
                iArr12[llIlIIlII[1]] = llIlIIlII[28];
                if (lIllIIllIllI(Bank.contains(iArr12) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlIIlII[28], llIlIIlII[7], C0009j.ch));
                "".length();
                iArr13 = new int[llIlIIlII[0]];
                iArr13[llIlIIlII[1]] = llIlIIlII[24];
                if (lIllIIllIllI(Bank.contains(iArr13) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]));
                "".length();
                iArr14 = new int[llIlIIlII[0]];
                iArr14[llIlIIlII[1]] = llIlIIlII[20];
                if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
                "".length();
            }
            bx.add(new C0003d(llIlIIlII[10], llIlIIlII[11], llIlIIlII[19]));
            "".length();
            iArr4 = new int[llIlIIlII[0]];
            iArr4[llIlIIlII[1]] = llIlIIlII[17];
            if (lIllIIllIllI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlIIlII[17], llIlIIlII[11], llIlIIlII[19]));
            "".length();
            iArr5 = new int[llIlIIlII[0]];
            iArr5[llIlIIlII[1]] = llIlIIlII[14];
            if (lIllIIllIllI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlIIlII[14], llIlIIlII[11], llIlIIlII[19]));
            "".length();
            iArr6 = new int[llIlIIlII[0]];
            iArr6[llIlIIlII[1]] = llIlIIlII[13];
            if (lIllIIllIllI(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlIIlII[13], llIlIIlII[11], llIlIIlII[19]));
            "".length();
            iArr7 = new int[llIlIIlII[0]];
            iArr7[llIlIIlII[1]] = llIlIIlII[15];
            if (lIllIIllIllI(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlIIlII[15], llIlIIlII[16], llIlIIlII[283]));
            "".length();
            iArr8 = new int[llIlIIlII[0]];
            iArr8[llIlIIlII[1]] = llIlIIlII[12];
            if (lIllIIllIllI(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
            "".length();
            iArr9 = new int[llIlIIlII[0]];
            iArr9[llIlIIlII[1]] = llIlIIlII[12];
            if (lIllIIllIllI(Bank.contains(iArr9) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
            "".length();
            if (lIllIIlllIII(Bank.contains(item2222222 -> {
                return item2222222.getName().toLowerCase().contains(llIIllIll[llIlIIlII[291]]);
            }) ? 1 : 0)) {
            }
            iArr10 = new int[llIlIIlII[0]];
            iArr10[llIlIIlII[1]] = llIlIIlII[286];
            if (lIllIIlllIII(Bank.contains(iArr10) ? 1 : 0)) {
            }
            iArr11 = new int[llIlIIlII[0]];
            iArr11[llIlIIlII[1]] = llIlIIlII[21];
            if (lIllIIllIllI(Bank.contains(iArr11) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlIIlII[21], llIlIIlII[7], llIlIIlII[288]));
            "".length();
            iArr12 = new int[llIlIIlII[0]];
            iArr12[llIlIIlII[1]] = llIlIIlII[28];
            if (lIllIIllIllI(Bank.contains(iArr12) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlIIlII[28], llIlIIlII[7], C0009j.ch));
            "".length();
            iArr13 = new int[llIlIIlII[0]];
            iArr13[llIlIIlII[1]] = llIlIIlII[24];
            if (lIllIIllIllI(Bank.contains(iArr13) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]));
            "".length();
            iArr14 = new int[llIlIIlII[0]];
            iArr14[llIlIIlII[1]] = llIlIIlII[20];
            if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
            "".length();
        }
        bx.add(new C0003d(llIlIIlII[279], llIlIIlII[19], C0004e.c(llIlIIlII[280], llIlIIlII[281])));
        "".length();
        iArr = new int[llIlIIlII[0]];
        iArr[llIlIIlII[1]] = llIlIIlII[22];
        if (lIllIIlllIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[llIlIIlII[0]];
        iArr2[llIlIIlII[1]] = llIlIIlII[23];
        if (lIllIIlllIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIlIIlII[0]];
        iArr3[llIlIIlII[1]] = llIlIIlII[10];
        if (lIllIIllIllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIIlII[10], llIlIIlII[11], llIlIIlII[19]));
        "".length();
        iArr4 = new int[llIlIIlII[0]];
        iArr4[llIlIIlII[1]] = llIlIIlII[17];
        if (lIllIIllIllI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIIlII[17], llIlIIlII[11], llIlIIlII[19]));
        "".length();
        iArr5 = new int[llIlIIlII[0]];
        iArr5[llIlIIlII[1]] = llIlIIlII[14];
        if (lIllIIllIllI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIIlII[14], llIlIIlII[11], llIlIIlII[19]));
        "".length();
        iArr6 = new int[llIlIIlII[0]];
        iArr6[llIlIIlII[1]] = llIlIIlII[13];
        if (lIllIIllIllI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIIlII[13], llIlIIlII[11], llIlIIlII[19]));
        "".length();
        iArr7 = new int[llIlIIlII[0]];
        iArr7[llIlIIlII[1]] = llIlIIlII[15];
        if (lIllIIllIllI(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIIlII[15], llIlIIlII[16], llIlIIlII[283]));
        "".length();
        iArr8 = new int[llIlIIlII[0]];
        iArr8[llIlIIlII[1]] = llIlIIlII[12];
        if (lIllIIllIllI(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
        "".length();
        iArr9 = new int[llIlIIlII[0]];
        iArr9[llIlIIlII[1]] = llIlIIlII[12];
        if (lIllIIllIllI(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIIlII[12], llIlIIlII[11], llIlIIlII[19]));
        "".length();
        if (lIllIIlllIII(Bank.contains(item22222222 -> {
            return item22222222.getName().toLowerCase().contains(llIIllIll[llIlIIlII[291]]);
        }) ? 1 : 0)) {
        }
        iArr10 = new int[llIlIIlII[0]];
        iArr10[llIlIIlII[1]] = llIlIIlII[286];
        if (lIllIIlllIII(Bank.contains(iArr10) ? 1 : 0)) {
        }
        iArr11 = new int[llIlIIlII[0]];
        iArr11[llIlIIlII[1]] = llIlIIlII[21];
        if (lIllIIllIllI(Bank.contains(iArr11) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIIlII[21], llIlIIlII[7], llIlIIlII[288]));
        "".length();
        iArr12 = new int[llIlIIlII[0]];
        iArr12[llIlIIlII[1]] = llIlIIlII[28];
        if (lIllIIllIllI(Bank.contains(iArr12) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIIlII[28], llIlIIlII[7], C0009j.ch));
        "".length();
        iArr13 = new int[llIlIIlII[0]];
        iArr13[llIlIIlII[1]] = llIlIIlII[24];
        if (lIllIIllIllI(Bank.contains(iArr13) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIIlII[24], llIlIIlII[48], llIlIIlII[289]));
        "".length();
        iArr14 = new int[llIlIIlII[0]];
        iArr14[llIlIIlII[1]] = llIlIIlII[20];
        if (lIllIIllIllI(Bank.contains(iArr14) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlIIlII[20], llIlIIlII[77], llIlIIlII[290]));
        "".length();
    }

    public static void cp() {
        WorldArea worldArea = new WorldArea(llIlIIlII[37], llIlIIlII[38], llIlIIlII[39], llIlIIlII[40], llIlIIlII[1]);
        if (lIllIIllIllI(cm() ? 1 : 0)) {
            C0004e.l(llIlIIlII[23]);
            if (lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(llIlIIlII[41], llIlIIlII[42], llIlIIlII[29], llIlIIlII[43], llIlIIlII[1]);
                if (lIllIIlllIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(llIlIIlII[44], llIlIIlII[45], llIlIIlII[1]);
                    if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[238]];
                        Movement.walkTo(worldPoint);
                        "".length();
                        Time.sleepTicks(llIlIIlII[0]);
                        "".length();
                    }
                    if (lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[239]];
                        String[] strArr = new String[llIlIIlII[0]];
                        strArr[llIlIIlII[1]] = llIIllIll[llIlIIlII[240]];
                        TileObjects.getNearest(strArr).interact(llIIllIll[llIlIIlII[168]]);
                        Time.sleepTicks(llIlIIlII[7]);
                        "".length();
                    }
                }
                if (lIllIIllIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint2 = new WorldPoint(llIlIIlII[49], llIlIIlII[50], llIlIIlII[1]);
                    WorldPoint worldPoint3 = new WorldPoint(llIlIIlII[51], llIlIIlII[50], llIlIIlII[1]);
                    WorldPoint worldPoint4 = new WorldPoint(llIlIIlII[51], llIlIIlII[52], llIlIIlII[1]);
                    TileObject nearest = TileObjects.getNearest(tileObject -> {
                        if (lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[298]]) ? 1 : 0) && lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint2), llIlIIlII[9])) {
                            ?? r0 = llIlIIlII[0];
                            "".length();
                            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIIlII[1];
                    });
                    if (lIllIIlllIlI(nearest) && lIllIIllIlll(Players.getLocal().getWorldLocation().getX(), llIlIIlII[53])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[241]];
                        nearest.interact(llIIllIll[llIlIIlII[242]]);
                        Time.sleepTicks(llIlIIlII[6]);
                        "".length();
                    }
                    if (!lIllIIlllIII(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || !lIllIIlllIII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) || lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) {
                        WorldPoint worldPoint5 = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]);
                        TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                            if (lIllIIllIllI(tileObject2.getName().contains(llIIllIll[llIlIIlII[297]]) ? 1 : 0) && lIllIlIIIIII(tileObject2.getWorldLocation().distanceTo(worldPoint5), llIlIIlII[9])) {
                                ?? r0 = llIlIIlII[0];
                                "".length();
                                return 0 != 0 ? ((5 ^ 58) ^ (38 ^ 95)) & (((78 ^ 55) ^ (53 ^ 10)) ^ (-" ".length())) : r0;
                            }
                            return llIlIIlII[1];
                        });
                        if ((lIllIIlllIlI(nearest2) && lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[51]) && !lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[58])) || !lIllIIlllIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) || lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[59], llIlIIlII[1])) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[243]];
                            nearest2.interact(llIIllIll[llIlIIlII[244]]);
                            Time.sleepTicks(llIlIIlII[6]);
                            "".length();
                        }
                    }
                    if (lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[61])) {
                        if (lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) {
                            WorldPoint worldPoint6 = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]);
                            TileObject nearest3 = TileObjects.getNearest(tileObject3 -> {
                                if (lIllIIllIllI(tileObject3.getName().contains(llIIllIll[llIlIIlII[296]]) ? 1 : 0) && lIllIlIIIIII(tileObject3.getWorldLocation().distanceTo(worldPoint6), llIlIIlII[9])) {
                                    ?? r0 = llIlIIlII[0];
                                    "".length();
                                    return 0 != 0 ? ((((80 + 63) - 57) + 120) ^ (((69 + 98) - 127) + 116)) & (((((14 + 81) - (-142)) + 17) ^ (((82 + 158) - 198) + 130)) ^ (-" ".length())) : r0;
                                }
                                return llIlIIlII[1];
                            });
                            if (lIllIIlllIlI(nearest3)) {
                                AccBuilderGWD.c = llIIllIll[llIlIIlII[245]];
                                nearest3.interact(llIIllIll[llIlIIlII[246]]);
                                Time.sleepTicks(llIlIIlII[6]);
                                "".length();
                            }
                        }
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[247]];
                        String[] strArr2 = new String[llIlIIlII[0]];
                        strArr2[llIlIIlII[1]] = llIIllIll[llIlIIlII[248]];
                        TileObjects.getNearest(strArr2).interact(llIIllIll[llIlIIlII[249]]);
                        Time.sleepTicks(llIlIIlII[6]);
                        "".length();
                    }
                }
            }
        }
        if (lIllIIllIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[250]];
            String[] strArr3 = new String[llIlIIlII[0]];
            strArr3[llIlIIlII[1]] = llIIllIll[llIlIIlII[251]];
            TileObjects.getNearest(strArr3).interact(llIIllIll[llIlIIlII[252]]);
            Time.sleepTicks(llIlIIlII[6]);
            "".length();
        }
        if (lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIlllIII(cm() ? 1 : 0)) {
            WorldArea worldArea3 = new WorldArea(llIlIIlII[37], llIlIIlII[73], llIlIIlII[68], llIlIIlII[43], llIlIIlII[1]);
            String[] strArr4 = new String[llIlIIlII[0]];
            strArr4[llIlIIlII[1]] = llIIllIll[llIlIIlII[253]];
            if (lIllIIlllIlI(TileObjects.getNearest(strArr4)) && lIllIIllIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[254]];
                String[] strArr5 = new String[llIlIIlII[0]];
                strArr5[llIlIIlII[1]] = llIIllIll[llIlIIlII[255]];
                TileObjects.getNearest(strArr5).interact(llIIllIll[llIlIIlII[256]]);
                Time.sleepTicks(llIlIIlII[6]);
                "".length();
            }
        }
        if (lIllIIllIllI(new WorldArea(llIlIIlII[78], llIlIIlII[79], llIlIIlII[68], llIlIIlII[55], llIlIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[257]];
            TileObjects.getNearest(tileObject4 -> {
                if (lIllIIllIllI(tileObject4.getName().contains(llIIllIll[llIlIIlII[294]]) ? 1 : 0) && lIllIlIIIIII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[260], llIlIIlII[295], llIlIIlII[1])), llIlIIlII[9])) {
                    ?? r0 = llIlIIlII[0];
                    "".length();
                    return (-" ".length()) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIlIIlII[1];
            }).interact(llIIllIll[llIlIIlII[258]]);
            Time.sleepTicks(llIlIIlII[6]);
            "".length();
        }
        WorldPoint[] worldPointArr = new WorldPoint[llIlIIlII[46]];
        worldPointArr[llIlIIlII[1]] = new WorldPoint(llIlIIlII[82], llIlIIlII[83], llIlIIlII[1]);
        worldPointArr[llIlIIlII[0]] = new WorldPoint(llIlIIlII[259], llIlIIlII[113], llIlIIlII[1]);
        worldPointArr[llIlIIlII[5]] = new WorldPoint(llIlIIlII[88], llIlIIlII[89], llIlIIlII[1]);
        worldPointArr[llIlIIlII[6]] = new WorldPoint(llIlIIlII[90], llIlIIlII[118], llIlIIlII[1]);
        worldPointArr[llIlIIlII[7]] = new WorldPoint(llIlIIlII[86], llIlIIlII[191], llIlIIlII[1]);
        worldPointArr[llIlIIlII[9]] = new WorldPoint(llIlIIlII[260], llIlIIlII[199], llIlIIlII[1]);
        worldPointArr[llIlIIlII[18]] = new WorldPoint(llIlIIlII[261], llIlIIlII[197], llIlIIlII[1]);
        worldPointArr[llIlIIlII[25]] = new WorldPoint(llIlIIlII[262], llIlIIlII[195], llIlIIlII[1]);
        worldPointArr[llIlIIlII[26]] = new WorldPoint(llIlIIlII[263], llIlIIlII[97], llIlIIlII[1]);
        worldPointArr[llIlIIlII[27]] = new WorldPoint(llIlIIlII[264], llIlIIlII[123], llIlIIlII[1]);
        worldPointArr[llIlIIlII[19]] = new WorldPoint(llIlIIlII[265], llIlIIlII[266], llIlIIlII[1]);
        worldPointArr[llIlIIlII[31]] = new WorldPoint(llIlIIlII[200], llIlIIlII[267], llIlIIlII[1]);
        worldPointArr[llIlIIlII[32]] = new WorldPoint(llIlIIlII[268], llIlIIlII[109], llIlIIlII[1]);
        worldPointArr[llIlIIlII[33]] = new WorldPoint(llIlIIlII[58], llIlIIlII[269], llIlIIlII[1]);
        worldPointArr[llIlIIlII[34]] = new WorldPoint(llIlIIlII[270], llIlIIlII[87], llIlIIlII[1]);
        worldPointArr[llIlIIlII[35]] = new WorldPoint(llIlIIlII[262], llIlIIlII[271], llIlIIlII[1]);
        worldPointArr[llIlIIlII[36]] = new WorldPoint(llIlIIlII[272], llIlIIlII[89], llIlIIlII[1]);
        if (lIllIIllIllI(ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[128], llIlIIlII[129], llIlIIlII[1])), llIlIIlII[9])) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[273]];
                if (lIllIIlllIlI(NPCs.getNearest(npc -> {
                    return npc.getName().contains(llIIllIll[llIlIIlII[293]]);
                })) && lIllIIlllIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MISSILES);
                }
                if (lIllIIllllIl(NPCs.getNearest(npc2 -> {
                    return npc2.getName().contains(llIIllIll[llIlIIlII[292]]);
                })) && lIllIIllIllI(Prayers.isEnabled(Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MISSILES);
                }
                if (lIllIIlllIIl(Skills.getLevel(Skill.AGILITY), llIlIIlII[136])) {
                    Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                    "".length();
                    Time.sleepTicks(llIlIIlII[0]);
                    "".length();
                }
                if (lIllIIllIlll(Skills.getLevel(Skill.AGILITY), llIlIIlII[136])) {
                    Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                    "".length();
                    Time.sleepTicks(llIlIIlII[0]);
                    "".length();
                }
            }
            if (lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[272], llIlIIlII[89], llIlIIlII[1])), llIlIIlII[9])) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[274]];
                String[] strArr6 = new String[llIlIIlII[0]];
                strArr6[llIlIIlII[1]] = llIIllIll[llIlIIlII[275]];
                TileObjects.getNearest(strArr6).interact(llIIllIll[llIlIIlII[276]]);
                Time.sleepTicks(llIlIIlII[6]);
                "".length();
            }
        }
    }

    private static boolean lIllIIllIllI(int i) {
        return i != 0;
    }

    private static String lIlIllIllIlI(String lIIlIlIIlIllll, String lIIlIlIIlIlllI) {
        String lIIlIlIIlIllll2 = new String(Base64.getDecoder().decode(lIIlIlIIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIIlIlIIlIllII = lIIlIlIIlIlllI.toCharArray();
        int lIIlIlIIlIlIll = llIlIIlII[1];
        char[] charArray = lIIlIlIIlIllll2.toCharArray();
        int length = charArray.length;
        int lIIlIlIIlIIIll = llIlIIlII[1];
        while (lIllIIllIlll(lIIlIlIIlIIIll, length)) {
            sb.append((char) (charArray[lIIlIlIIlIIIll] ^ lIIlIlIIlIllII[lIIlIlIIlIlIll % lIIlIlIIlIllII.length]));
            "".length();
            lIIlIlIIlIlIll++;
            lIIlIlIIlIIIll++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public static boolean cq() {
        if (lIllIIlllIII(gc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIlllIII(gd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIllIIllIllI(gb.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return llIlIIlII[1];
        }
        ?? r0 = llIlIIlII[0];
        "".length();
        return ("  ".length() & ("  ".length() ^ (-1))) != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static void lIllIIllIlII() {
        llIlIIlII = new int[345];
        llIlIIlII[0] = " ".length();
        llIlIIlII[1] = (137 ^ 170) & ((142 ^ 173) ^ (-1));
        llIlIIlII[2] = (20 ^ 119) ^ (141 ^ 197);
        llIlIIlII[3] = (-24066) & 24379;
        llIlIIlII[4] = 223 ^ 143;
        llIlIIlII[5] = "  ".length();
        llIlIIlII[6] = "   ".length();
        llIlIIlII[7] = (78 ^ 56) ^ (115 ^ 1);
        llIlIIlII[8] = (-27715) & 32714;
        llIlIIlII[9] = (161 ^ 182) ^ (8 ^ 26);
        llIlIIlII[10] = (-24898) & 25453;
        llIlIIlII[11] = (-((-3818) & 28399)) & (-7187) & 32767;
        llIlIIlII[12] = (-18626) & 19183;
        llIlIIlII[13] = (-27845) & 28399;
        llIlIIlII[14] = (-30161) & 30717;
        llIlIIlII[15] = (-9289) & 9850;
        llIlIIlII[16] = (((158 ^ 155) + "  ".length()) - (-(93 ^ 33))) + (66 ^ 7);
        llIlIIlII[17] = (-((-17322) & 18427)) & (-10625) & 12283;
        llIlIIlII[18] = 147 ^ 149;
        llIlIIlII[19] = 164 ^ 174;
        llIlIIlII[20] = (-24593) & 32599;
        llIlIIlII[21] = (-((-2434) & 20467)) & (-12301) & 32767;
        llIlIIlII[22] = (-12529) & 16381;
        llIlIIlII[23] = (-((-8197) & 29663)) & (-1) & 24571;
        llIlIIlII[24] = (-20077) & 20461;
        llIlIIlII[25] = 187 ^ 188;
        llIlIIlII[26] = (((111 + 113) - 193) + 143) ^ (((110 + 25) - 92) + 123);
        llIlIIlII[27] = 102 ^ 111;
        llIlIIlII[28] = (-((-3097) & 20025)) & (-1025) & 30577;
        llIlIIlII[29] = 139 ^ 185;
        llIlIIlII[30] = (((106 + 132) - 188) + 115) ^ (((31 + 78) - 13) + 93);
        llIlIIlII[31] = 186 ^ 177;
        llIlIIlII[32] = 132 ^ 136;
        llIlIIlII[33] = 206 ^ 195;
        llIlIIlII[34] = 157 ^ 147;
        llIlIIlII[35] = (175 ^ 134) ^ (139 ^ 173);
        llIlIIlII[36] = 90 ^ 74;
        llIlIIlII[37] = (-((-1537) & 5803)) & (-9221) & 16383;
        llIlIIlII[38] = (-25061) & 28661;
        llIlIIlII[39] = (82 ^ 47) ^ (202 ^ 169);
        llIlIIlII[40] = (((178 + 95) - 233) + 150) ^ (((145 + 64) - 158) + 113);
        llIlIIlII[41] = (-((-28163) & 32387)) & (-24641) & 31711;
        llIlIIlII[42] = (-((-8219) & 12603)) & (-8194) & 16189;
        llIlIIlII[43] = (((98 + 63) - 138) + 140) ^ (((66 + 64) - (-43)) + 4);
        llIlIIlII[44] = (-20481) & 23336;
        llIlIIlII[45] = (-12293) & 15901;
        llIlIIlII[46] = 159 ^ 142;
        llIlIIlII[47] = (((59 + 81) - 34) + 31) ^ (((102 + 38) - 94) + 108);
        llIlIIlII[48] = 2 ^ 22;
        llIlIIlII[49] = (-((-8491) & 9583)) & (-8339) & 12287;
        llIlIIlII[50] = (-((-23087) & 31535)) & (-16577) & 28651;
        llIlIIlII[51] = (-((-17005) & 22271)) & (-24577) & 32703;
        llIlIIlII[52] = (-29057) & 32682;
        llIlIIlII[53] = (-((-2401) & 32225)) & (-18) & 32701;
        llIlIIlII[54] = 58 ^ 47;
        llIlIIlII[55] = (219 ^ 174) ^ (164 ^ 199);
        llIlIIlII[56] = (-17603) & 20479;
        llIlIIlII[57] = (-24857) & 28479;
        llIlIIlII[58] = (-16513) & 19390;
        llIlIIlII[59] = (-20625) & 24246;
        llIlIIlII[60] = 127 ^ 104;
        llIlIIlII[61] = (-((-5099) & 21483)) & (-5249) & 24511;
        llIlIIlII[62] = 48 ^ 41;
        llIlIIlII[63] = 115 ^ 104;
        llIlIIlII[64] = (214 ^ 155) ^ (226 ^ 179);
        llIlIIlII[65] = (171 ^ 172) ^ (40 ^ 50);
        llIlIIlII[66] = (-((-1785) & 14329)) & (-25) & 16187;
        llIlIIlII[67] = (((169 + 66) - 233) + 184) ^ (((103 + 1) - 72) + 133);
        llIlIIlII[68] = 17 ^ 49;
        llIlIIlII[69] = (((136 + 36) - 154) + 149) ^ (((95 + 124) - 212) + 127);
        llIlIIlII[70] = (43 ^ 27) ^ (1 ^ 18);
        llIlIIlII[71] = 69 ^ 103;
        llIlIIlII[72] = (116 ^ 60) ^ (249 ^ 149);
        llIlIIlII[73] = (-25025) & 28653;
        llIlIIlII[74] = (((38 + 24) - 59) + 149) ^ (((119 + 156) - 92) + 6);
        llIlIIlII[75] = 97 ^ 71;
        llIlIIlII[76] = 36 ^ 3;
        llIlIIlII[77] = 186 ^ 146;
        llIlIIlII[78] = (-((-14545) & 15605)) & (-8201) & 12159;
        llIlIIlII[79] = (-((-13041) & 31485)) & (-145) & 28606;
        llIlIIlII[80] = 157 ^ 180;
        llIlIIlII[81] = 174 ^ 132;
        llIlIIlII[82] = (-28833) & 31740;
        llIlIIlII[83] = (-((-5753) & 30713)) & (-1) & 28615;
        llIlIIlII[84] = (-((-12182) & 28567)) & (-9217) & 28511;
        llIlIIlII[85] = (-((-1541) & 14213)) & (-16402) & 32733;
        llIlIIlII[86] = (-((-18689) & 27926)) & (-4107) & 16255;
        llIlIIlII[87] = (-28681) & 32345;
        llIlIIlII[88] = (-16543) & 19455;
        llIlIIlII[89] = (-((-3730) & 16059)) & (-16385) & 32383;
        llIlIIlII[90] = (-5249) & 8162;
        llIlIIlII[91] = (-((-19477) & 27669)) & (-16771) & 28639;
        llIlIIlII[92] = (-((-15397) & 32061)) & (-4229) & 24575;
        llIlIIlII[93] = (-((-2918) & 23543)) & (-1) & 24315;
        llIlIIlII[94] = (-20481) & 23387;
        llIlIIlII[95] = (-((-6253) & 14445)) & (-4097) & 15983;
        llIlIIlII[96] = (-20483) & 23387;
        llIlIIlII[97] = (-28933) & 32631;
        llIlIIlII[98] = (-((-14977) & 32428)) & (-12417) & 32767;
        llIlIIlII[99] = (-24842) & 28543;
        llIlIIlII[100] = (-29697) & 32589;
        llIlIIlII[101] = (-12423) & 16126;
        llIlIIlII[102] = (-5145) & 8031;
        llIlIIlII[103] = (-13501) & 16382;
        llIlIIlII[104] = (-16524) & 20223;
        llIlIIlII[105] = (-12485) & 15357;
        llIlIIlII[106] = (-((-38) & 25703)) & (-4235) & 32767;
        llIlIIlII[107] = (-20481) & 24166;
        llIlIIlII[108] = (-5325) & 8191;
        llIlIIlII[109] = (-((-20241) & 32541)) & (-403) & 16383;
        llIlIIlII[110] = (-(((94 + 78) - 68) + 33)) & (-5125) & 8126;
        llIlIIlII[111] = (-((-2563) & 19239)) & (-1) & 20351;
        llIlIIlII[112] = (-24773) & 27637;
        llIlIIlII[113] = (-((-16109) & 32749)) & (-12417) & 32718;
        llIlIIlII[114] = (-28803) & 31655;
        llIlIIlII[115] = (-((-4745) & 21419)) & (-129) & 20471;
        llIlIIlII[116] = (-((-6701) & 7806)) & (-12297) & 16253;
        llIlIIlII[117] = (-12417) & 16090;
        llIlIIlII[118] = (-((-26738) & 31231)) & (-19) & 8191;
        llIlIIlII[119] = (-((-17155) & 25547)) & (-17409) & 28655;
        llIlIIlII[120] = (-16665) & 20348;
        llIlIIlII[121] = (-((-2593) & 20081)) & (-12293) & 32638;
        llIlIIlII[122] = (-((-2866) & 27443)) & (-3) & 28267;
        llIlIIlII[123] = (-((-5036) & 21439)) & (-12289) & 32383;
        llIlIIlII[124] = (-((-771) & 14303)) & (-1) & 16383;
        llIlIIlII[125] = (-((-821) & 4981)) & (-24738) & 31743;
        llIlIIlII[126] = (-((-16453) & 24790)) & (-4353) & 16383;
        llIlIIlII[127] = (-17411) & 20251;
        llIlIIlII[128] = (-((-10681) & 15866)) & (-16549) & 24575;
        llIlIIlII[129] = (-20737) & 24427;
        llIlIIlII[130] = (((18 + 63) - 45) + 199) ^ (((134 + 88) - 133) + 110);
        llIlIIlII[131] = (7 ^ 39) ^ (104 ^ 101);
        llIlIIlII[132] = 88 ^ 118;
        llIlIIlII[133] = (-((-31907) & 32675)) & (-28673) & 32575;
        llIlIIlII[134] = (-17553) & 20376;
        llIlIIlII[135] = (-16386) & 26463;
        llIlIIlII[136] = 148 ^ 187;
        llIlIIlII[137] = 28 ^ 44;
        llIlIIlII[138] = 48 ^ 1;
        llIlIIlII[139] = (-24643) & 27487;
        llIlIIlII[140] = (-22533) & 32639;
        llIlIIlII[141] = (((14 + 102) - 21) + 36) ^ (((63 + 156) - 43) + 0);
        llIlIIlII[142] = (((125 + 86) - 158) + 102) ^ (((137 + 172) - 172) + 38);
        llIlIIlII[143] = 79 ^ 122;
        llIlIIlII[144] = (106 ^ 81) ^ (184 ^ 181);
        llIlIIlII[145] = (((134 + 109) - 106) + 14) ^ (((31 + 74) - (-44)) + 11);
        llIlIIlII[146] = 29 ^ 37;
        llIlIIlII[147] = (-28842) & 31675;
        llIlIIlII[148] = (-22661) & 32742;
        llIlIIlII[149] = 136 ^ 177;
        llIlIIlII[150] = (14 ^ 30) ^ (31 ^ 53);
        llIlIIlII[151] = (-((-6209) & 23549)) & (-1) & 20477;
        llIlIIlII[152] = (((118 + 51) - 91) + 104) ^ (((63 + 21) - (-37)) + 20);
        llIlIIlII[153] = 56 ^ 4;
        llIlIIlII[154] = 98 ^ 95;
        llIlIIlII[155] = (-569) & 3704;
        llIlIIlII[156] = (118 ^ 46) ^ (77 ^ 43);
        llIlIIlII[157] = 103 ^ 88;
        llIlIIlII[158] = (-((-2642) & 32473)) & (-1) & 32751;
        llIlIIlII[159] = (-12801) & 16373;
        llIlIIlII[160] = (71 ^ 82) ^ (236 ^ 185);
        llIlIIlII[161] = (22 ^ 48) ^ (215 ^ 176);
        llIlIIlII[162] = (-25601) & 28411;
        llIlIIlII[163] = (-20483) & 24022;
        llIlIIlII[164] = 72 ^ 30;
        llIlIIlII[165] = (119 ^ 37) ^ (143 ^ 131);
        llIlIIlII[166] = (-((-8457) & 13738)) & (-65) & 8185;
        llIlIIlII[167] = (-4646) & 8181;
        llIlIIlII[168] = 48 ^ 70;
        llIlIIlII[169] = (241 ^ 196) ^ (115 ^ 4);
        llIlIIlII[170] = 109 ^ 46;
        llIlIIlII[171] = 47 ^ 107;
        llIlIIlII[172] = (183 ^ 190) ^ (217 ^ 149);
        llIlIIlII[173] = 40 ^ 110;
        llIlIIlII[174] = (116 ^ 39) ^ (71 ^ 83);
        llIlIIlII[175] = 253 ^ 181;
        llIlIIlII[176] = (((114 + 157) - 145) + 109) ^ (((140 + 96) - 122) + 48);
        llIlIIlII[177] = (191 ^ 177) ^ (5 ^ 65);
        llIlIIlII[178] = (((200 + 111) - 231) + 133) ^ (((153 + 50) - 137) + 92);
        llIlIIlII[179] = 239 ^ 163;
        llIlIIlII[180] = 143 ^ 194;
        llIlIIlII[181] = (((97 + 121) - 114) + 132) ^ (((59 + 120) - 69) + 52);
        llIlIIlII[182] = (77 ^ 6) ^ (154 ^ 158);
        llIlIIlII[183] = 79 ^ 30;
        llIlIIlII[184] = (((177 + 65) - 118) + 93) ^ (((71 + 120) - 156) + 104);
        llIlIIlII[185] = (188 ^ 165) ^ (92 ^ 22);
        llIlIIlII[186] = (54 ^ 92) ^ (15 ^ 49);
        llIlIIlII[187] = (((118 + 177) - 249) + 171) ^ (((52 + 58) - 89) + 119);
        llIlIIlII[188] = 200 ^ 159;
        llIlIIlII[189] = (-((-12115) & 32759)) & (-8449) & 32758;
        llIlIIlII[190] = (-13) & 2927;
        llIlIIlII[191] = (-24707) & 28395;
        llIlIIlII[192] = (-20611) & 24306;
        llIlIIlII[193] = (-((-3801) & 24313)) & (-1033) & 24447;
        llIlIIlII[194] = (-5173) & 8063;
        llIlIIlII[195] = (-((-30353) & 30617)) & (-16513) & 20479;
        llIlIIlII[196] = (-((-2611) & 15035)) & (-17428) & 32735;
        llIlIIlII[197] = (-((-53) & 20543)) & (-8193) & 32383;
        llIlIIlII[198] = (-20482) & 23355;
        llIlIIlII[199] = (-((-5169) & 29879)) & (-9) & 28415;
        llIlIIlII[200] = (-((-6943) & 32735)) & (-4105) & 32767;
        llIlIIlII[201] = (-257) & 3963;
        llIlIIlII[202] = (-28806) & 32511;
        llIlIIlII[203] = (-((-3239) & 7335)) & (-1) & 7804;
        llIlIIlII[204] = (-17441) & 20278;
        llIlIIlII[205] = (-24707) & 28415;
        llIlIIlII[206] = (-20553) & 23385;
        llIlIIlII[207] = (-((-4909) & 21311)) & (-69) & 20183;
        llIlIIlII[208] = (-20565) & 24285;
        llIlIIlII[209] = (-20553) & 24281;
        llIlIIlII[210] = (-28741) & 32478;
        llIlIIlII[211] = (-20517) & 23351;
        llIlIIlII[212] = 68 ^ 28;
        llIlIIlII[213] = 121 ^ 32;
        llIlIIlII[214] = 78 ^ 20;
        llIlIIlII[215] = (248 ^ 189) ^ (9 ^ 23);
        llIlIIlII[216] = (((135 + 185) - 173) + 57) ^ (((87 + 70) - 14) + 1);
        llIlIIlII[217] = 17 ^ 76;
        llIlIIlII[218] = 84 ^ 11;
        llIlIIlII[219] = 160 ^ 192;
        llIlIIlII[220] = 249 ^ 152;
        llIlIIlII[221] = (57 ^ 116) ^ (64 ^ 111);
        llIlIIlII[222] = 78 ^ 45;
        llIlIIlII[223] = (78 ^ 96) ^ (71 ^ 13);
        llIlIIlII[224] = 58 ^ 95;
        llIlIIlII[225] = (199 ^ 195) ^ (97 ^ 3);
        llIlIIlII[226] = (144 ^ 131) ^ (246 ^ 130);
        llIlIIlII[227] = (153 ^ 195) ^ (103 ^ 85);
        llIlIIlII[228] = (((197 + 116) - 235) + 169) ^ (((77 + 120) - 115) + 76);
        llIlIIlII[229] = 1 ^ 107;
        llIlIIlII[230] = 199 ^ 172;
        llIlIIlII[231] = 243 ^ 159;
        llIlIIlII[232] = (148 ^ 169) ^ (25 ^ 73);
        llIlIIlII[233] = (((189 + 55) - 215) + 205) ^ (((10 + 105) - 4) + 21);
        llIlIIlII[234] = (58 ^ 40) ^ (18 ^ 111);
        llIlIIlII[235] = 241 ^ 129;
        llIlIIlII[236] = (246 ^ 134) ^ " ".length();
        llIlIIlII[237] = (((58 + 186) - 23) + 19) ^ (((91 + 84) - 100) + 55);
        llIlIIlII[238] = 107 ^ 24;
        llIlIIlII[239] = 220 ^ 168;
        llIlIIlII[240] = (((172 + 195) - 269) + 114) ^ (((53 + 24) - (-51)) + 33);
        llIlIIlII[241] = (3 ^ 39) ^ (219 ^ 136);
        llIlIIlII[242] = 125 ^ 5;
        llIlIIlII[243] = 62 ^ 71;
        llIlIIlII[244] = (129 ^ 162) ^ (71 ^ 30);
        llIlIIlII[245] = (182 ^ 158) ^ (254 ^ 173);
        llIlIIlII[246] = (44 ^ 123) ^ (169 ^ 130);
        llIlIIlII[247] = 113 ^ 12;
        llIlIIlII[248] = 210 ^ 172;
        llIlIIlII[249] = (((16 ^ 97) + (126 ^ 99)) - (255 ^ 140)) + (216 ^ 188);
        llIlIIlII[250] = (((108 ^ 55) + (180 ^ 160)) - (193 ^ 154)) + (19 ^ 127);
        llIlIIlII[251] = (((252 ^ 149) + (127 ^ 43)) - (((161 + 152) - 235) + 96)) + (193 ^ 179);
        llIlIIlII[252] = (((213 ^ 135) + (33 ^ 71)) - (18 ^ 75)) + (96 ^ 67);
        llIlIIlII[253] = (((105 ^ 16) + (54 ^ 82)) - (((109 + 79) - 39) + 17)) + (58 ^ 118);
        llIlIIlII[254] = ((93 + 31) - 91) + 99;
        llIlIIlII[255] = (((181 ^ 161) + (58 ^ 14)) - (-(32 ^ 20))) + (128 ^ 137);
        llIlIIlII[256] = ((97 + 29) - 89) + 97;
        llIlIIlII[257] = (((53 ^ 93) + (106 ^ 99)) - (143 ^ 132)) + (78 ^ 111);
        llIlIIlII[258] = (((200 ^ 177) + (118 ^ 20)) - (((148 + 118) - 201) + 101)) + (196 ^ 151);
        llIlIIlII[259] = (-9249) & 12159;
        llIlIIlII[260] = (-2) & 2907;
        llIlIIlII[261] = (-((-2321) & 10685)) & (-17409) & 28670;
        llIlIIlII[262] = (-5269) & 8157;
        llIlIIlII[263] = (-35) & 2915;
        llIlIIlII[264] = (-((-2963) & 19415)) & (-1025) & 20351;
        llIlIIlII[265] = (-((-8525) & 30157)) & (-1) & 24502;
        llIlIIlII[266] = (-((-4673) & 29659)) & (-4097) & 32767;
        llIlIIlII[267] = (-((-18433) & 26785)) & (-3) & 12027;
        llIlIIlII[268] = (-(88 ^ 92)) & (-1089) & 3967;
        llIlIIlII[269] = (-12705) & 16380;
        llIlIIlII[270] = (-((-3137) & 31981)) & (-17) & 31743;
        llIlIIlII[271] = (-16546) & 20213;
        llIlIIlII[272] = (-((-2397) & 15869)) & (-18) & 16381;
        llIlIIlII[273] = ((75 + 99) - 96) + 59;
        llIlIIlII[274] = (((226 ^ 173) + (116 ^ 114)) - (-(95 ^ 121))) + (78 ^ 65);
        llIlIIlII[275] = ((106 + 62) - 151) + 122;
        llIlIIlII[276] = (((114 ^ 34) + (192 ^ 163)) - (((71 + 42) - 88) + 141)) + ((31 + 24) - (-10)) + 62;
        llIlIIlII[277] = ((4 + 36) - (-3)) + 98;
        llIlIIlII[278] = ((71 + 21) - 13) + 63;
        llIlIIlII[279] = (-133) & 8142;
        llIlIIlII[280] = (-((-371) & 27511)) & (-4227) & 32766;
        llIlIIlII[281] = (-20796) & 22395;
        llIlIIlII[282] = (-18836) & 24055;
        llIlIIlII[283] = ((147 + 113) - 102) + 22;
        llIlIIlII[284] = (-((-27652) & 31767)) & (-16673) & 32767;
        llIlIIlII[285] = (-((-26915) & 32570)) & (-65) & 30719;
        llIlIIlII[286] = (-((-19089) & 32471)) & (-513) & 16342;
        llIlIIlII[287] = (-((-2081) & 12139)) & (-16390) & 32767;
        llIlIIlII[288] = (-17235) & 32734;
        llIlIIlII[289] = (-"   ".length()) & (-7170) & 8191;
        llIlIIlII[290] = (-22531) & 23430;
        llIlIIlII[291] = (((83 ^ 102) + (23 ^ 106)) - (116 ^ 76)) + (120 ^ 109);
        llIlIIlII[292] = (((3 ^ 46) + (((49 + 117) - 75) + 51)) - (7 ^ 76)) + (147 ^ 179);
        llIlIIlII[293] = (((219 ^ 186) + (((102 + 18) - (-14)) + 1)) - (((171 + 59) - 190) + 155)) + (218 ^ 182);
        llIlIIlII[294] = ((((77 ^ 65) & ((186 ^ 182) ^ (-1))) + (56 ^ 67)) - (82 ^ 67)) + (42 ^ 2);
        llIlIIlII[295] = (-((-1090) & 23619)) & (-65) & 32627;
        llIlIIlII[296] = ((92 + 90) - 112) + 77;
        llIlIIlII[297] = ((32 + 38) - (-60)) + 18;
        llIlIIlII[298] = (((25 ^ 110) + (99 ^ 48)) - (101 ^ 49)) + (187 ^ 164);
        llIlIIlII[299] = (((227 ^ 154) + (38 ^ 3)) - (94 ^ 112)) + (173 ^ 139);
        llIlIIlII[300] = ((27 + 51) - 77) + 150;
        llIlIIlII[301] = (((93 ^ 52) + (((21 + 147) - 64) + 47)) - (241 ^ 131)) + (64 ^ 74);
        llIlIIlII[302] = ((115 + 66) - 62) + 34;
        llIlIIlII[303] = ((125 + 68) - 166) + 127;
        llIlIIlII[304] = ((48 + 83) - 100) + 124;
        llIlIIlII[305] = (((94 ^ 65) + (162 ^ 182)) - (-(110 ^ 77))) + (243 ^ 181);
        llIlIIlII[306] = (((249 ^ 184) + (250 ^ 175)) - (111 ^ 99)) + (156 ^ 143);
        llIlIIlII[307] = ((29 + 126) - 102) + 105;
        llIlIIlII[308] = ((55 + 151) - 120) + 73;
        llIlIIlII[309] = (((((111 + 31) - 86) + 92) + (113 ^ 71)) - (((19 + 61) - (-51)) + 45)) + ((62 + 57) - 9) + 24;
        llIlIIlII[310] = ((143 + 26) - 153) + 145;
        llIlIIlII[311] = (((((118 + 73) - 182) + 145) + (121 ^ 39)) - (((194 + 101) - 125) + 59)) + ((36 + 61) - (-46)) + 0;
        llIlIIlII[312] = (-13410) & 16241;
        llIlIIlII[313] = ((49 + 15) - (-18)) + 81;
        llIlIIlII[314] = ((77 + 44) - 58) + 101;
        llIlIIlII[315] = (((21 ^ 84) + (31 ^ 64)) - (60 ^ 7)) + (17 ^ 81);
        llIlIIlII[316] = ((76 + 88) - 36) + 38;
        llIlIIlII[317] = (((54 ^ 62) + (152 ^ 164)) - (89 ^ 114)) + ((1 + 49) - (-8)) + 84;
        llIlIIlII[318] = (((210 ^ 180) + (((80 + 97) - 129) + 87)) - (((48 + 103) - (-52)) + 32)) + ((136 + 91) - 179) + 118;
        llIlIIlII[319] = ((130 + 97) - 215) + 157;
        llIlIIlII[320] = (((188 ^ 146) + (((0 + 88) - (-54)) + 23)) - (((55 + 64) - (-12)) + 49)) + ((6 + 6) - (-120)) + 7;
        llIlIIlII[321] = (((17 ^ 73) + (((81 + 109) - 138) + 78)) - (((108 + 84) - 30) + 12)) + ((15 + 2) - (-43)) + 67;
        llIlIIlII[322] = ((55 + 0) - (-38)) + 79;
        llIlIIlII[323] = ((16 + 56) - 70) + 171;
        llIlIIlII[324] = ((106 + 81) - 117) + 104;
        llIlIIlII[325] = ((128 + 125) - 144) + 66;
        llIlIIlII[326] = ((32 + 118) - 39) + 65;
        llIlIIlII[327] = ((71 + 150) - 115) + 71;
        llIlIIlII[328] = (((77 ^ 107) + (91 ^ 20)) - (14 ^ 18)) + (225 ^ 184);
        llIlIIlII[329] = (-((-2375) & 7631)) & (-24609) & 32703;
        llIlIIlII[330] = (-((-10317) & 26877)) & (-265) & 20475;
        llIlIIlII[331] = (-13458) & 16275;
        llIlIIlII[332] = (-((-1345) & 19777)) & (-4289) & 32767;
        llIlIIlII[333] = (-28721) & 31539;
        llIlIIlII[334] = (-((-12105) & 32765)) & (-3) & 30710;
        llIlIIlII[335] = (-((-9919) & 26367)) & (-1) & 26494;
        llIlIIlII[336] = (-((-4401) & 30003)) & (-4225) & 32722;
        llIlIIlII[337] = (-28678) & 32205;
        llIlIIlII[338] = (-9921) & 10237;
        llIlIIlII[339] = ((56 + 36) - (-74)) + 13;
        llIlIIlII[340] = ((95 + 180) - 194) + 100;
        llIlIIlII[341] = (((7 ^ 74) + (126 ^ 42)) - (((83 + 55) - 13) + 11)) + ((0 + 99) - 32) + 90;
        llIlIIlII[342] = (((6 ^ 28) + (((22 + 5) - 1) + 109)) - (((117 + 23) - 83) + 87)) + ((144 + 163) - 236) + 95;
        llIlIIlII[343] = ((147 + 166) - 134) + 5;
        llIlIIlII[344] = (((138 ^ 141) + (114 ^ 70)) - (-(168 ^ 144))) + (30 ^ 88);
    }

    public static void cn() {
        WorldArea worldArea = new WorldArea(llIlIIlII[37], llIlIIlII[38], llIlIIlII[39], llIlIIlII[40], llIlIIlII[1]);
        if (lIllIIllIllI(cm() ? 1 : 0)) {
            C0004e.l(llIlIIlII[23]);
            if (lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(llIlIIlII[41], llIlIIlII[42], llIlIIlII[29], llIlIIlII[43], llIlIIlII[1]);
                if (lIllIIlllIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(llIlIIlII[44], llIlIIlII[45], llIlIIlII[1]);
                    if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[169]];
                        Movement.walkTo(worldPoint);
                        "".length();
                        Time.sleepTicks(llIlIIlII[0]);
                        "".length();
                    }
                    if (lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[170]];
                        String[] strArr = new String[llIlIIlII[0]];
                        strArr[llIlIIlII[1]] = llIIllIll[llIlIIlII[171]];
                        TileObjects.getNearest(strArr).interact(llIIllIll[llIlIIlII[172]]);
                        Time.sleepTicks(llIlIIlII[7]);
                        "".length();
                    }
                }
                if (lIllIIllIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint2 = new WorldPoint(llIlIIlII[49], llIlIIlII[50], llIlIIlII[1]);
                    WorldPoint worldPoint3 = new WorldPoint(llIlIIlII[51], llIlIIlII[50], llIlIIlII[1]);
                    WorldPoint worldPoint4 = new WorldPoint(llIlIIlII[51], llIlIIlII[52], llIlIIlII[1]);
                    TileObject nearest = TileObjects.getNearest(tileObject -> {
                        if (lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[310]]) ? 1 : 0) && lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint2), llIlIIlII[9])) {
                            ?? r0 = llIlIIlII[0];
                            "".length();
                            return ((61 ^ 16) & ((97 ^ 76) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlIIlII[1];
                    });
                    if (lIllIIlllIlI(nearest) && lIllIIllIlll(Players.getLocal().getWorldLocation().getX(), llIlIIlII[53])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[173]];
                        nearest.interact(llIIllIll[llIlIIlII[174]]);
                        Time.sleepTicks(llIlIIlII[6]);
                        "".length();
                    }
                    if (!lIllIIlllIII(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || !lIllIIlllIII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) || lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) {
                        WorldPoint worldPoint5 = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]);
                        TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                            if (lIllIIllIllI(tileObject2.getName().contains(llIIllIll[llIlIIlII[309]]) ? 1 : 0) && lIllIlIIIIII(tileObject2.getWorldLocation().distanceTo(worldPoint5), llIlIIlII[9])) {
                                ?? r0 = llIlIIlII[0];
                                "".length();
                                return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIlIIlII[1];
                        });
                        if ((lIllIIlllIlI(nearest2) && lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[51]) && !lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[58])) || !lIllIIlllIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) || lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[59], llIlIIlII[1])) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[175]];
                            nearest2.interact(llIIllIll[llIlIIlII[176]]);
                            Time.sleepTicks(llIlIIlII[6]);
                            "".length();
                        }
                    }
                    if (lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[61])) {
                        if (lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) {
                            WorldPoint worldPoint6 = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]);
                            TileObject nearest3 = TileObjects.getNearest(tileObject3 -> {
                                if (lIllIIllIllI(tileObject3.getName().contains(llIIllIll[llIlIIlII[308]]) ? 1 : 0) && lIllIlIIIIII(tileObject3.getWorldLocation().distanceTo(worldPoint6), llIlIIlII[9])) {
                                    ?? r0 = llIlIIlII[0];
                                    "".length();
                                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIIlII[1];
                            });
                            if (lIllIIlllIlI(nearest3)) {
                                AccBuilderGWD.c = llIIllIll[llIlIIlII[177]];
                                nearest3.interact(llIIllIll[llIlIIlII[178]]);
                                Time.sleepTicks(llIlIIlII[6]);
                                "".length();
                            }
                        }
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[179]];
                        String[] strArr2 = new String[llIlIIlII[0]];
                        strArr2[llIlIIlII[1]] = llIIllIll[llIlIIlII[180]];
                        TileObjects.getNearest(strArr2).interact(llIIllIll[llIlIIlII[181]]);
                        Time.sleepTicks(llIlIIlII[6]);
                        "".length();
                    }
                }
            }
        }
        if (lIllIIllIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[182]];
            String[] strArr3 = new String[llIlIIlII[0]];
            strArr3[llIlIIlII[1]] = llIIllIll[llIlIIlII[4]];
            TileObjects.getNearest(strArr3).interact(llIIllIll[llIlIIlII[183]]);
            Time.sleepTicks(llIlIIlII[6]);
            "".length();
        }
        if (lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIlllIII(cm() ? 1 : 0)) {
            WorldArea worldArea3 = new WorldArea(llIlIIlII[37], llIlIIlII[73], llIlIIlII[68], llIlIIlII[43], llIlIIlII[1]);
            String[] strArr4 = new String[llIlIIlII[0]];
            strArr4[llIlIIlII[1]] = llIIllIll[llIlIIlII[184]];
            if (lIllIIlllIlI(TileObjects.getNearest(strArr4)) && lIllIIllIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[185]];
                String[] strArr5 = new String[llIlIIlII[0]];
                strArr5[llIlIIlII[1]] = llIIllIll[llIlIIlII[186]];
                TileObjects.getNearest(strArr5).interact(llIIllIll[llIlIIlII[187]]);
                Time.sleepTicks(llIlIIlII[6]);
                "".length();
            }
        }
        if (lIllIIllIllI(new WorldArea(llIlIIlII[78], llIlIIlII[79], llIlIIlII[68], llIlIIlII[55], llIlIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[164]];
            TileObjects.getNearest(tileObject4 -> {
                if (lIllIIllIllI(tileObject4.getName().contains(llIIllIll[llIlIIlII[307]]) ? 1 : 0) && lIllIlIIIIII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[260], llIlIIlII[295], llIlIIlII[1])), llIlIIlII[9])) {
                    ?? r0 = llIlIIlII[0];
                    "".length();
                    return ((199 ^ 156) & ((19 ^ 72) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIlIIlII[1];
            }).interact(llIIllIll[llIlIIlII[188]]);
            Time.sleepTicks(llIlIIlII[6]);
            "".length();
        }
        WorldPoint[] worldPointArr = new WorldPoint[llIlIIlII[30]];
        worldPointArr[llIlIIlII[1]] = new WorldPoint(llIlIIlII[82], llIlIIlII[83], llIlIIlII[1]);
        worldPointArr[llIlIIlII[0]] = new WorldPoint(llIlIIlII[84], llIlIIlII[85], llIlIIlII[1]);
        worldPointArr[llIlIIlII[5]] = new WorldPoint(llIlIIlII[86], llIlIIlII[189], llIlIIlII[1]);
        worldPointArr[llIlIIlII[6]] = new WorldPoint(llIlIIlII[88], llIlIIlII[117], llIlIIlII[1]);
        worldPointArr[llIlIIlII[7]] = new WorldPoint(llIlIIlII[190], llIlIIlII[118], llIlIIlII[1]);
        worldPointArr[llIlIIlII[9]] = new WorldPoint(llIlIIlII[86], llIlIIlII[191], llIlIIlII[1]);
        worldPointArr[llIlIIlII[18]] = new WorldPoint(llIlIIlII[82], llIlIIlII[192], llIlIIlII[1]);
        worldPointArr[llIlIIlII[25]] = new WorldPoint(llIlIIlII[193], llIlIIlII[104], llIlIIlII[1]);
        worldPointArr[llIlIIlII[26]] = new WorldPoint(llIlIIlII[37], llIlIIlII[99], llIlIIlII[1]);
        worldPointArr[llIlIIlII[27]] = new WorldPoint(llIlIIlII[194], llIlIIlII[195], llIlIIlII[1]);
        worldPointArr[llIlIIlII[19]] = new WorldPoint(llIlIIlII[196], llIlIIlII[197], llIlIIlII[1]);
        worldPointArr[llIlIIlII[31]] = new WorldPoint(llIlIIlII[61], llIlIIlII[95], llIlIIlII[1]);
        worldPointArr[llIlIIlII[32]] = new WorldPoint(llIlIIlII[198], llIlIIlII[123], llIlIIlII[1]);
        worldPointArr[llIlIIlII[33]] = new WorldPoint(llIlIIlII[105], llIlIIlII[199], llIlIIlII[1]);
        worldPointArr[llIlIIlII[34]] = new WorldPoint(llIlIIlII[200], llIlIIlII[195], llIlIIlII[1]);
        worldPointArr[llIlIIlII[35]] = new WorldPoint(llIlIIlII[110], llIlIIlII[201], llIlIIlII[1]);
        worldPointArr[llIlIIlII[36]] = new WorldPoint(llIlIIlII[53], llIlIIlII[202], llIlIIlII[1]);
        worldPointArr[llIlIIlII[46]] = new WorldPoint(llIlIIlII[114], llIlIIlII[201], llIlIIlII[1]);
        worldPointArr[llIlIIlII[43]] = new WorldPoint(llIlIIlII[125], llIlIIlII[203], llIlIIlII[1]);
        worldPointArr[llIlIIlII[47]] = new WorldPoint(llIlIIlII[204], llIlIIlII[205], llIlIIlII[1]);
        worldPointArr[llIlIIlII[48]] = new WorldPoint(llIlIIlII[206], llIlIIlII[207], llIlIIlII[1]);
        worldPointArr[llIlIIlII[54]] = new WorldPoint(llIlIIlII[206], llIlIIlII[208], llIlIIlII[1]);
        worldPointArr[llIlIIlII[55]] = new WorldPoint(llIlIIlII[206], llIlIIlII[209], llIlIIlII[1]);
        worldPointArr[llIlIIlII[60]] = new WorldPoint(llIlIIlII[147], llIlIIlII[210], llIlIIlII[1]);
        if (lIllIIllIllI(ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[211], llIlIIlII[210], llIlIIlII[1])), llIlIIlII[26])) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[212]];
                if (lIllIIlllIlI(NPCs.getNearest(npc -> {
                    return npc.getName().contains(llIIllIll[llIlIIlII[306]]);
                })) && lIllIIlllIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MISSILES);
                }
                if (lIllIIllllIl(NPCs.getNearest(npc2 -> {
                    return npc2.getName().contains(llIIllIll[llIlIIlII[305]]);
                })) && lIllIIllIllI(Prayers.isEnabled(Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MISSILES);
                }
                Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                "".length();
                Time.sleepTicks(llIlIIlII[0]);
                "".length();
            }
        }
    }

    public static void co() {
        WorldArea worldArea = new WorldArea(llIlIIlII[37], llIlIIlII[38], llIlIIlII[39], llIlIIlII[40], llIlIIlII[1]);
        if (lIllIIllIllI(cm() ? 1 : 0)) {
            C0004e.l(llIlIIlII[23]);
            if (lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(llIlIIlII[41], llIlIIlII[42], llIlIIlII[29], llIlIIlII[43], llIlIIlII[1]);
                if (lIllIIlllIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(llIlIIlII[44], llIlIIlII[45], llIlIIlII[1]);
                    if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[213]];
                        Movement.walkTo(worldPoint);
                        "".length();
                        Time.sleepTicks(llIlIIlII[0]);
                        "".length();
                    }
                    if (lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIIlII[9])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[214]];
                        String[] strArr = new String[llIlIIlII[0]];
                        strArr[llIlIIlII[1]] = llIIllIll[llIlIIlII[215]];
                        TileObjects.getNearest(strArr).interact(llIIllIll[llIlIIlII[216]]);
                        Time.sleepTicks(llIlIIlII[7]);
                        "".length();
                    }
                }
                if (lIllIIllIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint2 = new WorldPoint(llIlIIlII[49], llIlIIlII[50], llIlIIlII[1]);
                    WorldPoint worldPoint3 = new WorldPoint(llIlIIlII[51], llIlIIlII[50], llIlIIlII[1]);
                    WorldPoint worldPoint4 = new WorldPoint(llIlIIlII[51], llIlIIlII[52], llIlIIlII[1]);
                    TileObject nearest = TileObjects.getNearest(tileObject -> {
                        if (lIllIIllIllI(tileObject.getName().contains(llIIllIll[llIlIIlII[304]]) ? 1 : 0) && lIllIlIIIIII(tileObject.getWorldLocation().distanceTo(worldPoint2), llIlIIlII[9])) {
                            ?? r0 = llIlIIlII[0];
                            "".length();
                            return (-((((1 + 65) - (-28)) + 34) ^ (((124 + 126) - 181) + 63))) > 0 ? ((84 ^ 18) ^ (69 ^ 59)) & (((162 ^ 181) ^ (102 ^ 73)) ^ (-" ".length())) : r0;
                        }
                        return llIlIIlII[1];
                    });
                    if (lIllIIlllIlI(nearest) && lIllIIllIlll(Players.getLocal().getWorldLocation().getX(), llIlIIlII[53])) {
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[217]];
                        nearest.interact(llIIllIll[llIlIIlII[165]]);
                        Time.sleepTicks(llIlIIlII[6]);
                        "".length();
                    }
                    if (!lIllIIlllIII(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || !lIllIIlllIII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) || lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) {
                        WorldPoint worldPoint5 = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]);
                        TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                            if (lIllIIllIllI(tileObject2.getName().contains(llIIllIll[llIlIIlII[303]]) ? 1 : 0) && lIllIlIIIIII(tileObject2.getWorldLocation().distanceTo(worldPoint5), llIlIIlII[9])) {
                                ?? r0 = llIlIIlII[0];
                                "".length();
                                return ((((91 + 103) - 53) + 12) ^ (((65 + 81) - 86) + 97)) < "   ".length() ? ((((138 + 86) - 135) + 82) ^ (((99 + 108) - 182) + 123)) & (((115 ^ 91) ^ (74 ^ 93)) ^ (-" ".length())) : r0;
                            }
                            return llIlIIlII[1];
                        });
                        if ((lIllIIlllIlI(nearest2) && lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[51]) && !lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[58])) || !lIllIIlllIII(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0) || lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[59], llIlIIlII[1])) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIllIll[llIlIIlII[218]];
                            nearest2.interact(llIIllIll[llIlIIlII[219]]);
                            Time.sleepTicks(llIlIIlII[6]);
                            "".length();
                        }
                    }
                    if (lIllIIlllIIl(Players.getLocal().getWorldLocation().getX(), llIlIIlII[61])) {
                        if (lIllIIllIllI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1])) ? 1 : 0)) {
                            WorldPoint worldPoint6 = new WorldPoint(llIlIIlII[56], llIlIIlII[57], llIlIIlII[1]);
                            TileObject nearest3 = TileObjects.getNearest(tileObject3 -> {
                                if (lIllIIllIllI(tileObject3.getName().contains(llIIllIll[llIlIIlII[302]]) ? 1 : 0) && lIllIlIIIIII(tileObject3.getWorldLocation().distanceTo(worldPoint6), llIlIIlII[9])) {
                                    ?? r0 = llIlIIlII[0];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIIlII[1];
                            });
                            if (lIllIIlllIlI(nearest3)) {
                                AccBuilderGWD.c = llIIllIll[llIlIIlII[220]];
                                nearest3.interact(llIIllIll[llIlIIlII[221]]);
                                Time.sleepTicks(llIlIIlII[6]);
                                "".length();
                            }
                        }
                        AccBuilderGWD.c = llIIllIll[llIlIIlII[222]];
                        String[] strArr2 = new String[llIlIIlII[0]];
                        strArr2[llIlIIlII[1]] = llIIllIll[llIlIIlII[223]];
                        TileObjects.getNearest(strArr2).interact(llIIllIll[llIlIIlII[224]]);
                        Time.sleepTicks(llIlIIlII[6]);
                        "".length();
                    }
                }
            }
        }
        if (lIllIIllIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[225]];
            String[] strArr3 = new String[llIlIIlII[0]];
            strArr3[llIlIIlII[1]] = llIIllIll[llIlIIlII[226]];
            TileObjects.getNearest(strArr3).interact(llIIllIll[llIlIIlII[227]]);
            Time.sleepTicks(llIlIIlII[6]);
            "".length();
        }
        if (lIllIIlllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIlllIII(cm() ? 1 : 0)) {
            WorldArea worldArea3 = new WorldArea(llIlIIlII[37], llIlIIlII[73], llIlIIlII[68], llIlIIlII[43], llIlIIlII[1]);
            String[] strArr4 = new String[llIlIIlII[0]];
            strArr4[llIlIIlII[1]] = llIIllIll[llIlIIlII[228]];
            if (lIllIIlllIlI(TileObjects.getNearest(strArr4)) && lIllIIllIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[229]];
                String[] strArr5 = new String[llIlIIlII[0]];
                strArr5[llIlIIlII[1]] = llIIllIll[llIlIIlII[230]];
                TileObjects.getNearest(strArr5).interact(llIIllIll[llIlIIlII[231]]);
                Time.sleepTicks(llIlIIlII[6]);
                "".length();
            }
        }
        if (lIllIIllIllI(new WorldArea(llIlIIlII[78], llIlIIlII[79], llIlIIlII[68], llIlIIlII[55], llIlIIlII[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIllIll[llIlIIlII[232]];
            TileObjects.getNearest(tileObject4 -> {
                if (lIllIIllIllI(tileObject4.getName().contains(llIIllIll[llIlIIlII[301]]) ? 1 : 0) && lIllIlIIIIII(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llIlIIlII[260], llIlIIlII[295], llIlIIlII[1])), llIlIIlII[9])) {
                    ?? r0 = llIlIIlII[0];
                    "".length();
                    return ((39 ^ 101) ^ (201 ^ 143)) > ((248 ^ 143) ^ (92 ^ 47)) ? ((((57 + 73) - (-78)) + 1) ^ (((5 + 66) - 44) + 121)) & (((28 ^ 86) ^ (204 ^ 195)) ^ (-" ".length())) : r0;
                }
                return llIlIIlII[1];
            }).interact(llIIllIll[llIlIIlII[233]]);
            Time.sleepTicks(llIlIIlII[6]);
            "".length();
        }
        WorldPoint[] worldPointArr = new WorldPoint[llIlIIlII[67]];
        worldPointArr[llIlIIlII[1]] = new WorldPoint(llIlIIlII[82], llIlIIlII[83], llIlIIlII[1]);
        worldPointArr[llIlIIlII[0]] = new WorldPoint(llIlIIlII[84], llIlIIlII[85], llIlIIlII[1]);
        worldPointArr[llIlIIlII[5]] = new WorldPoint(llIlIIlII[86], llIlIIlII[87], llIlIIlII[1]);
        worldPointArr[llIlIIlII[6]] = new WorldPoint(llIlIIlII[88], llIlIIlII[89], llIlIIlII[1]);
        worldPointArr[llIlIIlII[7]] = new WorldPoint(llIlIIlII[90], llIlIIlII[91], llIlIIlII[1]);
        worldPointArr[llIlIIlII[9]] = new WorldPoint(llIlIIlII[90], llIlIIlII[92], llIlIIlII[1]);
        worldPointArr[llIlIIlII[18]] = new WorldPoint(llIlIIlII[86], llIlIIlII[93], llIlIIlII[1]);
        worldPointArr[llIlIIlII[25]] = new WorldPoint(llIlIIlII[94], llIlIIlII[95], llIlIIlII[1]);
        worldPointArr[llIlIIlII[26]] = new WorldPoint(llIlIIlII[96], llIlIIlII[97], llIlIIlII[1]);
        worldPointArr[llIlIIlII[27]] = new WorldPoint(llIlIIlII[98], llIlIIlII[99], llIlIIlII[1]);
        worldPointArr[llIlIIlII[19]] = new WorldPoint(llIlIIlII[100], llIlIIlII[101], llIlIIlII[1]);
        worldPointArr[llIlIIlII[31]] = new WorldPoint(llIlIIlII[102], llIlIIlII[99], llIlIIlII[1]);
        worldPointArr[llIlIIlII[32]] = new WorldPoint(llIlIIlII[103], llIlIIlII[104], llIlIIlII[1]);
        worldPointArr[llIlIIlII[33]] = new WorldPoint(llIlIIlII[58], llIlIIlII[95], llIlIIlII[1]);
        worldPointArr[llIlIIlII[34]] = new WorldPoint(llIlIIlII[105], llIlIIlII[93], llIlIIlII[1]);
        worldPointArr[llIlIIlII[35]] = new WorldPoint(llIlIIlII[106], llIlIIlII[107], llIlIIlII[1]);
        worldPointArr[llIlIIlII[36]] = new WorldPoint(llIlIIlII[108], llIlIIlII[109], llIlIIlII[1]);
        worldPointArr[llIlIIlII[46]] = new WorldPoint(llIlIIlII[110], llIlIIlII[111], llIlIIlII[1]);
        worldPointArr[llIlIIlII[43]] = new WorldPoint(llIlIIlII[110], llIlIIlII[89], llIlIIlII[1]);
        worldPointArr[llIlIIlII[47]] = new WorldPoint(llIlIIlII[112], llIlIIlII[87], llIlIIlII[1]);
        worldPointArr[llIlIIlII[48]] = new WorldPoint(llIlIIlII[51], llIlIIlII[113], llIlIIlII[1]);
        worldPointArr[llIlIIlII[54]] = new WorldPoint(llIlIIlII[44], llIlIIlII[87], llIlIIlII[1]);
        worldPointArr[llIlIIlII[55]] = new WorldPoint(llIlIIlII[114], llIlIIlII[115], llIlIIlII[1]);
        worldPointArr[llIlIIlII[60]] = new WorldPoint(llIlIIlII[116], llIlIIlII[117], llIlIIlII[1]);
        worldPointArr[llIlIIlII[30]] = new WorldPoint(llIlIIlII[116], llIlIIlII[118], llIlIIlII[1]);
        worldPointArr[llIlIIlII[62]] = new WorldPoint(llIlIIlII[119], llIlIIlII[120], llIlIIlII[1]);
        worldPointArr[llIlIIlII[40]] = new WorldPoint(llIlIIlII[121], llIlIIlII[122], llIlIIlII[1]);
        worldPointArr[llIlIIlII[63]] = new WorldPoint(llIlIIlII[49], llIlIIlII[123], llIlIIlII[1]);
        worldPointArr[llIlIIlII[64]] = new WorldPoint(llIlIIlII[124], llIlIIlII[95], llIlIIlII[1]);
        worldPointArr[llIlIIlII[65]] = new WorldPoint(llIlIIlII[125], llIlIIlII[126], llIlIIlII[1]);
        worldPointArr[llIlIIlII[39]] = new WorldPoint(llIlIIlII[127], llIlIIlII[93], llIlIIlII[1]);
        if (lIllIIllIllI(ga.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint7 = new WorldPoint(llIlIIlII[128], llIlIIlII[129], llIlIIlII[1]);
            if (lIllIIllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), llIlIIlII[9])) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[234]];
                if (lIllIIlllIlI(NPCs.getNearest(npc -> {
                    return npc.getName().contains(llIIllIll[llIlIIlII[300]]);
                })) && lIllIIlllIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MISSILES);
                }
                if (lIllIIllllIl(NPCs.getNearest(npc2 -> {
                    return npc2.getName().contains(llIIllIll[llIlIIlII[299]]);
                })) && lIllIIllIllI(Prayers.isEnabled(Prayer.PROTECT_FROM_MISSILES) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MISSILES);
                }
                Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                "".length();
                Time.sleepTicks(llIlIIlII[0]);
                "".length();
            }
            if (lIllIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), llIlIIlII[9])) {
                AccBuilderGWD.c = llIIllIll[llIlIIlII[235]];
                String[] strArr6 = new String[llIlIIlII[0]];
                strArr6[llIlIIlII[1]] = llIIllIll[llIlIIlII[236]];
                TileObjects.getNearest(strArr6).interact(llIIllIll[llIlIIlII[237]]);
                Time.sleepTicks(llIlIIlII[6]);
                "".length();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIlIIlII[1];
    }
}
