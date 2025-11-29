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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.y_Unknown;
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

public class m_Unknown
implements K {
    public static /* synthetic */ List<d> bp;
    private static /* synthetic */ String[] lIlIIllIlI;
    static /* synthetic */ WorldPoint cf;
    static /* synthetic */ WorldArea cd;
    static /* synthetic */ WorldPoint ce;
    private static /* synthetic */ int[] lIlIIllIll;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ boolean cc;

    private static boolean lIIIllIlllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIlllIll(int n2) {
        return n2 == 0;
    }

    private static void O() {
        d var5;
        Object var15;
        if (m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6])) {
            int[] nArray = new int[lIlIIllIll[1]];
            nArray[m.lIlIIllIll[0]] = lIlIIllIll[14];
            if (m.lIIIllIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIlIIllIll[14], lIlIIllIll[57], lIlIIllIll[58]);
                bp.add(d2);
                0;
            }
            int[] nArray2 = new int[lIlIIllIll[1]];
            nArray2[m.lIlIIllIll[0]] = lIlIIllIll[7];
            if (m.lIIIllIlllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                var15 = new d(lIlIIllIll[7], lIlIIllIll[59], lIlIIllIll[24]);
                bp.add((d)var15);
                0;
            }
            int[] nArray3 = new int[lIlIIllIll[1]];
            nArray3[m.lIlIIllIll[0]] = lIlIIllIll[9];
            if (m.lIIIllIlllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                var15 = new d(lIlIIllIll[9], lIlIIllIll[60], lIlIIllIll[24]);
                bp.add((d)var15);
                0;
            }
            int[] nArray4 = new int[lIlIIllIll[1]];
            nArray4[m.lIlIIllIll[0]] = lIlIIllIll[11];
            if (m.lIIIllIlllIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                var15 = new d(lIlIIllIll[11], lIlIIllIll[61], lIlIIllIll[24]);
                bp.add((d)var15);
                0;
            }
            int[] nArray5 = new int[lIlIIllIll[1]];
            nArray5[m.lIlIIllIll[0]] = lIlIIllIll[12];
            if (m.lIIIllIlllIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                var15 = new d(lIlIIllIll[12], lIlIIllIll[4], lIlIIllIll[24]);
                bp.add((d)var15);
                0;
            }
            int[] nArray6 = new int[lIlIIllIll[1]];
            nArray6[m.lIlIIllIll[0]] = lIlIIllIll[44];
            if (m.lIIIllIlllIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                var15 = new d(lIlIIllIll[44], lIlIIllIll[1], e.c(lIlIIllIll[62], lIlIIllIll[63]));
                bp.add((d)var15);
                0;
            }
        }
        if (m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6])) {
            int[] nArray = new int[lIlIIllIll[1]];
            nArray[m.lIlIIllIll[0]] = lIlIIllIll[22];
            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIlIIllIll[1]];
                nArray7[m.lIlIIllIll[0]] = lIlIIllIll[22];
                if (m.lIIIllIlllIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIlIIllIll[61])) {
                    int[] nArray8 = new int[lIlIIllIll[1]];
                    nArray8[m.lIlIIllIll[0]] = lIlIIllIll[22];
                    var15 = new d(lIlIIllIll[22], lIlIIllIll[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIlIIllIll[64]);
                    bp.add((d)var15);
                    0;
                }
            }
            int[] nArray9 = new int[lIlIIllIll[1]];
            nArray9[m.lIlIIllIll[0]] = lIlIIllIll[22];
            if (m.lIIIllIlllIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                var15 = new d(lIlIIllIll[22], lIlIIllIll[61], lIlIIllIll[64]);
                bp.add((d)var15);
                0;
            }
            int[] nArray10 = new int[lIlIIllIll[1]];
            nArray10[m.lIlIIllIll[0]] = lIlIIllIll[23];
            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIlIIllIll[1]];
                nArray11[m.lIlIIllIll[0]] = lIlIIllIll[23];
                if (m.lIIIllIlllIlI(Bank.getFirst((int[])nArray11).getQuantity(), lIlIIllIll[61])) {
                    int[] nArray12 = new int[lIlIIllIll[1]];
                    nArray12[m.lIlIIllIll[0]] = lIlIIllIll[23];
                    var15 = new d(lIlIIllIll[23], lIlIIllIll[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIlIIllIll[65]);
                    bp.add((d)var15);
                    0;
                }
            }
            int[] nArray13 = new int[lIlIIllIll[1]];
            nArray13[m.lIlIIllIll[0]] = lIlIIllIll[23];
            if (m.lIIIllIlllIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                var15 = new d(lIlIIllIll[23], lIlIIllIll[61], lIlIIllIll[65]);
                bp.add((d)var15);
                0;
            }
            int[] nArray14 = new int[lIlIIllIll[1]];
            nArray14[m.lIlIIllIll[0]] = lIlIIllIll[20];
            if (m.lIIIllIlllIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIlIIllIll[1]];
                nArray15[m.lIlIIllIll[0]] = lIlIIllIll[20];
                if (m.lIIIllIlllIll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    var15 = new d(lIlIIllIll[20], lIlIIllIll[1], lIlIIllIll[66]);
                    bp.add((d)var15);
                    0;
                }
            }
            if (m.lIIIllIlllIIl(cc ? 1 : 0)) {
                int[] nArray16 = new int[lIlIIllIll[1]];
                nArray16[m.lIlIIllIll[0]] = lIlIIllIll[14];
                if (m.lIIIllIlllIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIIllIll[1]];
                    nArray17[m.lIlIIllIll[0]] = lIlIIllIll[14];
                    if (m.lIIIllIlllIlI(Bank.getFirst((int[])nArray17).getQuantity(), lIlIIllIll[61])) {
                        int[] nArray18 = new int[lIlIIllIll[1]];
                        nArray18[m.lIlIIllIll[0]] = lIlIIllIll[14];
                        var15 = new d(lIlIIllIll[14], lIlIIllIll[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIlIIllIll[58]);
                        bp.add((d)var15);
                        0;
                    }
                }
                int[] nArray19 = new int[lIlIIllIll[1]];
                nArray19[m.lIlIIllIll[0]] = lIlIIllIll[14];
                if (m.lIIIllIlllIll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    var15 = new d(lIlIIllIll[14], lIlIIllIll[61], lIlIIllIll[58]);
                    bp.add((d)var15);
                    0;
                }
                int[] nArray20 = new int[lIlIIllIll[1]];
                nArray20[m.lIlIIllIll[0]] = lIlIIllIll[21];
                if (m.lIIIllIlllIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIlIIllIll[1]];
                    nArray21[m.lIlIIllIll[0]] = lIlIIllIll[21];
                    if (m.lIIIllIlllIlI(Bank.getFirst((int[])nArray21).getQuantity(), lIlIIllIll[66])) {
                        int[] nArray22 = new int[lIlIIllIll[1]];
                        nArray22[m.lIlIIllIll[0]] = lIlIIllIll[21];
                        var15 = new d(lIlIIllIll[21], lIlIIllIll[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIlIIllIll[24]);
                        bp.add((d)var15);
                        0;
                    }
                }
                int[] nArray23 = new int[lIlIIllIll[1]];
                nArray23[m.lIlIIllIll[0]] = lIlIIllIll[21];
                if (m.lIIIllIlllIll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    var15 = new d(lIlIIllIll[21], lIlIIllIll[66], lIlIIllIll[24]);
                    bp.add((d)var15);
                    0;
                }
            }
        }
        int[] nArray = new int[lIlIIllIll[1]];
        nArray[m.lIlIIllIll[0]] = lIlIIllIll[18];
        if (m.lIIIllIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var15 = new d(lIlIIllIll[18], lIlIIllIll[67], lIlIIllIll[37]);
            bp.add((d)var15);
            0;
        }
        if (m.lIIIllIlllIll(Bank.contains(var15 = item -> item.getName().toLowerCase().contains(lIlIIllIlI[lIlIIllIll[74]])) ? 1 : 0)) {
            var5 = new d(lIlIIllIll[68], lIlIIllIll[17], lIlIIllIll[69]);
            bp.add(var5);
            0;
        }
        int[] nArray24 = new int[lIlIIllIll[1]];
        nArray24[m.lIlIIllIll[0]] = lIlIIllIll[70];
        if (m.lIIIllIlllIll(Bank.contains((int[])nArray24) ? 1 : 0)) {
            var5 = new d(lIlIIllIll[70], lIlIIllIll[32], lIlIIllIll[71]);
            bp.add(var5);
            0;
        }
        int[] nArray25 = new int[lIlIIllIll[1]];
        nArray25[m.lIlIIllIll[0]] = lIlIIllIll[16];
        if (m.lIIIllIlllIll(Bank.contains((int[])nArray25) ? 1 : 0)) {
            var5 = new d(lIlIIllIll[16], lIlIIllIll[32], lIlIIllIll[71]);
            bp.add(var5);
            0;
        }
    }

    @Override
    public String ae() {
        return lIlIIllIlI[lIlIIllIll[72]];
    }

    @Override
    public boolean af() {
        boolean bl;
        if (m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[73])) {
            bl = lIlIIllIll[1];
            0;
            
            }
        } else {
            bl = lIlIIllIll[0];
        }
        return bl;
    }

    static {
        m.lIIIllIlllIII();
        m.lIIIllIllIlll();
        bp = new ArrayList<d>();
        cd = new WorldArea(lIlIIllIll[76], lIlIIllIll[77], lIlIIllIll[47], lIlIIllIll[40], lIlIIllIll[0]);
        ce = new WorldPoint(lIlIIllIll[78], lIlIIllIll[79], lIlIIllIll[0]);
        cf = new WorldPoint(lIlIIllIll[80] + e.c(lIlIIllIll[1], lIlIIllIll[5]), lIlIIllIll[81], lIlIIllIll[0]);
    }

    private static int lIIIlllIIIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean am() {
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
                                                    if (!m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[19])) break block19;
                                                    int[] nArray = new int[lIlIIllIll[1]];
                                                    nArray[m.lIlIIllIll[0]] = lIlIIllIll[7];
                                                    if (!m.lIIIllIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIlIIllIll[1]];
                                                    nArray2[m.lIlIIllIll[0]] = lIlIIllIll[11];
                                                    if (!m.lIIIllIlllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIlIIllIll[1]];
                                                    nArray3[m.lIlIIllIll[0]] = lIlIIllIll[9];
                                                    if (!m.lIIIllIlllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIlIIllIll[1]];
                                                    nArray4[m.lIlIIllIll[0]] = lIlIIllIll[12];
                                                    if (!m.lIIIllIlllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIlIIllIll[1]];
                                                    nArray5[m.lIlIIllIll[0]] = lIlIIllIll[18];
                                                    if (!m.lIIIllIlllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIlIIllIll[1]];
                                                    nArray6[m.lIlIIllIll[0]] = lIlIIllIll[44];
                                                    if (!m.lIIIllIlllIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIlIIllIll[1]];
                                                    nArray7[m.lIlIIllIll[0]] = lIlIIllIll[44];
                                                    if (!m.lIIIllIlllIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIlIIllIll[1];
                                                0;
                                                if (2 != 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lIlIIllIll[0];
                                            return n5 != 0;
                                        }
                                        if (!m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[19]) || !m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6])) break block22;
                                        int[] nArray = new int[lIlIIllIll[1]];
                                        nArray[m.lIlIIllIll[0]] = lIlIIllIll[11];
                                        if (!m.lIIIllIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIlIIllIll[1]];
                                        nArray8[m.lIlIIllIll[0]] = lIlIIllIll[9];
                                        if (!m.lIIIllIlllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIlIIllIll[1]];
                                        nArray9[m.lIlIIllIll[0]] = lIlIIllIll[12];
                                        if (!m.lIIIllIlllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIlIIllIll[1]];
                                        nArray10[m.lIlIIllIll[0]] = lIlIIllIll[14];
                                        if (!m.lIIIllIlllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIlIIllIll[1]];
                                        nArray11[m.lIlIIllIll[0]] = lIlIIllIll[44];
                                        if (!m.lIIIllIlllIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIlIIllIll[1]];
                                        nArray12[m.lIlIIllIll[0]] = lIlIIllIll[44];
                                        if (!m.lIIIllIlllIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIlIIllIll[1];
                                    0;
                                    if (-1 <= (129 + 39 - 121 + 94 ^ 60 + 12 - 17 + 82)) return n4 != 0;
                                    return ((13 + 152 - 124 + 129 ^ 87 + 85 - 102 + 71) & (0x51 ^ 0x59 ^ (0x8E ^ 0xA1) ^ -1)) != 0;
                                }
                                n4 = lIlIIllIll[0];
                                return n4 != 0;
                            }
                            if (!m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6]) || !m.lIIIllIlllIll(cc ? 1 : 0)) break block25;
                            int[] nArray = new int[lIlIIllIll[1]];
                            nArray[m.lIlIIllIll[0]] = lIlIIllIll[20];
                            if (!m.lIIIllIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIlIIllIll[1]];
                            nArray13[m.lIlIIllIll[0]] = lIlIIllIll[20];
                            if (!m.lIIIllIlllIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIlIIllIll[1]];
                        nArray[m.lIlIIllIll[0]] = lIlIIllIll[22];
                        if (m.lIIIllIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIlIIllIll[1]];
                            nArray14[m.lIlIIllIll[0]] = lIlIIllIll[23];
                            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIlIIllIll[1];
                                0;
                                if (-(0x57 ^ 0x53) <= 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIlIIllIll[0];
                    return n3 != 0;
                }
                if (!m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6]) || !m.lIIIllIlllIIl(cc ? 1 : 0)) return lIlIIllIll[0];
                int[] nArray = new int[lIlIIllIll[1]];
                nArray[m.lIlIIllIll[0]] = lIlIIllIll[20];
                if (!m.lIIIllIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIlIIllIll[1]];
                nArray15[m.lIlIIllIll[0]] = lIlIIllIll[20];
                if (!m.lIIIllIlllIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIlIIllIll[1]];
            nArray[m.lIlIIllIll[0]] = lIlIIllIll[14];
            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIlIIllIll[1]];
                nArray16[m.lIlIIllIll[0]] = lIlIIllIll[21];
                if (m.lIIIllIlllIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIIllIll[1]];
                    nArray17[m.lIlIIllIll[0]] = lIlIIllIll[21];
                    if (m.lIIIllIlllllI(Bank.getFirst((int[])nArray17).getQuantity(), lIlIIllIll[17])) {
                        int[] nArray18 = new int[lIlIIllIll[1]];
                        nArray18[m.lIlIIllIll[0]] = lIlIIllIll[22];
                        if (m.lIIIllIlllIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIlIIllIll[1]];
                            nArray19[m.lIlIIllIll[0]] = lIlIIllIll[23];
                            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIlIIllIll[1];
                                0;
                                if (null == null) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlIIllIll[0];
        return n2 != 0;
    }

    public static boolean an() {
        if (m.lIIIllIllllll(Vars.getBit((int)lIlIIllIll[48]), lIlIIllIll[1]) && m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[17])) {
            return lIlIIllIll[1];
        }
        if (m.lIIIllIllllll(Vars.getBit((int)lIlIIllIll[48]), lIlIIllIll[2]) && m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[31]) && m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[17])) {
            return lIlIIllIll[1];
        }
        if (m.lIIIllIllllll(Vars.getBit((int)lIlIIllIll[48]), lIlIIllIll[3]) && m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[31]) && m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[36])) {
            return lIlIIllIll[1];
        }
        if (m.lIIIllIllllll(Vars.getBit((int)lIlIIllIll[48]), lIlIIllIll[3]) && m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[31])) {
            int[] nArray = new int[lIlIIllIll[1]];
            nArray[m.lIlIIllIll[0]] = lIlIIllIll[12];
            if (m.lIIIllIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlIIllIll[1];
            }
        }
        if (m.lIIIllIllllll(Vars.getBit((int)lIlIIllIll[48]), lIlIIllIll[5]) && m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[36])) {
            int[] nArray = new int[lIlIIllIll[1]];
            nArray[m.lIlIIllIll[0]] = lIlIIllIll[12];
            if (m.lIIIllIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIlIIllIll[1];
            }
        }
        return lIlIIllIll[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
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
                                                    if (!m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[19])) break block19;
                                                    int[] nArray = new int[lIlIIllIll[1]];
                                                    nArray[m.lIlIIllIll[0]] = lIlIIllIll[7];
                                                    if (!m.lIIIllIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIlIIllIll[1]];
                                                    nArray2[m.lIlIIllIll[0]] = lIlIIllIll[11];
                                                    if (!m.lIIIllIlllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIlIIllIll[1]];
                                                    nArray3[m.lIlIIllIll[0]] = lIlIIllIll[9];
                                                    if (!m.lIIIllIlllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIlIIllIll[1]];
                                                    nArray4[m.lIlIIllIll[0]] = lIlIIllIll[12];
                                                    if (!m.lIIIllIlllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIlIIllIll[1]];
                                                    nArray5[m.lIlIIllIll[0]] = lIlIIllIll[18];
                                                    if (!m.lIIIllIlllIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIlIIllIll[1]];
                                                    nArray6[m.lIlIIllIll[0]] = lIlIIllIll[44];
                                                    if (!m.lIIIllIlllIll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIlIIllIll[1]];
                                                    nArray7[m.lIlIIllIll[0]] = lIlIIllIll[44];
                                                    if (!m.lIIIllIlllIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIlIIllIll[1];
                                                0;
                                                if ((0x64 ^ 0x61) != 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lIlIIllIll[0];
                                            return n5 != 0;
                                        }
                                        if (!m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[19]) || !m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6])) break block22;
                                        int[] nArray = new int[lIlIIllIll[1]];
                                        nArray[m.lIlIIllIll[0]] = lIlIIllIll[11];
                                        if (!m.lIIIllIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIlIIllIll[1]];
                                        nArray8[m.lIlIIllIll[0]] = lIlIIllIll[9];
                                        if (!m.lIIIllIlllIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIlIIllIll[1]];
                                        nArray9[m.lIlIIllIll[0]] = lIlIIllIll[12];
                                        if (!m.lIIIllIlllIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIlIIllIll[1]];
                                        nArray10[m.lIlIIllIll[0]] = lIlIIllIll[14];
                                        if (!m.lIIIllIlllIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIlIIllIll[1]];
                                        nArray11[m.lIlIIllIll[0]] = lIlIIllIll[44];
                                        if (!m.lIIIllIlllIll(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIlIIllIll[1]];
                                        nArray12[m.lIlIIllIll[0]] = lIlIIllIll[44];
                                        if (!m.lIIIllIlllIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIlIIllIll[1];
                                    0;
                                    if (-1 < 0) return n4 != 0;
                                    return false;
                                }
                                n4 = lIlIIllIll[0];
                                return n4 != 0;
                            }
                            if (!m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6]) || !m.lIIIllIlllIll(cc ? 1 : 0)) break block25;
                            int[] nArray = new int[lIlIIllIll[1]];
                            nArray[m.lIlIIllIll[0]] = lIlIIllIll[20];
                            if (!m.lIIIllIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIlIIllIll[1]];
                            nArray13[m.lIlIIllIll[0]] = lIlIIllIll[20];
                            if (!m.lIIIllIlllIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIlIIllIll[1]];
                        nArray[m.lIlIIllIll[0]] = lIlIIllIll[22];
                        if (m.lIIIllIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIlIIllIll[1]];
                            nArray14[m.lIlIIllIll[0]] = lIlIIllIll[35];
                            if (m.lIIIllIlllIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIlIIllIll[1];
                                0;
                                if ((0xD4 ^ 0xC4 ^ (0x8A ^ 0x9E)) > 3) return n3 != 0;
                                return ((105 + 183 - 114 + 39 ^ 78 + 55 - 40 + 45) & (0xE4 ^ 0xA4 ^ (0xB2 ^ 0xAD) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIlIIllIll[0];
                    return n3 != 0;
                }
                if (!m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6]) || !m.lIIIllIlllIIl(cc ? 1 : 0)) return lIlIIllIll[0];
                int[] nArray = new int[lIlIIllIll[1]];
                nArray[m.lIlIIllIll[0]] = lIlIIllIll[20];
                if (!m.lIIIllIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIlIIllIll[1]];
                nArray15[m.lIlIIllIll[0]] = lIlIIllIll[20];
                if (!m.lIIIllIlllIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIlIIllIll[1]];
            nArray[m.lIlIIllIll[0]] = lIlIIllIll[14];
            if (m.lIIIllIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIlIIllIll[1]];
                nArray16[m.lIlIIllIll[0]] = lIlIIllIll[21];
                if (m.lIIIllIlllIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIlIIllIll[1]];
                    nArray17[m.lIlIIllIll[0]] = lIlIIllIll[21];
                    if (m.lIIIllIlllllI(Inventory.getFirst((int[])nArray17).getQuantity(), lIlIIllIll[17])) {
                        int[] nArray18 = new int[lIlIIllIll[1]];
                        nArray18[m.lIlIIllIll[0]] = lIlIIllIll[22];
                        if (m.lIIIllIlllIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIlIIllIll[1]];
                            nArray19[m.lIlIIllIll[0]] = lIlIIllIll[35];
                            if (m.lIIIllIlllIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIlIIllIll[1];
                                0;
                                if (((0x47 ^ 0x2E ^ (0xE2 ^ 0x87)) & (0x7F ^ 0x38 ^ (0x51 ^ 0x1A) ^ -1)) != -1) return n2 != 0;
                                return ((73 + 5 - -31 + 28 ^ 14 + 15 - 23 + 176) & (0x2C ^ 0x43 ^ (0x18 ^ 0x48) ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlIIllIll[0];
        return n2 != 0;
    }

    public static void ai() {
        if (m.lIIIllIlllIIl(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[0]];
            b.a(bp);
            if (m.lIIIllIlllIlI(bp.size(), lIlIIllIll[1])) {
                System.out.println(lIlIIllIlI[lIlIIllIll[1]]);
                bn = lIlIIllIll[0];
            }
        }
        if (m.lIIIllIlllIll(bn ? 1 : 0)) {
            BankLocation var16;
            if (m.lIIIllIlllIll(m.al() ? 1 : 0)) {
                var16 = BankLocation.getNearest();
                if (m.lIIIllIllllII(var16) && m.lIIIllIlllIll(var16.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[2]];
                    a.a(var16);
                }
                if (m.lIIIllIllllII(var16) && m.lIIIllIlllIIl(var16.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[3]];
                    if (m.lIIIllIlllIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIllIll[4]);
                        0;
                    }
                    if (m.lIIIllIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        if (m.lIIIllIllllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIlIIllIll[5]);
                            0;
                        }
                        while (m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6]) && m.lIIIllIlllIll(y.bv() ? 1 : 0)) {
                            y.bt();
                            Time.sleepTicks((int)lIlIIllIll[1]);
                            0;
                            0;
                            if (((0x73 ^ 0x6C ^ (0x1E ^ 0x33)) & (0xCE ^ 0x8A ^ (0xE6 ^ 0x90) ^ -1)) == 0) continue;
                            return;
                        }
                        if (m.lIIIllIlllIll(m.am() ? 1 : 0)) {
                            m.O();
                            System.out.println(lIlIIllIlI[lIlIIllIll[5]]);
                            bn = lIlIIllIll[1];
                            return;
                        }
                        if (m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6])) {
                            int[] nArray = new int[lIlIIllIll[1]];
                            nArray[m.lIlIIllIll[0]] = lIlIIllIll[7];
                            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIlIIllIll[1]];
                                nArray2[m.lIlIIllIll[0]] = lIlIIllIll[7];
                                if (m.lIIIllIlllIlI(Inventory.getCount((int[])nArray2), lIlIIllIll[1])) {
                                    Bank.withdraw((int)lIlIIllIll[7], (int)lIlIIllIll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIllIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIllIll[1]];
                                        nArray[m.lIlIIllIll[0]] = lIlIIllIll[7];
                                        if (m.lIIIllIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIllIll[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = lIlIIllIll[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIllIll[4]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[lIlIIllIll[1]];
                            nArray3[m.lIlIIllIll[0]] = lIlIIllIll[9];
                            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIlIIllIll[1]];
                                nArray4[m.lIlIIllIll[0]] = lIlIIllIll[9];
                                if (m.lIIIllIlllIlI(Inventory.getCount((int[])nArray4), lIlIIllIll[1])) {
                                    Bank.withdraw((int)lIlIIllIll[9], (int)lIlIIllIll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIllIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIllIll[1]];
                                        nArray[m.lIlIIllIll[0]] = lIlIIllIll[9];
                                        if (m.lIIIllIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIllIll[1];
                                            0;
                                            if (-1 > 0) {
                                                return ((0x5C ^ 2 ^ (0x12 ^ 0x7D)) & (0x63 ^ 0x6D ^ (0xFE ^ 0xC1) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlIIllIll[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIllIll[4]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[lIlIIllIll[1]];
                            nArray5[m.lIlIIllIll[0]] = lIlIIllIll[11];
                            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIlIIllIll[1]];
                                nArray6[m.lIlIIllIll[0]] = lIlIIllIll[11];
                                if (m.lIIIllIlllIlI(Inventory.getCount((int[])nArray6), lIlIIllIll[1])) {
                                    Bank.withdraw((int)lIlIIllIll[11], (int)lIlIIllIll[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIllIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIllIll[1]];
                                        nArray[m.lIlIIllIll[0]] = lIlIIllIll[11];
                                        if (m.lIIIllIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIllIll[1];
                                            0;
                                            if (1 >= (0x5C ^ 0x58)) {
                                                return (2 & ~2) != 0;
                                            }
                                        } else {
                                            bl = lIlIIllIll[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIllIll[4]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[lIlIIllIll[1]];
                            nArray7[m.lIlIIllIll[0]] = lIlIIllIll[12];
                            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIlIIllIll[1]];
                                nArray8[m.lIlIIllIll[0]] = lIlIIllIll[12];
                                if (m.lIIIllIlllIlI(Inventory.getCount((int[])nArray8), lIlIIllIll[1])) {
                                    Bank.withdraw((int)lIlIIllIll[12], (int)lIlIIllIll[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIllIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIllIll[1]];
                                        nArray[m.lIlIIllIll[0]] = lIlIIllIll[12];
                                        if (m.lIIIllIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIllIll[1];
                                            0;
                                            if (((0x75 ^ 0x7C ^ (0x35 ^ 0x3B)) & (17 + 3 - 7 + 164 ^ 112 + 176 - 246 + 140 ^ -1)) < -1) {
                                                return ((0x3E ^ 0x39 ^ (0xB4 ^ 0xA6)) & (0xC5 ^ 0xAD ^ (0x23 ^ 0x5E) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlIIllIll[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIllIll[4]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[lIlIIllIll[1]];
                            nArray9[m.lIlIIllIll[0]] = lIlIIllIll[14];
                            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlIIllIll[1]];
                                nArray10[m.lIlIIllIll[0]] = lIlIIllIll[14];
                                if (m.lIIIllIlllIlI(Inventory.getCount((int[])nArray10), lIlIIllIll[1])) {
                                    Bank.withdraw((int)lIlIIllIll[14], (int)lIlIIllIll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIllIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIllIll[1]];
                                        nArray[m.lIlIIllIll[0]] = lIlIIllIll[14];
                                        if (m.lIIIllIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIllIll[1];
                                            0;
                                            
                                            }
                                        } else {
                                            bl = lIlIIllIll[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIllIll[4]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[lIlIIllIll[1]];
                            nArray11[m.lIlIIllIll[0]] = lIlIIllIll[15];
                            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIlIIllIll[1]];
                                nArray12[m.lIlIIllIll[0]] = lIlIIllIll[15];
                                if (m.lIIIllIlllIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIlIIllIll[15], (int)lIlIIllIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIllIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIlIIllIll[1]];
                                        nArray[m.lIlIIllIll[0]] = lIlIIllIll[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIlIIllIll[4]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)lIlIIllIll[16], (int)lIlIIllIll[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIlIIllIll[1]];
                            nArray13[m.lIlIIllIll[0]] = lIlIIllIll[18];
                            if (m.lIIIllIlllIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIlIIllIll[1]];
                                nArray14[m.lIlIIllIll[0]] = lIlIIllIll[18];
                                if (m.lIIIllIlllIlI(Inventory.getCount((int[])nArray14), lIlIIllIll[1]) && m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[19])) {
                                    Bank.withdrawAll((int)lIlIIllIll[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIlIIllIll[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIlIIllIll[1]];
                                        nArray[m.lIlIIllIll[0]] = lIlIIllIll[18];
                                        if (m.lIIIllIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIlIIllIll[1];
                                            0;
                                            if (-1 > -1) {
                                                return ((0xFE ^ 0xA2 ^ (0x14 ^ 0x55)) & (0x50 ^ 0x1D ^ (0x45 ^ 0x15) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIlIIllIll[0];
                                        }
                                        return bl;
                                    }, (int)lIlIIllIll[4]);
                                    0;
                                }
                            }
                        }
                        if (m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6])) {
                            int[] nArray = new int[lIlIIllIll[1]];
                            nArray[m.lIlIIllIll[0]] = lIlIIllIll[20];
                            if (m.lIIIllIlllIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIlIIllIll[20], (int)lIlIIllIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlIIllIll[1]);
                                0;
                            }
                            if (m.lIIIllIlllIIl(cc ? 1 : 0)) {
                                Bank.withdrawAll((int)lIlIIllIll[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlIIllIll[1]);
                                0;
                                Bank.withdrawAll((int)lIlIIllIll[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIlIIllIll[1]);
                                0;
                            }
                            Bank.withdrawAll((int)lIlIIllIll[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIlIIllIll[1]);
                            0;
                            Bank.withdrawAll((int)lIlIIllIll[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIlIIllIll[1]);
                            0;
                        }
                    }
                }
            }
            if (m.lIIIllIlllIIl(m.al() ? 1 : 0)) {
                if (m.lIIIllIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[19])) {
                    if (m.lIIIllIlllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[17]];
                        Movement.walkTo((WorldPoint)ce);
                        0;
                        Time.sleepTicks((int)lIlIIllIll[1]);
                        0;
                    }
                    if (m.lIIIllIlllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[24]];
                        m.ak();
                    }
                }
                if (m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[19]) && m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[25])) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[26]];
                    if (m.lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIlIIllIll[1]);
                        0;
                    }
                }
                if (m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[25]) && m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[28])) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[29]];
                    if (m.lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIlIIllIll[1]);
                        0;
                    }
                }
                if (m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[28]) && m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[30])) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[31]];
                    if (m.lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIlIIllIll[1]);
                        0;
                    }
                }
                if (m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[30]) && m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6])) {
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[32]];
                    if (m.lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIlIIllIll[1]);
                        0;
                    }
                }
                if (m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[6])) {
                    int var17;
                    AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[33]];
                    int[] nArray = new int[lIlIIllIll[1]];
                    nArray[m.lIlIIllIll[0]] = lIlIIllIll[20];
                    if (m.lIIIllIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIlIIllIll[1]];
                        nArray15[m.lIlIIllIll[0]] = lIlIIllIll[20];
                        if (m.lIIIllIlllIll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIlIIllIll[1]];
                            nArray16[m.lIlIIllIll[0]] = lIlIIllIll[20];
                            Inventory.getFirst((int[])nArray16).interact(lIlIIllIlI[lIlIIllIll[34]]);
                            Time.sleepTicks((int)lIlIIllIll[1]);
                            0;
                        }
                    }
                    if (m.lIIIllIlllIIl(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIlIIllIll[1]];
                    nArray17[m.lIlIIllIll[0]] = lIlIIllIll[22];
                    var16 = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIlIIllIll[1]];
                    nArray18[m.lIlIIllIll[0]] = lIlIIllIll[35];
                    Item var2 = Inventory.getFirst((int[])nArray18);
                    if (m.lIIIllIlllIll(cc ? 1 : 0)) {
                        if (m.lIIIllIlllIll(Players.getLocal().getWorldLocation().equals((Object)cf) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[36]];
                            Movement.walkTo((WorldPoint)cf);
                            0;
                            Time.sleepTicks((int)lIlIIllIll[1]);
                            0;
                        }
                        if (m.lIIIllIlllIIl(Players.getLocal().getWorldLocation().equals((Object)cf) ? 1 : 0) && m.lIIIllIllllII(var16) && m.lIIIllIllllII(var2)) {
                            var17 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var2);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (m.lIIIlllIIIlII(Skills.getExperience((Skill)Skill.MAGIC), var17)) {
                                    bl = lIlIIllIll[1];
                                    0;
                                    if (-1 >= 0) {
                                        return ((0xD1 ^ 0xB4 ^ (0x58 ^ 0x75)) & (15 + 119 - -50 + 9 ^ 130 + 123 - 204 + 88 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIIllIll[0];
                                }
                                return bl;
                            }, (int)lIlIIllIll[8]);
                            0;
                            Time.sleep((long)e.c(lIlIIllIll[37], lIlIIllIll[38]));
                            0;
                        }
                    }
                    if (m.lIIIllIlllIIl(cc ? 1 : 0)) {
                        if (m.lIIIllIllllII(var16) && m.lIIIllIllllII(var2) && m.lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                            var17 = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)var2);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (m.lIIIlllIIIlII(Skills.getExperience((Skill)Skill.MAGIC), var17)) {
                                    bl = lIlIIllIll[1];
                                    0;
                                    if (3 < 2) {
                                        return false;
                                    }
                                } else {
                                    bl = lIlIIllIll[0];
                                }
                                return bl;
                            }, (int)lIlIIllIll[8]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (m.lIIIllIllllll(Players.getLocal().getAnimation(), lIlIIllIll[27])) {
                                bl = lIlIIllIll[1];
                                0;
                                if ((0x33 ^ 0x5E ^ (0xAF ^ 0xC6)) < (0xD ^ 0x4C ^ (7 ^ 0x42))) {
                                    return (2 & (2 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlIIllIll[0];
                            }
                            return bl;
                        }, (int)lIlIIllIll[39]);
                        0;
                    }
                }
            }
        }
    }

    private static String lIIIllIllIlII(String var24, String var18) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIIllIll[2], var3);
            return new String(var1.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ac() {
        return lIlIIllIll[0];
    }

    private static boolean lIIIllIllllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIllIllllIl(int n2) {
        return n2 > 0;
    }

    public static void ao() {
        if (m.lIIIllIllllII(Widgets.get((int)lIlIIllIll[49], (int)lIlIIllIll[50]))) {
            AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[51]];
            Widgets.get((int)lIlIIllIll[49], (int)lIlIIllIll[50]).interact(lIlIIllIlI[lIlIIllIll[52]]);
            Time.sleepTicks((int)lIlIIllIll[5]);
            0;
        }
        if (m.lIIIlllIIIIlI(Widgets.get((int)lIlIIllIll[49], (int)lIlIIllIll[50])) && m.lIIIllIlllIll(Widgets.get((int)lIlIIllIll[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIlIIllIll[1]);
            0;
            if (m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[17])) {
                Widgets.get((int)lIlIIllIll[53], (int)lIlIIllIll[1]).getChild(lIlIIllIll[1]).interact(lIlIIllIlI[lIlIIllIll[54]]);
            }
            if (m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[31]) && m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[17])) {
                Widgets.get((int)lIlIIllIll[53], (int)lIlIIllIll[1]).getChild(lIlIIllIll[2]).interact(lIlIIllIlI[lIlIIllIll[55]]);
            }
            if (m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[31]) && m.lIIIllIlllIlI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[36])) {
                Widgets.get((int)lIlIIllIll[53], (int)lIlIIllIll[1]).getChild(lIlIIllIll[3]).interact(lIlIIllIlI[lIlIIllIll[19]]);
            }
            if (m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[31])) {
                int[] nArray = new int[lIlIIllIll[1]];
                nArray[m.lIlIIllIll[0]] = lIlIIllIll[12];
                if (m.lIIIllIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIlIIllIll[53], (int)lIlIIllIll[1]).getChild(lIlIIllIll[3]).interact(lIlIIllIlI[lIlIIllIll[50]]);
                }
            }
            if (m.lIIIllIlllllI(Skills.getLevel((Skill)Skill.MAGIC), lIlIIllIll[36])) {
                int[] nArray = new int[lIlIIllIll[1]];
                nArray[m.lIlIIllIll[0]] = lIlIIllIll[12];
                if (m.lIIIllIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIlIIllIll[53], (int)lIlIIllIll[1]).getChild(lIlIIllIll[5]).interact(lIlIIllIlI[lIlIIllIll[56]]);
                }
            }
            Time.sleepTicks((int)lIlIIllIll[1]);
            0;
        }
    }

    private static void lIIIllIllIlll() {
        lIlIIllIlI = new String[lIlIIllIll[25]];
        m.lIlIIllIlI[m.lIlIIllIll[0]] = m."Buying items";
        m.lIlIIllIlI[m.lIlIIllIll[1]] = m."Finished buying items, switching back to magic training";
        m.lIlIIllIlI[m.lIlIIllIll[2]] = m."Navigating to bank";
        m.lIlIIllIlI[m.lIlIIllIll[3]] = m."Handling banking";
        m.lIlIIllIlI[m.lIlIIllIll[5]] = m."We are missing supplies, switching to BUYING";
        m.lIlIIllIlI[m.lIlIIllIll[17]] = m."Nav to cows";
        m.lIlIIllIlI[m.lIlIIllIll[24]] = m."Attacking cows";
        m.lIlIIllIlI[m.lIlIIllIll[26]] = m."Casting varrock tele";
        m.lIlIIllIlI[m.lIlIIllIll[29]] = m."Casting lumby tele";
        m.lIlIIllIlI[m.lIlIIllIll[31]] = m."Casting fally tele";
        m.lIlIIllIlI[m.lIlIIllIll[32]] = m."Casting cammy tele";
        m.lIlIIllIlI[m.lIlIIllIll[33]] = m."Alching";
        m.lIlIIllIlI[m.lIlIIllIll[34]] = m."Wield";
        m.lIlIIllIlI[m.lIlIIllIll[36]] = m."Move to alch spot";
        m.lIlIIllIlI[m.lIlIIllIll[40]] = m."Nav to cows";
        m.lIlIIllIlI[m.lIlIIllIll[41]] = m."Eat";
        m.lIlIIllIlI[m.lIlIIllIll[42]] = m."Cow";
        m.lIlIIllIlI[m.lIlIIllIll[43]] = m."cow";
        m.lIlIIllIlI[m.lIlIIllIll[45]] = m."Attacking cows";
        m.lIlIIllIlI[m.lIlIIllIll[46]] = m."Attack";
        m.lIlIIllIlI[m.lIlIIllIll[47]] = m."In combat";
        m.lIlIIllIlI[m.lIlIIllIll[51]] = m."Opening autocast";
        m.lIlIIllIlI[m.lIlIIllIll[52]] = m."Choose spell";
        m.lIlIIllIlI[m.lIlIIllIll[54]] = m."Wind Strike";
        m.lIlIIllIlI[m.lIlIIllIll[55]] = m."Water Strike";
        m.lIlIIllIlI[m.lIlIIllIll[19]] = m."Earth Strike";
        m.lIlIIllIlI[m.lIlIIllIll[50]] = m."Earth Strike";
        m.lIlIIllIlI[m.lIlIIllIll[56]] = m."Fire Strike";
        m.lIlIIllIlI[m.lIlIIllIll[72]] = m."Magic training";
        m.lIlIIllIlI[m.lIlIIllIll[74]] = m."ring of wealth (";
        m.lIlIIllIlI[m.lIlIIllIll[75]] = m."Cow";
    }

    @Override
    public int ad() {
        try {
            m.ai();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 >= 3) {
            return (0x65 ^ 0x70) & ~(0x3A ^ 0x2F);
        }
        return lIlIIllIll[67];
    }

    private static boolean lIIIlllIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    public static void aj() {
        if (m.lIIIllIlllIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (m.lIIIllIlllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[40]];
            Movement.walkTo((WorldPoint)ce);
            0;
            Time.sleepTicks((int)lIlIIllIll[1]);
            0;
        }
        if (m.lIIIllIlllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            m.ak();
        }
    }

    private static boolean lIIIllIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlllIIIIIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIllIllllII(Object object) {
        return object != null;
    }

    private static String lIIIllIllIllI(String var10, String var25) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), lIlIIllIll[29]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIlIIllIll[2], var14);
            return new String(var11.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static void ak() {
        if (m.lIIIlllIIIIIl(m.lIIIlllIIIIII(e.u(), 30.0))) {
            int[] nArray = new int[lIlIIllIll[1]];
            nArray[m.lIlIIllIll[0]] = lIlIIllIll[18];
            if (m.lIIIllIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIllIll[1]];
                nArray2[m.lIlIIllIll[0]] = lIlIIllIll[18];
                Inventory.getFirst((int[])nArray2).interact(lIlIIllIlI[lIlIIllIll[41]]);
                Time.sleepTicks((int)lIlIIllIll[1]);
                0;
            }
        }
        if (m.lIIIlllIIIIlI(Players.getLocal().getInteracting())) {
            NPC var6 = NPCs.getNearest(nPC -> {
                int n2;
                if (m.lIIIllIlllIIl(nPC.getName().contains(lIlIIllIlI[lIlIIllIll[75]]) ? 1 : 0) && m.lIIIllIlllIll(nPC.isDead() ? 1 : 0)) {
                    n2 = lIlIIllIll[1];
                    0;
                    if (2 <= ((0x39 ^ 0xA ^ (0xAD ^ 0xC1)) & (0x35 ^ 0x1F ^ (0xC6 ^ 0xB3) ^ -1))) {
                        return ((0x17 ^ 0xF ^ (0xBC ^ 0xA2)) & (0x1E ^ 0x2B ^ (0x9F ^ 0xAC) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIIllIll[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIlIIllIll[2]];
            stringArray[m.lIlIIllIll[0]] = lIlIIllIlI[lIlIIllIll[42]];
            stringArray[m.lIlIIllIll[1]] = lIlIIllIlI[lIlIIllIll[43]];
            List llllllllllllllllllllIIIIlllIIIll = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (m.lIIIlllIIIIll(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIlIIllIll[1];
                    0;
                    if (-1 > 1) {
                        return (2 & (2 ^ -1)) != 0;
                    }
                } else {
                    bl = lIlIIllIll[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIlIIllIll[1]];
            nArray[m.lIlIIllIll[0]] = lIlIIllIll[44];
            if (m.lIIIllIlllIIl(Equipment.contains((int[])nArray) ? 1 : 0) && m.lIIIllIlllIll(m.an() ? 1 : 0)) {
                m.ao();
            }
            if (m.lIIIllIllllII(var6) && m.lIIIllIlllIll(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[45]];
                var6.interact(lIlIIllIlI[lIlIIllIll[46]]);
                Time.sleepTicks((int)lIlIIllIll[3]);
                0;
            }
        }
        if (m.lIIIllIllllII(Players.getLocal().getInteracting())) {
            AccBuilderShamans.c = lIlIIllIlI[lIlIIllIll[47]];
            Time.sleepTicks((int)lIlIIllIll[1]);
            0;
        }
    }

    private static void lIIIllIlllIII() {
        lIlIIllIll = new int[82];
        m.lIlIIllIll[0] = (0x5A ^ 0x19) & ~(0xCD ^ 0x8E);
        m.lIlIIllIll[1] = 1;
        m.lIlIIllIll[2] = 2;
        m.lIlIIllIll[3] = 3;
        m.lIlIIllIll[4] = -(0xFFFFEDFB & 0x3E6C) & (0xFFFFFFEF & 0x3FFF);
        m.lIlIIllIll[5] = 0x52 ^ 0x56;
        m.lIlIIllIll[6] = 0x75 ^ 0x42;
        m.lIlIIllIll[7] = -(0xFFFFFD87 & 0x3EFA) & (0xFFFFFEBF & 0x3FEF);
        m.lIlIIllIll[8] = -(0xFFFFDFA3 & 0x727D) & (0xFFFFDFFD & 0x77FE);
        m.lIlIIllIll[9] = -(0xFFFFFDCD & 0x5FB7) & (0xFFFFDFAF & Short.MAX_VALUE);
        m.lIlIIllIll[10] = 0xFFFFB9EF & 0x4FD4;
        m.lIlIIllIll[11] = -(0xFFFFF6D3 & 0x6D6D) & (0xFFFFFE6F & 0x67FD);
        m.lIlIIllIll[12] = 0xFFFF8E6A & 0x73BF;
        m.lIlIIllIll[13] = 0xFFFF99B6 & 0x77DD;
        m.lIlIIllIll[14] = 0xFFFFAAB3 & 0x577F;
        m.lIlIIllIll[15] = 0xFFFFF37D & 0x3DD3;
        m.lIlIIllIll[16] = 0xFFFFBF6B & 0x5FDD;
        m.lIlIIllIll[17] = 0x5E ^ 0x5B;
        m.lIlIIllIll[18] = 0xFFFFDDFB & 0x237F;
        m.lIlIIllIll[19] = 0x45 ^ 0x17 ^ (0x8F ^ 0xC4);
        m.lIlIIllIll[20] = 0xFFFF9D7F & 0x67EB;
        m.lIlIIllIll[21] = -(0xFFFFB457 & 0x6FFC) & (0xFFFFB67F & 0x6FFF);
        m.lIlIIllIll[22] = -(0xFFFFBFFF & 0x6D0D) & (0xFFFFFF3D & 0x2FFF);
        m.lIlIIllIll[23] = 0x7A ^ 0x44;
        m.lIlIIllIll[24] = 0x61 ^ 0x27 ^ (0x55 ^ 0x15);
        m.lIlIIllIll[25] = 0x49 ^ 0x56;
        m.lIlIIllIll[26] = 0x43 ^ 0x2D ^ (0x58 ^ 0x31);
        m.lIlIIllIll[27] = -1;
        m.lIlIIllIll[28] = 0xA5 ^ 0xBE ^ (0x42 ^ 0x7C);
        m.lIlIIllIll[29] = 0x7E ^ 0x21 ^ (0xCF ^ 0x98);
        m.lIlIIllIll[30] = 0x51 ^ 0x7C;
        m.lIlIIllIll[31] = 0x37 ^ 0x3E;
        m.lIlIIllIll[32] = 0x71 ^ 0x7B;
        m.lIlIIllIll[33] = 148 + 118 - 118 + 32 ^ 124 + 140 - 237 + 164;
        m.lIlIIllIll[34] = 0x7E ^ 0x39 ^ (0xEE ^ 0xA5);
        m.lIlIIllIll[35] = 3 ^ 0x4D ^ (0x35 ^ 0x44);
        m.lIlIIllIll[36] = 0x38 ^ 0x3F ^ (0x21 ^ 0x2B);
        m.lIlIIllIll[37] = 0xFFFF85DD & 0x7B62;
        m.lIlIIllIll[38] = -(0xFFFFFB27 & 0x75DD) & (0xFFFFF39F & 0x7F76);
        m.lIlIIllIll[39] = 0xFFFF8DEF & 0x7FBC;
        m.lIlIIllIll[40] = 106 + 123 - 212 + 118 ^ 121 + 97 - 95 + 14;
        m.lIlIIllIll[41] = 83 + 77 - 48 + 40 ^ 29 + 111 - 42 + 53;
        m.lIlIIllIll[42] = 0x47 ^ 0x57;
        m.lIlIIllIll[43] = 0xB3 ^ 0xA2;
        m.lIlIIllIll[44] = 0xFFFF87E7 & 0x7D7D;
        m.lIlIIllIll[45] = 0x4D ^ 0x5F;
        m.lIlIIllIll[46] = 39 + 130 - 168 + 147 ^ 82 + 13 - 62 + 102;
        m.lIlIIllIll[47] = 0 ^ 0x14;
        m.lIlIIllIll[48] = -(0xFFFF9EEE & 0x7F5D) & (0xFFFFFF5F & 0x1FFF);
        m.lIlIIllIll[49] = -(0xFFFFE59F & 0x5FE7) & (0xFFFFC7DF & 0x7FF7);
        m.lIlIIllIll[50] = 0x69 ^ 0x15 ^ (0x2D ^ 0x4B);
        m.lIlIIllIll[51] = 88 + 124 - 132 + 133 ^ 83 + 23 - 30 + 116;
        m.lIlIIllIll[52] = 0x48 ^ 0x5E;
        m.lIlIIllIll[53] = (0x1B ^ 0x56) + (0xE1 ^ 0xA6) - (0x5B ^ 0x23) + (114 + 26 - 93 + 126);
        m.lIlIIllIll[54] = 0x94 ^ 0xA3 ^ (0x81 ^ 0xA1);
        m.lIlIIllIll[55] = 0x31 ^ 0x29;
        m.lIlIIllIll[56] = 0x7A ^ 0x36 ^ (0x2A ^ 0x7D);
        m.lIlIIllIll[57] = -(0xFFFFAC13 & 0x7FFD) & (0xFFFFEFFD & 0x3FFA);
        m.lIlIIllIll[58] = 148 + 109 - 256 + 169;
        m.lIlIIllIll[59] = -(0xFFFFF528 & 0x2AF7) & (0xFFFFFFBF & 0x2FFF);
        m.lIlIIllIll[60] = -(0xFFFFD5BF & 0x6A70) & (0xFFFFF7FF & 0x4FFF);
        m.lIlIIllIll[61] = 0xFFFF9BFF & 0x6FB8;
        m.lIlIIllIll[62] = 0xFFFFFCDF & 0x33F4;
        m.lIlIIllIll[63] = -(0xFFFFD3E3 & 0x6D3F) & (0xFFFFFDFE & 0x7FAF);
        m.lIlIIllIll[64] = 0x46 ^ 0x2D ^ (0x6D ^ 0x7E);
        m.lIlIIllIll[65] = 102 + 46 - 146 + 148;
        m.lIlIIllIll[66] = 0xFFFFFBDE & 0x3EB9;
        m.lIlIIllIll[67] = 208 + 62 - 82 + 54 ^ 108 + 82 - 102 + 62;
        m.lIlIIllIll[68] = 0xFFFFBEDD & 0x6FEE;
        m.lIlIIllIll[69] = -(0xFFFFCDE7 & 0x3A1A) & (0xFFFFEBEF & 0x7DB9);
        m.lIlIIllIll[70] = 0xFFFFFF47 & 0x1FFF;
        m.lIlIIllIll[71] = -(0xFFFFFD2E & 0x6AFB) & (0xFFFFFBFF & 0x6FAD);
        m.lIlIIllIll[72] = 0x1B ^ 7;
        m.lIlIIllIll[73] = 0x7F ^ 0x1C;
        m.lIlIIllIll[74] = 0xB2 ^ 0xAF;
        m.lIlIIllIll[75] = 0x9C ^ 0x82;
        m.lIlIIllIll[76] = 0xFFFF9BFE & 0x6FCF;
        m.lIlIIllIll[77] = 0xFFFF8DE3 & 0x7EFF;
        m.lIlIIllIll[78] = 0xFFFFDFFF & 0x2BD7;
        m.lIlIIllIll[79] = 0xFFFFFDEF & 0xEF9;
        m.lIlIIllIll[80] = -(0xFFFFF727 & 0x9F9) & (0xFFFF8DFE & 0x7F7B);
        m.lIlIIllIll[81] = 0xFFFFCDFF & 0x3F9F;
    }

    private static boolean lIIIlllIIIIlI(Object object) {
        return object == null;
    }

    private static String lIIIllIllIlIl(String var13, String var7) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var4 = var7.toCharArray();
        int var8 = lIlIIllIll[0];
        char[] var20 = var13.toCharArray();
        int var21 = var20.length;
        int var23 = lIlIIllIll[0];
        while (m.lIIIllIlllIlI(var23, var21)) {
            char var12 = var20[var23];
            var22.append((char)(var12 ^ var4[var8 % var4.length]));
            0;
            ++var8;
            ++var23;
            0;
            
            return null;
        }
        return String.valueOf(var22);
    }
}

