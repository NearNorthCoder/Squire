/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.account.LocalPlayer
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ASHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class ARHelper
implements ac {
    public static  int mT;
    static  long nS;
    static  int cG;
    public static  WorldPoint nI;
    public static  String nN;
    public static  int mV;
    
    static  WorldArea nO;
    static  WorldPoint nP;
    
    public static  WorldArea nM;
    public static  boolean bt;
    public static  WorldArea nL;
    static  WorldPoint nR;
    public static  int mU;
    static  WorldPoint nQ;
    public static  int nK;
    public static  int nJ;
    public static  WorldArea nH;
    public static  List<d> bv;

    private static boolean lIlIlIlllIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIlIllIlIIl(int n2) {
        return n2 != 0;
    }

    public static void b(int[] nArray) {
        if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0) && ar.lIlIlIllIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] var1;
            String[] stringArray = new String[llIIlIllIl[1]];
            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[200]];
            if (ar.lIlIlIllIlIIl(Inventory.getFirst((int[])nArray).hasAction(stringArray) ? 1 : 0)) {
                Inventory.getFirst((int[])nArray).interact(llIIlIlIlI[llIIlIllIl[201]]);
            }
            String[] stringArray2 = new String[llIIlIllIl[1]];
            stringArray2[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[202]];
            if (ar.lIlIlIllIlIIl(Inventory.getFirst((int[])var1).hasAction(stringArray2) ? 1 : 0)) {
                Inventory.getFirst((int[])var1).interact(llIIlIlIlI[llIIlIllIl[203]]);
            }
            String[] stringArray3 = new String[llIIlIllIl[1]];
            stringArray3[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[204]];
            if (ar.lIlIlIllIlIIl(Inventory.getFirst((int[])var1).hasAction(stringArray3) ? 1 : 0)) {
                Inventory.getFirst((int[])var1).interact(llIIlIlIlI[llIIlIllIl[205]]);
            }
        }
    }

    private static boolean lIlIlIlllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static List<WorldPoint> a(as as2) {
        void var1_1;
        as var2;
        ArrayList<WorldPoint> var3 = new ArrayList<WorldPoint>();
        while (ar.lIlIlIllIlllI(var2)) {
            var3.add(var2.nT);

            var2 = var2.nU;

            if (1 >= 0) continue;
            return null;
        }
        Collections.reverse(var1_1);
        return var1_1;
    }

    @Override
    public int af() {
        try {
            ar.gb();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 == 0) {
            return (0x62 ^ 0x67 ^ (0x31 ^ 0xF)) & (4 ^ 0x3F ^ (0x19 ^ 2) & ~(0x25 ^ 0x3E) ^ -1);
        }
        return llIIlIllIl[13];
    }

    public static void gc() {
        Object var4;
        block117: {
            Object var5;
            block118: {
                Object var6;
                Object var7;
                block120: {
                    block119: {
                        block114: {
                            block116: {
                                block115: {
                                    block111: {
                                        block113: {
                                            block112: {
                                                block106: {
                                                    block110: {
                                                        block109: {
                                                            block108: {
                                                                block107: {
                                                                    Object var8;
                                                                    block105: {
                                                                        block104: {
                                                                            String[] stringArray = new String[llIIlIllIl[1]];
                                                                            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[52]];
                                                                            g.a(stringArray);
                                                                            TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
                                                                                String[] stringArray = new String[llIIlIllIl[1]];
                                                                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[271]];
                                                                                return tileObject.hasAction(stringArray);
                                                                            });
                                                                            TileObject tileObject3 = TileObjects.getNearest(tileObject -> {
                                                                                String[] stringArray = new String[llIIlIllIl[1]];
                                                                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[270]];
                                                                                return tileObject.hasAction(stringArray);
                                                                            });
                                                                            if (ar.lIlIlIllIlllI(Widgets.get((int)llIIlIllIl[34], (int)llIIlIllIl[24])) && ar.lIlIlIllIlllI(tileObject2) && ar.lIlIlIllIlllI(tileObject3) && ar.lIlIlIllIlIlI(tileObject2.distanceTo((Locatable)tileObject3), llIIlIllIl[16]) && ar.lIlIlIllIlIlI(mV, llIIlIllIl[14])) {
                                                                                nR = null;
                                                                                cG = llIIlIllIl[0];
                                                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[53]];
                                                                                Widget widget = Widgets.get((int)llIIlIllIl[34], (int)llIIlIllIl[24]);
                                                                                if (ar.lIlIlIllIlllI(widget)) {
                                                                                    Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), (boolean)llIIlIllIl[1]);
                                                                                    Time.sleepUntil(() -> {
                                                                                        boolean bl;
                                                                                        if (ar.lIlIlIllIllll(Widgets.fromId((int)llIIlIllIl[269]))) {
                                                                                            bl = llIIlIllIl[1];

                                                                                            }
                                                                                        } else {
                                                                                            bl = llIIlIllIl[0];
                                                                                        }
                                                                                        return bl;
                                                                                    }, (int)llIIlIllIl[54], (int)llIIlIllIl[55]);

                                                                                    mV += llIIlIllIl[1];
                                                                                }
                                                                                if (ar.lIlIlIlllIIII(ar.lIlIlIlllIIlI(System.currentTimeMillis(), nS + 30000L))) {
                                                                                    mV = llIIlIllIl[0];
                                                                                }
                                                                            }
                                                                            String[] stringArray2 = new String[llIIlIllIl[1]];
                                                                            stringArray2[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[56]];
                                                                            if (!ar.lIlIlIllIllll(NPCs.getNearest((String[])stringArray2))) break block104;
                                                                            String[] stringArray3 = new String[llIIlIllIl[1]];
                                                                            stringArray3[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[57]];
                                                                            if (!ar.lIlIlIllIllll(NPCs.getNearest((String[])stringArray3))) break block104;
                                                                            String[] stringArray4 = new String[llIIlIllIl[1]];
                                                                            stringArray4[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[58]];
                                                                            if (!ar.lIlIlIllIllll(NPCs.getNearest((String[])stringArray4))) break block104;
                                                                            String[] stringArray5 = new String[llIIlIllIl[1]];
                                                                            stringArray5[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[59]];
                                                                            if (!ar.lIlIlIllIllll(NPCs.getNearest((String[])stringArray5))) break block104;
                                                                            String[] stringArray6 = new String[llIIlIllIl[1]];
                                                                            stringArray6[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[60]];
                                                                            if (!ar.lIlIlIllIllll(NPCs.getNearest((String[])stringArray6))) break block104;
                                                                            String[] stringArray7 = new String[llIIlIllIl[1]];
                                                                            stringArray7[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[61]];
                                                                            if (ar.lIlIlIllIllll(NPCs.getNearest((String[])stringArray7)) && (!ar.lIlIlIllIllll(TileObjects.getNearest(tileObject -> tileObject.getName().contains(llIIlIlIlI[llIIlIllIl[268]]))) || !ar.lIlIlIllIllll(TileObjects.getNearest(tileObject -> tileObject.getName().contains(llIIlIlIlI[llIIlIllIl[267]]))))) break block105;
                                                                        }
                                                                        if (ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIlIllIl[27])) {
                                                                            String[] stringArray = new String[llIIlIllIl[1]];
                                                                            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[62]];
                                                                            if (ar.lIlIlIllIllll(TileObjects.getNearest((String[])stringArray))) {
                                                                                nR = null;
                                                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[63]];
                                                                                var8 = tileObject -> {
                                                                                    String[] stringArray = new String[llIIlIllIl[1]];
                                                                                    stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[266]];
                                                                                    return tileObject.hasAction(stringArray);
                                                                                };
                                                                                var4 = TileObjects.getNearest((Predicate)var8);
                                                                                if (ar.lIlIlIllIlllI(var4)) {
                                                                                    var4.interact(llIIlIlIlI[llIIlIllIl[64]]);
                                                                                    Time.sleepUntil(() -> {
                                                                                        boolean bl;
                                                                                        if (ar.lIlIlIllIlIll(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                            bl = llIIlIllIl[1];

                                                                                            }
                                                                                        } else {
                                                                                            bl = llIIlIllIl[0];
                                                                                        }
                                                                                        return bl;
                                                                                    }, (int)Rand.nextInt((int)llIIlIllIl[65], (int)llIIlIllIl[66]));

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    String[] stringArray = new String[llIIlIllIl[1]];
                                                                    stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[67]];
                                                                    if (ar.lIlIlIllIlllI(NPCs.getNearest((String[])stringArray)) && ar.lIlIlIllIlIll(nH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(nI), llIIlIllIl[68])) {
                                                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[69]];
                                                                        var8 = tileObject -> {
                                                                            String[] stringArray = new String[llIIlIllIl[1]];
                                                                            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[265]];
                                                                            return tileObject.hasAction(stringArray);
                                                                        };
                                                                        var4 = TileObjects.getNearest((Predicate)var8);
                                                                        if (ar.lIlIlIllIlllI(var4)) {
                                                                            var4.interact(llIIlIlIlI[llIIlIllIl[70]]);
                                                                            Time.sleepUntil(() -> {
                                                                                boolean bl;
                                                                                if (ar.lIlIlIllIlIll(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                    bl = llIIlIllIl[1];

                                                                                    if (1 < 1) {
                                                                                        return false;
                                                                                    }
                                                                                } else {
                                                                                    bl = llIIlIllIl[0];
                                                                                }
                                                                                return bl;
                                                                            }, (int)Rand.nextInt((int)llIIlIllIl[65], (int)llIIlIllIl[66]));

                                                                        }
                                                                    }
                                                                    var8 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(llIIlIlIlI[llIIlIllIl[264]]));
                                                                    String[] stringArray8 = new String[llIIlIllIl[1]];
                                                                    stringArray8[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[71]];
                                                                    if (!ar.lIlIlIllIlllI(TileObjects.getNearest((String[])stringArray8))) break block106;
                                                                    nR = null;
                                                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[27]];
                                                                    String[] stringArray9 = new String[llIIlIllIl[1]];
                                                                    stringArray9[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[72]];
                                                                    if (ar.lIlIlIllIllll(TileObjects.getNearest((String[])stringArray9))) {
                                                                        String[] stringArray10 = new String[llIIlIllIl[1]];
                                                                        stringArray10[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[73]];
                                                                        var4 = TileItems.getNearest((String[])stringArray10);
                                                                        if (ar.lIlIlIllIlllI(var4)) {
                                                                            var4.interact(llIIlIlIlI[llIIlIllIl[74]]);
                                                                            Time.sleepTicks((int)llIIlIllIl[1]);

                                                                        }
                                                                        if (ar.lIlIlIllIlllI(var5 = TileItems.getNearest(tileItem -> tileItem.getName().contains(llIIlIlIlI[llIIlIllIl[263]])))) {
                                                                            // empty if block
                                                                        }
                                                                        String[] stringArray11 = new String[llIIlIllIl[1]];
                                                                        stringArray11[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[75]];
                                                                        var7 = NPCs.getNearest((String[])stringArray11);
                                                                        if (ar.lIlIlIllIlllI(var7) && ar.lIlIlIlllIlII(LocalPlayer.get().getInteracting(), var7) && ar.lIlIlIllIlIll(var7.isDead() ? 1 : 0) && ar.lIlIlIllIlIIl(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
                                                                            var7.interact(llIIlIlIlI[llIIlIllIl[76]]);
                                                                        }
                                                                    }
                                                                    String[] stringArray12 = new String[llIIlIllIl[1]];
                                                                    stringArray12[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[77]];
                                                                    if (!ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) break block107;
                                                                    String[] stringArray13 = new String[llIIlIllIl[1]];
                                                                    stringArray13[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[78]];
                                                                    if (!ar.lIlIlIllIlIlI(Inventory.getAll((String[])stringArray13).size(), llIIlIllIl[10])) break block108;
                                                                }
                                                                String[] stringArray = new String[llIIlIllIl[1]];
                                                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[79]];
                                                                if (ar.lIlIlIllIlllI(TileObjects.getNearest((String[])stringArray)) && ar.lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                                                    String[] stringArray14 = new String[llIIlIllIl[1]];
                                                                    stringArray14[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[81]];
                                                                    TileObjects.getNearest((String[])stringArray14).interact(llIIlIlIlI[llIIlIllIl[68]]);
                                                                    Time.sleepTicks((int)llIIlIllIl[2]);

                                                                }
                                                            }
                                                            String[] stringArray = new String[llIIlIllIl[1]];
                                                            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[82]];
                                                            if (!ar.lIlIlIllIlIlI(Inventory.getAll((String[])stringArray).size(), llIIlIllIl[10])) break block109;
                                                            String[] stringArray15 = new String[llIIlIllIl[1]];
                                                            stringArray15[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[83]];
                                                            if (!ar.lIlIlIlllIIIl(Inventory.getAll((String[])stringArray15).size(), llIIlIllIl[10])) break block110;
                                                        }
                                                        String[] stringArray = new String[llIIlIllIl[1]];
                                                        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[84]];
                                                        if (ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && ar.lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                                            String[] stringArray16 = new String[llIIlIllIl[1]];
                                                            stringArray16[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[85]];
                                                            String[] stringArray17 = new String[llIIlIllIl[1]];
                                                            stringArray17[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[86]];
                                                            Inventory.getFirst((String[])stringArray16).useOn(TileObjects.getNearest((String[])stringArray17));
                                                            Time.sleepTicks((int)llIIlIllIl[2]);

                                                        }
                                                        String[] stringArray18 = new String[llIIlIllIl[1]];
                                                        stringArray18[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[87]];
                                                        if (ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray18) ? 1 : 0) && ar.lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                                            String[] stringArray19 = new String[llIIlIllIl[1]];
                                                            stringArray19[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[88]];
                                                            String[] stringArray20 = new String[llIIlIllIl[1]];
                                                            stringArray20[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[89]];
                                                            Inventory.getFirst((String[])stringArray19).useOn(TileObjects.getNearest((String[])stringArray20));
                                                            Time.sleepTicks((int)llIIlIllIl[2]);

                                                        }
                                                    }
                                                    String[] stringArray = new String[llIIlIllIl[1]];
                                                    stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[90]];
                                                    g.a(stringArray);
                                                }
                                                String[] stringArray = new String[llIIlIllIl[1]];
                                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[91]];
                                                if (!ar.lIlIlIllIlllI(TileObjects.getNearest((String[])stringArray))) break block111;
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[92]];
                                                String[] stringArray21 = new String[llIIlIllIl[1]];
                                                stringArray21[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[93]];
                                                if (ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray21) ? 1 : 0) && ar.lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                                    String[] stringArray22 = new String[llIIlIllIl[1]];
                                                    stringArray22[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[94]];
                                                    if (ar.lIlIlIllIlllI(TileObjects.getNearest((String[])stringArray22))) {
                                                        String[] stringArray23 = new String[llIIlIllIl[1]];
                                                        stringArray23[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[95]];
                                                        TileObjects.getNearest((String[])stringArray23).interact(llIIlIlIlI[llIIlIllIl[96]]);
                                                        Time.sleepTicks((int)llIIlIllIl[2]);

                                                    }
                                                }
                                                String[] stringArray24 = new String[llIIlIllIl[1]];
                                                stringArray24[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[97]];
                                                if (!ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray24) ? 1 : 0)) break block112;
                                                String[] stringArray25 = new String[llIIlIllIl[1]];
                                                stringArray25[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[98]];
                                                if (!ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray25) ? 1 : 0)) break block113;
                                            }
                                            String[] stringArray = new String[llIIlIllIl[1]];
                                            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[99]];
                                            if (ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && ar.lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                                String[] stringArray26 = new String[llIIlIllIl[1]];
                                                stringArray26[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[100]];
                                                String[] stringArray27 = new String[llIIlIllIl[1]];
                                                stringArray27[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[101]];
                                                Inventory.getFirst((String[])stringArray26).useOn(TileObjects.getNearest((String[])stringArray27));
                                                Time.sleepTicks((int)llIIlIllIl[2]);

                                            }
                                            String[] stringArray28 = new String[llIIlIllIl[1]];
                                            stringArray28[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[102]];
                                            if (ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray28) ? 1 : 0) && ar.lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                                String[] stringArray29 = new String[llIIlIllIl[1]];
                                                stringArray29[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[103]];
                                                String[] stringArray30 = new String[llIIlIllIl[1]];
                                                stringArray30[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[104]];
                                                Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((String[])stringArray30));
                                                Time.sleepTicks((int)llIIlIllIl[2]);

                                            }
                                            String[] stringArray31 = new String[llIIlIllIl[1]];
                                            stringArray31[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[105]];
                                            TileObjects.getNearest((String[])stringArray31).interact(llIIlIlIlI[llIIlIllIl[106]]);
                                            Time.sleepTicks((int)llIIlIllIl[2]);

                                        }
                                        String[] stringArray = new String[llIIlIllIl[1]];
                                        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[107]];
                                        g.a(stringArray);
                                    }
                                    String[] stringArray = new String[llIIlIllIl[1]];
                                    stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[108]];
                                    if (!ar.lIlIlIllIlllI(TileObjects.getNearest((String[])stringArray))) break block114;
                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[109]];
                                    String[] stringArray32 = new String[llIIlIllIl[1]];
                                    stringArray32[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[110]];
                                    if (ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray32) ? 1 : 0) && ar.lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                        String[] stringArray33 = new String[llIIlIllIl[1]];
                                        stringArray33[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[111]];
                                        if (ar.lIlIlIllIlllI(TileObjects.getNearest((String[])stringArray33))) {
                                            String[] stringArray34 = new String[llIIlIllIl[1]];
                                            stringArray34[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[112]];
                                            TileObjects.getNearest((String[])stringArray34).interact(llIIlIlIlI[llIIlIllIl[113]]);
                                            Time.sleepTicks((int)llIIlIllIl[2]);

                                        }
                                    }
                                    String[] stringArray35 = new String[llIIlIllIl[1]];
                                    stringArray35[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[114]];
                                    if (!ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray35) ? 1 : 0)) break block115;
                                    String[] stringArray36 = new String[llIIlIllIl[1]];
                                    stringArray36[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[115]];
                                    if (!ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray36) ? 1 : 0)) break block116;
                                }
                                String[] stringArray = new String[llIIlIllIl[1]];
                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[116]];
                                if (ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && ar.lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                    String[] stringArray37 = new String[llIIlIllIl[1]];
                                    stringArray37[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[117]];
                                    String[] stringArray38 = new String[llIIlIllIl[1]];
                                    stringArray38[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[118]];
                                    Inventory.getFirst((String[])stringArray37).useOn(TileObjects.getNearest((String[])stringArray38));
                                    Time.sleepTicks((int)llIIlIllIl[2]);

                                }
                                String[] stringArray39 = new String[llIIlIllIl[1]];
                                stringArray39[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[119]];
                                if (ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray39) ? 1 : 0) && ar.lIlIlIlllIlIl(Players.getLocal().getAnimation(), llIIlIllIl[80])) {
                                    String[] stringArray40 = new String[llIIlIllIl[1]];
                                    stringArray40[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[120]];
                                    String[] stringArray41 = new String[llIIlIllIl[1]];
                                    stringArray41[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[13]];
                                    Inventory.getFirst((String[])stringArray40).useOn(TileObjects.getNearest((String[])stringArray41));
                                    Time.sleepTicks((int)llIIlIllIl[2]);

                                }
                                String[] stringArray42 = new String[llIIlIllIl[1]];
                                stringArray42[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[121]];
                                TileObjects.getNearest((String[])stringArray42).interact(llIIlIlIlI[llIIlIllIl[122]]);
                                Time.sleepTicks((int)llIIlIllIl[2]);

                            }
                            String[] stringArray = new String[llIIlIllIl[1]];
                            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[123]];
                            g.a(stringArray);
                        }
                        String[] stringArray = new String[llIIlIllIl[1]];
                        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[124]];
                        if (ar.lIlIlIllIlllI(TileObjects.getNearest((String[])stringArray))) {
                            String[] stringArray43 = new String[llIIlIllIl[1]];
                            stringArray43[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[125]];
                            var4 = TileObjects.getAll((String[])stringArray43);
                            var5 = var4.stream().filter(tileObject -> {
                                String[] stringArray = new String[llIIlIllIl[1]];
                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[262]];
                                return tileObject.hasAction(stringArray);
                            }).collect(Collectors.toList());
                            var7 = null;
                            var6 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                String[] stringArray = new String[llIIlIllIl[1]];
                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[260]];
                                if (ar.lIlIlIllIlIIl(tileObject.hasAction(stringArray) ? 1 : 0) && ar.lIlIlIllIlIIl(tileObject.getName().equals(llIIlIlIlI[llIIlIllIl[261]]) ? 1 : 0)) {
                                    n2 = llIIlIllIl[1];

                                    if (((0xD0 ^ 0x9C ^ 3) & (132 + 49 - -5 + 61 ^ 160 + 142 - 146 + 28 ^ -1)) < -1) {
                                        return ((0x40 ^ 0x47 ^ (0x5A ^ 0x75)) & (149 + 70 - 155 + 115 ^ 22 + 22 - -16 + 95 ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = llIIlIllIl[0];
                                }
                                return n2 != 0;
                            });
                            if (ar.lIlIlIllIlllI(var6)) {
                                if (ar.lIlIlIlllIIIl(Players.getLocal().getWorldX(), var6.getWorldX())) {
                                    var7 = TileObjects.getNearest(tileObject -> {
                                        String[] stringArray = new String[llIIlIllIl[1]];
                                        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[259]];
                                        return tileObject.hasAction(stringArray);
                                    });
                                    if (ar.lIlIlIllIlllI(var7)) {
                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[126]];
                                        var7.interact(llIIlIlIlI[llIIlIllIl[127]]);
                                        Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[14]));

                                        if (((0x7F ^ 0x3C ^ (0x9E ^ 0x82)) & (0x27 ^ 0x44 ^ (0x8A ^ 0xB6) ^ -1)) != 0) {
                                            return;
                                        }
                                    }
                                } else {
                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[128]];
                                    var6.interact(llIIlIlIlI[llIIlIllIl[129]]);
                                    Time.sleepTicks((int)llIIlIllIl[11]);

                                }
                            }
                        }
                        String[] stringArray44 = new String[llIIlIllIl[1]];
                        stringArray44[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[130]];
                        if (!ar.lIlIlIllIlllI(TileObjects.getNearest((String[])stringArray44))) break block117;
                        nR = null;
                        String[] stringArray45 = new String[llIIlIllIl[1]];
                        stringArray45[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[131]];
                        var4 = TileObjects.getAll((String[])stringArray45);
                        var5 = var4.stream().filter(tileObject -> {
                            String[] stringArray = new String[llIIlIllIl[1]];
                            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[258]];
                            return tileObject.hasAction(stringArray);
                        }).collect(Collectors.toList());
                        if (!ar.lIlIlIllIlIll(var5.isEmpty() ? 1 : 0)) break block117;
                        if (!ar.lIlIlIllIlIll(Reachable.isInteractable((Locatable)((Locatable)var5.get(llIIlIllIl[0]))) ? 1 : 0)) break block118;
                        String[] stringArray46 = new String[llIIlIllIl[1]];
                        stringArray46[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[132]];
                        if (!ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray46) ? 1 : 0)) break block119;
                        String[] stringArray47 = new String[llIIlIllIl[1]];
                        stringArray47[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[133]];
                        if (!ar.lIlIlIllIlIlI(Inventory.getAll((String[])stringArray47).size(), llIIlIllIl[10])) break block120;
                    }
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[134]];
                    String[] stringArray = new String[llIIlIllIl[1]];
                    stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[135]];
                    var7 = TileObjects.getAll((String[])stringArray);
                    var6 = var7.stream().filter(tileObject -> {
                        String[] stringArray = new String[llIIlIllIl[1]];
                        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[257]];
                        return tileObject.hasAction(stringArray);
                    }).collect(Collectors.toList());
                    if (ar.lIlIlIllIlIll(var6.isEmpty() ? 1 : 0)) {
                        ((TileObject)var6.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[136]]);
                        Time.sleepTicks((int)llIIlIllIl[2]);

                    }
                }
                String[] stringArray = new String[llIIlIllIl[1]];
                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[137]];
                if (ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray48 = new String[llIIlIllIl[1]];
                    stringArray48[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[138]];
                    if (ar.lIlIlIlllIIIl(Inventory.getAll((String[])stringArray48).size(), llIIlIllIl[10])) {
                        String[] stringArray49 = new String[llIIlIllIl[1]];
                        stringArray49[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[139]];
                        String[] stringArray50 = new String[llIIlIllIl[1]];
                        stringArray50[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[140]];
                        Inventory.getFirst((String[])stringArray49).useOn((Item)Inventory.getAll((String[])stringArray50).get(llIIlIllIl[1]));
                    }
                }
                String[] stringArray51 = new String[llIIlIllIl[1]];
                stringArray51[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[141]];
                if (ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray51) ? 1 : 0)) {
                    String[] stringArray52 = new String[llIIlIllIl[1]];
                    stringArray52[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[142]];
                    int[] nArray = new int[llIIlIllIl[1]];
                    nArray[ar.llIIlIllIl[0]] = llIIlIllIl[143];
                    Inventory.getFirst((String[])stringArray52).useOn(TileObjects.getNearest((int[])nArray));
                    Time.sleepTicks((int)llIIlIllIl[15]);

                }
                String[] stringArray53 = new String[llIIlIllIl[1]];
                stringArray53[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[144]];
                var7 = TileObjects.getAll((String[])stringArray53);
                var6 = var7.stream().filter(tileObject -> {
                    String[] stringArray = new String[llIIlIllIl[1]];
                    stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[256]];
                    return tileObject.hasAction(stringArray);
                }).collect(Collectors.toList());
                if (ar.lIlIlIllIlIll(var6.isEmpty() ? 1 : 0)) {
                    ((TileObject)var6.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[145]]);
                    Time.sleepTicks((int)llIIlIllIl[15]);

                }
            }
            if (ar.lIlIlIllIlIIl(Reachable.isInteractable((Locatable)((Locatable)var5.get(llIIlIllIl[0]))) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[146]];
                ((TileObject)var5.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[147]]);
                Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[14]));

            }
        }
        String[] stringArray = new String[llIIlIllIl[1]];
        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[148]];
        if (ar.lIlIlIllIlllI(TileObjects.getNearest((String[])stringArray))) {
            block103: {
                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[149]];
                System.out.println(llIIlIlIlI[llIIlIllIl[150]]);
                var4 = new ArrayList();
                long var5 = System.currentTimeMillis();
                do {
                    WorldPoint var9;
                    Object var10;
                    List<WorldPoint> var11;
                    int var12;
                    int var13;
                    List<WorldPoint> var14;
                    TileObject var15;
                    String[] stringArray54 = new String[llIIlIllIl[1]];
                    stringArray54[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[151]];
                    if (!ar.lIlIlIllIlIll(TileObjects.getAll((String[])stringArray54).isEmpty() ? 1 : 0) || !ar.lIlIlIlllIllI(Game.getState(), GameState.LOGGED_IN) || !ar.lIlIlIllIlIll(AccBuilderSotf.d ? 1 : 0)) break block103;
                    int var6 = llIIlIllIl[0];
                    if (ar.lIlIlIllIlIIl(var4.isEmpty() ? 1 : 0)) {
                        Time.sleepTicks((int)llIIlIllIl[15]);

                        System.out.println(llIIlIlIlI[llIIlIllIl[152]]);
                        var4 = TileObjects.getAll(tileObject -> {
                            boolean bl;
                            if (ar.lIlIlIlllIlIl(tileObject.getId(), llIIlIllIl[255])) {
                                bl = llIIlIllIl[1];

                                if (1 <= 0) {
                                    return ((124 + 41 - 82 + 61 ^ 127 + 30 - 66 + 69) & (0x13 ^ 0x6B ^ (0xE2 ^ 0xAA) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIIlIllIl[0];
                            }
                            return bl;
                        });
                        System.out.println(llIIlIlIlI[llIIlIllIl[153]]);
                        String[] stringArray55 = new String[llIIlIllIl[1]];
                        stringArray55[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[154]];
                        nR = TileObjects.getNearest((String[])stringArray55).getWorldLocation();
                        var15 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (ar.lIlIlIllIlIIl(tileObject.getName().contains(llIIlIlIlI[llIIlIllIl[253]]) ? 1 : 0)) {
                                String[] stringArray = new String[llIIlIllIl[1]];
                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[254]];
                                if (ar.lIlIlIllIlIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = llIIlIllIl[1];

                                    if ((0x44 ^ 0x40) != -1) return n2 != 0;
                                    return false;
                                }
                            }
                            n2 = llIIlIllIl[0];
                            return n2 != 0;
                        });
                        if (ar.lIlIlIllIlllI(var15) && ar.lIlIlIllIllII(var15.getWorldLocation().getY(), nR.getY() + llIIlIllIl[17])) {
                            var6 = llIIlIllIl[1];
                        }
                    }
                    System.out.println("Version: " + (var6 != 0));
                    if (ar.lIlIlIllIlIll(var6)) {
                        if (ar.lIlIlIllIlllI(nR) && ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[17])) {
                            var15 = var4.stream().map(tileObject -> tileObject.getWorldLocation()).collect(Collectors.toList());
                            WorldPoint[] worldPointArray = new WorldPoint[llIIlIllIl[18]];
                            worldPointArray[ar.llIIlIllIl[0]] = new WorldPoint(nR.getX() - llIIlIllIl[14], nR.getY() - llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[1]] = new WorldPoint(nR.getX() - llIIlIllIl[11], nR.getY() - llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[2]] = new WorldPoint(nR.getX() - llIIlIllIl[10], nR.getY() - llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[10]] = new WorldPoint(nR.getX() - llIIlIllIl[2], nR.getY() - llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[11]] = new WorldPoint(nR.getX() - llIIlIllIl[1], nR.getY() - llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[14]] = new WorldPoint(nR.getX(), nR.getY() - llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[15]] = new WorldPoint(nR.getX() + llIIlIllIl[1], nR.getY() - llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[3]] = new WorldPoint(nR.getX() + llIIlIllIl[2], nR.getY() - llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[16]] = new WorldPoint(nR.getX() + llIIlIllIl[10], nR.getY() - llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[17]] = new WorldPoint(nR.getX() + llIIlIllIl[11], nR.getY() - llIIlIllIl[11], nR.getPlane());
                            var14 = Arrays.asList(worldPointArray);
                            System.out.println("Start tiles: " + var14.size());
                            var13 = llIIlIllIl[0];
                            var12 = llIIlIllIl[0];
                            while (ar.lIlIlIllIlIlI(var12, var14.size())) {
                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[155]];
                                var11 = ar.a(var14.get(var12), nR.getY() - llIIlIllIl[17], (List<WorldPoint>)var15);
                                if (ar.lIlIlIllIlIll(var11.isEmpty() ? 1 : 0)) {
                                    System.out.println(llIIlIlIlI[llIIlIllIl[156]]);
                                    var10 = var11.iterator();
                                    while (ar.lIlIlIllIlIIl(var10.hasNext() ? 1 : 0)) {
                                        var9 = var10.next();
                                        System.out.println("(" + var9.getX() + ", " + var9.getY() + ", " + var9.getPlane() + ")");

                                        if (-(0x31 ^ 0x34) < 0) continue;
                                        return;
                                    }
                                    var13 = llIIlIllIl[1];
                                    while (ar.lIlIlIllIlIIl(var13) && ar.lIlIlIllIlIll(var11.isEmpty() ? 1 : 0)) {
                                        if (ar.lIlIlIllIlIll(Players.getLocal().getWorldLocation().equals((Object)var11.get(llIIlIllIl[0])) ? 1 : 0)) {
                                            if (ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[11])) {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[157]];
                                                e.c(var11.get(llIIlIllIl[0]));
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    if (ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[11])) {
                                                        bl = llIIlIllIl[1];

                                                        if (3 <= ((0xFD ^ 0xBE) & ~(0x7B ^ 0x38))) {
                                                            return false;
                                                        }
                                                    } else {
                                                        bl = llIIlIllIl[0];
                                                    }
                                                    return bl;
                                                }, (int)e.c(llIIlIllIl[158], llIIlIllIl[159]));

                                                Time.sleepTicks((int)llIIlIllIl[2]);

                                            } else {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[160]];
                                                String[] stringArray56 = new String[llIIlIllIl[1]];
                                                stringArray56[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[161]];
                                                var10 = TileObjects.getAt((WorldPoint)var11.get(llIIlIllIl[0]), (String[])stringArray56);
                                                if (ar.lIlIlIllIlIll(var10.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog size: " + var10.size());
                                                    ((TileObject)var10.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[162]]);
                                                    Time.sleepTicks((int)llIIlIllIl[2]);

                                                }
                                                if (ar.lIlIlIllIlIIl(var10.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog is null at: " + String.valueOf(var11.get(llIIlIllIl[0])));
                                                    Game.logout();
                                                    Time.sleepTicks((int)llIIlIllIl[2]);

                                                    if (null == null) break;
                                                    return;
                                                }
                                            }
                                        }
                                        if (ar.lIlIlIllIlIIl(Players.getLocal().getWorldLocation().equals((Object)var11.get(llIIlIllIl[0])) ? 1 : 0)) {
                                            System.out.println(llIIlIlIlI[llIIlIllIl[163]]);
                                            var11.remove(llIIlIllIl[0]);

                                            Time.sleepTicks((int)llIIlIllIl[2]);

                                        }
                                        Time.sleepTicks((int)llIIlIllIl[1]);

                                        return;
                                    }
                                    if (!ar.lIlIlIlllIlII(Game.getState(), GameState.LOGGED_IN)) break;
                                    System.out.println(llIIlIlIlI[llIIlIllIl[164]]);

                                    if (3 != ((0x92 ^ 0x9D) & ~(0xAD ^ 0xA2))) break;
                                    return;
                                }
                                ++var12;

                                if (3 != 0) continue;
                                return;
                            }
                            if (ar.lIlIlIllIlIll(var13)) {
                                System.out.println(llIIlIlIlI[llIIlIllIl[165]]);
                            }
                            System.out.println(var4.size());
                        }
                        if (ar.lIlIlIllIlllI(nR) && ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[17])) {
                            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[166]];
                            String[] stringArray57 = new String[llIIlIllIl[1]];
                            stringArray57[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[167]];
                            TileObjects.getNearest((String[])stringArray57).interact(llIIlIlIlI[llIIlIllIl[168]]);
                            Time.sleepTicks((int)llIIlIllIl[11]);

                        }
                    }
                    if (ar.lIlIlIllIlIIl(var6)) {
                        if (ar.lIlIlIllIlllI(nR) && ar.lIlIlIllIlIlI(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[17])) {
                            var15 = var4.stream().map(tileObject -> tileObject.getWorldLocation()).collect(Collectors.toList());
                            WorldPoint[] worldPointArray = new WorldPoint[llIIlIllIl[18]];
                            worldPointArray[ar.llIIlIllIl[0]] = new WorldPoint(nR.getX() - llIIlIllIl[14], nR.getY() + llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[1]] = new WorldPoint(nR.getX() - llIIlIllIl[11], nR.getY() + llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[2]] = new WorldPoint(nR.getX() - llIIlIllIl[10], nR.getY() + llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[10]] = new WorldPoint(nR.getX() - llIIlIllIl[2], nR.getY() + llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[11]] = new WorldPoint(nR.getX() - llIIlIllIl[1], nR.getY() + llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[14]] = new WorldPoint(nR.getX(), nR.getY() + llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[15]] = new WorldPoint(nR.getX() + llIIlIllIl[1], nR.getY() + llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[3]] = new WorldPoint(nR.getX() + llIIlIllIl[2], nR.getY() + llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[16]] = new WorldPoint(nR.getX() + llIIlIllIl[10], nR.getY() + llIIlIllIl[11], nR.getPlane());
                            worldPointArray[ar.llIIlIllIl[17]] = new WorldPoint(nR.getX() + llIIlIllIl[11], nR.getY() + llIIlIllIl[11], nR.getPlane());
                            var14 = Arrays.asList(worldPointArray);
                            System.out.println("Start tiles: " + var14.size());
                            var13 = llIIlIllIl[0];
                            var12 = llIIlIllIl[0];
                            while (ar.lIlIlIllIlIlI(var12, var14.size())) {
                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[169]];
                                var11 = ar.a(var14.get(var12), nR.getY() + llIIlIllIl[17], (List<WorldPoint>)var15);
                                if (ar.lIlIlIllIlIll(var11.isEmpty() ? 1 : 0)) {
                                    System.out.println(llIIlIlIlI[llIIlIllIl[170]]);
                                    var10 = var11.iterator();
                                    while (ar.lIlIlIllIlIIl(var10.hasNext() ? 1 : 0)) {
                                        var9 = var10.next();
                                        System.out.println("(" + var9.getX() + ", " + var9.getY() + ", " + var9.getPlane() + ")");

                                        if (2 != 0) continue;
                                        return;
                                    }
                                    var13 = llIIlIllIl[1];
                                    while (ar.lIlIlIllIlIIl(var13) && ar.lIlIlIllIlIll(var11.isEmpty() ? 1 : 0)) {
                                        if (ar.lIlIlIllIlIll(Players.getLocal().getWorldLocation().equals((Object)var11.get(llIIlIllIl[0])) ? 1 : 0)) {
                                            if (ar.lIlIlIllIlIlI(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[11])) {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[171]];
                                                e.c(var11.get(llIIlIllIl[0]));
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    if (ar.lIlIlIllIlIlI(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[11])) {
                                                        bl = llIIlIllIl[1];

                                                        if (-1 >= 3) {
                                                            return false;
                                                        }
                                                    } else {
                                                        bl = llIIlIllIl[0];
                                                    }
                                                    return bl;
                                                }, (int)e.c(llIIlIllIl[158], llIIlIllIl[159]));

                                                Time.sleepTicks((int)llIIlIllIl[2]);

                                                if (3 == 0) {
                                                    return;
                                                }
                                            } else {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[172]];
                                                String[] stringArray58 = new String[llIIlIllIl[1]];
                                                stringArray58[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[173]];
                                                var10 = TileObjects.getAt((WorldPoint)var11.get(llIIlIllIl[0]), (String[])stringArray58);
                                                if (ar.lIlIlIllIlIll(var10.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog size: " + var10.size());
                                                    ((TileObject)var10.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[174]]);
                                                    Time.sleepTicks((int)llIIlIllIl[2]);

                                                }
                                                if (ar.lIlIlIllIlIIl(var10.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog is null at: " + String.valueOf(var11.get(llIIlIllIl[0])));
                                                    Game.logout();
                                                    Time.sleepTicks((int)llIIlIllIl[2]);

                                                    if (-(0x9D ^ 0x99) < 0) break;
                                                    return;
                                                }
                                                Time.sleepTicks((int)llIIlIllIl[2]);

                                            }
                                        }
                                        if (ar.lIlIlIllIlIIl(Players.getLocal().getWorldLocation().equals((Object)var11.get(llIIlIllIl[0])) ? 1 : 0)) {
                                            System.out.println(llIIlIlIlI[llIIlIllIl[175]]);
                                            var11.remove(llIIlIllIl[0]);

                                            Time.sleepTicks((int)llIIlIllIl[2]);

                                        }
                                        System.out.println("Path size lefT: " + var11.size());
                                        Time.sleepTicks((int)llIIlIllIl[1]);

                                        if (2 != 0) continue;
                                        return;
                                    }
                                    if (!ar.lIlIlIlllIlII(Game.getState(), GameState.LOGGED_IN)) break;
                                    System.out.println(llIIlIlIlI[llIIlIllIl[176]]);

                                    if (null == null) break;
                                    return;
                                }
                                ++var12;

                                if ((39 + 60 - -12 + 17 ^ 125 + 48 - 123 + 83) > 0) continue;
                                return;
                            }
                            if (ar.lIlIlIllIlIll(var13)) {
                                System.out.println(llIIlIlIlI[llIIlIllIl[177]]);
                            }
                            System.out.println(var4.size());
                        }
                        if (ar.lIlIlIllIlllI(nR) && ar.lIlIlIlllIIIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[17])) {
                            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[178]];
                            String[] stringArray59 = new String[llIIlIllIl[1]];
                            stringArray59[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[179]];
                            TileObjects.getNearest((String[])stringArray59).interact(llIIlIlIlI[llIIlIllIl[180]]);
                            Time.sleepTicks((int)llIIlIllIl[11]);

                        }
                    }
                    if (ar.lIlIlIlllIIII(ar.lIlIlIlllIIlI(System.currentTimeMillis(), var5 + 45000L))) {
                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[181]];
                        Game.logout();
                        var5 = System.currentTimeMillis();
                    }

                } while (2 != 3);
                return;
            }
            int[] nArray = new int[llIIlIllIl[1]];
            nArray[ar.llIIlIllIl[0]] = llIIlIllIl[9];
            if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));

                mV = llIIlIllIl[0];
            }
        }
        if (ar.lIlIlIllIlIll(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ar.lIlIlIllIlIll(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ar.lIlIlIlllIlll(ar.lIlIlIlllIIll(e.w(), 25.0))) {
            int[] nArray = new int[llIIlIllIl[1]];
            nArray[ar.llIIlIllIl[0]] = llIIlIllIl[9];
            if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));

                mV = llIIlIllIl[0];
            }
        }
    }

    private static int lIlIlIlllIIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIlIlIlllIllI(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIlIlIllIlI() {
        llIIlIlIlI = new String[llIIlIllIl[291]];
        ar.llIIlIlIlI[ar.llIIlIllIl[0]] = "Buying items";
        ar.llIIlIlIlI[ar.llIIlIllIl[1]] = "Finished buying items, switching back to agility";
        ar.llIIlIlIlI[ar.llIIlIllIl[2]] = "Read";
        ar.llIIlIlIlI[ar.llIIlIllIl[10]] = "Break";
        ar.llIIlIlIlI[ar.llIIlIllIl[11]] = "Navigating to bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[14]] = "Veliaf Hurtz";
        ar.llIIlIlIlI[ar.llIIlIllIl[15]] = "Ladder";
        ar.llIIlIlIlI[ar.llIIlIllIl[3]] = "Climb-up";
        ar.llIIlIlIlI[ar.llIIlIllIl[16]] = "Veliaf Hurtz";
        ar.llIIlIlIlI[ar.llIIlIllIl[17]] = "Nav to burgh bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[18]] = "Handling banking";
        ar.llIIlIlIlI[ar.llIIlIllIl[20]] = "Bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[24]] = "Vial";
        ar.llIIlIlIlI[ar.llIIlIllIl[25]] = "Vial";
        ar.llIIlIlIlI[ar.llIIlIllIl[26]] = "Drop";
        ar.llIIlIlIlI[ar.llIIlIllIl[28]] = "Drink";
        ar.llIIlIlIlI[ar.llIIlIllIl[30]] = "Read";
        ar.llIIlIlIlI[ar.llIIlIllIl[31]] = "Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[32]] = "Nav to city escort tile";
        ar.llIIlIlIlI[ar.llIIlIllIl[33]] = "Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[36]] = "Clicking npc";
        ar.llIIlIlIlI[ar.llIIlIllIl[38]] = "Escort";
        ar.llIIlIlIlI[ar.llIIlIllIl[39]] = "Yes.";
        ar.llIIlIlIlI[ar.llIIlIllIl[40]] = "Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[41]] = "Nav to npc";
        ar.llIIlIlIlI[ar.llIIlIllIl[29]] = "Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[42]] = "Clicking npc";
        ar.llIIlIlIlI[ar.llIIlIllIl[44]] = "Escort";
        ar.llIIlIlIlI[ar.llIIlIllIl[45]] = "Knife";
        ar.llIIlIlIlI[ar.llIIlIllIl[46]] = "Hammer";
        ar.llIIlIlIlI[ar.llIIlIllIl[4]] = "Nav to canafis bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[47]] = "Nav to burgh bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[48]] = "Handle banking";
        ar.llIIlIlIlI[ar.llIIlIllIl[49]] = "Handle banking";
        ar.llIIlIlIlI[ar.llIIlIllIl[50]] = "Eat";
        ar.llIIlIlIlI[ar.llIIlIllIl[52]] = "Yes.";
        ar.llIIlIlIlI[ar.llIIlIllIl[53]] = "Starting trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[56]] = "Vampyre Juvinate";
        ar.llIIlIlIlI[ar.llIIlIllIl[57]] = "Giant snail";
        ar.llIIlIlIlI[ar.llIIlIllIl[58]] = "Nail beast";
        ar.llIIlIlIlI[ar.llIIlIllIl[59]] = "Abidor Crank";
        ar.llIIlIlIlI[ar.llIIlIllIl[60]] = "Swamp snake";
        ar.llIIlIlIlI[ar.llIIlIllIl[61]] = "Riyl shadow";
        ar.llIIlIlIlI[ar.llIIlIllIl[62]] = "Bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[63]] = "Evading combat event";
        ar.llIIlIlIlI[ar.llIIlIllIl[64]] = "Evade-event";
        ar.llIIlIlIlI[ar.llIIlIllIl[67]] = "Ghast";
        ar.llIIlIlIlI[ar.llIIlIllIl[69]] = "Evading ghast event";
        ar.llIIlIlIlI[ar.llIIlIllIl[70]] = "Evade-event";
        ar.llIIlIlIlI[ar.llIIlIllIl[71]] = "Broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[27]] = "broken bridge event";
        ar.llIIlIlIlI[ar.llIIlIllIl[72]] = "Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[73]] = "Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[74]] = "Take";
        ar.llIIlIlIlI[ar.llIIlIllIl[75]] = "Undead Lumberjack";
        ar.llIIlIlIlI[ar.llIIlIllIl[76]] = "Attack";
        ar.llIIlIlIlI[ar.llIIlIllIl[77]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[78]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[79]] = "Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[81]] = "Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[68]] = "Chop down";
        ar.llIIlIlIlI[ar.llIIlIllIl[82]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[83]] = "Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[84]] = "Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[85]] = "Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[86]] = "Broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[87]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[88]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[89]] = "Broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[90]] = "Yes.";
        ar.llIIlIlIlI[ar.llIIlIllIl[91]] = "Partially broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[92]] = "partial bridge event";
        ar.llIIlIlIlI[ar.llIIlIllIl[93]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[94]] = "Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[95]] = "Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[96]] = "Chop down";
        ar.llIIlIlIlI[ar.llIIlIllIl[97]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[98]] = "Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[99]] = "Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[100]] = "Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[101]] = "Partially broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[102]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[103]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[104]] = "Partially broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[105]] = "Partially broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[106]] = "Inspect";
        ar.llIIlIlIlI[ar.llIIlIllIl[107]] = "Yes.";
        ar.llIIlIlIlI[ar.llIIlIllIl[108]] = "Slightly broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[109]] = "slightly bridge event";
        ar.llIIlIlIlI[ar.llIIlIllIl[110]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[111]] = "Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[112]] = "Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[113]] = "Chop down";
        ar.llIIlIlIlI[ar.llIIlIllIl[114]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[115]] = "Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[116]] = "Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[117]] = "Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[118]] = "Slightly broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[119]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[120]] = "Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[13]] = "Slightly broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[121]] = "Slightly broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[122]] = "Inspect";
        ar.llIIlIlIlI[ar.llIIlIllIl[123]] = "Yes.";
        ar.llIIlIlIlI[ar.llIIlIllIl[124]] = "Fixed bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[125]] = "Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[126]] = "Continuing trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[127]] = "Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[128]] = "Crossing bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[129]] = "Cross";
        ar.llIIlIlIlI[ar.llIIlIllIl[130]] = "Swamp tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[131]] = "Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[132]] = "Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[133]] = "Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[134]] = "Cutting vines";
        ar.llIIlIlIlI[ar.llIIlIllIl[135]] = "Swamp tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[136]] = "Cut-vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[137]] = "Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[138]] = "Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[139]] = "Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[140]] = "Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[141]] = "Long vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[142]] = "Long vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[144]] = "Swamp tree branch";
        ar.llIIlIlIlI[ar.llIIlIllIl[145]] = "Swing-from";
        ar.llIIlIlIlI[ar.llIIlIllIl[146]] = "Continuing trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[147]] = "Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[148]] = "Bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[149]] = "Solving bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[150]] = "Start of bog section";
        ar.llIIlIlIlI[ar.llIIlIllIl[151]] = "Bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[152]] = "Set tiles";
        ar.llIIlIlIlI[ar.llIIlIllIl[153]] = "Set anchor";
        ar.llIIlIlIlI[ar.llIIlIllIl[154]] = "Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[155]] = "Generating path";
        ar.llIIlIlIlI[ar.llIIlIllIl[156]] = "Path found:";
        ar.llIIlIlIlI[ar.llIIlIllIl[157]] = "Walk to start tile";
        ar.llIIlIlIlI[ar.llIIlIllIl[160]] = "Navigating bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[161]] = "Bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[162]] = "Stand-on";
        ar.llIIlIlIlI[ar.llIIlIllIl[163]] = "Removed tile";
        ar.llIIlIlIlI[ar.llIIlIllIl[164]] = "Not logged in, breaking";
        ar.llIIlIlIlI[ar.llIIlIllIl[165]] = "No path found.";
        ar.llIIlIlIlI[ar.llIIlIllIl[166]] = "Continue trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[167]] = "Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[168]] = "Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[169]] = "Generating path";
        ar.llIIlIlIlI[ar.llIIlIllIl[170]] = "Path found:";
        ar.llIIlIlIlI[ar.llIIlIllIl[171]] = "Walk to start tile";
        ar.llIIlIlIlI[ar.llIIlIllIl[172]] = "Navigating bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[173]] = "Bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[174]] = "Stand-on";
        ar.llIIlIlIlI[ar.llIIlIllIl[175]] = "Removed tile";
        ar.llIIlIlIlI[ar.llIIlIllIl[176]] = "Not logged in, breaking";
        ar.llIIlIlIlI[ar.llIIlIllIl[177]] = "No path found.";
        ar.llIIlIlIlI[ar.llIIlIllIl[178]] = "Continue trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[179]] = "Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[180]] = "Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[181]] = "In bog too long, logging to reset";
        ar.llIIlIlIlI[ar.llIIlIllIl[182]] = "Handling banking";
        ar.llIIlIlIlI[ar.llIIlIllIl[183]] = "Bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[184]] = "Bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[186]] = "Needs items, banking";
        ar.llIIlIlIlI[ar.llIIlIllIl[187]] = "Dragon sword";
        ar.llIIlIlIlI[ar.llIIlIllIl[188]] = "Dragon sword";
        ar.llIIlIlIlI[ar.llIIlIllIl[191]] = "Bronze axe";
        ar.llIIlIlIlI[ar.llIIlIllIl[192]] = "Wear";
        ar.llIIlIlIlI[ar.llIIlIllIl[193]] = "Wear";
        ar.llIIlIlIlI[ar.llIIlIllIl[194]] = "Wield";
        ar.llIIlIlIlI[ar.llIIlIllIl[195]] = "Wield";
        ar.llIIlIlIlI[ar.llIIlIllIl[196]] = "Equip";
        ar.llIIlIlIlI[ar.llIIlIllIl[197]] = "Equip";
        ar.llIIlIlIlI[ar.llIIlIllIl[199]] = "Give me a PK skull.";
        ar.llIIlIlIlI[ar.llIIlIllIl[200]] = "Wear";
        ar.llIIlIlIlI[ar.llIIlIllIl[201]] = "Wear";
        ar.llIIlIlIlI[ar.llIIlIllIl[202]] = "Wield";
        ar.llIIlIlIlI[ar.llIIlIllIl[203]] = "Wield";
        ar.llIIlIlIlI[ar.llIIlIllIl[204]] = "Equip";
        ar.llIIlIlIlI[ar.llIIlIllIl[205]] = "Equip";
        ar.llIIlIlIlI[ar.llIIlIllIl[206]] = "Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[207]] = "Claiming reward;";
        ar.llIIlIlIlI[ar.llIIlIllIl[208]] = "Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[209]] = "Look-at";
        ar.llIIlIlIlI[ar.llIIlIllIl[211]] = "Selecting reward";
        ar.llIIlIlIlI[ar.llIIlIllIl[212]] = "xp";
        ar.llIIlIlIlI[ar.llIIlIllIl[213]] = "Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[214]] = "bs";
        ar.llIIlIlIlI[ar.llIIlIllIl[215]] = "Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[216]] = "ess";
        ar.llIIlIlIlI[ar.llIIlIllIl[217]] = "Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[218]] = "bars";
        ar.llIIlIlIlI[ar.llIIlIllIl[219]] = "Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[220]] = "herbs";
        ar.llIIlIlIlI[ar.llIIlIllIl[221]] = "Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[222]] = "ores";
        ar.llIIlIlIlI[ar.llIIlIllIl[223]] = "Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[224]] = "Claiming";
        ar.llIIlIlIlI[ar.llIIlIllIl[226]] = "Claim";
        ar.llIIlIlIlI[ar.llIIlIllIl[227]] = "Read";
        ar.llIIlIlIlI[ar.llIIlIllIl[249]] = "Temple trekking";
        ar.llIIlIlIlI[ar.llIIlIllIl[250]] = "tome";
        ar.llIIlIlIlI[ar.llIIlIllIl[251]] = "Bank booth";
        ar.llIIlIlIlI[ar.llIIlIllIl[252]] = "Bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[253]] = "Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[254]] = "Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[256]] = "Swing-from";
        ar.llIIlIlIlI[ar.llIIlIllIl[257]] = "Cut-vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[258]] = "Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[259]] = "Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[260]] = "Cross";
        ar.llIIlIlIlI[ar.llIIlIllIl[261]] = "Fixed bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[262]] = "Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[263]] = "Lumberjack";
        ar.llIIlIlIlI[ar.llIIlIllIl[264]] = "bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[265]] = "Evade-event";
        ar.llIIlIlIlI[ar.llIIlIllIl[266]] = "Evade-event";
        ar.llIIlIlIlI[ar.llIIlIllIl[267]] = "Swamp tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[268]] = "bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[270]] = "Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[271]] = "Read";
        ar.llIIlIlIlI[ar.llIIlIllIl[272]] = "Drop";
        ar.llIIlIlIlI[ar.llIIlIllIl[273]] = "tome";
        ar.llIIlIlIlI[ar.llIIlIllIl[274]] = "tome";
        ar.llIIlIlIlI[ar.llIIlIllIl[284]] = "xp";
    }

    private static boolean lIlIlIlllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static int lIlIlIlllIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ar.lIlIlIlllIIIl(Skills.getLevel((Skill)Skill.SLAYER), llIIlIllIl[27])) {
            bl = llIIlIllIl[1];

            if (2 < 0) {
                return ((0x72 ^ 0x2F ^ (0x4B ^ 0xF)) & (0xB0 ^ 0xA4 ^ (0x18 ^ 0x15) ^ -1)) != 0;
            }
        } else {
            bl = llIIlIllIl[0];
        }
        return bl;
    }

    private static boolean lIlIlIllIllII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static List<as> a(as as2, List<WorldPoint> list) {
        void var16;
        int[][] nArrayArray;
        ArrayList<as> arrayList = new ArrayList<as>();
        int[][] nArrayArray2 = new int[llIIlIllIl[11]][];
        int[] nArray = new int[llIIlIllIl[2]];
        nArray[ar.llIIlIllIl[0]] = llIIlIllIl[1];
        nArray[ar.llIIlIllIl[1]] = llIIlIllIl[0];
        nArrayArray2[ar.llIIlIllIl[0]] = nArray;
        int[] nArray2 = new int[llIIlIllIl[2]];
        nArray2[ar.llIIlIllIl[0]] = llIIlIllIl[80];
        nArray2[ar.llIIlIllIl[1]] = llIIlIllIl[0];
        nArrayArray2[ar.llIIlIllIl[1]] = nArray2;
        int[] nArray3 = new int[llIIlIllIl[2]];
        nArray3[ar.llIIlIllIl[0]] = llIIlIllIl[0];
        nArray3[ar.llIIlIllIl[1]] = llIIlIllIl[1];
        nArrayArray2[ar.llIIlIllIl[2]] = nArray3;
        int[] nArray4 = new int[llIIlIllIl[2]];
        nArray4[ar.llIIlIllIl[0]] = llIIlIllIl[0];
        nArray4[ar.llIIlIllIl[1]] = llIIlIllIl[80];
        nArrayArray2[ar.llIIlIllIl[10]] = nArray4;
        int[][] nArrayArray3 = nArrayArray = nArrayArray2;
        int n2 = nArrayArray3.length;
        int var17 = llIIlIllIl[0];
        while (ar.lIlIlIllIlIlI(var17, (int)var16)) {
            void var18;
            int var19;
            int var20;
            as var21;
            void var22;
            void var23 = var22[var17];
            int var24 = var21.nT.getX() + var23[llIIlIllIl[0]];
            WorldPoint var25 = new WorldPoint(var24, var20 = var21.nT.getY() + var23[llIIlIllIl[1]], var19 = var21.nT.getPlane());
            if (ar.lIlIlIllIlIIl(var18.contains(var25) ? 1 : 0)) {
                void var26;
                var26.add(new ASHelper(var25, var21, llIIlIllIl[0], ar.d(var20, nR.getY() + llIIlIllIl[17])));

            }
            ++var17;

            if (((7 ^ 0x33) & ~(0x51 ^ 0x65)) <= 2) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean lIlIlIlllIlII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block6: {
            block8: {
                block7: {
                    block5: {
                        String[] stringArray = new String[llIIlIllIl[1]];
                        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[187]];
                        if (!ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block5;
                        String[] stringArray2 = new String[llIIlIllIl[1]];
                        stringArray2[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[188]];
                        if (!ar.lIlIlIllIlIIl(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block6;
                    }
                    int[] nArray = new int[llIIlIllIl[1]];
                    nArray[ar.llIIlIllIl[0]] = llIIlIllIl[8];
                    if (!ar.lIlIlIllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                    int[] nArray2 = new int[llIIlIllIl[1]];
                    nArray2[ar.llIIlIllIl[0]] = llIIlIllIl[8];
                    if (!ar.lIlIlIllIlIll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block7;
                    int[] nArray3 = new int[llIIlIllIl[1]];
                    nArray3[ar.llIIlIllIl[0]] = llIIlIllIl[189];
                    if (!ar.lIlIlIllIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block7;
                    int[] nArray4 = new int[llIIlIllIl[1]];
                    nArray4[ar.llIIlIllIl[0]] = llIIlIllIl[189];
                    if (!ar.lIlIlIllIlIll(Equipment.contains((int[])nArray4) ? 1 : 0)) break block7;
                    int[] nArray5 = new int[llIIlIllIl[1]];
                    nArray5[ar.llIIlIllIl[0]] = llIIlIllIl[190];
                    if (!ar.lIlIlIllIlIll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block7;
                    int[] nArray6 = new int[llIIlIllIl[1]];
                    nArray6[ar.llIIlIllIl[0]] = llIIlIllIl[190];
                    if (!ar.lIlIlIllIlIIl(Equipment.contains((int[])nArray6) ? 1 : 0)) break block6;
                }
                int[] nArray = new int[llIIlIllIl[1]];
                nArray[ar.llIIlIllIl[0]] = llIIlIllIl[22];
                if (!ar.lIlIlIllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block8;
                String[] stringArray = new String[llIIlIllIl[1]];
                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[191]];
                if (!ar.lIlIlIllIlIIl(Equipment.contains((String[])stringArray) ? 1 : 0)) break block6;
            }
            int[] nArray = new int[llIIlIllIl[1]];
            nArray[ar.llIIlIllIl[0]] = llIIlIllIl[23];
            if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[llIIlIllIl[1]];
                nArray7[ar.llIIlIllIl[0]] = llIIlIllIl[9];
                if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                    n2 = llIIlIllIl[1];

                    if (-1 >= -1) return n2 != 0;
                    return ((0x95 ^ 0xBF) & ~(0x89 ^ 0xA3) & ~((0x22 ^ 0x28) & ~(0x21 ^ 0x2B))) != 0;
                }
            }
        }
        n2 = llIIlIllIl[0];
        return n2 != 0;
    }

    private static boolean lIlIlIllIlllI(Object object) {
        return object != null;
    }

        return String.valueOf(var27);
    }

    /*
     * WARNING - void declaration
     */
    public static List<WorldPoint> a(WorldPoint worldPoint, int n2, List<WorldPoint> list) {
        void var28;
        PriorityQueue<as> priorityQueue = new PriorityQueue<as>();
        ArrayList arrayList = new ArrayList();
        priorityQueue.add(new ASHelper(worldPoint, null, llIIlIllIl[0], ar.d(worldPoint.getY(), n2)));

        while (ar.lIlIlIllIlIll(var28.isEmpty() ? 1 : 0)) {
            void var29;
            void var30;
            void var31;
            as var32 = (ASHelper) ar28.poll();
            if (ar.lIlIlIlllIlIl(var32.nT.getY(), (int)var31)) {
                return ar.a(var32);
            }
            var30.add(var32);

            Iterator<as> var33 = ar.a(var32, (List<WorldPoint>)var29).iterator();
            while (ar.lIlIlIllIlIIl(var33.hasNext() ? 1 : 0)) {
                as var34 = var33.next();
                int var35 = var32.nV + llIIlIllIl[1];
                if (ar.lIlIlIllIlIIl(ar.b(var34, (List<as>)var30) ? 1 : 0)) {

                    if (2 >= 1) continue;
                    return null;
                }
                if (!ar.lIlIlIllIlIIl(ar.a(var34, (PriorityQueue<as>)var28) ? 1 : 0) || ar.lIlIlIllIlIlI(var35, var34.nV)) {
                    var28.add(var34);

                }

                if (((8 ^ 0x35 ^ 2) & (16 + 138 - 25 + 12 ^ 131 + 69 - 134 + 112 ^ -1)) == 0) continue;
                return null;
            }

            if (-3 <= 0) continue;
            return null;
        }
        return Collections.emptyList();
    }

    public static void t(String string) {
        Widget var36;
        String[] stringArray = new String[llIIlIllIl[1]];
        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[206]];
        if (ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            mV = llIIlIllIl[0];
            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[207]];
            String[] stringArray2 = new String[llIIlIllIl[1]];
            stringArray2[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[208]];
            Inventory.getFirst((String[])stringArray2).interact(llIIlIlIlI[llIIlIllIl[209]]);
            Time.sleepTicks((int)llIIlIllIl[10]);

            if (!ar.lIlIlIllIllll(Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15])) || ar.lIlIlIllIlIll(Widgets.get((int)llIIlIllIl[210]).isEmpty() ? 1 : 0)) {
                String var37;
                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[211]];
                if (ar.lIlIlIllIlIIl(var37.contains(llIIlIlIlI[llIIlIllIl[212]]) ? 1 : 0) && ar.lIlIlIllIlllI(var36 = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);

                    var36.getChild(llIIlIllIl[3]).interact(llIIlIlIlI[llIIlIllIl[213]]);
                    Time.sleepTicks((int)llIIlIllIl[1]);

                }
                if (ar.lIlIlIllIlIIl(var37.contains(llIIlIlIlI[llIIlIllIl[214]]) ? 1 : 0) && ar.lIlIlIllIlllI(var36 = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);

                    var36.getChild(llIIlIllIl[1]).interact(llIIlIlIlI[llIIlIllIl[215]]);
                    Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));

                }
                if (ar.lIlIlIllIlIIl(var37.contains(llIIlIlIlI[llIIlIllIl[216]]) ? 1 : 0) && ar.lIlIlIllIlllI(var36 = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);

                    var36.getChild(llIIlIllIl[0]).interact(llIIlIlIlI[llIIlIllIl[217]]);
                    Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));

                }
                if (ar.lIlIlIllIlIIl(var37.contains(llIIlIlIlI[llIIlIllIl[218]]) ? 1 : 0) && ar.lIlIlIllIlllI(var36 = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);

                    var36.getChild(llIIlIllIl[2]).interact(llIIlIlIlI[llIIlIllIl[219]]);
                    Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));

                }
                if (ar.lIlIlIllIlIIl(var37.contains(llIIlIlIlI[llIIlIllIl[220]]) ? 1 : 0) && ar.lIlIlIllIlllI(var36 = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);

                    var36.getChild(llIIlIllIl[10]).interact(llIIlIlIlI[llIIlIllIl[221]]);
                    Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));

                }
                if (ar.lIlIlIllIlIIl(var37.contains(llIIlIlIlI[llIIlIllIl[222]]) ? 1 : 0) && ar.lIlIlIllIlllI(var36 = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);

                    var36.getChild(llIIlIllIl[11]).interact(llIIlIlIlI[llIIlIllIl[223]]);
                    Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));

                }
                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[224]];
                var36 = Widgets.fromId((int)llIIlIllIl[225]);
                if (ar.lIlIlIllIlllI(var36) && ar.lIlIlIllIlIIl(var36.isVisible() ? 1 : 0)) {
                    Time.sleepTick();

                    var36.interact(llIIlIlIlI[llIIlIllIl[226]]);
                    Time.sleepTicks((int)llIIlIllIl[2]);

                }
            }
        }
        if (ar.lIlIlIllIlIIl(Inventory.contains(var36 = item -> item.getName().toLowerCase().contains(llIIlIlIlI[llIIlIllIl[250]])) ? 1 : 0)) {
            Inventory.getFirst(var36).interact(llIIlIlIlI[llIIlIllIl[227]]);
            Time.sleepTicks((int)llIIlIllIl[1]);

        }
    }

    static {
        ar.lIlIlIllIlIII();
        ar.lIlIlIlIllIlI();
        bv = new ArrayList<d>();
        nH = new WorldArea(llIIlIllIl[275], llIIlIllIl[276], llIIlIllIl[32], llIIlIllIl[53], llIIlIllIl[0]);
        nI = new WorldPoint(llIIlIllIl[277], llIIlIllIl[278], llIIlIllIl[0]);
        mT = llIIlIllIl[279];
        mU = llIIlIllIl[242];
        nJ = llIIlIllIl[185];
        nK = llIIlIllIl[52];
        nL = new WorldArea(llIIlIllIl[280], llIIlIllIl[281], llIIlIllIl[132], llIIlIllIl[93], llIIlIllIl[0]);
        nM = new WorldArea(llIIlIllIl[282], llIIlIllIl[283], llIIlIllIl[72], llIIlIllIl[71], llIIlIllIl[0]);
        nN = llIIlIlIlI[llIIlIllIl[284]];
        nO = new WorldArea(llIIlIllIl[285], llIIlIllIl[286], llIIlIllIl[64], llIIlIllIl[69], llIIlIllIl[0]);
        nP = new WorldPoint(llIIlIllIl[287], llIIlIllIl[288], llIIlIllIl[0]);
        nQ = new WorldPoint(llIIlIllIl[289], llIIlIllIl[290], llIIlIllIl[0]);
        cG = llIIlIllIl[0];
        nR = null;
        nS = System.currentTimeMillis();
    }

    public static void gb() {
        block65: {
            block66: {
                block67: {
                    if (ar.lIlIlIllIlIIl(bt ? 1 : 0)) {
                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[0]];
                        b.a(bv);
                        if (ar.lIlIlIllIlIlI(bv.size(), llIIlIllIl[1])) {
                            System.out.println(llIIlIlIlI[llIIlIllIl[1]]);
                            bt = llIIlIllIl[0];
                        }
                    }
                    if (!ar.lIlIlIllIlIll(bt ? 1 : 0)) break block65;
                    if (ar.lIlIlIllIlIIl(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    ar.t(nN);
                    Predicate<Item> var38 = item -> item.getName().toLowerCase().contains(llIIlIlIlI[llIIlIllIl[274]]);
                    if (ar.lIlIlIllIlIIl(Inventory.contains(var38) ? 1 : 0)) {
                        Inventory.getFirst(var38).interact(llIIlIlIlI[llIIlIllIl[2]]);
                        Time.sleepTicks((int)llIIlIllIl[1]);

                    }
                    if (ar.lIlIlIllIlIll(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ar.lIlIlIllIlIll(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ar.lIlIlIllIlIll(ar.an() ? 1 : 0) && ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIlIllIl[3])) {
                        Movement.walkTo((WorldPoint)b.I);

                        Time.sleepTicks((int)llIIlIllIl[1]);

                    }
                    if (ar.lIlIlIllIlIll(ar.an() ? 1 : 0) && ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIlIllIl[3])) {
                        ar.gd();
                    }
                    if (ar.lIlIlIllIlIIl(ar.an() ? 1 : 0) && ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIlIllIl[4])) {
                        ar.l(llIIlIllIl[5]);
                        ar.l(llIIlIllIl[6]);
                        ar.l(llIIlIllIl[7]);
                        ar.l(llIIlIllIl[8]);
                        ar.b(f.bk);
                        ar.b(f.aW);
                        int[] nArray = new int[llIIlIllIl[1]];
                        nArray[ar.llIIlIllIl[0]] = llIIlIllIl[9];
                        if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));

                            int[] nArray2 = new int[llIIlIllIl[1]];
                            nArray2[ar.llIIlIllIl[0]] = llIIlIllIl[9];
                            Inventory.getFirst((int[])nArray2).interact(llIIlIlIlI[llIIlIllIl[10]]);
                            Time.sleepUntil(() -> nL.contains(Players.getLocal().getWorldLocation()), (int)llIIlIllIl[12]);

                            mV = llIIlIllIl[0];
                        }
                    }
                    if (ar.lIlIlIllIlIll(ar.an() ? 1 : 0) && (!ar.lIlIlIllIlIll(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(nQ), llIIlIllIl[13]))) {
                        if (ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[14])) {
                            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[11]];
                            String[] stringArray = new String[llIIlIllIl[1]];
                            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[14]];
                            if (ar.lIlIlIllIlllI(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray2 = new String[llIIlIllIl[1]];
                                stringArray2[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[15]];
                                TileObjects.getNearest((String[])stringArray2).interact(llIIlIlIlI[llIIlIllIl[3]]);
                                Time.sleepTicks((int)llIIlIllIl[11]);

                            }
                            String[] stringArray3 = new String[llIIlIllIl[1]];
                            stringArray3[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[16]];
                            if (ar.lIlIlIllIllll(NPCs.getNearest((String[])stringArray3)) && ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[14])) {
                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[17]];
                                Movement.walkTo((WorldPoint)D.fa);

                                Time.sleepTicks((int)llIIlIllIl[1]);

                            }
                        }
                        if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[14])) {
                            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[18]];
                            if (ar.lIlIlIllIlIll(Bank.isOpen() ? 1 : 0)) {
                                int[] nArray = new int[llIIlIllIl[1]];
                                nArray[ar.llIIlIllIl[0]] = llIIlIllIl[19];
                                TileObjects.getNearest((int[])nArray).interact(llIIlIlIlI[llIIlIllIl[20]]);
                                Time.sleepTicks((int)llIIlIllIl[2]);

                            }
                            if (ar.lIlIlIllIlIIl(Bank.isOpen() ? 1 : 0) && ar.lIlIlIlllIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIlIllIl[1]);

                            }
                            int[] nArray = new int[llIIlIllIl[1]];
                            nArray[ar.llIIlIllIl[0]] = llIIlIllIl[7];
                            if (ar.lIlIlIllIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray3 = new int[llIIlIllIl[1]];
                                nArray3[ar.llIIlIllIl[0]] = llIIlIllIl[7];
                                if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    a.a(llIIlIllIl[7], llIIlIllIl[1]);
                                }
                            }
                            int[] nArray4 = new int[llIIlIllIl[1]];
                            nArray4[ar.llIIlIllIl[0]] = llIIlIllIl[8];
                            if (ar.lIlIlIllIlIll(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[llIIlIllIl[1]];
                                nArray5[ar.llIIlIllIl[0]] = llIIlIllIl[8];
                                if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(llIIlIllIl[8], llIIlIllIl[1]);
                                }
                            }
                            int[] nArray6 = new int[llIIlIllIl[1]];
                            nArray6[ar.llIIlIllIl[0]] = llIIlIllIl[21];
                            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                a.a(llIIlIllIl[21], llIIlIllIl[1]);
                            }
                            int[] nArray7 = new int[llIIlIllIl[1]];
                            nArray7[ar.llIIlIllIl[0]] = llIIlIllIl[22];
                            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                a.a(llIIlIllIl[22], llIIlIllIl[1]);
                            }
                            int[] nArray8 = new int[llIIlIllIl[1]];
                            nArray8[ar.llIIlIllIl[0]] = llIIlIllIl[23];
                            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                a.a(llIIlIllIl[23], llIIlIllIl[1]);
                            }
                            if (ar.lIlIlIllIlIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                                int[] nArray9 = new int[llIIlIllIl[1]];
                                nArray9[ar.llIIlIllIl[0]] = nJ;
                                if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    a.a(nJ, llIIlIllIl[11]);
                                }
                            }
                            int[] nArray10 = new int[llIIlIllIl[1]];
                            nArray10[ar.llIIlIllIl[0]] = llIIlIllIl[9];
                            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                Bank.withdrawAll((int)llIIlIllIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            }
                        }
                    }
                    if (ar.lIlIlIllIlIIl(ar.an() ? 1 : 0)) {
                        NPC llllllllllllllllllIlIIIllllllIIl2;
                        ar.l(llIIlIllIl[5]);
                        ar.l(llIIlIllIl[6]);
                        ar.l(llIIlIllIl[7]);
                        ar.l(llIIlIllIl[8]);
                        ar.b(f.bk);
                        ar.b(f.aW);
                        String[] stringArray = new String[llIIlIllIl[1]];
                        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[24]];
                        if (ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            String[] stringArray4 = new String[llIIlIllIl[1]];
                            stringArray4[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[25]];
                            Inventory.getFirst((String[])stringArray4).interact(llIIlIlIlI[llIIlIllIl[26]]);
                        }
                        if (ar.lIlIlIllIlIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && ar.lIlIlIllIlIlI(Movement.getRunEnergy(), llIIlIllIl[27])) {
                            Inventory.getFirst((int[])f.ba).interact(llIIlIlIlI[llIIlIllIl[28]]);
                            Time.sleepTicks((int)llIIlIllIl[1]);

                        }
                        if (ar.lIlIlIllIllII(Movement.getRunEnergy(), llIIlIllIl[29]) && ar.lIlIlIllIlIll(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                        }
                        ar.t(nN);
                        Predicate<Item> var39 = item -> item.getName().toLowerCase().contains(llIIlIlIlI[llIIlIllIl[273]]);
                        if (ar.lIlIlIllIlIIl(Inventory.contains(var39) ? 1 : 0)) {
                            Inventory.getFirst(var39).interact(llIIlIlIlI[llIIlIllIl[30]]);
                            Time.sleepTicks((int)llIIlIllIl[1]);

                        }
                        if (ar.lIlIlIllIlIIl(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray5 = new String[llIIlIllIl[1]];
                            stringArray5[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[31]];
                            if (ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray5) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains(var39) ? 1 : 0)) {
                                if (ar.lIlIlIllIlIlI(cG, llIIlIllIl[1]) && ar.lIlIlIlllIIIl(Movement.getRunEnergy(), llIIlIllIl[29])) {
                                    Movement.toggleRun();
                                    cG += llIIlIllIl[1];
                                }
                                if (ar.lIlIlIlllIIIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                                    if (ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(nP), llIIlIllIl[16])) {
                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[32]];
                                        if (ar.lIlIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)nP);

                                        Time.sleepTicks((int)llIIlIllIl[1]);

                                    }
                                    if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(nP), llIIlIllIl[16])) {
                                        Time.sleepTicks((int)llIIlIllIl[2]);

                                        if (ar.lIlIlIllIlIll(Dialog.isOpen() ? 1 : 0) && ar.lIlIlIllIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                            String[] stringArray6 = new String[llIIlIllIl[1]];
                                            stringArray6[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[33]];
                                            if (ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray6) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains(var39) ? 1 : 0) && ar.lIlIlIllIlIIl(Widgets.get((int)llIIlIllIl[34]).isEmpty() ? 1 : 0) && ar.lIlIlIllIlIll(Vars.getBit((int)llIIlIllIl[35]))) {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[36]];
                                                int[] nArray = new int[llIIlIllIl[1]];
                                                nArray[ar.llIIlIllIl[0]] = llIIlIllIl[37];
                                                llllllllllllllllllIlIIIllllllIIl2 = NPCs.getNearest((int[])nArray);
                                                if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllllllIIl2) && ar.lIlIlIllIlIll(Dialog.isOpen() ? 1 : 0)) {
                                                    llllllllllllllllllIlIIIllllllIIl2.interact(llIIlIlIlI[llIIlIllIl[38]]);
                                                    Time.sleepTicks((int)llIIlIllIl[10]);

                                                }
                                                g.a(new String[llIIlIllIl[0]]);
                                            }
                                        }
                                    }
                                }
                                String[] stringArray7 = new String[llIIlIllIl[1]];
                                stringArray7[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[39]];
                                g.a(stringArray7);
                            }
                        }
                        if (ar.lIlIlIllIlIIl(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray8 = new String[llIIlIllIl[1]];
                            stringArray8[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[40]];
                            if (ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray8) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains(var39) ? 1 : 0)) {
                                if (ar.lIlIlIlllIIIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                                    if (ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(nI), llIIlIllIl[16])) {
                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[41]];
                                        if (ar.lIlIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)nI);

                                        Time.sleepTicks((int)llIIlIllIl[1]);

                                    }
                                    Time.sleepTicks((int)llIIlIllIl[2]);

                                    if (ar.lIlIlIllIlIll(Dialog.isOpen() ? 1 : 0) && ar.lIlIlIllIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                        String[] stringArray9 = new String[llIIlIllIl[1]];
                                        stringArray9[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[29]];
                                        if (ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray9) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains(var39) ? 1 : 0)) {
                                            if (ar.lIlIlIllIlIlI(cG, llIIlIllIl[1]) && ar.lIlIlIlllIIIl(Movement.getRunEnergy(), llIIlIllIl[29])) {
                                                Movement.toggleRun();
                                                cG += llIIlIllIl[1];
                                            }
                                            if (ar.lIlIlIllIllll(Widgets.get((int)llIIlIllIl[34], (int)llIIlIllIl[24]))) {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[42]];
                                                int[] nArray = new int[llIIlIllIl[1]];
                                                nArray[ar.llIIlIllIl[0]] = llIIlIllIl[43];
                                                llllllllllllllllllIlIIIllllllIIl2 = NPCs.getNearest((int[])nArray);
                                                if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllllllIIl2) && ar.lIlIlIllIlIll(Dialog.isOpen() ? 1 : 0) && ar.lIlIlIllIlIll(Vars.getBit((int)llIIlIllIl[35]))) {
                                                    llllllllllllllllllIlIIIllllllIIl2.interact(llIIlIlIlI[llIIlIllIl[44]]);
                                                    Time.sleepTicks((int)llIIlIllIl[10]);

                                                }
                                                g.a(new String[llIIlIllIl[0]]);
                                                Time.sleepTicks((int)llIIlIllIl[2]);

                                            }
                                        }
                                    }
                                }
                                g.a(new String[llIIlIllIl[0]]);
                            }
                        }
                        try {
                            ar.gc();

                        }
                        catch (Exception llllllllllllllllllIlIIIllllllIIl2) {
                            System.out.println(llllllllllllllllllIlIIIllllllIIl2.getStackTrace());
                            System.out.println(llllllllllllllllllIlIIIllllllIIl2.getCause());
                            llllllllllllllllllIlIIIllllllIIl2.printStackTrace();
                        }
                        if (-1 >= 1) {
                            return;
                        }
                    }
                    if (!ar.lIlIlIllIlIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) break block66;
                    int[] nArray = new int[llIIlIllIl[1]];
                    nArray[ar.llIIlIllIl[0]] = nJ;
                    if (!ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block67;
                    String[] stringArray = new String[llIIlIllIl[1]];
                    stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[45]];
                    if (!ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block67;
                    int[] nArray11 = new int[llIIlIllIl[1]];
                    nArray11[ar.llIIlIllIl[0]] = llIIlIllIl[22];
                    if (!ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block67;
                    String[] stringArray10 = new String[llIIlIllIl[1]];
                    stringArray10[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[46]];
                    if (!ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block66;
                }
                if (ar.lIlIlIllIlIIl(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(nQ), llIIlIllIl[28])) {
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[4]];
                    Movement.walkTo((WorldPoint)nQ);

                }
                if (ar.lIlIlIllIlIIl(nM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[47]];
                    Movement.walkTo((BankLocation)BankLocation.BURGH_DE_ROTT_BANK);

                }
                if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[18])) {
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[48]];
                    ar.gd();
                }
                if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(nQ), llIIlIllIl[28])) {
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[49]];
                    ar.gd();
                }
            }
            if (ar.lIlIlIllIlIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                int[] nArray = new int[llIIlIllIl[1]];
                nArray[ar.llIIlIllIl[0]] = nJ;
                if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray12 = new int[llIIlIllIl[1]];
                    nArray12[ar.llIIlIllIl[0]] = nJ;
                    Inventory.getFirst((int[])nArray12).interact(llIIlIlIlI[llIIlIllIl[50]]);
                    Time.sleepTicks((int)llIIlIllIl[1]);

                }
            }
            int[] nArray = new int[llIIlIllIl[1]];
            nArray[ar.llIIlIllIl[0]] = llIIlIllIl[51];
            if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray13 = new int[llIIlIllIl[1]];
                nArray13[ar.llIIlIllIl[0]] = llIIlIllIl[51];
                Inventory.getAll((int[])nArray13).stream().forEach(item -> item.interact(llIIlIlIlI[llIIlIllIl[272]]));
            }
        }
    }

    public static void l(int n2) {
        int[] nArray = new int[llIIlIllIl[1]];
        nArray[ar.llIIlIllIl[0]] = n2;
        if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llIIlIllIl[1]];
            nArray2[ar.llIIlIllIl[0]] = n2;
            if (ar.lIlIlIllIlIll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int var40;
                int[] nArray3 = new int[llIIlIllIl[1]];
                nArray3[ar.llIIlIllIl[0]] = n2;
                String[] stringArray = new String[llIIlIllIl[1]];
                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[192]];
                if (ar.lIlIlIllIlIIl(Inventory.getFirst((int[])nArray3).hasAction(stringArray) ? 1 : 0)) {
                    int[] nArray4 = new int[llIIlIllIl[1]];
                    nArray4[ar.llIIlIllIl[0]] = n2;
                    Inventory.getFirst((int[])nArray4).interact(llIIlIlIlI[llIIlIllIl[193]]);
                }
                int[] nArray5 = new int[llIIlIllIl[1]];
                nArray5[ar.llIIlIllIl[0]] = var40;
                String[] stringArray2 = new String[llIIlIllIl[1]];
                stringArray2[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[194]];
                if (ar.lIlIlIllIlIIl(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[llIIlIllIl[1]];
                    nArray6[ar.llIIlIllIl[0]] = var40;
                    Inventory.getFirst((int[])nArray6).interact(llIIlIlIlI[llIIlIllIl[195]]);
                }
                int[] nArray7 = new int[llIIlIllIl[1]];
                nArray7[ar.llIIlIllIl[0]] = var40;
                String[] stringArray3 = new String[llIIlIllIl[1]];
                stringArray3[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[196]];
                if (ar.lIlIlIllIlIIl(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[llIIlIllIl[1]];
                    nArray8[ar.llIIlIllIl[0]] = var40;
                    Inventory.getFirst((int[])nArray8).interact(llIIlIlIlI[llIIlIllIl[197]]);
                }
                if (ar.lIlIlIlllIlIl(var40, llIIlIllIl[198])) {
                    Time.sleepTicks((int)llIIlIllIl[10]);

                    String[] stringArray4 = new String[llIIlIllIl[1]];
                    stringArray4[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[199]];
                    g.a(stringArray4);
                    Time.sleepTicks((int)llIIlIllIl[1]);

                }
            }
        }
    }

    private static boolean lIlIlIllIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static int d(int n2, int n3) {
        return Math.abs(n2 - n3);
    }

    private static boolean lIlIlIllIllll(Object object) {
        return object == null;
    }

    private static void gd() {
        block25: {
            block31: {
                block27: {
                    block30: {
                        block29: {
                            block28: {
                                block26: {
                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[182]];
                                    if (ar.lIlIlIllIlIll(Bank.isOpen() ? 1 : 0)) {
                                        TileObject var41;
                                        if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIlIllIl[3])) {
                                            a.a();
                                            Time.sleepTicks((int)llIIlIllIl[10]);

                                        }
                                        if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(nQ), llIIlIllIl[28]) && ar.lIlIlIllIlllI(var41 = TileObjects.getNearest(tileObject -> {
                                            int n2;
                                            if (ar.lIlIlIllIlIIl(tileObject.getName().equalsIgnoreCase(llIIlIlIlI[llIIlIllIl[251]]) ? 1 : 0)) {
                                                String[] stringArray = new String[llIIlIllIl[1]];
                                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[252]];
                                                if (ar.lIlIlIllIlIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                                    n2 = llIIlIllIl[1];

                                                    if (null == null) return n2 != 0;
                                                    return false;
                                                }
                                            }
                                            n2 = llIIlIllIl[0];
                                            return n2 != 0;
                                        }))) {
                                            var41.interact(llIIlIlIlI[llIIlIllIl[183]]);
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIllIl[158]);

                                        }
                                        if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[24])) {
                                            int[] nArray = new int[llIIlIllIl[1]];
                                            nArray[ar.llIIlIllIl[0]] = llIIlIllIl[19];
                                            TileObjects.getNearest((int[])nArray).interact(llIIlIlIlI[llIIlIllIl[184]]);
                                            Time.sleepTicks((int)llIIlIllIl[2]);

                                        }
                                    }
                                    if (!ar.lIlIlIllIlIIl(Bank.isOpen() ? 1 : 0)) break block25;
                                    if (ar.lIlIlIlllIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIIlIllIl[11]);

                                    }
                                    if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIlIllIl[3]) && ar.lIlIlIlllIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llIIlIllIl[2]);

                                    }
                                    int[] nArray = new int[llIIlIllIl[1]];
                                    nArray[ar.llIIlIllIl[0]] = llIIlIllIl[7];
                                    if (!ar.lIlIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                    int[] nArray2 = new int[llIIlIllIl[1]];
                                    nArray2[ar.llIIlIllIl[0]] = llIIlIllIl[7];
                                    if (!ar.lIlIlIllIlIll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block26;
                                    int[] nArray3 = new int[llIIlIllIl[1]];
                                    nArray3[ar.llIIlIllIl[0]] = llIIlIllIl[7];
                                    if (!ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block27;
                                }
                                int[] nArray = new int[llIIlIllIl[1]];
                                nArray[ar.llIIlIllIl[0]] = llIIlIllIl[8];
                                if (!ar.lIlIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                int[] nArray4 = new int[llIIlIllIl[1]];
                                nArray4[ar.llIIlIllIl[0]] = llIIlIllIl[8];
                                if (!ar.lIlIlIllIlIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block28;
                                int[] nArray5 = new int[llIIlIllIl[1]];
                                nArray5[ar.llIIlIllIl[0]] = llIIlIllIl[8];
                                if (!ar.lIlIlIllIlIIl(Equipment.contains((int[])nArray5) ? 1 : 0)) break block27;
                            }
                            int[] nArray = new int[llIIlIllIl[1]];
                            nArray[ar.llIIlIllIl[0]] = llIIlIllIl[22];
                            if (!ar.lIlIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                            int[] nArray6 = new int[llIIlIllIl[1]];
                            nArray6[ar.llIIlIllIl[0]] = llIIlIllIl[22];
                            if (!ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llIIlIllIl[1]];
                        nArray[ar.llIIlIllIl[0]] = llIIlIllIl[23];
                        if (!ar.lIlIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                        int[] nArray7 = new int[llIIlIllIl[1]];
                        nArray7[ar.llIIlIllIl[0]] = llIIlIllIl[23];
                        if (!ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) break block27;
                    }
                    int[] nArray = new int[llIIlIllIl[1]];
                    nArray[ar.llIIlIllIl[0]] = llIIlIllIl[185];
                    if (!ar.lIlIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                }
                System.out.println(llIIlIlIlI[llIIlIllIl[186]]);
                ar.Q();
                bt = llIIlIllIl[1];
                return;
            }
            int[] nArray = new int[llIIlIllIl[1]];
            nArray[ar.llIIlIllIl[0]] = llIIlIllIl[5];
            if (ar.lIlIlIllIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray8 = new int[llIIlIllIl[1]];
                nArray8[ar.llIIlIllIl[0]] = llIIlIllIl[5];
                if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                    a.a(llIIlIllIl[5], llIIlIllIl[1]);
                    Time.sleepTicks((int)llIIlIllIl[1]);

                }
            }
            int[] nArray9 = new int[llIIlIllIl[1]];
            nArray9[ar.llIIlIllIl[0]] = llIIlIllIl[6];
            if (ar.lIlIlIllIlIll(Equipment.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[llIIlIllIl[1]];
                nArray10[ar.llIIlIllIl[0]] = llIIlIllIl[6];
                if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    a.a(llIIlIllIl[6], llIIlIllIl[1]);
                    Time.sleepTicks((int)llIIlIllIl[1]);

                }
            }
            if (ar.lIlIlIllIlIll(Equipment.contains((int[])f.bk) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains((int[])f.bk) ? 1 : 0)) {
                a.b(f.bk, llIIlIllIl[1]);
                Time.sleepTicks((int)llIIlIllIl[1]);

            }
            if (ar.lIlIlIllIlIll(Equipment.contains((int[])f.aW) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                a.b(f.aW, llIIlIllIl[1]);
                Time.sleepTicks((int)llIIlIllIl[1]);

            }
            int[] nArray11 = new int[llIIlIllIl[1]];
            nArray11[ar.llIIlIllIl[0]] = llIIlIllIl[7];
            if (ar.lIlIlIllIlIll(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[llIIlIllIl[1]];
                nArray12[ar.llIIlIllIl[0]] = llIIlIllIl[7];
                if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                    a.a(llIIlIllIl[7], llIIlIllIl[1]);
                    Time.sleepTicks((int)llIIlIllIl[1]);

                }
            }
            int[] nArray13 = new int[llIIlIllIl[1]];
            nArray13[ar.llIIlIllIl[0]] = llIIlIllIl[8];
            if (ar.lIlIlIllIlIll(Equipment.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[llIIlIllIl[1]];
                nArray14[ar.llIIlIllIl[0]] = llIIlIllIl[8];
                if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                    a.a(llIIlIllIl[8], llIIlIllIl[1]);
                    Time.sleepTicks((int)llIIlIllIl[1]);

                }
            }
            int[] nArray15 = new int[llIIlIllIl[1]];
            nArray15[ar.llIIlIllIl[0]] = llIIlIllIl[21];
            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                a.a(llIIlIllIl[21], llIIlIllIl[1]);
                Time.sleepTicks((int)llIIlIllIl[1]);

            }
            int[] nArray16 = new int[llIIlIllIl[1]];
            nArray16[ar.llIIlIllIl[0]] = llIIlIllIl[22];
            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                a.a(llIIlIllIl[22], llIIlIllIl[1]);
                Time.sleepTicks((int)llIIlIllIl[1]);

            }
            int[] nArray17 = new int[llIIlIllIl[1]];
            nArray17[ar.llIIlIllIl[0]] = llIIlIllIl[23];
            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                a.a(llIIlIllIl[23], llIIlIllIl[1]);
                Time.sleepTicks((int)llIIlIllIl[1]);

            }
            if (ar.lIlIlIllIlIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                int[] nArray18 = new int[llIIlIllIl[1]];
                nArray18[ar.llIIlIllIl[0]] = nJ;
                if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                    a.a(nJ, llIIlIllIl[10]);
                    Time.sleepTicks((int)llIIlIllIl[1]);

                }
            }
            int[] nArray19 = new int[llIIlIllIl[1]];
            nArray19[ar.llIIlIllIl[0]] = llIIlIllIl[9];
            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                Bank.withdrawAll((int)llIIlIllIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                Time.sleepTicks((int)llIIlIllIl[1]);

            }
        }
    }

    private static boolean lIlIlIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean b(as as2, List<as> list) {
        return list.stream().anyMatch(as3 -> as3.nT.equals((Object)as2.nT));
    }

    private static boolean lIlIlIllIlIll(int n2) {
        return n2 == 0;
    }

    public static void Q() {
        d var42;
        block19: {
            block18: {
                block17: {
                    block16: {
                        int[] nArray = new int[llIIlIllIl[1]];
                        nArray[ar.llIIlIllIl[0]] = llIIlIllIl[8];
                        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(llIIlIllIl[8], llIIlIllIl[1], e.c(llIIlIllIl[228], llIIlIllIl[229]));
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[llIIlIllIl[1]];
                        nArray2[ar.llIIlIllIl[0]] = llIIlIllIl[230];
                        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var42 = new DHelper(llIIlIllIl[230], llIIlIllIl[2], llIIlIllIl[231]);
                            bv.add(var42);

                        }
                        int[] nArray3 = new int[llIIlIllIl[1]];
                        nArray3[ar.llIIlIllIl[0]] = llIIlIllIl[232];
                        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var42 = new DHelper(llIIlIllIl[232], llIIlIllIl[18], llIIlIllIl[233]);
                            bv.add(var42);

                        }
                        int[] nArray4 = new int[llIIlIllIl[1]];
                        nArray4[ar.llIIlIllIl[0]] = llIIlIllIl[22];
                        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var42 = new DHelper(llIIlIllIl[22], llIIlIllIl[1], e.c(llIIlIllIl[234], llIIlIllIl[235]));
                            bv.add(var42);

                        }
                        int[] nArray5 = new int[llIIlIllIl[1]];
                        nArray5[ar.llIIlIllIl[0]] = llIIlIllIl[23];
                        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var42 = new DHelper(llIIlIllIl[23], llIIlIllIl[1], e.c(llIIlIllIl[234], llIIlIllIl[235]));
                            bv.add(var42);

                        }
                        int[] nArray6 = new int[llIIlIllIl[1]];
                        nArray6[ar.llIIlIllIl[0]] = llIIlIllIl[185];
                        if (!ar.lIlIlIllIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block16;
                        int[] nArray7 = new int[llIIlIllIl[1]];
                        nArray7[ar.llIIlIllIl[0]] = llIIlIllIl[185];
                        if (!ar.lIlIlIllIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block17;
                        int[] nArray8 = new int[llIIlIllIl[1]];
                        nArray8[ar.llIIlIllIl[0]] = llIIlIllIl[185];
                        if (!ar.lIlIlIllIlIlI(Bank.getFirst((int[])nArray8).getQuantity(), llIIlIllIl[36])) break block17;
                    }
                    var42 = new DHelper(llIIlIllIl[185], llIIlIllIl[236], e.c(llIIlIllIl[237], llIIlIllIl[238]));
                    bv.add(var42);

                }
                int[] nArray = new int[llIIlIllIl[1]];
                nArray[ar.llIIlIllIl[0]] = llIIlIllIl[9];
                if (!ar.lIlIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block18;
                int[] nArray9 = new int[llIIlIllIl[1]];
                nArray9[ar.llIIlIllIl[0]] = llIIlIllIl[9];
                if (!ar.lIlIlIllIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block19;
                int[] nArray10 = new int[llIIlIllIl[1]];
                nArray10[ar.llIIlIllIl[0]] = llIIlIllIl[9];
                if (!ar.lIlIlIllIlIlI(Bank.getFirst((int[])nArray10).getQuantity(), llIIlIllIl[4])) break block19;
            }
            var42 = new DHelper(llIIlIllIl[9], llIIlIllIl[4], e.c(llIIlIllIl[159], llIIlIllIl[239]));
            bv.add(var42);

        }
        int[] nArray = new int[llIIlIllIl[1]];
        nArray[ar.llIIlIllIl[0]] = llIIlIllIl[240];
        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var42 = new DHelper(llIIlIllIl[240], llIIlIllIl[18], llIIlIllIl[241]);
            bv.add(var42);

        }
        int[] nArray11 = new int[llIIlIllIl[1]];
        nArray11[ar.llIIlIllIl[0]] = llIIlIllIl[242];
        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var42 = new DHelper(mU, llIIlIllIl[59], llIIlIllIl[243]);
            bv.add(var42);

        }
        int[] nArray12 = new int[llIIlIllIl[1]];
        nArray12[ar.llIIlIllIl[0]] = llIIlIllIl[244];
        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
            var42 = new DHelper(llIIlIllIl[244], llIIlIllIl[1], llIIlIllIl[245]);
            bv.add(var42);

        }
        int[] nArray13 = new int[llIIlIllIl[1]];
        nArray13[ar.llIIlIllIl[0]] = llIIlIllIl[7];
        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
            var42 = new DHelper(llIIlIllIl[7], llIIlIllIl[1], e.c(llIIlIllIl[246], llIIlIllIl[247]));
            bv.add(var42);

        }
        int[] nArray14 = new int[llIIlIllIl[1]];
        nArray14[ar.llIIlIllIl[0]] = llIIlIllIl[248];
        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
            var42 = new DHelper(llIIlIllIl[248], llIIlIllIl[36], j.cf);
            bv.add(var42);

        }
    }

    private static boolean a(as as2, PriorityQueue<as> priorityQueue) {
        return priorityQueue.stream().anyMatch(as3 -> as3.nT.equals((Object)as2.nT));
    }

    private static boolean lIlIlIlllIlll(int n2) {
        return n2 <= 0;
    }

    @Override
    public String ag() {
        return llIIlIlIlI[llIIlIllIl[249]];
    }

    @Override
    public boolean ae() {
        return llIIlIllIl[0];
    }
}

