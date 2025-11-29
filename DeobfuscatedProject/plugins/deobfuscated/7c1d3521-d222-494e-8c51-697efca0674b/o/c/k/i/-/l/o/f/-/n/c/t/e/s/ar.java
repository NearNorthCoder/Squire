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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.D;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.as;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class ar
implements ac {
    public static /* synthetic */ int mT;
    static /* synthetic */ long nS;
    static /* synthetic */ int cG;
    public static /* synthetic */ WorldPoint nI;
    public static /* synthetic */ String nN;
    public static /* synthetic */ int mV;
    private static /* synthetic */ int[] llIIlIllIl;
    static /* synthetic */ WorldArea nO;
    static /* synthetic */ WorldPoint nP;
    private static /* synthetic */ String[] llIIlIlIlI;
    public static /* synthetic */ WorldArea nM;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldArea nL;
    static /* synthetic */ WorldPoint nR;
    public static /* synthetic */ int mU;
    static /* synthetic */ WorldPoint nQ;
    public static /* synthetic */ int nK;
    public static /* synthetic */ int nJ;
    public static /* synthetic */ WorldArea nH;
    public static /* synthetic */ List<d> bv;

    private static boolean lIlIlIlllIIII(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIlIllIlIIl(int n2) {
        return n2 != 0;
    }

    public static void b(int[] nArray) {
        if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0) && ar.lIlIlIllIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] llllllllllllllllllIlIIIllIlIlIIl;
            String[] stringArray = new String[llIIlIllIl[1]];
            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[200]];
            if (ar.lIlIlIllIlIIl(Inventory.getFirst((int[])nArray).hasAction(stringArray) ? 1 : 0)) {
                Inventory.getFirst((int[])nArray).interact(llIIlIlIlI[llIIlIllIl[201]]);
            }
            String[] stringArray2 = new String[llIIlIllIl[1]];
            stringArray2[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[202]];
            if (ar.lIlIlIllIlIIl(Inventory.getFirst((int[])llllllllllllllllllIlIIIllIlIlIIl).hasAction(stringArray2) ? 1 : 0)) {
                Inventory.getFirst((int[])llllllllllllllllllIlIIIllIlIlIIl).interact(llIIlIlIlI[llIIlIllIl[203]]);
            }
            String[] stringArray3 = new String[llIIlIllIl[1]];
            stringArray3[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[204]];
            if (ar.lIlIlIllIlIIl(Inventory.getFirst((int[])llllllllllllllllllIlIIIllIlIlIIl).hasAction(stringArray3) ? 1 : 0)) {
                Inventory.getFirst((int[])llllllllllllllllllIlIIIllIlIlIIl).interact(llIIlIlIlI[llIIlIllIl[205]]);
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
        as llllllllllllllllllIlIIIllIllIIII;
        ArrayList<WorldPoint> llllllllllllllllllIlIIIllIlIllll = new ArrayList<WorldPoint>();
        while (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllIllIIII)) {
            llllllllllllllllllIlIIIllIlIllll.add(llllllllllllllllllIlIIIllIllIIII.nT);
            0;
            llllllllllllllllllIlIIIllIllIIII = llllllllllllllllllIlIIIllIllIIII.nU;
            0;
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
            0;
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
        Object llllllllllllllllllIlIIIllllIIlll;
        block117: {
            Object llllllllllllllllllIlIIIllllIIllI;
            block118: {
                Object llllllllllllllllllIlIIIllllIIlII;
                Object llllllllllllllllllIlIIIllllIIlIl;
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
                                                                    Object llllllllllllllllllIlIIIllllIlIII;
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
                                                                                            0;
                                                                                            if (null != null) {
                                                                                                return ((130 + 182 - 153 + 70 ^ 133 + 100 - 81 + 47) & (0x57 ^ 7 ^ (0x7F ^ 0xD) ^ -1)) != 0;
                                                                                            }
                                                                                        } else {
                                                                                            bl = llIIlIllIl[0];
                                                                                        }
                                                                                        return bl;
                                                                                    }, (int)llIIlIllIl[54], (int)llIIlIllIl[55]);
                                                                                    0;
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
                                                                                llllllllllllllllllIlIIIllllIlIII = tileObject -> {
                                                                                    String[] stringArray = new String[llIIlIllIl[1]];
                                                                                    stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[266]];
                                                                                    return tileObject.hasAction(stringArray);
                                                                                };
                                                                                llllllllllllllllllIlIIIllllIIlll = TileObjects.getNearest((Predicate)llllllllllllllllllIlIIIllllIlIII);
                                                                                if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllllIIlll)) {
                                                                                    llllllllllllllllllIlIIIllllIIlll.interact(llIIlIlIlI[llIIlIllIl[64]]);
                                                                                    Time.sleepUntil(() -> {
                                                                                        boolean bl;
                                                                                        if (ar.lIlIlIllIlIll(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                            bl = llIIlIllIl[1];
                                                                                            0;
                                                                                            if (null != null) {
                                                                                                return ((0x6E ^ 0x73) & ~(0x17 ^ 0xA)) != 0;
                                                                                            }
                                                                                        } else {
                                                                                            bl = llIIlIllIl[0];
                                                                                        }
                                                                                        return bl;
                                                                                    }, (int)Rand.nextInt((int)llIIlIllIl[65], (int)llIIlIllIl[66]));
                                                                                    0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    String[] stringArray = new String[llIIlIllIl[1]];
                                                                    stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[67]];
                                                                    if (ar.lIlIlIllIlllI(NPCs.getNearest((String[])stringArray)) && ar.lIlIlIllIlIll(nH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(nI), llIIlIllIl[68])) {
                                                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[69]];
                                                                        llllllllllllllllllIlIIIllllIlIII = tileObject -> {
                                                                            String[] stringArray = new String[llIIlIllIl[1]];
                                                                            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[265]];
                                                                            return tileObject.hasAction(stringArray);
                                                                        };
                                                                        llllllllllllllllllIlIIIllllIIlll = TileObjects.getNearest((Predicate)llllllllllllllllllIlIIIllllIlIII);
                                                                        if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllllIIlll)) {
                                                                            llllllllllllllllllIlIIIllllIIlll.interact(llIIlIlIlI[llIIlIllIl[70]]);
                                                                            Time.sleepUntil(() -> {
                                                                                boolean bl;
                                                                                if (ar.lIlIlIllIlIll(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                    bl = llIIlIllIl[1];
                                                                                    0;
                                                                                    if (1 < 1) {
                                                                                        return ((0x1C ^ 0x55) & ~(0x67 ^ 0x2E)) != 0;
                                                                                    }
                                                                                } else {
                                                                                    bl = llIIlIllIl[0];
                                                                                }
                                                                                return bl;
                                                                            }, (int)Rand.nextInt((int)llIIlIllIl[65], (int)llIIlIllIl[66]));
                                                                            0;
                                                                        }
                                                                    }
                                                                    llllllllllllllllllIlIIIllllIlIII = TileObjects.getNearest(tileObject -> tileObject.getName().contains(llIIlIlIlI[llIIlIllIl[264]]));
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
                                                                        llllllllllllllllllIlIIIllllIIlll = TileItems.getNearest((String[])stringArray10);
                                                                        if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllllIIlll)) {
                                                                            llllllllllllllllllIlIIIllllIIlll.interact(llIIlIlIlI[llIIlIllIl[74]]);
                                                                            Time.sleepTicks((int)llIIlIllIl[1]);
                                                                            0;
                                                                        }
                                                                        if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllllIIllI = TileItems.getNearest(tileItem -> tileItem.getName().contains(llIIlIlIlI[llIIlIllIl[263]])))) {
                                                                            // empty if block
                                                                        }
                                                                        String[] stringArray11 = new String[llIIlIllIl[1]];
                                                                        stringArray11[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[75]];
                                                                        llllllllllllllllllIlIIIllllIIlIl = NPCs.getNearest((String[])stringArray11);
                                                                        if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllllIIlIl) && ar.lIlIlIlllIlII(LocalPlayer.get().getInteracting(), llllllllllllllllllIlIIIllllIIlIl) && ar.lIlIlIllIlIll(llllllllllllllllllIlIIIllllIIlIl.isDead() ? 1 : 0) && ar.lIlIlIllIlIIl(Reachable.isInteractable((Locatable)llllllllllllllllllIlIIIllllIIlIl) ? 1 : 0)) {
                                                                            llllllllllllllllllIlIIIllllIIlIl.interact(llIIlIlIlI[llIIlIllIl[76]]);
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
                                                                    0;
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
                                                            0;
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
                                                            0;
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
                                                        0;
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
                                                0;
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
                                                0;
                                            }
                                            String[] stringArray31 = new String[llIIlIllIl[1]];
                                            stringArray31[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[105]];
                                            TileObjects.getNearest((String[])stringArray31).interact(llIIlIlIlI[llIIlIllIl[106]]);
                                            Time.sleepTicks((int)llIIlIllIl[2]);
                                            0;
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
                                            0;
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
                                    0;
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
                                    0;
                                }
                                String[] stringArray42 = new String[llIIlIllIl[1]];
                                stringArray42[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[121]];
                                TileObjects.getNearest((String[])stringArray42).interact(llIIlIlIlI[llIIlIllIl[122]]);
                                Time.sleepTicks((int)llIIlIllIl[2]);
                                0;
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
                            llllllllllllllllllIlIIIllllIIlll = TileObjects.getAll((String[])stringArray43);
                            llllllllllllllllllIlIIIllllIIllI = llllllllllllllllllIlIIIllllIIlll.stream().filter(tileObject -> {
                                String[] stringArray = new String[llIIlIllIl[1]];
                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[262]];
                                return tileObject.hasAction(stringArray);
                            }).collect(Collectors.toList());
                            llllllllllllllllllIlIIIllllIIlIl = null;
                            llllllllllllllllllIlIIIllllIIlII = TileObjects.getNearest(tileObject -> {
                                int n2;
                                String[] stringArray = new String[llIIlIllIl[1]];
                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[260]];
                                if (ar.lIlIlIllIlIIl(tileObject.hasAction(stringArray) ? 1 : 0) && ar.lIlIlIllIlIIl(tileObject.getName().equals(llIIlIlIlI[llIIlIllIl[261]]) ? 1 : 0)) {
                                    n2 = llIIlIllIl[1];
                                    0;
                                    if (((0xD0 ^ 0x9C ^ 3) & (132 + 49 - -5 + 61 ^ 160 + 142 - 146 + 28 ^ -1)) < -1) {
                                        return ((0x40 ^ 0x47 ^ (0x5A ^ 0x75)) & (149 + 70 - 155 + 115 ^ 22 + 22 - -16 + 95 ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = llIIlIllIl[0];
                                }
                                return n2 != 0;
                            });
                            if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllllIIlII)) {
                                if (ar.lIlIlIlllIIIl(Players.getLocal().getWorldX(), llllllllllllllllllIlIIIllllIIlII.getWorldX())) {
                                    llllllllllllllllllIlIIIllllIIlIl = TileObjects.getNearest(tileObject -> {
                                        String[] stringArray = new String[llIIlIllIl[1]];
                                        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[259]];
                                        return tileObject.hasAction(stringArray);
                                    });
                                    if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllllIIlIl)) {
                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[126]];
                                        llllllllllllllllllIlIIIllllIIlIl.interact(llIIlIlIlI[llIIlIllIl[127]]);
                                        Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[14]));
                                        0;
                                        0;
                                        if (((0x7F ^ 0x3C ^ (0x9E ^ 0x82)) & (0x27 ^ 0x44 ^ (0x8A ^ 0xB6) ^ -1)) != 0) {
                                            return;
                                        }
                                    }
                                } else {
                                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[128]];
                                    llllllllllllllllllIlIIIllllIIlII.interact(llIIlIlIlI[llIIlIllIl[129]]);
                                    Time.sleepTicks((int)llIIlIllIl[11]);
                                    0;
                                }
                            }
                        }
                        String[] stringArray44 = new String[llIIlIllIl[1]];
                        stringArray44[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[130]];
                        if (!ar.lIlIlIllIlllI(TileObjects.getNearest((String[])stringArray44))) break block117;
                        nR = null;
                        String[] stringArray45 = new String[llIIlIllIl[1]];
                        stringArray45[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[131]];
                        llllllllllllllllllIlIIIllllIIlll = TileObjects.getAll((String[])stringArray45);
                        llllllllllllllllllIlIIIllllIIllI = llllllllllllllllllIlIIIllllIIlll.stream().filter(tileObject -> {
                            String[] stringArray = new String[llIIlIllIl[1]];
                            stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[258]];
                            return tileObject.hasAction(stringArray);
                        }).collect(Collectors.toList());
                        if (!ar.lIlIlIllIlIll(llllllllllllllllllIlIIIllllIIllI.isEmpty() ? 1 : 0)) break block117;
                        if (!ar.lIlIlIllIlIll(Reachable.isInteractable((Locatable)((Locatable)llllllllllllllllllIlIIIllllIIllI.get(llIIlIllIl[0]))) ? 1 : 0)) break block118;
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
                    llllllllllllllllllIlIIIllllIIlIl = TileObjects.getAll((String[])stringArray);
                    llllllllllllllllllIlIIIllllIIlII = llllllllllllllllllIlIIIllllIIlIl.stream().filter(tileObject -> {
                        String[] stringArray = new String[llIIlIllIl[1]];
                        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[257]];
                        return tileObject.hasAction(stringArray);
                    }).collect(Collectors.toList());
                    if (ar.lIlIlIllIlIll(llllllllllllllllllIlIIIllllIIlII.isEmpty() ? 1 : 0)) {
                        ((TileObject)llllllllllllllllllIlIIIllllIIlII.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[136]]);
                        Time.sleepTicks((int)llIIlIllIl[2]);
                        0;
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
                    0;
                }
                String[] stringArray53 = new String[llIIlIllIl[1]];
                stringArray53[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[144]];
                llllllllllllllllllIlIIIllllIIlIl = TileObjects.getAll((String[])stringArray53);
                llllllllllllllllllIlIIIllllIIlII = llllllllllllllllllIlIIIllllIIlIl.stream().filter(tileObject -> {
                    String[] stringArray = new String[llIIlIllIl[1]];
                    stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[256]];
                    return tileObject.hasAction(stringArray);
                }).collect(Collectors.toList());
                if (ar.lIlIlIllIlIll(llllllllllllllllllIlIIIllllIIlII.isEmpty() ? 1 : 0)) {
                    ((TileObject)llllllllllllllllllIlIIIllllIIlII.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[145]]);
                    Time.sleepTicks((int)llIIlIllIl[15]);
                    0;
                }
            }
            if (ar.lIlIlIllIlIIl(Reachable.isInteractable((Locatable)((Locatable)llllllllllllllllllIlIIIllllIIllI.get(llIIlIllIl[0]))) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[146]];
                ((TileObject)llllllllllllllllllIlIIIllllIIllI.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[147]]);
                Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[14]));
                0;
            }
        }
        String[] stringArray = new String[llIIlIllIl[1]];
        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[148]];
        if (ar.lIlIlIllIlllI(TileObjects.getNearest((String[])stringArray))) {
            block103: {
                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[149]];
                System.out.println(llIIlIlIlI[llIIlIllIl[150]]);
                llllllllllllllllllIlIIIllllIIlll = new ArrayList();
                long llllllllllllllllllIlIIIllllIIllI = System.currentTimeMillis();
                do {
                    WorldPoint llllllllllllllllllIlIIIlllIlllIl;
                    Object llllllllllllllllllIlIIIlllIllllI;
                    List<WorldPoint> llllllllllllllllllIlIIIlllIlllll;
                    int llllllllllllllllllIlIIIllllIIIII;
                    int llllllllllllllllllIlIIIllllIIIIl;
                    List<WorldPoint> llllllllllllllllllIlIIIllllIIIlI;
                    TileObject llllllllllllllllllIlIIIllllIIIll;
                    String[] stringArray54 = new String[llIIlIllIl[1]];
                    stringArray54[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[151]];
                    if (!ar.lIlIlIllIlIll(TileObjects.getAll((String[])stringArray54).isEmpty() ? 1 : 0) || !ar.lIlIlIlllIllI(Game.getState(), GameState.LOGGED_IN) || !ar.lIlIlIllIlIll(AccBuilderSotf.d ? 1 : 0)) break block103;
                    int llllllllllllllllllIlIIIllllIIlII = llIIlIllIl[0];
                    if (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllllIIlll.isEmpty() ? 1 : 0)) {
                        Time.sleepTicks((int)llIIlIllIl[15]);
                        0;
                        System.out.println(llIIlIlIlI[llIIlIllIl[152]]);
                        llllllllllllllllllIlIIIllllIIlll = TileObjects.getAll(tileObject -> {
                            boolean bl;
                            if (ar.lIlIlIlllIlIl(tileObject.getId(), llIIlIllIl[255])) {
                                bl = llIIlIllIl[1];
                                0;
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
                        llllllllllllllllllIlIIIllllIIIll = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (ar.lIlIlIllIlIIl(tileObject.getName().contains(llIIlIlIlI[llIIlIllIl[253]]) ? 1 : 0)) {
                                String[] stringArray = new String[llIIlIllIl[1]];
                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[254]];
                                if (ar.lIlIlIllIlIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = llIIlIllIl[1];
                                    0;
                                    if ((0x44 ^ 0x40) != -1) return n2 != 0;
                                    return ((0xFD ^ 0xAC) & ~(0xD1 ^ 0x80)) != 0;
                                }
                            }
                            n2 = llIIlIllIl[0];
                            return n2 != 0;
                        });
                        if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllllIIIll) && ar.lIlIlIllIllII(llllllllllllllllllIlIIIllllIIIll.getWorldLocation().getY(), nR.getY() + llIIlIllIl[17])) {
                            llllllllllllllllllIlIIIllllIIlII = llIIlIllIl[1];
                        }
                    }
                    System.out.println("Version: " + (llllllllllllllllllIlIIIllllIIlII != 0));
                    if (ar.lIlIlIllIlIll(llllllllllllllllllIlIIIllllIIlII)) {
                        if (ar.lIlIlIllIlllI(nR) && ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[17])) {
                            llllllllllllllllllIlIIIllllIIIll = llllllllllllllllllIlIIIllllIIlll.stream().map(tileObject -> tileObject.getWorldLocation()).collect(Collectors.toList());
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
                            llllllllllllllllllIlIIIllllIIIlI = Arrays.asList(worldPointArray);
                            System.out.println("Start tiles: " + llllllllllllllllllIlIIIllllIIIlI.size());
                            llllllllllllllllllIlIIIllllIIIIl = llIIlIllIl[0];
                            llllllllllllllllllIlIIIllllIIIII = llIIlIllIl[0];
                            while (ar.lIlIlIllIlIlI(llllllllllllllllllIlIIIllllIIIII, llllllllllllllllllIlIIIllllIIIlI.size())) {
                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[155]];
                                llllllllllllllllllIlIIIlllIlllll = ar.a(llllllllllllllllllIlIIIllllIIIlI.get(llllllllllllllllllIlIIIllllIIIII), nR.getY() - llIIlIllIl[17], (List<WorldPoint>)llllllllllllllllllIlIIIllllIIIll);
                                if (ar.lIlIlIllIlIll(llllllllllllllllllIlIIIlllIlllll.isEmpty() ? 1 : 0)) {
                                    System.out.println(llIIlIlIlI[llIIlIllIl[156]]);
                                    llllllllllllllllllIlIIIlllIllllI = llllllllllllllllllIlIIIlllIlllll.iterator();
                                    while (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIlllIllllI.hasNext() ? 1 : 0)) {
                                        llllllllllllllllllIlIIIlllIlllIl = llllllllllllllllllIlIIIlllIllllI.next();
                                        System.out.println("(" + llllllllllllllllllIlIIIlllIlllIl.getX() + ", " + llllllllllllllllllIlIIIlllIlllIl.getY() + ", " + llllllllllllllllllIlIIIlllIlllIl.getPlane() + ")");
                                        0;
                                        if (-(0x31 ^ 0x34) < 0) continue;
                                        return;
                                    }
                                    llllllllllllllllllIlIIIllllIIIIl = llIIlIllIl[1];
                                    while (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllllIIIIl) && ar.lIlIlIllIlIll(llllllllllllllllllIlIIIlllIlllll.isEmpty() ? 1 : 0)) {
                                        if (ar.lIlIlIllIlIll(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIIIlllIlllll.get(llIIlIllIl[0])) ? 1 : 0)) {
                                            if (ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[11])) {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[157]];
                                                e.c(llllllllllllllllllIlIIIlllIlllll.get(llIIlIllIl[0]));
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    if (ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[11])) {
                                                        bl = llIIlIllIl[1];
                                                        0;
                                                        if (3 <= ((0xFD ^ 0xBE) & ~(0x7B ^ 0x38))) {
                                                            return ((0x37 ^ 0x6D) & ~(0x53 ^ 9)) != 0;
                                                        }
                                                    } else {
                                                        bl = llIIlIllIl[0];
                                                    }
                                                    return bl;
                                                }, (int)e.c(llIIlIllIl[158], llIIlIllIl[159]));
                                                0;
                                                Time.sleepTicks((int)llIIlIllIl[2]);
                                                0;
                                                0;
                                                if (-1 >= 0) {
                                                    return;
                                                }
                                            } else {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[160]];
                                                String[] stringArray56 = new String[llIIlIllIl[1]];
                                                stringArray56[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[161]];
                                                llllllllllllllllllIlIIIlllIllllI = TileObjects.getAt((WorldPoint)llllllllllllllllllIlIIIlllIlllll.get(llIIlIllIl[0]), (String[])stringArray56);
                                                if (ar.lIlIlIllIlIll(llllllllllllllllllIlIIIlllIllllI.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog size: " + llllllllllllllllllIlIIIlllIllllI.size());
                                                    ((TileObject)llllllllllllllllllIlIIIlllIllllI.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[162]]);
                                                    Time.sleepTicks((int)llIIlIllIl[2]);
                                                    0;
                                                }
                                                if (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIlllIllllI.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog is null at: " + String.valueOf(llllllllllllllllllIlIIIlllIlllll.get(llIIlIllIl[0])));
                                                    Game.logout();
                                                    Time.sleepTicks((int)llIIlIllIl[2]);
                                                    0;
                                                    0;
                                                    if (null == null) break;
                                                    return;
                                                }
                                            }
                                        }
                                        if (ar.lIlIlIllIlIIl(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIIIlllIlllll.get(llIIlIllIl[0])) ? 1 : 0)) {
                                            System.out.println(llIIlIlIlI[llIIlIllIl[163]]);
                                            llllllllllllllllllIlIIIlllIlllll.remove(llIIlIllIl[0]);
                                            0;
                                            Time.sleepTicks((int)llIIlIllIl[2]);
                                            0;
                                        }
                                        Time.sleepTicks((int)llIIlIllIl[1]);
                                        0;
                                        0;
                                        if (null == null) continue;
                                        return;
                                    }
                                    if (!ar.lIlIlIlllIlII(Game.getState(), GameState.LOGGED_IN)) break;
                                    System.out.println(llIIlIlIlI[llIIlIllIl[164]]);
                                    0;
                                    if (3 != ((0x92 ^ 0x9D) & ~(0xAD ^ 0xA2))) break;
                                    return;
                                }
                                ++llllllllllllllllllIlIIIllllIIIII;
                                0;
                                if (3 != 0) continue;
                                return;
                            }
                            if (ar.lIlIlIllIlIll(llllllllllllllllllIlIIIllllIIIIl)) {
                                System.out.println(llIIlIlIlI[llIIlIllIl[165]]);
                            }
                            System.out.println(llllllllllllllllllIlIIIllllIIlll.size());
                        }
                        if (ar.lIlIlIllIlllI(nR) && ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIIlIllIl[17])) {
                            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[166]];
                            String[] stringArray57 = new String[llIIlIllIl[1]];
                            stringArray57[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[167]];
                            TileObjects.getNearest((String[])stringArray57).interact(llIIlIlIlI[llIIlIllIl[168]]);
                            Time.sleepTicks((int)llIIlIllIl[11]);
                            0;
                        }
                    }
                    if (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllllIIlII)) {
                        if (ar.lIlIlIllIlllI(nR) && ar.lIlIlIllIlIlI(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[17])) {
                            llllllllllllllllllIlIIIllllIIIll = llllllllllllllllllIlIIIllllIIlll.stream().map(tileObject -> tileObject.getWorldLocation()).collect(Collectors.toList());
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
                            llllllllllllllllllIlIIIllllIIIlI = Arrays.asList(worldPointArray);
                            System.out.println("Start tiles: " + llllllllllllllllllIlIIIllllIIIlI.size());
                            llllllllllllllllllIlIIIllllIIIIl = llIIlIllIl[0];
                            llllllllllllllllllIlIIIllllIIIII = llIIlIllIl[0];
                            while (ar.lIlIlIllIlIlI(llllllllllllllllllIlIIIllllIIIII, llllllllllllllllllIlIIIllllIIIlI.size())) {
                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[169]];
                                llllllllllllllllllIlIIIlllIlllll = ar.a(llllllllllllllllllIlIIIllllIIIlI.get(llllllllllllllllllIlIIIllllIIIII), nR.getY() + llIIlIllIl[17], (List<WorldPoint>)llllllllllllllllllIlIIIllllIIIll);
                                if (ar.lIlIlIllIlIll(llllllllllllllllllIlIIIlllIlllll.isEmpty() ? 1 : 0)) {
                                    System.out.println(llIIlIlIlI[llIIlIllIl[170]]);
                                    llllllllllllllllllIlIIIlllIllllI = llllllllllllllllllIlIIIlllIlllll.iterator();
                                    while (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIlllIllllI.hasNext() ? 1 : 0)) {
                                        llllllllllllllllllIlIIIlllIlllIl = llllllllllllllllllIlIIIlllIllllI.next();
                                        System.out.println("(" + llllllllllllllllllIlIIIlllIlllIl.getX() + ", " + llllllllllllllllllIlIIIlllIlllIl.getY() + ", " + llllllllllllllllllIlIIIlllIlllIl.getPlane() + ")");
                                        0;
                                        if (2 != 0) continue;
                                        return;
                                    }
                                    llllllllllllllllllIlIIIllllIIIIl = llIIlIllIl[1];
                                    while (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllllIIIIl) && ar.lIlIlIllIlIll(llllllllllllllllllIlIIIlllIlllll.isEmpty() ? 1 : 0)) {
                                        if (ar.lIlIlIllIlIll(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIIIlllIlllll.get(llIIlIllIl[0])) ? 1 : 0)) {
                                            if (ar.lIlIlIllIlIlI(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[11])) {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[171]];
                                                e.c(llllllllllllllllllIlIIIlllIlllll.get(llIIlIllIl[0]));
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    if (ar.lIlIlIllIlIlI(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[11])) {
                                                        bl = llIIlIllIl[1];
                                                        0;
                                                        if (-1 >= 3) {
                                                            return ((0x4E ^ 1) & ~(0x27 ^ 0x68)) != 0;
                                                        }
                                                    } else {
                                                        bl = llIIlIllIl[0];
                                                    }
                                                    return bl;
                                                }, (int)e.c(llIIlIllIl[158], llIIlIllIl[159]));
                                                0;
                                                Time.sleepTicks((int)llIIlIllIl[2]);
                                                0;
                                                0;
                                                if (3 == 0) {
                                                    return;
                                                }
                                            } else {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[172]];
                                                String[] stringArray58 = new String[llIIlIllIl[1]];
                                                stringArray58[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[173]];
                                                llllllllllllllllllIlIIIlllIllllI = TileObjects.getAt((WorldPoint)llllllllllllllllllIlIIIlllIlllll.get(llIIlIllIl[0]), (String[])stringArray58);
                                                if (ar.lIlIlIllIlIll(llllllllllllllllllIlIIIlllIllllI.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog size: " + llllllllllllllllllIlIIIlllIllllI.size());
                                                    ((TileObject)llllllllllllllllllIlIIIlllIllllI.get(llIIlIllIl[0])).interact(llIIlIlIlI[llIIlIllIl[174]]);
                                                    Time.sleepTicks((int)llIIlIllIl[2]);
                                                    0;
                                                }
                                                if (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIlllIllllI.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog is null at: " + String.valueOf(llllllllllllllllllIlIIIlllIlllll.get(llIIlIllIl[0])));
                                                    Game.logout();
                                                    Time.sleepTicks((int)llIIlIllIl[2]);
                                                    0;
                                                    0;
                                                    if (-(0x9D ^ 0x99) < 0) break;
                                                    return;
                                                }
                                                Time.sleepTicks((int)llIIlIllIl[2]);
                                                0;
                                            }
                                        }
                                        if (ar.lIlIlIllIlIIl(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIlIIIlllIlllll.get(llIIlIllIl[0])) ? 1 : 0)) {
                                            System.out.println(llIIlIlIlI[llIIlIllIl[175]]);
                                            llllllllllllllllllIlIIIlllIlllll.remove(llIIlIllIl[0]);
                                            0;
                                            Time.sleepTicks((int)llIIlIllIl[2]);
                                            0;
                                        }
                                        System.out.println("Path size lefT: " + llllllllllllllllllIlIIIlllIlllll.size());
                                        Time.sleepTicks((int)llIIlIllIl[1]);
                                        0;
                                        0;
                                        if (2 != 0) continue;
                                        return;
                                    }
                                    if (!ar.lIlIlIlllIlII(Game.getState(), GameState.LOGGED_IN)) break;
                                    System.out.println(llIIlIlIlI[llIIlIllIl[176]]);
                                    0;
                                    if (null == null) break;
                                    return;
                                }
                                ++llllllllllllllllllIlIIIllllIIIII;
                                0;
                                if ((39 + 60 - -12 + 17 ^ 125 + 48 - 123 + 83) > 0) continue;
                                return;
                            }
                            if (ar.lIlIlIllIlIll(llllllllllllllllllIlIIIllllIIIIl)) {
                                System.out.println(llIIlIlIlI[llIIlIllIl[177]]);
                            }
                            System.out.println(llllllllllllllllllIlIIIllllIIlll.size());
                        }
                        if (ar.lIlIlIllIlllI(nR) && ar.lIlIlIlllIIIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIIlIllIl[17])) {
                            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[178]];
                            String[] stringArray59 = new String[llIIlIllIl[1]];
                            stringArray59[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[179]];
                            TileObjects.getNearest((String[])stringArray59).interact(llIIlIlIlI[llIIlIllIl[180]]);
                            Time.sleepTicks((int)llIIlIllIl[11]);
                            0;
                        }
                    }
                    if (ar.lIlIlIlllIIII(ar.lIlIlIlllIIlI(System.currentTimeMillis(), llllllllllllllllllIlIIIllllIIllI + 45000L))) {
                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[181]];
                        Game.logout();
                        llllllllllllllllllIlIIIllllIIllI = System.currentTimeMillis();
                    }
                    0;
                } while (2 != 3);
                return;
            }
            int[] nArray = new int[llIIlIllIl[1]];
            nArray[ar.llIIlIllIl[0]] = llIIlIllIl[9];
            if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));
                0;
                mV = llIIlIllIl[0];
            }
        }
        if (ar.lIlIlIllIlIll(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ar.lIlIlIllIlIll(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ar.lIlIlIlllIlll(ar.lIlIlIlllIIll(e.w(), 25.0))) {
            int[] nArray = new int[llIIlIllIl[1]];
            nArray[ar.llIIlIllIl[0]] = llIIlIllIl[9];
            if (ar.lIlIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));
                0;
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
        ar.llIIlIlIlI[ar.llIIlIllIl[0]] = ar."Buying items";
        ar.llIIlIlIlI[ar.llIIlIllIl[1]] = ar."Finished buying items, switching back to agility";
        ar.llIIlIlIlI[ar.llIIlIllIl[2]] = ar."Read";
        ar.llIIlIlIlI[ar.llIIlIllIl[10]] = ar."Break";
        ar.llIIlIlIlI[ar.llIIlIllIl[11]] = ar."Navigating to bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[14]] = ar."Veliaf Hurtz";
        ar.llIIlIlIlI[ar.llIIlIllIl[15]] = ar."Ladder";
        ar.llIIlIlIlI[ar.llIIlIllIl[3]] = ar."Climb-up";
        ar.llIIlIlIlI[ar.llIIlIllIl[16]] = ar."Veliaf Hurtz";
        ar.llIIlIlIlI[ar.llIIlIllIl[17]] = ar."Nav to burgh bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[18]] = ar."Handling banking";
        ar.llIIlIlIlI[ar.llIIlIllIl[20]] = ar."Bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[24]] = ar."Vial";
        ar.llIIlIlIlI[ar.llIIlIllIl[25]] = ar."Vial";
        ar.llIIlIlIlI[ar.llIIlIllIl[26]] = ar."Drop";
        ar.llIIlIlIlI[ar.llIIlIllIl[28]] = ar."Drink";
        ar.llIIlIlIlI[ar.llIIlIllIl[30]] = ar."Read";
        ar.llIIlIlIlI[ar.llIIlIllIl[31]] = ar."Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[32]] = ar."Nav to city escort tile";
        ar.llIIlIlIlI[ar.llIIlIllIl[33]] = ar."Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[36]] = ar."Clicking npc";
        ar.llIIlIlIlI[ar.llIIlIllIl[38]] = ar."Escort";
        ar.llIIlIlIlI[ar.llIIlIllIl[39]] = ar."Yes.";
        ar.llIIlIlIlI[ar.llIIlIllIl[40]] = ar."Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[41]] = ar."Nav to npc";
        ar.llIIlIlIlI[ar.llIIlIllIl[29]] = ar."Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[42]] = ar."Clicking npc";
        ar.llIIlIlIlI[ar.llIIlIllIl[44]] = ar."Escort";
        ar.llIIlIlIlI[ar.llIIlIllIl[45]] = ar."Knife";
        ar.llIIlIlIlI[ar.llIIlIllIl[46]] = ar."Hammer";
        ar.llIIlIlIlI[ar.llIIlIllIl[4]] = ar."Nav to canafis bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[47]] = ar."Nav to burgh bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[48]] = ar."Handle banking";
        ar.llIIlIlIlI[ar.llIIlIllIl[49]] = ar."Handle banking";
        ar.llIIlIlIlI[ar.llIIlIllIl[50]] = ar."Eat";
        ar.llIIlIlIlI[ar.llIIlIllIl[52]] = ar."Yes.";
        ar.llIIlIlIlI[ar.llIIlIllIl[53]] = ar."Starting trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[56]] = ar."Vampyre Juvinate";
        ar.llIIlIlIlI[ar.llIIlIllIl[57]] = ar."Giant snail";
        ar.llIIlIlIlI[ar.llIIlIllIl[58]] = ar."Nail beast";
        ar.llIIlIlIlI[ar.llIIlIllIl[59]] = ar."Abidor Crank";
        ar.llIIlIlIlI[ar.llIIlIllIl[60]] = ar."Swamp snake";
        ar.llIIlIlIlI[ar.llIIlIllIl[61]] = ar."Riyl shadow";
        ar.llIIlIlIlI[ar.llIIlIllIl[62]] = ar."Bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[63]] = ar."Evading combat event";
        ar.llIIlIlIlI[ar.llIIlIllIl[64]] = ar."Evade-event";
        ar.llIIlIlIlI[ar.llIIlIllIl[67]] = ar."Ghast";
        ar.llIIlIlIlI[ar.llIIlIllIl[69]] = ar."Evading ghast event";
        ar.llIIlIlIlI[ar.llIIlIllIl[70]] = ar."Evade-event";
        ar.llIIlIlIlI[ar.llIIlIllIl[71]] = ar."Broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[27]] = ar."broken bridge event";
        ar.llIIlIlIlI[ar.llIIlIllIl[72]] = ar."Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[73]] = ar."Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[74]] = ar."Take";
        ar.llIIlIlIlI[ar.llIIlIllIl[75]] = ar."Undead Lumberjack";
        ar.llIIlIlIlI[ar.llIIlIllIl[76]] = ar."Attack";
        ar.llIIlIlIlI[ar.llIIlIllIl[77]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[78]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[79]] = ar."Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[81]] = ar."Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[68]] = ar."Chop down";
        ar.llIIlIlIlI[ar.llIIlIllIl[82]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[83]] = ar."Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[84]] = ar."Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[85]] = ar."Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[86]] = ar."Broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[87]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[88]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[89]] = ar."Broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[90]] = ar."Yes.";
        ar.llIIlIlIlI[ar.llIIlIllIl[91]] = ar."Partially broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[92]] = ar."partial bridge event";
        ar.llIIlIlIlI[ar.llIIlIllIl[93]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[94]] = ar."Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[95]] = ar."Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[96]] = ar."Chop down";
        ar.llIIlIlIlI[ar.llIIlIllIl[97]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[98]] = ar."Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[99]] = ar."Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[100]] = ar."Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[101]] = ar."Partially broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[102]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[103]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[104]] = ar."Partially broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[105]] = ar."Partially broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[106]] = ar."Inspect";
        ar.llIIlIlIlI[ar.llIIlIllIl[107]] = ar."Yes.";
        ar.llIIlIlIlI[ar.llIIlIllIl[108]] = ar."Slightly broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[109]] = ar."slightly bridge event";
        ar.llIIlIlIlI[ar.llIIlIllIl[110]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[111]] = ar."Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[112]] = ar."Dead tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[113]] = ar."Chop down";
        ar.llIIlIlIlI[ar.llIIlIllIl[114]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[115]] = ar."Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[116]] = ar."Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[117]] = ar."Plank";
        ar.llIIlIlIlI[ar.llIIlIllIl[118]] = ar."Slightly broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[119]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[120]] = ar."Logs";
        ar.llIIlIlIlI[ar.llIIlIllIl[13]] = ar."Slightly broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[121]] = ar."Slightly broken bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[122]] = ar."Inspect";
        ar.llIIlIlIlI[ar.llIIlIllIl[123]] = ar."Yes.";
        ar.llIIlIlIlI[ar.llIIlIllIl[124]] = ar."Fixed bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[125]] = ar."Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[126]] = ar."Continuing trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[127]] = ar."Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[128]] = ar."Crossing bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[129]] = ar."Cross";
        ar.llIIlIlIlI[ar.llIIlIllIl[130]] = ar."Swamp tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[131]] = ar."Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[132]] = ar."Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[133]] = ar."Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[134]] = ar."Cutting vines";
        ar.llIIlIlIlI[ar.llIIlIllIl[135]] = ar."Swamp tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[136]] = ar."Cut-vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[137]] = ar."Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[138]] = ar."Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[139]] = ar."Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[140]] = ar."Short vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[141]] = ar."Long vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[142]] = ar."Long vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[144]] = ar."Swamp tree branch";
        ar.llIIlIlIlI[ar.llIIlIllIl[145]] = ar."Swing-from";
        ar.llIIlIlIlI[ar.llIIlIllIl[146]] = ar."Continuing trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[147]] = ar."Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[148]] = ar."Bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[149]] = ar."Solving bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[150]] = ar."Start of bog section";
        ar.llIIlIlIlI[ar.llIIlIllIl[151]] = ar."Bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[152]] = ar."Set tiles";
        ar.llIIlIlIlI[ar.llIIlIllIl[153]] = ar."Set anchor";
        ar.llIIlIlIlI[ar.llIIlIllIl[154]] = ar."Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[155]] = ar."Generating path";
        ar.llIIlIlIlI[ar.llIIlIllIl[156]] = ar."Path found:";
        ar.llIIlIlIlI[ar.llIIlIllIl[157]] = ar."Walk to start tile";
        ar.llIIlIlIlI[ar.llIIlIllIl[160]] = ar."Navigating bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[161]] = ar."Bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[162]] = ar."Stand-on";
        ar.llIIlIlIlI[ar.llIIlIllIl[163]] = ar."Removed tile";
        ar.llIIlIlIlI[ar.llIIlIllIl[164]] = ar."Not logged in, breaking";
        ar.llIIlIlIlI[ar.llIIlIllIl[165]] = ar."No path found.";
        ar.llIIlIlIlI[ar.llIIlIllIl[166]] = ar."Continue trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[167]] = ar."Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[168]] = ar."Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[169]] = ar."Generating path";
        ar.llIIlIlIlI[ar.llIIlIllIl[170]] = ar."Path found:";
        ar.llIIlIlIlI[ar.llIIlIllIl[171]] = ar."Walk to start tile";
        ar.llIIlIlIlI[ar.llIIlIllIl[172]] = ar."Navigating bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[173]] = ar."Bog";
        ar.llIIlIlIlI[ar.llIIlIllIl[174]] = ar."Stand-on";
        ar.llIIlIlIlI[ar.llIIlIllIl[175]] = ar."Removed tile";
        ar.llIIlIlIlI[ar.llIIlIllIl[176]] = ar."Not logged in, breaking";
        ar.llIIlIlIlI[ar.llIIlIllIl[177]] = ar."No path found.";
        ar.llIIlIlIlI[ar.llIIlIllIl[178]] = ar."Continue trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[179]] = ar."Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[180]] = ar."Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[181]] = ar."In bog too long, logging to reset";
        ar.llIIlIlIlI[ar.llIIlIllIl[182]] = ar."Handling banking";
        ar.llIIlIlIlI[ar.llIIlIllIl[183]] = ar."Bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[184]] = ar."Bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[186]] = ar."Needs items, banking";
        ar.llIIlIlIlI[ar.llIIlIllIl[187]] = ar."Dragon sword";
        ar.llIIlIlIlI[ar.llIIlIllIl[188]] = ar."Dragon sword";
        ar.llIIlIlIlI[ar.llIIlIllIl[191]] = ar."Bronze axe";
        ar.llIIlIlIlI[ar.llIIlIllIl[192]] = ar."Wear";
        ar.llIIlIlIlI[ar.llIIlIllIl[193]] = ar."Wear";
        ar.llIIlIlIlI[ar.llIIlIllIl[194]] = ar."Wield";
        ar.llIIlIlIlI[ar.llIIlIllIl[195]] = ar."Wield";
        ar.llIIlIlIlI[ar.llIIlIllIl[196]] = ar."Equip";
        ar.llIIlIlIlI[ar.llIIlIllIl[197]] = ar."Equip";
        ar.llIIlIlIlI[ar.llIIlIllIl[199]] = ar."Give me a PK skull.";
        ar.llIIlIlIlI[ar.llIIlIllIl[200]] = ar."Wear";
        ar.llIIlIlIlI[ar.llIIlIllIl[201]] = ar."Wear";
        ar.llIIlIlIlI[ar.llIIlIllIl[202]] = ar."Wield";
        ar.llIIlIlIlI[ar.llIIlIllIl[203]] = ar."Wield";
        ar.llIIlIlIlI[ar.llIIlIllIl[204]] = ar."Equip";
        ar.llIIlIlIlI[ar.llIIlIllIl[205]] = ar."Equip";
        ar.llIIlIlIlI[ar.llIIlIllIl[206]] = ar."Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[207]] = ar."Claiming reward;";
        ar.llIIlIlIlI[ar.llIIlIllIl[208]] = ar."Reward token";
        ar.llIIlIlIlI[ar.llIIlIllIl[209]] = ar."Look-at";
        ar.llIIlIlIlI[ar.llIIlIllIl[211]] = ar."Selecting reward";
        ar.llIIlIlIlI[ar.llIIlIllIl[212]] = ar."xp";
        ar.llIIlIlIlI[ar.llIIlIllIl[213]] = ar."Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[214]] = ar."bs";
        ar.llIIlIlIlI[ar.llIIlIllIl[215]] = ar."Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[216]] = ar."ess";
        ar.llIIlIlIlI[ar.llIIlIllIl[217]] = ar."Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[218]] = ar."bars";
        ar.llIIlIlIlI[ar.llIIlIllIl[219]] = ar."Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[220]] = ar."herbs";
        ar.llIIlIlIlI[ar.llIIlIllIl[221]] = ar."Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[222]] = ar."ores";
        ar.llIIlIlIlI[ar.llIIlIllIl[223]] = ar."Details";
        ar.llIIlIlIlI[ar.llIIlIllIl[224]] = ar."Claiming";
        ar.llIIlIlIlI[ar.llIIlIllIl[226]] = ar."Claim";
        ar.llIIlIlIlI[ar.llIIlIllIl[227]] = ar."Read";
        ar.llIIlIlIlI[ar.llIIlIllIl[249]] = ar."Temple trekking";
        ar.llIIlIlIlI[ar.llIIlIllIl[250]] = ar."tome";
        ar.llIIlIlIlI[ar.llIIlIllIl[251]] = ar."Bank booth";
        ar.llIIlIlIlI[ar.llIIlIllIl[252]] = ar."Bank";
        ar.llIIlIlIlI[ar.llIIlIllIl[253]] = ar."Path";
        ar.llIIlIlIlI[ar.llIIlIllIl[254]] = ar."Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[256]] = ar."Swing-from";
        ar.llIIlIlIlI[ar.llIIlIllIl[257]] = ar."Cut-vine";
        ar.llIIlIlIlI[ar.llIIlIllIl[258]] = ar."Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[259]] = ar."Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[260]] = ar."Cross";
        ar.llIIlIlIlI[ar.llIIlIllIl[261]] = ar."Fixed bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[262]] = ar."Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[263]] = ar."Lumberjack";
        ar.llIIlIlIlI[ar.llIIlIllIl[264]] = ar."bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[265]] = ar."Evade-event";
        ar.llIIlIlIlI[ar.llIIlIllIl[266]] = ar."Evade-event";
        ar.llIIlIlIlI[ar.llIIlIllIl[267]] = ar."Swamp tree";
        ar.llIIlIlIlI[ar.llIIlIllIl[268]] = ar."bridge";
        ar.llIIlIlIlI[ar.llIIlIllIl[270]] = ar."Continue-trek";
        ar.llIIlIlIlI[ar.llIIlIllIl[271]] = ar."Read";
        ar.llIIlIlIlI[ar.llIIlIllIl[272]] = ar."Drop";
        ar.llIIlIlIlI[ar.llIIlIllIl[273]] = ar."tome";
        ar.llIIlIlIlI[ar.llIIlIllIl[274]] = ar."tome";
        ar.llIIlIlIlI[ar.llIIlIllIl[284]] = ar."xp";
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
            0;
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
        void llllllllllllllllllIlIIIllIlllIIl;
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
        int llllllllllllllllllIlIIIllIlllIII = llIIlIllIl[0];
        while (ar.lIlIlIllIlIlI(llllllllllllllllllIlIIIllIlllIII, (int)llllllllllllllllllIlIIIllIlllIIl)) {
            void llllllllllllllllllIlIIIllIllllIl;
            int llllllllllllllllllIlIIIllIllIlII;
            int llllllllllllllllllIlIIIllIllIlIl;
            as llllllllllllllllllIlIIIllIlllllI;
            void llllllllllllllllllIlIIIllIlllIlI;
            void llllllllllllllllllIlIIIllIllIlll = llllllllllllllllllIlIIIllIlllIlI[llllllllllllllllllIlIIIllIlllIII];
            int llllllllllllllllllIlIIIllIllIllI = llllllllllllllllllIlIIIllIlllllI.nT.getX() + llllllllllllllllllIlIIIllIllIlll[llIIlIllIl[0]];
            WorldPoint llllllllllllllllllIlIIIllIllIIll = new WorldPoint(llllllllllllllllllIlIIIllIllIllI, llllllllllllllllllIlIIIllIllIlIl = llllllllllllllllllIlIIIllIlllllI.nT.getY() + llllllllllllllllllIlIIIllIllIlll[llIIlIllIl[1]], llllllllllllllllllIlIIIllIllIlII = llllllllllllllllllIlIIIllIlllllI.nT.getPlane());
            if (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllIllllIl.contains(llllllllllllllllllIlIIIllIllIIll) ? 1 : 0)) {
                void llllllllllllllllllIlIIIllIllllII;
                llllllllllllllllllIlIIIllIllllII.add(new as(llllllllllllllllllIlIIIllIllIIll, llllllllllllllllllIlIIIllIlllllI, llIIlIllIl[0], ar.d(llllllllllllllllllIlIIIllIllIlIl, nR.getY() + llIIlIllIl[17])));
                0;
            }
            ++llllllllllllllllllIlIIIllIlllIII;
            0;
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
                    0;
                    if (-1 >= -1) return n2 != 0;
                    return ((0x95 ^ 0xBF) & ~(0x89 ^ 0xA3) & ~((0x22 ^ 0x28) & ~(0x21 ^ 0x2B))) != 0;
                }
            }
        }
        n2 = llIIlIllIl[0];
        return n2 != 0;
    }

    private static String lIlIlIlIlIIll(String llllllllllllllllllIlIIIlIllIlIlI, String llllllllllllllllllIlIIIlIllIlIIl) {
        try {
            SecretKeySpec llllllllllllllllllIlIIIlIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIIIlIllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIIIlIllIlllI.init(llIIlIllIl[2], llllllllllllllllllIlIIIlIllIllll);
            return new String(llllllllllllllllllIlIIIlIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIIIlIllIllIl) {
            llllllllllllllllllIlIIIlIllIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIlllI(Object object) {
        return object != null;
    }

    private static void lIlIlIllIlIII() {
        llIIlIllIl = new int[292];
        ar.llIIlIllIl[0] = (6 ^ 0x3E) & ~(0x7C ^ 0x44);
        ar.llIIlIllIl[1] = 1;
        ar.llIIlIllIl[2] = 2;
        ar.llIIlIllIl[3] = 11 + 60 - 32 + 109 ^ 52 + 27 - -21 + 47;
        ar.llIIlIllIl[4] = 0xA6 ^ 0xB8;
        ar.llIIlIllIl[5] = -(0xFFFFFBF7 & 0x7C7B) & (0xFFFFFCFB & Short.MAX_VALUE);
        ar.llIIlIllIl[6] = 0xFFFFFBF6 & 0x2D4D;
        ar.llIIlIllIl[7] = -(0xFFFFBDFD & 0x63CF) & (0xFFFFF7DD & 0x7BFF);
        ar.llIIlIllIl[8] = 0xFFFFA6FF & 0x5D37;
        ar.llIIlIllIl[9] = -(0xFFFFDF11 & 0x31FF) & (0xFFFFDFFB & 0x7DB7);
        ar.llIIlIllIl[10] = 3;
        ar.llIIlIllIl[11] = 122 + 9 - 89 + 142 ^ 52 + 78 - -57 + 1;
        ar.llIIlIllIl[12] = 0xFFFFEDF7 & 0x333C;
        ar.llIIlIllIl[13] = 0x67 ^ 3;
        ar.llIIlIllIl[14] = 3 ^ (0x9D ^ 0x9B);
        ar.llIIlIllIl[15] = (0x8F ^ 0x97) & ~(0xDF ^ 0xC7) ^ (0x99 ^ 0x9F);
        ar.llIIlIllIl[16] = 0x81 ^ 0xBB ^ (0x6E ^ 0x5C);
        ar.llIIlIllIl[17] = 0x22 ^ 0x2B;
        ar.llIIlIllIl[18] = 123 + 47 - 118 + 127 ^ 97 + 115 - 44 + 17;
        ar.llIIlIllIl[19] = 0xFFFFFDDF & 0x33F7;
        ar.llIIlIllIl[20] = 0xA1 ^ 0xAA;
        ar.llIIlIllIl[21] = 0xFFFF9BBB & 0x67F6;
        ar.llIIlIllIl[22] = 0xFFFFCFD7 & 0x356F;
        ar.llIIlIllIl[23] = 0xFFFFDF3F & 0x29EB;
        ar.llIIlIllIl[24] = 0x6E ^ 0x62;
        ar.llIIlIllIl[25] = 0x80 ^ 0xA4 ^ (0xEF ^ 0xC6);
        ar.llIIlIllIl[26] = 0x7F ^ 0x71;
        ar.llIIlIllIl[27] = 0x23 ^ 0x11;
        ar.llIIlIllIl[28] = 98 + 19 - -11 + 5 ^ 78 + 27 - -28 + 5;
        ar.llIIlIllIl[29] = 0x72 ^ 0x6B;
        ar.llIIlIllIl[30] = 81 + 89 - 96 + 139 ^ 85 + 167 - 188 + 133;
        ar.llIIlIllIl[31] = 0xEA ^ 0x8E ^ (0xCD ^ 0xB8);
        ar.llIIlIllIl[32] = 0x36 ^ 0x24;
        ar.llIIlIllIl[33] = 0x91 ^ 0x82;
        ar.llIIlIllIl[34] = -(0xFFFFF1EF & 0x6EB3) & (0xFFFFF1EB & 0x6FFF);
        ar.llIIlIllIl[35] = 0xFFFF9EFF & 0x7B3F;
        ar.llIIlIllIl[36] = 0x10 ^ 4;
        ar.llIIlIllIl[37] = -(0xFFFFCEDA & 0x79A7) & (0xFFFFEFFF & 0x5E9F);
        ar.llIIlIllIl[38] = 0x33 ^ 0x4E ^ (0x2E ^ 0x46);
        ar.llIIlIllIl[39] = 0xD4 ^ 0xC2;
        ar.llIIlIllIl[40] = 0x1A ^ 0x11 ^ (0x27 ^ 0x3B);
        ar.llIIlIllIl[41] = 0x41 ^ 0x59;
        ar.llIIlIllIl[42] = 132 + 75 - 29 + 4 ^ 83 + 83 - 46 + 52;
        ar.llIIlIllIl[43] = 0xFFFF8E2D & 0x77FB;
        ar.llIIlIllIl[44] = 100 + 70 - 1 + 4 ^ 54 + 45 - 21 + 104;
        ar.llIIlIllIl[45] = 29 + 13 - -107 + 0 ^ 9 + 75 - 56 + 109;
        ar.llIIlIllIl[46] = 0x7F ^ 0x62;
        ar.llIIlIllIl[47] = 0x8B ^ 0x94;
        ar.llIIlIllIl[48] = 0x80 ^ 0xA0;
        ar.llIIlIllIl[49] = 0x20 ^ 1;
        ar.llIIlIllIl[50] = 0xC ^ 0x2E;
        ar.llIIlIllIl[51] = 0xFFFFBB9F & 0x4FEF;
        ar.llIIlIllIl[52] = 77 + 49 - -4 + 44 ^ 103 + 31 - 23 + 30;
        ar.llIIlIllIl[53] = 0x38 ^ 0x34 ^ (0xB7 ^ 0x9F);
        ar.llIIlIllIl[54] = -(0xFFFFBFA7 & 0x71FA) & (0xFFFFBBFD & 0x77FB);
        ar.llIIlIllIl[55] = 0xFFFFFFBD & 0xDEE;
        ar.llIIlIllIl[56] = 21 + 10 - -84 + 48 ^ 56 + 33 - 6 + 51;
        ar.llIIlIllIl[57] = 0xAC ^ 0x8A;
        ar.llIIlIllIl[58] = (0x9C ^ 0xAA) & ~(0x32 ^ 4) ^ (0x57 ^ 0x70);
        ar.llIIlIllIl[59] = 0x30 ^ 0x14 ^ (0xB2 ^ 0xBE);
        ar.llIIlIllIl[60] = 0x78 ^ 0x51;
        ar.llIIlIllIl[61] = 0xB0 ^ 0x9A;
        ar.llIIlIllIl[62] = 0x42 ^ 0x69;
        ar.llIIlIllIl[63] = 0x69 ^ 0x37 ^ (0x19 ^ 0x6B);
        ar.llIIlIllIl[64] = 0x95 ^ 0xB8;
        ar.llIIlIllIl[65] = 0xFFFF8F1D & 0x7EF2;
        ar.llIIlIllIl[66] = 0xFFFFBC74 & 0x57DB;
        ar.llIIlIllIl[67] = 0x31 ^ 0x1A ^ (0x77 ^ 0x72);
        ar.llIIlIllIl[68] = 0x76 ^ 0x4A;
        ar.llIIlIllIl[69] = 171 + 40 - 81 + 60 ^ 7 + 27 - -58 + 53;
        ar.llIIlIllIl[70] = 0xA6 ^ 0x96;
        ar.llIIlIllIl[71] = 0x6E ^ 0x2E ^ (0x66 ^ 0x17);
        ar.llIIlIllIl[72] = 0x9F ^ 0xAC;
        ar.llIIlIllIl[73] = 0x5C ^ 0x2E ^ (0xE2 ^ 0xA4);
        ar.llIIlIllIl[74] = 0x66 ^ 0x53;
        ar.llIIlIllIl[75] = 0x75 ^ 0x43;
        ar.llIIlIllIl[76] = 0x20 ^ 0x7A ^ (0x21 ^ 0x4C);
        ar.llIIlIllIl[77] = 6 ^ 0x52 ^ (0xC1 ^ 0xAD);
        ar.llIIlIllIl[78] = 0x5C ^ 0x70 ^ (0xAD ^ 0xB8);
        ar.llIIlIllIl[79] = 107 + 52 - -40 + 50 ^ 49 + 181 - 143 + 108;
        ar.llIIlIllIl[80] = -1;
        ar.llIIlIllIl[81] = 0xD5 ^ 0xC4 ^ (0x5A ^ 0x70);
        ar.llIIlIllIl[82] = 0xFF ^ 0xC2;
        ar.llIIlIllIl[83] = 94 + 63 - 31 + 13 ^ 8 + 34 - -8 + 131;
        ar.llIIlIllIl[84] = 0x8A ^ 0x9F ^ (0x3B ^ 0x11);
        ar.llIIlIllIl[85] = 0x23 ^ 0x39 ^ (0x36 ^ 0x6C);
        ar.llIIlIllIl[86] = 0xF5 ^ 0xB4;
        ar.llIIlIllIl[87] = 0xED ^ 0xA5 ^ (5 ^ 0xF);
        ar.llIIlIllIl[88] = 55 + 213 - 237 + 186 ^ 100 + 84 - 152 + 122;
        ar.llIIlIllIl[89] = 0x34 ^ 0x70 ^ (0xB7 ^ 0x89) & ~(0xA3 ^ 0x9D);
        ar.llIIlIllIl[90] = 215 + 13 - 177 + 176 ^ 96 + 107 - 44 + 7;
        ar.llIIlIllIl[91] = 209 + 92 - 81 + 12 ^ 93 + 59 - 44 + 66;
        ar.llIIlIllIl[92] = 0xDB ^ 0x9C;
        ar.llIIlIllIl[93] = 111 + 168 - 57 + 3 ^ 12 + 144 - 1 + 14;
        ar.llIIlIllIl[94] = 221 + 152 - 192 + 46 ^ 152 + 98 - 102 + 22;
        ar.llIIlIllIl[95] = 0xE6 ^ 0xAC;
        ar.llIIlIllIl[96] = 0x32 ^ 0x79;
        ar.llIIlIllIl[97] = 0x63 ^ 0x2F;
        ar.llIIlIllIl[98] = 0xF3 ^ 0xBE;
        ar.llIIlIllIl[99] = 0x9E ^ 0xBB ^ (0xF8 ^ 0x93);
        ar.llIIlIllIl[100] = 0xAC ^ 0xB1 ^ (0x45 ^ 0x17);
        ar.llIIlIllIl[101] = 126 + 134 - 245 + 185 ^ 74 + 116 - 79 + 41;
        ar.llIIlIllIl[102] = 0xDF ^ 0x8E;
        ar.llIIlIllIl[103] = 0x2E ^ 0x56 ^ (0xA8 ^ 0x82);
        ar.llIIlIllIl[104] = 72 + 198 - 209 + 177 ^ 43 + 156 - 19 + 9;
        ar.llIIlIllIl[105] = 0x90 ^ 0xBA ^ (0x2B ^ 0x55);
        ar.llIIlIllIl[106] = 128 + 84 - 126 + 118 ^ 151 + 77 - 218 + 143;
        ar.llIIlIllIl[107] = 18 + 158 - 111 + 149 ^ 108 + 4 - 96 + 112;
        ar.llIIlIllIl[108] = 0x7C ^ 0x3D ^ (0x33 ^ 0x25);
        ar.llIIlIllIl[109] = 112 + 4 - 43 + 125 ^ 68 + 0 - 25 + 115;
        ar.llIIlIllIl[110] = 0x6B ^ 0x32;
        ar.llIIlIllIl[111] = 0xCC ^ 0x96;
        ar.llIIlIllIl[112] = 62 + 89 - 141 + 245 ^ 24 + 159 - 23 + 4;
        ar.llIIlIllIl[113] = 0x23 ^ 0x7F;
        ar.llIIlIllIl[114] = 0x55 ^ 8;
        ar.llIIlIllIl[115] = 0x6C ^ 0x32;
        ar.llIIlIllIl[116] = 0x76 ^ 0x53 ^ (0x62 ^ 0x18);
        ar.llIIlIllIl[117] = 0x4E ^ 0x2E;
        ar.llIIlIllIl[118] = 0x71 ^ 0x7F ^ (0xC6 ^ 0xA9);
        ar.llIIlIllIl[119] = 0xCB ^ 0xA9;
        ar.llIIlIllIl[120] = 1 ^ 0x62;
        ar.llIIlIllIl[121] = 0xE2 ^ 0xA1 ^ (0x35 ^ 0x13);
        ar.llIIlIllIl[122] = 0x63 ^ 0x12 ^ (0x8C ^ 0x9B);
        ar.llIIlIllIl[123] = 0xE1 ^ 0xA3 ^ (0x1D ^ 0x38);
        ar.llIIlIllIl[124] = 45 + 49 - -32 + 90 ^ 76 + 53 - -13 + 34;
        ar.llIIlIllIl[125] = 0xF4 ^ 0x9D;
        ar.llIIlIllIl[126] = 3 ^ (0xE7 ^ 0x8E);
        ar.llIIlIllIl[127] = 0x4A ^ 0x21;
        ar.llIIlIllIl[128] = 0xF ^ 0x63;
        ar.llIIlIllIl[129] = 198 + 34 - 64 + 33 ^ 21 + 87 - 50 + 106;
        ar.llIIlIllIl[130] = 0xD7 ^ 0xB9;
        ar.llIIlIllIl[131] = 138 + 14 - -26 + 48 ^ 9 + 62 - 60 + 130;
        ar.llIIlIllIl[132] = 0x8D ^ 0x83 ^ (0x32 ^ 0x4C);
        ar.llIIlIllIl[133] = 0xF3 ^ 0x82;
        ar.llIIlIllIl[134] = 0x33 ^ 0x41 ^ (0xBF ^ 0xB6) & ~(0x6A ^ 0x63);
        ar.llIIlIllIl[135] = 0x6B ^ 0x17 ^ (0xB2 ^ 0xBD);
        ar.llIIlIllIl[136] = 63 + 105 - 122 + 150 ^ 57 + 159 - 171 + 131;
        ar.llIIlIllIl[137] = 0x7F ^ 0xA;
        ar.llIIlIllIl[138] = 0xA1 ^ 0x8D ^ (0xC4 ^ 0x9E);
        ar.llIIlIllIl[139] = 0xAB ^ 0xB0 ^ (0xCC ^ 0xA0);
        ar.llIIlIllIl[140] = 123 + 160 - 229 + 187 ^ 6 + 17 - -65 + 49;
        ar.llIIlIllIl[141] = 0x2F ^ 0x56;
        ar.llIIlIllIl[142] = 0xDB ^ 0xA1;
        ar.llIIlIllIl[143] = 0xFFFFFF97 & 0x367D;
        ar.llIIlIllIl[144] = 0xEF ^ 0x94;
        ar.llIIlIllIl[145] = 21 + 213 - 126 + 108 ^ 51 + 74 - 65 + 104;
        ar.llIIlIllIl[146] = 175 + 97 - 101 + 44 ^ 130 + 150 - 186 + 76;
        ar.llIIlIllIl[147] = 0xC6 ^ 0xB8;
        ar.llIIlIllIl[148] = 61 + 10 - -47 + 9;
        ar.llIIlIllIl[149] = 85 + 27 - 60 + 76;
        ar.llIIlIllIl[150] = 122 + 120 - 232 + 119;
        ar.llIIlIllIl[151] = 88 + 91 - 108 + 59;
        ar.llIIlIllIl[152] = 2 + (0x80 ^ 0x8E) - -3 + (0x1E ^ 0x6E);
        ar.llIIlIllIl[153] = (0xF0 ^ 0x9B) + (0xF ^ 0x68) - (154 + 189 - 159 + 21) + (102 + 86 - 178 + 117);
        ar.llIIlIllIl[154] = (0x5C ^ 0x49) + (0xF ^ 0x75) - (0x4F ^ 3) + (0x33 ^ 0x71);
        ar.llIIlIllIl[155] = (0xC9 ^ 0xC0) + (0x7A ^ 0x29) - -(0xA6 ^ 0xB8) + (0x18 ^ 0x14);
        ar.llIIlIllIl[156] = 73 + 120 - 166 + 108;
        ar.llIIlIllIl[157] = 40 + 125 - 44 + 15;
        ar.llIIlIllIl[158] = -(0xFFFFFD4B & 0x6AF7) & (0xFFFFF9D7 & 0x7FFE);
        ar.llIIlIllIl[159] = 0xFFFFBF7F & 0x55FC;
        ar.llIIlIllIl[160] = (0x95 ^ 0xB5) + (0x2F ^ 0x65) - (0x12 ^ 0x57) + (0x33 ^ 0x57);
        ar.llIIlIllIl[161] = 134 + 75 - 147 + 76;
        ar.llIIlIllIl[162] = 0 + 94 - -26 + 19;
        ar.llIIlIllIl[163] = (6 ^ 0x37) + (0xEC ^ 0xB9) - (0x31 ^ 0x7E) + (8 ^ 0x5D);
        ar.llIIlIllIl[164] = 90 + 72 - 89 + 68;
        ar.llIIlIllIl[165] = 126 + 29 - 16 + 2 + (80 + 5 - 18 + 63) - (84 + 176 - 165 + 90) + (0x34 ^ 0xC);
        ar.llIIlIllIl[166] = 102 + 24 - 87 + 104;
        ar.llIIlIllIl[167] = 3 + 72 - -53 + 16;
        ar.llIIlIllIl[168] = 58 + 30 - -28 + 29;
        ar.llIIlIllIl[169] = 69 + 109 - 72 + 40;
        ar.llIIlIllIl[170] = 128 + 137 - 191 + 73;
        ar.llIIlIllIl[171] = (0xA3 ^ 0xB7) + (0x1F ^ 0x1B) - -(0x7D ^ 0xE) + (0x3F ^ 0x36);
        ar.llIIlIllIl[172] = 128 + 3 - 84 + 102;
        ar.llIIlIllIl[173] = 41 + 145 - 143 + 107;
        ar.llIIlIllIl[174] = 70 + 61 - -7 + 13;
        ar.llIIlIllIl[175] = 113 + 20 - 4 + 13 + (0x2F ^ 0x69) - (0xE5 ^ 0xBF) + (0x57 ^ 0x49);
        ar.llIIlIllIl[176] = 75 + 91 - 154 + 141;
        ar.llIIlIllIl[177] = (9 ^ 0x4F) + (0x5A ^ 0) - (0xE ^ 0x77) + (0x4D ^ 0x3E);
        ar.llIIlIllIl[178] = (0x65 ^ 9) + (4 ^ 0x17) - (0x71 ^ 0x19) + (108 + 5 - 61 + 80);
        ar.llIIlIllIl[179] = 111 + 94 - 162 + 90 + (0x25 ^ 0x4C) - (100 + 31 - 47 + 46) + (0x92 ^ 0xA2);
        ar.llIIlIllIl[180] = 124 + 13 - 122 + 142;
        ar.llIIlIllIl[181] = (0x8F ^ 0x92) + (0xD2 ^ 0xA2) - (0x70 ^ 0x2D) + (0x62 ^ 0xC);
        ar.llIIlIllIl[182] = 106 + 99 - 163 + 114 + (0x18 ^ 0x64) - (70 + 107 - 129 + 159) + (0x7D ^ 0x2B);
        ar.llIIlIllIl[183] = (0xF9 ^ 0x96) + (2 ^ 0x4F) - (4 + 43 - -59 + 28) + (0x77 ^ 0x1D);
        ar.llIIlIllIl[184] = (0x4D ^ 0x3E) + (0x56 ^ 0x62) - (0xAE ^ 0x80) + (0x69 ^ 0x41);
        ar.llIIlIllIl[185] = -(0xFFFFB3E2 & 0x7D9F) & (0xFFFFBDE9 & 0x7FDF);
        ar.llIIlIllIl[186] = (0xD9 ^ 0xBF) + (0xE0 ^ 0xA6) - (0xE ^ 0x75) + (0x55 ^ 0x24);
        ar.llIIlIllIl[187] = (0x45 ^ 0x7C) + 2 - -(0x6A ^ 0x66) + (0x14 ^ 0x48);
        ar.llIIlIllIl[188] = 94 + 73 - 107 + 104;
        ar.llIIlIllIl[189] = 0xFFFFFFF7 & 0xFFF;
        ar.llIIlIllIl[190] = -(0xFFFFFE7F & 0x4F95) & (0xFFFFFFFF & 0x5FFD);
        ar.llIIlIllIl[191] = (0x1F ^ 0x72) + (0xCD ^ 0xA1) - (107 + 152 - 103 + 37) + (0 + 27 - -25 + 89);
        ar.llIIlIllIl[192] = (0x1D ^ 0x78) + (0x3C ^ 0x63) - (0x4F ^ 0x27) + (0xDD ^ 0x97);
        ar.llIIlIllIl[193] = (0xEF ^ 0x82) + (0xE5 ^ 0xC6) - (0x30 ^ 0x2E) + (0x61 ^ 0x54);
        ar.llIIlIllIl[194] = 94 + 91 - 70 + 53;
        ar.llIIlIllIl[195] = (0xA9 ^ 0xA6) + (0x36 ^ 0x13) - -(0x53 ^ 0x60) + (0xF7 ^ 0xB5);
        ar.llIIlIllIl[196] = 34 + 69 - 92 + 148 + (118 + 18 - 84 + 87) - (51 + 63 - -3 + 79) + (0xF8 ^ 0xBC);
        ar.llIIlIllIl[197] = 64 + 62 - -1 + 3 + (0xBD ^ 0xA8) - (0x7A ^ 0x34) + (0xD9 ^ 0xBB);
        ar.llIIlIllIl[198] = -(0xFFFFA767 & 0x5FBB) & (0xFFFFDF3F & Short.MAX_VALUE);
        ar.llIIlIllIl[199] = 44 + 53 - -34 + 41;
        ar.llIIlIllIl[200] = 49 + 166 - 148 + 106;
        ar.llIIlIllIl[201] = 72 + 11 - 13 + 72 + (0x7D ^ 0x5B) - (0xAE ^ 0xBB) + (0x89 ^ 0x86);
        ar.llIIlIllIl[202] = (0x26 ^ 0x6C) + (0x19 ^ 0x5A) - (8 ^ 0x1C) + (0x1A ^ 0x2C);
        ar.llIIlIllIl[203] = 58 + 0 - -7 + 111;
        ar.llIIlIllIl[204] = 59 + 159 - 70 + 29;
        ar.llIIlIllIl[205] = 58 + 104 - 99 + 115;
        ar.llIIlIllIl[206] = 6 + 137 - -17 + 19;
        ar.llIIlIllIl[207] = 21 + 118 - -21 + 20;
        ar.llIIlIllIl[208] = (0x3A ^ 0x58) + (15 + 92 - -2 + 38) - (29 + 174 - 132 + 112) + (0xE0 ^ 0x97);
        ar.llIIlIllIl[209] = (0x4D ^ 0x63) + (2 ^ 0x6F) - (0x26 ^ 0x6D) + (0x22 ^ 0x44);
        ar.llIIlIllIl[210] = -(0xFFFFB4F5 & 0x5FAF) & (0xFFFFB7B6 & 0x5DFF);
        ar.llIIlIllIl[211] = (0x7A ^ 0x2B) + (59 + 103 - 102 + 82) - (0xDF ^ 0xBB) + (0x9C ^ 0xA0);
        ar.llIIlIllIl[212] = (2 ^ 0x12) + (0x53 ^ 0x73) - (0x53 ^ 0x40) + (75 + 134 - 64 + 10);
        ar.llIIlIllIl[213] = 125 + 104 - 170 + 126;
        ar.llIIlIllIl[214] = 59 + 170 - 45 + 2;
        ar.llIIlIllIl[215] = 46 + 8 - 35 + 168;
        ar.llIIlIllIl[216] = 27 + 82 - 60 + 104 + (0xE6 ^ 0xAE) - (4 + 21 - -27 + 132) + (29 + 69 - 96 + 145);
        ar.llIIlIllIl[217] = 25 + 3 - -29 + 96 + (15 + 167 - 126 + 113) - (16 + 110 - 97 + 127) + (0x44 ^ 0x53);
        ar.llIIlIllIl[218] = 1 + 2 - -144 + 43;
        ar.llIIlIllIl[219] = (0xD8 ^ 0xBA) + (102 + 25 - 85 + 146) - (0x72 ^ 0xF) + (0x10 ^ 0xE);
        ar.llIIlIllIl[220] = (0x3B ^ 0x14) + (8 ^ 0x4D) - (4 ^ 0x52) + (38 + 89 - 44 + 79);
        ar.llIIlIllIl[221] = 101 + 21 - -40 + 29 + (47 + 67 - -5 + 70) - (154 + 219 - 213 + 64) + (0x2E ^ 0xB);
        ar.llIIlIllIl[222] = 145 + 72 - 124 + 101;
        ar.llIIlIllIl[223] = (0xC8 ^ 0xB9) + (0x53 ^ 0x25) - (115 + 79 - 92 + 99) + (58 + 120 - 145 + 132);
        ar.llIIlIllIl[224] = 114 + 83 - 184 + 135 + (57 + 13 - 43 + 138) - (137 + 159 - 209 + 94) + (0x40 ^ 0);
        ar.llIIlIllIl[225] = 0xFFFF86BF & 0x112794B;
        ar.llIIlIllIl[226] = (0x25 ^ 0x7D) + (0x54 ^ 0x6A) - (0xCD ^ 0xAD) + (29 + 73 - 23 + 64);
        ar.llIIlIllIl[227] = 3 + 23 - -10 + 98 + (0x70 ^ 0x2C) - (71 + 56 - 31 + 46) + (6 ^ 0x74);
        ar.llIIlIllIl[228] = -(0xFFFFCBEF & 0x7C16) & (0xFFFFFEFF & 0x16DFD);
        ar.llIIlIllIl[229] = 0xFFFFFF8B & 0x14C7C;
        ar.llIIlIllIl[230] = 0xFFFFBFFF & 0x6ECC;
        ar.llIIlIllIl[231] = 0xFFFFE1A8 & Short.MAX_VALUE;
        ar.llIIlIllIl[232] = -(0xFFFFECBB & 0x33CD) & (0xFFFFBFDF & 0x7FEF);
        ar.llIIlIllIl[233] = 0xFFFFCFCF & 0x33B4;
        ar.llIIlIllIl[234] = 0xFFFFF0DF & 0x3FF4;
        ar.llIIlIllIl[235] = 0xFFFFBCBF & 0x7FCC;
        ar.llIIlIllIl[236] = 0xFFFF83ED & 0x7D3E;
        ar.llIIlIllIl[237] = -(0xFFFFFEBD & 0x7957) & (0xFFFFFBFF & 0x7FFC);
        ar.llIIlIllIl[238] = -(0xFFFFC3D9 & 0x7F2F) & (0xFFFFFFF9 & 0x47BE);
        ar.llIIlIllIl[239] = -(0xFFFFA3F5 & 0x7ECE) & (0xFFFFFAFF & 0x3FFB);
        ar.llIIlIllIl[240] = 0xFFFF9F58 & 0x7FEF;
        ar.llIIlIllIl[241] = 0xFFFF9BB6 & 0x67FF;
        ar.llIIlIllIl[242] = -(0xFFFFD6BF & 0x6F5B) & (0xFFFFE7DF & 0x5FBB);
        ar.llIIlIllIl[243] = 0xFFFF97BF & 0x6FDE;
        ar.llIIlIllIl[244] = 0xFFFFBECF & 0x6FFA;
        ar.llIIlIllIl[245] = -(0xFFFFD71B & 0x3AE5) & (0xFFFFFF7E & 0x77DF);
        ar.llIIlIllIl[246] = 0xFFFFF679 & 0x23FEE;
        ar.llIIlIllIl[247] = 0xFFFFEEAA & 0x295DD;
        ar.llIIlIllIl[248] = -(0xFFFFD7AF & 0x68F7) & (0xFFFFF7F7 & 0x79FF);
        ar.llIIlIllIl[249] = (0x3A ^ 0x34) + (0x8E ^ 0xAE) - 1 + (149 + 73 - 185 + 117);
        ar.llIIlIllIl[250] = 27 + 82 - 86 + 177;
        ar.llIIlIllIl[251] = (0x12 ^ 0x7B) + (0x7F ^ 0xC) - (0xC3 ^ 0x8E) + (0x50 ^ 0x6A);
        ar.llIIlIllIl[252] = 12 + 145 - -2 + 40 + (0x84 ^ 0xB2) - (74 + 164 - 40 + 3) + (33 + 126 - 103 + 94);
        ar.llIIlIllIl[253] = (0x70 ^ 0x19) + (0xB5 ^ 0xBC) - (0x35 ^ 0x25) + (0x3C ^ 0x55);
        ar.llIIlIllIl[254] = (0xF ^ 0x74) + (57 + 139 - 103 + 99) - (153 + 19 - 116 + 147) + (0x72 ^ 0x2E);
        ar.llIIlIllIl[255] = -(0xFFFFC9F7 & 0x77EA) & (0xFFFFF7EF & Short.MAX_VALUE);
        ar.llIIlIllIl[256] = 6 + 45 - -80 + 74;
        ar.llIIlIllIl[257] = 121 + 142 - 123 + 66;
        ar.llIIlIllIl[258] = (0xB5 ^ 0xA3) + (0xE9 ^ 0x90) - (0x9B ^ 0xA9) + (0xFD ^ 0x8F);
        ar.llIIlIllIl[259] = 18 + 10 - -64 + 40 + (0x6C ^ 9) - (0x55 ^ 0x3A) + (0x76 ^ 0x20);
        ar.llIIlIllIl[260] = 168 + 135 - 217 + 123;
        ar.llIIlIllIl[261] = (0x5D ^ 0x1E) + (55 + 166 - 141 + 126) - (20 + 178 - 27 + 21) + (86 + 80 - 146 + 109);
        ar.llIIlIllIl[262] = (0x49 ^ 0x39) + (192 + 157 - 212 + 70) - (148 + 33 - 154 + 130) + (1 ^ 0x30);
        ar.llIIlIllIl[263] = 189 + 98 - 159 + 84;
        ar.llIIlIllIl[264] = 171 + 179 - 246 + 109;
        ar.llIIlIllIl[265] = 94 + 18 - -101 + 1;
        ar.llIIlIllIl[266] = 146 + 90 - 146 + 86 + (0xC2 ^ 0xBE) - (74 + 34 - 53 + 84) + (0x60 ^ 0x56);
        ar.llIIlIllIl[267] = 180 + 147 - 216 + 105;
        ar.llIIlIllIl[268] = 18 + 196 - 8 + 11;
        ar.llIIlIllIl[269] = -(0xFFFFFFBD & 0x6FDA) & (0xFFFFFFDF & 0x1496FB7);
        ar.llIIlIllIl[270] = 206 + 79 - 111 + 44;
        ar.llIIlIllIl[271] = 50 + 56 - 9 + 122;
        ar.llIIlIllIl[272] = 144 + 168 - 158 + 66;
        ar.llIIlIllIl[273] = 161 + 85 - 204 + 148 + (0xEE ^ 0xAB) - (0xFA ^ 0xA9) + (0x7B ^ 0x56);
        ar.llIIlIllIl[274] = 158 + 2 - -51 + 11;
        ar.llIIlIllIl[275] = 0xFFFF8F7A & 0x7DE5;
        ar.llIIlIllIl[276] = 0xFFFF8FF9 & 0x7D87;
        ar.llIIlIllIl[277] = 0xFFFF8D7A & 0x7FEF;
        ar.llIIlIllIl[278] = 0xFFFFADDE & 0x5FBF;
        ar.llIIlIllIl[279] = 0xFFFFD7FF & 0x7A9A;
        ar.llIIlIllIl[280] = -(0xFFFFF6EB & 0x7B95) & (0xFFFFFFF3 & 0x7FDC);
        ar.llIIlIllIl[281] = 0xFFFFCDC4 & 0x3FBB;
        ar.llIIlIllIl[282] = -(0xFFFFFA73 & 0x67FD) & (0xFFFFEFFE & Short.MAX_VALUE);
        ar.llIIlIllIl[283] = -(0xFFFFFF2D & 0x3D3) & (0xFFFF8FFF & 0x7F7B);
        ar.llIIlIllIl[284] = 146 + 21 - 144 + 200;
        ar.llIIlIllIl[285] = 0xFFFF8DDC & 0x7FB3;
        ar.llIIlIllIl[286] = -(0xFFFFD7E3 & 0x6A1F) & (0xFFFFEEFF & 0x5F7F);
        ar.llIIlIllIl[287] = 0xFFFFCFBB & 0x3DDD;
        ar.llIIlIllIl[288] = -(0xFFFFCBFA & 0x744F) & (0xFFFFFDEF & 0x4EFF);
        ar.llIIlIllIl[289] = 0xFFFF8DBF & 0x7FF7;
        ar.llIIlIllIl[290] = -(0xFFFFFE4D & 0x63BB) & (0xFFFFFFDF & 0x6FBF);
        ar.llIIlIllIl[291] = 68 + 54 - -69 + 33;
    }

    private static String lIlIlIlIlIlIl(String llllllllllllllllllIlIIIllIIIlIIl, String llllllllllllllllllIlIIIllIIIlIII) {
        llllllllllllllllllIlIIIllIIIlIIl = new String(Base64.getDecoder().decode(llllllllllllllllllIlIIIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIIIllIIIllII = new StringBuilder();
        char[] llllllllllllllllllIlIIIllIIIlIll = llllllllllllllllllIlIIIllIIIlIII.toCharArray();
        int llllllllllllllllllIlIIIllIIIlIlI = llIIlIllIl[0];
        char[] llllllllllllllllllIlIIIllIIIIlII = llllllllllllllllllIlIIIllIIIlIIl.toCharArray();
        int llllllllllllllllllIlIIIllIIIIIll = llllllllllllllllllIlIIIllIIIIlII.length;
        int llllllllllllllllllIlIIIllIIIIIlI = llIIlIllIl[0];
        while (ar.lIlIlIllIlIlI(llllllllllllllllllIlIIIllIIIIIlI, llllllllllllllllllIlIIIllIIIIIll)) {
            char llllllllllllllllllIlIIIllIIIllll = llllllllllllllllllIlIIIllIIIIlII[llllllllllllllllllIlIIIllIIIIIlI];
            llllllllllllllllllIlIIIllIIIllII.append((char)(llllllllllllllllllIlIIIllIIIllll ^ llllllllllllllllllIlIIIllIIIlIll[llllllllllllllllllIlIIIllIIIlIlI % llllllllllllllllllIlIIIllIIIlIll.length]));
            0;
            ++llllllllllllllllllIlIIIllIIIlIlI;
            ++llllllllllllllllllIlIIIllIIIIIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlIIIllIIIllII);
    }

    private static String lIlIlIlIlIlII(String llllllllllllllllllIlIIIlIllllIIl, String llllllllllllllllllIlIIIlIlllIllI) {
        try {
            SecretKeySpec llllllllllllllllllIlIIIlIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIIlIlllIllI.getBytes(StandardCharsets.UTF_8)), llIIlIllIl[16]), "DES");
            Cipher llllllllllllllllllIlIIIlIllllIll = Cipher.getInstance("DES");
            llllllllllllllllllIlIIIlIllllIll.init(llIIlIllIl[2], llllllllllllllllllIlIIIlIlllllII);
            return new String(llllllllllllllllllIlIIIlIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIIlIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIIIlIllllIlI) {
            llllllllllllllllllIlIIIlIllllIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static List<WorldPoint> a(WorldPoint worldPoint, int n2, List<WorldPoint> list) {
        void llllllllllllllllllIlIIIlllIlIIII;
        PriorityQueue<as> priorityQueue = new PriorityQueue<as>();
        ArrayList arrayList = new ArrayList();
        priorityQueue.add(new as(worldPoint, null, llIIlIllIl[0], ar.d(worldPoint.getY(), n2)));
        0;
        while (ar.lIlIlIllIlIll(llllllllllllllllllIlIIIlllIlIIII.isEmpty() ? 1 : 0)) {
            void llllllllllllllllllIlIIIlllIlIIIl;
            void llllllllllllllllllIlIIIlllIIllll;
            void llllllllllllllllllIlIIIlllIlIIlI;
            as llllllllllllllllllIlIIIlllIIlllI = (as)llllllllllllllllllIlIIIlllIlIIII.poll();
            if (ar.lIlIlIlllIlIl(llllllllllllllllllIlIIIlllIIlllI.nT.getY(), (int)llllllllllllllllllIlIIIlllIlIIlI)) {
                return ar.a(llllllllllllllllllIlIIIlllIIlllI);
            }
            llllllllllllllllllIlIIIlllIIllll.add(llllllllllllllllllIlIIIlllIIlllI);
            0;
            Iterator<as> llllllllllllllllllIlIIIlllIIllIl = ar.a(llllllllllllllllllIlIIIlllIIlllI, (List<WorldPoint>)llllllllllllllllllIlIIIlllIlIIIl).iterator();
            while (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIlllIIllIl.hasNext() ? 1 : 0)) {
                as llllllllllllllllllIlIIIlllIIllII = llllllllllllllllllIlIIIlllIIllIl.next();
                int llllllllllllllllllIlIIIlllIIlIll = llllllllllllllllllIlIIIlllIIlllI.nV + llIIlIllIl[1];
                if (ar.lIlIlIllIlIIl(ar.b(llllllllllllllllllIlIIIlllIIllII, (List<as>)llllllllllllllllllIlIIIlllIIllll) ? 1 : 0)) {
                    0;
                    if (2 >= 1) continue;
                    return null;
                }
                if (!ar.lIlIlIllIlIIl(ar.a(llllllllllllllllllIlIIIlllIIllII, (PriorityQueue<as>)llllllllllllllllllIlIIIlllIlIIII) ? 1 : 0) || ar.lIlIlIllIlIlI(llllllllllllllllllIlIIIlllIIlIll, llllllllllllllllllIlIIIlllIIllII.nV)) {
                    llllllllllllllllllIlIIIlllIlIIII.add(llllllllllllllllllIlIIIlllIIllII);
                    0;
                }
                0;
                if (((8 ^ 0x35 ^ 2) & (16 + 138 - 25 + 12 ^ 131 + 69 - 134 + 112 ^ -1)) == 0) continue;
                return null;
            }
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return Collections.emptyList();
    }

    public static void t(String string) {
        Widget llllllllllllllllllIlIIIllIlIIlIl;
        String[] stringArray = new String[llIIlIllIl[1]];
        stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[206]];
        if (ar.lIlIlIllIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            mV = llIIlIllIl[0];
            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[207]];
            String[] stringArray2 = new String[llIIlIllIl[1]];
            stringArray2[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[208]];
            Inventory.getFirst((String[])stringArray2).interact(llIIlIlIlI[llIIlIllIl[209]]);
            Time.sleepTicks((int)llIIlIllIl[10]);
            0;
            if (!ar.lIlIlIllIllll(Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15])) || ar.lIlIlIllIlIll(Widgets.get((int)llIIlIllIl[210]).isEmpty() ? 1 : 0)) {
                String llllllllllllllllllIlIIIllIlIIllI;
                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[211]];
                if (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllIlIIllI.contains(llIIlIlIlI[llIIlIllIl[212]]) ? 1 : 0) && ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllIlIIlIl = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);
                    0;
                    llllllllllllllllllIlIIIllIlIIlIl.getChild(llIIlIllIl[3]).interact(llIIlIlIlI[llIIlIllIl[213]]);
                    Time.sleepTicks((int)llIIlIllIl[1]);
                    0;
                }
                if (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllIlIIllI.contains(llIIlIlIlI[llIIlIllIl[214]]) ? 1 : 0) && ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllIlIIlIl = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);
                    0;
                    llllllllllllllllllIlIIIllIlIIlIl.getChild(llIIlIllIl[1]).interact(llIIlIlIlI[llIIlIllIl[215]]);
                    Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));
                    0;
                }
                if (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllIlIIllI.contains(llIIlIlIlI[llIIlIllIl[216]]) ? 1 : 0) && ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllIlIIlIl = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);
                    0;
                    llllllllllllllllllIlIIIllIlIIlIl.getChild(llIIlIllIl[0]).interact(llIIlIlIlI[llIIlIllIl[217]]);
                    Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));
                    0;
                }
                if (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllIlIIllI.contains(llIIlIlIlI[llIIlIllIl[218]]) ? 1 : 0) && ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllIlIIlIl = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);
                    0;
                    llllllllllllllllllIlIIIllIlIIlIl.getChild(llIIlIllIl[2]).interact(llIIlIlIlI[llIIlIllIl[219]]);
                    Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));
                    0;
                }
                if (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllIlIIllI.contains(llIIlIlIlI[llIIlIllIl[220]]) ? 1 : 0) && ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllIlIIlIl = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);
                    0;
                    llllllllllllllllllIlIIIllIlIIlIl.getChild(llIIlIllIl[10]).interact(llIIlIlIlI[llIIlIllIl[221]]);
                    Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));
                    0;
                }
                if (ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllIlIIllI.contains(llIIlIlIlI[llIIlIllIl[222]]) ? 1 : 0) && ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllIlIIlIl = Widgets.get((int)llIIlIllIl[210], (int)llIIlIllIl[15]))) {
                    Time.sleepTicks((int)llIIlIllIl[2]);
                    0;
                    llllllllllllllllllIlIIIllIlIIlIl.getChild(llIIlIllIl[11]).interact(llIIlIlIlI[llIIlIllIl[223]]);
                    Time.sleepTicks((int)e.c(llIIlIllIl[10], llIIlIllIl[11]));
                    0;
                }
                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[224]];
                llllllllllllllllllIlIIIllIlIIlIl = Widgets.fromId((int)llIIlIllIl[225]);
                if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllIlIIlIl) && ar.lIlIlIllIlIIl(llllllllllllllllllIlIIIllIlIIlIl.isVisible() ? 1 : 0)) {
                    Time.sleepTick();
                    0;
                    llllllllllllllllllIlIIIllIlIIlIl.interact(llIIlIlIlI[llIIlIllIl[226]]);
                    Time.sleepTicks((int)llIIlIllIl[2]);
                    0;
                }
            }
        }
        if (ar.lIlIlIllIlIIl(Inventory.contains(llllllllllllllllllIlIIIllIlIIlIl = item -> item.getName().toLowerCase().contains(llIIlIlIlI[llIIlIllIl[250]])) ? 1 : 0)) {
            Inventory.getFirst(llllllllllllllllllIlIIIllIlIIlIl).interact(llIIlIlIlI[llIIlIllIl[227]]);
            Time.sleepTicks((int)llIIlIllIl[1]);
            0;
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
                    Predicate<Item> llllllllllllllllllIlIIIllllllIll = item -> item.getName().toLowerCase().contains(llIIlIlIlI[llIIlIllIl[274]]);
                    if (ar.lIlIlIllIlIIl(Inventory.contains(llllllllllllllllllIlIIIllllllIll) ? 1 : 0)) {
                        Inventory.getFirst(llllllllllllllllllIlIIIllllllIll).interact(llIIlIlIlI[llIIlIllIl[2]]);
                        Time.sleepTicks((int)llIIlIllIl[1]);
                        0;
                    }
                    if (ar.lIlIlIllIlIll(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ar.lIlIlIllIlIll(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ar.lIlIlIllIlIll(ar.an() ? 1 : 0) && ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIlIllIl[3])) {
                        Movement.walkTo((WorldPoint)b.I);
                        0;
                        Time.sleepTicks((int)llIIlIllIl[1]);
                        0;
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
                            0;
                            int[] nArray2 = new int[llIIlIllIl[1]];
                            nArray2[ar.llIIlIllIl[0]] = llIIlIllIl[9];
                            Inventory.getFirst((int[])nArray2).interact(llIIlIlIlI[llIIlIllIl[10]]);
                            Time.sleepUntil(() -> nL.contains(Players.getLocal().getWorldLocation()), (int)llIIlIllIl[12]);
                            0;
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
                                0;
                            }
                            String[] stringArray3 = new String[llIIlIllIl[1]];
                            stringArray3[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[16]];
                            if (ar.lIlIlIllIllll(NPCs.getNearest((String[])stringArray3)) && ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[14])) {
                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[17]];
                                Movement.walkTo((WorldPoint)D.fa);
                                0;
                                Time.sleepTicks((int)llIIlIllIl[1]);
                                0;
                            }
                        }
                        if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[14])) {
                            AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[18]];
                            if (ar.lIlIlIllIlIll(Bank.isOpen() ? 1 : 0)) {
                                int[] nArray = new int[llIIlIllIl[1]];
                                nArray[ar.llIIlIllIl[0]] = llIIlIllIl[19];
                                TileObjects.getNearest((int[])nArray).interact(llIIlIlIlI[llIIlIllIl[20]]);
                                Time.sleepTicks((int)llIIlIllIl[2]);
                                0;
                            }
                            if (ar.lIlIlIllIlIIl(Bank.isOpen() ? 1 : 0) && ar.lIlIlIlllIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIlIllIl[1]);
                                0;
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
                            0;
                        }
                        if (ar.lIlIlIllIllII(Movement.getRunEnergy(), llIIlIllIl[29]) && ar.lIlIlIllIlIll(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                        }
                        ar.t(nN);
                        Predicate<Item> llllllllllllllllllIlIIIllllllIlI = item -> item.getName().toLowerCase().contains(llIIlIlIlI[llIIlIllIl[273]]);
                        if (ar.lIlIlIllIlIIl(Inventory.contains(llllllllllllllllllIlIIIllllllIlI) ? 1 : 0)) {
                            Inventory.getFirst(llllllllllllllllllIlIIIllllllIlI).interact(llIIlIlIlI[llIIlIllIl[30]]);
                            Time.sleepTicks((int)llIIlIllIl[1]);
                            0;
                        }
                        if (ar.lIlIlIllIlIIl(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray5 = new String[llIIlIllIl[1]];
                            stringArray5[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[31]];
                            if (ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray5) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains(llllllllllllllllllIlIIIllllllIlI) ? 1 : 0)) {
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
                                        0;
                                        Time.sleepTicks((int)llIIlIllIl[1]);
                                        0;
                                    }
                                    if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(nP), llIIlIllIl[16])) {
                                        Time.sleepTicks((int)llIIlIllIl[2]);
                                        0;
                                        if (ar.lIlIlIllIlIll(Dialog.isOpen() ? 1 : 0) && ar.lIlIlIllIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                            String[] stringArray6 = new String[llIIlIllIl[1]];
                                            stringArray6[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[33]];
                                            if (ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray6) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains(llllllllllllllllllIlIIIllllllIlI) ? 1 : 0) && ar.lIlIlIllIlIIl(Widgets.get((int)llIIlIllIl[34]).isEmpty() ? 1 : 0) && ar.lIlIlIllIlIll(Vars.getBit((int)llIIlIllIl[35]))) {
                                                AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[36]];
                                                int[] nArray = new int[llIIlIllIl[1]];
                                                nArray[ar.llIIlIllIl[0]] = llIIlIllIl[37];
                                                llllllllllllllllllIlIIIllllllIIl2 = NPCs.getNearest((int[])nArray);
                                                if (ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllllllIIl2) && ar.lIlIlIllIlIll(Dialog.isOpen() ? 1 : 0)) {
                                                    llllllllllllllllllIlIIIllllllIIl2.interact(llIIlIlIlI[llIIlIllIl[38]]);
                                                    Time.sleepTicks((int)llIIlIllIl[10]);
                                                    0;
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
                            if (ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray8) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains(llllllllllllllllllIlIIIllllllIlI) ? 1 : 0)) {
                                if (ar.lIlIlIlllIIIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                                    if (ar.lIlIlIllIllII(Players.getLocal().getWorldLocation().distanceTo(nI), llIIlIllIl[16])) {
                                        AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[41]];
                                        if (ar.lIlIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)nI);
                                        0;
                                        Time.sleepTicks((int)llIIlIllIl[1]);
                                        0;
                                    }
                                    Time.sleepTicks((int)llIIlIllIl[2]);
                                    0;
                                    if (ar.lIlIlIllIlIll(Dialog.isOpen() ? 1 : 0) && ar.lIlIlIllIlIll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                        String[] stringArray9 = new String[llIIlIllIl[1]];
                                        stringArray9[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[29]];
                                        if (ar.lIlIlIllIlIll(Inventory.contains((String[])stringArray9) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains(llllllllllllllllllIlIIIllllllIlI) ? 1 : 0)) {
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
                                                    0;
                                                }
                                                g.a(new String[llIIlIllIl[0]]);
                                                Time.sleepTicks((int)llIIlIllIl[2]);
                                                0;
                                            }
                                        }
                                    }
                                }
                                g.a(new String[llIIlIllIl[0]]);
                            }
                        }
                        try {
                            ar.gc();
                            0;
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
                    0;
                }
                if (ar.lIlIlIllIlIIl(nM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIlIlI[llIIlIllIl[47]];
                    Movement.walkTo((BankLocation)BankLocation.BURGH_DE_ROTT_BANK);
                    0;
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
                    0;
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
                int llllllllllllllllllIlIIIllIlIlIll;
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
                nArray5[ar.llIIlIllIl[0]] = llllllllllllllllllIlIIIllIlIlIll;
                String[] stringArray2 = new String[llIIlIllIl[1]];
                stringArray2[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[194]];
                if (ar.lIlIlIllIlIIl(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[llIIlIllIl[1]];
                    nArray6[ar.llIIlIllIl[0]] = llllllllllllllllllIlIIIllIlIlIll;
                    Inventory.getFirst((int[])nArray6).interact(llIIlIlIlI[llIIlIllIl[195]]);
                }
                int[] nArray7 = new int[llIIlIllIl[1]];
                nArray7[ar.llIIlIllIl[0]] = llllllllllllllllllIlIIIllIlIlIll;
                String[] stringArray3 = new String[llIIlIllIl[1]];
                stringArray3[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[196]];
                if (ar.lIlIlIllIlIIl(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[llIIlIllIl[1]];
                    nArray8[ar.llIIlIllIl[0]] = llllllllllllllllllIlIIIllIlIlIll;
                    Inventory.getFirst((int[])nArray8).interact(llIIlIlIlI[llIIlIllIl[197]]);
                }
                if (ar.lIlIlIlllIlIl(llllllllllllllllllIlIIIllIlIlIll, llIIlIllIl[198])) {
                    Time.sleepTicks((int)llIIlIllIl[10]);
                    0;
                    String[] stringArray4 = new String[llIIlIllIl[1]];
                    stringArray4[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[199]];
                    g.a(stringArray4);
                    Time.sleepTicks((int)llIIlIllIl[1]);
                    0;
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
                                        TileObject llllllllllllllllllIlIIIllIlIllIl;
                                        if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIlIllIl[3])) {
                                            a.a();
                                            Time.sleepTicks((int)llIIlIllIl[10]);
                                            0;
                                        }
                                        if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(nQ), llIIlIllIl[28]) && ar.lIlIlIllIlllI(llllllllllllllllllIlIIIllIlIllIl = TileObjects.getNearest(tileObject -> {
                                            int n2;
                                            if (ar.lIlIlIllIlIIl(tileObject.getName().equalsIgnoreCase(llIIlIlIlI[llIIlIllIl[251]]) ? 1 : 0)) {
                                                String[] stringArray = new String[llIIlIllIl[1]];
                                                stringArray[ar.llIIlIllIl[0]] = llIIlIlIlI[llIIlIllIl[252]];
                                                if (ar.lIlIlIllIlIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                                    n2 = llIIlIllIl[1];
                                                    0;
                                                    if (null == null) return n2 != 0;
                                                    return ((0x80 ^ 0xB1) & ~(0x10 ^ 0x21)) != 0;
                                                }
                                            }
                                            n2 = llIIlIllIl[0];
                                            return n2 != 0;
                                        }))) {
                                            llllllllllllllllllIlIIIllIlIllIl.interact(llIIlIlIlI[llIIlIllIl[183]]);
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIllIl[158]);
                                            0;
                                        }
                                        if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIIlIllIl[24])) {
                                            int[] nArray = new int[llIIlIllIl[1]];
                                            nArray[ar.llIIlIllIl[0]] = llIIlIllIl[19];
                                            TileObjects.getNearest((int[])nArray).interact(llIIlIlIlI[llIIlIllIl[184]]);
                                            Time.sleepTicks((int)llIIlIllIl[2]);
                                            0;
                                        }
                                    }
                                    if (!ar.lIlIlIllIlIIl(Bank.isOpen() ? 1 : 0)) break block25;
                                    if (ar.lIlIlIlllIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIIlIllIl[11]);
                                        0;
                                    }
                                    if (ar.lIlIlIllIllIl(Players.getLocal().getWorldLocation().distanceTo(b.I), llIIlIllIl[3]) && ar.lIlIlIlllIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llIIlIllIl[2]);
                                        0;
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
                    0;
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
                    0;
                }
            }
            if (ar.lIlIlIllIlIll(Equipment.contains((int[])f.bk) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains((int[])f.bk) ? 1 : 0)) {
                a.b(f.bk, llIIlIllIl[1]);
                Time.sleepTicks((int)llIIlIllIl[1]);
                0;
            }
            if (ar.lIlIlIllIlIll(Equipment.contains((int[])f.aW) ? 1 : 0) && ar.lIlIlIllIlIll(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                a.b(f.aW, llIIlIllIl[1]);
                Time.sleepTicks((int)llIIlIllIl[1]);
                0;
            }
            int[] nArray11 = new int[llIIlIllIl[1]];
            nArray11[ar.llIIlIllIl[0]] = llIIlIllIl[7];
            if (ar.lIlIlIllIlIll(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[llIIlIllIl[1]];
                nArray12[ar.llIIlIllIl[0]] = llIIlIllIl[7];
                if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                    a.a(llIIlIllIl[7], llIIlIllIl[1]);
                    Time.sleepTicks((int)llIIlIllIl[1]);
                    0;
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
                    0;
                }
            }
            int[] nArray15 = new int[llIIlIllIl[1]];
            nArray15[ar.llIIlIllIl[0]] = llIIlIllIl[21];
            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                a.a(llIIlIllIl[21], llIIlIllIl[1]);
                Time.sleepTicks((int)llIIlIllIl[1]);
                0;
            }
            int[] nArray16 = new int[llIIlIllIl[1]];
            nArray16[ar.llIIlIllIl[0]] = llIIlIllIl[22];
            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                a.a(llIIlIllIl[22], llIIlIllIl[1]);
                Time.sleepTicks((int)llIIlIllIl[1]);
                0;
            }
            int[] nArray17 = new int[llIIlIllIl[1]];
            nArray17[ar.llIIlIllIl[0]] = llIIlIllIl[23];
            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                a.a(llIIlIllIl[23], llIIlIllIl[1]);
                Time.sleepTicks((int)llIIlIllIl[1]);
                0;
            }
            if (ar.lIlIlIllIlIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                int[] nArray18 = new int[llIIlIllIl[1]];
                nArray18[ar.llIIlIllIl[0]] = nJ;
                if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                    a.a(nJ, llIIlIllIl[10]);
                    Time.sleepTicks((int)llIIlIllIl[1]);
                    0;
                }
            }
            int[] nArray19 = new int[llIIlIllIl[1]];
            nArray19[ar.llIIlIllIl[0]] = llIIlIllIl[9];
            if (ar.lIlIlIllIlIll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                Bank.withdrawAll((int)llIIlIllIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                Time.sleepTicks((int)llIIlIllIl[1]);
                0;
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
        d llllllllllllllllllIlIIIllIlIIIll;
        block19: {
            block18: {
                block17: {
                    block16: {
                        int[] nArray = new int[llIIlIllIl[1]];
                        nArray[ar.llIIlIllIl[0]] = llIIlIllIl[8];
                        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llIIlIllIl[8], llIIlIllIl[1], e.c(llIIlIllIl[228], llIIlIllIl[229]));
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[llIIlIllIl[1]];
                        nArray2[ar.llIIlIllIl[0]] = llIIlIllIl[230];
                        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            llllllllllllllllllIlIIIllIlIIIll = new d(llIIlIllIl[230], llIIlIllIl[2], llIIlIllIl[231]);
                            bv.add(llllllllllllllllllIlIIIllIlIIIll);
                            0;
                        }
                        int[] nArray3 = new int[llIIlIllIl[1]];
                        nArray3[ar.llIIlIllIl[0]] = llIIlIllIl[232];
                        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            llllllllllllllllllIlIIIllIlIIIll = new d(llIIlIllIl[232], llIIlIllIl[18], llIIlIllIl[233]);
                            bv.add(llllllllllllllllllIlIIIllIlIIIll);
                            0;
                        }
                        int[] nArray4 = new int[llIIlIllIl[1]];
                        nArray4[ar.llIIlIllIl[0]] = llIIlIllIl[22];
                        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            llllllllllllllllllIlIIIllIlIIIll = new d(llIIlIllIl[22], llIIlIllIl[1], e.c(llIIlIllIl[234], llIIlIllIl[235]));
                            bv.add(llllllllllllllllllIlIIIllIlIIIll);
                            0;
                        }
                        int[] nArray5 = new int[llIIlIllIl[1]];
                        nArray5[ar.llIIlIllIl[0]] = llIIlIllIl[23];
                        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            llllllllllllllllllIlIIIllIlIIIll = new d(llIIlIllIl[23], llIIlIllIl[1], e.c(llIIlIllIl[234], llIIlIllIl[235]));
                            bv.add(llllllllllllllllllIlIIIllIlIIIll);
                            0;
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
                    llllllllllllllllllIlIIIllIlIIIll = new d(llIIlIllIl[185], llIIlIllIl[236], e.c(llIIlIllIl[237], llIIlIllIl[238]));
                    bv.add(llllllllllllllllllIlIIIllIlIIIll);
                    0;
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
            llllllllllllllllllIlIIIllIlIIIll = new d(llIIlIllIl[9], llIIlIllIl[4], e.c(llIIlIllIl[159], llIIlIllIl[239]));
            bv.add(llllllllllllllllllIlIIIllIlIIIll);
            0;
        }
        int[] nArray = new int[llIIlIllIl[1]];
        nArray[ar.llIIlIllIl[0]] = llIIlIllIl[240];
        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllllllllllllllllIlIIIllIlIIIll = new d(llIIlIllIl[240], llIIlIllIl[18], llIIlIllIl[241]);
            bv.add(llllllllllllllllllIlIIIllIlIIIll);
            0;
        }
        int[] nArray11 = new int[llIIlIllIl[1]];
        nArray11[ar.llIIlIllIl[0]] = llIIlIllIl[242];
        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
            llllllllllllllllllIlIIIllIlIIIll = new d(mU, llIIlIllIl[59], llIIlIllIl[243]);
            bv.add(llllllllllllllllllIlIIIllIlIIIll);
            0;
        }
        int[] nArray12 = new int[llIIlIllIl[1]];
        nArray12[ar.llIIlIllIl[0]] = llIIlIllIl[244];
        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
            llllllllllllllllllIlIIIllIlIIIll = new d(llIIlIllIl[244], llIIlIllIl[1], llIIlIllIl[245]);
            bv.add(llllllllllllllllllIlIIIllIlIIIll);
            0;
        }
        int[] nArray13 = new int[llIIlIllIl[1]];
        nArray13[ar.llIIlIllIl[0]] = llIIlIllIl[7];
        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
            llllllllllllllllllIlIIIllIlIIIll = new d(llIIlIllIl[7], llIIlIllIl[1], e.c(llIIlIllIl[246], llIIlIllIl[247]));
            bv.add(llllllllllllllllllIlIIIllIlIIIll);
            0;
        }
        int[] nArray14 = new int[llIIlIllIl[1]];
        nArray14[ar.llIIlIllIl[0]] = llIIlIllIl[248];
        if (ar.lIlIlIllIlIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
            llllllllllllllllllIlIIIllIlIIIll = new d(llIIlIllIl[248], llIIlIllIl[36], j.cf);
            bv.add(llllllllllllllllllIlIIIllIlIIIll);
            0;
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

