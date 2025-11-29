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
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.HHelper;
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
implements K {
    
    public static  List<d> bp;
    public static  int[] cE;
    public static  WorldArea cF;
    public static  WorldPoint cK;
    public static  WorldArea cH;
    public static  boolean bn;
    
    public static  WorldPoint ce;
    public static  WorldPoint cJ;
    public static  WorldArea cG;
    public static  WorldArea cd;
    public static  WorldPoint cI;
    public static  boolean cD;

    @Override
    public String ae() {
        return lIlIIIIllI[lIlIIIIlll[57]];
    }

    public static void aM() {
        if (p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[8]) && p.lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[8]) && p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[19]) && p.lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[8]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[19]) && p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[36]) && p.lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[37]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[19]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[36]) && p.lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[37]) && p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[37]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[36]) && p.lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[37]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[37]) && p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[40]) && p.lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[2]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[37]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[40]) && p.lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[2]) && p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[2]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[40]) && p.lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
        }
        if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[2]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[2]) && p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[4]) && p.lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
        if (p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[3]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[2]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[4]) && p.lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
    }

    private static  boolean e(WorldPoint worldPoint) {
        return Players.getLocal().getWorldLocation().equals((Object)worldPoint);
    }

    private static boolean lIIIlIIlIllIl(Object object, Object object2) {
        return object == object2;
    }

    private static void ak() {
        if (p.lIIIlIIlIIllI(p.lIIIlIIlIlIlI(e.u(), 30.0))) {
            int[] nArray = new int[lIlIIIIlll[1]];
            nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[12];
            if (p.lIIIlIIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIIIlll[1]];
                nArray2[p.lIlIIIIlll[0]] = lIlIIIIlll[12];
                Inventory.getFirst((int[])nArray2).interact(lIlIIIIllI[lIlIIIIlll[4]]);
                Time.sleepTicks((int)lIlIIIIlll[1]);

            }
        }
        e.D();
        if (p.lIIIlIIlIlIIl(Players.getLocal().getInteracting())) {
            NPC var1 = NPCs.getNearest(nPC -> {
                int n2;
                if (!p.lIIIlIIlIIIlI(nPC.getName().contains(lIlIIIIllI[lIlIIIIlll[25]]) ? 1 : 0) || p.lIIIlIIlIIIII(nPC.getName().contains(lIlIIIIllI[lIlIIIIlll[49]]) ? 1 : 0)) {
                    NPC var2;
                    String[] stringArray = new String[lIlIIIIlll[1]];
                    stringArray[p.lIlIIIIlll[0]] = lIlIIIIllI[lIlIIIIlll[71]];
                    if (p.lIIIlIIlIIIII(var2.hasAction(stringArray) ? 1 : 0) && p.lIIIlIIlIlIIl(var2.getInteracting()) && p.lIIIlIIlIIIlI(var2.isDead() ? 1 : 0)) {
                        n2 = lIlIIIIlll[1];

                        if (-(0xF4 ^ 0x8F ^ 118 + 13 - 89 + 85) <= 0) return n2 != 0;
                        return ((0x19 ^ 0x44 ^ (0xF5 ^ 0x8F)) & (102 + 71 - 8 + 19 ^ 33 + 99 - 13 + 40 ^ -1)) != 0;
                    }
                }
                n2 = lIlIIIIlll[0];
                return n2 != 0;
            });
            String[] stringArray = new String[lIlIIIIlll[1]];
            stringArray[p.lIlIIIIlll[0]] = lIlIIIIllI[lIlIIIIlll[44]];
            List var3 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (p.lIIIlIIlIllIl(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIlIIIIlll[1];

                    }
                } else {
                    bl = lIlIIIIlll[0];
                }
                return bl;
            }).collect(Collectors.toList());
            if (p.lIIIlIIlIIlII(var1) && p.lIIIlIIlIIIII(var3.isEmpty() ? 1 : 0) && p.lIIIlIIlIIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                var1.interact(lIlIIIIllI[lIlIIIIlll[45]]);
                Time.sleepTicks((int)lIlIIIIlll[6]);

            }
            if (p.lIIIlIIlIIIlI(var3.isEmpty() ? 1 : 0) && p.lIIIlIIlIlIIl(Players.getLocal().getInteracting())) {
                ((NPC)var3.get(lIlIIIIlll[0])).interact(lIlIIIIllI[lIlIIIIlll[46]]);
                Time.sleepTicks((int)lIlIIIIlll[6]);

            }
        }
    }

    private static void lIIIlIIIlllIl() {
        lIlIIIIllI = new String[lIlIIIIlll[89]];
        p.lIlIIIIllI[p.lIlIIIIlll[0]] = "Buying items";
        p.lIlIIIIllI[p.lIlIIIIlll[1]] = "Finished buying items, switching back to melee training";
        p.lIlIIIIllI[p.lIlIIIIlll[5]] = "Navigating to bank";
        p.lIlIIIIllI[p.lIlIIIIlll[6]] = "Handling banking";
        p.lIlIIIIllI[p.lIlIIIIlll[8]] = "We are missing supplies, switching to BUYING";
        p.lIlIIIIllI[p.lIlIIIIlll[9]] = "f2pmelee";
        p.lIlIIIIllI[p.lIlIIIIlll[19]] = "Eat";
        p.lIlIIIIllI[p.lIlIIIIlll[36]] = "Nav to hill giants";
        p.lIlIIIIllI[p.lIlIIIIlll[37]] = "Run to hop tile";
        p.lIlIIIIllI[p.lIlIIIIlll[38]] = "World hopping";
        p.lIlIIIIllI[p.lIlIIIIlll[39]] = "In combat";
        p.lIlIIIIllI[p.lIlIIIIlll[40]] = "Attacking hill giant";
        p.lIlIIIIllI[p.lIlIIIIlll[2]] = "Attack";
        p.lIlIIIIllI[p.lIlIIIIlll[41]] = "Nav to cows";
        p.lIlIIIIllI[p.lIlIIIIlll[3]] = "Attacking cows";
        p.lIlIIIIllI[p.lIlIIIIlll[4]] = "Eat";
        p.lIlIIIIllI[p.lIlIIIIlll[44]] = "cow";
        p.lIlIIIIllI[p.lIlIIIIlll[45]] = "Attack";
        p.lIlIIIIllI[p.lIlIIIIlll[46]] = "Attack";
        p.lIlIIIIllI[p.lIlIIIIlll[47]] = "Wield";
        p.lIlIIIIllI[p.lIlIIIIlll[20]] = "Wield";
        p.lIlIIIIllI[p.lIlIIIIlll[48]] = "Wield";
        p.lIlIIIIllI[p.lIlIIIIlll[50]] = "Wield";
        p.lIlIIIIllI[p.lIlIIIIlll[51]] = "Wield";
        p.lIlIIIIllI[p.lIlIIIIlll[52]] = "Nav to cows";
        p.lIlIIIIllI[p.lIlIIIIlll[53]] = "Attacking cows";
        p.lIlIIIIllI[p.lIlIIIIlll[57]] = "12/14/15 Melee";
        p.lIlIIIIllI[p.lIlIIIIlll[59]] = "total";
        p.lIlIIIIllI[p.lIlIIIIlll[60]] = "PvP";
        p.lIlIIIIllI[p.lIlIIIIlll[61]] = "PvP";
        p.lIlIIIIllI[p.lIlIIIIlll[21]] = "High";
        p.lIlIIIIllI[p.lIlIIIIlll[64]] = "Leagues";
        p.lIlIIIIllI[p.lIlIIIIlll[65]] = "Beta";
        p.lIlIIIIllI[p.lIlIIIIlll[66]] = "beta";
        p.lIlIIIIllI[p.lIlIIIIlll[67]] = "Deadman";
        p.lIlIIIIllI[p.lIlIIIIlll[68]] = "Deadman";
        p.lIlIIIIllI[p.lIlIIIIlll[69]] = "Speedrunning";
        p.lIlIIIIllI[p.lIlIIIIlll[70]] = "total";
        p.lIlIIIIllI[p.lIlIIIIlll[24]] = "Beta";
        p.lIlIIIIllI[p.lIlIIIIlll[25]] = "calf";
        p.lIlIIIIllI[p.lIlIIIIlll[49]] = "Cow";
        p.lIlIIIIllI[p.lIlIIIIlll[71]] = "Attack";
        p.lIlIIIIllI[p.lIlIIIIlll[72]] = "Hill";
        p.lIlIIIIllI[p.lIlIIIIlll[73]] = "Hill";
    }

    private static boolean lIIIlIIlIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIIlIIIlI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var4);
    }

    private static boolean lIIIlIIlIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        p.lIIIlIIIllllI();
        p.lIIIlIIIlllIl();
        bp = new ArrayList<d>();
        int[] nArray = new int[lIlIIIIlll[9]];
        nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[14];
        nArray[p.lIlIIIIlll[1]] = lIlIIIIlll[15];
        nArray[p.lIlIIIIlll[5]] = lIlIIIIlll[17];
        nArray[p.lIlIIIIlll[6]] = lIlIIIIlll[16];
        nArray[p.lIlIIIIlll[8]] = lIlIIIIlll[18];
        cE = nArray;
        cF = new WorldArea(lIlIIIIlll[74], lIlIIIIlll[75], lIlIIIIlll[40], lIlIIIIlll[40], lIlIIIIlll[0]);
        cG = new WorldArea(lIlIIIIlll[76], lIlIIIIlll[77], lIlIIIIlll[48], lIlIIIIlll[44], lIlIIIIlll[0]);
        cH = new WorldArea(lIlIIIIlll[78], lIlIIIIlll[79], lIlIIIIlll[80], lIlIIIIlll[21], lIlIIIIlll[0]);
        cI = new WorldPoint(lIlIIIIlll[81], lIlIIIIlll[82], lIlIIIIlll[0]);
        ce = new WorldPoint(lIlIIIIlll[83], lIlIIIIlll[75], lIlIIIIlll[0]);
        cJ = new WorldPoint(lIlIIIIlll[84], lIlIIIIlll[85], lIlIIIIlll[0]);
        cd = new WorldArea(lIlIIIIlll[86], lIlIIIIlll[87], lIlIIIIlll[67], lIlIIIIlll[53], lIlIIIIlll[0]);
        cK = new WorldPoint(lIlIIIIlll[88], lIlIIIIlll[43], lIlIIIIlll[0]);
    }

    private static int lIIIlIIlIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIIlIIlIIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIIlIllII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIlIIlIIlII(Object object) {
        return object != null;
    }

    private static boolean lIIIlIIlIIlIl(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean af() {
        int n2;
        if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[2]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[3]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[4])) {
            n2 = lIlIIIIlll[1];

            if (3 <= 2) {
                return ((15 + 182 - -2 + 55 ^ 106 + 16 - 39 + 108) & (0x42 ^ 0x5C ^ (0xF4 ^ 0xAB) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIIIIlll[0];
        }
        return n2 != 0;
    }

    private static boolean lIIIlIIlIlIIl(Object object) {
        return object == null;
    }

    @Override
    public boolean ac() {
        return lIlIIIIlll[0];
    }

    private static boolean lIIIlIIlIIIII(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aK() {
        int n2;
        block5: {
            block9: {
                block8: {
                    block7: {
                        block6: {
                            block4: {
                                int[] nArray = new int[lIlIIIIlll[1]];
                                nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[14];
                                if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block4;
                                int[] nArray2 = new int[lIlIIIIlll[1]];
                                nArray2[p.lIlIIIIlll[0]] = lIlIIIIlll[14];
                                if (!p.lIIIlIIlIIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                            }
                            int[] nArray = new int[lIlIIIIlll[1]];
                            nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[15];
                            if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block6;
                            int[] nArray3 = new int[lIlIIIIlll[1]];
                            nArray3[p.lIlIIIIlll[0]] = lIlIIIIlll[15];
                            if (!p.lIIIlIIlIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block5;
                        }
                        int[] nArray = new int[lIlIIIIlll[1]];
                        nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[16];
                        if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                        int[] nArray4 = new int[lIlIIIIlll[1]];
                        nArray4[p.lIlIIIIlll[0]] = lIlIIIIlll[16];
                        if (!p.lIIIlIIlIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block5;
                    }
                    int[] nArray = new int[lIlIIIIlll[1]];
                    nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[17];
                    if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                    int[] nArray5 = new int[lIlIIIIlll[1]];
                    nArray5[p.lIlIIIIlll[0]] = lIlIIIIlll[17];
                    if (!p.lIIIlIIlIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block5;
                }
                int[] nArray = new int[lIlIIIIlll[1]];
                nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[18];
                if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIlIIIIlll[1]];
                nArray6[p.lIlIIIIlll[0]] = lIlIIIIlll[18];
                if (!p.lIIIlIIlIIIII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block5;
            }
            int[] nArray = new int[lIlIIIIlll[1]];
            nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[12];
            if (p.lIIIlIIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIlIIIIlll[1];

                if (2 != 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIlIIIIlll[0];
        return n2 != 0;
    }

    public static void aH() {
        block22: {
            block24: {
                block23: {
                    if (p.lIIIlIIlIIIII(bn ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[0]];
                        b.a(bp);
                        if (p.lIIIlIIlIIIIl(bp.size(), lIlIIIIlll[1])) {
                            System.out.println(lIlIIIIllI[lIlIIIIlll[1]]);
                            bn = lIlIIIIlll[0];
                        }
                    }
                    if (!p.lIIIlIIlIIIlI(bn ? 1 : 0) || p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[2]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[3]) && !p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[4])) break block22;
                    if (p.lIIIlIIlIIIlI(p.aK() ? 1 : 0)) {
                        BankLocation var5 = BankLocation.getNearest();
                        if (p.lIIIlIIlIIlII(var5) && p.lIIIlIIlIIIlI(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[5]];
                            a.a(var5);
                        }
                        if (p.lIIIlIIlIIlII(var5) && p.lIIIlIIlIIIII(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[6]];
                            if (p.lIIIlIIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIIlll[7]);

                            }
                            if (p.lIIIlIIlIIIII(Bank.isOpen() ? 1 : 0)) {
                                if (p.lIIIlIIlIIlIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIlIIIIlll[1]);

                                }
                                if (p.lIIIlIIlIIlIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIlIIIIlll[5]);

                                }
                                if (p.lIIIlIIlIIIlI(p.aL() ? 1 : 0)) {
                                    p.O();
                                    System.out.println(lIlIIIIllI[lIlIIIIlll[8]]);
                                    bn = lIlIIIIlll[1];
                                    return;
                                }
                                if (p.lIIIlIIlIIIlI(cD ? 1 : 0)) {
                                    h.V();
                                    cD = lIlIIIIlll[1];
                                }
                                while (p.lIIIlIIlIIIlI(h.bo ? 1 : 0) && p.lIIIlIIlIIIlI(AccBuilderShamans.d ? 1 : 0)) {
                                    h.d(lIlIIIIllI[lIlIIIIlll[9]]);
                                    Time.sleepTicks((int)lIlIIIIlll[1]);

                                    if (-1 <= 0) continue;
                                    return;
                                }
                                a.a(cE, lIlIIIIlll[1]);
                                a.a(lIlIIIIlll[10], lIlIIIIlll[11]);
                                a.b(f.aU, lIlIIIIlll[1]);
                                if (p.lIIIlIIlIIIII(Inventory.contains((int[])cE) ? 1 : 0)) {
                                    a.a(lIlIIIIlll[12], lIlIIIIlll[13]);
                                }
                            }
                        }
                    }
                    if (!p.lIIIlIIlIIIII(p.aK() ? 1 : 0)) break block22;
                    p.aJ();
                    cD = lIlIIIIlll[0];
                    if (p.lIIIlIIlIIIll(Movement.getRunEnergy(), lIlIIIIlll[4]) && p.lIIIlIIlIIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    int[] nArray = new int[lIlIIIIlll[1]];
                    nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[14];
                    if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray2 = new int[lIlIIIIlll[1]];
                    nArray2[p.lIlIIIIlll[0]] = lIlIIIIlll[15];
                    if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block23;
                    int[] nArray3 = new int[lIlIIIIlll[1]];
                    nArray3[p.lIlIIIIlll[0]] = lIlIIIIlll[16];
                    if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray3) ? 1 : 0)) break block23;
                    int[] nArray4 = new int[lIlIIIIlll[1]];
                    nArray4[p.lIlIIIIlll[0]] = lIlIIIIlll[17];
                    if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray4) ? 1 : 0)) break block23;
                    int[] nArray5 = new int[lIlIIIIlll[1]];
                    nArray5[p.lIlIIIIlll[0]] = lIlIIIIlll[18];
                    if (!p.lIIIlIIlIIIII(Equipment.contains((int[])nArray5) ? 1 : 0)) break block24;
                }
                p.aM();
            }
            if (p.lIIIlIIlIIllI(p.lIIIlIIIlllll(e.u(), 45.0))) {
                int[] nArray = new int[lIlIIIIlll[1]];
                nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[12];
                if (p.lIIIlIIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray6 = new int[lIlIIIIlll[1]];
                    nArray6[p.lIlIIIIlll[0]] = lIlIIIIlll[12];
                    Inventory.getFirst((int[])nArray6).interact(lIlIIIIllI[lIlIIIIlll[19]]);
                    Time.sleepTicks((int)lIlIIIIlll[1]);

                }
            }
            if (p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[20]) && p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[20])) {
                p.aI();
            }
            if (p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[21]) && !p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[20]) || p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[21]) && !p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[20]) || p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[21]) && !p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[20]) || p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[20]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[20])) {
                p.aj();
            }
            if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[21]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.STRENGTH), lIlIIIIlll[21]) && p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.DEFENCE), lIlIIIIlll[21])) {
                p.ah();
            }
        }
    }

    private static  boolean b(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aL() {
        int n2;
        block3: {
            block8: {
                block7: {
                    block6: {
                        block5: {
                            block4: {
                                block2: {
                                    int[] nArray = new int[lIlIIIIlll[1]];
                                    nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[14];
                                    if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block2;
                                    int[] nArray2 = new int[lIlIIIIlll[1]];
                                    nArray2[p.lIlIIIIlll[0]] = lIlIIIIlll[14];
                                    if (!p.lIIIlIIlIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                                    int[] nArray3 = new int[lIlIIIIlll[1]];
                                    nArray3[p.lIlIIIIlll[0]] = lIlIIIIlll[14];
                                    if (!p.lIIIlIIlIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) break block3;
                                }
                                int[] nArray = new int[lIlIIIIlll[1]];
                                nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[15];
                                if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block4;
                                int[] nArray4 = new int[lIlIIIIlll[1]];
                                nArray4[p.lIlIIIIlll[0]] = lIlIIIIlll[15];
                                if (!p.lIIIlIIlIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
                                int[] nArray5 = new int[lIlIIIIlll[1]];
                                nArray5[p.lIlIIIIlll[0]] = lIlIIIIlll[15];
                                if (!p.lIIIlIIlIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block3;
                            }
                            int[] nArray = new int[lIlIIIIlll[1]];
                            nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[16];
                            if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                            int[] nArray6 = new int[lIlIIIIlll[1]];
                            nArray6[p.lIlIIIIlll[0]] = lIlIIIIlll[16];
                            if (!p.lIIIlIIlIIIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block5;
                            int[] nArray7 = new int[lIlIIIIlll[1]];
                            nArray7[p.lIlIIIIlll[0]] = lIlIIIIlll[16];
                            if (!p.lIIIlIIlIIIII(Bank.contains((int[])nArray7) ? 1 : 0)) break block3;
                        }
                        int[] nArray = new int[lIlIIIIlll[1]];
                        nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[17];
                        if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block6;
                        int[] nArray8 = new int[lIlIIIIlll[1]];
                        nArray8[p.lIlIIIIlll[0]] = lIlIIIIlll[17];
                        if (!p.lIIIlIIlIIIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block6;
                        int[] nArray9 = new int[lIlIIIIlll[1]];
                        nArray9[p.lIlIIIIlll[0]] = lIlIIIIlll[17];
                        if (!p.lIIIlIIlIIIII(Bank.contains((int[])nArray9) ? 1 : 0)) break block3;
                    }
                    int[] nArray = new int[lIlIIIIlll[1]];
                    nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[18];
                    if (!p.lIIIlIIlIIIlI(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                    int[] nArray10 = new int[lIlIIIIlll[1]];
                    nArray10[p.lIlIIIIlll[0]] = lIlIIIIlll[18];
                    if (!p.lIIIlIIlIIIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block7;
                    int[] nArray11 = new int[lIlIIIIlll[1]];
                    nArray11[p.lIlIIIIlll[0]] = lIlIIIIlll[18];
                    if (!p.lIIIlIIlIIIII(Bank.contains((int[])nArray11) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[lIlIIIIlll[1]];
                nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[12];
                if (!p.lIIIlIIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block8;
                int[] nArray12 = new int[lIlIIIIlll[1]];
                nArray12[p.lIlIIIIlll[0]] = lIlIIIIlll[12];
                if (!p.lIIIlIIlIIIII(Bank.contains((int[])nArray12) ? 1 : 0)) break block3;
            }
            n2 = lIlIIIIlll[1];

            if (-1 <= (0x30 ^ 0x47 ^ (0xFF ^ 0x8C))) return n2 != 0;
            return ((0x15 ^ 0x73 ^ (0x7C ^ 0x15)) & (0x17 ^ 0x57 ^ (0xDD ^ 0x92) ^ -1)) != 0;
        }
        n2 = lIlIIIIlll[0];
        return n2 != 0;
    }

    public static void aj() {
        if (p.lIIIlIIlIIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (p.lIIIlIIlIIIlI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[52]];
            Movement.walkTo((WorldPoint)cK);

            Time.sleepTicks((int)lIlIIIIlll[1]);

        }
        if (p.lIIIlIIlIIIII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[53]];
            p.ak();
        }
    }

    private static boolean lIIIlIIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void O() {
        d var6;
        int[] nArray = new int[lIlIIIIlll[1]];
        nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[12];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIlIIIIlll[12], lIlIIIIlll[13], lIlIIIIlll[54]);
            bp.add(d2);

        }
        int[] nArray2 = new int[lIlIIIIlll[1]];
        nArray2[p.lIlIIIIlll[0]] = lIlIIIIlll[18];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var6 = new DHelper(lIlIIIIlll[18], lIlIIIIlll[1], lIlIIIIlll[55]);
            bp.add(var6);

        }
        int[] nArray3 = new int[lIlIIIIlll[1]];
        nArray3[p.lIlIIIIlll[0]] = lIlIIIIlll[14];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var6 = new DHelper(lIlIIIIlll[14], lIlIIIIlll[1], lIlIIIIlll[7]);
            bp.add(var6);

        }
        int[] nArray4 = new int[lIlIIIIlll[1]];
        nArray4[p.lIlIIIIlll[0]] = lIlIIIIlll[15];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var6 = new DHelper(lIlIIIIlll[15], lIlIIIIlll[1], lIlIIIIlll[7]);
            bp.add(var6);

        }
        int[] nArray5 = new int[lIlIIIIlll[1]];
        nArray5[p.lIlIIIIlll[0]] = lIlIIIIlll[16];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var6 = new DHelper(lIlIIIIlll[16], lIlIIIIlll[1], lIlIIIIlll[56]);
            bp.add(var6);

        }
        int[] nArray6 = new int[lIlIIIIlll[1]];
        nArray6[p.lIlIIIIlll[0]] = lIlIIIIlll[17];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var6 = new DHelper(lIlIIIIlll[17], lIlIIIIlll[1], lIlIIIIlll[56]);
            bp.add(var6);

        }
    }

    /*
     * WARNING - void declaration
     */
    private static void ah() {
        void var7;
        NPC var8;
        WorldArea worldArea = new WorldArea(lIlIIIIlll[22], lIlIIIIlll[23], lIlIIIIlll[24], lIlIIIIlll[25], lIlIIIIlll[0]);
        WorldPoint worldPoint = new WorldPoint(lIlIIIIlll[26], lIlIIIIlll[27], lIlIIIIlll[0]);
        WorldPoint worldPoint2 = new WorldPoint(lIlIIIIlll[28], lIlIIIIlll[29], lIlIIIIlll[0]);
        e.D();
        if (p.lIIIlIIlIIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var9;
            WorldPoint worldPoint3 = new WorldPoint(lIlIIIIlll[30], lIlIIIIlll[31], lIlIIIIlll[0]);
            WorldPoint worldPoint4 = new WorldPoint(lIlIIIIlll[30], lIlIIIIlll[32], lIlIIIIlll[0]);
            if (!p.lIIIlIIlIIIlI(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || p.lIIIlIIlIIIII(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                var8 = new WorldPoint(lIlIIIIlll[33], lIlIIIIlll[34], lIlIIIIlll[0]);
                e.c((WorldPoint)var8);
                Time.sleepUntil(() -> p.e((WorldPoint)var8), (int)lIlIIIIlll[35]);

            }
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[36]];
            Movement.walkTo((WorldPoint)var9);

            Time.sleepTicks((int)lIlIIIIlll[1]);

        }
        List var10 = Players.getAll(arg_0 -> p.b((WorldArea)var7, arg_0));
        if (p.lIIIlIIlIIIII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIIIlIIlIIIll(var10.size(), lIlIIIIlll[19])) {
            void var11;
            if (p.lIIIlIIlIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var11), lIlIIIIlll[5])) {
                AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[37]];
                Movement.walkTo((WorldPoint)var11);

                Time.sleepTicks((int)lIlIIIIlll[1]);

            }
            if (p.lIIIlIIlIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var11), lIlIIIIlll[5])) {
                AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[38]];
                p.B();
            }
        }
        if (p.lIIIlIIlIIIII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIIIlIIlIIIIl(var10.size(), lIlIIIIlll[19])) {
            if (p.lIIIlIIlIIlII(Players.getLocal().getInteracting())) {
                AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[39]];
            }
            if (p.lIIIlIIlIlIIl(Players.getLocal().getInteracting())) {
                NPC var12 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (p.lIIIlIIlIIIII(nPC.getName().contains(lIlIIIIllI[lIlIIIIlll[73]]) ? 1 : 0) && p.lIIIlIIlIlIIl(nPC.getInteracting()) && p.lIIIlIIlIIIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIlIIIIlll[1];

                        }
                    } else {
                        n2 = lIlIIIIlll[0];
                    }
                    return n2 != 0;
                });
                var8 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (p.lIIIlIIlIIIII(nPC.getName().contains(lIlIIIIllI[lIlIIIIlll[72]]) ? 1 : 0) && p.lIIIlIIlIllIl(nPC.getInteracting(), Players.getLocal()) && p.lIIIlIIlIIIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIlIIIIlll[1];

                    } else {
                        n2 = lIlIIIIlll[0];
                    }
                    return n2 != 0;
                });
                if (p.lIIIlIIlIIlII(var12) && p.lIIIlIIlIlIIl(var8)) {
                    AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[40]];
                    var12.interact(lIlIIIIllI[lIlIIIIlll[2]]);
                    Time.sleepTicks((int)lIlIIIIlll[5]);

                }
            }
        }
    }

    private static boolean lIIIlIIlIIllI(int n2) {
        return n2 < 0;
    }

    public static void aI() {
        if (p.lIIIlIIlIIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (p.lIIIlIIlIIIlI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[41]];
            Movement.walkTo((WorldPoint)new WorldPoint(lIlIIIIlll[42], lIlIIIIlll[43], lIlIIIIlll[0]));

            Time.sleepTicks((int)lIlIIIIlll[1]);

        }
        if (p.lIIIlIIlIIIII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[3]];
            p.ak();
        }
    }

    private static boolean lIIIlIIlIlIll(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public int ad() {
        try {
            p.aH();

        }
        catch (Exception var13) {
            var13.printStackTrace();
        }
        if (2 == 0) {
            return (86 + 26 - 99 + 175 ^ 60 + 43 - 33 + 67) & (0xE8 ^ 0x89 ^ (0xCA ^ 0x9E) ^ -1);
        }
        return lIlIIIIlll[0];
    }

    public static void aJ() {
        e.D();
        if (p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[9])) {
            int[] nArray = new int[lIlIIIIlll[1]];
            nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[14];
            if (p.lIIIlIIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIIIlll[1]];
                nArray2[p.lIlIIIIlll[0]] = lIlIIIIlll[14];
                Inventory.getFirst((int[])nArray2).interact(lIlIIIIllI[lIlIIIIlll[47]]);
            }
        }
        if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[9]) && p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[20])) {
            int[] nArray = new int[lIlIIIIlll[1]];
            nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[15];
            if (p.lIIIlIIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lIlIIIIlll[1]];
                nArray3[p.lIlIIIIlll[0]] = lIlIIIIlll[15];
                Inventory.getFirst((int[])nArray3).interact(lIlIIIIllI[lIlIIIIlll[20]]);
            }
        }
        if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[20]) && p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[21])) {
            int[] nArray = new int[lIlIIIIlll[1]];
            nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[16];
            if (p.lIIIlIIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lIlIIIIlll[1]];
                nArray4[p.lIlIIIIlll[0]] = lIlIIIIlll[16];
                Inventory.getFirst((int[])nArray4).interact(lIlIIIIllI[lIlIIIIlll[48]]);
            }
        }
        if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[21]) && p.lIIIlIIlIIIIl(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[49])) {
            int[] nArray = new int[lIlIIIIlll[1]];
            nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[17];
            if (p.lIIIlIIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[lIlIIIIlll[1]];
                nArray5[p.lIlIIIIlll[0]] = lIlIIIIlll[17];
                Inventory.getFirst((int[])nArray5).interact(lIlIIIIllI[lIlIIIIlll[50]]);
            }
        }
        if (p.lIIIlIIlIIIll(Skills.getLevel((Skill)Skill.ATTACK), lIlIIIIlll[49])) {
            int[] nArray = new int[lIlIIIIlll[1]];
            nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[18];
            if (p.lIIIlIIlIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray6 = new int[lIlIIIIlll[1]];
                nArray6[p.lIlIIIIlll[0]] = lIlIIIIlll[18];
                Inventory.getFirst((int[])nArray6).interact(lIlIIIIllI[lIlIIIIlll[51]]);
            }
        }
    }

    private static int lIIIlIIIlllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void B() {
        World world2 = Worlds.getRandom(world -> {
            int n2;
            if (p.lIIIlIIlIIIlI(world.isMembers() ? 1 : 0) && p.lIIIlIIlIlIII(world.getPlayerCount(), lIlIIIIlll[58]) && p.lIIIlIIlIllII(world.getId(), Worlds.getCurrentId()) && p.lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[59]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[60]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[61]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[21]]) ? 1 : 0) && p.lIIIlIIlIllII(world.getId(), lIlIIIIlll[62]) && p.lIIIlIIlIllII(world.getId(), lIlIIIIlll[63]) && p.lIIIlIIlIllII(world.getId(), lIlIIIIlll[63]) && p.lIIIlIIlIIIlI(world.getActivity().contains(lIlIIIIllI[lIlIIIIlll[64]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().contains(lIlIIIIllI[lIlIIIIlll[65]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().contains(lIlIIIIllI[lIlIIIIlll[66]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[67]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[68]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[69]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[70]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[24]]) ? 1 : 0) && p.lIIIlIIlIIlll(world.getPlayerCount(), lIlIIIIlll[21])) {
                n2 = lIlIIIIlll[1];

                if (((0x88 ^ 0x95 ^ (8 ^ 0x5E)) & (73 + 15 - -20 + 101 ^ 151 + 110 - 147 + 40 ^ -1)) < 0) {
                    return ((2 ^ (0x68 ^ 0x46)) & (29 + 49 - -10 + 78 ^ 124 + 43 - 103 + 74 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIIIlll[0];
            }
            return n2 != 0;
        });
        Worlds.hopTo((World)world2);
    }
}

