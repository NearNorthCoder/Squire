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
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aC  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aC.class */
public class aC implements InterfaceC0003ac {
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int pb;
    private static /* synthetic */ String[] lIlllIllII;
    public static /* synthetic */ int[] nx;
    public static /* synthetic */ int[] ny;
    public static final /* synthetic */ int oY;
    public static final /* synthetic */ int[] pc;
    private static /* synthetic */ int[] lIlllIllIl;
    public static final /* synthetic */ int oZ;
    public static final /* synthetic */ int oW;
    public static /* synthetic */ List<C0017d> bv;
    public static final /* synthetic */ int oX;
    public static /* synthetic */ WorldArea y;
    public static /* synthetic */ WorldPoint F;
    public static final /* synthetic */ int pa;

    static {
        lIIllllIIllIl();
        lIIllllIIllII();
        oY = lIlllIllIl[8];
        oZ = lIlllIllIl[9];
        pb = lIlllIllIl[17];
        pa = lIlllIllIl[10];
        oW = lIlllIllIl[6];
        oX = lIlllIllIl[7];
        int[] iArr = new int[lIlllIllIl[27]];
        iArr[lIlllIllIl[0]] = lIlllIllIl[44];
        iArr[lIlllIllIl[1]] = lIlllIllIl[45];
        iArr[lIlllIllIl[2]] = lIlllIllIl[46];
        iArr[lIlllIllIl[3]] = lIlllIllIl[47];
        iArr[lIlllIllIl[5]] = lIlllIllIl[48];
        iArr[lIlllIllIl[23]] = lIlllIllIl[49];
        iArr[lIlllIllIl[21]] = lIlllIllIl[50];
        iArr[lIlllIllIl[25]] = lIlllIllIl[51];
        iArr[lIlllIllIl[26]] = lIlllIllIl[52];
        pc = iArr;
        bv = new ArrayList();
        int[] iArr2 = new int[lIlllIllIl[2]];
        iArr2[lIlllIllIl[0]] = lIlllIllIl[53];
        iArr2[lIlllIllIl[1]] = lIlllIllIl[54];
        nx = iArr2;
        int[] iArr3 = new int[lIlllIllIl[2]];
        iArr3[lIlllIllIl[0]] = lIlllIllIl[55];
        iArr3[lIlllIllIl[1]] = lIlllIllIl[56];
        ny = iArr3;
        y = new WorldArea(lIlllIllIl[57], lIlllIllIl[58], lIlllIllIl[59], lIlllIllIl[60], lIlllIllIl[0]);
        F = new WorldPoint(lIlllIllIl[61], lIlllIllIl[62], lIlllIllIl[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lIlllIllIl[0];
    }

    private static String lIIllllIIlIlI(String llllllllllllllllllIllllIIIIlIlII, String llllllllllllllllllIllllIIIIlIIll) {
        String llllllllllllllllllIllllIIIIlIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIllllIIIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllllIIIIlIIlI = new StringBuilder();
        char[] llllllllllllllllllIllllIIIIlIIIl = llllllllllllllllllIllllIIIIlIIll.toCharArray();
        int llllllllllllllllllIllllIIIIlIIII = lIlllIllIl[0];
        char[] charArray = llllllllllllllllllIllllIIIIlIlII2.toCharArray();
        int length = charArray.length;
        int i = lIlllIllIl[0];
        while (lIIllllIIllll(i, length)) {
            llllllllllllllllllIllllIIIIlIIlI.append((char) (charArray[i] ^ llllllllllllllllllIllllIIIIlIIIl[llllllllllllllllllIllllIIIIlIIII % llllllllllllllllllIllllIIIIlIIIl.length]));
            "".length();
            llllllllllllllllllIllllIIIIlIIII++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIllllIIIIlIIlI);
    }

    private static boolean lIIllllIlIIII(int i) {
        return i == 0;
    }

    private static boolean lIIllllIlIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIllllIlIIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIIllllIlIIll(Skills.getLevel(Skill.MINING), lIlllIllIl[42])) {
            ?? r0 = lIlllIllIl[1];
            "".length();
            return 0 != 0 ? ((((151 + 138) - 155) + 63) ^ (((75 + 83) - (-5)) + 29)) & (((((70 + 111) - 37) + 0) ^ (((61 + 50) - (-26)) + 12)) ^ (-" ".length())) : r0;
        }
        return lIlllIllIl[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        fQ();
        return lIlllIllIl[40];
    }

    private static boolean lIIllllIIllll(int i, int i2) {
        return i < i2;
    }

    private static void lIIllllIIllIl() {
        lIlllIllIl = new int[64];
        lIlllIllIl[0] = (65 ^ 127) & ((81 ^ 111) ^ (-1));
        lIlllIllIl[1] = " ".length();
        lIlllIllIl[2] = "  ".length();
        lIlllIllIl[3] = "   ".length();
        lIlllIllIl[4] = (-19521) & 24520;
        lIlllIllIl[5] = (6 ^ 96) ^ (104 ^ 10);
        lIlllIllIl[6] = (-((-4569) & 23007)) & (-12553) & 32255;
        lIlllIllIl[7] = (-((-3495) & 15791)) & (-2563) & 16127;
        lIlllIllIl[8] = (-14339) & 15611;
        lIlllIllIl[9] = (-((-2281) & 22761)) & (-2057) & 23807;
        lIlllIllIl[10] = (-((-1325) & 10029)) & (-16641) & 26619;
        lIlllIllIl[11] = (-20900) & 32759;
        lIlllIllIl[12] = (-((-11891) & 16379)) & (-16390) & 32733;
        lIlllIllIl[13] = (-((-17007) & 17263)) & (-177) & 12286;
        lIlllIllIl[14] = (-((-3271) & 23783)) & (-148) & 32511;
        lIlllIllIl[15] = (-257) & 12114;
        lIlllIllIl[16] = (-((-3131) & 7615)) & (-33) & 16366;
        lIlllIllIl[17] = (-20752) & 32719;
        lIlllIllIl[18] = 198 ^ 158;
        lIlllIllIl[19] = (-4129) & 16108;
        lIlllIllIl[20] = (-((-24073) & 32269)) & (-17) & 28447;
        lIlllIllIl[21] = 46 ^ 40;
        lIlllIllIl[22] = (132 ^ 181) ^ (70 ^ 99);
        lIlllIllIl[23] = (((157 + 38) - 192) + 181) ^ (((95 + 132) - 156) + 118);
        lIlllIllIl[24] = 165 ^ 170;
        lIlllIllIl[25] = 81 ^ 86;
        lIlllIllIl[26] = (((81 + 43) - 17) + 83) ^ (((173 + 127) - 247) + 129);
        lIlllIllIl[27] = 43 ^ 34;
        lIlllIllIl[28] = (74 ^ 19) ^ (122 ^ 41);
        lIlllIllIl[29] = 36 ^ 47;
        lIlllIllIl[30] = 137 ^ 160;
        lIlllIllIl[31] = 170 ^ 181;
        lIlllIllIl[32] = 126 ^ 107;
        lIlllIllIl[33] = (-21250) & 56249;
        lIlllIllIl[34] = (-20564) & 29563;
        lIlllIllIl[35] = (-((-12822) & 30589)) & (-1) & 32767;
        lIlllIllIl[36] = (-(47 ^ 41)) & (-3089) & 28093;
        lIlllIllIl[37] = (-((-6817) & 23209)) & (-145) & 24543;
        lIlllIllIl[38] = 184 ^ 144;
        lIlllIllIl[39] = (-6226) & 7125;
        lIlllIllIl[40] = 239 ^ 139;
        lIlllIllIl[41] = (219 ^ 156) ^ (136 ^ 195);
        lIlllIllIl[42] = 196 ^ 167;
        lIlllIllIl[43] = (27 ^ 125) ^ (202 ^ 161);
        lIlllIllIl[44] = (-((-2450) & 28635)) & (-2051) & 28671;
        lIlllIllIl[45] = (-4674) & 5113;
        lIlllIllIl[46] = (-((-1545) & 32429)) & (-3) & 32503;
        lIlllIllIl[47] = (-((-3395) & 32235)) & (-259) & 30719;
        lIlllIllIl[48] = (-((-2219) & 27051)) & (-6185) & 32635;
        lIlllIllIl[49] = (-26889) & 28511;
        lIlllIllIl[50] = (-(63 ^ 121)) & (-9249) & 32759;
        lIlllIllIl[51] = (-8213) & 28572;
        lIlllIllIl[52] = (-105) & 20462;
        lIlllIllIl[53] = (-659) & 12023;
        lIlllIllIl[54] = (-((-5143) & 6039)) & (-20490) & 32749;
        lIlllIllIl[55] = (-5217) & 16377;
        lIlllIllIl[56] = (-20481) & 31423;
        lIlllIllIl[57] = (-((-817) & 29563)) & (-33) & 31739;
        lIlllIllIl[58] = (-((-10890) & 31371)) & (-323) & 24031;
        lIlllIllIl[59] = (211 ^ 143) ^ (193 ^ 129);
        lIlllIllIl[60] = 112 ^ 107;
        lIlllIllIl[61] = (-16417) & 19391;
        lIlllIllIl[62] = (-16450) & 19691;
        lIlllIllIl[63] = 65 ^ 79;
    }

    public static void Q() {
        bv.add(new C0017d(lIlllIllIl[17], lIlllIllIl[1], lIlllIllIl[33]));
        "".length();
        int[] iArr = new int[lIlllIllIl[1]];
        iArr[lIlllIllIl[0]] = lIlllIllIl[6];
        if (lIIllllIlIIII(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(lIlllIllIl[6], lIlllIllIl[1], lIlllIllIl[4]));
            "".length();
        }
        int[] iArr2 = new int[lIlllIllIl[1]];
        iArr2[lIlllIllIl[0]] = lIlllIllIl[7];
        if (lIIllllIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(lIlllIllIl[7], lIlllIllIl[1], lIlllIllIl[4]));
            "".length();
        }
        int[] iArr3 = new int[lIlllIllIl[1]];
        iArr3[lIlllIllIl[0]] = lIlllIllIl[8];
        if (lIIllllIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(lIlllIllIl[8], lIlllIllIl[1], lIlllIllIl[34]));
            "".length();
        }
        int[] iArr4 = new int[lIlllIllIl[1]];
        iArr4[lIlllIllIl[0]] = lIlllIllIl[9];
        if (lIIllllIlIIII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(lIlllIllIl[9], lIlllIllIl[1], lIlllIllIl[35]));
            "".length();
        }
        int[] iArr5 = new int[lIlllIllIl[1]];
        iArr5[lIlllIllIl[0]] = lIlllIllIl[10];
        if (lIIllllIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(lIlllIllIl[10], lIlllIllIl[1], lIlllIllIl[36]));
            "".length();
        }
        if (lIIllllIlIIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlllIllII[lIlllIllIl[43]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(lIlllIllIl[19], lIlllIllIl[23], lIlllIllIl[36]));
            "".length();
        }
        int[] iArr6 = new int[lIlllIllIl[1]];
        iArr6[lIlllIllIl[0]] = lIlllIllIl[37];
        if (lIIllllIlIIII(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(lIlllIllIl[37], lIlllIllIl[38], lIlllIllIl[39]));
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0151, code lost:
        if (lIIllllIlIIll(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aC.lIlllIllIl[1]) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0190, code lost:
        if (lIIllllIlIIll(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aC.lIlllIllIl[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cf, code lost:
        if (lIIllllIlIIll(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aC.lIlllIllIl[1]) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x020e, code lost:
        if (lIIllllIlIIll(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aC.lIlllIllIl[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024d, code lost:
        if (lIIllllIIllll(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aC.lIlllIllIl[1]) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0250, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aC.lIlllIllII[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aC.lIlllIllIl[5]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aC.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aC.lIlllIllIl[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v296, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v325, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void fQ() {
        if (lIIllllIIlllI(bt ? 1 : 0)) {
            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[0]];
            C0015b.a(bv);
            if (lIIllllIIllll(bv.size(), lIlllIllIl[1])) {
                System.out.println(lIlllIllII[lIlllIllIl[1]]);
                bt = lIlllIllIl[0];
            }
        }
        if (lIIllllIlIIII(bt ? 1 : 0)) {
            if (lIIllllIlIIII(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIllllIlIIIl(nearest) && lIIllllIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllIllII[lIlllIllIl[2]];
                    C0000a.a(nearest);
                }
                if (lIIllllIlIIIl(nearest) && lIIllllIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllIllII[lIlllIllIl[3]];
                    if (lIIllllIlIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllIllIl[4]);
                        "".length();
                    }
                    if (lIIllllIIlllI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllllIlIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllIllIl[5]);
                            "".length();
                        }
                        if (lIIllllIlIIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlllIllIl[2]);
                            "".length();
                        }
                        int[] iArr = new int[lIlllIllIl[1]];
                        iArr[lIlllIllIl[0]] = lIlllIllIl[6];
                        if (lIIllllIlIIII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIlllIllIl[1]];
                            iArr2[lIlllIllIl[0]] = lIlllIllIl[6];
                        }
                        int[] iArr3 = new int[lIlllIllIl[1]];
                        iArr3[lIlllIllIl[0]] = lIlllIllIl[7];
                        if (lIIllllIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIlllIllIl[1]];
                            iArr4[lIlllIllIl[0]] = lIlllIllIl[7];
                        }
                        int[] iArr5 = new int[lIlllIllIl[1]];
                        iArr5[lIlllIllIl[0]] = lIlllIllIl[8];
                        if (lIIllllIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIlllIllIl[1]];
                            iArr6[lIlllIllIl[0]] = lIlllIllIl[8];
                        }
                        int[] iArr7 = new int[lIlllIllIl[1]];
                        iArr7[lIlllIllIl[0]] = lIlllIllIl[9];
                        if (lIIllllIlIIII(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIlllIllIl[1]];
                            iArr8[lIlllIllIl[0]] = lIlllIllIl[9];
                        }
                        int[] iArr9 = new int[lIlllIllIl[1]];
                        iArr9[lIlllIllIl[0]] = lIlllIllIl[10];
                        if (lIIllllIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[lIlllIllIl[1]];
                            iArr10[lIlllIllIl[0]] = lIlllIllIl[10];
                        }
                        C0000a.a(lIlllIllIl[11], lIlllIllIl[1]);
                        C0000a.a(lIlllIllIl[12], lIlllIllIl[1]);
                        C0000a.a(lIlllIllIl[13], lIlllIllIl[1]);
                        C0000a.a(lIlllIllIl[14], lIlllIllIl[1]);
                        C0000a.a(lIlllIllIl[15], lIlllIllIl[1]);
                        C0000a.a(lIlllIllIl[16], lIlllIllIl[1]);
                        C0000a.a(lIlllIllIl[17], lIlllIllIl[1]);
                        int[] iArr11 = new int[lIlllIllIl[1]];
                        iArr11[lIlllIllIl[0]] = lIlllIllIl[11];
                        if (lIIllllIlIIII(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlllIllIl[1]];
                            iArr12[lIlllIllIl[0]] = lIlllIllIl[11];
                            if (lIIllllIlIIII(Equipment.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlllIllIl[1]];
                                iArr13[lIlllIllIl[0]] = lIlllIllIl[11];
                                if (lIIllllIlIIII(Bank.contains(iArr13) ? 1 : 0)) {
                                    C0000a.a(lIlllIllIl[18], lIlllIllIl[1]);
                                }
                            }
                        }
                        C0000a.a(lIlllIllIl[19], lIlllIllIl[1]);
                        C0018e.l(lIlllIllIl[11]);
                        C0018e.l(lIlllIllIl[12]);
                        C0018e.l(lIlllIllIl[13]);
                        C0018e.l(lIlllIllIl[14]);
                        C0018e.l(lIlllIllIl[15]);
                        Time.sleepTicks(lIlllIllIl[1]);
                        "".length();
                        C0018e.l(lIlllIllIl[17]);
                        C0018e.l(lIlllIllIl[20]);
                        C0018e.l(lIlllIllIl[16]);
                        C0018e.l(lIlllIllIl[18]);
                        C0018e.l(lIlllIllIl[19]);
                        Time.sleepTicks(lIlllIllIl[3]);
                        "".length();
                        if (lIIllllIlIIII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIlllIllIl[21]);
                            "".length();
                        }
                        if (lIIllllIIlllI(Bank.isOpen() ? 1 : 0)) {
                            int[] iArr14 = new int[lIlllIllIl[1]];
                            iArr14[lIlllIllIl[0]] = lIlllIllIl[6];
                            if (lIIllllIIlllI(Bank.contains(iArr14) ? 1 : 0)) {
                                Bank.withdraw(lIlllIllIl[6], lIlllIllIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlllIllIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[lIlllIllIl[1]];
                                    iArr15[lIlllIllIl[0]] = lIlllIllIl[6];
                                    if (lIIllllIlIIlI(Inventory.getCount(iArr15))) {
                                        ?? r0 = lIlllIllIl[1];
                                        "".length();
                                        return ((17 ^ 14) & ((183 ^ 168) ^ (-1))) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlllIllIl[0];
                                }, lIlllIllIl[4]);
                                "".length();
                            }
                            int[] iArr15 = new int[lIlllIllIl[1]];
                            iArr15[lIlllIllIl[0]] = lIlllIllIl[7];
                            if (lIIllllIIlllI(Bank.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIlllIllIl[7], lIlllIllIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlllIllIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr16 = new int[lIlllIllIl[1]];
                                    iArr16[lIlllIllIl[0]] = lIlllIllIl[7];
                                    if (lIIllllIlIIlI(Inventory.getCount(iArr16))) {
                                        ?? r0 = lIlllIllIl[1];
                                        "".length();
                                        return (true ^ true) & ((true ^ true) ^ true) ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                                    }
                                    return lIlllIllIl[0];
                                }, lIlllIllIl[4]);
                                "".length();
                            }
                            int[] iArr16 = new int[lIlllIllIl[1]];
                            iArr16[lIlllIllIl[0]] = lIlllIllIl[8];
                            if (lIIllllIIlllI(Bank.contains(iArr16) ? 1 : 0)) {
                                Bank.withdraw(lIlllIllIl[8], lIlllIllIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlllIllIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr17 = new int[lIlllIllIl[1]];
                                    iArr17[lIlllIllIl[0]] = lIlllIllIl[8];
                                    if (lIIllllIlIIlI(Inventory.getCount(iArr17))) {
                                        ?? r0 = lIlllIllIl[1];
                                        "".length();
                                        return 0 != 0 ? ((((8 + 56) - (-4)) + 59) ^ (245 ^ 181)) & (((((45 + 1) - (-58)) + 68) ^ (((92 + 47) - 2) + 10)) ^ (-" ".length())) : r0;
                                    }
                                    return lIlllIllIl[0];
                                }, lIlllIllIl[4]);
                                "".length();
                            }
                            int[] iArr17 = new int[lIlllIllIl[1]];
                            iArr17[lIlllIllIl[0]] = lIlllIllIl[9];
                            if (lIIllllIIlllI(Bank.contains(iArr17) ? 1 : 0)) {
                                Bank.withdraw(lIlllIllIl[9], lIlllIllIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlllIllIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr18 = new int[lIlllIllIl[1]];
                                    iArr18[lIlllIllIl[0]] = lIlllIllIl[9];
                                    if (lIIllllIlIIlI(Inventory.getCount(iArr18))) {
                                        ?? r0 = lIlllIllIl[1];
                                        "".length();
                                        return 0 != 0 ? ((230 ^ 167) ^ (181 ^ 165)) & (((165 ^ 148) ^ (100 ^ 4)) ^ (-" ".length())) : r0;
                                    }
                                    return lIlllIllIl[0];
                                }, lIlllIllIl[4]);
                                "".length();
                            }
                            int[] iArr18 = new int[lIlllIllIl[1]];
                            iArr18[lIlllIllIl[0]] = lIlllIllIl[10];
                            if (lIIllllIIlllI(Bank.contains(iArr18) ? 1 : 0)) {
                                Bank.withdraw(lIlllIllIl[10], lIlllIllIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlllIllIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr19 = new int[lIlllIllIl[1]];
                                    iArr19[lIlllIllIl[0]] = lIlllIllIl[10];
                                    if (lIIllllIlIIlI(Inventory.getCount(iArr19))) {
                                        ?? r0 = lIlllIllIl[1];
                                        "".length();
                                        return " ".length() == 0 ? ((24 ^ 46) ^ (213 ^ 161)) & (((44 ^ 102) ^ (4 ^ 12)) ^ (-" ".length())) : r0;
                                    }
                                    return lIlllIllIl[0];
                                }, lIlllIllIl[4]);
                                "".length();
                            }
                            int[] iArr19 = new int[lIlllIllIl[1]];
                            iArr19[lIlllIllIl[0]] = lIlllIllIl[17];
                            if (lIIllllIIlllI(Bank.contains(iArr19) ? 1 : 0)) {
                                Bank.withdraw(lIlllIllIl[17], lIlllIllIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlllIllIl[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr20 = new int[lIlllIllIl[1]];
                                    iArr20[lIlllIllIl[0]] = lIlllIllIl[17];
                                    if (lIIllllIlIIlI(Inventory.getCount(iArr20))) {
                                        ?? r0 = lIlllIllIl[1];
                                        "".length();
                                        return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlllIllIl[0];
                                }, lIlllIllIl[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIIllllIIlllI(an() ? 1 : 0)) {
                if (lIIllllIlIIII(Movement.isRunEnabled() ? 1 : 0) && lIIllllIlIlII(Movement.getRunEnergy(), lIlllIllIl[22])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lIlllIllIl[23]);
                    "".length();
                }
                if (lIIllllIIlllI(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = lIlllIllII[lIlllIllIl[23]];
                    Inventory.getAll(pc).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (lIIllllIlIIII(Inventory.isFull() ? 1 : 0)) {
                    if (lIIllllIIllll(Skills.getLevel(Skill.MINING), lIlllIllIl[24])) {
                        if (lIIllllIlIIII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[21]];
                            Movement.walkTo(F);
                            "".length();
                            Time.sleepTicks(lIlllIllIl[5]);
                            "".length();
                        }
                        if (lIIllllIIlllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[25]];
                            TileObject nearest2 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), ny);
                            if (lIIllllIlIIII(Players.getLocal().isAnimating() ? 1 : 0) && lIIllllIlIIII(Players.getLocal().isMoving() ? 1 : 0) && lIIllllIlIIIl(nearest2)) {
                                nearest2.interact(lIlllIllII[lIlllIllIl[26]]);
                                Time.sleepTicks(lIlllIllIl[2]);
                                "".length();
                            }
                        }
                    }
                    if (lIIllllIlIIll(Skills.getLevel(Skill.MINING), lIlllIllIl[24])) {
                        if (lIIllllIlIIII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[27]];
                            Movement.walkTo(F);
                            "".length();
                            Time.sleepTicks(lIlllIllIl[5]);
                            "".length();
                        }
                        if (lIIllllIIlllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lIlllIllII[lIlllIllIl[28]];
                            TileObject nearest3 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), nx);
                            if (lIIllllIlIIII(Players.getLocal().isAnimating() ? 1 : 0) && lIIllllIlIIII(Players.getLocal().isMoving() ? 1 : 0) && lIIllllIlIIIl(nearest3)) {
                                nearest3.interact(lIlllIllII[lIlllIllIl[29]]);
                                Time.sleepTicks(lIlllIllIl[2]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllllIlIIlI(int i) {
        return i > 0;
    }

    private static void lIIllllIIllII() {
        lIlllIllII = new String[lIlllIllIl[63]];
        lIlllIllII[lIlllIllIl[0]] = lIIllllIIlIIl("XAic6+DrR2PQFQ3t6fDe3g==", "NMbkq");
        lIlllIllII[lIlllIllIl[1]] = lIIllllIIlIlI("JwslPzgJBy92KRQbIjgsQQs/MyYSTmslPAgWKD4iDwVrNCoCCWsiJEEPIjgiDwU=", "abKVK");
        lIlllIllII[lIlllIllIl[2]] = lIIllllIIlIll("ookCOqFfwNbb3G+xasuuCYWMI9aH9PBW", "pvhYv");
        lIlllIllII[lIlllIllIl[3]] = lIIllllIIlIlI("KSgUDRwIJx1JEgAnEQAeBg==", "aIzip");
        lIlllIllII[lIlllIllIl[5]] = lIIllllIIlIlI("Dzd0Ejo9cjkaOys7OhRoOSoxAGR4ISMaPDs6PR0veCY7UwoNCx09Dw==", "XRTsH");
        lIlllIllII[lIlllIllIl[23]] = lIIllllIIlIll("HaM0H+ahCgtTF8iYUv71oQ==", "SoVMh");
        lIlllIllII[lIlllIllIl[21]] = lIIllllIIlIIl("OEwQ367PjZ1STsw2NQzVXw==", "lgwlU");
        lIlllIllII[lIlllIllIl[25]] = lIIllllIIlIIl("K2KeilKlFZukR2SQAbDrfQ==", "RVXAs");
        lIlllIllII[lIlllIllIl[26]] = lIIllllIIlIll("vYrDkAxEBcU=", "NSalX");
        lIlllIllII[lIlllIllIl[27]] = lIIllllIIlIll("jVIIABPUeHbW0G38tB2osakuL5lFK9++", "oXCnr");
        lIlllIllII[lIlllIllIl[28]] = lIIllllIIlIIl("CDGAZcDFdvIvwZ3KXJfr6Q==", "XDeMG");
        lIlllIllII[lIlllIllIl[29]] = lIIllllIIlIlI("JSEiBg==", "hHLcD");
        lIlllIllII[lIlllIllIl[41]] = lIIllllIIlIlI("Dh0qKwUk", "CtDBk");
        lIlllIllII[lIlllIllIl[43]] = lIIllllIIlIlI("HDs9MVgBNHMhHQ8+Jz5YRg==", "nRSVx");
    }

    private static String lIIllllIIlIll(String llllllllllllllllllIllllIIIllIIIl, String llllllllllllllllllIllllIIIllIIII) {
        try {
            SecretKeySpec llllllllllllllllllIllllIIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllIIIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIllIl[2], llllllllllllllllllIllllIIIllIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllllIIIllIIlI) {
            llllllllllllllllllIllllIIIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIIlllI(int i) {
        return i != 0;
    }

    private static String lIIllllIIlIIl(String llllllllllllllllllIllllIIIlIIlII, String llllllllllllllllllIllllIIIlIIIll) {
        try {
            SecretKeySpec llllllllllllllllllIllllIIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllIIIlIIIll.getBytes(StandardCharsets.UTF_8)), lIlllIllIl[26]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIllIl[2], llllllllllllllllllIllllIIIlIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllllIIIlIIlIl) {
            llllllllllllllllllIllllIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static boolean an() {
        if (lIIllllIlIIll(Skills.getLevel(Skill.MINING), lIlllIllIl[30])) {
            int[] iArr = new int[lIlllIllIl[1]];
            iArr[lIlllIllIl[0]] = lIlllIllIl[10];
            if (lIIllllIlIIlI(Inventory.getCount(iArr))) {
                ?? r0 = lIlllIllIl[1];
                "".length();
                return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlllIllIl[0];
        } else if (lIIllllIlIIll(Skills.getLevel(Skill.MINING), lIlllIllIl[31]) && lIIllllIIllll(Skills.getLevel(Skill.MINING), lIlllIllIl[30])) {
            int[] iArr2 = new int[lIlllIllIl[1]];
            iArr2[lIlllIllIl[0]] = lIlllIllIl[10];
            if (lIIllllIlIIlI(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIlllIllIl[1]];
                iArr3[lIlllIllIl[0]] = lIlllIllIl[9];
                if (lIIllllIlIIlI(Inventory.getCount(iArr3))) {
                    ?? r02 = lIlllIllIl[1];
                    "".length();
                    return " ".length() > " ".length() ? ((178 ^ 173) ^ (105 ^ 122)) & (((((177 + 109) - 102) + 18) ^ (((121 + 91) - 57) + 43)) ^ (-" ".length())) : r02;
                }
            }
            return lIlllIllIl[0];
        } else if (lIIllllIlIIll(Skills.getLevel(Skill.MINING), lIlllIllIl[32]) && lIIllllIIllll(Skills.getLevel(Skill.MINING), lIlllIllIl[31])) {
            int[] iArr4 = new int[lIlllIllIl[1]];
            iArr4[lIlllIllIl[0]] = lIlllIllIl[10];
            if (lIIllllIlIIlI(Inventory.getCount(iArr4))) {
                int[] iArr5 = new int[lIlllIllIl[1]];
                iArr5[lIlllIllIl[0]] = lIlllIllIl[9];
                if (lIIllllIlIIlI(Inventory.getCount(iArr5))) {
                    int[] iArr6 = new int[lIlllIllIl[1]];
                    iArr6[lIlllIllIl[0]] = lIlllIllIl[8];
                    if (lIIllllIlIIlI(Inventory.getCount(iArr6))) {
                        ?? r03 = lIlllIllIl[1];
                        "".length();
                        return (-(54 ^ 50)) > 0 ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r03;
                    }
                }
            }
            return lIlllIllIl[0];
        } else if (lIIllllIlIIll(Skills.getLevel(Skill.MINING), lIlllIllIl[21]) && lIIllllIIllll(Skills.getLevel(Skill.MINING), lIlllIllIl[32])) {
            int[] iArr7 = new int[lIlllIllIl[1]];
            iArr7[lIlllIllIl[0]] = lIlllIllIl[10];
            if (lIIllllIlIIlI(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[lIlllIllIl[1]];
                iArr8[lIlllIllIl[0]] = lIlllIllIl[9];
                if (lIIllllIlIIlI(Inventory.getCount(iArr8))) {
                    int[] iArr9 = new int[lIlllIllIl[1]];
                    iArr9[lIlllIllIl[0]] = lIlllIllIl[8];
                    if (lIIllllIlIIlI(Inventory.getCount(iArr9))) {
                        int[] iArr10 = new int[lIlllIllIl[1]];
                        iArr10[lIlllIllIl[0]] = lIlllIllIl[7];
                        if (lIIllllIlIIlI(Inventory.getCount(iArr10))) {
                            ?? r04 = lIlllIllIl[1];
                            "".length();
                            return ((21 ^ 94) & ((143 ^ 196) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
                        }
                    }
                }
            }
            return lIlllIllIl[0];
        } else {
            int[] iArr11 = new int[lIlllIllIl[1]];
            iArr11[lIlllIllIl[0]] = lIlllIllIl[10];
            if (lIIllllIlIIlI(Inventory.getCount(iArr11))) {
                int[] iArr12 = new int[lIlllIllIl[1]];
                iArr12[lIlllIllIl[0]] = lIlllIllIl[9];
                if (lIIllllIlIIlI(Inventory.getCount(iArr12))) {
                    int[] iArr13 = new int[lIlllIllIl[1]];
                    iArr13[lIlllIllIl[0]] = lIlllIllIl[8];
                    if (lIIllllIlIIlI(Inventory.getCount(iArr13))) {
                        int[] iArr14 = new int[lIlllIllIl[1]];
                        iArr14[lIlllIllIl[0]] = lIlllIllIl[7];
                        if (lIIllllIlIIlI(Inventory.getCount(iArr14))) {
                            int[] iArr15 = new int[lIlllIllIl[1]];
                            iArr15[lIlllIllIl[0]] = lIlllIllIl[6];
                            if (lIIllllIlIIlI(Inventory.getCount(iArr15))) {
                                ?? r05 = lIlllIllIl[1];
                                "".length();
                                return (-" ".length()) >= (((((221 + 53) - 98) + 56) ^ (((21 + 113) - 90) + 128)) & (((((33 + 178) - 3) + 2) ^ (((44 + 49) - (-43)) + 14)) ^ (-" ".length()))) ? ((102 ^ 125) ^ (188 ^ 147)) & (((((103 + 52) - 140) + 143) ^ (((73 + 156) - 228) + 169)) ^ (-" ".length())) : r05;
                            }
                        }
                    }
                }
            }
            return lIlllIllIl[0];
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lIlllIllII[lIlllIllIl[41]];
    }

    private static boolean lIIllllIlIIll(int i, int i2) {
        return i >= i2;
    }
}
