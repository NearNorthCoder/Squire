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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.P  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/P.class */
public class P implements G {
    public static final /* synthetic */ int jj;
    private static /* synthetic */ int[] lIIllllIll;
    private static /* synthetic */ String[] lIIllllIlI;
    public static final /* synthetic */ WorldPoint jl;
    public static final /* synthetic */ int jk;
    public static final /* synthetic */ WorldPoint jm;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int ji;
    public static /* synthetic */ List<C0003d> bv;

    private static String lIIIIlIllIIlI(String llllllllllllllllllllIlllIllIlIII, String llllllllllllllllllllIlllIllIIlll) {
        String llllllllllllllllllllIlllIllIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllllllllIlllIllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllllIlllIllIIlIl = llllllllllllllllllllIlllIllIIlll.toCharArray();
        int llllllllllllllllllllIlllIllIIlII = lIIllllIll[0];
        char[] charArray = llllllllllllllllllllIlllIllIlIII2.toCharArray();
        int length = charArray.length;
        int i = lIIllllIll[0];
        while (lIIIIlIlllIII(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllllllIlllIllIIlIl[llllllllllllllllllllIlllIllIIlII % llllllllllllllllllllIlllIllIIlIl.length]));
            "".length();
            llllllllllllllllllllIlllIllIIlII++;
            i++;
            "".length();
            if ((-" ".length()) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIIIlIllIlII(String llllllllllllllllllllIlllIllllIII, String llllllllllllllllllllIlllIlllIlll) {
        try {
            SecretKeySpec llllllllllllllllllllIlllIllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlllIlllIlll.getBytes(StandardCharsets.UTF_8)), lIIllllIll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllllIll[2], llllllllllllllllllllIlllIllllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlllIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIlllIllllIIl) {
            llllllllllllllllllllIlllIllllIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v197, types: [boolean] */
    public static void cL() {
        if (lIIIIlIllIlll(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIllllIlI[lIIllllIll[0]];
            C0001b.a(bv);
            if (lIIIIlIlllIII(bv.size(), lIIllllIll[1])) {
                System.out.println(lIIllllIlI[lIIllllIll[1]]);
                bt = lIIllllIll[0];
            }
        }
        if (lIIIIlIlllIIl(bt ? 1 : 0)) {
            if (lIIIIlIlllIIl(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIlIlllIlI(nearest) && lIIIIlIlllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllllIlI[lIIllllIll[2]];
                    C0000a.a(nearest);
                }
                if (lIIIIlIlllIlI(nearest) && lIIIIlIllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllllIlI[lIIllllIll[3]];
                    if (lIIIIlIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIllllIll[4]);
                        "".length();
                    }
                    if (lIIIIlIllIlll(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIIlIlllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIllllIll[1]);
                            "".length();
                        }
                        if (lIIIIlIlllIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIllllIll[2]);
                            "".length();
                        }
                    }
                    if (lIIIIlIlllIII(Skills.getLevel(Skill.COOKING), lIIllllIll[5])) {
                        int[] iArr = new int[lIIllllIll[1]];
                        iArr[lIIllllIll[0]] = lIIllllIll[6];
                        if (lIIIIlIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIllllIlI[lIIllllIll[7]]);
                            bt = lIIllllIll[1];
                            return;
                        }
                    }
                    if (lIIIIlIllllII(Skills.getLevel(Skill.COOKING), lIIllllIll[5]) && lIIIIlIlllIII(Skills.getLevel(Skill.COOKING), lIIllllIll[8])) {
                        int[] iArr2 = new int[lIIllllIll[1]];
                        iArr2[lIIllllIll[0]] = lIIllllIll[9];
                        if (lIIIIlIlllIIl(Bank.contains(iArr2) ? 1 : 0)) {
                            af();
                            System.out.println(lIIllllIlI[lIIllllIll[10]]);
                            bt = lIIllllIll[1];
                            return;
                        }
                    }
                    if (lIIIIlIllllII(Skills.getLevel(Skill.COOKING), lIIllllIll[8])) {
                        int[] iArr3 = new int[lIIllllIll[1]];
                        iArr3[lIIllllIll[0]] = lIIllllIll[11];
                        if (lIIIIlIlllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                            af();
                            System.out.println(lIIllllIlI[lIIllllIll[12]]);
                            bt = lIIllllIll[1];
                            return;
                        }
                    }
                    int[] iArr4 = new int[lIIllllIll[1]];
                    iArr4[lIIllllIll[0]] = lIIllllIll[13];
                    if (lIIIIlIlllIIl(Equipment.contains(iArr4) ? 1 : 0) && lIIIIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(jm), lIIllllIll[14])) {
                        C0000a.b(C0005f.aN, lIIllllIll[1]);
                        Time.sleepTicks(lIIllllIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIIllllIll[1]];
                            iArr5[lIIllllIll[0]] = lIIllllIll[13];
                            if (lIIIIlIlllIll(Inventory.getCount(iArr5))) {
                                ?? r0 = lIIllllIll[1];
                                "".length();
                                return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIllllIll[0];
                        }, lIIllllIll[4]);
                        "".length();
                    }
                    if (lIIIIlIlllIII(Skills.getLevel(Skill.COOKING), lIIllllIll[5])) {
                        Bank.withdrawAll(lIIllllIll[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIllllIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIIllllIll[1]];
                            iArr5[lIIllllIll[0]] = lIIllllIll[6];
                            if (lIIIIlIlllIll(Inventory.getCount(iArr5))) {
                                ?? r0 = lIIllllIll[1];
                                "".length();
                                return "  ".length() < 0 ? ((((209 + 142) - 228) + 100) ^ (((141 + 130) - 263) + 187)) & (((((162 + 129) - 141) + 23) ^ (((58 + 93) - 78) + 104)) ^ (-" ".length())) : r0;
                            }
                            return lIIllllIll[0];
                        }, lIIllllIll[4]);
                        "".length();
                    }
                    if (lIIIIlIllllII(Skills.getLevel(Skill.COOKING), lIIllllIll[5]) && lIIIIlIlllIII(Skills.getLevel(Skill.COOKING), lIIllllIll[8])) {
                        Bank.withdrawAll(lIIllllIll[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIllllIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIIllllIll[1]];
                            iArr5[lIIllllIll[0]] = lIIllllIll[9];
                            if (lIIIIlIlllIll(Inventory.getCount(iArr5))) {
                                ?? r0 = lIIllllIll[1];
                                "".length();
                                return "  ".length() == ((102 ^ 77) & ((78 ^ 101) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIllllIll[0];
                        }, lIIllllIll[4]);
                        "".length();
                    }
                    if (lIIIIlIllllII(Skills.getLevel(Skill.COOKING), lIIllllIll[8])) {
                        Bank.withdrawAll(lIIllllIll[11], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIllllIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIIllllIll[1]];
                            iArr5[lIIllllIll[0]] = lIIllllIll[11];
                            if (lIIIIlIlllIll(Inventory.getCount(iArr5))) {
                                ?? r0 = lIIllllIll[1];
                                "".length();
                                return 0 != 0 ? ((33 ^ 42) ^ (111 ^ 59)) & (((40 ^ 88) ^ (118 ^ 89)) ^ (-" ".length())) : r0;
                            }
                            return lIIllllIll[0];
                        }, lIIllllIll[4]);
                        "".length();
                    }
                }
            }
            if (lIIIIlIllIlll(ab() ? 1 : 0)) {
                int[] iArr5 = new int[lIIllllIll[1]];
                iArr5[lIIllllIll[0]] = lIIllllIll[13];
                if (lIIIIlIllIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIllllIll[1]];
                    iArr6[lIIllllIll[0]] = lIIllllIll[13];
                    if (lIIIIlIlllIIl(Equipment.contains(iArr6) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllllIlI[lIIllllIll[15]];
                        int[] iArr7 = new int[lIIllllIll[1]];
                        iArr7[lIIllllIll[0]] = lIIllllIll[13];
                        Item first = Inventory.getFirst(iArr7);
                        if (lIIIIlIlllIlI(first)) {
                            first.interact(lIIllllIlI[lIIllllIll[16]]);
                            Time.sleepTicks(lIIllllIll[3]);
                            "".length();
                        }
                    }
                }
                if (lIIIIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(jm), lIIllllIll[10])) {
                    AccBuilderRogues.c = lIIllllIlI[lIIllllIll[17]];
                    Movement.walkTo(jm);
                    "".length();
                    Time.sleepTicks(lIIllllIll[7]);
                    "".length();
                }
                if (lIIIIlIlllllI(Players.getLocal().getWorldLocation().distanceTo(jm), lIIllllIll[10])) {
                    AccBuilderRogues.c = lIIllllIlI[lIIllllIll[18]];
                    WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                    String[] strArr = new String[lIIllllIll[1]];
                    strArr[lIIllllIll[0]] = lIIllllIlI[lIIllllIll[19]];
                    TileObject nearest2 = TileObjects.getNearest(worldLocation, strArr);
                    if (lIIIIlIlllIlI(nearest2)) {
                        if (lIIIIlIlllIIl(Production.isOpen() ? 1 : 0)) {
                            nearest2.interact(lIIllllIlI[lIIllllIll[20]]);
                            Time.sleepTicks(lIIllllIll[2]);
                            "".length();
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, lIIllllIll[4]);
                            "".length();
                        }
                        if (lIIIIlIllIlll(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption(lIIllllIll[1]);
                            Time.sleepTicks(lIIllllIll[7]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (!lIIIIlIllIlll(ab() ? 1 : 0) || lIIIIlIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIllllIll[1];
                                    "".length();
                                    return (((187 ^ 141) ^ (0 ^ 120)) & (((152 ^ 161) ^ (44 ^ 91)) ^ (-" ".length()))) == "   ".length() ? ((((83 + 182) - 144) + 104) ^ (((57 + 13) - 25) + 83)) & (((33 ^ 101) ^ (181 ^ 144)) ^ (-" ".length())) : r0;
                                }
                                return lIIllllIll[0];
                            }, lIIllllIll[21]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static void af() {
        if (lIIIIlIlllIII(Skills.getLevel(Skill.COOKING), lIIllllIll[5])) {
            bv.add(new C0003d(lIIllllIll[6], lIIllllIll[22], lIIllllIll[23]));
            "".length();
        }
        if (lIIIIlIllllII(Skills.getLevel(Skill.COOKING), lIIllllIll[5]) && lIIIIlIlllIII(Skills.getLevel(Skill.COOKING), lIIllllIll[8])) {
            bv.add(new C0003d(lIIllllIll[9], lIIllllIll[24], lIIllllIll[25]));
            "".length();
        }
        if (lIIIIlIllllII(Skills.getLevel(Skill.COOKING), lIIllllIll[8])) {
            bv.add(new C0003d(lIIllllIll[11], lIIllllIll[24], lIIllllIll[25]));
            "".length();
        }
        if (lIIIIlIlllIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIllllIlI[lIIllllIll[5]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIll[13], lIIllllIll[26], lIIllllIll[27]));
            "".length();
        }
        if (lIIIIlIlllIIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIllllIlI[lIIllllIll[36]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIll[28], lIIllllIll[10], lIIllllIll[29]));
            "".length();
        }
        int[] iArr = new int[lIIllllIll[1]];
        iArr[lIIllllIll[0]] = lIIllllIll[30];
        if (lIIIIlIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIllllIll[30], lIIllllIll[31], lIIllllIll[32]));
            "".length();
        }
    }

    private static boolean lIIIIlIlllIII(int i, int i2) {
        return i < i2;
    }

    private static void lIIIIlIllIllI() {
        lIIllllIll = new int[42];
        lIIllllIll[0] = (92 ^ 2) & ((74 ^ 20) ^ (-1));
        lIIllllIll[1] = " ".length();
        lIIllllIll[2] = "  ".length();
        lIIllllIll[3] = "   ".length();
        lIIllllIll[4] = (-((-3638) & 28279)) & (-1045) & 30685;
        lIIllllIll[5] = 178 ^ 189;
        lIIllllIll[6] = (-8193) & 8509;
        lIIllllIll[7] = 60 ^ 56;
        lIIllllIll[8] = 191 ^ 161;
        lIIllllIll[9] = (-((-1475) & 13811)) & (-1) & 12671;
        lIIllllIll[10] = 45 ^ 40;
        lIIllllIll[11] = (-3089) & 3447;
        lIIllllIll[12] = 184 ^ 190;
        lIIllllIll[13] = (-24581) & 27132;
        lIIllllIll[14] = (97 ^ 59) ^ (246 ^ 181);
        lIIllllIll[15] = 58 ^ 61;
        lIIllllIll[16] = (129 ^ 147) ^ (139 ^ 145);
        lIIllllIll[17] = 8 ^ 1;
        lIIllllIll[18] = (17 ^ 3) ^ (8 ^ 16);
        lIIllllIll[19] = 54 ^ 61;
        lIIllllIll[20] = (114 ^ 71) ^ (143 ^ 182);
        lIIllllIll[21] = (-(116 ^ 112)) & (-533) & 65535;
        lIIllllIll[22] = ((245 + 182) - 237) + 60;
        lIIllllIll[23] = (-30803) & 31102;
        lIIllllIll[24] = (-26635) & 27134;
        lIIllllIll[25] = ((79 + 145) - 180) + 156;
        lIIllllIll[26] = (99 ^ 37) ^ (109 ^ 63);
        lIIllllIll[27] = (-12291) & 14290;
        lIIllllIll[28] = (-34) & 12013;
        lIIllllIll[29] = (-((-8613) & 15868)) & (-1) & 32255;
        lIIllllIll[30] = (-((-19659) & 27867)) & (-16521) & 32735;
        lIIllllIll[31] = 66 ^ 106;
        lIIllllIll[32] = (-((-22845) & 32061)) & (-18521) & 28636;
        lIIllllIll[33] = (12 ^ 39) ^ (83 ^ 28);
        lIIllllIll[34] = 161 ^ 172;
        lIIllllIll[35] = 255 ^ 156;
        lIIllllIll[36] = 29 ^ 19;
        lIIllllIll[37] = (-((-10573) & 15231)) & (-24585) & 32511;
        lIIllllIll[38] = (-((-17509) & 22399)) & (-129) & 8186;
        lIIllllIll[39] = (-28705) & 31976;
        lIIllllIll[40] = (-((-4417) & 13121)) & (-16516) & 28399;
        lIIllllIll[41] = 65 ^ 81;
    }

    private static boolean lIIIIlIlllllI(int i, int i2) {
        return i <= i2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIllllIlI[lIIllllIll[34]];
    }

    private static boolean lIIIIlIlllIll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    private static boolean ab() {
        if (lIIIIlIllllII(Skills.getLevel(Skill.COOKING), lIIllllIll[8])) {
            int[] iArr = new int[lIIllllIll[1]];
            iArr[lIIllllIll[0]] = lIIllllIll[11];
            if (lIIIIlIlllIll(Inventory.getCount(iArr))) {
                ?? r0 = lIIllllIll[1];
                "".length();
                return (56 ^ 60) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllllIll[0];
        } else if (lIIIIlIllllII(Skills.getLevel(Skill.COOKING), lIIllllIll[5]) && lIIIIlIlllIII(Skills.getLevel(Skill.COOKING), lIIllllIll[8])) {
            int[] iArr2 = new int[lIIllllIll[1]];
            iArr2[lIIllllIll[0]] = lIIllllIll[9];
            if (lIIIIlIlllIll(Inventory.getCount(iArr2))) {
                ?? r02 = lIIllllIll[1];
                "".length();
                return " ".length() < ((98 ^ 62) & ((235 ^ 183) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r02;
            }
            return lIIllllIll[0];
        } else {
            int[] iArr3 = new int[lIIllllIll[1]];
            iArr3[lIIllllIll[0]] = lIIllllIll[6];
            if (lIIIIlIlllIll(Inventory.getCount(iArr3))) {
                ?? r03 = lIIllllIll[1];
                "".length();
                return (" ".length() & (" ".length() ^ (-" ".length()))) == " ".length() ? ((((62 + 90) - (-41)) + 43) ^ (((183 + 67) - 171) + 108)) & (((39 ^ 119) ^ (89 ^ 94)) ^ (-" ".length())) : r03;
            }
            return lIIllllIll[0];
        }
    }

    private static boolean lIIIIlIllllII(int i, int i2) {
        return i >= i2;
    }

    private static void lIIIIlIllIlIl() {
        lIIllllIlI = new String[lIIllllIll[41]];
        lIIllllIlI[lIIllllIll[0]] = lIIIIlIllIIlI("ExM/DCU2Ri8RLjwV", "QfFeK");
        lIIllllIlI[lIIllllIll[1]] = lIIIIlIllIIlI("NgQnPDkYCC11KAUUIDstUAQ9MCcDQWkmPRkZKj0jHgppNysTBmkhJVAOJjohGQMu", "pmIUJ");
        lIIllllIlI[lIIllllIll[2]] = lIIIIlIllIIlI("CxQALTMkAR8qM2UBGWQ2JBsd", "EuvDT");
        lIIllllIlI[lIIllllIll[3]] = lIIIIlIllIIll("j7PTqLqkn8M+GSWHnI7hnCeVJvI+tTd1", "HDBRf");
        lIIllllIlI[lIIllllIll[7]] = lIIIIlIllIIlI("HS16LxcvaDcnFjkhNClFOT0qPgkjLSliRTk/MzoGIiE0KUU+J3oMMBMBFAk=", "JHZNe");
        lIIllllIlI[lIIllllIll[10]] = lIIIIlIllIIll("8BWZwLxeX/PlWKA1rGT5/VRggXb4AqehYGy9MDXM+KygX/UJzBBeQcMx9LkiLLXU", "vvYaI");
        lIIllllIlI[lIIllllIll[12]] = lIIIIlIllIIll("z20QJ0IwvMhfJAp2OK9XKdqh21ThjgVS74NfYmBN/Z8k+ZywbXOGvrySP4JqUXgd", "gHjKk");
        lIIllllIlI[lIIllllIll[15]] = lIIIIlIllIIlI("NikPBhcaNh1PAwY9Fg==", "sXzog");
        lIIllllIlI[lIIllllIll[16]] = lIIIIlIllIIll("szWdrsj1xG4=", "EYrqs");
        lIIllllIlI[lIIllllIll[17]] = lIIIIlIllIlII("nvot4riaO+W81MCH4U+w9oK4PMqqKire", "iZKpg");
        lIIllllIlI[lIIllllIll[18]] = lIIIIlIllIIlI("Mj84CRgfNw==", "qPWbq");
        lIIllllIlI[lIIllllIll[19]] = lIIIIlIllIlII("JNgNPaffcfg=", "tpthz");
        lIIllllIlI[lIIllllIll[20]] = lIIIIlIllIIlI("GhU8Hw==", "YzSts");
        lIIllllIlI[lIIllllIll[34]] = lIIIIlIllIlII("UvKN1wbyTY8=", "WxlRJ");
        lIIllllIlI[lIIllllIll[36]] = lIIIIlIllIIll("KA39Hk5/GKUSMV5slFqWeXAE8O9cWs28", "CNouS");
        lIIllllIlI[lIIllllIll[5]] = lIIIIlIllIIll("LhAEIFlPBcGW+wSv1ph6aEsE42Xpf8Va", "toCEc");
    }

    private static boolean lIIIIlIlllIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIlIllllII(Skills.getLevel(Skill.COOKING), lIIllllIll[35])) {
            ?? r0 = lIIllllIll[1];
            "".length();
            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllllIll[0];
    }

    private static boolean lIIIIlIllllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIIlIlllIIl(int i) {
        return i == 0;
    }

    static {
        lIIIIlIllIllI();
        lIIIIlIllIlIl();
        ji = lIIllllIll[6];
        jk = lIIllllIll[11];
        jj = lIIllllIll[9];
        jl = new WorldPoint(lIIllllIll[37], lIIllllIll[38], lIIllllIll[0]);
        jm = new WorldPoint(lIIllllIll[39], lIIllllIll[40], lIIllllIll[0]);
        bv = new ArrayList();
    }

    private static boolean lIIIIlIllIlll(int i) {
        return i != 0;
    }

    private static String lIIIIlIllIIll(String llllllllllllllllllllIllllIIIIlIl, String llllllllllllllllllllIllllIIIIIlI) {
        try {
            SecretKeySpec llllllllllllllllllllIllllIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIllllIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllllIll[2], llllllllllllllllllllIllllIIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIllllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIllllIIIIllI) {
            llllllllllllllllllllIllllIIIIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIllllIll[0];
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        cL();
        return lIIllllIll[33];
    }
}
