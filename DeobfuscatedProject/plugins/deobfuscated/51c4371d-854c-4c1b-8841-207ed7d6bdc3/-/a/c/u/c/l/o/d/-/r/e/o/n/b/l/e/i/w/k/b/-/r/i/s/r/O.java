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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import gg.squire.account.AccBuilderBarrows;
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

public class O
implements F {
    static final /* synthetic */ WorldPoint jf;
    private static /* synthetic */ String[] llIIllII;
    public static /* synthetic */ List<d> bB;
    private final /* synthetic */ int jh = 536;
    static final /* synthetic */ WorldPoint jg;
    private static /* synthetic */ int[] llIIlllI;
    public static /* synthetic */ boolean bz;
    static final /* synthetic */ WorldPoint je;
    public static final /* synthetic */ WorldPoint jd;
    public static final /* synthetic */ WorldPoint ja;
    public static final /* synthetic */ WorldPoint jc;
    public static final /* synthetic */ WorldPoint jb;

    private static boolean lIlIlIlIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIllIlI(Object object) {
        return object != null;
    }

    @Override
    public String V() {
        return llIIllII[llIIlllI[75]];
    }

    public static void cz() {
        block44: {
            TileItem lIlIlIIlIllIIll;
            block45: {
                if (O.lIlIlIlIlll(bz ? 1 : 0)) {
                    AccBuilderBarrows.c = llIIllII[llIIlllI[1]];
                    b.a(bB);
                    if (O.lIlIlIllIII(bB.size(), llIIlllI[2])) {
                        System.out.println(llIIllII[llIIlllI[2]]);
                        bz = llIIlllI[1];
                    }
                }
                if (!O.lIlIlIllIIl(bz ? 1 : 0)) break block44;
                if (O.lIlIlIllIIl(O.ac() ? 1 : 0) && O.lIlIlIllIII(Game.getWildyLevel(), llIIlllI[2])) {
                    lIlIlIIlIllIIll = BankLocation.getNearest();
                    if (O.lIlIlIllIlI(lIlIlIIlIllIIll) && O.lIlIlIllIIl(lIlIlIIlIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIIllII[llIIlllI[3]];
                        a.a((BankLocation)lIlIlIIlIllIIll);
                    }
                    if (O.lIlIlIllIlI(lIlIlIIlIllIIll) && O.lIlIlIlIlll(lIlIlIIlIllIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIIllII[llIIlllI[4]];
                        if (O.lIlIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlllI[5]);
                            0;
                        }
                        if (O.lIlIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                            if (O.lIlIlIllIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIlllI[6]);
                                0;
                            }
                            if (O.lIlIlIllIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIlllI[3]);
                                0;
                            }
                            int[] nArray = new int[llIIlllI[4]];
                            nArray[O.llIIlllI[1]] = llIIlllI[7];
                            nArray[O.llIIlllI[2]] = llIIlllI[0];
                            nArray[O.llIIlllI[3]] = llIIlllI[8];
                            if (O.lIlIlIllIIl(e.b(nArray) ? 1 : 0)) {
                                O.ag();
                                System.out.println(llIIllII[llIIlllI[6]]);
                                bz = llIIlllI[2];
                                return;
                            }
                            int[] nArray2 = new int[llIIlllI[4]];
                            nArray2[O.llIIlllI[1]] = llIIlllI[7];
                            nArray2[O.llIIlllI[2]] = llIIlllI[0];
                            nArray2[O.llIIlllI[3]] = llIIlllI[8];
                            if (O.lIlIlIlIlll(e.b(nArray2) ? 1 : 0)) {
                                if (O.lIlIlIllIIl(Equipment.contains((int[])f.bg) ? 1 : 0)) {
                                    a.b(f.bg, llIIlllI[2]);
                                }
                                a.b(f.bb, llIIlllI[2]);
                                a.a(llIIlllI[9], llIIlllI[10]);
                                a.b(llIIlllI[0], llIIlllI[11]);
                            }
                        }
                    }
                }
                if (O.lIlIlIlIlll(O.ac() ? 1 : 0)) {
                    if (O.lIlIlIlIlll(Inventory.contains((int[])f.bb) ? 1 : 0) && O.lIlIlIllIII(Movement.getRunEnergy(), llIIlllI[12])) {
                        Inventory.getFirst((int[])f.bb).interact(llIIllII[llIIlllI[13]]);
                        Time.sleepTicks((int)llIIlllI[2]);
                        0;
                    }
                    if (O.lIlIlIllIIl(Movement.isRunEnabled() ? 1 : 0) && O.lIlIlIlllII(Movement.getRunEnergy(), llIIlllI[14])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)llIIlllI[13]);
                        0;
                    }
                    if (O.lIlIlIllIII(Game.getWildyLevel(), llIIlllI[2])) {
                        AccBuilderBarrows.c = llIIllII[llIIlllI[15]];
                        if (O.lIlIlIlIlll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (O.lIlIlIllIIl(Dialog.isOpen() ? 1 : 0) && O.lIlIlIlIlll(Inventory.contains((int[])f.bg) ? 1 : 0) && O.lIlIlIlllIl(Players.getLocal().getAnimation(), llIIlllI[16])) {
                            Inventory.getFirst((int[])f.bg).interact(llIIllII[llIIlllI[17]]);
                            Time.sleepTicks((int)llIIlllI[3]);
                            0;
                        }
                        String[] stringArray = new String[llIIlllI[3]];
                        stringArray[O.llIIlllI[1]] = llIIllII[llIIlllI[18]];
                        stringArray[O.llIIlllI[2]] = llIIllII[llIIlllI[19]];
                        g.a(stringArray);
                    }
                    if (O.lIlIlIllIll(Game.getWildyLevel())) {
                        TileObject lIlIlIIlIllIIlI;
                        int[] nArray = new int[llIIlllI[2]];
                        nArray[O.llIIlllI[1]] = llIIlllI[0];
                        if (O.lIlIlIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (O.lIlIlIlllII(Players.getLocal().getWorldLocation().distanceTo(jc), llIIlllI[20])) {
                                AccBuilderBarrows.c = llIIllII[llIIlllI[21]];
                                TileItem tileItem = new WorldPoint[llIIlllI[20]];
                                tileItem[O.llIIlllI[1]] = new WorldPoint(llIIlllI[22], llIIlllI[23], llIIlllI[1]);
                                tileItem[O.llIIlllI[2]] = new WorldPoint(llIIlllI[24], llIIlllI[25], llIIlllI[1]);
                                tileItem[O.llIIlllI[3]] = new WorldPoint(llIIlllI[26], llIIlllI[27], llIIlllI[1]);
                                tileItem[O.llIIlllI[4]] = new WorldPoint(llIIlllI[28], llIIlllI[29], llIIlllI[1]);
                                tileItem[O.llIIlllI[6]] = new WorldPoint(llIIlllI[30], llIIlllI[31], llIIlllI[1]);
                                tileItem[O.llIIlllI[13]] = new WorldPoint(llIIlllI[32], llIIlllI[33], llIIlllI[1]);
                                tileItem[O.llIIlllI[15]] = new WorldPoint(llIIlllI[34], llIIlllI[35], llIIlllI[1]);
                                tileItem[O.llIIlllI[17]] = new WorldPoint(llIIlllI[36], llIIlllI[37], llIIlllI[1]);
                                tileItem[O.llIIlllI[18]] = new WorldPoint(llIIlllI[38], llIIlllI[37], llIIlllI[1]);
                                tileItem[O.llIIlllI[19]] = new WorldPoint(llIIlllI[39], llIIlllI[37], llIIlllI[1]);
                                tileItem[O.llIIlllI[21]] = new WorldPoint(llIIlllI[40], llIIlllI[37], llIIlllI[1]);
                                tileItem[O.llIIlllI[41]] = new WorldPoint(llIIlllI[42], llIIlllI[43], llIIlllI[1]);
                                tileItem[O.llIIlllI[44]] = new WorldPoint(llIIlllI[45], llIIlllI[43], llIIlllI[1]);
                                lIlIlIIlIllIIll = tileItem;
                                Walker.walkAlong(Arrays.asList(lIlIlIIlIllIIll), new HashMap());
                                0;
                                Time.sleepTicks((int)llIIlllI[2]);
                                0;
                            }
                            if (O.lIlIlIllllI(Players.getLocal().getWorldLocation().distanceTo(jc), llIIlllI[20])) {
                                AccBuilderBarrows.c = llIIllII[llIIlllI[41]];
                                String[] stringArray = new String[llIIlllI[2]];
                                stringArray[O.llIIlllI[1]] = llIIllII[llIIlllI[44]];
                                lIlIlIIlIllIIll = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[llIIlllI[2]];
                                stringArray2[O.llIIlllI[1]] = llIIllII[llIIlllI[20]];
                                lIlIlIIlIllIIlI = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[llIIlllI[2]];
                                stringArray3[O.llIIlllI[1]] = llIIllII[llIIlllI[46]];
                                if (O.lIlIlIlIlll(lIlIlIIlIllIIlI.hasAction(stringArray3) ? 1 : 0)) {
                                    lIlIlIIlIllIIlI.interact(llIIllII[llIIlllI[47]]);
                                }
                                if (O.lIlIlIllIlI(lIlIlIIlIllIIll)) {
                                    String[] stringArray4 = new String[llIIlllI[2]];
                                    stringArray4[O.llIIlllI[1]] = llIIllII[llIIlllI[48]];
                                    if (O.lIlIlIllIIl(lIlIlIIlIllIIlI.hasAction(stringArray4) ? 1 : 0)) {
                                        int lIlIlIIlIllIIIl = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[llIIlllI[2]];
                                        nArray3[O.llIIlllI[1]] = llIIlllI[0];
                                        String[] stringArray5 = new String[llIIlllI[2]];
                                        stringArray5[O.llIIlllI[1]] = llIIllII[llIIlllI[49]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)llIIlllI[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[llIIlllI[2]];
                        nArray4[O.llIIlllI[1]] = llIIlllI[0];
                        if (O.lIlIlIllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[llIIlllI[2]];
                            nArray5[O.llIIlllI[1]] = llIIlllI[50];
                            if (O.lIlIlIlIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (O.lIlIlIlllII(Players.getLocal().getWorldLocation().distanceTo(jc), llIIlllI[20])) {
                                    AccBuilderBarrows.c = llIIllII[llIIlllI[51]];
                                    WorldPoint[] worldPointArray = new WorldPoint[llIIlllI[20]];
                                    worldPointArray[O.llIIlllI[1]] = new WorldPoint(llIIlllI[22], llIIlllI[23], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[2]] = new WorldPoint(llIIlllI[24], llIIlllI[25], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[3]] = new WorldPoint(llIIlllI[26], llIIlllI[27], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[4]] = new WorldPoint(llIIlllI[28], llIIlllI[29], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[6]] = new WorldPoint(llIIlllI[30], llIIlllI[31], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[13]] = new WorldPoint(llIIlllI[32], llIIlllI[33], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[15]] = new WorldPoint(llIIlllI[34], llIIlllI[35], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[17]] = new WorldPoint(llIIlllI[36], llIIlllI[37], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[18]] = new WorldPoint(llIIlllI[38], llIIlllI[37], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[19]] = new WorldPoint(llIIlllI[39], llIIlllI[37], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[21]] = new WorldPoint(llIIlllI[40], llIIlllI[37], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[41]] = new WorldPoint(llIIlllI[42], llIIlllI[43], llIIlllI[1]);
                                    worldPointArray[O.llIIlllI[44]] = new WorldPoint(llIIlllI[45], llIIlllI[43], llIIlllI[1]);
                                    lIlIlIIlIllIIll = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(lIlIlIIlIllIIll), new HashMap());
                                    0;
                                    Time.sleepTicks((int)llIIlllI[2]);
                                    0;
                                }
                                if (O.lIlIlIllllI(Players.getLocal().getWorldLocation().distanceTo(jc), llIIlllI[20])) {
                                    AccBuilderBarrows.c = llIIllII[llIIlllI[52]];
                                    if (!O.lIlIlIllIIl(Dialog.canLevelUpContinue() ? 1 : 0) || O.lIlIlIlIlll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[llIIlllI[2]];
                                    stringArray[O.llIIlllI[1]] = llIIllII[llIIlllI[14]];
                                    lIlIlIIlIllIIll = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[llIIlllI[2]];
                                    stringArray6[O.llIIlllI[1]] = llIIllII[llIIlllI[53]];
                                    lIlIlIIlIllIIlI = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[llIIlllI[2]];
                                    stringArray7[O.llIIlllI[1]] = llIIllII[llIIlllI[54]];
                                    if (O.lIlIlIlIlll(lIlIlIIlIllIIlI.hasAction(stringArray7) ? 1 : 0)) {
                                        lIlIlIIlIllIIlI.interact(llIIllII[llIIlllI[55]]);
                                    }
                                    if (O.lIlIlIllIlI(lIlIlIIlIllIIll)) {
                                        String[] stringArray8 = new String[llIIlllI[2]];
                                        stringArray8[O.llIIlllI[1]] = llIIllII[llIIlllI[56]];
                                        if (O.lIlIlIllIIl(lIlIlIIlIllIIlI.hasAction(stringArray8) ? 1 : 0)) {
                                            List lIlIlIIlIllIIIl;
                                            if (O.lIlIlIllIIl(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[llIIlllI[2]];
                                                nArray6[O.llIIlllI[1]] = llIIlllI[50];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)lIlIlIIlIllIIll);
                                                Time.sleepTicks((int)llIIlllI[3]);
                                                0;
                                            }
                                            if (O.lIlIlIlIlll(Dialog.isOpen() ? 1 : 0) && O.lIlIlIllIIl((lIlIlIIlIllIIIl = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int lIlIlIIlIllIIII = llIIlllI[1];
                                                while (O.lIlIlIllIII(lIlIlIIlIllIIII, lIlIlIIlIllIIIl.size())) {
                                                    int[] nArray7 = new int[llIIlllI[2]];
                                                    nArray7[O.llIIlllI[1]] = llIIlllI[50];
                                                    if (O.lIlIlIlllIl(((Item)Inventory.getAll((int[])nArray7).get(llIIlllI[1])).getQuantity(), llIIlllI[2]) && O.lIlIlIlIlll(((Widget)lIlIlIIlIllIIIl.get(lIlIlIIlIllIIII)).getText().contains(llIIllII[llIIlllI[57]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIlIlIIlIllIIIl.get(lIlIlIIlIllIIII)).getClickPoint().getX(), (int)((Widget)lIlIlIIlIllIIIl.get(lIlIlIIlIllIIII)).getClickPoint().getY(), (boolean)llIIlllI[2]);
                                                        Time.sleepTicks((int)llIIlllI[3]);
                                                        0;
                                                    }
                                                    int[] nArray8 = new int[llIIlllI[2]];
                                                    nArray8[O.llIIlllI[1]] = llIIlllI[50];
                                                    if (O.lIlIlIlllIl(((Item)Inventory.getAll((int[])nArray8).get(llIIlllI[1])).getQuantity(), llIIlllI[13]) && O.lIlIlIlIlll(((Widget)lIlIlIIlIllIIIl.get(lIlIlIIlIllIIII)).getText().contains(llIIllII[llIIlllI[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIlIlIIlIllIIIl.get(lIlIlIIlIllIIII)).getClickPoint().getX(), (int)((Widget)lIlIlIIlIllIIIl.get(lIlIlIIlIllIIII)).getClickPoint().getY(), (boolean)llIIlllI[2]);
                                                        Time.sleepTicks((int)llIIlllI[3]);
                                                        0;
                                                    }
                                                    if (O.lIlIlIlIlll(((Widget)lIlIlIIlIllIIIl.get(lIlIlIIlIllIIII)).getText().contains(llIIllII[llIIlllI[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIlIlIIlIllIIIl.get(lIlIlIIlIllIIII)).getClickPoint().getX(), (int)((Widget)lIlIlIIlIllIIIl.get(lIlIlIIlIllIIII)).getClickPoint().getY(), (boolean)llIIlllI[2]);
                                                        Time.sleepTicks((int)llIIlllI[3]);
                                                        0;
                                                    }
                                                    ++lIlIlIIlIllIIII;
                                                    0;
                                                    if (-(5 ^ 0x46 ^ (0x69 ^ 0x2F)) < 0) continue;
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
                int[] nArray = new int[llIIlllI[2]];
                nArray[O.llIIlllI[1]] = llIIlllI[9];
                if (!O.lIlIlIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[llIIlllI[2]];
                nArray9[O.llIIlllI[1]] = llIIlllI[0];
                if (!O.lIlIlIllIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[llIIlllI[2]];
                nArray10[O.llIIlllI[1]] = llIIlllI[50];
                if (!O.lIlIlIllIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (O.lIlIlIllllI(Players.getLocal().getWorldLocation().distanceTo(jc), llIIlllI[20])) {
                AccBuilderBarrows.c = llIIllII[llIIlllI[60]];
                String[] stringArray = new String[llIIlllI[2]];
                stringArray[O.llIIlllI[1]] = llIIllII[llIIlllI[61]];
                lIlIlIIlIllIIll = TileItems.getNearest((String[])stringArray);
                if (O.lIlIlIllIlI(lIlIlIIlIllIIll)) {
                    lIlIlIIlIllIIll.interact(llIIllII[llIIlllI[62]]);
                }
            }
        }
    }

    private static boolean lIlIlIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    public O() {
        this.jh = llIIlllI[0];
    }

    private static void lIlIlIlIllI() {
        llIIlllI = new int[88];
        O.llIIlllI[0] = -(0xFFFFFFFE & 0x7D63) & (0xFFFFFF7F & 0x7FF9);
        O.llIIlllI[1] = (0x38 ^ 0xD) & ~(9 ^ 0x3C);
        O.llIIlllI[2] = 1;
        O.llIIlllI[3] = 2;
        O.llIIlllI[4] = 3;
        O.llIIlllI[5] = -(0xFFFFCEF7 & 0x7D2A) & (0xFFFFDFFF & 0x7FA9);
        O.llIIlllI[6] = 0x2B ^ 0x4E ^ (0x1F ^ 0x7E);
        O.llIIlllI[7] = 0xFFFFF3BE & 0x5EEF;
        O.llIIlllI[8] = -(0xFFFF9DB7 & 0x6E6F) & (0xFFFFBDFF & 0x7F77);
        O.llIIlllI[9] = 0xFFFFF3F7 & 0xFEB;
        O.llIIlllI[10] = -(0xFFFFBEFB & 0x55D6) & (0xFFFFFFDF & 0x3DF5);
        O.llIIlllI[11] = 127 + 182 - 223 + 114;
        O.llIIlllI[12] = 0x27 ^ 0x15;
        O.llIIlllI[13] = 45 + 5 - -76 + 11 ^ 124 + 92 - 144 + 68;
        O.llIIlllI[14] = 0x21 ^ 0x35;
        O.llIIlllI[15] = 16 + 114 - 2 + 31 ^ 94 + 5 - -8 + 46;
        O.llIIlllI[16] = -1;
        O.llIIlllI[17] = 0x5E ^ 0x22 ^ (0x6E ^ 0x15);
        O.llIIlllI[18] = 84 + 66 - 119 + 153 ^ 112 + 155 - 99 + 8;
        O.llIIlllI[19] = 0x61 ^ 0x18 ^ (0xE4 ^ 0x94);
        O.llIIlllI[20] = 0xB6 ^ 0xBB;
        O.llIIlllI[21] = 0xA2 ^ 0x8B ^ (0xBD ^ 0x9E);
        O.llIIlllI[22] = -(0xFFFFFBAD & 0x3476) & (0xFFFFFFFF & 0x3BF7);
        O.llIIlllI[23] = -(0xFFFFF4BB & 0x4BFE) & (0xFFFFFFBB & 0x4FFF);
        O.llIIlllI[24] = 0xFFFF9FF6 & 0x6BDB;
        O.llIIlllI[25] = -(0xFFFFDB51 & 0x35AF) & (0xFFFFFFFF & 0x1FFB);
        O.llIIlllI[26] = 0xFFFF9BCF & 0x6FFB;
        O.llIIlllI[27] = 0xFFFFAEF9 & 0x5FFE;
        O.llIIlllI[28] = -(0xFFFFF69B & 0x7975) & (0xFFFFFBF7 & 0x7FDF);
        O.llIIlllI[29] = 0xFFFF9FFD & 0x6EF7;
        O.llIIlllI[30] = 0xFFFFFBD6 & 0xFEB;
        O.llIIlllI[31] = 0xFFFF9FF1 & 0x6EFF;
        O.llIIlllI[32] = -(0xFFFFE56F & 0x5AD3) & (0xFFFFDBFF & 0x6FFF);
        O.llIIlllI[33] = -(0xFFFFFB3B & 0x65D5) & (0xFFFFFFFE & 0x6FFF);
        O.llIIlllI[34] = 0xFFFFAFFF & 0x5BB7;
        O.llIIlllI[35] = -(0xFFFFD337 & 0x7DDA) & (0xFFFFFFFF & 0x5FFB);
        O.llIIlllI[36] = 0xFFFF8FFF & 0x7BAF;
        O.llIIlllI[37] = -(0xFFFFE957 & 0x76AD) & (0xFFFFFFEF & 0x6EFF);
        O.llIIlllI[38] = -(0xFFFFF569 & 0x3ED7) & (0xFFFFBFE7 & Short.MAX_VALUE);
        O.llIIlllI[39] = -(0xFFFFE509 & 0x7AF7) & (0xFFFFEBA3 & 0x7FFC);
        O.llIIlllI[40] = -(0xFFFFDE75 & 0x31EF) & (0xFFFFFFFF & 0x1BFE);
        O.llIIlllI[41] = 0x1D ^ 0x16;
        O.llIIlllI[42] = -(0xFFFFE1AF & 0x7E59) & (0xFFFFEFBF & 0x7BDB);
        O.llIIlllI[43] = -(0xFFFFBD14 & 0x72EF) & (0xFFFFBEEF & Short.MAX_VALUE);
        O.llIIlllI[44] = 0x47 ^ 0x6F ^ (0x59 ^ 0x7D);
        O.llIIlllI[45] = -(0xFFFFFDE9 & 0x2617) & (0xFFFFAFDF & 0x7FAF);
        O.llIIlllI[46] = 9 + 65 - -34 + 58 ^ 59 + 52 - -45 + 12;
        O.llIIlllI[47] = 0xF2 ^ 0x87 ^ (0x47 ^ 0x3D);
        O.llIIlllI[48] = 85 + 27 - 56 + 119 ^ 150 + 78 - 76 + 39;
        O.llIIlllI[49] = 0x3A ^ 0x14 ^ (9 ^ 0x36);
        O.llIIlllI[50] = 0xFFFF971B & 0x6AFD;
        O.llIIlllI[51] = 0x13 ^ 0x37 ^ (0x8E ^ 0xB8);
        O.llIIlllI[52] = 0x36 ^ 0x25;
        O.llIIlllI[53] = 0x59 ^ 0x4C;
        O.llIIlllI[54] = 0x84 ^ 0x92;
        O.llIIlllI[55] = 0x2D ^ 0x3A;
        O.llIIlllI[56] = 124 + 10 - 29 + 48 ^ 1 + 3 - -91 + 34;
        O.llIIlllI[57] = 0x4B ^ 0x52;
        O.llIIlllI[58] = 0x4F ^ 0x55;
        O.llIIlllI[59] = 0x15 ^ 0xE;
        O.llIIlllI[60] = 124 + 118 - 145 + 76 ^ 10 + 147 - -1 + 19;
        O.llIIlllI[61] = 0xB4 ^ 0xA9;
        O.llIIlllI[62] = 0x1D ^ 3;
        O.llIIlllI[63] = -(0xFFFFFC1A & 0x37EF) & (0xFFFFBEFF & 0x7FF9);
        O.llIIlllI[64] = -(0xFFFFBF9B & 0x5066) & (0xFFFFFECD & 0x3FFF);
        O.llIIlllI[65] = 0xFFFFE9FC & 0x77AB;
        O.llIIlllI[66] = 0xFFFFFF57 & 0x1FEF;
        O.llIIlllI[67] = 0xA4 ^ 0xBA ^ (0x95 ^ 0xA3);
        O.llIIlllI[68] = 0xFFFFABC6 & 0x57BD;
        O.llIIlllI[69] = 0xFFFFFDFF & 0x42F4E;
        O.llIIlllI[70] = 5 ^ 0x39;
        O.llIIlllI[71] = 0x70 ^ 0x5D;
        O.llIIlllI[72] = -(0xFFFFF73F & 0x48F9) & (0xFFFFCBFA & 0x75FF);
        O.llIIlllI[73] = 0xFFFFF5FB & 0xFA4C;
        O.llIIlllI[74] = 0x41 ^ 0x1E ^ (9 ^ 0x32);
        O.llIIlllI[75] = 4 ^ 0x1B;
        O.llIIlllI[76] = 0xD5 ^ 0xB6;
        O.llIIlllI[77] = 138 + 88 - 219 + 147 ^ 173 + 81 - 109 + 41;
        O.llIIlllI[78] = -(0xFFFFEEFF & 0x7109) & (0xFFFFEFDD & 0x7BFF);
        O.llIIlllI[79] = -(0xFFFFF2FE & 0x7D83) & (0xFFFFFFFD & 0x7F87);
        O.llIIlllI[80] = 0xFFFF8FFA & 0x7BB7;
        O.llIIlllI[81] = 0xFFFF9EEB & 0x6FFD;
        O.llIIlllI[82] = 0xFFFFBBAF & 0x4FD6;
        O.llIIlllI[83] = -(0xFFFFF47D & 0x1B83) & (0xFFFF9EEF & 0x7FFD);
        O.llIIlllI[84] = -(0xFFFFDCFD & 0x7766) & (0xFFFFFFF7 & 0x5FEF);
        O.llIIlllI[85] = -(0xFFFFE3C9 & Short.MAX_VALUE) & (0xFFFFEFFE & 0x7FDF);
        O.llIIlllI[86] = 0xFFFF8DBF & 0x7FE3;
        O.llIIlllI[87] = 89 + 14 - 99 + 134 ^ 73 + 110 - 32 + 20;
    }

    private static String lIlIlIIllll(String lIlIlIIlIIIIllI, String lIlIlIIlIIIIIll) {
        try {
            SecretKeySpec lIlIlIIlIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), llIIlllI[18]), "DES");
            Cipher lIlIlIIlIIIlIII = Cipher.getInstance("DES");
            lIlIlIIlIIIlIII.init(llIIlllI[3], lIlIlIIlIIIlIIl);
            return new String(lIlIlIIlIIIlIII.doFinal(Base64.getDecoder().decode(lIlIlIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIlIIIIlll) {
            lIlIlIIlIIIIlll.printStackTrace();
            return null;
        }
    }

    static {
        O.lIlIlIlIllI();
        O.lIlIlIlIIlI();
        ja = new WorldPoint(llIIlllI[78], llIIlllI[79], llIIlllI[1]);
        jb = new WorldPoint(llIIlllI[80], llIIlllI[81], llIIlllI[1]);
        jc = new WorldPoint(llIIlllI[82], llIIlllI[83], llIIlllI[1]);
        jd = new WorldPoint(llIIlllI[84], llIIlllI[43], llIIlllI[1]);
        je = new WorldPoint(llIIlllI[1], llIIlllI[1], llIIlllI[1]);
        jf = new WorldPoint(llIIlllI[1], llIIlllI[1], llIIlllI[1]);
        jg = new WorldPoint(llIIlllI[85], llIIlllI[86], llIIlllI[1]);
        bB = new ArrayList<d>();
    }

    @Override
    public boolean T() {
        return llIIlllI[1];
    }

    private static boolean lIlIlIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIllIll(int n2) {
        return n2 > 0;
    }

    private static String lIlIlIlIIII(String lIlIlIIIlllIlll, String lIlIlIIIllllIII) {
        try {
            SecretKeySpec lIlIlIIIlllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIIllllIll = Cipher.getInstance("Blowfish");
            lIlIlIIIllllIll.init(llIIlllI[3], lIlIlIIIlllllII);
            return new String(lIlIlIIIllllIll.doFinal(Base64.getDecoder().decode(lIlIlIIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIIllllIlI) {
            lIlIlIIIllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static int cA() {
        int n2 = llIIlllI[69];
        if (O.lIlIlIllIII(Skills.getLevel((Skill)Skill.PRAYER), llIIlllI[70]) && O.lIlIlIlllll(Skills.getLevel((Skill)Skill.PRAYER), llIIlllI[71])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIlllI[72] + llIIlllI[21];
        }
        int n3 = llIIlllI[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIlllI[72] + llIIlllI[62];
    }

    @Override
    public boolean W() {
        boolean bl;
        if (O.lIlIlIlllll(Skills.getLevel((Skill)Skill.PRAYER), llIIlllI[76])) {
            bl = llIIlllI[2];
            0;
            if ((0xA3 ^ 0xA7) < 0) {
                return ((0x52 ^ 0x33) & ~(0x71 ^ 0x10)) != 0;
            }
        } else {
            bl = llIIlllI[1];
        }
        return bl;
    }

    private static boolean lIlIlIlllII(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int U() {
        try {
            O.cz();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 == (49 + 47 - -76 + 8 ^ 123 + 48 - 141 + 146)) {
            return (0x44 ^ 0x2F ^ (1 ^ 8)) & (0x85 ^ 0xB5 ^ (0xF4 ^ 0xA6) ^ -1);
        }
        return llIIlllI[74];
    }

    private static void lIlIlIlIIlI() {
        llIIllII = new String[llIIlllI[87]];
        O.llIIllII[O.llIIlllI[1]] = O."Buying items";
        O.llIIllII[O.llIIlllI[2]] = O."Finished buying items, switching back to prayer";
        O.llIIllII[O.llIIlllI[3]] = O."Navigating to bank";
        O.llIIllII[O.llIIlllI[4]] = O."Handling banking";
        O.llIIllII[O.llIIlllI[6]] = O."We are missing prayer supplies, switching to BUYING";
        O.llIIllII[O.llIIlllI[13]] = O."Drink";
        O.llIIllII[O.llIIlllI[15]] = O."Tele to wildy";
        O.llIIllII[O.llIIlllI[17]] = O."Rub";
        O.llIIllII[O.llIIlllI[18]] = O."Lava Maze";
        O.llIIllII[O.llIIlllI[19]] = O."Okay, teleport to level 41 Wilderness.";
        O.llIIllII[O.llIIlllI[21]] = O."Nav to altar";
        O.llIIllII[O.llIIlllI[41]] = O."1 tick pray";
        O.llIIllII[O.llIIlllI[44]] = O."Chaos altar";
        O.llIIllII[O.llIIlllI[20]] = O."Large door";
        O.llIIllII[O.llIIlllI[46]] = O."Open";
        O.llIIllII[O.llIIlllI[47]] = O."Open";
        O.llIIllII[O.llIIlllI[48]] = O."Open";
        O.llIIllII[O.llIIlllI[49]] = O."Chaos altar";
        O.llIIllII[O.llIIlllI[51]] = O."Nav to altar";
        O.llIIllII[O.llIIlllI[52]] = O."Unnoting bones";
        O.llIIllII[O.llIIlllI[14]] = O."Elder Chaos druid";
        O.llIIllII[O.llIIlllI[53]] = O."Large door";
        O.llIIllII[O.llIIlllI[54]] = O."Open";
        O.llIIllII[O.llIIlllI[55]] = O."Open";
        O.llIIllII[O.llIIlllI[56]] = O."Open";
        O.llIIllII[O.llIIlllI[57]] = O."Exchange";
        O.llIIllII[O.llIIlllI[58]] = O."Exchange 5";
        O.llIIllII[O.llIIlllI[59]] = O."Exchange All";
        O.llIIllII[O.llIIlllI[60]] = O."Suiciding";
        O.llIIllII[O.llIIlllI[61]] = O."Wine of zamorak";
        O.llIIllII[O.llIIlllI[62]] = O."Take";
        O.llIIllII[O.llIIlllI[75]] = O."Prayer training";
        O.llIIllII[O.llIIlllI[77]] = O."ring of wealth (";
    }

    private static boolean lIlIlIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIllIIl(int n2) {
        return n2 == 0;
    }

    private static void ag() {
        d lIlIlIIlIlIllII;
        Object lIlIlIIlIlIllIl;
        int[] nArray = new int[llIIlllI[2]];
        nArray[O.llIIlllI[1]] = llIIlllI[8];
        if (O.lIlIlIllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIlllI[8], llIIlllI[13], i.bw);
            bB.add(d2);
            0;
        }
        int[] nArray2 = new int[llIIlllI[2]];
        nArray2[O.llIIlllI[1]] = llIIlllI[0];
        if (O.lIlIlIllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlIlIIlIlIllIl = new d(llIIlllI[0], O.cA(), llIIlllI[63]);
            bB.add((d)lIlIlIIlIlIllIl);
            0;
        }
        int[] nArray3 = new int[llIIlllI[2]];
        nArray3[O.llIIlllI[1]] = llIIlllI[7];
        if (O.lIlIlIllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlIlIIlIlIllIl = new d(llIIlllI[7], llIIlllI[3], llIIlllI[5]);
            bB.add((d)lIlIlIIlIlIllIl);
            0;
        }
        if (O.lIlIlIllIIl(Bank.contains((Predicate)(lIlIlIIlIlIllIl = item -> item.getName().toLowerCase().contains(llIIllII[llIIlllI[77]]))) ? 1 : 0)) {
            lIlIlIIlIlIllII = new d(llIIlllI[64], llIIlllI[13], llIIlllI[65]);
            bB.add(lIlIlIIlIlIllII);
            0;
        }
        int[] nArray4 = new int[llIIlllI[2]];
        nArray4[O.llIIlllI[1]] = llIIlllI[66];
        if (O.lIlIlIllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlIlIIlIlIllII = new d(llIIlllI[66], llIIlllI[67], llIIlllI[68]);
            bB.add(lIlIlIIlIlIllII);
            0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[llIIlllI[2]];
                nArray[O.llIIlllI[1]] = llIIlllI[9];
                if (!O.lIlIlIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[llIIlllI[2]];
                nArray2[O.llIIlllI[1]] = llIIlllI[9];
                if (!O.lIlIlIlllll(Inventory.getFirst((int[])nArray2).getQuantity(), llIIlllI[12])) break block2;
                if (!O.lIlIlIllIIl(Inventory.contains((int[])f.bg) ? 1 : 0)) break block3;
                if (!O.lIlIlIlIlll(Equipment.contains((int[])f.bg) ? 1 : 0)) break block2;
                int[] nArray3 = new int[llIIlllI[2]];
                nArray3[O.llIIlllI[1]] = llIIlllI[0];
                if (!O.lIlIlIllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[llIIlllI[2]];
                nArray4[O.llIIlllI[1]] = llIIlllI[50];
                if (!O.lIlIlIlIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = llIIlllI[2];
            0;
            if (-1 != 1) return n2 != 0;
            return ((0x8F ^ 0xC0) & ~(0x7E ^ 0x31)) != 0;
        }
        n2 = llIIlllI[1];
        return n2 != 0;
    }

    private static String lIlIlIlIIIl(String lIlIlIIlIIlIllI, String lIlIlIIlIIllIlI) {
        lIlIlIIlIIlIllI = new String(Base64.getDecoder().decode(lIlIlIIlIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIIlIIllIIl = new StringBuilder();
        char[] lIlIlIIlIIllIII = lIlIlIIlIIllIlI.toCharArray();
        int lIlIlIIlIIlIlll = llIIlllI[1];
        char[] lIlIlIIlIIlIIIl = lIlIlIIlIIlIllI.toCharArray();
        int lIlIlIIlIIlIIII = lIlIlIIlIIlIIIl.length;
        int lIlIlIIlIIIllll = llIIlllI[1];
        while (O.lIlIlIllIII(lIlIlIIlIIIllll, lIlIlIIlIIlIIII)) {
            char lIlIlIIlIIlllII = lIlIlIIlIIlIIIl[lIlIlIIlIIIllll];
            lIlIlIIlIIllIIl.append((char)(lIlIlIIlIIlllII ^ lIlIlIIlIIllIII[lIlIlIIlIIlIlll % lIlIlIIlIIllIII.length]));
            0;
            ++lIlIlIIlIIlIlll;
            ++lIlIlIIlIIIllll;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lIlIlIIlIIllIIl);
    }
}

