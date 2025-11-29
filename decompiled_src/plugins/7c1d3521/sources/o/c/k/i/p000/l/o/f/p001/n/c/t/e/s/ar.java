package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ar  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ar.class */
public class ar implements InterfaceC0003ac {
    public static /* synthetic */ int mT;
    static /* synthetic */ long nS;
    static /* synthetic */ int cG;
    public static /* synthetic */ WorldPoint nI;
    public static /* synthetic */ String nN;
    public static /* synthetic */ int mV;
    private static /* synthetic */ int[] llIIlIllIl;
    static /* synthetic */ WorldArea nO;
    static /* synthetic */ WorldPoint nP;
    private static /* synthetic */ String[] llIIlIlIlI;
    public static /* synthetic */ WorldArea nM;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldArea nL;
    static /* synthetic */ WorldPoint nR;
    public static /* synthetic */ int mU;
    static /* synthetic */ WorldPoint nQ;
    public static /* synthetic */ int nK;
    public static /* synthetic */ int nJ;
    public static /* synthetic */ WorldArea nH;
    public static /* synthetic */ List<C0017d> bv;

    private static boolean lIlIlIlllIIII(int i) {
        return i > 0;
    }

    private static boolean lIlIlIllIlIIl(int i) {
        return i != 0;
    }

    public static void b(int[] iArr) {
        if (lIlIlIllIlIIl(Inventory.contains(iArr) ? 1 : 0) && lIlIlIllIlIll(Equipment.contains(iArr) ? 1 : 0)) {
            Item first = Inventory.getFirst(iArr);
            String[] strArr = new String[llIIlIllIl[1]];
            strArr[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[200]];
            if (lIlIlIllIlIIl(first.hasAction(strArr) ? 1 : 0)) {
                Inventory.getFirst(iArr).interact(llIIlIlIlI[llIIlIllIl[201]]);
            }
            Item first2 = Inventory.getFirst(iArr);
            String[] strArr2 = new String[llIIlIllIl[1]];
            strArr2[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[202]];
            if (lIlIlIllIlIIl(first2.hasAction(strArr2) ? 1 : 0)) {
                Inventory.getFirst(iArr).interact(llIIlIlIlI[llIIlIllIl[203]]);
            }
            Item first3 = Inventory.getFirst(iArr);
            String[] strArr3 = new String[llIIlIllIl[1]];
            strArr3[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[204]];
            if (lIlIlIllIlIIl(first3.hasAction(strArr3) ? 1 : 0)) {
                Inventory.getFirst(iArr).interact(llIIlIlIlI[llIIlIllIl[205]]);
            }
        }
    }

    private static boolean lIlIlIlllIlIl(int i, int i2) {
        return i == i2;
    }

    private static List<WorldPoint> a(as asVar) {
        ArrayList arrayList = new ArrayList();
        while (lIlIlIllIlllI(asVar)) {
            arrayList.add(asVar.nT);
            "".length();
            asVar = asVar.nU;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            gb();
            "".length();
            if ("   ".length() == 0) {
                return ((98 ^ 103) ^ (49 ^ 15)) & (((4 ^ 63) ^ ((25 ^ 2) & ((37 ^ 62) ^ (-1)))) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIlIllIl[13];
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0752, code lost:
        if (lIlIlIllIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x09a9, code lost:
        if (lIlIlIllIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0cfd, code lost:
        if (lIlIlIllIlIlI(net.unethicalite.api.items.Inventory.getAll(r0).size(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ar.llIIlIllIl[10]) != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x1577, code lost:
        if (lIlIlIlllIlII(net.unethicalite.api.game.Game.getState(), net.runelite.api.GameState.LOGGED_IN) == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x157a, code lost:
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ar.llIIlIlIlI[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ar.llIIlIllIl[164(0xa4, float:2.3E-43)]]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x15a7, code lost:
        if ("   ".length() != ((146 ^ 157) & ((173 ^ 162) ^ (-1)))) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x15aa, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01e3, code lost:
        if (lIlIlIllIllll(net.unethicalite.api.entities.TileObjects.getNearest((v0) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
            return ad(v0);
        })) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x046b, code lost:
        if (lIlIlIllIlIlI(net.unethicalite.api.items.Inventory.getAll(r0).size(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ar.llIIlIllIl[10]) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0534, code lost:
        if (lIlIlIlllIIIl(net.unethicalite.api.items.Inventory.getAll(r0).size(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ar.llIIlIllIl[10]) != false) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0f82  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0673  */
    /* JADX WARN: Type inference failed for: r0v447, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v377, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v378, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void gc() {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        TileObject nearest;
        String[] strArr8 = new String[llIIlIllIl[1]];
        strArr8[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[52]];
        C0020g.a(strArr8);
        TileObject nearest2 = TileObjects.getNearest(tileObject -> {
            String[] strArr9 = new String[llIIlIllIl[1]];
            strArr9[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[271]];
            return tileObject.hasAction(strArr9);
        });
        TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
            String[] strArr9 = new String[llIIlIllIl[1]];
            strArr9[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[270]];
            return tileObject2.hasAction(strArr9);
        });
        if (lIlIlIllIlllI(Widgets.get(llIIlIllIl[34], llIIlIllIl[24])) && lIlIlIllIlllI(nearest2) && lIlIlIllIlllI(nearest3) && lIlIlIllIlIlI(nearest2.distanceTo(nearest3), llIIlIllIl[16]) && lIlIlIllIlIlI(mV, llIIlIllIl[14])) {
            nR = null;
            cG = llIIlIllIl[0];
            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[53]];
            Widget widget = Widgets.get(llIIlIllIl[34], llIIlIllIl[24]);
            if (lIlIlIllIlllI(widget)) {
                Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) llIIlIllIl[1]);
                Time.sleepUntil(() -> {
                    if (lIlIlIllIllll(Widgets.fromId(llIIlIllIl[269]))) {
                        ?? r0 = llIIlIllIl[1];
                        "".length();
                        return 0 != 0 ? ((((130 + 182) - 153) + 70) ^ (((133 + 100) - 81) + 47)) & (((87 ^ 7) ^ (127 ^ 13)) ^ (-" ".length())) : r0;
                    }
                    return llIIlIllIl[0];
                }, llIIlIllIl[54], llIIlIllIl[55]);
                "".length();
                mV += llIIlIllIl[1];
            }
            if (lIlIlIlllIIII(lIlIlIlllIIlI(System.currentTimeMillis(), nS + 30000))) {
                mV = llIIlIllIl[0];
            }
        }
        String[] strArr9 = new String[llIIlIllIl[1]];
        strArr9[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[56]];
        if (lIlIlIllIllll(NPCs.getNearest(strArr9))) {
            String[] strArr10 = new String[llIIlIllIl[1]];
            strArr10[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[57]];
            if (lIlIlIllIllll(NPCs.getNearest(strArr10))) {
                String[] strArr11 = new String[llIIlIllIl[1]];
                strArr11[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[58]];
                if (lIlIlIllIllll(NPCs.getNearest(strArr11))) {
                    String[] strArr12 = new String[llIIlIllIl[1]];
                    strArr12[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[59]];
                    if (lIlIlIllIllll(NPCs.getNearest(strArr12))) {
                        String[] strArr13 = new String[llIIlIllIl[1]];
                        strArr13[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[60]];
                        if (lIlIlIllIllll(NPCs.getNearest(strArr13))) {
                            String[] strArr14 = new String[llIIlIllIl[1]];
                            strArr14[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[61]];
                            if (lIlIlIllIllll(NPCs.getNearest(strArr14))) {
                                if (lIlIlIllIllll(TileObjects.getNearest(tileObject3 -> {
                                    return tileObject3.getName().contains(llIIlIlIlI[llIIlIllIl[268]]);
                                }))) {
                                }
                                strArr = new String[llIIlIllIl[1]];
                                strArr[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[67]];
                                if (lIlIlIllIlllI(NPCs.getNearest(strArr)) && lIlIlIllIlIll(nH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(nI), llIIlIllIl[68])) {
                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[69]];
                                    nearest = TileObjects.getNearest(tileObject4 -> {
                                        String[] strArr15 = new String[llIIlIllIl[1]];
                                        strArr15[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[265]];
                                        return tileObject4.hasAction(strArr15);
                                    });
                                    if (lIlIlIllIlllI(nearest)) {
                                        nearest.interact(llIIlIlIlI[llIIlIllIl[70]]);
                                        Time.sleepUntil(() -> {
                                            if (lIlIlIllIlIll(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                ?? r0 = llIIlIllIl[1];
                                                "".length();
                                                return " ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                            }
                                            return llIIlIllIl[0];
                                        }, Rand.nextInt(llIIlIllIl[65], llIIlIllIl[66]));
                                        "".length();
                                    }
                                }
                                TileObjects.getNearest(tileObject5 -> {
                                    return tileObject5.getName().contains(llIIlIlIlI[llIIlIllIl[264]]);
                                });
                                strArr2 = new String[llIIlIllIl[1]];
                                strArr2[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[71]];
                                if (lIlIlIllIlllI(TileObjects.getNearest(strArr2))) {
                                    nR = null;
                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[27]];
                                    String[] strArr15 = new String[llIIlIllIl[1]];
                                    strArr15[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[72]];
                                    if (lIlIlIllIllll(TileObjects.getNearest(strArr15))) {
                                        String[] strArr16 = new String[llIIlIllIl[1]];
                                        strArr16[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[73]];
                                        TileItem nearest4 = TileItems.getNearest(strArr16);
                                        if (lIlIlIllIlllI(nearest4)) {
                                            nearest4.interact(llIIlIlIlI[llIIlIllIl[74]]);
                                            Time.sleepTicks(llIIlIllIl[1]);
                                            "".length();
                                        }
                                        if (lIlIlIllIlllI(TileItems.getNearest(tileItem -> {
                                            return tileItem.getName().contains(llIIlIlIlI[llIIlIllIl[263]]);
                                        }))) {
                                        }
                                        String[] strArr17 = new String[llIIlIllIl[1]];
                                        strArr17[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[75]];
                                        NPC nearest5 = NPCs.getNearest(strArr17);
                                        if (lIlIlIllIlllI(nearest5) && lIlIlIlllIlII(LocalPlayer.get().getInteracting(), nearest5) && lIlIlIllIlIll(nearest5.isDead() ? 1 : 0) && lIlIlIllIlIIl(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                                            nearest5.interact(llIIlIlIlI[llIIlIllIl[76]]);
                                        }
                                    }
                                    String[] strArr18 = new String[llIIlIllIl[1]];
                                    strArr18[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[77]];
                                    if (lIlIlIllIlIIl(Inventory.contains(strArr18) ? 1 : 0)) {
                                        String[] strArr19 = new String[llIIlIllIl[1]];
                                        strArr19[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[78]];
                                    }
                                    String[] strArr20 = new String[llIIlIllIl[1]];
                                    strArr20[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[79]];
                                    if (lIlIlIllIlllI(TileObjects.getNearest(strArr20)) && lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                        String[] strArr21 = new String[llIIlIllIl[1]];
                                        strArr21[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[81]];
                                        TileObjects.getNearest(strArr21).interact(llIIlIlIlI[llIIlIllIl[68]]);
                                        Time.sleepTicks(llIIlIllIl[2]);
                                        "".length();
                                    }
                                    String[] strArr22 = new String[llIIlIllIl[1]];
                                    strArr22[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[82]];
                                    if (lIlIlIllIlIlI(Inventory.getAll(strArr22).size(), llIIlIllIl[10])) {
                                        String[] strArr23 = new String[llIIlIllIl[1]];
                                        strArr23[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[83]];
                                    }
                                    String[] strArr24 = new String[llIIlIllIl[1]];
                                    strArr24[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[84]];
                                    if (lIlIlIllIlIIl(Inventory.contains(strArr24) ? 1 : 0) && lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                        String[] strArr25 = new String[llIIlIllIl[1]];
                                        strArr25[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[85]];
                                        Item first = Inventory.getFirst(strArr25);
                                        String[] strArr26 = new String[llIIlIllIl[1]];
                                        strArr26[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[86]];
                                        first.useOn(TileObjects.getNearest(strArr26));
                                        Time.sleepTicks(llIIlIllIl[2]);
                                        "".length();
                                    }
                                    String[] strArr27 = new String[llIIlIllIl[1]];
                                    strArr27[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[87]];
                                    if (lIlIlIllIlIIl(Inventory.contains(strArr27) ? 1 : 0) && lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                        String[] strArr28 = new String[llIIlIllIl[1]];
                                        strArr28[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[88]];
                                        Item first2 = Inventory.getFirst(strArr28);
                                        String[] strArr29 = new String[llIIlIllIl[1]];
                                        strArr29[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[89]];
                                        first2.useOn(TileObjects.getNearest(strArr29));
                                        Time.sleepTicks(llIIlIllIl[2]);
                                        "".length();
                                    }
                                    String[] strArr30 = new String[llIIlIllIl[1]];
                                    strArr30[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[90]];
                                    C0020g.a(strArr30);
                                }
                                strArr3 = new String[llIIlIllIl[1]];
                                strArr3[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[91]];
                                if (lIlIlIllIlllI(TileObjects.getNearest(strArr3))) {
                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[92]];
                                    String[] strArr31 = new String[llIIlIllIl[1]];
                                    strArr31[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[93]];
                                    if (lIlIlIllIlIll(Inventory.contains(strArr31) ? 1 : 0) && lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                        String[] strArr32 = new String[llIIlIllIl[1]];
                                        strArr32[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[94]];
                                        if (lIlIlIllIlllI(TileObjects.getNearest(strArr32))) {
                                            String[] strArr33 = new String[llIIlIllIl[1]];
                                            strArr33[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[95]];
                                            TileObjects.getNearest(strArr33).interact(llIIlIlIlI[llIIlIllIl[96]]);
                                            Time.sleepTicks(llIIlIllIl[2]);
                                            "".length();
                                        }
                                    }
                                    String[] strArr34 = new String[llIIlIllIl[1]];
                                    strArr34[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[97]];
                                    if (lIlIlIllIlIll(Inventory.contains(strArr34) ? 1 : 0)) {
                                        String[] strArr35 = new String[llIIlIllIl[1]];
                                        strArr35[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[98]];
                                    }
                                    String[] strArr36 = new String[llIIlIllIl[1]];
                                    strArr36[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[99]];
                                    if (lIlIlIllIlIIl(Inventory.contains(strArr36) ? 1 : 0) && lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                        String[] strArr37 = new String[llIIlIllIl[1]];
                                        strArr37[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[100]];
                                        Item first3 = Inventory.getFirst(strArr37);
                                        String[] strArr38 = new String[llIIlIllIl[1]];
                                        strArr38[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[101]];
                                        first3.useOn(TileObjects.getNearest(strArr38));
                                        Time.sleepTicks(llIIlIllIl[2]);
                                        "".length();
                                    }
                                    String[] strArr39 = new String[llIIlIllIl[1]];
                                    strArr39[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[102]];
                                    if (lIlIlIllIlIIl(Inventory.contains(strArr39) ? 1 : 0) && lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                        String[] strArr40 = new String[llIIlIllIl[1]];
                                        strArr40[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[103]];
                                        Item first4 = Inventory.getFirst(strArr40);
                                        String[] strArr41 = new String[llIIlIllIl[1]];
                                        strArr41[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[104]];
                                        first4.useOn(TileObjects.getNearest(strArr41));
                                        Time.sleepTicks(llIIlIllIl[2]);
                                        "".length();
                                    }
                                    String[] strArr42 = new String[llIIlIllIl[1]];
                                    strArr42[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[105]];
                                    TileObjects.getNearest(strArr42).interact(llIIlIlIlI[llIIlIllIl[106]]);
                                    Time.sleepTicks(llIIlIllIl[2]);
                                    "".length();
                                    String[] strArr43 = new String[llIIlIllIl[1]];
                                    strArr43[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[107]];
                                    C0020g.a(strArr43);
                                }
                                strArr4 = new String[llIIlIllIl[1]];
                                strArr4[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[108]];
                                if (lIlIlIllIlllI(TileObjects.getNearest(strArr4))) {
                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[109]];
                                    String[] strArr44 = new String[llIIlIllIl[1]];
                                    strArr44[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[110]];
                                    if (lIlIlIllIlIll(Inventory.contains(strArr44) ? 1 : 0) && lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                        String[] strArr45 = new String[llIIlIllIl[1]];
                                        strArr45[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[111]];
                                        if (lIlIlIllIlllI(TileObjects.getNearest(strArr45))) {
                                            String[] strArr46 = new String[llIIlIllIl[1]];
                                            strArr46[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[112]];
                                            TileObjects.getNearest(strArr46).interact(llIIlIlIlI[llIIlIllIl[113]]);
                                            Time.sleepTicks(llIIlIllIl[2]);
                                            "".length();
                                        }
                                    }
                                    String[] strArr47 = new String[llIIlIllIl[1]];
                                    strArr47[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[114]];
                                    if (lIlIlIllIlIll(Inventory.contains(strArr47) ? 1 : 0)) {
                                        String[] strArr48 = new String[llIIlIllIl[1]];
                                        strArr48[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[115]];
                                    }
                                    String[] strArr49 = new String[llIIlIllIl[1]];
                                    strArr49[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[116]];
                                    if (lIlIlIllIlIIl(Inventory.contains(strArr49) ? 1 : 0) && lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                        String[] strArr50 = new String[llIIlIllIl[1]];
                                        strArr50[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[117]];
                                        Item first5 = Inventory.getFirst(strArr50);
                                        String[] strArr51 = new String[llIIlIllIl[1]];
                                        strArr51[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[118]];
                                        first5.useOn(TileObjects.getNearest(strArr51));
                                        Time.sleepTicks(llIIlIllIl[2]);
                                        "".length();
                                    }
                                    String[] strArr52 = new String[llIIlIllIl[1]];
                                    strArr52[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[119]];
                                    if (lIlIlIllIlIIl(Inventory.contains(strArr52) ? 1 : 0) && lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                        String[] strArr53 = new String[llIIlIllIl[1]];
                                        strArr53[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[120]];
                                        Item first6 = Inventory.getFirst(strArr53);
                                        String[] strArr54 = new String[llIIlIllIl[1]];
                                        strArr54[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[13]];
                                        first6.useOn(TileObjects.getNearest(strArr54));
                                        Time.sleepTicks(llIIlIllIl[2]);
                                        "".length();
                                    }
                                    String[] strArr55 = new String[llIIlIllIl[1]];
                                    strArr55[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[121]];
                                    TileObjects.getNearest(strArr55).interact(llIIlIlIlI[llIIlIllIl[122]]);
                                    Time.sleepTicks(llIIlIllIl[2]);
                                    "".length();
                                    String[] strArr56 = new String[llIIlIllIl[1]];
                                    strArr56[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[123]];
                                    C0020g.a(strArr56);
                                }
                                strArr5 = new String[llIIlIllIl[1]];
                                strArr5[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[124]];
                                if (lIlIlIllIlllI(TileObjects.getNearest(strArr5))) {
                                    String[] strArr57 = new String[llIIlIllIl[1]];
                                    strArr57[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[125]];
                                    List list = (List) TileObjects.getAll(strArr57).stream().filter(tileObject6 -> {
                                        String[] strArr58 = new String[llIIlIllIl[1]];
                                        strArr58[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[262]];
                                        return tileObject6.hasAction(strArr58);
                                    }).collect(Collectors.toList());
                                    TileObject nearest6 = TileObjects.getNearest(tileObject7 -> {
                                        String[] strArr58 = new String[llIIlIllIl[1]];
                                        strArr58[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[260]];
                                        if (lIlIlIllIlIIl(tileObject7.hasAction(strArr58) ? 1 : 0) && lIlIlIllIlIIl(tileObject7.getName().equals(llIIlIlIlI[llIIlIllIl[261]]) ? 1 : 0)) {
                                            ?? r0 = llIIlIllIl[1];
                                            "".length();
                                            return (((208 ^ 156) ^ "   ".length()) & (((((132 + 49) - (-5)) + 61) ^ (((160 + 142) - 146) + 28)) ^ (-" ".length()))) < (-" ".length()) ? ((64 ^ 71) ^ (90 ^ 117)) & (((((149 + 70) - 155) + 115) ^ (((22 + 22) - (-16)) + 95)) ^ (-" ".length())) : r0;
                                        }
                                        return llIIlIllIl[0];
                                    });
                                    if (lIlIlIllIlllI(nearest6)) {
                                        if (lIlIlIlllIIIl(Players.getLocal().getWorldX(), nearest6.getWorldX())) {
                                            TileObject nearest7 = TileObjects.getNearest(tileObject8 -> {
                                                String[] strArr58 = new String[llIIlIllIl[1]];
                                                strArr58[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[259]];
                                                return tileObject8.hasAction(strArr58);
                                            });
                                            if (lIlIlIllIlllI(nearest7)) {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[126]];
                                                nearest7.interact(llIIlIlIlI[llIIlIllIl[127]]);
                                                Time.sleepTicks(C0018e.c(llIIlIllIl[10], llIIlIllIl[14]));
                                                "".length();
                                                "".length();
                                                if ((((127 ^ 60) ^ (158 ^ 130)) & (((39 ^ 68) ^ (138 ^ 182)) ^ (-" ".length()))) != 0) {
                                                    return;
                                                }
                                            }
                                        } else {
                                            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[128]];
                                            nearest6.interact(llIIlIlIlI[llIIlIllIl[129]]);
                                            Time.sleepTicks(llIIlIllIl[11]);
                                            "".length();
                                        }
                                    }
                                }
                                strArr6 = new String[llIIlIllIl[1]];
                                strArr6[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[130]];
                                if (lIlIlIllIlllI(TileObjects.getNearest(strArr6))) {
                                    nR = null;
                                    String[] strArr58 = new String[llIIlIllIl[1]];
                                    strArr58[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[131]];
                                    List list2 = (List) TileObjects.getAll(strArr58).stream().filter(tileObject9 -> {
                                        String[] strArr59 = new String[llIIlIllIl[1]];
                                        strArr59[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[258]];
                                        return tileObject9.hasAction(strArr59);
                                    }).collect(Collectors.toList());
                                    if (lIlIlIllIlIll(list2.isEmpty() ? 1 : 0)) {
                                        if (lIlIlIllIlIll(Reachable.isInteractable((Locatable) list2.get(llIIlIllIl[0])) ? 1 : 0)) {
                                            String[] strArr59 = new String[llIIlIllIl[1]];
                                            strArr59[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[132]];
                                            if (lIlIlIllIlIIl(Inventory.contains(strArr59) ? 1 : 0)) {
                                                String[] strArr60 = new String[llIIlIllIl[1]];
                                                strArr60[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[133]];
                                            }
                                            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[134]];
                                            String[] strArr61 = new String[llIIlIllIl[1]];
                                            strArr61[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[135]];
                                            List list3 = (List) TileObjects.getAll(strArr61).stream().filter(tileObject10 -> {
                                                String[] strArr62 = new String[llIIlIllIl[1]];
                                                strArr62[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[257]];
                                                return tileObject10.hasAction(strArr62);
                                            }).collect(Collectors.toList());
                                            if (lIlIlIllIlIll(list3.isEmpty() ? 1 : 0)) {
                                                ((TileObject) list3.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[136]]);
                                                Time.sleepTicks(llIIlIllIl[2]);
                                                "".length();
                                            }
                                            String[] strArr62 = new String[llIIlIllIl[1]];
                                            strArr62[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[137]];
                                            if (lIlIlIllIlIIl(Inventory.contains(strArr62) ? 1 : 0)) {
                                                String[] strArr63 = new String[llIIlIllIl[1]];
                                                strArr63[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[138]];
                                                if (lIlIlIlllIIIl(Inventory.getAll(strArr63).size(), llIIlIllIl[10])) {
                                                    String[] strArr64 = new String[llIIlIllIl[1]];
                                                    strArr64[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[139]];
                                                    Item first7 = Inventory.getFirst(strArr64);
                                                    String[] strArr65 = new String[llIIlIllIl[1]];
                                                    strArr65[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[140]];
                                                    first7.useOn((Item) Inventory.getAll(strArr65).get(llIIlIllIl[1]));
                                                }
                                            }
                                            String[] strArr66 = new String[llIIlIllIl[1]];
                                            strArr66[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[141]];
                                            if (lIlIlIllIlIIl(Inventory.contains(strArr66) ? 1 : 0)) {
                                                String[] strArr67 = new String[llIIlIllIl[1]];
                                                strArr67[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[142]];
                                                Item first8 = Inventory.getFirst(strArr67);
                                                int[] iArr = new int[llIIlIllIl[1]];
                                                iArr[llIIlIllIl[0]] = llIIlIllIl[143];
                                                first8.useOn(TileObjects.getNearest(iArr));
                                                Time.sleepTicks(llIIlIllIl[15]);
                                                "".length();
                                            }
                                            String[] strArr68 = new String[llIIlIllIl[1]];
                                            strArr68[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[144]];
                                            List list4 = (List) TileObjects.getAll(strArr68).stream().filter(tileObject11 -> {
                                                String[] strArr69 = new String[llIIlIllIl[1]];
                                                strArr69[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[256]];
                                                return tileObject11.hasAction(strArr69);
                                            }).collect(Collectors.toList());
                                            if (lIlIlIllIlIll(list4.isEmpty() ? 1 : 0)) {
                                                ((TileObject) list4.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[145]]);
                                                Time.sleepTicks(llIIlIllIl[15]);
                                                "".length();
                                            }
                                        }
                                        if (lIlIlIllIlIIl(Reachable.isInteractable((Locatable) list2.get(llIIlIllIl[0])) ? 1 : 0)) {
                                            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[146]];
                                            ((TileObject) list2.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[147]]);
                                            Time.sleepTicks(C0018e.c(llIIlIllIl[10], llIIlIllIl[14]));
                                            "".length();
                                        }
                                    }
                                }
                                strArr7 = new String[llIIlIllIl[1]];
                                strArr7[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[148]];
                                if (lIlIlIllIlllI(TileObjects.getNearest(strArr7))) {
                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[149]];
                                    System.out.println(llIIlIlIlI[llIIlIllIl[150]]);
                                    ArrayList arrayList = new ArrayList();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    do {
                                        String[] strArr69 = new String[llIIlIllIl[1]];
                                        strArr69[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[151]];
                                        if (lIlIlIllIlIll(TileObjects.getAll(strArr69).isEmpty() ? 1 : 0) && lIlIlIlllIllI(Game.getState(), GameState.LOGGED_IN) && lIlIlIllIlIll(AccBuilderSotf.d ? 1 : 0)) {
                                            int i = llIIlIllIl[0];
                                            if (lIlIlIllIlIIl(arrayList.isEmpty() ? 1 : 0)) {
                                                Time.sleepTicks(llIIlIllIl[15]);
                                                "".length();
                                                System.out.println(llIIlIlIlI[llIIlIllIl[152]]);
                                                arrayList = TileObjects.getAll(tileObject12 -> {
                                                    if (lIlIlIlllIlIl(tileObject12.getId(), llIIlIllIl[255])) {
                                                        ?? r0 = llIIlIllIl[1];
                                                        "".length();
                                                        return " ".length() <= 0 ? ((((124 + 41) - 82) + 61) ^ (((127 + 30) - 66) + 69)) & (((19 ^ 107) ^ (226 ^ 170)) ^ (-" ".length())) : r0;
                                                    }
                                                    return llIIlIllIl[0];
                                                });
                                                System.out.println(llIIlIlIlI[llIIlIllIl[153]]);
                                                String[] strArr70 = new String[llIIlIllIl[1]];
                                                strArr70[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[154]];
                                                nR = TileObjects.getNearest(strArr70).getWorldLocation();
                                                TileObject nearest8 = TileObjects.getNearest(tileObject13 -> {
                                                    if (lIlIlIllIlIIl(tileObject13.getName().contains(llIIlIlIlI[llIIlIllIl[253]]) ? 1 : 0)) {
                                                        String[] strArr71 = new String[llIIlIllIl[1]];
                                                        strArr71[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[254]];
                                                        if (lIlIlIllIlIIl(tileObject13.hasAction(strArr71) ? 1 : 0)) {
                                                            ?? r0 = llIIlIllIl[1];
                                                            "".length();
                                                            return (68 ^ 64) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                        }
                                                    }
                                                    return llIIlIllIl[0];
                                                });
                                                if (lIlIlIllIlllI(nearest8) && lIlIlIllIllII(nearest8.getWorldLocation().getY(), nR.getY() + llIIlIllIl[17])) {
                                                    i = llIIlIllIl[1];
                                                }
                                            }
                                            System.out.println("Version: " + i);
                                            if (lIlIlIllIlIll(i)) {
                                                if (lIlIlIllIlllI(nR) && lIlIlIllIllII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[17])) {
                                                    List list5 = (List) arrayList.stream().map(tileObject14 -> {
                                                        return tileObject14.getWorldLocation();
                                                    }).collect(Collectors.toList());
                                                    WorldPoint[] worldPointArr = new WorldPoint[llIIlIllIl[18]];
                                                    worldPointArr[llIIlIllIl[0]] = new WorldPoint(nR.getX() - llIIlIllIl[14], nR.getY() - llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr[llIIlIllIl[1]] = new WorldPoint(nR.getX() - llIIlIllIl[11], nR.getY() - llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr[llIIlIllIl[2]] = new WorldPoint(nR.getX() - llIIlIllIl[10], nR.getY() - llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr[llIIlIllIl[10]] = new WorldPoint(nR.getX() - llIIlIllIl[2], nR.getY() - llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr[llIIlIllIl[11]] = new WorldPoint(nR.getX() - llIIlIllIl[1], nR.getY() - llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr[llIIlIllIl[14]] = new WorldPoint(nR.getX(), nR.getY() - llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr[llIIlIllIl[15]] = new WorldPoint(nR.getX() + llIIlIllIl[1], nR.getY() - llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr[llIIlIllIl[3]] = new WorldPoint(nR.getX() + llIIlIllIl[2], nR.getY() - llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr[llIIlIllIl[16]] = new WorldPoint(nR.getX() + llIIlIllIl[10], nR.getY() - llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr[llIIlIllIl[17]] = new WorldPoint(nR.getX() + llIIlIllIl[11], nR.getY() - llIIlIllIl[11], nR.getPlane());
                                                    List asList = Arrays.asList(worldPointArr);
                                                    System.out.println("Start tiles: " + asList.size());
                                                    int i2 = llIIlIllIl[0];
                                                    int i3 = llIIlIllIl[0];
                                                    while (true) {
                                                        if (!lIlIlIllIlIlI(i3, asList.size())) {
                                                            break;
                                                        }
                                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[155]];
                                                        List<WorldPoint> a = a((WorldPoint) asList.get(i3), nR.getY() - llIIlIllIl[17], list5);
                                                        if (lIlIlIllIlIll(a.isEmpty() ? 1 : 0)) {
                                                            System.out.println(llIIlIlIlI[llIIlIllIl[156]]);
                                                            for (WorldPoint worldPoint : a) {
                                                                System.out.println("(" + worldPoint.getX() + ", " + worldPoint.getY() + ", " + worldPoint.getPlane() + ")");
                                                                "".length();
                                                                if ((-(49 ^ 52)) >= 0) {
                                                                    return;
                                                                }
                                                            }
                                                            i2 = llIIlIllIl[1];
                                                            while (true) {
                                                                if (!lIlIlIllIlIIl(i2) || !lIlIlIllIlIll(a.isEmpty() ? 1 : 0)) {
                                                                    break;
                                                                }
                                                                if (lIlIlIllIlIll(Players.getLocal().getWorldLocation().equals(a.get(llIIlIllIl[0])) ? 1 : 0)) {
                                                                    if (lIlIlIllIllII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[11])) {
                                                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[157]];
                                                                        C0018e.c(a.get(llIIlIllIl[0]));
                                                                        Time.sleepUntil(() -> {
                                                                            if (lIlIlIllIllII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[11])) {
                                                                                ?? r0 = llIIlIllIl[1];
                                                                                "".length();
                                                                                return "   ".length() <= ((253 ^ 190) & ((123 ^ 56) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                                            }
                                                                            return llIIlIllIl[0];
                                                                        }, C0018e.c(llIIlIllIl[158], llIIlIllIl[159]));
                                                                        "".length();
                                                                        Time.sleepTicks(llIIlIllIl[2]);
                                                                        "".length();
                                                                        "".length();
                                                                        if ((-" ".length()) >= 0) {
                                                                            return;
                                                                        }
                                                                    } else {
                                                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[160]];
                                                                        String[] strArr71 = new String[llIIlIllIl[1]];
                                                                        strArr71[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[161]];
                                                                        List at = TileObjects.getAt(a.get(llIIlIllIl[0]), strArr71);
                                                                        if (lIlIlIllIlIll(at.isEmpty() ? 1 : 0)) {
                                                                            System.out.println("Bog size: " + at.size());
                                                                            ((TileObject) at.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[162]]);
                                                                            Time.sleepTicks(llIIlIllIl[2]);
                                                                            "".length();
                                                                        }
                                                                        if (lIlIlIllIlIIl(at.isEmpty() ? 1 : 0)) {
                                                                            System.out.println("Bog is null at: " + String.valueOf(a.get(llIIlIllIl[0])));
                                                                            Game.logout();
                                                                            Time.sleepTicks(llIIlIllIl[2]);
                                                                            "".length();
                                                                            "".length();
                                                                            if (0 != 0) {
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (lIlIlIllIlIIl(Players.getLocal().getWorldLocation().equals(a.get(llIIlIllIl[0])) ? 1 : 0)) {
                                                                    System.out.println(llIIlIlIlI[llIIlIllIl[163]]);
                                                                    a.remove(llIIlIllIl[0]);
                                                                    "".length();
                                                                    Time.sleepTicks(llIIlIllIl[2]);
                                                                    "".length();
                                                                }
                                                                Time.sleepTicks(llIIlIllIl[1]);
                                                                "".length();
                                                                "".length();
                                                                if (0 != 0) {
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                            "".length();
                                                            if ("   ".length() == 0) {
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    if (lIlIlIllIlIll(i2)) {
                                                        System.out.println(llIIlIlIlI[llIIlIllIl[165]]);
                                                    }
                                                    System.out.println(arrayList.size());
                                                }
                                                if (lIlIlIllIlllI(nR) && lIlIlIllIllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[17])) {
                                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[166]];
                                                    String[] strArr72 = new String[llIIlIllIl[1]];
                                                    strArr72[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[167]];
                                                    TileObjects.getNearest(strArr72).interact(llIIlIlIlI[llIIlIllIl[168]]);
                                                    Time.sleepTicks(llIIlIllIl[11]);
                                                    "".length();
                                                }
                                            }
                                            if (lIlIlIllIlIIl(i)) {
                                                if (lIlIlIllIlllI(nR) && lIlIlIllIlIlI(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[17])) {
                                                    List list6 = (List) arrayList.stream().map(tileObject15 -> {
                                                        return tileObject15.getWorldLocation();
                                                    }).collect(Collectors.toList());
                                                    WorldPoint[] worldPointArr2 = new WorldPoint[llIIlIllIl[18]];
                                                    worldPointArr2[llIIlIllIl[0]] = new WorldPoint(nR.getX() - llIIlIllIl[14], nR.getY() + llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr2[llIIlIllIl[1]] = new WorldPoint(nR.getX() - llIIlIllIl[11], nR.getY() + llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr2[llIIlIllIl[2]] = new WorldPoint(nR.getX() - llIIlIllIl[10], nR.getY() + llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr2[llIIlIllIl[10]] = new WorldPoint(nR.getX() - llIIlIllIl[2], nR.getY() + llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr2[llIIlIllIl[11]] = new WorldPoint(nR.getX() - llIIlIllIl[1], nR.getY() + llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr2[llIIlIllIl[14]] = new WorldPoint(nR.getX(), nR.getY() + llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr2[llIIlIllIl[15]] = new WorldPoint(nR.getX() + llIIlIllIl[1], nR.getY() + llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr2[llIIlIllIl[3]] = new WorldPoint(nR.getX() + llIIlIllIl[2], nR.getY() + llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr2[llIIlIllIl[16]] = new WorldPoint(nR.getX() + llIIlIllIl[10], nR.getY() + llIIlIllIl[11], nR.getPlane());
                                                    worldPointArr2[llIIlIllIl[17]] = new WorldPoint(nR.getX() + llIIlIllIl[11], nR.getY() + llIIlIllIl[11], nR.getPlane());
                                                    List asList2 = Arrays.asList(worldPointArr2);
                                                    System.out.println("Start tiles: " + asList2.size());
                                                    int i4 = llIIlIllIl[0];
                                                    int i5 = llIIlIllIl[0];
                                                    while (true) {
                                                        if (!lIlIlIllIlIlI(i5, asList2.size())) {
                                                            break;
                                                        }
                                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[169]];
                                                        List<WorldPoint> a2 = a((WorldPoint) asList2.get(i5), nR.getY() + llIIlIllIl[17], list6);
                                                        if (lIlIlIllIlIll(a2.isEmpty() ? 1 : 0)) {
                                                            System.out.println(llIIlIlIlI[llIIlIllIl[170]]);
                                                            for (WorldPoint worldPoint2 : a2) {
                                                                System.out.println("(" + worldPoint2.getX() + ", " + worldPoint2.getY() + ", " + worldPoint2.getPlane() + ")");
                                                                "".length();
                                                                if ("  ".length() == 0) {
                                                                    return;
                                                                }
                                                            }
                                                            i4 = llIIlIllIl[1];
                                                            while (true) {
                                                                if (!lIlIlIllIlIIl(i4) || !lIlIlIllIlIll(a2.isEmpty() ? 1 : 0)) {
                                                                    break;
                                                                }
                                                                if (lIlIlIllIlIll(Players.getLocal().getWorldLocation().equals(a2.get(llIIlIllIl[0])) ? 1 : 0)) {
                                                                    if (lIlIlIllIlIlI(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[11])) {
                                                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[171]];
                                                                        C0018e.c(a2.get(llIIlIllIl[0]));
                                                                        Time.sleepUntil(() -> {
                                                                            if (lIlIlIllIlIlI(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[11])) {
                                                                                ?? r0 = llIIlIllIl[1];
                                                                                "".length();
                                                                                return (-" ".length()) >= "   ".length() ? (!true) & ((true ^ true) ^ true) : r0;
                                                                            }
                                                                            return llIIlIllIl[0];
                                                                        }, C0018e.c(llIIlIllIl[158], llIIlIllIl[159]));
                                                                        "".length();
                                                                        Time.sleepTicks(llIIlIllIl[2]);
                                                                        "".length();
                                                                        "".length();
                                                                        if ("   ".length() == 0) {
                                                                            return;
                                                                        }
                                                                    } else {
                                                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[172]];
                                                                        String[] strArr73 = new String[llIIlIllIl[1]];
                                                                        strArr73[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[173]];
                                                                        List at2 = TileObjects.getAt(a2.get(llIIlIllIl[0]), strArr73);
                                                                        if (lIlIlIllIlIll(at2.isEmpty() ? 1 : 0)) {
                                                                            System.out.println("Bog size: " + at2.size());
                                                                            ((TileObject) at2.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[174]]);
                                                                            Time.sleepTicks(llIIlIllIl[2]);
                                                                            "".length();
                                                                        }
                                                                        if (lIlIlIllIlIIl(at2.isEmpty() ? 1 : 0)) {
                                                                            System.out.println("Bog is null at: " + String.valueOf(a2.get(llIIlIllIl[0])));
                                                                            Game.logout();
                                                                            Time.sleepTicks(llIIlIllIl[2]);
                                                                            "".length();
                                                                            "".length();
                                                                            if ((-(157 ^ 153)) >= 0) {
                                                                                return;
                                                                            }
                                                                        } else {
                                                                            Time.sleepTicks(llIIlIllIl[2]);
                                                                            "".length();
                                                                        }
                                                                    }
                                                                }
                                                                if (lIlIlIllIlIIl(Players.getLocal().getWorldLocation().equals(a2.get(llIIlIllIl[0])) ? 1 : 0)) {
                                                                    System.out.println(llIIlIlIlI[llIIlIllIl[175]]);
                                                                    a2.remove(llIIlIllIl[0]);
                                                                    "".length();
                                                                    Time.sleepTicks(llIIlIllIl[2]);
                                                                    "".length();
                                                                }
                                                                System.out.println("Path size lefT: " + a2.size());
                                                                Time.sleepTicks(llIIlIllIl[1]);
                                                                "".length();
                                                                "".length();
                                                                if ("  ".length() == 0) {
                                                                    return;
                                                                }
                                                            }
                                                            if (lIlIlIlllIlII(Game.getState(), GameState.LOGGED_IN)) {
                                                                System.out.println(llIIlIlIlI[llIIlIllIl[176]]);
                                                                "".length();
                                                                if (0 != 0) {
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            i5++;
                                                            "".length();
                                                            if (((((39 + 60) - (-12)) + 17) ^ (((125 + 48) - 123) + 83)) <= 0) {
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    if (lIlIlIllIlIll(i4)) {
                                                        System.out.println(llIIlIlIlI[llIIlIllIl[177]]);
                                                    }
                                                    System.out.println(arrayList.size());
                                                }
                                                if (lIlIlIllIlllI(nR) && lIlIlIlllIIIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[17])) {
                                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[178]];
                                                    String[] strArr74 = new String[llIIlIllIl[1]];
                                                    strArr74[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[179]];
                                                    TileObjects.getNearest(strArr74).interact(llIIlIlIlI[llIIlIllIl[180]]);
                                                    Time.sleepTicks(llIIlIllIl[11]);
                                                    "".length();
                                                }
                                            }
                                            if (lIlIlIlllIIII(lIlIlIlllIIlI(System.currentTimeMillis(), currentTimeMillis + 45000))) {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[181]];
                                                Game.logout();
                                                currentTimeMillis = System.currentTimeMillis();
                                            }
                                            "".length();
                                        } else {
                                            int[] iArr2 = new int[llIIlIllIl[1]];
                                            iArr2[llIIlIllIl[0]] = llIIlIllIl[9];
                                            if (lIlIlIllIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                                                Time.sleepTicks(C0018e.c(llIIlIllIl[10], llIIlIllIl[11]));
                                                "".length();
                                                mV = llIIlIllIl[0];
                                            }
                                        }
                                    } while ("  ".length() != "   ".length());
                                    return;
                                }
                                if (!lIlIlIllIlIll(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIllIlIll(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIlllIlll(lIlIlIlllIIll(C0018e.w(), 25.0d))) {
                                    int[] iArr3 = new int[llIIlIllIl[1]];
                                    iArr3[llIIlIllIl[0]] = llIIlIllIl[9];
                                    if (lIlIlIllIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                                        Time.sleepTicks(C0018e.c(llIIlIllIl[10], llIIlIllIl[11]));
                                        "".length();
                                        mV = llIIlIllIl[0];
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIIlIllIl[27])) {
            String[] strArr75 = new String[llIIlIllIl[1]];
            strArr75[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[62]];
            if (lIlIlIllIllll(TileObjects.getNearest(strArr75))) {
                nR = null;
                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[63]];
                TileObject nearest9 = TileObjects.getNearest(tileObject16 -> {
                    String[] strArr76 = new String[llIIlIllIl[1]];
                    strArr76[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[266]];
                    return tileObject16.hasAction(strArr76);
                });
                if (lIlIlIllIlllI(nearest9)) {
                    nearest9.interact(llIIlIlIlI[llIIlIllIl[64]]);
                    Time.sleepUntil(() -> {
                        if (lIlIlIllIlIll(LocalPlayer.get().isMoving() ? 1 : 0)) {
                            ?? r0 = llIIlIllIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIlIllIl[0];
                    }, Rand.nextInt(llIIlIllIl[65], llIIlIllIl[66]));
                    "".length();
                }
            }
        }
        strArr = new String[llIIlIllIl[1]];
        strArr[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[67]];
        if (lIlIlIllIlllI(NPCs.getNearest(strArr))) {
            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[69]];
            nearest = TileObjects.getNearest(tileObject42 -> {
                String[] strArr152 = new String[llIIlIllIl[1]];
                strArr152[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[265]];
                return tileObject42.hasAction(strArr152);
            });
            if (lIlIlIllIlllI(nearest)) {
            }
        }
        TileObjects.getNearest(tileObject52 -> {
            return tileObject52.getName().contains(llIIlIlIlI[llIIlIllIl[264]]);
        });
        strArr2 = new String[llIIlIllIl[1]];
        strArr2[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[71]];
        if (lIlIlIllIlllI(TileObjects.getNearest(strArr2))) {
        }
        strArr3 = new String[llIIlIllIl[1]];
        strArr3[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[91]];
        if (lIlIlIllIlllI(TileObjects.getNearest(strArr3))) {
        }
        strArr4 = new String[llIIlIllIl[1]];
        strArr4[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[108]];
        if (lIlIlIllIlllI(TileObjects.getNearest(strArr4))) {
        }
        strArr5 = new String[llIIlIllIl[1]];
        strArr5[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[124]];
        if (lIlIlIllIlllI(TileObjects.getNearest(strArr5))) {
        }
        strArr6 = new String[llIIlIllIl[1]];
        strArr6[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[130]];
        if (lIlIlIllIlllI(TileObjects.getNearest(strArr6))) {
        }
        strArr7 = new String[llIIlIllIl[1]];
        strArr7[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[148]];
        if (lIlIlIllIlllI(TileObjects.getNearest(strArr7))) {
        }
        if (!lIlIlIllIlIll(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
        }
    }

    private static int lIlIlIlllIIlI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lIlIlIlllIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIlIlIlIllIlI() {
        llIIlIlIlI = new String[llIIlIllIl[291]];
        llIIlIlIlI[llIIlIllIl[0]] = lIlIlIlIlIIll("NVONyMa4gzaTXVDnOyWVZw==", "NFvNF");
        llIIlIlIlI[llIIlIllIl[1]] = lIlIlIlIlIIll("SMDNd6jnpTC1kAKH62Dvva+2wf5lW3BeQU2FSoYINFC1m88tNJM36Oh5jq/dxPxN5gjcPp3/WiU=", "pXyYG");
        llIIlIlIlI[llIIlIllIl[2]] = lIlIlIlIlIIll("V9HjRPpVrok=", "BFwKC");
        llIIlIlIlI[llIIlIllIl[10]] = lIlIlIlIlIIll("UzChxXY7J64=", "EvsWr");
        llIIlIlIlI[llIIlIllIl[11]] = lIlIlIlIlIlII("2glbiiZo8PnRpeeYpaMD9VUgPHNDtl7S", "GukfC");
        llIIlIlIlI[llIIlIllIl[14]] = lIlIlIlIlIlII("0JSyfYpwGtAlH/qtyXnBPw==", "ZakGk");
        llIIlIlIlI[llIIlIllIl[15]] = lIlIlIlIlIlII("IHLFl7zW1EY=", "iWpuq");
        llIIlIlIlI[llIIlIllIl[3]] = lIlIlIlIlIIll("TO6KOC2cBlZjKoTxaa22iQ==", "JFeWM");
        llIIlIlIlI[llIIlIllIl[16]] = lIlIlIlIlIlIl("OxIbOjMLVz8mIBkN", "mwwSR");
        llIIlIlIlI[llIIlIllIl[17]] = lIlIlIlIlIlII("OdRMIfIpIqdZXhoUTj3yngwoLL6Fsh98", "rGchd");
        llIIlIlIlI[llIIlIllIl[18]] = lIlIlIlIlIlII("pkmxcd2b0nr++T4zeMXgHi4z0Fsuvsjl", "ACLrx");
        llIIlIlIlI[llIIlIllIl[20]] = lIlIlIlIlIlII("Nbx+wQhWfWs=", "dabsd");
        llIIlIlIlI[llIIlIllIl[24]] = lIlIlIlIlIIll("73f+ndPp+xQ=", "dYwli");
        llIIlIlIlI[llIIlIllIl[25]] = lIlIlIlIlIlII("TN1k5+EFH+g=", "llcxJ");
        llIIlIlIlI[llIIlIllIl[26]] = lIlIlIlIlIIll("1i/JRMwf6Gs=", "GbuzW");
        llIIlIlIlI[llIIlIllIl[28]] = lIlIlIlIlIlII("w/JZZ+pEhKg=", "tsCDa");
        llIIlIlIlI[llIIlIllIl[30]] = lIlIlIlIlIlII("NDgcN7kVn4E=", "BYUNz");
        llIIlIlIlI[llIIlIllIl[31]] = lIlIlIlIlIlIl("OgIbMz4MRxg9Jw0J", "hglRL");
        llIIlIlIlI[llIIlIllIl[32]] = lIlIlIlIlIIll("rr+2uNmK2W51mE+JY7NL+eXJJWrBlx/S", "ovIEZ");
        llIIlIlIlI[llIIlIllIl[33]] = lIlIlIlIlIIll("E5k6FRAE+n5PoloES3QyFQ==", "dSxJK");
        llIIlIlIlI[llIIlIllIl[36]] = lIlIlIlIlIlIl("KxwhOS4BHi96KxgT", "hpHZE");
        llIIlIlIlI[llIIlIllIl[38]] = lIlIlIlIlIIll("jIP89LNjniI=", "kVuJb");
        llIIlIlIlI[llIIlIllIl[39]] = lIlIlIlIlIlIl("IAY3eg==", "ycDTb");
        llIIlIlIlI[llIIlIllIl[40]] = lIlIlIlIlIlII("nx1Yi2Gb+G2sQ6WoV/O50Q==", "PCWBA");
        llIIlIlIlI[llIIlIllIl[41]] = lIlIlIlIlIlII("0pG/5ZPZjoTK0MKHpPppyA==", "UnGpX");
        llIIlIlIlI[llIIlIllIl[29]] = lIlIlIlIlIlII("YhZtywqKOGMhFBAdkgz2Uw==", "ymIxv");
        llIIlIlIlI[llIIlIllIl[42]] = lIlIlIlIlIlIl("Ex44Jyo5HDZkLyAR", "PrQDA");
        llIIlIlIlI[llIIlIllIl[44]] = lIlIlIlIlIlII("OG6ly95IuuM=", "FpMHX");
        llIIlIlIlI[llIIlIllIl[45]] = lIlIlIlIlIlIl("PTQbEw4=", "vZruk");
        llIIlIlIlI[llIIlIllIl[46]] = lIlIlIlIlIlII("xU0jqCtGUts=", "SefJW");
        llIIlIlIlI[llIIlIllIl[4]] = lIlIlIlIlIlIl("FxAwTjA2USUPKjgXLx1kOxAoBQ==", "YqFnD");
        llIIlIlIlI[llIIlIllIl[47]] = lIlIlIlIlIIll("mmUIC1ADalxREllt3Bre/8RygWnd86on", "GJaxQ");
        llIIlIlIlI[llIIlIllIl[48]] = lIlIlIlIlIlII("qwxfnHWo1xSNGwXGBBWRJQ==", "smMmW");
        llIIlIlIlI[llIIlIllIl[49]] = lIlIlIlIlIlII("PxZPBsULcsYtKpaBIE6Seg==", "PqElC");
        llIIlIlIlI[llIIlIllIl[50]] = lIlIlIlIlIlIl("CC4t", "MOYYy");
        llIIlIlIlI[llIIlIllIl[52]] = lIlIlIlIlIIll("Sa80Rb4VE4k=", "mvYBi");
        llIIlIlIlI[llIIlIllIl[53]] = lIlIlIlIlIlII("DmwKVwu1mFl2nyiXF4jPnw==", "OUdwV");
        llIIlIlIlI[llIIlIllIl[56]] = lIlIlIlIlIIll("xaz90P4OD+dkVhqvRpwKdRG4UGVo13tT", "AMsdE");
        llIIlIlIlI[llIIlIllIl[57]] = lIlIlIlIlIlII("QiLi8y+ITsdSJ2WuMFUBIQ==", "UcwYP");
        llIIlIlIlI[llIIlIllIl[58]] = lIlIlIlIlIlII("4bOR0tXaekncvyunOXaMNQ==", "HkMOT");
        llIIlIlIlI[llIIlIllIl[59]] = lIlIlIlIlIlII("U0n538eHAvvhzMow/+Mhtw==", "fBtCW");
        llIIlIlIlI[llIIlIllIl[60]] = lIlIlIlIlIlIl("ADkTFzdzPRwbLDY=", "SNrzG");
        llIIlIlIlI[llIIlIllIl[61]] = lIlIlIlIlIlIl("BwsRPUkmCgk1BiI=", "UbhQi");
        llIIlIlIlI[llIIlIllIl[62]] = lIlIlIlIlIlII("OXeiLtD+518=", "YgvkN");
        llIIlIlIlI[llIIlIllIl[63]] = lIlIlIlIlIlII("XW4meGivCpPu6R6fxRFf9x/zZndN0Onw", "XeEiq");
        llIIlIlIlI[llIIlIllIl[64]] = lIlIlIlIlIIll("p3ta4jrVgqkJ5jO4QXCa4Q==", "XAiVR");
        llIIlIlIlI[llIIlIllIl[67]] = lIlIlIlIlIlII("j8XgMW/5M0w=", "sQtFd");
        llIIlIlIlI[llIIlIllIl[69]] = lIlIlIlIlIlII("6BdhiUlxu3VWXBn5NemyN9VLt2OlTIVr", "uJgRF");
        llIIlIlIlI[llIIlIllIl[70]] = lIlIlIlIlIIll("J3fmIFxMPPHaZvZoCKRhAQ==", "kDkwR");
        llIIlIlIlI[llIIlIllIl[71]] = lIlIlIlIlIlIl("ERscHDQ9SREFODcOFg==", "SiswQ");
        llIIlIlIlI[llIIlIllIl[27]] = lIlIlIlIlIlII("jhmC6CBnNsSYETe7VjZCx5zt/WU42o6l", "ORAPD");
        llIIlIlIlI[llIIlIllIl[72]] = lIlIlIlIlIlIl("KSsRD0IZPBUO", "mNpkb");
        llIIlIlIlI[llIIlIllIl[73]] = lIlIlIlIlIlII("BR/nwAeclyg=", "giiIM");
        llIIlIlIlI[llIIlIllIl[74]] = lIlIlIlIlIIll("vWzLRRkAals=", "oaCKT");
        llIIlIlIlI[llIIlIllIl[75]] = lIlIlIlIlIIll("BrO2dlF25HdjeT9xm9jbvmxbZflJng3L", "RwGqT");
        llIIlIlIlI[llIIlIllIl[76]] = lIlIlIlIlIIll("C9GwgpmWLF8=", "rUKiB");
        llIIlIlIlI[llIIlIllIl[77]] = lIlIlIlIlIIll("vIZBRknNM4k=", "qHJyY");
        llIIlIlIlI[llIIlIllIl[78]] = lIlIlIlIlIlIl("CSgWIw==", "EGqPO");
        llIIlIlIlI[llIIlIllIl[79]] = lIlIlIlIlIlII("0d/PnS3ryU8uLc9Ygc8hYw==", "dAipR");
        llIIlIlIlI[llIIlIllIl[81]] = lIlIlIlIlIlII("rgoLoQQNQHpuZLOY2mvqcw==", "XPuEu");
        llIIlIlIlI[llIIlIllIl[68]] = lIlIlIlIlIIll("jO8OhEOf9Sb1q0wS1K5Txg==", "fgGaN");
        llIIlIlIlI[llIIlIllIl[82]] = lIlIlIlIlIlIl("NAgLPQ==", "xglNE");
        llIIlIlIlI[llIIlIllIl[83]] = lIlIlIlIlIlIl("Jy4DJx4=", "wBbIu");
        llIIlIlIlI[llIIlIllIl[84]] = lIlIlIlIlIIll("I9nBcyZg42U=", "wEqcZ");
        llIIlIlIlI[llIIlIllIl[85]] = lIlIlIlIlIlII("xcPbwGYWZls=", "qioPz");
        llIIlIlIlI[llIIlIllIl[86]] = lIlIlIlIlIlIl("BSo3KB8peDoxEyM/PQ==", "GXXCz");
        llIIlIlIlI[llIIlIllIl[87]] = lIlIlIlIlIIll("032BuFVhT+0=", "UhOML");
        llIIlIlIlI[llIIlIllIl[88]] = lIlIlIlIlIIll("X/Iu6/T53zg=", "GImRV");
        llIIlIlIlI[llIIlIllIl[89]] = lIlIlIlIlIlII("S4E35iMege8yz6RGztTW7Q==", "QboVb");
        llIIlIlIlI[llIIlIllIl[90]] = lIlIlIlIlIIll("yXd36e7Vag8=", "NTnLI");
        llIIlIlIlI[llIIlIllIl[91]] = lIlIlIlIlIlIl("GyA3EQ0qLSkcRCkzKg4BJWEnFw0vJiA=", "KAEed");
        llIIlIlIlI[llIIlIllIl[92]] = lIlIlIlIlIlIl("CBYGPCEZG1QqOhETEy1oHQERJjw=", "xwtHH");
        llIIlIlIlI[llIIlIllIl[93]] = lIlIlIlIlIlII("ZjOxevesplc=", "nfVBt");
        llIIlIlIlI[llIIlIllIl[94]] = lIlIlIlIlIIll("KSRplluILrusdEXFXM8AUQ==", "VZxMi");
        llIIlIlIlI[llIIlIllIl[95]] = lIlIlIlIlIIll("bQujJck0AItpDG8IuLB1QQ==", "nXCMr");
        llIIlIlIlI[llIIlIllIl[96]] = lIlIlIlIlIlII("n5+1C7zdXdYbpEOBVgqzjw==", "ZsVZM");
        llIIlIlIlI[llIIlIllIl[97]] = lIlIlIlIlIlII("Ei3dWSFvL7Q=", "anBIk");
        llIIlIlIlI[llIIlIllIl[98]] = lIlIlIlIlIlII("ZMJiXRX6h5c=", "aZfQo");
        llIIlIlIlI[llIIlIllIl[99]] = lIlIlIlIlIIll("MWhcQZhmJHU=", "OEiEY");
        llIIlIlIlI[llIIlIllIl[100]] = lIlIlIlIlIlIl("PyokBB0=", "oFEjv");
        llIIlIlIlI[llIIlIllIl[101]] = lIlIlIlIlIIll("BaKAPVS7IwB1Y/z5bEyrPbQn9gFUVKNW", "UQTfi");
        llIIlIlIlI[llIIlIllIl[102]] = lIlIlIlIlIlIl("DzsfGg==", "CTxiP");
        llIIlIlIlI[llIIlIllIl[103]] = lIlIlIlIlIlII("A33JHCcx5tY=", "qFgKe");
        llIIlIlIlI[llIIlIllIl[104]] = lIlIlIlIlIlII("hfrUqEew/Okji2bspWsQHpy2sWwg7qBA", "NlSij");
        llIIlIlIlI[llIIlIllIl[105]] = lIlIlIlIlIlII("15qEfxnVZ0t1yvXtwOYBCjhJ1oygM/CJ", "qXwEA");
        llIIlIlIlI[llIIlIllIl[106]] = lIlIlIlIlIIll("616I+z+ZhAc=", "hUgyf");
        llIIlIlIlI[llIIlIllIl[107]] = lIlIlIlIlIlIl("OjEYWA==", "cTkvm");
        llIIlIlIlI[llIIlIllIl[108]] = lIlIlIlIlIIll("FlnWPJCo+rp5SJPBb6xCN9oBS+4xJMby", "nZjPx");
        llIIlIlIlI[llIIlIllIl[109]] = lIlIlIlIlIlIl("EggYFj8VCAhRNRMNFRYyQQEHFDkV", "adqqW");
        llIIlIlIlI[llIIlIllIl[110]] = lIlIlIlIlIlIl("DTkKOQ==", "AVmJa");
        llIIlIlIlI[llIIlIllIl[111]] = lIlIlIlIlIlII("ZQfS97i39H+3Hy5ktbdtaA==", "rITuk");
        llIIlIlIlI[llIIlIllIl[112]] = lIlIlIlIlIlIl("AR0tHXAxCikc", "ExLyP");
        llIIlIlIlI[llIIlIllIl[113]] = lIlIlIlIlIIll("YaygG3nfoNlESNboF1VAvg==", "tUtWw");
        llIIlIlIlI[llIIlIllIl[114]] = lIlIlIlIlIIll("C3iTsCQ+QEE=", "sGeuC");
        llIIlIlIlI[llIIlIllIl[115]] = lIlIlIlIlIlII("G6ueWn13YY8=", "IQWFh");
        llIIlIlIlI[llIIlIllIl[116]] = lIlIlIlIlIIll("0xeRSeesAy4=", "bPJlf");
        llIIlIlIlI[llIIlIllIl[117]] = lIlIlIlIlIlIl("Ez4zAiE=", "CRRlJ");
        llIIlIlIlI[llIIlIllIl[118]] = lIlIlIlIlIlII("8EPVfOubh7HKQxE5KqPW6rE8xEkhXYyo", "qrnpy");
        llIIlIlIlI[llIIlIllIl[119]] = lIlIlIlIlIIll("IhayKgItZ0E=", "oDyvu");
        llIIlIlIlI[llIIlIllIl[120]] = lIlIlIlIlIIll("ZW94QPB0h4A=", "rELlf");
        llIIlIlIlI[llIIlIllIl[13]] = lIlIlIlIlIIll("KnkRm3PHPo2zsFwJMu3LpTnJ3rBZLVZm", "eHuOi");
        llIIlIlIlI[llIIlIllIl[121]] = lIlIlIlIlIIll("d5aKhutyF7ZQjqmAywtmGHWCBoUPjZ9R", "MYMfS");
        llIIlIlIlI[llIIlIllIl[122]] = lIlIlIlIlIlIl("EQYHFAQ7HA==", "Xhtda");
        llIIlIlIlI[llIIlIllIl[123]] = lIlIlIlIlIIll("whaMolglvxI=", "wgmoj");
        llIIlIlIlI[llIIlIllIl[124]] = lIlIlIlIlIlIl("AxgeBAZlExQIBiIU", "Eqfab");
        llIIlIlIlI[llIIlIllIl[125]] = lIlIlIlIlIlIl("FBQkMQ==", "DuPYf");
        llIIlIlIlI[llIIlIllIl[126]] = lIlIlIlIlIlII("3PHWQJ9jO+BfrO7m+xotBQ==", "Occvw");
        llIIlIlIlI[llIIlIllIl[127]] = lIlIlIlIlIIll("ENW0wM0JvQl3i87kPk+Qbg==", "UAuVh");
        llIIlIlIlI[llIIlIllIl[128]] = lIlIlIlIlIlIl("ISEFGCALPQ1LMRA6Dgw2", "bSjkS");
        llIIlIlIlI[llIIlIllIl[129]] = lIlIlIlIlIIll("gkm63iGVpdY=", "wMgnm");
        llIIlIlIlI[llIIlIllIl[130]] = lIlIlIlIlIIll("Z1a8VBbhJc07xg0K6FRKGA==", "wAmPs");
        llIIlIlIlI[llIIlIllIl[131]] = lIlIlIlIlIlII("KgMqf7Uh3bw=", "TGYCJ");
        llIIlIlIlI[llIIlIllIl[132]] = lIlIlIlIlIIll("uVnb5H8gITiHt67TjBaAYg==", "gGtId");
        llIIlIlIlI[llIIlIllIl[133]] = lIlIlIlIlIlIl("Ow4sCDdIECoUJg==", "hfCzC");
        llIIlIlIlI[llIIlIllIl[134]] = lIlIlIlIlIIll("1CEUHrG8ErBT4W2AFZYlFg==", "qqPxM");
        llIIlIlIlI[llIIlIllIl[135]] = lIlIlIlIlIlII("uRfFflKpvUa89nP31UqcDw==", "PqaNc");
        llIIlIlIlI[llIIlIllIl[136]] = lIlIlIlIlIlII("aN2XM0ME5WakGjK9fFqGgA==", "Knrfi");
        llIIlIlIlI[llIIlIllIl[137]] = lIlIlIlIlIIll("4x9p/2xZE6CF5ikLK7IGjQ==", "UeRHe");
        llIIlIlIlI[llIIlIllIl[138]] = lIlIlIlIlIlIl("MhEFNRVBDwMpBA==", "ayjGa");
        llIIlIlIlI[llIIlIllIl[139]] = lIlIlIlIlIlIl("BB8HJhp3AQE6Cw==", "WwhTn");
        llIIlIlIlI[llIIlIllIl[140]] = lIlIlIlIlIlII("vjdPyfxXI+tUj8NJlaDk7g==", "fVKPl");
        llIIlIlIlI[llIIlIllIl[141]] = lIlIlIlIlIlII("GP4zSenwLPu7JXXwEL/kIQ==", "rXDrN");
        llIIlIlIlI[llIIlIllIl[142]] = lIlIlIlIlIlII("CPnxJW/o6pR55m0GjDe/NA==", "XOtIx");
        llIIlIlIlI[llIIlIllIl[144]] = lIlIlIlIlIlII("GbjxaSCQZyewwVhZVIZ/+WiGB2INhfM1", "rOmVq");
        llIIlIlIlI[llIIlIllIl[145]] = lIlIlIlIlIlII("UIdcT3tUHvy0Eqv4qZANjw==", "RNFlX");
        llIIlIlIlI[llIIlIllIl[146]] = lIlIlIlIlIlIl("CjwFOjwnJgIgMmknGSs+", "ISkNU");
        llIIlIlIlI[llIIlIllIl[147]] = lIlIlIlIlIIll("l0qakDSTNLZTfVethn4/SQ==", "jMfnt");
        llIIlIlIlI[llIIlIllIl[148]] = lIlIlIlIlIIll("KgFGQx0V9b0=", "xnpQn");
        llIIlIlIlI[llIIlIllIl[149]] = lIlIlIlIlIlII("miR/Npap3pLXds8DfE4XrA==", "NTNlN");
        llIIlIlIlI[llIIlIllIl[150]] = lIlIlIlIlIlIl("IxA7FgxQCzxEGh8DehcdExAzCxY=", "pdZdx");
        llIIlIlIlI[llIIlIllIl[151]] = lIlIlIlIlIlII("0keVvuRSewI=", "VwUGs");
        llIIlIlIlI[llIIlIllIl[152]] = lIlIlIlIlIlII("VxbpO8OOOG7cJX6ZiZnx5g==", "fywPV");
        llIIlIlIlI[llIIlIllIl[153]] = lIlIlIlIlIlII("wbA1gqXx4LUWa8MR/Udplg==", "FUosd");
        llIIlIlIlI[llIIlIllIl[154]] = lIlIlIlIlIIll("U8wZwiTsKv0=", "UTyVS");
        llIIlIlIlI[llIIlIllIl[155]] = lIlIlIlIlIlII("YQXLXriOquPnYjARnOlXEg==", "ycqBf");
        llIIlIlIlI[llIIlIllIl[156]] = lIlIlIlIlIlIl("BhAVLVAwHhQrFGw=", "VqaEp");
        llIIlIlIlI[llIIlIllIl[157]] = lIlIlIlIlIlII("SBtLrfExprVAyEUwMqT6/Amd9l3XjsPl", "aZntJ");
        llIIlIlIlI[llIIlIllIl[160]] = lIlIlIlIlIlII("GM3t4DJ6U5qS2Ez9ZvY9TA==", "QDIVp");
        llIIlIlIlI[llIIlIllIl[161]] = lIlIlIlIlIIll("vprAYtHDRDc=", "bVvXa");
        llIIlIlIlI[llIIlIllIl[162]] = lIlIlIlIlIlIl("IB4wLCxeBT8=", "sjQBH");
        llIIlIlIlI[llIIlIllIl[163]] = lIlIlIlIlIIll("Ih6O69NhphHsX96j5BuXuA==", "OSWFd");
        llIIlIlIlI[llIIlIllIl[164]] = lIlIlIlIlIlII("gDFt+9kXTRJbnkXRR+fMSsd6sn1neM5F", "vuCDo");
        llIIlIlIlI[llIIlIllIl[165]] = lIlIlIlIlIlII("lrHOWuIWJQnDlw24xl3CCA==", "hiiFF");
        llIIlIlIlI[llIIlIllIl[166]] = lIlIlIlIlIIll("tnZQ4ctY7MMNnTDVSUO8Og==", "oboNf");
        llIIlIlIlI[llIIlIllIl[167]] = lIlIlIlIlIIll("z+eQoNv2lQ0=", "YpVEc");
        llIIlIlIlI[llIIlIllIl[168]] = lIlIlIlIlIlIl("ASI6FSosODFMNzAoPw==", "BMTaC");
        llIIlIlIlI[llIIlIllIl[169]] = lIlIlIlIlIIll("ALCwY5fsiEb6z0E5LXmYww==", "lUSCL");
        llIIlIlIlI[llIIlIllIl[170]] = lIlIlIlIlIlII("qvrQTePKF+phcSXgk5g5fA==", "LqdMj");
        llIIlIlIlI[llIIlIllIl[171]] = lIlIlIlIlIIll("6q17GTzSfYeUuXDKlR4kqSM3rlrkg68e", "oKFQC");
        llIIlIlIlI[llIIlIllIl[172]] = lIlIlIlIlIlIl("HjcaAAAxIgUHAHA0Aw4=", "PVlig");
        llIIlIlIlI[llIIlIllIl[173]] = lIlIlIlIlIIll("wg1y9TOkD/A=", "HIDCJ");
        llIIlIlIlI[llIIlIllIl[174]] = lIlIlIlIlIlII("UV2sd7kIXoSihOS68WrQgw==", "CDUne");
        llIIlIlIlI[llIIlIllIl[175]] = lIlIlIlIlIlIl("HjU7Bg8pNHYdECA1", "LPViy");
        llIIlIlIlI[llIIlIllIl[176]] = lIlIlIlIlIIll("zXc1RwGVhy6b7atfCebxN0pIZREFP5W3", "AbZQz");
        llIIlIlIlI[llIIlIllIl[177]] = lIlIlIlIlIlII("zX8ZTegtg3UBm1A80w4N2w==", "XmeUE");
        llIIlIlIlI[llIIlIllIl[178]] = lIlIlIlIlIlIl("Gi4aOjk3NBFuJCskHw==", "YAtNP");
        llIIlIlIlI[llIIlIllIl[179]] = lIlIlIlIlIIll("gkS1/JyTvgw=", "riFhy");
        llIIlIlIlI[llIIlIllIl[180]] = lIlIlIlIlIlII("OABndX/aDpefHrPxyr4Xkg==", "NvGQq");
        llIIlIlIlI[llIIlIllIl[181]] = lIlIlIlIlIlII("OXZHtRlNro+MV70EzBq/sBM3IVJfARsKP4BJqF6IeSk29JdzQ7/75Q==", "fQkfA");
        llIIlIlIlI[llIIlIllIl[182]] = lIlIlIlIlIlII("WCwZHoVex4JRnOuUMcHI9UlAA+3uoQKT", "fZOgs");
        llIIlIlIlI[llIIlIllIl[183]] = lIlIlIlIlIlII("QBMViJxMfuo=", "RsxiY");
        llIIlIlIlI[llIIlIllIl[184]] = lIlIlIlIlIlIl("EiILBw==", "PCelX");
        llIIlIlIlI[llIIlIllIl[186]] = lIlIlIlIlIlII("m2Vka194Gz4EKBDbljuD+umSvuN660FI", "LgVpW");
        llIIlIlIlI[llIIlIllIl[187]] = lIlIlIlIlIlII("8csjNq/3VOgJKrMFjGlh9A==", "bFlUS");
        llIIlIlIlI[llIIlIllIl[188]] = lIlIlIlIlIlII("oeFNPOoPmUQvQpNLHQp/nQ==", "MiXaK");
        llIIlIlIlI[llIIlIllIl[191]] = lIlIlIlIlIlIl("CRsEPhkuSQooBg==", "KikPc");
        llIIlIlIlI[llIIlIllIl[192]] = lIlIlIlIlIIll("wsluYrUItf4=", "qHjJQ");
        llIIlIlIlI[llIIlIllIl[193]] = lIlIlIlIlIIll("YYHTix7Fy5U=", "Hqmmh");
        llIIlIlIlI[llIIlIllIl[194]] = lIlIlIlIlIIll("+GsBqCfdzmI=", "tvGnF");
        llIIlIlIlI[llIIlIllIl[195]] = lIlIlIlIlIlIl("ACEsKS0=", "WHIEI");
        llIIlIlIlI[llIIlIllIl[196]] = lIlIlIlIlIlII("8oJPmdZRh08=", "iVqxk");
        llIIlIlIlI[llIIlIllIl[197]] = lIlIlIlIlIlIl("MxY5ExU=", "vgLze");
        llIIlIlIlI[llIIlIllIl[199]] = lIlIlIlIlIlIl("NxofKXAdFkktcCA4ST87BR8FYg==", "psiLP");
        llIIlIlIlI[llIIlIllIl[200]] = lIlIlIlIlIlII("C9CqSCnCxik=", "eLVlJ");
        llIIlIlIlI[llIIlIllIl[201]] = lIlIlIlIlIlII("iXy3xO2sKik=", "lGIEb");
        llIIlIlIlI[llIIlIllIl[202]] = lIlIlIlIlIlII("IeduoukT0Gw=", "AGQvg");
        llIIlIlIlI[llIIlIllIl[203]] = lIlIlIlIlIlII("I0HHIWw/toM=", "nsjTr");
        llIIlIlIlI[llIIlIllIl[204]] = lIlIlIlIlIlIl("KCIeOAM=", "mSkQs");
        llIIlIlIlI[llIIlIllIl[205]] = lIlIlIlIlIIll("kBIhYdrkfGE=", "UbXIY");
        llIIlIlIlI[llIIlIllIl[206]] = lIlIlIlIlIIll("ZHUjW97+VigY8qlBSEESTQ==", "QtOrA");
        llIIlIlIlI[llIIlIllIl[207]] = lIlIlIlIlIIll("ew63ck+un4OEuVgW9YxRbWF+kALvvsBe", "UkOAx");
        llIIlIlIlI[llIIlIllIl[208]] = lIlIlIlIlIIll("vWSDWAJf5IA7ufN/T6XRjw==", "FQntn");
        llIIlIlIlI[llIIlIllIl[209]] = lIlIlIlIlIlII("uHmPOMq01f8=", "cCdmO");
        llIIlIlIlI[llIIlIllIl[211]] = lIlIlIlIlIIll("6UZLyQZOvmdZaLQnSPTJU3p2ALjisbH+", "xWJQZ");
        llIIlIlIlI[llIIlIllIl[212]] = lIlIlIlIlIlII("0A1+gR9839I=", "BPTov");
        llIIlIlIlI[llIIlIllIl[213]] = lIlIlIlIlIIll("qWORv/X8WG0=", "cglpv");
        llIIlIlIlI[llIIlIllIl[214]] = lIlIlIlIlIlIl("DyI=", "mQwgW");
        llIIlIlIlI[llIIlIllIl[215]] = lIlIlIlIlIlIl("DSIeOQolNA==", "IGjXc");
        llIIlIlIlI[llIIlIllIl[216]] = lIlIlIlIlIlIl("HRkE", "xjwPY");
        llIIlIlIlI[llIIlIllIl[217]] = lIlIlIlIlIlII("Rp5GJs0pd6U=", "CHpfy");
        llIIlIlIlI[llIIlIllIl[218]] = lIlIlIlIlIlIl("LjcEMQ==", "LVvBC");
        llIIlIlIlI[llIIlIllIl[219]] = lIlIlIlIlIlII("X7zEqHTxx40=", "iPSpm");
        llIIlIlIlI[llIIlIllIl[220]] = lIlIlIlIlIlII("bcDypszkOWA=", "rbCmY");
        llIIlIlIlI[llIIlIllIl[221]] = lIlIlIlIlIIll("0YBz3xaMqmo=", "kFxpd");
        llIIlIlIlI[llIIlIllIl[222]] = lIlIlIlIlIIll("qQxeKs43VRk=", "yPmZr");
        llIIlIlIlI[llIIlIllIl[223]] = lIlIlIlIlIIll("RUynFtcuMZI=", "SGHyY");
        llIIlIlIlI[llIIlIllIl[224]] = lIlIlIlIlIIll("ojpmiNyX9SJ3bL240Mhgag==", "XNeQh");
        llIIlIlIlI[llIIlIllIl[226]] = lIlIlIlIlIIll("ZRtySuUizB8=", "Vvjjw");
        llIIlIlIlI[llIIlIllIl[227]] = lIlIlIlIlIlII("4U5ibAlA8MM=", "AcTTV");
        llIIlIlIlI[llIIlIllIl[249]] = lIlIlIlIlIlII("xOtp0u3jtbr6YGXLUHVa2w==", "IBYOs");
        llIIlIlIlI[llIIlIllIl[250]] = lIlIlIlIlIIll("feh/a7QRfjc=", "cRfQJ");
        llIIlIlIlI[llIIlIllIl[251]] = lIlIlIlIlIlII("ySd1ZRkqVbi9Iw+uP+GW/Q==", "cSsxn");
        llIIlIlIlI[llIIlIllIl[252]] = lIlIlIlIlIIll("BRt+HJelqdg=", "LaBXH");
        llIIlIlIlI[llIIlIllIl[253]] = lIlIlIlIlIIll("tEwWcqMxqiI=", "oNxYJ");
        llIIlIlIlI[llIIlIllIl[254]] = lIlIlIlIlIIll("E6pmpvSpD05geTQvfxqXRw==", "Ghwjx");
        llIIlIlIlI[llIIlIllIl[256]] = lIlIlIlIlIlIl("Fy0fOSJpPAQ4KA==", "DZvWE");
        llIIlIlIlI[llIIlIllIl[257]] = lIlIlIlIlIIll("VVMCePNJFbzCO/5hn2SEqw==", "OYxZF");
        llIIlIlIlI[llIIlIllIl[258]] = lIlIlIlIlIIll("y1dzbNFsKd2CgN6X31M1Pg==", "vxQlI");
        llIIlIlIlI[llIIlIllIl[259]] = lIlIlIlIlIlII("u1SY087wDiulAAd1zjkQ+Q==", "XETTW");
        llIIlIlIlI[llIIlIllIl[260]] = lIlIlIlIlIlII("obBNFVYKK/o=", "zEapj");
        llIIlIlIlI[llIIlIllIl[261]] = lIlIlIlIlIlII("e37tUyDh2cxvzYuPsoi35w==", "lzktD");
        llIIlIlIlI[llIIlIllIl[262]] = lIlIlIlIlIlII("CL0kmTO9p823+HIPCFrQOg==", "aNCdL");
        llIIlIlIlI[llIIlIllIl[263]] = lIlIlIlIlIlIl("GDMZCxwmLBUKEg==", "TFtiy");
        llIIlIlIlI[llIIlIllIl[264]] = lIlIlIlIlIlII("Ty9EHc5bno4=", "CBMGp");
        llIIlIlIlI[llIIlIllIl[265]] = lIlIlIlIlIlIl("EC4NHgJ4PRofCSE=", "UXlzg");
        llIIlIlIlI[llIIlIllIl[266]] = lIlIlIlIlIIll("SpmN+hVFtyLecFSZnfifpQ==", "XNGtU");
        llIIlIlIlI[llIIlIllIl[267]] = lIlIlIlIlIIll("RcI9UUS8Hi8Ng/xBorReWw==", "qkoAy");
        llIIlIlIlI[llIIlIllIl[268]] = lIlIlIlIlIlIl("KDUrNzUv", "JGBSR");
        llIIlIlIlI[llIIlIllIl[270]] = lIlIlIlIlIlII("bggG29oZktbvMJJACY3UZQ==", "pQhay");
        llIIlIlIlI[llIIlIllIl[271]] = lIlIlIlIlIlIl("EBU4CA==", "BpYlb");
        llIIlIlIlI[llIIlIllIl[272]] = lIlIlIlIlIIll("H4yLfzqQgyk=", "NQWNv");
        llIIlIlIlI[llIIlIllIl[273]] = lIlIlIlIlIlII("ybPQyVsRn+c=", "fAHSD");
        llIIlIlIlI[llIIlIllIl[274]] = lIlIlIlIlIlIl("HgY0Dg==", "jiYky");
        llIIlIlIlI[llIIlIllIl[284]] = lIlIlIlIlIIll("TqtmBf5RssM=", "ubEou");
    }

    private static boolean lIlIlIlllIIIl(int i, int i2) {
        return i >= i2;
    }

    private static int lIlIlIlllIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIlIlllIIIl(Skills.getLevel(Skill.SLAYER), llIIlIllIl[27])) {
            ?? r0 = llIIlIllIl[1];
            "".length();
            return "  ".length() < 0 ? ((114 ^ 47) ^ (75 ^ 15)) & (((176 ^ 164) ^ (24 ^ 21)) ^ (-" ".length())) : r0;
        }
        return llIIlIllIl[0];
    }

    private static boolean lIlIlIllIllII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List<as> a(as asVar, List<WorldPoint> list) {
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[llIIlIllIl[11]];
        int i = llIIlIllIl[0];
        int[] iArr2 = new int[llIIlIllIl[2]];
        iArr2[llIIlIllIl[0]] = llIIlIllIl[1];
        iArr2[llIIlIllIl[1]] = llIIlIllIl[0];
        iArr[i] = iArr2;
        int i2 = llIIlIllIl[1];
        int[] iArr3 = new int[llIIlIllIl[2]];
        iArr3[llIIlIllIl[0]] = llIIlIllIl[80];
        iArr3[llIIlIllIl[1]] = llIIlIllIl[0];
        iArr[i2] = iArr3;
        int i3 = llIIlIllIl[2];
        int[] iArr4 = new int[llIIlIllIl[2]];
        iArr4[llIIlIllIl[0]] = llIIlIllIl[0];
        iArr4[llIIlIllIl[1]] = llIIlIllIl[1];
        iArr[i3] = iArr4;
        int i4 = llIIlIllIl[10];
        int[] iArr5 = new int[llIIlIllIl[2]];
        iArr5[llIIlIllIl[0]] = llIIlIllIl[0];
        iArr5[llIIlIllIl[1]] = llIIlIllIl[80];
        iArr[i4] = iArr5;
        int length = iArr.length;
        int i5 = llIIlIllIl[0];
        while (lIlIlIllIlIlI(i5, length)) {
            Object[] objArr = iArr[i5];
            int x = asVar.nT.getX() + objArr[llIIlIllIl[0]];
            int y = asVar.nT.getY() + objArr[llIIlIllIl[1]];
            int llllllllllllllllllIlIIIllIllIlII = asVar.nT.getPlane();
            WorldPoint worldPoint = new WorldPoint(x, y, llllllllllllllllllIlIIIllIllIlII);
            if (lIlIlIllIlIIl(list.contains(worldPoint) ? 1 : 0)) {
                arrayList.add(new as(worldPoint, asVar, llIIlIllIl[0], d(y, nR.getY() + llIIlIllIl[17])));
                "".length();
            }
            i5++;
            "".length();
            if (((7 ^ 51) & ((81 ^ 101) ^ (-1))) > "  ".length()) {
                return null;
            }
        }
        return arrayList;
    }

    private static boolean lIlIlIlllIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f5, code lost:
        if (lIlIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0135, code lost:
        if (lIlIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0043, code lost:
        if (lIlIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        String[] strArr = new String[llIIlIllIl[1]];
        strArr[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[187]];
        if (lIlIlIllIlIll(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[llIIlIllIl[1]];
            strArr2[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[188]];
        }
        int[] iArr = new int[llIIlIllIl[1]];
        iArr[llIIlIllIl[0]] = llIIlIllIl[8];
        if (lIlIlIllIlIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIIlIllIl[1]];
            iArr2[llIIlIllIl[0]] = llIIlIllIl[8];
            if (lIlIlIllIlIll(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIIlIllIl[1]];
                iArr3[llIIlIllIl[0]] = llIIlIllIl[189];
                if (lIlIlIllIlIll(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llIIlIllIl[1]];
                    iArr4[llIIlIllIl[0]] = llIIlIllIl[189];
                    if (lIlIlIllIlIll(Equipment.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIIlIllIl[1]];
                        iArr5[llIIlIllIl[0]] = llIIlIllIl[190];
                        if (lIlIlIllIlIll(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIlIllIl[1]];
                            iArr6[llIIlIllIl[0]] = llIIlIllIl[190];
                        }
                    }
                }
            }
        }
        int[] iArr7 = new int[llIIlIllIl[1]];
        iArr7[llIIlIllIl[0]] = llIIlIllIl[22];
        if (lIlIlIllIlIll(Inventory.contains(iArr7) ? 1 : 0)) {
            String[] strArr3 = new String[llIIlIllIl[1]];
            strArr3[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[191]];
        }
        int[] iArr8 = new int[llIIlIllIl[1]];
        iArr8[llIIlIllIl[0]] = llIIlIllIl[23];
        if (lIlIlIllIlIIl(Inventory.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llIIlIllIl[1]];
            iArr9[llIIlIllIl[0]] = llIIlIllIl[9];
            if (lIlIlIllIlIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                ?? r0 = llIIlIllIl[1];
                "".length();
                return (-" ".length()) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
            }
        }
        return llIIlIllIl[0];
    }

    private static String lIlIlIlIlIIll(String llllllllllllllllllIlIIIlIllIllII, String llllllllllllllllllIlIIIlIllIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIIlIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIIIlIllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIIIlIllIlllI.init(llIIlIllIl[2], secretKeySpec);
            return new String(llllllllllllllllllIlIIIlIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIIlIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIIlIllIllIl) {
            llllllllllllllllllIlIIIlIllIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIlllI(Object obj) {
        return obj != null;
    }

    private static void lIlIlIllIlIII() {
        llIIlIllIl = new int[292];
        llIIlIllIl[0] = (6 ^ 62) & ((124 ^ 68) ^ (-1));
        llIIlIllIl[1] = " ".length();
        llIIlIllIl[2] = "  ".length();
        llIIlIllIl[3] = (((11 + 60) - 32) + 109) ^ (((52 + 27) - (-21)) + 47);
        llIIlIllIl[4] = 166 ^ 184;
        llIIlIllIl[5] = (-((-1033) & 31867)) & (-773) & 32767;
        llIIlIllIl[6] = (-1034) & 11597;
        llIIlIllIl[7] = (-((-16899) & 25551)) & (-2083) & 31743;
        llIIlIllIl[8] = (-22785) & 23863;
        llIIlIllIl[9] = (-((-8431) & 12799)) & (-8197) & 32183;
        llIIlIllIl[10] = "   ".length();
        llIIlIllIl[11] = (((122 + 9) - 89) + 142) ^ (((52 + 78) - (-57)) + 1);
        llIIlIllIl[12] = (-4617) & 13116;
        llIIlIllIl[13] = 103 ^ 3;
        llIIlIllIl[14] = "   ".length() ^ (157 ^ 155);
        llIIlIllIl[15] = ((143 ^ 151) & ((223 ^ 199) ^ (-1))) ^ (153 ^ 159);
        llIIlIllIl[16] = (129 ^ 187) ^ (110 ^ 92);
        llIIlIllIl[17] = 34 ^ 43;
        llIIlIllIl[18] = (((123 + 47) - 118) + 127) ^ (((97 + 115) - 44) + 17);
        llIIlIllIl[19] = (-545) & 13303;
        llIIlIllIl[20] = 161 ^ 170;
        llIIlIllIl[21] = (-25669) & 26614;
        llIIlIllIl[22] = (-12329) & 13679;
        llIIlIllIl[23] = (-8385) & 10731;
        llIIlIllIl[24] = 110 ^ 98;
        llIIlIllIl[25] = (128 ^ 164) ^ (239 ^ 198);
        llIIlIllIl[26] = 127 ^ 113;
        llIIlIllIl[27] = 35 ^ 17;
        llIIlIllIl[28] = (((98 + 19) - (-11)) + 5) ^ (((78 + 27) - (-28)) + 5);
        llIIlIllIl[29] = 114 ^ 107;
        llIIlIllIl[30] = (((81 + 89) - 96) + 139) ^ (((85 + 167) - 188) + 133);
        llIIlIllIl[31] = (234 ^ 142) ^ (205 ^ 184);
        llIIlIllIl[32] = 54 ^ 36;
        llIIlIllIl[33] = 145 ^ 130;
        llIIlIllIl[34] = (-((-3601) & 28339)) & (-3605) & 28671;
        llIIlIllIl[35] = (-24833) & 31551;
        llIIlIllIl[36] = 16 ^ 4;
        llIIlIllIl[37] = (-((-12582) & 31143)) & (-4097) & 24223;
        llIIlIllIl[38] = (51 ^ 78) ^ (46 ^ 70);
        llIIlIllIl[39] = 212 ^ 194;
        llIIlIllIl[40] = (26 ^ 17) ^ (39 ^ 59);
        llIIlIllIl[41] = 65 ^ 89;
        llIIlIllIl[42] = (((132 + 75) - 29) + 4) ^ (((83 + 83) - 46) + 52);
        llIIlIllIl[43] = (-29139) & 30715;
        llIIlIllIl[44] = (((100 + 70) - 1) + 4) ^ (((54 + 45) - 21) + 104);
        llIIlIllIl[45] = (((29 + 13) - (-107)) + 0) ^ (((9 + 75) - 56) + 109);
        llIIlIllIl[46] = 127 ^ 98;
        llIIlIllIl[47] = 139 ^ 148;
        llIIlIllIl[48] = 128 ^ 160;
        llIIlIllIl[49] = 32 ^ 1;
        llIIlIllIl[50] = 12 ^ 46;
        llIIlIllIl[51] = (-17505) & 20463;
        llIIlIllIl[52] = (((77 + 49) - (-4)) + 44) ^ (((103 + 31) - 23) + 30);
        llIIlIllIl[53] = (56 ^ 52) ^ (183 ^ 159);
        llIIlIllIl[54] = (-((-16473) & 29178)) & (-17411) & 30715;
        llIIlIllIl[55] = (-67) & 3566;
        llIIlIllIl[56] = (((21 + 10) - (-84)) + 48) ^ (((56 + 33) - 6) + 51);
        llIIlIllIl[57] = 172 ^ 138;
        llIIlIllIl[58] = ((156 ^ 170) & ((50 ^ 4) ^ (-1))) ^ (87 ^ 112);
        llIIlIllIl[59] = (48 ^ 20) ^ (178 ^ 190);
        llIIlIllIl[60] = 120 ^ 81;
        llIIlIllIl[61] = 176 ^ 154;
        llIIlIllIl[62] = 66 ^ 105;
        llIIlIllIl[63] = (105 ^ 55) ^ (25 ^ 107);
        llIIlIllIl[64] = 149 ^ 184;
        llIIlIllIl[65] = (-28899) & 32498;
        llIIlIllIl[66] = (-17292) & 22491;
        llIIlIllIl[67] = (49 ^ 26) ^ (119 ^ 114);
        llIIlIllIl[68] = 118 ^ 74;
        llIIlIllIl[69] = (((171 + 40) - 81) + 60) ^ (((7 + 27) - (-58)) + 53);
        llIIlIllIl[70] = 166 ^ 150;
        llIIlIllIl[71] = (110 ^ 46) ^ (102 ^ 23);
        llIIlIllIl[72] = 159 ^ 172;
        llIIlIllIl[73] = (92 ^ 46) ^ (226 ^ 164);
        llIIlIllIl[74] = 102 ^ 83;
        llIIlIllIl[75] = 117 ^ 67;
        llIIlIllIl[76] = (32 ^ 122) ^ (33 ^ 76);
        llIIlIllIl[77] = (6 ^ 82) ^ (193 ^ 173);
        llIIlIllIl[78] = (92 ^ 112) ^ (173 ^ 184);
        llIIlIllIl[79] = (((107 + 52) - (-40)) + 50) ^ (((49 + 181) - 143) + 108);
        llIIlIllIl[80] = -" ".length();
        llIIlIllIl[81] = (213 ^ 196) ^ (90 ^ 112);
        llIIlIllIl[82] = 255 ^ 194;
        llIIlIllIl[83] = (((94 + 63) - 31) + 13) ^ (((8 + 34) - (-8)) + 131);
        llIIlIllIl[84] = (138 ^ 159) ^ (59 ^ 17);
        llIIlIllIl[85] = (35 ^ 57) ^ (54 ^ 108);
        llIIlIllIl[86] = 245 ^ 180;
        llIIlIllIl[87] = (237 ^ 165) ^ (5 ^ 15);
        llIIlIllIl[88] = (((55 + 213) - 237) + 186) ^ (((100 + 84) - 152) + 122);
        llIIlIllIl[89] = (52 ^ 112) ^ ((183 ^ 137) & ((163 ^ 157) ^ (-1)));
        llIIlIllIl[90] = (((215 + 13) - 177) + 176) ^ (((96 + 107) - 44) + 7);
        llIIlIllIl[91] = (((209 + 92) - 81) + 12) ^ (((93 + 59) - 44) + 66);
        llIIlIllIl[92] = 219 ^ 156;
        llIIlIllIl[93] = (((111 + 168) - 57) + 3) ^ (((12 + 144) - 1) + 14);
        llIIlIllIl[94] = (((221 + 152) - 192) + 46) ^ (((152 + 98) - 102) + 22);
        llIIlIllIl[95] = 230 ^ 172;
        llIIlIllIl[96] = 50 ^ 121;
        llIIlIllIl[97] = 99 ^ 47;
        llIIlIllIl[98] = 243 ^ 190;
        llIIlIllIl[99] = (158 ^ 187) ^ (248 ^ 147);
        llIIlIllIl[100] = (172 ^ 177) ^ (69 ^ 23);
        llIIlIllIl[101] = (((126 + 134) - 245) + 185) ^ (((74 + 116) - 79) + 41);
        llIIlIllIl[102] = 223 ^ 142;
        llIIlIllIl[103] = (46 ^ 86) ^ (168 ^ 130);
        llIIlIllIl[104] = (((72 + 198) - 209) + 177) ^ (((43 + 156) - 19) + 9);
        llIIlIllIl[105] = (144 ^ 186) ^ (43 ^ 85);
        llIIlIllIl[106] = (((128 + 84) - 126) + 118) ^ (((151 + 77) - 218) + 143);
        llIIlIllIl[107] = (((18 + 158) - 111) + 149) ^ (((108 + 4) - 96) + 112);
        llIIlIllIl[108] = (124 ^ 61) ^ (51 ^ 37);
        llIIlIllIl[109] = (((112 + 4) - 43) + 125) ^ (((68 + 0) - 25) + 115);
        llIIlIllIl[110] = 107 ^ 50;
        llIIlIllIl[111] = 204 ^ 150;
        llIIlIllIl[112] = (((62 + 89) - 141) + 245) ^ (((24 + 159) - 23) + 4);
        llIIlIllIl[113] = 35 ^ 127;
        llIIlIllIl[114] = 85 ^ 8;
        llIIlIllIl[115] = 108 ^ 50;
        llIIlIllIl[116] = (118 ^ 83) ^ (98 ^ 24);
        llIIlIllIl[117] = 78 ^ 46;
        llIIlIllIl[118] = (113 ^ 127) ^ (198 ^ 169);
        llIIlIllIl[119] = 203 ^ 169;
        llIIlIllIl[120] = 1 ^ 98;
        llIIlIllIl[121] = (226 ^ 161) ^ (53 ^ 19);
        llIIlIllIl[122] = (99 ^ 18) ^ (140 ^ 155);
        llIIlIllIl[123] = (225 ^ 163) ^ (29 ^ 56);
        llIIlIllIl[124] = (((45 + 49) - (-32)) + 90) ^ (((76 + 53) - (-13)) + 34);
        llIIlIllIl[125] = 244 ^ 157;
        llIIlIllIl[126] = "   ".length() ^ (231 ^ 142);
        llIIlIllIl[127] = 74 ^ 33;
        llIIlIllIl[128] = 15 ^ 99;
        llIIlIllIl[129] = (((198 + 34) - 64) + 33) ^ (((21 + 87) - 50) + 106);
        llIIlIllIl[130] = 215 ^ 185;
        llIIlIllIl[131] = (((138 + 14) - (-26)) + 48) ^ (((9 + 62) - 60) + 130);
        llIIlIllIl[132] = (141 ^ 131) ^ (50 ^ 76);
        llIIlIllIl[133] = 243 ^ 130;
        llIIlIllIl[134] = (51 ^ 65) ^ ((191 ^ 182) & ((106 ^ 99) ^ (-1)));
        llIIlIllIl[135] = (107 ^ 23) ^ (178 ^ 189);
        llIIlIllIl[136] = (((63 + 105) - 122) + 150) ^ (((57 + 159) - 171) + 131);
        llIIlIllIl[137] = 127 ^ 10;
        llIIlIllIl[138] = (161 ^ 141) ^ (196 ^ 158);
        llIIlIllIl[139] = (171 ^ 176) ^ (204 ^ 160);
        llIIlIllIl[140] = (((123 + 160) - 229) + 187) ^ (((6 + 17) - (-65)) + 49);
        llIIlIllIl[141] = 47 ^ 86;
        llIIlIllIl[142] = 219 ^ 161;
        llIIlIllIl[143] = (-105) & 13949;
        llIIlIllIl[144] = 239 ^ 148;
        llIIlIllIl[145] = (((21 + 213) - 126) + 108) ^ (((51 + 74) - 65) + 104);
        llIIlIllIl[146] = (((175 + 97) - 101) + 44) ^ (((130 + 150) - 186) + 76);
        llIIlIllIl[147] = 198 ^ 184;
        llIIlIllIl[148] = ((61 + 10) - (-47)) + 9;
        llIIlIllIl[149] = ((85 + 27) - 60) + 76;
        llIIlIllIl[150] = ((122 + 120) - 232) + 119;
        llIIlIllIl[151] = ((88 + 91) - 108) + 59;
        llIIlIllIl[152] = (("  ".length() + (128 ^ 142)) - (-"   ".length())) + (30 ^ 110);
        llIIlIllIl[153] = (((240 ^ 155) + (15 ^ 104)) - (((154 + 189) - 159) + 21)) + ((102 + 86) - 178) + 117;
        llIIlIllIl[154] = (((92 ^ 73) + (15 ^ 117)) - (79 ^ 3)) + (51 ^ 113);
        llIIlIllIl[155] = (((201 ^ 192) + (122 ^ 41)) - (-(166 ^ 184))) + (24 ^ 20);
        llIIlIllIl[156] = ((73 + 120) - 166) + 108;
        llIIlIllIl[157] = ((40 + 125) - 44) + 15;
        llIIlIllIl[158] = (-((-693) & 27383)) & (-1577) & 32766;
        llIIlIllIl[159] = (-16513) & 22012;
        llIIlIllIl[160] = (((149 ^ 181) + (47 ^ 101)) - (18 ^ 87)) + (51 ^ 87);
        llIIlIllIl[161] = ((134 + 75) - 147) + 76;
        llIIlIllIl[162] = ((0 + 94) - (-26)) + 19;
        llIIlIllIl[163] = (((6 ^ 55) + (236 ^ 185)) - (49 ^ 126)) + (8 ^ 93);
        llIIlIllIl[164] = ((90 + 72) - 89) + 68;
        llIIlIllIl[165] = (((((126 + 29) - 16) + 2) + (((80 + 5) - 18) + 63)) - (((84 + 176) - 165) + 90)) + (52 ^ 12);
        llIIlIllIl[166] = ((102 + 24) - 87) + 104;
        llIIlIllIl[167] = ((3 + 72) - (-53)) + 16;
        llIIlIllIl[168] = ((58 + 30) - (-28)) + 29;
        llIIlIllIl[169] = ((69 + 109) - 72) + 40;
        llIIlIllIl[170] = ((128 + 137) - 191) + 73;
        llIIlIllIl[171] = (((163 ^ 183) + (31 ^ 27)) - (-(125 ^ 14))) + (63 ^ 54);
        llIIlIllIl[172] = ((128 + 3) - 84) + 102;
        llIIlIllIl[173] = ((41 + 145) - 143) + 107;
        llIIlIllIl[174] = ((70 + 61) - (-7)) + 13;
        llIIlIllIl[175] = (((((113 + 20) - 4) + 13) + (47 ^ 105)) - (229 ^ 191)) + (87 ^ 73);
        llIIlIllIl[176] = ((75 + 91) - 154) + 141;
        llIIlIllIl[177] = (((9 ^ 79) + (90 ^ 0)) - (14 ^ 119)) + (77 ^ 62);
        llIIlIllIl[178] = (((101 ^ 9) + (4 ^ 23)) - (113 ^ 25)) + ((108 + 5) - 61) + 80;
        llIIlIllIl[179] = (((((111 + 94) - 162) + 90) + (37 ^ 76)) - (((100 + 31) - 47) + 46)) + (146 ^ 162);
        llIIlIllIl[180] = ((124 + 13) - 122) + 142;
        llIIlIllIl[181] = (((143 ^ 146) + (210 ^ 162)) - (112 ^ 45)) + (98 ^ 12);
        llIIlIllIl[182] = (((((106 + 99) - 163) + 114) + (24 ^ 100)) - (((70 + 107) - 129) + 159)) + (125 ^ 43);
        llIIlIllIl[183] = (((249 ^ 150) + (2 ^ 79)) - (((4 + 43) - (-59)) + 28)) + (119 ^ 29);
        llIIlIllIl[184] = (((77 ^ 62) + (86 ^ 98)) - (174 ^ 128)) + (105 ^ 65);
        llIIlIllIl[185] = (-((-19486) & 32159)) & (-16919) & 32735;
        llIIlIllIl[186] = (((217 ^ 191) + (224 ^ 166)) - (14 ^ 117)) + (85 ^ 36);
        llIIlIllIl[187] = (((69 ^ 124) + "  ".length()) - (-(106 ^ 102))) + (20 ^ 72);
        llIIlIllIl[188] = ((94 + 73) - 107) + 104;
        llIIlIllIl[189] = (-9) & 4095;
        llIIlIllIl[190] = (-((-385) & 20373)) & (-1) & 24573;
        llIIlIllIl[191] = (((31 ^ 114) + (205 ^ 161)) - (((107 + 152) - 103) + 37)) + ((0 + 27) - (-25)) + 89;
        llIIlIllIl[192] = (((29 ^ 120) + (60 ^ 99)) - (79 ^ 39)) + (221 ^ 151);
        llIIlIllIl[193] = (((239 ^ 130) + (229 ^ 198)) - (48 ^ 46)) + (97 ^ 84);
        llIIlIllIl[194] = ((94 + 91) - 70) + 53;
        llIIlIllIl[195] = (((169 ^ 166) + (54 ^ 19)) - (-(83 ^ 96))) + (247 ^ 181);
        llIIlIllIl[196] = (((((34 + 69) - 92) + 148) + (((118 + 18) - 84) + 87)) - (((51 + 63) - (-3)) + 79)) + (248 ^ 188);
        llIIlIllIl[197] = (((((64 + 62) - (-1)) + 3) + (189 ^ 168)) - (122 ^ 52)) + (217 ^ 187);
        llIIlIllIl[198] = (-((-22681) & 24507)) & (-8385) & 32767;
        llIIlIllIl[199] = ((44 + 53) - (-34)) + 41;
        llIIlIllIl[200] = ((49 + 166) - 148) + 106;
        llIIlIllIl[201] = (((((72 + 11) - 13) + 72) + (125 ^ 91)) - (174 ^ 187)) + (137 ^ 134);
        llIIlIllIl[202] = (((38 ^ 108) + (25 ^ 90)) - (8 ^ 28)) + (26 ^ 44);
        llIIlIllIl[203] = ((58 + 0) - (-7)) + 111;
        llIIlIllIl[204] = ((59 + 159) - 70) + 29;
        llIIlIllIl[205] = ((58 + 104) - 99) + 115;
        llIIlIllIl[206] = ((6 + 137) - (-17)) + 19;
        llIIlIllIl[207] = ((21 + 118) - (-21)) + 20;
        llIIlIllIl[208] = (((58 ^ 88) + (((15 + 92) - (-2)) + 38)) - (((29 + 174) - 132) + 112)) + (224 ^ 151);
        llIIlIllIl[209] = (((77 ^ 99) + (2 ^ 111)) - (38 ^ 109)) + (34 ^ 68);
        llIIlIllIl[210] = (-((-19211) & 24495)) & (-18506) & 24063;
        llIIlIllIl[211] = (((122 ^ 43) + (((59 + 103) - 102) + 82)) - (223 ^ 187)) + (156 ^ 160);
        llIIlIllIl[212] = (((2 ^ 18) + (83 ^ 115)) - (83 ^ 64)) + ((75 + 134) - 64) + 10;
        llIIlIllIl[213] = ((125 + 104) - 170) + 126;
        llIIlIllIl[214] = ((59 + 170) - 45) + 2;
        llIIlIllIl[215] = ((46 + 8) - 35) + 168;
        llIIlIllIl[216] = (((((27 + 82) - 60) + 104) + (230 ^ 174)) - (((4 + 21) - (-27)) + 132)) + ((29 + 69) - 96) + 145;
        llIIlIllIl[217] = (((((25 + 3) - (-29)) + 96) + (((15 + 167) - 126) + 113)) - (((16 + 110) - 97) + 127)) + (68 ^ 83);
        llIIlIllIl[218] = ((1 + 2) - (-144)) + 43;
        llIIlIllIl[219] = (((216 ^ 186) + (((102 + 25) - 85) + 146)) - (114 ^ 15)) + (16 ^ 14);
        llIIlIllIl[220] = (((59 ^ 20) + (8 ^ 77)) - (4 ^ 82)) + ((38 + 89) - 44) + 79;
        llIIlIllIl[221] = (((((101 + 21) - (-40)) + 29) + (((47 + 67) - (-5)) + 70)) - (((154 + 219) - 213) + 64)) + (46 ^ 11);
        llIIlIllIl[222] = ((145 + 72) - 124) + 101;
        llIIlIllIl[223] = (((200 ^ 185) + (83 ^ 37)) - (((115 + 79) - 92) + 99)) + ((58 + 120) - 145) + 132;
        llIIlIllIl[224] = (((((114 + 83) - 184) + 135) + (((57 + 13) - 43) + 138)) - (((137 + 159) - 209) + 94)) + (64 ^ 0);
        llIIlIllIl[225] = (-31041) & 17987915;
        llIIlIllIl[226] = (((37 ^ 125) + (84 ^ 106)) - (205 ^ 173)) + ((29 + 73) - 23) + 64;
        llIIlIllIl[227] = (((((3 + 23) - (-10)) + 98) + (112 ^ 44)) - (((71 + 56) - 31) + 46)) + (6 ^ 116);
        llIIlIllIl[228] = (-((-13329) & 31766)) & (-257) & 93693;
        llIIlIllIl[229] = (-117) & 85116;
        llIIlIllIl[230] = (-16385) & 28364;
        llIIlIllIl[231] = (-7768) & 32767;
        llIIlIllIl[232] = (-((-4933) & 13261)) & (-16417) & 32751;
        llIIlIllIl[233] = (-12337) & 13236;
        llIIlIllIl[234] = (-3873) & 16372;
        llIIlIllIl[235] = (-17217) & 32716;
        llIIlIllIl[236] = (-31763) & 32062;
        llIIlIllIl[237] = (-((-323) & 31063)) & (-1025) & 32764;
        llIIlIllIl[238] = (-((-15399) & 32559)) & (-7) & 18366;
        llIIlIllIl[239] = (-((-23563) & 32462)) & (-1281) & 16379;
        llIIlIllIl[240] = (-24744) & 32751;
        llIIlIllIl[241] = (-25674) & 26623;
        llIIlIllIl[242] = (-((-10561) & 28507)) & (-6177) & 24507;
        llIIlIllIl[243] = (-26689) & 28638;
        llIIlIllIl[244] = (-16689) & 28666;
        llIIlIllIl[245] = (-((-10469) & 15077)) & (-130) & 30687;
        llIIlIllIl[246] = (-2439) & 147438;
        llIIlIllIl[247] = (-4438) & 169437;
        llIIlIllIl[248] = (-((-10321) & 26871)) & (-2057) & 31231;
        llIIlIllIl[249] = (((58 ^ 52) + (142 ^ 174)) - " ".length()) + ((149 + 73) - 185) + 117;
        llIIlIllIl[250] = ((27 + 82) - 86) + 177;
        llIIlIllIl[251] = (((18 ^ 123) + (127 ^ 12)) - (195 ^ 142)) + (80 ^ 106);
        llIIlIllIl[252] = (((((12 + 145) - (-2)) + 40) + (132 ^ 178)) - (((74 + 164) - 40) + 3)) + ((33 + 126) - 103) + 94;
        llIIlIllIl[253] = (((112 ^ 25) + (181 ^ 188)) - (53 ^ 37)) + (60 ^ 85);
        llIIlIllIl[254] = (((15 ^ 116) + (((57 + 139) - 103) + 99)) - (((153 + 19) - 116) + 147)) + (114 ^ 46);
        llIIlIllIl[255] = (-((-13833) & 30698)) & (-2065) & 32767;
        llIIlIllIl[256] = ((6 + 45) - (-80)) + 74;
        llIIlIllIl[257] = ((121 + 142) - 123) + 66;
        llIIlIllIl[258] = (((181 ^ 163) + (233 ^ 144)) - (155 ^ 169)) + (253 ^ 143);
        llIIlIllIl[259] = (((((18 + 10) - (-64)) + 40) + (108 ^ 9)) - (85 ^ 58)) + (118 ^ 32);
        llIIlIllIl[260] = ((168 + 135) - 217) + 123;
        llIIlIllIl[261] = (((93 ^ 30) + (((55 + 166) - 141) + 126)) - (((20 + 178) - 27) + 21)) + ((86 + 80) - 146) + 109;
        llIIlIllIl[262] = (((73 ^ 57) + (((192 + 157) - 212) + 70)) - (((148 + 33) - 154) + 130)) + (1 ^ 48);
        llIIlIllIl[263] = ((189 + 98) - 159) + 84;
        llIIlIllIl[264] = ((171 + 179) - 246) + 109;
        llIIlIllIl[265] = ((94 + 18) - (-101)) + 1;
        llIIlIllIl[266] = (((((146 + 90) - 146) + 86) + (194 ^ 190)) - (((74 + 34) - 53) + 84)) + (96 ^ 86);
        llIIlIllIl[267] = ((180 + 147) - 216) + 105;
        llIIlIllIl[268] = ((18 + 196) - 8) + 11;
        llIIlIllIl[269] = (-((-67) & 28634)) & (-33) & 21589943;
        llIIlIllIl[270] = ((206 + 79) - 111) + 44;
        llIIlIllIl[271] = ((50 + 56) - 9) + 122;
        llIIlIllIl[272] = ((144 + 168) - 158) + 66;
        llIIlIllIl[273] = (((((161 + 85) - 204) + 148) + (238 ^ 171)) - (250 ^ 169)) + (123 ^ 86);
        llIIlIllIl[274] = ((158 + 2) - (-51)) + 11;
        llIIlIllIl[275] = (-28806) & 32229;
        llIIlIllIl[276] = (-28679) & 32135;
        llIIlIllIl[277] = (-29318) & 32751;
        llIIlIllIl[278] = (-21026) & 24511;
        llIIlIllIl[279] = (-10241) & 31386;
        llIIlIllIl[280] = (-((-2325) & 31637)) & (-13) & 32732;
        llIIlIllIl[281] = (-12860) & 16315;
        llIIlIllIl[282] = (-((-1421) & 26621)) & (-4098) & 32767;
        llIIlIllIl[283] = (-((-211) & 979)) & (-28673) & 32635;
        llIIlIllIl[284] = ((146 + 21) - 144) + 200;
        llIIlIllIl[285] = (-29220) & 32691;
        llIIlIllIl[286] = (-((-10269) & 27167)) & (-4353) & 24447;
        llIIlIllIl[287] = (-12357) & 15837;
        llIIlIllIl[288] = (-((-13318) & 29775)) & (-529) & 20223;
        llIIlIllIl[289] = (-29249) & 32759;
        llIIlIllIl[290] = (-((-435) & 25531)) & (-33) & 28607;
        llIIlIllIl[291] = ((68 + 54) - (-69)) + 33;
    }

    private static String lIlIlIlIlIlIl(String llllllllllllllllllIlIIIllIIIlllI, String llllllllllllllllllIlIIIllIIIllIl) {
        String llllllllllllllllllIlIIIllIIIlllI2 = new String(Base64.getDecoder().decode(llllllllllllllllllIlIIIllIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIIIllIIIllII = new StringBuilder();
        char[] llllllllllllllllllIlIIIllIIIlIll = llllllllllllllllllIlIIIllIIIllIl.toCharArray();
        int llllllllllllllllllIlIIIllIIIlIlI = llIIlIllIl[0];
        char[] charArray = llllllllllllllllllIlIIIllIIIlllI2.toCharArray();
        int length = charArray.length;
        int i = llIIlIllIl[0];
        while (lIlIlIllIlIlI(i, length)) {
            char llllllllllllllllllIlIIIllIIIllll = charArray[i];
            llllllllllllllllllIlIIIllIIIllII.append((char) (llllllllllllllllllIlIIIllIIIllll ^ llllllllllllllllllIlIIIllIIIlIll[llllllllllllllllllIlIIIllIIIlIlI % llllllllllllllllllIlIIIllIIIlIll.length]));
            "".length();
            llllllllllllllllllIlIIIllIIIlIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIlIIIllIIIllII);
    }

    private static String lIlIlIlIlIlII(String llllllllllllllllllIlIIIlIllllIIl, String llllllllllllllllllIlIIIlIllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIIlIllllIII.getBytes(StandardCharsets.UTF_8)), llIIlIllIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIllIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIIlIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIIlIllllIlI) {
            llllllllllllllllllIlIIIlIllllIlI.printStackTrace();
            return null;
        }
    }

    public static List<WorldPoint> a(WorldPoint worldPoint, int i, List<WorldPoint> list) {
        PriorityQueue priorityQueue = new PriorityQueue();
        ArrayList arrayList = new ArrayList();
        priorityQueue.add(new as(worldPoint, null, llIIlIllIl[0], d(worldPoint.getY(), i)));
        "".length();
        while (lIlIlIllIlIll(priorityQueue.isEmpty() ? 1 : 0)) {
            as asVar = (as) priorityQueue.poll();
            if (lIlIlIlllIlIl(asVar.nT.getY(), i)) {
                return a(asVar);
            }
            arrayList.add(asVar);
            "".length();
            for (as asVar2 : a(asVar, list)) {
                int i2 = asVar.nV + llIIlIllIl[1];
                if (lIlIlIllIlIIl(b(asVar2, arrayList) ? 1 : 0)) {
                    "".length();
                    if ("  ".length() < " ".length()) {
                        return null;
                    }
                } else {
                    if (!lIlIlIllIlIIl(a(asVar2, priorityQueue) ? 1 : 0) || lIlIlIllIlIlI(i2, asVar2.nV)) {
                        priorityQueue.add(asVar2);
                        "".length();
                    }
                    "".length();
                    if ((((8 ^ 53) ^ "  ".length()) & (((((16 + 138) - 25) + 12) ^ (((131 + 69) - 134) + 112)) ^ (-" ".length()))) != 0) {
                        return null;
                    }
                }
            }
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return Collections.emptyList();
    }

    public static void t(String str) {
        String[] strArr = new String[llIIlIllIl[1]];
        strArr[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[206]];
        if (lIlIlIllIlIIl(Inventory.contains(strArr) ? 1 : 0)) {
            mV = llIIlIllIl[0];
            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[207]];
            String[] strArr2 = new String[llIIlIllIl[1]];
            strArr2[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[208]];
            Inventory.getFirst(strArr2).interact(llIIlIlIlI[llIIlIllIl[209]]);
            Time.sleepTicks(llIIlIllIl[10]);
            "".length();
            if (!lIlIlIllIllll(Widgets.get(llIIlIllIl[210], llIIlIllIl[15])) || lIlIlIllIlIll(Widgets.get(llIIlIllIl[210]).isEmpty() ? 1 : 0)) {
                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[211]];
                if (lIlIlIllIlIIl(str.contains(llIIlIlIlI[llIIlIllIl[212]]) ? 1 : 0)) {
                    Widget widget = Widgets.get(llIIlIllIl[210], llIIlIllIl[15]);
                    if (lIlIlIllIlllI(widget)) {
                        Time.sleepTicks(llIIlIllIl[2]);
                        "".length();
                        widget.getChild(llIIlIllIl[3]).interact(llIIlIlIlI[llIIlIllIl[213]]);
                        Time.sleepTicks(llIIlIllIl[1]);
                        "".length();
                    }
                }
                if (lIlIlIllIlIIl(str.contains(llIIlIlIlI[llIIlIllIl[214]]) ? 1 : 0)) {
                    Widget widget2 = Widgets.get(llIIlIllIl[210], llIIlIllIl[15]);
                    if (lIlIlIllIlllI(widget2)) {
                        Time.sleepTicks(llIIlIllIl[2]);
                        "".length();
                        widget2.getChild(llIIlIllIl[1]).interact(llIIlIlIlI[llIIlIllIl[215]]);
                        Time.sleepTicks(C0018e.c(llIIlIllIl[10], llIIlIllIl[11]));
                        "".length();
                    }
                }
                if (lIlIlIllIlIIl(str.contains(llIIlIlIlI[llIIlIllIl[216]]) ? 1 : 0)) {
                    Widget widget3 = Widgets.get(llIIlIllIl[210], llIIlIllIl[15]);
                    if (lIlIlIllIlllI(widget3)) {
                        Time.sleepTicks(llIIlIllIl[2]);
                        "".length();
                        widget3.getChild(llIIlIllIl[0]).interact(llIIlIlIlI[llIIlIllIl[217]]);
                        Time.sleepTicks(C0018e.c(llIIlIllIl[10], llIIlIllIl[11]));
                        "".length();
                    }
                }
                if (lIlIlIllIlIIl(str.contains(llIIlIlIlI[llIIlIllIl[218]]) ? 1 : 0)) {
                    Widget widget4 = Widgets.get(llIIlIllIl[210], llIIlIllIl[15]);
                    if (lIlIlIllIlllI(widget4)) {
                        Time.sleepTicks(llIIlIllIl[2]);
                        "".length();
                        widget4.getChild(llIIlIllIl[2]).interact(llIIlIlIlI[llIIlIllIl[219]]);
                        Time.sleepTicks(C0018e.c(llIIlIllIl[10], llIIlIllIl[11]));
                        "".length();
                    }
                }
                if (lIlIlIllIlIIl(str.contains(llIIlIlIlI[llIIlIllIl[220]]) ? 1 : 0)) {
                    Widget widget5 = Widgets.get(llIIlIllIl[210], llIIlIllIl[15]);
                    if (lIlIlIllIlllI(widget5)) {
                        Time.sleepTicks(llIIlIllIl[2]);
                        "".length();
                        widget5.getChild(llIIlIllIl[10]).interact(llIIlIlIlI[llIIlIllIl[221]]);
                        Time.sleepTicks(C0018e.c(llIIlIllIl[10], llIIlIllIl[11]));
                        "".length();
                    }
                }
                if (lIlIlIllIlIIl(str.contains(llIIlIlIlI[llIIlIllIl[222]]) ? 1 : 0)) {
                    Widget widget6 = Widgets.get(llIIlIllIl[210], llIIlIllIl[15]);
                    if (lIlIlIllIlllI(widget6)) {
                        Time.sleepTicks(llIIlIllIl[2]);
                        "".length();
                        widget6.getChild(llIIlIllIl[11]).interact(llIIlIlIlI[llIIlIllIl[223]]);
                        Time.sleepTicks(C0018e.c(llIIlIllIl[10], llIIlIllIl[11]));
                        "".length();
                    }
                }
                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[224]];
                Widget fromId = Widgets.fromId(llIIlIllIl[225]);
                if (lIlIlIllIlllI(fromId) && lIlIlIllIlIIl(fromId.isVisible() ? 1 : 0)) {
                    Time.sleepTick();
                    "".length();
                    fromId.interact(llIIlIlIlI[llIIlIllIl[226]]);
                    Time.sleepTicks(llIIlIllIl[2]);
                    "".length();
                }
            }
        }
        Predicate predicate = item -> {
            return item.getName().toLowerCase().contains(llIIlIlIlI[llIIlIllIl[250]]);
        };
        if (lIlIlIllIlIIl(Inventory.contains(predicate) ? 1 : 0)) {
            Inventory.getFirst(predicate).interact(llIIlIlIlI[llIIlIllIl[227]]);
            Time.sleepTicks(llIIlIllIl[1]);
            "".length();
        }
    }

    static {
        lIlIlIllIlIII();
        lIlIlIlIllIlI();
        bv = new ArrayList();
        nH = new WorldArea(llIIlIllIl[275], llIIlIllIl[276], llIIlIllIl[32], llIIlIllIl[53], llIIlIllIl[0]);
        nI = new WorldPoint(llIIlIllIl[277], llIIlIllIl[278], llIIlIllIl[0]);
        mT = llIIlIllIl[279];
        mU = llIIlIllIl[242];
        nJ = llIIlIllIl[185];
        nK = llIIlIllIl[52];
        nL = new WorldArea(llIIlIllIl[280], llIIlIllIl[281], llIIlIllIl[132], llIIlIllIl[93], llIIlIllIl[0]);
        nM = new WorldArea(llIIlIllIl[282], llIIlIllIl[283], llIIlIllIl[72], llIIlIllIl[71], llIIlIllIl[0]);
        nN = llIIlIlIlI[llIIlIllIl[284]];
        nO = new WorldArea(llIIlIllIl[285], llIIlIllIl[286], llIIlIllIl[64], llIIlIllIl[69], llIIlIllIl[0]);
        nP = new WorldPoint(llIIlIllIl[287], llIIlIllIl[288], llIIlIllIl[0]);
        nQ = new WorldPoint(llIIlIllIl[289], llIIlIllIl[290], llIIlIllIl[0]);
        cG = llIIlIllIl[0];
        nR = null;
        nS = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x0a41, code lost:
        if (lIlIlIllIlIll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L203;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v500, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void gb() {
        if (lIlIlIllIlIIl(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[0]];
            C0015b.a(bv);
            if (lIlIlIllIlIlI(bv.size(), llIIlIllIl[1])) {
                System.out.println(llIIlIlIlI[llIIlIllIl[1]]);
                bt = llIIlIllIl[0];
            }
        }
        if (lIlIlIllIlIll(bt ? 1 : 0)) {
            if (lIlIlIllIlIIl(GrandExchange.isOpen() ? 1 : 0)) {
                C0015b.g();
            }
            t(nN);
            Predicate predicate = item -> {
                return item.getName().toLowerCase().contains(llIIlIlIlI[llIIlIllIl[274]]);
            };
            if (lIlIlIllIlIIl(Inventory.contains(predicate) ? 1 : 0)) {
                Inventory.getFirst(predicate).interact(llIIlIlIlI[llIIlIllIl[2]]);
                Time.sleepTicks(llIIlIllIl[1]);
                "".length();
            }
            if (lIlIlIllIlIll(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIllIlIll(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIllIlIll(an() ? 1 : 0) && lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIIlIllIl[3])) {
                Movement.walkTo(C0015b.I);
                "".length();
                Time.sleepTicks(llIIlIllIl[1]);
                "".length();
            }
            if (lIlIlIllIlIll(an() ? 1 : 0) && lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIIlIllIl[3])) {
                gd();
            }
            if (lIlIlIllIlIIl(an() ? 1 : 0) && lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIIlIllIl[4])) {
                l(llIIlIllIl[5]);
                l(llIIlIllIl[6]);
                l(llIIlIllIl[7]);
                l(llIIlIllIl[8]);
                b(C0019f.bk);
                b(C0019f.aW);
                int[] iArr = new int[llIIlIllIl[1]];
                iArr[llIIlIllIl[0]] = llIIlIllIl[9];
                if (lIlIlIllIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    Time.sleepTicks(C0018e.c(llIIlIllIl[10], llIIlIllIl[11]));
                    "".length();
                    int[] iArr2 = new int[llIIlIllIl[1]];
                    iArr2[llIIlIllIl[0]] = llIIlIllIl[9];
                    Inventory.getFirst(iArr2).interact(llIIlIlIlI[llIIlIllIl[10]]);
                    Time.sleepUntil(() -> {
                        return nL.contains(Players.getLocal().getWorldLocation());
                    }, llIIlIllIl[12]);
                    "".length();
                    mV = llIIlIllIl[0];
                }
            }
            if (lIlIlIllIlIll(an() ? 1 : 0) && (!lIlIlIllIlIll(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(nQ), llIIlIllIl[13]))) {
                if (lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[14])) {
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[11]];
                    String[] strArr = new String[llIIlIllIl[1]];
                    strArr[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[14]];
                    if (lIlIlIllIlllI(NPCs.getNearest(strArr))) {
                        String[] strArr2 = new String[llIIlIllIl[1]];
                        strArr2[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[15]];
                        TileObjects.getNearest(strArr2).interact(llIIlIlIlI[llIIlIllIl[3]]);
                        Time.sleepTicks(llIIlIllIl[11]);
                        "".length();
                    }
                    String[] strArr3 = new String[llIIlIllIl[1]];
                    strArr3[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[16]];
                    if (lIlIlIllIllll(NPCs.getNearest(strArr3)) && lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[14])) {
                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[17]];
                        Movement.walkTo(D.fa);
                        "".length();
                        Time.sleepTicks(llIIlIllIl[1]);
                        "".length();
                    }
                }
                if (lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[14])) {
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[18]];
                    if (lIlIlIllIlIll(Bank.isOpen() ? 1 : 0)) {
                        int[] iArr3 = new int[llIIlIllIl[1]];
                        iArr3[llIIlIllIl[0]] = llIIlIllIl[19];
                        TileObjects.getNearest(iArr3).interact(llIIlIlIlI[llIIlIllIl[20]]);
                        Time.sleepTicks(llIIlIllIl[2]);
                        "".length();
                    }
                    if (lIlIlIllIlIIl(Bank.isOpen() ? 1 : 0) && lIlIlIlllIIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llIIlIllIl[1]);
                        "".length();
                    }
                    int[] iArr4 = new int[llIIlIllIl[1]];
                    iArr4[llIIlIllIl[0]] = llIIlIllIl[7];
                    if (lIlIlIllIlIll(Equipment.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIIlIllIl[1]];
                        iArr5[llIIlIllIl[0]] = llIIlIllIl[7];
                        if (lIlIlIllIlIll(Inventory.contains(iArr5) ? 1 : 0)) {
                            C0000a.a(llIIlIllIl[7], llIIlIllIl[1]);
                        }
                    }
                    int[] iArr6 = new int[llIIlIllIl[1]];
                    iArr6[llIIlIllIl[0]] = llIIlIllIl[8];
                    if (lIlIlIllIlIll(Equipment.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIIlIllIl[1]];
                        iArr7[llIIlIllIl[0]] = llIIlIllIl[8];
                        if (lIlIlIllIlIll(Inventory.contains(iArr7) ? 1 : 0)) {
                            C0000a.a(llIIlIllIl[8], llIIlIllIl[1]);
                        }
                    }
                    int[] iArr8 = new int[llIIlIllIl[1]];
                    iArr8[llIIlIllIl[0]] = llIIlIllIl[21];
                    if (lIlIlIllIlIll(Inventory.contains(iArr8) ? 1 : 0)) {
                        C0000a.a(llIIlIllIl[21], llIIlIllIl[1]);
                    }
                    int[] iArr9 = new int[llIIlIllIl[1]];
                    iArr9[llIIlIllIl[0]] = llIIlIllIl[22];
                    if (lIlIlIllIlIll(Inventory.contains(iArr9) ? 1 : 0)) {
                        C0000a.a(llIIlIllIl[22], llIIlIllIl[1]);
                    }
                    int[] iArr10 = new int[llIIlIllIl[1]];
                    iArr10[llIIlIllIl[0]] = llIIlIllIl[23];
                    if (lIlIlIllIlIll(Inventory.contains(iArr10) ? 1 : 0)) {
                        C0000a.a(llIIlIllIl[23], llIIlIllIl[1]);
                    }
                    if (lIlIlIllIlIlI(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                        int[] iArr11 = new int[llIIlIllIl[1]];
                        iArr11[llIIlIllIl[0]] = nJ;
                        if (lIlIlIllIlIll(Inventory.contains(iArr11) ? 1 : 0)) {
                            C0000a.a(nJ, llIIlIllIl[11]);
                        }
                    }
                    int[] iArr12 = new int[llIIlIllIl[1]];
                    iArr12[llIIlIllIl[0]] = llIIlIllIl[9];
                    if (lIlIlIllIlIll(Inventory.contains(iArr12) ? 1 : 0)) {
                        Bank.withdrawAll(llIIlIllIl[9], Bank.WithdrawMode.ITEM);
                    }
                }
            }
            if (lIlIlIllIlIIl(an() ? 1 : 0)) {
                l(llIIlIllIl[5]);
                l(llIIlIllIl[6]);
                l(llIIlIllIl[7]);
                l(llIIlIllIl[8]);
                b(C0019f.bk);
                b(C0019f.aW);
                String[] strArr4 = new String[llIIlIllIl[1]];
                strArr4[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[24]];
                if (lIlIlIllIlIIl(Inventory.contains(strArr4) ? 1 : 0)) {
                    String[] strArr5 = new String[llIIlIllIl[1]];
                    strArr5[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[25]];
                    Inventory.getFirst(strArr5).interact(llIIlIlIlI[llIIlIllIl[26]]);
                }
                if (lIlIlIllIlIIl(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIlIllIlIlI(Movement.getRunEnergy(), llIIlIllIl[27])) {
                    Inventory.getFirst(C0019f.ba).interact(llIIlIlIlI[llIIlIllIl[28]]);
                    Time.sleepTicks(llIIlIllIl[1]);
                    "".length();
                }
                if (lIlIlIllIllII(Movement.getRunEnergy(), llIIlIllIl[29]) && lIlIlIllIlIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                t(nN);
                Predicate predicate2 = item2 -> {
                    return item2.getName().toLowerCase().contains(llIIlIlIlI[llIIlIllIl[273]]);
                };
                if (lIlIlIllIlIIl(Inventory.contains(predicate2) ? 1 : 0)) {
                    Inventory.getFirst(predicate2).interact(llIIlIlIlI[llIIlIllIl[30]]);
                    Time.sleepTicks(llIIlIllIl[1]);
                    "".length();
                }
                if (lIlIlIllIlIIl(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr6 = new String[llIIlIllIl[1]];
                    strArr6[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[31]];
                    if (lIlIlIllIlIll(Inventory.contains(strArr6) ? 1 : 0) && lIlIlIllIlIll(Inventory.contains(predicate2) ? 1 : 0)) {
                        if (lIlIlIllIlIlI(cG, llIIlIllIl[1]) && lIlIlIlllIIIl(Movement.getRunEnergy(), llIIlIllIl[29])) {
                            Movement.toggleRun();
                            cG += llIIlIllIl[1];
                        }
                        if (lIlIlIlllIIIl(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                            if (lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(nP), llIIlIllIl[16])) {
                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[32]];
                                if (lIlIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo(nP);
                                "".length();
                                Time.sleepTicks(llIIlIllIl[1]);
                                "".length();
                            }
                            if (lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(nP), llIIlIllIl[16])) {
                                Time.sleepTicks(llIIlIllIl[2]);
                                "".length();
                                if (lIlIlIllIlIll(Dialog.isOpen() ? 1 : 0) && lIlIlIllIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                    String[] strArr7 = new String[llIIlIllIl[1]];
                                    strArr7[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[33]];
                                    if (lIlIlIllIlIll(Inventory.contains(strArr7) ? 1 : 0) && lIlIlIllIlIll(Inventory.contains(predicate2) ? 1 : 0) && lIlIlIllIlIIl(Widgets.get(llIIlIllIl[34]).isEmpty() ? 1 : 0) && lIlIlIllIlIll(Vars.getBit(llIIlIllIl[35]))) {
                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[36]];
                                        int[] iArr13 = new int[llIIlIllIl[1]];
                                        iArr13[llIIlIllIl[0]] = llIIlIllIl[37];
                                        NPC nearest = NPCs.getNearest(iArr13);
                                        if (lIlIlIllIlllI(nearest) && lIlIlIllIlIll(Dialog.isOpen() ? 1 : 0)) {
                                            nearest.interact(llIIlIlIlI[llIIlIllIl[38]]);
                                            Time.sleepTicks(llIIlIllIl[10]);
                                            "".length();
                                        }
                                        C0020g.a(new String[llIIlIllIl[0]]);
                                    }
                                }
                            }
                        }
                        String[] strArr8 = new String[llIIlIllIl[1]];
                        strArr8[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[39]];
                        C0020g.a(strArr8);
                    }
                }
                if (lIlIlIllIlIIl(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr9 = new String[llIIlIllIl[1]];
                    strArr9[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[40]];
                    if (lIlIlIllIlIll(Inventory.contains(strArr9) ? 1 : 0) && lIlIlIllIlIll(Inventory.contains(predicate2) ? 1 : 0)) {
                        if (lIlIlIlllIIIl(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                            if (lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(nI), llIIlIllIl[16])) {
                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[41]];
                                if (lIlIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo(nI);
                                "".length();
                                Time.sleepTicks(llIIlIllIl[1]);
                                "".length();
                            }
                            Time.sleepTicks(llIIlIllIl[2]);
                            "".length();
                            if (lIlIlIllIlIll(Dialog.isOpen() ? 1 : 0) && lIlIlIllIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                String[] strArr10 = new String[llIIlIllIl[1]];
                                strArr10[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[29]];
                                if (lIlIlIllIlIll(Inventory.contains(strArr10) ? 1 : 0) && lIlIlIllIlIll(Inventory.contains(predicate2) ? 1 : 0)) {
                                    if (lIlIlIllIlIlI(cG, llIIlIllIl[1]) && lIlIlIlllIIIl(Movement.getRunEnergy(), llIIlIllIl[29])) {
                                        Movement.toggleRun();
                                        cG += llIIlIllIl[1];
                                    }
                                    if (lIlIlIllIllll(Widgets.get(llIIlIllIl[34], llIIlIllIl[24]))) {
                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[42]];
                                        int[] iArr14 = new int[llIIlIllIl[1]];
                                        iArr14[llIIlIllIl[0]] = llIIlIllIl[43];
                                        NPC nearest2 = NPCs.getNearest(iArr14);
                                        if (lIlIlIllIlllI(nearest2) && lIlIlIllIlIll(Dialog.isOpen() ? 1 : 0) && lIlIlIllIlIll(Vars.getBit(llIIlIllIl[35]))) {
                                            nearest2.interact(llIIlIlIlI[llIIlIllIl[44]]);
                                            Time.sleepTicks(llIIlIllIl[10]);
                                            "".length();
                                        }
                                        C0020g.a(new String[llIIlIllIl[0]]);
                                        Time.sleepTicks(llIIlIllIl[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        C0020g.a(new String[llIIlIllIl[0]]);
                    }
                }
                try {
                    gc();
                    "".length();
                    if ((-" ".length()) >= " ".length()) {
                        return;
                    }
                } catch (Exception llllllllllllllllllIlIIIllllllIIl) {
                    System.out.println(llllllllllllllllllIlIIIllllllIIl.getStackTrace());
                    System.out.println(llllllllllllllllllIlIIIllllllIIl.getCause());
                    llllllllllllllllllIlIIIllllllIIl.printStackTrace();
                }
            }
            if (lIlIlIllIlIlI(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                int[] iArr15 = new int[llIIlIllIl[1]];
                iArr15[llIIlIllIl[0]] = nJ;
                if (lIlIlIllIlIIl(Inventory.contains(iArr15) ? 1 : 0)) {
                    String[] strArr11 = new String[llIIlIllIl[1]];
                    strArr11[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[45]];
                    if (lIlIlIllIlIIl(Inventory.contains(strArr11) ? 1 : 0)) {
                        int[] iArr16 = new int[llIIlIllIl[1]];
                        iArr16[llIIlIllIl[0]] = llIIlIllIl[22];
                        if (lIlIlIllIlIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                            String[] strArr12 = new String[llIIlIllIl[1]];
                            strArr12[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[46]];
                        }
                    }
                }
                if (lIlIlIllIlIIl(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(nQ), llIIlIllIl[28])) {
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[4]];
                    Movement.walkTo(nQ);
                    "".length();
                }
                if (lIlIlIllIlIIl(nM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[47]];
                    Movement.walkTo(BankLocation.BURGH_DE_ROTT_BANK);
                    "".length();
                }
                if (lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[18])) {
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[48]];
                    gd();
                }
                if (lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(nQ), llIIlIllIl[28])) {
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[49]];
                    gd();
                }
            }
            if (lIlIlIllIlIlI(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                int[] iArr17 = new int[llIIlIllIl[1]];
                iArr17[llIIlIllIl[0]] = nJ;
                if (lIlIlIllIlIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIIlIllIl[1]];
                    iArr18[llIIlIllIl[0]] = nJ;
                    Inventory.getFirst(iArr18).interact(llIIlIlIlI[llIIlIllIl[50]]);
                    Time.sleepTicks(llIIlIllIl[1]);
                    "".length();
                }
            }
            int[] iArr19 = new int[llIIlIllIl[1]];
            iArr19[llIIlIllIl[0]] = llIIlIllIl[51];
            if (lIlIlIllIlIIl(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIIlIllIl[1]];
                iArr20[llIIlIllIl[0]] = llIIlIllIl[51];
                Inventory.getAll(iArr20).stream().forEach(item3 -> {
                    item3.interact(llIIlIlIlI[llIIlIllIl[272]]);
                });
            }
        }
    }

    public static void l(int i) {
        int[] iArr = new int[llIIlIllIl[1]];
        iArr[llIIlIllIl[0]] = i;
        if (lIlIlIllIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIIlIllIl[1]];
            iArr2[llIIlIllIl[0]] = i;
            if (lIlIlIllIlIll(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIIlIllIl[1]];
                iArr3[llIIlIllIl[0]] = i;
                Item first = Inventory.getFirst(iArr3);
                String[] strArr = new String[llIIlIllIl[1]];
                strArr[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[192]];
                if (lIlIlIllIlIIl(first.hasAction(strArr) ? 1 : 0)) {
                    int[] iArr4 = new int[llIIlIllIl[1]];
                    iArr4[llIIlIllIl[0]] = i;
                    Inventory.getFirst(iArr4).interact(llIIlIlIlI[llIIlIllIl[193]]);
                }
                int[] iArr5 = new int[llIIlIllIl[1]];
                iArr5[llIIlIllIl[0]] = i;
                Item first2 = Inventory.getFirst(iArr5);
                String[] strArr2 = new String[llIIlIllIl[1]];
                strArr2[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[194]];
                if (lIlIlIllIlIIl(first2.hasAction(strArr2) ? 1 : 0)) {
                    int[] iArr6 = new int[llIIlIllIl[1]];
                    iArr6[llIIlIllIl[0]] = i;
                    Inventory.getFirst(iArr6).interact(llIIlIlIlI[llIIlIllIl[195]]);
                }
                int[] iArr7 = new int[llIIlIllIl[1]];
                iArr7[llIIlIllIl[0]] = i;
                Item first3 = Inventory.getFirst(iArr7);
                String[] strArr3 = new String[llIIlIllIl[1]];
                strArr3[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[196]];
                if (lIlIlIllIlIIl(first3.hasAction(strArr3) ? 1 : 0)) {
                    int[] iArr8 = new int[llIIlIllIl[1]];
                    iArr8[llIIlIllIl[0]] = i;
                    Inventory.getFirst(iArr8).interact(llIIlIlIlI[llIIlIllIl[197]]);
                }
                if (lIlIlIlllIlIl(i, llIIlIllIl[198])) {
                    Time.sleepTicks(llIIlIllIl[10]);
                    "".length();
                    String[] strArr4 = new String[llIIlIllIl[1]];
                    strArr4[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[199]];
                    C0020g.a(strArr4);
                    Time.sleepTicks(llIIlIllIl[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIlIlIllIllIl(int i, int i2) {
        return i <= i2;
    }

    private static int d(int i, int i2) {
        return Math.abs(i - i2);
    }

    private static boolean lIlIlIllIllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0196, code lost:
        if (lIlIlIllIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ed, code lost:
        if (lIlIlIllIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0227, code lost:
        if (lIlIlIllIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0261, code lost:
        if (lIlIlIllIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v192, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void gd() {
        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[182]];
        if (lIlIlIllIlIll(Bank.isOpen() ? 1 : 0)) {
            if (lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIIlIllIl[3])) {
                C0000a.a();
                Time.sleepTicks(llIIlIllIl[10]);
                "".length();
            }
            if (lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(nQ), llIIlIllIl[28])) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIlIlIllIlIIl(tileObject.getName().equalsIgnoreCase(llIIlIlIlI[llIIlIllIl[251]]) ? 1 : 0)) {
                        String[] strArr = new String[llIIlIllIl[1]];
                        strArr[llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[252]];
                        if (lIlIlIllIlIIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llIIlIllIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llIIlIllIl[0];
                });
                if (lIlIlIllIlllI(nearest)) {
                    nearest.interact(llIIlIlIlI[llIIlIllIl[183]]);
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIIlIllIl[158]);
                    "".length();
                }
            }
            if (lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[24])) {
                int[] iArr = new int[llIIlIllIl[1]];
                iArr[llIIlIllIl[0]] = llIIlIllIl[19];
                TileObjects.getNearest(iArr).interact(llIIlIlIlI[llIIlIllIl[184]]);
                Time.sleepTicks(llIIlIllIl[2]);
                "".length();
            }
        }
        if (lIlIlIllIlIIl(Bank.isOpen() ? 1 : 0)) {
            if (lIlIlIlllIIII(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks(llIIlIllIl[11]);
                "".length();
            }
            if (lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIIlIllIl[3]) && lIlIlIlllIIII(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks(llIIlIllIl[2]);
                "".length();
            }
            int[] iArr2 = new int[llIIlIllIl[1]];
            iArr2[llIIlIllIl[0]] = llIIlIllIl[7];
            if (lIlIlIllIlIll(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIIlIllIl[1]];
                iArr3[llIIlIllIl[0]] = llIIlIllIl[7];
                if (lIlIlIllIlIll(Equipment.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llIIlIllIl[1]];
                    iArr4[llIIlIllIl[0]] = llIIlIllIl[7];
                }
            }
            int[] iArr5 = new int[llIIlIllIl[1]];
            iArr5[llIIlIllIl[0]] = llIIlIllIl[8];
            if (lIlIlIllIlIll(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIlIllIl[1]];
                iArr6[llIIlIllIl[0]] = llIIlIllIl[8];
                if (lIlIlIllIlIll(Inventory.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[llIIlIllIl[1]];
                    iArr7[llIIlIllIl[0]] = llIIlIllIl[8];
                }
            }
            int[] iArr8 = new int[llIIlIllIl[1]];
            iArr8[llIIlIllIl[0]] = llIIlIllIl[22];
            if (lIlIlIllIlIll(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llIIlIllIl[1]];
                iArr9[llIIlIllIl[0]] = llIIlIllIl[22];
            }
            int[] iArr10 = new int[llIIlIllIl[1]];
            iArr10[llIIlIllIl[0]] = llIIlIllIl[23];
            if (lIlIlIllIlIll(Bank.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIIlIllIl[1]];
                iArr11[llIIlIllIl[0]] = llIIlIllIl[23];
            }
            int[] iArr12 = new int[llIIlIllIl[1]];
            iArr12[llIIlIllIl[0]] = llIIlIllIl[185];
            if (!lIlIlIllIlIll(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[llIIlIllIl[1]];
                iArr13[llIIlIllIl[0]] = llIIlIllIl[5];
                if (lIlIlIllIlIll(Equipment.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[llIIlIllIl[1]];
                    iArr14[llIIlIllIl[0]] = llIIlIllIl[5];
                    if (lIlIlIllIlIll(Inventory.contains(iArr14) ? 1 : 0)) {
                        C0000a.a(llIIlIllIl[5], llIIlIllIl[1]);
                        Time.sleepTicks(llIIlIllIl[1]);
                        "".length();
                    }
                }
                int[] iArr15 = new int[llIIlIllIl[1]];
                iArr15[llIIlIllIl[0]] = llIIlIllIl[6];
                if (lIlIlIllIlIll(Equipment.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[llIIlIllIl[1]];
                    iArr16[llIIlIllIl[0]] = llIIlIllIl[6];
                    if (lIlIlIllIlIll(Inventory.contains(iArr16) ? 1 : 0)) {
                        C0000a.a(llIIlIllIl[6], llIIlIllIl[1]);
                        Time.sleepTicks(llIIlIllIl[1]);
                        "".length();
                    }
                }
                if (lIlIlIllIlIll(Equipment.contains(C0019f.bk) ? 1 : 0) && lIlIlIllIlIll(Inventory.contains(C0019f.bk) ? 1 : 0)) {
                    C0000a.b(C0019f.bk, llIIlIllIl[1]);
                    Time.sleepTicks(llIIlIllIl[1]);
                    "".length();
                }
                if (lIlIlIllIlIll(Equipment.contains(C0019f.aW) ? 1 : 0) && lIlIlIllIlIll(Inventory.contains(C0019f.aW) ? 1 : 0)) {
                    C0000a.b(C0019f.aW, llIIlIllIl[1]);
                    Time.sleepTicks(llIIlIllIl[1]);
                    "".length();
                }
                int[] iArr17 = new int[llIIlIllIl[1]];
                iArr17[llIIlIllIl[0]] = llIIlIllIl[7];
                if (lIlIlIllIlIll(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIIlIllIl[1]];
                    iArr18[llIIlIllIl[0]] = llIIlIllIl[7];
                    if (lIlIlIllIlIll(Inventory.contains(iArr18) ? 1 : 0)) {
                        C0000a.a(llIIlIllIl[7], llIIlIllIl[1]);
                        Time.sleepTicks(llIIlIllIl[1]);
                        "".length();
                    }
                }
                int[] iArr19 = new int[llIIlIllIl[1]];
                iArr19[llIIlIllIl[0]] = llIIlIllIl[8];
                if (lIlIlIllIlIll(Equipment.contains(iArr19) ? 1 : 0)) {
                    int[] iArr20 = new int[llIIlIllIl[1]];
                    iArr20[llIIlIllIl[0]] = llIIlIllIl[8];
                    if (lIlIlIllIlIll(Inventory.contains(iArr20) ? 1 : 0)) {
                        C0000a.a(llIIlIllIl[8], llIIlIllIl[1]);
                        Time.sleepTicks(llIIlIllIl[1]);
                        "".length();
                    }
                }
                int[] iArr21 = new int[llIIlIllIl[1]];
                iArr21[llIIlIllIl[0]] = llIIlIllIl[21];
                if (lIlIlIllIlIll(Inventory.contains(iArr21) ? 1 : 0)) {
                    C0000a.a(llIIlIllIl[21], llIIlIllIl[1]);
                    Time.sleepTicks(llIIlIllIl[1]);
                    "".length();
                }
                int[] iArr22 = new int[llIIlIllIl[1]];
                iArr22[llIIlIllIl[0]] = llIIlIllIl[22];
                if (lIlIlIllIlIll(Inventory.contains(iArr22) ? 1 : 0)) {
                    C0000a.a(llIIlIllIl[22], llIIlIllIl[1]);
                    Time.sleepTicks(llIIlIllIl[1]);
                    "".length();
                }
                int[] iArr23 = new int[llIIlIllIl[1]];
                iArr23[llIIlIllIl[0]] = llIIlIllIl[23];
                if (lIlIlIllIlIll(Inventory.contains(iArr23) ? 1 : 0)) {
                    C0000a.a(llIIlIllIl[23], llIIlIllIl[1]);
                    Time.sleepTicks(llIIlIllIl[1]);
                    "".length();
                }
                if (lIlIlIllIlIlI(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                    int[] iArr24 = new int[llIIlIllIl[1]];
                    iArr24[llIIlIllIl[0]] = nJ;
                    if (lIlIlIllIlIll(Inventory.contains(iArr24) ? 1 : 0)) {
                        C0000a.a(nJ, llIIlIllIl[10]);
                        Time.sleepTicks(llIIlIllIl[1]);
                        "".length();
                    }
                }
                int[] iArr25 = new int[llIIlIllIl[1]];
                iArr25[llIIlIllIl[0]] = llIIlIllIl[9];
                if (lIlIlIllIlIll(Inventory.contains(iArr25) ? 1 : 0)) {
                    Bank.withdrawAll(llIIlIllIl[9], Bank.WithdrawMode.ITEM);
                    Time.sleepTicks(llIIlIllIl[1]);
                    "".length();
                    return;
                }
                return;
            }
            System.out.println(llIIlIlIlI[llIIlIllIl[186]]);
            Q();
            bt = llIIlIllIl[1];
        }
    }

    private static boolean lIlIlIllIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean b(as asVar, List<as> list) {
        return list.stream().anyMatch(asVar2 -> {
            return asVar2.nT.equals(asVar.nT);
        });
    }

    private static boolean lIlIlIllIlIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01e1, code lost:
        if (lIlIlIllIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ar.llIIlIllIl[36]) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0276, code lost:
        if (lIlIlIllIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ar.llIIlIllIl[4]) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[llIIlIllIl[1]];
        iArr7[llIIlIllIl[0]] = llIIlIllIl[8];
        if (lIlIlIllIlIll(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIllIl[8], llIIlIllIl[1], C0018e.c(llIIlIllIl[228], llIIlIllIl[229])));
            "".length();
        }
        int[] iArr8 = new int[llIIlIllIl[1]];
        iArr8[llIIlIllIl[0]] = llIIlIllIl[230];
        if (lIlIlIllIlIll(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIllIl[230], llIIlIllIl[2], llIIlIllIl[231]));
            "".length();
        }
        int[] iArr9 = new int[llIIlIllIl[1]];
        iArr9[llIIlIllIl[0]] = llIIlIllIl[232];
        if (lIlIlIllIlIll(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIllIl[232], llIIlIllIl[18], llIIlIllIl[233]));
            "".length();
        }
        int[] iArr10 = new int[llIIlIllIl[1]];
        iArr10[llIIlIllIl[0]] = llIIlIllIl[22];
        if (lIlIlIllIlIll(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIllIl[22], llIIlIllIl[1], C0018e.c(llIIlIllIl[234], llIIlIllIl[235])));
            "".length();
        }
        int[] iArr11 = new int[llIIlIllIl[1]];
        iArr11[llIIlIllIl[0]] = llIIlIllIl[23];
        if (lIlIlIllIlIll(Bank.contains(iArr11) ? 1 : 0)) {
            bv.add(new C0017d(llIIlIllIl[23], llIIlIllIl[1], C0018e.c(llIIlIllIl[234], llIIlIllIl[235])));
            "".length();
        }
        int[] iArr12 = new int[llIIlIllIl[1]];
        iArr12[llIIlIllIl[0]] = llIIlIllIl[185];
        if (lIlIlIllIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
            int[] iArr13 = new int[llIIlIllIl[1]];
            iArr13[llIIlIllIl[0]] = llIIlIllIl[185];
            if (lIlIlIllIlIIl(Bank.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIlIllIl[1]];
                iArr14[llIIlIllIl[0]] = llIIlIllIl[185];
            }
            iArr = new int[llIIlIllIl[1]];
            iArr[llIIlIllIl[0]] = llIIlIllIl[9];
            if (lIlIlIllIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr15 = new int[llIIlIllIl[1]];
                iArr15[llIIlIllIl[0]] = llIIlIllIl[9];
                if (lIlIlIllIlIIl(Bank.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[llIIlIllIl[1]];
                    iArr16[llIIlIllIl[0]] = llIIlIllIl[9];
                }
                iArr2 = new int[llIIlIllIl[1]];
                iArr2[llIIlIllIl[0]] = llIIlIllIl[240];
                if (lIlIlIllIlIll(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlIllIl[240], llIIlIllIl[18], llIIlIllIl[241]));
                    "".length();
                }
                iArr3 = new int[llIIlIllIl[1]];
                iArr3[llIIlIllIl[0]] = llIIlIllIl[242];
                if (lIlIlIllIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0017d(mU, llIIlIllIl[59], llIIlIllIl[243]));
                    "".length();
                }
                iArr4 = new int[llIIlIllIl[1]];
                iArr4[llIIlIllIl[0]] = llIIlIllIl[244];
                if (lIlIlIllIlIll(Bank.contains(iArr4) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlIllIl[244], llIIlIllIl[1], llIIlIllIl[245]));
                    "".length();
                }
                iArr5 = new int[llIIlIllIl[1]];
                iArr5[llIIlIllIl[0]] = llIIlIllIl[7];
                if (lIlIlIllIlIll(Bank.contains(iArr5) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlIllIl[7], llIIlIllIl[1], C0018e.c(llIIlIllIl[246], llIIlIllIl[247])));
                    "".length();
                }
                iArr6 = new int[llIIlIllIl[1]];
                iArr6[llIIlIllIl[0]] = llIIlIllIl[248];
                if (lIlIlIllIlIll(Bank.contains(iArr6) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlIllIl[248], llIIlIllIl[36], C0023j.cf));
                    "".length();
                    return;
                }
                return;
            }
            bv.add(new C0017d(llIIlIllIl[9], llIIlIllIl[4], C0018e.c(llIIlIllIl[159], llIIlIllIl[239])));
            "".length();
            iArr2 = new int[llIIlIllIl[1]];
            iArr2[llIIlIllIl[0]] = llIIlIllIl[240];
            if (lIlIlIllIlIll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[llIIlIllIl[1]];
            iArr3[llIIlIllIl[0]] = llIIlIllIl[242];
            if (lIlIlIllIlIll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[llIIlIllIl[1]];
            iArr4[llIIlIllIl[0]] = llIIlIllIl[244];
            if (lIlIlIllIlIll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[llIIlIllIl[1]];
            iArr5[llIIlIllIl[0]] = llIIlIllIl[7];
            if (lIlIlIllIlIll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llIIlIllIl[1]];
            iArr6[llIIlIllIl[0]] = llIIlIllIl[248];
            if (lIlIlIllIlIll(Bank.contains(iArr6) ? 1 : 0)) {
            }
        }
        bv.add(new C0017d(llIIlIllIl[185], llIIlIllIl[236], C0018e.c(llIIlIllIl[237], llIIlIllIl[238])));
        "".length();
        iArr = new int[llIIlIllIl[1]];
        iArr[llIIlIllIl[0]] = llIIlIllIl[9];
        if (lIlIlIllIlIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIlIllIl[9], llIIlIllIl[4], C0018e.c(llIIlIllIl[159], llIIlIllIl[239])));
        "".length();
        iArr2 = new int[llIIlIllIl[1]];
        iArr2[llIIlIllIl[0]] = llIIlIllIl[240];
        if (lIlIlIllIlIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIIlIllIl[1]];
        iArr3[llIIlIllIl[0]] = llIIlIllIl[242];
        if (lIlIlIllIlIll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[llIIlIllIl[1]];
        iArr4[llIIlIllIl[0]] = llIIlIllIl[244];
        if (lIlIlIllIlIll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[llIIlIllIl[1]];
        iArr5[llIIlIllIl[0]] = llIIlIllIl[7];
        if (lIlIlIllIlIll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llIIlIllIl[1]];
        iArr6[llIIlIllIl[0]] = llIIlIllIl[248];
        if (lIlIlIllIlIll(Bank.contains(iArr6) ? 1 : 0)) {
        }
    }

    private static boolean a(as asVar, PriorityQueue<as> priorityQueue) {
        return priorityQueue.stream().anyMatch(asVar2 -> {
            return asVar2.nT.equals(asVar.nT);
        });
    }

    private static boolean lIlIlIlllIlll(int i) {
        return i <= 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIlIlIlI[llIIlIllIl[249]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIlIllIl[0];
    }
}
