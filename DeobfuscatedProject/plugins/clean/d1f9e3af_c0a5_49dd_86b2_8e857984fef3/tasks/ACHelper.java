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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ZHelper;
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

public class ACHelper
implements W {
    
    static  WorldPoint by;
    static  WorldArea bw;
    public static  List<d> bv;
    public static  boolean bu;
    public static  boolean bt;
    static  WorldPoint bx;

    private static boolean llIllllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllllIIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIllllIIIl(int n2) {
        return n2 == 0;
    }

    private static void llIlllIllIl() {
        lIIIIlIlI = new String[lIIIIlIll[80]];
        ac.lIIIIlIlI[ac.lIIIIlIll[0]] = "Buying items";
        ac.lIIIIlIlI[ac.lIIIIlIll[1]] = "Finished buying items, switching back to magic training";
        ac.lIIIIlIlI[ac.lIIIIlIll[3]] = "Navigating to bank";
        ac.lIIIIlIlI[ac.lIIIIlIll[4]] = "Handling banking";
        ac.lIIIIlIlI[ac.lIIIIlIll[7]] = "We are missing supplies, switching to BUYING";
        ac.lIIIIlIlI[ac.lIIIIlIll[19]] = "Nav to cows";
        ac.lIIIIlIlI[ac.lIIIIlIll[6]] = "Attacking cows";
        ac.lIIIIlIlI[ac.lIIIIlIll[27]] = "Casting varrock tele";
        ac.lIIIIlIlI[ac.lIIIIlIll[30]] = "Casting lumby tele";
        ac.lIIIIlIlI[ac.lIIIIlIll[32]] = "Casting fally tele";
        ac.lIIIIlIlI[ac.lIIIIlIll[33]] = "Casting cammy tele";
        ac.lIIIIlIlI[ac.lIIIIlIll[34]] = "Alching";
        ac.lIIIIlIlI[ac.lIIIIlIll[37]] = "Wield";
        ac.lIIIIlIlI[ac.lIIIIlIll[39]] = "Move to alch spot";
        ac.lIIIIlIlI[ac.lIIIIlIll[41]] = "Nav to cows";
        ac.lIIIIlIlI[ac.lIIIIlIll[42]] = "Attacking cows";
        ac.lIIIIlIlI[ac.lIIIIlIll[43]] = "Eat";
        ac.lIIIIlIlI[ac.lIIIIlIll[44]] = "Cow";
        ac.lIIIIlIlI[ac.lIIIIlIll[45]] = "cow";
        ac.lIIIIlIlI[ac.lIIIIlIll[47]] = "Attack";
        ac.lIIIIlIlI[ac.lIIIIlIll[51]] = "Opening autocast";
        ac.lIIIIlIlI[ac.lIIIIlIll[52]] = "Choose spell";
        ac.lIIIIlIlI[ac.lIIIIlIll[54]] = "Wind Strike";
        ac.lIIIIlIlI[ac.lIIIIlIll[55]] = "Water Strike";
        ac.lIIIIlIlI[ac.lIIIIlIll[56]] = "Earth Strike";
        ac.lIIIIlIlI[ac.lIIIIlIll[21]] = "Earth Strike";
        ac.lIIIIlIlI[ac.lIIIIlIll[50]] = "Fire Strike";
        ac.lIIIIlIlI[ac.lIIIIlIll[73]] = "Magic training";
        ac.lIIIIlIlI[ac.lIIIIlIll[74]] = "ring of wealth (";
        ac.lIIIIlIlI[ac.lIIIIlIll[75]] = "Cow";
    }

    public static void Y() {
        if (ac.llIlllIllll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[0]];
            b.a(bv);
            if (ac.llIllllIIII(bv.size(), lIIIIlIll[1])) {
                System.out.println(lIIIIlIlI[lIIIIlIll[1]]);
                bt = lIIIIlIll[0];
            }
        }
        if (ac.llIllllIIIl(bt ? 1 : 0) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[2])) {
            BankLocation lIIlIIllIllllII;
            if (ac.llIllllIIIl(ac.ab() ? 1 : 0)) {
                lIIlIIllIllllII = BankLocation.getNearest();
                if (ac.llIllllIIlI(lIIlIIllIllllII) && ac.llIllllIIIl(lIIlIIllIllllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[3]];
                    a.a(lIIlIIllIllllII);
                }
                if (ac.llIllllIIlI(lIIlIIllIllllII) && ac.llIlllIllll(lIIlIIllIllllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[4]];
                    if (ac.llIllllIIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlIll[5]);

                        Time.sleepTicks((int)lIIIIlIll[6]);

                    }
                    if (ac.llIlllIllll(Bank.isOpen() ? 1 : 0)) {
                        if (ac.llIllllIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIlIll[7]);

                        }
                        while (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8]) && ac.llIllllIIIl(z.bi() ? 1 : 0)) {
                            z.bg();
                            Time.sleepTicks((int)lIIIIlIll[1]);

                            if (3 > 0) continue;
                            return;
                        }
                        if (ac.llIllllIIIl(ac.ACHelper() ? 1 : 0)) {
                            ac.af();
                            System.out.println(lIIIIlIlI[lIIIIlIll[7]]);
                            bt = lIIIIlIll[1];
                            return;
                        }
                        if (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
                            int[] nArray = new int[lIIIIlIll[1]];
                            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[9];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIIIlIll[1]];
                                nArray2[ac.lIIIIlIll[0]] = lIIIIlIll[9];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray2), lIIIIlIll[1])) {
                                    Bank.withdraw((int)lIIIIlIll[9], (int)lIIIIlIll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[9];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];

                                            if ((0x18 ^ 0x20 ^ (0x2C ^ 0x10)) < 0) {
                                                return ((0x29 ^ 0x76 ^ (0x26 ^ 0x18)) & (0x18 ^ 0x1C ^ (0x1E ^ 0x7B) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);

                                }
                            }
                            int[] nArray3 = new int[lIIIIlIll[1]];
                            nArray3[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIIIlIll[1]];
                                nArray4[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray4), lIIIIlIll[1])) {
                                    Bank.withdraw((int)lIIIIlIll[11], (int)lIIIIlIll[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];

                                            if (((0xD4 ^ 0x9F) & ~(0x58 ^ 0x13)) >= 1) {
                                                return (1 & ~1) != 0;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);

                                }
                            }
                            int[] nArray5 = new int[lIIIIlIll[1]];
                            nArray5[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIIlIll[1]];
                                nArray6[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray6), lIIIIlIll[1])) {
                                    Bank.withdraw((int)lIIIIlIll[13], (int)lIIIIlIll[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];

                                            if (((6 ^ 0x35) & ~(0x23 ^ 0x10)) != 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);

                                }
                            }
                            int[] nArray7 = new int[lIIIIlIll[1]];
                            nArray7[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIIlIll[1]];
                                nArray8[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray8), lIIIIlIll[1])) {
                                    Bank.withdraw((int)lIIIIlIll[14], (int)lIIIIlIll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];

                                            if (((7 ^ 0xB) & ~(0x9D ^ 0x91)) != 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);

                                }
                            }
                            int[] nArray9 = new int[lIIIIlIll[1]];
                            nArray9[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIIlIll[1]];
                                nArray10[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray10), lIIIIlIll[1])) {
                                    Bank.withdraw((int)lIIIIlIll[16], (int)lIIIIlIll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];

                                            if (-1 != -1) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);

                                }
                            }
                            int[] nArray11 = new int[lIIIIlIll[1]];
                            nArray11[ac.lIIIIlIll[0]] = lIIIIlIll[17];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIIIlIll[1]];
                                nArray12[ac.lIIIIlIll[0]] = lIIIIlIll[17];
                                if (ac.llIllllIIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIIIlIll[17], (int)lIIIIlIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIIIlIll[5]);

                                }
                            }
                            Bank.withdraw((int)lIIIIlIll[18], (int)lIIIIlIll[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIIIIlIll[1]];
                            nArray13[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIIIIlIll[1]];
                                nArray14[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                                if (ac.llIllllIIII(Inventory.getCount((int[])nArray14), lIIIIlIll[1]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21])) {
                                    Bank.withdrawAll((int)lIIIIlIll[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                                        if (ac.llIllllIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlIll[1];

                                            if (1 < 0) {
                                                return ((0xED ^ 0xC3 ^ (0x5D ^ 0x50)) & (112 + 45 - 144 + 114 ^ (0x1A ^ 0x46) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIIlIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlIll[5]);

                                }
                            }
                        }
                        if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
                            int[] nArray = new int[lIIIIlIll[1]];
                            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            if (ac.llIllllIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIIIlIll[22], (int)lIIIIlIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlIll[1]);

                            }
                            if (ac.llIlllIllll(bu ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIIIlIll[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlIll[1]);

                                Bank.withdrawAll((int)lIIIIlIll[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlIll[1]);

                            }
                            Time.sleepTicks((int)lIIIIlIll[4]);

                            Bank.withdrawAll((int)lIIIIlIll[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIIIlIll[1]);

                            Bank.withdrawAll((int)lIIIIlIll[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIIIlIll[1]);

                        }
                    }
                }
            }
            if (ac.llIlllIllll(ac.ab() ? 1 : 0)) {
                if (ac.llIlllIllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21])) {
                    if (ac.llIllllIIIl(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[19]];
                        Movement.walkTo((WorldPoint)bx);

                        Time.sleepTicks((int)lIIIIlIll[1]);

                    }
                    if (ac.llIlllIllll(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[6]];
                        ac.aa();
                    }
                }
                if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[26])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[27]];
                    if (ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIIIIlIll[1]);

                    }
                }
                if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[26]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[29])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[30]];
                    if (ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIIIlIll[1]);

                    }
                }
                if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[29]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[31])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[32]];
                    if (ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIIIlIll[1]);

                    }
                }
                if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[31]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[33]];
                    if (ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIIIlIll[1]);

                    }
                }
                if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
                    int lIIlIIllIlllIlI;
                    AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[34]];
                    if (ac.llIllllIllI(by)) {
                        by = new WorldPoint(lIIIIlIll[35] + e.c(lIIIIlIll[1], lIIIIlIll[7]), lIIIIlIll[36], lIIIIlIll[0]);
                    }
                    int[] nArray = new int[lIIIIlIll[1]];
                    nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                    if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIIIIlIll[1]];
                        nArray15[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                        if (ac.llIllllIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIIIIlIll[1]];
                            nArray16[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            Inventory.getFirst((int[])nArray16).interact(lIIIIlIlI[lIIIIlIll[37]]);
                            Time.sleepTicks((int)lIIIIlIll[1]);

                        }
                    }
                    if (ac.llIlllIllll(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIIIIlIll[1]];
                    nArray17[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                    lIIlIIllIllllII = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIIIIlIll[1]];
                    nArray18[ac.lIIIIlIll[0]] = lIIIIlIll[38];
                    Item lIIlIIllIlllIll = Inventory.getFirst((int[])nArray18);
                    if (ac.llIllllIIIl(bu ? 1 : 0) && ac.llIllllIIlI(by)) {
                        if (ac.llIllllIIIl(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[39]];
                            Movement.walkTo((WorldPoint)by);

                            Time.sleepTicks((int)lIIIIlIll[1]);

                        }
                        if (ac.llIlllIllll(Players.getLocal().getWorldLocation().equals((Object)by) ? 1 : 0) && ac.llIllllIIlI(lIIlIIllIllllII) && ac.llIllllIIlI(lIIlIIllIlllIll) && ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                            lIIlIIllIlllIlI = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIlIIllIlllIll);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ac.llIlllllIlI(Skills.getExperience((Skill)Skill.MAGIC), lIIlIIllIlllIlI)) {
                                    bl = lIIIIlIll[1];

                                } else {
                                    bl = lIIIIlIll[0];
                                }
                                return bl;
                            }, (int)lIIIIlIll[10]);

                        }
                    }
                    if (ac.llIlllIllll(bu ? 1 : 0)) {
                        if (ac.llIllllIIlI(lIIlIIllIllllII) && ac.llIllllIIlI(lIIlIIllIlllIll) && ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                            lIIlIIllIlllIlI = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIIlIIllIlllIll);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ac.llIlllllIlI(Skills.getExperience((Skill)Skill.MAGIC), lIIlIIllIlllIlI)) {
                                    bl = lIIIIlIll[1];

                                    if (((0x55 ^ 0x64) & ~(0x46 ^ 0x77)) >= 1) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIIIlIll[0];
                                }
                                return bl;
                            }, (int)lIIIIlIll[10]);

                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (ac.llIllllIlIl(Players.getLocal().getAnimation(), lIIIIlIll[28])) {
                                bl = lIIIIlIll[1];

                                if (-1 > 2) {
                                    return ((0xB0 ^ 0xA6 ^ (4 ^ 0x5C)) & (0x33 ^ 0x5D ^ (0x60 ^ 0x40) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIIlIll[0];
                            }
                            return bl;
                        }, (int)lIIIIlIll[40]);

                    }
                }
            }
        }
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
                                                    if (!ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21])) break block19;
                                                    int[] nArray = new int[lIIIIlIll[1]];
                                                    nArray[ac.lIIIIlIll[0]] = lIIIIlIll[9];
                                                    if (!ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIIlIll[1]];
                                                    nArray2[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                                    if (!ac.llIlllIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIIlIll[1]];
                                                    nArray3[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                                    if (!ac.llIlllIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIIlIll[1]];
                                                    nArray4[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                                    if (!ac.llIlllIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIIlIll[1]];
                                                    nArray5[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                                                    if (!ac.llIlllIllll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIIlIll[1]];
                                                    nArray6[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                                    if (!ac.llIllllIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIIlIll[1]];
                                                    nArray7[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                                    if (!ac.llIlllIllll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIIlIll[1];

                                                if (((45 + 98 - 104 + 90 ^ 29 + 32 - -83 + 9) & (0x10 ^ 7 ^ (0x8C ^ 0x83) ^ -1)) == ((0x3E ^ 0x37 ^ (0xF1 ^ 0xBD)) & (0x50 ^ 0x26 ^ (0xA1 ^ 0x92) ^ -1))) return n5 != 0;
                                                return ((86 + 94 - 41 + 113 ^ 88 + 50 - -13 + 28) & (0x6B ^ 0x2A ^ (0x44 ^ 0x4A) ^ -1)) != 0;
                                            }
                                            n5 = lIIIIlIll[0];
                                            return n5 != 0;
                                        }
                                        if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21]) || !ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) break block22;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                        if (!ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIIlIll[1]];
                                        nArray8[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                        if (!ac.llIlllIllll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIIlIll[1]];
                                        nArray9[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                        if (!ac.llIlllIllll(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIIlIll[1]];
                                        nArray10[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                                        if (!ac.llIlllIllll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIIlIll[1]];
                                        nArray11[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                        if (!ac.llIllllIIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIIlIll[1]];
                                        nArray12[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                        if (!ac.llIlllIllll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIIlIll[1];

                                    if (3 != 0) return n4 != 0;
                                    return false;
                                }
                                n4 = lIIIIlIll[0];
                                return n4 != 0;
                            }
                            if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8]) || !ac.llIllllIIIl(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIIlIll[1]];
                            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            if (!ac.llIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIIlIll[1]];
                            nArray13[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            if (!ac.llIlllIllll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIIlIll[1]];
                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                        if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIIlIll[1]];
                            nArray14[ac.lIIIIlIll[0]] = lIIIIlIll[38];
                            if (ac.llIlllIllll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIIlIll[1];

                                if (-1 == -1) return n3 != 0;
                                return ((0xC5 ^ 0x80 ^ (0x3E ^ 0x29)) & (0x47 ^ 0x3D ^ (0xAB ^ 0x83) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIIIIlIll[0];
                    return n3 != 0;
                }
                if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8]) || !ac.llIlllIllll(bu ? 1 : 0)) return lIIIIlIll[0];
                int[] nArray = new int[lIIIIlIll[1]];
                nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                if (!ac.llIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIIlIll[1]];
                nArray15[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                if (!ac.llIlllIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[16];
            if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlIll[1]];
                nArray16[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                if (ac.llIlllIllll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlIll[1]];
                    nArray17[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                    if (ac.llIllllIlII(Inventory.getFirst((int[])nArray17).getQuantity(), lIIIIlIll[19])) {
                        int[] nArray18 = new int[lIIIIlIll[1]];
                        nArray18[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                        if (ac.llIlllIllll(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIIlIll[1]];
                            nArray19[ac.lIIIIlIll[0]] = lIIIIlIll[38];
                            if (ac.llIlllIllll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIIlIll[1];

                                if (null == null) return n2 != 0;
                                return ((0x1D ^ 0x3D ^ (0x32 ^ 0xE)) & (0x3E ^ 8 ^ (0x99 ^ 0xB3) ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIIlIll[0];
        return n2 != 0;
    }

    private static boolean llIlllllIII(int n2) {
        return n2 < 0;
    }

    private static int llIllllIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static boolean ad() {
        if (ac.llIllllIlIl(Vars.getBit((int)lIIIIlIll[48]), lIIIIlIll[1]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[19])) {
            return lIIIIlIll[1];
        }
        if (ac.llIllllIlIl(Vars.getBit((int)lIIIIlIll[48]), lIIIIlIll[3]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32]) && ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[19])) {
            return lIIIIlIll[1];
        }
        if (ac.llIllllIlIl(Vars.getBit((int)lIIIIlIll[48]), lIIIIlIll[4]) && ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[39])) {
            return lIIIIlIll[1];
        }
        if (ac.llIllllIlIl(Vars.getBit((int)lIIIIlIll[48]), lIIIIlIll[4]) && ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32])) {
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[14];
            if (ac.llIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIIlIll[1];
            }
        }
        if (ac.llIllllIlIl(Vars.getBit((int)lIIIIlIll[48]), lIIIIlIll[7]) && ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[39])) {
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[14];
            if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIIlIll[1];
            }
        }
        return lIIIIlIll[0];
    }

    private static void af() {
        d lIIlIIllIllIIlI;
        Object lIIlIIllIllIIll;
        if (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[16];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(lIIIIlIll[16], lIIIIlIll[57], lIIIIlIll[58]);
                bv.add(d2);

            }
            int[] nArray2 = new int[lIIIIlIll[1]];
            nArray2[ac.lIIIIlIll[0]] = lIIIIlIll[9];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIIlIIllIllIIll = new DHelper(lIIIIlIll[9], lIIIIlIll[59], lIIIIlIll[6]);
                bv.add((DHelper) IIlIIllIllIIll);

            }
            int[] nArray3 = new int[lIIIIlIll[1]];
            nArray3[ac.lIIIIlIll[0]] = lIIIIlIll[11];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIIlIIllIllIIll = new DHelper(lIIIIlIll[11], lIIIIlIll[60], lIIIIlIll[6]);
                bv.add((DHelper) IIlIIllIllIIll);

            }
            int[] nArray4 = new int[lIIIIlIll[1]];
            nArray4[ac.lIIIIlIll[0]] = lIIIIlIll[13];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIIlIIllIllIIll = new DHelper(lIIIIlIll[13], lIIIIlIll[61], lIIIIlIll[6]);
                bv.add((DHelper) IIlIIllIllIIll);

            }
            int[] nArray5 = new int[lIIIIlIll[1]];
            nArray5[ac.lIIIIlIll[0]] = lIIIIlIll[14];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIIlIIllIllIIll = new DHelper(lIIIIlIll[14], lIIIIlIll[5], lIIIIlIll[6]);
                bv.add((DHelper) IIlIIllIllIIll);

            }
            int[] nArray6 = new int[lIIIIlIll[1]];
            nArray6[ac.lIIIIlIll[0]] = lIIIIlIll[46];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIIlIIllIllIIll = new DHelper(lIIIIlIll[46], lIIIIlIll[1], e.c(lIIIIlIll[62], lIIIIlIll[63]));
                bv.add((DHelper) IIlIIllIllIIll);

            }
        }
        if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) {
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[24];
            if (ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIIIIlIll[1]];
                nArray7[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                if (ac.llIllllIIII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIlIll[61])) {
                    int[] nArray8 = new int[lIIIIlIll[1]];
                    nArray8[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                    lIIlIIllIllIIll = new DHelper(lIIIIlIll[24], lIIIIlIll[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIIIIlIll[64]);
                    bv.add((DHelper) IIlIIllIllIIll);

                }
            }
            int[] nArray9 = new int[lIIIIlIll[1]];
            nArray9[ac.lIIIIlIll[0]] = lIIIIlIll[24];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIIlIIllIllIIll = new DHelper(lIIIIlIll[24], lIIIIlIll[61], lIIIIlIll[64]);
                bv.add((DHelper) IIlIIllIllIIll);

            }
            int[] nArray10 = new int[lIIIIlIll[1]];
            nArray10[ac.lIIIIlIll[0]] = lIIIIlIll[25];
            if (ac.llIlllIllll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIIIlIll[1]];
                nArray11[ac.lIIIIlIll[0]] = lIIIIlIll[25];
                if (ac.llIllllIIII(Bank.getFirst((int[])nArray11).getQuantity(), lIIIIlIll[61])) {
                    int[] nArray12 = new int[lIIIIlIll[1]];
                    nArray12[ac.lIIIIlIll[0]] = lIIIIlIll[25];
                    lIIlIIllIllIIll = new DHelper(lIIIIlIll[25], lIIIIlIll[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIIIIlIll[65]);
                    bv.add((DHelper) IIlIIllIllIIll);

                }
            }
            int[] nArray13 = new int[lIIIIlIll[1]];
            nArray13[ac.lIIIIlIll[0]] = lIIIIlIll[25];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIIlIIllIllIIll = new DHelper(lIIIIlIll[25], lIIIIlIll[61], lIIIIlIll[65]);
                bv.add((DHelper) IIlIIllIllIIll);

            }
            int[] nArray14 = new int[lIIIIlIll[1]];
            nArray14[ac.lIIIIlIll[0]] = lIIIIlIll[22];
            if (ac.llIllllIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIIIlIll[1]];
                nArray15[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                if (ac.llIllllIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIIlIIllIllIIll = new DHelper(lIIIIlIll[22], lIIIIlIll[1], lIIIIlIll[66]);
                    bv.add((DHelper) IIlIIllIllIIll);

                }
            }
            if (ac.llIlllIllll(bu ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlIll[1]];
                nArray16[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                if (ac.llIlllIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlIll[1]];
                    nArray17[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                    if (ac.llIllllIIII(Bank.getFirst((int[])nArray17).getQuantity(), lIIIIlIll[61])) {
                        int[] nArray18 = new int[lIIIIlIll[1]];
                        nArray18[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                        lIIlIIllIllIIll = new DHelper(lIIIIlIll[16], lIIIIlIll[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIIIIlIll[58]);
                        bv.add((DHelper) IIlIIllIllIIll);

                    }
                }
                int[] nArray19 = new int[lIIIIlIll[1]];
                nArray19[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                if (ac.llIllllIIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIIlIIllIllIIll = new DHelper(lIIIIlIll[16], lIIIIlIll[61], lIIIIlIll[58]);
                    bv.add((DHelper) IIlIIllIllIIll);

                }
                int[] nArray20 = new int[lIIIIlIll[1]];
                nArray20[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                if (ac.llIlllIllll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIIIlIll[1]];
                    nArray21[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                    if (ac.llIllllIIII(Bank.getFirst((int[])nArray21).getQuantity(), lIIIIlIll[66])) {
                        int[] nArray22 = new int[lIIIIlIll[1]];
                        nArray22[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                        lIIlIIllIllIIll = new DHelper(lIIIIlIll[23], lIIIIlIll[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIIIIlIll[6]);
                        bv.add((DHelper) IIlIIllIllIIll);

                    }
                }
                int[] nArray23 = new int[lIIIIlIll[1]];
                nArray23[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                if (ac.llIllllIIIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIIlIIllIllIIll = new DHelper(lIIIIlIll[23], lIIIIlIll[66], lIIIIlIll[6]);
                    bv.add((DHelper) IIlIIllIllIIll);

                }
            }
        }
        int[] nArray = new int[lIIIIlIll[1]];
        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[20];
        if (ac.llIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIlIIllIllIIll = new DHelper(lIIIIlIll[20], lIIIIlIll[67], lIIIIlIll[68]);
            bv.add((DHelper) IIlIIllIllIIll);

        }
        if (ac.llIllllIIIl(Bank.contains(lIIlIIllIllIIll = item -> item.getName().toLowerCase().contains(lIIIIlIlI[lIIIIlIll[74]])) ? 1 : 0)) {
            lIIlIIllIllIIlI = new DHelper(lIIIIlIll[69], lIIIIlIll[19], lIIIIlIll[70]);
            bv.add(lIIlIIllIllIIlI);

        }
        int[] nArray24 = new int[lIIIIlIll[1]];
        nArray24[ac.lIIIIlIll[0]] = lIIIIlIll[71];
        if (ac.llIllllIIIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIIlIIllIllIIlI = new DHelper(lIIIIlIll[71], lIIIIlIll[33], lIIIIlIll[72]);
            bv.add(lIIlIIllIllIIlI);

        }
        int[] nArray25 = new int[lIIIIlIll[1]];
        nArray25[ac.lIIIIlIll[0]] = lIIIIlIll[18];
        if (ac.llIllllIIIl(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIIlIIllIllIIlI = new DHelper(lIIIIlIll[18], lIIIIlIll[33], lIIIIlIll[72]);
            bv.add(lIIlIIllIllIIlI);

        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[2])) {
            bl = lIIIIlIll[1];

            if (-1 >= 1) {
                return ((0xB9 ^ 0x89 ^ (0x6A ^ 0x41)) & (0x38 ^ 0x11 ^ (0xF2 ^ 0xC0) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIlIll[0];
        }
        return bl;
    }

        return String.valueOf(lIIlIIllIIIIIIl);
    }

    private static boolean llIlllIllll(int n2) {
        return n2 != 0;
    }

    public static void Z() {
        if (ac.llIlllIllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ac.llIllllIIIl(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[41]];
            Movement.walkTo((WorldPoint)bx);

            Time.sleepTicks((int)lIIIIlIll[1]);

        }
        if (ac.llIlllIllll(bw.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[42]];
            ac.aa();
        }
    }

    private static void aa() {
        if (ac.llIlllllIII(ac.llIllllIlll(e.u(), 30.0))) {
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[20];
            if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIIlIll[1]];
                nArray2[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                Inventory.getFirst((int[])nArray2).interact(lIIIIlIlI[lIIIIlIll[43]]);
                Time.sleepTicks((int)lIIIIlIll[1]);

            }
        }
        if (ac.llIllllIllI(Players.getLocal().getInteracting())) {
            NPC lIIlIIllIllIlll = NPCs.getNearest(nPC -> {
                int n2;
                if (ac.llIlllIllll(nPC.getName().contains(lIIIIlIlI[lIIIIlIll[75]]) ? 1 : 0) && ac.llIllllIIIl(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIIIlIll[1];

                    if ((14 + 40 - -62 + 50 ^ 44 + 87 - 18 + 49) == 0) {
                        return false;
                    }
                } else {
                    n2 = lIIIIlIll[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIIIIlIll[3]];
            stringArray[ac.lIIIIlIll[0]] = lIIIIlIlI[lIIIIlIll[44]];
            stringArray[ac.lIIIIlIll[1]] = lIIIIlIlI[lIIIIlIll[45]];
            List lIIlIIllIllIllI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (ac.llIlllllIIl(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIIIIlIll[1];

                    if (-1 >= (0xC0 ^ 0xC4)) {
                        return false;
                    }
                } else {
                    bl = lIIIIlIll[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[46];
            if (ac.llIlllIllll(Equipment.contains((int[])nArray) ? 1 : 0) && ac.llIllllIIIl(ac.ad() ? 1 : 0)) {
                ac.ae();
            }
            if (ac.llIllllIIlI(lIIlIIllIllIlll) && ac.llIllllIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                lIIlIIllIllIlll.interact(lIIIIlIlI[lIIIIlIll[47]]);
                Time.sleepTicks((int)lIIIIlIll[4]);

            }
        }
    }

    private static boolean llIllllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllllIIlI(Object object) {
        return object != null;
    }

    static {
        ac.llIlllIlllI();
        ac.llIlllIllIl();
        bu = lIIIIlIll[0];
        bv = new ArrayList<d>();
        bw = new WorldArea(lIIIIlIll[76], lIIIIlIll[77], lIIIIlIll[51], lIIIIlIll[41], lIIIIlIll[0]);
        bx = new WorldPoint(lIIIIlIll[78], lIIIIlIll[79], lIIIIlIll[0]);
        by = null;
    }

    public static void ae() {
        if (ac.llIllllIIlI(Widgets.get((int)lIIIIlIll[49], (int)lIIIIlIll[50]))) {
            AccBuilderEasyClues.c = lIIIIlIlI[lIIIIlIll[51]];
            Widgets.get((int)lIIIIlIll[49], (int)lIIIIlIll[50]).interact(lIIIIlIlI[lIIIIlIll[52]]);
            Time.sleepTicks((int)lIIIIlIll[7]);

        }
        if (ac.llIllllIllI(Widgets.get((int)lIIIIlIll[49], (int)lIIIIlIll[50])) && ac.llIllllIIIl(Widgets.get((int)lIIIIlIll[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIIIlIll[1]);

            if (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[19])) {
                Widgets.get((int)lIIIIlIll[53], (int)lIIIIlIll[1]).getChild(lIIIIlIll[1]).interact(lIIIIlIlI[lIIIIlIll[54]]);
            }
            if (ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32]) && ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[19])) {
                Widgets.get((int)lIIIIlIll[53], (int)lIIIIlIll[1]).getChild(lIIIIlIll[3]).interact(lIIIIlIlI[lIIIIlIll[55]]);
            }
            if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32]) && ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[39])) {
                Widgets.get((int)lIIIIlIll[53], (int)lIIIIlIll[1]).getChild(lIIIIlIll[4]).interact(lIIIIlIlI[lIIIIlIll[56]]);
            }
            if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[32])) {
                int[] nArray = new int[lIIIIlIll[1]];
                nArray[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                if (ac.llIllllIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIIlIll[53], (int)lIIIIlIll[1]).getChild(lIIIIlIll[4]).interact(lIIIIlIlI[lIIIIlIll[21]]);
                }
            }
            if (ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[39])) {
                int[] nArray = new int[lIIIIlIll[1]];
                nArray[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                if (ac.llIlllIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIIlIll[53], (int)lIIIIlIll[1]).getChild(lIIIIlIll[7]).interact(lIIIIlIlI[lIIIIlIll[50]]);
                }
            }
            Time.sleepTicks((int)lIIIIlIll[1]);

        }
    }

    @Override
    public int T() {
        try {
            ac.Y();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x50 ^ 7 ^ (0x1D ^ 0x15)) & (0xEE ^ 0xB6 ^ (0x57 ^ 0x50) ^ -1)) >= 3) {
            return (173 + 230 - 356 + 188 ^ 17 + 67 - -24 + 29) & (0x2C ^ 0x27 ^ (0xFC ^ 0x95) ^ -1);
        }
        return lIIIIlIll[67];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ACHelper() {
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
                                                    if (!ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21])) break block19;
                                                    int[] nArray = new int[lIIIIlIll[1]];
                                                    nArray[ac.lIIIIlIll[0]] = lIIIIlIll[9];
                                                    if (!ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIIlIll[1]];
                                                    nArray2[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                                    if (!ac.llIlllIllll(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIIlIll[1]];
                                                    nArray3[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                                    if (!ac.llIlllIllll(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIIlIll[1]];
                                                    nArray4[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                                    if (!ac.llIlllIllll(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIIlIll[1]];
                                                    nArray5[ac.lIIIIlIll[0]] = lIIIIlIll[20];
                                                    if (!ac.llIlllIllll(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIIlIll[1]];
                                                    nArray6[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                                    if (!ac.llIllllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIIlIll[1]];
                                                    nArray7[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                                    if (!ac.llIlllIllll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIIlIll[1];

                                                if (((0x4A ^ 0x70 ^ (0xCC ^ 0xBF)) & (0x79 ^ 0x31 ^ 1 ^ -1)) == 0) return n5 != 0;
                                                return ((83 + 165 - 64 + 4 ^ 27 + 85 - 73 + 121) & (0xE8 ^ 0x86 ^ (0x2C ^ 0x5E) ^ -1)) != 0;
                                            }
                                            n5 = lIIIIlIll[0];
                                            return n5 != 0;
                                        }
                                        if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[21]) || !ac.llIllllIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8])) break block22;
                                        int[] nArray = new int[lIIIIlIll[1]];
                                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[13];
                                        if (!ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIIlIll[1]];
                                        nArray8[ac.lIIIIlIll[0]] = lIIIIlIll[11];
                                        if (!ac.llIlllIllll(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIIlIll[1]];
                                        nArray9[ac.lIIIIlIll[0]] = lIIIIlIll[14];
                                        if (!ac.llIlllIllll(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIIlIll[1]];
                                        nArray10[ac.lIIIIlIll[0]] = lIIIIlIll[16];
                                        if (!ac.llIlllIllll(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIIlIll[1]];
                                        nArray11[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                        if (!ac.llIllllIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIIlIll[1]];
                                        nArray12[ac.lIIIIlIll[0]] = lIIIIlIll[46];
                                        if (!ac.llIlllIllll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIIlIll[1];

                                    if (2 >= 0) return n4 != 0;
                                    return false;
                                }
                                n4 = lIIIIlIll[0];
                                return n4 != 0;
                            }
                            if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8]) || !ac.llIllllIIIl(bu ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIIlIll[1]];
                            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            if (!ac.llIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIIlIll[1]];
                            nArray13[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                            if (!ac.llIlllIllll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIIlIll[1]];
                        nArray[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                        if (ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIIlIll[1]];
                            nArray14[ac.lIIIIlIll[0]] = lIIIIlIll[25];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIIlIll[1];

                                if (-2 < 0) return n3 != 0;
                                return ((0x7E ^ 0x70 ^ (3 ^ 0x56)) & (172 + 104 - 145 + 99 ^ 114 + 175 - 220 + 120 ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIIIIlIll[0];
                    return n3 != 0;
                }
                if (!ac.llIllllIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlIll[8]) || !ac.llIlllIllll(bu ? 1 : 0)) return lIIIIlIll[0];
                int[] nArray = new int[lIIIIlIll[1]];
                nArray[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                if (!ac.llIllllIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIIlIll[1]];
                nArray15[ac.lIIIIlIll[0]] = lIIIIlIll[22];
                if (!ac.llIlllIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIIlIll[1]];
            nArray[ac.lIIIIlIll[0]] = lIIIIlIll[16];
            if (ac.llIlllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlIll[1]];
                nArray16[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                if (ac.llIlllIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlIll[1]];
                    nArray17[ac.lIIIIlIll[0]] = lIIIIlIll[23];
                    if (ac.llIllllIlII(Bank.getFirst((int[])nArray17).getQuantity(), lIIIIlIll[19])) {
                        int[] nArray18 = new int[lIIIIlIll[1]];
                        nArray18[ac.lIIIIlIll[0]] = lIIIIlIll[24];
                        if (ac.llIlllIllll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIIlIll[1]];
                            nArray19[ac.lIIIIlIll[0]] = lIIIIlIll[25];
                            if (ac.llIlllIllll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIIlIll[1];

                                if (3 != (0x81 ^ 0x85)) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIIlIll[0];
        return n2 != 0;
    }

    private static boolean llIllllIllI(Object object) {
        return object == null;
    }

    @Override
    public boolean S() {
        return lIIIIlIll[0];
    }

    private static boolean llIllllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlllllIIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String U() {
        return lIIIIlIlI[lIIIIlIll[73]];
    }
}

