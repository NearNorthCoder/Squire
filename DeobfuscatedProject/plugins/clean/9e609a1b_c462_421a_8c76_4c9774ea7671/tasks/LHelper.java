/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
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
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.OHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.IHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.MHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
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
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class LHelper
implements M {
    
    public static final  WorldPoint cf;
    public static final  WorldPoint ce;
    public static final  WorldPoint cd;
    public static final  WorldPoint ch;
    public static final  WorldPoint cl;
    static  boolean cp;
    public static final  WorldPoint cg;
    public static final  WorldPoint ci;
    public static final  WorldPoint ck;
    static  int cm;
    public static  boolean by;
    static  WorldArea cn;
    public static  List<d> bA;
    public static final  WorldPoint cj;
    
    static  int co;

    static {
        l.lIlIIIllllIlIII();
        l.lIlIIIllllIIlll();
        cd = new WorldPoint(lIIIlllIIlIlI[91], lIIIlllIIlIlI[92], lIIIlllIIlIlI[1]);
        ce = new WorldPoint(lIIIlllIIlIlI[93], lIIIlllIIlIlI[94], lIIIlllIIlIlI[1]);
        cf = new WorldPoint(lIIIlllIIlIlI[95], lIIIlllIIlIlI[96], lIIIlllIIlIlI[1]);
        cg = new WorldPoint(lIIIlllIIlIlI[97], lIIIlllIIlIlI[98], lIIIlllIIlIlI[1]);
        ch = new WorldPoint(lIIIlllIIlIlI[99], lIIIlllIIlIlI[100], lIIIlllIIlIlI[1]);
        ci = new WorldPoint(lIIIlllIIlIlI[101], lIIIlllIIlIlI[102], lIIIlllIIlIlI[1]);
        cj = new WorldPoint(lIIIlllIIlIlI[103], lIIIlllIIlIlI[104], lIIIlllIIlIlI[1]);
        ck = new WorldPoint(lIIIlllIIlIlI[91], lIIIlllIIlIlI[105], lIIIlllIIlIlI[1]);
        cl = new WorldPoint(lIIIlllIIlIlI[106], lIIIlllIIlIlI[107], lIIIlllIIlIlI[1]);
        bA = new ArrayList<d>();
        cm = lIIIlllIIlIlI[30];
        cn = new WorldArea(lIIIlllIIlIlI[93], lIIIlllIIlIlI[108], lIIIlllIIlIlI[26], lIIIlllIIlIlI[47], lIIIlllIIlIlI[1]);
        String[] stringArray = new String[lIIIlllIIlIlI[11]];
        stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[109]];
        stringArray[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIIl[lIIIlllIIlIlI[110]];
        stringArray[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIIl[lIIIlllIIlIlI[111]];
        bW = stringArray;
    }

    private static boolean lIlIIIlllllIlII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIIIllllIllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIllllIlllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIIlllllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIIllllIlIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void var1;
        int[] nArray = new int[lIIIlllIIlIlI[12]];
        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
        nArray[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
        nArray[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
        nArray[l.lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
        nArray[l.lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
        nArray[l.lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
        int[] nArray2 = nArray;
        int var2 = lIIIlllIIlIlI[1];
        while (l.lIlIIIllllIlIlI(var2, ((void)var1).length)) {
            int[] nArray3 = new int[lIIIlllIIlIlI[0]];
            nArray3[l.lIIIlllIIlIlI[1]] = var1[var2];
            if (l.lIlIIIllllIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIlllIIlIlI[1];
            }
            ++var2;

            if (1 >= 1) continue;
            return ((0x51 ^ 0x7F ^ (0x2C ^ 0xF)) & (12 + 48 - 10 + 104 ^ 28 + 8 - -15 + 100 ^ -1)) != 0;
        }
        return lIIIlllIIlIlI[0];
    }

    private static boolean lIlIIIllllIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlllllIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIIllllIlIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIllllIIlll() {
        lIIIlllIIlIIl = new String[lIIIlllIIlIlI[112]];
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[1]] = "Finished buying items, switching back to quest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[0]] = "Nav to bank";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[5]] = "Handling banking";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[11]] = "We are missing runes, switching to BUYING";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[6]] = "We are missing quest supplies, switching to BUYING";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[16]] = "Drink";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[12]] = "Drink";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[22]] = "Nav to start";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[23]] = "Lady Servil";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[24]] = "Nav to armour";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[18]] = "Getting armour";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[25]] = "Door";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[26]] = "Open";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[3]] = "Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[27]] = "Door";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[28]] = "Open";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[29]] = "Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[30]] = "Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[31]] = "Open";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[32]] = "Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[33]] = "Open";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[34]] = "Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[35]] = "Search";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[36]] = "Chest";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[37]] = "Search";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[21]] = "Wear";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[40]] = "Wear";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[41]] = "Nav to jail";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[42]] = "Door";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[43]] = "Open";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[44]] = "Nav to guard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[45]] = "Head Guard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[46]] = "Khali brew";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[47]] = "Nav to brew";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[48]] = "Khazard Barman";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[49]] = "Khali brew";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[50]] = "Nav to guard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[51]] = "Nav to guard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[52]] = "Head Guard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[53]] = "Nav to  sammy";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[54]] = "Khazard cell keys";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[55]] = "Khazard Ogre";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[56]] = "Khazard Ogre";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[57]] = "Attack";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[58]] = "Sammy Servil";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[2]] = "Hengrad";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[59]] = "Hengrad";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[60]] = "Hengrad";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[61]] = "Khazard Scorpion";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[62]] = "Khazard Scorpion";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[20]] = "Attack";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[63]] = "Bouncer";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[64]] = "Bouncer";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[65]] = "Attack";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[66]] = "General Khazard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[67]] = "Break";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[71]] = "Nav to start";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[72]] = "General Khazard";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[76]] = "Castle Wars";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[79]] = "Lady Servil";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[86]] = "Fight Arena";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[87]] = "ring of wealth (";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[88]] = "dueling";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[89]] = "dueling";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[90]] = "Prison Gate";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[109]] = "Can I help you?";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[110]] = "I'd like a Khali Brew please.";
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[111]] = "Yes.";
    }

    public static void ar() {
        block77: {
            block83: {
                block85: {
                    block84: {
                        BankLocation var3;
                        block78: {
                            block82: {
                                block80: {
                                    block81: {
                                        block79: {
                                            if (l.lIlIIIllllIlIIl(by ? 1 : 0)) {
                                                b.a(bA);
                                                if (l.lIlIIIllllIlIlI(bA.size(), lIIIlllIIlIlI[0])) {
                                                    System.out.println(lIIIlllIIlIIl[lIIIlllIIlIlI[1]]);
                                                    by = lIIIlllIIlIlI[1];
                                                }
                                            }
                                            if (!l.lIlIIIllllIlIll(by ? 1 : 0)) break block77;
                                            if (l.lIlIIIllllIlIlI(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIIlIlI[2])) {
                                                O.cL();
                                            }
                                            if (l.lIlIIIllllIllII(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIIlIlI[2]) && l.lIlIIIllllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIlIlI[3])) {
                                                i.P();
                                            }
                                            if (!l.lIlIIIllllIlIll(l.S() ? 1 : 0) || !l.lIlIIIllllIlIlI(e.j(cm), lIIIlllIIlIlI[0]) || !l.lIlIIIllllIllII(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIIlIlI[2]) || !l.lIlIIIllllIllII(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIlIlI[3])) break block78;
                                            var3 = BankLocation.getNearest();
                                            if (l.lIlIIIllllIllIl(var3) && l.lIlIIIllllIlIll(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[0]];
                                                a.a(var3);
                                            }
                                            if (!l.lIlIIIllllIllIl(var3) || !l.lIlIIIllllIlIIl(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block78;
                                            if (l.lIlIIIllllIlIll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIIlIlI[4]);

                                            }
                                            if (!l.lIlIIIllllIlIIl(Bank.isOpen() ? 1 : 0)) break block78;
                                            AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[5]];
                                            if (l.lIlIIIllllIlllI(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIlllIIlIlI[6]);

                                            }
                                            if (l.lIlIIIllllIlllI(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIlllIIlIlI[5]);

                                            }
                                            int[] nArray = new int[lIIIlllIIlIlI[0]];
                                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                            if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block79;
                                            int[] nArray2 = new int[lIIIlllIIlIlI[0]];
                                            nArray2[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                            if (!l.lIlIIIllllIllII(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIIlIlI[8])) break block80;
                                        }
                                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                        int[] nArray3 = new int[lIIIlllIIlIlI[0]];
                                        nArray3[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                        if (!l.lIlIIIllllIllII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIIlIlI[8])) break block80;
                                    }
                                    int[] nArray = new int[lIIIlllIIlIlI[0]];
                                    nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                    if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block82;
                                    int[] nArray4 = new int[lIIIlllIIlIlI[0]];
                                    nArray4[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                    if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIIlIlI[8])) break block82;
                                }
                                l.W();
                                System.out.println(lIIIlllIIlIIl[lIIIlllIIlIlI[11]]);
                                by = lIIIlllIIlIlI[0];
                                return;
                            }
                            int[] nArray = new int[lIIIlllIIlIlI[12]];
                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                            nArray[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
                            nArray[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
                            nArray[l.lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
                            nArray[l.lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
                            nArray[l.lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
                            if (l.lIlIIIllllIlIll(e.b(nArray) ? 1 : 0)) {
                                l.W();
                                System.out.println(lIIIlllIIlIIl[lIIIlllIIlIlI[6]]);
                                by = lIIIlllIIlIlI[0];
                                return;
                            }
                            int[] nArray5 = new int[lIIIlllIIlIlI[12]];
                            nArray5[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                            nArray5[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
                            nArray5[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
                            nArray5[l.lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
                            nArray5[l.lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
                            nArray5[l.lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
                            if (l.lIlIIIllllIlIIl(e.b(nArray5) ? 1 : 0)) {
                                while (l.lIlIIIllllIlIll(m.av() ? 1 : 0)) {
                                    m.at();
                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                                    if (1 > ((0x67 ^ 0x6A) & ~(0x46 ^ 0x4B))) continue;
                                    return;
                                }
                                if (l.lIlIIIllllIlIll(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepTicks((int)lIIIlllIIlIlI[12]);

                                }
                                a.a(lIIIlllIIlIlI[13], lIIIlllIIlIlI[18]);
                                a.a(lIIIlllIIlIlI[14], lIIIlllIIlIlI[11]);
                                a.a(lIIIlllIIlIlI[7], lIIIlllIIlIlI[8]);
                                a.a(lIIIlllIIlIlI[10], lIIIlllIIlIlI[8]);
                                a.a(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11]);
                                a.a(lIIIlllIIlIlI[15], lIIIlllIIlIlI[18]);
                                a.a(lIIIlllIIlIlI[19], lIIIlllIIlIlI[4]);
                            }
                        }
                        if (l.lIlIIIllllIlIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && l.lIlIIIllllIlIlI(Movement.getRunEnergy(), lIIIlllIIlIlI[20])) {
                            Inventory.getFirst((int[])f.ba).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[16]]);
                            Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                        }
                        if (l.lIlIIIllllIlIlI(Prayers.getPoints(), lIIIlllIIlIlI[21]) && l.lIlIIIllllIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aX).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[12]]);
                        }
                        if (l.lIlIIIllllIlIIl(l.S() ? 1 : 0) && l.lIlIIIllllIlIll(e.j(cm))) {
                            if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[22]];
                                if (l.lIlIIIllllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)cd);

                                Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                            }
                            if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                                g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[23]], bW);
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[0])) {
                            if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ce), lIIIlllIIlIlI[6]) && l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cf), lIIIlllIIlIlI[6])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[24]];
                                Movement.walkTo((WorldPoint)ce);

                                Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                            }
                            if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ce), lIIIlllIIlIlI[12])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[18]];
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[25]];
                                String[] stringArray2 = new String[lIIIlllIIlIlI[0]];
                                stringArray2[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[26]];
                                if (l.lIlIIIllllIlIIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                    String[] stringArray3 = new String[lIIIlllIIlIlI[0]];
                                    stringArray3[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[3]];
                                    if (l.lIlIIIllllIlIll(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray3)) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIIIlllIIlIlI[0]];
                                        stringArray4[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[27]];
                                        TileObjects.getNearest((String[])stringArray4).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[28]]);
                                        Time.sleepTicks((int)lIIIlllIIlIlI[6]);

                                    }
                                }
                                String[] stringArray5 = new String[lIIIlllIIlIlI[0]];
                                stringArray5[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[29]];
                                if (l.lIlIIIllllIlIIl(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray5)) ? 1 : 0)) {
                                    String[] stringArray6 = new String[lIIIlllIIlIlI[0]];
                                    stringArray6[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[30]];
                                    String[] stringArray7 = new String[lIIIlllIIlIlI[0]];
                                    stringArray7[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[31]];
                                    if (l.lIlIIIllllIlIIl(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                        String[] stringArray8 = new String[lIIIlllIIlIlI[0]];
                                        stringArray8[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[32]];
                                        TileObjects.getNearest((String[])stringArray8).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[33]]);
                                        Time.sleepTicks((int)lIIIlllIIlIlI[5]);

                                    }
                                    String[] stringArray9 = new String[lIIIlllIIlIlI[0]];
                                    stringArray9[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[34]];
                                    String[] stringArray10 = new String[lIIIlllIIlIlI[0]];
                                    stringArray10[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[35]];
                                    if (l.lIlIIIllllIlIIl(TileObjects.getNearest((String[])stringArray9).hasAction(stringArray10) ? 1 : 0)) {
                                        String[] stringArray11 = new String[lIIIlllIIlIlI[0]];
                                        stringArray11[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[36]];
                                        TileObjects.getNearest((String[])stringArray11).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[37]]);
                                        Time.sleepTicks((int)lIIIlllIIlIlI[5]);

                                    }
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[5])) {
                            int[] nArray = new int[lIIIlllIIlIlI[0]];
                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[38];
                            if (l.lIlIIIllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIlllIIlIlI[0]];
                                nArray6[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[38];
                                Inventory.getFirst((int[])nArray6).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[21]]);
                            }
                            int[] nArray7 = new int[lIIIlllIIlIlI[0]];
                            nArray7[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[39];
                            if (l.lIlIIIllllIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIlllIIlIlI[0]];
                                nArray8[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[39];
                                Inventory.getFirst((int[])nArray8).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[40]]);
                            }
                            if (l.lIlIIIllllIlIll(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIIlllIIlIlI[6])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[41]];
                                    Movement.walkTo((WorldPoint)cg);

                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cg), lIIIlllIIlIlI[6]) && l.lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0) && l.lIlIIIllllIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                    stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[42]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[43]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);

                                }
                            }
                            if (l.lIlIIIllllIlIIl(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[6])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[44]];
                                    Movement.walkTo((WorldPoint)ch);

                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[6]) && l.lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[45]], bW);
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[11])) {
                            String[] stringArray = new String[lIIIlllIIlIlI[0]];
                            stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[46]];
                            if (l.lIlIIIllllIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ck), lIIIlllIIlIlI[16])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[47]];
                                    Movement.walkTo((WorldPoint)ck);

                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ck), lIIIlllIIlIlI[16])) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[48]], bW);
                                }
                            }
                            String[] stringArray12 = new String[lIIIlllIIlIlI[0]];
                            stringArray12[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[49]];
                            if (l.lIlIIIllllIlIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[50]];
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[16])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[51]];
                                    Movement.walkTo((WorldPoint)ch);

                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[16])) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[52]], bW);
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[16])) {
                            if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[53]];
                                Movement.walkTo((WorldPoint)cl);

                                Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                            }
                            if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11]) && l.lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0) && l.lIlIIIllllIlIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[54]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (l.lIlIIIllllIlIIl(tileObject.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[90]]) ? 1 : 0) && l.lIlIIIlllllIIII(tileObject.getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11])) {
                                        n2 = lIIIlllIIlIlI[0];

                                        if (((0xED ^ 0xB6 ^ (0x60 ^ 0xC)) & (103 + 5 - 27 + 67 ^ 91 + 150 - 201 + 123 ^ -1)) < -1) {
                                            return ((0xCC ^ 0xAF ^ (0x63 ^ 0x2F)) & (0x42 ^ 0x16 ^ (0x66 ^ 0x1D) ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = lIIIlllIIlIlI[1];
                                    }
                                    return n2 != 0;
                                }));
                                Time.sleepTicks((int)lIIIlllIIlIlI[5]);

                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[12])) {
                            if (l.lIlIIIllllIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (l.lIlIIIllllIlIll(i.U() ? 1 : 0)) {
                                i.V();
                            }
                            if (l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[55]];
                                if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray13 = new String[lIIIlllIIlIlI[0]];
                                    stringArray13[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[56]];
                                    NPCs.getNearest((String[])stringArray13).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[57]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);

                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[23]) && l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                            g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[58]], bW);
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[24])) {
                            if (l.lIlIIIllllIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (l.lIlIIIllllIlIll(i.U() ? 1 : 0)) {
                                i.V();
                            }
                            String[] stringArray = new String[lIIIlllIIlIlI[0]];
                            stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[2]];
                            if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[lIIIlllIIlIlI[0]];
                                stringArray14[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[59]];
                                if (l.lIlIIIlllllIIII(NPCs.getNearest((String[])stringArray14).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIlllIIlIlI[16])) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[60]], bW);
                                }
                            }
                            if (l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                                String[] stringArray15 = new String[lIIIlllIIlIlI[0]];
                                stringArray15[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[61]];
                                if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray15))) {
                                    String[] stringArray16 = new String[lIIIlllIIlIlI[0]];
                                    stringArray16[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[62]];
                                    NPCs.getNearest((String[])stringArray16).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[20]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);

                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[18])) {
                            if (l.lIlIIIllllIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (l.lIlIIIllllIlIll(i.U() ? 1 : 0)) {
                                i.V();
                            }
                            if (l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[63]];
                                if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[lIIIlllIIlIlI[0]];
                                    stringArray17[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[64]];
                                    NPCs.getNearest((String[])stringArray17).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[65]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);

                                }
                            }
                        }
                        if (l.lIlIIIlllllIIll(e.j(cm), lIIIlllIIlIlI[25]) && !l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[26])) break block83;
                        String[] stringArray = new String[lIIIlllIIlIlI[0]];
                        stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[66]];
                        if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                            int[] nArray = new int[lIIIlllIIlIlI[0]];
                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                            Inventory.getFirst((int[])nArray).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[67]]);
                            Time.sleepTicks((int)lIIIlllIIlIlI[16]);

                        }
                        var3 = new WorldPoint(lIIIlllIIlIlI[68], lIIIlllIIlIlI[69], lIIIlllIIlIlI[1]);
                        if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(b.I), lIIIlllIIlIlI[70]) && l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), lIIIlllIIlIlI[6])) {
                            AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[71]];
                            Movement.walkTo((WorldPoint)var3);

                            Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                        }
                        if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), lIIIlllIIlIlI[6]) && !l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[54])) break block84;
                        if (!l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) break block85;
                        String[] stringArray18 = new String[lIIIlllIIlIlI[0]];
                        stringArray18[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[72]];
                        if (!l.lIlIIIlllllIIlI(NPCs.getNearest((String[])stringArray18)) || !l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), lIIIlllIIlIlI[70])) break block85;
                    }
                    WorldArea var4 = new WorldArea(lIIIlllIIlIlI[73], lIIIlllIIlIlI[74], lIIIlllIIlIlI[43], lIIIlllIIlIlI[37], lIIIlllIIlIlI[1]);
                    if (l.lIlIIIllllIlIlI(e.j(lIIIlllIIlIlI[75]), lIIIlllIIlIlI[24]) && l.lIlIIIllllIlIIl(Equipment.contains(item -> item.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[89]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[88]])).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[76]]);
                        Time.sleepTicks((int)lIIIlllIIlIlI[12]);

                    }
                    if (l.lIlIIIllllIlIIl(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var5 = new WorldPoint(lIIIlllIIlIlI[77], lIIIlllIIlIlI[78], lIIIlllIIlIlI[1]);
                        Movement.walkTo((WorldPoint)var5);

                        Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                    }
                    if (l.lIlIIIllllIlIll(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cd);

                        Time.sleepTicks((int)lIIIlllIIlIlI[0]);

                    }
                }
                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[79]], bW);
                }
            }
            if (l.lIlIIIllllIlllI(e.j(cm)) && l.lIlIIIllllIlIlI(e.j(cm), lIIIlllIIlIlI[27])) {
                cp = lIIIlllIIlIlI[0];
                co = lIIIlllIIlIlI[1];
            }
            if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[27]) && l.lIlIIIllllIlIlI(co, lIIIlllIIlIlI[0]) && l.lIlIIIllllIlIIl(cp ? 1 : 0)) {
                P.iI += lIIIlllIIlIlI[0];
                P.d(AccBuilderRat.m);
                co += lIIIlllIIlIlI[0];
                P.iI = lIIIlllIIlIlI[1];
                cp = lIIIlllIIlIlI[1];
            }
            g.a(bW);
        }
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (!l.lIlIIIlllllIlII(Quests.getState((Quest)Quest.FIGHT_ARENA), QuestState.FINISHED) || l.lIlIIIllllIllII(e.j(cm), lIIIlllIIlIlI[27])) {
            bl = lIIIlllIIlIlI[0];

        } else {
            bl = lIIIlllIIlIlI[1];
        }
        return bl;
    }

    @Override
    public boolean X() {
        return lIIIlllIIlIlI[1];
    }

    private static boolean lIlIIIllllIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIlllllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void W() {
        block35: {
            d var6;
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                Object var7;
                                block29: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                int[] nArray = new int[lIIIlllIIlIlI[0]];
                                                                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                int[] nArray2 = new int[lIIIlllIIlIlI[0]];
                                                                nArray2[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                                int[] nArray3 = new int[lIIIlllIIlIlI[0]];
                                                                nArray3[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                                                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIIlIlI[8])) break block23;
                                                            }
                                                            var7 = new DHelper(lIIIlllIIlIlI[9], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]);
                                                            bA.add((DHelper) ar7);

                                                        }
                                                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                                                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                        int[] nArray4 = new int[lIIIlllIIlIlI[0]];
                                                        nArray4[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                        int[] nArray5 = new int[lIIIlllIIlIlI[0]];
                                                        nArray5[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                                        if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlllIIlIlI[8])) break block25;
                                                    }
                                                    var7 = new DHelper(lIIIlllIIlIlI[7], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]);
                                                    bA.add((DHelper) ar7);

                                                }
                                                int[] nArray = new int[lIIIlllIIlIlI[0]];
                                                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                                int[] nArray6 = new int[lIIIlllIIlIlI[0]];
                                                nArray6[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                int[] nArray7 = new int[lIIIlllIIlIlI[0]];
                                                nArray7[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlllIIlIlI[8])) break block27;
                                            }
                                            var7 = new DHelper(lIIIlllIIlIlI[10], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]);
                                            bA.add((DHelper) ar7);

                                        }
                                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray8 = new int[lIIIlllIIlIlI[0]];
                                        nArray8[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                        int[] nArray9 = new int[lIIIlllIIlIlI[0]];
                                        nArray9[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                                        if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray9).getQuantity(), lIIIlllIIlIlI[28])) break block29;
                                    }
                                    var7 = new DHelper(lIIIlllIIlIlI[15], lIIIlllIIlIlI[33], lIIIlllIIlIlI[80]);
                                    bA.add((DHelper) ar7);

                                }
                                if (l.lIlIIIllllIlIll(Bank.contains((Predicate)(var7 = item -> item.getName().toLowerCase().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[87]]))) ? 1 : 0)) {
                                    var6 = new DHelper(lIIIlllIIlIlI[81], lIIIlllIIlIlI[16], lIIIlllIIlIlI[82]);
                                    bA.add(var6);

                                }
                                int[] nArray = new int[lIIIlllIIlIlI[0]];
                                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                int[] nArray10 = new int[lIIIlllIIlIlI[0]];
                                nArray10[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                                int[] nArray11 = new int[lIIIlllIIlIlI[0]];
                                nArray11[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), lIIIlllIIlIlI[6])) break block31;
                            }
                            var6 = new DHelper(lIIIlllIIlIlI[14], lIIIlllIIlIlI[6], h.bv);
                            bA.add(var6);

                        }
                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                        int[] nArray12 = new int[lIIIlllIIlIlI[0]];
                        nArray12[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block33;
                        int[] nArray13 = new int[lIIIlllIIlIlI[0]];
                        nArray13[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                        if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray13).getQuantity(), lIIIlllIIlIlI[5])) break block33;
                    }
                    var6 = new DHelper(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11], lIIIlllIIlIlI[83]);
                    bA.add(var6);

                }
                int[] nArray = new int[lIIIlllIIlIlI[0]];
                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                int[] nArray14 = new int[lIIIlllIIlIlI[0]];
                nArray14[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block35;
                int[] nArray15 = new int[lIIIlllIIlIlI[0]];
                nArray15[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray15).getQuantity(), lIIIlllIIlIlI[28])) break block35;
            }
            var6 = new DHelper(lIIIlllIIlIlI[13], lIIIlllIIlIlI[54], lIIIlllIIlIlI[84]);
            bA.add(var6);

        }
    }

    @Override
    public int Y() {
        try {
            l.ar();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x34 ^ 0x78) & ~(0x74 ^ 0x38)) == (0x42 ^ 0x46)) {
            return (0xEF ^ 0xBB) & ~(0x38 ^ 0x6C);
        }
        return lIIIlllIIlIlI[85];
    }

    @Override
    public String Z() {
        return lIIIlllIIlIIl[lIIIlllIIlIlI[86]];
    }

    private static boolean lIlIIIllllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlllllIIlI(Object object) {
        return object == null;
    }

        return String.valueOf(var8);
    }

}

