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

public class K
implements F {
    public static /* synthetic */ boolean bz;
    public static final /* synthetic */ WorldPoint iH;
    private static /* synthetic */ String[] lllIIIlI;
    public static final /* synthetic */ WorldPoint iK;
    public static /* synthetic */ List<d> bB;
    private final /* synthetic */ int iO = 536;
    public static final /* synthetic */ WorldPoint iJ;
    static final /* synthetic */ WorldPoint iL;
    public static final /* synthetic */ WorldPoint iI;
    private static /* synthetic */ int[] lllIIIll;
    static final /* synthetic */ WorldPoint iN;
    static final /* synthetic */ WorldPoint iM;

    private static void lIllllIIIlI() {
        lllIIIlI = new String[lllIIIll[86]];
        K.lllIIIlI[K.lllIIIll[1]] = K."Buying items";
        K.lllIIIlI[K.lllIIIll[2]] = K."Finished buying items, switching back to prayer";
        K.lllIIIlI[K.lllIIIll[4]] = K."Navigating to bank";
        K.lllIIIlI[K.lllIIIll[5]] = K."Handling banking";
        K.lllIIIlI[K.lllIIIll[7]] = K."We are missing prayer supplies, switching to BUYING";
        K.lllIIIlI[K.lllIIIll[14]] = K."Drink";
        K.lllIIIlI[K.lllIIIll[16]] = K."Tele to wildy";
        K.lllIIIlI[K.lllIIIll[18]] = K."Rub";
        K.lllIIIlI[K.lllIIIll[19]] = K."Lava Maze";
        K.lllIIIlI[K.lllIIIll[20]] = K."Okay, teleport to level 41 Wilderness.";
        K.lllIIIlI[K.lllIIIll[22]] = K."Nav to altar";
        K.lllIIIlI[K.lllIIIll[42]] = K."1 tick pray";
        K.lllIIIlI[K.lllIIIll[45]] = K."Chaos altar";
        K.lllIIIlI[K.lllIIIll[21]] = K."Large door";
        K.lllIIIlI[K.lllIIIll[47]] = K."Open";
        K.lllIIIlI[K.lllIIIll[48]] = K."Open";
        K.lllIIIlI[K.lllIIIll[49]] = K."Open";
        K.lllIIIlI[K.lllIIIll[50]] = K."Chaos altar";
        K.lllIIIlI[K.lllIIIll[52]] = K."Nav to altar";
        K.lllIIIlI[K.lllIIIll[53]] = K."Unnoting bones";
        K.lllIIIlI[K.lllIIIll[15]] = K."Elder Chaos druid";
        K.lllIIIlI[K.lllIIIll[54]] = K."Large door";
        K.lllIIIlI[K.lllIIIll[55]] = K."Open";
        K.lllIIIlI[K.lllIIIll[56]] = K."Open";
        K.lllIIIlI[K.lllIIIll[57]] = K."Open";
        K.lllIIIlI[K.lllIIIll[58]] = K."Exchange";
        K.lllIIIlI[K.lllIIIll[59]] = K."Exchange 5";
        K.lllIIIlI[K.lllIIIll[60]] = K."Exchange All";
        K.lllIIIlI[K.lllIIIll[61]] = K."Suiciding";
        K.lllIIIlI[K.lllIIIll[62]] = K."Wine of zamorak";
        K.lllIIIlI[K.lllIIIll[63]] = K."Take";
        K.lllIIIlI[K.lllIIIll[75]] = K."Prayer training";
        K.lllIIIlI[K.lllIIIll[76]] = K."ring of wealth (";
    }

    private static String lIllllIIIII(String lIlIIIIllIlIlII, String lIlIIIIllIlIIll) {
        try {
            SecretKeySpec lIlIIIIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), lllIIIll[19]), "DES");
            Cipher lIlIIIIllIllIII = Cipher.getInstance("DES");
            lIlIIIIllIllIII.init(lllIIIll[4], lIlIIIIllIllIIl);
            return new String(lIlIIIIllIllIII.doFinal(Base64.getDecoder().decode(lIlIIIIllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIllIlIlll) {
            lIlIIIIllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void ag() {
        d lIlIIIIllllllII;
        Object lIlIIIIllllllIl;
        int[] nArray = new int[lllIIIll[2]];
        nArray[K.lllIIIll[1]] = lllIIIll[9];
        if (K.lIllllIIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIIIll[9], lllIIIll[14], i.bw);
            bB.add(d2);
            0;
        }
        int[] nArray2 = new int[lllIIIll[2]];
        nArray2[K.lllIIIll[1]] = lllIIIll[0];
        if (K.lIllllIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlIIIIllllllIl = new d(lllIIIll[0], K.cA(), lllIIIll[64]);
            bB.add((d)lIlIIIIllllllIl);
            0;
        }
        int[] nArray3 = new int[lllIIIll[2]];
        nArray3[K.lllIIIll[1]] = lllIIIll[8];
        if (K.lIllllIIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlIIIIllllllIl = new d(lllIIIll[8], lllIIIll[4], lllIIIll[6]);
            bB.add((d)lIlIIIIllllllIl);
            0;
        }
        if (K.lIllllIIllI(Bank.contains((Predicate)(lIlIIIIllllllIl = item -> item.getName().toLowerCase().contains(lllIIIlI[lllIIIll[76]]))) ? 1 : 0)) {
            lIlIIIIllllllII = new d(lllIIIll[65], lllIIIll[14], lllIIIll[66]);
            bB.add(lIlIIIIllllllII);
            0;
        }
        int[] nArray4 = new int[lllIIIll[2]];
        nArray4[K.lllIIIll[1]] = lllIIIll[67];
        if (K.lIllllIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlIIIIllllllII = new d(lllIIIll[67], lllIIIll[68], lllIIIll[69]);
            bB.add(lIlIIIIllllllII);
            0;
        }
    }

    private static boolean lIllllIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        K.lIllllIIIll();
        K.lIllllIIIlI();
        iH = new WorldPoint(lllIIIll[77], lllIIIll[78], lllIIIll[1]);
        iI = new WorldPoint(lllIIIll[79], lllIIIll[80], lllIIIll[1]);
        iJ = new WorldPoint(lllIIIll[81], lllIIIll[82], lllIIIll[1]);
        iK = new WorldPoint(lllIIIll[83], lllIIIll[44], lllIIIll[1]);
        iL = new WorldPoint(lllIIIll[1], lllIIIll[1], lllIIIll[1]);
        iM = new WorldPoint(lllIIIll[1], lllIIIll[1], lllIIIll[1]);
        iN = new WorldPoint(lllIIIll[84], lllIIIll[85], lllIIIll[1]);
        bB = new ArrayList<d>();
    }

    private static String lIlllIlllll(String lIlIIIIllIIIlll, String lIlIIIIllIIlIII) {
        try {
            SecretKeySpec lIlIIIIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIIllIIlIll = Cipher.getInstance("Blowfish");
            lIlIIIIllIIlIll.init(lllIIIll[4], lIlIIIIllIIllII);
            return new String(lIlIIIIllIIlIll.doFinal(Base64.getDecoder().decode(lIlIIIIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIllIIlIlI) {
            lIlIIIIllIIlIlI.printStackTrace();
            return null;
        }
    }

    private static String lIllllIIIIl(String lIlIIIIlllIIllI, String lIlIIIIlllIlIlI) {
        lIlIIIIlllIIllI = new String(Base64.getDecoder().decode(lIlIIIIlllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIIIlllIlIIl = new StringBuilder();
        char[] lIlIIIIlllIlIII = lIlIIIIlllIlIlI.toCharArray();
        int lIlIIIIlllIIlll = lllIIIll[1];
        char[] lIlIIIIlllIIIIl = lIlIIIIlllIIllI.toCharArray();
        int lIlIIIIlllIIIII = lIlIIIIlllIIIIl.length;
        int lIlIIIIllIlllll = lllIIIll[1];
        while (K.lIllllIIlIl(lIlIIIIllIlllll, lIlIIIIlllIIIII)) {
            char lIlIIIIlllIllII = lIlIIIIlllIIIIl[lIlIIIIllIlllll];
            lIlIIIIlllIlIIl.append((char)(lIlIIIIlllIllII ^ lIlIIIIlllIlIII[lIlIIIIlllIIlll % lIlIIIIlllIlIII.length]));
            0;
            ++lIlIIIIlllIIlll;
            ++lIlIIIIllIlllll;
            0;
            if (2 < (144 + 18 - 77 + 109 ^ 97 + 100 - 134 + 135)) continue;
            return null;
        }
        return String.valueOf(lIlIIIIlllIlIIl);
    }

    private static boolean lIllllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllllIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllllIIlII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (K.lIllllIllII(Skills.getLevel((Skill)Skill.PRAYER), lllIIIll[3])) {
            bl = lllIIIll[2];
            0;
            if (((0x29 ^ 0x13) & ~(0x23 ^ 0x19)) != 0) {
                return ((2 ^ 0x3F) & ~(0x3E ^ 3)) != 0;
            }
        } else {
            bl = lllIIIll[1];
        }
        return bl;
    }

    @Override
    public int U() {
        try {
            K.cz();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 > 3) {
            return (174 + 76 - 94 + 49 ^ 40 + 37 - -1 + 77) & (26 + 13 - -129 + 71 ^ 107 + 132 - 213 + 159 ^ -1);
        }
        return lllIIIll[74];
    }

    private static int cA() {
        int n2 = lllIIIll[70];
        if (K.lIllllIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lllIIIll[71]) && K.lIllllIllII(Skills.getLevel((Skill)Skill.PRAYER), lllIIIll[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / lllIIIll[72] + lllIIIll[22];
        }
        int n3 = lllIIIll[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / lllIIIll[72] + lllIIIll[63];
    }

    private static boolean lIllllIlIII(int n2) {
        return n2 > 0;
    }

    public static void cz() {
        block44: {
            TileItem lIlIIIlIIIIIIll;
            block45: {
                if (K.lIllllIIlII(bz ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIIIlI[lllIIIll[1]];
                    b.a(bB);
                    if (K.lIllllIIlIl(bB.size(), lllIIIll[2])) {
                        System.out.println(lllIIIlI[lllIIIll[2]]);
                        bz = lllIIIll[1];
                    }
                }
                if (!K.lIllllIIllI(bz ? 1 : 0) || !K.lIllllIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lllIIIll[3])) break block44;
                if (K.lIllllIIllI(K.ac() ? 1 : 0) && K.lIllllIIlIl(Game.getWildyLevel(), lllIIIll[2])) {
                    lIlIIIlIIIIIIll = BankLocation.getNearest();
                    if (K.lIllllIIlll(lIlIIIlIIIIIIll) && K.lIllllIIllI(lIlIIIlIIIIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lllIIIlI[lllIIIll[4]];
                        a.a((BankLocation)lIlIIIlIIIIIIll);
                    }
                    if (K.lIllllIIlll(lIlIIIlIIIIIIll) && K.lIllllIIlII(lIlIIIlIIIIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = lllIIIlI[lllIIIll[5]];
                        if (K.lIllllIIllI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIll[6]);
                            0;
                        }
                        if (K.lIllllIIlII(Bank.isOpen() ? 1 : 0)) {
                            if (K.lIllllIlIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIIIll[7]);
                                0;
                            }
                            if (K.lIllllIlIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lllIIIll[4]);
                                0;
                            }
                            int[] nArray = new int[lllIIIll[5]];
                            nArray[K.lllIIIll[1]] = lllIIIll[8];
                            nArray[K.lllIIIll[2]] = lllIIIll[0];
                            nArray[K.lllIIIll[4]] = lllIIIll[9];
                            if (K.lIllllIIllI(e.b(nArray) ? 1 : 0)) {
                                K.ag();
                                System.out.println(lllIIIlI[lllIIIll[7]]);
                                bz = lllIIIll[2];
                                return;
                            }
                            int[] nArray2 = new int[lllIIIll[5]];
                            nArray2[K.lllIIIll[1]] = lllIIIll[8];
                            nArray2[K.lllIIIll[2]] = lllIIIll[0];
                            nArray2[K.lllIIIll[4]] = lllIIIll[9];
                            if (K.lIllllIIlII(e.b(nArray2) ? 1 : 0)) {
                                if (K.lIllllIIllI(Equipment.contains((int[])f.bg) ? 1 : 0)) {
                                    a.b(f.bg, lllIIIll[2]);
                                }
                                a.b(f.bb, lllIIIll[2]);
                                a.a(lllIIIll[10], lllIIIll[11]);
                                a.b(lllIIIll[0], lllIIIll[12]);
                            }
                        }
                    }
                }
                if (K.lIllllIIlII(K.ac() ? 1 : 0)) {
                    if (K.lIllllIIlII(Inventory.contains((int[])f.bb) ? 1 : 0) && K.lIllllIIlIl(Movement.getRunEnergy(), lllIIIll[13])) {
                        Inventory.getFirst((int[])f.bb).interact(lllIIIlI[lllIIIll[14]]);
                        Time.sleepTicks((int)lllIIIll[2]);
                        0;
                    }
                    if (K.lIllllIIllI(Movement.isRunEnabled() ? 1 : 0) && K.lIllllIlIIl(Movement.getRunEnergy(), lllIIIll[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)lllIIIll[14]);
                        0;
                    }
                    if (K.lIllllIIlIl(Game.getWildyLevel(), lllIIIll[2])) {
                        AccBuilderBarrows.c = lllIIIlI[lllIIIll[16]];
                        if (K.lIllllIIlII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (K.lIllllIIllI(Dialog.isOpen() ? 1 : 0) && K.lIllllIIlII(Inventory.contains((int[])f.bg) ? 1 : 0) && K.lIllllIlIlI(Players.getLocal().getAnimation(), lllIIIll[17])) {
                            Inventory.getFirst((int[])f.bg).interact(lllIIIlI[lllIIIll[18]]);
                            Time.sleepTicks((int)lllIIIll[4]);
                            0;
                        }
                        String[] stringArray = new String[lllIIIll[4]];
                        stringArray[K.lllIIIll[1]] = lllIIIlI[lllIIIll[19]];
                        stringArray[K.lllIIIll[2]] = lllIIIlI[lllIIIll[20]];
                        g.a(stringArray);
                    }
                    if (K.lIllllIlIII(Game.getWildyLevel())) {
                        TileObject lIlIIIlIIIIIIlI;
                        int[] nArray = new int[lllIIIll[2]];
                        nArray[K.lllIIIll[1]] = lllIIIll[0];
                        if (K.lIllllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (K.lIllllIlIIl(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                                AccBuilderBarrows.c = lllIIIlI[lllIIIll[22]];
                                TileItem tileItem = new WorldPoint[lllIIIll[21]];
                                tileItem[K.lllIIIll[1]] = new WorldPoint(lllIIIll[23], lllIIIll[24], lllIIIll[1]);
                                tileItem[K.lllIIIll[2]] = new WorldPoint(lllIIIll[25], lllIIIll[26], lllIIIll[1]);
                                tileItem[K.lllIIIll[4]] = new WorldPoint(lllIIIll[27], lllIIIll[28], lllIIIll[1]);
                                tileItem[K.lllIIIll[5]] = new WorldPoint(lllIIIll[29], lllIIIll[30], lllIIIll[1]);
                                tileItem[K.lllIIIll[7]] = new WorldPoint(lllIIIll[31], lllIIIll[32], lllIIIll[1]);
                                tileItem[K.lllIIIll[14]] = new WorldPoint(lllIIIll[33], lllIIIll[34], lllIIIll[1]);
                                tileItem[K.lllIIIll[16]] = new WorldPoint(lllIIIll[35], lllIIIll[36], lllIIIll[1]);
                                tileItem[K.lllIIIll[18]] = new WorldPoint(lllIIIll[37], lllIIIll[38], lllIIIll[1]);
                                tileItem[K.lllIIIll[19]] = new WorldPoint(lllIIIll[39], lllIIIll[38], lllIIIll[1]);
                                tileItem[K.lllIIIll[20]] = new WorldPoint(lllIIIll[40], lllIIIll[38], lllIIIll[1]);
                                tileItem[K.lllIIIll[22]] = new WorldPoint(lllIIIll[41], lllIIIll[38], lllIIIll[1]);
                                tileItem[K.lllIIIll[42]] = new WorldPoint(lllIIIll[43], lllIIIll[44], lllIIIll[1]);
                                tileItem[K.lllIIIll[45]] = new WorldPoint(lllIIIll[46], lllIIIll[44], lllIIIll[1]);
                                lIlIIIlIIIIIIll = tileItem;
                                Walker.walkAlong(Arrays.asList(lIlIIIlIIIIIIll), new HashMap());
                                0;
                                Time.sleepTicks((int)lllIIIll[2]);
                                0;
                            }
                            if (K.lIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                                AccBuilderBarrows.c = lllIIIlI[lllIIIll[42]];
                                String[] stringArray = new String[lllIIIll[2]];
                                stringArray[K.lllIIIll[1]] = lllIIIlI[lllIIIll[45]];
                                lIlIIIlIIIIIIll = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[lllIIIll[2]];
                                stringArray2[K.lllIIIll[1]] = lllIIIlI[lllIIIll[21]];
                                lIlIIIlIIIIIIlI = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[lllIIIll[2]];
                                stringArray3[K.lllIIIll[1]] = lllIIIlI[lllIIIll[47]];
                                if (K.lIllllIIlII(lIlIIIlIIIIIIlI.hasAction(stringArray3) ? 1 : 0)) {
                                    lIlIIIlIIIIIIlI.interact(lllIIIlI[lllIIIll[48]]);
                                }
                                if (K.lIllllIIlll(lIlIIIlIIIIIIll)) {
                                    String[] stringArray4 = new String[lllIIIll[2]];
                                    stringArray4[K.lllIIIll[1]] = lllIIIlI[lllIIIll[49]];
                                    if (K.lIllllIIllI(lIlIIIlIIIIIIlI.hasAction(stringArray4) ? 1 : 0)) {
                                        int lIlIIIlIIIIIIIl = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[lllIIIll[2]];
                                        nArray3[K.lllIIIll[1]] = lllIIIll[0];
                                        String[] stringArray5 = new String[lllIIIll[2]];
                                        stringArray5[K.lllIIIll[1]] = lllIIIlI[lllIIIll[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)lllIIIll[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[lllIIIll[2]];
                        nArray4[K.lllIIIll[1]] = lllIIIll[0];
                        if (K.lIllllIIllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lllIIIll[2]];
                            nArray5[K.lllIIIll[1]] = lllIIIll[51];
                            if (K.lIllllIIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (K.lIllllIlIIl(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                                    AccBuilderBarrows.c = lllIIIlI[lllIIIll[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[lllIIIll[21]];
                                    worldPointArray[K.lllIIIll[1]] = new WorldPoint(lllIIIll[23], lllIIIll[24], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[2]] = new WorldPoint(lllIIIll[25], lllIIIll[26], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[4]] = new WorldPoint(lllIIIll[27], lllIIIll[28], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[5]] = new WorldPoint(lllIIIll[29], lllIIIll[30], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[7]] = new WorldPoint(lllIIIll[31], lllIIIll[32], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[14]] = new WorldPoint(lllIIIll[33], lllIIIll[34], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[16]] = new WorldPoint(lllIIIll[35], lllIIIll[36], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[18]] = new WorldPoint(lllIIIll[37], lllIIIll[38], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[19]] = new WorldPoint(lllIIIll[39], lllIIIll[38], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[20]] = new WorldPoint(lllIIIll[40], lllIIIll[38], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[22]] = new WorldPoint(lllIIIll[41], lllIIIll[38], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[42]] = new WorldPoint(lllIIIll[43], lllIIIll[44], lllIIIll[1]);
                                    worldPointArray[K.lllIIIll[45]] = new WorldPoint(lllIIIll[46], lllIIIll[44], lllIIIll[1]);
                                    lIlIIIlIIIIIIll = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(lIlIIIlIIIIIIll), new HashMap());
                                    0;
                                    Time.sleepTicks((int)lllIIIll[2]);
                                    0;
                                }
                                if (K.lIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                                    AccBuilderBarrows.c = lllIIIlI[lllIIIll[53]];
                                    if (!K.lIllllIIllI(Dialog.canLevelUpContinue() ? 1 : 0) || K.lIllllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[lllIIIll[2]];
                                    stringArray[K.lllIIIll[1]] = lllIIIlI[lllIIIll[15]];
                                    lIlIIIlIIIIIIll = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[lllIIIll[2]];
                                    stringArray6[K.lllIIIll[1]] = lllIIIlI[lllIIIll[54]];
                                    lIlIIIlIIIIIIlI = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[lllIIIll[2]];
                                    stringArray7[K.lllIIIll[1]] = lllIIIlI[lllIIIll[55]];
                                    if (K.lIllllIIlII(lIlIIIlIIIIIIlI.hasAction(stringArray7) ? 1 : 0)) {
                                        lIlIIIlIIIIIIlI.interact(lllIIIlI[lllIIIll[56]]);
                                    }
                                    if (K.lIllllIIlll(lIlIIIlIIIIIIll)) {
                                        String[] stringArray8 = new String[lllIIIll[2]];
                                        stringArray8[K.lllIIIll[1]] = lllIIIlI[lllIIIll[57]];
                                        if (K.lIllllIIllI(lIlIIIlIIIIIIlI.hasAction(stringArray8) ? 1 : 0)) {
                                            List lIlIIIlIIIIIIIl;
                                            if (K.lIllllIIllI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[lllIIIll[2]];
                                                nArray6[K.lllIIIll[1]] = lllIIIll[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)lIlIIIlIIIIIIll);
                                                Time.sleepTicks((int)lllIIIll[4]);
                                                0;
                                            }
                                            if (K.lIllllIIlII(Dialog.isOpen() ? 1 : 0) && K.lIllllIIllI((lIlIIIlIIIIIIIl = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int lIlIIIlIIIIIIII = lllIIIll[1];
                                                while (K.lIllllIIlIl(lIlIIIlIIIIIIII, lIlIIIlIIIIIIIl.size())) {
                                                    int[] nArray7 = new int[lllIIIll[2]];
                                                    nArray7[K.lllIIIll[1]] = lllIIIll[51];
                                                    if (K.lIllllIlIlI(((Item)Inventory.getAll((int[])nArray7).get(lllIIIll[1])).getQuantity(), lllIIIll[2]) && K.lIllllIIlII(((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getText().contains(lllIIIlI[lllIIIll[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getX(), (int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getY(), (boolean)lllIIIll[2]);
                                                        Time.sleepTicks((int)lllIIIll[4]);
                                                        0;
                                                    }
                                                    int[] nArray8 = new int[lllIIIll[2]];
                                                    nArray8[K.lllIIIll[1]] = lllIIIll[51];
                                                    if (K.lIllllIlIlI(((Item)Inventory.getAll((int[])nArray8).get(lllIIIll[1])).getQuantity(), lllIIIll[14]) && K.lIllllIIlII(((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getText().contains(lllIIIlI[lllIIIll[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getX(), (int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getY(), (boolean)lllIIIll[2]);
                                                        Time.sleepTicks((int)lllIIIll[4]);
                                                        0;
                                                    }
                                                    if (K.lIllllIIlII(((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getText().contains(lllIIIlI[lllIIIll[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getX(), (int)((Widget)lIlIIIlIIIIIIIl.get(lIlIIIlIIIIIIII)).getClickPoint().getY(), (boolean)lllIIIll[2]);
                                                        Time.sleepTicks((int)lllIIIll[4]);
                                                        0;
                                                    }
                                                    ++lIlIIIlIIIIIIII;
                                                    0;
                                                    if (-(0x45 ^ 0x41) < 0) continue;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    e.s();
                                }
                            }
                        }
                    }
                }
                int[] nArray = new int[lllIIIll[2]];
                nArray[K.lllIIIll[1]] = lllIIIll[10];
                if (!K.lIllllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[lllIIIll[2]];
                nArray9[K.lllIIIll[1]] = lllIIIll[0];
                if (!K.lIllllIIllI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[lllIIIll[2]];
                nArray10[K.lllIIIll[1]] = lllIIIll[51];
                if (!K.lIllllIIllI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (K.lIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                AccBuilderBarrows.c = lllIIIlI[lllIIIll[61]];
                String[] stringArray = new String[lllIIIll[2]];
                stringArray[K.lllIIIll[1]] = lllIIIlI[lllIIIll[62]];
                lIlIIIlIIIIIIll = TileItems.getNearest((String[])stringArray);
                if (K.lIllllIIlll(lIlIIIlIIIIIIll)) {
                    lIlIIIlIIIIIIll.interact(lllIIIlI[lllIIIll[63]]);
                }
            }
        }
    }

    @Override
    public boolean T() {
        return lllIIIll[1];
    }

    private static void lIllllIIIll() {
        lllIIIll = new int[87];
        K.lllIIIll[0] = -(0xFFFFBDFF & 0x7348) & (0xFFFFFFFF & 0x335F);
        K.lllIIIll[1] = (0x17 ^ 0x4F ^ (0xE6 ^ 0xB0)) & (0x1A ^ 0x20 ^ (0xF2 ^ 0xC6) ^ -1);
        K.lllIIIll[2] = 1;
        K.lllIIIll[3] = 0xA7 ^ 0x8A;
        K.lllIIIll[4] = 2;
        K.lllIIIll[5] = 3;
        K.lllIIIll[6] = 0xFFFFB3CC & 0x5FBB;
        K.lllIIIll[7] = 82 + 36 - 45 + 68 ^ 69 + 76 - 132 + 124;
        K.lllIIIll[8] = 0xFFFFD3AE & 0x7EFF;
        K.lllIIIll[9] = 0xFFFFFB51 & 0x35FF;
        K.lllIIIll[10] = -(0xFFFFC67D & 0x7D8F) & (0xFFFFD7EF & 0x6FFF);
        K.lllIIIll[11] = -(0xFFFFE3CA & 0x1EFF) & (0xFFFFBBCF & 0x6FFD);
        K.lllIIIll[12] = (0x3A ^ 0x7E) + (3 ^ 0x2A) - (0x32 ^ 0xA) + (22 + 128 - 110 + 107);
        K.lllIIIll[13] = 43 + 163 - 171 + 135 ^ 41 + 37 - 27 + 101;
        K.lllIIIll[14] = 0x67 ^ 0x62;
        K.lllIIIll[15] = 0x81 ^ 0x95;
        K.lllIIIll[16] = 0x90 ^ 0x96;
        K.lllIIIll[17] = -1;
        K.lllIIIll[18] = 0x52 ^ 0x1A ^ (0xE0 ^ 0xAF);
        K.lllIIIll[19] = 0xAD ^ 0xA5;
        K.lllIIIll[20] = 1 ^ (0xAA ^ 0xA2);
        K.lllIIIll[21] = 7 ^ 0x29 ^ (9 ^ 0x2A);
        K.lllIIIll[22] = 0xAC ^ 0xA6;
        K.lllIIIll[23] = 0xFFFF9FF5 & 0x6BDE;
        K.lllIIIll[24] = 0xFFFF9F23 & 0x6FDE;
        K.lllIIIll[25] = 0xFFFFCFFE & 0x3BD3;
        K.lllIIIll[26] = 0xFFFF9FFB & 0x6EFF;
        K.lllIIIll[27] = -(0xFFFFFAD5 & 0x753F) & (0xFFFFFBDF & Short.MAX_VALUE);
        K.lllIIIll[28] = 0xFFFFBEF9 & 0x4FFE;
        K.lllIIIll[29] = -(0xFFFFFD1F & 0x16E9) & (0xFFFFFFFF & 0x1FCF);
        K.lllIIIll[30] = 0xFFFF9FF5 & 0x6EFF;
        K.lllIIIll[31] = -(0xFFFFFF35 & 0x50FB) & (0xFFFFFBF3 & 0x5FFE);
        K.lllIIIll[32] = -(0xFFFFADE7 & 0x721D) & (0xFFFFBFF7 & 0x6EFD);
        K.lllIIIll[33] = 0xFFFF8BFF & 0x7FBD;
        K.lllIIIll[34] = -(0xFFFFB8DB & 0x5736) & (0xFFFF9FFF & 0x7EFF);
        K.lllIIIll[35] = 0xFFFF9BB7 & 0x6FFF;
        K.lllIIIll[36] = -(0xFFFFFBB5 & 0x755F) & (0xFFFFFFFF & 0x7FFE);
        K.lllIIIll[37] = 0xFFFFAFBF & 0x5BEF;
        K.lllIIIll[38] = 0xFFFFAEFB & 0x5FEF;
        K.lllIIIll[39] = -(0xFFFFFCD7 & 0x7779) & (0xFFFFFFFF & 0x7FF7);
        K.lllIIIll[40] = -(0xFFFFFFBF & 0x605B) & (0xFFFFEBFB & 0x7FBE);
        K.lllIIIll[41] = -(0xFFFFB64A & 0x7DF7) & (0xFFFFFFDB & 0x3FFF);
        K.lllIIIll[42] = 0x64 ^ 0x6F;
        K.lllIIIll[43] = -(0xFFFFDCF7 & 0x7369) & (0xFFFFDBF3 & Short.MAX_VALUE);
        K.lllIIIll[44] = 0xFFFFAFEC & 0x5EFF;
        K.lllIIIll[45] = 0x84 ^ 0x88;
        K.lllIIIll[46] = 0xFFFF9BBF & 0x6FCF;
        K.lllIIIll[47] = 0x32 ^ 0x3C;
        K.lllIIIll[48] = 0x3E ^ 0x31;
        K.lllIIIll[49] = 0x91 ^ 0x81;
        K.lllIIIll[50] = 0x35 ^ 0x24;
        K.lllIIIll[51] = 0xFFFFD6B9 & 0x2B5F;
        K.lllIIIll[52] = 0xA0 ^ 0xB2;
        K.lllIIIll[53] = 0xAB ^ 0x92 ^ (0xE8 ^ 0xC2);
        K.lllIIIll[54] = 6 ^ 0x13;
        K.lllIIIll[55] = 118 + 101 - 95 + 10 ^ 87 + 24 - 80 + 113;
        K.lllIIIll[56] = 0x1F ^ 8;
        K.lllIIIll[57] = 0x2F ^ 0x37;
        K.lllIIIll[58] = 0xA6 ^ 0xBF;
        K.lllIIIll[59] = 77 + 143 - 82 + 6 ^ 48 + 75 - 51 + 66;
        K.lllIIIll[60] = 0x1D ^ 0x7E ^ (0xC6 ^ 0xBE);
        K.lllIIIll[61] = 0x1D ^ 0x43 ^ (0xED ^ 0xAF);
        K.lllIIIll[62] = 0x74 ^ 0x69;
        K.lllIIIll[63] = 0x35 ^ 0x56 ^ (0x70 ^ 0xD);
        K.lllIIIll[64] = 0xFFFFCFFA & 0x3AF5;
        K.lllIIIll[65] = -(0xFFFFD56C & 0x6AB7) & (0xFFFFFFFF & 0x6EEF);
        K.lllIIIll[66] = 0xFFFFE3FC & 0x7DAB;
        K.lllIIIll[67] = -(0x8A ^ 0xBB) & (0xFFFFBF77 & 0x5FFF);
        K.lllIIIll[68] = 0x2D ^ 0x1D ^ (0x4F ^ 0x57);
        K.lllIIIll[69] = -(0xFFFFEFDF & 0x787B) & (0xFFFFEFDE & 0x7BFF);
        K.lllIIIll[70] = -(0xFFFFFC95 & 0x136B) & (0xFFFFFDCF & 0x43F7E);
        K.lllIIIll[71] = 0x13 ^ 0x2F;
        K.lllIIIll[72] = -(0xFFFFE83D & 0x3FDF) & (0xFFFFE9FF & 0x3FDE);
        K.lllIIIll[73] = 0xFFFFF67E & 0xF9C9;
        K.lllIIIll[74] = 0x63 ^ 0x7A ^ (0x23 ^ 0x5E);
        K.lllIIIll[75] = 0x28 ^ 0x37;
        K.lllIIIll[76] = 0x26 ^ 6;
        K.lllIIIll[77] = -(0xFFFFD77B & 0x78AF) & (0xFFFFFBFF & 0x5FFF);
        K.lllIIIll[78] = -(0xFFFFCDF7 & 0x72FA) & (0xFFFFDFFF & 0x6FF5);
        K.lllIIIll[79] = 0xFFFF8BB3 & 0x7FFE;
        K.lllIIIll[80] = -(0xFFFFB1D5 & 0x5E3F) & (0xFFFFBEFD & 0x5FFF);
        K.lllIIIll[81] = -(0x6F ^ 0x15) & (0xFFFFFBFF & 0xFFF);
        K.lllIIIll[82] = 0xFFFFAEFF & 0x5FED;
        K.lllIIIll[83] = 0xFFFFEBA4 & 0x1FDF;
        K.lllIIIll[84] = 0xFFFFDC56 & 0x2FBF;
        K.lllIIIll[85] = 0xFFFFFFAB & 0xDF7;
        K.lllIIIll[86] = 0x2A ^ 0x53 ^ (0x53 ^ 0xB);
    }

    private static boolean lIllllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    public K() {
        this.iO = lllIIIll[0];
    }

    @Override
    public String V() {
        return lllIIIlI[lllIIIll[75]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lllIIIll[2]];
                nArray[K.lllIIIll[1]] = lllIIIll[10];
                if (!K.lIllllIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lllIIIll[2]];
                nArray2[K.lllIIIll[1]] = lllIIIll[10];
                if (!K.lIllllIllII(Inventory.getFirst((int[])nArray2).getQuantity(), lllIIIll[13])) break block2;
                if (!K.lIllllIIllI(Inventory.contains((int[])f.bg) ? 1 : 0)) break block3;
                if (!K.lIllllIIlII(Equipment.contains((int[])f.bg) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lllIIIll[2]];
                nArray3[K.lllIIIll[1]] = lllIIIll[0];
                if (!K.lIllllIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lllIIIll[2]];
                nArray4[K.lllIIIll[1]] = lllIIIll[51];
                if (!K.lIllllIIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = lllIIIll[2];
            0;
            if (((70 + 46 - 63 + 135 ^ 94 + 21 - 90 + 122) & (125 + 118 - 174 + 102 ^ 130 + 97 - 166 + 71 ^ -1)) < (0xDC ^ 0xA4 ^ (0x77 ^ 0xB))) return n2 != 0;
            return ((121 + 28 - 90 + 128 ^ 107 + 136 - 150 + 84) & (0x71 ^ 0xB ^ (0x2F ^ 0x5F) ^ -1)) != 0;
        }
        n2 = lllIIIll[1];
        return n2 != 0;
    }

    private static boolean lIllllIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllllIIlll(Object object) {
        return object != null;
    }

    private static boolean lIllllIIllI(int n2) {
        return n2 == 0;
    }
}

