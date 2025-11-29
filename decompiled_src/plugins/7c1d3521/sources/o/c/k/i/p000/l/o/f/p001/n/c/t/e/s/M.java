package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.M  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/M.class */
public class M implements InterfaceC0003ac {
    private static /* synthetic */ String[] llIIIlllII;
    public static final /* synthetic */ WorldPoint gU;
    public static final /* synthetic */ WorldPoint gV;
    public static final /* synthetic */ WorldPoint gQ;
    static /* synthetic */ WorldArea gZ;
    public static final /* synthetic */ WorldPoint gP;
    public static final /* synthetic */ WorldPoint gN;
    static /* synthetic */ WorldArea gY;
    static /* synthetic */ int gX;
    public static final /* synthetic */ WorldPoint gO;
    public static final /* synthetic */ WorldPoint gW;
    public static /* synthetic */ List<C0017d> bv;
    public static final /* synthetic */ WorldPoint gR;
    static /* synthetic */ boolean dj;
    public static /* synthetic */ String[] cE;
    private static /* synthetic */ int[] llIIIllllI;
    public static final /* synthetic */ WorldPoint gT;
    public static final /* synthetic */ WorldPoint gS;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int di;

    private static boolean lIlIIllllIlll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIllllIlll(C0018e.j(gX), llIIIllllI[25])) {
            ?? r0 = llIIIllllI[0];
            "".length();
            return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIllllI[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a6, code lost:
        if (lIlIIllllIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIllllI[9]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x022f, code lost:
        if (lIlIIllllIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIllllI[9]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02b8, code lost:
        if (lIlIIllllIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIllllI[9]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x036a, code lost:
        if (lIlIIllllIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIllllI[7]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIIllllIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIllllI[13]) != false) goto L55;
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
        int[] iArr8 = new int[llIIIllllI[0]];
        iArr8[llIIIllllI[1]] = llIIIllllI[12];
        if (lIlIIllllIlII(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llIIIllllI[0]];
            iArr9[llIIIllllI[1]] = llIIIllllI[12];
            if (lIlIIllllIlII(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIIllllI[0]];
                iArr10[llIIIllllI[1]] = llIIIllllI[12];
            }
            if (lIlIIllllIllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llIIIlllII[llIIIllllI[110]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(llIIIllllI[104], llIIIllllI[16], llIIIllllI[105]));
                "".length();
            }
            iArr = new int[llIIIllllI[0]];
            iArr[llIIIllllI[1]] = llIIIllllI[15];
            if (lIlIIllllIlII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[llIIIllllI[0]];
                iArr11[llIIIllllI[1]] = llIIIllllI[15];
                if (lIlIIllllIlIl(Bank.getFirst(iArr11).getQuantity(), llIIIllllI[7])) {
                    int i = llIIIllllI[15];
                    int i2 = llIIIllllI[7];
                    int[] iArr12 = new int[llIIIllllI[0]];
                    iArr12[llIIIllllI[1]] = llIIIllllI[15];
                    bv.add(new C0017d(i, i2 - Bank.getFirst(iArr12).getQuantity(), llIIIllllI[106]));
                    "".length();
                }
            }
            iArr2 = new int[llIIIllllI[0]];
            iArr2[llIIIllllI[1]] = llIIIllllI[10];
            if (lIlIIllllIlII(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr13 = new int[llIIIllllI[0]];
                iArr13[llIIIllllI[1]] = llIIIllllI[10];
                if (lIlIIllllIlII(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[llIIIllllI[0]];
                    iArr14[llIIIllllI[1]] = llIIIllllI[10];
                }
                iArr3 = new int[llIIIllllI[0]];
                iArr3[llIIIllllI[1]] = llIIIllllI[8];
                if (lIlIIllllIlII(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr15 = new int[llIIIllllI[0]];
                    iArr15[llIIIllllI[1]] = llIIIllllI[8];
                    if (lIlIIllllIlII(Bank.contains(iArr15) ? 1 : 0)) {
                        int[] iArr16 = new int[llIIIllllI[0]];
                        iArr16[llIIIllllI[1]] = llIIIllllI[8];
                    }
                    iArr4 = new int[llIIIllllI[0]];
                    iArr4[llIIIllllI[1]] = llIIIllllI[11];
                    if (lIlIIllllIlII(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr17 = new int[llIIIllllI[0]];
                        iArr17[llIIIllllI[1]] = llIIIllllI[11];
                        if (lIlIIllllIlII(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llIIIllllI[0]];
                            iArr18[llIIIllllI[1]] = llIIIllllI[11];
                        }
                        iArr5 = new int[llIIIllllI[0]];
                        iArr5[llIIIllllI[1]] = llIIIllllI[15];
                        if (lIlIIllllIllI(Bank.contains(iArr5) ? 1 : 0)) {
                            bv.add(new C0017d(llIIIllllI[15], llIIIllllI[7], llIIIllllI[106]));
                            "".length();
                        }
                        iArr6 = new int[llIIIllllI[0]];
                        iArr6[llIIIllllI[1]] = llIIIllllI[18];
                        if (lIlIIllllIlII(Bank.contains(iArr6) ? 1 : 0)) {
                            int[] iArr19 = new int[llIIIllllI[0]];
                            iArr19[llIIIllllI[1]] = llIIIllllI[18];
                        }
                        bv.add(new C0017d(llIIIllllI[18], llIIIllllI[7], C0023j.cf));
                        "".length();
                        iArr7 = new int[llIIIllllI[0]];
                        iArr7[llIIIllllI[1]] = llIIIllllI[14];
                        if (lIlIIllllIlII(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr20 = new int[llIIIllllI[0]];
                            iArr20[llIIIllllI[1]] = llIIIllllI[14];
                            if (!lIlIIllllIlII(Bank.contains(iArr20) ? 1 : 0)) {
                                return;
                            }
                            int[] iArr21 = new int[llIIIllllI[0]];
                            iArr21[llIIIllllI[1]] = llIIIllllI[14];
                            if (!lIlIIllllIlIl(Bank.getFirst(iArr21).getQuantity(), llIIIllllI[30])) {
                                return;
                            }
                        }
                        bv.add(new C0017d(llIIIllllI[14], llIIIllllI[66], llIIIllllI[107]));
                        "".length();
                    }
                    bv.add(new C0017d(llIIIllllI[11], llIIIllllI[9], llIIIllllI[21]));
                    "".length();
                    iArr5 = new int[llIIIllllI[0]];
                    iArr5[llIIIllllI[1]] = llIIIllllI[15];
                    if (lIlIIllllIllI(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    iArr6 = new int[llIIIllllI[0]];
                    iArr6[llIIIllllI[1]] = llIIIllllI[18];
                    if (lIlIIllllIlII(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(llIIIllllI[18], llIIIllllI[7], C0023j.cf));
                    "".length();
                    iArr7 = new int[llIIIllllI[0]];
                    iArr7[llIIIllllI[1]] = llIIIllllI[14];
                    if (lIlIIllllIlII(Bank.contains(iArr7) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(llIIIllllI[14], llIIIllllI[66], llIIIllllI[107]));
                    "".length();
                }
                bv.add(new C0017d(llIIIllllI[8], llIIIllllI[9], llIIIllllI[21]));
                "".length();
                iArr4 = new int[llIIIllllI[0]];
                iArr4[llIIIllllI[1]] = llIIIllllI[11];
                if (lIlIIllllIlII(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIIllllI[11], llIIIllllI[9], llIIIllllI[21]));
                "".length();
                iArr5 = new int[llIIIllllI[0]];
                iArr5[llIIIllllI[1]] = llIIIllllI[15];
                if (lIlIIllllIllI(Bank.contains(iArr5) ? 1 : 0)) {
                }
                iArr6 = new int[llIIIllllI[0]];
                iArr6[llIIIllllI[1]] = llIIIllllI[18];
                if (lIlIIllllIlII(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIIllllI[18], llIIIllllI[7], C0023j.cf));
                "".length();
                iArr7 = new int[llIIIllllI[0]];
                iArr7[llIIIllllI[1]] = llIIIllllI[14];
                if (lIlIIllllIlII(Bank.contains(iArr7) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIIllllI[14], llIIIllllI[66], llIIIllllI[107]));
                "".length();
            }
            bv.add(new C0017d(llIIIllllI[10], llIIIllllI[9], llIIIllllI[21]));
            "".length();
            iArr3 = new int[llIIIllllI[0]];
            iArr3[llIIIllllI[1]] = llIIIllllI[8];
            if (lIlIIllllIlII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIllllI[8], llIIIllllI[9], llIIIllllI[21]));
            "".length();
            iArr4 = new int[llIIIllllI[0]];
            iArr4[llIIIllllI[1]] = llIIIllllI[11];
            if (lIlIIllllIlII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIllllI[11], llIIIllllI[9], llIIIllllI[21]));
            "".length();
            iArr5 = new int[llIIIllllI[0]];
            iArr5[llIIIllllI[1]] = llIIIllllI[15];
            if (lIlIIllllIllI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llIIIllllI[0]];
            iArr6[llIIIllllI[1]] = llIIIllllI[18];
            if (lIlIIllllIlII(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIllllI[18], llIIIllllI[7], C0023j.cf));
            "".length();
            iArr7 = new int[llIIIllllI[0]];
            iArr7[llIIIllllI[1]] = llIIIllllI[14];
            if (lIlIIllllIlII(Bank.contains(iArr7) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIIllllI[14], llIIIllllI[66], llIIIllllI[107]));
            "".length();
        }
        bv.add(new C0017d(llIIIllllI[12], llIIIllllI[13], llIIIllllI[103]));
        "".length();
        if (lIlIIllllIllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llIIIlllII[llIIIllllI[110]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[llIIIllllI[0]];
        iArr[llIIIllllI[1]] = llIIIllllI[15];
        if (lIlIIllllIlII(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[llIIIllllI[0]];
        iArr2[llIIIllllI[1]] = llIIIllllI[10];
        if (lIlIIllllIlII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllllI[10], llIIIllllI[9], llIIIllllI[21]));
        "".length();
        iArr3 = new int[llIIIllllI[0]];
        iArr3[llIIIllllI[1]] = llIIIllllI[8];
        if (lIlIIllllIlII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllllI[8], llIIIllllI[9], llIIIllllI[21]));
        "".length();
        iArr4 = new int[llIIIllllI[0]];
        iArr4[llIIIllllI[1]] = llIIIllllI[11];
        if (lIlIIllllIlII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllllI[11], llIIIllllI[9], llIIIllllI[21]));
        "".length();
        iArr5 = new int[llIIIllllI[0]];
        iArr5[llIIIllllI[1]] = llIIIllllI[15];
        if (lIlIIllllIllI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llIIIllllI[0]];
        iArr6[llIIIllllI[1]] = llIIIllllI[18];
        if (lIlIIllllIlII(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllllI[18], llIIIllllI[7], C0023j.cf));
        "".length();
        iArr7 = new int[llIIIllllI[0]];
        iArr7[llIIIllllI[1]] = llIIIllllI[14];
        if (lIlIIllllIlII(Bank.contains(iArr7) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIllllI[14], llIIIllllI[66], llIIIllllI[107]));
        "".length();
    }

    private static boolean lIlIIlllllIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlllllIIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIIllllI[1];
    }

    private static boolean lIlIIllllllII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIllllIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIIIllllI[6]];
        iArr[llIIIllllI[1]] = llIIIllllI[14];
        iArr[llIIIllllI[0]] = llIIIllllI[12];
        iArr[llIIIllllI[4]] = llIIIllllI[15];
        int i = llIIIllllI[1];
        while (lIlIIllllIlIl(i, iArr.length)) {
            int[] iArr2 = new int[llIIIllllI[0]];
            iArr2[llIIIllllI[1]] = iArr[i];
            if (lIlIIllllIllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIIIllllI[1];
            }
            i++;
            "".length();
            if ("   ".length() < "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIIllllI[0];
    }

    private static void lIlIIllllIIlI() {
        llIIIllllI = new int[141];
        llIIIllllI[0] = " ".length();
        llIIIllllI[1] = ((236 ^ 138) ^ (89 ^ 23)) & (((68 ^ 23) ^ (245 ^ 142)) ^ (-" ".length()));
        llIIIllllI[2] = 143 ^ 130;
        llIIIllllI[3] = 28 ^ 49;
        llIIIllllI[4] = "  ".length();
        llIIIllllI[5] = (-((-20949) & 32247)) & (-6) & 16303;
        llIIIllllI[6] = "   ".length();
        llIIIllllI[7] = 29 ^ 25;
        llIIIllllI[8] = (-14545) & 15102;
        llIIIllllI[9] = (-12308) & 13307;
        llIIIllllI[10] = (-((-41) & 1465)) & (-65) & 2045;
        llIIIllllI[11] = (-((-8553) & 31230)) & (-1345) & 24575;
        llIIIllllI[12] = (-12801) & 14311;
        llIIIllllI[13] = (((81 + 94) - 131) + 128) ^ (((5 + 120) - 55) + 100);
        llIIIllllI[14] = (-8217) & 16223;
        llIIIllllI[15] = (-20602) & 23035;
        llIIIllllI[16] = (((126 + 46) - 46) + 2) ^ (((44 + 31) - (-34)) + 24);
        llIIIllllI[17] = 138 ^ 141;
        llIIIllllI[18] = (-17573) & 30197;
        llIIIllllI[19] = (-((-343) & 26455)) & (-2049) & 28539;
        llIIIllllI[20] = (78 ^ 15) ^ (90 ^ 19);
        llIIIllllI[21] = (((110 + 79) - 76) + 52) ^ (((48 + 95) - 64) + 96);
        llIIIllllI[22] = (-((-20657) & 23225)) & (-12291) & 15358;
        llIIIllllI[23] = (-((-669) & 8863)) & (-2081) & 11774;
        llIIIllllI[24] = (((83 + 71) - 35) + 30) ^ (((162 + 166) - 191) + 30);
        llIIIllllI[25] = (24 ^ 18) ^ "   ".length();
        llIIIllllI[26] = (-((-4665) & 16061)) & (-16385) & 28380;
        llIIIllllI[27] = "  ".length() ^ (44 ^ 37);
        llIIIllllI[28] = 150 ^ 154;
        llIIIllllI[29] = (214 ^ 182) ^ (194 ^ 172);
        llIIIllllI[30] = (((102 + 110) - 164) + 103) ^ (((75 + 128) - 81) + 30);
        llIIIllllI[31] = 66 ^ 82;
        llIIIllllI[32] = 158 ^ 143;
        llIIIllllI[33] = 1 ^ 19;
        llIIIllllI[34] = (-30857) & 31455;
        llIIIllllI[35] = 161 ^ 178;
        llIIIllllI[36] = (((108 + 36) - 44) + 39) ^ (((113 + 30) - 110) + 126);
        llIIIllllI[37] = (-((-16709) & 32101)) & (-16647) & 32639;
        llIIIllllI[38] = 7 ^ 18;
        llIIIllllI[39] = (31 ^ 42) ^ (32 ^ 3);
        llIIIllllI[40] = (87 ^ 18) ^ (52 ^ 102);
        llIIIllllI[41] = (67 ^ 78) ^ (116 ^ 97);
        llIIIllllI[42] = (101 ^ 74) ^ (57 ^ 15);
        llIIIllllI[43] = 68 ^ 94;
        llIIIllllI[44] = (-((-16537) & 32153)) & (-38) & 16255;
        llIIIllllI[45] = (((20 + 0) - (-10)) + 156) ^ (((73 + 63) - (-13)) + 12);
        llIIIllllI[46] = 111 ^ 115;
        llIIIllllI[47] = 48 ^ 45;
        llIIIllllI[48] = 139 ^ 149;
        llIIIllllI[49] = (-((-5697) & 22119)) & (-1553) & 20479;
        llIIIllllI[50] = (-833) & 4086;
        llIIIllllI[51] = (-24620) & 27119;
        llIIIllllI[52] = (-29449) & 32699;
        llIIIllllI[53] = (-((-4675) & 30323)) & (-4106) & 32255;
        llIIIllllI[54] = (-12809) & 16061;
        llIIIllllI[55] = 183 ^ 168;
        llIIIllllI[56] = (111 ^ 100) ^ (103 ^ 76);
        llIIIllllI[57] = (((11 + 121) - 131) + 148) ^ (((46 + 126) - 18) + 26);
        llIIIllllI[58] = (-17973) & 20479;
        llIIIllllI[59] = (-((-16517) & 20869)) & (-8199) & 15807;
        llIIIllllI[60] = 113 ^ 83;
        llIIIllllI[61] = 140 ^ 175;
        llIIIllllI[62] = (107 ^ 121) ^ (156 ^ 170);
        llIIIllllI[63] = (((15 + 92) - 42) + 95) ^ (((60 + 74) - 129) + 128);
        llIIIllllI[64] = (99 ^ 23) ^ (70 ^ 20);
        llIIIllllI[65] = 146 ^ 181;
        llIIIllllI[66] = (151 ^ 171) ^ (90 ^ 78);
        llIIIllllI[67] = 75 ^ 98;
        llIIIllllI[68] = 10 ^ 32;
        llIIIllllI[69] = 64 ^ 107;
        llIIIllllI[70] = 113 ^ 93;
        llIIIllllI[71] = (((171 + 171) - 178) + 9) ^ (((78 + 106) - 124) + 71);
        llIIIllllI[72] = (((23 + 60) - 5) + 66) ^ (((105 + 17) - 57) + 126);
        llIIIllllI[73] = (49 ^ 72) ^ (94 ^ 23);
        llIIIllllI[74] = (((188 + 116) - 101) + 42) ^ (((44 + 29) - (-90)) + 33);
        llIIIllllI[75] = "  ".length() ^ (86 ^ 103);
        llIIIllllI[76] = (((130 + 107) - 99) + 41) ^ (((48 + 103) - 54) + 38);
        llIIIllllI[77] = 38 ^ 19;
        llIIIllllI[78] = (51 ^ 53) ^ (99 ^ 83);
        llIIIllllI[79] = (215 ^ 156) ^ (254 ^ 130);
        llIIIllllI[80] = 62 ^ 6;
        llIIIllllI[81] = (41 ^ 87) ^ (251 ^ 188);
        llIIIllllI[82] = 90 ^ 96;
        llIIIllllI[83] = (((64 + 120) - 135) + 135) ^ (((44 + 58) - (-12)) + 17);
        llIIIllllI[84] = (((125 + 50) - 105) + 111) ^ (((103 + 87) - 66) + 13);
        llIIIllllI[85] = 57 ^ 4;
        llIIIllllI[86] = 5 ^ 59;
        llIIIllllI[87] = (((112 + 164) - 59) + 31) ^ (((197 + 115) - 176) + 63);
        llIIIllllI[88] = 126 ^ 62;
        llIIIllllI[89] = 226 ^ 163;
        llIIIllllI[90] = (-16901) & 19302;
        llIIIllllI[91] = (-((-802) & 29489)) & (-1025) & 32767;
        llIIIllllI[92] = ((7 + 49) - (-40)) + 134;
        llIIIllllI[93] = (((((77 + 41) - 81) + 99) + (149 ^ 144)) - (160 ^ 178)) + (49 ^ 46);
        llIIIllllI[94] = (-28673) & 31203;
        llIIIllllI[95] = (-29321) & 32475;
        llIIIllllI[96] = (-1537) & 4055;
        llIIIllllI[97] = (-((-19537) & 28670)) & (-1) & 12287;
        llIIIllllI[98] = (-(204 ^ 193)) & (-16898) & 19423;
        llIIIllllI[99] = (-4492) & 7647;
        llIIIllllI[100] = 75 ^ 9;
        llIIIllllI[101] = (43 ^ 105) ^ " ".length();
        llIIIllllI[102] = (4 ^ 108) ^ (162 ^ 142);
        llIIIllllI[103] = (((3 ^ 48) + (((5 + 109) - 18) + 58)) - (125 ^ 117)) + "   ".length();
        llIIIllllI[104] = (-4387) & 16366;
        llIIIllllI[105] = (-3089) & 28088;
        llIIIllllI[106] = (-((-24585) & 25935)) & (-16417) & 32766;
        llIIIllllI[107] = (-4123) & 5022;
        llIIIllllI[108] = 164 ^ 192;
        llIIIllllI[109] = 206 ^ 139;
        llIIIllllI[110] = 44 ^ 106;
        llIIIllllI[111] = 26 ^ 93;
        llIIIllllI[112] = (-((-1133) & 29821)) & (-5) & 31231;
        llIIIllllI[113] = (-17313) & 20479;
        llIIIllllI[114] = (-30244) & 32763;
        llIIIllllI[115] = (-((-6181) & 31605)) & (-33) & 28663;
        llIIIllllI[116] = (-((-12689) & 29107)) & (-5634) & 24575;
        llIIIllllI[117] = (-24904) & 28159;
        llIIIllllI[118] = (-((-17866) & 26603)) & (-17409) & 28671;
        llIIIllllI[119] = (-21258) & 24509;
        llIIIllllI[120] = (-(134 ^ 183)) & (-25609) & 28155;
        llIIIllllI[121] = (-((-19077) & 27589)) & (-20994) & 32765;
        llIIIllllI[122] = (-((-31070) & 32639)) & (-28689) & 32753;
        llIIIllllI[123] = (-9049) & 12284;
        llIIIllllI[124] = (-((-2762) & 32507)) & (-1) & 32255;
        llIIIllllI[125] = (-((-4609) & 21079)) & (-33) & 19711;
        llIIIllllI[126] = (-589) & 3838;
        llIIIllllI[127] = (-((-509) & 13821)) & (-16433) & 32247;
        llIIIllllI[128] = (-5665) & 8122;
        llIIIllllI[129] = (-((-12026) & 32767)) & (-8209) & 32247;
        llIIIllllI[130] = 110 ^ 38;
        llIIIllllI[131] = 94 ^ 23;
        llIIIllllI[132] = (240 ^ 181) ^ (165 ^ 170);
        llIIIllllI[133] = 136 ^ 195;
        llIIIllllI[134] = (172 ^ 163) ^ (84 ^ 23);
        llIIIllllI[135] = (((187 + 8) - 73) + 130) ^ (((137 + 143) - 169) + 66);
        llIIIllllI[136] = 9 ^ 102;
        llIIIllllI[137] = (-((-17191) & 30503)) & (-22) & 15871;
        llIIIllllI[138] = (-((-2305) & 32547)) & (-5) & 32759;
        llIIIllllI[139] = (-((-6523) & 23551)) & (-8227) & 28415;
        llIIIllllI[140] = (217 ^ 147) ^ (116 ^ 112);
    }

    private static boolean lIlIIlllllllI(int i, int i2) {
        return i <= i2;
    }

    static {
        lIlIIllllIIlI();
        lIlIIllllIIIl();
        gN = new WorldPoint(llIIIllllI[112], llIIIllllI[113], llIIIllllI[1]);
        gO = new WorldPoint(llIIIllllI[114], llIIIllllI[115], llIIIllllI[1]);
        gP = new WorldPoint(llIIIllllI[116], llIIIllllI[117], llIIIllllI[1]);
        gQ = new WorldPoint(llIIIllllI[118], llIIIllllI[119], llIIIllllI[1]);
        gR = new WorldPoint(llIIIllllI[120], llIIIllllI[121], llIIIllllI[1]);
        gS = new WorldPoint(llIIIllllI[122], llIIIllllI[123], llIIIllllI[1]);
        gT = new WorldPoint(llIIIllllI[124], llIIIllllI[125], llIIIllllI[1]);
        gU = new WorldPoint(llIIIllllI[124], llIIIllllI[126], llIIIllllI[1]);
        gV = new WorldPoint(llIIIllllI[127], llIIIllllI[54], llIIIllllI[1]);
        gW = new WorldPoint(llIIIllllI[128], llIIIllllI[129], llIIIllllI[1]);
        bv = new ArrayList();
        String[] strArr = new String[llIIIllllI[13]];
        strArr[llIIIllllI[1]] = llIIIlllII[llIIIllllI[130]];
        strArr[llIIIllllI[0]] = llIIIlllII[llIIIllllI[131]];
        strArr[llIIIllllI[4]] = llIIIlllII[llIIIllllI[132]];
        strArr[llIIIllllI[6]] = llIIIlllII[llIIIllllI[133]];
        strArr[llIIIllllI[7]] = llIIIlllII[llIIIllllI[134]];
        strArr[llIIIllllI[16]] = llIIIlllII[llIIIllllI[135]];
        cE = strArr;
        gX = llIIIllllI[136];
        gY = new WorldArea(llIIIllllI[137], llIIIllllI[113], llIIIllllI[21], llIIIllllI[13], llIIIllllI[1]);
        gZ = new WorldArea(llIIIllllI[138], llIIIllllI[139], llIIIllllI[48], llIIIllllI[30], llIIIllllI[1]);
    }

    private static boolean lIlIIllllIllI(int i) {
        return i == 0;
    }

    private static boolean lIlIIlllllIll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIIlllllIlI(int i) {
        return i < 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            cT();
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return ((((34 + 27) - 46) + 212) ^ (((103 + 100) - 18) + 9)) & (((72 ^ 118) ^ (218 ^ 197)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIIllllI[108];
    }

    private static String lIlIIlllIllIl(String llllllllllllllllllIlIlIlIlIllIll, String llllllllllllllllllIlIlIlIlIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIllllI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlIlIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIlIlIlIlllII) {
            llllllllllllllllllIlIlIlIlIlllII.printStackTrace();
            return null;
        }
    }

    private static int lIlIIllllIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIIllllIlIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e6, code lost:
        if (lIlIIllllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIllllI[9]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0229, code lost:
        if (lIlIIllllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIllllI[9]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x026c, code lost:
        if (lIlIIllllIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIllllI[9]) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02af, code lost:
        if (lIlIIllllIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIllllI[13]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02b2, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIlllII[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIllllI[7]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.M.llIIIllllI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02cd, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v644, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v665, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v701, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cT() {
        if (lIlIIllllIlII(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIlIIllllIlIl(bv.size(), llIIIllllI[0])) {
                System.out.println(llIIIlllII[llIIIllllI[1]]);
                bt = llIIIllllI[1];
            }
        }
        if (lIlIIllllIllI(bt ? 1 : 0)) {
            if (lIlIIllllIlIl(Skills.getLevel(Skill.MAGIC), llIIIllllI[2])) {
                C0026m.ak();
            }
            if (lIlIIllllIlll(Skills.getLevel(Skill.MAGIC), llIIIllllI[2]) && lIlIIllllIlIl(Skills.getLevel(Skill.PRAYER), llIIIllllI[3])) {
                aD.fY();
            }
            if (lIlIIllllIlll(Skills.getLevel(Skill.PRAYER), llIIIllllI[3]) && lIlIIllllIlII(Inventory.contains(C0019f.bf) ? 1 : 0)) {
                Inventory.getFirst(C0019f.bf).interact(llIIIlllII[llIIIllllI[0]]);
            }
            if (lIlIIllllIllI(an() ? 1 : 0) && lIlIIllllIlIl(C0018e.j(gX), llIIIllllI[0]) && lIlIIllllIlll(Skills.getLevel(Skill.MAGIC), llIIIllllI[2]) && lIlIIllllIlll(Skills.getLevel(Skill.PRAYER), llIIIllllI[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlllllIII(nearest) && lIlIIllllIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlllII[llIIIllllI[4]];
                    C0000a.a(nearest);
                }
                if (lIlIIlllllIII(nearest) && lIlIIllllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIllllIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIllllI[5]);
                        "".length();
                    }
                    if (lIlIIllllIlII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[6]];
                        if (lIlIIlllllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIllllI[7]);
                            "".length();
                        }
                        if (lIlIIlllllIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIllllI[4]);
                            "".length();
                        }
                        int[] iArr = new int[llIIIllllI[0]];
                        iArr[llIIIllllI[1]] = llIIIllllI[8];
                        if (lIlIIllllIlII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIIIllllI[0]];
                            iArr2[llIIIllllI[1]] = llIIIllllI[8];
                        }
                        int[] iArr3 = new int[llIIIllllI[0]];
                        iArr3[llIIIllllI[1]] = llIIIllllI[10];
                        if (lIlIIllllIlII(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIIllllI[0]];
                            iArr4[llIIIllllI[1]] = llIIIllllI[10];
                        }
                        int[] iArr5 = new int[llIIIllllI[0]];
                        iArr5[llIIIllllI[1]] = llIIIllllI[11];
                        if (lIlIIllllIlII(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIIllllI[0]];
                            iArr6[llIIIllllI[1]] = llIIIllllI[11];
                        }
                        int[] iArr7 = new int[llIIIllllI[0]];
                        iArr7[llIIIllllI[1]] = llIIIllllI[12];
                        if (lIlIIllllIlII(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[llIIIllllI[0]];
                            iArr8[llIIIllllI[1]] = llIIIllllI[12];
                        }
                        int[] iArr9 = new int[llIIIllllI[13]];
                        iArr9[llIIIllllI[1]] = llIIIllllI[14];
                        iArr9[llIIIllllI[0]] = llIIIllllI[12];
                        iArr9[llIIIllllI[4]] = llIIIllllI[15];
                        iArr9[llIIIllllI[6]] = llIIIllllI[11];
                        iArr9[llIIIllllI[7]] = llIIIllllI[10];
                        iArr9[llIIIllllI[16]] = llIIIllllI[8];
                        if (lIlIIllllIllI(C0018e.c(iArr9) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIIlllII[llIIIllllI[16]]);
                            bt = llIIIllllI[0];
                            return;
                        }
                        while (lIlIIllllIllI(I.co() ? 1 : 0)) {
                            I.cm();
                            Time.sleepTicks(llIIIllllI[0]);
                            "".length();
                            "".length();
                            if ((((((50 + 27) - (-67)) + 6) ^ (((16 + 178) - 146) + 140)) & (((((132 + 25) - 130) + 117) ^ (((165 + 54) - 88) + 55)) ^ (-" ".length()))) == "  ".length()) {
                                return;
                            }
                        }
                        if (lIlIIllllIllI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIIIllllI[13]);
                            "".length();
                        }
                        int[] iArr10 = new int[llIIIllllI[17]];
                        iArr10[llIIIllllI[1]] = llIIIllllI[14];
                        iArr10[llIIIllllI[0]] = llIIIllllI[12];
                        iArr10[llIIIllllI[4]] = llIIIllllI[15];
                        iArr10[llIIIllllI[6]] = llIIIllllI[18];
                        iArr10[llIIIllllI[7]] = llIIIllllI[11];
                        iArr10[llIIIllllI[16]] = llIIIllllI[10];
                        iArr10[llIIIllllI[13]] = llIIIllllI[8];
                        if (lIlIIllllIlII(C0018e.c(iArr10) ? 1 : 0)) {
                            C0000a.a(llIIIllllI[18], llIIIllllI[7]);
                            C0000a.b(C0019f.aS, llIIIllllI[0]);
                            C0000a.a(llIIIllllI[12], llIIIllllI[13]);
                            C0000a.a(llIIIllllI[19], llIIIllllI[20]);
                            C0000a.a(llIIIllllI[15], llIIIllllI[6]);
                            C0000a.a(llIIIllllI[14], llIIIllllI[21]);
                            int[] iArr11 = new int[llIIIllllI[0]];
                            iArr11[llIIIllllI[1]] = llIIIllllI[8];
                            if (lIlIIllllIlII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[llIIIllllI[0]];
                                iArr12[llIIIllllI[1]] = llIIIllllI[8];
                                if (lIlIIllllIlIl(Inventory.getCount(iArr12), llIIIllllI[0])) {
                                    Bank.withdraw(llIIIllllI[8], llIIIllllI[22], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIllllI[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[llIIIllllI[0]];
                                        iArr13[llIIIllllI[1]] = llIIIllllI[8];
                                        if (lIlIIlllllIIl(Inventory.getCount(iArr13))) {
                                            ?? r0 = llIIIllllI[0];
                                            "".length();
                                            return (-" ".length()) == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIIllllI[1];
                                    }, llIIIllllI[5]);
                                    "".length();
                                }
                            }
                            int[] iArr13 = new int[llIIIllllI[0]];
                            iArr13[llIIIllllI[1]] = llIIIllllI[11];
                            if (lIlIIllllIlII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[llIIIllllI[0]];
                                iArr14[llIIIllllI[1]] = llIIIllllI[11];
                                if (lIlIIllllIlIl(Inventory.getCount(iArr14), llIIIllllI[0])) {
                                    Bank.withdraw(llIIIllllI[11], llIIIllllI[23], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(llIIIllllI[0]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[llIIIllllI[0]];
                                        iArr15[llIIIllllI[1]] = llIIIllllI[11];
                                        if (lIlIIlllllIIl(Inventory.getCount(iArr15))) {
                                            ?? r0 = llIIIllllI[0];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIIllllI[1];
                                    }, llIIIllllI[5]);
                                    "".length();
                                }
                            }
                            if (lIlIIllllIlIl(Skills.getLevel(Skill.MAGIC), llIIIllllI[2])) {
                                C0000a.a(llIIIllllI[10], llIIIllllI[22]);
                            }
                        }
                    }
                }
            }
            if (lIlIIllllIlII(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIIllllIlIl(Movement.getRunEnergy(), llIIIllllI[24])) {
                Inventory.getFirst(C0019f.ba).interact(llIIIlllII[llIIIllllI[13]]);
                Time.sleepTicks(llIIIllllI[0]);
                "".length();
            }
            if (lIlIIlllllIlI(lIlIIllllIIll(C0018e.w(), 50.0d))) {
                int[] iArr15 = new int[llIIIllllI[0]];
                iArr15[llIIIllllI[1]] = llIIIllllI[19];
                if (lIlIIllllIlII(Inventory.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[llIIIllllI[0]];
                    iArr16[llIIIllllI[1]] = llIIIllllI[19];
                    Inventory.getFirst(iArr16).interact(llIIIlllII[llIIIllllI[17]]);
                    Time.sleepTicks(llIIIllllI[0]);
                    "".length();
                }
            }
            if (lIlIIllllIlII(an() ? 1 : 0) && lIlIIllllIlIl(C0018e.j(gX), llIIIllllI[0])) {
                if (lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    cU();
                }
                if (lIlIIllllIlII(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0020g.a(llIIIlllII[llIIIllllI[20]], cE);
                }
            }
            if ((!lIlIIlllllIll(C0018e.j(gX), llIIIllllI[0]) || !lIlIIlllllIll(C0018e.j(gX), llIIIllllI[4]) || lIlIIllllllII(C0018e.j(gX), llIIIllllI[6])) && lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIllI(gZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gO), llIIIllllI[20]) && lIlIIllllIllI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlllII[llIIIllllI[25]];
                    Movement.walkTo(gO);
                    "".length();
                    Time.sleepTicks(llIIIllllI[0]);
                    "".length();
                }
                if (lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gO), llIIIllllI[20])) {
                    C0020g.a(llIIIlllII[llIIIllllI[21]], cE);
                }
            }
            if (lIlIIllllllII(C0018e.j(gX), llIIIllllI[7])) {
                di = llIIIllllI[1];
                if (lIlIIllllIllI(Vars.getBit(llIIIllllI[26]))) {
                    if (lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gQ), llIIIllllI[7])) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[27]];
                        Movement.walkTo(gQ);
                        "".length();
                        Time.sleepTicks(llIIIllllI[0]);
                        "".length();
                    }
                    if (lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gQ), llIIIllllI[7])) {
                        String[] strArr = new String[llIIIllllI[0]];
                        strArr[llIIIllllI[1]] = llIIIlllII[llIIIllllI[28]];
                        TileObject nearest2 = TileObjects.getNearest(strArr);
                        String[] strArr2 = new String[llIIIllllI[0]];
                        strArr2[llIIIllllI[1]] = llIIIlllII[llIIIllllI[2]];
                        if (lIlIIllllIlII(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            String[] strArr3 = new String[llIIIllllI[0]];
                            strArr3[llIIIllllI[1]] = llIIIlllII[llIIIllllI[29]];
                            TileObjects.getNearest(strArr3).interact(llIIIlllII[llIIIllllI[30]]);
                            Time.sleepTicks(llIIIllllI[6]);
                            "".length();
                        }
                        String[] strArr4 = new String[llIIIllllI[0]];
                        strArr4[llIIIllllI[1]] = llIIIlllII[llIIIllllI[31]];
                        TileObject nearest3 = TileObjects.getNearest(strArr4);
                        String[] strArr5 = new String[llIIIllllI[0]];
                        strArr5[llIIIllllI[1]] = llIIIlllII[llIIIllllI[32]];
                        if (lIlIIllllIllI(nearest3.hasAction(strArr5) ? 1 : 0)) {
                            C0020g.a(llIIIlllII[llIIIllllI[33]], cE);
                        }
                    }
                }
                if (lIlIIllllllII(Vars.getBit(llIIIllllI[26]), llIIIllllI[0]) && lIlIIllllIllI(Vars.getBit(llIIIllllI[34]))) {
                    if (lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gR), llIIIllllI[13])) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[35]];
                        Movement.walkTo(gR);
                        "".length();
                        Time.sleepTicks(llIIIllllI[0]);
                        "".length();
                    }
                    if (lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gR), llIIIllllI[13])) {
                        C0020g.a(llIIIlllII[llIIIllllI[36]], cE);
                    }
                }
                if (lIlIIllllllII(Vars.getBit(llIIIllllI[26]), llIIIllllI[0]) && lIlIIllllllII(Vars.getBit(llIIIllllI[34]), llIIIllllI[0]) && lIlIIllllIllI(Vars.getBit(llIIIllllI[37]))) {
                    if (lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gS), llIIIllllI[13])) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[38]];
                        Movement.walkTo(gS);
                        "".length();
                        Time.sleepTicks(llIIIllllI[0]);
                        "".length();
                    }
                    if (lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gS), llIIIllllI[13])) {
                        C0020g.a(llIIIlllII[llIIIllllI[39]], cE);
                    }
                }
                if (lIlIIllllllII(Vars.getBit(llIIIllllI[26]), llIIIllllI[0]) && lIlIIllllllII(Vars.getBit(llIIIllllI[34]), llIIIllllI[0]) && lIlIIllllllII(Vars.getBit(llIIIllllI[37]), llIIIllllI[0])) {
                    if (lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gT), llIIIllllI[4])) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[40]];
                        Movement.walkTo(gT);
                        "".length();
                        Time.sleepTicks(llIIIllllI[0]);
                        "".length();
                    }
                    if (lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gT), llIIIllllI[4])) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[41]];
                        if (lIlIIllllIllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr6 = new String[llIIIllllI[0]];
                            strArr6[llIIIllllI[1]] = llIIIlllII[llIIIllllI[42]];
                            TileObjects.getNearest(strArr6).interact(llIIIlllII[llIIIllllI[43]]);
                            Time.sleepTicks(llIIIllllI[6]);
                            "".length();
                        }
                        int bit = Vars.getBit(llIIIllllI[44]);
                        if (lIlIIllllIllI(Dialog.getOptions().isEmpty() ? 1 : 0)) {
                            System.out.println("Selecting " + bit);
                            if (lIlIIllllIllI(bit)) {
                                String[] strArr7 = new String[llIIIllllI[0]];
                                strArr7[llIIIllllI[1]] = llIIIlllII[llIIIllllI[45]];
                                Dialog.chooseOption(strArr7);
                                "".length();
                            }
                            if (lIlIIllllllII(bit, llIIIllllI[0])) {
                                String[] strArr8 = new String[llIIIllllI[0]];
                                strArr8[llIIIllllI[1]] = llIIIlllII[llIIIllllI[46]];
                                Dialog.chooseOption(strArr8);
                                "".length();
                            }
                            if (lIlIIllllllII(bit, llIIIllllI[4])) {
                                String[] strArr9 = new String[llIIIllllI[0]];
                                strArr9[llIIIllllI[1]] = llIIIlllII[llIIIllllI[47]];
                                Dialog.chooseOption(strArr9);
                                "".length();
                            }
                            if (lIlIIllllllII(bit, llIIIllllI[6])) {
                                String[] strArr10 = new String[llIIIllllI[0]];
                                strArr10[llIIIllllI[1]] = llIIIlllII[llIIIllllI[48]];
                                Dialog.chooseOption(strArr10);
                                "".length();
                            }
                            Time.sleepTicks(llIIIllllI[4]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIIllllllII(C0018e.j(gX), llIIIllllI[16])) {
                WorldArea worldArea = new WorldArea(llIIIllllI[49], llIIIllllI[50], llIIIllllI[17], llIIIllllI[16], llIIIllllI[1]);
                if (lIlIIllllIllI(Players.getLocal().getWorldLocation().getPlane())) {
                    WorldArea worldArea2 = new WorldArea(llIIIllllI[51], llIIIllllI[50], llIIIllllI[28], llIIIllllI[13], llIIIllllI[1]);
                    WorldArea worldArea3 = new WorldArea(llIIIllllI[51], llIIIllllI[52], llIIIllllI[7], llIIIllllI[16], llIIIllllI[1]);
                    WorldArea worldArea4 = new WorldArea(llIIIllllI[53], llIIIllllI[54], llIIIllllI[7], llIIIllllI[4], llIIIllllI[1]);
                    WorldArea worldArea5 = new WorldArea(llIIIllllI[53], llIIIllllI[52], llIIIllllI[6], llIIIllllI[6], llIIIllllI[1]);
                    if (lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gU), llIIIllllI[4]) && lIlIIllllIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllII[llIIIllllI[55]];
                        Movement.walkTo(gU);
                        "".length();
                        Time.sleepTicks(llIIIllllI[0]);
                        "".length();
                    }
                    if (lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gU), llIIIllllI[4]) && lIlIIllllIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr11 = new String[llIIIllllI[0]];
                        strArr11[llIIIllllI[1]] = llIIIlllII[llIIIllllI[56]];
                        TileObjects.getNearest(strArr11).interact(llIIIlllII[llIIIllllI[57]]);
                        Time.sleepTicks(llIIIllllI[4]);
                        "".length();
                    }
                    if (lIlIIllllIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIllllI[58], llIIIllllI[59], llIIIllllI[1])), llIIIllllI[4])) {
                            Movement.walkTo(new WorldPoint(llIIIllllI[58], llIIIllllI[59], llIIIllllI[1]));
                            "".length();
                            Time.sleepTicks(llIIIllllI[0]);
                            "".length();
                        }
                        if (lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIIllllI[58], llIIIllllI[59], llIIIllllI[1])), llIIIllllI[4])) {
                            String[] strArr12 = new String[llIIIllllI[0]];
                            strArr12[llIIIllllI[1]] = llIIIlllII[llIIIllllI[60]];
                            TileObject nearest4 = TileObjects.getNearest(strArr12);
                            String[] strArr13 = new String[llIIIllllI[0]];
                            strArr13[llIIIllllI[1]] = llIIIlllII[llIIIllllI[61]];
                            if (lIlIIllllIlII(nearest4.hasAction(strArr13) ? 1 : 0)) {
                                String[] strArr14 = new String[llIIIllllI[0]];
                                strArr14[llIIIllllI[1]] = llIIIlllII[llIIIllllI[62]];
                                TileObjects.getNearest(strArr14).interact(llIIIlllII[llIIIllllI[63]]);
                                Time.sleepTicks(llIIIllllI[4]);
                                "".length();
                            }
                            String[] strArr15 = new String[llIIIllllI[0]];
                            strArr15[llIIIllllI[1]] = llIIIlllII[llIIIllllI[64]];
                            TileObject nearest5 = TileObjects.getNearest(strArr15);
                            String[] strArr16 = new String[llIIIllllI[0]];
                            strArr16[llIIIllllI[1]] = llIIIlllII[llIIIllllI[65]];
                            if (lIlIIllllIllI(nearest5.hasAction(strArr16) ? 1 : 0)) {
                                String[] strArr17 = new String[llIIIllllI[0]];
                                strArr17[llIIIllllI[1]] = llIIIlllII[llIIIllllI[66]];
                                TileObjects.getNearest(strArr17).interact(llIIIlllII[llIIIllllI[67]]);
                                Time.sleepTicks(llIIIllllI[16]);
                                "".length();
                            }
                        }
                        if (!lIlIIllllIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lIlIIllllIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lIlIIllllIllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIllllIlII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr18 = new String[llIIIllllI[0]];
                            strArr18[llIIIllllI[1]] = llIIIlllII[llIIIllllI[68]];
                            TileObjects.getNearest(strArr18).interact(llIIIlllII[llIIIllllI[69]]);
                            Time.sleepTicks(llIIIllllI[16]);
                            "".length();
                        }
                    }
                }
                if (lIlIIllllllII(Players.getLocal().getWorldLocation().getPlane(), llIIIllllI[0])) {
                    AccBuilderSotf.c = llIIIlllII[llIIIllllI[70]];
                    String[] strArr19 = new String[llIIIllllI[0]];
                    strArr19[llIIIllllI[1]] = llIIIlllII[llIIIllllI[3]];
                    if (lIlIIlllllIII(TileObjects.getNearest(strArr19))) {
                        String[] strArr20 = new String[llIIIllllI[0]];
                        strArr20[llIIIllllI[1]] = llIIIlllII[llIIIllllI[71]];
                        TileObjects.getNearest(strArr20).interact(llIIIlllII[llIIIllllI[72]]);
                        Time.sleepTicks(llIIIllllI[16]);
                        "".length();
                    }
                    String[] strArr21 = new String[llIIIllllI[0]];
                    strArr21[llIIIllllI[1]] = llIIIlllII[llIIIllllI[73]];
                    if (lIlIIlllllIII(TileObjects.getNearest(strArr21))) {
                        String[] strArr22 = new String[llIIIllllI[0]];
                        strArr22[llIIIllllI[1]] = llIIIlllII[llIIIllllI[74]];
                        TileObjects.getNearest(strArr22).interact(llIIIlllII[llIIIllllI[24]]);
                        Time.sleepTicks(llIIIllllI[4]);
                        "".length();
                    }
                }
            }
            if (lIlIIllllllII(C0018e.j(gX), llIIIllllI[13])) {
                if (lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    cU();
                }
                if (lIlIIllllIlII(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0020g.a(llIIIlllII[llIIIllllI[75]], cE);
                }
            }
            if (lIlIIllllllII(C0018e.j(gX), llIIIllllI[17])) {
                if (lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gW), llIIIllllI[25])) {
                    AccBuilderSotf.c = llIIIlllII[llIIIllllI[76]];
                    Movement.walkTo(gW);
                    "".length();
                    Time.sleepTicks(llIIIllllI[4]);
                    "".length();
                }
                if (lIlIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(gW), llIIIllllI[25])) {
                    if (lIlIIllllIllI(C0026m.ap() ? 1 : 0)) {
                        C0026m.aq();
                    }
                    String[] strArr23 = new String[llIIIllllI[0]];
                    strArr23[llIIIllllI[1]] = llIIIlllII[llIIIllllI[77]];
                    NPC nearest6 = NPCs.getNearest(strArr23);
                    NPC nearest7 = NPCs.getNearest(npc -> {
                        if (lIlIIllllIlII(npc.getName().contains(llIIIlllII[llIIIllllI[111]]) ? 1 : 0) && lIlIlIIIIIIII(npc.getInteracting(), Players.getLocal())) {
                            ?? r0 = llIIIllllI[0];
                            "".length();
                            return "   ".length() < 0 ? ((248 ^ 128) ^ (190 ^ 138)) & (((210 ^ 161) ^ (88 ^ 103)) ^ (-" ".length())) : r0;
                        }
                        return llIIIllllI[1];
                    });
                    if (lIlIIlllllIII(nearest6) && lIlIIllllllll(nearest7)) {
                        String[] strArr24 = new String[llIIIllllI[0]];
                        strArr24[llIIIllllI[1]] = llIIIlllII[llIIIllllI[78]];
                        if (lIlIIllllIllI(nearest6.hasAction(strArr24) ? 1 : 0)) {
                            C0020g.a(llIIIlllII[llIIIllllI[79]], cE);
                        }
                        String[] strArr25 = new String[llIIIllllI[0]];
                        strArr25[llIIIllllI[1]] = llIIIlllII[llIIIllllI[80]];
                        if (lIlIIllllIlII(nearest6.hasAction(strArr25) ? 1 : 0) && lIlIIllllllll(Players.getLocal().getInteracting())) {
                            AccBuilderSotf.c = llIIIlllII[llIIIllllI[81]];
                            if (lIlIIllllIllI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                            }
                        }
                    }
                    if (lIlIIllllIlIl(Prayers.getPoints(), llIIIllllI[40]) && lIlIIllllIlII(Inventory.contains(C0019f.aX) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.aX).interact(llIIIlllII[llIIIllllI[82]]);
                        Time.sleepTicks(llIIIllllI[0]);
                        "".length();
                    }
                    C0020g.a(cE);
                }
            }
            if (lIlIIllllllII(C0018e.j(gX), llIIIllllI[20])) {
                String[] strArr26 = new String[llIIIllllI[0]];
                strArr26[llIIIllllI[1]] = llIIIlllII[llIIIllllI[83]];
                if (lIlIIllllIllI(Inventory.contains(strArr26) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIlllII[llIIIllllI[84]];
                    String[] strArr27 = new String[llIIIllllI[0]];
                    strArr27[llIIIllllI[1]] = llIIIlllII[llIIIllllI[85]];
                    TileItems.getNearest(strArr27).interact(llIIIlllII[llIIIllllI[86]]);
                    Time.sleepTicks(llIIIllllI[7]);
                    "".length();
                }
                String[] strArr28 = new String[llIIIllllI[0]];
                strArr28[llIIIllllI[1]] = llIIIlllII[llIIIllllI[87]];
                if (lIlIIllllIlII(Inventory.contains(strArr28) ? 1 : 0)) {
                    if (lIlIIllllIlII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    if (lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        cU();
                    }
                    if (lIlIIllllIlII(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIlIIllllIlIl(di, llIIIllllI[0])) {
                            aN.qk += llIIIllllI[0];
                            aN.u(AccBuilderSotf.m);
                            di += llIIIllllI[0];
                            aN.qk = llIIIllllI[1];
                            dj = llIIIllllI[1];
                        }
                        C0020g.a(llIIIlllII[llIIIllllI[88]], cE);
                    }
                }
            }
            C0020g.a(cE);
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIIlllII[llIIIllllI[109]];
    }

    private static void lIlIIllllIIIl() {
        llIIIlllII = new String[llIIIllllI[140]];
        llIIIlllII[llIIIllllI[1]] = lIlIIlllIlIll("goqjB9xVM6zRcb3/v4ByCJ0XDZ5w5aIu9BuSewuaedFNHus8v/znTFqrJMUqNUdU", "cPxbv");
        llIIIlllII[llIIIllllI[0]] = lIlIIlllIlIll("AXHaamSd1h4=", "BQkzM");
        llIIIlllII[llIIIllllI[4]] = lIlIIlllIllII("FjMGdDM3chI1KTM=", "XRpTG");
        llIIIlllII[llIIIllllI[6]] = lIlIIlllIlIll("jIbEPiLdX7voB87cBu6u+REZHsC6SdLs", "uqtRH");
        llIIIlllII[llIIIllllI[7]] = lIlIIlllIllIl("iyz+hY2hFqDvj/yihoFEb0FS3/C+p5pMlo+QJ6DI4nIX5yvIAm80eTIKD7130oxG", "UTreh");
        llIIIlllII[llIIIllllI[16]] = lIlIIlllIllIl("Ral5nXTMNRe9tdWqHmJTzSmpBdQC2/EE3klPSZVKNL/WadAVqc+uzto2CeISmkHGKpAK0YperIY=", "gigdZ");
        llIIIlllII[llIIIllllI[13]] = lIlIIlllIllIl("MocrH+gXCXw=", "korqs");
        llIIIlllII[llIIIllllI[17]] = lIlIIlllIllIl("wHwcjmFkJro=", "ZvIYR");
        llIIIlllII[llIIIllllI[20]] = lIlIIlllIllIl("1AsJxZ78WI5mG7xrnOsAUw==", "vTXXA");
        llIIIlllII[llIIIllllI[25]] = lIlIIlllIllII("OAYfSjsZRwoFIhsGBw4qBA==", "vgijO");
        llIIIlllII[llIIIllllI[21]] = lIlIIlllIllII("NwE/ChUaCjcVVDkBPBMVHQ==", "tnRgt");
        llIIIlllII[llIIIllllI[27]] = lIlIIlllIllIl("eJZw9QUSxaCgjo/caUkZsA==", "kIoJs");
        llIIIlllII[llIIIllllI[28]] = lIlIIlllIlIll("oXFNMhozY7g=", "MtOHD");
        llIIIlllII[llIIIllllI[2]] = lIlIIlllIllIl("MRHCD/P9rv8=", "JPgap");
        llIIIlllII[llIIIllllI[29]] = lIlIIlllIlIll("bL/DmafG/Nc=", "tykoz");
        llIIIlllII[llIIIllllI[30]] = lIlIIlllIllIl("TmizxaAQp54=", "icvjA");
        llIIIlllII[llIIIllllI[31]] = lIlIIlllIllIl("/Ko8XoTezjw=", "XHbpP");
        llIIIlllII[llIIIllllI[32]] = lIlIIlllIllIl("haOsRupmU5E=", "fatwF");
        llIIIlllII[llIIIllllI[33]] = lIlIIlllIllIl("FOpT6DA5jy6WafNw3HBfmw==", "DrSih");
        llIIIlllII[llIIIllllI[35]] = lIlIIlllIllII("CCA5UyMpYTsBNiUqKgE=", "FAOsW");
        llIIIlllII[llIIIllllI[36]] = lIlIIlllIllIl("/sqxgSE3/3vJ7PYfrcuDDA==", "AyILf");
        llIIIlllII[llIIIllllI[38]] = lIlIIlllIlIll("ICRqDSORfrLJVqWiHJsxUg==", "evDIb");
        llIIIlllII[llIIIllllI[39]] = lIlIIlllIlIll("pcFC/mI5ki9xz6axQz5LDg==", "CfVah");
        llIIIlllII[llIIIllllI[40]] = lIlIIlllIllII("LSU+eQcMZCo4Hw8tOy0S", "cDHYs");
        llIIIlllII[llIIIllllI[41]] = lIlIIlllIllII("KSQ+HSkI", "oMLtG");
        llIIIlllII[llIIIllllI[42]] = lIlIIlllIllII("DRInNgw8Byo=", "OsKZe");
        llIIIlllII[llIIIllllI[43]] = lIlIIlllIllII("MTA9Hw==", "wYOzc");
        llIIIlllII[llIIIllllI[45]] = lIlIIlllIllIl("jY60rY4EZpQ=", "JozkY");
        llIIIlllII[llIIIllllI[46]] = lIlIIlllIllII("ZVFVRg==", "Uaetr");
        llIIIlllII[llIIIllllI[47]] = lIlIIlllIllII("c2lDXw==", "CYslS");
        llIIIlllII[llIIIllllI[48]] = lIlIIlllIllII("VWRAdw==", "eTpCf");
        llIIIlllII[llIIIllllI[55]] = lIlIIlllIllII("FjMHajo3chI4OzUwHS8=", "XRqJN");
        llIIIlllII[llIIIllllI[56]] = lIlIIlllIllIl("PwiL9XD4fdbSFG3RqRznBg==", "VwADn");
        llIIIlllII[llIIIllllI[57]] = lIlIIlllIllII("DgAvJwNgAzAvEw==", "MlFJa");
        llIIIlllII[llIIIllllI[60]] = lIlIIlllIlIll("CotqHkaJ5Fc=", "jMGVS");
        llIIIlllII[llIIIllllI[61]] = lIlIIlllIllII("AzokFA==", "LJAzn");
        llIIIlllII[llIIIllllI[62]] = lIlIIlllIlIll("LcREWdJSyPo=", "QOPSC");
        llIIIlllII[llIIIllllI[63]] = lIlIIlllIllIl("x20sXf9wjXo=", "sVGtq");
        llIIIlllII[llIIIllllI[64]] = lIlIIlllIllIl("qDRzvKVeVyc=", "bJyaq");
        llIIIlllII[llIIIllllI[65]] = lIlIIlllIllIl("1bcq0/HkMvc=", "YiGVK");
        llIIIlllII[llIIIllllI[66]] = lIlIIlllIllII("DzMzNhYx", "CRWRs");
        llIIIlllII[llIIIllllI[67]] = lIlIIlllIllII("KR0TAhVHBAo=", "jqzow");
        llIIIlllII[llIIIllllI[68]] = lIlIIlllIlIll("28N2ydGZcnk=", "PjAiv");
        llIIIlllII[llIIIllllI[69]] = lIlIIlllIlIll("G5puMaj5JDtvqdnJI2meqA==", "TgDCj");
        llIIIlllII[llIIIllllI[70]] = lIlIIlllIllII("JBoXLngMGhQ=", "chvLX");
        llIIIlllII[llIIIllllI[3]] = lIlIIlllIllIl("HP3gPMAz80XXGBDNn0JP+A==", "dUuZZ");
        llIIIlllII[llIIIllllI[71]] = lIlIIlllIlIll("rer5Tba5qMCsJyrot4CR+g==", "FOQTb");
        llIIIlllII[llIIIllllI[72]] = lIlIIlllIllIl("vK3AyN/tfWI=", "Ujpwe");
        llIIIlllII[llIIIllllI[73]] = lIlIIlllIlIll("RvxcUwrQcQo2x7+6akI+yA==", "LOxuL");
        llIIIlllII[llIIIllllI[74]] = lIlIIlllIllIl("Fk661Ig+5YpBKMQcWdBH3g==", "BvzwJ");
        llIIIlllII[llIIIllllI[24]] = lIlIIlllIllII("Ih0ABwsZ", "qxauh");
        llIIIlllII[llIIIllllI[75]] = lIlIIlllIlIll("jDaw51qdEW4PY3vgN8FxLw==", "hBMzT");
        llIIIlllII[llIIIllllI[76]] = lIlIIlllIllIl("2CC3rwP/RN15LG44gXPZrAGBISVOKexo", "YkFzh");
        llIIIlllII[llIIIllllI[77]] = lIlIIlllIllII("GCsGKgIhJ0cnAiEvCCIH", "SCgPc");
        llIIIlllII[llIIIllllI[78]] = lIlIIlllIllIl("o94B4y8f5hk=", "zccHr");
        llIIIlllII[llIIIllllI[79]] = lIlIIlllIlIll("qsmK+mY/eO1cgt549YGhAw==", "TwgFW");
        llIIIlllII[llIIIllllI[80]] = lIlIIlllIllIl("HJQGTOjbfU0=", "kljkY");
        llIIIlllII[llIIIllllI[81]] = lIlIIlllIllIl("TTg3hzwcg0mXptFZEXBcWg==", "fHiVZ");
        llIIIlllII[llIIIllllI[82]] = lIlIIlllIllII("Fzs7BSc=", "SIRkL");
        llIIIlllII[llIIIllllI[83]] = lIlIIlllIlIll("kzARCbcrZhvBTVt6pe09CTsPSJsRd5qV", "uewDT");
        llIIIlllII[llIIIllllI[84]] = lIlIIlllIllIl("Uk2npbaqbvBmdPnz6Nk3wA==", "xkamZ");
        llIIIlllII[llIIIllllI[85]] = lIlIIlllIlIll("r+pjXxLigWhyePg/ygvpgZfKe7eNoXZg", "SLtrv");
        llIIIlllII[llIIIllllI[86]] = lIlIIlllIllII("NycPEw==", "cFdvL");
        llIIIlllII[llIIIllllI[87]] = lIlIIlllIlIll("tYNebx1XOv0FZsFucSAo5SxZhSCPZ3pZ", "QnGBm");
        llIIIlllII[llIIIllllI[88]] = lIlIIlllIllII("DSgPElcELg0HEig=", "FAauw");
        llIIIlllII[llIIIllllI[89]] = lIlIIlllIllII("Ow4dczcaTxgnIgcb", "uokSC");
        llIIIlllII[llIIIllllI[100]] = lIlIIlllIllIl("Ov2u3Yx4vGCgs12oE2cG1w==", "ZlBYi");
        llIIIlllII[llIIIllllI[101]] = lIlIIlllIlIll("YCKx37s1/ivuOXsRTYTI9A==", "fYrkY");
        llIIIlllII[llIIIllllI[102]] = lIlIIlllIllII("BzsMFBIuL1QFHyYlDBYf", "TJyqw");
        llIIIlllII[llIIIllllI[109]] = lIlIIlllIlIll("P0dJtqqz72/bEjtdfsUNlvpbTVsyNkKx", "KPxcE");
        llIIIlllII[llIIIllllI[110]] = lIlIIlllIllII("MyQeBFkuK1AUHCAhBAtZaQ==", "AMpcy");
        llIIIlllII[llIIIllllI[111]] = lIlIIlllIllII("OxADCyoqEA==", "ObldZ");
        llIIIlllII[llIIIllllI[130]] = lIlIIlllIlIll("Vi0ik7wfJ6ChSFlGyaKiObNXdG0Y1aJd", "ufguB");
        llIIIlllII[llIIIllllI[131]] = lIlIIlllIllII("GkcDJQI/A1QoEnMAGCsTcxMbah82CwRk", "SgtJw");
        llIIIlllII[llIIIllllI[132]] = lIlIIlllIllII("BjhURBxuPxREMignEAEnaSAXCTBpJBcLMWc=", "ISxdU");
        llIIIlllII[llIIIllllI[133]] = lIlIIlllIllIl("LFlolt2GztA1jbtIcEOV2EmbHZHJ0rd6", "ReybG");
        llIIIlllII[llIIIllllI[134]] = lIlIIlllIllIl("VDY8DvDB7nk9ICS9iJcMkqCf3lwOyNABTNmZ+sAFlI1ohhFxAbK+kvpGw9bKKWhzSn1w9qSjPDQ=", "omriw");
        llIIIlllII[llIIIllllI[135]] = lIlIIlllIllII("IBMjSw==", "yvPen");
    }

    private static String lIlIIlllIlIll(String llllllllllllllllllIlIlIlIlIIlllI, String llllllllllllllllllIlIlIlIlIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), llIIIllllI[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllllI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlIlIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIlIlIlIIllll) {
            llllllllllllllllllIlIlIlIlIIllll.printStackTrace();
            return null;
        }
    }

    private static void cU() {
        if (lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gN), llIIIllllI[4])) {
            AccBuilderSotf.c = llIIIlllII[llIIIllllI[89]];
            WorldArea worldArea = new WorldArea(llIIIllllI[90], llIIIllllI[91], llIIIllllI[92], llIIIllllI[93], llIIIllllI[1]);
            new WorldPoint(llIIIllllI[94], llIIIllllI[95], llIIIllllI[1]);
            WorldArea worldArea2 = new WorldArea(llIIIllllI[96], llIIIllllI[97], llIIIllllI[35], llIIIllllI[7], llIIIllllI[1]);
            WorldArea worldArea3 = new WorldArea(llIIIllllI[98], llIIIllllI[99], llIIIllllI[20], llIIIllllI[16], llIIIllllI[1]);
            if (lIlIIllllIlII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (lIlIIllllIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Equipment.getFirst(C0019f.aS).interact(llIIIlllII[llIIIllllI[100]]);
                Time.sleepTicks(llIIIllllI[16]);
                "".length();
            }
            if (lIlIIllllIllI(O.ks.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(O.kt);
                "".length();
            }
            if (lIlIIllllIlII(O.ks.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllllIllI(gZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Walker.stepAlong(List.of((Object[]) O.jy));
                "".length();
                Time.sleepTicks(llIIIllllI[0]);
                "".length();
            }
            if (!lIlIIllllIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIllllIlII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr = new String[llIIIllllI[0]];
                strArr[llIIIllllI[1]] = llIIIlllII[llIIIllllI[101]];
                TileObjects.getNearest(strArr).interact(llIIIlllII[llIIIllllI[102]]);
                Time.sleepTicks(llIIIllllI[7]);
                "".length();
            }
            if ((!lIlIIllllIllI(gY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIllllIlII(gZ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIlIIllllllIl(Players.getLocal().getWorldLocation().distanceTo(gN), llIIIllllI[4])) {
                Movement.walkTo(gN);
                "".length();
                Time.sleepTicks(llIIIllllI[0]);
                "".length();
            }
        }
    }

    private static boolean lIlIIllllllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlIIIIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIllllllll(Object obj) {
        return obj == null;
    }

    private static String lIlIIlllIllII(String llllllllllllllllllIlIlIlIIlllllI, String llllllllllllllllllIlIlIlIIllllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIlIlIlIIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIlIlIIllllII = new StringBuilder();
        char[] charArray = llllllllllllllllllIlIlIlIIllllIl.toCharArray();
        int llllllllllllllllllIlIlIlIIlllIlI = llIIIllllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIIllllI[1];
        while (lIlIIllllIlIl(i, length)) {
            char llllllllllllllllllIlIlIlIIllllll = charArray2[i];
            llllllllllllllllllIlIlIlIIllllII.append((char) (llllllllllllllllllIlIlIlIIllllll ^ charArray[llllllllllllllllllIlIlIlIIlllIlI % charArray.length]));
            "".length();
            llllllllllllllllllIlIlIlIIlllIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIlIlIlIIllllII);
    }
}
