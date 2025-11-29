package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
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
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.L  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/L.class */
public class L implements F {
    public static final /* synthetic */ int iR;
    public static final /* synthetic */ WorldPoint iS;
    public static final /* synthetic */ int iP;
    public static final /* synthetic */ int iQ;
    private static /* synthetic */ int[] lIllllIl;
    private static /* synthetic */ String[] lIllllII;
    public static /* synthetic */ List<C0003d> bB;
    public static /* synthetic */ boolean bz;
    public static final /* synthetic */ WorldPoint iT;

    private static boolean lIIllllllIl(int i, int i2) {
        return i >= i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        cC();
        return lIllllIl[33];
    }

    private static void ag() {
        if (lIIlllllIIl(Skills.getLevel(Skill.COOKING), lIllllIl[5])) {
            bB.add(new C0003d(lIllllIl[6], lIllllIl[22], lIllllIl[23]));
            "".length();
        }
        if (lIIllllllIl(Skills.getLevel(Skill.COOKING), lIllllIl[5]) && lIIlllllIIl(Skills.getLevel(Skill.COOKING), lIllllIl[8])) {
            bB.add(new C0003d(lIllllIl[9], lIllllIl[24], lIllllIl[25]));
            "".length();
        }
        if (lIIllllllIl(Skills.getLevel(Skill.COOKING), lIllllIl[8])) {
            bB.add(new C0003d(lIllllIl[11], lIllllIl[24], lIllllIl[25]));
            "".length();
        }
        if (lIIlllllIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIllllII[lIllllIl[5]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(lIllllIl[13], lIllllIl[26], lIllllIl[27]));
            "".length();
        }
        if (lIIlllllIlI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIllllII[lIllllIl[36]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(lIllllIl[28], lIllllIl[10], lIllllIl[29]));
            "".length();
        }
        int[] iArr = new int[lIllllIl[1]];
        iArr[lIllllIl[0]] = lIllllIl[30];
        if (lIIlllllIlI(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(lIllllIl[30], lIllllIl[31], lIllllIl[32]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v197, types: [boolean] */
    public static void cC() {
        if (lIIlllllIII(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIllllII[lIllllIl[0]];
            C0001b.a(bB);
            if (lIIlllllIIl(bB.size(), lIllllIl[1])) {
                System.out.println(lIllllII[lIllllIl[1]]);
                bz = lIllllIl[0];
            }
        }
        if (lIIlllllIlI(bz ? 1 : 0)) {
            if (lIIlllllIlI(ac() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlllllIll(nearest) && lIIlllllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllllII[lIllllIl[2]];
                    C0000a.a(nearest);
                }
                if (lIIlllllIll(nearest) && lIIlllllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIllllII[lIllllIl[3]];
                    if (lIIlllllIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllllIl[4]);
                        "".length();
                    }
                    if (lIIlllllIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllllIl[1]);
                            "".length();
                        }
                        if (lIIllllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllllIl[2]);
                            "".length();
                        }
                    }
                    if (lIIlllllIIl(Skills.getLevel(Skill.COOKING), lIllllIl[5])) {
                        int[] iArr = new int[lIllllIl[1]];
                        iArr[lIllllIl[0]] = lIllllIl[6];
                        if (lIIlllllIlI(Bank.contains(iArr) ? 1 : 0)) {
                            ag();
                            System.out.println(lIllllII[lIllllIl[7]]);
                            bz = lIllllIl[1];
                            return;
                        }
                    }
                    if (lIIllllllIl(Skills.getLevel(Skill.COOKING), lIllllIl[5]) && lIIlllllIIl(Skills.getLevel(Skill.COOKING), lIllllIl[8])) {
                        int[] iArr2 = new int[lIllllIl[1]];
                        iArr2[lIllllIl[0]] = lIllllIl[9];
                        if (lIIlllllIlI(Bank.contains(iArr2) ? 1 : 0)) {
                            ag();
                            System.out.println(lIllllII[lIllllIl[10]]);
                            bz = lIllllIl[1];
                            return;
                        }
                    }
                    if (lIIllllllIl(Skills.getLevel(Skill.COOKING), lIllllIl[8])) {
                        int[] iArr3 = new int[lIllllIl[1]];
                        iArr3[lIllllIl[0]] = lIllllIl[11];
                        if (lIIlllllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                            ag();
                            System.out.println(lIllllII[lIllllIl[12]]);
                            bz = lIllllIl[1];
                            return;
                        }
                    }
                    int[] iArr4 = new int[lIllllIl[1]];
                    iArr4[lIllllIl[0]] = lIllllIl[13];
                    if (lIIlllllIlI(Equipment.contains(iArr4) ? 1 : 0) && lIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(iT), lIllllIl[14])) {
                        C0000a.b(C0005f.aT, lIllllIl[1]);
                        Time.sleepTicks(lIllllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIllllIl[1]];
                            iArr5[lIllllIl[0]] = lIllllIl[13];
                            if (lIIllllllII(Inventory.getCount(iArr5))) {
                                ?? r0 = lIllllIl[1];
                                "".length();
                                return (-"   ".length()) >= 0 ? ((((9 + 77) - (-97)) + 8) ^ (((164 + 117) - 242) + 134)) & (((125 ^ 36) ^ (15 ^ 68)) ^ (-" ".length())) : r0;
                            }
                            return lIllllIl[0];
                        }, lIllllIl[4]);
                        "".length();
                    }
                    if (lIIlllllIIl(Skills.getLevel(Skill.COOKING), lIllllIl[5])) {
                        Bank.withdrawAll(lIllllIl[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIllllIl[1]];
                            iArr5[lIllllIl[0]] = lIllllIl[6];
                            if (lIIllllllII(Inventory.getCount(iArr5))) {
                                ?? r0 = lIllllIl[1];
                                "".length();
                                return !((true ^ true) ^ (true ^ true)) ? ((((229 + 222) - 239) + 18) ^ (((68 + 139) - 91) + 46)) & (((((164 + 55) - 131) + 152) ^ (((121 + 65) - 173) + 167)) ^ (-" ".length())) : r0;
                            }
                            return lIllllIl[0];
                        }, lIllllIl[4]);
                        "".length();
                    }
                    if (lIIllllllIl(Skills.getLevel(Skill.COOKING), lIllllIl[5]) && lIIlllllIIl(Skills.getLevel(Skill.COOKING), lIllllIl[8])) {
                        Bank.withdrawAll(lIllllIl[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIllllIl[1]];
                            iArr5[lIllllIl[0]] = lIllllIl[9];
                            if (lIIllllllII(Inventory.getCount(iArr5))) {
                                ?? r0 = lIllllIl[1];
                                "".length();
                                return "   ".length() <= 0 ? ((((216 + 194) - 350) + 164) ^ (((56 + 119) - 69) + 23)) & (((35 ^ 29) ^ (12 ^ 83)) ^ (-" ".length())) : r0;
                            }
                            return lIllllIl[0];
                        }, lIllllIl[4]);
                        "".length();
                    }
                    if (lIIllllllIl(Skills.getLevel(Skill.COOKING), lIllllIl[8])) {
                        Bank.withdrawAll(lIllllIl[11], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllllIl[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIllllIl[1]];
                            iArr5[lIllllIl[0]] = lIllllIl[11];
                            if (lIIllllllII(Inventory.getCount(iArr5))) {
                                ?? r0 = lIllllIl[1];
                                "".length();
                                return (-"   ".length()) >= 0 ? ((((134 + 80) - 139) + 70) ^ (((150 + 53) - 55) + 5)) & (((((24 + 127) - 140) + 171) ^ (((28 + 35) - (-72)) + 55)) ^ (-" ".length())) : r0;
                            }
                            return lIllllIl[0];
                        }, lIllllIl[4]);
                        "".length();
                    }
                }
            }
            if (lIIlllllIII(ac() ? 1 : 0)) {
                int[] iArr5 = new int[lIllllIl[1]];
                iArr5[lIllllIl[0]] = lIllllIl[13];
                if (lIIlllllIII(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIllllIl[1]];
                    iArr6[lIllllIl[0]] = lIllllIl[13];
                    if (lIIlllllIlI(Equipment.contains(iArr6) ? 1 : 0)) {
                        AccBuilderBarrows.c = lIllllII[lIllllIl[15]];
                        int[] iArr7 = new int[lIllllIl[1]];
                        iArr7[lIllllIl[0]] = lIllllIl[13];
                        Item first = Inventory.getFirst(iArr7);
                        if (lIIlllllIll(first)) {
                            first.interact(lIllllII[lIllllIl[16]]);
                            Time.sleepTicks(lIllllIl[3]);
                            "".length();
                        }
                    }
                }
                if (lIIlllllllI(Players.getLocal().getWorldLocation().distanceTo(iT), lIllllIl[10])) {
                    AccBuilderBarrows.c = lIllllII[lIllllIl[17]];
                    Movement.walkTo(iT);
                    "".length();
                    Time.sleepTicks(lIllllIl[7]);
                    "".length();
                }
                if (lIIllllllll(Players.getLocal().getWorldLocation().distanceTo(iT), lIllllIl[10])) {
                    AccBuilderBarrows.c = lIllllII[lIllllIl[18]];
                    WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                    String[] strArr = new String[lIllllIl[1]];
                    strArr[lIllllIl[0]] = lIllllII[lIllllIl[19]];
                    TileObject nearest2 = TileObjects.getNearest(worldLocation, strArr);
                    if (lIIlllllIll(nearest2)) {
                        if (lIIlllllIlI(Production.isOpen() ? 1 : 0)) {
                            nearest2.interact(lIllllII[lIllllIl[20]]);
                            Time.sleepTicks(lIllllIl[2]);
                            "".length();
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, lIllllIl[4]);
                            "".length();
                        }
                        if (lIIlllllIII(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption(lIllllIl[1]);
                            Time.sleepTicks(lIllllIl[7]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (!lIIlllllIII(ac() ? 1 : 0) || lIIlllllIII(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIllllIl[1];
                                    "".length();
                                    return 0 != 0 ? ((141 ^ 158) ^ (118 ^ 47)) & (((((58 + 83) - 130) + 191) ^ (((24 + 119) - 89) + 74)) ^ (-" ".length())) : r0;
                                }
                                return lIllllIl[0];
                            }, lIllllIl[21]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIlllllIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lIllllIl[0];
    }

    private static boolean lIIlllllllI(int i, int i2) {
        return i > i2;
    }

    private static void lIIllllIlll() {
        lIllllIl = new int[42];
        lIllllIl[0] = (222 ^ 191) & ((162 ^ 195) ^ (-1));
        lIllllIl[1] = " ".length();
        lIllllIl[2] = "  ".length();
        lIllllIl[3] = "   ".length();
        lIllllIl[4] = (-25652) & 30651;
        lIllllIl[5] = (188 ^ 176) ^ "   ".length();
        lIllllIl[6] = (-(((22 + 30) - (-121)) + 22)) & (-2049) & 2559;
        lIllllIl[7] = (194 ^ 178) ^ (105 ^ 29);
        lIllllIl[8] = 137 ^ 151;
        lIllllIl[9] = (-((-5475) & 16243)) & (-4129) & 15231;
        lIllllIl[10] = 120 ^ 125;
        lIllllIl[11] = (-((-16485) & 26869)) & (-4609) & 15351;
        lIllllIl[12] = (94 ^ 34) ^ (250 ^ 128);
        lIllllIl[13] = (-((-20492) & 22031)) & (-4101) & 8191;
        lIllllIl[14] = 154 ^ 131;
        lIllllIl[15] = (((170 + 15) - 180) + 173) ^ (((150 + 60) - 96) + 67);
        lIllllIl[16] = 35 ^ 43;
        lIllllIl[17] = 64 ^ 73;
        lIllllIl[18] = 151 ^ 157;
        lIllllIl[19] = 130 ^ 137;
        lIllllIl[20] = (((152 + 111) - 142) + 56) ^ (((136 + 154) - 109) + 8);
        lIllllIl[21] = (-((-16617) & 17146)) & (-1) & 65529;
        lIllllIl[22] = ((175 + 59) - 164) + 180;
        lIllllIl[23] = (-19650) & 19949;
        lIllllIl[24] = (-((-4477) & 23933)) & (-4098) & 24053;
        lIllllIl[25] = (((((106 + 70) - 114) + 100) + (((38 + 125) - 106) + 112)) - (((136 + 27) - (-14)) + 25)) + (45 ^ 106);
        lIllllIl[26] = 52 ^ 32;
        lIllllIl[27] = (-(96 ^ 105)) & (-6145) & 8152;
        lIllllIl[28] = (-((-1730) & 18165)) & (-257) & 28671;
        lIllllIl[29] = (-6725) & 31724;
        lIllllIl[30] = (-8209) & 16215;
        lIllllIl[31] = (36 ^ 20) ^ (165 ^ 189);
        lIllllIl[32] = (-((-2561) & 23163)) & (-9217) & 30718;
        lIllllIl[33] = (20 ^ 49) ^ (81 ^ 16);
        lIllllIl[34] = (((89 + 76) - 80) + 55) ^ (((56 + 58) - 89) + 104);
        lIllllIl[35] = 47 ^ 76;
        lIllllIl[36] = (((11 + 24) - (-61)) + 65) ^ (((32 + 120) - 103) + 126);
        lIllllIl[37] = (-((-17669) & 30527)) & (-16385) & 32511;
        lIllllIl[38] = (-389) & 3556;
        lIllllIl[39] = (-((-4355) & 29463)) & (-4353) & 32732;
        lIllllIl[40] = (-((-15441) & 32724)) & (-8209) & 28671;
        lIllllIl[41] = 35 ^ 51;
    }

    private static String lIIllllIlIl(String lIlIllIlllIllII, String lIlIllIlllIllIl) {
        try {
            SecretKeySpec lIlIllIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIlllIllIl.getBytes(StandardCharsets.UTF_8)), lIllllIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllIl[2], lIlIllIllllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIllIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIlllIllll) {
            lIlIllIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIlI(int i) {
        return i == 0;
    }

    private static String lIIllllIlII(String lIlIllIlllllIll, String lIlIllIlllllIlI) {
        try {
            SecretKeySpec lIlIllIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIllllllIl = Cipher.getInstance("Blowfish");
            lIlIllIllllllIl.init(lIllllIl[2], lIlIllIlllllllI);
            return new String(lIlIllIllllllIl.doFinal(Base64.getDecoder().decode(lIlIllIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIllllllII) {
            lIlIllIllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlllllIll(Object obj) {
        return obj != null;
    }

    private static String lIIllllIIll(String lIlIlllIIIlIIII, String lIlIlllIIIIllll) {
        String lIlIlllIIIlIIII2 = new String(Base64.getDecoder().decode(lIlIlllIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIlllIIIIllll.toCharArray();
        int lIlIlllIIIIllII = lIllllIl[0];
        char[] charArray2 = lIlIlllIIIlIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIllllIl[0];
        while (lIIlllllIIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lIlIlllIIIIllII % charArray.length]));
            "".length();
            lIlIlllIIIIllII++;
            i++;
            "".length();
            if (((155 ^ 196) & ((5 ^ 90) ^ (-1))) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lIllllII[lIllllIl[34]];
    }

    private static void lIIllllIllI() {
        lIllllII = new String[lIllllIl[41]];
        lIllllII[lIllllIl[0]] = lIIllllIIll("CjIVLhsvZwUzECU0", "HGlGu");
        lIllllII[lIllllIl[1]] = lIIllllIlII("lzi1VfbIBhzuLkEMGwYDnbuHVWr3wIW/xqm0Z/TQ9DKBOZpGmla8x0CQgqbWJwMrCMBSfW26fvI=", "qqNRN");
        lIllllII[lIllllIl[2]] = lIIllllIIll("HCIQBB0zNw8DHXI3CU0YMy0N", "RCfmz");
        lIllllII[lIllllIl[3]] = lIIllllIlIl("AwfxE7lGqkqRogZGxreBfnsUSAv3vb6H", "pTUoI");
        lIllllII[lIllllIl[7]] = lIIllllIlIl("9KjRj27cnSATjg/zaeoDPNkf0eTzAp5GLxAnud9axYC+nFfqeefuBdbWMxs+MKKt", "RgoLG");
        lIllllII[lIllllIl[10]] = lIIllllIIll("ISBlMQcTZSg5BgUsKzdVBTA1IBkfIDZ8VQUyLCQWHiwrN1UCKmUSIC8MCxc=", "vEEPu");
        lIllllII[lIllllIl[12]] = lIIllllIlIl("j4LTMSuGJ/iypNvAnUeBNvjmjH9Lsca6iYaePZrU3GhcAdW0Bde9KV+BCqUsknyu", "qiYnN");
        lIllllII[lIllllIl[15]] = lIIllllIlIl("UA4V7EHCg/nPn5wHEEItTg==", "wNOjM");
        lIllllII[lIllllIl[16]] = lIIllllIIll("HCMgAQ==", "KFAsl");
        lIllllII[lIllllIl[17]] = lIIllllIlIl("DlxActSxYsII/f72Wogg2oUUn11m1vZ5", "uDiRD");
        lIllllII[lIllllIl[18]] = lIIllllIIll("ATYBET4sPg==", "BYnzW");
        lIllllII[lIllllIl[19]] = lIIllllIlII("GgsXjsGIP2w=", "Ukcsv");
        lIllllII[lIllllIl[20]] = lIIllllIlII("QRfx3DQirxs=", "dNwYG");
        lIllllII[lIllllIl[34]] = lIIllllIlIl("OHHdENgy8aM=", "mAEzm");
        lIllllII[lIllllIl[36]] = lIIllllIlII("yD6w25/MfVV/fXEULPuMuoU/A4LkxACS", "XIeBb");
        lIllllII[lIllllIl[5]] = lIIllllIlIl("ya61D3n13S6VVdundTWppqf0tBoW53Gd", "SjEcd");
    }

    private static boolean lIIllllllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIllllllII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    private static boolean ac() {
        if (lIIllllllIl(Skills.getLevel(Skill.COOKING), lIllllIl[8])) {
            int[] iArr = new int[lIllllIl[1]];
            iArr[lIllllIl[0]] = lIllllIl[11];
            if (lIIllllllII(Inventory.getCount(iArr))) {
                ?? r0 = lIllllIl[1];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllllIl[0];
        } else if (lIIllllllIl(Skills.getLevel(Skill.COOKING), lIllllIl[5]) && lIIlllllIIl(Skills.getLevel(Skill.COOKING), lIllllIl[8])) {
            int[] iArr2 = new int[lIllllIl[1]];
            iArr2[lIllllIl[0]] = lIllllIl[9];
            if (lIIllllllII(Inventory.getCount(iArr2))) {
                ?? r02 = lIllllIl[1];
                "".length();
                return (-(106 ^ 111)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
            }
            return lIllllIl[0];
        } else {
            int[] iArr3 = new int[lIllllIl[1]];
            iArr3[lIllllIl[0]] = lIllllIl[6];
            if (lIIllllllII(Inventory.getCount(iArr3))) {
                ?? r03 = lIllllIl[1];
                "".length();
                return ((4 ^ 31) ^ (190 ^ 161)) <= "   ".length() ? ((42 ^ 73) ^ (242 ^ 171)) & (((94 ^ 78) ^ (133 ^ 175)) ^ (-" ".length())) : r03;
            }
            return lIllllIl[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIIllllllIl(Skills.getLevel(Skill.COOKING), lIllllIl[35])) {
            ?? r0 = lIllllIl[1];
            "".length();
            return " ".length() < 0 ? ((((6 + 205) - 166) + 189) ^ (((110 + 48) - 79) + 57)) & (((23 ^ 30) ^ (231 ^ 140)) ^ (-" ".length())) : r0;
        }
        return lIllllIl[0];
    }

    static {
        lIIllllIlll();
        lIIllllIllI();
        iQ = lIllllIl[9];
        iP = lIllllIl[6];
        iR = lIllllIl[11];
        iS = new WorldPoint(lIllllIl[37], lIllllIl[38], lIllllIl[0]);
        iT = new WorldPoint(lIllllIl[39], lIllllIl[40], lIllllIl[0]);
        bB = new ArrayList();
    }
}
