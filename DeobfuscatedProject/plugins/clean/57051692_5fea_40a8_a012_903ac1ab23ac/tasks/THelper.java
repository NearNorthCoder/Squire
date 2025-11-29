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
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.JHelper;
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

public class THelper
implements K {
    public static final  WorldPoint kt;
    public static final  WorldPoint ku;
    public static  boolean bn;
    public static  List<d> bp;
    
    static final  WorldPoint kx;
    static final  WorldPoint kw;
    static final  WorldPoint ky;
    public static final  WorldPoint ks;
    public static final  WorldPoint kv;
    
    private final  int kz = 536;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIlIIIllIl[2]];
                nArray[T.lIlIIIllIl[1]] = lIlIIIllIl[10];
                if (!T.lIIIlIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIlIIIllIl[2]];
                nArray2[T.lIlIIIllIl[1]] = lIlIIIllIl[10];
                if (!T.lIIIlIlIlIlII(Inventory.getFirst((int[])nArray2).getQuantity(), lIlIIIllIl[13])) break block2;
                if (!T.lIIIlIlIIlllI(Inventory.contains((int[])f.aZ) ? 1 : 0)) break block3;
                if (!T.lIIIlIlIIllII(Equipment.contains((int[])f.aZ) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIlIIIllIl[2]];
                nArray3[T.lIlIIIllIl[1]] = lIlIIIllIl[0];
                if (!T.lIIIlIlIIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lIlIIIllIl[2]];
                nArray4[T.lIlIIIllIl[1]] = lIlIIIllIl[51];
                if (!T.lIIIlIlIIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lIlIIIllIl[2];

            if (null == null) return n2 != 0;
            return false;
        }
        n2 = lIlIIIllIl[1];
        return n2 != 0;
    }

    private static boolean lIIIlIlIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    public static void dg() {
        block44: {
            TileItem var1;
            block45: {
                if (T.lIIIlIlIIllII(bn ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[1]];
                    b.a(bp);
                    if (T.lIIIlIlIIllIl(bp.size(), lIlIIIllIl[2])) {
                        System.out.println(lIlIIIllII[lIlIIIllIl[2]]);
                        bn = lIlIIIllIl[1];
                    }
                }
                if (!T.lIIIlIlIIlllI(bn ? 1 : 0) || !T.lIIIlIlIIllIl(Skills.getLevel((Skill)Skill.PRAYER), lIlIIIllIl[3])) break block44;
                if (T.lIIIlIlIIlllI(T.al() ? 1 : 0) && T.lIIIlIlIIllIl(Game.getWildyLevel(), lIlIIIllIl[2])) {
                    var1 = BankLocation.getNearest();
                    if (T.lIIIlIlIIllll(var1) && T.lIIIlIlIIlllI(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[4]];
                        a.a((BankLocation)var1);
                    }
                    if (T.lIIIlIlIIllll(var1) && T.lIIIlIlIIllII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[5]];
                        if (T.lIIIlIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIllIl[6]);

                        }
                        if (T.lIIIlIlIIllII(Bank.isOpen() ? 1 : 0)) {
                            if (T.lIIIlIlIlIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIIIllIl[7]);

                            }
                            if (T.lIIIlIlIlIIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIIIllIl[4]);

                            }
                            int[] nArray = new int[lIlIIIllIl[5]];
                            nArray[T.lIlIIIllIl[1]] = lIlIIIllIl[8];
                            nArray[T.lIlIIIllIl[2]] = lIlIIIllIl[0];
                            nArray[T.lIlIIIllIl[4]] = lIlIIIllIl[9];
                            if (T.lIIIlIlIIlllI(e.b(nArray) ? 1 : 0)) {
                                T.O();
                                System.out.println(lIlIIIllII[lIlIIIllIl[7]]);
                                bn = lIlIIIllIl[2];
                                return;
                            }
                            int[] nArray2 = new int[lIlIIIllIl[5]];
                            nArray2[T.lIlIIIllIl[1]] = lIlIIIllIl[8];
                            nArray2[T.lIlIIIllIl[2]] = lIlIIIllIl[0];
                            nArray2[T.lIlIIIllIl[4]] = lIlIIIllIl[9];
                            if (T.lIIIlIlIIllII(e.b(nArray2) ? 1 : 0)) {
                                if (T.lIIIlIlIIlllI(Equipment.contains((int[])f.aZ) ? 1 : 0)) {
                                    a.b(f.aZ, lIlIIIllIl[2]);
                                }
                                a.b(f.aU, lIlIIIllIl[2]);
                                a.a(lIlIIIllIl[10], lIlIIIllIl[11]);
                                a.b(lIlIIIllIl[0], lIlIIIllIl[12]);
                            }
                        }
                    }
                }
                if (T.lIIIlIlIIllII(T.al() ? 1 : 0)) {
                    if (T.lIIIlIlIIllII(Inventory.contains((int[])f.aU) ? 1 : 0) && T.lIIIlIlIIllIl(Movement.getRunEnergy(), lIlIIIllIl[13])) {
                        Inventory.getFirst((int[])f.aU).interact(lIlIIIllII[lIlIIIllIl[14]]);
                        Time.sleepTicks((int)lIlIIIllIl[2]);

                    }
                    if (T.lIIIlIlIIlllI(Movement.isRunEnabled() ? 1 : 0) && T.lIIIlIlIlIIIl(Movement.getRunEnergy(), lIlIIIllIl[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIlIIIllIl[14]);

                    }
                    if (T.lIIIlIlIIllIl(Game.getWildyLevel(), lIlIIIllIl[2])) {
                        AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[16]];
                        if (T.lIIIlIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (T.lIIIlIlIIlllI(Dialog.isOpen() ? 1 : 0) && T.lIIIlIlIIllII(Inventory.contains((int[])f.aZ) ? 1 : 0) && T.lIIIlIlIlIIlI(Players.getLocal().getAnimation(), lIlIIIllIl[17])) {
                            Inventory.getFirst((int[])f.aZ).interact(lIlIIIllII[lIlIIIllIl[18]]);
                            Time.sleepTicks((int)lIlIIIllIl[4]);

                        }
                        String[] stringArray = new String[lIlIIIllIl[4]];
                        stringArray[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[19]];
                        stringArray[T.lIlIIIllIl[2]] = lIlIIIllII[lIlIIIllIl[20]];
                        g.a(stringArray);
                    }
                    if (T.lIIIlIlIlIIII(Game.getWildyLevel())) {
                        TileObject var2;
                        int[] nArray = new int[lIlIIIllIl[2]];
                        nArray[T.lIlIIIllIl[1]] = lIlIIIllIl[0];
                        if (T.lIIIlIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (T.lIIIlIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                                AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[22]];
                                TileItem tileItem = new WorldPoint[lIlIIIllIl[21]];
                                tileItem[T.lIlIIIllIl[1]] = new WorldPoint(lIlIIIllIl[23], lIlIIIllIl[24], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[2]] = new WorldPoint(lIlIIIllIl[25], lIlIIIllIl[26], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[4]] = new WorldPoint(lIlIIIllIl[27], lIlIIIllIl[28], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[5]] = new WorldPoint(lIlIIIllIl[29], lIlIIIllIl[30], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[7]] = new WorldPoint(lIlIIIllIl[31], lIlIIIllIl[32], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[14]] = new WorldPoint(lIlIIIllIl[33], lIlIIIllIl[34], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[16]] = new WorldPoint(lIlIIIllIl[35], lIlIIIllIl[36], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[18]] = new WorldPoint(lIlIIIllIl[37], lIlIIIllIl[38], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[19]] = new WorldPoint(lIlIIIllIl[39], lIlIIIllIl[38], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[20]] = new WorldPoint(lIlIIIllIl[40], lIlIIIllIl[38], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[22]] = new WorldPoint(lIlIIIllIl[41], lIlIIIllIl[38], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[42]] = new WorldPoint(lIlIIIllIl[43], lIlIIIllIl[44], lIlIIIllIl[1]);
                                tileItem[T.lIlIIIllIl[45]] = new WorldPoint(lIlIIIllIl[46], lIlIIIllIl[44], lIlIIIllIl[1]);
                                var1 = tileItem;
                                Walker.walkAlong(Arrays.asList(var1), new HashMap());

                                Time.sleepTicks((int)lIlIIIllIl[2]);

                            }
                            if (T.lIIIlIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                                AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[42]];
                                String[] stringArray = new String[lIlIIIllIl[2]];
                                stringArray[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[45]];
                                var1 = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIlIIIllIl[2]];
                                stringArray2[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[21]];
                                var2 = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIlIIIllIl[2]];
                                stringArray3[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[47]];
                                if (T.lIIIlIlIIllII(var2.hasAction(stringArray3) ? 1 : 0)) {
                                    var2.interact(lIlIIIllII[lIlIIIllIl[48]]);
                                }
                                if (T.lIIIlIlIIllll(var1)) {
                                    String[] stringArray4 = new String[lIlIIIllIl[2]];
                                    stringArray4[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[49]];
                                    if (T.lIIIlIlIIlllI(var2.hasAction(stringArray4) ? 1 : 0)) {
                                        int var3 = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIlIIIllIl[2]];
                                        nArray3[T.lIlIIIllIl[1]] = lIlIIIllIl[0];
                                        String[] stringArray5 = new String[lIlIIIllIl[2]];
                                        stringArray5[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIlIIIllIl[2]);

                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lIlIIIllIl[2]];
                        nArray4[T.lIlIIIllIl[1]] = lIlIIIllIl[0];
                        if (T.lIIIlIlIIlllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIlIIIllIl[2]];
                            nArray5[T.lIlIIIllIl[1]] = lIlIIIllIl[51];
                            if (T.lIIIlIlIIllII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (T.lIIIlIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                                    AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lIlIIIllIl[21]];
                                    worldPointArray[T.lIlIIIllIl[1]] = new WorldPoint(lIlIIIllIl[23], lIlIIIllIl[24], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[2]] = new WorldPoint(lIlIIIllIl[25], lIlIIIllIl[26], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[4]] = new WorldPoint(lIlIIIllIl[27], lIlIIIllIl[28], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[5]] = new WorldPoint(lIlIIIllIl[29], lIlIIIllIl[30], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[7]] = new WorldPoint(lIlIIIllIl[31], lIlIIIllIl[32], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[14]] = new WorldPoint(lIlIIIllIl[33], lIlIIIllIl[34], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[16]] = new WorldPoint(lIlIIIllIl[35], lIlIIIllIl[36], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[18]] = new WorldPoint(lIlIIIllIl[37], lIlIIIllIl[38], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[19]] = new WorldPoint(lIlIIIllIl[39], lIlIIIllIl[38], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[20]] = new WorldPoint(lIlIIIllIl[40], lIlIIIllIl[38], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[22]] = new WorldPoint(lIlIIIllIl[41], lIlIIIllIl[38], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[42]] = new WorldPoint(lIlIIIllIl[43], lIlIIIllIl[44], lIlIIIllIl[1]);
                                    worldPointArray[T.lIlIIIllIl[45]] = new WorldPoint(lIlIIIllIl[46], lIlIIIllIl[44], lIlIIIllIl[1]);
                                    var1 = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(var1), new HashMap());

                                    Time.sleepTicks((int)lIlIIIllIl[2]);

                                }
                                if (T.lIIIlIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                                    AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[53]];
                                    if (!T.lIIIlIlIIlllI(Dialog.canLevelUpContinue() ? 1 : 0) || T.lIIIlIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIlIIIllIl[2]];
                                    stringArray[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[15]];
                                    var1 = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIlIIIllIl[2]];
                                    stringArray6[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[54]];
                                    var2 = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIlIIIllIl[2]];
                                    stringArray7[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[55]];
                                    if (T.lIIIlIlIIllII(var2.hasAction(stringArray7) ? 1 : 0)) {
                                        var2.interact(lIlIIIllII[lIlIIIllIl[56]]);
                                    }
                                    if (T.lIIIlIlIIllll(var1)) {
                                        String[] stringArray8 = new String[lIlIIIllIl[2]];
                                        stringArray8[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[57]];
                                        if (T.lIIIlIlIIlllI(var2.hasAction(stringArray8) ? 1 : 0)) {
                                            List var3;
                                            if (T.lIIIlIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIlIIIllIl[2]];
                                                nArray6[T.lIlIIIllIl[1]] = lIlIIIllIl[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)var1);
                                                Time.sleepTicks((int)lIlIIIllIl[4]);

                                            }
                                            if (T.lIIIlIlIIllII(Dialog.isOpen() ? 1 : 0) && T.lIIIlIlIIlllI((var3 = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int var4 = lIlIIIllIl[1];
                                                while (T.lIIIlIlIIllIl(var4, var3.size())) {
                                                    int[] nArray7 = new int[lIlIIIllIl[2]];
                                                    nArray7[T.lIlIIIllIl[1]] = lIlIIIllIl[51];
                                                    if (T.lIIIlIlIlIIlI(((Item)Inventory.getAll((int[])nArray7).get(lIlIIIllIl[1])).getQuantity(), lIlIIIllIl[2]) && T.lIIIlIlIIllII(((Widget)var3.get(var4)).getText().contains(lIlIIIllII[lIlIIIllIl[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var3.get(var4)).getClickPoint().getX(), (int)((Widget)var3.get(var4)).getClickPoint().getY(), (boolean)lIlIIIllIl[2]);
                                                        Time.sleepTicks((int)lIlIIIllIl[4]);

                                                    }
                                                    int[] nArray8 = new int[lIlIIIllIl[2]];
                                                    nArray8[T.lIlIIIllIl[1]] = lIlIIIllIl[51];
                                                    if (T.lIIIlIlIlIIlI(((Item)Inventory.getAll((int[])nArray8).get(lIlIIIllIl[1])).getQuantity(), lIlIIIllIl[14]) && T.lIIIlIlIIllII(((Widget)var3.get(var4)).getText().contains(lIlIIIllII[lIlIIIllIl[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var3.get(var4)).getClickPoint().getX(), (int)((Widget)var3.get(var4)).getClickPoint().getY(), (boolean)lIlIIIllIl[2]);
                                                        Time.sleepTicks((int)lIlIIIllIl[4]);

                                                    }
                                                    if (T.lIIIlIlIIllII(((Widget)var3.get(var4)).getText().contains(lIlIIIllII[lIlIIIllIl[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)var3.get(var4)).getClickPoint().getX(), (int)((Widget)var3.get(var4)).getClickPoint().getY(), (boolean)lIlIIIllIl[2]);
                                                        Time.sleepTicks((int)lIlIIIllIl[4]);

                                                    }
                                                    ++var4;

                                                    if ((0x26 ^ 0x22) <= (0xA8 ^ 0xAC)) continue;
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
                int[] nArray = new int[lIlIIIllIl[2]];
                nArray[T.lIlIIIllIl[1]] = lIlIIIllIl[10];
                if (!T.lIIIlIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lIlIIIllIl[2]];
                nArray9[T.lIlIIIllIl[1]] = lIlIIIllIl[0];
                if (!T.lIIIlIlIIlllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lIlIIIllIl[2]];
                nArray10[T.lIlIIIllIl[1]] = lIlIIIllIl[51];
                if (!T.lIIIlIlIIlllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (T.lIIIlIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[61]];
                String[] stringArray = new String[lIlIIIllIl[2]];
                stringArray[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[62]];
                var1 = TileItems.getNearest((String[])stringArray);
                if (T.lIIIlIlIIllll(var1)) {
                    var1.interact(lIlIIIllII[lIlIIIllIl[63]]);
                }
            }
        }
    }

    private static int dh() {
        int n2 = lIlIIIllIl[70];
        if (T.lIIIlIlIIllIl(Skills.getLevel((Skill)Skill.PRAYER), lIlIIIllIl[71]) && T.lIIIlIlIlIlII(Skills.getLevel((Skill)Skill.PRAYER), lIlIIIllIl[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lIlIIIllIl[72] + lIlIIIllIl[22];
        }
        int n3 = lIlIIIllIl[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lIlIIIllIl[72] + lIlIIIllIl[63];
    }

    @Override
    public int ad() {
        try {
            T.dg();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-(0x9D ^ 0x98) >= 0) {
            return (0xAA ^ 0x84) & ~(0x8D ^ 0xA3);
        }
        return lIlIIIllIl[74];
    }

    @Override
    public String ae() {
        return lIlIIIllII[lIlIIIllIl[75]];
    }

        return String.valueOf(var5);
    }

    private static boolean lIIIlIlIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ac() {
        return lIlIIIllIl[1];
    }

    private static boolean lIIIlIlIIlllI(int n2) {
        return n2 == 0;
    }

    static {
        T.lIIIlIlIIlIll();
        T.lIIIlIlIIlIlI();
        ks = new WorldPoint(lIlIIIllIl[77], lIlIIIllIl[78], lIlIIIllIl[1]);
        kt = new WorldPoint(lIlIIIllIl[79], lIlIIIllIl[80], lIlIIIllIl[1]);
        ku = new WorldPoint(lIlIIIllIl[81], lIlIIIllIl[82], lIlIIIllIl[1]);
        kv = new WorldPoint(lIlIIIllIl[83], lIlIIIllIl[44], lIlIIIllIl[1]);
        kw = new WorldPoint(lIlIIIllIl[1], lIlIIIllIl[1], lIlIIIllIl[1]);
        kx = new WorldPoint(lIlIIIllIl[1], lIlIIIllIl[1], lIlIIIllIl[1]);
        ky = new WorldPoint(lIlIIIllIl[84], lIlIIIllIl[85], lIlIIIllIl[1]);
        bp = new ArrayList<d>();
    }

    private static boolean lIIIlIlIIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIlIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIlIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIlIIlIlI() {
        lIlIIIllII = new String[lIlIIIllIl[86]];
        T.lIlIIIllII[T.lIlIIIllIl[1]] = "Buying items";
        T.lIlIIIllII[T.lIlIIIllIl[2]] = "Finished buying items, switching back to prayer";
        T.lIlIIIllII[T.lIlIIIllIl[4]] = "Navigating to bank";
        T.lIlIIIllII[T.lIlIIIllIl[5]] = "Handling banking";
        T.lIlIIIllII[T.lIlIIIllIl[7]] = "We are missing prayer supplies, switching to BUYING";
        T.lIlIIIllII[T.lIlIIIllIl[14]] = "Drink";
        T.lIlIIIllII[T.lIlIIIllIl[16]] = "Tele to wildy";
        T.lIlIIIllII[T.lIlIIIllIl[18]] = "Rub";
        T.lIlIIIllII[T.lIlIIIllIl[19]] = "Lava Maze";
        T.lIlIIIllII[T.lIlIIIllIl[20]] = "Okay, teleport to level 41 Wilderness.";
        T.lIlIIIllII[T.lIlIIIllIl[22]] = "Nav to altar";
        T.lIlIIIllII[T.lIlIIIllIl[42]] = "1 tick pray";
        T.lIlIIIllII[T.lIlIIIllIl[45]] = "Chaos altar";
        T.lIlIIIllII[T.lIlIIIllIl[21]] = "Large door";
        T.lIlIIIllII[T.lIlIIIllIl[47]] = "Open";
        T.lIlIIIllII[T.lIlIIIllIl[48]] = "Open";
        T.lIlIIIllII[T.lIlIIIllIl[49]] = "Open";
        T.lIlIIIllII[T.lIlIIIllIl[50]] = "Chaos altar";
        T.lIlIIIllII[T.lIlIIIllIl[52]] = "Nav to altar";
        T.lIlIIIllII[T.lIlIIIllIl[53]] = "Unnoting bones";
        T.lIlIIIllII[T.lIlIIIllIl[15]] = "Elder Chaos druid";
        T.lIlIIIllII[T.lIlIIIllIl[54]] = "Large door";
        T.lIlIIIllII[T.lIlIIIllIl[55]] = "Open";
        T.lIlIIIllII[T.lIlIIIllIl[56]] = "Open";
        T.lIlIIIllII[T.lIlIIIllIl[57]] = "Open";
        T.lIlIIIllII[T.lIlIIIllIl[58]] = "Exchange";
        T.lIlIIIllII[T.lIlIIIllIl[59]] = "Exchange 5";
        T.lIlIIIllII[T.lIlIIIllIl[60]] = "Exchange All";
        T.lIlIIIllII[T.lIlIIIllIl[61]] = "Suiciding";
        T.lIlIIIllII[T.lIlIIIllIl[62]] = "Wine of zamorak";
        T.lIlIIIllII[T.lIlIIIllIl[63]] = "Take";
        T.lIlIIIllII[T.lIlIIIllIl[75]] = "Prayer training";
        T.lIlIIIllII[T.lIlIIIllIl[76]] = "ring of wealth (";
    }

    private static boolean lIIIlIlIlIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlIlIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIlIlIIllll(Object object) {
        return object != null;
    }

    private static void O() {
        d var6;
        Object var7;
        int[] nArray = new int[lIlIIIllIl[2]];
        nArray[T.lIlIIIllIl[1]] = lIlIIIllIl[9];
        if (T.lIIIlIlIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIlIIIllIl[9], lIlIIIllIl[14], j.bZ);
            bp.add(d2);

        }
        int[] nArray2 = new int[lIlIIIllIl[2]];
        nArray2[T.lIlIIIllIl[1]] = lIlIIIllIl[0];
        if (T.lIIIlIlIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var7 = new DHelper(lIlIIIllIl[0], T.dh(), lIlIIIllIl[64]);
            bp.add((DHelper) ar7);

        }
        int[] nArray3 = new int[lIlIIIllIl[2]];
        nArray3[T.lIlIIIllIl[1]] = lIlIIIllIl[8];
        if (T.lIIIlIlIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var7 = new DHelper(lIlIIIllIl[8], lIlIIIllIl[4], lIlIIIllIl[6]);
            bp.add((DHelper) ar7);

        }
        if (T.lIIIlIlIIlllI(Bank.contains((Predicate)(var7 = item -> item.getName().toLowerCase().contains(lIlIIIllII[lIlIIIllIl[76]]))) ? 1 : 0)) {
            var6 = new DHelper(lIlIIIllIl[65], lIlIIIllIl[14], lIlIIIllIl[66]);
            bp.add(var6);

        }
        int[] nArray4 = new int[lIlIIIllIl[2]];
        nArray4[T.lIlIIIllIl[1]] = lIlIIIllIl[67];
        if (T.lIIIlIlIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var6 = new DHelper(lIlIIIllIl[67], lIlIIIllIl[68], lIlIIIllIl[69]);
            bp.add(var6);

        }
    }

    @Override
    public boolean af() {
        boolean bl;
        if (T.lIIIlIlIlIlII(Skills.getLevel((Skill)Skill.PRAYER), lIlIIIllIl[3])) {
            bl = lIlIIIllIl[2];

            if (-(0x63 ^ 0x48 ^ (0x1F ^ 0x30)) > 0) {
                return ((0x24 ^ 0x40 ^ (0x95 ^ 0xB3)) & (0x5C ^ 0x14 ^ (0xA4 ^ 0xAE) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIIllIl[1];
        }
        return bl;
    }

    public THelper() {
        this.kz = lIlIIIllIl[0];
    }
}

