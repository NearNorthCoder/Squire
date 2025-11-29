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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class AEHelper
implements ac {
    
    public static  int mT;
    static  WorldArea mY;
    private static  WorldPoint mZ;
    public static  int mU;
    public static  List<d> bv;
    static  WorldArea mW;
    
    static  WorldArea mX;
    public static  int mV;
    public static  boolean bt;

    private static void lIlIlllIIIlll() {
        llIIlllIIl = new String[llIIlllIll[238]];
        ae.llIIlllIIl[ae.llIIlllIll[0]] = "Buying items";
        ae.llIIlllIIl[ae.llIIlllIll[1]] = "Finished buying items, switching back to agility";
        ae.llIIlllIIl[ae.llIIlllIll[3]] = "Navigating to bank";
        ae.llIIlllIIl[ae.llIIlllIll[10]] = "Handling banking";
        ae.llIIlllIIl[ae.llIIlllIll[17]] = "We are missing quest supplies, switching to BUYING";
        ae.llIIlllIIl[ae.llIIlllIll[2]] = "Vial";
        ae.llIIlllIIl[ae.llIIlllIll[20]] = "Vial";
        ae.llIIlllIIl[ae.llIIlllIll[22]] = "Drop";
        ae.llIIlllIIl[ae.llIIlllIll[24]] = "Drink";
        ae.llIIlllIIl[ae.llIIlllIll[26]] = "Eat";
        ae.llIIlllIIl[ae.llIIlllIll[12]] = "Nav to gnome course";
        ae.llIIlllIIl[ae.llIIlllIll[49]] = "Crossing log";
        ae.llIIlllIIl[ae.llIIlllIll[63]] = "Log balance";
        ae.llIIlllIIl[ae.llIIlllIll[64]] = "Walk-across";
        ae.llIIlllIIl[ae.llIIlllIll[53]] = "Climbing net";
        ae.llIIlllIIl[ae.llIIlllIll[38]] = "Obstacle net";
        ae.llIIlllIIl[ae.llIIlllIll[65]] = "Climb-over";
        ae.llIIlllIIl[ae.llIIlllIll[66]] = "Climbing branch";
        ae.llIIlllIIl[ae.llIIlllIll[54]] = "Tree branch";
        ae.llIIlllIIl[ae.llIIlllIll[67]] = "Climb";
        ae.llIIlllIIl[ae.llIIlllIll[40]] = "Crossing rope";
        ae.llIIlllIIl[ae.llIIlllIll[68]] = "Balancing rope";
        ae.llIIlllIIl[ae.llIIlllIll[61]] = "Walk-on";
        ae.llIIlllIIl[ae.llIIlllIll[69]] = "Climbing down";
        ae.llIIlllIIl[ae.llIIlllIll[70]] = "Tree branch";
        ae.llIIlllIIl[ae.llIIlllIll[41]] = "Climb-down";
        ae.llIIlllIIl[ae.llIIlllIll[71]] = "Climbing net";
        ae.llIIlllIIl[ae.llIIlllIll[72]] = "Obstacle net";
        ae.llIIlllIIl[ae.llIIlllIll[73]] = "Climb-over";
        ae.llIIlllIIl[ae.llIIlllIll[74]] = "Crossing pipe";
        ae.llIIlllIIl[ae.llIIlllIll[42]] = "Obstacle pipe";
        ae.llIIlllIIl[ae.llIIlllIll[75]] = "Squeeze-through";
        ae.llIIlllIIl[ae.llIIlllIll[95]] = "Nav to start";
        ae.llIIlllIIl[ae.llIIlllIll[97]] = "Mark of grace";
        ae.llIIlllIIl[ae.llIIlllIll[98]] = "Taking mark";
        ae.llIIlllIIl[ae.llIIlllIll[99]] = "Found mark on ground";
        ae.llIIlllIIl[ae.llIIlllIll[100]] = "Take";
        ae.llIIlllIIl[ae.llIIlllIll[101]] = "Starting course";
        ae.llIIlllIIl[ae.llIIlllIll[102]] = "Rough wall";
        ae.llIIlllIIl[ae.llIIlllIll[103]] = "Climb";
        ae.llIIlllIIl[ae.llIIlllIll[37]] = "Crossing clothes line";
        ae.llIIlllIIl[ae.llIIlllIll[105]] = "Clothes line";
        ae.llIIlllIIl[ae.llIIlllIll[106]] = "Cross";
        ae.llIIlllIIl[ae.llIIlllIll[107]] = "Leaping";
        ae.llIIlllIIl[ae.llIIlllIll[108]] = "Gap";
        ae.llIIlllIIl[ae.llIIlllIll[109]] = "Leap";
        ae.llIIlllIIl[ae.llIIlllIll[110]] = "Balancing";
        ae.llIIlllIIl[ae.llIIlllIll[111]] = "Wall";
        ae.llIIlllIIl[ae.llIIlllIll[112]] = "Balance";
        ae.llIIlllIIl[ae.llIIlllIll[113]] = "Jumping gap";
        ae.llIIlllIIl[ae.llIIlllIll[39]] = "Gap";
        ae.llIIlllIIl[ae.llIIlllIll[7]] = "Leap";
        ae.llIIlllIIl[ae.llIIlllIll[114]] = "Jumping gap 2";
        ae.llIIlllIIl[ae.llIIlllIll[116]] = "Leap";
        ae.llIIlllIIl[ae.llIIlllIll[117]] = "Jumping gap 3";
        ae.llIIlllIIl[ae.llIIlllIll[119]] = "Leap";
        ae.llIIlllIIl[ae.llIIlllIll[120]] = "Hurdle roof";
        ae.llIIlllIIl[ae.llIIlllIll[122]] = "Hurdle";
        ae.llIIlllIIl[ae.llIIlllIll[123]] = "Finishing course";
        ae.llIIlllIIl[ae.llIIlllIll[124]] = "Edge";
        ae.llIIlllIIl[ae.llIIlllIll[44]] = "Jump-off";
        ae.llIIlllIIl[ae.llIIlllIll[140]] = "Nav to canafis course";
        ae.llIIlllIIl[ae.llIIlllIll[6]] = "Nav to start";
        ae.llIIlllIIl[ae.llIIlllIll[141]] = "Starting course";
        ae.llIIlllIIl[ae.llIIlllIll[142]] = "Tall tree";
        ae.llIIlllIIl[ae.llIIlllIll[143]] = "Climb";
        ae.llIIlllIIl[ae.llIIlllIll[144]] = "Mark of grace";
        ae.llIIlllIIl[ae.llIIlllIll[145]] = "Taking mark";
        ae.llIIlllIIl[ae.llIIlllIll[146]] = "Found mark on ground";
        ae.llIIlllIIl[ae.llIIlllIll[147]] = "Take";
        ae.llIIlllIIl[ae.llIIlllIll[148]] = "Jumping gap 1";
        ae.llIIlllIIl[ae.llIIlllIll[149]] = "Jump";
        ae.llIIlllIIl[ae.llIIlllIll[150]] = "Jumping gap 2";
        ae.llIIlllIIl[ae.llIIlllIll[151]] = "Jump";
        ae.llIIlllIIl[ae.llIIlllIll[152]] = "Jumping gap 3";
        ae.llIIlllIIl[ae.llIIlllIll[153]] = "Jump";
        ae.llIIlllIIl[ae.llIIlllIll[154]] = "Jumping gap 4";
        ae.llIIlllIIl[ae.llIIlllIll[155]] = "Jump";
        ae.llIIlllIIl[ae.llIIlllIll[156]] = "Vaulting";
        ae.llIIlllIIl[ae.llIIlllIll[157]] = "Vault";
        ae.llIIlllIIl[ae.llIIlllIll[158]] = "Jumping gap 5";
        ae.llIIlllIIl[ae.llIIlllIll[159]] = "Jump";
        ae.llIIlllIIl[ae.llIIlllIll[160]] = "Jumping gap 6";
        ae.llIIlllIIl[ae.llIIlllIll[161]] = "Jump";
        ae.llIIlllIIl[ae.llIIlllIll[172]] = "Nav to canafis course";
        ae.llIIlllIIl[ae.llIIlllIll[173]] = "Nav to start";
        ae.llIIlllIIl[ae.llIIlllIll[174]] = "Starting course";
        ae.llIIlllIIl[ae.llIIlllIll[175]] = "Wall";
        ae.llIIlllIIl[ae.llIIlllIll[35]] = "Climb-up";
        ae.llIIlllIIl[ae.llIIlllIll[176]] = "Mark of grace";
        ae.llIIlllIIl[ae.llIIlllIll[177]] = "Taking mark";
        ae.llIIlllIIl[ae.llIIlllIll[178]] = "Found mark on ground";
        ae.llIIlllIIl[ae.llIIlllIll[179]] = "Take";
        ae.llIIlllIIl[ae.llIIlllIll[180]] = "Jumping gap 1";
        ae.llIIlllIIl[ae.llIIlllIll[79]] = "Jump";
        ae.llIIlllIIl[ae.llIIlllIll[181]] = "cross rope";
        ae.llIIlllIIl[ae.llIIlllIll[182]] = "Cross";
        ae.llIIlllIIl[ae.llIIlllIll[183]] = "Jumping gap 3";
        ae.llIIlllIIl[ae.llIIlllIll[184]] = "Jump";
        ae.llIIlllIIl[ae.llIIlllIll[185]] = "Jumping gap 4";
        ae.llIIlllIIl[ae.llIIlllIll[186]] = "Jump";
        ae.llIIlllIIl[ae.llIIlllIll[187]] = "Jumping Edge";
        ae.llIIlllIIl[ae.llIIlllIll[188]] = "Jump";
        ae.llIIlllIIl[ae.llIIlllIll[194]] = "Found mark on ground";
        ae.llIIlllIIl[ae.llIIlllIll[203]] = "Agility";
        ae.llIIlllIIl[ae.llIIlllIll[204]] = "passage";
        ae.llIIlllIIl[ae.llIIlllIll[205]] = "passage";
        ae.llIIlllIIl[ae.llIIlllIll[206]] = "passage";
        ae.llIIlllIIl[ae.llIIlllIll[207]] = "passage";
        ae.llIIlllIIl[ae.llIIlllIll[208]] = "Edge";
        ae.llIIlllIIl[ae.llIIlllIll[211]] = "Gap";
        ae.llIIlllIIl[ae.llIIlllIll[213]] = "Gap";
        ae.llIIlllIIl[ae.llIIlllIll[216]] = "Tightrope";
        ae.llIIlllIIl[ae.llIIlllIll[218]] = "Gap";
        ae.llIIlllIIl[ae.llIIlllIll[221]] = "Gap";
        ae.llIIlllIIl[ae.llIIlllIll[224]] = "Gap";
        ae.llIIlllIIl[ae.llIIlllIll[226]] = "Pole-vault";
        ae.llIIlllIIl[ae.llIIlllIll[227]] = "Gap";
        ae.llIIlllIIl[ae.llIIlllIll[230]] = "Gap";
        ae.llIIlllIIl[ae.llIIlllIll[232]] = "Gap";
        ae.llIIlllIIl[ae.llIIlllIll[233]] = "Gap";
    }

    /*
     * WARNING - void declaration
     */
    private static boolean eF() {
        WorldArea worldArea = new WorldArea(llIIlllIll[80], llIIlllIll[81], llIIlllIll[69], llIIlllIll[64], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[82], llIIlllIll[81], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[83], llIIlllIll[84], llIIlllIll[63], llIIlllIll[49], llIIlllIll[10]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[189], llIIlllIll[190], llIIlllIll[24], llIIlllIll[2], llIIlllIll[1]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[85], llIIlllIll[87], llIIlllIll[12], llIIlllIll[24], llIIlllIll[10]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[191], llIIlllIll[192], llIIlllIll[73], llIIlllIll[38], llIIlllIll[10]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[90], llIIlllIll[91], llIIlllIll[66], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[92], llIIlllIll[93], llIIlllIll[22], llIIlllIll[26], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[92], llIIlllIll[94], llIIlllIll[12], llIIlllIll[22], llIIlllIll[10]);
        WorldArea worldArea10 = new WorldArea(llIIlllIll[127], llIIlllIll[128], llIIlllIll[49], llIIlllIll[12], llIIlllIll[3]);
        WorldArea worldArea11 = new WorldArea(llIIlllIll[129], llIIlllIll[127], llIIlllIll[49], llIIlllIll[24], llIIlllIll[3]);
        WorldArea worldArea12 = new WorldArea(llIIlllIll[130], llIIlllIll[131], llIIlllIll[63], llIIlllIll[49], llIIlllIll[3]);
        WorldArea worldArea13 = new WorldArea(llIIlllIll[132], llIIlllIll[133], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea14 = new WorldArea(llIIlllIll[134], llIIlllIll[9], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea15 = new WorldArea(llIIlllIll[135], llIIlllIll[136], llIIlllIll[68], llIIlllIll[53], llIIlllIll[10]);
        WorldArea worldArea16 = new WorldArea(llIIlllIll[137], llIIlllIll[138], llIIlllIll[63], llIIlllIll[64], llIIlllIll[3]);
        WorldArea worldArea17 = new WorldArea(llIIlllIll[164], llIIlllIll[133], llIIlllIll[64], llIIlllIll[12], llIIlllIll[10]);
        WorldArea worldArea18 = new WorldArea(llIIlllIll[165], llIIlllIll[139], llIIlllIll[38], llIIlllIll[53], llIIlllIll[3]);
        WorldArea worldArea19 = new WorldArea(llIIlllIll[166], llIIlllIll[134], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea20 = new WorldArea(llIIlllIll[167], llIIlllIll[136], llIIlllIll[70], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea21 = new WorldArea(llIIlllIll[168], llIIlllIll[169], llIIlllIll[54], llIIlllIll[63], llIIlllIll[3]);
        WorldArea[] worldAreaArray = new WorldArea[llIIlllIll[68]];
        worldAreaArray[ae.llIIlllIll[0]] = worldArea;
        worldAreaArray[ae.llIIlllIll[1]] = worldArea2;
        worldAreaArray[ae.llIIlllIll[3]] = worldArea3;
        worldAreaArray[ae.llIIlllIll[10]] = worldArea4;
        worldAreaArray[ae.llIIlllIll[17]] = worldArea5;
        worldAreaArray[ae.llIIlllIll[2]] = worldArea6;
        worldAreaArray[ae.llIIlllIll[20]] = worldArea7;
        worldAreaArray[ae.llIIlllIll[22]] = worldArea8;
        worldAreaArray[ae.llIIlllIll[24]] = worldArea9;
        worldAreaArray[ae.llIIlllIll[26]] = worldArea10;
        worldAreaArray[ae.llIIlllIll[12]] = worldArea11;
        worldAreaArray[ae.llIIlllIll[49]] = worldArea12;
        worldAreaArray[ae.llIIlllIll[63]] = worldArea13;
        worldAreaArray[ae.llIIlllIll[64]] = worldArea14;
        worldAreaArray[ae.llIIlllIll[53]] = worldArea15;
        worldAreaArray[ae.llIIlllIll[38]] = worldArea16;
        worldAreaArray[ae.llIIlllIll[65]] = worldArea17;
        worldAreaArray[ae.llIIlllIll[66]] = worldArea18;
        worldAreaArray[ae.llIIlllIll[54]] = worldArea19;
        worldAreaArray[ae.llIIlllIll[67]] = worldArea20;
        worldAreaArray[ae.llIIlllIll[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[llIIlllIll[1]];
        nArray[ae.llIIlllIll[0]] = llIIlllIll[193];
        if (ae.lIlIlllIIllIl(TileItems.getNearest((int[])nArray))) {
            void var1;
            System.out.println(llIIlllIIl[llIIlllIll[194]]);
            int var2 = llIIlllIll[0];
            while (ae.lIlIlllIIlIll(var2, ((void)var1).length)) {
                int[] nArray2 = new int[llIIlllIll[1]];
                nArray2[ae.llIIlllIll[0]] = llIIlllIll[193];
                if (ae.lIlIlllIIlIlI(var1[var2].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIlIlI(var1[var2].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llIIlllIll[1];
                }
                ++var2;

                if (2 > 1) continue;
                return false;
            }
        }
        return llIIlllIll[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void eE() {
        void var3;
        void var4;
        void var5;
        void var6;
        void var7;
        WorldArea worldArea = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[1]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[3]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[162], llIIlllIll[163], llIIlllIll[111], llIIlllIll[111], llIIlllIll[10]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[164], llIIlllIll[133], llIIlllIll[64], llIIlllIll[12], llIIlllIll[10]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[165], llIIlllIll[139], llIIlllIll[38], llIIlllIll[53], llIIlllIll[3]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[166], llIIlllIll[134], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[167], llIIlllIll[136], llIIlllIll[70], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[168], llIIlllIll[169], llIIlllIll[54], llIIlllIll[63], llIIlllIll[3]);
        WorldPoint worldPoint = new WorldPoint(llIIlllIll[170], llIIlllIll[171], llIIlllIll[0]);
        if (ae.lIlIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ae.lIlIlllIIllII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[172]];
            Movement.walkTo((WorldPoint)var3);

            Time.sleepTicks((int)llIIlllIll[1]);

        }
        if (ae.lIlIlllIIlIlI(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (ae.lIlIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[173]];
                Movement.walkTo((WorldPoint)var3);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var3), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[174]];
                int var8 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[175]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[35]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var8)) {
                        bl = llIIlllIll[1];

                        if (((0xB2 ^ 0x86 ^ (0x37 ^ 0xF)) & (0x2F ^ 0x53 ^ (0xF4 ^ 0x84) ^ -1)) != 0) {
                            return ((0x37 ^ 0x55 ^ (0x22 ^ 0x72)) & (0x7F ^ 4 ^ (0x51 ^ 0x18) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
        }
        String[] stringArray = new String[llIIlllIll[1]];
        stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[176]];
        TileItem var8 = TileItems.getNearest((String[])stringArray);
        if (ae.lIlIlllIIllIl(var8) && ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[177]];
            System.out.println(llIIlllIIl[llIIlllIll[178]]);
            var8.interact(llIIlllIIl[llIIlllIll[179]]);
            Time.sleepTicks((int)llIIlllIll[10]);

        }
        if (ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
            void var9;
            void var10;
            void var11;
            void var12;
            int var13;
            TileObject var14;
            void var15;
            if (ae.lIlIlllIIlIlI(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var14 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[218]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[219], llIIlllIll[220], llIIlllIll[10])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    if (((0x62 ^ 0x42) & ~(0xBF ^ 0x9F)) > (0x41 ^ 0x45)) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                var13 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[180]];
                var14.interact(llIIlllIIl[llIIlllIll[79]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var13)) {
                        bl = llIIlllIll[1];

                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var14 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[216]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[217], llIIlllIll[128], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    if (((0xA9 ^ 0x94 ^ 111 + 30 - 48 + 34) & (0x14 ^ 1 ^ (0x1E ^ 0x49) ^ -1)) != 0) {
                        return ((0x88 ^ 0x85 ^ (0x99 ^ 0x8A)) & (0xA3 ^ 0x85 ^ (0xA1 ^ 0x99) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[181]];
                var13 = Skills.getExperience((Skill)Skill.AGILITY);
                var14.interact(llIIlllIIl[llIIlllIll[182]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var13)) {
                        bl = llIIlllIll[1];

                        if (2 < ((0x72 ^ 0x30) & ~(0x13 ^ 0x51))) {
                            return false;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var14 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[213]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[214], llIIlllIll[215], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    if (-(0x48 ^ 0x4C) >= 0) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[183]];
                var13 = Skills.getExperience((Skill)Skill.AGILITY);
                var14.interact(llIIlllIIl[llIIlllIll[184]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var13)) {
                        bl = llIIlllIll[1];

                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var14 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[211]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[209], llIIlllIll[212], llIIlllIll[10])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    if (((0xA5 ^ 0x80) & ~(0x74 ^ 0x51)) > 0) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[185]];
                var13 = Skills.getExperience((Skill)Skill.AGILITY);
                var14.interact(llIIlllIIl[llIIlllIll[186]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var13)) {
                        bl = llIIlllIll[1];

                        if (3 <= 2) {
                            return false;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var14 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[208]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[209], llIIlllIll[210], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    if ((0xEE ^ 0x97 ^ (3 ^ 0x7E)) <= 0) {
                        return ((70 + 99 - 93 + 51 ^ (0xA9 ^ 0xB7)) & (0x97 ^ 0x81 ^ (0xDC ^ 0xAB) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[187]];
                var13 = Skills.getExperience((Skill)Skill.AGILITY);
                var14.interact(llIIlllIIl[llIIlllIll[188]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var13)) {
                        bl = llIIlllIll[1];

                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
        }
    }

    @Override
    public String ag() {
        return llIIlllIIl[llIIlllIll[203]];
    }

    private static boolean lIlIlllIIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlllIIllIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private static void eB() {
        WorldArea worldArea = new WorldArea(llIIlllIll[46], llIIlllIll[47], llIIlllIll[12], llIIlllIll[20], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[46], llIIlllIll[48], llIIlllIll[49], llIIlllIll[24], llIIlllIll[0]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[46], llIIlllIll[50], llIIlllIll[49], llIIlllIll[24], llIIlllIll[1]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[51], llIIlllIll[52], llIIlllIll[53], llIIlllIll[54], llIIlllIll[3]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[55], llIIlllIll[56], llIIlllIll[24], llIIlllIll[12], llIIlllIll[3]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[57], llIIlllIll[58], llIIlllIll[49], llIIlllIll[12], llIIlllIll[0]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[59], llIIlllIll[60], llIIlllIll[12], llIIlllIll[20], llIIlllIll[0]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[46], llIIlllIll[47], llIIlllIll[61], llIIlllIll[20], llIIlllIll[0]);
        if (ae.lIlIlllIIllII(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[12]];
            e.b(mZ);
            Time.sleepTicks((int)llIIlllIll[1]);

        }
        if ((!ae.lIlIlllIIllII(mW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !ae.lIlIlllIIllII(mX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || ae.lIlIlllIIlIlI(mY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && ae.lIlIlllIlIIIl(Players.getLocal().getAnimation(), llIIlllIll[62]) && ae.lIlIlllIIllII(Players.getLocal().isMoving() ? 1 : 0)) {
            void var16;
            void var17;
            void var18;
            void var19;
            void var20;
            void var21;
            void var22;
            if (ae.lIlIlllIIlIlI(var22.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[49]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[63]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[64]]);
                Time.sleepTicks((int)llIIlllIll[3]);

            }
            if (ae.lIlIlllIIlIlI(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[53]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[38]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[65]]);
                Time.sleepTicks((int)llIIlllIll[3]);

            }
            if (ae.lIlIlllIIlIlI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[66]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[54]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[67]]);
                Time.sleepTicks((int)llIIlllIll[3]);

            }
            if (ae.lIlIlllIIlIlI(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[40]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[68]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[61]]);
                Time.sleepTicks((int)llIIlllIll[2]);

            }
            if (ae.lIlIlllIIlIlI(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[69]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[70]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[41]]);
                Time.sleepTicks((int)llIIlllIll[17]);

            }
            if (ae.lIlIlllIIlIlI(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[71]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[72]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[73]]);
                Time.sleepTicks((int)llIIlllIll[10]);

            }
            if (ae.lIlIlllIIlIlI(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[74]];
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[42]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[75]]);
                Time.sleepTicks((int)llIIlllIll[17]);

            }
        }
    }

    private static boolean lIlIlllIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    public static void eA() {
        if (ae.lIlIlllIIlIlI(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[0]];
            b.a(bv);
            if (ae.lIlIlllIIlIll(bv.size(), llIIlllIll[1])) {
                System.out.println(llIIlllIIl[llIIlllIll[1]]);
                bt = llIIlllIll[0];
            }
        }
        if (ae.lIlIlllIIllII(bt ? 1 : 0) && ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[2])) {
            if (ae.lIlIlllIIllII(ae.an() ? 1 : 0)) {
                BankLocation var23 = BankLocation.getNearest();
                if (ae.lIlIlllIIllIl(var23) && ae.lIlIlllIIllII(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[3]];
                    WorldArea var24 = new WorldArea(llIIlllIll[4], llIIlllIll[5], llIIlllIll[6], llIIlllIll[7], llIIlllIll[0]);
                    if (ae.lIlIlllIIlIlI(var24.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint var25 = new WorldPoint(llIIlllIll[8], llIIlllIll[9], llIIlllIll[0]);
                        if (ae.lIlIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo(var25), llIIlllIll[10])) {
                            Movement.walkTo((WorldPoint)var25);

                            Time.sleepTicks((int)llIIlllIll[1]);

                        }
                    }
                    a.a(var23);
                }
                if (ae.lIlIlllIIllIl(var23) && ae.lIlIlllIIlIlI(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[10]];
                    if (ae.lIlIlllIIllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlllIll[11]);

                    }
                    if (ae.lIlIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        if (ae.lIlIlllIIllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIIlllIll[1]);

                        }
                        if (ae.lIlIlllIIllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIIlllIll[3]);

                        }
                    }
                    int[] nArray = new int[llIIlllIll[12]];
                    nArray[ae.llIIlllIll[0]] = llIIlllIll[13];
                    nArray[ae.llIIlllIll[1]] = llIIlllIll[14];
                    nArray[ae.llIIlllIll[3]] = llIIlllIll[15];
                    nArray[ae.llIIlllIll[10]] = llIIlllIll[16];
                    nArray[ae.llIIlllIll[17]] = llIIlllIll[18];
                    nArray[ae.llIIlllIll[2]] = llIIlllIll[19];
                    nArray[ae.llIIlllIll[20]] = llIIlllIll[21];
                    nArray[ae.llIIlllIll[22]] = llIIlllIll[23];
                    nArray[ae.llIIlllIll[24]] = llIIlllIll[25];
                    nArray[ae.llIIlllIll[26]] = llIIlllIll[27];
                    if (ae.lIlIlllIIllII(e.c(nArray) ? 1 : 0)) {
                        ae.Q();
                        System.out.println(llIIlllIIl[llIIlllIll[17]]);
                        bt = llIIlllIll[1];
                        return;
                    }
                    int[] nArray2 = new int[llIIlllIll[12]];
                    nArray2[ae.llIIlllIll[0]] = llIIlllIll[13];
                    nArray2[ae.llIIlllIll[1]] = llIIlllIll[14];
                    nArray2[ae.llIIlllIll[3]] = llIIlllIll[15];
                    nArray2[ae.llIIlllIll[10]] = llIIlllIll[16];
                    nArray2[ae.llIIlllIll[17]] = llIIlllIll[18];
                    nArray2[ae.llIIlllIll[2]] = llIIlllIll[19];
                    nArray2[ae.llIIlllIll[20]] = llIIlllIll[21];
                    nArray2[ae.llIIlllIll[22]] = llIIlllIll[23];
                    nArray2[ae.llIIlllIll[24]] = llIIlllIll[25];
                    nArray2[ae.llIIlllIll[26]] = llIIlllIll[27];
                    if (ae.lIlIlllIIlIlI(e.c(nArray2) ? 1 : 0)) {
                        a.a(llIIlllIll[28], llIIlllIll[1]);
                        a.a(llIIlllIll[29], llIIlllIll[1]);
                        a.a(llIIlllIll[30], llIIlllIll[1]);
                        a.a(llIIlllIll[31], llIIlllIll[1]);
                        a.a(llIIlllIll[32], llIIlllIll[1]);
                        a.a(llIIlllIll[33], llIIlllIll[1]);
                        a.a(llIIlllIll[34], llIIlllIll[1]);
                        int[] nArray3 = new int[llIIlllIll[1]];
                        nArray3[ae.llIIlllIll[0]] = llIIlllIll[28];
                        if (ae.lIlIlllIIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llIIlllIll[1]];
                            nArray4[ae.llIIlllIll[0]] = llIIlllIll[28];
                            if (ae.lIlIlllIIllII(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[llIIlllIll[1]];
                                nArray5[ae.llIIlllIll[0]] = llIIlllIll[28];
                                if (ae.lIlIlllIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(llIIlllIll[35], llIIlllIll[1]);
                                }
                            }
                        }
                        a.a(llIIlllIll[18], llIIlllIll[1]);
                        e.l(llIIlllIll[28]);
                        e.l(llIIlllIll[29]);
                        e.l(llIIlllIll[30]);
                        e.l(llIIlllIll[31]);
                        e.l(llIIlllIll[32]);
                        Time.sleepTicks((int)llIIlllIll[1]);

                        e.l(llIIlllIll[34]);
                        e.l(llIIlllIll[36]);
                        e.l(llIIlllIll[33]);
                        e.l(llIIlllIll[35]);
                        e.l(llIIlllIll[18]);
                        Time.sleepTicks((int)llIIlllIll[10]);

                        if (ae.lIlIlllIIllII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llIIlllIll[20]);

                        }
                        if (ae.lIlIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                            if (ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[37])) {
                                a.a(llIIlllIll[13], llIIlllIll[12]);
                                a.a(llIIlllIll[14], llIIlllIll[12]);
                                a.a(llIIlllIll[21], llIIlllIll[12]);
                                a.a(llIIlllIll[15], llIIlllIll[12]);
                                a.b(f.bk, llIIlllIll[1]);
                                a.a(llIIlllIll[27], llIIlllIll[1]);
                                a.a(llIIlllIll[19], llIIlllIll[2]);
                                a.a(llIIlllIll[23], llIIlllIll[38]);
                            }
                            if (ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[37])) {
                                a.a(llIIlllIll[13], llIIlllIll[12]);
                                a.a(llIIlllIll[21], llIIlllIll[12]);
                                a.a(llIIlllIll[25], llIIlllIll[12]);
                                a.b(f.bk, llIIlllIll[1]);
                                a.a(llIIlllIll[27], llIIlllIll[1]);
                                a.a(llIIlllIll[19], llIIlllIll[24]);
                                a.a(llIIlllIll[23], llIIlllIll[12]);
                            }
                        }
                    }
                }
            }
            if (ae.lIlIlllIIlIlI(ae.an() ? 1 : 0)) {
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[2]];
                if (ae.lIlIlllIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIIlllIll[1]];
                    stringArray2[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[20]];
                    Inventory.getFirst((String[])stringArray2).interact(llIIlllIIl[llIIlllIll[22]]);
                }
                if (ae.lIlIlllIIlIlI(Inventory.contains((int[])f.ba) ? 1 : 0) && ae.lIlIlllIIlIll(Movement.getRunEnergy(), llIIlllIll[39])) {
                    Inventory.getFirst((int[])f.ba).interact(llIIlllIIl[llIIlllIll[24]]);
                    Time.sleepTicks((int)llIIlllIll[1]);

                }
                if (ae.lIlIlllIIlllI(Combat.getMissingHealth(), llIIlllIll[40])) {
                    int[] nArray = new int[llIIlllIll[1]];
                    nArray[ae.llIIlllIll[0]] = llIIlllIll[23];
                    if (ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llIIlllIll[1]];
                        nArray6[ae.llIIlllIll[0]] = llIIlllIll[23];
                        Inventory.getFirst((int[])nArray6).interact(llIIlllIIl[llIIlllIll[26]]);
                        Time.sleepTicks((int)llIIlllIll[3]);

                    }
                }
                if (ae.lIlIlllIIlllI(Movement.getRunEnergy(), llIIlllIll[41]) && ae.lIlIlllIIllII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[42])) {
                    ae.eB();
                }
                if ((!ae.lIlIlllIlIIII(e.j(llIIlllIll[43]), llIIlllIll[44]) || ae.lIlIlllIIlIll(e.j(llIIlllIll[45]), llIIlllIll[2])) && ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[42]) && ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[44])) {
                    ae.eC();
                }
                if (ae.lIlIlllIlIIII(e.j(llIIlllIll[43]), llIIlllIll[44]) && ae.lIlIlllIlIIII(e.j(llIIlllIll[45]), llIIlllIll[2])) {
                    if (ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[42]) && ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[37])) {
                        ae.eC();
                    }
                    if (ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[37]) && ae.lIlIlllIIlIll(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[44])) {
                        ae.eD();
                    }
                }
                if (ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[44])) {
                    ae.eE();
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void eD() {
        void var26;
        void var27;
        void var28;
        void var29;
        void var30;
        WorldArea worldArea = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[0]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[1]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[3]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[125], llIIlllIll[126], llIIlllIll[112], llIIlllIll[107], llIIlllIll[10]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[127], llIIlllIll[128], llIIlllIll[49], llIIlllIll[12], llIIlllIll[3]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[129], llIIlllIll[127], llIIlllIll[49], llIIlllIll[24], llIIlllIll[3]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[130], llIIlllIll[131], llIIlllIll[63], llIIlllIll[49], llIIlllIll[3]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[132], llIIlllIll[133], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[134], llIIlllIll[9], llIIlllIll[49], llIIlllIll[26], llIIlllIll[3]);
        WorldArea worldArea10 = new WorldArea(llIIlllIll[135], llIIlllIll[136], llIIlllIll[68], llIIlllIll[53], llIIlllIll[10]);
        WorldArea worldArea11 = new WorldArea(llIIlllIll[137], llIIlllIll[138], llIIlllIll[63], llIIlllIll[64], llIIlllIll[3]);
        WorldPoint worldPoint = new WorldPoint(llIIlllIll[137], llIIlllIll[139], llIIlllIll[0]);
        if (ae.lIlIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ae.lIlIlllIIllII(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(var28.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[140]];
            Movement.walkTo((WorldPoint)var26);

            Time.sleepTicks((int)llIIlllIll[1]);

        }
        if (ae.lIlIlllIIlIlI(var30.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (ae.lIlIlllIIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var26), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[6]];
                Movement.walkTo((WorldPoint)var26);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var26), llIIlllIll[20])) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[141]];
                int var31 = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llIIlllIll[1]];
                stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[142]];
                TileObjects.getNearest((String[])stringArray).interact(llIIlllIIl[llIIlllIll[143]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var31)) {
                        bl = llIIlllIll[1];

                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
        }
        String[] stringArray = new String[llIIlllIll[1]];
        stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[144]];
        TileItem var31 = TileItems.getNearest((String[])stringArray);
        if (ae.lIlIlllIIllIl(var31) && ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[145]];
            System.out.println(llIIlllIIl[llIIlllIll[146]]);
            var31.interact(llIIlllIIl[llIIlllIll[147]]);
            Time.sleepTicks((int)llIIlllIll[10]);

        }
        if (ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
            void var32;
            void var33;
            void var34;
            void var35;
            void var36;
            void var37;
            int var38;
            TileObject var39;
            void var40;
            if (ae.lIlIlllIIlIlI(var40.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[233]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[234], llIIlllIll[131], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    if (2 < ((0xC7 ^ 0xA6) & ~(0x18 ^ 0x79))) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[148]];
                var39.interact(llIIlllIIl[llIIlllIll[149]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIlllIll[1];

                        if (3 <= 1) {
                            return false;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(var37.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[232]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[131], llIIlllIll[225], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    if ((44 + 7 - 36 + 129 ^ 54 + 143 - 171 + 122) > (0x25 ^ 0x61 ^ (0x67 ^ 0x27))) {
                        return ((42 + 219 - 118 + 77 ^ 152 + 5 - 118 + 119) & (0xE ^ 0x14 ^ (0xDD ^ 0x85) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[150]];
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                var39.interact(llIIlllIIl[llIIlllIll[151]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIlllIll[1];

                        if (((0x8D ^ 0x88 ^ (0x6F ^ 0x35)) & (64 + 124 - -4 + 56 ^ 97 + 0 - 62 + 132 ^ -1)) <= -1) {
                            return ((0x8D ^ 0xB2 ^ (0x8D ^ 0xBC)) & (0xA6 ^ 0xC3 ^ (0xA ^ 0x61) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(var36.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[230]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[139], llIIlllIll[231], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    if (2 > (0xD9 ^ 0xA2 ^ 54 + 91 - 96 + 78)) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[152]];
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                var39.interact(llIIlllIIl[llIIlllIll[153]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIlllIll[1];

                        if (((0x70 ^ 0x75) & ~(0xB5 ^ 0xB0)) != 0) {
                            return false;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(var35.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[227]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[228], llIIlllIll[229], llIIlllIll[10])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    if (1 < ((0x6A ^ 0x23 ^ (0x19 ^ 0x5B)) & (133 + 29 - 37 + 81 ^ 181 + 121 - 108 + 3 ^ -1))) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[154]];
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                var39.interact(llIIlllIIl[llIIlllIll[155]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIlllIll[1];

                        if (((175 + 110 - 81 + 13 ^ 33 + 85 - -22 + 6) & (0x38 ^ 0x73 ^ (6 ^ 0x38) & ~(0x8F ^ 0xB1) ^ -1)) > 1) {
                            return ((0xDB ^ 0xBC ^ (2 ^ 0x4A)) & (0xC4 ^ 0xAB ^ (0xEA ^ 0xAA) ^ -1) & ((0xFF ^ 0x8B ^ (0xE0 ^ 0x8E)) & (96 + 16 - 4 + 60 ^ 68 + 174 - 103 + 39 ^ -1) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(var34.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[226]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[9], llIIlllIll[130], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    if (2 == 0) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[156]];
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                var39.interact(llIIlllIIl[llIIlllIll[157]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIlllIll[1];

                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(var33.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[224]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[225], llIIlllIll[215], llIIlllIll[10])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[158]];
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                var39.interact(llIIlllIIl[llIIlllIll[159]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIlllIll[1];

                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
            if (ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                return;
            }
            if (ae.lIlIlllIIlIlI(var32.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllIl(var39 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (ae.lIlIlllIIlIlI(tileObject.getName().contains(llIIlllIIl[llIIlllIll[221]]) ? 1 : 0) && ae.lIlIlllIlIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIIlllIll[222], llIIlllIll[223], llIIlllIll[3])), llIIlllIll[3])) {
                    n2 = llIIlllIll[1];

                    if ((0x89 ^ 0x8D) < 0) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIll[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[160]];
                var38 = Skills.getExperience((Skill)Skill.AGILITY);
                var39.interact(llIIlllIIl[llIIlllIll[161]]);
                Time.sleepTicks((int)e.c(llIIlllIll[1], llIIlllIll[3]));

                Time.sleepUntil(() -> {
                    boolean bl;
                    if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var38)) {
                        bl = llIIlllIll[1];

                        if (-1 >= ((191 + 122 - 135 + 51 ^ 133 + 108 - 217 + 139) & (36 + 174 - 159 + 181 ^ 35 + 38 - -54 + 47 ^ -1))) {
                            return (((0xE0 ^ 0xB5) & ~(0xC8 ^ 0x9D) ^ (0x97 ^ 0xB5)) & (0x97 ^ 0x80 ^ (0xF3 ^ 0xC6) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIlllIll[0];
                    }
                    return bl;
                }, (int)llIIlllIll[104]);

                Time.sleepTicks((int)llIIlllIll[1]);

            }
        }
    }

    @Override
    public boolean AEHelper() {
        return llIIlllIll[0];
    }

    private static boolean lIlIlllIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        if (ae.lIlIlllIlIIII(Skills.getBoostedLevel((Skill)Skill.AGILITY), llIIlllIll[37])) {
            int n3;
            int[] nArray = new int[llIIlllIll[1]];
            nArray[ae.llIIlllIll[0]] = llIIlllIll[13];
            if (ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIlllIll[1]];
                nArray2[ae.llIIlllIll[0]] = llIIlllIll[25];
                if (ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIIlllIll[1]];
                    nArray3[ae.llIIlllIll[0]] = llIIlllIll[23];
                    if (!(!ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0) || ae.lIlIlllIIllII(Inventory.contains(item -> item.getName().contains(llIIlllIIl[llIIlllIll[207]])) ? 1 : 0) && !ae.lIlIlllIIlIlI(Equipment.contains(item -> item.getName().contains(llIIlllIIl[llIIlllIll[206]])) ? 1 : 0) || ae.lIlIlllIIllII(Inventory.contains((int[])f.bk) ? 1 : 0) && !ae.lIlIlllIIlIlI(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                        n3 = llIIlllIll[1];

                        if (null == null) return n3 != 0;
                        return ((0x78 ^ 0x17 ^ (0x1C ^ 0x55)) & (120 + 97 - 94 + 5 ^ 31 + 132 - 99 + 102 ^ -1)) != 0;
                    }
                }
            }
            n3 = llIIlllIll[0];
            return n3 != 0;
        }
        int[] nArray = new int[llIIlllIll[1]];
        nArray[ae.llIIlllIll[0]] = llIIlllIll[13];
        if (ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llIIlllIll[1]];
            nArray4[ae.llIIlllIll[0]] = llIIlllIll[15];
            if (ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[llIIlllIll[1]];
                nArray5[ae.llIIlllIll[0]] = llIIlllIll[14];
                if (!(!ae.lIlIlllIIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0) || ae.lIlIlllIIllII(Inventory.contains(item -> item.getName().contains(llIIlllIIl[llIIlllIll[205]])) ? 1 : 0) && !ae.lIlIlllIIlIlI(Equipment.contains(item -> item.getName().contains(llIIlllIIl[llIIlllIll[204]])) ? 1 : 0) || ae.lIlIlllIIllII(Inventory.contains((int[])f.bk) ? 1 : 0) && !ae.lIlIlllIIlIlI(Equipment.contains((int[])f.bk) ? 1 : 0))) {
                    n2 = llIIlllIll[1];

                    if (null == null) return n2 != 0;
                    return ((19 + 6 - 2 + 105 ^ 72 + 3 - 52 + 135) & (0x89 ^ 0x9A ^ (0x39 ^ 0x34) ^ -1)) != 0;
                }
            }
        }
        n2 = llIIlllIll[0];
        return n2 != 0;
    }

    public static void Q() {
        d var41;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[llIIlllIll[1]];
                        nArray[ae.llIIlllIll[0]] = llIIlllIll[16];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(llIIlllIll[16], llIIlllIll[1], llIIlllIll[195]);
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[llIIlllIll[1]];
                        nArray2[ae.llIIlllIll[0]] = llIIlllIll[18];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var41 = new DHelper(llIIlllIll[18], llIIlllIll[3], llIIlllIll[196]);
                            bv.add(var41);

                        }
                        int[] nArray3 = new int[llIIlllIll[1]];
                        nArray3[ae.llIIlllIll[0]] = llIIlllIll[27];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var41 = new DHelper(llIIlllIll[27], llIIlllIll[3], llIIlllIll[196]);
                            bv.add(var41);

                        }
                        int[] nArray4 = new int[llIIlllIll[1]];
                        nArray4[ae.llIIlllIll[0]] = llIIlllIll[13];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var41 = new DHelper(llIIlllIll[13], llIIlllIll[12], llIIlllIll[197]);
                            bv.add(var41);

                        }
                        int[] nArray5 = new int[llIIlllIll[1]];
                        nArray5[ae.llIIlllIll[0]] = llIIlllIll[21];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var41 = new DHelper(llIIlllIll[21], llIIlllIll[12], llIIlllIll[198]);
                            bv.add(var41);

                        }
                        int[] nArray6 = new int[llIIlllIll[1]];
                        nArray6[ae.llIIlllIll[0]] = llIIlllIll[15];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            var41 = new DHelper(llIIlllIll[15], llIIlllIll[12], llIIlllIll[198]);
                            bv.add(var41);

                        }
                        int[] nArray7 = new int[llIIlllIll[1]];
                        nArray7[ae.llIIlllIll[0]] = llIIlllIll[14];
                        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            var41 = new DHelper(llIIlllIll[14], llIIlllIll[12], llIIlllIll[198]);
                            bv.add(var41);

                        }
                        int[] nArray8 = new int[llIIlllIll[1]];
                        nArray8[ae.llIIlllIll[0]] = llIIlllIll[23];
                        if (!ae.lIlIlllIIlIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[llIIlllIll[1]];
                        nArray9[ae.llIIlllIll[0]] = llIIlllIll[23];
                        if (!ae.lIlIlllIIlIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[llIIlllIll[1]];
                        nArray10[ae.llIIlllIll[0]] = llIIlllIll[23];
                        if (!ae.lIlIlllIIlIll(Bank.getFirst((int[])nArray10).getQuantity(), llIIlllIll[12])) break block16;
                    }
                    var41 = new DHelper(mU, llIIlllIll[44], llIIlllIll[199]);
                    bv.add(var41);

                }
                int[] nArray = new int[llIIlllIll[1]];
                nArray[ae.llIIlllIll[0]] = llIIlllIll[25];
                if (!ae.lIlIlllIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[llIIlllIll[1]];
                nArray11[ae.llIIlllIll[0]] = llIIlllIll[25];
                if (!ae.lIlIlllIIlIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[llIIlllIll[1]];
                nArray12[ae.llIIlllIll[0]] = llIIlllIll[25];
                if (!ae.lIlIlllIIlIll(Bank.getFirst((int[])nArray12).getQuantity(), llIIlllIll[12])) break block18;
            }
            var41 = new DHelper(llIIlllIll[25], llIIlllIll[12], llIIlllIll[200]);
            bv.add(var41);

        }
        int[] nArray = new int[llIIlllIll[1]];
        nArray[ae.llIIlllIll[0]] = llIIlllIll[201];
        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            var41 = new DHelper(llIIlllIll[201], llIIlllIll[1], llIIlllIll[202]);
            bv.add(var41);

        }
        int[] nArray13 = new int[llIIlllIll[1]];
        nArray13[ae.llIIlllIll[0]] = llIIlllIll[19];
        if (ae.lIlIlllIIllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            var41 = new DHelper(llIIlllIll[19], llIIlllIll[40], j.cf);
            bv.add(var41);

        }
    }

    /*
     * WARNING - void declaration
     */
    private static void eC() {
        WorldArea worldArea = new WorldArea(llIIlllIll[76], llIIlllIll[77], llIIlllIll[78], llIIlllIll[79], llIIlllIll[1]);
        WorldArea worldArea2 = new WorldArea(llIIlllIll[76], llIIlllIll[77], llIIlllIll[78], llIIlllIll[79], llIIlllIll[3]);
        WorldArea worldArea3 = new WorldArea(llIIlllIll[76], llIIlllIll[77], llIIlllIll[78], llIIlllIll[79], llIIlllIll[10]);
        WorldArea worldArea4 = new WorldArea(llIIlllIll[80], llIIlllIll[81], llIIlllIll[69], llIIlllIll[64], llIIlllIll[0]);
        WorldArea worldArea5 = new WorldArea(llIIlllIll[82], llIIlllIll[81], llIIlllIll[12], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea6 = new WorldArea(llIIlllIll[83], llIIlllIll[84], llIIlllIll[63], llIIlllIll[49], llIIlllIll[10]);
        WorldArea worldArea7 = new WorldArea(llIIlllIll[85], llIIlllIll[86], llIIlllIll[26], llIIlllIll[22], llIIlllIll[1]);
        WorldArea worldArea8 = new WorldArea(llIIlllIll[85], llIIlllIll[87], llIIlllIll[12], llIIlllIll[24], llIIlllIll[10]);
        WorldArea worldArea9 = new WorldArea(llIIlllIll[88], llIIlllIll[89], llIIlllIll[75], llIIlllIll[40], llIIlllIll[10]);
        WorldArea worldArea10 = new WorldArea(llIIlllIll[90], llIIlllIll[91], llIIlllIll[66], llIIlllIll[64], llIIlllIll[10]);
        WorldArea worldArea11 = new WorldArea(llIIlllIll[92], llIIlllIll[93], llIIlllIll[22], llIIlllIll[26], llIIlllIll[10]);
        WorldArea worldArea12 = new WorldArea(llIIlllIll[92], llIIlllIll[94], llIIlllIll[12], llIIlllIll[22], llIIlllIll[10]);
        if (ae.lIlIlllIIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllIIl[llIIlllIll[95]];
            if (ae.lIlIlllIIlIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (ae.lIlIlllIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(llIIlllIll[96], llIIlllIll[52], llIIlllIll[0]));

            Time.sleepTicks((int)llIIlllIll[1]);

        }
        if (ae.lIlIlllIlIIIl(Players.getLocal().getAnimation(), llIIlllIll[62]) && ae.lIlIlllIIllII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[llIIlllIll[1]];
            stringArray[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[97]];
            TileItem var42 = TileItems.getNearest((String[])stringArray);
            if (ae.lIlIlllIIllIl(var42) && ae.lIlIlllIIlIlI(ae.eF() ? 1 : 0)) {
                AccBuilderSotf.c = llIIlllIIl[llIIlllIll[98]];
                System.out.println(llIIlllIIl[llIIlllIll[99]]);
                var42.interact(llIIlllIIl[llIIlllIll[100]]);
                Time.sleepTicks((int)llIIlllIll[10]);

            }
            if (ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                void var43;
                void var44;
                void var45;
                void var46;
                void var47;
                void var48;
                void var49;
                void var50;
                int var51;
                void var52;
                if (ae.lIlIlllIIlIlI(var52.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[101]];
                    var51 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[llIIlllIll[1]];
                    stringArray2[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(llIIlllIIl[llIIlllIll[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var51)) {
                            bl = llIIlllIll[1];

                            if (3 < 0) {
                                return false;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);

                    Time.sleepTicks((int)llIIlllIll[1]);

                }
                if (ae.lIlIlllIIlIlI(var50.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[37]];
                    var51 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[llIIlllIll[1]];
                    stringArray3[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(llIIlllIIl[llIIlllIll[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var51)) {
                            bl = llIIlllIll[1];

                            if (3 == 0) {
                                return (1 & ~1) != 0;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);

                    Time.sleepTicks((int)llIIlllIll[1]);

                }
                if (ae.lIlIlllIIlIlI(var49.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[107]];
                    var51 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[llIIlllIll[1]];
                    stringArray4[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(llIIlllIIl[llIIlllIll[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var51)) {
                            bl = llIIlllIll[1];

                            if ((0x70 ^ 0x1B ^ (7 ^ 0x68)) < ((0x36 ^ 0x7F ^ (0x94 ^ 0xC6)) & (0x3E ^ 0xB ^ (0xA6 ^ 0x88) ^ -1))) {
                                return false;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);

                    Time.sleepTicks((int)llIIlllIll[1]);

                }
                if (ae.lIlIlllIIlIlI(var48.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[110]];
                    var51 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[llIIlllIll[1]];
                    stringArray5[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(llIIlllIIl[llIIlllIll[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var51)) {
                            bl = llIIlllIll[1];

                            if ((174 + 97 - 84 + 3 ^ 89 + 102 - 83 + 79) <= 0) {
                                return false;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);

                    Time.sleepTicks((int)llIIlllIll[1]);

                }
                if (ae.lIlIlllIIlIlI(var47.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[113]];
                    var51 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[llIIlllIll[1]];
                    stringArray6[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(llIIlllIIl[llIIlllIll[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var51)) {
                            bl = llIIlllIll[1];

                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);

                    Time.sleepTicks((int)llIIlllIll[1]);

                }
                if (ae.lIlIlllIIlIlI(var46.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[114]];
                    var51 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIlllIll[1]];
                    nArray[ae.llIIlllIll[0]] = llIIlllIll[115];
                    TileObjects.getNearest((int[])nArray).interact(llIIlllIIl[llIIlllIll[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var51)) {
                            bl = llIIlllIll[1];

                            if (2 < -1) {
                                return false;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);

                    Time.sleepTicks((int)llIIlllIll[1]);

                }
                if (ae.lIlIlllIIlIlI(var45.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[117]];
                    var51 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIlllIll[1]];
                    nArray[ae.llIIlllIll[0]] = llIIlllIll[118];
                    TileObjects.getNearest((int[])nArray).interact(llIIlllIIl[llIIlllIll[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var51)) {
                            bl = llIIlllIll[1];

                            if (-1 >= 3) {
                                return false;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);

                    Time.sleepTicks((int)llIIlllIll[1]);

                }
                if (ae.lIlIlllIIlIlI(var44.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[120]];
                    var51 = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llIIlllIll[1]];
                    nArray[ae.llIIlllIll[0]] = llIIlllIll[121];
                    TileObjects.getNearest((int[])nArray).interact(llIIlllIIl[llIIlllIll[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var51)) {
                            bl = llIIlllIll[1];

                            if (-1 >= ((0x9D ^ 0xBE) & ~(0x11 ^ 0x32))) {
                                return false;
                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);

                    Time.sleepTicks((int)llIIlllIll[1]);

                }
                if (ae.lIlIlllIIlIlI(var43.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ae.lIlIlllIIllII(ae.eF() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllIIl[llIIlllIll[123]];
                    var51 = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[llIIlllIll[1]];
                    stringArray7[ae.llIIlllIll[0]] = llIIlllIIl[llIIlllIll[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(llIIlllIIl[llIIlllIll[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (ae.lIlIlllIIlllI(Skills.getExperience((Skill)Skill.AGILITY), var51)) {
                            bl = llIIlllIll[1];

                            }
                        } else {
                            bl = llIIlllIll[0];
                        }
                        return bl;
                    }, (int)llIIlllIll[104]);

                    Time.sleepTicks((int)llIIlllIll[1]);

                }
            }
        }
    }

    private static boolean lIlIlllIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        ae.lIlIlllIIlIIl();
        ae.lIlIlllIIIlll();
        bv = new ArrayList<d>();
        mT = llIIlllIll[27];
        mU = llIIlllIll[23];
        mW = new WorldArea(llIIlllIll[235], llIIlllIll[52], llIIlllIll[69], llIIlllIll[72], llIIlllIll[0]);
        mX = new WorldArea(llIIlllIll[235], llIIlllIll[52], llIIlllIll[69], llIIlllIll[72], llIIlllIll[1]);
        mY = new WorldArea(llIIlllIll[235], llIIlllIll[52], llIIlllIll[69], llIIlllIll[72], llIIlllIll[3]);
        mZ = new WorldPoint(llIIlllIll[236], llIIlllIll[237], llIIlllIll[0]);
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ae.lIlIlllIlIIII(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIll[2])) {
            bl = llIIlllIll[1];

            if (3 <= 0) {
                return ((27 + 137 - 99 + 149 ^ 70 + 66 - 103 + 107) & (0xA6 ^ 0x92 ^ (0xE ^ 0x60) ^ -1)) != 0;
            }
        } else {
            bl = llIIlllIll[0];
        }
        return bl;
    }

        return String.valueOf(var53);
    }

    private static boolean lIlIlllIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIlllIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlllIIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            ae.eA();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= 1) {
            return (0x4D ^ 0x6C ^ (0x28 ^ 0x14)) & (5 ^ 0x45 ^ (0x6A ^ 0x37) ^ -1);
        }
        return llIIlllIll[186];
    }
}

