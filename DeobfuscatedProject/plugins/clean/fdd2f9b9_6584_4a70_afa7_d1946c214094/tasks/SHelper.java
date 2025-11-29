/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.FHelper;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.UHelper;
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
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class SHelper
implements G {
    public static  boolean bt;
    
    private static  WorldPoint cE;
    static  int ck;
    private static  WorldPoint cD;
    private static  WorldPoint cG;
    private static  WorldPoint cB;
    public static  List<d> bv;
    private static  WorldPoint cC;
    public static  boolean cv;
    
    public static  boolean cu;
    public static  boolean cw;
    static  int cz;
    public static  boolean cy;
    
    static  boolean cl;
    private static  WorldPoint cA;
    private static  WorldPoint cF;
    public static  boolean cx;

    private static boolean lllIlIllIlIl(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIIIlIlIIl[0]];
        stringArray[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[73]];
        if (s.lllIlIllIllI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIIlIlIIl[0]];
            nArray[s.lIIIlIlIIl[1]] = lIIIlIlIIl[7];
            if (s.lllIlIllIllI(Inventory.getCount((int[])nArray)) && s.lllIlIllIllI(Inventory.getCount((int[])f.aV))) {
                int[] nArray2 = new int[lIIIlIlIIl[0]];
                nArray2[s.lIIIlIlIIl[1]] = lIIIlIlIIl[8];
                if (s.lllIlIllIllI(Inventory.getCount((int[])nArray2))) {
                    n2 = lIIIlIlIIl[0];

                    if ((0x88 ^ 0x9F ^ (0 ^ 0x13)) >= (5 + 94 - 98 + 135 ^ 68 + 58 - -12 + 2)) return n2 != 0;
                    return ((0x67 ^ 0x1F ^ (0x49 ^ 0x74)) & (83 + 63 - 21 + 120 ^ 5 + 129 - -41 + 1 ^ -1)) != 0;
                }
            }
        }
        n2 = lIIIlIlIIl[1];
        return n2 != 0;
    }

    private static boolean lllIlIllIllI(int n2) {
        return n2 > 0;
    }

    private static void lllIlIlIlllI() {
        lIIIlIlIII = new String[lIIIlIlIIl[125]];
        s.lIIIlIlIII[s.lIIIlIlIIl[1]] = "Finished buying items, switching back to quest";
        s.lIIIlIlIII[s.lIIIlIlIIl[0]] = "Nav to bank";
        s.lIIIlIlIII[s.lIIIlIlIIl[5]] = "Handling banking";
        s.lIIIlIlIII[s.lIIIlIlIIl[10]] = "We are missing quest supplies, switching to BUYING";
        s.lIIIlIlIII[s.lIIIlIlIIl[6]] = "Eat";
        s.lIIIlIlIII[s.lIIIlIlIIl[13]] = "Drink";
        s.lIIIlIlIII[s.lIIIlIlIIl[17]] = "Nav to start";
        s.lIIIlIlIII[s.lIIIlIlIIl[18]] = "Starting quest";
        s.lIIIlIlIII[s.lIIIlIlIIl[2]] = "Veos";
        s.lIIIlIlIII[s.lIIIlIlIIl[24]] = "Enchanted scroll";
        s.lIIIlIlIII[s.lIIIlIlIIl[12]] = "Feather";
        s.lIIIlIlIII[s.lIIIlIlIIl[25]] = "Enchanted quill";
        s.lIIIlIlIII[s.lIIIlIlIIl[15]] = "Enchanted scroll";
        s.lIIIlIlIII[s.lIIIlIlIIl[26]] = "Feather";
        s.lIIIlIlIII[s.lIIIlIlIIl[27]] = "Enchanted quill";
        s.lIIIlIlIII[s.lIIIlIlIIl[28]] = "Nav to pisc tile";
        s.lIIIlIlIII[s.lIIIlIlIIl[29]] = "Talking pisc";
        s.lIIIlIlIII[s.lIIIlIlIIl[30]] = "Leenz";
        s.lIIIlIlIII[s.lIIIlIlIIl[31]] = "Finished pisc";
        s.lIIIlIlIII[s.lIIIlIlIIl[32]] = "Nav to arc tile";
        s.lIIIlIlIII[s.lIIIlIlIIl[33]] = "Talking arc";
        s.lIIIlIlIII[s.lIIIlIlIIl[34]] = "Regath";
        s.lIIIlIlIII[s.lIIIlIlIIl[35]] = "Finished arc";
        s.lIIIlIlIII[s.lIIIlIlIIl[36]] = "Nav to lova tile";
        s.lIIIlIlIII[s.lIIIlIlIIl[37]] = "Talking lova";
        s.lIIIlIlIII[s.lIIIlIlIIl[38]] = "Munty";
        s.lIIIlIlIII[s.lIIIlIlIIl[39]] = "Finished munty";
        s.lIIIlIlIII[s.lIIIlIlIIl[40]] = "Nav to shyzien tile";
        s.lIIIlIlIII[s.lIIIlIlIIl[41]] = "Talking shyzien";
        s.lIIIlIlIII[s.lIIIlIlIIl[42]] = "Jennifer";
        s.lIIIlIlIII[s.lIIIlIlIIl[43]] = "Finished shyzien";
        s.lIIIlIlIII[s.lIIIlIlIIl[44]] = "Nav to hosidius tile";
        s.lIIIlIlIII[s.lIIIlIlIIl[45]] = "Talking hosidius";
        s.lIIIlIlIII[s.lIIIlIlIIl[46]] = "Horace";
        s.lIIIlIlIII[s.lIIIlIlIIl[47]] = "Finished hosidius";
        s.lIIIlIlIII[s.lIIIlIlIIl[48]] = "Nav to start";
        s.lIIIlIlIII[s.lIIIlIlIIl[49]] = "talking veos";
        s.lIIIlIlIII[s.lIIIlIlIIl[50]] = "Veos";
        s.lIIIlIlIII[s.lIIIlIlIIl[51]] = "Nav to dark altar";
        s.lIIIlIlIII[s.lIIIlIlIIl[52]] = "Mysterious orb";
        s.lIIIlIlIII[s.lIIIlIlIIl[53]] = "Mysterious orb";
        s.lIIIlIlIII[s.lIIIlIlIIl[54]] = "Activate";
        s.lIIIlIlIII[s.lIIIlIlIIl[55]] = "Nav to start";
        s.lIIIlIlIII[s.lIIIlIlIIl[56]] = "talking veos";
        s.lIIIlIlIII[s.lIIIlIlIIl[57]] = "Veos";
        s.lIIIlIlIII[s.lIIIlIlIIl[58]] = "Antique lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[60]] = "Rubbing lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[61]] = "Antique lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[62]] = "Rub";
        s.lIIIlIlIII[s.lIIIlIlIIl[63]] = "Selecting slayer";
        s.lIIIlIlIII[s.lIIIlIlIIl[64]] = "Slayer";
        s.lIIIlIlIII[s.lIIIlIlIIl[65]] = "Confirm";
        s.lIIIlIlIII[s.lIIIlIlIIl[66]] = "Antique lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[67]] = "Rubbing lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[68]] = "Antique lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[69]] = "Rub";
        s.lIIIlIlIII[s.lIIIlIlIIl[70]] = "Selecting slayer";
        s.lIIIlIlIII[s.lIIIlIlIIl[71]] = "Slayer";
        s.lIIIlIlIII[s.lIIIlIlIIl[72]] = "Confirm";
        s.lIIIlIlIII[s.lIIIlIlIIl[73]] = "Feather";
        s.lIIIlIlIII[s.lIIIlIlIIl[78]] = "Client of Kourend";
        s.lIIIlIlIII[s.lIIIlIlIIl[79]] = "Antique lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[80]] = "ring of wealth (";
        s.lIIIlIlIII[s.lIIIlIlIIl[81]] = "Can I ask you about Hosidius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[82]] = "let's trade.";
        s.lIIIlIlIII[s.lIIIlIlIIl[16]] = "Let's trade.";
        s.lIIIlIlIII[s.lIIIlIlIIl[83]] = "Can I ask you about Shayzien?";
        s.lIIIlIlIII[s.lIIIlIlIIl[84]] = "Let's trade.";
        s.lIIIlIlIII[s.lIIIlIlIIl[85]] = "Can I ask you about Lovakengj?";
        s.lIIIlIlIII[s.lIIIlIlIIl[86]] = "Let's trade.";
        s.lIIIlIlIII[s.lIIIlIlIIl[87]] = "Can I ask you about Arceuus?";
        s.lIIIlIlIII[s.lIIIlIlIIl[88]] = "I don't need anything.";
        s.lIIIlIlIII[s.lIIIlIlIIl[89]] = "Can I ask you about Port Piscarilius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[90]] = "I don't need anything right now.";
        s.lIIIlIlIII[s.lIIIlIlIIl[105]] = "Have you got any quests for me?";
        s.lIIIlIlIII[s.lIIIlIlIIl[106]] = "Yes.";
        s.lIIIlIlIII[s.lIIIlIlIIl[107]] = "yes.";
        s.lIIIlIlIII[s.lIIIlIlIIl[108]] = "Can I ask you about Port Piscarilius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[109]] = "Why should I gain favour with Port Piscarilius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[110]] = "Can I ask you about Port Arceuus?";
        s.lIIIlIlIII[s.lIIIlIlIIl[111]] = "Can I ask you about Arceuus?";
        s.lIIIlIlIII[s.lIIIlIlIIl[112]] = "Why should I gain favour with Arceuus?";
        s.lIIIlIlIII[s.lIIIlIlIIl[113]] = "Can I ask you about Lovakengj?";
        s.lIIIlIlIII[s.lIIIlIlIIl[114]] = "Why should I gain favour with Lovakengj?";
        s.lIIIlIlIII[s.lIIIlIlIIl[115]] = "Can I ask you about Shayzien?";
        s.lIIIlIlIII[s.lIIIlIlIIl[116]] = "Why should I gain favour with Shayzien?";
        s.lIIIlIlIII[s.lIIIlIlIIl[117]] = "Can I ask you about Hosidius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[118]] = "Why should I gain favour with Hosidius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[119]] = "What is there to do in Port Piscarilius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[120]] = "What is there to do in Arceuus?";
        s.lIIIlIlIII[s.lIIIlIlIIl[121]] = "What is there to do in Lovakengj?";
        s.lIIIlIlIII[s.lIIIlIlIIl[122]] = "What is there to do in Shayzien?";
        s.lIIIlIlIII[s.lIIIlIlIIl[123]] = "What is there to do in Hosidius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[124]] = "Let's talk about your client...";
    }

    @Override
    public String U() {
        return lIIIlIlIII[lIIIlIlIIl[78]];
    }

    @Override
    public boolean S() {
        return lIIIlIlIIl[1];
    }

    public static void aI() {
        String[] stringArray = new String[lIIIlIlIIl[0]];
        stringArray[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[66]];
        if (s.lllIlIllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (s.lllIlIllIlIl(Widgets.get((int)lIIIlIlIIl[59]))) {
                Widget lIlIIIllllII;
                AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[67]];
                String[] stringArray2 = new String[lIIIlIlIIl[0]];
                stringArray2[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[68]];
                Inventory.getFirst((String[])stringArray2).interact(lIIIlIlIII[lIIIlIlIIl[69]]);
                Time.sleepTicks((int)lIIIlIlIIl[6]);

                AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[70]];
                Widget widget = Widgets.get((int)lIIIlIlIIl[59], (int)lIIIlIlIIl[27]);
                if (s.lllIlIllIlIl(widget)) {
                    widget.interact(lIIIlIlIII[lIIIlIlIIl[71]]);
                    Time.sleepTicks((int)lIIIlIlIIl[0]);

                }
                if (s.lllIlIllIlIl(lIlIIIllllII = Widgets.get((int)lIIIlIlIIl[59], (int)lIIIlIlIIl[39]))) {
                    lIlIIIllllII.interact(lIIIlIlIII[lIIIlIlIIl[72]]);
                    Time.sleepTicks((int)lIIIlIlIIl[5]);

                }
            }
            Time.sleepTicks((int)lIIIlIlIIl[0]);

        }
    }

    @Override
    public int T() {
        try {
            s.aH();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xE6 ^ 0xBD) & ~(7 ^ 0x5C)) != 0) {
            return (3 ^ 0x60) & ~(0x27 ^ 0x44);
        }
        return lIIIlIlIIl[77];
    }

    private static void af() {
        d lIlIIIlllIII;
        Object lIlIIIlllIIl;
        int[] nArray = new int[lIIIlIlIIl[0]];
        nArray[s.lIIIlIlIIl[1]] = lIIIlIlIIl[9];
        if (s.lllIlIllIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIIlIlIIl[9], lIIIlIlIIl[12], lIIIlIlIIl[74]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIIIlIlIIl[0]];
        nArray2[s.lIIIlIlIIl[1]] = lIIIlIlIIl[11];
        if (s.lllIlIllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlIIIlllIIl = new DHelper(lIIIlIlIIl[11], lIIIlIlIIl[13], i.bq);
            bv.add((DHelper) IlIIIlllIIl);

        }
        if (s.lllIlIllIIlI(Bank.contains(lIlIIIlllIIl = item -> item.getName().toLowerCase().contains(lIIIlIlIII[lIIIlIlIIl[80]])) ? 1 : 0)) {
            lIlIIIlllIII = new DHelper(lIIIlIlIIl[75], lIIIlIlIIl[13], lIIIlIlIIl[76]);
            bv.add(lIlIIIlllIII);

        }
        int[] nArray3 = new int[lIIIlIlIIl[0]];
        nArray3[s.lIIIlIlIIl[1]] = lIIIlIlIIl[7];
        if (s.lllIlIllIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlIIIlllIII = new DHelper(lIIIlIlIIl[7], lIIIlIlIIl[53], lIIIlIlIIl[74]);
            bv.add(lIlIIIlllIII);

        }
        int[] nArray4 = new int[lIIIlIlIIl[0]];
        nArray4[s.lIIIlIlIIl[1]] = lIIIlIlIIl[8];
        if (s.lllIlIllIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlIIIlllIII = new DHelper(lIIIlIlIIl[8], lIIIlIlIIl[12], lIIIlIlIIl[74]);
            bv.add(lIlIIIlllIII);

        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean V() {
        int n2;
        if (s.lllIlIllIIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[24])) {
            String[] stringArray = new String[lIIIlIlIIl[0]];
            stringArray[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[79]];
            if (s.lllIlIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = lIIIlIlIIl[0];

                if (1 != -1) return n2 != 0;
                return false;
            }
        }
        n2 = lIIIlIlIIl[1];
        return n2 != 0;
    }

    private static boolean lllIlIllIlII(int n2, int n3) {
        return n2 == n3;
    }

    public static void aH() {
        block80: {
            Widget lIlIIlIIIIll;
            Object lIlIIlIIIlII;
            block82: {
                block81: {
                    if (s.lllIlIllIIII(bt ? 1 : 0)) {
                        b.a(bv);
                        if (s.lllIlIllIIIl(bv.size(), lIIIlIlIIl[0])) {
                            System.out.println(lIIIlIlIII[lIIIlIlIIl[1]]);
                            bt = lIIIlIlIIl[1];
                        }
                    }
                    if (!s.lllIlIllIIlI(bt ? 1 : 0)) break block80;
                    if (!s.lllIlIllIIll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIlIIl[2])) break block81;
                    int[] nArray = new int[lIIIlIlIIl[0]];
                    nArray[s.lIIIlIlIIl[1]] = lIIIlIlIIl[3];
                    if (!s.lllIlIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block82;
                }
                F.cm();
            }
            if (s.lllIlIllIIlI(s.ab() ? 1 : 0) && s.lllIlIllIIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[0]) && s.lllIlIllIlII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIlIIl[2])) {
                int[] nArray = new int[lIIIlIlIIl[0]];
                nArray[s.lIIIlIlIIl[1]] = lIIIlIlIIl[3];
                if (s.lllIlIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    lIlIIlIIIlII = BankLocation.getNearest();
                    if (s.lllIlIllIlIl(lIlIIlIIIlII) && s.lllIlIllIIlI(lIlIIlIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[0]];
                        a.a((BankLocation)lIlIIlIIIlII);
                    }
                    if (s.lllIlIllIlIl(lIlIIlIIIlII) && s.lllIlIllIIII(lIlIIlIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (s.lllIlIllIIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlIlIIl[4]);

                        }
                        if (s.lllIlIllIIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[5]];
                            if (s.lllIlIllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIlIlIIl[6]);

                            }
                            if (s.lllIlIllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIlIlIIl[5]);

                            }
                            int[] nArray2 = new int[lIIIlIlIIl[6]];
                            nArray2[s.lIIIlIlIIl[1]] = lIIIlIlIIl[7];
                            nArray2[s.lIIIlIlIIl[0]] = lIIIlIlIIl[8];
                            nArray2[s.lIIIlIlIIl[5]] = lIIIlIlIIl[9];
                            nArray2[s.lIIIlIlIIl[10]] = lIIIlIlIIl[11];
                            if (s.lllIlIllIIlI(e.b(nArray2) ? 1 : 0)) {
                                s.af();
                                System.out.println(lIIIlIlIII[lIIIlIlIIl[10]]);
                                bt = lIIIlIlIIl[0];
                                return;
                            }
                            int[] nArray3 = new int[lIIIlIlIIl[6]];
                            nArray3[s.lIIIlIlIIl[1]] = lIIIlIlIIl[7];
                            nArray3[s.lIIIlIlIIl[0]] = lIIIlIlIIl[8];
                            nArray3[s.lIIIlIlIIl[5]] = lIIIlIlIIl[9];
                            nArray3[s.lIIIlIlIIl[10]] = lIIIlIlIIl[11];
                            if (s.lllIlIllIIII(e.b(nArray3) ? 1 : 0)) {
                                a.a(lIIIlIlIIl[7], lIIIlIlIIl[12]);
                                a.a(lIIIlIlIIl[8], lIIIlIlIIl[12]);
                                a.a(lIIIlIlIIl[9], lIIIlIlIIl[0]);
                                a.a(lIIIlIlIIl[11], lIIIlIlIIl[13]);
                                a.a(lIIIlIlIIl[14], lIIIlIlIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] nArray = new int[lIIIlIlIIl[0]];
            nArray[s.lIIIlIlIIl[1]] = lIIIlIlIIl[14];
            if (s.lllIlIllIIII(Inventory.contains((int[])nArray) ? 1 : 0) && s.lllIlIllIIll(Combat.getMissingHealth(), lIIIlIlIIl[15])) {
                int[] nArray4 = new int[lIIIlIlIIl[0]];
                nArray4[s.lIIIlIlIIl[1]] = lIIIlIlIIl[14];
                Inventory.getFirst((int[])nArray4).interact(lIIIlIlIII[lIIIlIlIIl[6]]);
                Time.sleepTicks((int)lIIIlIlIIl[5]);

            }
            if (s.lllIlIllIIII(Inventory.contains((int[])f.aV) ? 1 : 0) && s.lllIlIllIIIl(Movement.getRunEnergy(), lIIIlIlIIl[16])) {
                Inventory.getFirst((int[])f.aV).interact(lIIIlIlIII[lIIIlIlIIl[13]]);
                Time.sleepTicks((int)lIIIlIlIIl[0]);

            }
            if (s.lllIlIllIIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[0]) && s.lllIlIllIIII(s.ab() ? 1 : 0) && s.lllIlIllIlII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIlIIl[2])) {
                int[] nArray5 = new int[lIIIlIlIIl[0]];
                nArray5[s.lIIIlIlIIl[1]] = lIIIlIlIIl[3];
                if (s.lllIlIllIIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    if (s.lllIlIllIIlI(Players.getLocal().getWorldLocation().equals((Object)cA) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[17]];
                        if (s.lllIlIllIIII(Dialog.isOpen() ? 1 : 0) && s.lllIlIllIIIl(cz, lIIIlIlIIl[5])) {
                            Dialog.close();
                            cz += lIIIlIlIIl[0];
                        }
                        e.a(cA);
                    }
                    if (s.lllIlIllIIII(Players.getLocal().getWorldLocation().equals((Object)cA) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[18]];
                        g.a(lIIIlIlIII[lIIIlIlIIl[2]], bR);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit((int)lIIIlIlIIl[19]));
            System.out.println("5621: " + Vars.getBit((int)lIIIlIlIIl[20]));
            System.out.println("5622: " + Vars.getBit((int)lIIIlIlIIl[21]));
            System.out.println("5623: " + Vars.getBit((int)lIIIlIlIIl[22]));
            System.out.println("5624: " + Vars.getBit((int)lIIIlIlIIl[23]));
            if (s.lllIlIllIlII(Vars.getBit((int)lIIIlIlIIl[19]), lIIIlIlIIl[0])) {
                cu = lIIIlIlIIl[0];
            }
            if (s.lllIlIllIlII(Vars.getBit((int)lIIIlIlIIl[20]), lIIIlIlIIl[0])) {
                cv = lIIIlIlIIl[0];
            }
            if (s.lllIlIllIlII(Vars.getBit((int)lIIIlIlIIl[21]), lIIIlIlIIl[0])) {
                cw = lIIIlIlIIl[0];
            }
            if (s.lllIlIllIlII(Vars.getBit((int)lIIIlIlIIl[22]), lIIIlIlIIl[0])) {
                cx = lIIIlIlIIl[0];
            }
            if (s.lllIlIllIlII(Vars.getBit((int)lIIIlIlIIl[23]), lIIIlIlIIl[0])) {
                cy = lIIIlIlIIl[0];
            }
            if (s.lllIlIllIlII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[0])) {
                int lIlIIlIIIIlI;
                ck = lIIIlIlIIl[1];
                if (s.lllIlIllIIlI(cu ? 1 : 0)) {
                    String[] stringArray = new String[lIIIlIlIIl[0]];
                    stringArray[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[24]];
                    if (s.lllIlIllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray2 = new String[lIIIlIlIIl[0]];
                        stringArray2[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[12]];
                        if (s.lllIlIllIIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[lIIIlIlIIl[0]];
                            stringArray3[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[25]];
                            if (s.lllIlIllIIlI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                String[] stringArray4 = new String[lIIIlIlIIl[0]];
                                stringArray4[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[15]];
                                String[] stringArray5 = new String[lIIIlIlIIl[0]];
                                stringArray5[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[26]];
                                Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((String[])stringArray5));
                                Time.sleepTicks((int)lIIIlIlIIl[5]);

                            }
                        }
                    }
                    String[] stringArray6 = new String[lIIIlIlIIl[0]];
                    stringArray6[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[27]];
                    if (s.lllIlIllIIII(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (s.lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cB), lIIIlIlIIl[2])) {
                            AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[28]];
                            Movement.walkTo((WorldPoint)cB);

                            Time.sleepTicks((int)lIIIlIlIIl[0]);

                        }
                        if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cB), lIIIlIlIIl[2])) {
                            AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[29]];
                            g.a(lIIIlIlIII[lIIIlIlIIl[30]], bR, lIIIlIlIIl[0]);
                            Time.sleepTicks((int)lIIIlIlIIl[0]);

                            lIlIIlIIIlII = Dialog.getOptions();
                            lIlIIlIIIIll = new ArrayList();
                            if (s.lllIlIllIIlI(lIlIIlIIIlII.isEmpty() ? 1 : 0)) {
                                lIlIIlIIIIlI = lIIIlIlIIl[1];
                                while (s.lllIlIllIIIl(lIlIIlIIIIlI, lIlIIlIIIlII.size())) {
                                    lIlIIlIIIIll.add(((Widget)lIlIIlIIIlII.get(lIlIIlIIIIlI)).getText());

                                    ++lIlIIlIIIIlI;

                                    return;
                                }
                                lIlIIlIIIIlI = lIlIIlIIIIll.stream().anyMatch(string -> string.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[90]])) ? 1 : 0;
                                int n2 = lIlIIlIIIIll.stream().noneMatch(string -> string.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[89]]));
                                if (s.lllIlIllIIII(lIlIIlIIIIlI) && s.lllIlIllIIII(n2)) {
                                    System.out.println(lIIIlIlIII[lIIIlIlIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (s.lllIlIllIIlI(cv ? 1 : 0) && s.lllIlIllIIII(cu ? 1 : 0)) {
                    if (s.lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cC), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[32]];
                        Movement.walkTo((WorldPoint)cC);

                        Time.sleepTicks((int)lIIIlIlIIl[0]);

                    }
                    if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cC), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[33]];
                        g.a(lIIIlIlIII[lIIIlIlIIl[34]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks((int)lIIIlIlIIl[0]);

                        lIlIIlIIIlII = Dialog.getOptions();
                        lIlIIlIIIIll = new ArrayList();
                        if (s.lllIlIllIIlI(lIlIIlIIIlII.isEmpty() ? 1 : 0)) {
                            lIlIIlIIIIlI = lIIIlIlIIl[1];
                            while (s.lllIlIllIIIl(lIlIIlIIIIlI, lIlIIlIIIlII.size())) {
                                lIlIIlIIIIll.add(((Widget)lIlIIlIIIlII.get(lIlIIlIIIIlI)).getText());

                                ++lIlIIlIIIIlI;

                                if (2 != 0) continue;
                                return;
                            }
                            lIlIIlIIIIlI = lIlIIlIIIIll.stream().anyMatch(string -> string.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[88]])) ? 1 : 0;
                            int n3 = lIlIIlIIIIll.stream().noneMatch(string -> string.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[87]]));
                            if (s.lllIlIllIIII(lIlIIlIIIIlI) && s.lllIlIllIIII(n3)) {
                                System.out.println(lIIIlIlIII[lIIIlIlIIl[35]]);
                            }
                        }
                    }
                }
                if (s.lllIlIllIIlI(cw ? 1 : 0) && s.lllIlIllIIII(cv ? 1 : 0) && s.lllIlIllIIII(cu ? 1 : 0)) {
                    if (s.lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cD), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[36]];
                        Movement.walkTo((WorldPoint)cD);

                        Time.sleepTicks((int)lIIIlIlIIl[0]);

                    }
                    if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cD), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[37]];
                        g.a(lIIIlIlIII[lIIIlIlIIl[38]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks((int)lIIIlIlIIl[0]);

                        lIlIIlIIIlII = Dialog.getOptions();
                        lIlIIlIIIIll = new ArrayList();
                        if (s.lllIlIllIIlI(lIlIIlIIIlII.isEmpty() ? 1 : 0)) {
                            lIlIIlIIIIlI = lIIIlIlIIl[1];
                            while (s.lllIlIllIIIl(lIlIIlIIIIlI, lIlIIlIIIlII.size())) {
                                lIlIIlIIIIll.add(((Widget)lIlIIlIIIlII.get(lIlIIlIIIIlI)).getText());

                                ++lIlIIlIIIIlI;

                                if ((0x19 ^ 0x1D) > -1) continue;
                                return;
                            }
                            lIlIIlIIIIlI = lIlIIlIIIIll.stream().anyMatch(string -> string.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[86]])) ? 1 : 0;
                            int n4 = lIlIIlIIIIll.stream().noneMatch(string -> string.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[85]]));
                            if (s.lllIlIllIIII(lIlIIlIIIIlI) && s.lllIlIllIIII(n4)) {
                                System.out.println(lIIIlIlIII[lIIIlIlIIl[39]]);
                            }
                        }
                    }
                }
                if (s.lllIlIllIIlI(cx ? 1 : 0) && s.lllIlIllIIII(cw ? 1 : 0) && s.lllIlIllIIII(cv ? 1 : 0) && s.lllIlIllIIII(cu ? 1 : 0)) {
                    if (s.lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cE), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[40]];
                        Movement.walkTo((WorldPoint)cE);

                        Time.sleepTicks((int)lIIIlIlIIl[0]);

                    }
                    if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cE), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[41]];
                        g.a(lIIIlIlIII[lIIIlIlIIl[42]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks((int)lIIIlIlIIl[0]);

                        lIlIIlIIIlII = Dialog.getOptions();
                        lIlIIlIIIIll = new ArrayList();
                        if (s.lllIlIllIIlI(lIlIIlIIIlII.isEmpty() ? 1 : 0)) {
                            lIlIIlIIIIlI = lIIIlIlIIl[1];
                            while (s.lllIlIllIIIl(lIlIIlIIIIlI, lIlIIlIIIlII.size())) {
                                lIlIIlIIIIll.add(((Widget)lIlIIlIIIlII.get(lIlIIlIIIIlI)).getText());

                                ++lIlIIlIIIIlI;

                                if (3 > 0) continue;
                                return;
                            }
                            lIlIIlIIIIlI = lIlIIlIIIIll.stream().anyMatch(string -> string.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[84]])) ? 1 : 0;
                            int n5 = lIlIIlIIIIll.stream().noneMatch(string -> string.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[83]]));
                            if (s.lllIlIllIIII(lIlIIlIIIIlI) && s.lllIlIllIIII(n5)) {
                                System.out.println(lIIIlIlIII[lIIIlIlIIl[43]]);
                            }
                        }
                    }
                }
                if (s.lllIlIllIIlI(cy ? 1 : 0) && s.lllIlIllIIII(cx ? 1 : 0) && s.lllIlIllIIII(cw ? 1 : 0) && s.lllIlIllIIII(cv ? 1 : 0) && s.lllIlIllIIII(cu ? 1 : 0)) {
                    if (s.lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cF), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[44]];
                        Movement.walkTo((WorldPoint)cF);

                        Time.sleepTicks((int)lIIIlIlIIl[0]);

                    }
                    if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cF), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[45]];
                        g.a(lIIIlIlIII[lIIIlIlIIl[46]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks((int)lIIIlIlIIl[0]);

                        lIlIIlIIIlII = Dialog.getOptions();
                        lIlIIlIIIIll = new ArrayList();
                        if (s.lllIlIllIIlI(lIlIIlIIIlII.isEmpty() ? 1 : 0)) {
                            lIlIIlIIIIlI = lIIIlIlIIl[1];
                            while (s.lllIlIllIIIl(lIlIIlIIIIlI, lIlIIlIIIlII.size())) {
                                lIlIIlIIIIll.add(((Widget)lIlIIlIIIlII.get(lIlIIlIIIIlI)).getText());

                                ++lIlIIlIIIIlI;

                                if (2 < ((0x54 ^ 0x62) & ~(0xF0 ^ 0xC6) ^ (0x5D ^ 0x59))) continue;
                                return;
                            }
                            lIlIIlIIIIlI = lIlIIlIIIIll.stream().anyMatch(string -> string.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[16]])) ? 1 : 0;
                            int n6 = lIlIIlIIIIll.stream().anyMatch(string -> string.contains(lIIIlIlIII[lIIIlIlIIl[82]]));
                            int n7 = lIlIIlIIIIll.stream().noneMatch(string -> string.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[81]]));
                            if ((!s.lllIlIllIIlI(lIlIIlIIIIlI) || s.lllIlIllIIII(n6)) && s.lllIlIllIIII(n7)) {
                                System.out.println(lIIIlIlIII[lIIIlIlIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (s.lllIlIllIlII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[5])) {
                if (s.lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cA), lIIIlIlIIl[5])) {
                    AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[48]];
                    if (s.lllIlIllIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    e.a(cA);
                }
                if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cA), lIIIlIlIIl[5])) {
                    AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[49]];
                    g.a(lIIIlIlIII[lIIIlIlIIl[50]], bR);
                }
            }
            if (!s.lllIlIlllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[10]) || s.lllIlIllIlII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[17])) {
                g.a(bR);
            }
            if (s.lllIlIllIlII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[6])) {
                if (s.lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cG), lIIIlIlIIl[6])) {
                    AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[51]];
                    Movement.walkTo((WorldPoint)cG);

                    Time.sleepTicks((int)lIIIlIlIIl[0]);

                }
                if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cG), lIIIlIlIIl[6])) {
                    String[] stringArray = new String[lIIIlIlIIl[0]];
                    stringArray[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[52]];
                    if (s.lllIlIllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[lIIIlIlIIl[0]];
                        stringArray7[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[53]];
                        Inventory.getFirst((String[])stringArray7).interact(lIIIlIlIII[lIIIlIlIIl[54]]);
                        Time.sleepTicks((int)lIIIlIlIIl[10]);

                    }
                }
            }
            if (s.lllIlIllIlII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[13])) {
                if (s.lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cA), lIIIlIlIIl[5])) {
                    AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[55]];
                    e.a(cA);
                }
                if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cA), lIIIlIlIIl[5])) {
                    AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[56]];
                    g.a(lIIIlIlIII[lIIIlIlIIl[57]], bR);
                }
            }
            if (!s.lllIlIlllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[18]) || s.lllIlIllIlII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[2])) {
                if (s.lllIlIllIIIl(ck, lIIIlIlIIl[0])) {
                    U.mc += lIIIlIlIIl[0];
                    U.o(AccBuilderRogues.m);
                    ck += lIIIlIlIIl[0];
                    U.mc = lIIIlIlIIl[1];
                    cl = lIIIlIlIIl[1];
                }
                String[] stringArray = new String[lIIIlIlIIl[0]];
                stringArray[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[58]];
                if (s.lllIlIllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (s.lllIlIllIlIl(Widgets.get((int)lIIIlIlIIl[59]))) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[60]];
                        String[] stringArray8 = new String[lIIIlIlIIl[0]];
                        stringArray8[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[61]];
                        Inventory.getFirst((String[])stringArray8).interact(lIIIlIlIII[lIIIlIlIIl[62]]);
                        Time.sleepTicks((int)lIIIlIlIIl[6]);

                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[63]];
                        lIlIIlIIIlII = Widgets.get((int)lIIIlIlIIl[59], (int)lIIIlIlIIl[27]);
                        if (s.lllIlIllIlIl(lIlIIlIIIlII)) {
                            lIlIIlIIIlII.interact(lIIIlIlIII[lIIIlIlIIl[64]]);
                            Time.sleepTicks((int)lIIIlIlIIl[0]);

                        }
                        if (s.lllIlIllIlIl(lIlIIlIIIIll = Widgets.get((int)lIIIlIlIIl[59], (int)lIIIlIlIIl[39]))) {
                            lIlIIlIIIIll.interact(lIIIlIlIII[lIIIlIlIIl[65]]);
                            Time.sleepTicks((int)lIIIlIlIIl[5]);

                        }
                    }
                    Time.sleepTicks((int)lIIIlIlIIl[0]);

                }
            }
        }
    }

    private static boolean lllIlIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIlIllIIII(int n2) {
        return n2 != 0;
    }

        return String.valueOf(lIlIIIIIllll);
    }

    private static boolean lllIlIllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIlllIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIlIlllIII(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        s.lllIlIlIllll();
        s.lllIlIlIlllI();
        bv = new ArrayList<d>();
        cz = lIIIlIlIIl[1];
        cA = new WorldPoint(lIIIlIlIIl[91], lIIIlIlIIl[92], lIIIlIlIIl[1]);
        cB = new WorldPoint(lIIIlIlIIl[93], lIIIlIlIIl[94], lIIIlIlIIl[1]);
        cC = new WorldPoint(lIIIlIlIIl[95], lIIIlIlIIl[96], lIIIlIlIIl[1]);
        cD = new WorldPoint(lIIIlIlIIl[97], lIIIlIlIIl[98], lIIIlIlIIl[1]);
        cE = new WorldPoint(lIIIlIlIIl[99], lIIIlIlIIl[100], lIIIlIlIIl[1]);
        cF = new WorldPoint(lIIIlIlIIl[101], lIIIlIlIIl[102], lIIIlIlIIl[1]);
        cG = new WorldPoint(lIIIlIlIIl[103], lIIIlIlIIl[104], lIIIlIlIIl[1]);
        String[] stringArray = new String[lIIIlIlIIl[33]];
        stringArray[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[105]];
        stringArray[s.lIIIlIlIIl[0]] = lIIIlIlIII[lIIIlIlIIl[106]];
        stringArray[s.lIIIlIlIIl[5]] = lIIIlIlIII[lIIIlIlIIl[107]];
        stringArray[s.lIIIlIlIIl[10]] = lIIIlIlIII[lIIIlIlIIl[108]];
        stringArray[s.lIIIlIlIIl[6]] = lIIIlIlIII[lIIIlIlIIl[109]];
        stringArray[s.lIIIlIlIIl[13]] = lIIIlIlIII[lIIIlIlIIl[110]];
        stringArray[s.lIIIlIlIIl[17]] = lIIIlIlIII[lIIIlIlIIl[111]];
        stringArray[s.lIIIlIlIIl[18]] = lIIIlIlIII[lIIIlIlIIl[112]];
        stringArray[s.lIIIlIlIIl[2]] = lIIIlIlIII[lIIIlIlIIl[113]];
        stringArray[s.lIIIlIlIIl[24]] = lIIIlIlIII[lIIIlIlIIl[114]];
        stringArray[s.lIIIlIlIIl[12]] = lIIIlIlIII[lIIIlIlIIl[115]];
        stringArray[s.lIIIlIlIIl[25]] = lIIIlIlIII[lIIIlIlIIl[116]];
        stringArray[s.lIIIlIlIIl[15]] = lIIIlIlIII[lIIIlIlIIl[117]];
        stringArray[s.lIIIlIlIIl[26]] = lIIIlIlIII[lIIIlIlIIl[118]];
        stringArray[s.lIIIlIlIIl[27]] = lIIIlIlIII[lIIIlIlIIl[119]];
        stringArray[s.lIIIlIlIIl[28]] = lIIIlIlIII[lIIIlIlIIl[120]];
        stringArray[s.lIIIlIlIIl[29]] = lIIIlIlIII[lIIIlIlIIl[121]];
        stringArray[s.lIIIlIlIIl[30]] = lIIIlIlIII[lIIIlIlIIl[122]];
        stringArray[s.lIIIlIlIIl[31]] = lIIIlIlIII[lIIIlIlIIl[123]];
        stringArray[s.lIIIlIlIIl[32]] = lIIIlIlIII[lIIIlIlIIl[124]];
        bR = stringArray;
    }

    private static boolean lllIlIllIIlI(int n2) {
        return n2 == 0;
    }
}

