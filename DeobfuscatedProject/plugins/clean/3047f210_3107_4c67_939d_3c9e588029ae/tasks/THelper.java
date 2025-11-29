/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class THelper
implements S {
    
    public static  boolean bs;
    public static  int iS;
    static  WorldArea iX;
    public static  List<d> bu;
    public static  int iT;
    public static  int iU;
    
    private static  WorldPoint iY;
    static  WorldArea iW;
    static  WorldArea iV;

    @Override
    public boolean V() {
        boolean bl;
        if (T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[2])) {
            bl = llllIlIlIl[1];

            if ((0x36 ^ 0x19 ^ (0x7A ^ 0x50)) <= 0) {
                return ((0xA0 ^ 0xBE ^ (0x13 ^ 0x5A)) & (34 + 123 - 122 + 200 ^ 61 + 33 - -10 + 84 ^ -1)) != 0;
            }
        } else {
            bl = llllIlIlIl[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static void dt() {
        WorldArea worldArea = new WorldArea(llllIlIlIl[46], llllIlIlIl[47], llllIlIlIl[12], llllIlIlIl[20], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[46], llllIlIlIl[48], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[0]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[46], llllIlIlIl[50], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[1]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[51], llllIlIlIl[52], llllIlIlIl[53], llllIlIlIl[54], llllIlIlIl[3]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[55], llllIlIlIl[56], llllIlIlIl[24], llllIlIlIl[12], llllIlIlIl[3]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[57], llllIlIlIl[58], llllIlIlIl[49], llllIlIlIl[12], llllIlIlIl[0]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[59], llllIlIlIl[60], llllIlIlIl[12], llllIlIlIl[20], llllIlIlIl[0]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[46], llllIlIlIl[47], llllIlIlIl[61], llllIlIlIl[20], llllIlIlIl[0]);
        if (T.llIIlllllllII(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[12]];
            e.a(iY);
            Time.sleepTicks((int)llllIlIlIl[1]);

        }
        if ((!T.llIIlllllllII(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !T.llIIlllllllII(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || T.llIIllllllIlI(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && T.llIlIIIIIIIIl(Players.getLocal().getAnimation(), llllIlIlIl[62]) && T.llIIlllllllII(Players.getLocal().isMoving() ? 1 : 0)) {
            void var1;
            void var2;
            void var3;
            void var4;
            void var5;
            void var6;
            void var7;
            if (T.llIIllllllIlI(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[49]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[63]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[64]]);
                Time.sleepTicks((int)llllIlIlIl[3]);

            }
            if (T.llIIllllllIlI(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[53]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[38]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[65]]);
                Time.sleepTicks((int)llllIlIlIl[3]);

            }
            if (T.llIIllllllIlI(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[66]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[54]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[67]]);
                Time.sleepTicks((int)llllIlIlIl[3]);

            }
            if (T.llIIllllllIlI(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[40]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[68]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[61]]);
                Time.sleepTicks((int)llllIlIlIl[2]);

            }
            if (T.llIIllllllIlI(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[69]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[70]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[41]]);
                Time.sleepTicks((int)llllIlIlIl[17]);

            }
            if (T.llIIllllllIlI(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[71]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[72]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[73]]);
                Time.sleepTicks((int)llllIlIlIl[10]);

            }
            if (T.llIIllllllIlI(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[74]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[42]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[75]]);
                Time.sleepTicks((int)llllIlIlIl[17]);

            }
        }
    }

    private static boolean llIIlllllllIl(Object object) {
        return object != null;
    }

    private static boolean llIIllllllIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public String U() {
        return llllIlIIll[llllIlIlIl[203]];
    }

    @Override
    public boolean S() {
        return llllIlIlIl[0];
    }

    /*
     * WARNING - void declaration
     */
    private static boolean dx() {
        WorldArea worldArea = new WorldArea(llllIlIlIl[80], llllIlIlIl[81], llllIlIlIl[69], llllIlIlIl[64], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[82], llllIlIlIl[81], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[83], llllIlIlIl[84], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[10]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[189], llllIlIlIl[190], llllIlIlIl[24], llllIlIlIl[2], llllIlIlIl[1]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[85], llllIlIlIl[87], llllIlIlIl[12], llllIlIlIl[24], llllIlIlIl[10]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[191], llllIlIlIl[192], llllIlIlIl[73], llllIlIlIl[38], llllIlIlIl[10]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[90], llllIlIlIl[91], llllIlIlIl[66], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[92], llllIlIlIl[93], llllIlIlIl[22], llllIlIlIl[26], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[92], llllIlIlIl[94], llllIlIlIl[12], llllIlIlIl[22], llllIlIlIl[10]);
        WorldArea worldArea10 = new WorldArea(llllIlIlIl[127], llllIlIlIl[128], llllIlIlIl[49], llllIlIlIl[12], llllIlIlIl[3]);
        WorldArea worldArea11 = new WorldArea(llllIlIlIl[129], llllIlIlIl[127], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[3]);
        WorldArea worldArea12 = new WorldArea(llllIlIlIl[130], llllIlIlIl[131], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[3]);
        WorldArea worldArea13 = new WorldArea(llllIlIlIl[132], llllIlIlIl[133], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea14 = new WorldArea(llllIlIlIl[134], llllIlIlIl[9], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea15 = new WorldArea(llllIlIlIl[135], llllIlIlIl[136], llllIlIlIl[68], llllIlIlIl[53], llllIlIlIl[10]);
        WorldArea worldArea16 = new WorldArea(llllIlIlIl[137], llllIlIlIl[138], llllIlIlIl[63], llllIlIlIl[64], llllIlIlIl[3]);
        WorldArea worldArea17 = new WorldArea(llllIlIlIl[164], llllIlIlIl[133], llllIlIlIl[64], llllIlIlIl[12], llllIlIlIl[10]);
        WorldArea worldArea18 = new WorldArea(llllIlIlIl[165], llllIlIlIl[139], llllIlIlIl[38], llllIlIlIl[53], llllIlIlIl[3]);
        WorldArea worldArea19 = new WorldArea(llllIlIlIl[166], llllIlIlIl[134], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea20 = new WorldArea(llllIlIlIl[167], llllIlIlIl[136], llllIlIlIl[70], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea21 = new WorldArea(llllIlIlIl[168], llllIlIlIl[169], llllIlIlIl[54], llllIlIlIl[63], llllIlIlIl[3]);
        WorldArea[] worldAreaArray = new WorldArea[llllIlIlIl[68]];
        worldAreaArray[T.llllIlIlIl[0]] = worldArea;
        worldAreaArray[T.llllIlIlIl[1]] = worldArea2;
        worldAreaArray[T.llllIlIlIl[3]] = worldArea3;
        worldAreaArray[T.llllIlIlIl[10]] = worldArea4;
        worldAreaArray[T.llllIlIlIl[17]] = worldArea5;
        worldAreaArray[T.llllIlIlIl[2]] = worldArea6;
        worldAreaArray[T.llllIlIlIl[20]] = worldArea7;
        worldAreaArray[T.llllIlIlIl[22]] = worldArea8;
        worldAreaArray[T.llllIlIlIl[24]] = worldArea9;
        worldAreaArray[T.llllIlIlIl[26]] = worldArea10;
        worldAreaArray[T.llllIlIlIl[12]] = worldArea11;
        worldAreaArray[T.llllIlIlIl[49]] = worldArea12;
        worldAreaArray[T.llllIlIlIl[63]] = worldArea13;
        worldAreaArray[T.llllIlIlIl[64]] = worldArea14;
        worldAreaArray[T.llllIlIlIl[53]] = worldArea15;
        worldAreaArray[T.llllIlIlIl[38]] = worldArea16;
        worldAreaArray[T.llllIlIlIl[65]] = worldArea17;
        worldAreaArray[T.llllIlIlIl[66]] = worldArea18;
        worldAreaArray[T.llllIlIlIl[54]] = worldArea19;
        worldAreaArray[T.llllIlIlIl[67]] = worldArea20;
        worldAreaArray[T.llllIlIlIl[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[llllIlIlIl[1]];
        nArray[T.llllIlIlIl[0]] = llllIlIlIl[193];
        if (T.llIIlllllllIl(TileItems.getNearest((int[])nArray))) {
            void var8;
            System.out.println(llllIlIIll[llllIlIlIl[194]]);
            int var9 = llllIlIlIl[0];
            while (T.llIIllllllIll(var9, ((void)var8).length)) {
                int[] nArray2 = new int[llllIlIlIl[1]];
                nArray2[T.llllIlIlIl[0]] = llllIlIlIl[193];
                if (T.llIIllllllIlI(var8[var9].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && T.llIIllllllIlI(var8[var9].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llllIlIlIl[1];
                }
                ++var9;

                return ((0x70 ^ 0x27 ^ (0xFC ^ 0xA5)) & (76 + 6 - -30 + 16 ^ 136 + 48 - 180 + 138 ^ -1)) != 0;
            }
        }
        return llllIlIlIl[0];
    }

    private static void llIIllllIlIIl() {
        llllIlIIll = new String[llllIlIlIl[238]];
        T.llllIlIIll[T.llllIlIlIl[0]] = "Buying items";
        T.llllIlIIll[T.llllIlIlIl[1]] = "Finished buying items, switching back to agility";
        T.llllIlIIll[T.llllIlIlIl[3]] = "Navigating to bank";
        T.llllIlIIll[T.llllIlIlIl[10]] = "Handling banking";
        T.llllIlIIll[T.llllIlIlIl[17]] = "We are missing quest supplies, switching to BUYING";
        T.llllIlIIll[T.llllIlIlIl[2]] = "Vial";
        T.llllIlIIll[T.llllIlIlIl[20]] = "Vial";
        T.llllIlIIll[T.llllIlIlIl[22]] = "Drop";
        T.llllIlIIll[T.llllIlIlIl[24]] = "Drink";
        T.llllIlIIll[T.llllIlIlIl[26]] = "Eat";
        T.llllIlIIll[T.llllIlIlIl[12]] = "Nav to gnome course";
        T.llllIlIIll[T.llllIlIlIl[49]] = "Crossing log";
        T.llllIlIIll[T.llllIlIlIl[63]] = "Log balance";
        T.llllIlIIll[T.llllIlIlIl[64]] = "Walk-across";
        T.llllIlIIll[T.llllIlIlIl[53]] = "Climbing net";
        T.llllIlIIll[T.llllIlIlIl[38]] = "Obstacle net";
        T.llllIlIIll[T.llllIlIlIl[65]] = "Climb-over";
        T.llllIlIIll[T.llllIlIlIl[66]] = "Climbing branch";
        T.llllIlIIll[T.llllIlIlIl[54]] = "Tree branch";
        T.llllIlIIll[T.llllIlIlIl[67]] = "Climb";
        T.llllIlIIll[T.llllIlIlIl[40]] = "Crossing rope";
        T.llllIlIIll[T.llllIlIlIl[68]] = "Balancing rope";
        T.llllIlIIll[T.llllIlIlIl[61]] = "Walk-on";
        T.llllIlIIll[T.llllIlIlIl[69]] = "Climbing down";
        T.llllIlIIll[T.llllIlIlIl[70]] = "Tree branch";
        T.llllIlIIll[T.llllIlIlIl[41]] = "Climb-down";
        T.llllIlIIll[T.llllIlIlIl[71]] = "Climbing net";
        T.llllIlIIll[T.llllIlIlIl[72]] = "Obstacle net";
        T.llllIlIIll[T.llllIlIlIl[73]] = "Climb-over";
        T.llllIlIIll[T.llllIlIlIl[74]] = "Crossing pipe";
        T.llllIlIIll[T.llllIlIlIl[42]] = "Obstacle pipe";
        T.llllIlIIll[T.llllIlIlIl[75]] = "Squeeze-through";
        T.llllIlIIll[T.llllIlIlIl[95]] = "Nav to start";
        T.llllIlIIll[T.llllIlIlIl[97]] = "Mark of grace";
        T.llllIlIIll[T.llllIlIlIl[98]] = "Taking mark";
        T.llllIlIIll[T.llllIlIlIl[99]] = "Found mark on ground";
        T.llllIlIIll[T.llllIlIlIl[100]] = "Take";
        T.llllIlIIll[T.llllIlIlIl[101]] = "Starting course";
        T.llllIlIIll[T.llllIlIlIl[102]] = "Rough wall";
        T.llllIlIIll[T.llllIlIlIl[103]] = "Climb";
        T.llllIlIIll[T.llllIlIlIl[37]] = "Crossing clothes line";
        T.llllIlIIll[T.llllIlIlIl[105]] = "Clothes line";
        T.llllIlIIll[T.llllIlIlIl[106]] = "Cross";
        T.llllIlIIll[T.llllIlIlIl[107]] = "Leaping";
        T.llllIlIIll[T.llllIlIlIl[108]] = "Gap";
        T.llllIlIIll[T.llllIlIlIl[109]] = "Leap";
        T.llllIlIIll[T.llllIlIlIl[110]] = "Balancing";
        T.llllIlIIll[T.llllIlIlIl[111]] = "Wall";
        T.llllIlIIll[T.llllIlIlIl[112]] = "Balance";
        T.llllIlIIll[T.llllIlIlIl[113]] = "Jumping gap";
        T.llllIlIIll[T.llllIlIlIl[39]] = "Gap";
        T.llllIlIIll[T.llllIlIlIl[7]] = "Leap";
        T.llllIlIIll[T.llllIlIlIl[114]] = "Jumping gap 2";
        T.llllIlIIll[T.llllIlIlIl[116]] = "Leap";
        T.llllIlIIll[T.llllIlIlIl[117]] = "Jumping gap 3";
        T.llllIlIIll[T.llllIlIlIl[119]] = "Leap";
        T.llllIlIIll[T.llllIlIlIl[120]] = "Hurdle roof";
        T.llllIlIIll[T.llllIlIlIl[122]] = "Hurdle";
        T.llllIlIIll[T.llllIlIlIl[123]] = "Finishing course";
        T.llllIlIIll[T.llllIlIlIl[124]] = "Edge";
        T.llllIlIIll[T.llllIlIlIl[44]] = "Jump-off";
        T.llllIlIIll[T.llllIlIlIl[140]] = "Nav to canafis course";
        T.llllIlIIll[T.llllIlIlIl[6]] = "Nav to start";
        T.llllIlIIll[T.llllIlIlIl[141]] = "Starting course";
        T.llllIlIIll[T.llllIlIlIl[142]] = "Tall tree";
        T.llllIlIIll[T.llllIlIlIl[143]] = "Climb";
        T.llllIlIIll[T.llllIlIlIl[144]] = "Mark of grace";
        T.llllIlIIll[T.llllIlIlIl[145]] = "Taking mark";
        T.llllIlIIll[T.llllIlIlIl[146]] = "Found mark on ground";
        T.llllIlIIll[T.llllIlIlIl[147]] = "Take";
        T.llllIlIIll[T.llllIlIlIl[148]] = "Jumping gap 1";
        T.llllIlIIll[T.llllIlIlIl[149]] = "Jump";
        T.llllIlIIll[T.llllIlIlIl[150]] = "Jumping gap 2";
        T.llllIlIIll[T.llllIlIlIl[151]] = "Jump";
        T.llllIlIIll[T.llllIlIlIl[152]] = "Jumping gap 3";
        T.llllIlIIll[T.llllIlIlIl[153]] = "Jump";
        T.llllIlIIll[T.llllIlIlIl[154]] = "Jumping gap 4";
        T.llllIlIIll[T.llllIlIlIl[155]] = "Jump";
        T.llllIlIIll[T.llllIlIlIl[156]] = "Vaulting";
        T.llllIlIIll[T.llllIlIlIl[157]] = "Vault";
        T.llllIlIIll[T.llllIlIlIl[158]] = "Jumping gap 5";
        T.llllIlIIll[T.llllIlIlIl[159]] = "Jump";
        T.llllIlIIll[T.llllIlIlIl[160]] = "Jumping gap 6";
        T.llllIlIIll[T.llllIlIlIl[161]] = "Jump";
        T.llllIlIIll[T.llllIlIlIl[172]] = "Nav to canafis course";
        T.llllIlIIll[T.llllIlIlIl[173]] = "Nav to start";
        T.llllIlIIll[T.llllIlIlIl[174]] = "Starting course";
        T.llllIlIIll[T.llllIlIlIl[175]] = "Wall";
        T.llllIlIIll[T.llllIlIlIl[35]] = "Climb-up";
        T.llllIlIIll[T.llllIlIlIl[176]] = "Mark of grace";
        T.llllIlIIll[T.llllIlIlIl[177]] = "Taking mark";
        T.llllIlIIll[T.llllIlIlIl[178]] = "Found mark on ground";
        T.llllIlIIll[T.llllIlIlIl[179]] = "Take";
        T.llllIlIIll[T.llllIlIlIl[180]] = "Jumping gap 1";
        T.llllIlIIll[T.llllIlIlIl[79]] = "Jump";
        T.llllIlIIll[T.llllIlIlIl[181]] = "cross rope";
        T.llllIlIIll[T.llllIlIlIl[182]] = "Cross";
        T.llllIlIIll[T.llllIlIlIl[183]] = "Jumping gap 3";
        T.llllIlIIll[T.llllIlIlIl[184]] = "Jump";
        T.llllIlIIll[T.llllIlIlIl[185]] = "Jumping gap 4";
        T.llllIlIIll[T.llllIlIlIl[186]] = "Jump";
        T.llllIlIIll[T.llllIlIlIl[187]] = "Jumping Edge";
        T.llllIlIIll[T.llllIlIlIl[188]] = "Jump";
        T.llllIlIIll[T.llllIlIlIl[194]] = "Found mark on ground";
        T.llllIlIIll[T.llllIlIlIl[203]] = "Agility";
        T.llllIlIIll[T.llllIlIlIl[204]] = "passage";
        T.llllIlIIll[T.llllIlIlIl[205]] = "passage";
        T.llllIlIIll[T.llllIlIlIl[206]] = "passage";
        T.llllIlIIll[T.llllIlIlIl[207]] = "passage";
        T.llllIlIIll[T.llllIlIlIl[208]] = "Edge";
        T.llllIlIIll[T.llllIlIlIl[211]] = "Gap";
        T.llllIlIIll[T.llllIlIlIl[213]] = "Gap";
        T.llllIlIIll[T.llllIlIlIl[216]] = "Tightrope";
        T.llllIlIIll[T.llllIlIlIl[218]] = "Gap";
        T.llllIlIIll[T.llllIlIlIl[221]] = "Gap";
        T.llllIlIIll[T.llllIlIlIl[224]] = "Gap";
        T.llllIlIIll[T.llllIlIlIl[226]] = "Pole-vault";
        T.llllIlIIll[T.llllIlIlIl[227]] = "Gap";
        T.llllIlIIll[T.llllIlIlIl[230]] = "Gap";
        T.llllIlIIll[T.llllIlIlIl[232]] = "Gap";
        T.llllIlIIll[T.llllIlIlIl[233]] = "Gap";
    }

        return String.valueOf(var10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        if (T.llIlIIIIIIIII(Skills.getBoostedLevel((Skill)Skill.AGILITY), llllIlIlIl[37])) {
            int n3;
            int[] nArray = new int[llllIlIlIl[1]];
            nArray[T.llllIlIlIl[0]] = llllIlIlIl[13];
            if (T.llIIllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllIlIlIl[1]];
                nArray2[T.llllIlIlIl[0]] = llllIlIlIl[25];
                if (T.llIIllllllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llllIlIlIl[1]];
                    nArray3[T.llllIlIlIl[0]] = llllIlIlIl[23];
                    if (!(!T.llIIllllllIlI(Inventory.contains((int[])nArray3) ? 1 : 0) || T.llIIlllllllII(Inventory.contains(item -> item.getName().contains(llllIlIIll[llllIlIlIl[207]])) ? 1 : 0) && !T.llIIllllllIlI(Equipment.contains(item -> item.getName().contains(llllIlIIll[llllIlIlIl[206]])) ? 1 : 0) || T.llIIlllllllII(Inventory.contains((int[])f.be) ? 1 : 0) && !T.llIIllllllIlI(Equipment.contains((int[])f.be) ? 1 : 0))) {
                        n3 = llllIlIlIl[1];

                        if (((0x43 ^ 0x4F) & ~(0xB7 ^ 0xBB)) == 0) return n3 != 0;
                        return false;
                    }
                }
            }
            n3 = llllIlIlIl[0];
            return n3 != 0;
        }
        int[] nArray = new int[llllIlIlIl[1]];
        nArray[T.llllIlIlIl[0]] = llllIlIlIl[13];
        if (T.llIIllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llllIlIlIl[1]];
            nArray4[T.llllIlIlIl[0]] = llllIlIlIl[15];
            if (T.llIIllllllIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[llllIlIlIl[1]];
                nArray5[T.llllIlIlIl[0]] = llllIlIlIl[14];
                if (!(!T.llIIllllllIlI(Inventory.contains((int[])nArray5) ? 1 : 0) || T.llIIlllllllII(Inventory.contains(item -> item.getName().contains(llllIlIIll[llllIlIlIl[205]])) ? 1 : 0) && !T.llIIllllllIlI(Equipment.contains(item -> item.getName().contains(llllIlIIll[llllIlIlIl[204]])) ? 1 : 0) || T.llIIlllllllII(Inventory.contains((int[])f.be) ? 1 : 0) && !T.llIIllllllIlI(Equipment.contains((int[])f.be) ? 1 : 0))) {
                    n2 = llllIlIlIl[1];

                    if (2 > ((178 + 114 - 169 + 122 ^ 7 + 173 - 74 + 89) & (0xA ^ 0x7B ^ (0x87 ^ 0xC0) ^ -1))) return n2 != 0;
                    return ((0x40 ^ 0x44 ^ (0x9D ^ 0xC7)) & (38 + 50 - -58 + 83 ^ 31 + 65 - -49 + 42 ^ -1)) != 0;
                }
            }
        }
        n2 = llllIlIlIl[0];
        return n2 != 0;
    }

    private static boolean llIIlllllllII(int n2) {
        return n2 == 0;
    }

    static {
        T.llIIllllllIIl();
        T.llIIllllIlIIl();
        bu = new ArrayList<d>();
        iS = llllIlIlIl[27];
        iT = llllIlIlIl[23];
        iV = new WorldArea(llllIlIlIl[235], llllIlIlIl[52], llllIlIlIl[69], llllIlIlIl[72], llllIlIlIl[0]);
        iW = new WorldArea(llllIlIlIl[235], llllIlIlIl[52], llllIlIlIl[69], llllIlIlIl[72], llllIlIlIl[1]);
        iX = new WorldArea(llllIlIlIl[235], llllIlIlIl[52], llllIlIlIl[69], llllIlIlIl[72], llllIlIlIl[3]);
        iY = new WorldPoint(llllIlIlIl[236], llllIlIlIl[237], llllIlIlIl[0]);
    }

    /*
     * WARNING - void declaration
     */
    private static void dv() {
        void var11;
        void var12;
        void var13;
        void var14;
        void var15;
        WorldArea worldArea = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[3]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[10]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[127], llllIlIlIl[128], llllIlIlIl[49], llllIlIlIl[12], llllIlIlIl[3]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[129], llllIlIlIl[127], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[3]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[130], llllIlIlIl[131], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[3]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[132], llllIlIlIl[133], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[134], llllIlIlIl[9], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea10 = new WorldArea(llllIlIlIl[135], llllIlIlIl[136], llllIlIlIl[68], llllIlIlIl[53], llllIlIlIl[10]);
        WorldArea worldArea11 = new WorldArea(llllIlIlIl[137], llllIlIlIl[138], llllIlIlIl[63], llllIlIlIl[64], llllIlIlIl[3]);
        WorldPoint worldPoint = new WorldPoint(llllIlIlIl[137], llllIlIlIl[139], llllIlIlIl[0]);
        if (T.llIIllllllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (T.llIIlllllllII(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[140]];
            Movement.walkTo((WorldPoint)var11);

            Time.sleepTicks((int)llllIlIlIl[1]);

        }
        if (T.llIIllllllIlI(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (T.llIIllllllllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var11), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[6]];
                Movement.walkTo((WorldPoint)var11);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIlIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var11), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[141]];
                int var16 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[142]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[143]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var16)) {
                        bl = llllIlIlIl[1];

                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
        }
        String[] stringArray = new String[llllIlIlIl[1]];
        stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[144]];
        TileItem var16 = TileItems.getNearest((String[])stringArray);
        if (T.llIIlllllllIl(var16) && T.llIIllllllIlI(T.dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[145]];
            System.out.println(llllIlIIll[llllIlIlIl[146]]);
            var16.interact(llllIlIIll[llllIlIlIl[147]]);
            Time.sleepTicks((int)llllIlIlIl[10]);

        }
        if (T.llIIlllllllII(T.dx() ? 1 : 0)) {
            void var17;
            void var18;
            void var19;
            void var20;
            void var21;
            void var22;
            int var23;
            TileObject var24;
            void var25;
            if (T.llIIllllllIlI(var25.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var24 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[233]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[234], llllIlIlIl[131], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                var23 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[148]];
                var24.interact(llllIlIIll[llllIlIlIl[149]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var23)) {
                        bl = llllIlIlIl[1];

                        if (-(0x43 ^ 0x47) > 0) {
                            return false;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(var22.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var24 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[232]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[131], llllIlIlIl[225], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                    if (-(0xC3 ^ 0x8C ^ (0x7E ^ 0x35)) > 0) {
                        return ((0xC4 ^ 0x87 ^ (0xBD ^ 0xA3)) & (141 + 145 - 204 + 127 ^ 36 + 75 - -23 + 6 ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[150]];
                var23 = Skills.getExperience((Skill)Skill.AGILITY);
                var24.interact(llllIlIIll[llllIlIlIl[151]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var23)) {
                        bl = llllIlIlIl[1];

                        if (3 == 0) {
                            return false;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var24 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[230]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[139], llllIlIlIl[231], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                    if (((0x75 ^ 0x3C) & ~(0xEC ^ 0xA5)) > 0) {
                        return false;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[152]];
                var23 = Skills.getExperience((Skill)Skill.AGILITY);
                var24.interact(llllIlIIll[llllIlIlIl[153]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var23)) {
                        bl = llllIlIlIl[1];

                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var24 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[227]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[228], llllIlIlIl[229], llllIlIlIl[10])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                    if ((0x40 ^ 0x12 ^ (0x59 ^ 0xF)) <= 2) {
                        return false;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[154]];
                var23 = Skills.getExperience((Skill)Skill.AGILITY);
                var24.interact(llllIlIIll[llllIlIlIl[155]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var23)) {
                        bl = llllIlIlIl[1];

                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var24 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[226]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[9], llllIlIlIl[130], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                    if (2 < 2) {
                        return ((0x76 ^ 0x57 ^ (0x5E ^ 0x78)) & (16 + 61 - 28 + 89 ^ 124 + 28 - 79 + 68 ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[156]];
                var23 = Skills.getExperience((Skill)Skill.AGILITY);
                var24.interact(llllIlIIll[llllIlIlIl[157]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var23)) {
                        bl = llllIlIlIl[1];

                        if (1 > (0xBC ^ 0xB8)) {
                            return false;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var24 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[224]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[225], llllIlIlIl[215], llllIlIlIl[10])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                    if ((0x70 ^ 0x74) < ((0x9B ^ 0x8E) & ~(0x33 ^ 0x26))) {
                        return false;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[158]];
                var23 = Skills.getExperience((Skill)Skill.AGILITY);
                var24.interact(llllIlIIll[llllIlIlIl[159]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var23)) {
                        bl = llllIlIlIl[1];

                        if (((0x16 ^ 0x71 ^ (0x5C ^ 0x2C)) & (0xF1 ^ 0x9E ^ (0xE7 ^ 0x9F) ^ -1)) < 0) {
                            return ((0xB8 ^ 0xAA ^ (0x6D ^ 0x25)) & (41 + 66 - 68 + 177 ^ 12 + 62 - -32 + 24 ^ -1)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var24 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[221]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[222], llllIlIlIl[223], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                    if (1 > (0x94 ^ 0x90)) {
                        return false;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[160]];
                var23 = Skills.getExperience((Skill)Skill.AGILITY);
                var24.interact(llllIlIIll[llllIlIlIl[161]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var23)) {
                        bl = llllIlIlIl[1];

                        if ((4 ^ 0) == (3 & ~3)) {
                            return false;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void du() {
        WorldArea worldArea = new WorldArea(llllIlIlIl[76], llllIlIlIl[77], llllIlIlIl[78], llllIlIlIl[79], llllIlIlIl[1]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[76], llllIlIlIl[77], llllIlIlIl[78], llllIlIlIl[79], llllIlIlIl[3]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[76], llllIlIlIl[77], llllIlIlIl[78], llllIlIlIl[79], llllIlIlIl[10]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[80], llllIlIlIl[81], llllIlIlIl[69], llllIlIlIl[64], llllIlIlIl[0]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[82], llllIlIlIl[81], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[83], llllIlIlIl[84], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[10]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[85], llllIlIlIl[86], llllIlIlIl[26], llllIlIlIl[22], llllIlIlIl[1]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[85], llllIlIlIl[87], llllIlIlIl[12], llllIlIlIl[24], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[88], llllIlIlIl[89], llllIlIlIl[75], llllIlIlIl[40], llllIlIlIl[10]);
        WorldArea worldArea10 = new WorldArea(llllIlIlIl[90], llllIlIlIl[91], llllIlIlIl[66], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea11 = new WorldArea(llllIlIlIl[92], llllIlIlIl[93], llllIlIlIl[22], llllIlIlIl[26], llllIlIlIl[10]);
        WorldArea worldArea12 = new WorldArea(llllIlIlIl[92], llllIlIlIl[94], llllIlIlIl[12], llllIlIlIl[22], llllIlIlIl[10]);
        if (T.llIIlllllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[95]];
            if (T.llIIllllllIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (T.llIIllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlIl[96], llllIlIlIl[52], llllIlIlIl[0]));

            Time.sleepTicks((int)llllIlIlIl[1]);

        }
        if (T.llIlIIIIIIIIl(Players.getLocal().getAnimation(), llllIlIlIl[62]) && T.llIIlllllllII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[llllIlIlIl[1]];
            stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[97]];
            TileItem var26 = TileItems.getNearest((String[])stringArray);
            if (T.llIIlllllllIl(var26) && T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[98]];
                System.out.println(llllIlIIll[llllIlIlIl[99]]);
                var26.interact(llllIlIIll[llllIlIlIl[100]]);
                Time.sleepTicks((int)llllIlIlIl[10]);

            }
            if (T.llIIlllllllII(T.dx() ? 1 : 0)) {
                void var27;
                void var28;
                void var29;
                void var30;
                void var31;
                void var32;
                void var33;
                void var34;
                int var35;
                void var36;
                if (T.llIIllllllIlI(var36.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[101]];
                    var35 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[llllIlIlIl[1]];
                    stringArray2[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(llllIlIIll[llllIlIlIl[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var35)) {
                            bl = llllIlIlIl[1];

                            if ((22 + 45 - -62 + 31 ^ 124 + 68 - 126 + 98) < 1) {
                                return ((1 ^ 0x75 ^ (0xD8 ^ 0x9B)) & (0x4C ^ 0x3F ^ (0x74 ^ 0x30) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);

                    Time.sleepTicks((int)llllIlIlIl[1]);

                }
                if (T.llIIllllllIlI(var34.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[37]];
                    var35 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[llllIlIlIl[1]];
                    stringArray3[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(llllIlIIll[llllIlIlIl[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var35)) {
                            bl = llllIlIlIl[1];

                            if (1 == -1) {
                                return ((61 + 42 - -149 + 0 ^ 136 + 47 - 62 + 62) & (0x2F ^ 0 ^ (0xF8 ^ 0x9C) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);

                    Time.sleepTicks((int)llllIlIlIl[1]);

                }
                if (T.llIIllllllIlI(var33.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[107]];
                    var35 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[llllIlIlIl[1]];
                    stringArray4[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(llllIlIIll[llllIlIlIl[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var35)) {
                            bl = llllIlIlIl[1];

                            if ((0xC0 ^ 0xC5) <= 0) {
                                return false;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);

                    Time.sleepTicks((int)llllIlIlIl[1]);

                }
                if (T.llIIllllllIlI(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[110]];
                    var35 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[llllIlIlIl[1]];
                    stringArray5[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(llllIlIIll[llllIlIlIl[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var35)) {
                            bl = llllIlIlIl[1];

                            if (2 < 1) {
                                return false;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);

                    Time.sleepTicks((int)llllIlIlIl[1]);

                }
                if (T.llIIllllllIlI(var31.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[113]];
                    var35 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[llllIlIlIl[1]];
                    stringArray6[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(llllIlIIll[llllIlIlIl[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var35)) {
                            bl = llllIlIlIl[1];

                            if (2 == ((0x4C ^ 0x52) & ~(0x5E ^ 0x40))) {
                                return false;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);

                    Time.sleepTicks((int)llllIlIlIl[1]);

                }
                if (T.llIIllllllIlI(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[114]];
                    var35 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIlIlIl[1]];
                    nArray[T.llllIlIlIl[0]] = llllIlIlIl[115];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIIll[llllIlIlIl[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var35)) {
                            bl = llllIlIlIl[1];

                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);

                    Time.sleepTicks((int)llllIlIlIl[1]);

                }
                if (T.llIIllllllIlI(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[117]];
                    var35 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIlIlIl[1]];
                    nArray[T.llllIlIlIl[0]] = llllIlIlIl[118];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIIll[llllIlIlIl[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var35)) {
                            bl = llllIlIlIl[1];

                            if (1 < 0) {
                                return (2 & (2 ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);

                    Time.sleepTicks((int)llllIlIlIl[1]);

                }
                if (T.llIIllllllIlI(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[120]];
                    var35 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIlIlIl[1]];
                    nArray[T.llllIlIlIl[0]] = llllIlIlIl[121];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIIll[llllIlIlIl[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var35)) {
                            bl = llllIlIlIl[1];

                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);

                    Time.sleepTicks((int)llllIlIlIl[1]);

                }
                if (T.llIIllllllIlI(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[123]];
                    var35 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[llllIlIlIl[1]];
                    stringArray7[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(llllIlIIll[llllIlIlIl[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var35)) {
                            bl = llllIlIlIl[1];

                            if ((0x55 ^ 0x51) <= 3) {
                                return false;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);

                    Time.sleepTicks((int)llllIlIlIl[1]);

                }
            }
        }
    }

    private static boolean llIIlllllllll(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIIIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIllllllllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void dw() {
        void var37;
        void var38;
        void var39;
        void var40;
        void var41;
        WorldArea worldArea = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[3]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[10]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[164], llllIlIlIl[133], llllIlIlIl[64], llllIlIlIl[12], llllIlIlIl[10]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[165], llllIlIlIl[139], llllIlIlIl[38], llllIlIlIl[53], llllIlIlIl[3]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[166], llllIlIlIl[134], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[167], llllIlIlIl[136], llllIlIlIl[70], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[168], llllIlIlIl[169], llllIlIlIl[54], llllIlIlIl[63], llllIlIlIl[3]);
        WorldPoint worldPoint = new WorldPoint(llllIlIlIl[170], llllIlIlIl[171], llllIlIlIl[0]);
        if (T.llIIllllllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (T.llIIlllllllII(var41.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(var40.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(var39.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(var38.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[172]];
            Movement.walkTo((WorldPoint)var37);

            Time.sleepTicks((int)llllIlIlIl[1]);

        }
        if (T.llIIllllllIlI(var41.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (T.llIIllllllllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[173]];
                Movement.walkTo((WorldPoint)var37);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIlIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var37), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[174]];
                int var42 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[175]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[35]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var42)) {
                        bl = llllIlIlIl[1];

                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
        }
        String[] stringArray = new String[llllIlIlIl[1]];
        stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[176]];
        TileItem var42 = TileItems.getNearest((String[])stringArray);
        if (T.llIIlllllllIl(var42) && T.llIIllllllIlI(T.dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[177]];
            System.out.println(llllIlIIll[llllIlIlIl[178]]);
            var42.interact(llllIlIIll[llllIlIlIl[179]]);
            Time.sleepTicks((int)llllIlIlIl[10]);

        }
        if (T.llIIlllllllII(T.dx() ? 1 : 0)) {
            void var43;
            void var44;
            void var45;
            void var46;
            int var47;
            TileObject var48;
            void var49;
            if (T.llIIllllllIlI(var49.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var48 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[218]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[219], llllIlIlIl[220], llllIlIlIl[10])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                var47 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[180]];
                var48.interact(llllIlIIll[llllIlIlIl[79]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var47)) {
                        bl = llllIlIlIl[1];

                        if (-1 >= 3) {
                            return false;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(var46.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var48 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[216]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[217], llllIlIlIl[128], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                    if (3 <= 0) {
                        return ((0x70 ^ 0x48 ^ (0xE2 ^ 0xC7)) & (0xEA ^ 0xC5 ^ (0x6A ^ 0x58) ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[181]];
                var47 = Skills.getExperience((Skill)Skill.AGILITY);
                var48.interact(llllIlIIll[llllIlIlIl[182]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var47)) {
                        bl = llllIlIlIl[1];

                        if (((0xC9 ^ 0x86) & ~(0x68 ^ 0x27)) < 0) {
                            return false;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(var45.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var48 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[213]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[214], llllIlIlIl[215], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[183]];
                var47 = Skills.getExperience((Skill)Skill.AGILITY);
                var48.interact(llllIlIIll[llllIlIlIl[184]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var47)) {
                        bl = llllIlIlIl[1];

                        if (2 >= (0x2A ^ 0x2E)) {
                            return false;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(var44.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var48 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[211]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[209], llllIlIlIl[212], llllIlIlIl[10])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                    if (((0x71 ^ 0x6B ^ (0xB9 ^ 0x9A)) & (133 + 85 - 103 + 20 ^ 117 + 39 - 100 + 134 ^ -1)) != 0) {
                        return ((3 ^ (0x4D ^ 0x66)) & (0x68 ^ 0x45 ^ (0x6F ^ 0x6A) ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[185]];
                var47 = Skills.getExperience((Skill)Skill.AGILITY);
                var48.interact(llllIlIIll[llllIlIlIl[186]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var47)) {
                        bl = llllIlIlIl[1];

                        if (1 == 3) {
                            return false;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(var48 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[208]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[209], llllIlIlIl[210], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];

                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[187]];
                var47 = Skills.getExperience((Skill)Skill.AGILITY);
                var48.interact(llllIlIIll[llllIlIlIl[188]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), var47)) {
                        bl = llllIlIlIl[1];

                        if (2 > 2) {
                            return ((0x5F ^ 0x55 ^ (0x69 ^ 0x4F)) & (36 + 66 - -3 + 64 ^ 130 + 95 - 201 + 109 ^ -1)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);

                Time.sleepTicks((int)llllIlIlIl[1]);

            }
        }
    }

    private static boolean llIlIIIIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIIIIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    public static void ds() {
        if (T.llIIllllllIlI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[0]];
            b.a(bu);
            if (T.llIIllllllIll(bu.size(), llllIlIlIl[1])) {
                System.out.println(llllIlIIll[llllIlIlIl[1]]);
                bs = llllIlIlIl[0];
            }
        }
        if (T.llIIlllllllII(bs ? 1 : 0) && T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[2])) {
            if (T.llIIlllllllII(T.aa() ? 1 : 0)) {
                BankLocation var50 = BankLocation.getNearest();
                if (T.llIIlllllllIl(var50) && T.llIIlllllllII(var50.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[3]];
                    WorldArea var51 = new WorldArea(llllIlIlIl[4], llllIlIlIl[5], llllIlIlIl[6], llllIlIlIl[7], llllIlIlIl[0]);
                    if (T.llIIllllllIlI(var51.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var52 = new WorldPoint(llllIlIlIl[8], llllIlIlIl[9], llllIlIlIl[0]);
                        if (T.llIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(var52), llllIlIlIl[10])) {
                            Movement.walkTo((WorldPoint)var52);

                            Time.sleepTicks((int)llllIlIlIl[1]);

                        }
                    }
                    a.a(var50);
                }
                if (T.llIIlllllllIl(var50) && T.llIIllllllIlI(var50.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[10]];
                    if (T.llIIlllllllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIlIl[11]);

                    }
                    if (T.llIIllllllIlI(Bank.isOpen() ? 1 : 0)) {
                        if (T.llIIlllllllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIlIlIl[1]);

                        }
                        if (T.llIIlllllllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIlIlIl[3]);

                        }
                    }
                    int[] nArray = new int[llllIlIlIl[12]];
                    nArray[T.llllIlIlIl[0]] = llllIlIlIl[13];
                    nArray[T.llllIlIlIl[1]] = llllIlIlIl[14];
                    nArray[T.llllIlIlIl[3]] = llllIlIlIl[15];
                    nArray[T.llllIlIlIl[10]] = llllIlIlIl[16];
                    nArray[T.llllIlIlIl[17]] = llllIlIlIl[18];
                    nArray[T.llllIlIlIl[2]] = llllIlIlIl[19];
                    nArray[T.llllIlIlIl[20]] = llllIlIlIl[21];
                    nArray[T.llllIlIlIl[22]] = llllIlIlIl[23];
                    nArray[T.llllIlIlIl[24]] = llllIlIlIl[25];
                    nArray[T.llllIlIlIl[26]] = llllIlIlIl[27];
                    if (T.llIIlllllllII(e.b(nArray) ? 1 : 0)) {
                        T.ae();
                        System.out.println(llllIlIIll[llllIlIlIl[17]]);
                        bs = llllIlIlIl[1];
                        return;
                    }
                    int[] nArray2 = new int[llllIlIlIl[12]];
                    nArray2[T.llllIlIlIl[0]] = llllIlIlIl[13];
                    nArray2[T.llllIlIlIl[1]] = llllIlIlIl[14];
                    nArray2[T.llllIlIlIl[3]] = llllIlIlIl[15];
                    nArray2[T.llllIlIlIl[10]] = llllIlIlIl[16];
                    nArray2[T.llllIlIlIl[17]] = llllIlIlIl[18];
                    nArray2[T.llllIlIlIl[2]] = llllIlIlIl[19];
                    nArray2[T.llllIlIlIl[20]] = llllIlIlIl[21];
                    nArray2[T.llllIlIlIl[22]] = llllIlIlIl[23];
                    nArray2[T.llllIlIlIl[24]] = llllIlIlIl[25];
                    nArray2[T.llllIlIlIl[26]] = llllIlIlIl[27];
                    if (T.llIIllllllIlI(e.b(nArray2) ? 1 : 0)) {
                        a.a(llllIlIlIl[28], llllIlIlIl[1]);
                        a.a(llllIlIlIl[29], llllIlIlIl[1]);
                        a.a(llllIlIlIl[30], llllIlIlIl[1]);
                        a.a(llllIlIlIl[31], llllIlIlIl[1]);
                        a.a(llllIlIlIl[32], llllIlIlIl[1]);
                        a.a(llllIlIlIl[33], llllIlIlIl[1]);
                        a.a(llllIlIlIl[34], llllIlIlIl[1]);
                        int[] nArray3 = new int[llllIlIlIl[1]];
                        nArray3[T.llllIlIlIl[0]] = llllIlIlIl[28];
                        if (T.llIIlllllllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llllIlIlIl[1]];
                            nArray4[T.llllIlIlIl[0]] = llllIlIlIl[28];
                            if (T.llIIlllllllII(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[llllIlIlIl[1]];
                                nArray5[T.llllIlIlIl[0]] = llllIlIlIl[28];
                                if (T.llIIlllllllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(llllIlIlIl[35], llllIlIlIl[1]);
                                }
                            }
                        }
                        a.a(llllIlIlIl[18], llllIlIlIl[1]);
                        e.l(llllIlIlIl[28]);
                        e.l(llllIlIlIl[29]);
                        e.l(llllIlIlIl[30]);
                        e.l(llllIlIlIl[31]);
                        e.l(llllIlIlIl[32]);
                        Time.sleepTicks((int)llllIlIlIl[1]);

                        e.l(llllIlIlIl[34]);
                        e.l(llllIlIlIl[36]);
                        e.l(llllIlIlIl[33]);
                        e.l(llllIlIlIl[35]);
                        e.l(llllIlIlIl[18]);
                        Time.sleepTicks((int)llllIlIlIl[10]);

                        if (T.llIIlllllllII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llllIlIlIl[20]);

                        }
                        if (T.llIIllllllIlI(Bank.isOpen() ? 1 : 0)) {
                            if (T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[37])) {
                                a.a(llllIlIlIl[13], llllIlIlIl[12]);
                                a.a(llllIlIlIl[14], llllIlIlIl[12]);
                                a.a(llllIlIlIl[21], llllIlIlIl[12]);
                                a.a(llllIlIlIl[15], llllIlIlIl[12]);
                                a.b(f.be, llllIlIlIl[1]);
                                a.a(llllIlIlIl[27], llllIlIlIl[1]);
                                a.a(llllIlIlIl[19], llllIlIlIl[2]);
                                a.a(llllIlIlIl[23], llllIlIlIl[38]);
                            }
                            if (T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[37])) {
                                a.a(llllIlIlIl[13], llllIlIlIl[12]);
                                a.a(llllIlIlIl[21], llllIlIlIl[12]);
                                a.a(llllIlIlIl[25], llllIlIlIl[12]);
                                a.b(f.be, llllIlIlIl[1]);
                                a.a(llllIlIlIl[27], llllIlIlIl[1]);
                                a.a(llllIlIlIl[19], llllIlIlIl[24]);
                                a.a(llllIlIlIl[23], llllIlIlIl[12]);
                            }
                        }
                    }
                }
            }
            if (T.llIIllllllIlI(T.aa() ? 1 : 0)) {
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[2]];
                if (T.llIIllllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llllIlIlIl[1]];
                    stringArray2[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[20]];
                    Inventory.getFirst((String[])stringArray2).interact(llllIlIIll[llllIlIlIl[22]]);
                }
                if (T.llIIllllllIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && T.llIIllllllIll(Movement.getRunEnergy(), llllIlIlIl[39])) {
                    Inventory.getFirst((int[])f.aU).interact(llllIlIIll[llllIlIlIl[24]]);
                    Time.sleepTicks((int)llllIlIlIl[1]);

                }
                if (T.llIIllllllllI(Combat.getMissingHealth(), llllIlIlIl[40])) {
                    int[] nArray = new int[llllIlIlIl[1]];
                    nArray[T.llllIlIlIl[0]] = llllIlIlIl[23];
                    if (T.llIIllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llllIlIlIl[1]];
                        nArray6[T.llllIlIlIl[0]] = llllIlIlIl[23];
                        Inventory.getFirst((int[])nArray6).interact(llllIlIIll[llllIlIlIl[26]]);
                        Time.sleepTicks((int)llllIlIlIl[3]);

                    }
                }
                if (T.llIIllllllllI(Movement.getRunEnergy(), llllIlIlIl[41]) && T.llIIlllllllII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[42])) {
                    T.dt();
                }
                if ((!T.llIlIIIIIIIII(e.j(llllIlIlIl[43]), llllIlIlIl[44]) || T.llIIllllllIll(e.j(llllIlIlIl[45]), llllIlIlIl[2])) && T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[42]) && T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[44])) {
                    T.du();
                }
                if (T.llIlIIIIIIIII(e.j(llllIlIlIl[43]), llllIlIlIl[44]) && T.llIlIIIIIIIII(e.j(llllIlIlIl[45]), llllIlIlIl[2])) {
                    if (T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[42]) && T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[37])) {
                        T.du();
                    }
                    if (T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[37]) && T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[44])) {
                        T.dv();
                    }
                }
                if (T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[44])) {
                    T.dw();
                }
            }
        }
    }

    public static void ae() {
        d var53;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[llllIlIlIl[1]];
                        nArray[T.llllIlIlIl[0]] = llllIlIlIl[16];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(llllIlIlIl[16], llllIlIlIl[1], llllIlIlIl[195]);
                            bu.add(d2);

                        }
                        int[] nArray2 = new int[llllIlIlIl[1]];
                        nArray2[T.llllIlIlIl[0]] = llllIlIlIl[18];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var53 = new DHelper(llllIlIlIl[18], llllIlIlIl[3], llllIlIlIl[196]);
                            bu.add(var53);

                        }
                        int[] nArray3 = new int[llllIlIlIl[1]];
                        nArray3[T.llllIlIlIl[0]] = llllIlIlIl[27];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var53 = new DHelper(llllIlIlIl[27], llllIlIlIl[3], llllIlIlIl[196]);
                            bu.add(var53);

                        }
                        int[] nArray4 = new int[llllIlIlIl[1]];
                        nArray4[T.llllIlIlIl[0]] = llllIlIlIl[13];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var53 = new DHelper(llllIlIlIl[13], llllIlIlIl[12], llllIlIlIl[197]);
                            bu.add(var53);

                        }
                        int[] nArray5 = new int[llllIlIlIl[1]];
                        nArray5[T.llllIlIlIl[0]] = llllIlIlIl[21];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var53 = new DHelper(llllIlIlIl[21], llllIlIlIl[12], llllIlIlIl[198]);
                            bu.add(var53);

                        }
                        int[] nArray6 = new int[llllIlIlIl[1]];
                        nArray6[T.llllIlIlIl[0]] = llllIlIlIl[15];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var53 = new DHelper(llllIlIlIl[15], llllIlIlIl[12], llllIlIlIl[198]);
                            bu.add(var53);

                        }
                        int[] nArray7 = new int[llllIlIlIl[1]];
                        nArray7[T.llllIlIlIl[0]] = llllIlIlIl[14];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            var53 = new DHelper(llllIlIlIl[14], llllIlIlIl[12], llllIlIlIl[198]);
                            bu.add(var53);

                        }
                        int[] nArray8 = new int[llllIlIlIl[1]];
                        nArray8[T.llllIlIlIl[0]] = llllIlIlIl[23];
                        if (!T.llIIllllllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[llllIlIlIl[1]];
                        nArray9[T.llllIlIlIl[0]] = llllIlIlIl[23];
                        if (!T.llIIllllllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[llllIlIlIl[1]];
                        nArray10[T.llllIlIlIl[0]] = llllIlIlIl[23];
                        if (!T.llIIllllllIll(Bank.getFirst((int[])nArray10).getQuantity(), llllIlIlIl[12])) break block16;
                    }
                    var53 = new DHelper(iT, llllIlIlIl[44], llllIlIlIl[199]);
                    bu.add(var53);

                }
                int[] nArray = new int[llllIlIlIl[1]];
                nArray[T.llllIlIlIl[0]] = llllIlIlIl[25];
                if (!T.llIIllllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[llllIlIlIl[1]];
                nArray11[T.llllIlIlIl[0]] = llllIlIlIl[25];
                if (!T.llIIllllllIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[llllIlIlIl[1]];
                nArray12[T.llllIlIlIl[0]] = llllIlIlIl[25];
                if (!T.llIIllllllIll(Bank.getFirst((int[])nArray12).getQuantity(), llllIlIlIl[12])) break block18;
            }
            var53 = new DHelper(llllIlIlIl[25], llllIlIlIl[12], llllIlIlIl[200]);
            bu.add(var53);

        }
        int[] nArray = new int[llllIlIlIl[1]];
        nArray[T.llllIlIlIl[0]] = llllIlIlIl[201];
        if (T.llIIlllllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var53 = new DHelper(llllIlIlIl[201], llllIlIlIl[1], llllIlIlIl[202]);
            bu.add(var53);

        }
        int[] nArray13 = new int[llllIlIlIl[1]];
        nArray13[T.llllIlIlIl[0]] = llllIlIlIl[19];
        if (T.llIIlllllllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            var53 = new DHelper(llllIlIlIl[19], llllIlIlIl[40], i.bp);
            bu.add(var53);

        }
    }

    @Override
    public int THelper() {
        try {
            T.ds();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return llllIlIlIl[186];
    }
}

