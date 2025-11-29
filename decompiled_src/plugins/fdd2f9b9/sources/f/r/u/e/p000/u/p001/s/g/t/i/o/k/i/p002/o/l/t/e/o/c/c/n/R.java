package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.R  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/R.class */
public class R implements G {
    private static /* synthetic */ int[] lIIlIlIIII;
    private static /* synthetic */ WorldPoint jr;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] js;
    private static /* synthetic */ WorldPoint jq;
    private static /* synthetic */ String[] lIIlIIllII;
    public static /* synthetic */ WorldArea jp;

    private static boolean lllllIllIlII(int i, int i2) {
        return i < i2;
    }

    private static String lllllIIlllIl(String llllllllllllllllllllllllIlIIlIlI, String llllllllllllllllllllllllIlIIlIIl) {
        try {
            SecretKeySpec llllllllllllllllllllllllIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllllllIlIIllII = Cipher.getInstance("Blowfish");
            llllllllllllllllllllllllIlIIllII.init(lIIlIlIIII[2], llllllllllllllllllllllllIlIIllIl);
            return new String(llllllllllllllllllllllllIlIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllllllIlIIIllI) {
            llllllllllllllllllllllllIlIIIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllllIlllIII(Skills.getLevel(Skill.FISHING), lIIlIlIIII[74])) {
            ?? r0 = lIIlIlIIII[1];
            "".length();
            return ((((98 + 100) - 90) + 69) ^ (((36 + 47) - 8) + 106)) != ((101 ^ 38) ^ (245 ^ 178)) ? ((75 ^ 106) ^ (157 ^ 148)) & (((88 ^ 86) ^ (166 ^ 128)) ^ (-" ".length())) : r0;
        }
        return lIIlIlIIII[0];
    }

    private static String lllllIIlllII(String llllllllllllllllllllllllIlIlIlll, String llllllllllllllllllllllllIlIlIllI) {
        try {
            SecretKeySpec llllllllllllllllllllllllIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllllIlIlIllI.getBytes(StandardCharsets.UTF_8)), lIIlIlIIII[13]), "DES");
            Cipher llllllllllllllllllllllllIlIllIIl = Cipher.getInstance("DES");
            llllllllllllllllllllllllIlIllIIl.init(lIIlIlIIII[2], llllllllllllllllllllllllIlIllIlI);
            return new String(llllllllllllllllllllllllIlIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllllIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllllllIlIllIII) {
            llllllllllllllllllllllllIlIllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean dj() {
        String[] strArr = new String[lIIlIlIIII[1]];
        strArr[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[57]];
        if (!lllllIllIIll(Inventory.contains(strArr) ? 1 : 0) || (lllllIllIlIl(Inventory.contains(C0005f.aO) ? 1 : 0) && !lllllIllIIll(Equipment.contains(C0005f.aO) ? 1 : 0))) {
            return lIIlIlIIII[0];
        }
        ?? r0 = lIIlIlIIII[1];
        "".length();
        return 0 != 0 ? ((((154 + 88) - 241) + 228) ^ (((51 + 98) - 115) + 163)) & (((((62 + 37) - 16) + 62) ^ (((53 + 93) - 40) + 71)) ^ (-" ".length())) : r0;
    }

    private static boolean lllllIlllIlI(int i, int i2) {
        return i == i2;
    }

    private static void lllllIllIIlI() {
        lIIlIlIIII = new int[101];
        lIIlIlIIII[0] = (245 ^ 181) & ((105 ^ 41) ^ (-1));
        lIIlIlIIII[1] = " ".length();
        lIIlIlIIII[2] = "  ".length();
        lIIlIlIIII[3] = "   ".length();
        lIIlIlIIII[4] = (-((-9110) & 25597)) & (-1) & 21487;
        lIIlIlIIII[5] = (20 ^ 33) ^ (34 ^ 19);
        lIIlIlIIII[6] = (-((-19) & 26835)) & (-529) & 27647;
        lIIlIlIIII[7] = (((36 + 46) - (-58)) + 11) ^ (((120 + 142) - 201) + 85);
        lIIlIlIIII[8] = (-6337) & 6643;
        lIIlIlIIII[9] = 45 ^ 43;
        lIIlIlIIII[10] = (-30857) & 31165;
        lIIlIlIIII[11] = 142 ^ 137;
        lIIlIlIIII[12] = (-29378) & 29691;
        lIIlIlIIII[13] = (((50 + 71) - 100) + 108) ^ (((13 + 4) - 16) + 136);
        lIIlIlIIII[14] = (-18437) & 18749;
        lIIlIlIIII[15] = 8 ^ 1;
        lIIlIlIIII[16] = 190 ^ 180;
        lIIlIlIIII[17] = 16 ^ 27;
        lIIlIlIIII[18] = (((102 + 29) - 101) + 109) ^ (((129 + 52) - 80) + 34);
        lIIlIlIIII[19] = (196 ^ 195) ^ (176 ^ 186);
        lIIlIlIIII[20] = (((19 + 87) - (-28)) + 23) ^ (((60 + 16) - (-48)) + 23);
        lIIlIlIIII[21] = (-((-1641) & 24191)) & (-8194) & 130743;
        lIIlIlIIII[22] = (44 ^ 5) ^ (43 ^ 13);
        lIIlIlIIII[23] = (-2070) & 3069;
        lIIlIlIIII[24] = (-((-1622) & 18135)) & (-49) & 24569;
        lIIlIlIIII[25] = (((83 + 33) - 59) + 80) ^ (((96 + 90) - 75) + 42);
        lIIlIlIIII[26] = 30 ^ 15;
        lIIlIlIIII[27] = (((12 + 87) - 94) + 172) ^ (((58 + 67) - (-11)) + 29);
        lIIlIlIIII[28] = 153 ^ 139;
        lIIlIlIIII[29] = (135 ^ 172) ^ (29 ^ 37);
        lIIlIlIIII[30] = -" ".length();
        lIIlIlIIII[31] = (-29028) & 30571;
        lIIlIlIIII[32] = 45 ^ 56;
        lIIlIlIIII[33] = (((51 + 4) - (-51)) + 63) ^ (((149 + 8) - (-15)) + 19);
        lIIlIlIIII[34] = 208 ^ 199;
        lIIlIlIIII[35] = 109 ^ 117;
        lIIlIlIIII[36] = 76 ^ 85;
        lIIlIlIIII[37] = 181 ^ 175;
        lIIlIlIIII[38] = (29 ^ 81) ^ (88 ^ 15);
        lIIlIlIIII[39] = (((137 + 73) - 159) + 127) ^ (((47 + 78) - 57) + 106);
        lIIlIlIIII[40] = 156 ^ 129;
        lIIlIlIIII[41] = 141 ^ 147;
        lIIlIlIIII[42] = 79 ^ 80;
        lIIlIlIIII[43] = (57 ^ 81) ^ (206 ^ 134);
        lIIlIlIIII[44] = 91 ^ 122;
        lIIlIlIIII[45] = 168 ^ 138;
        lIIlIlIIII[46] = 101 ^ 70;
        lIIlIlIIII[47] = 51 ^ 23;
        lIIlIlIIII[48] = (((195 + 178) - 340) + 192) ^ (((192 + 113) - 114) + 5);
        lIIlIlIIII[49] = (125 ^ 58) ^ (219 ^ 186);
        lIIlIlIIII[50] = (-((-4267) & 32447)) & (-4257) & 32757;
        lIIlIlIIII[51] = (-16409) & 18943;
        lIIlIlIIII[52] = (-((-3333) & 16141)) & (-1) & 16381;
        lIIlIlIIII[53] = (59 ^ 120) ^ (239 ^ 139);
        lIIlIlIIII[54] = (12 ^ 63) ^ (219 ^ 192);
        lIIlIlIIII[55] = (11 ^ 34) ^ ((60 ^ 123) & ((106 ^ 45) ^ (-1)));
        lIIlIlIIII[56] = (((80 + 38) - 62) + 86) ^ (((83 + 161) - 129) + 49);
        lIIlIlIIII[57] = 42 ^ 1;
        lIIlIlIIII[58] = (58 ^ 35) ^ (150 ^ 163);
        lIIlIlIIII[59] = 82 ^ 127;
        lIIlIlIIII[60] = 63 ^ 17;
        lIIlIlIIII[61] = "  ".length() ^ (71 ^ 106);
        lIIlIlIIII[62] = (((130 + 86) - 179) + 120) ^ (((135 + 162) - 154) + 30);
        lIIlIlIIII[63] = (-((-8873) & 26367)) & (-129) & 26622;
        lIIlIlIIII[64] = (-2194) & 2493;
        lIIlIlIIII[65] = (-((-26818) & 31435)) & (-16385) & 21501;
        lIIlIlIIII[66] = (-36) & 13035;
        lIIlIlIIII[67] = (-((-3629) & 28271)) & (-145) & 28639;
        lIIlIlIIII[68] = (-((-11333) & 15735)) & (-2) & 16383;
        lIIlIlIIII[69] = (-((-24740) & 31463)) & (-21) & 31743;
        lIIlIlIIII[70] = (-((-7711) & 32415)) & (-1) & 32711;
        lIIlIlIIII[71] = (-((-4521) & 32249)) & (-9) & 28636;
        lIIlIlIIII[72] = 197 ^ 161;
        lIIlIlIIII[73] = 39 ^ 22;
        lIIlIlIIII[74] = (((101 + 48) - 71) + 165) ^ (((40 + 129) - 68) + 43);
        lIIlIlIIII[75] = 24 ^ 42;
        lIIlIlIIII[76] = 22 ^ 37;
        lIIlIlIIII[77] = (-2075) & 3582;
        lIIlIlIIII[78] = (((43 + 24) - 41) + 101) ^ (225 ^ 170);
        lIIlIlIIII[79] = 140 ^ 185;
        lIIlIlIIII[80] = 158 ^ 168;
        lIIlIlIIII[81] = (((102 + 19) - (-5)) + 38) ^ (((120 + 20) - 97) + 104);
        lIIlIlIIII[82] = 34 ^ 26;
        lIIlIlIIII[83] = (-28709) & 31214;
        lIIlIlIIII[84] = (-((-10305) & 14939)) & (-16385) & 24574;
        lIIlIlIIII[85] = (-9763) & 12279;
        lIIlIlIIII[86] = (-21004) & 24575;
        lIIlIlIIII[87] = (-9218) & 11749;
        lIIlIlIIII[88] = (-12452) & 15863;
        lIIlIlIIII[89] = (-18945) & 20455;
        lIIlIlIIII[90] = (-((-1217) & 26307)) & (-6149) & 32759;
        lIIlIlIIII[91] = (-((-5185) & 15937)) & (-20497) & 32767;
        lIIlIlIIII[92] = (-3073) & 3389;
        lIIlIlIIII[93] = (-((-4193) & 30449)) & (-4097) & 30679;
        lIIlIlIIII[94] = (-((-18539) & 32495)) & (-18481) & 32767;
        lIIlIlIIII[95] = (-28163) & 28507;
        lIIlIlIIII[96] = (-10369) & 10703;
        lIIlIlIIII[97] = (-((-20129) & 24493)) & (-16433) & 32126;
        lIIlIlIIII[98] = (-((-4121) & 21435)) & (-4121) & 32766;
        lIIlIlIIII[99] = (-16670) & 27997;
        lIIlIlIIII[100] = 120 ^ 65;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0148, code lost:
        if (lllllIlllIII(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.R.lIIlIlIIII[1]) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void di() {
        if (lllllIllIIll(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[42]];
            C0001b.a(bv);
            if (lllllIllIlII(bv.size(), lIIlIlIIII[1])) {
                System.out.println(lIIlIIllII[lIIlIlIIII[43]]);
                bt = lIIlIlIIII[0];
            }
        }
        if (lllllIllIlIl(bt ? 1 : 0)) {
            if (lllllIllIlIl(dj() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllllIllIllI(nearest) && lllllIllIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[44]];
                    C0000a.a(nearest);
                }
                if (lllllIllIllI(nearest) && lllllIllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllllIllIlIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[45]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIlIIII[4]);
                        "".length();
                    }
                    if (lllllIllIIll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[46]];
                        if (lllllIllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIlIIII[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIlIIII[1]];
                        iArr[lIIlIlIIII[0]] = lIIlIlIIII[6];
                        if (lllllIllIlIl(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[lIIlIlIIII[1]];
                            strArr[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[47]];
                        }
                        if (!lllllIllIlIl(Bank.contains(C0005f.aO) ? 1 : 0) || !lllllIllIlIl(Inventory.contains(C0005f.aO) ? 1 : 0) || !lllllIllIlIl(Equipment.contains(C0005f.aO) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIlIlIIII[1]];
                            iArr2[lIIlIlIIII[0]] = lIIlIlIIII[6];
                            if (lllllIllIIll(Bank.contains(iArr2) ? 1 : 0)) {
                                Bank.withdraw(lIIlIIllII[lIIlIlIIII[49]], lIIlIlIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIlIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr2 = new String[lIIlIlIIII[1]];
                                    strArr2[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[76]];
                                    if (lllllIllIlll(Inventory.getCount(strArr2))) {
                                        ?? r0 = lIIlIlIIII[1];
                                        "".length();
                                        return (31 ^ 27) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIlIlIIII[0];
                                }, lIIlIlIIII[4]);
                                "".length();
                            }
                            if (lllllIllIIll(Bank.contains(C0005f.aO) ? 1 : 0)) {
                                C0000a.b(C0005f.aO, lIIlIlIIII[1]);
                            }
                        }
                        af();
                        System.out.println(lIIlIIllII[lIIlIlIIII[48]]);
                        bt = lIIlIlIIII[1];
                        return;
                    }
                }
            }
            if (lllllIllIIll(dj() ? 1 : 0)) {
                if (lllllIllIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lllllIllIIll(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlIlIIII[1]];
                    iArr3[lIIlIlIIII[0]] = lIIlIlIIII[50];
                    if (lllllIllIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIIlIlIIII[51], lIIlIlIIII[52], lIIlIlIIII[0]);
                        if (lllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIlIIII[9])) {
                            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[53]];
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIlIlIIII[1]);
                            "".length();
                        }
                        if (lllllIlllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIlIIII[13])) {
                            if (lllllIllIlIl(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                            }
                            if (lllllIllIIll(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks(lIIlIlIIII[2]);
                                "".length();
                                Bank.depositInventory();
                                Time.sleepTicks(lIIlIlIIII[2]);
                                "".length();
                                C0000a.a(lIIlIlIIII[6], lIIlIlIIII[1]);
                            }
                        }
                    }
                }
                if (lllllIllIlIl(Inventory.isFull() ? 1 : 0)) {
                    if (lllllIllIlIl(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(jq), lIIlIlIIII[7])) {
                        AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[54]];
                        if (lllllIllIIll(Inventory.contains(C0005f.aO) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.aO).interact(lIIlIIllII[lIIlIlIIII[55]]);
                        }
                        Movement.walkTo(jq);
                        "".length();
                        Time.sleepTicks(lIIlIlIIII[1]);
                        "".length();
                    }
                    if (lllllIllIIll(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[56]];
                        if (lllllIlllIlI(Players.getLocal().getAnimation(), lIIlIlIIII[30])) {
                            int[] iArr4 = new int[lIIlIlIIII[1]];
                            iArr4[lIIlIlIIII[0]] = lIIlIlIIII[31];
                            if (lllllIllIllI(NPCs.getNearest(iArr4))) {
                                int[] iArr5 = new int[lIIlIlIIII[1]];
                                iArr5[lIIlIlIIII[0]] = lIIlIlIIII[31];
                                NPCs.getNearest(iArr5).interact(lIIlIlIIII[0]);
                                Time.sleepTicks(lIIlIlIIII[7]);
                                "".length();
                            }
                        }
                    }
                }
                if (lllllIllIIll(Inventory.isFull() ? 1 : 0)) {
                    int[] iArr6 = new int[lIIlIlIIII[1]];
                    iArr6[lIIlIlIIII[0]] = lIIlIlIIII[50];
                    if (lllllIllIIll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIlIlIIII[1]];
                        iArr7[lIIlIlIIII[0]] = lIIlIlIIII[50];
                        Inventory.getAll(iArr7).stream().forEach((v0) -> {
                            v0.drop();
                        });
                    }
                }
            }
        }
    }

    private static boolean lllllIlllIII(int i, int i2) {
        return i >= i2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        dg();
        return lIIlIlIIII[72];
    }

    public static void dh() {
        if (lllllIllIIll(Inventory.isFull() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[38]];
            System.out.println(lIIlIIllII[lIIlIlIIII[39]]);
            Inventory.getAll(js).stream().forEach((v0) -> {
                v0.drop();
            });
        }
        if (lllllIllIlIl(Inventory.isFull() ? 1 : 0) && lllllIlllIlI(Players.getLocal().getAnimation(), lIIlIlIIII[30])) {
            String[] strArr = new String[lIIlIlIIII[1]];
            strArr[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[40]];
            NPCs.getNearest(strArr).interact(lIIlIIllII[lIIlIlIIII[41]]);
            Time.sleepTicks(lIIlIlIIII[2]);
            "".length();
        }
    }

    static {
        lllllIllIIlI();
        lllllIllIIIl();
        jp = new WorldArea(lIIlIlIIII[83], lIIlIlIIII[84], lIIlIlIIII[29], lIIlIlIIII[39], lIIlIlIIII[0]);
        bv = new ArrayList();
        jq = new WorldPoint(lIIlIlIIII[85], lIIlIlIIII[86], lIIlIlIIII[0]);
        jr = new WorldPoint(lIIlIlIIII[87], lIIlIlIIII[88], lIIlIlIIII[0]);
        int[] iArr = new int[lIIlIlIIII[17]];
        iArr[lIIlIlIIII[0]] = lIIlIlIIII[89];
        iArr[lIIlIlIIII[1]] = lIIlIlIIII[90];
        iArr[lIIlIlIIII[2]] = lIIlIlIIII[91];
        iArr[lIIlIlIIII[3]] = lIIlIlIIII[92];
        iArr[lIIlIlIIII[5]] = lIIlIlIIII[93];
        iArr[lIIlIlIIII[7]] = lIIlIlIIII[94];
        iArr[lIIlIlIIII[9]] = lIIlIlIIII[95];
        iArr[lIIlIlIIII[11]] = lIIlIlIIII[96];
        iArr[lIIlIlIIII[13]] = lIIlIlIIII[97];
        iArr[lIIlIlIIII[15]] = lIIlIlIIII[98];
        iArr[lIIlIlIIII[16]] = lIIlIlIIII[99];
        js = iArr;
    }

    private static boolean lllllIllIlll(int i) {
        return i > 0;
    }

    private static boolean lllllIlllIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllllIllIIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIlIIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean ab() {
        String[] strArr = new String[lIIlIlIIII[1]];
        strArr[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[58]];
        if (lllllIllIIll(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIIlIlIIII[1]];
            strArr2[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[59]];
            if (lllllIllIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lIIlIlIIII[1]];
                strArr3[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[60]];
                if (lllllIllIIll(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIlIlIIII[1]];
                    strArr4[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[61]];
                    if (lllllIllIIll(Inventory.contains(strArr4) ? 1 : 0)) {
                        String[] strArr5 = new String[lIIlIlIIII[1]];
                        strArr5[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[62]];
                        if (lllllIllIIll(Inventory.contains(strArr5) ? 1 : 0) && (!lllllIllIlIl(Inventory.contains(C0005f.aO) ? 1 : 0) || lllllIllIIll(Equipment.contains(C0005f.aO) ? 1 : 0))) {
                            ?? r0 = lIIlIlIIII[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                }
            }
        }
        return lIIlIlIIII[0];
    }

    public static void af() {
        int[] iArr = new int[lIIlIlIIII[1]];
        iArr[lIIlIlIIII[0]] = lIIlIlIIII[6];
        if (lllllIllIlIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIII[6], lIIlIlIIII[1], lIIlIlIIII[4]));
            "".length();
        }
        int[] iArr2 = new int[lIIlIlIIII[1]];
        iArr2[lIIlIlIIII[0]] = lIIlIlIIII[8];
        if (lllllIllIlIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIII[8], lIIlIlIIII[1], lIIlIlIIII[4]));
            "".length();
        }
        int[] iArr3 = new int[lIIlIlIIII[1]];
        iArr3[lIIlIlIIII[0]] = lIIlIlIIII[10];
        if (lllllIllIlIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIII[10], lIIlIlIIII[1], lIIlIlIIII[63]));
            "".length();
        }
        int[] iArr4 = new int[lIIlIlIIII[1]];
        iArr4[lIIlIlIIII[0]] = lIIlIlIIII[14];
        if (lllllIllIlIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIII[14], lIIlIlIIII[64], lIIlIlIIII[65]));
            "".length();
        }
        int[] iArr5 = new int[lIIlIlIIII[1]];
        iArr5[lIIlIlIIII[0]] = lIIlIlIIII[12];
        if (lllllIllIlIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIII[12], lIIlIlIIII[66], lIIlIlIIII[7]));
            "".length();
        }
        int[] iArr6 = new int[lIIlIlIIII[1]];
        iArr6[lIIlIlIIII[0]] = lIIlIlIIII[67];
        if (lllllIllIlIl(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIII[67], lIIlIlIIII[1], lIIlIlIIII[4]));
            "".length();
        }
        int[] iArr7 = new int[lIIlIlIIII[1]];
        iArr7[lIIlIlIIII[0]] = lIIlIlIIII[24];
        if (lllllIllIlIl(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIII[24], lIIlIlIIII[16], lIIlIlIIII[4]));
            "".length();
        }
        if (lllllIllIlIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlIIllII[lIIlIlIIII[75]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIII[68], lIIlIlIIII[7], lIIlIlIIII[69]));
            "".length();
        }
        int[] iArr8 = new int[lIIlIlIIII[1]];
        iArr8[lIIlIlIIII[0]] = lIIlIlIIII[70];
        if (lllllIllIlIl(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIII[70], lIIlIlIIII[54], lIIlIlIIII[71]));
            "".length();
        }
    }

    private static boolean lllllIllIllI(Object obj) {
        return obj != null;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlIIllII[lIIlIlIIII[73]];
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0162, code lost:
        if (lllllIlllIII(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.R.lIIlIlIIII[1]) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a6, code lost:
        if (lllllIlllIII(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.R.lIIlIlIIII[1]) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ea, code lost:
        if (lllllIlllIII(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.R.lIIlIlIIII[1]) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022e, code lost:
        if (lllllIlllIII(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.R.lIIlIlIIII[1]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0272, code lost:
        if (lllllIlllIII(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.R.lIIlIlIIII[1]) != false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v319, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dg() {
        if (lllllIllIIll(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[0]];
            C0001b.a(bv);
            if (lllllIllIlII(bv.size(), lIIlIlIIII[1])) {
                System.out.println(lIIlIIllII[lIIlIlIIII[1]]);
                bt = lIIlIlIIII[0];
            }
        }
        if (lllllIllIlIl(bt ? 1 : 0)) {
            if (lllllIllIlIl(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllllIllIllI(nearest) && lllllIllIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[2]];
                    C0000a.a(nearest);
                }
                if (lllllIllIllI(nearest) && lllllIllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllllIllIlIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[3]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIlIIII[4]);
                        "".length();
                    }
                    if (lllllIllIIll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[5]];
                        if (lllllIllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIlIIII[5]);
                            "".length();
                        }
                        if (lllllIllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIlIIII[2]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIlIIII[1]];
                        iArr[lIIlIlIIII[0]] = lIIlIlIIII[6];
                        if (lllllIllIlIl(Bank.contains(iArr) ? 1 : 0)) {
                            String[] strArr = new String[lIIlIlIIII[1]];
                            strArr[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[7]];
                        }
                        int[] iArr2 = new int[lIIlIlIIII[1]];
                        iArr2[lIIlIlIIII[0]] = lIIlIlIIII[8];
                        if (lllllIllIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                            String[] strArr2 = new String[lIIlIlIIII[1]];
                            strArr2[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[9]];
                        }
                        int[] iArr3 = new int[lIIlIlIIII[1]];
                        iArr3[lIIlIlIIII[0]] = lIIlIlIIII[10];
                        if (lllllIllIlIl(Bank.contains(iArr3) ? 1 : 0)) {
                            String[] strArr3 = new String[lIIlIlIIII[1]];
                            strArr3[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[11]];
                        }
                        int[] iArr4 = new int[lIIlIlIIII[1]];
                        iArr4[lIIlIlIIII[0]] = lIIlIlIIII[12];
                        if (lllllIllIlIl(Bank.contains(iArr4) ? 1 : 0)) {
                            String[] strArr4 = new String[lIIlIlIIII[1]];
                            strArr4[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[13]];
                        }
                        int[] iArr5 = new int[lIIlIlIIII[1]];
                        iArr5[lIIlIlIIII[0]] = lIIlIlIIII[14];
                        if (lllllIllIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                            String[] strArr5 = new String[lIIlIlIIII[1]];
                            strArr5[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[15]];
                        }
                        if ((!lllllIllIlIl(Bank.contains(C0005f.aO) ? 1 : 0) || lllllIlllIII(Inventory.getCount(C0005f.aO), lIIlIlIIII[1])) && !lllllIllIIll(Equipment.contains(C0005f.aO) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIlIlIIII[1]];
                            iArr6[lIIlIlIIII[0]] = lIIlIlIIII[6];
                            if (lllllIllIIll(Bank.contains(iArr6) ? 1 : 0)) {
                                Bank.withdraw(lIIlIIllII[lIIlIlIIII[17]], lIIlIlIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIlIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIIlIlIIII[1]];
                                    strArr6[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[82]];
                                    if (lllllIllIlll(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIIlIlIIII[1];
                                        "".length();
                                        return (113 ^ 116) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIlIlIIII[0];
                                }, lIIlIlIIII[4]);
                                "".length();
                            }
                            int[] iArr7 = new int[lIIlIlIIII[1]];
                            iArr7[lIIlIlIIII[0]] = lIIlIlIIII[8];
                            if (lllllIllIIll(Bank.contains(iArr7) ? 1 : 0)) {
                                Bank.withdraw(lIIlIIllII[lIIlIlIIII[18]], lIIlIlIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIlIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIIlIlIIII[1]];
                                    strArr6[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[81]];
                                    if (lllllIllIlll(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIIlIlIIII[1];
                                        "".length();
                                        return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIlIlIIII[0];
                                }, lIIlIlIIII[4]);
                                "".length();
                            }
                            int[] iArr8 = new int[lIIlIlIIII[1]];
                            iArr8[lIIlIlIIII[0]] = lIIlIlIIII[10];
                            if (lllllIllIIll(Bank.contains(iArr8) ? 1 : 0)) {
                                Bank.withdraw(lIIlIIllII[lIIlIlIIII[19]], lIIlIlIIII[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIlIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIIlIlIIII[1]];
                                    strArr6[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[80]];
                                    if (lllllIllIlll(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIIlIlIIII[1];
                                        "".length();
                                        return ((true ^ true) & ((true ^ true) ^ true)) == (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIlIlIIII[0];
                                }, lIIlIlIIII[4]);
                                "".length();
                            }
                            int[] iArr9 = new int[lIIlIlIIII[1]];
                            iArr9[lIIlIlIIII[0]] = lIIlIlIIII[12];
                            if (lllllIllIIll(Bank.contains(iArr9) ? 1 : 0)) {
                                Bank.withdraw(lIIlIIllII[lIIlIlIIII[20]], lIIlIlIIII[21], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIlIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIIlIlIIII[1]];
                                    strArr6[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[79]];
                                    if (lllllIllIlll(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIIlIlIIII[1];
                                        "".length();
                                        return "   ".length() < (-" ".length()) ? ((((179 + 52) - 10) + 34) ^ (((33 + 94) - 115) + 159)) & ((" ".length() ^ (220 ^ 137)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIlIlIIII[0];
                                }, lIIlIlIIII[4]);
                                "".length();
                            }
                            int[] iArr10 = new int[lIIlIlIIII[1]];
                            iArr10[lIIlIlIIII[0]] = lIIlIlIIII[14];
                            if (lllllIllIIll(Bank.contains(iArr10) ? 1 : 0)) {
                                Bank.withdraw(lIIlIIllII[lIIlIlIIII[22]], lIIlIlIIII[23], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIlIIII[2]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    String[] strArr6 = new String[lIIlIlIIII[1]];
                                    strArr6[lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[78]];
                                    if (lllllIllIlll(Inventory.getCount(strArr6))) {
                                        ?? r0 = lIIlIlIIII[1];
                                        "".length();
                                        return (((((70 + 75) - 58) + 54) ^ (((48 + 21) - (-39)) + 40)) & (((7 ^ 85) ^ (218 ^ 145)) ^ (-" ".length()))) < 0 ? ((89 ^ 31) ^ (27 ^ 4)) & (((179 ^ 151) ^ (46 ^ 83)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIlIlIIII[0];
                                }, lIIlIlIIII[4]);
                                "".length();
                            }
                            if (lllllIllIIll(Bank.contains(C0005f.aO) ? 1 : 0)) {
                                C0000a.b(C0005f.aO, lIIlIlIIII[1]);
                            }
                            int[] iArr11 = new int[lIIlIlIIII[1]];
                            iArr11[lIIlIlIIII[0]] = lIIlIlIIII[24];
                            if (lllllIllIIll(Bank.contains(iArr11) ? 1 : 0)) {
                                C0000a.a(lIIlIlIIII[24], lIIlIlIIII[1]);
                            }
                        }
                        af();
                        System.out.println(lIIlIIllII[lIIlIlIIII[16]]);
                        bt = lIIlIlIIII[1];
                        return;
                    }
                }
            }
            if (lllllIllIIll(ab() ? 1 : 0)) {
                if (lllllIllIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lllllIllIIll(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[25]];
                    System.out.println(lIIlIIllII[lIIlIlIIII[26]]);
                    Inventory.getAll(js).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (lllllIllIlIl(Inventory.isFull() ? 1 : 0)) {
                    if (lllllIllIlII(Skills.getLevel(Skill.FISHING), lIIlIlIIII[27])) {
                        if (lllllIllIlII(Skills.getLevel(Skill.FISHING), lIIlIlIIII[7])) {
                            if (lllllIllIlIl(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(jq), lIIlIlIIII[7])) {
                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[28]];
                                if (lllllIllIIll(Inventory.contains(C0005f.aO) ? 1 : 0)) {
                                    Inventory.getFirst(C0005f.aO).interact(lIIlIIllII[lIIlIlIIII[29]]);
                                }
                                Movement.walkTo(jq);
                                "".length();
                                Time.sleepTicks(lIIlIlIIII[1]);
                                "".length();
                            }
                            if (lllllIllIIll(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[27]];
                                if (lllllIlllIlI(Players.getLocal().getAnimation(), lIIlIlIIII[30])) {
                                    int[] iArr12 = new int[lIIlIlIIII[1]];
                                    iArr12[lIIlIlIIII[0]] = lIIlIlIIII[31];
                                    NPC nearest2 = NPCs.getNearest(iArr12);
                                    if (lllllIllIllI(nearest2) && lllllIllIIll(jp.contains(nearest2) ? 1 : 0)) {
                                        int[] iArr13 = new int[lIIlIlIIII[1]];
                                        iArr13[lIIlIlIIII[0]] = lIIlIlIIII[31];
                                        NPCs.getNearest(iArr13).interact(lIIlIlIIII[0]);
                                        Time.sleepTicks(lIIlIlIIII[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        if (lllllIlllIII(Skills.getLevel(Skill.FISHING), lIIlIlIIII[7]) && lllllIllIlII(Skills.getLevel(Skill.FISHING), lIIlIlIIII[27])) {
                            if (lllllIllIlIl(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[32]];
                                Movement.walkTo(jq);
                                "".length();
                                Time.sleepTicks(lIIlIlIIII[1]);
                                "".length();
                            }
                            if (lllllIllIIll(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[33]];
                                if (lllllIlllIlI(Players.getLocal().getAnimation(), lIIlIlIIII[30])) {
                                    int[] iArr14 = new int[lIIlIlIIII[1]];
                                    iArr14[lIIlIlIIII[0]] = lIIlIlIIII[31];
                                    NPC nearest3 = NPCs.getNearest(iArr14);
                                    if (lllllIllIllI(nearest3) && lllllIllIIll(jp.contains(nearest3) ? 1 : 0)) {
                                        int[] iArr15 = new int[lIIlIlIIII[1]];
                                        iArr15[lIIlIlIIII[0]] = lIIlIlIIII[31];
                                        NPCs.getNearest(iArr15).interact(lIIlIIllII[lIIlIlIIII[34]]);
                                        Time.sleepTicks(lIIlIlIIII[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lllllIlllIII(Skills.getLevel(Skill.FISHING), lIIlIlIIII[27])) {
                        if (lllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(jr), lIIlIlIIII[22])) {
                            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[35]];
                            Movement.walkTo(jr);
                            "".length();
                            Time.sleepTicks(lIIlIlIIII[1]);
                            "".length();
                        }
                        if (lllllIlllIll(Players.getLocal().getWorldLocation().distanceTo(jr), lIIlIlIIII[22])) {
                            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[36]];
                            if (lllllIlllIlI(Players.getLocal().getAnimation(), lIIlIlIIII[30]) && lllllIllIllI(NPCs.getNearest(npc -> {
                                if (lllllIlllIlI(npc.getId(), lIIlIlIIII[77]) && lllllIlllIll(npc.getWorldLocation().distanceTo(jr), lIIlIlIIII[22])) {
                                    ?? r0 = lIIlIlIIII[1];
                                    "".length();
                                    return "  ".length() < ((177 ^ 166) & ((167 ^ 176) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIlIlIIII[0];
                            }))) {
                                NPCs.getNearest(npc2 -> {
                                    if (lllllIlllIlI(npc2.getId(), lIIlIlIIII[77]) && lllllIlllIll(npc2.getWorldLocation().distanceTo(jr), lIIlIlIIII[22])) {
                                        ?? r0 = lIIlIlIIII[1];
                                        "".length();
                                        return " ".length() < (((((181 + 159) - 200) + 42) ^ (((58 + 167) - 163) + 124)) & (((((17 + 139) - 41) + 43) ^ (((96 + 78) - 75) + 47)) ^ (-" ".length()))) ? ((74 ^ 31) ^ (70 ^ 76)) & (((254 ^ 152) ^ (82 ^ 107)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIlIlIIII[0];
                                }).interact(lIIlIIllII[lIIlIlIIII[37]]);
                                Time.sleepTicks(lIIlIlIIII[2]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lllllIllIlIl(int i) {
        return i == 0;
    }

    private static boolean lllllIlllIIl(int i, int i2) {
        return i > i2;
    }

    private static String lllllIIllllI(String llllllllllllllllllllllllIIlllIlI, String llllllllllllllllllllllllIIlllIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllllllllIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllllllllIIlllIIl.toCharArray();
        int llllllllllllllllllllllllIIllIllI = lIIlIlIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIIII[0];
        while (lllllIllIlII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllllllllllIIllIllI % charArray.length]));
            "".length();
            llllllllllllllllllllllllIIllIllI++;
            i++;
            "".length();
            if ("  ".length() == ((26 ^ 60) & ((49 ^ 23) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lllllIllIIIl() {
        lIIlIIllII = new String[lIIlIlIIII[100]];
        lIIlIIllII[lIIlIlIIII[0]] = lllllIIlllII("yQB2kyO8w4pBVOS0eVcsDw==", "HuifY");
        lIIlIIllII[lIIlIlIIII[1]] = lllllIIlllIl("S3CROBABJB14wsyqS4NyTHFLUzMgHkk0IHYHNHbd6P7GBVce7l1Mo22b9lgW3CfuxrydXIkLeHg=", "YUQiL");
        lIIlIIllII[lIIlIlIIII[2]] = lllllIIlllII("gO4Im7fsfgY3cv/0TvbdYaW9GqxwNwUN", "LEMwZ");
        lIIlIIllII[lIIlIlIIII[3]] = lllllIIllllI("KzQ0DwsKI3EDAwov", "dDQab");
        lIIlIIllII[lIIlIlIIII[5]] = lllllIIlllIl("9HlYEsljBpl0zMo3EiM0ztY8TyNznrht", "YDkUK");
        lIIlIIllII[lIIlIlIIII[7]] = lllllIIllllI("ODokBitLMSwZLwI5IkopDiM=", "kWEjG");
        lIIlIIllII[lIIlIlIIII[9]] = lllllIIllllI("IyQmJAELKnU+BwE=", "eMULh");
        lIIlIIllII[lIIlIlIIII[11]] = lllllIIlllII("7GmmRTBH5AqP9CT5TFq3z4xZtWDhToDn", "bCHHo");
        lIIlIIllII[lIIlIlIIII[13]] = lllllIIlllII("KaQqwq1eMvQ=", "kIjYT");
        lIIlIIllII[lIIlIlIIII[15]] = lllllIIllllI("IiIZAz4KLEoJNg0/", "dKjkW");
        lIIlIIllII[lIIlIlIIII[16]] = lllllIIlllII("9juzT3YjOEGCR7jXeSJK4DSQBDyKmioxpbC/96Lslue9WyKCRyQiNn1V4xgklsQ4", "vCuTI");
        lIIlIIllII[lIIlIlIIII[17]] = lllllIIlllIl("Re30FwLcDKxAmfAS0zqK6vEBzii7k4tF", "ocZcR");
        lIIlIIllII[lIIlIlIIII[18]] = lllllIIllllI("Fj4QDDM+MEMWNTQ=", "PWcdZ");
        lIIlIIllII[lIIlIlIIII[19]] = lllllIIlllIl("vRMzgn++U/ShXBJuOqQj7Q==", "soOti");
        lIIlIIllII[lIIlIlIIII[20]] = lllllIIllllI("MAQbET0TEw==", "vazeU");
        lIIlIIllII[lIIlIlIIII[22]] = lllllIIlllII("zwvdycXACqE1Puqg8ei53A==", "TVbls");
        lIIlIIllII[lIIlIlIIII[25]] = lllllIIlllIl("mSRXJ5EYaxFngWORkRXwPw==", "TbypA");
        lIIlIIllII[lIIlIlIIII[26]] = lllllIIllllI("Bj02NzcrIT5nKy0oKg==", "BOYGG");
        lIIlIIllII[lIIlIlIIII[28]] = lllllIIllllI("FBYRbiY1VxQjMzYbRyg7KR9HPSI1Aw==", "ZwgNR");
        lIIlIIllII[lIIlIlIIII[29]] = lllllIIllllI("MRIVKw==", "fwtYv");
        lIIlIIllII[lIIlIlIIII[27]] = lllllIIlllIl("GEZ26nIvxr8=", "rXchM");
        lIIlIIllII[lIIlIlIIII[32]] = lllllIIllllI("CS4DZjkobwYrLCsjVSAkNCdVNT0oOw==", "GOuFM");
        lIIlIIllII[lIIlIlIIII[33]] = lllllIIlllII("uGnj4J9qs4g=", "lwqej");
        lIIlIIllII[lIIlIlIIII[34]] = lllllIIllllI("GAUfGQ==", "ZdvmH");
        lIIlIIllII[lIIlIlIIII[35]] = lllllIIllllI("LRQeVy4MVQ4bI0MTAQQyQwYYGC4=", "cuhwZ");
        lIIlIIllII[lIIlIlIIII[36]] = lllllIIlllIl("tQyeK7Q+BDQ=", "GCNfL");
        lIIlIIllII[lIIlIlIIII[37]] = lllllIIllllI("FR88Cw==", "YjNne");
        lIIlIIllII[lIIlIlIIII[38]] = lllllIIlllII("1AOVYmTk91aJHD4qtAm5Dw==", "BIDWp");
        lIIlIIllII[lIIlIlIIII[39]] = lllllIIlllIl("NTprSQ5exlKk7LlRgGGjMA==", "AxwZs");
        lIIlIIllII[lIIlIlIIII[40]] = lllllIIlllIl("auYgf7lLMewDpDjhi2vlDA==", "wPiSO");
        lIIlIIllII[lIIlIlIIII[41]] = lllllIIlllII("3sAzMvduFLI=", "aVGpp");
        lIIlIIllII[lIIlIlIIII[42]] = lllllIIllllI("Dj48LRgraywwEyE4", "LKEDv");
        lIIlIIllII[lIIlIlIIII[43]] = lllllIIllllI("BycZHTwpKxNULTQ3HhooYScDESIyYlcHOCg6FBwmLylXFi4iJVcAIGEoHgcnKCAQ", "ANwtO");
        lIIlIIllII[lIIlIlIIII[44]] = lllllIIlllIl("KM2vml+kx+sydidoZ71tt4rS4GJPph6g", "vMGVC");
        lIIlIIllII[lIIlIlIIII[45]] = lllllIIllllI("KRI/PSAIBXoxKAgJ", "fbZSI");
        lIIlIIllII[lIIlIlIIII[46]] = lllllIIlllIl("9AevCyu8aXDVkZnBnVxzd4n0hBZkWHlx", "kMjZj");
        lIIlIIllII[lIIlIlIIII[47]] = lllllIIlllII("7IgBh1rRa3e69L6dN8X9smjMbn+SNTR+", "uQYXZ");
        lIIlIIllII[lIIlIlIIII[48]] = lllllIIlllII("y+e5Zpu3B8xHWaAaZpDeN9Uh/jQRX+xJ8VnyoRA6N4yB+bIazKBwDa9K+5RPl2W1", "OYwQS");
        lIIlIIllII[lIIlIlIIII[49]] = lllllIIlllIl("R9+oSQ21G0SMBangQFpc8FD9kC14RPLy", "DOWsu");
        lIIlIIllII[lIIlIlIIII[53]] = lllllIIllllI("OwcGbDIaRhItKB4=", "ufpLF");
        lIIlIIllII[lIIlIlIIII[54]] = lllllIIlllIl("5TVxpHqiPWaSWciOxU7jCbqZhJbxgOsS", "XhDQd");
        lIIlIIllII[lIIlIlIIII[55]] = lllllIIlllIl("hyaMO853guM=", "DmoMw");
        lIIlIIllII[lIIlIlIIII[56]] = lllllIIlllII("CRhKSaCC0oY=", "GGQMV");
        lIIlIIllII[lIIlIlIIII[57]] = lllllIIlllII("WjIw0Ty9o/wbiTxvGV5pmHQlkzPp6vNp", "iyikm");
        lIIlIIllII[lIIlIlIIII[58]] = lllllIIllllI("KjUnBQFZPi8aBRA2IUkDHCw=", "yXFim");
        lIIlIIllII[lIIlIlIIII[59]] = lllllIIlllII("7SAVtH4OPSBYN4YQj2+jqA==", "SIhbj");
        lIIlIIllII[lIIlIlIIII[60]] = lllllIIlllII("VKlmErbrvgC0D8Ym2HhAew==", "WWhGA");
        lIIlIIllII[lIIlIlIIII[61]] = lllllIIllllI("BQETEzkmFg==", "CdrgQ");
        lIIlIIllII[lIIlIlIIII[62]] = lllllIIlllII("WMflrknqsTZQAh/66zmOkg==", "eVyzS");
        lIIlIIllII[lIIlIlIIII[73]] = lllllIIlllIl("uBqSu5gqRRI=", "YYySY");
        lIIlIIllII[lIIlIlIIII[75]] = lllllIIllllI("JyMGHWw6LEgNKTQmHBJsfQ==", "UJhzL");
        lIIlIIllII[lIIlIlIIII[76]] = lllllIIlllII("NfqX2ayOJiZqH/owFD7QM3DoI4yH1l/y", "ZPLjB");
        lIIlIIllII[lIIlIlIIII[78]] = lllllIIllllI("CAQjAQwgCnALBCcZ", "NmPie");
        lIIlIIllII[lIIlIlIIII[79]] = lllllIIlllII("ZbnKW7tPI80=", "efvrh");
        lIIlIIllII[lIIlIlIIII[80]] = lllllIIlllII("4X+Lry8DxfmgHkIdZ39Cdw==", "HagKd");
        lIIlIIllII[lIIlIlIIII[81]] = lllllIIlllII("BZlMvFskfeTmsfCVF2rRkw==", "vorfz");
        lIIlIIllII[lIIlIlIIII[82]] = lllllIIllllI("MQYpNSZCDSEqIgsFL3kkBx8=", "bkHYJ");
    }
}
