/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
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
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class ADHelper
implements ac {
    static final  WorldPoint pi;
    public static  boolean bt;
    
    public static final  WorldPoint pe;
    
    public static final  WorldPoint pd;
    public static  List<d> bv;
    private final  int pk = 536;
    public static final  WorldPoint pg;
    public static final  WorldPoint pf;
    static final  WorldPoint ph;
    static final  WorldPoint pj;

    static {
        aD.lIlIlIlIllIll();
        aD.lIlIlIlIllIIl();
        pd = new WorldPoint(llIIlIllII[78], llIIlIllII[79], llIIlIllII[1]);
        pe = new WorldPoint(llIIlIllII[80], llIIlIllII[81], llIIlIllII[1]);
        pf = new WorldPoint(llIIlIllII[82], llIIlIllII[83], llIIlIllII[1]);
        pg = new WorldPoint(llIIlIllII[84], llIIlIllII[43], llIIlIllII[1]);
        ph = new WorldPoint(llIIlIllII[1], llIIlIllII[1], llIIlIllII[1]);
        pi = new WorldPoint(llIIlIllII[1], llIIlIllII[1], llIIlIllII[1]);
        pj = new WorldPoint(llIIlIllII[85], llIIlIllII[86], llIIlIllII[1]);
        bv = new ArrayList<d>();
    }

    private static boolean lIlIlIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIllIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String ag() {
        return llIIlIlIll[llIIlIllII[75]];
    }

    @Override
    public int af() {
        try {
            aD.fY();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xCF ^ 0x99) & ~(6 ^ 0x50)) != 0) {
            return (0x8E ^ 0x91) & ~(0x54 ^ 0x4B);
        }
        return llIIlIllII[74];
    }

    private static int fZ() {
        int n2 = llIIlIllII[69];
        if (aD.lIlIlIlIlllIl(Skills.getLevel((Skill)Skill.PRAYER), llIIlIllII[70]) && aD.lIlIlIllIIlII(Skills.getLevel((Skill)Skill.PRAYER), llIIlIllII[71])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIlIllII[72] + llIIlIllII[21];
        }
        int n3 = llIIlIllII[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIlIllII[72] + llIIlIllII[62];
    }

    @Override
    public boolean ae() {
        return llIIlIllII[1];
    }

    private static boolean lIlIlIlIlllll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIllIIIII(int n2) {
        return n2 > 0;
    }

    public ADHelper() {
        this.pk = llIIlIllII[0];
    }

    private static boolean lIlIlIllIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void Q() {
        d var1;
        Object var2;
        int[] nArray = new int[llIIlIllII[2]];
        nArray[aD.llIIlIllII[1]] = llIIlIllII[8];
        if (aD.lIlIlIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIIlIllII[8], llIIlIllII[13], j.cf);
            bv.add(d2);

        }
        int[] nArray2 = new int[llIIlIllII[2]];
        nArray2[aD.llIIlIllII[1]] = llIIlIllII[0];
        if (aD.lIlIlIlIllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(llIIlIllII[0], aD.fZ(), llIIlIllII[63]);
            bv.add((DHelper) ar2);

        }
        int[] nArray3 = new int[llIIlIllII[2]];
        nArray3[aD.llIIlIllII[1]] = llIIlIllII[7];
        if (aD.lIlIlIlIllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(llIIlIllII[7], llIIlIllII[3], llIIlIllII[5]);
            bv.add((DHelper) ar2);

        }
        if (aD.lIlIlIlIllllI(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(llIIlIlIll[llIIlIllII[77]]))) ? 1 : 0)) {
            var1 = new DHelper(llIIlIllII[64], llIIlIllII[13], llIIlIllII[65]);
            bv.add(var1);

        }
        int[] nArray4 = new int[llIIlIllII[2]];
        nArray4[aD.llIIlIllII[1]] = llIIlIllII[66];
        if (aD.lIlIlIlIllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new DHelper(llIIlIllII[66], llIIlIllII[67], llIIlIllII[68]);
            bv.add(var1);

        }
    }

    private static boolean lIlIlIlIlllII(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIlIllIIl() {
        llIIlIlIll = new String[llIIlIllII[87]];
        aD.llIIlIlIll[aD.llIIlIllII[1]] = "Buying items";
        aD.llIIlIlIll[aD.llIIlIllII[2]] = "Finished buying items, switching back to prayer";
        aD.llIIlIlIll[aD.llIIlIllII[3]] = "Navigating to bank";
        aD.llIIlIlIll[aD.llIIlIllII[4]] = "Handling banking";
        aD.llIIlIlIll[aD.llIIlIllII[6]] = "We are missing prayer supplies, switching to BUYING";
        aD.llIIlIlIll[aD.llIIlIllII[13]] = "Drink";
        aD.llIIlIlIll[aD.llIIlIllII[15]] = "Tele to wildy";
        aD.llIIlIlIll[aD.llIIlIllII[17]] = "Rub";
        aD.llIIlIlIll[aD.llIIlIllII[18]] = "Lava Maze";
        aD.llIIlIlIll[aD.llIIlIllII[19]] = "Okay, teleport to level 41 Wilderness.";
        aD.llIIlIlIll[aD.llIIlIllII[21]] = "Nav to altar";
        aD.llIIlIlIll[aD.llIIlIllII[41]] = "1 tick pray";
        aD.llIIlIlIll[aD.llIIlIllII[44]] = "Chaos altar";
        aD.llIIlIlIll[aD.llIIlIllII[20]] = "Large door";
        aD.llIIlIlIll[aD.llIIlIllII[46]] = "Open";
        aD.llIIlIlIll[aD.llIIlIllII[47]] = "Open";
        aD.llIIlIlIll[aD.llIIlIllII[48]] = "Open";
        aD.llIIlIlIll[aD.llIIlIllII[49]] = "Chaos altar";
        aD.llIIlIlIll[aD.llIIlIllII[51]] = "Nav to altar";
        aD.llIIlIlIll[aD.llIIlIllII[52]] = "Unnoting bones";
        aD.llIIlIlIll[aD.llIIlIllII[14]] = "Elder Chaos druid";
        aD.llIIlIlIll[aD.llIIlIllII[53]] = "Large door";
        aD.llIIlIlIll[aD.llIIlIllII[54]] = "Open";
        aD.llIIlIlIll[aD.llIIlIllII[55]] = "Open";
        aD.llIIlIlIll[aD.llIIlIllII[56]] = "Open";
        aD.llIIlIlIll[aD.llIIlIllII[57]] = "Exchange";
        aD.llIIlIlIll[aD.llIIlIllII[58]] = "Exchange 5";
        aD.llIIlIlIll[aD.llIIlIllII[59]] = "Exchange All";
        aD.llIIlIlIll[aD.llIIlIllII[60]] = "Suiciding";
        aD.llIIlIlIll[aD.llIIlIllII[61]] = "Wine of zamorak";
        aD.llIIlIlIll[aD.llIIlIllII[62]] = "Take";
        aD.llIIlIlIll[aD.llIIlIllII[75]] = "Prayer training";
        aD.llIIlIlIll[aD.llIIlIllII[77]] = "ring of wealth (";
    }

        return String.valueOf(var3);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aD.lIlIlIllIIlII(Skills.getLevel((Skill)Skill.PRAYER), llIIlIllII[76])) {
            bl = llIIlIllII[2];

            if (((0xA ^ 0x2B) & ~(0x2E ^ 0xF)) == -1) {
                return false;
            }
        } else {
            bl = llIIlIllII[1];
        }
        return bl;
    }

    public static void fY() {
        block44: {
            TileItem var4;
            block45: {
                if (aD.lIlIlIlIlllII(bt ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIll[llIIlIllII[1]];
                    b.a(bv);
                    if (aD.lIlIlIlIlllIl(bv.size(), llIIlIllII[2])) {
                        System.out.println(llIIlIlIll[llIIlIllII[2]]);
                        bt = llIIlIllII[1];
                    }
                }
                if (!aD.lIlIlIlIllllI(bt ? 1 : 0)) break block44;
                if (aD.lIlIlIlIllllI(aD.an() ? 1 : 0) && aD.lIlIlIlIlllIl(Game.getWildyLevel(), llIIlIllII[2])) {
                    var4 = BankLocation.getNearest();
                    if (aD.lIlIlIlIlllll(var4) && aD.lIlIlIlIllllI(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIlIlIll[llIIlIllII[3]];
                        a.a((BankLocation)var4);
                    }
                    if (aD.lIlIlIlIlllll(var4) && aD.lIlIlIlIlllII(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIlIlIll[llIIlIllII[4]];
                        if (aD.lIlIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIllII[5]);

                        }
                        if (aD.lIlIlIlIlllII(Bank.isOpen() ? 1 : 0)) {
                            if (aD.lIlIlIllIIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIlIllII[6]);

                            }
                            if (aD.lIlIlIllIIIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIlIllII[3]);

                            }
                            int[] nArray = new int[llIIlIllII[4]];
                            nArray[aD.llIIlIllII[1]] = llIIlIllII[7];
                            nArray[aD.llIIlIllII[2]] = llIIlIllII[0];
                            nArray[aD.llIIlIllII[3]] = llIIlIllII[8];
                            if (aD.lIlIlIlIllllI(e.c(nArray) ? 1 : 0)) {
                                aD.Q();
                                System.out.println(llIIlIlIll[llIIlIllII[6]]);
                                bt = llIIlIllII[2];
                                return;
                            }
                            int[] nArray2 = new int[llIIlIllII[4]];
                            nArray2[aD.llIIlIllII[1]] = llIIlIllII[7];
                            nArray2[aD.llIIlIllII[2]] = llIIlIllII[0];
                            nArray2[aD.llIIlIllII[3]] = llIIlIllII[8];
                            if (aD.lIlIlIlIlllII(e.c(nArray2) ? 1 : 0)) {
                                if (aD.lIlIlIlIllllI(Equipment.contains((int[])f.bf) ? 1 : 0)) {
                                    a.b(f.bf, llIIlIllII[2]);
                                }
                                a.b(f.ba, llIIlIllII[2]);
                                a.a(llIIlIllII[9], llIIlIllII[10]);
                                a.b(llIIlIllII[0], llIIlIllII[11]);
                            }
                        }
                    }
                }
                if (aD.lIlIlIlIlllII(aD.an() ? 1 : 0)) {
                    if (aD.lIlIlIlIlllII(Inventory.contains((int[])f.ba) ? 1 : 0) && aD.lIlIlIlIlllIl(Movement.getRunEnergy(), llIIlIllII[12])) {
                        Inventory.getFirst((int[])f.ba).interact(llIIlIlIll[llIIlIllII[13]]);
                        Time.sleepTicks((int)llIIlIllII[2]);

                    }
                    if (aD.lIlIlIlIllllI(Movement.isRunEnabled() ? 1 : 0) && aD.lIlIlIllIIIIl(Movement.getRunEnergy(), llIIlIllII[14])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)llIIlIllII[13]);

                    }
                    if (aD.lIlIlIlIlllIl(Game.getWildyLevel(), llIIlIllII[2])) {
                        AccBuilderSotf.c = llIIlIlIll[llIIlIllII[15]];
                        if (aD.lIlIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (aD.lIlIlIlIllllI(Dialog.isOpen() ? 1 : 0) && aD.lIlIlIlIlllII(Inventory.contains((int[])f.bf) ? 1 : 0) && aD.lIlIlIllIIIlI(Players.getLocal().getAnimation(), llIIlIllII[16])) {
                            Inventory.getFirst((int[])f.bf).interact(llIIlIlIll[llIIlIllII[17]]);
                            Time.sleepTicks((int)llIIlIllII[3]);

                        }
                        String[] stringArray = new String[llIIlIllII[3]];
                        stringArray[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[18]];
                        stringArray[aD.llIIlIllII[2]] = llIIlIlIll[llIIlIllII[19]];
                        g.a(stringArray);
                    }
                    if (aD.lIlIlIllIIIII(Game.getWildyLevel())) {
                        TileObject var5;
                        int[] nArray = new int[llIIlIllII[2]];
                        nArray[aD.llIIlIllII[1]] = llIIlIllII[0];
                        if (aD.lIlIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (aD.lIlIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                                AccBuilderSotf.c = llIIlIlIll[llIIlIllII[21]];
                                TileItem tileItem = new WorldPoint[llIIlIllII[20]];
                                tileItem[aD.llIIlIllII[1]] = new WorldPoint(llIIlIllII[22], llIIlIllII[23], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[2]] = new WorldPoint(llIIlIllII[24], llIIlIllII[25], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[3]] = new WorldPoint(llIIlIllII[26], llIIlIllII[27], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[4]] = new WorldPoint(llIIlIllII[28], llIIlIllII[29], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[6]] = new WorldPoint(llIIlIllII[30], llIIlIllII[31], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[13]] = new WorldPoint(llIIlIllII[32], llIIlIllII[33], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[15]] = new WorldPoint(llIIlIllII[34], llIIlIllII[35], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[17]] = new WorldPoint(llIIlIllII[36], llIIlIllII[37], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[18]] = new WorldPoint(llIIlIllII[38], llIIlIllII[37], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[19]] = new WorldPoint(llIIlIllII[39], llIIlIllII[37], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[21]] = new WorldPoint(llIIlIllII[40], llIIlIllII[37], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[41]] = new WorldPoint(llIIlIllII[42], llIIlIllII[43], llIIlIllII[1]);
                                tileItem[aD.llIIlIllII[44]] = new WorldPoint(llIIlIllII[45], llIIlIllII[43], llIIlIllII[1]);
                                var4 = tileItem;
                                Walker.walkAlong(Arrays.asList(var4), new HashMap());

                                Time.sleepTicks((int)llIIlIllII[2]);

                            }
                            if (aD.lIlIlIllIIIll(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                                AccBuilderSotf.c = llIIlIlIll[llIIlIllII[41]];
                                String[] stringArray = new String[llIIlIllII[2]];
                                stringArray[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[44]];
                                var4 = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[llIIlIllII[2]];
                                stringArray2[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[20]];
                                var5 = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[llIIlIllII[2]];
                                stringArray3[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[46]];
                                if (aD.lIlIlIlIlllII(var5.hasAction(stringArray3) ? 1 : 0)) {
                                    var5.interact(llIIlIlIll[llIIlIllII[47]]);
                                }
                                if (aD.lIlIlIlIlllll(var4)) {
                                    String[] stringArray4 = new String[llIIlIllII[2]];
                                    stringArray4[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[48]];
                                    if (aD.lIlIlIlIllllI(var5.hasAction(stringArray4) ? 1 : 0)) {
                                        int var6 = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[llIIlIllII[2]];
                                        nArray3[aD.llIIlIllII[1]] = llIIlIllII[0];
                                        String[] stringArray5 = new String[llIIlIllII[2]];
                                        stringArray5[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[49]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)llIIlIllII[2]);

                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[llIIlIllII[2]];
                        nArray4[aD.llIIlIllII[1]] = llIIlIllII[0];
                        if (aD.lIlIlIlIllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[llIIlIllII[2]];
                            nArray5[aD.llIIlIllII[1]] = llIIlIllII[50];
                            if (aD.lIlIlIlIlllII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (aD.lIlIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                                    AccBuilderSotf.c = llIIlIlIll[llIIlIllII[51]];
                                    WorldPoint[] worldPointArray = new WorldPoint[llIIlIllII[20]];
                                    worldPointArray[aD.llIIlIllII[1]] = new WorldPoint(llIIlIllII[22], llIIlIllII[23], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[2]] = new WorldPoint(llIIlIllII[24], llIIlIllII[25], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[3]] = new WorldPoint(llIIlIllII[26], llIIlIllII[27], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[4]] = new WorldPoint(llIIlIllII[28], llIIlIllII[29], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[6]] = new WorldPoint(llIIlIllII[30], llIIlIllII[31], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[13]] = new WorldPoint(llIIlIllII[32], llIIlIllII[33], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[15]] = new WorldPoint(llIIlIllII[34], llIIlIllII[35], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[17]] = new WorldPoint(llIIlIllII[36], llIIlIllII[37], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[18]] = new WorldPoint(llIIlIllII[38], llIIlIllII[37], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[19]] = new WorldPoint(llIIlIllII[39], llIIlIllII[37], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[21]] = new WorldPoint(llIIlIllII[40], llIIlIllII[37], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[41]] = new WorldPoint(llIIlIllII[42], llIIlIllII[43], llIIlIllII[1]);
                                    worldPointArray[aD.llIIlIllII[44]] = new WorldPoint(llIIlIllII[45], llIIlIllII[43], llIIlIllII[1]);
                                    var4 = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(var4), new HashMap());

                                    Time.sleepTicks((int)llIIlIllII[2]);

                                }
                                if (aD.lIlIlIllIIIll(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                                    AccBuilderSotf.c = llIIlIlIll[llIIlIllII[52]];
                                    if (!aD.lIlIlIlIllllI(Dialog.canLevelUpContinue() ? 1 : 0) || aD.lIlIlIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[llIIlIllII[2]];
                                    stringArray[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[14]];
                                    var4 = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[llIIlIllII[2]];
                                    stringArray6[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[53]];
                                    var5 = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[llIIlIllII[2]];
                                    stringArray7[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[54]];
                                    if (aD.lIlIlIlIlllII(var5.hasAction(stringArray7) ? 1 : 0)) {
                                        var5.interact(llIIlIlIll[llIIlIllII[55]]);
                                    }
                                    if (aD.lIlIlIlIlllll(var4)) {
                                        String[] stringArray8 = new String[llIIlIllII[2]];
                                        stringArray8[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[56]];
                                        if (aD.lIlIlIlIllllI(var5.hasAction(stringArray8) ? 1 : 0)) {
                                            List var6;
                                            if (aD.lIlIlIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[llIIlIllII[2]];
                                                nArray6[aD.llIIlIllII[1]] = llIIlIllII[50];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)var4);
                                                Time.sleepTicks((int)llIIlIllII[3]);

                                            }
                                            if (aD.lIlIlIlIlllII(Dialog.isOpen() ? 1 : 0) && aD.lIlIlIlIllllI((var6 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int var7 = llIIlIllII[1];
                                                while (aD.lIlIlIlIlllIl(var7, var6.size())) {
                                                    int[] nArray7 = new int[llIIlIllII[2]];
                                                    nArray7[aD.llIIlIllII[1]] = llIIlIllII[50];
                                                    if (aD.lIlIlIllIIIlI(((Item)Inventory.getAll((int[])nArray7).get(llIIlIllII[1])).getQuantity(), llIIlIllII[2]) && aD.lIlIlIlIlllII(((Widget)var6.get(var7)).getText().contains(llIIlIlIll[llIIlIllII[57]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var6.get(var7)).getClickPoint().getX(), (int)((Widget)var6.get(var7)).getClickPoint().getY(), (boolean)llIIlIllII[2]);
                                                        Time.sleepTicks((int)llIIlIllII[3]);

                                                    }
                                                    int[] nArray8 = new int[llIIlIllII[2]];
                                                    nArray8[aD.llIIlIllII[1]] = llIIlIllII[50];
                                                    if (aD.lIlIlIllIIIlI(((Item)Inventory.getAll((int[])nArray8).get(llIIlIllII[1])).getQuantity(), llIIlIllII[13]) && aD.lIlIlIlIlllII(((Widget)var6.get(var7)).getText().contains(llIIlIlIll[llIIlIllII[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var6.get(var7)).getClickPoint().getX(), (int)((Widget)var6.get(var7)).getClickPoint().getY(), (boolean)llIIlIllII[2]);
                                                        Time.sleepTicks((int)llIIlIllII[3]);

                                                    }
                                                    if (aD.lIlIlIlIlllII(((Widget)var6.get(var7)).getText().contains(llIIlIlIll[llIIlIllII[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var6.get(var7)).getClickPoint().getX(), (int)((Widget)var6.get(var7)).getClickPoint().getY(), (boolean)llIIlIllII[2]);
                                                        Time.sleepTicks((int)llIIlIllII[3]);

                                                    }
                                                    ++var7;

                                                    if (1 != ((0xF7 ^ 0xC7 ^ (0x7F ^ 0x4A)) & (0xA1 ^ 0xC6 ^ (0xF0 ^ 0x92) ^ -1))) continue;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] nArray = new int[llIIlIllII[2]];
                nArray[aD.llIIlIllII[1]] = llIIlIllII[9];
                if (!aD.lIlIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[llIIlIllII[2]];
                nArray9[aD.llIIlIllII[1]] = llIIlIllII[0];
                if (!aD.lIlIlIlIllllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[llIIlIllII[2]];
                nArray10[aD.llIIlIllII[1]] = llIIlIllII[50];
                if (!aD.lIlIlIlIllllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (aD.lIlIlIllIIIll(Players.getLocal().getWorldLocation().distanceTo(pf), llIIlIllII[20])) {
                AccBuilderSotf.c = llIIlIlIll[llIIlIllII[60]];
                String[] stringArray = new String[llIIlIllII[2]];
                stringArray[aD.llIIlIllII[1]] = llIIlIlIll[llIIlIllII[61]];
                var4 = TileItems.getNearest((String[])stringArray);
                if (aD.lIlIlIlIlllll(var4)) {
                    var4.interact(llIIlIlIll[llIIlIllII[62]]);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[llIIlIllII[2]];
                nArray[aD.llIIlIllII[1]] = llIIlIllII[9];
                if (!aD.lIlIlIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[llIIlIllII[2]];
                nArray2[aD.llIIlIllII[1]] = llIIlIllII[9];
                if (!aD.lIlIlIllIIlII(Inventory.getFirst((int[])nArray2).getQuantity(), llIIlIllII[12])) break block2;
                if (!aD.lIlIlIlIllllI(Inventory.contains((int[])f.bf) ? 1 : 0)) break block3;
                if (!aD.lIlIlIlIlllII(Equipment.contains((int[])f.bf) ? 1 : 0)) break block2;
                int[] nArray3 = new int[llIIlIllII[2]];
                nArray3[aD.llIIlIllII[1]] = llIIlIllII[0];
                if (!aD.lIlIlIlIllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[llIIlIllII[2]];
                nArray4[aD.llIIlIllII[1]] = llIIlIllII[50];
                if (!aD.lIlIlIlIlllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = llIIlIllII[2];

            if (((0xDC ^ 0xBD) & ~(0xF3 ^ 0x92)) != 2) return n2 != 0;
            return false;
        }
        n2 = llIIlIllII[1];
        return n2 != 0;
    }

}

