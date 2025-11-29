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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.h;
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

public class p
implements ab {
    private static /* synthetic */ String[] lllIllIIl;
    public static /* synthetic */ WorldPoint cR;
    public static /* synthetic */ int[] cM;
    public static /* synthetic */ List<d> bx;
    public static /* synthetic */ WorldArea cP;
    public static /* synthetic */ WorldArea cO;
    public static /* synthetic */ boolean cL;
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ WorldPoint cS;
    public static /* synthetic */ WorldPoint cm;
    private static /* synthetic */ int[] lllIllIlI;
    public static /* synthetic */ WorldPoint cQ;
    public static /* synthetic */ WorldArea cl;
    public static /* synthetic */ boolean bv;

    private static String llIIlIIlIlll(String llIlIIllIIlll, String llIlIIllIIlII) {
        try {
            SecretKeySpec llIlIIllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIllIIlII.getBytes(StandardCharsets.UTF_8)), lllIllIlI[37]), "DES");
            Cipher llIlIIllIlIIl = Cipher.getInstance("DES");
            llIlIIllIlIIl.init(lllIllIlI[5], llIlIIllIlIlI);
            return new String(llIlIIllIlIIl.doFinal(Base64.getDecoder().decode(llIlIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIllIlIII) {
            llIlIIllIlIII.printStackTrace();
            return null;
        }
    }

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
                                "".length();
                            }
                            if (p.llIIlIIlllll(Bank.isOpen() ? 1 : 0)) {
                                if (p.llIIlIlIIlII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllIllIlI[1]);
                                    "".length();
                                }
                                if (p.llIIlIlIIlII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllIllIlI[5]);
                                    "".length();
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
                                    "".length();
                                    "".length();
                                    if (" ".length() != "   ".length()) continue;
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
                    "".length();
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
                "".length();
                if (((0xFD ^ 0xBF) & ~(0x69 ^ 0x2B)) == 0) return n2 != 0;
                return ((0x1E ^ 0x19) & ~(5 ^ 2)) != 0;
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
            "".length();
            Time.sleepTicks((int)lllIllIlI[1]);
            "".length();
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
            "".length();
            Time.sleepTicks((int)lllIllIlI[1]);
            "".length();
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

    private static void llIIlIIlllIl() {
        lllIllIlI = new int[90];
        p.lllIllIlI[0] = (0xC7 ^ 0xA3 ^ (0x85 ^ 0xB0)) & (0xCB ^ 0xA1 ^ (0xB3 ^ 0x88) ^ -" ".length());
        p.lllIllIlI[1] = " ".length();
        p.lllIllIlI[2] = 116 + 164 - 162 + 54 ^ 88 + 136 - 169 + 105;
        p.lllIllIlI[3] = 116 + 108 - 145 + 64 ^ 2 + 116 - 20 + 31;
        p.lllIllIlI[4] = 0x3B ^ 0x34;
        p.lllIllIlI[5] = "  ".length();
        p.lllIllIlI[6] = "   ".length();
        p.lllIllIlI[7] = -(0xFFFFDDDD & 0x267A) & (0xFFFFD7FF & 0x3FDF);
        p.lllIllIlI[8] = 0x83 ^ 0x87;
        p.lllIllIlI[9] = 38 + 11 - -51 + 32 ^ 54 + 75 - 112 + 112;
        p.lllIllIlI[10] = -(0xFFFFBC5B & 0x6BAD) & (0xFFFFAFEF & 0x7BFB);
        p.lllIllIlI[11] = 0xFFFF8FFD & 0x73EA;
        p.lllIllIlI[12] = 0xFFFFBFFF & 0x417B;
        p.lllIllIlI[13] = 109 + 103 - 96 + 49 ^ 103 + 59 - 122 + 153;
        p.lllIllIlI[14] = -(0xFFFFEBD9 & 0x7EF7) & (0xFFFFFFFB & 0x6FFF);
        p.lllIllIlI[15] = -(0xFFFFFDFB & 0x6255) & (0xFFFFE57F & 0x7FFD);
        p.lllIllIlI[16] = -(0xFFFFB32F & 0x7EDB) & (0xFFFFB7BF & 0x7F7B);
        p.lllIllIlI[17] = 0xFFFFF5B7 & 0xF7B;
        p.lllIllIlI[18] = -(0xFFFFA7A9 & 0x7ADF) & (0xFFFFEFBD & 0x37FF);
        p.lllIllIlI[19] = 145 + 30 - 116 + 121 ^ 104 + 74 - 142 + 142;
        p.lllIllIlI[20] = 0x96 ^ 0x82;
        p.lllIllIlI[21] = 0xC1 ^ 0x92 ^ (0xDE ^ 0x93);
        p.lllIllIlI[22] = -(0xFFFFF683 & 0x397D) & (0xFFFFBF3F & 0x7DDB);
        p.lllIllIlI[23] = -(0xFFFFFFF7 & 0x7109) & (0xFFFFFD3F & 0x7FFB);
        p.lllIllIlI[24] = 5 ^ 0x23;
        p.lllIllIlI[25] = 0x12 ^ 0x4D ^ (0x21 ^ 0x59);
        p.lllIllIlI[26] = -(0xFFFFA6ED & 0x7BD7) & (0xFFFFAFF7 & 0x7FFD);
        p.lllIllIlI[27] = -(0xFFFFF3F5 & 0x3DAB) & (0xFFFFFDFE & 0x3FEF);
        p.lllIllIlI[28] = 0xFFFFAFAF & 0x5D7A;
        p.lllIllIlI[29] = -(0xFFFF87B1 & 0x796F) & (0xFFFFFFFF & 0xD7E);
        p.lllIllIlI[30] = -(0xFFFFD59B & 0x7B7F) & (0xFFFFFFDF & 0x5DFE);
        p.lllIllIlI[31] = 0xFFFFEFBE & 0x1CDD;
        p.lllIllIlI[32] = -(0xFFFFF35D & 0x7FE7) & (0xFFFFFFDF & Short.MAX_VALUE);
        p.lllIllIlI[33] = 0xFFFFDDFF & 0x2ECE;
        p.lllIllIlI[34] = -(0xFFFFF3E7 & 0x5F7A) & (0xFFFFDFFB & Short.MAX_VALUE);
        p.lllIllIlI[35] = -(0xFFFFEE9F & 0x5364) & (0xFFFFD39F & 0x7FF7);
        p.lllIllIlI[36] = 0x6D ^ 0x6A;
        p.lllIllIlI[37] = 0x89 ^ 0x82 ^ "   ".length();
        p.lllIllIlI[38] = 119 + 33 - 88 + 65 ^ 69 + 133 - 90 + 24;
        p.lllIllIlI[39] = 52 + 104 - 105 + 97 ^ 81 + 33 - -32 + 12;
        p.lllIllIlI[40] = 0x42 ^ 0x3E ^ (0x5B ^ 0x2C);
        p.lllIllIlI[41] = 0x61 ^ 0x6C;
        p.lllIllIlI[42] = -(0xFFFFFCD7 & 0x33AE) & (0xFFFFFCEF & 0x3FF7);
        p.lllIllIlI[43] = -(0xFFFFB87B & 0x77F5) & (0xFFFFFF7E & 0x3DF3);
        p.lllIllIlI[44] = 127 + 124 - 242 + 119 ^ 109 + 16 - 32 + 51;
        p.lllIllIlI[45] = 0x25 ^ 0x34;
        p.lllIllIlI[46] = 0x62 ^ 0x14 ^ (0x14 ^ 0x70);
        p.lllIllIlI[47] = 0x4E ^ 0x4B ^ (0x4B ^ 0x5D);
        p.lllIllIlI[48] = 0x59 ^ 0x7E ^ (0x90 ^ 0xA2);
        p.lllIllIlI[49] = 115 + 138 - 233 + 122 ^ 103 + 60 - 83 + 86;
        p.lllIllIlI[50] = 0x6D ^ 0x7B;
        p.lllIllIlI[51] = 0x1C ^ 0xB;
        p.lllIllIlI[52] = 0x29 ^ 0x67 ^ (0x32 ^ 0x64);
        p.lllIllIlI[53] = 19 + 127 - 93 + 115 ^ 113 + 151 - 179 + 92;
        p.lllIllIlI[54] = 0xFFFFCFF7 & 0x31FC;
        p.lllIllIlI[55] = 0xFFFFFDBC & 0x63EB;
        p.lllIllIlI[56] = 0xFFFFFFBA & 0x3ADD;
        p.lllIllIlI[57] = 0xE ^ 0x48 ^ (0x75 ^ 0x29);
        p.lllIllIlI[58] = 0xFFFFF7FE & 0xF9F;
        p.lllIllIlI[59] = 0xBE ^ 0x9C ^ (0xAF ^ 0x96);
        p.lllIllIlI[60] = 0x2E ^ 0x32;
        p.lllIllIlI[61] = 0x32 ^ 0x2F;
        p.lllIllIlI[62] = -(0xFFFFA42D & 0x7BF7) & (0xFFFFB1FE & 0x6FFF);
        p.lllIllIlI[63] = 0xFFFFA6BD & 0x5B57;
        p.lllIllIlI[64] = 88 + 8 - 90 + 132 ^ 83 + 75 - 153 + 144;
        p.lllIllIlI[65] = 27 + 72 - -22 + 7 ^ 86 + 8 - -33 + 33;
        p.lllIllIlI[66] = 0x39 ^ 0x18;
        p.lllIllIlI[67] = 102 + 129 - 146 + 59 ^ 114 + 27 - -17 + 20;
        p.lllIllIlI[68] = 0xA ^ 0x29;
        p.lllIllIlI[69] = 0xE8 ^ 0xAE ^ (0x41 ^ 0x23);
        p.lllIllIlI[70] = 110 + 40 - 141 + 166 ^ 120 + 56 - 65 + 27;
        p.lllIllIlI[71] = 0xE ^ 0x27;
        p.lllIllIlI[72] = 2 ^ 0x28;
        p.lllIllIlI[73] = 0x2E ^ 5;
        p.lllIllIlI[74] = -(0xFFFFBB5F & 0x77E7) & (0xFFFFBFFF & 0x7FDF);
        p.lllIllIlI[75] = 0xFFFFCFFF & 0x3CDA;
        p.lllIllIlI[76] = -(0xFFFF96F9 & 0x7B57) & (0xFFFFBEFE & 0x5FFD);
        p.lllIllIlI[77] = -(0xFFFFEA4E & 0x75BB) & (0xFFFFEEFF & 0x7DD9);
        p.lllIllIlI[78] = -(0xFFFFE34F & 0x3DBF) & (0xFFFFBDFF & 0x6F7F);
        p.lllIllIlI[79] = 0xFFFF9E7F & 0x6DDF;
        p.lllIllIlI[80] = 0x38 ^ 0x75 ^ (0x13 ^ 0x6E);
        p.lllIllIlI[81] = 0xFFFFDCBF & 0x2FCD;
        p.lllIllIlI[82] = 0xFFFFBC7F & 0x4FED;
        p.lllIllIlI[83] = -(0xFFFFFBAD & 0x7753) & (0xFFFFFFBF & 0x7FF6);
        p.lllIllIlI[84] = -(0xFFFFB25F & 0x7FA1) & (0xFFFFFFDF & 0x3EBF);
        p.lllIllIlI[85] = 0xFFFFCFF8 & 0x3CE7;
        p.lllIllIlI[86] = 0xFFFFBCD7 & 0x4F7A;
        p.lllIllIlI[87] = 0xFFFF8CFF & 0x7FF7;
        p.lllIllIlI[88] = -(0xFFFFED75 & 0x738F) & (0xFFFFFDE7 & 0x6F7D);
        p.lllIllIlI[89] = 0xDB ^ 0x9E ^ (0xA ^ 0x63);
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
            d d2 = new d(lllIllIlI[12], lllIllIlI[13], lllIllIlI[54]);
            bx.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lllIllIlI[1]];
        nArray2[p.lllIllIlI[0]] = lllIllIlI[18];
        if (p.llIIlIlIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIlIlIlIIIII = new d(lllIllIlI[18], lllIllIlI[1], lllIllIlI[55]);
            bx.add(llIlIlIlIIIII);
            "".length();
        }
        int[] nArray3 = new int[lllIllIlI[1]];
        nArray3[p.lllIllIlI[0]] = lllIllIlI[14];
        if (p.llIIlIlIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIlIlIlIIIII = new d(lllIllIlI[14], lllIllIlI[1], lllIllIlI[7]);
            bx.add(llIlIlIlIIIII);
            "".length();
        }
        int[] nArray4 = new int[lllIllIlI[1]];
        nArray4[p.lllIllIlI[0]] = lllIllIlI[15];
        if (p.llIIlIlIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIlIlIlIIIII = new d(lllIllIlI[15], lllIllIlI[1], lllIllIlI[7]);
            bx.add(llIlIlIlIIIII);
            "".length();
        }
        int[] nArray5 = new int[lllIllIlI[1]];
        nArray5[p.lllIllIlI[0]] = lllIllIlI[16];
        if (p.llIIlIlIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llIlIlIlIIIII = new d(lllIllIlI[16], lllIllIlI[1], lllIllIlI[56]);
            bx.add(llIlIlIlIIIII);
            "".length();
        }
        int[] nArray6 = new int[lllIllIlI[1]];
        nArray6[p.lllIllIlI[0]] = lllIllIlI[17];
        if (p.llIIlIlIIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llIlIlIlIIIII = new d(lllIllIlI[17], lllIllIlI[1], lllIllIlI[56]);
            bx.add(llIlIlIlIIIII);
            "".length();
        }
    }

    private static void llIIlIIllIIl() {
        lllIllIIl = new String[lllIllIlI[89]];
        p.lllIllIIl[p.lllIllIlI[0]] = p.llIIlIIlIllI("FzIgBT0yZzAYNjg0", "UGYlS");
        p.lllIllIIl[p.lllIllIlI[1]] = p.llIIlIIlIlll("IhB4ohV1/m02weAdHg6meDZL0gOVeGNmoO06/50yBW+0H/XKEupeYaOamA8GzZnanMO7MOz0jWM=", "sEJzn");
        p.lllIllIIl[p.lllIllIlI[5]] = p.llIIlIIlIlll("iVEh4RPJ3kJI5oWYyDY4oUq3xMPax7PP", "sRaje");
        p.lllIllIIl[p.lllIllIlI[6]] = p.llIIlIIlIllI("DwILPiEuDQJ6LyYNDjMjIA==", "GceZM");
        p.lllIllIIl[p.lllIllIlI[8]] = p.llIIlIIllIII("1dN+4QzszRRgqiUVM/Kf1ihWIWq5l2B7WLtf/kV812EsoTLHE2zlA7YVBEnWZ/Nk", "zXoQv");
        p.lllIllIIl[p.lllIllIlI[9]] = p.llIIlIIlIllI("D10/JQIFCio=", "ioOHg");
        p.lllIllIIl[p.lllIllIlI[19]] = p.llIIlIIlIlll("ZNC5TE6E1yE=", "dMqyq");
        p.lllIllIIl[p.lllIllIlI[36]] = p.llIIlIIlIllI("BRI3QjMkUykLKydTJgsmJQcy", "KsAbG");
        p.lllIllIIl[p.lllIllIlI[37]] = p.llIIlIIllIII("FJwCFfocdLMGq0e9Quen0g==", "pbgDw");
        p.lllIllIIl[p.lllIllIlI[38]] = p.llIIlIIlIlll("sObagvKoGJsCWGndKoI6Wg==", "UZeYJ");
        p.lllIllIIl[p.lllIllIlI[39]] = p.llIIlIIlIllI("MSBtMxgVLCwk", "xNMPw");
        p.lllIllIIl[p.lllIllIlI[40]] = p.llIIlIIlIllI("CS47KxojMyEtWSAzIyZZLzMuJA0=", "HZOJy");
        p.lllIllIIl[p.lllIllIlI[2]] = p.llIIlIIlIlll("PBNSIcyIw3E=", "jIUzZ");
        p.lllIllIIl[p.lllIllIlI[41]] = p.llIIlIIllIII("DxsepEABtKrNOZonZg7wTw==", "EJUBj");
        p.lllIllIIl[p.lllIllIlI[3]] = p.llIIlIIllIII("Xum6vYwE4KpqZGqQ2K7hCA==", "lsInP");
        p.lllIllIIl[p.lllIllIlI[4]] = p.llIIlIIlIlll("98l6IUOPrDI=", "RucAM");
        p.lllIllIIl[p.lllIllIlI[44]] = p.llIIlIIllIII("pW7KNX8Yfrk=", "HEYRr");
        p.lllIllIIl[p.lllIllIlI[45]] = p.llIIlIIlIllI("DSMZOCAn", "LWmYC");
        p.lllIllIIl[p.lllIllIlI[46]] = p.llIIlIIlIllI("OCYyFRsS", "yRFtx");
        p.lllIllIIl[p.lllIllIlI[47]] = p.llIIlIIlIlll("zXuVY/xL8mw=", "aJdpM");
        p.lllIllIIl[p.lllIllIlI[20]] = p.llIIlIIlIllI("PgU0Og0=", "ilQVi");
        p.lllIllIIl[p.lllIllIlI[48]] = p.llIIlIIlIlll("0KqdcZ3c+58=", "NsgyY");
        p.lllIllIIl[p.lllIllIlI[50]] = p.llIIlIIllIII("bhJrFGatHcg=", "VKOby");
        p.lllIllIIl[p.lllIllIlI[51]] = p.llIIlIIllIII("+N641Bgo8no=", "VLXWV");
        p.lllIllIIl[p.lllIllIlI[52]] = p.llIIlIIllIII("DEDXQ+esjVlPvXS+GstszA==", "uYbFm");
        p.lllIllIIl[p.lllIllIlI[53]] = p.llIIlIIlIlll("Wc4qiY6jPVNs14D6bmlKFA==", "wqXzP");
        p.lllIllIIl[p.lllIllIlI[57]] = p.llIIlIIlIllI("YVlVY1F/Wk9yKDUHHzc=", "PkzRe");
        p.lllIllIIl[p.lllIllIlI[59]] = p.llIIlIIlIlll("gRamxqy3Dqs=", "vKObS");
        p.lllIllIIl[p.lllIllIlI[60]] = p.llIIlIIlIllI("Agw1", "RzeOL");
        p.lllIllIIl[p.lllIllIlI[61]] = p.llIIlIIlIllI("Fz8E", "GITdQ");
        p.lllIllIIl[p.lllIllIlI[21]] = p.llIIlIIlIllI("Kxs+DQ==", "crYeJ");
        p.lllIllIIl[p.lllIllIlI[64]] = p.llIIlIIllIII("czMFApXfoss=", "iyRxw");
        p.lllIllIIl[p.lllIllIlI[65]] = p.llIIlIIllIII("Sw2r/4uLrWI=", "xjueA");
        p.lllIllIIl[p.lllIllIlI[66]] = p.llIIlIIlIlll("7C8cwsY1R7U=", "kcvgX");
        p.lllIllIIl[p.lllIllIlI[67]] = p.llIIlIIllIII("FByCwehTJAE=", "NOyWp");
        p.lllIllIIl[p.lllIllIlI[68]] = p.llIIlIIlIllI("KBIVMxgNGQ==", "lwtWu");
        p.lllIllIIl[p.lllIllIlI[69]] = p.llIIlIIlIllI("NyohCDQWLyoDOQo9", "dZDmP");
        p.lllIllIIl[p.lllIllIlI[70]] = p.llIIlIIlIlll("FYqqemUm/Is=", "WgGIX");
        p.lllIllIIl[p.lllIllIlI[24]] = p.llIIlIIlIlll("XD4NBsFaGbM=", "LutWz");
        p.lllIllIIl[p.lllIllIlI[25]] = p.llIIlIIllIII("SQWlZ+MbB+Q=", "qQZjA");
        p.lllIllIIl[p.lllIllIlI[49]] = p.llIIlIIlIllI("GhYT", "Yydsb");
        p.lllIllIIl[p.lllIllIlI[71]] = p.llIIlIIlIllI("LR8kEicH", "lkPsD");
        p.lllIllIIl[p.lllIllIlI[72]] = p.llIIlIIllIII("tIpUBme5IyM=", "jberZ");
        p.lllIllIIl[p.lllIllIlI[73]] = p.llIIlIIllIII("4GxTXe45y4I=", "Yuaqr");
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
            "".length();
            if (null == null) return n2 != 0;
            return ((0x74 ^ 0x2C ^ (0x41 ^ 0x14)) & (153 + 171 - 221 + 88 ^ 25 + 166 - 63 + 50 ^ -" ".length())) != 0;
        }
        n2 = lllIllIlI[0];
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            p.aJ();
            "".length();
        }
        catch (Exception llIlIlIIllllI) {
            llIlIlIIllllI.printStackTrace();
        }
        if ("  ".length() < 0) {
            return (151 + 194 - 285 + 160 ^ 21 + 16 - -59 + 63) & (0xE6 ^ 0x91 ^ (0x26 ^ 0x12) ^ -" ".length());
        }
        return lllIllIlI[0];
    }

    private static boolean llIIlIlIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIlIIlIl(int n2) {
        return n2 < 0;
    }

    private static String llIIlIIlIllI(String llIlIlIIIIlII, String llIlIlIIIIIll) {
        llIlIlIIIIlII = new String(Base64.getDecoder().decode(llIlIlIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIlIIIIlll = new StringBuilder();
        char[] llIlIlIIIIllI = llIlIlIIIIIll.toCharArray();
        int llIlIlIIIIlIl = lllIllIlI[0];
        char[] llIlIIlllllll = llIlIlIIIIlII.toCharArray();
        int llIlIIllllllI = llIlIIlllllll.length;
        int llIlIIlllllIl = lllIllIlI[0];
        while (p.llIIlIlIIIII(llIlIIlllllIl, llIlIIllllllI)) {
            char llIlIlIIIlIlI = llIlIIlllllll[llIlIIlllllIl];
            llIlIlIIIIlll.append((char)(llIlIlIIIlIlI ^ llIlIlIIIIllI[llIlIlIIIIlIl % llIlIlIIIIllI.length]));
            "".length();
            ++llIlIlIIIIlIl;
            ++llIlIIlllllIl;
            "".length();
            if ("   ".length() > "  ".length()) continue;
            return null;
        }
        return String.valueOf(llIlIlIIIIlll);
    }

    private static /* synthetic */ boolean b(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    private static String llIIlIIllIII(String llIlIIlllIIlI, String llIlIIlllIIll) {
        try {
            SecretKeySpec llIlIIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIlllIllI = Cipher.getInstance("Blowfish");
            llIlIIlllIllI.init(lllIllIlI[5], llIlIIlllIlll);
            return new String(llIlIIlllIllI.doFinal(Base64.getDecoder().decode(llIlIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIlllIlIl) {
            llIlIIlllIlIl.printStackTrace();
            return null;
        }
    }

    public static void D() {
        World world2 = Worlds.getRandom(world -> {
            int n2;
            if (p.llIIlIlIIIIl(world.isMembers() ? 1 : 0) && p.llIIlIlIIlll(world.getPlayerCount(), lllIllIlI[58]) && p.llIIlIlIlIll(world.getId(), Worlds.getCurrentId()) && p.llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[59]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[60]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[61]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[21]]) ? 1 : 0) && p.llIIlIlIlIll(world.getId(), lllIllIlI[62]) && p.llIIlIlIlIll(world.getId(), lllIllIlI[63]) && p.llIIlIlIlIll(world.getId(), lllIllIlI[63]) && p.llIIlIlIIIIl(world.getActivity().contains(lllIllIIl[lllIllIlI[64]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().contains(lllIllIIl[lllIllIlI[65]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().contains(lllIllIIl[lllIllIlI[66]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[67]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[68]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[69]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().endsWith(lllIllIIl[lllIllIlI[70]]) ? 1 : 0) && p.llIIlIlIIIIl(world.getActivity().startsWith(lllIllIIl[lllIllIlI[24]]) ? 1 : 0) && p.llIIlIlIIllI(world.getPlayerCount(), lllIllIlI[21])) {
                n2 = lllIllIlI[1];
                "".length();
                if ((0xB7 ^ 0xBE ^ (0x21 ^ 0x2D)) <= 0) {
                    return ((0x6D ^ 0x17 ^ (0x6B ^ 0x19)) & (106 + 82 - 106 + 123 ^ 70 + 155 - 140 + 112 ^ -" ".length())) != 0;
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
            "".length();
            if (" ".length() == (0x62 ^ 0x66)) {
                return ((0xBA ^ 0xA6) & ~(0x26 ^ 0x3A)) != 0;
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
                "".length();
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
                        "".length();
                        if (((132 + 84 - 179 + 96 ^ 115 + 46 - 128 + 113) & (0xE1 ^ 0x83 ^ (0x3D ^ 0x48) ^ -" ".length())) == ((0x31 ^ 0x75 ^ (0x1B ^ 0x68)) & (0xD4 ^ 0xC5 ^ (0x85 ^ 0xA3) ^ -" ".length()))) return n2 != 0;
                        return ((0x75 ^ 0x23 ^ (0x28 ^ 0x65)) & (78 + 38 - 3 + 60 ^ 0 + 94 - 6 + 94 ^ -" ".length())) != 0;
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
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return ((0x78 ^ 0x1A) & ~(0x10 ^ 0x72)) != 0;
                    }
                } else {
                    bl = lllIllIlI[0];
                }
                return bl;
            }).collect(Collectors.toList());
            if (p.llIIlIlIIIll(llIlIlIlIIIll) && p.llIIlIIlllll(llIlIlIlIIIlI.isEmpty() ? 1 : 0) && p.llIIlIlIIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                llIlIlIlIIIll.interact(lllIllIIl[lllIllIlI[45]]);
                Time.sleepTicks((int)lllIllIlI[6]);
                "".length();
            }
            if (p.llIIlIlIIIIl(llIlIlIlIIIlI.isEmpty() ? 1 : 0) && p.llIIlIlIlIII(Players.getLocal().getInteracting())) {
                ((NPC)llIlIlIlIIIlI.get(lllIllIlI[0])).interact(lllIllIIl[lllIllIlI[46]]);
                Time.sleepTicks((int)lllIllIlI[6]);
                "".length();
            }
        }
    }

    private static boolean llIIlIlIIIll(Object object) {
        return object != null;
    }

    private static /* synthetic */ boolean e(WorldPoint worldPoint) {
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
                "".length();
            }
            AccBuilderGWD.c = lllIllIIl[lllIllIlI[36]];
            Movement.walkTo((WorldPoint)llIlIlIlIlIlI);
            "".length();
            Time.sleepTicks((int)lllIllIlI[1]);
            "".length();
        }
        List llIlIlIlIlIII = Players.getAll(arg_0 -> p.b((WorldArea)llIlIlIlIlIll, arg_0));
        if (p.llIIlIIlllll(llIlIlIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.llIIlIlIIIlI(llIlIlIlIlIII.size(), lllIllIlI[19])) {
            void llIlIlIlIlIIl;
            if (p.llIIlIlIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlIlIlIlIIl), lllIllIlI[5])) {
                AccBuilderGWD.c = lllIllIIl[lllIllIlI[37]];
                Movement.walkTo((WorldPoint)llIlIlIlIlIIl);
                "".length();
                Time.sleepTicks((int)lllIllIlI[1]);
                "".length();
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
                        "".length();
                        if ((0xA ^ 0x34 ^ (0x7B ^ 0x41)) <= 0) {
                            return ((0x3E ^ 0x64 ^ (0x3E ^ 0x59)) & (0xA3 ^ 0x8E ^ (0xAF ^ 0xBF) ^ -" ".length())) != 0;
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
                        "".length();
                        if (-(0xBB ^ 0xBF) >= 0) {
                            return ((0x34 ^ 0x2B) & ~(0x27 ^ 0x38)) != 0;
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
                    "".length();
                }
            }
        }
    }
}

