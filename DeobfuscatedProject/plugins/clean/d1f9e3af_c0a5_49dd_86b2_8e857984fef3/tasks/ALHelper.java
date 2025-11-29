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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.GHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.IHelper;
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

public class ALHelper
implements W {
    public static final  WorldPoint mr;
    static final  WorldPoint mu;
    
    private final  int mw = 536;
    public static  boolean bt;
    static final  WorldPoint mv;
    public static final  WorldPoint ms;
    static final  WorldPoint mt;
    public static final  WorldPoint mq;
    public static final  WorldPoint mp;
    public static  List<d> bv;

    private static boolean lIIlIIIllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIIlIllI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (al.lIIlIIIlllII(Skills.getLevel((Skill)Skill.PRAYER), lIlIllIII[76])) {
            bl = lIlIllIII[2];

            if (3 == 2) {
                return ((0xA3 ^ 0xC0 ^ (0xA2 ^ 0x84)) & (0xE8 ^ 0xA7 ^ (0xAF ^ 0xA5) ^ -1)) != 0;
            }
        } else {
            bl = lIlIllIII[1];
        }
        return bl;
    }

    private static void af() {
        d lllIIlIIlIIIlI;
        Object lllIIlIIlIIIll;
        int[] nArray = new int[lIlIllIII[2]];
        nArray[al.lIlIllIII[1]] = lIlIllIII[8];
        if (al.lIIlIIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIlIllIII[8], lIlIllIII[13], i.bq);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIlIllIII[2]];
        nArray2[al.lIlIllIII[1]] = lIlIllIII[0];
        if (al.lIIlIIIlIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lllIIlIIlIIIll = new DHelper(lIlIllIII[0], al.dE(), lIlIllIII[63]);
            bv.add((DHelper) llIIlIIlIIIll);

        }
        int[] nArray3 = new int[lIlIllIII[2]];
        nArray3[al.lIlIllIII[1]] = lIlIllIII[7];
        if (al.lIIlIIIlIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lllIIlIIlIIIll = new DHelper(lIlIllIII[7], lIlIllIII[3], lIlIllIII[5]);
            bv.add((DHelper) llIIlIIlIIIll);

        }
        if (al.lIIlIIIlIllI(Bank.contains((Predicate)(lllIIlIIlIIIll = item -> item.getName().toLowerCase().contains(lIlIlIllI[lIlIllIII[77]]))) ? 1 : 0)) {
            lllIIlIIlIIIlI = new DHelper(lIlIllIII[64], lIlIllIII[13], lIlIllIII[65]);
            bv.add(lllIIlIIlIIIlI);

        }
        int[] nArray4 = new int[lIlIllIII[2]];
        nArray4[al.lIlIllIII[1]] = lIlIllIII[66];
        if (al.lIIlIIIlIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lllIIlIIlIIIlI = new DHelper(lIlIllIII[66], lIlIllIII[67], lIlIllIII[68]);
            bv.add(lllIIlIIlIIIlI);

        }
    }

    @Override
    public int T() {
        try {
            al.dD();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 == 0) {
            return (0x13 ^ 0x1A) & ~(0x27 ^ 0x2E);
        }
        return lIlIllIII[74];
    }

    private static boolean lIIlIIIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIlIllIII[2]];
                nArray[al.lIlIllIII[1]] = lIlIllIII[9];
                if (!al.lIIlIIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIlIllIII[2]];
                nArray2[al.lIlIllIII[1]] = lIlIllIII[9];
                if (!al.lIIlIIIlllII(Inventory.getFirst((int[])nArray2).getQuantity(), lIlIllIII[12])) break block2;
                if (!al.lIIlIIIlIllI(Inventory.contains((int[])f.ba) ? 1 : 0)) break block3;
                if (!al.lIIlIIIlIlII(Equipment.contains((int[])f.ba) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIlIllIII[2]];
                nArray3[al.lIlIllIII[1]] = lIlIllIII[0];
                if (!al.lIIlIIIlIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIlIllIII[2]];
                nArray4[al.lIlIllIII[1]] = lIlIllIII[50];
                if (!al.lIIlIIIlIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIlIllIII[2];

            if (-(0x4F ^ 0x4B) <= 0) return n2 != 0;
            return false;
        }
        n2 = lIlIllIII[1];
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIlIllIII[1];
    }

    private static boolean lIIlIIIllIII(int n2) {
        return n2 > 0;
    }

    public ALHelper() {
        this.mw = lIlIllIII[0];
    }

    private static boolean lIIlIIIlIlII(int n2) {
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIlIlIllI[lIlIllIII[75]];
    }

    private static boolean lIIlIIIlIlll(Object object) {
        return object != null;
    }

    static {
        al.lIIlIIIlIIll();
        al.lIIlIIIlIIlI();
        mp = new WorldPoint(lIlIllIII[78], lIlIllIII[79], lIlIllIII[1]);
        mq = new WorldPoint(lIlIllIII[80], lIlIllIII[81], lIlIllIII[1]);
        mr = new WorldPoint(lIlIllIII[82], lIlIllIII[83], lIlIllIII[1]);
        ms = new WorldPoint(lIlIllIII[84], lIlIllIII[43], lIlIllIII[1]);
        mt = new WorldPoint(lIlIllIII[1], lIlIllIII[1], lIlIllIII[1]);
        mu = new WorldPoint(lIlIllIII[1], lIlIllIII[1], lIlIllIII[1]);
        mv = new WorldPoint(lIlIllIII[85], lIlIllIII[86], lIlIllIII[1]);
        bv = new ArrayList<d>();
    }

    public static void dD() {
        block44: {
            TileItem lllIIlIIlIlIIl;
            block45: {
                if (al.lIIlIIIlIlII(bt ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[1]];
                    b.a(bv);
                    if (al.lIIlIIIlIlIl(bv.size(), lIlIllIII[2])) {
                        System.out.println(lIlIlIllI[lIlIllIII[2]]);
                        bt = lIlIllIII[1];
                    }
                }
                if (!al.lIIlIIIlIllI(bt ? 1 : 0)) break block44;
                if (al.lIIlIIIlIllI(al.ab() ? 1 : 0) && al.lIIlIIIlIlIl(Game.getWildyLevel(), lIlIllIII[2])) {
                    lllIIlIIlIlIIl = BankLocation.getNearest();
                    if (al.lIIlIIIlIlll(lllIIlIIlIlIIl) && al.lIIlIIIlIllI(lllIIlIIlIlIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[3]];
                        a.a((BankLocation)lllIIlIIlIlIIl);
                    }
                    if (al.lIIlIIIlIlll(lllIIlIIlIlIIl) && al.lIIlIIIlIlII(lllIIlIIlIlIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[4]];
                        if (al.lIIlIIIlIllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIllIII[5]);

                        }
                        if (al.lIIlIIIlIlII(Bank.isOpen() ? 1 : 0)) {
                            if (al.lIIlIIIllIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIllIII[6]);

                            }
                            if (al.lIIlIIIllIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIllIII[3]);

                            }
                            int[] nArray = new int[lIlIllIII[4]];
                            nArray[al.lIlIllIII[1]] = lIlIllIII[7];
                            nArray[al.lIlIllIII[2]] = lIlIllIII[0];
                            nArray[al.lIlIllIII[3]] = lIlIllIII[8];
                            if (al.lIIlIIIlIllI(e.b(nArray) ? 1 : 0)) {
                                al.af();
                                System.out.println(lIlIlIllI[lIlIllIII[6]]);
                                bt = lIlIllIII[2];
                                return;
                            }
                            int[] nArray2 = new int[lIlIllIII[4]];
                            nArray2[al.lIlIllIII[1]] = lIlIllIII[7];
                            nArray2[al.lIlIllIII[2]] = lIlIllIII[0];
                            nArray2[al.lIlIllIII[3]] = lIlIllIII[8];
                            if (al.lIIlIIIlIlII(e.b(nArray2) ? 1 : 0)) {
                                if (al.lIIlIIIlIllI(Equipment.contains((int[])f.ba) ? 1 : 0)) {
                                    a.b(f.ba, lIlIllIII[2]);
                                }
                                a.b(f.aV, lIlIllIII[2]);
                                a.a(lIlIllIII[9], lIlIllIII[10]);
                                a.b(lIlIllIII[0], lIlIllIII[11]);
                            }
                        }
                    }
                }
                if (al.lIIlIIIlIlII(al.ab() ? 1 : 0)) {
                    if (al.lIIlIIIlIlII(Inventory.contains((int[])f.aV) ? 1 : 0) && al.lIIlIIIlIlIl(Movement.getRunEnergy(), lIlIllIII[12])) {
                        Inventory.getFirst((int[])f.aV).interact(lIlIlIllI[lIlIllIII[13]]);
                        Time.sleepTicks((int)lIlIllIII[2]);

                    }
                    if (al.lIIlIIIlIllI(Movement.isRunEnabled() ? 1 : 0) && al.lIIlIIIllIIl(Movement.getRunEnergy(), lIlIllIII[14])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIlIllIII[13]);

                    }
                    if (al.lIIlIIIlIlIl(Game.getWildyLevel(), lIlIllIII[2])) {
                        AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[15]];
                        if (al.lIIlIIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (al.lIIlIIIlIllI(Dialog.isOpen() ? 1 : 0) && al.lIIlIIIlIlII(Inventory.contains((int[])f.ba) ? 1 : 0) && al.lIIlIIIllIlI(Players.getLocal().getAnimation(), lIlIllIII[16])) {
                            Inventory.getFirst((int[])f.ba).interact(lIlIlIllI[lIlIllIII[17]]);
                            Time.sleepTicks((int)lIlIllIII[3]);

                        }
                        String[] stringArray = new String[lIlIllIII[3]];
                        stringArray[al.lIlIllIII[1]] = lIlIlIllI[lIlIllIII[18]];
                        stringArray[al.lIlIllIII[2]] = lIlIlIllI[lIlIllIII[19]];
                        g.a(stringArray);
                    }
                    if (al.lIIlIIIllIII(Game.getWildyLevel())) {
                        TileObject lllIIlIIlIlIII;
                        int[] nArray = new int[lIlIllIII[2]];
                        nArray[al.lIlIllIII[1]] = lIlIllIII[0];
                        if (al.lIIlIIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (al.lIIlIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(mr), lIlIllIII[20])) {
                                AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[21]];
                                TileItem tileItem = new WorldPoint[lIlIllIII[20]];
                                tileItem[al.lIlIllIII[1]] = new WorldPoint(lIlIllIII[22], lIlIllIII[23], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[2]] = new WorldPoint(lIlIllIII[24], lIlIllIII[25], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[3]] = new WorldPoint(lIlIllIII[26], lIlIllIII[27], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[4]] = new WorldPoint(lIlIllIII[28], lIlIllIII[29], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[6]] = new WorldPoint(lIlIllIII[30], lIlIllIII[31], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[13]] = new WorldPoint(lIlIllIII[32], lIlIllIII[33], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[15]] = new WorldPoint(lIlIllIII[34], lIlIllIII[35], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[17]] = new WorldPoint(lIlIllIII[36], lIlIllIII[37], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[18]] = new WorldPoint(lIlIllIII[38], lIlIllIII[37], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[19]] = new WorldPoint(lIlIllIII[39], lIlIllIII[37], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[21]] = new WorldPoint(lIlIllIII[40], lIlIllIII[37], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[41]] = new WorldPoint(lIlIllIII[42], lIlIllIII[43], lIlIllIII[1]);
                                tileItem[al.lIlIllIII[44]] = new WorldPoint(lIlIllIII[45], lIlIllIII[43], lIlIllIII[1]);
                                lllIIlIIlIlIIl = tileItem;
                                Walker.walkAlong(Arrays.asList(lllIIlIIlIlIIl), new HashMap());

                                Time.sleepTicks((int)lIlIllIII[2]);

                            }
                            if (al.lIIlIIIllIll(Players.getLocal().getWorldLocation().distanceTo(mr), lIlIllIII[20])) {
                                AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[41]];
                                String[] stringArray = new String[lIlIllIII[2]];
                                stringArray[al.lIlIllIII[1]] = lIlIlIllI[lIlIllIII[44]];
                                lllIIlIIlIlIIl = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIlIllIII[2]];
                                stringArray2[al.lIlIllIII[1]] = lIlIlIllI[lIlIllIII[20]];
                                lllIIlIIlIlIII = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIlIllIII[2]];
                                stringArray3[al.lIlIllIII[1]] = lIlIlIllI[lIlIllIII[46]];
                                if (al.lIIlIIIlIlII(lllIIlIIlIlIII.hasAction(stringArray3) ? 1 : 0)) {
                                    lllIIlIIlIlIII.interact(lIlIlIllI[lIlIllIII[47]]);
                                }
                                if (al.lIIlIIIlIlll(lllIIlIIlIlIIl)) {
                                    String[] stringArray4 = new String[lIlIllIII[2]];
                                    stringArray4[al.lIlIllIII[1]] = lIlIlIllI[lIlIllIII[48]];
                                    if (al.lIIlIIIlIllI(lllIIlIIlIlIII.hasAction(stringArray4) ? 1 : 0)) {
                                        int lllIIlIIlIIlll = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIlIllIII[2]];
                                        nArray3[al.lIlIllIII[1]] = lIlIllIII[0];
                                        String[] stringArray5 = new String[lIlIllIII[2]];
                                        stringArray5[al.lIlIllIII[1]] = lIlIlIllI[lIlIllIII[49]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIlIllIII[2]);

                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIlIllIII[2]];
                        nArray4[al.lIlIllIII[1]] = lIlIllIII[0];
                        if (al.lIIlIIIlIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIlIllIII[2]];
                            nArray5[al.lIlIllIII[1]] = lIlIllIII[50];
                            if (al.lIIlIIIlIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (al.lIIlIIIllIIl(Players.getLocal().getWorldLocation().distanceTo(mr), lIlIllIII[20])) {
                                    AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[51]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIlIllIII[20]];
                                    worldPointArray[al.lIlIllIII[1]] = new WorldPoint(lIlIllIII[22], lIlIllIII[23], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[2]] = new WorldPoint(lIlIllIII[24], lIlIllIII[25], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[3]] = new WorldPoint(lIlIllIII[26], lIlIllIII[27], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[4]] = new WorldPoint(lIlIllIII[28], lIlIllIII[29], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[6]] = new WorldPoint(lIlIllIII[30], lIlIllIII[31], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[13]] = new WorldPoint(lIlIllIII[32], lIlIllIII[33], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[15]] = new WorldPoint(lIlIllIII[34], lIlIllIII[35], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[17]] = new WorldPoint(lIlIllIII[36], lIlIllIII[37], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[18]] = new WorldPoint(lIlIllIII[38], lIlIllIII[37], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[19]] = new WorldPoint(lIlIllIII[39], lIlIllIII[37], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[21]] = new WorldPoint(lIlIllIII[40], lIlIllIII[37], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[41]] = new WorldPoint(lIlIllIII[42], lIlIllIII[43], lIlIllIII[1]);
                                    worldPointArray[al.lIlIllIII[44]] = new WorldPoint(lIlIllIII[45], lIlIllIII[43], lIlIllIII[1]);
                                    lllIIlIIlIlIIl = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(lllIIlIIlIlIIl), new HashMap());

                                    Time.sleepTicks((int)lIlIllIII[2]);

                                }
                                if (al.lIIlIIIllIll(Players.getLocal().getWorldLocation().distanceTo(mr), lIlIllIII[20])) {
                                    AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[52]];
                                    if (!al.lIIlIIIlIllI(Dialog.canLevelUpContinue() ? 1 : 0) || al.lIIlIIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIlIllIII[2]];
                                    stringArray[al.lIlIllIII[1]] = lIlIlIllI[lIlIllIII[14]];
                                    lllIIlIIlIlIIl = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIlIllIII[2]];
                                    stringArray6[al.lIlIllIII[1]] = lIlIlIllI[lIlIllIII[53]];
                                    lllIIlIIlIlIII = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIlIllIII[2]];
                                    stringArray7[al.lIlIllIII[1]] = lIlIlIllI[lIlIllIII[54]];
                                    if (al.lIIlIIIlIlII(lllIIlIIlIlIII.hasAction(stringArray7) ? 1 : 0)) {
                                        lllIIlIIlIlIII.interact(lIlIlIllI[lIlIllIII[55]]);
                                    }
                                    if (al.lIIlIIIlIlll(lllIIlIIlIlIIl)) {
                                        String[] stringArray8 = new String[lIlIllIII[2]];
                                        stringArray8[al.lIlIllIII[1]] = lIlIlIllI[lIlIllIII[56]];
                                        if (al.lIIlIIIlIllI(lllIIlIIlIlIII.hasAction(stringArray8) ? 1 : 0)) {
                                            List lllIIlIIlIIlll;
                                            if (al.lIIlIIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIlIllIII[2]];
                                                nArray6[al.lIlIllIII[1]] = lIlIllIII[50];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)lllIIlIIlIlIIl);
                                                Time.sleepTicks((int)lIlIllIII[3]);

                                            }
                                            if (al.lIIlIIIlIlII(Dialog.isOpen() ? 1 : 0) && al.lIIlIIIlIllI((lllIIlIIlIIlll = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int lllIIlIIlIIllI = lIlIllIII[1];
                                                while (al.lIIlIIIlIlIl(lllIIlIIlIIllI, lllIIlIIlIIlll.size())) {
                                                    int[] nArray7 = new int[lIlIllIII[2]];
                                                    nArray7[al.lIlIllIII[1]] = lIlIllIII[50];
                                                    if (al.lIIlIIIllIlI(((Item)Inventory.getAll((int[])nArray7).get(lIlIllIII[1])).getQuantity(), lIlIllIII[2]) && al.lIIlIIIlIlII(((Widget)lllIIlIIlIIlll.get(lllIIlIIlIIllI)).getText().contains(lIlIlIllI[lIlIllIII[57]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllIIlIIlIIlll.get(lllIIlIIlIIllI)).getClickPoint().getX(), (int)((Widget)lllIIlIIlIIlll.get(lllIIlIIlIIllI)).getClickPoint().getY(), (boolean)lIlIllIII[2]);
                                                        Time.sleepTicks((int)lIlIllIII[3]);

                                                    }
                                                    int[] nArray8 = new int[lIlIllIII[2]];
                                                    nArray8[al.lIlIllIII[1]] = lIlIllIII[50];
                                                    if (al.lIIlIIIllIlI(((Item)Inventory.getAll((int[])nArray8).get(lIlIllIII[1])).getQuantity(), lIlIllIII[13]) && al.lIIlIIIlIlII(((Widget)lllIIlIIlIIlll.get(lllIIlIIlIIllI)).getText().contains(lIlIlIllI[lIlIllIII[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllIIlIIlIIlll.get(lllIIlIIlIIllI)).getClickPoint().getX(), (int)((Widget)lllIIlIIlIIlll.get(lllIIlIIlIIllI)).getClickPoint().getY(), (boolean)lIlIllIII[2]);
                                                        Time.sleepTicks((int)lIlIllIII[3]);

                                                    }
                                                    if (al.lIIlIIIlIlII(((Widget)lllIIlIIlIIlll.get(lllIIlIIlIIllI)).getText().contains(lIlIlIllI[lIlIllIII[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lllIIlIIlIIlll.get(lllIIlIIlIIllI)).getClickPoint().getX(), (int)((Widget)lllIIlIIlIIlll.get(lllIIlIIlIIllI)).getClickPoint().getY(), (boolean)lIlIllIII[2]);
                                                        Time.sleepTicks((int)lIlIllIII[3]);

                                                    }
                                                    ++lllIIlIIlIIllI;

                                                    if (((0x18 ^ 0x64 ^ (0xEC ^ 0xC0)) & (0x91 ^ 0xB8 ^ (0x53 ^ 0x2A) ^ -1)) == 0) continue;
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
                int[] nArray = new int[lIlIllIII[2]];
                nArray[al.lIlIllIII[1]] = lIlIllIII[9];
                if (!al.lIIlIIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIlIllIII[2]];
                nArray9[al.lIlIllIII[1]] = lIlIllIII[0];
                if (!al.lIIlIIIlIllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIlIllIII[2]];
                nArray10[al.lIlIllIII[1]] = lIlIllIII[50];
                if (!al.lIIlIIIlIllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (al.lIIlIIIllIll(Players.getLocal().getWorldLocation().distanceTo(mr), lIlIllIII[20])) {
                AccBuilderEasyClues.c = lIlIlIllI[lIlIllIII[60]];
                String[] stringArray = new String[lIlIllIII[2]];
                stringArray[al.lIlIllIII[1]] = lIlIlIllI[lIlIllIII[61]];
                lllIIlIIlIlIIl = TileItems.getNearest((String[])stringArray);
                if (al.lIIlIIIlIlll(lllIIlIIlIlIIl)) {
                    lllIIlIIlIlIIl.interact(lIlIlIllI[lIlIllIII[62]]);
                }
            }
        }
    }

        return String.valueOf(lllIIlIIIIllll);
    }

    private static int dE() {
        int n2 = lIlIllIII[69];
        if (al.lIIlIIIlIlIl(Skills.getLevel((Skill)Skill.PRAYER), lIlIllIII[70]) && al.lIIlIIIlllII(Skills.getLevel((Skill)Skill.PRAYER), lIlIllIII[71])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIlIllIII[72] + lIlIllIII[21];
        }
        int n3 = lIlIllIII[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIlIllIII[72] + lIlIllIII[62];
    }

    private static boolean lIIlIIIllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIIlIIlI() {
        lIlIlIllI = new String[lIlIllIII[87]];
        al.lIlIlIllI[al.lIlIllIII[1]] = "Buying items";
        al.lIlIlIllI[al.lIlIllIII[2]] = "Finished buying items, switching back to prayer";
        al.lIlIlIllI[al.lIlIllIII[3]] = "Navigating to bank";
        al.lIlIlIllI[al.lIlIllIII[4]] = "Handling banking";
        al.lIlIlIllI[al.lIlIllIII[6]] = "We are missing prayer supplies, switching to BUYING";
        al.lIlIlIllI[al.lIlIllIII[13]] = "Drink";
        al.lIlIlIllI[al.lIlIllIII[15]] = "Tele to wildy";
        al.lIlIlIllI[al.lIlIllIII[17]] = "Rub";
        al.lIlIlIllI[al.lIlIllIII[18]] = "Lava Maze";
        al.lIlIlIllI[al.lIlIllIII[19]] = "Okay, teleport to level 41 Wilderness.";
        al.lIlIlIllI[al.lIlIllIII[21]] = "Nav to altar";
        al.lIlIlIllI[al.lIlIllIII[41]] = "1 tick pray";
        al.lIlIlIllI[al.lIlIllIII[44]] = "Chaos altar";
        al.lIlIlIllI[al.lIlIllIII[20]] = "Large door";
        al.lIlIlIllI[al.lIlIllIII[46]] = "Open";
        al.lIlIlIllI[al.lIlIllIII[47]] = "Open";
        al.lIlIlIllI[al.lIlIllIII[48]] = "Open";
        al.lIlIlIllI[al.lIlIllIII[49]] = "Chaos altar";
        al.lIlIlIllI[al.lIlIllIII[51]] = "Nav to altar";
        al.lIlIlIllI[al.lIlIllIII[52]] = "Unnoting bones";
        al.lIlIlIllI[al.lIlIllIII[14]] = "Elder Chaos druid";
        al.lIlIlIllI[al.lIlIllIII[53]] = "Large door";
        al.lIlIlIllI[al.lIlIllIII[54]] = "Open";
        al.lIlIlIllI[al.lIlIllIII[55]] = "Open";
        al.lIlIlIllI[al.lIlIllIII[56]] = "Open";
        al.lIlIlIllI[al.lIlIllIII[57]] = "Exchange";
        al.lIlIlIllI[al.lIlIllIII[58]] = "Exchange 5";
        al.lIlIlIllI[al.lIlIllIII[59]] = "Exchange All";
        al.lIlIlIllI[al.lIlIllIII[60]] = "Suiciding";
        al.lIlIlIllI[al.lIlIllIII[61]] = "Wine of zamorak";
        al.lIlIlIllI[al.lIlIllIII[62]] = "Take";
        al.lIlIlIllI[al.lIlIllIII[75]] = "Prayer training";
        al.lIlIlIllI[al.lIlIllIII[77]] = "ring of wealth (";
    }
}

