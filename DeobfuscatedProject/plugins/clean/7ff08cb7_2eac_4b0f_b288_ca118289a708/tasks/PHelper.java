/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.HHelper;
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
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.World;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class PHelper
implements ab {
    
    public static  WorldPoint cR;
    public static  int[] cM;
    public static  List<d> bx;
    public static  WorldArea cP;
    public static  WorldArea cO;
    public static  boolean cL;
    public static  WorldArea cN;
    public static  WorldPoint cS;
    public static  WorldPoint cm;
    
    public static  WorldPoint cQ;
    public static  WorldArea cl;
    public static  boolean bv;

    private static boolean llIIlIlIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    public static void aJ() {
        block22: {
            block24: {
                block23: {
                    if (p.llIIlIIlllll(bv ? 1 : 0)) {
                        AccBuilderGWD.c = lllIllIIl[lllIllIlI[0]];
                        b.a(bx);
                        if (p.llIIlIlIIIII(bx.size(), lllIllIlI[1])) {
                            System.out.println(lllIllIIl[lllIllIlI[1]]);
                            bv = lllIllIlI[0];
                        }
                    }
                    if (!p.llIIlIlIIIIl(bv ? 1 : 0) || p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[2]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[3]) && !p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[4])) break block22;
                    if (p.llIIlIlIIIIl(p.aM() ? 1 : 0)) {
                        BankLocation llIlIlIllIIlI = BankLocation.getNearest();
                        if (p.llIIlIlIIIll(llIlIlIllIIlI) && p.llIIlIlIIIIl(llIlIlIllIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIllIIl[lllIllIlI[5]];
                            a.a(llIlIlIllIIlI);
                        }
                        if (p.llIIlIlIIIll(llIlIlIllIIlI) && p.llIIlIIlllll(llIlIlIllIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIllIIl[lllIllIlI[6]];
                            if (p.llIIlIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIllIlI[7]);

                            }
                            if (p.llIIlIIlllll(Bank.isOpen() ? 1 : 0)) {
                                if (p.llIIlIlIIlII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllIllIlI[1]);

                                }
                                if (p.llIIlIlIIlII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllIllIlI[5]);

                                }
                                if (p.llIIlIlIIIIl(p.aN() ? 1 : 0)) {
                                    p.Q();
                                    System.out.println(lllIllIIl[lllIllIlI[8]]);
                                    bv = lllIllIlI[1];
                                    return;
                                }
                                if (p.llIIlIlIIIIl(cL ? 1 : 0)) {
                                    h.X();
                                    cL = lllIllIlI[1];
                                }
                                while (p.llIIlIlIIIIl(h.bw ? 1 : 0) && p.llIIlIlIIIIl(AccBuilderGWD.d ? 1 : 0)) {
                                    h.d(lllIllIIl[lllIllIlI[9]]);
                                    Time.sleepTicks((int)lllIllIlI[1]);

                                    if (1 != 3) continue;
                                    return;
                                }
                                a.a(cM, lllIllIlI[1]);
                                a.a(lllIllIlI[10], lllIllIlI[11]);
                                a.b(f.bc, lllIllIlI[1]);
                                if (p.llIIlIIlllll(Inventory.contains((int[])cM) ? 1 : 0)) {
                                    a.a(lllIllIlI[12], lllIllIlI[13]);
                                }
                            }
                        }
                    }
                    if (!p.llIIlIIlllll(p.aM() ? 1 : 0)) break block22;
                    p.aL();
                    cL = lllIllIlI[0];
                    if (p.llIIlIlIIIlI(Movement.getRunEnergy(), lllIllIlI[4]) && p.llIIlIlIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    int[] nArray = new int[lllIllIlI[1]];
                    nArray[p.lllIllIlI[0]] = lllIllIlI[14];
                    if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray2 = new int[lllIllIlI[1]];
                    nArray2[p.lllIllIlI[0]] = lllIllIlI[15];
                    if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block23;
                    int[] nArray3 = new int[lllIllIlI[1]];
                    nArray3[p.lllIllIlI[0]] = lllIllIlI[16];
                    if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray3) ? 1 : 0)) break block23;
                    int[] nArray4 = new int[lllIllIlI[1]];
                    nArray4[p.lllIllIlI[0]] = lllIllIlI[17];
                    if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray4) ? 1 : 0)) break block23;
                    int[] nArray5 = new int[lllIllIlI[1]];
                    nArray5[p.lllIllIlI[0]] = lllIllIlI[18];
                    if (!p.llIIlIIlllll(Equipment.contains((int[])nArray5) ? 1 : 0)) break block24;
                }
                p.aO();
            }
            if (p.llIIlIlIIlIl(p.llIIlIIllllI(e.w(), 45.0))) {
                int[] nArray = new int[lllIllIlI[1]];
                nArray[p.lllIllIlI[0]] = lllIllIlI[12];
                if (p.llIIlIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lllIllIlI[1]];
                    nArray6[p.lllIllIlI[0]] = lllIllIlI[12];
                    Inventory.getFirst((int[])nArray6).interact(lllIllIIl[lllIllIlI[19]]);
                    Time.sleepTicks((int)lllIllIlI[1]);

                }
            }
            if (p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[20]) && p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[20])) {
                p.aK();
            }
            if (p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[21]) && !p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[20]) || p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[21]) && !p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[20]) || p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[21]) && !p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[20]) || p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[20]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[20])) {
                p.al();
            }
            if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[21]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[21]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[21])) {
                p.aj();
            }
        }
    }

    private static boolean llIIlIIlllll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aM() {
        int n2;
        block5: {
            block9: {
                block8: {
                    block7: {
                        block6: {
                            block4: {
                                int[] nArray = new int[lllIllIlI[1]];
                                nArray[p.lllIllIlI[0]] = lllIllIlI[14];
                                if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block4;
                                int[] nArray2 = new int[lllIllIlI[1]];
                                nArray2[p.lllIllIlI[0]] = lllIllIlI[14];
                                if (!p.llIIlIIlllll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                            }
                            int[] nArray = new int[lllIllIlI[1]];
                            nArray[p.lllIllIlI[0]] = lllIllIlI[15];
                            if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block6;
                            int[] nArray3 = new int[lllIllIlI[1]];
                            nArray3[p.lllIllIlI[0]] = lllIllIlI[15];
                            if (!p.llIIlIIlllll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block5;
                        }
                        int[] nArray = new int[lllIllIlI[1]];
                        nArray[p.lllIllIlI[0]] = lllIllIlI[16];
                        if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                        int[] nArray4 = new int[lllIllIlI[1]];
                        nArray4[p.lllIllIlI[0]] = lllIllIlI[16];
                        if (!p.llIIlIIlllll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block5;
                    }
                    int[] nArray = new int[lllIllIlI[1]];
                    nArray[p.lllIllIlI[0]] = lllIllIlI[17];
                    if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                    int[] nArray5 = new int[lllIllIlI[1]];
                    nArray5[p.lllIllIlI[0]] = lllIllIlI[17];
                    if (!p.llIIlIIlllll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block5;
                }
                int[] nArray = new int[lllIllIlI[1]];
                nArray[p.lllIllIlI[0]] = lllIllIlI[18];
                if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lllIllIlI[1]];
                nArray6[p.lllIllIlI[0]] = lllIllIlI[18];
                if (!p.llIIlIIlllll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block5;
            }
            int[] nArray = new int[lllIllIlI[1]];
            nArray[p.lllIllIlI[0]] = lllIllIlI[12];
            if (p.llIIlIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllIllIlI[1];

                if (((0xFD ^ 0xBF) & ~(0x69 ^ 0x2B)) == 0) return n2 != 0;
                return false;
            }
        }
        n2 = lllIllIlI[0];
        return n2 != 0;
    }

    public static void aL() {
        e.F();
        if (p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[9])) {
            int[] nArray = new int[lllIllIlI[1]];
            nArray[p.lllIllIlI[0]] = lllIllIlI[14];
            if (p.llIIlIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIllIlI[1]];
                nArray2[p.lllIllIlI[0]] = lllIllIlI[14];
                Inventory.getFirst((int[])nArray2).interact(lllIllIIl[lllIllIlI[47]]);
            }
        }
        if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[9]) && p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[20])) {
            int[] nArray = new int[lllIllIlI[1]];
            nArray[p.lllIllIlI[0]] = lllIllIlI[15];
            if (p.llIIlIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lllIllIlI[1]];
                nArray3[p.lllIllIlI[0]] = lllIllIlI[15];
                Inventory.getFirst((int[])nArray3).interact(lllIllIIl[lllIllIlI[20]]);
            }
        }
        if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[20]) && p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[21])) {
            int[] nArray = new int[lllIllIlI[1]];
            nArray[p.lllIllIlI[0]] = lllIllIlI[16];
            if (p.llIIlIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lllIllIlI[1]];
                nArray4[p.lllIllIlI[0]] = lllIllIlI[16];
                Inventory.getFirst((int[])nArray4).interact(lllIllIIl[lllIllIlI[48]]);
            }
        }
        if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[21]) && p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[49])) {
            int[] nArray = new int[lllIllIlI[1]];
            nArray[p.lllIllIlI[0]] = lllIllIlI[17];
            if (p.llIIlIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[lllIllIlI[1]];
                nArray5[p.lllIllIlI[0]] = lllIllIlI[17];
                Inventory.getFirst((int[])nArray5).interact(lllIllIIl[lllIllIlI[50]]);
            }
        }
        if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[49])) {
            int[] nArray = new int[lllIllIlI[1]];
            nArray[p.lllIllIlI[0]] = lllIllIlI[18];
            if (p.llIIlIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray6 = new int[lllIllIlI[1]];
                nArray6[p.lllIllIlI[0]] = lllIllIlI[18];
                Inventory.getFirst((int[])nArray6).interact(lllIllIIl[lllIllIlI[51]]);
            }
        }
    }

    @Override
    public boolean ae() {
        return lllIllIlI[0];
    }

    public static void al() {
        if (p.llIIlIIlllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (p.llIIlIlIIIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[52]];
            Movement.walkTo((WorldPoint)cS);

            Time.sleepTicks((int)lllIllIlI[1]);

        }
        if (p.llIIlIIlllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[53]];
            p.am();
        }
    }

    private static boolean llIIlIlIIlII(int n2) {
        return n2 > 0;
    }

    private static boolean llIIlIlIlIII(Object object) {
        return object == null;
    }

    public static void aK() {
        if (p.llIIlIIlllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (p.llIIlIlIIIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[41]];
            Movement.walkTo((WorldPoint)new WorldPoint(lllIllIlI[42], lllIllIlI[43], lllIllIlI[0]));

            Time.sleepTicks((int)lllIllIlI[1]);

        }
        if (p.llIIlIIlllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[3]];
            p.am();
        }
    }

    private static boolean llIIlIlIllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIlIlIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    public static void aO() {
        if (p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[8]) && p.llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[8]) && p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[19]) && p.llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[8]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[19]) && p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[36]) && p.llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[37]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[19]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[36]) && p.llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[37]) && p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[37]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[36]) && p.llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[37]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[37]) && p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[40]) && p.llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[2]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[37]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[40]) && p.llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[2]) && p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[2]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[40]) && p.llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[2]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[2]) && p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[4]) && p.llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (p.llIIlIlIIIII(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[3]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[2]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[4]) && p.llIIlIlIlIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
    }

    private static boolean llIIlIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIlIlIlI(Object object, Object object2) {
        return object != object2;
    }

    private static int llIIlIIllllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        p.llIIlIIlllIl();
        p.llIIlIIllIIl();
        bx = new ArrayList<d>();
        int[] nArray = new int[lllIllIlI[9]];
        nArray[p.lllIllIlI[0]] = lllIllIlI[14];
        nArray[p.lllIllIlI[1]] = lllIllIlI[15];
        nArray[p.lllIllIlI[5]] = lllIllIlI[17];
        nArray[p.lllIllIlI[6]] = lllIllIlI[16];
        nArray[p.lllIllIlI[8]] = lllIllIlI[18];
        cM = nArray;
        cN = new WorldArea(lllIllIlI[74], lllIllIlI[75], lllIllIlI[40], lllIllIlI[40], lllIllIlI[0]);
        cO = new WorldArea(lllIllIlI[76], lllIllIlI[77], lllIllIlI[48], lllIllIlI[44], lllIllIlI[0]);
        cP = new WorldArea(lllIllIlI[78], lllIllIlI[79], lllIllIlI[80], lllIllIlI[21], lllIllIlI[0]);
        cQ = new WorldPoint(lllIllIlI[81], lllIllIlI[82], lllIllIlI[0]);
        cm = new WorldPoint(lllIllIlI[83], lllIllIlI[75], lllIllIlI[0]);
        cR = new WorldPoint(lllIllIlI[84], lllIllIlI[85], lllIllIlI[0]);
        cl = new WorldArea(lllIllIlI[86], lllIllIlI[87], lllIllIlI[67], lllIllIlI[53], lllIllIlI[0]);
        cS = new WorldPoint(lllIllIlI[88], lllIllIlI[43], lllIllIlI[0]);
    }

    public static void Q() {
        d llIlIlIlIIIII;
        int[] nArray = new int[lllIllIlI[1]];
        nArray[p.lllIllIlI[0]] = lllIllIlI[12];
        if (p.llIIlIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lllIllIlI[12], lllIllIlI[13], lllIllIlI[54]);
            bx.add(d2);

        }
        int[] nArray2 = new int[lllIllIlI[1]];
        nArray2[p.lllIllIlI[0]] = lllIllIlI[18];
        if (p.llIIlIlIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIlIlIlIIIII = new DHelper(lllIllIlI[18], lllIllIlI[1], lllIllIlI[55]);
            bx.add(llIlIlIlIIIII);

        }
        int[] nArray3 = new int[lllIllIlI[1]];
        nArray3[p.lllIllIlI[0]] = lllIllIlI[14];
        if (p.llIIlIlIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIlIlIlIIIII = new DHelper(lllIllIlI[14], lllIllIlI[1], lllIllIlI[7]);
            bx.add(llIlIlIlIIIII);

        }
        int[] nArray4 = new int[lllIllIlI[1]];
        nArray4[p.lllIllIlI[0]] = lllIllIlI[15];
        if (p.llIIlIlIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIlIlIlIIIII = new DHelper(lllIllIlI[15], lllIllIlI[1], lllIllIlI[7]);
            bx.add(llIlIlIlIIIII);

        }
        int[] nArray5 = new int[lllIllIlI[1]];
        nArray5[p.lllIllIlI[0]] = lllIllIlI[16];
        if (p.llIIlIlIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llIlIlIlIIIII = new DHelper(lllIllIlI[16], lllIllIlI[1], lllIllIlI[56]);
            bx.add(llIlIlIlIIIII);

        }
        int[] nArray6 = new int[lllIllIlI[1]];
        nArray6[p.lllIllIlI[0]] = lllIllIlI[17];
        if (p.llIIlIlIIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llIlIlIlIIIII = new DHelper(lllIllIlI[17], lllIllIlI[1], lllIllIlI[56]);
            bx.add(llIlIlIlIIIII);

        }
    }

    private static void llIIlIIllIIl() {
        lllIllIIl = new String[lllIllIlI[89]];
        p.lllIllIIl[p.lllIllIlI[0]] = "Buying items";
        p.lllIllIIl[p.lllIllIlI[1]] = "Finished buying items, switching back to melee training";
        p.lllIllIIl[p.lllIllIlI[5]] = "Navigating to bank";
        p.lllIllIIl[p.lllIllIlI[6]] = "Handling banking";
        p.lllIllIIl[p.lllIllIlI[8]] = "We are missing supplies, switching to BUYING";
        p.lllIllIIl[p.lllIllIlI[9]] = "f2pmelee";
        p.lllIllIIl[p.lllIllIlI[19]] = "Eat";
        p.lllIllIIl[p.lllIllIlI[36]] = "Nav to hill giants";
        p.lllIllIIl[p.lllIllIlI[37]] = "Run to hop tile";
        p.lllIllIIl[p.lllIllIlI[38]] = "World hopping";
        p.lllIllIIl[p.lllIllIlI[39]] = "In combat";
        p.lllIllIIl[p.lllIllIlI[40]] = "Attacking hill giant";
        p.lllIllIIl[p.lllIllIlI[2]] = "Attack";
        p.lllIllIIl[p.lllIllIlI[41]] = "Nav to cows";
        p.lllIllIIl[p.lllIllIlI[3]] = "Attacking cows";
        p.lllIllIIl[p.lllIllIlI[4]] = "Eat";
        p.lllIllIIl[p.lllIllIlI[44]] = "cow";
        p.lllIllIIl[p.lllIllIlI[45]] = "Attack";
        p.lllIllIIl[p.lllIllIlI[46]] = "Attack";
        p.lllIllIIl[p.lllIllIlI[47]] = "Wield";
        p.lllIllIIl[p.lllIllIlI[20]] = "Wield";
        p.lllIllIIl[p.lllIllIlI[48]] = "Wield";
        p.lllIllIIl[p.lllIllIlI[50]] = "Wield";
        p.lllIllIIl[p.lllIllIlI[51]] = "Wield";
        p.lllIllIIl[p.lllIllIlI[52]] = "Nav to cows";
        p.lllIllIIl[p.lllIllIlI[53]] = "Attacking cows";
        p.lllIllIIl[p.lllIllIlI[57]] = "12/14/15 Melee";
        p.lllIllIIl[p.lllIllIlI[59]] = "total";
        p.lllIllIIl[p.lllIllIlI[60]] = "PvP";
        p.lllIllIIl[p.lllIllIlI[61]] = "PvP";
        p.lllIllIIl[p.lllIllIlI[21]] = "High";
        p.lllIllIIl[p.lllIllIlI[64]] = "Leagues";
        p.lllIllIIl[p.lllIllIlI[65]] = "Beta";
        p.lllIllIIl[p.lllIllIlI[66]] = "beta";
        p.lllIllIIl[p.lllIllIlI[67]] = "Deadman";
        p.lllIllIIl[p.lllIllIlI[68]] = "Deadman";
        p.lllIllIIl[p.lllIllIlI[69]] = "Speedrunning";
        p.lllIllIIl[p.lllIllIlI[70]] = "total";
        p.lllIllIIl[p.lllIllIlI[24]] = "Beta";
        p.lllIllIIl[p.lllIllIlI[25]] = "calf";
        p.lllIllIIl[p.lllIllIlI[49]] = "Cow";
        p.lllIllIIl[p.lllIllIlI[71]] = "Attack";
        p.lllIllIIl[p.lllIllIlI[72]] = "Hill";
        p.lllIllIIl[p.lllIllIlI[73]] = "Hill";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aN() {
        int n2;
        block3: {
            block8: {
                block7: {
                    block6: {
                        block5: {
                            block4: {
                                block2: {
                                    int[] nArray = new int[lllIllIlI[1]];
                                    nArray[p.lllIllIlI[0]] = lllIllIlI[14];
                                    if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block2;
                                    int[] nArray2 = new int[lllIllIlI[1]];
                                    nArray2[p.lllIllIlI[0]] = lllIllIlI[14];
                                    if (!p.llIIlIlIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                                    int[] nArray3 = new int[lllIllIlI[1]];
                                    nArray3[p.lllIllIlI[0]] = lllIllIlI[14];
                                    if (!p.llIIlIIlllll(Bank.contains((int[])nArray3) ? 1 : 0)) break block3;
                                }
                                int[] nArray = new int[lllIllIlI[1]];
                                nArray[p.lllIllIlI[0]] = lllIllIlI[15];
                                if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block4;
                                int[] nArray4 = new int[lllIllIlI[1]];
                                nArray4[p.lllIllIlI[0]] = lllIllIlI[15];
                                if (!p.llIIlIlIIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
                                int[] nArray5 = new int[lllIllIlI[1]];
                                nArray5[p.lllIllIlI[0]] = lllIllIlI[15];
                                if (!p.llIIlIIlllll(Bank.contains((int[])nArray5) ? 1 : 0)) break block3;
                            }
                            int[] nArray = new int[lllIllIlI[1]];
                            nArray[p.lllIllIlI[0]] = lllIllIlI[16];
                            if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                            int[] nArray6 = new int[lllIllIlI[1]];
                            nArray6[p.lllIllIlI[0]] = lllIllIlI[16];
                            if (!p.llIIlIlIIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block5;
                            int[] nArray7 = new int[lllIllIlI[1]];
                            nArray7[p.lllIllIlI[0]] = lllIllIlI[16];
                            if (!p.llIIlIIlllll(Bank.contains((int[])nArray7) ? 1 : 0)) break block3;
                        }
                        int[] nArray = new int[lllIllIlI[1]];
                        nArray[p.lllIllIlI[0]] = lllIllIlI[17];
                        if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block6;
                        int[] nArray8 = new int[lllIllIlI[1]];
                        nArray8[p.lllIllIlI[0]] = lllIllIlI[17];
                        if (!p.llIIlIlIIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block6;
                        int[] nArray9 = new int[lllIllIlI[1]];
                        nArray9[p.lllIllIlI[0]] = lllIllIlI[17];
                        if (!p.llIIlIIlllll(Bank.contains((int[])nArray9) ? 1 : 0)) break block3;
                    }
                    int[] nArray = new int[lllIllIlI[1]];
                    nArray[p.lllIllIlI[0]] = lllIllIlI[18];
                    if (!p.llIIlIlIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                    int[] nArray10 = new int[lllIllIlI[1]];
                    nArray10[p.lllIllIlI[0]] = lllIllIlI[18];
                    if (!p.llIIlIlIIIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block7;
                    int[] nArray11 = new int[lllIllIlI[1]];
                    nArray11[p.lllIllIlI[0]] = lllIllIlI[18];
                    if (!p.llIIlIIlllll(Bank.contains((int[])nArray11) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[lllIllIlI[1]];
                nArray[p.lllIllIlI[0]] = lllIllIlI[12];
                if (!p.llIIlIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block8;
                int[] nArray12 = new int[lllIllIlI[1]];
                nArray12[p.lllIllIlI[0]] = lllIllIlI[12];
                if (!p.llIIlIIlllll(Bank.contains((int[])nArray12) ? 1 : 0)) break block3;
            }
            n2 = lllIllIlI[1];

            if (null == null) return n2 != 0;
            return ((0x74 ^ 0x2C ^ (0x41 ^ 0x14)) & (153 + 171 - 221 + 88 ^ 25 + 166 - 63 + 50 ^ -1)) != 0;
        }
        n2 = lllIllIlI[0];
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            p.aJ();

        }
        catch (Exception llIlIlIIllllI) {
            llIlIlIIllllI.printStackTrace();
        }
        if (2 < 0) {
            return (151 + 194 - 285 + 160 ^ 21 + 16 - -59 + 63) & (0xE6 ^ 0x91 ^ (0x26 ^ 0x12) ^ -1);
        }
        return lllIllIlI[0];
    }

    private static boolean llIIlIlIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIlIIlIl(int n2) {
        return n2 < 0;
    }

        return String.valueOf(llIlIlIIIIlll);
    }

    private static  boolean b(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    public static void D() {
        World world2 = Worlds.getRandom(world -> {
            int n2;
            if (p.llIIlIlIIIIl(world.isMembers() ? 1 : 0) && p.llIIlIlIIlll(world.getPlayerCount(), lllIllIlI[58]) && p.llIIlIlIlIll(world.getId(), Worlds.getCurrentId()) && p.llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[59]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[60]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[61]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[21]]) ? 1 : 0) && p.llIIlIlIlIll(world.getId(), lllIllIlI[62]) && p.llIIlIlIlIll(world.getId(), lllIllIlI[63]) && p.llIIlIlIlIll(world.getId(), lllIllIlI[63]) && p.llIIlIlIIIIl(world.getActivity().contains(lllIllIIl[lllIllIlI[64]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().contains(lllIllIIl[lllIllIlI[65]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().contains(lllIllIIl[lllIllIlI[66]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[67]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[68]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[69]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[70]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[24]]) ? 1 : 0) && p.llIIlIlIIllI(world.getPlayerCount(), lllIllIlI[21])) {
                n2 = lllIllIlI[1];

                if ((0xB7 ^ 0xBE ^ (0x21 ^ 0x2D)) <= 0) {
                    return ((0x6D ^ 0x17 ^ (0x6B ^ 0x19)) & (106 + 82 - 106 + 123 ^ 70 + 155 - 140 + 112 ^ -1)) != 0;
                }
            } else {
                n2 = lllIllIlI[0];
            }
            return n2 != 0;
        });
        Worlds.hopTo((World)world2);
    }

    private static boolean llIIlIlIIllI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ah() {
        int n2;
        if (p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.ATTACK), lllIllIlI[2]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.STRENGTH), lllIllIlI[3]) && p.llIIlIlIIIlI(Skills.getLevel((Skill)Skill.DEFENCE), lllIllIlI[4])) {
            n2 = lllIllIlI[1];

            if (1 == (0x62 ^ 0x66)) {
                return false;
            }
        } else {
            n2 = lllIllIlI[0];
        }
        return n2 != 0;
    }

    @Override
    public String ag() {
        return lllIllIIl[lllIllIlI[57]];
    }

    private static int llIIlIlIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIIlIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void am() {
        if (p.llIIlIlIIlIl(p.llIIlIlIlIIl(e.w(), 30.0))) {
            int[] nArray = new int[lllIllIlI[1]];
            nArray[p.lllIllIlI[0]] = lllIllIlI[12];
            if (p.llIIlIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIllIlI[1]];
                nArray2[p.lllIllIlI[0]] = lllIllIlI[12];
                Inventory.getFirst((int[])nArray2).interact(lllIllIIl[lllIllIlI[4]]);
                Time.sleepTicks((int)lllIllIlI[1]);

            }
        }
        e.F();
        if (p.llIIlIlIlIII(Players.getLocal().getInteracting())) {
            NPC llIlIlIlIIIll = NPCs.getNearest(nPC -> {
                int n2;
                if (!p.llIIlIlIIIIl(nPC.getName().contains(lllIllIIl[lllIllIlI[25]]) ? 1 : 0) || p.llIIlIIlllll(nPC.getName().contains(lllIllIIl[lllIllIlI[49]]) ? 1 : 0)) {
                    NPC llIlIlIIllIII;
                    String[] stringArray = new String[lllIllIlI[1]];
                    stringArray[p.lllIllIlI[0]] = lllIllIIl[lllIllIlI[71]];
                    if (p.llIIlIIlllll(llIlIlIIllIII.hasAction(stringArray) ? 1 : 0) && p.llIIlIlIlIII(llIlIlIIllIII.getInteracting()) && p.llIIlIlIIIIl(llIlIlIIllIII.isDead() ? 1 : 0)) {
                        n2 = lllIllIlI[1];

                        if (((132 + 84 - 179 + 96 ^ 115 + 46 - 128 + 113) & (0xE1 ^ 0x83 ^ (0x3D ^ 0x48) ^ -1)) == ((0x31 ^ 0x75 ^ (0x1B ^ 0x68)) & (0xD4 ^ 0xC5 ^ (0x85 ^ 0xA3) ^ -1))) return n2 != 0;
                        return ((0x75 ^ 0x23 ^ (0x28 ^ 0x65)) & (78 + 38 - 3 + 60 ^ 0 + 94 - 6 + 94 ^ -1)) != 0;
                    }
                }
                n2 = lllIllIlI[0];
                return n2 != 0;
            });
            String[] stringArray = new String[lllIllIlI[1]];
            stringArray[p.lllIllIlI[0]] = lllIllIIl[lllIllIlI[44]];
            List llIlIlIlIIIlI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (p.llIIlIlIllII(nPC.getInteracting(), Players.getLocal())) {
                    bl = lllIllIlI[1];

                    if (3 != 3) {
                        return false;
                    }
                } else {
                    bl = lllIllIlI[0];
                }
                return bl;
            }).collect(Collectors.toList());
            if (p.llIIlIlIIIll(llIlIlIlIIIll) && p.llIIlIIlllll(llIlIlIlIIIlI.isEmpty() ? 1 : 0) && p.llIIlIlIIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                llIlIlIlIIIll.interact(lllIllIIl[lllIllIlI[45]]);
                Time.sleepTicks((int)lllIllIlI[6]);

            }
            if (p.llIIlIlIIIIl(llIlIlIlIIIlI.isEmpty() ? 1 : 0) && p.llIIlIlIlIII(Players.getLocal().getInteracting())) {
                ((NPC)llIlIlIlIIIlI.get(lllIllIlI[0])).interact(lllIllIIl[lllIllIlI[46]]);
                Time.sleepTicks((int)lllIllIlI[6]);

            }
        }
    }

    private static boolean llIIlIlIIIll(Object object) {
        return object != null;
    }

    private static  boolean e(WorldPoint worldPoint) {
        return Players.getLocal().getWorldLocation().equals((Object)worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    private static void aj() {
        void llIlIlIlIlIll;
        NPC llIlIlIlIIllI;
        WorldArea worldArea = new WorldArea(lllIllIlI[22], lllIllIlI[23], lllIllIlI[24], lllIllIlI[25], lllIllIlI[0]);
        WorldPoint worldPoint = new WorldPoint(lllIllIlI[26], lllIllIlI[27], lllIllIlI[0]);
        WorldPoint worldPoint2 = new WorldPoint(lllIllIlI[28], lllIllIlI[29], lllIllIlI[0]);
        e.F();
        if (p.llIIlIlIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void llIlIlIlIlIlI;
            WorldPoint worldPoint3 = new WorldPoint(lllIllIlI[30], lllIllIlI[31], lllIllIlI[0]);
            WorldPoint worldPoint4 = new WorldPoint(lllIllIlI[30], lllIllIlI[32], lllIllIlI[0]);
            if (!p.llIIlIlIIIIl(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || p.llIIlIIlllll(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                llIlIlIlIIllI = new WorldPoint(lllIllIlI[33], lllIllIlI[34], lllIllIlI[0]);
                e.c((WorldPoint)llIlIlIlIIllI);
                Time.sleepUntil(() -> p.e((WorldPoint)llIlIlIlIIllI), (int)lllIllIlI[35]);

            }
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[36]];
            Movement.walkTo((WorldPoint)llIlIlIlIlIlI);

            Time.sleepTicks((int)lllIllIlI[1]);

        }
        List llIlIlIlIlIII = Players.getAll(arg_0 -> p.b((WorldArea)llIlIlIlIlIll, arg_0));
        if (p.llIIlIIlllll(llIlIlIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.llIIlIlIIIlI(llIlIlIlIlIII.size(), lllIllIlI[19])) {
            void llIlIlIlIlIIl;
            if (p.llIIlIlIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlIlIlIlIIl), lllIllIlI[5])) {
                AccBuilderGWD.c = lllIllIIl[lllIllIlI[37]];
                Movement.walkTo((WorldPoint)llIlIlIlIlIIl);

                Time.sleepTicks((int)lllIllIlI[1]);

            }
            if (p.llIIlIlIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlIlIlIlIIl), lllIllIlI[5])) {
                AccBuilderGWD.c = lllIllIIl[lllIllIlI[38]];
                p.D();
            }
        }
        if (p.llIIlIIlllll(llIlIlIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.llIIlIlIIIII(llIlIlIlIlIII.size(), lllIllIlI[19])) {
            if (p.llIIlIlIIIll(Players.getLocal().getInteracting())) {
                AccBuilderGWD.c = lllIllIIl[lllIllIlI[39]];
            }
            if (p.llIIlIlIlIII(Players.getLocal().getInteracting())) {
                NPC llIlIlIlIIlll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (p.llIIlIIlllll(nPC.getName().contains(lllIllIIl[lllIllIlI[73]]) ? 1 : 0) && p.llIIlIlIlIII(nPC.getInteracting()) && p.llIIlIlIIIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIllIlI[1];

                        if ((0xA ^ 0x34 ^ (0x7B ^ 0x41)) <= 0) {
                            return ((0x3E ^ 0x64 ^ (0x3E ^ 0x59)) & (0xA3 ^ 0x8E ^ (0xAF ^ 0xBF) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lllIllIlI[0];
                    }
                    return n2 != 0;
                });
                llIlIlIlIIllI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (p.llIIlIIlllll(nPC.getName().contains(lllIllIIl[lllIllIlI[72]]) ? 1 : 0) && p.llIIlIlIllII(nPC.getInteracting(), Players.getLocal()) && p.llIIlIlIIIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIllIlI[1];

                        if (-(0xBB ^ 0xBF) >= 0) {
                            return false;
                        }
                    } else {
                        n2 = lllIllIlI[0];
                    }
                    return n2 != 0;
                });
                if (p.llIIlIlIIIll(llIlIlIlIIlll) && p.llIIlIlIlIII(llIlIlIlIIllI)) {
                    AccBuilderGWD.c = lllIllIIl[lllIllIlI[40]];
                    llIlIlIlIIlll.interact(lllIllIIl[lllIllIlI[2]]);
                    Time.sleepTicks((int)lllIllIlI[5]);

                }
            }
        }
    }
}

