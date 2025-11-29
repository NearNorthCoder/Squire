/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.v;
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
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class l
implements G {
    static /* synthetic */ WorldPoint by;
    static /* synthetic */ WorldArea bw;
    public static /* synthetic */ boolean bu;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldPoint bx;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] lIIlIIIlII;
    private static /* synthetic */ int[] lIIlIIIlIl;

    public static void Y() {
        if (l.llllIllIIlII(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[0]];
            b.a(bv);
            if (l.llllIllIIlIl(bv.size(), lIIlIIIlIl[1])) {
                System.out.println(lIIlIIIlII[lIIlIIIlIl[1]]);
                bt = lIIlIIIlIl[0];
            }
        }
        if (l.llllIllIIllI(bt ? 1 : 0)) {
            BankLocation lIIlIlllll;
            if (l.llllIllIIllI(l.ab() ? 1 : 0)) {
                lIIlIlllll = BankLocation.getNearest();
                if (l.llllIllIIlll(lIIlIlllll) && l.llllIllIIllI(lIIlIlllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[2]];
                    a.a(lIIlIlllll);
                }
                if (l.llllIllIIlll(lIIlIlllll) && l.llllIllIIlII(lIIlIlllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[3]];
                    if (l.llllIllIIllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIlIl[4]);
                        "".length();
                    }
                    if (l.llllIllIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (l.llllIllIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIIIlIl[5]);
                            "".length();
                        }
                        while (l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6]) && l.llllIllIIllI(v.aX() ? 1 : 0)) {
                            v.aV();
                            Time.sleepTicks((int)lIIlIIIlIl[1]);
                            "".length();
                            "".length();
                            if ("  ".length() <= "   ".length()) continue;
                            return;
                        }
                        if (l.llllIllIIllI(l.ac() ? 1 : 0)) {
                            l.af();
                            System.out.println(lIIlIIIlII[lIIlIIIlIl[5]]);
                            bt = lIIlIIIlIl[1];
                            return;
                        }
                        if (l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6])) {
                            int[] nArray = new int[lIIlIIIlIl[1]];
                            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[7];
                            if (l.llllIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIlIIIlIl[1]];
                                nArray2[l.lIIlIIIlIl[0]] = lIIlIIIlIl[7];
                                if (l.llllIllIIlIl(Inventory.getCount((int[])nArray2), lIIlIIIlIl[1])) {
                                    Bank.withdraw((int)lIIlIIIlIl[7], (int)lIIlIIIlIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[7];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];
                                            "".length();
                                            if ("   ".length() < "  ".length()) {
                                                return ((0x4F ^ 0x3E ^ (0x14 ^ 0x3B)) & (0xBB ^ 0xA2 ^ (0xC2 ^ 0x85) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] nArray3 = new int[lIIlIIIlIl[1]];
                            nArray3[l.lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                            if (l.llllIllIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIlIIIlIl[1]];
                                nArray4[l.lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                                if (l.llllIllIIlIl(Inventory.getCount((int[])nArray4), lIIlIIIlIl[1])) {
                                    Bank.withdraw((int)lIIlIIIlIl[9], (int)lIIlIIIlIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];
                                            "".length();
                                            if ((0x73 ^ 0x2B ^ (0x21 ^ 0x7D)) <= " ".length()) {
                                                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] nArray5 = new int[lIIlIIIlIl[1]];
                            nArray5[l.lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                            if (l.llllIllIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIlIIIlIl[1]];
                                nArray6[l.lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                                if (l.llllIllIIlIl(Inventory.getCount((int[])nArray6), lIIlIIIlIl[1])) {
                                    Bank.withdraw((int)lIIlIIIlIl[11], (int)lIIlIIIlIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];
                                            "".length();
                                            if (-(0x8F ^ 0x8A) >= 0) {
                                                return ((0xE2 ^ 0xB3) & ~(0xD8 ^ 0x89)) != 0;
                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] nArray7 = new int[lIIlIIIlIl[1]];
                            nArray7[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                            if (l.llllIllIIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIlIIIlIl[1]];
                                nArray8[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                                if (l.llllIllIIlIl(Inventory.getCount((int[])nArray8), lIIlIIIlIl[1])) {
                                    Bank.withdraw((int)lIIlIIIlIl[12], (int)lIIlIIIlIl[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];
                                            "".length();
                                            if (null != null) {
                                                return ((5 + 20 - 9 + 113 ^ 61 + 34 - 36 + 81) & (0x16 ^ 0x73 ^ (0x17 ^ 0x7F) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] nArray9 = new int[lIIlIIIlIl[1]];
                            nArray9[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                            if (l.llllIllIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIlIIIlIl[1]];
                                nArray10[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                                if (l.llllIllIIlIl(Inventory.getCount((int[])nArray10), lIIlIIIlIl[1])) {
                                    Bank.withdraw((int)lIIlIIIlIl[14], (int)lIIlIIIlIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];
                                            "".length();
                                            if ("   ".length() < ("  ".length() & ("  ".length() ^ -" ".length()))) {
                                                return ((9 + 8 - -125 + 33 ^ 5 + 115 - 90 + 115) & (120 + 68 - 80 + 29 ^ 31 + 46 - -54 + 52 ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            int[] nArray11 = new int[lIIlIIIlIl[1]];
                            nArray11[l.lIIlIIIlIl[0]] = lIIlIIIlIl[15];
                            if (l.llllIllIIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIlIIIlIl[1]];
                                nArray12[l.lIIlIIIlIl[0]] = lIIlIIIlIl[15];
                                if (l.llllIllIIllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIlIIIlIl[15], (int)lIIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw((int)lIIlIIIlIl[16], (int)lIIlIIIlIl[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIIlIIIlIl[1]];
                            nArray13[l.lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                            if (l.llllIllIIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIIlIIIlIl[1]];
                                nArray14[l.lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                                if (l.llllIllIIlIl(Inventory.getCount((int[])nArray14), lIIlIIIlIl[1]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[19])) {
                                    Bank.withdrawAll((int)lIIlIIIlIl[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIlIIIlIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];
                                            "".length();
                                            if ("   ".length() > (0xB ^ 0x2B ^ (0x24 ^ 0))) {
                                                return ((150 + 174 - 190 + 46 ^ 22 + 76 - 71 + 102) & (0xB8 ^ 0xB4 ^ (0x22 ^ 0x1B) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);
                                    "".length();
                                }
                            }
                        }
                        if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6])) {
                            int[] nArray = new int[lIIlIIIlIl[1]];
                            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                            if (l.llllIllIIllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIlIIIlIl[20], (int)lIIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlIIIlIl[1]);
                                "".length();
                            }
                            if (l.llllIllIIlII(bu ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIlIIIlIl[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlIIIlIl[1]);
                                "".length();
                                Bank.withdrawAll((int)lIIlIIIlIl[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlIIIlIl[1]);
                                "".length();
                            }
                            Bank.withdrawAll((int)lIIlIIIlIl[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIlIIIlIl[1]);
                            "".length();
                            Bank.withdrawAll((int)lIIlIIIlIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIlIIIlIl[1]);
                            "".length();
                        }
                    }
                }
            }
            if (l.llllIllIIlII(l.ab() ? 1 : 0)) {
                if (l.llllIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[19])) {
                    if (l.llllIllIIllI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[17]];
                        Movement.walkTo((WorldPoint)bx);
                        "".length();
                        Time.sleepTicks((int)lIIlIIIlIl[1]);
                        "".length();
                    }
                    if (l.llllIllIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[24]];
                        l.aa();
                    }
                }
                if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[19]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[25])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[26]];
                    if (l.llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIIlIIIlIl[1]);
                        "".length();
                    }
                }
                if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[25]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[28])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[29]];
                    if (l.llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIlIIIlIl[1]);
                        "".length();
                    }
                }
                if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[28]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[30])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[31]];
                    if (l.llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIlIIIlIl[1]);
                        "".length();
                    }
                }
                if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[30]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[32]];
                    if (l.llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIlIIIlIl[1]);
                        "".length();
                    }
                }
                if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6])) {
                    int lIIlIlllIl;
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[33]];
                    int[] nArray = new int[lIIlIIIlIl[1]];
                    nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                    if (l.llllIllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIIlIIIlIl[1]];
                        nArray15[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                        if (l.llllIllIIllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIIlIIIlIl[1]];
                            nArray16[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                            Inventory.getFirst((int[])nArray16).interact(lIIlIIIlII[lIIlIIIlIl[34]]);
                            Time.sleepTicks((int)lIIlIIIlIl[1]);
                            "".length();
                        }
                    }
                    if (l.llllIllIIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIIlIIIlIl[1]];
                    nArray17[l.lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                    lIIlIlllll = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIIlIIIlIl[1]];
                    nArray18[l.lIIlIIIlIl[0]] = lIIlIIIlIl[35];
                    Item lIIlIllllI = Inventory.getFirst((int[])nArray18);
                    if (l.llllIllIIllI(bu ? 1 : 0)) {
                        if (l.llllIllIIllI(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[36]];
                            Movement.walkTo((WorldPoint)by);
                            "".length();
                            Time.sleepTicks((int)lIIlIIIlIl[1]);
                            "".length();
                        }
                        if (l.llllIllIIlII(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0) && l.llllIllIIlll(lIIlIlllll) && l.llllIllIIlll(lIIlIllllI)) {
                            lIIlIlllIl = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIlIllllI);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (l.llllIllIllll(Skills.getExperience((Skill)Skill.MAGIC), lIIlIlllIl)) {
                                    bl = lIIlIIIlIl[1];
                                    "".length();
                                    if (-"  ".length() > 0) {
                                        return ((0x40 ^ 0x13) & ~(0x77 ^ 0x24)) != 0;
                                    }
                                } else {
                                    bl = lIIlIIIlIl[0];
                                }
                                return bl;
                            }, (int)lIIlIIIlIl[8]);
                            "".length();
                            Time.sleep((long)e.c(lIIlIIIlIl[37], lIIlIIIlIl[38]));
                            "".length();
                        }
                    }
                    if (l.llllIllIIlII(bu ? 1 : 0)) {
                        if (l.llllIllIIlll(lIIlIlllll) && l.llllIllIIlll(lIIlIllllI) && l.llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                            lIIlIlllIl = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIlIllllI);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (l.llllIllIllll(Skills.getExperience((Skill)Skill.MAGIC), lIIlIlllIl)) {
                                    bl = lIIlIIIlIl[1];
                                    "".length();
                                    if (-(6 ^ 2) > 0) {
                                        return ((0xA5 ^ 0xAE) & ~(0x6F ^ 0x64)) != 0;
                                    }
                                } else {
                                    bl = lIIlIIIlIl[0];
                                }
                                return bl;
                            }, (int)lIIlIIIlIl[8]);
                            "".length();
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (l.llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                                bl = lIIlIIIlIl[1];
                                "".length();
                                if (-"  ".length() >= 0) {
                                    return ((0xD2 ^ 0x81) & ~(0x27 ^ 0x74)) != 0;
                                }
                            } else {
                                bl = lIIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)lIIlIIIlIl[39]);
                        "".length();
                    }
                }
            }
        }
    }

    public static void Z() {
        if (l.llllIllIIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (l.llllIllIIllI(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[40]];
            Movement.walkTo((WorldPoint)bx);
            "".length();
            Time.sleepTicks((int)lIIlIIIlIl[1]);
            "".length();
        }
        if (l.llllIllIIlII(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            l.aa();
        }
    }

    private static boolean llllIllIlllI(Object object, Object object2) {
        return object == object2;
    }

    public static void ae() {
        if (l.llllIllIIlll(Widgets.get((int)lIIlIIIlIl[49], (int)lIIlIIIlIl[50]))) {
            AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[51]];
            Widgets.get((int)lIIlIIIlIl[49], (int)lIIlIIIlIl[50]).interact(lIIlIIIlII[lIIlIIIlIl[52]]);
            Time.sleepTicks((int)lIIlIIIlIl[5]);
            "".length();
        }
        if (l.llllIllIllIl(Widgets.get((int)lIIlIIIlIl[49], (int)lIIlIIIlIl[50])) && l.llllIllIIllI(Widgets.get((int)lIIlIIIlIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIlIIIlIl[1]);
            "".length();
            if (l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[17])) {
                Widgets.get((int)lIIlIIIlIl[53], (int)lIIlIIIlIl[1]).getChild(lIIlIIIlIl[1]).interact(lIIlIIIlII[lIIlIIIlIl[54]]);
            }
            if (l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[31]) && l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[17])) {
                Widgets.get((int)lIIlIIIlIl[53], (int)lIIlIIIlIl[1]).getChild(lIIlIIIlIl[2]).interact(lIIlIIIlII[lIIlIIIlIl[55]]);
            }
            if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[31]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[36])) {
                Widgets.get((int)lIIlIIIlIl[53], (int)lIIlIIIlIl[1]).getChild(lIIlIIIlIl[3]).interact(lIIlIIIlII[lIIlIIIlIl[19]]);
            }
            if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[31])) {
                int[] nArray = new int[lIIlIIIlIl[1]];
                nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                if (l.llllIllIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIlIIIlIl[53], (int)lIIlIIIlIl[1]).getChild(lIIlIIIlIl[3]).interact(lIIlIIIlII[lIIlIIIlIl[50]]);
                }
            }
            if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[36])) {
                int[] nArray = new int[lIIlIIIlIl[1]];
                nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                if (l.llllIllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIlIIIlIl[53], (int)lIIlIIIlIl[1]).getChild(lIIlIIIlIl[5]).interact(lIIlIIIlII[lIIlIIIlIl[56]]);
                }
            }
            Time.sleepTicks((int)lIIlIIIlIl[1]);
            "".length();
        }
    }

    private static String llllIllIIIIl(String lIIIllIlII, String lIIIllIlIl) {
        try {
            SecretKeySpec lIIIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIIIlIl[29]), "DES");
            Cipher lIIIlllIII = Cipher.getInstance("DES");
            lIIIlllIII.init(lIIlIIIlIl[2], lIIIlllIIl);
            return new String(lIIIlllIII.doFinal(Base64.getDecoder().decode(lIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIllIlll) {
            lIIIllIlll.printStackTrace();
            return null;
        }
    }

    private static int llllIllIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        l.llllIllIIIll();
        l.llllIllIIIlI();
        bv = new ArrayList<d>();
        bw = new WorldArea(lIIlIIIlIl[76], lIIlIIIlIl[77], lIIlIIIlIl[47], lIIlIIIlIl[40], lIIlIIIlIl[0]);
        bx = new WorldPoint(lIIlIIIlIl[78], lIIlIIIlIl[79], lIIlIIIlIl[0]);
        by = new WorldPoint(lIIlIIIlIl[80] + e.c(lIIlIIIlIl[1], lIIlIIIlIl[5]), lIIlIIIlIl[81], lIIlIIIlIl[0]);
    }

    private static boolean llllIllIllII(int n2) {
        return n2 < 0;
    }

    private static boolean llllIllIlIII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[73])) {
            bl = lIIlIIIlIl[1];
            "".length();
            if (((6 ^ 0x2C) & ~(0x4D ^ 0x67)) < ((0xA5 ^ 0xBC) & ~(0x3E ^ 0x27))) {
                return ((0x1A ^ 0x4F) & ~(0xCA ^ 0x9F)) != 0;
            }
        } else {
            bl = lIIlIIIlIl[0];
        }
        return bl;
    }

    @Override
    public int T() {
        try {
            l.Y();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (0x2E ^ 0x1A) & ~(0x1A ^ 0x2E);
        }
        return lIIlIIIlIl[67];
    }

    private static boolean llllIllIIllI(int n2) {
        return n2 == 0;
    }

    private static void llllIllIIIll() {
        lIIlIIIlIl = new int[82];
        l.lIIlIIIlIl[0] = (0x54 ^ 0x36) & ~(0xC8 ^ 0xAA);
        l.lIIlIIIlIl[1] = " ".length();
        l.lIIlIIIlIl[2] = "  ".length();
        l.lIIlIIIlIl[3] = "   ".length();
        l.lIIlIIIlIl[4] = 0xFFFFB78B & 0x5BFC;
        l.lIIlIIIlIl[5] = 0 ^ 4;
        l.lIIlIIIlIl[6] = 0x92 ^ 0xBE ^ (0xAC ^ 0xB7);
        l.lIIlIIIlIl[7] = -(0xFFFFD9F3 & 0x370E) & (0xFFFFDFAF & 0x337F);
        l.lIIlIIIlIl[8] = 0xFFFFAFFD & 0x55DE;
        l.lIIlIIIlIl[9] = -(0xFFFFF8F7 & 0x6F49) & (0xFFFFFB7B & 0x6EEF);
        l.lIIlIIIlIl[10] = -(0xFFFFBBAF & 0x747B) & (0xFFFFFBEE & 0x3DFF);
        l.lIIlIIIlIl[11] = 0xFFFFDBBD & 0x266F;
        l.lIIlIIIlIl[12] = -(0xFFFFFD75 & 0x57DB) & (0xFFFFD77E & 0x7FFB);
        l.lIIlIIIlIl[13] = 0xFFFFDDF5 & 0x339E;
        l.lIIlIIIlIl[14] = -(0xFFFFDCEF & 0x37D5) & (0xFFFFFEF7 & 0x17FF);
        l.lIIlIIIlIl[15] = -(0xFFFFD6F7 & 0x6F8B) & (0xFFFFF7F7 & 0x7FDB);
        l.lIIlIIIlIl[16] = 0xFFFF9F4F & 0x7FF9;
        l.lIIlIIIlIl[17] = 0x6F ^ 0x6A;
        l.lIIlIIIlIl[18] = -(0xFFFFFD97 & 0x22E9) & (0xFFFFF3FF & 0x2DFB);
        l.lIIlIIIlIl[19] = 0x1B ^ 2;
        l.lIIlIIIlIl[20] = 0xFFFFEDFB & 0x176F;
        l.lIIlIIIlIl[21] = 0xFFFFFB6C & 0x6BF;
        l.lIIlIIIlIl[22] = 0xFFFFEA33 & 0x17FD;
        l.lIIlIIIlIl[23] = 0x58 ^ 0x66;
        l.lIIlIIIlIl[24] = 0x78 ^ 0x7E;
        l.lIIlIIIlIl[25] = 0x50 ^ 0x4F;
        l.lIIlIIIlIl[26] = 0x44 ^ 9 ^ (0xC ^ 0x46);
        l.lIIlIIIlIl[27] = -" ".length();
        l.lIIlIIIlIl[28] = " ".length() & ~" ".length() ^ (0x2D ^ 8);
        l.lIIlIIIlIl[29] = 0x65 ^ 0x74 ^ (0x22 ^ 0x3B);
        l.lIIlIIIlIl[30] = 0x66 ^ 0x4B;
        l.lIIlIIIlIl[31] = 0xA ^ 3;
        l.lIIlIIIlIl[32] = 0x52 ^ 0x58;
        l.lIIlIIIlIl[33] = 0xAE ^ 0xA7 ^ "  ".length();
        l.lIIlIIIlIl[34] = 0x8F ^ 0x83;
        l.lIIlIIIlIl[35] = 0xBB ^ 0x84;
        l.lIIlIIIlIl[36] = 0x45 ^ 0x43 ^ (0xA7 ^ 0xAC);
        l.lIIlIIIlIl[37] = -(0xFFFFCEFE & 0x3F9B) & (0xFFFFCFFF & 0x3FD9);
        l.lIIlIIIlIl[38] = -(0xFFFFFAFF & 0x5DEE) & (0xFFFFFEFF & 0x5BFF);
        l.lIIlIIIlIl[39] = -(0xFFFFDF7F & 0x7282) & (0xFFFFFFBD & 0x5FEF);
        l.lIIlIIIlIl[40] = 0x38 ^ 0x36;
        l.lIIlIIIlIl[41] = 0x40 ^ 0x18 ^ (0xCF ^ 0x98);
        l.lIIlIIIlIl[42] = 0x9C ^ 0x8C;
        l.lIIlIIIlIl[43] = 0x47 ^ 0x56;
        l.lIIlIIIlIl[44] = -(0xFFFFEAEB & 0x7797) & (0xFFFFE7EF & 0x7FF7);
        l.lIIlIIIlIl[45] = 0xD2 ^ 0xC0;
        l.lIIlIIIlIl[46] = 29 + 30 - 8 + 92 ^ 36 + 120 - 153 + 153;
        l.lIIlIIIlIl[47] = 83 + 43 - 45 + 96 ^ 78 + 90 - 158 + 155;
        l.lIIlIIIlIl[48] = -(0xFFFF9ECB & 0x7775) & (0xFFFF9775 & 0x7FDE);
        l.lIIlIIIlIl[49] = -(0xFFFFEE7D & 0x3DAF) & (0xFFFFBF7D & 0x6EFF);
        l.lIIlIIIlIl[50] = 0x17 ^ 0x4D ^ (0x7C ^ 0x3C);
        l.lIIlIIIlIl[51] = 0x3C ^ 0x29;
        l.lIIlIIIlIl[52] = 0x50 ^ 0x1E ^ (0xEB ^ 0xB3);
        l.lIIlIIIlIl[53] = (0x35 ^ 0x1F) + (0x2C ^ 0x36) - -(0x11 ^ 9) + (0xF2 ^ 0x9F);
        l.lIIlIIIlIl[54] = 0xA1 ^ 0xB6;
        l.lIIlIIIlIl[55] = 0x85 ^ 0x9D;
        l.lIIlIIIlIl[56] = 0x71 ^ 0x6A;
        l.lIIlIIIlIl[57] = -(0xFFFF9A7B & 0x6D87) & (0xFFFF9FEA & 0x6BFF);
        l.lIIlIIIlIl[58] = 125 + 67 - 81 + 59;
        l.lIIlIIIlIl[59] = 0xFFFFBFEE & 0x4FB1;
        l.lIIlIIIlIl[60] = -(0xFFFFFAD5 & 0x5D3A) & (0xFFFFFFFF & 0x5FDF);
        l.lIIlIIIlIl[61] = -(0xFFFFF66B & 0x7D97) & (0xFFFFFFBE & 0x7FFB);
        l.lIIlIIIlIl[62] = -(0xFFFFF6A7 & 0x4D7B) & (0xFFFFF7F6 & 0x7CFF);
        l.lIIlIIIlIl[63] = 0xFFFFBDCE & 0x7EBD;
        l.lIIlIIIlIl[64] = 0xE5 ^ 0xBB ^ (0x29 ^ 0xF);
        l.lIIlIIIlIl[65] = (0x55 ^ 0x6E) + (24 + 26 - 41 + 126) - (40 + 74 - 29 + 53) + (0xF1 ^ 0xAF);
        l.lIIlIIIlIl[66] = -(0xFFFFF1FF & 0x4E63) & (0xFFFFFAFF & 0x7FFA);
        l.lIIlIIIlIl[67] = 179 + 185 - 297 + 164 ^ 129 + 44 - 150 + 108;
        l.lIIlIIIlIl[68] = 0xFFFFAEED & 0x7FDE;
        l.lIIlIIIlIl[69] = -(0xFFFFE8DB & 0x1F65) & (0xFFFFEFFE & 0x79E9);
        l.lIIlIIIlIl[70] = -(166 + 92 - 230 + 141) & (0xFFFFBFEF & 0x5FFF);
        l.lIIlIIIlIl[71] = -(0xFFFFF8F9 & 0x7F5F) & (0xFFFFFFFD & 0x7BDE);
        l.lIIlIIIlIl[72] = 0x55 ^ 0x49;
        l.lIIlIIIlIl[73] = 229 + 92 - 169 + 85 ^ 15 + 120 - 87 + 94;
        l.lIIlIIIlIl[74] = 0x39 ^ 0x6E ^ (0xEC ^ 0xA6);
        l.lIIlIIIlIl[75] = 0xAC ^ 0xB2;
        l.lIIlIIIlIl[76] = -(0xFFFFF929 & 0x46D7) & (0xFFFFFFFE & 0x4BCF);
        l.lIIlIIIlIl[77] = -" ".length() & (0xFFFFFEEF & 0xDF3);
        l.lIIlIIIlIl[78] = 0xFFFFBFD7 & 0x4BFF;
        l.lIIlIIIlIl[79] = -(0xFFFFC999 & 0x7667) & (0xFFFFCDEF & 0x7EF9);
        l.lIIlIIIlIl[80] = -(0xFFFFF1A5 & 0x1F7F) & (0xFFFFFD7F & 0x1FFE);
        l.lIIlIIIlIl[81] = 0xFFFFFDBF & 0xFDF;
    }

    private static void aa() {
        if (l.llllIllIllII(l.llllIllIlIll(e.u(), 30.0))) {
            int[] nArray = new int[lIIlIIIlIl[1]];
            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[18];
            if (l.llllIllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIlIIIlIl[1]];
                nArray2[l.lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                Inventory.getFirst((int[])nArray2).interact(lIIlIIIlII[lIIlIIIlIl[41]]);
                Time.sleepTicks((int)lIIlIIIlIl[1]);
                "".length();
            }
        }
        if (l.llllIllIllIl(Players.getLocal().getInteracting())) {
            NPC lIIlIllIlI = NPCs.getNearest(nPC -> {
                int n2;
                if (l.llllIllIIlII(nPC.getName().contains(lIIlIIIlII[lIIlIIIlIl[75]]) ? 1 : 0) && l.llllIllIIllI(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIlIIIlIl[1];
                    "".length();
                    if (-" ".length() > "   ".length()) {
                        return ((0x9B ^ 0x8C) & ~(0x89 ^ 0x9E)) != 0;
                    }
                } else {
                    n2 = lIIlIIIlIl[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIIlIIIlIl[2]];
            stringArray[l.lIIlIIIlIl[0]] = lIIlIIIlII[lIIlIIIlIl[42]];
            stringArray[l.lIIlIIIlIl[1]] = lIIlIIIlII[lIIlIIIlIl[43]];
            List lIIlIllIIl = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (l.llllIllIlllI(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIIlIIIlIl[1];
                    "".length();
                    if (((0xD ^ 0x35 ^ (0x97 ^ 0xA9)) & (0x7A ^ 0x5A ^ (0xBF ^ 0x99) ^ -" ".length())) != 0) {
                        return ((0x5C ^ 0 ^ (0x28 ^ 0x32)) & (26 + 78 - -64 + 68 ^ 131 + 134 - 190 + 95 ^ -" ".length())) != 0;
                    }
                } else {
                    bl = lIIlIIIlIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIIlIIIlIl[1]];
            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[44];
            if (l.llllIllIIlII(Equipment.contains((int[])nArray) ? 1 : 0) && l.llllIllIIllI(l.ad() ? 1 : 0)) {
                l.ae();
            }
            if (l.llllIllIIlll(lIIlIllIlI) && l.llllIllIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[45]];
                lIIlIllIlI.interact(lIIlIIIlII[lIIlIIIlIl[46]]);
                Time.sleepTicks((int)lIIlIIIlIl[3]);
                "".length();
            }
        }
        if (l.llllIllIIlll(Players.getLocal().getInteracting())) {
            AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[47]];
            Time.sleepTicks((int)lIIlIIIlIl[1]);
            "".length();
        }
    }

    private static boolean llllIllIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llllIllIllIl(Object object) {
        return object == null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[19])) break block19;
                                                    int[] nArray = new int[lIIlIIIlIl[1]];
                                                    nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[7];
                                                    if (!l.llllIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIlIIIlIl[1]];
                                                    nArray2[l.lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                                                    if (!l.llllIllIIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIlIIIlIl[1]];
                                                    nArray3[l.lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                                                    if (!l.llllIllIIlII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIlIIIlIl[1]];
                                                    nArray4[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                                                    if (!l.llllIllIIlII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIlIIIlIl[1]];
                                                    nArray5[l.lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                                                    if (!l.llllIllIIlII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIlIIIlIl[1]];
                                                    nArray6[l.lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                                    if (!l.llllIllIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIlIIIlIl[1]];
                                                    nArray7[l.lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                                    if (!l.llllIllIIlII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIlIIIlIl[1];
                                                "".length();
                                                if (((0x18 ^ 0x22) & ~(0x22 ^ 0x18)) == 0) return n5 != 0;
                                                return ((0xFE ^ 0xC2) & ~(2 ^ 0x3E)) != 0;
                                            }
                                            n5 = lIIlIIIlIl[0];
                                            return n5 != 0;
                                        }
                                        if (!l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[19]) || !l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6])) break block22;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                                        if (!l.llllIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIlIIIlIl[1]];
                                        nArray8[l.lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                                        if (!l.llllIllIIlII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIlIIIlIl[1]];
                                        nArray9[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                                        if (!l.llllIllIIlII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIlIIIlIl[1]];
                                        nArray10[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                                        if (!l.llllIllIIlII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIlIIIlIl[1]];
                                        nArray11[l.lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                        if (!l.llllIllIIllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIlIIIlIl[1]];
                                        nArray12[l.lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                        if (!l.llllIllIIlII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIlIIIlIl[1];
                                    "".length();
                                    if (" ".length() > ((0x32 ^ 0x1F) & ~(0x86 ^ 0xAB))) return n4 != 0;
                                    return ((0x3A ^ 0x16) & ~(0xEE ^ 0xC2)) != 0;
                                }
                                n4 = lIIlIIIlIl[0];
                                return n4 != 0;
                            }
                            if (!l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6]) || !l.llllIllIIllI(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIlIIIlIl[1]];
                            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                            if (!l.llllIllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIlIIIlIl[1]];
                            nArray13[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                            if (!l.llllIllIIlII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIlIIIlIl[1]];
                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                        if (l.llllIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIlIIIlIl[1]];
                            nArray14[l.lIIlIIIlIl[0]] = lIIlIIIlIl[23];
                            if (l.llllIllIIlII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIlIIIlIl[1];
                                "".length();
                                if (null == null) return n3 != 0;
                                return ((62 + 223 - 38 + 2 ^ 21 + 91 - 30 + 92) & (0x59 ^ 0x7D ^ (0xF1 ^ 0x82) ^ -" ".length())) != 0;
                            }
                        }
                    }
                    n3 = lIIlIIIlIl[0];
                    return n3 != 0;
                }
                if (!l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6]) || !l.llllIllIIlII(bu ? 1 : 0)) return lIIlIIIlIl[0];
                int[] nArray = new int[lIIlIIIlIl[1]];
                nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                if (!l.llllIllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIlIIIlIl[1]];
                nArray15[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                if (!l.llllIllIIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIlIIIlIl[1]];
            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
            if (l.llllIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlIIIlIl[1]];
                nArray16[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                if (l.llllIllIIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlIIIlIl[1]];
                    nArray17[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                    if (l.llllIllIlIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIlIIIlIl[17])) {
                        int[] nArray18 = new int[lIIlIIIlIl[1]];
                        nArray18[l.lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                        if (l.llllIllIIlII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIlIIIlIl[1]];
                            nArray19[l.lIIlIIIlIl[0]] = lIIlIIIlIl[23];
                            if (l.llllIllIIlII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIlIIIlIl[1];
                                "".length();
                                if (null == null) return n2 != 0;
                                return ((83 + 113 - 188 + 127 ^ 161 + 30 - 178 + 174) & (0x52 ^ 0x31 ^ (0xF0 ^ 0xAF) ^ -" ".length())) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIlIIIlIl[0];
        return n2 != 0;
    }

    private static boolean llllIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIllIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llllIllIIIII(String lIIlIIIIll, String lIIlIIIIlI) {
        try {
            SecretKeySpec lIIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIIIlIl = Cipher.getInstance("Blowfish");
            lIIlIIIlIl.init(l.lIIlIIIlIl[2], lIIlIIIllI);
            return new String(lIIlIIIlIl.doFinal(Base64.getDecoder().decode(lIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIIIlII) {
            lIIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllIIlll(Object object) {
        return object != null;
    }

    private static void llllIllIIIlI() {
        lIIlIIIlII = new String[lIIlIIIlIl[25]];
        l.lIIlIIIlII[l.lIIlIIIlIl[0]] = l.llllIlIlllll("DzY9OQEqYy0kCiAw", "MCDPo");
        l.lIIlIIIlII[l.lIIlIIIlIl[1]] = l.llllIllIIIII("vUA9u8ToaW+ynFu019lv//ZJseBsQmRHX5B6E5A1xNW00eRmey43w6Qibvr4JD3eSkhpUhHQ3RE=", "Wccsp");
        l.lIIlIIIlII[l.lIIlIIIlIl[2]] = l.llllIllIIIII("76AcpLYLPidK8mlS8UFou9wux0B3t+hU", "iMVDr");
        l.lIIlIIIlII[l.lIIlIIIlIl[3]] = l.llllIlIlllll("PSYHJj4cKQ5iMBQpAis8Eg==", "uGiBR");
        l.lIIlIIIlII[l.lIIlIIIlIl[5]] = l.llllIlIlllll("IQd0MSoTQjk5KwULOjd4BRckIDQfByd8eAUVPSQ7Hgs6N3gCDXQSDS8rGhc=", "vbTPX");
        l.lIIlIIIlII[l.lIIlIIIlIl[17]] = l.llllIllIIIIl("6CMkLyAVPH7tqKs0jB2x3A==", "eowER");
        l.lIIlIIIlII[l.lIIlIIIlIl[24]] = l.llllIllIIIIl("x84aIjLRnZZ9xLe8phqqZQ==", "LGIYK");
        l.lIIlIIIlII[l.lIIlIIIlIl[26]] = l.llllIlIlllll("LTcVHyUAMUYdLRwkCQgnTiIDByk=", "nVfkL");
        l.lIIlIIIlII[l.lIIlIIIlIl[29]] = l.llllIlIlllll("FDMdNhE5NU4uDTowF2IMMj4L", "WRnBx");
        l.lIIlIIIlII[l.lIIlIIIlIl[31]] = l.llllIlIlllll("EDk5EBM9P2oCGz80M0QONjQv", "SXJdz");
        l.lIIlIIIlII[l.lIIlIIIlIl[32]] = l.llllIllIIIIl("L1OMNss8HYBc2ChmmpvLSPlTSGpVJfuq", "eoRxl");
        l.lIIlIIIlII[l.lIIlIIIlIl[33]] = l.llllIllIIIIl("w7H73CdJTmo=", "TsAjd");
        l.lIIlIIIlII[l.lIIlIIIlIl[34]] = l.llllIllIIIIl("Y40eG6hxOO8=", "EMNNG");
        l.lIIlIIIlII[l.lIIlIIIlIl[36]] = l.llllIllIIIIl("UFham3rDYLD3i4biYym5nUjMNRS/xhVc", "HlRMQ");
        l.lIIlIIIlII[l.lIIlIIIlIl[40]] = l.llllIllIIIII("geYxFEkyesdsN1wo5RpWHw==", "JuzLY");
        l.lIIlIIIlII[l.lIIlIIIlIl[41]] = l.llllIlIlllll("IjgY", "gYlRF");
        l.lIIlIIIlII[l.lIIlIIIlIl[42]] = l.llllIllIIIII("p3P66hLSGD8=", "QMDBr");
        l.lIIlIIIlII[l.lIIlIIIlIl[43]] = l.llllIllIIIII("xQy4AbtnXmY=", "RdtiT");
        l.lIIlIIIlII[l.lIIlIIIlIl[45]] = l.llllIllIIIII("pkNnIk6zdP5p1waLULXLzA==", "fWHoe");
        l.lIIlIIIlII[l.lIIlIIIlIl[46]] = l.llllIllIIIIl("EcmjHiOcMWg=", "SnerH");
        l.lIIlIIIlII[l.lIIlIIIlIl[47]] = l.llllIlIlllll("PwV2DD8bCTcb", "vkVoP");
        l.lIIlIIIlII[l.lIIlIIIlIl[51]] = l.llllIllIIIIl("zq5t3+pCXnmME2Mv8WX0TXvIzs9PqnDM", "yaoKE");
        l.lIIlIIIlII[l.lIIlIIIlIl[52]] = l.llllIlIlllll("IQM+IwUHSyI8Ew4H", "bkQLv");
        l.lIIlIIIlII[l.lIIlIIIlIl[54]] = l.llllIlIlllll("ES0pPHEVMDUxOiM=", "FDGXQ");
        l.lIIlIIIlII[l.lIIlIIIlIl[55]] = l.llllIlIlllll("Lw4GIABYPAY3GxMK", "xorEr");
        l.lIIlIIIlII[l.lIIlIIIlIl[19]] = l.llllIllIIIII("GmYtzDkGLLVm7w2RPQbpHg==", "aKCeq");
        l.lIIlIIIlII[l.lIIlIIIlIl[50]] = l.llllIllIIIII("rBkFWYSqu8Z+qaAwCnYuXg==", "cikbC");
        l.lIIlIIIlII[l.lIIlIIIlIl[56]] = l.llllIllIIIIl("7LKFtIMgeVL/+ZF3Q5M74A==", "lubcL");
        l.lIIlIIIlII[l.lIIlIIIlIl[72]] = l.llllIllIIIII("TNeburdR2v+Dh5Y0wtobZA==", "pDCJI");
        l.lIIlIIIlII[l.lIIlIIIlIl[74]] = l.llllIllIIIII("HewUm63QynDLbASnKLAJwh0zwmMjKr2G", "dEhXN");
        l.lIIlIIIlII[l.lIIlIIIlIl[75]] = l.llllIllIIIII("8s5lLPXzf3U=", "rNSCh");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[19])) break block19;
                                                    int[] nArray = new int[lIIlIIIlIl[1]];
                                                    nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[7];
                                                    if (!l.llllIllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIlIIIlIl[1]];
                                                    nArray2[l.lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                                                    if (!l.llllIllIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIlIIIlIl[1]];
                                                    nArray3[l.lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                                                    if (!l.llllIllIIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIlIIIlIl[1]];
                                                    nArray4[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                                                    if (!l.llllIllIIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIlIIIlIl[1]];
                                                    nArray5[l.lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                                                    if (!l.llllIllIIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIlIIIlIl[1]];
                                                    nArray6[l.lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                                    if (!l.llllIllIIllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIlIIIlIl[1]];
                                                    nArray7[l.lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                                    if (!l.llllIllIIlII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIlIIIlIl[1];
                                                "".length();
                                                if (null == null) return n5 != 0;
                                                return (" ".length() & (" ".length() ^ -" ".length())) != 0;
                                            }
                                            n5 = lIIlIIIlIl[0];
                                            return n5 != 0;
                                        }
                                        if (!l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[19]) || !l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6])) break block22;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                                        if (!l.llllIllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIlIIIlIl[1]];
                                        nArray8[l.lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                                        if (!l.llllIllIIlII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIlIIIlIl[1]];
                                        nArray9[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                                        if (!l.llllIllIIlII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIlIIIlIl[1]];
                                        nArray10[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                                        if (!l.llllIllIIlII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIlIIIlIl[1]];
                                        nArray11[l.lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                        if (!l.llllIllIIllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIlIIIlIl[1]];
                                        nArray12[l.lIIlIIIlIl[0]] = lIIlIIIlIl[44];
                                        if (!l.llllIllIIlII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIlIIIlIl[1];
                                    "".length();
                                    if (-" ".length() < " ".length()) return n4 != 0;
                                    return ((0x8C ^ 0xB5) & ~(0xA ^ 0x33)) != 0;
                                }
                                n4 = lIIlIIIlIl[0];
                                return n4 != 0;
                            }
                            if (!l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6]) || !l.llllIllIIllI(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIlIIIlIl[1]];
                            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                            if (!l.llllIllIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIlIIIlIl[1]];
                            nArray13[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                            if (!l.llllIllIIlII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIlIIIlIl[1]];
                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                        if (l.llllIllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIlIIIlIl[1]];
                            nArray14[l.lIIlIIIlIl[0]] = lIIlIIIlIl[35];
                            if (l.llllIllIIlII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIlIIIlIl[1];
                                "".length();
                                if (((5 ^ 0x1E ^ (0x79 ^ 0x5F)) & (0x7D ^ 0x4F ^ (0x56 ^ 0x59) ^ -" ".length())) < (22 + 32 - 3 + 95 ^ 128 + 143 - 169 + 48)) return n3 != 0;
                                return ((0x6C ^ 6 ^ (0x8E ^ 0xB2)) & (0xAE ^ 0x8B ^ (0x2D ^ 0x5E) ^ -" ".length())) != 0;
                            }
                        }
                    }
                    n3 = lIIlIIIlIl[0];
                    return n3 != 0;
                }
                if (!l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6]) || !l.llllIllIIlII(bu ? 1 : 0)) return lIIlIIIlIl[0];
                int[] nArray = new int[lIIlIIIlIl[1]];
                nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                if (!l.llllIllIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIlIIIlIl[1]];
                nArray15[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                if (!l.llllIllIIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIlIIIlIl[1]];
            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
            if (l.llllIllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIlIIIlIl[1]];
                nArray16[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                if (l.llllIllIIlII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlIIIlIl[1]];
                    nArray17[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                    if (l.llllIllIlIIl(Inventory.getFirst((int[])nArray17).getQuantity(), lIIlIIIlIl[17])) {
                        int[] nArray18 = new int[lIIlIIIlIl[1]];
                        nArray18[l.lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                        if (l.llllIllIIlII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIlIIIlIl[1]];
                            nArray19[l.lIIlIIIlIl[0]] = lIIlIIIlIl[35];
                            if (l.llllIllIIlII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIlIIIlIl[1];
                                "".length();
                                if (null == null) return n2 != 0;
                                return ((0x89 ^ 0x96) & ~(0x46 ^ 0x59)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIlIIIlIl[0];
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIIlIIIlIl[0];
    }

    private static void af() {
        d lIIlIlIlIl;
        Object lIIlIlIllI;
        if (l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6])) {
            int[] nArray = new int[lIIlIIIlIl[1]];
            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
            if (l.llllIllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIIlIIIlIl[14], lIIlIIIlIl[57], lIIlIIIlIl[58]);
                bv.add(d2);
                "".length();
            }
            int[] nArray2 = new int[lIIlIIIlIl[1]];
            nArray2[l.lIIlIIIlIl[0]] = lIIlIIIlIl[7];
            if (l.llllIllIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIIlIlIllI = new d(lIIlIIIlIl[7], lIIlIIIlIl[59], lIIlIIIlIl[24]);
                bv.add((d)lIIlIlIllI);
                "".length();
            }
            int[] nArray3 = new int[lIIlIIIlIl[1]];
            nArray3[l.lIIlIIIlIl[0]] = lIIlIIIlIl[9];
            if (l.llllIllIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIIlIlIllI = new d(lIIlIIIlIl[9], lIIlIIIlIl[60], lIIlIIIlIl[24]);
                bv.add((d)lIIlIlIllI);
                "".length();
            }
            int[] nArray4 = new int[lIIlIIIlIl[1]];
            nArray4[l.lIIlIIIlIl[0]] = lIIlIIIlIl[11];
            if (l.llllIllIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIIlIlIllI = new d(lIIlIIIlIl[11], lIIlIIIlIl[61], lIIlIIIlIl[24]);
                bv.add((d)lIIlIlIllI);
                "".length();
            }
            int[] nArray5 = new int[lIIlIIIlIl[1]];
            nArray5[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
            if (l.llllIllIIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIIlIlIllI = new d(lIIlIIIlIl[12], lIIlIIIlIl[4], lIIlIIIlIl[24]);
                bv.add((d)lIIlIlIllI);
                "".length();
            }
            int[] nArray6 = new int[lIIlIIIlIl[1]];
            nArray6[l.lIIlIIIlIl[0]] = lIIlIIIlIl[44];
            if (l.llllIllIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIIlIlIllI = new d(lIIlIIIlIl[44], lIIlIIIlIl[1], e.c(lIIlIIIlIl[62], lIIlIIIlIl[63]));
                bv.add((d)lIIlIlIllI);
                "".length();
            }
        }
        if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6])) {
            int[] nArray = new int[lIIlIIIlIl[1]];
            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[22];
            if (l.llllIllIIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIIlIIIlIl[1]];
                nArray7[l.lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                if (l.llllIllIIlIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIlIIIlIl[61])) {
                    int[] nArray8 = new int[lIIlIIIlIl[1]];
                    nArray8[l.lIIlIIIlIl[0]] = lIIlIIIlIl[22];
                    lIIlIlIllI = new d(lIIlIIIlIl[22], lIIlIIIlIl[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIIlIIIlIl[64]);
                    bv.add((d)lIIlIlIllI);
                    "".length();
                }
            }
            int[] nArray9 = new int[lIIlIIIlIl[1]];
            nArray9[l.lIIlIIIlIl[0]] = lIIlIIIlIl[22];
            if (l.llllIllIIllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIIlIlIllI = new d(lIIlIIIlIl[22], lIIlIIIlIl[61], lIIlIIIlIl[64]);
                bv.add((d)lIIlIlIllI);
                "".length();
            }
            int[] nArray10 = new int[lIIlIIIlIl[1]];
            nArray10[l.lIIlIIIlIl[0]] = lIIlIIIlIl[23];
            if (l.llllIllIIlII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIlIIIlIl[1]];
                nArray11[l.lIIlIIIlIl[0]] = lIIlIIIlIl[23];
                if (l.llllIllIIlIl(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIIIlIl[61])) {
                    int[] nArray12 = new int[lIIlIIIlIl[1]];
                    nArray12[l.lIIlIIIlIl[0]] = lIIlIIIlIl[23];
                    lIIlIlIllI = new d(lIIlIIIlIl[23], lIIlIIIlIl[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIIlIIIlIl[65]);
                    bv.add((d)lIIlIlIllI);
                    "".length();
                }
            }
            int[] nArray13 = new int[lIIlIIIlIl[1]];
            nArray13[l.lIIlIIIlIl[0]] = lIIlIIIlIl[23];
            if (l.llllIllIIllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIIlIlIllI = new d(lIIlIIIlIl[23], lIIlIIIlIl[61], lIIlIIIlIl[65]);
                bv.add((d)lIIlIlIllI);
                "".length();
            }
            int[] nArray14 = new int[lIIlIIIlIl[1]];
            nArray14[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
            if (l.llllIllIIllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIlIIIlIl[1]];
                nArray15[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                if (l.llllIllIIllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIIlIlIllI = new d(lIIlIIIlIl[20], lIIlIIIlIl[1], lIIlIIIlIl[66]);
                    bv.add((d)lIIlIlIllI);
                    "".length();
                }
            }
            if (l.llllIllIIlII(bu ? 1 : 0)) {
                int[] nArray16 = new int[lIIlIIIlIl[1]];
                nArray16[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                if (l.llllIllIIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIlIIIlIl[1]];
                    nArray17[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                    if (l.llllIllIIlIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIlIIIlIl[61])) {
                        int[] nArray18 = new int[lIIlIIIlIl[1]];
                        nArray18[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                        lIIlIlIllI = new d(lIIlIIIlIl[14], lIIlIIIlIl[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIIlIIIlIl[58]);
                        bv.add((d)lIIlIlIllI);
                        "".length();
                    }
                }
                int[] nArray19 = new int[lIIlIIIlIl[1]];
                nArray19[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                if (l.llllIllIIllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIIlIlIllI = new d(lIIlIIIlIl[14], lIIlIIIlIl[61], lIIlIIIlIl[58]);
                    bv.add((d)lIIlIlIllI);
                    "".length();
                }
                int[] nArray20 = new int[lIIlIIIlIl[1]];
                nArray20[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                if (l.llllIllIIlII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIlIIIlIl[1]];
                    nArray21[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                    if (l.llllIllIIlIl(Bank.getFirst((int[])nArray21).getQuantity(), lIIlIIIlIl[66])) {
                        int[] nArray22 = new int[lIIlIIIlIl[1]];
                        nArray22[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                        lIIlIlIllI = new d(lIIlIIIlIl[21], lIIlIIIlIl[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIIlIIIlIl[24]);
                        bv.add((d)lIIlIlIllI);
                        "".length();
                    }
                }
                int[] nArray23 = new int[lIIlIIIlIl[1]];
                nArray23[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                if (l.llllIllIIllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIIlIlIllI = new d(lIIlIIIlIl[21], lIIlIIIlIl[66], lIIlIIIlIl[24]);
                    bv.add((d)lIIlIlIllI);
                    "".length();
                }
            }
        }
        int[] nArray = new int[lIIlIIIlIl[1]];
        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[18];
        if (l.llllIllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIlIlIllI = new d(lIIlIIIlIl[18], lIIlIIIlIl[67], lIIlIIIlIl[37]);
            bv.add((d)lIIlIlIllI);
            "".length();
        }
        if (l.llllIllIIllI(Bank.contains(lIIlIlIllI = item -> item.getName().toLowerCase().contains(lIIlIIIlII[lIIlIIIlIl[74]])) ? 1 : 0)) {
            lIIlIlIlIl = new d(lIIlIIIlIl[68], lIIlIIIlIl[17], lIIlIIIlIl[69]);
            bv.add(lIIlIlIlIl);
            "".length();
        }
        int[] nArray24 = new int[lIIlIIIlIl[1]];
        nArray24[l.lIIlIIIlIl[0]] = lIIlIIIlIl[70];
        if (l.llllIllIIllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIIlIlIlIl = new d(lIIlIIIlIl[70], lIIlIIIlIl[32], lIIlIIIlIl[71]);
            bv.add(lIIlIlIlIl);
            "".length();
        }
        int[] nArray25 = new int[lIIlIIIlIl[1]];
        nArray25[l.lIIlIIIlIl[0]] = lIIlIIIlIl[16];
        if (l.llllIllIIllI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIIlIlIlIl = new d(lIIlIIIlIl[16], lIIlIIIlIl[32], lIIlIIIlIl[71]);
            bv.add(lIIlIlIlIl);
            "".length();
        }
    }

    @Override
    public String U() {
        return lIIlIIIlII[lIIlIIIlIl[72]];
    }

    private static String llllIlIlllll(String lIIIlIIIIl, String lIIIlIIlIl) {
        lIIIlIIIIl = new String(Base64.getDecoder().decode(lIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlIIlII = new StringBuilder();
        char[] lIIIlIIIll = lIIIlIIlIl.toCharArray();
        int lIIIlIIIlI = lIIlIIIlIl[0];
        char[] lIIIIlllII = lIIIlIIIIl.toCharArray();
        int lIIIIllIll = lIIIIlllII.length;
        int lIIIIllIlI = lIIlIIIlIl[0];
        while (l.llllIllIIlIl(lIIIIllIlI, lIIIIllIll)) {
            char lIIIlIIlll = lIIIIlllII[lIIIIllIlI];
            lIIIlIIlII.append((char)(lIIIlIIlll ^ lIIIlIIIll[lIIIlIIIlI % lIIIlIIIll.length]));
            "".length();
            ++lIIIlIIIlI;
            ++lIIIIllIlI;
            "".length();
            if (((7 ^ 0x24) & ~(0x11 ^ 0x32)) == 0) continue;
            return null;
        }
        return String.valueOf(lIIIlIIlII);
    }

    public static boolean ad() {
        if (l.llllIllIlIlI(Vars.getBit((int)lIIlIIIlIl[48]), lIIlIIIlIl[1]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[17])) {
            return lIIlIIIlIl[1];
        }
        if (l.llllIllIlIlI(Vars.getBit((int)lIIlIIIlIl[48]), lIIlIIIlIl[2]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[31]) && l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[17])) {
            return lIIlIIIlIl[1];
        }
        if (l.llllIllIlIlI(Vars.getBit((int)lIIlIIIlIl[48]), lIIlIIIlIl[3]) && l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[31]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[36])) {
            return lIIlIIIlIl[1];
        }
        if (l.llllIllIlIlI(Vars.getBit((int)lIIlIIIlIl[48]), lIIlIIIlIl[3]) && l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[31])) {
            int[] nArray = new int[lIIlIIIlIl[1]];
            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
            if (l.llllIllIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIlIIIlIl[1];
            }
        }
        if (l.llllIllIlIlI(Vars.getBit((int)lIIlIIIlIl[48]), lIIlIIIlIl[5]) && l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[36])) {
            int[] nArray = new int[lIIlIIIlIl[1]];
            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
            if (l.llllIllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIlIIIlIl[1];
            }
        }
        return lIIlIIIlIl[0];
    }

    private static boolean llllIllIllll(int n2, int n3) {
        return n2 > n3;
    }
}

