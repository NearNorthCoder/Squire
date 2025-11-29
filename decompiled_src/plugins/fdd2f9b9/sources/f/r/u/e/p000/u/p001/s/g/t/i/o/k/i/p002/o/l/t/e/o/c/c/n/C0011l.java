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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.l  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/l.class */
public class C0011l implements G {
    static /* synthetic */ WorldPoint by;
    static /* synthetic */ WorldArea bw;
    public static /* synthetic */ boolean bu;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint bx;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ String[] lIIlIIIlII;
    private static /* synthetic */ int[] lIIlIIIlIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v357, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v387, types: [boolean] */
    public static void Y() {
        if (llllIllIIlII(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[0]];
            C0001b.a(bv);
            if (llllIllIIlIl(bv.size(), lIIlIIIlIl[1])) {
                System.out.println(lIIlIIIlII[lIIlIIIlIl[1]]);
                bt = lIIlIIIlIl[0];
            }
        }
        if (llllIllIIllI(bt ? 1 : 0)) {
            if (llllIllIIllI(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llllIllIIlll(nearest) && llllIllIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[2]];
                    C0000a.a(nearest);
                }
                if (llllIllIIlll(nearest) && llllIllIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[3]];
                    if (llllIllIIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIIlIl[4]);
                        "".length();
                    }
                    if (llllIllIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (llllIllIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIIlIl[5]);
                            "".length();
                        }
                        while (llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6]) && llllIllIIllI(v.aX() ? 1 : 0)) {
                            v.aV();
                            Time.sleepTicks(lIIlIIIlIl[1]);
                            "".length();
                            "".length();
                            if ("  ".length() > "   ".length()) {
                                return;
                            }
                        }
                        if (llllIllIIllI(ac() ? 1 : 0)) {
                            af();
                            System.out.println(lIIlIIIlII[lIIlIIIlIl[5]]);
                            bt = lIIlIIIlIl[1];
                            return;
                        }
                        if (llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6])) {
                            int[] iArr = new int[lIIlIIIlIl[1]];
                            iArr[lIIlIIIlIl[0]] = lIIlIIIlIl[7];
                            if (llllIllIIlII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIlIIIlIl[1]];
                                iArr2[lIIlIIIlIl[0]] = lIIlIIIlIl[7];
                                if (llllIllIIlIl(Inventory.getCount(iArr2), lIIlIIIlIl[1])) {
                                    Bank.withdraw(lIIlIIIlIl[7], lIIlIIIlIl[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIIlIIIlIl[1]];
                                        iArr3[lIIlIIIlIl[0]] = lIIlIIIlIl[7];
                                        if (llllIllIlIII(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIIlIIIlIl[1];
                                            "".length();
                                            return "   ".length() < "  ".length() ? ((79 ^ 62) ^ (20 ^ 59)) & (((187 ^ 162) ^ (194 ^ 133)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlIIIlIl[0];
                                    }, lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIIlIIIlIl[1]];
                            iArr3[lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                            if (llllIllIIlII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIlIIIlIl[1]];
                                iArr4[lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                                if (llllIllIIlIl(Inventory.getCount(iArr4), lIIlIIIlIl[1])) {
                                    Bank.withdraw(lIIlIIIlIl[9], lIIlIIIlIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIIlIIIlIl[1]];
                                        iArr5[lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                                        if (llllIllIlIII(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIIlIIIlIl[1];
                                            "".length();
                                            return ((115 ^ 43) ^ (33 ^ 125)) <= " ".length() ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                                        }
                                        return lIIlIIIlIl[0];
                                    }, lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIIlIIIlIl[1]];
                            iArr5[lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                            if (llllIllIIlII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIlIIIlIl[1]];
                                iArr6[lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                                if (llllIllIIlIl(Inventory.getCount(iArr6), lIIlIIIlIl[1])) {
                                    Bank.withdraw(lIIlIIIlIl[11], lIIlIIIlIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIIlIIIlIl[1]];
                                        iArr7[lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                                        if (llllIllIlIII(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIIlIIIlIl[1];
                                            "".length();
                                            return (-(143 ^ 138)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIlIIIlIl[0];
                                    }, lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIIlIIIlIl[1]];
                            iArr7[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                            if (llllIllIIlII(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIlIIIlIl[1]];
                                iArr8[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                                if (llllIllIIlIl(Inventory.getCount(iArr8), lIIlIIIlIl[1])) {
                                    Bank.withdraw(lIIlIIIlIl[12], lIIlIIIlIl[13], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIIlIIIlIl[1]];
                                        iArr9[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                                        if (llllIllIlIII(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIIlIIIlIl[1];
                                            "".length();
                                            return 0 != 0 ? ((((5 + 20) - 9) + 113) ^ (((61 + 34) - 36) + 81)) & (((22 ^ 115) ^ (23 ^ 127)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlIIIlIl[0];
                                    }, lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIIlIIIlIl[1]];
                            iArr9[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                            if (llllIllIIlII(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIlIIIlIl[1]];
                                iArr10[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                                if (llllIllIIlIl(Inventory.getCount(iArr10), lIIlIIIlIl[1])) {
                                    Bank.withdraw(lIIlIIIlIl[14], lIIlIIIlIl[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIIlIIIlIl[1]];
                                        iArr11[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                                        if (llllIllIlIII(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIIlIIIlIl[1];
                                            "".length();
                                            return "   ".length() < ("  ".length() & ("  ".length() ^ (-" ".length()))) ? ((((9 + 8) - (-125)) + 33) ^ (((5 + 115) - 90) + 115)) & (((((120 + 68) - 80) + 29) ^ (((31 + 46) - (-54)) + 52)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlIIIlIl[0];
                                    }, lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIIlIIIlIl[1]];
                            iArr11[lIIlIIIlIl[0]] = lIIlIIIlIl[15];
                            if (llllIllIIlII(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIIlIIIlIl[1]];
                                iArr12[lIIlIIIlIl[0]] = lIIlIIIlIl[15];
                                if (llllIllIIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIIlIIIlIl[15], lIIlIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIIlIIIlIl[1]];
                                        iArr13[lIIlIIIlIl[0]] = lIIlIIIlIl[15];
                                        return Inventory.contains(iArr13);
                                    }, lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIIlIIIlIl[16], lIIlIIIlIl[17], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIIlIIIlIl[1]];
                            iArr13[lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                            if (llllIllIIlII(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIIlIIIlIl[1]];
                                iArr14[lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                                if (llllIllIIlIl(Inventory.getCount(iArr14), lIIlIIIlIl[1]) && llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[19])) {
                                    Bank.withdrawAll(lIIlIIIlIl[18], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIIlIIIlIl[1]];
                                        iArr15[lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                                        if (llllIllIlIII(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIIlIIIlIl[1];
                                            "".length();
                                            return "   ".length() > ((11 ^ 43) ^ (36 ^ 0)) ? ((((150 + 174) - 190) + 46) ^ (((22 + 76) - 71) + 102)) & (((184 ^ 180) ^ (34 ^ 27)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIlIIIlIl[0];
                                    }, lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                        }
                        if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6])) {
                            int[] iArr15 = new int[lIIlIIIlIl[1]];
                            iArr15[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                            if (llllIllIIllI(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIIlIIIlIl[20], lIIlIIIlIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIlIIIlIl[1]);
                                "".length();
                            }
                            if (llllIllIIlII(bu ? 1 : 0)) {
                                Bank.withdrawAll(lIIlIIIlIl[21], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIlIIIlIl[1]);
                                "".length();
                                Bank.withdrawAll(lIIlIIIlIl[14], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIlIIIlIl[1]);
                                "".length();
                            }
                            Bank.withdrawAll(lIIlIIIlIl[22], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIlIIIlIl[1]);
                            "".length();
                            Bank.withdrawAll(lIIlIIIlIl[23], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIIlIIIlIl[1]);
                            "".length();
                        }
                    }
                }
            }
            if (llllIllIIlII(ab() ? 1 : 0)) {
                if (llllIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[19])) {
                    if (llllIllIIllI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[17]];
                        Movement.walkTo(bx);
                        "".length();
                        Time.sleepTicks(lIIlIIIlIl[1]);
                        "".length();
                    }
                    if (llllIllIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[24]];
                        aa();
                    }
                }
                if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[19]) && llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[25])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[26]];
                    if (llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIIlIIIlIl[1]);
                        "".length();
                    }
                }
                if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[25]) && llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[28])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[29]];
                    if (llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIIlIIIlIl[1]);
                        "".length();
                    }
                }
                if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[28]) && llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[30])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[31]];
                    if (llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIIlIIIlIl[1]);
                        "".length();
                    }
                }
                if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[30]) && llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[32]];
                    if (llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIIlIIIlIl[1]);
                        "".length();
                    }
                }
                if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[33]];
                    int[] iArr16 = new int[lIIlIIIlIl[1]];
                    iArr16[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                    if (llllIllIIlII(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIlIIIlIl[1]];
                        iArr17[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                        if (llllIllIIllI(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIIlIIIlIl[1]];
                            iArr18[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                            Inventory.getFirst(iArr18).interact(lIIlIIIlII[lIIlIIIlIl[34]]);
                            Time.sleepTicks(lIIlIIIlIl[1]);
                            "".length();
                        }
                    }
                    if (llllIllIIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIIlIIIlIl[1]];
                    iArr19[lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIIlIIIlIl[1]];
                    iArr20[lIIlIIIlIl[0]] = lIIlIIIlIl[35];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (llllIllIIllI(bu ? 1 : 0)) {
                        if (llllIllIIllI(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[36]];
                            Movement.walkTo(by);
                            "".length();
                            Time.sleepTicks(lIIlIIIlIl[1]);
                            "".length();
                        }
                        if (llllIllIIlII(Players.getLocal().getWorldLocation().equals(by) ? 1 : 0) && llllIllIIlll(first) && llllIllIIlll(first2)) {
                            int lIIlIlllIl = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llllIllIllll(Skills.getExperience(Skill.MAGIC), lIIlIlllIl)) {
                                    ?? r0 = lIIlIIIlIl[1];
                                    "".length();
                                    return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIlIIIlIl[0];
                            }, lIIlIIIlIl[8]);
                            "".length();
                            Time.sleep(C0004e.c(lIIlIIIlIl[37], lIIlIIIlIl[38]));
                            "".length();
                        }
                    }
                    if (llllIllIIlII(bu ? 1 : 0)) {
                        if (llllIllIIlll(first) && llllIllIIlll(first2) && llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                            int lIIlIlllIl2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (llllIllIllll(Skills.getExperience(Skill.MAGIC), lIIlIlllIl2)) {
                                    ?? r0 = lIIlIIIlIl[1];
                                    "".length();
                                    return (-(6 ^ 2)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lIIlIIIlIl[0];
                            }, lIIlIIIlIl[8]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                                ?? r0 = lIIlIIIlIl[1];
                                "".length();
                                return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIlIIIlIl[0];
                        }, lIIlIIIlIl[39]);
                        "".length();
                    }
                }
            }
        }
    }

    public static void Z() {
        if (llllIllIIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llllIllIIllI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[40]];
            Movement.walkTo(bx);
            "".length();
            Time.sleepTicks(lIIlIIIlIl[1]);
            "".length();
        }
        if (llllIllIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            aa();
        }
    }

    private static boolean llllIllIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static void ae() {
        if (llllIllIIlll(Widgets.get(lIIlIIIlIl[49], lIIlIIIlIl[50]))) {
            AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[51]];
            Widgets.get(lIIlIIIlIl[49], lIIlIIIlIl[50]).interact(lIIlIIIlII[lIIlIIIlIl[52]]);
            Time.sleepTicks(lIIlIIIlIl[5]);
            "".length();
        }
        if (llllIllIllIl(Widgets.get(lIIlIIIlIl[49], lIIlIIIlIl[50])) && llllIllIIllI(Widgets.get(lIIlIIIlIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIIlIIIlIl[1]);
            "".length();
            if (llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[17])) {
                Widgets.get(lIIlIIIlIl[53], lIIlIIIlIl[1]).getChild(lIIlIIIlIl[1]).interact(lIIlIIIlII[lIIlIIIlIl[54]]);
            }
            if (llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[31]) && llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[17])) {
                Widgets.get(lIIlIIIlIl[53], lIIlIIIlIl[1]).getChild(lIIlIIIlIl[2]).interact(lIIlIIIlII[lIIlIIIlIl[55]]);
            }
            if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[31]) && llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[36])) {
                Widgets.get(lIIlIIIlIl[53], lIIlIIIlIl[1]).getChild(lIIlIIIlIl[3]).interact(lIIlIIIlII[lIIlIIIlIl[19]]);
            }
            if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[31])) {
                int[] iArr = new int[lIIlIIIlIl[1]];
                iArr[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                if (llllIllIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIIlIIIlIl[53], lIIlIIIlIl[1]).getChild(lIIlIIIlIl[3]).interact(lIIlIIIlII[lIIlIIIlIl[50]]);
                }
            }
            if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[36])) {
                int[] iArr2 = new int[lIIlIIIlIl[1]];
                iArr2[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                if (llllIllIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIIlIIIlIl[53], lIIlIIIlIl[1]).getChild(lIIlIIIlIl[5]).interact(lIIlIIIlII[lIIlIIIlIl[56]]);
                }
            }
            Time.sleepTicks(lIIlIIIlIl[1]);
            "".length();
        }
    }

    private static String llllIllIIIIl(String lIIIllIllI, String lIIIllIlIl) {
        try {
            SecretKeySpec lIIIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIIIlIl[29]), "DES");
            Cipher lIIIlllIII = Cipher.getInstance("DES");
            lIIIlllIII.init(lIIlIIIlIl[2], lIIIlllIIl);
            return new String(lIIIlllIII.doFinal(Base64.getDecoder().decode(lIIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIllIlll) {
            lIIIllIlll.printStackTrace();
            return null;
        }
    }

    private static int llllIllIlIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        llllIllIIIll();
        llllIllIIIlI();
        bv = new ArrayList();
        bw = new WorldArea(lIIlIIIlIl[76], lIIlIIIlIl[77], lIIlIIIlIl[47], lIIlIIIlIl[40], lIIlIIIlIl[0]);
        bx = new WorldPoint(lIIlIIIlIl[78], lIIlIIIlIl[79], lIIlIIIlIl[0]);
        by = new WorldPoint(lIIlIIIlIl[80] + C0004e.c(lIIlIIIlIl[1], lIIlIIIlIl[5]), lIIlIIIlIl[81], lIIlIIIlIl[0]);
    }

    private static boolean llllIllIllII(int i) {
        return i < 0;
    }

    private static boolean llllIllIlIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[73])) {
            ?? r0 = lIIlIIIlIl[1];
            "".length();
            return ((6 ^ 44) & ((77 ^ 103) ^ (-1))) < ((165 ^ 188) & ((62 ^ 39) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIIIlIl[0];
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            Y();
            "".length();
            if (0 != 0) {
                return (46 ^ 26) & ((26 ^ 46) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIlIIIlIl[67];
    }

    private static boolean llllIllIIllI(int i) {
        return i == 0;
    }

    private static void llllIllIIIll() {
        lIIlIIIlIl = new int[82];
        lIIlIIIlIl[0] = (84 ^ 54) & ((200 ^ 170) ^ (-1));
        lIIlIIIlIl[1] = " ".length();
        lIIlIIIlIl[2] = "  ".length();
        lIIlIIIlIl[3] = "   ".length();
        lIIlIIIlIl[4] = (-18549) & 23548;
        lIIlIIIlIl[5] = 0 ^ 4;
        lIIlIIIlIl[6] = (146 ^ 190) ^ (172 ^ 183);
        lIIlIIIlIl[7] = (-((-9741) & 14094)) & (-8273) & 13183;
        lIIlIIIlIl[8] = (-20483) & 21982;
        lIIlIIIlIl[9] = (-((-1801) & 28489)) & (-1157) & 28399;
        lIIlIIIlIl[10] = (-((-17489) & 29819)) & (-1042) & 15871;
        lIIlIIIlIl[11] = (-9283) & 9839;
        lIIlIIIlIl[12] = (-((-651) & 22491)) & (-10370) & 32763;
        lIIlIIIlIl[13] = (-8715) & 13214;
        lIIlIIIlIl[14] = (-((-8977) & 14293)) & (-265) & 6143;
        lIIlIIIlIl[15] = (-((-10505) & 28555)) & (-2057) & 32731;
        lIIlIIIlIl[16] = (-24753) & 32761;
        lIIlIIIlIl[17] = 111 ^ 106;
        lIIlIIIlIl[18] = (-((-617) & 8937)) & (-3073) & 11771;
        lIIlIIIlIl[19] = 27 ^ 2;
        lIIlIIIlIl[20] = (-4613) & 5999;
        lIIlIIIlIl[21] = (-1172) & 1727;
        lIIlIIIlIl[22] = (-5581) & 6141;
        lIIlIIIlIl[23] = 88 ^ 102;
        lIIlIIIlIl[24] = 120 ^ 126;
        lIIlIIIlIl[25] = 80 ^ 79;
        lIIlIIIlIl[26] = (68 ^ 9) ^ (12 ^ 70);
        lIIlIIIlIl[27] = -" ".length();
        lIIlIIIlIl[28] = (" ".length() & (" ".length() ^ (-1))) ^ (45 ^ 8);
        lIIlIIIlIl[29] = (101 ^ 116) ^ (34 ^ 59);
        lIIlIIIlIl[30] = 102 ^ 75;
        lIIlIIIlIl[31] = 10 ^ 3;
        lIIlIIIlIl[32] = 82 ^ 88;
        lIIlIIIlIl[33] = (174 ^ 167) ^ "  ".length();
        lIIlIIIlIl[34] = 143 ^ 131;
        lIIlIIIlIl[35] = 187 ^ 132;
        lIIlIIIlIl[36] = (69 ^ 67) ^ (167 ^ 172);
        lIIlIIIlIl[37] = (-((-12546) & 16283)) & (-12289) & 16345;
        lIIlIIIlIl[38] = (-((-1281) & 24046)) & (-257) & 23551;
        lIIlIIIlIl[39] = (-((-8321) & 29314)) & (-67) & 24559;
        lIIlIIIlIl[40] = 56 ^ 54;
        lIIlIIIlIl[41] = (64 ^ 24) ^ (207 ^ 152);
        lIIlIIIlIl[42] = 156 ^ 140;
        lIIlIIIlIl[43] = 71 ^ 86;
        lIIlIIIlIl[44] = (-((-5397) & 30615)) & (-6161) & 32759;
        lIIlIIIlIl[45] = 210 ^ 192;
        lIIlIIIlIl[46] = (((29 + 30) - 8) + 92) ^ (((36 + 120) - 153) + 153);
        lIIlIIIlIl[47] = (((83 + 43) - 45) + 96) ^ (((78 + 90) - 158) + 155);
        lIIlIIIlIl[48] = (-((-24885) & 30581)) & (-26763) & 32734;
        lIIlIIIlIl[49] = (-((-4483) & 15791)) & (-16515) & 28415;
        lIIlIIIlIl[50] = (23 ^ 77) ^ (124 ^ 60);
        lIIlIIIlIl[51] = 60 ^ 41;
        lIIlIIIlIl[52] = (80 ^ 30) ^ (235 ^ 179);
        lIIlIIIlIl[53] = (((53 ^ 31) + (44 ^ 54)) - (-(17 ^ 9))) + (242 ^ 159);
        lIIlIIIlIl[54] = 161 ^ 182;
        lIIlIIIlIl[55] = 133 ^ 157;
        lIIlIIIlIl[56] = 113 ^ 106;
        lIIlIIIlIl[57] = (-((-25989) & 28039)) & (-24598) & 27647;
        lIIlIIIlIl[58] = ((125 + 67) - 81) + 59;
        lIIlIIIlIl[59] = (-16402) & 20401;
        lIIlIIIlIl[60] = (-((-1323) & 23866)) & (-1) & 24543;
        lIIlIIIlIl[61] = (-((-2453) & 32151)) & (-66) & 32763;
        lIIlIIIlIl[62] = (-((-2393) & 19835)) & (-2058) & 31999;
        lIIlIIIlIl[63] = (-16946) & 32445;
        lIIlIIIlIl[64] = (229 ^ 187) ^ (41 ^ 15);
        lIIlIIIlIl[65] = (((85 ^ 110) + (((24 + 26) - 41) + 126)) - (((40 + 74) - 29) + 53)) + (241 ^ 175);
        lIIlIIIlIl[66] = (-((-3585) & 20067)) & (-1281) & 32762;
        lIIlIIIlIl[67] = (((179 + 185) - 297) + 164) ^ (((129 + 44) - 150) + 108);
        lIIlIIIlIl[68] = (-20755) & 32734;
        lIIlIIIlIl[69] = (-((-5925) & 8037)) & (-4098) & 31209;
        lIIlIIIlIl[70] = (-(((166 + 92) - 230) + 141)) & (-16401) & 24575;
        lIIlIIIlIl[71] = (-((-1799) & 32607)) & (-3) & 31710;
        lIIlIIIlIl[72] = 85 ^ 73;
        lIIlIIIlIl[73] = (((229 + 92) - 169) + 85) ^ (((15 + 120) - 87) + 94);
        lIIlIIIlIl[74] = (57 ^ 110) ^ (236 ^ 166);
        lIIlIIIlIl[75] = 172 ^ 178;
        lIIlIIIlIl[76] = (-((-1751) & 18135)) & (-2) & 19407;
        lIIlIIIlIl[77] = (-" ".length()) & (-273) & 3571;
        lIIlIIIlIl[78] = (-16425) & 19455;
        lIIlIIIlIl[79] = (-((-13927) & 30311)) & (-12817) & 32505;
        lIIlIIIlIl[80] = (-((-3675) & 8063)) & (-641) & 8190;
        lIIlIIIlIl[81] = (-577) & 4063;
    }

    private static void aa() {
        if (llllIllIllII(llllIllIlIll(C0004e.u(), 30.0d))) {
            int[] iArr = new int[lIIlIIIlIl[1]];
            iArr[lIIlIIIlIl[0]] = lIIlIIIlIl[18];
            if (llllIllIIlII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIIIlIl[1]];
                iArr2[lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                Inventory.getFirst(iArr2).interact(lIIlIIIlII[lIIlIIIlIl[41]]);
                Time.sleepTicks(lIIlIIIlIl[1]);
                "".length();
            }
        }
        if (llllIllIllIl(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (llllIllIIlII(npc.getName().contains(lIIlIIIlII[lIIlIIIlIl[75]]) ? 1 : 0) && llllIllIIllI(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIIlIIIlIl[1];
                    "".length();
                    return (-" ".length()) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIlIIIlIl[0];
            });
            String[] strArr = new String[lIIlIIIlIl[2]];
            strArr[lIIlIIIlIl[0]] = lIIlIIIlII[lIIlIIIlIl[42]];
            strArr[lIIlIIIlIl[1]] = lIIlIIIlII[lIIlIIIlIl[43]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (llllIllIlllI(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIIlIIIlIl[1];
                    "".length();
                    return (((13 ^ 53) ^ (151 ^ 169)) & (((122 ^ 90) ^ (191 ^ 153)) ^ (-" ".length()))) != 0 ? ((92 ^ 0) ^ (40 ^ 50)) & (((((26 + 78) - (-64)) + 68) ^ (((131 + 134) - 190) + 95)) ^ (-" ".length())) : r0;
                }
                return lIIlIIIlIl[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIIlIIIlIl[1]];
            iArr3[lIIlIIIlIl[0]] = lIIlIIIlIl[44];
            if (llllIllIIlII(Equipment.contains(iArr3) ? 1 : 0) && llllIllIIllI(ad() ? 1 : 0)) {
                ae();
            }
            if (llllIllIIlll(nearest) && llllIllIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[45]];
                nearest.interact(lIIlIIIlII[lIIlIIIlIl[46]]);
                Time.sleepTicks(lIIlIIIlIl[3]);
                "".length();
            }
        }
        if (llllIllIIlll(Players.getLocal().getInteracting())) {
            AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[47]];
            Time.sleepTicks(lIIlIIIlIl[1]);
            "".length();
        }
    }

    private static boolean llllIllIIlII(int i) {
        return i != 0;
    }

    private static boolean llllIllIllIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llllIllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01dc, code lost:
        if (llllIllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026a, code lost:
        if (llllIllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x033c, code lost:
        if (llllIllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[19])) {
            int[] iArr = new int[lIIlIIIlIl[1]];
            iArr[lIIlIIIlIl[0]] = lIIlIIIlIl[7];
            if (llllIllIIlII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIIIlIl[1]];
                iArr2[lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                if (llllIllIIlII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlIIIlIl[1]];
                    iArr3[lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                    if (llllIllIIlII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIlIIIlIl[1]];
                        iArr4[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                        if (llllIllIIlII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIlIIIlIl[1]];
                            iArr5[lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                            if (llllIllIIlII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIlIIIlIl[1]];
                                iArr6[lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                if (llllIllIIllI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIlIIIlIl[1]];
                                    iArr7[lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                }
                                ?? r0 = lIIlIIIlIl[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return lIIlIIIlIl[0];
        } else if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[19]) && llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6])) {
            int[] iArr8 = new int[lIIlIIIlIl[1]];
            iArr8[lIIlIIIlIl[0]] = lIIlIIIlIl[11];
            if (llllIllIIlII(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIlIIIlIl[1]];
                iArr9[lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                if (llllIllIIlII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlIIIlIl[1]];
                    iArr10[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                    if (llllIllIIlII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIlIIIlIl[1]];
                        iArr11[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                        if (llllIllIIlII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIlIIIlIl[1]];
                            iArr12[lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                            if (llllIllIIllI(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIlIIIlIl[1]];
                                iArr13[lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                            }
                            ?? r02 = lIIlIIIlIl[1];
                            "".length();
                            return " ".length() <= ((50 ^ 31) & ((134 ^ 171) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lIIlIIIlIl[0];
        } else if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6]) && llllIllIIllI(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIIlIIIlIl[1]];
            iArr14[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
            if (llllIllIIllI(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIlIIIlIl[1]];
                iArr15[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
            }
            int[] iArr16 = new int[lIIlIIIlIl[1]];
            iArr16[lIIlIIIlIl[0]] = lIIlIIIlIl[22];
            if (llllIllIIlII(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIlIIIlIl[1]];
                iArr17[lIIlIIIlIl[0]] = lIIlIIIlIl[23];
                if (llllIllIIlII(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIlIIIlIl[1];
                    "".length();
                    return 0 != 0 ? ((((62 + 223) - 38) + 2) ^ (((21 + 91) - 30) + 92)) & (((89 ^ 125) ^ (241 ^ 130)) ^ (-" ".length())) : r03;
                }
            }
            return lIIlIIIlIl[0];
        } else if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6]) && llllIllIIlII(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIIlIIIlIl[1]];
            iArr18[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
            if (llllIllIIllI(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIlIIIlIl[1]];
                iArr19[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
            }
            int[] iArr20 = new int[lIIlIIIlIl[1]];
            iArr20[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
            if (llllIllIIlII(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIlIIIlIl[1]];
                iArr21[lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                if (llllIllIIlII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIlIIIlIl[1]];
                    iArr22[lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                    if (llllIllIlIIl(Bank.getFirst(iArr22).getQuantity(), lIIlIIIlIl[17])) {
                        int[] iArr23 = new int[lIIlIIIlIl[1]];
                        iArr23[lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                        if (llllIllIIlII(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIlIIIlIl[1]];
                            iArr24[lIIlIIIlIl[0]] = lIIlIIIlIl[23];
                            if (llllIllIIlII(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIlIIIlIl[1];
                                "".length();
                                return 0 != 0 ? ((((83 + 113) - 188) + 127) ^ (((161 + 30) - 178) + 174)) & (((82 ^ 49) ^ (240 ^ 175)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIIlIIIlIl[0];
        } else {
            return lIIlIIIlIl[0];
        }
    }

    private static boolean llllIllIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llllIllIlIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean llllIllIlIIl(int i, int i2) {
        return i >= i2;
    }

    private static String llllIllIIIII(String lIIlIIIIll, String lIIlIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIIlIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIIIlII2) {
            lIIlIIIlII2.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllIIlll(Object obj) {
        return obj != null;
    }

    private static void llllIllIIIlI() {
        lIIlIIIlII = new String[lIIlIIIlIl[25]];
        lIIlIIIlII[lIIlIIIlIl[0]] = llllIlIlllll("DzY9OQEqYy0kCiAw", "MCDPo");
        lIIlIIIlII[lIIlIIIlIl[1]] = llllIllIIIII("vUA9u8ToaW+ynFu019lv//ZJseBsQmRHX5B6E5A1xNW00eRmey43w6Qibvr4JD3eSkhpUhHQ3RE=", "Wccsp");
        lIIlIIIlII[lIIlIIIlIl[2]] = llllIllIIIII("76AcpLYLPidK8mlS8UFou9wux0B3t+hU", "iMVDr");
        lIIlIIIlII[lIIlIIIlIl[3]] = llllIlIlllll("PSYHJj4cKQ5iMBQpAis8Eg==", "uGiBR");
        lIIlIIIlII[lIIlIIIlIl[5]] = llllIlIlllll("IQd0MSoTQjk5KwULOjd4BRckIDQfByd8eAUVPSQ7Hgs6N3gCDXQSDS8rGhc=", "vbTPX");
        lIIlIIIlII[lIIlIIIlIl[17]] = llllIllIIIIl("6CMkLyAVPH7tqKs0jB2x3A==", "eowER");
        lIIlIIIlII[lIIlIIIlIl[24]] = llllIllIIIIl("x84aIjLRnZZ9xLe8phqqZQ==", "LGIYK");
        lIIlIIIlII[lIIlIIIlIl[26]] = llllIlIlllll("LTcVHyUAMUYdLRwkCQgnTiIDByk=", "nVfkL");
        lIIlIIIlII[lIIlIIIlIl[29]] = llllIlIlllll("FDMdNhE5NU4uDTowF2IMMj4L", "WRnBx");
        lIIlIIIlII[lIIlIIIlIl[31]] = llllIlIlllll("EDk5EBM9P2oCGz80M0QONjQv", "SXJdz");
        lIIlIIIlII[lIIlIIIlIl[32]] = llllIllIIIIl("L1OMNss8HYBc2ChmmpvLSPlTSGpVJfuq", "eoRxl");
        lIIlIIIlII[lIIlIIIlIl[33]] = llllIllIIIIl("w7H73CdJTmo=", "TsAjd");
        lIIlIIIlII[lIIlIIIlIl[34]] = llllIllIIIIl("Y40eG6hxOO8=", "EMNNG");
        lIIlIIIlII[lIIlIIIlIl[36]] = llllIllIIIIl("UFham3rDYLD3i4biYym5nUjMNRS/xhVc", "HlRMQ");
        lIIlIIIlII[lIIlIIIlIl[40]] = llllIllIIIII("geYxFEkyesdsN1wo5RpWHw==", "JuzLY");
        lIIlIIIlII[lIIlIIIlIl[41]] = llllIlIlllll("IjgY", "gYlRF");
        lIIlIIIlII[lIIlIIIlIl[42]] = llllIllIIIII("p3P66hLSGD8=", "QMDBr");
        lIIlIIIlII[lIIlIIIlIl[43]] = llllIllIIIII("xQy4AbtnXmY=", "RdtiT");
        lIIlIIIlII[lIIlIIIlIl[45]] = llllIllIIIII("pkNnIk6zdP5p1waLULXLzA==", "fWHoe");
        lIIlIIIlII[lIIlIIIlIl[46]] = llllIllIIIIl("EcmjHiOcMWg=", "SnerH");
        lIIlIIIlII[lIIlIIIlIl[47]] = llllIlIlllll("PwV2DD8bCTcb", "vkVoP");
        lIIlIIIlII[lIIlIIIlIl[51]] = llllIllIIIIl("zq5t3+pCXnmME2Mv8WX0TXvIzs9PqnDM", "yaoKE");
        lIIlIIIlII[lIIlIIIlIl[52]] = llllIlIlllll("IQM+IwUHSyI8Ew4H", "bkQLv");
        lIIlIIIlII[lIIlIIIlIl[54]] = llllIlIlllll("ES0pPHEVMDUxOiM=", "FDGXQ");
        lIIlIIIlII[lIIlIIIlIl[55]] = llllIlIlllll("Lw4GIABYPAY3GxMK", "xorEr");
        lIIlIIIlII[lIIlIIIlIl[19]] = llllIllIIIII("GmYtzDkGLLVm7w2RPQbpHg==", "aKCeq");
        lIIlIIIlII[lIIlIIIlIl[50]] = llllIllIIIII("rBkFWYSqu8Z+qaAwCnYuXg==", "cikbC");
        lIIlIIIlII[lIIlIIIlIl[56]] = llllIllIIIIl("7LKFtIMgeVL/+ZF3Q5M74A==", "lubcL");
        lIIlIIIlII[lIIlIIIlIl[72]] = llllIllIIIII("TNeburdR2v+Dh5Y0wtobZA==", "pDCJI");
        lIIlIIIlII[lIIlIIIlIl[74]] = llllIllIIIII("HewUm63QynDLbASnKLAJwh0zwmMjKr2G", "dEhXN");
        lIIlIIIlII[lIIlIIIlIl[75]] = llllIllIIIII("8s5lLPXzf3U=", "rNSCh");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (llllIllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d7, code lost:
        if (llllIllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x025d, code lost:
        if (llllIllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x035b, code lost:
        if (llllIllIIlII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
        if (llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[19])) {
            int[] iArr = new int[lIIlIIIlIl[1]];
            iArr[lIIlIIIlIl[0]] = lIIlIIIlIl[7];
            if (llllIllIIlII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIIIlIl[1]];
                iArr2[lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                if (llllIllIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlIIIlIl[1]];
                    iArr3[lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                    if (llllIllIIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIlIIIlIl[1]];
                        iArr4[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                        if (llllIllIIlII(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIlIIIlIl[1]];
                            iArr5[lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                            if (llllIllIIlII(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIlIIIlIl[1]];
                                iArr6[lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                if (llllIllIIllI(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIlIIIlIl[1]];
                                    iArr7[lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                }
                                ?? r0 = lIIlIIIlIl[1];
                                "".length();
                                return 0 != 0 ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIIlIIIlIl[0];
        } else if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[19]) && llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6])) {
            int[] iArr8 = new int[lIIlIIIlIl[1]];
            iArr8[lIIlIIIlIl[0]] = lIIlIIIlIl[11];
            if (llllIllIIlII(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIlIIIlIl[1]];
                iArr9[lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                if (llllIllIIlII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlIIIlIl[1]];
                    iArr10[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                    if (llllIllIIlII(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIlIIIlIl[1]];
                        iArr11[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                        if (llllIllIIlII(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIlIIIlIl[1]];
                            iArr12[lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                            if (llllIllIIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIlIIIlIl[1]];
                                iArr13[lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                            }
                            ?? r02 = lIIlIIIlIl[1];
                            "".length();
                            return (-" ".length()) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lIIlIIIlIl[0];
        } else if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6]) && llllIllIIllI(bu ? 1 : 0)) {
            int[] iArr14 = new int[lIIlIIIlIl[1]];
            iArr14[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
            if (llllIllIIllI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIlIIIlIl[1]];
                iArr15[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
            }
            int[] iArr16 = new int[lIIlIIIlIl[1]];
            iArr16[lIIlIIIlIl[0]] = lIIlIIIlIl[22];
            if (llllIllIIlII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIlIIIlIl[1]];
                iArr17[lIIlIIIlIl[0]] = lIIlIIIlIl[35];
                if (llllIllIIlII(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIlIIIlIl[1];
                    "".length();
                    return (((5 ^ 30) ^ (121 ^ 95)) & (((125 ^ 79) ^ (86 ^ 89)) ^ (-" ".length()))) >= ((((22 + 32) - 3) + 95) ^ (((128 + 143) - 169) + 48)) ? ((108 ^ 6) ^ (142 ^ 178)) & (((174 ^ 139) ^ (45 ^ 94)) ^ (-" ".length())) : r03;
                }
            }
            return lIIlIIIlIl[0];
        } else if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6]) && llllIllIIlII(bu ? 1 : 0)) {
            int[] iArr18 = new int[lIIlIIIlIl[1]];
            iArr18[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
            if (llllIllIIllI(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIlIIIlIl[1]];
                iArr19[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
            }
            int[] iArr20 = new int[lIIlIIIlIl[1]];
            iArr20[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
            if (llllIllIIlII(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIlIIIlIl[1]];
                iArr21[lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                if (llllIllIIlII(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIlIIIlIl[1]];
                    iArr22[lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                    if (llllIllIlIIl(Inventory.getFirst(iArr22).getQuantity(), lIIlIIIlIl[17])) {
                        int[] iArr23 = new int[lIIlIIIlIl[1]];
                        iArr23[lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                        if (llllIllIIlII(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIlIIIlIl[1]];
                            iArr24[lIIlIIIlIl[0]] = lIIlIIIlIl[35];
                            if (llllIllIIlII(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIlIIIlIl[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
                            }
                        }
                    }
                }
            }
            return lIIlIIIlIl[0];
        } else {
            return lIIlIIIlIl[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIIIlIl[0];
    }

    private static void af() {
        if (llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6])) {
            int[] iArr = new int[lIIlIIIlIl[1]];
            iArr[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
            if (llllIllIIllI(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIIlIl[14], lIIlIIIlIl[57], lIIlIIIlIl[58]));
                "".length();
            }
            int[] iArr2 = new int[lIIlIIIlIl[1]];
            iArr2[lIIlIIIlIl[0]] = lIIlIIIlIl[7];
            if (llllIllIIllI(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIIlIl[7], lIIlIIIlIl[59], lIIlIIIlIl[24]));
                "".length();
            }
            int[] iArr3 = new int[lIIlIIIlIl[1]];
            iArr3[lIIlIIIlIl[0]] = lIIlIIIlIl[9];
            if (llllIllIIllI(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIIlIl[9], lIIlIIIlIl[60], lIIlIIIlIl[24]));
                "".length();
            }
            int[] iArr4 = new int[lIIlIIIlIl[1]];
            iArr4[lIIlIIIlIl[0]] = lIIlIIIlIl[11];
            if (llllIllIIllI(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIIlIl[11], lIIlIIIlIl[61], lIIlIIIlIl[24]));
                "".length();
            }
            int[] iArr5 = new int[lIIlIIIlIl[1]];
            iArr5[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
            if (llllIllIIllI(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIIlIl[12], lIIlIIIlIl[4], lIIlIIIlIl[24]));
                "".length();
            }
            int[] iArr6 = new int[lIIlIIIlIl[1]];
            iArr6[lIIlIIIlIl[0]] = lIIlIIIlIl[44];
            if (llllIllIIllI(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIIlIl[44], lIIlIIIlIl[1], C0004e.c(lIIlIIIlIl[62], lIIlIIIlIl[63])));
                "".length();
            }
        }
        if (llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[6])) {
            int[] iArr7 = new int[lIIlIIIlIl[1]];
            iArr7[lIIlIIIlIl[0]] = lIIlIIIlIl[22];
            if (llllIllIIlII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIlIIIlIl[1]];
                iArr8[lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                if (llllIllIIlIl(Bank.getFirst(iArr8).getQuantity(), lIIlIIIlIl[61])) {
                    int i = lIIlIIIlIl[22];
                    int i2 = lIIlIIIlIl[61];
                    int[] iArr9 = new int[lIIlIIIlIl[1]];
                    iArr9[lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                    bv.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIIlIIIlIl[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIIlIIIlIl[1]];
            iArr10[lIIlIIIlIl[0]] = lIIlIIIlIl[22];
            if (llllIllIIllI(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIIlIl[22], lIIlIIIlIl[61], lIIlIIIlIl[64]));
                "".length();
            }
            int[] iArr11 = new int[lIIlIIIlIl[1]];
            iArr11[lIIlIIIlIl[0]] = lIIlIIIlIl[23];
            if (llllIllIIlII(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIlIIIlIl[1]];
                iArr12[lIIlIIIlIl[0]] = lIIlIIIlIl[23];
                if (llllIllIIlIl(Bank.getFirst(iArr12).getQuantity(), lIIlIIIlIl[61])) {
                    int i3 = lIIlIIIlIl[23];
                    int i4 = lIIlIIIlIl[61];
                    int[] iArr13 = new int[lIIlIIIlIl[1]];
                    iArr13[lIIlIIIlIl[0]] = lIIlIIIlIl[23];
                    bv.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIIlIIIlIl[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIIlIIIlIl[1]];
            iArr14[lIIlIIIlIl[0]] = lIIlIIIlIl[23];
            if (llllIllIIllI(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIIlIl[23], lIIlIIIlIl[61], lIIlIIIlIl[65]));
                "".length();
            }
            int[] iArr15 = new int[lIIlIIIlIl[1]];
            iArr15[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
            if (llllIllIIllI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIlIIIlIl[1]];
                iArr16[lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                if (llllIllIIllI(Equipment.contains(iArr16) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlIIIlIl[20], lIIlIIIlIl[1], lIIlIIIlIl[66]));
                    "".length();
                }
            }
            if (llllIllIIlII(bu ? 1 : 0)) {
                int[] iArr17 = new int[lIIlIIIlIl[1]];
                iArr17[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                if (llllIllIIlII(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIIlIIIlIl[1]];
                    iArr18[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                    if (llllIllIIlIl(Bank.getFirst(iArr18).getQuantity(), lIIlIIIlIl[61])) {
                        int i5 = lIIlIIIlIl[14];
                        int i6 = lIIlIIIlIl[61];
                        int[] iArr19 = new int[lIIlIIIlIl[1]];
                        iArr19[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                        bv.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIIlIIIlIl[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIIlIIIlIl[1]];
                iArr20[lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                if (llllIllIIllI(Bank.contains(iArr20) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlIIIlIl[14], lIIlIIIlIl[61], lIIlIIIlIl[58]));
                    "".length();
                }
                int[] iArr21 = new int[lIIlIIIlIl[1]];
                iArr21[lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                if (llllIllIIlII(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIlIIIlIl[1]];
                    iArr22[lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                    if (llllIllIIlIl(Bank.getFirst(iArr22).getQuantity(), lIIlIIIlIl[66])) {
                        int i7 = lIIlIIIlIl[21];
                        int i8 = lIIlIIIlIl[66];
                        int[] iArr23 = new int[lIIlIIIlIl[1]];
                        iArr23[lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                        bv.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIIlIIIlIl[24]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIIlIIIlIl[1]];
                iArr24[lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                if (llllIllIIllI(Bank.contains(iArr24) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlIIIlIl[21], lIIlIIIlIl[66], lIIlIIIlIl[24]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIIlIIIlIl[1]];
        iArr25[lIIlIIIlIl[0]] = lIIlIIIlIl[18];
        if (llllIllIIllI(Bank.contains(iArr25) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIlIl[18], lIIlIIIlIl[67], lIIlIIIlIl[37]));
            "".length();
        }
        if (llllIllIIllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlIIIlII[lIIlIIIlIl[74]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIlIl[68], lIIlIIIlIl[17], lIIlIIIlIl[69]));
            "".length();
        }
        int[] iArr26 = new int[lIIlIIIlIl[1]];
        iArr26[lIIlIIIlIl[0]] = lIIlIIIlIl[70];
        if (llllIllIIllI(Bank.contains(iArr26) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIlIl[70], lIIlIIIlIl[32], lIIlIIIlIl[71]));
            "".length();
        }
        int[] iArr27 = new int[lIIlIIIlIl[1]];
        iArr27[lIIlIIIlIl[0]] = lIIlIIIlIl[16];
        if (llllIllIIllI(Bank.contains(iArr27) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIlIl[16], lIIlIIIlIl[32], lIIlIIIlIl[71]));
            "".length();
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlIIIlII[lIIlIIIlIl[72]];
    }

    private static String llllIlIlllll(String lIIIlIIllI, String lIIIlIIIII) {
        String lIIIlIIllI2 = new String(Base64.getDecoder().decode(lIIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlIIlII = new StringBuilder();
        char[] charArray = lIIIlIIIII.toCharArray();
        int lIIIlIIIlI = lIIlIIIlIl[0];
        char[] charArray2 = lIIIlIIllI2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIIIlIl[0];
        while (llllIllIIlIl(i, length)) {
            char lIIIlIIlll = charArray2[i];
            lIIIlIIlII.append((char) (lIIIlIIlll ^ charArray[lIIIlIIIlI % charArray.length]));
            "".length();
            lIIIlIIIlI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lIIIlIIlII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ad() {
        if (llllIllIlIlI(Vars.getBit(lIIlIIIlIl[48]), lIIlIIIlIl[1]) && llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[17])) {
            return lIIlIIIlIl[1];
        }
        if (llllIllIlIlI(Vars.getBit(lIIlIIIlIl[48]), lIIlIIIlIl[2]) && llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[31]) && llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[17])) {
            return lIIlIIIlIl[1];
        }
        if (llllIllIlIlI(Vars.getBit(lIIlIIIlIl[48]), lIIlIIIlIl[3]) && llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[31]) && llllIllIIlIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[36])) {
            return lIIlIIIlIl[1];
        }
        if (llllIllIlIlI(Vars.getBit(lIIlIIIlIl[48]), lIIlIIIlIl[3]) && llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[31])) {
            int[] iArr = new int[lIIlIIIlIl[1]];
            iArr[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
            if (llllIllIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                return lIIlIIIlIl[1];
            }
        }
        if (llllIllIlIlI(Vars.getBit(lIIlIIIlIl[48]), lIIlIIIlIl[5]) && llllIllIlIIl(Skills.getLevel(Skill.MAGIC), lIIlIIIlIl[36])) {
            int[] iArr2 = new int[lIIlIIIlIl[1]];
            iArr2[lIIlIIIlIl[0]] = lIIlIIIlIl[12];
            if (llllIllIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIlIIIlIl[1];
            }
        }
        return lIIlIIIlIl[0];
    }

    private static boolean llllIllIllll(int i, int i2) {
        return i > i2;
    }
}
