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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.IHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ADHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.MHelper;

public class AHelper
implements ac {
    public static final  WorldPoint el;
    public static  List<d> bv;
    public static final  WorldPoint ee;
    
    public static final  WorldPoint ej;
    
    static  int di;
    static  WorldArea en;
    
    public static final  WorldPoint ef;
    public static final  WorldPoint eh;
    public static final  WorldPoint ei;
    public static final  WorldPoint ed;
    public static  boolean bt;
    static  int em;
    public static final  WorldPoint ek;
    public static final  WorldPoint eg;
    static  boolean dj;

    private static boolean lIlIllIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String ag() {
        return llIIllIIIl[llIIllIlII[86]];
    }

    private static boolean lIlIllIIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int af() {
        try {
            A.bw();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return llIIllIlII[85];
    }

    private static boolean lIlIllIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIlllII(int n2) {
        return n2 > 0;
    }

    static {
        A.lIlIllIIlIllI();
        A.lIlIllIIlIlIl();
        ed = new WorldPoint(llIIllIlII[91], llIIllIlII[92], llIIllIlII[1]);
        ee = new WorldPoint(llIIllIlII[93], llIIllIlII[94], llIIllIlII[1]);
        ef = new WorldPoint(llIIllIlII[95], llIIllIlII[96], llIIllIlII[1]);
        eg = new WorldPoint(llIIllIlII[97], llIIllIlII[98], llIIllIlII[1]);
        eh = new WorldPoint(llIIllIlII[99], llIIllIlII[100], llIIllIlII[1]);
        ei = new WorldPoint(llIIllIlII[101], llIIllIlII[102], llIIllIlII[1]);
        ej = new WorldPoint(llIIllIlII[103], llIIllIlII[104], llIIllIlII[1]);
        ek = new WorldPoint(llIIllIlII[91], llIIllIlII[105], llIIllIlII[1]);
        el = new WorldPoint(llIIllIlII[106], llIIllIlII[107], llIIllIlII[1]);
        bv = new ArrayList<d>();
        em = llIIllIlII[30];
        en = new WorldArea(llIIllIlII[93], llIIllIlII[108], llIIllIlII[26], llIIllIlII[47], llIIllIlII[1]);
        String[] stringArray = new String[llIIllIlII[11]];
        stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[109]];
        stringArray[A.llIIllIlII[0]] = llIIllIIIl[llIIllIlII[110]];
        stringArray[A.llIIllIlII[5]] = llIIllIIIl[llIIllIlII[111]];
        cE = stringArray;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIllIIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlIIIlI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean an() {
        void var2;
        int[] nArray = new int[llIIllIlII[12]];
        nArray[A.llIIllIlII[1]] = llIIllIlII[13];
        nArray[A.llIIllIlII[0]] = llIIllIlII[7];
        nArray[A.llIIllIlII[5]] = llIIllIlII[10];
        nArray[A.llIIllIlII[11]] = llIIllIlII[14];
        nArray[A.llIIllIlII[6]] = llIIllIlII[15];
        nArray[A.llIIllIlII[16]] = llIIllIlII[17];
        int[] nArray2 = nArray;
        int var3 = llIIllIlII[1];
        while (A.lIlIllIIllIII(var3, ((void)var2).length)) {
            int[] nArray3 = new int[llIIllIlII[0]];
            nArray3[A.llIIllIlII[1]] = var2[var3];
            if (A.lIlIllIIllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return llIIllIlII[1];
            }
            ++var3;

            if ((0x8C ^ 0x88) > 1) continue;
            return false;
        }
        return llIIllIlII[0];
    }

    private static boolean lIlIllIIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIllIll(Object object) {
        return object != null;
    }

    private static void Q() {
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
                                                                int[] nArray = new int[llIIllIlII[0]];
                                                                nArray[A.llIIllIlII[1]] = llIIllIlII[9];
                                                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                int[] nArray2 = new int[llIIllIlII[0]];
                                                                nArray2[A.llIIllIlII[1]] = llIIllIlII[9];
                                                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                                int[] nArray3 = new int[llIIllIlII[0]];
                                                                nArray3[A.llIIllIlII[1]] = llIIllIlII[9];
                                                                if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray3).getQuantity(), llIIllIlII[8])) break block23;
                                                            }
                                                            var5 = new DHelper(llIIllIlII[9], llIIllIlII[8], llIIllIlII[18]);
                                                            bv.add((DHelper) ar5);

                                                        }
                                                        int[] nArray = new int[llIIllIlII[0]];
                                                        nArray[A.llIIllIlII[1]] = llIIllIlII[7];
                                                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                        int[] nArray4 = new int[llIIllIlII[0]];
                                                        nArray4[A.llIIllIlII[1]] = llIIllIlII[7];
                                                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                        int[] nArray5 = new int[llIIllIlII[0]];
                                                        nArray5[A.llIIllIlII[1]] = llIIllIlII[7];
                                                        if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray5).getQuantity(), llIIllIlII[8])) break block25;
                                                    }
                                                    var5 = new DHelper(llIIllIlII[7], llIIllIlII[8], llIIllIlII[18]);
                                                    bv.add((DHelper) ar5);

                                                }
                                                int[] nArray = new int[llIIllIlII[0]];
                                                nArray[A.llIIllIlII[1]] = llIIllIlII[10];
                                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                                int[] nArray6 = new int[llIIllIlII[0]];
                                                nArray6[A.llIIllIlII[1]] = llIIllIlII[10];
                                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                int[] nArray7 = new int[llIIllIlII[0]];
                                                nArray7[A.llIIllIlII[1]] = llIIllIlII[10];
                                                if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray7).getQuantity(), llIIllIlII[8])) break block27;
                                            }
                                            var5 = new DHelper(llIIllIlII[10], llIIllIlII[8], llIIllIlII[18]);
                                            bv.add((DHelper) ar5);

                                        }
                                        int[] nArray = new int[llIIllIlII[0]];
                                        nArray[A.llIIllIlII[1]] = llIIllIlII[15];
                                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray8 = new int[llIIllIlII[0]];
                                        nArray8[A.llIIllIlII[1]] = llIIllIlII[15];
                                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                        int[] nArray9 = new int[llIIllIlII[0]];
                                        nArray9[A.llIIllIlII[1]] = llIIllIlII[15];
                                        if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray9).getQuantity(), llIIllIlII[28])) break block29;
                                    }
                                    var5 = new DHelper(llIIllIlII[15], llIIllIlII[33], llIIllIlII[80]);
                                    bv.add((DHelper) ar5);

                                }
                                if (A.lIlIllIIllIIl(Bank.contains((Predicate)(var5 = item -> item.getName().toLowerCase().contains(llIIllIIIl[llIIllIlII[87]]))) ? 1 : 0)) {
                                    var4 = new DHelper(llIIllIlII[81], llIIllIlII[16], llIIllIlII[82]);
                                    bv.add(var4);

                                }
                                int[] nArray = new int[llIIllIlII[0]];
                                nArray[A.llIIllIlII[1]] = llIIllIlII[14];
                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                int[] nArray10 = new int[llIIllIlII[0]];
                                nArray10[A.llIIllIlII[1]] = llIIllIlII[14];
                                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                                int[] nArray11 = new int[llIIllIlII[0]];
                                nArray11[A.llIIllIlII[1]] = llIIllIlII[14];
                                if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray11).getQuantity(), llIIllIlII[6])) break block31;
                            }
                            var4 = new DHelper(llIIllIlII[14], llIIllIlII[6], j.cf);
                            bv.add(var4);

                        }
                        int[] nArray = new int[llIIllIlII[0]];
                        nArray[A.llIIllIlII[1]] = llIIllIlII[17];
                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                        int[] nArray12 = new int[llIIllIlII[0]];
                        nArray12[A.llIIllIlII[1]] = llIIllIlII[17];
                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray12) ? 1 : 0)) break block33;
                        int[] nArray13 = new int[llIIllIlII[0]];
                        nArray13[A.llIIllIlII[1]] = llIIllIlII[17];
                        if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray13).getQuantity(), llIIllIlII[5])) break block33;
                    }
                    var4 = new DHelper(llIIllIlII[17], llIIllIlII[11], llIIllIlII[83]);
                    bv.add(var4);

                }
                int[] nArray = new int[llIIllIlII[0]];
                nArray[A.llIIllIlII[1]] = llIIllIlII[13];
                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                int[] nArray14 = new int[llIIllIlII[0]];
                nArray14[A.llIIllIlII[1]] = llIIllIlII[13];
                if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray14) ? 1 : 0)) break block35;
                int[] nArray15 = new int[llIIllIlII[0]];
                nArray15[A.llIIllIlII[1]] = llIIllIlII[13];
                if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray15).getQuantity(), llIIllIlII[28])) break block35;
            }
            var4 = new DHelper(llIIllIlII[13], llIIllIlII[54], llIIllIlII[84]);
            bv.add(var4);

        }
    }

    @Override
    public boolean ae() {
        return llIIllIlII[1];
    }

    public static void bw() {
        block76: {
            block82: {
                block84: {
                    block83: {
                        BankLocation var6;
                        block77: {
                            block81: {
                                block79: {
                                    block80: {
                                        block78: {
                                            if (A.lIlIllIIlIlll(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (A.lIlIllIIllIII(bv.size(), llIIllIlII[0])) {
                                                    System.out.println(llIIllIIIl[llIIllIlII[1]]);
                                                    bt = llIIllIlII[1];
                                                }
                                            }
                                            if (!A.lIlIllIIllIIl(bt ? 1 : 0)) break block76;
                                            if (A.lIlIllIIllIII(Skills.getLevel((Skill)Skill.PRAYER), llIIllIlII[2])) {
                                                aD.fY();
                                            }
                                            if (A.lIlIllIIllIlI(Skills.getLevel((Skill)Skill.PRAYER), llIIllIlII[2]) && A.lIlIllIIllIII(Skills.getLevel((Skill)Skill.MAGIC), llIIllIlII[3])) {
                                                m.ak();
                                            }
                                            if (!A.lIlIllIIllIIl(A.an() ? 1 : 0) || !A.lIlIllIIllIII(e.j(em), llIIllIlII[0]) || !A.lIlIllIIllIlI(Skills.getLevel((Skill)Skill.PRAYER), llIIllIlII[2]) || !A.lIlIllIIllIlI(Skills.getLevel((Skill)Skill.MAGIC), llIIllIlII[3])) break block77;
                                            var6 = BankLocation.getNearest();
                                            if (A.lIlIllIIllIll(var6) && A.lIlIllIIllIIl(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[0]];
                                                a.a(var6);
                                            }
                                            if (!A.lIlIllIIllIll(var6) || !A.lIlIllIIlIlll(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block77;
                                            if (A.lIlIllIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllIlII[4]);

                                            }
                                            if (!A.lIlIllIIlIlll(Bank.isOpen() ? 1 : 0)) break block77;
                                            AccBuilderSotf.c = llIIllIIIl[llIIllIlII[5]];
                                            if (A.lIlIllIIlllII(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)llIIllIlII[6]);

                                            }
                                            if (A.lIlIllIIlllII(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)llIIllIlII[5]);

                                            }
                                            int[] nArray = new int[llIIllIlII[0]];
                                            nArray[A.llIIllIlII[1]] = llIIllIlII[7];
                                            if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block78;
                                            int[] nArray2 = new int[llIIllIlII[0]];
                                            nArray2[A.llIIllIlII[1]] = llIIllIlII[7];
                                            if (!A.lIlIllIIllIlI(Bank.getFirst((int[])nArray2).getQuantity(), llIIllIlII[8])) break block79;
                                        }
                                        int[] nArray = new int[llIIllIlII[0]];
                                        nArray[A.llIIllIlII[1]] = llIIllIlII[9];
                                        if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block80;
                                        int[] nArray3 = new int[llIIllIlII[0]];
                                        nArray3[A.llIIllIlII[1]] = llIIllIlII[9];
                                        if (!A.lIlIllIIllIlI(Bank.getFirst((int[])nArray3).getQuantity(), llIIllIlII[8])) break block79;
                                    }
                                    int[] nArray = new int[llIIllIlII[0]];
                                    nArray[A.llIIllIlII[1]] = llIIllIlII[10];
                                    if (!A.lIlIllIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                    int[] nArray4 = new int[llIIllIlII[0]];
                                    nArray4[A.llIIllIlII[1]] = llIIllIlII[10];
                                    if (!A.lIlIllIIllIII(Bank.getFirst((int[])nArray4).getQuantity(), llIIllIlII[8])) break block81;
                                }
                                A.Q();
                                System.out.println(llIIllIIIl[llIIllIlII[11]]);
                                bt = llIIllIlII[0];
                                return;
                            }
                            int[] nArray = new int[llIIllIlII[12]];
                            nArray[A.llIIllIlII[1]] = llIIllIlII[13];
                            nArray[A.llIIllIlII[0]] = llIIllIlII[7];
                            nArray[A.llIIllIlII[5]] = llIIllIlII[10];
                            nArray[A.llIIllIlII[11]] = llIIllIlII[14];
                            nArray[A.llIIllIlII[6]] = llIIllIlII[15];
                            nArray[A.llIIllIlII[16]] = llIIllIlII[17];
                            if (A.lIlIllIIllIIl(e.c(nArray) ? 1 : 0)) {
                                A.Q();
                                System.out.println(llIIllIIIl[llIIllIlII[6]]);
                                bt = llIIllIlII[0];
                                return;
                            }
                            int[] nArray5 = new int[llIIllIlII[12]];
                            nArray5[A.llIIllIlII[1]] = llIIllIlII[13];
                            nArray5[A.llIIllIlII[0]] = llIIllIlII[7];
                            nArray5[A.llIIllIlII[5]] = llIIllIlII[10];
                            nArray5[A.llIIllIlII[11]] = llIIllIlII[14];
                            nArray5[A.llIIllIlII[6]] = llIIllIlII[15];
                            nArray5[A.llIIllIlII[16]] = llIIllIlII[17];
                            if (A.lIlIllIIlIlll(e.c(nArray5) ? 1 : 0)) {
                                while (A.lIlIllIIllIIl(I.co() ? 1 : 0)) {
                                    I.cm();
                                    Time.sleepTicks((int)llIIllIlII[0]);

                                    if ((0x5E ^ 0x5A) >= 0) continue;
                                    return;
                                }
                                if (A.lIlIllIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepTicks((int)llIIllIlII[12]);

                                }
                                a.a(llIIllIlII[13], llIIllIlII[18]);
                                a.a(llIIllIlII[14], llIIllIlII[11]);
                                a.a(llIIllIlII[7], llIIllIlII[8]);
                                a.a(llIIllIlII[10], llIIllIlII[8]);
                                a.a(llIIllIlII[17], llIIllIlII[11]);
                                a.a(llIIllIlII[15], llIIllIlII[18]);
                                a.a(llIIllIlII[19], llIIllIlII[4]);
                            }
                        }
                        if (A.lIlIllIIlIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && A.lIlIllIIllIII(Movement.getRunEnergy(), llIIllIlII[20])) {
                            Inventory.getFirst((int[])f.ba).interact(llIIllIIIl[llIIllIlII[16]]);
                            Time.sleepTicks((int)llIIllIlII[0]);

                        }
                        if (A.lIlIllIIllIII(Prayers.getPoints(), llIIllIlII[21]) && A.lIlIllIIlIlll(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aX).interact(llIIllIIIl[llIIllIlII[12]]);
                        }
                        if (A.lIlIllIIlIlll(A.an() ? 1 : 0) && A.lIlIllIIllIIl(e.j(em))) {
                            if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) {
                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[22]];
                                if (A.lIlIllIIlIlll(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)ed);

                                Time.sleepTicks((int)llIIllIlII[0]);

                            }
                            if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) {
                                g.a(llIIllIIIl[llIIllIlII[23]], cE);
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[0])) {
                            if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ee), llIIllIlII[6]) && A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ef), llIIllIlII[6])) {
                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[24]];
                                Movement.walkTo((WorldPoint)ee);

                                Time.sleepTicks((int)llIIllIlII[0]);

                            }
                            if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ee), llIIllIlII[12])) {
                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[18]];
                                String[] stringArray = new String[llIIllIlII[0]];
                                stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[25]];
                                String[] stringArray2 = new String[llIIllIlII[0]];
                                stringArray2[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[26]];
                                if (A.lIlIllIIlIlll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                    String[] stringArray3 = new String[llIIllIlII[0]];
                                    stringArray3[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[3]];
                                    if (A.lIlIllIIllIIl(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray3)) ? 1 : 0)) {
                                        String[] stringArray4 = new String[llIIllIlII[0]];
                                        stringArray4[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[27]];
                                        TileObjects.getNearest((String[])stringArray4).interact(llIIllIIIl[llIIllIlII[28]]);
                                        Time.sleepTicks((int)llIIllIlII[6]);

                                    }
                                }
                                String[] stringArray5 = new String[llIIllIlII[0]];
                                stringArray5[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[29]];
                                if (A.lIlIllIIlIlll(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray5)) ? 1 : 0)) {
                                    String[] stringArray6 = new String[llIIllIlII[0]];
                                    stringArray6[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[30]];
                                    String[] stringArray7 = new String[llIIllIlII[0]];
                                    stringArray7[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[31]];
                                    if (A.lIlIllIIlIlll(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                        String[] stringArray8 = new String[llIIllIlII[0]];
                                        stringArray8[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[32]];
                                        TileObjects.getNearest((String[])stringArray8).interact(llIIllIIIl[llIIllIlII[33]]);
                                        Time.sleepTicks((int)llIIllIlII[5]);

                                    }
                                    String[] stringArray9 = new String[llIIllIlII[0]];
                                    stringArray9[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[34]];
                                    String[] stringArray10 = new String[llIIllIlII[0]];
                                    stringArray10[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[35]];
                                    if (A.lIlIllIIlIlll(TileObjects.getNearest((String[])stringArray9).hasAction(stringArray10) ? 1 : 0)) {
                                        String[] stringArray11 = new String[llIIllIlII[0]];
                                        stringArray11[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[36]];
                                        TileObjects.getNearest((String[])stringArray11).interact(llIIllIIIl[llIIllIlII[37]]);
                                        Time.sleepTicks((int)llIIllIlII[5]);

                                    }
                                }
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[5])) {
                            int[] nArray = new int[llIIllIlII[0]];
                            nArray[A.llIIllIlII[1]] = llIIllIlII[38];
                            if (A.lIlIllIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray6 = new int[llIIllIlII[0]];
                                nArray6[A.llIIllIlII[1]] = llIIllIlII[38];
                                Inventory.getFirst((int[])nArray6).interact(llIIllIIIl[llIIllIlII[21]]);
                            }
                            int[] nArray7 = new int[llIIllIlII[0]];
                            nArray7[A.llIIllIlII[1]] = llIIllIlII[39];
                            if (A.lIlIllIIlIlll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llIIllIlII[0]];
                                nArray8[A.llIIllIlII[1]] = llIIllIlII[39];
                                Inventory.getFirst((int[])nArray8).interact(llIIllIIIl[llIIllIlII[40]]);
                            }
                            if (A.lIlIllIIllIIl(en.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(eg), llIIllIlII[6])) {
                                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[41]];
                                    Movement.walkTo((WorldPoint)eg);

                                    Time.sleepTicks((int)llIIllIlII[0]);

                                }
                                if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eg), llIIllIlII[6]) && A.lIlIllIIllIIl(Players.getLocal().isMoving() ? 1 : 0) && A.lIlIllIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[llIIllIlII[0]];
                                    stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[42]];
                                    TileObjects.getNearest((String[])stringArray).interact(llIIllIIIl[llIIllIlII[43]]);
                                    Time.sleepTicks((int)llIIllIlII[5]);

                                }
                            }
                            if (A.lIlIllIIlIlll(en.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[6])) {
                                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[44]];
                                    Movement.walkTo((WorldPoint)eh);

                                    Time.sleepTicks((int)llIIllIlII[0]);

                                }
                                if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[6]) && A.lIlIllIIllIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                    g.a(llIIllIIIl[llIIllIlII[45]], cE);
                                }
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[11])) {
                            String[] stringArray = new String[llIIllIlII[0]];
                            stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[46]];
                            if (A.lIlIllIIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ek), llIIllIlII[16])) {
                                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[47]];
                                    Movement.walkTo((WorldPoint)ek);

                                    Time.sleepTicks((int)llIIllIlII[0]);

                                }
                                if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ek), llIIllIlII[16])) {
                                    g.a(llIIllIIIl[llIIllIlII[48]], cE);
                                }
                            }
                            String[] stringArray12 = new String[llIIllIlII[0]];
                            stringArray12[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[49]];
                            if (A.lIlIllIIlIlll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[50]];
                                if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[16])) {
                                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[51]];
                                    Movement.walkTo((WorldPoint)eh);

                                    Time.sleepTicks((int)llIIllIlII[0]);

                                }
                                if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[16])) {
                                    g.a(llIIllIIIl[llIIllIlII[52]], cE);
                                }
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[16])) {
                            if (A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(el), llIIllIlII[11])) {
                                AccBuilderSotf.c = llIIllIIIl[llIIllIlII[53]];
                                Movement.walkTo((WorldPoint)el);

                                Time.sleepTicks((int)llIIllIlII[0]);

                            }
                            if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(el), llIIllIlII[11]) && A.lIlIllIIllIIl(Players.getLocal().isMoving() ? 1 : 0) && A.lIlIllIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[llIIllIlII[0]];
                                stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[54]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (A.lIlIllIIlIlll(tileObject.getName().contains(llIIllIIIl[llIIllIlII[90]]) ? 1 : 0) && A.lIlIllIIllllI(tileObject.getWorldLocation().distanceTo(el), llIIllIlII[11])) {
                                        n2 = llIIllIlII[0];

                                        }
                                    } else {
                                        n2 = llIIllIlII[1];
                                    }
                                    return n2 != 0;
                                }));
                                Time.sleepTicks((int)llIIllIlII[5]);

                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[12])) {
                            if (A.lIlIllIIllIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.lIlIllIIllIIl(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            if (A.lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[llIIllIlII[0]];
                                stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[55]];
                                if (A.lIlIllIIllIll(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray13 = new String[llIIllIlII[0]];
                                    stringArray13[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[56]];
                                    NPCs.getNearest((String[])stringArray13).interact(llIIllIIIl[llIIllIlII[57]]);
                                    Time.sleepTicks((int)llIIllIlII[5]);

                                }
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[23]) && A.lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                            g.a(llIIllIIIl[llIIllIlII[58]], cE);
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[24])) {
                            if (A.lIlIllIIllIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.lIlIllIIllIIl(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            String[] stringArray = new String[llIIllIlII[0]];
                            stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[2]];
                            if (A.lIlIllIIllIll(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[llIIllIlII[0]];
                                stringArray14[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[59]];
                                if (A.lIlIllIIllllI(NPCs.getNearest((String[])stringArray14).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIllIlII[16])) {
                                    g.a(llIIllIIIl[llIIllIlII[60]], cE);
                                }
                            }
                            if (A.lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                                String[] stringArray15 = new String[llIIllIlII[0]];
                                stringArray15[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[61]];
                                if (A.lIlIllIIllIll(NPCs.getNearest((String[])stringArray15))) {
                                    String[] stringArray16 = new String[llIIllIlII[0]];
                                    stringArray16[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[62]];
                                    NPCs.getNearest((String[])stringArray16).interact(llIIllIIIl[llIIllIlII[20]]);
                                    Time.sleepTicks((int)llIIllIlII[5]);

                                }
                            }
                        }
                        if (A.lIlIllIIlllll(e.j(em), llIIllIlII[18])) {
                            if (A.lIlIllIIllIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (A.lIlIllIIllIIl(m.ap() ? 1 : 0)) {
                                m.aq();
                            }
                            if (A.lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[llIIllIlII[0]];
                                stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[63]];
                                if (A.lIlIllIIllIll(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[llIIllIlII[0]];
                                    stringArray17[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[64]];
                                    NPCs.getNearest((String[])stringArray17).interact(llIIllIIIl[llIIllIlII[65]]);
                                    Time.sleepTicks((int)llIIllIlII[5]);

                                }
                            }
                        }
                        if (A.lIlIllIlIIIIl(e.j(em), llIIllIlII[25]) && !A.lIlIllIIlllll(e.j(em), llIIllIlII[26])) break block82;
                        String[] stringArray = new String[llIIllIlII[0]];
                        stringArray[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[66]];
                        if (A.lIlIllIIllIll(NPCs.getNearest((String[])stringArray))) {
                            int[] nArray = new int[llIIllIlII[0]];
                            nArray[A.llIIllIlII[1]] = llIIllIlII[13];
                            Inventory.getFirst((int[])nArray).interact(llIIllIIIl[llIIllIlII[67]]);
                            Time.sleepTicks((int)llIIllIlII[16]);

                        }
                        var6 = new WorldPoint(llIIllIlII[68], llIIllIlII[69], llIIllIlII[1]);
                        if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIllIlII[70]) && A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var6), llIIllIlII[6])) {
                            AccBuilderSotf.c = llIIllIIIl[llIIllIlII[71]];
                            Movement.walkTo((WorldPoint)var6);

                            Time.sleepTicks((int)llIIllIlII[0]);

                        }
                        if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var6), llIIllIlII[6]) && !A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[54])) break block83;
                        if (!A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) break block84;
                        String[] stringArray18 = new String[llIIllIlII[0]];
                        stringArray18[A.llIIllIlII[1]] = llIIllIIIl[llIIllIlII[72]];
                        if (!A.lIlIllIlIIIII(NPCs.getNearest((String[])stringArray18)) || !A.lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var6), llIIllIlII[70])) break block84;
                    }
                    WorldArea var7 = new WorldArea(llIIllIlII[73], llIIllIlII[74], llIIllIlII[43], llIIllIlII[37], llIIllIlII[1]);
                    if (A.lIlIllIIllIII(e.j(llIIllIlII[75]), llIIllIlII[24]) && A.lIlIllIIlIlll(Equipment.contains(item -> item.getName().contains(llIIllIIIl[llIIllIlII[89]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(llIIllIIIl[llIIllIlII[88]])).interact(llIIllIIIl[llIIllIlII[76]]);
                        Time.sleepTicks((int)llIIllIlII[12]);

                    }
                    if (A.lIlIllIIlIlll(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var8 = new WorldPoint(llIIllIlII[77], llIIllIlII[78], llIIllIlII[1]);
                        Movement.walkTo((WorldPoint)var8);

                        Time.sleepTicks((int)llIIllIlII[0]);

                    }
                    if (A.lIlIllIIllIIl(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)ed);

                        Time.sleepTicks((int)llIIllIlII[0]);

                    }
                }
                if (A.lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) {
                    if (A.lIlIllIIllIII(di, llIIllIlII[0])) {
                        aN.ql += llIIllIlII[0];
                        aN.u(AccBuilderSotf.m);
                        di += llIIllIlII[0];
                        aN.ql = llIIllIlII[1];
                        dj = llIIllIlII[1];
                    }
                    g.a(llIIllIIIl[llIIllIlII[79]], cE);
                }
            }
            g.a(cE);
        }
    }

    private static void lIlIllIIlIlIl() {
        llIIllIIIl = new String[llIIllIlII[112]];
        A.llIIllIIIl[A.llIIllIlII[1]] = "Finished buying items, switching back to quest";
        A.llIIllIIIl[A.llIIllIlII[0]] = "Nav to bank";
        A.llIIllIIIl[A.llIIllIlII[5]] = "Handling banking";
        A.llIIllIIIl[A.llIIllIlII[11]] = "We are missing runes, switching to BUYING";
        A.llIIllIIIl[A.llIIllIlII[6]] = "We are missing quest supplies, switching to BUYING";
        A.llIIllIIIl[A.llIIllIlII[16]] = "Drink";
        A.llIIllIIIl[A.llIIllIlII[12]] = "Drink";
        A.llIIllIIIl[A.llIIllIlII[22]] = "Nav to start";
        A.llIIllIIIl[A.llIIllIlII[23]] = "Lady Servil";
        A.llIIllIIIl[A.llIIllIlII[24]] = "Nav to armour";
        A.llIIllIIIl[A.llIIllIlII[18]] = "Getting armour";
        A.llIIllIIIl[A.llIIllIlII[25]] = "Door";
        A.llIIllIIIl[A.llIIllIlII[26]] = "Open";
        A.llIIllIIIl[A.llIIllIlII[3]] = "Chest";
        A.llIIllIIIl[A.llIIllIlII[27]] = "Door";
        A.llIIllIIIl[A.llIIllIlII[28]] = "Open";
        A.llIIllIIIl[A.llIIllIlII[29]] = "Chest";
        A.llIIllIIIl[A.llIIllIlII[30]] = "Chest";
        A.llIIllIIIl[A.llIIllIlII[31]] = "Open";
        A.llIIllIIIl[A.llIIllIlII[32]] = "Chest";
        A.llIIllIIIl[A.llIIllIlII[33]] = "Open";
        A.llIIllIIIl[A.llIIllIlII[34]] = "Chest";
        A.llIIllIIIl[A.llIIllIlII[35]] = "Search";
        A.llIIllIIIl[A.llIIllIlII[36]] = "Chest";
        A.llIIllIIIl[A.llIIllIlII[37]] = "Search";
        A.llIIllIIIl[A.llIIllIlII[21]] = "Wear";
        A.llIIllIIIl[A.llIIllIlII[40]] = "Wear";
        A.llIIllIIIl[A.llIIllIlII[41]] = "Nav to jail";
        A.llIIllIIIl[A.llIIllIlII[42]] = "Door";
        A.llIIllIIIl[A.llIIllIlII[43]] = "Open";
        A.llIIllIIIl[A.llIIllIlII[44]] = "Nav to guard";
        A.llIIllIIIl[A.llIIllIlII[45]] = "Head Guard";
        A.llIIllIIIl[A.llIIllIlII[46]] = "Khali brew";
        A.llIIllIIIl[A.llIIllIlII[47]] = "Nav to brew";
        A.llIIllIIIl[A.llIIllIlII[48]] = "Khazard Barman";
        A.llIIllIIIl[A.llIIllIlII[49]] = "Khali brew";
        A.llIIllIIIl[A.llIIllIlII[50]] = "Nav to guard";
        A.llIIllIIIl[A.llIIllIlII[51]] = "Nav to guard";
        A.llIIllIIIl[A.llIIllIlII[52]] = "Head Guard";
        A.llIIllIIIl[A.llIIllIlII[53]] = "Nav to  sammy";
        A.llIIllIIIl[A.llIIllIlII[54]] = "Khazard cell keys";
        A.llIIllIIIl[A.llIIllIlII[55]] = "Khazard Ogre";
        A.llIIllIIIl[A.llIIllIlII[56]] = "Khazard Ogre";
        A.llIIllIIIl[A.llIIllIlII[57]] = "Attack";
        A.llIIllIIIl[A.llIIllIlII[58]] = "Sammy Servil";
        A.llIIllIIIl[A.llIIllIlII[2]] = "Hengrad";
        A.llIIllIIIl[A.llIIllIlII[59]] = "Hengrad";
        A.llIIllIIIl[A.llIIllIlII[60]] = "Hengrad";
        A.llIIllIIIl[A.llIIllIlII[61]] = "Khazard Scorpion";
        A.llIIllIIIl[A.llIIllIlII[62]] = "Khazard Scorpion";
        A.llIIllIIIl[A.llIIllIlII[20]] = "Attack";
        A.llIIllIIIl[A.llIIllIlII[63]] = "Bouncer";
        A.llIIllIIIl[A.llIIllIlII[64]] = "Bouncer";
        A.llIIllIIIl[A.llIIllIlII[65]] = "Attack";
        A.llIIllIIIl[A.llIIllIlII[66]] = "General Khazard";
        A.llIIllIIIl[A.llIIllIlII[67]] = "Break";
        A.llIIllIIIl[A.llIIllIlII[71]] = "Nav to start";
        A.llIIllIIIl[A.llIIllIlII[72]] = "General Khazard";
        A.llIIllIIIl[A.llIIllIlII[76]] = "Castle Wars";
        A.llIIllIIIl[A.llIIllIlII[79]] = "Lady Servil";
        A.llIIllIIIl[A.llIIllIlII[86]] = "Fight Arena";
        A.llIIllIIIl[A.llIIllIlII[87]] = "ring of wealth (";
        A.llIIllIIIl[A.llIIllIlII[88]] = "dueling";
        A.llIIllIIIl[A.llIIllIlII[89]] = "dueling";
        A.llIIllIIIl[A.llIIllIlII[90]] = "Prison Gate";
        A.llIIllIIIl[A.llIIllIlII[109]] = "Can I help you?";
        A.llIIllIIIl[A.llIIllIlII[110]] = "I'd like a Khali Brew please.";
        A.llIIllIIIl[A.llIIllIlII[111]] = "Yes.";
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (!A.lIlIllIlIIIlI(Quests.getState((Quest)Quest.FIGHT_ARENA), QuestState.FINISHED) || A.lIlIllIIllIlI(e.j(em), llIIllIlII[27])) {
            bl = llIIllIlII[0];

            if (2 <= 1) {
                return false;
            }
        } else {
            bl = llIIllIlII[1];
        }
        return bl;
    }

    private static boolean lIlIllIlIIIII(Object object) {
        return object == null;
    }

    private static boolean lIlIllIlIIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIllIIllIII(int n2, int n3) {
        return n2 < n3;
    }
}

