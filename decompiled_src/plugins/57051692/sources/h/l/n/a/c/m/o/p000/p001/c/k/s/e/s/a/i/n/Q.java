package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Q  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/Q.class */
public class Q implements K {
    private static /* synthetic */ int[] lIlIIIIlIl;
    private static /* synthetic */ String[] lIlIIIIlII;
    public static /* synthetic */ boolean cc;
    static /* synthetic */ WorldPoint ce;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ WorldArea cd;
    public static /* synthetic */ List<C0003d> bp;
    static /* synthetic */ WorldPoint cf;

    private static boolean lIIIlIIIlIIll(int i, int i2) {
        return i >= i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            ai();
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return ((121 ^ 21) ^ (5 ^ 92)) & (((124 ^ 12) ^ (130 ^ 199)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlIIIIlIl[68];
    }

    private static boolean lIIIlIIIlIlll(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v368, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v403, types: [boolean] */
    public static void ai() {
        if (lIIIlIIIIlllI(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[0]];
            C0001b.a(bp);
            if (lIIIlIIIIllll(bp.size(), lIlIIIIlIl[1])) {
                System.out.println(lIlIIIIlII[lIlIIIIlIl[1]]);
                bn = lIlIIIIlIl[0];
            }
        }
        if (lIIIlIIIlIIII(bn ? 1 : 0) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2])) {
            if (lIIIlIIIlIIII(al() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIlIIIlIIIl(nearest) && lIIIlIIIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[3]];
                    C0000a.a(nearest);
                }
                if (lIIIlIIIlIIIl(nearest) && lIIIlIIIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[4]];
                    if (lIIIlIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIIIlIl[5]);
                        "".length();
                        Time.sleepTicks(lIlIIIIlIl[6]);
                        "".length();
                    }
                    if (lIIIlIIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIlIIIlIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIIIlIl[7]);
                            "".length();
                        }
                        while (lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2]) && lIIIlIIIlIIII(C0024y.bv() ? 1 : 0)) {
                            C0024y.bt();
                            Time.sleepTicks(lIlIIIIlIl[1]);
                            "".length();
                            "".length();
                            if ((((126 ^ 38) ^ (54 ^ 15)) & (((((97 + 207) - 221) + 151) ^ (((115 + 132) - 184) + 76)) ^ (-" ".length()))) != (((172 ^ 184) ^ (118 ^ 76)) & (((174 ^ 178) ^ (29 ^ 47)) ^ (-" ".length())))) {
                                return;
                            }
                        }
                        if (lIIIlIIIlIIII(am() ? 1 : 0)) {
                            O();
                            System.out.println(lIlIIIIlII[lIlIIIIlIl[7]]);
                            bn = lIlIIIIlIl[1];
                            return;
                        }
                        if (lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2])) {
                            int[] iArr = new int[lIlIIIIlIl[1]];
                            iArr[lIlIIIIlIl[0]] = lIlIIIIlIl[8];
                            if (lIIIlIIIIlllI(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIlIIIIlIl[1]];
                                iArr2[lIlIIIIlIl[0]] = lIlIIIIlIl[8];
                                if (lIIIlIIIIllll(Inventory.getCount(iArr2), lIlIIIIlIl[1])) {
                                    Bank.withdraw(lIlIIIIlIl[8], lIlIIIIlIl[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIlIIIIlIl[1]];
                                        iArr3[lIlIIIIlIl[0]] = lIlIIIIlIl[8];
                                        if (lIIIlIIIlIIlI(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIlIIIIlIl[1];
                                            "".length();
                                            return " ".length() <= ((32 ^ 2) & ((7 ^ 37) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlIIIIlIl[0];
                                    }, lIlIIIIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIlIIIIlIl[1]];
                            iArr3[lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                            if (lIIIlIIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIlIIIIlIl[1]];
                                iArr4[lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                                if (lIIIlIIIIllll(Inventory.getCount(iArr4), lIlIIIIlIl[1])) {
                                    Bank.withdraw(lIlIIIIlIl[10], lIlIIIIlIl[11], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIlIIIIlIl[1]];
                                        iArr5[lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                                        if (lIIIlIIIlIIlI(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIlIIIIlIl[1];
                                            "".length();
                                            return (((136 ^ 142) ^ (38 ^ 112)) & (((154 ^ 140) ^ (226 ^ 164)) ^ (-" ".length()))) < (-" ".length()) ? ((60 ^ 54) ^ (79 ^ 12)) & (((((73 + 188) - 92) + 31) ^ (((117 + 74) - 98) + 36)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIIIIlIl[0];
                                    }, lIlIIIIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIlIIIIlIl[1]];
                            iArr5[lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                            if (lIIIlIIIIlllI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlIIIIlIl[1]];
                                iArr6[lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                                if (lIIIlIIIIllll(Inventory.getCount(iArr6), lIlIIIIlIl[1])) {
                                    Bank.withdraw(lIlIIIIlIl[12], lIlIIIIlIl[11], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIlIIIIlIl[1]];
                                        iArr7[lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                                        if (lIIIlIIIlIIlI(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIlIIIIlIl[1];
                                            "".length();
                                            return (((102 ^ 23) ^ (8 ^ 95)) & (((((33 + 96) - 34) + 40) ^ (((129 + 74) - 166) + 124)) ^ (-" ".length()))) > 0 ? ((131 ^ 159) ^ (248 ^ 194)) & (((114 ^ 118) ^ (131 ^ 161)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIIIIlIl[0];
                                    }, lIlIIIIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIlIIIIlIl[1]];
                            iArr7[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                            if (lIIIlIIIIlllI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIlIIIIlIl[1]];
                                iArr8[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                                if (lIIIlIIIIllll(Inventory.getCount(iArr8), lIlIIIIlIl[1])) {
                                    Bank.withdraw(lIlIIIIlIl[13], lIlIIIIlIl[14], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIlIIIIlIl[1]];
                                        iArr9[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                                        if (lIIIlIIIlIIlI(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIlIIIIlIl[1];
                                            "".length();
                                            return (-"   ".length()) > 0 ? ((((64 + 52) - 98) + 125) ^ (((79 + 40) - 105) + 137)) & (((64 ^ 62) ^ (108 ^ 10)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIIIIlIl[0];
                                    }, lIlIIIIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIlIIIIlIl[1]];
                            iArr9[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                            if (lIIIlIIIIlllI(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIlIIIIlIl[1]];
                                iArr10[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                                if (lIIIlIIIIllll(Inventory.getCount(iArr10), lIlIIIIlIl[1])) {
                                    Bank.withdraw(lIlIIIIlIl[15], lIlIIIIlIl[9], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIlIIIIlIl[1]];
                                        iArr11[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                                        if (lIIIlIIIlIIlI(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIlIIIIlIl[1];
                                            "".length();
                                            return (((((134 + 174) - 170) + 67) ^ (((84 + 100) - 77) + 29)) & (((((166 + 9) - 27) + 61) ^ (((11 + 58) - 14) + 93)) ^ (-" ".length()))) == "   ".length() ? ((((153 + 19) - 43) + 50) ^ (((66 + 30) - 76) + 122)) & (((30 ^ 121) ^ (125 ^ 39)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIIIIlIl[0];
                                    }, lIlIIIIlIl[5]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIlIIIIlIl[1]];
                            iArr11[lIlIIIIlIl[0]] = lIlIIIIlIl[16];
                            if (lIIIlIIIIlllI(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIlIIIIlIl[1]];
                                iArr12[lIlIIIIlIl[0]] = lIlIIIIlIl[16];
                                if (lIIIlIIIlIIII(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIlIIIIlIl[16], lIlIIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIlIIIIlIl[1]];
                                        iArr13[lIlIIIIlIl[0]] = lIlIIIIlIl[16];
                                        return Inventory.contains(iArr13);
                                    }, lIlIIIIlIl[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIlIIIIlIl[17], lIlIIIIlIl[18], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIlIIIIlIl[1]];
                            iArr13[lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                            if (lIIIlIIIIlllI(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIlIIIIlIl[1]];
                                iArr14[lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                                if (lIIIlIIIIllll(Inventory.getCount(iArr14), lIlIIIIlIl[1]) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[20])) {
                                    Bank.withdrawAll(lIlIIIIlIl[19], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIlIIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIlIIIIlIl[1]];
                                        iArr15[lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                                        if (lIIIlIIIlIIlI(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIlIIIIlIl[1];
                                            "".length();
                                            return "  ".length() <= ((89 ^ 21) & ((208 ^ 156) ^ (-1))) ? (true ^ true) & ((!true) ^ true) : r0;
                                        }
                                        return lIlIIIIlIl[0];
                                    }, lIlIIIIlIl[5]);
                                    "".length();
                                }
                            }
                        }
                        if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2])) {
                            int[] iArr15 = new int[lIlIIIIlIl[1]];
                            iArr15[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                            if (lIIIlIIIlIIII(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIlIIIIlIl[21], lIlIIIIlIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlIIIIlIl[1]);
                                "".length();
                            }
                            if (lIIIlIIIIlllI(cc ? 1 : 0)) {
                                Bank.withdrawAll(lIlIIIIlIl[22], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlIIIIlIl[1]);
                                "".length();
                                Bank.withdrawAll(lIlIIIIlIl[15], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIlIIIIlIl[1]);
                                "".length();
                            }
                            Time.sleepTicks(lIlIIIIlIl[4]);
                            "".length();
                            Bank.withdrawAll(lIlIIIIlIl[23], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIlIIIIlIl[1]);
                            "".length();
                            Bank.withdrawAll(lIlIIIIlIl[24], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIlIIIIlIl[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIIlIIIIlllI(al() ? 1 : 0)) {
                if (lIIIlIIIIlllI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[20])) {
                    if (lIIIlIIIlIIII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[18]];
                        Movement.walkTo(ce);
                        "".length();
                        Time.sleepTicks(lIlIIIIlIl[1]);
                        "".length();
                    }
                    if (lIIIlIIIIlllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[6]];
                        ak();
                    }
                }
                if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[20]) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[25])) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[26]];
                    if (lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIlIIIIlIl[1]);
                        "".length();
                    }
                }
                if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[25]) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[28])) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[29]];
                    if (lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIlIIIIlIl[1]);
                        "".length();
                    }
                }
                if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[28]) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[30])) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[31]];
                    if (lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIlIIIIlIl[1]);
                        "".length();
                    }
                }
                if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[30]) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2])) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[32]];
                    if (lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIlIIIIlIl[1]);
                        "".length();
                    }
                }
                if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2])) {
                    AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[33]];
                    if (lIIIlIIIlIlIl(cf)) {
                        cf = new WorldPoint(lIlIIIIlIl[34] + C0004e.c(lIlIIIIlIl[1], lIlIIIIlIl[7]), lIlIIIIlIl[35], lIlIIIIlIl[0]);
                    }
                    int[] iArr16 = new int[lIlIIIIlIl[1]];
                    iArr16[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                    if (lIIIlIIIIlllI(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIlIIIIlIl[1]];
                        iArr17[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                        if (lIIIlIIIlIIII(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIlIIIIlIl[1]];
                            iArr18[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                            Inventory.getFirst(iArr18).interact(lIlIIIIlII[lIlIIIIlIl[36]]);
                            Time.sleepTicks(lIlIIIIlIl[1]);
                            "".length();
                        }
                    }
                    if (lIIIlIIIIlllI(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIlIIIIlIl[1]];
                    iArr19[lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIlIIIIlIl[1]];
                    iArr20[lIlIIIIlIl[0]] = lIlIIIIlIl[37];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lIIIlIIIlIIII(cc ? 1 : 0) && lIIIlIIIlIIIl(cf)) {
                        if (lIIIlIIIlIIII(Players.getLocal().getWorldLocation().equals(cf) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[38]];
                            Movement.walkTo(cf);
                            "".length();
                            Time.sleepTicks(lIlIIIIlIl[1]);
                            "".length();
                        }
                        if (lIIIlIIIIlllI(Players.getLocal().getWorldLocation().equals(cf) ? 1 : 0) && lIIIlIIIlIIIl(first) && lIIIlIIIlIIIl(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIIlIIIllIIl(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIlIIIIlIl[1];
                                    "".length();
                                    return "  ".length() <= (-" ".length()) ? ((((134 + 73) - 99) + 68) ^ (((31 + 87) - 44) + 100)) & (((((78 + 112) - 179) + 124) ^ (((43 + 42) - 79) + 147)) ^ (-" ".length())) : r0;
                                }
                                return lIlIIIIlIl[0];
                            }, lIlIIIIlIl[9]);
                            "".length();
                            Time.sleep(C0004e.c(lIlIIIIlIl[39], lIlIIIIlIl[40]));
                            "".length();
                        }
                    }
                    if (lIIIlIIIIlllI(cc ? 1 : 0)) {
                        if (lIIIlIIIlIIIl(first) && lIIIlIIIlIIIl(first2) && lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lIIIlIIIllIIl(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIlIIIIlIl[1];
                                    "".length();
                                    return 0 != 0 ? ((95 ^ 47) ^ (57 ^ 42)) & (((63 ^ 43) ^ (235 ^ 156)) ^ (-" ".length())) : r0;
                                }
                                return lIlIIIIlIl[0];
                            }, lIlIIIIlIl[9]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lIIIlIIIlIlII(Players.getLocal().getAnimation(), lIlIIIIlIl[27])) {
                                ?? r0 = lIlIIIIlIl[1];
                                "".length();
                                return (162 ^ 166) < ((9 ^ 69) & ((66 ^ 14) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlIIIIlIl[0];
                        }, lIlIIIIlIl[41]);
                        "".length();
                    }
                }
            }
        }
    }

    private static int lIIIlIIIlIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean an() {
        if (lIIIlIIIlIlII(Vars.getBit(lIlIIIIlIl[49]), lIlIIIIlIl[1]) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[18])) {
            return lIlIIIIlIl[1];
        }
        if (lIIIlIIIlIlII(Vars.getBit(lIlIIIIlIl[49]), lIlIIIIlIl[3]) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[31]) && lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[18])) {
            return lIlIIIIlIl[1];
        }
        if (lIIIlIIIlIlII(Vars.getBit(lIlIIIIlIl[49]), lIlIIIIlIl[4]) && lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[31]) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[38])) {
            return lIlIIIIlIl[1];
        }
        if (lIIIlIIIlIlII(Vars.getBit(lIlIIIIlIl[49]), lIlIIIIlIl[4]) && lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[31])) {
            int[] iArr = new int[lIlIIIIlIl[1]];
            iArr[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
            if (lIIIlIIIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
                return lIlIIIIlIl[1];
            }
        }
        if (lIIIlIIIlIlII(Vars.getBit(lIlIIIIlIl[49]), lIlIIIIlIl[7]) && lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[38])) {
            int[] iArr2 = new int[lIlIIIIlIl[1]];
            iArr2[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
            if (lIIIlIIIIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlIIIIlIl[1];
            }
        }
        return lIlIIIIlIl[0];
    }

    private static boolean lIIIlIIIllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    static {
        lIIIlIIIIllIl();
        lIIIlIIIIllII();
        cc = lIlIIIIlIl[0];
        bp = new ArrayList();
        cd = new WorldArea(lIlIIIIlIl[76], lIlIIIIlIl[77], lIlIIIIlIl[52], lIlIIIIlIl[42], lIlIIIIlIl[0]);
        ce = new WorldPoint(lIlIIIIlIl[78], lIlIIIIlIl[79], lIlIIIIlIl[0]);
        cf = null;
    }

    private static String lIIIlIIIIIllI(String llllllllllllllllllllIlIlIllIIIlI, String llllllllllllllllllllIlIlIllIIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllllIlIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllllIlIlIllIIIIl.toCharArray();
        int llllllllllllllllllllIlIlIlIllllI = lIlIIIIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIIlIl[0];
        while (lIIIlIIIIllll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllllllIlIlIlIllllI % charArray.length]));
            "".length();
            llllllllllllllllllllIlIlIlIllllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIlIIIlIIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlIIIlIlII(int i, int i2) {
        return i == i2;
    }

    private static void lIIIlIIIIllIl() {
        lIlIIIIlIl = new int[81];
        lIlIIIIlIl[0] = (115 ^ 32) & ((201 ^ 154) ^ (-1));
        lIlIIIIlIl[1] = " ".length();
        lIlIIIIlIl[2] = 58 ^ 13;
        lIlIIIIlIl[3] = "  ".length();
        lIlIIIIlIl[4] = "   ".length();
        lIlIIIIlIl[5] = (-9270) & 14269;
        lIlIIIIlIl[6] = (76 ^ 52) ^ (114 ^ 12);
        lIlIIIIlIl[7] = (133 ^ 196) ^ (103 ^ 34);
        lIlIIIIlIl[8] = (-((-8975) & 32671)) & (-65) & 24318;
        lIlIIIIlIl[9] = (-((-2805) & 19189)) & (-12289) & 30172;
        lIlIIIIlIl[10] = (-((-5) & 23893)) & (-1) & 24443;
        lIlIIIIlIl[11] = (-(153 ^ 165)) & (-26113) & 28671;
        lIlIIIIlIl[12] = (-((-6859) & 8155)) & (-14401) & 16253;
        lIlIIIIlIl[13] = (-30102) & 30655;
        lIlIIIIlIl[14] = (-((-5506) & 14309)) & (-17409) & 30711;
        lIlIIIIlIl[15] = (-2125) & 2687;
        lIlIIIIlIl[16] = (-((-8277) & 8919)) & (-3117) & 16383;
        lIlIIIIlIl[17] = (-((-5803) & 14011)) & (-165) & 16381;
        lIlIIIIlIl[18] = 131 ^ 134;
        lIlIIIIlIl[19] = (-641) & 1019;
        lIlIIIIlIl[20] = 51 ^ 42;
        lIlIIIIlIl[21] = (-6145) & 7531;
        lIlIIIIlIl[22] = (-14419) & 14974;
        lIlIIIIlIl[23] = (-((-2641) & 23511)) & (-2121) & 23551;
        lIlIIIIlIl[24] = 185 ^ 135;
        lIlIIIIlIl[25] = (73 ^ 108) ^ (96 ^ 90);
        lIlIIIIlIl[26] = 106 ^ 109;
        lIlIIIIlIl[27] = -" ".length();
        lIlIIIIlIl[28] = (154 ^ 157) ^ (102 ^ 68);
        lIlIIIIlIl[29] = 39 ^ 47;
        lIlIIIIlIl[30] = 48 ^ 29;
        lIlIIIIlIl[31] = (((89 + 69) - 120) + 118) ^ (((14 + 24) - (-12)) + 99);
        lIlIIIIlIl[32] = 2 ^ 8;
        lIlIIIIlIl[33] = (((80 + 92) - 125) + 101) ^ (((9 + 148) - 135) + 137);
        lIlIIIIlIl[34] = (-17157) & 20318;
        lIlIIIIlIl[35] = (-((-16131) & 32547)) & (-8193) & 28095;
        lIlIIIIlIl[36] = 26 ^ 22;
        lIlIIIIlIl[37] = 99 ^ 92;
        lIlIIIIlIl[38] = (80 ^ 86) ^ (112 ^ 123);
        lIlIIIIlIl[39] = (-((-4610) & 30349)) & (-2609) & 28667;
        lIlIIIIlIl[40] = (-27974) & 28503;
        lIlIIIIlIl[41] = (-((-28235) & 32331)) & (-16450) & 24045;
        lIlIIIIlIl[42] = (((9 + 40) - (-79)) + 28) ^ (((70 + 97) - 116) + 95);
        lIlIIIIlIl[43] = (1 ^ 55) ^ (36 ^ 29);
        lIlIIIIlIl[44] = 119 ^ 103;
        lIlIIIIlIl[45] = (209 ^ 184) ^ (41 ^ 81);
        lIlIIIIlIl[46] = (((18 + 114) - 97) + 99) ^ (((99 + 65) - 92) + 76);
        lIlIIIIlIl[47] = (-28811) & 30191;
        lIlIIIIlIl[48] = (54 ^ 61) ^ (66 ^ 90);
        lIlIIIIlIl[49] = (-29795) & 30070;
        lIlIIIIlIl[50] = (-((-1425) & 28095)) & (-1281) & 28543;
        lIlIIIIlIl[51] = 42 ^ 48;
        lIlIIIIlIl[52] = (((67 + 7) - 66) + 144) ^ (((80 + 113) - 86) + 33);
        lIlIIIIlIl[53] = "  ".length() ^ (29 ^ 10);
        lIlIIIIlIl[54] = ((133 + 64) - 64) + 68;
        lIlIIIIlIl[55] = (((132 + 69) - 82) + 65) ^ (((113 + 44) - 66) + 83);
        lIlIIIIlIl[56] = 152 ^ 143;
        lIlIIIIlIl[57] = (54 ^ 102) ^ (92 ^ 20);
        lIlIIIIlIl[58] = (-((-19381) & 23479)) & (-27650) & 32747;
        lIlIIIIlIl[59] = ((138 + 56) - 159) + 135;
        lIlIIIIlIl[60] = (-4111) & 8110;
        lIlIIIIlIl[61] = (-((-17) & 30745)) & (-5) & 32732;
        lIlIIIIlIl[62] = (-((-453) & 30151)) & (-5) & 32702;
        lIlIIIIlIl[63] = (-3620) & 16119;
        lIlIIIIlIl[64] = (-((-13469) & 30718)) & (-19) & 32767;
        lIlIIIIlIl[65] = (((115 + 162) - 91) + 67) ^ (((57 + 8) - (-13)) + 55);
        lIlIIIIlIl[66] = ((93 + 104) - 137) + 90;
        lIlIIIIlIl[67] = (-(69 ^ 65)) & (-16453) & 31455;
        lIlIIIIlIl[68] = 89 ^ 61;
        lIlIIIIlIl[69] = (-((-11980) & 32751)) & (-17) & 32767;
        lIlIIIIlIl[70] = (-3656) & 28655;
        lIlIIIIlIl[71] = (-((-4127) & 12447)) & (-16425) & 32751;
        lIlIIIIlIl[72] = (-13345) & 14244;
        lIlIIIIlIl[73] = (((111 + 34) - 64) + 46) ^ (237 ^ 137);
        lIlIIIIlIl[74] = 135 ^ 155;
        lIlIIIIlIl[75] = 53 ^ 40;
        lIlIIIIlIl[76] = (-12289) & 15310;
        lIlIIIIlIl[77] = (-((-8387) & 29663)) & (-8193) & 32767;
        lIlIIIIlIl[78] = (-((-17733) & 21861)) & (-17409) & 24567;
        lIlIIIIlIl[79] = (-16403) & 19707;
        lIlIIIIlIl[80] = 23 ^ 9;
    }

    private static void ak() {
        if (lIIIlIIIlIlll(lIIIlIIIlIllI(C0004e.u(), 30.0d))) {
            int[] iArr = new int[lIlIIIIlIl[1]];
            iArr[lIlIIIIlIl[0]] = lIlIIIIlIl[19];
            if (lIIIlIIIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIIIlIl[1]];
                iArr2[lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                Inventory.getFirst(iArr2).interact(lIlIIIIlII[lIlIIIIlIl[44]]);
                Time.sleepTicks(lIlIIIIlIl[1]);
                "".length();
            }
        }
        if (lIIIlIIIlIlIl(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIIIlIIIIlllI(npc.getName().contains(lIlIIIIlII[lIlIIIIlIl[75]]) ? 1 : 0) && lIIIlIIIlIIII(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIlIIIIlIl[1];
                    "".length();
                    return (161 ^ 165) <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIIlIl[0];
            });
            String[] strArr = new String[lIlIIIIlIl[3]];
            strArr[lIlIIIIlIl[0]] = lIlIIIIlII[lIlIIIIlIl[45]];
            strArr[lIlIIIIlIl[1]] = lIlIIIIlII[lIlIIIIlIl[46]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIIIlIIIllIII(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIlIIIIlIl[1];
                    "".length();
                    return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIIlIl[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIlIIIIlIl[1]];
            iArr3[lIlIIIIlIl[0]] = lIlIIIIlIl[47];
            if (lIIIlIIIIlllI(Equipment.contains(iArr3) ? 1 : 0) && lIIIlIIIlIIII(an() ? 1 : 0)) {
                ao();
            }
            if (lIIIlIIIlIIIl(nearest) && lIIIlIIIlIIII(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lIlIIIIlII[lIlIIIIlIl[48]]);
                Time.sleepTicks(lIlIIIIlIl[4]);
                "".length();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIIlIIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0208, code lost:
        if (lIIIlIIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028f, code lost:
        if (lIIIlIIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0396, code lost:
        if (lIIIlIIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean am() {
        if (lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[20])) {
            int[] iArr = new int[lIlIIIIlIl[1]];
            iArr[lIlIIIIlIl[0]] = lIlIIIIlIl[8];
            if (lIIIlIIIIlllI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIIIlIl[1]];
                iArr2[lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                if (lIIIlIIIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIIIIlIl[1]];
                    iArr3[lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                    if (lIIIlIIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIIIIlIl[1]];
                        iArr4[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                        if (lIIIlIIIIlllI(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlIIIIlIl[1]];
                            iArr5[lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                            if (lIIIlIIIIlllI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlIIIIlIl[1]];
                                iArr6[lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                if (lIIIlIIIlIIII(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIlIIIIlIl[1]];
                                    iArr7[lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                }
                                ?? r0 = lIlIIIIlIl[1];
                                "".length();
                                return (((232 ^ 182) ^ (249 ^ 171)) & (((77 ^ 19) ^ (223 ^ 141)) ^ (-" ".length()))) != 0 ? ((231 ^ 147) ^ (221 ^ 129)) & (((75 ^ 124) ^ (157 ^ 130)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIlIIIIlIl[0];
        } else if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[20]) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2])) {
            int[] iArr8 = new int[lIlIIIIlIl[1]];
            iArr8[lIlIIIIlIl[0]] = lIlIIIIlIl[12];
            if (lIIIlIIIIlllI(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlIIIIlIl[1]];
                iArr9[lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                if (lIIIlIIIIlllI(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIIIIlIl[1]];
                    iArr10[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                    if (lIIIlIIIIlllI(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlIIIIlIl[1]];
                        iArr11[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                        if (lIIIlIIIIlllI(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlIIIIlIl[1]];
                            iArr12[lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                            if (lIIIlIIIlIIII(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlIIIIlIl[1]];
                                iArr13[lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                            }
                            ?? r02 = lIlIIIIlIl[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lIlIIIIlIl[0];
        } else if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2]) && lIIIlIIIlIIII(cc ? 1 : 0)) {
            int[] iArr14 = new int[lIlIIIIlIl[1]];
            iArr14[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
            if (lIIIlIIIlIIII(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlIIIIlIl[1]];
                iArr15[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
            }
            int[] iArr16 = new int[lIlIIIIlIl[1]];
            iArr16[lIlIIIIlIl[0]] = lIlIIIIlIl[23];
            if (lIIIlIIIIlllI(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlIIIIlIl[1]];
                iArr17[lIlIIIIlIl[0]] = lIlIIIIlIl[24];
                if (lIIIlIIIIlllI(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIlIIIIlIl[1];
                    "".length();
                    return (((((118 + 89) - 161) + 106) ^ (((63 + 97) - 153) + 122)) & (((77 ^ 99) ^ (240 ^ 199)) ^ (-" ".length()))) != 0 ? ((((129 + 54) - 85) + 38) ^ (((51 + 109) - 47) + 71)) & (((((26 + 11) - (-1)) + 101) ^ (((122 + 67) - 94) + 92)) ^ (-" ".length())) : r03;
                }
            }
            return lIlIIIIlIl[0];
        } else if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2]) && lIIIlIIIIlllI(cc ? 1 : 0)) {
            int[] iArr18 = new int[lIlIIIIlIl[1]];
            iArr18[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
            if (lIIIlIIIlIIII(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlIIIIlIl[1]];
                iArr19[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
            }
            int[] iArr20 = new int[lIlIIIIlIl[1]];
            iArr20[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
            if (lIIIlIIIIlllI(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlIIIIlIl[1]];
                iArr21[lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                if (lIIIlIIIIlllI(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlIIIIlIl[1]];
                    iArr22[lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                    if (lIIIlIIIlIIll(Bank.getFirst(iArr22).getQuantity(), lIlIIIIlIl[18])) {
                        int[] iArr23 = new int[lIlIIIIlIl[1]];
                        iArr23[lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                        if (lIIIlIIIIlllI(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIlIIIIlIl[1]];
                            iArr24[lIlIIIIlIl[0]] = lIlIIIIlIl[24];
                            if (lIIIlIIIIlllI(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIlIIIIlIl[1];
                                "".length();
                                return 0 != 0 ? ((((37 + 97) - 12) + 11) ^ (((73 + 81) - 125) + 127)) & (((57 ^ 33) ^ " ".length()) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIlIIIIlIl[0];
        } else {
            return lIlIIIIlIl[0];
        }
    }

    private static boolean lIIIlIIIIllll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lIIIlIIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d8, code lost:
        if (lIIIlIIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0281, code lost:
        if (lIIIlIIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x033d, code lost:
        if (lIIIlIIIIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean al() {
        if (lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[20])) {
            int[] iArr = new int[lIlIIIIlIl[1]];
            iArr[lIlIIIIlIl[0]] = lIlIIIIlIl[8];
            if (lIIIlIIIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIIIlIl[1]];
                iArr2[lIlIIIIlIl[0]] = lIlIIIIlIl[12];
                if (lIIIlIIIIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIIIIlIl[1]];
                    iArr3[lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                    if (lIIIlIIIIlllI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIIIIlIl[1]];
                        iArr4[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                        if (lIIIlIIIIlllI(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlIIIIlIl[1]];
                            iArr5[lIlIIIIlIl[0]] = lIlIIIIlIl[19];
                            if (lIIIlIIIIlllI(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlIIIIlIl[1]];
                                iArr6[lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                if (lIIIlIIIlIIII(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIlIIIIlIl[1]];
                                    iArr7[lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                                }
                                ?? r0 = lIlIIIIlIl[1];
                                "".length();
                                return (-" ".length()) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                    }
                }
            }
            return lIlIIIIlIl[0];
        } else if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[20]) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2])) {
            int[] iArr8 = new int[lIlIIIIlIl[1]];
            iArr8[lIlIIIIlIl[0]] = lIlIIIIlIl[12];
            if (lIIIlIIIIlllI(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlIIIIlIl[1]];
                iArr9[lIlIIIIlIl[0]] = lIlIIIIlIl[10];
                if (lIIIlIIIIlllI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIIIIlIl[1]];
                    iArr10[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                    if (lIIIlIIIIlllI(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlIIIIlIl[1]];
                        iArr11[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                        if (lIIIlIIIIlllI(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlIIIIlIl[1]];
                            iArr12[lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                            if (lIIIlIIIlIIII(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlIIIIlIl[1]];
                                iArr13[lIlIIIIlIl[0]] = lIlIIIIlIl[47];
                            }
                            ?? r02 = lIlIIIIlIl[1];
                            "".length();
                            return " ".length() > ((((15 + 58) - (-42)) + 14) ^ (((10 + 114) - 76) + 85)) ? ((203 ^ 186) ^ (40 ^ 109)) & (((141 ^ 181) ^ (135 ^ 139)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIlIIIIlIl[0];
        } else if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2]) && lIIIlIIIlIIII(cc ? 1 : 0)) {
            int[] iArr14 = new int[lIlIIIIlIl[1]];
            iArr14[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
            if (lIIIlIIIlIIII(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlIIIIlIl[1]];
                iArr15[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
            }
            int[] iArr16 = new int[lIlIIIIlIl[1]];
            iArr16[lIlIIIIlIl[0]] = lIlIIIIlIl[23];
            if (lIIIlIIIIlllI(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlIIIIlIl[1]];
                iArr17[lIlIIIIlIl[0]] = lIlIIIIlIl[37];
                if (lIIIlIIIIlllI(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIlIIIIlIl[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIlIIIIlIl[0];
        } else if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2]) && lIIIlIIIIlllI(cc ? 1 : 0)) {
            int[] iArr18 = new int[lIlIIIIlIl[1]];
            iArr18[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
            if (lIIIlIIIlIIII(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlIIIIlIl[1]];
                iArr19[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
            }
            int[] iArr20 = new int[lIlIIIIlIl[1]];
            iArr20[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
            if (lIIIlIIIIlllI(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlIIIIlIl[1]];
                iArr21[lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                if (lIIIlIIIIlllI(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlIIIIlIl[1]];
                    iArr22[lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                    if (lIIIlIIIlIIll(Inventory.getFirst(iArr22).getQuantity(), lIlIIIIlIl[18])) {
                        int[] iArr23 = new int[lIlIIIIlIl[1]];
                        iArr23[lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                        if (lIIIlIIIIlllI(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIlIIIIlIl[1]];
                            iArr24[lIlIIIIlIl[0]] = lIlIIIIlIl[37];
                            if (lIIIlIIIIlllI(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIlIIIIlIl[1];
                                "".length();
                                return "  ".length() < (((((240 + 202) - 249) + 60) ^ (((179 + 148) - 253) + 114)) & (((((68 + 37) - 47) + 69) ^ (126 ^ 64)) ^ (-" ".length()))) ? ((((71 + 119) - (-44)) + 13) ^ (((152 + 93) - 119) + 40)) & (((((33 + 201) - 215) + 183) ^ (((113 + 117) - 88) + 13)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIlIIIIlIl[0];
        } else {
            return lIlIIIIlIl[0];
        }
    }

    private static boolean lIIIlIIIlIIlI(int i) {
        return i > 0;
    }

    private static boolean lIIIlIIIlIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlIIIlIIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIIIIlIl[0];
    }

    private static boolean lIIIlIIIllIIl(int i, int i2) {
        return i > i2;
    }

    private static String lIIIlIIIIIlIl(String llllllllllllllllllllIlIlIlllIIlI, String llllllllllllllllllllIlIlIlllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIlIlllIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIl[29]), "DES");
            Cipher llllllllllllllllllllIlIlIlllIlII = Cipher.getInstance("DES");
            llllllllllllllllllllIlIlIlllIlII.init(lIlIIIIlIl[3], secretKeySpec);
            return new String(llllllllllllllllllllIlIlIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIlIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIlIlIlllIIll) {
            llllllllllllllllllllIlIlIlllIIll.printStackTrace();
            return null;
        }
    }

    public static void ao() {
        if (lIIIlIIIlIIIl(Widgets.get(lIlIIIIlIl[50], lIlIIIIlIl[51]))) {
            AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[52]];
            Widgets.get(lIlIIIIlIl[50], lIlIIIIlIl[51]).interact(lIlIIIIlII[lIlIIIIlIl[53]]);
            Time.sleepTicks(lIlIIIIlIl[7]);
            "".length();
        }
        if (lIIIlIIIlIlIl(Widgets.get(lIlIIIIlIl[50], lIlIIIIlIl[51])) && lIIIlIIIlIIII(Widgets.get(lIlIIIIlIl[54]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIlIIIIlIl[1]);
            "".length();
            if (lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[18])) {
                Widgets.get(lIlIIIIlIl[54], lIlIIIIlIl[1]).getChild(lIlIIIIlIl[1]).interact(lIlIIIIlII[lIlIIIIlIl[55]]);
            }
            if (lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[31]) && lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[18])) {
                Widgets.get(lIlIIIIlIl[54], lIlIIIIlIl[1]).getChild(lIlIIIIlIl[3]).interact(lIlIIIIlII[lIlIIIIlIl[56]]);
            }
            if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[31]) && lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[38])) {
                Widgets.get(lIlIIIIlIl[54], lIlIIIIlIl[1]).getChild(lIlIIIIlIl[4]).interact(lIlIIIIlII[lIlIIIIlIl[57]]);
            }
            if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[31])) {
                int[] iArr = new int[lIlIIIIlIl[1]];
                iArr[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                if (lIIIlIIIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIlIIIIlIl[54], lIlIIIIlIl[1]).getChild(lIlIIIIlIl[4]).interact(lIlIIIIlII[lIlIIIIlIl[20]]);
                }
            }
            if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[38])) {
                int[] iArr2 = new int[lIlIIIIlIl[1]];
                iArr2[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
                if (lIIIlIIIIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIlIIIIlIl[54], lIlIIIIlIl[1]).getChild(lIlIIIIlIl[7]).interact(lIlIIIIlII[lIlIIIIlIl[51]]);
                }
            }
            Time.sleepTicks(lIlIIIIlIl[1]);
            "".length();
        }
    }

    private static void lIIIlIIIIllII() {
        lIlIIIIlII = new String[lIlIIIIlIl[80]];
        lIlIIIIlII[lIlIIIIlIl[0]] = lIIIlIIIIIlIl("EIe7fQ7gxI3DmjHMt9lRyQ==", "XpgBP");
        lIlIIIIlII[lIlIIIIlIl[1]] = lIIIlIIIIIllI("IQIgHAQPDipVFRISJxsQRwI6EBoUR24GAA4fLR0eCQxuFxYEAG4BGEcGLxIeBEs6BxYOBScbEA==", "gkNuw");
        lIlIIIIlII[lIlIIIIlIl[3]] = lIIIlIIIIIllI("ASoPGSAuPxAeIG8/FlAlLiUS", "OKypG");
        lIlIIIIlII[lIlIIIIlIl[4]] = lIIIlIIIIIlIl("jNCOwc4MYtx1uRLiV5a+Fbzv7wLyEr61", "jpVbB");
        lIlIIIIlII[lIlIIIIlIl[7]] = lIIIlIIIIIllI("NhJYBToEVxUNOxIeFgNoEgIIFCQIEgtIaBIAERArCR4WA2gVGFgmHTg+NiM=", "awxdH");
        lIlIIIIlII[lIlIIIIlIl[18]] = lIIIlIIIIIllI("Nik0RCAXaCELIws=", "xHBdT");
        lIlIIIIlII[lIlIIIIlIl[6]] = lIIIlIIIIIlll("xU24e7rwHeHFHp/SWmhkIA==", "niweI");
        lIlIIIIlII[lIlIIIIlIl[26]] = lIIIlIIIIIlll("QU2YAJtHReBNWHsid4bEZ2AsgBQUXOSm", "oCefe");
        lIlIIIIlII[lIlIIIIlIl[29]] = lIIIlIIIIIllI("JwsCGQQKDVEBGAkICE0ZAQYU", "djqmm");
        lIlIIIIlII[lIlIIIIlIl[31]] = lIIIlIIIIIlll("ocb1SNKVViCgNeU3Ib4DuK6ZDByxaBh7", "TAxql");
        lIlIIIIlII[lIlIIIIlIl[32]] = lIIIlIIIIIlll("pjEoIj+8/iGFl9lojNcsGka15zCF1C3p", "tQfjH");
        lIlIIIIlII[lIlIIIIlIl[33]] = lIIIlIIIIIlIl("TIgZYkwb1R4=", "KHnjq");
        lIlIIIIlII[lIlIIIIlIl[36]] = lIIIlIIIIIlIl("n7h3rgtIPaQ=", "FUnpM");
        lIlIIIIlII[lIlIIIIlIl[38]] = lIIIlIIIIIlll("6DbqAHn7Lt7TQK81YWd6gt+pM5d4HoIO", "npZKU");
        lIlIIIIlII[lIlIIIIlIl[42]] = lIIIlIIIIIlIl("1N5UzFmaVkqAEDtyU4/wDQ==", "YxaSC");
        lIlIIIIlII[lIlIIIIlIl[43]] = lIIIlIIIIIlIl("xsPWlxMvXu3ShwffLmC2lw==", "cLnry");
        lIlIIIIlII[lIlIIIIlIl[44]] = lIIIlIIIIIlll("osq0lDIECQM=", "CzRrn");
        lIlIIIIlII[lIlIIIIlIl[45]] = lIIIlIIIIIlIl("my/tx0a2vcw=", "FRLvA");
        lIlIIIIlII[lIlIIIIlIl[46]] = lIIIlIIIIIllI("ICMA", "CLwwB");
        lIlIIIIlII[lIlIIIIlIl[48]] = lIIIlIIIIIllI("ByMsIygt", "FWXBK");
        lIlIIIIlII[lIlIIIIlIl[52]] = lIIIlIIIIIlll("UtGZbRS+C3Xkg8E627+VoHbixX3Sdd6f", "jHddf");
        lIlIIIIlII[lIlIIIIlIl[53]] = lIIIlIIIIIllI("OikLOBscYRcnDRUt", "yAdWh");
        lIlIIIIlII[lIlIIIIlIl[55]] = lIIIlIIIIIllI("DSMhAkIJPj0PCT8=", "ZJOfb");
        lIlIIIIlII[lIlIIIIlIl[56]] = lIIIlIIIIIllI("JCMRJCJTEREzORgn", "sBeAP");
        lIlIIIIlII[lIlIIIIlIl[57]] = lIIIlIIIIIllI("HAocFx55OBoRHzIO", "Ykncv");
        lIlIIIIlII[lIlIIIIlIl[20]] = lIIIlIIIIIlll("wKXo1YCON8KC8kIg5tBtag==", "DEEiz");
        lIlIIIIlII[lIlIIIIlIl[51]] = lIIIlIIIIIllI("IwU/FHU2GD8YPgA=", "elMqU");
        lIlIIIIlII[lIlIIIIlIl[73]] = lIIIlIIIIIlIl("W1RInzkeyrz6koRwMeUm6Q==", "LCqPn");
        lIlIIIIlII[lIlIIIIlIl[74]] = lIIIlIIIIIlIl("LvuVa990Su58Y1T/DT9N84TuPmEVUZ7X", "yLTXe");
        lIlIIIIlII[lIlIIIIlIl[75]] = lIIIlIIIIIlll("jgbzruS4/d8=", "oMpVQ");
    }

    public static void aj() {
        if (lIIIlIIIIlllI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIlIIIlIIII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[42]];
            Movement.walkTo(ce);
            "".length();
            Time.sleepTicks(lIlIIIIlIl[1]);
            "".length();
        }
        if (lIIIlIIIIlllI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIlII[lIlIIIIlIl[43]];
            ak();
        }
    }

    private static String lIIIlIIIIIlll(String llllllllllllllllllllIlIlIlllllll, String llllllllllllllllllllIlIlIlllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIlIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIlIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIlIllIIIIIII) {
            llllllllllllllllllllIlIllIIIIIII.printStackTrace();
            return null;
        }
    }

    private static void O() {
        if (lIIIlIIIIllll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2])) {
            int[] iArr = new int[lIlIIIIlIl[1]];
            iArr[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
            if (lIIIlIIIlIIII(Bank.contains(iArr) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIIIlIl[15], lIlIIIIlIl[58], lIlIIIIlIl[59]));
                "".length();
            }
            int[] iArr2 = new int[lIlIIIIlIl[1]];
            iArr2[lIlIIIIlIl[0]] = lIlIIIIlIl[8];
            if (lIIIlIIIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIIIlIl[8], lIlIIIIlIl[60], lIlIIIIlIl[6]));
                "".length();
            }
            int[] iArr3 = new int[lIlIIIIlIl[1]];
            iArr3[lIlIIIIlIl[0]] = lIlIIIIlIl[10];
            if (lIIIlIIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIIIlIl[10], lIlIIIIlIl[61], lIlIIIIlIl[6]));
                "".length();
            }
            int[] iArr4 = new int[lIlIIIIlIl[1]];
            iArr4[lIlIIIIlIl[0]] = lIlIIIIlIl[12];
            if (lIIIlIIIlIIII(Bank.contains(iArr4) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIIIlIl[12], lIlIIIIlIl[62], lIlIIIIlIl[6]));
                "".length();
            }
            int[] iArr5 = new int[lIlIIIIlIl[1]];
            iArr5[lIlIIIIlIl[0]] = lIlIIIIlIl[13];
            if (lIIIlIIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIIIlIl[13], lIlIIIIlIl[5], lIlIIIIlIl[6]));
                "".length();
            }
            int[] iArr6 = new int[lIlIIIIlIl[1]];
            iArr6[lIlIIIIlIl[0]] = lIlIIIIlIl[47];
            if (lIIIlIIIlIIII(Bank.contains(iArr6) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIIIlIl[47], lIlIIIIlIl[1], C0004e.c(lIlIIIIlIl[63], lIlIIIIlIl[64])));
                "".length();
            }
        }
        if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2])) {
            int[] iArr7 = new int[lIlIIIIlIl[1]];
            iArr7[lIlIIIIlIl[0]] = lIlIIIIlIl[23];
            if (lIIIlIIIIlllI(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIIIIlIl[1]];
                iArr8[lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                if (lIIIlIIIIllll(Bank.getFirst(iArr8).getQuantity(), lIlIIIIlIl[62])) {
                    int i = lIlIIIIlIl[23];
                    int i2 = lIlIIIIlIl[62];
                    int[] iArr9 = new int[lIlIIIIlIl[1]];
                    iArr9[lIlIIIIlIl[0]] = lIlIIIIlIl[23];
                    bp.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIlIIIIlIl[65]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIlIIIIlIl[1]];
            iArr10[lIlIIIIlIl[0]] = lIlIIIIlIl[23];
            if (lIIIlIIIlIIII(Bank.contains(iArr10) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIIIlIl[23], lIlIIIIlIl[62], lIlIIIIlIl[65]));
                "".length();
            }
            int[] iArr11 = new int[lIlIIIIlIl[1]];
            iArr11[lIlIIIIlIl[0]] = lIlIIIIlIl[24];
            if (lIIIlIIIIlllI(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlIIIIlIl[1]];
                iArr12[lIlIIIIlIl[0]] = lIlIIIIlIl[24];
                if (lIIIlIIIIllll(Bank.getFirst(iArr12).getQuantity(), lIlIIIIlIl[62])) {
                    int i3 = lIlIIIIlIl[24];
                    int i4 = lIlIIIIlIl[62];
                    int[] iArr13 = new int[lIlIIIIlIl[1]];
                    iArr13[lIlIIIIlIl[0]] = lIlIIIIlIl[24];
                    bp.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIlIIIIlIl[66]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIlIIIIlIl[1]];
            iArr14[lIlIIIIlIl[0]] = lIlIIIIlIl[24];
            if (lIIIlIIIlIIII(Bank.contains(iArr14) ? 1 : 0)) {
                bp.add(new C0003d(lIlIIIIlIl[24], lIlIIIIlIl[62], lIlIIIIlIl[66]));
                "".length();
            }
            int[] iArr15 = new int[lIlIIIIlIl[1]];
            iArr15[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
            if (lIIIlIIIlIIII(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIlIIIIlIl[1]];
                iArr16[lIlIIIIlIl[0]] = lIlIIIIlIl[21];
                if (lIIIlIIIlIIII(Equipment.contains(iArr16) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIIIIlIl[21], lIlIIIIlIl[1], lIlIIIIlIl[67]));
                    "".length();
                }
            }
            if (lIIIlIIIIlllI(cc ? 1 : 0)) {
                int[] iArr17 = new int[lIlIIIIlIl[1]];
                iArr17[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                if (lIIIlIIIIlllI(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIlIIIIlIl[1]];
                    iArr18[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                    if (lIIIlIIIIllll(Bank.getFirst(iArr18).getQuantity(), lIlIIIIlIl[62])) {
                        int i5 = lIlIIIIlIl[15];
                        int i6 = lIlIIIIlIl[62];
                        int[] iArr19 = new int[lIlIIIIlIl[1]];
                        iArr19[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                        bp.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIlIIIIlIl[59]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIlIIIIlIl[1]];
                iArr20[lIlIIIIlIl[0]] = lIlIIIIlIl[15];
                if (lIIIlIIIlIIII(Bank.contains(iArr20) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIIIIlIl[15], lIlIIIIlIl[62], lIlIIIIlIl[59]));
                    "".length();
                }
                int[] iArr21 = new int[lIlIIIIlIl[1]];
                iArr21[lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                if (lIIIlIIIIlllI(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIlIIIIlIl[1]];
                    iArr22[lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                    if (lIIIlIIIIllll(Bank.getFirst(iArr22).getQuantity(), lIlIIIIlIl[67])) {
                        int i7 = lIlIIIIlIl[22];
                        int i8 = lIlIIIIlIl[67];
                        int[] iArr23 = new int[lIlIIIIlIl[1]];
                        iArr23[lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                        bp.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIlIIIIlIl[6]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIlIIIIlIl[1]];
                iArr24[lIlIIIIlIl[0]] = lIlIIIIlIl[22];
                if (lIIIlIIIlIIII(Bank.contains(iArr24) ? 1 : 0)) {
                    bp.add(new C0003d(lIlIIIIlIl[22], lIlIIIIlIl[67], lIlIIIIlIl[6]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIlIIIIlIl[1]];
        iArr25[lIlIIIIlIl[0]] = lIlIIIIlIl[19];
        if (lIIIlIIIlIIII(Bank.contains(iArr25) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIlIl[19], lIlIIIIlIl[68], lIlIIIIlIl[39]));
            "".length();
        }
        if (lIIIlIIIlIIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIIIIlII[lIlIIIIlIl[74]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIlIl[69], lIlIIIIlIl[18], lIlIIIIlIl[70]));
            "".length();
        }
        int[] iArr26 = new int[lIlIIIIlIl[1]];
        iArr26[lIlIIIIlIl[0]] = lIlIIIIlIl[71];
        if (lIIIlIIIlIIII(Bank.contains(iArr26) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIlIl[71], lIlIIIIlIl[32], lIlIIIIlIl[72]));
            "".length();
        }
        int[] iArr27 = new int[lIlIIIIlIl[1]];
        iArr27[lIlIIIIlIl[0]] = lIlIIIIlIl[17];
        if (lIIIlIIIlIIII(Bank.contains(iArr27) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIlIl[17], lIlIIIIlIl[32], lIlIIIIlIl[72]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIlIIIlIIll(Skills.getLevel(Skill.MAGIC), lIlIIIIlIl[2])) {
            ?? r0 = lIlIIIIlIl[1];
            "".length();
            return " ".length() < " ".length() ? ((((171 + 58) - 198) + 190) ^ (((110 + 19) - (-19)) + 47)) & (((15 ^ 103) ^ (67 ^ 53)) ^ (-" ".length())) : r0;
        }
        return lIlIIIIlIl[0];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIIIIlII[lIlIIIIlIl[73]];
    }

    private static boolean lIIIlIIIIlllI(int i) {
        return i != 0;
    }
}
