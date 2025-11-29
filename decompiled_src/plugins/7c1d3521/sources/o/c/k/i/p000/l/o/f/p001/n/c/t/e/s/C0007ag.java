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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ag  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ag.class */
public class C0007ag implements InterfaceC0003ac {
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ String[] llIlIllIIl;
    public static final /* synthetic */ int nc;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIlIllIlI;
    public static final /* synthetic */ int nd;

    private static String lIllIlIIIIlll(String llllllllllllllllllIIIllIlIIlIlll, String llllllllllllllllllIIIllIlIIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIllIlI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIllIlIIllIII) {
            llllllllllllllllllIIIllIlIIllIII.printStackTrace();
            return null;
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlIllIIl[llIlIllIlI[44]];
    }

    private static void lIllIlIIIlIlI() {
        llIlIllIlI = new int[47];
        llIlIllIlI[0] = ((41 ^ 31) ^ (34 ^ 78)) & (((4 ^ 104) ^ (63 ^ 9)) ^ (-" ".length()));
        llIlIllIlI[1] = " ".length();
        llIlIllIlI[2] = 140 ^ 180;
        llIlIllIlI[3] = (-((-4327) & 28927)) & (-6145) & 31739;
        llIlIllIlI[4] = "  ".length();
        llIlIllIlI[5] = "   ".length();
        llIlIllIlI[6] = (-((-276) & 10551)) & (-81) & 15355;
        llIlIllIlI[7] = 85 ^ 81;
        llIlIllIlI[8] = (-22545) & 24319;
        llIlIllIlI[9] = (-16391) & 18175;
        llIlIllIlI[10] = (((51 + 170) - 96) + 57) ^ (((34 + 115) - 79) + 109);
        llIlIllIlI[11] = 171 ^ 173;
        llIlIllIlI[12] = 43 ^ 44;
        llIlIllIlI[13] = 36 ^ 44;
        llIlIllIlI[14] = (-7502) & 65501;
        llIlIllIlI[15] = 70 ^ 74;
        llIlIllIlI[16] = 185 ^ 176;
        llIlIllIlI[17] = 158 ^ 191;
        llIlIllIlI[18] = (71 ^ 38) ^ (23 ^ 124);
        llIlIllIlI[19] = 60 ^ 55;
        llIlIllIlI[20] = 136 ^ 162;
        llIlIllIlI[21] = (96 ^ 116) ^ (89 ^ 64);
        llIlIllIlI[22] = 115 ^ 93;
        llIlIllIlI[23] = 66 ^ 76;
        llIlIllIlI[24] = 20 ^ 27;
        llIlIllIlI[25] = 107 ^ 90;
        llIlIllIlI[26] = 141 ^ 157;
        llIlIllIlI[27] = 131 ^ 146;
        llIlIllIlI[28] = 8 ^ 95;
        llIlIllIlI[29] = (245 ^ 139) ^ (251 ^ 151);
        llIlIllIlI[30] = (((105 + 48) - 132) + 127) ^ (((4 + 84) - 18) + 65);
        llIlIllIlI[31] = 24 ^ 12;
        llIlIllIlI[32] = 72 ^ 93;
        llIlIllIlI[33] = 169 ^ 191;
        llIlIllIlI[34] = (-((-787) & 23379)) & (-129) & 24570;
        llIlIllIlI[35] = (((198 + 110) - 263) + 189) ^ (((50 + 16) - (-10)) + 56);
        llIlIllIlI[36] = (((61 + 99) - 125) + 124) ^ (((88 + 2) - 41) + 87);
        llIlIllIlI[37] = (-18438) & 24047;
        llIlIllIlI[38] = (-4130) & 16109;
        llIlIllIlI[39] = (-4165) & 29164;
        llIlIllIlI[40] = (-8361) & 16367;
        llIlIllIlI[41] = 132 ^ 172;
        llIlIllIlI[42] = (-31842) & 32741;
        llIlIllIlI[43] = 44 ^ 72;
        llIlIllIlI[44] = 222 ^ 198;
        llIlIllIlI[45] = 48 ^ 41;
        llIlIllIlI[46] = 56 ^ 34;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIllIlI[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
        if (lIllIlIIIlllI(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018c, code lost:
        if (lIllIlIIlIIII(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0007ag.llIlIllIlI[1]) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cb, code lost:
        if (lIllIlIIIllII(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0007ag.llIlIllIlI[1]) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ce, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0007ag.llIlIllIIl[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0007ag.llIlIllIlI[10]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0007ag.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0007ag.llIlIllIlI[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e9, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v271, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void fi() {
        if (lIllIlIIIlIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[0]];
            C0015b.a(bv);
            if (lIllIlIIIllII(bv.size(), llIlIllIlI[1])) {
                System.out.println(llIlIllIIl[llIlIllIlI[1]]);
                bt = llIlIllIlI[0];
            }
        }
        if (lIllIlIIIllIl(bt ? 1 : 0) && lIllIlIIIllII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[2])) {
            if (lIllIlIIIlIll(an() ? 1 : 0)) {
                int[] iArr = new int[llIlIllIlI[1]];
                iArr[llIlIllIlI[0]] = llIlIllIlI[3];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (lIllIlIIIllll(nearest) && lIllIlIIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[4]];
                C0000a.a(nearest);
            }
            if (lIllIlIIIllll(nearest) && lIllIlIIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIllIlIIIllIl(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[5]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIllIlI[6]);
                    "".length();
                }
                if (lIllIlIIIlIll(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[7]];
                    if (lIllIlIIIlllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llIlIllIlI[5]);
                        "".length();
                    }
                    if (lIllIlIIIlllI(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(llIlIllIlI[4]);
                        "".length();
                    }
                    int[] iArr2 = new int[llIlIllIlI[1]];
                    iArr2[llIlIllIlI[0]] = llIlIllIlI[8];
                    if (lIllIlIIIllIl(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llIlIllIlI[1]];
                        iArr3[llIlIllIlI[0]] = llIlIllIlI[8];
                    }
                    int[] iArr4 = new int[llIlIllIlI[1]];
                    iArr4[llIlIllIlI[0]] = llIlIllIlI[9];
                    if (lIllIlIIIllIl(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIlIllIlI[1]];
                        iArr5[llIlIllIlI[0]] = llIlIllIlI[9];
                    }
                    int[] iArr6 = new int[llIlIllIlI[1]];
                    iArr6[llIlIllIlI[0]] = llIlIllIlI[9];
                    if (lIllIlIIIlIll(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIlIllIlI[1]];
                        iArr7[llIlIllIlI[0]] = llIlIllIlI[9];
                        if (lIllIlIIIllII(Inventory.getCount(iArr7), llIlIllIlI[1])) {
                            Bank.withdraw(llIlIllIlI[9], llIlIllIlI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIlIllIlI[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr8 = new int[llIlIllIlI[1]];
                                iArr8[llIlIllIlI[0]] = llIlIllIlI[9];
                                if (lIllIlIIIlllI(Inventory.getCount(iArr8))) {
                                    ?? r0 = llIlIllIlI[1];
                                    "".length();
                                    return "   ".length() < (-" ".length()) ? ((66 ^ 126) ^ (178 ^ 193)) & (((225 ^ 129) ^ (166 ^ 137)) ^ (-" ".length())) : r0;
                                }
                                return llIlIllIlI[0];
                            }, llIlIllIlI[6]);
                            "".length();
                        }
                    }
                    int[] iArr8 = new int[llIlIllIlI[1]];
                    iArr8[llIlIllIlI[0]] = llIlIllIlI[8];
                    if (lIllIlIIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[llIlIllIlI[1]];
                        iArr9[llIlIllIlI[0]] = llIlIllIlI[8];
                        if (lIllIlIIIllII(Inventory.getCount(iArr9), llIlIllIlI[1])) {
                            int[] iArr10 = new int[llIlIllIlI[1]];
                            iArr10[llIlIllIlI[0]] = llIlIllIlI[9];
                            if (lIllIlIIIlllI(Inventory.getCount(iArr10))) {
                                Bank.withdrawAll(llIlIllIlI[8], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIlIllIlI[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr11 = new int[llIlIllIlI[1]];
                                    iArr11[llIlIllIlI[0]] = llIlIllIlI[8];
                                    if (lIllIlIIIlllI(Inventory.getCount(iArr11))) {
                                        ?? r0 = llIlIllIlI[1];
                                        "".length();
                                        return 0 != 0 ? ((((135 + 78) - 86) + 84) ^ (((57 + 132) - 150) + 95)) & (((((53 + 149) - 16) + 44) ^ (((40 + 111) - 20) + 48)) ^ (-" ".length())) : r0;
                                    }
                                    return llIlIllIlI[0];
                                }, llIlIllIlI[6]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIllIlIIIlIll(an() ? 1 : 0)) {
                if (lIllIlIIIlIll(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIllIlIIIllIl(Bank.isOpen() ? 1 : 0) && lIllIlIIIllIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[11]];
                    if (lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIllIlIIIllIl(Production.isOpen() ? 1 : 0)) {
                        Time.sleepTicks(llIlIllIlI[4]);
                        "".length();
                        int[] iArr11 = new int[llIlIllIlI[1]];
                        iArr11[llIlIllIlI[0]] = llIlIllIlI[9];
                        Item first = Inventory.getFirst(iArr11);
                        int[] iArr12 = new int[llIlIllIlI[1]];
                        iArr12[llIlIllIlI[0]] = llIlIllIlI[8];
                        Item first2 = Inventory.getFirst(iArr12);
                        if (lIllIlIIIllll(first) && lIllIlIIIllll(first2)) {
                            first.useOn(first2);
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, llIlIllIlI[6]);
                            "".length();
                        }
                    }
                    if (lIllIlIIIlIll(Production.isOpen() ? 1 : 0)) {
                        if (lIllIlIIIllII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[7])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[12]];
                            Production.chooseOption(llIlIllIIl[llIlIllIlI[13]]);
                            Time.sleepTicks(llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIlIllIlI[1]];
                                iArr13[llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!lIllIlIIlIIII(Inventory.getCount(iArr13), llIlIllIlI[1]) || lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIlIllIlI[1];
                                    "".length();
                                    return " ".length() >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIllIlI[0];
                            }, llIlIllIlI[14]);
                            "".length();
                        }
                        if (lIllIlIIlIIII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[7]) && lIllIlIIIllII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[15])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[16]];
                            Production.chooseOption(llIlIllIlI[4]);
                            Time.sleepTicks(llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIlIllIlI[1]];
                                iArr13[llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!lIllIlIIlIIII(Inventory.getCount(iArr13), llIlIllIlI[1]) || lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIlIllIlI[1];
                                    "".length();
                                    return 0 != 0 ? ((65 ^ 53) ^ (218 ^ 148)) & (((95 ^ 59) ^ (199 ^ 153)) ^ (-" ".length())) : r0;
                                }
                                return llIlIllIlI[0];
                            }, llIlIllIlI[14]);
                            "".length();
                        }
                        if (lIllIlIIlIIII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[15]) && lIllIlIIIllII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[17])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[18]];
                            Production.chooseOption(llIlIllIIl[llIlIllIlI[19]]);
                            Time.sleepTicks(llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIlIllIlI[1]];
                                iArr13[llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!lIllIlIIlIIII(Inventory.getCount(iArr13), llIlIllIlI[1]) || lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIlIllIlI[1];
                                    "".length();
                                    return ((((77 + 19) - 49) + 144) ^ (((109 + 39) - 143) + 182)) < " ".length() ? ((165 ^ 148) ^ (79 ^ 36)) & (((105 ^ 9) ^ (35 ^ 25)) ^ (-" ".length())) : r0;
                                }
                                return llIlIllIlI[0];
                            }, llIlIllIlI[14]);
                            "".length();
                        }
                        if (lIllIlIIlIIII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[17]) && lIllIlIIIllII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[20])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[15]];
                            Production.chooseOption(llIlIllIIl[llIlIllIlI[21]]);
                            Time.sleepTicks(llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIlIllIlI[1]];
                                iArr13[llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!lIllIlIIlIIII(Inventory.getCount(iArr13), llIlIllIlI[1]) || lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIlIllIlI[1];
                                    "".length();
                                    return (-" ".length()) >= "  ".length() ? ((((82 + 107) - 121) + 113) ^ (((44 + 98) - 114) + 117)) & (((((12 + 92) - 67) + 99) ^ (((43 + 66) - 93) + 156)) ^ (-" ".length())) : r0;
                                }
                                return llIlIllIlI[0];
                            }, llIlIllIlI[14]);
                            "".length();
                        }
                        if (lIllIlIIlIIII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[20]) && lIllIlIIIllII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[22])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[23]];
                            Production.chooseOption(llIlIllIIl[llIlIllIlI[24]]);
                            Time.sleepTicks(llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIlIllIlI[1]];
                                iArr13[llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!lIllIlIIlIIII(Inventory.getCount(iArr13), llIlIllIlI[1]) || lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIlIllIlI[1];
                                    "".length();
                                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIllIlI[0];
                            }, llIlIllIlI[14]);
                            "".length();
                        }
                        if (lIllIlIIlIIII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[22]) && lIllIlIIIllII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[25])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[26]];
                            Production.chooseOption(llIlIllIIl[llIlIllIlI[27]]);
                            Time.sleepTicks(llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIlIllIlI[1]];
                                iArr13[llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!lIllIlIIlIIII(Inventory.getCount(iArr13), llIlIllIlI[1]) || lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIlIllIlI[1];
                                    "".length();
                                    return (((((143 + 123) - 143) + 28) ^ (((28 + 116) - 4) + 3)) & (((114 ^ 24) ^ (217 ^ 171)) ^ (-" ".length()))) != 0 ? ((((55 + 1) - (-67)) + 8) ^ (((96 + 125) - 132) + 46)) & (((((61 + 57) - 61) + 75) ^ (((38 + 127) - 46) + 9)) ^ (-" ".length())) : r0;
                                }
                                return llIlIllIlI[0];
                            }, llIlIllIlI[14]);
                            "".length();
                        }
                        if (lIllIlIIlIIII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[25]) && lIllIlIIIllII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[28])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[29]];
                            Production.chooseOption(llIlIllIIl[llIlIllIlI[30]]);
                            Time.sleepTicks(llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIlIllIlI[1]];
                                iArr13[llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!lIllIlIIlIIII(Inventory.getCount(iArr13), llIlIllIlI[1]) || lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIlIllIlI[1];
                                    "".length();
                                    return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIllIlI[0];
                            }, llIlIllIlI[14]);
                            "".length();
                        }
                        if (lIllIlIIlIIII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[28])) {
                            AccBuilderSotf.c = llIlIllIIl[llIlIllIlI[31]];
                            Production.chooseOption(llIlIllIIl[llIlIllIlI[32]]);
                            Time.sleepTicks(llIlIllIlI[11]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr13 = new int[llIlIllIlI[1]];
                                iArr13[llIlIllIlI[0]] = llIlIllIlI[8];
                                if (!lIllIlIIlIIII(Inventory.getCount(iArr13), llIlIllIlI[1]) || lIllIlIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIlIllIlI[1];
                                    "".length();
                                    return (((232 ^ 148) ^ (21 ^ 33)) & (((((2 + 212) - 1) + 3) ^ (((77 + 79) - 86) + 74)) ^ (-" ".length()))) > 0 ? ((211 ^ 181) ^ (75 ^ 121)) & (((204 ^ 154) ^ "  ".length()) ^ (-" ".length())) : r0;
                                }
                                return llIlIllIlI[0];
                            }, llIlIllIlI[14]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        fi();
        return llIlIllIlI[43];
    }

    private static String lIllIlIIIIllI(String llllllllllllllllllIIIllIlIlIllII, String llllllllllllllllllIIIllIlIlIlIll) {
        String llllllllllllllllllIIIllIlIlIllII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIIllIlIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIllIlIlIlIlI = new StringBuilder();
        char[] charArray = llllllllllllllllllIIIllIlIlIlIll.toCharArray();
        int llllllllllllllllllIIIllIlIlIlIII = llIlIllIlI[0];
        char[] charArray2 = llllllllllllllllllIIIllIlIlIllII2.toCharArray();
        int length = charArray2.length;
        int i = llIlIllIlI[0];
        while (lIllIlIIIllII(i, length)) {
            char llllllllllllllllllIIIllIlIlIllIl = charArray2[i];
            llllllllllllllllllIIIllIlIlIlIlI.append((char) (llllllllllllllllllIIIllIlIlIllIl ^ charArray[llllllllllllllllllIIIllIlIlIlIII % charArray.length]));
            "".length();
            llllllllllllllllllIIIllIlIlIlIII++;
            i++;
            "".length();
            if ("   ".length() <= ((245 ^ 199) & ((111 ^ 93) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIIllIlIlIlIlI);
    }

    private static boolean lIllIlIIlIIII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean an() {
        int[] iArr = new int[llIlIllIlI[1]];
        iArr[llIlIllIlI[0]] = llIlIllIlI[8];
        if (lIllIlIIIlllI(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[llIlIllIlI[1]];
            iArr2[llIlIllIlI[0]] = llIlIllIlI[9];
            if (lIllIlIIIlllI(Inventory.getCount(iArr2))) {
                ?? r0 = llIlIllIlI[1];
                "".length();
                return "   ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llIlIllIlI[0];
    }

    private static boolean lIllIlIIIllIl(int i) {
        return i == 0;
    }

    static {
        lIllIlIIIlIlI();
        lIllIlIIIlIIl();
        nc = llIlIllIlI[8];
        nd = llIlIllIlI[9];
        bv = new ArrayList();
    }

    public static void Q() {
        int[] iArr = new int[llIlIllIlI[1]];
        iArr[llIlIllIlI[0]] = llIlIllIlI[8];
        if (lIllIlIIIllIl(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println(llIlIllIIl[llIlIllIlI[33]]);
            bv.add(new C0017d(llIlIllIlI[8], llIlIllIlI[34], llIlIllIlI[35]));
            "".length();
        }
        int[] iArr2 = new int[llIlIllIlI[1]];
        iArr2[llIlIllIlI[0]] = llIlIllIlI[9];
        if (lIllIlIIIllIl(Bank.contains(iArr2) ? 1 : 0)) {
            System.out.println(llIlIllIIl[llIlIllIlI[36]]);
            bv.add(new C0017d(llIlIllIlI[9], llIlIllIlI[1], llIlIllIlI[37]));
            "".length();
        }
        if (lIllIlIIIllIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIllIIl[llIlIllIlI[45]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIlIllIlI[38], llIlIllIlI[10], llIlIllIlI[39]));
            "".length();
        }
        int[] iArr3 = new int[llIlIllIlI[1]];
        iArr3[llIlIllIlI[0]] = llIlIllIlI[40];
        if (lIllIlIIIllIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIlIllIlI[40], llIlIllIlI[41], llIlIllIlI[42]));
            "".length();
        }
    }

    private static boolean lIllIlIIIllll(Object obj) {
        return obj != null;
    }

    private static void lIllIlIIIlIIl() {
        llIlIllIIl = new String[llIlIllIlI[46]];
        llIlIllIIl[llIlIllIlI[0]] = lIllIlIIIIllI("IRcbIRcEQgs8HA4R", "cbbHy");
        llIlIllIIl[llIlIllIlI[1]] = lIllIlIIIIllI("PA0rCwsSASFCGg8dLAwfWg0xBxUJSGURDxMQJgoRFANlABkZD2UWF1oHNwMeDg0rBQ==", "zdEbx");
        llIlIllIIl[llIlIllIlI[4]] = lIllIlIIIIllI("FzgGBgI4LRkBAnktH08HODcb", "YYpoe");
        llIlIllIIl[llIlIllIlI[5]] = lIllIlIIIIlll("sdZwwS5E0Vu+zr1Blv5rGg==", "BDAry");
        llIlIllIIl[llIlIllIlI[7]] = lIllIlIIIIlll("jUtERWewRzKNpvkVmChluucxS3qeevAC", "MvKmg");
        llIlIllIIl[llIlIllIlI[10]] = lIllIlIIIIlll("4D8hS+kqd65hRBt1RUic72q1wvk1FGmJOIyYBcr9I/czIWZuM88M0pJbf1pg2hLM", "XYUsv");
        llIlIllIIl[llIlIllIlI[11]] = lIllIlIIIlIII("g/OLAT3qiOViYcva8GUQkg==", "zdEfG");
        llIlIllIIl[llIlIllIlI[12]] = lIllIlIIIIlll("93SJv8pJ/jFn9JXcdiUQWA==", "ZCnXb");
        llIlIllIIl[llIlIllIlI[13]] = lIllIlIIIlIII("RIzlaxgiWDaXv/GXvaQuAg==", "NLoDQ");
        llIlIllIIl[llIlIllIlI[16]] = lIllIlIIIIllI("BTo2DgMvJjBIFCcmMwQSZiQ2BgMjOjk=", "FHWhw");
        llIlIllIIl[llIlIllIlI[18]] = lIllIlIIIIllI("AjstPCYoJyt6PiAkPA==", "AILZR");
        llIlIllIIl[llIlIllIlI[19]] = lIllIlIIIIlll("j7028K+vddVe3u9NY8SfjA==", "jcKWU");
        llIlIllIIl[llIlIllIlI[15]] = lIllIlIIIlIII("IPMzg/ewcBXhHnVxcsxwAA==", "gneDT");
        llIlIllIIl[llIlIllIlI[21]] = lIllIlIIIIllI("DxM3CA==", "YzVdE");
        llIlIllIIl[llIlIllIlI[23]] = lIllIlIIIIlll("O4tcoNQPzPpzPP3owY1En1a/jqgNBOpI", "aSQUf");
        llIlIllIIl[llIlIllIlI[24]] = lIllIlIIIIlll("UZzvZbbdNdXvNz6lCKB22Q==", "pihlL");
        llIlIllIIl[llIlIllIlI[26]] = lIllIlIIIIllI("BDMrHDcuLy1aLDUj", "GAJzC");
        llIlIllIIl[llIlIllIlI[27]] = lIllIlIIIIlll("QSjiGOwInag0bsE1TRbdvRxepVZDqE87", "UCRfG");
        llIlIllIIl[llIlIllIlI[29]] = lIllIlIIIlIII("j53mW8p802t0BfTpbYQMpA==", "oeVIx");
        llIlIllIIl[llIlIllIlI[30]] = lIllIlIIIlIII("XrY8R0LDT6X4ER41q6dhkg==", "kOIOM");
        llIlIllIIl[llIlIllIlI[31]] = lIllIlIIIIlll("ZTzS5XfWQZ+rXNjEPnmaTx7jyF4/QfEh", "qUSww");
        llIlIllIIl[llIlIllIlI[32]] = lIllIlIIIlIII("rv25vEXy/VkE8waOIOo0FQ==", "QykMc");
        llIlIllIIl[llIlIllIlI[33]] = lIllIlIIIlIII("oVu873G6fdud0bbS4Ga5sbfdy1O8ZOxv", "tIskT");
        llIlIllIIl[llIlIllIlI[36]] = lIllIlIIIIllI("MSYQLjcUcw4rOAAgCys2BDoHIHkDOhki", "sSiGY");
        llIlIllIIl[llIlIllIlI[44]] = lIllIlIIIIlll("5Pbl1Ac2TkWxE44hFmXEgQ==", "FKALU");
        llIlIllIIl[llIlIllIlI[45]] = lIllIlIIIIllI("FxoBInoKFU8yPwQfGy16TQ==", "esoEZ");
    }

    private static String lIllIlIIIlIII(String llllllllllllllllllIIIllIlIllllII, String llllllllllllllllllIIIllIlIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllIlIlllIll.getBytes(StandardCharsets.UTF_8)), llIlIllIlI[13]), "DES");
            Cipher llllllllllllllllllIIIllIlIlllllI = Cipher.getInstance("DES");
            llllllllllllllllllIIIllIlIlllllI.init(llIlIllIlI[4], secretKeySpec);
            return new String(llllllllllllllllllIIIllIlIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIllIlIllllIl) {
            llllllllllllllllllIIIllIlIllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIIlllI(int i) {
        return i > 0;
    }

    private static boolean lIllIlIIIlIll(int i) {
        return i != 0;
    }

    private static boolean lIllIlIIIllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIlIIlIIII(Skills.getLevel(Skill.CRAFTING), llIlIllIlI[2])) {
            ?? r0 = llIlIllIlI[1];
            "".length();
            return ((208 ^ 199) ^ (127 ^ 109)) <= 0 ? ((83 ^ 119) ^ (136 ^ 149)) & (((((44 + 127) - 99) + 64) ^ (((106 + 59) - 97) + 109)) ^ (-" ".length())) : r0;
        }
        return llIlIllIlI[0];
    }
}
