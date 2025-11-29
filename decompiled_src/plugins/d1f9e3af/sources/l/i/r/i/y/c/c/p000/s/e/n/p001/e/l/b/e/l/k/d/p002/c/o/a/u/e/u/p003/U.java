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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.U  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/U.class */
public class U implements W {
    static /* synthetic */ int cl;
    public static final /* synthetic */ WorldPoint kn;
    public static final /* synthetic */ String[] kp;
    static /* synthetic */ boolean cm;
    private static /* synthetic */ int[] lIlIIIIlI;
    public static final /* synthetic */ WorldPoint kl;
    public static final /* synthetic */ WorldPoint ko;
    static /* synthetic */ int bT;
    private static /* synthetic */ String[] lIlIIIIIl;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ WorldPoint km;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIIllllIlI(C0004e.j(lIlIIIIlI[9]), lIlIIIIlI[7]) && lIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(ko), lIlIIIIlI[43])) {
            ?? r0 = lIlIIIIlI[1];
            "".length();
            return (-" ".length()) >= 0 ? ((154 ^ 163) ^ (203 ^ 163)) & (((((16 + 126) - 32) + 17) ^ (90 ^ 116)) ^ (-" ".length())) : r0;
        }
        return lIlIIIIlI[0];
    }

    private static void lIIIIllIllIl() {
        lIlIIIIlI = new int[74];
        lIlIIIIlI[0] = (176 ^ 165) & ((47 ^ 58) ^ (-1));
        lIlIIIIlI[1] = " ".length();
        lIlIIIIlI[2] = 67 ^ 2;
        lIlIIIIlI[3] = 66 ^ 72;
        lIlIIIIlI[4] = (215 ^ 141) ^ (85 ^ 73);
        lIlIIIIlI[5] = "  ".length();
        lIlIIIIlI[6] = (-((-8875) & 11951)) & (-12929) & 16383;
        lIlIIIIlI[7] = "   ".length();
        lIlIIIIlI[8] = (-((-16771) & 31119)) & (-16401) & 31743;
        lIlIIIIlI[9] = ((34 + 150) - 120) + 114;
        lIlIIIIlI[10] = (14 ^ 107) ^ (66 ^ 35);
        lIlIIIIlI[11] = 154 ^ 159;
        lIlIIIIlI[12] = (-((-5257) & 29918)) & (-3) & 29663;
        lIlIIIIlI[13] = (-((-1049) & 21659)) & (-1) & 22527;
        lIlIIIIlI[14] = (-29090) & 30639;
        lIlIIIIlI[15] = (-((-3491) & 16311)) & (-65) & 15231;
        lIlIIIIlI[16] = (-((-1425) & 9649)) & (-1) & 16231;
        lIlIIIIlI[17] = (-31235) & 32567;
        lIlIIIIlI[18] = (43 ^ 23) ^ (82 ^ 104);
        lIlIIIIlI[19] = (-((-1537) & 22325)) & (-1) & 32766;
        lIlIIIIlI[20] = 44 ^ 43;
        lIlIIIIlI[21] = 20 ^ 28;
        lIlIIIIlI[22] = 153 ^ 144;
        lIlIIIIlI[23] = (((147 + 7) - 99) + 103) ^ (((92 + 134) - 150) + 73);
        lIlIIIIlI[24] = (82 ^ 30) ^ (223 ^ 159);
        lIlIIIIlI[25] = 3 ^ 14;
        lIlIIIIlI[26] = 171 ^ 165;
        lIlIIIIlI[27] = 26 ^ 21;
        lIlIIIIlI[28] = 188 ^ 172;
        lIlIIIIlI[29] = (((0 + 21) - (-110)) + 39) ^ (((43 + 151) - 105) + 98);
        lIlIIIIlI[30] = (((8 + 39) - 38) + 200) ^ (((47 + 160) - 31) + 19);
        lIlIIIIlI[31] = 37 ^ 54;
        lIlIIIIlI[32] = 186 ^ 174;
        lIlIIIIlI[33] = (-((-16715) & 27999)) & (-20481) & 32478;
        lIlIIIIlI[34] = (((20 + 42) - (-66)) + 18) ^ (((122 + 57) - 60) + 16);
        lIlIIIIlI[35] = 140 ^ 154;
        lIlIIIIlI[36] = (54 ^ 58) ^ (173 ^ 182);
        lIlIIIIlI[37] = (7 ^ 35) ^ (59 ^ 7);
        lIlIIIIlI[38] = (136 ^ 150) ^ (151 ^ 144);
        lIlIIIIlI[39] = (31 ^ 107) ^ (99 ^ 13);
        lIlIIIIlI[40] = 116 ^ 111;
        lIlIIIIlI[41] = (((157 + 161) - 198) + 48) ^ (((51 + 58) - (-13)) + 58);
        lIlIIIIlI[42] = (((34 + 5) - (-62)) + 54) ^ (((82 + 65) - 116) + 103);
        lIlIIIIlI[43] = 130 ^ 156;
        lIlIIIIlI[44] = (250 ^ 169) ^ (48 ^ 124);
        lIlIIIIlI[45] = 161 ^ 129;
        lIlIIIIlI[46] = (10 ^ 29) ^ (144 ^ 166);
        lIlIIIIlI[47] = (((124 + 27) - 62) + 59) ^ (((174 + 56) - 127) + 79);
        lIlIIIIlI[48] = 40 ^ 11;
        lIlIIIIlI[49] = 162 ^ 134;
        lIlIIIIlI[50] = (-18658) & 24557;
        lIlIIIIlI[51] = (-((-11277) & 16029)) & (-68) & 30719;
        lIlIIIIlI[52] = (-(((131 + 18) - 63) + 76)) & (-67) & 16127;
        lIlIIIIlI[53] = 31 ^ 55;
        lIlIIIIlI[54] = (-25168) & 25567;
        lIlIIIIlI[55] = (-((-12645) & 29029)) & (-273) & 28636;
        lIlIIIIlI[56] = (-1109) & 26108;
        lIlIIIIlI[57] = (-((-1345) & 32194)) & (-17) & 32765;
        lIlIIIIlI[58] = (-1063) & 13687;
        lIlIIIIlI[59] = (79 ^ 29) ^ (71 ^ 113);
        lIlIIIIlI[60] = 157 ^ 184;
        lIlIIIIlI[61] = (20 ^ 61) ^ (124 ^ 115);
        lIlIIIIlI[62] = (-((-2866) & 23411)) & (-8609) & 32251;
        lIlIIIIlI[63] = (-28932) & 32199;
        lIlIIIIlI[64] = (-((-3127) & 7543)) & (-553) & 8191;
        lIlIIIIlI[65] = (-16913) & 20307;
        lIlIIIIlI[66] = (-12739) & 15854;
        lIlIIIIlI[67] = (-((-11345) & 27763)) & (-4737) & 24510;
        lIlIIIIlI[68] = (-((-7683) & 32627)) & (-9) & 28029;
        lIlIIIIlI[69] = (-2133) & 11903;
        lIlIIIIlI[70] = 64 ^ 103;
        lIlIIIIlI[71] = 105 ^ 64;
        lIlIIIIlI[72] = (44 ^ 0) ^ (138 ^ 140);
        lIlIIIIlI[73] = 74 ^ 97;
    }

    static {
        lIIIIllIllIl();
        lIIIIllIllII();
        kl = new WorldPoint(lIlIIIIlI[62], lIlIIIIlI[63], lIlIIIIlI[0]);
        km = new WorldPoint(lIlIIIIlI[64], lIlIIIIlI[65], lIlIIIIlI[0]);
        kn = new WorldPoint(lIlIIIIlI[66], lIlIIIIlI[67], lIlIIIIlI[0]);
        ko = new WorldPoint(lIlIIIIlI[68], lIlIIIIlI[69], lIlIIIIlI[0]);
        String[] strArr = new String[lIlIIIIlI[10]];
        strArr[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[70]];
        strArr[lIlIIIIlI[1]] = lIlIIIIIl[lIlIIIIlI[53]];
        strArr[lIlIIIIlI[5]] = lIlIIIIIl[lIlIIIIlI[71]];
        strArr[lIlIIIIlI[7]] = lIlIIIIIl[lIlIIIIlI[72]];
        kp = strArr;
        bv = new ArrayList();
        bT = lIlIIIIlI[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0142, code lost:
        if (lIIIIlllIlII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x054a, code lost:
        if (lIIIIlllIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v369, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void db() {
        if (lIIIIllIllll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[0]];
            C0001b.a(bv);
            if (lIIIIlllIIII(bv.size(), lIlIIIIlI[1])) {
                System.out.println(lIlIIIIIl[lIlIIIIlI[1]]);
                bt = lIlIIIIlI[0];
            }
        }
        if (lIIIIlllIIIl(bt ? 1 : 0) && lIIIIlllIIII(C0004e.j(lIlIIIIlI[2]), lIlIIIIlI[3])) {
            F.bG();
        }
        if (lIIIIlllIIIl(bt ? 1 : 0) && lIIIIlllIIlI(C0004e.j(lIlIIIIlI[2]), lIlIIIIlI[3])) {
            if (lIIIIllIllll(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIlllIIII(Movement.getRunEnergy(), lIlIIIIlI[4])) {
                Inventory.getFirst(C0005f.aV).interact(lIlIIIIIl[lIlIIIIlI[5]]);
                Time.sleepTicks(lIlIIIIlI[1]);
                "".length();
            }
            if (lIIIIlllIIll(lIIIIllIlllI(C0004e.u(), 70.0d))) {
                int[] iArr = new int[lIlIIIIlI[1]];
                iArr[lIlIIIIlI[0]] = lIlIIIIlI[6];
                if (lIIIIllIllll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIIIIlI[1]];
                    iArr2[lIlIIIIlI[0]] = lIlIIIIlI[6];
                    Inventory.getFirst(iArr2).interact(lIlIIIIIl[lIlIIIIlI[7]]);
                }
            }
            if (lIIIIlllIIIl(Movement.isRunEnabled() ? 1 : 0) && lIIIIlllIlII(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIIIIllIllll(ab() ? 1 : 0)) {
                int[] iArr3 = new int[lIlIIIIlI[1]];
                iArr3[lIlIIIIlI[0]] = lIlIIIIlI[8];
            }
            if (lIIIIlllIIII(C0004e.j(lIlIIIIlI[9]), lIlIIIIlI[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIlllIlIl(nearest) && lIIIIlllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[10]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIlIIIIlI[5]);
                    "".length();
                }
                if (lIIIIlllIlIl(nearest) && lIIIIllIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[11]];
                    if (lIIIIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIIIlI[12]);
                        "".length();
                    }
                    if (lIIIIllIllll(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIIlllIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIIIlI[10]);
                            "".length();
                        }
                        if (lIIIIlllIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIIIIlI[5]);
                            "".length();
                        }
                        int[] iArr4 = new int[lIlIIIIlI[11]];
                        iArr4[lIlIIIIlI[0]] = lIlIIIIlI[13];
                        iArr4[lIlIIIIlI[1]] = lIlIIIIlI[14];
                        iArr4[lIlIIIIlI[5]] = lIlIIIIlI[15];
                        iArr4[lIlIIIIlI[7]] = lIlIIIIlI[16];
                        iArr4[lIlIIIIlI[10]] = lIlIIIIlI[17];
                        if (lIIIIlllIIIl(C0004e.b(iArr4) ? 1 : 0)) {
                            af();
                            System.out.println(lIlIIIIIl[lIlIIIIlI[18]]);
                            bt = lIlIIIIlI[1];
                            return;
                        }
                        Bank.withdraw(lIlIIIIlI[13], lIlIIIIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIIIIlI[1]);
                        "".length();
                        Bank.withdraw(lIlIIIIlI[14], lIlIIIIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIIIIlI[1]);
                        "".length();
                        Bank.withdraw(lIlIIIIlI[15], lIlIIIIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIIIIlI[1]);
                        "".length();
                        Bank.withdraw(lIlIIIIlI[16], lIlIIIIlI[11], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIIIIlI[1]);
                        "".length();
                        Bank.withdraw(lIlIIIIlI[19], lIlIIIIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIIIIlI[1]);
                        "".length();
                        Bank.withdraw(lIlIIIIlI[17], lIlIIIIlI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIIIIlI[1]);
                        "".length();
                        C0000a.b(C0005f.aV, lIlIIIIlI[1]);
                        C0000a.a(lIlIIIIlI[6], lIlIIIIlI[3]);
                        C0000a.b(C0005f.bf, lIlIIIIlI[1]);
                    }
                }
            }
            if (lIIIIllIllll(ab() ? 1 : 0) && lIIIIlllIIII(C0004e.j(lIlIIIIlI[9]), lIlIIIIlI[1])) {
                if (lIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(kl), lIlIIIIlI[5])) {
                    AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[20]];
                    if (lIIIIlllIIIl(Equipment.contains(C0005f.aR) ? 1 : 0) && lIIIIllIllll(Inventory.contains(C0005f.aR) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aR).interact(lIlIIIIIl[lIlIIIIlI[21]]);
                        Time.sleepTicks(lIlIIIIlI[1]);
                        "".length();
                    }
                    if (lIIIIlllIIII(bT, lIlIIIIlI[1])) {
                        C0004e.v();
                        bT += lIlIIIIlI[1];
                    }
                    Movement.walkTo(kl);
                    "".length();
                    Time.sleepTicks(lIlIIIIlI[1]);
                    "".length();
                }
                if (lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(kl), lIlIIIIlI[7])) {
                    AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[22]];
                    C0006g.a(lIlIIIIIl[lIlIIIIlI[3]], kp);
                }
            }
            if (lIIIIlllIIlI(C0004e.j(lIlIIIIlI[9]), lIlIIIIlI[1])) {
                cl = lIlIIIIlI[0];
                if (lIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(km), lIlIIIIlI[21])) {
                    AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[23]];
                    Movement.walkTo(km);
                    "".length();
                    Time.sleepTicks(lIlIIIIlI[1]);
                    "".length();
                }
                if (lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(km), lIlIIIIlI[21])) {
                    AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[24]];
                    C0006g.a(lIlIIIIIl[lIlIIIIlI[25]], kp);
                }
            }
            if (lIIIIlllIIlI(C0004e.j(lIlIIIIlI[9]), lIlIIIIlI[5])) {
                String[] strArr = new String[lIlIIIIlI[1]];
                strArr[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[26]];
                if (lIIIIlllIIIl(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIIIIlI[1]];
                    strArr2[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[27]];
                }
                AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[28]];
                C0006g.a(lIlIIIIIl[lIlIIIIlI[29]], kp);
                C0006g.a(kp);
            }
            if (lIIIIlllIIlI(C0004e.j(lIlIIIIlI[9]), lIlIIIIlI[5])) {
                String[] strArr3 = new String[lIlIIIIlI[1]];
                strArr3[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[30]];
                if (lIIIIlllIIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlIIIIlI[1]];
                    strArr4[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[31]];
                    if (lIIIIllIllll(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (lIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(kn), lIlIIIIlI[5]) && lIIIIlllIllI(Players.getLocal().getWorldLocation().distanceTo(ko), lIlIIIIlI[3])) {
                            AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[32]];
                            if (lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(km), lIlIIIIlI[3]) && lIIIIllIllll(Equipment.contains(C0005f.aR) ? 1 : 0) && lIIIIllllIII(Players.getLocal().getAnimation(), lIlIIIIlI[33])) {
                                Equipment.getFirst(C0005f.aR).interact(lIlIIIIIl[lIlIIIIlI[34]]);
                                Time.sleepTicks(lIlIIIIlI[7]);
                                "".length();
                            }
                            Movement.walkTo(kn);
                            "".length();
                            Time.sleepTicks(lIlIIIIlI[1]);
                            "".length();
                        }
                        if (lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(kn), lIlIIIIlI[10])) {
                            AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[35]];
                            String[] strArr5 = new String[lIlIIIIlI[1]];
                            strArr5[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[36]];
                            TileObjects.getNearest(strArr5).interact(lIlIIIIIl[lIlIIIIlI[37]]);
                            Time.sleepTicks(lIlIIIIlI[7]);
                            "".length();
                        }
                        if (lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(ko), lIlIIIIlI[3])) {
                            String[] strArr6 = new String[lIlIIIIlI[1]];
                            strArr6[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[38]];
                            if (lIIIIllllIIl(NPCs.getNearest(strArr6))) {
                                AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[39]];
                                if (lIIIIlllIIII(cl, lIlIIIIlI[1])) {
                                    an.pA += lIlIIIIlI[1];
                                    an.o(AccBuilderEasyClues.m);
                                    cl += lIlIIIIlI[1];
                                    an.pA = lIlIIIIlI[0];
                                    cm = lIlIIIIlI[0];
                                }
                                String[] strArr7 = new String[lIlIIIIlI[1]];
                                strArr7[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[40]];
                                TileObjects.getNearest(strArr7).interact(lIlIIIIIl[lIlIIIIlI[41]]);
                                Time.sleepTicks(lIlIIIIlI[10]);
                                "".length();
                            }
                            String[] strArr8 = new String[lIlIIIIlI[1]];
                            strArr8[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[42]];
                            NPC nearest2 = NPCs.getNearest(strArr8);
                            if (lIIIIlllIlIl(nearest2)) {
                                AccBuilderEasyClues.c = lIlIIIIIl[lIlIIIIlI[43]];
                                int[] iArr5 = new int[lIlIIIIlI[1]];
                                iArr5[lIlIIIIlI[0]] = lIlIIIIlI[17];
                                if (lIIIIlllIIIl(Equipment.contains(iArr5) ? 1 : 0)) {
                                    int[] iArr6 = new int[lIlIIIIlI[1]];
                                    iArr6[lIlIIIIlI[0]] = lIlIIIIlI[17];
                                    if (lIIIIllIllll(Inventory.contains(iArr6) ? 1 : 0)) {
                                        int[] iArr7 = new int[lIlIIIIlI[1]];
                                        iArr7[lIlIIIIlI[0]] = lIlIIIIlI[17];
                                        Inventory.getFirst(iArr7).interact(lIlIIIIIl[lIlIIIIlI[44]]);
                                        Time.sleepTicks(lIlIIIIlI[1]);
                                        "".length();
                                    }
                                }
                                if (lIIIIllllIIl(Players.getLocal().getInteracting()) && lIIIIlllIIIl(nearest2.isDead() ? 1 : 0)) {
                                    nearest2.interact(lIlIIIIIl[lIlIIIIlI[45]]);
                                    Time.sleepTicks(lIlIIIIlI[5]);
                                    "".length();
                                }
                            }
                        }
                    }
                }
            }
            if (lIIIIlllIIlI(C0004e.j(lIlIIIIlI[9]), lIlIIIIlI[7]) && lIIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(ko), lIlIIIIlI[3])) {
                int[] iArr8 = new int[lIlIIIIlI[1]];
                iArr8[lIlIIIIlI[0]] = lIlIIIIlI[16];
                if (lIIIIllIllll(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIlIIIIlI[1]];
                    iArr9[lIlIIIIlI[0]] = lIlIIIIlI[16];
                    Inventory.getFirst(iArr9).interact(lIlIIIIIl[lIlIIIIlI[46]]);
                    Time.sleepTicks(lIlIIIIlI[5]);
                    "".length();
                }
            }
            C0006g.a(new String[lIlIIIIlI[0]]);
        }
    }

    private static String lIIIIllIlIlI(String llllIllIlIIIll, String llllIllIlIIIlI) {
        try {
            SecretKeySpec llllIllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIlI[21]), "DES");
            Cipher llllIllIlIIlIl = Cipher.getInstance("DES");
            llllIllIlIIlIl.init(lIlIIIIlI[5], llllIllIlIIllI);
            return new String(llllIllIlIIlIl.doFinal(Base64.getDecoder().decode(llllIllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIllIlIIlII) {
            llllIllIlIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlllIIll(int i) {
        return i < 0;
    }

    private static boolean lIIIIllllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIllllIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIIlllIlll(int i, int i2) {
        return i <= i2;
    }

    private static String lIIIIllIlIIl(String llllIllIllIIII, String llllIllIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIllIllIIlI = Cipher.getInstance("Blowfish");
            llllIllIllIIlI.init(lIlIIIIlI[5], secretKeySpec);
            return new String(llllIllIllIIlI.doFinal(Base64.getDecoder().decode(llllIllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIllIllIIIl) {
            llllIllIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlllIIlI(int i, int i2) {
        return i == i2;
    }

    private static void lIIIIllIllII() {
        lIlIIIIIl = new String[lIlIIIIlI[73]];
        lIlIIIIIl[lIlIIIIlI[0]] = lIIIIllIlIIl("M4eu6S76xy9w31JI3rfCog==", "dvcjs");
        lIlIIIIIl[lIlIIIIlI[1]] = lIIIIllIlIlI("+/b7PungGUApONs1af7rG6qtzs2ZDf97nnzYHfo5TiBD2w2ml0aGNilSjCXWdblZ", "pBGMg");
        lIlIIIIIl[lIlIIIIlI[5]] = lIIIIllIlIll("AQIhJTg=", "EpHKS");
        lIlIIIIIl[lIlIIIIlI[7]] = lIIIIllIlIlI("QKcw/0ZrQoM=", "uNKYq");
        lIlIIIIIl[lIlIIIIlI[10]] = lIIIIllIlIlI("mrZh8tREY9rd8YvQrmeygQ==", "nYZKC");
        lIlIIIIIl[lIlIIIIlI[11]] = lIIIIllIlIll("LgMJNisPDAByJQcMDDspAQ==", "fbgRG");
        lIlIIIIIl[lIlIIIIlI[18]] = lIIIIllIlIll("HittMDQsbiA4NTonIzZmODsoIjJpPTghNiUnKCJqaT06ODIqJiQ/IWk6InEEHBcEHwE=", "INMQF");
        lIlIIIIIl[lIlIIIIlI[20]] = lIIIIllIlIIl("hgOStV2Bi8pQnH8/ZCYWpA==", "Lhuuu");
        lIlIIIIIl[lIlIIIIlI[21]] = lIIIIllIlIIl("n5NILY6qN6o=", "hTJHX");
        lIlIIIIIl[lIlIIIIlI[22]] = lIIIIllIlIIl("GPfk1w11M4xaA8nGl7Cmpw==", "pWYYH");
        lIlIIIIIl[lIlIIIIlI[3]] = lIIIIllIlIlI("6nCLIQEs0tU=", "wUjrG");
        lIlIIIIIl[lIlIIIIlI[23]] = lIIIIllIlIlI("ffq+Q4LEom+cr+3GZleEjQ==", "klxFH");
        lIlIIIIIl[lIlIIIIlI[24]] = lIIIIllIlIll("LDsEBU0MNUgKHw00Aw==", "xZhnm");
        lIlIIIIIl[lIlIIIIlI[25]] = lIIIIllIlIlI("ca7Rqpalzo+C+vt4tMWB2g==", "Gelpo");
        lIlIIIIIl[lIlIIIIlI[26]] = lIIIIllIlIll("MTEAPA==", "sTeNg");
        lIlIIIIIl[lIlIIIIlI[27]] = lIIIIllIlIll("Ej0GJgo=", "AIgMo");
        lIlIIIIIl[lIlIIIIlI[28]] = lIIIIllIlIIl("SRL8xpDrdnwyzj1ZX7K4HA==", "pvbyx");
        lIlIIIIIl[lIlIIIIlI[29]] = lIIIIllIlIlI("oOrYt6KcEMCe8+NPg3OMeg==", "AmJmX");
        lIlIIIIIl[lIlIIIIlI[30]] = lIIIIllIlIll("FTU0Aw==", "WPQql");
        lIlIIIIIl[lIlIIIIlI[31]] = lIIIIllIlIlI("eVZjDIOFlgM=", "lfusg");
        lIlIIIIIl[lIlIIIIlI[32]] = lIIIIllIlIlI("8vxKK7e6N4GdTuoec5KW4w==", "mOHso");
        lIlIIIIIl[lIlIIIIlI[34]] = lIIIIllIlIIl("tXR/1z8T5pd1ooiJ7LZ2gA==", "SlQKh");
        lIlIIIIIl[lIlIIIIlI[35]] = lIIIIllIlIIl("m2xLGHlNAC8k0x+T/Gl0LXc0Vt2dJkkp", "QxfgV");
        lIlIIIIIl[lIlIIIIlI[36]] = lIIIIllIlIIl("LT0wsWPOZEE=", "MlPtQ");
        lIlIIIIIl[lIlIIIIlI[37]] = lIIIIllIlIll("BQMCAFgWDRkF", "Rbnku");
        lIlIIIIIl[lIlIIIIlI[38]] = lIIIIllIlIIl("wwit0ZdklzXrM8mphbYjKA==", "DxHbX");
        lIlIIIIIl[lIlIIIIlI[39]] = lIIIIllIlIll("MSIAIgILOAZwEAsxCSQ=", "bVaPv");
        lIlIIIIIl[lIlIIIIlI[40]] = lIIIIllIlIlI("7kc9YjkZelQ=", "KutXz");
        lIlIIIIIl[lIlIIIIlI[41]] = lIIIIllIlIlI("0WFmdq2jc6Q=", "hfKUb");
        lIlIIIIIl[lIlIIIIlI[42]] = lIIIIllIlIIl("SxXPyUWPYYm7TDyE6avQFA==", "cpqGd");
        lIlIIIIIl[lIlIIIIlI[43]] = lIIIIllIlIll("NCcJBgIbIAk=", "rNnnv");
        lIlIIIIIl[lIlIIIIlI[44]] = lIIIIllIlIll("OjkKKw8=", "mPoGk");
        lIlIIIIIl[lIlIIIIlI[45]] = lIIIIllIlIll("GR4nOwYz", "XjSZe");
        lIlIIIIIl[lIlIIIIlI[46]] = lIIIIllIlIlI("z7kZwaGbn80=", "iwrYH");
        lIlIIIIIl[lIlIIIIlI[47]] = lIIIIllIlIIl("PZF/oFAfH5Y=", "TBwnm");
        lIlIIIIIl[lIlIIIIlI[48]] = lIIIIllIlIll("KCQALSwM", "oErAE");
        lIlIIIIIl[lIlIIIIlI[49]] = lIIIIllIlIll("Eg4OHgAo", "Zocse");
        lIlIIIIIl[lIlIIIIlI[60]] = lIIIIllIlIll("EgM/Mw82B3IwCiUbNzFGNRc3MBI=", "DbRCf");
        lIlIIIIIl[lIlIIIIlI[61]] = lIIIIllIlIIl("t5zM3udYOWTcOwFruIlQkRfUsy+uGu6E", "KEyUV");
        lIlIIIIIl[lIlIIIIlI[70]] = lIIIIllIlIll("Lh9LbyBGGUc6GUESCD1JABpHLg0XEQk7HBMRSQ==", "atgOi");
        lIlIIIIIl[lIlIIIIlI[53]] = lIIIIllIlIll("JEYuPiAWFWk9J0UfJiczRQAgPCQWEmkzLQBGOT4kBBUsfA==", "efIRA");
        lIlIIIIIl[lIlIIIIlI[71]] = lIIIIllIlIIl("GLCj79+zCs/UAzYshcKahtuB8WNiKQ3a", "LEeau");
        lIlIIIIIl[lIlIIIIlI[72]] = lIIIIllIlIll("GxUGWw==", "BpuuA");
    }

    private static boolean lIIIIlllIlII(int i) {
        return i > 0;
    }

    private static boolean lIIIIlllIIII(int i, int i2) {
        return i < i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            db();
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return ((((82 + 119) - 158) + 119) ^ (((2 + 50) - 44) + 179)) & (((120 ^ 37) ^ (243 ^ 183)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlIIIIlI[59];
    }

    private static boolean lIIIIlllIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIIIIlI[0];
    }

    private static boolean lIIIIlllIllI(int i, int i2) {
        return i > i2;
    }

    private static int lIIIIllIlllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        String[] strArr = new String[lIlIIIIlI[1]];
        strArr[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[47]];
        if (lIIIIllIllll(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIlIIIIlI[1]];
            strArr2[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[48]];
            if (lIIIIllIllll(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lIlIIIIlI[1]];
                strArr3[lIlIIIIlI[0]] = lIlIIIIIl[lIlIIIIlI[49]];
                if (lIIIIllIllll(Inventory.contains(strArr3) ? 1 : 0)) {
                    ?? r0 = lIlIIIIlI[1];
                    "".length();
                    return " ".length() != " ".length() ? ((88 ^ 64) ^ (15 ^ 10)) & (((206 ^ 174) ^ (3 ^ 126)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIlIIIIlI[0];
    }

    private static boolean lIIIIllIllll(int i) {
        return i != 0;
    }

    private static boolean lIIIIlllIlIl(Object obj) {
        return obj != null;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIIIIIl[lIlIIIIlI[60]];
    }

    private static void af() {
        int[] iArr = new int[lIlIIIIlI[1]];
        iArr[lIlIIIIlI[0]] = lIlIIIIlI[13];
        if (lIIIIlllIIIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIlI[13], lIlIIIIlI[1], lIlIIIIlI[50]));
            "".length();
        }
        int[] iArr2 = new int[lIlIIIIlI[1]];
        iArr2[lIlIIIIlI[0]] = lIlIIIIlI[15];
        if (lIIIIlllIIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIlI[15], lIlIIIIlI[1], lIlIIIIlI[50]));
            "".length();
        }
        int[] iArr3 = new int[lIlIIIIlI[1]];
        iArr3[lIlIIIIlI[0]] = lIlIIIIlI[17];
        if (lIIIIlllIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIlI[17], lIlIIIIlI[1], lIlIIIIlI[51]));
            "".length();
        }
        int[] iArr4 = new int[lIlIIIIlI[1]];
        iArr4[lIlIIIIlI[0]] = lIlIIIIlI[14];
        if (lIIIIlllIIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIlI[14], lIlIIIIlI[1], lIlIIIIlI[50]));
            "".length();
        }
        int[] iArr5 = new int[lIlIIIIlI[1]];
        iArr5[lIlIIIIlI[0]] = lIlIIIIlI[19];
        if (lIIIIlllIIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIlI[19], lIlIIIIlI[1], lIlIIIIlI[52]));
            "".length();
        }
        int[] iArr6 = new int[lIlIIIIlI[1]];
        iArr6[lIlIIIIlI[0]] = lIlIIIIlI[6];
        if (lIIIIlllIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIlI[6], lIlIIIIlI[3], lIlIIIIlI[50]));
            "".length();
        }
        int[] iArr7 = new int[lIlIIIIlI[1]];
        iArr7[lIlIIIIlI[0]] = lIlIIIIlI[6];
        if (lIIIIllIllll(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lIlIIIIlI[1]];
            iArr8[lIlIIIIlI[0]] = lIlIIIIlI[6];
            if (lIIIIlllIIII(Bank.getFirst(iArr8).getQuantity(), lIlIIIIlI[32])) {
                bv.add(new C0003d(lIlIIIIlI[6], lIlIIIIlI[53], lIlIIIIlI[54]));
                "".length();
            }
        }
        if (lIIIIlllIIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIIIIIl[lIlIIIIlI[61]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIlI[55], lIlIIIIlI[11], lIlIIIIlI[56]));
            "".length();
        }
        int[] iArr9 = new int[lIlIIIIlI[1]];
        iArr9[lIlIIIIlI[0]] = lIlIIIIlI[16];
        if (lIIIIlllIIIl(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIlI[16], lIlIIIIlI[53], lIlIIIIlI[57]));
            "".length();
        }
        int[] iArr10 = new int[lIlIIIIlI[1]];
        iArr10[lIlIIIIlI[0]] = lIlIIIIlI[58];
        if (lIIIIlllIIIl(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0003d(lIlIIIIlI[58], lIlIIIIlI[11], C0008i.bq));
            "".length();
        }
    }

    private static boolean lIIIIllllIII(int i, int i2) {
        return i != i2;
    }

    private static String lIIIIllIlIll(String llllIllIIlIIll, String llllIllIIlIIlI) {
        String llllIllIIlIIll2 = new String(Base64.getDecoder().decode(llllIllIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllIllIIlIIlI.toCharArray();
        int llllIllIIIllll = lIlIIIIlI[0];
        char[] charArray2 = llllIllIIlIIll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIIlI[0];
        while (lIIIIlllIIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllIllIIIllll % charArray.length]));
            "".length();
            llllIllIIIllll++;
            i++;
            "".length();
            if ((157 ^ 153) < ((3 ^ 30) & ((66 ^ 95) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
