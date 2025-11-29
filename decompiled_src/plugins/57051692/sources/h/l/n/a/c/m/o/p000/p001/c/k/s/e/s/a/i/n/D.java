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
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.D  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/D.class */
public class D implements K {
    private static final /* synthetic */ int ip;
    private static final /* synthetic */ WorldPoint id;
    static /* synthetic */ String[] hn;
    private static final /* synthetic */ int hI;
    public static final /* synthetic */ WorldArea hD;
    private static final /* synthetic */ WorldPoint ic;
    private static final /* synthetic */ int iq;
    private static final /* synthetic */ WorldPoint hY;
    private static final /* synthetic */ WorldPoint ih;
    public static final /* synthetic */ WorldArea hz;
    private static final /* synthetic */ WorldPoint ib;
    private static final /* synthetic */ int hK;
    private static final /* synthetic */ WorldPoint ii;
    private static final /* synthetic */ int hH;
    private static final /* synthetic */ int im;
    public static /* synthetic */ int iw;
    private static final /* synthetic */ WorldArea ij;
    private static final /* synthetic */ WorldArea il;
    public static final /* synthetic */ WorldArea hB;
    static /* synthetic */ String iy;
    private static final /* synthetic */ WorldPoint ia;
    private static final /* synthetic */ WorldPoint hT;
    private static /* synthetic */ int[] iz;
    private static final /* synthetic */ WorldArea ik;
    private static final /* synthetic */ WorldPoint hU;
    static /* synthetic */ int dc;
    private static /* synthetic */ int[] lIlIlIIIIl;
    private static /* synthetic */ String[] lIlIIlllIl;
    public static final /* synthetic */ WorldArea hF;
    private static final /* synthetic */ int hP;
    private static final /* synthetic */ int hM;
    private static final /* synthetic */ int hQ;
    private static final /* synthetic */ int hR;
    private static final /* synthetic */ WorldPoint hX;
    private static final /* synthetic */ int it;
    private static final /* synthetic */ int iv;
    public static final /* synthetic */ WorldArea hA;
    private static final /* synthetic */ WorldPoint hZ;
    private static final /* synthetic */ int ir;
    public static /* synthetic */ List<C0003d> bp;
    private static final /* synthetic */ int hS;
    private static final /* synthetic */ int iu;
    private static final /* synthetic */ WorldPoint ig;
    public static final /* synthetic */ WorldPoint hx;
    private static final /* synthetic */ WorldPoint hV;
    public static final /* synthetic */ WorldPoint hv;
    public static /* synthetic */ int ix;
    private static final /* synthetic */ WorldPoint hW;
    private static final /* synthetic */ int hO;
    public static /* synthetic */ boolean bn;
    public static final /* synthetic */ WorldArea hy;
    private static final /* synthetic */ int hJ;
    private static final /* synthetic */ int in;
    public static final /* synthetic */ WorldPoint hw;
    private static final /* synthetic */ int io;

    /* renamed from: if  reason: not valid java name */
    private static final /* synthetic */ WorldPoint f0if;
    private static final /* synthetic */ int is;
    public static final /* synthetic */ WorldArea hE;
    private static final /* synthetic */ int hN;
    private static final /* synthetic */ int hL;
    public static final /* synthetic */ WorldArea hC;
    private static final /* synthetic */ WorldPoint ie;
    private static final /* synthetic */ int hG;
    static /* synthetic */ boolean dd;

    /* JADX WARN: Multi-variable type inference failed */
    public static void bS() {
        if (lIIIllllIlIIl(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIIllllIIlll(Movement.getRunEnergy(), lIlIlIIIIl[68])) {
            Inventory.getFirst(C0005f.aU).interact(lIlIIlllIl[lIlIlIIIIl[80]]);
            Time.sleepTicks(lIlIlIIIIl[3]);
            "".length();
        }
        if (lIIIllllIlIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!lIIIllllIlIlI(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hY), lIlIlIIIIl[1])) {
            AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[81]];
            Movement.walkTo(new WorldPoint(lIlIlIIIIl[58], lIlIlIIIIl[59], lIlIlIIIIl[4]));
            "".length();
            Time.sleepTicks(lIlIlIIIIl[3]);
            "".length();
        }
        int[] iArr = new int[lIlIlIIIIl[3]];
        iArr[lIlIlIIIIl[4]] = lIlIlIIIIl[82];
        NPC nearest = NPCs.getNearest(iArr);
        int[] iArr2 = new int[lIlIlIIIIl[3]];
        iArr2[lIlIlIIIIl[4]] = lIlIlIIIIl[60];
        if (lIIIllllIlIlI(Inventory.contains(iArr2) ? 1 : 0)) {
            if (lIIIllllIlIIl(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIllIl(nearest) && lIIIllllIlIIl(hE.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(lIlIlIIIIl[24]);
                "".length();
                while (lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hv), lIlIlIIIIl[3]) && lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[83]];
                    Movement.walkTo(hv);
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
            }
            if (lIIIllllIlIIl(hz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIllIl(nearest) && lIIIllllIlIIl(hB.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hw), lIlIlIIIIl[3]) && lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[84]];
                    Movement.walkTo(hw);
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                    "".length();
                    if (((183 ^ 160) & ((96 ^ 119) ^ (-1))) >= "   ".length()) {
                        return;
                    }
                }
            }
            if (lIIIllllIlIIl(hA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIllIl(nearest) && lIIIllllIlIIl(hF.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(lIlIlIIIIl[18]);
                "".length();
                while (lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hx), lIlIlIIIIl[3]) && lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[85]];
                    Movement.walkTo(hx);
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                    "".length();
                    if (((true ^ true) & ((true ^ true) ^ true)) == (true ^ true)) {
                        return;
                    }
                }
            }
            if (lIIIllllIlIIl(hD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIllIl(nearest) && lIIIllllIlIIl(hF.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(ii), lIlIlIIIIl[1]) && lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[86]];
                    Movement.walkTo(ii);
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                }
            }
            if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(ii), lIlIlIIIIl[12])) {
                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[87]];
                String[] strArr = new String[lIlIlIIIIl[3]];
                strArr[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[88]];
                TileObject nearest2 = TileObjects.getNearest(strArr);
                if (lIIIllllIllIl(nearest2)) {
                    nearest2.interact(lIlIIlllIl[lIlIlIIIIl[89]]);
                    Time.sleepTicks(lIlIlIIIIl[1]);
                    "".length();
                    Widget widget = Widgets.get(lIlIlIIIIl[23], lIlIlIIIIl[3]);
                    if (lIIIllllIllIl(widget)) {
                        widget.interact(lIlIIlllIl[lIlIlIIIIl[90]]);
                        widget.interact(lIlIlIIIIl[4]);
                        widget.interact(lIlIIlllIl[lIlIlIIIIl[91]]);
                        Keyboard.type(lIlIIlllIl[lIlIlIIIIl[92]]);
                    }
                }
            }
        }
        int[] iArr3 = new int[lIlIlIIIIl[3]];
        iArr3[lIlIlIIIIl[4]] = lIlIlIIIIl[60];
        if (lIIIllllIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
            if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(ii), lIlIlIIIIl[12])) {
                while (lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIlIlIIIIl[93], lIlIlIIIIl[94], lIlIlIIIIl[4])), lIlIlIIIIl[3]) && lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[95]];
                    Movement.walkTo(new WorldPoint(lIlIlIIIIl[93], lIlIlIIIIl[94], lIlIlIIIIl[4]));
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                    "".length();
                    if ((-"  ".length()) >= 0) {
                        return;
                    }
                }
            }
            if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIlIlIIIIl[93], lIlIlIIIIl[94], lIlIlIIIIl[4])), lIlIlIIIIl[1]) && lIIIllllIllIl(nearest) && lIIIllllIlIIl(hE.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hw), lIlIlIIIIl[3]) && lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[96]];
                    Movement.walkTo(hw);
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                    "".length();
                    if (((185 ^ 131) ^ (90 ^ 101)) <= 0) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x010f, code lost:
        if (lIIIllllIIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.D.lIlIlIIIIl[13]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0217, code lost:
        if (lIIIllllIIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.D.lIlIlIIIIl[22]) != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[lIlIlIIIIl[3]];
        iArr7[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
        if (lIIIllllIlIlI(Bank.contains(iArr7) ? 1 : 0)) {
            bp.add(new C0003d(lIlIlIIIIl[8], lIlIlIIIIl[109], lIlIlIIIIl[110]));
            "".length();
        }
        int[] iArr8 = new int[lIlIlIIIIl[3]];
        iArr8[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
        if (lIIIllllIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIlIlIIIIl[3]];
            iArr9[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
            if (lIIIllllIIlll(Bank.getFirst(iArr9).getQuantity(), lIlIlIIIIl[33])) {
                bp.add(new C0003d(lIlIlIIIIl[8], lIlIlIIIIl[54], lIlIlIIIIl[110]));
                "".length();
            }
        }
        int[] iArr10 = new int[lIlIlIIIIl[3]];
        iArr10[lIlIlIIIIl[4]] = lIlIlIIIIl[9];
        if (lIIIllllIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[lIlIlIIIIl[3]];
            iArr11[lIlIlIIIIl[4]] = lIlIlIIIIl[9];
            if (lIIIllllIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlIlIIIIl[3]];
                iArr12[lIlIlIIIIl[4]] = lIlIlIIIIl[9];
            }
            if (lIIIllllIlIlI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIlIIlllIl[lIlIlIIIIl[117]]);
            }) ? 1 : 0)) {
                bp.add(new C0003d(lIlIlIIIIl[112], lIlIlIIIIl[31], lIlIlIIIIl[113]));
                "".length();
            }
            iArr = new int[lIlIlIIIIl[3]];
            iArr[lIlIlIIIIl[4]] = lIlIlIIIIl[105];
            if (lIIIllllIlIlI(Bank.contains(iArr) ? 1 : 0)) {
                bp.add(new C0003d(lIlIlIIIIl[105], lIlIlIIIIl[54], lIlIlIIIIl[114]));
                "".length();
            }
            iArr2 = new int[lIlIlIIIIl[3]];
            iArr2[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
            if (lIIIllllIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr13 = new int[lIlIlIIIIl[3]];
                iArr13[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                if (lIIIllllIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[lIlIlIIIIl[3]];
                    iArr14[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                }
                iArr3 = new int[lIlIlIIIIl[3]];
                iArr3[lIlIlIIIIl[4]] = lIlIlIIIIl[108];
                if (lIIIllllIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIlIIIIl[108], lIlIlIIIIl[13], C0009j.bZ));
                    "".length();
                }
                iArr4 = new int[lIlIlIIIIl[3]];
                iArr4[lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                if (lIIIllllIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlIlIIIIl[3]];
                    iArr15[lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                    if (lIIIllllIIlll(Bank.getFirst(iArr15).getQuantity(), lIlIlIIIIl[101])) {
                        bp.add(new C0003d(lIlIlIIIIl[7], lIlIlIIIIl[115], lIlIlIIIIl[18]));
                        "".length();
                    }
                }
                iArr5 = new int[lIlIlIIIIl[3]];
                iArr5[lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                if (lIIIllllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr16 = new int[lIlIlIIIIl[3]];
                    iArr16[lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                    if (lIIIllllIIlll(Bank.getFirst(iArr16).getQuantity(), lIlIlIIIIl[101])) {
                        bp.add(new C0003d(lIlIlIIIIl[5], lIlIlIIIIl[115], lIlIlIIIIl[18]));
                        "".length();
                    }
                }
                iArr6 = new int[lIlIlIIIIl[3]];
                iArr6[lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                if (lIIIllllIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[lIlIlIIIIl[3]];
                    iArr17[lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                    if (lIIIllllIIlll(Bank.getFirst(iArr17).getQuantity(), lIlIlIIIIl[101])) {
                        bp.add(new C0003d(lIlIlIIIIl[6], lIlIlIIIIl[115], lIlIlIIIIl[18]));
                        "".length();
                        return;
                    }
                    return;
                }
                return;
            }
            bp.add(new C0003d(lIlIlIIIIl[10], lIlIlIIIIl[33], lIlIlIIIIl[114]));
            "".length();
            iArr3 = new int[lIlIlIIIIl[3]];
            iArr3[lIlIlIIIIl[4]] = lIlIlIIIIl[108];
            if (lIIIllllIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIlIlIIIIl[3]];
            iArr4[lIlIlIIIIl[4]] = lIlIlIIIIl[7];
            if (lIIIllllIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIlIlIIIIl[3]];
            iArr5[lIlIlIIIIl[4]] = lIlIlIIIIl[5];
            if (lIIIllllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIlIlIIIIl[3]];
            iArr6[lIlIlIIIIl[4]] = lIlIlIIIIl[6];
            if (lIIIllllIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
        }
        bp.add(new C0003d(lIlIlIIIIl[9], lIlIlIIIIl[13], lIlIlIIIIl[111]));
        "".length();
        if (lIIIllllIlIlI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIlIIlllIl[lIlIlIIIIl[117]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIlIlIIIIl[3]];
        iArr[lIlIlIIIIl[4]] = lIlIlIIIIl[105];
        if (lIIIllllIlIlI(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIlIlIIIIl[3]];
        iArr2[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
        if (lIIIllllIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIlIIIIl[10], lIlIlIIIIl[33], lIlIlIIIIl[114]));
        "".length();
        iArr3 = new int[lIlIlIIIIl[3]];
        iArr3[lIlIlIIIIl[4]] = lIlIlIIIIl[108];
        if (lIIIllllIlIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIlIlIIIIl[3]];
        iArr4[lIlIlIIIIl[4]] = lIlIlIIIIl[7];
        if (lIIIllllIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIlIlIIIIl[3]];
        iArr5[lIlIlIIIIl[4]] = lIlIlIIIIl[5];
        if (lIIIllllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIlIlIIIIl[3]];
        iArr6[lIlIlIIIIl[4]] = lIlIlIIIIl[6];
        if (lIIIllllIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
    }

    private static boolean lIIIllllIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllllIlllI(Object obj) {
        return obj == null;
    }

    static {
        lIIIllllIIllI();
        lIIIllllIIlIl();
        ip = lIlIlIIIIl[118];
        it = lIlIlIIIIl[119];
        ir = lIlIlIIIIl[5];
        hK = lIlIlIIIIl[1];
        hJ = lIlIlIIIIl[3];
        hL = lIlIlIIIIl[12];
        hQ = lIlIlIIIIl[60];
        hP = lIlIlIIIIl[17];
        iv = lIlIlIIIIl[9];
        hO = lIlIlIIIIl[82];
        is = lIlIlIIIIl[6];
        hH = lIlIlIIIIl[1];
        hI = lIlIlIIIIl[2];
        io = lIlIlIIIIl[120];
        hM = lIlIlIIIIl[14];
        hS = lIlIlIIIIl[19];
        im = lIlIlIIIIl[121];
        iq = lIlIlIIIIl[7];
        iu = lIlIlIIIIl[8];
        hR = lIlIlIIIIl[39];
        in = lIlIlIIIIl[122];
        hG = lIlIlIIIIl[0];
        hN = lIlIlIIIIl[18];
        hv = new WorldPoint(lIlIlIIIIl[123], lIlIlIIIIl[59], lIlIlIIIIl[4]);
        hw = new WorldPoint(lIlIlIIIIl[62], lIlIlIIIIl[124], lIlIlIIIIl[4]);
        hx = new WorldPoint(lIlIlIIIIl[125], lIlIlIIIIl[94], lIlIlIIIIl[4]);
        hy = new WorldArea(lIlIlIIIIl[126], lIlIlIIIIl[127], lIlIlIIIIl[31], lIlIlIIIIl[14], lIlIlIIIIl[4]);
        hz = new WorldArea(lIlIlIIIIl[128], lIlIlIIIIl[127], lIlIlIIIIl[30], lIlIlIIIIl[14], lIlIlIIIIl[4]);
        hA = new WorldArea(lIlIlIIIIl[129], lIlIlIIIIl[130], lIlIlIIIIl[15], lIlIlIIIIl[22], lIlIlIIIIl[4]);
        hB = new WorldArea(lIlIlIIIIl[131], lIlIlIIIIl[132], lIlIlIIIIl[24], lIlIlIIIIl[15], lIlIlIIIIl[4]);
        hC = new WorldArea(lIlIlIIIIl[133], lIlIlIIIIl[132], lIlIlIIIIl[18], lIlIlIIIIl[13], lIlIlIIIIl[4]);
        hD = new WorldArea(lIlIlIIIIl[134], lIlIlIIIIl[135], lIlIlIIIIl[21], lIlIlIIIIl[18], lIlIlIIIIl[4]);
        hE = new WorldArea(lIlIlIIIIl[136], lIlIlIIIIl[132], lIlIlIIIIl[15], lIlIlIIIIl[15], lIlIlIIIIl[4]);
        hF = new WorldArea(lIlIlIIIIl[137], lIlIlIIIIl[132], lIlIlIIIIl[15], lIlIlIIIIl[13], lIlIlIIIIl[4]);
        hT = new WorldPoint(lIlIlIIIIl[138], lIlIlIIIIl[139], lIlIlIIIIl[1]);
        hU = new WorldPoint(lIlIlIIIIl[140], lIlIlIIIIl[141], lIlIlIIIIl[4]);
        hV = new WorldPoint(lIlIlIIIIl[142], lIlIlIIIIl[127], lIlIlIIIIl[4]);
        hW = new WorldPoint(lIlIlIIIIl[143], lIlIlIIIIl[144], lIlIlIIIIl[4]);
        hX = new WorldPoint(lIlIlIIIIl[145], lIlIlIIIIl[146], lIlIlIIIIl[4]);
        hY = new WorldPoint(lIlIlIIIIl[131], lIlIlIIIIl[94], lIlIlIIIIl[4]);
        hZ = new WorldPoint(lIlIlIIIIl[147], lIlIlIIIIl[148], lIlIlIIIIl[4]);
        ia = new WorldPoint(lIlIlIIIIl[149], lIlIlIIIIl[150], lIlIlIIIIl[4]);
        ib = new WorldPoint(lIlIlIIIIl[145], lIlIlIIIIl[151], lIlIlIIIIl[4]);
        ic = new WorldPoint(lIlIlIIIIl[131], lIlIlIIIIl[151], lIlIlIIIIl[4]);
        id = new WorldPoint(lIlIlIIIIl[131], lIlIlIIIIl[152], lIlIlIIIIl[4]);
        ie = new WorldPoint(lIlIlIIIIl[136], lIlIlIIIIl[151], lIlIlIIIIl[4]);
        f0if = new WorldPoint(lIlIlIIIIl[136], lIlIlIIIIl[152], lIlIlIIIIl[4]);
        ig = new WorldPoint(lIlIlIIIIl[58], lIlIlIIIIl[153], lIlIlIIIIl[4]);
        ih = new WorldPoint(lIlIlIIIIl[62], lIlIlIIIIl[135], lIlIlIIIIl[4]);
        ii = new WorldPoint(lIlIlIIIIl[154], lIlIlIIIIl[155], lIlIlIIIIl[4]);
        ij = new WorldArea(new WorldPoint(lIlIlIIIIl[156], lIlIlIIIIl[157], lIlIlIIIIl[4]), new WorldPoint(lIlIlIIIIl[58], lIlIlIIIIl[94], lIlIlIIIIl[4]));
        ik = new WorldArea(new WorldPoint(lIlIlIIIIl[145], lIlIlIIIIl[158], lIlIlIIIIl[4]), new WorldPoint(lIlIlIIIIl[159], lIlIlIIIIl[160], lIlIlIIIIl[4]));
        il = new WorldArea(lIlIlIIIIl[62], lIlIlIIIIl[130], lIlIlIIIIl[14], lIlIlIIIIl[22], lIlIlIIIIl[4]);
        bp = new ArrayList();
        iw = lIlIlIIIIl[161];
        ix = lIlIlIIIIl[162];
        iy = lIlIIlllIl[lIlIlIIIIl[163]];
        String[] strArr = new String[lIlIlIIIIl[14]];
        strArr[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[164]];
        strArr[lIlIlIIIIl[3]] = lIlIIlllIl[lIlIlIIIIl[165]];
        strArr[lIlIlIIIIl[1]] = lIlIIlllIl[lIlIlIIIIl[166]];
        strArr[lIlIlIIIIl[12]] = lIlIIlllIl[lIlIlIIIIl[167]];
        strArr[lIlIlIIIIl[15]] = lIlIIlllIl[lIlIlIIIIl[168]];
        strArr[lIlIlIIIIl[13]] = lIlIIlllIl[lIlIlIIIIl[169]];
        hn = strArr;
        int[] iArr = new int[lIlIlIIIIl[15]];
        iArr[lIlIlIIIIl[4]] = lIlIlIIIIl[170];
        iArr[lIlIlIIIIl[3]] = lIlIlIIIIl[171];
        iArr[lIlIlIIIIl[1]] = lIlIlIIIIl[172];
        iArr[lIlIlIIIIl[12]] = lIlIlIIIIl[173];
        iz = iArr;
    }

    private static boolean lIIIllllIlIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIllllIlIII(int i, int i2) {
        return i == i2;
    }

    private static void lIIIllllIIllI() {
        lIlIlIIIIl = new int[175];
        lIlIlIIIIl[0] = ((126 + 21) - 121) + 134;
        lIlIlIIIIl[1] = "  ".length();
        lIlIlIIIIl[2] = ((194 + 97) - 152) + 87;
        lIlIlIIIIl[3] = " ".length();
        lIlIlIIIIl[4] = (52 ^ 51) & ((55 ^ 48) ^ (-1));
        lIlIlIIIIl[5] = (-((-17409) & 31889)) & (-16453) & 31487;
        lIlIlIIIIl[6] = (-8593) & 9149;
        lIlIlIIIIl[7] = (-6482) & 7039;
        lIlIlIIIIl[8] = (-13313) & 13691;
        lIlIlIIIIl[9] = (-((-16481) & 22639)) & (-16417) & 24559;
        lIlIlIIIIl[10] = (-((-6469) & 31191)) & (-33) & 32763;
        lIlIlIIIIl[11] = (((53 ^ 25) + (21 ^ 45)) - (75 ^ 123)) + (251 ^ 153);
        lIlIlIIIIl[12] = "   ".length();
        lIlIlIIIIl[13] = (((19 + 16) - 20) + 136) ^ (((77 + 103) - 99) + 65);
        lIlIlIIIIl[14] = (((43 + 30) - (-26)) + 36) ^ (((93 + 14) - 63) + 85);
        lIlIlIIIIl[15] = 149 ^ 145;
        lIlIlIIIIl[16] = (53 ^ 27) ^ (247 ^ 137);
        lIlIlIIIIl[17] = (-((-18537) & 28393)) & (-4117) & 16381;
        lIlIlIIIIl[18] = (11 ^ 86) ^ (155 ^ 193);
        lIlIlIIIIl[19] = (-21577) & 24443;
        lIlIlIIIIl[20] = (91 ^ 82) ^ " ".length();
        lIlIlIIIIl[21] = (187 ^ 137) ^ (64 ^ 123);
        lIlIlIIIIl[22] = (52 ^ 88) ^ (127 ^ 25);
        lIlIlIIIIl[23] = ((99 + 1) - (-34)) + 95;
        lIlIlIIIIl[24] = 149 ^ 158;
        lIlIlIIIIl[25] = (((137 + 83) - 121) + 43) ^ (((102 + 43) - 67) + 52);
        lIlIlIIIIl[26] = (((90 + 92) - 16) + 20) ^ (((71 + 56) - 58) + 114);
        lIlIlIIIIl[27] = 132 ^ 138;
        lIlIlIIIIl[28] = 139 ^ 132;
        lIlIlIIIIl[29] = 160 ^ 176;
        lIlIlIIIIl[30] = 155 ^ 138;
        lIlIlIIIIl[31] = (0 ^ 17) ^ "   ".length();
        lIlIlIIIIl[32] = 122 ^ 105;
        lIlIlIIIIl[33] = (((71 + 47) - 69) + 85) ^ (((107 + 96) - 183) + 126);
        lIlIlIIIIl[34] = (219 ^ 154) ^ (31 ^ 75);
        lIlIlIIIIl[35] = (150 ^ 186) ^ (122 ^ 64);
        lIlIlIIIIl[36] = 181 ^ 162;
        lIlIlIIIIl[37] = 44 ^ 52;
        lIlIlIIIIl[38] = (58 ^ 114) ^ (203 ^ 154);
        lIlIlIIIIl[39] = (-20614) & 23023;
        lIlIlIIIIl[40] = (((40 + 94) - 13) + 59) ^ (((69 + 95) - 127) + 137);
        lIlIlIIIIl[41] = (146 ^ 173) ^ (31 ^ 59);
        lIlIlIIIIl[42] = 122 ^ 102;
        lIlIlIIIIl[43] = (231 ^ 157) ^ (237 ^ 138);
        lIlIlIIIIl[44] = 132 ^ 154;
        lIlIlIIIIl[45] = 150 ^ 137;
        lIlIlIIIIl[46] = 48 ^ 16;
        lIlIlIIIIl[47] = 86 ^ 119;
        lIlIlIIIIl[48] = 91 ^ 121;
        lIlIlIIIIl[49] = 57 ^ 26;
        lIlIlIIIIl[50] = 72 ^ 108;
        lIlIlIIIIl[51] = (23 ^ 54) ^ (134 ^ 130);
        lIlIlIIIIl[52] = (29 ^ 23) ^ (139 ^ 167);
        lIlIlIIIIl[53] = 19 ^ 52;
        lIlIlIIIIl[54] = 138 ^ 162;
        lIlIlIIIIl[55] = (((27 + 94) - 103) + 144) ^ (((64 + 22) - (-41)) + 12);
        lIlIlIIIIl[56] = 145 ^ 187;
        lIlIlIIIIl[57] = 168 ^ 131;
        lIlIlIIIIl[58] = (-((-2629) & 7885)) & (-8193) & 16349;
        lIlIlIIIIl[59] = (-8819) & 12278;
        lIlIlIIIIl[60] = (-12821) & 15231;
        lIlIlIIIIl[61] = (((18 + 131) - 56) + 69) ^ (((98 + 95) - 82) + 31);
        lIlIlIIIIl[62] = (-25603) & 28535;
        lIlIlIIIIl[63] = 129 ^ 172;
        lIlIlIIIIl[64] = (119 ^ 98) ^ (110 ^ 85);
        lIlIlIIIIl[65] = 42 ^ 5;
        lIlIlIIIIl[66] = (((6 + 65) - (-55)) + 63) ^ (((125 + 124) - 162) + 54);
        lIlIlIIIIl[67] = (((150 + 171) - 302) + 164) ^ (((50 + 0) - (-13)) + 71);
        lIlIlIIIIl[68] = 35 ^ 17;
        lIlIlIIIIl[69] = (57 ^ 1) ^ (158 ^ 149);
        lIlIlIIIIl[70] = (((132 + 141) - 177) + 46) ^ (((179 + 85) - 92) + 14);
        lIlIlIIIIl[71] = (95 ^ 72) ^ (154 ^ 184);
        lIlIlIIIIl[72] = 244 ^ 194;
        lIlIlIIIIl[73] = (101 ^ 62) ^ (216 ^ 180);
        lIlIlIIIIl[74] = 164 ^ 156;
        lIlIlIIIIl[75] = (91 ^ 60) ^ (228 ^ 186);
        lIlIlIIIIl[76] = (149 ^ 159) ^ (90 ^ 106);
        lIlIlIIIIl[77] = 153 ^ 162;
        lIlIlIIIIl[78] = (135 ^ 167) ^ (117 ^ 105);
        lIlIlIIIIl[79] = 76 ^ 113;
        lIlIlIIIIl[80] = (126 ^ 112) ^ (159 ^ 175);
        lIlIlIIIIl[81] = (155 ^ 199) ^ (228 ^ 135);
        lIlIlIIIIl[82] = (-24677) & 28671;
        lIlIlIIIIl[83] = (23 ^ 99) ^ (9 ^ 61);
        lIlIlIIIIl[84] = 15 ^ 78;
        lIlIlIIIIl[85] = (153 ^ 157) ^ (98 ^ 36);
        lIlIlIIIIl[86] = 203 ^ 136;
        lIlIlIIIIl[87] = 228 ^ 160;
        lIlIlIIIIl[88] = (215 ^ 157) ^ (50 ^ 61);
        lIlIlIIIIl[89] = 97 ^ 39;
        lIlIlIIIIl[90] = 204 ^ 139;
        lIlIlIIIIl[91] = (((67 + 180) - 96) + 46) ^ (((0 + 55) - 28) + 114);
        lIlIlIIIIl[92] = (50 ^ 22) ^ (82 ^ 63);
        lIlIlIIIIl[93] = (-((-22905) & 32255)) & (-1) & 12263;
        lIlIlIIIIl[94] = (-20997) & 24462;
        lIlIlIIIIl[95] = (31 ^ 54) ^ (111 ^ 12);
        lIlIlIIIIl[96] = (108 ^ 38) ^ " ".length();
        lIlIlIIIIl[97] = 41 ^ 101;
        lIlIlIIIIl[98] = 94 ^ 19;
        lIlIlIIIIl[99] = (-8226) & 13225;
        lIlIlIIIIl[100] = (170 ^ 181) ^ (218 ^ 139);
        lIlIlIIIIl[101] = (-11288) & 12287;
        lIlIlIIIIl[102] = 24 ^ 87;
        lIlIlIIIIl[103] = (49 ^ 16) ^ (222 ^ 174);
        lIlIlIIIIl[104] = (((147 + 71) - 36) + 15) ^ (((97 + 51) - 130) + 133);
        lIlIlIIIIl[105] = (-((-6981) & 15341)) & (-17) & 16383;
        lIlIlIIIIl[106] = 109 ^ 62;
        lIlIlIIIIl[107] = (-5644) & 6143;
        lIlIlIIIIl[108] = (-16933) & 29557;
        lIlIlIIIIl[109] = 195 ^ 167;
        lIlIlIIIIl[110] = (-10310) & 10709;
        lIlIlIIIIl[111] = (-27650) & 32759;
        lIlIlIIIIl[112] = (-20484) & 32463;
        lIlIlIIIIl[113] = (-7303) & 24302;
        lIlIlIIIIl[114] = (-8340) & 10239;
        lIlIlIIIIl[115] = (-((-2135) & 26718)) & (-33) & 26615;
        lIlIlIIIIl[116] = (196 ^ 178) ^ (46 ^ 12);
        lIlIlIIIIl[117] = 70 ^ 19;
        lIlIlIIIIl[118] = (-((-265) & 31035)) & (-514) & 32759;
        lIlIlIIIIl[119] = (-((-2761) & 28621)) & (-2114) & 28527;
        lIlIlIIIIl[120] = (-((-3713) & 16029)) & (-2561) & 16350;
        lIlIlIIIIl[121] = (-((-25653) & 26230)) & (-2049) & 4095;
        lIlIlIIIIl[122] = (-22553) & 24024;
        lIlIlIIIIl[123] = (-((-27463) & 32607)) & (-16516) & 24575;
        lIlIlIIIIl[124] = (-((-3329) & 32114)) & (-517) & 32765;
        lIlIlIIIIl[125] = (-((-325) & 25053)) & (-5121) & 32767;
        lIlIlIIIIl[126] = (-((-10357) & 27774)) & (-4097) & 24413;
        lIlIlIIIIl[127] = (-((-1445) & 22509)) & (-17) & 24539;
        lIlIlIIIIl[128] = (-((-19045) & 20205)) & (-1) & 4075;
        lIlIlIIIIl[129] = (-((-17281) & 22406)) & (-8201) & 16255;
        lIlIlIIIIl[130] = (-25149) & 28606;
        lIlIlIIIIl[131] = (-((-849) & 22385)) & (-8330) & 32767;
        lIlIlIIIIl[132] = (-((-1313) & 17785)) & (-4131) & 24063;
        lIlIlIIIIl[133] = (-9227) & 12143;
        lIlIlIIIIl[134] = (-25738) & 28649;
        lIlIlIIIIl[135] = (-16953) & 20415;
        lIlIlIIIIl[136] = (-((-24659) & 29787)) & (-24609) & 32639;
        lIlIlIIIIl[137] = (-((-6241) & 15591)) & (-4105) & 16383;
        lIlIlIIIIl[138] = (-((-11275) & 32719)) & (-3) & 24550;
        lIlIlIIIIl[139] = (-((-15593) & 32749)) & (-33) & 20351;
        lIlIlIIIIl[140] = (-((-3081) & 27673)) & (-4097) & 31615;
        lIlIlIIIIl[141] = (-((-10253) & 31373)) & (-8193) & 32767;
        lIlIlIIIIl[142] = (-((-3161) & 23769)) & (-7) & 23550;
        lIlIlIIIIl[143] = (-((-4743) & 14031)) & (-2) & 12255;
        lIlIlIIIIl[144] = (-12481) & 15861;
        lIlIlIIIIl[145] = (-((-2611) & 6847)) & (-17441) & 24575;
        lIlIlIIIIl[146] = (-29283) & 32755;
        lIlIlIIIIl[147] = (-((-3057) & 27635)) & (-1157) & 28639;
        lIlIlIIIIl[148] = (-((-1473) & 13797)) & (-521) & 16319;
        lIlIlIIIIl[149] = (-25633) & 28538;
        lIlIlIIIIl[150] = (-257) & 10132;
        lIlIlIIIIl[151] = (-6145) & 16018;
        lIlIlIIIIl[152] = (-20837) & 30709;
        lIlIlIIIIl[153] = (-((-9243) & 26207)) & (-4131) & 24559;
        lIlIlIIIIl[154] = (-((-21117) & 30461)) & (-16417) & 28671;
        lIlIlIIIIl[155] = (-((-25869) & 30511)) & (-16385) & 24495;
        lIlIlIIIIl[156] = (-((-643) & 30339)) & (-5) & 32607;
        lIlIlIIIIl[157] = (-16897) & 20372;
        lIlIlIIIIl[158] = (-6226) & 16095;
        lIlIlIIIIl[159] = (-5281) & 8189;
        lIlIlIIIIl[160] = (-((-8209) & 12627)) & (-2049) & 16343;
        lIlIlIIIIl[161] = (-((-6145) & 22881)) & (-649) & 32747;
        lIlIlIIIIl[162] = (-((-5391) & 30207)) & (-2309) & 32247;
        lIlIlIIIIl[163] = 27 ^ 77;
        lIlIlIIIIl[164] = (117 ^ 22) ^ (102 ^ 82);
        lIlIlIIIIl[165] = (39 ^ 65) ^ (32 ^ 30);
        lIlIlIIIIl[166] = 2 ^ 91;
        lIlIlIIIIl[167] = (((139 + 70) - 129) + 137) ^ (((115 + 92) - 191) + 115);
        lIlIlIIIIl[168] = (61 ^ 114) ^ (28 ^ 8);
        lIlIlIIIIl[169] = 54 ^ 106;
        lIlIlIIIIl[170] = (-((-1109) & 17526)) & (-4161) & 24573;
        lIlIlIIIIl[171] = (-((-2597) & 27239)) & (-4097) & 32735;
        lIlIlIIIIl[172] = (-4097) & 8094;
        lIlIlIIIIl[173] = (-12353) & 16351;
        lIlIlIIIIl[174] = (6 ^ 107) ^ (241 ^ 193);
    }

    private static boolean lIIIllllIllII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0b35, code lost:
        if (lIIIllllIlIll(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.D.ih), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.D.lIlIlIIIIl[12]) != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0da1, code lost:
        if (lIIIllllIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0dcb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019a  */
    /* JADX WARN: Type inference failed for: r0v655, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bR() {
        if (lIIIllllIIlll(C0004e.j(lIlIlIIIIl[0]), lIlIlIIIIl[1])) {
            try {
                G.ch();
                "".length();
                if ((-" ".length()) > "   ".length()) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (lIIIllllIlIII(C0004e.j(lIlIlIIIIl[0]), lIlIlIIIIl[1]) && lIIIllllIIlll(C0004e.j(lIlIlIIIIl[2]), lIlIlIIIIl[3])) {
            if (lIIIllllIlIIl(bn ? 1 : 0)) {
                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[4]];
                C0001b.a(bp);
                if (lIIIllllIIlll(bp.size(), lIlIlIIIIl[3])) {
                    System.out.println(lIlIIlllIl[lIlIlIIIIl[3]]);
                    bn = lIlIlIIIIl[4];
                }
            }
            do {
                if (lIIIllllIlIIl(C0024y.bv() ? 1 : 0)) {
                    int[] iArr = new int[lIlIlIIIIl[3]];
                    iArr[lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                    if (lIIIllllIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIlIlIIIIl[3]];
                        iArr2[lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                        if (lIIIllllIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIlIlIIIIl[3]];
                            iArr3[lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                            if (lIIIllllIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIlIlIIIIl[3]];
                                iArr4[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                                if (lIIIllllIlIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                                    int[] iArr5 = new int[lIlIlIIIIl[3]];
                                    iArr5[lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                                    if (lIIIllllIlIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                                        int[] iArr6 = new int[lIlIlIIIIl[3]];
                                        iArr6[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                                        if (!lIIIllllIlIlI(Inventory.contains(iArr6) ? 1 : 0)) {
                                            if (lIIIllllIlIlI(bn ? 1 : 0)) {
                                                if (lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[11])) {
                                                    int[] iArr7 = new int[lIlIlIIIIl[3]];
                                                    iArr7[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                                                    if (lIIIllllIlIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                                                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[1]];
                                                        int[] iArr8 = new int[lIlIlIIIIl[3]];
                                                        iArr8[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                                                        Inventory.getFirst(iArr8).interact(lIlIIlllIl[lIlIlIIIIl[12]]);
                                                        Time.sleepTicks(lIlIlIIIIl[13]);
                                                        "".length();
                                                    }
                                                }
                                                if (lIIIllllIIlll(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[11]) && lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[14])) {
                                                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[15]];
                                                    if (lIIIllllIlIIl(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIIllllIIlll(Movement.getRunEnergy(), lIlIlIIIIl[16])) {
                                                        Inventory.getFirst(C0005f.aU).interact(lIlIIlllIl[lIlIlIIIIl[13]]);
                                                        Time.sleepTicks(lIlIlIIIIl[3]);
                                                        "".length();
                                                    }
                                                    Movement.walkTo(hU);
                                                    "".length();
                                                    Time.sleepTicks(lIlIlIIIIl[3]);
                                                    "".length();
                                                }
                                                if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[14])) {
                                                    C0006g.a(lIlIIlllIl[lIlIlIIIIl[14]], hn);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    bT();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                    "".length();
                } else if (lIIIllllIlIlI(bn ? 1 : 0)) {
                }
            } while (((((0 + 20) - (-101)) + 45) ^ (((161 + 25) - 121) + 97)) >= "   ".length());
            return;
        }
        if (lIIIllllIlIII(C0004e.j(lIlIlIIIIl[0]), lIlIlIIIIl[1]) && lIIIllllIlIII(C0004e.j(lIlIlIIIIl[2]), lIlIlIIIIl[3])) {
            if (lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hX), lIlIlIIIIl[15]) && lIIIllllIlIlI(ik.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] iArr9 = new int[lIlIlIIIIl[3]];
                iArr9[lIlIlIIIIl[4]] = lIlIlIIIIl[17];
                if (lIIIllllIlIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[18]];
                    Movement.walkTo(hX);
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                }
            }
            if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hX), lIlIlIIIIl[15]) && lIIIllllIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                int[] iArr10 = new int[lIlIlIIIIl[3]];
                iArr10[lIlIlIIIIl[4]] = lIlIlIIIIl[17];
                if (lIIIllllIlIlI(Inventory.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lIlIlIIIIl[3]];
                    iArr11[lIlIlIIIIl[4]] = lIlIlIIIIl[19];
                    TileObject nearest = TileObjects.getNearest(iArr11);
                    if (lIIIllllIlIIl(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr12 = new int[lIlIlIIIIl[3]];
                        iArr12[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                        Inventory.getFirst(iArr12).interact(lIlIIlllIl[lIlIlIIIIl[20]]);
                        Time.sleepTicks(lIlIlIIIIl[3]);
                        "".length();
                    }
                    if (lIIIllllIlIlI(Inventory.isFull() ? 1 : 0)) {
                        if (lIIIllllIllIl(nearest) && lIIIllllIlIlI(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[21]];
                            nearest.interact(lIlIIlllIl[lIlIlIIIIl[22]]);
                            Dialog.continueSpace();
                        }
                        Widget widget = Widgets.get(lIlIlIIIIl[23], lIlIlIIIIl[3]);
                        if (lIIIllllIllIl(widget)) {
                            widget.interact(lIlIIlllIl[lIlIlIIIIl[24]]);
                            widget.interact(lIlIlIIIIl[4]);
                            widget.interact(lIlIIlllIl[lIlIlIIIIl[25]]);
                            Keyboard.type(lIlIIlllIl[lIlIlIIIIl[26]]);
                        }
                    }
                }
            }
            if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hX), lIlIlIIIIl[15])) {
                int[] iArr13 = new int[lIlIlIIIIl[3]];
                iArr13[lIlIlIIIIl[4]] = lIlIlIIIIl[17];
                if (lIIIllllIlIIl(Inventory.contains(iArr13) ? 1 : 0) && lIIIllllIlIlI(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[27]];
                    Movement.walkTo(ib);
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                }
            }
            if (lIIIllllIlIIl(ik.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[28]];
                if (lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(ib), lIlIlIIIIl[3])) {
                    Movement.walkTo(ib);
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                }
                if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(ib), lIlIlIIIIl[3])) {
                    String[] strArr = new String[lIlIlIIIIl[3]];
                    strArr[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[29]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[30]];
                    if (lIIIllllIlIIl(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr14 = new int[lIlIlIIIIl[3]];
                        iArr14[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                        Inventory.getFirst(iArr14).interact(lIlIIlllIl[lIlIlIIIIl[31]]);
                        Time.sleepTicks(lIlIlIIIIl[3]);
                        "".length();
                    }
                    if (lIIIllllIllIl(nearest2)) {
                        String[] strArr2 = new String[lIlIlIIIIl[3]];
                        strArr2[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[32]];
                        if (lIIIllllIlIIl(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(lIlIIlllIl[lIlIlIIIIl[33]]);
                            Time.sleepTicks(lIlIlIIIIl[1]);
                            "".length();
                        }
                        String[] strArr3 = new String[lIlIlIIIIl[3]];
                        strArr3[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[34]];
                        if (lIIIllllIlIIl(nearest2.hasAction(strArr3) ? 1 : 0)) {
                            nearest2.interact(lIlIIlllIl[lIlIlIIIIl[35]]);
                            Time.sleepTicks(lIlIlIIIIl[1]);
                            "".length();
                            Widget widget2 = Widgets.get(lIlIlIIIIl[23], lIlIlIIIIl[3]);
                            if (lIIIllllIllIl(widget2)) {
                                widget2.interact(lIlIIlllIl[lIlIlIIIIl[36]]);
                                widget2.interact(lIlIlIIIIl[4]);
                                widget2.interact(lIlIIlllIl[lIlIlIIIIl[37]]);
                                Keyboard.type(lIlIIlllIl[lIlIlIIIIl[38]]);
                            }
                        }
                    }
                }
            }
        }
        if (lIIIllllIlIII(C0004e.j(lIlIlIIIIl[0]), lIlIlIIIIl[1]) && lIIIllllIlIII(C0004e.j(lIlIlIIIIl[2]), lIlIlIIIIl[1])) {
            dc = lIlIlIIIIl[4];
            if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[22])) {
                while (lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hX), lIlIlIIIIl[1]) && lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    Movement.walkTo(hX);
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                    "".length();
                    if ((((207 ^ 134) ^ (96 ^ 28)) & (((8 ^ 35) ^ (31 ^ 1)) ^ (-" ".length()))) != 0) {
                        return;
                    }
                }
            }
            int[] iArr15 = new int[lIlIlIIIIl[3]];
            iArr15[lIlIlIIIIl[4]] = lIlIlIIIIl[39];
            if (lIIIllllIlIlI(Inventory.contains(iArr15) ? 1 : 0) && lIIIllllIlIIl(ik.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[40]];
                if (lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(ib), lIlIlIIIIl[3])) {
                    Movement.walkTo(ib);
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                }
                if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(ib), lIlIlIIIIl[3])) {
                    String[] strArr4 = new String[lIlIlIIIIl[3]];
                    strArr4[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[41]];
                    TileObject nearest3 = TileObjects.getNearest(strArr4);
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[42]];
                    if (lIIIllllIllIl(nearest3)) {
                        String[] strArr5 = new String[lIlIlIIIIl[3]];
                        strArr5[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[43]];
                        if (lIIIllllIlIIl(nearest3.hasAction(strArr5) ? 1 : 0)) {
                            nearest3.interact(lIlIIlllIl[lIlIlIIIIl[44]]);
                            Time.sleepTicks(lIlIlIIIIl[1]);
                            "".length();
                        }
                        String[] strArr6 = new String[lIlIlIIIIl[3]];
                        strArr6[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[45]];
                        if (lIIIllllIlIIl(nearest3.hasAction(strArr6) ? 1 : 0)) {
                            nearest3.interact(lIlIIlllIl[lIlIlIIIIl[46]]);
                            Time.sleepTicks(lIlIlIIIIl[1]);
                            "".length();
                            Widget widget3 = Widgets.get(lIlIlIIIIl[23], lIlIlIIIIl[3]);
                            if (lIIIllllIllIl(widget3)) {
                                widget3.interact(lIlIIlllIl[lIlIlIIIIl[47]]);
                                widget3.interact(lIlIlIIIIl[4]);
                                widget3.interact(lIlIIlllIl[lIlIlIIIIl[48]]);
                                Keyboard.type(lIlIIlllIl[lIlIlIIIIl[49]]);
                            }
                        }
                    }
                }
            }
            int[] iArr16 = new int[lIlIlIIIIl[3]];
            iArr16[lIlIlIIIIl[4]] = lIlIlIIIIl[39];
            if (lIIIllllIlIIl(Inventory.contains(iArr16) ? 1 : 0) && lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hY), lIlIlIIIIl[3])) {
                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[50]];
                Movement.walkTo(hY);
                "".length();
                Time.sleepTicks(lIlIlIIIIl[3]);
                "".length();
            }
            if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hY), lIlIlIIIIl[1])) {
                String[] strArr7 = new String[lIlIlIIIIl[3]];
                strArr7[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[51]];
                TileObject nearest4 = TileObjects.getNearest(strArr7);
                String[] strArr8 = new String[lIlIlIIIIl[3]];
                strArr8[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[52]];
                NPC nearest5 = NPCs.getNearest(strArr8);
                if (lIIIllllIllIl(nearest4) && lIIIllllIlllI(nearest5)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[53]];
                    String[] strArr9 = new String[lIlIlIIIIl[3]];
                    strArr9[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[54]];
                    if (lIIIllllIlIIl(Inventory.contains(strArr9) ? 1 : 0)) {
                        String[] strArr10 = new String[lIlIlIIIIl[3]];
                        strArr10[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[55]];
                        Inventory.getFirst(strArr10).useOn(nearest4);
                    }
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                }
                if (lIIIllllIllIl(nearest5)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[56]];
                    int[] iArr17 = new int[lIlIlIIIIl[3]];
                    iArr17[lIlIlIIIIl[4]] = lIlIlIIIIl[39];
                    if (lIIIllllIlIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[lIlIlIIIIl[3]];
                        iArr18[lIlIlIIIIl[4]] = lIlIlIIIIl[39];
                        Inventory.getFirst(iArr18).useOn(nearest5);
                    }
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                }
            }
        }
        if (lIIIllllIlIIl(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIlIII(C0004e.j(lIlIlIIIIl[2]), lIlIlIIIIl[12])) {
            AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[57]];
            Movement.walkTo(new WorldPoint(lIlIlIIIIl[58], lIlIlIIIIl[59], lIlIlIIIIl[4]));
            "".length();
            Time.sleepTicks(lIlIlIIIIl[3]);
            "".length();
        }
        if (lIIIllllIlIlI(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIlIII(C0004e.j(lIlIlIIIIl[2]), lIlIlIIIIl[12])) {
            int[] iArr19 = new int[lIlIlIIIIl[3]];
            iArr19[lIlIlIIIIl[4]] = lIlIlIIIIl[60];
            if (lIIIllllIlIIl(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIlIlIIIIl[3]];
                iArr20[lIlIlIIIIl[4]] = lIlIlIIIIl[60];
                if (lIIIllllIlIIl(Inventory.contains(iArr20) ? 1 : 0)) {
                }
            }
            AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[61]];
            if (lIIIllllIllll(Movement.getRunEnergy(), lIlIlIIIIl[33])) {
                bS();
            }
        }
        if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(ih), lIlIlIIIIl[12])) {
            int[] iArr21 = new int[lIlIlIIIIl[3]];
            iArr21[lIlIlIIIIl[4]] = lIlIlIIIIl[60];
            if (lIIIllllIlIIl(Inventory.contains(iArr21) ? 1 : 0) && lIIIllllIlIII(Players.getLocal().getWorldLocation().getX(), lIlIlIIIIl[62])) {
                String[] strArr11 = new String[lIlIlIIIIl[3]];
                strArr11[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[63]];
                TileObject nearest6 = TileObjects.getNearest(strArr11);
                if (lIIIllllIllIl(nearest6)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[64]];
                    int[] iArr22 = new int[lIlIlIIIIl[3]];
                    iArr22[lIlIlIIIIl[4]] = lIlIlIIIIl[60];
                    if (lIIIllllIlIIl(Inventory.contains(iArr22) ? 1 : 0)) {
                        int[] iArr23 = new int[lIlIlIIIIl[3]];
                        iArr23[lIlIlIIIIl[4]] = lIlIlIIIIl[60];
                        Inventory.getFirst(iArr23).useOn(nearest6);
                        Time.sleepTicks(lIlIlIIIIl[1]);
                        "".length();
                    }
                }
            }
        }
        if (lIIIllllIlIIl(il.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            int[] iArr24 = new int[lIlIlIIIIl[3]];
            iArr24[lIlIlIIIIl[4]] = lIlIlIIIIl[60];
            if (lIIIllllIlIIl(Inventory.contains(iArr24) ? 1 : 0)) {
                if (lIIIllllIlIlI(Players.getLocal().getWorldLocation().equals(hV) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[65]];
                    Movement.walkTo(hV);
                    "".length();
                }
                if (lIIIllllIllII(Skills.getBoostedLevel(Skill.HITPOINTS), lIlIlIIIIl[13])) {
                    int[] iArr25 = new int[lIlIlIIIIl[3]];
                    iArr25[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                    if (lIIIllllIlIIl(Inventory.contains(iArr25) ? 1 : 0)) {
                        int[] iArr26 = new int[lIlIlIIIIl[3]];
                        iArr26[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                        Inventory.getFirst(iArr26).interact(lIlIIlllIl[lIlIlIIIIl[66]]);
                    }
                }
                if (lIIIllllIlIIl(Players.getLocal().getWorldLocation().equals(hV) ? 1 : 0)) {
                    NPC nearest7 = NPCs.getNearest(iz);
                    if (lIIIllllIllIl(nearest7) && lIIIllllIlIlI(nearest7.isDead() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[67]];
                        if (lIIIllllIIlll(Skills.getLevel(Skill.MAGIC), lIlIlIIIIl[21])) {
                            Magic.cast(SpellBook.Standard.WATER_STRIKE, nearest7);
                            Time.sleepTicks(lIlIlIIIIl[3]);
                            "".length();
                        }
                        if (!lIIIllllIIlll(Skills.getLevel(Skill.MAGIC), lIlIlIIIIl[26]) || lIIIllllIIlll(Skills.getLevel(Skill.MAGIC), lIlIlIIIIl[21])) {
                            if (lIIIllllIllll(Skills.getLevel(Skill.MAGIC), lIlIlIIIIl[21])) {
                                int[] iArr27 = new int[lIlIlIIIIl[3]];
                                iArr27[lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                                if (lIIIllllIlIIl(Inventory.contains(iArr27) ? 1 : 0)) {
                                    String[] strArr12 = new String[lIlIlIIIIl[3]];
                                    strArr12[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[68]];
                                }
                            }
                            if (lIIIllllIllll(Skills.getLevel(Skill.MAGIC), lIlIlIIIIl[26])) {
                                String[] strArr13 = new String[lIlIlIIIIl[3]];
                                strArr13[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[69]];
                                if (lIIIllllIlIIl(Inventory.contains(strArr13) ? 1 : 0)) {
                                    Magic.cast(SpellBook.Standard.FIRE_STRIKE, nearest7);
                                    Time.sleepTicks(lIlIlIIIIl[3]);
                                    "".length();
                                }
                            }
                        }
                        Magic.cast(SpellBook.Standard.EARTH_STRIKE, nearest7);
                        Time.sleepTicks(lIlIlIIIIl[3]);
                        "".length();
                        if (lIIIllllIllll(Skills.getLevel(Skill.MAGIC), lIlIlIIIIl[26])) {
                        }
                    }
                }
            }
        }
        if (lIIIllllIlIII(C0004e.j(lIlIlIIIIl[2]), lIlIlIIIIl[14])) {
            String[] strArr14 = new String[lIlIlIIIIl[3]];
            strArr14[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[70]];
            if (lIIIllllIlIlI(Inventory.contains(strArr14) ? 1 : 0)) {
                String[] strArr15 = new String[lIlIlIIIIl[3]];
                strArr15[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[71]];
                TileItem nearest8 = TileItems.getNearest(strArr15);
                if (lIIIllllIllIl(nearest8)) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[72]];
                    nearest8.interact(lIlIIlllIl[lIlIlIIIIl[73]]);
                    Time.sleepTicks(lIlIlIIIIl[1]);
                    "".length();
                }
            }
        }
        if (lIIIllllIlIII(C0004e.j(lIlIlIIIIl[2]), lIlIlIIIIl[14])) {
            String[] strArr16 = new String[lIlIlIIIIl[3]];
            strArr16[lIlIlIIIIl[4]] = lIlIIlllIl[lIlIlIIIIl[74]];
            if (lIIIllllIlIIl(Inventory.contains(strArr16) ? 1 : 0)) {
                if (lIIIllllIlIIl(il.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr28 = new int[lIlIlIIIIl[3]];
                    iArr28[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                    if (lIIIllllIlIIl(Inventory.contains(iArr28) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[75]];
                        int[] iArr29 = new int[lIlIlIIIIl[3]];
                        iArr29[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                        Inventory.getFirst(iArr29).interact(lIlIIlllIl[lIlIlIIIIl[76]]);
                        Time.sleepTicks(lIlIlIIIIl[13]);
                        "".length();
                    }
                }
                if (lIIIllllIlIlI(il.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[15])) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[77]];
                    Movement.walkTo(hU);
                    "".length();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                }
                if (lIIIllllIllII(Players.getLocal().getWorldLocation().distanceTo(hU), lIlIlIIIIl[13])) {
                    AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[78]];
                    if (lIIIllllIIlll(dc, lIlIlIIIIl[3])) {
                        Z.lg += lIlIlIIIIl[3];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlIlIIIIl[3];
                        Z.lg = lIlIlIIIIl[4];
                        dd = lIlIlIIIIl[4];
                    }
                    C0006g.a(lIlIIlllIl[lIlIlIIIIl[79]], hn);
                }
            }
        }
    }

    private static boolean lIIIllllIllll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIllllIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIlllllIIII(int i) {
        return i > 0;
    }

    private static String lIIIlllIIlIlI(String lllllllllllllllllllIllllIllllIII, String lllllllllllllllllllIllllIlllIlll) {
        try {
            SecretKeySpec lllllllllllllllllllIllllIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIllllIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIllllIllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIllllIllllIlI.init(lIlIlIIIIl[1], lllllllllllllllllllIllllIllllIll);
            return new String(lllllllllllllllllllIllllIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIllllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIllllIllllIIl) {
            lllllllllllllllllllIllllIllllIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIIlIIl(String lllllllllllllllllllIlllllIIllIlI, String lllllllllllllllllllIlllllIIllIIl) {
        String lllllllllllllllllllIlllllIIllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIlllllIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllllIlllllIIlIlll = lllllllllllllllllllIlllllIIllIIl.toCharArray();
        int lllllllllllllllllllIlllllIIlIllI = lIlIlIIIIl[4];
        char[] charArray = lllllllllllllllllllIlllllIIllIlI2.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIIIl[4];
        while (lIIIllllIIlll(i, length)) {
            char lllllllllllllllllllIlllllIIllIll = charArray[i];
            sb.append((char) (lllllllllllllllllllIlllllIIllIll ^ lllllllllllllllllllIlllllIIlIlll[lllllllllllllllllllIlllllIIlIllI % lllllllllllllllllllIlllllIIlIlll.length]));
            "".length();
            lllllllllllllllllllIlllllIIlIllI++;
            i++;
            "".length();
            if ((-" ".length()) == ((165 ^ 184) ^ (217 ^ 192))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIllllIllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIlIIIIl[4];
    }

    private static void lIIIllllIIlIl() {
        lIlIIlllIl = new String[lIlIlIIIIl[174]];
        lIlIIlllIl[lIlIlIIIIl[4]] = lIIIlllIIlIII("PZ8bm4IuDosdztN/b7c6rQ==", "wPbDp");
        lIlIIlllIl[lIlIlIIIIl[3]] = lIIIlllIIlIIl("NzMaOBkZPxBxCAQjHT8NUTMANAcCdlQiHRguFzkDHz1UMwsSMVQlBVErATQZBTMaNg==", "qZtQj");
        lIlIIlllIl[lIlIlIIIIl[1]] = lIIIlllIIlIIl("AycsJQcoOy5kGCA3", "AUIDl");
        lIlIIlllIl[lIlIlIIIIl[12]] = lIIIlllIIlIII("X8QHvTLr1cQ=", "SdNtT");
        lIlIIlllIl[lIlIlIIIIl[15]] = lIIIlllIIlIlI("6K+jMD9abJ8prNtzIlhMbg==", "xlLnX");
        lIlIIlllIl[lIlIlIIIIl[13]] = lIIIlllIIlIlI("H3cTFzO/+rE=", "TRfXi");
        lIlIIlllIl[lIlIlIIIIl[14]] = lIIIlllIIlIIl("Mg4a", "pacHH");
        lIlIIlllIl[lIlIlIIIIl[18]] = lIIIlllIIlIlI("JRDpFgpxTFRlKuvUDTM9ffRbSFsnK5d6N3XQv+eiXdI=", "OmGgz");
        lIlIIlllIl[lIlIlIIIIl[20]] = lIIIlllIIlIIl("ND4/Ag==", "pLPrT");
        lIlIIlllIl[lIlIlIIIIl[21]] = lIIIlllIIlIlI("0XuucpBv7RHCOY8cgEjonA==", "qiNWR");
        lIlIIlllIl[lIlIlIIIIl[22]] = lIIIlllIIlIIl("Bhk4BUw/GDMLEw==", "JvWna");
        lIlIIlllIl[lIlIlIIIIl[24]] = lIIIlllIIlIIl("EB8hAxM9BSo=", "SpOwz");
        lIlIIlllIl[lIlIlIIIIl[25]] = lIIIlllIIlIIl("Aw0YCA==", "mxtdE");
        lIlIIlllIl[lIlIlIIIIl[26]] = lIIIlllIIlIIl("aQ==", "IkOAK");
        lIlIIlllIl[lIlIlIIIIl[27]] = lIIIlllIIlIIl("KiM1RTELYi4EIgonN0UnCzo=", "dBCeE");
        lIlIIlllIl[lIlIlIIIIl[28]] = lIIIlllIIlIII("xUXjLLisE8GI1ozEtFh3qu+PVYxHzuvA", "lTygM");
        lIlIIlllIl[lIlIlIIIIl[29]] = lIIIlllIIlIII("/S2tCpsf+SweMYyzFUnOTQ==", "xYIcR");
        lIlIIlllIl[lIlIlIIIIl[30]] = lIIIlllIIlIlI("LiNyrt6bMMucroC2N+wmEg==", "ihBKi");
        lIlIIlllIl[lIlIlIIIIl[31]] = lIIIlllIIlIlI("Koj5SP71sao=", "nfsri");
        lIlIIlllIl[lIlIlIIIIl[32]] = lIIIlllIIlIlI("dI2fGkv6+TU=", "GzPdw");
        lIlIIlllIl[lIlIlIIIIl[33]] = lIIIlllIIlIIl("IwkqOw==", "lyOUj");
        lIlIIlllIl[lIlIlIIIIl[34]] = lIIIlllIIlIlI("RgDNx6eqbW0=", "gaBYL");
        lIlIIlllIl[lIlIlIIIIl[35]] = lIIIlllIIlIlI("yrIZGB5oqeQ=", "QthEp");
        lIlIIlllIl[lIlIlIIIIl[36]] = lIIIlllIIlIlI("8WbqDpT8ddh5BYGsE5fRWw==", "lJwuh");
        lIlIIlllIl[lIlIlIIIIl[37]] = lIIIlllIIlIIl("FgQmKg==", "xqJFN");
        lIlIIlllIl[lIlIlIIIIl[38]] = lIIIlllIIlIIl("Rw==", "gPvRA");
        lIlIIlllIl[lIlIlIIIIl[40]] = lIIIlllIIlIII("Z8Pbz12zb/PSIUiFDgys/iJv0dXfb43Y", "DECWZ");
        lIlIIlllIl[lIlIlIIIIl[41]] = lIIIlllIIlIlI("y3O0rQYHQGmMfkc9m8hd/w==", "rpEBN");
        lIlIIlllIl[lIlIlIIIIl[42]] = lIIIlllIIlIII("oStSI9emht8Ps89v9sFXdg==", "ylyMH");
        lIlIIlllIl[lIlIlIIIIl[43]] = lIIIlllIIlIIl("AzozDQ==", "LJVcT");
        lIlIIlllIl[lIlIlIIIIl[44]] = lIIIlllIIlIIl("Kj0xCQ==", "eMTgn");
        lIlIIlllIl[lIlIlIIIIl[45]] = lIIIlllIIlIIl("IDwSIxAb", "sYsQs");
        lIlIIlllIl[lIlIlIIIIl[46]] = lIIIlllIIlIIl("JQcEIS8e", "vbeSL");
        lIlIIlllIl[lIlIlIIIIl[47]] = lIIIlllIIlIII("ubhjltlubs3gIWjhWrRGig==", "GEWPj");
        lIlIIlllIl[lIlIlIIIIl[48]] = lIIIlllIIlIlI("5yfikuvH7UY=", "LsQMH");
        lIlIIlllIl[lIlIlIIIIl[49]] = lIIIlllIIlIIl("Rg==", "fCurO");
        lIlIIlllIl[lIlIlIIIIl[50]] = lIIIlllIIlIlI("NrMY3bo/VuOw3k6cAvSzM6aaaT9rTAZc", "sNCVK");
        lIlIIlllIl[lIlIlIIIIl[51]] = lIIIlllIIlIIl("GxwTCgJ2GwkVAg==", "Vsfyg");
        lIlIIlllIl[lIlIlIIIIl[52]] = lIIIlllIIlIlI("p9rIoK9ZFYE=", "BIIzc");
        lIlIIlllIl[lIlIlIIIIl[53]] = lIIIlllIIlIlI("1Ty3nl7JDoQ6bVcCtmvlVg==", "izPsi");
        lIlIIlllIl[lIlIlIIIIl[54]] = lIIIlllIIlIII("3JAlWTUzODA=", "JRdRv");
        lIlIIlllIl[lIlIlIIIIl[55]] = lIIIlllIIlIlI("bd3aJUXefEY=", "NVVKo");
        lIlIIlllIl[lIlIlIIIIl[56]] = lIIIlllIIlIIl("Pi4tCAsTby4DEgUq", "vOClg");
        lIlIIlllIl[lIlIlIIIIl[57]] = lIIIlllIIlIII("XN6lUPtUTQg4w9acjugGwA==", "tEsRQ");
        lIlIIlllIl[lIlIlIIIIl[61]] = lIIIlllIIlIIl("Og8oEzkbACFXIhMCLR47FQ==", "rnFwU");
        lIlIIlllIl[lIlIlIIIIl[63]] = lIIIlllIIlIlI("GsjYb7KLk00=", "UYMEn");
        lIlIIlllIl[lIlIlIIIIl[64]] = lIIIlllIIlIlI("CUsuIJ5BGFrwy6u7UE3/IQ==", "mboBV");
        lIlIIlllIl[lIlIlIIIIl[65]] = lIIIlllIIlIlI("HVPR9hSgopTSdc2QdOVnNiafJzyLArM+", "dzDyv");
        lIlIIlllIl[lIlIlIIIIl[66]] = lIIIlllIIlIlI("tEBz/hYByDQ=", "rKSCF");
        lIlIIlllIl[lIlIlIIIIl[67]] = lIIIlllIIlIlI("HqNZb/hQIPtCml4hAm2Ndw==", "XifJT");
        lIlIIlllIl[lIlIlIIIIl[68]] = lIIIlllIIlIIl("FSM+BnMhPyIG", "SJLcS");
        lIlIIlllIl[lIlIlIIIIl[69]] = lIIIlllIIlIlI("CUlc9oUcB8Cki5OBSFHaRQ==", "aTIID");
        lIlIIlllIl[lIlIlIIIIl[70]] = lIIIlllIIlIlI("EF9fJY3yqnw=", "wkYcP");
        lIlIIlllIl[lIlIlIIIIl[71]] = lIIIlllIIlIlI("FRl+uuwEV5Y=", "MHRQG");
        lIlIIlllIl[lIlIlIIIIl[72]] = lIIIlllIIlIIl("BQMlMAk2Qiw4Cz0=", "QbNYg");
        lIlIIlllIl[lIlIlIIIIl[73]] = lIIIlllIIlIIl("LRsyKg==", "yzYOD");
        lIlIIlllIl[lIlIlIIIIl[74]] = lIIIlllIIlIIl("KAsZGg==", "jjuvS");
        lIlIIlllIl[lIlIlIIIIl[75]] = lIIIlllIIlIlI("QKDpWvPCFwhfOieFIGSPnA==", "drFqZ");
        lIlIIlllIl[lIlIlIIIIl[76]] = lIIIlllIIlIlI("9hA3lFpjpWQ=", "bMtTe");
        lIlIIlllIl[lIlIlIIIIl[77]] = lIIIlllIIlIlI("LhqGxeRvT1PZXwpkXpwqhWmk/V5+CN7z", "pxEil");
        lIlIIlllIl[lIlIlIIIIl[78]] = lIIIlllIIlIII("rIfxDtw+GYd/a6heUhr1+DcSFBIudSVj", "wrAXh");
        lIlIIlllIl[lIlIlIIIIl[79]] = lIIIlllIIlIIl("NCEU", "vNmIp");
        lIlIIlllIl[lIlIlIIIIl[80]] = lIIIlllIIlIIl("NCM9PwA=", "pQTQk");
        lIlIIlllIl[lIlIlIIIIl[81]] = lIIIlllIIlIlI("Wc8n6qPMdjbAR7QoCKtC7A==", "GdcpZ");
        lIlIIlllIl[lIlIlIIIIl[83]] = lIIIlllIIlIlI("mFtHEgD6GtXpZfUOfvdqOw2DFZE9eVsE", "qzQJa");
        lIlIIlllIl[lIlIlIIIIl[84]] = lIIIlllIIlIII("o6vAZ5osFqim/y0nKlF7MR9fPytwNqi/", "dLCvi");
        lIlIIlllIl[lIlIlIIIIl[85]] = lIIIlllIIlIII("maUAtLCaZoMe/Zyfw2VFYW3iw1yooUxJ", "SFRSn");
        lIlIIlllIl[lIlIlIIIIl[86]] = lIIIlllIIlIlI("yxKIB0R8SGEciIelXDtchQ==", "txAdn");
        lIlIIlllIl[lIlIlIIIIl[87]] = lIIIlllIIlIIl("CAYQDgUhBEQRCTY=", "Ocdzl");
        lIlIIlllIl[lIlIlIIIIl[88]] = lIIIlllIIlIlI("yXtjZqmjMVsGCuhiyLqQxA==", "UQcEK");
        lIlIIlllIl[lIlIlIIIIl[89]] = lIIIlllIIlIII("fGUM2G4FWNc=", "QEesd");
        lIlIIlllIl[lIlIlIIIIl[90]] = lIIIlllIIlIII("3rKW+BJed81G7+3NGCAN2A==", "uiVoh");
        lIlIIlllIl[lIlIlIIIIl[91]] = lIIIlllIIlIlI("KtneKP3Jupg=", "lovCf");
        lIlIIlllIl[lIlIlIIIIl[92]] = lIIIlllIIlIlI("25003MHdyaU=", "Tsxqm");
        lIlIIlllIl[lIlIlIIIIl[95]] = lIIIlllIIlIII("znxlKRlFSvcmzhRLJFJBdPoD1AdoHb6t", "YlZip");
        lIlIIlllIl[lIlIlIIIIl[96]] = lIIIlllIIlIIl("OxIwcDIaUzU4IxFTNSApAQ==", "usFPF");
        lIlIIlllIl[lIlIlIIIIl[97]] = lIIIlllIIlIlI("xLceaQeoLc6J3vJOT6ayFUzEaN2vQBCw", "OYsbs");
        lIlIIlllIl[lIlIlIIIIl[98]] = lIIIlllIIlIlI("sQOAjN7IzJu+0+C4QaVHkw==", "Nmile");
        lIlIIlllIl[lIlIlIIIIl[100]] = lIIIlllIIlIIl("GysfIAA6JBZkDjIkGi0CNA==", "SJqDl");
        lIlIIlllIl[lIlIlIIIIl[102]] = lIIIlllIIlIIl("JRFoMQEXVCU5AAEdJjdTAQE4IB8bETt8UwEDISQQGh0mN1MGG2gSJis9Bhc=", "rtHPs");
        lIlIIlllIl[lIlIlIIIIl[16]] = lIIIlllIIlIlI("obYxRZjAGNmq8j8zVA7TxjKEbbiks4bdTne6i8KwTD9aBymCH2ZRqkc1LK5HWt3X", "LihIK");
        lIlIIlllIl[lIlIlIIIIl[103]] = lIIIlllIIlIlI("JBMfRzkcHlg0JrqqoQx0N+8uCW1KckL4hrDjp7M+RfjqEKkfiejvaBngwy9Ieo1S", "MyRxC");
        lIlIIlllIl[lIlIlIIIIl[104]] = lIIIlllIIlIIl("GShIDwsrbQUHCj0kBglZPTgYHhUnKBtCWT06ARoaJiQGCVk6IkgsLBcEJik=", "NMhny");
        lIlIIlllIl[lIlIlIIIIl[106]] = lIIIlllIIlIIl("Dy5qEgc9aycaBisiJBRVKz46AxkxLjlfVSs8IwcWMCIkFFUsJGoxIAECBDQ=", "XKJsu");
        lIlIIlllIl[lIlIlIIIIl[116]] = lIIIlllIIlIlI("3q/EuLge0jGkfTkiZ6lyNxZpIrUeMLkJ", "UaFUE");
        lIlIIlllIl[lIlIlIIIIl[117]] = lIIIlllIIlIlI("mS7sYP2o/38RFxkjJNi2p0zE14M9Z0wT", "BrRXq");
        lIlIIlllIl[lIlIlIIIIl[163]] = lIIIlllIIlIII("Ifi7yMoDIb2bsexUds/O6g==", "vqpDg");
        lIlIIlllIl[lIlIlIIIIl[164]] = lIIIlllIIlIlI("bXGFPzk0tE8iMxUomVayINifyCu9QS7s", "BkSuc");
        lIlIIlllIl[lIlIlIIIIl[165]] = lIIIlllIIlIIl("LkgZGFYTHQxa", "goutv");
        lIlIIlllIl[lIlIlIIIIl[166]] = lIIIlllIIlIIl("ES0fHBc8IhJFVhluAAcZJ24cARMiK0sdGXAoAgcScDoDAAVwPR8cEDZg", "PNkiv");
        lIlIIlllIl[lIlIlIIIIl[167]] = lIIIlllIIlIIl("CxUaXA==", "RpirP");
        lIlIIlllIl[lIlIlIIIIl[168]] = lIIIlllIIlIII("G0T1Z8BGBIiGMohxW5RhyzUT4Bfx8v5s", "sREzb");
        lIlIIlllIl[lIlIlIIIIl[169]] = lIIIlllIIlIII("rNXe6JdzG0MIxj+0QRgSkIW+VTZUPx7DunNn02jsMCs=", "CsBPU");
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        bR();
        return lIlIlIIIIl[109];
    }

    private static String lIIIlllIIlIII(String lllllllllllllllllllIlllllIIIIlIl, String lllllllllllllllllllIlllllIIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlllllIIIIlII.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIl[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIIl[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlllllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlllllIIIIllI) {
            lllllllllllllllllllIlllllIIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIlIlI(int i) {
        return i == 0;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIIlllIl[lIlIlIIIIl[116]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIllllIllll(C0004e.j(lIlIlIIIIl[2]), lIlIlIIIIl[18])) {
            ?? r0 = lIlIlIIIIl[3];
            "".length();
            return ((46 ^ 34) ^ (92 ^ 84)) <= " ".length() ? ((118 ^ 22) ^ (217 ^ 151)) & (((((28 + 128) - 62) + 40) ^ (((113 + 149) - 216) + 122)) ^ (-" ".length())) : r0;
        }
        return lIlIlIIIIl[4];
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0263, code lost:
        if (lIIIllllIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.D.lIlIlIIIIl[22]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02a6, code lost:
        if (lIIIllllIllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.D.lIlIlIIIIl[13]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02e9, code lost:
        if (lIIIllllIIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.D.lIlIlIIIIl[33]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02ec, code lost:
        O();
        java.lang.System.out.println(h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.D.lIlIIlllIl[h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.D.lIlIlIIIIl[104(0x68, float:1.46E-43)]]);
        h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.D.bn = h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.D.lIlIlIIIIl[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0307, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v184, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v199, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v214, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v232, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void bT() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIIllllIllIl(nearest) && lIIIllllIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[97]];
            C0000a.a(nearest);
        }
        if (lIIIllllIllIl(nearest) && lIIIllllIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIllllIlIlI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[98]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIlIlIIIIl[99]);
                "".length();
            }
            if (lIIIllllIlIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIIlllIl[lIlIlIIIIl[100]];
                if (lIIIlllllIIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIlIlIIIIl[12]);
                    "".length();
                }
                if (lIIIlllllIIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIlIlIIIIl[1]);
                    "".length();
                }
                while (lIIIllllIlIlI(C0024y.bv() ? 1 : 0) && lIIIllllIlIlI(AccBuilderShamans.d ? 1 : 0)) {
                    C0024y.bt();
                    Time.sleepTicks(lIlIlIIIIl[3]);
                    "".length();
                    "".length();
                    if ("  ".length() < (-" ".length())) {
                        return;
                    }
                }
                int[] iArr = new int[lIlIlIIIIl[3]];
                iArr[lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                if (lIIIllllIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIlIIIIl[3]];
                    iArr2[lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                    if (lIIIllllIIlll(Bank.getFirst(iArr2).getQuantity(), lIlIlIIIIl[101])) {
                        O();
                        System.out.println(lIlIIlllIl[lIlIlIIIIl[102]]);
                        bn = lIlIlIIIIl[3];
                        return;
                    }
                }
                int[] iArr3 = new int[lIlIlIIIIl[3]];
                iArr3[lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                if (lIIIllllIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIlIlIIIIl[3]];
                    iArr4[lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                    if (lIIIllllIIlll(Bank.getFirst(iArr4).getQuantity(), lIlIlIIIIl[101])) {
                        O();
                        System.out.println(lIlIIlllIl[lIlIlIIIIl[16]]);
                        bn = lIlIlIIIIl[3];
                        return;
                    }
                }
                int[] iArr5 = new int[lIlIlIIIIl[3]];
                iArr5[lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                if (lIIIllllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIlIlIIIIl[3]];
                    iArr6[lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                    if (lIIIllllIIlll(Bank.getFirst(iArr6).getQuantity(), lIlIlIIIIl[101])) {
                        O();
                        System.out.println(lIlIIlllIl[lIlIlIIIIl[103]]);
                        bn = lIlIlIIIIl[3];
                        return;
                    }
                }
                int[] iArr7 = new int[lIlIlIIIIl[3]];
                iArr7[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                if (lIIIllllIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
                    int[] iArr8 = new int[lIlIlIIIIl[3]];
                    iArr8[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                }
                int[] iArr9 = new int[lIlIlIIIIl[3]];
                iArr9[lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                if (lIIIllllIlIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIlIIIIl[3]];
                    iArr10[lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                }
                int[] iArr11 = new int[lIlIlIIIIl[3]];
                iArr11[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                if (lIIIllllIlIIl(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIlIlIIIIl[3]];
                    iArr12[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                }
                int[] iArr13 = new int[lIlIlIIIIl[18]];
                iArr13[lIlIlIIIIl[4]] = lIlIlIIIIl[105];
                iArr13[lIlIlIIIIl[3]] = lIlIlIIIIl[10];
                iArr13[lIlIlIIIIl[1]] = lIlIlIIIIl[9];
                iArr13[lIlIlIIIIl[12]] = lIlIlIIIIl[8];
                iArr13[lIlIlIIIIl[15]] = lIlIlIIIIl[7];
                iArr13[lIlIlIIIIl[13]] = lIlIlIIIIl[5];
                iArr13[lIlIlIIIIl[14]] = lIlIlIIIIl[6];
                if (lIIIllllIlIlI(C0004e.b(iArr13) ? 1 : 0)) {
                    O();
                    System.out.println(lIlIIlllIl[lIlIlIIIIl[106]]);
                    bn = lIlIlIIIIl[3];
                    return;
                }
                if (lIIIllllIlIlI(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(lIlIlIIIIl[15]);
                    "".length();
                }
                int[] iArr14 = new int[lIlIlIIIIl[3]];
                iArr14[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                if (lIIIllllIlIIl(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlIlIIIIl[3]];
                    iArr15[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                    if (lIIIllllIIlll(Inventory.getCount(iArr15), lIlIlIIIIl[3])) {
                        Bank.withdraw(lIlIlIIIIl[10], lIlIlIIIIl[13], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIIIIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lIlIlIIIIl[3]];
                            iArr16[lIlIlIIIIl[4]] = lIlIlIIIIl[10];
                            if (lIIIlllllIIII(Inventory.getCount(iArr16))) {
                                ?? r0 = lIlIlIIIIl[3];
                                "".length();
                                return 0 != 0 ? ((((97 + 46) - 53) + 57) ^ (((1 + 105) - 47) + 99)) & (((((122 + 76) - 42) + 7) ^ (((122 + 13) - 11) + 50)) ^ (-" ".length())) : r0;
                            }
                            return lIlIlIIIIl[4];
                        }, lIlIlIIIIl[99]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[lIlIlIIIIl[3]];
                iArr16[lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                if (lIIIllllIlIIl(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[lIlIlIIIIl[3]];
                    iArr17[lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                    if (lIIIllllIIlll(Inventory.getCount(iArr17), lIlIlIIIIl[3])) {
                        Bank.withdraw(lIlIlIIIIl[9], lIlIlIIIIl[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIIIIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[lIlIlIIIIl[3]];
                            iArr18[lIlIlIIIIl[4]] = lIlIlIIIIl[9];
                            if (lIIIlllllIIII(Inventory.getCount(iArr18))) {
                                ?? r0 = lIlIlIIIIl[3];
                                "".length();
                                return (-" ".length()) != (-" ".length()) ? (false ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlIlIIIIl[4];
                        }, lIlIlIIIIl[99]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[lIlIlIIIIl[3]];
                iArr18[lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                if (lIIIllllIlIIl(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[lIlIlIIIIl[3]];
                    iArr19[lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                    if (lIIIllllIIlll(Inventory.getCount(iArr19), lIlIlIIIIl[3])) {
                        Bank.withdraw(lIlIlIIIIl[7], lIlIlIIIIl[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIIIIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[lIlIlIIIIl[3]];
                            iArr20[lIlIlIIIIl[4]] = lIlIlIIIIl[7];
                            if (lIIIlllllIIII(Inventory.getCount(iArr20))) {
                                ?? r0 = lIlIlIIIIl[3];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlIlIIIIl[4];
                        }, lIlIlIIIIl[99]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIlIlIIIIl[3]];
                iArr20[lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                if (lIIIllllIlIIl(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lIlIlIIIIl[3]];
                    iArr21[lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                    if (lIIIllllIIlll(Inventory.getCount(iArr21), lIlIlIIIIl[3])) {
                        Bank.withdraw(lIlIlIIIIl[5], lIlIlIIIIl[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIIIIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[lIlIlIIIIl[3]];
                            iArr22[lIlIlIIIIl[4]] = lIlIlIIIIl[5];
                            if (lIIIlllllIIII(Inventory.getCount(iArr22))) {
                                ?? r0 = lIlIlIIIIl[3];
                                "".length();
                                return " ".length() != " ".length() ? ((((49 + 157) - 201) + 244) ^ (((79 + 24) - 2) + 96)) & (((127 ^ 115) ^ (53 ^ 5)) ^ (-" ".length())) : r0;
                            }
                            return lIlIlIIIIl[4];
                        }, lIlIlIIIIl[99]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[lIlIlIIIIl[3]];
                iArr22[lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                if (lIIIllllIlIIl(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[lIlIlIIIIl[3]];
                    iArr23[lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                    if (lIIIllllIIlll(Inventory.getCount(iArr23), lIlIlIIIIl[3])) {
                        Bank.withdraw(lIlIlIIIIl[6], lIlIlIIIIl[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIIIIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[lIlIlIIIIl[3]];
                            iArr24[lIlIlIIIIl[4]] = lIlIlIIIIl[6];
                            if (lIIIlllllIIII(Inventory.getCount(iArr24))) {
                                ?? r0 = lIlIlIIIIl[3];
                                "".length();
                                return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlIlIIIIl[4];
                        }, lIlIlIIIIl[99]);
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIlIlIIIIl[3]];
                iArr24[lIlIlIIIIl[4]] = lIlIlIIIIl[108];
                if (lIIIllllIlIIl(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[lIlIlIIIIl[3]];
                    iArr25[lIlIlIIIIl[4]] = lIlIlIIIIl[108];
                    if (lIIIllllIlIlI(Inventory.contains(iArr25) ? 1 : 0)) {
                        Bank.withdraw(lIlIlIIIIl[108], lIlIlIIIIl[3], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIIIIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr26 = new int[lIlIlIIIIl[3]];
                            iArr26[lIlIlIIIIl[4]] = lIlIlIIIIl[108];
                            return Inventory.contains(iArr26);
                        }, lIlIlIIIIl[99]);
                        "".length();
                    }
                }
                int[] iArr26 = new int[lIlIlIIIIl[3]];
                iArr26[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                if (lIIIllllIlIIl(Bank.contains(iArr26) ? 1 : 0)) {
                    int[] iArr27 = new int[lIlIlIIIIl[3]];
                    iArr27[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                    if (lIIIllllIIlll(Inventory.getCount(iArr27), lIlIlIIIIl[3])) {
                        Bank.withdrawAll(lIlIlIIIIl[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIIIIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr28 = new int[lIlIlIIIIl[3]];
                            iArr28[lIlIlIIIIl[4]] = lIlIlIIIIl[8];
                            if (lIIIlllllIIII(Inventory.getCount(iArr28))) {
                                ?? r0 = lIlIlIIIIl[3];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlIlIIIIl[4];
                        }, lIlIlIIIIl[99]);
                        "".length();
                    }
                }
            }
        }
    }
}
