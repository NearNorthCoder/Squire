/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 */
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.PHelper;
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
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;

public class AEHelper
implements ab {
    public static  WorldArea cP;
    public static  WorldPoint cQ;
    public static  WorldPoint cm;
    public static  WorldArea cO;
    
    public static  int[] cM;
    public static  boolean bv;
    
    public static  List<d> bx;
    public static  WorldArea cN;
    public static  WorldPoint cR;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aN() {
        int n2;
        block15: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block14: {
                                            block4: {
                                                int n3;
                                                block6: {
                                                    block13: {
                                                        block12: {
                                                            block11: {
                                                                block10: {
                                                                    block9: {
                                                                        block8: {
                                                                            block7: {
                                                                                block5: {
                                                                                    if (!ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[2])) break block4;
                                                                                    int[] nArray = new int[lllIIlIll[1]];
                                                                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[17];
                                                                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[lllIIlIll[1]];
                                                                                    nArray2[ae.lllIIlIll[0]] = lllIIlIll[17];
                                                                                    if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[lllIIlIll[1]];
                                                                                    nArray3[ae.lllIIlIll[0]] = lllIIlIll[17];
                                                                                    if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[lllIIlIll[1]];
                                                                                nArray[ae.lllIIlIll[0]] = lllIIlIll[42];
                                                                                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[lllIIlIll[1]];
                                                                                nArray4[ae.lllIIlIll[0]] = lllIIlIll[42];
                                                                                if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[lllIIlIll[1]];
                                                                                nArray5[ae.lllIIlIll[0]] = lllIIlIll[42];
                                                                                if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[lllIIlIll[1]];
                                                                            nArray[ae.lllIIlIll[0]] = lllIIlIll[44];
                                                                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[lllIIlIll[1]];
                                                                            nArray6[ae.lllIIlIll[0]] = lllIIlIll[44];
                                                                            if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[lllIIlIll[1]];
                                                                            nArray7[ae.lllIIlIll[0]] = lllIIlIll[44];
                                                                            if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[lllIIlIll[1]];
                                                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[40];
                                                                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[lllIIlIll[1]];
                                                                        nArray8[ae.lllIIlIll[0]] = lllIIlIll[40];
                                                                        if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[lllIIlIll[1]];
                                                                        nArray9[ae.lllIIlIll[0]] = lllIIlIll[40];
                                                                        if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[lllIIlIll[1]];
                                                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[45];
                                                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[lllIIlIll[1]];
                                                                    nArray10[ae.lllIIlIll[0]] = lllIIlIll[45];
                                                                    if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[lllIIlIll[1]];
                                                                    nArray11[ae.lllIIlIll[0]] = lllIIlIll[45];
                                                                    if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[lllIIlIll[1]];
                                                                nArray[ae.lllIIlIll[0]] = lllIIlIll[47];
                                                                if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[lllIIlIll[1]];
                                                                nArray12[ae.lllIIlIll[0]] = lllIIlIll[47];
                                                                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[lllIIlIll[1]];
                                                                nArray13[ae.lllIIlIll[0]] = lllIIlIll[47];
                                                                if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[lllIIlIll[1]];
                                                            nArray[ae.lllIIlIll[0]] = lllIIlIll[49];
                                                            if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[lllIIlIll[1]];
                                                            nArray14[ae.lllIIlIll[0]] = lllIIlIll[49];
                                                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[lllIIlIll[1]];
                                                            nArray15[ae.lllIIlIll[0]] = lllIIlIll[49];
                                                            if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[lllIIlIll[1]];
                                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[11];
                                                        if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[lllIIlIll[1]];
                                                        nArray16[ae.lllIIlIll[0]] = lllIIlIll[11];
                                                        if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = lllIIlIll[1];

                                                    if (-1 != (0x66 ^ 0x62)) return n3 != 0;
                                                    return false;
                                                }
                                                n3 = lllIIlIll[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[lllIIlIll[1]];
                                            nArray[ae.lllIIlIll[0]] = lllIIlIll[16];
                                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[lllIIlIll[1]];
                                            nArray17[ae.lllIIlIll[0]] = lllIIlIll[16];
                                            if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[lllIIlIll[1]];
                                            nArray18[ae.lllIIlIll[0]] = lllIIlIll[16];
                                            if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[lllIIlIll[1]];
                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[42];
                                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[lllIIlIll[1]];
                                        nArray19[ae.lllIIlIll[0]] = lllIIlIll[42];
                                        if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[lllIIlIll[1]];
                                        nArray20[ae.lllIIlIll[0]] = lllIIlIll[42];
                                        if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[lllIIlIll[1]];
                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[44];
                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[lllIIlIll[1]];
                                    nArray21[ae.lllIIlIll[0]] = lllIIlIll[44];
                                    if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[lllIIlIll[1]];
                                    nArray22[ae.lllIIlIll[0]] = lllIIlIll[44];
                                    if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[lllIIlIll[1]];
                                nArray[ae.lllIIlIll[0]] = lllIIlIll[40];
                                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[lllIIlIll[1]];
                                nArray23[ae.lllIIlIll[0]] = lllIIlIll[40];
                                if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[lllIIlIll[1]];
                                nArray24[ae.lllIIlIll[0]] = lllIIlIll[40];
                                if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[lllIIlIll[1]];
                            nArray[ae.lllIIlIll[0]] = lllIIlIll[45];
                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[lllIIlIll[1]];
                            nArray25[ae.lllIIlIll[0]] = lllIIlIll[45];
                            if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[lllIIlIll[1]];
                            nArray26[ae.lllIIlIll[0]] = lllIIlIll[45];
                            if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[lllIIlIll[1]];
                        nArray[ae.lllIIlIll[0]] = lllIIlIll[47];
                        if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[lllIIlIll[1]];
                        nArray27[ae.lllIIlIll[0]] = lllIIlIll[47];
                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[lllIIlIll[1]];
                        nArray28[ae.lllIIlIll[0]] = lllIIlIll[47];
                        if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[lllIIlIll[1]];
                    nArray[ae.lllIIlIll[0]] = lllIIlIll[49];
                    if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[lllIIlIll[1]];
                    nArray29[ae.lllIIlIll[0]] = lllIIlIll[49];
                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[lllIIlIll[1]];
                    nArray30[ae.lllIIlIll[0]] = lllIIlIll[49];
                    if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[lllIIlIll[1]];
                nArray[ae.lllIIlIll[0]] = lllIIlIll[11];
                if (!ae.llIIIIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[lllIIlIll[1]];
                nArray31[ae.lllIIlIll[0]] = lllIIlIll[11];
                if (!ae.llIIIIlIlllI(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = lllIIlIll[1];

            if (null == null) return n2 != 0;
            return false;
        }
        n2 = lllIIlIll[0];
        return n2 != 0;
    }

    private static void llIIIIlIlIll() {
        lllIIlIlI = new String[lllIIlIll[71]];
        ae.lllIIlIlI[ae.lllIIlIll[0]] = "Buying items";
        ae.lllIIlIlI[ae.lllIIlIll[1]] = "Finished buying items, switching back to melee training";
        ae.lllIIlIlI[ae.lllIIlIll[3]] = "Navigating to bank";
        ae.lllIIlIlI[ae.lllIIlIll[4]] = "Handling banking";
        ae.lllIIlIlI[ae.lllIIlIll[6]] = "We are missing supplies, switching to BUYING";
        ae.lllIIlIlI[ae.lllIIlIll[10]] = "Iron scimitar";
        ae.lllIIlIlI[ae.lllIIlIll[14]] = "Steel scimitar";
        ae.lllIIlIlI[ae.lllIIlIll[15]] = "Mithril scimitar";
        ae.lllIIlIlI[ae.lllIIlIll[18]] = "Eat";
        ae.lllIIlIlI[ae.lllIIlIll[20]] = "Walking to cow area";
        ae.lllIIlIlI[ae.lllIIlIll[21]] = "Killing cows";
        ae.lllIIlIlI[ae.lllIIlIll[22]] = "Cow";
        ae.lllIIlIlI[ae.lllIIlIll[23]] = "cow";
        ae.lllIIlIlI[ae.lllIIlIll[24]] = "Attack";
        ae.lllIIlIlI[ae.lllIIlIll[25]] = "Attack";
        ae.lllIIlIlI[ae.lllIIlIll[13]] = "Auto retaliate";
        ae.lllIIlIlI[ae.lllIIlIll[26]] = ae.llIIIIlIlIII("IwNXE05TZ4o=", "HNnks");
        ae.lllIIlIlI[ae.lllIIlIll[29]] = "Iron scimitar";
        ae.lllIIlIlI[ae.lllIIlIll[30]] = "Iron scimitar";
        ae.lllIIlIlI[ae.lllIIlIll[31]] = "Wield";
        ae.lllIIlIlI[ae.lllIIlIll[19]] = "Steel scimitar";
        ae.lllIIlIlI[ae.lllIIlIll[32]] = "Steel scimitar";
        ae.lllIIlIlI[ae.lllIIlIll[33]] = "Wield";
        ae.lllIIlIlI[ae.lllIIlIll[35]] = "Mithril scimitar";
        ae.lllIIlIlI[ae.lllIIlIll[36]] = "Mithril scimitar";
        ae.lllIIlIlI[ae.lllIIlIll[37]] = "Wield";
        ae.lllIIlIlI[ae.lllIIlIll[38]] = "Wield";
        ae.lllIIlIlI[ae.lllIIlIll[39]] = "Wield";
        ae.lllIIlIlI[ae.lllIIlIll[41]] = "Wear";
        ae.lllIIlIlI[ae.lllIIlIll[43]] = "Wear";
        ae.lllIIlIlI[ae.lllIIlIll[34]] = "Wear";
        ae.lllIIlIlI[ae.lllIIlIll[46]] = "Wear";
        ae.lllIIlIlI[ae.lllIIlIll[48]] = "Wear";
        ae.lllIIlIlI[ae.lllIIlIll[50]] = "Wear";
        ae.lllIIlIlI[ae.lllIIlIll[57]] = "40 Def";
        ae.lllIIlIlI[ae.lllIIlIll[58]] = "Cow";
    }

    private static boolean llIIIIllIllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aM() {
        int n2;
        block18: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        block8: {
                                            int n3;
                                            block10: {
                                                block16: {
                                                    block15: {
                                                        block14: {
                                                            block13: {
                                                                block12: {
                                                                    block11: {
                                                                        block9: {
                                                                            if (!ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[2])) break block8;
                                                                            int[] nArray = new int[lllIIlIll[1]];
                                                                            nArray[ae.lllIIlIll[0]] = lllIIlIll[17];
                                                                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[lllIIlIll[1]];
                                                                            nArray2[ae.lllIIlIll[0]] = lllIIlIll[17];
                                                                            if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[lllIIlIll[1]];
                                                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[42];
                                                                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[lllIIlIll[1]];
                                                                        nArray3[ae.lllIIlIll[0]] = lllIIlIll[42];
                                                                        if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[lllIIlIll[1]];
                                                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[44];
                                                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[lllIIlIll[1]];
                                                                    nArray4[ae.lllIIlIll[0]] = lllIIlIll[44];
                                                                    if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[lllIIlIll[1]];
                                                                nArray[ae.lllIIlIll[0]] = lllIIlIll[40];
                                                                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[lllIIlIll[1]];
                                                                nArray5[ae.lllIIlIll[0]] = lllIIlIll[40];
                                                                if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[lllIIlIll[1]];
                                                            nArray[ae.lllIIlIll[0]] = lllIIlIll[45];
                                                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[lllIIlIll[1]];
                                                            nArray6[ae.lllIIlIll[0]] = lllIIlIll[45];
                                                            if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[lllIIlIll[1]];
                                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[47];
                                                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[lllIIlIll[1]];
                                                        nArray7[ae.lllIIlIll[0]] = lllIIlIll[47];
                                                        if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[lllIIlIll[1]];
                                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[49];
                                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[lllIIlIll[1]];
                                                    nArray8[ae.lllIIlIll[0]] = lllIIlIll[49];
                                                    if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[lllIIlIll[1]];
                                                nArray[ae.lllIIlIll[0]] = lllIIlIll[11];
                                                if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = lllIIlIll[1];

                                                    if (null == null) return n3 != 0;
                                                    return false;
                                                }
                                            }
                                            n3 = lllIIlIll[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[lllIIlIll[1]];
                                        nArray[ae.lllIIlIll[0]] = lllIIlIll[16];
                                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[lllIIlIll[1]];
                                        nArray9[ae.lllIIlIll[0]] = lllIIlIll[16];
                                        if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[lllIIlIll[1]];
                                    nArray[ae.lllIIlIll[0]] = lllIIlIll[42];
                                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[lllIIlIll[1]];
                                    nArray10[ae.lllIIlIll[0]] = lllIIlIll[42];
                                    if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[lllIIlIll[1]];
                                nArray[ae.lllIIlIll[0]] = lllIIlIll[44];
                                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[lllIIlIll[1]];
                                nArray11[ae.lllIIlIll[0]] = lllIIlIll[44];
                                if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[lllIIlIll[1]];
                            nArray[ae.lllIIlIll[0]] = lllIIlIll[40];
                            if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[lllIIlIll[1]];
                            nArray12[ae.lllIIlIll[0]] = lllIIlIll[40];
                            if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[lllIIlIll[1]];
                        nArray[ae.lllIIlIll[0]] = lllIIlIll[45];
                        if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[lllIIlIll[1]];
                        nArray13[ae.lllIIlIll[0]] = lllIIlIll[45];
                        if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[lllIIlIll[1]];
                    nArray[ae.lllIIlIll[0]] = lllIIlIll[47];
                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[lllIIlIll[1]];
                    nArray14[ae.lllIIlIll[0]] = lllIIlIll[47];
                    if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[lllIIlIll[1]];
                nArray[ae.lllIIlIll[0]] = lllIIlIll[49];
                if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[lllIIlIll[1]];
                nArray15[ae.lllIIlIll[0]] = lllIIlIll[49];
                if (!ae.llIIIIlIlllI(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[lllIIlIll[1]];
            nArray[ae.lllIIlIll[0]] = lllIIlIll[11];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllIIlIll[1];

                if (null == null) return n2 != 0;
                return false;
            }
        }
        n2 = lllIIlIll[0];
        return n2 != 0;
    }

    private static boolean llIIIIllIIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean AEHelper() {
        return lllIIlIll[0];
    }

    public static void am() {
        if (ae.llIIIIllIIII(cO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIIlIlI[lllIIlIll[20]];
            Movement.walkTo((WorldPoint)cm);

            Time.sleepTicks((int)lllIIlIll[1]);

        }
        if (ae.llIIIIlIlllI(cO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIIlIlI[lllIIlIll[21]];
            if (ae.llIIIIllIlIl(Players.getLocal().getInteracting())) {
                NPC llllIIIIIIIIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (ae.llIIIIlIlllI(nPC.getName().contains(lllIIlIlI[lllIIlIll[58]]) ? 1 : 0) && ae.llIIIIllIlIl(nPC.getInteracting()) && ae.llIIIIllIIII(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIIlIll[1];

                        if (-(0xBE ^ 0xBA) >= 0) {
                            return false;
                        }
                    } else {
                        n2 = lllIIlIll[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[lllIIlIll[3]];
                stringArray[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[22]];
                stringArray[ae.lllIIlIll[1]] = lllIIlIlI[lllIIlIll[23]];
                List llllIIIIIIIII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (ae.llIIIIllIlll(nPC.getInteracting(), Players.getLocal())) {
                        bl = lllIIlIll[1];

                        if (((0x9C ^ 0xBA ^ (0x32 ^ 0x4F)) & (157 + 85 - 229 + 183 ^ 15 + 132 - 115 + 127 ^ -1)) > ((0x32 ^ 0x5B ^ (0x50 ^ 0x19)) & (181 + 82 - 201 + 126 ^ 72 + 29 - -43 + 12 ^ -1))) {
                            return false;
                        }
                    } else {
                        bl = lllIIlIll[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (ae.llIIIIllIIII(llllIIIIIIIII.isEmpty() ? 1 : 0)) {
                    ((NPC)llllIIIIIIIII.get(lllIIlIll[0])).interact(lllIIlIlI[lllIIlIll[24]]);
                    Time.sleepTicks((int)lllIIlIll[3]);

                }
                if (ae.llIIIIllIIIl(llllIIIIIIIIl) && ae.llIIIIllIIII(Players.getLocal().isMoving() ? 1 : 0) && ae.llIIIIlIlllI(llllIIIIIIIII.isEmpty() ? 1 : 0)) {
                    llllIIIIIIIIl.interact(lllIIlIlI[lllIIlIll[25]]);
                    Time.sleepTicks((int)lllIIlIll[3]);

                }
            }
            if (ae.llIIIIllIIIl(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)lllIIlIll[6]);

            }
        }
    }

    private static int llIIIIlIllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void aO() {
        if (ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIlIll[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    public static void aL() {
        if (ae.llIIIIllIllI(Static.getClient().getVar(lllIIlIll[22]), lllIIlIll[1])) {
            Static.getClient().invokeMenuAction(lllIIlIlI[lllIIlIll[13]], lllIIlIlI[lllIIlIll[26]], lllIIlIll[1], MenuAction.CC_OP.getId(), lllIIlIll[27], lllIIlIll[28]);
        }
        if (ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[10])) {
            String[] stringArray = new String[lllIIlIll[1]];
            stringArray[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[29]];
            if (ae.llIIIIlIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lllIIlIll[1]];
                stringArray2[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[30]];
                Inventory.getFirst((String[])stringArray2).interact(lllIIlIlI[lllIIlIll[31]]);
            }
        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[10]) && ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[19])) {
            String[] stringArray = new String[lllIIlIll[1]];
            stringArray[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[19]];
            if (ae.llIIIIlIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[lllIIlIll[1]];
                stringArray3[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[32]];
                Inventory.getFirst((String[])stringArray3).interact(lllIIlIlI[lllIIlIll[33]]);
            }
        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[19]) && ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[34])) {
            String[] stringArray = new String[lllIIlIll[1]];
            stringArray[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[35]];
            if (ae.llIIIIlIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[lllIIlIll[1]];
                stringArray4[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[36]];
                Inventory.getFirst((String[])stringArray4).interact(lllIIlIlI[lllIIlIll[37]]);
            }
        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[34]) && ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[2])) {
            int[] nArray = new int[lllIIlIll[1]];
            nArray[ae.lllIIlIll[0]] = lllIIlIll[16];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIlIll[1]];
                nArray2[ae.lllIIlIll[0]] = lllIIlIll[16];
                Inventory.getFirst((int[])nArray2).interact(lllIIlIlI[lllIIlIll[38]]);
            }
        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[2])) {
            int[] nArray = new int[lllIIlIll[1]];
            nArray[ae.lllIIlIll[0]] = lllIIlIll[17];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lllIIlIll[1]];
                nArray3[ae.lllIIlIll[0]] = lllIIlIll[17];
                Inventory.getFirst((int[])nArray3).interact(lllIIlIlI[lllIIlIll[39]]);
            }
        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIlIll[34])) {
            int[] nArray = new int[lllIIlIll[1]];
            nArray[ae.lllIIlIll[0]] = lllIIlIll[40];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lllIIlIll[1]];
                nArray4[ae.lllIIlIll[0]] = lllIIlIll[40];
                Inventory.getFirst((int[])nArray4).interact(lllIIlIlI[lllIIlIll[41]]);
            }
            int[] nArray5 = new int[lllIIlIll[1]];
            nArray5[ae.lllIIlIll[0]] = lllIIlIll[42];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lllIIlIll[1]];
                nArray6[ae.lllIIlIll[0]] = lllIIlIll[42];
                Inventory.getFirst((int[])nArray6).interact(lllIIlIlI[lllIIlIll[43]]);
            }
            int[] nArray7 = new int[lllIIlIll[1]];
            nArray7[ae.lllIIlIll[0]] = lllIIlIll[44];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[lllIIlIll[1]];
                nArray8[ae.lllIIlIll[0]] = lllIIlIll[44];
                Inventory.getFirst((int[])nArray8).interact(lllIIlIlI[lllIIlIll[34]]);
            }
            int[] nArray9 = new int[lllIIlIll[1]];
            nArray9[ae.lllIIlIll[0]] = lllIIlIll[45];
            if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lllIIlIll[1]];
                nArray10[ae.lllIIlIll[0]] = lllIIlIll[45];
                Inventory.getFirst((int[])nArray10).interact(lllIIlIlI[lllIIlIll[46]]);
            }
        }
        int[] nArray = new int[lllIIlIll[1]];
        nArray[ae.lllIIlIll[0]] = lllIIlIll[47];
        if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[lllIIlIll[1]];
            nArray11[ae.lllIIlIll[0]] = lllIIlIll[47];
            Inventory.getFirst((int[])nArray11).interact(lllIIlIlI[lllIIlIll[48]]);
        }
        int[] nArray12 = new int[lllIIlIll[1]];
        nArray12[ae.lllIIlIll[0]] = lllIIlIll[49];
        if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lllIIlIll[1]];
            nArray13[ae.lllIIlIll[0]] = lllIIlIll[49];
            Inventory.getFirst((int[])nArray13).interact(lllIIlIlI[lllIIlIll[50]]);
        }
    }

    private static boolean llIIIIllIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIlIll[2])) {
            bl = lllIIlIll[1];

            if (-1 > ((0x26 ^ 0x4D ^ (0x37 ^ 0x74)) & (0x39 ^ 0x32 ^ (0x75 ^ 0x56) ^ -1))) {
                return ((40 + 35 - -3 + 88 ^ 40 + 65 - -34 + 15) & (0x5A ^ 0x1C ^ (0xF9 ^ 0x83) ^ -1)) != 0;
            }
        } else {
            bl = lllIIlIll[0];
        }
        return bl;
    }

    private static boolean llIIIIllIlII(int n2) {
        return n2 < 0;
    }

    private static boolean llIIIIllIIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIllIlll(Object object, Object object2) {
        return object == object2;
    }

    static {
        ae.llIIIIlIllII();
        ae.llIIIIlIlIll();
        bx = new ArrayList<d>();
        int[] nArray = new int[lllIIlIll[18]];
        nArray[ae.lllIIlIll[0]] = lllIIlIll[16];
        nArray[ae.lllIIlIll[1]] = lllIIlIll[17];
        nArray[ae.lllIIlIll[3]] = lllIIlIll[42];
        nArray[ae.lllIIlIll[4]] = lllIIlIll[44];
        nArray[ae.lllIIlIll[6]] = lllIIlIll[40];
        nArray[ae.lllIIlIll[10]] = lllIIlIll[45];
        nArray[ae.lllIIlIll[14]] = lllIIlIll[47];
        nArray[ae.lllIIlIll[15]] = lllIIlIll[49];
        cM = nArray;
        cN = new WorldArea(lllIIlIll[59], lllIIlIll[60], lllIIlIll[22], lllIIlIll[22], lllIIlIll[0]);
        cO = new WorldArea(lllIIlIll[61], lllIIlIll[62], lllIIlIll[32], lllIIlIll[26], lllIIlIll[0]);
        cP = new WorldArea(lllIIlIll[63], lllIIlIll[64], lllIIlIll[65], lllIIlIll[34], lllIIlIll[0]);
        cQ = new WorldPoint(lllIIlIll[66], lllIIlIll[67], lllIIlIll[0]);
        cm = new WorldPoint(lllIIlIll[68], lllIIlIll[60], lllIIlIll[0]);
        cR = new WorldPoint(lllIIlIll[69], lllIIlIll[70], lllIIlIll[0]);
    }

    private static boolean llIIIIlIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIllIlIl(Object object) {
        return object == null;
    }

    private static boolean llIIIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    public static void Q() {
        d lllIllllllllI;
        int[] nArray = new int[lllIIlIll[1]];
        nArray[ae.lllIIlIll[0]] = lllIIlIll[9];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lllIIlIll[9], lllIIlIll[2], lllIIlIll[51]);
            bx.add(d2);

        }
        int[] nArray2 = new int[lllIIlIll[1]];
        nArray2[ae.lllIIlIll[0]] = lllIIlIll[52];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllIllllllllI = new DHelper(lllIIlIll[52], lllIIlIll[10], lllIIlIll[51]);
            bx.add(lllIllllllllI);

        }
        int[] nArray3 = new int[lllIIlIll[1]];
        nArray3[ae.lllIIlIll[0]] = lllIIlIll[49];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIllllllllI = new DHelper(lllIIlIll[49], lllIIlIll[1], lllIIlIll[53]);
            bx.add(lllIllllllllI);

        }
        int[] nArray4 = new int[lllIIlIll[1]];
        nArray4[ae.lllIIlIll[0]] = lllIIlIll[47];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllIllllllllI = new DHelper(lllIIlIll[47], lllIIlIll[1], lllIIlIll[54]);
            bx.add(lllIllllllllI);

        }
        int[] nArray5 = new int[lllIIlIll[1]];
        nArray5[ae.lllIIlIll[0]] = lllIIlIll[11];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lllIllllllllI = new DHelper(lllIIlIll[11], lllIIlIll[12], lllIIlIll[55]);
            bx.add(lllIllllllllI);

        }
        int[] nArray6 = new int[lllIIlIll[1]];
        nArray6[ae.lllIIlIll[0]] = lllIIlIll[40];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lllIllllllllI = new DHelper(lllIIlIll[40], lllIIlIll[1], lllIIlIll[56]);
            bx.add(lllIllllllllI);

        }
        int[] nArray7 = new int[lllIIlIll[1]];
        nArray7[ae.lllIIlIll[0]] = lllIIlIll[44];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lllIllllllllI = new DHelper(lllIIlIll[44], lllIIlIll[1], lllIIlIll[56]);
            bx.add(lllIllllllllI);

        }
        int[] nArray8 = new int[lllIIlIll[1]];
        nArray8[ae.lllIIlIll[0]] = lllIIlIll[45];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lllIllllllllI = new DHelper(lllIIlIll[45], lllIIlIll[1], lllIIlIll[56]);
            bx.add(lllIllllllllI);

        }
        int[] nArray9 = new int[lllIIlIll[1]];
        nArray9[ae.lllIIlIll[0]] = lllIIlIll[42];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lllIllllllllI = new DHelper(lllIIlIll[42], lllIIlIll[1], lllIIlIll[56]);
            bx.add(lllIllllllllI);

        }
        if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[2])) {
            int[] nArray10 = new int[lllIIlIll[1]];
            nArray10[ae.lllIIlIll[0]] = lllIIlIll[17];
            if (ae.llIIIIllIIII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                lllIllllllllI = new DHelper(lllIIlIll[17], lllIIlIll[1], lllIIlIll[54]);
                bx.add(lllIllllllllI);

            }
        }
        int[] nArray11 = new int[lllIIlIll[1]];
        nArray11[ae.lllIIlIll[0]] = lllIIlIll[16];
        if (ae.llIIIIllIIII(Bank.contains((int[])nArray11) ? 1 : 0)) {
            lllIllllllllI = new DHelper(lllIIlIll[16], lllIIlIll[1], lllIIlIll[56]);
            bx.add(lllIllllllllI);

        }
    }

    public static void aJ() {
        block17: {
            block19: {
                block18: {
                    if (ae.llIIIIlIlllI(bv ? 1 : 0)) {
                        AccBuilderGWD.c = lllIIlIlI[lllIIlIll[0]];
                        b.a(bx);
                        if (ae.llIIIIlIllll(bx.size(), lllIIlIll[1])) {
                            System.out.println(lllIIlIlI[lllIIlIll[1]]);
                            bv = lllIIlIll[0];
                        }
                    }
                    if (!ae.llIIIIllIIII(bv ? 1 : 0)) break block17;
                    if (ae.llIIIIllIIII(ae.aM() ? 1 : 0) && ae.llIIIIlIllll(Skills.getLevel((Skill)Skill.DEFENCE), lllIIlIll[2])) {
                        BankLocation llllIIIIIIlII = BankLocation.getNearest();
                        if (ae.llIIIIllIIIl(llllIIIIIIlII) && ae.llIIIIllIIII(llllIIIIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIlIlI[lllIIlIll[3]];
                            a.a(llllIIIIIIlII);
                        }
                        if (ae.llIIIIllIIIl(llllIIIIIIlII) && ae.llIIIIlIlllI(llllIIIIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = lllIIlIlI[lllIIlIll[4]];
                            if (ae.llIIIIllIIII(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIlIll[5]);

                            }
                            if (ae.llIIIIlIlllI(Bank.isOpen() ? 1 : 0)) {
                                if (ae.llIIIIllIIlI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lllIIlIll[1]);

                                }
                                if (ae.llIIIIllIIlI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lllIIlIll[3]);

                                }
                                if (ae.llIIIIllIIII(ae.aN() ? 1 : 0)) {
                                    ae.Q();
                                    System.out.println(lllIIlIlI[lllIIlIll[6]]);
                                    bv = lllIIlIll[1];
                                    return;
                                }
                                a.a(cM, lllIIlIll[1]);
                                a.a(lllIIlIll[7], lllIIlIll[8]);
                                a.b(f.bc, lllIIlIll[1]);
                                a.a(lllIIlIll[9], lllIIlIll[10]);
                                a.a(lllIIlIll[11], lllIIlIll[12]);
                            }
                        }
                    }
                    if (!ae.llIIIIlIlllI(ae.aM() ? 1 : 0)) break block17;
                    ae.aL();
                    if (ae.llIIIIllIIll(Movement.getRunEnergy(), lllIIlIll[13]) && ae.llIIIIllIIII(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[lllIIlIll[1]];
                    stringArray[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[10]];
                    if (!ae.llIIIIllIIII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[lllIIlIll[1]];
                    stringArray2[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[14]];
                    if (!ae.llIIIIllIIII(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[lllIIlIll[1]];
                    stringArray3[ae.lllIIlIll[0]] = lllIIlIlI[lllIIlIll[15]];
                    if (!ae.llIIIIllIIII(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[lllIIlIll[1]];
                    nArray[ae.lllIIlIll[0]] = lllIIlIll[16];
                    if (!ae.llIIIIllIIII(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[lllIIlIll[1]];
                    nArray2[ae.lllIIlIll[0]] = lllIIlIll[17];
                    if (!ae.llIIIIlIlllI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                ae.aO();
            }
            if (ae.llIIIIllIlII(ae.llIIIIlIllIl(e.w(), 45.0))) {
                int[] nArray = new int[lllIIlIll[1]];
                nArray[ae.lllIIlIll[0]] = lllIIlIll[11];
                if (ae.llIIIIlIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lllIIlIll[1]];
                    nArray3[ae.lllIIlIll[0]] = lllIIlIll[11];
                    Inventory.getFirst((int[])nArray3).interact(lllIIlIlI[lllIIlIll[18]]);
                    Time.sleepTicks((int)lllIIlIll[1]);

                }
            }
            if (ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.ATTACK), lllIIlIll[19]) && ae.llIIIIllIIll(Skills.getLevel((Skill)Skill.STRENGTH), lllIIlIll[19])) {
                p.al();
            }
        }
    }

    @Override
    public int af() {
        try {
            ae.aJ();

        }
        catch (Exception lllIlllllllII) {
            lllIlllllllII.printStackTrace();
        }
        if (((0xC4 ^ 0x84) & ~(0x75 ^ 0x35)) != 0) {
            return (0xD2 ^ 0xC2) & ~(0xAE ^ 0xBE);
        }
        return lllIIlIll[0];
    }

        return String.valueOf(lllIlllIlIIIl);
    }

    private static boolean llIIIIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return lllIIlIlI[lllIIlIll[57]];
    }
}

