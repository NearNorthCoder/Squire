/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
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
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.ANHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class XHelper
implements W {
    public static  boolean bt;
    static  WorldArea dk;
    public static  boolean dh;
    public static  boolean df;
    static  int cl;
    static  int dj;
    public static  List<d> bv;
    public static  boolean bW;
    
    public static  boolean dg;
    public static  boolean di;
    public static  boolean de;
    
    static  WorldPoint bX;

    private static int lIIlIlIllllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public int T() {
        try {
            x.aV();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0xA1 ^ 0xA5) <= ((0x57 ^ 0x15) & ~(0x53 ^ 0x11))) {
            return (0x4D ^ 0x7C) & ~(0x7A ^ 0x4B);
        }
        return lIllIIlIl[97];
    }

    private static boolean lIIlIllIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIllIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIlIlllII() {
        lIllIIIll = new String[lIllIIlIl[112]];
        x.lIllIIIll[x.lIllIIlIl[1]] = "Finished buying items, switching back to quest";
        x.lIllIIIll[x.lIllIIlIl[0]] = "Nav to bank";
        x.lIllIIIll[x.lIllIIlIl[3]] = "Handling banking";
        x.lIllIIIll[x.lIllIIlIl[11]] = "We are missing quest supplies, switching to BUYING";
        x.lIllIIIll[x.lIllIIlIl[4]] = "We are missing quest supplies, switching to BUYING";
        x.lIllIIIll[x.lIllIIlIl[12]] = "Drink";
        x.lIllIIIll[x.lIllIIlIl[17]] = "Drink";
        x.lIllIIIll[x.lIllIIlIl[18]] = "Shark";
        x.lIllIIIll[x.lIllIIlIl[19]] = "Shark";
        x.lIllIIIll[x.lIllIIlIl[20]] = "Eat";
        x.lIllIIIll[x.lIllIIlIl[6]] = "Nav to start";
        x.lIllIIIll[x.lIllIIlIl[21]] = "Ceril Carnillean";
        x.lIllIIIll[x.lIllIIlIl[22]] = "Ceril Carnillean";
        x.lIllIIIll[x.lIllIIlIl[25]] = "Nav to valve one";
        x.lIllIIIll[x.lIllIIlIl[26]] = "Sewer valve";
        x.lIllIIIll[x.lIllIIlIl[10]] = "Turn";
        x.lIllIIIll[x.lIllIIlIl[27]] = "Turn it to the right.";
        x.lIllIIIll[x.lIllIIlIl[30]] = "Nav to valve one";
        x.lIllIIIll[x.lIllIIlIl[31]] = "Sewer valve";
        x.lIllIIIll[x.lIllIIlIl[32]] = "Turn";
        x.lIllIIIll[x.lIllIIlIl[33]] = "Turn it to the right.";
        x.lIllIIIll[x.lIllIIlIl[36]] = "Nav to valve one";
        x.lIllIIIll[x.lIllIIlIl[37]] = "Sewer valve";
        x.lIllIIIll[x.lIllIIlIl[38]] = "Turn";
        x.lIllIIIll[x.lIllIIlIl[16]] = "Turn it to the left.";
        x.lIllIIIll[x.lIllIIlIl[40]] = "Nav to valve one";
        x.lIllIIIll[x.lIllIIlIl[41]] = "Sewer valve";
        x.lIllIIIll[x.lIllIIlIl[42]] = "Turn";
        x.lIllIIIll[x.lIllIIlIl[43]] = "Turn it to the right.";
        x.lIllIIIll[x.lIllIIlIl[46]] = "Nav to valve one";
        x.lIllIIIll[x.lIllIIlIl[47]] = "Sewer valve";
        x.lIllIIIll[x.lIllIIlIl[48]] = "Turn";
        x.lIllIIIll[x.lIllIIlIl[49]] = "Turn it to the right.";
        x.lIllIIIll[x.lIllIIlIl[54]] = "Nav to cave";
        x.lIllIIIll[x.lIllIIlIl[55]] = "Cave entrance";
        x.lIllIIIll[x.lIllIIlIl[56]] = "Enter";
        x.lIllIIIll[x.lIllIIlIl[57]] = "Clivet";
        x.lIllIIIll[x.lIllIIlIl[58]] = "Clivet";
        x.lIllIIIll[x.lIllIIlIl[61]] = "Raft";
        x.lIllIIIll[x.lIllIIlIl[62]] = "Board";
        x.lIllIIIll[x.lIllIIlIl[63]] = "Cave entrance";
        x.lIllIIIll[x.lIllIIlIl[64]] = "Enter";
        x.lIllIIIll[x.lIllIIlIl[65]] = "Hazeel Cultist";
        x.lIllIIIll[x.lIllIIlIl[68]] = "Nav to fight";
        x.lIllIIIll[x.lIllIIlIl[69]] = "Alomone";
        x.lIllIIIll[x.lIllIIlIl[70]] = "Talk-to";
        x.lIllIIIll[x.lIllIIlIl[71]] = "Attack";
        x.lIllIIIll[x.lIllIIlIl[72]] = "Alomone";
        x.lIllIIIll[x.lIllIIlIl[73]] = "Attack";
        x.lIllIIIll[x.lIllIIlIl[74]] = "Attack";
        x.lIllIIIll[x.lIllIIlIl[15]] = "Carnillean armour";
        x.lIllIIIll[x.lIllIIlIl[75]] = "Chest";
        x.lIllIIIll[x.lIllIIlIl[76]] = "Search";
        x.lIllIIIll[x.lIllIIlIl[77]] = "Search";
        x.lIllIIIll[x.lIllIIlIl[78]] = "Carnillean armour";
        x.lIllIIIll[x.lIllIIlIl[79]] = "Nav to start";
        x.lIllIIIll[x.lIllIIlIl[80]] = "Ceril Carnillean";
        x.lIllIIIll[x.lIllIIlIl[81]] = "Ceril Carnillean";
        x.lIllIIIll[x.lIllIIlIl[82]] = "Butler Jones";
        x.lIllIIIll[x.lIllIIlIl[83]] = "Staircase";
        x.lIllIIIll[x.lIllIIlIl[84]] = "Climb-up";
        x.lIllIIIll[x.lIllIIlIl[85]] = "Cupboard";
        x.lIllIIIll[x.lIllIIlIl[86]] = "Open";
        x.lIllIIIll[x.lIllIIlIl[87]] = "Open";
        x.lIllIIIll[x.lIllIIlIl[88]] = "Search";
        x.lIllIIIll[x.lIllIIlIl[89]] = "Search";
        x.lIllIIIll[x.lIllIIlIl[90]] = "Break";
        x.lIllIIIll[x.lIllIIlIl[98]] = "Hazeel Cult";
        x.lIllIIIll[x.lIllIIlIl[99]] = "ring of wealth (";
        x.lIllIIIll[x.lIllIIlIl[100]] = "teleport";
        x.lIllIIIll[x.lIllIIlIl[101]] = "teleport";
        x.lIllIIIll[x.lIllIIlIl[107]] = "Yes.";
        x.lIllIIIll[x.lIllIIlIl[108]] = "What's wrong?";
        x.lIllIIIll[x.lIllIIlIl[109]] = "Alright, I've made my decision.";
        x.lIllIIIll[x.lIllIIlIl[110]] = "I won't help you. (side with Ceril)";
        x.lIllIIIll[x.lIllIIlIl[111]] = "I won't help you.";
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void llIlllIlIIIlll;
        int[] nArray = new int[lIllIIlIl[12]];
        nArray[x.lIllIIlIl[1]] = lIllIIlIl[9];
        nArray[x.lIllIIlIl[0]] = lIllIIlIl[5];
        nArray[x.lIllIIlIl[3]] = lIllIIlIl[13];
        nArray[x.lIllIIlIl[11]] = lIllIIlIl[7];
        nArray[x.lIllIIlIl[4]] = lIllIIlIl[14];
        int[] nArray2 = nArray;
        int llIlllIlIIIllI = lIllIIlIl[1];
        while (x.lIIlIllIIIII(llIlllIlIIIllI, ((void)llIlllIlIIIlll).length)) {
            int[] nArray3 = new int[lIllIIlIl[0]];
            nArray3[x.lIllIIlIl[1]] = llIlllIlIIIlll[llIlllIlIIIllI];
            if (x.lIIlIllIIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIllIIlIl[1];
            }
            ++llIlllIlIIIllI;

            if (2 > 0) continue;
            return ((104 + 41 - 77 + 174 ^ 109 + 71 - 87 + 92) & (0x52 ^ 0x5E ^ (0x80 ^ 0xC7) ^ -1)) != 0;
        }
        return lIllIIlIl[0];
    }

    private static void af() {
        block26: {
            d llIlllIlIIIIlI;
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                Object llIlllIlIIIIll;
                                block20: {
                                    block19: {
                                        block18: {
                                            block17: {
                                                int[] nArray = new int[lIllIIlIl[0]];
                                                nArray[x.lIllIIlIl[1]] = lIllIIlIl[14];
                                                if (x.lIIlIllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    d d2 = new DHelper(lIllIIlIl[14], lIllIIlIl[0], lIllIIlIl[91]);
                                                    bv.add(d2);

                                                }
                                                int[] nArray2 = new int[lIllIIlIl[0]];
                                                nArray2[x.lIllIIlIl[1]] = lIllIIlIl[5];
                                                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) break block17;
                                                int[] nArray3 = new int[lIllIIlIl[0]];
                                                nArray3[x.lIllIIlIl[1]] = lIllIIlIl[5];
                                                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                int[] nArray4 = new int[lIllIIlIl[0]];
                                                nArray4[x.lIllIIlIl[1]] = lIllIIlIl[5];
                                                if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray4).getQuantity(), lIllIIlIl[6])) break block18;
                                            }
                                            llIlllIlIIIIll = new DHelper(lIllIIlIl[5], lIllIIlIl[6], e.c(lIllIIlIl[92], lIllIIlIl[93]));
                                            bv.add((DHelper) lIlllIlIIIIll);

                                        }
                                        int[] nArray = new int[lIllIIlIl[0]];
                                        nArray[x.lIllIIlIl[1]] = lIllIIlIl[13];
                                        if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block19;
                                        int[] nArray5 = new int[lIllIIlIl[0]];
                                        nArray5[x.lIllIIlIl[1]] = lIllIIlIl[13];
                                        if (!x.lIIlIlIlllll(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                        int[] nArray6 = new int[lIllIIlIl[0]];
                                        nArray6[x.lIllIIlIl[1]] = lIllIIlIl[13];
                                        if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray6).getQuantity(), lIllIIlIl[6])) break block20;
                                    }
                                    llIlllIlIIIIll = new DHelper(lIllIIlIl[13], lIllIIlIl[6], e.c(lIllIIlIl[92], lIllIIlIl[93]));
                                    bv.add((DHelper) lIlllIlIIIIll);

                                }
                                if (x.lIIlIllIIIIl(Bank.contains((Predicate)(llIlllIlIIIIll = item -> item.getName().toLowerCase().contains(lIllIIIll[lIllIIlIl[99]]))) ? 1 : 0)) {
                                    llIlllIlIIIIlI = new DHelper(lIllIIlIl[94], lIllIIlIl[12], lIllIIlIl[95]);
                                    bv.add(llIlllIlIIIIlI);

                                }
                                int[] nArray = new int[lIllIIlIl[0]];
                                nArray[x.lIllIIlIl[1]] = lIllIIlIl[7];
                                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block21;
                                int[] nArray7 = new int[lIllIIlIl[0]];
                                nArray7[x.lIllIIlIl[1]] = lIllIIlIl[7];
                                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray7) ? 1 : 0)) break block22;
                                int[] nArray8 = new int[lIllIIlIl[0]];
                                nArray8[x.lIllIIlIl[1]] = lIllIIlIl[7];
                                if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray8).getQuantity(), lIllIIlIl[4])) break block22;
                            }
                            llIlllIlIIIIlI = new DHelper(lIllIIlIl[7], lIllIIlIl[4], i.bq);
                            bv.add(llIlllIlIIIIlI);

                        }
                        int[] nArray = new int[lIllIIlIl[0]];
                        nArray[x.lIllIIlIl[1]] = lIllIIlIl[8];
                        if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                        int[] nArray9 = new int[lIllIIlIl[0]];
                        nArray9[x.lIllIIlIl[1]] = lIllIIlIl[8];
                        if (!x.lIIlIlIlllll(Bank.contains((int[])nArray9) ? 1 : 0)) break block24;
                        int[] nArray10 = new int[lIllIIlIl[0]];
                        nArray10[x.lIllIIlIl[1]] = lIllIIlIl[8];
                        if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray10).getQuantity(), lIllIIlIl[4])) break block24;
                    }
                    llIlllIlIIIIlI = new DHelper(lIllIIlIl[8], lIllIIlIl[4], lIllIIlIl[96]);
                    bv.add(llIlllIlIIIIlI);

                }
                int[] nArray = new int[lIllIIlIl[0]];
                nArray[x.lIllIIlIl[1]] = lIllIIlIl[9];
                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block25;
                int[] nArray11 = new int[lIllIIlIl[0]];
                nArray11[x.lIllIIlIl[1]] = lIllIIlIl[9];
                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray11) ? 1 : 0)) break block26;
                int[] nArray12 = new int[lIllIIlIl[0]];
                nArray12[x.lIllIIlIl[1]] = lIllIIlIl[9];
                if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray12).getQuantity(), lIllIIlIl[10])) break block26;
            }
            llIlllIlIIIIlI = new DHelper(lIllIIlIl[9], lIllIIlIl[63], e.c(lIllIIlIl[92], lIllIIlIl[93]));
            bv.add(llIlllIlIIIIlI);

        }
    }

    @Override
    public boolean V() {
        int n2;
        if (x.lIIlIllIIlII(e.j(dj), lIllIIlIl[20]) && x.lIIlIllIIIIl(dk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lIllIIlIl[0];

            if ((0xB6 ^ 0xAC ^ (0x46 ^ 0x58)) > (0xDC ^ 0xAF ^ (0xF8 ^ 0x8F))) {
                return ((0x27 ^ 0x18 ^ (0xE4 ^ 0x82)) & (70 + 22 - 31 + 147 ^ 113 + 54 - 114 + 84 ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIlIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIIlIllIIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIllIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String U() {
        return lIllIIIll[lIllIIlIl[98]];
    }

    private static boolean lIIlIllIIIlI(Object object) {
        return object != null;
    }

        return String.valueOf(llIlllIIlIIllI);
    }

    private static boolean lIIlIllIIlIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlIlIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIllIlIIl(Object object) {
        return object == null;
    }

    public static void aV() {
        block89: {
            BankLocation llIlllIlIIllll;
            block96: {
                WorldPoint llIlllIlIIllII;
                block97: {
                    WorldArea llIlllIlIIlllI;
                    block90: {
                        block95: {
                            block92: {
                                block94: {
                                    block93: {
                                        block91: {
                                            if (x.lIIlIlIlllll(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (x.lIIlIllIIIII(bv.size(), lIllIIlIl[0])) {
                                                    System.out.println(lIllIIIll[lIllIIlIl[1]]);
                                                    bt = lIllIIlIl[1];
                                                }
                                            }
                                            if (!x.lIIlIllIIIIl(bt ? 1 : 0)) break block89;
                                            if (!x.lIIlIllIIIIl(x.ab() ? 1 : 0) || !x.lIIlIllIIIII(e.j(dj), lIllIIlIl[0])) break block90;
                                            llIlllIlIIllll = BankLocation.getNearest();
                                            if (x.lIIlIllIIIlI(llIlllIlIIllll) && x.lIIlIllIIIIl(llIlllIlIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[0]];
                                                a.a(llIlllIlIIllll);
                                            }
                                            if (!x.lIIlIllIIIlI(llIlllIlIIllll) || !x.lIIlIlIlllll(llIlllIlIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block90;
                                            if (x.lIIlIllIIIIl(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIlIl[2]);

                                            }
                                            if (!x.lIIlIlIlllll(Bank.isOpen() ? 1 : 0)) break block90;
                                            AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[3]];
                                            if (x.lIIlIllIIIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIllIIlIl[4]);

                                            }
                                            if (x.lIIlIllIIIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIllIIlIl[3]);

                                            }
                                            int[] nArray = new int[lIllIIlIl[0]];
                                            nArray[x.lIllIIlIl[1]] = lIllIIlIl[5];
                                            if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block91;
                                            int[] nArray2 = new int[lIllIIlIl[0]];
                                            nArray2[x.lIllIIlIl[1]] = lIllIIlIl[5];
                                            if (!x.lIIlIllIIlII(Bank.getFirst((int[])nArray2).getQuantity(), lIllIIlIl[6])) break block92;
                                        }
                                        int[] nArray = new int[lIllIIlIl[0]];
                                        nArray[x.lIllIIlIl[1]] = lIllIIlIl[7];
                                        if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block93;
                                        int[] nArray3 = new int[lIllIIlIl[0]];
                                        nArray3[x.lIllIIlIl[1]] = lIllIIlIl[7];
                                        if (!x.lIIlIllIIlII(Bank.getFirst((int[])nArray3).getQuantity(), lIllIIlIl[4])) break block92;
                                    }
                                    int[] nArray = new int[lIllIIlIl[0]];
                                    nArray[x.lIllIIlIl[1]] = lIllIIlIl[8];
                                    if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block94;
                                    int[] nArray4 = new int[lIllIIlIl[0]];
                                    nArray4[x.lIllIIlIl[1]] = lIllIIlIl[8];
                                    if (!x.lIIlIllIIlII(Bank.getFirst((int[])nArray4).getQuantity(), lIllIIlIl[4])) break block92;
                                }
                                int[] nArray = new int[lIllIIlIl[0]];
                                nArray[x.lIllIIlIl[1]] = lIllIIlIl[9];
                                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block95;
                                int[] nArray5 = new int[lIllIIlIl[0]];
                                nArray5[x.lIllIIlIl[1]] = lIllIIlIl[9];
                                if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray5).getQuantity(), lIllIIlIl[10])) break block95;
                            }
                            x.af();
                            System.out.println(lIllIIIll[lIllIIlIl[11]]);
                            bt = lIllIIlIl[0];
                            return;
                        }
                        int[] nArray = new int[lIllIIlIl[12]];
                        nArray[x.lIllIIlIl[1]] = lIllIIlIl[9];
                        nArray[x.lIllIIlIl[0]] = lIllIIlIl[5];
                        nArray[x.lIllIIlIl[3]] = lIllIIlIl[13];
                        nArray[x.lIllIIlIl[11]] = lIllIIlIl[7];
                        nArray[x.lIllIIlIl[4]] = lIllIIlIl[14];
                        if (x.lIIlIllIIIIl(e.b(nArray) ? 1 : 0)) {
                            x.af();
                            System.out.println(lIllIIIll[lIllIIlIl[4]]);
                            bt = lIllIIlIl[0];
                            return;
                        }
                        int[] nArray6 = new int[lIllIIlIl[12]];
                        nArray6[x.lIllIIlIl[1]] = lIllIIlIl[9];
                        nArray6[x.lIllIIlIl[0]] = lIllIIlIl[5];
                        nArray6[x.lIllIIlIl[3]] = lIllIIlIl[13];
                        nArray6[x.lIllIIlIl[11]] = lIllIIlIl[7];
                        nArray6[x.lIllIIlIl[4]] = lIllIIlIl[14];
                        if (x.lIIlIlIlllll(e.b(nArray6) ? 1 : 0)) {
                            a.a(lIllIIlIl[7], lIllIIlIl[4]);
                            a.a(lIllIIlIl[8], lIllIIlIl[3]);
                            a.a(lIllIIlIl[9], lIllIIlIl[6]);
                            a.a(lIllIIlIl[5], lIllIIlIl[6]);
                            a.a(lIllIIlIl[13], lIllIIlIl[6]);
                            a.a(lIllIIlIl[14], lIllIIlIl[0]);
                        }
                    }
                    if (x.lIIlIlIlllll(Inventory.contains((int[])f.aV) ? 1 : 0) && x.lIIlIllIIIII(Movement.getRunEnergy(), lIllIIlIl[15])) {
                        Inventory.getFirst((int[])f.aV).interact(lIllIIIll[lIllIIlIl[12]]);
                        Time.sleepTicks((int)lIllIIlIl[0]);

                    }
                    if (x.lIIlIlIlllll(Inventory.contains((int[])f.aS) ? 1 : 0) && x.lIIlIllIIIII(Prayers.getPoints(), lIllIIlIl[16])) {
                        Inventory.getFirst((int[])f.aS).interact(lIllIIIll[lIllIIlIl[17]]);
                    }
                    if (x.lIIlIllIIlIl(x.lIIlIlIllllI(e.u(), 60.0))) {
                        String[] stringArray = new String[lIllIIlIl[0]];
                        stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[18]];
                        if (x.lIIlIlIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            String[] stringArray2 = new String[lIllIIlIl[0]];
                            stringArray2[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[19]];
                            Inventory.getFirst((String[])stringArray2).interact(lIllIIIll[lIllIIlIl[20]]);
                            Time.sleepTicks((int)lIllIIlIl[3]);

                        }
                    }
                    if (x.lIIlIlIlllll(x.ab() ? 1 : 0) && x.lIIlIllIIIIl(e.j(dj))) {
                        if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                            AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[6]];
                            if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)bX);

                            Time.sleepTicks((int)lIllIIlIl[0]);

                        }
                        if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                            String[] stringArray = new String[lIllIIlIl[0]];
                            stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[21]];
                            llIlllIlIIllll = NPCs.getNearest((String[])stringArray);
                            if (x.lIIlIllIIIIl(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)llIlllIlIIllll.getWorldLocation());

                                Time.sleepTicks((int)lIllIIlIl[0]);

                            }
                            if (x.lIIlIlIlllll(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                                g.a(lIllIIIll[lIllIIlIl[22]], bR);
                            }
                        }
                    }
                    if (x.lIIlIllIlIII(e.j(dj), lIllIIlIl[3])) {
                        if (x.lIIlIllIIIIl(de ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[23], lIllIIlIl[24], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[25]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);

                                Time.sleepTicks((int)lIllIIlIl[0]);

                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                if (x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[26]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[10]]);
                                    Time.sleepTicks((int)lIllIIlIl[11]);

                                }
                                if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[27]];
                                    g.a(stringArray);
                                    Time.sleepTicks((int)lIllIIlIl[11]);

                                    de = lIllIIlIl[0];
                                }
                            }
                        }
                        if (x.lIIlIlIlllll(de ? 1 : 0) && x.lIIlIllIIIIl(df ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[28], lIllIIlIl[29], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[30]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);

                                Time.sleepTicks((int)lIllIIlIl[0]);

                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                if (x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[31]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[32]]);
                                    Time.sleepTicks((int)lIllIIlIl[11]);

                                }
                                if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[33]];
                                    g.a(stringArray);
                                    Time.sleepTicks((int)lIllIIlIl[11]);

                                    df = lIllIIlIl[0];
                                }
                            }
                        }
                        if (x.lIIlIlIlllll(de ? 1 : 0) && x.lIIlIlIlllll(df ? 1 : 0) && x.lIIlIllIIIIl(dg ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[34], lIllIIlIl[35], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[36]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);

                                Time.sleepTicks((int)lIllIIlIl[0]);

                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                if (x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[37]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[38]]);
                                    Time.sleepTicks((int)lIllIIlIl[11]);

                                }
                                if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[16]];
                                    g.a(stringArray);
                                    Time.sleepTicks((int)lIllIIlIl[11]);

                                    dg = lIllIIlIl[0];
                                }
                            }
                        }
                        if (x.lIIlIlIlllll(de ? 1 : 0) && x.lIIlIlIlllll(df ? 1 : 0) && x.lIIlIlIlllll(dg ? 1 : 0) && x.lIIlIllIIIIl(dh ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[39], lIllIIlIl[29], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[40]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);

                                Time.sleepTicks((int)lIllIIlIl[0]);

                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                if (x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[41]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[42]]);
                                    Time.sleepTicks((int)lIllIIlIl[11]);

                                }
                                if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[43]];
                                    g.a(stringArray);
                                    Time.sleepTicks((int)lIllIIlIl[11]);

                                    dh = lIllIIlIl[0];
                                }
                            }
                        }
                        if (x.lIIlIlIlllll(de ? 1 : 0) && x.lIIlIlIlllll(df ? 1 : 0) && x.lIIlIlIlllll(dg ? 1 : 0) && x.lIIlIlIlllll(dh ? 1 : 0) && x.lIIlIllIIIIl(di ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[44], lIllIIlIl[45], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[46]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);

                                Time.sleepTicks((int)lIllIIlIl[0]);

                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                if (x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[47]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[48]]);
                                    Time.sleepTicks((int)lIllIIlIl[11]);

                                }
                                if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[49]];
                                    g.a(stringArray);
                                    Time.sleepTicks((int)lIllIIlIl[11]);

                                    di = lIllIIlIl[0];
                                }
                            }
                        }
                        if (x.lIIlIlIlllll(de ? 1 : 0) && x.lIIlIlIlllll(df ? 1 : 0) && x.lIIlIlIlllll(dg ? 1 : 0) && x.lIIlIlIlllll(dh ? 1 : 0) && x.lIIlIlIlllll(di ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[50], lIllIIlIl[51], lIllIIlIl[1]);
                            llIlllIlIIlllI = new WorldArea(lIllIIlIl[52], lIllIIlIl[53], lIllIIlIl[27], lIllIIlIl[26], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[12]) && x.lIIlIllIIIIl(llIlllIlIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[54]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);

                                Time.sleepTicks((int)lIllIIlIl[0]);

                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[12])) {
                                String[] stringArray = new String[lIllIIlIl[0]];
                                stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[55]];
                                TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[56]]);
                                Time.sleepTicks((int)lIllIIlIl[4]);

                            }
                            if (x.lIIlIlIlllll(llIlllIlIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                g.a(lIllIIIll[lIllIIlIl[57]], bR);
                            }
                        }
                    }
                    if (x.lIIlIllIlIII(e.j(dj), lIllIIlIl[11])) {
                        g.a(lIllIIIll[lIllIIlIl[58]], bR);
                    }
                    if (!x.lIIlIllIlIII(e.j(dj), lIllIIlIl[4])) break block96;
                    llIlllIlIIllll = new WorldArea(lIllIIlIl[52], lIllIIlIl[53], lIllIIlIl[27], lIllIIlIl[26], lIllIIlIl[1]);
                    llIlllIlIIlllI = new WorldArea(lIllIIlIl[52], lIllIIlIl[53], lIllIIlIl[27], lIllIIlIl[26], lIllIIlIl[1]);
                    WorldPoint llIlllIlIIllIl = new WorldPoint(lIllIIlIl[50], lIllIIlIl[51], lIllIIlIl[1]);
                    llIlllIlIIllII = new WorldPoint(lIllIIlIl[59], lIllIIlIl[60], lIllIIlIl[1]);
                    if (x.lIIlIlIlllll(llIlllIlIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIlIl[0]];
                        stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[61]];
                        TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[62]]);
                        Time.sleepTicks((int)lIllIIlIl[11]);

                    }
                    if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(llIlllIlIIllIl), lIllIIlIl[12])) {
                        String[] stringArray = new String[lIllIIlIl[0]];
                        stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[63]];
                        TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[64]]);
                        Time.sleepTicks((int)lIllIIlIl[4]);

                    }
                    if (!x.lIIlIllIIIIl(llIlllIlIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block97;
                    String[] stringArray = new String[lIllIIlIl[0]];
                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[65]];
                    if (!x.lIIlIllIIIlI(NPCs.getNearest((String[])stringArray))) break block96;
                }
                WorldPoint llIlllIlIIlIll = new WorldPoint(lIllIIlIl[66], lIllIIlIl[67], lIllIIlIl[1]);
                if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(llIlllIlIIlIll), lIllIIlIl[12]) && x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(llIlllIlIIllII), lIllIIlIl[6])) {
                    AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[68]];
                    Movement.walkTo((WorldPoint)llIlllIlIIlIll);

                    Time.sleepTicks((int)lIllIIlIl[0]);

                }
                if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(llIlllIlIIlIll), lIllIIlIl[12])) {
                    if (x.lIIlIllIIlII(Skills.getLevel((Skill)Skill.PRAYER), lIllIIlIl[68]) && x.lIIlIllIIIll(Prayers.getPoints()) && x.lIIlIllIIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    e.l(lIllIIlIl[14]);
                    String[] stringArray = new String[lIllIIlIl[0]];
                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[69]];
                    NPC llIlllIlIIlIlI = NPCs.getNearest((String[])stringArray);
                    if (x.lIIlIllIIIlI(llIlllIlIIlIlI)) {
                        String[] stringArray3 = new String[lIllIIlIl[0]];
                        stringArray3[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[70]];
                        if (x.lIIlIlIlllll(llIlllIlIIlIlI.hasAction(stringArray3) ? 1 : 0)) {
                            String[] stringArray4 = new String[lIllIIlIl[0]];
                            stringArray4[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[71]];
                            if (x.lIIlIllIIIIl(llIlllIlIIlIlI.hasAction(stringArray4) ? 1 : 0)) {
                                g.a(lIllIIIll[lIllIIlIl[72]], bR);
                            }
                        }
                    }
                    if (x.lIIlIllIIIlI(llIlllIlIIlIlI)) {
                        String[] stringArray5 = new String[lIllIIlIl[0]];
                        stringArray5[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[73]];
                        if (x.lIIlIlIlllll(llIlllIlIIlIlI.hasAction(stringArray5) ? 1 : 0) && x.lIIlIllIlIIl(Players.getLocal().getInteracting())) {
                            llIlllIlIIlIlI.interact(lIllIIIll[lIllIIlIl[74]]);
                            Time.sleepTicks((int)lIllIIlIl[3]);

                        }
                    }
                }
            }
            if (x.lIIlIllIlIII(e.j(dj), lIllIIlIl[17])) {
                if (x.lIIlIlIlllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                String[] stringArray = new String[lIllIIlIl[0]];
                stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[15]];
                if (x.lIIlIllIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray6 = new String[lIllIIlIl[0]];
                    stringArray6[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[75]];
                    llIlllIlIIllll = TileObjects.getNearest((String[])stringArray6);
                    if (x.lIIlIllIIIlI(llIlllIlIIllll)) {
                        String[] stringArray7 = new String[lIllIIlIl[0]];
                        stringArray7[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[76]];
                        if (x.lIIlIlIlllll(llIlllIlIIllll.hasAction(stringArray7) ? 1 : 0)) {
                            llIlllIlIIllll.interact(lIllIIIll[lIllIIlIl[77]]);
                            Time.sleepTicks((int)lIllIIlIl[12]);

                        }
                    }
                }
                String[] stringArray8 = new String[lIllIIlIl[0]];
                stringArray8[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[78]];
                if (x.lIIlIlIlllll(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                    if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                        AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[79]];
                        if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)bX);

                        Time.sleepTicks((int)lIllIIlIl[0]);

                    }
                    if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                        String[] stringArray9 = new String[lIllIIlIl[0]];
                        stringArray9[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[80]];
                        llIlllIlIIllll = NPCs.getNearest((String[])stringArray9);
                        if (x.lIIlIllIIIIl(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)llIlllIlIIllll.getWorldLocation());

                            Time.sleepTicks((int)lIllIIlIl[0]);

                        }
                        if (x.lIIlIlIlllll(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                            g.a(lIllIIIll[lIllIIlIl[81]], bR);
                        }
                    }
                }
            }
            if (x.lIIlIllIlIII(e.j(dj), lIllIIlIl[18])) {
                if (x.lIIlIllIIIIl(Players.getLocal().getWorldLocation().getPlane()) && x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIllIIlIl[0]];
                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[82]];
                    if (x.lIIlIllIIIlI(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray10 = new String[lIllIIlIl[0]];
                        stringArray10[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[83]];
                        llIlllIlIIllll = TileObjects.getNearest((String[])stringArray10);
                        if (x.lIIlIllIIIIl(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)llIlllIlIIllll.getWorldLocation());

                            Time.sleepTicks((int)lIllIIlIl[0]);

                        }
                        if (x.lIIlIlIlllll(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                            llIlllIlIIllll.interact(lIllIIIll[lIllIIlIl[84]]);
                        }
                    }
                }
                if (x.lIIlIllIlIII(Players.getLocal().getWorldLocation().getPlane(), lIllIIlIl[0])) {
                    if (x.lIIlIllIIIII(cl, lIllIIlIl[0])) {
                        an.mX += lIllIIlIl[0];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIllIIlIl[0];
                        an.mX = lIllIIlIl[1];
                    }
                    String[] stringArray = new String[lIllIIlIl[0]];
                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[85]];
                    llIlllIlIIllll = TileObjects.getNearest((String[])stringArray);
                    if (x.lIIlIllIIIlI(llIlllIlIIllll)) {
                        if (x.lIIlIllIIIIl(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)llIlllIlIIllll.getWorldLocation());

                            Time.sleepTicks((int)lIllIIlIl[0]);

                        }
                        if (x.lIIlIlIlllll(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0) && x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray11 = new String[lIllIIlIl[0]];
                            stringArray11[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[86]];
                            if (x.lIIlIlIlllll(llIlllIlIIllll.hasAction(stringArray11) ? 1 : 0)) {
                                llIlllIlIIllll.interact(lIllIIIll[lIllIIlIl[87]]);
                                Time.sleepTicks((int)lIllIIlIl[0]);

                            }
                            String[] stringArray12 = new String[lIllIIlIl[0]];
                            stringArray12[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[88]];
                            if (x.lIIlIlIlllll(llIlllIlIIllll.hasAction(stringArray12) ? 1 : 0)) {
                                llIlllIlIIllll.interact(lIllIIIll[lIllIIlIl[89]]);
                                Time.sleepTicks((int)lIllIIlIl[0]);

                            }
                        }
                    }
                }
            }
            if (x.lIIlIllIIlII(e.j(dj), lIllIIlIl[20]) && x.lIIlIlIlllll(dk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.lIIlIlIlllll(Inventory.contains(item -> item.getName().contains(lIllIIIll[lIllIIlIl[101]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(lIllIIIll[lIllIIlIl[100]])).interact(lIllIIIll[lIllIIlIl[90]]);
                Time.sleepTicks((int)e.c(lIllIIlIl[17], lIllIIlIl[19]));

            }
            g.a(bR);
        }
    }

    @Override
    public boolean S() {
        return lIllIIlIl[1];
    }

    private static boolean lIIlIllIIIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIllIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        x.lIIlIlIlllIl();
        x.lIIlIlIlllII();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIllIIlIl[102], lIllIIlIl[103], lIllIIlIl[1]);
        dj = lIllIIlIl[104];
        dk = new WorldArea(lIllIIlIl[105], lIllIIlIl[106], lIllIIlIl[27], lIllIIlIl[21], lIllIIlIl[1]);
        String[] stringArray = new String[lIllIIlIl[12]];
        stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[107]];
        stringArray[x.lIllIIlIl[0]] = lIllIIIll[lIllIIlIl[108]];
        stringArray[x.lIllIIlIl[3]] = lIllIIIll[lIllIIlIl[109]];
        stringArray[x.lIllIIlIl[11]] = lIllIIIll[lIllIIlIl[110]];
        stringArray[x.lIllIIlIl[4]] = lIllIIIll[lIllIIlIl[111]];
        bR = stringArray;
    }
}

