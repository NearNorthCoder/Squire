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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.JHelper;
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

public class KHelper
implements G {
    public static  WorldPoint iH;
    public static  WorldPoint bx;
    public static  WorldArea iF;
    
    public static  boolean bt;
    public static  WorldArea iE;
    public static  List<d> bv;
    public static  WorldPoint iI;
    
    public static  WorldArea iG;
    public static  int[] iD;

        return String.valueOf(var1);
    }

    private static void llllllIIIIlI() {
        lIIlIIllll = new String[lIIlIlIIll[71]];
        K.lIIlIIllll[K.lIIlIlIIll[0]] = "Buying items";
        K.lIIlIIllll[K.lIIlIlIIll[1]] = "Finished buying items, switching back to melee training";
        K.lIIlIIllll[K.lIIlIlIIll[3]] = "Navigating to bank";
        K.lIIlIIllll[K.lIIlIlIIll[4]] = "Handling banking";
        K.lIIlIIllll[K.lIIlIlIIll[6]] = "We are missing supplies, switching to BUYING";
        K.lIIlIIllll[K.lIIlIlIIll[10]] = "Iron scimitar";
        K.lIIlIIllll[K.lIIlIlIIll[14]] = "Steel scimitar";
        K.lIIlIIllll[K.lIIlIlIIll[15]] = "Mithril scimitar";
        K.lIIlIIllll[K.lIIlIlIIll[18]] = "Eat";
        K.lIIlIIllll[K.lIIlIlIIll[20]] = "Walking to cow area";
        K.lIIlIIllll[K.lIIlIlIIll[21]] = "Killing cows";
        K.lIIlIIllll[K.lIIlIlIIll[22]] = "Cow";
        K.lIIlIIllll[K.lIIlIlIIll[23]] = "cow";
        K.lIIlIIllll[K.lIIlIlIIll[24]] = "Attack";
        K.lIIlIIllll[K.lIIlIlIIll[25]] = "Attack";
        K.lIIlIIllll[K.lIIlIlIIll[13]] = "Auto retaliate";
        K.lIIlIIllll[K.lIIlIlIIll[26]] = K.lllllIllIIII("zG/I0RqSK/o=", "PHMcy");
        K.lIIlIIllll[K.lIIlIlIIll[29]] = "Iron scimitar";
        K.lIIlIIllll[K.lIIlIlIIll[30]] = "Iron scimitar";
        K.lIIlIIllll[K.lIIlIlIIll[31]] = "Wield";
        K.lIIlIIllll[K.lIIlIlIIll[19]] = "Steel scimitar";
        K.lIIlIIllll[K.lIIlIlIIll[32]] = "Steel scimitar";
        K.lIIlIIllll[K.lIIlIlIIll[33]] = "Wield";
        K.lIIlIIllll[K.lIIlIlIIll[35]] = "Mithril scimitar";
        K.lIIlIIllll[K.lIIlIlIIll[36]] = "Mithril scimitar";
        K.lIIlIIllll[K.lIIlIlIIll[37]] = "Wield";
        K.lIIlIIllll[K.lIIlIlIIll[38]] = "Wield";
        K.lIIlIIllll[K.lIIlIlIIll[39]] = "Wield";
        K.lIIlIIllll[K.lIIlIlIIll[41]] = "Wear";
        K.lIIlIIllll[K.lIIlIlIIll[43]] = "Wear";
        K.lIIlIIllll[K.lIIlIlIIll[34]] = "Wear";
        K.lIIlIIllll[K.lIIlIlIIll[46]] = "Wear";
        K.lIIlIIllll[K.lIIlIlIIll[48]] = "Wear";
        K.lIIlIIllll[K.lIIlIlIIll[50]] = "Wear";
        K.lIIlIIllll[K.lIIlIlIIll[57]] = "40 Def";
        K.lIIlIIllll[K.lIIlIlIIll[58]] = "Cow";
    }

    private static boolean llllllIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void af() {
        d var2;
        int[] nArray = new int[lIIlIlIIll[1]];
        nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[9];
        if (K.llllllIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIlIlIIll[9], lIIlIlIIll[2], lIIlIlIIll[51]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIIlIlIIll[1]];
        nArray2[K.lIIlIlIIll[0]] = lIIlIlIIll[52];
        if (K.llllllIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(lIIlIlIIll[52], lIIlIlIIll[10], lIIlIlIIll[51]);
            bv.add(var2);

        }
        int[] nArray3 = new int[lIIlIlIIll[1]];
        nArray3[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
        if (K.llllllIIIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(lIIlIlIIll[49], lIIlIlIIll[1], lIIlIlIIll[53]);
            bv.add(var2);

        }
        int[] nArray4 = new int[lIIlIlIIll[1]];
        nArray4[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
        if (K.llllllIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new DHelper(lIIlIlIIll[47], lIIlIlIIll[1], lIIlIlIIll[54]);
            bv.add(var2);

        }
        int[] nArray5 = new int[lIIlIlIIll[1]];
        nArray5[K.lIIlIlIIll[0]] = lIIlIlIIll[11];
        if (K.llllllIIIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var2 = new DHelper(lIIlIlIIll[11], lIIlIlIIll[12], lIIlIlIIll[55]);
            bv.add(var2);

        }
        int[] nArray6 = new int[lIIlIlIIll[1]];
        nArray6[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
        if (K.llllllIIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var2 = new DHelper(lIIlIlIIll[40], lIIlIlIIll[1], lIIlIlIIll[56]);
            bv.add(var2);

        }
        int[] nArray7 = new int[lIIlIlIIll[1]];
        nArray7[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
        if (K.llllllIIIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var2 = new DHelper(lIIlIlIIll[44], lIIlIlIIll[1], lIIlIlIIll[56]);
            bv.add(var2);

        }
        int[] nArray8 = new int[lIIlIlIIll[1]];
        nArray8[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
        if (K.llllllIIIlll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var2 = new DHelper(lIIlIlIIll[45], lIIlIlIIll[1], lIIlIlIIll[56]);
            bv.add(var2);

        }
        int[] nArray9 = new int[lIIlIlIIll[1]];
        nArray9[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
        if (K.llllllIIIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            var2 = new DHelper(lIIlIlIIll[42], lIIlIlIIll[1], lIIlIlIIll[56]);
            bv.add(var2);

        }
        if (K.llllllIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[2])) {
            int[] nArray10 = new int[lIIlIlIIll[1]];
            nArray10[K.lIIlIlIIll[0]] = lIIlIlIIll[17];
            if (K.llllllIIIlll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                var2 = new DHelper(lIIlIlIIll[17], lIIlIlIIll[1], lIIlIlIIll[54]);
                bv.add(var2);

            }
        }
        int[] nArray11 = new int[lIIlIlIIll[1]];
        nArray11[K.lIIlIlIIll[0]] = lIIlIlIIll[16];
        if (K.llllllIIIlll(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var2 = new DHelper(lIIlIlIIll[16], lIIlIlIIll[1], lIIlIlIIll[56]);
            bv.add(var2);

        }
    }

    public static void cx() {
        if (K.llllllIIllIl(Static.getClient().getVar(lIIlIlIIll[22]), lIIlIlIIll[1])) {
            Static.getClient().invokeMenuAction(lIIlIIllll[lIIlIlIIll[13]], lIIlIIllll[lIIlIlIIll[26]], lIIlIlIIll[1], MenuAction.CC_OP.getId(), lIIlIlIIll[27], lIIlIlIIll[28]);
        }
        if (K.llllllIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[10])) {
            String[] stringArray = new String[lIIlIlIIll[1]];
            stringArray[K.lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[29]];
            if (K.llllllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIIlIlIIll[1]];
                stringArray2[K.lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[30]];
                Inventory.getFirst((String[])stringArray2).interact(lIIlIIllll[lIIlIlIIll[31]]);
            }
        }
        if (K.llllllIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[10]) && K.llllllIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[19])) {
            String[] stringArray = new String[lIIlIlIIll[1]];
            stringArray[K.lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[19]];
            if (K.llllllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[lIIlIlIIll[1]];
                stringArray3[K.lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[32]];
                Inventory.getFirst((String[])stringArray3).interact(lIIlIIllll[lIIlIlIIll[33]]);
            }
        }
        if (K.llllllIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[19]) && K.llllllIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[34])) {
            String[] stringArray = new String[lIIlIlIIll[1]];
            stringArray[K.lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[35]];
            if (K.llllllIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[lIIlIlIIll[1]];
                stringArray4[K.lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[36]];
                Inventory.getFirst((String[])stringArray4).interact(lIIlIIllll[lIIlIlIIll[37]]);
            }
        }
        if (K.llllllIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[34]) && K.llllllIIIllI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[2])) {
            int[] nArray = new int[lIIlIlIIll[1]];
            nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[16];
            if (K.llllllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIlIlIIll[1]];
                nArray2[K.lIIlIlIIll[0]] = lIIlIlIIll[16];
                Inventory.getFirst((int[])nArray2).interact(lIIlIIllll[lIIlIlIIll[38]]);
            }
        }
        if (K.llllllIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[2])) {
            int[] nArray = new int[lIIlIlIIll[1]];
            nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[17];
            if (K.llllllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[lIIlIlIIll[1]];
                nArray3[K.lIIlIlIIll[0]] = lIIlIlIIll[17];
                Inventory.getFirst((int[])nArray3).interact(lIIlIIllll[lIIlIlIIll[39]]);
            }
        }
        if (K.llllllIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIIlIlIIll[34])) {
            int[] nArray = new int[lIIlIlIIll[1]];
            nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
            if (K.llllllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[lIIlIlIIll[1]];
                nArray4[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
                Inventory.getFirst((int[])nArray4).interact(lIIlIIllll[lIIlIlIIll[41]]);
            }
            int[] nArray5 = new int[lIIlIlIIll[1]];
            nArray5[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
            if (K.llllllIIIlIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[lIIlIlIIll[1]];
                nArray6[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
                Inventory.getFirst((int[])nArray6).interact(lIIlIIllll[lIIlIlIIll[43]]);
            }
            int[] nArray7 = new int[lIIlIlIIll[1]];
            nArray7[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
            if (K.llllllIIIlIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[lIIlIlIIll[1]];
                nArray8[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
                Inventory.getFirst((int[])nArray8).interact(lIIlIIllll[lIIlIlIIll[34]]);
            }
            int[] nArray9 = new int[lIIlIlIIll[1]];
            nArray9[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
            if (K.llllllIIIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lIIlIlIIll[1]];
                nArray10[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
                Inventory.getFirst((int[])nArray10).interact(lIIlIIllll[lIIlIlIIll[46]]);
            }
        }
        int[] nArray = new int[lIIlIlIIll[1]];
        nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
        if (K.llllllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[lIIlIlIIll[1]];
            nArray11[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
            Inventory.getFirst((int[])nArray11).interact(lIIlIIllll[lIIlIlIIll[48]]);
        }
        int[] nArray12 = new int[lIIlIlIIll[1]];
        nArray12[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
        if (K.llllllIIIlIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[lIIlIlIIll[1]];
            nArray13[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
            Inventory.getFirst((int[])nArray13).interact(lIIlIIllll[lIIlIlIIll[50]]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean cy() {
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
                                                                                    if (!K.llllllIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[2])) break block4;
                                                                                    int[] nArray = new int[lIIlIlIIll[1]];
                                                                                    nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[17];
                                                                                    if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[lIIlIlIIll[1]];
                                                                                    nArray2[K.lIIlIlIIll[0]] = lIIlIlIIll[17];
                                                                                    if (!K.llllllIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[lIIlIlIIll[1]];
                                                                                    nArray3[K.lIIlIlIIll[0]] = lIIlIlIIll[17];
                                                                                    if (!K.llllllIIIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[lIIlIlIIll[1]];
                                                                                nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
                                                                                if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[lIIlIlIIll[1]];
                                                                                nArray4[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
                                                                                if (!K.llllllIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[lIIlIlIIll[1]];
                                                                                nArray5[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
                                                                                if (!K.llllllIIIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[lIIlIlIIll[1]];
                                                                            nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
                                                                            if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[lIIlIlIIll[1]];
                                                                            nArray6[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
                                                                            if (!K.llllllIIIlll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[lIIlIlIIll[1]];
                                                                            nArray7[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
                                                                            if (!K.llllllIIIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[lIIlIlIIll[1]];
                                                                        nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
                                                                        if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[lIIlIlIIll[1]];
                                                                        nArray8[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
                                                                        if (!K.llllllIIIlll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[lIIlIlIIll[1]];
                                                                        nArray9[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
                                                                        if (!K.llllllIIIlIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[lIIlIlIIll[1]];
                                                                    nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
                                                                    if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[lIIlIlIIll[1]];
                                                                    nArray10[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
                                                                    if (!K.llllllIIIlll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[lIIlIlIIll[1]];
                                                                    nArray11[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
                                                                    if (!K.llllllIIIlIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[lIIlIlIIll[1]];
                                                                nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
                                                                if (!K.llllllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[lIIlIlIIll[1]];
                                                                nArray12[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
                                                                if (!K.llllllIIIlll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[lIIlIlIIll[1]];
                                                                nArray13[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
                                                                if (!K.llllllIIIlIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[lIIlIlIIll[1]];
                                                            nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
                                                            if (!K.llllllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[lIIlIlIIll[1]];
                                                            nArray14[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
                                                            if (!K.llllllIIIlll(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[lIIlIlIIll[1]];
                                                            nArray15[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
                                                            if (!K.llllllIIIlIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[lIIlIlIIll[1]];
                                                        nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[11];
                                                        if (!K.llllllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[lIIlIlIIll[1]];
                                                        nArray16[K.lIIlIlIIll[0]] = lIIlIlIIll[11];
                                                        if (!K.llllllIIIlIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = lIIlIlIIll[1];

                                                    if (-1 < 1) return n3 != 0;
                                                    return ((0x92 ^ 0xBB ^ (0xC4 ^ 0xA3)) & (17 + 5 - -44 + 61 ^ (0x31 ^ 0) ^ -1)) != 0;
                                                }
                                                n3 = lIIlIlIIll[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[lIIlIlIIll[1]];
                                            nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[16];
                                            if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[lIIlIlIIll[1]];
                                            nArray17[K.lIIlIlIIll[0]] = lIIlIlIIll[16];
                                            if (!K.llllllIIIlll(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[lIIlIlIIll[1]];
                                            nArray18[K.lIIlIlIIll[0]] = lIIlIlIIll[16];
                                            if (!K.llllllIIIlIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[lIIlIlIIll[1]];
                                        nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
                                        if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[lIIlIlIIll[1]];
                                        nArray19[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
                                        if (!K.llllllIIIlll(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[lIIlIlIIll[1]];
                                        nArray20[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
                                        if (!K.llllllIIIlIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[lIIlIlIIll[1]];
                                    nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
                                    if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[lIIlIlIIll[1]];
                                    nArray21[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
                                    if (!K.llllllIIIlll(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[lIIlIlIIll[1]];
                                    nArray22[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
                                    if (!K.llllllIIIlIl(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[lIIlIlIIll[1]];
                                nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
                                if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[lIIlIlIIll[1]];
                                nArray23[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
                                if (!K.llllllIIIlll(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[lIIlIlIIll[1]];
                                nArray24[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
                                if (!K.llllllIIIlIl(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[lIIlIlIIll[1]];
                            nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
                            if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[lIIlIlIIll[1]];
                            nArray25[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
                            if (!K.llllllIIIlll(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[lIIlIlIIll[1]];
                            nArray26[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
                            if (!K.llllllIIIlIl(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[lIIlIlIIll[1]];
                        nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
                        if (!K.llllllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[lIIlIlIIll[1]];
                        nArray27[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
                        if (!K.llllllIIIlll(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[lIIlIlIIll[1]];
                        nArray28[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
                        if (!K.llllllIIIlIl(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[lIIlIlIIll[1]];
                    nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
                    if (!K.llllllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[lIIlIlIIll[1]];
                    nArray29[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
                    if (!K.llllllIIIlll(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[lIIlIlIIll[1]];
                    nArray30[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
                    if (!K.llllllIIIlIl(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[lIIlIlIIll[1]];
                nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[11];
                if (!K.llllllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[lIIlIlIIll[1]];
                nArray31[K.lIIlIlIIll[0]] = lIIlIlIIll[11];
                if (!K.llllllIIIlIl(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = lIIlIlIIll[1];

            if (1 > -1) return n2 != 0;
            return ((0xF1 ^ 0xC5 ^ (0x27 ^ 0x3A)) & (0x53 ^ 0x10 ^ (0x31 ^ 0x5B) ^ -1)) != 0;
        }
        n2 = lIIlIlIIll[0];
        return n2 != 0;
    }

    private static boolean llllllIIllII(Object object) {
        return object == null;
    }

    static {
        K.llllllIIIIll();
        K.llllllIIIIlI();
        bv = new ArrayList<d>();
        int[] nArray = new int[lIIlIlIIll[18]];
        nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[16];
        nArray[K.lIIlIlIIll[1]] = lIIlIlIIll[17];
        nArray[K.lIIlIlIIll[3]] = lIIlIlIIll[42];
        nArray[K.lIIlIlIIll[4]] = lIIlIlIIll[44];
        nArray[K.lIIlIlIIll[6]] = lIIlIlIIll[40];
        nArray[K.lIIlIlIIll[10]] = lIIlIlIIll[45];
        nArray[K.lIIlIlIIll[14]] = lIIlIlIIll[47];
        nArray[K.lIIlIlIIll[15]] = lIIlIlIIll[49];
        iD = nArray;
        iE = new WorldArea(lIIlIlIIll[59], lIIlIlIIll[60], lIIlIlIIll[22], lIIlIlIIll[22], lIIlIlIIll[0]);
        iF = new WorldArea(lIIlIlIIll[61], lIIlIlIIll[62], lIIlIlIIll[32], lIIlIlIIll[26], lIIlIlIIll[0]);
        iG = new WorldArea(lIIlIlIIll[63], lIIlIlIIll[64], lIIlIlIIll[65], lIIlIlIIll[34], lIIlIlIIll[0]);
        iH = new WorldPoint(lIIlIlIIll[66], lIIlIlIIll[67], lIIlIlIIll[0]);
        bx = new WorldPoint(lIIlIlIIll[68], lIIlIlIIll[60], lIIlIlIIll[0]);
        iI = new WorldPoint(lIIlIlIIll[69], lIIlIlIIll[70], lIIlIlIIll[0]);
    }

    private static boolean llllllIIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bo() {
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
                                                                            if (!K.llllllIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[2])) break block8;
                                                                            int[] nArray = new int[lIIlIlIIll[1]];
                                                                            nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[17];
                                                                            if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[lIIlIlIIll[1]];
                                                                            nArray2[K.lIIlIlIIll[0]] = lIIlIlIIll[17];
                                                                            if (!K.llllllIIIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[lIIlIlIIll[1]];
                                                                        nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
                                                                        if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[lIIlIlIIll[1]];
                                                                        nArray3[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
                                                                        if (!K.llllllIIIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[lIIlIlIIll[1]];
                                                                    nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
                                                                    if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[lIIlIlIIll[1]];
                                                                    nArray4[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
                                                                    if (!K.llllllIIIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[lIIlIlIIll[1]];
                                                                nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
                                                                if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[lIIlIlIIll[1]];
                                                                nArray5[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
                                                                if (!K.llllllIIIlIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[lIIlIlIIll[1]];
                                                            nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
                                                            if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[lIIlIlIIll[1]];
                                                            nArray6[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
                                                            if (!K.llllllIIIlIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[lIIlIlIIll[1]];
                                                        nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
                                                        if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[lIIlIlIIll[1]];
                                                        nArray7[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
                                                        if (!K.llllllIIIlIl(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[lIIlIlIIll[1]];
                                                    nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
                                                    if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[lIIlIlIIll[1]];
                                                    nArray8[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
                                                    if (!K.llllllIIIlIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[lIIlIlIIll[1]];
                                                nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[11];
                                                if (K.llllllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = lIIlIlIIll[1];

                                                    if (null == null) return n3 != 0;
                                                    return ((0x2C ^ 0x29 ^ (0xE7 ^ 0xC1)) & (0x1D ^ 0x7C ^ (0xFB ^ 0xB9) ^ -1)) != 0;
                                                }
                                            }
                                            n3 = lIIlIlIIll[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[lIIlIlIIll[1]];
                                        nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[16];
                                        if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[lIIlIlIIll[1]];
                                        nArray9[K.lIIlIlIIll[0]] = lIIlIlIIll[16];
                                        if (!K.llllllIIIlIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[lIIlIlIIll[1]];
                                    nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
                                    if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[lIIlIlIIll[1]];
                                    nArray10[K.lIIlIlIIll[0]] = lIIlIlIIll[42];
                                    if (!K.llllllIIIlIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[lIIlIlIIll[1]];
                                nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
                                if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[lIIlIlIIll[1]];
                                nArray11[K.lIIlIlIIll[0]] = lIIlIlIIll[44];
                                if (!K.llllllIIIlIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[lIIlIlIIll[1]];
                            nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
                            if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[lIIlIlIIll[1]];
                            nArray12[K.lIIlIlIIll[0]] = lIIlIlIIll[40];
                            if (!K.llllllIIIlIl(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[lIIlIlIIll[1]];
                        nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
                        if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[lIIlIlIIll[1]];
                        nArray13[K.lIIlIlIIll[0]] = lIIlIlIIll[45];
                        if (!K.llllllIIIlIl(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[lIIlIlIIll[1]];
                    nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
                    if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[lIIlIlIIll[1]];
                    nArray14[K.lIIlIlIIll[0]] = lIIlIlIIll[47];
                    if (!K.llllllIIIlIl(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[lIIlIlIIll[1]];
                nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
                if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[lIIlIlIIll[1]];
                nArray15[K.lIIlIlIIll[0]] = lIIlIlIIll[49];
                if (!K.llllllIIIlIl(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[lIIlIlIIll[1]];
            nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[11];
            if (K.llllllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIlIlIIll[1];

                if (((0x55 ^ 4 ^ (0x91 ^ 0x96)) & (0x45 ^ 0x72 ^ (0xA4 ^ 0xC5) ^ -1) & ((139 + 119 - 196 + 173 ^ 150 + 46 - 109 + 111) & (0x7A ^ 0x73 ^ (0xB ^ 0x2F) ^ -1) ^ -1)) == ((0x1B ^ 0x7A ^ (0x61 ^ 0x12)) & (0x44 ^ 2 ^ (0x3E ^ 0x6A) ^ -1))) return n2 != 0;
                return ((0x57 ^ 0x51 ^ (0x9F ^ 0xBD)) & (0x34 ^ 0x3F ^ (0x57 ^ 0x78) ^ -1)) != 0;
            }
        }
        n2 = lIIlIlIIll[0];
        return n2 != 0;
    }

    public static void cw() {
        block17: {
            block19: {
                block18: {
                    if (K.llllllIIIlIl(bt ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIIllll[lIIlIlIIll[0]];
                        b.a(bv);
                        if (K.llllllIIIllI(bv.size(), lIIlIlIIll[1])) {
                            System.out.println(lIIlIIllll[lIIlIlIIll[1]]);
                            bt = lIIlIlIIll[0];
                        }
                    }
                    if (!K.llllllIIIlll(bt ? 1 : 0)) break block17;
                    if (K.llllllIIIlll(K.bo() ? 1 : 0) && K.llllllIIIllI(Skills.getLevel((Skill)Skill.DEFENCE), lIIlIlIIll[2])) {
                        BankLocation var3 = BankLocation.getNearest();
                        if (K.llllllIIlIII(var3) && K.llllllIIIlll(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIIllll[lIIlIlIIll[3]];
                            a.a(var3);
                        }
                        if (K.llllllIIlIII(var3) && K.llllllIIIlIl(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIlIIllll[lIIlIlIIll[4]];
                            if (K.llllllIIIlll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIlIIll[5]);

                            }
                            if (K.llllllIIIlIl(Bank.isOpen() ? 1 : 0)) {
                                if (K.llllllIIlIIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIIlIlIIll[1]);

                                }
                                if (K.llllllIIlIIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIIlIlIIll[3]);

                                }
                                if (K.llllllIIIlll(K.cy() ? 1 : 0)) {
                                    K.af();
                                    System.out.println(lIIlIIllll[lIIlIlIIll[6]]);
                                    bt = lIIlIlIIll[1];
                                    return;
                                }
                                a.a(iD, lIIlIlIIll[1]);
                                a.a(lIIlIlIIll[7], lIIlIlIIll[8]);
                                a.b(f.aV, lIIlIlIIll[1]);
                                a.a(lIIlIlIIll[9], lIIlIlIIll[10]);
                                a.a(lIIlIlIIll[11], lIIlIlIIll[12]);
                            }
                        }
                    }
                    if (!K.llllllIIIlIl(K.bo() ? 1 : 0)) break block17;
                    K.cx();
                    if (K.llllllIIlIlI(Movement.getRunEnergy(), lIIlIlIIll[13]) && K.llllllIIIlll(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[lIIlIlIIll[1]];
                    stringArray[K.lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[10]];
                    if (!K.llllllIIIlll(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[lIIlIlIIll[1]];
                    stringArray2[K.lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[14]];
                    if (!K.llllllIIIlll(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[lIIlIlIIll[1]];
                    stringArray3[K.lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[15]];
                    if (!K.llllllIIIlll(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[lIIlIlIIll[1]];
                    nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[16];
                    if (!K.llllllIIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[lIIlIlIIll[1]];
                    nArray2[K.lIIlIlIIll[0]] = lIIlIlIIll[17];
                    if (!K.llllllIIIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                K.cz();
            }
            if (K.llllllIIlIll(K.llllllIIIlII(e.u(), 45.0))) {
                int[] nArray = new int[lIIlIlIIll[1]];
                nArray[K.lIIlIlIIll[0]] = lIIlIlIIll[11];
                if (K.llllllIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIlIlIIll[1]];
                    nArray3[K.lIIlIlIIll[0]] = lIIlIlIIll[11];
                    Inventory.getFirst((int[])nArray3).interact(lIIlIIllll[lIIlIlIIll[18]]);
                    Time.sleepTicks((int)lIIlIlIIll[1]);

                }
            }
            if (K.llllllIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), lIIlIlIIll[19]) && K.llllllIIlIlI(Skills.getLevel((Skill)Skill.STRENGTH), lIIlIlIIll[19])) {
                j.Q();
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (K.llllllIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), lIIlIlIIll[2])) {
            bl = lIIlIlIIll[1];

            if (2 <= 0) {
                return false;
            }
        } else {
            bl = lIIlIlIIll[0];
        }
        return bl;
    }

    private static boolean llllllIIlIll(int n2) {
        return n2 < 0;
    }

    private static boolean llllllIIlIIl(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean S() {
        return lIIlIlIIll[0];
    }

    private static boolean llllllIIlllI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String U() {
        return lIIlIIllll[lIIlIlIIll[57]];
    }

    private static boolean llllllIIlIII(Object object) {
        return object != null;
    }

    public static void cz() {
        if (K.llllllIIIllI(Skills.getLevel((Skill)Skill.DEFENCE), lIIlIlIIll[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    @Override
    public int T() {
        try {
            K.cw();

        }
        catch (Exception var4) {
            var4.printStackTrace();
        }
        if ((0x19 ^ 0x4D ^ (0xE7 ^ 0xB7)) < 0) {
            return (0xEB ^ 0x85 ^ (4 ^ 0x3B)) & (0x7E ^ 0x7B ^ (0xC9 ^ 0x9D) ^ -1);
        }
        return lIIlIlIIll[0];
    }

    private static boolean llllllIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public static void aa() {
        if (K.llllllIIIlll(iF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIllll[lIIlIlIIll[20]];
            Movement.walkTo((WorldPoint)bx);

            Time.sleepTicks((int)lIIlIlIIll[1]);

        }
        if (K.llllllIIIlIl(iF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIllll[lIIlIlIIll[21]];
            if (K.llllllIIllII(Players.getLocal().getInteracting())) {
                NPC var5 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (K.llllllIIIlIl(nPC.getName().contains(lIIlIIllll[lIIlIlIIll[58]]) ? 1 : 0) && K.llllllIIllII(nPC.getInteracting()) && K.llllllIIIlll(nPC.isDead() ? 1 : 0)) {
                        n2 = lIIlIlIIll[1];

                        if (1 > 1) {
                            return false;
                        }
                    } else {
                        n2 = lIIlIlIIll[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[lIIlIlIIll[3]];
                stringArray[K.lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[22]];
                stringArray[K.lIIlIlIIll[1]] = lIIlIIllll[lIIlIlIIll[23]];
                List var6 = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (K.llllllIIlllI(nPC.getInteracting(), Players.getLocal())) {
                        bl = lIIlIlIIll[1];

                    } else {
                        bl = lIIlIlIIll[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (K.llllllIIIlll(var6.isEmpty() ? 1 : 0)) {
                    ((NPC)var6.get(lIIlIlIIll[0])).interact(lIIlIIllll[lIIlIlIIll[24]]);
                    Time.sleepTicks((int)lIIlIlIIll[3]);

                }
                if (K.llllllIIlIII(var5) && K.llllllIIIlll(Players.getLocal().isMoving() ? 1 : 0) && K.llllllIIIlIl(var6.isEmpty() ? 1 : 0)) {
                    var5.interact(lIIlIIllll[lIIlIlIIll[25]]);
                    Time.sleepTicks((int)lIIlIlIIll[3]);

                }
            }
            if (K.llllllIIlIII(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)lIIlIlIIll[6]);

            }
        }
    }

    private static int llllllIIIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llllllIIIlIl(int n2) {
        return n2 != 0;
    }
}

