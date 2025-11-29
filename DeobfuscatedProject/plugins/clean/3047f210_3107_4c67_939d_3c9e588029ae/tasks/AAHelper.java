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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.account.AccBuilderTempleTrek;
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

public class AAHelper
implements S {
    private final  int jz = 536;
    static final  WorldPoint jx;
    public static final  WorldPoint jv;
    static final  WorldPoint jw;
    public static final  WorldPoint ju;
    public static final  WorldPoint js;
    public static final  WorldPoint jt;
    
    public static  List<d> bu;
    static final  WorldPoint jy;
    public static  boolean bs;

    private static boolean llIlllIIIIIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIllIlllllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIIIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        aa.llIllIllllllI();
        aa.llIllIlllllIl();
        js = new WorldPoint(lIIIIIIllII[78], lIIIIIIllII[79], lIIIIIIllII[1]);
        jt = new WorldPoint(lIIIIIIllII[80], lIIIIIIllII[81], lIIIIIIllII[1]);
        ju = new WorldPoint(lIIIIIIllII[82], lIIIIIIllII[83], lIIIIIIllII[1]);
        jv = new WorldPoint(lIIIIIIllII[84], lIIIIIIllII[43], lIIIIIIllII[1]);
        jw = new WorldPoint(lIIIIIIllII[1], lIIIIIIllII[1], lIIIIIIllII[1]);
        jx = new WorldPoint(lIIIIIIllII[1], lIIIIIIllII[1], lIIIIIIllII[1]);
        jy = new WorldPoint(lIIIIIIllII[85], lIIIIIIllII[86], lIIIIIIllII[1]);
        bu = new ArrayList<d>();
    }

    private static boolean llIlllIIIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIlllIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlllIIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlllIIIIIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (aa.llIlllIIIIlll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIllII[76])) {
            bl = lIIIIIIllII[2];

            if ((0x72 ^ 0xC ^ (0x7A ^ 0)) <= 2) {
                return ((0x5C ^ 0x51 ^ (0x5C ^ 0x56)) & (11 + 13 - 13 + 121 ^ 35 + 4 - -35 + 57 ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIIllII[1];
        }
        return bl;
    }

    public AAHelper() {
        this.jz = lIIIIIIllII[0];
    }

    @Override
    public boolean S() {
        return lIIIIIIllII[1];
    }

    private static boolean llIlllIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIllIlllllIl() {
        lIIIIIIlIll = new String[lIIIIIIllII[87]];
        aa.lIIIIIIlIll[aa.lIIIIIIllII[1]] = "Buying items";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[2]] = "Finished buying items, switching back to prayer";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[3]] = "Navigating to bank";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[4]] = "Handling banking";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[6]] = "We are missing prayer supplies, switching to BUYING";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[13]] = "Drink";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[15]] = "Tele to wildy";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[17]] = "Rub";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[18]] = "Lava Maze";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[19]] = "Okay, teleport to level 41 Wilderness.";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[21]] = "Nav to altar";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[41]] = "1 tick pray";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[44]] = "Chaos altar";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[20]] = "Large door";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[46]] = "Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[47]] = "Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[48]] = "Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[49]] = "Chaos altar";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[51]] = "Nav to altar";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[52]] = "Unnoting bones";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[14]] = "Elder Chaos druid";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[53]] = "Large door";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[54]] = "Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[55]] = "Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[56]] = "Open";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[57]] = "Exchange";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[58]] = "Exchange 5";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[59]] = "Exchange All";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[60]] = "Suiciding";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[61]] = "Wine of zamorak";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[62]] = "Take";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[75]] = "Prayer training";
        aa.lIIIIIIlIll[aa.lIIIIIIllII[77]] = "ring of wealth (";
    }

    private static void ae() {
        d var1;
        Object var2;
        int[] nArray = new int[lIIIIIIllII[2]];
        nArray[aa.lIIIIIIllII[1]] = lIIIIIIllII[8];
        if (aa.llIlllIIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIIIIIllII[8], lIIIIIIllII[13], i.bp);
            bu.add(d2);

        }
        int[] nArray2 = new int[lIIIIIIllII[2]];
        nArray2[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
        if (aa.llIlllIIIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(lIIIIIIllII[0], aa.eB(), lIIIIIIllII[63]);
            bu.add((DHelper) ar2);

        }
        int[] nArray3 = new int[lIIIIIIllII[2]];
        nArray3[aa.lIIIIIIllII[1]] = lIIIIIIllII[7];
        if (aa.llIlllIIIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var2 = new DHelper(lIIIIIIllII[7], lIIIIIIllII[3], lIIIIIIllII[5]);
            bu.add((DHelper) ar2);

        }
        if (aa.llIlllIIIIIIl(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lIIIIIIlIll[lIIIIIIllII[77]]))) ? 1 : 0)) {
            var1 = new DHelper(lIIIIIIllII[64], lIIIIIIllII[13], lIIIIIIllII[65]);
            bu.add(var1);

        }
        int[] nArray4 = new int[lIIIIIIllII[2]];
        nArray4[aa.lIIIIIIllII[1]] = lIIIIIIllII[66];
        if (aa.llIlllIIIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new DHelper(lIIIIIIllII[66], lIIIIIIllII[67], lIIIIIIllII[68]);
            bu.add(var1);

        }
    }

    @Override
    public int T() {
        try {
            aa.eA();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return lIIIIIIllII[74];
    }

    private static int eB() {
        int n2 = lIIIIIIllII[69];
        if (aa.llIlllIIIIIII(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIllII[70]) && aa.llIlllIIIIlll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIllII[71])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIIllII[72] + lIIIIIIllII[21];
        }
        int n3 = lIIIIIIllII[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIIIIIIllII[72] + lIIIIIIllII[62];
    }

    @Override
    public String U() {
        return lIIIIIIlIll[lIIIIIIllII[75]];
    }

    private static boolean llIlllIIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void eA() {
        block44: {
            TileItem var3;
            block45: {
                if (aa.llIllIlllllll(bs ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[1]];
                    b.a(bu);
                    if (aa.llIlllIIIIIII(bu.size(), lIIIIIIllII[2])) {
                        System.out.println(lIIIIIIlIll[lIIIIIIllII[2]]);
                        bs = lIIIIIIllII[1];
                    }
                }
                if (!aa.llIlllIIIIIIl(bs ? 1 : 0)) break block44;
                if (aa.llIlllIIIIIIl(aa.AAHelper() ? 1 : 0) && aa.llIlllIIIIIII(Game.getWildyLevel(), lIIIIIIllII[2])) {
                    var3 = BankLocation.getNearest();
                    if (aa.llIlllIIIIIlI(var3) && aa.llIlllIIIIIIl(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[3]];
                        a.a((BankLocation)var3);
                    }
                    if (aa.llIlllIIIIIlI(var3) && aa.llIllIlllllll(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[4]];
                        if (aa.llIlllIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIllII[5]);

                        }
                        if (aa.llIllIlllllll(Bank.isOpen() ? 1 : 0)) {
                            if (aa.llIlllIIIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIIIIllII[6]);

                            }
                            if (aa.llIlllIIIIIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIIIIllII[3]);

                            }
                            int[] nArray = new int[lIIIIIIllII[4]];
                            nArray[aa.lIIIIIIllII[1]] = lIIIIIIllII[7];
                            nArray[aa.lIIIIIIllII[2]] = lIIIIIIllII[0];
                            nArray[aa.lIIIIIIllII[3]] = lIIIIIIllII[8];
                            if (aa.llIlllIIIIIIl(e.b(nArray) ? 1 : 0)) {
                                aa.ae();
                                System.out.println(lIIIIIIlIll[lIIIIIIllII[6]]);
                                bs = lIIIIIIllII[2];
                                return;
                            }
                            int[] nArray2 = new int[lIIIIIIllII[4]];
                            nArray2[aa.lIIIIIIllII[1]] = lIIIIIIllII[7];
                            nArray2[aa.lIIIIIIllII[2]] = lIIIIIIllII[0];
                            nArray2[aa.lIIIIIIllII[3]] = lIIIIIIllII[8];
                            if (aa.llIllIlllllll(e.b(nArray2) ? 1 : 0)) {
                                if (aa.llIlllIIIIIIl(Equipment.contains((int[])f.aZ) ? 1 : 0)) {
                                    a.b(f.aZ, lIIIIIIllII[2]);
                                }
                                a.b(f.aU, lIIIIIIllII[2]);
                                a.a(lIIIIIIllII[9], lIIIIIIllII[10]);
                                a.b(lIIIIIIllII[0], lIIIIIIllII[11]);
                            }
                        }
                    }
                }
                if (aa.llIllIlllllll(aa.AAHelper() ? 1 : 0)) {
                    if (aa.llIllIlllllll(Inventory.contains((int[])f.aU) ? 1 : 0) && aa.llIlllIIIIIII(Movement.getRunEnergy(), lIIIIIIllII[12])) {
                        Inventory.getFirst((int[])f.aU).interact(lIIIIIIlIll[lIIIIIIllII[13]]);
                        Time.sleepTicks((int)lIIIIIIllII[2]);

                    }
                    if (aa.llIlllIIIIIIl(Movement.isRunEnabled() ? 1 : 0) && aa.llIlllIIIIlII(Movement.getRunEnergy(), lIIIIIIllII[14])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIIIIIIllII[13]);

                    }
                    if (aa.llIlllIIIIIII(Game.getWildyLevel(), lIIIIIIllII[2])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[15]];
                        if (aa.llIllIlllllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (aa.llIlllIIIIIIl(Dialog.isOpen() ? 1 : 0) && aa.llIllIlllllll(Inventory.contains((int[])f.aZ) ? 1 : 0) && aa.llIlllIIIIlIl(Players.getLocal().getAnimation(), lIIIIIIllII[16])) {
                            Inventory.getFirst((int[])f.aZ).interact(lIIIIIIlIll[lIIIIIIllII[17]]);
                            Time.sleepTicks((int)lIIIIIIllII[3]);

                        }
                        String[] stringArray = new String[lIIIIIIllII[3]];
                        stringArray[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[18]];
                        stringArray[aa.lIIIIIIllII[2]] = lIIIIIIlIll[lIIIIIIllII[19]];
                        g.a(stringArray);
                    }
                    if (aa.llIlllIIIIIll(Game.getWildyLevel())) {
                        TileObject var4;
                        int[] nArray = new int[lIIIIIIllII[2]];
                        nArray[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
                        if (aa.llIllIlllllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (aa.llIlllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                                AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[21]];
                                TileItem tileItem = new WorldPoint[lIIIIIIllII[20]];
                                tileItem[aa.lIIIIIIllII[1]] = new WorldPoint(lIIIIIIllII[22], lIIIIIIllII[23], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[2]] = new WorldPoint(lIIIIIIllII[24], lIIIIIIllII[25], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[3]] = new WorldPoint(lIIIIIIllII[26], lIIIIIIllII[27], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[4]] = new WorldPoint(lIIIIIIllII[28], lIIIIIIllII[29], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[6]] = new WorldPoint(lIIIIIIllII[30], lIIIIIIllII[31], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[13]] = new WorldPoint(lIIIIIIllII[32], lIIIIIIllII[33], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[15]] = new WorldPoint(lIIIIIIllII[34], lIIIIIIllII[35], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[17]] = new WorldPoint(lIIIIIIllII[36], lIIIIIIllII[37], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[18]] = new WorldPoint(lIIIIIIllII[38], lIIIIIIllII[37], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[19]] = new WorldPoint(lIIIIIIllII[39], lIIIIIIllII[37], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[21]] = new WorldPoint(lIIIIIIllII[40], lIIIIIIllII[37], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[41]] = new WorldPoint(lIIIIIIllII[42], lIIIIIIllII[43], lIIIIIIllII[1]);
                                tileItem[aa.lIIIIIIllII[44]] = new WorldPoint(lIIIIIIllII[45], lIIIIIIllII[43], lIIIIIIllII[1]);
                                var3 = tileItem;
                                Walker.walkAlong(Arrays.asList(var3), new HashMap());

                                Time.sleepTicks((int)lIIIIIIllII[2]);

                            }
                            if (aa.llIlllIIIIllI(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                                AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[41]];
                                String[] stringArray = new String[lIIIIIIllII[2]];
                                stringArray[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[44]];
                                var3 = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIIIIIIllII[2]];
                                stringArray2[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[20]];
                                var4 = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIIIIIIllII[2]];
                                stringArray3[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[46]];
                                if (aa.llIllIlllllll(var4.hasAction(stringArray3) ? 1 : 0)) {
                                    var4.interact(lIIIIIIlIll[lIIIIIIllII[47]]);
                                }
                                if (aa.llIlllIIIIIlI(var3)) {
                                    String[] stringArray4 = new String[lIIIIIIllII[2]];
                                    stringArray4[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[48]];
                                    if (aa.llIlllIIIIIIl(var4.hasAction(stringArray4) ? 1 : 0)) {
                                        int var5 = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIIIIIIllII[2]];
                                        nArray3[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
                                        String[] stringArray5 = new String[lIIIIIIllII[2]];
                                        stringArray5[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[49]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIIIIIIllII[2]);

                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIIIIIIllII[2]];
                        nArray4[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
                        if (aa.llIlllIIIIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIIIIIllII[2]];
                            nArray5[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                            if (aa.llIllIlllllll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (aa.llIlllIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                                    AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[51]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIIIIIIllII[20]];
                                    worldPointArray[aa.lIIIIIIllII[1]] = new WorldPoint(lIIIIIIllII[22], lIIIIIIllII[23], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[2]] = new WorldPoint(lIIIIIIllII[24], lIIIIIIllII[25], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[3]] = new WorldPoint(lIIIIIIllII[26], lIIIIIIllII[27], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[4]] = new WorldPoint(lIIIIIIllII[28], lIIIIIIllII[29], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[6]] = new WorldPoint(lIIIIIIllII[30], lIIIIIIllII[31], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[13]] = new WorldPoint(lIIIIIIllII[32], lIIIIIIllII[33], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[15]] = new WorldPoint(lIIIIIIllII[34], lIIIIIIllII[35], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[17]] = new WorldPoint(lIIIIIIllII[36], lIIIIIIllII[37], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[18]] = new WorldPoint(lIIIIIIllII[38], lIIIIIIllII[37], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[19]] = new WorldPoint(lIIIIIIllII[39], lIIIIIIllII[37], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[21]] = new WorldPoint(lIIIIIIllII[40], lIIIIIIllII[37], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[41]] = new WorldPoint(lIIIIIIllII[42], lIIIIIIllII[43], lIIIIIIllII[1]);
                                    worldPointArray[aa.lIIIIIIllII[44]] = new WorldPoint(lIIIIIIllII[45], lIIIIIIllII[43], lIIIIIIllII[1]);
                                    var3 = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(var3), new HashMap());

                                    Time.sleepTicks((int)lIIIIIIllII[2]);

                                }
                                if (aa.llIlllIIIIllI(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                                    AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[52]];
                                    if (!aa.llIlllIIIIIIl(Dialog.canLevelUpContinue() ? 1 : 0) || aa.llIllIlllllll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIIIIIIllII[2]];
                                    stringArray[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[14]];
                                    var3 = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIIIIIIllII[2]];
                                    stringArray6[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[53]];
                                    var4 = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIIIIIIllII[2]];
                                    stringArray7[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[54]];
                                    if (aa.llIllIlllllll(var4.hasAction(stringArray7) ? 1 : 0)) {
                                        var4.interact(lIIIIIIlIll[lIIIIIIllII[55]]);
                                    }
                                    if (aa.llIlllIIIIIlI(var3)) {
                                        String[] stringArray8 = new String[lIIIIIIllII[2]];
                                        stringArray8[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[56]];
                                        if (aa.llIlllIIIIIIl(var4.hasAction(stringArray8) ? 1 : 0)) {
                                            List var5;
                                            if (aa.llIlllIIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIIIIIIllII[2]];
                                                nArray6[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)var3);
                                                Time.sleepTicks((int)lIIIIIIllII[3]);

                                            }
                                            if (aa.llIllIlllllll(Dialog.isOpen() ? 1 : 0) && aa.llIlllIIIIIIl((var5 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int var6 = lIIIIIIllII[1];
                                                while (aa.llIlllIIIIIII(var6, var5.size())) {
                                                    int[] nArray7 = new int[lIIIIIIllII[2]];
                                                    nArray7[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                                                    if (aa.llIlllIIIIlIl(((Item)Inventory.getAll((int[])nArray7).get(lIIIIIIllII[1])).getQuantity(), lIIIIIIllII[2]) && aa.llIllIlllllll(((Widget)var5.get(var6)).getText().contains(lIIIIIIlIll[lIIIIIIllII[57]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var5.get(var6)).getClickPoint().getX(), (int)((Widget)var5.get(var6)).getClickPoint().getY(), (boolean)lIIIIIIllII[2]);
                                                        Time.sleepTicks((int)lIIIIIIllII[3]);

                                                    }
                                                    int[] nArray8 = new int[lIIIIIIllII[2]];
                                                    nArray8[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                                                    if (aa.llIlllIIIIlIl(((Item)Inventory.getAll((int[])nArray8).get(lIIIIIIllII[1])).getQuantity(), lIIIIIIllII[13]) && aa.llIllIlllllll(((Widget)var5.get(var6)).getText().contains(lIIIIIIlIll[lIIIIIIllII[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var5.get(var6)).getClickPoint().getX(), (int)((Widget)var5.get(var6)).getClickPoint().getY(), (boolean)lIIIIIIllII[2]);
                                                        Time.sleepTicks((int)lIIIIIIllII[3]);

                                                    }
                                                    if (aa.llIllIlllllll(((Widget)var5.get(var6)).getText().contains(lIIIIIIlIll[lIIIIIIllII[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var5.get(var6)).getClickPoint().getX(), (int)((Widget)var5.get(var6)).getClickPoint().getY(), (boolean)lIIIIIIllII[2]);
                                                        Time.sleepTicks((int)lIIIIIIllII[3]);

                                                    }
                                                    ++var6;

                                                    if (((94 + 119 - 92 + 23 ^ 39 + 122 - 146 + 145) & (140 + 118 - 152 + 70 ^ 81 + 57 - 93 + 83 ^ -1)) == 0) continue;
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
                int[] nArray = new int[lIIIIIIllII[2]];
                nArray[aa.lIIIIIIllII[1]] = lIIIIIIllII[9];
                if (!aa.llIllIlllllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIIIIIIllII[2]];
                nArray9[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
                if (!aa.llIlllIIIIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIIIIIIllII[2]];
                nArray10[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                if (!aa.llIlllIIIIIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (aa.llIlllIIIIllI(Players.getLocal().getWorldLocation().distanceTo(ju), lIIIIIIllII[20])) {
                AccBuilderTempleTrek.c = lIIIIIIlIll[lIIIIIIllII[60]];
                String[] stringArray = new String[lIIIIIIllII[2]];
                stringArray[aa.lIIIIIIllII[1]] = lIIIIIIlIll[lIIIIIIllII[61]];
                var3 = TileItems.getNearest((String[])stringArray);
                if (aa.llIlllIIIIIlI(var3)) {
                    var3.interact(lIIIIIIlIll[lIIIIIIllII[62]]);
                }
            }
        }
    }

        return String.valueOf(var7);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean AAHelper() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIIIIIIllII[2]];
                nArray[aa.lIIIIIIllII[1]] = lIIIIIIllII[9];
                if (!aa.llIllIlllllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIIIIIllII[2]];
                nArray2[aa.lIIIIIIllII[1]] = lIIIIIIllII[9];
                if (!aa.llIlllIIIIlll(Inventory.getFirst((int[])nArray2).getQuantity(), lIIIIIIllII[12])) break block2;
                if (!aa.llIlllIIIIIIl(Inventory.contains((int[])f.aZ) ? 1 : 0)) break block3;
                if (!aa.llIllIlllllll(Equipment.contains((int[])f.aZ) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIIIIIIllII[2]];
                nArray3[aa.lIIIIIIllII[1]] = lIIIIIIllII[0];
                if (!aa.llIlllIIIIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIIIIIIllII[2]];
                nArray4[aa.lIIIIIIllII[1]] = lIIIIIIllII[50];
                if (!aa.llIllIlllllll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIIIIIIllII[2];

            if (1 > 0) return n2 != 0;
            return ((129 + 157 - 190 + 98 ^ 121 + 123 - 200 + 153) & (0xFD ^ 0x83 ^ (0xF8 ^ 0x81) ^ -1)) != 0;
        }
        n2 = lIIIIIIllII[1];
        return n2 != 0;
    }
}

