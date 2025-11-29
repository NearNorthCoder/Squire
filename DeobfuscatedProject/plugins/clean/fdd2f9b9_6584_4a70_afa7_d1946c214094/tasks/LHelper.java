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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.VHelper;
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

public class LHelper
implements G {
    static  WorldPoint by;
    static  WorldArea bw;
    public static  boolean bu;
    public static  boolean bt;
    static  WorldPoint bx;
    public static  List<d> bv;

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

                    }
                    if (l.llllIllIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (l.llllIllIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIIIlIl[5]);

                        }
                        while (l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6]) && l.llllIllIIllI(v.aX() ? 1 : 0)) {
                            v.aV();
                            Time.sleepTicks((int)lIIlIIIlIl[1]);

                            if (2 <= 3) continue;
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

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[7];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];

                                            if (3 < 2) {
                                                return ((0x4F ^ 0x3E ^ (0x14 ^ 0x3B)) & (0xBB ^ 0xA2 ^ (0xC2 ^ 0x85) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);

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

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[9];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];

                                            if ((0x73 ^ 0x2B ^ (0x21 ^ 0x7D)) <= 1) {
                                                return (2 & (2 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);

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

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[11];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];

                                            if (-(0x8F ^ 0x8A) >= 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);

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

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];

                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);

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

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];

                                            if (3 < (2 & (2 ^ -1))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);

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

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIlIIIlIl[4]);

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

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIlIIIlIl[1]];
                                        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[18];
                                        if (l.llllIllIlIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIlIIIlIl[1];

                                            if (3 > (0xB ^ 0x2B ^ (0x24 ^ 0))) {
                                                return ((150 + 174 - 190 + 46 ^ 22 + 76 - 71 + 102) & (0xB8 ^ 0xB4 ^ (0x22 ^ 0x1B) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIlIIIlIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIlIIIlIl[4]);

                                }
                            }
                        }
                        if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6])) {
                            int[] nArray = new int[lIIlIIIlIl[1]];
                            nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                            if (l.llllIllIIllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIlIIIlIl[20], (int)lIIlIIIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlIIIlIl[1]);

                            }
                            if (l.llllIllIIlII(bu ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIlIIIlIl[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlIIIlIl[1]);

                                Bank.withdrawAll((int)lIIlIIIlIl[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIlIIIlIl[1]);

                            }
                            Bank.withdrawAll((int)lIIlIIIlIl[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIlIIIlIl[1]);

                            Bank.withdrawAll((int)lIIlIIIlIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIlIIIlIl[1]);

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

                        Time.sleepTicks((int)lIIlIIIlIl[1]);

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

                    }
                }
                if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[25]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[28])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[29]];
                    if (l.llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIlIIIlIl[1]);

                    }
                }
                if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[28]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[30])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[31]];
                    if (l.llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIlIIIlIl[1]);

                    }
                }
                if (l.llllIllIlIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[30]) && l.llllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIlIIIlIl[6])) {
                    AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[32]];
                    if (l.llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIlIIIlIl[1]);

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

                            Time.sleepTicks((int)lIIlIIIlIl[1]);

                        }
                        if (l.llllIllIIlII(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0) && l.llllIllIIlll(lIIlIlllll) && l.llllIllIIlll(lIIlIllllI)) {
                            lIIlIlllIl = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIlIllllI);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (l.llllIllIllll(Skills.getExperience((Skill)Skill.MAGIC), lIIlIlllIl)) {
                                    bl = lIIlIIIlIl[1];

                                } else {
                                    bl = lIIlIIIlIl[0];
                                }
                                return bl;
                            }, (int)lIIlIIIlIl[8]);

                            Time.sleep((long)e.c(lIIlIIIlIl[37], lIIlIIIlIl[38]));

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

                                    if (-(6 ^ 2) > 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIlIIIlIl[0];
                                }
                                return bl;
                            }, (int)lIIlIIIlIl[8]);

                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (l.llllIllIlIlI(Players.getLocal().getAnimation(), lIIlIIIlIl[27])) {
                                bl = lIIlIIIlIl[1];

                            } else {
                                bl = lIIlIIIlIl[0];
                            }
                            return bl;
                        }, (int)lIIlIIIlIl[39]);

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

            Time.sleepTicks((int)lIIlIIIlIl[1]);

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

        }
        if (l.llllIllIllIl(Widgets.get((int)lIIlIIIlIl[49], (int)lIIlIIIlIl[50])) && l.llllIllIIllI(Widgets.get((int)lIIlIIIlIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIlIIIlIl[1]);

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

            if (((6 ^ 0x2C) & ~(0x4D ^ 0x67)) < ((0xA5 ^ 0xBC) & ~(0x3E ^ 0x27))) {
                return false;
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

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIlIIIlIl[67];
    }

    private static boolean llllIllIIllI(int n2) {
        return n2 == 0;
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

            }
        }
        if (l.llllIllIllIl(Players.getLocal().getInteracting())) {
            NPC lIIlIllIlI = NPCs.getNearest(nPC -> {
                int n2;
                if (l.llllIllIIlII(nPC.getName().contains(lIIlIIIlII[lIIlIIIlIl[75]]) ? 1 : 0) && l.llllIllIIllI(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIlIIIlIl[1];

                    if (-1 > 3) {
                        return false;
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

                    if (((0xD ^ 0x35 ^ (0x97 ^ 0xA9)) & (0x7A ^ 0x5A ^ (0xBF ^ 0x99) ^ -1)) != 0) {
                        return ((0x5C ^ 0 ^ (0x28 ^ 0x32)) & (26 + 78 - -64 + 68 ^ 131 + 134 - 190 + 95 ^ -1)) != 0;
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

            }
        }
        if (l.llllIllIIlll(Players.getLocal().getInteracting())) {
            AccBuilderRogues.c = lIIlIIIlII[lIIlIIIlIl[47]];
            Time.sleepTicks((int)lIIlIIIlIl[1]);

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

                                                if (((0x18 ^ 0x22) & ~(0x22 ^ 0x18)) == 0) return n5 != 0;
                                                return false;
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

                                    if (1 > ((0x32 ^ 0x1F) & ~(0x86 ^ 0xAB))) return n4 != 0;
                                    return false;
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

                                if (null == null) return n3 != 0;
                                return ((62 + 223 - 38 + 2 ^ 21 + 91 - 30 + 92) & (0x59 ^ 0x7D ^ (0xF1 ^ 0x82) ^ -1)) != 0;
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

                                if (null == null) return n2 != 0;
                                return ((83 + 113 - 188 + 127 ^ 161 + 30 - 178 + 174) & (0x52 ^ 0x31 ^ (0xF0 ^ 0xAF) ^ -1)) != 0;
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

    private static boolean llllIllIIlll(Object object) {
        return object != null;
    }

    private static void llllIllIIIlI() {
        lIIlIIIlII = new String[lIIlIIIlIl[25]];
        l.lIIlIIIlII[l.lIIlIIIlIl[0]] = "Buying items";
        l.lIIlIIIlII[l.lIIlIIIlIl[1]] = "Finished buying items, switching back to magic training";
        l.lIIlIIIlII[l.lIIlIIIlIl[2]] = "Navigating to bank";
        l.lIIlIIIlII[l.lIIlIIIlIl[3]] = "Handling banking";
        l.lIIlIIIlII[l.lIIlIIIlIl[5]] = "We are missing supplies, switching to BUYING";
        l.lIIlIIIlII[l.lIIlIIIlIl[17]] = "Nav to cows";
        l.lIIlIIIlII[l.lIIlIIIlIl[24]] = "Attacking cows";
        l.lIIlIIIlII[l.lIIlIIIlIl[26]] = "Casting varrock tele";
        l.lIIlIIIlII[l.lIIlIIIlIl[29]] = "Casting lumby tele";
        l.lIIlIIIlII[l.lIIlIIIlIl[31]] = "Casting fally tele";
        l.lIIlIIIlII[l.lIIlIIIlIl[32]] = "Casting cammy tele";
        l.lIIlIIIlII[l.lIIlIIIlIl[33]] = "Alching";
        l.lIIlIIIlII[l.lIIlIIIlIl[34]] = "Wield";
        l.lIIlIIIlII[l.lIIlIIIlIl[36]] = "Move to alch spot";
        l.lIIlIIIlII[l.lIIlIIIlIl[40]] = "Nav to cows";
        l.lIIlIIIlII[l.lIIlIIIlIl[41]] = "Eat";
        l.lIIlIIIlII[l.lIIlIIIlIl[42]] = "Cow";
        l.lIIlIIIlII[l.lIIlIIIlIl[43]] = "cow";
        l.lIIlIIIlII[l.lIIlIIIlIl[45]] = "Attacking cows";
        l.lIIlIIIlII[l.lIIlIIIlIl[46]] = "Attack";
        l.lIIlIIIlII[l.lIIlIIIlIl[47]] = "In combat";
        l.lIIlIIIlII[l.lIIlIIIlIl[51]] = "Opening autocast";
        l.lIIlIIIlII[l.lIIlIIIlIl[52]] = "Choose spell";
        l.lIIlIIIlII[l.lIIlIIIlIl[54]] = "Wind Strike";
        l.lIIlIIIlII[l.lIIlIIIlIl[55]] = "Water Strike";
        l.lIIlIIIlII[l.lIIlIIIlIl[19]] = "Earth Strike";
        l.lIIlIIIlII[l.lIIlIIIlIl[50]] = "Earth Strike";
        l.lIIlIIIlII[l.lIIlIIIlIl[56]] = "Fire Strike";
        l.lIIlIIIlII[l.lIIlIIIlIl[72]] = "Magic training";
        l.lIIlIIIlII[l.lIIlIIIlIl[74]] = "ring of wealth (";
        l.lIIlIIIlII[l.lIIlIIIlIl[75]] = "Cow";
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

                                                if (null == null) return n5 != 0;
                                                return (1 & (1 ^ -1)) != 0;
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

                                    if (-1 < 1) return n4 != 0;
                                    return false;
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

                                if (((5 ^ 0x1E ^ (0x79 ^ 0x5F)) & (0x7D ^ 0x4F ^ (0x56 ^ 0x59) ^ -1)) < (22 + 32 - 3 + 95 ^ 128 + 143 - 169 + 48)) return n3 != 0;
                                return ((0x6C ^ 6 ^ (0x8E ^ 0xB2)) & (0xAE ^ 0x8B ^ (0x2D ^ 0x5E) ^ -1)) != 0;
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

                                if (null == null) return n2 != 0;
                                return false;
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
                d d2 = new DHelper(lIIlIIIlIl[14], lIIlIIIlIl[57], lIIlIIIlIl[58]);
                bv.add(d2);

            }
            int[] nArray2 = new int[lIIlIIIlIl[1]];
            nArray2[l.lIIlIIIlIl[0]] = lIIlIIIlIl[7];
            if (l.llllIllIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIIlIlIllI = new DHelper(lIIlIIIlIl[7], lIIlIIIlIl[59], lIIlIIIlIl[24]);
                bv.add((DHelper) IIlIlIllI);

            }
            int[] nArray3 = new int[lIIlIIIlIl[1]];
            nArray3[l.lIIlIIIlIl[0]] = lIIlIIIlIl[9];
            if (l.llllIllIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIIlIlIllI = new DHelper(lIIlIIIlIl[9], lIIlIIIlIl[60], lIIlIIIlIl[24]);
                bv.add((DHelper) IIlIlIllI);

            }
            int[] nArray4 = new int[lIIlIIIlIl[1]];
            nArray4[l.lIIlIIIlIl[0]] = lIIlIIIlIl[11];
            if (l.llllIllIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIIlIlIllI = new DHelper(lIIlIIIlIl[11], lIIlIIIlIl[61], lIIlIIIlIl[24]);
                bv.add((DHelper) IIlIlIllI);

            }
            int[] nArray5 = new int[lIIlIIIlIl[1]];
            nArray5[l.lIIlIIIlIl[0]] = lIIlIIIlIl[12];
            if (l.llllIllIIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIIlIlIllI = new DHelper(lIIlIIIlIl[12], lIIlIIIlIl[4], lIIlIIIlIl[24]);
                bv.add((DHelper) IIlIlIllI);

            }
            int[] nArray6 = new int[lIIlIIIlIl[1]];
            nArray6[l.lIIlIIIlIl[0]] = lIIlIIIlIl[44];
            if (l.llllIllIIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIIlIlIllI = new DHelper(lIIlIIIlIl[44], lIIlIIIlIl[1], e.c(lIIlIIIlIl[62], lIIlIIIlIl[63]));
                bv.add((DHelper) IIlIlIllI);

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
                    lIIlIlIllI = new DHelper(lIIlIIIlIl[22], lIIlIIIlIl[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIIlIIIlIl[64]);
                    bv.add((DHelper) IIlIlIllI);

                }
            }
            int[] nArray9 = new int[lIIlIIIlIl[1]];
            nArray9[l.lIIlIIIlIl[0]] = lIIlIIIlIl[22];
            if (l.llllIllIIllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIIlIlIllI = new DHelper(lIIlIIIlIl[22], lIIlIIIlIl[61], lIIlIIIlIl[64]);
                bv.add((DHelper) IIlIlIllI);

            }
            int[] nArray10 = new int[lIIlIIIlIl[1]];
            nArray10[l.lIIlIIIlIl[0]] = lIIlIIIlIl[23];
            if (l.llllIllIIlII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIlIIIlIl[1]];
                nArray11[l.lIIlIIIlIl[0]] = lIIlIIIlIl[23];
                if (l.llllIllIIlIl(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIIIlIl[61])) {
                    int[] nArray12 = new int[lIIlIIIlIl[1]];
                    nArray12[l.lIIlIIIlIl[0]] = lIIlIIIlIl[23];
                    lIIlIlIllI = new DHelper(lIIlIIIlIl[23], lIIlIIIlIl[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIIlIIIlIl[65]);
                    bv.add((DHelper) IIlIlIllI);

                }
            }
            int[] nArray13 = new int[lIIlIIIlIl[1]];
            nArray13[l.lIIlIIIlIl[0]] = lIIlIIIlIl[23];
            if (l.llllIllIIllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIIlIlIllI = new DHelper(lIIlIIIlIl[23], lIIlIIIlIl[61], lIIlIIIlIl[65]);
                bv.add((DHelper) IIlIlIllI);

            }
            int[] nArray14 = new int[lIIlIIIlIl[1]];
            nArray14[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
            if (l.llllIllIIllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIlIIIlIl[1]];
                nArray15[l.lIIlIIIlIl[0]] = lIIlIIIlIl[20];
                if (l.llllIllIIllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIIlIlIllI = new DHelper(lIIlIIIlIl[20], lIIlIIIlIl[1], lIIlIIIlIl[66]);
                    bv.add((DHelper) IIlIlIllI);

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
                        lIIlIlIllI = new DHelper(lIIlIIIlIl[14], lIIlIIIlIl[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIIlIIIlIl[58]);
                        bv.add((DHelper) IIlIlIllI);

                    }
                }
                int[] nArray19 = new int[lIIlIIIlIl[1]];
                nArray19[l.lIIlIIIlIl[0]] = lIIlIIIlIl[14];
                if (l.llllIllIIllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIIlIlIllI = new DHelper(lIIlIIIlIl[14], lIIlIIIlIl[61], lIIlIIIlIl[58]);
                    bv.add((DHelper) IIlIlIllI);

                }
                int[] nArray20 = new int[lIIlIIIlIl[1]];
                nArray20[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                if (l.llllIllIIlII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIlIIIlIl[1]];
                    nArray21[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                    if (l.llllIllIIlIl(Bank.getFirst((int[])nArray21).getQuantity(), lIIlIIIlIl[66])) {
                        int[] nArray22 = new int[lIIlIIIlIl[1]];
                        nArray22[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                        lIIlIlIllI = new DHelper(lIIlIIIlIl[21], lIIlIIIlIl[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIIlIIIlIl[24]);
                        bv.add((DHelper) IIlIlIllI);

                    }
                }
                int[] nArray23 = new int[lIIlIIIlIl[1]];
                nArray23[l.lIIlIIIlIl[0]] = lIIlIIIlIl[21];
                if (l.llllIllIIllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIIlIlIllI = new DHelper(lIIlIIIlIl[21], lIIlIIIlIl[66], lIIlIIIlIl[24]);
                    bv.add((DHelper) IIlIlIllI);

                }
            }
        }
        int[] nArray = new int[lIIlIIIlIl[1]];
        nArray[l.lIIlIIIlIl[0]] = lIIlIIIlIl[18];
        if (l.llllIllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIlIlIllI = new DHelper(lIIlIIIlIl[18], lIIlIIIlIl[67], lIIlIIIlIl[37]);
            bv.add((DHelper) IIlIlIllI);

        }
        if (l.llllIllIIllI(Bank.contains(lIIlIlIllI = item -> item.getName().toLowerCase().contains(lIIlIIIlII[lIIlIIIlIl[74]])) ? 1 : 0)) {
            lIIlIlIlIl = new DHelper(lIIlIIIlIl[68], lIIlIIIlIl[17], lIIlIIIlIl[69]);
            bv.add(lIIlIlIlIl);

        }
        int[] nArray24 = new int[lIIlIIIlIl[1]];
        nArray24[l.lIIlIIIlIl[0]] = lIIlIIIlIl[70];
        if (l.llllIllIIllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIIlIlIlIl = new DHelper(lIIlIIIlIl[70], lIIlIIIlIl[32], lIIlIIIlIl[71]);
            bv.add(lIIlIlIlIl);

        }
        int[] nArray25 = new int[lIIlIIIlIl[1]];
        nArray25[l.lIIlIIIlIl[0]] = lIIlIIIlIl[16];
        if (l.llllIllIIllI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIIlIlIlIl = new DHelper(lIIlIIIlIl[16], lIIlIIIlIl[32], lIIlIIIlIl[71]);
            bv.add(lIIlIlIlIl);

        }
    }

    @Override
    public String U() {
        return lIIlIIIlII[lIIlIIIlIl[72]];
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

