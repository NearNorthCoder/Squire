/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
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
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.CHelper;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
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
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
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
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class HHelper
implements S {
    static  int hw;
    public static  WorldPoint dv;
    public static  boolean bs;
    static final  int hp;
    static  boolean cl;
    public static  WorldPoint hq;
    static  String[] bQ;

    public static  WorldPoint hs;
    public static  WorldPoint hr;
    static  int hu;
    public static  List<d> bu;
    public static  WorldPoint ht;
    static  WorldArea hy;
    static  WorldPoint[] hx;
    static  int ck;
    static  int hv;

    private static boolean llIlllIIIllll(Object object) {
        return object != null;
    }

    @Override
    public boolean S() {
        return lIIIIIIllIl[1];
    }

    private static boolean llIlllIIIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllIIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String U() {
        return lIIIIIIlIlI[lIIIIIIllIl[64]];
    }

    private static boolean llIlllIIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIIIlllI(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var1);
    }

    private static int llIlllIIIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        int[] nArray = new int[lIIIIIIllIl[0]];
        nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[13];
        if (H.llIlllIIlIIII(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIIIIIIllIl[0]];
            nArray2[H.lIIIIIIllIl[1]] = lIIIIIIllIl[14];
            if (H.llIlllIIlIIII(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIIIIIIllIl[0]];
                nArray3[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                if (H.llIlllIIlIlIl(Inventory.getCount((int[])nArray3), lIIIIIIllIl[6])) {
                    int[] nArray4 = new int[lIIIIIIllIl[0]];
                    nArray4[H.lIIIIIIllIl[1]] = lIIIIIIllIl[11];
                    if (H.llIlllIIlIIII(Inventory.getCount((int[])nArray4))) {
                        int[] nArray5 = new int[lIIIIIIllIl[0]];
                        nArray5[H.lIIIIIIllIl[1]] = lIIIIIIllIl[12];
                        if (H.llIlllIIlIIII(Inventory.getCount((int[])nArray5))) {
                            int[] nArray6 = new int[lIIIIIIllIl[0]];
                            nArray6[H.lIIIIIIllIl[1]] = lIIIIIIllIl[16];
                            if (H.llIlllIIlIIII(Inventory.getCount((int[])nArray6)) && H.llIlllIIlIIII(Inventory.getCount((int[])f.aU))) {
                                n2 = lIIIIIIllIl[0];

                                if (((180 + 35 - 27 + 16 ^ 161 + 63 - 60 + 34) & (0x62 ^ 0x17 ^ 71 + 26 - 39 + 69 ^ -1)) == 0) return n2 != 0;
                                return ((0x58 ^ 0x7E ^ (5 ^ 3)) & (73 + 87 - 69 + 60 ^ 99 + 71 - 160 + 173 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIIIIllIl[1];
        return n2 != 0;
    }

    static {
        H.llIlllIIIlIIl();
        H.llIlllIIIlIII();
        hp = lIIIIIIllIl[4];
        bu = new ArrayList<d>();
        dv = new WorldPoint(lIIIIIIllIl[66], lIIIIIIllIl[67], lIIIIIIllIl[1]);
        hq = new WorldPoint(lIIIIIIllIl[68], lIIIIIIllIl[69], lIIIIIIllIl[1]);
        hr = new WorldPoint(lIIIIIIllIl[70], lIIIIIIllIl[71], lIIIIIIllIl[1]);
        hs = new WorldPoint(lIIIIIIllIl[72], lIIIIIIllIl[73], lIIIIIIllIl[1]);
        ht = new WorldPoint(lIIIIIIllIl[74], lIIIIIIllIl[75], lIIIIIIllIl[6]);
        hu = lIIIIIIllIl[76];
        hv = lIIIIIIllIl[77];
        hw = lIIIIIIllIl[41];
        String[] stringArray = new String[lIIIIIIllIl[23]];
        stringArray[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[78]];
        stringArray[H.lIIIIIIllIl[0]] = lIIIIIIlIlI[lIIIIIIllIl[79]];
        stringArray[H.lIIIIIIllIl[6]] = lIIIIIIlIlI[lIIIIIIllIl[80]];
        stringArray[H.lIIIIIIllIl[9]] = lIIIIIIlIlI[lIIIIIIllIl[20]];
        stringArray[H.lIIIIIIllIl[7]] = lIIIIIIlIlI[lIIIIIIllIl[81]];
        stringArray[H.lIIIIIIllIl[15]] = lIIIIIIlIlI[lIIIIIIllIl[82]];
        stringArray[H.lIIIIIIllIl[17]] = lIIIIIIlIlI[lIIIIIIllIl[83]];
        stringArray[H.lIIIIIIllIl[10]] = lIIIIIIlIlI[lIIIIIIllIl[84]];
        stringArray[H.lIIIIIIllIl[21]] = lIIIIIIlIlI[lIIIIIIllIl[85]];
        stringArray[H.lIIIIIIllIl[22]] = lIIIIIIlIlI[lIIIIIIllIl[86]];
        stringArray[H.lIIIIIIllIl[19]] = lIIIIIIlIlI[lIIIIIIllIl[87]];
        bQ = stringArray;
        WorldPoint[] worldPointArray = new WorldPoint[lIIIIIIllIl[26]];
        worldPointArray[H.lIIIIIIllIl[1]] = new WorldPoint(lIIIIIIllIl[88], lIIIIIIllIl[89], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[0]] = new WorldPoint(lIIIIIIllIl[90], lIIIIIIllIl[91], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[6]] = new WorldPoint(lIIIIIIllIl[92], lIIIIIIllIl[93], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[9]] = new WorldPoint(lIIIIIIllIl[94], lIIIIIIllIl[95], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[7]] = new WorldPoint(lIIIIIIllIl[96], lIIIIIIllIl[97], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[15]] = new WorldPoint(lIIIIIIllIl[98], lIIIIIIllIl[99], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[17]] = new WorldPoint(lIIIIIIllIl[100], lIIIIIIllIl[101], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[10]] = new WorldPoint(lIIIIIIllIl[102], lIIIIIIllIl[103], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[21]] = new WorldPoint(lIIIIIIllIl[104], lIIIIIIllIl[105], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[22]] = new WorldPoint(lIIIIIIllIl[106], lIIIIIIllIl[107], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[19]] = new WorldPoint(lIIIIIIllIl[106], lIIIIIIllIl[108], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[23]] = new WorldPoint(lIIIIIIllIl[104], lIIIIIIllIl[109], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[24]] = new WorldPoint(lIIIIIIllIl[104], lIIIIIIllIl[110], lIIIIIIllIl[1]);
        worldPointArray[H.lIIIIIIllIl[25]] = new WorldPoint(lIIIIIIllIl[111], lIIIIIIllIl[112], lIIIIIIllIl[1]);
        hx = worldPointArray;
        hy = new WorldArea(lIIIIIIllIl[113], lIIIIIIllIl[114], lIIIIIIllIl[115], lIIIIIIllIl[116], lIIIIIIllIl[1]);
    }

    private static boolean llIlllIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlllIIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIlllIIIlIII() {
        lIIIIIIlIlI = new String[lIIIIIIllIl[117]];
        H.lIIIIIIlIlI[H.lIIIIIIllIl[1]] = "Finished buying items, switching back to quest";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[0]] = "Nav to bank";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[6]] = "Handling banking";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[9]] = "We are missing quest supplies, switching to BUYING";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[7]] = "We are missing quest supplies, switching to BUYING";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[15]] = "Drink";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[17]] = "Eat";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[10]] = "Nav to start";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[21]] = "Starting quest";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[22]] = "Squire";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[19]] = "Nav to library guy";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[23]] = "Talk to library guy";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[24]] = "Reldo";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[25]] = "Nav to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[26]] = "Talk to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[27]] = "Thurgo";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[28]] = "Nav to ore tile";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[29]] = "Mine rock";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[30]] = "Mine";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[31]] = "Nav to start";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[32]] = "Talk squire";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[33]] = "Squire";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[34]] = "Blurite ore";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[35]] = "Portrait";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[36]] = "Nav to picture";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[37]] = "Grabbing picture";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[40]] = "Sir Vyvin";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[42]] = "Open";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[43]] = "Open";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[45]] = "Search";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[46]] = "Search";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[2]] = "Blurite ore";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[47]] = "Portrait";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[48]] = "Nav to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[49]] = "Talk to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[50]] = "Thurgo";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[51]] = "Blurite ore";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[52]] = "Portrait";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[53]] = "Nav to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[54]] = "Talk to DWARF";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[55]] = "Thurgo";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[56]] = "Blurite sword";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[57]] = "Nav to start";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[58]] = "Talk squire";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[59]] = "Squire";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[64]] = "A Knights Sword";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[65]] = "ring of wealth (";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[78]] = "And how is life as a squire?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[79]] = "I can make a new sword if you like...";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[80]] = "So would these dwarves make another one?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[20]] = "Ok, I'll give it a go.";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[81]] = "What do you know about the Imcando dwarves?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[82]] = "Something else.";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[83]] = "Would you like a redberry pie?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[84]] = "Can you make a special sword for me?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[85]] = "About that sword...";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[86]] = "Can you make that replacement sword now?";
        H.lIIIIIIlIlI[H.lIIIIIIllIl[87]] = "Yes.";
    }

    private static boolean llIlllIIlIIII(int n2) {
        return n2 > 0;
    }

    private static void ae() {
        d var2;
        Object var3;
        block11: {
            block10: {
                int[] nArray = new int[lIIIIIIllIl[0]];
                nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[18];
                if (H.llIlllIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIIIIIIllIl[18], lIIIIIIllIl[15], i.bp);
                    bu.add(d2);

                }
                int[] nArray2 = new int[lIIIIIIllIl[0]];
                nArray2[H.lIIIIIIllIl[1]] = lIIIIIIllIl[13];
                if (H.llIlllIIIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var3 = new DHelper(lIIIIIIllIl[13], lIIIIIIllIl[0], i.bp);
                    bu.add((DHelper) ar3);

                }
                int[] nArray3 = new int[lIIIIIIllIl[0]];
                nArray3[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                if (!H.llIlllIIIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) break block10;
                int[] nArray4 = new int[lIIIIIIllIl[0]];
                nArray4[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                if (!H.llIlllIIIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block11;
                int[] nArray5 = new int[lIIIIIIllIl[0]];
                nArray5[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                if (!H.llIlllIIIllII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIIIllIl[6])) break block11;
            }
            var3 = new DHelper(lIIIIIIllIl[8], lIIIIIIllIl[6], i.bp);
            bu.add((DHelper) ar3);

        }
        int[] nArray = new int[lIIIIIIllIl[0]];
        nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[14];
        if (H.llIlllIIIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var3 = new DHelper(lIIIIIIllIl[14], lIIIIIIllIl[0], i.bp);
            bu.add((DHelper) ar3);

        }
        int[] nArray6 = new int[lIIIIIIllIl[0]];
        nArray6[H.lIIIIIIllIl[1]] = lIIIIIIllIl[16];
        if (H.llIlllIIIllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var3 = new DHelper(lIIIIIIllIl[16], lIIIIIIllIl[27], lIIIIIIllIl[60]);
            bu.add((DHelper) ar3);

        }
        int[] nArray7 = new int[lIIIIIIllIl[0]];
        nArray7[H.lIIIIIIllIl[1]] = lIIIIIIllIl[12];
        if (H.llIlllIIIllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var3 = new DHelper(lIIIIIIllIl[12], lIIIIIIllIl[19], lIIIIIIllIl[61]);
            bu.add((DHelper) ar3);

        }
        if (H.llIlllIIIllIl(Bank.contains((Predicate)(var3 = item -> item.getName().toLowerCase().contains(lIIIIIIlIlI[lIIIIIIllIl[65]]))) ? 1 : 0)) {
            var2 = new DHelper(lIIIIIIllIl[62], lIIIIIIllIl[15], lIIIIIIllIl[63]);
            bu.add(var2);

        }
        int[] nArray8 = new int[lIIIIIIllIl[0]];
        nArray8[H.lIIIIIIllIl[1]] = lIIIIIIllIl[11];
        if (H.llIlllIIIllIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var2 = new DHelper(lIIIIIIllIl[11], lIIIIIIllIl[55], lIIIIIIllIl[61]);
            bu.add(var2);

        }
    }

    private static boolean llIlllIIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlllIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int T() {
        try {
            H.cS();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return lIIIIIIllIl[3];
    }

    private static boolean llIlllIIlIIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[10])) {
            bl = lIIIIIIllIl[0];

            if ((72 + 9 - -19 + 63 ^ 58 + 121 - 76 + 63) == 0) {
                return ((0xAE ^ 0xC6 ^ (0xF7 ^ 0xA2)) & ((0x8B ^ 0x80) & ~(0x50 ^ 0x5B) ^ (0xA ^ 0x37) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIIllIl[1];
        }
        return bl;
    }

    public static void cS() {
        if (H.llIlllIIIlIll(bs ? 1 : 0)) {
            b.a(bu);
            if (H.llIlllIIIllII(bu.size(), lIIIIIIllIl[0])) {
                System.out.println(lIIIIIIlIlI[lIIIIIIllIl[1]]);
                bs = lIIIIIIllIl[1];
            }
        }
        if (H.llIlllIIIllIl(bs ? 1 : 0)) {
            BankLocation var4;
            if (H.llIlllIIIllII(e.j(lIIIIIIllIl[2]), lIIIIIIllIl[3])) {
                C.cb();
            }
            if (H.llIlllIIIllIl(H.aa() ? 1 : 0) && H.llIlllIIIlllI(e.j(lIIIIIIllIl[2]), lIIIIIIllIl[3]) && H.llIlllIIIllII(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[0])) {
                var4 = BankLocation.getNearest();
                if (H.llIlllIIIllll(var4) && H.llIlllIIIllIl(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[0]];
                    a.a(var4);
                }
                if (H.llIlllIIIllll(var4) && H.llIlllIIIlIll(var4.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (H.llIlllIIIllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIllIl[5]);

                    }
                    if (H.llIlllIIIlIll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[6]];
                        if (H.llIlllIIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIIIIllIl[7]);

                        }
                        if (H.llIlllIIlIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIIIIllIl[6]);

                        }
                        int[] nArray = new int[lIIIIIIllIl[0]];
                        nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                        if (H.llIlllIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIIIIIllIl[0]];
                            nArray2[H.lIIIIIIllIl[1]] = lIIIIIIllIl[8];
                            if (H.llIlllIIIllII(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIIIllIl[6])) {
                                H.ae();
                                System.out.println(lIIIIIIlIlI[lIIIIIIllIl[9]]);
                                bs = lIIIIIIllIl[0];
                                return;
                            }
                        }
                        int[] nArray3 = new int[lIIIIIIllIl[10]];
                        nArray3[H.lIIIIIIllIl[1]] = lIIIIIIllIl[11];
                        nArray3[H.lIIIIIIllIl[0]] = lIIIIIIllIl[12];
                        nArray3[H.lIIIIIIllIl[6]] = lIIIIIIllIl[13];
                        nArray3[H.lIIIIIIllIl[9]] = lIIIIIIllIl[14];
                        nArray3[H.lIIIIIIllIl[7]] = lIIIIIIllIl[8];
                        nArray3[H.lIIIIIIllIl[15]] = lIIIIIIllIl[16];
                        nArray3[H.lIIIIIIllIl[17]] = lIIIIIIllIl[18];
                        if (H.llIlllIIIllIl(e.b(nArray3) ? 1 : 0)) {
                            H.ae();
                            System.out.println(lIIIIIIlIlI[lIIIIIIllIl[7]]);
                            bs = lIIIIIIllIl[0];
                            return;
                        }
                        int[] nArray4 = new int[lIIIIIIllIl[10]];
                        nArray4[H.lIIIIIIllIl[1]] = lIIIIIIllIl[11];
                        nArray4[H.lIIIIIIllIl[0]] = lIIIIIIllIl[12];
                        nArray4[H.lIIIIIIllIl[6]] = lIIIIIIllIl[13];
                        nArray4[H.lIIIIIIllIl[9]] = lIIIIIIllIl[14];
                        nArray4[H.lIIIIIIllIl[7]] = lIIIIIIllIl[8];
                        nArray4[H.lIIIIIIllIl[15]] = lIIIIIIllIl[16];
                        nArray4[H.lIIIIIIllIl[17]] = lIIIIIIllIl[18];
                        if (H.llIlllIIIlIll(e.b(nArray4) ? 1 : 0)) {
                            a.a(lIIIIIIllIl[11], lIIIIIIllIl[19]);
                            a.a(lIIIIIIllIl[12], lIIIIIIllIl[19]);
                            a.a(lIIIIIIllIl[13], lIIIIIIllIl[0]);
                            a.a(lIIIIIIllIl[14], lIIIIIIllIl[0]);
                            a.a(lIIIIIIllIl[8], lIIIIIIllIl[6]);
                            a.a(lIIIIIIllIl[18], lIIIIIIllIl[7]);
                            a.a(lIIIIIIllIl[16], lIIIIIIllIl[19]);
                        }
                    }
                }
            }
            if (H.llIlllIIIlIll(Inventory.contains((int[])f.aU) ? 1 : 0) && H.llIlllIIIllII(Movement.getRunEnergy(), lIIIIIIllIl[20])) {
                Inventory.getFirst((int[])f.aU).interact(lIIIIIIlIlI[lIIIIIIllIl[15]]);
                Time.sleepTicks((int)lIIIIIIllIl[0]);

            }
            if (H.llIlllIIlIIIl(H.llIlllIIIlIlI(e.u(), 50.0))) {
                int[] nArray = new int[lIIIIIIllIl[0]];
                nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[16];
                if (H.llIlllIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray5 = new int[lIIIIIIllIl[0]];
                    nArray5[H.lIIIIIIllIl[1]] = lIIIIIIllIl[16];
                    Inventory.getFirst((int[])nArray5).interact(lIIIIIIlIlI[lIIIIIIllIl[17]]);
                    Time.sleepTicks((int)lIIIIIIllIl[6]);

                }
            }
            if (H.llIlllIIIlIll(H.aa() ? 1 : 0) && H.llIlllIIIllIl(e.j(lIIIIIIllIl[4]))) {
                if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[10]];
                    if (H.llIlllIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)dv);

                    Time.sleepTicks((int)lIIIIIIllIl[0]);

                }
                if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[21]];
                    g.a(lIIIIIIlIlI[lIIIIIIllIl[22]], bQ);
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[0])) {
                ck = lIIIIIIllIl[1];
                if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hq), lIIIIIIllIl[15])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[19]];
                    Movement.walkTo((WorldPoint)hq);

                    Time.sleepTicks((int)lIIIIIIllIl[0]);

                }
                if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hq), lIIIIIIllIl[15])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[23]];
                    g.a(lIIIIIIlIlI[lIIIIIIllIl[24]], bQ);
                }
            }
            if (!H.llIlllIIlIlII(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[6]) || H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[9])) {
                if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[25]];
                    if (H.llIlllIIIllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIllIl[15])) {
                        if (H.llIlllIIIlIll(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Walker.walkAlong(Arrays.asList(hx), new HashMap());

                            Time.sleepTicks((int)lIIIIIIllIl[0]);

                        }
                        if (H.llIlllIIIllIl(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)hr);

                            Time.sleepTicks((int)lIIIIIIllIl[0]);

                        }
                    }
                    if (H.llIlllIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIllIl[15])) {
                        Movement.walkTo((WorldPoint)hr);

                        Time.sleepTicks((int)lIIIIIIllIl[0]);

                    }
                }
                if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[26]];
                    g.a(lIIIIIIlIlI[lIIIIIIllIl[27]], bQ);
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[7])) {
                int[] nArray = new int[lIIIIIIllIl[0]];
                nArray[H.lIIIIIIllIl[1]] = hv;
                if (H.llIlllIIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[28]];
                        Movement.walkTo((WorldPoint)hs);

                        Time.sleepTicks((int)lIIIIIIllIl[0]);

                    }
                    if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hs), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[29]];
                        int[] nArray6 = new int[lIIIIIIllIl[0]];
                        nArray6[H.lIIIIIIllIl[1]] = hu;
                        if (H.llIlllIIIllll(TileObjects.getNearest((int[])nArray6))) {
                            int[] nArray7 = new int[lIIIIIIllIl[0]];
                            nArray7[H.lIIIIIIllIl[1]] = hu;
                            TileObjects.getNearest((int[])nArray7).interact(lIIIIIIlIlI[lIIIIIIllIl[30]]);
                            Time.sleepTicks((int)lIIIIIIllIl[6]);

                        }
                    }
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[7])) {
                int[] nArray = new int[lIIIIIIllIl[0]];
                nArray[H.lIIIIIIllIl[1]] = hv;
                if (H.llIlllIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[31]];
                        Movement.walkTo((WorldPoint)dv);

                        Time.sleepTicks((int)lIIIIIIllIl[0]);

                    }
                    if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[32]];
                        g.a(lIIIIIIlIlI[lIIIIIIllIl[33]], bQ);
                    }
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[15])) {
                String[] stringArray = new String[lIIIIIIllIl[0]];
                stringArray[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[34]];
                if (H.llIlllIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIIIllIl[0]];
                    stringArray2[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[35]];
                    if (H.llIlllIIIllIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                        if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(ht), lIIIIIIllIl[9])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[36]];
                            Movement.walkTo((WorldPoint)ht);

                            Time.sleepTicks((int)lIIIIIIllIl[0]);

                        }
                        if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(ht), lIIIIIIllIl[9])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[37]];
                            var4 = new WorldArea(lIIIIIIllIl[38], lIIIIIIllIl[39], lIIIIIIllIl[21], lIIIIIIllIl[7], lIIIIIIllIl[6]);
                            String[] stringArray3 = new String[lIIIIIIllIl[0]];
                            stringArray3[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[40]];
                            NPC var5 = NPCs.getNearest((String[])stringArray3);
                            if (H.llIlllIIIllll(var5) && H.llIlllIIIlIll(var4.contains(var5.getWorldLocation()) ? 1 : 0)) {
                                e.B();
                            }
                            int[] nArray = new int[lIIIIIIllIl[0]];
                            nArray[H.lIIIIIIllIl[1]] = lIIIIIIllIl[41];
                            TileObject var6 = TileObjects.getNearest((int[])nArray);
                            if (H.llIlllIIIllll(var6)) {
                                String[] stringArray4 = new String[lIIIIIIllIl[0]];
                                stringArray4[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[42]];
                                if (H.llIlllIIIlIll(var6.hasAction(stringArray4) ? 1 : 0)) {
                                    var6.interact(lIIIIIIlIlI[lIIIIIIllIl[43]]);
                                    Time.sleepTicks((int)lIIIIIIllIl[6]);

                                }
                            }
                            int[] nArray8 = new int[lIIIIIIllIl[0]];
                            nArray8[H.lIIIIIIllIl[1]] = lIIIIIIllIl[44];
                            TileObject var7 = TileObjects.getNearest((int[])nArray8);
                            if (H.llIlllIIIllll(var7)) {
                                String[] stringArray5 = new String[lIIIIIIllIl[0]];
                                stringArray5[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[45]];
                                if (H.llIlllIIIlIll(var7.hasAction(stringArray5) ? 1 : 0)) {
                                    var7.interact(lIIIIIIlIlI[lIIIIIIllIl[46]]);
                                    Time.sleepTicks((int)lIIIIIIllIl[6]);

                                    if (H.llIlllIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.continueSpace();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[15])) {
                String[] stringArray = new String[lIIIIIIllIl[0]];
                stringArray[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[2]];
                if (H.llIlllIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray6 = new String[lIIIIIIllIl[0]];
                    stringArray6[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[47]];
                    if (H.llIlllIIIlIll(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[48]];
                            if (H.llIlllIIIllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIllIl[15])) {
                                if (H.llIlllIIIlIll(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Walker.walkAlong(Arrays.asList(hx), new HashMap());

                                    Time.sleepTicks((int)lIIIIIIllIl[0]);

                                }
                                if (H.llIlllIIIllIl(hy.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)hr);

                                    Time.sleepTicks((int)lIIIIIIllIl[0]);

                                }
                            }
                            if (H.llIlllIIlIlIl(Skills.getLevel((Skill)Skill.AGILITY), lIIIIIIllIl[15])) {
                                Movement.walkTo((WorldPoint)hr);

                                Time.sleepTicks((int)lIIIIIIllIl[0]);

                            }
                        }
                        if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[49]];
                            g.a(lIIIIIIlIlI[lIIIIIIllIl[50]], bQ);
                        }
                    }
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[17])) {
                String[] stringArray = new String[lIIIIIIllIl[0]];
                stringArray[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[51]];
                if (H.llIlllIIlIIII(Inventory.getCount((String[])stringArray))) {
                    String[] stringArray7 = new String[lIIIIIIllIl[0]];
                    stringArray7[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[52]];
                    if (H.llIlllIIIllII(Inventory.getCount((String[])stringArray7), lIIIIIIllIl[0])) {
                        if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[53]];
                            Movement.walkTo((WorldPoint)hr);

                            Time.sleepTicks((int)lIIIIIIllIl[0]);

                        }
                        if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(hr), lIIIIIIllIl[17])) {
                            AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[54]];
                            g.a(lIIIIIIlIlI[lIIIIIIllIl[55]], bQ);
                        }
                    }
                }
            }
            if (H.llIlllIIIlllI(e.j(lIIIIIIllIl[4]), lIIIIIIllIl[17])) {
                String[] stringArray = new String[lIIIIIIllIl[0]];
                stringArray[H.lIIIIIIllIl[1]] = lIIIIIIlIlI[lIIIIIIllIl[56]];
                if (H.llIlllIIlIIII(Inventory.getCount((String[])stringArray))) {
                    if (H.llIlllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[57]];
                        Movement.walkTo((WorldPoint)dv);

                        Time.sleepTicks((int)lIIIIIIllIl[0]);

                    }
                    if (H.llIlllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(dv), lIIIIIIllIl[17])) {
                        AccBuilderTempleTrek.c = lIIIIIIlIlI[lIIIIIIllIl[58]];
                        if (H.llIlllIIIllII(ck, lIIIIIIllIl[0])) {
                            ac.mT += lIIIIIIllIl[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lIIIIIIllIl[0];
                            ac.mT = lIIIIIIllIl[1];
                            cl = lIIIIIIllIl[1];
                        }
                        g.a(lIIIIIIlIlI[lIIIIIIllIl[59]], bQ);
                    }
                }
            }
            g.a(new String[lIIIIIIllIl[1]]);
        }
    }
}

