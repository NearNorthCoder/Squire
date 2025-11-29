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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
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

public class T
implements K {
    public static final /* synthetic */ WorldPoint kt;
    public static final /* synthetic */ WorldPoint ku;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<d> bp;
    private static /* synthetic */ int[] lIlIIIllIl;
    static final /* synthetic */ WorldPoint kx;
    static final /* synthetic */ WorldPoint kw;
    static final /* synthetic */ WorldPoint ky;
    public static final /* synthetic */ WorldPoint ks;
    public static final /* synthetic */ WorldPoint kv;
    private static /* synthetic */ String[] lIlIIIllII;
    private final /* synthetic */ int kz = 536;

    private static String lIIIlIlIIlIII(String llllllllllllllllllllIlIIIIIlllII, String llllllllllllllllllllIlIIIIIllIll) {
        try {
            SecretKeySpec llllllllllllllllllllIlIIIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIIIIIllIll.getBytes(StandardCharsets.UTF_8)), lIlIIIllIl[19]), "DES");
            Cipher llllllllllllllllllllIlIIIIIllllI = Cipher.getInstance("DES");
            llllllllllllllllllllIlIIIIIllllI.init(lIlIIIllIl[4], llllllllllllllllllllIlIIIIIlllll);
            return new String(llllllllllllllllllllIlIIIIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllIlIIIIIlllIl) {
            llllllllllllllllllllIlIIIIIlllIl.printStackTrace();
            return null;
        }
    }

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
            "".length();
            if (null == null) return n2 != 0;
            return ((0x24 ^ 0xC) & ~(0x11 ^ 0x39)) != 0;
        }
        n2 = lIlIIIllIl[1];
        return n2 != 0;
    }

    private static boolean lIIIlIlIlIlII(int n2, int n3) {
        return n2 >= n3;
    }

    public static void dg() {
        block44: {
            TileItem llllllllllllllllllllIlIIIlIlIllI;
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
                    llllllllllllllllllllIlIIIlIlIllI = BankLocation.getNearest();
                    if (T.lIIIlIlIIllll(llllllllllllllllllllIlIIIlIlIllI) && T.lIIIlIlIIlllI(llllllllllllllllllllIlIIIlIlIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[4]];
                        a.a((BankLocation)llllllllllllllllllllIlIIIlIlIllI);
                    }
                    if (T.lIIIlIlIIllll(llllllllllllllllllllIlIIIlIlIllI) && T.lIIIlIlIIllII(llllllllllllllllllllIlIIIlIlIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[5]];
                        if (T.lIIIlIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIllIl[6]);
                            "".length();
                        }
                        if (T.lIIIlIlIIllII(Bank.isOpen() ? 1 : 0)) {
                            if (T.lIIIlIlIlIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIIIllIl[7]);
                                "".length();
                            }
                            if (T.lIIIlIlIlIIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlIIIllIl[4]);
                                "".length();
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
                        "".length();
                    }
                    if (T.lIIIlIlIIlllI(Movement.isRunEnabled() ? 1 : 0) && T.lIIIlIlIlIIIl(Movement.getRunEnergy(), lIlIIIllIl[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lIlIIIllIl[14]);
                        "".length();
                    }
                    if (T.lIIIlIlIIllIl(Game.getWildyLevel(), lIlIIIllIl[2])) {
                        AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[16]];
                        if (T.lIIIlIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (T.lIIIlIlIIlllI(Dialog.isOpen() ? 1 : 0) && T.lIIIlIlIIllII(Inventory.contains((int[])f.aZ) ? 1 : 0) && T.lIIIlIlIlIIlI(Players.getLocal().getAnimation(), lIlIIIllIl[17])) {
                            Inventory.getFirst((int[])f.aZ).interact(lIlIIIllII[lIlIIIllIl[18]]);
                            Time.sleepTicks((int)lIlIIIllIl[4]);
                            "".length();
                        }
                        String[] stringArray = new String[lIlIIIllIl[4]];
                        stringArray[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[19]];
                        stringArray[T.lIlIIIllIl[2]] = lIlIIIllII[lIlIIIllIl[20]];
                        g.a(stringArray);
                    }
                    if (T.lIIIlIlIlIIII(Game.getWildyLevel())) {
                        TileObject llllllllllllllllllllIlIIIlIlIlIl;
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
                                llllllllllllllllllllIlIIIlIlIllI = tileItem;
                                Walker.walkAlong(Arrays.asList(llllllllllllllllllllIlIIIlIlIllI), new HashMap());
                                "".length();
                                Time.sleepTicks((int)lIlIIIllIl[2]);
                                "".length();
                            }
                            if (T.lIIIlIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                                AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[42]];
                                String[] stringArray = new String[lIlIIIllIl[2]];
                                stringArray[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[45]];
                                llllllllllllllllllllIlIIIlIlIllI = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lIlIIIllIl[2]];
                                stringArray2[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[21]];
                                llllllllllllllllllllIlIIIlIlIlIl = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lIlIIIllIl[2]];
                                stringArray3[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[47]];
                                if (T.lIIIlIlIIllII(llllllllllllllllllllIlIIIlIlIlIl.hasAction(stringArray3) ? 1 : 0)) {
                                    llllllllllllllllllllIlIIIlIlIlIl.interact(lIlIIIllII[lIlIIIllIl[48]]);
                                }
                                if (T.lIIIlIlIIllll(llllllllllllllllllllIlIIIlIlIllI)) {
                                    String[] stringArray4 = new String[lIlIIIllIl[2]];
                                    stringArray4[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[49]];
                                    if (T.lIIIlIlIIlllI(llllllllllllllllllllIlIIIlIlIlIl.hasAction(stringArray4) ? 1 : 0)) {
                                        int llllllllllllllllllllIlIIIlIlIlII = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lIlIIIllIl[2]];
                                        nArray3[T.lIlIIIllIl[1]] = lIlIIIllIl[0];
                                        String[] stringArray5 = new String[lIlIIIllIl[2]];
                                        stringArray5[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lIlIIIllIl[2]);
                                        "".length();
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
                                    llllllllllllllllllllIlIIIlIlIllI = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(llllllllllllllllllllIlIIIlIlIllI), new HashMap());
                                    "".length();
                                    Time.sleepTicks((int)lIlIIIllIl[2]);
                                    "".length();
                                }
                                if (T.lIIIlIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(ku), lIlIIIllIl[21])) {
                                    AccBuilderShamans.c = lIlIIIllII[lIlIIIllIl[53]];
                                    if (!T.lIIIlIlIIlllI(Dialog.canLevelUpContinue() ? 1 : 0) || T.lIIIlIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lIlIIIllIl[2]];
                                    stringArray[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[15]];
                                    llllllllllllllllllllIlIIIlIlIllI = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lIlIIIllIl[2]];
                                    stringArray6[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[54]];
                                    llllllllllllllllllllIlIIIlIlIlIl = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lIlIIIllIl[2]];
                                    stringArray7[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[55]];
                                    if (T.lIIIlIlIIllII(llllllllllllllllllllIlIIIlIlIlIl.hasAction(stringArray7) ? 1 : 0)) {
                                        llllllllllllllllllllIlIIIlIlIlIl.interact(lIlIIIllII[lIlIIIllIl[56]]);
                                    }
                                    if (T.lIIIlIlIIllll(llllllllllllllllllllIlIIIlIlIllI)) {
                                        String[] stringArray8 = new String[lIlIIIllIl[2]];
                                        stringArray8[T.lIlIIIllIl[1]] = lIlIIIllII[lIlIIIllIl[57]];
                                        if (T.lIIIlIlIIlllI(llllllllllllllllllllIlIIIlIlIlIl.hasAction(stringArray8) ? 1 : 0)) {
                                            List llllllllllllllllllllIlIIIlIlIlII;
                                            if (T.lIIIlIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lIlIIIllIl[2]];
                                                nArray6[T.lIlIIIllIl[1]] = lIlIIIllIl[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)llllllllllllllllllllIlIIIlIlIllI);
                                                Time.sleepTicks((int)lIlIIIllIl[4]);
                                                "".length();
                                            }
                                            if (T.lIIIlIlIIllII(Dialog.isOpen() ? 1 : 0) && T.lIIIlIlIIlllI((llllllllllllllllllllIlIIIlIlIlII = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int llllllllllllllllllllIlIIIlIlIIll = lIlIIIllIl[1];
                                                while (T.lIIIlIlIIllIl(llllllllllllllllllllIlIIIlIlIIll, llllllllllllllllllllIlIIIlIlIlII.size())) {
                                                    int[] nArray7 = new int[lIlIIIllIl[2]];
                                                    nArray7[T.lIlIIIllIl[1]] = lIlIIIllIl[51];
                                                    if (T.lIIIlIlIlIIlI(((Item)Inventory.getAll((int[])nArray7).get(lIlIIIllIl[1])).getQuantity(), lIlIIIllIl[2]) && T.lIIIlIlIIllII(((Widget)llllllllllllllllllllIlIIIlIlIlII.get(llllllllllllllllllllIlIIIlIlIIll)).getText().contains(lIlIIIllII[lIlIIIllIl[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllllIlIIIlIlIlII.get(llllllllllllllllllllIlIIIlIlIIll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllllIlIIIlIlIlII.get(llllllllllllllllllllIlIIIlIlIIll)).getClickPoint().getY(), (boolean)lIlIIIllIl[2]);
                                                        Time.sleepTicks((int)lIlIIIllIl[4]);
                                                        "".length();
                                                    }
                                                    int[] nArray8 = new int[lIlIIIllIl[2]];
                                                    nArray8[T.lIlIIIllIl[1]] = lIlIIIllIl[51];
                                                    if (T.lIIIlIlIlIIlI(((Item)Inventory.getAll((int[])nArray8).get(lIlIIIllIl[1])).getQuantity(), lIlIIIllIl[14]) && T.lIIIlIlIIllII(((Widget)llllllllllllllllllllIlIIIlIlIlII.get(llllllllllllllllllllIlIIIlIlIIll)).getText().contains(lIlIIIllII[lIlIIIllIl[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllllIlIIIlIlIlII.get(llllllllllllllllllllIlIIIlIlIIll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllllIlIIIlIlIlII.get(llllllllllllllllllllIlIIIlIlIIll)).getClickPoint().getY(), (boolean)lIlIIIllIl[2]);
                                                        Time.sleepTicks((int)lIlIIIllIl[4]);
                                                        "".length();
                                                    }
                                                    if (T.lIIIlIlIIllII(((Widget)llllllllllllllllllllIlIIIlIlIlII.get(llllllllllllllllllllIlIIIlIlIIll)).getText().contains(lIlIIIllII[lIlIIIllIl[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllllIlIIIlIlIlII.get(llllllllllllllllllllIlIIIlIlIIll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllllIlIIIlIlIlII.get(llllllllllllllllllllIlIIIlIlIIll)).getClickPoint().getY(), (boolean)lIlIIIllIl[2]);
                                                        Time.sleepTicks((int)lIlIIIllIl[4]);
                                                        "".length();
                                                    }
                                                    ++llllllllllllllllllllIlIIIlIlIIll;
                                                    "".length();
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
                llllllllllllllllllllIlIIIlIlIllI = TileItems.getNearest((String[])stringArray);
                if (T.lIIIlIlIIllll(llllllllllllllllllllIlIIIlIlIllI)) {
                    llllllllllllllllllllIlIIIlIlIllI.interact(lIlIIIllII[lIlIIIllIl[63]]);
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
            "".length();
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

    private static String lIIIlIlIIlIIl(String llllllllllllllllllllIlIIIIllIIIl, String llllllllllllllllllllIlIIIIllIIII) {
        llllllllllllllllllllIlIIIIllIIIl = new String(Base64.getDecoder().decode(llllllllllllllllllllIlIIIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIlIIIIlIllll = new StringBuilder();
        char[] llllllllllllllllllllIlIIIIlIlllI = llllllllllllllllllllIlIIIIllIIII.toCharArray();
        int llllllllllllllllllllIlIIIIlIllIl = lIlIIIllIl[1];
        char[] llllllllllllllllllllIlIIIIlIIlll = llllllllllllllllllllIlIIIIllIIIl.toCharArray();
        int llllllllllllllllllllIlIIIIlIIllI = llllllllllllllllllllIlIIIIlIIlll.length;
        int llllllllllllllllllllIlIIIIlIIlIl = lIlIIIllIl[1];
        while (T.lIIIlIlIIllIl(llllllllllllllllllllIlIIIIlIIlIl, llllllllllllllllllllIlIIIIlIIllI)) {
            char llllllllllllllllllllIlIIIIllIIlI = llllllllllllllllllllIlIIIIlIIlll[llllllllllllllllllllIlIIIIlIIlIl];
            llllllllllllllllllllIlIIIIlIllll.append((char)(llllllllllllllllllllIlIIIIllIIlI ^ llllllllllllllllllllIlIIIIlIlllI[llllllllllllllllllllIlIIIIlIllIl % llllllllllllllllllllIlIIIIlIlllI.length]));
            "".length();
            ++llllllllllllllllllllIlIIIIlIllIl;
            ++llllllllllllllllllllIlIIIIlIIlIl;
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllllIlIIIIlIllll);
    }

    private static boolean lIIIlIlIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ac() {
        return lIlIIIllIl[1];
    }

    private static String lIIIlIlIIIlll(String llllllllllllllllllllIlIIIIllllll, String llllllllllllllllllllIlIIIlIIIIII) {
        try {
            SecretKeySpec llllllllllllllllllllIlIIIlIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIIIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIlIIIlIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIlIIIlIIIIll.init(lIlIIIllIl[4], llllllllllllllllllllIlIIIlIIIlII);
            return new String(llllllllllllllllllllIlIIIlIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllIlIIIlIIIIlI) {
            llllllllllllllllllllIlIIIlIIIIlI.printStackTrace();
            return null;
        }
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

    private static void lIIIlIlIIlIll() {
        lIlIIIllIl = new int[87];
        T.lIlIIIllIl[0] = 0xFFFFFBFC & 0x61B;
        T.lIlIIIllIl[1] = (0x3C ^ 0x27) & ~(0x74 ^ 0x6F);
        T.lIlIIIllIl[2] = " ".length();
        T.lIlIIIllIl[3] = 141 + 6 - 127 + 164 ^ 124 + 24 - 13 + 14;
        T.lIlIIIllIl[4] = "  ".length();
        T.lIlIIIllIl[5] = "   ".length();
        T.lIlIIIllIl[6] = -(0xFFFFEDD3 & 0x7A3F) & (0xFFFFFFFF & 0x7B9A);
        T.lIlIIIllIl[7] = 0x3E ^ 3 ^ (0xC ^ 0x35);
        T.lIlIIIllIl[8] = -(0xFFFFBD53 & 0x63FE) & (0xFFFFF7FF & 0x7BFF);
        T.lIlIIIllIl[9] = -(0xFFFFFD33 & 0x4AEF) & (0xFFFFFDF7 & 0x7B7B);
        T.lIlIIIllIl[10] = -(0xFFFFFD3F & 0x16DD) & (0xFFFFB7FF & 0x5FFF);
        T.lIlIIIllIl[11] = -(0xFFFF86F9 & 0x7DFF) & (0xFFFFBFFC & 0x6DFF);
        T.lIlIIIllIl[12] = 153 + 56 - 41 + 32;
        T.lIlIIIllIl[13] = 0x26 ^ 0x14;
        T.lIlIIIllIl[14] = 0x34 ^ 0x31;
        T.lIlIIIllIl[15] = 0xD4 ^ 0xC0;
        T.lIlIIIllIl[16] = 0x7F ^ 0x79;
        T.lIlIIIllIl[17] = -" ".length();
        T.lIlIIIllIl[18] = 0x8E ^ 0x89;
        T.lIlIIIllIl[19] = 0x68 ^ 0x60;
        T.lIlIIIllIl[20] = 94 + 153 - 146 + 58 ^ 147 + 98 - 121 + 26;
        T.lIlIIIllIl[21] = 0xB0 ^ 0xBD;
        T.lIlIIIllIl[22] = 128 + 111 - 122 + 52 ^ 83 + 47 - 112 + 145;
        T.lIlIIIllIl[23] = -(0xFFFFB473 & 0x6FAE) & (0xFFFFFFFF & 0x2FF5);
        T.lIlIIIllIl[24] = 0xFFFFEFBB & 0x1F46;
        T.lIlIIIllIl[25] = -(0xFFFFFCCE & 0x733F) & (0xFFFFFFFF & 0x7BDF);
        T.lIlIIIllIl[26] = 0xFFFF8FFB & 0x7EFF;
        T.lIlIIIllIl[27] = -(0xFFFFC4ED & 0x7F17) & (0xFFFFDFEF & 0x6FDF);
        T.lIlIIIllIl[28] = -(0xFFFFFC9F & 0x7367) & (0xFFFFFFFE & 0x7EFF);
        T.lIlIIIllIl[29] = 0xFFFFDBDF & 0x2FE7;
        T.lIlIIIllIl[30] = 0xFFFFEFFF & 0x1EF5;
        T.lIlIIIllIl[31] = 0xFFFFFFD2 & 0xBEF;
        T.lIlIIIllIl[32] = -(0xFFFFB527 & 0x6BDB) & (0xFFFFFFFB & 0x2FF7);
        T.lIlIIIllIl[33] = -(0xFFFFF67B & 0x3D85) & (0xFFFFBFFD & 0x7FBF);
        T.lIlIIIllIl[34] = 0xFFFF9EFE & 0x6FEF;
        T.lIlIIIllIl[35] = -(0xFFFFA549 & 0x7EFF) & (0xFFFFBFFF & 0x6FFF);
        T.lIlIIIllIl[36] = -(0xFFFFCFC5 & 0x703F) & (0xFFFFFEFF & 0x4FEE);
        T.lIlIIIllIl[37] = 0xFFFFAFFF & 0x5BAF;
        T.lIlIIIllIl[38] = 0xFFFFCEEB & 0x3FFF;
        T.lIlIIIllIl[39] = 0xFFFFCBF7 & 0x3FAF;
        T.lIlIIIllIl[40] = 0xFFFFABBB & 0x5FE4;
        T.lIlIIIllIl[41] = -(0xFFFFFAF1 & 0x156F) & (0xFFFF9FFA & 0x7BFF);
        T.lIlIIIllIl[42] = 11 + 17 - -56 + 69 ^ 3 + 71 - 21 + 93;
        T.lIlIIIllIl[43] = 0xFFFFDBB3 & 0x2FDF;
        T.lIlIIIllIl[44] = 0xFFFFFEEE & 0xFFD;
        T.lIlIIIllIl[45] = 0xE3 ^ 0xC5 ^ (0x59 ^ 0x73);
        T.lIlIIIllIl[46] = 0xFFFFAFFF & 0x5B8F;
        T.lIlIIIllIl[47] = 81 + 11 - -10 + 62 ^ 129 + 20 - 45 + 66;
        T.lIlIIIllIl[48] = 126 + 88 - 202 + 124 ^ 112 + 11 - 86 + 98;
        T.lIlIIIllIl[49] = 0x32 ^ 0x26 ^ (0x21 ^ 0x25);
        T.lIlIIIllIl[50] = 0xAB ^ 0xC2 ^ (0x57 ^ 0x2F);
        T.lIlIIIllIl[51] = 0xFFFFA219 & 0x5FFF;
        T.lIlIIIllIl[52] = 0x40 ^ 0x38 ^ (0xF6 ^ 0x9C);
        T.lIlIIIllIl[53] = 0x72 ^ 0x61;
        T.lIlIIIllIl[54] = " ".length() ^ (7 ^ 0x13);
        T.lIlIIIllIl[55] = 0xD2 ^ 0x94 ^ (0x2F ^ 0x7F);
        T.lIlIIIllIl[56] = 169 + 149 - 238 + 105 ^ 18 + 105 - 106 + 157;
        T.lIlIIIllIl[57] = 0x8E ^ 0x96;
        T.lIlIIIllIl[58] = 0x27 ^ 0x33 ^ (0x15 ^ 0x18);
        T.lIlIIIllIl[59] = 0x2D ^ 0x37;
        T.lIlIIIllIl[60] = 38 + 3 - 32 + 148 ^ 14 + 84 - 37 + 73;
        T.lIlIIIllIl[61] = 0x8C ^ 0x90;
        T.lIlIIIllIl[62] = 0x42 ^ 0x5F;
        T.lIlIIIllIl[63] = 138 + 47 - 167 + 142 ^ 143 + 79 - 71 + 39;
        T.lIlIIIllIl[64] = -(0xFFFFBD57 & 0x43AF) & (0xFFFFCBF7 & 0x3FFE);
        T.lIlIIIllIl[65] = 0xFFFFFEED & 0x2FDE;
        T.lIlIIIllIl[66] = -(0xFFFFB7FE & 0x5E55) & (0xFFFFFFFF & 0x77FB);
        T.lIlIIIllIl[67] = -(0xAB ^ 0x92) & (0xFFFFFFFF & 0x1F7F);
        T.lIlIIIllIl[68] = 0x4E ^ 0x66;
        T.lIlIIIllIl[69] = 0xFFFFD7A4 & 0x2BDF;
        T.lIlIIIllIl[70] = 0xFFFFFD7F & 0x42FCE;
        T.lIlIIIllIl[71] = 0x91 ^ 0xAD;
        T.lIlIIIllIl[72] = 0xFFFFB7EA & 0x49D7;
        T.lIlIIIllIl[73] = -(0xFFFFDABF & 0x2FD3) & (0xFFFFFAFE & 0xFFDB);
        T.lIlIIIllIl[74] = 0x40 ^ 0x5A ^ (0xB ^ 0x75);
        T.lIlIIIllIl[75] = 0xA0 ^ 0xBF;
        T.lIlIIIllIl[76] = 0x9A ^ 0x84 ^ (0x17 ^ 0x29);
        T.lIlIIIllIl[77] = -(0xFFFFBD5F & 0x62A9) & (0xFFFFEBDF & 0x3FFD);
        T.lIlIIIllIl[78] = 0xFFFFAFAF & 0x5F54;
        T.lIlIIIllIl[79] = -(0xA5 ^ 0xAB) & (0xFFFFCFBF & 0x3BFF);
        T.lIlIIIllIl[80] = -(0xFFFFE795 & 0x587F) & (0xFFFFCFFF & 0x7EFD);
        T.lIlIIIllIl[81] = 0xFFFF9FBE & 0x6BC7;
        T.lIlIIIllIl[82] = -(0xFFFFDF43 & 0x21BF) & (0xFFFFEFEF & 0x1FFF);
        T.lIlIIIllIl[83] = -(0xFFFFD57F & 0x3EDB) & (0xFFFF9FFF & 0x7FDE);
        T.lIlIIIllIl[84] = -(0xFFFFBF69 & 0x63B7) & (0xFFFFBFB7 & 0x6F7E);
        T.lIlIIIllIl[85] = -(0xFFFFC3C5 & 0x3E3B) & (0xFFFFEFE7 & 0x1FBB);
        T.lIlIIIllIl[86] = 0x50 ^ 0x40 ^ (0xBC ^ 0x8D);
    }

    private static void lIIIlIlIIlIlI() {
        lIlIIIllII = new String[lIlIIIllIl[86]];
        T.lIlIIIllII[T.lIlIIIllIl[1]] = T.lIIIlIlIIIlll("MtFbFjfGs3b6TiCVih/Pgg==", "TQRCu");
        T.lIlIIIllII[T.lIlIIIllIl[2]] = T.lIIIlIlIIlIII("lBVmF8qZ76FNSmHBfnefJ/RIhyhov6LmGl5MFxaecFmBaI4rzX/h09wfYj6J+JD5", "QGRis");
        T.lIlIIIllII[T.lIlIIIllIl[4]] = T.lIIIlIlIIlIIl("OBQdLAkXAQIrCVYBBGUMFxsA", "vukEn");
        T.lIlIIIllII[T.lIlIIIllIl[5]] = T.lIIIlIlIIlIII("MNBczfCtzY3Zjm+MHu/89RkNpGjLKul9", "MJIGB");
        T.lIlIIIllII[T.lIlIIIllIl[7]] = T.lIIIlIlIIlIII("HXpgNqgT1SHQKWvGty179ASwohhZpm1dliLUf7a8bzONUVhm4jKoYT/hHCLQXT7sXFTy43PSEwI=", "ZYgEq");
        T.lIlIIIllII[T.lIlIIIllIl[14]] = T.lIIIlIlIIlIII("dOupv+kRo1s=", "stOJJ");
        T.lIlIIIllII[T.lIlIIIllIl[16]] = T.lIIIlIlIIlIII("bvqqV5Sst+a7W5k97MzwRQ==", "lHvzx");
        T.lIlIIIllII[T.lIlIIIllIl[18]] = T.lIIIlIlIIlIII("Gqp7KIsigTI=", "yJzOS");
        T.lIlIIIllII[T.lIlIIIllIl[19]] = T.lIIIlIlIIlIII("tMolQDjEQBOYsBuxuybnzQ==", "SVGoT");
        T.lIlIIIllII[T.lIlIIIllIl[20]] = T.lIIIlIlIIlIIl("FxMpOm94DC0vJigXOjdjLBdoLyYuHSRjd2lYHyovPB06LSYrC2Y=", "XxHCC");
        T.lIlIIIllII[T.lIlIIIllIl[22]] = T.lIIIlIlIIlIIl("JjY9ZgEHdyoqAQkl", "hWKFu");
        T.lIlIIIllII[T.lIlIIIllIl[42]] = T.lIIIlIlIIIlll("qRQPMVha95sN0Bi8W4pIxw==", "QWHZf");
        T.lIlIIIllII[T.lIlIIIllIl[45]] = T.lIIIlIlIIIlll("lZhZFXkYAgc183QO6SBB7g==", "ErcSu");
        T.lIlIIIllII[T.lIlIIIllIl[21]] = T.lIIIlIlIIIlll("TW5HxuXIIftbycZRT3wTLg==", "QUmJH");
        T.lIlIIIllII[T.lIlIIIllIl[47]] = T.lIIIlIlIIlIIl("BzULAQ==", "HEnoB");
        T.lIlIIIllII[T.lIlIIIllIl[48]] = T.lIIIlIlIIIlll("H7IAHJ3uWxo=", "BPxCH");
        T.lIlIIIllII[T.lIlIIIllIl[49]] = T.lIIIlIlIIlIII("7aB9kNn/uAw=", "LfQbC");
        T.lIlIIIllII[T.lIlIIIllIl[50]] = T.lIIIlIlIIlIIl("Mg8SACpRBh8bOAM=", "qgsoY");
        T.lIlIIIllII[T.lIlIIIllIl[52]] = T.lIIIlIlIIlIIl("Fhc6YyE3Vi0vITkE", "XvLCU");
        T.lIlIIIllII[T.lIlIIIllIl[53]] = T.lIIIlIlIIlIIl("Fi85LQcqLzBiESwvMjE=", "CAWBs");
        T.lIlIIIllII[T.lIlIIIllIl[15]] = T.lIIIlIlIIlIIl("FQ0BEyZwIg0XOyNBAQQhOQU=", "PaevT");
        T.lIlIIIllII[T.lIlIIIllIl[54]] = T.lIIIlIlIIlIII("gUsQMeMsB6RolTDPP30jWQ==", "PbHSa");
        T.lIlIIIllII[T.lIlIIIllIl[55]] = T.lIIIlIlIIIlll("JgJEQXJTI6Y=", "Jiujd");
        T.lIlIIIllII[T.lIlIIIllIl[56]] = T.lIIIlIlIIlIIl("LgkkOw==", "ayAUb");
        T.lIlIIIllII[T.lIlIIIllIl[57]] = T.lIIIlIlIIlIII("8OwtxLthgFY=", "XBHIj");
        T.lIlIIIllII[T.lIlIIIllIl[58]] = T.lIIIlIlIIIlll("EMJFu0JiBcUQH+ImDViMJA==", "SveIG");
        T.lIlIIIllII[T.lIlIIIllIl[59]] = T.lIIIlIlIIlIIl("NAAhGhgfHydSTA==", "qxBry");
        T.lIlIIIllII[T.lIlIIIllIl[60]] = T.lIIIlIlIIlIII("unQ+6idPCbhY8ytPm0IDkg==", "LvPaa");
        T.lIlIIIllII[T.lIlIIIllIl[61]] = T.lIIIlIlIIlIIl("JRQADDASCAcI", "vaioY");
        T.lIlIIIllII[T.lIlIIIllIl[62]] = T.lIIIlIlIIlIIl("Gx8FAlAjEEsdESEZGQYb", "Lvkgp");
        T.lIlIIIllII[T.lIlIIIllIl[63]] = T.lIIIlIlIIIlll("OBt+JNnV5QA=", "UKxCt");
        T.lIlIIIllII[T.lIlIIIllIl[75]] = T.lIIIlIlIIlIIl("OwcpLQ0ZVTwmCQIbIToP", "kuHTh");
        T.lIlIIIllII[T.lIlIIIllIl[76]] = T.lIIIlIlIIIlll("523MbuQzbtw7IR0m+Xzku4wXuerry3Y5", "uDGEl");
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
        d llllllllllllllllllllIlIIIlIIllll;
        Object llllllllllllllllllllIlIIIlIlIIII;
        int[] nArray = new int[lIlIIIllIl[2]];
        nArray[T.lIlIIIllIl[1]] = lIlIIIllIl[9];
        if (T.lIIIlIlIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlIIIllIl[9], lIlIIIllIl[14], j.bZ);
            bp.add(d2);
            "".length();
        }
        int[] nArray2 = new int[lIlIIIllIl[2]];
        nArray2[T.lIlIIIllIl[1]] = lIlIIIllIl[0];
        if (T.lIIIlIlIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllllIlIIIlIlIIII = new d(lIlIIIllIl[0], T.dh(), lIlIIIllIl[64]);
            bp.add((d)llllllllllllllllllllIlIIIlIlIIII);
            "".length();
        }
        int[] nArray3 = new int[lIlIIIllIl[2]];
        nArray3[T.lIlIIIllIl[1]] = lIlIIIllIl[8];
        if (T.lIIIlIlIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllllIlIIIlIlIIII = new d(lIlIIIllIl[8], lIlIIIllIl[4], lIlIIIllIl[6]);
            bp.add((d)llllllllllllllllllllIlIIIlIlIIII);
            "".length();
        }
        if (T.lIIIlIlIIlllI(Bank.contains((Predicate)(llllllllllllllllllllIlIIIlIlIIII = item -> item.getName().toLowerCase().contains(lIlIIIllII[lIlIIIllIl[76]]))) ? 1 : 0)) {
            llllllllllllllllllllIlIIIlIIllll = new d(lIlIIIllIl[65], lIlIIIllIl[14], lIlIIIllIl[66]);
            bp.add(llllllllllllllllllllIlIIIlIIllll);
            "".length();
        }
        int[] nArray4 = new int[lIlIIIllIl[2]];
        nArray4[T.lIlIIIllIl[1]] = lIlIIIllIl[67];
        if (T.lIIIlIlIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllllIlIIIlIIllll = new d(lIlIIIllIl[67], lIlIIIllIl[68], lIlIIIllIl[69]);
            bp.add(llllllllllllllllllllIlIIIlIIllll);
            "".length();
        }
    }

    @Override
    public boolean af() {
        boolean bl;
        if (T.lIIIlIlIlIlII(Skills.getLevel((Skill)Skill.PRAYER), lIlIIIllIl[3])) {
            bl = lIlIIIllIl[2];
            "".length();
            if (-(0x63 ^ 0x48 ^ (0x1F ^ 0x30)) > 0) {
                return ((0x24 ^ 0x40 ^ (0x95 ^ 0xB3)) & (0x5C ^ 0x14 ^ (0xA4 ^ 0xAE) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlIIIllIl[1];
        }
        return bl;
    }

    public T() {
        this.kz = lIlIIIllIl[0];
    }
}

