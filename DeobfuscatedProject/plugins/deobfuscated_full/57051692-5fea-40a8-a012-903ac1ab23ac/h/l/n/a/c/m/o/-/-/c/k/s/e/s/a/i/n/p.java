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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.h;
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
implements K {
    private static /* synthetic */ String[] lIlIIIIllI;
    public static /* synthetic */ List<d> bp;
    public static /* synthetic */ int[] cE;
    public static /* synthetic */ WorldArea cF;
    public static /* synthetic */ WorldPoint cK;
    public static /* synthetic */ WorldArea cH;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ int[] lIlIIIIlll;
    public static /* synthetic */ WorldPoint ce;
    public static /* synthetic */ WorldPoint cJ;
    public static /* synthetic */ WorldArea cG;
    public static /* synthetic */ WorldArea cd;
    public static /* synthetic */ WorldPoint cI;
    public static /* synthetic */ boolean cD;

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

    private static /* synthetic */ boolean e(WorldPoint worldPoint) {
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
                0;
            }
        }
        e.D();
        if (p.lIIIlIIlIlIIl(Players.getLocal().getInteracting())) {
            NPC var22 = NPCs.getNearest(nPC -> {
                int n2;
                if (!p.lIIIlIIlIIIlI(nPC.getName().contains(lIlIIIIllI[lIlIIIIlll[25]]) ? 1 : 0) || p.lIIIlIIlIIIII(nPC.getName().contains(lIlIIIIllI[lIlIIIIlll[49]]) ? 1 : 0)) {
                    NPC var25;
                    String[] stringArray = new String[lIlIIIIlll[1]];
                    stringArray[p.lIlIIIIlll[0]] = lIlIIIIllI[lIlIIIIlll[71]];
                    if (p.lIIIlIIlIIIII(var25.hasAction(stringArray) ? 1 : 0) && p.lIIIlIIlIlIIl(var25.getInteracting()) && p.lIIIlIIlIIIlI(var25.isDead() ? 1 : 0)) {
                        n2 = lIlIIIIlll[1];
                        0;
                        if (-(0xF4 ^ 0x8F ^ 118 + 13 - 89 + 85) <= 0) return n2 != 0;
                        return ((0x19 ^ 0x44 ^ (0xF5 ^ 0x8F)) & (102 + 71 - 8 + 19 ^ 33 + 99 - 13 + 40 ^ -1)) != 0;
                    }
                }
                n2 = lIlIIIIlll[0];
                return n2 != 0;
            });
            String[] stringArray = new String[lIlIIIIlll[1]];
            stringArray[p.lIlIIIIlll[0]] = lIlIIIIllI[lIlIIIIlll[44]];
            List var4 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (p.lIIIlIIlIllIl(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIlIIIIlll[1];
                    0;
                    
                    }
                } else {
                    bl = lIlIIIIlll[0];
                }
                return bl;
            }).collect(Collectors.toList());
            if (p.lIIIlIIlIIlII(var22) && p.lIIIlIIlIIIII(var4.isEmpty() ? 1 : 0) && p.lIIIlIIlIIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                var22.interact(lIlIIIIllI[lIlIIIIlll[45]]);
                Time.sleepTicks((int)lIlIIIIlll[6]);
                0;
            }
            if (p.lIIIlIIlIIIlI(var4.isEmpty() ? 1 : 0) && p.lIIIlIIlIlIIl(Players.getLocal().getInteracting())) {
                ((NPC)var4.get(lIlIIIIlll[0])).interact(lIlIIIIllI[lIlIIIIlll[46]]);
                Time.sleepTicks((int)lIlIIIIlll[6]);
                0;
            }
        }
    }

    private static void lIIIlIIIlllIl() {
        lIlIIIIllI = new String[lIlIIIIlll[89]];
        p.lIlIIIIllI[p.lIlIIIIlll[0]] = p."Buying items";
        p.lIlIIIIllI[p.lIlIIIIlll[1]] = p."Finished buying items, switching back to melee training";
        p.lIlIIIIllI[p.lIlIIIIlll[5]] = p."Navigating to bank";
        p.lIlIIIIllI[p.lIlIIIIlll[6]] = p."Handling banking";
        p.lIlIIIIllI[p.lIlIIIIlll[8]] = p."We are missing supplies, switching to BUYING";
        p.lIlIIIIllI[p.lIlIIIIlll[9]] = p."f2pmelee";
        p.lIlIIIIllI[p.lIlIIIIlll[19]] = p."Eat";
        p.lIlIIIIllI[p.lIlIIIIlll[36]] = p."Nav to hill giants";
        p.lIlIIIIllI[p.lIlIIIIlll[37]] = p."Run to hop tile";
        p.lIlIIIIllI[p.lIlIIIIlll[38]] = p."World hopping";
        p.lIlIIIIllI[p.lIlIIIIlll[39]] = p."In combat";
        p.lIlIIIIllI[p.lIlIIIIlll[40]] = p."Attacking hill giant";
        p.lIlIIIIllI[p.lIlIIIIlll[2]] = p."Attack";
        p.lIlIIIIllI[p.lIlIIIIlll[41]] = p."Nav to cows";
        p.lIlIIIIllI[p.lIlIIIIlll[3]] = p."Attacking cows";
        p.lIlIIIIllI[p.lIlIIIIlll[4]] = p."Eat";
        p.lIlIIIIllI[p.lIlIIIIlll[44]] = p."cow";
        p.lIlIIIIllI[p.lIlIIIIlll[45]] = p."Attack";
        p.lIlIIIIllI[p.lIlIIIIlll[46]] = p."Attack";
        p.lIlIIIIllI[p.lIlIIIIlll[47]] = p."Wield";
        p.lIlIIIIllI[p.lIlIIIIlll[20]] = p."Wield";
        p.lIlIIIIllI[p.lIlIIIIlll[48]] = p."Wield";
        p.lIlIIIIllI[p.lIlIIIIlll[50]] = p."Wield";
        p.lIlIIIIllI[p.lIlIIIIlll[51]] = p."Wield";
        p.lIlIIIIllI[p.lIlIIIIlll[52]] = p."Nav to cows";
        p.lIlIIIIllI[p.lIlIIIIlll[53]] = p."Attacking cows";
        p.lIlIIIIllI[p.lIlIIIIlll[57]] = p."12/14/15 Melee";
        p.lIlIIIIllI[p.lIlIIIIlll[59]] = p."total";
        p.lIlIIIIllI[p.lIlIIIIlll[60]] = p."PvP";
        p.lIlIIIIllI[p.lIlIIIIlll[61]] = p."PvP";
        p.lIlIIIIllI[p.lIlIIIIlll[21]] = p."High";
        p.lIlIIIIllI[p.lIlIIIIlll[64]] = p."Leagues";
        p.lIlIIIIllI[p.lIlIIIIlll[65]] = p."Beta";
        p.lIlIIIIllI[p.lIlIIIIlll[66]] = p."beta";
        p.lIlIIIIllI[p.lIlIIIIlll[67]] = p."Deadman";
        p.lIlIIIIllI[p.lIlIIIIlll[68]] = p."Deadman";
        p.lIlIIIIllI[p.lIlIIIIlll[69]] = p."Speedrunning";
        p.lIlIIIIllI[p.lIlIIIIlll[70]] = p."total";
        p.lIlIIIIllI[p.lIlIIIIlll[24]] = p."Beta";
        p.lIlIIIIllI[p.lIlIIIIlll[25]] = p."calf";
        p.lIlIIIIllI[p.lIlIIIIlll[49]] = p."Cow";
        p.lIlIIIIllI[p.lIlIIIIlll[71]] = p."Attack";
        p.lIlIIIIllI[p.lIlIIIIlll[72]] = p."Hill";
        p.lIlIIIIllI[p.lIlIIIIlll[73]] = p."Hill";
    }

    private static boolean lIIIlIIlIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static String lIIIlIIIllIlI(String var31, String var2) {
        var31 = new String(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var8 = var2.toCharArray();
        int var3 = lIlIIIIlll[0];
        char[] var19 = var31.toCharArray();
        int var16 = var19.length;
        int var7 = lIlIIIIlll[0];
        while (p.lIIIlIIlIIIIl(var7, var16)) {
            char var5 = var19[var7];
            var11.append((char)(var5 ^ var8[var3 % var8.length]));
            0;
            ++var3;
            ++var7;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var11);
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
            0;
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
                0;
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
                        BankLocation var9 = BankLocation.getNearest();
                        if (p.lIIIlIIlIIlII(var9) && p.lIIIlIIlIIIlI(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[5]];
                            a.a(var9);
                        }
                        if (p.lIIIlIIlIIlII(var9) && p.lIIIlIIlIIIII(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[6]];
                            if (p.lIIIlIIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIIlll[7]);
                                0;
                            }
                            if (p.lIIIlIIlIIIII(Bank.isOpen() ? 1 : 0)) {
                                if (p.lIIIlIIlIIlIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIlIIIIlll[1]);
                                    0;
                                }
                                if (p.lIIIlIIlIIlIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIlIIIIlll[5]);
                                    0;
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
                                    0;
                                    0;
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
                    0;
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

    private static /* synthetic */ boolean b(WorldArea worldArea, Player player) {
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
            0;
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
            0;
            Time.sleepTicks((int)lIlIIIIlll[1]);
            0;
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
        d var14;
        int[] nArray = new int[lIlIIIIlll[1]];
        nArray[p.lIlIIIIlll[0]] = lIlIIIIlll[12];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlIIIIlll[12], lIlIIIIlll[13], lIlIIIIlll[54]);
            bp.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIIIIlll[1]];
        nArray2[p.lIlIIIIlll[0]] = lIlIIIIlll[18];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var14 = new d(lIlIIIIlll[18], lIlIIIIlll[1], lIlIIIIlll[55]);
            bp.add(var14);
            0;
        }
        int[] nArray3 = new int[lIlIIIIlll[1]];
        nArray3[p.lIlIIIIlll[0]] = lIlIIIIlll[14];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var14 = new d(lIlIIIIlll[14], lIlIIIIlll[1], lIlIIIIlll[7]);
            bp.add(var14);
            0;
        }
        int[] nArray4 = new int[lIlIIIIlll[1]];
        nArray4[p.lIlIIIIlll[0]] = lIlIIIIlll[15];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var14 = new d(lIlIIIIlll[15], lIlIIIIlll[1], lIlIIIIlll[7]);
            bp.add(var14);
            0;
        }
        int[] nArray5 = new int[lIlIIIIlll[1]];
        nArray5[p.lIlIIIIlll[0]] = lIlIIIIlll[16];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var14 = new d(lIlIIIIlll[16], lIlIIIIlll[1], lIlIIIIlll[56]);
            bp.add(var14);
            0;
        }
        int[] nArray6 = new int[lIlIIIIlll[1]];
        nArray6[p.lIlIIIIlll[0]] = lIlIIIIlll[17];
        if (p.lIIIlIIlIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var14 = new d(lIlIIIIlll[17], lIlIIIIlll[1], lIlIIIIlll[56]);
            bp.add(var14);
            0;
        }
    }

    private static String lIIIlIIIllIll(String var26, String var18) {
        try {
            SecretKeySpec var28 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var30 = Cipher.getInstance("Blowfish");
            var30.init(lIlIIIIlll[5], var28);
            return new String(var30.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIlllII(String var29, String var20) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIlIIIIlll[37]), "DES");
            Cipher var27 = Cipher.getInstance("DES");
            var27.init(lIlIIIIlll[5], var6);
            return new String(var27.doFinal(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void ah() {
        void var12;
        NPC var17;
        WorldArea worldArea = new WorldArea(lIlIIIIlll[22], lIlIIIIlll[23], lIlIIIIlll[24], lIlIIIIlll[25], lIlIIIIlll[0]);
        WorldPoint worldPoint = new WorldPoint(lIlIIIIlll[26], lIlIIIIlll[27], lIlIIIIlll[0]);
        WorldPoint worldPoint2 = new WorldPoint(lIlIIIIlll[28], lIlIIIIlll[29], lIlIIIIlll[0]);
        e.D();
        if (p.lIIIlIIlIIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var21;
            WorldPoint worldPoint3 = new WorldPoint(lIlIIIIlll[30], lIlIIIIlll[31], lIlIIIIlll[0]);
            WorldPoint worldPoint4 = new WorldPoint(lIlIIIIlll[30], lIlIIIIlll[32], lIlIIIIlll[0]);
            if (!p.lIIIlIIlIIIlI(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || p.lIIIlIIlIIIII(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                var17 = new WorldPoint(lIlIIIIlll[33], lIlIIIIlll[34], lIlIIIIlll[0]);
                e.c((WorldPoint)var17);
                Time.sleepUntil(() -> p.e((WorldPoint)var17), (int)lIlIIIIlll[35]);
                0;
            }
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[36]];
            Movement.walkTo((WorldPoint)var21);
            0;
            Time.sleepTicks((int)lIlIIIIlll[1]);
            0;
        }
        List var15 = Players.getAll(arg_0 -> p.b((WorldArea)var12, arg_0));
        if (p.lIIIlIIlIIIII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIIIlIIlIIIll(var15.size(), lIlIIIIlll[19])) {
            void var24;
            if (p.lIIIlIIlIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var24), lIlIIIIlll[5])) {
                AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[37]];
                Movement.walkTo((WorldPoint)var24);
                0;
                Time.sleepTicks((int)lIlIIIIlll[1]);
                0;
            }
            if (p.lIIIlIIlIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var24), lIlIIIIlll[5])) {
                AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[38]];
                p.B();
            }
        }
        if (p.lIIIlIIlIIIII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && p.lIIIlIIlIIIIl(var15.size(), lIlIIIIlll[19])) {
            if (p.lIIIlIIlIIlII(Players.getLocal().getInteracting())) {
                AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[39]];
            }
            if (p.lIIIlIIlIlIIl(Players.getLocal().getInteracting())) {
                NPC var23 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (p.lIIIlIIlIIIII(nPC.getName().contains(lIlIIIIllI[lIlIIIIlll[73]]) ? 1 : 0) && p.lIIIlIIlIlIIl(nPC.getInteracting()) && p.lIIIlIIlIIIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIlIIIIlll[1];
                        0;
                        
                        }
                    } else {
                        n2 = lIlIIIIlll[0];
                    }
                    return n2 != 0;
                });
                var17 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (p.lIIIlIIlIIIII(nPC.getName().contains(lIlIIIIllI[lIlIIIIlll[72]]) ? 1 : 0) && p.lIIIlIIlIllIl(nPC.getInteracting(), Players.getLocal()) && p.lIIIlIIlIIIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIlIIIIlll[1];
                        0;
                        if (-1 >= 0) {
                            return false;
                        }
                    } else {
                        n2 = lIlIIIIlll[0];
                    }
                    return n2 != 0;
                });
                if (p.lIIIlIIlIIlII(var23) && p.lIIIlIIlIlIIl(var17)) {
                    AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[40]];
                    var23.interact(lIlIIIIllI[lIlIIIIlll[2]]);
                    Time.sleepTicks((int)lIlIIIIlll[5]);
                    0;
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
            0;
            Time.sleepTicks((int)lIlIIIIlll[1]);
            0;
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
            0;
        }
        catch (Exception var1) {
            var1.printStackTrace();
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

    private static void lIIIlIIIllllI() {
        lIlIIIIlll = new int[90];
        p.lIlIIIIlll[0] = (0x94 ^ 0x91) & ~(0xA3 ^ 0xA6);
        p.lIlIIIIlll[1] = 1;
        p.lIlIIIIlll[2] = 0x6B ^ 0x67;
        p.lIlIIIIlll[3] = 0x7C ^ 0x72;
        p.lIlIIIIlll[4] = 0x26 ^ 0x39 ^ (0xB ^ 0x1B);
        p.lIlIIIIlll[5] = 2;
        p.lIlIIIIlll[6] = 3;
        p.lIlIIIIlll[7] = 0xFFFF97AC & 0x7BDB;
        p.lIlIIIIlll[8] = 98 + 88 - 71 + 59 ^ 70 + 80 - 130 + 150;
        p.lIlIIIIlll[9] = 0xC5 ^ 0xC0;
        p.lIlIIIIlll[10] = -(0xFFFFFD5D & 0x3EBB) & (0xFFFFFFFB & 0x3FFF);
        p.lIlIIIIlll[11] = 0xFFFFC7E9 & 0x3BFE;
        p.lIlIIIIlll[12] = -(0xFFFFFDCD & 0x7EB7) & (0xFFFFFFFF & 0x7DFF);
        p.lIlIIIIlll[13] = 0x48 ^ 0x10 ^ (0x47 ^ 0x7B);
        p.lIlIIIIlll[14] = -(0xFFFFDEB5 & 0x33DF) & (0xFFFFFFBF & 0x17FF);
        p.lIlIIIIlll[15] = 0xFFFFF73D & 0xDEF;
        p.lIlIIIIlll[16] = -(0xFFFFAEEF & 0x79D7) & (0xFFFFFDF7 & 0x2FFF);
        p.lIlIIIIlll[17] = 0xFFFFDD7B & 0x27B7;
        p.lIlIIIIlll[18] = -(0xFFFFBAEF & 0x55DB) & (0xFFFF9DFF & 0x77FF);
        p.lIlIIIIlll[19] = 0xBF ^ 0x81 ^ (9 ^ 0x31);
        p.lIlIIIIlll[20] = 141 + 76 - 62 + 12 ^ 15 + 97 - -48 + 19;
        p.lIlIIIIlll[21] = 0x3A ^ 0x4C ^ (0xDA ^ 0xB2);
        p.lIlIIIIlll[22] = 0xFFFF8D7B & 0x7F9F;
        p.lIlIIIIlll[23] = -(0xFFFF8FE5 & 0x735B) & (0xFFFFFF7B & 0xFFF);
        p.lIlIIIIlll[24] = 0x22 ^ 4;
        p.lIlIIIIlll[25] = 0x7E ^ 0x59;
        p.lIlIIIIlll[26] = -(0xFFFFFBCB & 0x76FD) & (0xFFFFFFFB & 0x7FFD);
        p.lIlIIIIlll[27] = 0xFFFFCE4E & 0x3DFF;
        p.lIlIIIIlll[28] = -(0xFFFFF2FE & 0x7D97) & (0xFFFFFDBF & Short.MAX_VALUE);
        p.lIlIIIIlll[29] = 0xFFFF9D7E & 0x6EDF;
        p.lIlIIIIlll[30] = 0xFFFF8FCE & 0x7CF5;
        p.lIlIIIIlll[31] = -(0xFFFFF871 & 0x57AF) & (0xFFFFFDBE & 0x5EFD);
        p.lIlIIIIlll[32] = 0xFFFFAE9B & 0x5DFF;
        p.lIlIIIIlll[33] = -(0xFFFFF1AB & 0x3E76) & (0xFFFFBDFF & 0x7EEF);
        p.lIlIIIIlll[34] = -(0xFFFFBB6B & 0x65F5) & (0xFFFFBFFB & 0x6DFE);
        p.lIlIIIIlll[35] = -(0xFFFFCF2D & 0x76F6) & (0xFFFFD7B7 & Short.MAX_VALUE);
        p.lIlIIIIlll[36] = 0x24 ^ 0x61 ^ (0xD3 ^ 0x91);
        p.lIlIIIIlll[37] = 0 ^ 0x72 ^ (0x77 ^ 0xD);
        p.lIlIIIIlll[38] = 0x76 ^ 0x47 ^ (0x6A ^ 0x52);
        p.lIlIIIIlll[39] = 1 ^ 0xB;
        p.lIlIIIIlll[40] = 0x81 ^ 0x8A;
        p.lIlIIIIlll[41] = 0xA5 ^ 0xA8;
        p.lIlIIIIlll[42] = 0xFFFFCF73 & 0x3CEE;
        p.lIlIIIIlll[43] = 0xFFFF8F42 & 0x7DBF;
        p.lIlIIIIlll[44] = 0xF4 ^ 0x85 ^ (0x6F ^ 0xE);
        p.lIlIIIIlll[45] = 0x9F ^ 0x8E;
        p.lIlIIIIlll[46] = 55 + 97 - 120 + 97 ^ 56 + 3 - 26 + 114;
        p.lIlIIIIlll[47] = 0x89 ^ 0x9A;
        p.lIlIIIIlll[48] = 0x50 ^ 0x37 ^ (0xF3 ^ 0x81);
        p.lIlIIIIlll[49] = 0x74 ^ 0x32 ^ (0x54 ^ 0x3A);
        p.lIlIIIIlll[50] = 127 + 53 - 36 + 35 ^ 140 + 70 - 123 + 78;
        p.lIlIIIIlll[51] = 0xB5 ^ 0xA2;
        p.lIlIIIIlll[52] = 0x6D ^ 0x31 ^ (0x26 ^ 0x62);
        p.lIlIIIIlll[53] = 0xBA ^ 0xA3;
        p.lIlIIIIlll[54] = -(0xFFFFFF97 & 0x126A) & (0xFFFF9FFF & 0x73F5);
        p.lIlIIIIlll[55] = 0xFFFFE3A8 & 0x7DFF;
        p.lIlIIIIlll[56] = 0xFFFFFE9F & 0x3BF8;
        p.lIlIIIIlll[57] = 0x1B ^ 8 ^ (0x75 ^ 0x7C);
        p.lIlIIIIlll[58] = 0xFFFFB7DF & 0x4FBE;
        p.lIlIIIIlll[59] = 0x60 ^ 0x40 ^ (0xF8 ^ 0xC3);
        p.lIlIIIIlll[60] = 10 + 105 - -16 + 57 ^ 144 + 105 - 193 + 104;
        p.lIlIIIIlll[61] = 0x73 ^ 0x6E;
        p.lIlIIIIlll[62] = 0xFFFFD5DA & 0x2BFF;
        p.lIlIIIIlll[63] = -(0xFFFFF6BF & 0x4D6B) & (0xFFFFFEBF & 0x477F);
        p.lIlIIIIlll[64] = 0x3F ^ 0x58 ^ (0x78 ^ 0);
        p.lIlIIIIlll[65] = 73 + 46 - 0 + 52 ^ 113 + 35 - 118 + 109;
        p.lIlIIIIlll[66] = 0x1A ^ 0x16 ^ (0x65 ^ 0x48);
        p.lIlIIIIlll[67] = 1 + 137 - 128 + 154 ^ 121 + 98 - 194 + 109;
        p.lIlIIIIlll[68] = 0x25 ^ 0x1C ^ (0xAF ^ 0xB5);
        p.lIlIIIIlll[69] = 68 + 19 - 22 + 114 ^ 50 + 99 - 9 + 11;
        p.lIlIIIIlll[70] = 0x5C ^ 0x7F ^ (0x1B ^ 0x1D);
        p.lIlIIIIlll[71] = 0x5D ^ 0x74;
        p.lIlIIIIlll[72] = 0xA8 ^ 0x82;
        p.lIlIIIIlll[73] = 0x41 ^ 0x6A;
        p.lIlIIIIlll[74] = 0xFFFFCCDB & 0x3FBD;
        p.lIlIIIIlll[75] = 0xFFFFBDDA & 0x4EFF;
        p.lIlIIIIlll[76] = -(0xFFFFF5D6 & 0x1A6D) & (0xFFFFBEEF & 0x5DFF);
        p.lIlIIIIlll[77] = -(0xFFFFFA7F & 0x37A5) & (0xFFFFBEFE & 0x7FF5);
        p.lIlIIIIlll[78] = -(0xFFFF8F2F & 0x71DF) & (0xFFFFFD7F & 0xFFF);
        p.lIlIIIIlll[79] = 0xFFFFDC7F & 0x2FDF;
        p.lIlIIIIlll[80] = 6 ^ 0xB ^ (0x34 ^ 9);
        p.lIlIIIIlll[81] = 0xFFFFCDEF & 0x3E9D;
        p.lIlIIIIlll[82] = 0xFFFF9EFF & 0x6D6D;
        p.lIlIIIIlll[83] = -(0xFFFFEB0E & 0x35FB) & (0xFFFFAFBF & 0x7DFF);
        p.lIlIIIIlll[84] = 0xFFFFFEDF & 0xDBF;
        p.lIlIIIIlll[85] = -(0xFFFFFBCF & 0x5632) & (0xFFFFDEE9 & 0x7FF7);
        p.lIlIIIIlll[86] = -(0xFFFFB6C1 & 0x69BF) & (0xFFFFAFF3 & 0x7CDE);
        p.lIlIIIIlll[87] = 0xFFFF8FFF & 0x7CF7;
        p.lIlIIIIlll[88] = 0xFFFFAC69 & 0x5FF7;
        p.lIlIIIIlll[89] = 0xE ^ 0x22;
    }

    private static int lIIIlIIIlllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void B() {
        World world2 = Worlds.getRandom(world -> {
            int n2;
            if (p.lIIIlIIlIIIlI(world.isMembers() ? 1 : 0) && p.lIIIlIIlIlIII(world.getPlayerCount(), lIlIIIIlll[58]) && p.lIIIlIIlIllII(world.getId(), Worlds.getCurrentId()) && p.lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[59]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[60]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[61]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[21]]) ? 1 : 0) && p.lIIIlIIlIllII(world.getId(), lIlIIIIlll[62]) && p.lIIIlIIlIllII(world.getId(), lIlIIIIlll[63]) && p.lIIIlIIlIllII(world.getId(), lIlIIIIlll[63]) && p.lIIIlIIlIIIlI(world.getActivity().contains(lIlIIIIllI[lIlIIIIlll[64]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().contains(lIlIIIIllI[lIlIIIIlll[65]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().contains(lIlIIIIllI[lIlIIIIlll[66]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[67]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[68]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[69]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[70]]) ? 1 : 0) && p.lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[24]]) ? 1 : 0) && p.lIIIlIIlIIlll(world.getPlayerCount(), lIlIIIIlll[21])) {
                n2 = lIlIIIIlll[1];
                0;
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

