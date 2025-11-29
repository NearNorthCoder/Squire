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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.J  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/J.class */
public class J implements InterfaceC0003ac {
    private static /* synthetic */ String[] llIIllIlll;
    static /* synthetic */ int di;
    private static /* synthetic */ int[] llIIlllIII;
    static /* synthetic */ WorldPoint gi;

    /* renamed from: gg  reason: collision with root package name */
    static /* synthetic */ WorldPoint f3gg;
    static /* synthetic */ WorldPoint gh;
    static /* synthetic */ WorldPoint gf;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ boolean dj;
    static /* synthetic */ String[] cE;
    static /* synthetic */ int gj;

    private static boolean lIlIlllIIIIIl(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0173, code lost:
        if (lIlIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[9]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0316, code lost:
        if (lIlIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[3]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03a0, code lost:
        if (lIlIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[4]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
        if (lIlIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[3]) != false) goto L55;
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
        int[] iArr11 = new int[llIIlllIII[5]];
        iArr11[llIIlllIII[6]] = llIIlllIII[11];
        if (lIlIllIlllIll(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[llIIlllIII[5]];
            iArr12[llIIlllIII[6]] = llIIlllIII[11];
            if (lIlIllIlllIll(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[llIIlllIII[5]];
                iArr13[llIIlllIII[6]] = llIIlllIII[11];
            }
            iArr = new int[llIIlllIII[5]];
            iArr[llIIlllIII[6]] = llIIlllIII[25];
            if (lIlIllIllllII(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(llIIlllIII[25], llIIlllIII[5], llIIlllIII[60]));
                "".length();
            }
            iArr2 = new int[llIIlllIII[5]];
            iArr2[llIIlllIII[6]] = llIIlllIII[22];
            if (lIlIllIllllII(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(llIIlllIII[22], llIIlllIII[5], llIIlllIII[60]));
                "".length();
            }
            iArr3 = new int[llIIlllIII[5]];
            iArr3[llIIlllIII[6]] = llIIlllIII[10];
            if (lIlIllIlllIll(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr14 = new int[llIIlllIII[5]];
                iArr14[llIIlllIII[6]] = llIIlllIII[10];
                if (lIlIllIlllIll(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIIlllIII[5]];
                    iArr15[llIIlllIII[6]] = llIIlllIII[10];
                }
                iArr4 = new int[llIIlllIII[5]];
                iArr4[llIIlllIII[6]] = llIIlllIII[19];
                if (lIlIllIllllII(Bank.contains(iArr4) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlllIII[19], llIIlllIII[5], llIIlllIII[60]));
                    "".length();
                }
                iArr5 = new int[llIIlllIII[5]];
                iArr5[llIIlllIII[6]] = llIIlllIII[17];
                if (lIlIllIllllII(Bank.contains(iArr5) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlllIII[17], llIIlllIII[5], llIIlllIII[60]));
                    "".length();
                }
                iArr6 = new int[llIIlllIII[5]];
                iArr6[llIIlllIII[6]] = llIIlllIII[15];
                if (lIlIllIllllII(Bank.contains(iArr6) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlllIII[15], llIIlllIII[5], llIIlllIII[60]));
                    "".length();
                }
                iArr7 = new int[llIIlllIII[5]];
                iArr7[llIIlllIII[6]] = llIIlllIII[16];
                if (lIlIllIllllII(Bank.contains(iArr7) ? 1 : 0)) {
                    bv.add(new C0017d(llIIlllIII[16], llIIlllIII[5], llIIlllIII[60]));
                    "".length();
                }
                iArr8 = new int[llIIlllIII[5]];
                iArr8[llIIlllIII[6]] = llIIlllIII[14];
                if (lIlIllIlllIll(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr16 = new int[llIIlllIII[5]];
                    iArr16[llIIlllIII[6]] = llIIlllIII[14];
                    if (lIlIllIlllIll(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[llIIlllIII[5]];
                        iArr17[llIIlllIII[6]] = llIIlllIII[14];
                    }
                    iArr9 = new int[llIIlllIII[5]];
                    iArr9[llIIlllIII[6]] = llIIlllIII[12];
                    if (lIlIllIlllIll(Bank.contains(iArr9) ? 1 : 0)) {
                        int[] iArr18 = new int[llIIlllIII[5]];
                        iArr18[llIIlllIII[6]] = llIIlllIII[12];
                        if (lIlIllIlllIll(Bank.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[llIIlllIII[5]];
                            iArr19[llIIlllIII[6]] = llIIlllIII[12];
                        }
                        if (lIlIllIllllII(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(llIIllIlll[llIIlllIII[67]]);
                        }) ? 1 : 0)) {
                            bv.add(new C0017d(llIIlllIII[63], llIIlllIII[3], llIIlllIII[64]));
                            "".length();
                        }
                        iArr10 = new int[llIIlllIII[5]];
                        iArr10[llIIlllIII[6]] = llIIlllIII[13];
                        if (lIlIllIllllII(Bank.contains(iArr10) ? 1 : 0)) {
                            bv.add(new C0017d(llIIlllIII[13], llIIlllIII[42], llIIlllIII[62]));
                            "".length();
                            return;
                        }
                        return;
                    }
                    bv.add(new C0017d(llIIlllIII[12], llIIlllIII[4], llIIlllIII[62]));
                    "".length();
                    if (lIlIllIllllII(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(llIIllIlll[llIIlllIII[67]]);
                    }) ? 1 : 0)) {
                    }
                    iArr10 = new int[llIIlllIII[5]];
                    iArr10[llIIlllIII[6]] = llIIlllIII[13];
                    if (lIlIllIllllII(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                }
                bv.add(new C0017d(llIIlllIII[14], llIIlllIII[4], llIIlllIII[62]));
                "".length();
                iArr9 = new int[llIIlllIII[5]];
                iArr9[llIIlllIII[6]] = llIIlllIII[12];
                if (lIlIllIlllIll(Bank.contains(iArr9) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIlllIII[12], llIIlllIII[4], llIIlllIII[62]));
                "".length();
                if (lIlIllIllllII(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(llIIllIlll[llIIlllIII[67]]);
                }) ? 1 : 0)) {
                }
                iArr10 = new int[llIIlllIII[5]];
                iArr10[llIIlllIII[6]] = llIIlllIII[13];
                if (lIlIllIllllII(Bank.contains(iArr10) ? 1 : 0)) {
                }
            }
            bv.add(new C0017d(llIIlllIII[10], llIIlllIII[9], llIIlllIII[61]));
            "".length();
            iArr4 = new int[llIIlllIII[5]];
            iArr4[llIIlllIII[6]] = llIIlllIII[19];
            if (lIlIllIllllII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[llIIlllIII[5]];
            iArr5[llIIlllIII[6]] = llIIlllIII[17];
            if (lIlIllIllllII(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llIIlllIII[5]];
            iArr6[llIIlllIII[6]] = llIIlllIII[15];
            if (lIlIllIllllII(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[llIIlllIII[5]];
            iArr7[llIIlllIII[6]] = llIIlllIII[16];
            if (lIlIllIllllII(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[llIIlllIII[5]];
            iArr8[llIIlllIII[6]] = llIIlllIII[14];
            if (lIlIllIlllIll(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIlllIII[14], llIIlllIII[4], llIIlllIII[62]));
            "".length();
            iArr9 = new int[llIIlllIII[5]];
            iArr9[llIIlllIII[6]] = llIIlllIII[12];
            if (lIlIllIlllIll(Bank.contains(iArr9) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIlllIII[12], llIIlllIII[4], llIIlllIII[62]));
            "".length();
            if (lIlIllIllllII(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(llIIllIlll[llIIlllIII[67]]);
            }) ? 1 : 0)) {
            }
            iArr10 = new int[llIIlllIII[5]];
            iArr10[llIIlllIII[6]] = llIIlllIII[13];
            if (lIlIllIllllII(Bank.contains(iArr10) ? 1 : 0)) {
            }
        }
        bv.add(new C0017d(llIIlllIII[11], llIIlllIII[3], C0023j.cf));
        "".length();
        iArr = new int[llIIlllIII[5]];
        iArr[llIIlllIII[6]] = llIIlllIII[25];
        if (lIlIllIllllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[llIIlllIII[5]];
        iArr2[llIIlllIII[6]] = llIIlllIII[22];
        if (lIlIllIllllII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIIlllIII[5]];
        iArr3[llIIlllIII[6]] = llIIlllIII[10];
        if (lIlIllIlllIll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIlllIII[10], llIIlllIII[9], llIIlllIII[61]));
        "".length();
        iArr4 = new int[llIIlllIII[5]];
        iArr4[llIIlllIII[6]] = llIIlllIII[19];
        if (lIlIllIllllII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[llIIlllIII[5]];
        iArr5[llIIlllIII[6]] = llIIlllIII[17];
        if (lIlIllIllllII(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llIIlllIII[5]];
        iArr6[llIIlllIII[6]] = llIIlllIII[15];
        if (lIlIllIllllII(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[llIIlllIII[5]];
        iArr7[llIIlllIII[6]] = llIIlllIII[16];
        if (lIlIllIllllII(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[llIIlllIII[5]];
        iArr8[llIIlllIII[6]] = llIIlllIII[14];
        if (lIlIllIlllIll(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIlllIII[14], llIIlllIII[4], llIIlllIII[62]));
        "".length();
        iArr9 = new int[llIIlllIII[5]];
        iArr9[llIIlllIII[6]] = llIIlllIII[12];
        if (lIlIllIlllIll(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIlllIII[12], llIIlllIII[4], llIIlllIII[62]));
        "".length();
        if (lIlIllIllllII(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(llIIllIlll[llIIlllIII[67]]);
        }) ? 1 : 0)) {
        }
        iArr10 = new int[llIIlllIII[5]];
        iArr10[llIIlllIII[6]] = llIIlllIII[13];
        if (lIlIllIllllII(Bank.contains(iArr10) ? 1 : 0)) {
        }
    }

    private static boolean lIlIlllIIIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlllIIIIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIllIlllllI(int i) {
        return i > 0;
    }

    private static void lIlIllIllIlll() {
        llIIlllIII = new int[80];
        llIIlllIII[0] = (-14417) & 15094;
        llIIlllIII[1] = "   ".length();
        llIIlllIII[2] = (102 ^ 7) ^ (232 ^ 130);
        llIIlllIII[3] = 50 ^ 55;
        llIIlllIII[4] = (27 ^ 53) ^ (78 ^ 106);
        llIIlllIII[5] = " ".length();
        llIIlllIII[6] = ((((79 + 96) - 93) + 92) ^ (((167 + 158) - 262) + 127)) & (((225 ^ 184) ^ (126 ^ 55)) ^ (-" ".length()));
        llIIlllIII[7] = (-((-12321) & 31842)) & (-23) & 24543;
        llIIlllIII[8] = "  ".length();
        llIIlllIII[9] = 60 ^ 56;
        llIIlllIII[10] = (-((-339) & 2527)) & (-16387) & 20479;
        llIIlllIII[11] = (-((-321) & 2381)) & (-673) & 15357;
        llIIlllIII[12] = (-((-14239) & 30623)) & (-1) & 24393;
        llIIlllIII[13] = (-8361) & 16367;
        llIIlllIII[14] = (-16563) & 24570;
        llIIlllIII[15] = (-((-10757) & 31237)) & (-65) & 22471;
        llIIlllIII[16] = (-((-659) & 31411)) & (-83) & 32767;
        llIIlllIII[17] = (-((-9859) & 30435)) & (-5) & 22524;
        llIIlllIII[18] = (90 ^ 112) ^ (61 ^ 17);
        llIIlllIII[19] = (-((-4369) & 31095)) & (-1) & 28647;
        llIIlllIII[20] = (58 ^ 118) ^ (79 ^ 4);
        llIIlllIII[21] = (109 ^ 35) ^ (211 ^ 149);
        llIIlllIII[22] = (-19029) & 20087;
        llIIlllIII[23] = 156 ^ 149;
        llIIlllIII[24] = (-((-4185) & 15581)) & (-4609) & 16383;
        llIIlllIII[25] = (-19149) & 20479;
        llIIlllIII[26] = (-20485) & 21479;
        llIIlllIII[27] = (89 ^ 52) ^ (242 ^ 173);
        llIIlllIII[28] = (-((-4291) & 22747)) & (-12289) & 32635;
        llIIlllIII[29] = (242 ^ 149) ^ (121 ^ 18);
        llIIlllIII[30] = (121 ^ 29) ^ (78 ^ 39);
        llIIlllIII[31] = 186 ^ 180;
        llIIlllIII[32] = 79 ^ 64;
        llIIlllIII[33] = 59 ^ 43;
        llIIlllIII[34] = (((88 + 82) - 115) + 118) ^ (((41 + 21) - 61) + 184);
        llIIlllIII[35] = (-6209) & 8191;
        llIIlllIII[36] = (194 ^ 191) ^ (203 ^ 167);
        llIIlllIII[37] = 46 ^ 60;
        llIIlllIII[38] = 14 ^ 29;
        llIIlllIII[39] = (((108 + 12) - 42) + 104) ^ (((25 + 44) - (-83)) + 11);
        llIIlllIII[40] = (((129 + 49) - 155) + 139) ^ (((56 + 156) - 204) + 172);
        llIIlllIII[41] = 106 ^ 116;
        llIIlllIII[42] = (131 ^ 145) ^ (57 ^ 3);
        llIIlllIII[43] = 10 ^ 29;
        llIIlllIII[44] = (((91 + 118) - 60) + 30) ^ (((95 + 150) - 157) + 83);
        llIIlllIII[45] = 141 ^ 148;
        llIIlllIII[46] = (-((-15571) & 16091)) & (-8321) & 16349;
        llIIlllIII[47] = 139 ^ 145;
        llIIlllIII[48] = 130 ^ 153;
        llIIlllIII[49] = (((72 + 26) - (-22)) + 11) ^ (((89 + 20) - 54) + 104);
        llIIlllIII[50] = (174 ^ 161) ^ (94 ^ 76);
        llIIlllIII[51] = 222 ^ 193;
        llIIlllIII[52] = (-129) & 7638;
        llIIlllIII[53] = (-25114) & 28319;
        llIIlllIII[54] = (-((-1121) & 30445)) & (-4) & 32751;
        llIIlllIII[55] = 72 ^ 104;
        llIIlllIII[56] = 24 ^ 57;
        llIIlllIII[57] = (122 ^ 84) ^ (204 ^ 192);
        llIIlllIII[58] = 45 ^ 14;
        llIIlllIII[59] = 55 ^ 19;
        llIIlllIII[60] = (-((-11041) & 27575)) & (-3073) & 28606;
        llIIlllIII[61] = (-20555) & 24554;
        llIIlllIII[62] = (-((-481) & 25057)) & (-2050) & 28525;
        llIIlllIII[63] = (-20515) & 32494;
        llIIlllIII[64] = (-((-9370) & 15583)) & (-3) & 31215;
        llIIlllIII[65] = (67 ^ 12) ^ (159 ^ 180);
        llIIlllIII[66] = 96 ^ 69;
        llIIlllIII[67] = (((102 + 153) - 149) + 119) ^ (((26 + 4) - (-107)) + 62);
        llIIlllIII[68] = (-((-2071) & 19327)) & (-4097) & 24559;
        llIIlllIII[69] = (-((-11734) & 12279)) & (-8193) & 11959;
        llIIlllIII[70] = (-((-8733) & 29213)) & (-1073) & 24509;
        llIIlllIII[71] = (-((-9649) & 30195)) & (-8338) & 32255;
        llIIlllIII[72] = (-16521) & 19385;
        llIIlllIII[73] = (-4131) & 14007;
        llIIlllIII[74] = (-((-37) & 29759)) & (-33) & 32763;
        llIIlllIII[75] = (-((-2309) & 31535)) & (-65) & 32763;
        llIIlllIII[76] = 47 ^ 8;
        llIIlllIII[77] = 63 ^ 22;
        llIIlllIII[78] = (-((-24609) & 31863)) & (-8193) & 16127;
        llIIlllIII[79] = (246 ^ 150) ^ (83 ^ 25);
    }

    private static boolean lIlIllIlllIIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIlIllIllIllI() {
        llIIllIlll = new String[llIIlllIII[79]];
        llIIllIlll[llIIlllIII[6]] = lIlIllIllIIll("NgI5KioYDjNjOwUSPi0+UAIjJjQDR3cwLhkfNCswHgx3ITgTAHc3NlAaIiYqBA==", "pkWCY");
        llIIllIlll[llIIlllIII[5]] = lIlIllIllIlII("R0f4E1LZCpp0wKUBMD9eMg==", "TkUow");
        llIIllIlll[llIIlllIII[8]] = lIlIllIllIlIl("eol6RChTmn/aNKqM/BTirwfmpw5hLyfd", "yWqoE");
        llIIllIlll[llIIlllIII[1]] = lIlIllIllIIll("Ai9lJzgwaigvOSYjKyFqJD8gNT51OTA2OjkjIDVmdTkyLz42IiwoLXU+KmYIABMMCA0=", "UJEFJ");
        llIIllIlll[llIIlllIII[9]] = lIlIllIllIIll("PjN4EQIMdjUZAxo/NhdQGCM9AwRJJS0AAAU/PQNcSSUvGQQKPjEeF0kiN1AyPA8RPjc=", "iVXpp");
        llIIllIlll[llIIlllIII[3]] = lIlIllIllIIll("KiogPgc=", "nXIPl");
        llIIllIlll[llIIlllIII[18]] = lIlIllIllIlIl("CbI4+pTDMeU=", "zUqVn");
        llIIllIlll[llIIlllIII[20]] = lIlIllIllIlII("TLxahhwWr+AZD8++Dv5onQ==", "CDjmk");
        llIIllIlll[llIIlllIII[21]] = lIlIllIllIlIl("eCxTB9r7ecM=", "nePzV");
        llIIllIlll[llIIlllIII[23]] = lIlIllIllIIll("AxoOIiE=", "GmoPG");
        llIIllIlll[llIIlllIII[4]] = lIlIllIllIlII("VMIBmoUMPpk=", "ncfzZ");
        llIIllIlll[llIIlllIII[2]] = lIlIllIllIlIl("lxf/qAvYh7J/A7JDNcBjAPwzo4T2dfQF", "MDkIJ");
        llIIllIlll[llIIlllIII[29]] = lIlIllIllIIll("JiYDJgALZw4qDRo=", "nGmBl");
        llIIllIlll[llIIlllIII[30]] = lIlIllIllIlIl("mEgKcyzAdZg=", "CDrmO");
        llIIllIlll[llIIlllIII[31]] = lIlIllIllIlIl("L0vSRrjH1tAxYJCo/pl+12FvRutYGEbK", "ubnqQ");
        llIIllIlll[llIIlllIII[32]] = lIlIllIllIIll("CQoCHj0kSw8SMDU=", "AklzQ");
        llIIllIlll[llIIlllIII[33]] = lIlIllIllIIll("FwhDAQ8yRicZAiQA", "Vfcnc");
        llIIllIlll[llIIlllIII[36]] = lIlIllIllIIll("HSkGagI8aAIlFThoEysdNmgXPw8=", "SHpJv");
        llIIllIlll[llIIlllIII[37]] = lIlIllIllIIll("BBspIA0pWiQsADg=", "LzGDa");
        llIIllIlll[llIIlllIII[38]] = lIlIllIllIIll("CB9LABYtUS8YGzsX", "Iqkoz");
        llIIllIlll[llIIlllIII[34]] = lIlIllIllIIll("GAUAAAA=", "Jjhak");
        llIIllIlll[llIIlllIII[39]] = lIlIllIllIlII("iMXAe8QE+9wz5qaAzFiFCQ==", "wKYcN");
        llIIllIlll[llIIlllIII[40]] = lIlIllIllIIll("Ij4JDgY=", "pQaom");
        llIIllIlll[llIIlllIII[43]] = lIlIllIllIlIl("NDuyOVHEnrM3oxwutJz0TA==", "jtxWK");
        llIIllIlll[llIIlllIII[44]] = lIlIllIllIlIl("M4iL3Rfxz64=", "GYLWu");
        llIIllIlll[llIIlllIII[45]] = lIlIllIllIlIl("+hYIAm6bS+s=", "ZJtIi");
        llIIllIlll[llIIlllIII[47]] = lIlIllIllIIll("AAsJAg==", "TjbgS");
        llIIllIlll[llIIlllIII[48]] = lIlIllIllIlIl("3xFLZ2nkZMg=", "WdQuV");
        llIIllIlll[llIIlllIII[49]] = lIlIllIllIlIl("75Pj1iNDumHv0FoF39NtUw==", "LBsAj");
        llIIllIlll[llIIlllIII[50]] = lIlIllIllIlII("CnbuSvPrQkxAv9V6v2Mzcg==", "wEuVQ");
        llIIllIlll[llIIlllIII[41]] = lIlIllIllIlIl("oJ5TeToa+UEWqT1dowK0Jw==", "KqDGL");
        llIIllIlll[llIIlllIII[51]] = lIlIllIllIlIl("hhBHRhPDTJ0=", "ahdDO");
        llIIllIlll[llIIlllIII[55]] = lIlIllIllIlIl("/Qg7/wx3bNE=", "HScWH");
        llIIllIlll[llIIlllIII[56]] = lIlIllIllIlII("7wuAr+Ahm9jQs2temwg6Sg==", "AIOhg");
        llIIllIlll[llIIlllIII[57]] = lIlIllIllIIll("JzcwIQ==", "fEYRR");
        llIIllIlll[llIIlllIII[58]] = lIlIllIllIlIl("IcaTvQ2Kmw5qN7Jqfikhiw==", "iKTVo");
        llIIllIlll[llIIlllIII[59]] = lIlIllIllIlIl("aPklL5ZppIc=", "Tjoup");
        llIIllIlll[llIIlllIII[66]] = lIlIllIllIlII("4apv4R1NV2PIrMjOLFrM8g==", "BLgJf");
        llIIllIlll[llIIlllIII[67]] = lIlIllIllIlII("u4XWdk7sUEJ6kzDEh8hGe9qiOBR2kLec", "qpwbp");
        llIIllIlll[llIIlllIII[76]] = lIlIllIllIlIl("Xo2n+UPu+aU=", "LajSk");
        llIIllIlll[llIIlllIII[42]] = lIlIllIllIlII("f0CbJCZG3pcebbT3XjK81TMpzD7KEt0bQyjUKpAQ5Rz+32e899W7mwVa/1PvssA0", "kKFNS");
        llIIllIlll[llIIlllIII[77]] = lIlIllIllIlII("x3T+stv4Gg0RAOiGZ7zmgs9BGGqRtzwPoBqtSqfKfh1pdaKqO1p1yv1uQZjns48smQNchy/e7b4=", "aWQkZ");
    }

    private static String lIlIllIllIlIl(String llllllllllllllllllIIllIIllllIIIl, String llllllllllllllllllIIllIIllllIIII) {
        try {
            SecretKeySpec llllllllllllllllllIIllIIllllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIllIIllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllIII[8], llllllllllllllllllIIllIIllllIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIllIIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIllIIllllIIlI) {
            llllllllllllllllllIIllIIllllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllIllllll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIllIllllIl(Object obj) {
        return obj != null;
    }

    private static String lIlIllIllIlII(String llllllllllllllllllIIllIIlllIIIlI, String llllllllllllllllllIIllIIlllIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIllIIlllIIIll.getBytes(StandardCharsets.UTF_8)), llIIlllIII[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllIII[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIllIIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIllIIlllIIlIl) {
            llllllllllllllllllIIllIIlllIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllIll(int i) {
        return i != 0;
    }

    private static boolean lIlIllIlllIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIllIllllII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIlllIIIIll(Quests.getState(Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            ?? r0 = llIIlllIII[5];
            "".length();
            return (-" ".length()) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlllIII[6];
    }

    static {
        lIlIllIllIlll();
        lIlIllIllIllI();
        bv = new ArrayList();
        gf = new WorldPoint(llIIlllIII[68], llIIlllIII[69], llIIlllIII[6]);
        f3gg = new WorldPoint(llIIlllIII[70], llIIlllIII[71], llIIlllIII[6]);
        gh = new WorldPoint(llIIlllIII[72], llIIlllIII[73], llIIlllIII[6]);
        gi = new WorldPoint(llIIlllIII[74], llIIlllIII[75], llIIlllIII[6]);
        String[] strArr = new String[llIIlllIII[1]];
        strArr[llIIlllIII[6]] = llIIllIlll[llIIlllIII[76]];
        strArr[llIIlllIII[5]] = llIIllIlll[llIIlllIII[42]];
        strArr[llIIlllIII[8]] = llIIllIlll[llIIlllIII[77]];
        cE = strArr;
        gj = llIIlllIII[78];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIllIlll[llIIlllIII[66]];
    }

    private static boolean lIlIlllIIIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            cw();
            "".length();
            if (((((14 ^ 47) & ((44 ^ 13) ^ (-1))) ^ (150 ^ 159)) & (((((67 + 119) - 125) + 83) ^ (((52 + 99) - 14) + 16)) ^ (-" ".length()))) == "  ".length()) {
                return ((90 ^ 112) ^ (179 ^ 168)) & (((((9 + 9) - (-101)) + 123) ^ (((117 + 55) - 97) + 120)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIlllIII[65];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIlllIII[6];
    }

    private static String lIlIllIllIIll(String llllllllllllllllllIIllIIllIlIlII, String llllllllllllllllllIIllIIllIlIIll) {
        String llllllllllllllllllIIllIIllIlIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIllIIllIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIIllIIllIlIIll.toCharArray();
        int llllllllllllllllllIIllIIllIlIIII = llIIlllIII[6];
        char[] charArray2 = llllllllllllllllllIIllIIllIlIlII2.toCharArray();
        int length = charArray2.length;
        int i = llIIlllIII[6];
        while (lIlIllIlllIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIIllIIllIlIIII % charArray.length]));
            "".length();
            llllllllllllllllllIIllIIllIlIIII++;
            i++;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b28, code lost:
        if (lIlIllIllllIl(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0b40, code lost:
        if (lIlIlllIIIIlI(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[41]) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0b43, code lost:
        gg.squire.account.AccBuilderSotf.c = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIllIlll[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[56]];
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.K.cz();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0b53, code lost:
        r0 = new java.lang.String[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[5]];
        r0[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[6]] = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIllIlll[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[57]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0b73, code lost:
        if (lIlIllIllllIl(net.unethicalite.api.entities.NPCs.getNearest(r0)) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0b7c, code lost:
        if (lIlIllIllllII(net.unethicalite.api.widgets.Dialog.isOpen() ? 1 : 0) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b7f, code lost:
        gg.squire.account.AccBuilderSotf.c = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIllIlll[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[58]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0b97, code lost:
        if (lIlIllIlllIII(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.di, o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[5]) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0b9a, code lost:
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aN.rD += o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[5];
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aN.u(gg.squire.account.AccBuilderSotf.m);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.di += o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[5];
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aN.rD = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[6];
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.dj = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0bca, code lost:
        r0 = new int[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[5]];
        r0[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[6]] = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[52];
        r0 = net.unethicalite.api.items.Inventory.getFirst(r0);
        r1 = new java.lang.String[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[5]];
        r1[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[6]] = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIllIlll[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[59]];
        r0.useOn(net.unethicalite.api.entities.TileObjects.getNearest(r1));
        net.unethicalite.api.commons.Time.sleepTicks(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[5]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0c10, code lost:
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0020g.a(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.cE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0c16, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d6, code lost:
        if (lIlIllIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[9]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021a, code lost:
        if (lIlIllIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[3]) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x025e, code lost:
        if (lIlIllIlllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[4]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0261, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIllIlll[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[1]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.J.llIIlllIII[5];
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
    public static void cw() {
        if (lIlIllIlllIII(C0018e.j(llIIlllIII[0]), llIIlllIII[1])) {
            K.cy();
        }
        if (lIlIllIlllIIl(C0018e.j(llIIlllIII[0]), llIIlllIII[1]) && lIlIllIlllIII(C0018e.j(llIIlllIII[2]), llIIlllIII[3])) {
            B.by();
        }
        if (!lIlIllIlllIIl(Skills.getLevel(Skill.COOKING), llIIlllIII[4]) || !lIlIllIlllIIl(C0018e.j(llIIlllIII[0]), llIIlllIII[1]) || !lIlIllIlllIlI(C0018e.j(llIIlllIII[2]), llIIlllIII[3])) {
            return;
        }
        if (lIlIllIlllIll(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIlIllIlllIII(bv.size(), llIIlllIII[5])) {
                System.out.println(llIIllIlll[llIIlllIII[6]]);
                bt = llIIlllIII[6];
            }
        }
        if (!lIlIllIllllII(bt ? 1 : 0)) {
            return;
        }
        if (lIlIllIllllII(an() ? 1 : 0) && lIlIllIllllII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIlIllIllllIl(nearest) && lIlIllIllllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIllIlll[llIIlllIII[5]];
                C0000a.a(nearest);
            }
            if (lIlIllIllllIl(nearest) && lIlIllIlllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIlIllIllllII(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIIlllIII[7]);
                    "".length();
                }
                if (lIlIllIlllIll(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[8]];
                    if (lIlIllIlllllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llIIlllIII[9]);
                        "".length();
                    }
                    if (lIlIllIlllllI(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(llIIlllIII[8]);
                        "".length();
                    }
                    int[] iArr = new int[llIIlllIII[5]];
                    iArr[llIIlllIII[6]] = llIIlllIII[10];
                    if (lIlIllIlllIll(Bank.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[llIIlllIII[5]];
                        iArr2[llIIlllIII[6]] = llIIlllIII[10];
                    }
                    int[] iArr3 = new int[llIIlllIII[5]];
                    iArr3[llIIlllIII[6]] = llIIlllIII[11];
                    if (lIlIllIlllIll(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIIlllIII[5]];
                        iArr4[llIIlllIII[6]] = llIIlllIII[11];
                    }
                    int[] iArr5 = new int[llIIlllIII[5]];
                    iArr5[llIIlllIII[6]] = llIIlllIII[12];
                    if (lIlIllIlllIll(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[llIIlllIII[5]];
                        iArr6[llIIlllIII[6]] = llIIlllIII[12];
                    }
                    int[] iArr7 = new int[llIIlllIII[2]];
                    iArr7[llIIlllIII[6]] = llIIlllIII[13];
                    iArr7[llIIlllIII[5]] = llIIlllIII[14];
                    iArr7[llIIlllIII[8]] = llIIlllIII[12];
                    iArr7[llIIlllIII[1]] = llIIlllIII[15];
                    iArr7[llIIlllIII[9]] = llIIlllIII[16];
                    iArr7[llIIlllIII[3]] = llIIlllIII[17];
                    iArr7[llIIlllIII[18]] = llIIlllIII[19];
                    iArr7[llIIlllIII[20]] = llIIlllIII[10];
                    iArr7[llIIlllIII[21]] = llIIlllIII[22];
                    iArr7[llIIlllIII[23]] = llIIlllIII[24];
                    iArr7[llIIlllIII[4]] = llIIlllIII[25];
                    if (lIlIllIllllII(C0018e.c(iArr7) ? 1 : 0)) {
                        Q();
                        System.out.println(llIIllIlll[llIIlllIII[9]]);
                        bt = llIIlllIII[5];
                        return;
                    }
                    int[] iArr8 = new int[llIIlllIII[2]];
                    iArr8[llIIlllIII[6]] = llIIlllIII[13];
                    iArr8[llIIlllIII[5]] = llIIlllIII[14];
                    iArr8[llIIlllIII[8]] = llIIlllIII[12];
                    iArr8[llIIlllIII[1]] = llIIlllIII[15];
                    iArr8[llIIlllIII[9]] = llIIlllIII[16];
                    iArr8[llIIlllIII[3]] = llIIlllIII[17];
                    iArr8[llIIlllIII[18]] = llIIlllIII[19];
                    iArr8[llIIlllIII[20]] = llIIlllIII[10];
                    iArr8[llIIlllIII[21]] = llIIlllIII[22];
                    iArr8[llIIlllIII[23]] = llIIlllIII[24];
                    iArr8[llIIlllIII[4]] = llIIlllIII[25];
                    if (lIlIllIlllIll(C0018e.c(iArr8) ? 1 : 0)) {
                        C0000a.a(llIIlllIII[13], llIIlllIII[4]);
                        C0000a.a(llIIlllIII[14], llIIlllIII[4]);
                        C0000a.a(llIIlllIII[12], llIIlllIII[4]);
                        C0000a.a(llIIlllIII[15], llIIlllIII[5]);
                        C0000a.a(llIIlllIII[16], llIIlllIII[5]);
                        C0000a.a(llIIlllIII[17], llIIlllIII[5]);
                        C0000a.a(llIIlllIII[19], llIIlllIII[5]);
                        C0000a.a(llIIlllIII[10], llIIlllIII[9]);
                        C0000a.a(llIIlllIII[22], llIIlllIII[5]);
                        C0000a.a(llIIlllIII[25], llIIlllIII[5]);
                        C0000a.a(llIIlllIII[24], llIIlllIII[3]);
                        C0000a.a(llIIlllIII[11], llIIlllIII[8]);
                        C0000a.a(llIIlllIII[26], llIIlllIII[7]);
                    }
                }
            }
        }
        if (lIlIllIlllIll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIllIlllIII(Movement.getRunEnergy(), llIIlllIII[27])) {
            Inventory.getFirst(C0019f.ba).interact(llIIllIlll[llIIlllIII[3]]);
            Time.sleepTicks(llIIlllIII[5]);
            "".length();
        }
        if (lIlIllIlllIll(an() ? 1 : 0) && lIlIllIllllII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            if (lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(gf), llIIlllIII[9])) {
                String[] strArr = new String[llIIlllIII[5]];
                strArr[llIIlllIII[6]] = llIIllIlll[llIIlllIII[18]];
                if (lIlIlllIIIIII(NPCs.getNearest(strArr))) {
                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[20]];
                    K.cz();
                }
            }
            String[] strArr2 = new String[llIIlllIII[5]];
            strArr2[llIIlllIII[6]] = llIIllIlll[llIIlllIII[21]];
            if (lIlIllIllllIl(NPCs.getNearest(strArr2))) {
                if (lIlIllIllllII(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr3 = new String[llIIlllIII[5]];
                    strArr3[llIIlllIII[6]] = llIIllIlll[llIIlllIII[23]];
                    TileObjects.getNearest(strArr3).interact(llIIllIlll[llIIlllIII[4]]);
                    Time.sleepTicks(llIIlllIII[5]);
                    "".length();
                }
                C0020g.a(cE);
            }
        }
        if (lIlIllIlllIlI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIIlllIII[4])) {
            if (lIlIlllIIIIIl(Vars.getBit(llIIlllIII[28]), llIIlllIII[5])) {
                if (lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(f3gg), llIIlllIII[20])) {
                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[2]];
                    Movement.walkTo(f3gg);
                    "".length();
                    Time.sleepTicks(llIIlllIII[5]);
                    "".length();
                }
                if (lIlIlllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(f3gg), llIIlllIII[20])) {
                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[29]];
                    C0020g.a(llIIllIlll[llIIlllIII[30]], cE);
                }
            }
            if (lIlIllIlllIlI(Vars.getBit(llIIlllIII[28]), llIIlllIII[5])) {
                int[] iArr9 = new int[llIIlllIII[5]];
                iArr9[llIIlllIII[6]] = llIIlllIII[10];
                if (lIlIllIlllIll(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIIlllIII[5]];
                    iArr10[llIIlllIII[6]] = llIIlllIII[26];
                    Item first = Inventory.getFirst(iArr10);
                    int[] iArr11 = new int[llIIlllIII[5]];
                    iArr11[llIIlllIII[6]] = llIIlllIII[10];
                    first.useOn(Inventory.getFirst(iArr11));
                    Time.sleepTicks(llIIlllIII[5]);
                    "".length();
                }
                int[] iArr12 = new int[llIIlllIII[5]];
                iArr12[llIIlllIII[6]] = llIIlllIII[10];
                if (lIlIllIllllII(Inventory.contains(iArr12) ? 1 : 0)) {
                    if (lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(gh), llIIlllIII[20])) {
                        AccBuilderSotf.c = llIIllIlll[llIIlllIII[31]];
                        Movement.walkTo(gh);
                        "".length();
                        Time.sleepTicks(llIIlllIII[5]);
                        "".length();
                    }
                    if (lIlIlllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(gh), llIIlllIII[20])) {
                        AccBuilderSotf.c = llIIllIlll[llIIlllIII[32]];
                        C0020g.a(llIIllIlll[llIIlllIII[33]], cE);
                    }
                }
            }
        }
        if (lIlIllIlllIlI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIIlllIII[34])) {
            if (lIlIlllIIIIIl(Vars.getBit(llIIlllIII[35]), llIIlllIII[9])) {
                di = llIIlllIII[6];
                if (lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(gh), llIIlllIII[20])) {
                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[36]];
                    Movement.walkTo(gh);
                    "".length();
                    Time.sleepTicks(llIIlllIII[5]);
                    "".length();
                }
                if (lIlIlllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(gh), llIIlllIII[20])) {
                    AccBuilderSotf.c = llIIllIlll[llIIlllIII[37]];
                    C0020g.a(llIIllIlll[llIIlllIII[38]], cE);
                    C0020g.a(llIIllIlll[llIIlllIII[34]], cE);
                }
            }
            if (lIlIllIlllIlI(Vars.getBit(llIIlllIII[35]), llIIlllIII[9])) {
                AccBuilderSotf.c = llIIllIlll[llIIlllIII[39]];
                C0020g.a(llIIllIlll[llIIlllIII[40]], cE);
            }
        }
        if (!lIlIlllIIIIIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIIlllIII[41]) || lIlIllIlllIlI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIIlllIII[42])) {
            AccBuilderSotf.c = llIIllIlll[llIIlllIII[43]];
            C0020g.a(llIIllIlll[llIIlllIII[44]], cE);
        }
        if (!lIlIllIlllIlI(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), llIIlllIII[27])) {
            return;
        }
        int[] iArr13 = new int[llIIlllIII[5]];
        iArr13[llIIlllIII[6]] = llIIlllIII[22];
        if (lIlIllIllllII(Equipment.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[llIIlllIII[5]];
            iArr14[llIIlllIII[6]] = llIIlllIII[22];
            if (lIlIllIlllIll(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIIlllIII[5]];
                iArr15[llIIlllIII[6]] = llIIlllIII[22];
                Inventory.getFirst(iArr15).interact(llIIllIlll[llIIlllIII[45]]);
                Time.sleepTicks(llIIlllIII[5]);
                "".length();
            }
        }
        int[] iArr16 = new int[llIIlllIII[5]];
        iArr16[llIIlllIII[6]] = llIIlllIII[22];
        if (lIlIllIlllIll(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[llIIlllIII[5]];
            iArr17[llIIlllIII[6]] = llIIlllIII[46];
            if (lIlIllIllllIl(TileItems.getNearest(iArr17))) {
                int[] iArr18 = new int[llIIlllIII[5]];
                iArr18[llIIlllIII[6]] = llIIlllIII[46];
                TileItems.getNearest(iArr18).interact(llIIllIlll[llIIlllIII[47]]);
                Time.sleepTicks(llIIlllIII[5]);
                "".length();
            }
        }
        int[] iArr19 = new int[llIIlllIII[5]];
        iArr19[llIIlllIII[6]] = llIIlllIII[46];
        if (lIlIllIlllIll(Inventory.contains(iArr19) ? 1 : 0)) {
            int[] iArr20 = new int[llIIlllIII[5]];
            iArr20[llIIlllIII[6]] = llIIlllIII[25];
            if (lIlIllIlllIll(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llIIlllIII[5]];
                iArr21[llIIlllIII[6]] = llIIlllIII[25];
                if (lIlIllIllllII(Equipment.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[llIIlllIII[5]];
                    iArr22[llIIlllIII[6]] = llIIlllIII[25];
                    Inventory.getFirst(iArr22).interact(llIIllIlll[llIIlllIII[48]]);
                    Time.sleepTicks(llIIlllIII[5]);
                    "".length();
                }
            }
            if (lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(gi), llIIlllIII[18])) {
                AccBuilderSotf.c = llIIllIlll[llIIlllIII[49]];
                Movement.walkTo(gi);
                "".length();
                Time.sleepTicks(llIIlllIII[5]);
                "".length();
            }
            if (lIlIlllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(gi), llIIlllIII[18])) {
                AccBuilderSotf.c = llIIllIlll[llIIlllIII[50]];
                if (lIlIlllIIIIII(Players.getLocal().getInteracting())) {
                    String[] strArr4 = new String[llIIlllIII[5]];
                    strArr4[llIIlllIII[6]] = llIIllIlll[llIIlllIII[41]];
                    NPCs.getNearest(strArr4).interact(llIIllIlll[llIIlllIII[51]]);
                    Time.sleepTicks(llIIlllIII[1]);
                    "".length();
                }
            }
        }
        int[] iArr23 = new int[llIIlllIII[5]];
        iArr23[llIIlllIII[6]] = llIIlllIII[52];
        if (!lIlIllIlllIll(Inventory.contains(iArr23) ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(llIIlllIII[53], llIIlllIII[54], llIIlllIII[6]);
        if (lIlIllIllllll(Players.getLocal().getWorldLocation().distanceTo(gf), llIIlllIII[9])) {
            String[] strArr5 = new String[llIIlllIII[5]];
            strArr5[llIIlllIII[6]] = llIIllIlll[llIIlllIII[55]];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIIlllIII[5]];
        iArr[llIIlllIII[6]] = llIIlllIII[25];
        if (lIlIllIlllllI(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[llIIlllIII[5]];
            iArr2[llIIlllIII[6]] = llIIlllIII[16];
            if (lIlIllIlllllI(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[llIIlllIII[5]];
                iArr3[llIIlllIII[6]] = llIIlllIII[17];
                if (lIlIllIlllIll(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llIIlllIII[5]];
                    iArr4[llIIlllIII[6]] = llIIlllIII[19];
                    if (lIlIllIlllIll(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIIlllIII[5]];
                        iArr5[llIIlllIII[6]] = llIIlllIII[10];
                        if (lIlIllIlllIll(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIlllIII[5]];
                            iArr6[llIIlllIII[6]] = llIIlllIII[22];
                            if (lIlIllIlllIll(Inventory.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[llIIlllIII[5]];
                                iArr7[llIIlllIII[6]] = llIIlllIII[26];
                                if (lIlIllIlllIll(Inventory.contains(iArr7) ? 1 : 0)) {
                                    ?? r0 = llIIlllIII[5];
                                    "".length();
                                    return (111 ^ 107) <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return llIIlllIII[6];
    }
}
