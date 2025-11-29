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
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.I  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/I.class */
public class I implements K {
    static /* synthetic */ int dc;
    private static final /* synthetic */ WorldPoint jg;
    private static final /* synthetic */ WorldPoint ji;
    static /* synthetic */ boolean dd;
    private static /* synthetic */ String[] lIllIIlllI;
    public static final /* synthetic */ String[] jf;
    private static /* synthetic */ int[] lIllIlIIIl;
    static /* synthetic */ int cA;
    private static final /* synthetic */ WorldPoint jj;
    public static /* synthetic */ boolean bn;
    private static final /* synthetic */ WorldPoint jh;
    public static /* synthetic */ List<C0003d> bp;

    private static void lIIllIIIlIlIl() {
        lIllIlIIIl = new int[75];
        lIllIlIIIl[0] = (233 ^ 189) & ((196 ^ 144) ^ (-1));
        lIllIlIIIl[1] = " ".length();
        lIllIlIIIl[2] = (((34 + 156) - 40) + 104) ^ (((10 + 127) - 113) + 160);
        lIllIlIIIl[3] = "  ".length();
        lIllIlIIIl[4] = (-9729) & 10107;
        lIllIlIIIl[5] = "   ".length();
        lIllIlIIIl[6] = (((96 + 145) - 237) + 241) ^ (((91 + 36) - 55) + 86);
        lIllIlIIIl[7] = 4 ^ 0;
        lIllIlIIIl[8] = (((79 + 167) - 209) + 151) ^ (((157 + 183) - 156) + 1);
        lIllIlIIIl[9] = (-((-25393) & 28535)) & (-16417) & 24558;
        lIllIlIIIl[10] = (-16662) & 28639;
        lIllIlIIIl[11] = (-(((124 + 91) - 169) + 83)) & (-16405) & 24540;
        lIllIlIIIl[12] = (-(125 ^ 90)) & (-3721) & 16383;
        lIllIlIIIl[13] = (-8233) & 16239;
        lIllIlIIIl[14] = (((121 + 93) - 114) + 40) ^ (((50 + 12) - 61) + 137);
        lIllIlIIIl[15] = (34 ^ 72) ^ (222 ^ 190);
        lIllIlIIIl[16] = (-4184) & 7423;
        lIllIlIIIl[17] = (-4131) & 7334;
        lIllIlIIIl[18] = 55 ^ 63;
        lIllIlIIIl[19] = (0 ^ 39) ^ (188 ^ 144);
        lIllIlIIIl[20] = 35 ^ 36;
        lIllIlIIIl[21] = (45 ^ 75) ^ (72 ^ 39);
        lIllIlIIIl[22] = 38 ^ 42;
        lIllIlIIIl[23] = 35 ^ 46;
        lIllIlIIIl[24] = 207 ^ 193;
        lIllIlIIIl[25] = 103 ^ 104;
        lIllIlIIIl[26] = (((3 + 36) - 21) + 115) ^ (((133 + 121) - 140) + 35);
        lIllIlIIIl[27] = (-((-4129) & 31204)) & (-21) & 27647;
        lIllIlIIIl[28] = (32 ^ 96) ^ (208 ^ 129);
        lIllIlIIIl[29] = 52 ^ 38;
        lIllIlIIIl[30] = 134 ^ 149;
        lIllIlIIIl[31] = 112 ^ 100;
        lIllIlIIIl[32] = (((138 + 3) - (-29)) + 1) ^ (((61 + 174) - 159) + 114);
        lIllIlIIIl[33] = 90 ^ 76;
        lIllIlIIIl[34] = " ".length() ^ (7 ^ 17);
        lIllIlIIIl[35] = (251 ^ 190) ^ (251 ^ 166);
        lIllIlIIIl[36] = (21 ^ 30) ^ (19 ^ 1);
        lIllIlIIIl[37] = 68 ^ 94;
        lIllIlIIIl[38] = 133 ^ 158;
        lIllIlIIIl[39] = 217 ^ 197;
        lIllIlIIIl[40] = 7 ^ 26;
        lIllIlIIIl[41] = (((179 + 154) - 331) + 189) ^ (((14 + 8) - (-110)) + 29);
        lIllIlIIIl[42] = (((47 + 126) - 149) + 165) ^ (((74 + 132) - 139) + 95);
        lIllIlIIIl[43] = 0 ^ 32;
        lIllIlIIIl[44] = (38 ^ 13) ^ (79 ^ 69);
        lIllIlIIIl[45] = 92 ^ 126;
        lIllIlIIIl[46] = (-16482) & 32381;
        lIllIlIIIl[47] = (-((-481) & 10722)) & (-16401) & 32541;
        lIllIlIIIl[48] = (-((-84) & 20599)) & (-17) & 32511;
        lIllIlIIIl[49] = (-515) & 25514;
        lIllIlIIIl[50] = (-((-1293) & 11679)) & (-4098) & 16383;
        lIllIlIIIl[51] = 84 ^ 48;
        lIllIlIIIl[52] = 171 ^ 136;
        lIllIlIIIl[53] = 145 ^ 181;
        lIllIlIIIl[54] = 126 ^ 91;
        lIllIlIIIl[55] = (67 ^ 1) ^ (59 ^ 95);
        lIllIlIIIl[56] = (145 ^ 132) ^ (171 ^ 153);
        lIllIlIIIl[57] = (((82 + 9) - 32) + 104) ^ (((18 + 114) - 39) + 46);
        lIllIlIIIl[58] = 128 ^ 169;
        lIllIlIIIl[59] = (((145 + 144) - 253) + 131) ^ (((12 + 52) - (-48)) + 29);
        lIllIlIIIl[60] = 123 ^ 80;
        lIllIlIIIl[61] = 170 ^ 134;
        lIllIlIIIl[62] = (((140 + 178) - 142) + 11) ^ (((77 + 49) - (-24)) + 0);
        lIllIlIIIl[63] = 147 ^ 189;
        lIllIlIIIl[64] = (((81 + 74) - 147) + 173) ^ (((143 + 60) - 167) + 118);
        lIllIlIIIl[65] = (219 ^ 144) ^ (120 ^ 3);
        lIllIlIIIl[66] = 4 ^ 53;
        lIllIlIIIl[67] = (-((-6218) & 15195)) & (-20577) & 32763;
        lIllIlIIIl[68] = (-8849) & 11994;
        lIllIlIIIl[69] = (-((-3139) & 32582)) & (-145) & 32763;
        lIllIlIIIl[70] = (-((-3281) & 20191)) & (-8193) & 28351;
        lIllIlIIIl[71] = (-518) & 3711;
        lIllIlIIIl[72] = (-((-2242) & 7123)) & (-24641) & 32639;
        lIllIlIIIl[73] = (-((-3406) & 24559)) & (-2049) & 32767;
        lIllIlIIIl[74] = (115 ^ 72) ^ (137 ^ 128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean al() {
        int[] iArr = new int[lIllIlIIIl[1]];
        iArr[lIllIlIIIl[0]] = lIllIlIIIl[11];
        if (lIIllIIIlIlll(Inventory.contains(iArr) ? 1 : 0) && ((!lIIllIIIllIIl(Inventory.contains(C0005f.aQ) ? 1 : 0) || lIIllIIIlIlll(Equipment.contains(C0005f.aQ) ? 1 : 0)) && lIIllIIIlIlll(Inventory.contains(C0005f.aU) ? 1 : 0))) {
            int[] iArr2 = new int[lIllIlIIIl[1]];
            iArr2[lIllIlIIIl[0]] = lIllIlIIIl[13];
            if (lIIllIIIlIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIllIlIIIl[1]];
                iArr3[lIllIlIIIl[0]] = lIllIlIIIl[4];
                if (lIIllIIIlIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lIllIlIIIl[1];
                    "".length();
                    return (173 ^ 169) < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIllIlIIIl[0];
    }

    private static boolean lIIllIIIllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIIIlllII(Object obj) {
        return obj != null;
    }

    private static String lIIllIIIIlllI(String lllllllllllllllllllIIIlIllllIIII, String lllllllllllllllllllIIIlIlllIllll) {
        try {
            SecretKeySpec lllllllllllllllllllIIIlIllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIlIlllIllll.getBytes(StandardCharsets.UTF_8)), lIllIlIIIl[18]), "DES");
            Cipher lllllllllllllllllllIIIlIllllIIlI = Cipher.getInstance("DES");
            lllllllllllllllllllIIIlIllllIIlI.init(lIllIlIIIl[3], lllllllllllllllllllIIIlIllllIIll);
            return new String(lllllllllllllllllllIIIlIllllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIlIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIlIllllIIIl) {
            lllllllllllllllllllIIIlIllllIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIllIlIIIl[0];
    }

    private static void O() {
        int[] iArr = new int[lIllIlIIIl[1]];
        iArr[lIllIlIIIl[0]] = lIllIlIIIl[10];
        if (lIIllIIIllIIl(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIllIlIIIl[10], lIllIlIIIl[1], lIllIlIIIl[46]));
            "".length();
        }
        int[] iArr2 = new int[lIllIlIIIl[1]];
        iArr2[lIllIlIIIl[0]] = lIllIlIIIl[4];
        if (lIIllIIIllIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIllIlIIIl[4], lIllIlIIIl[15], lIllIlIIIl[47]));
            "".length();
        }
        if (lIIllIIIllIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIllIIlllI[lIllIlIIIl[53]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIllIlIIIl[48], lIllIlIIIl[8], lIllIlIIIl[49]));
            "".length();
        }
        int[] iArr3 = new int[lIllIlIIIl[1]];
        iArr3[lIllIlIIIl[0]] = lIllIlIIIl[11];
        if (lIIllIIIllIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIllIlIIIl[11], lIllIlIIIl[15], lIllIlIIIl[50]));
            "".length();
        }
        int[] iArr4 = new int[lIllIlIIIl[1]];
        iArr4[lIllIlIIIl[0]] = lIllIlIIIl[13];
        if (lIIllIIIllIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIllIlIIIl[13], lIllIlIIIl[31], lIllIlIIIl[50]));
            "".length();
        }
        int[] iArr5 = new int[lIllIlIIIl[1]];
        iArr5[lIllIlIIIl[0]] = lIllIlIIIl[12];
        if (lIIllIIIllIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIllIlIIIl[12], lIllIlIIIl[8], C0009j.bZ));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [boolean] */
    public static void cJ() {
        if (lIIllIIIlIlll(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[0]];
            C0001b.a(bp);
            if (lIIllIIIllIII(bp.size(), lIllIlIIIl[1])) {
                System.out.println(lIllIIlllI[lIllIlIIIl[1]]);
                bn = lIllIlIIIl[0];
            }
        }
        if (lIIllIIIllIIl(bn ? 1 : 0)) {
            if (lIIllIIIlIlll(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIllIIIllIII(Movement.getRunEnergy(), lIllIlIIIl[2])) {
                Inventory.getFirst(C0005f.aU).interact(lIllIIlllI[lIllIlIIIl[3]]);
                Time.sleepTicks(lIllIlIIIl[1]);
                "".length();
            }
            if (lIIllIIIllIlI(lIIllIIIlIllI(C0004e.u(), 70.0d))) {
                int[] iArr = new int[lIllIlIIIl[1]];
                iArr[lIllIlIIIl[0]] = lIllIlIIIl[4];
                if (lIIllIIIlIlll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIllIlIIIl[1]];
                    iArr2[lIllIlIIIl[0]] = lIllIlIIIl[4];
                    Inventory.getFirst(iArr2).interact(lIllIIlllI[lIllIlIIIl[5]]);
                }
            }
            if (lIIllIIIllIIl(Movement.isRunEnabled() ? 1 : 0) && lIIllIIIllIll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIIllIIIllIIl(al() ? 1 : 0) && lIIllIIIllIII(C0004e.j(lIllIlIIIl[6]), lIllIlIIIl[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIllIIIlllII(nearest) && lIIllIIIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[7]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIllIlIIIl[3]);
                    "".length();
                }
                if (lIIllIIIlllII(nearest) && lIIllIIIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[8]];
                    if (lIIllIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIlIIIl[9]);
                        "".length();
                    }
                    if (lIIllIIIlIlll(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllIIIllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllIlIIIl[7]);
                            "".length();
                        }
                        if (lIIllIIIllIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllIlIIIl[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lIllIlIIIl[8]];
                        iArr3[lIllIlIIIl[0]] = lIllIlIIIl[10];
                        iArr3[lIllIlIIIl[1]] = lIllIlIIIl[11];
                        iArr3[lIllIlIIIl[3]] = lIllIlIIIl[12];
                        iArr3[lIllIlIIIl[5]] = lIllIlIIIl[13];
                        iArr3[lIllIlIIIl[7]] = lIllIlIIIl[4];
                        if (lIIllIIIllIIl(C0004e.b(iArr3) ? 1 : 0)) {
                            O();
                            System.out.println(lIllIIlllI[lIllIlIIIl[14]]);
                            bn = lIllIlIIIl[1];
                            return;
                        }
                        Bank.withdraw(lIllIlIIIl[11], lIllIlIIIl[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIlIIIl[1]);
                        "".length();
                        Bank.withdraw(lIllIlIIIl[13], lIllIlIIIl[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIlIIIl[1]);
                        "".length();
                        Bank.withdraw(lIllIlIIIl[10], lIllIlIIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIlIIIl[1]);
                        "".length();
                        C0000a.b(C0005f.aU, lIllIlIIIl[1]);
                        C0000a.a(lIllIlIIIl[4], lIllIlIIIl[15]);
                        C0000a.b(C0005f.be, lIllIlIIIl[1]);
                    }
                }
            }
            if (lIIllIIIlIlll(al() ? 1 : 0) && lIIllIIIllIII(C0004e.j(lIllIlIIIl[6]), lIllIlIIIl[1])) {
                new WorldArea(lIllIlIIIl[16], lIllIlIIIl[17], lIllIlIIIl[18], lIllIlIIIl[19], lIllIlIIIl[0]);
                String[] strArr = new String[lIllIlIIIl[1]];
                strArr[lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[20]];
                NPC nearest2 = NPCs.getNearest(strArr);
                if (lIIllIIIlllIl(nearest2) && lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(jg), lIllIlIIIl[5]) && lIIllIIIllIIl(AccBuilderShamans.d ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[18]];
                    if (lIIllIIIllIII(cA, lIllIlIIIl[1])) {
                        C0004e.v();
                        cA += lIllIlIIIl[1];
                    }
                    Movement.walkTo(jg);
                    "".length();
                    Time.sleepTicks(lIllIlIIIl[1]);
                    "".length();
                }
                if (lIIllIIIlllII(nearest2)) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[21]];
                    C0006g.a(lIllIIlllI[lIllIlIIIl[15]], jf, lIllIlIIIl[1]);
                }
            }
            if (lIIllIIIlllll(C0004e.j(lIllIlIIIl[6]), lIllIlIIIl[1])) {
                if (lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(jh), lIllIlIIIl[14])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[19]];
                    Movement.walkTo(jh);
                    "".length();
                    Time.sleepTicks(lIllIlIIIl[1]);
                    "".length();
                }
                if (lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(jh), lIllIlIIIl[14])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[22]];
                    String[] strArr2 = new String[lIllIlIIIl[1]];
                    strArr2[lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[23]];
                    TileObject nearest3 = TileObjects.getNearest(strArr2);
                    if (lIIllIIIlllII(nearest3)) {
                        String[] strArr3 = new String[lIllIlIIIl[1]];
                        strArr3[lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[24]];
                        if (lIIllIIIlIlll(nearest3.hasAction(strArr3) ? 1 : 0)) {
                            nearest3.interact(lIllIIlllI[lIllIlIIIl[25]]);
                            Time.sleepTicks(lIllIlIIIl[8]);
                            "".length();
                        }
                    }
                    C0006g.a(lIllIIlllI[lIllIlIIIl[26]], jf);
                }
            }
            if (lIIllIIIlllll(C0004e.j(lIllIlIIIl[6]), lIllIlIIIl[3])) {
                if (lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    int[] iArr4 = new int[lIllIlIIIl[1]];
                    iArr4[lIllIlIIIl[0]] = lIllIlIIIl[27];
                    if (lIIllIIIlIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIllIlIIIl[1]];
                        iArr5[lIllIlIIIl[0]] = lIllIlIIIl[27];
                        Inventory.getFirst(iArr5).interact(lIllIIlllI[lIllIlIIIl[28]]);
                        Time.sleepTicks(lIllIlIIIl[1]);
                        "".length();
                    }
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[29]];
                    Movement.walkTo(ji);
                    "".length();
                    Time.sleepTicks(lIllIlIIIl[1]);
                    "".length();
                }
                if (lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[30]];
                    String[] strArr4 = new String[lIllIlIIIl[1]];
                    strArr4[lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[31]];
                    NPC nearest4 = NPCs.getNearest(strArr4);
                    if (lIIllIIIlllII(nearest4)) {
                        C0006g.a(lIllIIlllI[lIllIlIIIl[32]], jf);
                    }
                    if (lIIllIIIlllIl(nearest4)) {
                        String[] strArr5 = new String[lIllIlIIIl[1]];
                        strArr5[lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[33]];
                        TileObjects.getNearest(strArr5).interact(lIllIIlllI[lIllIlIIIl[34]]);
                        Time.sleepTicks(lIllIlIIIl[3]);
                        "".length();
                    }
                }
            }
            if (lIIllIIIlllll(C0004e.j(lIllIlIIIl[6]), lIllIlIIIl[5])) {
                dc = lIllIlIIIl[0];
                if (lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(jj), lIllIlIIIl[5])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[35]];
                    Movement.walkTo(jj);
                    "".length();
                    Time.sleepTicks(lIllIlIIIl[1]);
                    "".length();
                }
                if (lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(jj), lIllIlIIIl[5])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[36]];
                    String[] strArr6 = new String[lIllIlIIIl[1]];
                    strArr6[lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[37]];
                    TileObject nearest5 = TileObjects.getNearest(strArr6);
                    if (lIIllIIIlllII(nearest5)) {
                        nearest5.interact(lIllIIlllI[lIllIlIIIl[38]]);
                    }
                }
            }
            if (lIIllIIIlllll(C0004e.j(lIllIlIIIl[6]), lIllIlIIIl[7])) {
                if (lIIllIIIllllI(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    int[] iArr6 = new int[lIllIlIIIl[1]];
                    iArr6[lIllIlIIIl[0]] = lIllIlIIIl[27];
                    if (lIIllIIIlIlll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIllIlIIIl[1]];
                        iArr7[lIllIlIIIl[0]] = lIllIlIIIl[27];
                        Inventory.getFirst(iArr7).interact(lIllIIlllI[lIllIlIIIl[39]]);
                        Time.sleepTicks(lIllIlIIIl[1]);
                        "".length();
                    }
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[40]];
                    Movement.walkTo(ji);
                    "".length();
                    Time.sleepTicks(lIllIlIIIl[1]);
                    "".length();
                }
                if (lIIllIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(ji), lIllIlIIIl[3])) {
                    AccBuilderShamans.c = lIllIIlllI[lIllIlIIIl[41]];
                    String[] strArr7 = new String[lIllIlIIIl[1]];
                    strArr7[lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[42]];
                    TileObject nearest6 = TileObjects.getNearest(strArr7);
                    if (lIIllIIIlllII(nearest6)) {
                        String[] strArr8 = new String[lIllIlIIIl[1]];
                        strArr8[lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[43]];
                        if (lIIllIIIlIlll(nearest6.hasAction(strArr8) ? 1 : 0)) {
                            nearest6.interact(lIllIIlllI[lIllIlIIIl[44]]);
                            Time.sleepTicks(lIllIlIIIl[3]);
                            "".length();
                        }
                        String[] strArr9 = new String[lIllIlIIIl[1]];
                        strArr9[lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[45]];
                        Item first = Inventory.getFirst(strArr9);
                        if (lIIllIIIlllII(first)) {
                            if (lIIllIIIllIII(dc, lIllIlIIIl[1])) {
                                Z.ob += lIllIlIIIl[1];
                                Z.p(AccBuilderShamans.m);
                                dc += lIllIlIIIl[1];
                                Z.ob = lIllIlIIIl[0];
                                dd = lIllIlIIIl[0];
                            }
                            first.useOn(nearest6);
                            Time.sleepTicks(lIllIlIIIl[5]);
                            "".length();
                        }
                    }
                }
                C0006g.a(jf);
            }
            C0006g.a(new String[lIllIlIIIl[0]]);
        }
    }

    private static boolean lIIllIIIllIll(int i) {
        return i > 0;
    }

    private static int lIIllIIIlIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIllIIIllIlI(int i) {
        return i < 0;
    }

    static {
        lIIllIIIlIlIl();
        lIIllIIIlIlII();
        String[] strArr = new String[lIllIlIIIl[23]];
        strArr[lIllIlIIIl[0]] = lIllIIlllI[lIllIlIIIl[54]];
        strArr[lIllIlIIIl[1]] = lIllIIlllI[lIllIlIIIl[55]];
        strArr[lIllIlIIIl[3]] = lIllIIlllI[lIllIlIIIl[56]];
        strArr[lIllIlIIIl[5]] = lIllIIlllI[lIllIlIIIl[57]];
        strArr[lIllIlIIIl[7]] = lIllIIlllI[lIllIlIIIl[58]];
        strArr[lIllIlIIIl[8]] = lIllIIlllI[lIllIlIIIl[59]];
        strArr[lIllIlIIIl[14]] = lIllIIlllI[lIllIlIIIl[60]];
        strArr[lIllIlIIIl[20]] = lIllIIlllI[lIllIlIIIl[61]];
        strArr[lIllIlIIIl[18]] = lIllIIlllI[lIllIlIIIl[62]];
        strArr[lIllIlIIIl[21]] = lIllIIlllI[lIllIlIIIl[63]];
        strArr[lIllIlIIIl[15]] = lIllIIlllI[lIllIlIIIl[64]];
        strArr[lIllIlIIIl[19]] = lIllIIlllI[lIllIlIIIl[65]];
        strArr[lIllIlIIIl[22]] = lIllIIlllI[lIllIlIIIl[66]];
        jf = strArr;
        jg = new WorldPoint(lIllIlIIIl[16], lIllIlIIIl[67], lIllIlIIIl[0]);
        jh = new WorldPoint(lIllIlIIIl[68], lIllIlIIIl[69], lIllIlIIIl[0]);
        ji = new WorldPoint(lIllIlIIIl[70], lIllIlIIIl[71], lIllIlIIIl[0]);
        jj = new WorldPoint(lIllIlIIIl[72], lIllIlIIIl[73], lIllIlIIIl[0]);
        bp = new ArrayList();
        cA = lIllIlIIIl[0];
    }

    private static boolean lIIllIIIlllll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIllIIlIIIIl(C0004e.j(lIllIlIIIl[6]), lIllIlIIIl[8])) {
            ?? r0 = lIllIlIIIl[1];
            "".length();
            return 0 != 0 ? ((135 ^ 157) ^ (65 ^ 113)) & (((72 ^ 38) ^ (106 ^ 46)) ^ (-" ".length())) : r0;
        }
        return lIllIlIIIl[0];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            cJ();
            "".length();
            if (" ".length() != " ".length()) {
                return (25 ^ 4) & ((166 ^ 187) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllIlIIIl[51];
    }

    private static String lIIllIIIIllll(String lllllllllllllllllllIIIlIlllIIIII, String lllllllllllllllllllIIIlIllIlllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIIlIllIlllll.toCharArray();
        int lllllllllllllllllllIIIlIllIlllII = lIllIlIIIl[0];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllllllIIIlIllIlIlIl = charArray2.length;
        int i = lIllIlIIIl[0];
        while (lIIllIIIllIII(i, lllllllllllllllllllIIIlIllIlIlIl)) {
            char lllllllllllllllllllIIIlIlllIIIIl = charArray2[i];
            sb.append((char) (lllllllllllllllllllIIIlIlllIIIIl ^ charArray[lllllllllllllllllllIIIlIllIlllII % charArray.length]));
            "".length();
            lllllllllllllllllllIIIlIllIlllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIllIIIllIIl(int i) {
        return i == 0;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIllIIlllI[lIllIlIIIl[52]];
    }

    private static boolean lIIllIIIllllI(int i, int i2) {
        return i > i2;
    }

    private static void lIIllIIIlIlII() {
        lIllIIlllI = new String[lIllIlIIIl[74]];
        lIllIIlllI[lIllIlIIIl[0]] = lIIllIIIIllIl("Z4LAiTtHkWv8hIiRlmRphQ==", "DRNYD");
        lIllIIlllI[lIllIlIIIl[1]] = lIIllIIIIlllI("XqRBujJ27T4SH7rUI6xoFDehuNSGhmViHzdIw9/gi1HbXw+f6uviX+ElmgBq0TpH", "VjIFP");
        lIllIIlllI[lIllIlIIIl[3]] = lIIllIIIIllll("PjYMOTM=", "zDeWX");
        lIllIIlllI[lIllIlIIIl[5]] = lIIllIIIIllIl("4F5WwJy1l80=", "vqMCX");
        lIllIIlllI[lIllIlIIIl[7]] = lIIllIIIIlllI("5kUHs37KSFp2qNMzoyubPw==", "MkRha");
        lIllIIlllI[lIllIlIIIl[8]] = lIIllIIIIllIl("0PGccxpzq+OdbPjfCHlg9uv1MlQx2hti", "suiEe");
        lIllIIlllI[lIllIlIIIl[14]] = lIIllIIIIllll("NQxzGT8HST4RPhEAPR9tExw2CzlCGiYIPQ4ANgthQhokETkBAToWKkIdPFgPNzAaNgo=", "biSxM");
        lIllIIlllI[lIllIlIIIl[20]] = lIIllIIIIllll("KgktDiceSBgDMAkLMg==", "lhYfB");
        lIllIIlllI[lIllIlIIIl[18]] = lIIllIIIIllll("CTkdUAEoeBgEFDUs", "GXkpu");
        lIllIIlllI[lIllIlIIIl[21]] = lIIllIIIIllll("MhcFBxsIDQNVHhQGFwE=", "acduo");
        lIllIIlllI[lIllIlIIIl[15]] = lIIllIIIIllIl("f28KWvboYhzoqkxBQuplMQ==", "kTKEf");
        lIllIIlllI[lIllIlIIIl[19]] = lIIllIIIIllIl("VQzNRq75/Wo6omleWt4OY8aFWAfS/lpI", "YduGi");
        lIllIIlllI[lIllIlIIIl[22]] = lIIllIIIIlllI("Kuu20GpmbSYd2X2V4zuZMA==", "URIDV");
        lIllIIlllI[lIllIlIIIl[23]] = lIIllIIIIllll("AgcGOw==", "FhiIK");
        lIllIIlllI[lIllIlIIIl[24]] = lIIllIIIIlllI("/TN41nCxZZI=", "kMUxE");
        lIllIIlllI[lIllIlIIIl[25]] = lIIllIIIIllIl("RGuqBruvr3I=", "MXpRg");
        lIllIIlllI[lIllIlIIIl[26]] = lIIllIIIIllll("FgkTAQ8iSDIbAj4NHg==", "Phgij");
        lIllIIlllI[lIllIlIIIl[28]] = lIIllIIIIllll("BSMoNg==", "RFIDk");
        lIllIIlllI[lIllIlIIIl[29]] = lIIllIIIIlllI("1HF+fS2sKE0jr6IGl7t9yw==", "iFwOt");
        lIllIIlllI[lIllIlIIIl[30]] = lIIllIIIIllIl("E01x9kS0AVAPi8OigJTyxw==", "pjmXP");
        lIllIIlllI[lIllIlIIIl[31]] = lIIllIIIIlllI("tws7Fr/vJyPqzZcJZmJDcA==", "PDPBL");
        lIllIIlllI[lIllIlIIIl[32]] = lIIllIIIIllll("JDM+EQgTJT5FAx45PhE=", "vVMed");
        lIllIIlllI[lIllIlIIIl[33]] = lIIllIIIIlllI("WFRWn3TEJt8=", "gjndY");
        lIllIIlllI[lIllIlIIIl[34]] = lIIllIIIIllIl("U4dcGDEm/u4=", "HJSOx");
        lIllIIlllI[lIllIlIIIl[35]] = lIIllIIIIllll("JTsPQzAEegoIMQc2", "kZycD");
        lIllIIlllI[lIllIlIIIl[36]] = lIIllIIIIllll("BTYYNj4sNEwxPDc/AA==", "BSlBW");
        lIllIIlllI[lIllIlIIIl[37]] = lIIllIIIIllll("ORQ3BCY=", "xxCeT");
        lIllIIlllI[lIllIlIIIl[38]] = lIIllIIIIlllI("HmKLQawFWAs=", "GPvdr");
        lIllIIlllI[lIllIlIIIl[39]] = lIIllIIIIllIl("jjaXBzWLra8=", "GwBWd");
        lIllIIlllI[lIllIlIIIl[40]] = lIIllIIIIlllI("hABxCXKUPnzvRzeXhmJx7A==", "nDPec");
        lIllIIlllI[lIllIlIIIl[41]] = lIIllIIIIllll("MikFFy8TJgxTIBUuDRot", "zHksC");
        lIllIIlllI[lIllIlIIIl[42]] = lIIllIIIIlllI("jafkDnbwUt4=", "aRBcz");
        lIllIIlllI[lIllIlIIIl[43]] = lIIllIIIIllll("Cwo/Pg==", "DzZPm");
        lIllIIlllI[lIllIlIIIl[44]] = lIIllIIIIllIl("FpN85pRPD7A=", "UlKDc");
        lIllIIlllI[lIllIlIIIl[45]] = lIIllIIIIllll("DzsdCgBvIFIKHz0/Hg==", "HSryt");
        lIllIIlllI[lIllIlIIIl[52]] = lIIllIIIIllll("CzwiECI8KiJEKTE2IhBuKCw0Fzo=", "YYQdN");
        lIllIIlllI[lIllIlIIIl[53]] = lIIllIIIIllIl("ldnqRH/dfclDvTcELijJR3HWmll/XomK", "VLTuW");
        lIllIIlllI[lIllIlIIIl[54]] = lIIllIIIIlllI("NJMkYcjjohREv2Z1uVbfoiylCLq7zqRrnD2FDA/k244=", "rWUqv");
        lIllIIlllI[lIllIlIIIl[55]] = lIIllIIIIlllI("gtPnWNvVW4xxXfY4JqWO77eMMOMLRl6uXKya52Y9xUbxmelQCeDdng==", "bnwMu");
        lIllIIlllI[lIllIlIIIl[56]] = lIIllIIIIllIl("JVc4hTdwoXdIBzlnEVOjGMDGn+nFVB4t", "GqIcU");
        lIllIIlllI[lIllIlIIIl[57]] = lIIllIIIIllll("IxEZYQ==", "ztjOj");
        lIllIIlllI[lIllIlIIIl[58]] = lIIllIIIIllll("JWopTiMDIi8HIQttIgE9TCxkHzoJPjBP", "lMDnO");
        lIllIIlllI[lIllIlIIIl[59]] = lIIllIIIIllll("KBtWTCECBFoBKEcYHwA9RwQSCSNJ", "gpzlM");
        lIllIIlllI[lIllIlIIIl[60]] = lIIllIIIIllll("HBUDBCMoVDYJND8XHEw1PxoDTCs/VAMDZi4VGwdmLhtXFSkvWg==", "ZtwlF");
        lIllIIlllI[lIllIlIIIl[61]] = lIIllIIIIllIl("2GXSPDhO44Yoj+JXNPFHfNJc/Pen78iqCTXkijZlGi1PsyQ8Z9E4X3LhbIMMnMMr", "holXC");
        lIllIIlllI[lIllIlIIIl[62]] = lIIllIIIIllll("HAgmQnArAiFOJCABOk49IE0hBjExTSIGNWUdJAEyKQg7Tjk2Qw==", "EmVnP");
        lIllIIlllI[lIllIlIIIl[63]] = lIIllIIIIllll("GgQVDlw=", "Iqgkr");
        lIllIIlllI[lIllIlIIIl[64]] = lIIllIIIIllll("H2obZxIzLAQuCzFtFylFNyADKwAibRkhRTElGTQRdj4GIgQ9bA==", "VMvGe");
        lIllIIlllI[lIllIlIIIl[65]] = lIIllIIIIllll("Mig1Z2YiaitrNR4/I2U=", "kMFKF");
        lIllIIlllI[lIllIlIIIl[66]] = lIIllIIIIllll("EhsVbRs7GkIEWDIRDj1H", "ZtbMx");
    }

    private static String lIIllIIIIllIl(String lllllllllllllllllllIIIlIllllllIl, String lllllllllllllllllllIIIlIllllllII) {
        try {
            SecretKeySpec lllllllllllllllllllIIIllIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIlIllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIlIllllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIlIllllllll.init(lIllIlIIIl[3], lllllllllllllllllllIIIllIIIIIIII);
            return new String(lllllllllllllllllllIIIlIllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIlIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIlIlllllllI) {
            lllllllllllllllllllIIIlIlllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIIIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIllIIlIIIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIllIIIlIlll(int i) {
        return i != 0;
    }

    private static boolean lIIllIIIlllIl(Object obj) {
        return obj == null;
    }
}
