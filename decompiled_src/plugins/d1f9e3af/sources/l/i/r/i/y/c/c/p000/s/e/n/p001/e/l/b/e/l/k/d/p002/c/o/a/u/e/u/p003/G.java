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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.G  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/G.class */
public class G implements W {
    public static final /* synthetic */ WorldPoint hv;
    private static final /* synthetic */ WorldPoint hY;
    private static final /* synthetic */ int il;
    private static final /* synthetic */ WorldPoint id;
    private static final /* synthetic */ WorldPoint ic;
    private static final /* synthetic */ WorldPoint hX;
    static /* synthetic */ boolean cm;
    private static final /* synthetic */ int is;
    private static final /* synthetic */ WorldPoint hW;
    private static final /* synthetic */ int hP;
    private static final /* synthetic */ int hO;
    private static final /* synthetic */ int hG;
    private static /* synthetic */ int[] lIlllIlIl;
    public static /* synthetic */ List<C0003d> bv;
    private static final /* synthetic */ int hN;
    private static final /* synthetic */ WorldArea ii;
    private static final /* synthetic */ WorldPoint hS;
    private static final /* synthetic */ int ir;
    public static final /* synthetic */ WorldArea hD;
    private static /* synthetic */ String[] lIlllIIII;
    private static final /* synthetic */ WorldPoint hU;
    public static /* synthetic */ int iu;
    private static final /* synthetic */ int ip;
    private static /* synthetic */ int[] ix;
    private static final /* synthetic */ WorldArea ij;
    public static final /* synthetic */ WorldArea hz;
    private static final /* synthetic */ int iq;
    private static final /* synthetic */ int in;
    public static final /* synthetic */ WorldArea hC;
    private static final /* synthetic */ int hE;
    private static final /* synthetic */ WorldPoint hR;
    private static final /* synthetic */ WorldPoint ib;
    private static final /* synthetic */ WorldArea ih;
    private static final /* synthetic */ int hI;
    private static final /* synthetic */ int hJ;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldArea hB;
    private static final /* synthetic */ int im;
    private static final /* synthetic */ int hK;
    private static final /* synthetic */ WorldPoint hT;
    private static final /* synthetic */ WorldPoint ie;
    public static /* synthetic */ int iv;
    private static final /* synthetic */ int io;
    private static final /* synthetic */ WorldPoint ig;
    static /* synthetic */ String iw;
    private static final /* synthetic */ int it;
    private static final /* synthetic */ int hL;
    private static final /* synthetic */ int hH;
    static /* synthetic */ int cl;
    private static final /* synthetic */ int hQ;
    public static final /* synthetic */ WorldArea hy;
    public static final /* synthetic */ WorldPoint hu;
    static /* synthetic */ String[] hl;
    private static final /* synthetic */ int hM;

    /* renamed from: if  reason: not valid java name */
    private static final /* synthetic */ WorldPoint f0if;
    private static final /* synthetic */ WorldPoint hV;
    private static final /* synthetic */ int hF;
    public static final /* synthetic */ WorldPoint ht;
    private static final /* synthetic */ WorldPoint hZ;
    private static final /* synthetic */ int ik;
    public static final /* synthetic */ WorldArea hA;
    public static final /* synthetic */ WorldArea hw;
    private static final /* synthetic */ WorldPoint ia;
    public static final /* synthetic */ WorldArea hx;

    private static boolean lIIlllIlIIlI(int i) {
        return i > 0;
    }

    private static String lIIllIlIIlII(String llIIIlIlllllIl, String llIIIlIlllllII) {
        String llIIIlIlllllIl2 = new String(Base64.getDecoder().decode(llIIIlIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIlIllllIll = new StringBuilder();
        char[] charArray = llIIIlIlllllII.toCharArray();
        int llIIIlIllllIIl = lIlllIlIl[4];
        char[] charArray2 = llIIIlIlllllIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlllIlIl[4];
        while (lIIlllIIlIIl(i, length)) {
            llIIIlIllllIll.append((char) (charArray2[i] ^ charArray[llIIIlIllllIIl % charArray.length]));
            "".length();
            llIIIlIllllIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llIIIlIllllIll);
    }

    private static boolean lIIlllIIlIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0262, code lost:
        if (lIIlllIlIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.G.lIlllIlIl[22]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02a5, code lost:
        if (lIIlllIlIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.G.lIlllIlIl[13]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02e8, code lost:
        if (lIIlllIIlIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.G.lIlllIlIl[33]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02eb, code lost:
        af();
        java.lang.System.out.println(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.G.lIlllIIII[l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.G.lIlllIlIl[104(0x68, float:1.46E-43)]]);
        l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.G.bt = l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.G.lIlllIlIl[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0306, code lost:
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
    private static void bP() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIlllIIllll(nearest) && lIIlllIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[97]];
            C0000a.a(nearest);
        }
        if (lIIlllIIllll(nearest) && lIIlllIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlllIIllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[98]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIlllIlIl[99]);
                "".length();
            }
            if (lIIlllIIlIll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[100]];
                if (lIIlllIlIIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIlllIlIl[12]);
                    "".length();
                }
                if (lIIlllIlIIlI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIlllIlIl[1]);
                    "".length();
                }
                while (lIIlllIIllII(C0025z.bi() ? 1 : 0) && lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    C0025z.bg();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                    "".length();
                    if ("  ".length() < " ".length()) {
                        return;
                    }
                }
                int[] iArr = new int[lIlllIlIl[3]];
                iArr[lIlllIlIl[4]] = lIlllIlIl[7];
                if (lIIlllIIlIll(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlllIlIl[3]];
                    iArr2[lIlllIlIl[4]] = lIlllIlIl[7];
                    if (lIIlllIIlIIl(Bank.getFirst(iArr2).getQuantity(), lIlllIlIl[101])) {
                        af();
                        System.out.println(lIlllIIII[lIlllIlIl[102]]);
                        bt = lIlllIlIl[3];
                        return;
                    }
                }
                int[] iArr3 = new int[lIlllIlIl[3]];
                iArr3[lIlllIlIl[4]] = lIlllIlIl[6];
                if (lIIlllIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIlllIlIl[3]];
                    iArr4[lIlllIlIl[4]] = lIlllIlIl[6];
                    if (lIIlllIIlIIl(Bank.getFirst(iArr4).getQuantity(), lIlllIlIl[101])) {
                        af();
                        System.out.println(lIlllIIII[lIlllIlIl[16]]);
                        bt = lIlllIlIl[3];
                        return;
                    }
                }
                int[] iArr5 = new int[lIlllIlIl[3]];
                iArr5[lIlllIlIl[4]] = lIlllIlIl[5];
                if (lIIlllIIlIll(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIlllIlIl[3]];
                    iArr6[lIlllIlIl[4]] = lIlllIlIl[5];
                    if (lIIlllIIlIIl(Bank.getFirst(iArr6).getQuantity(), lIlllIlIl[101])) {
                        af();
                        System.out.println(lIlllIIII[lIlllIlIl[103]]);
                        bt = lIlllIlIl[3];
                        return;
                    }
                }
                int[] iArr7 = new int[lIlllIlIl[3]];
                iArr7[lIlllIlIl[4]] = lIlllIlIl[10];
                if (lIIlllIIlIll(Bank.contains(iArr7) ? 1 : 0)) {
                    int[] iArr8 = new int[lIlllIlIl[3]];
                    iArr8[lIlllIlIl[4]] = lIlllIlIl[10];
                }
                int[] iArr9 = new int[lIlllIlIl[3]];
                iArr9[lIlllIlIl[4]] = lIlllIlIl[9];
                if (lIIlllIIlIll(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlllIlIl[3]];
                    iArr10[lIlllIlIl[4]] = lIlllIlIl[9];
                }
                int[] iArr11 = new int[lIlllIlIl[3]];
                iArr11[lIlllIlIl[4]] = lIlllIlIl[8];
                if (lIIlllIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIlllIlIl[3]];
                    iArr12[lIlllIlIl[4]] = lIlllIlIl[8];
                }
                int[] iArr13 = new int[lIlllIlIl[18]];
                iArr13[lIlllIlIl[4]] = lIlllIlIl[105];
                iArr13[lIlllIlIl[3]] = lIlllIlIl[10];
                iArr13[lIlllIlIl[1]] = lIlllIlIl[9];
                iArr13[lIlllIlIl[12]] = lIlllIlIl[8];
                iArr13[lIlllIlIl[15]] = lIlllIlIl[7];
                iArr13[lIlllIlIl[13]] = lIlllIlIl[5];
                iArr13[lIlllIlIl[14]] = lIlllIlIl[6];
                if (lIIlllIIllII(C0004e.b(iArr13) ? 1 : 0)) {
                    af();
                    System.out.println(lIlllIIII[lIlllIlIl[106]]);
                    bt = lIlllIlIl[3];
                    return;
                }
                if (lIIlllIIllII(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(lIlllIlIl[15]);
                    "".length();
                }
                int[] iArr14 = new int[lIlllIlIl[3]];
                iArr14[lIlllIlIl[4]] = lIlllIlIl[10];
                if (lIIlllIIlIll(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlllIlIl[3]];
                    iArr15[lIlllIlIl[4]] = lIlllIlIl[10];
                    if (lIIlllIIlIIl(Inventory.getCount(iArr15), lIlllIlIl[3])) {
                        Bank.withdraw(lIlllIlIl[10], lIlllIlIl[13], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIlIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lIlllIlIl[3]];
                            iArr16[lIlllIlIl[4]] = lIlllIlIl[10];
                            if (lIIlllIlIIlI(Inventory.getCount(iArr16))) {
                                ?? r0 = lIlllIlIl[3];
                                "".length();
                                return (-" ".length()) > 0 ? ((135 ^ 186) ^ (22 ^ 7)) & (((((79 + 37) - (-1)) + 26) ^ (((139 + 91) - 217) + 150)) ^ (-" ".length())) : r0;
                            }
                            return lIlllIlIl[4];
                        }, lIlllIlIl[99]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[lIlllIlIl[3]];
                iArr16[lIlllIlIl[4]] = lIlllIlIl[9];
                if (lIIlllIIlIll(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[lIlllIlIl[3]];
                    iArr17[lIlllIlIl[4]] = lIlllIlIl[9];
                    if (lIIlllIIlIIl(Inventory.getCount(iArr17), lIlllIlIl[3])) {
                        Bank.withdraw(lIlllIlIl[9], lIlllIlIl[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIlIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[lIlllIlIl[3]];
                            iArr18[lIlllIlIl[4]] = lIlllIlIl[9];
                            if (lIIlllIlIIlI(Inventory.getCount(iArr18))) {
                                ?? r0 = lIlllIlIl[3];
                                "".length();
                                return " ".length() <= (((((49 + 151) - 131) + 149) ^ (((69 + 89) - 111) + 97)) & (("   ".length() ^ (192 ^ 137)) ^ (-" ".length()))) ? ((45 ^ 38) ^ (21 ^ 17)) & (((125 ^ 8) ^ (102 ^ 28)) ^ (-" ".length())) : r0;
                            }
                            return lIlllIlIl[4];
                        }, lIlllIlIl[99]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[lIlllIlIl[3]];
                iArr18[lIlllIlIl[4]] = lIlllIlIl[7];
                if (lIIlllIIlIll(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[lIlllIlIl[3]];
                    iArr19[lIlllIlIl[4]] = lIlllIlIl[7];
                    if (lIIlllIIlIIl(Inventory.getCount(iArr19), lIlllIlIl[3])) {
                        Bank.withdraw(lIlllIlIl[7], lIlllIlIl[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIlIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[lIlllIlIl[3]];
                            iArr20[lIlllIlIl[4]] = lIlllIlIl[7];
                            if (lIIlllIlIIlI(Inventory.getCount(iArr20))) {
                                ?? r0 = lIlllIlIl[3];
                                "".length();
                                return " ".length() >= "  ".length() ? ((101 ^ 50) ^ (227 ^ 154)) & (((102 ^ 112) ^ (136 ^ 176)) ^ (-" ".length())) : r0;
                            }
                            return lIlllIlIl[4];
                        }, lIlllIlIl[99]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIlllIlIl[3]];
                iArr20[lIlllIlIl[4]] = lIlllIlIl[5];
                if (lIIlllIIlIll(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lIlllIlIl[3]];
                    iArr21[lIlllIlIl[4]] = lIlllIlIl[5];
                    if (lIIlllIIlIIl(Inventory.getCount(iArr21), lIlllIlIl[3])) {
                        Bank.withdraw(lIlllIlIl[5], lIlllIlIl[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIlIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[lIlllIlIl[3]];
                            iArr22[lIlllIlIl[4]] = lIlllIlIl[5];
                            if (lIIlllIlIIlI(Inventory.getCount(iArr22))) {
                                ?? r0 = lIlllIlIl[3];
                                "".length();
                                return 0 != 0 ? ((24 ^ 52) ^ (133 ^ 181)) & (((((128 + 112) - 239) + 140) ^ (((50 + 109) - 45) + 31)) ^ (-" ".length())) : r0;
                            }
                            return lIlllIlIl[4];
                        }, lIlllIlIl[99]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[lIlllIlIl[3]];
                iArr22[lIlllIlIl[4]] = lIlllIlIl[6];
                if (lIIlllIIlIll(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[lIlllIlIl[3]];
                    iArr23[lIlllIlIl[4]] = lIlllIlIl[6];
                    if (lIIlllIIlIIl(Inventory.getCount(iArr23), lIlllIlIl[3])) {
                        Bank.withdraw(lIlllIlIl[6], lIlllIlIl[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIlIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[lIlllIlIl[3]];
                            iArr24[lIlllIlIl[4]] = lIlllIlIl[6];
                            if (lIIlllIlIIlI(Inventory.getCount(iArr24))) {
                                ?? r0 = lIlllIlIl[3];
                                "".length();
                                return "  ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIlIl[4];
                        }, lIlllIlIl[99]);
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIlllIlIl[3]];
                iArr24[lIlllIlIl[4]] = lIlllIlIl[108];
                if (lIIlllIIlIll(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[lIlllIlIl[3]];
                    iArr25[lIlllIlIl[4]] = lIlllIlIl[108];
                    if (lIIlllIIllII(Inventory.contains(iArr25) ? 1 : 0)) {
                        Bank.withdraw(lIlllIlIl[108], lIlllIlIl[3], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIlIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr26 = new int[lIlllIlIl[3]];
                            iArr26[lIlllIlIl[4]] = lIlllIlIl[108];
                            return Inventory.contains(iArr26);
                        }, lIlllIlIl[99]);
                        "".length();
                    }
                }
                int[] iArr26 = new int[lIlllIlIl[3]];
                iArr26[lIlllIlIl[4]] = lIlllIlIl[8];
                if (lIIlllIIlIll(Bank.contains(iArr26) ? 1 : 0)) {
                    int[] iArr27 = new int[lIlllIlIl[3]];
                    iArr27[lIlllIlIl[4]] = lIlllIlIl[8];
                    if (lIIlllIIlIIl(Inventory.getCount(iArr27), lIlllIlIl[3])) {
                        Bank.withdrawAll(lIlllIlIl[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIlIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr28 = new int[lIlllIlIl[3]];
                            iArr28[lIlllIlIl[4]] = lIlllIlIl[8];
                            if (lIIlllIlIIlI(Inventory.getCount(iArr28))) {
                                ?? r0 = lIlllIlIl[3];
                                "".length();
                                return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIlIl[4];
                        }, lIlllIlIl[99]);
                        "".length();
                    }
                }
            }
        }
    }

    private static String lIIllIlIIIll(String llIIIlIlIllIll, String llIIIlIlIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIlIl[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIlIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlIlIlllII) {
            llIIIlIlIlllII.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIIlII() {
        lIlllIIII = new String[lIlllIlIl[174]];
        lIlllIIII[lIlllIlIl[4]] = lIIllIlIIIll("7U0OCu7jqt/ajWTMurYeUg==", "XkAXi");
        lIlllIIII[lIlllIlIl[3]] = lIIllIlIIlII("FxwMMz85EAZ6LiQMCzQrcRwWPyEiWUIpOzgBATIlPxJCOC0yHkIuI3EEFz8/JRwMPQ==", "QubZL");
        lIlllIIII[lIlllIlIl[1]] = lIIllIlIIlII("OyISByUQPhBGOhgy", "yPwfN");
        lIlllIIII[lIlllIlIl[12]] = lIIllIlIIIll("56CD2IImZAU=", "YSyLT");
        lIlllIIII[lIlllIlIl[15]] = lIIllIlIIlII("HyAcYxM+YRk3BiM1", "QAjCg");
        lIlllIIII[lIlllIlIl[13]] = lIIllIlIIlIl("n+MZy6FTPdY=", "xJOcn");
        lIlllIIII[lIlllIlIl[14]] = lIIllIlIIlIl("DPhxoCPlZ4w=", "VxCFt");
        lIlllIIII[lIlllIlIl[18]] = lIIllIlIIlIl("UKUoqD3naaurer/CQFbMZtJ4HY+uRk+cAvWxq5XtvKU=", "IhEDh");
        lIlllIIII[lIlllIlIl[20]] = lIIllIlIIlIl("ZrxC8g90xvA=", "VXduF");
        lIlllIIII[lIlllIlIl[21]] = lIIllIlIIlII("JgEmKSAcGyRoJxAM", "uuCHL");
        lIlllIIII[lIlllIlIl[22]] = lIIllIlIIlII("By0CJns+LAkoJA==", "KBmMV");
        lIlllIIII[lIlllIlIl[24]] = lIIllIlIIlIl("7GXg+eXRiw7VSlNdvvX89w==", "cYdkj");
        lIlllIIII[lIlllIlIl[25]] = lIIllIlIIlII("HwccPA==", "qrpPJ");
        lIlllIIII[lIlllIlIl[26]] = lIIllIlIIlII("Wg==", "zHguJ");
        lIlllIIII[lIlllIlIl[27]] = lIIllIlIIlII("IBs+YicBWiUjNAAfPGIxAQI=", "nzHBS");
        lIlllIIII[lIlllIlIl[28]] = lIIllIlIIlII("OxU6WQAaVCEYExsROFkWGgw=", "utLyt");
        lIlllIIII[lIlllIlIl[29]] = lIIllIlIIlII("Ki0CGxsIKhY=", "iXryt");
        lIlllIIII[lIlllIlIl[30]] = lIIllIlIIlII("MywqBjkAbSwOMAkoNQ==", "gMAoW");
        lIlllIIII[lIlllIlIl[31]] = lIIllIlIIlIl("D1r6XyAYolU=", "Pchjg");
        lIlllIIII[lIlllIlIl[32]] = lIIllIlIIlIl("FkKLpnaBRDU=", "oNDJd");
        lIlllIIII[lIlllIlIl[33]] = lIIllIlIIIll("kjFIR4min+o=", "fkSfy");
        lIlllIIII[lIlllIlIl[34]] = lIIllIlIIIll("NXH6yJl/Mpc=", "JoYBn");
        lIlllIIII[lIlllIlIl[35]] = lIIllIlIIlII("BwQONic8", "TaoDD");
        lIlllIIII[lIlllIlIl[36]] = lIIllIlIIlIl("jyQ2ibbT9iS7bk5r5+XIIw==", "kUPLf");
        lIlllIIII[lIlllIlIl[37]] = lIIllIlIIlIl("y4GCDTjN43w=", "nXKIf");
        lIlllIIII[lIlllIlIl[38]] = lIIllIlIIlIl("kssUBDUjJV8=", "YQSVj");
        lIlllIIII[lIlllIlIl[40]] = lIIllIlIIlII("JDYbVAYFdwAVFQQyGVQQBS8=", "jWmtr");
        lIlllIIII[lIlllIlIl[41]] = lIIllIlIIIll("AM5faQPgW63lBSPeyUwT2A==", "nebMn");
        lIlllIIII[lIlllIlIl[42]] = lIIllIlIIIll("xxIOUpI+2VYKJq6weE+0fw==", "lWshn");
        lIlllIIII[lIlllIlIl[43]] = lIIllIlIIIll("D3rCccyU5gE=", "dlpQG");
        lIlllIIII[lIlllIlIl[44]] = lIIllIlIIIll("nyrnhsSHINA=", "ExNXk");
        lIlllIIII[lIlllIlIl[45]] = lIIllIlIIIll("jCHeDfJoA6k=", "zKFeL");
        lIlllIIII[lIlllIlIl[46]] = lIIllIlIIIll("NYR5p7BwCDA=", "lQewv");
        lIlllIIII[lIlllIlIl[47]] = lIIllIlIIlII("Dz4AFgIiJAs=", "LQnbk");
        lIlllIIII[lIlllIlIl[48]] = lIIllIlIIIll("0Soj6pH2hzI=", "wbQvs");
        lIlllIIII[lIlllIlIl[49]] = lIIllIlIIIll("ZAX28hzRKZE=", "JNiVc");
        lIlllIIII[lIlllIlIl[50]] = lIIllIlIIlIl("mfR5QNhqCI1MzU7us/nRLBJ1ujoNz3cM", "woKmq");
        lIlllIIII[lIlllIlIl[51]] = lIIllIlIIlIl("kQl966+kxor4WTP4zvEpUw==", "CkJXJ");
        lIlllIIII[lIlllIlIl[52]] = lIIllIlIIlIl("yZLkN3sPJ14=", "NubMQ");
        lIlllIIII[lIlllIlIl[53]] = lIIllIlIIlII("HjUGKzdrJQcgNTgj", "KFoEP");
        lIlllIIII[lIlllIlIl[54]] = lIIllIlIIlIl("JKhZc7G1/Fs=", "gJBmt");
        lIlllIIII[lIlllIlIl[55]] = lIIllIlIIlII("AQEBJwYn", "BidBu");
        lIlllIIII[lIlllIlIl[56]] = lIIllIlIIlII("Bjc3JiordjQtMz0z", "NVYBF");
        lIlllIIII[lIlllIlIl[57]] = lIIllIlIIIll("TINSCWmABZfS44fXUazfZQ==", "WlErb");
        lIlllIIII[lIlllIlIl[61]] = lIIllIlIIlIl("3k+Te3gu/ND4RsncsgFEiOo6MlfIsEep", "BaqWG");
        lIlllIIII[lIlllIlIl[63]] = lIIllIlIIlIl("7T6TCdzJXyk=", "KJpFa");
        lIlllIIII[lIlllIlIl[64]] = lIIllIlIIIll("f9Dyg6x/BFWj+V7JYo12Ig==", "IKpTk");
        lIlllIIII[lIlllIlIl[65]] = lIIllIlIIIll("oW92aq7+mHP5Cnk/cCWCL6Kw3an7thP0", "nGrew");
        lIlllIIII[lIlllIlIl[66]] = lIIllIlIIlII("Cg0O", "OlzdF");
        lIlllIIII[lIlllIlIl[67]] = lIIllIlIIlII("MwYFGwceAFYcHhULGg==", "pgvon");
        lIlllIIII[lIlllIlIl[68]] = lIIllIlIIlII("MgcBNkkGGx02", "tnsSi");
        lIlllIIII[lIlllIlIl[69]] = lIIllIlIIlII("PDkTFEEIJQ8U", "zPaqa");
        lIlllIIII[lIlllIlIl[70]] = lIIllIlIIlII("NSUHHA==", "wDkpd");
        lIlllIIII[lIlllIlIl[71]] = lIIllIlIIlIl("T08K7AMicuY=", "RDjig");
        lIlllIIII[lIlllIlIl[72]] = lIIllIlIIlII("MDcTMwkDdho7Cwg=", "dVxZg");
        lIlllIIII[lIlllIlIl[73]] = lIIllIlIIIll("r+aelRtltY4=", "SAMBC");
        lIlllIIII[lIlllIlIl[74]] = lIIllIlIIlII("EgQKAw==", "Pefoz");
        lIlllIIII[lIlllIlIl[75]] = lIIllIlIIlIl("flZ27s1oxxAQUOBgfBnQiw==", "zBSIc");
        lIlllIIII[lIlllIlIl[76]] = lIIllIlIIlIl("tCjyQf56WD8=", "olEtA");
        lIlllIIII[lIlllIlIl[77]] = lIIllIlIIlIl("SAoQ+AfZY2Lc7sqMSyxhpWJMYdbxZpBm", "SldQS");
        lIlllIIII[lIlllIlIl[78]] = lIIllIlIIlII("MC8/FA4KPW0TCUQrOB8UEA==", "dZMzg");
        lIlllIIII[lIlllIlIl[79]] = lIIllIlIIIll("YOPIliSPmT8=", "FEDTH");
        lIlllIIII[lIlllIlIl[80]] = lIIllIlIIlII("JwcODRM=", "cugcx");
        lIlllIIII[lIlllIlIl[81]] = lIIllIlIIlII("IDYGFBwMNhVRAwQiFw==", "eXrqn");
        lIlllIIII[lIlllIlIl[83]] = lIIllIlIIlII("DwwASAUuTRABAzIZVhsBLhk=", "Amvhq");
        lIlllIIII[lIlllIlIl[84]] = lIIllIlIIlIl("aNzquDRuk/iASqgGapGNE+tKafGnHkOO", "RrBID");
        lIlllIIII[lIlllIlIl[85]] = lIIllIlIIIll("QPYHTQYZbIHbHt1U332fUf+l4204gF1/", "rAjTd");
        lIlllIIII[lIlllIlIl[86]] = lIIllIlIIIll("w1ASPD1suWxebC0F/onuaA==", "vtTPA");
        lIlllIIII[lIlllIlIl[87]] = lIIllIlIIIll("gF+qFokFyuHd3UFEbcuu7w==", "pgJCD");
        lIlllIIII[lIlllIlIl[88]] = lIIllIlIIlIl("m24+uFQ+vOoroOEavh4flQ==", "jTgDI");
        lIlllIIII[lIlllIlIl[89]] = lIIllIlIIlII("LgQ2JQk=", "mlSFb");
        lIlllIIII[lIlllIlIl[90]] = lIIllIlIIlII("MCUpOy0dPyI=", "sJGOD");
        lIlllIIII[lIlllIlIl[91]] = lIIllIlIIIll("kWW8D8stbqA=", "THlgy");
        lIlllIIII[lIlllIlIl[92]] = lIIllIlIIIll("OS3rx8vZlm8=", "oCMCE");
        lIlllIIII[lIlllIlIl[95]] = lIIllIlIIlIl("nmiYxZTphKV73GZuQWJVOKqDQh39pMWn", "hRCVb");
        lIlllIIII[lIlllIlIl[96]] = lIIllIlIIIll("DHIdoYgHg5RSyMpXqtVAC0laEPfvJt4H", "HEltc");
        lIlllIIII[lIlllIlIl[97]] = lIIllIlIIIll("Bv2mwCen28QGG8giikYgEwuqhMYPKK1z", "PGBEc");
        lIlllIIII[lIlllIlIl[98]] = lIIllIlIIIll("JDyQnsaA58wluwPizb5H8w==", "EAduI");
        lIlllIIII[lIlllIlIl[100]] = lIIllIlIIIll("q4bn20IBT946BZtEO+06OkR9raf23MFr", "ETfxV");
        lIlllIIII[lIlllIlIl[102]] = lIIllIlIIIll("NuzPa+foUkmrhcU6hcFZu+dw90mGfEqRWVZNRW8LZkgfqc0skIv14pbo/B83rVcg", "sdDvX");
        lIlllIIII[lIlllIlIl[16]] = lIIllIlIIlII("ERNVOQQjVhgxBTUfGz9WNQMFKBovEwZ0VjUBHCwVLh8bP1YyGVUaIx8/Ox8=", "FvuXv");
        lIlllIIII[lIlllIlIl[103]] = lIIllIlIIIll("MRsbOFDFcIPKgeQ3WFIo28k7nfoDzeCaOCjVqHtdGKmcQRCIKmKW+eMVGunnFUN+", "WfUHv");
        lIlllIIII[lIlllIlIl[104]] = lIIllIlIIIll("PyifZ/Ms1RLTdVbXXgityTC7amQPd9+pY26me+IUJEQttVpWxC4eOyQrYbgqi3Sy", "DRwsj");
        lIlllIIII[lIlllIlIl[106]] = lIIllIlIIlIl("6OKbhZNo5yK0MlLBCUBcS3RwokeN54leuh4XGGZ79a1MFMvwNvUi/vrwr0bunaiQ", "pEZHX");
        lIlllIIII[lIlllIlIl[116]] = lIIllIlIIlIl("Fhq/Nc54Um4NICxggGv77TGDoQsTsBtQ", "EPPyO");
        lIlllIIII[lIlllIlIl[117]] = lIIllIlIIIll("yZbfkF3PGV07oEUGqdpRbiBJPtT4WBOc", "grnJQ");
        lIlllIIII[lIlllIlIl[163]] = lIIllIlIIIll("escd2Vch6APUmtI0/xjjFg==", "WjUGv");
        lIlllIIII[lIlllIlIl[164]] = lIIllIlIIIll("SrLHAOtf8bwDdb7Z/WjRY9rzbWzij7MY", "sfNtO");
        lIlllIIII[lIlllIlIl[165]] = lIIllIlIIlII("GWEnHk0kNDJc", "PFKrm");
        lIlllIIII[lIlllIlIl[166]] = lIIllIlIIlIl("ZFYIkiXVYlLMIPOoST/tpoA8oW1N5S9G5JcWCuqrG10ZFfRXa4n57nhMAKsQ2CCZ", "SrQLa");
        lIlllIIII[lIlllIlIl[167]] = lIIllIlIIlII("GhI+bw==", "CwMAB");
        lIlllIIII[lIlllIlIl[168]] = lIIllIlIIlII("FjIVLFcyegAwFWE3FSwEJChL", "AZtXp");
        lIlllIIII[lIlllIlIl[169]] = lIIllIlIIlII("GgBIWCJyBwhYGDAORA8DNB9EMUs2CgpYDzpF", "Ukdxk");
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlllIIII[lIlllIlIl[116]];
    }

    private static void lIIlllIIlIII() {
        lIlllIlIl = new int[175];
        lIlllIlIl[0] = ((73 + 118) - 47) + 16;
        lIlllIlIl[1] = "  ".length();
        lIlllIlIl[2] = (((((98 + 191) - 150) + 81) + (65 ^ 68)) - (67 ^ 54)) + (118 ^ 0);
        lIlllIlIl[3] = " ".length();
        lIlllIlIl[4] = ((30 ^ 74) ^ (45 ^ 27)) & (((42 ^ 37) ^ (93 ^ 48)) ^ (-" ".length()));
        lIlllIlIl[5] = (-((-16995) & 31735)) & (-17473) & 32767;
        lIlllIlIl[6] = (-28819) & 29375;
        lIlllIlIl[7] = (-1282) & 1839;
        lIlllIlIl[8] = (-((-1067) & 19503)) & (-9857) & 28671;
        lIlllIlIl[9] = (-22529) & 24513;
        lIlllIlIl[10] = (-16435) & 24443;
        lIlllIlIl[11] = ((86 + 115) - 76) + 25;
        lIlllIlIl[12] = "   ".length();
        lIlllIlIl[13] = 60 ^ 57;
        lIlllIlIl[14] = (163 ^ 171) ^ (97 ^ 111);
        lIlllIlIl[15] = 7 ^ 3;
        lIlllIlIl[16] = (((73 + 88) - 30) + 18) ^ (((31 + 173) - 12) + 5);
        lIlllIlIl[17] = (-5761) & 8169;
        lIlllIlIl[18] = 134 ^ 129;
        lIlllIlIl[19] = (-4097) & 6963;
        lIlllIlIl[20] = 37 ^ 45;
        lIlllIlIl[21] = 132 ^ 141;
        lIlllIlIl[22] = (225 ^ 197) ^ (138 ^ 164);
        lIlllIlIl[23] = ((59 + 16) - (-120)) + 34;
        lIlllIlIl[24] = (((12 + 109) - 37) + 57) ^ (((32 + 81) - 70) + 91);
        lIlllIlIl[25] = (98 ^ 103) ^ (144 ^ 153);
        lIlllIlIl[26] = 58 ^ 55;
        lIlllIlIl[27] = 90 ^ 84;
        lIlllIlIl[28] = 111 ^ 96;
        lIlllIlIl[29] = (((32 + 83) - (-23)) + 42) ^ (((49 + 110) - 104) + 109);
        lIlllIlIl[30] = (243 ^ 198) ^ (189 ^ 153);
        lIlllIlIl[31] = (((92 + 76) - 54) + 56) ^ (((159 + 173) - 328) + 180);
        lIlllIlIl[32] = 137 ^ 154;
        lIlllIlIl[33] = (((172 + 57) - 169) + 115) ^ (((108 + 34) - 65) + 110);
        lIlllIlIl[34] = 75 ^ 94;
        lIlllIlIl[35] = 116 ^ 98;
        lIlllIlIl[36] = 128 ^ 151;
        lIlllIlIl[37] = (((198 + 144) - 332) + 206) ^ (((59 + 183) - 241) + 191);
        lIlllIlIl[38] = 127 ^ 102;
        lIlllIlIl[39] = (-17) & 2426;
        lIlllIlIl[40] = (((161 + 67) - 144) + 91) ^ (((66 + 162) - 215) + 168);
        lIlllIlIl[41] = (((42 + 28) - (-56)) + 51) ^ (((130 + 80) - 131) + 91);
        lIlllIlIl[42] = (125 ^ 76) ^ (158 ^ 179);
        lIlllIlIl[43] = 52 ^ 41;
        lIlllIlIl[44] = (((7 + 85) - 49) + 85) ^ (((30 + 111) - 51) + 68);
        lIlllIlIl[45] = (((77 + 132) - 160) + 174) ^ (((177 + 97) - 268) + 186);
        lIlllIlIl[46] = (((145 + 106) - 135) + 64) ^ (((13 + 6) - (-14)) + 115);
        lIlllIlIl[47] = (((86 + 80) - 158) + 180) ^ (((62 + 91) - 50) + 54);
        lIlllIlIl[48] = (145 ^ 163) ^ (128 ^ 144);
        lIlllIlIl[49] = (58 ^ 49) ^ (90 ^ 114);
        lIlllIlIl[50] = (((79 + 71) - 89) + 72) ^ (((37 + 34) - (-62)) + 28);
        lIlllIlIl[51] = 14 ^ 43;
        lIlllIlIl[52] = 188 ^ 154;
        lIlllIlIl[53] = 153 ^ 190;
        lIlllIlIl[54] = 69 ^ 109;
        lIlllIlIl[55] = (66 ^ 124) ^ (39 ^ 48);
        lIlllIlIl[56] = (128 ^ 191) ^ (214 ^ 195);
        lIlllIlIl[57] = (((27 + 13) - (-178)) + 16) ^ (((147 + 177) - 200) + 69);
        lIlllIlIl[58] = (-29729) & 32629;
        lIlllIlIl[59] = (-548) & 4007;
        lIlllIlIl[60] = (-20993) & 23403;
        lIlllIlIl[61] = (221 ^ 161) ^ (203 ^ 155);
        lIlllIlIl[62] = (-((-10293) & 31933)) & (-1) & 24573;
        lIlllIlIl[63] = (182 ^ 146) ^ (47 ^ 38);
        lIlllIlIl[64] = 167 ^ 137;
        lIlllIlIl[65] = (((71 + 6) - (-41)) + 69) ^ (((121 + 10) - 23) + 40);
        lIlllIlIl[66] = 128 ^ 176;
        lIlllIlIl[67] = 31 ^ 46;
        lIlllIlIl[68] = (205 ^ 185) ^ (65 ^ 7);
        lIlllIlIl[69] = 44 ^ 31;
        lIlllIlIl[70] = (((147 + 13) - 148) + 144) ^ (((129 + 124) - 99) + 14);
        lIlllIlIl[71] = 43 ^ 30;
        lIlllIlIl[72] = (111 ^ 57) ^ (118 ^ 22);
        lIlllIlIl[73] = 59 ^ 12;
        lIlllIlIl[74] = 104 ^ 80;
        lIlllIlIl[75] = 24 ^ 33;
        lIlllIlIl[76] = (((134 + 60) - 111) + 54) ^ (((151 + 50) - 183) + 161);
        lIlllIlIl[77] = 141 ^ 182;
        lIlllIlIl[78] = 66 ^ 126;
        lIlllIlIl[79] = 55 ^ 10;
        lIlllIlIl[80] = (((65 + 94) - 25) + 16) ^ (((59 + 122) - 167) + 154);
        lIlllIlIl[81] = (80 ^ 54) ^ (13 ^ 84);
        lIlllIlIl[82] = (-16485) & 20479;
        lIlllIlIl[83] = 34 ^ 98;
        lIlllIlIl[84] = (4 ^ 101) ^ (143 ^ 175);
        lIlllIlIl[85] = 10 ^ 72;
        lIlllIlIl[86] = 112 ^ 51;
        lIlllIlIl[87] = 119 ^ 51;
        lIlllIlIl[88] = 106 ^ 47;
        lIlllIlIl[89] = 195 ^ 133;
        lIlllIlIl[90] = 207 ^ 136;
        lIlllIlIl[91] = (44 ^ 48) ^ (250 ^ 174);
        lIlllIlIl[92] = 236 ^ 165;
        lIlllIlIl[93] = (-((-1377) & 25957)) & (-5249) & 32741;
        lIlllIlIl[94] = (-4709) & 8174;
        lIlllIlIl[95] = (((57 + 31) - (-75)) + 33) ^ (((124 + 52) - 93) + 59);
        lIlllIlIl[96] = (218 ^ 186) ^ (233 ^ 194);
        lIlllIlIl[97] = (81 ^ 110) ^ (35 ^ 80);
        lIlllIlIl[98] = 227 ^ 174;
        lIlllIlIl[99] = (-19512) & 24511;
        lIlllIlIl[100] = 100 ^ 42;
        lIlllIlIl[101] = (-((-2953) & 32654)) & (-2051) & 32751;
        lIlllIlIl[102] = (94 ^ 76) ^ (112 ^ 45);
        lIlllIlIl[103] = 35 ^ 114;
        lIlllIlIl[104] = 147 ^ 193;
        lIlllIlIl[105] = (-((-3279) & 27871)) & (-41) & 32639;
        lIlllIlIl[106] = (((194 + 169) - 272) + 152) ^ (((112 + 89) - 164) + 123);
        lIlllIlIl[107] = (-3587) & 4086;
        lIlllIlIl[108] = (-7) & 12631;
        lIlllIlIl[109] = 73 ^ 45;
        lIlllIlIl[110] = (-28173) & 28572;
        lIlllIlIl[111] = (-((-858) & 12123)) & (-1) & 16375;
        lIlllIlIl[112] = (-((-10830) & 15215)) & (-3) & 16367;
        lIlllIlIl[113] = (-14612) & 31611;
        lIlllIlIl[114] = (-18564) & 20463;
        lIlllIlIl[115] = (-28687) & 30686;
        lIlllIlIl[116] = (164 ^ 162) ^ (255 ^ 173);
        lIlllIlIl[117] = (68 ^ 43) ^ (118 ^ 76);
        lIlllIlIl[118] = (-6162) & 7637;
        lIlllIlIl[119] = (-6721) & 8190;
        lIlllIlIl[120] = (-((-963) & 27603)) & (-553) & 28664;
        lIlllIlIl[121] = (-((-3683) & 16119)) & (-66) & 13055;
        lIlllIlIl[122] = (-33) & 1506;
        lIlllIlIl[123] = (-25619) & 28534;
        lIlllIlIl[124] = (-((-4609) & 21111)) & (-12289) & 32254;
        lIlllIlIl[125] = (-9233) & 12151;
        lIlllIlIl[126] = (-29866) & 32765;
        lIlllIlIl[127] = (-((-18439) & 22639)) & (-5) & 7663;
        lIlllIlIl[128] = (-24597) & 27511;
        lIlllIlIl[129] = (-((-2050) & 22663)) & (-1025) & 24567;
        lIlllIlIl[130] = (-21106) & 24563;
        lIlllIlIl[131] = (-((-3009) & 28649)) & (-1) & 28542;
        lIlllIlIl[132] = (-521) & 3981;
        lIlllIlIl[133] = (-3) & 2919;
        lIlllIlIl[134] = (-((-8004) & 32715)) & (-1033) & 28655;
        lIlllIlIl[135] = (-633) & 4095;
        lIlllIlIl[136] = (-((-9495) & 30111)) & (-33) & 23551;
        lIlllIlIl[137] = (-((-3257) & 7355)) & (-137) & 7163;
        lIlllIlIl[138] = (-21) & 3124;
        lIlllIlIl[139] = (-16385) & 19547;
        lIlllIlIl[140] = (-4241) & 7167;
        lIlllIlIl[141] = (-((-18563) & 19075)) & (-24705) & 28671;
        lIlllIlIl[142] = (-1153) & 4088;
        lIlllIlIl[143] = (-28777) & 31742;
        lIlllIlIl[144] = (-8267) & 11647;
        lIlllIlIl[145] = (-29737) & 32635;
        lIlllIlIl[146] = (-((-1089) & 18019)) & (-8205) & 28607;
        lIlllIlIl[147] = (-21543) & 24447;
        lIlllIlIl[148] = (-4645) & 8119;
        lIlllIlIl[149] = (-((-978) & 29683)) & (-129) & 31739;
        lIlllIlIl[150] = (-2315) & 12190;
        lIlllIlIl[151] = (-4390) & 14263;
        lIlllIlIl[152] = (-107) & 9979;
        lIlllIlIl[153] = (-4183) & 7647;
        lIlllIlIl[154] = (-((-18207) & 22463)) & (-9217) & 16383;
        lIlllIlIl[155] = (-16963) & 20431;
        lIlllIlIl[156] = (-25601) & 28507;
        lIlllIlIl[157] = (-((-7298) & 16077)) & (-33) & 12287;
        lIlllIlIl[158] = (-6433) & 16302;
        lIlllIlIl[159] = (-24579) & 27487;
        lIlllIlIl[160] = (-4171) & 14047;
        lIlllIlIl[161] = (-((-10251) & 27643)) & (-13) & 32767;
        lIlllIlIl[162] = (-8265) & 13387;
        lIlllIlIl[163] = 55 ^ 97;
        lIlllIlIl[164] = 76 ^ 27;
        lIlllIlIl[165] = (19 ^ 35) ^ (81 ^ 57);
        lIlllIlIl[166] = 44 ^ 117;
        lIlllIlIl[167] = (60 ^ 32) ^ (2 ^ 68);
        lIlllIlIl[168] = 83 ^ 8;
        lIlllIlIl[169] = (34 ^ 60) ^ (248 ^ 186);
        lIlllIlIl[170] = (-4130) & 8125;
        lIlllIlIl[171] = (-((-2073) & 10363)) & (-4097) & 16383;
        lIlllIlIl[172] = (-((-2329) & 31066)) & (-1) & 32735;
        lIlllIlIl[173] = (-((-13705) & 30089)) & (-12385) & 32767;
        lIlllIlIl[174] = (104 ^ 65) ^ (56 ^ 76);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x010f, code lost:
        if (lIIlllIIlIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.G.lIlllIlIl[13]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0217, code lost:
        if (lIIlllIIlIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.G.lIlllIlIl[22]) != false) goto L49;
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
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[lIlllIlIl[3]];
        iArr7[lIlllIlIl[4]] = lIlllIlIl[8];
        if (lIIlllIIllII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlIl[8], lIlllIlIl[109], lIlllIlIl[110]));
            "".length();
        }
        int[] iArr8 = new int[lIlllIlIl[3]];
        iArr8[lIlllIlIl[4]] = lIlllIlIl[8];
        if (lIIlllIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIlllIlIl[3]];
            iArr9[lIlllIlIl[4]] = lIlllIlIl[8];
            if (lIIlllIIlIIl(Bank.getFirst(iArr9).getQuantity(), lIlllIlIl[33])) {
                bv.add(new C0003d(lIlllIlIl[8], lIlllIlIl[54], lIlllIlIl[110]));
                "".length();
            }
        }
        int[] iArr10 = new int[lIlllIlIl[3]];
        iArr10[lIlllIlIl[4]] = lIlllIlIl[9];
        if (lIIlllIIlIll(Bank.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[lIlllIlIl[3]];
            iArr11[lIlllIlIl[4]] = lIlllIlIl[9];
            if (lIIlllIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlllIlIl[3]];
                iArr12[lIlllIlIl[4]] = lIlllIlIl[9];
            }
            if (lIIlllIIllII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIlllIIII[lIlllIlIl[117]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlIl[112], lIlllIlIl[31], lIlllIlIl[113]));
                "".length();
            }
            iArr = new int[lIlllIlIl[3]];
            iArr[lIlllIlIl[4]] = lIlllIlIl[105];
            if (lIIlllIIllII(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlIl[105], lIlllIlIl[54], lIlllIlIl[114]));
                "".length();
            }
            iArr2 = new int[lIlllIlIl[3]];
            iArr2[lIlllIlIl[4]] = lIlllIlIl[10];
            if (lIIlllIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr13 = new int[lIlllIlIl[3]];
                iArr13[lIlllIlIl[4]] = lIlllIlIl[10];
                if (lIIlllIIlIll(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[lIlllIlIl[3]];
                    iArr14[lIlllIlIl[4]] = lIlllIlIl[10];
                }
                iArr3 = new int[lIlllIlIl[3]];
                iArr3[lIlllIlIl[4]] = lIlllIlIl[108];
                if (lIIlllIIllII(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0003d(lIlllIlIl[108], lIlllIlIl[13], C0008i.bq));
                    "".length();
                }
                iArr4 = new int[lIlllIlIl[3]];
                iArr4[lIlllIlIl[4]] = lIlllIlIl[7];
                if (lIIlllIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr15 = new int[lIlllIlIl[3]];
                    iArr15[lIlllIlIl[4]] = lIlllIlIl[7];
                    if (lIIlllIIlIIl(Bank.getFirst(iArr15).getQuantity(), lIlllIlIl[101])) {
                        bv.add(new C0003d(lIlllIlIl[7], lIlllIlIl[115], lIlllIlIl[18]));
                        "".length();
                    }
                }
                iArr5 = new int[lIlllIlIl[3]];
                iArr5[lIlllIlIl[4]] = lIlllIlIl[5];
                if (lIIlllIIlIll(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr16 = new int[lIlllIlIl[3]];
                    iArr16[lIlllIlIl[4]] = lIlllIlIl[5];
                    if (lIIlllIIlIIl(Bank.getFirst(iArr16).getQuantity(), lIlllIlIl[101])) {
                        bv.add(new C0003d(lIlllIlIl[5], lIlllIlIl[115], lIlllIlIl[18]));
                        "".length();
                    }
                }
                iArr6 = new int[lIlllIlIl[3]];
                iArr6[lIlllIlIl[4]] = lIlllIlIl[6];
                if (lIIlllIIlIll(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[lIlllIlIl[3]];
                    iArr17[lIlllIlIl[4]] = lIlllIlIl[6];
                    if (lIIlllIIlIIl(Bank.getFirst(iArr17).getQuantity(), lIlllIlIl[101])) {
                        bv.add(new C0003d(lIlllIlIl[6], lIlllIlIl[115], lIlllIlIl[18]));
                        "".length();
                        return;
                    }
                    return;
                }
                return;
            }
            bv.add(new C0003d(lIlllIlIl[10], lIlllIlIl[33], lIlllIlIl[114]));
            "".length();
            iArr3 = new int[lIlllIlIl[3]];
            iArr3[lIlllIlIl[4]] = lIlllIlIl[108];
            if (lIIlllIIllII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[lIlllIlIl[3]];
            iArr4[lIlllIlIl[4]] = lIlllIlIl[7];
            if (lIIlllIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIlllIlIl[3]];
            iArr5[lIlllIlIl[4]] = lIlllIlIl[5];
            if (lIIlllIIlIll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIlllIlIl[3]];
            iArr6[lIlllIlIl[4]] = lIlllIlIl[6];
            if (lIIlllIIlIll(Bank.contains(iArr6) ? 1 : 0)) {
            }
        }
        bv.add(new C0003d(lIlllIlIl[9], lIlllIlIl[13], lIlllIlIl[111]));
        "".length();
        if (lIIlllIIllII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIlllIIII[lIlllIlIl[117]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIlllIlIl[3]];
        iArr[lIlllIlIl[4]] = lIlllIlIl[105];
        if (lIIlllIIllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIlllIlIl[3]];
        iArr2[lIlllIlIl[4]] = lIlllIlIl[10];
        if (lIIlllIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIlllIlIl[10], lIlllIlIl[33], lIlllIlIl[114]));
        "".length();
        iArr3 = new int[lIlllIlIl[3]];
        iArr3[lIlllIlIl[4]] = lIlllIlIl[108];
        if (lIIlllIIllII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIlllIlIl[3]];
        iArr4[lIlllIlIl[4]] = lIlllIlIl[7];
        if (lIIlllIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIlllIlIl[3]];
        iArr5[lIlllIlIl[4]] = lIlllIlIl[5];
        if (lIIlllIIlIll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIlllIlIl[3]];
        iArr6[lIlllIlIl[4]] = lIlllIlIl[6];
        if (lIIlllIIlIll(Bank.contains(iArr6) ? 1 : 0)) {
        }
    }

    private static boolean lIIlllIIllII(int i) {
        return i == 0;
    }

    private static boolean lIIlllIIllll(Object obj) {
        return obj != null;
    }

    static {
        lIIlllIIlIII();
        lIIlllIIIlII();
        hJ = lIlllIlIl[12];
        hN = lIlllIlIl[17];
        hF = lIlllIlIl[1];
        hM = lIlllIlIl[82];
        hG = lIlllIlIl[2];
        hL = lIlllIlIl[18];
        hQ = lIlllIlIl[19];
        hK = lIlllIlIl[14];
        in = lIlllIlIl[118];
        hH = lIlllIlIl[3];
        ik = lIlllIlIl[119];
        il = lIlllIlIl[120];
        it = lIlllIlIl[9];
        ir = lIlllIlIl[121];
        hE = lIlllIlIl[0];
        hI = lIlllIlIl[1];
        hP = lIlllIlIl[39];
        ip = lIlllIlIl[5];
        is = lIlllIlIl[8];
        im = lIlllIlIl[122];
        hO = lIlllIlIl[60];
        io = lIlllIlIl[7];
        iq = lIlllIlIl[6];
        ht = new WorldPoint(lIlllIlIl[123], lIlllIlIl[59], lIlllIlIl[4]);
        hu = new WorldPoint(lIlllIlIl[62], lIlllIlIl[124], lIlllIlIl[4]);
        hv = new WorldPoint(lIlllIlIl[125], lIlllIlIl[94], lIlllIlIl[4]);
        hw = new WorldArea(lIlllIlIl[126], lIlllIlIl[127], lIlllIlIl[31], lIlllIlIl[14], lIlllIlIl[4]);
        hx = new WorldArea(lIlllIlIl[128], lIlllIlIl[127], lIlllIlIl[30], lIlllIlIl[14], lIlllIlIl[4]);
        hy = new WorldArea(lIlllIlIl[129], lIlllIlIl[130], lIlllIlIl[15], lIlllIlIl[22], lIlllIlIl[4]);
        hz = new WorldArea(lIlllIlIl[131], lIlllIlIl[132], lIlllIlIl[24], lIlllIlIl[15], lIlllIlIl[4]);
        hA = new WorldArea(lIlllIlIl[133], lIlllIlIl[132], lIlllIlIl[18], lIlllIlIl[13], lIlllIlIl[4]);
        hB = new WorldArea(lIlllIlIl[134], lIlllIlIl[135], lIlllIlIl[21], lIlllIlIl[18], lIlllIlIl[4]);
        hC = new WorldArea(lIlllIlIl[136], lIlllIlIl[132], lIlllIlIl[15], lIlllIlIl[15], lIlllIlIl[4]);
        hD = new WorldArea(lIlllIlIl[137], lIlllIlIl[132], lIlllIlIl[15], lIlllIlIl[13], lIlllIlIl[4]);
        hR = new WorldPoint(lIlllIlIl[138], lIlllIlIl[139], lIlllIlIl[1]);
        hS = new WorldPoint(lIlllIlIl[140], lIlllIlIl[141], lIlllIlIl[4]);
        hT = new WorldPoint(lIlllIlIl[142], lIlllIlIl[127], lIlllIlIl[4]);
        hU = new WorldPoint(lIlllIlIl[143], lIlllIlIl[144], lIlllIlIl[4]);
        hV = new WorldPoint(lIlllIlIl[145], lIlllIlIl[146], lIlllIlIl[4]);
        hW = new WorldPoint(lIlllIlIl[131], lIlllIlIl[94], lIlllIlIl[4]);
        hX = new WorldPoint(lIlllIlIl[147], lIlllIlIl[148], lIlllIlIl[4]);
        hY = new WorldPoint(lIlllIlIl[149], lIlllIlIl[150], lIlllIlIl[4]);
        hZ = new WorldPoint(lIlllIlIl[145], lIlllIlIl[151], lIlllIlIl[4]);
        ia = new WorldPoint(lIlllIlIl[131], lIlllIlIl[151], lIlllIlIl[4]);
        ib = new WorldPoint(lIlllIlIl[131], lIlllIlIl[152], lIlllIlIl[4]);
        ic = new WorldPoint(lIlllIlIl[136], lIlllIlIl[151], lIlllIlIl[4]);
        id = new WorldPoint(lIlllIlIl[136], lIlllIlIl[152], lIlllIlIl[4]);
        ie = new WorldPoint(lIlllIlIl[58], lIlllIlIl[153], lIlllIlIl[4]);
        f0if = new WorldPoint(lIlllIlIl[62], lIlllIlIl[135], lIlllIlIl[4]);
        ig = new WorldPoint(lIlllIlIl[154], lIlllIlIl[155], lIlllIlIl[4]);
        ih = new WorldArea(new WorldPoint(lIlllIlIl[156], lIlllIlIl[157], lIlllIlIl[4]), new WorldPoint(lIlllIlIl[58], lIlllIlIl[94], lIlllIlIl[4]));
        ii = new WorldArea(new WorldPoint(lIlllIlIl[145], lIlllIlIl[158], lIlllIlIl[4]), new WorldPoint(lIlllIlIl[159], lIlllIlIl[160], lIlllIlIl[4]));
        ij = new WorldArea(lIlllIlIl[62], lIlllIlIl[130], lIlllIlIl[14], lIlllIlIl[22], lIlllIlIl[4]);
        bv = new ArrayList();
        iu = lIlllIlIl[161];
        iv = lIlllIlIl[162];
        iw = lIlllIIII[lIlllIlIl[163]];
        String[] strArr = new String[lIlllIlIl[14]];
        strArr[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[164]];
        strArr[lIlllIlIl[3]] = lIlllIIII[lIlllIlIl[165]];
        strArr[lIlllIlIl[1]] = lIlllIIII[lIlllIlIl[166]];
        strArr[lIlllIlIl[12]] = lIlllIIII[lIlllIlIl[167]];
        strArr[lIlllIlIl[15]] = lIlllIIII[lIlllIlIl[168]];
        strArr[lIlllIlIl[13]] = lIlllIIII[lIlllIlIl[169]];
        hl = strArr;
        int[] iArr = new int[lIlllIlIl[15]];
        iArr[lIlllIlIl[4]] = lIlllIlIl[170];
        iArr[lIlllIlIl[3]] = lIlllIlIl[171];
        iArr[lIlllIlIl[1]] = lIlllIlIl[172];
        iArr[lIlllIlIl[12]] = lIlllIlIl[173];
        ix = iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIlllIlIIIl(C0004e.j(lIlllIlIl[2]), lIlllIlIl[18])) {
            ?? r0 = lIlllIlIl[3];
            "".length();
            return "  ".length() == ((14 ^ 33) ^ (149 ^ 190)) ? ((((235 + 69) - 297) + 242) ^ (((77 + 150) - 82) + 50)) & (((255 ^ 149) ^ (123 ^ 43)) ^ (-" ".length())) : r0;
        }
        return lIlllIlIl[4];
    }

    private static boolean lIIlllIIllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlllIlIIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0b04, code lost:
        if (lIIlllIIllIl(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.G.f0if), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.G.lIlllIlIl[12]) != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0d70, code lost:
        if (lIIlllIIllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0d9a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017a  */
    /* JADX WARN: Type inference failed for: r0v649, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bN() {
        if (lIIlllIIlIIl(C0004e.j(lIlllIlIl[0]), lIlllIlIl[1])) {
            try {
                P.ct();
                "".length();
                if ((-(29 ^ 25)) > 0) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (lIIlllIIlIlI(C0004e.j(lIlllIlIl[0]), lIlllIlIl[1]) && lIIlllIIlIIl(C0004e.j(lIlllIlIl[2]), lIlllIlIl[3])) {
            if (lIIlllIIlIll(bt ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[4]];
                C0001b.a(bv);
                if (lIIlllIIlIIl(bv.size(), lIlllIlIl[3])) {
                    System.out.println(lIlllIIII[lIlllIlIl[3]]);
                    bt = lIlllIlIl[4];
                }
            }
            do {
                if (lIIlllIIlIll(C0025z.bi() ? 1 : 0)) {
                    int[] iArr = new int[lIlllIlIl[3]];
                    iArr[lIlllIlIl[4]] = lIlllIlIl[5];
                    if (lIIlllIIlIll(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIlllIlIl[3]];
                        iArr2[lIlllIlIl[4]] = lIlllIlIl[6];
                        if (lIIlllIIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIlllIlIl[3]];
                            iArr3[lIlllIlIl[4]] = lIlllIlIl[7];
                            if (lIIlllIIlIll(Inventory.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIlllIlIl[3]];
                                iArr4[lIlllIlIl[4]] = lIlllIlIl[8];
                                if (lIIlllIIlIll(Inventory.contains(iArr4) ? 1 : 0)) {
                                    int[] iArr5 = new int[lIlllIlIl[3]];
                                    iArr5[lIlllIlIl[4]] = lIlllIlIl[9];
                                    if (lIIlllIIlIll(Inventory.contains(iArr5) ? 1 : 0)) {
                                        int[] iArr6 = new int[lIlllIlIl[3]];
                                        iArr6[lIlllIlIl[4]] = lIlllIlIl[10];
                                        if (!lIIlllIIllII(Inventory.contains(iArr6) ? 1 : 0)) {
                                            if (lIIlllIIllII(bt ? 1 : 0)) {
                                                if (lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[11])) {
                                                    int[] iArr7 = new int[lIlllIlIl[3]];
                                                    iArr7[lIlllIlIl[4]] = lIlllIlIl[10];
                                                    if (lIIlllIIlIll(Inventory.contains(iArr7) ? 1 : 0)) {
                                                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[1]];
                                                        int[] iArr8 = new int[lIlllIlIl[3]];
                                                        iArr8[lIlllIlIl[4]] = lIlllIlIl[10];
                                                        Inventory.getFirst(iArr8).interact(lIlllIIII[lIlllIlIl[12]]);
                                                        Time.sleepTicks(lIlllIlIl[13]);
                                                        "".length();
                                                    }
                                                }
                                                if (lIIlllIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[11]) && lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[14])) {
                                                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[15]];
                                                    if (lIIlllIIlIll(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIlllIIlIIl(Movement.getRunEnergy(), lIlllIlIl[16])) {
                                                        Inventory.getFirst(C0005f.aV).interact(lIlllIIII[lIlllIlIl[13]]);
                                                        Time.sleepTicks(lIlllIlIl[3]);
                                                        "".length();
                                                    }
                                                    Movement.walkTo(hS);
                                                    "".length();
                                                    Time.sleepTicks(lIlllIlIl[3]);
                                                    "".length();
                                                }
                                                if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[14])) {
                                                    C0006g.a(lIlllIIII[lIlllIlIl[14]], hl);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    bP();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                    "".length();
                } else if (lIIlllIIllII(bt ? 1 : 0)) {
                }
            } while (0 == 0);
            return;
        }
        if (lIIlllIIlIlI(C0004e.j(lIlllIlIl[0]), lIlllIlIl[1]) && lIIlllIIlIlI(C0004e.j(lIlllIlIl[2]), lIlllIlIl[3])) {
            if (lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hV), lIlllIlIl[15]) && lIIlllIIllII(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] iArr9 = new int[lIlllIlIl[3]];
                iArr9[lIlllIlIl[4]] = lIlllIlIl[17];
                if (lIIlllIIllII(Inventory.contains(iArr9) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[18]];
                    Movement.walkTo(hV);
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                }
            }
            if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hV), lIlllIlIl[15]) && lIIlllIIllII(Players.getLocal().isMoving() ? 1 : 0)) {
                int[] iArr10 = new int[lIlllIlIl[3]];
                iArr10[lIlllIlIl[4]] = lIlllIlIl[17];
                if (lIIlllIIllII(Inventory.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lIlllIlIl[3]];
                    iArr11[lIlllIlIl[4]] = lIlllIlIl[19];
                    TileObject nearest = TileObjects.getNearest(iArr11);
                    if (lIIlllIIlIll(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr12 = new int[lIlllIlIl[3]];
                        iArr12[lIlllIlIl[4]] = lIlllIlIl[8];
                        Inventory.getFirst(iArr12).interact(lIlllIIII[lIlllIlIl[20]]);
                        Time.sleepTicks(lIlllIlIl[3]);
                        "".length();
                    }
                    if (lIIlllIIllII(Inventory.isFull() ? 1 : 0)) {
                        if (lIIlllIIllll(nearest) && lIIlllIIllII(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[21]];
                            nearest.interact(lIlllIIII[lIlllIlIl[22]]);
                            Dialog.continueSpace();
                        }
                        Widget widget = Widgets.get(lIlllIlIl[23], lIlllIlIl[3]);
                        if (lIIlllIIllll(widget)) {
                            widget.interact(lIlllIIII[lIlllIlIl[24]]);
                            widget.interact(lIlllIlIl[4]);
                            widget.interact(lIlllIIII[lIlllIlIl[25]]);
                            Keyboard.type(lIlllIIII[lIlllIlIl[26]]);
                        }
                    }
                }
            }
            if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hV), lIlllIlIl[15])) {
                int[] iArr13 = new int[lIlllIlIl[3]];
                iArr13[lIlllIlIl[4]] = lIlllIlIl[17];
                if (lIIlllIIlIll(Inventory.contains(iArr13) ? 1 : 0) && lIIlllIIllII(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[27]];
                    Movement.walkTo(hZ);
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                }
            }
            if (lIIlllIIlIll(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[28]];
                if (lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hZ), lIlllIlIl[3])) {
                    Movement.walkTo(hZ);
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                }
                if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hZ), lIlllIlIl[3])) {
                    String[] strArr = new String[lIlllIlIl[3]];
                    strArr[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[29]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[30]];
                    if (lIIlllIIlIll(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr14 = new int[lIlllIlIl[3]];
                        iArr14[lIlllIlIl[4]] = lIlllIlIl[8];
                        Inventory.getFirst(iArr14).interact(lIlllIIII[lIlllIlIl[31]]);
                        Time.sleepTicks(lIlllIlIl[3]);
                        "".length();
                    }
                    if (lIIlllIIllll(nearest2)) {
                        String[] strArr2 = new String[lIlllIlIl[3]];
                        strArr2[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[32]];
                        if (lIIlllIIlIll(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(lIlllIIII[lIlllIlIl[33]]);
                            Time.sleepTicks(lIlllIlIl[1]);
                            "".length();
                        }
                        String[] strArr3 = new String[lIlllIlIl[3]];
                        strArr3[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[34]];
                        if (lIIlllIIlIll(nearest2.hasAction(strArr3) ? 1 : 0)) {
                            nearest2.interact(lIlllIIII[lIlllIlIl[35]]);
                            Time.sleepTicks(lIlllIlIl[1]);
                            "".length();
                            Widget widget2 = Widgets.get(lIlllIlIl[23], lIlllIlIl[3]);
                            if (lIIlllIIllll(widget2)) {
                                widget2.interact(lIlllIIII[lIlllIlIl[36]]);
                                widget2.interact(lIlllIlIl[4]);
                                widget2.interact(lIlllIIII[lIlllIlIl[37]]);
                                Keyboard.type(lIlllIIII[lIlllIlIl[38]]);
                            }
                        }
                    }
                }
            }
        }
        if (lIIlllIIlIlI(C0004e.j(lIlllIlIl[0]), lIlllIlIl[1]) && lIIlllIIlIlI(C0004e.j(lIlllIlIl[2]), lIlllIlIl[1])) {
            cl = lIlllIlIl[4];
            if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[22])) {
                while (lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hV), lIlllIlIl[1]) && lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    Movement.walkTo(hV);
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                    "".length();
                    if ((true ^ true) != (true ^ true)) {
                        return;
                    }
                }
            }
            int[] iArr15 = new int[lIlllIlIl[3]];
            iArr15[lIlllIlIl[4]] = lIlllIlIl[39];
            if (lIIlllIIllII(Inventory.contains(iArr15) ? 1 : 0) && lIIlllIIlIll(ii.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[40]];
                if (lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hZ), lIlllIlIl[3])) {
                    Movement.walkTo(hZ);
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                }
                if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hZ), lIlllIlIl[3])) {
                    String[] strArr4 = new String[lIlllIlIl[3]];
                    strArr4[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[41]];
                    TileObject nearest3 = TileObjects.getNearest(strArr4);
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[42]];
                    if (lIIlllIIllll(nearest3)) {
                        String[] strArr5 = new String[lIlllIlIl[3]];
                        strArr5[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[43]];
                        if (lIIlllIIlIll(nearest3.hasAction(strArr5) ? 1 : 0)) {
                            nearest3.interact(lIlllIIII[lIlllIlIl[44]]);
                            Time.sleepTicks(lIlllIlIl[1]);
                            "".length();
                        }
                        String[] strArr6 = new String[lIlllIlIl[3]];
                        strArr6[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[45]];
                        if (lIIlllIIlIll(nearest3.hasAction(strArr6) ? 1 : 0)) {
                            nearest3.interact(lIlllIIII[lIlllIlIl[46]]);
                            Time.sleepTicks(lIlllIlIl[1]);
                            "".length();
                            Widget widget3 = Widgets.get(lIlllIlIl[23], lIlllIlIl[3]);
                            if (lIIlllIIllll(widget3)) {
                                widget3.interact(lIlllIIII[lIlllIlIl[47]]);
                                widget3.interact(lIlllIlIl[4]);
                                widget3.interact(lIlllIIII[lIlllIlIl[48]]);
                                Keyboard.type(lIlllIIII[lIlllIlIl[49]]);
                            }
                        }
                    }
                }
            }
            int[] iArr16 = new int[lIlllIlIl[3]];
            iArr16[lIlllIlIl[4]] = lIlllIlIl[39];
            if (lIIlllIIlIll(Inventory.contains(iArr16) ? 1 : 0) && lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIlIl[3])) {
                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[50]];
                Movement.walkTo(hW);
                "".length();
                Time.sleepTicks(lIlllIlIl[3]);
                "".length();
            }
            if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIlIl[1])) {
                String[] strArr7 = new String[lIlllIlIl[3]];
                strArr7[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[51]];
                TileObject nearest4 = TileObjects.getNearest(strArr7);
                String[] strArr8 = new String[lIlllIlIl[3]];
                strArr8[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[52]];
                NPC nearest5 = NPCs.getNearest(strArr8);
                if (lIIlllIIllll(nearest4) && lIIlllIlIIII(nearest5)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[53]];
                    String[] strArr9 = new String[lIlllIlIl[3]];
                    strArr9[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[54]];
                    if (lIIlllIIlIll(Inventory.contains(strArr9) ? 1 : 0)) {
                        String[] strArr10 = new String[lIlllIlIl[3]];
                        strArr10[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[55]];
                        Inventory.getFirst(strArr10).useOn(nearest4);
                    }
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                }
                if (lIIlllIIllll(nearest5)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[56]];
                    int[] iArr17 = new int[lIlllIlIl[3]];
                    iArr17[lIlllIlIl[4]] = lIlllIlIl[39];
                    if (lIIlllIIlIll(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[lIlllIlIl[3]];
                        iArr18[lIlllIlIl[4]] = lIlllIlIl[39];
                        Inventory.getFirst(iArr18).useOn(nearest5);
                    }
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                }
            }
        }
        if (lIIlllIIlIll(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllIIlIlI(C0004e.j(lIlllIlIl[2]), lIlllIlIl[12])) {
            AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[57]];
            Movement.walkTo(new WorldPoint(lIlllIlIl[58], lIlllIlIl[59], lIlllIlIl[4]));
            "".length();
            Time.sleepTicks(lIlllIlIl[3]);
            "".length();
        }
        if (lIIlllIIllII(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllIIlIlI(C0004e.j(lIlllIlIl[2]), lIlllIlIl[12])) {
            int[] iArr19 = new int[lIlllIlIl[3]];
            iArr19[lIlllIlIl[4]] = lIlllIlIl[60];
            if (lIIlllIIlIll(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIlllIlIl[3]];
                iArr20[lIlllIlIl[4]] = lIlllIlIl[60];
                if (lIIlllIIlIll(Inventory.contains(iArr20) ? 1 : 0)) {
                }
            }
            AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[61]];
            if (lIIlllIlIIIl(Movement.getRunEnergy(), lIlllIlIl[33])) {
                bO();
            }
        }
        if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(f0if), lIlllIlIl[12])) {
            int[] iArr21 = new int[lIlllIlIl[3]];
            iArr21[lIlllIlIl[4]] = lIlllIlIl[60];
            if (lIIlllIIlIll(Inventory.contains(iArr21) ? 1 : 0) && lIIlllIIlIlI(Players.getLocal().getWorldLocation().getX(), lIlllIlIl[62])) {
                String[] strArr11 = new String[lIlllIlIl[3]];
                strArr11[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[63]];
                TileObject nearest6 = TileObjects.getNearest(strArr11);
                if (lIIlllIIllll(nearest6)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[64]];
                    int[] iArr22 = new int[lIlllIlIl[3]];
                    iArr22[lIlllIlIl[4]] = lIlllIlIl[60];
                    if (lIIlllIIlIll(Inventory.contains(iArr22) ? 1 : 0)) {
                        int[] iArr23 = new int[lIlllIlIl[3]];
                        iArr23[lIlllIlIl[4]] = lIlllIlIl[60];
                        Inventory.getFirst(iArr23).useOn(nearest6);
                        Time.sleepTicks(lIlllIlIl[1]);
                        "".length();
                    }
                }
            }
        }
        if (lIIlllIIlIll(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            int[] iArr24 = new int[lIlllIlIl[3]];
            iArr24[lIlllIlIl[4]] = lIlllIlIl[60];
            if (lIIlllIIlIll(Inventory.contains(iArr24) ? 1 : 0)) {
                if (lIIlllIIllII(Players.getLocal().getWorldLocation().equals(hT) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[65]];
                    Movement.walkTo(hT);
                    "".length();
                }
                if (lIIlllIIlllI(Skills.getBoostedLevel(Skill.HITPOINTS), lIlllIlIl[13])) {
                    int[] iArr25 = new int[lIlllIlIl[3]];
                    iArr25[lIlllIlIl[4]] = lIlllIlIl[8];
                    if (lIIlllIIlIll(Inventory.contains(iArr25) ? 1 : 0)) {
                        int[] iArr26 = new int[lIlllIlIl[3]];
                        iArr26[lIlllIlIl[4]] = lIlllIlIl[8];
                        Inventory.getFirst(iArr26).interact(lIlllIIII[lIlllIlIl[66]]);
                    }
                }
                if (lIIlllIIlIll(Players.getLocal().getWorldLocation().equals(hT) ? 1 : 0)) {
                    NPC nearest7 = NPCs.getNearest(ix);
                    if (lIIlllIIllll(nearest7) && lIIlllIIllII(nearest7.isDead() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[67]];
                        if (lIIlllIIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIl[21])) {
                            Magic.cast(SpellBook.Standard.WATER_STRIKE, nearest7);
                            Time.sleepTicks(lIlllIlIl[3]);
                            "".length();
                        }
                        if (!lIIlllIIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIl[26]) || lIIlllIIlIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIl[21])) {
                            if (lIIlllIlIIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIl[21])) {
                                int[] iArr27 = new int[lIlllIlIl[3]];
                                iArr27[lIlllIlIl[4]] = lIlllIlIl[6];
                                if (lIIlllIIlIll(Inventory.contains(iArr27) ? 1 : 0)) {
                                    String[] strArr12 = new String[lIlllIlIl[3]];
                                    strArr12[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[68]];
                                }
                            }
                            if (lIIlllIlIIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIl[26])) {
                                String[] strArr13 = new String[lIlllIlIl[3]];
                                strArr13[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[69]];
                                if (lIIlllIIlIll(Inventory.contains(strArr13) ? 1 : 0)) {
                                    Magic.cast(SpellBook.Standard.FIRE_STRIKE, nearest7);
                                    Time.sleepTicks(lIlllIlIl[3]);
                                    "".length();
                                }
                            }
                        }
                        Magic.cast(SpellBook.Standard.EARTH_STRIKE, nearest7);
                        Time.sleepTicks(lIlllIlIl[3]);
                        "".length();
                        if (lIIlllIlIIIl(Skills.getLevel(Skill.MAGIC), lIlllIlIl[26])) {
                        }
                    }
                }
            }
        }
        if (lIIlllIIlIlI(C0004e.j(lIlllIlIl[2]), lIlllIlIl[14])) {
            String[] strArr14 = new String[lIlllIlIl[3]];
            strArr14[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[70]];
            if (lIIlllIIllII(Inventory.contains(strArr14) ? 1 : 0)) {
                String[] strArr15 = new String[lIlllIlIl[3]];
                strArr15[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[71]];
                TileItem nearest8 = TileItems.getNearest(strArr15);
                if (lIIlllIIllll(nearest8)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[72]];
                    nearest8.interact(lIlllIIII[lIlllIlIl[73]]);
                    Time.sleepTicks(lIlllIlIl[1]);
                    "".length();
                }
            }
        }
        if (lIIlllIIlIlI(C0004e.j(lIlllIlIl[2]), lIlllIlIl[14])) {
            String[] strArr16 = new String[lIlllIlIl[3]];
            strArr16[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[74]];
            if (lIIlllIIlIll(Inventory.contains(strArr16) ? 1 : 0)) {
                if (lIIlllIIlIll(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr28 = new int[lIlllIlIl[3]];
                    iArr28[lIlllIlIl[4]] = lIlllIlIl[10];
                    if (lIIlllIIlIll(Inventory.contains(iArr28) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[75]];
                        int[] iArr29 = new int[lIlllIlIl[3]];
                        iArr29[lIlllIlIl[4]] = lIlllIlIl[10];
                        Inventory.getFirst(iArr29).interact(lIlllIIII[lIlllIlIl[76]]);
                        Time.sleepTicks(lIlllIlIl[13]);
                        "".length();
                    }
                }
                if (lIIlllIIllII(ij.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[15])) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[77]];
                    Movement.walkTo(hS);
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                }
                if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hS), lIlllIlIl[13])) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[78]];
                    if (lIIlllIIlIIl(cl, lIlllIlIl[3])) {
                        an.mK += lIlllIlIl[3];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlllIlIl[3];
                        an.mK = lIlllIlIl[4];
                        cm = lIlllIlIl[4];
                    }
                    C0006g.a(lIlllIIII[lIlllIlIl[79]], hl);
                }
            }
        }
    }

    private static boolean lIIlllIIlllI(int i, int i2) {
        return i <= i2;
    }

    public static void bO() {
        if (lIIlllIIlIll(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIlllIIlIIl(Movement.getRunEnergy(), lIlllIlIl[68])) {
            Inventory.getFirst(C0005f.aV).interact(lIlllIIII[lIlllIlIl[80]]);
            Time.sleepTicks(lIlllIlIl[3]);
            "".length();
        }
        if (lIIlllIIllII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!lIIlllIIllII(ih.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(hW), lIlllIlIl[1])) {
            AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[81]];
            Movement.walkTo(new WorldPoint(lIlllIlIl[58], lIlllIlIl[59], lIlllIlIl[4]));
            "".length();
            Time.sleepTicks(lIlllIlIl[3]);
            "".length();
        }
        int[] iArr = new int[lIlllIlIl[3]];
        iArr[lIlllIlIl[4]] = lIlllIlIl[82];
        NPC nearest = NPCs.getNearest(iArr);
        int[] iArr2 = new int[lIlllIlIl[3]];
        iArr2[lIlllIlIl[4]] = lIlllIlIl[60];
        if (lIIlllIIllII(Inventory.contains(iArr2) ? 1 : 0)) {
            if (lIIlllIIlIll(hw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllIIllll(nearest) && lIIlllIIlIll(hC.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(lIlllIlIl[24]);
                "".length();
                while (lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(ht), lIlllIlIl[3]) && lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[83]];
                    Movement.walkTo(ht);
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                    "".length();
                    if ((true ^ true) & ((true ^ true) ^ true)) {
                        return;
                    }
                }
            }
            if (lIIlllIIlIll(hx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllIIllll(nearest) && lIIlllIIlIll(hz.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hu), lIlllIlIl[3]) && lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[84]];
                    Movement.walkTo(hu);
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                }
            }
            if (lIIlllIIlIll(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllIIllll(nearest) && lIIlllIIlIll(hD.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(lIlllIlIl[18]);
                "".length();
                while (lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hv), lIlllIlIl[3]) && lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[85]];
                    Movement.walkTo(hv);
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                    "".length();
                    if ("  ".length() <= " ".length()) {
                        return;
                    }
                }
            }
            if (lIIlllIIlIll(hB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllIIllll(nearest) && lIIlllIIlIll(hD.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(ig), lIlllIlIl[1]) && lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[86]];
                    Movement.walkTo(ig);
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                    "".length();
                    if ("   ".length() == (((((142 + 114) - 173) + 103) ^ (((63 + 116) - 170) + 153)) & (((((125 + 188) - 152) + 59) ^ (((141 + 173) - 121) + 3)) ^ (-" ".length())))) {
                        return;
                    }
                }
            }
            if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ig), lIlllIlIl[12])) {
                AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[87]];
                String[] strArr = new String[lIlllIlIl[3]];
                strArr[lIlllIlIl[4]] = lIlllIIII[lIlllIlIl[88]];
                TileObject nearest2 = TileObjects.getNearest(strArr);
                if (lIIlllIIllll(nearest2)) {
                    nearest2.interact(lIlllIIII[lIlllIlIl[89]]);
                    Time.sleepTicks(lIlllIlIl[1]);
                    "".length();
                    Widget widget = Widgets.get(lIlllIlIl[23], lIlllIlIl[3]);
                    if (lIIlllIIllll(widget)) {
                        widget.interact(lIlllIIII[lIlllIlIl[90]]);
                        widget.interact(lIlllIlIl[4]);
                        widget.interact(lIlllIIII[lIlllIlIl[91]]);
                        Keyboard.type(lIlllIIII[lIlllIlIl[92]]);
                    }
                }
            }
        }
        int[] iArr3 = new int[lIlllIlIl[3]];
        iArr3[lIlllIlIl[4]] = lIlllIlIl[60];
        if (lIIlllIIlIll(Inventory.contains(iArr3) ? 1 : 0)) {
            if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(ig), lIlllIlIl[12])) {
                while (lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIlllIlIl[93], lIlllIlIl[94], lIlllIlIl[4])), lIlllIlIl[3]) && lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[95]];
                    Movement.walkTo(new WorldPoint(lIlllIlIl[93], lIlllIlIl[94], lIlllIlIl[4]));
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                    "".length();
                    if ((((((42 + 35) - (-47)) + 50) ^ (((102 + 37) - 54) + 84)) & (((((11 + 35) - 8) + 102) ^ (((92 + 8) - 53) + 92)) ^ (-" ".length()))) != 0) {
                        return;
                    }
                }
            }
            if (lIIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIlllIlIl[93], lIlllIlIl[94], lIlllIlIl[4])), lIlllIlIl[1]) && lIIlllIIllll(nearest) && lIIlllIIlIll(hC.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (lIIlllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hu), lIlllIlIl[3]) && lIIlllIIllII(AccBuilderEasyClues.d ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIII[lIlllIlIl[96]];
                    Movement.walkTo(hu);
                    "".length();
                    Time.sleepTicks(lIlllIlIl[3]);
                    "".length();
                    "".length();
                    if ((-" ".length()) == (190 ^ 186)) {
                        return;
                    }
                }
            }
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        bN();
        return lIlllIlIl[109];
    }

    private static boolean lIIlllIIlIlI(int i, int i2) {
        return i == i2;
    }

    private static String lIIllIlIIlIl(String llIIIlIllIlIII, String llIIIlIllIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIllIIlll.getBytes(StandardCharsets.UTF_8)), lIlllIlIl[20]), "DES");
            Cipher llIIIlIllIlIlI = Cipher.getInstance("DES");
            llIIIlIllIlIlI.init(lIlllIlIl[1], secretKeySpec);
            return new String(llIIIlIllIlIlI.doFinal(Base64.getDecoder().decode(llIIIlIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlIllIlIIl) {
            llIIIlIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIlIIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlllIlIl[4];
    }

    private static boolean lIIlllIIlIIl(int i, int i2) {
        return i < i2;
    }
}
