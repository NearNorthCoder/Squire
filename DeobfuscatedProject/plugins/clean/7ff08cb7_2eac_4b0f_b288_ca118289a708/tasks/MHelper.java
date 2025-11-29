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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.HHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.account.AccBuilderGWD;
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

public class MHelper
implements ab {
    
    public static  boolean ck;
    public static  List<d> bx;
    static  WorldPoint cn;
    
    public static  boolean bv;
    static  WorldPoint cm;
    static  WorldArea cl;

    private static int lllIIlIlIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[73])) {
            bl = lIIIIlllIl[1];

            if (1 <= 0) {
                return false;
            }
        } else {
            bl = lIIIIlllIl[0];
        }
        return bl;
    }

    private static boolean lllIIlIlIIll(int n2) {
        return n2 > 0;
    }

        return String.valueOf(llIlllIIllII);
    }

    private static boolean lllIIlIlIIIl(int n2) {
        return n2 == 0;
    }

    private static void Q() {
        d llIlllllIIII;
        Object llIlllllIIIl;
        if (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new DHelper(lIIIIlllIl[14], lIIIIlllIl[57], lIIIIlllIl[58]);
                bx.add(d2);

            }
            int[] nArray2 = new int[lIIIIlllIl[1]];
            nArray2[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                llIlllllIIIl = new DHelper(lIIIIlllIl[7], lIIIIlllIl[59], lIIIIlllIl[24]);
                bx.add((DHelper) lIlllllIIIl);

            }
            int[] nArray3 = new int[lIIIIlllIl[1]];
            nArray3[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                llIlllllIIIl = new DHelper(lIIIIlllIl[9], lIIIIlllIl[60], lIIIIlllIl[24]);
                bx.add((DHelper) lIlllllIIIl);

            }
            int[] nArray4 = new int[lIIIIlllIl[1]];
            nArray4[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                llIlllllIIIl = new DHelper(lIIIIlllIl[11], lIIIIlllIl[61], lIIIIlllIl[24]);
                bx.add((DHelper) lIlllllIIIl);

            }
            int[] nArray5 = new int[lIIIIlllIl[1]];
            nArray5[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                llIlllllIIIl = new DHelper(lIIIIlllIl[12], lIIIIlllIl[4], lIIIIlllIl[24]);
                bx.add((DHelper) lIlllllIIIl);

            }
            int[] nArray6 = new int[lIIIIlllIl[1]];
            nArray6[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                llIlllllIIIl = new DHelper(lIIIIlllIl[44], lIIIIlllIl[1], e.c(lIIIIlllIl[62], lIIIIlllIl[63]));
                bx.add((DHelper) lIlllllIIIl);

            }
        }
        if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
            if (m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIIIIlllIl[1]];
                nArray7[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                if (m.lllIIlIlIIII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIlllIl[61])) {
                    int[] nArray8 = new int[lIIIIlllIl[1]];
                    nArray8[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                    llIlllllIIIl = new DHelper(lIIIIlllIl[22], lIIIIlllIl[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIIIIlllIl[64]);
                    bx.add((DHelper) lIlllllIIIl);

                }
            }
            int[] nArray9 = new int[lIIIIlllIl[1]];
            nArray9[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                llIlllllIIIl = new DHelper(lIIIIlllIl[22], lIIIIlllIl[61], lIIIIlllIl[64]);
                bx.add((DHelper) lIlllllIIIl);

            }
            int[] nArray10 = new int[lIIIIlllIl[1]];
            nArray10[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
            if (m.lllIIlIIllll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIIIlllIl[1]];
                nArray11[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
                if (m.lllIIlIlIIII(Bank.getFirst((int[])nArray11).getQuantity(), lIIIIlllIl[61])) {
                    int[] nArray12 = new int[lIIIIlllIl[1]];
                    nArray12[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
                    llIlllllIIIl = new DHelper(lIIIIlllIl[23], lIIIIlllIl[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIIIIlllIl[65]);
                    bx.add((DHelper) lIlllllIIIl);

                }
            }
            int[] nArray13 = new int[lIIIIlllIl[1]];
            nArray13[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                llIlllllIIIl = new DHelper(lIIIIlllIl[23], lIIIIlllIl[61], lIIIIlllIl[65]);
                bx.add((DHelper) lIlllllIIIl);

            }
            int[] nArray14 = new int[lIIIIlllIl[1]];
            nArray14[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
            if (m.lllIIlIlIIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIIIlllIl[1]];
                nArray15[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                if (m.lllIIlIlIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    llIlllllIIIl = new DHelper(lIIIIlllIl[20], lIIIIlllIl[1], lIIIIlllIl[66]);
                    bx.add((DHelper) lIlllllIIIl);

                }
            }
            if (m.lllIIlIIllll(ck ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlllIl[1]];
                nArray16[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                if (m.lllIIlIIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlllIl[1]];
                    nArray17[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                    if (m.lllIIlIlIIII(Bank.getFirst((int[])nArray17).getQuantity(), lIIIIlllIl[61])) {
                        int[] nArray18 = new int[lIIIIlllIl[1]];
                        nArray18[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                        llIlllllIIIl = new DHelper(lIIIIlllIl[14], lIIIIlllIl[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIIIIlllIl[58]);
                        bx.add((DHelper) lIlllllIIIl);

                    }
                }
                int[] nArray19 = new int[lIIIIlllIl[1]];
                nArray19[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                if (m.lllIIlIlIIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    llIlllllIIIl = new DHelper(lIIIIlllIl[14], lIIIIlllIl[61], lIIIIlllIl[58]);
                    bx.add((DHelper) lIlllllIIIl);

                }
                int[] nArray20 = new int[lIIIIlllIl[1]];
                nArray20[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (m.lllIIlIIllll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIIIlllIl[1]];
                    nArray21[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                    if (m.lllIIlIlIIII(Bank.getFirst((int[])nArray21).getQuantity(), lIIIIlllIl[66])) {
                        int[] nArray22 = new int[lIIIIlllIl[1]];
                        nArray22[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                        llIlllllIIIl = new DHelper(lIIIIlllIl[21], lIIIIlllIl[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIIIIlllIl[24]);
                        bx.add((DHelper) lIlllllIIIl);

                    }
                }
                int[] nArray23 = new int[lIIIIlllIl[1]];
                nArray23[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (m.lllIIlIlIIIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    llIlllllIIIl = new DHelper(lIIIIlllIl[21], lIIIIlllIl[66], lIIIIlllIl[24]);
                    bx.add((DHelper) lIlllllIIIl);

                }
            }
        }
        int[] nArray = new int[lIIIIlllIl[1]];
        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
        if (m.lllIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            llIlllllIIIl = new DHelper(lIIIIlllIl[18], lIIIIlllIl[67], lIIIIlllIl[37]);
            bx.add((DHelper) lIlllllIIIl);

        }
        if (m.lllIIlIlIIIl(Bank.contains(llIlllllIIIl = item -> item.getName().toLowerCase().contains(lIIIIllIll[lIIIIlllIl[74]])) ? 1 : 0)) {
            llIlllllIIII = new DHelper(lIIIIlllIl[68], lIIIIlllIl[17], lIIIIlllIl[69]);
            bx.add(llIlllllIIII);

        }
        int[] nArray24 = new int[lIIIIlllIl[1]];
        nArray24[m.lIIIIlllIl[0]] = lIIIIlllIl[70];
        if (m.lllIIlIlIIIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
            llIlllllIIII = new DHelper(lIIIIlllIl[70], lIIIIlllIl[32], lIIIIlllIl[71]);
            bx.add(llIlllllIIII);

        }
        int[] nArray25 = new int[lIIIIlllIl[1]];
        nArray25[m.lIIIIlllIl[0]] = lIIIIlllIl[16];
        if (m.lllIIlIlIIIl(Bank.contains((int[])nArray25) ? 1 : 0)) {
            llIlllllIIII = new DHelper(lIIIIlllIl[16], lIIIIlllIl[32], lIIIIlllIl[71]);
            bx.add(llIlllllIIII);

        }
    }

    private static boolean lllIIlIlIlll(int n2) {
        return n2 < 0;
    }

    private static boolean lllIIlIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    public static boolean ap() {
        if (m.lllIIlIlIlIl(Vars.getBit((int)lIIIIlllIl[48]), lIIIIlllIl[1]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[17])) {
            return lIIIIlllIl[1];
        }
        if (m.lllIIlIlIlIl(Vars.getBit((int)lIIIIlllIl[48]), lIIIIlllIl[2]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31]) && m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[17])) {
            return lIIIIlllIl[1];
        }
        if (m.lllIIlIlIlIl(Vars.getBit((int)lIIIIlllIl[48]), lIIIIlllIl[3]) && m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[36])) {
            return lIIIIlllIl[1];
        }
        if (m.lllIIlIlIlIl(Vars.getBit((int)lIIIIlllIl[48]), lIIIIlllIl[3]) && m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31])) {
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
            if (m.lllIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIIlllIl[1];
            }
        }
        if (m.lllIIlIlIlIl(Vars.getBit((int)lIIIIlllIl[48]), lIIIIlllIl[5]) && m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[36])) {
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
            if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIIlllIl[1];
            }
        }
        return lIIIIlllIl[0];
    }

    private static boolean lllIIlIllIIl(Object object, Object object2) {
        return object == object2;
    }

    static {
        m.lllIIlIIlllI();
        m.lllIIlIIllIl();
        bx = new ArrayList<d>();
        cl = new WorldArea(lIIIIlllIl[76], lIIIIlllIl[77], lIIIIlllIl[47], lIIIIlllIl[40], lIIIIlllIl[0]);
        cm = new WorldPoint(lIIIIlllIl[78], lIIIIlllIl[79], lIIIIlllIl[0]);
        cn = new WorldPoint(lIIIIlllIl[80] + e.c(lIIIIlllIl[1], lIIIIlllIl[5]), lIIIIlllIl[81], lIIIIlllIl[0]);
    }

    private static boolean lllIIlIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIlIllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIlIllIII(Object object) {
        return object == null;
    }

    public static void al() {
        if (m.lllIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (m.lllIIlIlIIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[40]];
            Movement.walkTo((WorldPoint)cm);

            Time.sleepTicks((int)lIIIIlllIl[1]);

        }
        if (m.lllIIlIIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            m.am();
        }
    }

    @Override
    public int af() {
        try {
            m.ak();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIIIlllIl[67];
    }

    private static boolean lllIIlIlIIlI(Object object) {
        return object != null;
    }

    public static void aq() {
        if (m.lllIIlIlIIlI(Widgets.get((int)lIIIIlllIl[49], (int)lIIIIlllIl[50]))) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[51]];
            Widgets.get((int)lIIIIlllIl[49], (int)lIIIIlllIl[50]).interact(lIIIIllIll[lIIIIlllIl[52]]);
            Time.sleepTicks((int)lIIIIlllIl[5]);

        }
        if (m.lllIIlIllIII(Widgets.get((int)lIIIIlllIl[49], (int)lIIIIlllIl[50])) && m.lllIIlIlIIIl(Widgets.get((int)lIIIIlllIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIIIlllIl[1]);

            if (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[17])) {
                Widgets.get((int)lIIIIlllIl[53], (int)lIIIIlllIl[1]).getChild(lIIIIlllIl[1]).interact(lIIIIllIll[lIIIIlllIl[54]]);
            }
            if (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31]) && m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[17])) {
                Widgets.get((int)lIIIIlllIl[53], (int)lIIIIlllIl[1]).getChild(lIIIIlllIl[2]).interact(lIIIIllIll[lIIIIlllIl[55]]);
            }
            if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[36])) {
                Widgets.get((int)lIIIIlllIl[53], (int)lIIIIlllIl[1]).getChild(lIIIIlllIl[3]).interact(lIIIIllIll[lIIIIlllIl[19]]);
            }
            if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[31])) {
                int[] nArray = new int[lIIIIlllIl[1]];
                nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                if (m.lllIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIIlllIl[53], (int)lIIIIlllIl[1]).getChild(lIIIIlllIl[3]).interact(lIIIIllIll[lIIIIlllIl[50]]);
                }
            }
            if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[36])) {
                int[] nArray = new int[lIIIIlllIl[1]];
                nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIIlllIl[53], (int)lIIIIlllIl[1]).getChild(lIIIIlllIl[5]).interact(lIIIIllIll[lIIIIlllIl[56]]);
                }
            }
            Time.sleepTicks((int)lIIIIlllIl[1]);

        }
    }

    @Override
    public boolean ae() {
        return lIIIIlllIl[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
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
                                                    if (!m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19])) break block19;
                                                    int[] nArray = new int[lIIIIlllIl[1]];
                                                    nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
                                                    if (!m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIIlllIl[1]];
                                                    nArray2[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                                    if (!m.lllIIlIIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIIlllIl[1]];
                                                    nArray3[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                                    if (!m.lllIIlIIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIIlllIl[1]];
                                                    nArray4[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                                    if (!m.lllIIlIIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIIlllIl[1]];
                                                    nArray5[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                                                    if (!m.lllIIlIIllll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIIlllIl[1]];
                                                    nArray6[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                                    if (!m.lllIIlIlIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIIlllIl[1]];
                                                    nArray7[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                                    if (!m.lllIIlIIllll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIIlllIl[1];

                                                if (((0xF1 ^ 0xBC ^ (0xF1 ^ 0xB0)) & (0xBC ^ 0x94 ^ (0x17 ^ 0x33) ^ -1)) == 0) return n5 != 0;
                                                return false;
                                            }
                                            n5 = lIIIIlllIl[0];
                                            return n5 != 0;
                                        }
                                        if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19]) || !m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) break block22;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                        if (!m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIIlllIl[1]];
                                        nArray8[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                        if (!m.lllIIlIIllll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIIlllIl[1]];
                                        nArray9[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                        if (!m.lllIIlIIllll(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIIlllIl[1]];
                                        nArray10[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                                        if (!m.lllIIlIIllll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIIlllIl[1]];
                                        nArray11[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                        if (!m.lllIIlIlIIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIIlllIl[1]];
                                        nArray12[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                        if (!m.lllIIlIIllll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIIlllIl[1];

                                    if (1 != 0) return n4 != 0;
                                    return false;
                                }
                                n4 = lIIIIlllIl[0];
                                return n4 != 0;
                            }
                            if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6]) || !m.lllIIlIlIIIl(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIIlllIl[1]];
                            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            if (!m.lllIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIIlllIl[1]];
                            nArray13[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            if (!m.lllIIlIIllll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIIlllIl[1]];
                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                        if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIIlllIl[1]];
                            nArray14[m.lIIIIlllIl[0]] = lIIIIlllIl[35];
                            if (m.lllIIlIIllll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIIlllIl[1];

                                if (2 == 2) return n3 != 0;
                                return ((165 + 17 - 86 + 127 ^ 15 + 56 - 54 + 116) & (0x39 ^ 0x16 ^ (0x54 ^ 0x21) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIIIIlllIl[0];
                    return n3 != 0;
                }
                if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6]) || !m.lllIIlIIllll(ck ? 1 : 0)) return lIIIIlllIl[0];
                int[] nArray = new int[lIIIIlllIl[1]];
                nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                if (!m.lllIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIIlllIl[1]];
                nArray15[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                if (!m.lllIIlIIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
            if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlllIl[1]];
                nArray16[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (m.lllIIlIIllll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlllIl[1]];
                    nArray17[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                    if (m.lllIIlIlIlII(Inventory.getFirst((int[])nArray17).getQuantity(), lIIIIlllIl[17])) {
                        int[] nArray18 = new int[lIIIIlllIl[1]];
                        nArray18[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                        if (m.lllIIlIIllll(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIIlllIl[1]];
                            nArray19[m.lIIIIlllIl[0]] = lIIIIlllIl[35];
                            if (m.lllIIlIIllll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIIlllIl[1];

                                if ((0xF5 ^ 0xBC ^ (0x51 ^ 0x1C)) >= (51 + 20 - -43 + 67 ^ 8 + 48 - -39 + 82)) return n2 != 0;
                                return ((0xDC ^ 0xAB ^ (0x62 ^ 0xB)) & (33 + 165 - 191 + 167 ^ 132 + 5 - 104 + 143 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIIlllIl[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ao() {
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
                                                    if (!m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19])) break block19;
                                                    int[] nArray = new int[lIIIIlllIl[1]];
                                                    nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
                                                    if (!m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIIlllIl[1]];
                                                    nArray2[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                                    if (!m.lllIIlIIllll(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIIlllIl[1]];
                                                    nArray3[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                                    if (!m.lllIIlIIllll(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIIlllIl[1]];
                                                    nArray4[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                                    if (!m.lllIIlIIllll(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIIlllIl[1]];
                                                    nArray5[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                                                    if (!m.lllIIlIIllll(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIIlllIl[1]];
                                                    nArray6[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                                    if (!m.lllIIlIlIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIIlllIl[1]];
                                                    nArray7[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                                    if (!m.lllIIlIIllll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIIlllIl[1];

                                                if (3 != -1) return n5 != 0;
                                                return ((0xC7 ^ 0x9F ^ (0xE ^ 0x77)) & (54 + 157 - 49 + 3 ^ 46 + 0 - -12 + 74 ^ -1)) != 0;
                                            }
                                            n5 = lIIIIlllIl[0];
                                            return n5 != 0;
                                        }
                                        if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19]) || !m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) break block22;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                        if (!m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIIlllIl[1]];
                                        nArray8[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                        if (!m.lllIIlIIllll(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIIlllIl[1]];
                                        nArray9[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                        if (!m.lllIIlIIllll(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIIlllIl[1]];
                                        nArray10[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                                        if (!m.lllIIlIIllll(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIIlllIl[1]];
                                        nArray11[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                        if (!m.lllIIlIlIIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIIlllIl[1]];
                                        nArray12[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
                                        if (!m.lllIIlIIllll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIIlllIl[1];

                                    if (2 != -1) return n4 != 0;
                                    return ((2 ^ (0x81 ^ 0xA9)) & (0x69 ^ 0x55 ^ (3 ^ 0x15) ^ -1)) != 0;
                                }
                                n4 = lIIIIlllIl[0];
                                return n4 != 0;
                            }
                            if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6]) || !m.lllIIlIlIIIl(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIIlllIl[1]];
                            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            if (!m.lllIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIIlllIl[1]];
                            nArray13[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            if (!m.lllIIlIIllll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIIlllIl[1]];
                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                        if (m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIIlllIl[1]];
                            nArray14[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIIlllIl[1];

                                if (((0x3B ^ 6) & ~(0x74 ^ 0x49)) <= 1) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lIIIIlllIl[0];
                    return n3 != 0;
                }
                if (!m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6]) || !m.lllIIlIIllll(ck ? 1 : 0)) return lIIIIlllIl[0];
                int[] nArray = new int[lIIIIlllIl[1]];
                nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                if (!m.lllIIlIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIIlllIl[1]];
                nArray15[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                if (!m.lllIIlIIllll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
            if (m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIIlllIl[1]];
                nArray16[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (m.lllIIlIIllll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIIlllIl[1]];
                    nArray17[m.lIIIIlllIl[0]] = lIIIIlllIl[21];
                    if (m.lllIIlIlIlII(Bank.getFirst((int[])nArray17).getQuantity(), lIIIIlllIl[17])) {
                        int[] nArray18 = new int[lIIIIlllIl[1]];
                        nArray18[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                        if (m.lllIIlIIllll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIIlllIl[1]];
                            nArray19[m.lIIIIlllIl[0]] = lIIIIlllIl[23];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIIlllIl[1];

                                if (2 >= -1) return n2 != 0;
                                return ((4 ^ 0x6B ^ (0x58 ^ 0x7B)) & (0x12 ^ 0x67 ^ (0x5C ^ 0x65) ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIIlllIl[0];
        return n2 != 0;
    }

    private static boolean lllIIlIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllIIlIIllIl() {
        lIIIIllIll = new String[lIIIIlllIl[25]];
        m.lIIIIllIll[m.lIIIIlllIl[0]] = "Buying items";
        m.lIIIIllIll[m.lIIIIlllIl[1]] = "Finished buying items, switching back to magic training";
        m.lIIIIllIll[m.lIIIIlllIl[2]] = "Navigating to bank";
        m.lIIIIllIll[m.lIIIIlllIl[3]] = "Handling banking";
        m.lIIIIllIll[m.lIIIIlllIl[5]] = "We are missing supplies, switching to BUYING";
        m.lIIIIllIll[m.lIIIIlllIl[17]] = "Nav to cows";
        m.lIIIIllIll[m.lIIIIlllIl[24]] = "Attacking cows";
        m.lIIIIllIll[m.lIIIIlllIl[26]] = "Casting varrock tele";
        m.lIIIIllIll[m.lIIIIlllIl[29]] = "Casting lumby tele";
        m.lIIIIllIll[m.lIIIIlllIl[31]] = "Casting fally tele";
        m.lIIIIllIll[m.lIIIIlllIl[32]] = "Casting cammy tele";
        m.lIIIIllIll[m.lIIIIlllIl[33]] = "Alching";
        m.lIIIIllIll[m.lIIIIlllIl[34]] = "Wield";
        m.lIIIIllIll[m.lIIIIlllIl[36]] = "Move to alch spot";
        m.lIIIIllIll[m.lIIIIlllIl[40]] = "Nav to cows";
        m.lIIIIllIll[m.lIIIIlllIl[41]] = "Eat";
        m.lIIIIllIll[m.lIIIIlllIl[42]] = "Cow";
        m.lIIIIllIll[m.lIIIIlllIl[43]] = "cow";
        m.lIIIIllIll[m.lIIIIlllIl[45]] = "Attacking cows";
        m.lIIIIllIll[m.lIIIIlllIl[46]] = "Attack";
        m.lIIIIllIll[m.lIIIIlllIl[47]] = "In combat";
        m.lIIIIllIll[m.lIIIIlllIl[51]] = "Opening autocast";
        m.lIIIIllIll[m.lIIIIlllIl[52]] = "Choose spell";
        m.lIIIIllIll[m.lIIIIlllIl[54]] = "Wind Strike";
        m.lIIIIllIll[m.lIIIIlllIl[55]] = "Water Strike";
        m.lIIIIllIll[m.lIIIIlllIl[19]] = "Earth Strike";
        m.lIIIIllIll[m.lIIIIlllIl[50]] = "Earth Strike";
        m.lIIIIllIll[m.lIIIIlllIl[56]] = "Fire Strike";
        m.lIIIIllIll[m.lIIIIlllIl[72]] = "Magic training";
        m.lIIIIllIll[m.lIIIIlllIl[74]] = "ring of wealth (";
        m.lIIIIllIll[m.lIIIIlllIl[75]] = "Cow";
    }

    private static void am() {
        if (m.lllIIlIlIlll(m.lllIIlIlIllI(e.w(), 30.0))) {
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
            if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIIlllIl[1]];
                nArray2[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                Inventory.getFirst((int[])nArray2).interact(lIIIIllIll[lIIIIlllIl[41]]);
                Time.sleepTicks((int)lIIIIlllIl[1]);

            }
        }
        if (m.lllIIlIllIII(Players.getLocal().getInteracting())) {
            NPC llIlllllIlIl = NPCs.getNearest(nPC -> {
                int n2;
                if (m.lllIIlIIllll(nPC.getName().contains(lIIIIllIll[lIIIIlllIl[75]]) ? 1 : 0) && m.lllIIlIlIIIl(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIIIlllIl[1];

                    if (-1 >= 1) {
                        return ((123 + 65 - 110 + 155 ^ 19 + 141 - 122 + 141) & (0xAF ^ 0x9C ^ (0xF2 ^ 0x9B) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIIIlllIl[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIIIIlllIl[2]];
            stringArray[m.lIIIIlllIl[0]] = lIIIIllIll[lIIIIlllIl[42]];
            stringArray[m.lIIIIlllIl[1]] = lIIIIllIll[lIIIIlllIl[43]];
            List llIlllllIlII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (m.lllIIlIllIIl(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIIIIlllIl[1];

                    if (3 == 0) {
                        return ((7 + 70 - -16 + 92 ^ 115 + 124 - 173 + 66) & (0x33 ^ 0x36 ^ (0xBC ^ 0x84) ^ -1)) != 0;
                    }
                } else {
                    bl = lIIIIlllIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIIIIlllIl[1]];
            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[44];
            if (m.lllIIlIIllll(Equipment.contains((int[])nArray) ? 1 : 0) && m.lllIIlIlIIIl(m.ap() ? 1 : 0)) {
                m.aq();
            }
            if (m.lllIIlIlIIlI(llIlllllIlIl) && m.lllIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[45]];
                llIlllllIlIl.interact(lIIIIllIll[lIIIIlllIl[46]]);
                Time.sleepTicks((int)lIIIIlllIl[3]);

            }
        }
        if (m.lllIIlIlIIlI(Players.getLocal().getInteracting())) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[47]];
            Time.sleepTicks((int)lIIIIlllIl[1]);

        }
    }

    private static boolean lllIIlIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return lIIIIllIll[lIIIIlllIl[72]];
    }

    public static void ak() {
        if (m.lllIIlIIllll(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[0]];
            b.a(bx);
            if (m.lllIIlIlIIII(bx.size(), lIIIIlllIl[1])) {
                System.out.println(lIIIIllIll[lIIIIlllIl[1]]);
                bv = lIIIIlllIl[0];
            }
        }
        if (m.lllIIlIlIIIl(bv ? 1 : 0)) {
            BankLocation llIllllllIlI;
            if (m.lllIIlIlIIIl(m.an() ? 1 : 0)) {
                llIllllllIlI = BankLocation.getNearest();
                if (m.lllIIlIlIIlI(llIllllllIlI) && m.lllIIlIlIIIl(llIllllllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[2]];
                    a.a(llIllllllIlI);
                }
                if (m.lllIIlIlIIlI(llIllllllIlI) && m.lllIIlIIllll(llIllllllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[3]];
                    if (m.lllIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIlllIl[4]);

                    }
                    if (m.lllIIlIIllll(Bank.isOpen() ? 1 : 0)) {
                        if (m.lllIIlIlIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIlllIl[5]);

                        }
                        while (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6]) && m.lllIIlIlIIIl(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks((int)lIIIIlllIl[1]);

                            if ((0x7C ^ 0x79) > 0) continue;
                            return;
                        }
                        if (m.lllIIlIlIIIl(m.ao() ? 1 : 0)) {
                            m.Q();
                            System.out.println(lIIIIllIll[lIIIIlllIl[5]]);
                            bv = lIIIIlllIl[1];
                            return;
                        }
                        if (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
                            int[] nArray = new int[lIIIIlllIl[1]];
                            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIIIlllIl[1]];
                                nArray2[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray2), lIIIIlllIl[1])) {
                                    Bank.withdraw((int)lIIIIlllIl[7], (int)lIIIIlllIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[7];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];

                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);

                                }
                            }
                            int[] nArray3 = new int[lIIIIlllIl[1]];
                            nArray3[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIIIlllIl[1]];
                                nArray4[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray4), lIIIIlllIl[1])) {
                                    Bank.withdraw((int)lIIIIlllIl[9], (int)lIIIIlllIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[9];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];

                                            if (((0xE0 ^ 0xAC) & ~(0x3A ^ 0x76)) > 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);

                                }
                            }
                            int[] nArray5 = new int[lIIIIlllIl[1]];
                            nArray5[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIIlllIl[1]];
                                nArray6[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray6), lIIIIlllIl[1])) {
                                    Bank.withdraw((int)lIIIIlllIl[11], (int)lIIIIlllIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[11];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];

                                            if (2 < 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);

                                }
                            }
                            int[] nArray7 = new int[lIIIIlllIl[1]];
                            nArray7[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIIlllIl[1]];
                                nArray8[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray8), lIIIIlllIl[1])) {
                                    Bank.withdraw((int)lIIIIlllIl[12], (int)lIIIIlllIl[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[12];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];

                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);

                                }
                            }
                            int[] nArray9 = new int[lIIIIlllIl[1]];
                            nArray9[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIIlllIl[1]];
                                nArray10[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray10), lIIIIlllIl[1])) {
                                    Bank.withdraw((int)lIIIIlllIl[14], (int)lIIIIlllIl[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[14];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];

                                            if (2 == 0) {
                                                return ((0x4C ^ 7 ^ (0xC2 ^ 0xAB)) & (0xBC ^ 0x9B ^ (0x28 ^ 0x2D) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);

                                }
                            }
                            int[] nArray11 = new int[lIIIIlllIl[1]];
                            nArray11[m.lIIIIlllIl[0]] = lIIIIlllIl[15];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIIIlllIl[1]];
                                nArray12[m.lIIIIlllIl[0]] = lIIIIlllIl[15];
                                if (m.lllIIlIlIIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIIIlllIl[15], (int)lIIIIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIIIlllIl[4]);

                                }
                            }
                            Bank.withdraw((int)lIIIIlllIl[16], (int)lIIIIlllIl[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIIIIlllIl[1]];
                            nArray13[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                            if (m.lllIIlIIllll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIIIIlllIl[1]];
                                nArray14[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                                if (m.lllIIlIlIIII(Inventory.getCount((int[])nArray14), lIIIIlllIl[1]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19])) {
                                    Bank.withdrawAll((int)lIIIIlllIl[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIIlllIl[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIIlllIl[1]];
                                        nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[18];
                                        if (m.lllIIlIlIIll(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIIlllIl[1];

                                            if ((0x26 ^ 0x22) == -1) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIIlllIl[0];
                                        }
                                        return bl;
                                    }, (int)lIIIIlllIl[4]);

                                }
                            }
                        }
                        if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
                            int[] nArray = new int[lIIIIlllIl[1]];
                            nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            if (m.lllIIlIlIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIIIlllIl[20], (int)lIIIIlllIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlllIl[1]);

                            }
                            if (m.lllIIlIIllll(ck ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIIIlllIl[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlllIl[1]);

                                Bank.withdrawAll((int)lIIIIlllIl[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIIlllIl[1]);

                            }
                            Bank.withdrawAll((int)lIIIIlllIl[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIIIlllIl[1]);

                            Bank.withdrawAll((int)lIIIIlllIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIIIlllIl[1]);

                        }
                    }
                }
            }
            if (m.lllIIlIIllll(m.an() ? 1 : 0)) {
                if (m.lllIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19])) {
                    if (m.lllIIlIlIIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[17]];
                        Movement.walkTo((WorldPoint)cm);

                        Time.sleepTicks((int)lIIIIlllIl[1]);

                    }
                    if (m.lllIIlIIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[24]];
                        m.am();
                    }
                }
                if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[19]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[25])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[26]];
                    if (m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIIIIlllIl[1]);

                    }
                }
                if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[25]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[28])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[29]];
                    if (m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIIIlllIl[1]);

                    }
                }
                if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[28]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[30])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[31]];
                    if (m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIIIlllIl[1]);

                    }
                }
                if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[30]) && m.lllIIlIlIIII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[32]];
                    if (m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIIIlllIl[1]);

                    }
                }
                if (m.lllIIlIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lIIIIlllIl[6])) {
                    int llIllllllIII;
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[33]];
                    int[] nArray = new int[lIIIIlllIl[1]];
                    nArray[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                    if (m.lllIIlIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIIIIlllIl[1]];
                        nArray15[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                        if (m.lllIIlIlIIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIIIIlllIl[1]];
                            nArray16[m.lIIIIlllIl[0]] = lIIIIlllIl[20];
                            Inventory.getFirst((int[])nArray16).interact(lIIIIllIll[lIIIIlllIl[34]]);
                            Time.sleepTicks((int)lIIIIlllIl[1]);

                        }
                    }
                    if (m.lllIIlIIllll(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIIIIlllIl[1]];
                    nArray17[m.lIIIIlllIl[0]] = lIIIIlllIl[22];
                    llIllllllIlI = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIIIIlllIl[1]];
                    nArray18[m.lIIIIlllIl[0]] = lIIIIlllIl[35];
                    Item llIllllllIIl = Inventory.getFirst((int[])nArray18);
                    if (m.lllIIlIlIIIl(ck ? 1 : 0)) {
                        if (m.lllIIlIlIIIl(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[36]];
                            Movement.walkTo((WorldPoint)cn);

                            Time.sleepTicks((int)lIIIIlllIl[1]);

                        }
                        if (m.lllIIlIIllll(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0) && m.lllIIlIlIIlI(llIllllllIlI) && m.lllIIlIlIIlI(llIllllllIIl)) {
                            llIllllllIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llIllllllIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (m.lllIIlIllIlI(Skills.getExperience((Skill)Skill.MAGIC), llIllllllIII)) {
                                    bl = lIIIIlllIl[1];

                                    if (-(184 + 55 - 113 + 72 ^ 132 + 174 - 290 + 178) >= 0) {
                                        return ((0x1F ^ 0xD ^ (0x2A ^ 0x1A)) & (101 + 93 - 84 + 24 ^ 128 + 43 - 30 + 23 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIIlllIl[0];
                                }
                                return bl;
                            }, (int)lIIIIlllIl[8]);

                            Time.sleep((long)e.c(lIIIIlllIl[37], lIIIIlllIl[38]));

                        }
                    }
                    if (m.lllIIlIIllll(ck ? 1 : 0)) {
                        if (m.lllIIlIlIIlI(llIllllllIlI) && m.lllIIlIlIIlI(llIllllllIIl) && m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                            llIllllllIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)llIllllllIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (m.lllIIlIllIlI(Skills.getExperience((Skill)Skill.MAGIC), llIllllllIII)) {
                                    bl = lIIIIlllIl[1];

                                    if (-1 > 3) {
                                        return ((0x78 ^ 0x75 ^ (0x65 ^ 0x4E)) & (0x39 ^ 0x75 ^ (0x48 ^ 0x22) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIIlllIl[0];
                                }
                                return bl;
                            }, (int)lIIIIlllIl[8]);

                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (m.lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                                bl = lIIIIlllIl[1];

                                if (2 == 0) {
                                    return ((2 ^ 0x6C ^ (0xFF ^ 0x9F)) & (0xF7 ^ 0x80 ^ (0x4F ^ 0x36) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIIlllIl[0];
                            }
                            return bl;
                        }, (int)lIIIIlllIl[39]);

                    }
                }
            }
        }
    }
}

