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
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.W  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/W.class */
public class W implements K {
    private static /* synthetic */ WorldPoint kJ;
    private static /* synthetic */ int[] lIlIllIIlI;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<C0003d> bp;
    public static /* synthetic */ WorldArea kH;
    private static /* synthetic */ WorldPoint kI;
    private static /* synthetic */ String[] lIlIllIIII;
    private static /* synthetic */ int[] kK;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0148, code lost:
        if (lIIlIIlIllIlI(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.W.lIlIllIIlI[1]) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dG() {
        if (lIIlIIlIlIlIl(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[42]];
            C0001b.a(bp);
            if (lIIlIIlIlIllI(bp.size(), lIlIllIIlI[1])) {
                System.out.println(lIlIllIIII[lIlIllIIlI[43]]);
                bn = lIlIllIIlI[0];
            }
        }
        if (lIIlIIlIlIlll(bn ? 1 : 0)) {
            if (lIIlIIlIlIlll(dH() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIlIllIII(nearest) && lIIlIIlIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[44]];
                    C0000a.a(nearest);
                }
                if (lIIlIIlIllIII(nearest) && lIIlIIlIlIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlIIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[45]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIllIIlI[4]);
                        "".length();
                    }
                    if (lIIlIIlIlIlIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[46]];
                        if (lIIlIIlIllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIllIIlI[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIlIllIIlI[1]];
                        iArr[lIlIllIIlI[0]] = lIlIllIIlI[6];
                        if (lIIlIIlIlIlll(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[lIlIllIIlI[1]];
                            strArr[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[47]];
                        }
                        if (!lIIlIIlIlIlll(Bank.contains(C0005f.aN) ? 1 : 0) || !lIIlIIlIlIlll(Inventory.contains(C0005f.aN) ? 1 : 0) || !lIIlIIlIlIlll(Equipment.contains(C0005f.aN) ? 1 : 0)) {
                            int[] iArr2 = new int[lIlIllIIlI[1]];
                            iArr2[lIlIllIIlI[0]] = lIlIllIIlI[6];
                            if (lIIlIIlIlIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                                Bank.withdraw(lIlIllIIII[lIlIllIIlI[49]], lIlIllIIlI[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlIllIIlI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr2 = new String[lIlIllIIlI[1]];
                                    strArr2[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[76]];
                                    if (lIIlIIlIllIIl(Inventory.getCount(strArr2))) {
                                        ?? r0 = lIlIllIIlI[1];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlIllIIlI[0];
                                }, lIlIllIIlI[4]);
                                "".length();
                            }
                            if (lIIlIIlIlIlIl(Bank.contains(C0005f.aN) ? 1 : 0)) {
                                C0000a.b(C0005f.aN, lIlIllIIlI[1]);
                            }
                        }
                        O();
                        System.out.println(lIlIllIIII[lIlIllIIlI[48]]);
                        bn = lIlIllIIlI[1];
                        return;
                    }
                }
            }
            if (lIIlIIlIlIlIl(dH() ? 1 : 0)) {
                if (lIIlIIlIlIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIlIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIllIIlI[1]];
                    iArr3[lIlIllIIlI[0]] = lIlIllIIlI[50];
                    if (lIIlIIlIlIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIlIllIIlI[51], lIlIllIIlI[52], lIlIllIIlI[0]);
                        if (lIIlIIlIllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIllIIlI[9])) {
                            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[53]];
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIlIllIIlI[1]);
                            "".length();
                        }
                        if (lIIlIIlIlllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIllIIlI[13])) {
                            if (lIIlIIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                            }
                            if (lIIlIIlIlIlIl(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks(lIlIllIIlI[2]);
                                "".length();
                                Bank.depositInventory();
                                Time.sleepTicks(lIlIllIIlI[2]);
                                "".length();
                                C0000a.a(lIlIllIIlI[6], lIlIllIIlI[1]);
                            }
                        }
                    }
                }
                if (lIIlIIlIlIlll(Inventory.isFull() ? 1 : 0)) {
                    if (lIIlIIlIlIlll(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIlIllIll(Players.getLocal().getWorldLocation().distanceTo(kI), lIlIllIIlI[7])) {
                        AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[54]];
                        if (lIIlIIlIlIlIl(Inventory.contains(C0005f.aN) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.aN).interact(lIlIllIIII[lIlIllIIlI[55]]);
                        }
                        Movement.walkTo(kI);
                        "".length();
                        Time.sleepTicks(lIlIllIIlI[1]);
                        "".length();
                    }
                    if (lIIlIIlIlIlIl(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[56]];
                        if (lIIlIIlIlllII(Players.getLocal().getAnimation(), lIlIllIIlI[30])) {
                            int[] iArr4 = new int[lIlIllIIlI[1]];
                            iArr4[lIlIllIIlI[0]] = lIlIllIIlI[31];
                            if (lIIlIIlIllIII(NPCs.getNearest(iArr4))) {
                                int[] iArr5 = new int[lIlIllIIlI[1]];
                                iArr5[lIlIllIIlI[0]] = lIlIllIIlI[31];
                                NPCs.getNearest(iArr5).interact(lIlIllIIlI[0]);
                                Time.sleepTicks(lIlIllIIlI[7]);
                                "".length();
                            }
                        }
                    }
                }
                if (lIIlIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr6 = new int[lIlIllIIlI[1]];
                    iArr6[lIlIllIIlI[0]] = lIlIllIIlI[50];
                    if (lIIlIIlIlIlIl(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIlIllIIlI[1]];
                        iArr7[lIlIllIIlI[0]] = lIlIllIIlI[50];
                        Inventory.getAll(iArr7).stream().forEach((v0) -> {
                            v0.drop();
                        });
                    }
                }
            }
        }
    }

    private static boolean lIIlIIlIlllII(int i, int i2) {
        return i == i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        dE();
        return lIlIllIIlI[72];
    }

    public static void O() {
        int[] iArr = new int[lIlIllIIlI[1]];
        iArr[lIlIllIIlI[0]] = lIlIllIIlI[6];
        if (lIIlIIlIlIlll(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIlI[6], lIlIllIIlI[1], lIlIllIIlI[4]));
            "".length();
        }
        int[] iArr2 = new int[lIlIllIIlI[1]];
        iArr2[lIlIllIIlI[0]] = lIlIllIIlI[8];
        if (lIIlIIlIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIlI[8], lIlIllIIlI[1], lIlIllIIlI[4]));
            "".length();
        }
        int[] iArr3 = new int[lIlIllIIlI[1]];
        iArr3[lIlIllIIlI[0]] = lIlIllIIlI[10];
        if (lIIlIIlIlIlll(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIlI[10], lIlIllIIlI[1], lIlIllIIlI[63]));
            "".length();
        }
        int[] iArr4 = new int[lIlIllIIlI[1]];
        iArr4[lIlIllIIlI[0]] = lIlIllIIlI[14];
        if (lIIlIIlIlIlll(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIlI[14], lIlIllIIlI[64], lIlIllIIlI[65]));
            "".length();
        }
        int[] iArr5 = new int[lIlIllIIlI[1]];
        iArr5[lIlIllIIlI[0]] = lIlIllIIlI[12];
        if (lIIlIIlIlIlll(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIlI[12], lIlIllIIlI[66], lIlIllIIlI[7]));
            "".length();
        }
        int[] iArr6 = new int[lIlIllIIlI[1]];
        iArr6[lIlIllIIlI[0]] = lIlIllIIlI[67];
        if (lIIlIIlIlIlll(Bank.contains(iArr6) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIlI[67], lIlIllIIlI[1], lIlIllIIlI[4]));
            "".length();
        }
        int[] iArr7 = new int[lIlIllIIlI[1]];
        iArr7[lIlIllIIlI[0]] = lIlIllIIlI[24];
        if (lIIlIIlIlIlll(Bank.contains(iArr7) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIlI[24], lIlIllIIlI[16], lIlIllIIlI[4]));
            "".length();
        }
        if (lIIlIIlIlIlll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIllIIII[lIlIllIIlI[75]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIlI[68], lIlIllIIlI[7], lIlIllIIlI[69]));
            "".length();
        }
        int[] iArr8 = new int[lIlIllIIlI[1]];
        iArr8[lIlIllIIlI[0]] = lIlIllIIlI[70];
        if (lIIlIIlIlIlll(Bank.contains(iArr8) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIlI[70], lIlIllIIlI[54], lIlIllIIlI[71]));
            "".length();
        }
    }

    private static void lIIlIIlIlIlII() {
        lIlIllIIlI = new int[101];
        lIlIllIIlI[0] = " ".length() & (" ".length() ^ (-" ".length()));
        lIlIllIIlI[1] = " ".length();
        lIlIllIIlI[2] = "  ".length();
        lIlIllIIlI[3] = "   ".length();
        lIlIllIIlI[4] = (-((-9065) & 12153)) & (-8195) & 16282;
        lIlIllIIlI[5] = 99 ^ 103;
        lIlIllIIlI[6] = (-9745) & 10047;
        lIlIllIIlI[7] = 191 ^ 186;
        lIlIllIIlI[8] = (-14853) & 15159;
        lIlIllIIlI[9] = 188 ^ 186;
        lIlIllIIlI[10] = (-25731) & 26039;
        lIlIllIIlI[11] = (86 ^ 94) ^ (165 ^ 170);
        lIlIllIIlI[12] = (-(((130 + 86) - 134) + 116)) & (-10753) & 11263;
        lIlIllIIlI[13] = 102 ^ 110;
        lIlIllIIlI[14] = (-((-19001) & 27385)) & (-19973) & 28669;
        lIlIllIIlI[15] = 207 ^ 198;
        lIlIllIIlI[16] = (((91 + 40) - 94) + 105) ^ (((41 + 15) - (-48)) + 28);
        lIlIllIIlI[17] = 173 ^ 166;
        lIlIllIIlI[18] = 106 ^ 102;
        lIlIllIIlI[19] = (84 ^ 11) ^ (148 ^ 198);
        lIlIllIIlI[20] = 124 ^ 114;
        lIlIllIIlI[21] = (-2054) & 102053;
        lIlIllIIlI[22] = 53 ^ 58;
        lIlIllIIlI[23] = (-((-2037) & 4087)) & (-29701) & 32750;
        lIlIllIIlI[24] = (-(((47 + 75) - 63) + 70)) & (-24580) & 32715;
        lIlIllIIlI[25] = 118 ^ 102;
        lIlIllIIlI[26] = (83 ^ 13) ^ (39 ^ 104);
        lIlIllIIlI[27] = (139 ^ 135) ^ (17 ^ 9);
        lIlIllIIlI[28] = 15 ^ 29;
        lIlIllIIlI[29] = 102 ^ 117;
        lIlIllIIlI[30] = -" ".length();
        lIlIllIIlI[31] = (-24771) & 26314;
        lIlIllIIlI[32] = 73 ^ 92;
        lIlIllIIlI[33] = (95 ^ 85) ^ (8 ^ 20);
        lIlIllIIlI[34] = 17 ^ 6;
        lIlIllIIlI[35] = 12 ^ 20;
        lIlIllIIlI[36] = 139 ^ 146;
        lIlIllIIlI[37] = (((157 + 37) - 58) + 34) ^ (((103 + 74) - 75) + 74);
        lIlIllIIlI[38] = (145 ^ 175) ^ (154 ^ 191);
        lIlIllIIlI[39] = (124 ^ 100) ^ (98 ^ 102);
        lIlIllIIlI[40] = 154 ^ 135;
        lIlIllIIlI[41] = 110 ^ 112;
        lIlIllIIlI[42] = (((106 + 93) - 150) + 116) ^ (((137 + 32) - 4) + 21);
        lIlIllIIlI[43] = 3 ^ 35;
        lIlIllIIlI[44] = (208 ^ 165) ^ (230 ^ 178);
        lIlIllIIlI[45] = (((74 + 23) - 0) + 58) ^ (((178 + 78) - 87) + 16);
        lIlIllIIlI[46] = (194 ^ 171) ^ (141 ^ 199);
        lIlIllIIlI[47] = 27 ^ 63;
        lIlIllIIlI[48] = 76 ^ 105;
        lIlIllIIlI[49] = 30 ^ 56;
        lIlIllIIlI[50] = (-((-4245) & 31391)) & (-4241) & 31707;
        lIlIllIIlI[51] = (-22033) & 24567;
        lIlIllIIlI[52] = (-25097) & 28669;
        lIlIllIIlI[53] = 1 ^ 38;
        lIlIllIIlI[54] = 153 ^ 177;
        lIlIllIIlI[55] = (((85 + 97) - 57) + 53) ^ (((33 + 148) - 58) + 32);
        lIlIllIIlI[56] = 53 ^ 31;
        lIlIllIIlI[57] = 125 ^ 86;
        lIlIllIIlI[58] = (230 ^ 189) ^ (17 ^ 102);
        lIlIllIIlI[59] = 40 ^ 5;
        lIlIllIIlI[60] = (((90 + 103) - 146) + 91) ^ (((154 + 79) - 155) + 86);
        lIlIllIIlI[61] = 54 ^ 25;
        lIlIllIIlI[62] = 153 ^ 169;
        lIlIllIIlI[63] = (-((-8709) & 32343)) & (-130) & 32763;
        lIlIllIIlI[64] = (-((-2329) & 24476)) & (-10257) & 32703;
        lIlIllIIlI[65] = (-18444) & 18943;
        lIlIllIIlI[66] = (-16643) & 29642;
        lIlIllIIlI[67] = (-((-1325) & 25981)) & (-4131) & 32639;
        lIlIllIIlI[68] = (-((-12900) & 29559)) & (-4097) & 32735;
        lIlIllIIlI[69] = (-7171) & 32170;
        lIlIllIIlI[70] = (-8225) & 16231;
        lIlIllIIlI[71] = (-5132) & 6031;
        lIlIllIIlI[72] = (((178 + 78) - 224) + 188) ^ (((176 + 44) - 190) + 154);
        lIlIllIIlI[73] = 129 ^ 176;
        lIlIllIIlI[74] = (242 ^ 180) ^ (119 ^ 82);
        lIlIllIIlI[75] = (191 ^ 168) ^ (3 ^ 38);
        lIlIllIIlI[76] = 62 ^ 13;
        lIlIllIIlI[77] = (-16393) & 17900;
        lIlIllIIlI[78] = 180 ^ 128;
        lIlIllIIlI[79] = (12 ^ 103) ^ (74 ^ 20);
        lIlIllIIlI[80] = (((194 + 176) - 160) + 37) ^ (((161 + 45) - 88) + 75);
        lIlIllIIlI[81] = 191 ^ 136;
        lIlIllIIlI[82] = 53 ^ 13;
        lIlIllIIlI[83] = (-((-8330) & 13487)) & (-1) & 7663;
        lIlIllIIlI[84] = (-((-11553) & 28474)) & (-12291) & 32767;
        lIlIllIIlI[85] = (-((-10507) & 15659)) & (-16897) & 24565;
        lIlIllIIlI[86] = (-12292) & 15863;
        lIlIllIIlI[87] = (-30219) & 32750;
        lIlIllIIlI[88] = (-(((21 + 81) - 89) + 118)) & (-4098) & 7639;
        lIlIllIIlI[89] = (-((-8545) & 27513)) & (-12289) & 32767;
        lIlIllIIlI[90] = (-((-1457) & 16317)) & (-16387) & 32767;
        lIlIllIIlI[91] = (-29185) & 30703;
        lIlIllIIlI[92] = (-1601) & 1917;
        lIlIllIIlI[93] = (-19497) & 19823;
        lIlIllIIlI[94] = (-((-21721) & 32509)) & (-21649) & 32767;
        lIlIllIIlI[95] = (-24199) & 24543;
        lIlIllIIlI[96] = (-((-2051) & 31283)) & (-1025) & 30591;
        lIlIllIIlI[97] = (-((-3783) & 20175)) & (-4113) & 31834;
        lIlIllIIlI[98] = (-((-2405) & 19454)) & (-35) & 28415;
        lIlIllIIlI[99] = (-((-10245) & 27557)) & (-4122) & 32761;
        lIlIllIIlI[100] = 185 ^ 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIIlIllIlI(Skills.getLevel(Skill.FISHING), lIlIllIIlI[74])) {
            ?? r0 = lIlIllIIlI[1];
            "".length();
            return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIllIIlI[0];
    }

    private static String lIIlIIlIlIIIl(String lllllllllllllllllllIlIIlIlIIIlll, String lllllllllllllllllllIlIIlIlIIIllI) {
        String lllllllllllllllllllIlIIlIlIIIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIlIIlIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIlIIlIlIIIlIl = new StringBuilder();
        char[] lllllllllllllllllllIlIIlIlIIIlII = lllllllllllllllllllIlIIlIlIIIllI.toCharArray();
        int lllllllllllllllllllIlIIlIlIIIIll = lIlIllIIlI[0];
        char[] charArray = lllllllllllllllllllIlIIlIlIIIlll2.toCharArray();
        int length = charArray.length;
        int i = lIlIllIIlI[0];
        while (lIIlIIlIlIllI(i, length)) {
            lllllllllllllllllllIlIIlIlIIIlIl.append((char) (charArray[i] ^ lllllllllllllllllllIlIIlIlIIIlII[lllllllllllllllllllIlIIlIlIIIIll % lllllllllllllllllllIlIIlIlIIIlII.length]));
            "".length();
            lllllllllllllllllllIlIIlIlIIIIll++;
            i++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllIlIIlIlIIIlIl);
    }

    private static boolean lIIlIIlIllIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIlIlIlIl(int i) {
        return i != 0;
    }

    public static void dF() {
        if (lIIlIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[38]];
            System.out.println(lIlIllIIII[lIlIllIIlI[39]]);
            Inventory.getAll(kK).stream().forEach((v0) -> {
                v0.drop();
            });
        }
        if (lIIlIIlIlIlll(Inventory.isFull() ? 1 : 0) && lIIlIIlIlllII(Players.getLocal().getAnimation(), lIlIllIIlI[30])) {
            String[] strArr = new String[lIlIllIIlI[1]];
            strArr[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[40]];
            NPCs.getNearest(strArr).interact(lIlIllIIII[lIlIllIIlI[41]]);
            Time.sleepTicks(lIlIllIIlI[2]);
            "".length();
        }
    }

    private static void lIIlIIlIlIIll() {
        lIlIllIIII = new String[lIlIllIIlI[100]];
        lIlIllIIII[lIlIllIIlI[0]] = lIIlIIlIIllIl("tNSBWZuCFfKSCY+fU6yoMQ==", "HXfjV");
        lIlIllIIII[lIlIllIIlI[1]] = lIIlIIlIIllIl("4U6WnN9pvzQpRL0jn6VgdYn5ebAS9OlILxLtgwbKKu6/T6EtWeMkur71WGgHt6GfB25pqDtijjE=", "HqqZB");
        lIlIllIIII[lIlIllIIlI[2]] = lIIlIIlIlIIIl("Cg0mAC0lGDkHLWQYP0koJQI7", "DlPiJ");
        lIlIllIIII[lIlIllIIlI[3]] = lIIlIIlIlIIIl("ADYmBiMhIWMKKyEt", "OFChJ");
        lIlIllIIII[lIlIllIIlI[5]] = lIIlIIlIlIIIl("LzgGJh8ONw9iEQY3AysdAA==", "gYhBs");
        lIlIllIIII[lIlIllIIlI[7]] = lIIlIIlIlIIlI("epID5GcGg2oQeGiwxbrRlq7Pjh8ZLRWU", "UeBMz");
        lIlIllIIII[lIlIllIIlI[9]] = lIIlIIlIlIIlI("BKjiLlKYPJ8X5/fVDq4aEQ==", "ApRWV");
        lIlIllIIII[lIlIllIIlI[11]] = lIIlIIlIlIIIl("LDoqTgMDJTsHCw12IQEBSiQ8Cg==", "jVSne");
        lIlIllIIII[lIlIllIIlI[13]] = lIIlIIlIlIIIl("NCYOJj0XMQ==", "rCoRU");
        lIlIllIIII[lIlIllIIlI[15]] = lIIlIIlIIllIl("LdS4Wjv3iueoLO1/nRjPSQ==", "PVpcT");
        lIlIllIIII[lIlIllIIlI[16]] = lIIlIIlIlIIlI("SqlM0RUSJfUQuNN1gjoaWr6Jt50BZVUhDX0BbZA8DpLda1omoT9hTiVROCp0xkML", "LUPJr");
        lIlIllIIII[lIlIllIIlI[17]] = lIIlIIlIlIIIl("IC4AOTRTJQgmMBotBnU2Fjc=", "sCaUX");
        lIlIllIIII[lIlIllIIlI[18]] = lIIlIIlIIllIl("U5yuoqnriOrHaEpD0WmDgw==", "tlyeY");
        lIlIllIIII[lIlIllIIlI[19]] = lIIlIIlIlIIIl("BQ0qVgUqEjsfDSRBIRkH", "CaSvc");
        lIlIllIIII[lIlIllIIlI[20]] = lIIlIIlIlIIIl("MgE5MQYRFg==", "tdXEn");
        lIlIllIIII[lIlIllIIlI[22]] = lIIlIIlIlIIIl("IDE8JyUIP28tLQ8s", "fXOOL");
        lIlIllIIII[lIlIllIIlI[25]] = lIIlIIlIIllIl("8L6ODx7sE2yVyfeLQaPt6Q==", "cnoTh");
        lIlIllIIII[lIlIllIIlI[26]] = lIIlIIlIlIIlI("4xKWZgrSg3pYeSlPvmp7gA==", "GqniF");
        lIlIllIIII[lIlIllIIlI[28]] = lIIlIIlIlIIlI("vxF6I6WmxE+XRyAlOeiSZGyX0BIltXM3", "lnIvv");
        lIlIllIIII[lIlIllIIlI[29]] = lIIlIIlIIllIl("zBU6hjkgeD4=", "mCfXv");
        lIlIllIIII[lIlIllIIlI[27]] = lIIlIIlIlIIlI("McZvJEuoUvc=", "jEnSs");
        lIlIllIIII[lIlIllIIlI[32]] = lIIlIIlIlIIIl("HyQvch8+ZSo/Cj0peTQCIi15IRs+MQ==", "QEYRk");
        lIlIllIIII[lIlIllIIlI[33]] = lIIlIIlIIllIl("6EZW4gFbiZ0=", "sUclb");
        lIlIllIIII[lIlIllIIlI[34]] = lIIlIIlIlIIlI("8b/AK/ohxDg=", "rPCnD");
        lIlIllIIII[lIlIllIIlI[35]] = lIIlIIlIlIIlI("VZQnK9oVXdF/B0VenMGuIwJTYJeBX1i+", "Ibzny");
        lIlIllIIII[lIlIllIIlI[36]] = lIIlIIlIIllIl("Pw7LDQh5KNQ=", "dKjOE");
        lIlIllIIII[lIlIllIIlI[37]] = lIIlIIlIlIIlI("Dt3T1cBjR68=", "eqQpw");
        lIlIllIIII[lIlIllIIlI[38]] = lIIlIIlIlIIlI("+1c3TI9KlShUo7tOcnm5nA==", "eQFnw");
        lIlIllIIII[lIlIllIIlI[39]] = lIIlIIlIlIIIl("Eh0GNgk/AQ5mFTkIGg==", "VoiFy");
        lIlIllIIII[lIlIllIIlI[40]] = lIIlIIlIlIIIl("FgAgOR0+DnMiBD8d", "PiSQt");
        lIlIllIIII[lIlIllIIlI[41]] = lIIlIIlIlIIlI("mXwrrUoIaVI=", "JoYox");
        lIlIllIIII[lIlIllIIlI[42]] = lIIlIIlIlIIIl("EyMWGhY2dgYHHTwl", "QVosx");
        lIlIllIIII[lIlIllIIlI[43]] = lIIlIIlIIllIl("VXGc6x4za/cOgNLXxd6/g1UI2BJ4bfq24GHky1ZY2usmby8UZyrCnkFLa3JoDe4SnAVMpr629Zw=", "damAi");
        lIlIllIIII[lIlIllIIlI[44]] = lIIlIIlIlIIlI("LptD2TIs0Ik/uJBOqv+CybmwioCEAea4", "zVBEE");
        lIlIllIIII[lIlIllIIlI[45]] = lIIlIIlIIllIl("hCEAyhqM3YdiUlquilXjNw==", "xnMKR");
        lIlIllIIII[lIlIllIIlI[46]] = lIIlIIlIIllIl("2wLDzeHxYwJ3m1py3a+pnuWzdJ17pdan", "Skjci");
        lIlIllIIII[lIlIllIIlI[47]] = lIIlIIlIIllIl("an6a2mnG8fv/eMQDqfRFqodUgAjuyN9l", "MXhNt");
        lIlIllIIII[lIlIllIIlI[48]] = lIIlIIlIIllIl("DX2u0Yo9gJoZ+wvI7xfs0luUwRkG9eC/KWahuQfcDivsAJW84O2KSsr16rYcVuXB", "OjSkm");
        lIlIllIIII[lIlIllIIlI[49]] = lIIlIIlIIllIl("PT6upr/wgNkeGCzuzy7d1oiWgHcrNM8O", "RFEhn");
        lIlIllIIII[lIlIllIIlI[53]] = lIIlIIlIlIIIl("JDM5WDMFci0ZKQE=", "jROxG");
        lIlIllIIII[lIlIllIIlI[54]] = lIIlIIlIIllIl("lX5x46JcEqWEvE4Tjv84H0GksgyZ2DLC", "xtlVd");
        lIlIllIIII[lIlIllIIlI[55]] = lIIlIIlIIllIl("9jMLdeGzSsg=", "usebu");
        lIlIllIIII[lIlIllIIlI[56]] = lIIlIIlIlIIIl("ESYyOgs5KA==", "WOARb");
        lIlIllIIII[lIlIllIIlI[57]] = lIIlIIlIlIIlI("8TgBVsw/N7cvOQIgUX6nrUOkDITvNTxg", "jlTpJ");
        lIlIllIIII[lIlIllIIlI[58]] = lIIlIIlIlIIlI("4CdYUuNjagReZUhc9K+jHbY20uqvs8Os", "YCNaZ");
        lIlIllIIII[lIlIllIIlI[59]] = lIIlIIlIIllIl("7NNnvB5qd65UKk0X/JGHgg==", "FmsmD");
        lIlIllIIII[lIlIllIIlI[60]] = lIIlIIlIIllIl("2mydlmUtuVtqxnJl2VaDpA==", "RVxUC");
        lIlIllIIII[lIlIllIIlI[61]] = lIIlIIlIlIIIl("AgonHwEhHQ==", "DoFki");
        lIlIllIIII[lIlIllIIlI[62]] = lIIlIIlIIllIl("Ak/5OTjmNpVjzHWWVE6B2A==", "bMChL");
        lIlIllIIII[lIlIllIIlI[73]] = lIIlIIlIlIIlI("kB2O3CLc8Iw=", "CLhGs");
        lIlIllIIII[lIlIllIIlI[75]] = lIIlIIlIlIIlI("Gbuyj7VBUXm7EwEUa2GctiTZPWSWbWVH", "DCklH");
        lIlIllIIII[lIlIllIIlI[76]] = lIIlIIlIIllIl("EddwLcMEbfXrUAW49h3GuExHCeQ5n4Jq", "llSBX");
        lIlIllIIII[lIlIllIIlI[78]] = lIIlIIlIIllIl("iKZGjHtqdQAiBKiue5yRmQ==", "tZNXB");
        lIlIllIIII[lIlIllIIlI[79]] = lIIlIIlIlIIIl("AyYPFScgMQ==", "ECnaO");
        lIlIllIIII[lIlIllIIlI[80]] = lIIlIIlIlIIIl("ADYOTy0vKR8GJSF6BQAv", "FZwoK");
        lIlIllIIII[lIlIllIIlI[81]] = lIIlIIlIIllIl("02MzOk/HcWyS0yiL8qNDbQ==", "JKGgw");
        lIlIllIIII[lIlIllIIlI[82]] = lIIlIIlIlIIlI("+oMKgKcO0VMxwcjLM6132aEx1dmIhHkC", "ChSzN");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0162, code lost:
        if (lIIlIIlIllIlI(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.W.lIlIllIIlI[1]) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a6, code lost:
        if (lIIlIIlIllIlI(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.W.lIlIllIIlI[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ea, code lost:
        if (lIIlIIlIllIlI(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.W.lIlIllIIlI[1]) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022e, code lost:
        if (lIIlIIlIllIlI(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.W.lIlIllIIlI[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0272, code lost:
        if (lIIlIIlIllIlI(net.unethicalite.api.items.Inventory.getCount(r0), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.W.lIlIllIIlI[1]) != false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v319, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dE() {
        if (lIIlIIlIlIlIl(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[0]];
            C0001b.a(bp);
            if (lIIlIIlIlIllI(bp.size(), lIlIllIIlI[1])) {
                System.out.println(lIlIllIIII[lIlIllIIlI[1]]);
                bn = lIlIllIIlI[0];
            }
        }
        if (lIIlIIlIlIlll(bn ? 1 : 0)) {
            if (lIIlIIlIlIlll(al() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIlIllIII(nearest) && lIIlIIlIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[2]];
                    C0000a.a(nearest);
                }
                if (lIIlIIlIllIII(nearest) && lIIlIIlIlIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlIIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[3]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIllIIlI[4]);
                        "".length();
                    }
                    if (lIIlIIlIlIlIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[5]];
                        if (lIIlIIlIllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIllIIlI[5]);
                            "".length();
                        }
                        if (lIIlIIlIllIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIllIIlI[2]);
                            "".length();
                        }
                        int[] iArr = new int[lIlIllIIlI[1]];
                        iArr[lIlIllIIlI[0]] = lIlIllIIlI[6];
                        if (lIIlIIlIlIlll(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[lIlIllIIlI[1]];
                            strArr[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[7]];
                        }
                        int[] iArr2 = new int[lIlIllIIlI[1]];
                        iArr2[lIlIllIIlI[0]] = lIlIllIIlI[8];
                        if (lIIlIIlIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
                            String[] strArr2 = new String[lIlIllIIlI[1]];
                            strArr2[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[9]];
                        }
                        int[] iArr3 = new int[lIlIllIIlI[1]];
                        iArr3[lIlIllIIlI[0]] = lIlIllIIlI[10];
                        if (lIIlIIlIlIlll(Bank.contains(iArr3) ? 1 : 0)) {
                            String[] strArr3 = new String[lIlIllIIlI[1]];
                            strArr3[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[11]];
                        }
                        int[] iArr4 = new int[lIlIllIIlI[1]];
                        iArr4[lIlIllIIlI[0]] = lIlIllIIlI[12];
                        if (lIIlIIlIlIlll(Bank.contains(iArr4) ? 1 : 0)) {
                            String[] strArr4 = new String[lIlIllIIlI[1]];
                            strArr4[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[13]];
                        }
                        int[] iArr5 = new int[lIlIllIIlI[1]];
                        iArr5[lIlIllIIlI[0]] = lIlIllIIlI[14];
                        if (lIIlIIlIlIlll(Bank.contains(iArr5) ? 1 : 0)) {
                            String[] strArr5 = new String[lIlIllIIlI[1]];
                            strArr5[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[15]];
                        }
                        if ((!lIIlIIlIlIlll(Bank.contains(C0005f.aN) ? 1 : 0) || lIIlIIlIllIlI(Inventory.getCount(C0005f.aN), lIlIllIIlI[1])) && !lIIlIIlIlIlIl(Equipment.contains(C0005f.aN) ? 1 : 0)) {
                            int[] iArr6 = new int[lIlIllIIlI[1]];
                            iArr6[lIlIllIIlI[0]] = lIlIllIIlI[6];
                            if (lIIlIIlIlIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                                Bank.withdraw(lIlIllIIII[lIlIllIIlI[17]], lIlIllIIlI[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlIllIIlI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIlIllIIlI[1]];
                                    strArr6[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[82]];
                                    if (lIIlIIlIllIIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIlIllIIlI[1];
                                        "".length();
                                        return "  ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlIllIIlI[0];
                                }, lIlIllIIlI[4]);
                                "".length();
                            }
                            int[] iArr7 = new int[lIlIllIIlI[1]];
                            iArr7[lIlIllIIlI[0]] = lIlIllIIlI[8];
                            if (lIIlIIlIlIlIl(Bank.contains(iArr7) ? 1 : 0)) {
                                Bank.withdraw(lIlIllIIII[lIlIllIIlI[18]], lIlIllIIlI[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlIllIIlI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIlIllIIlI[1]];
                                    strArr6[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[81]];
                                    if (lIIlIIlIllIIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIlIllIIlI[1];
                                        "".length();
                                        return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlIllIIlI[0];
                                }, lIlIllIIlI[4]);
                                "".length();
                            }
                            int[] iArr8 = new int[lIlIllIIlI[1]];
                            iArr8[lIlIllIIlI[0]] = lIlIllIIlI[10];
                            if (lIIlIIlIlIlIl(Bank.contains(iArr8) ? 1 : 0)) {
                                Bank.withdraw(lIlIllIIII[lIlIllIIlI[19]], lIlIllIIlI[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlIllIIlI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIlIllIIlI[1]];
                                    strArr6[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[80]];
                                    if (lIIlIIlIllIIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIlIllIIlI[1];
                                        "".length();
                                        return (-" ".length()) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlIllIIlI[0];
                                }, lIlIllIIlI[4]);
                                "".length();
                            }
                            int[] iArr9 = new int[lIlIllIIlI[1]];
                            iArr9[lIlIllIIlI[0]] = lIlIllIIlI[12];
                            if (lIIlIIlIlIlIl(Bank.contains(iArr9) ? 1 : 0)) {
                                Bank.withdraw(lIlIllIIII[lIlIllIIlI[20]], lIlIllIIlI[21], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlIllIIlI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIlIllIIlI[1]];
                                    strArr6[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[79]];
                                    if (lIIlIIlIllIIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIlIllIIlI[1];
                                        "".length();
                                        return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlIllIIlI[0];
                                }, lIlIllIIlI[4]);
                                "".length();
                            }
                            int[] iArr10 = new int[lIlIllIIlI[1]];
                            iArr10[lIlIllIIlI[0]] = lIlIllIIlI[14];
                            if (lIIlIIlIlIlIl(Bank.contains(iArr10) ? 1 : 0)) {
                                Bank.withdraw(lIlIllIIII[lIlIllIIlI[22]], lIlIllIIlI[23], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIlIllIIlI[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIlIllIIlI[1]];
                                    strArr6[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[78]];
                                    if (lIIlIIlIllIIl(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIlIllIIlI[1];
                                        "".length();
                                        return (123 ^ 127) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlIllIIlI[0];
                                }, lIlIllIIlI[4]);
                                "".length();
                            }
                            if (lIIlIIlIlIlIl(Bank.contains(C0005f.aN) ? 1 : 0)) {
                                C0000a.b(C0005f.aN, lIlIllIIlI[1]);
                            }
                            int[] iArr11 = new int[lIlIllIIlI[1]];
                            iArr11[lIlIllIIlI[0]] = lIlIllIIlI[24];
                            if (lIIlIIlIlIlIl(Bank.contains(iArr11) ? 1 : 0)) {
                                C0000a.a(lIlIllIIlI[24], lIlIllIIlI[1]);
                            }
                        }
                        O();
                        System.out.println(lIlIllIIII[lIlIllIIlI[16]]);
                        bn = lIlIllIIlI[1];
                        return;
                    }
                }
            }
            if (lIIlIIlIlIlIl(al() ? 1 : 0)) {
                if (lIIlIIlIlIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIlIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[25]];
                    System.out.println(lIlIllIIII[lIlIllIIlI[26]]);
                    Inventory.getAll(kK).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (lIIlIIlIlIlll(Inventory.isFull() ? 1 : 0)) {
                    if (lIIlIIlIlIllI(Skills.getLevel(Skill.FISHING), lIlIllIIlI[27])) {
                        if (lIIlIIlIlIllI(Skills.getLevel(Skill.FISHING), lIlIllIIlI[7])) {
                            if (lIIlIIlIlIlll(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIlIllIll(Players.getLocal().getWorldLocation().distanceTo(kI), lIlIllIIlI[7])) {
                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[28]];
                                if (lIIlIIlIlIlIl(Inventory.contains(C0005f.aN) ? 1 : 0)) {
                                    Inventory.getFirst(C0005f.aN).interact(lIlIllIIII[lIlIllIIlI[29]]);
                                }
                                Movement.walkTo(kI);
                                "".length();
                                Time.sleepTicks(lIlIllIIlI[1]);
                                "".length();
                            }
                            if (lIIlIIlIlIlIl(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[27]];
                                if (lIIlIIlIlllII(Players.getLocal().getAnimation(), lIlIllIIlI[30])) {
                                    int[] iArr12 = new int[lIlIllIIlI[1]];
                                    iArr12[lIlIllIIlI[0]] = lIlIllIIlI[31];
                                    NPC nearest2 = NPCs.getNearest(iArr12);
                                    if (lIIlIIlIllIII(nearest2) && lIIlIIlIlIlIl(kH.contains(nearest2) ? 1 : 0)) {
                                        int[] iArr13 = new int[lIlIllIIlI[1]];
                                        iArr13[lIlIllIIlI[0]] = lIlIllIIlI[31];
                                        NPCs.getNearest(iArr13).interact(lIlIllIIlI[0]);
                                        Time.sleepTicks(lIlIllIIlI[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        if (lIIlIIlIllIlI(Skills.getLevel(Skill.FISHING), lIlIllIIlI[7]) && lIIlIIlIlIllI(Skills.getLevel(Skill.FISHING), lIlIllIIlI[27])) {
                            if (lIIlIIlIlIlll(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[32]];
                                Movement.walkTo(kI);
                                "".length();
                                Time.sleepTicks(lIlIllIIlI[1]);
                                "".length();
                            }
                            if (lIIlIIlIlIlIl(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[33]];
                                if (lIIlIIlIlllII(Players.getLocal().getAnimation(), lIlIllIIlI[30])) {
                                    int[] iArr14 = new int[lIlIllIIlI[1]];
                                    iArr14[lIlIllIIlI[0]] = lIlIllIIlI[31];
                                    NPC nearest3 = NPCs.getNearest(iArr14);
                                    if (lIIlIIlIllIII(nearest3) && lIIlIIlIlIlIl(kH.contains(nearest3) ? 1 : 0)) {
                                        int[] iArr15 = new int[lIlIllIIlI[1]];
                                        iArr15[lIlIllIIlI[0]] = lIlIllIIlI[31];
                                        NPCs.getNearest(iArr15).interact(lIlIllIIII[lIlIllIIlI[34]]);
                                        Time.sleepTicks(lIlIllIIlI[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIIlIIlIllIlI(Skills.getLevel(Skill.FISHING), lIlIllIIlI[27])) {
                        if (lIIlIIlIllIll(Players.getLocal().getWorldLocation().distanceTo(kJ), lIlIllIIlI[22])) {
                            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[35]];
                            Movement.walkTo(kJ);
                            "".length();
                            Time.sleepTicks(lIlIllIIlI[1]);
                            "".length();
                        }
                        if (lIIlIIlIlllIl(Players.getLocal().getWorldLocation().distanceTo(kJ), lIlIllIIlI[22])) {
                            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[36]];
                            if (lIIlIIlIlllII(Players.getLocal().getAnimation(), lIlIllIIlI[30]) && lIIlIIlIllIII(NPCs.getNearest(npc -> {
                                if (lIIlIIlIlllII(npc.getId(), lIlIllIIlI[77]) && lIIlIIlIlllIl(npc.getWorldLocation().distanceTo(kJ), lIlIllIIlI[22])) {
                                    ?? r0 = lIlIllIIlI[1];
                                    "".length();
                                    return ((247 ^ 151) ^ (96 ^ 4)) <= 0 ? ((178 ^ 143) ^ (55 ^ 21)) & (((61 ^ 99) ^ (119 ^ 54)) ^ (-" ".length())) : r0;
                                }
                                return lIlIllIIlI[0];
                            }))) {
                                NPCs.getNearest(npc2 -> {
                                    if (lIIlIIlIlllII(npc2.getId(), lIlIllIIlI[77]) && lIIlIIlIlllIl(npc2.getWorldLocation().distanceTo(kJ), lIlIllIIlI[22])) {
                                        ?? r0 = lIlIllIIlI[1];
                                        "".length();
                                        return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIlIllIIlI[0];
                                }).interact(lIlIllIIII[lIlIllIIlI[37]]);
                                Time.sleepTicks(lIlIllIIlI[2]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIlIIlIlllIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean dH() {
        String[] strArr = new String[lIlIllIIlI[1]];
        strArr[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[57]];
        if (!lIIlIIlIlIlIl(Inventory.contains(strArr) ? 1 : 0) || (lIIlIIlIlIlll(Inventory.contains(C0005f.aN) ? 1 : 0) && !lIIlIIlIlIlIl(Equipment.contains(C0005f.aN) ? 1 : 0))) {
            return lIlIllIIlI[0];
        }
        ?? r0 = lIlIllIIlI[1];
        "".length();
        return (((76 ^ 45) ^ (216 ^ 159)) & (((((135 + 18) - 42) + 28) ^ (((35 + 25) - (-34)) + 79)) ^ (-" ".length()))) >= "   ".length() ? ((((175 + 187) - 317) + 203) ^ (((162 + 69) - 127) + 88)) & (((63 ^ 113) ^ (66 ^ 52)) ^ (-" ".length())) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean al() {
        String[] strArr = new String[lIlIllIIlI[1]];
        strArr[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[58]];
        if (lIIlIIlIlIlIl(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIlIllIIlI[1]];
            strArr2[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[59]];
            if (lIIlIIlIlIlIl(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lIlIllIIlI[1]];
                strArr3[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[60]];
                if (lIIlIIlIlIlIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlIllIIlI[1]];
                    strArr4[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[61]];
                    if (lIIlIIlIlIlIl(Inventory.contains(strArr4) ? 1 : 0)) {
                        String[] strArr5 = new String[lIlIllIIlI[1]];
                        strArr5[lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[62]];
                        if (lIIlIIlIlIlIl(Inventory.contains(strArr5) ? 1 : 0) && (!lIIlIIlIlIlll(Inventory.contains(C0005f.aN) ? 1 : 0) || lIIlIIlIlIlIl(Equipment.contains(C0005f.aN) ? 1 : 0))) {
                            ?? r0 = lIlIllIIlI[1];
                            "".length();
                            return ((200 ^ 130) ^ (105 ^ 39)) < 0 ? ((((159 + 106) - 130) + 29) ^ (((33 + 4) - 30) + 126)) & (((((74 + 49) - 10) + 60) ^ (((78 + 40) - 18) + 40)) ^ (-" ".length())) : r0;
                        }
                    }
                }
            }
        }
        return lIlIllIIlI[0];
    }

    private static boolean lIIlIIlIlIllI(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIIlIlIlII();
        lIIlIIlIlIIll();
        kH = new WorldArea(lIlIllIIlI[83], lIlIllIIlI[84], lIlIllIIlI[29], lIlIllIIlI[39], lIlIllIIlI[0]);
        bp = new ArrayList();
        kI = new WorldPoint(lIlIllIIlI[85], lIlIllIIlI[86], lIlIllIIlI[0]);
        kJ = new WorldPoint(lIlIllIIlI[87], lIlIllIIlI[88], lIlIllIIlI[0]);
        int[] iArr = new int[lIlIllIIlI[17]];
        iArr[lIlIllIIlI[0]] = lIlIllIIlI[89];
        iArr[lIlIllIIlI[1]] = lIlIllIIlI[90];
        iArr[lIlIllIIlI[2]] = lIlIllIIlI[91];
        iArr[lIlIllIIlI[3]] = lIlIllIIlI[92];
        iArr[lIlIllIIlI[5]] = lIlIllIIlI[93];
        iArr[lIlIllIIlI[7]] = lIlIllIIlI[94];
        iArr[lIlIllIIlI[9]] = lIlIllIIlI[95];
        iArr[lIlIllIIlI[11]] = lIlIllIIlI[96];
        iArr[lIlIllIIlI[13]] = lIlIllIIlI[97];
        iArr[lIlIllIIlI[15]] = lIlIllIIlI[98];
        iArr[lIlIllIIlI[16]] = lIlIllIIlI[99];
        kK = iArr;
    }

    private static String lIIlIIlIlIIlI(String lllllllllllllllllllIlIIlIlIlIlll, String lllllllllllllllllllIlIIlIlIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIlIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlIIlIlIllIII) {
            lllllllllllllllllllIlIIlIlIllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIllIIlI[0];
    }

    private static boolean lIIlIIlIllIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIIlIlIlll(int i) {
        return i == 0;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIllIIII[lIlIllIIlI[73]];
    }

    private static boolean lIIlIIlIllIIl(int i) {
        return i > 0;
    }

    private static boolean lIIlIIlIllIll(int i, int i2) {
        return i > i2;
    }

    private static String lIIlIIlIIllIl(String lllllllllllllllllllIlIIlIIllIIlI, String lllllllllllllllllllIlIIlIIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIlIIllIIIl.getBytes(StandardCharsets.UTF_8)), lIlIllIIlI[13]), "DES");
            Cipher lllllllllllllllllllIlIIlIIllIlII = Cipher.getInstance("DES");
            lllllllllllllllllllIlIIlIIllIlII.init(lIlIllIIlI[2], secretKeySpec);
            return new String(lllllllllllllllllllIlIIlIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIlIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlIIlIIllIIll) {
            lllllllllllllllllllIlIIlIIllIIll.printStackTrace();
            return null;
        }
    }
}
