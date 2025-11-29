/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 */
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.KHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.LHelper;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;

public class MHelper
implements W {
    public static  List<d> bv;

    public static  boolean bt;

    private static boolean lIIlllIllIII(Object object) {
        return object != null;
    }

    private static boolean lIIlllIlIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7])) {
            bl = lIlllIlll[1];

            }
        } else {
            bl = lIlllIlll[0];
        }
        return bl;
    }

    @Override
    public boolean S() {
        return lIlllIlll[0];
    }

    public static void ap() {
        if (m.lIIlllIlIlIl(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIllI[lIlllIlll[0]];
            b.a(bv);
            if (m.lIIlllIlIllI(bv.size(), lIlllIlll[1])) {
                System.out.println(lIlllIllI[lIlllIlll[1]]);
                bt = lIlllIlll[0];
            }
        }
        if (m.lIIlllIlIlll(bt ? 1 : 0)) {
            BankLocation llIIIllllIlIlI;
            if (m.lIIlllIlIlll(m.ab() ? 1 : 0)) {
                llIIIllllIlIlI = BankLocation.getNearest();
                if (m.lIIlllIllIII(llIIIllllIlIlI) && m.lIIlllIlIlll(llIIIllllIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIllI[lIlllIlll[2]];
                    a.a(llIIIllllIlIlI);
                }
                if (m.lIIlllIllIII(llIIIllllIlIlI) && m.lIIlllIlIlIl(llIIIllllIlIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIllI[lIlllIlll[3]];
                    if (m.lIIlllIlIlll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIlll[4]);

                        Time.sleepTicks((int)lIlllIlll[3]);

                    }
                    if (m.lIIlllIlIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (m.lIIlllIllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlllIlll[5]);

                        }
                        if (m.lIIlllIllIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIlllIlll[2]);

                        }
                        if (m.lIIlllIlIlll(m.ac() ? 1 : 0)) {
                            m.af();
                            System.out.println(lIlllIllI[lIlllIlll[6]]);
                            bt = lIlllIlll[1];
                            return;
                        }
                        if (m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7])) {
                            a.a(lIlllIlll[8], lIlllIlll[1]);
                            a.a(lIlllIlll[9], lIlllIlll[1]);
                            a.a(lIlllIlll[10], lIlllIlll[1]);
                            Bank.withdrawAll((int)lIlllIlll[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                        if (m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7])) {
                            a.a(lIlllIlll[12], lIlllIlll[1]);
                            a.a(lIlllIlll[13], lIlllIlll[1]);
                            a.a(lIlllIlll[14], lIlllIlll[1]);
                            Bank.withdrawAll((int)lIlllIlll[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIlllIlll[1]);

                            Bank.withdrawAll((int)lIlllIlll[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIlllIlll[1]);

                            a.a(lIlllIlll[17], lIlllIlll[1]);
                        }
                        a.a(lIlllIlll[18], lIlllIlll[1]);
                        a.a(lIlllIlll[19], lIlllIlll[1]);
                        a.a(lIlllIlll[20], lIlllIlll[1]);
                        a.a(lIlllIlll[21], lIlllIlll[1]);
                        a.a(lIlllIlll[22], lIlllIlll[1]);
                        a.a(lIlllIlll[23], lIlllIlll[24]);
                        a.a(lIlllIlll[25], lIlllIlll[24]);
                        a.a(lIlllIlll[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (m.lIIlllIlIlIl(m.ab() ? 1 : 0)) {
                m.aq();
                if (m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[27])) {
                    l.Z();
                }
                if (m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[27])) {
                    llIIIllllIlIlI = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (m.lIIlllIlllII(tileItem.getId(), lIlllIlll[16]) && m.lIIlllIllIlI(tileItem.getQuantity(), lIlllIlll[42])) {
                            n2 = lIlllIlll[1];

                            if (2 <= 0) {
                                return false;
                            }
                        } else {
                            n2 = lIlllIlll[0];
                        }
                        return n2 != 0;
                    });
                    if (m.lIIlllIllIII(llIIIllllIlIlI)) {
                        llIIIllllIlIlI.interact(lIlllIllI[lIlllIlll[5]]);
                        Time.sleepTicks((int)lIlllIlll[6]);

                    }
                    k.X();
                }
            }
        }
    }

        return String.valueOf(llIIIlllIIlIII);
    }

    private static boolean lIIlllIlIlIl(int n2) {
        return n2 != 0;
    }

    private static void lIIlllIlIIll() {
        lIlllIllI = new String[lIlllIlll[62]];
        m.lIlllIllI[m.lIlllIlll[0]] = "Buying items";
        m.lIlllIllI[m.lIlllIlll[1]] = "Finished buying items, switching back to magic training";
        m.lIlllIllI[m.lIlllIlll[2]] = "Navigating to bank";
        m.lIlllIllI[m.lIlllIlll[3]] = "Handling banking";
        m.lIlllIllI[m.lIlllIlll[6]] = "We are missing supplies, switching to BUYING";
        m.lIlllIllI[m.lIlllIlll[5]] = "Take";
        m.lIlllIllI[m.lIlllIlll[30]] = "Wield";
        m.lIlllIllI[m.lIlllIlll[32]] = "Wear";
        m.lIlllIllI[m.lIlllIlll[33]] = "Wield";
        m.lIlllIllI[m.lIlllIlll[35]] = "Wield";
        m.lIlllIllI[m.lIlllIlll[24]] = "Wield";
        m.lIlllIllI[m.lIlllIlll[37]] = "Wear";
        m.lIlllIllI[m.lIlllIlll[38]] = ":{uD(";
        m.lIlllIllI[m.lIlllIlll[39]] = "Wear";
        m.lIlllIllI[m.lIlllIlll[40]] = "Wear";
        m.lIlllIllI[m.lIlllIlll[42]] = "Wear";
        m.lIlllIllI[m.lIlllIlll[43]] = "Wear";
        m.lIlllIllI[m.lIlllIlll[44]] = "Wear";
        m.lIlllIllI[m.lIlllIlll[45]] = "Wield";
        m.lIlllIllI[m.lIlllIlll[60]] = "Range training";
        m.lIlllIllI[m.lIlllIlll[31]] = "ring of wealth (";
        m.lIlllIllI[m.lIlllIlll[61]] = "bow";
    }

    static {
        m.lIIlllIlIlII();
        m.lIIlllIlIIll();
        bv = new ArrayList<d>();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        block40: {
            block48: {
                block47: {
                    block46: {
                        block45: {
                            block44: {
                                block43: {
                                    block42: {
                                        block41: {
                                            block39: {
                                                block32: {
                                                    int n3;
                                                    block34: {
                                                        block38: {
                                                            block37: {
                                                                block36: {
                                                                    block35: {
                                                                        block33: {
                                                                            block24: {
                                                                                int n4;
                                                                                block26: {
                                                                                    block31: {
                                                                                        block30: {
                                                                                            block29: {
                                                                                                block28: {
                                                                                                    block27: {
                                                                                                        block25: {
                                                                                                            block16: {
                                                                                                                int n5;
                                                                                                                block18: {
                                                                                                                    block23: {
                                                                                                                        block22: {
                                                                                                                            block21: {
                                                                                                                                block20: {
                                                                                                                                    block19: {
                                                                                                                                        block17: {
                                                                                                                                            if (!m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7]) || !m.lIIlllIlllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlllIlll[41]) || !m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIlllIlll[36])) break block16;
                                                                                                                                            int[] nArray = new int[lIlllIlll[1]];
                                                                                                                                            nArray[m.lIlllIlll[0]] = lIlllIlll[9];
                                                                                                                                            if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                                                            int[] nArray2 = new int[lIlllIlll[1]];
                                                                                                                                            nArray2[m.lIlllIlll[0]] = lIlllIlll[9];
                                                                                                                                            if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[lIlllIlll[1]];
                                                                                                                                        nArray[m.lIlllIlll[0]] = lIlllIlll[10];
                                                                                                                                        if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                                                        int[] nArray3 = new int[lIlllIlll[1]];
                                                                                                                                        nArray3[m.lIlllIlll[0]] = lIlllIlll[10];
                                                                                                                                        if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                                                                                                    }
                                                                                                                                    int[] nArray = new int[lIlllIlll[1]];
                                                                                                                                    nArray[m.lIlllIlll[0]] = lIlllIlll[18];
                                                                                                                                    if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                                                                    int[] nArray4 = new int[lIlllIlll[1]];
                                                                                                                                    nArray4[m.lIlllIlll[0]] = lIlllIlll[18];
                                                                                                                                    if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block18;
                                                                                                                                }
                                                                                                                                int[] nArray = new int[lIlllIlll[1]];
                                                                                                                                nArray[m.lIlllIlll[0]] = lIlllIlll[20];
                                                                                                                                if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                                                                int[] nArray5 = new int[lIlllIlll[1]];
                                                                                                                                nArray5[m.lIlllIlll[0]] = lIlllIlll[20];
                                                                                                                                if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray5) ? 1 : 0)) break block18;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[lIlllIlll[1]];
                                                                                                                            nArray[m.lIlllIlll[0]] = lIlllIlll[11];
                                                                                                                            if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                                                                            int[] nArray6 = new int[lIlllIlll[1]];
                                                                                                                            nArray6[m.lIlllIlll[0]] = lIlllIlll[11];
                                                                                                                            if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray6) ? 1 : 0)) break block18;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[lIlllIlll[1]];
                                                                                                                        nArray[m.lIlllIlll[0]] = lIlllIlll[8];
                                                                                                                        if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                                                                        int[] nArray7 = new int[lIlllIlll[1]];
                                                                                                                        nArray7[m.lIlllIlll[0]] = lIlllIlll[8];
                                                                                                                        if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block18;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[lIlllIlll[1]];
                                                                                                                    nArray[m.lIlllIlll[0]] = lIlllIlll[26];
                                                                                                                    if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                        n5 = lIlllIlll[1];

                                                                                                                        if (3 >= 0) return n5 != 0;
                                                                                                                        return ((2 ^ (0x24 ^ 0x3A)) & (0x2D ^ 0xC ^ (4 ^ 0x39) ^ -1)) != 0;
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = lIlllIlll[0];
                                                                                                                return n5 != 0;
                                                                                                            }
                                                                                                            if (!m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7]) || !m.lIIlllIlllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlllIlll[41]) || !m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.DEFENCE), lIlllIlll[36])) break block24;
                                                                                                            int[] nArray = new int[lIlllIlll[1]];
                                                                                                            nArray[m.lIlllIlll[0]] = lIlllIlll[9];
                                                                                                            if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                                                            int[] nArray8 = new int[lIlllIlll[1]];
                                                                                                            nArray8[m.lIlllIlll[0]] = lIlllIlll[9];
                                                                                                            if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray8) ? 1 : 0)) break block26;
                                                                                                        }
                                                                                                        int[] nArray = new int[lIlllIlll[1]];
                                                                                                        nArray[m.lIlllIlll[0]] = lIlllIlll[19];
                                                                                                        if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                                        int[] nArray9 = new int[lIlllIlll[1]];
                                                                                                        nArray9[m.lIlllIlll[0]] = lIlllIlll[19];
                                                                                                        if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray9) ? 1 : 0)) break block26;
                                                                                                    }
                                                                                                    int[] nArray = new int[lIlllIlll[1]];
                                                                                                    nArray[m.lIlllIlll[0]] = lIlllIlll[18];
                                                                                                    if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                                                                                                    int[] nArray10 = new int[lIlllIlll[1]];
                                                                                                    nArray10[m.lIlllIlll[0]] = lIlllIlll[18];
                                                                                                    if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray10) ? 1 : 0)) break block26;
                                                                                                }
                                                                                                int[] nArray = new int[lIlllIlll[1]];
                                                                                                nArray[m.lIlllIlll[0]] = lIlllIlll[20];
                                                                                                if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                                                                                                int[] nArray11 = new int[lIlllIlll[1]];
                                                                                                nArray11[m.lIlllIlll[0]] = lIlllIlll[20];
                                                                                                if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray11) ? 1 : 0)) break block26;
                                                                                            }
                                                                                            int[] nArray = new int[lIlllIlll[1]];
                                                                                            nArray[m.lIlllIlll[0]] = lIlllIlll[11];
                                                                                            if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block30;
                                                                                            int[] nArray12 = new int[lIlllIlll[1]];
                                                                                            nArray12[m.lIlllIlll[0]] = lIlllIlll[11];
                                                                                            if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block26;
                                                                                        }
                                                                                        int[] nArray = new int[lIlllIlll[1]];
                                                                                        nArray[m.lIlllIlll[0]] = lIlllIlll[8];
                                                                                        if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                                        int[] nArray13 = new int[lIlllIlll[1]];
                                                                                        nArray13[m.lIlllIlll[0]] = lIlllIlll[8];
                                                                                        if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block26;
                                                                                    }
                                                                                    int[] nArray = new int[lIlllIlll[1]];
                                                                                    nArray[m.lIlllIlll[0]] = lIlllIlll[26];
                                                                                    if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                        n4 = lIlllIlll[1];

                                                                                        if ((0xDA ^ 0x84 ^ (0x4A ^ 0x11)) > 0) return n4 != 0;
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                                n4 = lIlllIlll[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if (!m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[27]) || !m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7])) break block32;
                                                                            int[] nArray = new int[lIlllIlll[1]];
                                                                            nArray[m.lIlllIlll[0]] = lIlllIlll[17];
                                                                            if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                            int[] nArray14 = new int[lIlllIlll[1]];
                                                                            nArray14[m.lIlllIlll[0]] = lIlllIlll[17];
                                                                            if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray14) ? 1 : 0)) break block34;
                                                                        }
                                                                        int[] nArray = new int[lIlllIlll[1]];
                                                                        nArray[m.lIlllIlll[0]] = lIlllIlll[19];
                                                                        if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray15 = new int[lIlllIlll[1]];
                                                                        nArray15[m.lIlllIlll[0]] = lIlllIlll[19];
                                                                        if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block34;
                                                                    }
                                                                    int[] nArray = new int[lIlllIlll[1]];
                                                                    nArray[m.lIlllIlll[0]] = lIlllIlll[18];
                                                                    if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                    int[] nArray16 = new int[lIlllIlll[1]];
                                                                    nArray16[m.lIlllIlll[0]] = lIlllIlll[18];
                                                                    if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray16) ? 1 : 0)) break block34;
                                                                }
                                                                int[] nArray = new int[lIlllIlll[1]];
                                                                nArray[m.lIlllIlll[0]] = lIlllIlll[20];
                                                                if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray17 = new int[lIlllIlll[1]];
                                                                nArray17[m.lIlllIlll[0]] = lIlllIlll[20];
                                                                if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray17) ? 1 : 0)) break block34;
                                                            }
                                                            int[] nArray = new int[lIlllIlll[1]];
                                                            nArray[m.lIlllIlll[0]] = lIlllIlll[16];
                                                            if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block38;
                                                            int[] nArray18 = new int[lIlllIlll[1]];
                                                            nArray18[m.lIlllIlll[0]] = lIlllIlll[16];
                                                            if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[lIlllIlll[1]];
                                                        nArray[m.lIlllIlll[0]] = lIlllIlll[26];
                                                        if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                            n3 = lIlllIlll[1];

                                                            if (((0x93 ^ 0x87 ^ (0x9F ^ 0x82)) & (0xB0 ^ 0x80 ^ (0x70 ^ 0x49) ^ -1)) < 1) return n3 != 0;
                                                            return ((172 + 32 - 21 + 5 ^ 103 + 82 - 26 + 9) & (0x92 ^ 0xA5 ^ (0x7E ^ 0x5D) ^ -1)) != 0;
                                                        }
                                                    }
                                                    n3 = lIlllIlll[0];
                                                    return n3 != 0;
                                                }
                                                int[] nArray = new int[lIlllIlll[1]];
                                                nArray[m.lIlllIlll[0]] = lIlllIlll[17];
                                                if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block39;
                                                int[] nArray19 = new int[lIlllIlll[1]];
                                                nArray19[m.lIlllIlll[0]] = lIlllIlll[17];
                                                if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray19) ? 1 : 0)) break block40;
                                            }
                                            int[] nArray = new int[lIlllIlll[1]];
                                            nArray[m.lIlllIlll[0]] = lIlllIlll[19];
                                            if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block41;
                                            int[] nArray20 = new int[lIlllIlll[1]];
                                            nArray20[m.lIlllIlll[0]] = lIlllIlll[19];
                                            if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray20) ? 1 : 0)) break block40;
                                        }
                                        int[] nArray = new int[lIlllIlll[1]];
                                        nArray[m.lIlllIlll[0]] = lIlllIlll[18];
                                        if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block42;
                                        int[] nArray21 = new int[lIlllIlll[1]];
                                        nArray21[m.lIlllIlll[0]] = lIlllIlll[18];
                                        if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray21) ? 1 : 0)) break block40;
                                    }
                                    int[] nArray = new int[lIlllIlll[1]];
                                    nArray[m.lIlllIlll[0]] = lIlllIlll[20];
                                    if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block43;
                                    int[] nArray22 = new int[lIlllIlll[1]];
                                    nArray22[m.lIlllIlll[0]] = lIlllIlll[20];
                                    if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray22) ? 1 : 0)) break block40;
                                }
                                int[] nArray = new int[lIlllIlll[1]];
                                nArray[m.lIlllIlll[0]] = lIlllIlll[15];
                                if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray23 = new int[lIlllIlll[1]];
                                nArray23[m.lIlllIlll[0]] = lIlllIlll[15];
                                if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray23) ? 1 : 0)) break block40;
                            }
                            int[] nArray = new int[lIlllIlll[1]];
                            nArray[m.lIlllIlll[0]] = lIlllIlll[12];
                            if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                            int[] nArray24 = new int[lIlllIlll[1]];
                            nArray24[m.lIlllIlll[0]] = lIlllIlll[12];
                            if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray24) ? 1 : 0)) break block40;
                        }
                        int[] nArray = new int[lIlllIlll[1]];
                        nArray[m.lIlllIlll[0]] = lIlllIlll[13];
                        if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray25 = new int[lIlllIlll[1]];
                        nArray25[m.lIlllIlll[0]] = lIlllIlll[13];
                        if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray25) ? 1 : 0)) break block40;
                    }
                    int[] nArray = new int[lIlllIlll[1]];
                    nArray[m.lIlllIlll[0]] = lIlllIlll[14];
                    if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block47;
                    int[] nArray26 = new int[lIlllIlll[1]];
                    nArray26[m.lIlllIlll[0]] = lIlllIlll[14];
                    if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray26) ? 1 : 0)) break block40;
                }
                int[] nArray = new int[lIlllIlll[1]];
                nArray[m.lIlllIlll[0]] = lIlllIlll[16];
                if (!m.lIIlllIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray27 = new int[lIlllIlll[1]];
                nArray27[m.lIlllIlll[0]] = lIlllIlll[16];
                if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray27) ? 1 : 0)) break block40;
            }
            int[] nArray = new int[lIlllIlll[1]];
            nArray[m.lIlllIlll[0]] = lIlllIlll[26];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIlllIlll[1];

                if (null == null) return n2 != 0;
                return ((0xA3 ^ 0x80 ^ (0xC1 ^ 0xA4)) & (94 + 102 - -49 + 5 ^ 130 + 96 - 137 + 99 ^ -1)) != 0;
            }
        }
        n2 = lIlllIlll[0];
        return n2 != 0;
    }

    private static boolean lIIlllIllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlllIllIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllIlllII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int T() {
        try {
            m.ap();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIlllIlll[54];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        block20: {
            block21: {
                if (m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7]) && m.lIIlllIlllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlllIlll[41]) && m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIlllIlll[36])) {
                    int n3;
                    int[] nArray = new int[lIlllIlll[1]];
                    nArray[m.lIlllIlll[0]] = lIlllIlll[9];
                    if (m.lIIlllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[lIlllIlll[1]];
                        nArray2[m.lIlllIlll[0]] = lIlllIlll[10];
                        if (m.lIIlllIlIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[lIlllIlll[1]];
                            nArray3[m.lIlllIlll[0]] = lIlllIlll[18];
                            if (m.lIIlllIlIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlllIlll[1]];
                                nArray4[m.lIlllIlll[0]] = lIlllIlll[20];
                                if (m.lIIlllIlIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[lIlllIlll[1]];
                                    nArray5[m.lIlllIlll[0]] = lIlllIlll[11];
                                    if (m.lIIlllIlIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                        int[] nArray6 = new int[lIlllIlll[1]];
                                        nArray6[m.lIlllIlll[0]] = lIlllIlll[8];
                                        if (m.lIIlllIlIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                            int[] nArray7 = new int[lIlllIlll[1]];
                                            nArray7[m.lIlllIlll[0]] = lIlllIlll[26];
                                            if (m.lIIlllIlIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                n3 = lIlllIlll[1];

                                                if (-2 <= 0) return n3 != 0;
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n3 = lIlllIlll[0];
                    return n3 != 0;
                }
                if (m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[27]) && m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7])) {
                    int n4;
                    int[] nArray = new int[lIlllIlll[1]];
                    nArray[m.lIlllIlll[0]] = lIlllIlll[17];
                    if (m.lIIlllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[lIlllIlll[1]];
                        nArray8[m.lIlllIlll[0]] = lIlllIlll[19];
                        if (m.lIIlllIlIlIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[lIlllIlll[1]];
                            nArray9[m.lIlllIlll[0]] = lIlllIlll[18];
                            if (m.lIIlllIlIlIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlllIlll[1]];
                                nArray10[m.lIlllIlll[0]] = lIlllIlll[20];
                                if (m.lIIlllIlIlIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                    int[] nArray11 = new int[lIlllIlll[1]];
                                    nArray11[m.lIlllIlll[0]] = lIlllIlll[16];
                                    if (m.lIIlllIlIlIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                        int[] nArray12 = new int[lIlllIlll[1]];
                                        nArray12[m.lIlllIlll[0]] = lIlllIlll[26];
                                        if (m.lIIlllIlIlIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                            n4 = lIlllIlll[1];

                                            if (((0xB5 ^ 0xB9) & ~(0x91 ^ 0x9D)) == 0) return n4 != 0;
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n4 = lIlllIlll[0];
                    return n4 != 0;
                }
                int[] nArray = new int[lIlllIlll[1]];
                nArray[m.lIlllIlll[0]] = lIlllIlll[17];
                if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                int[] nArray13 = new int[lIlllIlll[1]];
                nArray13[m.lIlllIlll[0]] = lIlllIlll[19];
                if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block20;
                int[] nArray14 = new int[lIlllIlll[1]];
                nArray14[m.lIlllIlll[0]] = lIlllIlll[18];
                if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block20;
                int[] nArray15 = new int[lIlllIlll[1]];
                nArray15[m.lIlllIlll[0]] = lIlllIlll[20];
                if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lIlllIlll[1]];
                nArray16[m.lIlllIlll[0]] = lIlllIlll[12];
                if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block20;
                int[] nArray17 = new int[lIlllIlll[1]];
                nArray17[m.lIlllIlll[0]] = lIlllIlll[23];
                if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray17) ? 1 : 0)) break block20;
                int[] nArray18 = new int[lIlllIlll[1]];
                nArray18[m.lIlllIlll[0]] = lIlllIlll[13];
                if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block20;
                int[] nArray19 = new int[lIlllIlll[1]];
                nArray19[m.lIlllIlll[0]] = lIlllIlll[14];
                if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray19) ? 1 : 0)) break block20;
                int[] nArray20 = new int[lIlllIlll[1]];
                nArray20[m.lIlllIlll[0]] = lIlllIlll[15];
                if (!m.lIIlllIlIlll(Bank.contains((int[])nArray20) ? 1 : 0)) break block21;
                int[] nArray21 = new int[lIlllIlll[1]];
                nArray21[m.lIlllIlll[0]] = lIlllIlll[15];
                if (!m.lIIlllIlIlIl(Equipment.contains((int[])nArray21) ? 1 : 0)) break block20;
            }
            int[] nArray = new int[lIlllIlll[1]];
            nArray[m.lIlllIlll[0]] = lIlllIlll[16];
            if (m.lIIlllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[lIlllIlll[1]];
                nArray22[m.lIlllIlll[0]] = lIlllIlll[26];
                if (m.lIIlllIlIlIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    n2 = lIlllIlll[1];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIlllIlll[0];
        return n2 != 0;
    }

    private static void aq() {
        block34: {
            block33: {
                int[] nArray = new int[lIlllIlll[1]];
                nArray[m.lIlllIlll[0]] = lIlllIlll[28];
                if (!m.lIIlllIlIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                int[] nArray2 = new int[lIlllIlll[1]];
                nArray2[m.lIlllIlll[0]] = lIlllIlll[29];
                if (!m.lIIlllIlIlll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block33;
                int[] nArray3 = new int[lIlllIlll[1]];
                nArray3[m.lIlllIlll[0]] = lIlllIlll[16];
                if (!m.lIIlllIlIlll(Equipment.contains((int[])nArray3) ? 1 : 0)) break block33;
                int[] nArray4 = new int[lIlllIlll[1]];
                nArray4[m.lIlllIlll[0]] = lIlllIlll[11];
                if (m.lIIlllIlIlll(Equipment.contains((int[])nArray4) ? 1 : 0) && !m.lIIlllIlIlIl(Equipment.contains(item -> item.getName().contains(lIlllIllI[lIlllIlll[61]])) ? 1 : 0)) break block34;
            }
            if (m.lIIlllIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
        }
        if (m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[27])) {
            int[] nArray = new int[lIlllIlll[1]];
            nArray[m.lIlllIlll[0]] = lIlllIlll[28];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[lIlllIlll[1]];
                nArray5[m.lIlllIlll[0]] = lIlllIlll[28];
                Inventory.getFirst((int[])nArray5).interact(lIlllIllI[lIlllIlll[30]]);
            }
            int[] nArray6 = new int[lIlllIlll[1]];
            nArray6[m.lIlllIlll[0]] = lIlllIlll[12];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray6) ? 1 : 0) && m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[5])) {
                e.l(lIlllIlll[12]);
            }
            int[] nArray7 = new int[lIlllIlll[1]];
            nArray7[m.lIlllIlll[0]] = lIlllIlll[13];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray7) ? 1 : 0) && m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[5]) && m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[31])) {
                e.l(lIlllIlll[13]);
            }
            int[] nArray8 = new int[lIlllIlll[1]];
            nArray8[m.lIlllIlll[0]] = lIlllIlll[14];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray8) ? 1 : 0) && m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[31])) {
                e.l(lIlllIlll[14]);
            }
            int[] nArray9 = new int[lIlllIlll[1]];
            nArray9[m.lIlllIlll[0]] = lIlllIlll[15];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                e.l(lIlllIlll[15]);
            }
        }
        if (m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[31])) {
            int[] nArray = new int[lIlllIlll[1]];
            nArray[m.lIlllIlll[0]] = lIlllIlll[18];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray10 = new int[lIlllIlll[1]];
                nArray10[m.lIlllIlll[0]] = lIlllIlll[18];
                Inventory.getFirst((int[])nArray10).interact(lIlllIllI[lIlllIlll[32]]);
            }
        }
        if (m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[27])) {
            int[] nArray = new int[lIlllIlll[1]];
            nArray[m.lIlllIlll[0]] = lIlllIlll[29];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray11 = new int[lIlllIlll[1]];
                nArray11[m.lIlllIlll[0]] = lIlllIlll[29];
                Inventory.getFirst((int[])nArray11).interact(lIlllIllI[lIlllIlll[33]]);
            }
            int[] nArray12 = new int[lIlllIlll[1]];
            nArray12[m.lIlllIlll[0]] = lIlllIlll[34];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                int[] nArray13 = new int[lIlllIlll[1]];
                nArray13[m.lIlllIlll[0]] = lIlllIlll[34];
                Inventory.getFirst((int[])nArray13).interact(lIlllIllI[lIlllIlll[35]]);
            }
            int[] nArray14 = new int[lIlllIlll[1]];
            nArray14[m.lIlllIlll[0]] = lIlllIlll[16];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIlllIlll[1]];
                nArray15[m.lIlllIlll[0]] = lIlllIlll[16];
                Inventory.getFirst((int[])nArray15).interact(lIlllIllI[lIlllIlll[24]]);
            }
        }
        if (m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.DEFENCE), lIlllIlll[36])) {
            int[] nArray = new int[lIlllIlll[1]];
            nArray[m.lIlllIlll[0]] = lIlllIlll[19];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIlllIlll[1]];
                nArray16[m.lIlllIlll[0]] = lIlllIlll[19];
                Inventory.getFirst((int[])nArray16).interact(lIlllIllI[lIlllIlll[37]]);
            }
        }
        if (m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7])) {
            int[] nArray = new int[lIlllIlll[1]];
            nArray[m.lIlllIlll[0]] = lIlllIlll[17];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray17 = new int[lIlllIlll[1]];
                nArray17[m.lIlllIlll[0]] = lIlllIlll[17];
                Inventory.getFirst((int[])nArray17).interact(lIlllIllI[lIlllIlll[38]]);
            }
        }
        int[] nArray = new int[lIlllIlll[1]];
        nArray[m.lIlllIlll[0]] = lIlllIlll[20];
        if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray18 = new int[lIlllIlll[1]];
            nArray18[m.lIlllIlll[0]] = lIlllIlll[20];
            Inventory.getFirst((int[])nArray18).interact(lIlllIllI[lIlllIlll[39]]);
        }
        int[] nArray19 = new int[lIlllIlll[1]];
        nArray19[m.lIlllIlll[0]] = lIlllIlll[21];
        if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[lIlllIlll[1]];
            nArray20[m.lIlllIlll[0]] = lIlllIlll[21];
            Inventory.getFirst((int[])nArray20).interact(lIlllIllI[lIlllIlll[40]]);
        }
        if (m.lIIlllIlllII(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlllIlll[41])) {
            int[] nArray21 = new int[lIlllIlll[1]];
            nArray21[m.lIlllIlll[0]] = lIlllIlll[8];
            if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[lIlllIlll[1]];
                nArray22[m.lIlllIlll[0]] = lIlllIlll[8];
                if (m.lIIlllIlIlll(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lIlllIlll[1]];
                    nArray23[m.lIlllIlll[0]] = lIlllIlll[8];
                    Inventory.getFirst((int[])nArray23).interact(lIlllIllI[lIlllIlll[42]]);
                }
            }
            if (m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7])) {
                int[] nArray24 = new int[lIlllIlll[1]];
                nArray24[m.lIlllIlll[0]] = lIlllIlll[9];
                if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                    int[] nArray25 = new int[lIlllIlll[1]];
                    nArray25[m.lIlllIlll[0]] = lIlllIlll[9];
                    if (m.lIIlllIlIlll(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[lIlllIlll[1]];
                        nArray26[m.lIlllIlll[0]] = lIlllIlll[9];
                        Inventory.getFirst((int[])nArray26).interact(lIlllIllI[lIlllIlll[43]]);
                    }
                }
            }
            if (m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7]) && m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIlllIlll[36])) {
                int[] nArray27 = new int[lIlllIlll[1]];
                nArray27[m.lIlllIlll[0]] = lIlllIlll[10];
                if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                    int[] nArray28 = new int[lIlllIlll[1]];
                    nArray28[m.lIlllIlll[0]] = lIlllIlll[10];
                    if (m.lIIlllIlIlll(Equipment.contains((int[])nArray28) ? 1 : 0)) {
                        int[] nArray29 = new int[lIlllIlll[1]];
                        nArray29[m.lIlllIlll[0]] = lIlllIlll[10];
                        Inventory.getFirst((int[])nArray29).interact(lIlllIllI[lIlllIlll[44]]);
                    }
                }
            }
            if (m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7])) {
                int[] nArray30 = new int[lIlllIlll[1]];
                nArray30[m.lIlllIlll[0]] = lIlllIlll[11];
                if (m.lIIlllIlIlIl(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[lIlllIlll[1]];
                    nArray31[m.lIlllIlll[0]] = lIlllIlll[11];
                    Inventory.getFirst((int[])nArray31).interact(lIlllIllI[lIlllIlll[45]]);
                }
            }
        }
    }

    private static void af() {
        block30: {
            d llIIIllllIIllI;
            block29: {
                block28: {
                    block27: {
                        Object llIIIllllIIlll;
                        block25: {
                            block26: {
                                if (!m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[27])) break block25;
                                int[] nArray = new int[lIlllIlll[1]];
                                nArray[m.lIlllIlll[0]] = lIlllIlll[12];
                                if (m.lIIlllIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new DHelper(lIlllIlll[12], lIlllIlll[1], lIlllIlll[46]);
                                    bv.add(d2);

                                }
                                int[] nArray2 = new int[lIlllIlll[1]];
                                nArray2[m.lIlllIlll[0]] = lIlllIlll[13];
                                if (m.lIIlllIlIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    llIIIllllIIlll = new DHelper(lIlllIlll[13], lIlllIlll[1], lIlllIlll[46]);
                                    bv.add((DHelper) lIIIllllIIlll);

                                }
                                int[] nArray3 = new int[lIlllIlll[1]];
                                nArray3[m.lIlllIlll[0]] = lIlllIlll[14];
                                if (m.lIIlllIlIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    llIIIllllIIlll = new DHelper(lIlllIlll[14], lIlllIlll[1], lIlllIlll[46]);
                                    bv.add((DHelper) lIIIllllIIlll);

                                }
                                int[] nArray4 = new int[lIlllIlll[1]];
                                nArray4[m.lIlllIlll[0]] = lIlllIlll[15];
                                if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                                int[] nArray5 = new int[lIlllIlll[1]];
                                nArray5[m.lIlllIlll[0]] = lIlllIlll[15];
                                if (!m.lIIlllIlIllI(Bank.getFirst((int[])nArray5).getQuantity(), lIlllIlll[47])) break block25;
                            }
                            llIIIllllIIlll = new DHelper(lIlllIlll[15], lIlllIlll[48], lIlllIlll[35]);
                            bv.add((DHelper) lIIIllllIIlll);

                        }
                        int[] nArray = new int[lIlllIlll[1]];
                        nArray[m.lIlllIlll[0]] = lIlllIlll[18];
                        if (m.lIIlllIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llIIIllllIIlll = new DHelper(lIlllIlll[18], lIlllIlll[1], lIlllIlll[49]);
                            bv.add((DHelper) lIIIllllIIlll);

                        }
                        int[] nArray6 = new int[lIlllIlll[1]];
                        nArray6[m.lIlllIlll[0]] = lIlllIlll[19];
                        if (m.lIIlllIlIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            llIIIllllIIlll = new DHelper(lIlllIlll[19], lIlllIlll[1], lIlllIlll[49]);
                            bv.add((DHelper) lIIIllllIIlll);

                        }
                        int[] nArray7 = new int[lIlllIlll[1]];
                        nArray7[m.lIlllIlll[0]] = lIlllIlll[17];
                        if (m.lIIlllIlIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            llIIIllllIIlll = new DHelper(lIlllIlll[17], lIlllIlll[1], lIlllIlll[49]);
                            bv.add((DHelper) lIIIllllIIlll);

                        }
                        int[] nArray8 = new int[lIlllIlll[1]];
                        nArray8[m.lIlllIlll[0]] = lIlllIlll[20];
                        if (m.lIIlllIlIlll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            llIIIllllIIlll = new DHelper(lIlllIlll[20], lIlllIlll[1], lIlllIlll[50]);
                            bv.add((DHelper) lIIIllllIIlll);

                        }
                        if (m.lIIlllIlIllI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7])) {
                            int[] nArray9 = new int[lIlllIlll[1]];
                            nArray9[m.lIlllIlll[0]] = lIlllIlll[16];
                            if (m.lIIlllIlIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                llIIIllllIIlll = new DHelper(lIlllIlll[16], lIlllIlll[51], lIlllIlll[42]);
                                bv.add((DHelper) lIIIllllIIlll);

                            }
                        }
                        int[] nArray10 = new int[lIlllIlll[1]];
                        nArray10[m.lIlllIlll[0]] = lIlllIlll[9];
                        if (m.lIIlllIlIlll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            llIIIllllIIlll = new DHelper(lIlllIlll[9], lIlllIlll[1], lIlllIlll[52]);
                            bv.add((DHelper) lIIIllllIIlll);

                        }
                        int[] nArray11 = new int[lIlllIlll[1]];
                        nArray11[m.lIlllIlll[0]] = lIlllIlll[10];
                        if (m.lIIlllIlIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                            llIIIllllIIlll = new DHelper(lIlllIlll[10], lIlllIlll[1], lIlllIlll[52]);
                            bv.add((DHelper) lIIIllllIIlll);

                        }
                        if (m.lIIlllIllIlI(Skills.getLevel((Skill)Skill.RANGED), lIlllIlll[7])) {
                            int[] nArray12 = new int[lIlllIlll[1]];
                            nArray12[m.lIlllIlll[0]] = lIlllIlll[11];
                            if (m.lIIlllIlIlll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                llIIIllllIIlll = new DHelper(lIlllIlll[11], lIlllIlll[48], lIlllIlll[53]);
                                bv.add((DHelper) lIIIllllIIlll);

                            }
                        }
                        int[] nArray13 = new int[lIlllIlll[1]];
                        nArray13[m.lIlllIlll[0]] = lIlllIlll[22];
                        if (m.lIIlllIlIlll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                            llIIIllllIIlll = new DHelper(lIlllIlll[22], lIlllIlll[1], i.bq);
                            bv.add((DHelper) lIIIllllIIlll);

                        }
                        int[] nArray14 = new int[lIlllIlll[1]];
                        nArray14[m.lIlllIlll[0]] = lIlllIlll[26];
                        if (m.lIIlllIlIlll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                            llIIIllllIIlll = new DHelper(lIlllIlll[26], lIlllIlll[54], lIlllIlll[55]);
                            bv.add((DHelper) lIIIllllIIlll);

                        }
                        if (m.lIIlllIlIlll(Bank.contains((Predicate)(llIIIllllIIlll = item -> item.getName().toLowerCase().contains(lIlllIllI[lIlllIlll[31]]))) ? 1 : 0)) {
                            llIIIllllIIllI = new DHelper(lIlllIlll[56], lIlllIlll[5], lIlllIlll[57]);
                            bv.add(llIIIllllIIllI);

                        }
                        int[] nArray15 = new int[lIlllIlll[1]];
                        nArray15[m.lIlllIlll[0]] = lIlllIlll[58];
                        if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block27;
                        int[] nArray16 = new int[lIlllIlll[1]];
                        nArray16[m.lIlllIlll[0]] = lIlllIlll[58];
                        if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block28;
                        int[] nArray17 = new int[lIlllIlll[1]];
                        nArray17[m.lIlllIlll[0]] = lIlllIlll[58];
                        if (!m.lIIlllIlIllI(Bank.getFirst((int[])nArray17).getQuantity(), lIlllIlll[24])) break block28;
                    }
                    llIIIllllIIllI = new DHelper(lIlllIlll[58], lIlllIlll[24], lIlllIlll[59]);
                    bv.add(llIIIllllIIllI);

                }
                int[] nArray = new int[lIlllIlll[1]];
                nArray[m.lIlllIlll[0]] = lIlllIlll[23];
                if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray18 = new int[lIlllIlll[1]];
                nArray18[m.lIlllIlll[0]] = lIlllIlll[23];
                if (!m.lIIlllIlIlIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block30;
                int[] nArray19 = new int[lIlllIlll[1]];
                nArray19[m.lIlllIlll[0]] = lIlllIlll[23];
                if (!m.lIIlllIlIllI(Bank.getFirst((int[])nArray19).getQuantity(), lIlllIlll[24])) break block30;
            }
            llIIIllllIIllI = new DHelper(lIlllIlll[23], lIlllIlll[24], lIlllIlll[59]);
            bv.add(llIIIllllIIllI);

        }
    }

    @Override
    public String U() {
        return lIlllIllI[lIlllIlll[60]];
    }

    private static boolean lIIlllIllIlI(int n2, int n3) {
        return n2 >= n3;
    }
}

