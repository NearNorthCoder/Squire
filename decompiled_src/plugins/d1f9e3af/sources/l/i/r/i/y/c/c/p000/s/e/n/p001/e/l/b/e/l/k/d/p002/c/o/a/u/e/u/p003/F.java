package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.F  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/F.class */
public class F implements W {
    public static /* synthetic */ int he;
    private static final /* synthetic */ WorldPoint gV;
    public static final /* synthetic */ WorldPoint gl;
    public static /* synthetic */ WorldArea hc;
    private static final /* synthetic */ int gZ;
    private static final /* synthetic */ WorldPoint gB;
    static /* synthetic */ String hn;
    static final /* synthetic */ int gn;
    private static final /* synthetic */ int gX;
    private static final /* synthetic */ WorldPoint gF;
    private static final /* synthetic */ WorldPoint gO;
    static /* synthetic */ int hf;
    static /* synthetic */ int hh;
    private static final /* synthetic */ WorldPoint gQ;
    private static final /* synthetic */ WorldPoint gN;
    static /* synthetic */ WorldPoint hp;
    private static /* synthetic */ int[] lIIIIlIIl;
    public static final /* synthetic */ int[] ge;
    static /* synthetic */ int hg;
    private static final /* synthetic */ WorldPoint gU;
    static final /* synthetic */ int gu;
    static final /* synthetic */ int gp;
    private static final /* synthetic */ int gY;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ WorldPoint gW;
    public static /* synthetic */ int hd;
    public static final /* synthetic */ WorldPoint gj;
    private static final /* synthetic */ WorldPoint gG;
    static /* synthetic */ int hk;
    static /* synthetic */ int cl;
    private static final /* synthetic */ int hb;
    static final /* synthetic */ int gr;
    static final /* synthetic */ int gq;
    private static final /* synthetic */ WorldPoint gT;
    static /* synthetic */ String ho;
    private static final /* synthetic */ WorldPoint gE;
    static /* synthetic */ int hi;

    /* renamed from: gg  reason: collision with root package name */
    public static final /* synthetic */ WorldPoint f3gg;
    public static final /* synthetic */ WorldPoint gh;
    private static final /* synthetic */ WorldPoint gA;
    private static final /* synthetic */ WorldPoint gR;
    private static final /* synthetic */ WorldPoint gC;
    private static final /* synthetic */ WorldPoint gK;
    private static final /* synthetic */ WorldPoint gD;
    public static final /* synthetic */ WorldPoint gi;
    static final /* synthetic */ int gs;
    static /* synthetic */ WorldArea hq;
    private static final /* synthetic */ WorldPoint gS;
    static /* synthetic */ String[] hl;
    private static final /* synthetic */ WorldPoint gI;
    private static final /* synthetic */ int ha;
    static final /* synthetic */ int go;
    static final /* synthetic */ int gm;
    private static final /* synthetic */ WorldPoint gz;
    static /* synthetic */ int hj;
    private static final /* synthetic */ WorldPoint gx;
    static /* synthetic */ boolean cm;
    static final /* synthetic */ WorldPoint[] gv;
    static /* synthetic */ WorldArea hs;
    static /* synthetic */ int bT;
    static /* synthetic */ String hm;
    private static final /* synthetic */ WorldPoint gH;
    public static final /* synthetic */ WorldArea gf;
    public static final /* synthetic */ int[] gc;
    private static final /* synthetic */ WorldPoint gy;
    static final /* synthetic */ int gt;
    public static final /* synthetic */ WorldPoint gk;
    private static final /* synthetic */ WorldPoint gw;
    private static /* synthetic */ String[] lIIIIIlIl;
    public static final /* synthetic */ int[] gd;
    static /* synthetic */ WorldPoint hr;
    private static final /* synthetic */ WorldPoint gL;
    private static final /* synthetic */ WorldPoint gM;
    private static final /* synthetic */ WorldPoint gP;
    private static final /* synthetic */ WorldPoint gJ;

    private static boolean llIlllIIllI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:328:0x1294, code lost:
        if (llIlllIIlII(net.unethicalite.api.entities.TileObjects.getNearest(r0)) != false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x156d, code lost:
        if (llIlllIIIII(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[1]) != false) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0256, code lost:
        if (llIlllIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[11]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0299, code lost:
        if (llIlllIIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[11]) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x27e6, code lost:
        if (llIlllIIIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[11]) != false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x2835, code lost:
        if (llIlllIIIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[11]) != false) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02dc, code lost:
        if (llIlllIIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[11]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02df, code lost:
        af();
        java.lang.System.out.println(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIIlIl[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[17]]);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.bt = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02fa, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x2b42, code lost:
        if (llIlllIlIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[7]) != false) goto L697;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x2b91, code lost:
        if (llIlllIlIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[7]) != false) goto L701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x033c, code lost:
        if (llIlllIIIll(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[1]) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x2ec3, code lost:
        if (llIlllIlIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[6]) != false) goto L750;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x2f12, code lost:
        if (llIlllIlIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[6]) != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0380, code lost:
        if (llIlllIIIll(net.unethicalite.api.items.Inventory.getCount(r0), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[1]) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x3246, code lost:
        if (llIlllIlIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[5]) != false) goto L803;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x3294, code lost:
        if (llIlllIlIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[5]) != false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x35c7, code lost:
        if (llIlllIlIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[3]) != false) goto L865;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x3615, code lost:
        if (llIlllIlIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[3]) != false) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x39ab, code lost:
        if (llIlllIlIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[1]) != false) goto L927;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x39f9, code lost:
        if (llIlllIlIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[1]) != false) goto L931;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v131, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2355, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2375, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2418, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bG() {
        if (llIllIlllll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[0]];
            C0001b.a(bv);
            if (llIlllIIIII(bv.size(), lIIIIlIIl[1])) {
                System.out.println(lIIIIIlIl[lIIIIlIIl[1]]);
                bt = lIIIIlIIl[0];
            }
        }
        if (llIlllIIIIl(bt ? 1 : 0)) {
            if (llIllIlllll(Inventory.contains(C0005f.aV) ? 1 : 0) && llIlllIIIII(Movement.getRunEnergy(), lIIIIlIIl[2]) && llIlllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                Inventory.getFirst(C0005f.aV).interact(lIIIIIlIl[lIIIIlIIl[3]]);
                Time.sleepTicks(lIIIIlIIl[1]);
                "".length();
            }
            if (!llIlllIIIlI(Skills.getBoostedLevel(Skill.HITPOINTS), lIIIIlIIl[4]) || llIllIlllll(Inventory.isFull() ? 1 : 0)) {
                String[] strArr = new String[lIIIIlIIl[1]];
                strArr[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[5]];
                if (llIllIlllll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIIIlIIl[1]];
                    strArr2[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[6]];
                    Inventory.getFirst(strArr2).interact(lIIIIIlIl[lIIIIlIIl[7]]);
                    Time.sleepTicks(lIIIIlIIl[1]);
                    "".length();
                }
            }
            if (llIlllIIIII(C0004e.j(lIIIIlIIl[8]), lIIIIlIIl[9])) {
                G.bN();
            }
            if (llIlllIIIIl(C0004e.j(lIIIIlIIl[10])) && llIlllIIIll(C0004e.j(lIIIIlIIl[8]), lIIIIlIIl[9])) {
                if (llIlllIIIIl(bH() ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (llIlllIIlII(nearest) && llIlllIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[11]];
                        C0000a.a(nearest);
                    }
                    if (llIlllIIlII(nearest) && llIllIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIlllIIIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[9]];
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIIIlIIl[12]);
                            "".length();
                        }
                        if (llIllIlllll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[13]];
                            if (llIlllIIlIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIIIlIIl[5]);
                                "".length();
                            }
                            if (llIlllIIlIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIIIlIIl[3]);
                                "".length();
                            }
                            int[] iArr = new int[lIIIIlIIl[1]];
                            iArr[lIIIIlIIl[0]] = lIIIIlIIl[14];
                            if (llIllIlllll(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIIIlIIl[1]];
                                iArr2[lIIIIlIIl[0]] = lIIIIlIIl[14];
                            }
                            int[] iArr3 = new int[lIIIIlIIl[1]];
                            iArr3[lIIIIlIIl[0]] = lIIIIlIIl[15];
                            if (llIllIlllll(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIIIlIIl[1]];
                                iArr4[lIIIIlIIl[0]] = lIIIIlIIl[15];
                            }
                            int[] iArr5 = new int[lIIIIlIIl[1]];
                            iArr5[lIIIIlIIl[0]] = lIIIIlIIl[16];
                            if (llIllIlllll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIIlIIl[1]];
                                iArr6[lIIIIlIIl[0]] = lIIIIlIIl[16];
                            }
                            int[] iArr7 = new int[lIIIIlIIl[1]];
                            iArr7[lIIIIlIIl[0]] = lIIIIlIIl[18];
                            if (llIlllIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                String[] strArr3 = new String[lIIIIlIIl[1]];
                                strArr3[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[19]];
                            }
                            int[] iArr8 = new int[lIIIIlIIl[1]];
                            iArr8[lIIIIlIIl[0]] = lIIIIlIIl[20];
                            if (llIlllIIIIl(Bank.contains(iArr8) ? 1 : 0)) {
                                String[] strArr4 = new String[lIIIIlIIl[1]];
                                strArr4[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[21]];
                            }
                            if ((!llIlllIIIIl(Bank.contains(C0005f.aO) ? 1 : 0) || llIlllIIIll(Inventory.getCount(C0005f.aO), lIIIIlIIl[1])) && ((!llIlllIIIIl(Bank.contains(C0005f.aN) ? 1 : 0) || llIlllIIIll(Inventory.getCount(C0005f.aN), lIIIIlIIl[1])) && (!llIlllIIIIl(Bank.contains(C0005f.aV) ? 1 : 0) || !llIlllIIIII(Inventory.getCount(C0005f.aV), lIIIIlIIl[1])))) {
                                String[] strArr5 = new String[lIIIIlIIl[1]];
                                strArr5[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[23]];
                                if (llIlllIIIIl(Inventory.contains(strArr5) ? 1 : 0)) {
                                    C0000a.a(lIIIIlIIl[18], lIIIIlIIl[1]);
                                }
                                if (llIlllIIIIl(Inventory.contains(C0005f.aO) ? 1 : 0)) {
                                    C0000a.a(C0005f.aO, lIIIIlIIl[1]);
                                }
                                if (llIlllIIIIl(Inventory.contains(C0005f.aN) ? 1 : 0)) {
                                    C0000a.a(lIIIIlIIl[24], lIIIIlIIl[1]);
                                }
                                if (llIlllIIIIl(Inventory.contains(C0005f.aV) ? 1 : 0)) {
                                    C0000a.a(C0005f.aV, lIIIIlIIl[6]);
                                }
                                String[] strArr6 = new String[lIIIIlIIl[1]];
                                strArr6[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[4]];
                                if (llIlllIIIIl(Inventory.contains(strArr6) ? 1 : 0)) {
                                    C0000a.a(lIIIIlIIl[20], lIIIIlIIl[25]);
                                }
                            }
                            af();
                            System.out.println(lIIIIIlIl[lIIIIlIIl[22]]);
                            bt = lIIIIlIIl[1];
                            return;
                        }
                    }
                }
                if (llIllIlllll(bH() ? 1 : 0)) {
                    if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gA), lIIIIlIIl[7])) {
                        if (llIllIlllll(Bank.isOpen() ? 1 : 0)) {
                            Bank.close();
                            Time.sleepTicks(lIIIIlIIl[5]);
                            "".length();
                        }
                        if (llIlllIIIIl(Bank.isOpen() ? 1 : 0)) {
                            if (llIlllIIIII(bT, lIIIIlIIl[1])) {
                                if (llIllIlllll(Inventory.contains(C0005f.aV) ? 1 : 0) && llIlllIIIII(Movement.getRunEnergy(), lIIIIlIIl[2])) {
                                    Inventory.getFirst(C0005f.aV).interact(lIIIIIlIl[lIIIIlIIl[26]]);
                                    Time.sleepTicks(lIIIIlIIl[1]);
                                    "".length();
                                }
                                C0004e.v();
                                bT += lIIIIlIIl[1];
                            }
                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[27]];
                            Movement.walkTo(gA);
                            "".length();
                            Time.sleepTicks(lIIIIlIIl[1]);
                            "".length();
                        }
                    }
                    if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gA), lIIIIlIIl[7])) {
                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[28]];
                        C0006g.a(ho, hl);
                    }
                }
            }
            if (llIlllIIlll(C0004e.j(lIIIIlIIl[10]), lIIIIlIIl[1])) {
                if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gD), lIIIIlIIl[5])) {
                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[25]];
                    Movement.walkTo(gD);
                    "".length();
                }
                if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gD), lIIIIlIIl[5])) {
                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[29]];
                    C0006g.a(hn, hl);
                }
            }
            if (llIlllIIlll(C0004e.j(lIIIIlIIl[10]), lIIIIlIIl[3])) {
                if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gF), lIIIIlIIl[6])) {
                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[30]];
                    Movement.walkTo(gF);
                    "".length();
                    Time.sleepTicks(lIIIIlIIl[1]);
                    "".length();
                }
                if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gF), lIIIIlIIl[6])) {
                    int[] iArr9 = new int[lIIIIlIIl[1]];
                    iArr9[lIIIIlIIl[0]] = lIIIIlIIl[31];
                    TileObject nearest2 = TileObjects.getNearest(iArr9);
                    String[] strArr7 = new String[lIIIIlIIl[1]];
                    strArr7[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[32]];
                    if (llIlllIIIIl(Inventory.contains(strArr7) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[33]];
                        if (llIlllIIlII(nearest2)) {
                            nearest2.interact(lIIIIIlIl[lIIIIlIIl[34]]);
                            Time.sleepTicks(lIIIIlIIl[3]);
                            "".length();
                        }
                    }
                }
            }
            if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gF), lIIIIlIIl[19])) {
                String[] strArr8 = new String[lIIIIlIIl[1]];
                strArr8[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[35]];
                if (llIllIlllll(Inventory.contains(strArr8) ? 1 : 0) && llIlllIIlll(Players.getLocal().getAnimation(), lIIIIlIIl[36]) && llIlllIlIII(C0004e.j(lIIIIlIIl[10]), lIIIIlIIl[5])) {
                    String[] strArr9 = new String[lIIIIlIIl[1]];
                    strArr9[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[37]];
                    Item first = Inventory.getFirst(strArr9);
                    if (llIlllIIlII(first)) {
                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[38]];
                        first.interact(lIIIIIlIl[lIIIIlIIl[39]]);
                        Time.sleepTicks(lIIIIlIIl[3]);
                        "".length();
                    }
                }
            }
            if (llIlllIIlll(C0004e.j(lIIIIlIIl[10]), lIIIIlIIl[5])) {
                if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gF), lIIIIlIIl[19])) {
                    int[] iArr10 = new int[lIIIIlIIl[1]];
                    iArr10[lIIIIlIIl[0]] = lIIIIlIIl[40];
                    if (llIlllIIIII(Inventory.getCount(iArr10), lIIIIlIIl[1])) {
                        int[] iArr11 = new int[lIIIIlIIl[1]];
                        iArr11[lIIIIlIIl[0]] = lIIIIlIIl[41];
                        if (llIlllIIIII(Inventory.getCount(iArr11), lIIIIlIIl[1])) {
                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[42]];
                            if (llIllIlllll(Inventory.contains(item -> {
                                return item.getName().contains(lIIIIIlIl[lIIIIlIIl[304]]);
                            }) ? 1 : 0) && llIlllIIIIl(Equipment.contains(item2 -> {
                                return item2.getName().contains(lIIIIIlIl[lIIIIlIIl[41]]);
                            }) ? 1 : 0)) {
                                Inventory.getFirst(item3 -> {
                                    return item3.getName().contains(lIIIIIlIl[lIIIIlIIl[40]]);
                                }).interact(lIIIIIlIl[lIIIIlIIl[43]]);
                            }
                            if (llIllIlllll(Equipment.contains(item4 -> {
                                return item4.getName().contains(lIIIIIlIl[lIIIIlIIl[332]]);
                            }) ? 1 : 0) && llIlllIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                                Equipment.getFirst(item5 -> {
                                    return item5.getName().contains(lIIIIIlIl[lIIIIlIIl[331]]);
                                }).interact(lIIIIIlIl[lIIIIlIIl[44]]);
                                Time.sleepTicks(lIIIIlIIl[6]);
                                "".length();
                            }
                        }
                    }
                }
                if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gG), lIIIIlIIl[5])) {
                    int[] iArr12 = new int[lIIIIlIIl[1]];
                    iArr12[lIIIIlIIl[0]] = lIIIIlIIl[40];
                    if (llIlllIIIII(Inventory.getCount(iArr12), lIIIIlIIl[1])) {
                        int[] iArr13 = new int[lIIIIlIIl[1]];
                        iArr13[lIIIIlIIl[0]] = lIIIIlIIl[41];
                        if (llIlllIIIII(Inventory.getCount(iArr13), lIIIIlIIl[1]) && llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gH), lIIIIlIIl[44]) && llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gF), lIIIIlIIl[19])) {
                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[45]];
                            if (llIlllIIIIl(hq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                Movement.walkTo(hr);
                                "".length();
                            }
                            if (llIllIlllll(hq.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                Walker.stepAlong(List.of((Object[]) gv));
                                "".length();
                                Time.sleepTicks(lIIIIlIIl[1]);
                                "".length();
                            }
                        }
                    }
                }
                if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gG), lIIIIlIIl[5])) {
                    String[] strArr10 = new String[lIIIIlIIl[1]];
                    strArr10[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[46]];
                    if (llIlllIIlII(TileObjects.getNearest(strArr10))) {
                        int[] iArr14 = new int[lIIIIlIIl[1]];
                        iArr14[lIIIIlIIl[0]] = lIIIIlIIl[40];
                        if (llIlllIIIII(Inventory.getCount(iArr14), lIIIIlIIl[1])) {
                            int[] iArr15 = new int[lIIIIlIIl[1]];
                            iArr15[lIIIIlIIl[0]] = lIIIIlIIl[41];
                            if (llIlllIIIII(Inventory.getCount(iArr15), lIIIIlIIl[1])) {
                                int[] iArr16 = new int[lIIIIlIIl[1]];
                                iArr16[lIIIIlIIl[0]] = lIIIIlIIl[47];
                                TileObject nearest3 = TileObjects.getNearest(iArr16);
                                if (llIlllIIlII(nearest3)) {
                                    nearest3.interact(lIIIIIlIl[lIIIIlIIl[48]]);
                                    Time.sleepTicks(lIIIIlIIl[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gH), lIIIIlIIl[3])) {
                    int[] iArr17 = new int[lIIIIlIIl[1]];
                    iArr17[lIIIIlIIl[0]] = lIIIIlIIl[49];
                    if (llIlllIIlII(TileObjects.getNearest(iArr17))) {
                        int[] iArr18 = new int[lIIIIlIIl[1]];
                        iArr18[lIIIIlIIl[0]] = lIIIIlIIl[40];
                        if (llIlllIIIII(Inventory.getCount(iArr18), lIIIIlIIl[1])) {
                            int[] iArr19 = new int[lIIIIlIIl[1]];
                            iArr19[lIIIIlIIl[0]] = lIIIIlIIl[41];
                            if (llIlllIIIII(Inventory.getCount(iArr19), lIIIIlIIl[1])) {
                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[50]];
                                Movement.walkTo(gH);
                                "".length();
                            }
                        }
                    }
                }
                if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gH), lIIIIlIIl[5])) {
                    int[] iArr20 = new int[lIIIIlIIl[1]];
                    iArr20[lIIIIlIIl[0]] = lIIIIlIIl[49];
                    if (llIlllIIlII(TileObjects.getNearest(iArr20))) {
                        int[] iArr21 = new int[lIIIIlIIl[1]];
                        iArr21[lIIIIlIIl[0]] = lIIIIlIIl[40];
                        if (llIlllIIIII(Inventory.getCount(iArr21), lIIIIlIIl[1])) {
                            int[] iArr22 = new int[lIIIIlIIl[1]];
                            iArr22[lIIIIlIIl[0]] = lIIIIlIIl[41];
                            if (llIlllIIIII(Inventory.getCount(iArr22), lIIIIlIIl[1])) {
                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[51]];
                                int[] iArr23 = new int[lIIIIlIIl[1]];
                                iArr23[lIIIIlIIl[0]] = lIIIIlIIl[49];
                                TileObject nearest4 = TileObjects.getNearest(iArr23);
                                if (llIlllIIlII(nearest4)) {
                                    nearest4.interact(lIIIIIlIl[lIIIIlIIl[52]]);
                                    Time.sleepTicks(lIIIIlIIl[3]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gI), lIIIIlIIl[3])) {
                    int[] iArr24 = new int[lIIIIlIIl[1]];
                    iArr24[lIIIIlIIl[0]] = lIIIIlIIl[40];
                    if (llIlllIIlIl(Inventory.getCount(iArr24)) && llIlllIIIII(Players.getLocal().getWorldLocation().getY(), lIIIIlIIl[53])) {
                        int[] iArr25 = new int[lIIIIlIIl[1]];
                        iArr25[lIIIIlIIl[0]] = lIIIIlIIl[40];
                        if (llIlllIIlIl(Inventory.getCount(iArr25))) {
                            int[] iArr26 = new int[lIIIIlIIl[1]];
                            iArr26[lIIIIlIIl[0]] = lIIIIlIIl[41];
                            if (llIlllIIIII(Inventory.getCount(iArr26), lIIIIlIIl[1])) {
                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[54]];
                                Movement.walkTo(gI);
                                "".length();
                            }
                        }
                    }
                }
                if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gI), lIIIIlIIl[3])) {
                    int[] iArr27 = new int[lIIIIlIIl[1]];
                    iArr27[lIIIIlIIl[0]] = lIIIIlIIl[40];
                    if (llIlllIIlIl(Inventory.getCount(iArr27)) && llIlllIIIII(Players.getLocal().getWorldLocation().getY(), lIIIIlIIl[53])) {
                        int[] iArr28 = new int[lIIIIlIIl[1]];
                        iArr28[lIIIIlIIl[0]] = lIIIIlIIl[40];
                        if (llIlllIIlIl(Inventory.getCount(iArr28))) {
                            int[] iArr29 = new int[lIIIIlIIl[1]];
                            iArr29[lIIIIlIIl[0]] = lIIIIlIIl[41];
                            if (llIlllIIIII(Inventory.getCount(iArr29), lIIIIlIIl[1])) {
                                int[] iArr30 = new int[lIIIIlIIl[1]];
                                iArr30[lIIIIlIIl[0]] = lIIIIlIIl[55];
                                TileObject nearest5 = TileObjects.getNearest(iArr30);
                                if (llIlllIIlII(nearest5)) {
                                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[56]];
                                    int[] iArr31 = new int[lIIIIlIIl[1]];
                                    iArr31[lIIIIlIIl[0]] = lIIIIlIIl[40];
                                    Item first2 = Inventory.getFirst(iArr31);
                                    if (llIlllIIlII(first2)) {
                                        first2.useOn(nearest5);
                                        Time.sleep(1L);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                if (llIlllIIIll(Players.getLocal().getWorldLocation().getY(), lIIIIlIIl[53])) {
                    int[] iArr32 = new int[lIIIIlIIl[1]];
                    iArr32[lIIIIlIIl[0]] = lIIIIlIIl[41];
                    if (llIlllIIIII(Inventory.getCount(iArr32), lIIIIlIIl[1])) {
                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[57]];
                        C0006g.a(hm, hl);
                    }
                }
                int[] iArr33 = new int[lIIIIlIIl[1]];
                iArr33[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIlllIIlIl(Inventory.getCount(iArr33)) && llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gK), lIIIIlIIl[6])) {
                    String[] strArr11 = new String[lIIIIlIIl[1]];
                    strArr11[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[58]];
                    if (llIlllIIIII(Inventory.getCount(strArr11), lIIIIlIIl[1])) {
                        String[] strArr12 = new String[lIIIIlIIl[1]];
                        strArr12[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[59]];
                        if (llIlllIIIII(Inventory.getCount(strArr12), lIIIIlIIl[1])) {
                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[60]];
                            if (llIlllIIIIl(hs.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (llIllIlllll(Inventory.contains(item6 -> {
                                    return item6.getName().contains(lIIIIIlIl[lIIIIlIIl[330]]);
                                }) ? 1 : 0) && llIlllIIIIl(Equipment.contains(item7 -> {
                                    return item7.getName().contains(lIIIIIlIl[lIIIIlIIl[329]]);
                                }) ? 1 : 0)) {
                                    Inventory.getFirst(item8 -> {
                                        return item8.getName().contains(lIIIIIlIl[lIIIIlIIl[328]]);
                                    }).interact(lIIIIIlIl[lIIIIlIIl[61]]);
                                    Time.sleepTicks(lIIIIlIIl[1]);
                                    "".length();
                                }
                                Movement.walkTo(gA);
                                "".length();
                                Time.sleepTicks(lIIIIlIIl[1]);
                                "".length();
                            }
                            if (llIllIlllll(hs.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                Movement.walkTo(gK);
                                "".length();
                                Time.sleepTicks(lIIIIlIIl[1]);
                                "".length();
                            }
                        }
                    }
                }
                int[] iArr34 = new int[lIIIIlIIl[1]];
                iArr34[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIlllIIlIl(Inventory.getCount(iArr34)) && llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gK), lIIIIlIIl[6])) {
                    String[] strArr13 = new String[lIIIIlIIl[1]];
                    strArr13[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[62]];
                    if (llIlllIIIII(Inventory.getCount(strArr13), lIIIIlIIl[1])) {
                        String[] strArr14 = new String[lIIIIlIIl[1]];
                        strArr14[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[63]];
                        if (llIlllIIIII(Inventory.getCount(strArr14), lIIIIlIIl[1])) {
                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[64]];
                            int[] iArr35 = new int[lIIIIlIIl[1]];
                            iArr35[lIIIIlIIl[0]] = lIIIIlIIl[41];
                            Item first3 = Inventory.getFirst(iArr35);
                            if (llIlllIIlII(first3)) {
                                int[] iArr36 = new int[lIIIIlIIl[1]];
                                iArr36[lIIIIlIIl[0]] = lIIIIlIIl[65];
                                TileObject nearest6 = TileObjects.getNearest(iArr36);
                                if (llIlllIIlII(nearest6)) {
                                    first3.useOn(nearest6);
                                    Time.sleepUntil(() -> {
                                        String[] strArr15 = new String[lIIIIlIIl[1]];
                                        strArr15[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[327]];
                                        if (llIlllIIlII(TileObjects.getNearest(strArr15))) {
                                            ?? r0 = lIIIIlIIl[1];
                                            "".length();
                                            return " ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIIlIIl[0];
                                    }, lIIIIlIIl[66]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                int[] iArr37 = new int[lIIIIlIIl[1]];
                iArr37[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIlllIIlIl(Inventory.getCount(iArr37))) {
                    String[] strArr15 = new String[lIIIIlIIl[1]];
                    strArr15[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[67]];
                    if (llIlllIIlII(TileObjects.getNearest(strArr15))) {
                        String[] strArr16 = new String[lIIIIlIIl[1]];
                        strArr16[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[68]];
                        if (llIlllIIIII(Inventory.getCount(strArr16), lIIIIlIIl[1])) {
                            String[] strArr17 = new String[lIIIIlIIl[1]];
                            strArr17[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[69]];
                            if (llIlllIIIII(Inventory.getCount(strArr17), lIIIIlIIl[1])) {
                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[2]];
                                if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gL), lIIIIlIIl[6])) {
                                    Movement.walkTo(gL);
                                    "".length();
                                }
                                if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gL), lIIIIlIIl[6])) {
                                    int[] iArr38 = new int[lIIIIlIIl[1]];
                                    iArr38[lIIIIlIIl[0]] = lIIIIlIIl[70];
                                    TileObject nearest7 = TileObjects.getNearest(iArr38);
                                    if (llIlllIIlII(nearest7)) {
                                        nearest7.interact(lIIIIIlIl[lIIIIlIIl[71]]);
                                        Time.sleepTicks(lIIIIlIIl[1]);
                                        "".length();
                                    }
                                    int[] iArr39 = new int[lIIIIlIIl[1]];
                                    iArr39[lIIIIlIIl[0]] = lIIIIlIIl[72];
                                    TileObject nearest8 = TileObjects.getNearest(iArr39);
                                    if (llIlllIIlII(nearest8)) {
                                        nearest8.interact(lIIIIIlIl[lIIIIlIIl[73]]);
                                        Time.sleepTicks(lIIIIlIIl[1]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (llIlllIIlll(C0004e.j(lIIIIlIIl[10]), lIIIIlIIl[6])) {
                cl = lIIIIlIIl[0];
                int[] iArr40 = new int[lIIIIlIIl[1]];
                iArr40[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIlllIIlIl(Inventory.getCount(iArr40))) {
                    String[] strArr18 = new String[lIIIIlIIl[1]];
                    strArr18[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[74]];
                    if (llIlllIIlII(TileObjects.getNearest(strArr18))) {
                        String[] strArr19 = new String[lIIIIlIIl[1]];
                        strArr19[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[75]];
                        if (llIlllIIIII(Inventory.getCount(strArr19), lIIIIlIIl[1])) {
                            String[] strArr20 = new String[lIIIIlIIl[1]];
                            strArr20[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[76]];
                            if (llIlllIIIII(Inventory.getCount(strArr20), lIIIIlIIl[1])) {
                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[77]];
                                if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gL), lIIIIlIIl[6])) {
                                    Movement.walkTo(gL);
                                    "".length();
                                }
                                if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gL), lIIIIlIIl[6])) {
                                    int[] iArr41 = new int[lIIIIlIIl[1]];
                                    iArr41[lIIIIlIIl[0]] = lIIIIlIIl[70];
                                    TileObject nearest9 = TileObjects.getNearest(iArr41);
                                    if (llIlllIIlII(nearest9)) {
                                        nearest9.interact(lIIIIIlIl[lIIIIlIIl[78]]);
                                        Time.sleepTicks(lIIIIlIIl[1]);
                                        "".length();
                                    }
                                    int[] iArr42 = new int[lIIIIlIIl[1]];
                                    iArr42[lIIIIlIIl[0]] = lIIIIlIIl[72];
                                    TileObject nearest10 = TileObjects.getNearest(iArr42);
                                    if (llIlllIIlII(nearest10)) {
                                        nearest10.interact(lIIIIIlIl[lIIIIlIIl[79]]);
                                        Time.sleepTicks(lIIIIlIIl[1]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr43 = new int[lIIIIlIIl[1]];
                iArr43[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIlllIIlIl(Inventory.getCount(iArr43))) {
                    String[] strArr21 = new String[lIIIIlIIl[1]];
                    strArr21[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[80]];
                    if (llIlllIlIIl(TileObjects.getNearest(strArr21))) {
                        int[] iArr44 = new int[lIIIIlIIl[1]];
                        iArr44[lIIIIlIIl[0]] = lIIIIlIIl[81];
                    }
                    String[] strArr22 = new String[lIIIIlIIl[1]];
                    strArr22[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[82]];
                    if (llIlllIIlIl(Inventory.getCount(strArr22))) {
                        String[] strArr23 = new String[lIIIIlIIl[1]];
                        strArr23[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[83]];
                        if (llIlllIIIII(Inventory.getCount(strArr23), lIIIIlIIl[1])) {
                            if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIIlIIl[5])) {
                                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[84]];
                                Movement.walkTo(gM);
                                "".length();
                                Time.sleepTicks(lIIIIlIIl[1]);
                                "".length();
                            }
                            if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIIlIIl[5])) {
                                int[] iArr45 = new int[lIIIIlIIl[1]];
                                iArr45[lIIIIlIIl[0]] = lIIIIlIIl[81];
                                TileObject nearest11 = TileObjects.getNearest(iArr45);
                                if (llIlllIIlII(nearest11)) {
                                    nearest11.interact(lIIIIIlIl[lIIIIlIIl[85]]);
                                    Time.sleepTicks(lIIIIlIIl[1]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
                int[] iArr46 = new int[lIIIIlIIl[1]];
                iArr46[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIlllIIlIl(Inventory.getCount(iArr46))) {
                    String[] strArr24 = new String[lIIIIlIIl[1]];
                    strArr24[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[86]];
                    if (llIlllIIIII(Inventory.getCount(strArr24), lIIIIlIIl[1])) {
                        String[] strArr25 = new String[lIIIIlIIl[1]];
                        strArr25[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[10]];
                        if (llIlllIIIII(Inventory.getCount(strArr25), lIIIIlIIl[1])) {
                            String[] strArr26 = new String[lIIIIlIIl[1]];
                            strArr26[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[87]];
                            if (llIlllIIIII(Inventory.getCount(strArr26), lIIIIlIIl[1]) && llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIIlIIl[6])) {
                                String[] strArr27 = new String[lIIIIlIIl[1]];
                                strArr27[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[88]];
                                if (llIlllIIlIl(Inventory.getCount(strArr27))) {
                                    String[] strArr28 = new String[lIIIIlIIl[1]];
                                    strArr28[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[89]];
                                    if (llIlllIIlIl(Inventory.getCount(strArr28))) {
                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[90]];
                                        if (llIlllIIIIl(Equipment.contains(C0005f.aO) ? 1 : 0) && llIllIlllll(Inventory.contains(C0005f.aO) ? 1 : 0)) {
                                            Inventory.getFirst(C0005f.aO).interact(lIIIIIlIl[lIIIIlIIl[91]]);
                                            Time.sleepTicks(lIIIIlIIl[1]);
                                            "".length();
                                        }
                                        if (llIllIlllll(Equipment.contains(C0005f.aO) ? 1 : 0)) {
                                            Movement.walkTo(gJ);
                                            "".length();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gJ), lIIIIlIIl[30])) {
                    int[] iArr47 = new int[lIIIIlIIl[1]];
                    iArr47[lIIIIlIIl[0]] = lIIIIlIIl[41];
                    if (llIlllIIlIl(Inventory.getCount(iArr47))) {
                        String[] strArr29 = new String[lIIIIlIIl[1]];
                        strArr29[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[92]];
                        if (llIlllIIIll(Inventory.getCount(strArr29), lIIIIlIIl[1])) {
                            String[] strArr30 = new String[lIIIIlIIl[1]];
                            strArr30[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[93]];
                            if (llIlllIIIll(Inventory.getCount(strArr30), lIIIIlIIl[1])) {
                                String[] strArr31 = new String[lIIIIlIIl[1]];
                                strArr31[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[94]];
                            }
                        }
                        String[] strArr32 = new String[lIIIIlIIl[1]];
                        strArr32[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[95]];
                        if (llIlllIIlIl(Inventory.getCount(strArr32))) {
                            String[] strArr33 = new String[lIIIIlIIl[1]];
                            strArr33[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[96]];
                            if (llIlllIIlIl(Inventory.getCount(strArr33))) {
                                if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gJ), lIIIIlIIl[6])) {
                                    Movement.walkTo(gJ);
                                    "".length();
                                }
                                if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gJ), lIIIIlIIl[6])) {
                                    if (llIlllIIIIl(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[97]];
                                        C0000a.a();
                                    }
                                    if (llIllIlllll(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[98]];
                                        String[] strArr34 = new String[lIIIIlIIl[1]];
                                        strArr34[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[99]];
                                        Bank.depositAll(strArr34);
                                        if (llIlllIIIlI(Inventory.getAll().size(), lIIIIlIIl[34])) {
                                            Bank.deposit(lIIIIIlIl[lIIIIlIIl[100]], lIIIIlIIl[7]);
                                        }
                                        String[] strArr35 = new String[lIIIIlIIl[1]];
                                        strArr35[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[101]];
                                        if (llIlllIIIIl(Inventory.contains(strArr35) ? 1 : 0)) {
                                            C0000a.a(lIIIIlIIl[15], lIIIIlIIl[11]);
                                        }
                                        String[] strArr36 = new String[lIIIIlIIl[1]];
                                        strArr36[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[102]];
                                        if (llIllIlllll(Inventory.contains(strArr36) ? 1 : 0)) {
                                            String[] strArr37 = new String[lIIIIlIIl[1]];
                                            strArr37[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[103]];
                                            if (llIlllIIIII(Inventory.getFirst(strArr37).getQuantity(), lIIIIlIIl[11])) {
                                                String str = lIIIIIlIl[lIIIIlIIl[104]];
                                                int i = lIIIIlIIl[11];
                                                String[] strArr38 = new String[lIIIIlIIl[1]];
                                                strArr38[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[105]];
                                                Bank.withdraw(str, i - Inventory.getFirst(strArr38).getQuantity(), Bank.WithdrawMode.ITEM);
                                                Time.sleepTicks(lIIIIlIIl[9]);
                                                "".length();
                                            }
                                        }
                                        String[] strArr39 = new String[lIIIIlIIl[1]];
                                        strArr39[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[106]];
                                        if (llIlllIIIIl(Inventory.contains(strArr39) ? 1 : 0)) {
                                            C0000a.a(lIIIIlIIl[16], lIIIIlIIl[11]);
                                        }
                                        String[] strArr40 = new String[lIIIIlIIl[1]];
                                        strArr40[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[107]];
                                        if (llIllIlllll(Inventory.contains(strArr40) ? 1 : 0)) {
                                            String[] strArr41 = new String[lIIIIlIIl[1]];
                                            strArr41[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[108]];
                                            if (llIlllIIIII(Inventory.getFirst(strArr41).getQuantity(), lIIIIlIIl[11])) {
                                                String str2 = lIIIIIlIl[lIIIIlIIl[109]];
                                                int i2 = lIIIIlIIl[11];
                                                String[] strArr42 = new String[lIIIIlIIl[1]];
                                                strArr42[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[110]];
                                                Bank.withdraw(str2, i2 - Inventory.getFirst(strArr42).getQuantity(), Bank.WithdrawMode.ITEM);
                                                Time.sleepTicks(lIIIIlIIl[9]);
                                                "".length();
                                            }
                                        }
                                        String[] strArr43 = new String[lIIIIlIIl[1]];
                                        strArr43[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[111]];
                                        if (llIlllIIIIl(Inventory.contains(strArr43) ? 1 : 0)) {
                                            C0000a.a(lIIIIlIIl[14], lIIIIlIIl[11]);
                                        }
                                        String[] strArr44 = new String[lIIIIlIIl[1]];
                                        strArr44[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[112]];
                                        if (llIllIlllll(Inventory.contains(strArr44) ? 1 : 0)) {
                                            String[] strArr45 = new String[lIIIIlIIl[1]];
                                            strArr45[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[113]];
                                            if (llIlllIIIII(Inventory.getFirst(strArr45).getQuantity(), lIIIIlIIl[11])) {
                                                String str3 = lIIIIIlIl[lIIIIlIIl[114]];
                                                int i3 = lIIIIlIIl[11];
                                                String[] strArr46 = new String[lIIIIlIIl[1]];
                                                strArr46[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[115]];
                                                Bank.withdraw(str3, i3 - Inventory.getFirst(strArr46).getQuantity(), Bank.WithdrawMode.ITEM);
                                                Time.sleepTicks(lIIIIlIIl[9]);
                                                "".length();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr48 = new int[lIIIIlIIl[1]];
                iArr48[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr48) ? 1 : 0)) {
                    String[] strArr47 = new String[lIIIIlIIl[1]];
                    strArr47[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[116]];
                    if (llIllIlllll(Inventory.contains(strArr47) ? 1 : 0)) {
                        String[] strArr48 = new String[lIIIIlIIl[1]];
                        strArr48[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[117]];
                        if (llIlllIIIll(Inventory.getFirst(strArr48).getQuantity(), lIIIIlIIl[11])) {
                            String[] strArr49 = new String[lIIIIlIIl[1]];
                            strArr49[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[118]];
                            if (llIllIlllll(Inventory.contains(strArr49) ? 1 : 0)) {
                                String[] strArr50 = new String[lIIIIlIIl[1]];
                                strArr50[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[119]];
                                if (llIlllIIIll(Inventory.getFirst(strArr50).getQuantity(), lIIIIlIIl[11])) {
                                    String[] strArr51 = new String[lIIIIlIIl[1]];
                                    strArr51[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[120]];
                                    if (llIllIlllll(Inventory.contains(strArr51) ? 1 : 0)) {
                                        String[] strArr52 = new String[lIIIIlIIl[1]];
                                        strArr52[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[121]];
                                        if (llIlllIIIll(Inventory.getFirst(strArr52).getQuantity(), lIIIIlIIl[11])) {
                                            String[] strArr53 = new String[lIIIIlIIl[1]];
                                            strArr53[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[122]];
                                            if (llIllIlllll(Inventory.contains(strArr53) ? 1 : 0)) {
                                                String[] strArr54 = new String[lIIIIlIIl[1]];
                                                strArr54[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[123]];
                                                if (llIllIlllll(Inventory.contains(strArr54) ? 1 : 0) && llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gO), lIIIIlIIl[1])) {
                                                    if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gD), lIIIIlIIl[6]) && llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gC), lIIIIlIIl[6])) {
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[124]];
                                                        if (llIllIlllll(Dialog.isOpen() ? 1 : 0)) {
                                                            Dialog.close();
                                                        }
                                                        Movement.walkTo(gO);
                                                        "".length();
                                                    }
                                                    if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gD), lIIIIlIIl[7]) && llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gC), lIIIIlIIl[6])) {
                                                        String[] strArr55 = new String[lIIIIlIIl[1]];
                                                        strArr55[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[125]];
                                                        Item first4 = Inventory.getFirst(strArr55);
                                                        String[] strArr56 = new String[lIIIIlIIl[1]];
                                                        strArr56[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[126]];
                                                        TileObject nearest12 = TileObjects.getNearest(strArr56);
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[127]];
                                                        if (llIlllIIlII(first4) && llIlllIIlII(nearest12)) {
                                                            first4.useOn(nearest12);
                                                            Time.sleepUntil(() -> {
                                                                if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gC), lIIIIlIIl[6])) {
                                                                    ?? r0 = lIIIIlIIl[1];
                                                                    "".length();
                                                                    return !((true ^ true) ^ (true ^ true)) ? ((((24 + 171) - 165) + 153) ^ (((96 + 32) - 70) + 95)) & (((237 ^ 129) ^ (194 ^ 128)) ^ (-" ".length())) : r0;
                                                                }
                                                                return lIIIIlIIl[0];
                                                            }, lIIIIlIIl[128]);
                                                            "".length();
                                                        }
                                                    }
                                                    if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gC), lIIIIlIIl[6])) {
                                                        String[] strArr57 = new String[lIIIIlIIl[1]];
                                                        strArr57[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[129]];
                                                        Item first5 = Inventory.getFirst(strArr57);
                                                        int[] iArr49 = new int[lIIIIlIIl[1]];
                                                        iArr49[lIIIIlIIl[0]] = lIIIIlIIl[130];
                                                        TileObject nearest13 = TileObjects.getNearest(iArr49);
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[131]];
                                                        if (llIlllIIlII(first5) && llIlllIIlII(nearest13)) {
                                                            first5.useOn(nearest13);
                                                            Time.sleepTicks(lIIIIlIIl[7]);
                                                            "".length();
                                                        }
                                                    }
                                                    if (llIllIlllll(Players.getLocal().getWorldLocation().equals(gN) ? 1 : 0)) {
                                                        String[] strArr58 = new String[lIIIIlIIl[1]];
                                                        strArr58[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[132]];
                                                        TileObject nearest14 = TileObjects.getNearest(strArr58);
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[133]];
                                                        if (llIlllIIlII(nearest14)) {
                                                            nearest14.interact(lIIIIIlIl[lIIIIlIIl[134]]);
                                                            Time.sleepTicks(lIIIIlIIl[3]);
                                                            "".length();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (llIlllIIlll(C0004e.j(lIIIIlIIl[10]), lIIIIlIIl[7])) {
                int[] iArr50 = new int[lIIIIlIIl[1]];
                iArr50[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr50) ? 1 : 0)) {
                    String[] strArr59 = new String[lIIIIlIIl[1]];
                    strArr59[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[135]];
                    if (llIllIlllll(Inventory.contains(strArr59) ? 1 : 0)) {
                        String[] strArr60 = new String[lIIIIlIIl[1]];
                        strArr60[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[136]];
                        if (llIlllIIIll(Inventory.getFirst(strArr60).getQuantity(), lIIIIlIIl[11])) {
                            String[] strArr61 = new String[lIIIIlIIl[1]];
                            strArr61[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[137]];
                            if (llIllIlllll(Inventory.contains(strArr61) ? 1 : 0)) {
                                String[] strArr62 = new String[lIIIIlIIl[1]];
                                strArr62[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[138]];
                                if (llIlllIIIll(Inventory.getFirst(strArr62).getQuantity(), lIIIIlIIl[11])) {
                                    String[] strArr63 = new String[lIIIIlIIl[1]];
                                    strArr63[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[139]];
                                    if (llIllIlllll(Inventory.contains(strArr63) ? 1 : 0)) {
                                        String[] strArr64 = new String[lIIIIlIIl[1]];
                                        strArr64[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[140]];
                                        if (llIlllIIIll(Inventory.getFirst(strArr64).getQuantity(), lIIIIlIIl[11])) {
                                            String[] strArr65 = new String[lIIIIlIIl[1]];
                                            strArr65[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[141]];
                                            if (llIllIlllll(Inventory.contains(strArr65) ? 1 : 0)) {
                                                String[] strArr66 = new String[lIIIIlIIl[1]];
                                                strArr66[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[142]];
                                                if (llIllIlllll(Inventory.contains(strArr66) ? 1 : 0)) {
                                                    int[] iArr51 = new int[lIIIIlIIl[1]];
                                                    iArr51[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                    if (llIlllIIIII(Inventory.getCount(iArr51), lIIIIlIIl[1]) && llIlllIIIIl(Players.getLocal().getWorldLocation().equals(gN) ? 1 : 0)) {
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[144]];
                                                        if (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gO), lIIIIlIIl[3])) {
                                                            Movement.walkTo(gO);
                                                            "".length();
                                                        }
                                                        if (llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gO), lIIIIlIIl[3])) {
                                                            int[] iArr52 = new int[lIIIIlIIl[1]];
                                                            iArr52[lIIIIlIIl[0]] = lIIIIlIIl[145];
                                                            TileObject nearest15 = TileObjects.getNearest(iArr52);
                                                            if (llIlllIIlII(nearest15)) {
                                                                nearest15.interact(lIIIIIlIl[lIIIIlIIl[146]]);
                                                                Time.sleepTicks(lIIIIlIIl[3]);
                                                                "".length();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr53 = new int[lIIIIlIIl[1]];
                iArr53[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr53) ? 1 : 0)) {
                    String[] strArr67 = new String[lIIIIlIIl[1]];
                    strArr67[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[147]];
                    if (llIllIlllll(Inventory.contains(strArr67) ? 1 : 0)) {
                        String[] strArr68 = new String[lIIIIlIIl[1]];
                        strArr68[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[148]];
                        if (llIlllIIIll(Inventory.getFirst(strArr68).getQuantity(), lIIIIlIIl[11])) {
                            String[] strArr69 = new String[lIIIIlIIl[1]];
                            strArr69[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[149]];
                            if (llIllIlllll(Inventory.contains(strArr69) ? 1 : 0)) {
                                String[] strArr70 = new String[lIIIIlIIl[1]];
                                strArr70[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[150]];
                                if (llIlllIIIll(Inventory.getFirst(strArr70).getQuantity(), lIIIIlIIl[11])) {
                                    String[] strArr71 = new String[lIIIIlIIl[1]];
                                    strArr71[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[151]];
                                    if (llIllIlllll(Inventory.contains(strArr71) ? 1 : 0)) {
                                        String[] strArr72 = new String[lIIIIlIIl[1]];
                                        strArr72[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[152]];
                                        if (llIlllIIIll(Inventory.getFirst(strArr72).getQuantity(), lIIIIlIIl[11])) {
                                            String[] strArr73 = new String[lIIIIlIIl[1]];
                                            strArr73[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[153]];
                                            if (llIllIlllll(Inventory.contains(strArr73) ? 1 : 0)) {
                                                String[] strArr74 = new String[lIIIIlIIl[1]];
                                                strArr74[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[154]];
                                                if (llIllIlllll(Inventory.contains(strArr74) ? 1 : 0)) {
                                                    int[] iArr54 = new int[lIIIIlIIl[1]];
                                                    iArr54[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                    if (llIlllIIlIl(Inventory.getCount(iArr54)) && llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gP), lIIIIlIIl[3]) && llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gQ), lIIIIlIIl[5])) {
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[155]];
                                                        Movement.walkTo(gP);
                                                        "".length();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr55 = new int[lIIIIlIIl[1]];
                iArr55[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr55) ? 1 : 0)) {
                    String[] strArr75 = new String[lIIIIlIIl[1]];
                    strArr75[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[156]];
                    if (llIllIlllll(Inventory.contains(strArr75) ? 1 : 0)) {
                        String[] strArr76 = new String[lIIIIlIIl[1]];
                        strArr76[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[157]];
                        if (llIlllIIIll(Inventory.getFirst(strArr76).getQuantity(), lIIIIlIIl[11])) {
                            String[] strArr77 = new String[lIIIIlIIl[1]];
                            strArr77[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[158]];
                            if (llIllIlllll(Inventory.contains(strArr77) ? 1 : 0)) {
                                String[] strArr78 = new String[lIIIIlIIl[1]];
                                strArr78[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[159]];
                                if (llIlllIIIll(Inventory.getFirst(strArr78).getQuantity(), lIIIIlIIl[11])) {
                                    String[] strArr79 = new String[lIIIIlIIl[1]];
                                    strArr79[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[160]];
                                    if (llIllIlllll(Inventory.contains(strArr79) ? 1 : 0)) {
                                        String[] strArr80 = new String[lIIIIlIIl[1]];
                                        strArr80[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[161]];
                                        if (llIlllIIIll(Inventory.getFirst(strArr80).getQuantity(), lIIIIlIIl[11])) {
                                            String[] strArr81 = new String[lIIIIlIIl[1]];
                                            strArr81[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[162]];
                                            if (llIllIlllll(Inventory.contains(strArr81) ? 1 : 0)) {
                                                String[] strArr82 = new String[lIIIIlIIl[1]];
                                                strArr82[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[163]];
                                                if (llIllIlllll(Inventory.contains(strArr82) ? 1 : 0)) {
                                                    int[] iArr56 = new int[lIIIIlIIl[1]];
                                                    iArr56[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                    if (llIlllIIlIl(Inventory.getCount(iArr56)) && llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gP), lIIIIlIIl[5])) {
                                                        int[] iArr57 = new int[lIIIIlIIl[1]];
                                                        iArr57[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                        Item first6 = Inventory.getFirst(iArr57);
                                                        String[] strArr83 = new String[lIIIIlIIl[1]];
                                                        strArr83[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[164]];
                                                        TileObject nearest16 = TileObjects.getNearest(strArr83);
                                                        if (llIlllIIlII(first6) && llIlllIIlII(nearest16)) {
                                                            first6.useOn(nearest16);
                                                            Time.sleepUntil(() -> {
                                                                return Players.getLocal().getWorldLocation().equals(gN);
                                                            }, lIIIIlIIl[165]);
                                                            "".length();
                                                        }
                                                        while (llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gQ), lIIIIlIIl[3])) {
                                                            Movement.walkTo(gQ);
                                                            "".length();
                                                            Time.sleepTicks(lIIIIlIIl[1]);
                                                            "".length();
                                                            "".length();
                                                            if (((" ".length() ^ (149 ^ 153)) & (((((110 + 93) - 61) + 18) ^ (((26 + 65) - 58) + 140)) ^ (-" ".length()))) != 0) {
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr58 = new int[lIIIIlIIl[1]];
                iArr58[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr58) ? 1 : 0)) {
                    String[] strArr84 = new String[lIIIIlIIl[1]];
                    strArr84[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[166]];
                    if (llIllIlllll(Inventory.contains(strArr84) ? 1 : 0)) {
                        String[] strArr85 = new String[lIIIIlIIl[1]];
                        strArr85[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[167]];
                        if (llIlllIIIll(Inventory.getFirst(strArr85).getQuantity(), lIIIIlIIl[11])) {
                            String[] strArr86 = new String[lIIIIlIIl[1]];
                            strArr86[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[168]];
                            if (llIllIlllll(Inventory.contains(strArr86) ? 1 : 0)) {
                                String[] strArr87 = new String[lIIIIlIIl[1]];
                                strArr87[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[169]];
                                if (llIlllIIIll(Inventory.getFirst(strArr87).getQuantity(), lIIIIlIIl[11])) {
                                    String[] strArr88 = new String[lIIIIlIIl[1]];
                                    strArr88[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[170]];
                                    if (llIllIlllll(Inventory.contains(strArr88) ? 1 : 0)) {
                                        String[] strArr89 = new String[lIIIIlIIl[1]];
                                        strArr89[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[171]];
                                        if (llIlllIIIll(Inventory.getFirst(strArr89).getQuantity(), lIIIIlIIl[11])) {
                                            String[] strArr90 = new String[lIIIIlIIl[1]];
                                            strArr90[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[172]];
                                            if (llIllIlllll(Inventory.contains(strArr90) ? 1 : 0)) {
                                                String[] strArr91 = new String[lIIIIlIIl[1]];
                                                strArr91[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[173]];
                                                if (llIllIlllll(Inventory.contains(strArr91) ? 1 : 0)) {
                                                    int[] iArr59 = new int[lIIIIlIIl[1]];
                                                    iArr59[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                    if (llIlllIIlIl(Inventory.getCount(iArr59)) && llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gQ), lIIIIlIIl[5])) {
                                                        int[] iArr60 = new int[lIIIIlIIl[1]];
                                                        iArr60[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                        Item first7 = Inventory.getFirst(iArr60);
                                                        String[] strArr92 = new String[lIIIIlIIl[1]];
                                                        strArr92[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[174]];
                                                        TileObject nearest17 = TileObjects.getNearest(strArr92);
                                                        if (llIlllIIlII(first7) && llIlllIIlII(nearest17)) {
                                                            nearest17.interact(lIIIIIlIl[lIIIIlIIl[175]]);
                                                            Time.sleepUntil(() -> {
                                                                return Players.getLocal().getWorldLocation().equals(gN);
                                                            }, lIIIIlIIl[165]);
                                                            "".length();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (llIlllIIlll(C0004e.j(lIIIIlIIl[10]), lIIIIlIIl[11])) {
                int[] iArr61 = new int[lIIIIlIIl[1]];
                iArr61[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr61) ? 1 : 0)) {
                    String[] strArr93 = new String[lIIIIlIIl[1]];
                    strArr93[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[176]];
                    if (llIllIlllll(Inventory.contains(strArr93) ? 1 : 0)) {
                        String[] strArr94 = new String[lIIIIlIIl[1]];
                        strArr94[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[177]];
                        if (llIlllIIIll(Inventory.getFirst(strArr94).getQuantity(), lIIIIlIIl[11])) {
                            String[] strArr95 = new String[lIIIIlIIl[1]];
                            strArr95[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[178]];
                            if (llIllIlllll(Inventory.contains(strArr95) ? 1 : 0)) {
                                String[] strArr96 = new String[lIIIIlIIl[1]];
                                strArr96[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[179]];
                                if (llIlllIIIll(Inventory.getFirst(strArr96).getQuantity(), lIIIIlIIl[11])) {
                                    String[] strArr97 = new String[lIIIIlIIl[1]];
                                    strArr97[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[180]];
                                    if (llIllIlllll(Inventory.contains(strArr97) ? 1 : 0)) {
                                        String[] strArr98 = new String[lIIIIlIIl[1]];
                                        strArr98[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[181]];
                                        if (llIlllIIIll(Inventory.getFirst(strArr98).getQuantity(), lIIIIlIIl[11])) {
                                            String[] strArr99 = new String[lIIIIlIIl[1]];
                                            strArr99[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[182]];
                                            if (llIllIlllll(Inventory.contains(strArr99) ? 1 : 0)) {
                                                String[] strArr100 = new String[lIIIIlIIl[1]];
                                                strArr100[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[183]];
                                                if (llIllIlllll(Inventory.contains(strArr100) ? 1 : 0)) {
                                                    int[] iArr62 = new int[lIIIIlIIl[1]];
                                                    iArr62[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                    if (llIlllIIlIl(Inventory.getCount(iArr62)) && llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gW), lIIIIlIIl[1])) {
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[184]];
                                                        Movement.walkTo(gW);
                                                        "".length();
                                                        Time.sleepTicks(lIIIIlIIl[6]);
                                                        "".length();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr63 = new int[lIIIIlIIl[1]];
                iArr63[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr63) ? 1 : 0)) {
                    String[] strArr101 = new String[lIIIIlIIl[1]];
                    strArr101[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[185]];
                    if (llIllIlllll(Inventory.contains(strArr101) ? 1 : 0)) {
                        String[] strArr102 = new String[lIIIIlIIl[1]];
                        strArr102[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[186]];
                        if (llIlllIIIll(Inventory.getFirst(strArr102).getQuantity(), lIIIIlIIl[11])) {
                            String[] strArr103 = new String[lIIIIlIIl[1]];
                            strArr103[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[187]];
                            if (llIllIlllll(Inventory.contains(strArr103) ? 1 : 0)) {
                                String[] strArr104 = new String[lIIIIlIIl[1]];
                                strArr104[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[188]];
                                if (llIlllIIIll(Inventory.getFirst(strArr104).getQuantity(), lIIIIlIIl[11])) {
                                    String[] strArr105 = new String[lIIIIlIIl[1]];
                                    strArr105[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[189]];
                                    if (llIllIlllll(Inventory.contains(strArr105) ? 1 : 0)) {
                                        String[] strArr106 = new String[lIIIIlIIl[1]];
                                        strArr106[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[190]];
                                        if (llIlllIIIll(Inventory.getFirst(strArr106).getQuantity(), lIIIIlIIl[11])) {
                                            String[] strArr107 = new String[lIIIIlIIl[1]];
                                            strArr107[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[191]];
                                            if (llIllIlllll(Inventory.contains(strArr107) ? 1 : 0)) {
                                                String[] strArr108 = new String[lIIIIlIIl[1]];
                                                strArr108[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[192]];
                                                if (llIllIlllll(Inventory.contains(strArr108) ? 1 : 0)) {
                                                    int[] iArr64 = new int[lIIIIlIIl[1]];
                                                    iArr64[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                    if (llIlllIIlIl(Inventory.getCount(iArr64)) && llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(gW), lIIIIlIIl[3])) {
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[193]];
                                                        do {
                                                            String[] strArr109 = new String[lIIIIlIIl[1]];
                                                            strArr109[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[194]];
                                                            if (llIllIlllll(Inventory.contains(strArr109) ? 1 : 0)) {
                                                                String[] strArr110 = new String[lIIIIlIIl[1]];
                                                                strArr110[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[195]];
                                                            }
                                                            String[] strArr111 = new String[lIIIIlIIl[1]];
                                                            strArr111[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[196]];
                                                            if (llIllIlllll(Inventory.contains(strArr111) ? 1 : 0)) {
                                                                String[] strArr112 = new String[lIIIIlIIl[1]];
                                                                strArr112[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[197]];
                                                            }
                                                            String[] strArr113 = new String[lIIIIlIIl[1]];
                                                            strArr113[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[198]];
                                                            if (llIllIlllll(Inventory.contains(strArr113) ? 1 : 0)) {
                                                                String[] strArr114 = new String[lIIIIlIIl[1]];
                                                                strArr114[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[199]];
                                                                if (!llIlllIIIll(Inventory.getFirst(strArr114).getQuantity(), lIIIIlIIl[11])) {
                                                                }
                                                                if (llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) {
                                                                    WorldPoint worldPoint = f3gg;
                                                                    int[] iArr65 = new int[lIIIIlIIl[1]];
                                                                    iArr65[lIIIIlIIl[0]] = lIIIIlIIl[200];
                                                                    TileObject firstAt = TileObjects.getFirstAt(worldPoint, iArr65);
                                                                    String[] strArr115 = new String[lIIIIlIIl[1]];
                                                                    strArr115[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[201]];
                                                                    Inventory.getFirst(strArr115).useOn(firstAt);
                                                                    Time.sleepTicks(lIIIIlIIl[1]);
                                                                    "".length();
                                                                    String[] strArr116 = new String[lIIIIlIIl[1]];
                                                                    strArr116[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[202]];
                                                                    Inventory.getFirst(strArr116).useOn(firstAt);
                                                                    Time.sleepTicks(lIIIIlIIl[1]);
                                                                    "".length();
                                                                    String[] strArr117 = new String[lIIIIlIIl[1]];
                                                                    strArr117[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[203]];
                                                                    Inventory.getFirst(strArr117).useOn(firstAt);
                                                                    Time.sleepTicks(lIIIIlIIl[1]);
                                                                    "".length();
                                                                    "".length();
                                                                }
                                                            }
                                                        } while ((0 ^ 4) != (-" ".length()));
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr66 = new int[lIIIIlIIl[1]];
                iArr66[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr66) ? 1 : 0)) {
                    String[] strArr118 = new String[lIIIIlIIl[1]];
                    strArr118[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[204]];
                    if (llIllIlllll(Inventory.contains(strArr118) ? 1 : 0)) {
                        String[] strArr119 = new String[lIIIIlIIl[1]];
                        strArr119[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[205]];
                        if (llIlllIIlll(Inventory.getFirst(strArr119).getQuantity(), lIIIIlIIl[7])) {
                            String[] strArr120 = new String[lIIIIlIIl[1]];
                            strArr120[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[206]];
                            if (llIllIlllll(Inventory.contains(strArr120) ? 1 : 0)) {
                                String[] strArr121 = new String[lIIIIlIIl[1]];
                                strArr121[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[207]];
                                if (llIlllIIlll(Inventory.getFirst(strArr121).getQuantity(), lIIIIlIIl[7])) {
                                    String[] strArr122 = new String[lIIIIlIIl[1]];
                                    strArr122[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[208]];
                                    if (llIllIlllll(Inventory.contains(strArr122) ? 1 : 0)) {
                                        String[] strArr123 = new String[lIIIIlIIl[1]];
                                        strArr123[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[209]];
                                        if (llIlllIIlll(Inventory.getFirst(strArr123).getQuantity(), lIIIIlIIl[7])) {
                                            String[] strArr124 = new String[lIIIIlIIl[1]];
                                            strArr124[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[210]];
                                            if (llIllIlllll(Inventory.contains(strArr124) ? 1 : 0)) {
                                                String[] strArr125 = new String[lIIIIlIIl[1]];
                                                strArr125[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[211]];
                                                if (llIllIlllll(Inventory.contains(strArr125) ? 1 : 0)) {
                                                    int[] iArr67 = new int[lIIIIlIIl[1]];
                                                    iArr67[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                    if (llIlllIIlIl(Inventory.getCount(iArr67)) && llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gV), lIIIIlIIl[1])) {
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[212]];
                                                        while (true) {
                                                            String[] strArr126 = new String[lIIIIlIIl[1]];
                                                            strArr126[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[213]];
                                                            if (llIllIlllll(Inventory.contains(strArr126) ? 1 : 0)) {
                                                                String[] strArr127 = new String[lIIIIlIIl[1]];
                                                                strArr127[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[214]];
                                                            }
                                                            String[] strArr128 = new String[lIIIIlIIl[1]];
                                                            strArr128[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[215]];
                                                            if (llIllIlllll(Inventory.contains(strArr128) ? 1 : 0)) {
                                                                String[] strArr129 = new String[lIIIIlIIl[1]];
                                                                strArr129[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[216]];
                                                            }
                                                            String[] strArr130 = new String[lIIIIlIIl[1]];
                                                            strArr130[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[217]];
                                                            if (!llIllIlllll(Inventory.contains(strArr130) ? 1 : 0)) {
                                                                break;
                                                            }
                                                            String[] strArr131 = new String[lIIIIlIIl[1]];
                                                            strArr131[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[218]];
                                                            if (!llIlllIIlll(Inventory.getFirst(strArr131).getQuantity(), lIIIIlIIl[7])) {
                                                                break;
                                                            }
                                                            if (!llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) {
                                                                break;
                                                            }
                                                            if (llIlllIIIIl(Players.getLocal().getWorldLocation().equals(gV) ? 1 : 0)) {
                                                                Movement.walkTo(gV);
                                                                "".length();
                                                                Time.sleepTicks(lIIIIlIIl[5]);
                                                                "".length();
                                                            }
                                                            if (llIllIlllll(Players.getLocal().getWorldLocation().equals(gV) ? 1 : 0)) {
                                                                WorldPoint worldPoint2 = gh;
                                                                int[] iArr68 = new int[lIIIIlIIl[1]];
                                                                iArr68[lIIIIlIIl[0]] = lIIIIlIIl[200];
                                                                TileObject firstAt2 = TileObjects.getFirstAt(worldPoint2, iArr68);
                                                                String[] strArr132 = new String[lIIIIlIIl[1]];
                                                                strArr132[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[219]];
                                                                Inventory.getFirst(strArr132).useOn(firstAt2);
                                                                Time.sleepTicks(lIIIIlIIl[1]);
                                                                "".length();
                                                                String[] strArr133 = new String[lIIIIlIIl[1]];
                                                                strArr133[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[220]];
                                                                Inventory.getFirst(strArr133).useOn(firstAt2);
                                                                Time.sleepTicks(lIIIIlIIl[1]);
                                                                "".length();
                                                                String[] strArr134 = new String[lIIIIlIIl[1]];
                                                                strArr134[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[221]];
                                                                Inventory.getFirst(strArr134).useOn(firstAt2);
                                                                Time.sleepTicks(lIIIIlIIl[1]);
                                                                "".length();
                                                                "".length();
                                                                if ("   ".length() == 0) {
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr69 = new int[lIIIIlIIl[1]];
                iArr69[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr69) ? 1 : 0)) {
                    String[] strArr135 = new String[lIIIIlIIl[1]];
                    strArr135[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[222]];
                    if (llIllIlllll(Inventory.contains(strArr135) ? 1 : 0)) {
                        String[] strArr136 = new String[lIIIIlIIl[1]];
                        strArr136[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[223]];
                        if (llIlllIIlll(Inventory.getFirst(strArr136).getQuantity(), lIIIIlIIl[6])) {
                            String[] strArr137 = new String[lIIIIlIIl[1]];
                            strArr137[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[224]];
                            if (llIllIlllll(Inventory.contains(strArr137) ? 1 : 0)) {
                                String[] strArr138 = new String[lIIIIlIIl[1]];
                                strArr138[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[225]];
                                if (llIlllIIlll(Inventory.getFirst(strArr138).getQuantity(), lIIIIlIIl[6])) {
                                    String[] strArr139 = new String[lIIIIlIIl[1]];
                                    strArr139[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[226]];
                                    if (llIllIlllll(Inventory.contains(strArr139) ? 1 : 0)) {
                                        String[] strArr140 = new String[lIIIIlIIl[1]];
                                        strArr140[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[227]];
                                        if (llIlllIIlll(Inventory.getFirst(strArr140).getQuantity(), lIIIIlIIl[6])) {
                                            String[] strArr141 = new String[lIIIIlIIl[1]];
                                            strArr141[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[228]];
                                            if (llIllIlllll(Inventory.contains(strArr141) ? 1 : 0)) {
                                                String[] strArr142 = new String[lIIIIlIIl[1]];
                                                strArr142[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[229]];
                                                if (llIllIlllll(Inventory.contains(strArr142) ? 1 : 0)) {
                                                    int[] iArr70 = new int[lIIIIlIIl[1]];
                                                    iArr70[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                    if (llIlllIIlIl(Inventory.getCount(iArr70)) && llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[230]];
                                                        while (true) {
                                                            String[] strArr143 = new String[lIIIIlIIl[1]];
                                                            strArr143[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[231]];
                                                            if (llIllIlllll(Inventory.contains(strArr143) ? 1 : 0)) {
                                                                String[] strArr144 = new String[lIIIIlIIl[1]];
                                                                strArr144[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[232]];
                                                            }
                                                            String[] strArr145 = new String[lIIIIlIIl[1]];
                                                            strArr145[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[233]];
                                                            if (llIllIlllll(Inventory.contains(strArr145) ? 1 : 0)) {
                                                                String[] strArr146 = new String[lIIIIlIIl[1]];
                                                                strArr146[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[234]];
                                                            }
                                                            String[] strArr147 = new String[lIIIIlIIl[1]];
                                                            strArr147[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[235]];
                                                            if (!llIllIlllll(Inventory.contains(strArr147) ? 1 : 0)) {
                                                                break;
                                                            }
                                                            String[] strArr148 = new String[lIIIIlIIl[1]];
                                                            strArr148[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[236]];
                                                            if (!llIlllIIlll(Inventory.getFirst(strArr148).getQuantity(), lIIIIlIIl[6])) {
                                                                break;
                                                            }
                                                            if (!llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) {
                                                                break;
                                                            }
                                                            if (llIlllIIIIl(Players.getLocal().getWorldLocation().equals(gU) ? 1 : 0)) {
                                                                Movement.walkTo(gU);
                                                                "".length();
                                                                Time.sleepTicks(lIIIIlIIl[5]);
                                                                "".length();
                                                            }
                                                            if (llIllIlllll(Players.getLocal().getWorldLocation().equals(gU) ? 1 : 0)) {
                                                                WorldPoint worldPoint3 = gi;
                                                                int[] iArr71 = new int[lIIIIlIIl[1]];
                                                                iArr71[lIIIIlIIl[0]] = lIIIIlIIl[200];
                                                                TileObject firstAt3 = TileObjects.getFirstAt(worldPoint3, iArr71);
                                                                String[] strArr149 = new String[lIIIIlIIl[1]];
                                                                strArr149[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[237]];
                                                                Inventory.getFirst(strArr149).useOn(firstAt3);
                                                                Time.sleepTicks(lIIIIlIIl[1]);
                                                                "".length();
                                                                String[] strArr150 = new String[lIIIIlIIl[1]];
                                                                strArr150[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[238]];
                                                                Inventory.getFirst(strArr150).useOn(firstAt3);
                                                                Time.sleepTicks(lIIIIlIIl[1]);
                                                                "".length();
                                                                String[] strArr151 = new String[lIIIIlIIl[1]];
                                                                strArr151[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[239]];
                                                                Inventory.getFirst(strArr151).useOn(firstAt3);
                                                                Time.sleepTicks(lIIIIlIIl[1]);
                                                                "".length();
                                                                "".length();
                                                                if (" ".length() == "  ".length()) {
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr72 = new int[lIIIIlIIl[1]];
                iArr72[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr72) ? 1 : 0)) {
                    String[] strArr152 = new String[lIIIIlIIl[1]];
                    strArr152[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[240]];
                    if (llIllIlllll(Inventory.contains(strArr152) ? 1 : 0)) {
                        String[] strArr153 = new String[lIIIIlIIl[1]];
                        strArr153[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[241]];
                        if (llIlllIIlll(Inventory.getFirst(strArr153).getQuantity(), lIIIIlIIl[5])) {
                            String[] strArr154 = new String[lIIIIlIIl[1]];
                            strArr154[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[242]];
                            if (llIllIlllll(Inventory.contains(strArr154) ? 1 : 0)) {
                                String[] strArr155 = new String[lIIIIlIIl[1]];
                                strArr155[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[243]];
                                if (llIlllIIlll(Inventory.getFirst(strArr155).getQuantity(), lIIIIlIIl[5])) {
                                    String[] strArr156 = new String[lIIIIlIIl[1]];
                                    strArr156[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[244]];
                                    if (llIllIlllll(Inventory.contains(strArr156) ? 1 : 0)) {
                                        String[] strArr157 = new String[lIIIIlIIl[1]];
                                        strArr157[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[245]];
                                        if (llIlllIIlll(Inventory.getFirst(strArr157).getQuantity(), lIIIIlIIl[5])) {
                                            String[] strArr158 = new String[lIIIIlIIl[1]];
                                            strArr158[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[246]];
                                            if (llIllIlllll(Inventory.contains(strArr158) ? 1 : 0)) {
                                                String[] strArr159 = new String[lIIIIlIIl[1]];
                                                strArr159[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[247]];
                                                if (llIllIlllll(Inventory.contains(strArr159) ? 1 : 0)) {
                                                    int[] iArr73 = new int[lIIIIlIIl[1]];
                                                    iArr73[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                    if (llIlllIIlIl(Inventory.getCount(iArr73)) && llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[248]];
                                                        while (true) {
                                                            String[] strArr160 = new String[lIIIIlIIl[1]];
                                                            strArr160[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[249]];
                                                            if (llIllIlllll(Inventory.contains(strArr160) ? 1 : 0)) {
                                                                String[] strArr161 = new String[lIIIIlIIl[1]];
                                                                strArr161[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[250]];
                                                            }
                                                            String[] strArr162 = new String[lIIIIlIIl[1]];
                                                            strArr162[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[251]];
                                                            if (llIllIlllll(Inventory.contains(strArr162) ? 1 : 0)) {
                                                                String[] strArr163 = new String[lIIIIlIIl[1]];
                                                                strArr163[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[252]];
                                                            }
                                                            String[] strArr164 = new String[lIIIIlIIl[1]];
                                                            strArr164[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[8]];
                                                            if (!llIllIlllll(Inventory.contains(strArr164) ? 1 : 0)) {
                                                                break;
                                                            }
                                                            String[] strArr165 = new String[lIIIIlIIl[1]];
                                                            strArr165[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[253]];
                                                            if (!llIlllIIlll(Inventory.getFirst(strArr165).getQuantity(), lIIIIlIIl[5])) {
                                                                break;
                                                            }
                                                            if (!llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) {
                                                                break;
                                                            }
                                                            if (llIlllIIIIl(Players.getLocal().getWorldLocation().equals(gT) ? 1 : 0)) {
                                                                Movement.walkTo(gT);
                                                                "".length();
                                                                Time.sleepTicks(lIIIIlIIl[5]);
                                                                "".length();
                                                            }
                                                            if (llIllIlllll(Players.getLocal().getWorldLocation().equals(gT) ? 1 : 0)) {
                                                                WorldPoint worldPoint4 = gj;
                                                                int[] iArr74 = new int[lIIIIlIIl[1]];
                                                                iArr74[lIIIIlIIl[0]] = lIIIIlIIl[200];
                                                                TileObject firstAt4 = TileObjects.getFirstAt(worldPoint4, iArr74);
                                                                String[] strArr166 = new String[lIIIIlIIl[1]];
                                                                strArr166[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[254]];
                                                                Inventory.getFirst(strArr166).useOn(firstAt4);
                                                                Time.sleepTicks(lIIIIlIIl[1]);
                                                                "".length();
                                                                String[] strArr167 = new String[lIIIIlIIl[1]];
                                                                strArr167[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[255]];
                                                                Inventory.getFirst(strArr167).useOn(firstAt4);
                                                                Time.sleepTicks(lIIIIlIIl[1]);
                                                                "".length();
                                                                String[] strArr168 = new String[lIIIIlIIl[1]];
                                                                strArr168[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[256]];
                                                                Inventory.getFirst(strArr168).useOn(firstAt4);
                                                                Time.sleepTicks(lIIIIlIIl[1]);
                                                                "".length();
                                                                "".length();
                                                                if ("  ".length() <= (-" ".length())) {
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr75 = new int[lIIIIlIIl[1]];
                iArr75[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr75) ? 1 : 0)) {
                    String[] strArr169 = new String[lIIIIlIIl[1]];
                    strArr169[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[257]];
                    if (llIllIlllll(Inventory.contains(strArr169) ? 1 : 0)) {
                        String[] strArr170 = new String[lIIIIlIIl[1]];
                        strArr170[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[258]];
                        if (llIlllIIlll(Inventory.getFirst(strArr170).getQuantity(), lIIIIlIIl[3])) {
                            String[] strArr171 = new String[lIIIIlIIl[1]];
                            strArr171[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[259]];
                            if (llIllIlllll(Inventory.contains(strArr171) ? 1 : 0)) {
                                String[] strArr172 = new String[lIIIIlIIl[1]];
                                strArr172[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[260]];
                                if (llIlllIIlll(Inventory.getFirst(strArr172).getQuantity(), lIIIIlIIl[3])) {
                                    String[] strArr173 = new String[lIIIIlIIl[1]];
                                    strArr173[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[261]];
                                    if (llIllIlllll(Inventory.contains(strArr173) ? 1 : 0)) {
                                        String[] strArr174 = new String[lIIIIlIIl[1]];
                                        strArr174[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[262]];
                                        if (llIlllIIlll(Inventory.getFirst(strArr174).getQuantity(), lIIIIlIIl[3])) {
                                            String[] strArr175 = new String[lIIIIlIIl[1]];
                                            strArr175[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[263]];
                                            if (llIllIlllll(Inventory.contains(strArr175) ? 1 : 0)) {
                                                String[] strArr176 = new String[lIIIIlIIl[1]];
                                                strArr176[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[264]];
                                                if (llIllIlllll(Inventory.contains(strArr176) ? 1 : 0)) {
                                                    int[] iArr76 = new int[lIIIIlIIl[1]];
                                                    iArr76[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                    if (llIlllIIlIl(Inventory.getCount(iArr76)) && llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[265]];
                                                        while (true) {
                                                            String[] strArr177 = new String[lIIIIlIIl[1]];
                                                            strArr177[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[266]];
                                                            if (llIllIlllll(Inventory.contains(strArr177) ? 1 : 0)) {
                                                                String[] strArr178 = new String[lIIIIlIIl[1]];
                                                                strArr178[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[267]];
                                                            }
                                                            String[] strArr179 = new String[lIIIIlIIl[1]];
                                                            strArr179[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[268]];
                                                            if (llIllIlllll(Inventory.contains(strArr179) ? 1 : 0)) {
                                                                String[] strArr180 = new String[lIIIIlIIl[1]];
                                                                strArr180[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[269]];
                                                            }
                                                            String[] strArr181 = new String[lIIIIlIIl[1]];
                                                            strArr181[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[270]];
                                                            if (!llIllIlllll(Inventory.contains(strArr181) ? 1 : 0)) {
                                                                break;
                                                            }
                                                            String[] strArr182 = new String[lIIIIlIIl[1]];
                                                            strArr182[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[271]];
                                                            if (!llIlllIIlll(Inventory.getFirst(strArr182).getQuantity(), lIIIIlIIl[3])) {
                                                                break;
                                                            }
                                                            if (!llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) {
                                                                break;
                                                            }
                                                            if (llIlllIIIIl(Players.getLocal().getWorldLocation().equals(gS) ? 1 : 0)) {
                                                                Movement.walkTo(gS);
                                                                "".length();
                                                                Time.sleepTicks(lIIIIlIIl[5]);
                                                                "".length();
                                                            }
                                                            if (llIllIlllll(Players.getLocal().getWorldLocation().equals(gS) ? 1 : 0)) {
                                                                WorldPoint worldPoint5 = gk;
                                                                int[] iArr77 = new int[lIIIIlIIl[1]];
                                                                iArr77[lIIIIlIIl[0]] = lIIIIlIIl[200];
                                                                TileObject firstAt5 = TileObjects.getFirstAt(worldPoint5, iArr77);
                                                                String[] strArr183 = new String[lIIIIlIIl[1]];
                                                                strArr183[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[272]];
                                                                if (llIllIlllll(Inventory.contains(strArr183) ? 1 : 0)) {
                                                                    String[] strArr184 = new String[lIIIIlIIl[1]];
                                                                    strArr184[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[273]];
                                                                    Inventory.getFirst(strArr184).useOn(firstAt5);
                                                                    Time.sleepTicks(lIIIIlIIl[1]);
                                                                    "".length();
                                                                }
                                                                String[] strArr185 = new String[lIIIIlIIl[1]];
                                                                strArr185[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[274]];
                                                                if (llIllIlllll(Inventory.contains(strArr185) ? 1 : 0)) {
                                                                    String[] strArr186 = new String[lIIIIlIIl[1]];
                                                                    strArr186[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[275]];
                                                                    Inventory.getFirst(strArr186).useOn(firstAt5);
                                                                    Time.sleepTicks(lIIIIlIIl[1]);
                                                                    "".length();
                                                                }
                                                                String[] strArr187 = new String[lIIIIlIIl[1]];
                                                                strArr187[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[276]];
                                                                if (llIllIlllll(Inventory.contains(strArr187) ? 1 : 0)) {
                                                                    String[] strArr188 = new String[lIIIIlIIl[1]];
                                                                    strArr188[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[277]];
                                                                    Inventory.getFirst(strArr188).useOn(firstAt5);
                                                                    Time.sleepTicks(lIIIIlIIl[1]);
                                                                    "".length();
                                                                }
                                                                "".length();
                                                                if (" ".length() < 0) {
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr78 = new int[lIIIIlIIl[1]];
                iArr78[lIIIIlIIl[0]] = lIIIIlIIl[41];
                if (llIllIlllll(Inventory.contains(iArr78) ? 1 : 0)) {
                    String[] strArr189 = new String[lIIIIlIIl[1]];
                    strArr189[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[278]];
                    if (llIllIlllll(Inventory.contains(strArr189) ? 1 : 0)) {
                        String[] strArr190 = new String[lIIIIlIIl[1]];
                        strArr190[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[279]];
                        if (llIlllIIlll(Inventory.getFirst(strArr190).getQuantity(), lIIIIlIIl[1])) {
                            String[] strArr191 = new String[lIIIIlIIl[1]];
                            strArr191[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[280]];
                            if (llIllIlllll(Inventory.contains(strArr191) ? 1 : 0)) {
                                String[] strArr192 = new String[lIIIIlIIl[1]];
                                strArr192[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[281]];
                                if (llIlllIIlll(Inventory.getFirst(strArr192).getQuantity(), lIIIIlIIl[1])) {
                                    String[] strArr193 = new String[lIIIIlIIl[1]];
                                    strArr193[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[282]];
                                    if (llIllIlllll(Inventory.contains(strArr193) ? 1 : 0)) {
                                        String[] strArr194 = new String[lIIIIlIIl[1]];
                                        strArr194[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[283]];
                                        if (llIlllIIlll(Inventory.getFirst(strArr194).getQuantity(), lIIIIlIIl[1])) {
                                            String[] strArr195 = new String[lIIIIlIIl[1]];
                                            strArr195[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[284]];
                                            if (llIllIlllll(Inventory.contains(strArr195) ? 1 : 0)) {
                                                String[] strArr196 = new String[lIIIIlIIl[1]];
                                                strArr196[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[285]];
                                                if (llIllIlllll(Inventory.contains(strArr196) ? 1 : 0)) {
                                                    int[] iArr79 = new int[lIIIIlIIl[1]];
                                                    iArr79[lIIIIlIIl[0]] = lIIIIlIIl[143];
                                                    if (llIlllIIlIl(Inventory.getCount(iArr79)) && llIllIlllll(gf.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                        AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[286]];
                                                        while (true) {
                                                            String[] strArr197 = new String[lIIIIlIIl[1]];
                                                            strArr197[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[287]];
                                                            if (llIllIlllll(Inventory.contains(strArr197) ? 1 : 0)) {
                                                                String[] strArr198 = new String[lIIIIlIIl[1]];
                                                                strArr198[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[288]];
                                                            }
                                                            String[] strArr199 = new String[lIIIIlIIl[1]];
                                                            strArr199[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[289]];
                                                            if (llIllIlllll(Inventory.contains(strArr199) ? 1 : 0)) {
                                                                String[] strArr200 = new String[lIIIIlIIl[1]];
                                                                strArr200[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[290]];
                                                            }
                                                            String[] strArr201 = new String[lIIIIlIIl[1]];
                                                            strArr201[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[291]];
                                                            if (!llIllIlllll(Inventory.contains(strArr201) ? 1 : 0)) {
                                                                break;
                                                            }
                                                            String[] strArr202 = new String[lIIIIlIIl[1]];
                                                            strArr202[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[292]];
                                                            if (!llIlllIIlll(Inventory.getFirst(strArr202).getQuantity(), lIIIIlIIl[1])) {
                                                                break;
                                                            }
                                                            if (!llIlllIIIIl(AccBuilderEasyClues.d ? 1 : 0)) {
                                                                break;
                                                            }
                                                            if (llIlllIIIIl(Players.getLocal().getWorldLocation().equals(gR) ? 1 : 0)) {
                                                                Movement.walkTo(gR);
                                                                "".length();
                                                            }
                                                            if (llIllIlllll(Players.getLocal().getWorldLocation().equals(gR) ? 1 : 0)) {
                                                                WorldPoint worldPoint6 = gl;
                                                                int[] iArr80 = new int[lIIIIlIIl[1]];
                                                                iArr80[lIIIIlIIl[0]] = lIIIIlIIl[200];
                                                                TileObject firstAt6 = TileObjects.getFirstAt(worldPoint6, iArr80);
                                                                String[] strArr203 = new String[lIIIIlIIl[1]];
                                                                strArr203[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[293]];
                                                                if (llIllIlllll(Inventory.contains(strArr203) ? 1 : 0)) {
                                                                    String[] strArr204 = new String[lIIIIlIIl[1]];
                                                                    strArr204[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[294]];
                                                                    Inventory.getFirst(strArr204).useOn(firstAt6);
                                                                    Time.sleepTicks(lIIIIlIIl[1]);
                                                                    "".length();
                                                                }
                                                                String[] strArr205 = new String[lIIIIlIIl[1]];
                                                                strArr205[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[295]];
                                                                if (llIllIlllll(Inventory.contains(strArr205) ? 1 : 0)) {
                                                                    String[] strArr206 = new String[lIIIIlIIl[1]];
                                                                    strArr206[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[296]];
                                                                    Inventory.getFirst(strArr206).useOn(firstAt6);
                                                                    Time.sleepTicks(lIIIIlIIl[1]);
                                                                    "".length();
                                                                }
                                                                String[] strArr207 = new String[lIIIIlIIl[1]];
                                                                strArr207[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[297]];
                                                                if (llIllIlllll(Inventory.contains(strArr207) ? 1 : 0)) {
                                                                    String[] strArr208 = new String[lIIIIlIIl[1]];
                                                                    strArr208[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[298]];
                                                                    Inventory.getFirst(strArr208).useOn(firstAt6);
                                                                    Time.sleepTicks(lIIIIlIIl[1]);
                                                                    "".length();
                                                                }
                                                                "".length();
                                                                if (0 != 0) {
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                String[] strArr209 = new String[lIIIIlIIl[1]];
                strArr209[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[299]];
                if (llIlllIIIIl(Inventory.contains(strArr209) ? 1 : 0)) {
                    String[] strArr210 = new String[lIIIIlIIl[1]];
                    strArr210[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[300]];
                    if (llIlllIIIIl(Inventory.contains(strArr210) ? 1 : 0)) {
                        String[] strArr211 = new String[lIIIIlIIl[1]];
                        strArr211[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[301]];
                        if (llIlllIIIIl(Inventory.contains(strArr211) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[302]];
                            int[] iArr81 = new int[lIIIIlIIl[1]];
                            iArr81[lIIIIlIIl[0]] = lIIIIlIIl[303];
                            TileObject nearest18 = TileObjects.getNearest(iArr81);
                            int[] iArr82 = new int[lIIIIlIIl[1]];
                            iArr82[lIIIIlIIl[0]] = lIIIIlIIl[304];
                            Item first8 = Inventory.getFirst(iArr82);
                            if (llIlllIIlII(nearest18) && llIlllIIlII(first8)) {
                                first8.useOn(nearest18);
                                Time.sleepTicks(lIIIIlIIl[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (llIlllIIlll(C0004e.j(lIIIIlIIl[10]), lIIIIlIIl[13])) {
                AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[305]];
                int[] iArr83 = new int[lIIIIlIIl[1]];
                iArr83[lIIIIlIIl[0]] = lIIIIlIIl[306];
                TileObject nearest19 = TileObjects.getNearest(iArr83);
                int[] iArr84 = new int[lIIIIlIIl[1]];
                iArr84[lIIIIlIIl[0]] = lIIIIlIIl[307];
                Item first9 = Inventory.getFirst(iArr84);
                if (llIlllIIIII(cl, lIIIIlIIl[1])) {
                    an.nb += lIIIIlIIl[1];
                    an.o(AccBuilderEasyClues.m);
                    cl += lIIIIlIIl[1];
                    an.nb = lIIIIlIIl[0];
                    cm = lIIIIlIIl[0];
                }
                if (llIlllIIlII(nearest19) && llIlllIIlII(first9)) {
                    first9.useOn(nearest19);
                    Time.sleepTicks(lIIIIlIIl[7]);
                    "".length();
                    C0006g.a(hl);
                }
            }
            if (llIlllIIlll(C0004e.j(lIIIIlIIl[10]), lIIIIlIIl[19])) {
                String[] strArr212 = new String[lIIIIlIIl[1]];
                strArr212[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[308]];
                if (llIlllIlIIl(TileObjects.getNearest(strArr212))) {
                    String[] strArr213 = new String[lIIIIlIIl[1]];
                    strArr213[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[309]];
                    if (!llIlllIIlII(TileObjects.getNearest(strArr213))) {
                        return;
                    }
                }
                String[] strArr214 = new String[lIIIIlIIl[1]];
                strArr214[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[310]];
                if (llIlllIIlII(TileObjects.getNearest(strArr214))) {
                    AccBuilderEasyClues.c = lIIIIIlIl[lIIIIlIIl[311]];
                    if (llIlllIIIIl(Equipment.contains(C0005f.aN) ? 1 : 0) && llIllIlllll(Inventory.contains(C0005f.aN) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aN).interact(lIIIIIlIl[lIIIIlIIl[312]]);
                        Time.sleepTicks(lIIIIlIIl[6]);
                        "".length();
                    }
                    if (llIllIlllll(Equipment.contains(C0005f.aN) ? 1 : 0)) {
                        Equipment.getFirst(C0005f.aN).interact(lIIIIIlIl[lIIIIlIIl[313]]);
                        Time.sleepTicks(lIIIIlIIl[6]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean llIlllIIlII(Object obj) {
        return obj != null;
    }

    private static void llIllIllllI() {
        lIIIIlIIl = new int[414];
        lIIIIlIIl[0] = ((((13 + 48) - 1) + 134) ^ (((15 + 65) - 13) + 65)) & (((18 ^ 27) ^ (99 ^ 44)) ^ (-" ".length()));
        lIIIIlIIl[1] = " ".length();
        lIIIIlIIl[2] = (71 ^ 15) ^ (235 ^ 145);
        lIIIIlIIl[3] = "  ".length();
        lIIIIlIIl[4] = 164 ^ 170;
        lIIIIlIIl[5] = "   ".length();
        lIIIIlIIl[6] = (58 ^ 22) ^ (72 ^ 96);
        lIIIIlIIl[7] = (((70 + 141) - 125) + 63) ^ (((28 + 143) - 157) + 130);
        lIIIIlIIl[8] = (("  ".length() + (((99 + 170) - 261) + 169)) - (104 ^ 53)) + ((92 + 68) - 85) + 65;
        lIIIIlIIl[9] = 130 ^ 133;
        lIIIIlIIl[10] = (75 ^ 87) ^ (227 ^ 190);
        lIIIIlIIl[11] = 90 ^ 92;
        lIIIIlIIl[12] = (-103) & 5102;
        lIIIIlIIl[13] = 11 ^ 3;
        lIIIIlIIl[14] = (-3221) & 3775;
        lIIIIlIIl[15] = (-((-4621) & 32670)) & (-4099) & 32703;
        lIIIIlIIl[16] = (-((-1117) & 32223)) & (-65) & 31727;
        lIIIIlIIl[17] = (38 ^ 12) ^ (40 ^ 11);
        lIIIIlIIl[18] = (-((-22794) & 31051)) & (-4097) & 13307;
        lIIIIlIIl[19] = 123 ^ 113;
        lIIIIlIIl[20] = (-((-161) & 21241)) & (-10275) & 31739;
        lIIIIlIIl[21] = (12 ^ 78) ^ (193 ^ 136);
        lIIIIlIIl[22] = 148 ^ 152;
        lIIIIlIIl[23] = (35 ^ 86) ^ (33 ^ 89);
        lIIIIlIIl[24] = (-((-2418) & 31607)) & (-1025) & 32765;
        lIIIIlIIl[25] = 155 ^ 137;
        lIIIIlIIl[26] = (((122 + 83) - 142) + 66) ^ (((11 + 29) - (-30)) + 72);
        lIIIIlIIl[27] = 49 ^ 33;
        lIIIIlIIl[28] = (((40 + 82) - (-25)) + 8) ^ (((0 + 18) - (-5)) + 115);
        lIIIIlIIl[29] = 144 ^ 131;
        lIIIIlIIl[30] = 184 ^ 172;
        lIIIIlIIl[31] = (-8195) & 10183;
        lIIIIlIIl[32] = 123 ^ 110;
        lIIIIlIIl[33] = 32 ^ 54;
        lIIIIlIIl[34] = (144 ^ 178) ^ (171 ^ 158);
        lIIIIlIIl[35] = (((66 + 86) - 40) + 26) ^ (((9 + 4) - (-128)) + 5);
        lIIIIlIIl[36] = -" ".length();
        lIIIIlIIl[37] = (2 ^ 44) ^ (167 ^ 144);
        lIIIIlIIl[38] = 102 ^ 124;
        lIIIIlIIl[39] = 191 ^ 164;
        lIIIIlIIl[40] = (-((-4131) & 23219)) & (-1025) & 20405;
        lIIIIlIIl[41] = (-31249) & 31542;
        lIIIIlIIl[42] = 63 ^ 35;
        lIIIIlIIl[43] = (143 ^ 199) ^ (239 ^ 186);
        lIIIIlIIl[44] = 163 ^ 189;
        lIIIIlIIl[45] = 167 ^ 184;
        lIIIIlIIl[46] = 139 ^ 171;
        lIIIIlIIl[47] = (-((-5131) & 24427)) & (-8206) & 32751;
        lIIIIlIIl[48] = 156 ^ 189;
        lIIIIlIIl[49] = (-2065) & 4054;
        lIIIIlIIl[50] = (((167 + 209) - 273) + 128) ^ (((144 + 26) - 80) + 107);
        lIIIIlIIl[51] = 176 ^ 147;
        lIIIIlIIl[52] = 156 ^ 184;
        lIIIIlIIl[53] = (-((-12393) & 31356)) & (-4229) & 32767;
        lIIIIlIIl[54] = 79 ^ 106;
        lIIIIlIIl[55] = (-((-67) & 28795)) & (-1) & 30719;
        lIIIIlIIl[56] = (32 ^ 21) ^ (109 ^ 126);
        lIIIIlIIl[57] = 53 ^ 18;
        lIIIIlIIl[58] = 180 ^ 156;
        lIIIIlIIl[59] = 13 ^ 36;
        lIIIIlIIl[60] = (74 ^ 37) ^ (42 ^ 111);
        lIIIIlIIl[61] = (((79 + 73) - 87) + 168) ^ (((29 + 165) - 10) + 10);
        lIIIIlIIl[62] = 178 ^ 158;
        lIIIIlIIl[63] = 14 ^ 35;
        lIIIIlIIl[64] = (((96 + 80) - 175) + 175) ^ (((133 + 31) - 143) + 137);
        lIIIIlIIl[65] = (-((-858) & 29535)) & (-2081) & 32749;
        lIIIIlIIl[66] = (-((-8529) & 29555)) & (-2113) & 32638;
        lIIIIlIIl[67] = (212 ^ 152) ^ (199 ^ 164);
        lIIIIlIIl[68] = (117 ^ 21) ^ (27 ^ 75);
        lIIIIlIIl[69] = 22 ^ 39;
        lIIIIlIIl[70] = (-((-17993) & 32350)) & (-16417) & 32767;
        lIIIIlIIl[71] = (76 ^ 65) ^ (36 ^ 26);
        lIIIIlIIl[72] = (-28721) & 30715;
        lIIIIlIIl[73] = 149 ^ 161;
        lIIIIlIIl[74] = (((4 + 78) - 22) + 94) ^ (((151 + 63) - 48) + 9);
        lIIIIlIIl[75] = (76 ^ 18) ^ (243 ^ 155);
        lIIIIlIIl[76] = 67 ^ 116;
        lIIIIlIIl[77] = (64 ^ 82) ^ (177 ^ 155);
        lIIIIlIIl[78] = 172 ^ 149;
        lIIIIlIIl[79] = 94 ^ 100;
        lIIIIlIIl[80] = (((41 + 60) - 83) + 129) ^ (((147 + 126) - 181) + 76);
        lIIIIlIIl[81] = (-((-17969) & 24119)) & (-16385) & 24527;
        lIIIIlIIl[82] = (((107 + 41) - 24) + 24) ^ (((119 + 122) - 186) + 113);
        lIIIIlIIl[83] = 116 ^ 73;
        lIIIIlIIl[84] = 108 ^ 82;
        lIIIIlIIl[85] = 50 ^ 13;
        lIIIIlIIl[86] = (((156 + 175) - 324) + 193) ^ (((118 + 11) - 48) + 55);
        lIIIIlIIl[87] = 86 ^ 20;
        lIIIIlIIl[88] = 31 ^ 92;
        lIIIIlIIl[89] = (154 ^ 135) ^ (93 ^ 4);
        lIIIIlIIl[90] = 59 ^ 126;
        lIIIIlIIl[91] = 117 ^ 51;
        lIIIIlIIl[92] = (17 ^ 87) ^ " ".length();
        lIIIIlIIl[93] = 224 ^ 168;
        lIIIIlIIl[94] = (123 ^ 113) ^ (126 ^ 61);
        lIIIIlIIl[95] = (((154 + 107) - 145) + 91) ^ (((61 + 23) - 30) + 79);
        lIIIIlIIl[96] = 122 ^ 49;
        lIIIIlIIl[97] = 114 ^ 62;
        lIIIIlIIl[98] = (113 ^ 97) ^ (125 ^ 32);
        lIIIIlIIl[99] = 20 ^ 90;
        lIIIIlIIl[100] = (((24 + 46) - (-1)) + 67) ^ (((113 + 114) - 88) + 58);
        lIIIIlIIl[101] = (197 ^ 153) ^ (70 ^ 74);
        lIIIIlIIl[102] = (((90 + 169) - 54) + 24) ^ (((18 + 134) - 92) + 120);
        lIIIIlIIl[103] = 17 ^ 67;
        lIIIIlIIl[104] = 104 ^ 59;
        lIIIIlIIl[105] = (218 ^ 185) ^ (166 ^ 145);
        lIIIIlIIl[106] = 40 ^ 125;
        lIIIIlIIl[107] = 236 ^ 186;
        lIIIIlIIl[108] = 73 ^ 30;
        lIIIIlIIl[109] = (110 ^ 88) ^ (46 ^ 64);
        lIIIIlIIl[110] = 93 ^ 4;
        lIIIIlIIl[111] = 241 ^ 171;
        lIIIIlIIl[112] = (217 ^ 145) ^ (44 ^ 63);
        lIIIIlIIl[113] = 153 ^ 197;
        lIIIIlIIl[114] = (202 ^ 134) ^ (213 ^ 196);
        lIIIIlIIl[115] = (((117 + 153) - 213) + 177) ^ (((168 + 90) - 195) + 117);
        lIIIIlIIl[116] = 81 ^ 14;
        lIIIIlIIl[117] = (((65 + 151) - 38) + 71) ^ (((119 + 46) - 28) + 16);
        lIIIIlIIl[118] = (27 ^ 52) ^ (54 ^ 120);
        lIIIIlIIl[119] = (95 ^ 15) ^ (42 ^ 24);
        lIIIIlIIl[120] = 220 ^ 191;
        lIIIIlIIl[121] = 71 ^ 35;
        lIIIIlIIl[122] = 2 ^ 103;
        lIIIIlIIl[123] = (((140 + 175) - 187) + 67) ^ (((100 + 5) - 13) + 73);
        lIIIIlIIl[124] = 70 ^ 33;
        lIIIIlIIl[125] = 45 ^ 69;
        lIIIIlIIl[126] = (245 ^ 152) ^ (97 ^ 101);
        lIIIIlIIl[127] = (((104 + 89) - 117) + 117) ^ (((71 + 146) - 158) + 112);
        lIIIIlIIl[128] = (-25733) & 32732;
        lIIIIlIIl[129] = 125 ^ 22;
        lIIIIlIIl[130] = (-((-1637) & 22118)) & (-10249) & 32749;
        lIIIIlIIl[131] = (((162 + 97) - 142) + 57) ^ (((1 + 137) - 79) + 135);
        lIIIIlIIl[132] = 204 ^ 161;
        lIIIIlIIl[133] = 12 ^ 98;
        lIIIIlIIl[134] = 86 ^ 57;
        lIIIIlIIl[135] = 110 ^ 30;
        lIIIIlIIl[136] = 49 ^ 64;
        lIIIIlIIl[137] = 237 ^ 159;
        lIIIIlIIl[138] = 253 ^ 142;
        lIIIIlIIl[139] = (((143 + 6) - 68) + 116) ^ (((158 + 76) - 109) + 52);
        lIIIIlIIl[140] = (80 ^ 12) ^ (81 ^ 120);
        lIIIIlIIl[141] = 194 ^ 180;
        lIIIIlIIl[142] = 215 ^ 160;
        lIIIIlIIl[143] = (-17554) & 17851;
        lIIIIlIIl[144] = 82 ^ 42;
        lIIIIlIIl[145] = (-((-1577) & 13865)) & (-16401) & 30687;
        lIIIIlIIl[146] = 230 ^ 159;
        lIIIIlIIl[147] = (199 ^ 195) ^ (195 ^ 189);
        lIIIIlIIl[148] = 76 ^ 55;
        lIIIIlIIl[149] = (132 ^ 161) ^ (97 ^ 56);
        lIIIIlIIl[150] = 93 ^ 32;
        lIIIIlIIl[151] = (161 ^ 183) ^ (217 ^ 177);
        lIIIIlIIl[152] = ((111 + 112) - 99) + 3;
        lIIIIlIIl[153] = (((4 ^ 93) + (61 ^ 39)) - (189 ^ 150)) + (115 ^ 75);
        lIIIIlIIl[154] = ((92 + 104) - 164) + 97;
        lIIIIlIIl[155] = ((89 + 27) - 81) + 95;
        lIIIIlIIl[156] = ((121 + 54) - 81) + 37;
        lIIIIlIIl[157] = ((29 + 65) - (-19)) + 19;
        lIIIIlIIl[158] = (((6 ^ 55) + (196 ^ 162)) - (105 ^ 72)) + (11 ^ 4);
        lIIIIlIIl[159] = ((36 + 96) - 121) + 123;
        lIIIIlIIl[160] = ((134 + 27) - 113) + 87;
        lIIIIlIIl[161] = (((1 ^ 59) + (91 ^ 18)) - (155 ^ 196)) + (13 ^ 105);
        lIIIIlIIl[162] = ((57 + 21) - 6) + 65;
        lIIIIlIIl[163] = (((59 ^ 67) + (168 ^ 133)) - (((116 + 102) - 128) + 73)) + ((111 + 93) - 89) + 21;
        lIIIIlIIl[164] = ((80 + 35) - 75) + 99;
        lIIIIlIIl[165] = (-140) & 8639;
        lIIIIlIIl[166] = ((118 + 22) - 114) + 114;
        lIIIIlIIl[167] = ((115 + 48) - 110) + 88;
        lIIIIlIIl[168] = (((((26 + 25) - (-79)) + 9) + (125 ^ 6)) - (((125 + 150) - 273) + 155)) + (156 ^ 185);
        lIIIIlIIl[169] = ((42 + 90) - 44) + 55;
        lIIIIlIIl[170] = (((208 ^ 177) + (63 ^ 23)) - (223 ^ 156)) + (53 ^ 127);
        lIIIIlIIl[171] = (((56 ^ 35) + (0 ^ 69)) - (147 ^ 187)) + (44 ^ 117);
        lIIIIlIIl[172] = (((124 ^ 61) + (213 ^ 188)) - (((35 + 17) - (-32)) + 84)) + ((72 + 67) - 115) + 120;
        lIIIIlIIl[173] = ((120 + 10) - 35) + 52;
        lIIIIlIIl[174] = ((133 + 2) - 63) + 76;
        lIIIIlIIl[175] = ((138 + 22) - 34) + 23;
        lIIIIlIIl[176] = ((125 + 132) - 223) + 116;
        lIIIIlIIl[177] = ((41 + 15) - 53) + 148;
        lIIIIlIIl[178] = (((84 ^ 116) + (((116 + 46) - 126) + 97)) - (252 ^ 167)) + (82 ^ 28);
        lIIIIlIIl[179] = ((122 + 71) - 117) + 77;
        lIIIIlIIl[180] = ((51 + 120) - 139) + 122;
        lIIIIlIIl[181] = ((14 + 8) - (-33)) + 100;
        lIIIIlIIl[182] = ((108 + 130) - 82) + 0;
        lIIIIlIIl[183] = ((49 + 42) - 10) + 76;
        lIIIIlIIl[184] = (((156 ^ 191) + (77 ^ 98)) - (-(244 ^ 183))) + (129 ^ 136);
        lIIIIlIIl[185] = (((((113 + 29) - 98) + 88) + (136 ^ 142)) - (50 ^ 90)) + (201 ^ 180);
        lIIIIlIIl[186] = ((2 + 102) - (-27)) + 29;
        lIIIIlIIl[187] = ((76 + 2) - 4) + 87;
        lIIIIlIIl[188] = ((2 + 42) - (-69)) + 49;
        lIIIIlIIl[189] = ((9 + 14) - (-103)) + 37;
        lIIIIlIIl[190] = (((251 ^ 194) + (((132 + 110) - 102) + 20)) - (193 ^ 128)) + (70 ^ 74);
        lIIIIlIIl[191] = ((91 + 45) - 20) + 49;
        lIIIIlIIl[192] = ((12 + 130) - 107) + 131;
        lIIIIlIIl[193] = ((28 + 82) - (-51)) + 6;
        lIIIIlIIl[194] = ((133 + 127) - 229) + 137;
        lIIIIlIIl[195] = ((145 + 131) - 152) + 45;
        lIIIIlIIl[196] = ((102 + 19) - 28) + 77;
        lIIIIlIIl[197] = (((95 ^ 120) + (196 ^ 179)) - (((42 + 77) - 48) + 62)) + ((57 + 129) - 137) + 97;
        lIIIIlIIl[198] = (((46 ^ 29) + (49 ^ 88)) - (27 ^ 71)) + (117 ^ 25);
        lIIIIlIIl[199] = (((((111 + 131) - 110) + 38) + (((80 + 61) - 4) + 34)) - ((-20501) & 20830)) + ((161 + 34) - 136) + 103;
        lIIIIlIIl[200] = (-2081) & 4085;
        lIIIIlIIl[201] = (((((82 + 38) - 106) + 113) + (22 ^ 3)) - (127 ^ 2)) + ((71 + 28) - (-37)) + 15;
        lIIIIlIIl[202] = (((111 ^ 45) + (40 ^ 98)) - (33 ^ 13)) + (76 ^ 3);
        lIIIIlIIl[203] = ((89 + 110) - 167) + 144;
        lIIIIlIIl[204] = (((27 ^ 50) + (71 ^ 123)) - (-(58 ^ 122))) + (113 ^ 125);
        lIIIIlIIl[205] = ((98 + 166) - 148) + 62;
        lIIIIlIIl[206] = (((31 ^ 61) + (30 ^ 82)) - (151 ^ 147)) + (210 ^ 155);
        lIIIIlIIl[207] = ((38 + 18) - (-78)) + 46;
        lIIIIlIIl[208] = ((126 + 140) - 95) + 10;
        lIIIIlIIl[209] = (((((117 + 71) - 61) + 34) + (240 ^ 174)) - (((5 + 111) - 52) + 119)) + (87 ^ 57);
        lIIIIlIIl[210] = ((115 + 169) - 278) + 177;
        lIIIIlIIl[211] = (((74 ^ 108) + (((182 + 28) - 197) + 170)) - (((202 + 39) - 135) + 99)) + ((14 + 68) - 77) + 163;
        lIIIIlIIl[212] = (((192 ^ 142) + (51 ^ 85)) - (((32 + 0) - 3) + 118)) + ((52 + 33) - (-11)) + 56;
        lIIIIlIIl[213] = (((53 ^ 87) + (((61 + 37) - 60) + 146)) - (((98 + 236) - 108) + 13)) + ((69 + 10) - (-19)) + 45;
        lIIIIlIIl[214] = ((171 + 113) - 127) + 30;
        lIIIIlIIl[215] = ((133 + 41) - 157) + 171;
        lIIIIlIIl[216] = (((((92 + 39) - 76) + 99) + (((7 + 57) - 51) + 114)) - (((193 + 70) - 188) + 161)) + ((7 + 21) - (-113)) + 3;
        lIIIIlIIl[217] = ((127 + 49) - 0) + 14;
        lIIIIlIIl[218] = ((32 + 154) - 73) + 78;
        lIIIIlIIl[219] = (((32 ^ 60) + (237 ^ 136)) - (-(119 ^ 102))) + (162 ^ 140);
        lIIIIlIIl[220] = ((1 + 24) - (-146)) + 22;
        lIIIIlIIl[221] = (((((95 + 98) - 116) + 103) + (22 ^ 55)) - (63 ^ 37)) + (43 ^ 44);
        lIIIIlIIl[222] = (((209 ^ 169) + (((94 + 52) - 127) + 109)) - (((80 + 48) - 9) + 17)) + (108 ^ 63);
        lIIIIlIIl[223] = (((66 ^ 71) + (((136 + 187) - 238) + 103)) - (((21 + 31) - 35) + 152)) + ((5 + 139) - (-11)) + 17;
        lIIIIlIIl[224] = (((((58 + 119) - 10) + 19) + (137 ^ 149)) - (((39 + 151) - 166) + 138)) + ((125 + 133) - 124) + 11;
        lIIIIlIIl[225] = ((178 + 137) - 312) + 195;
        lIIIIlIIl[226] = (((((31 + 153) - 88) + 95) + (116 ^ 127)) - (251 ^ 145)) + (88 ^ 63);
        lIIIIlIIl[227] = (((((168 + 14) - 1) + 15) + (((169 + 56) - 121) + 74)) - (((227 + 175) - 324) + 159)) + (252 ^ 195);
        lIIIIlIIl[228] = ((80 + 192) - 177) + 106;
        lIIIIlIIl[229] = ((195 + 144) - 222) + 85;
        lIIIIlIIl[230] = (((65 ^ 47) + (48 ^ 7)) - (70 ^ 109)) + (245 ^ 164);
        lIIIIlIIl[231] = ((194 + 169) - 177) + 18;
        lIIIIlIIl[232] = ((118 + 185) - 170) + 72;
        lIIIIlIIl[233] = ((13 + 204) - 157) + 146;
        lIIIIlIIl[234] = (((((88 + 85) - 155) + 122) + (21 ^ 113)) - (((58 + 193) - 60) + 31)) + ((170 + 140) - 151) + 30;
        lIIIIlIIl[235] = (((((65 + 79) - 94) + 85) + (((166 + 161) - 200) + 55)) - (61 ^ 80)) + ((86 ^ 79) & ((41 ^ 48) ^ (-1)));
        lIIIIlIIl[236] = ((113 + 71) - 12) + 37;
        lIIIIlIIl[237] = ((198 + 20) - 79) + 71;
        lIIIIlIIl[238] = (((166 ^ 156) + (154 ^ 163)) - (170 ^ 194)) + ((193 + 175) - 313) + 145;
        lIIIIlIIl[239] = ((11 + 141) - (-30)) + 30;
        lIIIIlIIl[240] = ((52 + 158) - 138) + 141;
        lIIIIlIIl[241] = ((20 + 7) - (-166)) + 21;
        lIIIIlIIl[242] = (((((197 + 164) - 152) + 4) + (122 ^ 110)) - (112 ^ 52)) + (103 ^ 85);
        lIIIIlIIl[243] = ((203 + 107) - 226) + 132;
        lIIIIlIIl[244] = (((85 ^ 48) + (((48 + 14) - 31) + 105)) - (((128 + 116) - 85) + 45)) + ((52 + 27) - 46) + 151;
        lIIIIlIIl[245] = ((49 + 64) - (-28)) + 77;
        lIIIIlIIl[246] = (((((55 + 17) - (-40)) + 46) + (((140 + 134) - 198) + 103)) - ((-27857) & 28117)) + ((72 + 140) - 151) + 82;
        lIIIIlIIl[247] = (((((142 + 10) - (-24)) + 3) + (142 ^ 147)) - (65 ^ 116)) + (30 ^ 95);
        lIIIIlIIl[248] = (((((102 + 43) - (-21)) + 34) + (208 ^ 136)) - (((122 + 187) - 147) + 91)) + ((165 + 139) - 210) + 92;
        lIIIIlIIl[249] = (((174 ^ 189) + (((167 + 180) - 167) + 8)) - (39 ^ 68)) + (5 ^ 119);
        lIIIIlIIl[250] = (((85 ^ 104) + (123 ^ 103)) - (-(4 ^ 84))) + (244 ^ 194);
        lIIIIlIIl[251] = (((((91 + 69) - 14) + 9) + (((99 + 77) - 169) + 182)) - ((-12417) & 12723)) + ((35 + 122) - (-13)) + 17;
        lIIIIlIIl[252] = (((67 ^ 84) + (235 ^ 184)) - (14 ^ 5)) + ((96 + 26) - 43) + 51;
        lIIIIlIIl[253] = (((94 ^ 105) + (((79 + 115) - 165) + 169)) - (((129 + 185) - 127) + 9)) + ((78 + 142) - 207) + 157;
        lIIIIlIIl[254] = (((((41 + 93) - 117) + 145) + (26 ^ 111)) - (((20 + 123) - 120) + 107)) + (53 ^ 122);
        lIIIIlIIl[255] = (((((52 + 187) - 208) + 182) + (((183 + 106) - 120) + 38)) - ((-30281) & 30687)) + ((17 + 14) - 11) + 196;
        lIIIIlIIl[256] = ((139 + 211) - 193) + 73;
        lIIIIlIIl[257] = (((((175 + 122) - 225) + 142) + (((106 + 83) - 34) + 24)) - (((93 + 86) - 161) + 153)) + (97 ^ 104);
        lIIIIlIIl[258] = ((137 + 142) - 156) + 109;
        lIIIIlIIl[259] = (((250 ^ 167) + (((123 + 98) - 126) + 131)) - (((59 + 176) - 37) + 1)) + (219 ^ 170);
        lIIIIlIIl[260] = (((((153 + 143) - 216) + 151) + (((80 + 109) - 26) + 5)) - ((-7329) & 7673)) + ((17 + 80) - (-44)) + 39;
        lIIIIlIIl[261] = ((3 + 162) - (-42)) + 28;
        lIIIIlIIl[262] = (("   ".length() + (((139 + 74) - 61) + 23)) - (121 ^ 50)) + ((32 + 3) - (-71)) + 27;
        lIIIIlIIl[263] = (((100 ^ 93) + (((32 + 2) - 12) + 113)) - (19 ^ 5)) + (252 ^ 191);
        lIIIIlIIl[264] = ((91 + 127) - 176) + 196;
        lIIIIlIIl[265] = ((39 + 150) - 156) + 206;
        lIIIIlIIl[266] = (((129 ^ 197) + (168 ^ 150)) - (56 ^ 108)) + ((4 + 138) - 122) + 174;
        lIIIIlIIl[267] = (((((76 + 21) - 76) + 205) + (((30 + 164) - 33) + 41)) - (((65 + 119) - 46) + 66)) + (180 ^ 165);
        lIIIIlIIl[268] = ((0 + 184) - (-28)) + 30;
        lIIIIlIIl[269] = ((239 + 117) - 218) + 105;
        lIIIIlIIl[270] = ((236 + 220) - 288) + 76;
        lIIIIlIIl[271] = (((((7 + 1) - (-124)) + 87) + (67 ^ 82)) - (125 ^ 17)) + (243 ^ 134);
        lIIIIlIIl[272] = ((152 + 11) - 111) + 194;
        lIIIIlIIl[273] = (((74 ^ 76) + (((43 + 140) - 76) + 93)) - (224 ^ 138)) + ((38 + 78) - (-20)) + 11;
        lIIIIlIIl[274] = ((207 + 50) - 230) + 221;
        lIIIIlIIl[275] = (((188 ^ 130) + (22 ^ 5)) - (-(98 ^ 118))) + ((109 + 40) - 65) + 64;
        lIIIIlIIl[276] = (((227 ^ 166) + (90 ^ 95)) - (-(239 ^ 167))) + (225 ^ 137);
        lIIIIlIIl[277] = (((91 ^ 98) + (((7 + 200) - 180) + 211)) - (((6 + 35) - (-65)) + 39)) + (47 ^ 74);
        lIIIIlIIl[278] = ((203 + 21) - 123) + 151;
        lIIIIlIIl[279] = (((2 ^ 29) + (((188 + 47) - 61) + 57)) - (((39 + 39) - (-96)) + 25)) + ((177 + 97) - 199) + 115;
        lIIIIlIIl[280] = ((245 + 29) - 77) + 57;
        lIIIIlIIl[281] = (((((23 + 141) - 110) + 132) + (((57 + 73) - 123) + 206)) - (((123 + 96) - 213) + 235)) + (107 ^ 10);
        lIIIIlIIl[282] = (-14904) & 15159;
        lIIIIlIIl[283] = (-5819) & 6075;
        lIIIIlIIl[284] = (-((-7187) & 15927)) & (-19474) & 28471;
        lIIIIlIIl[285] = (-((-18919) & 24559)) & (-8309) & 14207;
        lIIIIlIIl[286] = (-((-197) & 23271)) & (-1154) & 24487;
        lIIIIlIIl[287] = (-((-27173) & 32439)) & (-25129) & 30655;
        lIIIIlIIl[288] = (-((-263) & 10207)) & (-22561) & 32766;
        lIIIIlIIl[289] = (-14353) & 14615;
        lIIIIlIIl[290] = (-((-2129) & 7383)) & (-626) & 6143;
        lIIIIlIIl[291] = (-((-2149) & 27893)) & (-515) & 26523;
        lIIIIlIIl[292] = (-22626) & 22891;
        lIIIIlIIl[293] = (-((-1313) & 12209)) & (-20481) & 31643;
        lIIIIlIIl[294] = (-15458) & 15725;
        lIIIIlIIl[295] = (-4113) & 4381;
        lIIIIlIIl[296] = (-32434) & 32703;
        lIIIIlIIl[297] = (-225) & 495;
        lIIIIlIIl[298] = (-24804) & 25075;
        lIIIIlIIl[299] = (-((-291) & 27943)) & (-4809) & 32733;
        lIIIIlIIl[300] = (-6894) & 7167;
        lIIIIlIIl[301] = (-2565) & 2839;
        lIIIIlIIl[302] = (-21188) & 21463;
        lIIIIlIIl[303] = (-((-134) & 24751)) & (-2049) & 28671;
        lIIIIlIIl[304] = (-((-19515) & 28411)) & (-18457) & 27647;
        lIIIIlIIl[305] = (-13865) & 14141;
        lIIIIlIIl[306] = (-((-1665) & 32418)) & (-1) & 32767;
        lIIIIlIIl[307] = (-15495) & 15790;
        lIIIIlIIl[308] = (-((-79) & 10479)) & (-1098) & 11775;
        lIIIIlIIl[309] = (-14409) & 14687;
        lIIIIlIIl[310] = (-((-7825) & 32469)) & (-3105) & 28028;
        lIIIIlIIl[311] = (-7393) & 7673;
        lIIIIlIIl[312] = (-6178) & 6459;
        lIIIIlIIl[313] = (-((-8459) & 30155)) & (-2597) & 24575;
        lIIIIlIIl[314] = (-20708) & 20991;
        lIIIIlIIl[315] = (-20548) & 23547;
        lIIIIlIIl[316] = (-17441) & 30065;
        lIIIIlIIl[317] = (-16407) & 17406;
        lIIIIlIIl[318] = (-((-3485) & 15807)) & (-16385) & 32559;
        lIIIIlIIl[319] = (-18466) & 20465;
        lIIIIlIIl[320] = (-((-4114) & 4467)) & (-1) & 15353;
        lIIIIlIIl[321] = (-((-28227) & 28502)) & (-1) & 12255;
        lIIIIlIIl[322] = (-((-18978) & 28343)) & (-4353) & 30717;
        lIIIIlIIl[323] = (-(((35 + 91) - 41) + 60)) & (-16385) & 24535;
        lIIIIlIIl[324] = (-2563) & 3862;
        lIIIIlIIl[325] = (-((-477) & 28669)) & (-4225) & 32701;
        lIIIIlIIl[326] = (-31809) & 32094;
        lIIIIlIIl[327] = (-4705) & 4991;
        lIIIIlIIl[328] = (-((-4107) & 12895)) & (-20489) & 29564;
        lIIIIlIIl[329] = (-20119) & 20407;
        lIIIIlIIl[330] = (-((-403) & 23967)) & (-641) & 24494;
        lIIIIlIIl[331] = (-20041) & 20331;
        lIIIIlIIl[332] = (-((-33) & 15033)) & (-16385) & 31676;
        lIIIIlIIl[333] = (-((-10505) & 31097)) & (-8321) & 32767;
        lIIIIlIIl[334] = (-4109) & 7965;
        lIIIIlIIl[335] = (-28813) & 32671;
        lIIIIlIIl[336] = (-24643) & 28503;
        lIIIIlIIl[337] = (-28681) & 32543;
        lIIIIlIIl[338] = (-16451) & 20315;
        lIIIIlIIl[339] = (-28673) & 32539;
        lIIIIlIIl[340] = (-(((93 + 85) - 55) + 18)) & (-20001) & 32767;
        lIIIIlIIl[341] = (-18947) & 31575;
        lIIIIlIIl[342] = (-((-2595) & 18987)) & (-3745) & 32767;
        lIIIIlIIl[343] = (-5) & 2558;
        lIIIIlIIl[344] = (-20993) & 23550;
        lIIIIlIIl[345] = (-13397) & 15956;
        lIIIIlIIl[346] = (-28881) & 31442;
        lIIIIlIIl[347] = (-25689) & 28252;
        lIIIIlIIl[348] = (-((-6537) & 24459)) & (-4098) & 24575;
        lIIIIlIIl[349] = (-4585) & 7150;
        lIIIIlIIl[350] = (-6227) & 16127;
        lIIIIlIIl[351] = (-((-18651) & 28159)) & (-65) & 12141;
        lIIIIlIIl[352] = (-6217) & 16126;
        lIIIIlIIl[353] = (-((-10770) & 15189)) & (-16389) & 30719;
        lIIIIlIIl[354] = (-6402) & 16315;
        lIIIIlIIl[355] = (-12817) & 15321;
        lIIIIlIIl[356] = (-29066) & 32255;
        lIIIIlIIl[357] = (-17926) & 20447;
        lIIIIlIIl[358] = (-((-18930) & 31743)) & (-1) & 15997;
        lIIIIlIIl[359] = (-1541) & 4077;
        lIIIIlIIl[360] = (-((-17785) & 18431)) & (-24849) & 28671;
        lIIIIlIIl[361] = (-((-19521) & 27717)) & (-21507) & 32247;
        lIIIIlIIl[362] = (-" ".length()) & (-4097) & 7255;
        lIIIIlIIl[363] = (-((-1027) & 22027)) & (-1) & 23534;
        lIIIIlIIl[364] = (-((-10275) & 31267)) & (-8233) & 32379;
        lIIIIlIIl[365] = (-((-16787) & 30135)) & (-16385) & 32247;
        lIIIIlIIl[366] = (-((-10251) & 31275)) & (-1025) & 24575;
        lIIIIlIIl[367] = (-29353) & 32765;
        lIIIIlIIl[368] = (-((-19905) & 20466)) & (-8193) & 11263;
        lIIIIlIIl[369] = (-((-15690) & 32587)) & (-8257) & 28647;
        lIIIIlIIl[370] = (-((-18483) & 27571)) & (-4099) & 16351;
        lIIIIlIIl[371] = (-20513) & 23998;
        lIIIIlIIl[372] = (-((-257) & 801)) & (-13317) & 16381;
        lIIIIlIIl[373] = (-((-7489) & 24401)) & (-4162) & 24569;
        lIIIIlIIl[374] = (-((-513) & 13871)) & (-2) & 15871;
        lIIIIlIIl[375] = (-((-2417) & 19313)) & (-4171) & 24543;
        lIIIIlIIl[376] = (-((-1041) & 29723)) & (-1) & 31195;
        lIIIIlIIl[377] = (-16899) & 20366;
        lIIIIlIIl[378] = (-((-11667) & 32723)) & (-8225) & 32761;
        lIIIIlIIl[379] = (-8705) & 11223;
        lIIIIlIIl[380] = (-((-1837) & 6077)) & (-16906) & 24575;
        lIIIIlIIl[381] = (-((-37) & 16573)) & (-12293) & 32255;
        lIIIIlIIl[382] = (-8331) & 11486;
        lIIIIlIIl[383] = (-5636) & 8183;
        lIIIIlIIl[384] = (-16386) & 25951;
        lIIIIlIIl[385] = (-((-13453) & 16014)) & (-20489) & 32623;
        lIIIIlIIl[386] = (-((-20513) & 21545)) & (-4609) & 8175;
        lIIIIlIIl[387] = (-((-12325) & 12847)) & (-12289) & 16383;
        lIIIIlIIl[388] = (-5123) & 7679;
        lIIIIlIIl[389] = (-137) & 3581;
        lIIIIlIIl[390] = (-((-19749) & 28463)) & (-16385) & 27631;
        lIIIIlIIl[391] = (-((-221) & 4575)) & (-137) & 14334;
        lIIIIlIIl[392] = (-((-20715) & 29947)) & (-20482) & 32255;
        lIIIIlIIl[393] = (-((-24595) & 31167)) & (-16385) & 32766;
        lIIIIlIIl[394] = (-513) & 3023;
        lIIIIlIIl[395] = (-20537) & 23999;
        lIIIIlIIl[396] = (-1475) & 4062;
        lIIIIlIIl[397] = (-16709) & 26596;
        lIIIIlIIl[398] = (-((-3143) & 32206)) & (-97) & 31727;
        lIIIIlIIl[399] = (-20755) & 30647;
        lIIIIlIIl[400] = (-8305) & 10867;
        lIIIIlIIl[401] = (-((-1251) & 24299)) & (-129) & 32766;
        lIIIIlIIl[402] = (-((-8233) & 26879)) & (-8705) & 27647;
        lIIIIlIIl[403] = (-22101) & 22399;
        lIIIIlIIl[404] = (-32260) & 32559;
        lIIIIlIIl[405] = (-((-20517) & 24295)) & (-4113) & 8191;
        lIIIIlIIl[406] = (-18769) & 28670;
        lIIIIlIIl[407] = (-((-6845) & 32509)) & (-513) & 28671;
        lIIIIlIIl[408] = (-((-3733) & 32405)) & (-515) & 32319;
        lIIIIlIIl[409] = (-8209) & 10710;
        lIIIIlIIl[410] = (-((-12341) & 13239)) & (-24582) & 28671;
        lIIIIlIIl[411] = (-17955) & 20463;
        lIIIIlIIl[412] = (-20482) & 23919;
        lIIIIlIIl[413] = (-16514) & 16815;
    }

    private static boolean llIlllIlIIl(Object obj) {
        return obj == null;
    }

    private static String llIlIllllll(String lIIlIIlIIIlllll, String lIIlIIlIIIllllI) {
        try {
            SecretKeySpec lIIlIIlIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIlIIIllllI.getBytes(StandardCharsets.UTF_8)), lIIIIlIIl[13]), "DES");
            Cipher lIIlIIlIIlIIIIl = Cipher.getInstance("DES");
            lIIlIIlIIlIIIIl.init(lIIIIlIIl[3], lIIlIIlIIlIIIlI);
            return new String(lIIlIIlIIlIIIIl.doFinal(Base64.getDecoder().decode(lIIlIIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIlIIlIIIII) {
            lIIlIIlIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static String llIllIIIIII(String lIIlIIlIlIIIIIl, String lIIlIIlIlIIIIII) {
        String lIIlIIlIlIIIIIl2 = new String(Base64.getDecoder().decode(lIIlIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIlIIlIIllllll = new StringBuilder();
        char[] lIIlIIlIIlllllI = lIIlIIlIlIIIIII.toCharArray();
        int lIIlIIlIIllllIl = lIIIIlIIl[0];
        char[] charArray = lIIlIIlIlIIIIIl2.toCharArray();
        int length = charArray.length;
        int i = lIIIIlIIl[0];
        while (llIlllIIIII(i, length)) {
            lIIlIIlIIllllll.append((char) (charArray[i] ^ lIIlIIlIIlllllI[lIIlIIlIIllllIl % lIIlIIlIIlllllI.length]));
            "".length();
            lIIlIIlIIllllIl++;
            i++;
            "".length();
            if (((12 ^ 65) ^ (111 ^ 38)) < 0) {
                return null;
            }
        }
        return String.valueOf(lIIlIIlIIllllll);
    }

    private static boolean llIlllIIIlI(int i, int i2) {
        return i > i2;
    }

    private static void llIllIlIIII() {
        lIIIIIlIl = new String[lIIIIlIIl[413]];
        lIIIIIlIl[lIIIIlIIl[0]] = llIlIlllllI("9y+LcfMRvFdh9ywQfkQPHw==", "OxUYL");
        lIIIIIlIl[lIIIIlIIl[1]] = llIlIlllllI("swweh8Yz2v/JIFWPzWxeQcxb9eR4JDIlcSkxUBFK2rCmq7/NK5+/8K9bbc+lf+ZOQcePAH87KDo=", "XcerK");
        lIIIIIlIl[lIIIIlIIl[3]] = llIlIllllll("DigJsB1khok=", "pDNkC");
        lIIIIIlIl[lIIIIlIIl[5]] = llIlIllllll("WpHyM6v36WI=", "HZzKb");
        lIIIIIlIl[lIIIIlIIl[6]] = llIlIlllllI("MBaNlmhKQiY=", "JkqZu");
        lIIIIIlIl[lIIIIlIIl[7]] = llIlIllllll("2Yd6VHo8LnM=", "gidOH");
        lIIIIIlIl[lIIIIlIIl[11]] = llIlIlllllI("BsHvG6nFgYELl2lxHE0SPa2YSocoTYn7", "Lawnp");
        lIIIIIlIl[lIIIIlIIl[9]] = llIllIIIIII("Ah4nJj4jCWIqNiMF", "MnBHW");
        lIIIIIlIl[lIIIIlIIl[13]] = llIlIllllll("kxzfXZBZuyrkXHuEMKqLlQAqA8wRfnmF", "CUInM");
        lIIIIIlIl[lIIIIlIIl[17]] = llIlIllllll("+Ln55E9NcyXswPPJPBoUcXg3PgZqM5lwQFoVUc6ohfzMvmH2vFZ8ncrW79+WCnIJWcSMOsu4XQo=", "DtuoS");
        lIIIIIlIl[lIIIIlIIl[19]] = llIlIlllllI("wIc5xhXXC8w=", "pixJM");
        lIIIIIlIl[lIIIIlIIl[21]] = llIlIllllll("eOh1OwZgzK8=", "ZFPVV");
        lIIIIIlIl[lIIIIlIIl[22]] = llIlIllllll("/XzZPHUOFiyJwE9ZIIU0L/yZ2Orz0yvDp68dSUg0FRfuDRxVBXdeLFWnjXf1cA+F", "YpTGA");
        lIIIIIlIl[lIIIIlIIl[23]] = llIlIlllllI("tjr+v306/YA=", "zzbLC");
        lIIIIIlIl[lIIIIlIIl[4]] = llIllIIIIII("NAorMAA=", "gbJBk");
        lIIIIIlIl[lIIIIlIIl[26]] = llIlIlllllI("2xu574YCEVY=", "UJSfi");
        lIIIIIlIl[lIIIIlIIl[27]] = llIlIllllll("UPcoYiMHymfR2V1X34AH/g==", "fpjyw");
        lIIIIIlIl[lIIIIlIIl[28]] = llIlIlllllI("Tzap+MQA8WH2+3l6Rc7hSA==", "urvaM");
        lIIIIIlIl[lIIIIlIIl[25]] = llIlIlllllI("MiDx9fVhBz+DnAvgOYm7NA==", "IXxmh");
        lIIIIIlIl[lIIIIlIIl[29]] = llIlIlllllI("NQ3h6kI3u9nrPxRGvwhfZw==", "EfyKR");
        lIIIIIlIl[lIIIIlIIl[30]] = llIllIIIIII("CAQOdAcpRRo7HC0GGScW", "FexTs");
        lIIIIIlIl[lIIIIlIIl[32]] = llIlIlllllI("rqX0taxwfC2YxvwNOxJrABTOT0gB+Qij", "KWtIN");
        lIIIIIlIl[lIIIIlIIl[33]] = llIlIlllllI("t48YHBkpXxNFh0UU1Q6fdfqN5vGw/SKf", "qbfYX");
        lIIIIIlIl[lIIIIlIIl[34]] = llIllIIIIII("AhUrBwk5", "QpJuj");
        lIIIIIlIl[lIIIIlIIl[35]] = llIlIllllll("BYj0+q076IAdWSfetGbY9V5GZsuZt2R9", "LueIP");
        lIIIIIlIl[lIIIIlIIl[37]] = llIlIllllll("0rSpyC6K1Rf9x0ONl6oavIAKFwCLeKlr", "wdVQH");
        lIIIIIlIl[lIIIIlIIl[38]] = llIllIIIIII("GDUHAxEkNw==", "JPfgx");
        lIIIIIlIl[lIIIIlIIl[39]] = llIlIllllll("v9hPbAax3f8=", "cqOVe");
        lIIIIIlIl[lIIIIlIIl[42]] = llIlIllllll("TPNBFsmNd2LHU9jlIDcIoQ==", "gMBVL");
        lIIIIIlIl[lIIIIlIIl[43]] = llIlIllllll("B4jelu3oH5U=", "jSvCo");
        lIIIIIlIl[lIIIIlIIl[44]] = llIlIlllllI("y2bjGTwXlf+USJ23csjNIA==", "IFGJU");
        lIIIIIlIl[lIIIIlIIl[45]] = llIlIllllll("R+8AK1qOaO4vxy4z/lPJi8073f6p820i", "HMwPN");
        lIIIIIlIl[lIIIIlIIl[46]] = llIllIIIIII("JR4FPA4CGB4=", "cqpRz");
        lIIIIIlIl[lIIIIlIIl[48]] = llIllIIIIII("OzUOOQdVPQgjCw==", "xYgTe");
        lIIIIIlIl[lIIIIlIIl[50]] = llIllIIIIII("AAImdy0BQzI4IQ==", "ncPWY");
        lIIIIIlIl[lIIIIlIIl[51]] = llIllIIIIII("PCEXOwgHLRguSww2Fz0O", "oDvIk");
        lIIIIIlIl[lIIIIlIIl[52]] = llIlIlllllI("RxbHIQ7v5K0=", "ZEmdH");
        lIIIIIlIl[lIIIIlIIl[54]] = llIlIlllllI("wFgRB/cjopEvQQBAcz3trQ==", "hhxlq");
        lIIIIIlIl[lIIIIlIIl[56]] = llIlIllllll("l8u+B9TJt5XLipXJCRmdlA==", "AsGPN");
        lIIIIIlIl[lIIIIlIIl[57]] = llIllIIIIII("JjgNGXYLIA8=", "ePlmV");
        lIIIIIlIl[lIIIIlIIl[58]] = llIllIIIIII("IjgacBEWPw0=", "cQhPc");
        lIIIIIlIl[lIIIIlIIl[59]] = llIllIIIIII("NQsWNRJQGBEvHw==", "pjdAz");
        lIIIIIlIl[lIIIIlIIl[60]] = llIlIllllll("ViWBE3Nmo5D+n5DDJMdfZYv36/5awa7I", "UvDBB");
        lIIIIIlIl[lIIIIlIIl[61]] = llIlIllllll("iLy8gKuVtT4=", "XFrui");
        lIIIIIlIl[lIIIIlIIl[62]] = llIlIllllll("E2fehHBB+vOFvj+U33fhCA==", "uKXOm");
        lIIIIIlIl[lIIIIlIIl[63]] = llIlIllllll("0HRKLt1K6MJ7grTfNCdx4g==", "vbjEA");
        lIIIIIlIl[lIIIIlIIl[64]] = llIlIllllll("5W2PsLHxBIxKbeWTYK9KxQ==", "cJcSe");
        lIIIIIlIl[lIIIIlIIl[67]] = llIlIlllllI("G4NFGFL2iJlGNq5q7B2lBg==", "aCbqW");
        lIIIIIlIl[lIIIIlIIl[68]] = llIllIIIIII("Py0pGAoZLW8ZQxksPQYGDA==", "xAHjc");
        lIIIIIlIl[lIIIIlIIl[69]] = llIlIllllll("R5q7axII/jJTmlqq7KzmfA==", "jqYUa");
        lIIIIIlIl[lIIIIlIIl[2]] = llIlIlllllI("R+jGKHfX1rMps4lCaL7WuQ==", "npzzE");
        lIIIIIlIl[lIIIIlIIl[71]] = llIllIIIIII("HjoNPw==", "QJhQr");
        lIIIIIlIl[lIIIIlIIl[73]] = llIlIllllll("sQr0af9NJCE=", "CapeU");
        lIIIIIlIl[lIIIIlIIl[74]] = llIlIlllllI("b1rYGhFWg9KUGn1CsRCL3A==", "rAiXR");
        lIIIIIlIl[lIIIIlIIl[75]] = llIllIIIIII("AD0EIysmPUIiYiY8ED0nMw==", "GQeQB");
        lIIIIIlIl[lIIIIlIIl[76]] = llIllIIIIII("DiE3Pj4oIXE/dzw/OA==", "IMVLW");
        lIIIIIlIl[lIIIIlIIl[77]] = llIlIllllll("xcWhxFDKzobaN5y75F3xOg==", "VuPms");
        lIIIIIlIl[lIIIIlIIl[78]] = llIllIIIIII("IRokAw==", "njAmd");
        lIIIIIlIl[lIIIIlIIl[79]] = llIlIllllll("R+obczXHEcQ=", "TTZSk");
        lIIIIIlIl[lIIIIlIIl[80]] = llIlIlllllI("cKGVbSEHzHnX/E5/IuRb/A==", "QQdXR");
        lIIIIIlIl[lIIIIlIIl[82]] = llIlIlllllI("lOxUVvgdpj1s/kCyzTgVBiDkOUEER3JI", "iXXWd");
        lIIIIIlIl[lIIIIlIIl[83]] = llIlIllllll("9kuWtgV4slTYHZfDAos47g==", "SoolP");
        lIIIIIlIl[lIIIIlIIl[84]] = llIlIllllll("TwXjX+MIA3GWhrvoUkC02Q==", "KTwQJ");
        lIIIIIlIl[lIIIIlIIl[85]] = llIlIlllllI("5EIP43RaL4E=", "WwpNz");
        lIIIIIlIl[lIIIIlIIl[86]] = llIlIlllllI("g3QQFtIXkN/VPU3ympaDRQ==", "CDNzb");
        lIIIIIlIl[lIIIIlIIl[10]] = llIlIlllllI("d6L5fBbwbs0hxxzeikbllQ==", "OHXRJ");
        lIIIIIlIl[lIIIIlIIl[87]] = llIllIIIIII("GQgQHRtuGxEWDA==", "Nidxi");
        lIIIIIlIl[lIIIIlIIl[88]] = llIlIllllll("cAZHt91zKn+9l+spuSRjzn5OgCMERCXv", "HlTYL");
        lIIIIIlIl[lIIIIlIIl[89]] = llIlIllllll("tPFPXiXxkeYx7+tpcH0w6w==", "pDiYo");
        lIIIIIlIl[lIIIIlIIl[90]] = llIlIllllll("7C4nvOaGEt5deSk22W641Q==", "OnFRE");
        lIIIIIlIl[lIIIIlIIl[91]] = llIlIllllll("urQHaHca8eQ=", "FlXXH");
        lIIIIIlIl[lIIIIlIIl[92]] = llIllIIIIII("NgcZcB8CAA4=", "wnkPm");
        lIIIIIlIl[lIIIIlIIl[93]] = llIllIIIIII("MQsdGhFUGBoAHA==", "tjony");
        lIIIIIlIl[lIIIIlIIl[94]] = llIllIIIIII("BCMHFiJzMAYdNQ==", "SBssP");
        lIIIIIlIl[lIIIIlIIl[95]] = llIllIIIIII("DTgTNwcrOFU2Tis5BykLPg==", "JTrEn");
        lIIIIIlIl[lIIIIlIIl[96]] = llIllIIIIII("ATYWFDMnNlAVejMoGQ==", "FZwfZ");
        lIIIIIlIl[lIIIIlIIl[97]] = llIllIIIIII("DDUhFxgtImQbEC0u", "CEDyq");
        lIIIIIlIl[lIIIIlIIl[98]] = llIlIllllll("7PmWOcwtEObteHUn/W8eyGKbPI+UvCQG", "QRnbL");
        lIIIIIlIl[lIIIIlIIl[99]] = llIlIllllll("4hmuni/eZyU=", "dzzzz");
        lIIIIIlIl[lIIIIlIIl[100]] = llIlIllllll("gcercBXBu10=", "sDufp");
        lIIIIIlIl[lIIIIlIIl[101]] = llIlIlllllI("OzykznRNG70BkeLBf2DmaQ==", "zrNLj");
        lIIIIIlIl[lIIIIlIIl[102]] = llIlIllllll("AztHx5cCeBzmZLa3/qvFHg==", "cvcZH");
        lIIIIIlIl[lIIIIlIIl[103]] = llIlIlllllI("6qE5+Bl6dWv+diVW9bNdog==", "uXJhK");
        lIIIIIlIl[lIIIIlIIl[104]] = llIlIllllll("FDC1yW3HMQET9S5tEWLSTg==", "kernl");
        lIIIIIlIl[lIIIIlIIl[105]] = llIlIllllll("bve9BHIjRp7BrfR5PcvQhg==", "zxBkf");
        lIIIIIlIl[lIIIIlIIl[106]] = llIllIIIIII("IAc6HBhFFD0GFQ==", "efHhp");
        lIIIIIlIl[lIIIIlIIl[107]] = llIlIllllll("H9FjhcFi+jschPJJy1EPKQ==", "cStxC");
        lIIIIIlIl[lIIIIlIIl[108]] = llIlIlllllI("1s7IQl6+UiAjA0X75CjpXw==", "zokMD");
        lIIIIIlIl[lIIIIlIIl[109]] = llIllIIIIII("DQgIDThoGw8XNQ==", "HizyP");
        lIIIIIlIl[lIIIIlIIl[110]] = llIlIllllll("yrx7yB/C5a66SvXkdQx7fw==", "eWtXD");
        lIIIIIlIl[lIIIIlIIl[111]] = llIlIlllllI("bMgedk6+xfT8DlN8+qdNlA==", "YFHsA");
        lIIIIIlIl[lIIIIlIIl[112]] = llIllIIIIII("IRQnHypWByYUPQ==", "vuSzX");
        lIIIIIlIl[lIIIIlIIl[113]] = llIlIlllllI("sCzy2eQ/56O3Fpqerxwifg==", "wmcGj");
        lIIIIIlIl[lIIIIlIIl[114]] = llIlIlllllI("0WA0pCUEpdtsUFcZint/tg==", "PlQsb");
        lIIIIIlIl[lIIIIlIIl[115]] = llIlIlllllI("GkQ33Ujl+dP7IVxH72C1fw==", "xskyM");
        lIIIIIlIl[lIIIIlIIl[116]] = llIlIllllll("sfMrS5dDCg14eXpGoESM6g==", "fYdjT");
        lIIIIIlIl[lIIIIlIIl[117]] = llIlIllllll("w2kdxrc1ofyFWLY8A+mMDw==", "CgZIb");
        lIIIIIlIl[lIIIIlIIl[118]] = llIllIIIIII("DzQTAgRqJxQYCQ==", "JUavl");
        lIIIIIlIl[lIIIIlIIl[119]] = llIlIllllll("/BHClaPqFsqXZT4T8GUh0Q==", "oewqD");
        lIIIIIlIl[lIIIIlIIl[120]] = llIlIlllllI("Qvfqq7wPgqPy94WKoHeWww==", "bgBhC");
        lIIIIIlIl[lIIIIlIIl[121]] = llIlIllllll("kDgnKKffN0IwLUxmDjoZ3g==", "dDXii");
        lIIIIIlIl[lIIIIlIIl[122]] = llIlIllllll("eFr56pBKvA/tkVwfSN8a9c16H0lxDZ7q", "abJgk");
        lIIIIIlIl[lIIIIlIIl[123]] = llIlIllllll("RBxX8riGhhRq968vHdePuQ==", "qUGSq");
        lIIIIIlIl[lIIIIlIIl[124]] = llIlIllllll("TBidjzAYIb1llPisdIuCGvUw4mzgvbG/", "xvEvE");
        lIIIIIlIl[lIIIIlIIl[125]] = llIllIIIIII("PBUZNw==", "nziRZ");
        lIIIIIlIl[lIIIIlIIl[126]] = llIlIlllllI("NSFeMSlXKpM=", "lGZUV");
        lIIIIIlIl[lIIIIlIIl[127]] = llIlIlllllI("rViNwt3rXCAdoKFKH/gI7A==", "LEcCg");
        lIIIIIlIl[lIIIIlIIl[129]] = llIlIllllll("FFoq+3W9/P4=", "AJWUZ");
        lIIIIIlIl[lIIIIlIIl[131]] = llIllIIIIII("MA0IJgEFQgw9Cgc=", "bbxOo");
        lIIIIIlIl[lIIIIlIIl[132]] = llIlIllllll("hDOfPhHFdqk=", "aSRnx");
        lIIIIIlIl[lIIIIlIIl[133]] = llIllIIIIII("ACs+LhEsKy1rByoqOA==", "EEJKc");
        lIIIIIlIl[lIIIIlIIl[134]] = llIllIIIIII("AygfGA==", "LXzvi");
        lIIIIIlIl[lIIIIlIIl[135]] = llIlIlllllI("sXO45rW+vPRiXFBftRytAg==", "chHCt");
        lIIIIIlIl[lIIIIlIIl[136]] = llIlIllllll("SnB+VDXu1+U1v4jtZ9kg9w==", "JJEfi");
        lIIIIIlIl[lIIIIlIIl[137]] = llIlIlllllI("GQAKXcokwcc992goEur/jg==", "AmBQq");
        lIIIIIlIl[lIIIIlIIl[138]] = llIllIIIIII("Jw8YAQpCHB8bBw==", "bnjub");
        lIIIIIlIl[lIIIIlIIl[139]] = llIlIlllllI("m5JbxGk5tjyFmoM8DFkQyQ==", "enHkS");
        lIIIIIlIl[lIIIIlIIl[140]] = llIlIllllll("+1PFOh6FfXECuoO1nSn5Jg==", "cDEOP");
        lIIIIIlIl[lIIIIlIIl[141]] = llIllIIIIII("FgIHJyAwAkEmaTADEzksJQ==", "QnfUI");
        lIIIIIlIl[lIIIIlIIl[142]] = llIllIIIIII("DSE0OicrIXI7bj8/Ow==", "JMUHN");
        lIIIIIlIl[lIIIIlIIl[144]] = llIlIlllllI("K/H8czRSgkFn1uRM/eHcL6hd7tN9IAGJ", "fSrxB");
        lIIIIIlIl[lIIIIlIIl[146]] = llIlIlllllI("RA0wVaLrv6A=", "dcWMJ");
        lIIIIIlIl[lIIIIlIIl[147]] = llIllIIIIII("LCwLWhUYKxw=", "mEyzg");
        lIIIIIlIl[lIIIIlIIl[148]] = llIlIlllllI("FJvTKFBTPvvULWEmIX0V/w==", "TRBbF");
        lIIIIIlIl[lIIIIlIIl[149]] = llIlIlllllI("xb4D+hFgLmSPac9JuMnnBg==", "WTAEW");
        lIIIIIlIl[lIIIIlIIl[150]] = llIlIllllll("nqsx1fThqwyvFnO07NZxlw==", "DfxBa");
        lIIIIIlIl[lIIIIlIIl[151]] = llIlIllllll("gYD2hA1hXBAaBZcrRqbuQQ==", "RKKrV");
        lIIIIIlIl[lIIIIlIIl[152]] = llIlIlllllI("wiuKITt1Eqw7IdV8ZNM76g==", "iJcni");
        lIIIIIlIl[lIIIIlIIl[153]] = llIllIIIIII("CSoNBSsvKksEYi8rGRsnOg==", "NFlwB");
        lIIIIIlIl[lIIIIlIIl[154]] = llIlIllllll("A/WvyOIsEskMEu0RRHEvqw==", "ZwcOj");
        lIIIIIlIl[lIIIIlIIl[155]] = llIllIIIIII("ChQlRDArVT8FNzBVIQsrKQ==", "DuSdD");
        lIIIIIlIl[lIIIIlIIl[156]] = llIlIllllll("as4Wv6l4z+vc0MGShbPwSQ==", "NQArF");
        lIIIIIlIl[lIIIIlIIl[157]] = llIlIllllll("GiF4SqW/RUQdIsgkN86DKw==", "IBblC");
        lIIIIIlIl[lIIIIlIIl[158]] = llIlIlllllI("ZGtOqwsDE0KMND5L/Firnw==", "QBILm");
        lIIIIIlIl[lIIIIlIIl[159]] = llIlIllllll("kQk2pSWqfK3KbN3jZxtU5w==", "nptas");
        lIIIIIlIl[lIIIIlIIl[160]] = llIlIllllll("udUxNYjGnxsMXvsUBNbXrw==", "OBVhV");
        lIIIIIlIl[lIIIIlIIl[161]] = llIllIIIIII("EiQ1AjVlNzQJIg==", "EEAgG");
        lIIIIIlIl[lIIIIlIIl[162]] = llIlIlllllI("8SJ3HcD6zKh3geN7N5yOT8AWtSh6AxdK", "NnDTB");
        lIIIIIlIl[lIIIIlIIl[163]] = llIlIlllllI("eKn/jtKxo5EankbjTEpp8A==", "oqzAA");
        lIIIIIlIl[lIIIIlIIl[164]] = llIllIIIIII("ByMpAg==", "CLFpm");
        lIIIIIlIl[lIIIIlIIl[166]] = llIlIlllllI("IFcGm1A6du3Xg4iESsB3Qw==", "CAmJC");
        lIIIIIlIl[lIIIIlIIl[167]] = llIlIllllll("HTN52/P+xlupKSkGEJLAmw==", "PVmyU");
        lIIIIIlIl[lIIIIlIIl[168]] = llIllIIIIII("ACgLGBxlOwwCEQ==", "EIylt");
        lIIIIIlIl[lIIIIlIIl[169]] = llIlIllllll("lF0w4l8hnKiUf/v99o7+GA==", "kvLfK");
        lIIIIIlIl[lIIIIlIIl[170]] = llIlIlllllI("QaFpEvDXGe2RQHt0DXjrfQ==", "WZRob");
        lIIIIIlIl[lIIIIlIIl[171]] = llIllIIIIII("BSYkNR5yNSU+CQ==", "RGPPl");
        lIIIIIlIl[lIIIIlIIl[172]] = llIlIlllllI("FuAgPFytBNICItNAAVLaxriYj8M1eeDY", "NjfAc");
        lIIIIIlIl[lIIIIlIIl[173]] = llIlIlllllI("p+Ay6j6YiGkagdnYyfUD6g==", "OcMtt");
        lIIIIIlIl[lIIIIlIIl[174]] = llIlIllllll("nf1DmUsjcdY=", "RPSWk");
        lIIIIIlIl[lIIIIlIIl[175]] = llIlIllllll("bC8RsGLm1sk=", "eibyS");
        lIIIIIlIl[lIIIIlIIl[176]] = llIlIllllll("LNDA10bdDRsL6aWq5PfcwA==", "EdsXE");
        lIIIIIlIl[lIIIIlIIl[177]] = llIlIlllllI("SuPlRpYvBjpmAfUO1+k98g==", "hGgoj");
        lIIIIIlIl[lIIIIlIIl[178]] = llIlIlllllI("mpL1Le1rpcIe6aejtmycVg==", "gsBpw");
        lIIIIIlIl[lIIIIlIIl[179]] = llIlIlllllI("jMvG0hDEiJ24adRU/vvQyg==", "HkTEk");
        lIIIIIlIl[lIIIIlIIl[180]] = llIlIllllll("/m9kmwfLXsilkkMZdS6iEQ==", "wVdnW");
        lIIIIIlIl[lIIIIlIIl[181]] = llIllIIIIII("MjMHKxlFIAYgDg==", "eRsNk");
        lIIIIIlIl[lIIIIlIIl[182]] = llIlIlllllI("H/eic3T4quH6km83ALXVAcc4VcE9bFu0", "aCfJz");
        lIIIIIlIl[lIIIIlIIl[183]] = llIllIIIIII("EzYREQE1NlcQSCEoHg==", "TZpch");
        lIIIIIlIl[lIIIIlIIl[184]] = llIllIIIIII("HgcsWR8/Rgk8SwAPNhUKIg==", "PfZyk");
        lIIIIIlIl[lIIIIlIIl[185]] = llIllIIIIII("BiAgehkyJzc=", "GIRZk");
        lIIIIIlIl[lIIIIlIIl[186]] = llIlIllllll("ELtJiMu8NZCtUIaoy8D+JQ==", "CowKJ");
        lIIIIIlIl[lIIIIlIIl[187]] = llIlIllllll("r27AMSMfOyStfRHlPkyOoA==", "TNvMv");
        lIIIIIlIl[lIIIIlIIl[188]] = llIlIlllllI("YcaXskq+6rC/c9RTG5Leww==", "kjTwL");
        lIIIIIlIl[lIIIIlIIl[189]] = llIlIlllllI("sZENRVc/GdzXVBdRXT6fcg==", "JhpIM");
        lIIIIIlIl[lIIIIlIIl[190]] = llIllIIIIII("JDcZPQVTJBg2Eg==", "sVmXw");
        lIIIIIlIl[lIIIIlIIl[191]] = llIlIlllllI("eBBbU0koVr0jzafo+GB7ZJG2o638bt6Z", "zZIIv");
        lIIIIIlIl[lIIIIlIIl[192]] = llIllIIIIII("NCc2GQ8SJ3AYRgY5OQ==", "sKWkf");
        lIIIIIlIl[lIIIIlIIl[193]] = llIlIlllllI("Ql/LmfQ5v11l6gVwPpwU3A==", "QGnae");
        lIIIIIlIl[lIIIIlIIl[194]] = llIlIllllll("WQV2F6YIGvcx+xb9K5tjOw==", "ziRAe");
        lIIIIIlIl[lIIIIlIIl[195]] = llIllIIIIII("BQgDUysxDxQ=", "DaqsY");
        lIIIIIlIl[lIIIIlIIl[196]] = llIlIllllll("yMeKhEFiXmg3E6HpI8Bx8w==", "xaWzv");
        lIIIIIlIl[lIIIIlIIl[197]] = llIlIllllll("DMM3XcBA6h5rplDl59tMIw==", "CnemN");
        lIIIIIlIl[lIIIIlIIl[198]] = llIlIllllll("7laOeqibd933WUkFdZtO3A==", "LQsVc");
        lIIIIIlIl[lIIIIlIIl[199]] = llIlIllllll("TtcZy/XkeuHT+TnwTYgc1w==", "YXHDE");
        lIIIIIlIl[lIIIIlIIl[201]] = llIllIIIIII("EgwjZBQmCzQ=", "SeQDf");
        lIIIIIlIl[lIIIIlIIl[202]] = llIlIlllllI("Bcj1w4hFA7B9mYxJfEkeTg==", "nCDNz");
        lIIIIIlIl[lIIIIlIIl[203]] = llIlIlllllI("fRLCNZ8+GUD8LFmHA/tQvw==", "GFAju");
        lIIIIIlIl[lIIIIlIIl[204]] = llIlIlllllI("v/TjSsCwvJbr2cvGP7GDFg==", "rXIks");
        lIIIIIlIl[lIIIIlIIl[205]] = llIlIllllll("u7CqpOTccwkGqqgylGYz+Q==", "mPdFW");
        lIIIIIlIl[lIIIIlIIl[206]] = llIllIIIIII("HCABMBp5MwYqFw==", "YAsDr");
        lIIIIIlIl[lIIIIlIIl[207]] = llIlIllllll("oQSeKS8lKTiXmOOb3dS2zw==", "sENQx");
        lIIIIIlIl[lIIIIlIIl[208]] = llIlIllllll("usRsCfODd86kjTWCsm/4IQ==", "MSIPt");
        lIIIIIlIl[lIIIIlIIl[209]] = llIlIlllllI("/o24/QSZDZbBaa8QsX8fPA==", "veYAe");
        lIIIIIlIl[lIIIIlIIl[210]] = llIllIIIIII("Hj47JDE4Pn0leDg/Lzo9LQ==", "YRZVX");
        lIIIIIlIl[lIIIIlIIl[211]] = llIllIIIIII("HTYIFg87Nk4XRi8oBw==", "ZZidf");
        lIIIIIlIl[lIIIIlIIl[212]] = llIllIIIIII("FB4GKCthHxooKTI=", "AmoFL");
        lIIIIIlIl[lIIIIlIIl[213]] = llIlIllllll("8VBYXllJ/6Of30zTtBUGcA==", "fBCWu");
        lIIIIIlIl[lIIIIlIIl[214]] = llIllIIIIII("FDAXUiMgNwA=", "UYerQ");
        lIIIIIlIl[lIIIIlIIl[215]] = llIlIlllllI("gie73xp3YtP7yzTkJxwKig==", "eDCDq");
        lIIIIIlIl[lIIIIlIIl[216]] = llIllIIIIII("LQQIMAFIFw8qDA==", "hezDi");
        lIIIIIlIl[lIIIIlIIl[217]] = llIllIIIIII("GyASPz9sMxM0KA==", "LAfZM");
        lIIIIIlIl[lIIIIlIIl[218]] = llIllIIIIII("IgYgLBlVFSEnDg==", "ugTIk");
        lIIIIIlIl[lIIIIlIIl[219]] = llIlIllllll("+ZvT4LgOyzk5ZjqkhMFLMg==", "BWwzM");
        lIIIIIlIl[lIIIIlIIl[220]] = llIlIllllll("lpwJ2SQYAX8v3LO9o4BipQ==", "zqBmQ");
        lIIIIIlIl[lIIIIlIIl[221]] = llIllIIIIII("NBE8CxhDAj0ADw==", "cpHnj");
        lIIIIIlIl[lIIIIlIIl[222]] = llIlIlllllI("dCN7cb4DaOoVZw2g2qQFSw==", "fIzwh");
        lIIIIIlIl[lIIIIlIIl[223]] = llIlIllllll("NYxmSA3yu4EWq0TEvlTlkQ==", "HxuZO");
        lIIIIIlIl[lIIIIlIIl[224]] = llIlIllllll("z3LKBYLAZXNRCGuArKLQ2A==", "sCIdh");
        lIIIIIlIl[lIIIIlIIl[225]] = llIllIIIIII("CSsbPgdsOBwkCg==", "LJiJo");
        lIIIIIlIl[lIIIIlIIl[226]] = llIlIllllll("1hCJk99a0XaBYZxTdAV8+w==", "maEJT");
        lIIIIIlIl[lIIIIlIIl[227]] = llIllIIIIII("GzQkKAVsJyUjEg==", "LUPMw");
        lIIIIIlIl[lIIIIlIIl[228]] = llIlIlllllI("bh507ViMAP3QnHB4kIE1mREiq4RfVS96", "ttJav");
        lIIIIIlIl[lIIIIlIIl[229]] = llIllIIIIII("JDg3JQwCOHEkRRYmOA==", "cTVWe");
        lIIIIIlIl[lIIIIlIIl[230]] = llIllIIIIII("Gjg7CyBvOScLIjw=", "OKReG");
        lIIIIIlIl[lIIIIlIIl[231]] = llIlIlllllI("P3i/FbANb0yy+OC9V8Fb/g==", "RfweB");
        lIIIIIlIl[lIIIIlIIl[232]] = llIlIlllllI("12QAnzJK9JRR8pevlHhVrw==", "XhbNe");
        lIIIIIlIl[lIIIIlIIl[233]] = llIllIIIIII("KA86LQZNHD03Cw==", "mnHYn");
        lIIIIIlIl[lIIIIlIIl[234]] = llIllIIIIII("MSQ+GQVUNzkDCA==", "tELmm");
        lIIIIIlIl[lIIIIlIIl[235]] = llIllIIIIII("LQ07CyFaHjoANg==", "zlOnS");
        lIIIIIlIl[lIIIIlIIl[236]] = llIllIIIIII("IionMTxVOSY6Kw==", "uKSTN");
        lIIIIIlIl[lIIIIlIIl[237]] = llIlIllllll("2XIEIxBQdj/Kgf9RFL/+Ig==", "KHAfq");
        lIIIIIlIl[lIIIIlIIl[238]] = llIlIlllllI("SzgAxzAqobyKfYi6cI6rdg==", "IjOiE");
        lIIIIIlIl[lIIIIlIIl[239]] = llIllIIIIII("BREZJz1yAhgsKg==", "RpmBO");
        lIIIIIlIl[lIIIIlIIl[240]] = llIlIlllllI("RzBFMqyTZcQZWHcojf+PVw==", "FUcsT");
        lIIIIIlIl[lIIIIlIIl[241]] = llIlIlllllI("sD0Sm6pTo4V9TYZHRvQMgg==", "TuhJm");
        lIIIIIlIl[lIIIIlIIl[242]] = llIllIIIIII("Chk3HQ1vCjAHAA==", "OxEie");
        lIIIIIlIl[lIIIIlIIl[243]] = llIllIIIIII("PQYGECxYFQEKIQ==", "xgtdD");
        lIIIIIlIl[lIIIIlIIl[244]] = llIlIlllllI("YZ9rHAcPzLoT3/QjwYyuiw==", "TKKeE");
        lIIIIIlIl[lIIIIlIIl[245]] = llIlIllllll("GAzyeHfH2/082KLnw6XBTw==", "HWMXJ");
        lIIIIIlIl[lIIIIlIIl[246]] = llIllIIIIII("IAIXEz4GAlESdwYDAw0yEw==", "gnvaW");
        lIIIIIlIl[lIIIIlIIl[247]] = llIlIllllll("Pn8A8aWx9EuC7+EstOFU8w==", "OILcP");
        lIIIIIlIl[lIIIIlIIl[248]] = llIllIIIIII("AR8rJTZ0HjclNCc=", "TlBKQ");
        lIIIIIlIl[lIIIIlIIl[249]] = llIllIIIIII("FAQUSRUgAwM=", "Umfig");
        lIIIIIlIl[lIIIIlIIl[250]] = llIlIllllll("+Z86j+1hSTg/n+Y3XwNKpQ==", "ztDkt");
        lIIIIIlIl[lIIIIlIIl[251]] = llIlIllllll("sGT0aqxcr3POcMRsmb4X8Q==", "veMut");
        lIIIIIlIl[lIIIIlIIl[252]] = llIlIlllllI("n3rgl2/kP2ZOsnfJmgoahA==", "ymQkB");
        lIIIIIlIl[lIIIIlIIl[8]] = llIlIllllll("90RMh3Nv3/1eQVP3nyinCg==", "phKbz");
        lIIIIIlIl[lIIIIlIIl[253]] = llIlIllllll("mlx+7D+cuKrtlrMKlGE52g==", "hYeyG");
        lIIIIIlIl[lIIIIlIIl[254]] = llIlIlllllI("k85VK/eBCeDq+TSNL06wRg==", "yaeEX");
        lIIIIIlIl[lIIIIlIIl[255]] = llIllIIIIII("CjMoFhxvIC8MEQ==", "ORZbt");
        lIIIIIlIl[lIIIIlIIl[256]] = llIllIIIIII("EzAVLDxkIxQnKw==", "DQaIN");
        lIIIIIlIl[lIIIIlIIl[257]] = llIllIIIIII("JBE0YzkQFiM=", "exFCK");
        lIIIIIlIl[lIIIIlIIl[258]] = llIlIllllll("NzWiDCM9vKkSZyA5mOgfyg==", "rlWqC");
        lIIIIIlIl[lIIIIlIIl[259]] = llIlIllllll("WeOcBSuliSNMlKyVbzAm2w==", "nzMCn");
        lIIIIIlIl[lIIIIlIIl[260]] = llIllIIIIII("LiUVJBBLNhI+HQ==", "kDgPx");
        lIIIIIlIl[lIIIIlIIl[261]] = llIlIllllll("GyzC9MeCLxAVNbT5Rjm19g==", "PUhWC");
        lIIIIIlIl[lIIIIlIIl[262]] = llIlIlllllI("REI8ap7tOb0eMtbQ0kyWqw==", "oLJgP");
        lIIIIIlIl[lIIIIlIIl[263]] = llIlIllllll("MQEZ1hYDJkX5NdjRl+htEuqQ2/C+P4hw", "FawCI");
        lIIIIIlIl[lIIIIlIIl[264]] = llIlIllllll("namHN6B196jdbkNPdLYDFg==", "VCOpP");
        lIIIIIlIl[lIIIIlIIl[265]] = llIlIllllll("DBzgLL8eONGjVhONMJtjTg==", "GNsaF");
        lIIIIIlIl[lIIIIlIIl[266]] = llIlIllllll("y8JJsfh1V7vSjt94DV5jPQ==", "baWuJ");
        lIIIIIlIl[lIIIIlIIl[267]] = llIllIIIIII("LDggYioYPzc=", "mQRBX");
        lIIIIIlIl[lIIIIlIIl[268]] = llIlIllllll("m6w/NV7QoqzHEEpfc//phA==", "NgUsj");
        lIIIIIlIl[lIIIIlIIl[269]] = llIlIlllllI("s7i9RLtvTP8VTs26P3OZIQ==", "oVDMG");
        lIIIIIlIl[lIIIIlIIl[270]] = llIlIllllll("HxoKPiOa1V98UQ3A/YTtyw==", "EUevT");
        lIIIIIlIl[lIIIIlIIl[271]] = llIlIlllllI("Smo/saRlhwGfk8y3BrpMMA==", "SaHgS");
        lIIIIIlIl[lIIIIlIIl[272]] = llIllIIIIII("LQwdaCgZCwo=", "leoHZ");
        lIIIIIlIl[lIIIIlIIl[273]] = llIllIIIIII("OTAQeSENNwc=", "xYbYS");
        lIIIIIlIl[lIIIIlIIl[274]] = llIlIllllll("mkWY+W2vTTSUrkW7Mr2Byw==", "bMIec");
        lIIIIIlIl[lIIIIlIIl[275]] = llIllIIIIII("LTA0Py1IIzMlIA==", "hQFKE");
        lIIIIIlIl[lIIIIlIIl[276]] = llIllIIIIII("BCYQNBtzNRE/DA==", "SGdQi");
        lIIIIIlIl[lIIIIlIIl[277]] = llIlIllllll("xF07iHdxEkrd1wsOiG7xLg==", "afTeW");
        lIIIIIlIl[lIIIIlIIl[278]] = llIllIIIIII("KTsjQygdPDQ=", "hRQcZ");
        lIIIIIlIl[lIIIIlIIl[279]] = llIllIIIIII("KBg1czEcHyI=", "iqGSC");
        lIIIIIlIl[lIIIIlIIl[280]] = llIlIlllllI("OkUKI1Wua+T04Mh4mznh2g==", "RLGEO");
        lIIIIIlIl[lIIIIlIIl[281]] = llIlIllllll("/1OssNLlV6L+e6HxC+TCcA==", "MXsuH");
        lIIIIIlIl[lIIIIlIIl[282]] = llIlIllllll("Jc73rvxFmA8LkCAOswJnGw==", "gtwWg");
        lIIIIIlIl[lIIIIlIIl[283]] = llIllIIIIII("PDsjExdLKCIYAA==", "kZWve");
        lIIIIIlIl[lIIIIlIIl[284]] = llIlIlllllI("61h9f4413iXY5Z8EC+EsirbgsZBtYg4O", "HkUyL");
        lIIIIIlIl[lIIIIlIIl[285]] = llIlIlllllI("JXwQB4gg81kMGjsmi6KoLQ==", "SSWtX");
        lIIIIIlIl[lIIIIlIIl[286]] = llIlIlllllI("zyEljFZPkaO/2ErU5eeRww==", "GsPMf");
        lIIIIIlIl[lIIIIlIIl[287]] = llIllIIIIII("EgsDbxwmDBQ=", "SbqOn");
        lIIIIIlIl[lIIIIlIIl[288]] = llIlIllllll("BSoiCXXh1YWPph2gPy/edg==", "tZxJS");
        lIIIIIlIl[lIIIIlIIl[289]] = llIlIlllllI("3sMc5ELexhvXq+ROyoNHew==", "ECIeE");
        lIIIIIlIl[lIIIIlIIl[290]] = llIlIlllllI("R3a5HXwdypKosqMGq+VwnQ==", "JVdHX");
        lIIIIIlIl[lIIIIlIIl[291]] = llIllIIIIII("Gi8mLRltPCcmDg==", "MNRHk");
        lIIIIIlIl[lIIIIlIIl[292]] = llIlIllllll("1C4XrnSt4sPNYmbVXZ/6cg==", "jOMMV");
        lIIIIIlIl[lIIIIlIIl[293]] = llIlIllllll("87S3NUM9F5KoXQb4/WZFYw==", "gYLvw");
        lIIIIIlIl[lIIIIlIIl[294]] = llIlIllllll("Ef5H+imibLv2eI5qNoJNgg==", "gCHPb");
        lIIIIIlIl[lIIIIlIIl[295]] = llIlIllllll("ARzl4jUKWmGpu9YHeZ+Ztw==", "yszhN");
        lIIIIIlIl[lIIIIlIIl[296]] = llIlIllllll("NfQjJu96VxNLawb7XHnIzg==", "mbyNV");
        lIIIIIlIl[lIIIIlIIl[297]] = llIlIlllllI("KQ5GcQjQOGGCKWKKByPqxg==", "NlUSY");
        lIIIIIlIl[lIIIIlIIl[298]] = llIlIlllllI("6gQGx9uqz+h7JqVmyi2nGg==", "wwrRd");
        lIIIIIlIl[lIIIIlIIl[299]] = llIllIIIIII("GQc2bxwtACE=", "XnDOn");
        lIIIIIlIl[lIIIIlIIl[300]] = llIlIllllll("LPd1SV9rORP5LFFPcJDsKA==", "rWRXi");
        lIIIIIlIl[lIIIIlIIl[301]] = llIllIIIIII("Liw7HCVZPzoXMg==", "yMOyW");
        lIIIIIlIl[lIIIIlIIl[302]] = llIllIIIIII("HiYTFwAgNEcNDC04RwwHbiATAh07Ng==", "NSgci");
        lIIIIIlIl[lIIIIlIIl[305]] = llIlIllllll("6021wybSIBvfsgqU4dw2EsC2yrT7RrgN", "exxrk");
        lIIIIIlIl[lIIIIlIIl[308]] = llIlIllllll("5mHoFSD8kWQ=", "EElxd");
        lIIIIIlIl[lIIIIlIIl[309]] = llIlIlllllI("TIdKLS34YCKzHnQWMSdC8jWZDUN0HC71", "DATTy");
        lIIIIIlIl[lIIIIlIIl[310]] = llIlIllllll("N3W3pUgiQlE=", "YquIK");
        lIIIIIlIl[lIIIIlIIl[311]] = llIlIlllllI("OoWEXZdTVuc9kaomk19fKJuBmp1ho80g", "cSiKa");
        lIIIIIlIl[lIIIIlIIl[312]] = llIlIlllllI("iq+N91xIHQQ=", "tXsTR");
        lIIIIIlIl[lIIIIlIIl[313]] = llIlIllllll("GUn/9dMisJ0SDelQzPz9Ig==", "uIzfO");
        lIIIIIlIl[lIIIIlIIl[314]] = llIllIIIIII("KDwyLA==", "zSBIV");
        lIIIIIlIl[lIIIIlIIl[325]] = llIllIIIIII("FQ0GNwckDR4+VTMZFyEB", "BlrRu");
        lIIIIIlIl[lIIIIlIIl[326]] = llIllIIIIII("Ih0nHWQ/EmkNITEYPRJkeA==", "PtIzD");
        lIIIIIlIl[lIIIIlIIl[327]] = llIlIllllll("rKMBPquL4dTnKPoeoi2+0g==", "WqwBS");
        lIIIIIlIl[lIIIIlIIl[328]] = llIllIIIIII("BBQ8Mz0=", "CuQVN");
        lIIIIIlIl[lIIIIlIIl[329]] = llIlIlllllI("wQJlpeN17dQ=", "JleGO");
        lIIIIIlIl[lIIIIlIIl[330]] = llIlIllllll("BMT9+1gZxUg=", "iSZKB");
        lIIIIIlIl[lIIIIlIIl[331]] = llIllIIIIII("HRgUBj0XCg==", "ymqjT");
        lIIIIIlIl[lIIIIlIIl[332]] = llIlIlllllI("b1Xf2l4ZdgQ=", "pDLzx");
        lIIIIIlIl[lIIIIlIIl[40]] = llIlIlllllI("GKjxKEy/DQA=", "wItKk");
        lIIIIIlIl[lIIIIlIIl[41]] = llIllIIIIII("FC0WHBwePw==", "pXspu");
        lIIIIIlIl[lIIIIlIIl[304]] = llIllIIIIII("LD8EJQYmLQ==", "HJaIo");
        lIIIIIlIl[lIIIIlIIl[307]] = llIlIllllll("IpuH+FP2d1aYYTUIfpau+A==", "vNWfQ");
        lIIIIIlIl[lIIIIlIIl[402]] = llIllIIIIII("Al4ccw0nDhAqH2sRECMcMlkFPEwjHB0jTCpZEjwDIFkYPUwvEAInHi4KAn0=", "KyqSl");
        lIIIIIlIl[lIIIIlIIl[143]] = llIlIlllllI("gnsLUi+Q+pA=", "wGoXl");
        lIIIIIlIl[lIIIIlIIl[403]] = llIllIIIIII("MyAONwsR", "tObEb");
        lIIIIIlIl[lIIIIlIIl[404]] = llIlIllllll("UUM8QIO28+E=", "xqmck");
        lIIIIIlIl[lIIIIlIIl[405]] = llIlIllllll("EYzpiFw7TRI=", "FJbeF");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0395, code lost:
        if (llIlllIIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.F.lIIIIlIIl[19]) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[lIIIIlIIl[1]];
        iArr3[lIIIIlIIl[0]] = lIIIIlIIl[20];
        if (llIlllIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlIIl[20], lIIIIlIIl[44], lIIIIlIIl[315]));
            "".length();
        }
        int[] iArr4 = new int[lIIIIlIIl[1]];
        iArr4[lIIIIlIIl[0]] = lIIIIlIIl[316];
        if (llIlllIIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlIIl[316], lIIIIlIIl[7], C0008i.bq));
            "".length();
        }
        int[] iArr5 = new int[lIIIIlIIl[1]];
        iArr5[lIIIIlIIl[0]] = lIIIIlIIl[14];
        if (llIllIlllll(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIIIIlIIl[1]];
            iArr6[lIIIIlIIl[0]] = lIIIIlIIl[14];
            if (llIlllIIIII(Bank.getFirst(iArr6).getQuantity(), lIIIIlIIl[11])) {
                bv.add(new C0003d(lIIIIlIIl[14], lIIIIlIIl[317], lIIIIlIIl[19]));
                "".length();
            }
        }
        int[] iArr7 = new int[lIIIIlIIl[1]];
        iArr7[lIIIIlIIl[0]] = lIIIIlIIl[15];
        if (llIllIlllll(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lIIIIlIIl[1]];
            iArr8[lIIIIlIIl[0]] = lIIIIlIIl[15];
            if (llIlllIIIII(Bank.getFirst(iArr8).getQuantity(), lIIIIlIIl[11])) {
                bv.add(new C0003d(lIIIIlIIl[15], lIIIIlIIl[317], lIIIIlIIl[19]));
                "".length();
            }
        }
        int[] iArr9 = new int[lIIIIlIIl[1]];
        iArr9[lIIIIlIIl[0]] = lIIIIlIIl[16];
        if (llIllIlllll(Bank.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[lIIIIlIIl[1]];
            iArr10[lIIIIlIIl[0]] = lIIIIlIIl[16];
            if (llIlllIIIII(Bank.getFirst(iArr10).getQuantity(), lIIIIlIIl[11])) {
                bv.add(new C0003d(lIIIIlIIl[16], lIIIIlIIl[317], lIIIIlIIl[19]));
                "".length();
            }
        }
        int[] iArr11 = new int[lIIIIlIIl[1]];
        iArr11[lIIIIlIIl[0]] = lIIIIlIIl[14];
        if (llIlllIIIIl(Bank.contains(iArr11) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlIIl[14], lIIIIlIIl[317], lIIIIlIIl[19]));
            "".length();
        }
        int[] iArr12 = new int[lIIIIlIIl[1]];
        iArr12[lIIIIlIIl[0]] = lIIIIlIIl[15];
        if (llIlllIIIIl(Bank.contains(iArr12) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlIIl[15], lIIIIlIIl[317], lIIIIlIIl[19]));
            "".length();
        }
        int[] iArr13 = new int[lIIIIlIIl[1]];
        iArr13[lIIIIlIIl[0]] = lIIIIlIIl[16];
        if (llIlllIIIIl(Bank.contains(iArr13) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlIIl[16], lIIIIlIIl[317], lIIIIlIIl[19]));
            "".length();
        }
        int[] iArr14 = new int[lIIIIlIIl[1]];
        iArr14[lIIIIlIIl[0]] = lIIIIlIIl[14];
        if (llIlllIIIIl(Bank.contains(iArr14) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlIIl[14], lIIIIlIIl[317], lIIIIlIIl[19]));
            "".length();
        }
        int[] iArr15 = new int[lIIIIlIIl[1]];
        iArr15[lIIIIlIIl[0]] = lIIIIlIIl[318];
        if (llIlllIIIIl(Bank.contains(iArr15) ? 1 : 0)) {
            bv.add(new C0003d(lIIIIlIIl[318], lIIIIlIIl[7], lIIIIlIIl[315]));
            "".length();
        }
        int[] iArr16 = new int[lIIIIlIIl[1]];
        iArr16[lIIIIlIIl[0]] = lIIIIlIIl[24];
        if (llIllIlllll(Bank.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lIIIIlIIl[1]];
            iArr17[lIIIIlIIl[0]] = lIIIIlIIl[24];
            if (llIllIlllll(Bank.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[lIIIIlIIl[1]];
                iArr18[lIIIIlIIl[0]] = lIIIIlIIl[24];
            }
            iArr = new int[lIIIIlIIl[1]];
            iArr[lIIIIlIIl[0]] = lIIIIlIIl[18];
            if (llIlllIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIIIIlIIl[18], lIIIIlIIl[7], lIIIIlIIl[320]));
                "".length();
            }
            if (llIlllIIIIl(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIIIIlIl[lIIIIlIIl[326]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIIIIlIIl[321], lIIIIlIIl[25], lIIIIlIIl[322]));
                "".length();
            }
            iArr2 = new int[lIIIIlIIl[1]];
            iArr2[lIIIIlIIl[0]] = lIIIIlIIl[323];
            if (llIlllIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                return;
            }
            bv.add(new C0003d(lIIIIlIIl[323], lIIIIlIIl[58], lIIIIlIIl[324]));
            "".length();
            return;
        }
        bv.add(new C0003d(lIIIIlIIl[24], lIIIIlIIl[19], lIIIIlIIl[319]));
        "".length();
        iArr = new int[lIIIIlIIl[1]];
        iArr[lIIIIlIIl[0]] = lIIIIlIIl[18];
        if (llIlllIIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (llIlllIIIIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIIIlIl[lIIIIlIIl[326]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lIIIIlIIl[1]];
        iArr2[lIIIIlIIl[0]] = lIIIIlIIl[323];
        if (llIlllIIIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
    }

    static {
        llIllIllllI();
        llIllIlIIII();
        gs = lIIIIlIIl[11];
        gu = lIIIIlIIl[19];
        go = lIIIIlIIl[3];
        gm = lIIIIlIIl[10];
        gr = lIIIIlIIl[7];
        hb = lIIIIlIIl[143];
        gp = lIIIIlIIl[5];
        gX = lIIIIlIIl[49];
        gn = lIIIIlIIl[1];
        gZ = lIIIIlIIl[303];
        gt = lIIIIlIIl[13];
        gq = lIIIIlIIl[6];
        gY = lIIIIlIIl[145];
        ha = lIIIIlIIl[306];
        int[] iArr = new int[lIIIIlIIl[17]];
        iArr[lIIIIlIIl[0]] = lIIIIlIIl[318];
        iArr[lIIIIlIIl[1]] = lIIIIlIIl[333];
        iArr[lIIIIlIIl[3]] = lIIIIlIIl[334];
        iArr[lIIIIlIIl[5]] = lIIIIlIIl[335];
        iArr[lIIIIlIIl[6]] = lIIIIlIIl[336];
        iArr[lIIIIlIIl[7]] = lIIIIlIIl[337];
        iArr[lIIIIlIIl[11]] = lIIIIlIIl[338];
        iArr[lIIIIlIIl[9]] = lIIIIlIIl[339];
        iArr[lIIIIlIIl[13]] = lIIIIlIIl[339];
        gc = iArr;
        int[] iArr2 = new int[lIIIIlIIl[6]];
        iArr2[lIIIIlIIl[0]] = lIIIIlIIl[316];
        iArr2[lIIIIlIIl[1]] = lIIIIlIIl[340];
        iArr2[lIIIIlIIl[3]] = lIIIIlIIl[341];
        iArr2[lIIIIlIIl[5]] = lIIIIlIIl[342];
        gd = iArr2;
        int[] iArr3 = new int[lIIIIlIIl[17]];
        iArr3[lIIIIlIIl[0]] = lIIIIlIIl[24];
        iArr3[lIIIIlIIl[1]] = lIIIIlIIl[343];
        iArr3[lIIIIlIIl[3]] = lIIIIlIIl[344];
        iArr3[lIIIIlIIl[5]] = lIIIIlIIl[345];
        iArr3[lIIIIlIIl[6]] = lIIIIlIIl[346];
        iArr3[lIIIIlIIl[7]] = lIIIIlIIl[347];
        iArr3[lIIIIlIIl[11]] = lIIIIlIIl[348];
        iArr3[lIIIIlIIl[9]] = lIIIIlIIl[349];
        iArr3[lIIIIlIIl[13]] = lIIIIlIIl[348];
        ge = iArr3;
        gf = new WorldArea(lIIIIlIIl[344], lIIIIlIIl[350], lIIIIlIIl[26], lIIIIlIIl[25], lIIIIlIIl[0]);
        f3gg = new WorldPoint(lIIIIlIIl[351], lIIIIlIIl[352], lIIIIlIIl[0]);
        gh = new WorldPoint(lIIIIlIIl[351], lIIIIlIIl[353], lIIIIlIIl[0]);
        gi = new WorldPoint(lIIIIlIIl[351], lIIIIlIIl[354], lIIIIlIIl[0]);
        gj = new WorldPoint(lIIIIlIIl[346], lIIIIlIIl[354], lIIIIlIIl[0]);
        gk = new WorldPoint(lIIIIlIIl[346], lIIIIlIIl[353], lIIIIlIIl[0]);
        gl = new WorldPoint(lIIIIlIIl[346], lIIIIlIIl[352], lIIIIlIIl[0]);
        WorldPoint[] worldPointArr = new WorldPoint[lIIIIlIIl[7]];
        worldPointArr[lIIIIlIIl[0]] = new WorldPoint(lIIIIlIIl[355], lIIIIlIIl[356], lIIIIlIIl[0]);
        worldPointArr[lIIIIlIIl[1]] = new WorldPoint(lIIIIlIIl[357], lIIIIlIIl[358], lIIIIlIIl[0]);
        worldPointArr[lIIIIlIIl[3]] = new WorldPoint(lIIIIlIIl[359], lIIIIlIIl[360], lIIIIlIIl[0]);
        worldPointArr[lIIIIlIIl[5]] = new WorldPoint(lIIIIlIIl[361], lIIIIlIIl[362], lIIIIlIIl[0]);
        worldPointArr[lIIIIlIIl[6]] = new WorldPoint(lIIIIlIIl[363], lIIIIlIIl[364], lIIIIlIIl[0]);
        gv = worldPointArr;
        gw = new WorldPoint(lIIIIlIIl[365], lIIIIlIIl[53], lIIIIlIIl[0]);
        gx = new WorldPoint(lIIIIlIIl[366], lIIIIlIIl[367], lIIIIlIIl[0]);
        gy = new WorldPoint(lIIIIlIIl[368], lIIIIlIIl[369], lIIIIlIIl[0]);
        gz = new WorldPoint(lIIIIlIIl[370], lIIIIlIIl[371], lIIIIlIIl[0]);
        gA = new WorldPoint(lIIIIlIIl[372], lIIIIlIIl[373], lIIIIlIIl[0]);
        gB = new WorldPoint(lIIIIlIIl[374], lIIIIlIIl[375], lIIIIlIIl[0]);
        gC = new WorldPoint(lIIIIlIIl[376], lIIIIlIIl[377], lIIIIlIIl[0]);
        gD = new WorldPoint(lIIIIlIIl[374], lIIIIlIIl[378], lIIIIlIIl[0]);
        gE = new WorldPoint(lIIIIlIIl[379], lIIIIlIIl[380], lIIIIlIIl[0]);
        gF = new WorldPoint(lIIIIlIIl[379], lIIIIlIIl[381], lIIIIlIIl[1]);
        gG = new WorldPoint(lIIIIlIIl[363], lIIIIlIIl[382], lIIIIlIIl[0]);
        gH = new WorldPoint(lIIIIlIIl[383], lIIIIlIIl[384], lIIIIlIIl[0]);
        gI = new WorldPoint(lIIIIlIIl[365], lIIIIlIIl[385], lIIIIlIIl[0]);
        gJ = new WorldPoint(lIIIIlIIl[386], lIIIIlIIl[387], lIIIIlIIl[0]);
        gK = new WorldPoint(lIIIIlIIl[388], lIIIIlIIl[389], lIIIIlIIl[0]);
        gL = new WorldPoint(lIIIIlIIl[390], lIIIIlIIl[391], lIIIIlIIl[0]);
        gM = new WorldPoint(lIIIIlIIl[392], lIIIIlIIl[393], lIIIIlIIl[0]);
        gN = new WorldPoint(lIIIIlIIl[394], lIIIIlIIl[395], lIIIIlIIl[0]);
        gO = new WorldPoint(lIIIIlIIl[396], lIIIIlIIl[397], lIIIIlIIl[0]);
        gP = new WorldPoint(lIIIIlIIl[398], lIIIIlIIl[399], lIIIIlIIl[0]);
        gQ = new WorldPoint(lIIIIlIIl[349], lIIIIlIIl[350], lIIIIlIIl[0]);
        gR = new WorldPoint(lIIIIlIIl[400], lIIIIlIIl[352], lIIIIlIIl[0]);
        gS = new WorldPoint(lIIIIlIIl[400], lIIIIlIIl[353], lIIIIlIIl[0]);
        gT = new WorldPoint(lIIIIlIIl[400], lIIIIlIIl[354], lIIIIlIIl[0]);
        gU = new WorldPoint(lIIIIlIIl[398], lIIIIlIIl[354], lIIIIlIIl[0]);
        gV = new WorldPoint(lIIIIlIIl[398], lIIIIlIIl[353], lIIIIlIIl[0]);
        gW = new WorldPoint(lIIIIlIIl[398], lIIIIlIIl[352], lIIIIlIIl[0]);
        bv = new ArrayList();
        hc = new WorldArea(new WorldPoint(lIIIIlIIl[379], lIIIIlIIl[53], lIIIIlIIl[0]), new WorldPoint(lIIIIlIIl[368], lIIIIlIIl[401], lIIIIlIIl[0]));
        hd = lIIIIlIIl[40];
        he = lIIIIlIIl[41];
        hf = lIIIIlIIl[0];
        hg = lIIIIlIIl[0];
        hh = lIIIIlIIl[0];
        hi = lIIIIlIIl[0];
        hj = lIIIIlIIl[0];
        hk = lIIIIlIIl[0];
        String[] strArr = new String[lIIIIlIIl[5]];
        strArr[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[307]];
        strArr[lIIIIlIIl[1]] = lIIIIIlIl[lIIIIlIIl[402]];
        strArr[lIIIIlIIl[3]] = lIIIIIlIl[lIIIIlIIl[143]];
        hl = strArr;
        hm = lIIIIIlIl[lIIIIlIIl[403]];
        hn = lIIIIIlIl[lIIIIlIIl[404]];
        ho = lIIIIIlIl[lIIIIlIIl[405]];
        hp = new WorldPoint(lIIIIlIIl[349], lIIIIlIIl[406], lIIIIlIIl[0]);
        hq = new WorldArea(lIIIIlIIl[407], lIIIIlIIl[408], lIIIIlIIl[10], lIIIIlIIl[84], lIIIIlIIl[0]);
        hr = new WorldPoint(lIIIIlIIl[409], lIIIIlIIl[410], lIIIIlIIl[0]);
        hs = new WorldArea(lIIIIlIIl[411], lIIIIlIIl[412], lIIIIlIIl[82], lIIIIlIIl[90], lIIIIlIIl[0]);
        bT = lIIIIlIIl[0];
    }

    private static boolean llIlllIIlIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
        if (llIllIlllll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean bH() {
        int[] iArr = new int[lIIIIlIIl[1]];
        iArr[lIIIIlIIl[0]] = lIIIIlIIl[20];
        if (llIllIlllll(Inventory.contains(iArr) ? 1 : 0) && llIllIlllll(Inventory.contains(C0005f.aV) ? 1 : 0)) {
            if (llIlllIIIIl(Inventory.contains(C0005f.aO) ? 1 : 0)) {
                if (llIllIlllll(Equipment.contains(C0005f.aO) ? 1 : 0) && (!llIlllIIIIl(Inventory.contains(C0005f.aN) ? 1 : 0) || llIllIlllll(Equipment.contains(C0005f.aN) ? 1 : 0))) {
                    String[] strArr = new String[lIIIIlIIl[1]];
                    strArr[lIIIIlIIl[0]] = lIIIIIlIl[lIIIIlIIl[314]];
                }
            }
            ?? r0 = lIIIIlIIl[1];
            "".length();
            return (((117 ^ 39) ^ (94 ^ 61)) & (((89 ^ 31) ^ (230 ^ 145)) ^ (-" ".length()))) >= "  ".length() ? ((26 ^ 64) ^ (110 ^ 107)) & (((((195 + 42) - 230) + 197) ^ (((12 + 50) - (-66)) + 19)) ^ (-" ".length())) : r0;
        }
        return lIIIIlIIl[0];
    }

    private static boolean llIlllIIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlllIIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlllIIIll(int i, int i2) {
        return i >= i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIIIIlIl[lIIIIlIIl[325]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIIIlIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (llIlllIIIll(C0004e.j(lIIIIlIIl[10]), lIIIIlIIl[19])) {
            ?? r0 = lIIIIlIIl[1];
            "".length();
            return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIIlIIl[0];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            bG();
            "".length();
            if ((-" ".length()) > " ".length()) {
                return (32 ^ 120) & ((55 ^ 111) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIIIIlIIl[121];
    }

    private static boolean llIllIlllll(int i) {
        return i != 0;
    }

    private static boolean llIlllIlIII(int i, int i2) {
        return i != i2;
    }

    private static String llIlIlllllI(String lIIlIIlIIlIllII, String lIIlIIlIIlIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIlIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIlIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIlIIlIllIl) {
            lIIlIIlIIlIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllIIIIl(int i) {
        return i == 0;
    }
}
