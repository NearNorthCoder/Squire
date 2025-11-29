/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AAHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.KHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.THelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.VHelper;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class UHelper
implements S {
    public static final  WorldPoint dE;
    public static final  WorldPoint dv;
    public static  boolean bs;
    public static  String[] bQ;
    public static final  WorldPoint dB;
    static  boolean cl;
    public static final  WorldPoint dy;
    
    public static final  WorldPoint dC;
    static  WorldArea dG;
    public static final  WorldPoint dD;
    public static final  WorldPoint dA;
    static  int dF;
    public static  List<d> bu;
    public static final  WorldPoint dz;
    static  WorldArea dH;
    public static final  WorldPoint dw;
    
    public static final  WorldPoint dx;
    static  int ck;

    private static boolean llIlIlIIllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIlIlIIllIII(Object object) {
        return object != null;
    }

    private static boolean llIlIlIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIlIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIlIlIIlIIIl() {
        lllllIlIII = new String[lllllIlIll[140]];
        u.lllllIlIII[u.lllllIlIll[1]] = "Finished buying items, switching back to quest";
        u.lllllIlIII[u.lllllIlIll[0]] = "Drop";
        u.lllllIlIII[u.lllllIlIll[3]] = "Nav to bank";
        u.lllllIlIII[u.lllllIlIll[5]] = "Handling banking";
        u.lllllIlIII[u.lllllIlIll[6]] = "We are missing runes, switching to BUYING";
        u.lllllIlIII[u.lllllIlIll[15]] = "We are missing quest supplies, switching to BUYING";
        u.lllllIlIII[u.lllllIlIll[12]] = "Drink";
        u.lllllIlIII[u.lllllIlIll[16]] = "Eat";
        u.lllllIlIII[u.lllllIlIll[19]] = "King Bolren";
        u.lllllIlIII[u.lllllIlIll[25]] = "Nav to commander";
        u.lllllIlIII[u.lllllIlIll[20]] = "Commander Montai";
        u.lllllIlIII[u.lllllIlIll[27]] = "Nav to tracker";
        u.lllllIlIII[u.lllllIlIll[28]] = "Door";
        u.lllllIlIII[u.lllllIlIll[23]] = "Open";
        u.lllllIlIII[u.lllllIlIll[29]] = "Door";
        u.lllllIlIII[u.lllllIlIll[30]] = "Open";
        u.lllllIlIII[u.lllllIlIll[31]] = "Door";
        u.lllllIlIII[u.lllllIlIll[32]] = "Open";
        u.lllllIlIII[u.lllllIlIll[33]] = "Tracker gnome 2";
        u.lllllIlIII[u.lllllIlIll[35]] = "Nav to tracker";
        u.lllllIlIII[u.lllllIlIll[36]] = "Tracker gnome 1";
        u.lllllIlIII[u.lllllIlIll[38]] = "Nav to tracker";
        u.lllllIlIII[u.lllllIlIll[39]] = "Tracker gnome 3";
        u.lllllIlIII[u.lllllIlIll[40]] = "Nav to ballista";
        u.lllllIlIII[u.lllllIlIll[41]] = "Firing";
        u.lllllIlIII[u.lllllIlIll[42]] = "Ballista";
        u.lllllIlIII[u.lllllIlIll[43]] = "Fire";
        u.lllllIlIII[u.lllllIlIll[45]] = "0001";
        u.lllllIlIII[u.lllllIlIll[46]] = "0002";
        u.lllllIlIII[u.lllllIlIll[47]] = "0003";
        u.lllllIlIII[u.lllllIlIll[48]] = "0004";
        u.lllllIlIII[u.lllllIlIll[55]] = "Nav to crumble";
        u.lllllIlIII[u.lllllIlIll[56]] = "Crumbled wall";
        u.lllllIlIII[u.lllllIlIll[57]] = "Climb-over";
        u.lllllIlIII[u.lllllIlIll[60]] = "Door";
        u.lllllIlIII[u.lllllIlIll[61]] = "Open";
        u.lllllIlIII[u.lllllIlIll[62]] = "Door";
        u.lllllIlIII[u.lllllIlIll[63]] = "Open";
        u.lllllIlIII[u.lllllIlIll[64]] = "Door";
        u.lllllIlIII[u.lllllIlIll[65]] = "Open";
        u.lllllIlIII[u.lllllIlIll[66]] = "Ladder";
        u.lllllIlIII[u.lllllIlIll[67]] = "Climb-up";
        u.lllllIlIII[u.lllllIlIll[68]] = "Ladder";
        u.lllllIlIII[u.lllllIlIll[69]] = "Climb-up";
        u.lllllIlIII[u.lllllIlIll[70]] = "Grab orb";
        u.lllllIlIII[u.lllllIlIll[2]] = "Closed chest";
        u.lllllIlIII[u.lllllIlIll[71]] = "Closed chest";
        u.lllllIlIII[u.lllllIlIll[72]] = "Open";
        u.lllllIlIII[u.lllllIlIll[73]] = "Open chest";
        u.lllllIlIII[u.lllllIlIll[74]] = "Open chest";
        u.lllllIlIII[u.lllllIlIll[24]] = "Search";
        u.lllllIlIII[u.lllllIlIll[75]] = "King Bolren";
        u.lllllIlIII[u.lllllIlIll[76]] = "Travel to final fight";
        u.lllllIlIII[u.lllllIlIll[77]] = "Khazard warlord";
        u.lllllIlIII[u.lllllIlIll[78]] = "Attack";
        u.lllllIlIII[u.lllllIlIll[79]] = "Khazard warlord";
        u.lllllIlIII[u.lllllIlIll[80]] = "Attack";
        u.lllllIlIII[u.lllllIlIll[81]] = "Handle fight";
        u.lllllIlIII[u.lllllIlIll[82]] = "Drink";
        u.lllllIlIII[u.lllllIlIll[83]] = "Orbs of protection";
        u.lllllIlIII[u.lllllIlIll[84]] = "Taking orbs";
        u.lllllIlIII[u.lllllIlIll[85]] = "Orbs of protection";
        u.lllllIlIII[u.lllllIlIll[86]] = "Take";
        u.lllllIlIII[u.lllllIlIll[87]] = "Orbs of protection";
        u.lllllIlIII[u.lllllIlIll[88]] = "King Bolren";
        u.lllllIlIII[u.lllllIlIll[89]] = "Nav to start";
        u.lllllIlIII[u.lllllIlIll[100]] = "Castle Wars";
        u.lllllIlIII[u.lllllIlIll[101]] = "Loose Railing";
        u.lllllIlIII[u.lllllIlIll[102]] = "Squeeze-through";
        u.lllllIlIII[u.lllllIlIll[109]] = "Tree Gnome Village";
        u.lllllIlIII[u.lllllIlIll[110]] = "ring of wealth (";
        u.lllllIlIII[u.lllllIlIll[111]] = "trooper";
        u.lllllIlIII[u.lllllIlIll[130]] = "Can I help at all?";
        u.lllllIlIII[u.lllllIlIll[131]] = "I would be glad to help.";
        u.lllllIlIII[u.lllllIlIll[132]] = "Ok, I'll gather some wood.";
        u.lllllIlIII[u.lllllIlIll[133]] = "I'll try my best.";
        u.lllllIlIII[u.lllllIlIll[134]] = "I will find the warlord and bring back the orbs.";
        u.lllllIlIII[u.lllllIlIll[135]] = "Yes.";
    }

    static {
        u.llIlIlIIlIIlI();
        u.llIlIlIIlIIIl();
        dv = new WorldPoint(lllllIlIll[112], lllllIlIll[113], lllllIlIll[1]);
        dw = new WorldPoint(lllllIlIll[114], lllllIlIll[115], lllllIlIll[1]);
        dx = new WorldPoint(lllllIlIll[116], lllllIlIll[117], lllllIlIll[1]);
        dy = new WorldPoint(lllllIlIll[118], lllllIlIll[119], lllllIlIll[1]);
        dz = new WorldPoint(lllllIlIll[120], lllllIlIll[121], lllllIlIll[1]);
        dA = new WorldPoint(lllllIlIll[122], lllllIlIll[123], lllllIlIll[1]);
        dB = new WorldPoint(lllllIlIll[124], lllllIlIll[125], lllllIlIll[1]);
        dC = new WorldPoint(lllllIlIll[124], lllllIlIll[126], lllllIlIll[1]);
        dD = new WorldPoint(lllllIlIll[127], lllllIlIll[54], lllllIlIll[1]);
        dE = new WorldPoint(lllllIlIll[128], lllllIlIll[129], lllllIlIll[1]);
        bu = new ArrayList<d>();
        String[] stringArray = new String[lllllIlIll[12]];
        stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[130]];
        stringArray[u.lllllIlIll[0]] = lllllIlIII[lllllIlIll[131]];
        stringArray[u.lllllIlIll[3]] = lllllIlIII[lllllIlIll[132]];
        stringArray[u.lllllIlIll[5]] = lllllIlIII[lllllIlIll[133]];
        stringArray[u.lllllIlIll[6]] = lllllIlIII[lllllIlIll[134]];
        stringArray[u.lllllIlIll[15]] = lllllIlIII[lllllIlIll[135]];
        bQ = stringArray;
        dF = lllllIlIll[136];
        dG = new WorldArea(lllllIlIll[137], lllllIlIll[113], lllllIlIll[20], lllllIlIll[12], lllllIlIll[1]);
        dH = new WorldArea(lllllIlIll[138], lllllIlIll[139], lllllIlIll[48], lllllIlIll[30], lllllIlIll[1]);
    }

    @Override
    public boolean V() {
        boolean bl;
        if (u.llIlIlIIlIlll(e.j(dF), lllllIlIll[25])) {
            bl = lllllIlIll[0];

            }
        } else {
            bl = lllllIlIll[1];
        }
        return bl;
    }

    @Override
    public int T() {
        try {
            u.bt();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lllllIlIll[108];
    }

    private static boolean llIlIlIIlllII(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var1);
    }

    @Override
    public boolean S() {
        return lllllIlIll[1];
    }

    private static boolean llIlIlIIllIlI(int n2) {
        return n2 < 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void var2;
        int[] nArray = new int[lllllIlIll[5]];
        nArray[u.lllllIlIll[1]] = lllllIlIll[13];
        nArray[u.lllllIlIll[0]] = lllllIlIll[11];
        nArray[u.lllllIlIll[3]] = lllllIlIll[14];
        int[] nArray2 = nArray;
        int var3 = lllllIlIll[1];
        while (u.llIlIlIIlIlIl(var3, ((void)var2).length)) {
            int[] nArray3 = new int[lllllIlIll[0]];
            nArray3[u.lllllIlIll[1]] = var2[var3];
            if (u.llIlIlIIlIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllllIlIll[1];
            }
            ++var3;

            if (3 >= -1) continue;
            return false;
        }
        return lllllIlIll[0];
    }

    private static boolean llIlIlIIllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIlIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIlIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static int llIlIlIIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    private static void bu() {
        if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dv), lllllIlIll[3])) {
            void var4;
            void var5;
            void var6;
            AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[89]];
            WorldArea worldArea = new WorldArea(lllllIlIll[90], lllllIlIll[91], lllllIlIll[92], lllllIlIll[93], lllllIlIll[1]);
            WorldPoint worldPoint = new WorldPoint(lllllIlIll[94], lllllIlIll[95], lllllIlIll[1]);
            WorldArea worldArea2 = new WorldArea(lllllIlIll[96], lllllIlIll[97], lllllIlIll[35], lllllIlIll[6], lllllIlIll[1]);
            WorldArea worldArea3 = new WorldArea(lllllIlIll[98], lllllIlIll[99], lllllIlIll[19], lllllIlIll[15], lllllIlIll[1]);
            if (u.llIlIlIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (u.llIlIlIIlIllI(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Equipment.getFirst((int[])f.aM).interact(lllllIlIII[lllllIlIll[100]]);
                Time.sleepTicks((int)lllllIlIll[15]);

            }
            if (u.llIlIlIIlIllI(v.eW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)v.eX);

            }
            if (u.llIlIlIIlIlII(v.eW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(dH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Walker.stepAlong(List.of(v.eb));

                Time.sleepTicks((int)lllllIlIll[0]);

            }
            if (!u.llIlIlIIlIllI(var5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || u.llIlIlIIlIlII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[lllllIlIll[0]];
                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[101]];
                TileObjects.getNearest((String[])stringArray).interact(lllllIlIII[lllllIlIll[102]]);
                Time.sleepTicks((int)lllllIlIll[6]);

            }
            if ((!u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || u.llIlIlIIlIlII(dH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dv), lllllIlIll[3])) {
                Movement.walkTo((WorldPoint)dv);

                Time.sleepTicks((int)lllllIlIll[0]);

            }
        }
    }

    public static void bt() {
        block82: {
            Object var7;
            BankLocation lllllllllllllllllIlIIlIIlllIllIl2;
            block83: {
                block88: {
                    block85: {
                        block87: {
                            block86: {
                                block84: {
                                    if (u.llIlIlIIlIlII(bs ? 1 : 0)) {
                                        b.a(bu);
                                        if (u.llIlIlIIlIlIl(bu.size(), lllllIlIll[0])) {
                                            System.out.println(lllllIlIII[lllllIlIll[1]]);
                                            bs = lllllIlIll[1];
                                        }
                                    }
                                    if (!u.llIlIlIIlIllI(bs ? 1 : 0)) break block82;
                                    if (u.llIlIlIIlIlIl(Skills.getLevel((Skill)Skill.PRAYER), lllllIlIll[2])) {
                                        aa.eA();
                                    }
                                    if (u.llIlIlIIlIlll(Skills.getLevel((Skill)Skill.PRAYER), lllllIlIll[2]) && u.llIlIlIIlIlII(Inventory.contains((int[])f.aZ) ? 1 : 0)) {
                                        Inventory.getFirst((int[])f.aZ).interact(lllllIlIII[lllllIlIll[0]]);
                                    }
                                    if (!u.llIlIlIIlIllI(u.aa() ? 1 : 0) || !u.llIlIlIIlIlIl(e.j(dF), lllllIlIll[0]) || !u.llIlIlIIlIlll(Skills.getLevel((Skill)Skill.PRAYER), lllllIlIll[2])) break block83;
                                    lllllllllllllllllIlIIlIIlllIllIl2 = BankLocation.getNearest();
                                    if (u.llIlIlIIllIII(lllllllllllllllllIlIIlIIlllIllIl2) && u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIllIl2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[3]];
                                        a.a(lllllllllllllllllIlIIlIIlllIllIl2);
                                    }
                                    if (!u.llIlIlIIllIII(lllllllllllllllllIlIIlIIlllIllIl2) || !u.llIlIlIIlIlII(lllllllllllllllllIlIIlIIlllIllIl2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block83;
                                    if (u.llIlIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIlIll[4]);

                                    }
                                    if (!u.llIlIlIIlIlII(Bank.isOpen() ? 1 : 0)) break block83;
                                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[5]];
                                    if (u.llIlIlIIllIIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllllIlIll[6]);

                                    }
                                    if (u.llIlIlIIllIIl(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllllIlIll[3]);

                                    }
                                    int[] nArray = new int[lllllIlIll[0]];
                                    nArray[u.lllllIlIll[1]] = lllllIlIll[7];
                                    if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block84;
                                    int[] nArray2 = new int[lllllIlIll[0]];
                                    nArray2[u.lllllIlIll[1]] = lllllIlIll[7];
                                    if (!u.llIlIlIIlIlll(Bank.getFirst((int[])nArray2).getQuantity(), lllllIlIll[8])) break block85;
                                }
                                int[] nArray = new int[lllllIlIll[0]];
                                nArray[u.lllllIlIll[1]] = lllllIlIll[9];
                                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block86;
                                int[] nArray3 = new int[lllllIlIll[0]];
                                nArray3[u.lllllIlIll[1]] = lllllIlIll[9];
                                if (!u.llIlIlIIlIlll(Bank.getFirst((int[])nArray3).getQuantity(), lllllIlIll[8])) break block85;
                            }
                            int[] nArray = new int[lllllIlIll[0]];
                            nArray[u.lllllIlIll[1]] = lllllIlIll[10];
                            if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block87;
                            int[] nArray4 = new int[lllllIlIll[0]];
                            nArray4[u.lllllIlIll[1]] = lllllIlIll[10];
                            if (!u.llIlIlIIlIlll(Bank.getFirst((int[])nArray4).getQuantity(), lllllIlIll[8])) break block85;
                        }
                        int[] nArray = new int[lllllIlIll[0]];
                        nArray[u.lllllIlIll[1]] = lllllIlIll[11];
                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block88;
                        int[] nArray5 = new int[lllllIlIll[0]];
                        nArray5[u.lllllIlIll[1]] = lllllIlIll[11];
                        if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray5).getQuantity(), lllllIlIll[12])) break block88;
                    }
                    u.ae();
                    System.out.println(lllllIlIII[lllllIlIll[6]]);
                    bs = lllllIlIll[0];
                    return;
                }
                int[] nArray = new int[lllllIlIll[12]];
                nArray[u.lllllIlIll[1]] = lllllIlIll[13];
                nArray[u.lllllIlIll[0]] = lllllIlIll[11];
                nArray[u.lllllIlIll[3]] = lllllIlIll[14];
                nArray[u.lllllIlIll[5]] = lllllIlIll[10];
                nArray[u.lllllIlIll[6]] = lllllIlIll[9];
                nArray[u.lllllIlIll[15]] = lllllIlIll[7];
                if (u.llIlIlIIlIllI(e.b(nArray) ? 1 : 0)) {
                    u.ae();
                    System.out.println(lllllIlIII[lllllIlIll[15]]);
                    bs = lllllIlIll[0];
                    return;
                }
                while (u.llIlIlIIlIllI(t.bl() ? 1 : 0)) {
                    t.bj();
                    Time.sleepTicks((int)lllllIlIll[0]);

                    if (((0x1C ^ 0x10) & ~(0x72 ^ 0x7E)) == 0) continue;
                    return;
                }
                if (u.llIlIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lllllIlIll[12]);

                }
                int[] nArray6 = new int[lllllIlIll[16]];
                nArray6[u.lllllIlIll[1]] = lllllIlIll[13];
                nArray6[u.lllllIlIll[0]] = lllllIlIll[11];
                nArray6[u.lllllIlIll[3]] = lllllIlIll[14];
                nArray6[u.lllllIlIll[5]] = lllllIlIll[17];
                nArray6[u.lllllIlIll[6]] = lllllIlIll[10];
                nArray6[u.lllllIlIll[15]] = lllllIlIll[9];
                nArray6[u.lllllIlIll[12]] = lllllIlIll[7];
                if (u.llIlIlIIlIlII(e.b(nArray6) ? 1 : 0)) {
                    a.a(lllllIlIll[17], lllllIlIll[6]);
                    a.b(f.aM, lllllIlIll[0]);
                    a.a(lllllIlIll[11], lllllIlIll[12]);
                    a.a(lllllIlIll[18], lllllIlIll[19]);
                    a.a(lllllIlIll[14], lllllIlIll[5]);
                    a.a(lllllIlIll[13], lllllIlIll[20]);
                    int[] nArray7 = new int[lllllIlIll[0]];
                    nArray7[u.lllllIlIll[1]] = lllllIlIll[7];
                    if (u.llIlIlIIlIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[lllllIlIll[0]];
                        nArray8[u.lllllIlIll[1]] = lllllIlIll[7];
                        if (u.llIlIlIIlIlIl(Inventory.getCount((int[])nArray8), lllllIlIll[0])) {
                            Bank.withdraw((int)lllllIlIll[7], (int)lllllIlIll[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lllllIlIll[0]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lllllIlIll[0]];
                                nArray[u.lllllIlIll[1]] = lllllIlIll[7];
                                if (u.llIlIlIIllIIl(Inventory.getCount((int[])nArray))) {
                                    bl = lllllIlIll[0];

                                    if (((0x7A ^ 0x61) & ~(9 ^ 0x12)) > 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lllllIlIll[1];
                                }
                                return bl;
                            }, (int)lllllIlIll[4]);

                        }
                    }
                    int[] nArray9 = new int[lllllIlIll[0]];
                    nArray9[u.lllllIlIll[1]] = lllllIlIll[10];
                    if (u.llIlIlIIlIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[lllllIlIll[0]];
                        nArray10[u.lllllIlIll[1]] = lllllIlIll[10];
                        if (u.llIlIlIIlIlIl(Inventory.getCount((int[])nArray10), lllllIlIll[0])) {
                            Bank.withdraw((int)lllllIlIll[10], (int)lllllIlIll[22], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lllllIlIll[0]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lllllIlIll[0]];
                                nArray[u.lllllIlIll[1]] = lllllIlIll[10];
                                if (u.llIlIlIIllIIl(Inventory.getCount((int[])nArray))) {
                                    bl = lllllIlIll[0];

                                    if ((0x80 ^ 0x84) < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lllllIlIll[1];
                                }
                                return bl;
                            }, (int)lllllIlIll[4]);

                        }
                    }
                    if (u.llIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lllllIlIll[23])) {
                        a.a(lllllIlIll[9], lllllIlIll[21]);
                    }
                }
            }
            if (u.llIlIlIIlIlII(Inventory.contains((int[])f.aU) ? 1 : 0) && u.llIlIlIIlIlIl(Movement.getRunEnergy(), lllllIlIll[24])) {
                Inventory.getFirst((int[])f.aU).interact(lllllIlIII[lllllIlIll[12]]);
                Time.sleepTicks((int)lllllIlIll[0]);

            }
            if (u.llIlIlIIllIlI(u.llIlIlIIlIIll(e.UHelper(), 50.0))) {
                int[] nArray = new int[lllllIlIll[0]];
                nArray[u.lllllIlIll[1]] = lllllIlIll[18];
                if (u.llIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray11 = new int[lllllIlIll[0]];
                    nArray11[u.lllllIlIll[1]] = lllllIlIll[18];
                    Inventory.getFirst((int[])nArray11).interact(lllllIlIII[lllllIlIll[16]]);
                    Time.sleepTicks((int)lllllIlIll[0]);

                }
            }
            if (u.llIlIlIIlIlII(u.aa() ? 1 : 0) && u.llIlIlIIlIlIl(e.j(dF), lllllIlIll[0])) {
                if (u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    u.bu();
                }
                if (u.llIlIlIIlIlII(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lllllIlIII[lllllIlIll[19]], bQ);
                }
            }
            if ((!u.llIlIlIIllIll(e.j(dF), lllllIlIll[0]) || !u.llIlIlIIllIll(e.j(dF), lllllIlIll[3]) || u.llIlIlIIlllII(e.j(dF), lllllIlIll[5])) && u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(dH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dw), lllllIlIll[19]) && u.llIlIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[25]];
                    Movement.walkTo((WorldPoint)dw);

                    Time.sleepTicks((int)lllllIlIll[0]);

                }
                if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dw), lllllIlIll[19])) {
                    g.a(lllllIlIII[lllllIlIll[20]], bQ);
                }
            }
            if (u.llIlIlIIlllII(e.j(dF), lllllIlIll[6])) {
                ck = lllllIlIll[1];
                if (u.llIlIlIIlIllI(Vars.getBit((int)lllllIlIll[26]))) {
                    if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dy), lllllIlIll[6])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[27]];
                        Movement.walkTo((WorldPoint)dy);

                        Time.sleepTicks((int)lllllIlIll[0]);

                    }
                    if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dy), lllllIlIll[6])) {
                        String[] stringArray = new String[lllllIlIll[0]];
                        stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[28]];
                        String[] stringArray2 = new String[lllllIlIll[0]];
                        stringArray2[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[23]];
                        if (u.llIlIlIIlIlII(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[lllllIlIll[0]];
                            stringArray3[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[29]];
                            TileObjects.getNearest((String[])stringArray3).interact(lllllIlIII[lllllIlIll[30]]);
                            Time.sleepTicks((int)lllllIlIll[5]);

                        }
                        String[] stringArray4 = new String[lllllIlIll[0]];
                        stringArray4[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[31]];
                        String[] stringArray5 = new String[lllllIlIll[0]];
                        stringArray5[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[32]];
                        if (u.llIlIlIIlIllI(TileObjects.getNearest((String[])stringArray4).hasAction(stringArray5) ? 1 : 0)) {
                            g.a(lllllIlIII[lllllIlIll[33]], bQ);
                        }
                    }
                }
                if (u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[26]), lllllIlIll[0]) && u.llIlIlIIlIllI(Vars.getBit((int)lllllIlIll[34]))) {
                    if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dz), lllllIlIll[12])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[35]];
                        Movement.walkTo((WorldPoint)dz);

                        Time.sleepTicks((int)lllllIlIll[0]);

                    }
                    if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dz), lllllIlIll[12])) {
                        g.a(lllllIlIII[lllllIlIll[36]], bQ);
                    }
                }
                if (u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[26]), lllllIlIll[0]) && u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[34]), lllllIlIll[0]) && u.llIlIlIIlIllI(Vars.getBit((int)lllllIlIll[37]))) {
                    if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dA), lllllIlIll[12])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[38]];
                        Movement.walkTo((WorldPoint)dA);

                        Time.sleepTicks((int)lllllIlIll[0]);

                    }
                    if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dA), lllllIlIll[12])) {
                        g.a(lllllIlIII[lllllIlIll[39]], bQ);
                    }
                }
                if (u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[26]), lllllIlIll[0]) && u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[34]), lllllIlIll[0]) && u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[37]), lllllIlIll[0])) {
                    if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dB), lllllIlIll[3])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[40]];
                        Movement.walkTo((WorldPoint)dB);

                        Time.sleepTicks((int)lllllIlIll[0]);

                    }
                    if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dB), lllllIlIll[3])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[41]];
                        if (u.llIlIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lllllIlIll[0]];
                            stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[42]];
                            TileObjects.getNearest((String[])stringArray).interact(lllllIlIII[lllllIlIll[43]]);
                            Time.sleepTicks((int)lllllIlIll[5]);

                        }
                        int lllllllllllllllllIlIIlIIlllIllIl2 = Vars.getBit((int)lllllIlIll[44]);
                        var7 = Dialog.getOptions();
                        if (u.llIlIlIIlIllI(var7.isEmpty() ? 1 : 0)) {
                            System.out.println("Selecting " + lllllllllllllllllIlIIlIIlllIllIl2);
                            if (u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIllIl2)) {
                                String[] stringArray = new String[lllllIlIll[0]];
                                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[45]];
                                Dialog.chooseOption((String[])stringArray);

                            }
                            if (u.llIlIlIIlllII(lllllllllllllllllIlIIlIIlllIllIl2, lllllIlIll[0])) {
                                String[] stringArray = new String[lllllIlIll[0]];
                                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[46]];
                                Dialog.chooseOption((String[])stringArray);

                            }
                            if (u.llIlIlIIlllII(lllllllllllllllllIlIIlIIlllIllIl2, lllllIlIll[3])) {
                                String[] stringArray = new String[lllllIlIll[0]];
                                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[47]];
                                Dialog.chooseOption((String[])stringArray);

                            }
                            if (u.llIlIlIIlllII(lllllllllllllllllIlIIlIIlllIllIl2, lllllIlIll[5])) {
                                String[] stringArray = new String[lllllIlIll[0]];
                                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[48]];
                                Dialog.chooseOption((String[])stringArray);

                            }
                            Time.sleepTicks((int)lllllIlIll[3]);

                        }
                    }
                }
            }
            if (u.llIlIlIIlllII(e.j(dF), lllllIlIll[15])) {
                lllllllllllllllllIlIIlIIlllIllIl2 = new WorldArea(lllllIlIll[49], lllllIlIll[50], lllllIlIll[16], lllllIlIll[15], lllllIlIll[1]);
                if (u.llIlIlIIlIllI(Players.getLocal().getWorldLocation().getPlane())) {
                    var7 = new WorldArea(lllllIlIll[51], lllllIlIll[50], lllllIlIll[28], lllllIlIll[12], lllllIlIll[1]);
                    WorldArea var8 = new WorldArea(lllllIlIll[51], lllllIlIll[52], lllllIlIll[6], lllllIlIll[15], lllllIlIll[1]);
                    WorldArea var9 = new WorldArea(lllllIlIll[53], lllllIlIll[54], lllllIlIll[6], lllllIlIll[3], lllllIlIll[1]);
                    WorldArea var10 = new WorldArea(lllllIlIll[53], lllllIlIll[52], lllllIlIll[5], lllllIlIll[5], lllllIlIll[1]);
                    if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dC), lllllIlIll[3]) && u.llIlIlIIlIllI(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[55]];
                        Movement.walkTo((WorldPoint)dC);

                        Time.sleepTicks((int)lllllIlIll[0]);

                    }
                    if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dC), lllllIlIll[3]) && u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIllIl2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lllllIlIll[0]];
                        stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[56]];
                        TileObjects.getNearest((String[])stringArray).interact(lllllIlIII[lllllIlIll[57]]);
                        Time.sleepTicks((int)lllllIlIll[3]);

                    }
                    if (u.llIlIlIIlIlII(lllllllllllllllllIlIIlIIlllIllIl2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIlIll[58], lllllIlIll[59], lllllIlIll[1])), lllllIlIll[3])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lllllIlIll[58], lllllIlIll[59], lllllIlIll[1]));

                            Time.sleepTicks((int)lllllIlIll[0]);

                        }
                        if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIlIll[58], lllllIlIll[59], lllllIlIll[1])), lllllIlIll[3])) {
                            String[] stringArray = new String[lllllIlIll[0]];
                            stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[60]];
                            String[] stringArray6 = new String[lllllIlIll[0]];
                            stringArray6[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[61]];
                            if (u.llIlIlIIlIlII(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[lllllIlIll[0]];
                                stringArray7[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[62]];
                                TileObjects.getNearest((String[])stringArray7).interact(lllllIlIII[lllllIlIll[63]]);
                                Time.sleepTicks((int)lllllIlIll[3]);

                            }
                            String[] stringArray8 = new String[lllllIlIll[0]];
                            stringArray8[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[64]];
                            String[] stringArray9 = new String[lllllIlIll[0]];
                            stringArray9[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[65]];
                            if (u.llIlIlIIlIllI(TileObjects.getNearest((String[])stringArray8).hasAction(stringArray9) ? 1 : 0)) {
                                String[] stringArray10 = new String[lllllIlIll[0]];
                                stringArray10[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[66]];
                                TileObjects.getNearest((String[])stringArray10).interact(lllllIlIII[lllllIlIll[67]]);
                                Time.sleepTicks((int)lllllIlIll[15]);

                            }
                        }
                        if (!u.llIlIlIIlIllI(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !u.llIlIlIIlIllI(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !u.llIlIlIIlIllI(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || u.llIlIlIIlIlII(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lllllIlIll[0]];
                            stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[68]];
                            TileObjects.getNearest((String[])stringArray).interact(lllllIlIII[lllllIlIll[69]]);
                            Time.sleepTicks((int)lllllIlIll[15]);

                        }
                    }
                }
                if (u.llIlIlIIlllII(Players.getLocal().getWorldLocation().getPlane(), lllllIlIll[0])) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[70]];
                    String[] stringArray = new String[lllllIlIll[0]];
                    stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[2]];
                    if (u.llIlIlIIllIII(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray11 = new String[lllllIlIll[0]];
                        stringArray11[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[71]];
                        TileObjects.getNearest((String[])stringArray11).interact(lllllIlIII[lllllIlIll[72]]);
                        Time.sleepTicks((int)lllllIlIll[15]);

                    }
                    String[] stringArray12 = new String[lllllIlIll[0]];
                    stringArray12[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[73]];
                    if (u.llIlIlIIllIII(TileObjects.getNearest((String[])stringArray12))) {
                        String[] stringArray13 = new String[lllllIlIll[0]];
                        stringArray13[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[74]];
                        TileObjects.getNearest((String[])stringArray13).interact(lllllIlIII[lllllIlIll[24]]);
                        Time.sleepTicks((int)lllllIlIll[3]);

                    }
                }
            }
            if (u.llIlIlIIlllII(e.j(dF), lllllIlIll[12])) {
                if (u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    u.bu();
                }
                if (u.llIlIlIIlIlII(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lllllIlIII[lllllIlIll[75]], bQ);
                }
            }
            if (u.llIlIlIIlllII(e.j(dF), lllllIlIll[16])) {
                if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dE), lllllIlIll[25])) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[76]];
                    Movement.walkTo((WorldPoint)dE);

                    Time.sleepTicks((int)lllllIlIll[3]);

                }
                if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dE), lllllIlIll[25])) {
                    if (u.llIlIlIIlIllI(k.ac() ? 1 : 0)) {
                        k.ad();
                    }
                    String[] stringArray = new String[lllllIlIll[0]];
                    stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[77]];
                    lllllllllllllllllIlIIlIIlllIllIl2 = NPCs.getNearest((String[])stringArray);
                    var7 = NPCs.getNearest(nPC -> {
                        int n2;
                        if (u.llIlIlIIlIlII(nPC.getName().contains(lllllIlIII[lllllIlIll[111]]) ? 1 : 0) && u.llIlIlIlIIIII(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lllllIlIll[0];

                            if (((0xD5 ^ 0xC3) & ~(0x26 ^ 0x30)) > 0) {
                                return false;
                            }
                        } else {
                            n2 = lllllIlIll[1];
                        }
                        return n2 != 0;
                    });
                    if (u.llIlIlIIllIII(lllllllllllllllllIlIIlIIlllIllIl2) && u.llIlIlIIlllll(var7)) {
                        String[] stringArray14 = new String[lllllIlIll[0]];
                        stringArray14[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[78]];
                        if (u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIllIl2.hasAction(stringArray14) ? 1 : 0)) {
                            g.a(lllllIlIII[lllllIlIll[79]], bQ);
                        }
                        String[] stringArray15 = new String[lllllIlIll[0]];
                        stringArray15[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[80]];
                        if (u.llIlIlIIlIlII(lllllllllllllllllIlIIlIIlllIllIl2.hasAction(stringArray15) ? 1 : 0) && u.llIlIlIIlllll(Players.getLocal().getInteracting())) {
                            AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[81]];
                            if (u.llIlIlIIlIllI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                        }
                    }
                    if (u.llIlIlIIlIlIl(Prayers.getPoints(), lllllIlIll[40]) && u.llIlIlIIlIlII(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aR).interact(lllllIlIII[lllllIlIll[82]]);
                        Time.sleepTicks((int)lllllIlIll[0]);

                    }
                    g.a(bQ);
                }
            }
            if (u.llIlIlIIlllII(e.j(dF), lllllIlIll[19])) {
                String[] stringArray = new String[lllllIlIll[0]];
                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[83]];
                if (u.llIlIlIIlIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[84]];
                    String[] stringArray16 = new String[lllllIlIll[0]];
                    stringArray16[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[85]];
                    TileItems.getNearest((String[])stringArray16).interact(lllllIlIII[lllllIlIll[86]]);
                    Time.sleepTicks((int)lllllIlIll[6]);

                }
                String[] stringArray17 = new String[lllllIlIll[0]];
                stringArray17[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[87]];
                if (u.llIlIlIIlIlII(Inventory.contains((String[])stringArray17) ? 1 : 0)) {
                    if (u.llIlIlIIlIlII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        u.bu();
                    }
                    if (u.llIlIlIIlIlII(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (u.llIlIlIIlIlIl(ck, lllllIlIll[0])) {
                            ac.kf += lllllIlIll[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllllIlIll[0];
                            ac.kf = lllllIlIll[1];
                            cl = lllllIlIll[1];
                        }
                        g.a(lllllIlIII[lllllIlIll[88]], bQ);
                    }
                }
            }
            g.a(bQ);
        }
    }

    private static boolean llIlIlIIlllll(Object object) {
        return object == null;
    }

    private static boolean llIlIlIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    private static void ae() {
        block33: {
            d var11;
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        block25: {
                                            block24: {
                                                Object var12;
                                                block23: {
                                                    block22: {
                                                        int[] nArray = new int[lllllIlIll[0]];
                                                        nArray[u.lllllIlIll[1]] = lllllIlIll[11];
                                                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                        int[] nArray2 = new int[lllllIlIll[0]];
                                                        nArray2[u.lllllIlIll[1]] = lllllIlIll[11];
                                                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                        int[] nArray3 = new int[lllllIlIll[0]];
                                                        nArray3[u.lllllIlIll[1]] = lllllIlIll[11];
                                                        if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray3).getQuantity(), lllllIlIll[12])) break block23;
                                                    }
                                                    var12 = new DHelper(lllllIlIll[11], lllllIlIll[12], lllllIlIll[103]);
                                                    bu.add((DHelper) ar12);

                                                }
                                                if (u.llIlIlIIlIllI(Bank.contains((Predicate)(var12 = item -> item.getName().toLowerCase().contains(lllllIlIII[lllllIlIll[110]]))) ? 1 : 0)) {
                                                    var11 = new DHelper(lllllIlIll[104], lllllIlIll[15], lllllIlIll[105]);
                                                    bu.add(var11);

                                                }
                                                int[] nArray = new int[lllllIlIll[0]];
                                                nArray[u.lllllIlIll[1]] = lllllIlIll[14];
                                                if (u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    int[] nArray4 = new int[lllllIlIll[0]];
                                                    nArray4[u.lllllIlIll[1]] = lllllIlIll[14];
                                                    if (u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray4).getQuantity(), lllllIlIll[6])) {
                                                        int[] nArray5 = new int[lllllIlIll[0]];
                                                        nArray5[u.lllllIlIll[1]] = lllllIlIll[14];
                                                        var11 = new DHelper(lllllIlIll[14], lllllIlIll[6] - Bank.getFirst((int[])nArray5).getQuantity(), lllllIlIll[106]);
                                                        bu.add(var11);

                                                    }
                                                }
                                                int[] nArray6 = new int[lllllIlIll[0]];
                                                nArray6[u.lllllIlIll[1]] = lllllIlIll[9];
                                                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray6) ? 1 : 0)) break block24;
                                                int[] nArray7 = new int[lllllIlIll[0]];
                                                nArray7[u.lllllIlIll[1]] = lllllIlIll[9];
                                                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray7) ? 1 : 0)) break block25;
                                                int[] nArray8 = new int[lllllIlIll[0]];
                                                nArray8[u.lllllIlIll[1]] = lllllIlIll[9];
                                                if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray8).getQuantity(), lllllIlIll[8])) break block25;
                                            }
                                            var11 = new DHelper(lllllIlIll[9], lllllIlIll[8], lllllIlIll[20]);
                                            bu.add(var11);

                                        }
                                        int[] nArray = new int[lllllIlIll[0]];
                                        nArray[u.lllllIlIll[1]] = lllllIlIll[7];
                                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                        int[] nArray9 = new int[lllllIlIll[0]];
                                        nArray9[u.lllllIlIll[1]] = lllllIlIll[7];
                                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray9) ? 1 : 0)) break block27;
                                        int[] nArray10 = new int[lllllIlIll[0]];
                                        nArray10[u.lllllIlIll[1]] = lllllIlIll[7];
                                        if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray10).getQuantity(), lllllIlIll[8])) break block27;
                                    }
                                    var11 = new DHelper(lllllIlIll[7], lllllIlIll[8], lllllIlIll[20]);
                                    bu.add(var11);

                                }
                                int[] nArray = new int[lllllIlIll[0]];
                                nArray[u.lllllIlIll[1]] = lllllIlIll[10];
                                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                int[] nArray11 = new int[lllllIlIll[0]];
                                nArray11[u.lllllIlIll[1]] = lllllIlIll[10];
                                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray11) ? 1 : 0)) break block29;
                                int[] nArray12 = new int[lllllIlIll[0]];
                                nArray12[u.lllllIlIll[1]] = lllllIlIll[10];
                                if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray12).getQuantity(), lllllIlIll[8])) break block29;
                            }
                            var11 = new DHelper(lllllIlIll[10], lllllIlIll[8], lllllIlIll[20]);
                            bu.add(var11);

                        }
                        int[] nArray = new int[lllllIlIll[0]];
                        nArray[u.lllllIlIll[1]] = lllllIlIll[14];
                        if (u.llIlIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            var11 = new DHelper(lllllIlIll[14], lllllIlIll[6], lllllIlIll[106]);
                            bu.add(var11);

                        }
                        int[] nArray13 = new int[lllllIlIll[0]];
                        nArray13[u.lllllIlIll[1]] = lllllIlIll[17];
                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray13) ? 1 : 0)) break block30;
                        int[] nArray14 = new int[lllllIlIll[0]];
                        nArray14[u.lllllIlIll[1]] = lllllIlIll[17];
                        if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray14).getQuantity(), lllllIlIll[6])) break block31;
                    }
                    var11 = new DHelper(lllllIlIll[17], lllllIlIll[6], i.bp);
                    bu.add(var11);

                }
                int[] nArray = new int[lllllIlIll[0]];
                nArray[u.lllllIlIll[1]] = lllllIlIll[13];
                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                int[] nArray15 = new int[lllllIlIll[0]];
                nArray15[u.lllllIlIll[1]] = lllllIlIll[13];
                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray15) ? 1 : 0)) break block33;
                int[] nArray16 = new int[lllllIlIll[0]];
                nArray16[u.lllllIlIll[1]] = lllllIlIll[13];
                if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray16).getQuantity(), lllllIlIll[30])) break block33;
            }
            var11 = new DHelper(lllllIlIll[13], lllllIlIll[66], lllllIlIll[107]);
            bu.add(var11);

        }
    }

    @Override
    public String U() {
        return lllllIlIII[lllllIlIll[109]];
    }
}

