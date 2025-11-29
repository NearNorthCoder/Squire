/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
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
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AZHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class BHelper
implements ac {
    private static  WorldPoint eu;
    public static  List<d> bv;
    static  String[] cE;
    static  boolean ep;
    public static  boolean bt;
    static  boolean dj;
    private static  WorldPoint et;

    private static  WorldPoint es;
    private static  int ev;
    private static  WorldPoint eq;
    static  int di;
    private static  WorldPoint de;
    static  WorldArea eo;
    private static  WorldPoint er;

    private static boolean lIllIlIIllIII(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[llIlIllIll[1]];
        nArray[B.llIlIllIll[2]] = llIlIllIll[8];
        if (B.lIllIlIIllIII(Inventory.getCount((int[])nArray))) {
            String[] stringArray = new String[llIlIllIll[1]];
            stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[52]];
            if (B.lIllIlIIllIII(Inventory.getCount((String[])stringArray))) {
                String[] stringArray2 = new String[llIlIllIll[1]];
                stringArray2[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[53]];
                if (B.lIllIlIIllIII(Inventory.getCount((String[])stringArray2))) {
                    String[] stringArray3 = new String[llIlIllIll[1]];
                    stringArray3[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[54]];
                    if (B.lIllIlIIllIII(Inventory.getCount((String[])stringArray3))) {
                        String[] stringArray4 = new String[llIlIllIll[1]];
                        stringArray4[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[55]];
                        if (B.lIllIlIIllIII(Inventory.getCount((String[])stringArray4))) {
                            String[] stringArray5 = new String[llIlIllIll[1]];
                            stringArray5[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[56]];
                            if (B.lIllIlIIllIII(Inventory.getCount((String[])stringArray5))) {
                                int[] nArray2 = new int[llIlIllIll[1]];
                                nArray2[B.llIlIllIll[2]] = llIlIllIll[17];
                                if (B.lIllIlIIllIII(Inventory.getCount((int[])nArray2)) && B.lIllIlIIlIlIl(Inventory.contains((int[])f.ba) ? 1 : 0)) {
                                    n2 = llIlIllIll[1];

                                    if (-(0x91 ^ 0x95) <= 0) return n2 != 0;
                                    return (3 & ~3) != 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = llIlIllIll[2];
        return n2 != 0;
    }

    private static boolean lIllIlIIlIlIl(int n2) {
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llIlIllIII[llIlIllIll[63]];
    }

    private static void Q() {
        d var1;
        Object var2;
        int[] nArray = new int[llIlIllIll[1]];
        nArray[B.llIlIllIll[2]] = llIlIllIll[12];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIlIllIll[12], llIlIllIll[1], llIlIllIll[57]);
            bv.add(d2);

        }
        int[] nArray2 = new int[llIlIllIll[1]];
        nArray2[B.llIlIllIll[2]] = llIlIllIll[10];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(llIlIllIll[10], llIlIllIll[1], llIlIllIll[4]);
            bv.add((DHelper) ar2);

        }
        int[] nArray3 = new int[llIlIllIll[1]];
        nArray3[B.llIlIllIll[2]] = llIlIllIll[9];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(llIlIllIll[9], llIlIllIll[1], llIlIllIll[4]);
            bv.add((DHelper) ar2);

        }
        int[] nArray4 = new int[llIlIllIll[1]];
        nArray4[B.llIlIllIll[2]] = llIlIllIll[14];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var2 = new DHelper(llIlIllIll[14], llIlIllIll[24], llIlIllIll[4]);
            bv.add((DHelper) ar2);

        }
        int[] nArray5 = new int[llIlIllIll[1]];
        nArray5[B.llIlIllIll[2]] = llIlIllIll[16];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var2 = new DHelper(llIlIllIll[16], llIlIllIll[24], j.cf);
            bv.add((DHelper) ar2);

        }
        int[] nArray6 = new int[llIlIllIll[1]];
        nArray6[B.llIlIllIll[2]] = llIlIllIll[11];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var2 = new DHelper(llIlIllIll[11], llIlIllIll[0], llIlIllIll[58]);
            bv.add((DHelper) ar2);

        }
        if (B.lIllIlIIlIllI(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(llIlIllIII[llIlIllIll[64]]))) ? 1 : 0)) {
            var1 = new DHelper(llIlIllIll[59], llIlIllIll[13], llIlIllIll[60]);
            bv.add(var1);

        }
        int[] nArray7 = new int[llIlIllIll[1]];
        nArray7[B.llIlIllIll[2]] = llIlIllIll[8];
        if (B.lIllIlIIlIllI(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var1 = new DHelper(llIlIllIll[8], llIlIllIll[52], llIlIllIll[61]);
            bv.add(var1);

        }
    }

    static {
        B.lIllIlIIlIIlI();
        B.lIllIlIIlIIIl();
        bv = new ArrayList<d>();
        eo = new WorldArea(llIlIllIll[65], llIlIllIll[66], llIlIllIll[24], llIlIllIll[25], llIlIllIll[2]);
        String[] stringArray = new String[llIlIllIll[22]];
        stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[67]];
        stringArray[B.llIlIllIll[1]] = llIlIllIII[llIlIllIll[68]];
        stringArray[B.llIlIllIll[3]] = llIlIllIII[llIlIllIll[69]];
        stringArray[B.llIlIllIll[5]] = llIlIllIII[llIlIllIll[19]];
        stringArray[B.llIlIllIll[6]] = llIlIllIII[llIlIllIll[70]];
        stringArray[B.llIlIllIll[13]] = llIlIllIII[llIlIllIll[71]];
        stringArray[B.llIlIllIll[15]] = llIlIllIII[llIlIllIll[72]];
        stringArray[B.llIlIllIll[7]] = llIlIllIII[llIlIllIll[73]];
        cE = stringArray;
        de = new WorldPoint(llIlIllIll[74], llIlIllIll[75], llIlIllIll[2]);
        eq = new WorldPoint(llIlIllIll[76], llIlIllIll[77], llIlIllIll[2]);
        er = new WorldPoint(llIlIllIll[78], llIlIllIll[79], llIlIllIll[2]);
        es = new WorldPoint(llIlIllIll[80], llIlIllIll[81], llIlIllIll[2]);
        et = new WorldPoint(llIlIllIll[82], llIlIllIll[83], llIlIllIll[2]);
        eu = new WorldPoint(llIlIllIll[84], llIlIllIll[85], llIlIllIll[2]);
        ev = llIlIllIll[24];
    }

    private static boolean lIllIlIIlIllI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var3);
    }

    private static boolean lIllIlIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ae() {
        return llIlIllIll[2];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (B.lIllIlIIlIlII(e.j(ev), llIlIllIll[13])) {
            bl = llIlIllIll[1];

            if (-1 == 2) {
                return false;
            }
        } else {
            bl = llIlIllIll[2];
        }
        return bl;
    }

    private static boolean lIllIlIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIIllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlIIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int af() {
        try {
            B.by();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x4F ^ 0x42) & ~(0xBD ^ 0xB0)) != 0) {
            return (0x22 ^ 0x36) & ~(0x55 ^ 0x41);
        }
        return llIlIllIll[62];
    }

    private static void lIllIlIIlIIIl() {
        llIlIllIII = new String[llIlIllIll[86]];
        B.llIlIllIII[B.llIlIllIll[2]] = "Finished buying items, switching back to quest";
        B.llIlIllIII[B.llIlIllIll[1]] = "Fishing pass";
        B.llIlIllIII[B.llIlIllIll[3]] = "Nav to bank";
        B.llIlIllIII[B.llIlIllIll[5]] = "Handling banking";
        B.llIlIllIII[B.llIlIllIll[6]] = "We are missing quest supplies, switching to BUYING";
        B.llIlIllIII[B.llIlIllIll[13]] = "Drink";
        B.llIlIllIII[B.llIlIllIll[15]] = "Nav to start";
        B.llIlIllIII[B.llIlIllIll[7]] = "Starting quest";
        B.llIlIllIII[B.llIlIllIll[22]] = "Vestri";
        B.llIlIllIII[B.llIlIllIll[23]] = "Fishing trophy";
        B.llIlIllIII[B.llIlIllIll[0]] = "Red vine worm";
        B.llIlIllIII[B.llIlIllIll[24]] = "Nav to vine";
        B.llIlIllIII[B.llIlIllIll[21]] = "Digging";
        B.llIlIllIII[B.llIlIllIll[25]] = "Red vine worm";
        B.llIlIllIII[B.llIlIllIll[26]] = "Vine";
        B.llIlIllIII[B.llIlIllIll[27]] = "Vine";
        B.llIlIllIII[B.llIlIllIll[28]] = "Check";
        B.llIlIllIII[B.llIlIllIll[29]] = "Red vine worm";
        B.llIlIllIII[B.llIlIllIll[30]] = "Nav to contest";
        B.llIlIllIII[B.llIlIllIll[31]] = "Garlic";
        B.llIlIllIII[B.llIlIllIll[32]] = "Using garlic";
        B.llIlIllIII[B.llIlIllIll[33]] = "Wall Pipe";
        B.llIlIllIII[B.llIlIllIll[34]] = "Wall Pipe";
        B.llIlIllIII[B.llIlIllIll[35]] = "Garlic";
        B.llIlIllIII[B.llIlIllIll[36]] = "Wall Pipe";
        B.llIlIllIII[B.llIlIllIll[37]] = "Garlic";
        B.llIlIllIII[B.llIlIllIll[38]] = "Start contest";
        B.llIlIllIII[B.llIlIllIll[20]] = "Bonzo";
        B.llIlIllIII[B.llIlIllIll[39]] = "I might still be able to find a bigger fish";
        B.llIlIllIII[B.llIlIllIll[40]] = "Garlic";
        B.llIlIllIII[B.llIlIllIll[41]] = "Raw giant carp";
        B.llIlIllIII[B.llIlIllIll[42]] = "Fishing";
        B.llIlIllIII[B.llIlIllIll[44]] = "Bait";
        B.llIlIllIII[B.llIlIllIll[45]] = "Raw giant carp";
        B.llIlIllIII[B.llIlIllIll[46]] = "Handing in fish";
        B.llIlIllIII[B.llIlIllIll[47]] = "Bonzo";
        B.llIlIllIII[B.llIlIllIll[48]] = "Fishing trophy";
        B.llIlIllIII[B.llIlIllIll[49]] = "Nav to start";
        B.llIlIllIII[B.llIlIllIll[50]] = "Finishing quest";
        B.llIlIllIII[B.llIlIllIll[51]] = "Vestri";
        B.llIlIllIII[B.llIlIllIll[52]] = "Camelot teleport";
        B.llIlIllIII[B.llIlIllIll[53]] = "Garlic";
        B.llIlIllIII[B.llIlIllIll[54]] = "Spade";
        B.llIlIllIII[B.llIlIllIll[55]] = "Fishing rod";
        B.llIlIllIII[B.llIlIllIll[56]] = "Fishing bait";
        B.llIlIllIII[B.llIlIllIll[63]] = "Fishing contest";
        B.llIlIllIII[B.llIlIllIll[64]] = "ring of wealth (";
        B.llIlIllIII[B.llIlIllIll[67]] = "I was wondering what was down those stairs?";
        B.llIlIllIII[B.llIlIllIll[68]] = "Why not?";
        B.llIlIllIII[B.llIlIllIll[69]] = "If you were my friend I wouldn't mind it.";
        B.llIlIllIII[B.llIlIllIll[19]] = "Well, let's be friends!";
        B.llIlIllIII[B.llIlIllIll[70]] = "And how am I meant to do that?";
        B.llIlIllIII[B.llIlIllIll[71]] = "I'll enter the competition please.";
        B.llIlIllIII[B.llIlIllIll[72]] = "I have this big fish. Is it enough to win?";
        B.llIlIllIII[B.llIlIllIll[73]] = "Yes.";
    }

    public static void by() {
        if (B.lIllIlIIlIIll(Skills.getLevel((Skill)Skill.FISHING), llIlIllIll[0])) {
            az.gH();
        }
        if (B.lIllIlIIlIlII(Skills.getLevel((Skill)Skill.FISHING), llIlIllIll[0])) {
            if (B.lIllIlIIlIlIl(bt ? 1 : 0)) {
                b.a(bv);
                if (B.lIllIlIIlIIll(bv.size(), llIlIllIll[1])) {
                    System.out.println(llIlIllIII[llIlIllIll[2]]);
                    bt = llIlIllIll[2];
                }
            }
            if (B.lIllIlIIlIllI(bt ? 1 : 0)) {
                if (B.lIllIlIIlIllI(B.an() ? 1 : 0) && B.lIllIlIIlIIll(e.j(ev), llIlIllIll[1])) {
                    String[] stringArray = new String[llIlIllIll[1]];
                    stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[1]];
                    if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        BankLocation var4 = BankLocation.getNearest();
                        if (B.lIllIlIIlIlll(var4) && B.lIllIlIIlIllI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[3]];
                            a.a(var4);
                        }
                        if (B.lIllIlIIlIlll(var4) && B.lIllIlIIlIlIl(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (B.lIllIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIllIll[4]);

                            }
                            if (B.lIllIlIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderSotf.c = llIlIllIII[llIlIllIll[5]];
                                if (B.lIllIlIIllIII(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIlIllIll[6]);

                                }
                                if (B.lIllIlIIllIII(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIlIllIll[3]);

                                }
                                int[] nArray = new int[llIlIllIll[7]];
                                nArray[B.llIlIllIll[2]] = llIlIllIll[8];
                                nArray[B.llIlIllIll[1]] = llIlIllIll[9];
                                nArray[B.llIlIllIll[3]] = llIlIllIll[10];
                                nArray[B.llIlIllIll[5]] = llIlIllIll[11];
                                nArray[B.llIlIllIll[6]] = llIlIllIll[12];
                                nArray[B.llIlIllIll[13]] = llIlIllIll[14];
                                nArray[B.llIlIllIll[15]] = llIlIllIll[16];
                                if (B.lIllIlIIlIllI(e.c(nArray) ? 1 : 0)) {
                                    B.Q();
                                    System.out.println(llIlIllIII[llIlIllIll[6]]);
                                    bt = llIlIllIll[1];
                                    return;
                                }
                                int[] nArray2 = new int[llIlIllIll[15]];
                                nArray2[B.llIlIllIll[2]] = llIlIllIll[8];
                                nArray2[B.llIlIllIll[1]] = llIlIllIll[9];
                                nArray2[B.llIlIllIll[3]] = llIlIllIll[10];
                                nArray2[B.llIlIllIll[5]] = llIlIllIll[11];
                                nArray2[B.llIlIllIll[6]] = llIlIllIll[12];
                                nArray2[B.llIlIllIll[13]] = llIlIllIll[14];
                                if (B.lIllIlIIlIlIl(e.c(nArray2) ? 1 : 0)) {
                                    a.a(llIlIllIll[8], llIlIllIll[0]);
                                    a.a(llIlIllIll[14], llIlIllIll[0]);
                                    a.a(llIlIllIll[9], llIlIllIll[1]);
                                    a.a(llIlIllIll[10], llIlIllIll[1]);
                                    a.a(llIlIllIll[11], llIlIllIll[0]);
                                    a.a(llIlIllIll[12], llIlIllIll[1]);
                                    a.a(llIlIllIll[16], llIlIllIll[5]);
                                    a.a(llIlIllIll[17], llIlIllIll[18]);
                                }
                            }
                        }
                    }
                }
                if (B.lIllIlIIlIlIl(Inventory.contains((int[])f.ba) ? 1 : 0) && B.lIllIlIIlIIll(Movement.getRunEnergy(), llIlIllIll[19])) {
                    Inventory.getFirst((int[])f.ba).interact(llIlIllIII[llIlIllIll[13]]);
                    Time.sleepTicks((int)llIlIllIll[1]);

                }
                if (B.lIllIlIIlIlIl(B.an() ? 1 : 0) && B.lIllIlIIlIIll(e.j(ev), llIlIllIll[1])) {
                    int[] nArray = new int[llIlIllIll[1]];
                    nArray[B.llIlIllIll[2]] = llIlIllIll[20];
                    if (B.lIllIlIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        if (B.lIllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[0])) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[15]];
                            if (B.lIllIlIIlIlIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)de);

                            Time.sleepTicks((int)llIlIllIll[1]);

                        }
                        if (B.lIllIlIIllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[21])) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[7]];
                            g.a(llIlIllIII[llIlIllIll[22]], cE);
                        }
                    }
                }
                if (B.lIllIlIIllIll(e.j(ev), llIlIllIll[1])) {
                    int[] nArray = new int[llIlIllIll[1]];
                    nArray[B.llIlIllIll[2]] = llIlIllIll[20];
                    if (B.lIllIlIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray = new String[llIlIllIll[1]];
                        stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[23]];
                        if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            di = llIlIllIll[2];
                            String[] stringArray2 = new String[llIlIllIll[1]];
                            stringArray2[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[0]];
                            if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                                if (B.lIllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(er), llIlIllIll[6])) {
                                    AccBuilderSotf.c = llIlIllIII[llIlIllIll[24]];
                                    Movement.walkTo((WorldPoint)er);

                                }
                                if (B.lIllIlIIllIlI(Players.getLocal().getWorldLocation().distanceTo(er), llIlIllIll[6])) {
                                    AccBuilderSotf.c = llIlIllIII[llIlIllIll[21]];
                                    String[] stringArray3 = new String[llIlIllIll[1]];
                                    stringArray3[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[25]];
                                    if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                        String[] stringArray4 = new String[llIlIllIll[1]];
                                        stringArray4[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[26]];
                                        if (B.lIllIlIIlIlll(TileObjects.getNearest((String[])stringArray4))) {
                                            String[] stringArray5 = new String[llIlIllIll[1]];
                                            stringArray5[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[27]];
                                            TileObjects.getNearest((String[])stringArray5).interact(llIlIllIII[llIlIllIll[28]]);
                                            Time.sleepTicks((int)llIlIllIll[3]);

                                        }
                                    }
                                }
                            }
                            String[] stringArray6 = new String[llIlIllIll[1]];
                            stringArray6[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[29]];
                            if (B.lIllIlIIlIlIl(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                                if (B.lIllIlIIlIllI(eo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderSotf.c = llIlIllIII[llIlIllIll[30]];
                                    if (B.lIllIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)eu);

                                        Time.sleepTicks((int)llIlIllIll[1]);

                                    }
                                    g.a(cE);
                                }
                                if (B.lIllIlIIlIlIl(eo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray7 = new String[llIlIllIll[1]];
                                    stringArray7[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[31]];
                                    if (B.lIllIlIIlIlIl(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[32]];
                                        String[] stringArray8 = new String[llIlIllIll[1]];
                                        stringArray8[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[33]];
                                        if (B.lIllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray8).getWorldLocation()), llIlIllIll[3])) {
                                            String[] stringArray9 = new String[llIlIllIll[1]];
                                            stringArray9[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[34]];
                                            Movement.walkTo((WorldPoint)TileObjects.getNearest((String[])stringArray9).getWorldLocation());

                                            Time.sleepTicks((int)llIlIllIll[6]);

                                        }
                                        if (B.lIllIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                                            String[] stringArray10 = new String[llIlIllIll[1]];
                                            stringArray10[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[35]];
                                            String[] stringArray11 = new String[llIlIllIll[1]];
                                            stringArray11[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[36]];
                                            Inventory.getFirst((String[])stringArray10).useOn(TileObjects.getNearest((String[])stringArray11));
                                            Time.sleepTicks((int)llIlIllIll[3]);

                                        }
                                        g.a(cE);
                                    }
                                    String[] stringArray12 = new String[llIlIllIll[1]];
                                    stringArray12[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[37]];
                                    if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray12) ? 1 : 0) && B.lIllIlIIlIllI(ep ? 1 : 0)) {
                                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[38]];
                                        g.a(llIlIllIII[llIlIllIll[20]], cE);
                                        if (B.lIllIlIIlIlIl(Dialog.getText().contains(llIlIllIII[llIlIllIll[39]]) ? 1 : 0)) {
                                            ep = llIlIllIll[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (B.lIllIlIIllIll(e.j(ev), llIlIllIll[5])) {
                    String[] stringArray = new String[llIlIllIll[1]];
                    stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[40]];
                    if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray13 = new String[llIlIllIll[1]];
                        stringArray13[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[41]];
                        if (B.lIllIlIIlIllI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIllIII[llIlIllIll[42]];
                            int[] nArray = new int[llIlIllIll[1]];
                            nArray[B.llIlIllIll[2]] = llIlIllIll[43];
                            NPCs.getNearest((int[])nArray).interact(llIlIllIII[llIlIllIll[44]]);
                            Time.sleepTicks((int)llIlIllIll[13]);

                        }
                    }
                    String[] stringArray14 = new String[llIlIllIll[1]];
                    stringArray14[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[45]];
                    if (B.lIllIlIIlIlIl(Inventory.contains((String[])stringArray14) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[46]];
                        g.a(llIlIllIII[llIlIllIll[47]], cE);
                    }
                }
                String[] stringArray = new String[llIlIllIll[1]];
                stringArray[B.llIlIllIll[2]] = llIlIllIII[llIlIllIll[48]];
                if (B.lIllIlIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (B.lIllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[13])) {
                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[49]];
                        Movement.walkTo((WorldPoint)de);

                        Time.sleepTicks((int)llIlIllIll[1]);

                    }
                    if (B.lIllIlIIllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llIlIllIll[13])) {
                        AccBuilderSotf.c = llIlIllIII[llIlIllIll[50]];
                        if (B.lIllIlIIlIIll(di, llIlIllIll[1])) {
                            aN.qf += llIlIllIll[1];
                            aN.u(AccBuilderSotf.m);
                            di += llIlIllIll[1];
                            aN.qf = llIlIllIll[2];
                            dj = llIlIllIll[2];
                        }
                        g.a(llIlIllIII[llIlIllIll[51]], cE);
                    }
                }
            }
        }
    }
}

