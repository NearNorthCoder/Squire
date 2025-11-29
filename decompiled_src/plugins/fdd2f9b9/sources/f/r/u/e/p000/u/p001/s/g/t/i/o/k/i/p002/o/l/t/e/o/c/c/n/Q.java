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
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.Q  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/Q.class */
public class Q implements G {
    public static final /* synthetic */ int jo;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIIIllIlII;
    public static final /* synthetic */ int jn;
    private static /* synthetic */ String[] lIIIllIIll;
    public static /* synthetic */ List<C0003d> bv;

    private static boolean lllIllllIIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (lllIllllIlII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017a, code lost:
        if (lllIllllIllI(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.Q.lIIIllIlII[1]) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
        if (lllIllllIIlI(net.unethicalite.api.items.Inventory.getCount(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.Q.lIIIllIlII[1]) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bc, code lost:
        af();
        java.lang.System.out.println(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.Q.lIIIllIIll[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.Q.lIIIllIlII[9]]);
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.Q.bt = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.Q.lIIIllIlII[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d7, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v268, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cT() {
        if (lllIllllIIIl(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[0]];
            C0001b.a(bv);
            if (lllIllllIIlI(bv.size(), lIIIllIlII[1])) {
                System.out.println(lIIIllIIll[lIIIllIlII[1]]);
                bt = lIIIllIlII[0];
            }
        }
        if (lllIllllIIll(bt ? 1 : 0)) {
            if (lllIllllIIIl(ab() ? 1 : 0)) {
                int[] iArr = new int[lIIIllIlII[1]];
                iArr[lIIIllIlII[0]] = lIIIllIlII[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (lllIllllIlIl(nearest) && lllIllllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[3]];
                C0000a.a(nearest);
            }
            if (lllIllllIlIl(nearest) && lllIllllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lllIllllIIll(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIllIlII[5]);
                    "".length();
                }
                if (lllIllllIIIl(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[6]];
                    if (lllIllllIlII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIIIllIlII[4]);
                        "".length();
                    }
                    if (lllIllllIlII(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lIIIllIlII[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[lIIIllIlII[1]];
                    iArr2[lIIIllIlII[0]] = lIIIllIlII[7];
                    if (lllIllllIIll(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIIllIlII[1]];
                        iArr3[lIIIllIlII[0]] = lIIIllIlII[7];
                    }
                    int[] iArr4 = new int[lIIIllIlII[1]];
                    iArr4[lIIIllIlII[0]] = lIIIllIlII[8];
                    if (lllIllllIIll(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIllIlII[1]];
                        iArr5[lIIIllIlII[0]] = lIIIllIlII[8];
                    }
                    int[] iArr6 = new int[lIIIllIlII[1]];
                    iArr6[lIIIllIlII[0]] = lIIIllIlII[8];
                    if (lllIllllIIIl(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIIllIlII[1]];
                        iArr7[lIIIllIlII[0]] = lIIIllIlII[8];
                        if (lllIllllIIlI(Inventory.getCount(iArr7), lIIIllIlII[1])) {
                            Bank.withdraw(lIIIllIlII[8], lIIIllIlII[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIIllIlII[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr8 = new int[lIIIllIlII[1]];
                                iArr8[lIIIllIlII[0]] = lIIIllIlII[8];
                                if (lllIllllIlII(Inventory.getCount(iArr8))) {
                                    ?? r0 = lIIIllIlII[1];
                                    "".length();
                                    return (-" ".length()) >= "   ".length() ? ((192 ^ 166) ^ (79 ^ 62)) & (((((20 + 38) - (-82)) + 14) ^ (((46 + 64) - 9) + 40)) ^ (-" ".length())) : r0;
                                }
                                return lIIIllIlII[0];
                            }, lIIIllIlII[5]);
                            "".length();
                        }
                    }
                    int[] iArr8 = new int[lIIIllIlII[1]];
                    iArr8[lIIIllIlII[0]] = lIIIllIlII[7];
                    if (lllIllllIIIl(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lIIIllIlII[1]];
                        iArr9[lIIIllIlII[0]] = lIIIllIlII[7];
                        if (lllIllllIIlI(Inventory.getCount(iArr9), lIIIllIlII[1])) {
                            int[] iArr10 = new int[lIIIllIlII[1]];
                            iArr10[lIIIllIlII[0]] = lIIIllIlII[8];
                            if (lllIllllIlII(Inventory.getCount(iArr10))) {
                                Bank.withdrawAll(lIIIllIlII[7], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIIllIlII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[lIIIllIlII[1]];
                                    iArr11[lIIIllIlII[0]] = lIIIllIlII[7];
                                    if (lllIllllIlII(Inventory.getCount(iArr11))) {
                                        ?? r0 = lIIIllIlII[1];
                                        "".length();
                                        return (((175 ^ 184) ^ (100 ^ 127)) & (((55 ^ 113) ^ (92 ^ 22)) ^ (-" ".length()))) == "   ".length() ? ((((54 + 60) - 0) + 77) ^ (((5 + 119) - 16) + 52)) & (((108 ^ 125) ^ (3 ^ 13)) ^ (-" ".length())) : r0;
                                    }
                                    return lIIIllIlII[0];
                                }, lIIIllIlII[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lllIllllIIIl(ab() ? 1 : 0)) {
                if (lllIllllIIIl(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lllIllllIIll(Bank.isOpen() ? 1 : 0) && lllIllllIIll(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[10]];
                    if (lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lllIllllIIll(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks(lIIIllIlII[3]);
                        "".length();
                        int[] iArr11 = new int[lIIIllIlII[1]];
                        iArr11[lIIIllIlII[0]] = lIIIllIlII[8];
                        Item first = Inventory.getFirst(iArr11);
                        int[] iArr12 = new int[lIIIllIlII[1]];
                        iArr12[lIIIllIlII[0]] = lIIIllIlII[7];
                        Item first2 = Inventory.getFirst(iArr12);
                        if (lllIllllIlIl(first) && lllIllllIlIl(first2)) {
                            first.useOn(first2);
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, lIIIllIlII[5]);
                            "".length();
                        }
                    }
                    if (lllIllllIIIl(Production.isOpen() ? 1 : 0)) {
                        if (lllIllllIIlI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[6])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[11]];
                            Production.chooseOption(lIIIllIIll[lIIIllIlII[12]]);
                            Time.sleepTicks(lIIIllIlII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIllIlII[1]];
                                iArr13[lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!lllIllllIllI(Inventory.getCount(iArr13), lIIIllIlII[1]) || lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIllIlII[1];
                                    "".length();
                                    return ((85 ^ 65) & ((112 ^ 100) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIllIlII[0];
                            }, lIIIllIlII[13]);
                            "".length();
                        }
                        if (lllIllllIllI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[6]) && lllIllllIIlI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[14])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[15]];
                            Production.chooseOption(lIIIllIlII[3]);
                            Time.sleepTicks(lIIIllIlII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIllIlII[1]];
                                iArr13[lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!lllIllllIllI(Inventory.getCount(iArr13), lIIIllIlII[1]) || lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIllIlII[1];
                                    "".length();
                                    return " ".length() <= (((((79 + 19) - 30) + 122) ^ (((89 + 13) - (-81)) + 1)) & (((154 ^ 191) ^ (105 ^ 74)) ^ (-" ".length()))) ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
                                }
                                return lIIIllIlII[0];
                            }, lIIIllIlII[13]);
                            "".length();
                        }
                        if (lllIllllIllI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[14]) && lllIllllIIlI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[16])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[17]];
                            Production.chooseOption(lIIIllIIll[lIIIllIlII[18]]);
                            Time.sleepTicks(lIIIllIlII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIllIlII[1]];
                                iArr13[lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!lllIllllIllI(Inventory.getCount(iArr13), lIIIllIlII[1]) || lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIllIlII[1];
                                    "".length();
                                    return 0 != 0 ? ((127 ^ 105) ^ (85 ^ 110)) & (((179 ^ 136) ^ (133 ^ 147)) ^ (-" ".length())) : r0;
                                }
                                return lIIIllIlII[0];
                            }, lIIIllIlII[13]);
                            "".length();
                        }
                        if (lllIllllIllI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[16]) && lllIllllIIlI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[19])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[14]];
                            Production.chooseOption(lIIIllIIll[lIIIllIlII[20]]);
                            Time.sleepTicks(lIIIllIlII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIllIlII[1]];
                                iArr13[lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!lllIllllIllI(Inventory.getCount(iArr13), lIIIllIlII[1]) || lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIllIlII[1];
                                    "".length();
                                    return (-(26 ^ 30)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIllIlII[0];
                            }, lIIIllIlII[13]);
                            "".length();
                        }
                        if (lllIllllIllI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[19]) && lllIllllIIlI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[21])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[22]];
                            Production.chooseOption(lIIIllIIll[lIIIllIlII[23]]);
                            Time.sleepTicks(lIIIllIlII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIllIlII[1]];
                                iArr13[lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!lllIllllIllI(Inventory.getCount(iArr13), lIIIllIlII[1]) || lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIllIlII[1];
                                    "".length();
                                    return (((236 ^ 149) ^ (226 ^ 158)) & (((223 ^ 186) ^ (122 ^ 26)) ^ (-" ".length()))) > 0 ? (((113 ^ 61) & ((105 ^ 37) ^ (-1))) ^ (1 ^ 49)) & (((241 ^ 177) ^ (96 ^ 16)) ^ (-" ".length())) : r0;
                                }
                                return lIIIllIlII[0];
                            }, lIIIllIlII[13]);
                            "".length();
                        }
                        if (lllIllllIllI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[21]) && lllIllllIIlI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[24])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[25]];
                            Production.chooseOption(lIIIllIIll[lIIIllIlII[26]]);
                            Time.sleepTicks(lIIIllIlII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIllIlII[1]];
                                iArr13[lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!lllIllllIllI(Inventory.getCount(iArr13), lIIIllIlII[1]) || lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIllIlII[1];
                                    "".length();
                                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIIllIlII[0];
                            }, lIIIllIlII[13]);
                            "".length();
                        }
                        if (lllIllllIllI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[24]) && lllIllllIIlI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[27])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[28]];
                            Production.chooseOption(lIIIllIIll[lIIIllIlII[29]]);
                            Time.sleepTicks(lIIIllIlII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIllIlII[1]];
                                iArr13[lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!lllIllllIllI(Inventory.getCount(iArr13), lIIIllIlII[1]) || lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIllIlII[1];
                                    "".length();
                                    return (((65 ^ 74) ^ (49 ^ 25)) & (((((75 + 92) - 133) + 94) ^ (((43 + 98) - 65) + 87)) ^ (-" ".length()))) > 0 ? ((((24 + 150) - 155) + 134) ^ (((139 + 104) - 76) + 27)) & (((((17 + 51) - 48) + 192) ^ (((124 + 121) - 193) + 91)) ^ (-" ".length())) : r0;
                                }
                                return lIIIllIlII[0];
                            }, lIIIllIlII[13]);
                            "".length();
                        }
                        if (lllIllllIllI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[27])) {
                            AccBuilderRogues.c = lIIIllIIll[lIIIllIlII[30]];
                            Production.chooseOption(lIIIllIIll[lIIIllIlII[31]]);
                            Time.sleepTicks(lIIIllIlII[10]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[lIIIllIlII[1]];
                                iArr13[lIIIllIlII[0]] = lIIIllIlII[7];
                                if (!lllIllllIllI(Inventory.getCount(iArr13), lIIIllIlII[1]) || lllIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIllIlII[1];
                                    "".length();
                                    return " ".length() != " ".length() ? ((((63 + 193) - 184) + 137) ^ (((40 + 43) - 21) + 81)) & (((((213 + 0) - 137) + 142) ^ (((92 + 75) - 35) + 0)) ^ (-" ".length())) : r0;
                                }
                                return lIIIllIlII[0];
                            }, lIIIllIlII[13]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIIllIlII[0];
    }

    private static boolean lllIllllIlII(int i) {
        return i > 0;
    }

    private static String lllIlllIllII(String llllIllIllI, String llllIllIlIl) {
        try {
            SecretKeySpec llllIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlllIII = Cipher.getInstance("Blowfish");
            llllIlllIII.init(lIIIllIlII[3], llllIlllIIl);
            return new String(llllIlllIII.doFinal(Base64.getDecoder().decode(llllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIllIlll) {
            llllIllIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllIllllIllI(Skills.getLevel(Skill.CRAFTING), lIIIllIlII[44])) {
            ?? r0 = lIIIllIlII[1];
            "".length();
            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIllIlII[0];
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIIllIIll[lIIIllIlII[43]];
    }

    public static void af() {
        int[] iArr = new int[lIIIllIlII[1]];
        iArr[lIIIllIlII[0]] = lIIIllIlII[7];
        if (lllIllllIIll(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println(lIIIllIIll[lIIIllIlII[32]]);
            bv.add(new C0003d(lIIIllIlII[7], lIIIllIlII[33], lIIIllIlII[34]));
            "".length();
        }
        int[] iArr2 = new int[lIIIllIlII[1]];
        iArr2[lIIIllIlII[0]] = lIIIllIlII[8];
        if (lllIllllIIll(Bank.contains(iArr2) ? 1 : 0)) {
            System.out.println(lIIIllIIll[lIIIllIlII[35]]);
            bv.add(new C0003d(lIIIllIlII[8], lIIIllIlII[1], lIIIllIlII[36]));
            "".length();
        }
        if (lllIllllIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIllIIll[lIIIllIlII[45]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllIlII[37], lIIIllIlII[9], lIIIllIlII[38]));
            "".length();
        }
        int[] iArr3 = new int[lIIIllIlII[1]];
        iArr3[lIIIllIlII[0]] = lIIIllIlII[39];
        if (lllIllllIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIllIlII[39], lIIIllIlII[40], lIIIllIlII[41]));
            "".length();
        }
    }

    private static void lllIllllIIII() {
        lIIIllIlII = new int[47];
        lIIIllIlII[0] = ((184 ^ 142) ^ (93 ^ 100)) & (((66 ^ 30) ^ (28 ^ 79)) ^ (-" ".length()));
        lIIIllIlII[1] = " ".length();
        lIIIllIlII[2] = (-30745) & 31739;
        lIIIllIlII[3] = "  ".length();
        lIIIllIlII[4] = "   ".length();
        lIIIllIlII[5] = (-((-65) & 17509)) & (-2067) & 24510;
        lIIIllIlII[6] = (((57 + 1) - (-5)) + 75) ^ (((20 + 25) - 44) + 141);
        lIIIllIlII[7] = (-((-16941) & 25405)) & (-22529) & 32767;
        lIIIllIlII[8] = (-((-1709) & 8111)) & (-24581) & 32767;
        lIIIllIlII[9] = (11 ^ 99) ^ (123 ^ 22);
        lIIIllIlII[10] = (66 ^ 6) ^ (34 ^ 96);
        lIIIllIlII[11] = 153 ^ 158;
        lIIIllIlII[12] = 172 ^ 164;
        lIIIllIlII[13] = (-2407) & 60406;
        lIIIllIlII[14] = 61 ^ 49;
        lIIIllIlII[15] = 92 ^ 85;
        lIIIllIlII[16] = (120 ^ 54) ^ (74 ^ 37);
        lIIIllIlII[17] = 121 ^ 115;
        lIIIllIlII[18] = 202 ^ 193;
        lIIIllIlII[19] = (((107 + 98) - 83) + 10) ^ (((106 + 107) - 106) + 67);
        lIIIllIlII[20] = 82 ^ 95;
        lIIIllIlII[21] = 149 ^ 187;
        lIIIllIlII[22] = (216 ^ 178) ^ (86 ^ 50);
        lIIIllIlII[23] = (154 ^ 184) ^ (172 ^ 129);
        lIIIllIlII[24] = (((47 + 50) - (-12)) + 26) ^ (((23 + 135) - 26) + 50);
        lIIIllIlII[25] = (79 ^ 73) ^ (28 ^ 10);
        lIIIllIlII[26] = (119 ^ 57) ^ (14 ^ 81);
        lIIIllIlII[27] = (34 ^ 54) ^ (25 ^ 90);
        lIIIllIlII[28] = 213 ^ 199;
        lIIIllIlII[29] = 29 ^ 14;
        lIIIllIlII[30] = (66 ^ 40) ^ (37 ^ 91);
        lIIIllIlII[31] = (130 ^ 153) ^ (41 ^ 39);
        lIIIllIlII[32] = (((137 + 51) - 168) + 163) ^ (((4 + 73) - (-24)) + 60);
        lIIIllIlII[33] = (-"  ".length()) & (-14533) & 16383;
        lIIIllIlII[34] = (107 ^ 96) ^ (5 ^ 96);
        lIIIllIlII[35] = 133 ^ 146;
        lIIIllIlII[36] = (-((-1185) & 27814)) & (-529) & 32767;
        lIIIllIlII[37] = (-((-105) & 4473)) & (-16417) & 32764;
        lIIIllIlII[38] = (-1553) & 26552;
        lIIIllIlII[39] = (-24633) & 32639;
        lIIIllIlII[40] = (241 ^ 146) ^ (242 ^ 185);
        lIIIllIlII[41] = (-27753) & 28652;
        lIIIllIlII[42] = (115 ^ 72) ^ (70 ^ 25);
        lIIIllIlII[43] = 166 ^ 190;
        lIIIllIlII[44] = (8 ^ 25) ^ (0 ^ 114);
        lIIIllIlII[45] = (((9 + 146) - 50) + 68) ^ (((36 + 107) - 68) + 105);
        lIIIllIlII[46] = 182 ^ 172;
    }

    private static boolean lllIllllIIIl(int i) {
        return i != 0;
    }

    static {
        lllIllllIIII();
        lllIlllIlllI();
        jo = lIIIllIlII[8];
        jn = lIIIllIlII[7];
        bv = new ArrayList();
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        cT();
        return lIIIllIlII[42];
    }

    private static boolean lllIllllIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean ab() {
        int[] iArr = new int[lIIIllIlII[1]];
        iArr[lIIIllIlII[0]] = lIIIllIlII[7];
        if (lllIllllIlII(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIIllIlII[1]];
            iArr2[lIIIllIlII[0]] = lIIIllIlII[8];
            if (lllIllllIlII(Inventory.getCount(iArr2))) {
                ?? r0 = lIIIllIlII[1];
                "".length();
                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIIIllIlII[0];
    }

    private static String lllIlllIllIl(String llllIIllIIl, String llllIIllIII) {
        String llllIIllIIl2 = new String(Base64.getDecoder().decode(llllIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllIIllIII.toCharArray();
        int llllIIlIlIl = lIIIllIlII[0];
        char[] charArray2 = llllIIllIIl2.toCharArray();
        int length = charArray2.length;
        int llllIIIllIl = lIIIllIlII[0];
        while (lllIllllIIlI(llllIIIllIl, length)) {
            char llllIIllIlI = charArray2[llllIIIllIl];
            sb.append((char) (llllIIllIlI ^ charArray[llllIIlIlIl % charArray.length]));
            "".length();
            llllIIlIlIl++;
            llllIIIllIl++;
            "".length();
            if (((((67 + 96) - 54) + 24) ^ (((28 + 4) - (-59)) + 38)) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIllllIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllIllllIIlI(int i, int i2) {
        return i < i2;
    }

    private static void lllIlllIlllI() {
        lIIIllIIll = new String[lIIIllIlII[46]];
        lIIIllIIll[lIIIllIlII[0]] = lllIlllIlIll("4GK1/Prs0UJvUP7FA/MllQ==", "zfijv");
        lIIIllIIll[lIIIllIlII[1]] = lllIlllIlIll("2oCmAayUCsdtcJwaV/dT13gAoUtE1srs5RMVr7bhdHp2mUwa4TD/aiIiByIfopzSQkspn09MvIg=", "HZDXi");
        lIIIllIIll[lIIIllIlII[3]] = lllIlllIllII("mWCcj2qCVcP8jmygfzw93lyLFfmw6C5+", "YmmdO");
        lIIIllIIll[lIIIllIlII[4]] = lllIlllIlIll("osWbHoxQDb0kx//2rwroiA==", "Qpcgo");
        lIIIllIIll[lIIIllIlII[6]] = lllIlllIlIll("ZOH2DwaxLIAQZjSXRNR0l/W0NI7vsGrg", "fMAXk");
        lIIIllIIll[lIIIllIlII[9]] = lllIlllIllII("Jnj0UGOjvSinqZoy3bC92y+pVVbH5hy+Hsjyp46rdxpHlaw3DkUl0xfd3DySU15g", "SQoxV");
        lIIIllIIll[lIIIllIlII[10]] = lllIlllIllII("5LSvYrgl+tEWYFMe8iopJA==", "bHzbA");
        lIIIllIIll[lIIIllIlII[11]] = lllIlllIllIl("FBsbPyU+Bx15NjsICSo=", "WizYQ");
        lIIIllIIll[lIIIllIlII[12]] = lllIlllIllII("mwf6jNKNZnIwWH+yaalUHg==", "AxjsL");
        lIIIllIIll[lIIIllIlII[15]] = lllIlllIllII("HQh+PcWN3tvynZ0C8zAjYrTTh+5AStO2", "vfXXr");
        lIIIllIIll[lIIIllIlII[17]] = lllIlllIllII("HC46du+8EdyKGk1nKTIAkw==", "VSJyU");
        lIIIllIIll[lIIIllIlII[18]] = lllIlllIllII("OIRVh6fA7YdWvlKXnOzW0w==", "ORnAf");
        lIIIllIIll[lIIIllIlII[14]] = lllIlllIllII("qFniI8f5YWrewXZSVMwBvw==", "EOYwj");
        lIIIllIIll[lIIIllIlII[20]] = lllIlllIlIll("KvbEaDtPcP4=", "dRVAt");
        lIIIllIIll[lIIIllIlII[22]] = lllIlllIllIl("FxwtAyI9ACtFMD0dJAc5IwI=", "TnLeV");
        lIIIllIIll[lIIIllIlII[23]] = lllIlllIllII("04tkeccCu41ftn4JLc3MLQ==", "dwEIA");
        lIIIllIIll[lIIIllIlII[25]] = lllIlllIllIl("Ah8jBRMoAyVDCDMP", "AmBcg");
        lIIIllIIll[lIIIllIlII[26]] = lllIlllIlIll("B2fg4kYP0Nk3wrQ5XL3OaDmF+BM0L+0d", "ROCTV");
        lIIIllIIll[lIIIllIlII[28]] = lllIlllIllIl("GhsNLAYwBwtqHjwHHw==", "YilJr");
        lIIIllIIll[lIIIllIlII[29]] = lllIlllIllIl("BzsWGQg5NFgBCCUp", "KZxmm");
        lIIIllIIll[lIIIllIlII[30]] = lllIlllIlIll("uw0Mj470XXIf8VdSMJy9WZMDIRGA8qrE", "OdFUk");
        lIIIllIIll[lIIIllIlII[31]] = lllIlllIlIll("OL1LXtfnzFeb4CoxSYmOrA==", "yhIGZ");
        lIIIllIIll[lIIIllIlII[32]] = lllIlllIllII("YQ6cWxJ35OjvSXapAL7poCsEXZephZgS", "rMocZ");
        lIIIllIIll[lIIIllIlII[35]] = lllIlllIllII("usIOr/Zzb92j7AdM5NyHFo9YlKO4De3rzRqajCXi3P0=", "xWYOR");
        lIIIllIIll[lIIIllIlII[43]] = lllIlllIlIll("pz8qMtX7FrnbgUQ/Q+uuTw==", "Zlhaw");
        lIIIllIIll[lIIIllIlII[45]] = lllIlllIlIll("gROuIbuhfY/h+dA27iT2ceNfXCsEMabx", "laZNT");
    }

    private static String lllIlllIlIll(String llllIlIlIIl, String llllIlIlIII) {
        try {
            SecretKeySpec llllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIlIII.getBytes(StandardCharsets.UTF_8)), lIIIllIlII[12]), "DES");
            Cipher llllIlIlIll = Cipher.getInstance("DES");
            llllIlIlIll.init(lIIIllIlII[3], llllIlIllII);
            return new String(llllIlIlIll.doFinal(Base64.getDecoder().decode(llllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIlIlIlI) {
            llllIlIlIlI.printStackTrace();
            return null;
        }
    }
}
