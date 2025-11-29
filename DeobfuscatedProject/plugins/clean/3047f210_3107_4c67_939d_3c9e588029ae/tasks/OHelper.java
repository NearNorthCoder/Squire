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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AAHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.KHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.THelper;
import gg.squire.account.AccBuilderTempleTrek;
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

public class OHelper
implements S {
    
    public static final  WorldPoint ct;
    public static final  WorldPoint cu;
    static  int cw;
    public static final  WorldPoint cs;
    public static final  WorldPoint cq;
    public static final  WorldPoint cp;
    static  WorldArea cx;
    
    public static  boolean bs;
    public static  List<d> bu;
    public static final  WorldPoint cn;
    public static final  WorldPoint co;
    public static final  WorldPoint cv;
    static  boolean cl;
    static  int ck;
    
    public static final  WorldPoint cr;

    private static boolean llIllIllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String U() {
        return lIIIIIIIlIl[lIIIIIIIlll[86]];
    }

    private static boolean llIllIllIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIllIllIIllI(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    @Override
    public int T() {
        try {
            o.aD();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x71 ^ 0x2C) & ~(0xF9 ^ 0xA4)) != 0) {
            return (0xD0 ^ 0x95) & ~(0x46 ^ 3);
        }
        return lIIIIIIIlll[85];
    }

    private static boolean llIllIllIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllIllIIlII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean S() {
        return lIIIIIIIlll[1];
    }

    private static boolean llIllIllIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIllIlIll(Object object) {
        return object == null;
    }

    private static boolean llIllIllIllII(int n2, int n3) {
        return n2 != n3;
    }

    static {
        o.llIllIllIIIIl();
        o.llIllIllIIIII();
        cn = new WorldPoint(lIIIIIIIlll[91], lIIIIIIIlll[92], lIIIIIIIlll[1]);
        co = new WorldPoint(lIIIIIIIlll[93], lIIIIIIIlll[94], lIIIIIIIlll[1]);
        cp = new WorldPoint(lIIIIIIIlll[95], lIIIIIIIlll[96], lIIIIIIIlll[1]);
        cq = new WorldPoint(lIIIIIIIlll[97], lIIIIIIIlll[98], lIIIIIIIlll[1]);
        cr = new WorldPoint(lIIIIIIIlll[99], lIIIIIIIlll[100], lIIIIIIIlll[1]);
        cs = new WorldPoint(lIIIIIIIlll[101], lIIIIIIIlll[102], lIIIIIIIlll[1]);
        ct = new WorldPoint(lIIIIIIIlll[103], lIIIIIIIlll[104], lIIIIIIIlll[1]);
        cu = new WorldPoint(lIIIIIIIlll[91], lIIIIIIIlll[105], lIIIIIIIlll[1]);
        cv = new WorldPoint(lIIIIIIIlll[106], lIIIIIIIlll[107], lIIIIIIIlll[1]);
        bu = new ArrayList<d>();
        cw = lIIIIIIIlll[30];
        cx = new WorldArea(lIIIIIIIlll[93], lIIIIIIIlll[108], lIIIIIIIlll[26], lIIIIIIIlll[47], lIIIIIIIlll[1]);
        String[] stringArray = new String[lIIIIIIIlll[11]];
        stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[109]];
        stringArray[o.lIIIIIIIlll[0]] = lIIIIIIIlIl[lIIIIIIIlll[110]];
        stringArray[o.lIIIIIIIlll[5]] = lIIIIIIIlIl[lIIIIIIIlll[111]];
        bQ = stringArray;
    }

    private static boolean llIllIllIllIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIllIllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void var2;
        int[] nArray = new int[lIIIIIIIlll[12]];
        nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
        nArray[o.lIIIIIIIlll[0]] = lIIIIIIIlll[7];
        nArray[o.lIIIIIIIlll[5]] = lIIIIIIIlll[10];
        nArray[o.lIIIIIIIlll[11]] = lIIIIIIIlll[14];
        nArray[o.lIIIIIIIlll[6]] = lIIIIIIIlll[15];
        nArray[o.lIIIIIIIlll[16]] = lIIIIIIIlll[17];
        int[] nArray2 = nArray;
        int var3 = lIIIIIIIlll[1];
        while (o.llIllIllIIIll(var3, ((void)var2).length)) {
            int[] nArray3 = new int[lIIIIIIIlll[0]];
            nArray3[o.lIIIIIIIlll[1]] = var2[var3];
            if (o.llIllIllIIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIIIIIlll[1];
            }
            ++var3;

            if (-(0x35 ^ 0x30) < 0) continue;
            return false;
        }
        return lIIIIIIIlll[0];
    }

    private static void ae() {
        block35: {
            d var4;
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                Object var5;
                                block29: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                int[] nArray = new int[lIIIIIIIlll[0]];
                                                                nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                                                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                int[] nArray2 = new int[lIIIIIIIlll[0]];
                                                                nArray2[o.lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                                                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                                int[] nArray3 = new int[lIIIIIIIlll[0]];
                                                                nArray3[o.lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                                                                if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIIIIlll[8])) break block23;
                                                            }
                                                            var5 = new DHelper(lIIIIIIIlll[9], lIIIIIIIlll[8], lIIIIIIIlll[18]);
                                                            bu.add((DHelper) ar5);

                                                        }
                                                        int[] nArray = new int[lIIIIIIIlll[0]];
                                                        nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                                                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                        int[] nArray4 = new int[lIIIIIIIlll[0]];
                                                        nArray4[o.lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                                                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                        int[] nArray5 = new int[lIIIIIIIlll[0]];
                                                        nArray5[o.lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                                                        if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIIIIlll[8])) break block25;
                                                    }
                                                    var5 = new DHelper(lIIIIIIIlll[7], lIIIIIIIlll[8], lIIIIIIIlll[18]);
                                                    bu.add((DHelper) ar5);

                                                }
                                                int[] nArray = new int[lIIIIIIIlll[0]];
                                                nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                                int[] nArray6 = new int[lIIIIIIIlll[0]];
                                                nArray6[o.lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                int[] nArray7 = new int[lIIIIIIIlll[0]];
                                                nArray7[o.lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                                                if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIIIIlll[8])) break block27;
                                            }
                                            var5 = new DHelper(lIIIIIIIlll[10], lIIIIIIIlll[8], lIIIIIIIlll[18]);
                                            bu.add((DHelper) ar5);

                                        }
                                        int[] nArray = new int[lIIIIIIIlll[0]];
                                        nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[15];
                                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray8 = new int[lIIIIIIIlll[0]];
                                        nArray8[o.lIIIIIIIlll[1]] = lIIIIIIIlll[15];
                                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                        int[] nArray9 = new int[lIIIIIIIlll[0]];
                                        nArray9[o.lIIIIIIIlll[1]] = lIIIIIIIlll[15];
                                        if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray9).getQuantity(), lIIIIIIIlll[28])) break block29;
                                    }
                                    var5 = new DHelper(lIIIIIIIlll[15], lIIIIIIIlll[33], lIIIIIIIlll[80]);
                                    bu.add((DHelper) ar5);

                                }
                                if (o.llIllIllIIlII(Bank.contains((Predicate)(var5 = item -> item.getName().toLowerCase().contains(lIIIIIIIlIl[lIIIIIIIlll[87]]))) ? 1 : 0)) {
                                    var4 = new DHelper(lIIIIIIIlll[81], lIIIIIIIlll[16], lIIIIIIIlll[82]);
                                    bu.add(var4);

                                }
                                int[] nArray = new int[lIIIIIIIlll[0]];
                                nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[14];
                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                int[] nArray10 = new int[lIIIIIIIlll[0]];
                                nArray10[o.lIIIIIIIlll[1]] = lIIIIIIIlll[14];
                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                                int[] nArray11 = new int[lIIIIIIIlll[0]];
                                nArray11[o.lIIIIIIIlll[1]] = lIIIIIIIlll[14];
                                if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray11).getQuantity(), lIIIIIIIlll[6])) break block31;
                            }
                            var4 = new DHelper(lIIIIIIIlll[14], lIIIIIIIlll[6], i.bp);
                            bu.add(var4);

                        }
                        int[] nArray = new int[lIIIIIIIlll[0]];
                        nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                        int[] nArray12 = new int[lIIIIIIIlll[0]];
                        nArray12[o.lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray12) ? 1 : 0)) break block33;
                        int[] nArray13 = new int[lIIIIIIIlll[0]];
                        nArray13[o.lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                        if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray13).getQuantity(), lIIIIIIIlll[5])) break block33;
                    }
                    var4 = new DHelper(lIIIIIIIlll[17], lIIIIIIIlll[11], lIIIIIIIlll[83]);
                    bu.add(var4);

                }
                int[] nArray = new int[lIIIIIIIlll[0]];
                nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                int[] nArray14 = new int[lIIIIIIIlll[0]];
                nArray14[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) break block35;
                int[] nArray15 = new int[lIIIIIIIlll[0]];
                nArray15[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray15).getQuantity(), lIIIIIIIlll[28])) break block35;
            }
            var4 = new DHelper(lIIIIIIIlll[13], lIIIIIIIlll[54], lIIIIIIIlll[84]);
            bu.add(var4);

        }
    }

    private static boolean llIllIllIIlll(int n2) {
        return n2 > 0;
    }

    public static void aD() {
        block77: {
            block83: {
                block85: {
                    block84: {
                        BankLocation var6;
                        block78: {
                            block82: {
                                block80: {
                                    block81: {
                                        block79: {
                                            if (o.llIllIllIIIlI(bs ? 1 : 0)) {
                                                b.a(bu);
                                                if (o.llIllIllIIIll(bu.size(), lIIIIIIIlll[0])) {
                                                    System.out.println(lIIIIIIIlIl[lIIIIIIIlll[1]]);
                                                    bs = lIIIIIIIlll[1];
                                                }
                                            }
                                            if (!o.llIllIllIIlII(bs ? 1 : 0)) break block77;
                                            if (o.llIllIllIIIll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIlll[2])) {
                                                aa.eA();
                                            }
                                            if (o.llIllIllIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIlll[2]) && o.llIllIllIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIIIIIIlll[3])) {
                                                k.X();
                                            }
                                            if (!o.llIllIllIIlII(o.aa() ? 1 : 0) || !o.llIllIllIIIll(e.j(cw), lIIIIIIIlll[0]) || !o.llIllIllIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIlll[2]) || !o.llIllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIIIIIlll[3])) break block78;
                                            var6 = BankLocation.getNearest();
                                            if (o.llIllIllIIllI(var6) && o.llIllIllIIlII(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[0]];
                                                a.a(var6);
                                            }
                                            if (!o.llIllIllIIllI(var6) || !o.llIllIllIIIlI(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block78;
                                            if (o.llIllIllIIlII(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIlll[4]);

                                            }
                                            if (!o.llIllIllIIIlI(Bank.isOpen() ? 1 : 0)) break block78;
                                            AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[5]];
                                            if (o.llIllIllIIlll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIIIIIlll[6]);

                                            }
                                            if (o.llIllIllIIlll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIIIIIlll[5]);

                                            }
                                            int[] nArray = new int[lIIIIIIIlll[0]];
                                            nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                                            if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block79;
                                            int[] nArray2 = new int[lIIIIIIIlll[0]];
                                            nArray2[o.lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                                            if (!o.llIllIllIIlIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIIIIlll[8])) break block80;
                                        }
                                        int[] nArray = new int[lIIIIIIIlll[0]];
                                        nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                        int[] nArray3 = new int[lIIIIIIIlll[0]];
                                        nArray3[o.lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                                        if (!o.llIllIllIIlIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIIIIlll[8])) break block80;
                                    }
                                    int[] nArray = new int[lIIIIIIIlll[0]];
                                    nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                                    if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block82;
                                    int[] nArray4 = new int[lIIIIIIIlll[0]];
                                    nArray4[o.lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                                    if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIIIIlll[8])) break block82;
                                }
                                o.ae();
                                System.out.println(lIIIIIIIlIl[lIIIIIIIlll[11]]);
                                bs = lIIIIIIIlll[0];
                                return;
                            }
                            int[] nArray = new int[lIIIIIIIlll[12]];
                            nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                            nArray[o.lIIIIIIIlll[0]] = lIIIIIIIlll[7];
                            nArray[o.lIIIIIIIlll[5]] = lIIIIIIIlll[10];
                            nArray[o.lIIIIIIIlll[11]] = lIIIIIIIlll[14];
                            nArray[o.lIIIIIIIlll[6]] = lIIIIIIIlll[15];
                            nArray[o.lIIIIIIIlll[16]] = lIIIIIIIlll[17];
                            if (o.llIllIllIIlII(e.b(nArray) ? 1 : 0)) {
                                o.ae();
                                System.out.println(lIIIIIIIlIl[lIIIIIIIlll[6]]);
                                bs = lIIIIIIIlll[0];
                                return;
                            }
                            int[] nArray5 = new int[lIIIIIIIlll[12]];
                            nArray5[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                            nArray5[o.lIIIIIIIlll[0]] = lIIIIIIIlll[7];
                            nArray5[o.lIIIIIIIlll[5]] = lIIIIIIIlll[10];
                            nArray5[o.lIIIIIIIlll[11]] = lIIIIIIIlll[14];
                            nArray5[o.lIIIIIIIlll[6]] = lIIIIIIIlll[15];
                            nArray5[o.lIIIIIIIlll[16]] = lIIIIIIIlll[17];
                            if (o.llIllIllIIIlI(e.b(nArray5) ? 1 : 0)) {
                                while (o.llIllIllIIlII(t.bl() ? 1 : 0)) {
                                    t.bj();
                                    Time.sleepTicks((int)lIIIIIIIlll[0]);

                                    return;
                                }
                                if (o.llIllIllIIlII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepTicks((int)lIIIIIIIlll[12]);

                                }
                                a.a(lIIIIIIIlll[13], lIIIIIIIlll[18]);
                                a.a(lIIIIIIIlll[14], lIIIIIIIlll[11]);
                                a.a(lIIIIIIIlll[7], lIIIIIIIlll[8]);
                                a.a(lIIIIIIIlll[10], lIIIIIIIlll[8]);
                                a.a(lIIIIIIIlll[17], lIIIIIIIlll[11]);
                                a.a(lIIIIIIIlll[15], lIIIIIIIlll[18]);
                                a.a(lIIIIIIIlll[19], lIIIIIIIlll[4]);
                            }
                        }
                        if (o.llIllIllIIIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && o.llIllIllIIIll(Movement.getRunEnergy(), lIIIIIIIlll[20])) {
                            Inventory.getFirst((int[])f.aU).interact(lIIIIIIIlIl[lIIIIIIIlll[16]]);
                            Time.sleepTicks((int)lIIIIIIIlll[0]);

                        }
                        if (o.llIllIllIIIll(Prayers.getPoints(), lIIIIIIIlll[21]) && o.llIllIllIIIlI(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aR).interact(lIIIIIIIlIl[lIIIIIIIlll[12]]);
                        }
                        if (o.llIllIllIIIlI(o.aa() ? 1 : 0) && o.llIllIllIIlII(e.j(cw))) {
                            if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) {
                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[22]];
                                if (o.llIllIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)cn);

                                Time.sleepTicks((int)lIIIIIIIlll[0]);

                            }
                            if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) {
                                g.a(lIIIIIIIlIl[lIIIIIIIlll[23]], bQ);
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[0])) {
                            if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(co), lIIIIIIIlll[6]) && o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cp), lIIIIIIIlll[6])) {
                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[24]];
                                Movement.walkTo((WorldPoint)co);

                                Time.sleepTicks((int)lIIIIIIIlll[0]);

                            }
                            if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(co), lIIIIIIIlll[12])) {
                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[18]];
                                String[] stringArray = new String[lIIIIIIIlll[0]];
                                stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[25]];
                                String[] stringArray2 = new String[lIIIIIIIlll[0]];
                                stringArray2[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[26]];
                                if (o.llIllIllIIIlI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                    String[] stringArray3 = new String[lIIIIIIIlll[0]];
                                    stringArray3[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[3]];
                                    if (o.llIllIllIIlII(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray3)) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIIIIIIIlll[0]];
                                        stringArray4[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[27]];
                                        TileObjects.getNearest((String[])stringArray4).interact(lIIIIIIIlIl[lIIIIIIIlll[28]]);
                                        Time.sleepTicks((int)lIIIIIIIlll[6]);

                                    }
                                }
                                String[] stringArray5 = new String[lIIIIIIIlll[0]];
                                stringArray5[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[29]];
                                if (o.llIllIllIIIlI(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray5)) ? 1 : 0)) {
                                    String[] stringArray6 = new String[lIIIIIIIlll[0]];
                                    stringArray6[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[30]];
                                    String[] stringArray7 = new String[lIIIIIIIlll[0]];
                                    stringArray7[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[31]];
                                    if (o.llIllIllIIIlI(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                        String[] stringArray8 = new String[lIIIIIIIlll[0]];
                                        stringArray8[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[32]];
                                        TileObjects.getNearest((String[])stringArray8).interact(lIIIIIIIlIl[lIIIIIIIlll[33]]);
                                        Time.sleepTicks((int)lIIIIIIIlll[5]);

                                    }
                                    String[] stringArray9 = new String[lIIIIIIIlll[0]];
                                    stringArray9[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[34]];
                                    String[] stringArray10 = new String[lIIIIIIIlll[0]];
                                    stringArray10[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[35]];
                                    if (o.llIllIllIIIlI(TileObjects.getNearest((String[])stringArray9).hasAction(stringArray10) ? 1 : 0)) {
                                        String[] stringArray11 = new String[lIIIIIIIlll[0]];
                                        stringArray11[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[36]];
                                        TileObjects.getNearest((String[])stringArray11).interact(lIIIIIIIlIl[lIIIIIIIlll[37]]);
                                        Time.sleepTicks((int)lIIIIIIIlll[5]);

                                    }
                                }
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[5])) {
                            int[] nArray = new int[lIIIIIIIlll[0]];
                            nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[38];
                            if (o.llIllIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIIIIIlll[0]];
                                nArray6[o.lIIIIIIIlll[1]] = lIIIIIIIlll[38];
                                Inventory.getFirst((int[])nArray6).interact(lIIIIIIIlIl[lIIIIIIIlll[21]]);
                            }
                            int[] nArray7 = new int[lIIIIIIIlll[0]];
                            nArray7[o.lIIIIIIIlll[1]] = lIIIIIIIlll[39];
                            if (o.llIllIllIIIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIIIIIlll[0]];
                                nArray8[o.lIIIIIIIlll[1]] = lIIIIIIIlll[39];
                                Inventory.getFirst((int[])nArray8).interact(lIIIIIIIlIl[lIIIIIIIlll[40]]);
                            }
                            if (o.llIllIllIIlII(cx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cq), lIIIIIIIlll[6])) {
                                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[41]];
                                    Movement.walkTo((WorldPoint)cq);

                                    Time.sleepTicks((int)lIIIIIIIlll[0]);

                                }
                                if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cq), lIIIIIIIlll[6]) && o.llIllIllIIlII(Players.getLocal().isMoving() ? 1 : 0) && o.llIllIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIIIIIlll[0]];
                                    stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[42]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIlIl[lIIIIIIIlll[43]]);
                                    Time.sleepTicks((int)lIIIIIIIlll[5]);

                                }
                            }
                            if (o.llIllIllIIIlI(cx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[6])) {
                                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[44]];
                                    Movement.walkTo((WorldPoint)cr);

                                    Time.sleepTicks((int)lIIIIIIIlll[0]);

                                }
                                if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[6]) && o.llIllIllIIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    g.a(lIIIIIIIlIl[lIIIIIIIlll[45]], bQ);
                                }
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[11])) {
                            String[] stringArray = new String[lIIIIIIIlll[0]];
                            stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[46]];
                            if (o.llIllIllIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cu), lIIIIIIIlll[16])) {
                                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[47]];
                                    Movement.walkTo((WorldPoint)cu);

                                    Time.sleepTicks((int)lIIIIIIIlll[0]);

                                }
                                if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cu), lIIIIIIIlll[16])) {
                                    g.a(lIIIIIIIlIl[lIIIIIIIlll[48]], bQ);
                                }
                            }
                            String[] stringArray12 = new String[lIIIIIIIlll[0]];
                            stringArray12[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[49]];
                            if (o.llIllIllIIIlI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[50]];
                                if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[16])) {
                                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[51]];
                                    Movement.walkTo((WorldPoint)cr);

                                    Time.sleepTicks((int)lIIIIIIIlll[0]);

                                }
                                if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[16])) {
                                    g.a(lIIIIIIIlIl[lIIIIIIIlll[52]], bQ);
                                }
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[16])) {
                            if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cv), lIIIIIIIlll[11])) {
                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[53]];
                                Movement.walkTo((WorldPoint)cv);

                                Time.sleepTicks((int)lIIIIIIIlll[0]);

                            }
                            if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cv), lIIIIIIIlll[11]) && o.llIllIllIIlII(Players.getLocal().isMoving() ? 1 : 0) && o.llIllIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIIIIlll[0]];
                                stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[54]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (o.llIllIllIIIlI(tileObject.getName().contains(lIIIIIIIlIl[lIIIIIIIlll[90]]) ? 1 : 0) && o.llIllIllIlIIl(tileObject.getWorldLocation().distanceTo(cv), lIIIIIIIlll[11])) {
                                        n2 = lIIIIIIIlll[0];

                                        }
                                    } else {
                                        n2 = lIIIIIIIlll[1];
                                    }
                                    return n2 != 0;
                                }));
                                Time.sleepTicks((int)lIIIIIIIlll[5]);

                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[12])) {
                            if (o.llIllIllIIlII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (o.llIllIllIIlII(k.ac() ? 1 : 0)) {
                                k.ad();
                            }
                            if (o.llIllIllIlIll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIIIIIlll[0]];
                                stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[55]];
                                if (o.llIllIllIIllI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray13 = new String[lIIIIIIIlll[0]];
                                    stringArray13[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[56]];
                                    NPCs.getNearest((String[])stringArray13).interact(lIIIIIIIlIl[lIIIIIIIlll[57]]);
                                    Time.sleepTicks((int)lIIIIIIIlll[5]);

                                }
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[23]) && o.llIllIllIlIll(Players.getLocal().getInteracting())) {
                            g.a(lIIIIIIIlIl[lIIIIIIIlll[58]], bQ);
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[24])) {
                            if (o.llIllIllIIlII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (o.llIllIllIIlII(k.ac() ? 1 : 0)) {
                                k.ad();
                            }
                            String[] stringArray = new String[lIIIIIIIlll[0]];
                            stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[2]];
                            if (o.llIllIllIIllI(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[lIIIIIIIlll[0]];
                                stringArray14[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[59]];
                                if (o.llIllIllIlIIl(NPCs.getNearest((String[])stringArray14).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIIlll[16])) {
                                    g.a(lIIIIIIIlIl[lIIIIIIIlll[60]], bQ);
                                }
                            }
                            if (o.llIllIllIlIll(Players.getLocal().getInteracting())) {
                                String[] stringArray15 = new String[lIIIIIIIlll[0]];
                                stringArray15[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[61]];
                                if (o.llIllIllIIllI(NPCs.getNearest((String[])stringArray15))) {
                                    String[] stringArray16 = new String[lIIIIIIIlll[0]];
                                    stringArray16[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[62]];
                                    NPCs.getNearest((String[])stringArray16).interact(lIIIIIIIlIl[lIIIIIIIlll[20]]);
                                    Time.sleepTicks((int)lIIIIIIIlll[5]);

                                }
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[18])) {
                            if (o.llIllIllIIlII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (o.llIllIllIIlII(k.ac() ? 1 : 0)) {
                                k.ad();
                            }
                            if (o.llIllIllIlIll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIIIIIlll[0]];
                                stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[63]];
                                if (o.llIllIllIIllI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[lIIIIIIIlll[0]];
                                    stringArray17[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[64]];
                                    NPCs.getNearest((String[])stringArray17).interact(lIIIIIIIlIl[lIIIIIIIlll[65]]);
                                    Time.sleepTicks((int)lIIIIIIIlll[5]);

                                }
                            }
                        }
                        if (o.llIllIllIllII(e.j(cw), lIIIIIIIlll[25]) && !o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[26])) break block83;
                        String[] stringArray = new String[lIIIIIIIlll[0]];
                        stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[66]];
                        if (o.llIllIllIIllI(NPCs.getNearest((String[])stringArray))) {
                            int[] nArray = new int[lIIIIIIIlll[0]];
                            nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                            Inventory.getFirst((int[])nArray).interact(lIIIIIIIlIl[lIIIIIIIlll[67]]);
                            Time.sleepTicks((int)lIIIIIIIlll[16]);

                        }
                        var6 = new WorldPoint(lIIIIIIIlll[68], lIIIIIIIlll[69], lIIIIIIIlll[1]);
                        if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(b.I), lIIIIIIIlll[70]) && o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var6), lIIIIIIIlll[6])) {
                            AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[71]];
                            Movement.walkTo((WorldPoint)var6);

                            Time.sleepTicks((int)lIIIIIIIlll[0]);

                        }
                        if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var6), lIIIIIIIlll[6]) && !o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[54])) break block84;
                        if (!o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) break block85;
                        String[] stringArray18 = new String[lIIIIIIIlll[0]];
                        stringArray18[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[72]];
                        if (!o.llIllIllIlIll(NPCs.getNearest((String[])stringArray18)) || !o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var6), lIIIIIIIlll[70])) break block85;
                    }
                    WorldArea var7 = new WorldArea(lIIIIIIIlll[73], lIIIIIIIlll[74], lIIIIIIIlll[43], lIIIIIIIlll[37], lIIIIIIIlll[1]);
                    if (o.llIllIllIIIll(e.j(lIIIIIIIlll[75]), lIIIIIIIlll[24]) && o.llIllIllIIIlI(Equipment.contains(item -> item.getName().contains(lIIIIIIIlIl[lIIIIIIIlll[89]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(lIIIIIIIlIl[lIIIIIIIlll[88]])).interact(lIIIIIIIlIl[lIIIIIIIlll[76]]);
                        Time.sleepTicks((int)lIIIIIIIlll[12]);

                    }
                    if (o.llIllIllIIIlI(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var8 = new WorldPoint(lIIIIIIIlll[77], lIIIIIIIlll[78], lIIIIIIIlll[1]);
                        Movement.walkTo((WorldPoint)var8);

                        Time.sleepTicks((int)lIIIIIIIlll[0]);

                    }
                    if (o.llIllIllIIlII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cn);

                        Time.sleepTicks((int)lIIIIIIIlll[0]);

                    }
                }
                if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) {
                    g.a(lIIIIIIIlIl[lIIIIIIIlll[79]], bQ);
                }
            }
            if (o.llIllIllIIlll(e.j(cw)) && o.llIllIllIIIll(e.j(cw), lIIIIIIIlll[27])) {
                cl = lIIIIIIIlll[0];
                ck = lIIIIIIIlll[1];
            }
            if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[27]) && o.llIllIllIIIll(ck, lIIIIIIIlll[0]) && o.llIllIllIIIlI(cl ? 1 : 0)) {
                ac.kg += lIIIIIIIlll[0];
                ac.d(AccBuilderTempleTrek.m);
                ck += lIIIIIIIlll[0];
                ac.kg = lIIIIIIIlll[1];
                cl = lIIIIIIIlll[1];
            }
            g.a(bQ);
        }
    }

    private static boolean llIllIllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIllIllIIIII() {
        lIIIIIIIlIl = new String[lIIIIIIIlll[112]];
        o.lIIIIIIIlIl[o.lIIIIIIIlll[1]] = "Finished buying items, switching back to quest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[0]] = "Nav to bank";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[5]] = "Handling banking";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[11]] = "We are missing runes, switching to BUYING";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[6]] = "We are missing quest supplies, switching to BUYING";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[16]] = "Drink";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[12]] = "Drink";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[22]] = "Nav to start";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[23]] = "Lady Servil";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[24]] = "Nav to armour";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[18]] = "Getting armour";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[25]] = "Door";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[26]] = "Open";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[3]] = "Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[27]] = "Door";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[28]] = "Open";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[29]] = "Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[30]] = "Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[31]] = "Open";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[32]] = "Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[33]] = "Open";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[34]] = "Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[35]] = "Search";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[36]] = "Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[37]] = "Search";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[21]] = "Wear";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[40]] = "Wear";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[41]] = "Nav to jail";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[42]] = "Door";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[43]] = "Open";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[44]] = "Nav to guard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[45]] = "Head Guard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[46]] = "Khali brew";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[47]] = "Nav to brew";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[48]] = "Khazard Barman";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[49]] = "Khali brew";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[50]] = "Nav to guard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[51]] = "Nav to guard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[52]] = "Head Guard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[53]] = "Nav to  sammy";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[54]] = "Khazard cell keys";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[55]] = "Khazard Ogre";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[56]] = "Khazard Ogre";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[57]] = "Attack";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[58]] = "Sammy Servil";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[2]] = "Hengrad";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[59]] = "Hengrad";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[60]] = "Hengrad";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[61]] = "Khazard Scorpion";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[62]] = "Khazard Scorpion";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[20]] = "Attack";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[63]] = "Bouncer";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[64]] = "Bouncer";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[65]] = "Attack";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[66]] = "General Khazard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[67]] = "Break";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[71]] = "Nav to start";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[72]] = "General Khazard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[76]] = "Castle Wars";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[79]] = "Lady Servil";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[86]] = "Fight Arena";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[87]] = "ring of wealth (";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[88]] = "dueling";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[89]] = "dueling";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[90]] = "Prison Gate";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[109]] = "Can I help you?";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[110]] = "I'd like a Khali Brew please.";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[111]] = "Yes.";
    }

    @Override
    public boolean V() {
        boolean bl;
        if (!o.llIllIllIllIl(Quests.getState((Quest)Quest.FIGHT_ARENA), QuestState.FINISHED) || o.llIllIllIIlIl(e.j(cw), lIIIIIIIlll[27])) {
            bl = lIIIIIIIlll[0];

        } else {
            bl = lIIIIIIIlll[1];
        }
        return bl;
    }
}

