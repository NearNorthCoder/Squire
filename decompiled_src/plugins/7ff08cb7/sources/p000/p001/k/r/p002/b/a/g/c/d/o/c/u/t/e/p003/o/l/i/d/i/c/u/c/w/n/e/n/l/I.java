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
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
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
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.I  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/I.class */
public class I implements ab {
    private static /* synthetic */ int[] lIIIIlIIll;
    static /* synthetic */ WorldPoint fH;
    public static /* synthetic */ List<C0003d> bx;
    static /* synthetic */ boolean dl;
    static /* synthetic */ int dk;
    static /* synthetic */ String[] cG;
    static /* synthetic */ WorldPoint fI;
    static /* synthetic */ WorldPoint fG;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ int fK;
    static /* synthetic */ WorldPoint fJ;
    private static /* synthetic */ String[] lIIIIlIIlI;

    private static String lllIIIIIlIII(String llllIIlIllIl, String llllIIlIllII) {
        try {
            SecretKeySpec llllIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIlIIll[8], llllIIllIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIlIlllI) {
            llllIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIlIIII(int i) {
        return i != 0;
    }

    private static boolean lllIIIIIlllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllIIIIlIllI(int i, int i2) {
        return i != i2;
    }

    static {
        lllIIIIIllII();
        lllIIIIIlIll();
        bx = new ArrayList();
        fG = new WorldPoint(lIIIIlIIll[68], lIIIIlIIll[69], lIIIIlIIll[6]);
        fH = new WorldPoint(lIIIIlIIll[70], lIIIIlIIll[71], lIIIIlIIll[6]);
        fI = new WorldPoint(lIIIIlIIll[72], lIIIIlIIll[73], lIIIIlIIll[6]);
        fJ = new WorldPoint(lIIIIlIIll[74], lIIIIlIIll[75], lIIIIlIIll[6]);
        String[] strArr = new String[lIIIIlIIll[1]];
        strArr[lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[76]];
        strArr[lIIIIlIIll[5]] = lIIIIlIIlI[lIIIIlIIll[42]];
        strArr[lIIIIlIIll[8]] = lIIIIlIIlI[lIIIIlIIll[77]];
        cG = strArr;
        fK = lIIIIlIIll[78];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lIIIIlIIll[5]];
        iArr[lIIIIlIIll[6]] = lIIIIlIIll[25];
        if (lllIIIIlIIll(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIIIlIIll[5]];
            iArr2[lIIIIlIIll[6]] = lIIIIlIIll[16];
            if (lllIIIIlIIll(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIIIlIIll[5]];
                iArr3[lIIIIlIIll[6]] = lIIIIlIIll[17];
                if (lllIIIIlIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIIIlIIll[5]];
                    iArr4[lIIIIlIIll[6]] = lIIIIlIIll[19];
                    if (lllIIIIlIIII(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIIlIIll[5]];
                        iArr5[lIIIIlIIll[6]] = lIIIIlIIll[10];
                        if (lllIIIIlIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIIlIIll[5]];
                            iArr6[lIIIIlIIll[6]] = lIIIIlIIll[22];
                            if (lllIIIIlIIII(Inventory.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[lIIIIlIIll[5]];
                                iArr7[lIIIIlIIll[6]] = lIIIIlIIll[26];
                                if (lllIIIIlIIII(Inventory.contains(iArr7) ? 1 : 0)) {
                                    ?? r0 = lIIIIlIIll[5];
                                    "".length();
                                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return lIIIIlIIll[6];
    }

    private static boolean lllIIIIlIIIl(int i) {
        return i == 0;
    }

    private static boolean lllIIIIlIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lllIIIIlIlll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllIIIIlIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lllIIIIlIlII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b28, code lost:
        if (lllIIIIlIIlI(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0b40, code lost:
        if (lllIIIIlIlll(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[41]) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0b43, code lost:
        gg.squire.account.AccBuilderGWD.c = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIlI[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[56]];
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.J.ce();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0b53, code lost:
        r0 = new java.lang.String[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[5]];
        r0[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[6]] = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIlI[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[57]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0b73, code lost:
        if (lllIIIIlIIlI(net.unethicalite.api.entities.NPCs.getNearest(r0)) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0b7c, code lost:
        if (lllIIIIlIIIl(net.unethicalite.api.widgets.Dialog.isOpen() ? 1 : 0) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b7f, code lost:
        gg.squire.account.AccBuilderGWD.c = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIlI[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[58]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0b97, code lost:
        if (lllIIIIIllIl(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.dk, p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[5]) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0b9a, code lost:
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.as.oy += p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[5];
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.as.u(gg.squire.account.AccBuilderGWD.m);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.dk += p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[5];
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.as.oy = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[6];
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.dl = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0bca, code lost:
        r0 = new int[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[5]];
        r0[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[6]] = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[52];
        r0 = net.unethicalite.api.items.Inventory.getFirst(r0);
        r1 = new java.lang.String[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[5]];
        r1[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[6]] = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIlI[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[59]];
        r0.useOn(net.unethicalite.api.entities.TileObjects.getNearest(r1));
        net.unethicalite.api.commons.Time.sleepTicks(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[5]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0c10, code lost:
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.C0006g.a(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.cG);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0c16, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d6, code lost:
        if (lllIIIIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[9]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021a, code lost:
        if (lllIIIIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[3]) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x025e, code lost:
        if (lllIIIIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[4]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0261, code lost:
        Q();
        java.lang.System.out.println(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIlI[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[1]]);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.bv = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v399, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v414, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v442, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cb() {
        if (lllIIIIIllIl(C0004e.j(lIIIIlIIll[0]), lIIIIlIIll[1])) {
            J.cd();
        }
        if (lllIIIIIlllI(C0004e.j(lIIIIlIIll[0]), lIIIIlIIll[1]) && lllIIIIIllIl(C0004e.j(lIIIIlIIll[2]), lIIIIlIIll[3])) {
            B.bs();
        }
        if (!lllIIIIIlllI(Skills.getLevel(Skill.COOKING), lIIIIlIIll[4]) || !lllIIIIIlllI(C0004e.j(lIIIIlIIll[0]), lIIIIlIIll[1]) || !lllIIIIIllll(C0004e.j(lIIIIlIIll[2]), lIIIIlIIll[3])) {
            return;
        }
        if (lllIIIIlIIII(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (lllIIIIIllIl(bx.size(), lIIIIlIIll[5])) {
                System.out.println(lIIIIlIIlI[lIIIIlIIll[6]]);
                bv = lIIIIlIIll[6];
            }
        }
        if (!lllIIIIlIIIl(bv ? 1 : 0)) {
            return;
        }
        if (lllIIIIlIIIl(an() ? 1 : 0) && lllIIIIlIIIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            BankLocation nearest = BankLocation.getNearest();
            if (lllIIIIlIIlI(nearest) && lllIIIIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[5]];
                C0000a.a(nearest);
            }
            if (lllIIIIlIIlI(nearest) && lllIIIIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lllIIIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIIlIIll[7]);
                    "".length();
                }
                if (lllIIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[8]];
                    if (lllIIIIlIIll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIIIIlIIll[9]);
                        "".length();
                    }
                    if (lllIIIIlIIll(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lIIIIlIIll[8]);
                        "".length();
                    }
                    int[] iArr = new int[lIIIIlIIll[5]];
                    iArr[lIIIIlIIll[6]] = lIIIIlIIll[10];
                    if (lllIIIIlIIII(Bank.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIIIIlIIll[5]];
                        iArr2[lIIIIlIIll[6]] = lIIIIlIIll[10];
                    }
                    int[] iArr3 = new int[lIIIIlIIll[5]];
                    iArr3[lIIIIlIIll[6]] = lIIIIlIIll[11];
                    if (lllIIIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIIIlIIll[5]];
                        iArr4[lIIIIlIIll[6]] = lIIIIlIIll[11];
                    }
                    int[] iArr5 = new int[lIIIIlIIll[5]];
                    iArr5[lIIIIlIIll[6]] = lIIIIlIIll[12];
                    if (lllIIIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIIIlIIll[5]];
                        iArr6[lIIIIlIIll[6]] = lIIIIlIIll[12];
                    }
                    int[] iArr7 = new int[lIIIIlIIll[2]];
                    iArr7[lIIIIlIIll[6]] = lIIIIlIIll[13];
                    iArr7[lIIIIlIIll[5]] = lIIIIlIIll[14];
                    iArr7[lIIIIlIIll[8]] = lIIIIlIIll[12];
                    iArr7[lIIIIlIIll[1]] = lIIIIlIIll[15];
                    iArr7[lIIIIlIIll[9]] = lIIIIlIIll[16];
                    iArr7[lIIIIlIIll[3]] = lIIIIlIIll[17];
                    iArr7[lIIIIlIIll[18]] = lIIIIlIIll[19];
                    iArr7[lIIIIlIIll[20]] = lIIIIlIIll[10];
                    iArr7[lIIIIlIIll[21]] = lIIIIlIIll[22];
                    iArr7[lIIIIlIIll[23]] = lIIIIlIIll[24];
                    iArr7[lIIIIlIIll[4]] = lIIIIlIIll[25];
                    if (lllIIIIlIIIl(C0004e.d(iArr7) ? 1 : 0)) {
                        Q();
                        System.out.println(lIIIIlIIlI[lIIIIlIIll[9]]);
                        bv = lIIIIlIIll[5];
                        return;
                    }
                    int[] iArr8 = new int[lIIIIlIIll[2]];
                    iArr8[lIIIIlIIll[6]] = lIIIIlIIll[13];
                    iArr8[lIIIIlIIll[5]] = lIIIIlIIll[14];
                    iArr8[lIIIIlIIll[8]] = lIIIIlIIll[12];
                    iArr8[lIIIIlIIll[1]] = lIIIIlIIll[15];
                    iArr8[lIIIIlIIll[9]] = lIIIIlIIll[16];
                    iArr8[lIIIIlIIll[3]] = lIIIIlIIll[17];
                    iArr8[lIIIIlIIll[18]] = lIIIIlIIll[19];
                    iArr8[lIIIIlIIll[20]] = lIIIIlIIll[10];
                    iArr8[lIIIIlIIll[21]] = lIIIIlIIll[22];
                    iArr8[lIIIIlIIll[23]] = lIIIIlIIll[24];
                    iArr8[lIIIIlIIll[4]] = lIIIIlIIll[25];
                    if (lllIIIIlIIII(C0004e.d(iArr8) ? 1 : 0)) {
                        C0000a.a(lIIIIlIIll[13], lIIIIlIIll[4]);
                        C0000a.a(lIIIIlIIll[14], lIIIIlIIll[4]);
                        C0000a.a(lIIIIlIIll[12], lIIIIlIIll[4]);
                        C0000a.a(lIIIIlIIll[15], lIIIIlIIll[5]);
                        C0000a.a(lIIIIlIIll[16], lIIIIlIIll[5]);
                        C0000a.a(lIIIIlIIll[17], lIIIIlIIll[5]);
                        C0000a.a(lIIIIlIIll[19], lIIIIlIIll[5]);
                        C0000a.a(lIIIIlIIll[10], lIIIIlIIll[9]);
                        C0000a.a(lIIIIlIIll[22], lIIIIlIIll[5]);
                        C0000a.a(lIIIIlIIll[25], lIIIIlIIll[5]);
                        C0000a.a(lIIIIlIIll[24], lIIIIlIIll[3]);
                        C0000a.a(lIIIIlIIll[11], lIIIIlIIll[8]);
                        C0000a.a(lIIIIlIIll[26], lIIIIlIIll[7]);
                    }
                }
            }
        }
        if (lllIIIIlIIII(Inventory.contains(C0005f.bc) ? 1 : 0) && lllIIIIIllIl(Movement.getRunEnergy(), lIIIIlIIll[27])) {
            Inventory.getFirst(C0005f.bc).interact(lIIIIlIIlI[lIIIIlIIll[3]]);
            Time.sleepTicks(lIIIIlIIll[5]);
            "".length();
        }
        if (lllIIIIlIIII(an() ? 1 : 0) && lllIIIIlIIIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            if (lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fG), lIIIIlIIll[9])) {
                String[] strArr = new String[lIIIIlIIll[5]];
                strArr[lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[18]];
                if (lllIIIIlIlIl(NPCs.getNearest(strArr))) {
                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[20]];
                    J.ce();
                }
            }
            String[] strArr2 = new String[lIIIIlIIll[5]];
            strArr2[lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[21]];
            if (lllIIIIlIIlI(NPCs.getNearest(strArr2))) {
                if (lllIIIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr3 = new String[lIIIIlIIll[5]];
                    strArr3[lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[23]];
                    TileObjects.getNearest(strArr3).interact(lIIIIlIIlI[lIIIIlIIll[4]]);
                    Time.sleepTicks(lIIIIlIIll[5]);
                    "".length();
                }
                C0006g.a(cG);
            }
        }
        if (lllIIIIIllll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIlIIll[4])) {
            if (lllIIIIlIllI(Vars.getBit(lIIIIlIIll[28]), lIIIIlIIll[5])) {
                if (lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fH), lIIIIlIIll[20])) {
                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[2]];
                    Movement.walkTo(fH);
                    "".length();
                    Time.sleepTicks(lIIIIlIIll[5]);
                    "".length();
                }
                if (lllIIIIlIlll(Players.getLocal().getWorldLocation().distanceTo(fH), lIIIIlIIll[20])) {
                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[29]];
                    C0006g.a(lIIIIlIIlI[lIIIIlIIll[30]], cG);
                }
            }
            if (lllIIIIIllll(Vars.getBit(lIIIIlIIll[28]), lIIIIlIIll[5])) {
                int[] iArr9 = new int[lIIIIlIIll[5]];
                iArr9[lIIIIlIIll[6]] = lIIIIlIIll[10];
                if (lllIIIIlIIII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIIlIIll[5]];
                    iArr10[lIIIIlIIll[6]] = lIIIIlIIll[26];
                    Item first = Inventory.getFirst(iArr10);
                    int[] iArr11 = new int[lIIIIlIIll[5]];
                    iArr11[lIIIIlIIll[6]] = lIIIIlIIll[10];
                    first.useOn(Inventory.getFirst(iArr11));
                    Time.sleepTicks(lIIIIlIIll[5]);
                    "".length();
                }
                int[] iArr12 = new int[lIIIIlIIll[5]];
                iArr12[lIIIIlIIll[6]] = lIIIIlIIll[10];
                if (lllIIIIlIIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                    if (lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fI), lIIIIlIIll[20])) {
                        AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[31]];
                        Movement.walkTo(fI);
                        "".length();
                        Time.sleepTicks(lIIIIlIIll[5]);
                        "".length();
                    }
                    if (lllIIIIlIlll(Players.getLocal().getWorldLocation().distanceTo(fI), lIIIIlIIll[20])) {
                        AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[32]];
                        C0006g.a(lIIIIlIIlI[lIIIIlIIll[33]], cG);
                    }
                }
            }
        }
        if (lllIIIIIllll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIlIIll[34])) {
            if (lllIIIIlIllI(Vars.getBit(lIIIIlIIll[35]), lIIIIlIIll[9])) {
                dk = lIIIIlIIll[6];
                if (lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fI), lIIIIlIIll[20])) {
                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[36]];
                    Movement.walkTo(fI);
                    "".length();
                    Time.sleepTicks(lIIIIlIIll[5]);
                    "".length();
                }
                if (lllIIIIlIlll(Players.getLocal().getWorldLocation().distanceTo(fI), lIIIIlIIll[20])) {
                    AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[37]];
                    C0006g.a(lIIIIlIIlI[lIIIIlIIll[38]], cG);
                    C0006g.a(lIIIIlIIlI[lIIIIlIIll[34]], cG);
                }
            }
            if (lllIIIIIllll(Vars.getBit(lIIIIlIIll[35]), lIIIIlIIll[9])) {
                AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[39]];
                C0006g.a(lIIIIlIIlI[lIIIIlIIll[40]], cG);
            }
        }
        if (!lllIIIIlIllI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIlIIll[41]) || lllIIIIIllll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIlIIll[42])) {
            AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[43]];
            C0006g.a(lIIIIlIIlI[lIIIIlIIll[44]], cG);
        }
        if (!lllIIIIIllll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIIIlIIll[27])) {
            return;
        }
        int[] iArr13 = new int[lIIIIlIIll[5]];
        iArr13[lIIIIlIIll[6]] = lIIIIlIIll[22];
        if (lllIIIIlIIIl(Equipment.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIIIIlIIll[5]];
            iArr14[lIIIIlIIll[6]] = lIIIIlIIll[22];
            if (lllIIIIlIIII(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIIIlIIll[5]];
                iArr15[lIIIIlIIll[6]] = lIIIIlIIll[22];
                Inventory.getFirst(iArr15).interact(lIIIIlIIlI[lIIIIlIIll[45]]);
                Time.sleepTicks(lIIIIlIIll[5]);
                "".length();
            }
        }
        int[] iArr16 = new int[lIIIIlIIll[5]];
        iArr16[lIIIIlIIll[6]] = lIIIIlIIll[22];
        if (lllIIIIlIIII(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lIIIIlIIll[5]];
            iArr17[lIIIIlIIll[6]] = lIIIIlIIll[46];
            if (lllIIIIlIIlI(TileItems.getNearest(iArr17))) {
                int[] iArr18 = new int[lIIIIlIIll[5]];
                iArr18[lIIIIlIIll[6]] = lIIIIlIIll[46];
                TileItems.getNearest(iArr18).interact(lIIIIlIIlI[lIIIIlIIll[47]]);
                Time.sleepTicks(lIIIIlIIll[5]);
                "".length();
            }
        }
        int[] iArr19 = new int[lIIIIlIIll[5]];
        iArr19[lIIIIlIIll[6]] = lIIIIlIIll[46];
        if (lllIIIIlIIII(Inventory.contains(iArr19) ? 1 : 0)) {
            int[] iArr20 = new int[lIIIIlIIll[5]];
            iArr20[lIIIIlIIll[6]] = lIIIIlIIll[25];
            if (lllIIIIlIIII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIIIlIIll[5]];
                iArr21[lIIIIlIIll[6]] = lIIIIlIIll[25];
                if (lllIIIIlIIIl(Equipment.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIIlIIll[5]];
                    iArr22[lIIIIlIIll[6]] = lIIIIlIIll[25];
                    Inventory.getFirst(iArr22).interact(lIIIIlIIlI[lIIIIlIIll[48]]);
                    Time.sleepTicks(lIIIIlIIll[5]);
                    "".length();
                }
            }
            if (lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIIlIIll[18])) {
                AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[49]];
                Movement.walkTo(fJ);
                "".length();
                Time.sleepTicks(lIIIIlIIll[5]);
                "".length();
            }
            if (lllIIIIlIlll(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIIlIIll[18])) {
                AccBuilderGWD.c = lIIIIlIIlI[lIIIIlIIll[50]];
                if (lllIIIIlIlIl(Players.getLocal().getInteracting())) {
                    String[] strArr4 = new String[lIIIIlIIll[5]];
                    strArr4[lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[41]];
                    NPCs.getNearest(strArr4).interact(lIIIIlIIlI[lIIIIlIIll[51]]);
                    Time.sleepTicks(lIIIIlIIll[1]);
                    "".length();
                }
            }
        }
        int[] iArr23 = new int[lIIIIlIIll[5]];
        iArr23[lIIIIlIIll[6]] = lIIIIlIIll[52];
        if (!lllIIIIlIIII(Inventory.contains(iArr23) ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIIIlIIll[53], lIIIIlIIll[54], lIIIIlIIll[6]);
        if (lllIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fG), lIIIIlIIll[9])) {
            String[] strArr5 = new String[lIIIIlIIll[5]];
            strArr5[lIIIIlIIll[6]] = lIIIIlIIlI[lIIIIlIIll[55]];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIlIIll[6];
    }

    private static boolean lllIIIIllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            cb();
            "".length();
            if ((-" ".length()) >= ((208 ^ 162) ^ (86 ^ 32))) {
                return ((115 ^ 117) ^ (88 ^ 4)) & (((213 ^ 139) ^ (145 ^ 149)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIIlIIll[65];
    }

    private static boolean lllIIIIIllll(int i, int i2) {
        return i == i2;
    }

    private static void lllIIIIIlIll() {
        lIIIIlIIlI = new String[lIIIIlIIll[79]];
        lIIIIlIIlI[lIIIIlIIll[6]] = lllIIIIIlIII("6PaYIgi0TdAKgtzdj0qKT2lr3nXhEq6zGwU3XSqEgDt7/+GWeWq6451YWp9vCXh+", "vLaOH");
        lIIIIlIIlI[lIIIIlIIll[5]] = lllIIIIIlIII("DU9cOnrVesm1AKSCfFY9Ww==", "xLNqV");
        lIIIIlIIlI[lIIIIlIIll[8]] = lllIIIIIlIIl("nWoT2JZ1YjR8MqWX2Nc3JYHCsAzxflw0", "chpkc");
        lIIIIlIIlI[lIIIIlIIll[1]] = lllIIIIIlIIl("E67JdfgKiKfKRY/j0nbRu8xbhPCkc21LL1Z+3P4pnpmwPRQ+A7n3gmBfRN8fTlf0dntWlo/KlP8=", "lyVLa");
        lIIIIlIIlI[lIIIIlIIll[9]] = lllIIIIIlIlI("MwRWGyoBQRsTKxcIGB14FRQTCSxEEgMKKAgIEwl0RBIBEywHCR8UP0QVGVoaMTg/NB8=", "davzX");
        lIIIIlIIlI[lIIIIlIIll[3]] = lllIIIIIlIII("msTX4qeUIIQ=", "csALK");
        lIIIIlIIlI[lIIIIlIIll[18]] = lllIIIIIlIlI("KiE8Eg==", "kSUap");
        lIIIIlIIlI[lIIIIlIIll[20]] = lllIIIIIlIIl("DbJ2oDa/eDmJrLEHXx/KuA==", "hUngT");
        lIIIIlIIlI[lIIIIlIIll[21]] = lllIIIIIlIIl("297Q4bLgR14=", "KPXhO");
        lIIIIlIIlI[lIIIIlIIll[23]] = lllIIIIIlIII("XkCzbxjSzJs=", "LrDvd");
        lIIIIlIIlI[lIIIIlIIll[4]] = lllIIIIIlIlI("BCo+FS0uMA==", "MDMeH");
        lIIIIlIIlI[lIIIIlIIll[2]] = lllIIIIIlIIl("9tmPIeslR/XFqZrhuyedbMy+8Jcb609W", "nUilh");
        lIIIIlIIlI[lIIIIlIIll[29]] = lllIIIIIlIlI("DA0XJjohTBoqNzA=", "DlyBV");
        lIIIIlIIlI[lIIIIlIIll[30]] = lllIIIIIlIIl("R5brp3CpX8w=", "oRfpx");
        lIIIIlIIlI[lIIIIlIIll[31]] = lllIIIIIlIII("Jz0AY6guciG3cVLJkxDovOeP+j8/N0bH", "gJAoQ");
        lIIIIlIIlI[lIIIIlIIll[32]] = lllIIIIIlIII("L1zmfLIcFP6uHxDDFnpRUw==", "spERf");
        lIIIIlIIlI[lIIIIlIIll[33]] = lllIIIIIlIlI("KRdlKCoMWQEwJxof", "hyEGF");
        lIIIIlIIlI[lIIIIlIIll[36]] = lllIIIIIlIIl("J2pz5QfvKRLGWPdRk4BU2zLHzrgju5fE", "EbGDp");
        lIIIIlIIlI[lIIIIlIIll[37]] = lllIIIIIlIlI("IgYDHB0PRw4QEB4=", "jgmxq");
        lIIIIlIIlI[lIIIIlIIll[38]] = lllIIIIIlIII("/qcUwGDwVfvYPPqfI8OjGA==", "Imxfn");
        lIIIIlIIlI[lIIIIlIIll[34]] = lllIIIIIlIIl("EAQx/QkPTTA=", "nVZCH");
        lIIIIlIIlI[lIIIIlIIll[39]] = lllIIIIIlIlI("LTQjHTgAdS4RNRE=", "eUMyT");
        lIIIIlIIlI[lIIIIlIIll[40]] = lllIIIIIlIlI("PBoZGxw=", "nuqzw");
        lIIIIlIIlI[lIIIIlIIll[43]] = lllIIIIIlIII("1bwBakFwvS/IwkPrtmr0Mg==", "ZlaXo");
        lIIIIlIIlI[lIIIIlIIll[44]] = lllIIIIIlIIl("YGu9C18wv8k=", "fmKBe");
        lIIIIlIIlI[lIIIIlIIll[45]] = lllIIIIIlIlI("MAApEA==", "geHbA");
        lIIIIlIIlI[lIIIIlIIll[47]] = lllIIIIIlIII("gRZEIIo95p0=", "KGqOA");
        lIIIIlIIlI[lIIIIlIIll[48]] = lllIIIIIlIlI("Dx8hIwY=", "XvDOb");
        lIIIIlIIlI[lIIIIlIIll[49]] = lllIIIIIlIlI("CDQudA0pdTE3HCA8PTod", "FUXTy");
        lIIIIlIIlI[lIIIIlIIll[50]] = lllIIIIIlIII("LPUDu+joZuj2sti8vuxM/A==", "pQJUH");
        lIIIIlIIlI[lIIIIlIIll[41]] = lllIIIIIlIII("h0YRblDPBeeadLVl9fv5oA==", "fepAJ");
        lIIIIlIIlI[lIIIIlIIll[51]] = lllIIIIIlIlI("CC49MDMi", "IZIQP");
        lIIIIlIIlI[lIIIIlIIll[55]] = lllIIIIIlIlI("CxMPIQ==", "JafRm");
        lIIIIlIIlI[lIIIIlIIll[56]] = lllIIIIIlIIl("LBQlxYKUP/mJsPQb3aaVEA==", "rGSFk");
        lIIIIlIIlI[lIIIIlIIll[57]] = lllIIIIIlIII("p6qheuRhe+Q=", "uiqTT");
        lIIIIlIIlI[lIIIIlIIll[58]] = lllIIIIIlIlI("KxMJAyMFEwkNcBwPAhkk", "mzgjP");
        lIIIIlIIlI[lIIIIlIIll[59]] = lllIIIIIlIIl("WmDg39N40GU=", "NDTzX");
        lIIIIlIIlI[lIIIIlIIll[66]] = lllIIIIIlIlI("MSUjbQ0UAhUraRIWAj49", "ccgMI");
        lIIIIlIIlI[lIIIIlIIll[67]] = lllIIIIIlIII("1tNtO59f1n82jvTXz438UOAWqzhTH/D6", "iPviR");
        lIIIIlIIlI[lIIIIlIIll[76]] = lllIIIIIlIII("ZQ+XaHjR32g=", "Kiblv");
        lIIIIlIIlI[lIIIIlIIll[42]] = lllIIIIIlIlI("MAsMImUEAgN2PAgWTSIgCw9NOyBHAg85MBNDCSEkFRUIJWUGDQl2JAsGUg==", "gcmVE");
        lIIIIlIIlI[lIIIIlIIll[77]] = lllIIIIIlIIl("pmy7OctU72Vgx4SMaIURI3uzB4Qe6ClVjciI9KiFY3Nd22mhznZKhJdIBDrPV+vsLFeT7nUsxLI=", "xawXj");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0173, code lost:
        if (lllIIIIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[9]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0316, code lost:
        if (lllIIIIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[3]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03a0, code lost:
        if (lllIIIIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[4]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
        if (lllIIIIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.I.lIIIIlIIll[3]) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
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
        int[] iArr11 = new int[lIIIIlIIll[5]];
        iArr11[lIIIIlIIll[6]] = lIIIIlIIll[11];
        if (lllIIIIlIIII(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIIIIlIIll[5]];
            iArr12[lIIIIlIIll[6]] = lIIIIlIIll[11];
            if (lllIIIIlIIII(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIIIIlIIll[5]];
                iArr13[lIIIIlIIll[6]] = lIIIIlIIll[11];
            }
            iArr = new int[lIIIIlIIll[5]];
            iArr[lIIIIlIIll[6]] = lIIIIlIIll[25];
            if (lllIIIIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlIIll[25], lIIIIlIIll[5], lIIIIlIIll[60]));
                "".length();
            }
            iArr2 = new int[lIIIIlIIll[5]];
            iArr2[lIIIIlIIll[6]] = lIIIIlIIll[22];
            if (lllIIIIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlIIll[22], lIIIIlIIll[5], lIIIIlIIll[60]));
                "".length();
            }
            iArr3 = new int[lIIIIlIIll[5]];
            iArr3[lIIIIlIIll[6]] = lIIIIlIIll[10];
            if (lllIIIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr14 = new int[lIIIIlIIll[5]];
                iArr14[lIIIIlIIll[6]] = lIIIIlIIll[10];
                if (lllIIIIlIIII(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIIIlIIll[5]];
                    iArr15[lIIIIlIIll[6]] = lIIIIlIIll[10];
                }
                iArr4 = new int[lIIIIlIIll[5]];
                iArr4[lIIIIlIIll[6]] = lIIIIlIIll[19];
                if (lllIIIIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIlIIll[19], lIIIIlIIll[5], lIIIIlIIll[60]));
                    "".length();
                }
                iArr5 = new int[lIIIIlIIll[5]];
                iArr5[lIIIIlIIll[6]] = lIIIIlIIll[17];
                if (lllIIIIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIlIIll[17], lIIIIlIIll[5], lIIIIlIIll[60]));
                    "".length();
                }
                iArr6 = new int[lIIIIlIIll[5]];
                iArr6[lIIIIlIIll[6]] = lIIIIlIIll[15];
                if (lllIIIIlIIIl(Bank.contains(iArr6) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIlIIll[15], lIIIIlIIll[5], lIIIIlIIll[60]));
                    "".length();
                }
                iArr7 = new int[lIIIIlIIll[5]];
                iArr7[lIIIIlIIll[6]] = lIIIIlIIll[16];
                if (lllIIIIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIlIIll[16], lIIIIlIIll[5], lIIIIlIIll[60]));
                    "".length();
                }
                iArr8 = new int[lIIIIlIIll[5]];
                iArr8[lIIIIlIIll[6]] = lIIIIlIIll[14];
                if (lllIIIIlIIII(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr16 = new int[lIIIIlIIll[5]];
                    iArr16[lIIIIlIIll[6]] = lIIIIlIIll[14];
                    if (lllIIIIlIIII(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIIIlIIll[5]];
                        iArr17[lIIIIlIIll[6]] = lIIIIlIIll[14];
                    }
                    iArr9 = new int[lIIIIlIIll[5]];
                    iArr9[lIIIIlIIll[6]] = lIIIIlIIll[12];
                    if (lllIIIIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
                        int[] iArr18 = new int[lIIIIlIIll[5]];
                        iArr18[lIIIIlIIll[6]] = lIIIIlIIll[12];
                        if (lllIIIIlIIII(Bank.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[lIIIIlIIll[5]];
                            iArr19[lIIIIlIIll[6]] = lIIIIlIIll[12];
                        }
                        if (lllIIIIlIIIl(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(lIIIIlIIlI[lIIIIlIIll[67]]);
                        }) ? 1 : 0)) {
                            bx.add(new C0003d(lIIIIlIIll[63], lIIIIlIIll[3], lIIIIlIIll[64]));
                            "".length();
                        }
                        iArr10 = new int[lIIIIlIIll[5]];
                        iArr10[lIIIIlIIll[6]] = lIIIIlIIll[13];
                        if (lllIIIIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                            bx.add(new C0003d(lIIIIlIIll[13], lIIIIlIIll[42], lIIIIlIIll[62]));
                            "".length();
                            return;
                        }
                        return;
                    }
                    bx.add(new C0003d(lIIIIlIIll[12], lIIIIlIIll[4], lIIIIlIIll[62]));
                    "".length();
                    if (lllIIIIlIIIl(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(lIIIIlIIlI[lIIIIlIIll[67]]);
                    }) ? 1 : 0)) {
                    }
                    iArr10 = new int[lIIIIlIIll[5]];
                    iArr10[lIIIIlIIll[6]] = lIIIIlIIll[13];
                    if (lllIIIIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                }
                bx.add(new C0003d(lIIIIlIIll[14], lIIIIlIIll[4], lIIIIlIIll[62]));
                "".length();
                iArr9 = new int[lIIIIlIIll[5]];
                iArr9[lIIIIlIIll[6]] = lIIIIlIIll[12];
                if (lllIIIIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
                }
                bx.add(new C0003d(lIIIIlIIll[12], lIIIIlIIll[4], lIIIIlIIll[62]));
                "".length();
                if (lllIIIIlIIIl(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(lIIIIlIIlI[lIIIIlIIll[67]]);
                }) ? 1 : 0)) {
                }
                iArr10 = new int[lIIIIlIIll[5]];
                iArr10[lIIIIlIIll[6]] = lIIIIlIIll[13];
                if (lllIIIIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                }
            }
            bx.add(new C0003d(lIIIIlIIll[10], lIIIIlIIll[9], lIIIIlIIll[61]));
            "".length();
            iArr4 = new int[lIIIIlIIll[5]];
            iArr4[lIIIIlIIll[6]] = lIIIIlIIll[19];
            if (lllIIIIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIIIIlIIll[5]];
            iArr5[lIIIIlIIll[6]] = lIIIIlIIll[17];
            if (lllIIIIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIIIIlIIll[5]];
            iArr6[lIIIIlIIll[6]] = lIIIIlIIll[15];
            if (lllIIIIlIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lIIIIlIIll[5]];
            iArr7[lIIIIlIIll[6]] = lIIIIlIIll[16];
            if (lllIIIIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lIIIIlIIll[5]];
            iArr8[lIIIIlIIll[6]] = lIIIIlIIll[14];
            if (lllIIIIlIIII(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIlIIll[14], lIIIIlIIll[4], lIIIIlIIll[62]));
            "".length();
            iArr9 = new int[lIIIIlIIll[5]];
            iArr9[lIIIIlIIll[6]] = lIIIIlIIll[12];
            if (lllIIIIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIlIIll[12], lIIIIlIIll[4], lIIIIlIIll[62]));
            "".length();
            if (lllIIIIlIIIl(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(lIIIIlIIlI[lIIIIlIIll[67]]);
            }) ? 1 : 0)) {
            }
            iArr10 = new int[lIIIIlIIll[5]];
            iArr10[lIIIIlIIll[6]] = lIIIIlIIll[13];
            if (lllIIIIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
            }
        }
        bx.add(new C0003d(lIIIIlIIll[11], lIIIIlIIll[3], C0009j.ch));
        "".length();
        iArr = new int[lIIIIlIIll[5]];
        iArr[lIIIIlIIll[6]] = lIIIIlIIll[25];
        if (lllIIIIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIIIlIIll[5]];
        iArr2[lIIIIlIIll[6]] = lIIIIlIIll[22];
        if (lllIIIIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIIlIIll[5]];
        iArr3[lIIIIlIIll[6]] = lIIIIlIIll[10];
        if (lllIIIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlIIll[10], lIIIIlIIll[9], lIIIIlIIll[61]));
        "".length();
        iArr4 = new int[lIIIIlIIll[5]];
        iArr4[lIIIIlIIll[6]] = lIIIIlIIll[19];
        if (lllIIIIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIIIlIIll[5]];
        iArr5[lIIIIlIIll[6]] = lIIIIlIIll[17];
        if (lllIIIIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIIIIlIIll[5]];
        iArr6[lIIIIlIIll[6]] = lIIIIlIIll[15];
        if (lllIIIIlIIIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIIIIlIIll[5]];
        iArr7[lIIIIlIIll[6]] = lIIIIlIIll[16];
        if (lllIIIIlIIIl(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lIIIIlIIll[5]];
        iArr8[lIIIIlIIll[6]] = lIIIIlIIll[14];
        if (lllIIIIlIIII(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlIIll[14], lIIIIlIIll[4], lIIIIlIIll[62]));
        "".length();
        iArr9 = new int[lIIIIlIIll[5]];
        iArr9[lIIIIlIIll[6]] = lIIIIlIIll[12];
        if (lllIIIIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlIIll[12], lIIIIlIIll[4], lIIIIlIIll[62]));
        "".length();
        if (lllIIIIlIIIl(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(lIIIIlIIlI[lIIIIlIIll[67]]);
        }) ? 1 : 0)) {
        }
        iArr10 = new int[lIIIIlIIll[5]];
        iArr10[lIIIIlIIll[6]] = lIIIIlIIll[13];
        if (lllIIIIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lIIIIlIIlI[lIIIIlIIll[66]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lllIIIIllIII(Quests.getState(Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            ?? r0 = lIIIIlIIll[5];
            "".length();
            return (-" ".length()) == "  ".length() ? ((16 ^ 33) ^ (29 ^ 79)) & (((66 ^ 25) ^ (116 ^ 76)) ^ (-" ".length())) : r0;
        }
        return lIIIIlIIll[6];
    }

    private static boolean lllIIIIIllIl(int i, int i2) {
        return i < i2;
    }

    private static void lllIIIIIllII() {
        lIIIIlIIll = new int[80];
        lIIIIlIIll[0] = (-((-8353) & 31993)) & (-2) & 24319;
        lIIIIlIIll[1] = "   ".length();
        lIIIIlIIll[2] = (((118 + 126) - 180) + 88) ^ (((58 + 98) - 35) + 26);
        lIIIIlIIll[3] = 56 ^ 61;
        lIIIIlIIll[4] = 120 ^ 114;
        lIIIIlIIll[5] = " ".length();
        lIIIIlIIll[6] = ((66 ^ 71) ^ (21 ^ 33)) & (((136 ^ 171) ^ (103 ^ 117)) ^ (-" ".length()));
        lIIIIlIIll[7] = (-((-21785) & 32063)) & (-17489) & 32766;
        lIIIIlIIll[8] = "  ".length();
        lIIIIlIIll[9] = 105 ^ 109;
        lIIIIlIIll[10] = (-12417) & 14321;
        lIIIIlIIll[11] = (-2059) & 14683;
        lIIIIlIIll[12] = (-24609) & 32617;
        lIIIIlIIll[13] = (-((-7425) & 15785)) & (-1) & 16367;
        lIIIIlIIll[14] = (-24615) & 32622;
        lIIIIlIIll[15] = (-30817) & 32743;
        lIIIIlIIll[16] = (-(232 ^ 139)) & (-1) & 2031;
        lIIIIlIIll[17] = (-((-4027) & 16383)) & (-18435) & 32734;
        lIIIIlIIll[18] = 14 ^ 8;
        lIIIIlIIll[19] = (-(209 ^ 172)) & (-28675) & 30719;
        lIIIIlIIll[20] = 76 ^ 75;
        lIIIIlIIll[21] = (6 ^ 27) ^ (65 ^ 84);
        lIIIIlIIll[22] = (-((-3483) & 24031)) & (-10761) & 32367;
        lIIIIlIIll[23] = (200 ^ 191) ^ (60 ^ 66);
        lIIIIlIIll[24] = (-4097) & 4475;
        lIIIIlIIll[25] = (-((-4639) & 23135)) & (-4621) & 24447;
        lIIIIlIIll[26] = (-4101) & 5095;
        lIIIIlIIll[27] = (183 ^ 131) ^ (178 ^ 180);
        lIIIIlIIll[28] = (-20489) & 22379;
        lIIIIlIIll[29] = (55 ^ 18) ^ (48 ^ 25);
        lIIIIlIIll[30] = 111 ^ 98;
        lIIIIlIIll[31] = 150 ^ 152;
        lIIIIlIIll[32] = 134 ^ 137;
        lIIIIlIIll[33] = 171 ^ 187;
        lIIIIlIIll[34] = 59 ^ 47;
        lIIIIlIIll[35] = (-16385) & 18367;
        lIIIIlIIll[36] = (((93 + 69) - 49) + 27) ^ (((8 + 37) - (-34)) + 78);
        lIIIIlIIll[37] = (37 ^ 121) ^ (46 ^ 96);
        lIIIIlIIll[38] = (104 ^ 123) ^ ((103 ^ 96) & ((2 ^ 5) ^ (-1)));
        lIIIIlIIll[39] = (((66 + 111) - 82) + 68) ^ (((52 + 5) - (-40)) + 85);
        lIIIIlIIll[40] = (58 ^ 42) ^ (130 ^ 132);
        lIIIIlIIll[41] = 71 ^ 89;
        lIIIIlIIll[42] = 176 ^ 152;
        lIIIIlIIll[43] = 141 ^ 154;
        lIIIIlIIll[44] = 21 ^ 13;
        lIIIIlIIll[45] = (((173 + 148) - 165) + 26) ^ (((60 + 125) - 54) + 44);
        lIIIIlIIll[46] = (-8361) & 15869;
        lIIIIlIIll[47] = (44 ^ 100) ^ (106 ^ 56);
        lIIIIlIIll[48] = (121 ^ 105) ^ (67 ^ 72);
        lIIIIlIIll[49] = (64 ^ 18) ^ (244 ^ 186);
        lIIIIlIIll[50] = (8 ^ 76) ^ (229 ^ 188);
        lIIIIlIIll[51] = 11 ^ 20;
        lIIIIlIIll[52] = (-24585) & 32094;
        lIIIIlIIll[53] = (-289) & 3494;
        lIIIIlIIll[54] = (-((-19532) & 28383)) & (-5) & 12279;
        lIIIIlIIll[55] = (250 ^ 148) ^ (96 ^ 46);
        lIIIIlIIll[56] = 94 ^ 127;
        lIIIIlIIll[57] = (7 ^ 105) ^ (47 ^ 99);
        lIIIIlIIll[58] = 112 ^ 83;
        lIIIIlIIll[59] = (((2 + 19) - (-83)) + 49) ^ (((95 + 93) - 161) + 162);
        lIIIIlIIll[60] = (-(((98 + 55) - 99) + 81)) & (-19522) & 28655;
        lIIIIlIIll[61] = (-26) & 4025;
        lIIIIlIIll[62] = (-((-1686) & 32407)) & (-147) & 32767;
        lIIIIlIIll[63] = (-20737) & 32716;
        lIIIIlIIll[64] = (-((-29410) & 31477)) & (-5637) & 32703;
        lIIIIlIIll[65] = 58 ^ 94;
        lIIIIlIIll[66] = (((50 + 109) - 117) + 108) ^ (((112 + 124) - 134) + 77);
        lIIIIlIIll[67] = (31 ^ 72) ^ (83 ^ 34);
        lIIIIlIIll[68] = (-28969) & 32175;
        lIIIIlIIll[69] = (-8225) & 11446;
        lIIIIlIIll[70] = (-((-9829) & 30327)) & (-9217) & 32671;
        lIIIIlIIll[71] = (-29202) & 32573;
        lIIIIlIIll[72] = (-12299) & 15163;
        lIIIIlIIll[73] = (-321) & 10197;
        lIIIIlIIll[74] = (-1049) & 4057;
        lIIIIlIIll[75] = (-((-2177) & 15087)) & (-1) & 16383;
        lIIIIlIIll[76] = 187 ^ 156;
        lIIIIlIIll[77] = 122 ^ 83;
        lIIIIlIIll[78] = (-((-1987) & 30679)) & (-1283) & 30655;
        lIIIIlIIll[79] = (((99 + 130) - 13) + 17) ^ (((133 + 58) - 16) + 20);
    }

    private static String lllIIIIIlIlI(String llllIlIIllll, String llllIlIIlllI) {
        String llllIlIIllll2 = new String(Base64.getDecoder().decode(llllIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlIIllIl = new StringBuilder();
        char[] llllIlIIllII = llllIlIIlllI.toCharArray();
        int llllIlIIlIll = lIIIIlIIll[6];
        char[] charArray = llllIlIIllll2.toCharArray();
        int length = charArray.length;
        int i = lIIIIlIIll[6];
        while (lllIIIIIllIl(i, length)) {
            llllIlIIllIl.append((char) (charArray[i] ^ llllIlIIllII[llllIlIIlIll % llllIlIIllII.length]));
            "".length();
            llllIlIIlIll++;
            i++;
            "".length();
            if ((8 ^ 12) <= ((20 ^ 24) & ((185 ^ 181) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llllIlIIllIl);
    }

    private static String lllIIIIIlIIl(String llllIIlllIlI, String llllIIlllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIlllIIl.getBytes(StandardCharsets.UTF_8)), lIIIIlIIll[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIlIIll[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIlllIll) {
            llllIIlllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIlIIll(int i) {
        return i > 0;
    }
}
