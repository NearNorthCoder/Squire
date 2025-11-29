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
import net.runelite.api.NPC;
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
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.K  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/K.class */
public class K implements ab {
    public static final /* synthetic */ WorldPoint fP;
    public static final /* synthetic */ WorldPoint fR;
    public static final /* synthetic */ WorldPoint fN;
    static /* synthetic */ int fX;
    public static final /* synthetic */ WorldPoint fU;
    public static final /* synthetic */ WorldPoint fT;
    public static final /* synthetic */ WorldPoint fW;
    public static final /* synthetic */ WorldPoint fV;
    private static /* synthetic */ int[] llIlllIlI;
    private static /* synthetic */ String[] llIlllIII;
    static /* synthetic */ int dk;
    public static /* synthetic */ List<C0003d> bx;
    public static /* synthetic */ String[] cG;
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ WorldPoint fQ;
    static /* synthetic */ boolean dl;
    static /* synthetic */ WorldArea fY;
    public static final /* synthetic */ WorldPoint fO;
    static /* synthetic */ WorldArea fZ;
    public static final /* synthetic */ WorldPoint fS;

    private static boolean lIlllIlIllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e6, code lost:
        if (lIlllIlIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIlI[9]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0229, code lost:
        if (lIlllIlIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIlI[9]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x026c, code lost:
        if (lIlllIlIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIlI[9]) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02af, code lost:
        if (lIlllIlIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIlI[13]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02b2, code lost:
        Q();
        java.lang.System.out.println(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIII[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIlI[7]]);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.bv = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIlI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02cd, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v640, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v661, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v697, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cg() {
        if (lIlllIlIlIll(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (lIlllIlIllII(bx.size(), llIlllIlI[0])) {
                System.out.println(llIlllIII[llIlllIlI[1]]);
                bv = llIlllIlI[1];
            }
        }
        if (lIlllIlIllIl(bv ? 1 : 0)) {
            if (lIlllIlIllII(Skills.getLevel(Skill.MAGIC), llIlllIlI[2])) {
                C0012m.ak();
            }
            if (lIlllIlIlllI(Skills.getLevel(Skill.MAGIC), llIlllIlI[2]) && lIlllIlIllII(Skills.getLevel(Skill.PRAYER), llIlllIlI[3])) {
                aq.ea();
            }
            if (lIlllIlIlllI(Skills.getLevel(Skill.PRAYER), llIlllIlI[3]) && lIlllIlIlIll(Inventory.contains(C0005f.bh) ? 1 : 0)) {
                Inventory.getFirst(C0005f.bh).interact(llIlllIII[llIlllIlI[0]]);
            }
            if (lIlllIlIllIl(an() ? 1 : 0) && lIlllIlIllII(C0004e.j(fX), llIlllIlI[0]) && lIlllIlIlllI(Skills.getLevel(Skill.MAGIC), llIlllIlI[2]) && lIlllIlIlllI(Skills.getLevel(Skill.PRAYER), llIlllIlI[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlllIlIllll(nearest) && lIlllIlIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlllIII[llIlllIlI[4]];
                    C0000a.a(nearest);
                }
                if (lIlllIlIllll(nearest) && lIlllIlIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlllIlIllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlllIlI[5]);
                        "".length();
                    }
                    if (lIlllIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[6]];
                        if (lIlllIllIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlllIlI[7]);
                            "".length();
                        }
                        if (lIlllIllIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlllIlI[4]);
                            "".length();
                        }
                        int[] iArr = new int[llIlllIlI[0]];
                        iArr[llIlllIlI[1]] = llIlllIlI[8];
                        if (lIlllIlIlIll(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIlllIlI[0]];
                            iArr2[llIlllIlI[1]] = llIlllIlI[8];
                        }
                        int[] iArr3 = new int[llIlllIlI[0]];
                        iArr3[llIlllIlI[1]] = llIlllIlI[10];
                        if (lIlllIlIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIlllIlI[0]];
                            iArr4[llIlllIlI[1]] = llIlllIlI[10];
                        }
                        int[] iArr5 = new int[llIlllIlI[0]];
                        iArr5[llIlllIlI[1]] = llIlllIlI[11];
                        if (lIlllIlIlIll(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIlllIlI[0]];
                            iArr6[llIlllIlI[1]] = llIlllIlI[11];
                        }
                        int[] iArr7 = new int[llIlllIlI[0]];
                        iArr7[llIlllIlI[1]] = llIlllIlI[12];
                        if (lIlllIlIlIll(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[llIlllIlI[0]];
                            iArr8[llIlllIlI[1]] = llIlllIlI[12];
                        }
                        int[] iArr9 = new int[llIlllIlI[13]];
                        iArr9[llIlllIlI[1]] = llIlllIlI[14];
                        iArr9[llIlllIlI[0]] = llIlllIlI[12];
                        iArr9[llIlllIlI[4]] = llIlllIlI[15];
                        iArr9[llIlllIlI[6]] = llIlllIlI[11];
                        iArr9[llIlllIlI[7]] = llIlllIlI[10];
                        iArr9[llIlllIlI[16]] = llIlllIlI[8];
                        if (lIlllIlIllIl(C0004e.d(iArr9) ? 1 : 0)) {
                            Q();
                            System.out.println(llIlllIII[llIlllIlI[16]]);
                            bv = llIlllIlI[0];
                            return;
                        }
                        while (lIlllIlIllIl(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks(llIlllIlI[0]);
                            "".length();
                            "".length();
                            if ("   ".length() < "   ".length()) {
                                return;
                            }
                        }
                        if (lIlllIlIllIl(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIlllIlI[13]);
                            "".length();
                        }
                        int[] iArr10 = new int[llIlllIlI[17]];
                        iArr10[llIlllIlI[1]] = llIlllIlI[14];
                        iArr10[llIlllIlI[0]] = llIlllIlI[12];
                        iArr10[llIlllIlI[4]] = llIlllIlI[15];
                        iArr10[llIlllIlI[6]] = llIlllIlI[18];
                        iArr10[llIlllIlI[7]] = llIlllIlI[11];
                        iArr10[llIlllIlI[16]] = llIlllIlI[10];
                        iArr10[llIlllIlI[13]] = llIlllIlI[8];
                        if (lIlllIlIlIll(C0004e.d(iArr10) ? 1 : 0)) {
                            C0000a.a(llIlllIlI[18], llIlllIlI[7]);
                            C0000a.b(C0005f.aU, llIlllIlI[0]);
                            C0000a.a(llIlllIlI[12], llIlllIlI[13]);
                            C0000a.a(llIlllIlI[19], llIlllIlI[20]);
                            C0000a.a(llIlllIlI[15], llIlllIlI[6]);
                            C0000a.a(llIlllIlI[14], llIlllIlI[21]);
                            int[] iArr11 = new int[llIlllIlI[0]];
                            iArr11[llIlllIlI[1]] = llIlllIlI[8];
                            if (lIlllIlIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[llIlllIlI[0]];
                                iArr12[llIlllIlI[1]] = llIlllIlI[8];
                                if (lIlllIlIllII(Inventory.getCount(iArr12), llIlllIlI[0])) {
                                    Bank.withdraw(llIlllIlI[8], llIlllIlI[22], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlllIlI[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[llIlllIlI[0]];
                                        iArr13[llIlllIlI[1]] = llIlllIlI[8];
                                        if (lIlllIllIIII(Inventory.getCount(iArr13))) {
                                            ?? r0 = llIlllIlI[0];
                                            "".length();
                                            return "  ".length() < (((82 ^ 47) ^ (165 ^ 133)) & (((12 ^ 4) ^ (31 ^ 74)) ^ (-" ".length()))) ? ((190 ^ 135) ^ (227 ^ 132)) & (((((10 + 56) - (-86)) + 42) ^ (((87 + 35) - 46) + 80)) ^ (-" ".length())) : r0;
                                        }
                                        return llIlllIlI[1];
                                    }, llIlllIlI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr13 = new int[llIlllIlI[0]];
                            iArr13[llIlllIlI[1]] = llIlllIlI[11];
                            if (lIlllIlIlIll(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[llIlllIlI[0]];
                                iArr14[llIlllIlI[1]] = llIlllIlI[11];
                                if (lIlllIlIllII(Inventory.getCount(iArr14), llIlllIlI[0])) {
                                    Bank.withdraw(llIlllIlI[11], llIlllIlI[23], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIlllIlI[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[llIlllIlI[0]];
                                        iArr15[llIlllIlI[1]] = llIlllIlI[11];
                                        if (lIlllIllIIII(Inventory.getCount(iArr15))) {
                                            ?? r0 = llIlllIlI[0];
                                            "".length();
                                            return " ".length() <= 0 ? ((84 ^ 22) ^ (225 ^ 131)) & (((234 ^ 158) ^ (109 ^ 57)) ^ (-" ".length())) : r0;
                                        }
                                        return llIlllIlI[1];
                                    }, llIlllIlI[5]);
                                    "".length();
                                }
                            }
                            if (lIlllIlIllII(Skills.getLevel(Skill.MAGIC), llIlllIlI[2])) {
                                C0000a.a(llIlllIlI[10], llIlllIlI[22]);
                            }
                        }
                    }
                }
            }
            if (lIlllIlIlIll(Inventory.contains(C0005f.bc) ? 1 : 0) && lIlllIlIllII(Movement.getRunEnergy(), llIlllIlI[24])) {
                Inventory.getFirst(C0005f.bc).interact(llIlllIII[llIlllIlI[13]]);
                Time.sleepTicks(llIlllIlI[0]);
                "".length();
            }
            if (lIlllIllIIIl(lIlllIlIlIlI(C0004e.w(), 50.0d))) {
                int[] iArr15 = new int[llIlllIlI[0]];
                iArr15[llIlllIlI[1]] = llIlllIlI[19];
                if (lIlllIlIlIll(Inventory.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[llIlllIlI[0]];
                    iArr16[llIlllIlI[1]] = llIlllIlI[19];
                    Inventory.getFirst(iArr16).interact(llIlllIII[llIlllIlI[17]]);
                    Time.sleepTicks(llIlllIlI[0]);
                    "".length();
                }
            }
            if (lIlllIlIlIll(an() ? 1 : 0) && lIlllIlIllII(C0004e.j(fX), llIlllIlI[0])) {
                if (lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    ch();
                }
                if (lIlllIlIlIll(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(llIlllIII[llIlllIlI[20]], cG);
                }
            }
            if ((!lIlllIllIIlI(C0004e.j(fX), llIlllIlI[0]) || !lIlllIllIIlI(C0004e.j(fX), llIlllIlI[4]) || lIlllIllIIll(C0004e.j(fX), llIlllIlI[6])) && lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIllIl(fZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fO), llIlllIlI[20]) && lIlllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = llIlllIII[llIlllIlI[25]];
                    Movement.walkTo(fO);
                    "".length();
                    Time.sleepTicks(llIlllIlI[0]);
                    "".length();
                }
                if (lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fO), llIlllIlI[20])) {
                    C0006g.a(llIlllIII[llIlllIlI[21]], cG);
                }
            }
            if (lIlllIllIIll(C0004e.j(fX), llIlllIlI[7])) {
                dk = llIlllIlI[1];
                if (lIlllIlIllIl(Vars.getBit(llIlllIlI[26]))) {
                    if (lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fQ), llIlllIlI[7])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[27]];
                        Movement.walkTo(fQ);
                        "".length();
                        Time.sleepTicks(llIlllIlI[0]);
                        "".length();
                    }
                    if (lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fQ), llIlllIlI[7])) {
                        String[] strArr = new String[llIlllIlI[0]];
                        strArr[llIlllIlI[1]] = llIlllIII[llIlllIlI[28]];
                        TileObject nearest2 = TileObjects.getNearest(strArr);
                        String[] strArr2 = new String[llIlllIlI[0]];
                        strArr2[llIlllIlI[1]] = llIlllIII[llIlllIlI[2]];
                        if (lIlllIlIlIll(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            String[] strArr3 = new String[llIlllIlI[0]];
                            strArr3[llIlllIlI[1]] = llIlllIII[llIlllIlI[29]];
                            TileObjects.getNearest(strArr3).interact(llIlllIII[llIlllIlI[30]]);
                            Time.sleepTicks(llIlllIlI[6]);
                            "".length();
                        }
                        String[] strArr4 = new String[llIlllIlI[0]];
                        strArr4[llIlllIlI[1]] = llIlllIII[llIlllIlI[31]];
                        TileObject nearest3 = TileObjects.getNearest(strArr4);
                        String[] strArr5 = new String[llIlllIlI[0]];
                        strArr5[llIlllIlI[1]] = llIlllIII[llIlllIlI[32]];
                        if (lIlllIlIllIl(nearest3.hasAction(strArr5) ? 1 : 0)) {
                            C0006g.a(llIlllIII[llIlllIlI[33]], cG);
                        }
                    }
                }
                if (lIlllIllIIll(Vars.getBit(llIlllIlI[26]), llIlllIlI[0]) && lIlllIlIllIl(Vars.getBit(llIlllIlI[34]))) {
                    if (lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fR), llIlllIlI[13])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[35]];
                        Movement.walkTo(fR);
                        "".length();
                        Time.sleepTicks(llIlllIlI[0]);
                        "".length();
                    }
                    if (lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fR), llIlllIlI[13])) {
                        C0006g.a(llIlllIII[llIlllIlI[36]], cG);
                    }
                }
                if (lIlllIllIIll(Vars.getBit(llIlllIlI[26]), llIlllIlI[0]) && lIlllIllIIll(Vars.getBit(llIlllIlI[34]), llIlllIlI[0]) && lIlllIlIllIl(Vars.getBit(llIlllIlI[37]))) {
                    if (lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllIlI[13])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[38]];
                        Movement.walkTo(fS);
                        "".length();
                        Time.sleepTicks(llIlllIlI[0]);
                        "".length();
                    }
                    if (lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllIlI[13])) {
                        C0006g.a(llIlllIII[llIlllIlI[39]], cG);
                    }
                }
                if (lIlllIllIIll(Vars.getBit(llIlllIlI[26]), llIlllIlI[0]) && lIlllIllIIll(Vars.getBit(llIlllIlI[34]), llIlllIlI[0]) && lIlllIllIIll(Vars.getBit(llIlllIlI[37]), llIlllIlI[0])) {
                    if (lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllIlI[4])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[40]];
                        Movement.walkTo(fT);
                        "".length();
                        Time.sleepTicks(llIlllIlI[0]);
                        "".length();
                    }
                    if (lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllIlI[4])) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[41]];
                        if (lIlllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr6 = new String[llIlllIlI[0]];
                            strArr6[llIlllIlI[1]] = llIlllIII[llIlllIlI[42]];
                            TileObjects.getNearest(strArr6).interact(llIlllIII[llIlllIlI[43]]);
                            Time.sleepTicks(llIlllIlI[6]);
                            "".length();
                        }
                        int lIIIIlIlIlIlII = Vars.getBit(llIlllIlI[44]);
                        if (lIlllIlIllIl(Dialog.getOptions().isEmpty() ? 1 : 0)) {
                            System.out.println("Selecting " + lIIIIlIlIlIlII);
                            if (lIlllIlIllIl(lIIIIlIlIlIlII)) {
                                String[] strArr7 = new String[llIlllIlI[0]];
                                strArr7[llIlllIlI[1]] = llIlllIII[llIlllIlI[45]];
                                Dialog.chooseOption(strArr7);
                                "".length();
                            }
                            if (lIlllIllIIll(lIIIIlIlIlIlII, llIlllIlI[0])) {
                                String[] strArr8 = new String[llIlllIlI[0]];
                                strArr8[llIlllIlI[1]] = llIlllIII[llIlllIlI[46]];
                                Dialog.chooseOption(strArr8);
                                "".length();
                            }
                            if (lIlllIllIIll(lIIIIlIlIlIlII, llIlllIlI[4])) {
                                String[] strArr9 = new String[llIlllIlI[0]];
                                strArr9[llIlllIlI[1]] = llIlllIII[llIlllIlI[47]];
                                Dialog.chooseOption(strArr9);
                                "".length();
                            }
                            if (lIlllIllIIll(lIIIIlIlIlIlII, llIlllIlI[6])) {
                                String[] strArr10 = new String[llIlllIlI[0]];
                                strArr10[llIlllIlI[1]] = llIlllIII[llIlllIlI[48]];
                                Dialog.chooseOption(strArr10);
                                "".length();
                            }
                            Time.sleepTicks(llIlllIlI[4]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlllIllIIll(C0004e.j(fX), llIlllIlI[16])) {
                WorldArea worldArea = new WorldArea(llIlllIlI[49], llIlllIlI[50], llIlllIlI[17], llIlllIlI[16], llIlllIlI[1]);
                if (lIlllIlIllIl(Players.getLocal().getWorldLocation().getPlane())) {
                    WorldArea worldArea2 = new WorldArea(llIlllIlI[51], llIlllIlI[50], llIlllIlI[28], llIlllIlI[13], llIlllIlI[1]);
                    WorldArea worldArea3 = new WorldArea(llIlllIlI[51], llIlllIlI[52], llIlllIlI[7], llIlllIlI[16], llIlllIlI[1]);
                    WorldArea worldArea4 = new WorldArea(llIlllIlI[53], llIlllIlI[54], llIlllIlI[7], llIlllIlI[4], llIlllIlI[1]);
                    WorldArea worldArea5 = new WorldArea(llIlllIlI[53], llIlllIlI[52], llIlllIlI[6], llIlllIlI[6], llIlllIlI[1]);
                    if (lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fU), llIlllIlI[4]) && lIlllIlIllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIllIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlllIII[llIlllIlI[55]];
                        Movement.walkTo(fU);
                        "".length();
                        Time.sleepTicks(llIlllIlI[0]);
                        "".length();
                    }
                    if (lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fU), llIlllIlI[4]) && lIlllIlIllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr11 = new String[llIlllIlI[0]];
                        strArr11[llIlllIlI[1]] = llIlllIII[llIlllIlI[56]];
                        TileObjects.getNearest(strArr11).interact(llIlllIII[llIlllIlI[57]]);
                        Time.sleepTicks(llIlllIlI[4]);
                        "".length();
                    }
                    if (lIlllIlIlIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllIlI[58], llIlllIlI[59], llIlllIlI[1])), llIlllIlI[4])) {
                            Movement.walkTo(new WorldPoint(llIlllIlI[58], llIlllIlI[59], llIlllIlI[1]));
                            "".length();
                            Time.sleepTicks(llIlllIlI[0]);
                            "".length();
                        }
                        if (lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllIlI[58], llIlllIlI[59], llIlllIlI[1])), llIlllIlI[4])) {
                            String[] strArr12 = new String[llIlllIlI[0]];
                            strArr12[llIlllIlI[1]] = llIlllIII[llIlllIlI[60]];
                            TileObject nearest4 = TileObjects.getNearest(strArr12);
                            String[] strArr13 = new String[llIlllIlI[0]];
                            strArr13[llIlllIlI[1]] = llIlllIII[llIlllIlI[61]];
                            if (lIlllIlIlIll(nearest4.hasAction(strArr13) ? 1 : 0)) {
                                String[] strArr14 = new String[llIlllIlI[0]];
                                strArr14[llIlllIlI[1]] = llIlllIII[llIlllIlI[62]];
                                TileObjects.getNearest(strArr14).interact(llIlllIII[llIlllIlI[63]]);
                                Time.sleepTicks(llIlllIlI[4]);
                                "".length();
                            }
                            String[] strArr15 = new String[llIlllIlI[0]];
                            strArr15[llIlllIlI[1]] = llIlllIII[llIlllIlI[64]];
                            TileObject nearest5 = TileObjects.getNearest(strArr15);
                            String[] strArr16 = new String[llIlllIlI[0]];
                            strArr16[llIlllIlI[1]] = llIlllIII[llIlllIlI[65]];
                            if (lIlllIlIllIl(nearest5.hasAction(strArr16) ? 1 : 0)) {
                                String[] strArr17 = new String[llIlllIlI[0]];
                                strArr17[llIlllIlI[1]] = llIlllIII[llIlllIlI[66]];
                                TileObjects.getNearest(strArr17).interact(llIlllIII[llIlllIlI[67]]);
                                Time.sleepTicks(llIlllIlI[16]);
                                "".length();
                            }
                        }
                        if (!lIlllIlIllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lIlllIlIllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lIlllIlIllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlllIlIlIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr18 = new String[llIlllIlI[0]];
                            strArr18[llIlllIlI[1]] = llIlllIII[llIlllIlI[68]];
                            TileObjects.getNearest(strArr18).interact(llIlllIII[llIlllIlI[69]]);
                            Time.sleepTicks(llIlllIlI[16]);
                            "".length();
                        }
                    }
                }
                if (lIlllIllIIll(Players.getLocal().getWorldLocation().getPlane(), llIlllIlI[0])) {
                    AccBuilderGWD.c = llIlllIII[llIlllIlI[70]];
                    String[] strArr19 = new String[llIlllIlI[0]];
                    strArr19[llIlllIlI[1]] = llIlllIII[llIlllIlI[3]];
                    if (lIlllIlIllll(TileObjects.getNearest(strArr19))) {
                        String[] strArr20 = new String[llIlllIlI[0]];
                        strArr20[llIlllIlI[1]] = llIlllIII[llIlllIlI[71]];
                        TileObjects.getNearest(strArr20).interact(llIlllIII[llIlllIlI[72]]);
                        Time.sleepTicks(llIlllIlI[16]);
                        "".length();
                    }
                    String[] strArr21 = new String[llIlllIlI[0]];
                    strArr21[llIlllIlI[1]] = llIlllIII[llIlllIlI[73]];
                    if (lIlllIlIllll(TileObjects.getNearest(strArr21))) {
                        String[] strArr22 = new String[llIlllIlI[0]];
                        strArr22[llIlllIlI[1]] = llIlllIII[llIlllIlI[74]];
                        TileObjects.getNearest(strArr22).interact(llIlllIII[llIlllIlI[24]]);
                        Time.sleepTicks(llIlllIlI[4]);
                        "".length();
                    }
                }
            }
            if (lIlllIllIIll(C0004e.j(fX), llIlllIlI[13])) {
                if (lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    ch();
                }
                if (lIlllIlIlIll(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(llIlllIII[llIlllIlI[75]], cG);
                }
            }
            if (lIlllIllIIll(C0004e.j(fX), llIlllIlI[17])) {
                if (lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllIlI[25])) {
                    AccBuilderGWD.c = llIlllIII[llIlllIlI[76]];
                    Movement.walkTo(fW);
                    "".length();
                    Time.sleepTicks(llIlllIlI[4]);
                    "".length();
                }
                if (lIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllIlI[25])) {
                    if (lIlllIlIllIl(C0012m.ap() ? 1 : 0)) {
                        C0012m.aq();
                    }
                    String[] strArr23 = new String[llIlllIlI[0]];
                    strArr23[llIlllIlI[1]] = llIlllIII[llIlllIlI[77]];
                    NPC nearest6 = NPCs.getNearest(strArr23);
                    NPC nearest7 = NPCs.getNearest(npc -> {
                        if (lIlllIlIlIll(npc.getName().contains(llIlllIII[llIlllIlI[111]]) ? 1 : 0) && lIlllIllIlll(npc.getInteracting(), Players.getLocal())) {
                            ?? r0 = llIlllIlI[0];
                            "".length();
                            return (52 ^ 48) <= "   ".length() ? (!true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIlllIlI[1];
                    });
                    if (lIlllIlIllll(nearest6) && lIlllIllIllI(nearest7)) {
                        String[] strArr24 = new String[llIlllIlI[0]];
                        strArr24[llIlllIlI[1]] = llIlllIII[llIlllIlI[78]];
                        if (lIlllIlIllIl(nearest6.hasAction(strArr24) ? 1 : 0)) {
                            C0006g.a(llIlllIII[llIlllIlI[79]], cG);
                        }
                        String[] strArr25 = new String[llIlllIlI[0]];
                        strArr25[llIlllIlI[1]] = llIlllIII[llIlllIlI[80]];
                        if (lIlllIlIlIll(nearest6.hasAction(strArr25) ? 1 : 0) && lIlllIllIllI(Players.getLocal().getInteracting())) {
                            AccBuilderGWD.c = llIlllIII[llIlllIlI[81]];
                            if (lIlllIlIllIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                            }
                        }
                    }
                    if (lIlllIlIllII(Prayers.getPoints(), llIlllIlI[40]) && lIlllIlIlIll(Inventory.contains(C0005f.aZ) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aZ).interact(llIlllIII[llIlllIlI[82]]);
                        Time.sleepTicks(llIlllIlI[0]);
                        "".length();
                    }
                    C0006g.a(cG);
                }
            }
            if (lIlllIllIIll(C0004e.j(fX), llIlllIlI[20])) {
                String[] strArr26 = new String[llIlllIlI[0]];
                strArr26[llIlllIlI[1]] = llIlllIII[llIlllIlI[83]];
                if (lIlllIlIllIl(Inventory.contains(strArr26) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlllIII[llIlllIlI[84]];
                    String[] strArr27 = new String[llIlllIlI[0]];
                    strArr27[llIlllIlI[1]] = llIlllIII[llIlllIlI[85]];
                    TileItems.getNearest(strArr27).interact(llIlllIII[llIlllIlI[86]]);
                    Time.sleepTicks(llIlllIlI[7]);
                    "".length();
                }
                String[] strArr28 = new String[llIlllIlI[0]];
                strArr28[llIlllIlI[1]] = llIlllIII[llIlllIlI[87]];
                if (lIlllIlIlIll(Inventory.contains(strArr28) ? 1 : 0)) {
                    if (lIlllIlIlIll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    if (lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        ch();
                    }
                    if (lIlllIlIlIll(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIlllIlIllII(dk, llIlllIlI[0])) {
                            as.nf += llIlllIlI[0];
                            as.u(AccBuilderGWD.m);
                            dk += llIlllIlI[0];
                            as.nf = llIlllIlI[1];
                            dl = llIlllIlI[1];
                        }
                        C0006g.a(llIlllIII[llIlllIlI[88]], cG);
                    }
                }
            }
            C0006g.a(cG);
        }
    }

    private static void ch() {
        if (lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fN), llIlllIlI[4])) {
            AccBuilderGWD.c = llIlllIII[llIlllIlI[89]];
            WorldArea worldArea = new WorldArea(llIlllIlI[90], llIlllIlI[91], llIlllIlI[92], llIlllIlI[93], llIlllIlI[1]);
            new WorldPoint(llIlllIlI[94], llIlllIlI[95], llIlllIlI[1]);
            WorldArea worldArea2 = new WorldArea(llIlllIlI[96], llIlllIlI[97], llIlllIlI[35], llIlllIlI[7], llIlllIlI[1]);
            WorldArea worldArea3 = new WorldArea(llIlllIlI[98], llIlllIlI[99], llIlllIlI[20], llIlllIlI[16], llIlllIlI[1]);
            if (lIlllIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (lIlllIlIllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Equipment.getFirst(C0005f.aU).interact(llIlllIII[llIlllIlI[100]]);
                Time.sleepTicks(llIlllIlI[16]);
                "".length();
            }
            if (lIlllIlIllIl(N.jx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(N.jy);
                "".length();
            }
            if (lIlllIlIlIll(N.jx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIllIl(fZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Walker.stepAlong(List.of((Object[]) N.iD));
                "".length();
                Time.sleepTicks(llIlllIlI[0]);
                "".length();
            }
            if (!lIlllIlIllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlllIlIlIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr = new String[llIlllIlI[0]];
                strArr[llIlllIlI[1]] = llIlllIII[llIlllIlI[101]];
                TileObjects.getNearest(strArr).interact(llIlllIII[llIlllIlI[102]]);
                Time.sleepTicks(llIlllIlI[7]);
                "".length();
            }
            if ((!lIlllIlIllIl(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlllIlIlIll(fZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIlllIllIlII(Players.getLocal().getWorldLocation().distanceTo(fN), llIlllIlI[4])) {
                Movement.walkTo(fN);
                "".length();
                Time.sleepTicks(llIlllIlI[0]);
                "".length();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIlllIlI[1];
    }

    static {
        lIlllIlIlIIl();
        lIlllIlIlIII();
        fN = new WorldPoint(llIlllIlI[112], llIlllIlI[113], llIlllIlI[1]);
        fO = new WorldPoint(llIlllIlI[114], llIlllIlI[115], llIlllIlI[1]);
        fP = new WorldPoint(llIlllIlI[116], llIlllIlI[117], llIlllIlI[1]);
        fQ = new WorldPoint(llIlllIlI[118], llIlllIlI[119], llIlllIlI[1]);
        fR = new WorldPoint(llIlllIlI[120], llIlllIlI[121], llIlllIlI[1]);
        fS = new WorldPoint(llIlllIlI[122], llIlllIlI[123], llIlllIlI[1]);
        fT = new WorldPoint(llIlllIlI[124], llIlllIlI[125], llIlllIlI[1]);
        fU = new WorldPoint(llIlllIlI[124], llIlllIlI[126], llIlllIlI[1]);
        fV = new WorldPoint(llIlllIlI[127], llIlllIlI[54], llIlllIlI[1]);
        fW = new WorldPoint(llIlllIlI[128], llIlllIlI[129], llIlllIlI[1]);
        bx = new ArrayList();
        String[] strArr = new String[llIlllIlI[13]];
        strArr[llIlllIlI[1]] = llIlllIII[llIlllIlI[130]];
        strArr[llIlllIlI[0]] = llIlllIII[llIlllIlI[131]];
        strArr[llIlllIlI[4]] = llIlllIII[llIlllIlI[132]];
        strArr[llIlllIlI[6]] = llIlllIII[llIlllIlI[133]];
        strArr[llIlllIlI[7]] = llIlllIII[llIlllIlI[134]];
        strArr[llIlllIlI[16]] = llIlllIII[llIlllIlI[135]];
        cG = strArr;
        fX = llIlllIlI[136];
        fY = new WorldArea(llIlllIlI[137], llIlllIlI[113], llIlllIlI[21], llIlllIlI[13], llIlllIlI[1]);
        fZ = new WorldArea(llIlllIlI[138], llIlllIlI[139], llIlllIlI[48], llIlllIlI[30], llIlllIlI[1]);
    }

    private static boolean lIlllIllIIII(int i) {
        return i > 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIlllIII[llIlllIlI[109]];
    }

    private static boolean lIlllIllIlIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIlllIIlllII(String lIIIIlIIIlIlll, String lIIIIlIIIlIIIl) {
        String str = new String(Base64.getDecoder().decode(lIIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIlIIIlIlIl = new StringBuilder();
        char[] charArray = lIIIIlIIIlIIIl.toCharArray();
        int lIIIIlIIIlIIll = llIlllIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lIIIIlIIIIlIll = llIlllIlI[1];
        while (lIlllIlIllII(lIIIIlIIIIlIll, length)) {
            char lIIIIlIIIllIII = charArray2[lIIIIlIIIIlIll];
            lIIIIlIIIlIlIl.append((char) (lIIIIlIIIllIII ^ charArray[lIIIIlIIIlIIll % charArray.length]));
            "".length();
            lIIIIlIIIlIIll++;
            lIIIIlIIIIlIll++;
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lIIIIlIIIlIlIl);
    }

    private static boolean lIlllIllIIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlllIllIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIlllIlIlllI(C0004e.j(fX), llIlllIlI[25])) {
            ?? r0 = llIlllIlI[0];
            "".length();
            return ((72 ^ 69) ^ (36 ^ 45)) < 0 ? ((30 ^ 4) ^ (66 ^ 68)) & (((121 ^ 25) ^ (7 ^ 123)) ^ (-" ".length())) : r0;
        }
        return llIlllIlI[1];
    }

    private static String lIlllIIllIlI(String lIIIIlIIllIlII, String lIIIIlIIllIIll) {
        try {
            SecretKeySpec lIIIIlIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlIIllIIll.getBytes(StandardCharsets.UTF_8)), llIlllIlI[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlllIlI[4], lIIIIlIIllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIlIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIlIIllIlIl) {
            lIIIIlIIllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlllIlIlIIl() {
        llIlllIlI = new int[141];
        llIlllIlI[0] = " ".length();
        llIlllIlI[1] = ((70 ^ 80) ^ (21 ^ 38)) & (((86 ^ 53) ^ (64 ^ 6)) ^ (-" ".length()));
        llIlllIlI[2] = 57 ^ 52;
        llIlllIlI[3] = (((42 + 136) - 85) + 87) ^ (((65 + 126) - 135) + 97);
        llIlllIlI[4] = "  ".length();
        llIlllIlI[5] = (-((-8851) & 12026)) & (-16401) & 24575;
        llIlllIlI[6] = "   ".length();
        llIlllIlI[7] = 142 ^ 138;
        llIlllIlI[8] = (-((-2865) & 31729)) & (-3330) & 32751;
        llIlllIlI[9] = (-((-769) & 16151)) & (-16385) & 32766;
        llIlllIlI[10] = (-((-1) & 23937)) & (-3) & 24495;
        llIlllIlI[11] = (-((-4322) & 15863)) & (-65) & 12159;
        llIlllIlI[12] = (-2561) & 4071;
        llIlllIlI[13] = (223 ^ 199) ^ (79 ^ 81);
        llIlllIlI[14] = (-((-4161) & 12521)) & (-17) & 16383;
        llIlllIlI[15] = (-4150) & 6583;
        llIlllIlI[16] = 192 ^ 197;
        llIlllIlI[17] = (46 ^ 100) ^ (1 ^ 76);
        llIlllIlI[18] = (-18989) & 31613;
        llIlllIlI[19] = (-31361) & 31739;
        llIlllIlI[20] = 12 ^ 4;
        llIlllIlI[21] = (181 ^ 145) ^ (52 ^ 26);
        llIlllIlI[22] = (-11780) & 12279;
        llIlllIlI[23] = (-((-13769) & 32235)) & (-12290) & 32255;
        llIlllIlI[24] = (138 ^ 157) ^ (87 ^ 114);
        llIlllIlI[25] = (192 ^ 173) ^ (44 ^ 72);
        llIlllIlI[26] = (-29064) & 29663;
        llIlllIlI[27] = (24 ^ 69) ^ (41 ^ 127);
        llIlllIlI[28] = (86 ^ 113) ^ (95 ^ 116);
        llIlllIlI[29] = (((23 + 75) - 77) + 122) ^ (((106 + 51) - 91) + 63);
        llIlllIlI[30] = (((155 + 152) - 168) + 25) ^ (((162 + 61) - 145) + 93);
        llIlllIlI[31] = 155 ^ 139;
        llIlllIlI[32] = (((76 + 43) - 115) + 153) ^ (((50 + 22) - 46) + 114);
        llIlllIlI[33] = (60 ^ 80) ^ (110 ^ 16);
        llIlllIlI[34] = (-((-20769) & 29993)) & (-16385) & 26207;
        llIlllIlI[35] = (164 ^ 174) ^ (44 ^ 53);
        llIlllIlI[36] = 66 ^ 86;
        llIlllIlI[37] = (-13349) & 13949;
        llIlllIlI[38] = 101 ^ 112;
        llIlllIlI[39] = 120 ^ 110;
        llIlllIlI[40] = (((126 + 34) - 154) + 135) ^ (((142 + 116) - 193) + 89);
        llIlllIlI[41] = 115 ^ 107;
        llIlllIlI[42] = (((125 + 47) - 124) + 94) ^ (((103 + 19) - 68) + 97);
        llIlllIlI[43] = 68 ^ 94;
        llIlllIlI[44] = (-(((75 + 104) - 155) + 106)) & (-27653) & 28383;
        llIlllIlI[45] = " ".length() ^ (81 ^ 75);
        llIlllIlI[46] = (((116 + 73) - 97) + 55) ^ (((119 + 124) - 205) + 105);
        llIlllIlI[47] = (134 ^ 195) ^ (234 ^ 178);
        llIlllIlI[48] = 173 ^ 179;
        llIlllIlI[49] = (-((-787) & 17203)) & (-8727) & 27647;
        llIlllIlI[50] = (-((-167) & 29615)) & (-1) & 32702;
        llIlllIlI[51] = (-29211) & 31710;
        llIlllIlI[52] = (-((-18065) & 30673)) & (-1) & 15859;
        llIlllIlI[53] = (-8193) & 10694;
        llIlllIlI[54] = (-16713) & 19965;
        llIlllIlI[55] = 188 ^ 163;
        llIlllIlI[56] = 129 ^ 161;
        llIlllIlI[57] = 82 ^ 115;
        llIlllIlI[58] = (-16917) & 19423;
        llIlllIlI[59] = (-((-9259) & 13611)) & (-16453) & 24061;
        llIlllIlI[60] = (2 ^ 113) ^ (116 ^ 37);
        llIlllIlI[61] = 120 ^ 91;
        llIlllIlI[62] = (107 ^ 85) ^ (155 ^ 129);
        llIlllIlI[63] = (((95 + 9) - (-26)) + 34) ^ (((32 + 43) - (-42)) + 12);
        llIlllIlI[64] = 133 ^ 163;
        llIlllIlI[65] = 10 ^ 45;
        llIlllIlI[66] = 176 ^ 152;
        llIlllIlI[67] = 17 ^ 56;
        llIlllIlI[68] = (35 ^ 46) ^ (18 ^ 53);
        llIlllIlI[69] = 110 ^ 69;
        llIlllIlI[70] = (41 ^ 15) ^ (187 ^ 177);
        llIlllIlI[71] = (((120 + 56) - 89) + 45) ^ (((28 + 48) - (-68)) + 26);
        llIlllIlI[72] = "  ".length() ^ (99 ^ 78);
        llIlllIlI[73] = 124 ^ 76;
        llIlllIlI[74] = 137 ^ 184;
        llIlllIlI[75] = (194 ^ 138) ^ (14 ^ 117);
        llIlllIlI[76] = 83 ^ 103;
        llIlllIlI[77] = 147 ^ 166;
        llIlllIlI[78] = 41 ^ 31;
        llIlllIlI[79] = (((112 + 16) - 35) + 48) ^ (((182 + 25) - 182) + 161);
        llIlllIlI[80] = 163 ^ 155;
        llIlllIlI[81] = 250 ^ 195;
        llIlllIlI[82] = (90 ^ 126) ^ (188 ^ 162);
        llIlllIlI[83] = (((10 + 117) - 16) + 51) ^ (((142 + 132) - 147) + 26);
        llIlllIlI[84] = (((144 + 56) - 93) + 73) ^ (((126 + 70) - 84) + 24);
        llIlllIlI[85] = (((32 + 98) - (-46)) + 9) ^ (((2 + 49) - (-45)) + 36);
        llIlllIlI[86] = 34 ^ 28;
        llIlllIlI[87] = (90 ^ 21) ^ (85 ^ 37);
        llIlllIlI[88] = (98 ^ 24) ^ (251 ^ 193);
        llIlllIlI[89] = 223 ^ 158;
        llIlllIlI[90] = (-((-9283) & 30427)) & (-8194) & 31739;
        llIlllIlI[91] = (-20485) & 23540;
        llIlllIlI[92] = ((39 + 34) - (-136)) + 21;
        llIlllIlI[93] = ((104 + 25) - 102) + 127;
        llIlllIlI[94] = (-((-2659) & 23167)) & (-9729) & 32767;
        llIlllIlI[95] = (-(((64 + 149) - 175) + 127)) & (-24841) & 28159;
        llIlllIlI[96] = (-8201) & 10719;
        llIlllIlI[97] = (-269) & 3422;
        llIlllIlI[98] = (-((-4227) & 13991)) & (-20481) & 32758;
        llIlllIlI[99] = (-((-9938) & 26613)) & (-12801) & 32631;
        llIlllIlI[100] = 31 ^ 93;
        llIlllIlI[101] = 37 ^ 102;
        llIlllIlI[102] = 79 ^ 11;
        llIlllIlI[103] = (((200 ^ 143) + (((117 + 75) - 187) + 156)) - (((83 + 138) - 124) + 94)) + ((92 + 5) - 48) + 110;
        llIlllIlI[104] = (-16404) & 28383;
        llIlllIlI[105] = (-5650) & 30649;
        llIlllIlI[106] = (-((-661) & 18357)) & (-70) & 32765;
        llIlllIlI[107] = (-((-5125) & 23678)) & (-12291) & 31743;
        llIlllIlI[108] = 123 ^ 31;
        llIlllIlI[109] = (((37 + 96) - 127) + 241) ^ (((139 + 164) - 301) + 176);
        llIlllIlI[110] = (47 ^ 16) ^ (74 ^ 51);
        llIlllIlI[111] = (5 ^ 77) ^ (71 ^ 72);
        llIlllIlI[112] = (-((-3815) & 24311)) & (-1025) & 24059;
        llIlllIlI[113] = (-17153) & 20319;
        llIlllIlI[114] = (-25607) & 28126;
        llIlllIlI[115] = (-25113) & 28319;
        llIlllIlI[116] = (-16418) & 18941;
        llIlllIlI[117] = (-((-26682) & 31293)) & (-16705) & 24571;
        llIlllIlI[118] = (-((-18509) & 30830)) & (-16385) & 31231;
        llIlllIlI[119] = (-((-11333) & 32591)) & (-2) & 24511;
        llIlllIlI[120] = (-((-163) & 29863)) & (-1) & 32199;
        llIlllIlI[121] = (-12545) & 15804;
        llIlllIlI[122] = (-((-2882) & 12141)) & (-16897) & 28651;
        llIlllIlI[123] = (-4379) & 7614;
        llIlllIlI[124] = (-8225) & 10734;
        llIlllIlI[125] = (-((-5257) & 30143)) & (-513) & 28607;
        llIlllIlI[126] = (-((-19297) & 27502)) & (-21313) & 32767;
        llIlllIlI[127] = (-9761) & 12263;
        llIlllIlI[128] = (-((-274) & 14199)) & (-1) & 16383;
        llIlllIlI[129] = (-((-15814) & 16343)) & (-20749) & 24575;
        llIlllIlI[130] = (145 ^ 153) ^ (88 ^ 24);
        llIlllIlI[131] = (95 ^ 43) ^ (255 ^ 194);
        llIlllIlI[132] = 249 ^ 179;
        llIlllIlI[133] = 55 ^ 124;
        llIlllIlI[134] = 237 ^ 161;
        llIlllIlI[135] = 82 ^ 31;
        llIlllIlI[136] = (((2 + 188) - 42) + 44) ^ (((19 + 32) - (-104)) + 20);
        llIlllIlI[137] = (-((-3043) & 16355)) & (-16405) & 32254;
        llIlllIlI[138] = (-((-259) & 29483)) & (-1029) & 32765;
        llIlllIlI[139] = (-545) & 3705;
        llIlllIlI[140] = 112 ^ 62;
    }

    private static String lIlllIIllIll(String lIIIIlIIlIIlll, String lIIIIlIIlIIllI) {
        try {
            SecretKeySpec lIIIIlIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlllIlI[4], lIIIIlIIlIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIlIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIlIIlIlIII) {
            lIIIIlIIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlIll(int i) {
        return i != 0;
    }

    private static boolean lIlllIllIllI(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIllIIIl(int i) {
        return i < 0;
    }

    private static boolean lIlllIllIIll(int i, int i2) {
        return i == i2;
    }

    private static int lIlllIlIlIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlllIlIllll(Object obj) {
        return obj != null;
    }

    private static boolean lIlllIlIlllI(int i, int i2) {
        return i >= i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            cg();
            "".length();
            if ("  ".length() == 0) {
                return (39 ^ 22) & ((36 ^ 21) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIlllIlI[108];
    }

    private static boolean lIlllIllIlII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIlllIlI[6]];
        iArr[llIlllIlI[1]] = llIlllIlI[14];
        iArr[llIlllIlI[0]] = llIlllIlI[12];
        iArr[llIlllIlI[4]] = llIlllIlI[15];
        int i = llIlllIlI[1];
        while (lIlllIlIllII(i, iArr.length)) {
            int[] iArr2 = new int[llIlllIlI[0]];
            iArr2[llIlllIlI[1]] = iArr[i];
            if (lIlllIlIllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIlllIlI[1];
            }
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return ((148 ^ 159) ^ (81 ^ 96)) & (((112 ^ 78) ^ (99 ^ 103)) ^ (-" ".length()));
            }
        }
        return llIlllIlI[0];
    }

    private static boolean lIlllIlIllIl(int i) {
        return i == 0;
    }

    private static void lIlllIlIlIII() {
        llIlllIII = new String[llIlllIlI[140]];
        llIlllIII[llIlllIlI[1]] = lIlllIIllIlI("rf1SiSERpkhomKBaUFDD0iOm45lfEFZ2vrLYk8ysEJ8WVt/hGuxuuX8gv6cw0lTy", "SFTBM");
        llIlllIII[llIlllIlI[0]] = lIlllIIllIll("9Ico2sT1LlY=", "MWAmk");
        llIlllIII[llIlllIlI[4]] = lIlllIIllIlI("+hexDA5Ond/YKdYJ6Lac+A==", "zQPsH");
        llIlllIII[llIlllIlI[6]] = lIlllIIlllII("KhEAEDYLHglUOAMeBR00BQ==", "bpntZ");
        llIlllIII[llIlllIlI[7]] = lIlllIIlllII("HgJGOyIsRwszIzoOCD1wOxIIPyNlRxUtOT0EDjM+LkcSNXALMj8THg4=", "IgfZP");
        llIlllIII[llIlllIlI[16]] = lIlllIIllIll("jTivTNfAs+MRto/ZXk+FxJ4G1m7YeQablIjO+Z76HJVUB7Xcnvqlgxb7ln4Sm9miHJhXYaMrsUo=", "LkaEz");
        llIlllIII[llIlllIlI[13]] = lIlllIIlllII("NhQtKDk=", "rfDFR");
        llIlllIII[llIlllIlI[17]] = lIlllIIlllII("DBsX", "IzcDN");
        llIlllIII[llIlllIlI[20]] = lIlllIIlllII("CQsYDlgADRobHSw=", "Bbvix");
        llIlllIII[llIlllIlI[25]] = lIlllIIlllII("GjgOaAw7eRsnFTk4FiwdJg==", "TYxHx");
        llIlllIII[llIlllIlI[21]] = lIlllIIlllII("BQgbFwooAxMISwsIGA4KLw==", "Fgvzk");
        llIlllIII[llIlllIlI[27]] = lIlllIIllIll("orsKwTTA54+V4fxaNvcSrw==", "eqURN");
        llIlllIII[llIlllIlI[28]] = lIlllIIllIll("oVnsM2HBLFM=", "GzPuc");
        llIlllIII[llIlllIlI[2]] = lIlllIIlllII("GAQGNw==", "WtcYQ");
        llIlllIII[llIlllIlI[29]] = lIlllIIllIll("X+hqQv4XQ7g=", "pwBPN");
        llIlllIII[llIlllIlI[30]] = lIlllIIllIll("PleWbEXDLUI=", "akIcS");
        llIlllIII[llIlllIlI[31]] = lIlllIIlllII("JiEGMQ==", "bNiCE");
        llIlllIII[llIlllIlI[32]] = lIlllIIlllII("NjUgIw==", "yEEMB");
        llIlllIII[llIlllIlI[33]] = lIlllIIllIll("uCEmrYywDQDX9PoRYJH5nA==", "jsqbH");
        llIlllIII[llIlllIlI[35]] = lIlllIIllIlI("i5SnL6exbJDyjF1S8oMuSg==", "OlbDm");
        llIlllIII[llIlllIlI[36]] = lIlllIIllIll("Ve2XEJMGyrbWr1VMyNnydA==", "sNYRS");
        llIlllIII[llIlllIlI[38]] = lIlllIIllIll("agPxqHNX/xGQJePVbLgmig==", "dQNyT");
        llIlllIII[llIlllIlI[39]] = lIlllIIllIlI("FdiOl4wirHc+YhKlxPmRfQ==", "NSyzL");
        llIlllIII[llIlllIlI[40]] = lIlllIIllIll("npyqZ1wmVQA61zJgTjM9HQ==", "MxuXN");
        llIlllIII[llIlllIlI[41]] = lIlllIIllIll("a1UR2twoDnw=", "OgLrn");
        llIlllIII[llIlllIlI[42]] = lIlllIIllIlI("foZS6uOJGgW7ISeu29mSGQ==", "mfLnQ");
        llIlllIII[llIlllIlI[43]] = lIlllIIlllII("Ii8nMQ==", "dFUTA");
        llIlllIII[llIlllIlI[45]] = lIlllIIllIll("m7mJOAOQyMg=", "QBcuP");
        llIlllIII[llIlllIlI[46]] = lIlllIIllIlI("STbv6c+V5fw=", "kAlSQ");
        llIlllIII[llIlllIlI[47]] = lIlllIIllIlI("FLjx+bIRlmE=", "cuybm");
        llIlllIII[llIlllIlI[48]] = lIlllIIllIll("vL2Y33W6h84=", "KLPPI");
        llIlllIII[llIlllIlI[55]] = lIlllIIlllII("JgUabxEHRA89EAUGACo=", "hdlOe");
        llIlllIII[llIlllIlI[56]] = lIlllIIllIlI("H2EikSm4E/NtWFKj/lkojw==", "ZipKs");
        llIlllIII[llIlllIlI[57]] = lIlllIIlllII("MB4mBDpeHTkMKg==", "srOiX");
        llIlllIII[llIlllIlI[60]] = lIlllIIlllII("Jzo7Mw==", "cUTAX");
        llIlllIII[llIlllIlI[61]] = lIlllIIllIlI("gHXV0OCscJI=", "mdbdM");
        llIlllIII[llIlllIlI[62]] = lIlllIIlllII("LA06Ow==", "hbUIs");
        llIlllIII[llIlllIlI[63]] = lIlllIIllIll("/H66bILjyLc=", "wRvXX");
        llIlllIII[llIlllIlI[64]] = lIlllIIllIll("R9iFXhhiHcQ=", "FHFwp");
        llIlllIII[llIlllIlI[65]] = lIlllIIllIll("gjvNzW5Npyw=", "ntBZk");
        llIlllIII[llIlllIlI[66]] = lIlllIIllIlI("qVHQreXhWHo=", "bTxus");
        llIlllIII[llIlllIlI[67]] = lIlllIIllIll("KVT8Nwof70swPu0sIUWe/Q==", "oEaGM");
        llIlllIII[llIlllIlI[68]] = lIlllIIlllII("LTgsBxAT", "aYHcu");
        llIlllIII[llIlllIlI[69]] = lIlllIIllIll("6veAIqA+Lv5j5t+mAunxiA==", "PbABi");
        llIlllIII[llIlllIlI[70]] = lIlllIIllIll("eDu+PSAke0Ohrr2PInesIg==", "RFFLB");
        llIlllIII[llIlllIlI[3]] = lIlllIIllIll("1SeROqRFnynzd81sKGFyNQ==", "wazQq");
        llIlllIII[llIlllIlI[71]] = lIlllIIllIll("Gipba8+cizoBx5n2OxRqGw==", "mZJtG");
        llIlllIII[llIlllIlI[72]] = lIlllIIlllII("OR8OIw==", "vokMP");
        llIlllIII[llIlllIlI[73]] = lIlllIIlllII("HBMWAGUwCxYdMQ==", "ScsnE");
        llIlllIII[llIlllIlI[74]] = lIlllIIllIll("CORYFmITeKMCpd4h48Fx1g==", "nflJR");
        llIlllIII[llIlllIlI[24]] = lIlllIIllIll("A7JzBEBptw8=", "nCbxa");
        llIlllIII[llIlllIlI[75]] = lIlllIIllIll("YO4AtK8awIO8Ngo/LKSmjQ==", "dqdtb");
        llIlllIII[llIlllIlI[76]] = lIlllIIllIll("ge0b7AFSePNSGDVYFCQyyFcGepjWce8X", "DPSzY");
        llIlllIII[llIlllIlI[77]] = lIlllIIllIll("4HYMvsKQbVHo+DhqHUCcnw==", "ypKmx");
        llIlllIII[llIlllIlI[78]] = lIlllIIlllII("JjIyMQIM", "gFFPa");
        llIlllIII[llIlllIlI[79]] = lIlllIIllIll("f2OHWUqi3yoFoWtRsTlAFQ==", "ioPSU");
        llIlllIII[llIlllIlI[80]] = lIlllIIllIll("b4SvS40Px4U=", "PGVhp");
        llIlllIII[llIlllIlI[81]] = lIlllIIllIlI("ueTjpBjlxkgvky6wkmgsSg==", "TVzMf");
        llIlllIII[llIlllIlI[82]] = lIlllIIllIlI("JiaPVurcL4M=", "KhNcs");
        llIlllIII[llIlllIlI[83]] = lIlllIIlllII("FRcNEWQ1A08SNjURCgEwMwoB", "ZeobD");
        llIlllIII[llIlllIlI[84]] = lIlllIIllIlI("dk0PTaTJ0/AC0L69CQu9zg==", "qqHTP");
        llIlllIII[llIlllIlI[85]] = lIlllIIllIll("84Kty1eGsBe4vi8LWa0cnioKDsaDPZcW", "ZjMHM");
        llIlllIII[llIlllIlI[86]] = lIlllIIlllII("AQkTNQ==", "UhxPA");
        llIlllIII[llIlllIlI[87]] = lIlllIIllIll("DAo31NIa6wNhnHVlGzJUYQVMk8vO6ido", "ykRKM");
        llIlllIII[llIlllIlI[88]] = lIlllIIllIll("pppZ669Wi0+oT6Z6e3xRXA==", "WvWkX");
        llIlllIII[llIlllIlI[89]] = lIlllIIlllII("HxI5RDY+UzwQIyMH", "QsOdB");
        llIlllIII[llIlllIlI[100]] = lIlllIIllIlI("qM7KK9ildkpORjS8eEvLtA==", "NzodK");
        llIlllIII[llIlllIlI[101]] = lIlllIIlllII("IgUoAzdOOCYZPgcEIA==", "njGpR");
        llIlllIII[llIlllIlI[102]] = lIlllIIlllII("BTwwCiksKGgbJCQiMAgk", "VMEoL");
        llIlllIII[llIlllIlI[109]] = lIlllIIllIll("cFVG8CFzTha/i7bDjfAbZ1mrdzhFABiC", "wBend");
        llIlllIII[llIlllIlI[110]] = lIlllIIllIlI("6ngrlyoLXCB7rLaQYIAL5tSy7ijt4/7K", "wTOHz");
        llIlllIII[llIlllIlI[111]] = lIlllIIllIll("6YZTjjoX/Fc=", "VffHg");
        llIlllIII[llIlllIlI[130]] = lIlllIIllIlI("YLvG4utoKJx3WSXtNGI0QO+JTvJjBU4A", "jIlFd");
        llIlllIII[llIlllIlI[131]] = lIlllIIllIlI("w9TACnMLpsMz7LlttFrDlDmT6XI17izxlnrGDNWuTUM=", "DYfeL");
        llIlllIII[llIlllIlI[132]] = lIlllIIlllII("LR5kSC5FGSRIAAMBIA0VQgYnBQJCAicHA0w=", "buHhg");
        llIlllIII[llIlllIlI[133]] = lIlllIIlllII("ImENFUYfNBhZCxJmAxwVH2g=", "kFayf");
        llIlllIII[llIlllIlI[134]] = lIlllIIllIll("Snx4mCSnwvzSX2n7ONpZ2LU61SHXFmfIH2WaynlZpsNKgUB7yynOxyqB+XMnWET/iCTeycCz1vw=", "yXQui");
        llIlllIII[llIlllIlI[135]] = lIlllIIlllII("PQQEQQ==", "dawoP");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a6, code lost:
        if (lIlllIlIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIlI[9]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x022f, code lost:
        if (lIlllIlIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIlI[9]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02b8, code lost:
        if (lIlllIlIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIlI[9]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x036a, code lost:
        if (lIlllIlIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIlI[7]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlllIlIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.K.llIlllIlI[13]) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03b0  */
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
        int[] iArr8 = new int[llIlllIlI[0]];
        iArr8[llIlllIlI[1]] = llIlllIlI[12];
        if (lIlllIlIlIll(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llIlllIlI[0]];
            iArr9[llIlllIlI[1]] = llIlllIlI[12];
            if (lIlllIlIlIll(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIlllIlI[0]];
                iArr10[llIlllIlI[1]] = llIlllIlI[12];
            }
            if (lIlllIlIllIl(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llIlllIII[llIlllIlI[110]]);
            }) ? 1 : 0)) {
                bx.add(new C0003d(llIlllIlI[104], llIlllIlI[16], llIlllIlI[105]));
                "".length();
            }
            iArr = new int[llIlllIlI[0]];
            iArr[llIlllIlI[1]] = llIlllIlI[15];
            if (lIlllIlIlIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[llIlllIlI[0]];
                iArr11[llIlllIlI[1]] = llIlllIlI[15];
                if (lIlllIlIllII(Bank.getFirst(iArr11).getQuantity(), llIlllIlI[7])) {
                    int i = llIlllIlI[15];
                    int i2 = llIlllIlI[7];
                    int[] iArr12 = new int[llIlllIlI[0]];
                    iArr12[llIlllIlI[1]] = llIlllIlI[15];
                    bx.add(new C0003d(i, i2 - Bank.getFirst(iArr12).getQuantity(), llIlllIlI[106]));
                    "".length();
                }
            }
            iArr2 = new int[llIlllIlI[0]];
            iArr2[llIlllIlI[1]] = llIlllIlI[10];
            if (lIlllIlIlIll(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr13 = new int[llIlllIlI[0]];
                iArr13[llIlllIlI[1]] = llIlllIlI[10];
                if (lIlllIlIlIll(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[llIlllIlI[0]];
                    iArr14[llIlllIlI[1]] = llIlllIlI[10];
                }
                iArr3 = new int[llIlllIlI[0]];
                iArr3[llIlllIlI[1]] = llIlllIlI[8];
                if (lIlllIlIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr15 = new int[llIlllIlI[0]];
                    iArr15[llIlllIlI[1]] = llIlllIlI[8];
                    if (lIlllIlIlIll(Bank.contains(iArr15) ? 1 : 0)) {
                        int[] iArr16 = new int[llIlllIlI[0]];
                        iArr16[llIlllIlI[1]] = llIlllIlI[8];
                    }
                    iArr4 = new int[llIlllIlI[0]];
                    iArr4[llIlllIlI[1]] = llIlllIlI[11];
                    if (lIlllIlIlIll(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr17 = new int[llIlllIlI[0]];
                        iArr17[llIlllIlI[1]] = llIlllIlI[11];
                        if (lIlllIlIlIll(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llIlllIlI[0]];
                            iArr18[llIlllIlI[1]] = llIlllIlI[11];
                        }
                        iArr5 = new int[llIlllIlI[0]];
                        iArr5[llIlllIlI[1]] = llIlllIlI[15];
                        if (lIlllIlIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                            bx.add(new C0003d(llIlllIlI[15], llIlllIlI[7], llIlllIlI[106]));
                            "".length();
                        }
                        iArr6 = new int[llIlllIlI[0]];
                        iArr6[llIlllIlI[1]] = llIlllIlI[18];
                        if (lIlllIlIlIll(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr19 = new int[llIlllIlI[0]];
                            iArr19[llIlllIlI[1]] = llIlllIlI[18];
                        }
                        bx.add(new C0003d(llIlllIlI[18], llIlllIlI[7], C0009j.ch));
                        "".length();
                        iArr7 = new int[llIlllIlI[0]];
                        iArr7[llIlllIlI[1]] = llIlllIlI[14];
                        if (lIlllIlIlIll(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr20 = new int[llIlllIlI[0]];
                            iArr20[llIlllIlI[1]] = llIlllIlI[14];
                            if (!lIlllIlIlIll(Bank.contains(iArr20) ? 1 : 0)) {
                                return;
                            }
                            int[] iArr21 = new int[llIlllIlI[0]];
                            iArr21[llIlllIlI[1]] = llIlllIlI[14];
                            if (!lIlllIlIllII(Bank.getFirst(iArr21).getQuantity(), llIlllIlI[30])) {
                                return;
                            }
                        }
                        bx.add(new C0003d(llIlllIlI[14], llIlllIlI[66], llIlllIlI[107]));
                        "".length();
                    }
                    bx.add(new C0003d(llIlllIlI[11], llIlllIlI[9], llIlllIlI[21]));
                    "".length();
                    iArr5 = new int[llIlllIlI[0]];
                    iArr5[llIlllIlI[1]] = llIlllIlI[15];
                    if (lIlllIlIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    iArr6 = new int[llIlllIlI[0]];
                    iArr6[llIlllIlI[1]] = llIlllIlI[18];
                    if (lIlllIlIlIll(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIlllIlI[18], llIlllIlI[7], C0009j.ch));
                    "".length();
                    iArr7 = new int[llIlllIlI[0]];
                    iArr7[llIlllIlI[1]] = llIlllIlI[14];
                    if (lIlllIlIlIll(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(llIlllIlI[14], llIlllIlI[66], llIlllIlI[107]));
                    "".length();
                }
                bx.add(new C0003d(llIlllIlI[8], llIlllIlI[9], llIlllIlI[21]));
                "".length();
                iArr4 = new int[llIlllIlI[0]];
                iArr4[llIlllIlI[1]] = llIlllIlI[11];
                if (lIlllIlIlIll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlllIlI[11], llIlllIlI[9], llIlllIlI[21]));
                "".length();
                iArr5 = new int[llIlllIlI[0]];
                iArr5[llIlllIlI[1]] = llIlllIlI[15];
                if (lIlllIlIllIl(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[llIlllIlI[0]];
                iArr6[llIlllIlI[1]] = llIlllIlI[18];
                if (lIlllIlIlIll(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlllIlI[18], llIlllIlI[7], C0009j.ch));
                "".length();
                iArr7 = new int[llIlllIlI[0]];
                iArr7[llIlllIlI[1]] = llIlllIlI[14];
                if (lIlllIlIlIll(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bx.add(new C0003d(llIlllIlI[14], llIlllIlI[66], llIlllIlI[107]));
                "".length();
            }
            bx.add(new C0003d(llIlllIlI[10], llIlllIlI[9], llIlllIlI[21]));
            "".length();
            iArr3 = new int[llIlllIlI[0]];
            iArr3[llIlllIlI[1]] = llIlllIlI[8];
            if (lIlllIlIlIll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlllIlI[8], llIlllIlI[9], llIlllIlI[21]));
            "".length();
            iArr4 = new int[llIlllIlI[0]];
            iArr4[llIlllIlI[1]] = llIlllIlI[11];
            if (lIlllIlIlIll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlllIlI[11], llIlllIlI[9], llIlllIlI[21]));
            "".length();
            iArr5 = new int[llIlllIlI[0]];
            iArr5[llIlllIlI[1]] = llIlllIlI[15];
            if (lIlllIlIllIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llIlllIlI[0]];
            iArr6[llIlllIlI[1]] = llIlllIlI[18];
            if (lIlllIlIlIll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlllIlI[18], llIlllIlI[7], C0009j.ch));
            "".length();
            iArr7 = new int[llIlllIlI[0]];
            iArr7[llIlllIlI[1]] = llIlllIlI[14];
            if (lIlllIlIlIll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bx.add(new C0003d(llIlllIlI[14], llIlllIlI[66], llIlllIlI[107]));
            "".length();
        }
        bx.add(new C0003d(llIlllIlI[12], llIlllIlI[13], llIlllIlI[103]));
        "".length();
        if (lIlllIlIllIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llIlllIII[llIlllIlI[110]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[llIlllIlI[0]];
        iArr[llIlllIlI[1]] = llIlllIlI[15];
        if (lIlllIlIlIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[llIlllIlI[0]];
        iArr2[llIlllIlI[1]] = llIlllIlI[10];
        if (lIlllIlIlIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlllIlI[10], llIlllIlI[9], llIlllIlI[21]));
        "".length();
        iArr3 = new int[llIlllIlI[0]];
        iArr3[llIlllIlI[1]] = llIlllIlI[8];
        if (lIlllIlIlIll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlllIlI[8], llIlllIlI[9], llIlllIlI[21]));
        "".length();
        iArr4 = new int[llIlllIlI[0]];
        iArr4[llIlllIlI[1]] = llIlllIlI[11];
        if (lIlllIlIlIll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlllIlI[11], llIlllIlI[9], llIlllIlI[21]));
        "".length();
        iArr5 = new int[llIlllIlI[0]];
        iArr5[llIlllIlI[1]] = llIlllIlI[15];
        if (lIlllIlIllIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llIlllIlI[0]];
        iArr6[llIlllIlI[1]] = llIlllIlI[18];
        if (lIlllIlIlIll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlllIlI[18], llIlllIlI[7], C0009j.ch));
        "".length();
        iArr7 = new int[llIlllIlI[0]];
        iArr7[llIlllIlI[1]] = llIlllIlI[14];
        if (lIlllIlIlIll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bx.add(new C0003d(llIlllIlI[14], llIlllIlI[66], llIlllIlI[107]));
        "".length();
    }
}
