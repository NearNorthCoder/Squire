package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.M  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/M.class */
public class M implements G {
    public static /* synthetic */ boolean bu;
    static /* synthetic */ WorldArea bw;
    private static /* synthetic */ int[] lIIlllllll;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ String[] lIIllllllI;
    static /* synthetic */ WorldPoint by;
    static /* synthetic */ WorldPoint bx;
    public static /* synthetic */ boolean bt;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIIIlllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d6, code lost:
        if (lIIIIlllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0268, code lost:
        if (lIIIIlllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x031c, code lost:
        if (lIIIIlllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        if (lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[20])) {
            int[] iArr = new int[lIIlllllll[1]];
            iArr[lIIlllllll[0]] = lIIlllllll[8];
            if (lIIIIlllIIlII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlllllll[1]];
                iArr2[lIIlllllll[0]] = lIIlllllll[12];
                if (lIIIIlllIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlllllll[1]];
                    iArr3[lIIlllllll[0]] = lIIlllllll[10];
                    if (lIIIIlllIIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIlllllll[1]];
                        iArr4[lIIlllllll[0]] = lIIlllllll[13];
                        if (lIIIIlllIIlII(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIlllllll[1]];
                            iArr5[lIIlllllll[0]] = lIIlllllll[19];
                            if (lIIIIlllIIlII(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIlllllll[1]];
                                iArr6[lIIlllllll[0]] = lIIlllllll[47];
                                if (lIIIIlllIIllI(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIlllllll[1]];
                                    iArr7[lIIlllllll[0]] = lIIlllllll[47];
                                }
                                ?? r0 = lIIlllllll[1];
                                "".length();
                                return (4 ^ 0) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return lIIlllllll[0];
        } else if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[20]) && lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7])) {
            int[] iArr8 = new int[lIIlllllll[1]];
            iArr8[lIIlllllll[0]] = lIIlllllll[12];
            if (lIIIIlllIIlII(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIlllllll[1]];
                iArr9[lIIlllllll[0]] = lIIlllllll[10];
                if (lIIIIlllIIlII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlllllll[1]];
                    iArr10[lIIlllllll[0]] = lIIlllllll[13];
                    if (lIIIIlllIIlII(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIlllllll[1]];
                        iArr11[lIIlllllll[0]] = lIIlllllll[15];
                        if (lIIIIlllIIlII(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIlllllll[1]];
                            iArr12[lIIlllllll[0]] = lIIlllllll[47];
                            if (lIIIIlllIIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIlllllll[1]];
                                iArr13[lIIlllllll[0]] = lIIlllllll[47];
                            }
                            ?? r02 = lIIlllllll[1];
                            "".length();
                            return "  ".length() > "  ".length() ? ((32 ^ 65) ^ (6 ^ 73)) & (((13 ^ 120) ^ (75 ^ 16)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIIlllllll[0];
        } else if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7]) && lIIIIlllIIllI(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIIlllllll[1]];
            iArr14[lIIlllllll[0]] = lIIlllllll[21];
            if (lIIIIlllIIllI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIlllllll[1]];
                iArr15[lIIlllllll[0]] = lIIlllllll[21];
            }
            int[] iArr16 = new int[lIIlllllll[1]];
            iArr16[lIIlllllll[0]] = lIIlllllll[23];
            if (lIIIIlllIIlII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIlllllll[1]];
                iArr17[lIIlllllll[0]] = lIIlllllll[37];
                if (lIIIIlllIIlII(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIlllllll[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIIlllllll[0];
        } else if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7]) && lIIIIlllIIlII(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIIlllllll[1]];
            iArr18[lIIlllllll[0]] = lIIlllllll[21];
            if (lIIIIlllIIllI(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIlllllll[1]];
                iArr19[lIIlllllll[0]] = lIIlllllll[21];
            }
            int[] iArr20 = new int[lIIlllllll[1]];
            iArr20[lIIlllllll[0]] = lIIlllllll[15];
            if (lIIIIlllIIlII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIlllllll[1]];
                iArr21[lIIlllllll[0]] = lIIlllllll[22];
                if (lIIIIlllIIlII(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIlllllll[1]];
                    iArr22[lIIlllllll[0]] = lIIlllllll[22];
                    if (lIIIIlllIlIIl(Inventory.getFirst(iArr22).getQuantity(), lIIlllllll[18])) {
                        int[] iArr23 = new int[lIIlllllll[1]];
                        iArr23[lIIlllllll[0]] = lIIlllllll[23];
                        if (lIIIIlllIIlII(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIlllllll[1]];
                            iArr24[lIIlllllll[0]] = lIIlllllll[37];
                            if (lIIIIlllIIlII(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIlllllll[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return lIIlllllll[0];
        } else {
            return lIIlllllll[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v365, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v398, types: [boolean] */
    public static void Y() {
        if (lIIIIlllIIlII(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIllllllI[lIIlllllll[0]];
            C0001b.a(bv);
            if (lIIIIlllIIlIl(bv.size(), lIIlllllll[1])) {
                System.out.println(lIIllllllI[lIIlllllll[1]]);
                bt = lIIlllllll[0];
            }
        }
        if (lIIIIlllIIllI(bt ? 1 : 0)) {
            if (lIIIIlllIIllI(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIlllIIlll(nearest) && lIIIIlllIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[2]];
                    C0000a.a(nearest);
                }
                if (lIIIIlllIIlll(nearest) && lIIIIlllIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[3]];
                    if (lIIIIlllIIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlllllll[4]);
                        "".length();
                        Time.sleepTicks(lIIlllllll[5]);
                        "".length();
                    }
                    if (lIIIIlllIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIIlllIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlllllll[6]);
                            "".length();
                        }
                        while (lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7]) && lIIIIlllIIllI(v.aX() ? 1 : 0)) {
                            v.aV();
                            Time.sleepTicks(lIIlllllll[1]);
                            "".length();
                            "".length();
                            if (" ".length() < 0) {
                                return;
                            }
                        }
                        if (lIIIIlllIIllI(ac() ? 1 : 0)) {
                            af();
                            System.out.println(lIIllllllI[lIIlllllll[6]]);
                            bt = lIIlllllll[1];
                            return;
                        }
                        if (lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7])) {
                            int[] iArr = new int[lIIlllllll[1]];
                            iArr[lIIlllllll[0]] = lIIlllllll[8];
                            if (lIIIIlllIIlII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIlllllll[1]];
                                iArr2[lIIlllllll[0]] = lIIlllllll[8];
                                if (lIIIIlllIIlIl(Inventory.getCount(iArr2), lIIlllllll[1])) {
                                    Bank.withdraw(lIIlllllll[8], lIIlllllll[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIIlllllll[1]];
                                        iArr3[lIIlllllll[0]] = lIIlllllll[8];
                                        if (lIIIIlllIlIII(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIIlllllll[1];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIlllllll[0];
                                    }, lIIlllllll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIIlllllll[1]];
                            iArr3[lIIlllllll[0]] = lIIlllllll[10];
                            if (lIIIIlllIIlII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIlllllll[1]];
                                iArr4[lIIlllllll[0]] = lIIlllllll[10];
                                if (lIIIIlllIIlIl(Inventory.getCount(iArr4), lIIlllllll[1])) {
                                    Bank.withdraw(lIIlllllll[10], lIIlllllll[11], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIIlllllll[1]];
                                        iArr5[lIIlllllll[0]] = lIIlllllll[10];
                                        if (lIIIIlllIlIII(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIIlllllll[1];
                                            "".length();
                                            return 0 != 0 ? ("   ".length() ^ (37 ^ 9)) & (((218 ^ 172) ^ (244 ^ 173)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlllllll[0];
                                    }, lIIlllllll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIIlllllll[1]];
                            iArr5[lIIlllllll[0]] = lIIlllllll[12];
                            if (lIIIIlllIIlII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIlllllll[1]];
                                iArr6[lIIlllllll[0]] = lIIlllllll[12];
                                if (lIIIIlllIIlIl(Inventory.getCount(iArr6), lIIlllllll[1])) {
                                    Bank.withdraw(lIIlllllll[12], lIIlllllll[11], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIIlllllll[1]];
                                        iArr7[lIIlllllll[0]] = lIIlllllll[12];
                                        if (lIIIIlllIlIII(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIIlllllll[1];
                                            "".length();
                                            return " ".length() < ((55 ^ 22) & ((150 ^ 183) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIlllllll[0];
                                    }, lIIlllllll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIIlllllll[1]];
                            iArr7[lIIlllllll[0]] = lIIlllllll[13];
                            if (lIIIIlllIIlII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIlllllll[1]];
                                iArr8[lIIlllllll[0]] = lIIlllllll[13];
                                if (lIIIIlllIIlIl(Inventory.getCount(iArr8), lIIlllllll[1])) {
                                    Bank.withdraw(lIIlllllll[13], lIIlllllll[14], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIIlllllll[1]];
                                        iArr9[lIIlllllll[0]] = lIIlllllll[13];
                                        if (lIIIIlllIlIII(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIIlllllll[1];
                                            "".length();
                                            return ((((45 + 165) - 22) + 6) ^ (((72 + 143) - 158) + 141)) < "  ".length() ? ((76 ^ 7) ^ (91 ^ 95)) & (((21 ^ 9) ^ (72 ^ 27)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlllllll[0];
                                    }, lIIlllllll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIIlllllll[1]];
                            iArr9[lIIlllllll[0]] = lIIlllllll[15];
                            if (lIIIIlllIIlII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIlllllll[1]];
                                iArr10[lIIlllllll[0]] = lIIlllllll[15];
                                if (lIIIIlllIIlIl(Inventory.getCount(iArr10), lIIlllllll[1])) {
                                    Bank.withdraw(lIIlllllll[15], lIIlllllll[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIIlllllll[1]];
                                        iArr11[lIIlllllll[0]] = lIIlllllll[15];
                                        if (lIIIIlllIlIII(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIIlllllll[1];
                                            "".length();
                                            return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIlllllll[0];
                                    }, lIIlllllll[4]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIIlllllll[1]];
                            iArr11[lIIlllllll[0]] = lIIlllllll[16];
                            if (lIIIIlllIIlII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIIlllllll[1]];
                                iArr12[lIIlllllll[0]] = lIIlllllll[16];
                                if (lIIIIlllIIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIIlllllll[16], lIIlllllll[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIIlllllll[1]];
                                        iArr13[lIIlllllll[0]] = lIIlllllll[16];
                                        return Inventory.contains(iArr13);
                                    }, lIIlllllll[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIIlllllll[17], lIIlllllll[18], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIIlllllll[1]];
                            iArr13[lIIlllllll[0]] = lIIlllllll[19];
                            if (lIIIIlllIIlII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIIlllllll[1]];
                                iArr14[lIIlllllll[0]] = lIIlllllll[19];
                                if (lIIIIlllIIlIl(Inventory.getCount(iArr14), lIIlllllll[1]) && lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[20])) {
                                    Bank.withdrawAll(lIIlllllll[19], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlllllll[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIIlllllll[1]];
                                        iArr15[lIIlllllll[0]] = lIIlllllll[19];
                                        if (lIIIIlllIlIII(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIIlllllll[1];
                                            "".length();
                                            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIlllllll[0];
                                    }, lIIlllllll[4]);
                                    "".length();
                                }
                            }
                        }
                        if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7])) {
                            int[] iArr15 = new int[lIIlllllll[1]];
                            iArr15[lIIlllllll[0]] = lIIlllllll[21];
                            if (lIIIIlllIIllI(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIIlllllll[21], lIIlllllll[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIlllllll[1]);
                                "".length();
                            }
                            if (lIIIIlllIIlII(bu ? 1 : 0)) {
                                Bank.withdrawAll(lIIlllllll[22], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIlllllll[1]);
                                "".length();
                                Bank.withdrawAll(lIIlllllll[15], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIlllllll[1]);
                                "".length();
                            }
                            Time.sleepTicks(lIIlllllll[3]);
                            "".length();
                            Bank.withdrawAll(lIIlllllll[23], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIlllllll[1]);
                            "".length();
                            Bank.withdrawAll(lIIlllllll[24], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIIlllllll[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIIIlllIIlII(ab() ? 1 : 0)) {
                if (lIIIIlllIIlII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[20])) {
                    if (lIIIIlllIIllI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllllllI[lIIlllllll[18]];
                        Movement.walkTo(bx);
                        "".length();
                        Time.sleepTicks(lIIlllllll[1]);
                        "".length();
                    }
                    if (lIIIIlllIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllllllI[lIIlllllll[5]];
                        aa();
                    }
                }
                if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[20]) && lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[25])) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[26]];
                    if (lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIIlllllll[1]);
                        "".length();
                    }
                }
                if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[25]) && lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[28])) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[29]];
                    if (lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIIlllllll[1]);
                        "".length();
                    }
                }
                if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[28]) && lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[30])) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[31]];
                    if (lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIIlllllll[1]);
                        "".length();
                    }
                }
                if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[30]) && lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7])) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[32]];
                    if (lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIIlllllll[1]);
                        "".length();
                    }
                }
                if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7])) {
                    AccBuilderRogues.c = lIIllllllI[lIIlllllll[33]];
                    if (lIIIIlllIlIll(by)) {
                        by = new WorldPoint(lIIlllllll[34] + C0004e.c(lIIlllllll[1], lIIlllllll[6]), lIIlllllll[35], lIIlllllll[0]);
                    }
                    int[] iArr16 = new int[lIIlllllll[1]];
                    iArr16[lIIlllllll[0]] = lIIlllllll[21];
                    if (lIIIIlllIIlII(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIlllllll[1]];
                        iArr17[lIIlllllll[0]] = lIIlllllll[21];
                        if (lIIIIlllIIllI(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIIlllllll[1]];
                            iArr18[lIIlllllll[0]] = lIIlllllll[21];
                            Inventory.getFirst(iArr18).interact(lIIllllllI[lIIlllllll[36]]);
                            Time.sleepTicks(lIIlllllll[1]);
                            "".length();
                        }
                    }
                    if (lIIIIlllIIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIIlllllll[1]];
                    iArr19[lIIlllllll[0]] = lIIlllllll[23];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIIlllllll[1]];
                    iArr20[lIIlllllll[0]] = lIIlllllll[37];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIIIIlllIIllI(bu ? 1 : 0) && lIIIIlllIIlll(by)) {
                        if (lIIIIlllIIllI(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIllllllI[lIIlllllll[38]];
                            Movement.walkTo(by);
                            "".length();
                            Time.sleepTicks(lIIlllllll[1]);
                            "".length();
                        }
                        if (lIIIIlllIIlII(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0) && lIIIIlllIIlll(first) && lIIIIlllIIlll(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIIIlllIllll(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIIlllllll[1];
                                    "".length();
                                    return "   ".length() < "   ".length() ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                                }
                                return lIIlllllll[0];
                            }, lIIlllllll[9]);
                            "".length();
                            Time.sleep(C0004e.c(lIIlllllll[39], lIIlllllll[40]));
                            "".length();
                        }
                    }
                    if (lIIIIlllIIlII(bu ? 1 : 0)) {
                        if (lIIIIlllIIlll(first) && lIIIIlllIIlll(first2) && lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIIIlllIllll(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIIlllllll[1];
                                    "".length();
                                    return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIlllllll[0];
                            }, lIIlllllll[9]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIIIIlllIlIlI(Players.getLocal().getAnimation(), lIIlllllll[27])) {
                                ?? r0 = lIIlllllll[1];
                                "".length();
                                return ((1 ^ 12) & ((26 ^ 23) ^ (-1))) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlllllll[0];
                        }, lIIlllllll[41]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lIIIIlllIlIII(int i) {
        return i > 0;
    }

    private static void aa() {
        if (lIIIIlllIllIl(lIIIIlllIllII(C0004e.u(), 30.0d))) {
            int[] iArr = new int[lIIlllllll[1]];
            iArr[lIIlllllll[0]] = lIIlllllll[19];
            if (lIIIIlllIIlII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlllllll[1]];
                iArr2[lIIlllllll[0]] = lIIlllllll[19];
                Inventory.getFirst(iArr2).interact(lIIllllllI[lIIlllllll[44]]);
                Time.sleepTicks(lIIlllllll[1]);
                "".length();
            }
        }
        if (lIIIIlllIlIll(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIIIIlllIIlII(npc.getName().contains(lIIllllllI[lIIlllllll[76]]) ? 1 : 0) && lIIIIlllIIllI(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIIlllllll[1];
                    "".length();
                    return 0 != 0 ? ((220 ^ 149) ^ (45 ^ 77)) & (((((91 + 96) - 80) + 38) ^ (((180 + 103) - 191) + 92)) ^ (-" ".length())) : r0;
                }
                return lIIlllllll[0];
            });
            String[] strArr = new String[lIIlllllll[2]];
            strArr[lIIlllllll[0]] = lIIllllllI[lIIlllllll[45]];
            strArr[lIIlllllll[1]] = lIIllllllI[lIIlllllll[46]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIIIIlllIlllI(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIIlllllll[1];
                    "".length();
                    return (-"   ".length()) >= 0 ? ((156 ^ 143) ^ (206 ^ 131)) & (((((220 + 80) - 96) + 36) ^ (((74 + 81) - 89) + 108)) ^ (-" ".length())) : r0;
                }
                return lIIlllllll[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIIlllllll[1]];
            iArr3[lIIlllllll[0]] = lIIlllllll[47];
            if (lIIIIlllIIlII(Equipment.contains(iArr3) ? 1 : 0) && lIIIIlllIIllI(ad() ? 1 : 0)) {
                ae();
            }
            if (lIIIIlllIIlll(nearest) && lIIIIlllIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lIIllllllI[lIIlllllll[48]]);
                Time.sleepTicks(lIIlllllll[3]);
                "".length();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlllllll[0];
    }

    private static void lIIIIlllIIIlI() {
        lIIllllllI = new String[lIIlllllll[81]];
        lIIllllllI[lIIlllllll[0]] = lIIIIllIlllll("cN+6pgwGpDWomsrOUot+YA==", "LlTXw");
        lIIllllllI[lIIlllllll[1]] = lIIIIlllIIIII("MQElIgkfDS9rGAIRIiUdVwE/LhcERGs4DR4cKCMTGQ9rKRsUA2s/FVcFKiwTFEg/ORseBiIlHQ==", "whKKz");
        lIIllllllI[lIIlllllll[2]] = lIIIIlllIIIIl("JMnwrAtkiQ+Li70om9R8Up4C5iObKVhl", "ERPqu");
        lIIllllllI[lIIlllllll[3]] = lIIIIlllIIIII("DCMlITotLCxlNCUsICw4Iw==", "DBKEV");
        lIIllllllI[lIIlllllll[6]] = lIIIIllIlllll("qzimJkMMBo2K8DCK+w7m7fEvdEMWjvAbajx8kM/GsIrRyZEBWgLUFWOq8ODEj11Q", "vJCTd");
        lIIllllllI[lIIlllllll[18]] = lIIIIllIlllll("nr3/tfhus4KWbQAohX08PQ==", "WuhHe");
        lIIllllllI[lIIlllllll[5]] = lIIIIlllIIIII("AxgeLzUpBQQpdiEDHT0=", "BljNV");
        lIIllllllI[lIIlllllll[26]] = lIIIIlllIIIIl("pxDYMZQFwSOtfIIeqLIK9qtSZxAmASUT", "qRwVS");
        lIIllllllI[lIIlllllll[29]] = lIIIIllIlllll("xm52H2tnsWLtrU4QGrgMaD6jdZnbBGo/", "EGqxv");
        lIIllllllI[lIIlllllll[31]] = lIIIIlllIIIIl("AzUFk8PU+PcwLzvZesdz0kL4OeuQDHZD", "XIraR");
        lIIllllllI[lIIlllllll[32]] = lIIIIlllIIIII("GS8cBhg0KU8REDcjFlIFPyIK", "ZNorq");
        lIIllllllI[lIIlllllll[33]] = lIIIIllIlllll("xKpKDMhlgZA=", "hHBZT");
        lIIllllllI[lIIlllllll[36]] = lIIIIlllIIIII("GCM2LQk=", "OJSAm");
        lIIllllllI[lIIlllllll[38]] = lIIIIllIlllll("Fk3T++awHOw7sdd6oOln7jojvq4z5tVe", "QegwU");
        lIIllllllI[lIIlllllll[42]] = lIIIIlllIIIII("HBY6RRI9Vy8KESE=", "RwLef");
        lIIllllllI[lIIlllllll[43]] = lIIIIllIlllll("CQT9yxRGa3buPdtFuDdYcQ==", "fXBUC");
        lIIllllllI[lIIlllllll[44]] = lIIIIllIlllll("QAzPRuxlwng=", "ZNKQp");
        lIIllllllI[lIIlllllll[45]] = lIIIIlllIIIII("DyYB", "LIvru");
        lIIllllllI[lIIlllllll[46]] = lIIIIlllIIIIl("iwGhuu5Iw4g=", "MNLvt");
        lIIllllllI[lIIlllllll[48]] = lIIIIllIlllll("NVWWdptvcK8=", "zZOUs");
        lIIllllllI[lIIlllllll[52]] = lIIIIllIlllll("vd5JGwC4ZORNXs81lAmG0VqqdNwzJtrZ", "AAJje");
        lIIllllllI[lIIlllllll[53]] = lIIIIlllIIIII("Jw48HzcBRiAAIQgK", "dfSpD");
        lIIllllllI[lIIlllllll[55]] = lIIIIllIlllll("cXIvKtLF8UWo6DXjAcUMoA==", "QnVOC");
        lIIllllllI[lIIlllllll[56]] = lIIIIllIlllll("+bOy4sbR4hSoytBUkGcpCA==", "lvMwk");
        lIIllllllI[lIIlllllll[57]] = lIIIIlllIIIII("CiMaMwNvERw1AiQn", "OBhGk");
        lIIllllllI[lIIlllllll[20]] = lIIIIlllIIIIl("y/Qh44MBxIDMxECdsLpuHQ==", "LsKjP");
        lIIllllllI[lIIlllllll[51]] = lIIIIlllIIIII("MAccMEklGhw8AhM=", "vnnUi");
        lIIllllllI[lIIlllllll[73]] = lIIIIllIlllll("ZgkSxFmE/tVPpzh2dSTV1A==", "LpNJG");
        lIIllllllI[lIIlllllll[75]] = lIIIIllIlllll("iW0tGdquh+P8sqrfFMNuRnxa+suw8iDy", "izOmz");
        lIIllllllI[lIIlllllll[76]] = lIIIIllIlllll("3DM2syoDj1g=", "FGYYz");
    }

    private static boolean lIIIIlllIIlll(Object obj) {
        return obj != null;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            Y();
            "".length();
            if (((29 ^ 52) & ((133 ^ 172) ^ (-1))) >= (157 ^ 153)) {
                return (1 ^ 90) & ((96 ^ 59) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIlllllll[68];
    }

    private static String lIIIIlllIIIIl(String llllllllllllllllllllIllIlIIlIlll, String llllllllllllllllllllIllIlIIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), lIIlllllll[29]), "DES");
            Cipher llllllllllllllllllllIllIlIIllIIl = Cipher.getInstance("DES");
            llllllllllllllllllllIllIlIIllIIl.init(lIIlllllll[2], secretKeySpec);
            return new String(llllllllllllllllllllIllIlIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIllIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIllIlIIlIIll) {
            llllllllllllllllllllIllIlIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlllIIllI(int i) {
        return i == 0;
    }

    private static int lIIIIlllIllII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        lIIIIlllIIIll();
        lIIIIlllIIIlI();
        bu = lIIlllllll[0];
        bv = new ArrayList();
        bw = new WorldArea(lIIlllllll[77], lIIlllllll[78], lIIlllllll[52], lIIlllllll[42], lIIlllllll[0]);
        bx = new WorldPoint(lIIlllllll[79], lIIlllllll[80], lIIlllllll[0]);
        by = null;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIllllllI[lIIlllllll[73]];
    }

    private static boolean lIIIIlllIlIll(Object obj) {
        return obj == null;
    }

    private static void af() {
        if (lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7])) {
            int[] iArr = new int[lIIlllllll[1]];
            iArr[lIIlllllll[0]] = lIIlllllll[15];
            if (lIIIIlllIIllI(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllllll[15], lIIlllllll[58], lIIlllllll[59]));
                "".length();
            }
            int[] iArr2 = new int[lIIlllllll[1]];
            iArr2[lIIlllllll[0]] = lIIlllllll[8];
            if (lIIIIlllIIllI(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllllll[8], lIIlllllll[60], lIIlllllll[5]));
                "".length();
            }
            int[] iArr3 = new int[lIIlllllll[1]];
            iArr3[lIIlllllll[0]] = lIIlllllll[10];
            if (lIIIIlllIIllI(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllllll[10], lIIlllllll[61], lIIlllllll[5]));
                "".length();
            }
            int[] iArr4 = new int[lIIlllllll[1]];
            iArr4[lIIlllllll[0]] = lIIlllllll[12];
            if (lIIIIlllIIllI(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllllll[12], lIIlllllll[62], lIIlllllll[5]));
                "".length();
            }
            int[] iArr5 = new int[lIIlllllll[1]];
            iArr5[lIIlllllll[0]] = lIIlllllll[13];
            if (lIIIIlllIIllI(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllllll[13], lIIlllllll[4], lIIlllllll[5]));
                "".length();
            }
            int[] iArr6 = new int[lIIlllllll[1]];
            iArr6[lIIlllllll[0]] = lIIlllllll[47];
            if (lIIIIlllIIllI(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllllll[47], lIIlllllll[1], C0004e.c(lIIlllllll[63], lIIlllllll[64])));
                "".length();
            }
        }
        if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7])) {
            int[] iArr7 = new int[lIIlllllll[1]];
            iArr7[lIIlllllll[0]] = lIIlllllll[23];
            if (lIIIIlllIIlII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIlllllll[1]];
                iArr8[lIIlllllll[0]] = lIIlllllll[23];
                if (lIIIIlllIIlIl(Bank.getFirst(iArr8).getQuantity(), lIIlllllll[62])) {
                    int i = lIIlllllll[23];
                    int i2 = lIIlllllll[62];
                    int[] iArr9 = new int[lIIlllllll[1]];
                    iArr9[lIIlllllll[0]] = lIIlllllll[23];
                    bv.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIIlllllll[65]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIIlllllll[1]];
            iArr10[lIIlllllll[0]] = lIIlllllll[23];
            if (lIIIIlllIIllI(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllllll[23], lIIlllllll[62], lIIlllllll[65]));
                "".length();
            }
            int[] iArr11 = new int[lIIlllllll[1]];
            iArr11[lIIlllllll[0]] = lIIlllllll[24];
            if (lIIIIlllIIlII(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIlllllll[1]];
                iArr12[lIIlllllll[0]] = lIIlllllll[24];
                if (lIIIIlllIIlIl(Bank.getFirst(iArr12).getQuantity(), lIIlllllll[62])) {
                    int i3 = lIIlllllll[24];
                    int i4 = lIIlllllll[62];
                    int[] iArr13 = new int[lIIlllllll[1]];
                    iArr13[lIIlllllll[0]] = lIIlllllll[24];
                    bv.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIIlllllll[66]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIIlllllll[1]];
            iArr14[lIIlllllll[0]] = lIIlllllll[24];
            if (lIIIIlllIIllI(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllllll[24], lIIlllllll[62], lIIlllllll[66]));
                "".length();
            }
            int[] iArr15 = new int[lIIlllllll[1]];
            iArr15[lIIlllllll[0]] = lIIlllllll[21];
            if (lIIIIlllIIllI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIlllllll[1]];
                iArr16[lIIlllllll[0]] = lIIlllllll[21];
                if (lIIIIlllIIllI(Equipment.contains(iArr16) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlllllll[21], lIIlllllll[1], lIIlllllll[67]));
                    "".length();
                }
            }
            if (lIIIIlllIIlII(bu ? 1 : 0)) {
                int[] iArr17 = new int[lIIlllllll[1]];
                iArr17[lIIlllllll[0]] = lIIlllllll[15];
                if (lIIIIlllIIlII(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIIlllllll[1]];
                    iArr18[lIIlllllll[0]] = lIIlllllll[15];
                    if (lIIIIlllIIlIl(Bank.getFirst(iArr18).getQuantity(), lIIlllllll[62])) {
                        int i5 = lIIlllllll[15];
                        int i6 = lIIlllllll[62];
                        int[] iArr19 = new int[lIIlllllll[1]];
                        iArr19[lIIlllllll[0]] = lIIlllllll[15];
                        bv.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIIlllllll[59]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIIlllllll[1]];
                iArr20[lIIlllllll[0]] = lIIlllllll[15];
                if (lIIIIlllIIllI(Bank.contains(iArr20) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlllllll[15], lIIlllllll[62], lIIlllllll[59]));
                    "".length();
                }
                int[] iArr21 = new int[lIIlllllll[1]];
                iArr21[lIIlllllll[0]] = lIIlllllll[22];
                if (lIIIIlllIIlII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIlllllll[1]];
                    iArr22[lIIlllllll[0]] = lIIlllllll[22];
                    if (lIIIIlllIIlIl(Bank.getFirst(iArr22).getQuantity(), lIIlllllll[67])) {
                        int i7 = lIIlllllll[22];
                        int i8 = lIIlllllll[67];
                        int[] iArr23 = new int[lIIlllllll[1]];
                        iArr23[lIIlllllll[0]] = lIIlllllll[22];
                        bv.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIIlllllll[5]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIIlllllll[1]];
                iArr24[lIIlllllll[0]] = lIIlllllll[22];
                if (lIIIIlllIIllI(Bank.contains(iArr24) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlllllll[22], lIIlllllll[67], lIIlllllll[5]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIIlllllll[1]];
        iArr25[lIIlllllll[0]] = lIIlllllll[19];
        if (lIIIIlllIIllI(Bank.contains(iArr25) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllllll[19], lIIlllllll[68], lIIlllllll[39]));
            "".length();
        }
        if (lIIIIlllIIllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIllllllI[lIIlllllll[75]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllllll[69], lIIlllllll[18], lIIlllllll[70]));
            "".length();
        }
        int[] iArr26 = new int[lIIlllllll[1]];
        iArr26[lIIlllllll[0]] = lIIlllllll[71];
        if (lIIIIlllIIllI(Bank.contains(iArr26) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllllll[71], lIIlllllll[32], lIIlllllll[72]));
            "".length();
        }
        int[] iArr27 = new int[lIIlllllll[1]];
        iArr27[lIIlllllll[0]] = lIIlllllll[17];
        if (lIIIIlllIIllI(Bank.contains(iArr27) ? 1 : 0)) {
            bv.add(new C0003d(lIIlllllll[17], lIIlllllll[32], lIIlllllll[72]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[74])) {
            ?? r0 = lIIlllllll[1];
            "".length();
            return ((132 ^ 199) ^ (193 ^ 135)) <= 0 ? ((71 ^ 57) ^ (31 ^ 117)) & (((190 ^ 131) ^ (17 ^ 56)) ^ (-" ".length())) : r0;
        }
        return lIIlllllll[0];
    }

    public static void Z() {
        if (lIIIIlllIIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIIlllIIllI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllllllI[lIIlllllll[42]];
            Movement.walkTo(bx);
            "".length();
            Time.sleepTicks(lIIlllllll[1]);
            "".length();
        }
        if (lIIIIlllIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllllllI[lIIlllllll[43]];
            aa();
        }
    }

    private static boolean lIIIIlllIlIlI(int i, int i2) {
        return i == i2;
    }

    private static String lIIIIlllIIIII(String llllllllllllllllllllIllIIllllIlI, String llllllllllllllllllllIllIIllllIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllllIllIIllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllllIllIIlllIlll = llllllllllllllllllllIllIIllllIIl.toCharArray();
        int llllllllllllllllllllIllIIlllIllI = lIIlllllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int llllllllllllllllllllIllIIllIlllI = lIIlllllll[0];
        while (lIIIIlllIIlIl(llllllllllllllllllllIllIIllIlllI, length)) {
            char llllllllllllllllllllIllIIllllIll = charArray[llllllllllllllllllllIllIIllIlllI];
            sb.append((char) (llllllllllllllllllllIllIIllllIll ^ llllllllllllllllllllIllIIlllIlll[llllllllllllllllllllIllIIlllIllI % llllllllllllllllllllIllIIlllIlll.length]));
            "".length();
            llllllllllllllllllllIllIIlllIllI++;
            llllllllllllllllllllIllIIllIlllI++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIIlllIIIll() {
        lIIlllllll = new int[82];
        lIIlllllll[0] = (70 ^ 75) & ((70 ^ 75) ^ (-1));
        lIIlllllll[1] = " ".length();
        lIIlllllll[2] = "  ".length();
        lIIlllllll[3] = "   ".length();
        lIIlllllll[4] = (-((-17033) & 28335)) & (-81) & 16382;
        lIIlllllll[5] = (202 ^ 166) ^ (169 ^ 195);
        lIIlllllll[6] = (38 ^ 43) ^ (66 ^ 75);
        lIIlllllll[7] = 95 ^ 104;
        lIIlllllll[8] = (-5586) & 6143;
        lIIlllllll[9] = (-((-17602) & 22211)) & (-26627) & 32735;
        lIIlllllll[10] = (-5125) & 5679;
        lIIlllllll[11] = (-((-10401) & 31417)) & (-1060) & 24575;
        lIIlllllll[12] = (-((-687) & 31663)) & (-145) & 31677;
        lIIlllllll[13] = (-((-8755) & 16371)) & (-21) & 8190;
        lIIlllllll[14] = (-((-29201) & 30227)) & (-513) & 6038;
        lIIlllllll[15] = (-((-4241) & 21981)) & (-12289) & 30591;
        lIIlllllll[16] = (-((-12295) & 30255)) & (-2183) & 32767;
        lIIlllllll[17] = (-24613) & 32621;
        lIIlllllll[18] = (((102 + 84) - 61) + 6) ^ (((61 + 53) - 5) + 25);
        lIIlllllll[19] = (-20997) & 21375;
        lIIlllllll[20] = 57 ^ 32;
        lIIlllllll[21] = (-8337) & 9723;
        lIIlllllll[22] = (-((-55) & 26103)) & (-2051) & 28654;
        lIIlllllll[23] = (-25615) & 26175;
        lIIlllllll[24] = (44 ^ 22) ^ (25 ^ 29);
        lIIlllllll[25] = 42 ^ 53;
        lIIlllllll[26] = 76 ^ 75;
        lIIlllllll[27] = -" ".length();
        lIIlllllll[28] = (35 ^ 31) ^ (7 ^ 30);
        lIIlllllll[29] = (58 ^ 63) ^ (54 ^ 59);
        lIIlllllll[30] = (156 ^ 169) ^ (141 ^ 149);
        lIIlllllll[31] = 101 ^ 108;
        lIIlllllll[32] = 133 ^ 143;
        lIIlllllll[33] = (104 ^ 41) ^ (237 ^ 167);
        lIIlllllll[34] = (-8486) & 11647;
        lIIlllllll[35] = (-25089) & 28575;
        lIIlllllll[36] = 101 ^ 105;
        lIIlllllll[37] = (196 ^ 141) ^ (241 ^ 135);
        lIIlllllll[38] = (154 ^ 190) ^ (190 ^ 151);
        lIIlllllll[39] = (-((-27375) & 28415)) & (-28716) & 30075;
        lIIlllllll[40] = (-393) & 922;
        lIIlllllll[41] = (-29249) & 32748;
        lIIlllllll[42] = (((52 + 0) - (-53)) + 39) ^ (((135 + 70) - 50) + 3);
        lIIlllllll[43] = 147 ^ 156;
        lIIlllllll[44] = 112 ^ 96;
        lIIlllllll[45] = (((53 + 18) - (-32)) + 42) ^ (((42 + 96) - 20) + 10);
        lIIlllllll[46] = 110 ^ 124;
        lIIlllllll[47] = (-((-8749) & 29373)) & (-2561) & 24565;
        lIIlllllll[48] = 209 ^ 194;
        lIIlllllll[49] = (-((-17365) & 23549)) & (-9731) & 16190;
        lIIlllllll[50] = (-29965) & 30557;
        lIIlllllll[51] = (45 ^ 74) ^ (253 ^ 128);
        lIIlllllll[52] = (((104 + 128) - 108) + 56) ^ (((128 + 156) - 244) + 120);
        lIIlllllll[53] = 85 ^ 64;
        lIIlllllll[54] = ((80 + 56) - 118) + 183;
        lIIlllllll[55] = (62 ^ 36) ^ (7 ^ 11);
        lIIlllllll[56] = (((129 + 188) - 309) + 203) ^ (((86 + 83) - 113) + 140);
        lIIlllllll[57] = 75 ^ 83;
        lIIlllllll[58] = (-29697) & 30696;
        lIIlllllll[59] = (((191 ^ 197) + (120 ^ 16)) - (((98 + 179) - 191) + 131)) + ((102 + 61) - 84) + 82;
        lIIlllllll[60] = (-((-2849) & 27451)) & (-4098) & 32699;
        lIIlllllll[61] = (-12328) & 14327;
        lIIlllllll[62] = (-((-5025) & 14242)) & (-5) & 12221;
        lIIlllllll[63] = (-19466) & 31965;
        lIIlllllll[64] = (-308) & 15807;
        lIIlllllll[65] = (226 ^ 156) ^ (177 ^ 183);
        lIIlllllll[66] = (((((31 + 24) - (-47)) + 36) + (30 ^ 118)) - (81 ^ 63)) + (39 ^ 53);
        lIIlllllll[67] = (-((-8787) & 10071)) & (-16387) & 32670;
        lIIlllllll[68] = (((146 + 62) - 61) + 96) ^ (((96 + 123) - 197) + 129);
        lIIlllllll[69] = (-16433) & 28412;
        lIIlllllll[70] = (-((-1606) & 3655)) & (-5189) & 32237;
        lIIlllllll[71] = (-((-7171) & 23691)) & (-1) & 24527;
        lIIlllllll[72] = (-15380) & 16279;
        lIIlllllll[73] = (32 ^ 50) ^ (61 ^ 52);
        lIIlllllll[74] = (17 ^ 42) ^ (99 ^ 19);
        lIIlllllll[75] = 55 ^ 43;
        lIIlllllll[76] = (84 ^ 5) ^ (224 ^ 172);
        lIIlllllll[77] = (-((-5833) & 14058)) & (-20497) & 31743;
        lIIlllllll[78] = (-12553) & 15851;
        lIIlllllll[79] = (-((-5063) & 30703)) & (-1) & 28671;
        lIIlllllll[80] = (-((-1129) & 14191)) & (-17) & 16383;
        lIIlllllll[81] = 96 ^ 126;
    }

    public static void ae() {
        if (lIIIIlllIIlll(Widgets.get(lIIlllllll[50], lIIlllllll[51]))) {
            AccBuilderRogues.c = lIIllllllI[lIIlllllll[52]];
            Widgets.get(lIIlllllll[50], lIIlllllll[51]).interact(lIIllllllI[lIIlllllll[53]]);
            Time.sleepTicks(lIIlllllll[6]);
            "".length();
        }
        if (lIIIIlllIlIll(Widgets.get(lIIlllllll[50], lIIlllllll[51])) && lIIIIlllIIllI(Widgets.get(lIIlllllll[54]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIIlllllll[1]);
            "".length();
            if (lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[18])) {
                Widgets.get(lIIlllllll[54], lIIlllllll[1]).getChild(lIIlllllll[1]).interact(lIIllllllI[lIIlllllll[55]]);
            }
            if (lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[31]) && lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[18])) {
                Widgets.get(lIIlllllll[54], lIIlllllll[1]).getChild(lIIlllllll[2]).interact(lIIllllllI[lIIlllllll[56]]);
            }
            if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[31]) && lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[38])) {
                Widgets.get(lIIlllllll[54], lIIlllllll[1]).getChild(lIIlllllll[3]).interact(lIIllllllI[lIIlllllll[57]]);
            }
            if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[31])) {
                int[] iArr = new int[lIIlllllll[1]];
                iArr[lIIlllllll[0]] = lIIlllllll[13];
                if (lIIIIlllIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIIlllllll[54], lIIlllllll[1]).getChild(lIIlllllll[3]).interact(lIIllllllI[lIIlllllll[20]]);
                }
            }
            if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[38])) {
                int[] iArr2 = new int[lIIlllllll[1]];
                iArr2[lIIlllllll[0]] = lIIlllllll[13];
                if (lIIIIlllIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIIlllllll[54], lIIlllllll[1]).getChild(lIIlllllll[6]).interact(lIIllllllI[lIIlllllll[51]]);
                }
            }
            Time.sleepTicks(lIIlllllll[1]);
            "".length();
        }
    }

    private static boolean lIIIIlllIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIIlllIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIlllIllIl(int i) {
        return i < 0;
    }

    private static String lIIIIllIlllll(String llllllllllllllllllllIllIlIIIlIlI, String llllllllllllllllllllIllIlIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIllIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIllIlIIIllII = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIllIlIIIllII.init(lIIlllllll[2], secretKeySpec);
            return new String(llllllllllllllllllllIllIlIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIllIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIllIlIIIlIll) {
            llllllllllllllllllllIllIlIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlllIllll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIIIlllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0208, code lost:
        if (lIIIIlllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02c9, code lost:
        if (lIIIIlllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03a5, code lost:
        if (lIIIIlllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ac() {
        if (lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[20])) {
            int[] iArr = new int[lIIlllllll[1]];
            iArr[lIIlllllll[0]] = lIIlllllll[8];
            if (lIIIIlllIIlII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlllllll[1]];
                iArr2[lIIlllllll[0]] = lIIlllllll[12];
                if (lIIIIlllIIlII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlllllll[1]];
                    iArr3[lIIlllllll[0]] = lIIlllllll[10];
                    if (lIIIIlllIIlII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIlllllll[1]];
                        iArr4[lIIlllllll[0]] = lIIlllllll[13];
                        if (lIIIIlllIIlII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIlllllll[1]];
                            iArr5[lIIlllllll[0]] = lIIlllllll[19];
                            if (lIIIIlllIIlII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIlllllll[1]];
                                iArr6[lIIlllllll[0]] = lIIlllllll[47];
                                if (lIIIIlllIIllI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIlllllll[1]];
                                    iArr7[lIIlllllll[0]] = lIIlllllll[47];
                                }
                                ?? r0 = lIIlllllll[1];
                                "".length();
                                return ((((29 + 50) - 51) + 133) ^ (((37 + 39) - (-51)) + 38)) < "  ".length() ? ((6 ^ 69) ^ (205 ^ 191)) & ((((66 ^ 114) & ((152 ^ 168) ^ (-1))) ^ (95 ^ 110)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIIlllllll[0];
        } else if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[20]) && lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7])) {
            int[] iArr8 = new int[lIIlllllll[1]];
            iArr8[lIIlllllll[0]] = lIIlllllll[12];
            if (lIIIIlllIIlII(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIlllllll[1]];
                iArr9[lIIlllllll[0]] = lIIlllllll[10];
                if (lIIIIlllIIlII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlllllll[1]];
                    iArr10[lIIlllllll[0]] = lIIlllllll[13];
                    if (lIIIIlllIIlII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIlllllll[1]];
                        iArr11[lIIlllllll[0]] = lIIlllllll[15];
                        if (lIIIIlllIIlII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIlllllll[1]];
                            iArr12[lIIlllllll[0]] = lIIlllllll[47];
                            if (lIIIIlllIIllI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIlllllll[1]];
                                iArr13[lIIlllllll[0]] = lIIlllllll[47];
                            }
                            ?? r02 = lIIlllllll[1];
                            "".length();
                            return (((57 ^ 109) ^ (75 ^ 49)) & (((((160 + 57) - 187) + 133) ^ (((12 + 124) - 95) + 100)) ^ (-" ".length()))) != 0 ? ((((78 + 119) - 103) + 95) ^ (((19 + 30) - (-56)) + 54)) & (((117 ^ 47) ^ (62 ^ 70)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIIlllllll[0];
        } else if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7]) && lIIIIlllIIllI(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIIlllllll[1]];
            iArr14[lIIlllllll[0]] = lIIlllllll[21];
            if (lIIIIlllIIllI(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIlllllll[1]];
                iArr15[lIIlllllll[0]] = lIIlllllll[21];
            }
            int[] iArr16 = new int[lIIlllllll[1]];
            iArr16[lIIlllllll[0]] = lIIlllllll[23];
            if (lIIIIlllIIlII(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIlllllll[1]];
                iArr17[lIIlllllll[0]] = lIIlllllll[24];
                if (lIIIIlllIIlII(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIlllllll[1];
                    "".length();
                    return "   ".length() <= " ".length() ? ((((3 + 228) - 187) + 202) ^ (((101 + 143) - 160) + 104)) & (((118 ^ 7) ^ (1 ^ 58)) ^ (-" ".length())) : r03;
                }
            }
            return lIIlllllll[0];
        } else if (lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[7]) && lIIIIlllIIlII(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIIlllllll[1]];
            iArr18[lIIlllllll[0]] = lIIlllllll[21];
            if (lIIIIlllIIllI(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIlllllll[1]];
                iArr19[lIIlllllll[0]] = lIIlllllll[21];
            }
            int[] iArr20 = new int[lIIlllllll[1]];
            iArr20[lIIlllllll[0]] = lIIlllllll[15];
            if (lIIIIlllIIlII(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIlllllll[1]];
                iArr21[lIIlllllll[0]] = lIIlllllll[22];
                if (lIIIIlllIIlII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIlllllll[1]];
                    iArr22[lIIlllllll[0]] = lIIlllllll[22];
                    if (lIIIIlllIlIIl(Bank.getFirst(iArr22).getQuantity(), lIIlllllll[18])) {
                        int[] iArr23 = new int[lIIlllllll[1]];
                        iArr23[lIIlllllll[0]] = lIIlllllll[23];
                        if (lIIIIlllIIlII(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIlllllll[1]];
                            iArr24[lIIlllllll[0]] = lIIlllllll[24];
                            if (lIIIIlllIIlII(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIlllllll[1];
                                "".length();
                                return (((50 ^ 84) ^ (60 ^ 8)) & (((6 ^ 94) ^ (167 ^ 173)) ^ (-" ".length()))) != 0 ? ((157 ^ 142) ^ (34 ^ 101)) & (((((106 + 239) - 297) + 204) ^ (((147 + 103) - 215) + 133)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIIlllllll[0];
        } else {
            return lIIlllllll[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ad() {
        if (lIIIIlllIlIlI(Vars.getBit(lIIlllllll[49]), lIIlllllll[1]) && lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[18])) {
            return lIIlllllll[1];
        }
        if (lIIIIlllIlIlI(Vars.getBit(lIIlllllll[49]), lIIlllllll[2]) && lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[31]) && lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[18])) {
            return lIIlllllll[1];
        }
        if (lIIIIlllIlIlI(Vars.getBit(lIIlllllll[49]), lIIlllllll[3]) && lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[31]) && lIIIIlllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[38])) {
            return lIIlllllll[1];
        }
        if (lIIIIlllIlIlI(Vars.getBit(lIIlllllll[49]), lIIlllllll[3]) && lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[31])) {
            int[] iArr = new int[lIIlllllll[1]];
            iArr[lIIlllllll[0]] = lIIlllllll[13];
            if (lIIIIlllIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                return lIIlllllll[1];
            }
        }
        if (lIIIIlllIlIlI(Vars.getBit(lIIlllllll[49]), lIIlllllll[6]) && lIIIIlllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlllllll[38])) {
            int[] iArr2 = new int[lIIlllllll[1]];
            iArr2[lIIlllllll[0]] = lIIlllllll[13];
            if (lIIIIlllIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIlllllll[1];
            }
        }
        return lIIlllllll[0];
    }

    private static boolean lIIIIlllIlIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIIlllIIlII(int i) {
        return i != 0;
    }
}
