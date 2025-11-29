/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.AHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.BHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.DHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.GHelper;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.IHelper;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
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
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class OHelper
implements G {
    static  WorldPoint I;
    static  WorldPoint cc;
    
    public static  boolean bY;
    public static  boolean bW;
    
    public static  List<d> bv;
    public static  boolean ca;
    public static  boolean cb;
    public static  boolean bt;
    
    static  WorldArea cd;
    public static  boolean bZ;
    public static  boolean bX;

    private static boolean lllIIllllllI(int n2) {
        return n2 > 0;
    }

    @Override
    public int T() {
        try {
            o.ay();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 >= 3) {
            return (191 + 209 - 391 + 209 ^ 27 + 30 - 56 + 139) & (41 + 21 - 44 + 189 ^ 44 + 29 - -43 + 37 ^ -1);
        }
        return lIIIlIIIIl[183];
    }

    @Override
    public boolean V() {
        int n2;
        if (o.lllIIllllIIl(cb ? 1 : 0) && o.lllIIllllIIl(ca ? 1 : 0) && o.lllIIllllIIl(bZ ? 1 : 0) && o.lllIIllllIIl(bY ? 1 : 0) && o.lllIIllllIIl(bX ? 1 : 0)) {
            n2 = lIIIlIIIIl[0];

            if (1 < 0) {
                return ((65 + 74 - 29 + 26 ^ 64 + 59 - 74 + 96) & (0xA1 ^ 0x9E ^ (0x55 ^ 0x73) ^ -1)) != 0;
            }
        } else {
            n2 = lIIIlIIIIl[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIlllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIIllllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIllllIll(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean az() {
        int n2;
        int[] nArray = new int[lIIIlIIIIl[0]];
        nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[19];
        if (o.lllIIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIlIIIIl[0]];
            nArray2[o.lIIIlIIIIl[1]] = lIIIlIIIIl[17];
            if (o.lllIIllllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIlIIIIl[0]];
                nArray3[o.lIIIlIIIIl[1]] = lIIIlIIIIl[15];
                if (o.lllIIllllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIIIlIIIIl[0]];
                    nArray4[o.lIIIlIIIIl[1]] = lIIIlIIIIl[21];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIIlIIIIl[0]];
                        nArray5[o.lIIIlIIIIl[1]] = lIIIlIIIIl[13];
                        if (o.lllIIllllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            n2 = lIIIlIIIIl[0];

                            if (-1 < (0x23 ^ 0x27)) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lIIIlIIIIl[1];
        return n2 != 0;
    }

    private static boolean lllIIlllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllIIlllIIll() {
        lIIIlIIIII = new String[lIIIlIIIIl[194]];
        o.lIIIlIIIII[o.lIIIlIIIIl[1]] = "Finished buying items, switching back to quest";
        o.lIIIlIIIII[o.lIIIlIIIIl[0]] = "[Script] You do not meet the requirements for rogues den";
        o.lIIIlIIIII[o.lIIIlIIIIl[4]] = "Nav to bank";
        o.lIIIlIIIII[o.lIIIlIIIIl[6]] = "Handling banking";
        o.lIIIlIIIII[o.lIIIlIIIIl[7]] = "We are missing stamina supplies, switching to BUYING";
        o.lIIIlIIIII[o.lIIIlIIIIl[12]] = "We are missing quest supplies, switching to BUYING";
        o.lIIIlIIIII[o.lIIIlIIIIl[14]] = "Got mask";
        o.lIIIlIIIII[o.lIIIlIIIIl[16]] = "Got top";
        o.lIIIlIIIII[o.lIIIlIIIIl[18]] = "Got legs";
        o.lIIIlIIIII[o.lIIIlIIIIl[20]] = "got boots";
        o.lIIIlIIIII[o.lIIIlIIIIl[22]] = "got gloves";
        o.lIIIlIIIII[o.lIIIlIIIIl[27]] = "Drink";
        o.lIIIlIIIII[o.lIIIlIIIIl[28]] = "Drink";
        o.lIIIlIIIII[o.lIIIlIIIIl[29]] = "Drink";
        o.lIIIlIIIII[o.lIIIlIIIIl[30]] = "Nav to minigame entrance";
        o.lIIIlIIIII[o.lIIIlIIIIl[31]] = "Doorway";
        o.lIIIlIIIII[o.lIIIlIIIIl[32]] = "Open";
        o.lIIIlIIIII[o.lIIIlIIIIl[33]] = "Brian O'Richard";
        o.lIIIlIIIII[o.lIIIlIIIIl[34]] = "want to try the";
        o.lIIIlIIIII[o.lIIIlIIIIl[37]] = "Entering bars";
        o.lIIIlIIIII[o.lIIIlIIIIl[38]] = "Contortion Bars";
        o.lIIIlIIIII[o.lIIIlIIIIl[39]] = "Enter";
        o.lIIIlIIIII[o.lIIIlIIIIl[45]] = "jump through swinger";
        o.lIIIlIIIII[o.lIIIlIIIIl[46]] = "jump through swinger";
        o.lIIIlIIIII[o.lIIIlIIIIl[49]] = "Run to tile";
        o.lIIIlIIIII[o.lIIIlIIIIl[25]] = "Grill";
        o.lIIIlIIIII[o.lIIIlIIIIl[50]] = "Open";
        o.lIIIlIIIII[o.lIIIlIIIIl[56]] = "Ledge";
        o.lIIIlIIIII[o.lIIIlIIIIl[57]] = "Climb";
        o.lIIIlIIIII[o.lIIIlIIIIl[65]] = "Ledge";
        o.lIIIlIIIII[o.lIIIlIIIIl[23]] = "Climb";
        o.lIIIlIIIII[o.lIIIlIIIIl[74]] = "Passageway";
        o.lIIIlIIIII[o.lIIIlIIIIl[75]] = "Enter";
        o.lIIIlIIIII[o.lIIIlIIIIl[81]] = "Passageway";
        o.lIIIlIIIII[o.lIIIlIIIIl[82]] = "Enter";
        o.lIIIlIIIII[o.lIIIlIIIIl[86]] = "Passageway";
        o.lIIIlIIIII[o.lIIIlIIIIl[87]] = "Enter";
        o.lIIIlIIIII[o.lIIIlIIIIl[89]] = "Grill";
        o.lIIIlIIIII[o.lIIIlIIIIl[90]] = "Open";
        o.lIIIlIIIII[o.lIIIlIIIIl[94]] = "Ledge";
        o.lIIIlIIIII[o.lIIIlIIIIl[95]] = "Climb";
        o.lIIIlIIIII[o.lIIIlIIIIl[98]] = "Wall";
        o.lIIIlIIIII[o.lIIIlIIIIl[99]] = "Search";
        o.lIIIlIIIII[o.lIIIlIIIIl[105]] = "Take";
        o.lIIIlIIIII[o.lIIIlIIIIl[107]] = "Door";
        o.lIIIlIIIII[o.lIIIlIIIIl[108]] = "Open";
        o.lIIIlIIIII[o.lIIIlIIIIl[109]] = "Select";
        o.lIIIlIIIII[o.lIIIlIIIIl[128]] = "Grill";
        o.lIIIlIIIII[o.lIIIlIIIIl[129]] = "Open";
        o.lIIIlIIIII[o.lIIIlIIIIl[130]] = "Grill";
        o.lIIIlIIIII[o.lIIIlIIIIl[2]] = "Open";
        o.lIIIlIIIII[o.lIIIlIIIIl[131]] = "Grill";
        o.lIIIlIIIII[o.lIIIlIIIIl[132]] = "Open";
        o.lIIIlIIIII[o.lIIIlIIIIl[138]] = "Grill";
        o.lIIIlIIIII[o.lIIIlIIIIl[139]] = "Open";
        o.lIIIlIIIII[o.lIIIlIIIIl[140]] = "Grill";
        o.lIIIlIIIII[o.lIIIlIIIIl[141]] = "Open";
        o.lIIIlIIIII[o.lIIIlIIIIl[151]] = "Flash powder";
        o.lIIIlIIIII[o.lIIIlIIIIl[152]] = "Take";
        o.lIIIlIIIII[o.lIIIlIIIIl[154]] = "Flash powder";
        o.lIIIlIIIII[o.lIIIlIIIIl[155]] = "Flash powder";
        o.lIIIlIIIII[o.lIIIlIIIIl[156]] = "Flash powder";
        o.lIIIlIIIII[o.lIIIlIIIIl[158]] = "Flash powder";
        o.lIIIlIIIII[o.lIIIlIIIIl[161]] = "Wall safe";
        o.lIIIlIIIII[o.lIIIlIIIIl[162]] = "Crack";
        o.lIIIlIIIII[o.lIIIlIIIIl[163]] = "Search";
        o.lIIIlIIIII[o.lIIIlIIIIl[164]] = "A piece of Rogue equipment.";
        o.lIIIlIIIII[o.lIIIlIIIIl[165]] = "Mask.";
        o.lIIIlIIIII[o.lIIIlIIIIl[166]] = "A piece of Rogue equipment.";
        o.lIIIlIIIII[o.lIIIlIIIIl[167]] = "Top.";
        o.lIIIlIIIII[o.lIIIlIIIIl[168]] = "A piece of Rogue equipment.";
        o.lIIIlIIIII[o.lIIIlIIIIl[169]] = "Trousers.";
        o.lIIIlIIIII[o.lIIIlIIIIl[170]] = "A piece of Rogue equipment.";
        o.lIIIlIIIII[o.lIIIlIIIIl[171]] = "Boots.";
        o.lIIIlIIIII[o.lIIIlIIIIl[172]] = "A piece of Rogue equipment.";
        o.lIIIlIIIII[o.lIIIlIIIIl[173]] = "Gloves.";
        o.lIIIlIIIII[o.lIIIlIIIIl[174]] = "Got mask";
        o.lIIIlIIIII[o.lIIIlIIIIl[175]] = "Got top";
        o.lIIIlIIIII[o.lIIIlIIIIl[176]] = "Got legs";
        o.lIIIlIIIII[o.lIIIlIIIIl[177]] = "got boots";
        o.lIIIlIIIII[o.lIIIlIIIIl[26]] = "got gloves";
        o.lIIIlIIIII[o.lIIIlIIIIl[184]] = "Rogues Den";
        o.lIIIlIIIII[o.lIIIlIIIIl[185]] = "ring of wealth (";
        o.lIIIlIIIII[o.lIIIlIIIIl[191]] = "Yes.";
        o.lIIIlIIIII[o.lIIIlIIIIl[192]] = "Yes actually, what've you got?";
        o.lIIIlIIIII[o.lIIIlIIIIl[193]] = "Ok that sounds good!";
    }

    private static void af() {
        block12: {
            d llIIIIlIIIII;
            block11: {
                block10: {
                    block9: {
                        Object llIIIIlIIIIl;
                        int[] nArray = new int[lIIIlIIIIl[0]];
                        nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[10];
                        if (o.lllIIllllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIIlIIIIl[10], lIIIlIIIIl[12], lIIIlIIIIl[178]);
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[lIIIlIIIIl[0]];
                        nArray2[o.lIIIlIIIIl[1]] = lIIIlIIIIl[11];
                        if (o.lllIIllllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            llIIIIlIIIIl = new DHelper(lIIIlIIIIl[11], lIIIlIIIIl[25], lIIIlIIIIl[179]);
                            bv.add((DHelper) lIIIIlIIIIl);

                        }
                        if (o.lllIIllllIll(Bank.contains(llIIIIlIIIIl = item -> item.getName().toLowerCase().contains(lIIIlIIIII[lIIIlIIIIl[185]])) ? 1 : 0)) {
                            llIIIIlIIIII = new DHelper(lIIIlIIIIl[180], lIIIlIIIIl[12], lIIIlIIIIl[181]);
                            bv.add(llIIIIlIIIII);

                        }
                        int[] nArray3 = new int[lIIIlIIIIl[0]];
                        nArray3[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block9;
                        int[] nArray4 = new int[lIIIlIIIIl[0]];
                        nArray4[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block10;
                        int[] nArray5 = new int[lIIIlIIIIl[0]];
                        nArray5[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIlI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlIIIIl[4])) break block10;
                    }
                    llIIIIlIIIII = new DHelper(lIIIlIIIIl[8], lIIIlIIIIl[38], i.bq);
                    bv.add(llIIIIlIIIII);

                }
                int[] nArray = new int[lIIIlIIIIl[0]];
                nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                if (!o.lllIIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block11;
                int[] nArray6 = new int[lIIIlIIIIl[0]];
                nArray6[o.lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                if (!o.lllIIllllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                int[] nArray7 = new int[lIIIlIIIIl[0]];
                nArray7[o.lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                if (!o.lllIIllllIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlIIIIl[31])) break block12;
            }
            llIIIIlIIIII = new DHelper(lIIIlIIIIl[9], lIIIlIIIIl[95], lIIIlIIIIl[182]);
            bv.add(llIIIIlIIIII);

        }
    }

    @Override
    public String U() {
        return lIIIlIIIII[lIIIlIIIIl[184]];
    }

    private static boolean ab() {
        int n2;
        if (o.lllIlIIIIIIl(Vars.getBit((int)lIIIlIIIIl[25]), lIIIlIIIIl[0]) && o.lllIIlllllII(Movement.getRunEnergy(), lIIIlIIIIl[24]) && o.lllIIllllIIl(Inventory.isEmpty() ? 1 : 0)) {
            n2 = lIIIlIIIIl[0];

            if (1 <= 0) {
                return false;
            }
        } else {
            n2 = lIIIlIIIIl[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIlllllIl(Object object) {
        return object != null;
    }

    private static boolean lllIlIIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIlIIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean S() {
        return lIIIlIIIIl[1];
    }

    static {
        o.lllIIllllIII();
        o.lllIIlllIIll();
        bv = new ArrayList<d>();
        I = new WorldPoint(lIIIlIIIIl[122], lIIIlIIIIl[186], lIIIlIIIIl[0]);
        cc = new WorldPoint(lIIIlIIIIl[35], lIIIlIIIIl[187], lIIIlIIIIl[0]);
        cd = new WorldArea(lIIIlIIIIl[188], lIIIlIIIIl[36], lIIIlIIIIl[189], lIIIlIIIIl[190], lIIIlIIIIl[0]);
        String[] stringArray = new String[lIIIlIIIIl[6]];
        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[191]];
        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[192]];
        stringArray[o.lIIIlIIIIl[4]] = lIIIlIIIII[lIIIlIIIIl[193]];
        bR = stringArray;
    }

        return String.valueOf(lIllllllIlll);
    }

    public static void ay() {
        block140: {
            Object llIIIllIIlll;
            block141: {
                block143: {
                    block142: {
                        if (o.lllIIllllIIl(bt ? 1 : 0)) {
                            b.a(bv);
                            if (o.lllIIllllIlI(bv.size(), lIIIlIIIIl[0])) {
                                System.out.println(lIIIlIIIII[lIIIlIIIIl[1]]);
                                bt = lIIIlIIIIl[1];
                            }
                        }
                        if (!o.lllIIllllIll(bt ? 1 : 0)) break block140;
                        if (!o.lllIIlllllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIlIIIIl[2]) || o.lllIIllllIlI(Skills.getLevel((Skill)Skill.THIEVING), lIIIlIIIIl[2])) {
                            System.out.println(lIIIlIIIII[lIIIlIIIIl[0]]);
                            return;
                        }
                        if (!o.lllIIllllIll(o.ab() ? 1 : 0) || !o.lllIIllllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block141;
                        int[] nArray = new int[lIIIlIIIIl[0]];
                        nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[3];
                        if (!o.lllIIllllIll(Inventory.contains((int[])nArray) ? 1 : 0) || !o.lllIIlllllII(Skills.getLevel((Skill)Skill.AGILITY), lIIIlIIIIl[2]) || !o.lllIIlllllII(Skills.getLevel((Skill)Skill.THIEVING), lIIIlIIIIl[2])) break block141;
                        llIIIllIIlll = BankLocation.getNearest();
                        if (o.lllIIlllllIl(llIIIllIIlll) && o.lllIIllllIll(llIIIllIIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[4]];
                            a.a((BankLocation)llIIIllIIlll);
                        }
                        int[] nArray2 = new int[lIIIlIIIIl[0]];
                        nArray2[o.lIIIlIIIIl[1]] = lIIIlIIIIl[3];
                        if (o.lllIIllllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            return;
                        }
                        if (!o.lllIIlllllIl(llIIIllIIlll) || !o.lllIIllllIIl(llIIIllIIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block141;
                        if (o.lllIIllllIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIIIIl[5]);

                        }
                        if (!o.lllIIllllIIl(Bank.isOpen() ? 1 : 0)) break block141;
                        AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[6]];
                        if (o.lllIIllllllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIlIIIIl[7]);

                        }
                        if (o.lllIIllllllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIIlIIIIl[4]);

                        }
                        Time.sleepTicks((int)lIIIlIIIIl[6]);

                        int[] nArray3 = new int[lIIIlIIIIl[0]];
                        nArray3[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block142;
                        int[] nArray4 = new int[lIIIlIIIIl[0]];
                        nArray4[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block143;
                        int[] nArray5 = new int[lIIIlIIIIl[0]];
                        nArray5[o.lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                        if (!o.lllIIllllIlI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlIIIIl[4])) break block143;
                    }
                    o.af();
                    System.out.println(lIIIlIIIII[lIIIlIIIIl[7]]);
                    bt = lIIIlIIIIl[0];
                    return;
                }
                int[] nArray = new int[lIIIlIIIIl[7]];
                nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                nArray[o.lIIIlIIIIl[0]] = lIIIlIIIIl[10];
                nArray[o.lIIIlIIIIl[4]] = lIIIlIIIIl[8];
                nArray[o.lIIIlIIIIl[6]] = lIIIlIIIIl[11];
                if (o.lllIIllllIll(e.b(nArray) ? 1 : 0)) {
                    o.af();
                    System.out.println(lIIIlIIIII[lIIIlIIIIl[12]]);
                    bt = lIIIlIIIIl[0];
                    return;
                }
                int[] nArray6 = new int[lIIIlIIIIl[7]];
                nArray6[o.lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                nArray6[o.lIIIlIIIIl[0]] = lIIIlIIIIl[10];
                nArray6[o.lIIIlIIIIl[4]] = lIIIlIIIIl[8];
                nArray6[o.lIIIlIIIIl[6]] = lIIIlIIIIl[11];
                if (o.lllIIllllIIl(e.b(nArray6) ? 1 : 0)) {
                    int[] nArray7 = new int[lIIIlIIIIl[0]];
                    nArray7[o.lIIIlIIIIl[1]] = lIIIlIIIIl[13];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        System.out.println(lIIIlIIIII[lIIIlIIIIl[14]]);
                        bX = lIIIlIIIIl[0];
                    }
                    int[] nArray8 = new int[lIIIlIIIIl[0]];
                    nArray8[o.lIIIlIIIIl[1]] = lIIIlIIIIl[15];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                        System.out.println(lIIIlIIIII[lIIIlIIIIl[16]]);
                        bY = lIIIlIIIIl[0];
                    }
                    int[] nArray9 = new int[lIIIlIIIIl[0]];
                    nArray9[o.lIIIlIIIIl[1]] = lIIIlIIIIl[17];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        System.out.println(lIIIlIIIII[lIIIlIIIIl[18]]);
                        bZ = lIIIlIIIIl[0];
                    }
                    int[] nArray10 = new int[lIIIlIIIIl[0]];
                    nArray10[o.lIIIlIIIIl[1]] = lIIIlIIIIl[19];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                        System.out.println(lIIIlIIIII[lIIIlIIIIl[20]]);
                        ca = lIIIlIIIIl[0];
                    }
                    int[] nArray11 = new int[lIIIlIIIIl[0]];
                    nArray11[o.lIIIlIIIIl[1]] = lIIIlIIIIl[21];
                    if (o.lllIIllllIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                        System.out.println(lIIIlIIIII[lIIIlIIIIl[22]]);
                        cb = lIIIlIIIIl[0];
                    }
                    if (o.lllIIllllIIl(cb ? 1 : 0) && o.lllIIllllIIl(ca ? 1 : 0) && o.lllIIllllIIl(bZ ? 1 : 0) && o.lllIIllllIIl(bY ? 1 : 0) && o.lllIIllllIIl(bX ? 1 : 0)) {
                        return;
                    }
                    while (o.lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIIIl[23])) {
                        if (o.lllIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                            a.b(f.aO, lIIIlIIIIl[0]);
                            a.a(lIIIlIIIIl[11], lIIIlIIIIl[0]);
                            a.a(lIIIlIIIIl[8], lIIIlIIIIl[0]);
                        }
                        Movement.walkTo((WorldPoint)I);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (((0x57 ^ 0x1B ^ (0x25 ^ 0x30)) & (0x25 ^ 0x5B ^ (0x41 ^ 0x66) ^ -1)) == 0) continue;
                        return;
                    }
                    if ((!o.lllIIlllllII(Movement.getRunEnergy(), lIIIlIIIIl[24]) || o.lllIIllllIll(Vars.getBit((int)lIIIlIIIIl[25]))) && o.lllIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIIIl[23])) {
                        a.a(lIIIlIIIIl[11], lIIIlIIIIl[0]);
                        a.a(lIIIlIIIIl[8], lIIIlIIIIl[0]);
                        while (o.lllIIllllIlI(Movement.getRunEnergy(), lIIIlIIIIl[26]) && o.lllIIllllIIl(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aW).interact(lIIIlIIIII[lIIIlIIIIl[27]]);
                            Time.sleepTicks((int)lIIIlIIIIl[0]);

                            if (2 > ((0x23 ^ 0x76 ^ (0xCC ^ 0x94)) & (0xFA ^ 0x88 ^ 25 + 23 - -22 + 57 ^ -1))) continue;
                            return;
                        }
                        if (o.lllIIllllIIl(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                            Time.sleepTicks((int)lIIIlIIIIl[4]);

                            Inventory.getFirst((int[])f.aV).interact(lIIIlIIIII[lIIIlIIIIl[28]]);
                        }
                        if (o.lllIIllllIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)lIIIlIIIIl[7]);

                        }
                        Bank.depositInventory();
                    }
                }
            }
            if (!o.lllIIllllIIl(o.ab() ? 1 : 0) || !o.lllIIllllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || o.lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIIIl[23])) {
                // empty if block
            }
            if (o.lllIIllllIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && o.lllIIllllIlI(Movement.getRunEnergy(), lIIIlIIIIl[2])) {
                Inventory.getFirst((int[])f.aV).interact(lIIIlIIIII[lIIIlIIIIl[29]]);
                Time.sleepTicks((int)lIIIlIIIIl[0]);

            }
            if (o.lllIIllllIIl(o.ab() ? 1 : 0) && o.lllIIllllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (o.lllIIllllIll(bW ? 1 : 0)) {
                    if (o.lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(cc), lIIIlIIIIl[12])) {
                        AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[30]];
                        if (o.lllIIllllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)cc);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                    }
                    if (o.lllIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(cc), lIIIlIIIIl[12])) {
                        String[] stringArray = new String[lIIIlIIIIl[0]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[31]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[32]]);
                        Time.sleepTicks((int)lIIIlIIIIl[7]);

                        if (o.lllIIllllIIl(Dialog.isOpen() ? 1 : 0)) {
                            bW = lIIIlIIIIl[0];
                        }
                    }
                }
                if (o.lllIIllllIIl(bW ? 1 : 0)) {
                    g.a(lIIIlIIIII[lIIIlIIIIl[33]], bR);
                    llIIIllIIlll = Dialog.getOptions();
                    if (o.lllIIllllIll(llIIIllIIlll.isEmpty() ? 1 : 0)) {
                        int llIIIllIIllI = lIIIlIIIIl[1];
                        while (o.lllIIllllIlI(llIIIllIIllI, llIIIllIIlll.size())) {
                            if (o.lllIIllllIIl(((Widget)llIIIllIIlll.get(llIIIllIIllI)).getText().contains(lIIIlIIIII[lIIIlIIIIl[34]]) ? 1 : 0)) {
                                bW = lIIIlIIIIl[1];
                            }
                            ++llIIIllIIllI;

                            if (-1 < 1) continue;
                            return;
                        }
                    }
                }
            }
            if (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea llIIIlIIlIll;
                WorldPoint llIIIlIlIIll;
                llIIIllIIlll = new WorldPoint(lIIIlIIIIl[35], lIIIlIIIIl[36], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals(llIIIllIIlll) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[37]];
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[38]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[39]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);

                }
                WorldPoint llIIIllIIllI = new WorldPoint(lIIIlIIIIl[40], lIIIlIIIIl[41], lIIIlIIIIl[0]);
                WorldPoint llIIIllIIlIl = new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[43], lIIIlIIIIl[0]);
                WorldPoint llIIIllIIlII = new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[41], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIlII) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIllIIlIl);

                }
                WorldPoint llIIIllIIIll = new WorldPoint(lIIIlIIIIl[44], lIIIlIIIIl[43], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIllI) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[45]];
                    Movement.walkTo((WorldPoint)llIIIllIIIll);

                    Time.sleepTicks((int)lIIIlIIIIl[0]);

                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIll) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[46]];
                    Movement.walkTo((WorldPoint)llIIIllIIllI);

                    Time.sleepTicks((int)lIIIlIIIIl[0]);

                }
                WorldPoint llIIIllIIIlI = new WorldPoint(lIIIlIIIIl[47], lIIIlIIIIl[48], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIlIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIlI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[49]];
                        Movement.walkTo((WorldPoint)llIIIllIIIlI);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (-3 <= 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIlI) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[25]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[50]]);
                }
                WorldPoint llIIIllIIIIl = new WorldPoint(lIIIlIIIIl[51], lIIIlIIIIl[52], lIIIlIIIIl[0]);
                WorldPoint llIIIllIIIII = new WorldPoint(lIIIlIIIIl[53], lIIIlIIIIl[54], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIIl) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIII) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIllIIIII);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (3 > 0) continue;
                        return;
                    }
                }
                WorldPoint llIIIlIlllll = new WorldPoint(lIIIlIIIIl[55], lIIIlIIIIl[48], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIllIIIII) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlllll) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIlllll);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (1 == 1) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlllll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[56]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[57]]);
                }
                WorldPoint llIIIlIllllI = new WorldPoint(lIIIlIIIIl[58], lIIIlIIIIl[59], lIIIlIIIIl[0]);
                WorldPoint llIIIlIlllIl = new WorldPoint(lIIIlIIIIl[58], lIIIlIIIIl[54], lIIIlIIIIl[0]);
                WorldPoint llIIIlIlllII = new WorldPoint(lIIIlIIIIl[60], lIIIlIIIIl[61], lIIIlIIIIl[0]);
                if (!o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIllllI) ? 1 : 0) || o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlllIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlllII) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIlllII);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (3 == 3) continue;
                        return;
                    }
                }
                WorldArea llIIIlIllIll = new WorldArea(lIIIlIIIIl[62], lIIIlIIIIl[63], lIIIlIIIIl[31], lIIIlIIIIl[45], lIIIlIIIIl[0]);
                WorldPoint llIIIlIllIlI = new WorldPoint(lIIIlIIIIl[64], lIIIlIIIIl[61], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(llIIIlIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[65]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[23]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);

                }
                WorldPoint llIIIlIllIIl = new WorldPoint(lIIIlIIIIl[66], lIIIlIIIIl[67], lIIIlIIIIl[0]);
                WorldPoint llIIIlIllIII = new WorldPoint(lIIIlIIIIl[68], lIIIlIIIIl[69], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIllIIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIllIII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIllIII);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (3 >= 0) continue;
                        return;
                    }
                }
                WorldPoint llIIIlIlIlll = new WorldPoint(lIIIlIIIIl[70], lIIIlIIIIl[71], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIllIII) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIlIlIlll);

                    Time.sleepTicks((int)lIIIlIIIIl[0]);

                }
                WorldPoint llIIIlIlIllI = new WorldPoint(lIIIlIIIIl[72], lIIIlIIIIl[73], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIlll) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIllI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIlIllI);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (-(0x53 ^ 0x56) < 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIllI) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[74]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[75]]);
                }
                WorldArea llIIIlIlIlIl = new WorldArea(lIIIlIIIIl[76], lIIIlIIIIl[77], lIIIlIIIIl[16], lIIIlIIIIl[25], lIIIlIIIIl[0]);
                WorldPoint llIIIlIlIlII = new WorldPoint(lIIIlIIIIl[78], lIIIlIIIIl[79], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(llIIIlIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    llIIIlIlIIll = new WorldPoint(lIIIlIIIIl[72], lIIIlIIIIl[80], lIIIlIIIIl[0]);
                    if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIll) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llIIIlIlIIll.getX(), llIIIlIlIIll.getY() + lIIIlIIIIl[14], lIIIlIIIIl[0]));

                        Time.sleepTicks((int)lIIIlIIIIl[18]);

                    }
                    if (o.lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(llIIIlIlIlII), lIIIlIIIIl[7])) {
                        Movement.walkTo((WorldPoint)llIIIlIlIlII);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                    }
                    if (o.lllIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(llIIIlIlIlII), lIIIlIIIIl[7])) {
                        String[] stringArray = new String[lIIIlIIIIl[0]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[81]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[82]]);
                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                    }
                }
                llIIIlIlIIll = new WorldPoint(lIIIlIIIIl[78], lIIIlIIIIl[83], lIIIlIIIIl[0]);
                WorldPoint llIIIlIlIIlI = new WorldPoint(lIIIlIIIIl[70], lIIIlIIIIl[84], lIIIlIIIIl[0]);
                WorldPoint llIIIlIlIIIl = new WorldPoint(lIIIlIIIIl[85], lIIIlIIIIl[83], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIll) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIlI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIlIIlI);

                        Time.sleepTicks((int)lIIIlIIIIl[4]);

                        if (-1 == -1) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIlI) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIIl) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIlIIIl);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (3 > 2) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIIl) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[86]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[87]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);

                }
                WorldPoint llIIIlIlIIII = new WorldPoint(lIIIlIIIIl[85], lIIIlIIIIl[79], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIllll = new WorldPoint(lIIIlIIIIl[88], lIIIlIIIIl[79], lIIIlIIIIl[0]);
                if (!o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIlIIII) ? 1 : 0) || o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIllll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[89]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[90]]);
                }
                WorldPoint llIIIlIIlllI = new WorldPoint(lIIIlIIIIl[85], lIIIlIIIIl[91], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIllIl = new WorldPoint(lIIIlIIIIl[88], lIIIlIIIIl[91], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIllII = new WorldPoint(lIIIlIIIIl[92], lIIIlIIIIl[93], lIIIlIIIIl[0]);
                if (!o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIlllI) ? 1 : 0) || o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIllIl) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIllII) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIIllII);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if ((0x46 ^ 0x42) != 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIllII) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[94]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[95]]);
                }
                if (o.lllIIllllIIl((llIIIlIIlIll = new WorldArea(lIIIlIIIIl[96], lIIIlIIIIl[97], lIIIlIIIIl[6], lIIIlIIIIl[12], lIIIlIIIIl[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[98]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[99]]);
                    Time.sleepTicks((int)lIIIlIIIIl[6]);

                }
                WorldPoint llIIIlIIlIlI = new WorldPoint(lIIIlIIIIl[100], lIIIlIIIIl[101], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIlIIl = new WorldPoint(lIIIlIIIIl[100], lIIIlIIIIl[101], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIlIII = new WorldPoint(lIIIlIIIIl[102], lIIIlIIIIl[101], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIlll = new WorldPoint(lIIIlIIIIl[103], lIIIlIIIIl[101], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIlll) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIlIlI) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIIlIlI);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (2 < (57 + 65 - 61 + 77 ^ 77 + 45 - 92 + 112)) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIlIIl) ? 1 : 0)) {
                    while (o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIlIII) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIIlIII);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (-3 < 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIlIII) ? 1 : 0)) {
                    int[] nArray = new int[lIIIlIIIIl[0]];
                    nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[104];
                    TileItems.getNearest((int[])nArray).interact(lIIIlIIIII[lIIIlIIIIl[105]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);

                }
                int[] nArray = new int[lIIIlIIIIl[0]];
                nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[104];
                if (o.lllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    if (o.lllIIllllIIl(Widgets.get((int)lIIIlIIIIl[106]).isEmpty() ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[0]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[107]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[108]]);
                        Time.sleepTicks((int)lIIIlIIIIl[6]);

                    }
                    if (o.lllIIllllIll(Widgets.get((int)lIIIlIIIIl[106]).isEmpty() ? 1 : 0)) {
                        Widgets.get((int)lIIIlIIIIl[106], (int)lIIIlIIIIl[12]).interact(lIIIlIIIII[lIIIlIIIIl[109]]);
                        Time.sleepTicks((int)lIIIlIIIIl[4]);

                    }
                }
                WorldPoint llIIIlIIIllI = new WorldPoint(lIIIlIIIIl[110], lIIIlIIIIl[111], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIlIl = new WorldPoint(lIIIlIIIIl[112], lIIIlIIIIl[113], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIlII = new WorldPoint(lIIIlIIIIl[114], lIIIlIIIIl[115], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIIll = new WorldPoint(lIIIlIIIIl[114], lIIIlIIIIl[116], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIIlI = new WorldPoint(lIIIlIIIIl[117], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIIIl = new WorldPoint(lIIIlIIIIl[119], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint llIIIlIIIIII = new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[113], lIIIlIIIIl[0]);
                WorldPoint llIIIIllllll = new WorldPoint(lIIIlIIIIl[120], lIIIlIIIIl[113], lIIIlIIIIl[0]);
                WorldPoint llIIIIlllllI = new WorldPoint(lIIIlIIIIl[44], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint llIIIIllllIl = new WorldPoint(lIIIlIIIIl[121], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint llIIIIllllII = new WorldPoint(lIIIlIIIIl[122], lIIIlIIIIl[123], lIIIlIIIIl[0]);
                WorldPoint llIIIIlllIll = new WorldPoint(lIIIlIIIIl[122], lIIIlIIIIl[124], lIIIlIIIIl[0]);
                WorldPoint llIIIIlllIlI = new WorldPoint(lIIIlIIIIl[125], lIIIlIIIIl[124], lIIIlIIIIl[0]);
                WorldPoint llIIIIlllIIl = new WorldPoint(lIIIlIIIIl[125], lIIIlIIIIl[123], lIIIlIIIIl[0]);
                WorldPoint llIIIIlllIII = new WorldPoint(lIIIlIIIIl[120], lIIIlIIIIl[126], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIlll = new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[126], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIllI = new WorldPoint(lIIIlIIIIl[127], lIIIlIIIIl[123], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIllI) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[128]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[129]]);
                    Time.sleepTicks((int)lIIIlIIIIl[4]);

                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIlIl) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIlIIIlII);

                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIlII) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[130]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[2]]);
                    Time.sleepTicks((int)lIIIlIIIIl[4]);

                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIll) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIlI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIIIIlI);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        return;
                    }
                }
                if (!(o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIlI) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIII) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllllI) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIllllII) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllIlI) ? 1 : 0) && o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllIII) ? 1 : 0) && !o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIllI) ? 1 : 0))) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[131]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[132]]);
                    Time.sleepTicks((int)lIIIlIIIIl[4]);

                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIlIIIIII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIlIIIIII);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllllll) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllllI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlllllI);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (3 != 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllllIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIllllII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIllllII);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (2 >= 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllIll) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllIlI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlllIlI);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (1 <= 3) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlllIIl) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIIlllIII);

                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIlll) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)llIIIIllIllI);

                }
                WorldPoint llIIIIllIlIl = new WorldPoint(lIIIlIIIIl[127], lIIIlIIIIl[124], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIlII = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIIll = new WorldPoint(lIIIlIIIIl[110], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIIlI = new WorldPoint(lIIIlIIIIl[135], lIIIlIIIIl[136], lIIIlIIIIl[0]);
                WorldPoint llIIIIllIIIl = new WorldPoint(lIIIlIIIIl[137], lIIIlIIIIl[136], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIlIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIlII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIllIlII);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (((0x18 ^ 0x3D) & ~(0xB1 ^ 0x94)) == 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIlII) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIll) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIllIIll);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (((0x9E ^ 0xBF) & ~(0xE2 ^ 0xC3)) >= 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[138]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[139]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);

                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIlI) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIIl) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIllIIIl);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (1 < 3) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIIl) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[140]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[141]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);

                }
                WorldPoint llIIIIllIIII = new WorldPoint(lIIIlIIIIl[142], lIIIlIIIIl[136], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIllll = new WorldPoint(lIIIlIIIIl[143], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIlllI = new WorldPoint(lIIIlIIIIl[144], lIIIlIIIIl[145], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIllIl = new WorldPoint(lIIIlIIIIl[144], lIIIlIIIIl[73], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIllII = new WorldPoint(lIIIlIIIIl[144], lIIIlIIIIl[146], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIlIll = new WorldPoint(lIIIlIIIIl[147], lIIIlIIIIl[148], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIlIlI = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[71], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIlIIl = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[149], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIlIII = new WorldPoint(lIIIlIIIIl[150], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIllIIII) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIlIII);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (1 > 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIII) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllll) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIllll);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (-3 <= 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllll) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlllI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIlllI);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (-1 < 1) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlllI) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllIl) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIllIl);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if ((0x5C ^ 0x22 ^ (0x7B ^ 1)) > 3) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllIl) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllII) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIllII);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (1 >= 0) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIllII) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIll) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIlIll);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        if (3 > ((0xD6 ^ 0x9C) & ~(0x34 ^ 0x7E))) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIll) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIIIIl[0]];
                    stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[151]];
                    TileItems.getNearest((String[])stringArray).interact(lIIIlIIIII[lIIIlIIIIl[152]]);
                }
                WorldArea llIIIIlIIlll = new WorldArea(lIIIlIIIIl[150], lIIIlIIIIl[153], lIIIlIIIIl[25], lIIIlIIIIl[32], lIIIlIIIIl[0]);
                String[] stringArray = new String[lIIIlIIIIl[0]];
                stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[154]];
                if (o.lllIIllllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIlIIIIl[0]];
                    stringArray2[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[155]];
                    if (o.lllIlIIIIIIl(Inventory.getFirst((String[])stringArray2).getQuantity(), lIIIlIIIIl[12])) {
                        String[] stringArray3 = new String[lIIIlIIIIl[0]];
                        stringArray3[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[156]];
                        int[] nArray12 = new int[lIIIlIIIIl[0]];
                        nArray12[o.lIIIlIIIIl[1]] = lIIIlIIIIl[157];
                        Inventory.getFirst((String[])stringArray3).useOn((Actor)NPCs.getNearest((int[])nArray12));
                    }
                    String[] stringArray4 = new String[lIIIlIIIIl[0]];
                    stringArray4[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[158]];
                    if (o.lllIlIIIIIIl(Inventory.getFirst((String[])stringArray4).getQuantity(), lIIIlIIIIl[7]) && o.lllIIllllIIl(llIIIIlIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIlI) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)llIIIIlIlIlI);

                            Time.sleepTicks((int)lIIIlIIIIl[0]);

                            if (-1 <= 0) continue;
                            return;
                        }
                    }
                }
                WorldPoint llIIIIlIIllI = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[159], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIIlIl = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[160], lIIIlIIIIl[0]);
                WorldPoint llIIIIlIIlII = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[149], lIIIlIIIIl[0]);
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIlI) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIIllI) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIIllI);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        Movement.toggleRun();

                        if (3 <= (0x9E ^ 0xB2 ^ (0xB4 ^ 0x9C))) continue;
                        return;
                    }
                }
                if (o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIIllI) ? 1 : 0)) {
                    while (o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIlIIl) ? 1 : 0) && o.lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)llIIIIlIlIIl);

                        Time.sleepTicks((int)lIIIlIIIIl[0]);

                        Movement.toggleRun();

                        if (2 > 0) continue;
                        return;
                    }
                }
                if (!o.lllIIllllIll(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIIlIl) ? 1 : 0) || o.lllIIllllIIl(Players.getLocal().getWorldLocation().equals((Object)llIIIIlIIlII) ? 1 : 0)) {
                    String[] stringArray5 = new String[lIIIlIIIIl[0]];
                    stringArray5[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[161]];
                    TileObjects.getNearest((String[])stringArray5).interact(lIIIlIIIII[lIIIlIIIIl[162]]);
                    Time.sleepTicks((int)lIIIlIIIIl[0]);

                }
            }
            int[] nArray = new int[lIIIlIIIIl[0]];
            nArray[o.lIIIlIIIIl[1]] = lIIIlIIIIl[3];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (o.lllIIllllIll(Dialog.isOpen() ? 1 : 0)) {
                    int[] nArray13 = new int[lIIIlIIIIl[0]];
                    nArray13[o.lIIIlIIIIl[1]] = lIIIlIIIIl[3];
                    Inventory.getFirst((int[])nArray13).interact(lIIIlIIIII[lIIIlIIIIl[163]]);
                    Time.sleepTicks((int)lIIIlIIIIl[4]);

                }
                if (o.lllIIllllIIl(Dialog.isOpen() ? 1 : 0)) {
                    if (o.lllIIllllIll(bX ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[4]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[164]];
                        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[165]];
                        g.a(stringArray);
                    }
                    if (o.lllIIllllIIl(bX ? 1 : 0) && o.lllIIllllIll(bY ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[4]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[166]];
                        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[167]];
                        g.a(stringArray);
                    }
                    if (o.lllIIllllIIl(bX ? 1 : 0) && o.lllIIllllIIl(bY ? 1 : 0) && o.lllIIllllIll(bZ ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[4]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[168]];
                        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[169]];
                        g.a(stringArray);
                    }
                    if (o.lllIIllllIIl(bX ? 1 : 0) && o.lllIIllllIIl(bY ? 1 : 0) && o.lllIIllllIIl(bZ ? 1 : 0) && o.lllIIllllIll(ca ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[4]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[170]];
                        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[171]];
                        g.a(stringArray);
                    }
                    if (o.lllIIllllIIl(bX ? 1 : 0) && o.lllIIllllIIl(bY ? 1 : 0) && o.lllIIllllIIl(bZ ? 1 : 0) && o.lllIIllllIIl(ca ? 1 : 0) && o.lllIIllllIll(cb ? 1 : 0)) {
                        String[] stringArray = new String[lIIIlIIIIl[4]];
                        stringArray[o.lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[172]];
                        stringArray[o.lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[173]];
                        g.a(stringArray);
                    }
                }
            }
            int[] nArray14 = new int[lIIIlIIIIl[0]];
            nArray14[o.lIIIlIIIIl[1]] = lIIIlIIIIl[13];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[174]]);
                bX = lIIIlIIIIl[0];
            }
            int[] nArray15 = new int[lIIIlIIIIl[0]];
            nArray15[o.lIIIlIIIIl[1]] = lIIIlIIIIl[15];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[175]]);
                bY = lIIIlIIIIl[0];
            }
            int[] nArray16 = new int[lIIIlIIIIl[0]];
            nArray16[o.lIIIlIIIIl[1]] = lIIIlIIIIl[17];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[176]]);
                bZ = lIIIlIIIIl[0];
            }
            int[] nArray17 = new int[lIIIlIIIIl[0]];
            nArray17[o.lIIIlIIIIl[1]] = lIIIlIIIIl[19];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[177]]);
                ca = lIIIlIIIIl[0];
            }
            int[] nArray18 = new int[lIIIlIIIIl[0]];
            nArray18[o.lIIIlIIIIl[1]] = lIIIlIIIIl[21];
            if (o.lllIIllllIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[26]]);
                cb = lIIIlIIIIl[0];
            }
            g.a(bR);
        }
    }
}

